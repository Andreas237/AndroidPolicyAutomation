// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

// Referenced classes of package com.amap.api.mapcore.util:
//			hp, hm

public class bs
	implements hp
{

	private bs()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static bs a()
	{
		if(a != null)
			break MISSING_BLOCK_LABEL_37;
	//    0    0:getstatic       #16  <Field bs a>
	//    1    3:ifnonnull       37
		com/amap/api/mapcore/util/bs;
	//    2    6:ldc1            #2   <Class bs>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(a == null)
	//*   4    9:getstatic       #16  <Field bs a>
	//*   5   12:ifnonnull       25
			a = new bs();
	//    6   15:new             #2   <Class bs>
	//    7   18:dup             
	//    8   19:invokespecial   #17  <Method void bs()>
	//    9   22:putstatic       #16  <Field bs a>
		com/amap/api/mapcore/util/bs;
	//   10   25:ldc1            #2   <Class bs>
		JVM INSTR monitorexit ;
	//   11   27:monitorexit     
		break MISSING_BLOCK_LABEL_37;
	//   12   28:goto            37
		Exception exception;
		exception;
	//   13   31:astore_0        
	//*  14   32:ldc1            #2   <Class bs>
		throw exception;
	//   15   34:monitorexit     
	//   16   35:aload_0         
	//   17   36:athrow          
		return a;
	//   18   37:getstatic       #16  <Field bs a>
	//   19   40:areturn         
	}

	public void a(SQLiteDatabase sqlitedatabase)
	{
		if(sqlitedatabase == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		try
		{
			sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS update_item (_id integer primary key autoincrement, title  TEXT, url TEXT,mAdcode TEXT,fileName TEXT,version TEXT,lLocalLength INTEGER,lRemoteLength INTEGER,localPath TEXT,mIndex INTEGER,isProvince INTEGER NOT NULL,mCompleteCode INTEGER,mCityCode TEXT,mState INTEGER,mPinyin TEXT, UNIQUE(mAdcode));");
	//    3    5:aload_1         
	//    4    6:ldc1            #22  <String "CREATE TABLE IF NOT EXISTS update_item (_id integer primary key autoincrement, title  TEXT, url TEXT,mAdcode TEXT,fileName TEXT,version TEXT,lLocalLength INTEGER,lRemoteLength INTEGER,localPath TEXT,mIndex INTEGER,isProvince INTEGER NOT NULL,mCompleteCode INTEGER,mCityCode TEXT,mState INTEGER,mPinyin TEXT, UNIQUE(mAdcode));">
	//    5    8:invokevirtual   #28  <Method void SQLiteDatabase.execSQL(String)>
			sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS update_item_file (_id integer primary key autoincrement,mAdcode TTEXT, file TEXT);");
	//    6   11:aload_1         
	//    7   12:ldc1            #30  <String "CREATE TABLE IF NOT EXISTS update_item_file (_id integer primary key autoincrement,mAdcode TTEXT, file TEXT);">
	//    8   14:invokevirtual   #28  <Method void SQLiteDatabase.execSQL(String)>
			sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS update_item_download_info (_id integer primary key autoincrement,mAdcode TEXT,fileLength integer,splitter integer,startPos integer,endPos integer, UNIQUE(mAdcode));");
	//    9   17:aload_1         
	//   10   18:ldc1            #32  <String "CREATE TABLE IF NOT EXISTS update_item_download_info (_id integer primary key autoincrement,mAdcode TEXT,fileLength integer,splitter integer,startPos integer,endPos integer, UNIQUE(mAdcode));">
	//   11   20:invokevirtual   #28  <Method void SQLiteDatabase.execSQL(String)>
			return;
	//   12   23:return          
		}
		// Misplaced declaration of an exception variable
		catch(SQLiteDatabase sqlitedatabase)
	//*  13   24:astore_1        
		{
			hm.c(((Throwable) (sqlitedatabase)), "DB", "onCreate");
	//   14   25:aload_1         
	//   15   26:ldc1            #34  <String "DB">
	//   16   28:ldc1            #36  <String "onCreate">
	//   17   30:invokestatic    #42  <Method void hm.c(Throwable, String, String)>
		}
		((Throwable) (sqlitedatabase)).printStackTrace();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #45  <Method void Throwable.printStackTrace()>
	//   20   37:return          
	}

	public void a(SQLiteDatabase sqlitedatabase, int i, int j)
	{
		if(sqlitedatabase == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		switch(i)
	//*   3    5:iload_2         
		{
	//*   4    6:lookupswitch    1: default 24
	//	               1: 25
		default:
			return;
	//    5   24:return          

		case 1: // '\001'
			sqlitedatabase.execSQL("ALTER TABLE update_item ADD COLUMN mPinyin TEXT;");
	//    6   25:aload_1         
	//    7   26:ldc1            #48  <String "ALTER TABLE update_item ADD COLUMN mPinyin TEXT;">
	//    8   28:invokevirtual   #28  <Method void SQLiteDatabase.execSQL(String)>
			break;
		}
		Cursor cursor = sqlitedatabase.query("update_item", ((String []) (null)), ((String) (null)), ((String []) (null)), ((String) (null)), ((String) (null)), ((String) (null)));
	//    9   31:aload_1         
	//   10   32:ldc1            #50  <String "update_item">
	//   11   34:aconst_null     
	//   12   35:aconst_null     
	//   13   36:aconst_null     
	//   14   37:aconst_null     
	//   15   38:aconst_null     
	//   16   39:aconst_null     
	//   17   40:invokevirtual   #54  <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
	//   18   43:astore          5
		SQLiteDatabase sqlitedatabase1 = sqlitedatabase;
	//   19   45:aload_1         
	//   20   46:astore          4
		if(cursor == null)
	//*  21   48:aload           5
	//*  22   50:ifnonnull       60
		{
			sqlitedatabase.close();
	//   23   53:aload_1         
	//   24   54:invokevirtual   #57  <Method void SQLiteDatabase.close()>
			sqlitedatabase1 = null;
	//   25   57:aconst_null     
	//   26   58:astore          4
		}
		if(cursor != null)
	//*  27   60:aload           5
	//*  28   62:ifnull          147
		{
			String s;
			for(; cursor.moveToNext(); sqlitedatabase1.execSQL("update update_item set mPinyin=? where url =?", ((Object []) (new String[] {
	s.substring(0, s.lastIndexOf(".")), sqlitedatabase
}))))
	//*  29   65:aload           5
	//*  30   67:invokeinterface #63  <Method boolean Cursor.moveToNext()>
	//*  31   72:ifeq            140
			{
				sqlitedatabase = ((SQLiteDatabase) (cursor.getString(cursor.getColumnIndex("url"))));
	//   32   75:aload           5
	//   33   77:aload           5
	//   34   79:ldc1            #65  <String "url">
	//   35   81:invokeinterface #69  <Method int Cursor.getColumnIndex(String)>
	//   36   86:invokeinterface #73  <Method String Cursor.getString(int)>
	//   37   91:astore_1        
				s = ((String) (sqlitedatabase)).substring(((String) (sqlitedatabase)).lastIndexOf("/") + 1);
	//   38   92:aload_1         
	//   39   93:aload_1         
	//   40   94:ldc1            #75  <String "/">
	//   41   96:invokevirtual   #80  <Method int String.lastIndexOf(String)>
	//   42   99:iconst_1        
	//   43  100:iadd            
	//   44  101:invokevirtual   #83  <Method String String.substring(int)>
	//   45  104:astore          6
			}

	//   46  106:aload           4
	//   47  108:ldc1            #85  <String "update update_item set mPinyin=? where url =?">
	//   48  110:iconst_2        
	//   49  111:anewarray       String[]
	//   50  114:dup             
	//   51  115:iconst_0        
	//   52  116:aload           6
	//   53  118:iconst_0        
	//   54  119:aload           6
	//   55  121:ldc1            #87  <String ".">
	//   56  123:invokevirtual   #80  <Method int String.lastIndexOf(String)>
	//   57  126:invokevirtual   #90  <Method String String.substring(int, int)>
	//   58  129:aastore         
	//   59  130:dup             
	//   60  131:iconst_1        
	//   61  132:aload_1         
	//   62  133:aastore         
	//   63  134:invokevirtual   #93  <Method void SQLiteDatabase.execSQL(String, Object[])>
	//*  64  137:goto            65
			cursor.close();
	//   65  140:aload           5
	//   66  142:invokeinterface #94  <Method void Cursor.close()>
		}
	//   67  147:return          
	}

	public String b()
	{
		return "offlineDbV4.db";
	//    0    0:ldc1            #98  <String "offlineDbV4.db">
	//    1    2:areturn         
	}

	public int c()
	{
		return 2;
	//    0    0:iconst_2        
	//    1    1:ireturn         
	}

	private static volatile bs a;
}
