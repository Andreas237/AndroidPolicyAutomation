// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.*;
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
	//    1    1:invokespecial   #31  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field Context mContext>
		zzyf = zzang1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #35  <Field zzang zzyf>
	//    8   14:return          
	}

	private final zzc zza(zzb zzb1)
	{
		Object obj1 = ((Object) ((HttpURLConnection)zzb1.zzkw().openConnection()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #43  <Method URL HttpClient$zzb.zzkw()>
	//    2    4:invokevirtual   #49  <Method java.net.URLConnection URL.openConnection()>
	//    3    7:checkcast       #51  <Class HttpURLConnection>
	//    4   10:astore          5
		Object obj = obj1;
	//    5   12:aload           5
	//    6   14:astore          4
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
	//    7   16:invokestatic    #57  <Method zzakk zzbv.zzek()>
	//    8   19:aload_0         
	//    9   20:getfield        #33  <Field Context mContext>
	//   10   23:aload_0         
	//   11   24:getfield        #35  <Field zzang zzyf>
	//   12   27:getfield        #63  <Field String zzang.zzcw>
	//   13   30:iconst_0        
	//   14   31:aload           5
	//   15   33:invokevirtual   #68  <Method void zzakk.zza(Context, String, boolean, HttpURLConnection)>
		}
	//*  16   36:aload           5
	//*  17   38:astore          4
	//*  18   40:aload_1         
	//*  19   41:invokevirtual   #72  <Method ArrayList HttpClient$zzb.zzkx()>
	//*  20   44:checkcast       #74  <Class ArrayList>
	//*  21   47:astore          6
	//*  22   49:aload           5
	//*  23   51:astore          4
	//*  24   53:aload           6
	//*  25   55:invokevirtual   #78  <Method int ArrayList.size()>
	//*  26   58:istore_3        
	//*  27   59:iconst_0        
	//*  28   60:istore_2        
	//*  29   61:iload_2         
	//*  30   62:iload_3         
	//*  31   63:icmpge          115
	//*  32   66:aload           5
	//*  33   68:astore          4
	//*  34   70:aload           6
	//*  35   72:iload_2         
	//*  36   73:invokevirtual   #82  <Method Object ArrayList.get(int)>
	//*  37   76:astore          7
	//*  38   78:iload_2         
	//*  39   79:iconst_1        
	//*  40   80:iadd            
	//*  41   81:istore_2        
	//*  42   82:aload           5
	//*  43   84:astore          4
	//*  44   86:aload           7
	//*  45   88:checkcast       #9   <Class HttpClient$zza>
	//*  46   91:astore          7
	//*  47   93:aload           5
	//*  48   95:astore          4
	//*  49   97:aload           5
	//*  50   99:aload           7
	//*  51  101:invokevirtual   #86  <Method String HttpClient$zza.getKey()>
	//*  52  104:aload           7
	//*  53  106:invokevirtual   #89  <Method String HttpClient$zza.getValue()>
	//*  54  109:invokevirtual   #93  <Method void HttpURLConnection.addRequestProperty(String, String)>
	//*  55  112:goto            61
	//*  56  115:aload           5
	//*  57  117:astore          4
	//*  58  119:aload_1         
	//*  59  120:invokevirtual   #96  <Method String HttpClient$zzb.zzky()>
	//*  60  123:invokestatic    #102 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  61  126:ifne            571
	//*  62  129:aload           5
	//*  63  131:astore          4
	//*  64  133:aload           5
	//*  65  135:iconst_1        
	//*  66  136:invokevirtual   #106 <Method void HttpURLConnection.setDoOutput(boolean)>
	//*  67  139:aload           5
	//*  68  141:astore          4
	//*  69  143:aload_1         
	//*  70  144:invokevirtual   #96  <Method String HttpClient$zzb.zzky()>
	//*  71  147:invokevirtual   #112 <Method byte[] String.getBytes()>
	//*  72  150:astore          6
	//*  73  152:aload           5
	//*  74  154:astore          4
	//*  75  156:aload           5
	//*  76  158:aload           6
	//*  77  160:arraylength     
	//*  78  161:invokevirtual   #116 <Method void HttpURLConnection.setFixedLengthStreamingMode(int)>
	//*  79  164:aload           5
	//*  80  166:astore          4
	//*  81  168:new             #118 <Class BufferedOutputStream>
	//*  82  171:dup             
	//*  83  172:aload           5
	//*  84  174:invokevirtual   #122 <Method java.io.OutputStream HttpURLConnection.getOutputStream()>
	//*  85  177:invokespecial   #125 <Method void BufferedOutputStream(java.io.OutputStream)>
	//*  86  180:astore          7
	//*  87  182:aload           5
	//*  88  184:astore          4
	//*  89  186:aload           7
	//*  90  188:aload           6
	//*  91  190:invokevirtual   #129 <Method void BufferedOutputStream.write(byte[])>
	//*  92  193:aload           5
	//*  93  195:astore          4
	//*  94  197:aload           7
	//*  95  199:invokevirtual   #132 <Method void BufferedOutputStream.close()>
	//*  96  202:goto            205
	//*  97  205:aload           5
	//*  98  207:astore          4
	//*  99  209:new             #134 <Class zzamy>
	//* 100  212:dup             
	//* 101  213:invokespecial   #135 <Method void zzamy()>
	//* 102  216:astore          7
	//* 103  218:aload           5
	//* 104  220:astore          4
	//* 105  222:aload           7
	//* 106  224:aload           5
	//* 107  226:aload           6
	//* 108  228:invokevirtual   #138 <Method void zzamy.zza(HttpURLConnection, byte[])>
	//* 109  231:aload           5
	//* 110  233:astore          4
	//* 111  235:new             #74  <Class ArrayList>
	//* 112  238:dup             
	//* 113  239:invokespecial   #139 <Method void ArrayList()>
	//* 114  242:astore          6
	//* 115  244:aload           5
	//* 116  246:astore          4
	//* 117  248:aload           5
	//* 118  250:invokevirtual   #143 <Method Map HttpURLConnection.getHeaderFields()>
	//* 119  253:ifnull          390
	//* 120  256:aload           5
	//* 121  258:astore          4
	//* 122  260:aload           5
	//* 123  262:invokevirtual   #143 <Method Map HttpURLConnection.getHeaderFields()>
	//* 124  265:invokeinterface #149 <Method Set Map.entrySet()>
	//* 125  270:invokeinterface #155 <Method Iterator Set.iterator()>
	//* 126  275:astore          8
	//* 127  277:aload           5
	//* 128  279:astore          4
	//* 129  281:aload           8
	//* 130  283:invokeinterface #161 <Method boolean Iterator.hasNext()>
	//* 131  288:ifeq            390
	//* 132  291:aload           5
	//* 133  293:astore          4
	//* 134  295:aload           8
	//* 135  297:invokeinterface #165 <Method Object Iterator.next()>
	//* 136  302:checkcast       #167 <Class java.util.Map$Entry>
	//* 137  305:astore          9
	//* 138  307:aload           5
	//* 139  309:astore          4
	//* 140  311:aload           9
	//* 141  313:invokeinterface #169 <Method Object java.util.Map$Entry.getValue()>
	//* 142  318:checkcast       #171 <Class List>
	//* 143  321:invokeinterface #172 <Method Iterator List.iterator()>
	//* 144  326:astore          10
	//* 145  328:aload           5
	//* 146  330:astore          4
	//* 147  332:aload           10
	//* 148  334:invokeinterface #161 <Method boolean Iterator.hasNext()>
	//* 149  339:ifeq            277
	//* 150  342:aload           5
	//* 151  344:astore          4
	//* 152  346:aload           10
	//* 153  348:invokeinterface #165 <Method Object Iterator.next()>
	//* 154  353:checkcast       #108 <Class String>
	//* 155  356:astore          11
	//* 156  358:aload           5
	//* 157  360:astore          4
	//* 158  362:aload           6
	//* 159  364:new             #9   <Class HttpClient$zza>
	//* 160  367:dup             
	//* 161  368:aload           9
	//* 162  370:invokeinterface #174 <Method Object java.util.Map$Entry.getKey()>
	//* 163  375:checkcast       #108 <Class String>
	//* 164  378:aload           11
	//* 165  380:invokespecial   #176 <Method void HttpClient$zza(String, String)>
	//* 166  383:invokevirtual   #180 <Method boolean ArrayList.add(Object)>
	//* 167  386:pop             
	//* 168  387:goto            328
	//* 169  390:aload           5
	//* 170  392:astore          4
	//* 171  394:aload_1         
	//* 172  395:invokevirtual   #183 <Method String HttpClient$zzb.zzkv()>
	//* 173  398:astore_1        
	//* 174  399:aload           5
	//* 175  401:astore          4
	//* 176  403:aload           5
	//* 177  405:invokevirtual   #186 <Method int HttpURLConnection.getResponseCode()>
	//* 178  408:istore_2        
	//* 179  409:aload           5
	//* 180  411:astore          4
	//* 181  413:invokestatic    #57  <Method zzakk zzbv.zzek()>
	//* 182  416:pop             
	//* 183  417:aload           5
	//* 184  419:astore          4
	//* 185  421:new             #18  <Class HttpClient$zzd>
	//* 186  424:dup             
	//* 187  425:aload_1         
	//* 188  426:iload_2         
	//* 189  427:aload           6
	//* 190  429:new             #188 <Class InputStreamReader>
	//* 191  432:dup             
	//* 192  433:aload           5
	//* 193  435:invokevirtual   #192 <Method java.io.InputStream HttpURLConnection.getInputStream()>
	//* 194  438:invokespecial   #195 <Method void InputStreamReader(java.io.InputStream)>
	//* 195  441:invokestatic    #198 <Method String zzakk.zza(InputStreamReader)>
	//* 196  444:invokespecial   #201 <Method void HttpClient$zzd(String, int, List, String)>
	//* 197  447:astore_1        
	//* 198  448:aload           5
	//* 199  450:astore          4
	//* 200  452:aload           7
	//* 201  454:aload           5
	//* 202  456:aload_1         
	//* 203  457:invokevirtual   #202 <Method int HttpClient$zzd.getResponseCode()>
	//* 204  460:invokevirtual   #205 <Method void zzamy.zza(HttpURLConnection, int)>
	//* 205  463:aload           5
	//* 206  465:astore          4
	//* 207  467:aload           7
	//* 208  469:aload_1         
	//* 209  470:invokevirtual   #208 <Method String HttpClient$zzd.getBody()>
	//* 210  473:invokevirtual   #212 <Method void zzamy.zzdg(String)>
	//* 211  476:aload           5
	//* 212  478:astore          4
	//* 213  480:new             #15  <Class HttpClient$zzc>
	//* 214  483:dup             
	//* 215  484:aload_0         
	//* 216  485:iconst_1        
	//* 217  486:aload_1         
	//* 218  487:aconst_null     
	//* 219  488:invokespecial   #215 <Method void HttpClient$zzc(HttpClient, boolean, HttpClient$zzd, String)>
	//* 220  491:astore_1        
	//* 221  492:aload           5
	//* 222  494:ifnull          502
	//* 223  497:aload           5
	//* 224  499:invokevirtual   #218 <Method void HttpURLConnection.disconnect()>
	//* 225  502:aload_1         
	//* 226  503:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 227  504:astore          4
		{
			zzb1 = ((zzb) (obj1));
	//  228  506:aload           5
	//  229  508:astore_1        
			obj2 = obj;
	//  230  509:aload           4
	//  231  511:astore          5
			break MISSING_BLOCK_LABEL_527;
	//  232  513:goto            527
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
			break MISSING_BLOCK_LABEL_390;
		obj = obj1;
		iterator = ((HttpURLConnection) (obj1)).getHeaderFields().entrySet().iterator();
_L6:
		obj = obj1;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_390;
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
	//  233  516:astore_1        
		obj = null;
	//  234  517:aconst_null     
	//  235  518:astore          4
		break MISSING_BLOCK_LABEL_559;
	//  236  520:goto            559
		obj2;
	//  237  523:astore          5
		zzb1 = null;
	//  238  525:aconst_null     
	//  239  526:astore_1        
		obj = ((Object) (zzb1));
	//  240  527:aload_1         
	//  241  528:astore          4
		obj2 = ((Object) (new zzc(false, ((zzd) (null)), ((Exception) (obj2)).toString())));
	//  242  530:new             #15  <Class HttpClient$zzc>
	//  243  533:dup             
	//  244  534:aload_0         
	//  245  535:iconst_0        
	//  246  536:aconst_null     
	//  247  537:aload           5
	//  248  539:invokevirtual   #221 <Method String Exception.toString()>
	//  249  542:invokespecial   #215 <Method void HttpClient$zzc(HttpClient, boolean, HttpClient$zzd, String)>
	//  250  545:astore          5
		if(zzb1 != null)
	//* 251  547:aload_1         
	//* 252  548:ifnull          555
			((HttpURLConnection) (zzb1)).disconnect();
	//  253  551:aload_1         
	//  254  552:invokevirtual   #218 <Method void HttpURLConnection.disconnect()>
		return ((zzc) (obj2));
	//  255  555:aload           5
	//  256  557:areturn         
		zzb1;
	//  257  558:astore_1        
		if(obj != null)
	//* 258  559:aload           4
	//* 259  561:ifnull          569
			((HttpURLConnection) (obj)).disconnect();
	//  260  564:aload           4
	//  261  566:invokevirtual   #218 <Method void HttpURLConnection.disconnect()>
		throw zzb1;
	//  262  569:aload_1         
	//  263  570:athrow          
_L4:
		obj3 = null;
	//  264  571:aconst_null     
	//  265  572:astore          6
		if(true) goto _L9; else goto _L8
	//  266  574:goto            205
_L8:
	}

	private static JSONObject zza(zzd zzd1)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #226 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #227 <Method void JSONObject()>
	//    3    7:astore_1        
		JSONArray jsonarray;
		try
		{
			jsonobject.put("http_request_id", ((Object) (zzd1.zzkv())));
	//    4    8:aload_1         
	//    5    9:ldc1            #229 <String "http_request_id">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #230 <Method String HttpClient$zzd.zzkv()>
	//    8   15:invokevirtual   #234 <Method JSONObject JSONObject.put(String, Object)>
	//    9   18:pop             
			if(zzd1.getBody() != null)
	//*  10   19:aload_0         
	//*  11   20:invokevirtual   #208 <Method String HttpClient$zzd.getBody()>
	//*  12   23:ifnull          37
				jsonobject.put("body", ((Object) (zzd1.getBody())));
	//   13   26:aload_1         
	//   14   27:ldc1            #236 <String "body">
	//   15   29:aload_0         
	//   16   30:invokevirtual   #208 <Method String HttpClient$zzd.getBody()>
	//   17   33:invokevirtual   #234 <Method JSONObject JSONObject.put(String, Object)>
	//   18   36:pop             
			jsonarray = new JSONArray();
	//   19   37:new             #238 <Class JSONArray>
	//   20   40:dup             
	//   21   41:invokespecial   #239 <Method void JSONArray()>
	//   22   44:astore_2        
			zza zza1;
			for(Iterator iterator = zzd1.zzla().iterator(); iterator.hasNext(); jsonarray.put(((Object) ((new JSONObject()).put("key", ((Object) (zza1.getKey()))).put("value", ((Object) (zza1.getValue())))))))
	//*  23   45:aload_0         
	//*  24   46:invokevirtual   #243 <Method Iterable HttpClient$zzd.zzla()>
	//*  25   49:invokeinterface #246 <Method Iterator Iterable.iterator()>
	//*  26   54:astore_3        
	//*  27   55:aload_3         
	//*  28   56:invokeinterface #161 <Method boolean Iterator.hasNext()>
	//*  29   61:ifeq            110
				zza1 = (zza)iterator.next();
	//   30   64:aload_3         
	//   31   65:invokeinterface #165 <Method Object Iterator.next()>
	//   32   70:checkcast       #9   <Class HttpClient$zza>
	//   33   73:astore          4

	//   34   75:aload_2         
	//   35   76:new             #226 <Class JSONObject>
	//   36   79:dup             
	//   37   80:invokespecial   #227 <Method void JSONObject()>
	//   38   83:ldc1            #248 <String "key">
	//   39   85:aload           4
	//   40   87:invokevirtual   #86  <Method String HttpClient$zza.getKey()>
	//   41   90:invokevirtual   #234 <Method JSONObject JSONObject.put(String, Object)>
	//   42   93:ldc1            #250 <String "value">
	//   43   95:aload           4
	//   44   97:invokevirtual   #89  <Method String HttpClient$zza.getValue()>
	//   45  100:invokevirtual   #234 <Method JSONObject JSONObject.put(String, Object)>
	//   46  103:invokevirtual   #253 <Method JSONArray JSONArray.put(Object)>
	//   47  106:pop             
		}
	//*  48  107:goto            55
	//*  49  110:aload_1         
	//*  50  111:ldc1            #255 <String "headers">
	//*  51  113:aload_2         
	//*  52  114:invokevirtual   #234 <Method JSONObject JSONObject.put(String, Object)>
	//*  53  117:pop             
	//*  54  118:aload_1         
	//*  55  119:ldc2            #257 <String "response_code">
	//*  56  122:aload_0         
	//*  57  123:invokevirtual   #202 <Method int HttpClient$zzd.getResponseCode()>
	//*  58  126:invokevirtual   #260 <Method JSONObject JSONObject.put(String, int)>
	//*  59  129:pop             
	//*  60  130:aload_1         
	//*  61  131:areturn         
		// Misplaced declaration of an exception variable
		catch(zzd zzd1)
	//*  62  132:astore_0        
		{
			zzakb.zzb("Error constructing JSON for http response.", ((Throwable) (zzd1)));
	//   63  133:ldc2            #262 <String "Error constructing JSON for http response.">
	//   64  136:aload_0         
	//   65  137:invokestatic    #267 <Method void zzakb.zzb(String, Throwable)>
			return jsonobject;
	//   66  140:aload_1         
	//   67  141:areturn         
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
	//    1    1:ldc1            #229 <String "http_request_id">
	//    2    3:invokevirtual   #274 <Method String JSONObject.optString(String)>
	//    3    6:astore          4
		obj = ((Object) (jsonobject.optString("url")));
	//    4    8:aload_0         
	//    5    9:ldc2            #276 <String "url">
	//    6   12:invokevirtual   #274 <Method String JSONObject.optString(String)>
	//    7   15:astore_3        
		url = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		s1 = jsonobject.optString("post_body", ((String) (null)));
	//   10   18:aload_0         
	//   11   19:ldc2            #278 <String "post_body">
	//   12   22:aconst_null     
	//   13   23:invokevirtual   #281 <Method String JSONObject.optString(String, String)>
	//   14   26:astore          5
		obj = ((Object) (new URL(((String) (obj)))));
	//   15   28:new             #45  <Class URL>
	//   16   31:dup             
	//   17   32:aload_3         
	//   18   33:invokespecial   #283 <Method void URL(String)>
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
	//   24   43:ldc2            #285 <String "Error constructing http request.">
	//   25   46:aload_3         
	//   26   47:invokestatic    #267 <Method void zzakb.zzb(String, Throwable)>
		ArrayList arraylist = new ArrayList();
	//   27   50:new             #74  <Class ArrayList>
	//   28   53:dup             
	//   29   54:invokespecial   #139 <Method void ArrayList()>
	//   30   57:astore          6
		JSONArray jsonarray = jsonobject.optJSONArray("headers");
	//   31   59:aload_0         
	//   32   60:ldc1            #255 <String "headers">
	//   33   62:invokevirtual   #289 <Method JSONArray JSONObject.optJSONArray(String)>
	//   34   65:astore_3        
		jsonobject = ((JSONObject) (jsonarray));
	//   35   66:aload_3         
	//   36   67:astore_0        
		if(jsonarray == null)
	//*  37   68:aload_3         
	//*  38   69:ifnonnull       80
			jsonobject = ((JSONObject) (new JSONArray()));
	//   39   72:new             #238 <Class JSONArray>
	//   40   75:dup             
	//   41   76:invokespecial   #239 <Method void JSONArray()>
	//   42   79:astore_0        
		for(int i = 0; i < ((JSONArray) (jsonobject)).length(); i++)
	//*  43   80:iconst_0        
	//*  44   81:istore_1        
	//*  45   82:iload_1         
	//*  46   83:aload_0         
	//*  47   84:invokevirtual   #292 <Method int JSONArray.length()>
	//*  48   87:icmpge          132
		{
			JSONObject jsonobject1 = ((JSONArray) (jsonobject)).optJSONObject(i);
	//   49   90:aload_0         
	//   50   91:iload_1         
	//   51   92:invokevirtual   #296 <Method JSONObject JSONArray.optJSONObject(int)>
	//   52   95:astore_3        
			if(jsonobject1 != null)
	//*  53   96:aload_3         
	//*  54   97:ifnull          125
				arraylist.add(((Object) (new zza(jsonobject1.optString("key"), jsonobject1.optString("value")))));
	//   55  100:aload           6
	//   56  102:new             #9   <Class HttpClient$zza>
	//   57  105:dup             
	//   58  106:aload_3         
	//   59  107:ldc1            #248 <String "key">
	//   60  109:invokevirtual   #274 <Method String JSONObject.optString(String)>
	//   61  112:aload_3         
	//   62  113:ldc1            #250 <String "value">
	//   63  115:invokevirtual   #274 <Method String JSONObject.optString(String)>
	//   64  118:invokespecial   #176 <Method void HttpClient$zza(String, String)>
	//   65  121:invokevirtual   #180 <Method boolean ArrayList.add(Object)>
	//   66  124:pop             
		}

	//   67  125:iload_1         
	//   68  126:iconst_1        
	//   69  127:iadd            
	//   70  128:istore_1        
	//*  71  129:goto            82
		return new zzb(s, url, arraylist, s1);
	//   72  132:new             #12  <Class HttpClient$zzb>
	//   73  135:dup             
	//   74  136:aload           4
	//   75  138:aload_2         
	//   76  139:aload           6
	//   77  141:aload           5
	//   78  143:invokespecial   #299 <Method void HttpClient$zzb(String, URL, ArrayList, String)>
	//   79  146:areturn         
	}

	public JSONObject send(JSONObject jsonobject)
	{
		JSONObject jsonobject1 = new JSONObject();
	//    0    0:new             #226 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #227 <Method void JSONObject()>
	//    3    7:astore          4
		String s = jsonobject.optString("http_request_id");
	//    4    9:aload_1         
	//    5   10:ldc1            #229 <String "http_request_id">
	//    6   12:invokevirtual   #274 <Method String JSONObject.optString(String)>
	//    7   15:astore_2        
		jsonobject = ((JSONObject) (zza(zzc(jsonobject))));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokestatic    #303 <Method HttpClient$zzb zzc(JSONObject)>
	//   11   21:invokespecial   #305 <Method HttpClient$zzc zza(HttpClient$zzb)>
	//   12   24:astore_1        
		if(!((zzc) (jsonobject)).isSuccess())
			break MISSING_BLOCK_LABEL_61;
	//   13   25:aload_1         
	//   14   26:invokevirtual   #308 <Method boolean HttpClient$zzc.isSuccess()>
	//   15   29:ifeq            61
		jsonobject1.put("response", ((Object) (zza(((zzc) (jsonobject)).zzkz()))));
	//   16   32:aload           4
	//   17   34:ldc2            #310 <String "response">
	//   18   37:aload_1         
	//   19   38:invokevirtual   #314 <Method HttpClient$zzd HttpClient$zzc.zzkz()>
	//   20   41:invokestatic    #316 <Method JSONObject zza(HttpClient$zzd)>
	//   21   44:invokevirtual   #234 <Method JSONObject JSONObject.put(String, Object)>
	//   22   47:pop             
		jsonobject1.put("success", true);
	//   23   48:aload           4
	//   24   50:ldc2            #318 <String "success">
	//   25   53:iconst_1        
	//   26   54:invokevirtual   #321 <Method JSONObject JSONObject.put(String, boolean)>
	//   27   57:pop             
		return jsonobject1;
	//   28   58:aload           4
	//   29   60:areturn         
		Exception exception;
		try
		{
			jsonobject1.put("response", ((Object) ((new JSONObject()).put("http_request_id", ((Object) (s))))));
	//   30   61:aload           4
	//   31   63:ldc2            #310 <String "response">
	//   32   66:new             #226 <Class JSONObject>
	//   33   69:dup             
	//   34   70:invokespecial   #227 <Method void JSONObject()>
	//   35   73:ldc1            #229 <String "http_request_id">
	//   36   75:aload_2         
	//   37   76:invokevirtual   #234 <Method JSONObject JSONObject.put(String, Object)>
	//   38   79:invokevirtual   #234 <Method JSONObject JSONObject.put(String, Object)>
	//   39   82:pop             
			jsonobject1.put("success", false);
	//   40   83:aload           4
	//   41   85:ldc2            #318 <String "success">
	//   42   88:iconst_0        
	//   43   89:invokevirtual   #321 <Method JSONObject JSONObject.put(String, boolean)>
	//   44   92:pop             
			jsonobject1.put("reason", ((Object) (((zzc) (jsonobject)).getReason())));
	//   45   93:aload           4
	//   46   95:ldc2            #323 <String "reason">
	//   47   98:aload_1         
	//   48   99:invokevirtual   #326 <Method String HttpClient$zzc.getReason()>
	//   49  102:invokevirtual   #234 <Method JSONObject JSONObject.put(String, Object)>
	//   50  105:pop             
		}
	//*  51  106:aload           4
	//*  52  108:areturn         
		catch(Exception exception1)
	//*  53  109:astore_3        
		{
			jsonobject = ((JSONObject) (s));
	//   54  110:aload_2         
	//   55  111:astore_1        
			exception = exception1;
	//   56  112:aload_3         
	//   57  113:astore_2        
			break MISSING_BLOCK_LABEL_122;
	//   58  114:goto            122
		}
		return jsonobject1;
		exception;
	//   59  117:astore_2        
		jsonobject = "";
	//   60  118:ldc2            #328 <String "">
	//   61  121:astore_1        
		zzakb.zzb("Error executing http request.", ((Throwable) (exception)));
	//   62  122:ldc2            #330 <String "Error executing http request.">
	//   63  125:aload_2         
	//   64  126:invokestatic    #267 <Method void zzakb.zzb(String, Throwable)>
		try
		{
			jsonobject1.put("response", ((Object) ((new JSONObject()).put("http_request_id", ((Object) (jsonobject))))));
	//   65  129:aload           4
	//   66  131:ldc2            #310 <String "response">
	//   67  134:new             #226 <Class JSONObject>
	//   68  137:dup             
	//   69  138:invokespecial   #227 <Method void JSONObject()>
	//   70  141:ldc1            #229 <String "http_request_id">
	//   71  143:aload_1         
	//   72  144:invokevirtual   #234 <Method JSONObject JSONObject.put(String, Object)>
	//   73  147:invokevirtual   #234 <Method JSONObject JSONObject.put(String, Object)>
	//   74  150:pop             
			jsonobject1.put("success", false);
	//   75  151:aload           4
	//   76  153:ldc2            #318 <String "success">
	//   77  156:iconst_0        
	//   78  157:invokevirtual   #321 <Method JSONObject JSONObject.put(String, boolean)>
	//   79  160:pop             
			jsonobject1.put("reason", ((Object) (exception.toString())));
	//   80  161:aload           4
	//   81  163:ldc2            #323 <String "reason">
	//   82  166:aload_2         
	//   83  167:invokevirtual   #221 <Method String Exception.toString()>
	//   84  170:invokevirtual   #234 <Method JSONObject JSONObject.put(String, Object)>
	//   85  173:pop             
		}
	//*  86  174:aload           4
	//*  87  176:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*  88  177:astore_1        
		{
			zzakb.zzb("Error executing http request.", ((Throwable) (jsonobject)));
	//   89  178:ldc2            #330 <String "Error executing http request.">
	//   90  181:aload_1         
	//   91  182:invokestatic    #267 <Method void zzakb.zzb(String, Throwable)>
			return jsonobject1;
	//   92  185:aload           4
	//   93  187:areturn         
		}
		return jsonobject1;
	}

	public final void zza(Object obj, Map map)
	{
		zzaki.zzb(((Runnable) (new zzw(this, map, (zzue)obj))));
	//    0    0:new             #334 <Class zzw>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:checkcast       #336 <Class zzue>
	//    6   10:invokespecial   #339 <Method void zzw(HttpClient, Map, zzue)>
	//    7   13:invokestatic    #344 <Method com.google.android.gms.internal.ads.zzanz zzaki.zzb(Runnable)>
	//    8   16:pop             
	//    9   17:return          
	}

	private final Context mContext;
	private final zzang zzyf;
}
