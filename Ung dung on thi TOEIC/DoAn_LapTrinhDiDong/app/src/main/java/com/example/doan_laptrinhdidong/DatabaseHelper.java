package com.example.doan_laptrinhdidong;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.doan_laptrinhdidong.Model.BaiThiThu;
import com.example.doan_laptrinhdidong.Model.ChangeSentences;
import com.example.doan_laptrinhdidong.Model.DanhMucTu;
import com.example.doan_laptrinhdidong.Model.DocHieu;
import com.example.doan_laptrinhdidong.Model.FamilyWord;
import com.example.doan_laptrinhdidong.Model.Grammar;
import com.example.doan_laptrinhdidong.Model.Listening;
import com.example.doan_laptrinhdidong.Model.Nghe;
import com.example.doan_laptrinhdidong.Model.Part1;
import com.example.doan_laptrinhdidong.Model.Part7;
import com.example.doan_laptrinhdidong.Model.TuVung;
import com.example.doan_laptrinhdidong.Model.Vocabulary;

import java.util.ArrayList;

public class DatabaseHelper {
    Context context;
    String dbName = "Toeic.db";
    Utils utils;

    public DatabaseHelper(Context context) {
        this.context = context;
        this.utils = new Utils(context);
    }

    public SQLiteDatabase openDB()
    {
        return context.openOrCreateDatabase(dbName, Context.MODE_PRIVATE, null);
    }

    public void closeDB(SQLiteDatabase db)
    {
        db.close();
    }


