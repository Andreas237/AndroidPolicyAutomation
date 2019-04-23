// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.*;
import dalvik.system.DexClassLoader;
import java.io.*;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bas, bag, bax, bay, 
//			bba, bbd, p, bwk, 
//			m, baf, baw, azx, 
//			apu, ayt, awp, akh, 
//			aqw, ail, bce, baz

public class bav
{

	private bav(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		g = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #46  <Field AdvertisingIdClient g>
		h = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #48  <Field boolean h>
		i = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #50  <Field Future i>
		k = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #52  <Field akh k>
		l = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #54  <Field Future l>
		n = false;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #56  <Field boolean n>
		o = false;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #58  <Field boolean o>
		q = false;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #60  <Field boolean q>
		boolean flag = true;
	//   26   44:iconst_1        
	//   27   45:istore_2        
		r = true;
	//   28   46:aload_0         
	//   29   47:iconst_1        
	//   30   48:putfield        #62  <Field boolean r>
		s = false;
	//   31   51:aload_0         
	//   32   52:iconst_0        
	//   33   53:putfield        #64  <Field boolean s>
		Context context1 = context.getApplicationContext();
	//   34   56:aload_1         
	//   35   57:invokevirtual   #70  <Method Context Context.getApplicationContext()>
	//   36   60:astore_3        
		if(context1 == null)
	//*  37   61:aload_3         
	//*  38   62:ifnull          68
	//*  39   65:goto            70
			flag = false;
	//   40   68:iconst_0        
	//   41   69:istore_2        
		j = flag;
	//   42   70:aload_0         
	//   43   71:iload_2         
	//   44   72:putfield        #72  <Field boolean j>
		if(j)
	//*  45   75:aload_0         
	//*  46   76:getfield        #72  <Field boolean j>
	//*  47   79:ifeq            84
			context = context1;
	//   48   82:aload_3         
	//   49   83:astore_1        
		a = context;
	//   50   84:aload_0         
	//   51   85:aload_1         
	//   52   86:putfield        #74  <Field Context a>
		p = ((Map) (new HashMap()));
	//   53   89:aload_0         
	//   54   90:new             #76  <Class HashMap>
	//   55   93:dup             
	//   56   94:invokespecial   #77  <Method void HashMap()>
	//   57   97:putfield        #79  <Field Map p>
	//   58  100:return          
	}

