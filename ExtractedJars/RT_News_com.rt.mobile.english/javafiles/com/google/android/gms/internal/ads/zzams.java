// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import java.util.*;

public final class zzams
{

	private static Integer[] zza(Range range)
	{
		return (new Integer[] {
			(Integer)range.getLower(), (Integer)range.getUpper()
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Integer[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:invokevirtual   #39  <Method Comparable Range.getLower()>
	//    6   10:checkcast       #33  <Class Integer>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #42  <Method Comparable Range.getUpper()>
	//   12   20:checkcast       #33  <Class Integer>
	//   13   23:aastore         
	//   14   24:areturn         
	}

	public static List zzdd(String s)
	{
label0:
		{
			synchronized(zzcui)
	//*   0    0:getstatic       #25  <Field Object zzcui>
	//*   1    3:astore          4
	//*   2    5:aload           4
	//*   3    7:monitorenter    
			{
				if(!zzcug.containsKey(((Object) (s))))
					break label0;
	//    4    8:getstatic       #22  <Field Map zzcug>
	//    5   11:aload_0         
	//    6   12:invokeinterface #58  <Method boolean Map.containsKey(Object)>
	//    7   17:ifeq            38
				s = ((String) ((List)zzcug.get(((Object) (s)))));
	//    8   20:getstatic       #22  <Field Map zzcug>
	//    9   23:aload_0         
	//   10   24:invokeinterface #62  <Method Object Map.get(Object)>
	//   11   29:checkcast       #64  <Class List>
	//   12   32:astore_0        
			}
	//   13   33:aload           4
	//   14   35:monitorexit     
			return ((List) (s));
	//   15   36:aload_0         
	//   16   37:areturn         
		}
		Object obj2 = zzcui;
	//   17   38:getstatic       #25  <Field Object zzcui>
	//   18   41:astore          5
		obj2;
	//   19   43:aload           5
		JVM INSTR monitorenter ;
	//   20   45:monitorenter    
		if(zzcuh != null)
			break MISSING_BLOCK_LABEL_147;
	//   21   46:getstatic       #66  <Field List zzcuh>
	//   22   49:ifnull          58
	//*  23   52:aload           5
	//*  24   54:monitorexit     
	//*  25   55:goto            147
		if(android.os.Build.VERSION.SDK_INT < 21) goto _L2; else goto _L1
	//   26   58:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//   27   61:bipush          21
	//   28   63:icmplt          88
_L1:
		Object obj = ((Object) (Arrays.asList(((Object []) ((new MediaCodecList(0)).getCodecInfos())))));
	//   29   66:new             #74  <Class MediaCodecList>
	//   30   69:dup             
	//   31   70:iconst_0        
	//   32   71:invokespecial   #77  <Method void MediaCodecList(int)>
	//   33   74:invokevirtual   #81  <Method MediaCodecInfo[] MediaCodecList.getCodecInfos()>
	//   34   77:invokestatic    #87  <Method List Arrays.asList(Object[])>
	//   35   80:astore_3        
_L5:
		zzcuh = ((List) (obj));
	//   36   81:aload_3         
	//   37   82:putstatic       #66  <Field List zzcuh>
		break MISSING_BLOCK_LABEL_147;
	//   38   85:goto            52
_L2:
		int j;
		if(android.os.Build.VERSION.SDK_INT < 16)
			break MISSING_BLOCK_LABEL_140;
	//   39   88:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//   40   91:bipush          16
	//   41   93:icmplt          140
		j = MediaCodecList.getCodecCount();
	//   42   96:invokestatic    #91  <Method int MediaCodecList.getCodecCount()>
	//   43   99:istore_2        
		zzcuh = ((List) (new ArrayList(j)));
	//   44  100:new             #93  <Class ArrayList>
	//   45  103:dup             
	//   46  104:iload_2         
	//   47  105:invokespecial   #94  <Method void ArrayList(int)>
	//   48  108:putstatic       #66  <Field List zzcuh>
		int i = 0;
	//   49  111:iconst_0        
	//   50  112:istore_1        
_L4:
		if(i >= j)
			break MISSING_BLOCK_LABEL_147;
	//   51  113:iload_1         
	//   52  114:iload_2         
	//   53  115:icmpge          52
		obj = ((Object) (MediaCodecList.getCodecInfoAt(i)));
	//   54  118:iload_1         
	//   55  119:invokestatic    #98  <Method MediaCodecInfo MediaCodecList.getCodecInfoAt(int)>
	//   56  122:astore_3        
		zzcuh.add(obj);
	//   57  123:getstatic       #66  <Field List zzcuh>
	//   58  126:aload_3         
	//   59  127:invokeinterface #101 <Method boolean List.add(Object)>
	//   60  132:pop             
		i++;
	//   61  133:iload_1         
	//   62  134:iconst_1        
	//   63  135:iadd            
	//   64  136:istore_1        
		if(true) goto _L4; else goto _L3
_L3:
		break MISSING_BLOCK_LABEL_147;
	//   65  137:goto            113
		obj = ((Object) (Collections.emptyList()));
	//   66  140:invokestatic    #107 <Method List Collections.emptyList()>
	//   67  143:astore_3        
		  goto _L5
	//*  68  144:goto            81
_L10:
		obj = ((Object) (new ArrayList()));
	//   69  147:new             #93  <Class ArrayList>
	//   70  150:dup             
	//   71  151:invokespecial   #108 <Method void ArrayList()>
	//   72  154:astore_3        
		obj2 = ((Object) (zzcuh.iterator()));
	//   73  155:getstatic       #66  <Field List zzcuh>
	//   74  158:invokeinterface #112 <Method Iterator List.iterator()>
	//   75  163:astore          5
_L8:
		HashMap hashmap1;
		Object obj4;
		ArrayList arraylist;
		android.media.MediaCodecInfo.CodecProfileLevel acodecprofilelevel[];
		do
		{
			if(!((Iterator) (obj2)).hasNext())
				break MISSING_BLOCK_LABEL_487;
	//   76  165:aload           5
	//   77  167:invokeinterface #118 <Method boolean Iterator.hasNext()>
	//   78  172:ifeq            487
			obj4 = ((Object) ((MediaCodecInfo)((Iterator) (obj2)).next()));
	//   79  175:aload           5
	//   80  177:invokeinterface #122 <Method Object Iterator.next()>
	//   81  182:checkcast       #124 <Class MediaCodecInfo>
	//   82  185:astore          7
		} while(((MediaCodecInfo) (obj4)).isEncoder() || !Arrays.asList(((Object []) (((MediaCodecInfo) (obj4)).getSupportedTypes()))).contains(((Object) (s))));
	//   83  187:aload           7
	//   84  189:invokevirtual   #127 <Method boolean MediaCodecInfo.isEncoder()>
	//   85  192:ifne            165
	//   86  195:aload           7
	//   87  197:invokevirtual   #131 <Method String[] MediaCodecInfo.getSupportedTypes()>
	//   88  200:invokestatic    #87  <Method List Arrays.asList(Object[])>
	//   89  203:aload_0         
	//   90  204:invokeinterface #134 <Method boolean List.contains(Object)>
	//   91  209:ifeq            165
		hashmap1 = new HashMap();
	//   92  212:new             #17  <Class HashMap>
	//   93  215:dup             
	//   94  216:invokespecial   #20  <Method void HashMap()>
	//   95  219:astore          6
		((Map) (hashmap1)).put("codecName", ((Object) (((MediaCodecInfo) (obj4)).getName())));
	//   96  221:aload           6
	//   97  223:ldc1            #136 <String "codecName">
	//   98  225:aload           7
	//   99  227:invokevirtual   #140 <Method String MediaCodecInfo.getName()>
	//  100  230:invokeinterface #144 <Method Object Map.put(Object, Object)>
	//  101  235:pop             
		obj4 = ((Object) (((MediaCodecInfo) (obj4)).getCapabilitiesForType(s)));
	//  102  236:aload           7
	//  103  238:aload_0         
	//  104  239:invokevirtual   #148 <Method android.media.MediaCodecInfo$CodecCapabilities MediaCodecInfo.getCapabilitiesForType(String)>
	//  105  242:astore          7
		arraylist = new ArrayList();
	//  106  244:new             #93  <Class ArrayList>
	//  107  247:dup             
	//  108  248:invokespecial   #108 <Method void ArrayList()>
	//  109  251:astore          8
		acodecprofilelevel = ((android.media.MediaCodecInfo.CodecCapabilities) (obj4)).profileLevels;
	//  110  253:aload           7
	//  111  255:getfield        #154 <Field android.media.MediaCodecInfo$CodecProfileLevel[] android.media.MediaCodecInfo$CodecCapabilities.profileLevels>
	//  112  258:astore          9
		j = acodecprofilelevel.length;
	//  113  260:aload           9
	//  114  262:arraylength     
	//  115  263:istore_2        
		i = 0;
	//  116  264:iconst_0        
	//  117  265:istore_1        
_L7:
		android.media.MediaCodecInfo.CodecProfileLevel codecprofilelevel;
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//  118  266:iload_1         
	//  119  267:iload_2         
	//  120  268:icmpge          316
		codecprofilelevel = acodecprofilelevel[i];
	//  121  271:aload           9
	//  122  273:iload_1         
	//  123  274:aaload          
	//  124  275:astore          10
		arraylist.add(((Object) (new Integer[] {
			Integer.valueOf(codecprofilelevel.profile), Integer.valueOf(codecprofilelevel.level)
		})));
	//  125  277:aload           8
	//  126  279:iconst_2        
	//  127  280:anewarray       Integer[]
	//  128  283:dup             
	//  129  284:iconst_0        
	//  130  285:aload           10
	//  131  287:getfield        #159 <Field int android.media.MediaCodecInfo$CodecProfileLevel.profile>
	//  132  290:invokestatic    #163 <Method Integer Integer.valueOf(int)>
	//  133  293:aastore         
	//  134  294:dup             
	//  135  295:iconst_1        
	//  136  296:aload           10
	//  137  298:getfield        #166 <Field int android.media.MediaCodecInfo$CodecProfileLevel.level>
	//  138  301:invokestatic    #163 <Method Integer Integer.valueOf(int)>
	//  139  304:aastore         
	//  140  305:invokevirtual   #167 <Method boolean ArrayList.add(Object)>
	//  141  308:pop             
		i++;
	//  142  309:iload_1         
	//  143  310:iconst_1        
	//  144  311:iadd            
	//  145  312:istore_1        
		if(true) goto _L7; else goto _L6
	//  146  313:goto            266
_L6:
		((Map) (hashmap1)).put("profileLevels", ((Object) (arraylist)));
	//  147  316:aload           6
	//  148  318:ldc1            #168 <String "profileLevels">
	//  149  320:aload           8
	//  150  322:invokeinterface #144 <Method Object Map.put(Object, Object)>
	//  151  327:pop             
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 152  328:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//* 153  331:bipush          21
	//* 154  333:icmplt          451
		{
			android.media.MediaCodecInfo.VideoCapabilities videocapabilities = ((android.media.MediaCodecInfo.CodecCapabilities) (obj4)).getVideoCapabilities();
	//  155  336:aload           7
	//  156  338:invokevirtual   #172 <Method android.media.MediaCodecInfo$VideoCapabilities android.media.MediaCodecInfo$CodecCapabilities.getVideoCapabilities()>
	//  157  341:astore          8
			((Map) (hashmap1)).put("bitRatesBps", ((Object) (zza(videocapabilities.getBitrateRange()))));
	//  158  343:aload           6
	//  159  345:ldc1            #174 <String "bitRatesBps">
	//  160  347:aload           8
	//  161  349:invokevirtual   #180 <Method Range android.media.MediaCodecInfo$VideoCapabilities.getBitrateRange()>
	//  162  352:invokestatic    #182 <Method Integer[] zza(Range)>
	//  163  355:invokeinterface #144 <Method Object Map.put(Object, Object)>
	//  164  360:pop             
			((Map) (hashmap1)).put("widthAlignment", ((Object) (Integer.valueOf(videocapabilities.getWidthAlignment()))));
	//  165  361:aload           6
	//  166  363:ldc1            #184 <String "widthAlignment">
	//  167  365:aload           8
	//  168  367:invokevirtual   #187 <Method int android.media.MediaCodecInfo$VideoCapabilities.getWidthAlignment()>
	//  169  370:invokestatic    #163 <Method Integer Integer.valueOf(int)>
	//  170  373:invokeinterface #144 <Method Object Map.put(Object, Object)>
	//  171  378:pop             
			((Map) (hashmap1)).put("heightAlignment", ((Object) (Integer.valueOf(videocapabilities.getHeightAlignment()))));
	//  172  379:aload           6
	//  173  381:ldc1            #189 <String "heightAlignment">
	//  174  383:aload           8
	//  175  385:invokevirtual   #192 <Method int android.media.MediaCodecInfo$VideoCapabilities.getHeightAlignment()>
	//  176  388:invokestatic    #163 <Method Integer Integer.valueOf(int)>
	//  177  391:invokeinterface #144 <Method Object Map.put(Object, Object)>
	//  178  396:pop             
			((Map) (hashmap1)).put("frameRates", ((Object) (zza(videocapabilities.getSupportedFrameRates()))));
	//  179  397:aload           6
	//  180  399:ldc1            #194 <String "frameRates">
	//  181  401:aload           8
	//  182  403:invokevirtual   #197 <Method Range android.media.MediaCodecInfo$VideoCapabilities.getSupportedFrameRates()>
	//  183  406:invokestatic    #182 <Method Integer[] zza(Range)>
	//  184  409:invokeinterface #144 <Method Object Map.put(Object, Object)>
	//  185  414:pop             
			((Map) (hashmap1)).put("widths", ((Object) (zza(videocapabilities.getSupportedWidths()))));
	//  186  415:aload           6
	//  187  417:ldc1            #199 <String "widths">
	//  188  419:aload           8
	//  189  421:invokevirtual   #202 <Method Range android.media.MediaCodecInfo$VideoCapabilities.getSupportedWidths()>
	//  190  424:invokestatic    #182 <Method Integer[] zza(Range)>
	//  191  427:invokeinterface #144 <Method Object Map.put(Object, Object)>
	//  192  432:pop             
			((Map) (hashmap1)).put("heights", ((Object) (zza(videocapabilities.getSupportedHeights()))));
	//  193  433:aload           6
	//  194  435:ldc1            #204 <String "heights">
	//  195  437:aload           8
	//  196  439:invokevirtual   #207 <Method Range android.media.MediaCodecInfo$VideoCapabilities.getSupportedHeights()>
	//  197  442:invokestatic    #182 <Method Integer[] zza(Range)>
	//  198  445:invokeinterface #144 <Method Object Map.put(Object, Object)>
	//  199  450:pop             
		}
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//* 200  451:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//* 201  454:bipush          23
	//* 202  456:icmplt          477
			((Map) (hashmap1)).put("instancesLimit", ((Object) (Integer.valueOf(((android.media.MediaCodecInfo.CodecCapabilities) (obj4)).getMaxSupportedInstances()))));
	//  203  459:aload           6
	//  204  461:ldc1            #209 <String "instancesLimit">
	//  205  463:aload           7
	//  206  465:invokevirtual   #212 <Method int android.media.MediaCodecInfo$CodecCapabilities.getMaxSupportedInstances()>
	//  207  468:invokestatic    #163 <Method Integer Integer.valueOf(int)>
	//  208  471:invokeinterface #144 <Method Object Map.put(Object, Object)>
	//  209  476:pop             
		((ArrayList) (obj)).add(((Object) (hashmap1)));
	//  210  477:aload_3         
	//  211  478:aload           6
	//  212  480:invokevirtual   #167 <Method boolean ArrayList.add(Object)>
	//  213  483:pop             
		  goto _L8
	//* 214  484:goto            165
		zzcug.put(((Object) (s)), obj);
	//  215  487:getstatic       #22  <Field Map zzcug>
	//  216  490:aload_0         
	//  217  491:aload_3         
	//  218  492:invokeinterface #144 <Method Object Map.put(Object, Object)>
	//  219  497:pop             
		obj1;
	//  220  498:aload           4
		JVM INSTR monitorexit ;
	//  221  500:monitorexit     
		return ((List) (obj));
	//  222  501:aload_3         
	//  223  502:areturn         
		Exception exception;
		exception;
	//  224  503:astore_3        
		obj2;
	//  225  504:aload           5
		JVM INSTR monitorexit ;
	//  226  506:monitorexit     
		throw exception;
	//  227  507:aload_3         
	//  228  508:athrow          
		Object obj3;
		obj3;
	//  229  509:astore          5
		HashMap hashmap = new HashMap();
	//  230  511:new             #17  <Class HashMap>
	//  231  514:dup             
	//  232  515:invokespecial   #20  <Method void HashMap()>
	//  233  518:astore_3        
		((Map) (hashmap)).put("error", ((Object) (obj3.getClass().getSimpleName())));
	//  234  519:aload_3         
	//  235  520:ldc1            #214 <String "error">
	//  236  522:aload           5
	//  237  524:invokevirtual   #218 <Method Class Object.getClass()>
	//  238  527:invokevirtual   #223 <Method String Class.getSimpleName()>
	//  239  530:invokeinterface #144 <Method Object Map.put(Object, Object)>
	//  240  535:pop             
		obj3 = ((Object) (new ArrayList()));
	//  241  536:new             #93  <Class ArrayList>
	//  242  539:dup             
	//  243  540:invokespecial   #108 <Method void ArrayList()>
	//  244  543:astore          5
		((ArrayList) (obj3)).add(((Object) (hashmap)));
	//  245  545:aload           5
	//  246  547:aload_3         
	//  247  548:invokevirtual   #167 <Method boolean ArrayList.add(Object)>
	//  248  551:pop             
		zzcug.put(((Object) (s)), obj3);
	//  249  552:getstatic       #22  <Field Map zzcug>
	//  250  555:aload_0         
	//  251  556:aload           5
	//  252  558:invokeinterface #144 <Method Object Map.put(Object, Object)>
	//  253  563:pop             
		obj1;
	//  254  564:aload           4
		JVM INSTR monitorexit ;
	//  255  566:monitorexit     
		return ((List) (obj3));
	//  256  567:aload           5
	//  257  569:areturn         
		s;
	//  258  570:astore_0        
		obj1;
	//  259  571:aload           4
		JVM INSTR monitorexit ;
	//  260  573:monitorexit     
		throw s;
	//  261  574:aload_0         
	//  262  575:athrow          
		if(true) goto _L10; else goto _L9
_L9:
	}

	private static Map zzcug = new HashMap();
	private static List zzcuh;
	private static final Object zzcui = new Object();

	static 
	{
	//    0    0:new             #17  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void HashMap()>
	//    3    7:putstatic       #22  <Field Map zzcug>
	//    4   10:new             #4   <Class Object>
	//    5   13:dup             
	//    6   14:invokespecial   #23  <Method void Object()>
	//    7   17:putstatic       #25  <Field Object zzcui>
	//*   8   20:return          
	}
}
