// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.*;
import com.google.android.gms.common.util.Clock;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzdi, zzeb, zzbr

final class zzed extends SQLiteOpenHelper
{

	zzed(zzeb zzeb1, Context context, String s)
	{
		zzbdx = zzeb1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzeb zzbdx>
		super(context, s, ((android.database.sqlite.SQLiteDatabase.CursorFactory) (null)), 1);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aconst_null     
	//    7    9:iconst_1        
	//    8   10:invokespecial   #18  <Method void SQLiteOpenHelper(Context, String, android.database.sqlite.SQLiteDatabase$CursorFactory, int)>
		zzbdz = 0L;
	//    9   13:aload_0         
	//   10   14:lconst_0        
	//   11   15:putfield        #20  <Field long zzbdz>
	//   12   18:return          
	}

	private static boolean zza(String s, SQLiteDatabase sqlitedatabase)
	{
		SQLiteDatabase sqlitedatabase1;
		Object obj;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		sqlitedatabase1 = null;
	//    2    3:aconst_null     
	//    3    4:astore_3        
		boolean flag;
		try
		{
			sqlitedatabase = ((SQLiteDatabase) (sqlitedatabase.query("SQLITE_MASTER", new String[] {
				"name"
			}, "name=?", new String[] {
				s
			}, ((String) (null)), ((String) (null)), ((String) (null)))));
	//    4    5:aload_1         
	//    5    6:ldc1            #27  <String "SQLITE_MASTER">
	//    6    8:iconst_1        
	//    7    9:anewarray       String[]
	//    8   12:dup             
	//    9   13:iconst_0        
	//   10   14:ldc1            #31  <String "name">
	//   11   16:aastore         
	//   12   17:ldc1            #33  <String "name=?">
	//   13   19:iconst_1        
	//   14   20:anewarray       String[]
	//   15   23:dup             
	//   16   24:iconst_0        
	//   17   25:aload_0         
	//   18   26:aastore         
	//   19   27:aconst_null     
	//   20   28:aconst_null     
	//   21   29:aconst_null     
	//   22   30:invokevirtual   #39  <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
	//   23   33:astore_1        
		}
	//*  24   34:aload_1         
	//*  25   35:invokeinterface #45  <Method boolean Cursor.moveToFirst()>
	//*  26   40:istore_2        
	//*  27   41:aload_1         
	//*  28   42:ifnull          51
	//*  29   45:aload_1         
	//*  30   46:invokeinterface #49  <Method void Cursor.close()>
	//*  31   51:iload_2         
	//*  32   52:ireturn         
	//*  33   53:astore_0        
	//*  34   54:aload_1         
	//*  35   55:astore_3        
	//*  36   56:goto            124
	//*  37   59:goto            66
	//*  38   62:astore_0        
	//*  39   63:goto            124
	//*  40   66:aload_1         
	//*  41   67:astore_3        
	//*  42   68:aload_0         
	//*  43   69:invokestatic    #53  <Method String String.valueOf(Object)>
	//*  44   72:astore_0        
	//*  45   73:aload_1         
	//*  46   74:astore_3        
	//*  47   75:aload_0         
	//*  48   76:invokevirtual   #57  <Method int String.length()>
	//*  49   79:ifeq            94
	//*  50   82:aload_1         
	//*  51   83:astore_3        
	//*  52   84:ldc1            #59  <String "Error querying for table ">
	//*  53   86:aload_0         
	//*  54   87:invokevirtual   #63  <Method String String.concat(String)>
	//*  55   90:astore_0        
	//*  56   91:goto            106
	//*  57   94:aload_1         
	//*  58   95:astore_3        
	//*  59   96:new             #29  <Class String>
	//*  60   99:dup             
	//*  61  100:ldc1            #59  <String "Error querying for table ">
	//*  62  102:invokespecial   #66  <Method void String(String)>
	//*  63  105:astore_0        
	//*  64  106:aload_1         
	//*  65  107:astore_3        
	//*  66  108:aload_0         
	//*  67  109:invokestatic    #71  <Method void zzdi.zzab(String)>
	//*  68  112:aload_1         
	//*  69  113:ifnull          122
	//*  70  116:aload_1         
	//*  71  117:invokeinterface #49  <Method void Cursor.close()>
	//*  72  122:iconst_0        
	//*  73  123:ireturn         
	//*  74  124:aload_3         
	//*  75  125:ifnull          134
	//*  76  128:aload_3         
	//*  77  129:invokeinterface #49  <Method void Cursor.close()>
	//*  78  134:aload_0         
	//*  79  135:athrow          
		// Misplaced declaration of an exception variable
		catch(SQLiteDatabase sqlitedatabase)
	//*  80  136:astore_1        
		{
			sqlitedatabase = ((SQLiteDatabase) (obj));
	//   81  137:aload           4
	//   82  139:astore_1        
			continue; /* Loop/switch isn't completed */
	//   83  140:goto            66
		}
		flag = ((Cursor) (sqlitedatabase)).moveToFirst();
		if(sqlitedatabase != null)
			((Cursor) (sqlitedatabase)).close();
		return flag;
		s;
		sqlitedatabase1 = sqlitedatabase;
		  goto _L1
		s;
		  goto _L1
_L3:
		sqlitedatabase1 = sqlitedatabase;
		s = String.valueOf(((Object) (s)));
		sqlitedatabase1 = sqlitedatabase;
		if(s.length() == 0)
			break MISSING_BLOCK_LABEL_94;
		sqlitedatabase1 = sqlitedatabase;
		s = "Error querying for table ".concat(s);
		break MISSING_BLOCK_LABEL_106;
		sqlitedatabase1 = sqlitedatabase;
		s = new String("Error querying for table ");
		sqlitedatabase1 = sqlitedatabase;
		zzdi.zzab(s);
		if(sqlitedatabase != null)
			((Cursor) (sqlitedatabase)).close();
		return false;
_L1:
		if(sqlitedatabase1 != null)
			((Cursor) (sqlitedatabase1)).close();
		throw s;
		SQLiteException sqliteexception;
		sqliteexception;
	//   84  143:astore_3        
		if(true) goto _L3; else goto _L2
_L2:
	//*  85  144:goto            59
	}

