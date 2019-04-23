// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import java.util.*;

public final class zt
{

	public static List a(String s)
	{
label0:
		{
			synchronized(c)
	//*   0    0:getstatic       #23  <Field Object c>
	//*   1    3:astore          4
	//*   2    5:aload           4
	//*   3    7:monitorenter    
			{
				if(!a.containsKey(((Object) (s))))
					break label0;
	//    4    8:getstatic       #20  <Field Map a>
	//    5   11:aload_0         
	//    6   12:invokeinterface #38  <Method boolean Map.containsKey(Object)>
	//    7   17:ifeq            38
				s = ((String) ((List)a.get(((Object) (s)))));
	//    8   20:getstatic       #20  <Field Map a>
	//    9   23:aload_0         
	//   10   24:invokeinterface #42  <Method Object Map.get(Object)>
	//   11   29:checkcast       #44  <Class List>
	//   12   32:astore_0        
			}
	//   13   33:aload           4
	//   14   35:monitorexit     
			return ((List) (s));
	//   15   36:aload_0         
	//   16   37:areturn         
		}
		Object obj = c;
	//   17   38:getstatic       #23  <Field Object c>
	//   18   41:astore_3        
		obj;
	//   19   42:aload_3         
		JVM INSTR monitorenter ;
	//   20   43:monitorenter    
		if(b == null) goto _L2; else goto _L1
	//   21   44:getstatic       #46  <Field List b>
	//   22   47:ifnull          55
	//*  23   50:aload_3         
	//*  24   51:monitorexit     
	//*  25   52:goto            145
_L2:
		if(android.os.Build.VERSION.SDK_INT < 21) goto _L4; else goto _L3
	//   26   55:getstatic       #52  <Field int android.os.Build$VERSION.SDK_INT>
	//   27   58:bipush          21
	//   28   60:icmplt          83
_L3:
		b = Arrays.asList(((Object []) ((new MediaCodecList(0)).getCodecInfos())));
	//   29   63:new             #54  <Class MediaCodecList>
	//   30   66:dup             
	//   31   67:iconst_0        
	//   32   68:invokespecial   #57  <Method void MediaCodecList(int)>
	//   33   71:invokevirtual   #61  <Method MediaCodecInfo[] MediaCodecList.getCodecInfos()>
	//   34   74:invokestatic    #67  <Method List Arrays.asList(Object[])>
	//   35   77:putstatic       #46  <Field List b>
		  goto _L5
	//*  36   80:goto            143
_L4:
		if(android.os.Build.VERSION.SDK_INT < 16) goto _L7; else goto _L6
	//   37   83:getstatic       #52  <Field int android.os.Build$VERSION.SDK_INT>
	//   38   86:bipush          16
	//   39   88:icmplt          137
_L6:
		int j;
		j = MediaCodecList.getCodecCount();
	//   40   91:invokestatic    #71  <Method int MediaCodecList.getCodecCount()>
	//   41   94:istore_2        
		b = ((List) (new ArrayList(j)));
	//   42   95:new             #73  <Class ArrayList>
	//   43   98:dup             
	//   44   99:iload_2         
	//   45  100:invokespecial   #74  <Method void ArrayList(int)>
	//   46  103:putstatic       #46  <Field List b>
		int i = 0;
	//   47  106:iconst_0        
	//   48  107:istore_1        
_L8:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   49  108:iload_1         
	//   50  109:iload_2         
	//   51  110:icmpge          143
		MediaCodecInfo mediacodecinfo = MediaCodecList.getCodecInfoAt(i);
	//   52  113:iload_1         
	//   53  114:invokestatic    #78  <Method MediaCodecInfo MediaCodecList.getCodecInfoAt(int)>
	//   54  117:astore          5
		b.add(((Object) (mediacodecinfo)));
	//   55  119:getstatic       #46  <Field List b>
	//   56  122:aload           5
	//   57  124:invokeinterface #81  <Method boolean List.add(Object)>
	//   58  129:pop             
		i++;
	//   59  130:iload_1         
	//   60  131:iconst_1        
	//   61  132:iadd            
	//   62  133:istore_1        
		if(true) goto _L8; else goto _L5
	//   63  134:goto            108
_L7:
		b = Collections.emptyList();
	//   64  137:invokestatic    #87  <Method List Collections.emptyList()>
	//   65  140:putstatic       #46  <Field List b>
_L5:
		obj;
	//   66  143:aload_3         
		JVM INSTR monitorexit ;
	//   67  144:monitorexit     
_L1:
		Iterator iterator;
		obj = ((Object) (new ArrayList()));
	//   68  145:new             #73  <Class ArrayList>
	//   69  148:dup             
	//   70  149:invokespecial   #88  <Method void ArrayList()>
	//   71  152:astore_3        
		iterator = b.iterator();
	//   72  153:getstatic       #46  <Field List b>
	//   73  156:invokeinterface #92  <Method Iterator List.iterator()>
	//   74  161:astore          5
_L11:
		HashMap hashmap1;
		Object obj3;
		ArrayList arraylist;
		android.media.MediaCodecInfo.CodecProfileLevel acodecprofilelevel[];
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_485;
	//   75  163:aload           5
	//   76  165:invokeinterface #98  <Method boolean Iterator.hasNext()>
	//   77  170:ifeq            485
			obj3 = ((Object) ((MediaCodecInfo)iterator.next()));
	//   78  173:aload           5
	//   79  175:invokeinterface #102 <Method Object Iterator.next()>
	//   80  180:checkcast       #104 <Class MediaCodecInfo>
	//   81  183:astore          7
		} while(((MediaCodecInfo) (obj3)).isEncoder() || !Arrays.asList(((Object []) (((MediaCodecInfo) (obj3)).getSupportedTypes()))).contains(((Object) (s))));
	//   82  185:aload           7
	//   83  187:invokevirtual   #107 <Method boolean MediaCodecInfo.isEncoder()>
	//   84  190:ifne            163
	//   85  193:aload           7
	//   86  195:invokevirtual   #111 <Method String[] MediaCodecInfo.getSupportedTypes()>
	//   87  198:invokestatic    #67  <Method List Arrays.asList(Object[])>
	//   88  201:aload_0         
	//   89  202:invokeinterface #114 <Method boolean List.contains(Object)>
	//   90  207:ifeq            163
		hashmap1 = new HashMap();
	//   91  210:new             #15  <Class HashMap>
	//   92  213:dup             
	//   93  214:invokespecial   #18  <Method void HashMap()>
	//   94  217:astore          6
		((Map) (hashmap1)).put("codecName", ((Object) (((MediaCodecInfo) (obj3)).getName())));
	//   95  219:aload           6
	//   96  221:ldc1            #116 <String "codecName">
	//   97  223:aload           7
	//   98  225:invokevirtual   #120 <Method String MediaCodecInfo.getName()>
	//   99  228:invokeinterface #124 <Method Object Map.put(Object, Object)>
	//  100  233:pop             
		obj3 = ((Object) (((MediaCodecInfo) (obj3)).getCapabilitiesForType(s)));
	//  101  234:aload           7
	//  102  236:aload_0         
	//  103  237:invokevirtual   #128 <Method android.media.MediaCodecInfo$CodecCapabilities MediaCodecInfo.getCapabilitiesForType(String)>
	//  104  240:astore          7
		arraylist = new ArrayList();
	//  105  242:new             #73  <Class ArrayList>
	//  106  245:dup             
	//  107  246:invokespecial   #88  <Method void ArrayList()>
	//  108  249:astore          8
		acodecprofilelevel = ((android.media.MediaCodecInfo.CodecCapabilities) (obj3)).profileLevels;
	//  109  251:aload           7
	//  110  253:getfield        #134 <Field android.media.MediaCodecInfo$CodecProfileLevel[] android.media.MediaCodecInfo$CodecCapabilities.profileLevels>
	//  111  256:astore          9
		j = acodecprofilelevel.length;
	//  112  258:aload           9
	//  113  260:arraylength     
	//  114  261:istore_2        
		i = 0;
	//  115  262:iconst_0        
	//  116  263:istore_1        
_L10:
		android.media.MediaCodecInfo.CodecProfileLevel codecprofilelevel;
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//  117  264:iload_1         
	//  118  265:iload_2         
	//  119  266:icmpge          314
		codecprofilelevel = acodecprofilelevel[i];
	//  120  269:aload           9
	//  121  271:iload_1         
	//  122  272:aaload          
	//  123  273:astore          10
		arraylist.add(((Object) (new Integer[] {
			Integer.valueOf(codecprofilelevel.profile), Integer.valueOf(codecprofilelevel.level)
		})));
	//  124  275:aload           8
	//  125  277:iconst_2        
	//  126  278:anewarray       Integer[]
	//  127  281:dup             
	//  128  282:iconst_0        
	//  129  283:aload           10
	//  130  285:getfield        #141 <Field int android.media.MediaCodecInfo$CodecProfileLevel.profile>
	//  131  288:invokestatic    #145 <Method Integer Integer.valueOf(int)>
	//  132  291:aastore         
	//  133  292:dup             
	//  134  293:iconst_1        
	//  135  294:aload           10
	//  136  296:getfield        #148 <Field int android.media.MediaCodecInfo$CodecProfileLevel.level>
	//  137  299:invokestatic    #145 <Method Integer Integer.valueOf(int)>
	//  138  302:aastore         
	//  139  303:invokevirtual   #149 <Method boolean ArrayList.add(Object)>
	//  140  306:pop             
		i++;
	//  141  307:iload_1         
	//  142  308:iconst_1        
	//  143  309:iadd            
	//  144  310:istore_1        
		if(true) goto _L10; else goto _L9
	//  145  311:goto            264
_L9:
		((Map) (hashmap1)).put("profileLevels", ((Object) (arraylist)));
	//  146  314:aload           6
	//  147  316:ldc1            #150 <String "profileLevels">
	//  148  318:aload           8
	//  149  320:invokeinterface #124 <Method Object Map.put(Object, Object)>
	//  150  325:pop             
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 151  326:getstatic       #52  <Field int android.os.Build$VERSION.SDK_INT>
	//* 152  329:bipush          21
	//* 153  331:icmplt          449
		{
			android.media.MediaCodecInfo.VideoCapabilities videocapabilities = ((android.media.MediaCodecInfo.CodecCapabilities) (obj3)).getVideoCapabilities();
	//  154  334:aload           7
	//  155  336:invokevirtual   #154 <Method android.media.MediaCodecInfo$VideoCapabilities android.media.MediaCodecInfo$CodecCapabilities.getVideoCapabilities()>
	//  156  339:astore          8
			((Map) (hashmap1)).put("bitRatesBps", ((Object) (a(videocapabilities.getBitrateRange()))));
	//  157  341:aload           6
	//  158  343:ldc1            #156 <String "bitRatesBps">
	//  159  345:aload           8
	//  160  347:invokevirtual   #162 <Method Range android.media.MediaCodecInfo$VideoCapabilities.getBitrateRange()>
	//  161  350:invokestatic    #165 <Method Integer[] a(Range)>
	//  162  353:invokeinterface #124 <Method Object Map.put(Object, Object)>
	//  163  358:pop             
			((Map) (hashmap1)).put("widthAlignment", ((Object) (Integer.valueOf(videocapabilities.getWidthAlignment()))));
	//  164  359:aload           6
	//  165  361:ldc1            #167 <String "widthAlignment">
	//  166  363:aload           8
	//  167  365:invokevirtual   #170 <Method int android.media.MediaCodecInfo$VideoCapabilities.getWidthAlignment()>
	//  168  368:invokestatic    #145 <Method Integer Integer.valueOf(int)>
	//  169  371:invokeinterface #124 <Method Object Map.put(Object, Object)>
	//  170  376:pop             
			((Map) (hashmap1)).put("heightAlignment", ((Object) (Integer.valueOf(videocapabilities.getHeightAlignment()))));
	//  171  377:aload           6
	//  172  379:ldc1            #172 <String "heightAlignment">
	//  173  381:aload           8
	//  174  383:invokevirtual   #175 <Method int android.media.MediaCodecInfo$VideoCapabilities.getHeightAlignment()>
	//  175  386:invokestatic    #145 <Method Integer Integer.valueOf(int)>
	//  176  389:invokeinterface #124 <Method Object Map.put(Object, Object)>
	//  177  394:pop             
			((Map) (hashmap1)).put("frameRates", ((Object) (a(videocapabilities.getSupportedFrameRates()))));
	//  178  395:aload           6
	//  179  397:ldc1            #177 <String "frameRates">
	//  180  399:aload           8
	//  181  401:invokevirtual   #180 <Method Range android.media.MediaCodecInfo$VideoCapabilities.getSupportedFrameRates()>
	//  182  404:invokestatic    #165 <Method Integer[] a(Range)>
	//  183  407:invokeinterface #124 <Method Object Map.put(Object, Object)>
	//  184  412:pop             
			((Map) (hashmap1)).put("widths", ((Object) (a(videocapabilities.getSupportedWidths()))));
	//  185  413:aload           6
	//  186  415:ldc1            #182 <String "widths">
	//  187  417:aload           8
	//  188  419:invokevirtual   #185 <Method Range android.media.MediaCodecInfo$VideoCapabilities.getSupportedWidths()>
	//  189  422:invokestatic    #165 <Method Integer[] a(Range)>
	//  190  425:invokeinterface #124 <Method Object Map.put(Object, Object)>
	//  191  430:pop             
			((Map) (hashmap1)).put("heights", ((Object) (a(videocapabilities.getSupportedHeights()))));
	//  192  431:aload           6
	//  193  433:ldc1            #187 <String "heights">
	//  194  435:aload           8
	//  195  437:invokevirtual   #190 <Method Range android.media.MediaCodecInfo$VideoCapabilities.getSupportedHeights()>
	//  196  440:invokestatic    #165 <Method Integer[] a(Range)>
	//  197  443:invokeinterface #124 <Method Object Map.put(Object, Object)>
	//  198  448:pop             
		}
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//* 199  449:getstatic       #52  <Field int android.os.Build$VERSION.SDK_INT>
	//* 200  452:bipush          23
	//* 201  454:icmplt          475
			((Map) (hashmap1)).put("instancesLimit", ((Object) (Integer.valueOf(((android.media.MediaCodecInfo.CodecCapabilities) (obj3)).getMaxSupportedInstances()))));
	//  202  457:aload           6
	//  203  459:ldc1            #192 <String "instancesLimit">
	//  204  461:aload           7
	//  205  463:invokevirtual   #195 <Method int android.media.MediaCodecInfo$CodecCapabilities.getMaxSupportedInstances()>
	//  206  466:invokestatic    #145 <Method Integer Integer.valueOf(int)>
	//  207  469:invokeinterface #124 <Method Object Map.put(Object, Object)>
	//  208  474:pop             
		((ArrayList) (obj)).add(((Object) (hashmap1)));
	//  209  475:aload_3         
	//  210  476:aload           6
	//  211  478:invokevirtual   #149 <Method boolean ArrayList.add(Object)>
	//  212  481:pop             
		  goto _L11
	//* 213  482:goto            163
		a.put(((Object) (s)), obj);
	//  214  485:getstatic       #20  <Field Map a>
	//  215  488:aload_0         
	//  216  489:aload_3         
	//  217  490:invokeinterface #124 <Method Object Map.put(Object, Object)>
	//  218  495:pop             
		obj2;
	//  219  496:aload           4
		JVM INSTR monitorexit ;
	//  220  498:monitorexit     
		return ((List) (obj));
	//  221  499:aload_3         
	//  222  500:areturn         
		Exception exception;
		exception;
	//  223  501:astore          5
		obj;
	//  224  503:aload_3         
		JVM INSTR monitorexit ;
	//  225  504:monitorexit     
		throw exception;
	//  226  505:aload           5
	//  227  507:athrow          
		Object obj1;
		obj1;
	//  228  508:astore_3        
		break MISSING_BLOCK_LABEL_513;
	//  229  509:goto            513
		obj1;
	//  230  512:astore_3        
		HashMap hashmap = new HashMap();
	//  231  513:new             #15  <Class HashMap>
	//  232  516:dup             
	//  233  517:invokespecial   #18  <Method void HashMap()>
	//  234  520:astore          5
		((Map) (hashmap)).put("error", ((Object) (obj1.getClass().getSimpleName())));
	//  235  522:aload           5
	//  236  524:ldc1            #197 <String "error">
	//  237  526:aload_3         
	//  238  527:invokevirtual   #201 <Method Class Object.getClass()>
	//  239  530:invokevirtual   #206 <Method String Class.getSimpleName()>
	//  240  533:invokeinterface #124 <Method Object Map.put(Object, Object)>
	//  241  538:pop             
		obj1 = ((Object) (new ArrayList()));
	//  242  539:new             #73  <Class ArrayList>
	//  243  542:dup             
	//  244  543:invokespecial   #88  <Method void ArrayList()>
	//  245  546:astore_3        
		((ArrayList) (obj1)).add(((Object) (hashmap)));
	//  246  547:aload_3         
	//  247  548:aload           5
	//  248  550:invokevirtual   #149 <Method boolean ArrayList.add(Object)>
	//  249  553:pop             
		a.put(((Object) (s)), obj1);
	//  250  554:getstatic       #20  <Field Map a>
	//  251  557:aload_0         
	//  252  558:aload_3         
	//  253  559:invokeinterface #124 <Method Object Map.put(Object, Object)>
	//  254  564:pop             
		obj2;
	//  255  565:aload           4
		JVM INSTR monitorexit ;
	//  256  567:monitorexit     
		return ((List) (obj1));
	//  257  568:aload_3         
	//  258  569:areturn         
		s;
	//  259  570:astore_0        
		obj2;
	//  260  571:aload           4
		JVM INSTR monitorexit ;
	//  261  573:monitorexit     
		throw s;
	//  262  574:aload_0         
	//  263  575:athrow          
	}

	private static Integer[] a(Range range)
	{
		return (new Integer[] {
			(Integer)range.getLower(), (Integer)range.getUpper()
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Integer[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:invokevirtual   #214 <Method Comparable Range.getLower()>
	//    6   10:checkcast       #136 <Class Integer>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #217 <Method Comparable Range.getUpper()>
	//   12   20:checkcast       #136 <Class Integer>
	//   13   23:aastore         
	//   14   24:areturn         
	}

	private static Map a = new HashMap();
	private static List b;
	private static final Object c = new Object();

	static 
	{
	//    0    0:new             #15  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void HashMap()>
	//    3    7:putstatic       #20  <Field Map a>
	//    4   10:new             #4   <Class Object>
	//    5   13:dup             
	//    6   14:invokespecial   #21  <Method void Object()>
	//    7   17:putstatic       #23  <Field Object c>
	//*   8   20:return          
	}
}
