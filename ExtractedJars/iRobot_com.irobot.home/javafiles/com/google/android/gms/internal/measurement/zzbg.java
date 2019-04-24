// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.*;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzat, zzbf, zzdc, zzce

final class zzbg extends SQLiteOpenHelper
{

	zzbg(zzbf zzbf1, Context context, String s)
	{
		zzxk = zzbf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #11  <Field zzbf zzxk>
		super(context, s, ((android.database.sqlite.SQLiteDatabase.CursorFactory) (null)), 1);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aconst_null     
	//    7    9:iconst_1        
	//    8   10:invokespecial   #14  <Method void SQLiteOpenHelper(Context, String, android.database.sqlite.SQLiteDatabase$CursorFactory, int)>
	//    9   13:return          
	}

	private final boolean zza(SQLiteDatabase sqlitedatabase, String s)
	{
		SQLiteDatabase sqlitedatabase1;
		Object obj;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		sqlitedatabase1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          4
		sqlitedatabase = ((SQLiteDatabase) (sqlitedatabase.query("SQLITE_MASTER", new String[] {
			"name"
		}, "name=?", new String[] {
			s
		}, ((String) (null)), ((String) (null)), ((String) (null)))));
	//    4    6:aload_1         
	//    5    7:ldc1            #21  <String "SQLITE_MASTER">
	//    6    9:iconst_1        
	//    7   10:anewarray       String[]
	//    8   13:dup             
	//    9   14:iconst_0        
	//   10   15:ldc1            #25  <String "name">
	//   11   17:aastore         
	//   12   18:ldc1            #27  <String "name=?">
	//   13   20:iconst_1        
	//   14   21:anewarray       String[]
	//   15   24:dup             
	//   16   25:iconst_0        
	//   17   26:aload_2         
	//   18   27:aastore         
	//   19   28:aconst_null     
	//   20   29:aconst_null     
	//   21   30:aconst_null     
	//   22   31:invokevirtual   #33  <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
	//   23   34:astore_1        
		boolean flag = ((Cursor) (sqlitedatabase)).moveToFirst();
	//   24   35:aload_1         
	//   25   36:invokeinterface #39  <Method boolean Cursor.moveToFirst()>
	//   26   41:istore_3        
		if(sqlitedatabase != null)
	//*  27   42:aload_1         
	//*  28   43:ifnull          52
			((Cursor) (sqlitedatabase)).close();
	//   29   46:aload_1         
	//   30   47:invokeinterface #43  <Method void Cursor.close()>
		return flag;
	//   31   52:iload_3         
	//   32   53:ireturn         
		s;
	//   33   54:astore_2        
		sqlitedatabase1 = sqlitedatabase;
	//   34   55:aload_1         
	//   35   56:astore          4
		sqlitedatabase = ((SQLiteDatabase) (s));
	//   36   58:aload_2         
	//   37   59:astore_1        
		break MISSING_BLOCK_LABEL_104;
	//   38   60:goto            104
		SQLiteException sqliteexception;
		sqliteexception;
	//   39   63:astore          5
		break MISSING_BLOCK_LABEL_77;
	//   40   65:goto            77
		sqlitedatabase;
	//   41   68:astore_1        
		break MISSING_BLOCK_LABEL_104;
	//   42   69:goto            104
		sqliteexception;
	//   43   72:astore          5
		sqlitedatabase = ((SQLiteDatabase) (obj));
	//   44   74:aload           6
	//   45   76:astore_1        
		sqlitedatabase1 = sqlitedatabase;
	//   46   77:aload_1         
	//   47   78:astore          4
		((zzat) (zzxk)).zzc("Error querying for table", ((Object) (s)), ((Object) (sqliteexception)));
	//   48   80:aload_0         
	//   49   81:getfield        #11  <Field zzbf zzxk>
	//   50   84:ldc1            #45  <String "Error querying for table">
	//   51   86:aload_2         
	//   52   87:aload           5
	//   53   89:invokevirtual   #51  <Method void zzat.zzc(String, Object, Object)>
		if(sqlitedatabase != null)
	//*  54   92:aload_1         
	//*  55   93:ifnull          102
			((Cursor) (sqlitedatabase)).close();
	//   56   96:aload_1         
	//   57   97:invokeinterface #43  <Method void Cursor.close()>
		return false;
	//   58  102:iconst_0        
	//   59  103:ireturn         
		if(sqlitedatabase1 != null)
	//*  60  104:aload           4
	//*  61  106:ifnull          116
			((Cursor) (sqlitedatabase1)).close();
	//   62  109:aload           4
	//   63  111:invokeinterface #43  <Method void Cursor.close()>
		throw sqlitedatabase;
	//   64  116:aload_1         
	//   65  117:athrow          
	}