	public final SQLiteDatabase getWritableDatabase()
	{
		SQLiteDatabase sqlitedatabase;
		if(zzbdy && zzbdz + 0x36ee80L > zzeb.zza(zzbdx).currentTimeMillis())
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field boolean zzbdy>
	//*   2    4:ifeq            41
	//*   3    7:aload_0         
	//*   4    8:getfield        #20  <Field long zzbdz>
	//*   5   11:ldc2w           #76  <Long 0x36ee80L>
	//*   6   14:ladd            
	//*   7   15:aload_0         
	//*   8   16:getfield        #15  <Field zzeb zzbdx>
	//*   9   19:invokestatic    #82  <Method Clock zzeb.zza(zzeb)>
	//*  10   22:invokeinterface #88  <Method long Clock.currentTimeMillis()>
	//*  11   27:lcmp            
	//*  12   28:ifle            41
			throw new SQLiteException("Database creation failed");
	//   13   31:new             #25  <Class SQLiteException>
	//   14   34:dup             
	//   15   35:ldc1            #90  <String "Database creation failed">
	//   16   37:invokespecial   #91  <Method void SQLiteException(String)>
	//   17   40:athrow          
		sqlitedatabase = null;
	//   18   41:aconst_null     
	//   19   42:astore_1        
		zzbdy = true;
	//   20   43:aload_0         
	//   21   44:iconst_1        
	//   22   45:putfield        #75  <Field boolean zzbdy>
		zzbdz = zzeb.zza(zzbdx).currentTimeMillis();
	//   23   48:aload_0         
	//   24   49:aload_0         
	//   25   50:getfield        #15  <Field zzeb zzbdx>
	//   26   53:invokestatic    #82  <Method Clock zzeb.zza(zzeb)>
	//   27   56:invokeinterface #88  <Method long Clock.currentTimeMillis()>
	//   28   61:putfield        #20  <Field long zzbdz>
		SQLiteDatabase sqlitedatabase1 = super.getWritableDatabase();
	//   29   64:aload_0         
	//   30   65:invokespecial   #93  <Method SQLiteDatabase SQLiteOpenHelper.getWritableDatabase()>
	//   31   68:astore_2        
		sqlitedatabase = sqlitedatabase1;
	//   32   69:aload_2         
	//   33   70:astore_1        
		  goto _L1
	//*  34   71:goto            95
_L3:
		zzeb.zzc(zzbdx).getDatabasePath(zzeb.zzb(zzbdx)).delete();
	//   35   74:aload_0         
	//   36   75:getfield        #15  <Field zzeb zzbdx>
	//   37   78:invokestatic    #97  <Method Context zzeb.zzc(zzeb)>
	//   38   81:aload_0         
	//   39   82:getfield        #15  <Field zzeb zzbdx>
	//   40   85:invokestatic    #101 <Method String zzeb.zzb(zzeb)>
	//   41   88:invokevirtual   #107 <Method File Context.getDatabasePath(String)>
	//   42   91:invokevirtual   #112 <Method boolean File.delete()>
	//   43   94:pop             
_L1:
		SQLiteDatabase sqlitedatabase2 = sqlitedatabase;
	//   44   95:aload_1         
	//   45   96:astore_2        
		if(sqlitedatabase == null)
	//*  46   97:aload_1         
	//*  47   98:ifnonnull       106
			sqlitedatabase2 = super.getWritableDatabase();
	//   48  101:aload_0         
	//   49  102:invokespecial   #93  <Method SQLiteDatabase SQLiteOpenHelper.getWritableDatabase()>
	//   50  105:astore_2        
		zzbdy = false;
	//   51  106:aload_0         
	//   52  107:iconst_0        
	//   53  108:putfield        #75  <Field boolean zzbdy>
		return sqlitedatabase2;
	//   54  111:aload_2         
	//   55  112:areturn         
		SQLiteException sqliteexception;
		sqliteexception;
	//   56  113:astore_2        
		if(true) goto _L3; else goto _L2
_L2:
	//*  57  114:goto            74
	}

