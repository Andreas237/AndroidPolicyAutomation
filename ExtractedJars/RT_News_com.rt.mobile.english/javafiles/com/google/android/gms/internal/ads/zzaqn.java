// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.Clock;
import java.io.*;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.text.DecimalFormat;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaqh, zzakb, zznk, zzkb, 
//			zzni, zzamu, zzamy, zzamj, 
//			zzaqi, zzajm, zzapw

public final class zzaqn extends zzaqh
{

	public zzaqn(zzapw zzapw)
	{
		super(zzapw);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #42  <Method void zzaqh(zzapw)>
		zzapw = ((zzapw) (mContext.getCacheDir()));
	//    3    5:aload_0         
	//    4    6:getfield        #46  <Field Context mContext>
	//    5    9:invokevirtual   #52  <Method File Context.getCacheDir()>
	//    6   12:astore_1        
		if(zzapw == null)
	//*   7   13:aload_1         
	//*   8   14:ifnonnull       23
		{
			zzakb.zzdk("Context.getCacheDir() returned null");
	//    9   17:ldc1            #54  <String "Context.getCacheDir() returned null">
	//   10   19:invokestatic    #59  <Method void zzakb.zzdk(String)>
			return;
	//   11   22:return          
		}
		zzdbi = new File(((File) (zzapw)), "admobVideoStreams");
	//   12   23:aload_0         
	//   13   24:new             #61  <Class File>
	//   14   27:dup             
	//   15   28:aload_1         
	//   16   29:ldc1            #63  <String "admobVideoStreams">
	//   17   31:invokespecial   #66  <Method void File(File, String)>
	//   18   34:putfield        #68  <Field File zzdbi>
		if(!zzdbi.isDirectory() && !zzdbi.mkdirs())
	//*  19   37:aload_0         
	//*  20   38:getfield        #68  <Field File zzdbi>
	//*  21   41:invokevirtual   #72  <Method boolean File.isDirectory()>
	//*  22   44:ifne            105
	//*  23   47:aload_0         
	//*  24   48:getfield        #68  <Field File zzdbi>
	//*  25   51:invokevirtual   #75  <Method boolean File.mkdirs()>
	//*  26   54:ifne            105
		{
			zzapw = ((zzapw) (String.valueOf(((Object) (zzdbi.getAbsolutePath())))));
	//   27   57:aload_0         
	//   28   58:getfield        #68  <Field File zzdbi>
	//   29   61:invokevirtual   #79  <Method String File.getAbsolutePath()>
	//   30   64:invokestatic    #85  <Method String String.valueOf(Object)>
	//   31   67:astore_1        
			if(((String) (zzapw)).length() != 0)
	//*  32   68:aload_1         
	//*  33   69:invokevirtual   #89  <Method int String.length()>
	//*  34   72:ifeq            85
				zzapw = ((zzapw) ("Could not create preload cache directory at ".concat(((String) (zzapw)))));
	//   35   75:ldc1            #91  <String "Could not create preload cache directory at ">
	//   36   77:aload_1         
	//   37   78:invokevirtual   #95  <Method String String.concat(String)>
	//   38   81:astore_1        
			else
	//*  39   82:goto            95
				zzapw = ((zzapw) (new String("Could not create preload cache directory at ")));
	//   40   85:new             #81  <Class String>
	//   41   88:dup             
	//   42   89:ldc1            #91  <String "Could not create preload cache directory at ">
	//   43   91:invokespecial   #96  <Method void String(String)>
	//   44   94:astore_1        
			zzakb.zzdk(((String) (zzapw)));
	//   45   95:aload_1         
	//   46   96:invokestatic    #59  <Method void zzakb.zzdk(String)>
			zzdbi = null;
	//   47   99:aload_0         
	//   48  100:aconst_null     
	//   49  101:putfield        #68  <Field File zzdbi>
			return;
	//   50  104:return          
		}
		if(zzdbi.setReadable(true, false) && zzdbi.setExecutable(true, false))
	//*  51  105:aload_0         
	//*  52  106:getfield        #68  <Field File zzdbi>
	//*  53  109:iconst_1        
	//*  54  110:iconst_0        
	//*  55  111:invokevirtual   #100 <Method boolean File.setReadable(boolean, boolean)>
	//*  56  114:ifeq            133
	//*  57  117:aload_0         
	//*  58  118:getfield        #68  <Field File zzdbi>
	//*  59  121:iconst_1        
	//*  60  122:iconst_0        
	//*  61  123:invokevirtual   #103 <Method boolean File.setExecutable(boolean, boolean)>
	//*  62  126:ifne            132
	//*  63  129:goto            133
			return;
	//   64  132:return          
		zzapw = ((zzapw) (String.valueOf(((Object) (zzdbi.getAbsolutePath())))));
	//   65  133:aload_0         
	//   66  134:getfield        #68  <Field File zzdbi>
	//   67  137:invokevirtual   #79  <Method String File.getAbsolutePath()>
	//   68  140:invokestatic    #85  <Method String String.valueOf(Object)>
	//   69  143:astore_1        
		if(((String) (zzapw)).length() != 0)
	//*  70  144:aload_1         
	//*  71  145:invokevirtual   #89  <Method int String.length()>
	//*  72  148:ifeq            161
			zzapw = ((zzapw) ("Could not set cache file permissions at ".concat(((String) (zzapw)))));
	//   73  151:ldc1            #105 <String "Could not set cache file permissions at ">
	//   74  153:aload_1         
	//   75  154:invokevirtual   #95  <Method String String.concat(String)>
	//   76  157:astore_1        
		else
	//*  77  158:goto            171
			zzapw = ((zzapw) (new String("Could not set cache file permissions at ")));
	//   78  161:new             #81  <Class String>
	//   79  164:dup             
	//   80  165:ldc1            #105 <String "Could not set cache file permissions at ">
	//   81  167:invokespecial   #96  <Method void String(String)>
	//   82  170:astore_1        
		zzakb.zzdk(((String) (zzapw)));
	//   83  171:aload_1         
	//   84  172:invokestatic    #59  <Method void zzakb.zzdk(String)>
		zzdbi = null;
	//   85  175:aload_0         
	//   86  176:aconst_null     
	//   87  177:putfield        #68  <Field File zzdbi>
	//   88  180:return          
	}

	private final File zzc(File file)
	{
		return new File(zzdbi, String.valueOf(((Object) (file.getName()))).concat(".done"));
	//    0    0:new             #61  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #68  <Field File zzdbi>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #110 <Method String File.getName()>
	//    6   12:invokestatic    #85  <Method String String.valueOf(Object)>
	//    7   15:ldc1            #112 <String ".done">
	//    8   17:invokevirtual   #95  <Method String String.concat(String)>
	//    9   20:invokespecial   #66  <Method void File(File, String)>
	//   10   23:areturn         
	}

	public final void abort()
	{
		zzdbj = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #115 <Field boolean zzdbj>
	//    3    5:return          
	}

