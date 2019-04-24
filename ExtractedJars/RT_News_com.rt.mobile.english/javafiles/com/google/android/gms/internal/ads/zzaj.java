// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzm, zzaf, zzak, zzah, 
//			zzae, zzr, zzab, zzac, 
//			zzau, zzc, zzap, zzai, 
//			zzaq, zzp, zzl, zzg, 
//			zza, zzo, zzq, zzad, 
//			zzar

public class zzaj
	implements zzm
{

	public zzaj(zzai zzai1)
	{
		this(zzai1, new zzak(4096));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #27  <Class zzak>
	//    3    5:dup             
	//    4    6:sipush          4096
	//    5    9:invokespecial   #30  <Method void zzak(int)>
	//    6   12:invokespecial   #33  <Method void zzaj(zzai, zzak)>
	//    7   15:return          
	}

	private zzaj(zzai zzai1, zzak zzak1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		zzbp = zzai1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #37  <Field zzai zzbp>
		zzbo = ((zzar) (zzai1));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #39  <Field zzar zzbo>
		zzbq = zzak1;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #41  <Field zzak zzbq>
	//   11   19:return          
	}

	public zzaj(zzar zzar)
	{
		this(zzar, new zzak(4096));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #27  <Class zzak>
	//    3    5:dup             
	//    4    6:sipush          4096
	//    5    9:invokespecial   #30  <Method void zzak(int)>
	//    6   12:invokespecial   #45  <Method void zzaj(zzar, zzak)>
	//    7   15:return          
	}

	private zzaj(zzar zzar, zzak zzak1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		zzbo = zzar;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #39  <Field zzar zzbo>
		zzbp = ((zzai) (new zzah(zzar)));
	//    5    9:aload_0         
	//    6   10:new             #48  <Class zzah>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #50  <Method void zzah(zzar)>
	//   10   18:putfield        #37  <Field zzai zzbp>
		zzbq = zzak1;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #41  <Field zzak zzbq>
	//   14   26:return          
	}

	private static void zza(String s, zzr zzr1, zzae zzae1)
		throws zzae
	{
		zzab zzab1 = zzr1.zzj();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #60  <Method zzab zzr.zzj()>
	//    2    4:astore          4
		int i = zzr1.zzi();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #64  <Method int zzr.zzi()>
	//    5   10:istore_3        
		try
		{
			zzab1.zza(zzae1);
	//    6   11:aload           4
	//    7   13:aload_2         
	//    8   14:invokeinterface #69  <Method void zzab.zza(zzae)>
		}
	//*   9   19:aload_1         
	//*  10   20:ldc1            #71  <String "%s-retry [timeout=%s]">
	//*  11   22:iconst_2        
	//*  12   23:anewarray       Object[]
	//*  13   26:dup             
	//*  14   27:iconst_0        
	//*  15   28:aload_0         
	//*  16   29:aastore         
	//*  17   30:dup             
	//*  18   31:iconst_1        
	//*  19   32:iload_3         
	//*  20   33:invokestatic    #77  <Method Integer Integer.valueOf(int)>
	//*  21   36:aastore         
	//*  22   37:invokestatic    #83  <Method String String.format(String, Object[])>
	//*  23   40:invokevirtual   #87  <Method void zzr.zzb(String)>
	//*  24   43:return          
		// Misplaced declaration of an exception variable
		catch(zzae zzae1)
	//*  25   44:astore_2        
		{
			zzr1.zzb(String.format("%s-timeout-giveup [timeout=%s]", new Object[] {
				s, Integer.valueOf(i)
			}));
	//   26   45:aload_1         
	//   27   46:ldc1            #89  <String "%s-timeout-giveup [timeout=%s]">
	//   28   48:iconst_2        
	//   29   49:anewarray       Object[]
	//   30   52:dup             
	//   31   53:iconst_0        
	//   32   54:aload_0         
	//   33   55:aastore         
	//   34   56:dup             
	//   35   57:iconst_1        
	//   36   58:iload_3         
	//   37   59:invokestatic    #77  <Method Integer Integer.valueOf(int)>
	//   38   62:aastore         
	//   39   63:invokestatic    #83  <Method String String.format(String, Object[])>
	//   40   66:invokevirtual   #87  <Method void zzr.zzb(String)>
			throw zzae1;
	//   41   69:aload_2         
	//   42   70:athrow          
		}
		zzr1.zzb(String.format("%s-retry [timeout=%s]", new Object[] {
			s, Integer.valueOf(i)
		}));
	}

	private final byte[] zza(InputStream inputstream, int i)
		throws IOException, zzac
	{
		Object obj;
		zzau zzau1;
		zzau1 = new zzau(zzbq, i);
	//    0    0:new             #99  <Class zzau>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field zzak zzbq>
	//    4    8:iload_2         
	//    5    9:invokespecial   #102 <Method void zzau(zzak, int)>
	//    6   12:astore          6
		obj = null;
	//    7   14:aconst_null     
	//    8   15:astore          4
		if(inputstream != null)
			break MISSING_BLOCK_LABEL_29;
	//    9   17:aload_1         
	//   10   18:ifnonnull       29
		throw new zzac();
	//   11   21:new             #97  <Class zzac>
	//   12   24:dup             
	//   13   25:invokespecial   #103 <Method void zzac()>
	//   14   28:athrow          
		byte abyte0[] = zzbq.zzb(1024);
	//   15   29:aload_0         
	//   16   30:getfield        #41  <Field zzak zzbq>
	//   17   33:sipush          1024
	//   18   36:invokevirtual   #106 <Method byte[] zzak.zzb(int)>
	//   19   39:astore_3        
_L1:
		i = inputstream.read(abyte0);
	//   20   40:aload_1         
	//   21   41:aload_3         
	//   22   42:invokevirtual   #112 <Method int InputStream.read(byte[])>
	//   23   45:istore_2        
		if(i == -1)
			break MISSING_BLOCK_LABEL_62;
	//   24   46:iload_2         
	//   25   47:iconst_m1       
	//   26   48:icmpeq          62
		zzau1.write(abyte0, 0, i);
	//   27   51:aload           6
	//   28   53:aload_3         
	//   29   54:iconst_0        
	//   30   55:iload_2         
	//   31   56:invokevirtual   #116 <Method void zzau.write(byte[], int, int)>
		  goto _L1
	//*  32   59:goto            40
		obj = ((Object) (zzau1.toByteArray()));
	//   33   62:aload           6
	//   34   64:invokevirtual   #120 <Method byte[] zzau.toByteArray()>
	//   35   67:astore          4
		if(inputstream != null)
	//*  36   69:aload_1         
	//*  37   70:ifnull          89
			try
			{
				inputstream.close();
	//   38   73:aload_1         
	//   39   74:invokevirtual   #123 <Method void InputStream.close()>
			}
	//*  40   77:goto            89
	//*  41   80:ldc1            #125 <String "Error occurred when closing InputStream">
	//*  42   82:iconst_0        
	//*  43   83:anewarray       Object[]
	//*  44   86:invokestatic    #129 <Method void zzaf.v(String, Object[])>
	//*  45   89:aload_0         
	//*  46   90:getfield        #41  <Field zzak zzbq>
	//*  47   93:aload_3         
	//*  48   94:invokevirtual   #132 <Method void zzak.zza(byte[])>
	//*  49   97:aload           6
	//*  50   99:invokevirtual   #133 <Method void zzau.close()>
	//*  51  102:aload           4
	//*  52  104:areturn         
	//*  53  105:astore          4
	//*  54  107:aload_1         
	//*  55  108:ifnull          127
	//*  56  111:aload_1         
	//*  57  112:invokevirtual   #123 <Method void InputStream.close()>
	//*  58  115:goto            127
	//*  59  118:ldc1            #125 <String "Error occurred when closing InputStream">
	//*  60  120:iconst_0        
	//*  61  121:anewarray       Object[]
	//*  62  124:invokestatic    #129 <Method void zzaf.v(String, Object[])>
	//*  63  127:aload_0         
	//*  64  128:getfield        #41  <Field zzak zzbq>
	//*  65  131:aload_3         
	//*  66  132:invokevirtual   #132 <Method void zzak.zza(byte[])>
	//*  67  135:aload           6
	//*  68  137:invokevirtual   #133 <Method void zzau.close()>
	//*  69  140:aload           4
	//*  70  142:athrow          
			// Misplaced declaration of an exception variable
			catch(InputStream inputstream)
			{
				zzaf.v("Error occurred when closing InputStream", new Object[0]);
			}
		zzbq.zza(abyte0);
		zzau1.close();
		return ((byte []) (obj));
		obj;
_L3:
		if(inputstream != null)
			try
			{
				inputstream.close();
			}
	//*  71  143:astore_1        
	//*  72  144:goto            80
			// Misplaced declaration of an exception variable
			catch(InputStream inputstream)
			{
				zzaf.v("Error occurred when closing InputStream", new Object[0]);
			}
		zzbq.zza(abyte0);
		zzau1.close();
		throw obj;
	//*  73  147:astore_1        
	//*  74  148:goto            118
		Exception exception;
		exception;
	//   75  151:astore          5
		abyte0 = ((byte []) (obj));
	//   76  153:aload           4
	//   77  155:astore_3        
		obj = ((Object) (exception));
	//   78  156:aload           5
	//   79  158:astore          4
		if(true) goto _L3; else goto _L2
	//   80  160:goto            107
_L2:
	}

	public zzp zzc(zzr zzr1)
		throws zzae
	{
		long l = SystemClock.elapsedRealtime();
	//    0    0:invokestatic    #145 <Method long SystemClock.elapsedRealtime()>
	//    1    3:lstore_3        
_L11:
		Object obj5 = ((Object) (Collections.emptyList()));
	//    2    4:invokestatic    #151 <Method List Collections.emptyList()>
	//    3    7:astore          11
		Object obj2 = ((Object) (zzr1.zzf()));
	//    4    9:aload_1         
	//    5   10:invokevirtual   #155 <Method zzc zzr.zzf()>
	//    6   13:astore          8
		if(obj2 != null)
			break MISSING_BLOCK_LABEL_28;
	//    7   15:aload           8
	//    8   17:ifnonnull       28
		Object obj;
		obj = ((Object) (Collections.emptyMap()));
	//    9   20:invokestatic    #159 <Method Map Collections.emptyMap()>
	//   10   23:astore          7
		break MISSING_BLOCK_LABEL_91;
	//   11   25:goto            91
		obj = ((Object) (new HashMap()));
	//   12   28:new             #161 <Class HashMap>
	//   13   31:dup             
	//   14   32:invokespecial   #162 <Method void HashMap()>
	//   15   35:astore          7
		if(((zzc) (obj2)).zza != null)
	//*  16   37:aload           8
	//*  17   39:getfield        #167 <Field String zzc.zza>
	//*  18   42:ifnull          60
			((Map) (obj)).put("If-None-Match", ((Object) (((zzc) (obj2)).zza)));
	//   19   45:aload           7
	//   20   47:ldc1            #169 <String "If-None-Match">
	//   21   49:aload           8
	//   22   51:getfield        #167 <Field String zzc.zza>
	//   23   54:invokeinterface #175 <Method Object Map.put(Object, Object)>
	//   24   59:pop             
		if(((zzc) (obj2)).zzc > 0L)
	//*  25   60:aload           8
	//*  26   62:getfield        #178 <Field long zzc.zzc>
	//*  27   65:lconst_0        
	//*  28   66:lcmp            
	//*  29   67:ifle            969
			((Map) (obj)).put("If-Modified-Since", ((Object) (zzap.zzb(((zzc) (obj2)).zzc))));
	//   30   70:aload           7
	//   31   72:ldc1            #180 <String "If-Modified-Since">
	//   32   74:aload           8
	//   33   76:getfield        #178 <Field long zzc.zzc>
	//   34   79:invokestatic    #185 <Method String zzap.zzb(long)>
	//   35   82:invokeinterface #175 <Method Object Map.put(Object, Object)>
	//   36   87:pop             
	//*  37   88:goto            969
		Object obj3 = ((Object) (zzbp.zza(zzr1, ((Map) (obj)))));
	//   38   91:aload_0         
	//   39   92:getfield        #37  <Field zzai zzbp>
	//   40   95:aload_1         
	//   41   96:aload           7
	//   42   98:invokevirtual   #190 <Method zzaq zzai.zza(zzr, Map)>
	//   43  101:astore          9
		int i;
		long l1;
		IOException ioexception;
		Object obj4;
		IOException ioexception1;
		Object obj6;
		try
		{
			i = ((zzaq) (obj3)).getStatusCode();
	//   44  103:aload           9
	//   45  105:invokevirtual   #195 <Method int zzaq.getStatusCode()>
	//   46  108:istore_2        
			obj2 = ((Object) (((zzaq) (obj3)).zzq()));
	//   47  109:aload           9
	//   48  111:invokevirtual   #198 <Method List zzaq.zzq()>
	//   49  114:astore          8
		}
	//*  50  116:iload_2         
	//*  51  117:sipush          304
	//*  52  120:icmpne          460
	//*  53  123:aload_1         
	//*  54  124:invokevirtual   #155 <Method zzc zzr.zzf()>
	//*  55  127:astore          7
	//*  56  129:aload           7
	//*  57  131:ifnonnull       154
	//*  58  134:new             #200 <Class zzp>
	//*  59  137:dup             
	//*  60  138:sipush          304
	//*  61  141:aconst_null     
	//*  62  142:iconst_1        
	//*  63  143:invokestatic    #145 <Method long SystemClock.elapsedRealtime()>
	//*  64  146:lload_3         
	//*  65  147:lsub            
	//*  66  148:aload           8
	//*  67  150:invokespecial   #203 <Method void zzp(int, byte[], boolean, long, List)>
	//*  68  153:areturn         
	//*  69  154:new             #205 <Class TreeSet>
	//*  70  157:dup             
	//*  71  158:getstatic       #209 <Field java.util.Comparator String.CASE_INSENSITIVE_ORDER>
	//*  72  161:invokespecial   #212 <Method void TreeSet(java.util.Comparator)>
	//*  73  164:astore          10
	//*  74  166:aload           8
	//*  75  168:invokeinterface #218 <Method boolean List.isEmpty()>
	//*  76  173:ifne            219
	//*  77  176:aload           8
	//*  78  178:invokeinterface #222 <Method Iterator List.iterator()>
	//*  79  183:astore          11
	//*  80  185:aload           11
	//*  81  187:invokeinterface #227 <Method boolean Iterator.hasNext()>
	//*  82  192:ifeq            219
	//*  83  195:aload           10
	//*  84  197:aload           11
	//*  85  199:invokeinterface #231 <Method Object Iterator.next()>
	//*  86  204:checkcast       #233 <Class zzl>
	//*  87  207:invokevirtual   #237 <Method String zzl.getName()>
	//*  88  210:invokeinterface #243 <Method boolean Set.add(Object)>
	//*  89  215:pop             
	//*  90  216:goto            185
	//*  91  219:new             #245 <Class ArrayList>
	//*  92  222:dup             
	//*  93  223:aload           8
	//*  94  225:invokespecial   #248 <Method void ArrayList(java.util.Collection)>
	//*  95  228:astore          11
	//*  96  230:aload           7
	//*  97  232:getfield        #252 <Field List zzc.zzg>
	//*  98  235:ifnull          313
	//*  99  238:aload           7
	//* 100  240:getfield        #252 <Field List zzc.zzg>
	//* 101  243:invokeinterface #218 <Method boolean List.isEmpty()>
	//* 102  248:ifne            420
	//* 103  251:aload           7
	//* 104  253:getfield        #252 <Field List zzc.zzg>
	//* 105  256:invokeinterface #222 <Method Iterator List.iterator()>
	//* 106  261:astore          12
	//* 107  263:aload           12
	//* 108  265:invokeinterface #227 <Method boolean Iterator.hasNext()>
	//* 109  270:ifeq            420
	//* 110  273:aload           12
	//* 111  275:invokeinterface #231 <Method Object Iterator.next()>
	//* 112  280:checkcast       #233 <Class zzl>
	//* 113  283:astore          13
	//* 114  285:aload           10
	//* 115  287:aload           13
	//* 116  289:invokevirtual   #237 <Method String zzl.getName()>
	//* 117  292:invokeinterface #255 <Method boolean Set.contains(Object)>
	//* 118  297:ifne            263
	//* 119  300:aload           11
	//* 120  302:aload           13
	//* 121  304:invokeinterface #256 <Method boolean List.add(Object)>
	//* 122  309:pop             
	//* 123  310:goto            263
	//* 124  313:aload           7
	//* 125  315:getfield        #259 <Field Map zzc.zzf>
	//* 126  318:invokeinterface #260 <Method boolean Map.isEmpty()>
	//* 127  323:ifne            420
	//* 128  326:aload           7
	//* 129  328:getfield        #259 <Field Map zzc.zzf>
	//* 130  331:invokeinterface #264 <Method Set Map.entrySet()>
	//* 131  336:invokeinterface #265 <Method Iterator Set.iterator()>
	//* 132  341:astore          12
	//* 133  343:aload           12
	//* 134  345:invokeinterface #227 <Method boolean Iterator.hasNext()>
	//* 135  350:ifeq            420
	//* 136  353:aload           12
	//* 137  355:invokeinterface #231 <Method Object Iterator.next()>
	//* 138  360:checkcast       #267 <Class java.util.Map$Entry>
	//* 139  363:astore          13
	//* 140  365:aload           10
	//* 141  367:aload           13
	//* 142  369:invokeinterface #270 <Method Object java.util.Map$Entry.getKey()>
	//* 143  374:invokeinterface #255 <Method boolean Set.contains(Object)>
	//* 144  379:ifne            343
	//* 145  382:aload           11
	//* 146  384:new             #233 <Class zzl>
	//* 147  387:dup             
	//* 148  388:aload           13
	//* 149  390:invokeinterface #270 <Method Object java.util.Map$Entry.getKey()>
	//* 150  395:checkcast       #79  <Class String>
	//* 151  398:aload           13
	//* 152  400:invokeinterface #273 <Method Object java.util.Map$Entry.getValue()>
	//* 153  405:checkcast       #79  <Class String>
	//* 154  408:invokespecial   #276 <Method void zzl(String, String)>
	//* 155  411:invokeinterface #256 <Method boolean List.add(Object)>
	//* 156  416:pop             
	//* 157  417:goto            343
	//* 158  420:new             #200 <Class zzp>
	//* 159  423:dup             
	//* 160  424:sipush          304
	//* 161  427:aload           7
	//* 162  429:getfield        #280 <Field byte[] zzc.data>
	//* 163  432:iconst_1        
	//* 164  433:invokestatic    #145 <Method long SystemClock.elapsedRealtime()>
	//* 165  436:lload_3         
	//* 166  437:lsub            
	//* 167  438:aload           11
	//* 168  440:invokespecial   #203 <Method void zzp(int, byte[], boolean, long, List)>
	//* 169  443:astore          7
	//* 170  445:aload           7
	//* 171  447:areturn         
	//* 172  448:astore          7
	//* 173  450:aconst_null     
	//* 174  451:astore          11
	//* 175  453:aload           8
	//* 176  455:astore          12
	//* 177  457:goto            708
	//* 178  460:aload           9
	//* 179  462:invokevirtual   #284 <Method InputStream zzaq.getContent()>
	//* 180  465:astore          7
	//* 181  467:aload           7
	//* 182  469:ifnull          488
	//* 183  472:aload_0         
	//* 184  473:aload           7
	//* 185  475:aload           9
	//* 186  477:invokevirtual   #287 <Method int zzaq.getContentLength()>
	//* 187  480:invokespecial   #289 <Method byte[] zza(InputStream, int)>
	//* 188  483:astore          7
	//* 189  485:goto            493
	//* 190  488:iconst_0        
	//* 191  489:newarray        byte[]
	//* 192  491:astore          7
	//* 193  493:invokestatic    #145 <Method long SystemClock.elapsedRealtime()>
	//* 194  496:lload_3         
	//* 195  497:lsub            
	//* 196  498:lstore          5
	//* 197  500:getstatic       #22  <Field boolean DEBUG>
	//* 198  503:ifne            515
	//* 199  506:lload           5
	//* 200  508:ldc2w           #290 <Long 3000L>
	//* 201  511:lcmp            
	//* 202  512:ifle            972
	//* 203  515:aload           7
	//* 204  517:ifnull          552
	//* 205  520:aload           7
	//* 206  522:arraylength     
	//* 207  523:invokestatic    #77  <Method Integer Integer.valueOf(int)>
	//* 208  526:astore          10
	//* 209  528:goto            557
	//* 210  531:astore          10
	//* 211  533:aload           8
	//* 212  535:astore          11
	//* 213  537:aload           10
	//* 214  539:astore          8
	//* 215  541:aload           9
	//* 216  543:astore          10
	//* 217  545:aload           11
	//* 218  547:astore          9
	//* 219  549:goto            692
	//* 220  552:ldc2            #293 <String "null">
	//* 221  555:astore          10
	//* 222  557:ldc2            #295 <String "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]">
	//* 223  560:iconst_5        
	//* 224  561:anewarray       Object[]
	//* 225  564:dup             
	//* 226  565:iconst_0        
	//* 227  566:aload_1         
	//* 228  567:aastore         
	//* 229  568:dup             
	//* 230  569:iconst_1        
	//* 231  570:lload           5
	//* 232  572:invokestatic    #300 <Method Long Long.valueOf(long)>
	//* 233  575:aastore         
	//* 234  576:dup             
	//* 235  577:iconst_2        
	//* 236  578:aload           10
	//* 237  580:aastore         
	//* 238  581:dup             
	//* 239  582:iconst_3        
	//* 240  583:iload_2         
	//* 241  584:invokestatic    #77  <Method Integer Integer.valueOf(int)>
	//* 242  587:aastore         
	//* 243  588:dup             
	//* 244  589:iconst_4        
	//* 245  590:aload_1         
	//* 246  591:invokevirtual   #60  <Method zzab zzr.zzj()>
	//* 247  594:invokeinterface #303 <Method int zzab.zzd()>
	//* 248  599:invokestatic    #77  <Method Integer Integer.valueOf(int)>
	//* 249  602:aastore         
	//* 250  603:invokestatic    #306 <Method void zzaf.d(String, Object[])>
	//* 251  606:goto            972
	//* 252  609:invokestatic    #145 <Method long SystemClock.elapsedRealtime()>
	//* 253  612:lstore          5
	//* 254  614:new             #200 <Class zzp>
	//* 255  617:dup             
	//* 256  618:iload_2         
	//* 257  619:aload           7
	//* 258  621:iconst_0        
	//* 259  622:lload           5
	//* 260  624:lload_3         
	//* 261  625:lsub            
	//* 262  626:aload           8
	//* 263  628:invokespecial   #203 <Method void zzp(int, byte[], boolean, long, List)>
	//* 264  631:areturn         
	//* 265  632:new             #95  <Class IOException>
	//* 266  635:dup             
	//* 267  636:invokespecial   #307 <Method void IOException()>
	//* 268  639:athrow          
	//* 269  640:astore          10
	//* 270  642:goto            647
	//* 271  645:astore          10
	//* 272  647:aload           8
	//* 273  649:astore          11
	//* 274  651:aload           10
	//* 275  653:astore          8
	//* 276  655:aload           9
	//* 277  657:astore          10
	//* 278  659:aload           11
	//* 279  661:astore          9
	//* 280  663:goto            692
	//* 281  666:astore          7
	//* 282  668:goto            450
		// Misplaced declaration of an exception variable
		catch(IOException ioexception)
	//* 283  671:astore          8
		{
			ioexception1 = ((IOException) (obj3));
	//  284  673:aload           9
	//  285  675:astore          10
			break MISSING_BLOCK_LABEL_685;
	//  286  677:goto            685
		}
		if(i != 304) goto _L2; else goto _L1
_L1:
		obj = ((Object) (zzr1.zzf()));
		if(obj != null)
			break MISSING_BLOCK_LABEL_154;
		return new zzp(304, ((byte []) (null)), true, SystemClock.elapsedRealtime() - l, ((List) (obj2)));
		obj4 = ((Object) (new TreeSet(String.CASE_INSENSITIVE_ORDER)));
		if(!((List) (obj2)).isEmpty())
			for(obj5 = ((Object) (((List) (obj2)).iterator())); ((Iterator) (obj5)).hasNext(); ((Set) (obj4)).add(((Object) (((zzl)((Iterator) (obj5)).next()).getName()))));
		obj5 = ((Object) (new ArrayList(((java.util.Collection) (obj2)))));
		if(((zzc) (obj)).zzg != null)
		{
			if(!((zzc) (obj)).zzg.isEmpty())
			{
				Iterator iterator = ((zzc) (obj)).zzg.iterator();
				do
				{
					if(!iterator.hasNext())
						break;
					zzl zzl1 = (zzl)iterator.next();
					if(!((Set) (obj4)).contains(((Object) (zzl1.getName()))))
						((List) (obj5)).add(((Object) (zzl1)));
				} while(true);
			}
			break MISSING_BLOCK_LABEL_420;
		}
		if(!((zzc) (obj)).zzf.isEmpty())
		{
			Iterator iterator1 = ((zzc) (obj)).zzf.entrySet().iterator();
			do
			{
				if(!iterator1.hasNext())
					break;
				java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
				if(!((Set) (obj4)).contains(entry.getKey()))
					((List) (obj5)).add(((Object) (new zzl((String)entry.getKey(), (String)entry.getValue()))));
			} while(true);
		}
		obj = ((Object) (new zzp(304, ((zzc) (obj)).data, true, SystemClock.elapsedRealtime() - l, ((List) (obj5)))));
		return ((zzp) (obj));
		obj;
_L10:
		obj5 = null;
		obj6 = obj2;
		  goto _L3
_L2:
		obj = ((Object) (((zzaq) (obj3)).getContent()));
		if(obj == null)
			break MISSING_BLOCK_LABEL_488;
		obj = ((Object) (zza(((InputStream) (obj)), ((zzaq) (obj3)).getContentLength())));
		break MISSING_BLOCK_LABEL_493;
		obj = ((Object) (new byte[0]));
		l1 = SystemClock.elapsedRealtime() - l;
		if(!DEBUG && l1 <= 3000L) goto _L5; else goto _L4
_L4:
		if(obj == null) goto _L7; else goto _L6
_L6:
		obj4 = ((Object) (Integer.valueOf(obj.length)));
		  goto _L8
		obj4;
		obj5 = obj2;
		obj2 = obj4;
		obj4 = obj3;
		obj3 = obj5;
		  goto _L9
_L7:
		obj4 = "null";
_L8:
		zzaf.d("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[] {
			zzr1, Long.valueOf(l1), obj4, Integer.valueOf(i), Integer.valueOf(zzr1.zzj().zzd())
		});
		  goto _L5
_L15:
		l1 = SystemClock.elapsedRealtime();
		return new zzp(i, ((byte []) (obj)), false, l1 - l, ((List) (obj2)));
_L14:
		throw new IOException();
		obj4;
		break MISSING_BLOCK_LABEL_647;
		ioexception1;
		obj5 = obj2;
		ioexception = ioexception1;
		ioexception1 = ((IOException) (obj3));
		obj3 = obj5;
		  goto _L9
		obj;
		  goto _L10
		ioexception;
	//  287  680:astore          8
		ioexception1 = null;
	//  288  682:aconst_null     
	//  289  683:astore          10
		obj3 = obj5;
	//  290  685:aload           11
	//  291  687:astore          9
		obj = null;
	//  292  689:aconst_null     
	//  293  690:astore          7
_L9:
		obj6 = obj3;
	//  294  692:aload           9
	//  295  694:astore          12
		obj5 = obj;
	//  296  696:aload           7
	//  297  698:astore          11
		obj3 = ((Object) (ioexception1));
	//  298  700:aload           10
	//  299  702:astore          9
		obj = ((Object) (ioexception));
	//  300  704:aload           8
	//  301  706:astore          7
_L3:
		if(obj3 != null)
	//* 302  708:aload           9
	//* 303  710:ifnull          879
		{
label0:
			{
				i = ((zzaq) (obj3)).getStatusCode();
	//  304  713:aload           9
	//  305  715:invokevirtual   #195 <Method int zzaq.getStatusCode()>
	//  306  718:istore_2        
				zzaf.e("Unexpected response code %d for %s", new Object[] {
					Integer.valueOf(i), zzr1.getUrl()
				});
	//  307  719:ldc2            #309 <String "Unexpected response code %d for %s">
	//  308  722:iconst_2        
	//  309  723:anewarray       Object[]
	//  310  726:dup             
	//  311  727:iconst_0        
	//  312  728:iload_2         
	//  313  729:invokestatic    #77  <Method Integer Integer.valueOf(int)>
	//  314  732:aastore         
	//  315  733:dup             
	//  316  734:iconst_1        
	//  317  735:aload_1         
	//  318  736:invokevirtual   #312 <Method String zzr.getUrl()>
	//  319  739:aastore         
	//  320  740:invokestatic    #315 <Method void zzaf.e(String, Object[])>
				if(obj5 == null)
					break label0;
	//  321  743:aload           11
	//  322  745:ifnull          862
				obj = ((Object) (new zzp(i, ((byte []) (obj5)), false, SystemClock.elapsedRealtime() - l, ((List) (obj6)))));
	//  323  748:new             #200 <Class zzp>
	//  324  751:dup             
	//  325  752:iload_2         
	//  326  753:aload           11
	//  327  755:iconst_0        
	//  328  756:invokestatic    #145 <Method long SystemClock.elapsedRealtime()>
	//  329  759:lload_3         
	//  330  760:lsub            
	//  331  761:aload           12
	//  332  763:invokespecial   #203 <Method void zzp(int, byte[], boolean, long, List)>
	//  333  766:astore          7
				if(i != 401 && i != 403)
	//* 334  768:iload_2         
	//* 335  769:sipush          401
	//* 336  772:icmpeq          843
	//* 337  775:iload_2         
	//* 338  776:sipush          403
	//* 339  779:icmpne          785
	//* 340  782:goto            843
				{
					if(i >= 400 && i <= 499)
	//* 341  785:iload_2         
	//* 342  786:sipush          400
	//* 343  789:icmplt          809
	//* 344  792:iload_2         
	//* 345  793:sipush          499
	//* 346  796:icmpgt          809
						throw new zzg(((zzp) (obj)));
	//  347  799:new             #317 <Class zzg>
	//  348  802:dup             
	//  349  803:aload           7
	//  350  805:invokespecial   #320 <Method void zzg(zzp)>
	//  351  808:athrow          
					if(i >= 500 && i <= 599)
	//* 352  809:iload_2         
	//* 353  810:sipush          500
	//* 354  813:icmplt          833
	//* 355  816:iload_2         
	//* 356  817:sipush          599
	//* 357  820:icmpgt          833
						throw new zzac(((zzp) (obj)));
	//  358  823:new             #97  <Class zzac>
	//  359  826:dup             
	//  360  827:aload           7
	//  361  829:invokespecial   #321 <Method void zzac(zzp)>
	//  362  832:athrow          
					else
						throw new zzac(((zzp) (obj)));
	//  363  833:new             #97  <Class zzac>
	//  364  836:dup             
	//  365  837:aload           7
	//  366  839:invokespecial   #321 <Method void zzac(zzp)>
	//  367  842:athrow          
				}
				zza("auth", zzr1, ((zzae) (new zza(((zzp) (obj))))));
	//  368  843:ldc2            #323 <String "auth">
	//  369  846:aload_1         
	//  370  847:new             #325 <Class zza>
	//  371  850:dup             
	//  372  851:aload           7
	//  373  853:invokespecial   #326 <Method void zza(zzp)>
	//  374  856:invokestatic    #328 <Method void zza(String, zzr, zzae)>
			}
		} else
	//* 375  859:goto            4
	//* 376  862:ldc2            #330 <String "network">
	//* 377  865:astore          7
	//* 378  867:new             #332 <Class zzo>
	//* 379  870:dup             
	//* 380  871:invokespecial   #333 <Method void zzo()>
	//* 381  874:astore          8
	//* 382  876:goto            953
		{
			throw new zzq(((Throwable) (obj)));
	//  383  879:new             #335 <Class zzq>
	//  384  882:dup             
	//  385  883:aload           7
	//  386  885:invokespecial   #338 <Method void zzq(Throwable)>
	//  387  888:athrow          
		}
		  goto _L11
		obj = "network";
		ioexception = ((IOException) (new zzo()));
		  goto _L12
		Object obj1;
		obj1;
	//  388  889:astore          7
		zzr1 = ((zzr) (String.valueOf(((Object) (zzr1.getUrl())))));
	//  389  891:aload_1         
	//  390  892:invokevirtual   #312 <Method String zzr.getUrl()>
	//  391  895:invokestatic    #341 <Method String String.valueOf(Object)>
	//  392  898:astore_1        
		if(((String) (zzr1)).length() != 0)
	//* 393  899:aload_1         
	//* 394  900:invokevirtual   #344 <Method int String.length()>
	//* 395  903:ifeq            917
			zzr1 = ((zzr) ("Bad URL ".concat(((String) (zzr1)))));
	//  396  906:ldc2            #346 <String "Bad URL ">
	//  397  909:aload_1         
	//  398  910:invokevirtual   #350 <Method String String.concat(String)>
	//  399  913:astore_1        
		else
	//* 400  914:goto            928
			zzr1 = ((zzr) (new String("Bad URL ")));
	//  401  917:new             #79  <Class String>
	//  402  920:dup             
	//  403  921:ldc2            #346 <String "Bad URL ">
	//  404  924:invokespecial   #352 <Method void String(String)>
	//  405  927:astore_1        
		throw new RuntimeException(((String) (zzr1)), ((Throwable) (obj1)));
	//  406  928:new             #354 <Class RuntimeException>
	//  407  931:dup             
	//  408  932:aload_1         
	//  409  933:aload           7
	//  410  935:invokespecial   #357 <Method void RuntimeException(String, Throwable)>
	//  411  938:athrow          
_L13:
		obj1 = "socket";
	//  412  939:ldc2            #359 <String "socket">
	//  413  942:astore          7
		ioexception = ((IOException) (new zzad()));
	//  414  944:new             #361 <Class zzad>
	//  415  947:dup             
	//  416  948:invokespecial   #362 <Method void zzad()>
	//  417  951:astore          8
_L12:
		zza(((String) (obj1)), zzr1, ((zzae) (ioexception)));
	//  418  953:aload           7
	//  419  955:aload_1         
	//  420  956:aload           8
	//  421  958:invokestatic    #328 <Method void zza(String, zzr, zzae)>
		  goto _L11
	//* 422  961:goto            4
		obj1;
	//  423  964:astore          7
		  goto _L13
	//* 424  966:goto            939
	//* 425  969:goto            91
_L5:
		if(i >= 200 && i <= 299) goto _L15; else goto _L14
	//  426  972:iload_2         
	//  427  973:sipush          200
	//  428  976:icmplt          632
	//  429  979:iload_2         
	//  430  980:sipush          299
	//  431  983:icmple          609
	//* 432  986:goto            632
	}

	private static final boolean DEBUG;
	private final zzar zzbo;
	private final zzai zzbp;
	private final zzak zzbq;

	static 
	{
		DEBUG = zzaf.DEBUG;
	//    0    0:getstatic       #21  <Field boolean zzaf.DEBUG>
	//    1    3:putstatic       #22  <Field boolean DEBUG>
	//*   2    6:return          
	}
}