	static akh a(bav bav1, akh akh1)
	{
		bav1.k = akh1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field akh k>
		return akh1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	public static bav a(Context context, String s1, String s2, boolean flag)
	{
		bav bav1 = new bav(context);
	//    0    0:new             #2   <Class bav>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #95  <Method void bav(Context)>
	//    4    8:astore          4
		FileOutputStream fileoutputstream;
		try
		{
			bav1.c = Executors.newCachedThreadPool(((java.util.concurrent.ThreadFactory) (new bax())));
	//    5   10:aload           4
	//    6   12:new             #97  <Class bax>
	//    7   15:dup             
	//    8   16:invokespecial   #98  <Method void bax()>
	//    9   19:invokestatic    #104 <Method ExecutorService Executors.newCachedThreadPool(java.util.concurrent.ThreadFactory)>
	//   10   22:putfield        #106 <Field ExecutorService c>
			bav1.h = flag;
	//   11   25:aload           4
	//   12   27:iload_3         
	//   13   28:putfield        #48  <Field boolean h>
		}
	//*  14   31:iload_3         
	//*  15   32:ifeq            59
	//*  16   35:aload           4
	//*  17   37:aload           4
	//*  18   39:getfield        #106 <Field ExecutorService c>
	//*  19   42:new             #108 <Class bay>
	//*  20   45:dup             
	//*  21   46:aload           4
	//*  22   48:invokespecial   #111 <Method void bay(bav)>
	//*  23   51:invokeinterface #117 <Method Future ExecutorService.submit(Runnable)>
	//*  24   56:putfield        #50  <Field Future i>
	//*  25   59:aload           4
	//*  26   61:getfield        #106 <Field ExecutorService c>
	//*  27   64:new             #119 <Class bba>
	//*  28   67:dup             
	//*  29   68:aload           4
	//*  30   70:invokespecial   #120 <Method void bba(bav)>
	//*  31   73:invokeinterface #124 <Method void ExecutorService.execute(Runnable)>
	//*  32   78:invokestatic    #129 <Method e e.b()>
	//*  33   81:astore_0        
	//*  34   82:aload_0         
	//*  35   83:aload           4
	//*  36   85:getfield        #74  <Field Context a>
	//*  37   88:invokevirtual   #132 <Method int e.d(Context)>
	//*  38   91:ifle            564
	//*  39   94:iconst_1        
	//*  40   95:istore_3        
	//*  41   96:goto            99
	//*  42   99:aload           4
	//*  43  101:iload_3         
	//*  44  102:putfield        #56  <Field boolean n>
	//*  45  105:aload_0         
	//*  46  106:aload           4
	//*  47  108:getfield        #74  <Field Context a>
	//*  48  111:invokevirtual   #134 <Method int e.a(Context)>
	//*  49  114:ifne            569
	//*  50  117:iconst_1        
	//*  51  118:istore_3        
	//*  52  119:goto            122
	//*  53  122:aload           4
	//*  54  124:iload_3         
	//*  55  125:putfield        #58  <Field boolean o>
	//*  56  128:aload           4
	//*  57  130:iconst_0        
	//*  58  131:iconst_1        
	//*  59  132:invokevirtual   #137 <Method void a(int, boolean)>
	//*  60  135:invokestatic    #142 <Method boolean bbd.a()>
	//*  61  138:ifeq            174
	//*  62  141:getstatic       #148 <Field com.google.android.gms.internal.ads.e p.bo>
	//*  63  144:astore_0        
	//*  64  145:invokestatic    #153 <Method m com.google.android.gms.internal.ads.bwk.e()>
	//*  65  148:aload_0         
	//*  66  149:invokevirtual   #158 <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//*  67  152:checkcast       #160 <Class Boolean>
	//*  68  155:invokevirtual   #163 <Method boolean Boolean.booleanValue()>
	//*  69  158:ifne            164
	//*  70  161:goto            174
	//*  71  164:new             #165 <Class IllegalStateException>
	//*  72  167:dup             
	//*  73  168:ldc1            #167 <String "Task Context initialization must not be called from the UI thread.">
	//*  74  170:invokespecial   #170 <Method void IllegalStateException(String)>
	//*  75  173:athrow          
	//*  76  174:aload           4
	//*  77  176:new             #172 <Class baf>
	//*  78  179:dup             
	//*  79  180:aconst_null     
	//*  80  181:invokespecial   #175 <Method void baf(java.security.SecureRandom)>
	//*  81  184:putfield        #177 <Field baf e>
	//*  82  187:aload           4
	//*  83  189:aload           4
	//*  84  191:getfield        #177 <Field baf e>
	//*  85  194:aload_1         
	//*  86  195:invokevirtual   #180 <Method byte[] baf.a(String)>
	//*  87  198:putfield        #182 <Field byte[] f>
	//*  88  201:aload           4
	//*  89  203:getfield        #74  <Field Context a>
	//*  90  206:invokevirtual   #186 <Method File Context.getCacheDir()>
	//*  91  209:astore_1        
	//*  92  210:aload_1         
	//*  93  211:astore_0        
	//*  94  212:aload_1         
	//*  95  213:ifnonnull       243
	//*  96  216:aload           4
	//*  97  218:getfield        #74  <Field Context a>
	//*  98  221:ldc1            #188 <String "dex">
	//*  99  223:iconst_0        
	//* 100  224:invokevirtual   #192 <Method File Context.getDir(String, int)>
	//* 101  227:astore_0        
	//* 102  228:aload_0         
	//* 103  229:ifnull          235
	//* 104  232:goto            243
	//* 105  235:new             #83  <Class bas>
	//* 106  238:dup             
	//* 107  239:invokespecial   #193 <Method void bas()>
	//* 108  242:athrow          
	//* 109  243:new             #195 <Class File>
	//* 110  246:dup             
	//* 111  247:ldc1            #197 <String "%s/%s.jar">
	//* 112  249:iconst_2        
	//* 113  250:anewarray       Object[]
	//* 114  253:dup             
	//* 115  254:iconst_0        
	//* 116  255:aload_0         
	//* 117  256:aastore         
	//* 118  257:dup             
	//* 119  258:iconst_1        
	//* 120  259:ldc1            #199 <String "1529567361524">
	//* 121  261:aastore         
	//* 122  262:invokestatic    #205 <Method String String.format(String, Object[])>
	//* 123  265:invokespecial   #206 <Method void File(String)>
	//* 124  268:astore_1        
	//* 125  269:aload_1         
	//* 126  270:invokevirtual   #209 <Method boolean File.exists()>
	//* 127  273:ifne            320
	//* 128  276:aload           4
	//* 129  278:getfield        #177 <Field baf e>
	//* 130  281:aload           4
	//* 131  283:getfield        #182 <Field byte[] f>
	//* 132  286:aload_2         
	//* 133  287:invokevirtual   #212 <Method byte[] baf.a(byte[], String)>
	//* 134  290:astore_2        
	//* 135  291:aload_1         
	//* 136  292:invokevirtual   #215 <Method boolean File.createNewFile()>
	//* 137  295:pop             
	//* 138  296:new             #217 <Class FileOutputStream>
	//* 139  299:dup             
	//* 140  300:aload_1         
	//* 141  301:invokespecial   #220 <Method void FileOutputStream(File)>
	//* 142  304:astore          5
	//* 143  306:aload           5
	//* 144  308:aload_2         
	//* 145  309:iconst_0        
	//* 146  310:aload_2         
	//* 147  311:arraylength     
	//* 148  312:invokevirtual   #224 <Method void FileOutputStream.write(byte[], int, int)>
	//* 149  315:aload           5
	//* 150  317:invokevirtual   #227 <Method void FileOutputStream.close()>
	//* 151  320:aload           4
	//* 152  322:aload_0         
	//* 153  323:ldc1            #199 <String "1529567361524">
	//* 154  325:invokespecial   #230 <Method boolean b(File, String)>
	//* 155  328:pop             
	//* 156  329:aload           4
	//* 157  331:new             #232 <Class DexClassLoader>
	//* 158  334:dup             
	//* 159  335:aload_1         
	//* 160  336:invokevirtual   #236 <Method String File.getAbsolutePath()>
	//* 161  339:aload_0         
	//* 162  340:invokevirtual   #236 <Method String File.getAbsolutePath()>
	//* 163  343:aconst_null     
	//* 164  344:aload           4
	//* 165  346:getfield        #74  <Field Context a>
	//* 166  349:invokevirtual   #240 <Method ClassLoader Context.getClassLoader()>
	//* 167  352:invokespecial   #243 <Method void DexClassLoader(String, String, String, ClassLoader)>
	//* 168  355:putfield        #245 <Field DexClassLoader d>
	//* 169  358:aload_1         
	//* 170  359:invokestatic    #247 <Method void a(File)>
	//* 171  362:aload           4
	//* 172  364:aload_0         
	//* 173  365:ldc1            #199 <String "1529567361524">
	//* 174  367:invokespecial   #250 <Method void a(File, String)>
	//* 175  370:ldc1            #252 <String "%s/%s.dex">
	//* 176  372:iconst_2        
	//* 177  373:anewarray       Object[]
	//* 178  376:dup             
	//* 179  377:iconst_0        
	//* 180  378:aload_0         
	//* 181  379:aastore         
	//* 182  380:dup             
	//* 183  381:iconst_1        
	//* 184  382:ldc1            #199 <String "1529567361524">
	//* 185  384:aastore         
	//* 186  385:invokestatic    #205 <Method String String.format(String, Object[])>
	//* 187  388:invokestatic    #254 <Method void a(String)>
	//* 188  391:aload           4
	//* 189  393:getfield        #64  <Field boolean s>
	//* 190  396:ifne            447
	//* 191  399:new             #256 <Class IntentFilter>
	//* 192  402:dup             
	//* 193  403:invokespecial   #257 <Method void IntentFilter()>
	//* 194  406:astore_0        
	//* 195  407:aload_0         
	//* 196  408:ldc2            #259 <String "android.intent.action.USER_PRESENT">
	//* 197  411:invokevirtual   #262 <Method void IntentFilter.addAction(String)>
	//* 198  414:aload_0         
	//* 199  415:ldc2            #264 <String "android.intent.action.SCREEN_OFF">
	//* 200  418:invokevirtual   #262 <Method void IntentFilter.addAction(String)>
	//* 201  421:aload           4
	//* 202  423:getfield        #74  <Field Context a>
	//* 203  426:new             #266 <Class baw>
	//* 204  429:dup             
	//* 205  430:aload           4
	//* 206  432:aconst_null     
	//* 207  433:invokespecial   #269 <Method void baw(bav, bax)>
	//* 208  436:aload_0         
	//* 209  437:invokevirtual   #273 <Method android.content.Intent Context.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//* 210  440:pop             
	//* 211  441:aload           4
	//* 212  443:iconst_1        
	//* 213  444:putfield        #64  <Field boolean s>
	//* 214  447:aload           4
	//* 215  449:new             #275 <Class azx>
	//* 216  452:dup             
	//* 217  453:aload           4
	//* 218  455:invokespecial   #276 <Method void azx(bav)>
	//* 219  458:putfield        #278 <Field azx m>
	//* 220  461:aload           4
	//* 221  463:iconst_1        
	//* 222  464:putfield        #60  <Field boolean q>
	//* 223  467:aload           4
	//* 224  469:areturn         
	//* 225  470:astore_2        
	//* 226  471:aload_1         
	//* 227  472:invokestatic    #247 <Method void a(File)>
	//* 228  475:aload           4
	//* 229  477:aload_0         
	//* 230  478:ldc1            #199 <String "1529567361524">
	//* 231  480:invokespecial   #250 <Method void a(File, String)>
	//* 232  483:ldc1            #252 <String "%s/%s.dex">
	//* 233  485:iconst_2        
	//* 234  486:anewarray       Object[]
	//* 235  489:dup             
	//* 236  490:iconst_0        
	//* 237  491:aload_0         
	//* 238  492:aastore         
	//* 239  493:dup             
	//* 240  494:iconst_1        
	//* 241  495:ldc1            #199 <String "1529567361524">
	//* 242  497:aastore         
	//* 243  498:invokestatic    #205 <Method String String.format(String, Object[])>
	//* 244  501:invokestatic    #254 <Method void a(String)>
	//* 245  504:aload_2         
	//* 246  505:athrow          
	//* 247  506:astore_0        
	//* 248  507:new             #83  <Class bas>
	//* 249  510:dup             
	//* 250  511:aload_0         
	//* 251  512:invokespecial   #281 <Method void bas(Throwable)>
	//* 252  515:athrow          
	//* 253  516:astore_0        
	//* 254  517:new             #83  <Class bas>
	//* 255  520:dup             
	//* 256  521:aload_0         
	//* 257  522:invokespecial   #281 <Method void bas(Throwable)>
	//* 258  525:athrow          
	//* 259  526:astore_0        
	//* 260  527:new             #83  <Class bas>
	//* 261  530:dup             
	//* 262  531:aload_0         
	//* 263  532:invokespecial   #281 <Method void bas(Throwable)>
	//* 264  535:athrow          
	//* 265  536:astore_0        
	//* 266  537:new             #83  <Class bas>
	//* 267  540:dup             
	//* 268  541:aload_0         
	//* 269  542:invokespecial   #281 <Method void bas(Throwable)>
	//* 270  545:athrow          
	//* 271  546:astore_0        
	//* 272  547:new             #83  <Class bas>
	//* 273  550:dup             
	//* 274  551:aload_0         
	//* 275  552:invokespecial   #281 <Method void bas(Throwable)>
	//* 276  555:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 277  556:astore_0        
		{
			return bav1;
	//  278  557:aload           4
	//  279  559:areturn         
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_59;
		bav1.i = bav1.c.submit(((Runnable) (new bay(bav1))));
		bav1.c.execute(((Runnable) (new bba(bav1))));
		context = ((Context) (com.google.android.gms.common.e.b()));
		if(((e) (context)).d(bav1.a) > 0)
			flag = true;
		else
	//* 280  560:astore_0        
	//* 281  561:goto            128
			flag = false;
	//  282  564:iconst_0        
	//  283  565:istore_3        
		bav1.n = flag;
		if(((e) (context)).a(bav1.a) == 0)
			flag = true;
		else
	//* 284  566:goto            99
			flag = false;
	//  285  569:iconst_0        
	//  286  570:istore_3        
		try
		{
			bav1.o = flag;
		}
		// Misplaced declaration of an exception variable
		catch(Context context) { }
		bav1.a(0, true);
		if(!bbd.a())
			break MISSING_BLOCK_LABEL_174;
		context = ((Context) (p.bo));
		if(!((Boolean)com.google.android.gms.internal.ads.bwk.e().a(((com.google.android.gms.internal.ads.e) (context)))).booleanValue())
			break MISSING_BLOCK_LABEL_174;
		throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
		bav1.e = new baf(((java.security.SecureRandom) (null)));
		bav1.f = bav1.e.a(s1);
		s1 = ((String) (bav1.a.getCacheDir()));
		context = ((Context) (s1));
		if(s1 != null)
			break MISSING_BLOCK_LABEL_243;
		context = ((Context) (bav1.a.getDir("dex", 0)));
		if(context != null)
			break MISSING_BLOCK_LABEL_243;
		throw new bas();
		s1 = ((String) (new File(String.format("%s/%s.jar", new Object[] {
			context, "1529567361524"
		}))));
		if(!((File) (s1)).exists())
		{
			s2 = ((String) (bav1.e.a(bav1.f, s2)));
			((File) (s1)).createNewFile();
			fileoutputstream = new FileOutputStream(((File) (s1)));
			fileoutputstream.write(((byte []) (s2)), 0, s2.length);
			fileoutputstream.close();
		}
		bav1.b(((File) (context)), "1529567361524");
		bav1.d = new DexClassLoader(((File) (s1)).getAbsolutePath(), ((File) (context)).getAbsolutePath(), ((String) (null)), bav1.a.getClassLoader());
		a(((File) (s1)));
		bav1.a(((File) (context)), "1529567361524");
		a(String.format("%s/%s.dex", new Object[] {
			context, "1529567361524"
		}));
		if(!bav1.s)
		{
			context = ((Context) (new IntentFilter()));
			((IntentFilter) (context)).addAction("android.intent.action.USER_PRESENT");
			((IntentFilter) (context)).addAction("android.intent.action.SCREEN_OFF");
			bav1.a.registerReceiver(((android.content.BroadcastReceiver) (new baw(bav1, ((bax) (null))))), ((IntentFilter) (context)));
			bav1.s = true;
		}
		bav1.m = new azx(bav1);
		bav1.q = true;
		return bav1;
		s2;
		a(((File) (s1)));
		bav1.a(((File) (context)), "1529567361524");
		a(String.format("%s/%s.dex", new Object[] {
			context, "1529567361524"
		}));
		throw s2;
		context;
		throw new bas(((Throwable) (context)));
		context;
		throw new bas(((Throwable) (context)));
		context;
		throw new bas(((Throwable) (context)));
		context;
		throw new bas(((Throwable) (context)));
		context;
		throw new bas(((Throwable) (context)));
	//* 287  571:goto            122
	}

	static void a(bav bav1)
	{
		bav1.o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #283 <Method void o()>
	//    2    4:return          
	}

	private static void a(File file)
	{
		if(!file.exists())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #209 <Method boolean File.exists()>
	//*   2    4:ifne            32
		{
			Log.d(b, String.format("File %s not found. No need for deletion", new Object[] {
				file.getAbsolutePath()
			}));
	//    3    7:getstatic       #285 <Field String b>
	//    4   10:ldc2            #287 <String "File %s not found. No need for deletion">
	//    5   13:iconst_1        
	//    6   14:anewarray       Object[]
	//    7   17:dup             
	//    8   18:iconst_0        
	//    9   19:aload_0         
	//   10   20:invokevirtual   #236 <Method String File.getAbsolutePath()>
	//   11   23:aastore         
	//   12   24:invokestatic    #205 <Method String String.format(String, Object[])>
	//   13   27:invokestatic    #292 <Method int Log.d(String, String)>
	//   14   30:pop             
			return;
	//   15   31:return          
		} else
		{
			file.delete();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #295 <Method boolean File.delete()>
	//   18   36:pop             
			return;
	//   19   37:return          
		}
	}

	private final void a(File file, String s1)
	{
		Object obj;
		Exception exception;
		File file1;
		File file2;
		byte abyte0[];
		file1 = new File(String.format("%s/%s.tmp", new Object[] {
			file, s1
		}));
	//    0    0:new             #195 <Class File>
	//    1    3:dup             
	//    2    4:ldc2            #299 <String "%s/%s.tmp">
	//    3    7:iconst_2        
	//    4    8:anewarray       Object[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:aload_1         
	//    8   14:aastore         
	//    9   15:dup             
	//   10   16:iconst_1        
	//   11   17:aload_2         
	//   12   18:aastore         
	//   13   19:invokestatic    #205 <Method String String.format(String, Object[])>
	//   14   22:invokespecial   #206 <Method void File(String)>
	//   15   25:astore          8
		if(file1.exists())
	//*  16   27:aload           8
	//*  17   29:invokevirtual   #209 <Method boolean File.exists()>
	//*  18   32:ifeq            36
			return;
	//   19   35:return          
		file2 = new File(String.format("%s/%s.dex", new Object[] {
			file, s1
		}));
	//   20   36:new             #195 <Class File>
	//   21   39:dup             
	//   22   40:ldc1            #252 <String "%s/%s.dex">
	//   23   42:iconst_2        
	//   24   43:anewarray       Object[]
	//   25   46:dup             
	//   26   47:iconst_0        
	//   27   48:aload_1         
	//   28   49:aastore         
	//   29   50:dup             
	//   30   51:iconst_1        
	//   31   52:aload_2         
	//   32   53:aastore         
	//   33   54:invokestatic    #205 <Method String String.format(String, Object[])>
	//   34   57:invokespecial   #206 <Method void File(String)>
	//   35   60:astore          9
		if(!file2.exists())
	//*  36   62:aload           9
	//*  37   64:invokevirtual   #209 <Method boolean File.exists()>
	//*  38   67:ifne            71
			return;
	//   39   70:return          
		long l1 = file2.length();
	//   40   71:aload           9
	//   41   73:invokevirtual   #303 <Method long File.length()>
	//   42   76:lstore          4
		if(l1 <= 0L)
	//*  43   78:lload           4
	//*  44   80:lconst_0        
	//*  45   81:lcmp            
	//*  46   82:ifgt            86
			return;
	//   47   85:return          
		abyte0 = new byte[(int)l1];
	//   48   86:lload           4
	//   49   88:l2i             
	//   50   89:newarray        byte[]
	//   51   91:astore          11
		obj = null;
	//   52   93:aconst_null     
	//   53   94:astore          6
		exception = null;
	//   54   96:aconst_null     
	//   55   97:astore          7
		int i1;
		try
		{
			file = ((File) (new FileInputStream(file2)));
	//   56   99:new             #305 <Class FileInputStream>
	//   57  102:dup             
	//   58  103:aload           9
	//   59  105:invokespecial   #306 <Method void FileInputStream(File)>
	//   60  108:astore_1        
		}
	//*  61  109:aload_1         
	//*  62  110:aload           11
	//*  63  112:invokevirtual   #310 <Method int FileInputStream.read(byte[])>
	//*  64  115:istore_3        
	//*  65  116:iload_3         
	//*  66  117:ifgt            130
	//*  67  120:aload_1         
	//*  68  121:invokevirtual   #311 <Method void FileInputStream.close()>
	//*  69  124:aload           9
	//*  70  126:invokestatic    #247 <Method void a(File)>
	//*  71  129:return          
	//*  72  130:new             #313 <Class apu>
	//*  73  133:dup             
	//*  74  134:invokespecial   #314 <Method void apu()>
	//*  75  137:astore          10
	//*  76  139:aload           10
	//*  77  141:getstatic       #319 <Field String android.os.Build$VERSION.SDK>
	//*  78  144:invokevirtual   #323 <Method byte[] String.getBytes()>
	//*  79  147:putfield        #325 <Field byte[] apu.d>
	//*  80  150:aload           10
	//*  81  152:aload_2         
	//*  82  153:invokevirtual   #323 <Method byte[] String.getBytes()>
	//*  83  156:putfield        #327 <Field byte[] apu.c>
	//*  84  159:aload_0         
	//*  85  160:getfield        #177 <Field baf e>
	//*  86  163:aload_0         
	//*  87  164:getfield        #182 <Field byte[] f>
	//*  88  167:aload           11
	//*  89  169:invokevirtual   #330 <Method String baf.a(byte[], byte[])>
	//*  90  172:invokevirtual   #323 <Method byte[] String.getBytes()>
	//*  91  175:astore_2        
	//*  92  176:aload           10
	//*  93  178:aload_2         
	//*  94  179:putfield        #332 <Field byte[] apu.a>
	//*  95  182:aload           10
	//*  96  184:aload_2         
	//*  97  185:invokestatic    #337 <Method byte[] ayt.a(byte[])>
	//*  98  188:putfield        #339 <Field byte[] apu.b>
	//*  99  191:aload           8
	//* 100  193:invokevirtual   #215 <Method boolean File.createNewFile()>
	//* 101  196:pop             
	//* 102  197:new             #217 <Class FileOutputStream>
	//* 103  200:dup             
	//* 104  201:aload           8
	//* 105  203:invokespecial   #220 <Method void FileOutputStream(File)>
	//* 106  206:astore_2        
	//* 107  207:aload           10
	//* 108  209:invokestatic    #344 <Method byte[] awp.a(awp)>
	//* 109  212:astore          6
	//* 110  214:aload_2         
	//* 111  215:aload           6
	//* 112  217:iconst_0        
	//* 113  218:aload           6
	//* 114  220:arraylength     
	//* 115  221:invokevirtual   #224 <Method void FileOutputStream.write(byte[], int, int)>
	//* 116  224:aload_2         
	//* 117  225:invokevirtual   #227 <Method void FileOutputStream.close()>
	//* 118  228:aload_1         
	//* 119  229:invokevirtual   #311 <Method void FileInputStream.close()>
	//* 120  232:aload_2         
	//* 121  233:invokevirtual   #227 <Method void FileOutputStream.close()>
	//* 122  236:aload           9
	//* 123  238:invokestatic    #247 <Method void a(File)>
	//* 124  241:return          
	//* 125  242:astore          7
	//* 126  244:aload_1         
	//* 127  245:astore          6
	//* 128  247:aload           7
	//* 129  249:astore_1        
	//* 130  250:goto            277
	//* 131  253:goto            307
	//* 132  256:astore          8
	//* 133  258:aload           7
	//* 134  260:astore_2        
	//* 135  261:aload_1         
	//* 136  262:astore          6
	//* 137  264:aload           8
	//* 138  266:astore_1        
	//* 139  267:goto            277
	//* 140  270:astore_1        
	//* 141  271:aconst_null     
	//* 142  272:astore          6
	//* 143  274:aload           7
	//* 144  276:astore_2        
	//* 145  277:aload           6
	//* 146  279:ifnull          287
	//* 147  282:aload           6
	//* 148  284:invokevirtual   #311 <Method void FileInputStream.close()>
	//* 149  287:aload_2         
	//* 150  288:ifnull          295
	//* 151  291:aload_2         
	//* 152  292:invokevirtual   #227 <Method void FileOutputStream.close()>
	//* 153  295:aload           9
	//* 154  297:invokestatic    #247 <Method void a(File)>
	//* 155  300:aload_1         
	//* 156  301:athrow          
	//* 157  302:aconst_null     
	//* 158  303:astore_1        
	//* 159  304:aload           6
	//* 160  306:astore_2        
	//* 161  307:aload_1         
	//* 162  308:ifnull          315
	//* 163  311:aload_1         
	//* 164  312:invokevirtual   #311 <Method void FileInputStream.close()>
	//* 165  315:aload_2         
	//* 166  316:ifnull          323
	//* 167  319:aload_2         
	//* 168  320:invokevirtual   #227 <Method void FileOutputStream.close()>
	//* 169  323:aload           9
	//* 170  325:invokestatic    #247 <Method void a(File)>
	//* 171  328:return          
		// Misplaced declaration of an exception variable
		catch(File file)
	//* 172  329:astore_1        
		{
			break MISSING_BLOCK_LABEL_302;
	//  173  330:goto            302
		}
		i1 = ((FileInputStream) (file)).read(abyte0);
		if(i1 <= 0)
		{
			Exception exception1;
			apu apu1;
			try
			{
				((FileInputStream) (file)).close();
			}
	//* 174  333:astore_2        
	//* 175  334:aload           6
	//* 176  336:astore_2        
	//* 177  337:goto            307
			// Misplaced declaration of an exception variable
			catch(File file) { }
	//  178  340:astore_1        
			a(file2);
			return;
		}
		apu1 = new apu();
		apu1.d = android.os.Build.VERSION.SDK.getBytes();
		apu1.c = s1.getBytes();
		s1 = ((String) (e.a(f, abyte0).getBytes()));
		apu1.a = ((byte []) (s1));
		apu1.b = ayt.a(((byte []) (s1)));
		file1.createNewFile();
		s1 = ((String) (new FileOutputStream(file1)));
		obj = ((Object) (awp.a(((awp) (apu1)))));
		((FileOutputStream) (s1)).write(((byte []) (obj)), 0, obj.length);
		((FileOutputStream) (s1)).close();
		Object obj1;
		try
		{
			((FileInputStream) (file)).close();
		}
	//* 179  341:goto            124
	//* 180  344:astore          6
	//* 181  346:goto            253
		// Misplaced declaration of an exception variable
		catch(File file) { }
	//  182  349:astore_1        
		try
		{
			((FileOutputStream) (s1)).close();
		}
	//* 183  350:goto            232
		// Misplaced declaration of an exception variable
		catch(File file) { }
	//  184  353:astore_1        
		a(file2);
		return;
		exception;
		obj = ((Object) (file));
		file = ((File) (exception));
		break MISSING_BLOCK_LABEL_277;
		exception1;
		s1 = ((String) (exception));
		obj = ((Object) (file));
		file = ((File) (exception1));
		break MISSING_BLOCK_LABEL_277;
		file;
		obj = null;
		s1 = ((String) (exception));
		if(obj != null)
			try
			{
				((FileInputStream) (obj)).close();
			}
	//* 185  354:goto            236
			catch(IOException ioexception) { }
	//  186  357:astore          6
		if(s1 != null)
			try
			{
				((FileOutputStream) (s1)).close();
			}
	//* 187  359:goto            287
			// Misplaced declaration of an exception variable
			catch(String s1) { }
	//  188  362:astore_2        
		a(file2);
		throw file;
		file = null;
		s1 = ((String) (obj));
_L1:
		if(file != null)
			try
			{
				((FileInputStream) (file)).close();
			}
	//* 189  363:goto            295
			// Misplaced declaration of an exception variable
			catch(File file) { }
	//  190  366:astore_1        
		if(s1 != null)
			try
			{
				((FileOutputStream) (s1)).close();
			}
	//* 191  367:goto            315
			// Misplaced declaration of an exception variable
			catch(File file) { }
	//  192  370:astore_1        
		a(file2);
		return;
		s1;
		s1 = ((String) (obj));
		  goto _L1
		obj1;
		  goto _L1
	//* 193  371:goto            323
	}

	private static void a(String s1)
	{
		a(new File(s1));
	//    0    0:new             #195 <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #206 <Method void File(String)>
	//    4    8:invokestatic    #247 <Method void a(File)>
	//    5   11:return          
	}

	static boolean a(int i1, akh akh1)
	{
		return b(i1, akh1);
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #347 <Method boolean b(int, akh)>
	//    3    5:ireturn         
	}

	static boolean a(bav bav1, boolean flag)
	{
		bav1.r = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #62  <Field boolean r>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private static boolean b(int i1, akh akh1)
	{
		if(i1 < 4)
	//*   0    0:iload_0         
	//*   1    1:iconst_4        
	//*   2    2:icmpge          109
		{
			if(akh1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
				return true;
	//    5    9:iconst_1        
	//    6   10:ireturn         
			com.google.android.gms.internal.ads.e e1 = p.br;
	//    7   11:getstatic       #351 <Field com.google.android.gms.internal.ads.e p.br>
	//    8   14:astore_2        
			if(((Boolean)com.google.android.gms.internal.ads.bwk.e().a(e1)).booleanValue() && (akh1.n == null || akh1.n.equals("0000000000000000000000000000000000000000000000000000000000000000")))
	//*   9   15:invokestatic    #153 <Method m com.google.android.gms.internal.ads.bwk.e()>
	//*  10   18:aload_2         
	//*  11   19:invokevirtual   #158 <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//*  12   22:checkcast       #160 <Class Boolean>
	//*  13   25:invokevirtual   #163 <Method boolean Boolean.booleanValue()>
	//*  14   28:ifeq            53
	//*  15   31:aload_1         
	//*  16   32:getfield        #355 <Field String akh.n>
	//*  17   35:ifnull          51
	//*  18   38:aload_1         
	//*  19   39:getfield        #355 <Field String akh.n>
	//*  20   42:ldc2            #357 <String "0000000000000000000000000000000000000000000000000000000000000000">
	//*  21   45:invokevirtual   #361 <Method boolean String.equals(Object)>
	//*  22   48:ifeq            53
				return true;
	//   23   51:iconst_1        
	//   24   52:ireturn         
			e1 = p.bs;
	//   25   53:getstatic       #364 <Field com.google.android.gms.internal.ads.e p.bs>
	//   26   56:astore_2        
			if(((Boolean)com.google.android.gms.internal.ads.bwk.e().a(e1)).booleanValue() && (akh1.Y == null || akh1.Y.a == null || akh1.Y.a.longValue() == -2L))
	//*  27   57:invokestatic    #153 <Method m com.google.android.gms.internal.ads.bwk.e()>
	//*  28   60:aload_2         
	//*  29   61:invokevirtual   #158 <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//*  30   64:checkcast       #160 <Class Boolean>
	//*  31   67:invokevirtual   #163 <Method boolean Boolean.booleanValue()>
	//*  32   70:ifeq            109
	//*  33   73:aload_1         
	//*  34   74:getfield        #368 <Field aqw akh.Y>
	//*  35   77:ifnull          107
	//*  36   80:aload_1         
	//*  37   81:getfield        #368 <Field aqw akh.Y>
	//*  38   84:getfield        #373 <Field Long aqw.a>
	//*  39   87:ifnull          107
	//*  40   90:aload_1         
	//*  41   91:getfield        #368 <Field aqw akh.Y>
	//*  42   94:getfield        #373 <Field Long aqw.a>
	//*  43   97:invokevirtual   #378 <Method long Long.longValue()>
	//*  44  100:ldc2w           #379 <Long -2L>
	//*  45  103:lcmp            
	//*  46  104:ifne            109
				return true;
	//   47  107:iconst_1        
	//   48  108:ireturn         
		}
		return false;
	//   49  109:iconst_0        
	//   50  110:ireturn         
	}

	private final boolean b(File file, String s1)
	{
		String s2;
		Exception exception;
		File file1;
		File file2;
		file1 = new File(String.format("%s/%s.tmp", new Object[] {
			file, s1
		}));
	//    0    0:new             #195 <Class File>
	//    1    3:dup             
	//    2    4:ldc2            #299 <String "%s/%s.tmp">
	//    3    7:iconst_2        
	//    4    8:anewarray       Object[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:aload_1         
	//    8   14:aastore         
	//    9   15:dup             
	//   10   16:iconst_1        
	//   11   17:aload_2         
	//   12   18:aastore         
	//   13   19:invokestatic    #205 <Method String String.format(String, Object[])>
	//   14   22:invokespecial   #206 <Method void File(String)>
	//   15   25:astore          7
		if(!file1.exists())
	//*  16   27:aload           7
	//*  17   29:invokevirtual   #209 <Method boolean File.exists()>
	//*  18   32:ifne            37
			return false;
	//   19   35:iconst_0        
	//   20   36:ireturn         
		file2 = new File(String.format("%s/%s.dex", new Object[] {
			file, s1
		}));
	//   21   37:new             #195 <Class File>
	//   22   40:dup             
	//   23   41:ldc1            #252 <String "%s/%s.dex">
	//   24   43:iconst_2        
	//   25   44:anewarray       Object[]
	//   26   47:dup             
	//   27   48:iconst_0        
	//   28   49:aload_1         
	//   29   50:aastore         
	//   30   51:dup             
	//   31   52:iconst_1        
	//   32   53:aload_2         
	//   33   54:aastore         
	//   34   55:invokestatic    #205 <Method String String.format(String, Object[])>
	//   35   58:invokespecial   #206 <Method void File(String)>
	//   36   61:astore          8
		if(file2.exists())
	//*  37   63:aload           8
	//*  38   65:invokevirtual   #209 <Method boolean File.exists()>
	//*  39   68:ifeq            73
			return false;
	//   40   71:iconst_0        
	//   41   72:ireturn         
		exception = null;
	//   42   73:aconst_null     
	//   43   74:astore          6
		s2 = null;
	//   44   76:aconst_null     
	//   45   77:astore          5
		long l1;
		byte abyte0[];
		apu apu1;
		try
		{
			l1 = file1.length();
	//   46   79:aload           7
	//   47   81:invokevirtual   #303 <Method long File.length()>
	//   48   84:lstore_3        
		}
	//*  49   85:lload_3         
	//*  50   86:lconst_0        
	//*  51   87:lcmp            
	//*  52   88:ifgt            98
	//*  53   91:aload           7
	//*  54   93:invokestatic    #247 <Method void a(File)>
	//*  55   96:iconst_0        
	//*  56   97:ireturn         
	//*  57   98:lload_3         
	//*  58   99:l2i             
	//*  59  100:newarray        byte[]
	//*  60  102:astore          9
	//*  61  104:new             #305 <Class FileInputStream>
	//*  62  107:dup             
	//*  63  108:aload           7
	//*  64  110:invokespecial   #306 <Method void FileInputStream(File)>
	//*  65  113:astore_1        
	//*  66  114:aload_1         
	//*  67  115:aload           9
	//*  68  117:invokevirtual   #310 <Method int FileInputStream.read(byte[])>
	//*  69  120:ifgt            144
	//*  70  123:getstatic       #285 <Field String b>
	//*  71  126:ldc2            #382 <String "Cannot read the cache data.">
	//*  72  129:invokestatic    #292 <Method int Log.d(String, String)>
	//*  73  132:pop             
	//*  74  133:aload           7
	//*  75  135:invokestatic    #247 <Method void a(File)>
	//*  76  138:aload_1         
	//*  77  139:invokevirtual   #311 <Method void FileInputStream.close()>
	//*  78  142:iconst_0        
	//*  79  143:ireturn         
	//*  80  144:new             #313 <Class apu>
	//*  81  147:dup             
	//*  82  148:invokespecial   #314 <Method void apu()>
	//*  83  151:aload           9
	//*  84  153:invokestatic    #385 <Method awp awp.a(awp, byte[])>
	//*  85  156:checkcast       #313 <Class apu>
	//*  86  159:astore          9
	//*  87  161:aload_2         
	//*  88  162:new             #201 <Class String>
	//*  89  165:dup             
	//*  90  166:aload           9
	//*  91  168:getfield        #327 <Field byte[] apu.c>
	//*  92  171:invokespecial   #388 <Method void String(byte[])>
	//*  93  174:invokevirtual   #361 <Method boolean String.equals(Object)>
	//*  94  177:ifeq            296
	//*  95  180:aload           9
	//*  96  182:getfield        #339 <Field byte[] apu.b>
	//*  97  185:aload           9
	//*  98  187:getfield        #332 <Field byte[] apu.a>
	//*  99  190:invokestatic    #337 <Method byte[] ayt.a(byte[])>
	//* 100  193:invokestatic    #393 <Method boolean Arrays.equals(byte[], byte[])>
	//* 101  196:ifeq            296
	//* 102  199:aload           9
	//* 103  201:getfield        #325 <Field byte[] apu.d>
	//* 104  204:getstatic       #319 <Field String android.os.Build$VERSION.SDK>
	//* 105  207:invokevirtual   #323 <Method byte[] String.getBytes()>
	//* 106  210:invokestatic    #393 <Method boolean Arrays.equals(byte[], byte[])>
	//* 107  213:ifne            219
	//* 108  216:goto            296
	//* 109  219:aload_0         
	//* 110  220:getfield        #177 <Field baf e>
	//* 111  223:aload_0         
	//* 112  224:getfield        #182 <Field byte[] f>
	//* 113  227:new             #201 <Class String>
	//* 114  230:dup             
	//* 115  231:aload           9
	//* 116  233:getfield        #332 <Field byte[] apu.a>
	//* 117  236:invokespecial   #388 <Method void String(byte[])>
	//* 118  239:invokevirtual   #212 <Method byte[] baf.a(byte[], String)>
	//* 119  242:astore          7
	//* 120  244:aload           8
	//* 121  246:invokevirtual   #215 <Method boolean File.createNewFile()>
	//* 122  249:pop             
	//* 123  250:new             #217 <Class FileOutputStream>
	//* 124  253:dup             
	//* 125  254:aload           8
	//* 126  256:invokespecial   #220 <Method void FileOutputStream(File)>
	//* 127  259:astore_2        
	//* 128  260:aload_2         
	//* 129  261:aload           7
	//* 130  263:iconst_0        
	//* 131  264:aload           7
	//* 132  266:arraylength     
	//* 133  267:invokevirtual   #224 <Method void FileOutputStream.write(byte[], int, int)>
	//* 134  270:aload_1         
	//* 135  271:invokevirtual   #311 <Method void FileInputStream.close()>
	//* 136  274:aload_2         
	//* 137  275:invokevirtual   #227 <Method void FileOutputStream.close()>
	//* 138  278:iconst_1        
	//* 139  279:ireturn         
	//* 140  280:astore          6
	//* 141  282:aload_2         
	//* 142  283:astore          5
	//* 143  285:aload_1         
	//* 144  286:astore_2        
	//* 145  287:aload           6
	//* 146  289:astore_1        
	//* 147  290:goto            320
	//* 148  293:goto            345
	//* 149  296:aload           7
	//* 150  298:invokestatic    #247 <Method void a(File)>
	//* 151  301:aload_1         
	//* 152  302:invokevirtual   #311 <Method void FileInputStream.close()>
	//* 153  305:iconst_0        
	//* 154  306:ireturn         
	//* 155  307:astore          6
	//* 156  309:aload_1         
	//* 157  310:astore_2        
	//* 158  311:aload           6
	//* 159  313:astore_1        
	//* 160  314:goto            320
	//* 161  317:astore_1        
	//* 162  318:aconst_null     
	//* 163  319:astore_2        
	//* 164  320:aload_2         
	//* 165  321:ifnull          328
	//* 166  324:aload_2         
	//* 167  325:invokevirtual   #311 <Method void FileInputStream.close()>
	//* 168  328:aload           5
	//* 169  330:ifnull          338
	//* 170  333:aload           5
	//* 171  335:invokevirtual   #227 <Method void FileOutputStream.close()>
	//* 172  338:aload_1         
	//* 173  339:athrow          
	//* 174  340:aconst_null     
	//* 175  341:astore_1        
	//* 176  342:aload           6
	//* 177  344:astore_2        
	//* 178  345:aload_1         
	//* 179  346:ifnull          353
	//* 180  349:aload_1         
	//* 181  350:invokevirtual   #311 <Method void FileInputStream.close()>
	//* 182  353:aload_2         
	//* 183  354:ifnull          361
	//* 184  357:aload_2         
	//* 185  358:invokevirtual   #227 <Method void FileOutputStream.close()>
	//* 186  361:iconst_0        
	//* 187  362:ireturn         
		// Misplaced declaration of an exception variable
		catch(File file)
	//* 188  363:astore_1        
		{
			break MISSING_BLOCK_LABEL_340;
	//  189  364:goto            340
		}
		if(l1 > 0L)
			break MISSING_BLOCK_LABEL_98;
		a(file1);
		return false;
		abyte0 = new byte[(int)l1];
		file = ((File) (new FileInputStream(file1)));
		if(((FileInputStream) (file)).read(abyte0) > 0)
			break MISSING_BLOCK_LABEL_144;
		Log.d(b, "Cannot read the cache data.");
		a(file1);
		try
		{
			((FileInputStream) (file)).close();
		}
	//* 190  367:astore_2        
	//* 191  368:aload           6
	//* 192  370:astore_2        
	//* 193  371:goto            345
		// Misplaced declaration of an exception variable
		catch(File file)
	//* 194  374:astore_1        
		{
			return false;
	//  195  375:iconst_0        
	//  196  376:ireturn         
		}
		return false;
		apu1 = (apu)awp.a(((awp) (new apu())), abyte0);
		if(!s1.equals(((Object) (new String(apu1.c)))) || !Arrays.equals(apu1.b, ayt.a(apu1.a)) || !Arrays.equals(apu1.d, android.os.Build.VERSION.SDK.getBytes()))
			break MISSING_BLOCK_LABEL_296;
		file1 = ((File) (e.a(f, new String(apu1.a))));
		file2.createNewFile();
		s1 = ((String) (new FileOutputStream(file2)));
		((FileOutputStream) (s1)).write(((byte []) (file1)), 0, file1.length);
		Object obj;
		try
		{
			((FileInputStream) (file)).close();
		}
	//* 197  377:astore          5
	//* 198  379:goto            293
		// Misplaced declaration of an exception variable
		catch(File file) { }
	//  199  382:astore_1        
		try
		{
			((FileOutputStream) (s1)).close();
		}
	//* 200  383:goto            274
		// Misplaced declaration of an exception variable
		catch(File file)
	//* 201  386:astore_1        
		{
			return true;
	//  202  387:iconst_1        
	//  203  388:ireturn         
		}
		return true;
		exception;
		s2 = s1;
		s1 = ((String) (file));
		file = ((File) (exception));
		break MISSING_BLOCK_LABEL_320;
		a(file1);
		try
		{
			((FileInputStream) (file)).close();
		}
		// Misplaced declaration of an exception variable
		catch(File file)
	//* 204  389:astore_1        
		{
			return false;
	//  205  390:iconst_0        
	//  206  391:ireturn         
		}
		return false;
		exception;
		s1 = ((String) (file));
		file = ((File) (exception));
		break MISSING_BLOCK_LABEL_320;
		file;
		s1 = null;
		if(s1 != null)
			try
			{
				((FileInputStream) (s1)).close();
			}
			// Misplaced declaration of an exception variable
			catch(String s1) { }
	//  207  392:astore_2        
		if(s2 != null)
			try
			{
				((FileOutputStream) (s2)).close();
			}
	//* 208  393:goto            328
			// Misplaced declaration of an exception variable
			catch(String s1) { }
	//  209  396:astore_2        
		throw file;
		file = null;
		s1 = ((String) (exception));
_L1:
		if(file != null)
			try
			{
				((FileInputStream) (file)).close();
			}
	//* 210  397:goto            338
			// Misplaced declaration of an exception variable
			catch(File file) { }
	//  211  400:astore_1        
		if(s1 != null)
			try
			{
				((FileOutputStream) (s1)).close();
			}
	//* 212  401:goto            353
			// Misplaced declaration of an exception variable
			catch(File file)
	//* 213  404:astore_1        
			{
				return false;
	//  214  405:iconst_0        
	//  215  406:ireturn         
			}
		return false;
		s1;
		s1 = ((String) (exception));
		  goto _L1
		obj;
		  goto _L1
	}

	private final void o()
	{
		Object obj;
		try
		{
			if(g == null && j)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field AdvertisingIdClient g>
	//*   2    4:ifnonnull       35
	//*   3    7:aload_0         
	//*   4    8:getfield        #72  <Field boolean j>
	//*   5   11:ifeq            35
			{
				AdvertisingIdClient advertisingidclient = new AdvertisingIdClient(a);
	//    6   14:new             #399 <Class AdvertisingIdClient>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:getfield        #74  <Field Context a>
	//   10   22:invokespecial   #400 <Method void AdvertisingIdClient(Context)>
	//   11   25:astore_1        
				advertisingidclient.start();
	//   12   26:aload_1         
	//   13   27:invokevirtual   #403 <Method void AdvertisingIdClient.start()>
				g = advertisingidclient;
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:putfield        #46  <Field AdvertisingIdClient g>
			}
			return;
	//   17   35:return          
		}
	//*  18   36:aload_0         
	//*  19   37:aconst_null     
	//*  20   38:putfield        #46  <Field AdvertisingIdClient g>
	//*  21   41:return          
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			g = null;
		}
	//*  22   42:astore_1        
	//*  23   43:goto            36
	}

	private final akh p()
	{
		Throwable throwable;
		Object obj;
		try
		{
			obj = ((Object) (a.getPackageManager().getPackageInfo(a.getPackageName(), 0)));
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Context a>
	//    2    4:invokevirtual   #408 <Method PackageManager Context.getPackageManager()>
	//    3    7:aload_0         
	//    4    8:getfield        #74  <Field Context a>
	//    5   11:invokevirtual   #411 <Method String Context.getPackageName()>
	//    6   14:iconst_0        
	//    7   15:invokevirtual   #417 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    8   18:astore_1        
			obj = ((Object) (ail.a(a, a.getPackageName(), Integer.toString(((PackageInfo) (obj)).versionCode))));
	//    9   19:aload_0         
	//   10   20:getfield        #74  <Field Context a>
	//   11   23:aload_0         
	//   12   24:getfield        #74  <Field Context a>
	//   13   27:invokevirtual   #411 <Method String Context.getPackageName()>
	//   14   30:aload_1         
	//   15   31:getfield        #423 <Field int PackageInfo.versionCode>
	//   16   34:invokestatic    #429 <Method String Integer.toString(int)>
	//   17   37:invokestatic    #434 <Method akh ail.a(Context, String, String)>
	//   18   40:astore_1        
		}
	//*  19   41:aload_1         
	//*  20   42:areturn         
	//*  21   43:aconst_null     
	//*  22   44:areturn         
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			return null;
		}
		return ((akh) (obj));
	//*  23   45:astore_1        
	//*  24   46:goto            43
	}

	public final Context a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Context a>
	//    2    4:areturn         
	}

	public final Method a(String s1, String s2)
	{
		s1 = ((String) ((bce)p.get(((Object) (new Pair(((Object) (s1)), ((Object) (s2))))))));
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Map p>
	//    2    4:new             #437 <Class Pair>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #440 <Method void Pair(Object, Object)>
	//    7   13:invokeinterface #446 <Method Object Map.get(Object)>
	//    8   18:checkcast       #448 <Class bce>
	//    9   21:astore_1        
		if(s1 == null)
	//*  10   22:aload_1         
	//*  11   23:ifnonnull       28
			return null;
	//   12   26:aconst_null     
	//   13   27:areturn         
		else
			return ((bce) (s1)).a();
	//   14   28:aload_1         
	//   15   29:invokevirtual   #451 <Method Method bce.a()>
	//   16   32:areturn         
	}

	final void a(int i1, boolean flag)
	{
		if(!o)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field boolean o>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		Future future = c.submit(((Runnable) (new baz(this, i1, flag))));
	//    4    8:aload_0         
	//    5    9:getfield        #106 <Field ExecutorService c>
	//    6   12:new             #453 <Class baz>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:iload_2         
	//   11   19:invokespecial   #456 <Method void baz(bav, int, boolean)>
	//   12   22:invokeinterface #117 <Method Future ExecutorService.submit(Runnable)>
	//   13   27:astore_3        
		if(i1 == 0)
	//*  14   28:iload_1         
	//*  15   29:ifne            37
			l = future;
	//   16   32:aload_0         
	//   17   33:aload_3         
	//   18   34:putfield        #54  <Field Future l>
	//   19   37:return          
	}

	public final transient boolean a(String s1, String s2, Class aclass[])
	{
		if(!p.containsKey(((Object) (new Pair(((Object) (s1)), ((Object) (s2)))))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field Map p>
	//*   2    4:new             #437 <Class Pair>
	//*   3    7:dup             
	//*   4    8:aload_1         
	//*   5    9:aload_2         
	//*   6   10:invokespecial   #440 <Method void Pair(Object, Object)>
	//*   7   13:invokeinterface #460 <Method boolean Map.containsKey(Object)>
	//*   8   18:ifne            53
		{
			p.put(((Object) (new Pair(((Object) (s1)), ((Object) (s2))))), ((Object) (new bce(this, s1, s2, aclass))));
	//    9   21:aload_0         
	//   10   22:getfield        #79  <Field Map p>
	//   11   25:new             #437 <Class Pair>
	//   12   28:dup             
	//   13   29:aload_1         
	//   14   30:aload_2         
	//   15   31:invokespecial   #440 <Method void Pair(Object, Object)>
	//   16   34:new             #448 <Class bce>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:aload_2         
	//   21   41:aload_3         
	//   22   42:invokespecial   #463 <Method void bce(bav, String, String, Class[])>
	//   23   45:invokeinterface #467 <Method Object Map.put(Object, Object)>
	//   24   50:pop             
			return true;
	//   25   51:iconst_1        
	//   26   52:ireturn         
		} else
		{
			return false;
	//   27   53:iconst_0        
	//   28   54:ireturn         
		}
	}

	final akh b(int i1, boolean flag)
	{
		if(i1 > 0 && flag)
	//*   0    0:iload_1         
	//*   1    1:ifle            19
	//*   2    4:iload_2         
	//*   3    5:ifeq            19
		{
			long l1 = i1 * 1000;
	//    4    8:iload_1         
	//    5    9:sipush          1000
	//    6   12:imul            
	//    7   13:i2l             
	//    8   14:lstore_3        
			try
			{
				Thread.sleep(l1);
	//    9   15:lload_3         
	//   10   16:invokestatic    #476 <Method void Thread.sleep(long)>
			}
	//*  11   19:aload_0         
	//*  12   20:invokespecial   #478 <Method akh p()>
	//*  13   23:areturn         
			catch(InterruptedException interruptedexception) { }
	//   14   24:astore          5
		}
		return p();
	//*  15   26:goto            19
	}

	public final boolean b()
	{
		return q;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field boolean q>
	//    2    4:ireturn         
	}

	public final ExecutorService c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field ExecutorService c>
	//    2    4:areturn         
	}

	public final DexClassLoader d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field DexClassLoader d>
	//    2    4:areturn         
	}

	public final baf e()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #177 <Field baf e>
	//    2    4:areturn         
	}