    public void createTable()
    {
        SQLiteDatabase db = openDB();
        String sqlVocabulary = "CREATE TABLE IF NOT EXISTS  tblVocabulary (" +
                "ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " +
                "CAUDE TEXT," +
                "DAPANA TEXT," +
                "DAPANB TEXT," +
                "DAPANC TEXT," +
                "DAPAND TEXT," +
                "DAPANDUNG TEXT);";
        String sqlGrammar = "CREATE TABLE IF NOT EXISTS  tblGrammar (" +
                "ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " +
                "LOAINGUPHAP TEXT, " +
                "CAUDE TEXT," +
                "DAPANA TEXT," +
                "DAPANB TEXT," +
                "DAPANC TEXT," +
                "DAPAND TEXT," +
                "DAPANDUNG TEXT);";
        String sqlFamilyWord = "CREATE TABLE IF NOT EXISTS  tblFamilyWord (" +
                "ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " +
                "CAUDE TEXT," +
                "DAPANA TEXT," +
                "DAPANB TEXT," +
                "DAPANC TEXT," +
                "DAPAND TEXT," +
                "DAPANDUNG TEXT);";
        String sqlChangeSentences = "CREATE TABLE IF NOT EXISTS  tblChangeSentences (" +
                "ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " +
                "LOAICAU TEXT," +
                "CAUDE TEXT," +
                "DAPANA TEXT," +
                "DAPANB TEXT," +
                "DAPANC TEXT," +
                "DAPAND TEXT," +
                "DAPANDUNG TEXT);";
        String sqlListening = "CREATE TABLE IF NOT EXISTS  tblListening (" +
                "ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " +
                "IDAUDIO TEXT," +
                "CAUDE TEXT," +
                "DAPANA TEXT," +
                "DAPANB TEXT," +
                "DAPANC TEXT," +
                "DAPAND TEXT," +
                "DAPANDUNG TEXT);";

        String sqlBaiThiThu = "CREATE TABLE IF NOT EXISTS  tblBaiThiThu (" +
                "IDBAITHITHU INTEGER NOT NULL PRIMARY KEY, " +
                "TENDETHI TEXT);";
        String sqlPart1 = "CREATE TABLE IF NOT EXISTS  tblPart1 (" +
                "ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " +
                "IDAUDIO TEXT," +
                "HINH INTEGER," +
                "DAPANA TEXT," +
                "DAPANB TEXT," +
                "DAPANC TEXT," +
                "DAPAND TEXT," +
                "DAPANCHON TEXT," +
                "DAPANDUNG TEXT," +
                "IDBAITHITHU INTEGER);";
        String sqlPart2 = "CREATE TABLE IF NOT EXISTS  tblPart2 (" +
                "ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " +
                "IDAUDIO TEXT," +
                "CAUDE TEXT," +
                "DAPANA TEXT," +
                "DAPANB TEXT," +
                "DAPANC TEXT," +
                "DAPAND TEXT," +
                "DAPANCHON TEXT," +
                "DAPANDUNG TEXT," +
                "IDBAITHITHU INTEGER);";
        String sqlPart3 = "CREATE TABLE IF NOT EXISTS  tblPart3 (" +
                "ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " +
                "IDAUDIO TEXT," +
                "CAUDE TEXT," +
                "DAPANA TEXT," +
                "DAPANB TEXT," +
                "DAPANC TEXT," +
                "DAPAND TEXT," +
                "DAPANCHON TEXT," +
                "DAPANDUNG TEXT," +
                "IDBAITHITHU INTEGER);";
        String sqlPart4 = "CREATE TABLE IF NOT EXISTS  tblPart4 (" +
                "ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " +
                "IDAUDIO TEXT," +
                "CAUDE TEXT," +
                "DAPANA TEXT," +
                "DAPANB TEXT," +
                "DAPANC TEXT," +
                "DAPAND TEXT," +
                "DAPANCHON TEXT," +
                "DAPANDUNG TEXT," +
                "IDBAITHITHU INTEGER);";
        String sqlPart5 = "CREATE TABLE IF NOT EXISTS  tblPart5 (" +
                "ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " +
                "CAUDE TEXT," +
                "DAPANA TEXT," +
                "DAPANB TEXT," +
                "DAPANC TEXT," +
                "DAPAND TEXT," +
                "DAPANCHON TEXT," +
                "DAPANDUNG TEXT," +
                "IDBAITHITHU INTEGER);";
        String sqlPart6 = "CREATE TABLE IF NOT EXISTS  tblPart6 (" +
                "ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " +
                "CAUDE TEXT," +
                "DAPANA TEXT," +
                "DAPANB TEXT," +
                "DAPANC TEXT," +
                "DAPAND TEXT," +
                "DAPANCHON TEXT," +
                "DAPANDUNG TEXT," +
                "IDBAITHITHU INTEGER);";
        String sqlPart7 = "CREATE TABLE IF NOT EXISTS  tblPart7 (" +
                "ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " +
                "DOANVAN TEXT," +
                "CAUDE TEXT," +
                "DAPANA TEXT," +
                "DAPANB TEXT," +
                "DAPANC TEXT," +
                "DAPAND TEXT," +
                "DAPANCHON TEXT," +
                "DAPANDUNG TEXT," +
                "IDBAITHITHU INTEGER);";

        String sqlDanhMucTu = "CREATE TABLE IF NOT EXISTS  tblDanhMucTu (" +
                "IDDANHMUCTU INTEGER NOT NULL PRIMARY KEY, " +
                "TENDANHMUC TEXT);";
        String sqlReview = "CREATE TABLE IF NOT EXISTS  tblReview (" +
                "ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " +
                "TU TEXT," +
                "LOAITU TEXT," +
                "NGHIA TEXT," +
                "IDDANHMUCTU INTEGER);";

        db.execSQL(sqlVocabulary);
        db.execSQL(sqlGrammar);
        db.execSQL(sqlChangeSentences);
        db.execSQL(sqlFamilyWord);
        db.execSQL(sqlListening);
        db.execSQL(sqlBaiThiThu);
        db.execSQL(sqlPart1);
        db.execSQL(sqlPart2);
        db.execSQL(sqlPart3);
        db.execSQL(sqlPart4);
        db.execSQL(sqlPart5);
        db.execSQL(sqlPart6);
        db.execSQL(sqlPart7);
        db.execSQL(sqlDanhMucTu);
        db.execSQL(sqlReview);
        closeDB(db);
    }

    public void insertVocabulary()      //Thêm dữ liệu vào bảng vocabulary
    {
        ArrayList<Vocabulary> arrayList = utils.getDataVocabulary();
        SQLiteDatabase db = openDB();
        for(Vocabulary v : arrayList)
        {
            ContentValues cv = new ContentValues();
            cv.put("CAUDE",v.getCauDe());
            cv.put("DAPANA",v.getDapAnA());
            cv.put("DAPANB",v.getDapAnB());
            cv.put("DAPANC",v.getDapAnC());
            cv.put("DAPAND",v.getDapAnD());
            cv.put("DAPANDUNG",v.getDapAnDung());
            db.insert("tblVocabulary",null, cv);
        }
        closeDB(db);
    }

    public ArrayList<Vocabulary> getAllVocabulary() //Lấy dữ liệu từ bảng vocabulary
    {
        SQLiteDatabase db = openDB();
        ArrayList<Vocabulary> arrayList = new ArrayList<>();
        String sql = "Select * from tblVocabulary";
        Cursor csr = db.rawQuery(sql,null);
        if(csr != null)
        {
            if(csr.moveToFirst())
            {
                do {
                    int id = csr.getInt(0);
                    String cauDe = csr.getString(1);
                    String dapAnA = csr.getString(2);
                    String dapAnB = csr.getString(3);
                    String dapAnC = csr.getString(4);
                    String dapAnD = csr.getString(5);
                    String dapAnDung = csr.getString(6);
                    arrayList.add(new Vocabulary(cauDe,dapAnA,dapAnB,dapAnC,dapAnD,dapAnDung));
                }while (csr.moveToNext());
            }
        }
        closeDB(db);
        return arrayList;
    }

