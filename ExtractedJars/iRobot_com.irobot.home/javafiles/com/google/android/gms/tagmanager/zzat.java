// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.io.*;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzax, zzdi, zzay, zzav, 
//			zzau, zzaw, zzaq

final class zzat
	implements DataLayer.zzc
{

	public zzat(Context context)
	{
		this(context, DefaultClock.getInstance(), "google_tagmanager.db", 2000, ((Executor) (Executors.newSingleThreadExecutor())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #49  <Method Clock DefaultClock.getInstance()>
	//    3    5:ldc1            #51  <String "google_tagmanager.db">
	//    4    7:sipush          2000
	//    5   10:invokestatic    #57  <Method java.util.concurrent.ExecutorService Executors.newSingleThreadExecutor()>
	//    6   13:invokespecial   #60  <Method void zzat(Context, Clock, String, int, Executor)>
	//    7   16:return          
	}

	private zzat(Context context, Clock clock, String s, int i, Executor executor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void Object()>
		zzri = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #65  <Field Context zzri>
		zzrz = clock;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #67  <Field Clock zzrz>
		zzbbo = 2000;
	//    8   14:aload_0         
	//    9   15:sipush          2000
	//   10   18:putfield        #69  <Field int zzbbo>
		zzbbm = executor;
	//   11   21:aload_0         
	//   12   22:aload           5
	//   13   24:putfield        #71  <Field Executor zzbbm>
		zzbbn = new zzax(this, zzri, s);
	//   14   27:aload_0         
	//   15   28:new             #73  <Class zzax>
	//   16   31:dup             
	//   17   32:aload_0         
	//   18   33:aload_0         
	//   19   34:getfield        #65  <Field Context zzri>
	//   20   37:aload_3         
	//   21   38:invokespecial   #76  <Method void zzax(zzat, Context, String)>
	//   22   41:putfield        #78  <Field zzax zzbbn>
	//   23   44:return          
	}

	static List zza(zzat zzat1)
	{
		return zzat1.zzoh();
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method List zzoh()>
	//    2    4:areturn         
	}

	static void zza(zzat zzat1, String s)
	{
		zzat1.zzdk(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #90  <Method void zzdk(String)>
	//    3    5:return          
	}

	static void zza(zzat zzat1, List list, long l)
	{
		zzat1.zzb(list, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokespecial   #95  <Method void zzb(List, long)>
	//    4    6:return          
	}

	private final void zzap(long l)
	{
		SQLiteException sqliteexception;
		Object obj = ((Object) (zzdl("Error opening database for deleteOlderThan.")));
	//    0    0:aload_0         
	//    1    1:ldc1            #101 <String "Error opening database for deleteOlderThan.">
	//    2    3:invokespecial   #105 <Method SQLiteDatabase zzdl(String)>
	//    3    6:astore          4
		if(obj == null)
	//*   4    8:aload           4
	//*   5   10:ifnonnull       14
			return;
	//    6   13:return          
		try
		{
			int i = ((SQLiteDatabase) (obj)).delete("datalayer", "expires <= ?", new String[] {
				Long.toString(l)
			});
	//    7   14:aload           4
	//    8   16:ldc1            #24  <String "datalayer">
	//    9   18:ldc1            #107 <String "expires <= ?">
	//   10   20:iconst_1        
	//   11   21:anewarray       String[]
	//   12   24:dup             
	//   13   25:iconst_0        
	//   14   26:lload_1         
	//   15   27:invokestatic    #113 <Method String Long.toString(long)>
	//   16   30:aastore         
	//   17   31:invokevirtual   #119 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   18   34:istore_3        
			obj = ((Object) (new StringBuilder(33)));
	//   19   35:new             #121 <Class StringBuilder>
	//   20   38:dup             
	//   21   39:bipush          33
	//   22   41:invokespecial   #124 <Method void StringBuilder(int)>
	//   23   44:astore          4
			((StringBuilder) (obj)).append("Deleted ");
	//   24   46:aload           4
	//   25   48:ldc1            #126 <String "Deleted ">
	//   26   50:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   27   53:pop             
			((StringBuilder) (obj)).append(i);
	//   28   54:aload           4
	//   29   56:iload_3         
	//   30   57:invokevirtual   #133 <Method StringBuilder StringBuilder.append(int)>
	//   31   60:pop             
			((StringBuilder) (obj)).append(" expired items");
	//   32   61:aload           4
	//   33   63:ldc1            #135 <String " expired items">
	//   34   65:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   35   68:pop             
			zzdi.v(((StringBuilder) (obj)).toString());
	//   36   69:aload           4
	//   37   71:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   38   74:invokestatic    #143 <Method void zzdi.v(String)>
			return;
	//   39   77:return          
		}
	//*  40   78:ldc1            #145 <String "Error deleting old entries.">
	//*  41   80:invokestatic    #148 <Method void zzdi.zzab(String)>
	//*  42   83:return          
		// Misplaced declaration of an exception variable
		catch(SQLiteException sqliteexception)
		{
			zzdi.zzab("Error deleting old entries.");
		}
	//*  43   84:astore          4
	//*  44   86:goto            78
	}

	static Context zzb(zzat zzat1)
	{
		return zzat1.zzri;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Context zzri>
	//    2    4:areturn         
	}

	private final void zzb(List list, long l)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		long l1;
		l1 = zzrz.currentTimeMillis();
	//    2    2:aload_0         
	//    3    3:getfield        #67  <Field Clock zzrz>
	//    4    6:invokeinterface #155 <Method long Clock.currentTimeMillis()>
	//    5   11:lstore          5
		zzap(l1);
	//    6   13:aload_0         
	//    7   14:lload           5
	//    8   16:invokespecial   #157 <Method void zzap(long)>
		i = list.size();
	//    9   19:aload_1         
	//   10   20:invokeinterface #163 <Method int List.size()>
	//   11   25:istore          4
		i = (zzoj() - zzbbo) + i;
	//   12   27:aload_0         
	//   13   28:invokespecial   #166 <Method int zzoj()>
	//   14   31:aload_0         
	//   15   32:getfield        #69  <Field int zzbbo>
	//   16   35:isub            
	//   17   36:iload           4
	//   18   38:iadd            
	//   19   39:istore          4
		if(i <= 0) goto _L2; else goto _L1
	//   20   41:iload           4
	//   21   43:ifle            242
_L1:
		String as[];
		List list1 = zzw(i);
	//   22   46:aload_0         
	//   23   47:iload           4
	//   24   49:invokespecial   #170 <Method List zzw(int)>
	//   25   52:astore          7
		i = list1.size();
	//   26   54:aload           7
	//   27   56:invokeinterface #163 <Method int List.size()>
	//   28   61:istore          4
		StringBuilder stringbuilder = new StringBuilder(64);
	//   29   63:new             #121 <Class StringBuilder>
	//   30   66:dup             
	//   31   67:bipush          64
	//   32   69:invokespecial   #124 <Method void StringBuilder(int)>
	//   33   72:astore          8
		stringbuilder.append("DataLayer store full, deleting ");
	//   34   74:aload           8
	//   35   76:ldc1            #172 <String "DataLayer store full, deleting ">
	//   36   78:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   37   81:pop             
		stringbuilder.append(i);
	//   38   82:aload           8
	//   39   84:iload           4
	//   40   86:invokevirtual   #133 <Method StringBuilder StringBuilder.append(int)>
	//   41   89:pop             
		stringbuilder.append(" entries to make room.");
	//   42   90:aload           8
	//   43   92:ldc1            #174 <String " entries to make room.">
	//   44   94:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   45   97:pop             
		zzdi.zzdm(stringbuilder.toString());
	//   46   98:aload           8
	//   47  100:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   48  103:invokestatic    #177 <Method void zzdi.zzdm(String)>
		as = (String[])list1.toArray(((Object []) (new String[0])));
	//   49  106:aload           7
	//   50  108:iconst_0        
	//   51  109:anewarray       String[]
	//   52  112:invokeinterface #181 <Method Object[] List.toArray(Object[])>
	//   53  117:checkcast       #183 <Class String[]>
	//   54  120:astore          7
		if(as == null) goto _L2; else goto _L3
	//   55  122:aload           7
	//   56  124:ifnull          242
_L3:
		if(as.length != 0) goto _L4; else goto _L2
	//   57  127:aload           7
	//   58  129:arraylength     
	//   59  130:ifne            136
	//*  60  133:goto            242
_L4:
		SQLiteDatabase sqlitedatabase = zzdl("Error opening database for deleteEntries.");
	//   61  136:aload_0         
	//   62  137:ldc1            #185 <String "Error opening database for deleteEntries.">
	//   63  139:invokespecial   #105 <Method SQLiteDatabase zzdl(String)>
	//   64  142:astore          8
		if(sqlitedatabase == null) goto _L2; else goto _L5
	//   65  144:aload           8
	//   66  146:ifnull          242
_L5:
		String s = String.format("%s in (%s)", new Object[] {
			"ID", TextUtils.join(",", ((Iterable) (Collections.nCopies(as.length, "?"))))
		});
	//   67  149:ldc1            #187 <String "%s in (%s)">
	//   68  151:iconst_2        
	//   69  152:anewarray       Object[]
	//   70  155:dup             
	//   71  156:iconst_0        
	//   72  157:ldc1            #26  <String "ID">
	//   73  159:aastore         
	//   74  160:dup             
	//   75  161:iconst_1        
	//   76  162:ldc1            #189 <String ",">
	//   77  164:aload           7
	//   78  166:arraylength     
	//   79  167:ldc1            #191 <String "?">
	//   80  169:invokestatic    #197 <Method List Collections.nCopies(int, Object)>
	//   81  172:invokestatic    #203 <Method String TextUtils.join(CharSequence, Iterable)>
	//   82  175:aastore         
	//   83  176:invokestatic    #38  <Method String String.format(String, Object[])>
	//   84  179:astore          9
		sqlitedatabase.delete("datalayer", s, as);
	//   85  181:aload           8
	//   86  183:ldc1            #24  <String "datalayer">
	//   87  185:aload           9
	//   88  187:aload           7
	//   89  189:invokevirtual   #119 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   90  192:pop             
		  goto _L2
	//*  91  193:goto            242
_L7:
		Object obj;
		obj = ((Object) (String.valueOf(((Object) (Arrays.toString(((Object []) (as))))))));
	//   92  196:aload           7
	//   93  198:invokestatic    #208 <Method String Arrays.toString(Object[])>
	//   94  201:invokestatic    #212 <Method String String.valueOf(Object)>
	//   95  204:astore          7
		if(((String) (obj)).length() != 0)
	//*  96  206:aload           7
	//*  97  208:invokevirtual   #215 <Method int String.length()>
	//*  98  211:ifeq            226
		{
			obj = ((Object) ("Error deleting entries ".concat(((String) (obj)))));
	//   99  214:ldc1            #217 <String "Error deleting entries ">
	//  100  216:aload           7
	//  101  218:invokevirtual   #221 <Method String String.concat(String)>
	//  102  221:astore          7
			break MISSING_BLOCK_LABEL_237;
	//  103  223:goto            237
		}
		obj = ((Object) (new String("Error deleting entries ")));
	//  104  226:new             #34  <Class String>
	//  105  229:dup             
	//  106  230:ldc1            #217 <String "Error deleting entries ">
	//  107  232:invokespecial   #223 <Method void String(String)>
	//  108  235:astore          7
		zzdi.zzab(((String) (obj)));
	//  109  237:aload           7
	//  110  239:invokestatic    #148 <Method void zzdi.zzab(String)>
_L2:
		obj = ((Object) (zzdl("Error opening database for writeEntryToDatabase.")));
	//  111  242:aload_0         
	//  112  243:ldc1            #225 <String "Error opening database for writeEntryToDatabase.">
	//  113  245:invokespecial   #105 <Method SQLiteDatabase zzdl(String)>
	//  114  248:astore          7
		if(obj == null)
			break MISSING_BLOCK_LABEL_343;
	//  115  250:aload           7
	//  116  252:ifnull          343
		ContentValues contentvalues;
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((SQLiteDatabase) (obj)).insert("datalayer", ((String) (null)), contentvalues))
	//* 117  255:aload_1         
	//* 118  256:invokeinterface #229 <Method Iterator List.iterator()>
	//* 119  261:astore_1        
	//* 120  262:aload_1         
	//* 121  263:invokeinterface #235 <Method boolean Iterator.hasNext()>
	//* 122  268:ifeq            343
		{
			zzay zzay1 = (zzay)((Iterator) (list)).next();
	//  123  271:aload_1         
	//  124  272:invokeinterface #239 <Method Object Iterator.next()>
	//  125  277:checkcast       #241 <Class zzay>
	//  126  280:astore          8
			contentvalues = new ContentValues();
	//  127  282:new             #243 <Class ContentValues>
	//  128  285:dup             
	//  129  286:invokespecial   #244 <Method void ContentValues()>
	//  130  289:astore          9
			contentvalues.put("expires", Long.valueOf(l1 + l));
	//  131  291:aload           9
	//  132  293:ldc1            #32  <String "expires">
	//  133  295:lload           5
	//  134  297:lload_2         
	//  135  298:ladd            
	//  136  299:invokestatic    #247 <Method Long Long.valueOf(long)>
	//  137  302:invokevirtual   #251 <Method void ContentValues.put(String, Long)>
			contentvalues.put("key", zzay1.zzoj);
	//  138  305:aload           9
	//  139  307:ldc1            #28  <String "key">
	//  140  309:aload           8
	//  141  311:getfield        #253 <Field String zzay.zzoj>
	//  142  314:invokevirtual   #256 <Method void ContentValues.put(String, String)>
			contentvalues.put("value", zzay1.zzbbu);
	//  143  317:aload           9
	//  144  319:ldc1            #30  <String "value">
	//  145  321:aload           8
	//  146  323:getfield        #260 <Field byte[] zzay.zzbbu>
	//  147  326:invokevirtual   #263 <Method void ContentValues.put(String, byte[])>
		}

	//  148  329:aload           7
	//  149  331:ldc1            #24  <String "datalayer">
	//  150  333:aconst_null     
	//  151  334:aload           9
	//  152  336:invokevirtual   #267 <Method long SQLiteDatabase.insert(String, String, ContentValues)>
	//  153  339:pop2            
	//* 154  340:goto            262
		zzok();
	//  155  343:aload_0         
	//  156  344:invokespecial   #270 <Method void zzok()>
		this;
	//  157  347:aload_0         
		JVM INSTR monitorexit ;
	//  158  348:monitorexit     
		return;
	//  159  349:return          
		list;
	//  160  350:astore_1        
		zzok();
	//  161  351:aload_0         
	//  162  352:invokespecial   #270 <Method void zzok()>
		throw list;
	//  163  355:aload_1         
	//  164  356:athrow          
		list;
	//  165  357:astore_1        
		this;
	//  166  358:aload_0         
		JVM INSTR monitorexit ;
	//  167  359:monitorexit     
		throw list;
	//  168  360:aload_1         
	//  169  361:athrow          
		SQLiteException sqliteexception;
		sqliteexception;
	//  170  362:astore          8
		if(true) goto _L7; else goto _L6
	//  171  364:goto            196
_L6:
	}

	private static Object zzd(byte abyte0[])
	{
		byte abyte1[];
		ByteArrayInputStream bytearrayinputstream;
		bytearrayinputstream = new ByteArrayInputStream(abyte0);
	//    0    0:new             #280 <Class ByteArrayInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #283 <Method void ByteArrayInputStream(byte[])>
	//    4    8:astore_3        
		abyte1 = null;
	//    5    9:aconst_null     
	//    6   10:astore_2        
		abyte0 = ((byte []) (new ObjectInputStream(((java.io.InputStream) (bytearrayinputstream)))));
	//    7   11:new             #285 <Class ObjectInputStream>
	//    8   14:dup             
	//    9   15:aload_3         
	//   10   16:invokespecial   #288 <Method void ObjectInputStream(java.io.InputStream)>
	//   11   19:astore_0        
		Object obj = ((ObjectInputStream) (abyte0)).readObject();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #291 <Method Object ObjectInputStream.readObject()>
	//   14   24:astore_1        
		try
		{
			((ObjectInputStream) (abyte0)).close();
	//   15   25:aload_0         
	//   16   26:invokevirtual   #294 <Method void ObjectInputStream.close()>
			bytearrayinputstream.close();
	//   17   29:aload_3         
	//   18   30:invokevirtual   #295 <Method void ByteArrayInputStream.close()>
		}
	//*  19   33:aload_1         
	//*  20   34:areturn         
	//*  21   35:astore_1        
	//*  22   36:aload_0         
	//*  23   37:astore_2        
	//*  24   38:aload_1         
	//*  25   39:astore_0        
	//*  26   40:goto            44
	//*  27   43:astore_0        
	//*  28   44:aload_2         
	//*  29   45:ifnull          52
	//*  30   48:aload_2         
	//*  31   49:invokevirtual   #294 <Method void ObjectInputStream.close()>
	//*  32   52:aload_3         
	//*  33   53:invokevirtual   #295 <Method void ByteArrayInputStream.close()>
	//*  34   56:aload_0         
	//*  35   57:athrow          
	//*  36   58:aconst_null     
	//*  37   59:astore_0        
	//*  38   60:aload_0         
	//*  39   61:ifnull          68
	//*  40   64:aload_0         
	//*  41   65:invokevirtual   #294 <Method void ObjectInputStream.close()>
	//*  42   68:aload_3         
	//*  43   69:invokevirtual   #295 <Method void ByteArrayInputStream.close()>
	//*  44   72:aconst_null     
	//*  45   73:areturn         
	//*  46   74:aconst_null     
	//*  47   75:astore_0        
	//*  48   76:aload_0         
	//*  49   77:ifnull          84
	//*  50   80:aload_0         
	//*  51   81:invokevirtual   #294 <Method void ObjectInputStream.close()>
	//*  52   84:aload_3         
	//*  53   85:invokevirtual   #295 <Method void ByteArrayInputStream.close()>
	//*  54   88:aconst_null     
	//*  55   89:areturn         
	//*  56   90:astore_0        
	//*  57   91:goto            74
	//*  58   94:astore_0        
	//*  59   95:goto            58
	//*  60   98:astore_1        
	//*  61   99:goto            76
	//*  62  102:astore_1        
	//*  63  103:goto            60
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  64  106:astore_0        
		{
			return obj;
	//   65  107:aload_1         
	//   66  108:areturn         
		}
		return obj;
		obj;
		abyte1 = abyte0;
		abyte0 = ((byte []) (obj));
		break MISSING_BLOCK_LABEL_44;
		abyte0;
		if(abyte1 == null)
			break MISSING_BLOCK_LABEL_52;
		((ObjectInputStream) (abyte1)).close();
		bytearrayinputstream.close();
_L6:
		throw abyte0;
_L2:
		abyte0 = null;
_L4:
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_68;
		((ObjectInputStream) (abyte0)).close();
		bytearrayinputstream.close();
		return ((Object) (null));
_L1:
		abyte0 = null;
_L3:
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_84;
		((ObjectInputStream) (abyte0)).close();
		bytearrayinputstream.close();
		return ((Object) (null));
		abyte0;
		  goto _L1
		abyte0;
		  goto _L2
		obj;
		  goto _L3
		obj;
		  goto _L4
		IOException ioexception;
		ioexception;
	//   67  109:astore_1        
		if(true) goto _L6; else goto _L5
	//   68  110:goto            56
_L5:
		abyte0;
	//   69  113:astore_0        
		return ((Object) (null));
	//   70  114:aconst_null     
	//   71  115:areturn         
		abyte0;
	//   72  116:astore_0        
		return ((Object) (null));
	//   73  117:aconst_null     
	//   74  118:areturn         
	}

	private final void zzdk(String s)
	{
		Object obj;
		obj = ((Object) (zzdl("Error opening database for clearKeysWithPrefix.")));
	//    0    0:aload_0         
	//    1    1:ldc2            #297 <String "Error opening database for clearKeysWithPrefix.">
	//    2    4:invokespecial   #105 <Method SQLiteDatabase zzdl(String)>
	//    3    7:astore_3        
		if(obj == null)
	//*   4    8:aload_3         
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		int i = ((SQLiteDatabase) (obj)).delete("datalayer", "key = ? OR key LIKE ?", new String[] {
			s, String.valueOf(((Object) (s))).concat(".%")
		});
	//    7   13:aload_3         
	//    8   14:ldc1            #24  <String "datalayer">
	//    9   16:ldc2            #299 <String "key = ? OR key LIKE ?">
	//   10   19:iconst_2        
	//   11   20:anewarray       String[]
	//   12   23:dup             
	//   13   24:iconst_0        
	//   14   25:aload_1         
	//   15   26:aastore         
	//   16   27:dup             
	//   17   28:iconst_1        
	//   18   29:aload_1         
	//   19   30:invokestatic    #212 <Method String String.valueOf(Object)>
	//   20   33:ldc2            #301 <String ".%">
	//   21   36:invokevirtual   #221 <Method String String.concat(String)>
	//   22   39:aastore         
	//   23   40:invokevirtual   #119 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   24   43:istore_2        
		obj = ((Object) (new StringBuilder(25)));
	//   25   44:new             #121 <Class StringBuilder>
	//   26   47:dup             
	//   27   48:bipush          25
	//   28   50:invokespecial   #124 <Method void StringBuilder(int)>
	//   29   53:astore_3        
		((StringBuilder) (obj)).append("Cleared ");
	//   30   54:aload_3         
	//   31   55:ldc2            #303 <String "Cleared ">
	//   32   58:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   33   61:pop             
		((StringBuilder) (obj)).append(i);
	//   34   62:aload_3         
	//   35   63:iload_2         
	//   36   64:invokevirtual   #133 <Method StringBuilder StringBuilder.append(int)>
	//   37   67:pop             
		((StringBuilder) (obj)).append(" items");
	//   38   68:aload_3         
	//   39   69:ldc2            #305 <String " items">
	//   40   72:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   41   75:pop             
		zzdi.v(((StringBuilder) (obj)).toString());
	//   42   76:aload_3         
	//   43   77:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   44   80:invokestatic    #143 <Method void zzdi.v(String)>
		zzok();
	//   45   83:aload_0         
	//   46   84:invokespecial   #270 <Method void zzok()>
		return;
	//   47   87:return          
		s;
	//   48   88:astore_1        
		break MISSING_BLOCK_LABEL_179;
	//   49   89:goto            179
		SQLiteException sqliteexception;
		sqliteexception;
	//   50   92:astore_3        
		String s1 = String.valueOf(((Object) (sqliteexception)));
	//   51   93:aload_3         
	//   52   94:invokestatic    #212 <Method String String.valueOf(Object)>
	//   53   97:astore_3        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 44 + String.valueOf(((Object) (s1))).length());
	//   54   98:new             #121 <Class StringBuilder>
	//   55  101:dup             
	//   56  102:aload_1         
	//   57  103:invokestatic    #212 <Method String String.valueOf(Object)>
	//   58  106:invokevirtual   #215 <Method int String.length()>
	//   59  109:bipush          44
	//   60  111:iadd            
	//   61  112:aload_3         
	//   62  113:invokestatic    #212 <Method String String.valueOf(Object)>
	//   63  116:invokevirtual   #215 <Method int String.length()>
	//   64  119:iadd            
	//   65  120:invokespecial   #124 <Method void StringBuilder(int)>
	//   66  123:astore          4
		stringbuilder.append("Error deleting entries with key prefix: ");
	//   67  125:aload           4
	//   68  127:ldc2            #307 <String "Error deleting entries with key prefix: ">
	//   69  130:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   70  133:pop             
		stringbuilder.append(s);
	//   71  134:aload           4
	//   72  136:aload_1         
	//   73  137:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   74  140:pop             
		stringbuilder.append(" (");
	//   75  141:aload           4
	//   76  143:ldc2            #309 <String " (">
	//   77  146:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   78  149:pop             
		stringbuilder.append(s1);
	//   79  150:aload           4
	//   80  152:aload_3         
	//   81  153:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   82  156:pop             
		stringbuilder.append(").");
	//   83  157:aload           4
	//   84  159:ldc2            #311 <String ").">
	//   85  162:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   86  165:pop             
		zzdi.zzab(stringbuilder.toString());
	//   87  166:aload           4
	//   88  168:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   89  171:invokestatic    #148 <Method void zzdi.zzab(String)>
		zzok();
	//   90  174:aload_0         
	//   91  175:invokespecial   #270 <Method void zzok()>
		return;
	//   92  178:return          
		zzok();
	//   93  179:aload_0         
	//   94  180:invokespecial   #270 <Method void zzok()>
		throw s;
	//   95  183:aload_1         
	//   96  184:athrow          
	}

	private final SQLiteDatabase zzdl(String s)
	{
		SQLiteException sqliteexception;
		SQLiteDatabase sqlitedatabase;
		try
		{
			sqlitedatabase = zzbbn.getWritableDatabase();
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field zzax zzbbn>
	//    2    4:invokevirtual   #315 <Method SQLiteDatabase zzax.getWritableDatabase()>
	//    3    7:astore_2        
		}
	//*   4    8:aload_2         
	//*   5    9:areturn         
	//*   6   10:aload_1         
	//*   7   11:invokestatic    #148 <Method void zzdi.zzab(String)>
	//*   8   14:aconst_null     
	//*   9   15:areturn         
		// Misplaced declaration of an exception variable
		catch(SQLiteException sqliteexception)
		{
			zzdi.zzab(s);
			return null;
		}
		return sqlitedatabase;
	//*  10   16:astore_2        
	//*  11   17:goto            10
	}

	private static byte[] zzg(Object obj)
	{
		Object obj1;
		ByteArrayOutputStream bytearrayoutputstream;
		bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #319 <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #320 <Method void ByteArrayOutputStream()>
	//    3    7:astore_3        
		obj1 = null;
	//    4    8:aconst_null     
	//    5    9:astore_2        
		ObjectOutputStream objectoutputstream = new ObjectOutputStream(((java.io.OutputStream) (bytearrayoutputstream)));
	//    6   10:new             #322 <Class ObjectOutputStream>
	//    7   13:dup             
	//    8   14:aload_3         
	//    9   15:invokespecial   #325 <Method void ObjectOutputStream(java.io.OutputStream)>
	//   10   18:astore_1        
		objectoutputstream.writeObject(obj);
	//   11   19:aload_1         
	//   12   20:aload_0         
	//   13   21:invokevirtual   #329 <Method void ObjectOutputStream.writeObject(Object)>
		obj = ((Object) (bytearrayoutputstream.toByteArray()));
	//   14   24:aload_3         
	//   15   25:invokevirtual   #333 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   16   28:astore_0        
		try
		{
			objectoutputstream.close();
	//   17   29:aload_1         
	//   18   30:invokevirtual   #334 <Method void ObjectOutputStream.close()>
			bytearrayoutputstream.close();
	//   19   33:aload_3         
	//   20   34:invokevirtual   #335 <Method void ByteArrayOutputStream.close()>
		}
	//*  21   37:aload_0         
	//*  22   38:areturn         
	//*  23   39:astore_0        
	//*  24   40:goto            46
	//*  25   43:astore_0        
	//*  26   44:aload_2         
	//*  27   45:astore_1        
	//*  28   46:aload_1         
	//*  29   47:ifnull          54
	//*  30   50:aload_1         
	//*  31   51:invokevirtual   #334 <Method void ObjectOutputStream.close()>
	//*  32   54:aload_3         
	//*  33   55:invokevirtual   #335 <Method void ByteArrayOutputStream.close()>
	//*  34   58:aload_0         
	//*  35   59:athrow          
	//*  36   60:aconst_null     
	//*  37   61:astore_1        
	//*  38   62:aload_1         
	//*  39   63:ifnull          70
	//*  40   66:aload_1         
	//*  41   67:invokevirtual   #334 <Method void ObjectOutputStream.close()>
	//*  42   70:aload_3         
	//*  43   71:invokevirtual   #335 <Method void ByteArrayOutputStream.close()>
	//*  44   74:aconst_null     
	//*  45   75:areturn         
	//*  46   76:astore_0        
	//*  47   77:goto            60
	//*  48   80:astore_0        
	//*  49   81:goto            62
		catch(IOException ioexception)
	//*  50   84:astore_1        
		{
			return ((byte []) (obj));
	//   51   85:aload_0         
	//   52   86:areturn         
		}
		return ((byte []) (obj));
		obj;
		break MISSING_BLOCK_LABEL_46;
		obj;
		objectoutputstream = ((ObjectOutputStream) (obj1));
		if(objectoutputstream == null)
			break MISSING_BLOCK_LABEL_54;
		objectoutputstream.close();
		bytearrayoutputstream.close();
_L4:
		throw obj;
_L1:
		objectoutputstream = null;
_L2:
		if(objectoutputstream == null)
			break MISSING_BLOCK_LABEL_70;
		objectoutputstream.close();
		bytearrayoutputstream.close();
		return null;
		obj;
		  goto _L1
		obj;
		  goto _L2
		IOException ioexception1;
		ioexception1;
	//   53   87:astore_1        
		if(true) goto _L4; else goto _L3
	//   54   88:goto            58
_L3:
		obj;
	//   55   91:astore_0        
		return null;
	//   56   92:aconst_null     
	//   57   93:areturn         
	}

	private final List zzoh()
	{
		ArrayList arraylist;
		zzap(zzrz.currentTimeMillis());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #67  <Field Clock zzrz>
	//    3    5:invokeinterface #155 <Method long Clock.currentTimeMillis()>
	//    4   10:invokespecial   #157 <Method void zzap(long)>
		Object obj = ((Object) (zzoi()));
	//    5   13:aload_0         
	//    6   14:invokespecial   #338 <Method List zzoi()>
	//    7   17:astore_2        
		arraylist = new ArrayList();
	//    8   18:new             #340 <Class ArrayList>
	//    9   21:dup             
	//   10   22:invokespecial   #341 <Method void ArrayList()>
	//   11   25:astore_1        
		zzay zzay1;
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((List) (arraylist)).add(((Object) (new DataLayer.zza(zzay1.zzoj, zzd(zzay1.zzbbu))))))
	//*  12   26:aload_2         
	//*  13   27:invokeinterface #229 <Method Iterator List.iterator()>
	//*  14   32:astore_2        
	//*  15   33:aload_2         
	//*  16   34:invokeinterface #235 <Method boolean Iterator.hasNext()>
	//*  17   39:ifeq            80
			zzay1 = (zzay)((Iterator) (obj)).next();
	//   18   42:aload_2         
	//   19   43:invokeinterface #239 <Method Object Iterator.next()>
	//   20   48:checkcast       #241 <Class zzay>
	//   21   51:astore_3        

	//   22   52:aload_1         
	//   23   53:new             #343 <Class DataLayer$zza>
	//   24   56:dup             
	//   25   57:aload_3         
	//   26   58:getfield        #253 <Field String zzay.zzoj>
	//   27   61:aload_3         
	//   28   62:getfield        #260 <Field byte[] zzay.zzbbu>
	//   29   65:invokestatic    #345 <Method Object zzd(byte[])>
	//   30   68:invokespecial   #348 <Method void DataLayer$zza(String, Object)>
	//   31   71:invokeinterface #352 <Method boolean List.add(Object)>
	//   32   76:pop             
	//*  33   77:goto            33
		zzok();
	//   34   80:aload_0         
	//   35   81:invokespecial   #270 <Method void zzok()>
		return ((List) (arraylist));
	//   36   84:aload_1         
	//   37   85:areturn         
		Exception exception;
		exception;
	//   38   86:astore_1        
		zzok();
	//   39   87:aload_0         
	//   40   88:invokespecial   #270 <Method void zzok()>
		throw exception;
	//   41   91:aload_1         
	//   42   92:athrow          
	}

	private final List zzoi()
	{
		ArrayList arraylist;
		Object obj;
		obj = ((Object) (zzdl("Error opening database for loadSerialized.")));
	//    0    0:aload_0         
	//    1    1:ldc2            #355 <String "Error opening database for loadSerialized.">
	//    2    4:invokespecial   #105 <Method SQLiteDatabase zzdl(String)>
	//    3    7:astore_2        
		arraylist = new ArrayList();
	//    4    8:new             #340 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #341 <Method void ArrayList()>
	//    7   15:astore_1        
		if(obj == null)
	//*   8   16:aload_2         
	//*   9   17:ifnonnull       22
			return ((List) (arraylist));
	//   10   20:aload_1         
	//   11   21:areturn         
		obj = ((Object) (((SQLiteDatabase) (obj)).query("datalayer", new String[] {
			"key", "value"
		}, ((String) (null)), ((String []) (null)), ((String) (null)), ((String) (null)), "ID", ((String) (null)))));
	//   12   22:aload_2         
	//   13   23:ldc1            #24  <String "datalayer">
	//   14   25:iconst_2        
	//   15   26:anewarray       String[]
	//   16   29:dup             
	//   17   30:iconst_0        
	//   18   31:ldc1            #28  <String "key">
	//   19   33:aastore         
	//   20   34:dup             
	//   21   35:iconst_1        
	//   22   36:ldc1            #30  <String "value">
	//   23   38:aastore         
	//   24   39:aconst_null     
	//   25   40:aconst_null     
	//   26   41:aconst_null     
	//   27   42:aconst_null     
	//   28   43:ldc1            #26  <String "ID">
	//   29   45:aconst_null     
	//   30   46:invokevirtual   #359 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String, String)>
	//   31   49:astore_2        
		while(((Cursor) (obj)).moveToNext()) 
	//*  32   50:aload_2         
	//*  33   51:invokeinterface #364 <Method boolean Cursor.moveToNext()>
	//*  34   56:ifeq            90
			((List) (arraylist)).add(((Object) (new zzay(((Cursor) (obj)).getString(0), ((Cursor) (obj)).getBlob(1)))));
	//   35   59:aload_1         
	//   36   60:new             #241 <Class zzay>
	//   37   63:dup             
	//   38   64:aload_2         
	//   39   65:iconst_0        
	//   40   66:invokeinterface #368 <Method String Cursor.getString(int)>
	//   41   71:aload_2         
	//   42   72:iconst_1        
	//   43   73:invokeinterface #372 <Method byte[] Cursor.getBlob(int)>
	//   44   78:invokespecial   #374 <Method void zzay(String, byte[])>
	//   45   81:invokeinterface #352 <Method boolean List.add(Object)>
	//   46   86:pop             
	//*  47   87:goto            50
		((Cursor) (obj)).close();
	//   48   90:aload_2         
	//   49   91:invokeinterface #375 <Method void Cursor.close()>
		return ((List) (arraylist));
	//   50   96:aload_1         
	//   51   97:areturn         
		Exception exception;
		exception;
	//   52   98:astore_1        
		((Cursor) (obj)).close();
	//   53   99:aload_2         
	//   54  100:invokeinterface #375 <Method void Cursor.close()>
		throw exception;
	//   55  105:aload_1         
	//   56  106:athrow          
	}

	private final int zzoj()
	{
		int i;
		boolean flag;
		Object obj;
		Object obj1;
		Exception exception;
		obj1 = ((Object) (zzdl("Error opening database for getNumStoredEntries.")));
	//    0    0:aload_0         
	//    1    1:ldc2            #378 <String "Error opening database for getNumStoredEntries.">
	//    2    4:invokespecial   #105 <Method SQLiteDatabase zzdl(String)>
	//    3    7:astore          7
		flag = false;
	//    4    9:iconst_0        
	//    5   10:istore_3        
		i = 0;
	//    6   11:iconst_0        
	//    7   12:istore_1        
		if(obj1 == null)
	//*   8   13:aload           7
	//*   9   15:ifnonnull       20
			return 0;
	//   10   18:iconst_0        
	//   11   19:ireturn         
		exception = null;
	//   12   20:aconst_null     
	//   13   21:astore          8
		obj = null;
	//   14   23:aconst_null     
	//   15   24:astore          6
		int j;
		long l;
		try
		{
			obj1 = ((Object) (((SQLiteDatabase) (obj1)).rawQuery("SELECT COUNT(*) from datalayer", ((String []) (null)))));
	//   16   26:aload           7
	//   17   28:ldc2            #380 <String "SELECT COUNT(*) from datalayer">
	//   18   31:aconst_null     
	//   19   32:invokevirtual   #384 <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//   20   35:astore          7
		}
	//*  21   37:aload           7
	//*  22   39:invokeinterface #387 <Method boolean Cursor.moveToFirst()>
	//*  23   44:ifeq            61
	//*  24   47:aload           7
	//*  25   49:iconst_0        
	//*  26   50:invokeinterface #391 <Method long Cursor.getLong(int)>
	//*  27   55:lstore          4
	//*  28   57:lload           4
	//*  29   59:l2i             
	//*  30   60:istore_1        
	//*  31   61:iload_1         
	//*  32   62:istore_2        
	//*  33   63:aload           7
	//*  34   65:ifnull          124
	//*  35   68:aload           7
	//*  36   70:invokeinterface #375 <Method void Cursor.close()>
	//*  37   75:iload_1         
	//*  38   76:ireturn         
	//*  39   77:astore          8
	//*  40   79:aload           7
	//*  41   81:astore          6
	//*  42   83:aload           8
	//*  43   85:astore          7
	//*  44   87:goto            126
	//*  45   90:goto            98
	//*  46   93:astore          7
	//*  47   95:goto            126
	//*  48   98:aload           7
	//*  49  100:astore          6
	//*  50  102:ldc2            #393 <String "Error getting numStoredEntries">
	//*  51  105:invokestatic    #148 <Method void zzdi.zzab(String)>
	//*  52  108:iload_3         
	//*  53  109:istore_2        
	//*  54  110:aload           7
	//*  55  112:ifnull          124
	//*  56  115:aload           7
	//*  57  117:invokeinterface #375 <Method void Cursor.close()>
	//*  58  122:iload_3         
	//*  59  123:istore_2        
	//*  60  124:iload_2         
	//*  61  125:ireturn         
	//*  62  126:aload           6
	//*  63  128:ifnull          138
	//*  64  131:aload           6
	//*  65  133:invokeinterface #375 <Method void Cursor.close()>
	//*  66  138:aload           7
	//*  67  140:athrow          
		catch(SQLiteException sqliteexception)
	//*  68  141:astore          6
		{
			obj1 = ((Object) (exception));
	//   69  143:aload           8
	//   70  145:astore          7
			continue; /* Loop/switch isn't completed */
	//   71  147:goto            98
		}
		if(!((Cursor) (obj1)).moveToFirst())
			break MISSING_BLOCK_LABEL_61;
		l = ((Cursor) (obj1)).getLong(0);
		i = (int)l;
		j = i;
		if(obj1 != null)
		{
			((Cursor) (obj1)).close();
			return i;
		}
		  goto _L1
		exception;
		obj = obj1;
		obj1 = ((Object) (exception));
		  goto _L2
		obj1;
		  goto _L2
_L4:
		obj = obj1;
		zzdi.zzab("Error getting numStoredEntries");
		j = ((int) (flag));
		if(obj1 != null)
		{
			((Cursor) (obj1)).close();
			j = ((int) (flag));
		}
_L1:
		return j;
_L2:
		if(obj != null)
			((Cursor) (obj)).close();
		throw obj1;
		SQLiteException sqliteexception1;
		sqliteexception1;
	//   72  150:astore          6
		if(true) goto _L4; else goto _L3
	//   73  152:goto            90
_L3:
	}

	private final void zzok()
	{
		try
		{
			zzbbn.close();
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field zzax zzbbn>
	//    2    4:invokevirtual   #394 <Method void zzax.close()>
			return;
	//    3    7:return          
		}
		catch(SQLiteException sqliteexception)
	//*   4    8:astore_1        
		{
			return;
	//    5    9:return          
		}
	}

	static String zzol()
	{
		return zzbbl;
	//    0    0:getstatic       #40  <Field String zzbbl>
	//    1    3:areturn         
	}

	private final List zzw(int i)
	{
		Object obj;
		Object obj1;
		Object obj2;
		Object obj4;
		ArrayList arraylist;
		arraylist = new ArrayList();
	//    0    0:new             #340 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #341 <Method void ArrayList()>
	//    3    7:astore          7
		if(i <= 0)
	//*   4    9:iload_1         
	//*   5   10:ifgt            22
		{
			zzdi.zzab("Invalid maxEntries specified. Skipping.");
	//    6   13:ldc2            #397 <String "Invalid maxEntries specified. Skipping.">
	//    7   16:invokestatic    #148 <Method void zzdi.zzab(String)>
			return ((List) (arraylist));
	//    8   19:aload           7
	//    9   21:areturn         
		}
		obj2 = ((Object) (zzdl("Error opening database for peekEntryIds.")));
	//   10   22:aload_0         
	//   11   23:ldc2            #399 <String "Error opening database for peekEntryIds.">
	//   12   26:invokespecial   #105 <Method SQLiteDatabase zzdl(String)>
	//   13   29:astore          5
		if(obj2 == null)
	//*  14   31:aload           5
	//*  15   33:ifnonnull       39
			return ((List) (arraylist));
	//   16   36:aload           7
	//   17   38:areturn         
		obj4 = null;
	//   18   39:aconst_null     
	//   19   40:astore          6
		obj1 = null;
	//   20   42:aconst_null     
	//   21   43:astore          4
		obj = obj1;
	//   22   45:aload           4
	//   23   47:astore_3        
		String s = String.format("%s ASC", new Object[] {
			"ID"
		});
	//   24   48:ldc2            #401 <String "%s ASC">
	//   25   51:iconst_1        
	//   26   52:anewarray       Object[]
	//   27   55:dup             
	//   28   56:iconst_0        
	//   29   57:ldc1            #26  <String "ID">
	//   30   59:aastore         
	//   31   60:invokestatic    #38  <Method String String.format(String, Object[])>
	//   32   63:astore          8
		obj = obj1;
	//   33   65:aload           4
	//   34   67:astore_3        
		String s1 = Integer.toString(i);
	//   35   68:iload_1         
	//   36   69:invokestatic    #405 <Method String Integer.toString(int)>
	//   37   72:astore          9
		obj = obj1;
	//   38   74:aload           4
	//   39   76:astore_3        
		obj1 = ((Object) (((SQLiteDatabase) (obj2)).query("datalayer", new String[] {
			"ID"
		}, ((String) (null)), ((String []) (null)), ((String) (null)), ((String) (null)), s, s1)));
	//   40   77:aload           5
	//   41   79:ldc1            #24  <String "datalayer">
	//   42   81:iconst_1        
	//   43   82:anewarray       String[]
	//   44   85:dup             
	//   45   86:iconst_0        
	//   46   87:ldc1            #26  <String "ID">
	//   47   89:aastore         
	//   48   90:aconst_null     
	//   49   91:aconst_null     
	//   50   92:aconst_null     
	//   51   93:aconst_null     
	//   52   94:aload           8
	//   53   96:aload           9
	//   54   98:invokevirtual   #359 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String, String)>
	//   55  101:astore          4
		boolean flag;
		if(((Cursor) (obj1)).moveToFirst())
	//*  56  103:aload           4
	//*  57  105:invokeinterface #387 <Method boolean Cursor.moveToFirst()>
	//*  58  110:ifeq            144
			do
			{
				((List) (arraylist)).add(((Object) (String.valueOf(((Cursor) (obj1)).getLong(0)))));
	//   59  113:aload           7
	//   60  115:aload           4
	//   61  117:iconst_0        
	//   62  118:invokeinterface #391 <Method long Cursor.getLong(int)>
	//   63  123:invokestatic    #407 <Method String String.valueOf(long)>
	//   64  126:invokeinterface #352 <Method boolean List.add(Object)>
	//   65  131:pop             
				flag = ((Cursor) (obj1)).moveToNext();
	//   66  132:aload           4
	//   67  134:invokeinterface #364 <Method boolean Cursor.moveToNext()>
	//   68  139:istore_2        
			} while(flag);
	//   69  140:iload_2         
	//   70  141:ifne            113
		if(obj1 != null)
	//*  71  144:aload           4
	//*  72  146:ifnull          262
		{
			((Cursor) (obj1)).close();
	//   73  149:aload           4
	//   74  151:invokeinterface #375 <Method void Cursor.close()>
			return ((List) (arraylist));
	//   75  156:aload           7
	//   76  158:areturn         
		}
		break MISSING_BLOCK_LABEL_262;
		Object obj3;
		obj3;
	//   77  159:astore          5
		obj = obj1;
	//   78  161:aload           4
	//   79  163:astore_3        
		obj1 = obj3;
	//   80  164:aload           5
	//   81  166:astore          4
		break MISSING_BLOCK_LABEL_265;
	//   82  168:goto            265
		obj3;
	//   83  171:astore          5
		break MISSING_BLOCK_LABEL_187;
	//   84  173:goto            187
		obj1;
	//   85  176:astore          4
		break MISSING_BLOCK_LABEL_265;
	//   86  178:goto            265
		obj3;
	//   87  181:astore          5
		obj1 = ((Object) (obj4));
	//   88  183:aload           6
	//   89  185:astore          4
		obj = obj1;
	//   90  187:aload           4
	//   91  189:astore_3        
		obj3 = ((Object) (String.valueOf(((Object) (((SQLiteException) (obj3)).getMessage())))));
	//   92  190:aload           5
	//   93  192:invokevirtual   #410 <Method String SQLiteException.getMessage()>
	//   94  195:invokestatic    #212 <Method String String.valueOf(Object)>
	//   95  198:astore          5
		obj = obj1;
	//   96  200:aload           4
	//   97  202:astore_3        
		if(((String) (obj3)).length() == 0)
			break MISSING_BLOCK_LABEL_227;
	//   98  203:aload           5
	//   99  205:invokevirtual   #215 <Method int String.length()>
	//  100  208:ifeq            227
		obj = obj1;
	//  101  211:aload           4
	//  102  213:astore_3        
		obj3 = ((Object) ("Error in peekEntries fetching entryIds: ".concat(((String) (obj3)))));
	//  103  214:ldc2            #412 <String "Error in peekEntries fetching entryIds: ">
	//  104  217:aload           5
	//  105  219:invokevirtual   #221 <Method String String.concat(String)>
	//  106  222:astore          5
		break MISSING_BLOCK_LABEL_242;
	//  107  224:goto            242
		obj = obj1;
	//  108  227:aload           4
	//  109  229:astore_3        
		obj3 = ((Object) (new String("Error in peekEntries fetching entryIds: ")));
	//  110  230:new             #34  <Class String>
	//  111  233:dup             
	//  112  234:ldc2            #412 <String "Error in peekEntries fetching entryIds: ">
	//  113  237:invokespecial   #223 <Method void String(String)>
	//  114  240:astore          5
		obj = obj1;
	//  115  242:aload           4
	//  116  244:astore_3        
		zzdi.zzab(((String) (obj3)));
	//  117  245:aload           5
	//  118  247:invokestatic    #148 <Method void zzdi.zzab(String)>
		if(obj1 != null)
	//* 119  250:aload           4
	//* 120  252:ifnull          262
			((Cursor) (obj1)).close();
	//  121  255:aload           4
	//  122  257:invokeinterface #375 <Method void Cursor.close()>
		return ((List) (arraylist));
	//  123  262:aload           7
	//  124  264:areturn         
		if(obj != null)
	//* 125  265:aload_3         
	//* 126  266:ifnull          275
			((Cursor) (obj)).close();
	//  127  269:aload_3         
	//  128  270:invokeinterface #375 <Method void Cursor.close()>
		throw obj1;
	//  129  275:aload           4
	//  130  277:athrow          
	}

	public final void zza(zzaq zzaq)
	{
		zzbbm.execute(((Runnable) (new zzav(this, zzaq))));
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field Executor zzbbm>
	//    2    4:new             #416 <Class zzav>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #419 <Method void zzav(zzat, zzaq)>
	//    7   13:invokeinterface #425 <Method void Executor.execute(Runnable)>
	//    8   18:return          
	}

	public final void zza(List list, long l)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #340 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #341 <Method void ArrayList()>
	//    3    7:astore          4
		DataLayer.zza zza1;
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (arraylist)).add(((Object) (new zzay(zza1.mKey, zzg(zza1.mValue))))))
	//*   4    9:aload_1         
	//*   5   10:invokeinterface #229 <Method Iterator List.iterator()>
	//*   6   15:astore_1        
	//*   7   16:aload_1         
	//*   8   17:invokeinterface #235 <Method boolean Iterator.hasNext()>
	//*   9   22:ifeq            67
			zza1 = (DataLayer.zza)((Iterator) (list)).next();
	//   10   25:aload_1         
	//   11   26:invokeinterface #239 <Method Object Iterator.next()>
	//   12   31:checkcast       #343 <Class DataLayer$zza>
	//   13   34:astore          5

	//   14   36:aload           4
	//   15   38:new             #241 <Class zzay>
	//   16   41:dup             
	//   17   42:aload           5
	//   18   44:getfield        #428 <Field String DataLayer$zza.mKey>
	//   19   47:aload           5
	//   20   49:getfield        #432 <Field Object DataLayer$zza.mValue>
	//   21   52:invokestatic    #434 <Method byte[] zzg(Object)>
	//   22   55:invokespecial   #374 <Method void zzay(String, byte[])>
	//   23   58:invokeinterface #352 <Method boolean List.add(Object)>
	//   24   63:pop             
	//*  25   64:goto            16
		zzbbm.execute(((Runnable) (new zzau(this, ((List) (arraylist)), l))));
	//   26   67:aload_0         
	//   27   68:getfield        #71  <Field Executor zzbbm>
	//   28   71:new             #436 <Class zzau>
	//   29   74:dup             
	//   30   75:aload_0         
	//   31   76:aload           4
	//   32   78:lload_2         
	//   33   79:invokespecial   #438 <Method void zzau(zzat, List, long)>
	//   34   82:invokeinterface #425 <Method void Executor.execute(Runnable)>
	//   35   87:return          
	}

	public final void zzdj(String s)
	{
		zzbbm.execute(((Runnable) (new zzaw(this, s))));
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field Executor zzbbm>
	//    2    4:new             #442 <Class zzaw>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #444 <Method void zzaw(zzat, String)>
	//    7   13:invokeinterface #425 <Method void Executor.execute(Runnable)>
	//    8   18:return          
	}

	private static final String zzbbl = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", new Object[] {
		"datalayer", "ID", "key", "value", "expires"
	});
	private final Executor zzbbm;
	private zzax zzbbn;
	private int zzbbo;
	private final Context zzri;
	private Clock zzrz;

	static 
	{
	//    0    0:ldc1            #22  <String "CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);">
	//    1    2:iconst_5        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc1            #24  <String "datalayer">
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:ldc1            #26  <String "ID">
	//   10   15:aastore         
	//   11   16:dup             
	//   12   17:iconst_2        
	//   13   18:ldc1            #28  <String "key">
	//   14   20:aastore         
	//   15   21:dup             
	//   16   22:iconst_3        
	//   17   23:ldc1            #30  <String "value">
	//   18   25:aastore         
	//   19   26:dup             
	//   20   27:iconst_4        
	//   21   28:ldc1            #32  <String "expires">
	//   22   30:aastore         
	//   23   31:invokestatic    #38  <Method String String.format(String, Object[])>
	//   24   34:putstatic       #40  <Field String zzbbl>
	//*  25   37:return          
	}
}
