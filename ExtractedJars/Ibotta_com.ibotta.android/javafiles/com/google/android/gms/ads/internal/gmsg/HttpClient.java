// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.*;
import com.newrelic.agent.android.instrumentation.URLConnectionInstrumentation;
import java.io.BufferedOutputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.util.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.ads.internal.gmsg:
//			zzv, zzw

public class HttpClient
	implements zzv
{
	static final class zza
	{

		public final String getKey()
		{
			return mKey;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field String mKey>
		//    2    4:areturn         
		}

		public final String getValue()
		{
			return mValue;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field String mValue>
		//    2    4:areturn         
		}

		private final String mKey;
		private final String mValue;

		public zza(String s, String s1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mKey = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field String mKey>
			mValue = s1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #21  <Field String mValue>
		//    8   14:return          
		}
	}

	static final class zzb
	{

		public final String zzkv()
		{
			return zzbmm;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field String zzbmm>
		//    2    4:areturn         
		}

		public final URL zzkw()
		{
			return zzbmn;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field URL zzbmn>
		//    2    4:areturn         
		}

		public final ArrayList zzkx()
		{
			return zzbmo;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field ArrayList zzbmo>
		//    2    4:areturn         
		}

		public final String zzky()
		{
			return zzbmp;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field String zzbmp>
		//    2    4:areturn         
		}

		private final String zzbmm;
		private final URL zzbmn;
		private final ArrayList zzbmo;
		private final String zzbmp;

		zzb(String s, URL url, ArrayList arraylist, String s1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			zzbmm = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #24  <Field String zzbmm>
			zzbmn = url;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #26  <Field URL zzbmn>
			zzbmo = arraylist;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #28  <Field ArrayList zzbmo>
			zzbmp = s1;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #30  <Field String zzbmp>
		//   14   25:return          
		}
	}

	final class zzc
	{

		public final String getReason()
		{
			return zzbms;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field String zzbms>
		//    2    4:areturn         
		}

		public final boolean isSuccess()
		{
			return zzbmr;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field boolean zzbmr>
		//    2    4:ireturn         
		}

		public final zzd zzkz()
		{
			return zzbmq;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field HttpClient$zzd zzbmq>
		//    2    4:areturn         
		}

		private final zzd zzbmq;
		private final boolean zzbmr;
		private final String zzbms;

		public zzc(boolean flag, zzd zzd1, String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			zzbmr = flag;
		//    2    4:aload_0         
		//    3    5:iload_2         
		//    4    6:putfield        #22  <Field boolean zzbmr>
			zzbmq = zzd1;
		//    5    9:aload_0         
		//    6   10:aload_3         
		//    7   11:putfield        #24  <Field HttpClient$zzd zzbmq>
			zzbms = s;
		//    8   14:aload_0         
		//    9   15:aload           4
		//   10   17:putfield        #26  <Field String zzbms>
		//   11   20:return          
		}
	}

	static final class zzd
	{

		public final String getBody()
		{
			return zzbhy;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field String zzbhy>
		//    2    4:areturn         
		}

		public final int getResponseCode()
		{
			return zzbmt;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field int zzbmt>
		//    2    4:ireturn         
		}

		public final String zzkv()
		{
			return zzbmm;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field String zzbmm>
		//    2    4:areturn         
		}

		public final Iterable zzla()
		{
			return ((Iterable) (zzcf));
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field List zzcf>
		//    2    4:areturn         
		}

		private final String zzbhy;
		private final String zzbmm;
		private final int zzbmt;
		private final List zzcf;

		zzd(String s, int i, List list, String s1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			zzbmm = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #24  <Field String zzbmm>
			zzbmt = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #26  <Field int zzbmt>
			zzcf = list;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #28  <Field List zzcf>
			zzbhy = s1;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #30  <Field String zzbhy>
		//   14   25:return          
		}
	}


	public HttpClient(Context context, zzang zzang1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #34  <Field Context mContext>
		zzyf = zzang1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #36  <Field zzang zzyf>
	//    8   14:return          
	}

	private final zzc zza(zzb zzb1)
	{
		Object obj1 = ((Object) ((HttpURLConnection)URLConnectionInstrumentation.openConnection(zzb1.zzkw().openConnection())));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #44  <Method URL HttpClient$zzb.zzkw()>
	//    2    4:invokevirtual   #50  <Method java.net.URLConnection URL.openConnection()>
	//    3    7:invokestatic    #55  <Method java.net.URLConnection URLConnectionInstrumentation.openConnection(java.net.URLConnection)>
	//    4   10:checkcast       #57  <Class HttpURLConnection>
	//    5   13:astore          5
		Object obj = obj1;
	//    6   15:aload           5
	//    7   17:astore          4
		Object obj2;
		Object obj3;
		int i;
		int j;
		Object obj4;
		Iterator iterator;
		java.util.Map.Entry entry;
		Iterator iterator1;
		String s;
		try
		{
			zzbv.zzek().zza(mContext, zzyf.zzcw, false, ((HttpURLConnection) (obj1)));
	//    8   19:invokestatic    #63  <Method zzakk zzbv.zzek()>
	//    9   22:aload_0         
	//   10   23:getfield        #34  <Field Context mContext>
	//   11   26:aload_0         
	//   12   27:getfield        #36  <Field zzang zzyf>
	//   13   30:getfield        #69  <Field String zzang.zzcw>
	//   14   33:iconst_0        
	//   15   34:aload           5
	//   16   36:invokevirtual   #74  <Method void zzakk.zza(Context, String, boolean, HttpURLConnection)>
		}
	//*  17   39:aload           5
	//*  18   41:astore          4
	//*  19   43:aload_1         
	//*  20   44:invokevirtual   #78  <Method ArrayList HttpClient$zzb.zzkx()>
	//*  21   47:checkcast       #80  <Class ArrayList>
	//*  22   50:astore          6
	//*  23   52:aload           5
	//*  24   54:astore          4
	//*  25   56:aload           6
	//*  26   58:invokevirtual   #84  <Method int ArrayList.size()>
	//*  27   61:istore_3        
	//*  28   62:iconst_0        
	//*  29   63:istore_2        
	//*  30   64:iload_2         
	//*  31   65:iload_3         
	//*  32   66:icmpge          118
	//*  33   69:aload           5
	//*  34   71:astore          4
	//*  35   73:aload           6
	//*  36   75:iload_2         
	//*  37   76:invokevirtual   #88  <Method Object ArrayList.get(int)>
	//*  38   79:astore          7
	//*  39   81:iload_2         
	//*  40   82:iconst_1        
	//*  41   83:iadd            
	//*  42   84:istore_2        
	//*  43   85:aload           5
	//*  44   87:astore          4
	//*  45   89:aload           7
	//*  46   91:checkcast       #9   <Class HttpClient$zza>
	//*  47   94:astore          7
	//*  48   96:aload           5
	//*  49   98:astore          4
	//*  50  100:aload           5
	//*  51  102:aload           7
	//*  52  104:invokevirtual   #92  <Method String HttpClient$zza.getKey()>
	//*  53  107:aload           7
	//*  54  109:invokevirtual   #95  <Method String HttpClient$zza.getValue()>
	//*  55  112:invokevirtual   #99  <Method void HttpURLConnection.addRequestProperty(String, String)>
	//*  56  115:goto            64
	//*  57  118:aload           5
	//*  58  120:astore          4
	//*  59  122:aload_1         
	//*  60  123:invokevirtual   #102 <Method String HttpClient$zzb.zzky()>
	//*  61  126:invokestatic    #108 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  62  129:ifne            574
	//*  63  132:aload           5
	//*  64  134:astore          4
	//*  65  136:aload           5
	//*  66  138:iconst_1        
	//*  67  139:invokevirtual   #112 <Method void HttpURLConnection.setDoOutput(boolean)>
	//*  68  142:aload           5
	//*  69  144:astore          4
	//*  70  146:aload_1         
	//*  71  147:invokevirtual   #102 <Method String HttpClient$zzb.zzky()>
	//*  72  150:invokevirtual   #118 <Method byte[] String.getBytes()>
	//*  73  153:astore          6
	//*  74  155:aload           5
	//*  75  157:astore          4
	//*  76  159:aload           5
	//*  77  161:aload           6
	//*  78  163:arraylength     
	//*  79  164:invokevirtual   #122 <Method void HttpURLConnection.setFixedLengthStreamingMode(int)>
	//*  80  167:aload           5
	//*  81  169:astore          4
	//*  82  171:new             #124 <Class BufferedOutputStream>
	//*  83  174:dup             
	//*  84  175:aload           5
	//*  85  177:invokevirtual   #128 <Method java.io.OutputStream HttpURLConnection.getOutputStream()>
	//*  86  180:invokespecial   #131 <Method void BufferedOutputStream(java.io.OutputStream)>
	//*  87  183:astore          7
	//*  88  185:aload           5
	//*  89  187:astore          4
	//*  90  189:aload           7
	//*  91  191:aload           6
	//*  92  193:invokevirtual   #135 <Method void BufferedOutputStream.write(byte[])>
	//*  93  196:aload           5
	//*  94  198:astore          4
	//*  95  200:aload           7
	//*  96  202:invokevirtual   #138 <Method void BufferedOutputStream.close()>
	//*  97  205:goto            208
	//*  98  208:aload           5
	//*  99  210:astore          4
	//* 100  212:new             #140 <Class zzamy>
	//* 101  215:dup             
	//* 102  216:invokespecial   #141 <Method void zzamy()>
	//* 103  219:astore          7
	//* 104  221:aload           5
	//* 105  223:astore          4
	//* 106  225:aload           7
	//* 107  227:aload           5
	//* 108  229:aload           6
	//* 109  231:invokevirtual   #144 <Method void zzamy.zza(HttpURLConnection, byte[])>
	//* 110  234:aload           5
	//* 111  236:astore          4
	//* 112  238:new             #80  <Class ArrayList>
	//* 113  241:dup             
	//* 114  242:invokespecial   #145 <Method void ArrayList()>
	//* 115  245:astore          6
	//* 116  247:aload           5
	//* 117  249:astore          4
	//* 118  251:aload           5
	//* 119  253:invokevirtual   #149 <Method Map HttpURLConnection.getHeaderFields()>
	//* 120  256:ifnull          393
	//* 121  259:aload           5
	//* 122  261:astore          4
	//* 123  263:aload           5
	//* 124  265:invokevirtual   #149 <Method Map HttpURLConnection.getHeaderFields()>
	//* 125  268:invokeinterface #155 <Method Set Map.entrySet()>
	//* 126  273:invokeinterface #161 <Method Iterator Set.iterator()>
	//* 127  278:astore          8
	//* 128  280:aload           5
	//* 129  282:astore          4
	//* 130  284:aload           8
	//* 131  286:invokeinterface #167 <Method boolean Iterator.hasNext()>
	//* 132  291:ifeq            393
	//* 133  294:aload           5
	//* 134  296:astore          4
	//* 135  298:aload           8
	//* 136  300:invokeinterface #171 <Method Object Iterator.next()>
	//* 137  305:checkcast       #173 <Class java.util.Map$Entry>
	//* 138  308:astore          9
	//* 139  310:aload           5
	//* 140  312:astore          4
	//* 141  314:aload           9
	//* 142  316:invokeinterface #175 <Method Object java.util.Map$Entry.getValue()>
	//* 143  321:checkcast       #177 <Class List>
	//* 144  324:invokeinterface #178 <Method Iterator List.iterator()>
	//* 145  329:astore          10
	//* 146  331:aload           5
	//* 147  333:astore          4
	//* 148  335:aload           10
	//* 149  337:invokeinterface #167 <Method boolean Iterator.hasNext()>
	//* 150  342:ifeq            280
	//* 151  345:aload           5
	//* 152  347:astore          4
	//* 153  349:aload           10
	//* 154  351:invokeinterface #171 <Method Object Iterator.next()>
	//* 155  356:checkcast       #114 <Class String>
	//* 156  359:astore          11
	//* 157  361:aload           5
	//* 158  363:astore          4
	//* 159  365:aload           6
	//* 160  367:new             #9   <Class HttpClient$zza>
	//* 161  370:dup             
	//* 162  371:aload           9
	//* 163  373:invokeinterface #180 <Method Object java.util.Map$Entry.getKey()>
	//* 164  378:checkcast       #114 <Class String>
	//* 165  381:aload           11
	//* 166  383:invokespecial   #182 <Method void HttpClient$zza(String, String)>
	//* 167  386:invokevirtual   #186 <Method boolean ArrayList.add(Object)>
	//* 168  389:pop             
	//* 169  390:goto            331
	//* 170  393:aload           5
	//* 171  395:astore          4
	//* 172  397:aload_1         
	//* 173  398:invokevirtual   #189 <Method String HttpClient$zzb.zzkv()>
	//* 174  401:astore_1        
	//* 175  402:aload           5
	//* 176  404:astore          4
	//* 177  406:aload           5
	//* 178  408:invokevirtual   #192 <Method int HttpURLConnection.getResponseCode()>
	//* 179  411:istore_2        
	//* 180  412:aload           5
	//* 181  414:astore          4
	//* 182  416:invokestatic    #63  <Method zzakk zzbv.zzek()>
	//* 183  419:pop             
	//* 184  420:aload           5
	//* 185  422:astore          4
	//* 186  424:new             #18  <Class HttpClient$zzd>
	//* 187  427:dup             
	//* 188  428:aload_1         
	//* 189  429:iload_2         
	//* 190  430:aload           6
	//* 191  432:new             #194 <Class InputStreamReader>
	//* 192  435:dup             
	//* 193  436:aload           5
	//* 194  438:invokevirtual   #198 <Method java.io.InputStream HttpURLConnection.getInputStream()>
	//* 195  441:invokespecial   #201 <Method void InputStreamReader(java.io.InputStream)>
	//* 196  444:invokestatic    #204 <Method String zzakk.zza(InputStreamReader)>
	//* 197  447:invokespecial   #207 <Method void HttpClient$zzd(String, int, List, String)>
	//* 198  450:astore_1        
	//* 199  451:aload           5
	//* 200  453:astore          4
	//* 201  455:aload           7
	//* 202  457:aload           5
	//* 203  459:aload_1         
	//* 204  460:invokevirtual   #208 <Method int HttpClient$zzd.getResponseCode()>
	//* 205  463:invokevirtual   #211 <Method void zzamy.zza(HttpURLConnection, int)>
	//* 206  466:aload           5
	//* 207  468:astore          4
	//* 208  470:aload           7
	//* 209  472:aload_1         
	//* 210  473:invokevirtual   #214 <Method String HttpClient$zzd.getBody()>
	//* 211  476:invokevirtual   #218 <Method void zzamy.zzdg(String)>
	//* 212  479:aload           5
	//* 213  481:astore          4
	//* 214  483:new             #15  <Class HttpClient$zzc>
	//* 215  486:dup             
	//* 216  487:aload_0         
	//* 217  488:iconst_1        
	//* 218  489:aload_1         
	//* 219  490:aconst_null     
	//* 220  491:invokespecial   #221 <Method void HttpClient$zzc(HttpClient, boolean, HttpClient$zzd, String)>
	//* 221  494:astore_1        
	//* 222  495:aload           5
	//* 223  497:ifnull          505
	//* 224  500:aload           5
	//* 225  502:invokevirtual   #224 <Method void HttpURLConnection.disconnect()>
	//* 226  505:aload_1         
	//* 227  506:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 228  507:astore          4
		{
			zzb1 = ((zzb) (obj1));
	//  229  509:aload           5
	//  230  511:astore_1        
			obj2 = obj;
	//  231  512:aload           4
	//  232  514:astore          5
			break MISSING_BLOCK_LABEL_530;
	//  233  516:goto            530
		}
		obj = obj1;
		obj3 = ((Object) ((ArrayList)zzb1.zzkx()));
		obj = obj1;
		j = ((ArrayList) (obj3)).size();
		i = 0;
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
		obj = obj1;
		obj4 = ((ArrayList) (obj3)).get(i);
		i++;
		obj = obj1;
		obj4 = ((Object) ((zza)obj4));
		obj = obj1;
		((HttpURLConnection) (obj1)).addRequestProperty(((zza) (obj4)).getKey(), ((zza) (obj4)).getValue());
		if(true) goto _L2; else goto _L1
_L1:
		obj = obj1;
		if(TextUtils.isEmpty(((CharSequence) (zzb1.zzky())))) goto _L4; else goto _L3
_L3:
		obj = obj1;
		((HttpURLConnection) (obj1)).setDoOutput(true);
		obj = obj1;
		obj3 = ((Object) (zzb1.zzky().getBytes()));
		obj = obj1;
		((HttpURLConnection) (obj1)).setFixedLengthStreamingMode(obj3.length);
		obj = obj1;
		obj4 = ((Object) (new BufferedOutputStream(((HttpURLConnection) (obj1)).getOutputStream())));
		obj = obj1;
		((BufferedOutputStream) (obj4)).write(((byte []) (obj3)));
		obj = obj1;
		((BufferedOutputStream) (obj4)).close();
_L9:
		obj = obj1;
		obj4 = ((Object) (new zzamy()));
		obj = obj1;
		((zzamy) (obj4)).zza(((HttpURLConnection) (obj1)), ((byte []) (obj3)));
		obj = obj1;
		obj3 = ((Object) (new ArrayList()));
		obj = obj1;
		if(((HttpURLConnection) (obj1)).getHeaderFields() == null)
			break MISSING_BLOCK_LABEL_393;
		obj = obj1;
		iterator = ((HttpURLConnection) (obj1)).getHeaderFields().entrySet().iterator();
_L6:
		obj = obj1;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_393;
		obj = obj1;
		entry = (java.util.Map.Entry)iterator.next();
		obj = obj1;
		iterator1 = ((List)entry.getValue()).iterator();
_L7:
		obj = obj1;
		if(!iterator1.hasNext()) goto _L6; else goto _L5
_L5:
		obj = obj1;
		s = (String)iterator1.next();
		obj = obj1;
		((ArrayList) (obj3)).add(((Object) (new zza((String)entry.getKey(), s))));
		  goto _L7
		obj = obj1;
		zzb1 = ((zzb) (zzb1.zzkv()));
		obj = obj1;
		i = ((HttpURLConnection) (obj1)).getResponseCode();
		obj = obj1;
		zzbv.zzek();
		obj = obj1;
		zzb1 = ((zzb) (new zzd(((String) (zzb1)), i, ((List) (obj3)), zzakk.zza(new InputStreamReader(((HttpURLConnection) (obj1)).getInputStream())))));
		obj = obj1;
		((zzamy) (obj4)).zza(((HttpURLConnection) (obj1)), ((zzd) (zzb1)).getResponseCode());
		obj = obj1;
		((zzamy) (obj4)).zzdg(((zzd) (zzb1)).getBody());
		obj = obj1;
		zzb1 = ((zzb) (new zzc(true, ((zzd) (zzb1)), ((String) (null)))));
		if(obj1 != null)
			((HttpURLConnection) (obj1)).disconnect();
		return ((zzc) (zzb1));
		zzb1;
	//  234  519:astore_1        
		obj = null;
	//  235  520:aconst_null     
	//  236  521:astore          4
		break MISSING_BLOCK_LABEL_562;
	//  237  523:goto            562
		obj2;
	//  238  526:astore          5
		zzb1 = null;
	//  239  528:aconst_null     
	//  240  529:astore_1        
		obj = ((Object) (zzb1));
	//  241  530:aload_1         
	//  242  531:astore          4
		obj2 = ((Object) (new zzc(false, ((zzd) (null)), ((Exception) (obj2)).toString())));
	//  243  533:new             #15  <Class HttpClient$zzc>
	//  244  536:dup             
	//  245  537:aload_0         
	//  246  538:iconst_0        
	//  247  539:aconst_null     
	//  248  540:aload           5
	//  249  542:invokevirtual   #227 <Method String Exception.toString()>
	//  250  545:invokespecial   #221 <Method void HttpClient$zzc(HttpClient, boolean, HttpClient$zzd, String)>
	//  251  548:astore          5
		if(zzb1 != null)
	//* 252  550:aload_1         
	//* 253  551:ifnull          558
			((HttpURLConnection) (zzb1)).disconnect();
	//  254  554:aload_1         
	//  255  555:invokevirtual   #224 <Method void HttpURLConnection.disconnect()>
		return ((zzc) (obj2));
	//  256  558:aload           5
	//  257  560:areturn         
		zzb1;
	//  258  561:astore_1        
		if(obj != null)
	//* 259  562:aload           4
	//* 260  564:ifnull          572
			((HttpURLConnection) (obj)).disconnect();
	//  261  567:aload           4
	//  262  569:invokevirtual   #224 <Method void HttpURLConnection.disconnect()>
		throw zzb1;
	//  263  572:aload_1         
	//  264  573:athrow          
_L4:
		obj3 = null;
	//  265  574:aconst_null     
	//  266  575:astore          6
		if(true) goto _L9; else goto _L8
	//  267  577:goto            208
_L8:
	}

	private static JSONObject zza(zzd zzd1)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #232 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #233 <Method void JSONObject()>
	//    3    7:astore_1        
		JSONArray jsonarray;
		try
		{
			jsonobject.put("http_request_id", ((Object) (zzd1.zzkv())));
	//    4    8:aload_1         
	//    5    9:ldc1            #235 <String "http_request_id">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #236 <Method String HttpClient$zzd.zzkv()>
	//    8   15:invokevirtual   #240 <Method JSONObject JSONObject.put(String, Object)>
	//    9   18:pop             
			if(zzd1.getBody() != null)
	//*  10   19:aload_0         
	//*  11   20:invokevirtual   #214 <Method String HttpClient$zzd.getBody()>
	//*  12   23:ifnull          37
				jsonobject.put("body", ((Object) (zzd1.getBody())));
	//   13   26:aload_1         
	//   14   27:ldc1            #242 <String "body">
	//   15   29:aload_0         
	//   16   30:invokevirtual   #214 <Method String HttpClient$zzd.getBody()>
	//   17   33:invokevirtual   #240 <Method JSONObject JSONObject.put(String, Object)>
	//   18   36:pop             
			jsonarray = new JSONArray();
	//   19   37:new             #244 <Class JSONArray>
	//   20   40:dup             
	//   21   41:invokespecial   #245 <Method void JSONArray()>
	//   22   44:astore_2        
			zza zza1;
			for(Iterator iterator = zzd1.zzla().iterator(); iterator.hasNext(); jsonarray.put(((Object) ((new JSONObject()).put("key", ((Object) (zza1.getKey()))).put("value", ((Object) (zza1.getValue())))))))
	//*  23   45:aload_0         
	//*  24   46:invokevirtual   #249 <Method Iterable HttpClient$zzd.zzla()>
	//*  25   49:invokeinterface #252 <Method Iterator Iterable.iterator()>
	//*  26   54:astore_3        
	//*  27   55:aload_3         
	//*  28   56:invokeinterface #167 <Method boolean Iterator.hasNext()>
	//*  29   61:ifeq            111
				zza1 = (zza)iterator.next();
	//   30   64:aload_3         
	//   31   65:invokeinterface #171 <Method Object Iterator.next()>
	//   32   70:checkcast       #9   <Class HttpClient$zza>
	//   33   73:astore          4

	//   34   75:aload_2         
	//   35   76:new             #232 <Class JSONObject>
	//   36   79:dup             
	//   37   80:invokespecial   #233 <Method void JSONObject()>
	//   38   83:ldc1            #254 <String "key">
	//   39   85:aload           4
	//   40   87:invokevirtual   #92  <Method String HttpClient$zza.getKey()>
	//   41   90:invokevirtual   #240 <Method JSONObject JSONObject.put(String, Object)>
	//   42   93:ldc2            #256 <String "value">
	//   43   96:aload           4
	//   44   98:invokevirtual   #95  <Method String HttpClient$zza.getValue()>
	//   45  101:invokevirtual   #240 <Method JSONObject JSONObject.put(String, Object)>
	//   46  104:invokevirtual   #259 <Method JSONArray JSONArray.put(Object)>
	//   47  107:pop             
		}
	//*  48  108:goto            55
	//*  49  111:aload_1         
	//*  50  112:ldc2            #261 <String "headers">
	//*  51  115:aload_2         
	//*  52  116:invokevirtual   #240 <Method JSONObject JSONObject.put(String, Object)>
	//*  53  119:pop             
	//*  54  120:aload_1         
	//*  55  121:ldc2            #263 <String "response_code">
	//*  56  124:aload_0         
	//*  57  125:invokevirtual   #208 <Method int HttpClient$zzd.getResponseCode()>
	//*  58  128:invokevirtual   #266 <Method JSONObject JSONObject.put(String, int)>
	//*  59  131:pop             
	//*  60  132:aload_1         
	//*  61  133:areturn         
		// Misplaced declaration of an exception variable
		catch(zzd zzd1)
	//*  62  134:astore_0        
		{
			zzakb.zzb("Error constructing JSON for http response.", ((Throwable) (zzd1)));
	//   63  135:ldc2            #268 <String "Error constructing JSON for http response.">
	//   64  138:aload_0         
	//   65  139:invokestatic    #273 <Method void zzakb.zzb(String, Throwable)>
			return jsonobject;
	//   66  142:aload_1         
	//   67  143:areturn         
		}
		jsonobject.put("headers", ((Object) (jsonarray)));
		jsonobject.put("response_code", zzd1.getResponseCode());
		return jsonobject;
	}

	private static zzb zzc(JSONObject jsonobject)
	{
		URL url;
		Object obj;
		String s;
		String s1;
		s = jsonobject.optString("http_request_id");
	//    0    0:aload_0         
	//    1    1:ldc1            #235 <String "http_request_id">
	//    2    3:invokevirtual   #280 <Method String JSONObject.optString(String)>
	//    3    6:astore          4
		obj = ((Object) (jsonobject.optString("url")));
	//    4    8:aload_0         
	//    5    9:ldc2            #282 <String "url">
	//    6   12:invokevirtual   #280 <Method String JSONObject.optString(String)>
	//    7   15:astore_3        
		url = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		s1 = jsonobject.optString("post_body", ((String) (null)));
	//   10   18:aload_0         
	//   11   19:ldc2            #284 <String "post_body">
	//   12   22:aconst_null     
	//   13   23:invokevirtual   #287 <Method String JSONObject.optString(String, String)>
	//   14   26:astore          5
		obj = ((Object) (new URL(((String) (obj)))));
	//   15   28:new             #46  <Class URL>
	//   16   31:dup             
	//   17   32:aload_3         
	//   18   33:invokespecial   #289 <Method void URL(String)>
	//   19   36:astore_3        
		url = ((URL) (obj));
	//   20   37:aload_3         
	//   21   38:astore_2        
		break MISSING_BLOCK_LABEL_50;
	//   22   39:goto            50
		MalformedURLException malformedurlexception;
		malformedurlexception;
	//   23   42:astore_3        
		zzakb.zzb("Error constructing http request.", ((Throwable) (malformedurlexception)));
	//   24   43:ldc2            #291 <String "Error constructing http request.">
	//   25   46:aload_3         
	//   26   47:invokestatic    #273 <Method void zzakb.zzb(String, Throwable)>
		ArrayList arraylist = new ArrayList();
	//   27   50:new             #80  <Class ArrayList>
	//   28   53:dup             
	//   29   54:invokespecial   #145 <Method void ArrayList()>
	//   30   57:astore          6
		JSONArray jsonarray = jsonobject.optJSONArray("headers");
	//   31   59:aload_0         
	//   32   60:ldc2            #261 <String "headers">
	//   33   63:invokevirtual   #295 <Method JSONArray JSONObject.optJSONArray(String)>
	//   34   66:astore_3        
		jsonobject = ((JSONObject) (jsonarray));
	//   35   67:aload_3         
	//   36   68:astore_0        
		if(jsonarray == null)
	//*  37   69:aload_3         
	//*  38   70:ifnonnull       81
			jsonobject = ((JSONObject) (new JSONArray()));
	//   39   73:new             #244 <Class JSONArray>
	//   40   76:dup             
	//   41   77:invokespecial   #245 <Method void JSONArray()>
	//   42   80:astore_0        
		for(int i = 0; i < ((JSONArray) (jsonobject)).length(); i++)
	//*  43   81:iconst_0        
	//*  44   82:istore_1        
	//*  45   83:iload_1         
	//*  46   84:aload_0         
	//*  47   85:invokevirtual   #298 <Method int JSONArray.length()>
	//*  48   88:icmpge          134
		{
			JSONObject jsonobject1 = ((JSONArray) (jsonobject)).optJSONObject(i);
	//   49   91:aload_0         
	//   50   92:iload_1         
	//   51   93:invokevirtual   #302 <Method JSONObject JSONArray.optJSONObject(int)>
	//   52   96:astore_3        
			if(jsonobject1 != null)
	//*  53   97:aload_3         
	//*  54   98:ifnull          127
				arraylist.add(((Object) (new zza(jsonobject1.optString("key"), jsonobject1.optString("value")))));
	//   55  101:aload           6
	//   56  103:new             #9   <Class HttpClient$zza>
	//   57  106:dup             
	//   58  107:aload_3         
	//   59  108:ldc1            #254 <String "key">
	//   60  110:invokevirtual   #280 <Method String JSONObject.optString(String)>
	//   61  113:aload_3         
	//   62  114:ldc2            #256 <String "value">
	//   63  117:invokevirtual   #280 <Method String JSONObject.optString(String)>
	//   64  120:invokespecial   #182 <Method void HttpClient$zza(String, String)>
	//   65  123:invokevirtual   #186 <Method boolean ArrayList.add(Object)>
	//   66  126:pop             
		}

	//   67  127:iload_1         
	//   68  128:iconst_1        
	//   69  129:iadd            
	//   70  130:istore_1        
	//*  71  131:goto            83
		return new zzb(s, url, arraylist, s1);
	//   72  134:new             #12  <Class HttpClient$zzb>
	//   73  137:dup             
	//   74  138:aload           4
	//   75  140:aload_2         
	//   76  141:aload           6
	//   77  143:aload           5
	//   78  145:invokespecial   #305 <Method void HttpClient$zzb(String, URL, ArrayList, String)>
	//   79  148:areturn         
	}

	public JSONObject send(JSONObject jsonobject)
	{
		JSONObject jsonobject1 = new JSONObject();
	//    0    0:new             #232 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #233 <Method void JSONObject()>
	//    3    7:astore          4
		String s = "";
	//    4    9:ldc2            #309 <String "">
	//    5   12:astore_2        
		String s1;
		try
		{
			s1 = jsonobject.optString("http_request_id");
	//    6   13:aload_1         
	//    7   14:ldc1            #235 <String "http_request_id">
	//    8   16:invokevirtual   #280 <Method String JSONObject.optString(String)>
	//    9   19:astore_3        
		}
	//*  10   20:aload_3         
	//*  11   21:astore_2        
	//*  12   22:aload_0         
	//*  13   23:aload_1         
	//*  14   24:invokestatic    #311 <Method HttpClient$zzb zzc(JSONObject)>
	//*  15   27:invokespecial   #313 <Method HttpClient$zzc zza(HttpClient$zzb)>
	//*  16   30:astore_1        
	//*  17   31:aload_3         
	//*  18   32:astore_2        
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #316 <Method boolean HttpClient$zzc.isSuccess()>
	//*  21   37:ifeq            73
	//*  22   40:aload_3         
	//*  23   41:astore_2        
	//*  24   42:aload           4
	//*  25   44:ldc2            #318 <String "response">
	//*  26   47:aload_1         
	//*  27   48:invokevirtual   #322 <Method HttpClient$zzd HttpClient$zzc.zzkz()>
	//*  28   51:invokestatic    #324 <Method JSONObject zza(HttpClient$zzd)>
	//*  29   54:invokevirtual   #240 <Method JSONObject JSONObject.put(String, Object)>
	//*  30   57:pop             
	//*  31   58:aload_3         
	//*  32   59:astore_2        
	//*  33   60:aload           4
	//*  34   62:ldc2            #326 <String "success">
	//*  35   65:iconst_1        
	//*  36   66:invokevirtual   #329 <Method JSONObject JSONObject.put(String, boolean)>
	//*  37   69:pop             
	//*  38   70:aload           4
	//*  39   72:areturn         
	//*  40   73:aload_3         
	//*  41   74:astore_2        
	//*  42   75:aload           4
	//*  43   77:ldc2            #318 <String "response">
	//*  44   80:new             #232 <Class JSONObject>
	//*  45   83:dup             
	//*  46   84:invokespecial   #233 <Method void JSONObject()>
	//*  47   87:ldc1            #235 <String "http_request_id">
	//*  48   89:aload_3         
	//*  49   90:invokevirtual   #240 <Method JSONObject JSONObject.put(String, Object)>
	//*  50   93:invokevirtual   #240 <Method JSONObject JSONObject.put(String, Object)>
	//*  51   96:pop             
	//*  52   97:aload_3         
	//*  53   98:astore_2        
	//*  54   99:aload           4
	//*  55  101:ldc2            #326 <String "success">
	//*  56  104:iconst_0        
	//*  57  105:invokevirtual   #329 <Method JSONObject JSONObject.put(String, boolean)>
	//*  58  108:pop             
	//*  59  109:aload_3         
	//*  60  110:astore_2        
	//*  61  111:aload           4
	//*  62  113:ldc2            #331 <String "reason">
	//*  63  116:aload_1         
	//*  64  117:invokevirtual   #334 <Method String HttpClient$zzc.getReason()>
	//*  65  120:invokevirtual   #240 <Method JSONObject JSONObject.put(String, Object)>
	//*  66  123:pop             
	//*  67  124:aload           4
	//*  68  126:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*  69  127:astore_1        
		{
			zzakb.zzb("Error executing http request.", ((Throwable) (jsonobject)));
	//   70  128:ldc2            #336 <String "Error executing http request.">
	//   71  131:aload_1         
	//   72  132:invokestatic    #273 <Method void zzakb.zzb(String, Throwable)>
			try
			{
				jsonobject1.put("response", ((Object) ((new JSONObject()).put("http_request_id", ((Object) (s))))));
	//   73  135:aload           4
	//   74  137:ldc2            #318 <String "response">
	//   75  140:new             #232 <Class JSONObject>
	//   76  143:dup             
	//   77  144:invokespecial   #233 <Method void JSONObject()>
	//   78  147:ldc1            #235 <String "http_request_id">
	//   79  149:aload_2         
	//   80  150:invokevirtual   #240 <Method JSONObject JSONObject.put(String, Object)>
	//   81  153:invokevirtual   #240 <Method JSONObject JSONObject.put(String, Object)>
	//   82  156:pop             
				jsonobject1.put("success", false);
	//   83  157:aload           4
	//   84  159:ldc2            #326 <String "success">
	//   85  162:iconst_0        
	//   86  163:invokevirtual   #329 <Method JSONObject JSONObject.put(String, boolean)>
	//   87  166:pop             
				jsonobject1.put("reason", ((Object) (((Exception) (jsonobject)).toString())));
	//   88  167:aload           4
	//   89  169:ldc2            #331 <String "reason">
	//   90  172:aload_1         
	//   91  173:invokevirtual   #227 <Method String Exception.toString()>
	//   92  176:invokevirtual   #240 <Method JSONObject JSONObject.put(String, Object)>
	//   93  179:pop             
			}
	//*  94  180:aload           4
	//*  95  182:areturn         
			// Misplaced declaration of an exception variable
			catch(JSONObject jsonobject)
	//*  96  183:astore_1        
			{
				zzakb.zzb("Error executing http request.", ((Throwable) (jsonobject)));
	//   97  184:ldc2            #336 <String "Error executing http request.">
	//   98  187:aload_1         
	//   99  188:invokestatic    #273 <Method void zzakb.zzb(String, Throwable)>
				return jsonobject1;
	//  100  191:aload           4
	//  101  193:areturn         
			}
			return jsonobject1;
		}
		s = s1;
		jsonobject = ((JSONObject) (zza(zzc(jsonobject))));
		s = s1;
		if(!((zzc) (jsonobject)).isSuccess())
			break MISSING_BLOCK_LABEL_73;
		s = s1;
		jsonobject1.put("response", ((Object) (zza(((zzc) (jsonobject)).zzkz()))));
		s = s1;
		jsonobject1.put("success", true);
		return jsonobject1;
		s = s1;
		jsonobject1.put("response", ((Object) ((new JSONObject()).put("http_request_id", ((Object) (s1))))));
		s = s1;
		jsonobject1.put("success", false);
		s = s1;
		jsonobject1.put("reason", ((Object) (((zzc) (jsonobject)).getReason())));
		return jsonobject1;
	}

	public final void zza(Object obj, Map map)
	{
		zzaki.zzb(((Runnable) (new zzw(this, map, (zzue)obj))));
	//    0    0:new             #340 <Class zzw>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:checkcast       #342 <Class zzue>
	//    6   10:invokespecial   #345 <Method void zzw(HttpClient, Map, zzue)>
	//    7   13:invokestatic    #350 <Method com.google.android.gms.internal.ads.zzanz zzaki.zzb(Runnable)>
	//    8   16:pop             
	//    9   17:return          
	}

	private final Context mContext;
	private final zzang zzyf;
}