    public void insertListening()      //Thêm dữ liệu vào bảng listening
    {
        ArrayList<Listening> arrayList = utils.getDataListening();
        SQLiteDatabase db = openDB();
        for(Listening v : arrayList)
        {
            ContentValues cv = new ContentValues();
            cv.put("IDAUDIO",v.getIDAudio());
            cv.put("CAUDE",v.getCauDe());
            cv.put("DAPANA",v.getDapAnA());
            cv.put("DAPANB",v.getDapAnB());
            cv.put("DAPANC",v.getDapAnC());
            cv.put("DAPAND",v.getDapAnD());
            cv.put("DAPANDUNG",v.getDapAnDung());
            db.insert("tblListening",null, cv);
        }
        closeDB(db);
    }

    public ArrayList<Listening> getAllListening() //Lấy dữ liệu từ bảng listening
    {
        SQLiteDatabase db = openDB();
        ArrayList<Listening> arrayList = new ArrayList<>();
        String sql = "Select * from tblListening";
        Cursor csr = db.rawQuery(sql,null);
        if(csr != null)
        {
            if(csr.moveToFirst())
            {
                do {
                    int id = csr.getInt(0);
                    String idAudio = csr.getString(1);
                    String cauDe = csr.getString(2);
                    String dapAnA = csr.getString(3);
                    String dapAnB = csr.getString(4);
                    String dapAnC = csr.getString(5);
                    String dapAnD = csr.getString(6);
                    String dapAnDung = csr.getString(7);
                    arrayList.add(new Listening(idAudio,cauDe,dapAnA,dapAnB,dapAnC,dapAnD,dapAnDung));
                }while (csr.moveToNext());
            }
        }
        closeDB(db);
        return arrayList;
    }

    public void insertGrammar()      //Thêm dữ liệu vào bảng grammar
    {
        ArrayList<Grammar> arrayList = utils.getDataGrammar();
        SQLiteDatabase db = openDB();
        for(Grammar v : arrayList)
        {
            ContentValues cv = new ContentValues();
            cv.put("LOAINGUPHAP",v.getLoaiNguPhap());
            cv.put("CAUDE",v.getCauDe());
            cv.put("DAPANA",v.getDapAnA());
            cv.put("DAPANB",v.getDapAnB());
            cv.put("DAPANC",v.getDapAnC());
            cv.put("DAPAND",v.getDapAnD());
            cv.put("DAPANDUNG",v.getDapAnDung());
            db.insert("tblGrammar",null, cv);
        }
        closeDB(db);
    }

    public ArrayList<Grammar> getAllGrammar() //Lấy dữ liệu từ bảng grammar
    {
        SQLiteDatabase db = openDB();
        ArrayList<Grammar> arrayList = new ArrayList<>();
        String sql = "Select * from tblGrammar";
        Cursor csr = db.rawQuery(sql,null);
        if(csr != null)
        {
            if(csr.moveToFirst())
            {
                do {
                    int id = csr.getInt(0);
                    String loaiNguPhap = csr.getString(1);
                    String cauDe = csr.getString(2);
                    String dapAnA = csr.getString(3);
                    String dapAnB = csr.getString(4);
                    String dapAnC = csr.getString(5);
                    String dapAnD = csr.getString(6);
                    String dapAnDung = csr.getString(7);
                    arrayList.add(new Grammar(loaiNguPhap,cauDe,dapAnA,dapAnB,dapAnC,dapAnD,dapAnDung));
                }while (csr.moveToNext());
            }
        }
        closeDB(db);
        return arrayList;
    }

    public void insertFamilyWord()      //Thêm dữ liệu vào bảng familyword
    {
        ArrayList<FamilyWord> arrayList = utils.getDataFamilyWord();
        SQLiteDatabase db = openDB();
        for(FamilyWord v : arrayList)
        {
            ContentValues cv = new ContentValues();
            cv.put("CAUDE",v.getCauDe());
            cv.put("DAPANA",v.getDapAnA());
            cv.put("DAPANB",v.getDapAnB());
            cv.put("DAPANC",v.getDapAnC());
            cv.put("DAPAND",v.getDapAnD());
            cv.put("DAPANDUNG",v.getDapAnDung());
            db.insert("tblFamilyWord",null, cv);
        }
        closeDB(db);
    }

