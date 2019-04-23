// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzrv

public class zzru
{

	public zzru()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #83  <Method void Object()>
	//    2    4:return          
	}

	public static String zza(ContentResolver contentresolver, String s, String s1)
	{
		com/google/android/gms/internal/measurement/zzru;
	//    0    0:ldc1            #2   <Class zzru>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Object obj;
		zza(contentresolver);
	//    2    3:aload_0         
	//    3    4:invokestatic    #88  <Method void zza(ContentResolver)>
		obj = zzbqw;
	//    4    7:getstatic       #90  <Field Object zzbqw>
	//    5   10:astore          6
		if(!zzbqr.containsKey(((Object) (s))))
			break MISSING_BLOCK_LABEL_45;
	//    6   12:getstatic       #92  <Field HashMap zzbqr>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #96  <Method boolean HashMap.containsKey(Object)>
	//    9   19:ifeq            45
		contentresolver = ((ContentResolver) ((String)zzbqr.get(((Object) (s)))));
	//   10   22:getstatic       #92  <Field HashMap zzbqr>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #100 <Method Object HashMap.get(Object)>
	//   13   29:checkcast       #79  <Class String>
	//   14   32:astore_0        
		int i;
		int j;
		Cursor cursor;
		if(contentresolver == null)
	//*  15   33:aload_0         
	//*  16   34:ifnull          294
	//*  17   37:goto            40
	//*  18   40:ldc1            #2   <Class zzru>
	//*  19   42:monitorexit     
	//*  20   43:aload_0         
	//*  21   44:areturn         
	//*  22   45:getstatic       #81  <Field String[] zzbqy>
	//*  23   48:astore_2        
	//*  24   49:aload_2         
	//*  25   50:arraylength     
	//*  26   51:istore          4
	//*  27   53:iconst_0        
	//*  28   54:istore_3        
	//*  29   55:iload_3         
	//*  30   56:iload           4
	//*  31   58:icmpge          143
	//*  32   61:aload_1         
	//*  33   62:aload_2         
	//*  34   63:iload_3         
	//*  35   64:aaload          
	//*  36   65:invokevirtual   #104 <Method boolean String.startsWith(String)>
	//*  37   68:ifeq            304
	//*  38   71:getstatic       #106 <Field boolean zzbqx>
	//*  39   74:ifeq            86
	//*  40   77:getstatic       #92  <Field HashMap zzbqr>
	//*  41   80:invokevirtual   #110 <Method boolean HashMap.isEmpty()>
	//*  42   83:ifeq            138
	//*  43   86:getstatic       #81  <Field String[] zzbqy>
	//*  44   89:astore_2        
	//*  45   90:getstatic       #92  <Field HashMap zzbqr>
	//*  46   93:aload_0         
	//*  47   94:aload_2         
	//*  48   95:invokestatic    #113 <Method Map zza(ContentResolver, String[])>
	//*  49   98:invokevirtual   #117 <Method void HashMap.putAll(Map)>
	//*  50  101:iconst_1        
	//*  51  102:putstatic       #106 <Field boolean zzbqx>
	//*  52  105:getstatic       #92  <Field HashMap zzbqr>
	//*  53  108:aload_1         
	//*  54  109:invokevirtual   #96  <Method boolean HashMap.containsKey(Object)>
	//*  55  112:ifeq            138
	//*  56  115:getstatic       #92  <Field HashMap zzbqr>
	//*  57  118:aload_1         
	//*  58  119:invokevirtual   #100 <Method Object HashMap.get(Object)>
	//*  59  122:checkcast       #79  <Class String>
	//*  60  125:astore_0        
	//*  61  126:aload_0         
	//*  62  127:ifnull          299
	//*  63  130:goto            133
	//*  64  133:ldc1            #2   <Class zzru>
	//*  65  135:monitorexit     
	//*  66  136:aload_0         
	//*  67  137:areturn         
	//*  68  138:ldc1            #2   <Class zzru>
	//*  69  140:monitorexit     
	//*  70  141:aconst_null     
	//*  71  142:areturn         
	//*  72  143:ldc1            #2   <Class zzru>
	//*  73  145:monitorexit     
	//*  74  146:aload_0         
	//*  75  147:getstatic       #41  <Field Uri CONTENT_URI>
	//*  76  150:aconst_null     
	//*  77  151:aconst_null     
	//*  78  152:iconst_1        
	//*  79  153:anewarray       String[]
	//*  80  156:dup             
	//*  81  157:iconst_0        
	//*  82  158:aload_1         
	//*  83  159:aastore         
	//*  84  160:aconst_null     
	//*  85  161:invokevirtual   #123 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//*  86  164:astore          5
	//*  87  166:aload           5
	//*  88  168:ifnonnull       185
	//*  89  171:aload           5
	//*  90  173:ifnull          183
	//*  91  176:aload           5
	//*  92  178:invokeinterface #128 <Method void Cursor.close()>
	//*  93  183:aconst_null     
	//*  94  184:areturn         
	//*  95  185:aload           5
	//*  96  187:invokeinterface #131 <Method boolean Cursor.moveToFirst()>
	//*  97  192:ifne            216
	//*  98  195:aload           6
	//*  99  197:aload_1         
	//* 100  198:aconst_null     
	//* 101  199:invokestatic    #134 <Method void zza(Object, String, String)>
	//* 102  202:aload           5
	//* 103  204:ifnull          214
	//* 104  207:aload           5
	//* 105  209:invokeinterface #128 <Method void Cursor.close()>
	//* 106  214:aconst_null     
	//* 107  215:areturn         
	//* 108  216:aload           5
	//* 109  218:iconst_1        
	//* 110  219:invokeinterface #138 <Method String Cursor.getString(int)>
	//* 111  224:astore_2        
	//* 112  225:aload_2         
	//* 113  226:astore_0        
	//* 114  227:aload_2         
	//* 115  228:ifnull          243
	//* 116  231:aload_2         
	//* 117  232:astore_0        
	//* 118  233:aload_2         
	//* 119  234:aconst_null     
	//* 120  235:invokevirtual   #141 <Method boolean String.equals(Object)>
	//* 121  238:ifeq            243
	//* 122  241:aconst_null     
	//* 123  242:astore_0        
	//* 124  243:aload           6
	//* 125  245:aload_1         
	//* 126  246:aload_0         
	//* 127  247:invokestatic    #134 <Method void zza(Object, String, String)>
	//* 128  250:aload_0         
	//* 129  251:ifnull          257
	//* 130  254:goto            259
	//* 131  257:aconst_null     
	//* 132  258:astore_0        
	//* 133  259:aload           5
	//* 134  261:ifnull          271
	//* 135  264:aload           5
	//* 136  266:invokeinterface #128 <Method void Cursor.close()>
	//* 137  271:aload_0         
	//* 138  272:areturn         
	//* 139  273:astore_0        
	//* 140  274:aload           5
	//* 141  276:ifnull          286
	//* 142  279:aload           5
	//* 143  281:invokeinterface #128 <Method void Cursor.close()>
	//* 144  286:aload_0         
	//* 145  287:athrow          
	//* 146  288:astore_0        
	//* 147  289:ldc1            #2   <Class zzru>
	//* 148  291:monitorexit     
	//* 149  292:aload_0         
	//* 150  293:athrow          
			contentresolver = null;
	//  151  294:aconst_null     
	//  152  295:astore_0        
		com/google/android/gms/internal/measurement/zzru;
		JVM INSTR monitorexit ;
		return ((String) (contentresolver));
		s1 = ((String) (zzbqy));
		j = s1.length;
		i = 0;
_L2:
		if(i >= j)
			break MISSING_BLOCK_LABEL_143;
		if(!s.startsWith(((String) (s1[i]))))
			break MISSING_BLOCK_LABEL_304;
		if(zzbqx && !zzbqr.isEmpty())
			break MISSING_BLOCK_LABEL_138;
		s1 = ((String) (zzbqy));
		zzbqr.putAll(zza(contentresolver, ((String []) (s1))));
		zzbqx = true;
		if(!zzbqr.containsKey(((Object) (s))))
			break MISSING_BLOCK_LABEL_138;
		contentresolver = ((ContentResolver) ((String)zzbqr.get(((Object) (s)))));
		if(contentresolver == null)
	//* 153  296:goto            40
			contentresolver = null;
	//  154  299:aconst_null     
	//  155  300:astore_0        
		com/google/android/gms/internal/measurement/zzru;
		JVM INSTR monitorexit ;
		return ((String) (contentresolver));
		com/google/android/gms/internal/measurement/zzru;
		JVM INSTR monitorexit ;
		return null;
		com/google/android/gms/internal/measurement/zzru;
		JVM INSTR monitorexit ;
		cursor = contentresolver.query(CONTENT_URI, ((String []) (null)), ((String) (null)), new String[] {
			s
		}, ((String) (null)));
		if(cursor == null)
		{
			if(cursor != null)
				cursor.close();
			return null;
		}
		if(cursor.moveToFirst())
			break MISSING_BLOCK_LABEL_216;
		zza(obj, s, ((String) (null)));
		if(cursor != null)
			cursor.close();
		return null;
		s1 = cursor.getString(1);
		contentresolver = ((ContentResolver) (s1));
		if(s1 == null)
			break MISSING_BLOCK_LABEL_243;
		contentresolver = ((ContentResolver) (s1));
		if(s1.equals(((Object) (null))))
			contentresolver = null;
		zza(obj, s, ((String) (contentresolver)));
		if(contentresolver == null)
			contentresolver = null;
		if(cursor != null)
			cursor.close();
		return ((String) (contentresolver));
		contentresolver;
		if(cursor != null)
			cursor.close();
		throw contentresolver;
		contentresolver;
		com/google/android/gms/internal/measurement/zzru;
		JVM INSTR monitorexit ;
		throw contentresolver;
	//* 156  301:goto            133
		i++;
	//  157  304:iload_3         
	//  158  305:iconst_1        
	//  159  306:iadd            
	//  160  307:istore_3        
		if(true) goto _L2; else goto _L1
	//  161  308:goto            55
_L1:
	}

	private static transient Map zza(ContentResolver contentresolver, String as[])
	{
		contentresolver = ((ContentResolver) (contentresolver.query(zzbqn, ((String []) (null)), ((String) (null)), as, ((String) (null)))));
	//    0    0:aload_0         
	//    1    1:getstatic       #45  <Field Uri zzbqn>
	//    2    4:aconst_null     
	//    3    5:aconst_null     
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:invokevirtual   #123 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//    7   11:astore_0        
		as = ((String []) (new TreeMap()));
	//    8   12:new             #143 <Class TreeMap>
	//    9   15:dup             
	//   10   16:invokespecial   #144 <Method void TreeMap()>
	//   11   19:astore_1        
		if(contentresolver == null)
	//*  12   20:aload_0         
	//*  13   21:ifnonnull       26
			return ((Map) (as));
	//   14   24:aload_1         
	//   15   25:areturn         
		for(; ((Cursor) (contentresolver)).moveToNext(); ((TreeMap) (as)).put(((Object) (((Cursor) (contentresolver)).getString(0))), ((Object) (((Cursor) (contentresolver)).getString(1)))));
	//   16   26:aload_0         
	//   17   27:invokeinterface #147 <Method boolean Cursor.moveToNext()>
	//   18   32:ifeq            57
	//   19   35:aload_1         
	//   20   36:aload_0         
	//   21   37:iconst_0        
	//   22   38:invokeinterface #138 <Method String Cursor.getString(int)>
	//   23   43:aload_0         
	//   24   44:iconst_1        
	//   25   45:invokeinterface #138 <Method String Cursor.getString(int)>
	//   26   50:invokevirtual   #151 <Method Object TreeMap.put(Object, Object)>
	//   27   53:pop             
	//*  28   54:goto            26
		((Cursor) (contentresolver)).close();
	//   29   57:aload_0         
	//   30   58:invokeinterface #128 <Method void Cursor.close()>
		return ((Map) (as));
	//   31   63:aload_1         
	//   32   64:areturn         
		as;
	//   33   65:astore_1        
		((Cursor) (contentresolver)).close();
	//   34   66:aload_0         
	//   35   67:invokeinterface #128 <Method void Cursor.close()>
		throw as;
	//   36   72:aload_1         
	//   37   73:athrow          
	}

	private static void zza(ContentResolver contentresolver)
	{
		if(zzbqr == null)
	//*   0    0:getstatic       #92  <Field HashMap zzbqr>
	//*   1    3:ifnonnull       54
		{
			zzbqq.set(false);
	//    2    6:getstatic       #66  <Field AtomicBoolean zzbqq>
	//    3    9:iconst_0        
	//    4   10:invokevirtual   #157 <Method void AtomicBoolean.set(boolean)>
			zzbqr = new HashMap();
	//    5   13:new             #68  <Class HashMap>
	//    6   16:dup             
	//    7   17:invokespecial   #69  <Method void HashMap()>
	//    8   20:putstatic       #92  <Field HashMap zzbqr>
			zzbqw = new Object();
	//    9   23:new             #4   <Class Object>
	//   10   26:dup             
	//   11   27:invokespecial   #83  <Method void Object()>
	//   12   30:putstatic       #90  <Field Object zzbqw>
			zzbqx = false;
	//   13   33:iconst_0        
	//   14   34:putstatic       #106 <Field boolean zzbqx>
			contentresolver.registerContentObserver(CONTENT_URI, true, ((android.database.ContentObserver) (new zzrv(((android.os.Handler) (null))))));
	//   15   37:aload_0         
	//   16   38:getstatic       #41  <Field Uri CONTENT_URI>
	//   17   41:iconst_1        
	//   18   42:new             #159 <Class zzrv>
	//   19   45:dup             
	//   20   46:aconst_null     
	//   21   47:invokespecial   #162 <Method void zzrv(android.os.Handler)>
	//   22   50:invokevirtual   #166 <Method void ContentResolver.registerContentObserver(Uri, boolean, android.database.ContentObserver)>
			return;
	//   23   53:return          
		}
		if(zzbqq.getAndSet(false))
	//*  24   54:getstatic       #66  <Field AtomicBoolean zzbqq>
	//*  25   57:iconst_0        
	//*  26   58:invokevirtual   #170 <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*  27   61:ifeq            108
		{
			zzbqr.clear();
	//   28   64:getstatic       #92  <Field HashMap zzbqr>
	//   29   67:invokevirtual   #173 <Method void HashMap.clear()>
			zzbqs.clear();
	//   30   70:getstatic       #71  <Field HashMap zzbqs>
	//   31   73:invokevirtual   #173 <Method void HashMap.clear()>
			zzbqt.clear();
	//   32   76:getstatic       #73  <Field HashMap zzbqt>
	//   33   79:invokevirtual   #173 <Method void HashMap.clear()>
			zzbqu.clear();
	//   34   82:getstatic       #75  <Field HashMap zzbqu>
	//   35   85:invokevirtual   #173 <Method void HashMap.clear()>
			zzbqv.clear();
	//   36   88:getstatic       #77  <Field HashMap zzbqv>
	//   37   91:invokevirtual   #173 <Method void HashMap.clear()>
			zzbqw = new Object();
	//   38   94:new             #4   <Class Object>
	//   39   97:dup             
	//   40   98:invokespecial   #83  <Method void Object()>
	//   41  101:putstatic       #90  <Field Object zzbqw>
			zzbqx = false;
	//   42  104:iconst_0        
	//   43  105:putstatic       #106 <Field boolean zzbqx>
		}
	//   44  108:return          
	}

	private static void zza(Object obj, String s, String s1)
	{
		com/google/android/gms/internal/measurement/zzru;
	//    0    0:ldc1            #2   <Class zzru>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(obj == zzbqw)
	//*   2    3:aload_0         
	//*   3    4:getstatic       #90  <Field Object zzbqw>
	//*   4    7:if_acmpne       19
			zzbqr.put(((Object) (s)), ((Object) (s1)));
	//    5   10:getstatic       #92  <Field HashMap zzbqr>
	//    6   13:aload_1         
	//    7   14:aload_2         
	//    8   15:invokevirtual   #174 <Method Object HashMap.put(Object, Object)>
	//    9   18:pop             
		com/google/android/gms/internal/measurement/zzru;
	//   10   19:ldc1            #2   <Class zzru>
		JVM INSTR monitorexit ;
	//   11   21:monitorexit     
		return;
	//   12   22:return          
		obj;
	//   13   23:astore_0        
		com/google/android/gms/internal/measurement/zzru;
	//   14   24:ldc1            #2   <Class zzru>
		JVM INSTR monitorexit ;
	//   15   26:monitorexit     
		throw obj;
	//   16   27:aload_0         
	//   17   28:athrow          
	}

	static AtomicBoolean zzti()
	{
		return zzbqq;
	//    0    0:getstatic       #66  <Field AtomicBoolean zzbqq>
	//    1    3:areturn         
	}

	public static final Uri CONTENT_URI = Uri.parse("content://com.google.android.gsf.gservices");
	private static final Uri zzbqn = Uri.parse("content://com.google.android.gsf.gservices/prefix");
	public static final Pattern zzbqo = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
	public static final Pattern zzbqp = Pattern.compile("^(0|false|f|off|no|n)$", 2);
	private static final AtomicBoolean zzbqq = new AtomicBoolean();
	private static HashMap zzbqr;
	private static final HashMap zzbqs = new HashMap();
	private static final HashMap zzbqt = new HashMap();
	private static final HashMap zzbqu = new HashMap();
	private static final HashMap zzbqv = new HashMap();
	private static Object zzbqw;
	private static boolean zzbqx;
	private static String zzbqy[] = new String[0];

	static 
	{
	//    0    0:ldc1            #33  <String "content://com.google.android.gsf.gservices">
	//    1    2:invokestatic    #39  <Method Uri Uri.parse(String)>
	//    2    5:putstatic       #41  <Field Uri CONTENT_URI>
	//    3    8:ldc1            #43  <String "content://com.google.android.gsf.gservices/prefix">
	//    4   10:invokestatic    #39  <Method Uri Uri.parse(String)>
	//    5   13:putstatic       #45  <Field Uri zzbqn>
	//    6   16:ldc1            #47  <String "^(1|true|t|on|yes|y)$">
	//    7   18:iconst_2        
	//    8   19:invokestatic    #53  <Method Pattern Pattern.compile(String, int)>
	//    9   22:putstatic       #55  <Field Pattern zzbqo>
	//   10   25:ldc1            #57  <String "^(0|false|f|off|no|n)$">
	//   11   27:iconst_2        
	//   12   28:invokestatic    #53  <Method Pattern Pattern.compile(String, int)>
	//   13   31:putstatic       #59  <Field Pattern zzbqp>
	//   14   34:new             #61  <Class AtomicBoolean>
	//   15   37:dup             
	//   16   38:invokespecial   #64  <Method void AtomicBoolean()>
	//   17   41:putstatic       #66  <Field AtomicBoolean zzbqq>
	//   18   44:new             #68  <Class HashMap>
	//   19   47:dup             
	//   20   48:invokespecial   #69  <Method void HashMap()>
	//   21   51:putstatic       #71  <Field HashMap zzbqs>
	//   22   54:new             #68  <Class HashMap>
	//   23   57:dup             
	//   24   58:invokespecial   #69  <Method void HashMap()>
	//   25   61:putstatic       #73  <Field HashMap zzbqt>
	//   26   64:new             #68  <Class HashMap>
	//   27   67:dup             
	//   28   68:invokespecial   #69  <Method void HashMap()>
	//   29   71:putstatic       #75  <Field HashMap zzbqu>
	//   30   74:new             #68  <Class HashMap>
	//   31   77:dup             
	//   32   78:invokespecial   #69  <Method void HashMap()>
	//   33   81:putstatic       #77  <Field HashMap zzbqv>
	//   34   84:iconst_0        
	//   35   85:anewarray       String[]
	//   36   88:putstatic       #81  <Field String[] zzbqy>
	//*  37   91:return          
	}
}
