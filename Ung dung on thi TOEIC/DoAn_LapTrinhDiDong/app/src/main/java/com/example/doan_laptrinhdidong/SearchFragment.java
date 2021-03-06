package com.example.doan_laptrinhdidong;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.doan_laptrinhdidong.Activity.DetailSearchActivity;
import com.example.doan_laptrinhdidong.Adapter.DanhMucTuAdapter;
import com.example.doan_laptrinhdidong.Model.DanhMucTu;
import com.example.doan_laptrinhdidong.Model.TuVung;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SearchFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SearchFragment extends Fragment {
    ListView listView;
    ArrayList<DanhMucTu> arrayList;
    ArrayList<TuVung> tuVungArrayList;
    DanhMucTuAdapter danhMucTuAdapter;
    DatabaseHelper databaseHelper;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SearchFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SearchFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SearchFragment newInstance(String param1, String param2) {
        SearchFragment fragment = new SearchFragment();
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
        databaseHelper = new DatabaseHelper(getContext());
        return inflater.inflate(R.layout.fragment_search, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listView = view.findViewById(R.id.listViewDanhMuc);
        arrayList = databaseHelper.getAllDanhMucTu();
        tuVungArrayList = databaseHelper.getAllReview();
        danhMucTuAdapter = new DanhMucTuAdapter(getContext(),arrayList);
        listView.setAdapter(danhMucTuAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), DetailSearchActivity.class);
                int idDMT = arrayList.get(position).getIdDanhMuc();
                String name = arrayList.get(position).getTenDanhMuc();
                ArrayList<TuVung> ds = addTuVung(tuVungArrayList , idDMT);
                intent.putExtra("TenDanhMuc",name);
                intent.putExtra("DanhSachTu",ds);

                startActivity(intent);
            }
        });
    }


    public ArrayList<TuVung> addTuVung(ArrayList<TuVung> ds, int id)
    {
        ArrayList<TuVung> dsTu = new ArrayList<>();
        for(int i=0; i<ds.size(); i++)
        {
            if(ds.get(i).getDanhMucTu().getIdDanhMuc() == id)
            {
                dsTu.add(ds.get(i));
            }
        }
        return dsTu;
    }
}