    public ArrayList<FamilyWord> getAllFamilyWord() //Lấy dữ liệu từ bảng familyword
    {
        SQLiteDatabase db = openDB();
        ArrayList<FamilyWord> arrayList = new ArrayList<>();
        String sql = "Select * from tblFamilyWord";
        Cursor csr = db.rawQuery(sql,null);
        if(csr != null)
        {
            if(csr.moveToFirst())
            {
                do {
                    int id = csr.getInt(0);
                    String cauDe = csr.getString(1);
                    String dapAnA = csr.getString(2);
                    String dapAnB = csr.getString(3);
                    String dapAnC = csr.getString(4);
                    String dapAnD = csr.getString(5);
                    String dapAnDung = csr.getString(6);
                    arrayList.add(new FamilyWord(cauDe,dapAnA,dapAnB,dapAnC,dapAnD,dapAnDung));
                }while (csr.moveToNext());
            }
        }
        closeDB(db);
        return arrayList;
    }

    public void insertChangeSentences()      //Thêm dữ liệu vào bảng ChangeSentences
    {
        ArrayList<ChangeSentences> arrayList = utils.getDataChangeSentences();
        SQLiteDatabase db = openDB();
        for(ChangeSentences v : arrayList)
        {
            ContentValues cv = new ContentValues();
            cv.put("LOAICAU",v.getLoaiCau());
            cv.put("CAUDE",v.getCauDe());
            cv.put("DAPANA",v.getDapAnA());
            cv.put("DAPANB",v.getDapAnB());
            cv.put("DAPANC",v.getDapAnC());
            cv.put("DAPAND",v.getDapAnD());
            cv.put("DAPANDUNG",v.getDapAnDung());
            db.insert("tblChangeSentences",null, cv);
        }
        closeDB(db);
    }

    public ArrayList<ChangeSentences> getAllChangeSentences() //Lấy dữ liệu từ bảng ChangeSentences
    {
        SQLiteDatabase db = openDB();
        ArrayList<ChangeSentences> arrayList = new ArrayList<>();
        String sql = "Select * from tblChangeSentences";
        Cursor csr = db.rawQuery(sql,null);
        if(csr != null)
        {
            if(csr.moveToFirst())
            {
                do {
                    int id = csr.getInt(0);
                    String loaiCau = csr.getString(1);
                    String cauDe = csr.getString(2);
                    String dapAnA = csr.getString(3);
                    String dapAnB = csr.getString(4);
                    String dapAnC = csr.getString(5);
                    String dapAnD = csr.getString(6);
                    String dapAnDung = csr.getString(7);
                    arrayList.add(new ChangeSentences(loaiCau,cauDe,dapAnA,dapAnB,dapAnC,dapAnD,dapAnDung));
                }while (csr.moveToNext());
            }
        }
        closeDB(db);
        return arrayList;
    }

    public void insertBaiThiThu()      //Thêm dữ liệu vào bảng BaiThiThu
    {
        ArrayList<BaiThiThu> arrayList = utils.getDataBaiThiThu();
        SQLiteDatabase db = openDB();
        for(BaiThiThu v : arrayList)
        {
            ContentValues cv = new ContentValues();
            cv.put("IDBAITHITHU",v.getId());
            cv.put("TENDETHI",v.getTenDeThi());
            db.insert("tblBaiThiThu",null, cv);
        }
        closeDB(db);
    }

    public ArrayList<BaiThiThu> getAllBaiThiThu() //Lấy dữ liệu từ bảng BaiThiThu
    {
        SQLiteDatabase db = openDB();
        ArrayList<BaiThiThu> arrayList = new ArrayList<>();
        String sql = "Select * from tblBaiThiThu";
        Cursor csr = db.rawQuery(sql,null);
        if(csr != null)
        {
            if(csr.moveToFirst())
            {
                do {
                    int id = csr.getInt(0);
                    String ten = csr.getString(1);
                    arrayList.add(new BaiThiThu(ten, id));
                }while (csr.moveToNext());
            }
        }
        closeDB(db);
        return arrayList;
    }

    public BaiThiThu traVeBaiThiThu(int id)
    {
        ArrayList<BaiThiThu> ds = utils.getDataBaiThiThu();
        for(BaiThiThu btt: ds)
        {
            if(btt.getId() == id)
            {
                return btt;
            }
        }
        return null;
    }

    public void insertPart1()      //Thêm dữ liệu vào bảng Part1
    {
        ArrayList<Part1> arrayList = utils.getDataPart1();
        SQLiteDatabase db = openDB();
        for(Part1 v : arrayList)
        {
            ContentValues cv = new ContentValues();
            cv.put("IDAUDIO",v.getIDAudio());
            cv.put("HINH",v.getHinh());
            cv.put("DAPANA",v.getDapAnA());
            cv.put("DAPANB",v.getDapAnB());
            cv.put("DAPANC",v.getDapAnC());
            cv.put("DAPAND",v.getDapAnD());
            cv.put("DAPANCHON",v.getDapAnChon());
            cv.put("DAPANDUNG",v.getDapAnDung());
            cv.put("IDBAITHITHU",v.getBaiThiThu().getId());
            db.insert("tblPart1",null, cv);
        }
        closeDB(db);
    }

