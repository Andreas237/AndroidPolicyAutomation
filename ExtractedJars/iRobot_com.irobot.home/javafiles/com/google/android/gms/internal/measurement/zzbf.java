// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.HttpUtils;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzau, zzdc, zzat, zzbg, 
//			zzaw, zzck, zzcp, zzcf, 
//			zzcg, zzbx, zzdg, zzaz

final class zzbf extends zzau
	implements Closeable
{

	zzbf(zzaw zzaw1)
	{
		super(zzaw1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #49  <Method void zzau(zzaw)>
	//    3    5:aload_0         
	//    4    6:new             #51  <Class zzdc>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokevirtual   #57  <Method Clock zzat.zzbx()>
	//    8   14:invokespecial   #60  <Method void zzdc(Clock)>
	//    9   17:putfield        #62  <Field zzdc zzxi>
	//   10   20:aload_0         
	//   11   21:new             #51  <Class zzdc>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:invokevirtual   #57  <Method Clock zzat.zzbx()>
	//   15   29:invokespecial   #60  <Method void zzdc(Clock)>
	//   16   32:putfield        #64  <Field zzdc zzxj>
		zzxh = new zzbg(this, zzaw1.getContext(), "google_analytics_v4.db");
	//   17   35:aload_0         
	//   18   36:new             #66  <Class zzbg>
	//   19   39:dup             
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #72  <Method android.content.Context zzaw.getContext()>
	//   23   45:ldc1            #74  <String "google_analytics_v4.db">
	//   24   47:invokespecial   #77  <Method void zzbg(zzbf, android.content.Context, String)>
	//   25   50:putfield        #79  <Field zzbg zzxh>
	//   26   53:return          
	}

	private final long zza(String s, String as[])
	{
		as = ((String []) (getWritableDatabase()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #87  <Method SQLiteDatabase getWritableDatabase()>
	//    2    4:astore_2        
		Cursor cursor = ((SQLiteDatabase) (as)).rawQuery(s, ((String []) (null)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:invokevirtual   #93  <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//    7   11:astore          5
		as = ((String []) (cursor));
	//    8   13:aload           5
	//    9   15:astore_2        
		if(!cursor.moveToFirst())
			break MISSING_BLOCK_LABEL_52;
	//   10   16:aload           5
	//   11   18:invokeinterface #99  <Method boolean Cursor.moveToFirst()>
	//   12   23:ifeq            52
		as = ((String []) (cursor));
	//   13   26:aload           5
	//   14   28:astore_2        
		long l = cursor.getLong(0);
	//   15   29:aload           5
	//   16   31:iconst_0        
	//   17   32:invokeinterface #103 <Method long Cursor.getLong(int)>
	//   18   37:lstore_3        
		if(cursor != null)
	//*  19   38:aload           5
	//*  20   40:ifnull          50
			cursor.close();
	//   21   43:aload           5
	//   22   45:invokeinterface #106 <Method void Cursor.close()>
		return l;
	//   23   50:lload_3         
	//   24   51:lreturn         
		as = ((String []) (cursor));
	//   25   52:aload           5
	//   26   54:astore_2        
		throw new SQLiteException("Database returned empty set");
	//   27   55:new             #83  <Class SQLiteException>
	//   28   58:dup             
	//   29   59:ldc1            #108 <String "Database returned empty set">
	//   30   61:invokespecial   #111 <Method void SQLiteException(String)>
	//   31   64:athrow          
		s;
	//   32   65:astore_1        
		break MISSING_BLOCK_LABEL_103;
	//   33   66:goto            103
		SQLiteException sqliteexception;
		sqliteexception;
	//   34   69:astore          6
		break MISSING_BLOCK_LABEL_85;
	//   35   71:goto            85
		s;
	//   36   74:astore_1        
		as = null;
	//   37   75:aconst_null     
	//   38   76:astore_2        
		break MISSING_BLOCK_LABEL_103;
	//   39   77:goto            103
		sqliteexception;
	//   40   80:astore          6
		cursor = null;
	//   41   82:aconst_null     
	//   42   83:astore          5
		as = ((String []) (cursor));
	//   43   85:aload           5
	//   44   87:astore_2        
		((zzat)this).zzd("Database error", ((Object) (s)), ((Object) (sqliteexception)));
	//   45   88:aload_0         
	//   46   89:ldc1            #113 <String "Database error">
	//   47   91:aload_1         
	//   48   92:aload           6
	//   49   94:invokevirtual   #117 <Method void zzat.zzd(String, Object, Object)>
		as = ((String []) (cursor));
	//   50   97:aload           5
	//   51   99:astore_2        
		throw sqliteexception;
	//   52  100:aload           6
	//   53  102:athrow          
		if(as != null)
	//*  54  103:aload_2         
	//*  55  104:ifnull          113
			((Cursor) (as)).close();
	//   56  107:aload_2         
	//   57  108:invokeinterface #106 <Method void Cursor.close()>
		throw s;
	//   58  113:aload_1         
	//   59  114:athrow          
	}

	private final long zza(String s, String as[], long l)
	{
		String as1[];
		SQLiteException sqliteexception1;
		SQLiteDatabase sqlitedatabase;
		sqlitedatabase = getWritableDatabase();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #87  <Method SQLiteDatabase getWritableDatabase()>
	//    2    4:astore          7
		sqliteexception1 = null;
	//    3    6:aconst_null     
	//    4    7:astore          6
		as1 = null;
	//    5    9:aconst_null     
	//    6   10:astore          5
		as = ((String []) (sqlitedatabase.rawQuery(s, as)));
	//    7   12:aload           7
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #93  <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//   11   19:astore_2        
label0:
		{
			try
			{
				if(!((Cursor) (as)).moveToFirst())
					break label0;
	//   12   20:aload_2         
	//   13   21:invokeinterface #99  <Method boolean Cursor.moveToFirst()>
	//   14   26:ifeq            49
				l = ((Cursor) (as)).getLong(0);
	//   15   29:aload_2         
	//   16   30:iconst_0        
	//   17   31:invokeinterface #103 <Method long Cursor.getLong(int)>
	//   18   36:lstore_3        
			}
	//*  19   37:aload_2         
	//*  20   38:ifnull          47
	//*  21   41:aload_2         
	//*  22   42:invokeinterface #106 <Method void Cursor.close()>
	//*  23   47:lload_3         
	//*  24   48:lreturn         
	//*  25   49:aload_2         
	//*  26   50:ifnull          59
	//*  27   53:aload_2         
	//*  28   54:invokeinterface #106 <Method void Cursor.close()>
	//*  29   59:lconst_0        
	//*  30   60:lreturn         
	//*  31   61:astore_1        
	//*  32   62:goto            104
			// Misplaced declaration of an exception variable
			catch(SQLiteException sqliteexception1)
	//*  33   65:astore          6
			{
				break MISSING_BLOCK_LABEL_86;
	//   34   67:goto            86
			}
			if(as != null)
				((Cursor) (as)).close();
			return l;
		}
		if(as != null)
			((Cursor) (as)).close();
		return 0L;
		s;
		break MISSING_BLOCK_LABEL_104;
		s;
	//   35   70:astore_1        
		as = as1;
	//   36   71:aload           5
	//   37   73:astore_2        
		break MISSING_BLOCK_LABEL_104;
	//   38   74:goto            104
		SQLiteException sqliteexception;
		sqliteexception;
	//   39   77:astore          5
		as = ((String []) (sqliteexception1));
	//   40   79:aload           6
	//   41   81:astore_2        
		sqliteexception1 = sqliteexception;
	//   42   82:aload           5
	//   43   84:astore          6
		sqliteexception = ((SQLiteException) (as));
	//   44   86:aload_2         
	//   45   87:astore          5
		((zzat)this).zzd("Database error", ((Object) (s)), ((Object) (sqliteexception1)));
	//   46   89:aload_0         
	//   47   90:ldc1            #113 <String "Database error">
	//   48   92:aload_1         
	//   49   93:aload           6
	//   50   95:invokevirtual   #117 <Method void zzat.zzd(String, Object, Object)>
		sqliteexception = ((SQLiteException) (as));
	//   51   98:aload_2         
	//   52   99:astore          5
		throw sqliteexception1;
	//   53  101:aload           6
	//   54  103:athrow          
		if(as != null)
	//*  55  104:aload_2         
	//*  56  105:ifnull          114
			((Cursor) (as)).close();
	//   57  108:aload_2         
	//   58  109:invokeinterface #106 <Method void Cursor.close()>
		throw s;
	//   59  114:aload_1         
	//   60  115:athrow          
	}

	static zzdc zza(zzbf zzbf1)
	{
		return zzbf1.zzxj;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field zzdc zzxj>
	//    2    4:areturn         
	}

	static String zzb(zzbf zzbf1)
	{
		return zzdd();
	//    0    0:invokestatic    #125 <Method String zzdd()>
	//    1    3:areturn         
	}

	private final List zzc(long l)
	{
		Object obj;
		Object obj1;
		SQLiteDatabase sqlitedatabase;
		Object obj3;
		ArrayList arraylist;
		zzk.zzaf();
	//    0    0:invokestatic    #132 <Method void zzk.zzaf()>
		((zzau)this).zzcl();
	//    1    3:aload_0         
	//    2    4:invokevirtual   #135 <Method void zzau.zzcl()>
		if(l <= 0L)
	//*   3    7:lload_1         
	//*   4    8:lconst_0        
	//*   5    9:lcmp            
	//*   6   10:ifgt            17
			return Collections.emptyList();
	//    7   13:invokestatic    #141 <Method List Collections.emptyList()>
	//    8   16:areturn         
		sqlitedatabase = getWritableDatabase();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #87  <Method SQLiteDatabase getWritableDatabase()>
	//   11   21:astore          6
		arraylist = new ArrayList();
	//   12   23:new             #143 <Class ArrayList>
	//   13   26:dup             
	//   14   27:invokespecial   #145 <Method void ArrayList()>
	//   15   30:astore          8
		obj3 = null;
	//   16   32:aconst_null     
	//   17   33:astore          7
		obj1 = null;
	//   18   35:aconst_null     
	//   19   36:astore          5
		obj = obj1;
	//   20   38:aload           5
	//   21   40:astore          4
		String s = String.format("%s ASC", new Object[] {
			"hit_id"
		});
	//   22   42:ldc1            #147 <String "%s ASC">
	//   23   44:iconst_1        
	//   24   45:anewarray       Object[]
	//   25   48:dup             
	//   26   49:iconst_0        
	//   27   50:ldc1            #24  <String "hit_id">
	//   28   52:aastore         
	//   29   53:invokestatic    #38  <Method String String.format(String, Object[])>
	//   30   56:astore          9
		obj = obj1;
	//   31   58:aload           5
	//   32   60:astore          4
		String s1 = Long.toString(l);
	//   33   62:lload_1         
	//   34   63:invokestatic    #153 <Method String Long.toString(long)>
	//   35   66:astore          10
		obj = obj1;
	//   36   68:aload           5
	//   37   70:astore          4
		obj1 = ((Object) (sqlitedatabase.query("hits2", new String[] {
			"hit_id"
		}, ((String) (null)), ((String []) (null)), ((String) (null)), ((String) (null)), s, s1)));
	//   38   72:aload           6
	//   39   74:ldc1            #22  <String "hits2">
	//   40   76:iconst_1        
	//   41   77:anewarray       String[]
	//   42   80:dup             
	//   43   81:iconst_0        
	//   44   82:ldc1            #24  <String "hit_id">
	//   45   84:aastore         
	//   46   85:aconst_null     
	//   47   86:aconst_null     
	//   48   87:aconst_null     
	//   49   88:aconst_null     
	//   50   89:aload           9
	//   51   91:aload           10
	//   52   93:invokevirtual   #157 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String, String)>
	//   53   96:astore          5
		boolean flag;
		if(((Cursor) (obj1)).moveToFirst())
	//*  54   98:aload           5
	//*  55  100:invokeinterface #99  <Method boolean Cursor.moveToFirst()>
	//*  56  105:ifeq            139
			do
			{
				((List) (arraylist)).add(((Object) (Long.valueOf(((Cursor) (obj1)).getLong(0)))));
	//   57  108:aload           8
	//   58  110:aload           5
	//   59  112:iconst_0        
	//   60  113:invokeinterface #103 <Method long Cursor.getLong(int)>
	//   61  118:invokestatic    #161 <Method Long Long.valueOf(long)>
	//   62  121:invokeinterface #167 <Method boolean List.add(Object)>
	//   63  126:pop             
				flag = ((Cursor) (obj1)).moveToNext();
	//   64  127:aload           5
	//   65  129:invokeinterface #170 <Method boolean Cursor.moveToNext()>
	//   66  134:istore_3        
			} while(flag);
	//   67  135:iload_3         
	//   68  136:ifne            108
		if(obj1 != null)
	//*  69  139:aload           5
	//*  70  141:ifnull          207
		{
			((Cursor) (obj1)).close();
	//   71  144:aload           5
	//   72  146:invokeinterface #106 <Method void Cursor.close()>
			return ((List) (arraylist));
	//   73  151:aload           8
	//   74  153:areturn         
		}
		break MISSING_BLOCK_LABEL_207;
		Object obj2;
		obj2;
	//   75  154:astore          6
		obj = obj1;
	//   76  156:aload           5
	//   77  158:astore          4
		obj1 = obj2;
	//   78  160:aload           6
	//   79  162:astore          5
		break MISSING_BLOCK_LABEL_210;
	//   80  164:goto            210
		obj2;
	//   81  167:astore          6
		break MISSING_BLOCK_LABEL_183;
	//   82  169:goto            183
		obj1;
	//   83  172:astore          5
		break MISSING_BLOCK_LABEL_210;
	//   84  174:goto            210
		obj2;
	//   85  177:astore          6
		obj1 = ((Object) (obj3));
	//   86  179:aload           7
	//   87  181:astore          5
		obj = obj1;
	//   88  183:aload           5
	//   89  185:astore          4
		((zzat)this).zzd("Error selecting hit ids", obj2);
	//   90  187:aload_0         
	//   91  188:ldc1            #172 <String "Error selecting hit ids">
	//   92  190:aload           6
	//   93  192:invokevirtual   #175 <Method void zzat.zzd(String, Object)>
		if(obj1 != null)
	//*  94  195:aload           5
	//*  95  197:ifnull          207
			((Cursor) (obj1)).close();
	//   96  200:aload           5
	//   97  202:invokeinterface #106 <Method void Cursor.close()>
		return ((List) (arraylist));
	//   98  207:aload           8
	//   99  209:areturn         
		if(obj != null)
	//* 100  210:aload           4
	//* 101  212:ifnull          222
			((Cursor) (obj)).close();
	//  102  215:aload           4
	//  103  217:invokeinterface #106 <Method void Cursor.close()>
		throw obj1;
	//  104  222:aload           5
	//  105  224:athrow          
	}

	private final long zzcv()
	{
		zzk.zzaf();
	//    0    0:invokestatic    #132 <Method void zzk.zzaf()>
		((zzau)this).zzcl();
	//    1    3:aload_0         
	//    2    4:invokevirtual   #135 <Method void zzau.zzcl()>
		return zza("SELECT COUNT(*) FROM hits2", ((String []) (null)));
	//    3    7:aload_0         
	//    4    8:ldc1            #181 <String "SELECT COUNT(*) FROM hits2">
	//    5   10:aconst_null     
	//    6   11:invokespecial   #183 <Method long zza(String, String[])>
	//    7   14:lreturn         
	}

	private static String zzdd()
	{
		return "google_analytics_v4.db";
	//    0    0:ldc1            #74  <String "google_analytics_v4.db">
	//    1    2:areturn         
	}

	static String zzde()
	{
		return zzxf;
	//    0    0:getstatic       #40  <Field String zzxf>
	//    1    3:areturn         
	}

	private final Map zzv(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #195 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            16
			return ((Map) (new HashMap(0)));
	//    3    7:new             #197 <Class HashMap>
	//    4   10:dup             
	//    5   11:iconst_0        
	//    6   12:invokespecial   #200 <Method void HashMap(int)>
	//    7   15:areturn         
		try
		{
			if(s.startsWith("?"))
	//*   8   16:aload_1         
	//*   9   17:ldc1            #202 <String "?">
	//*  10   19:invokevirtual   #206 <Method boolean String.startsWith(String)>
	//*  11   22:ifeq            28
				break MISSING_BLOCK_LABEL_60;
	//   12   25:goto            60
		}
	//*  13   28:aload_1         
	//*  14   29:invokestatic    #209 <Method String String.valueOf(Object)>
	//*  15   32:astore_1        
	//*  16   33:aload_1         
	//*  17   34:invokevirtual   #213 <Method int String.length()>
	//*  18   37:ifeq            50
	//*  19   40:ldc1            #202 <String "?">
	//*  20   42:aload_1         
	//*  21   43:invokevirtual   #217 <Method String String.concat(String)>
	//*  22   46:astore_1        
	//*  23   47:goto            60
	//*  24   50:new             #34  <Class String>
	//*  25   53:dup             
	//*  26   54:ldc1            #202 <String "?">
	//*  27   56:invokespecial   #218 <Method void String(String)>
	//*  28   59:astore_1        
	//*  29   60:new             #220 <Class URI>
	//*  30   63:dup             
	//*  31   64:aload_1         
	//*  32   65:invokespecial   #221 <Method void URI(String)>
	//*  33   68:ldc1            #223 <String "UTF-8">
	//*  34   70:invokestatic    #229 <Method Map HttpUtils.parse(URI, String)>
	//*  35   73:astore_1        
	//*  36   74:aload_1         
	//*  37   75:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  38   76:astore_1        
		{
			((zzat)this).zze("Error parsing hit parameters", ((Object) (s)));
	//   39   77:aload_0         
	//   40   78:ldc1            #231 <String "Error parsing hit parameters">
	//   41   80:aload_1         
	//   42   81:invokevirtual   #234 <Method void zzat.zze(String, Object)>
			return ((Map) (new HashMap(0)));
	//   43   84:new             #197 <Class HashMap>
	//   44   87:dup             
	//   45   88:iconst_0        
	//   46   89:invokespecial   #200 <Method void HashMap(int)>
	//   47   92:areturn         
		}
		s = String.valueOf(((Object) (s)));
		if(s.length() != 0)
		{
			s = "?".concat(s);
			break MISSING_BLOCK_LABEL_60;
		}
		s = new String("?");
		s = ((String) (HttpUtils.parse(new URI(s), "UTF-8")));
		return ((Map) (s));
	}

	private final Map zzw(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #195 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            16
			return ((Map) (new HashMap(0)));
	//    3    7:new             #197 <Class HashMap>
	//    4   10:dup             
	//    5   11:iconst_0        
	//    6   12:invokespecial   #200 <Method void HashMap(int)>
	//    7   15:areturn         
		try
		{
			s = String.valueOf(((Object) (s)));
	//    8   16:aload_1         
	//    9   17:invokestatic    #209 <Method String String.valueOf(Object)>
	//   10   20:astore_1        
			if(s.length() != 0)
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #213 <Method int String.length()>
	//*  13   25:ifeq            38
			{
				s = "?".concat(s);
	//   14   28:ldc1            #202 <String "?">
	//   15   30:aload_1         
	//   16   31:invokevirtual   #217 <Method String String.concat(String)>
	//   17   34:astore_1        
				break MISSING_BLOCK_LABEL_48;
	//   18   35:goto            48
			}
		}
	//*  19   38:new             #34  <Class String>
	//*  20   41:dup             
	//*  21   42:ldc1            #202 <String "?">
	//*  22   44:invokespecial   #218 <Method void String(String)>
	//*  23   47:astore_1        
	//*  24   48:new             #220 <Class URI>
	//*  25   51:dup             
	//*  26   52:aload_1         
	//*  27   53:invokespecial   #221 <Method void URI(String)>
	//*  28   56:ldc1            #223 <String "UTF-8">
	//*  29   58:invokestatic    #229 <Method Map HttpUtils.parse(URI, String)>
	//*  30   61:astore_1        
	//*  31   62:aload_1         
	//*  32   63:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  33   64:astore_1        
		{
			((zzat)this).zze("Error parsing property parameters", ((Object) (s)));
	//   34   65:aload_0         
	//   35   66:ldc1            #239 <String "Error parsing property parameters">
	//   36   68:aload_1         
	//   37   69:invokevirtual   #234 <Method void zzat.zze(String, Object)>
			return ((Map) (new HashMap(0)));
	//   38   72:new             #197 <Class HashMap>
	//   39   75:dup             
	//   40   76:iconst_0        
	//   41   77:invokespecial   #200 <Method void HashMap(int)>
	//   42   80:areturn         
		}
		s = new String("?");
		s = ((String) (HttpUtils.parse(new URI(s), "UTF-8")));
		return ((Map) (s));
	}

	public final void beginTransaction()
	{
		((zzau)this).zzcl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method void zzau.zzcl()>
		getWritableDatabase().beginTransaction();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #87  <Method SQLiteDatabase getWritableDatabase()>
	//    4    8:invokevirtual   #242 <Method void SQLiteDatabase.beginTransaction()>
	//    5   11:return          
	}

	public final void close()
	{
		zzxh.close();
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field zzbg zzxh>
	//    2    4:invokevirtual   #245 <Method void zzbg.close()>
		return;
	//    3    7:return          
		Object obj;
		obj;
	//    4    8:astore_1        
		String s = "Error closing database";
	//    5    9:ldc1            #247 <String "Error closing database">
	//    6   11:astore_2        
_L2:
		((zzat)this).zze(s, obj);
	//    7   12:aload_0         
	//    8   13:aload_2         
	//    9   14:aload_1         
	//   10   15:invokevirtual   #234 <Method void zzat.zze(String, Object)>
		return;
	//   11   18:return          
		obj;
	//   12   19:astore_1        
		s = "Sql error closing database";
	//   13   20:ldc1            #249 <String "Sql error closing database">
	//   14   22:astore_2        
		if(true) goto _L2; else goto _L1
	//   15   23:goto            12
_L1:
	}

	public final void endTransaction()
	{
		((zzau)this).zzcl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method void zzau.zzcl()>
		getWritableDatabase().endTransaction();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #87  <Method SQLiteDatabase getWritableDatabase()>
	//    4    8:invokevirtual   #252 <Method void SQLiteDatabase.endTransaction()>
	//    5   11:return          
	}

	final SQLiteDatabase getWritableDatabase()
	{
		SQLiteDatabase sqlitedatabase;
		try
		{
			sqlitedatabase = zzxh.getWritableDatabase();
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field zzbg zzxh>
	//    2    4:invokevirtual   #253 <Method SQLiteDatabase zzbg.getWritableDatabase()>
	//    3    7:astore_1        
		}
	//*   4    8:aload_1         
	//*   5    9:areturn         
		catch(SQLiteException sqliteexception)
	//*   6   10:astore_1        
		{
			((zzat)this).zzd("Error opening database", ((Object) (sqliteexception)));
	//    7   11:aload_0         
	//    8   12:ldc1            #255 <String "Error opening database">
	//    9   14:aload_1         
	//   10   15:invokevirtual   #175 <Method void zzat.zzd(String, Object)>
			throw sqliteexception;
	//   11   18:aload_1         
	//   12   19:athrow          
		}
		return sqlitedatabase;
	}

	final boolean isEmpty()
	{
		return zzcv() == 0L;
	//    0    0:aload_0         
	//    1    1:invokespecial   #257 <Method long zzcv()>
	//    2    4:lconst_0        
	//    3    5:lcmp            
	//    4    6:ifne            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public final void setTransactionSuccessful()
	{
		((zzau)this).zzcl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method void zzau.zzcl()>
		getWritableDatabase().setTransactionSuccessful();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #87  <Method SQLiteDatabase getWritableDatabase()>
	//    4    8:invokevirtual   #260 <Method void SQLiteDatabase.setTransactionSuccessful()>
	//    5   11:return          
	}

	public final long zza(long l, String s, String s1)
	{
		Preconditions.checkNotEmpty(s);
	//    0    0:aload_3         
	//    1    1:invokestatic    #266 <Method String Preconditions.checkNotEmpty(String)>
	//    2    4:pop             
		Preconditions.checkNotEmpty(s1);
	//    3    5:aload           4
	//    4    7:invokestatic    #266 <Method String Preconditions.checkNotEmpty(String)>
	//    5   10:pop             
		((zzau)this).zzcl();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #135 <Method void zzau.zzcl()>
		zzk.zzaf();
	//    8   15:invokestatic    #132 <Method void zzk.zzaf()>
		return zza("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[] {
			String.valueOf(l), s, s1
		}, 0L);
	//    9   18:aload_0         
	//   10   19:ldc2            #268 <String "SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?">
	//   11   22:iconst_3        
	//   12   23:anewarray       String[]
	//   13   26:dup             
	//   14   27:iconst_0        
	//   15   28:lload_1         
	//   16   29:invokestatic    #270 <Method String String.valueOf(long)>
	//   17   32:aastore         
	//   18   33:dup             
	//   19   34:iconst_1        
	//   20   35:aload_3         
	//   21   36:aastore         
	//   22   37:dup             
	//   23   38:iconst_2        
	//   24   39:aload           4
	//   25   41:aastore         
	//   26   42:lconst_0        
	//   27   43:invokespecial   #272 <Method long zza(String, String[], long)>
	//   28   46:lreturn         
	}

	public final void zza(List list)
	{
		Preconditions.checkNotNull(((Object) (list)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #277 <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		zzk.zzaf();
	//    3    5:invokestatic    #132 <Method void zzk.zzaf()>
		((zzau)this).zzcl();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #135 <Method void zzau.zzcl()>
		if(list.isEmpty())
	//*   6   12:aload_1         
	//*   7   13:invokeinterface #279 <Method boolean List.isEmpty()>
	//*   8   18:ifeq            22
			return;
	//    9   21:return          
		Object obj = ((Object) (new StringBuilder("hit_id")));
	//   10   22:new             #281 <Class StringBuilder>
	//   11   25:dup             
	//   12   26:ldc1            #24  <String "hit_id">
	//   13   28:invokespecial   #282 <Method void StringBuilder(String)>
	//   14   31:astore_3        
		((StringBuilder) (obj)).append(" in (");
	//   15   32:aload_3         
	//   16   33:ldc2            #284 <String " in (">
	//   17   36:invokevirtual   #288 <Method StringBuilder StringBuilder.append(String)>
	//   18   39:pop             
		for(int i = 0; i < list.size();)
	//*  19   40:iconst_0        
	//*  20   41:istore_2        
	//*  21   42:iload_2         
	//*  22   43:aload_1         
	//*  23   44:invokeinterface #291 <Method int List.size()>
	//*  24   49:icmpge          119
		{
			Long long1 = (Long)list.get(i);
	//   25   52:aload_1         
	//   26   53:iload_2         
	//   27   54:invokeinterface #295 <Method Object List.get(int)>
	//   28   59:checkcast       #149 <Class Long>
	//   29   62:astore          4
			if(long1 != null && long1.longValue() != 0L)
	//*  30   64:aload           4
	//*  31   66:ifnull          108
	//*  32   69:aload           4
	//*  33   71:invokevirtual   #298 <Method long Long.longValue()>
	//*  34   74:lconst_0        
	//*  35   75:lcmp            
	//*  36   76:ifne            82
	//*  37   79:goto            108
			{
				if(i > 0)
	//*  38   82:iload_2         
	//*  39   83:ifle            94
					((StringBuilder) (obj)).append(",");
	//   40   86:aload_3         
	//   41   87:ldc2            #300 <String ",">
	//   42   90:invokevirtual   #288 <Method StringBuilder StringBuilder.append(String)>
	//   43   93:pop             
				((StringBuilder) (obj)).append(((Object) (long1)));
	//   44   94:aload_3         
	//   45   95:aload           4
	//   46   97:invokevirtual   #303 <Method StringBuilder StringBuilder.append(Object)>
	//   47  100:pop             
				i++;
	//   48  101:iload_2         
	//   49  102:iconst_1        
	//   50  103:iadd            
	//   51  104:istore_2        
			} else
	//*  52  105:goto            42
			{
				throw new SQLiteException("Invalid hit id");
	//   53  108:new             #83  <Class SQLiteException>
	//   54  111:dup             
	//   55  112:ldc2            #305 <String "Invalid hit id">
	//   56  115:invokespecial   #111 <Method void SQLiteException(String)>
	//   57  118:athrow          
			}
		}

		((StringBuilder) (obj)).append(")");
	//   58  119:aload_3         
	//   59  120:ldc2            #307 <String ")">
	//   60  123:invokevirtual   #288 <Method StringBuilder StringBuilder.append(String)>
	//   61  126:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   62  127:aload_3         
	//   63  128:invokevirtual   #309 <Method String StringBuilder.toString()>
	//   64  131:astore_3        
		try
		{
			SQLiteDatabase sqlitedatabase = getWritableDatabase();
	//   65  132:aload_0         
	//   66  133:invokevirtual   #87  <Method SQLiteDatabase getWritableDatabase()>
	//   67  136:astore          4
			((zzat)this).zza("Deleting dispatched hits. count", ((Object) (Integer.valueOf(list.size()))));
	//   68  138:aload_0         
	//   69  139:ldc2            #311 <String "Deleting dispatched hits. count">
	//   70  142:aload_1         
	//   71  143:invokeinterface #291 <Method int List.size()>
	//   72  148:invokestatic    #316 <Method Integer Integer.valueOf(int)>
	//   73  151:invokevirtual   #318 <Method void zzat.zza(String, Object)>
			int j = sqlitedatabase.delete("hits2", ((String) (obj)), ((String []) (null)));
	//   74  154:aload           4
	//   75  156:ldc1            #22  <String "hits2">
	//   76  158:aload_3         
	//   77  159:aconst_null     
	//   78  160:invokevirtual   #322 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   79  163:istore_2        
			if(j != list.size())
	//*  80  164:iload_2         
	//*  81  165:aload_1         
	//*  82  166:invokeinterface #291 <Method int List.size()>
	//*  83  171:icmpeq          195
				((zzat)this).zzb("Deleted fewer hits then expected", ((Object) (Integer.valueOf(list.size()))), ((Object) (Integer.valueOf(j))), obj);
	//   84  174:aload_0         
	//   85  175:ldc2            #324 <String "Deleted fewer hits then expected">
	//   86  178:aload_1         
	//   87  179:invokeinterface #291 <Method int List.size()>
	//   88  184:invokestatic    #316 <Method Integer Integer.valueOf(int)>
	//   89  187:iload_2         
	//   90  188:invokestatic    #316 <Method Integer Integer.valueOf(int)>
	//   91  191:aload_3         
	//   92  192:invokevirtual   #327 <Method void zzat.zzb(String, Object, Object, Object)>
			return;
	//   93  195:return          
		}
		// Misplaced declaration of an exception variable
		catch(List list)
	//*  94  196:astore_1        
		{
			((zzat)this).zze("Error deleting hits", ((Object) (list)));
	//   95  197:aload_0         
	//   96  198:ldc2            #329 <String "Error deleting hits">
	//   97  201:aload_1         
	//   98  202:invokevirtual   #234 <Method void zzat.zze(String, Object)>
		}
		throw list;
	//   99  205:aload_1         
	//  100  206:athrow          
	}

	protected final void zzag()
	{
	//    0    0:return          
	}

	public final void zzc(zzck zzck1)
	{
		Object obj1;
		ContentValues contentvalues;
		Preconditions.checkNotNull(((Object) (zzck1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #277 <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		zzk.zzaf();
	//    3    5:invokestatic    #132 <Method void zzk.zzaf()>
		((zzau)this).zzcl();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #135 <Method void zzau.zzcl()>
		Preconditions.checkNotNull(((Object) (zzck1)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #277 <Method Object Preconditions.checkNotNull(Object)>
	//    8   16:pop             
		Object obj = ((Object) (new android.net.Uri.Builder()));
	//    9   17:new             #334 <Class android.net.Uri$Builder>
	//   10   20:dup             
	//   11   21:invokespecial   #335 <Method void android.net.Uri$Builder()>
	//   12   24:astore          5
		obj1 = ((Object) (zzck1.zzcw().entrySet().iterator()));
	//   13   26:aload_1         
	//   14   27:invokevirtual   #341 <Method Map zzck.zzcw()>
	//   15   30:invokeinterface #347 <Method Set Map.entrySet()>
	//   16   35:invokeinterface #353 <Method Iterator Set.iterator()>
	//   17   40:astore          6
		do
		{
			if(!((Iterator) (obj1)).hasNext())
				break;
	//   18   42:aload           6
	//   19   44:invokeinterface #358 <Method boolean Iterator.hasNext()>
	//   20   49:ifeq            130
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
	//   21   52:aload           6
	//   22   54:invokeinterface #362 <Method Object Iterator.next()>
	//   23   59:checkcast       #364 <Class java.util.Map$Entry>
	//   24   62:astore          7
			String s = (String)entry.getKey();
	//   25   64:aload           7
	//   26   66:invokeinterface #367 <Method Object java.util.Map$Entry.getKey()>
	//   27   71:checkcast       #34  <Class String>
	//   28   74:astore          8
			if(!"ht".equals(((Object) (s))) && !"qt".equals(((Object) (s))) && !"AppUID".equals(((Object) (s))))
	//*  29   76:ldc2            #369 <String "ht">
	//*  30   79:aload           8
	//*  31   81:invokevirtual   #372 <Method boolean String.equals(Object)>
	//*  32   84:ifne            42
	//*  33   87:ldc2            #374 <String "qt">
	//*  34   90:aload           8
	//*  35   92:invokevirtual   #372 <Method boolean String.equals(Object)>
	//*  36   95:ifne            42
	//*  37   98:ldc2            #376 <String "AppUID">
	//*  38  101:aload           8
	//*  39  103:invokevirtual   #372 <Method boolean String.equals(Object)>
	//*  40  106:ifne            42
				((android.net.Uri.Builder) (obj)).appendQueryParameter(s, (String)entry.getValue());
	//   41  109:aload           5
	//   42  111:aload           8
	//   43  113:aload           7
	//   44  115:invokeinterface #379 <Method Object java.util.Map$Entry.getValue()>
	//   45  120:checkcast       #34  <Class String>
	//   46  123:invokevirtual   #383 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   47  126:pop             
		} while(true);
	//   48  127:goto            42
		obj1 = ((Object) (((android.net.Uri.Builder) (obj)).build().getEncodedQuery()));
	//   49  130:aload           5
	//   50  132:invokevirtual   #387 <Method Uri android.net.Uri$Builder.build()>
	//   51  135:invokevirtual   #392 <Method String Uri.getEncodedQuery()>
	//   52  138:astore          6
		obj = obj1;
	//   53  140:aload           6
	//   54  142:astore          5
		if(obj1 == null)
	//*  55  144:aload           6
	//*  56  146:ifnonnull       154
			obj = "";
	//   57  149:ldc2            #394 <String "">
	//   58  152:astore          5
		if(((String) (obj)).length() > 8192)
	//*  59  154:aload           5
	//*  60  156:invokevirtual   #213 <Method int String.length()>
	//*  61  159:sipush          8192
	//*  62  162:icmple          177
		{
			((zzat)this).zzby().zza(zzck1, "Hit length exceeds the maximum allowed size");
	//   63  165:aload_0         
	//   64  166:invokevirtual   #398 <Method zzcp zzat.zzby()>
	//   65  169:aload_1         
	//   66  170:ldc2            #400 <String "Hit length exceeds the maximum allowed size">
	//   67  173:invokevirtual   #405 <Method void zzcp.zza(zzck, String)>
			return;
	//   68  176:return          
		}
		int i = ((Integer)zzcf.zzza.get()).intValue();
	//   69  177:getstatic       #411 <Field zzcg zzcf.zzza>
	//   70  180:invokevirtual   #415 <Method Object zzcg.get()>
	//   71  183:checkcast       #313 <Class Integer>
	//   72  186:invokevirtual   #418 <Method int Integer.intValue()>
	//   73  189:istore_2        
		long l = zzcv();
	//   74  190:aload_0         
	//   75  191:invokespecial   #257 <Method long zzcv()>
	//   76  194:lstore_3        
		if(l > (long)(i - 1))
	//*  77  195:lload_3         
	//*  78  196:iload_2         
	//*  79  197:iconst_1        
	//*  80  198:isub            
	//*  81  199:i2l             
	//*  82  200:lcmp            
	//*  83  201:ifle            239
		{
			obj1 = ((Object) (zzc((l - (long)i) + 1L)));
	//   84  204:aload_0         
	//   85  205:lload_3         
	//   86  206:iload_2         
	//   87  207:i2l             
	//   88  208:lsub            
	//   89  209:lconst_1        
	//   90  210:ladd            
	//   91  211:invokespecial   #420 <Method List zzc(long)>
	//   92  214:astore          6
			((zzat)this).zzd("Store full, deleting hits to make room, count", ((Object) (Integer.valueOf(((List) (obj1)).size()))));
	//   93  216:aload_0         
	//   94  217:ldc2            #422 <String "Store full, deleting hits to make room, count">
	//   95  220:aload           6
	//   96  222:invokeinterface #291 <Method int List.size()>
	//   97  227:invokestatic    #316 <Method Integer Integer.valueOf(int)>
	//   98  230:invokevirtual   #175 <Method void zzat.zzd(String, Object)>
			zza(((List) (obj1)));
	//   99  233:aload_0         
	//  100  234:aload           6
	//  101  236:invokevirtual   #424 <Method void zza(List)>
		}
		obj1 = ((Object) (getWritableDatabase()));
	//  102  239:aload_0         
	//  103  240:invokevirtual   #87  <Method SQLiteDatabase getWritableDatabase()>
	//  104  243:astore          6
		contentvalues = new ContentValues();
	//  105  245:new             #426 <Class ContentValues>
	//  106  248:dup             
	//  107  249:invokespecial   #427 <Method void ContentValues()>
	//  108  252:astore          7
		contentvalues.put("hit_string", ((String) (obj)));
	//  109  254:aload           7
	//  110  256:ldc1            #30  <String "hit_string">
	//  111  258:aload           5
	//  112  260:invokevirtual   #431 <Method void ContentValues.put(String, String)>
		contentvalues.put("hit_time", Long.valueOf(zzck1.zzer()));
	//  113  263:aload           7
	//  114  265:ldc1            #26  <String "hit_time">
	//  115  267:aload_1         
	//  116  268:invokevirtual   #434 <Method long zzck.zzer()>
	//  117  271:invokestatic    #161 <Method Long Long.valueOf(long)>
	//  118  274:invokevirtual   #437 <Method void ContentValues.put(String, Long)>
		contentvalues.put("hit_app_id", Integer.valueOf(zzck1.zzep()));
	//  119  277:aload           7
	//  120  279:ldc1            #32  <String "hit_app_id">
	//  121  281:aload_1         
	//  122  282:invokevirtual   #440 <Method int zzck.zzep()>
	//  123  285:invokestatic    #316 <Method Integer Integer.valueOf(int)>
	//  124  288:invokevirtual   #443 <Method void ContentValues.put(String, Integer)>
		if(zzck1.zzet())
	//* 125  291:aload_1         
	//* 126  292:invokevirtual   #446 <Method boolean zzck.zzet()>
	//* 127  295:ifeq            306
			obj = ((Object) (zzbx.zzed()));
	//  128  298:invokestatic    #451 <Method String zzbx.zzed()>
	//  129  301:astore          5
		else
	//* 130  303:goto            311
			obj = ((Object) (zzbx.zzee()));
	//  131  306:invokestatic    #454 <Method String zzbx.zzee()>
	//  132  309:astore          5
		contentvalues.put("hit_url", ((String) (obj)));
	//  133  311:aload           7
	//  134  313:ldc1            #28  <String "hit_url">
	//  135  315:aload           5
	//  136  317:invokevirtual   #431 <Method void ContentValues.put(String, String)>
		long l1 = ((SQLiteDatabase) (obj1)).insert("hits2", ((String) (null)), contentvalues);
	//  137  320:aload           6
	//  138  322:ldc1            #22  <String "hits2">
	//  139  324:aconst_null     
	//  140  325:aload           7
	//  141  327:invokevirtual   #458 <Method long SQLiteDatabase.insert(String, String, ContentValues)>
	//  142  330:lstore_3        
		if(l1 == -1L)
	//* 143  331:lload_3         
	//* 144  332:ldc2w           #459 <Long -1L>
	//* 145  335:lcmp            
	//* 146  336:ifne            347
		{
			try
			{
				((zzat)this).zzu("Failed to insert a hit (got -1)");
	//  147  339:aload_0         
	//  148  340:ldc2            #462 <String "Failed to insert a hit (got -1)">
	//  149  343:invokevirtual   #465 <Method void zzat.zzu(String)>
				return;
	//  150  346:return          
			}
	//* 151  347:aload_0         
	//* 152  348:ldc2            #467 <String "Hit saved to database. db-id, hit">
	//* 153  351:lload_3         
	//* 154  352:invokestatic    #161 <Method Long Long.valueOf(long)>
	//* 155  355:aload_1         
	//* 156  356:invokevirtual   #469 <Method void zzat.zzb(String, Object, Object)>
	//* 157  359:return          
			// Misplaced declaration of an exception variable
			catch(zzck zzck1)
	//* 158  360:astore_1        
			{
				((zzat)this).zze("Error storing a hit", ((Object) (zzck1)));
	//  159  361:aload_0         
	//  160  362:ldc2            #471 <String "Error storing a hit">
	//  161  365:aload_1         
	//  162  366:invokevirtual   #234 <Method void zzat.zze(String, Object)>
			}
			break MISSING_BLOCK_LABEL_369;
		}
		((zzat)this).zzb("Hit saved to database. db-id, hit", ((Object) (Long.valueOf(l1))), ((Object) (zzck1)));
		return;
	//  163  369:return          
	}

	public final List zzd(long l)
	{
		Object obj;
		Object obj1;
		SQLiteDatabase sqlitedatabase;
		String s1;
		boolean flag;
		if(l >= 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:iflt            12
			flag = true;
	//    4    6:iconst_1        
	//    5    7:istore          6
		else
	//*   6    9:goto            15
			flag = false;
	//    7   12:iconst_0        
	//    8   13:istore          6
		Preconditions.checkArgument(flag);
	//    9   15:iload           6
	//   10   17:invokestatic    #475 <Method void Preconditions.checkArgument(boolean)>
		zzk.zzaf();
	//   11   20:invokestatic    #132 <Method void zzk.zzaf()>
		((zzau)this).zzcl();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #135 <Method void zzau.zzcl()>
		sqlitedatabase = getWritableDatabase();
	//   14   27:aload_0         
	//   15   28:invokevirtual   #87  <Method SQLiteDatabase getWritableDatabase()>
	//   16   31:astore          9
		s1 = null;
	//   17   33:aconst_null     
	//   18   34:astore          10
		obj1 = null;
	//   19   36:aconst_null     
	//   20   37:astore          8
		obj = obj1;
	//   21   39:aload           8
	//   22   41:astore          7
		String s2 = String.format("%s ASC", new Object[] {
			"hit_id"
		});
	//   23   43:ldc1            #147 <String "%s ASC">
	//   24   45:iconst_1        
	//   25   46:anewarray       Object[]
	//   26   49:dup             
	//   27   50:iconst_0        
	//   28   51:ldc1            #24  <String "hit_id">
	//   29   53:aastore         
	//   30   54:invokestatic    #38  <Method String String.format(String, Object[])>
	//   31   57:astore          11
		obj = obj1;
	//   32   59:aload           8
	//   33   61:astore          7
		String s3 = Long.toString(l);
	//   34   63:lload_1         
	//   35   64:invokestatic    #153 <Method String Long.toString(long)>
	//   36   67:astore          12
		obj = obj1;
	//   37   69:aload           8
	//   38   71:astore          7
		obj1 = ((Object) (sqlitedatabase.query("hits2", new String[] {
			"hit_id", "hit_time", "hit_string", "hit_url", "hit_app_id"
		}, ((String) (null)), ((String []) (null)), ((String) (null)), ((String) (null)), s2, s3)));
	//   39   73:aload           9
	//   40   75:ldc1            #22  <String "hits2">
	//   41   77:iconst_5        
	//   42   78:anewarray       String[]
	//   43   81:dup             
	//   44   82:iconst_0        
	//   45   83:ldc1            #24  <String "hit_id">
	//   46   85:aastore         
	//   47   86:dup             
	//   48   87:iconst_1        
	//   49   88:ldc1            #26  <String "hit_time">
	//   50   90:aastore         
	//   51   91:dup             
	//   52   92:iconst_2        
	//   53   93:ldc1            #30  <String "hit_string">
	//   54   95:aastore         
	//   55   96:dup             
	//   56   97:iconst_3        
	//   57   98:ldc1            #28  <String "hit_url">
	//   58  100:aastore         
	//   59  101:dup             
	//   60  102:iconst_4        
	//   61  103:ldc1            #32  <String "hit_app_id">
	//   62  105:aastore         
	//   63  106:aconst_null     
	//   64  107:aconst_null     
	//   65  108:aconst_null     
	//   66  109:aconst_null     
	//   67  110:aload           11
	//   68  112:aload           12
	//   69  114:invokevirtual   #157 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String, String)>
	//   70  117:astore          8
		obj = ((Object) (new ArrayList()));
	//   71  119:new             #143 <Class ArrayList>
	//   72  122:dup             
	//   73  123:invokespecial   #145 <Method void ArrayList()>
	//   74  126:astore          7
		boolean flag1;
		if(((Cursor) (obj1)).moveToFirst())
	//*  75  128:aload           8
	//*  76  130:invokeinterface #99  <Method boolean Cursor.moveToFirst()>
	//*  77  135:ifeq            231
			do
			{
				l = ((Cursor) (obj1)).getLong(0);
	//   78  138:aload           8
	//   79  140:iconst_0        
	//   80  141:invokeinterface #103 <Method long Cursor.getLong(int)>
	//   81  146:lstore_1        
				long l1 = ((Cursor) (obj1)).getLong(1);
	//   82  147:aload           8
	//   83  149:iconst_1        
	//   84  150:invokeinterface #103 <Method long Cursor.getLong(int)>
	//   85  155:lstore          4
				String s = ((Cursor) (obj1)).getString(2);
	//   86  157:aload           8
	//   87  159:iconst_2        
	//   88  160:invokeinterface #479 <Method String Cursor.getString(int)>
	//   89  165:astore          9
				s1 = ((Cursor) (obj1)).getString(3);
	//   90  167:aload           8
	//   91  169:iconst_3        
	//   92  170:invokeinterface #479 <Method String Cursor.getString(int)>
	//   93  175:astore          10
				int i = ((Cursor) (obj1)).getInt(4);
	//   94  177:aload           8
	//   95  179:iconst_4        
	//   96  180:invokeinterface #483 <Method int Cursor.getInt(int)>
	//   97  185:istore_3        
				((List) (obj)).add(((Object) (new zzck(((zzat) (this)), zzv(s), l1, zzdg.zzai(s1), l, i))));
	//   98  186:aload           7
	//   99  188:new             #337 <Class zzck>
	//  100  191:dup             
	//  101  192:aload_0         
	//  102  193:aload_0         
	//  103  194:aload           9
	//  104  196:invokespecial   #485 <Method Map zzv(String)>
	//  105  199:lload           4
	//  106  201:aload           10
	//  107  203:invokestatic    #490 <Method boolean zzdg.zzai(String)>
	//  108  206:lload_1         
	//  109  207:iload_3         
	//  110  208:invokespecial   #493 <Method void zzck(zzat, Map, long, boolean, long, int)>
	//  111  211:invokeinterface #167 <Method boolean List.add(Object)>
	//  112  216:pop             
				flag1 = ((Cursor) (obj1)).moveToNext();
	//  113  217:aload           8
	//  114  219:invokeinterface #170 <Method boolean Cursor.moveToNext()>
	//  115  224:istore          6
			} while(flag1);
	//  116  226:iload           6
	//  117  228:ifne            138
		if(obj1 != null)
	//* 118  231:aload           8
	//* 119  233:ifnull          243
			((Cursor) (obj1)).close();
	//  120  236:aload           8
	//  121  238:invokeinterface #106 <Method void Cursor.close()>
		return ((List) (obj));
	//  122  243:aload           7
	//  123  245:areturn         
		Object obj2;
		obj2;
	//  124  246:astore          9
		obj = obj1;
	//  125  248:aload           8
	//  126  250:astore          7
		obj1 = obj2;
	//  127  252:aload           9
	//  128  254:astore          8
		break MISSING_BLOCK_LABEL_295;
	//  129  256:goto            295
		obj2;
	//  130  259:astore          9
		break MISSING_BLOCK_LABEL_275;
	//  131  261:goto            275
		obj1;
	//  132  264:astore          8
		break MISSING_BLOCK_LABEL_295;
	//  133  266:goto            295
		obj2;
	//  134  269:astore          9
		obj1 = ((Object) (s1));
	//  135  271:aload           10
	//  136  273:astore          8
		obj = obj1;
	//  137  275:aload           8
	//  138  277:astore          7
		((zzat)this).zze("Error loading hits from the database", obj2);
	//  139  279:aload_0         
	//  140  280:ldc2            #495 <String "Error loading hits from the database">
	//  141  283:aload           9
	//  142  285:invokevirtual   #234 <Method void zzat.zze(String, Object)>
		obj = obj1;
	//  143  288:aload           8
	//  144  290:astore          7
		throw obj2;
	//  145  292:aload           9
	//  146  294:athrow          
		if(obj != null)
	//* 147  295:aload           7
	//* 148  297:ifnull          307
			((Cursor) (obj)).close();
	//  149  300:aload           7
	//  150  302:invokeinterface #106 <Method void Cursor.close()>
		throw obj1;
	//  151  307:aload           8
	//  152  309:athrow          
	}

	public final int zzdb()
	{
		zzk.zzaf();
	//    0    0:invokestatic    #132 <Method void zzk.zzaf()>
		((zzau)this).zzcl();
	//    1    3:aload_0         
	//    2    4:invokevirtual   #135 <Method void zzau.zzcl()>
		if(!zzxi.zzj(0x5265c00L))
	//*   3    7:aload_0         
	//*   4    8:getfield        #62  <Field zzdc zzxi>
	//*   5   11:ldc2w           #498 <Long 0x5265c00L>
	//*   6   14:invokevirtual   #503 <Method boolean zzdc.zzj(long)>
	//*   7   17:ifne            22
		{
			return 0;
	//    8   20:iconst_0        
	//    9   21:ireturn         
		} else
		{
			zzxi.start();
	//   10   22:aload_0         
	//   11   23:getfield        #62  <Field zzdc zzxi>
	//   12   26:invokevirtual   #506 <Method void zzdc.start()>
			((zzat)this).zzq("Deleting stale hits (if any)");
	//   13   29:aload_0         
	//   14   30:ldc2            #508 <String "Deleting stale hits (if any)">
	//   15   33:invokevirtual   #511 <Method void zzat.zzq(String)>
			int i = getWritableDatabase().delete("hits2", "hit_time < ?", new String[] {
				Long.toString(((zzat)this).zzbx().currentTimeMillis() - 0x9a7ec800L)
			});
	//   16   36:aload_0         
	//   17   37:invokevirtual   #87  <Method SQLiteDatabase getWritableDatabase()>
	//   18   40:ldc1            #22  <String "hits2">
	//   19   42:ldc2            #513 <String "hit_time < ?">
	//   20   45:iconst_1        
	//   21   46:anewarray       String[]
	//   22   49:dup             
	//   23   50:iconst_0        
	//   24   51:aload_0         
	//   25   52:invokevirtual   #57  <Method Clock zzat.zzbx()>
	//   26   55:invokeinterface #518 <Method long Clock.currentTimeMillis()>
	//   27   60:ldc2w           #519 <Long 0x9a7ec800L>
	//   28   63:lsub            
	//   29   64:invokestatic    #153 <Method String Long.toString(long)>
	//   30   67:aastore         
	//   31   68:invokevirtual   #322 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   32   71:istore_1        
			((zzat)this).zza("Deleted stale hits, count", ((Object) (Integer.valueOf(i))));
	//   33   72:aload_0         
	//   34   73:ldc2            #522 <String "Deleted stale hits, count">
	//   35   76:iload_1         
	//   36   77:invokestatic    #316 <Method Integer Integer.valueOf(int)>
	//   37   80:invokevirtual   #318 <Method void zzat.zza(String, Object)>
			return i;
	//   38   83:iload_1         
	//   39   84:ireturn         
		}
	}

	public final long zzdc()
	{
		zzk.zzaf();
	//    0    0:invokestatic    #132 <Method void zzk.zzaf()>
		((zzau)this).zzcl();
	//    1    3:aload_0         
	//    2    4:invokevirtual   #135 <Method void zzau.zzcl()>
		return zza(zzxg, ((String []) (null)), 0L);
	//    3    7:aload_0         
	//    4    8:getstatic       #44  <Field String zzxg>
	//    5   11:aconst_null     
	//    6   12:lconst_0        
	//    7   13:invokespecial   #272 <Method long zza(String, String[], long)>
	//    8   16:lreturn         
	}

	public final void zze(long l)
	{
		zzk.zzaf();
	//    0    0:invokestatic    #132 <Method void zzk.zzaf()>
		((zzau)this).zzcl();
	//    1    3:aload_0         
	//    2    4:invokevirtual   #135 <Method void zzau.zzcl()>
		ArrayList arraylist = new ArrayList(1);
	//    3    7:new             #143 <Class ArrayList>
	//    4   10:dup             
	//    5   11:iconst_1        
	//    6   12:invokespecial   #525 <Method void ArrayList(int)>
	//    7   15:astore_3        
		((List) (arraylist)).add(((Object) (Long.valueOf(l))));
	//    8   16:aload_3         
	//    9   17:lload_1         
	//   10   18:invokestatic    #161 <Method Long Long.valueOf(long)>
	//   11   21:invokeinterface #167 <Method boolean List.add(Object)>
	//   12   26:pop             
		((zzat)this).zza("Deleting hit, id", ((Object) (Long.valueOf(l))));
	//   13   27:aload_0         
	//   14   28:ldc2            #527 <String "Deleting hit, id">
	//   15   31:lload_1         
	//   16   32:invokestatic    #161 <Method Long Long.valueOf(long)>
	//   17   35:invokevirtual   #318 <Method void zzat.zza(String, Object)>
		zza(((List) (arraylist)));
	//   18   38:aload_0         
	//   19   39:aload_3         
	//   20   40:invokevirtual   #424 <Method void zza(List)>
	//   21   43:return          
	}

	public final List zzf(long l)
	{
		Object obj;
		((zzau)this).zzcl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method void zzau.zzcl()>
		zzk.zzaf();
	//    2    4:invokestatic    #132 <Method void zzk.zzaf()>
		obj = ((Object) (getWritableDatabase()));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #87  <Method SQLiteDatabase getWritableDatabase()>
	//    5   11:astore          5
		int i;
		Object obj1;
		i = ((Integer)zzcf.zzzc.get()).intValue();
	//    6   13:getstatic       #531 <Field zzcg zzcf.zzzc>
	//    7   16:invokevirtual   #415 <Method Object zzcg.get()>
	//    8   19:checkcast       #313 <Class Integer>
	//    9   22:invokevirtual   #418 <Method int Integer.intValue()>
	//   10   25:istore_3        
		obj1 = ((Object) (((SQLiteDatabase) (obj)).query("properties", new String[] {
			"cid", "tid", "adid", "hits_count", "params"
		}, "app_uid=?", new String[] {
			"0"
		}, ((String) (null)), ((String) (null)), ((String) (null)), String.valueOf(i))));
	//   11   26:aload           5
	//   12   28:ldc2            #533 <String "properties">
	//   13   31:iconst_5        
	//   14   32:anewarray       String[]
	//   15   35:dup             
	//   16   36:iconst_0        
	//   17   37:ldc2            #535 <String "cid">
	//   18   40:aastore         
	//   19   41:dup             
	//   20   42:iconst_1        
	//   21   43:ldc2            #537 <String "tid">
	//   22   46:aastore         
	//   23   47:dup             
	//   24   48:iconst_2        
	//   25   49:ldc2            #539 <String "adid">
	//   26   52:aastore         
	//   27   53:dup             
	//   28   54:iconst_3        
	//   29   55:ldc2            #541 <String "hits_count">
	//   30   58:aastore         
	//   31   59:dup             
	//   32   60:iconst_4        
	//   33   61:ldc2            #543 <String "params">
	//   34   64:aastore         
	//   35   65:ldc2            #545 <String "app_uid=?">
	//   36   68:iconst_1        
	//   37   69:anewarray       String[]
	//   38   72:dup             
	//   39   73:iconst_0        
	//   40   74:ldc2            #547 <String "0">
	//   41   77:aastore         
	//   42   78:aconst_null     
	//   43   79:aconst_null     
	//   44   80:aconst_null     
	//   45   81:iload_3         
	//   46   82:invokestatic    #549 <Method String String.valueOf(int)>
	//   47   85:invokevirtual   #157 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String, String)>
	//   48   88:astore          6
		obj = obj1;
	//   49   90:aload           6
	//   50   92:astore          5
		ArrayList arraylist = new ArrayList();
	//   51   94:new             #143 <Class ArrayList>
	//   52   97:dup             
	//   53   98:invokespecial   #145 <Method void ArrayList()>
	//   54  101:astore          7
		obj = obj1;
	//   55  103:aload           6
	//   56  105:astore          5
		if(!((Cursor) (obj1)).moveToFirst()) goto _L2; else goto _L1
	//   57  107:aload           6
	//   58  109:invokeinterface #99  <Method boolean Cursor.moveToFirst()>
	//   59  114:ifeq            286
_L1:
		obj = obj1;
	//   60  117:aload           6
	//   61  119:astore          5
		String s = ((Cursor) (obj1)).getString(0);
	//   62  121:aload           6
	//   63  123:iconst_0        
	//   64  124:invokeinterface #479 <Method String Cursor.getString(int)>
	//   65  129:astore          8
		obj = obj1;
	//   66  131:aload           6
	//   67  133:astore          5
		String s1 = ((Cursor) (obj1)).getString(1);
	//   68  135:aload           6
	//   69  137:iconst_1        
	//   70  138:invokeinterface #479 <Method String Cursor.getString(int)>
	//   71  143:astore          9
		obj = obj1;
	//   72  145:aload           6
	//   73  147:astore          5
		boolean flag;
		Object obj2;
		Map map;
		if(((Cursor) (obj1)).getInt(2) != 0)
	//*  74  149:aload           6
	//*  75  151:iconst_2        
	//*  76  152:invokeinterface #483 <Method int Cursor.getInt(int)>
	//*  77  157:ifeq            390
			flag = true;
	//   78  160:iconst_1        
	//   79  161:istore          4
		else
	//*  80  163:goto            166
	//*  81  166:aload           6
	//*  82  168:astore          5
	//*  83  170:aload           6
	//*  84  172:iconst_3        
	//*  85  173:invokeinterface #483 <Method int Cursor.getInt(int)>
	//*  86  178:i2l             
	//*  87  179:lstore_1        
	//*  88  180:aload           6
	//*  89  182:astore          5
	//*  90  184:aload_0         
	//*  91  185:aload           6
	//*  92  187:iconst_4        
	//*  93  188:invokeinterface #479 <Method String Cursor.getString(int)>
	//*  94  193:invokespecial   #551 <Method Map zzw(String)>
	//*  95  196:astore          10
	//*  96  198:aload           6
	//*  97  200:astore          5
	//*  98  202:aload           8
	//*  99  204:invokestatic    #195 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 100  207:ifne            257
	//* 101  210:aload           6
	//* 102  212:astore          5
	//* 103  214:aload           9
	//* 104  216:invokestatic    #195 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 105  219:ifeq            225
	//* 106  222:goto            257
	//* 107  225:aload           6
	//* 108  227:astore          5
	//* 109  229:aload           7
	//* 110  231:new             #553 <Class zzaz>
	//* 111  234:dup             
	//* 112  235:lconst_0        
	//* 113  236:aload           8
	//* 114  238:aload           9
	//* 115  240:iload           4
	//* 116  242:lload_1         
	//* 117  243:aload           10
	//* 118  245:invokespecial   #556 <Method void zzaz(long, String, String, boolean, long, Map)>
	//* 119  248:invokeinterface #167 <Method boolean List.add(Object)>
	//* 120  253:pop             
	//* 121  254:goto            272
	//* 122  257:aload           6
	//* 123  259:astore          5
	//* 124  261:aload_0         
	//* 125  262:ldc2            #558 <String "Read property with empty client id or tracker id">
	//* 126  265:aload           8
	//* 127  267:aload           9
	//* 128  269:invokevirtual   #560 <Method void zzat.zzc(String, Object, Object)>
	//* 129  272:aload           6
	//* 130  274:astore          5
	//* 131  276:aload           6
	//* 132  278:invokeinterface #170 <Method boolean Cursor.moveToNext()>
	//* 133  283:ifne            117
	//* 134  286:aload           6
	//* 135  288:astore          5
	//* 136  290:aload           7
	//* 137  292:invokeinterface #291 <Method int List.size()>
	//* 138  297:iload_3         
	//* 139  298:icmplt          312
	//* 140  301:aload           6
	//* 141  303:astore          5
	//* 142  305:aload_0         
	//* 143  306:ldc2            #562 <String "Sending hits to too many properties. Campaign report might be incorrect">
	//* 144  309:invokevirtual   #565 <Method void zzat.zzt(String)>
	//* 145  312:aload           6
	//* 146  314:ifnull          324
	//* 147  317:aload           6
	//* 148  319:invokeinterface #106 <Method void Cursor.close()>
	//* 149  324:aload           7
	//* 150  326:areturn         
	//* 151  327:astore          7
	//* 152  329:goto            349
	//* 153  332:astore          5
	//* 154  334:aconst_null     
	//* 155  335:astore          6
	//* 156  337:aload           5
	//* 157  339:astore          7
	//* 158  341:goto            375
	//* 159  344:astore          7
	//* 160  346:aconst_null     
	//* 161  347:astore          6
	//* 162  349:aload           6
	//* 163  351:astore          5
	//* 164  353:aload_0         
	//* 165  354:ldc2            #495 <String "Error loading hits from the database">
	//* 166  357:aload           7
	//* 167  359:invokevirtual   #234 <Method void zzat.zze(String, Object)>
	//* 168  362:aload           6
	//* 169  364:astore          5
	//* 170  366:aload           7
	//* 171  368:athrow          
	//* 172  369:astore          7
	//* 173  371:aload           5
	//* 174  373:astore          6
	//* 175  375:aload           6
	//* 176  377:ifnull          387
	//* 177  380:aload           6
	//* 178  382:invokeinterface #106 <Method void Cursor.close()>
	//* 179  387:aload           7
	//* 180  389:athrow          
			flag = false;
	//  181  390:iconst_0        
	//  182  391:istore          4
		obj = obj1;
		l = ((Cursor) (obj1)).getInt(3);
		obj = obj1;
		map = zzw(((Cursor) (obj1)).getString(4));
		obj = obj1;
		if(TextUtils.isEmpty(((CharSequence) (s))))
			break MISSING_BLOCK_LABEL_257;
		obj = obj1;
		if(TextUtils.isEmpty(((CharSequence) (s1))))
			break MISSING_BLOCK_LABEL_257;
		obj = obj1;
		((List) (arraylist)).add(((Object) (new zzaz(0L, s, s1, flag, l, map))));
		break MISSING_BLOCK_LABEL_272;
		obj = obj1;
		((zzat)this).zzc("Read property with empty client id or tracker id", ((Object) (s)), ((Object) (s1)));
		obj = obj1;
		if(((Cursor) (obj1)).moveToNext()) goto _L1; else goto _L2
_L2:
		obj = obj1;
		if(((List) (arraylist)).size() < i)
			break MISSING_BLOCK_LABEL_312;
		obj = obj1;
		((zzat)this).zzt("Sending hits to too many properties. Campaign report might be incorrect");
		if(obj1 != null)
			((Cursor) (obj1)).close();
		return ((List) (arraylist));
		obj2;
		break MISSING_BLOCK_LABEL_349;
		obj;
		obj1 = null;
		obj2 = obj;
		break MISSING_BLOCK_LABEL_375;
		obj2;
		obj1 = null;
		obj = obj1;
		((zzat)this).zze("Error loading hits from the database", obj2);
		obj = obj1;
		throw obj2;
		obj2;
		obj1 = obj;
		if(obj1 != null)
			((Cursor) (obj1)).close();
		throw obj2;
	//* 183  393:goto            166
	}

	private static final String zzxf = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[] {
		"hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"
	});
	private static final String zzxg = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[] {
		"hit_time", "hits2"
	});
	private final zzbg zzxh;
	private final zzdc zzxi = new zzdc(((zzat)this).zzbx());
	private final zzdc zzxj = new zzdc(((zzat)this).zzbx());

	static 
	{
	//    0    0:ldc1            #18  <String "CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);">
	//    1    2:bipush          6
	//    2    4:anewarray       Object[]
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:ldc1            #22  <String "hits2">
	//    6   11:aastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:ldc1            #24  <String "hit_id">
	//   10   16:aastore         
	//   11   17:dup             
	//   12   18:iconst_2        
	//   13   19:ldc1            #26  <String "hit_time">
	//   14   21:aastore         
	//   15   22:dup             
	//   16   23:iconst_3        
	//   17   24:ldc1            #28  <String "hit_url">
	//   18   26:aastore         
	//   19   27:dup             
	//   20   28:iconst_4        
	//   21   29:ldc1            #30  <String "hit_string">
	//   22   31:aastore         
	//   23   32:dup             
	//   24   33:iconst_5        
	//   25   34:ldc1            #32  <String "hit_app_id">
	//   26   36:aastore         
	//   27   37:invokestatic    #38  <Method String String.format(String, Object[])>
	//   28   40:putstatic       #40  <Field String zzxf>
	//   29   43:ldc1            #42  <String "SELECT MAX(%s) FROM %s WHERE 1;">
	//   30   45:iconst_2        
	//   31   46:anewarray       Object[]
	//   32   49:dup             
	//   33   50:iconst_0        
	//   34   51:ldc1            #26  <String "hit_time">
	//   35   53:aastore         
	//   36   54:dup             
	//   37   55:iconst_1        
	//   38   56:ldc1            #22  <String "hits2">
	//   39   58:aastore         
	//   40   59:invokestatic    #38  <Method String String.format(String, Object[])>
	//   41   62:putstatic       #44  <Field String zzxg>
	//*  42   65:return          
	}
}
