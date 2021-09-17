package com.example.doan_laptrinhdidong;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Environment;
import android.provider.MediaStore;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.TedPermission;
import com.squareup.picasso.Picasso;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import gun0912.tedbottompicker.TedBottomPicker;
import gun0912.tedbottompicker.TedBottomSheetDialogFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MeFragment extends Fragment {

    EditText editText1;
    EditText editText2;
    ImageView imageView;
    TextView textView;
    Button button;
    ImageButton imageButton;
    SharedPreferences sharedPreferences;
    String bitmap;
    public static  String DATA_ACOUNT = "Data";
    OutputStream outputStream;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MeFragment newInstance(String param1, String param2) {
        MeFragment fragment = new MeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_me, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Mapping(view);

        sharedPreferences  = getActivity().getSharedPreferences(DATA_ACOUNT,Context.MODE_PRIVATE);
        String ten = sharedPreferences.getString("ten","Your Name");
        String tuoi = sharedPreferences.getString("tuoi", "Your Age");
        if(ten.equals("Your Name"))
        {
            editText1.setHint(ten);
        }
        else
        {
            editText1.setText(ten);
        }
        if(tuoi.equals("Your Age"))
        {
            editText2.setHint(tuoi);
        }
        else
        {
            editText2.setText(tuoi);
        }
        textView.setText(sharedPreferences.getInt("diem",0) + "");
        imageView.setImageBitmap(StringToBitMap(sharedPreferences.getString("hinhAnh","/9j/4AAQSkZJRgABAQAAAQABAAD//gA7Q1JFQVRPUjogZ2QtanBlZyB2MS4wICh1c2luZyBJSkcgSlBFRyB2ODApLCBxdWFsaXR5ID0gOTAK/9sAQwADAgIDAgIDAwMDBAMDBAUIBQUEBAUKBwcGCAwKDAwLCgsLDQ4SEA0OEQ4LCxAWEBETFBUVFQwPFxgWFBgSFBUU/9sAQwEDBAQFBAUJBQUJFA0LDRQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQU/8AAEQgAQABAAwEiAAIRAQMRAf/EAB0AAAICAgMBAAAAAAAAAAAAAAABBgcCBAMFCAn/xAAzEAABAwQBAgQDBQkAAAAAAAABAgMEAAUGERIhMQdBYYETUXEIFDJDoRUiIzM1QmKSsf/EABwBAAEEAwEAAAAAAAAAAAAAAAADBAUGAgcIAf/EAC0RAAECBAUCBQQDAAAAAAAAAAEAAgMEESEFMUFRYQYSBxMjMoEVInHBkbHw/9oADAMBAAIRAxEAPwD6pUDtRqgDVCEaparKluhC1pk+LbmkuS5DUZClBCVPOBAKj2AJ8z8q2AN151+0ZiEzxDZNzhXNtLFpaWliDL6MPLO+TgV5KPRIJ2NDy2ah/wBgbM/EHJl5vAyD4zmJ2iQ3EgLm7LrUrqXWW1ebaUFs62QCoa6E0185wi+WW2ORVkGFy78LM9DmWmI0/cwihFTQU35tTm1/XWqVZUap0q2gdqdJNOhCKi2c3/8AZ0Iw2l8ZD6TyUO7bfmffsKkFwntWyE9KfVxbbTs+vpVK5JelTJEiRKXwKv4jp30Qkdk+1aY8TOqTg+H/AE6Vd68YUtm1mRP5OQ+SLhTmEyZmYveRYf3/AL9KM5hBuuX2wY5ZZZiXC4K+HF5AqQ0ADtawOvEDZJH69jefhxgNt8M8MtmN2pJ+6wmuJdUP33nCdrcV/kpRKj5DehoAVHfCHFltR3cjnNcJk9ITHbUOrMfukfVXRR9NetWRU54e4dP4dgcNuIRC4uuGm/Y3QDXmmQrkLr3GHwDMlkEe2xO51/jKutzslRTorZaglimnSTXXZDLkxbav7mjnKcPw2+uuJO9q9gCaZzk02Sloky8EhgJoBUmmgGpOizYwvcGjVQrPsiD76ozSuTEZWjr8x35fRP8A2odjOOqzXJUwXAV22GUv3BR7OK3tDXv3PoD6Vq3eY7zQ3HaU9JW4I8Vk/icdJ7n36mrjwfFGsQsDMIKDslRLsl8fmun8Svp5D0ArlrpXDJjrjqGLjOJD0mGtNKj2sHApfcC9yr1GitwmTAh+91h+3fGnJ4XfpSEgADQHkKdFFdYqhIopdqdCFiDqqk8ZPHG1+HeV4zi8mDMlT7+zJWw/H4fCjBvgCt9SlD4bZ5kcz0GuveraFaNwx21XeQ2/OtkOa+0OLbsiOhxSBvegSCR160hHgtjwzCdkVmx3Y4O2VJ4VleLW27m6yryvJ70ApLMSxRnJbMbfQ8VpTpSiOnLYHyHnVkxs4vV0/p+IXBtB7OXFaI4/12TUxaZQw2ENoShA7JSNAVlqkZSTgSMPy4DaAmp5O53KWmJmJMv74p44A2Cj8ZOSyushUGCD/a2FOKHueldkxbnh/PmuvH5DSR+lb9FPU2XGhlDfYb9Sd1yUUUIX/9k=")));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button.getText().equals("Edit Profile"))
                {
                    editText1.setEnabled(true);
                    editText2.setEnabled(true);
                    imageButton.setEnabled(true);
                    button.setText("Finish");
                }
                else
                {
                    editText1.setEnabled(false);
                    editText2.setEnabled(false);
                    imageButton.setEnabled(false);
                    button.setText("Edit Profile");

                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("ten", editText1.getText().toString().trim());
                    editor.putString("tuoi", editText2.getText().toString().trim());
                    editor.commit();
                }
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requestPermission();
            }
        });

    }

    public void Mapping(View view){
        editText1 = view.findViewById(R.id.edtUserName);
        editText2 = view.findViewById(R.id.edtAge);
        editText1.setEnabled(false);
        editText2.setEnabled(false);
        textView = view.findViewById(R.id.textViewDiemCaoNhat);
        imageView = view.findViewById(R.id.imageViewAvatar);
        button = view.findViewById(R.id.btnChinhSuaHoSo);
        imageButton = view.findViewById(R.id.imageButtonSetAvatar);
    }

    private void requestPermission()
    {
        PermissionListener permissionListener = new PermissionListener() {
            @Override
            public void onPermissionGranted() {
                openImagePicker();
            }

            @Override
            public void onPermissionDenied(List<String> deniedPermissions) {
                Toast.makeText(getContext(), "Permission Denied\n" + deniedPermissions.toString(), Toast.LENGTH_SHORT).show();
            }
        };
        TedPermission.with(getContext())
                .setPermissionListener(permissionListener)
                .setDeniedMessage("If you reject permission,you can not use this service\n\nPlease turn on permissions at [Setting] > [Permission]")
                .setPermissions(Manifest.permission.CAMERA, Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                .check();
    }

    private void openImagePicker()
    {
        TedBottomPicker.with(getActivity()).show(new TedBottomSheetDialogFragment.OnImageSelectedListener() {
            @Override
            public void onImageSelected(Uri uri) {
                try {
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(getActivity().getContentResolver(),uri);
                    imageView.setImageBitmap(bitmap);
                    Toast.makeText(getContext(),bitmap.toString(),Toast.LENGTH_SHORT).show();

                    String chuoi = BitMapToString(bitmap);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("hinhAnh", chuoi);
                    editor.commit();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static Bitmap convertStringToBitmapFromAccess(Context context, String filename)
    {
        AssetManager assetManager = context.getAssets();
        try
        {
            InputStream is = assetManager.open(filename);
            Bitmap bitmap = BitmapFactory.decodeStream(is);
            return bitmap;
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        return null;
    }

    private void saveImage(Bitmap finalBitmap, String imageName) {
        /*String root = Environment.getExternalStorageDirectory().toString();
        File myDir = new File(root + "/Jamia Binoria Images");
        myDir.mkdirs();

        // String fname = "save_fatwa.jpg";
        File file = new File(myDir, imageName);
        if (file.exists()) {
            Log.i("file exists", "" + imageName);
            file.delete();
        } else {
            Log.i("file does not exists", "" + imageName);
        }
        try {
            FileOutputStream out = new FileOutputStream(file);
            finalBitmap.compress(Bitmap.CompressFormat.JPEG,90,out);
            // sendBroadcast(new Intent(
            // Intent.ACTION_MEDIA_MOUNTED,
            // Uri.parse("file://" +
            // Environment.getExternalStorageDirectory())));
            out.flush();
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }*/

        BitmapDrawable bitmapDrawable = (BitmapDrawable) imageView.getDrawable();
        Bitmap bitmap1 = bitmapDrawable.getBitmap();
        AssetManager assetManager = getActivity().getAssets();

        File filepath =  Environment.getExternalStorageDirectory();
        File dir = new File(filepath.getAbsolutePath() + "/Demo");
        dir.mkdir();

        File file = new File(dir, System.currentTimeMillis() + ".jpg");
        try {
            outputStream = new FileOutputStream(file);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        bitmap1.compress(Bitmap.CompressFormat.JPEG,100, outputStream);
        Toast.makeText(getContext(), "Image has saved", Toast.LENGTH_SHORT).show();
        try {
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String BitMapToString(Bitmap bitmap){
        ByteArrayOutputStream baos = new  ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG,100, baos);
        byte [] b = baos.toByteArray();
        String temp = Base64.encodeToString(b, Base64.DEFAULT);
        return temp;
    }

    public Bitmap StringToBitMap(String encodedString){
        try {
            byte [] encodeByte = Base64.decode(encodedString,Base64.DEFAULT);
            Bitmap bitmap = BitmapFactory.decodeByteArray(encodeByte, 0, encodeByte.length);
            return bitmap;
        } catch(Exception e) {
            e.getMessage();
            return null;
        }
    }
}