	public final void onCreate(SQLiteDatabase sqlitedatabase)
	{
		zzbr.zzdr(sqlitedatabase.getPath());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #118 <Method String SQLiteDatabase.getPath()>
	//    2    4:invokestatic    #124 <Method boolean zzbr.zzdr(String)>
	//    3    7:pop             
	//    4    8:return          
	}

	public final void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
	{
	//    0    0:return          
	}

	public final void onOpen(SQLiteDatabase sqlitedatabase)
	{
		Object obj;
		if(android.os.Build.VERSION.SDK_INT >= 15)
			break MISSING_BLOCK_LABEL_41;
	//    0    0:getstatic       #133 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          15
	//    2    5:icmpge          41
		obj = ((Object) (sqlitedatabase.rawQuery("PRAGMA journal_mode=memory", ((String []) (null)))));
	//    3    8:aload_1         
	//    4    9:ldc1            #135 <String "PRAGMA journal_mode=memory">
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #139 <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//    7   15:astore_3        
		((Cursor) (obj)).moveToFirst();
	//    8   16:aload_3         
	//    9   17:invokeinterface #45  <Method boolean Cursor.moveToFirst()>
	//   10   22:pop             
		((Cursor) (obj)).close();
	//   11   23:aload_3         
	//   12   24:invokeinterface #49  <Method void Cursor.close()>
		break MISSING_BLOCK_LABEL_41;
	//   13   29:goto            41
		sqlitedatabase;
	//   14   32:astore_1        
		((Cursor) (obj)).close();
	//   15   33:aload_3         
	//   16   34:invokeinterface #49  <Method void Cursor.close()>
		throw sqlitedatabase;
	//   17   39:aload_1         
	//   18   40:athrow          
		if(!zza("gtm_hits", sqlitedatabase))
	//*  19   41:ldc1            #141 <String "gtm_hits">
	//*  20   43:aload_1         
	//*  21   44:invokestatic    #143 <Method boolean zza(String, SQLiteDatabase)>
	//*  22   47:ifne            58
		{
			sqlitedatabase.execSQL(zzeb.zzpl());
	//   23   50:aload_1         
	//   24   51:invokestatic    #146 <Method String zzeb.zzpl()>
	//   25   54:invokevirtual   #149 <Method void SQLiteDatabase.execSQL(String)>
			return;
	//   26   57:return          
		}
		sqlitedatabase = ((SQLiteDatabase) (sqlitedatabase.rawQuery("SELECT * FROM gtm_hits WHERE 0", ((String []) (null)))));
	//   27   58:aload_1         
	//   28   59:ldc1            #151 <String "SELECT * FROM gtm_hits WHERE 0">
	//   29   61:aconst_null     
	//   30   62:invokevirtual   #139 <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//   31   65:astore_1        
		obj = ((Object) (new HashSet()));
	//   32   66:new             #153 <Class HashSet>
	//   33   69:dup             
	//   34   70:invokespecial   #155 <Method void HashSet()>
	//   35   73:astore_3        
		String as[] = ((Cursor) (sqlitedatabase)).getColumnNames();
	//   36   74:aload_1         
	//   37   75:invokeinterface #159 <Method String[] Cursor.getColumnNames()>
	//   38   80:astore          4
		int i = 0;
	//   39   82:iconst_0        
	//   40   83:istore_2        
_L2:
		if(i >= as.length)
			break; /* Loop/switch isn't completed */
	//   41   84:iload_2         
	//   42   85:aload           4
	//   43   87:arraylength     
	//   44   88:icmpge          109
		((Set) (obj)).add(((Object) (as[i])));
	//   45   91:aload_3         
	//   46   92:aload           4
	//   47   94:iload_2         
	//   48   95:aaload          
	//   49   96:invokeinterface #165 <Method boolean Set.add(Object)>
	//   50  101:pop             
		i++;
	//   51  102:iload_2         
	//   52  103:iconst_1        
	//   53  104:iadd            
	//   54  105:istore_2        
		if(true) goto _L2; else goto _L1
	//   55  106:goto            84
_L1:
		((Cursor) (sqlitedatabase)).close();
	//   56  109:aload_1         
	//   57  110:invokeinterface #49  <Method void Cursor.close()>
		if(((Set) (obj)).remove("hit_id") && ((Set) (obj)).remove("hit_url") && ((Set) (obj)).remove("hit_time") && ((Set) (obj)).remove("hit_first_send_time"))
	//*  58  115:aload_3         
	//*  59  116:ldc1            #167 <String "hit_id">
	//*  60  118:invokeinterface #170 <Method boolean Set.remove(Object)>
	//*  61  123:ifeq            182
	//*  62  126:aload_3         
	//*  63  127:ldc1            #172 <String "hit_url">
	//*  64  129:invokeinterface #170 <Method boolean Set.remove(Object)>
	//*  65  134:ifeq            182
	//*  66  137:aload_3         
	//*  67  138:ldc1            #174 <String "hit_time">
	//*  68  140:invokeinterface #170 <Method boolean Set.remove(Object)>
	//*  69  145:ifeq            182
	//*  70  148:aload_3         
	//*  71  149:ldc1            #176 <String "hit_first_send_time">
	//*  72  151:invokeinterface #170 <Method boolean Set.remove(Object)>
	//*  73  156:ifne            162
	//*  74  159:goto            182
		{
			if(!((Set) (obj)).isEmpty())
	//*  75  162:aload_3         
	//*  76  163:invokeinterface #179 <Method boolean Set.isEmpty()>
	//*  77  168:ifne            181
				throw new SQLiteException("Database has extra columns");
	//   78  171:new             #25  <Class SQLiteException>
	//   79  174:dup             
	//   80  175:ldc1            #181 <String "Database has extra columns">
	//   81  177:invokespecial   #91  <Method void SQLiteException(String)>
	//   82  180:athrow          
			else
				return;
	//   83  181:return          
		} else
		{
			throw new SQLiteException("Database column missing");
	//   84  182:new             #25  <Class SQLiteException>
	//   85  185:dup             
	//   86  186:ldc1            #183 <String "Database column missing">
	//   87  188:invokespecial   #91  <Method void SQLiteException(String)>
	//   88  191:athrow          
		}
		Exception exception;
		exception;
	//   89  192:astore_3        
		((Cursor) (sqlitedatabase)).close();
	//   90  193:aload_1         
	//   91  194:invokeinterface #49  <Method void Cursor.close()>
		throw exception;
	//   92  199:aload_3         
	//   93  200:athrow          
	}

	public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
	{
	//    0    0:return          
	}

	private final zzeb zzbdx;
	private boolean zzbdy;
	private long zzbdz;
}