    public ArrayList<Part1> getAllPart1() //Lấy dữ liệu từ bảng Part1
    {
        SQLiteDatabase db = openDB();
        ArrayList<Part1> arrayList = new ArrayList<>();
        String sql = "Select * from tblPart1";
        Cursor csr = db.rawQuery(sql,null);
        if(csr != null)
        {
            if(csr.moveToFirst())
            {
                do {
                    int id = csr.getInt(0);
                    String idAudio = csr.getString(1);
                    String hinh = csr.getString(2);
                    String dapAnA = csr.getString(3);
                    String dapAnB = csr.getString(4);
                    String dapAnC = csr.getString(5);
                    String dapAnD = csr.getString(6);
                    String dapAnChon = csr.getString(7);
                    String dapAnDung = csr.getString(8);
                    int idBaiThiThu = csr.getInt(9);
                    arrayList.add(new Part1(idAudio,hinh,dapAnA,dapAnB,dapAnC,dapAnD,dapAnChon,dapAnDung,traVeBaiThiThu(idBaiThiThu)));
                }while (csr.moveToNext());
            }
        }
        closeDB(db);
        return arrayList;
    }

    public void insertPart2()      //Thêm dữ liệu vào bảng Part2
    {
        ArrayList<Nghe> arrayList = utils.getDataPart2();
        SQLiteDatabase db = openDB();
        for(Nghe v : arrayList)
        {
            ContentValues cv = new ContentValues();
            cv.put("IDAUDIO",v.getIDAudio());
            cv.put("CAUDE",v.getCauDe());
            cv.put("DAPANA",v.getDapAnA());
            cv.put("DAPANB",v.getDapAnB());
            cv.put("DAPANC",v.getDapAnC());
            cv.put("DAPAND",v.getDapAnD());
            cv.put("DAPANCHON",v.getDapAnChon());
            cv.put("DAPANDUNG",v.getDapAnDung());
            cv.put("IDBAITHITHU",v.getBaiThiThu().getId());
            db.insert("tblPart2",null, cv);
        }
        closeDB(db);
    }

    public ArrayList<Nghe> getAllPart2() //Lấy dữ liệu từ bảng Part2
    {
        SQLiteDatabase db = openDB();
        ArrayList<Nghe> arrayList = new ArrayList<>();
        String sql = "Select * from tblPart2";
        Cursor csr = db.rawQuery(sql,null);
        if(csr != null)
        {
            if(csr.moveToFirst())
            {
                do {
                    int id = csr.getInt(0);
                    String idAudio = csr.getString(1);
                    String cauDe = csr.getString(2);
                    String dapAnA = csr.getString(3);
                    String dapAnB = csr.getString(4);
                    String dapAnC = csr.getString(5);
                    String dapAnD = csr.getString(6);
                    String dapAnChon = csr.getString(7);
                    String dapAnDung = csr.getString(8);
                    int idBaiThiThu = csr.getInt(9);
                    arrayList.add(new Nghe(idAudio,cauDe,dapAnA,dapAnB,dapAnC,dapAnD,dapAnChon,dapAnDung,traVeBaiThiThu(idBaiThiThu)));
                }while (csr.moveToNext());
            }
        }
        closeDB(db);
        return arrayList;
    }

    public void insertPart3()      //Thêm dữ liệu vào bảng Part2
    {
        ArrayList<Nghe> arrayList = utils.getDataPart3();
        SQLiteDatabase db = openDB();
        for(Nghe v : arrayList)
        {
            ContentValues cv = new ContentValues();
            cv.put("IDAUDIO",v.getIDAudio());
            cv.put("CAUDE",v.getCauDe());
            cv.put("DAPANA",v.getDapAnA());
            cv.put("DAPANB",v.getDapAnB());
            cv.put("DAPANC",v.getDapAnC());
            cv.put("DAPAND",v.getDapAnD());
            cv.put("DAPANCHON",v.getDapAnChon());
            cv.put("DAPANDUNG",v.getDapAnDung());
            cv.put("IDBAITHITHU",v.getBaiThiThu().getId());
            db.insert("tblPart3",null, cv);
        }
        closeDB(db);
    }

