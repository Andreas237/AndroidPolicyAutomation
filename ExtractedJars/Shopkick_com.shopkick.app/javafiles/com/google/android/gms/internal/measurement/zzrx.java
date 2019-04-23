// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzsb, zzrz, zzry, zzsc, 
//			zzsi, zzsa

public final class zzrx
	implements zzsb
{

	private zzrx(ContentResolver contentresolver, Uri uri1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #45  <Method void Object()>
	//    6   12:putfield        #47  <Field Object zzbrd>
	//    7   15:aload_0         
	//    8   16:new             #49  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #50  <Method void ArrayList()>
	//   11   23:putfield        #52  <Field List zzbrf>
		zzbrc = contentresolver;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #54  <Field ContentResolver zzbrc>
		uri = uri1;
	//   15   31:aload_0         
	//   16   32:aload_2         
	//   17   33:putfield        #56  <Field Uri uri>
		zzbrc.registerContentObserver(uri1, false, ((android.database.ContentObserver) (new zzrz(this, ((android.os.Handler) (null))))));
	//   18   36:aload_0         
	//   19   37:getfield        #54  <Field ContentResolver zzbrc>
	//   20   40:aload_2         
	//   21   41:iconst_0        
	//   22   42:new             #58  <Class zzrz>
	//   23   45:dup             
	//   24   46:aload_0         
	//   25   47:aconst_null     
	//   26   48:invokespecial   #61  <Method void zzrz(zzrx, android.os.Handler)>
	//   27   51:invokevirtual   #67  <Method void ContentResolver.registerContentObserver(Uri, boolean, android.database.ContentObserver)>
	//   28   54:return          
	}

	public static zzrx zza(ContentResolver contentresolver, Uri uri1)
	{
		com/google/android/gms/internal/measurement/zzrx;
	//    0    0:ldc1            #2   <Class zzrx>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		zzrx zzrx1 = (zzrx)zzbrb.get(((Object) (uri1)));
	//    2    3:getstatic       #35  <Field Map zzbrb>
	//    3    6:aload_1         
	//    4    7:invokeinterface #77  <Method Object Map.get(Object)>
	//    5   12:checkcast       #2   <Class zzrx>
	//    6   15:astore_3        
		Object obj = ((Object) (zzrx1));
	//    7   16:aload_3         
	//    8   17:astore_2        
		if(zzrx1 != null) goto _L2; else goto _L1
	//    9   18:aload_3         
	//   10   19:ifnonnull       50
_L1:
		contentresolver = ((ContentResolver) (new zzrx(contentresolver, uri1)));
	//   11   22:new             #2   <Class zzrx>
	//   12   25:dup             
	//   13   26:aload_0         
	//   14   27:aload_1         
	//   15   28:invokespecial   #79  <Method void zzrx(ContentResolver, Uri)>
	//   16   31:astore_0        
		zzbrb.put(((Object) (uri1)), ((Object) (contentresolver)));
	//   17   32:getstatic       #35  <Field Map zzbrb>
	//   18   35:aload_1         
	//   19   36:aload_0         
	//   20   37:invokeinterface #83  <Method Object Map.put(Object, Object)>
	//   21   42:pop             
		obj = ((Object) (contentresolver));
	//   22   43:aload_0         
	//   23   44:astore_2        
		  goto _L2
	//*  24   45:goto            50
_L5:
		obj = ((Object) (contentresolver));
	//   25   48:aload_0         
	//   26   49:astore_2        
_L2:
		com/google/android/gms/internal/measurement/zzrx;
	//   27   50:ldc1            #2   <Class zzrx>
		JVM INSTR monitorexit ;
	//   28   52:monitorexit     
		return ((zzrx) (obj));
	//   29   53:aload_2         
	//   30   54:areturn         
		contentresolver;
	//   31   55:astore_0        
		com/google/android/gms/internal/measurement/zzrx;
	//   32   56:ldc1            #2   <Class zzrx>
		JVM INSTR monitorexit ;
	//   33   58:monitorexit     
		throw contentresolver;
	//   34   59:aload_0         
	//   35   60:athrow          
		contentresolver;
	//   36   61:astore_0        
		obj = ((Object) (zzrx1));
	//   37   62:aload_3         
	//   38   63:astore_2        
		if(true) goto _L2; else goto _L3
	//   39   64:goto            50
_L3:
		uri1;
	//   40   67:astore_1        
		if(true) goto _L5; else goto _L4
_L4:
	//*  41   68:goto            48
	}

	private final Map zztm()
	{
		Object obj;
		Map map;
		try
		{
			map = (Map)zzsc.zza(((zzsd) (new zzry(this))));
	//    0    0:new             #89  <Class zzry>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #92  <Method void zzry(zzrx)>
	//    4    8:invokestatic    #97  <Method Object zzsc.zza(zzsd)>
	//    5   11:checkcast       #73  <Class Map>
	//    6   14:astore_1        
		}
	//*   7   15:aload_1         
	//*   8   16:areturn         
	//*   9   17:ldc1            #99  <String "ConfigurationContentLoader">
	//*  10   19:ldc1            #101 <String "PhenotypeFlag unable to load ContentProvider, using default values">
	//*  11   21:invokestatic    #107 <Method int Log.e(String, String)>
	//*  12   24:pop             
	//*  13   25:aconst_null     
	//*  14   26:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
			return null;
		}
		return map;
	//*  15   27:astore_1        
	//*  16   28:goto            17
	}

	public final Object zzfn(String s)
	{
		return ((Object) ((String)zztk().get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #114 <Method Map zztk()>
	//    2    4:aload_1         
	//    3    5:invokeinterface #77  <Method Object Map.get(Object)>
	//    4   10:checkcast       #37  <Class String>
	//    5   13:areturn         
	}

	public final Map zztk()
	{
		Object obj;
		Map map = zzbre;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Map zzbre>
	//    2    4:astore_2        
		obj = ((Object) (map));
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(map != null)
			break MISSING_BLOCK_LABEL_49;
	//    5    7:aload_2         
	//    6    8:ifnonnull       49
		Object obj1 = zzbrd;
	//    7   11:aload_0         
	//    8   12:getfield        #47  <Field Object zzbrd>
	//    9   15:astore_3        
		obj1;
	//   10   16:aload_3         
		JVM INSTR monitorenter ;
	//   11   17:monitorenter    
		Map map1 = zzbre;
	//   12   18:aload_0         
	//   13   19:getfield        #116 <Field Map zzbre>
	//   14   22:astore_2        
		obj = ((Object) (map1));
	//   15   23:aload_2         
	//   16   24:astore_1        
		if(map1 != null)
			break MISSING_BLOCK_LABEL_39;
	//   17   25:aload_2         
	//   18   26:ifnonnull       39
		obj = ((Object) (zztm()));
	//   19   29:aload_0         
	//   20   30:invokespecial   #118 <Method Map zztm()>
	//   21   33:astore_1        
		zzbre = ((Map) (obj));
	//   22   34:aload_0         
	//   23   35:aload_1         
	//   24   36:putfield        #116 <Field Map zzbre>
		obj1;
	//   25   39:aload_3         
		JVM INSTR monitorexit ;
	//   26   40:monitorexit     
		break MISSING_BLOCK_LABEL_49;
	//   27   41:goto            49
		obj;
	//   28   44:astore_1        
		obj1;
	//   29   45:aload_3         
		JVM INSTR monitorexit ;
	//   30   46:monitorexit     
		throw obj;
	//   31   47:aload_1         
	//   32   48:athrow          
		if(obj != null)
	//*  33   49:aload_1         
	//*  34   50:ifnull          55
			return ((Map) (obj));
	//   35   53:aload_1         
	//   36   54:areturn         
		else
			return Collections.emptyMap();
	//   37   55:invokestatic    #123 <Method Map Collections.emptyMap()>
	//   38   58:areturn         
	}

	public final void zztl()
	{
		synchronized(zzbrd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field Object zzbrd>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzbre = null;
	//    5    7:aload_0         
	//    6    8:aconst_null     
	//    7    9:putfield        #116 <Field Map zzbre>
			zzsi.zztq();
	//    8   12:invokestatic    #129 <Method void zzsi.zztq()>
		}
	//    9   15:aload_1         
	//   10   16:monitorexit     
		this;
	//   11   17:aload_0         
		JVM INSTR monitorenter ;
	//   12   18:monitorenter    
		for(obj = ((Object) (zzbrf.iterator())); ((Iterator) (obj)).hasNext(); ((zzsa)((Iterator) (obj)).next()).zztp());
	//   13   19:aload_0         
	//   14   20:getfield        #52  <Field List zzbrf>
	//   15   23:invokeinterface #135 <Method Iterator List.iterator()>
	//   16   28:astore_1        
	//   17   29:aload_1         
	//   18   30:invokeinterface #141 <Method boolean Iterator.hasNext()>
	//   19   35:ifeq            55
	//   20   38:aload_1         
	//   21   39:invokeinterface #145 <Method Object Iterator.next()>
	//   22   44:checkcast       #147 <Class zzsa>
	//   23   47:invokeinterface #150 <Method void zzsa.zztp()>
	//*  24   52:goto            29
		this;
	//   25   55:aload_0         
		JVM INSTR monitorexit ;
	//   26   56:monitorexit     
		return;
	//   27   57:return          
		obj;
	//   28   58:astore_1        
		this;
	//   29   59:aload_0         
		JVM INSTR monitorexit ;
	//   30   60:monitorexit     
		throw obj;
	//   31   61:aload_1         
	//   32   62:athrow          
		exception;
	//   33   63:astore_2        
		obj;
	//   34   64:aload_1         
		JVM INSTR monitorexit ;
	//   35   65:monitorexit     
		throw exception;
	//   36   66:aload_2         
	//   37   67:athrow          
	}

	final Map zztn()
	{
		Cursor cursor;
		cursor = zzbrc.query(uri, zzbrg, ((String) (null)), ((String []) (null)), ((String) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field ContentResolver zzbrc>
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field Uri uri>
	//    4    8:getstatic       #42  <Field String[] zzbrg>
	//    5   11:aconst_null     
	//    6   12:aconst_null     
	//    7   13:aconst_null     
	//    8   14:invokevirtual   #155 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//    9   17:astore_3        
		if(cursor == null)
	//*  10   18:aload_3         
	//*  11   19:ifnonnull       26
			return Collections.emptyMap();
	//   12   22:invokestatic    #123 <Method Map Collections.emptyMap()>
	//   13   25:areturn         
		int i = cursor.getCount();
	//   14   26:aload_3         
	//   15   27:invokeinterface #161 <Method int Cursor.getCount()>
	//   16   32:istore_1        
		if(i != 0)
			break MISSING_BLOCK_LABEL_49;
	//   17   33:iload_1         
	//   18   34:ifne            49
		Object obj = ((Object) (Collections.emptyMap()));
	//   19   37:invokestatic    #123 <Method Map Collections.emptyMap()>
	//   20   40:astore_2        
		cursor.close();
	//   21   41:aload_3         
	//   22   42:invokeinterface #164 <Method void Cursor.close()>
		return ((Map) (obj));
	//   23   47:aload_2         
	//   24   48:areturn         
		if(i > 256)
			break MISSING_BLOCK_LABEL_68;
	//   25   49:iload_1         
	//   26   50:sipush          256
	//   27   53:icmpgt          68
		obj = ((Object) (new ArrayMap(i)));
	//   28   56:new             #30  <Class ArrayMap>
	//   29   59:dup             
	//   30   60:iload_1         
	//   31   61:invokespecial   #167 <Method void ArrayMap(int)>
	//   32   64:astore_2        
		break MISSING_BLOCK_LABEL_78;
	//   33   65:goto            78
		obj = ((Object) (new HashMap(i, 1.0F)));
	//   34   68:new             #169 <Class HashMap>
	//   35   71:dup             
	//   36   72:iload_1         
	//   37   73:fconst_1        
	//   38   74:invokespecial   #172 <Method void HashMap(int, float)>
	//   39   77:astore_2        
		for(; cursor.moveToNext(); ((Map) (obj)).put(((Object) (cursor.getString(0))), ((Object) (cursor.getString(1)))));
	//   40   78:aload_3         
	//   41   79:invokeinterface #175 <Method boolean Cursor.moveToNext()>
	//   42   84:ifeq            111
	//   43   87:aload_2         
	//   44   88:aload_3         
	//   45   89:iconst_0        
	//   46   90:invokeinterface #179 <Method String Cursor.getString(int)>
	//   47   95:aload_3         
	//   48   96:iconst_1        
	//   49   97:invokeinterface #179 <Method String Cursor.getString(int)>
	//   50  102:invokeinterface #83  <Method Object Map.put(Object, Object)>
	//   51  107:pop             
	//*  52  108:goto            78
		cursor.close();
	//   53  111:aload_3         
	//   54  112:invokeinterface #164 <Method void Cursor.close()>
		return ((Map) (obj));
	//   55  117:aload_2         
	//   56  118:areturn         
		Exception exception;
		exception;
	//   57  119:astore_2        
		cursor.close();
	//   58  120:aload_3         
	//   59  121:invokeinterface #164 <Method void Cursor.close()>
		throw exception;
	//   60  126:aload_2         
	//   61  127:athrow          
	}

	static final Map zzbrb = new ArrayMap();
	private static final String zzbrg[] = {
		"key", "value"
	};
	private final Uri uri;
	private final ContentResolver zzbrc;
	private final Object zzbrd = new Object();
	private volatile Map zzbre;
	private final List zzbrf = new ArrayList();

	static 
	{
	//    0    0:new             #30  <Class ArrayMap>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void ArrayMap()>
	//    3    7:putstatic       #35  <Field Map zzbrb>
	//    4   10:iconst_2        
	//    5   11:anewarray       String[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:ldc1            #39  <String "key">
	//    9   18:aastore         
	//   10   19:dup             
	//   11   20:iconst_1        
	//   12   21:ldc1            #40  <String "value">
	//   13   23:aastore         
	//   14   24:putstatic       #42  <Field String[] zzbrg>
	//*  15   27:return          
	}
}
