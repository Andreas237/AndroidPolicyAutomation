// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zznx, zzakb, zzakk, zznr, 
//			zznk, zzkb, zzni, zzno

public final class zznn
{

	public zznn()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		zzbfz = ((BlockingQueue) (new ArrayBlockingQueue(100)));
	//    2    4:aload_0         
	//    3    5:new             #33  <Class ArrayBlockingQueue>
	//    4    8:dup             
	//    5    9:bipush          100
	//    6   11:invokespecial   #36  <Method void ArrayBlockingQueue(int)>
	//    7   14:putfield        #38  <Field BlockingQueue zzbfz>
		zzbgb = new LinkedHashMap();
	//    8   17:aload_0         
	//    9   18:new             #40  <Class LinkedHashMap>
	//   10   21:dup             
	//   11   22:invokespecial   #41  <Method void LinkedHashMap()>
	//   12   25:putfield        #43  <Field LinkedHashMap zzbgb>
		zzbgc = ((Map) (new HashMap()));
	//   13   28:aload_0         
	//   14   29:new             #45  <Class HashMap>
	//   15   32:dup             
	//   16   33:invokespecial   #46  <Method void HashMap()>
	//   17   36:putfield        #48  <Field Map zzbgc>
	//   18   39:return          
	}

	static void zza(zznn zznn1)
	{
		zznn1.zzjf();
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void zzjf()>
	//    2    4:return          
	}

	private final void zzjf()
	{
_L2:
		Object obj;
		Object obj1;
		Object obj2;
		String s;
		do
		{
			obj1 = ((Object) ((zznx)zzbfz.take()));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field BlockingQueue zzbfz>
	//    2    4:invokeinterface #64  <Method Object BlockingQueue.take()>
	//    3    9:checkcast       #66  <Class zznx>
	//    4   12:astore_2        
			obj = ((Object) (((zznx) (obj1)).zzjk()));
	//    5   13:aload_2         
	//    6   14:invokevirtual   #70  <Method String zznx.zzjk()>
	//    7   17:astore_1        
		} while(TextUtils.isEmpty(((CharSequence) (obj))));
	//    8   18:aload_1         
	//    9   19:invokestatic    #76  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   10   22:ifne            0
		obj2 = ((Object) (zza(((Map) (zzbgb)), ((zznx) (obj1)).zzjl())));
	//   11   25:aload_0         
	//   12   26:aload_0         
	//   13   27:getfield        #43  <Field LinkedHashMap zzbgb>
	//   14   30:aload_2         
	//   15   31:invokevirtual   #80  <Method Map zznx.zzjl()>
	//   16   34:invokevirtual   #83  <Method Map zza(Map, Map)>
	//   17   37:astore_3        
		obj1 = ((Object) (Uri.parse(zzbfx).buildUpon()));
	//   18   38:aload_0         
	//   19   39:getfield        #85  <Field String zzbfx>
	//   20   42:invokestatic    #91  <Method Uri Uri.parse(String)>
	//   21   45:invokevirtual   #95  <Method android.net.Uri$Builder Uri.buildUpon()>
	//   22   48:astore_2        
		java.util.Map.Entry entry;
		for(obj2 = ((Object) (((Map) (obj2)).entrySet().iterator())); ((Iterator) (obj2)).hasNext(); ((android.net.Uri.Builder) (obj1)).appendQueryParameter((String)entry.getKey(), (String)entry.getValue()))
	//*  23   49:aload_3         
	//*  24   50:invokeinterface #101 <Method Set Map.entrySet()>
	//*  25   55:invokeinterface #107 <Method Iterator Set.iterator()>
	//*  26   60:astore_3        
	//*  27   61:aload_3         
	//*  28   62:invokeinterface #113 <Method boolean Iterator.hasNext()>
	//*  29   67:ifeq            109
			entry = (java.util.Map.Entry)((Iterator) (obj2)).next();
	//   30   70:aload_3         
	//   31   71:invokeinterface #116 <Method Object Iterator.next()>
	//   32   76:checkcast       #118 <Class java.util.Map$Entry>
	//   33   79:astore          4

	//   34   81:aload_2         
	//   35   82:aload           4
	//   36   84:invokeinterface #121 <Method Object java.util.Map$Entry.getKey()>
	//   37   89:checkcast       #123 <Class String>
	//   38   92:aload           4
	//   39   94:invokeinterface #126 <Method Object java.util.Map$Entry.getValue()>
	//   40   99:checkcast       #123 <Class String>
	//   41  102:invokevirtual   #132 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   42  105:pop             
	//*  43  106:goto            61
		obj1 = ((Object) (new StringBuilder(((android.net.Uri.Builder) (obj1)).build().toString())));
	//   44  109:new             #134 <Class StringBuilder>
	//   45  112:dup             
	//   46  113:aload_2         
	//   47  114:invokevirtual   #138 <Method Uri android.net.Uri$Builder.build()>
	//   48  117:invokevirtual   #141 <Method String Uri.toString()>
	//   49  120:invokespecial   #144 <Method void StringBuilder(String)>
	//   50  123:astore_2        
		((StringBuilder) (obj1)).append("&it=");
	//   51  124:aload_2         
	//   52  125:ldc1            #146 <String "&it=">
	//   53  127:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   54  130:pop             
		((StringBuilder) (obj1)).append(((String) (obj)));
	//   55  131:aload_2         
	//   56  132:aload_1         
	//   57  133:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   58  136:pop             
		s = ((StringBuilder) (obj1)).toString();
	//   59  137:aload_2         
	//   60  138:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   61  141:astore          4
		if(!zzbgd.get())
			break MISSING_BLOCK_LABEL_276;
	//   62  143:aload_0         
	//   63  144:getfield        #153 <Field AtomicBoolean zzbgd>
	//   64  147:invokevirtual   #158 <Method boolean AtomicBoolean.get()>
	//   65  150:ifeq            276
		obj1 = ((Object) (zzbge));
	//   66  153:aload_0         
	//   67  154:getfield        #160 <Field File zzbge>
	//   68  157:astore_2        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_268;
	//   69  158:aload_2         
	//   70  159:ifnull          268
		obj2 = null;
	//   71  162:aconst_null     
	//   72  163:astore_3        
		obj = null;
	//   73  164:aconst_null     
	//   74  165:astore_1        
		obj1 = ((Object) (new FileOutputStream(((File) (obj1)), true)));
	//   75  166:new             #162 <Class FileOutputStream>
	//   76  169:dup             
	//   77  170:aload_2         
	//   78  171:iconst_1        
	//   79  172:invokespecial   #165 <Method void FileOutputStream(File, boolean)>
	//   80  175:astore_2        
		try
		{
			((FileOutputStream) (obj1)).write(s.getBytes());
	//   81  176:aload_2         
	//   82  177:aload           4
	//   83  179:invokevirtual   #169 <Method byte[] String.getBytes()>
	//   84  182:invokevirtual   #173 <Method void FileOutputStream.write(byte[])>
			((FileOutputStream) (obj1)).write(10);
	//   85  185:aload_2         
	//   86  186:bipush          10
	//   87  188:invokevirtual   #175 <Method void FileOutputStream.write(int)>
		}
	//*  88  191:aload_2         
	//*  89  192:invokevirtual   #178 <Method void FileOutputStream.close()>
	//*  90  195:goto            0
	//*  91  198:astore_3        
	//*  92  199:aload_2         
	//*  93  200:astore_1        
	//*  94  201:aload_3         
	//*  95  202:astore_2        
	//*  96  203:goto            248
		// Misplaced declaration of an exception variable
		catch(Object obj2)
	//*  97  206:astore_3        
		{
			break MISSING_BLOCK_LABEL_219;
	//   98  207:goto            219
		}
		try
		{
			((FileOutputStream) (obj1)).close();
		}
	//*  99  210:astore_2        
	//* 100  211:goto            248
	//* 101  214:astore_1        
	//* 102  215:aload_3         
	//* 103  216:astore_2        
	//* 104  217:aload_1         
	//* 105  218:astore_3        
	//* 106  219:aload_2         
	//* 107  220:astore_1        
	//* 108  221:ldc1            #180 <String "CsiReporter: Cannot write to file: sdk_csi_data.txt.">
	//* 109  223:aload_3         
	//* 110  224:invokestatic    #186 <Method void zzakb.zzc(String, Throwable)>
	//* 111  227:aload_2         
	//* 112  228:ifnull          0
	//* 113  231:aload_2         
	//* 114  232:invokevirtual   #178 <Method void FileOutputStream.close()>
	//* 115  235:goto            0
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 116  238:astore_1        
		{
			zzakb.zzc("CsiReporter: Cannot close file: sdk_csi_data.txt.", ((Throwable) (obj)));
	//  117  239:ldc1            #188 <String "CsiReporter: Cannot close file: sdk_csi_data.txt.">
	//  118  241:aload_1         
	//  119  242:invokestatic    #186 <Method void zzakb.zzc(String, Throwable)>
		}
		continue; /* Loop/switch isn't completed */
	//  120  245:goto            0
		obj2;
		obj = obj1;
		obj1 = obj2;
		break MISSING_BLOCK_LABEL_248;
		obj1;
		break MISSING_BLOCK_LABEL_248;
		obj;
		obj1 = obj2;
		obj2 = obj;
		obj = obj1;
		zzakb.zzc("CsiReporter: Cannot write to file: sdk_csi_data.txt.", ((Throwable) (obj2)));
		if(obj1 == null)
			continue; /* Loop/switch isn't completed */
		((FileOutputStream) (obj1)).close();
		continue; /* Loop/switch isn't completed */
		if(obj != null)
	//* 121  248:aload_1         
	//* 122  249:ifnull          266
			try
			{
				((FileOutputStream) (obj)).close();
	//  123  252:aload_1         
	//  124  253:invokevirtual   #178 <Method void FileOutputStream.close()>
			}
	//* 125  256:goto            266
			catch(IOException ioexception)
	//* 126  259:astore_1        
			{
				zzakb.zzc("CsiReporter: Cannot close file: sdk_csi_data.txt.", ((Throwable) (ioexception)));
	//  127  260:ldc1            #188 <String "CsiReporter: Cannot close file: sdk_csi_data.txt.">
	//  128  262:aload_1         
	//  129  263:invokestatic    #186 <Method void zzakb.zzc(String, Throwable)>
			}
		throw obj1;
	//  130  266:aload_2         
	//  131  267:athrow          
		zzakb.zzdk("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
	//  132  268:ldc1            #190 <String "CsiReporter: File doesn't exists. Cannot write CSI data to file.">
	//  133  270:invokestatic    #193 <Method void zzakb.zzdk(String)>
		continue; /* Loop/switch isn't completed */
	//  134  273:goto            0
		zzbv.zzek();
	//  135  276:invokestatic    #199 <Method zzakk zzbv.zzek()>
	//  136  279:pop             
		zzakk.zzd(mContext, zzaej, s);
	//  137  280:aload_0         
	//  138  281:getfield        #201 <Field Context mContext>
	//  139  284:aload_0         
	//  140  285:getfield        #203 <Field String zzaej>
	//  141  288:aload           4
	//  142  290:invokestatic    #209 <Method void zzakk.zzd(Context, String, String)>
		if(true) goto _L2; else goto _L1
	//  143  293:goto            0
_L1:
		InterruptedException interruptedexception;
		interruptedexception;
	//  144  296:astore_1        
		zzakb.zzc("CsiReporter:reporter interrupted", ((Throwable) (interruptedexception)));
	//  145  297:ldc1            #211 <String "CsiReporter:reporter interrupted">
	//  146  299:aload_1         
	//  147  300:invokestatic    #186 <Method void zzakb.zzc(String, Throwable)>
		return;
	//  148  303:return          
	}

	final Map zza(Map map, Map map1)
	{
		map = ((Map) (new LinkedHashMap(map)));
	//    0    0:new             #40  <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #215 <Method void LinkedHashMap(Map)>
	//    4    8:astore_1        
		if(map1 == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       15
			return map;
	//    7   13:aload_1         
	//    8   14:areturn         
		String s;
		Object obj;
		String s1;
		for(map1 = ((Map) (map1.entrySet().iterator())); ((Iterator) (map1)).hasNext(); map.put(((Object) (s)), ((Object) (zzal(s).zzd(s1, ((String) (obj)))))))
	//*   9   15:aload_2         
	//*  10   16:invokeinterface #101 <Method Set Map.entrySet()>
	//*  11   21:invokeinterface #107 <Method Iterator Set.iterator()>
	//*  12   26:astore_2        
	//*  13   27:aload_2         
	//*  14   28:invokeinterface #113 <Method boolean Iterator.hasNext()>
	//*  15   33:ifeq            105
		{
			obj = ((Object) ((java.util.Map.Entry)((Iterator) (map1)).next()));
	//   16   36:aload_2         
	//   17   37:invokeinterface #116 <Method Object Iterator.next()>
	//   18   42:checkcast       #118 <Class java.util.Map$Entry>
	//   19   45:astore          4
			s = (String)((java.util.Map.Entry) (obj)).getKey();
	//   20   47:aload           4
	//   21   49:invokeinterface #121 <Method Object java.util.Map$Entry.getKey()>
	//   22   54:checkcast       #123 <Class String>
	//   23   57:astore_3        
			obj = ((Object) ((String)((java.util.Map.Entry) (obj)).getValue()));
	//   24   58:aload           4
	//   25   60:invokeinterface #126 <Method Object java.util.Map$Entry.getValue()>
	//   26   65:checkcast       #123 <Class String>
	//   27   68:astore          4
			s1 = (String)map.get(((Object) (s)));
	//   28   70:aload_1         
	//   29   71:aload_3         
	//   30   72:invokeinterface #218 <Method Object Map.get(Object)>
	//   31   77:checkcast       #123 <Class String>
	//   32   80:astore          5
		}

	//   33   82:aload_1         
	//   34   83:aload_3         
	//   35   84:aload_0         
	//   36   85:aload_3         
	//   37   86:invokevirtual   #222 <Method zznr zzal(String)>
	//   38   89:aload           5
	//   39   91:aload           4
	//   40   93:invokevirtual   #227 <Method String zznr.zzd(String, String)>
	//   41   96:invokeinterface #231 <Method Object Map.put(Object, Object)>
	//   42  101:pop             
	//*  43  102:goto            27
		return map;
	//   44  105:aload_1         
	//   45  106:areturn         
	}

	public final void zza(Context context, String s, String s1, Map map)
	{
		mContext = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #201 <Field Context mContext>
		zzaej = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #203 <Field String zzaej>
		zzbfx = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #85  <Field String zzbfx>
		zzbgd = new AtomicBoolean(false);
	//    9   15:aload_0         
	//   10   16:new             #155 <Class AtomicBoolean>
	//   11   19:dup             
	//   12   20:iconst_0        
	//   13   21:invokespecial   #238 <Method void AtomicBoolean(boolean)>
	//   14   24:putfield        #153 <Field AtomicBoolean zzbgd>
		context = ((Context) (zzbgd));
	//   15   27:aload_0         
	//   16   28:getfield        #153 <Field AtomicBoolean zzbgd>
	//   17   31:astore_1        
		s = ((String) (zznk.zzawj));
	//   18   32:getstatic       #244 <Field zzna zznk.zzawj>
	//   19   35:astore_2        
		((AtomicBoolean) (context)).set(((Boolean)zzkb.zzik().zzd(((zzna) (s)))).booleanValue());
	//   20   36:aload_1         
	//   21   37:invokestatic    #250 <Method zzni zzkb.zzik()>
	//   22   40:aload_2         
	//   23   41:invokevirtual   #255 <Method Object zzni.zzd(zzna)>
	//   24   44:checkcast       #257 <Class Boolean>
	//   25   47:invokevirtual   #260 <Method boolean Boolean.booleanValue()>
	//   26   50:invokevirtual   #263 <Method void AtomicBoolean.set(boolean)>
		if(zzbgd.get())
	//*  27   53:aload_0         
	//*  28   54:getfield        #153 <Field AtomicBoolean zzbgd>
	//*  29   57:invokevirtual   #158 <Method boolean AtomicBoolean.get()>
	//*  30   60:ifeq            86
		{
			context = ((Context) (Environment.getExternalStorageDirectory()));
	//   31   63:invokestatic    #269 <Method File Environment.getExternalStorageDirectory()>
	//   32   66:astore_1        
			if(context != null)
	//*  33   67:aload_1         
	//*  34   68:ifnull          86
				zzbge = new File(((File) (context)), "sdk_csi_data.txt");
	//   35   71:aload_0         
	//   36   72:new             #271 <Class File>
	//   37   75:dup             
	//   38   76:aload_1         
	//   39   77:ldc2            #273 <String "sdk_csi_data.txt">
	//   40   80:invokespecial   #276 <Method void File(File, String)>
	//   41   83:putfield        #160 <Field File zzbge>
		}
		for(context = ((Context) (map.entrySet().iterator())); ((Iterator) (context)).hasNext(); zzbgb.put(((Object) ((String)((java.util.Map.Entry) (s)).getKey())), ((Object) ((String)((java.util.Map.Entry) (s)).getValue()))))
	//*  42   86:aload           4
	//*  43   88:invokeinterface #101 <Method Set Map.entrySet()>
	//*  44   93:invokeinterface #107 <Method Iterator Set.iterator()>
	//*  45   98:astore_1        
	//*  46   99:aload_1         
	//*  47  100:invokeinterface #113 <Method boolean Iterator.hasNext()>
	//*  48  105:ifeq            147
			s = ((String) ((java.util.Map.Entry)((Iterator) (context)).next()));
	//   49  108:aload_1         
	//   50  109:invokeinterface #116 <Method Object Iterator.next()>
	//   51  114:checkcast       #118 <Class java.util.Map$Entry>
	//   52  117:astore_2        

	//   53  118:aload_0         
	//   54  119:getfield        #43  <Field LinkedHashMap zzbgb>
	//   55  122:aload_2         
	//   56  123:invokeinterface #121 <Method Object java.util.Map$Entry.getKey()>
	//   57  128:checkcast       #123 <Class String>
	//   58  131:aload_2         
	//   59  132:invokeinterface #126 <Method Object java.util.Map$Entry.getValue()>
	//   60  137:checkcast       #123 <Class String>
	//   61  140:invokevirtual   #277 <Method Object LinkedHashMap.put(Object, Object)>
	//   62  143:pop             
	//*  63  144:goto            99
		zzbga = Executors.newSingleThreadExecutor();
	//   64  147:aload_0         
	//   65  148:invokestatic    #283 <Method ExecutorService Executors.newSingleThreadExecutor()>
	//   66  151:putfield        #285 <Field ExecutorService zzbga>
		zzbga.execute(((Runnable) (new zzno(this))));
	//   67  154:aload_0         
	//   68  155:getfield        #285 <Field ExecutorService zzbga>
	//   69  158:new             #287 <Class zzno>
	//   70  161:dup             
	//   71  162:aload_0         
	//   72  163:invokespecial   #289 <Method void zzno(zznn)>
	//   73  166:invokeinterface #295 <Method void ExecutorService.execute(Runnable)>
		zzbgc.put("action", ((Object) (zznr.zzbgh)));
	//   74  171:aload_0         
	//   75  172:getfield        #48  <Field Map zzbgc>
	//   76  175:ldc2            #297 <String "action">
	//   77  178:getstatic       #301 <Field zznr zznr.zzbgh>
	//   78  181:invokeinterface #231 <Method Object Map.put(Object, Object)>
	//   79  186:pop             
		zzbgc.put("ad_format", ((Object) (zznr.zzbgh)));
	//   80  187:aload_0         
	//   81  188:getfield        #48  <Field Map zzbgc>
	//   82  191:ldc2            #303 <String "ad_format">
	//   83  194:getstatic       #301 <Field zznr zznr.zzbgh>
	//   84  197:invokeinterface #231 <Method Object Map.put(Object, Object)>
	//   85  202:pop             
		zzbgc.put("e", ((Object) (zznr.zzbgi)));
	//   86  203:aload_0         
	//   87  204:getfield        #48  <Field Map zzbgc>
	//   88  207:ldc2            #305 <String "e">
	//   89  210:getstatic       #308 <Field zznr zznr.zzbgi>
	//   90  213:invokeinterface #231 <Method Object Map.put(Object, Object)>
	//   91  218:pop             
	//   92  219:return          
	}

	public final boolean zza(zznx zznx1)
	{
		return zzbfz.offer(((Object) (zznx1)));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field BlockingQueue zzbfz>
	//    2    4:aload_1         
	//    3    5:invokeinterface #314 <Method boolean BlockingQueue.offer(Object)>
	//    4   10:ireturn         
	}

	public final zznr zzal(String s)
	{
		s = ((String) ((zznr)zzbgc.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Map zzbgc>
	//    2    4:aload_1         
	//    3    5:invokeinterface #218 <Method Object Map.get(Object)>
	//    4   10:checkcast       #224 <Class zznr>
	//    5   13:astore_1        
		if(s != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          20
			return ((zznr) (s));
	//    8   18:aload_1         
	//    9   19:areturn         
		else
			return zznr.zzbgg;
	//   10   20:getstatic       #317 <Field zznr zznr.zzbgg>
	//   11   23:areturn         
	}

	public final void zzg(List list)
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          31
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #323 <Method boolean List.isEmpty()>
	//*   4   10:ifne            31
			zzbgb.put("e", ((Object) (TextUtils.join(",", ((Iterable) (list))))));
	//    5   13:aload_0         
	//    6   14:getfield        #43  <Field LinkedHashMap zzbgb>
	//    7   17:ldc2            #305 <String "e">
	//    8   20:ldc2            #325 <String ",">
	//    9   23:aload_1         
	//   10   24:invokestatic    #329 <Method String TextUtils.join(CharSequence, Iterable)>
	//   11   27:invokevirtual   #277 <Method Object LinkedHashMap.put(Object, Object)>
	//   12   30:pop             
	//   13   31:return          
	}

	private Context mContext;
	private String zzaej;
	private String zzbfx;
	private BlockingQueue zzbfz;
	private ExecutorService zzbga;
	private LinkedHashMap zzbgb;
	private Map zzbgc;
	private AtomicBoolean zzbgd;
	private File zzbge;
}
