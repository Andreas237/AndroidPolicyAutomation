// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.sensor;

import android.os.*;
import com.samsung.android.sdk.health.sensor._PlatformSensorDataListener;
import com.sec.android.service.health.util.LOG;

// Referenced classes of package com.sec.android.service.health.sensor:
//			PrivilegeSensorService

static final class PrivilegeSensorService$2 extends Handler
{

	public void handleMessage(Message message)
	{
		Object obj1;
		obj1 = ((Object) (message.getData()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #21  <Method Bundle Message.getData()>
	//    2    4:astore          5
		LOG.d(PrivilegeSensorService.access$100(), (new StringBuilder()).append("[SensorListener] mCbHandler handleMessage msg.what : ").append(message.what).toString());
	//    3    6:invokestatic    #25  <Method Class PrivilegeSensorService.access$100()>
	//    4    9:new             #27  <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #28  <Method void StringBuilder()>
	//    7   16:ldc1            #30  <String "[SensorListener] mCbHandler handleMessage msg.what : ">
	//    8   18:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:aload_1         
	//   10   22:getfield        #38  <Field int Message.what>
	//   11   25:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//   12   28:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   13   31:invokestatic    #51  <Method void LOG.d(Class, String)>
		message.what;
	//   14   34:aload_1         
	//   15   35:getfield        #38  <Field int Message.what>
		JVM INSTR tableswitch 101 104: default 68
	//	               101 536
	//	               102 308
	//	               103 700
	//	               104 77;
	//   16   38:tableswitch     101 104: default 68
	//	               101 536
	//	               102 308
	//	               103 700
	//	               104 77
		   goto _L1 _L2 _L3 _L4 _L5
_L1:
		LOG.e(PrivilegeSensorService.access$100(), "[SensorListener] handleMessage case default");
	//   17   68:invokestatic    #25  <Method Class PrivilegeSensorService.access$100()>
	//   18   71:ldc1            #53  <String "[SensorListener] handleMessage case default">
	//   19   73:invokestatic    #56  <Method void LOG.e(Class, String)>
_L7:
		return;
	//   20   76:return          
_L5:
		Bundle abundle[];
		RemoteCallbackList remotecallbacklist;
		abundle = null;
	//   21   77:aconst_null     
	//   22   78:astore          4
		if(((Bundle) (obj1)).containsKey("_Extra"))
	//*  23   80:aload           5
	//*  24   82:ldc1            #58  <String "_Extra">
	//*  25   84:invokevirtual   #64  <Method boolean Bundle.containsKey(String)>
	//*  26   87:ifeq            105
			abundle = (Bundle[])(Bundle[])((Bundle) (obj1)).getParcelableArray("_Extra");
	//   27   90:aload           5
	//   28   92:ldc1            #58  <String "_Extra">
	//   29   94:invokevirtual   #68  <Method android.os.Parcelable[] Bundle.getParcelableArray(String)>
	//   30   97:checkcast       #70  <Class Bundle[]>
	//   31  100:checkcast       #70  <Class Bundle[]>
	//   32  103:astore          4
		remotecallbacklist = (RemoteCallbackList)message.obj;
	//   33  105:aload_1         
	//   34  106:getfield        #74  <Field Object Message.obj>
	//   35  109:checkcast       #76  <Class RemoteCallbackList>
	//   36  112:astore          6
		if(remotecallbacklist == null) goto _L7; else goto _L6
	//   37  114:aload           6
	//   38  116:ifnull          76
_L6:
		obj1 = PrivilegeSensorService.beginBroadcast;
	//   39  119:getstatic       #79  <Field Object PrivilegeSensorService.beginBroadcast>
	//   40  122:astore          5
		obj1;
	//   41  124:aload           5
		JVM INSTR monitorenter ;
	//   42  126:monitorenter    
		int j;
		j = remotecallbacklist.beginBroadcast();
	//   43  127:aload           6
	//   44  129:invokevirtual   #82  <Method int RemoteCallbackList.beginBroadcast()>
	//   45  132:istore_3        
		LOG.d(PrivilegeSensorService.access$100(), (new StringBuilder()).append("HANDLER_DATA_RECEIVED broadcastNum = ").append(j).toString());
	//   46  133:invokestatic    #25  <Method Class PrivilegeSensorService.access$100()>
	//   47  136:new             #27  <Class StringBuilder>
	//   48  139:dup             
	//   49  140:invokespecial   #28  <Method void StringBuilder()>
	//   50  143:ldc1            #84  <String "HANDLER_DATA_RECEIVED broadcastNum = ">
	//   51  145:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   52  148:iload_3         
	//   53  149:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//   54  152:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   55  155:invokestatic    #51  <Method void LOG.d(Class, String)>
		int i = 0;
	//   56  158:iconst_0        
	//   57  159:istore_2        
_L14:
		if(i >= j) goto _L9; else goto _L8
	//   58  160:iload_2         
	//   59  161:iload_3         
	//   60  162:icmpge          299
_L8:
		if(remotecallbacklist.getBroadcastItem(i) == null) goto _L11; else goto _L10
	//   61  165:aload           6
	//   62  167:iload_2         
	//   63  168:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   64  171:ifnull          199
_L10:
		if(abundle == null) goto _L13; else goto _L12
	//   65  174:aload           4
	//   66  176:ifnull          227
_L12:
		((_PlatformSensorDataListener)remotecallbacklist.getBroadcastItem(i)).onBulkDataReceived(message.arg1, abundle);
	//   67  179:aload           6
	//   68  181:iload_2         
	//   69  182:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   70  185:checkcast       #90  <Class _PlatformSensorDataListener>
	//   71  188:aload_1         
	//   72  189:getfield        #93  <Field int Message.arg1>
	//   73  192:aload           4
	//   74  194:invokeinterface #97  <Method void _PlatformSensorDataListener.onBulkDataReceived(int, Bundle[])>
_L11:
		if(remotecallbacklist.getBroadcastItem(i) != null)
	//*  75  199:aload           6
	//*  76  201:iload_2         
	//*  77  202:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//*  78  205:ifnull          220
			remotecallbacklist.unregister(remotecallbacklist.getBroadcastItem(i));
	//   79  208:aload           6
	//   80  210:aload           6
	//   81  212:iload_2         
	//   82  213:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   83  216:invokevirtual   #101 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
	//   84  219:pop             
_L16:
		i++;
	//   85  220:iload_2         
	//   86  221:iconst_1        
	//   87  222:iadd            
	//   88  223:istore_2        
		  goto _L14
	//*  89  224:goto            160
_L13:
		LOG.e(PrivilegeSensorService.access$100(), "HANDLER_DATA_RECEIVED  data and extra are null");
	//   90  227:invokestatic    #25  <Method Class PrivilegeSensorService.access$100()>
	//   91  230:ldc1            #103 <String "HANDLER_DATA_RECEIVED  data and extra are null">
	//   92  232:invokestatic    #56  <Method void LOG.e(Class, String)>
		  goto _L11
	//*  93  235:goto            199
		RemoteException remoteexception1;
		remoteexception1;
	//   94  238:astore          7
		remoteexception1.printStackTrace();
	//   95  240:aload           7
	//   96  242:invokevirtual   #106 <Method void RemoteException.printStackTrace()>
		if(remotecallbacklist.getBroadcastItem(i) == null) goto _L16; else goto _L15
	//   97  245:aload           6
	//   98  247:iload_2         
	//   99  248:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//  100  251:ifnull          220
_L15:
		remotecallbacklist.unregister(remotecallbacklist.getBroadcastItem(i));
	//  101  254:aload           6
	//  102  256:aload           6
	//  103  258:iload_2         
	//  104  259:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//  105  262:invokevirtual   #101 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
	//  106  265:pop             
		  goto _L16
	//* 107  266:goto            220
		message;
	//  108  269:astore_1        
		obj1;
	//  109  270:aload           5
		JVM INSTR monitorexit ;
	//  110  272:monitorexit     
		throw message;
	//  111  273:aload_1         
	//  112  274:athrow          
		message;
	//  113  275:astore_1        
		if(remotecallbacklist.getBroadcastItem(i) != null)
	//* 114  276:aload           6
	//* 115  278:iload_2         
	//* 116  279:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//* 117  282:ifnull          297
			remotecallbacklist.unregister(remotecallbacklist.getBroadcastItem(i));
	//  118  285:aload           6
	//  119  287:aload           6
	//  120  289:iload_2         
	//  121  290:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//  122  293:invokevirtual   #101 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
	//  123  296:pop             
		throw message;
	//  124  297:aload_1         
	//  125  298:athrow          
_L9:
		remotecallbacklist.finishBroadcast();
	//  126  299:aload           6
	//  127  301:invokevirtual   #109 <Method void RemoteCallbackList.finishBroadcast()>
		obj1;
	//  128  304:aload           5
		JVM INSTR monitorexit ;
	//  129  306:monitorexit     
		return;
	//  130  307:return          
_L3:
		Object obj;
		obj = null;
	//  131  308:aconst_null     
	//  132  309:astore          4
		if(((Bundle) (obj1)).containsKey("_Extra"))
	//* 133  311:aload           5
	//* 134  313:ldc1            #58  <String "_Extra">
	//* 135  315:invokevirtual   #64  <Method boolean Bundle.containsKey(String)>
	//* 136  318:ifeq            333
			obj = ((Object) ((Bundle)((Bundle) (obj1)).getParcelable("_Extra")));
	//  137  321:aload           5
	//  138  323:ldc1            #58  <String "_Extra">
	//  139  325:invokevirtual   #113 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//  140  328:checkcast       #60  <Class Bundle>
	//  141  331:astore          4
		remotecallbacklist = (RemoteCallbackList)message.obj;
	//  142  333:aload_1         
	//  143  334:getfield        #74  <Field Object Message.obj>
	//  144  337:checkcast       #76  <Class RemoteCallbackList>
	//  145  340:astore          6
		if(remotecallbacklist == null) goto _L7; else goto _L17
	//  146  342:aload           6
	//  147  344:ifnull          76
_L17:
		obj1 = PrivilegeSensorService.beginBroadcast;
	//  148  347:getstatic       #79  <Field Object PrivilegeSensorService.beginBroadcast>
	//  149  350:astore          5
		obj1;
	//  150  352:aload           5
		JVM INSTR monitorenter ;
	//  151  354:monitorenter    
		j = remotecallbacklist.beginBroadcast();
	//  152  355:aload           6
	//  153  357:invokevirtual   #82  <Method int RemoteCallbackList.beginBroadcast()>
	//  154  360:istore_3        
		LOG.d(PrivilegeSensorService.access$100(), (new StringBuilder()).append("HANDLER_DATA_RECEIVED broadcastNum = ").append(j).toString());
	//  155  361:invokestatic    #25  <Method Class PrivilegeSensorService.access$100()>
	//  156  364:new             #27  <Class StringBuilder>
	//  157  367:dup             
	//  158  368:invokespecial   #28  <Method void StringBuilder()>
	//  159  371:ldc1            #84  <String "HANDLER_DATA_RECEIVED broadcastNum = ">
	//  160  373:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  161  376:iload_3         
	//  162  377:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//  163  380:invokevirtual   #45  <Method String StringBuilder.toString()>
	//  164  383:invokestatic    #51  <Method void LOG.d(Class, String)>
		i = 0;
	//  165  386:iconst_0        
	//  166  387:istore_2        
_L24:
		if(i >= j) goto _L19; else goto _L18
	//  167  388:iload_2         
	//  168  389:iload_3         
	//  169  390:icmpge          527
_L18:
		if(remotecallbacklist.getBroadcastItem(i) == null) goto _L21; else goto _L20
	//  170  393:aload           6
	//  171  395:iload_2         
	//  172  396:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//  173  399:ifnull          427
_L20:
		if(obj == null) goto _L23; else goto _L22
	//  174  402:aload           4
	//  175  404:ifnull          455
_L22:
		((_PlatformSensorDataListener)remotecallbacklist.getBroadcastItem(i)).onDataReceived(message.arg1, ((Bundle) (obj)));
	//  176  407:aload           6
	//  177  409:iload_2         
	//  178  410:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//  179  413:checkcast       #90  <Class _PlatformSensorDataListener>
	//  180  416:aload_1         
	//  181  417:getfield        #93  <Field int Message.arg1>
	//  182  420:aload           4
	//  183  422:invokeinterface #117 <Method void _PlatformSensorDataListener.onDataReceived(int, Bundle)>
_L21:
		if(remotecallbacklist.getBroadcastItem(i) != null)
	//* 184  427:aload           6
	//* 185  429:iload_2         
	//* 186  430:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//* 187  433:ifnull          448
			remotecallbacklist.unregister(remotecallbacklist.getBroadcastItem(i));
	//  188  436:aload           6
	//  189  438:aload           6
	//  190  440:iload_2         
	//  191  441:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//  192  444:invokevirtual   #101 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
	//  193  447:pop             
_L26:
		i++;
	//  194  448:iload_2         
	//  195  449:iconst_1        
	//  196  450:iadd            
	//  197  451:istore_2        
		  goto _L24
	//* 198  452:goto            388
_L23:
		LOG.e(PrivilegeSensorService.access$100(), "HANDLER_DATA_RECEIVED  data and extra are null");
	//  199  455:invokestatic    #25  <Method Class PrivilegeSensorService.access$100()>
	//  200  458:ldc1            #103 <String "HANDLER_DATA_RECEIVED  data and extra are null">
	//  201  460:invokestatic    #56  <Method void LOG.e(Class, String)>
		  goto _L21
	//* 202  463:goto            427
		remoteexception1;
	//  203  466:astore          7
		remoteexception1.printStackTrace();
	//  204  468:aload           7
	//  205  470:invokevirtual   #106 <Method void RemoteException.printStackTrace()>
		if(remotecallbacklist.getBroadcastItem(i) == null) goto _L26; else goto _L25
	//  206  473:aload           6
	//  207  475:iload_2         
	//  208  476:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//  209  479:ifnull          448
_L25:
		remotecallbacklist.unregister(remotecallbacklist.getBroadcastItem(i));
	//  210  482:aload           6
	//  211  484:aload           6
	//  212  486:iload_2         
	//  213  487:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//  214  490:invokevirtual   #101 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
	//  215  493:pop             
		  goto _L26
	//* 216  494:goto            448
		message;
	//  217  497:astore_1        
		obj1;
	//  218  498:aload           5
		JVM INSTR monitorexit ;
	//  219  500:monitorexit     
		throw message;
	//  220  501:aload_1         
	//  221  502:athrow          
		message;
	//  222  503:astore_1        
		if(remotecallbacklist.getBroadcastItem(i) != null)
	//* 223  504:aload           6
	//* 224  506:iload_2         
	//* 225  507:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//* 226  510:ifnull          525
			remotecallbacklist.unregister(remotecallbacklist.getBroadcastItem(i));
	//  227  513:aload           6
	//  228  515:aload           6
	//  229  517:iload_2         
	//  230  518:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//  231  521:invokevirtual   #101 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
	//  232  524:pop             
		throw message;
	//  233  525:aload_1         
	//  234  526:athrow          
_L19:
		remotecallbacklist.finishBroadcast();
	//  235  527:aload           6
	//  236  529:invokevirtual   #109 <Method void RemoteCallbackList.finishBroadcast()>
		obj1;
	//  237  532:aload           5
		JVM INSTR monitorexit ;
	//  238  534:monitorexit     
		return;
	//  239  535:return          
_L2:
		obj1 = ((Object) ((RemoteCallbackList)message.obj));
	//  240  536:aload_1         
	//  241  537:getfield        #74  <Field Object Message.obj>
	//  242  540:checkcast       #76  <Class RemoteCallbackList>
	//  243  543:astore          5
		if(obj1 == null) goto _L7; else goto _L27
	//  244  545:aload           5
	//  245  547:ifnull          76
_L27:
		obj = PrivilegeSensorService.beginBroadcast;
	//  246  550:getstatic       #79  <Field Object PrivilegeSensorService.beginBroadcast>
	//  247  553:astore          4
		obj;
	//  248  555:aload           4
		JVM INSTR monitorenter ;
	//  249  557:monitorenter    
		j = ((RemoteCallbackList) (obj1)).beginBroadcast();
	//  250  558:aload           5
	//  251  560:invokevirtual   #82  <Method int RemoteCallbackList.beginBroadcast()>
	//  252  563:istore_3        
		i = 0;
	//  253  564:iconst_0        
	//  254  565:istore_2        
_L29:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//  255  566:iload_2         
	//  256  567:iload_3         
	//  257  568:icmpge          691
		if(((RemoteCallbackList) (obj1)).getBroadcastItem(i) != null)
	//* 258  571:aload           5
	//* 259  573:iload_2         
	//* 260  574:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//* 261  577:ifnull          602
			((_PlatformSensorDataListener)((RemoteCallbackList) (obj1)).getBroadcastItem(i)).onDataStarted(message.arg1, message.arg2);
	//  262  580:aload           5
	//  263  582:iload_2         
	//  264  583:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//  265  586:checkcast       #90  <Class _PlatformSensorDataListener>
	//  266  589:aload_1         
	//  267  590:getfield        #93  <Field int Message.arg1>
	//  268  593:aload_1         
	//  269  594:getfield        #120 <Field int Message.arg2>
	//  270  597:invokeinterface #124 <Method void _PlatformSensorDataListener.onDataStarted(int, int)>
		if(((RemoteCallbackList) (obj1)).getBroadcastItem(i) != null)
	//* 271  602:aload           5
	//* 272  604:iload_2         
	//* 273  605:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//* 274  608:ifnull          623
			((RemoteCallbackList) (obj1)).unregister(((RemoteCallbackList) (obj1)).getBroadcastItem(i));
	//  275  611:aload           5
	//  276  613:aload           5
	//  277  615:iload_2         
	//  278  616:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//  279  619:invokevirtual   #101 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
	//  280  622:pop             
_L31:
		i++;
	//  281  623:iload_2         
	//  282  624:iconst_1        
	//  283  625:iadd            
	//  284  626:istore_2        
		if(true) goto _L29; else goto _L28
	//  285  627:goto            566
		RemoteException remoteexception;
		remoteexception;
	//  286  630:astore          6
		remoteexception.printStackTrace();
	//  287  632:aload           6
	//  288  634:invokevirtual   #106 <Method void RemoteException.printStackTrace()>
		if(((RemoteCallbackList) (obj1)).getBroadcastItem(i) == null) goto _L31; else goto _L30
	//  289  637:aload           5
	//  290  639:iload_2         
	//  291  640:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//  292  643:ifnull          623
_L30:
		((RemoteCallbackList) (obj1)).unregister(((RemoteCallbackList) (obj1)).getBroadcastItem(i));
	//  293  646:aload           5
	//  294  648:aload           5
	//  295  650:iload_2         
	//  296  651:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//  297  654:invokevirtual   #101 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
	//  298  657:pop             
		  goto _L31
	//* 299  658:goto            623
		message;
	//  300  661:astore_1        
		obj;
	//  301  662:aload           4
		JVM INSTR monitorexit ;
	//  302  664:monitorexit     
		throw message;
	//  303  665:aload_1         
	//  304  666:athrow          
		message;
	//  305  667:astore_1        
		if(((RemoteCallbackList) (obj1)).getBroadcastItem(i) != null)
	//* 306  668:aload           5
	//* 307  670:iload_2         
	//* 308  671:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//* 309  674:ifnull          689
			((RemoteCallbackList) (obj1)).unregister(((RemoteCallbackList) (obj1)).getBroadcastItem(i));
	//  310  677:aload           5
	//  311  679:aload           5
	//  312  681:iload_2         
	//  313  682:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//  314  685:invokevirtual   #101 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
	//  315  688:pop             
		throw message;
	//  316  689:aload_1         
	//  317  690:athrow          
_L28:
		((RemoteCallbackList) (obj1)).finishBroadcast();
	//  318  691:aload           5
	//  319  693:invokevirtual   #109 <Method void RemoteCallbackList.finishBroadcast()>
		obj;
	//  320  696:aload           4
		JVM INSTR monitorexit ;
	//  321  698:monitorexit     
		return;
	//  322  699:return          
_L4:
		obj1 = ((Object) ((RemoteCallbackList)message.obj));
	//  323  700:aload_1         
	//  324  701:getfield        #74  <Field Object Message.obj>
	//  325  704:checkcast       #76  <Class RemoteCallbackList>
	//  326  707:astore          5
		if(obj1 == null) goto _L7; else goto _L32
	//  327  709:aload           5
	//  328  711:ifnull          76
_L32:
		obj = PrivilegeSensorService.beginBroadcast;
	//  329  714:getstatic       #79  <Field Object PrivilegeSensorService.beginBroadcast>
	//  330  717:astore          4
		obj;
	//  331  719:aload           4
		JVM INSTR monitorenter ;
	//  332  721:monitorenter    
		j = ((RemoteCallbackList) (obj1)).beginBroadcast();
	//  333  722:aload           5
	//  334  724:invokevirtual   #82  <Method int RemoteCallbackList.beginBroadcast()>
	//  335  727:istore_3        
		i = 0;
	//  336  728:iconst_0        
	//  337  729:istore_2        
_L34:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//  338  730:iload_2         
	//  339  731:iload_3         
	//  340  732:icmpge          855
		if(((RemoteCallbackList) (obj1)).getBroadcastItem(i) != null)
	//* 341  735:aload           5
	//* 342  737:iload_2         
	//* 343  738:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//* 344  741:ifnull          766
			((_PlatformSensorDataListener)((RemoteCallbackList) (obj1)).getBroadcastItem(i)).onDataStopped(message.arg1, message.arg2);
	//  345  744:aload           5
	//  346  746:iload_2         
	//  347  747:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//  348  750:checkcast       #90  <Class _PlatformSensorDataListener>
	//  349  753:aload_1         
	//  350  754:getfield        #93  <Field int Message.arg1>
	//  351  757:aload_1         
	//  352  758:getfield        #120 <Field int Message.arg2>
	//  353  761:invokeinterface #127 <Method void _PlatformSensorDataListener.onDataStopped(int, int)>
		if(((RemoteCallbackList) (obj1)).getBroadcastItem(i) != null)
	//* 354  766:aload           5
	//* 355  768:iload_2         
	//* 356  769:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//* 357  772:ifnull          787
			((RemoteCallbackList) (obj1)).unregister(((RemoteCallbackList) (obj1)).getBroadcastItem(i));
	//  358  775:aload           5
	//  359  777:aload           5
	//  360  779:iload_2         
	//  361  780:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//  362  783:invokevirtual   #101 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
	//  363  786:pop             
_L36:
		i++;
	//  364  787:iload_2         
	//  365  788:iconst_1        
	//  366  789:iadd            
	//  367  790:istore_2        
		if(true) goto _L34; else goto _L33
	//  368  791:goto            730
		remoteexception;
	//  369  794:astore          6
		remoteexception.printStackTrace();
	//  370  796:aload           6
	//  371  798:invokevirtual   #106 <Method void RemoteException.printStackTrace()>
		if(((RemoteCallbackList) (obj1)).getBroadcastItem(i) == null) goto _L36; else goto _L35
	//  372  801:aload           5
	//  373  803:iload_2         
	//  374  804:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//  375  807:ifnull          787
_L35:
		((RemoteCallbackList) (obj1)).unregister(((RemoteCallbackList) (obj1)).getBroadcastItem(i));
	//  376  810:aload           5
	//  377  812:aload           5
	//  378  814:iload_2         
	//  379  815:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//  380  818:invokevirtual   #101 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
	//  381  821:pop             
		  goto _L36
	//* 382  822:goto            787
		message;
	//  383  825:astore_1        
		obj;
	//  384  826:aload           4
		JVM INSTR monitorexit ;
	//  385  828:monitorexit     
		throw message;
	//  386  829:aload_1         
	//  387  830:athrow          
		message;
	//  388  831:astore_1        
		if(((RemoteCallbackList) (obj1)).getBroadcastItem(i) != null)
	//* 389  832:aload           5
	//* 390  834:iload_2         
	//* 391  835:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//* 392  838:ifnull          853
			((RemoteCallbackList) (obj1)).unregister(((RemoteCallbackList) (obj1)).getBroadcastItem(i));
	//  393  841:aload           5
	//  394  843:aload           5
	//  395  845:iload_2         
	//  396  846:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//  397  849:invokevirtual   #101 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
	//  398  852:pop             
		throw message;
	//  399  853:aload_1         
	//  400  854:athrow          
_L33:
		((RemoteCallbackList) (obj1)).finishBroadcast();
	//  401  855:aload           5
	//  402  857:invokevirtual   #109 <Method void RemoteCallbackList.finishBroadcast()>
		obj;
	//  403  860:aload           4
		JVM INSTR monitorexit ;
	//  404  862:monitorexit     
	//  405  863:return          
	}

	PrivilegeSensorService$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Handler()>
	//    2    4:return          
	}
}
