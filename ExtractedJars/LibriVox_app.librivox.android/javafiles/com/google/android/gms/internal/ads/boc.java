// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.*;
import android.os.*;
import android.util.Log;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bnf, zzqk

final class boc extends HandlerThread
	implements android.graphics.SurfaceTexture.OnFrameAvailableListener, android.os.Handler.Callback
{

	public boc()
	{
		super("dummySurface");
	//    0    0:aload_0         
	//    1    1:ldc1            #24  <String "dummySurface">
	//    2    3:invokespecial   #27  <Method void HandlerThread(String)>
	//    3    6:aload_0         
	//    4    7:iconst_1        
	//    5    8:newarray        int[]
	//    6   10:putfield        #29  <Field int[] a>
	//    7   13:return          
	}

	public final zzqk a(boolean flag)
	{
		start();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #36  <Method void start()>
		b = new Handler(getLooper(), ((android.os.Handler.Callback) (this)));
	//    2    4:aload_0         
	//    3    5:new             #38  <Class Handler>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokevirtual   #42  <Method android.os.Looper getLooper()>
	//    7   13:aload_0         
	//    8   14:invokespecial   #45  <Method void Handler(android.os.Looper, android.os.Handler$Callback)>
	//    9   17:putfield        #47  <Field Handler b>
		this;
	//   10   20:aload_0         
		JVM INSTR monitorenter ;
	//   11   21:monitorenter    
		Object obj = ((Object) (b));
	//   12   22:aload_0         
	//   13   23:getfield        #47  <Field Handler b>
	//   14   26:astore          4
		boolean flag1 = false;
	//   15   28:iconst_0        
	//   16   29:istore_3        
		int i;
		Object obj1;
		if(flag)
	//*  17   30:iload_1         
	//*  18   31:ifeq            146
			i = 1;
	//   19   34:iconst_1        
	//   20   35:istore_2        
		else
	//*  21   36:goto            39
	//*  22   39:aload           4
	//*  23   41:iconst_1        
	//*  24   42:iload_2         
	//*  25   43:iconst_0        
	//*  26   44:invokevirtual   #51  <Method Message Handler.obtainMessage(int, int, int)>
	//*  27   47:invokevirtual   #56  <Method void Message.sendToTarget()>
	//*  28   50:iload_3         
	//*  29   51:istore_2        
	//*  30   52:aload_0         
	//*  31   53:getfield        #58  <Field zzqk f>
	//*  32   56:ifnonnull       89
	//*  33   59:aload_0         
	//*  34   60:getfield        #60  <Field RuntimeException e>
	//*  35   63:ifnonnull       89
	//*  36   66:aload_0         
	//*  37   67:getfield        #62  <Field Error d>
	//*  38   70:astore          4
	//*  39   72:aload           4
	//*  40   74:ifnonnull       89
	//*  41   77:aload_0         
	//*  42   78:invokevirtual   #67  <Method void Object.wait()>
	//*  43   81:goto            52
	//*  44   84:iconst_1        
	//*  45   85:istore_2        
	//*  46   86:goto            52
	//*  47   89:aload_0         
	//*  48   90:monitorexit     
	//*  49   91:iload_2         
	//*  50   92:ifeq            101
	//*  51   95:invokestatic    #73  <Method Thread Thread.currentThread()>
	//*  52   98:invokevirtual   #76  <Method void Thread.interrupt()>
	//*  53  101:aload_0         
	//*  54  102:getfield        #60  <Field RuntimeException e>
	//*  55  105:astore          4
	//*  56  107:aload           4
	//*  57  109:ifnonnull       131
	//*  58  112:aload_0         
	//*  59  113:getfield        #62  <Field Error d>
	//*  60  116:astore          4
	//*  61  118:aload           4
	//*  62  120:ifnonnull       128
	//*  63  123:aload_0         
	//*  64  124:getfield        #58  <Field zzqk f>
	//*  65  127:areturn         
	//*  66  128:aload           4
	//*  67  130:athrow          
	//*  68  131:aload           4
	//*  69  133:athrow          
	//*  70  134:astore          4
	//*  71  136:aload_0         
	//*  72  137:monitorexit     
	//*  73  138:aload           4
	//*  74  140:athrow          
	//*  75  141:astore          4
	//*  76  143:goto            84
			i = 0;
	//   77  146:iconst_0        
	//   78  147:istore_2        
		((Handler) (obj)).obtainMessage(1, i, 0).sendToTarget();
		i = ((int) (flag1));
_L2:
		if(f != null || e != null)
			break; /* Loop/switch isn't completed */
		obj = ((Object) (d));
		if(obj != null)
			break; /* Loop/switch isn't completed */
		try
		{
			((Object)this).wait();
		}
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			i = 1;
		}
		if(true) goto _L2; else goto _L1
_L1:
		this;
		JVM INSTR monitorexit ;
		if(i != 0)
			Thread.currentThread().interrupt();
		obj = ((Object) (e));
		if(obj == null)
		{
			obj = ((Object) (d));
			if(obj == null)
				return f;
			else
				throw obj;
		} else
		{
			throw obj;
		}
		obj1;
		this;
		JVM INSTR monitorexit ;
		throw obj1;
	//*  79  148:goto            39
	}

	public final void a()
	{
		b.sendEmptyMessage(3);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Handler b>
	//    2    4:iconst_3        
	//    3    5:invokevirtual   #80  <Method boolean Handler.sendEmptyMessage(int)>
	//    4    8:pop             
	//    5    9:return          
	}

	public final boolean handleMessage(Message message)
	{
		message.what;
	//    0    0:aload_1         
	//    1    1:getfield        #92  <Field int Message.what>
		JVM INSTR tableswitch 1 3: default 32
	//	               1 126
	//	               2 117
	//	               3 34;
	//    2    4:tableswitch     1 3: default 32
	//	               1 126
	//	               2 117
	//	               3 34
		   goto _L1 _L2 _L3 _L4
_L1:
		return true;
	//    3   32:iconst_1        
	//    4   33:ireturn         
_L4:
		c.release();
	//    5   34:aload_0         
	//    6   35:getfield        #94  <Field SurfaceTexture c>
	//    7   38:invokevirtual   #99  <Method void SurfaceTexture.release()>
		f = null;
	//    8   41:aload_0         
	//    9   42:aconst_null     
	//   10   43:putfield        #58  <Field zzqk f>
		c = null;
	//   11   46:aload_0         
	//   12   47:aconst_null     
	//   13   48:putfield        #94  <Field SurfaceTexture c>
		GLES20.glDeleteTextures(1, a, 0);
	//   14   51:iconst_1        
	//   15   52:aload_0         
	//   16   53:getfield        #29  <Field int[] a>
	//   17   56:iconst_0        
	//   18   57:invokestatic    #105 <Method void GLES20.glDeleteTextures(int, int[], int)>
		quit();
	//   19   60:aload_0         
	//   20   61:invokevirtual   #109 <Method boolean quit()>
	//   21   64:pop             
		return true;
	//   22   65:iconst_1        
	//   23   66:ireturn         
		message;
	//   24   67:astore_1        
		try
		{
			f = null;
	//   25   68:aload_0         
	//   26   69:aconst_null     
	//   27   70:putfield        #58  <Field zzqk f>
			c = null;
	//   28   73:aload_0         
	//   29   74:aconst_null     
	//   30   75:putfield        #94  <Field SurfaceTexture c>
			GLES20.glDeleteTextures(1, a, 0);
	//   31   78:iconst_1        
	//   32   79:aload_0         
	//   33   80:getfield        #29  <Field int[] a>
	//   34   83:iconst_0        
	//   35   84:invokestatic    #105 <Method void GLES20.glDeleteTextures(int, int[], int)>
			throw message;
	//   36   87:aload_1         
	//   37   88:athrow          
		}
	//*  38   89:astore_1        
	//*  39   90:goto            110
		// Misplaced declaration of an exception variable
		catch(Message message) { }
	//   40   93:astore_1        
		  goto _L5
		message;
		  goto _L6
_L5:
		Log.e("DummySurface", "Failed to release dummy surface", ((Throwable) (message)));
	//   41   94:ldc1            #111 <String "DummySurface">
	//   42   96:ldc1            #113 <String "Failed to release dummy surface">
	//   43   98:aload_1         
	//   44   99:invokestatic    #118 <Method int Log.e(String, String, Throwable)>
	//   45  102:pop             
		quit();
	//   46  103:aload_0         
	//   47  104:invokevirtual   #109 <Method boolean quit()>
	//   48  107:pop             
		return true;
	//   49  108:iconst_1        
	//   50  109:ireturn         
_L6:
		quit();
	//   51  110:aload_0         
	//   52  111:invokevirtual   #109 <Method boolean quit()>
	//   53  114:pop             
		throw message;
	//   54  115:aload_1         
	//   55  116:athrow          
_L3:
		c.updateTexImage();
	//   56  117:aload_0         
	//   57  118:getfield        #94  <Field SurfaceTexture c>
	//   58  121:invokevirtual   #121 <Method void SurfaceTexture.updateTexImage()>
		return true;
	//   59  124:iconst_1        
	//   60  125:ireturn         
_L2:
		boolean flag;
		boolean flag1;
		android.opengl.EGLDisplay egldisplay;
		int ai[];
		EGLConfig eglconfig;
		android.opengl.EGLContext eglcontext;
		if(message.arg1 != 0)
	//*  61  126:aload_1         
	//*  62  127:getfield        #124 <Field int Message.arg1>
	//*  63  130:ifeq            690
			flag = true;
	//   64  133:iconst_1        
	//   65  134:istore_2        
		else
	//*  66  135:goto            138
	//*  67  138:iconst_0        
	//*  68  139:invokestatic    #130 <Method android.opengl.EGLDisplay EGL14.eglGetDisplay(int)>
	//*  69  142:astore          4
	//*  70  144:aload           4
	//*  71  146:ifnull          695
	//*  72  149:iconst_1        
	//*  73  150:istore_3        
	//*  74  151:goto            154
	//*  75  154:iload_3         
	//*  76  155:ldc1            #132 <String "eglGetDisplay failed">
	//*  77  157:invokestatic    #137 <Method void bnf.b(boolean, Object)>
	//*  78  160:iconst_2        
	//*  79  161:newarray        int[]
	//*  80  163:astore_1        
	//*  81  164:aload           4
	//*  82  166:aload_1         
	//*  83  167:iconst_0        
	//*  84  168:aload_1         
	//*  85  169:iconst_1        
	//*  86  170:invokestatic    #141 <Method boolean EGL14.eglInitialize(android.opengl.EGLDisplay, int[], int, int[], int)>
	//*  87  173:ldc1            #143 <String "eglInitialize failed">
	//*  88  175:invokestatic    #137 <Method void bnf.b(boolean, Object)>
	//*  89  178:iconst_1        
	//*  90  179:anewarray       EGLConfig[]
	//*  91  182:astore_1        
	//*  92  183:iconst_1        
	//*  93  184:newarray        int[]
	//*  94  186:astore          5
	//*  95  188:aload           4
	//*  96  190:bipush          17
	//*  97  192:newarray        int[]
	//*  98  194:dup             
	//*  99  195:iconst_0        
	//* 100  196:sipush          12352
	//* 101  199:iastore         
	//* 102  200:dup             
	//* 103  201:iconst_1        
	//* 104  202:iconst_4        
	//* 105  203:iastore         
	//* 106  204:dup             
	//* 107  205:iconst_2        
	//* 108  206:sipush          12324
	//* 109  209:iastore         
	//* 110  210:dup             
	//* 111  211:iconst_3        
	//* 112  212:bipush          8
	//* 113  214:iastore         
	//* 114  215:dup             
	//* 115  216:iconst_4        
	//* 116  217:sipush          12323
	//* 117  220:iastore         
	//* 118  221:dup             
	//* 119  222:iconst_5        
	//* 120  223:bipush          8
	//* 121  225:iastore         
	//* 122  226:dup             
	//* 123  227:bipush          6
	//* 124  229:sipush          12322
	//* 125  232:iastore         
	//* 126  233:dup             
	//* 127  234:bipush          7
	//* 128  236:bipush          8
	//* 129  238:iastore         
	//* 130  239:dup             
	//* 131  240:bipush          8
	//* 132  242:sipush          12321
	//* 133  245:iastore         
	//* 134  246:dup             
	//* 135  247:bipush          9
	//* 136  249:bipush          8
	//* 137  251:iastore         
	//* 138  252:dup             
	//* 139  253:bipush          10
	//* 140  255:sipush          12325
	//* 141  258:iastore         
	//* 142  259:dup             
	//* 143  260:bipush          11
	//* 144  262:iconst_0        
	//* 145  263:iastore         
	//* 146  264:dup             
	//* 147  265:bipush          12
	//* 148  267:sipush          12327
	//* 149  270:iastore         
	//* 150  271:dup             
	//* 151  272:bipush          13
	//* 152  274:sipush          12344
	//* 153  277:iastore         
	//* 154  278:dup             
	//* 155  279:bipush          14
	//* 156  281:sipush          12339
	//* 157  284:iastore         
	//* 158  285:dup             
	//* 159  286:bipush          15
	//* 160  288:iconst_4        
	//* 161  289:iastore         
	//* 162  290:dup             
	//* 163  291:bipush          16
	//* 164  293:sipush          12344
	//* 165  296:iastore         
	//* 166  297:iconst_0        
	//* 167  298:aload_1         
	//* 168  299:iconst_0        
	//* 169  300:iconst_1        
	//* 170  301:aload           5
	//* 171  303:iconst_0        
	//* 172  304:invokestatic    #149 <Method boolean EGL14.eglChooseConfig(android.opengl.EGLDisplay, int[], int, EGLConfig[], int, int, int[], int)>
	//* 173  307:ifeq            700
	//* 174  310:aload           5
	//* 175  312:iconst_0        
	//* 176  313:iaload          
	//* 177  314:ifle            700
	//* 178  317:aload_1         
	//* 179  318:iconst_0        
	//* 180  319:aaload          
	//* 181  320:ifnull          700
	//* 182  323:iconst_1        
	//* 183  324:istore_3        
	//* 184  325:goto            328
	//* 185  328:iload_3         
	//* 186  329:ldc1            #151 <String "eglChooseConfig failed">
	//* 187  331:invokestatic    #137 <Method void bnf.b(boolean, Object)>
	//* 188  334:aload_1         
	//* 189  335:iconst_0        
	//* 190  336:aaload          
	//* 191  337:astore          5
	//* 192  339:iload_2         
	//* 193  340:ifeq            376
	//* 194  343:iconst_5        
	//* 195  344:newarray        int[]
	//* 196  346:astore_1        
	//* 197  347:aload_1         
	//* 198  348:iconst_0        
	//* 199  349:sipush          12440
	//* 200  352:iastore         
	//* 201  353:aload_1         
	//* 202  354:iconst_1        
	//* 203  355:iconst_2        
	//* 204  356:iastore         
	//* 205  357:aload_1         
	//* 206  358:iconst_2        
	//* 207  359:sipush          12992
	//* 208  362:iastore         
	//* 209  363:aload_1         
	//* 210  364:iconst_3        
	//* 211  365:iconst_1        
	//* 212  366:iastore         
	//* 213  367:aload_1         
	//* 214  368:iconst_4        
	//* 215  369:sipush          12344
	//* 216  372:iastore         
	//* 217  373:goto            396
	//* 218  376:iconst_3        
	//* 219  377:newarray        int[]
	//* 220  379:astore_1        
	//* 221  380:aload_1         
	//* 222  381:iconst_0        
	//* 223  382:sipush          12440
	//* 224  385:iastore         
	//* 225  386:aload_1         
	//* 226  387:iconst_1        
	//* 227  388:iconst_2        
	//* 228  389:iastore         
	//* 229  390:aload_1         
	//* 230  391:iconst_2        
	//* 231  392:sipush          12344
	//* 232  395:iastore         
	//* 233  396:aload           4
	//* 234  398:aload           5
	//* 235  400:getstatic       #155 <Field android.opengl.EGLContext EGL14.EGL_NO_CONTEXT>
	//* 236  403:aload_1         
	//* 237  404:iconst_0        
	//* 238  405:invokestatic    #159 <Method android.opengl.EGLContext EGL14.eglCreateContext(android.opengl.EGLDisplay, EGLConfig, android.opengl.EGLContext, int[], int)>
	//* 239  408:astore          6
	//* 240  410:aload           6
	//* 241  412:ifnull          705
	//* 242  415:iconst_1        
	//* 243  416:istore_3        
	//* 244  417:goto            420
	//* 245  420:iload_3         
	//* 246  421:ldc1            #161 <String "eglCreateContext failed">
	//* 247  423:invokestatic    #137 <Method void bnf.b(boolean, Object)>
	//* 248  426:iload_2         
	//* 249  427:ifeq            475
	//* 250  430:bipush          7
	//* 251  432:newarray        int[]
	//* 252  434:astore_1        
	//* 253  435:aload_1         
	//* 254  436:iconst_0        
	//* 255  437:sipush          12375
	//* 256  440:iastore         
	//* 257  441:aload_1         
	//* 258  442:iconst_1        
	//* 259  443:iconst_1        
	//* 260  444:iastore         
	//* 261  445:aload_1         
	//* 262  446:iconst_2        
	//* 263  447:sipush          12374
	//* 264  450:iastore         
	//* 265  451:aload_1         
	//* 266  452:iconst_3        
	//* 267  453:iconst_1        
	//* 268  454:iastore         
	//* 269  455:aload_1         
	//* 270  456:iconst_4        
	//* 271  457:sipush          12992
	//* 272  460:iastore         
	//* 273  461:aload_1         
	//* 274  462:iconst_5        
	//* 275  463:iconst_1        
	//* 276  464:iastore         
	//* 277  465:aload_1         
	//* 278  466:bipush          6
	//* 279  468:sipush          12344
	//* 280  471:iastore         
	//* 281  472:goto            505
	//* 282  475:iconst_5        
	//* 283  476:newarray        int[]
	//* 284  478:astore_1        
	//* 285  479:aload_1         
	//* 286  480:iconst_0        
	//* 287  481:sipush          12375
	//* 288  484:iastore         
	//* 289  485:aload_1         
	//* 290  486:iconst_1        
	//* 291  487:iconst_1        
	//* 292  488:iastore         
	//* 293  489:aload_1         
	//* 294  490:iconst_2        
	//* 295  491:sipush          12374
	//* 296  494:iastore         
	//* 297  495:aload_1         
	//* 298  496:iconst_3        
	//* 299  497:iconst_1        
	//* 300  498:iastore         
	//* 301  499:aload_1         
	//* 302  500:iconst_4        
	//* 303  501:sipush          12344
	//* 304  504:iastore         
	//* 305  505:aload           4
	//* 306  507:aload           5
	//* 307  509:aload_1         
	//* 308  510:iconst_0        
	//* 309  511:invokestatic    #165 <Method android.opengl.EGLSurface EGL14.eglCreatePbufferSurface(android.opengl.EGLDisplay, EGLConfig, int[], int)>
	//* 310  514:astore_1        
	//* 311  515:aload_1         
	//* 312  516:ifnull          710
	//* 313  519:iconst_1        
	//* 314  520:istore_3        
	//* 315  521:goto            524
	//* 316  524:iload_3         
	//* 317  525:ldc1            #167 <String "eglCreatePbufferSurface failed">
	//* 318  527:invokestatic    #137 <Method void bnf.b(boolean, Object)>
	//* 319  530:aload           4
	//* 320  532:aload_1         
	//* 321  533:aload_1         
	//* 322  534:aload           6
	//* 323  536:invokestatic    #171 <Method boolean EGL14.eglMakeCurrent(android.opengl.EGLDisplay, android.opengl.EGLSurface, android.opengl.EGLSurface, android.opengl.EGLContext)>
	//* 324  539:ldc1            #173 <String "eglMakeCurrent failed">
	//* 325  541:invokestatic    #137 <Method void bnf.b(boolean, Object)>
	//* 326  544:iconst_1        
	//* 327  545:aload_0         
	//* 328  546:getfield        #29  <Field int[] a>
	//* 329  549:iconst_0        
	//* 330  550:invokestatic    #176 <Method void GLES20.glGenTextures(int, int[], int)>
	//* 331  553:aload_0         
	//* 332  554:new             #96  <Class SurfaceTexture>
	//* 333  557:dup             
	//* 334  558:aload_0         
	//* 335  559:getfield        #29  <Field int[] a>
	//* 336  562:iconst_0        
	//* 337  563:iaload          
	//* 338  564:invokespecial   #179 <Method void SurfaceTexture(int)>
	//* 339  567:putfield        #94  <Field SurfaceTexture c>
	//* 340  570:aload_0         
	//* 341  571:getfield        #94  <Field SurfaceTexture c>
	//* 342  574:aload_0         
	//* 343  575:invokevirtual   #183 <Method void SurfaceTexture.setOnFrameAvailableListener(android.graphics.SurfaceTexture$OnFrameAvailableListener)>
	//* 344  578:aload_0         
	//* 345  579:new             #185 <Class zzqk>
	//* 346  582:dup             
	//* 347  583:aload_0         
	//* 348  584:aload_0         
	//* 349  585:getfield        #94  <Field SurfaceTexture c>
	//* 350  588:iload_2         
	//* 351  589:aconst_null     
	//* 352  590:invokespecial   #188 <Method void zzqk(boc, SurfaceTexture, boolean, bob)>
	//* 353  593:putfield        #58  <Field zzqk f>
	//* 354  596:aload_0         
	//* 355  597:monitorenter    
	//* 356  598:aload_0         
	//* 357  599:invokevirtual   #191 <Method void Object.notify()>
	//* 358  602:aload_0         
	//* 359  603:monitorexit     
	//* 360  604:iconst_1        
	//* 361  605:ireturn         
	//* 362  606:astore_1        
	//* 363  607:aload_0         
	//* 364  608:monitorexit     
	//* 365  609:aload_1         
	//* 366  610:athrow          
	//* 367  611:astore_1        
	//* 368  612:goto            675
	//* 369  615:astore_1        
	//* 370  616:ldc1            #111 <String "DummySurface">
	//* 371  618:ldc1            #193 <String "Failed to initialize dummy surface">
	//* 372  620:aload_1         
	//* 373  621:invokestatic    #118 <Method int Log.e(String, String, Throwable)>
	//* 374  624:pop             
	//* 375  625:aload_0         
	//* 376  626:aload_1         
	//* 377  627:putfield        #62  <Field Error d>
	//* 378  630:aload_0         
	//* 379  631:monitorenter    
	//* 380  632:aload_0         
	//* 381  633:invokevirtual   #191 <Method void Object.notify()>
	//* 382  636:aload_0         
	//* 383  637:monitorexit     
	//* 384  638:iconst_1        
	//* 385  639:ireturn         
	//* 386  640:astore_1        
	//* 387  641:aload_0         
	//* 388  642:monitorexit     
	//* 389  643:aload_1         
	//* 390  644:athrow          
	//* 391  645:astore_1        
	//* 392  646:ldc1            #111 <String "DummySurface">
	//* 393  648:ldc1            #193 <String "Failed to initialize dummy surface">
	//* 394  650:aload_1         
	//* 395  651:invokestatic    #118 <Method int Log.e(String, String, Throwable)>
	//* 396  654:pop             
	//* 397  655:aload_0         
	//* 398  656:aload_1         
	//* 399  657:putfield        #60  <Field RuntimeException e>
	//* 400  660:aload_0         
	//* 401  661:monitorenter    
	//* 402  662:aload_0         
	//* 403  663:invokevirtual   #191 <Method void Object.notify()>
	//* 404  666:aload_0         
	//* 405  667:monitorexit     
	//* 406  668:iconst_1        
	//* 407  669:ireturn         
	//* 408  670:astore_1        
	//* 409  671:aload_0         
	//* 410  672:monitorexit     
	//* 411  673:aload_1         
	//* 412  674:athrow          
	//* 413  675:aload_0         
	//* 414  676:monitorenter    
	//* 415  677:aload_0         
	//* 416  678:invokevirtual   #191 <Method void Object.notify()>
	//* 417  681:aload_0         
	//* 418  682:monitorexit     
	//* 419  683:aload_1         
	//* 420  684:athrow          
	//* 421  685:astore_1        
	//* 422  686:aload_0         
	//* 423  687:monitorexit     
	//* 424  688:aload_1         
	//* 425  689:athrow          
			flag = false;
	//  426  690:iconst_0        
	//  427  691:istore_2        
		egldisplay = EGL14.eglGetDisplay(0);
		if(egldisplay != null)
			flag1 = true;
		else
	//* 428  692:goto            138
			flag1 = false;
	//  429  695:iconst_0        
	//  430  696:istore_3        
		bnf.b(flag1, "eglGetDisplay failed");
		message = ((Message) (new int[2]));
		bnf.b(EGL14.eglInitialize(egldisplay, ((int []) (message)), 0, ((int []) (message)), 1), "eglInitialize failed");
		message = ((Message) (new EGLConfig[1]));
		ai = new int[1];
		if(EGL14.eglChooseConfig(egldisplay, new int[] {
	12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 
	12325, 0, 12327, 12344, 12339, 4, 12344
}, 0, ((EGLConfig []) (message)), 0, 1, ai, 0) && (ai[0] > 0 && message[0] != null))
			flag1 = true;
		else
	//* 431  697:goto            154
			flag1 = false;
	//  432  700:iconst_0        
	//  433  701:istore_3        
		bnf.b(flag1, "eglChooseConfig failed");
		eglconfig = ((EGLConfig) (message[0]));
		if(!flag) goto _L8; else goto _L7
_L7:
		message = ((Message) (new int[5]));
		message[0] = 12440;
		message[1] = 2;
		message[2] = 12992;
		message[3] = 1;
		message[4] = 12344;
		break MISSING_BLOCK_LABEL_396;
_L8:
		message = ((Message) (new int[3]));
		message[0] = 12440;
		message[1] = 2;
		message[2] = 12344;
		eglcontext = EGL14.eglCreateContext(egldisplay, eglconfig, EGL14.EGL_NO_CONTEXT, ((int []) (message)), 0);
		if(eglcontext != null)
			flag1 = true;
		else
	//* 434  702:goto            328
			flag1 = false;
	//  435  705:iconst_0        
	//  436  706:istore_3        
		bnf.b(flag1, "eglCreateContext failed");
		if(!flag) goto _L10; else goto _L9
_L9:
		message = ((Message) (new int[7]));
		message[0] = 12375;
		message[1] = 1;
		message[2] = 12374;
		message[3] = 1;
		message[4] = 12992;
		message[5] = 1;
		message[6] = 12344;
		break MISSING_BLOCK_LABEL_505;
_L10:
		message = ((Message) (new int[5]));
		message[0] = 12375;
		message[1] = 1;
		message[2] = 12374;
		message[3] = 1;
		message[4] = 12344;
		message = ((Message) (EGL14.eglCreatePbufferSurface(egldisplay, eglconfig, ((int []) (message)), 0)));
		if(message != null)
			flag1 = true;
		else
	//* 437  707:goto            420
			flag1 = false;
	//  438  710:iconst_0        
	//  439  711:istore_3        
		bnf.b(flag1, "eglCreatePbufferSurface failed");
		bnf.b(EGL14.eglMakeCurrent(egldisplay, ((android.opengl.EGLSurface) (message)), ((android.opengl.EGLSurface) (message)), eglcontext), "eglMakeCurrent failed");
		GLES20.glGenTextures(1, a, 0);
		c = new SurfaceTexture(a[0]);
		c.setOnFrameAvailableListener(((android.graphics.SurfaceTexture.OnFrameAvailableListener) (this)));
		f = new zzqk(this, c, flag, ((bob) (null)));
		this;
		JVM INSTR monitorenter ;
		((Object)this).notify();
		this;
		JVM INSTR monitorexit ;
		return true;
		message;
		this;
		JVM INSTR monitorexit ;
		throw message;
		message;
		  goto _L11
		message;
		Log.e("DummySurface", "Failed to initialize dummy surface", ((Throwable) (message)));
		d = ((Error) (message));
		this;
		JVM INSTR monitorenter ;
		((Object)this).notify();
		this;
		JVM INSTR monitorexit ;
		return true;
		message;
		this;
		JVM INSTR monitorexit ;
		throw message;
		message;
		Log.e("DummySurface", "Failed to initialize dummy surface", ((Throwable) (message)));
		e = ((RuntimeException) (message));
		this;
		JVM INSTR monitorenter ;
		((Object)this).notify();
		this;
		JVM INSTR monitorexit ;
		return true;
		message;
		this;
		JVM INSTR monitorexit ;
		throw message;
_L11:
		this;
		JVM INSTR monitorenter ;
		((Object)this).notify();
		this;
		JVM INSTR monitorexit ;
		throw message;
		message;
		this;
		JVM INSTR monitorexit ;
		throw message;
	//* 440  712:goto            524
	}

	public final void onFrameAvailable(SurfaceTexture surfacetexture)
	{
		b.sendEmptyMessage(2);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Handler b>
	//    2    4:iconst_2        
	//    3    5:invokevirtual   #80  <Method boolean Handler.sendEmptyMessage(int)>
	//    4    8:pop             
	//    5    9:return          
	}

	private final int a[] = new int[1];
	private Handler b;
	private SurfaceTexture c;
	private Error d;
	private RuntimeException e;
	private zzqk f;
}