	public final byte[] f()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field byte[] f>
	//    2    4:areturn         
	}

	public final boolean g()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field boolean n>
	//    2    4:ireturn         
	}

	public final azx h()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #278 <Field azx m>
	//    2    4:areturn         
	}

	public final boolean i()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field boolean o>
	//    2    4:ireturn         
	}

	public final boolean j()
	{
		return r;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field boolean r>
	//    2    4:ireturn         
	}

	public final akh k()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field akh k>
	//    2    4:areturn         
	}

	public final Future l()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Future l>
	//    2    4:areturn         
	}

	public final AdvertisingIdClient m()
	{
		Future future;
		if(!h)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field boolean h>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(g != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #46  <Field AdvertisingIdClient g>
	//*   7   13:ifnull          21
			return g;
	//    8   16:aload_0         
	//    9   17:getfield        #46  <Field AdvertisingIdClient g>
	//   10   20:areturn         
		future = i;
	//   11   21:aload_0         
	//   12   22:getfield        #50  <Field Future i>
	//   13   25:astore_1        
		if(future == null)
			break MISSING_BLOCK_LABEL_62;
	//   14   26:aload_1         
	//   15   27:ifnull          62
		try
		{
			future.get(2000L, TimeUnit.MILLISECONDS);
	//   16   30:aload_1         
	//   17   31:ldc2w           #489 <Long 2000L>
	//   18   34:getstatic       #496 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   19   37:invokeinterface #501 <Method Object Future.get(long, TimeUnit)>
	//   20   42:pop             
			i = null;
	//   21   43:aload_0         
	//   22   44:aconst_null     
	//   23   45:putfield        #50  <Field Future i>
		}
	//*  24   48:goto            62
	//*  25   51:aload_0         
	//*  26   52:getfield        #50  <Field Future i>
	//*  27   55:iconst_1        
	//*  28   56:invokeinterface #505 <Method boolean Future.cancel(boolean)>
	//*  29   61:pop             
	//*  30   62:aload_0         
	//*  31   63:getfield        #46  <Field AdvertisingIdClient g>
	//*  32   66:areturn         
		catch(Object obj) { }
	//   33   67:astore_1        
	//*  34   68:goto            62
		// Misplaced declaration of an exception variable
		catch(TimeoutException timeoutexception)
		{
			i.cancel(true);
		}
		TimeoutException timeoutexception;
		return g;
	//*  35   71:astore_1        
	//*  36   72:goto            51
	}

	public final int n()
	{
		if(m != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #278 <Field azx m>
	//*   2    4:ifnull          11
			return azx.a();
	//    3    7:invokestatic    #508 <Method int azx.a()>
	//    4   10:ireturn         
		else
			return 0x80000000;
	//    5   11:ldc2            #509 <Int 0x80000000>
	//    6   14:ireturn         
	}

	private static final String b = "bav";
	protected Context a;
	private ExecutorService c;
	private DexClassLoader d;
	private baf e;
	private byte f[];
	private volatile AdvertisingIdClient g;
	private volatile boolean h;
	private Future i;
	private boolean j;
	private volatile akh k;
	private Future l;
	private azx m;
	private boolean n;
	private boolean o;
	private Map p;
	private boolean q;
	private boolean r;
	private boolean s;

	static 
	{
	//    0    0:return          
	}
}