	private static Set zzb(SQLiteDatabase sqlitedatabase, String s)
	{
		HashSet hashset;
		hashset = new HashSet();
	//    0    0:new             #55  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void HashSet()>
	//    3    7:astore_3        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 22);
	//    4    8:new             #59  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokestatic    #63  <Method String String.valueOf(Object)>
	//    8   16:invokevirtual   #67  <Method int String.length()>
	//    9   19:bipush          22
	//   10   21:iadd            
	//   11   22:invokespecial   #70  <Method void StringBuilder(int)>
	//   12   25:astore          4
		stringbuilder.append("SELECT * FROM ");
	//   13   27:aload           4
	//   14   29:ldc1            #72  <String "SELECT * FROM ">
	//   15   31:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   16   34:pop             
		stringbuilder.append(s);
	//   17   35:aload           4
	//   18   37:aload_1         
	//   19   38:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
		stringbuilder.append(" LIMIT 0");
	//   21   42:aload           4
	//   22   44:ldc1            #78  <String " LIMIT 0">
	//   23   46:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   24   49:pop             
		sqlitedatabase = ((SQLiteDatabase) (sqlitedatabase.rawQuery(stringbuilder.toString(), ((String []) (null)))));
	//   25   50:aload_0         
	//   26   51:aload           4
	//   27   53:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   28   56:aconst_null     
	//   29   57:invokevirtual   #86  <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//   30   60:astore_0        
		s = ((String) (((Cursor) (sqlitedatabase)).getColumnNames()));
	//   31   61:aload_0         
	//   32   62:invokeinterface #90  <Method String[] Cursor.getColumnNames()>
	//   33   67:astore_1        
		int i = 0;
	//   34   68:iconst_0        
	//   35   69:istore_2        
_L2:
		if(i >= s.length)
			break; /* Loop/switch isn't completed */
	//   36   70:iload_2         
	//   37   71:aload_1         
	//   38   72:arraylength     
	//   39   73:icmpge          93
		((Set) (hashset)).add(((Object) (s[i])));
	//   40   76:aload_3         
	//   41   77:aload_1         
	//   42   78:iload_2         
	//   43   79:aaload          
	//   44   80:invokeinterface #96  <Method boolean Set.add(Object)>
	//   45   85:pop             
		i++;
	//   46   86:iload_2         
	//   47   87:iconst_1        
	//   48   88:iadd            
	//   49   89:istore_2        
		if(true) goto _L2; else goto _L1
	//   50   90:goto            70
_L1:
		((Cursor) (sqlitedatabase)).close();
	//   51   93:aload_0         
	//   52   94:invokeinterface #43  <Method void Cursor.close()>
		return ((Set) (hashset));
	//   53   99:aload_3         
	//   54  100:areturn         
		s;
	//   55  101:astore_1        
		((Cursor) (sqlitedatabase)).close();
	//   56  102:aload_0         
	//   57  103:invokeinterface #43  <Method void Cursor.close()>
		throw s;
	//   58  108:aload_1         
	//   59  109:athrow          
	}