	public final boolean zzdp(String s)
	{
		Object obj;
		Object obj5;
		obj = ((Object) (zzdbi));
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field File zzdbi>
	//    2    4:astore          14
		obj5 = null;
	//    3    6:aconst_null     
	//    4    7:astore          17
		if(obj != null) goto _L2; else goto _L1
	//    5    9:aload           14
	//    6   11:ifnonnull       29
_L1:
		obj = "noCacheDir";
	//    7   14:ldc1            #125 <String "noCacheDir">
	//    8   16:astore          14
_L8:
		((zzaqh)this).zza(s, ((String) (null)), ((String) (obj)), ((String) (null)));
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:aconst_null     
	//   12   21:aload           14
	//   13   23:aconst_null     
	//   14   24:invokevirtual   #129 <Method void zzaqh.zza(String, String, String, String)>
		return false;
	//   15   27:iconst_0        
	//   16   28:ireturn         
_L2:
		int l1;
		if(zzdbi == null)
	//*  17   29:aload_0         
	//*  18   30:getfield        #68  <Field File zzdbi>
	//*  19   33:ifnonnull       42
		{
			l1 = 0;
	//   20   36:iconst_0        
	//   21   37:istore          4
		} else
	//*  22   39:goto            102
		{
			obj = ((Object) (zzdbi.listFiles()));
	//   23   42:aload_0         
	//   24   43:getfield        #68  <Field File zzdbi>
	//   25   46:invokevirtual   #133 <Method File[] File.listFiles()>
	//   26   49:astore          14
			int k2 = obj.length;
	//   27   51:aload           14
	//   28   53:arraylength     
	//   29   54:istore          5
			int i1 = 0;
	//   30   56:iconst_0        
	//   31   57:istore_3        
			int i = i1;
	//   32   58:iload_3         
	//   33   59:istore_2        
			do
			{
				l1 = i;
	//   34   60:iload_2         
	//   35   61:istore          4
				if(i1 >= k2)
					break;
	//   36   63:iload_3         
	//   37   64:iload           5
	//   38   66:icmpge          102
				l1 = i;
	//   39   69:iload_2         
	//   40   70:istore          4
				if(!obj[i1].getName().endsWith(".done"))
	//*  41   72:aload           14
	//*  42   74:iload_3         
	//*  43   75:aaload          
	//*  44   76:invokevirtual   #110 <Method String File.getName()>
	//*  45   79:ldc1            #112 <String ".done">
	//*  46   81:invokevirtual   #136 <Method boolean String.endsWith(String)>
	//*  47   84:ifne            92
					l1 = i + 1;
	//   48   87:iload_2         
	//   49   88:iconst_1        
	//   50   89:iadd            
	//   51   90:istore          4
				i1++;
	//   52   92:iload_3         
	//   53   93:iconst_1        
	//   54   94:iadd            
	//   55   95:istore_3        
				i = l1;
	//   56   96:iload           4
	//   57   98:istore_2        
			} while(true);
	//   58   99:goto            60
		}
		obj = ((Object) (zznk.zzaux));
	//   59  102:getstatic       #142 <Field zzna zznk.zzaux>
	//   60  105:astore          14
		if(l1 <= ((Integer)zzkb.zzik().zzd(((zzna) (obj)))).intValue())
			break; /* Loop/switch isn't completed */
	//   61  107:iload           4
	//   62  109:invokestatic    #148 <Method zzni zzkb.zzik()>
	//   63  112:aload           14
	//   64  114:invokevirtual   #154 <Method Object zzni.zzd(zzna)>
	//   65  117:checkcast       #156 <Class Integer>
	//   66  120:invokevirtual   #159 <Method int Integer.intValue()>
	//   67  123:icmple          299
		if(zzdbi != null) goto _L4; else goto _L3
	//   68  126:aload_0         
	//   69  127:getfield        #68  <Field File zzdbi>
	//   70  130:ifnonnull       139
_L3:
		boolean flag;
		flag = false;
	//   71  133:iconst_0        
	//   72  134:istore          6
		continue; /* Loop/switch isn't completed */
	//   73  136:goto            282
_L4:
		File afile[] = zzdbi.listFiles();
	//   74  139:aload_0         
	//   75  140:getfield        #68  <Field File zzdbi>
	//   76  143:invokevirtual   #133 <Method File[] File.listFiles()>
	//   77  146:astore          18
		int j1 = afile.length;
	//   78  148:aload           18
	//   79  150:arraylength     
	//   80  151:istore_3        
		long l3 = 0xffffffffL;
	//   81  152:ldc2w           #160 <Long 0xffffffffL>
	//   82  155:lstore          8
		obj = null;
	//   83  157:aconst_null     
	//   84  158:astore          14
		for(int j = 0; j < j1;)
	//*  85  160:iconst_0        
	//*  86  161:istore_2        
	//*  87  162:iload_2         
	//*  88  163:iload_3         
	//*  89  164:icmpge          240
		{
			File file = afile[j];
	//   90  167:aload           18
	//   91  169:iload_2         
	//   92  170:aaload          
	//   93  171:astore          16
			Object obj2 = obj;
	//   94  173:aload           14
	//   95  175:astore          15
			long l5 = l3;
	//   96  177:lload           8
	//   97  179:lstore          10
			if(!file.getName().endsWith(".done"))
	//*  98  181:aload           16
	//*  99  183:invokevirtual   #110 <Method String File.getName()>
	//* 100  186:ldc1            #112 <String ".done">
	//* 101  188:invokevirtual   #136 <Method boolean String.endsWith(String)>
	//* 102  191:ifne            225
			{
				long l7 = file.lastModified();
	//  103  194:aload           16
	//  104  196:invokevirtual   #165 <Method long File.lastModified()>
	//  105  199:lstore          12
				obj2 = obj;
	//  106  201:aload           14
	//  107  203:astore          15
				l5 = l3;
	//  108  205:lload           8
	//  109  207:lstore          10
				if(l7 < l3)
	//* 110  209:lload           12
	//* 111  211:lload           8
	//* 112  213:lcmp            
	//* 113  214:ifge            225
				{
					obj2 = ((Object) (file));
	//  114  217:aload           16
	//  115  219:astore          15
					l5 = l7;
	//  116  221:lload           12
	//  117  223:lstore          10
				}
			}
			j++;
	//  118  225:iload_2         
	//  119  226:iconst_1        
	//  120  227:iadd            
	//  121  228:istore_2        
			obj = obj2;
	//  122  229:aload           15
	//  123  231:astore          14
			l3 = l5;
	//  124  233:lload           10
	//  125  235:lstore          8
		}

	//* 126  237:goto            162
		if(obj == null) goto _L3; else goto _L5
	//  127  240:aload           14
	//  128  242:ifnull          133
_L5:
		boolean flag2 = ((File) (obj)).delete();
	//  129  245:aload           14
	//  130  247:invokevirtual   #168 <Method boolean File.delete()>
	//  131  250:istore          7
		obj = ((Object) (zzc(((File) (obj)))));
	//  132  252:aload_0         
	//  133  253:aload           14
	//  134  255:invokespecial   #170 <Method File zzc(File)>
	//  135  258:astore          14
		flag = flag2;
	//  136  260:iload           7
	//  137  262:istore          6
		if(((File) (obj)).isFile())
	//* 138  264:aload           14
	//* 139  266:invokevirtual   #173 <Method boolean File.isFile()>
	//* 140  269:ifeq            282
			flag = flag2 & ((File) (obj)).delete();
	//  141  272:iload           7
	//  142  274:aload           14
	//  143  276:invokevirtual   #168 <Method boolean File.delete()>
	//  144  279:iand            
	//  145  280:istore          6
		if(flag) goto _L2; else goto _L6
	//  146  282:iload           6
	//  147  284:ifne            29
_L6:
		zzakb.zzdk("Unable to expire stream cache");
	//  148  287:ldc1            #175 <String "Unable to expire stream cache">
	//  149  289:invokestatic    #59  <Method void zzakb.zzdk(String)>
		obj = "expireFailed";
	//  150  292:ldc1            #177 <String "expireFailed">
	//  151  294:astore          14
		if(true) goto _L8; else goto _L7
	//  152  296:goto            18
_L7:
		String s2;
		File file1;
		File file2;
		zzkb.zzif();
	//  153  299:invokestatic    #181 <Method zzamu zzkb.zzif()>
	//  154  302:pop             
		obj = ((Object) (zzamu.zzde(s)));
	//  155  303:aload_1         
	//  156  304:invokestatic    #186 <Method String zzamu.zzde(String)>
	//  157  307:astore          14
		file1 = new File(zzdbi, ((String) (obj)));
	//  158  309:new             #61  <Class File>
	//  159  312:dup             
	//  160  313:aload_0         
	//  161  314:getfield        #68  <Field File zzdbi>
	//  162  317:aload           14
	//  163  319:invokespecial   #66  <Method void File(File, String)>
	//  164  322:astore          22
		file2 = zzc(file1);
	//  165  324:aload_0         
	//  166  325:aload           22
	//  167  327:invokespecial   #170 <Method File zzc(File)>
	//  168  330:astore          23
		if(file1.isFile() && file2.isFile())
	//* 169  332:aload           22
	//* 170  334:invokevirtual   #173 <Method boolean File.isFile()>
	//* 171  337:ifeq            410
	//* 172  340:aload           23
	//* 173  342:invokevirtual   #173 <Method boolean File.isFile()>
	//* 174  345:ifeq            410
		{
			int k = (int)file1.length();
	//  175  348:aload           22
	//  176  350:invokevirtual   #188 <Method long File.length()>
	//  177  353:l2i             
	//  178  354:istore_2        
			obj = ((Object) (String.valueOf(((Object) (s)))));
	//  179  355:aload_1         
	//  180  356:invokestatic    #85  <Method String String.valueOf(Object)>
	//  181  359:astore          14
			if(((String) (obj)).length() != 0)
	//* 182  361:aload           14
	//* 183  363:invokevirtual   #89  <Method int String.length()>
	//* 184  366:ifeq            381
				obj = ((Object) ("Stream cache hit at ".concat(((String) (obj)))));
	//  185  369:ldc1            #190 <String "Stream cache hit at ">
	//  186  371:aload           14
	//  187  373:invokevirtual   #95  <Method String String.concat(String)>
	//  188  376:astore          14
			else
	//* 189  378:goto            392
				obj = ((Object) (new String("Stream cache hit at ")));
	//  190  381:new             #81  <Class String>
	//  191  384:dup             
	//  192  385:ldc1            #190 <String "Stream cache hit at ">
	//  193  387:invokespecial   #96  <Method void String(String)>
	//  194  390:astore          14
			zzakb.zzck(((String) (obj)));
	//  195  392:aload           14
	//  196  394:invokestatic    #193 <Method void zzakb.zzck(String)>
			((zzaqh)this).zza(s, file1.getAbsolutePath(), k);
	//  197  397:aload_0         
	//  198  398:aload_1         
	//  199  399:aload           22
	//  200  401:invokevirtual   #79  <Method String File.getAbsolutePath()>
	//  201  404:iload_2         
	//  202  405:invokevirtual   #196 <Method void zzaqh.zza(String, String, int)>
			return true;
	//  203  408:iconst_1        
	//  204  409:ireturn         
		}
		obj = ((Object) (String.valueOf(((Object) (zzdbi.getAbsolutePath())))));
	//  205  410:aload_0         
	//  206  411:getfield        #68  <Field File zzdbi>
	//  207  414:invokevirtual   #79  <Method String File.getAbsolutePath()>
	//  208  417:invokestatic    #85  <Method String String.valueOf(Object)>
	//  209  420:astore          14
		String s1 = String.valueOf(((Object) (s)));
	//  210  422:aload_1         
	//  211  423:invokestatic    #85  <Method String String.valueOf(Object)>
	//  212  426:astore          15
		if(s1.length() != 0)
	//* 213  428:aload           15
	//* 214  430:invokevirtual   #89  <Method int String.length()>
	//* 215  433:ifeq            448
			s2 = ((String) (obj)).concat(s1);
	//  216  436:aload           14
	//  217  438:aload           15
	//  218  440:invokevirtual   #95  <Method String String.concat(String)>
	//  219  443:astore          18
		else
	//* 220  445:goto            459
			s2 = new String(((String) (obj)));
	//  221  448:new             #81  <Class String>
	//  222  451:dup             
	//  223  452:aload           14
	//  224  454:invokespecial   #96  <Method void String(String)>
	//  225  457:astore          18
		Object obj3 = ((Object) (zzdbg));
	//  226  459:getstatic       #29  <Field Set zzdbg>
	//  227  462:astore          15
		obj3;
	//  228  464:aload           15
		JVM INSTR monitorenter ;
	//  229  466:monitorenter    
		if(!zzdbg.contains(((Object) (s2))))
			break MISSING_BLOCK_LABEL_540;
	//  230  467:getstatic       #29  <Field Set zzdbg>
	//  231  470:aload           18
	//  232  472:invokeinterface #202 <Method boolean Set.contains(Object)>
	//  233  477:ifeq            540
		obj = ((Object) (String.valueOf(((Object) (s)))));
	//  234  480:aload_1         
	//  235  481:invokestatic    #85  <Method String String.valueOf(Object)>
	//  236  484:astore          14
		if(((String) (obj)).length() != 0)
	//* 237  486:aload           14
	//* 238  488:invokevirtual   #89  <Method int String.length()>
	//* 239  491:ifeq            506
		{
			obj = ((Object) ("Stream cache already in progress at ".concat(((String) (obj)))));
	//  240  494:ldc1            #204 <String "Stream cache already in progress at ">
	//  241  496:aload           14
	//  242  498:invokevirtual   #95  <Method String String.concat(String)>
	//  243  501:astore          14
			break MISSING_BLOCK_LABEL_517;
	//  244  503:goto            517
		}
		obj = ((Object) (new String("Stream cache already in progress at ")));
	//  245  506:new             #81  <Class String>
	//  246  509:dup             
	//  247  510:ldc1            #204 <String "Stream cache already in progress at ">
	//  248  512:invokespecial   #96  <Method void String(String)>
	//  249  515:astore          14
		zzakb.zzdk(((String) (obj)));
	//  250  517:aload           14
	//  251  519:invokestatic    #59  <Method void zzakb.zzdk(String)>
		((zzaqh)this).zza(s, file1.getAbsolutePath(), "inProgress", ((String) (null)));
	//  252  522:aload_0         
	//  253  523:aload_1         
	//  254  524:aload           22
	//  255  526:invokevirtual   #79  <Method String File.getAbsolutePath()>
	//  256  529:ldc1            #206 <String "inProgress">
	//  257  531:aconst_null     
	//  258  532:invokevirtual   #129 <Method void zzaqh.zza(String, String, String, String)>
		obj3;
	//  259  535:aload           15
		JVM INSTR monitorexit ;
	//  260  537:monitorexit     
		return false;
	//  261  538:iconst_0        
	//  262  539:ireturn         
		zzdbg.add(((Object) (s2)));
	//  263  540:getstatic       #29  <Field Set zzdbg>
	//  264  543:aload           18
	//  265  545:invokeinterface #209 <Method boolean Set.add(Object)>
	//  266  550:pop             
		obj3;
	//  267  551:aload           15
		JVM INSTR monitorexit ;
	//  268  553:monitorexit     
		int k1;
		zzbv.zzew();
	//  269  554:invokestatic    #215 <Method zzaok zzbv.zzew()>
	//  270  557:pop             
		obj = ((Object) (zznk.zzavc));
	//  271  558:getstatic       #218 <Field zzna zznk.zzavc>
	//  272  561:astore          14
		k1 = ((Integer)zzkb.zzik().zzd(((zzna) (obj)))).intValue();
	//  273  563:invokestatic    #148 <Method zzni zzkb.zzik()>
	//  274  566:aload           14
	//  275  568:invokevirtual   #154 <Method Object zzni.zzd(zzna)>
	//  276  571:checkcast       #156 <Class Integer>
	//  277  574:invokevirtual   #159 <Method int Integer.intValue()>
	//  278  577:istore_3        
		obj = ((Object) (new URL(s)));
	//  279  578:new             #220 <Class URL>
	//  280  581:dup             
	//  281  582:aload_1         
	//  282  583:invokespecial   #221 <Method void URL(String)>
	//  283  586:astore          14
		int l = 0;
	//  284  588:iconst_0        
	//  285  589:istore_2        
_L13:
		l++;
	//  286  590:iload_2         
	//  287  591:iconst_1        
	//  288  592:iadd            
	//  289  593:istore_2        
		if(l > 20)
			break; /* Loop/switch isn't completed */
	//  290  594:iload_2         
	//  291  595:bipush          20
	//  292  597:icmpgt          2125
		obj3 = ((Object) (((URL) (obj)).openConnection()));
	//  293  600:aload           14
	//  294  602:invokevirtual   #225 <Method URLConnection URL.openConnection()>
	//  295  605:astore          15
		((URLConnection) (obj3)).setConnectTimeout(k1);
	//  296  607:aload           15
	//  297  609:iload_3         
	//  298  610:invokevirtual   #231 <Method void URLConnection.setConnectTimeout(int)>
		((URLConnection) (obj3)).setReadTimeout(k1);
	//  299  613:aload           15
	//  300  615:iload_3         
	//  301  616:invokevirtual   #234 <Method void URLConnection.setReadTimeout(int)>
		flag = obj3 instanceof HttpURLConnection;
	//  302  619:aload           15
	//  303  621:instanceof      #236 <Class HttpURLConnection>
	//  304  624:istore          6
		if(flag) goto _L10; else goto _L9
	//  305  626:iload           6
	//  306  628:ifne            653
_L9:
		Object obj4;
		try
		{
			throw new IOException("Invalid protocol.");
	//  307  631:new             #119 <Class IOException>
	//  308  634:dup             
	//  309  635:ldc1            #238 <String "Invalid protocol.">
	//  310  637:invokespecial   #239 <Method void IOException(String)>
	//  311  640:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj3)
	//* 312  641:astore          15
		{
			obj4 = null;
	//  313  643:aconst_null     
	//  314  644:astore          16
		}
		obj = "error";
	//  315  646:ldc1            #241 <String "error">
	//  316  648:astore          14
		  goto _L11
	//* 317  650:goto            2157
_L10:
		int i2;
		obj4 = ((Object) ((HttpURLConnection)obj3));
	//  318  653:aload           15
	//  319  655:checkcast       #236 <Class HttpURLConnection>
	//  320  658:astore          16
		obj3 = ((Object) (new zzamy()));
	//  321  660:new             #243 <Class zzamy>
	//  322  663:dup             
	//  323  664:invokespecial   #244 <Method void zzamy()>
	//  324  667:astore          15
		((zzamy) (obj3)).zza(((HttpURLConnection) (obj4)), ((byte []) (null)));
	//  325  669:aload           15
	//  326  671:aload           16
	//  327  673:aconst_null     
	//  328  674:invokevirtual   #247 <Method void zzamy.zza(HttpURLConnection, byte[])>
		((HttpURLConnection) (obj4)).setInstanceFollowRedirects(false);
	//  329  677:aload           16
	//  330  679:iconst_0        
	//  331  680:invokevirtual   #251 <Method void HttpURLConnection.setInstanceFollowRedirects(boolean)>
		i2 = ((HttpURLConnection) (obj4)).getResponseCode();
	//  332  683:aload           16
	//  333  685:invokevirtual   #254 <Method int HttpURLConnection.getResponseCode()>
	//  334  688:istore          4
		((zzamy) (obj3)).zza(((HttpURLConnection) (obj4)), i2);
	//  335  690:aload           15
	//  336  692:aload           16
	//  337  694:iload           4
	//  338  696:invokevirtual   #257 <Method void zzamy.zza(HttpURLConnection, int)>
		i2 /= 100;
	//  339  699:iload           4
	//  340  701:bipush          100
	//  341  703:idiv            
	//  342  704:istore          4
		if(i2 != 3)
			break MISSING_BLOCK_LABEL_903;
	//  343  706:iload           4
	//  344  708:iconst_3        
	//  345  709:icmpne          903
		Object obj7 = ((Object) (((HttpURLConnection) (obj4)).getHeaderField("Location")));
	//  346  712:aload           16
	//  347  714:ldc2            #259 <String "Location">
	//  348  717:invokevirtual   #262 <Method String HttpURLConnection.getHeaderField(String)>
	//  349  720:astore          19
		if(obj7 != null)
			break MISSING_BLOCK_LABEL_738;
	//  350  722:aload           19
	//  351  724:ifnonnull       738
		throw new IOException("Missing Location header in redirect");
	//  352  727:new             #119 <Class IOException>
	//  353  730:dup             
	//  354  731:ldc2            #264 <String "Missing Location header in redirect">
	//  355  734:invokespecial   #239 <Method void IOException(String)>
	//  356  737:athrow          
		obj3 = ((Object) (new URL(((URL) (obj)), ((String) (obj7)))));
	//  357  738:new             #220 <Class URL>
	//  358  741:dup             
	//  359  742:aload           14
	//  360  744:aload           19
	//  361  746:invokespecial   #267 <Method void URL(URL, String)>
	//  362  749:astore          15
		obj = ((Object) (((URL) (obj3)).getProtocol()));
	//  363  751:aload           15
	//  364  753:invokevirtual   #270 <Method String URL.getProtocol()>
	//  365  756:astore          14
		if(obj != null)
			break MISSING_BLOCK_LABEL_774;
	//  366  758:aload           14
	//  367  760:ifnonnull       774
		throw new IOException("Protocol is null");
	//  368  763:new             #119 <Class IOException>
	//  369  766:dup             
	//  370  767:ldc2            #272 <String "Protocol is null">
	//  371  770:invokespecial   #239 <Method void IOException(String)>
	//  372  773:athrow          
		if(((String) (obj)).equals("http") || ((String) (obj)).equals("https"))
			break MISSING_BLOCK_LABEL_846;
	//  373  774:aload           14
	//  374  776:ldc2            #274 <String "http">
	//  375  779:invokevirtual   #277 <Method boolean String.equals(Object)>
	//  376  782:ifne            846
	//  377  785:aload           14
	//  378  787:ldc2            #279 <String "https">
	//  379  790:invokevirtual   #277 <Method boolean String.equals(Object)>
	//  380  793:ifne            846
		obj = ((Object) (String.valueOf(obj)));
	//  381  796:aload           14
	//  382  798:invokestatic    #85  <Method String String.valueOf(Object)>
	//  383  801:astore          14
		if(((String) (obj)).length() != 0)
	//* 384  803:aload           14
	//* 385  805:invokevirtual   #89  <Method int String.length()>
	//* 386  808:ifeq            824
		{
			obj = ((Object) ("Unsupported scheme: ".concat(((String) (obj)))));
	//  387  811:ldc2            #281 <String "Unsupported scheme: ">
	//  388  814:aload           14
	//  389  816:invokevirtual   #95  <Method String String.concat(String)>
	//  390  819:astore          14
			break MISSING_BLOCK_LABEL_836;
	//  391  821:goto            836
		}
		obj = ((Object) (new String("Unsupported scheme: ")));
	//  392  824:new             #81  <Class String>
	//  393  827:dup             
	//  394  828:ldc2            #281 <String "Unsupported scheme: ">
	//  395  831:invokespecial   #96  <Method void String(String)>
	//  396  834:astore          14
		throw new IOException(((String) (obj)));
	//  397  836:new             #119 <Class IOException>
	//  398  839:dup             
	//  399  840:aload           14
	//  400  842:invokespecial   #239 <Method void IOException(String)>
	//  401  845:athrow          
		obj = ((Object) (String.valueOf(obj7)));
	//  402  846:aload           19
	//  403  848:invokestatic    #85  <Method String String.valueOf(Object)>
	//  404  851:astore          14
		if(((String) (obj)).length() != 0)
	//* 405  853:aload           14
	//* 406  855:invokevirtual   #89  <Method int String.length()>
	//* 407  858:ifeq            874
		{
			obj = ((Object) ("Redirecting to ".concat(((String) (obj)))));
	//  408  861:ldc2            #283 <String "Redirecting to ">
	//  409  864:aload           14
	//  410  866:invokevirtual   #95  <Method String String.concat(String)>
	//  411  869:astore          14
			break MISSING_BLOCK_LABEL_886;
	//  412  871:goto            886
		}
		obj = ((Object) (new String("Redirecting to ")));
	//  413  874:new             #81  <Class String>
	//  414  877:dup             
	//  415  878:ldc2            #283 <String "Redirecting to ">
	//  416  881:invokespecial   #96  <Method void String(String)>
	//  417  884:astore          14
		zzakb.zzck(((String) (obj)));
	//  418  886:aload           14
	//  419  888:invokestatic    #193 <Method void zzakb.zzck(String)>
		((HttpURLConnection) (obj4)).disconnect();
	//  420  891:aload           16
	//  421  893:invokevirtual   #286 <Method void HttpURLConnection.disconnect()>
		obj = obj3;
	//  422  896:aload           15
	//  423  898:astore          14
		if(true) goto _L13; else goto _L12
	//  424  900:goto            590
		flag = obj4 instanceof HttpURLConnection;
	//  425  903:aload           16
	//  426  905:instanceof      #236 <Class HttpURLConnection>
	//  427  908:istore          6
		if(!flag) goto _L15; else goto _L14
	//  428  910:iload           6
	//  429  912:ifeq            1059
_L14:
		l = ((HttpURLConnection)obj4).getResponseCode();
	//  430  915:aload           16
	//  431  917:checkcast       #236 <Class HttpURLConnection>
	//  432  920:invokevirtual   #254 <Method int HttpURLConnection.getResponseCode()>
	//  433  923:istore_2        
		if(l < 400) goto _L15; else goto _L16
	//  434  924:iload_2         
	//  435  925:sipush          400
	//  436  928:icmplt          1059
_L16:
		obj = ((Object) (String.valueOf(((Object) (Integer.toString(l))))));
	//  437  931:iload_2         
	//  438  932:invokestatic    #290 <Method String Integer.toString(int)>
	//  439  935:invokestatic    #85  <Method String String.valueOf(Object)>
	//  440  938:astore          14
		if(((String) (obj)).length() != 0)
	//* 441  940:aload           14
	//* 442  942:invokevirtual   #89  <Method int String.length()>
	//* 443  945:ifeq            961
		{
			obj = ((Object) ("HTTP request failed. Code: ".concat(((String) (obj)))));
	//  444  948:ldc2            #292 <String "HTTP request failed. Code: ">
	//  445  951:aload           14
	//  446  953:invokevirtual   #95  <Method String String.concat(String)>
	//  447  956:astore          14
			break MISSING_BLOCK_LABEL_973;
	//  448  958:goto            973
		}
		obj = ((Object) (new String("HTTP request failed. Code: ")));
	//  449  961:new             #81  <Class String>
	//  450  964:dup             
	//  451  965:ldc2            #292 <String "HTTP request failed. Code: ">
	//  452  968:invokespecial   #96  <Method void String(String)>
	//  453  971:astore          14
		try
		{
			obj3 = ((Object) (new StringBuilder(32 + String.valueOf(((Object) (s))).length())));
	//  454  973:new             #294 <Class StringBuilder>
	//  455  976:dup             
	//  456  977:bipush          32
	//  457  979:aload_1         
	//  458  980:invokestatic    #85  <Method String String.valueOf(Object)>
	//  459  983:invokevirtual   #89  <Method int String.length()>
	//  460  986:iadd            
	//  461  987:invokespecial   #296 <Method void StringBuilder(int)>
	//  462  990:astore          15
			((StringBuilder) (obj3)).append("HTTP status code ");
	//  463  992:aload           15
	//  464  994:ldc2            #298 <String "HTTP status code ">
	//  465  997:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//  466 1000:pop             
			((StringBuilder) (obj3)).append(l);
	//  467 1001:aload           15
	//  468 1003:iload_2         
	//  469 1004:invokevirtual   #305 <Method StringBuilder StringBuilder.append(int)>
	//  470 1007:pop             
			((StringBuilder) (obj3)).append(" at ");
	//  471 1008:aload           15
	//  472 1010:ldc2            #307 <String " at ">
	//  473 1013:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//  474 1016:pop             
			((StringBuilder) (obj3)).append(s);
	//  475 1017:aload           15
	//  476 1019:aload_1         
	//  477 1020:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//  478 1023:pop             
			throw new IOException(((StringBuilder) (obj3)).toString());
	//  479 1024:new             #119 <Class IOException>
	//  480 1027:dup             
	//  481 1028:aload           15
	//  482 1030:invokevirtual   #309 <Method String StringBuilder.toString()>
	//  483 1033:invokespecial   #239 <Method void IOException(String)>
	//  484 1036:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj3)
	//* 485 1037:astore          15
		{
			obj4 = obj;
	//  486 1039:aload           14
	//  487 1041:astore          16
		}
		break MISSING_BLOCK_LABEL_1051;
	//  488 1043:goto            1051
		obj3;
	//  489 1046:astore          15
		obj4 = null;
	//  490 1048:aconst_null     
	//  491 1049:astore          16
		obj = "badUrl";
	//  492 1051:ldc2            #311 <String "badUrl">
	//  493 1054:astore          14
		  goto _L11
	//* 494 1056:goto            2157
_L15:
		l = ((URLConnection) (obj4)).getContentLength();
	//  495 1059:aload           16
	//  496 1061:invokevirtual   #314 <Method int URLConnection.getContentLength()>
	//  497 1064:istore_2        
		if(l >= 0)
			break MISSING_BLOCK_LABEL_1140;
	//  498 1065:iload_2         
	//  499 1066:ifge            1140
		obj = ((Object) (String.valueOf(((Object) (s)))));
	//  500 1069:aload_1         
	//  501 1070:invokestatic    #85  <Method String String.valueOf(Object)>
	//  502 1073:astore          14
		if(((String) (obj)).length() != 0)
	//* 503 1075:aload           14
	//* 504 1077:invokevirtual   #89  <Method int String.length()>
	//* 505 1080:ifeq            1096
		{
			obj = ((Object) ("Stream cache aborted, missing content-length header at ".concat(((String) (obj)))));
	//  506 1083:ldc2            #316 <String "Stream cache aborted, missing content-length header at ">
	//  507 1086:aload           14
	//  508 1088:invokevirtual   #95  <Method String String.concat(String)>
	//  509 1091:astore          14
			break MISSING_BLOCK_LABEL_1108;
	//  510 1093:goto            1108
		}
		obj = ((Object) (new String("Stream cache aborted, missing content-length header at ")));
	//  511 1096:new             #81  <Class String>
	//  512 1099:dup             
	//  513 1100:ldc2            #316 <String "Stream cache aborted, missing content-length header at ">
	//  514 1103:invokespecial   #96  <Method void String(String)>
	//  515 1106:astore          14
		zzakb.zzdk(((String) (obj)));
	//  516 1108:aload           14
	//  517 1110:invokestatic    #59  <Method void zzakb.zzdk(String)>
		((zzaqh)this).zza(s, file1.getAbsolutePath(), "contentLengthMissing", ((String) (null)));
	//  518 1113:aload_0         
	//  519 1114:aload_1         
	//  520 1115:aload           22
	//  521 1117:invokevirtual   #79  <Method String File.getAbsolutePath()>
	//  522 1120:ldc2            #318 <String "contentLengthMissing">
	//  523 1123:aconst_null     
	//  524 1124:invokevirtual   #129 <Method void zzaqh.zza(String, String, String, String)>
		zzdbg.remove(((Object) (s2)));
	//  525 1127:getstatic       #29  <Field Set zzdbg>
	//  526 1130:aload           18
	//  527 1132:invokeinterface #321 <Method boolean Set.remove(Object)>
	//  528 1137:pop             
		return false;
	//  529 1138:iconst_0        
	//  530 1139:ireturn         
		obj = ((Object) (zzdbh.format(l)));
	//  531 1140:getstatic       #38  <Field DecimalFormat zzdbh>
	//  532 1143:iload_2         
	//  533 1144:i2l             
	//  534 1145:invokevirtual   #325 <Method String DecimalFormat.format(long)>
	//  535 1148:astore          14
		obj3 = ((Object) (zznk.zzauy));
	//  536 1150:getstatic       #328 <Field zzna zznk.zzauy>
	//  537 1153:astore          15
		k1 = ((Integer)zzkb.zzik().zzd(((zzna) (obj3)))).intValue();
	//  538 1155:invokestatic    #148 <Method zzni zzkb.zzik()>
	//  539 1158:aload           15
	//  540 1160:invokevirtual   #154 <Method Object zzni.zzd(zzna)>
	//  541 1163:checkcast       #156 <Class Integer>
	//  542 1166:invokevirtual   #159 <Method int Integer.intValue()>
	//  543 1169:istore_3        
		if(l <= k1)
			break MISSING_BLOCK_LABEL_1312;
	//  544 1170:iload_2         
	//  545 1171:iload_3         
	//  546 1172:icmple          1312
		obj3 = ((Object) (new StringBuilder(33 + String.valueOf(obj).length() + String.valueOf(((Object) (s))).length())));
	//  547 1175:new             #294 <Class StringBuilder>
	//  548 1178:dup             
	//  549 1179:bipush          33
	//  550 1181:aload           14
	//  551 1183:invokestatic    #85  <Method String String.valueOf(Object)>
	//  552 1186:invokevirtual   #89  <Method int String.length()>
	//  553 1189:iadd            
	//  554 1190:aload_1         
	//  555 1191:invokestatic    #85  <Method String String.valueOf(Object)>
	//  556 1194:invokevirtual   #89  <Method int String.length()>
	//  557 1197:iadd            
	//  558 1198:invokespecial   #296 <Method void StringBuilder(int)>
	//  559 1201:astore          15
		((StringBuilder) (obj3)).append("Content length ");
	//  560 1203:aload           15
	//  561 1205:ldc2            #330 <String "Content length ">
	//  562 1208:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//  563 1211:pop             
		((StringBuilder) (obj3)).append(((String) (obj)));
	//  564 1212:aload           15
	//  565 1214:aload           14
	//  566 1216:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//  567 1219:pop             
		((StringBuilder) (obj3)).append(" exceeds limit at ");
	//  568 1220:aload           15
	//  569 1222:ldc2            #332 <String " exceeds limit at ">
	//  570 1225:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//  571 1228:pop             
		((StringBuilder) (obj3)).append(s);
	//  572 1229:aload           15
	//  573 1231:aload_1         
	//  574 1232:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//  575 1235:pop             
		zzakb.zzdk(((StringBuilder) (obj3)).toString());
	//  576 1236:aload           15
	//  577 1238:invokevirtual   #309 <Method String StringBuilder.toString()>
	//  578 1241:invokestatic    #59  <Method void zzakb.zzdk(String)>
		obj = ((Object) (String.valueOf(obj)));
	//  579 1244:aload           14
	//  580 1246:invokestatic    #85  <Method String String.valueOf(Object)>
	//  581 1249:astore          14
		if(((String) (obj)).length() != 0)
	//* 582 1251:aload           14
	//* 583 1253:invokevirtual   #89  <Method int String.length()>
	//* 584 1256:ifeq            1272
		{
			obj = ((Object) ("File too big for full file cache. Size: ".concat(((String) (obj)))));
	//  585 1259:ldc2            #334 <String "File too big for full file cache. Size: ">
	//  586 1262:aload           14
	//  587 1264:invokevirtual   #95  <Method String String.concat(String)>
	//  588 1267:astore          14
			break MISSING_BLOCK_LABEL_1284;
	//  589 1269:goto            1284
		}
		obj = ((Object) (new String("File too big for full file cache. Size: ")));
	//  590 1272:new             #81  <Class String>
	//  591 1275:dup             
	//  592 1276:ldc2            #334 <String "File too big for full file cache. Size: ">
	//  593 1279:invokespecial   #96  <Method void String(String)>
	//  594 1282:astore          14
		((zzaqh)this).zza(s, file1.getAbsolutePath(), "sizeExceeded", ((String) (obj)));
	//  595 1284:aload_0         
	//  596 1285:aload_1         
	//  597 1286:aload           22
	//  598 1288:invokevirtual   #79  <Method String File.getAbsolutePath()>
	//  599 1291:ldc2            #336 <String "sizeExceeded">
	//  600 1294:aload           14
	//  601 1296:invokevirtual   #129 <Method void zzaqh.zza(String, String, String, String)>
		zzdbg.remove(((Object) (s2)));
	//  602 1299:getstatic       #29  <Field Set zzdbg>
	//  603 1302:aload           18
	//  604 1304:invokeinterface #321 <Method boolean Set.remove(Object)>
	//  605 1309:pop             
		return false;
	//  606 1310:iconst_0        
	//  607 1311:ireturn         
		obj3 = ((Object) (new StringBuilder(20 + String.valueOf(obj).length() + String.valueOf(((Object) (s))).length())));
	//  608 1312:new             #294 <Class StringBuilder>
	//  609 1315:dup             
	//  610 1316:bipush          20
	//  611 1318:aload           14
	//  612 1320:invokestatic    #85  <Method String String.valueOf(Object)>
	//  613 1323:invokevirtual   #89  <Method int String.length()>
	//  614 1326:iadd            
	//  615 1327:aload_1         
	//  616 1328:invokestatic    #85  <Method String String.valueOf(Object)>
	//  617 1331:invokevirtual   #89  <Method int String.length()>
	//  618 1334:iadd            
	//  619 1335:invokespecial   #296 <Method void StringBuilder(int)>
	//  620 1338:astore          15
		((StringBuilder) (obj3)).append("Caching ");
	//  621 1340:aload           15
	//  622 1342:ldc2            #338 <String "Caching ">
	//  623 1345:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//  624 1348:pop             
		((StringBuilder) (obj3)).append(((String) (obj)));
	//  625 1349:aload           15
	//  626 1351:aload           14
	//  627 1353:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//  628 1356:pop             
		((StringBuilder) (obj3)).append(" bytes from ");
	//  629 1357:aload           15
	//  630 1359:ldc2            #340 <String " bytes from ">
	//  631 1362:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//  632 1365:pop             
		((StringBuilder) (obj3)).append(s);
	//  633 1366:aload           15
	//  634 1368:aload_1         
	//  635 1369:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//  636 1372:pop             
		zzakb.zzck(((StringBuilder) (obj3)).toString());
	//  637 1373:aload           15
	//  638 1375:invokevirtual   #309 <Method String StringBuilder.toString()>
	//  639 1378:invokestatic    #193 <Method void zzakb.zzck(String)>
		obj5 = ((Object) (Channels.newChannel(((URLConnection) (obj4)).getInputStream())));
	//  640 1381:aload           16
	//  641 1383:invokevirtual   #344 <Method java.io.InputStream URLConnection.getInputStream()>
	//  642 1386:invokestatic    #350 <Method ReadableByteChannel Channels.newChannel(java.io.InputStream)>
	//  643 1389:astore          17
		obj = ((Object) (new FileOutputStream(file1)));
	//  644 1391:new             #352 <Class FileOutputStream>
	//  645 1394:dup             
	//  646 1395:aload           22
	//  647 1397:invokespecial   #355 <Method void FileOutputStream(File)>
	//  648 1400:astore          14
		long l6;
		Object obj8;
		ByteBuffer bytebuffer;
		obj8 = ((Object) (((FileOutputStream) (obj)).getChannel()));
	//  649 1402:aload           14
	//  650 1404:invokevirtual   #359 <Method FileChannel FileOutputStream.getChannel()>
	//  651 1407:astore          20
		bytebuffer = ByteBuffer.allocate(0x100000);
	//  652 1409:ldc2            #360 <Int 0x100000>
	//  653 1412:invokestatic    #366 <Method ByteBuffer ByteBuffer.allocate(int)>
	//  654 1415:astore          21
		obj7 = ((Object) (zzbv.zzer()));
	//  655 1417:invokestatic    #370 <Method Clock zzbv.zzer()>
	//  656 1420:astore          19
		l6 = ((Clock) (obj7)).currentTimeMillis();
	//  657 1422:aload           19
	//  658 1424:invokeinterface #375 <Method long Clock.currentTimeMillis()>
	//  659 1429:lstore          10
		obj3 = ((Object) (zznk.zzavb));
	//  660 1431:getstatic       #378 <Field zzna zznk.zzavb>
	//  661 1434:astore          15
		obj4 = ((Object) ((Long)zzkb.zzik().zzd(((zzna) (obj3)))));
	//  662 1436:invokestatic    #148 <Method zzni zzkb.zzik()>
	//  663 1439:aload           15
	//  664 1441:invokevirtual   #154 <Method Object zzni.zzd(zzna)>
	//  665 1444:checkcast       #380 <Class Long>
	//  666 1447:astore          16
		obj3 = obj;
	//  667 1449:aload           14
	//  668 1451:astore          15
		int j2;
		int l2;
		boolean flag1;
		long l4;
		long l8;
		Object obj9;
		try
		{
			obj4 = ((Object) (new zzamj(((Long) (obj4)).longValue())));
	//  669 1453:new             #382 <Class zzamj>
	//  670 1456:dup             
	//  671 1457:aload           16
	//  672 1459:invokevirtual   #385 <Method long Long.longValue()>
	//  673 1462:invokespecial   #388 <Method void zzamj(long)>
	//  674 1465:astore          16
		}
	//* 675 1467:aload           14
	//* 676 1469:astore          15
	//* 677 1471:getstatic       #391 <Field zzna zznk.zzava>
	//* 678 1474:astore          24
	//* 679 1476:aload           14
	//* 680 1478:astore          15
	//* 681 1480:invokestatic    #148 <Method zzni zzkb.zzik()>
	//* 682 1483:aload           24
	//* 683 1485:invokevirtual   #154 <Method Object zzni.zzd(zzna)>
	//* 684 1488:checkcast       #380 <Class Long>
	//* 685 1491:invokevirtual   #385 <Method long Long.longValue()>
	//* 686 1494:lstore          8
	//* 687 1496:iconst_0        
	//* 688 1497:istore          4
	//* 689 1499:aload           14
	//* 690 1501:astore          15
	//* 691 1503:aload           17
	//* 692 1505:aload           21
	//* 693 1507:invokeinterface #397 <Method int ReadableByteChannel.read(ByteBuffer)>
	//* 694 1512:istore          5
	//* 695 1514:iload           5
	//* 696 1516:iflt            1907
	//* 697 1519:iload           4
	//* 698 1521:iload           5
	//* 699 1523:iadd            
	//* 700 1524:istore          4
	//* 701 1526:iload           4
	//* 702 1528:iload_3         
	//* 703 1529:icmple          1675
	//* 704 1532:ldc2            #336 <String "sizeExceeded">
	//* 705 1535:astore          16
	//* 706 1537:aload           16
	//* 707 1539:astore          15
	//* 708 1541:iload           4
	//* 709 1543:invokestatic    #290 <Method String Integer.toString(int)>
	//* 710 1546:invokestatic    #85  <Method String String.valueOf(Object)>
	//* 711 1549:astore          17
	//* 712 1551:aload           16
	//* 713 1553:astore          15
	//* 714 1555:aload           17
	//* 715 1557:invokevirtual   #89  <Method int String.length()>
	//* 716 1560:ifeq            1584
	//* 717 1563:aload           16
	//* 718 1565:astore          15
	//* 719 1567:ldc2            #334 <String "File too big for full file cache. Size: ">
	//* 720 1570:aload           17
	//* 721 1572:invokevirtual   #95  <Method String String.concat(String)>
	//* 722 1575:astore          17
	//* 723 1577:aload           17
	//* 724 1579:astore          15
	//* 725 1581:goto            1604
	//* 726 1584:aload           16
	//* 727 1586:astore          15
	//* 728 1588:new             #81  <Class String>
	//* 729 1591:dup             
	//* 730 1592:ldc2            #334 <String "File too big for full file cache. Size: ">
	//* 731 1595:invokespecial   #96  <Method void String(String)>
	//* 732 1598:astore          17
	//* 733 1600:aload           17
	//* 734 1602:astore          15
	//* 735 1604:new             #119 <Class IOException>
	//* 736 1607:dup             
	//* 737 1608:ldc2            #399 <String "stream cache file size limit exceeded">
	//* 738 1611:invokespecial   #239 <Method void IOException(String)>
	//* 739 1614:athrow          
	//* 740 1615:astore          19
	//* 741 1617:aload           14
	//* 742 1619:astore          17
	//* 743 1621:aload           15
	//* 744 1623:astore          20
	//* 745 1625:aload           19
	//* 746 1627:astore          15
	//* 747 1629:aload           16
	//* 748 1631:astore          14
	//* 749 1633:aload           20
	//* 750 1635:astore          16
	//* 751 1637:goto            2157
	//* 752 1640:astore          20
	//* 753 1642:aload           15
	//* 754 1644:astore          16
	//* 755 1646:aload           14
	//* 756 1648:astore          17
	//* 757 1650:aconst_null     
	//* 758 1651:astore          19
	//* 759 1653:aload           20
	//* 760 1655:astore          15
	//* 761 1657:aload           16
	//* 762 1659:astore          14
	//* 763 1661:aload           19
	//* 764 1663:astore          16
	//* 765 1665:goto            2157
	//* 766 1668:aload           14
	//* 767 1670:astore          17
	//* 768 1672:goto            2115
	//* 769 1675:aload           21
	//* 770 1677:invokevirtual   #403 <Method java.nio.Buffer ByteBuffer.flip()>
	//* 771 1680:pop             
	//* 772 1681:aload           20
	//* 773 1683:aload           21
	//* 774 1685:invokevirtual   #408 <Method int FileChannel.write(ByteBuffer)>
	//* 775 1688:ifgt            1899
	//* 776 1691:aload           21
	//* 777 1693:invokevirtual   #411 <Method java.nio.Buffer ByteBuffer.clear()>
	//* 778 1696:pop             
	//* 779 1697:aload           19
	//* 780 1699:invokeinterface #375 <Method long Clock.currentTimeMillis()>
	//* 781 1704:lstore          12
	//* 782 1706:lload           12
	//* 783 1708:lload           10
	//* 784 1710:lsub            
	//* 785 1711:ldc2w           #412 <Long 1000L>
	//* 786 1714:lload           8
	//* 787 1716:lmul            
	//* 788 1717:lcmp            
	//* 789 1718:ifle            1825
	//* 790 1721:ldc2            #415 <String "downloadTimeout">
	//* 791 1724:astore          16
	//* 792 1726:aload           16
	//* 793 1728:astore          15
	//* 794 1730:lload           8
	//* 795 1732:invokestatic    #417 <Method String Long.toString(long)>
	//* 796 1735:astore          17
	//* 797 1737:aload           16
	//* 798 1739:astore          15
	//* 799 1741:new             #294 <Class StringBuilder>
	//* 800 1744:dup             
	//* 801 1745:bipush          29
	//* 802 1747:aload           17
	//* 803 1749:invokestatic    #85  <Method String String.valueOf(Object)>
	//* 804 1752:invokevirtual   #89  <Method int String.length()>
	//* 805 1755:iadd            
	//* 806 1756:invokespecial   #296 <Method void StringBuilder(int)>
	//* 807 1759:astore          19
	//* 808 1761:aload           16
	//* 809 1763:astore          15
	//* 810 1765:aload           19
	//* 811 1767:ldc2            #419 <String "Timeout exceeded. Limit: ">
	//* 812 1770:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//* 813 1773:pop             
	//* 814 1774:aload           16
	//* 815 1776:astore          15
	//* 816 1778:aload           19
	//* 817 1780:aload           17
	//* 818 1782:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//* 819 1785:pop             
	//* 820 1786:aload           16
	//* 821 1788:astore          15
	//* 822 1790:aload           19
	//* 823 1792:ldc2            #421 <String " sec">
	//* 824 1795:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//* 825 1798:pop             
	//* 826 1799:aload           16
	//* 827 1801:astore          15
	//* 828 1803:aload           19
	//* 829 1805:invokevirtual   #309 <Method String StringBuilder.toString()>
	//* 830 1808:astore          17
	//* 831 1810:aload           17
	//* 832 1812:astore          15
	//* 833 1814:new             #119 <Class IOException>
	//* 834 1817:dup             
	//* 835 1818:ldc2            #423 <String "stream cache time limit exceeded">
	//* 836 1821:invokespecial   #239 <Method void IOException(String)>
	//* 837 1824:athrow          
	//* 838 1825:aload_0         
	//* 839 1826:getfield        #115 <Field boolean zzdbj>
	//* 840 1829:istore          6
	//* 841 1831:iload           6
	//* 842 1833:ifeq            1852
	//* 843 1836:ldc2            #425 <String "externalAbort">
	//* 844 1839:astore          15
	//* 845 1841:new             #119 <Class IOException>
	//* 846 1844:dup             
	//* 847 1845:ldc2            #427 <String "abort requested">
	//* 848 1848:invokespecial   #239 <Method void IOException(String)>
	//* 849 1851:athrow          
	//* 850 1852:aload           16
	//* 851 1854:invokevirtual   #430 <Method boolean zzamj.tryAcquire()>
	//* 852 1857:ifeq            1896
	//* 853 1860:aload           22
	//* 854 1862:invokevirtual   #79  <Method String File.getAbsolutePath()>
	//* 855 1865:astore          15
	//* 856 1867:getstatic       #434 <Field Handler zzamu.zzsy>
	//* 857 1870:astore          24
	//* 858 1872:aload           24
	//* 859 1874:new             #436 <Class zzaqi>
	//* 860 1877:dup             
	//* 861 1878:aload_0         
	//* 862 1879:aload_1         
	//* 863 1880:aload           15
	//* 864 1882:iload           4
	//* 865 1884:iload_2         
	//* 866 1885:iconst_0        
	//* 867 1886:invokespecial   #439 <Method void zzaqi(zzaqh, String, String, int, int, boolean)>
	//* 868 1889:invokevirtual   #445 <Method boolean Handler.post(Runnable)>
	//* 869 1892:pop             
	//* 870 1893:goto            1896
	//* 871 1896:goto            1499
	//* 872 1899:goto            1681
	//* 873 1902:astore          15
	//* 874 1904:goto            1668
	//* 875 1907:aload           14
	//* 876 1909:astore          15
	//* 877 1911:aload           15
	//* 878 1913:invokevirtual   #448 <Method void FileOutputStream.close()>
	//* 879 1916:iconst_3        
	//* 880 1917:invokestatic    #452 <Method boolean zzakb.isLoggable(int)>
	//* 881 1920:istore          6
	//* 882 1922:iload           6
	//* 883 1924:ifeq            2015
	//* 884 1927:getstatic       #38  <Field DecimalFormat zzdbh>
	//* 885 1930:iload           4
	//* 886 1932:i2l             
	//* 887 1933:invokevirtual   #325 <Method String DecimalFormat.format(long)>
	//* 888 1936:astore          16
	//* 889 1938:new             #294 <Class StringBuilder>
	//* 890 1941:dup             
	//* 891 1942:bipush          22
	//* 892 1944:aload           16
	//* 893 1946:invokestatic    #85  <Method String String.valueOf(Object)>
	//* 894 1949:invokevirtual   #89  <Method int String.length()>
	//* 895 1952:iadd            
	//* 896 1953:aload_1         
	//* 897 1954:invokestatic    #85  <Method String String.valueOf(Object)>
	//* 898 1957:invokevirtual   #89  <Method int String.length()>
	//* 899 1960:iadd            
	//* 900 1961:invokespecial   #296 <Method void StringBuilder(int)>
	//* 901 1964:astore          17
	//* 902 1966:aload           17
	//* 903 1968:ldc2            #454 <String "Preloaded ">
	//* 904 1971:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//* 905 1974:pop             
	//* 906 1975:aload           17
	//* 907 1977:aload           16
	//* 908 1979:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//* 909 1982:pop             
	//* 910 1983:aload           17
	//* 911 1985:ldc2            #340 <String " bytes from ">
	//* 912 1988:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//* 913 1991:pop             
	//* 914 1992:aload           17
	//* 915 1994:aload_1         
	//* 916 1995:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//* 917 1998:pop             
	//* 918 1999:aload           17
	//* 919 2001:invokevirtual   #309 <Method String StringBuilder.toString()>
	//* 920 2004:invokestatic    #193 <Method void zzakb.zzck(String)>
	//* 921 2007:goto            2015
	//* 922 2010:astore          15
	//* 923 2012:goto            1904
	//* 924 2015:aload           22
	//* 925 2017:iconst_1        
	//* 926 2018:iconst_0        
	//* 927 2019:invokevirtual   #100 <Method boolean File.setReadable(boolean, boolean)>
	//* 928 2022:pop             
	//* 929 2023:aload           23
	//* 930 2025:invokevirtual   #173 <Method boolean File.isFile()>
	//* 931 2028:istore          6
	//* 932 2030:iload           6
	//* 933 2032:ifeq            2047
	//* 934 2035:aload           23
	//* 935 2037:invokestatic    #457 <Method long System.currentTimeMillis()>
	//* 936 2040:invokevirtual   #461 <Method boolean File.setLastModified(long)>
	//* 937 2043:pop             
	//* 938 2044:goto            2053
	//* 939 2047:aload           23
	//* 940 2049:invokevirtual   #464 <Method boolean File.createNewFile()>
	//* 941 2052:pop             
	//* 942 2053:aload_0         
	//* 943 2054:aload_1         
	//* 944 2055:aload           22
	//* 945 2057:invokevirtual   #79  <Method String File.getAbsolutePath()>
	//* 946 2060:iload           4
	//* 947 2062:invokevirtual   #196 <Method void zzaqh.zza(String, String, int)>
	//* 948 2065:getstatic       #29  <Field Set zzdbg>
	//* 949 2068:astore          14
	//* 950 2070:aload           14
	//* 951 2072:aload           18
	//* 952 2074:invokeinterface #321 <Method boolean Set.remove(Object)>
	//* 953 2079:pop             
	//* 954 2080:iconst_1        
	//* 955 2081:ireturn         
	//* 956 2082:astore          14
	//* 957 2084:goto            2107
	//* 958 2087:astore          14
	//* 959 2089:goto            2094
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 960 2092:astore          14
		{
			break MISSING_BLOCK_LABEL_2107;
	//  961 2094:goto            2107
		}
		obj3 = obj;
		obj9 = ((Object) (zznk.zzava));
		obj3 = obj;
		l4 = ((Long)zzkb.zzik().zzd(((zzna) (obj9)))).longValue();
		j2 = 0;
_L28:
		obj3 = obj;
		l2 = ((ReadableByteChannel) (obj5)).read(bytebuffer);
		if(l2 < 0) goto _L18; else goto _L17
_L17:
		j2 += l2;
		if(j2 <= k1) goto _L20; else goto _L19
_L19:
		obj4 = "sizeExceeded";
		obj3 = obj4;
		obj5 = ((Object) (String.valueOf(((Object) (Integer.toString(j2))))));
		obj3 = obj4;
		if(((String) (obj5)).length() == 0)
			break MISSING_BLOCK_LABEL_1584;
		obj3 = obj4;
		obj5 = ((Object) ("File too big for full file cache. Size: ".concat(((String) (obj5)))));
		obj3 = obj5;
		break MISSING_BLOCK_LABEL_1604;
		obj3 = obj4;
		obj5 = ((Object) (new String("File too big for full file cache. Size: ")));
		obj3 = obj5;
		try
		{
			throw new IOException("stream cache file size limit exceeded");
		}
		// Misplaced declaration of an exception variable
		catch(Object obj7)
		{
			obj5 = obj;
		}
		obj8 = obj3;
		obj3 = obj7;
		obj = obj4;
		obj4 = obj8;
		  goto _L11
_L24:
		obj5 = obj;
		break; /* Loop/switch isn't completed */
_L20:
		try
		{
			bytebuffer.flip();
			while(((FileChannel) (obj8)).write(bytebuffer) > 0) ;
			bytebuffer.clear();
			l8 = ((Clock) (obj7)).currentTimeMillis();
		}
		// Misplaced declaration of an exception variable
		catch(Object obj3)
		{
			continue; /* Loop/switch isn't completed */
		}
		if(l8 - l6 <= 1000L * l4)
			break MISSING_BLOCK_LABEL_1825;
		obj4 = "downloadTimeout";
		obj3 = obj4;
		obj5 = ((Object) (Long.toString(l4)));
		obj3 = obj4;
		obj7 = ((Object) (new StringBuilder(29 + String.valueOf(obj5).length())));
		obj3 = obj4;
		((StringBuilder) (obj7)).append("Timeout exceeded. Limit: ");
		obj3 = obj4;
		((StringBuilder) (obj7)).append(((String) (obj5)));
		obj3 = obj4;
		((StringBuilder) (obj7)).append(" sec");
		obj3 = obj4;
		obj5 = ((Object) (((StringBuilder) (obj7)).toString()));
		obj3 = obj5;
		throw new IOException("stream cache time limit exceeded");
		flag1 = zzdbj;
		if(!flag1) goto _L22; else goto _L21
_L21:
		obj3 = "externalAbort";
		try
		{
			throw new IOException("abort requested");
		}
		// Misplaced declaration of an exception variable
		catch(Object obj8)
		{
			obj4 = obj3;
			obj5 = obj;
			obj7 = null;
			obj3 = obj8;
			obj = obj4;
			obj4 = obj7;
		}
		  goto _L11
_L22:
		if(!((zzamj) (obj4)).tryAcquire())
			continue; /* Loop/switch isn't completed */
		obj3 = ((Object) (file1.getAbsolutePath()));
		obj9 = ((Object) (zzamu.zzsy));
		((Handler) (obj9)).post(((Runnable) (new zzaqi(((zzaqh) (this)), s, ((String) (obj3)), j2, l, false))));
		continue; /* Loop/switch isn't completed */
_L18:
		obj3 = obj;
		try
		{
			((FileOutputStream) (obj3)).close();
			flag1 = zzakb.isLoggable(3);
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			break MISSING_BLOCK_LABEL_2107;
		}
		if(!flag1)
			break MISSING_BLOCK_LABEL_2015;
		obj4 = ((Object) (zzdbh.format(j2)));
		obj5 = ((Object) (new StringBuilder(22 + String.valueOf(obj4).length() + String.valueOf(((Object) (s))).length())));
		((StringBuilder) (obj5)).append("Preloaded ");
		((StringBuilder) (obj5)).append(((String) (obj4)));
		((StringBuilder) (obj5)).append(" bytes from ");
		((StringBuilder) (obj5)).append(s);
		zzakb.zzck(((StringBuilder) (obj5)).toString());
		file1.setReadable(true, false);
		flag1 = file2.isFile();
		if(!flag1)
			break MISSING_BLOCK_LABEL_2047;
		try
		{
			file2.setLastModified(System.currentTimeMillis());
			break MISSING_BLOCK_LABEL_2053;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj3) { }
		if(true) goto _L24; else goto _L23
		file2.createNewFile();
_L26:
		((zzaqh)this).zza(s, file1.getAbsolutePath(), j2);
		obj = ((Object) (zzdbg));
		try
		{
			((Set) (obj)).remove(((Object) (s2)));
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			break MISSING_BLOCK_LABEL_2107;
		}
		return true;
		obj4;
	//  962 2097:astore          16
		obj3 = obj;
	//  963 2099:aload           14
	//  964 2101:astore          15
		obj = obj4;
	//  965 2103:aload           16
	//  966 2105:astore          14
		obj5 = obj3;
	//  967 2107:aload           15
	//  968 2109:astore          17
		obj3 = obj;
	//  969 2111:aload           14
	//  970 2113:astore          15
_L23:
		obj = "error";
	//  971 2115:ldc1            #241 <String "error">
	//  972 2117:astore          14
		obj4 = null;
	//  973 2119:aconst_null     
	//  974 2120:astore          16
		  goto _L11
	//* 975 2122:goto            2157
_L12:
		try
		{
			throw new IOException("Too many redirects (20)");
	//  976 2125:new             #119 <Class IOException>
	//  977 2128:dup             
	//  978 2129:ldc2            #466 <String "Too many redirects (20)">
	//  979 2132:invokespecial   #239 <Method void IOException(String)>
	//  980 2135:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//  981 2136:astore          14
		break MISSING_BLOCK_LABEL_2143;
	//  982 2138:goto            2143
		Object obj1;
		obj1;
	//  983 2141:astore          14
		obj3 = obj1;
	//  984 2143:aload           14
	//  985 2145:astore          15
		obj1 = "error";
	//  986 2147:ldc1            #241 <String "error">
	//  987 2149:astore          14
		obj4 = null;
	//  988 2151:aconst_null     
	//  989 2152:astore          16
		obj5 = null;
	//  990 2154:aconst_null     
	//  991 2155:astore          17
_L11:
		if(obj3 instanceof RuntimeException)
	//* 992 2157:aload           15
	//* 993 2159:instanceof      #121 <Class RuntimeException>
	//* 994 2162:ifeq            2176
			zzbv.zzeo().zza(((Throwable) (obj3)), "VideoStreamFullFileCache.preload");
	//  995 2165:invokestatic    #470 <Method zzajm zzbv.zzeo()>
	//  996 2168:aload           15
	//  997 2170:ldc2            #472 <String "VideoStreamFullFileCache.preload">
	//  998 2173:invokevirtual   #477 <Method void zzajm.zza(Throwable, String)>
		IOException ioexception;
		try
		{
			((FileOutputStream) (obj5)).close();
	//  999 2176:aload           17
	// 1000 2178:invokevirtual   #448 <Method void FileOutputStream.close()>
		}
	//*1001 2181:aload_0         
	//*1002 2182:getfield        #115 <Field boolean zzdbj>
	//*1003 2185:ifeq            2243
	//*1004 2188:new             #294 <Class StringBuilder>
	//*1005 2191:dup             
	//*1006 2192:bipush          26
	//*1007 2194:aload_1         
	//*1008 2195:invokestatic    #85  <Method String String.valueOf(Object)>
	//*1009 2198:invokevirtual   #89  <Method int String.length()>
	//*1010 2201:iadd            
	//*1011 2202:invokespecial   #296 <Method void StringBuilder(int)>
	//*1012 2205:astore          15
	//*1013 2207:aload           15
	//*1014 2209:ldc2            #479 <String "Preload aborted for URL \"">
	//*1015 2212:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//*1016 2215:pop             
	//*1017 2216:aload           15
	//*1018 2218:aload_1         
	//*1019 2219:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//*1020 2222:pop             
	//*1021 2223:aload           15
	//*1022 2225:ldc2            #481 <String "\"">
	//*1023 2228:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//*1024 2231:pop             
	//*1025 2232:aload           15
	//*1026 2234:invokevirtual   #309 <Method String StringBuilder.toString()>
	//*1027 2237:invokestatic    #484 <Method void zzakb.zzdj(String)>
	//*1028 2240:goto            2297
	//*1029 2243:new             #294 <Class StringBuilder>
	//*1030 2246:dup             
	//*1031 2247:bipush          25
	//*1032 2249:aload_1         
	//*1033 2250:invokestatic    #85  <Method String String.valueOf(Object)>
	//*1034 2253:invokevirtual   #89  <Method int String.length()>
	//*1035 2256:iadd            
	//*1036 2257:invokespecial   #296 <Method void StringBuilder(int)>
	//*1037 2260:astore          17
	//*1038 2262:aload           17
	//*1039 2264:ldc2            #486 <String "Preload failed for URL \"">
	//*1040 2267:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//*1041 2270:pop             
	//*1042 2271:aload           17
	//*1043 2273:aload_1         
	//*1044 2274:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//*1045 2277:pop             
	//*1046 2278:aload           17
	//*1047 2280:ldc2            #481 <String "\"">
	//*1048 2283:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//*1049 2286:pop             
	//*1050 2287:aload           17
	//*1051 2289:invokevirtual   #309 <Method String StringBuilder.toString()>
	//*1052 2292:aload           15
	//*1053 2294:invokestatic    #489 <Method void zzakb.zzc(String, Throwable)>
	//*1054 2297:aload           22
	//*1055 2299:invokevirtual   #492 <Method boolean File.exists()>
	//*1056 2302:ifeq            2361
	//*1057 2305:aload           22
	//*1058 2307:invokevirtual   #168 <Method boolean File.delete()>
	//*1059 2310:ifne            2361
	//*1060 2313:aload           22
	//*1061 2315:invokevirtual   #79  <Method String File.getAbsolutePath()>
	//*1062 2318:invokestatic    #85  <Method String String.valueOf(Object)>
	//*1063 2321:astore          15
	//*1064 2323:aload           15
	//*1065 2325:invokevirtual   #89  <Method int String.length()>
	//*1066 2328:ifeq            2344
	//*1067 2331:ldc2            #494 <String "Could not delete partial cache file at ">
	//*1068 2334:aload           15
	//*1069 2336:invokevirtual   #95  <Method String String.concat(String)>
	//*1070 2339:astore          15
	//*1071 2341:goto            2356
	//*1072 2344:new             #81  <Class String>
	//*1073 2347:dup             
	//*1074 2348:ldc2            #494 <String "Could not delete partial cache file at ">
	//*1075 2351:invokespecial   #96  <Method void String(String)>
	//*1076 2354:astore          15
	//*1077 2356:aload           15
	//*1078 2358:invokestatic    #59  <Method void zzakb.zzdk(String)>
	//*1079 2361:aload_0         
	//*1080 2362:aload_1         
	//*1081 2363:aload           22
	//*1082 2365:invokevirtual   #79  <Method String File.getAbsolutePath()>
	//*1083 2368:aload           14
	//*1084 2370:aload           16
	//*1085 2372:invokevirtual   #129 <Method void zzaqh.zza(String, String, String, String)>
	//*1086 2375:getstatic       #29  <Field Set zzdbg>
	//*1087 2378:aload           18
	//*1088 2380:invokeinterface #321 <Method boolean Set.remove(Object)>
	//*1089 2385:pop             
	//*1090 2386:iconst_0        
	//*1091 2387:ireturn         
	//*1092 2388:astore_1        
	//*1093 2389:aload           15
	//*1094 2391:monitorexit     
	//*1095 2392:aload_1         
	//*1096 2393:athrow          
	//*1097 2394:astore          14
	//*1098 2396:goto            2053
		catch(Object obj6) { }
	// 1099 2399:astore          17
		if(zzdbj)
		{
			obj3 = ((Object) (new StringBuilder(26 + String.valueOf(((Object) (s))).length())));
			((StringBuilder) (obj3)).append("Preload aborted for URL \"");
			((StringBuilder) (obj3)).append(s);
			((StringBuilder) (obj3)).append("\"");
			zzakb.zzdj(((StringBuilder) (obj3)).toString());
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(25 + String.valueOf(((Object) (s))).length());
			stringbuilder.append("Preload failed for URL \"");
			stringbuilder.append(s);
			stringbuilder.append("\"");
			zzakb.zzc(stringbuilder.toString(), ((Throwable) (obj3)));
		}
		if(file1.exists() && !file1.delete())
		{
			obj3 = ((Object) (String.valueOf(((Object) (file1.getAbsolutePath())))));
			if(((String) (obj3)).length() != 0)
				obj3 = ((Object) ("Could not delete partial cache file at ".concat(((String) (obj3)))));
			else
				obj3 = ((Object) (new String("Could not delete partial cache file at ")));
			zzakb.zzdk(((String) (obj3)));
		}
		((zzaqh)this).zza(s, file1.getAbsolutePath(), ((String) (obj1)), ((String) (obj4)));
		zzdbg.remove(((Object) (s2)));
		return false;
		s;
		obj3;
		JVM INSTR monitorexit ;
		throw s;
		ioexception;
		if(true) goto _L26; else goto _L25
_L25:
		if(true) goto _L28; else goto _L27
_L27:
	//*1100 2401:goto            2181
	}

	private static final Set zzdbg = Collections.synchronizedSet(((Set) (new HashSet())));
	private static final DecimalFormat zzdbh = new DecimalFormat("#,###");
	private File zzdbi;
	private boolean zzdbj;

	static 
	{
	//    0    0:new             #18  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void HashSet()>
	//    3    7:invokestatic    #27  <Method Set Collections.synchronizedSet(Set)>
	//    4   10:putstatic       #29  <Field Set zzdbg>
	//    5   13:new             #31  <Class DecimalFormat>
	//    6   16:dup             
	//    7   17:ldc1            #33  <String "#,###">
	//    8   19:invokespecial   #36  <Method void DecimalFormat(String)>
	//    9   22:putstatic       #38  <Field DecimalFormat zzdbh>
	//*  10   25:return          
	}
}