    public ArrayList<Nghe> getAllPart3() //Lấy dữ liệu từ bảng Part3
    {
        SQLiteDatabase db = openDB();
        ArrayList<Nghe> arrayList = new ArrayList<>();
        String sql = "Select * from tblPart3";
        Cursor csr = db.rawQuery(sql,null);
        if(csr != null)
        {
            if(csr.moveToFirst())
            {
                do {
                    int id = csr.getInt(0);
                    String idAudio = csr.getString(1);
                    String cauDe = csr.getString(2);
                    String dapAnA = csr.getString(3);
                    String dapAnB = csr.getString(4);
                    String dapAnC = csr.getString(5);
                    String dapAnD = csr.getString(6);
                    String dapAnChon = csr.getString(7);
                    String dapAnDung = csr.getString(8);
                    int idBaiThiThu = csr.getInt(9);
                    arrayList.add(new Nghe(idAudio,cauDe,dapAnA,dapAnB,dapAnC,dapAnD,dapAnChon,dapAnDung,traVeBaiThiThu(idBaiThiThu)));
                }while (csr.moveToNext());
            }
        }
        closeDB(db);
        return arrayList;
    }

    public void insertPart4()      //Thêm dữ liệu vào bảng Part4
    {
        ArrayList<Nghe> arrayList = utils.getDataPart4();
        SQLiteDatabase db = openDB();
        for(Nghe v : arrayList)
        {
            ContentValues cv = new ContentValues();
            cv.put("IDAUDIO",v.getIDAudio());
            cv.put("CAUDE",v.getCauDe());
            cv.put("DAPANA",v.getDapAnA());
            cv.put("DAPANB",v.getDapAnB());
            cv.put("DAPANC",v.getDapAnC());
            cv.put("DAPAND",v.getDapAnD());
            cv.put("DAPANCHON",v.getDapAnChon());
            cv.put("DAPANDUNG",v.getDapAnDung());
            cv.put("IDBAITHITHU",v.getBaiThiThu().getId());
            db.insert("tblPart4",null, cv);
        }
        closeDB(db);
    }

    public ArrayList<Nghe> getAllPart4() //Lấy dữ liệu từ bảng Part4
    {
        SQLiteDatabase db = openDB();
        ArrayList<Nghe> arrayList = new ArrayList<>();
        String sql = "Select * from tblPart4";
        Cursor csr = db.rawQuery(sql,null);
        if(csr != null)
        {
            if(csr.moveToFirst())
            {
                do {
                    int id = csr.getInt(0);
                    String idAudio = csr.getString(1);
                    String cauDe = csr.getString(2);
                    String dapAnA = csr.getString(3);
                    String dapAnB = csr.getString(4);
                    String dapAnC = csr.getString(5);
                    String dapAnD = csr.getString(6);
                    String dapAnChon = csr.getString(7);
                    String dapAnDung = csr.getString(8);
                    int idBaiThiThu = csr.getInt(9);
                    arrayList.add(new Nghe(idAudio,cauDe,dapAnA,dapAnB,dapAnC,dapAnD,dapAnChon,dapAnDung, traVeBaiThiThu(idBaiThiThu)));
                }while (csr.moveToNext());
            }
        }
        closeDB(db);
        return arrayList;
    }

    public void insertPart5()      //Thêm dữ liệu vào bảng Part5
    {
        ArrayList<DocHieu> arrayList = utils.getDataPart5();
        SQLiteDatabase db = openDB();
        for(DocHieu v : arrayList)
        {
            ContentValues cv = new ContentValues();
            cv.put("CAUDE",v.getCauDe());
            cv.put("DAPANA",v.getDapAnA());
            cv.put("DAPANB",v.getDapAnB());
            cv.put("DAPANC",v.getDapAnC());
            cv.put("DAPAND",v.getDapAnD());
            cv.put("DAPANCHON",v.getDapAnChon());
            cv.put("DAPANDUNG",v.getDapAnDung());
            cv.put("IDBAITHITHU",v.getBaiThiThu().getId());
            db.insert("tblPart5",null, cv);
        }
        closeDB(db);
    }

    public ArrayList<DocHieu> getAllPart5() //Lấy dữ liệu từ bảng Part5
    {
        SQLiteDatabase db = openDB();
        ArrayList<DocHieu> arrayList = new ArrayList<>();
        String sql = "Select * from tblPart5";
        Cursor csr = db.rawQuery(sql,null);
        if(csr != null)
        {
            if(csr.moveToFirst())
            {
                do {
                    int id = csr.getInt(0);
                    String cauDe = csr.getString(1);
                    String dapAnA = csr.getString(2);
                    String dapAnB = csr.getString(3);
                    String dapAnC = csr.getString(4);
                    String dapAnD = csr.getString(5);
                    String dapAnChon = csr.getString(6);
                    String dapAnDung = csr.getString(7);
                    int idBaiThiThu = csr.getInt(8);
                    arrayList.add(new DocHieu(cauDe,dapAnA,dapAnB,dapAnC,dapAnD,dapAnChon,dapAnDung,traVeBaiThiThu(idBaiThiThu)));
                }while (csr.moveToNext());
            }
        }
        closeDB(db);
        return arrayList;
    }