	public final SQLiteDatabase getWritableDatabase()
	{
		SQLiteException sqliteexception1;
		if(!zzbf.zza(zzxk).zzj(0x36ee80L))
	//*   0    0:aload_0         
	//*   1    1:getfield        #11  <Field zzbf zzxk>
	//*   2    4:invokestatic    #105 <Method zzdc zzbf.zza(zzbf)>
	//*   3    7:ldc2w           #106 <Long 0x36ee80L>
	//*   4   10:invokevirtual   #113 <Method boolean zzdc.zzj(long)>
	//*   5   13:ifne            26
			throw new SQLiteException("Database open failed");
	//    6   16:new             #19  <Class SQLiteException>
	//    7   19:dup             
	//    8   20:ldc1            #115 <String "Database open failed">
	//    9   22:invokespecial   #118 <Method void SQLiteException(String)>
	//   10   25:athrow          
		Object obj;
		SQLiteException sqliteexception;
		try
		{
			obj = ((Object) (super.getWritableDatabase()));
	//   11   26:aload_0         
	//   12   27:invokespecial   #120 <Method SQLiteDatabase SQLiteOpenHelper.getWritableDatabase()>
	//   13   30:astore_1        
		}
	//*  14   31:aload_1         
	//*  15   32:areturn         
	//*  16   33:aload_0         
	//*  17   34:getfield        #11  <Field zzbf zzxk>
	//*  18   37:invokestatic    #105 <Method zzdc zzbf.zza(zzbf)>
	//*  19   40:invokevirtual   #123 <Method void zzdc.start()>
	//*  20   43:aload_0         
	//*  21   44:getfield        #11  <Field zzbf zzxk>
	//*  22   47:ldc1            #125 <String "Opening the database failed, dropping the table and recreating it">
	//*  23   49:invokevirtual   #128 <Method void zzat.zzu(String)>
	//*  24   52:aload_0         
	//*  25   53:getfield        #11  <Field zzbf zzxk>
	//*  26   56:invokestatic    #131 <Method String zzbf.zzb(zzbf)>
	//*  27   59:astore_1        
	//*  28   60:aload_0         
	//*  29   61:getfield        #11  <Field zzbf zzxk>
	//*  30   64:invokevirtual   #135 <Method Context zzat.getContext()>
	//*  31   67:aload_1         
	//*  32   68:invokevirtual   #141 <Method File Context.getDatabasePath(String)>
	//*  33   71:invokevirtual   #146 <Method boolean File.delete()>
	//*  34   74:pop             
	//*  35   75:aload_0         
	//*  36   76:invokespecial   #120 <Method SQLiteDatabase SQLiteOpenHelper.getWritableDatabase()>
	//*  37   79:astore_1        
	//*  38   80:aload_0         
	//*  39   81:getfield        #11  <Field zzbf zzxk>
	//*  40   84:invokestatic    #105 <Method zzdc zzbf.zza(zzbf)>
	//*  41   87:invokevirtual   #149 <Method void zzdc.clear()>
	//*  42   90:aload_1         
	//*  43   91:areturn         
	//*  44   92:astore_1        
	//*  45   93:aload_0         
	//*  46   94:getfield        #11  <Field zzbf zzxk>
	//*  47   97:ldc1            #151 <String "Failed to open freshly created database">
	//*  48   99:aload_1         
	//*  49  100:invokevirtual   #155 <Method void zzat.zze(String, Object)>
	//*  50  103:aload_1         
	//*  51  104:athrow          
		// Misplaced declaration of an exception variable
		catch(SQLiteException sqliteexception1)
		{
			zzbf.zza(zzxk).start();
			((zzat) (zzxk)).zzu("Opening the database failed, dropping the table and recreating it");
			obj = ((Object) (zzbf.zzb(zzxk)));
			((zzat) (zzxk)).getContext().getDatabasePath(((String) (obj))).delete();
			try
			{
				obj = ((Object) (super.getWritableDatabase()));
				zzbf.zza(zzxk).clear();
			}
			// Misplaced declaration of an exception variable
			catch(SQLiteException sqliteexception)
			{
				((zzat) (zzxk)).zze("Failed to open freshly created database", ((Object) (sqliteexception)));
				throw sqliteexception;
			}
			return ((SQLiteDatabase) (obj));
		}
		return ((SQLiteDatabase) (obj));
	//*  52  105:astore_1        
	//*  53  106:goto            33
	}

