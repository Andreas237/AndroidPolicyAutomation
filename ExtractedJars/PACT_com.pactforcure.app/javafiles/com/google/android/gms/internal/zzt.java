// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.*;
import org.apache.http.*;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.cookie.DateUtils;

// Referenced classes of package com.google.android.gms.internal:
//			zzf, zzs, zzu, zzk, 
//			zzo, zzr, zzp, zzaa, 
//			zzy, zzi, zzq, zza, 
//			zzj, zzh

public class zzt
	implements zzf
{

	public zzt(zzy zzy1)
	{
		this(zzy1, new zzu(zzan));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #31  <Class zzu>
	//    3    5:dup             
	//    4    6:getstatic       #26  <Field int zzan>
	//    5    9:invokespecial   #34  <Method void zzu(int)>
	//    6   12:invokespecial   #37  <Method void zzt(zzy, zzu)>
	//    7   15:return          
	}

	public zzt(zzy zzy1, zzu zzu1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		zzao = zzy1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #41  <Field zzy zzao>
		zzap = zzu1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #43  <Field zzu zzap>
	//    8   14:return          
	}

	protected static Map zza(Header aheader[])
	{
		TreeMap treemap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
	//    0    0:new             #47  <Class TreeMap>
	//    1    3:dup             
	//    2    4:getstatic       #53  <Field java.util.Comparator String.CASE_INSENSITIVE_ORDER>
	//    3    7:invokespecial   #56  <Method void TreeMap(java.util.Comparator)>
	//    4   10:astore_2        
		for(int i = 0; i < aheader.length; i++)
	//*   5   11:iconst_0        
	//*   6   12:istore_1        
	//*   7   13:iload_1         
	//*   8   14:aload_0         
	//*   9   15:arraylength     
	//*  10   16:icmpge          49
			((Map) (treemap)).put(((Object) (aheader[i].getName())), ((Object) (aheader[i].getValue())));
	//   11   19:aload_2         
	//   12   20:aload_0         
	//   13   21:iload_1         
	//   14   22:aaload          
	//   15   23:invokeinterface #62  <Method String Header.getName()>
	//   16   28:aload_0         
	//   17   29:iload_1         
	//   18   30:aaload          
	//   19   31:invokeinterface #65  <Method String Header.getValue()>
	//   20   36:invokeinterface #71  <Method Object Map.put(Object, Object)>
	//   21   41:pop             

	//   22   42:iload_1         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore_1        
	//*  26   46:goto            13
		return ((Map) (treemap));
	//   27   49:aload_2         
	//   28   50:areturn         
	}

	private void zza(long l, zzk zzk1, byte abyte0[], StatusLine statusline)
	{
		if(DEBUG || l > (long)zzam)
	//*   0    0:getstatic       #22  <Field boolean DEBUG>
	//*   1    3:ifne            15
	//*   2    6:lload_1         
	//*   3    7:getstatic       #24  <Field int zzam>
	//*   4   10:i2l             
	//*   5   11:lcmp            
	//*   6   12:ifle            81
		{
			if(abyte0 != null)
	//*   7   15:aload           4
	//*   8   17:ifnull          82
				abyte0 = ((byte []) (Integer.valueOf(abyte0.length)));
	//    9   20:aload           4
	//   10   22:arraylength     
	//   11   23:invokestatic    #80  <Method Integer Integer.valueOf(int)>
	//   12   26:astore          4
			else
	//*  13   28:ldc1            #82  <String "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]">
	//*  14   30:iconst_5        
	//*  15   31:anewarray       Object[]
	//*  16   34:dup             
	//*  17   35:iconst_0        
	//*  18   36:aload_3         
	//*  19   37:aastore         
	//*  20   38:dup             
	//*  21   39:iconst_1        
	//*  22   40:lload_1         
	//*  23   41:invokestatic    #87  <Method Long Long.valueOf(long)>
	//*  24   44:aastore         
	//*  25   45:dup             
	//*  26   46:iconst_2        
	//*  27   47:aload           4
	//*  28   49:aastore         
	//*  29   50:dup             
	//*  30   51:iconst_3        
	//*  31   52:aload           5
	//*  32   54:invokeinterface #93  <Method int StatusLine.getStatusCode()>
	//*  33   59:invokestatic    #80  <Method Integer Integer.valueOf(int)>
	//*  34   62:aastore         
	//*  35   63:dup             
	//*  36   64:iconst_4        
	//*  37   65:aload_3         
	//*  38   66:invokevirtual   #99  <Method zzo zzk.zzq()>
	//*  39   69:invokeinterface #104 <Method int zzo.zzd()>
	//*  40   74:invokestatic    #80  <Method Integer Integer.valueOf(int)>
	//*  41   77:aastore         
	//*  42   78:invokestatic    #108 <Method void zzs.zzb(String, Object[])>
	//*  43   81:return          
				abyte0 = "null";
	//   44   82:ldc1            #110 <String "null">
	//   45   84:astore          4
			zzs.zzb("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[] {
				zzk1, Long.valueOf(l), abyte0, Integer.valueOf(statusline.getStatusCode()), Integer.valueOf(zzk1.zzq().zzd())
			});
		}
	//*  46   86:goto            28
	}

	private static void zza(String s, zzk zzk1, zzr zzr1)
		throws zzr
	{
		zzo zzo1 = zzk1.zzq();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #99  <Method zzo zzk.zzq()>
	//    2    4:astore          4
		int i = zzk1.zzp();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #117 <Method int zzk.zzp()>
	//    5   10:istore_3        
		try
		{
			zzo1.zza(zzr1);
	//    6   11:aload           4
	//    7   13:aload_2         
	//    8   14:invokeinterface #120 <Method void zzo.zza(zzr)>
		}
	//*   9   19:aload_1         
	//*  10   20:ldc1            #122 <String "%s-retry [timeout=%s]">
	//*  11   22:iconst_2        
	//*  12   23:anewarray       Object[]
	//*  13   26:dup             
	//*  14   27:iconst_0        
	//*  15   28:aload_0         
	//*  16   29:aastore         
	//*  17   30:dup             
	//*  18   31:iconst_1        
	//*  19   32:iload_3         
	//*  20   33:invokestatic    #80  <Method Integer Integer.valueOf(int)>
	//*  21   36:aastore         
	//*  22   37:invokestatic    #126 <Method String String.format(String, Object[])>
	//*  23   40:invokevirtual   #130 <Method void zzk.zzc(String)>
	//*  24   43:return          
		// Misplaced declaration of an exception variable
		catch(zzr zzr1)
	//*  25   44:astore_2        
		{
			zzk1.zzc(String.format("%s-timeout-giveup [timeout=%s]", new Object[] {
				s, Integer.valueOf(i)
			}));
	//   26   45:aload_1         
	//   27   46:ldc1            #132 <String "%s-timeout-giveup [timeout=%s]">
	//   28   48:iconst_2        
	//   29   49:anewarray       Object[]
	//   30   52:dup             
	//   31   53:iconst_0        
	//   32   54:aload_0         
	//   33   55:aastore         
	//   34   56:dup             
	//   35   57:iconst_1        
	//   36   58:iload_3         
	//   37   59:invokestatic    #80  <Method Integer Integer.valueOf(int)>
	//   38   62:aastore         
	//   39   63:invokestatic    #126 <Method String String.format(String, Object[])>
	//   40   66:invokevirtual   #130 <Method void zzk.zzc(String)>
			throw zzr1;
	//   41   69:aload_2         
	//   42   70:athrow          
		}
		zzk1.zzc(String.format("%s-retry [timeout=%s]", new Object[] {
			s, Integer.valueOf(i)
		}));
	}

	private void zza(Map map, zzb.zza zza1)
	{
		if(zza1 != null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
	//*   2    4:return          
		{
			if(zza1.zza != null)
	//*   3    5:aload_2         
	//*   4    6:getfield        #140 <Field String zzb$zza.zza>
	//*   5    9:ifnull          25
				map.put("If-None-Match", ((Object) (zza1.zza)));
	//    6   12:aload_1         
	//    7   13:ldc1            #142 <String "If-None-Match">
	//    8   15:aload_2         
	//    9   16:getfield        #140 <Field String zzb$zza.zza>
	//   10   19:invokeinterface #71  <Method Object Map.put(Object, Object)>
	//   11   24:pop             
			if(zza1.zzc > 0L)
	//*  12   25:aload_2         
	//*  13   26:getfield        #145 <Field long zzb$zza.zzc>
	//*  14   29:lconst_0        
	//*  15   30:lcmp            
	//*  16   31:ifle            4
			{
				map.put("If-Modified-Since", ((Object) (DateUtils.formatDate(new Date(zza1.zzc)))));
	//   17   34:aload_1         
	//   18   35:ldc1            #147 <String "If-Modified-Since">
	//   19   37:new             #149 <Class Date>
	//   20   40:dup             
	//   21   41:aload_2         
	//   22   42:getfield        #145 <Field long zzb$zza.zzc>
	//   23   45:invokespecial   #152 <Method void Date(long)>
	//   24   48:invokestatic    #158 <Method String DateUtils.formatDate(Date)>
	//   25   51:invokeinterface #71  <Method Object Map.put(Object, Object)>
	//   26   56:pop             
				return;
	//   27   57:return          
			}
		}
	}

	private byte[] zza(HttpEntity httpentity)
		throws IOException, zzp
	{
		Object obj;
		Exception exception;
		zzaa zzaa1;
		zzaa1 = new zzaa(zzap, (int)httpentity.getContentLength());
	//    0    0:new             #166 <Class zzaa>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field zzu zzap>
	//    4    8:aload_1         
	//    5    9:invokeinterface #172 <Method long HttpEntity.getContentLength()>
	//    6   14:l2i             
	//    7   15:invokespecial   #175 <Method void zzaa(zzu, int)>
	//    8   18:astore          5
		exception = null;
	//    9   20:aconst_null     
	//   10   21:astore          4
		obj = ((Object) (exception));
	//   11   23:aload           4
	//   12   25:astore_3        
		InputStream inputstream = httpentity.getContent();
	//   13   26:aload_1         
	//   14   27:invokeinterface #179 <Method InputStream HttpEntity.getContent()>
	//   15   32:astore          6
		if(inputstream != null)
			break MISSING_BLOCK_LABEL_74;
	//   16   34:aload           6
	//   17   36:ifnonnull       74
		obj = ((Object) (exception));
	//   18   39:aload           4
	//   19   41:astore_3        
		throw new zzp();
	//   20   42:new             #164 <Class zzp>
	//   21   45:dup             
	//   22   46:invokespecial   #180 <Method void zzp()>
	//   23   49:athrow          
		exception;
	//   24   50:astore          4
		int i;
		byte abyte0[];
		byte abyte1[];
		try
		{
			httpentity.consumeContent();
	//   25   52:aload_1         
	//   26   53:invokeinterface #183 <Method void HttpEntity.consumeContent()>
		}
	//*  27   58:aload_0         
	//*  28   59:getfield        #43  <Field zzu zzap>
	//*  29   62:aload_3         
	//*  30   63:invokevirtual   #186 <Method void zzu.zza(byte[])>
	//*  31   66:aload           5
	//*  32   68:invokevirtual   #189 <Method void zzaa.close()>
	//*  33   71:aload           4
	//*  34   73:athrow          
	//*  35   74:aload           4
	//*  36   76:astore_3        
	//*  37   77:aload_0         
	//*  38   78:getfield        #43  <Field zzu zzap>
	//*  39   81:sipush          1024
	//*  40   84:invokevirtual   #192 <Method byte[] zzu.zzb(int)>
	//*  41   87:astore          4
	//*  42   89:aload           4
	//*  43   91:astore_3        
	//*  44   92:aload           6
	//*  45   94:aload           4
	//*  46   96:invokevirtual   #198 <Method int InputStream.read(byte[])>
	//*  47   99:istore_2        
	//*  48  100:iload_2         
	//*  49  101:iconst_m1       
	//*  50  102:icmpeq          120
	//*  51  105:aload           4
	//*  52  107:astore_3        
	//*  53  108:aload           5
	//*  54  110:aload           4
	//*  55  112:iconst_0        
	//*  56  113:iload_2         
	//*  57  114:invokevirtual   #202 <Method void zzaa.write(byte[], int, int)>
	//*  58  117:goto            89
	//*  59  120:aload           4
	//*  60  122:astore_3        
	//*  61  123:aload           5
	//*  62  125:invokevirtual   #206 <Method byte[] zzaa.toByteArray()>
	//*  63  128:astore          6
	//*  64  130:aload_1         
	//*  65  131:invokeinterface #183 <Method void HttpEntity.consumeContent()>
	//*  66  136:aload_0         
	//*  67  137:getfield        #43  <Field zzu zzap>
	//*  68  140:aload           4
	//*  69  142:invokevirtual   #186 <Method void zzu.zza(byte[])>
	//*  70  145:aload           5
	//*  71  147:invokevirtual   #189 <Method void zzaa.close()>
	//*  72  150:aload           6
	//*  73  152:areturn         
	//*  74  153:astore_1        
	//*  75  154:ldc1            #208 <String "Error occured when calling consumingContent">
	//*  76  156:iconst_0        
	//*  77  157:anewarray       Object[]
	//*  78  160:invokestatic    #210 <Method void zzs.zza(String, Object[])>
	//*  79  163:goto            136
		// Misplaced declaration of an exception variable
		catch(HttpEntity httpentity)
	//*  80  166:astore_1        
		{
			zzs.zza("Error occured when calling consumingContent", new Object[0]);
	//   81  167:ldc1            #208 <String "Error occured when calling consumingContent">
	//   82  169:iconst_0        
	//   83  170:anewarray       Object[]
	//   84  173:invokestatic    #210 <Method void zzs.zza(String, Object[])>
		}
		zzap.zza(((byte []) (obj)));
		zzaa1.close();
		throw exception;
		obj = ((Object) (exception));
		abyte0 = zzap.zzb(1024);
_L2:
		obj = ((Object) (abyte0));
		i = inputstream.read(abyte0);
		if(i == -1)
			break; /* Loop/switch isn't completed */
		obj = ((Object) (abyte0));
		zzaa1.write(abyte0, 0, i);
		if(true) goto _L2; else goto _L1
_L1:
		obj = ((Object) (abyte0));
		abyte1 = zzaa1.toByteArray();
		try
		{
			httpentity.consumeContent();
		}
		// Misplaced declaration of an exception variable
		catch(HttpEntity httpentity)
		{
			zzs.zza("Error occured when calling consumingContent", new Object[0]);
		}
		zzap.zza(abyte0);
		zzaa1.close();
		return abyte1;
	//*  85  176:goto            58
	}

	public zzi zza(zzk zzk1)
		throws zzr
	{
		long l = SystemClock.elapsedRealtime();
	//    0    0:invokestatic    #222 <Method long SystemClock.elapsedRealtime()>
	//    1    3:lstore_3        
_L3:
		Object obj2;
		Object obj4;
		obj4 = null;
	//    2    4:aconst_null     
	//    3    5:astore          9
		obj2 = ((Object) (Collections.emptyMap()));
	//    4    7:invokestatic    #228 <Method Map Collections.emptyMap()>
	//    5   10:astore          7
		Object obj1;
		HashMap hashmap = new HashMap();
	//    6   12:new             #230 <Class HashMap>
	//    7   15:dup             
	//    8   16:invokespecial   #231 <Method void HashMap()>
	//    9   19:astore          5
		zza(((Map) (hashmap)), zzk1.zzh());
	//   10   21:aload_0         
	//   11   22:aload           5
	//   12   24:aload_1         
	//   13   25:invokevirtual   #235 <Method zzb$zza zzk.zzh()>
	//   14   28:invokespecial   #237 <Method void zza(Map, zzb$zza)>
		obj1 = ((Object) (zzao.zza(zzk1, ((Map) (hashmap)))));
	//   15   31:aload_0         
	//   16   32:getfield        #41  <Field zzy zzao>
	//   17   35:aload_1         
	//   18   36:aload           5
	//   19   38:invokeinterface #242 <Method HttpResponse zzy.zza(zzk, Map)>
	//   20   43:astore          6
		Object obj = obj2;
	//   21   45:aload           7
	//   22   47:astore          5
		Object obj3 = ((Object) (((HttpResponse) (obj1)).getStatusLine()));
	//   23   49:aload           6
	//   24   51:invokeinterface #248 <Method StatusLine HttpResponse.getStatusLine()>
	//   25   56:astore          8
		obj = obj2;
	//   26   58:aload           7
	//   27   60:astore          5
		int i = ((StatusLine) (obj3)).getStatusCode();
	//   28   62:aload           8
	//   29   64:invokeinterface #93  <Method int StatusLine.getStatusCode()>
	//   30   69:istore_2        
		obj = obj2;
	//   31   70:aload           7
	//   32   72:astore          5
		obj4 = ((Object) (zza(((HttpResponse) (obj1)).getAllHeaders())));
	//   33   74:aload           6
	//   34   76:invokeinterface #252 <Method Header[] HttpResponse.getAllHeaders()>
	//   35   81:invokestatic    #254 <Method Map zza(Header[])>
	//   36   84:astore          9
		if(i != 304)
			break MISSING_BLOCK_LABEL_179;
	//   37   86:iload_2         
	//   38   87:sipush          304
	//   39   90:icmpne          179
		obj = obj4;
	//   40   93:aload           9
	//   41   95:astore          5
		obj2 = ((Object) (zzk1.zzh()));
	//   42   97:aload_1         
	//   43   98:invokevirtual   #235 <Method zzb$zza zzk.zzh()>
	//   44  101:astore          7
		if(obj2 != null)
			break MISSING_BLOCK_LABEL_132;
	//   45  103:aload           7
	//   46  105:ifnonnull       132
		obj = obj4;
	//   47  108:aload           9
	//   48  110:astore          5
		return new zzi(304, ((byte []) (null)), ((Map) (obj4)), true, SystemClock.elapsedRealtime() - l);
	//   49  112:new             #256 <Class zzi>
	//   50  115:dup             
	//   51  116:sipush          304
	//   52  119:aconst_null     
	//   53  120:aload           9
	//   54  122:iconst_1        
	//   55  123:invokestatic    #222 <Method long SystemClock.elapsedRealtime()>
	//   56  126:lload_3         
	//   57  127:lsub            
	//   58  128:invokespecial   #259 <Method void zzi(int, byte[], Map, boolean, long)>
	//   59  131:areturn         
		obj = obj4;
	//   60  132:aload           9
	//   61  134:astore          5
		((zzb.zza) (obj2)).zzf.putAll(((Map) (obj4)));
	//   62  136:aload           7
	//   63  138:getfield        #263 <Field Map zzb$zza.zzf>
	//   64  141:aload           9
	//   65  143:invokeinterface #267 <Method void Map.putAll(Map)>
		obj = obj4;
	//   66  148:aload           9
	//   67  150:astore          5
		return new zzi(304, ((zzb.zza) (obj2)).data, ((zzb.zza) (obj2)).zzf, true, SystemClock.elapsedRealtime() - l);
	//   68  152:new             #256 <Class zzi>
	//   69  155:dup             
	//   70  156:sipush          304
	//   71  159:aload           7
	//   72  161:getfield        #271 <Field byte[] zzb$zza.data>
	//   73  164:aload           7
	//   74  166:getfield        #263 <Field Map zzb$zza.zzf>
	//   75  169:iconst_1        
	//   76  170:invokestatic    #222 <Method long SystemClock.elapsedRealtime()>
	//   77  173:lload_3         
	//   78  174:lsub            
	//   79  175:invokespecial   #259 <Method void zzi(int, byte[], Map, boolean, long)>
	//   80  178:areturn         
		obj = obj4;
	//   81  179:aload           9
	//   82  181:astore          5
		if(((HttpResponse) (obj1)).getEntity() == null) goto _L2; else goto _L1
	//   83  183:aload           6
	//   84  185:invokeinterface #275 <Method HttpEntity HttpResponse.getEntity()>
	//   85  190:ifnull          269
_L1:
		obj = obj4;
	//   86  193:aload           9
	//   87  195:astore          5
		obj2 = ((Object) (zza(((HttpResponse) (obj1)).getEntity())));
	//   88  197:aload_0         
	//   89  198:aload           6
	//   90  200:invokeinterface #275 <Method HttpEntity HttpResponse.getEntity()>
	//   91  205:invokespecial   #277 <Method byte[] zza(HttpEntity)>
	//   92  208:astore          7
		obj = obj2;
	//   93  210:aload           7
	//   94  212:astore          5
_L4:
		zza(SystemClock.elapsedRealtime() - l, zzk1, ((byte []) (obj)), ((StatusLine) (obj3)));
	//   95  214:aload_0         
	//   96  215:invokestatic    #222 <Method long SystemClock.elapsedRealtime()>
	//   97  218:lload_3         
	//   98  219:lsub            
	//   99  220:aload_1         
	//  100  221:aload           5
	//  101  223:aload           8
	//  102  225:invokespecial   #279 <Method void zza(long, zzk, byte[], StatusLine)>
		if(i >= 200 && i <= 299)
			break MISSING_BLOCK_LABEL_285;
	//  103  228:iload_2         
	//  104  229:sipush          200
	//  105  232:icmplt          242
	//  106  235:iload_2         
	//  107  236:sipush          299
	//  108  239:icmple          285
		throw new IOException();
	//  109  242:new             #162 <Class IOException>
	//  110  245:dup             
	//  111  246:invokespecial   #280 <Method void IOException()>
	//  112  249:athrow          
		obj;
	//  113  250:astore          5
		zza("socket", zzk1, ((zzr) (new zzq())));
	//  114  252:ldc2            #282 <String "socket">
	//  115  255:aload_1         
	//  116  256:new             #284 <Class zzq>
	//  117  259:dup             
	//  118  260:invokespecial   #285 <Method void zzq()>
	//  119  263:invokestatic    #287 <Method void zza(String, zzk, zzr)>
		  goto _L3
	//* 120  266:goto            4
_L2:
		obj = obj4;
	//  121  269:aload           9
	//  122  271:astore          5
		obj2 = ((Object) (new byte[0]));
	//  123  273:iconst_0        
	//  124  274:newarray        byte[]
	//  125  276:astore          7
		obj = obj2;
	//  126  278:aload           7
	//  127  280:astore          5
		  goto _L4
	//* 128  282:goto            214
		obj2 = ((Object) (new zzi(i, ((byte []) (obj)), ((Map) (obj4)), false, SystemClock.elapsedRealtime() - l)));
	//  129  285:new             #256 <Class zzi>
	//  130  288:dup             
	//  131  289:iload_2         
	//  132  290:aload           5
	//  133  292:aload           9
	//  134  294:iconst_0        
	//  135  295:invokestatic    #222 <Method long SystemClock.elapsedRealtime()>
	//  136  298:lload_3         
	//  137  299:lsub            
	//  138  300:invokespecial   #259 <Method void zzi(int, byte[], Map, boolean, long)>
	//  139  303:astore          7
		return ((zzi) (obj2));
	//  140  305:aload           7
	//  141  307:areturn         
		obj;
	//  142  308:astore          5
		zza("connection", zzk1, ((zzr) (new zzq())));
	//  143  310:ldc2            #289 <String "connection">
	//  144  313:aload_1         
	//  145  314:new             #284 <Class zzq>
	//  146  317:dup             
	//  147  318:invokespecial   #285 <Method void zzq()>
	//  148  321:invokestatic    #287 <Method void zza(String, zzk, zzr)>
		  goto _L3
	//* 149  324:goto            4
		obj;
	//  150  327:astore          5
		zzk1 = ((zzk) (String.valueOf(((Object) (zzk1.getUrl())))));
	//  151  329:aload_1         
	//  152  330:invokevirtual   #292 <Method String zzk.getUrl()>
	//  153  333:invokestatic    #295 <Method String String.valueOf(Object)>
	//  154  336:astore_1        
		if(((String) (zzk1)).length() != 0)
	//* 155  337:aload_1         
	//* 156  338:invokevirtual   #298 <Method int String.length()>
	//* 157  341:ifeq            363
			zzk1 = ((zzk) ("Bad URL ".concat(((String) (zzk1)))));
	//  158  344:ldc2            #300 <String "Bad URL ">
	//  159  347:aload_1         
	//  160  348:invokevirtual   #304 <Method String String.concat(String)>
	//  161  351:astore_1        
		else
	//* 162  352:new             #306 <Class RuntimeException>
	//* 163  355:dup             
	//* 164  356:aload_1         
	//* 165  357:aload           5
	//* 166  359:invokespecial   #309 <Method void RuntimeException(String, Throwable)>
	//* 167  362:athrow          
			zzk1 = ((zzk) (new String("Bad URL ")));
	//  168  363:new             #49  <Class String>
	//  169  366:dup             
	//  170  367:ldc2            #300 <String "Bad URL ">
	//  171  370:invokespecial   #311 <Method void String(String)>
	//  172  373:astore_1        
		throw new RuntimeException(((String) (zzk1)), ((Throwable) (obj)));
	//* 173  374:goto            352
		obj1;
	//  174  377:astore          6
		obj3 = null;
	//  175  379:aconst_null     
	//  176  380:astore          8
		obj = obj2;
	//  177  382:aload           7
	//  178  384:astore          5
		obj2 = obj4;
	//  179  386:aload           9
	//  180  388:astore          7
_L5:
		if(obj2 != null)
	//* 181  390:aload           7
	//* 182  392:ifnull          490
		{
			int j = ((HttpResponse) (obj2)).getStatusLine().getStatusCode();
	//  183  395:aload           7
	//  184  397:invokeinterface #248 <Method StatusLine HttpResponse.getStatusLine()>
	//  185  402:invokeinterface #93  <Method int StatusLine.getStatusCode()>
	//  186  407:istore_2        
			zzs.zzc("Unexpected response code %d for %s", new Object[] {
				Integer.valueOf(j), zzk1.getUrl()
			});
	//  187  408:ldc2            #313 <String "Unexpected response code %d for %s">
	//  188  411:iconst_2        
	//  189  412:anewarray       Object[]
	//  190  415:dup             
	//  191  416:iconst_0        
	//  192  417:iload_2         
	//  193  418:invokestatic    #80  <Method Integer Integer.valueOf(int)>
	//  194  421:aastore         
	//  195  422:dup             
	//  196  423:iconst_1        
	//  197  424:aload_1         
	//  198  425:invokevirtual   #292 <Method String zzk.getUrl()>
	//  199  428:aastore         
	//  200  429:invokestatic    #315 <Method void zzs.zzc(String, Object[])>
			if(obj3 != null)
	//* 201  432:aload           8
	//* 202  434:ifnull          510
			{
				obj = ((Object) (new zzi(j, ((byte []) (obj3)), ((Map) (obj)), false, SystemClock.elapsedRealtime() - l)));
	//  203  437:new             #256 <Class zzi>
	//  204  440:dup             
	//  205  441:iload_2         
	//  206  442:aload           8
	//  207  444:aload           5
	//  208  446:iconst_0        
	//  209  447:invokestatic    #222 <Method long SystemClock.elapsedRealtime()>
	//  210  450:lload_3         
	//  211  451:lsub            
	//  212  452:invokespecial   #259 <Method void zzi(int, byte[], Map, boolean, long)>
	//  213  455:astore          5
				if(j == 401 || j == 403)
	//* 214  457:iload_2         
	//* 215  458:sipush          401
	//* 216  461:icmpeq          471
	//* 217  464:iload_2         
	//* 218  465:sipush          403
	//* 219  468:icmpne          500
					zza("auth", zzk1, ((zzr) (new zza(((zzi) (obj))))));
	//  220  471:ldc2            #317 <String "auth">
	//  221  474:aload_1         
	//  222  475:new             #319 <Class zza>
	//  223  478:dup             
	//  224  479:aload           5
	//  225  481:invokespecial   #322 <Method void zza(zzi)>
	//  226  484:invokestatic    #287 <Method void zza(String, zzk, zzr)>
				else
	//* 227  487:goto            4
	//* 228  490:new             #324 <Class zzj>
	//* 229  493:dup             
	//* 230  494:aload           6
	//* 231  496:invokespecial   #327 <Method void zzj(Throwable)>
	//* 232  499:athrow          
					throw new zzp(((zzi) (obj)));
	//  233  500:new             #164 <Class zzp>
	//  234  503:dup             
	//  235  504:aload           5
	//  236  506:invokespecial   #328 <Method void zzp(zzi)>
	//  237  509:athrow          
			} else
			{
				throw new zzh(((zzi) (null)));
	//  238  510:new             #330 <Class zzh>
	//  239  513:dup             
	//  240  514:aconst_null     
	//  241  515:invokespecial   #331 <Method void zzh(zzi)>
	//  242  518:athrow          
			}
		} else
		{
			throw new zzj(((Throwable) (obj1)));
		}
		  goto _L3
		obj4;
	//  243  519:astore          9
		obj3 = null;
	//  244  521:aconst_null     
	//  245  522:astore          8
		obj2 = obj1;
	//  246  524:aload           6
	//  247  526:astore          7
		obj1 = obj4;
	//  248  528:aload           9
	//  249  530:astore          6
		  goto _L5
	//* 250  532:goto            390
		IOException ioexception;
		ioexception;
	//  251  535:astore          8
		obj2 = obj1;
	//  252  537:aload           6
	//  253  539:astore          7
		obj1 = ((Object) (ioexception));
	//  254  541:aload           8
	//  255  543:astore          6
		ioexception = ((IOException) (obj));
	//  256  545:aload           5
	//  257  547:astore          8
		obj = obj4;
	//  258  549:aload           9
	//  259  551:astore          5
		  goto _L5
	//* 260  553:goto            390
	}

	protected static final boolean DEBUG;
	private static int zzam = 3000;
	private static int zzan = 4096;
	protected final zzy zzao;
	protected final zzu zzap;

	static 
	{
		DEBUG = zzs.DEBUG;
	//    0    0:getstatic       #21  <Field boolean zzs.DEBUG>
	//    1    3:putstatic       #22  <Field boolean DEBUG>
	//    2    6:sipush          3000
	//    3    9:putstatic       #24  <Field int zzam>
	//    4   12:sipush          4096
	//    5   15:putstatic       #26  <Field int zzan>
	//*   6   18:return          
	}
}
