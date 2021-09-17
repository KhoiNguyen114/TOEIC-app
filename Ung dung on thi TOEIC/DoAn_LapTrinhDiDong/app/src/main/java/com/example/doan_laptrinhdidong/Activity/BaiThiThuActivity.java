package com.example.doan_laptrinhdidong.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.doan_laptrinhdidong.Application.AppTest;
import com.example.doan_laptrinhdidong.Adapter.BaiThiThuAdapater;
import com.example.doan_laptrinhdidong.DatabaseHelper;
import com.example.doan_laptrinhdidong.Model.BaiThiThu;
import com.example.doan_laptrinhdidong.Model.DocHieu;
import com.example.doan_laptrinhdidong.Model.Nghe;
import com.example.doan_laptrinhdidong.Model.Part1;
import com.example.doan_laptrinhdidong.Model.Part7;
import com.example.doan_laptrinhdidong.R;

import java.util.ArrayList;

public class BaiThiThuActivity extends AppCompatActivity {

    GridView gridView;
    BaiThiThuAdapater baiThiThuAdapater;
    ArrayList<BaiThiThu> arrayList;
    ArrayList<Part1> part1ArrayList;
    ArrayList<Nghe> part2ArrayList;
    ArrayList<Nghe> part3ArrayList;
    ArrayList<Nghe> part4ArrayList;
    ArrayList<DocHieu> part5ArrayList;
    ArrayList<DocHieu> part6ArrayList;
    ArrayList<Part7> part7ArrayList;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_thi_thu);


        gridView = findViewById(R.id.gridViewBaiThiThu);
        databaseHelper = new DatabaseHelper(this);

        part1ArrayList = databaseHelper.getAllPart1();
        part2ArrayList = databaseHelper.getAllPart2();
        part3ArrayList = databaseHelper.getAllPart3();
        part4ArrayList = databaseHelper.getAllPart4();
        part5ArrayList = databaseHelper.getAllPart5();
        part6ArrayList = databaseHelper.getAllPart6();
        part7ArrayList = databaseHelper.getAllPart7();
        arrayList = databaseHelper.getAllBaiThiThu();

        Log.d("List1", part1ArrayList.size() + "");
        Log.d("List2", part2ArrayList.size() + "");
        Log.d("List3", part3ArrayList.size() + "");
        Log.d("List4", part4ArrayList.size() + "");
        Log.d("List5", part5ArrayList.size() + "");
        Log.d("List6", part6ArrayList.size() + "");
        Log.d("List7", part7ArrayList.size() + "");


        
        Log.d("List",arrayList.size()+"");
        baiThiThuAdapater = new BaiThiThuAdapater(getApplicationContext(), arrayList);
        gridView.setAdapter(baiThiThuAdapater);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(BaiThiThuActivity.this, DanhMucBaiThiThuActivity.class);
                int idBTT = arrayList.get(position).getId();
                String name = arrayList.get(position).getTenDeThi();

                ArrayList<Part1> part1 = addPart1(part1ArrayList,idBTT);
                ArrayList<Nghe> part2 = addPartNghe(part2ArrayList,idBTT);
                ArrayList<Nghe> part3 = addPartNghe(part3ArrayList,idBTT);
                ArrayList<Nghe> part4 = addPartNghe(part4ArrayList,idBTT);

                ArrayList<DocHieu> part5 = addPartDocHieu(part5ArrayList,idBTT);
                ArrayList<DocHieu> part6 = addPartDocHieu(part6ArrayList,idBTT);
                ArrayList<Part7> part7 = addPart7(part7ArrayList,idBTT);

                if(((AppTest)getApplication()).part1ArrayList != null)
                {
                    ((AppTest) getApplication()).part1ArrayList.clear();
                }
                if(((AppTest)getApplication()).part2ArrayList != null)
                {
                    ((AppTest) getApplication()).part2ArrayList.clear();
                }
                if(((AppTest)getApplication()).part3ArrayList != null)
                {
                    ((AppTest) getApplication()).part3ArrayList.clear();
                }
                if(((AppTest)getApplication()).part4ArrayList != null)
                {
                    ((AppTest) getApplication()).part4ArrayList.clear();
                }
                if(((AppTest)getApplication()).part5ArrayList != null)
                {
                    ((AppTest) getApplication()).part5ArrayList.clear();
                }
                if(((AppTest)getApplication()).part6ArrayList != null)
                {
                    ((AppTest) getApplication()).part6ArrayList.clear();
                }
                if(((AppTest)getApplication()).part7ArrayList != null)
                {
                    ((AppTest) getApplication()).part7ArrayList.clear();
                }

                AlertDialog.Builder b = new AlertDialog.Builder(BaiThiThuActivity.this);
                b.setTitle("Warning");
                b.setIcon(R.drawable.icon_question);
                b.setMessage("Are you ready for this test?");
                b.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        BaiThiThu baiThiThu = new BaiThiThu(name, part1, part2, part3, part4, part5, part6, part7);
                        intent.putExtra("TenBaiThi",name);
                        intent.putExtra("BaiThi",baiThiThu);
                        startActivity(intent);
                    }
                });
                b.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                AlertDialog alert = b.create();
                alert.show();
            }
        });

        getSupportActionBar().setTitle("Testing");
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#F3CABE")));
        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.custom_actionbar_vocabulary));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public ArrayList<Part1> addPart1(ArrayList<Part1> part1ArrayList, int id)
    {
        ArrayList<Part1> ds = new ArrayList<>();
        for(int i=0; i<part1ArrayList.size(); i++)
        {
            if(part1ArrayList.get(i).getBaiThiThu().getId() == id)
            {
                Part1 part1 = part1ArrayList.get(i);
                ds.add(part1);
            }
        }
        return ds;
    }

    public ArrayList<Part7> addPart7(ArrayList<Part7> part7ArrayList, int id)
    {
        ArrayList<Part7> ds = new ArrayList<>();
        for(int i=0; i<part7ArrayList.size(); i++)
        {
            if(part7ArrayList.get(i).getBaiThiThu().getId() == id)
            {
                Part7 part7 = part7ArrayList.get(i);
                ds.add(part7);
            }
        }
        return ds;
    }

    public ArrayList<Nghe> addPartNghe(ArrayList<Nghe> ngheArrayList, int id)
    {
        ArrayList<Nghe> ds = new ArrayList<>();
        for(int i=0; i<ngheArrayList.size(); i++)
        {
            if(ngheArrayList.get(i).getBaiThiThu().getId() == id)
            {
                Nghe nghe = ngheArrayList.get(i);
                ds.add(nghe);
            }
        }
        return ds;
    }

    public ArrayList<DocHieu> addPartDocHieu(ArrayList<DocHieu> docHieuArrayList, int id)
    {
        ArrayList<DocHieu> ds = new ArrayList<>();
        for(int i=0; i<docHieuArrayList.size(); i++)
        {
            if(docHieuArrayList.get(i).getBaiThiThu().getId() == id)
            {
                DocHieu docHieu = docHieuArrayList.get(i);
                ds.add(docHieu);
            }
        }
        return ds;
    }

    public void hoiThoai(Context context)
    {
        AlertDialog.Builder b = new AlertDialog.Builder(context);
        b.setTitle("Warning");
        b.setIcon(R.mipmap.ic_launcher);
        b.setMessage("Are you ready for this test?");
        b.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        b.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog alert = b.create();
        alert.show();
    }

    @Override
    public boolean onSupportNavigateUp() {
        Intent intent = new Intent(BaiThiThuActivity.this, MainActivity.class);
        finish();
        return super.onSupportNavigateUp();
    }


    public ArrayList<BaiThiThu> showList(ArrayList<BaiThiThu> dsBaiThiThu,ArrayList<Part1> part1, ArrayList<Nghe> part2, ArrayList<Nghe> part3, ArrayList<Nghe> part4, ArrayList<DocHieu> part5, ArrayList<DocHieu> part6, ArrayList<Part7> part7)
    {
        ArrayList<BaiThiThu> ds = new ArrayList<>();
        /*ArrayList<Part1> part1Array = themListPart1KhongTrung(part1);
        ArrayList<Nghe> part2Array = themListNgheKhongTrung(part2);
        ArrayList<Nghe> part3Array = themListNgheKhongTrung(part3);
        ArrayList<Nghe> part4Array = themListNgheKhongTrung(part4);
        ArrayList<DocHieu> part5Array = themListDocHieuKhongTrung(part5);
        ArrayList<DocHieu> part6Array = themListDocHieuKhongTrung(part6);
        ArrayList<Part7> part7Array = themListPart7KhongTrung(part7);

        int bienChay = 0;
        while(bienChay < part1Array.size())
        {
            ArrayList<Part1> tempPart1 = new ArrayList<>();
            tempPart1.add(part1Array.get(bienChay));
            ArrayList<Nghe> tempNghe2 = new ArrayList<>();
            tempNghe2.add(part2Array.get(bienChay));
            ArrayList<Nghe> tempNghe3 = new ArrayList<>();
            tempNghe3.add(part3Array.get(bienChay));
            ArrayList<Nghe> tempNghe4 = new ArrayList<>();
            tempNghe4.add(part4Array.get(bienChay));
            ArrayList<DocHieu> tempDocHieu5 = new ArrayList<>();
            tempDocHieu5.add(part5Array.get(bienChay));
            ArrayList<DocHieu> tempDocHieu6 = new ArrayList<>();
            tempDocHieu6.add(part6Array.get(bienChay));
            ArrayList<Part7> tempDocHieu7 = new ArrayList<>();
            tempDocHieu7.add(part7Array.get(bienChay));
            ds.add(new BaiThiThu(part1Array.get(bienChay).getTenDeThi(),tempPart1,tempNghe2,tempNghe3,tempNghe4,tempDocHieu5,tempDocHieu6,tempDocHieu7));
            bienChay++;
        }*/

        

        return ds;
    }

    /*public ArrayList<Part1> themListPart1KhongTrung(ArrayList<Part1> listNghe)
    {
        ArrayList<Part1> ds = new ArrayList<>();
        for(int i=0; i<listNghe.size(); i++)
        {
            if(ds == null)
            {
                ds.add(listNghe.get(i));
            }
            if(kiemTraListPart1(ds, listNghe.get(i).getTenDeThi()))
            {
                ds.add(listNghe.get(i));
            }
        }
        return ds;
    }

    public ArrayList<Part7> themListPart7KhongTrung(ArrayList<Part7> listNghe)
    {
        ArrayList<Part7> ds = new ArrayList<>();
        for(int i=0; i<listNghe.size(); i++)
        {
            if(ds == null)
            {
                ds.add(listNghe.get(i));
            }
            if(kiemTraListPart7(ds, listNghe.get(i).getTenDeThi()))
            {
                ds.add(listNghe.get(i));
            }
        }
        return ds;
    }

    public ArrayList<Nghe> themListNgheKhongTrung(ArrayList<Nghe> listNghe)
    {
        ArrayList<Nghe> ds = new ArrayList<>();
        for(int i=0; i<listNghe.size(); i++)
        {
            if(ds == null)
            {
                ds.add(listNghe.get(i));
            }
            if(kiemTraListNghe(ds, listNghe.get(i).getTenDeThi()))
            {
                ds.add(listNghe.get(i));
            }
        }
        return ds;
    }

    public ArrayList<DocHieu> themListDocHieuKhongTrung( ArrayList<DocHieu> listDocHieu)
    {
        ArrayList<DocHieu> ds = new ArrayList<>();
        for(int i=0; i<listDocHieu.size(); i++)
        {
            if(ds == null)
            {
                ds.add(listDocHieu.get(i));
            }
            if(kiemTraListDocHieu(ds, listDocHieu.get(i).getTenDeThi()))
            {
                ds.add(listDocHieu.get(i));
            }
        }
        return ds;
    }

    public boolean kiemTraListPart1(ArrayList<Part1> list, String pTenDeThi)
    {
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).getTenDeThi().equals(pTenDeThi))
            {
                return false;
            }
        }
        return true;
    }

    public boolean kiemTraListPart7(ArrayList<Part7> list, String pTenDeThi)
    {
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).getTenDeThi().equals(pTenDeThi))
            {
                return false;
            }
        }
        return true;
    }

    public boolean kiemTraListNghe(ArrayList<Nghe> list, String pTenDeThi)
    {
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).getTenDeThi().equals(pTenDeThi))
            {
                return false;
            }
        }        
        return true;
    }

    public boolean kiemTraListDocHieu(ArrayList<DocHieu> list, String pTenDeThi)
    {
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).getTenDeThi().equals(pTenDeThi))
            {
                return false;
            }
        }
        return true;
    }*/
}