	public final void onCreate(SQLiteDatabase sqlitedatabase)
	{
		sqlitedatabase = ((SQLiteDatabase) (sqlitedatabase.getPath()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #160 <Method String SQLiteDatabase.getPath()>
	//    2    4:astore_1        
		if(zzce.version() >= 9)
	//*   3    5:invokestatic    #165 <Method int zzce.version()>
	//*   4    8:bipush          9
	//*   5   10:icmplt          50
		{
			sqlitedatabase = ((SQLiteDatabase) (new File(((String) (sqlitedatabase)))));
	//    6   13:new             #143 <Class File>
	//    7   16:dup             
	//    8   17:aload_1         
	//    9   18:invokespecial   #166 <Method void File(String)>
	//   10   21:astore_1        
			((File) (sqlitedatabase)).setReadable(false, false);
	//   11   22:aload_1         
	//   12   23:iconst_0        
	//   13   24:iconst_0        
	//   14   25:invokevirtual   #170 <Method boolean File.setReadable(boolean, boolean)>
	//   15   28:pop             
			((File) (sqlitedatabase)).setWritable(false, false);
	//   16   29:aload_1         
	//   17   30:iconst_0        
	//   18   31:iconst_0        
	//   19   32:invokevirtual   #173 <Method boolean File.setWritable(boolean, boolean)>
	//   20   35:pop             
			((File) (sqlitedatabase)).setReadable(true, true);
	//   21   36:aload_1         
	//   22   37:iconst_1        
	//   23   38:iconst_1        
	//   24   39:invokevirtual   #170 <Method boolean File.setReadable(boolean, boolean)>
	//   25   42:pop             
			((File) (sqlitedatabase)).setWritable(true, true);
	//   26   43:aload_1         
	//   27   44:iconst_1        
	//   28   45:iconst_1        
	//   29   46:invokevirtual   #173 <Method boolean File.setWritable(boolean, boolean)>
	//   30   49:pop             
		}
	//   31   50:return          
	}

	public final void onOpen(SQLiteDatabase sqlitedatabase)
	{
		Object obj;
		if(android.os.Build.VERSION.SDK_INT >= 15)
			break MISSING_BLOCK_LABEL_45;
	//    0    0:getstatic       #180 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          15
	//    2    5:icmpge          45
		obj = ((Object) (sqlitedatabase.rawQuery("PRAGMA journal_mode=memory", ((String []) (null)))));
	//    3    8:aload_1         
	//    4    9:ldc1            #182 <String "PRAGMA journal_mode=memory">
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #86  <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//    7   15:astore          5
		((Cursor) (obj)).moveToFirst();
	//    8   17:aload           5
	//    9   19:invokeinterface #39  <Method boolean Cursor.moveToFirst()>
	//   10   24:pop             
		((Cursor) (obj)).close();
	//   11   25:aload           5
	//   12   27:invokeinterface #43  <Method void Cursor.close()>
		break MISSING_BLOCK_LABEL_45;
	//   13   32:goto            45
		sqlitedatabase;
	//   14   35:astore_1        
		((Cursor) (obj)).close();
	//   15   36:aload           5
	//   16   38:invokeinterface #43  <Method void Cursor.close()>
		throw sqlitedatabase;
	//   17   43:aload_1         
	//   18   44:athrow          
		boolean flag;
		boolean flag1;
		flag1 = zza(sqlitedatabase, "hits2");
	//   19   45:aload_0         
	//   20   46:aload_1         
	//   21   47:ldc1            #184 <String "hits2">
	//   22   49:invokespecial   #186 <Method boolean zza(SQLiteDatabase, String)>
	//   23   52:istore          4
		flag = false;
	//   24   54:iconst_0        
	//   25   55:istore_3        
		if(flag1) goto _L2; else goto _L1
	//   26   56:iload           4
	//   27   58:ifne            75
_L1:
		obj = ((Object) (zzbf.zzde()));
	//   28   61:invokestatic    #189 <Method String zzbf.zzde()>
	//   29   64:astore          5
_L4:
		sqlitedatabase.execSQL(((String) (obj)));
	//   30   66:aload_1         
	//   31   67:aload           5
	//   32   69:invokevirtual   #192 <Method void SQLiteDatabase.execSQL(String)>
		break; /* Loop/switch isn't completed */
	//   33   72:goto            224
_L2:
		obj = ((Object) (zzb(sqlitedatabase, "hits2")));
	//   34   75:aload_1         
	//   35   76:ldc1            #184 <String "hits2">
	//   36   78:invokestatic    #194 <Method Set zzb(SQLiteDatabase, String)>
	//   37   81:astore          5
		for(int i = 0; i < 4; i++)
	//*  38   83:iconst_0        
	//*  39   84:istore_2        
	//*  40   85:iload_2         
	//*  41   86:iconst_4        
	//*  42   87:icmpge          179
		{
			String s1 = (new String[] {
				"hit_id", "hit_string", "hit_time", "hit_url"
			})[i];
	//   43   90:iconst_4        
	//   44   91:anewarray       String[]
	//   45   94:dup             
	//   46   95:iconst_0        
	//   47   96:ldc1            #196 <String "hit_id">
	//   48   98:aastore         
	//   49   99:dup             
	//   50  100:iconst_1        
	//   51  101:ldc1            #198 <String "hit_string">
	//   52  103:aastore         
	//   53  104:dup             
	//   54  105:iconst_2        
	//   55  106:ldc1            #200 <String "hit_time">
	//   56  108:aastore         
	//   57  109:dup             
	//   58  110:iconst_3        
	//   59  111:ldc1            #202 <String "hit_url">
	//   60  113:aastore         
	//   61  114:iload_2         
	//   62  115:aaload          
	//   63  116:astore          6
			if(!((Set) (obj)).remove(((Object) (s1))))
	//*  64  118:aload           5
	//*  65  120:aload           6
	//*  66  122:invokeinterface #205 <Method boolean Set.remove(Object)>
	//*  67  127:ifne            172
			{
				sqlitedatabase = ((SQLiteDatabase) (String.valueOf(((Object) (s1)))));
	//   68  130:aload           6
	//   69  132:invokestatic    #63  <Method String String.valueOf(Object)>
	//   70  135:astore_1        
				if(((String) (sqlitedatabase)).length() != 0)
	//*  71  136:aload_1         
	//*  72  137:invokevirtual   #67  <Method int String.length()>
	//*  73  140:ifeq            153
					sqlitedatabase = ((SQLiteDatabase) ("Database hits2 is missing required column: ".concat(((String) (sqlitedatabase)))));
	//   74  143:ldc1            #207 <String "Database hits2 is missing required column: ">
	//   75  145:aload_1         
	//   76  146:invokevirtual   #211 <Method String String.concat(String)>
	//   77  149:astore_1        
				else
	//*  78  150:goto            163
					sqlitedatabase = ((SQLiteDatabase) (new String("Database hits2 is missing required column: ")));
	//   79  153:new             #23  <Class String>
	//   80  156:dup             
	//   81  157:ldc1            #207 <String "Database hits2 is missing required column: ">
	//   82  159:invokespecial   #212 <Method void String(String)>
	//   83  162:astore_1        
				throw new SQLiteException(((String) (sqlitedatabase)));
	//   84  163:new             #19  <Class SQLiteException>
	//   85  166:dup             
	//   86  167:aload_1         
	//   87  168:invokespecial   #118 <Method void SQLiteException(String)>
	//   88  171:athrow          
			}
		}

	//   89  172:iload_2         
	//   90  173:iconst_1        
	//   91  174:iadd            
	//   92  175:istore_2        
	//*  93  176:goto            85
		boolean flag2 = ((Set) (obj)).remove("hit_app_id");
	//   94  179:aload           5
	//   95  181:ldc1            #214 <String "hit_app_id">
	//   96  183:invokeinterface #205 <Method boolean Set.remove(Object)>
	//   97  188:istore          4
		if(!((Set) (obj)).isEmpty())
	//*  98  190:aload           5
	//*  99  192:invokeinterface #217 <Method boolean Set.isEmpty()>
	//* 100  197:ifne            210
			throw new SQLiteException("Database hits2 has extra columns");
	//  101  200:new             #19  <Class SQLiteException>
	//  102  203:dup             
	//  103  204:ldc1            #219 <String "Database hits2 has extra columns">
	//  104  206:invokespecial   #118 <Method void SQLiteException(String)>
	//  105  209:athrow          
		if(!(flag2 ^ true))
			break; /* Loop/switch isn't completed */
	//  106  210:iload           4
	//  107  212:iconst_1        
	//  108  213:ixor            
	//  109  214:ifeq            224
		obj = "ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER";
	//  110  217:ldc1            #221 <String "ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER">
	//  111  219:astore          5
		if(true) goto _L4; else goto _L3
	//  112  221:goto            66
_L3:
		if(!zza(sqlitedatabase, "properties"))
	//* 113  224:aload_0         
	//* 114  225:aload_1         
	//* 115  226:ldc1            #223 <String "properties">
	//* 116  228:invokespecial   #186 <Method boolean zza(SQLiteDatabase, String)>
	//* 117  231:ifne            241
		{
			sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
	//  118  234:aload_1         
	//  119  235:ldc1            #225 <String "CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;">
	//  120  237:invokevirtual   #192 <Method void SQLiteDatabase.execSQL(String)>
			return;
	//  121  240:return          
		}
		sqlitedatabase = ((SQLiteDatabase) (zzb(sqlitedatabase, "properties")));
	//  122  241:aload_1         
	//  123  242:ldc1            #223 <String "properties">
	//  124  244:invokestatic    #194 <Method Set zzb(SQLiteDatabase, String)>
	//  125  247:astore_1        
		for(int j = ((int) (flag)); j < 6; j++)
	//* 126  248:iload_3         
	//* 127  249:istore_2        
	//* 128  250:iload_2         
	//* 129  251:bipush          6
	//* 130  253:icmpge          355
		{
			String s = (new String[] {
				"app_uid", "cid", "tid", "params", "adid", "hits_count"
			})[j];
	//  131  256:bipush          6
	//  132  258:anewarray       String[]
	//  133  261:dup             
	//  134  262:iconst_0        
	//  135  263:ldc1            #227 <String "app_uid">
	//  136  265:aastore         
	//  137  266:dup             
	//  138  267:iconst_1        
	//  139  268:ldc1            #229 <String "cid">
	//  140  270:aastore         
	//  141  271:dup             
	//  142  272:iconst_2        
	//  143  273:ldc1            #231 <String "tid">
	//  144  275:aastore         
	//  145  276:dup             
	//  146  277:iconst_3        
	//  147  278:ldc1            #233 <String "params">
	//  148  280:aastore         
	//  149  281:dup             
	//  150  282:iconst_4        
	//  151  283:ldc1            #235 <String "adid">
	//  152  285:aastore         
	//  153  286:dup             
	//  154  287:iconst_5        
	//  155  288:ldc1            #237 <String "hits_count">
	//  156  290:aastore         
	//  157  291:iload_2         
	//  158  292:aaload          
	//  159  293:astore          5
			if(!((Set) (sqlitedatabase)).remove(((Object) (s))))
	//* 160  295:aload_1         
	//* 161  296:aload           5
	//* 162  298:invokeinterface #205 <Method boolean Set.remove(Object)>
	//* 163  303:ifne            348
			{
				sqlitedatabase = ((SQLiteDatabase) (String.valueOf(((Object) (s)))));
	//  164  306:aload           5
	//  165  308:invokestatic    #63  <Method String String.valueOf(Object)>
	//  166  311:astore_1        
				if(((String) (sqlitedatabase)).length() != 0)
	//* 167  312:aload_1         
	//* 168  313:invokevirtual   #67  <Method int String.length()>
	//* 169  316:ifeq            329
					sqlitedatabase = ((SQLiteDatabase) ("Database properties is missing required column: ".concat(((String) (sqlitedatabase)))));
	//  170  319:ldc1            #239 <String "Database properties is missing required column: ">
	//  171  321:aload_1         
	//  172  322:invokevirtual   #211 <Method String String.concat(String)>
	//  173  325:astore_1        
				else
	//* 174  326:goto            339
					sqlitedatabase = ((SQLiteDatabase) (new String("Database properties is missing required column: ")));
	//  175  329:new             #23  <Class String>
	//  176  332:dup             
	//  177  333:ldc1            #239 <String "Database properties is missing required column: ">
	//  178  335:invokespecial   #212 <Method void String(String)>
	//  179  338:astore_1        
				throw new SQLiteException(((String) (sqlitedatabase)));
	//  180  339:new             #19  <Class SQLiteException>
	//  181  342:dup             
	//  182  343:aload_1         
	//  183  344:invokespecial   #118 <Method void SQLiteException(String)>
	//  184  347:athrow          
			}
		}

	//  185  348:iload_2         
	//  186  349:iconst_1        
	//  187  350:iadd            
	//  188  351:istore_2        
	//* 189  352:goto            250
		if(!((Set) (sqlitedatabase)).isEmpty())
	//* 190  355:aload_1         
	//* 191  356:invokeinterface #217 <Method boolean Set.isEmpty()>
	//* 192  361:ifne            374
			throw new SQLiteException("Database properties table has extra columns");
	//  193  364:new             #19  <Class SQLiteException>
	//  194  367:dup             
	//  195  368:ldc1            #241 <String "Database properties table has extra columns">
	//  196  370:invokespecial   #118 <Method void SQLiteException(String)>
	//  197  373:athrow          
		else
			return;
	//  198  374:return          
	}

	public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
	{
	//    0    0:return          
	}

	private final zzbf zzxk;
}