    public void insertPart6()      //Thêm dữ liệu vào bảng Part6
    {
        ArrayList<DocHieu> arrayList = utils.getDataPart6();
        SQLiteDatabase db = openDB();
        for(DocHieu v : arrayList)
        {
            ContentValues cv = new ContentValues();
            cv.put("CAUDE",v.getCauDe());
            cv.put("DAPANA",v.getDapAnA());
            cv.put("DAPANB",v.getDapAnB());
            cv.put("DAPANC",v.getDapAnC());
            cv.put("DAPAND",v.getDapAnD());
            cv.put("DAPANCHON",v.getDapAnChon());
            cv.put("DAPANDUNG",v.getDapAnDung());
            cv.put("IDBAITHITHU",v.getBaiThiThu().getId());
            db.insert("tblPart6",null, cv);
        }
        closeDB(db);
    }

    public ArrayList<DocHieu> getAllPart6() //Lấy dữ liệu từ bảng Part6
    {
        SQLiteDatabase db = openDB();
        ArrayList<DocHieu> arrayList = new ArrayList<>();
        String sql = "Select * from tblPart6";
        Cursor csr = db.rawQuery(sql,null);
        if(csr != null)
        {
            if(csr.moveToFirst())
            {
                do {
                    int id = csr.getInt(0);
                    String cauDe = csr.getString(1);
                    String dapAnA = csr.getString(2);
                    String dapAnB = csr.getString(3);
                    String dapAnC = csr.getString(4);
                    String dapAnD = csr.getString(5);
                    String dapAnChon = csr.getString(6);
                    String dapAnDung = csr.getString(7);
                    int idBaiThiThu = csr.getInt(8);
                    arrayList.add(new DocHieu(cauDe,dapAnA,dapAnB,dapAnC,dapAnD,dapAnChon,dapAnDung,traVeBaiThiThu(idBaiThiThu)));
                }while (csr.moveToNext());
            }
        }
        closeDB(db);
        return arrayList;
    }

    public void insertPart7()      //Thêm dữ liệu vào bảng Part7
    {
        ArrayList<Part7> arrayList = utils.getDataPart7();
        SQLiteDatabase db = openDB();
        for(Part7 v : arrayList)
        {
            ContentValues cv = new ContentValues();
            cv.put("DOANVAN",v.getDoanVan());
            cv.put("CAUDE",v.getCauDe());
            cv.put("DAPANA",v.getDapAnA());
            cv.put("DAPANB",v.getDapAnB());
            cv.put("DAPANC",v.getDapAnC());
            cv.put("DAPAND",v.getDapAnD());
            cv.put("DAPANCHON",v.getDapAnChon());
            cv.put("DAPANDUNG",v.getDapAnDung());
            cv.put("IDBAITHITHU",v.getBaiThiThu().getId());
            db.insert("tblPart7",null, cv);
        }
        closeDB(db);
    }

    public ArrayList<Part7> getAllPart7() //Lấy dữ liệu từ bảng Part7
    {
        SQLiteDatabase db = openDB();
        ArrayList<Part7> arrayList = new ArrayList<>();
        String sql = "Select * from tblPart7";
        Cursor csr = db.rawQuery(sql,null);
        if(csr != null)
        {
            if(csr.moveToFirst())
            {
                do {
                    int id = csr.getInt(0);
                    String doanVan = csr.getString(1);
                    String cauDe = csr.getString(2);
                    String dapAnA = csr.getString(3);
                    String dapAnB = csr.getString(4);
                    String dapAnC = csr.getString(5);
                    String dapAnD = csr.getString(6);
                    String dapAnChon = csr.getString(7);
                    String dapAnDung = csr.getString(8);
                    int idBaiThiThu = csr.getInt(9);
                    arrayList.add(new Part7(doanVan,cauDe,dapAnA,dapAnB,dapAnC,dapAnD,dapAnChon,dapAnDung,traVeBaiThiThu(idBaiThiThu)));
                }while (csr.moveToNext());
            }
        }
        closeDB(db);
        return arrayList;
    }

