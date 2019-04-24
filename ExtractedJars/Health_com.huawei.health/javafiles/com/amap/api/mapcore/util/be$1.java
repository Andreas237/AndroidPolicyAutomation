// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			be, bd, hm, bt, 
//			bg, bf

class be$1
	implements Runnable
{

	public void run()
	{
		bd bd1;
		bd1 = be.a(b, a);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field be b>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field String a>
	//    4    8:invokestatic    #32  <Method bd be.a(be, String)>
	//    5   11:astore          4
		if(bd1 == null)
			break MISSING_BLOCK_LABEL_173;
	//    6   13:aload           4
	//    7   15:ifnull          173
		boolean flag;
		if(((Object) (bd1.c())).equals(((Object) (bd1.c))))
			break MISSING_BLOCK_LABEL_52;
	//    8   18:aload           4
	//    9   20:invokevirtual   #38  <Method ch bd.c()>
	//   10   23:aload           4
	//   11   25:getfield        #41  <Field ch bd.c>
	//   12   28:invokevirtual   #45  <Method boolean Object.equals(Object)>
	//   13   31:ifne            52
		flag = ((Object) (bd1.c())).equals(((Object) (bd1.e)));
	//   14   34:aload           4
	//   15   36:invokevirtual   #38  <Method ch bd.c()>
	//   16   39:aload           4
	//   17   41:getfield        #48  <Field ch bd.e>
	//   18   44:invokevirtual   #45  <Method boolean Object.equals(Object)>
	//   19   47:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_104;
	//   20   48:iload_1         
	//   21   49:ifeq            104
		if(be.d(b) == null)
			break MISSING_BLOCK_LABEL_103;
	//   22   52:aload_0         
	//   23   53:getfield        #18  <Field be b>
	//   24   56:invokestatic    #52  <Method be$a be.d(be)>
	//   25   59:ifnull          103
		Object obj = ((Object) (b));
	//   26   62:aload_0         
	//   27   63:getfield        #18  <Field be b>
	//   28   66:astore_2        
		obj;
	//   29   67:aload_2         
		JVM INSTR monitorenter ;
	//   30   68:monitorenter    
		be.d(b).b(bd1);
	//   31   69:aload_0         
	//   32   70:getfield        #18  <Field be b>
	//   33   73:invokestatic    #52  <Method be$a be.d(be)>
	//   34   76:aload           4
	//   35   78:invokeinterface #57  <Method void be$a.b(bd)>
		break MISSING_BLOCK_LABEL_95;
	//   36   83:goto            95
		Object obj1;
		obj1;
	//   37   86:astore_3        
		hm.c(((Throwable) (obj1)), "OfflineDownloadManager", "checkUpdatefinally");
	//   38   87:aload_3         
	//   39   88:ldc1            #59  <String "OfflineDownloadManager">
	//   40   90:ldc1            #61  <String "checkUpdatefinally">
	//   41   92:invokestatic    #66  <Method void hm.c(Throwable, String, String)>
		obj;
	//   42   95:aload_2         
		JVM INSTR monitorexit ;
	//   43   96:monitorexit     
		return;
	//   44   97:return          
		obj1;
	//   45   98:astore_3        
	//*  46   99:aload_2         
		throw obj1;
	//   47  100:monitorexit     
	//   48  101:aload_3         
	//   49  102:athrow          
		return;
	//   50  103:return          
		Object obj2;
		obj = ((Object) (bd1.getPinyin()));
	//   51  104:aload           4
	//   52  106:invokevirtual   #70  <Method String bd.getPinyin()>
	//   53  109:astore_2        
		if(((String) (obj)).length() <= 0)
			break MISSING_BLOCK_LABEL_173;
	//   54  110:aload_2         
	//   55  111:invokevirtual   #76  <Method int String.length()>
	//   56  114:ifle            173
		obj2 = ((Object) (be.a(b).d(((String) (obj)))));
	//   57  117:aload_0         
	//   58  118:getfield        #18  <Field be b>
	//   59  121:invokestatic    #79  <Method bt be.a(be)>
	//   60  124:aload_2         
	//   61  125:invokevirtual   #84  <Method String bt.d(String)>
	//   62  128:astore_3        
		obj = obj2;
	//   63  129:aload_3         
	//   64  130:astore_2        
		if(obj2 != null)
			break MISSING_BLOCK_LABEL_141;
	//   65  131:aload_3         
	//   66  132:ifnonnull       141
		obj = ((Object) (bd1.getVersion()));
	//   67  135:aload           4
	//   68  137:invokevirtual   #87  <Method String bd.getVersion()>
	//   69  140:astore_2        
		if(be.d.length() <= 0 || obj == null)
			break MISSING_BLOCK_LABEL_173;
	//   70  141:getstatic       #89  <Field String be.d>
	//   71  144:invokevirtual   #76  <Method int String.length()>
	//   72  147:ifle            173
	//   73  150:aload_2         
	//   74  151:ifnull          173
		if(be.a(b, be.d, ((String) (obj))))
	//*  75  154:aload_0         
	//*  76  155:getfield        #18  <Field be b>
	//*  77  158:getstatic       #89  <Field String be.d>
	//*  78  161:aload_2         
	//*  79  162:invokestatic    #92  <Method boolean be.a(be, String, String)>
	//*  80  165:ifeq            173
			bd1.j();
	//   81  168:aload           4
	//   82  170:invokevirtual   #95  <Method void bd.j()>
		be.b(b);
	//   83  173:aload_0         
	//   84  174:getfield        #18  <Field be b>
	//   85  177:invokestatic    #98  <Method void be.b(be)>
		obj = ((Object) ((bf)(new bg(be.c(b), be.d)).c()));
	//   86  180:new             #100 <Class bg>
	//   87  183:dup             
	//   88  184:aload_0         
	//   89  185:getfield        #18  <Field be b>
	//   90  188:invokestatic    #103 <Method android.content.Context be.c(be)>
	//   91  191:getstatic       #89  <Field String be.d>
	//   92  194:invokespecial   #106 <Method void bg(android.content.Context, String)>
	//   93  197:invokevirtual   #109 <Method Object bg.c()>
	//   94  200:checkcast       #111 <Class bf>
	//   95  203:astore_2        
		obj2 = ((Object) (be.d(b)));
	//   96  204:aload_0         
	//   97  205:getfield        #18  <Field be b>
	//   98  208:invokestatic    #52  <Method be$a be.d(be)>
	//   99  211:astore_3        
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_286;
	//  100  212:aload_3         
	//  101  213:ifnull          286
		if(obj != null)
			break MISSING_BLOCK_LABEL_272;
	//  102  216:aload_2         
	//  103  217:ifnonnull       272
		if(be.d(b) == null)
			break MISSING_BLOCK_LABEL_271;
	//  104  220:aload_0         
	//  105  221:getfield        #18  <Field be b>
	//  106  224:invokestatic    #52  <Method be$a be.d(be)>
	//  107  227:ifnull          271
		obj = ((Object) (b));
	//  108  230:aload_0         
	//  109  231:getfield        #18  <Field be b>
	//  110  234:astore_2        
		obj;
	//  111  235:aload_2         
		JVM INSTR monitorenter ;
	//  112  236:monitorenter    
		be.d(b).b(bd1);
	//  113  237:aload_0         
	//  114  238:getfield        #18  <Field be b>
	//  115  241:invokestatic    #52  <Method be$a be.d(be)>
	//  116  244:aload           4
	//  117  246:invokeinterface #57  <Method void be$a.b(bd)>
		break MISSING_BLOCK_LABEL_263;
	//  118  251:goto            263
		obj2;
	//  119  254:astore_3        
		hm.c(((Throwable) (obj2)), "OfflineDownloadManager", "checkUpdatefinally");
	//  120  255:aload_3         
	//  121  256:ldc1            #59  <String "OfflineDownloadManager">
	//  122  258:ldc1            #61  <String "checkUpdatefinally">
	//  123  260:invokestatic    #66  <Method void hm.c(Throwable, String, String)>
		obj;
	//  124  263:aload_2         
		JVM INSTR monitorexit ;
	//  125  264:monitorexit     
		return;
	//  126  265:return          
		obj2;
	//  127  266:astore_3        
	//* 128  267:aload_2         
		throw obj2;
	//  129  268:monitorexit     
	//  130  269:aload_3         
	//  131  270:athrow          
		return;
	//  132  271:return          
		if(((bf) (obj)).a())
	//* 133  272:aload_2         
	//* 134  273:invokevirtual   #114 <Method boolean bf.a()>
	//* 135  276:ifeq            286
			b.b();
	//  136  279:aload_0         
	//  137  280:getfield        #18  <Field be b>
	//  138  283:invokevirtual   #116 <Method void be.b()>
		if(be.d(b) == null)
			break MISSING_BLOCK_LABEL_453;
	//  139  286:aload_0         
	//  140  287:getfield        #18  <Field be b>
	//  141  290:invokestatic    #52  <Method be$a be.d(be)>
	//  142  293:ifnull          453
		obj = ((Object) (b));
	//  143  296:aload_0         
	//  144  297:getfield        #18  <Field be b>
	//  145  300:astore_2        
		obj;
	//  146  301:aload_2         
		JVM INSTR monitorenter ;
	//  147  302:monitorenter    
		be.d(b).b(bd1);
	//  148  303:aload_0         
	//  149  304:getfield        #18  <Field be b>
	//  150  307:invokestatic    #52  <Method be$a be.d(be)>
	//  151  310:aload           4
	//  152  312:invokeinterface #57  <Method void be$a.b(bd)>
		break MISSING_BLOCK_LABEL_329;
	//  153  317:goto            329
		obj2;
	//  154  320:astore_3        
		hm.c(((Throwable) (obj2)), "OfflineDownloadManager", "checkUpdatefinally");
	//  155  321:aload_3         
	//  156  322:ldc1            #59  <String "OfflineDownloadManager">
	//  157  324:ldc1            #61  <String "checkUpdatefinally">
	//  158  326:invokestatic    #66  <Method void hm.c(Throwable, String, String)>
		obj;
	//  159  329:aload_2         
		JVM INSTR monitorexit ;
	//  160  330:monitorexit     
		  goto _L1
	//* 161  331:goto            339
		obj2;
	//  162  334:astore_3        
	//* 163  335:aload_2         
		throw obj2;
	//  164  336:monitorexit     
	//  165  337:aload_3         
	//  166  338:athrow          
_L1:
		return;
	//  167  339:return          
		Exception exception;
		exception;
	//  168  340:astore_2        
		if(be.d(b) == null)
			break MISSING_BLOCK_LABEL_453;
	//  169  341:aload_0         
	//  170  342:getfield        #18  <Field be b>
	//  171  345:invokestatic    #52  <Method be$a be.d(be)>
	//  172  348:ifnull          453
		exception = ((Exception) (b));
	//  173  351:aload_0         
	//  174  352:getfield        #18  <Field be b>
	//  175  355:astore_2        
		exception;
	//  176  356:aload_2         
		JVM INSTR monitorenter ;
	//  177  357:monitorenter    
		be.d(b).b(bd1);
	//  178  358:aload_0         
	//  179  359:getfield        #18  <Field be b>
	//  180  362:invokestatic    #52  <Method be$a be.d(be)>
	//  181  365:aload           4
	//  182  367:invokeinterface #57  <Method void be$a.b(bd)>
		break MISSING_BLOCK_LABEL_384;
	//  183  372:goto            384
		obj2;
	//  184  375:astore_3        
		hm.c(((Throwable) (obj2)), "OfflineDownloadManager", "checkUpdatefinally");
	//  185  376:aload_3         
	//  186  377:ldc1            #59  <String "OfflineDownloadManager">
	//  187  379:ldc1            #61  <String "checkUpdatefinally">
	//  188  381:invokestatic    #66  <Method void hm.c(Throwable, String, String)>
		exception;
	//  189  384:aload_2         
		JVM INSTR monitorexit ;
	//  190  385:monitorexit     
		  goto _L2
	//* 191  386:goto            394
		obj2;
	//  192  389:astore_3        
	//* 193  390:aload_2         
		throw obj2;
	//  194  391:monitorexit     
	//  195  392:aload_3         
	//  196  393:athrow          
_L2:
		return;
	//  197  394:return          
		obj2;
	//  198  395:astore_3        
		if(be.d(b) == null)
			break MISSING_BLOCK_LABEL_451;
	//  199  396:aload_0         
	//  200  397:getfield        #18  <Field be b>
	//  201  400:invokestatic    #52  <Method be$a be.d(be)>
	//  202  403:ifnull          451
		exception = ((Exception) (b));
	//  203  406:aload_0         
	//  204  407:getfield        #18  <Field be b>
	//  205  410:astore_2        
		exception;
	//  206  411:aload_2         
		JVM INSTR monitorenter ;
	//  207  412:monitorenter    
		be.d(b).b(bd1);
	//  208  413:aload_0         
	//  209  414:getfield        #18  <Field be b>
	//  210  417:invokestatic    #52  <Method be$a be.d(be)>
	//  211  420:aload           4
	//  212  422:invokeinterface #57  <Method void be$a.b(bd)>
		break MISSING_BLOCK_LABEL_441;
	//  213  427:goto            441
		Throwable throwable;
		throwable;
	//  214  430:astore          4
		hm.c(throwable, "OfflineDownloadManager", "checkUpdatefinally");
	//  215  432:aload           4
	//  216  434:ldc1            #59  <String "OfflineDownloadManager">
	//  217  436:ldc1            #61  <String "checkUpdatefinally">
	//  218  438:invokestatic    #66  <Method void hm.c(Throwable, String, String)>
		exception;
	//  219  441:aload_2         
		JVM INSTR monitorexit ;
	//  220  442:monitorexit     
		break MISSING_BLOCK_LABEL_451;
	//  221  443:goto            451
		obj2;
	//  222  446:astore_3        
	//* 223  447:aload_2         
		throw obj2;
	//  224  448:monitorexit     
	//  225  449:aload_3         
	//  226  450:athrow          
		throw obj2;
	//  227  451:aload_3         
	//  228  452:athrow          
	//  229  453:return          
	}

	final String a;
	final be b;

	be$1(be be1, String s)
	{
		b = be1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field be b>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field String a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