    public void insertDanhMucTu()      //Thêm dữ liệu vào bảng DanhMucTu
    {
        ArrayList<DanhMucTu> arrayList = utils.getDataDanhMucTu();
        SQLiteDatabase db = openDB();
        for(DanhMucTu v : arrayList)
        {
            ContentValues cv = new ContentValues();
            cv.put("TENDANHMUC",v.getTenDanhMuc());
            db.insert("tblDanhMucTu",null, cv);
        }
        closeDB(db);
    }

    public ArrayList<DanhMucTu> getAllDanhMucTu() //Lấy dữ liệu từ bảng DanhMucTu
    {
        SQLiteDatabase db = openDB();
        ArrayList<DanhMucTu> arrayList = new ArrayList<>();
        String sql = "Select * from tblDanhMucTu";
        Cursor csr = db.rawQuery(sql,null);
        if(csr != null)
        {
            if(csr.moveToFirst())
            {
                do {
                    int id = csr.getInt(0);
                    String tenDanhMuc = csr.getString(1);
                    arrayList.add(new DanhMucTu(id,tenDanhMuc));
                }while (csr.moveToNext());
            }
        }
        closeDB(db);
        return arrayList;
    }

    public DanhMucTu traVeDanhMucTu(int id)
    {
        ArrayList<DanhMucTu> ds = utils.getDataDanhMucTu();
        for(DanhMucTu dmt: ds)
        {
            if(dmt.getIdDanhMuc() == id)
            {
                return dmt;
            }
        }
        return null;
    }

    public void insertReview()      //Thêm dữ liệu vào bảng Review
    {
        ArrayList<TuVung> arrayList = utils.getDataReview();
        SQLiteDatabase db = openDB();
        for(TuVung v : arrayList)
        {
            ContentValues cv = new ContentValues();
            cv.put("TU",v.getTu());
            cv.put("LOAITU",v.getLoaiTu());
            cv.put("NGHIA",v.getNghia());
            cv.put("IDDANHMUCTU",v.getDanhMucTu().getIdDanhMuc());
            db.insert("tblReview",null, cv);
        }
        closeDB(db);
    }

    public ArrayList<TuVung> getAllReview() //Lấy dữ liệu từ bảng Review
    {
        SQLiteDatabase db = openDB();
        ArrayList<TuVung> arrayList = new ArrayList<>();
        String sql = "Select * from tblReview";
        Cursor csr = db.rawQuery(sql,null);
        if(csr != null)
        {
            if(csr.moveToFirst())
            {
                do {
                    int id = csr.getInt(0);
                    String tu = csr.getString(1);
                    String loaiTu = csr.getString(2);
                    String nghia = csr.getString(3);
                    int idDanhMucTu = csr.getInt(4);
                    arrayList.add(new TuVung(tu,loaiTu,nghia,traVeDanhMucTu(idDanhMucTu)));
                }while (csr.moveToNext());
            }
        }
        closeDB(db);
        return arrayList;
    }

    public void dropTable()     //Drop table
    {
        SQLiteDatabase db = openDB();
        String sql1 = "DROP TABLE IF EXISTS tblVocabulary";
        String sql2 = "DROP TABLE IF EXISTS tblFamilyWord";
        String sql3 = "DROP TABLE IF EXISTS tblGrammar";
        String sql4 = "DROP TABLE IF EXISTS tblListening";
        String sql5 = "DROP TABLE IF EXISTS tblChangeSentences";
        String sqlBaiThiThu = "DROP TABLE IF EXISTS tblBaiThiThu";
        String sqlPart1 = "DROP TABLE IF EXISTS tblPart1";
        String sqlPart2 = "DROP TABLE IF EXISTS tblPart2";
        String sqlPart3 = "DROP TABLE IF EXISTS tblPart3";
        String sqlPart4 = "DROP TABLE IF EXISTS tblPart4";
        String sqlPart5 = "DROP TABLE IF EXISTS tblPart5";
        String sqlPart6 = "DROP TABLE IF EXISTS tblPart6";
        String sqlPart7 = "DROP TABLE IF EXISTS tblPart7";
        String sqlDanhMucTu = "DROP TABLE IF EXISTS tblDanhMucTu";
        String sqlReview = "DROP TABLE IF EXISTS tblReview";
        db.execSQL(sql1);
        db.execSQL(sql2);
        db.execSQL(sql3);
        db.execSQL(sql4);
        db.execSQL(sql5);
        db.execSQL(sqlBaiThiThu);
        db.execSQL(sqlPart1);
        db.execSQL(sqlPart2);
        db.execSQL(sqlPart3);
        db.execSQL(sqlPart4);
        db.execSQL(sqlPart5);
        db.execSQL(sqlPart6);
        db.execSQL(sqlPart7);
        db.execSQL(sqlDanhMucTu);
        db.execSQL(sqlReview);
        closeDB(db);
    }
}
