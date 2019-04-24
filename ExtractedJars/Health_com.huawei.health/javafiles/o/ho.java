// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.app.Activity;
import android.content.*;

// Referenced classes of package o:
//			br, hn, hm, hr, 
//			ft, gm, fx, bq

public class ho
{
	public static interface d
	{

		public abstract void c();
	}


	public ho(Activity activity, d d1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:ldc1            #27  <Class br>
	//    4    7:putfield        #29  <Field Object a>
		i = ((ServiceConnection) (new hn(this)));
	//    5   10:aload_0         
	//    6   11:new             #31  <Class hn>
	//    7   14:dup             
	//    8   15:aload_0         
	//    9   16:invokespecial   #34  <Method void hn(ho)>
	//   10   19:putfield        #36  <Field ServiceConnection i>
		h = ((bq) (new hm(this)));
	//   11   22:aload_0         
	//   12   23:new             #38  <Class hm>
	//   13   26:dup             
	//   14   27:aload_0         
	//   15   28:invokespecial   #39  <Method void hm(ho)>
	//   16   31:putfield        #41  <Field bq h>
		c = activity;
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:putfield        #43  <Field Activity c>
		e = d1;
	//   20   39:aload_0         
	//   21   40:aload_2         
	//   22   41:putfield        #45  <Field ho$d e>
	//   23   44:return          
	}

	static Object c(ho ho1)
	{
		return ho1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Object a>
	//    2    4:areturn         
	}

	private String c(String s)
	{
		String s1;
		Intent intent = new Intent();
	//    0    0:new             #54  <Class Intent>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void Intent()>
	//    3    7:astore_3        
		s1 = hr.c();
	//    4    8:invokestatic    #60  <Method String hr.c()>
	//    5   11:astore_2        
		intent.setPackage(s1);
	//    6   12:aload_3         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #64  <Method Intent Intent.setPackage(String)>
	//    9   17:pop             
		intent.setAction((new StringBuilder()).append(s1).append(".IAlixPay").toString());
	//   10   18:aload_3         
	//   11   19:new             #66  <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #67  <Method void StringBuilder()>
	//   14   26:aload_2         
	//   15   27:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:ldc1            #73  <String ".IAlixPay">
	//   17   32:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   19   38:invokevirtual   #79  <Method Intent Intent.setAction(String)>
	//   20   41:pop             
		s1 = hr.g(((Context) (c)));
	//   21   42:aload_0         
	//   22   43:getfield        #43  <Field Activity c>
	//   23   46:invokestatic    #83  <Method String hr.g(Context)>
	//   24   49:astore_2        
		try
		{
			if(!c.getApplicationContext().bindService(intent, i, 1))
	//*  25   50:aload_0         
	//*  26   51:getfield        #43  <Field Activity c>
	//*  27   54:invokevirtual   #89  <Method Context Activity.getApplicationContext()>
	//*  28   57:aload_3         
	//*  29   58:aload_0         
	//*  30   59:getfield        #36  <Field ServiceConnection i>
	//*  31   62:iconst_1        
	//*  32   63:invokevirtual   #95  <Method boolean Context.bindService(Intent, ServiceConnection, int)>
	//*  33   66:ifne            79
				throw new Throwable("bindService fail");
	//   34   69:new             #50  <Class Throwable>
	//   35   72:dup             
	//   36   73:ldc1            #97  <String "bindService fail">
	//   37   75:invokespecial   #100 <Method void Throwable(String)>
	//   38   78:athrow          
		}
	//*  39   79:goto            94
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  40   82:astore_1        
		{
			ft.e("biz", "ClientBindServiceFailed", ((Throwable) (s)));
	//   41   83:ldc1            #102 <String "biz">
	//   42   85:ldc1            #104 <String "ClientBindServiceFailed">
	//   43   87:aload_1         
	//   44   88:invokestatic    #109 <Method void ft.e(String, String, Throwable)>
			return "failed";
	//   45   91:ldc1            #111 <String "failed">
	//   46   93:areturn         
		}
		Object obj = a;
	//   47   94:aload_0         
	//   48   95:getfield        #29  <Field Object a>
	//   49   98:astore_3        
		obj;
	//   50   99:aload_3         
		JVM INSTR monitorenter ;
	//   51  100:monitorenter    
		br br1 = b;
	//   52  101:aload_0         
	//   53  102:getfield        #113 <Field br b>
	//   54  105:astore          4
		if(br1 != null)
			break MISSING_BLOCK_LABEL_140;
	//   55  107:aload           4
	//   56  109:ifnonnull       140
		a.wait(gm.e().c());
	//   57  112:aload_0         
	//   58  113:getfield        #29  <Field Object a>
	//   59  116:invokestatic    #118 <Method gm gm.e()>
	//   60  119:invokevirtual   #121 <Method int gm.c()>
	//   61  122:i2l             
	//   62  123:invokevirtual   #125 <Method void Object.wait(long)>
		break MISSING_BLOCK_LABEL_140;
	//   63  126:goto            140
		InterruptedException interruptedexception;
		interruptedexception;
	//   64  129:astore          4
		ft.e("biz", "BindWaitTimeoutEx", ((Throwable) (interruptedexception)));
	//   65  131:ldc1            #102 <String "biz">
	//   66  133:ldc1            #127 <String "BindWaitTimeoutEx">
	//   67  135:aload           4
	//   68  137:invokestatic    #109 <Method void ft.e(String, String, Throwable)>
		obj;
	//   69  140:aload_3         
		JVM INSTR monitorexit ;
	//   70  141:monitorexit     
		break MISSING_BLOCK_LABEL_150;
	//   71  142:goto            150
		s;
	//   72  145:astore_1        
	//*  73  146:aload_3         
		throw s;
	//   74  147:monitorexit     
	//   75  148:aload_1         
	//   76  149:athrow          
		if(b != null)
			break MISSING_BLOCK_LABEL_289;
	//   77  150:aload_0         
	//   78  151:getfield        #113 <Field br b>
	//   79  154:ifnonnull       289
		s = hr.g(((Context) (c)));
	//   80  157:aload_0         
	//   81  158:getfield        #43  <Field Activity c>
	//   82  161:invokestatic    #83  <Method String hr.g(Context)>
	//   83  164:astore_1        
		String s3 = hr.h(((Context) (c)));
	//   84  165:aload_0         
	//   85  166:getfield        #43  <Field Activity c>
	//   86  169:invokestatic    #129 <Method String hr.h(Context)>
	//   87  172:astore_3        
		ft.b("biz", "ClientBindFailed", (new StringBuilder()).append(s1).append("|").append(s).append("|").append(s3).toString());
	//   88  173:ldc1            #102 <String "biz">
	//   89  175:ldc1            #131 <String "ClientBindFailed">
	//   90  177:new             #66  <Class StringBuilder>
	//   91  180:dup             
	//   92  181:invokespecial   #67  <Method void StringBuilder()>
	//   93  184:aload_2         
	//   94  185:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   95  188:ldc1            #133 <String "|">
	//   96  190:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   97  193:aload_1         
	//   98  194:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   99  197:ldc1            #133 <String "|">
	//  100  199:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//  101  202:aload_3         
	//  102  203:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//  103  206:invokevirtual   #76  <Method String StringBuilder.toString()>
	//  104  209:invokestatic    #136 <Method void ft.b(String, String, String)>
		String s2;
		try
		{
			b.c(h);
	//  105  212:aload_0         
	//  106  213:getfield        #113 <Field br b>
	//  107  216:aload_0         
	//  108  217:getfield        #41  <Field bq h>
	//  109  220:invokeinterface #139 <Method void br.c(bq)>
		}
	//* 110  225:aload_0         
	//* 111  226:getfield        #43  <Field Activity c>
	//* 112  229:invokevirtual   #89  <Method Context Activity.getApplicationContext()>
	//* 113  232:aload_0         
	//* 114  233:getfield        #36  <Field ServiceConnection i>
	//* 115  236:invokevirtual   #143 <Method void Context.unbindService(ServiceConnection)>
	//* 116  239:aload_0         
	//* 117  240:aconst_null     
	//* 118  241:putfield        #45  <Field ho$d e>
	//* 119  244:aload_0         
	//* 120  245:aconst_null     
	//* 121  246:putfield        #41  <Field bq h>
	//* 122  249:aload_0         
	//* 123  250:aconst_null     
	//* 124  251:putfield        #36  <Field ServiceConnection i>
	//* 125  254:aload_0         
	//* 126  255:aconst_null     
	//* 127  256:putfield        #113 <Field br b>
	//* 128  259:aload_0         
	//* 129  260:getfield        #145 <Field boolean d>
	//* 130  263:ifeq            286
	//* 131  266:aload_0         
	//* 132  267:getfield        #43  <Field Activity c>
	//* 133  270:ifnull          286
	//* 134  273:aload_0         
	//* 135  274:getfield        #43  <Field Activity c>
	//* 136  277:iconst_0        
	//* 137  278:invokevirtual   #149 <Method void Activity.setRequestedOrientation(int)>
	//* 138  281:aload_0         
	//* 139  282:iconst_0        
	//* 140  283:putfield        #145 <Field boolean d>
	//* 141  286:ldc1            #111 <String "failed">
	//* 142  288:areturn         
	//* 143  289:aload_0         
	//* 144  290:getfield        #45  <Field ho$d e>
	//* 145  293:ifnull          305
	//* 146  296:aload_0         
	//* 147  297:getfield        #45  <Field ho$d e>
	//* 148  300:invokeinterface #151 <Method void ho$d.c()>
	//* 149  305:aload_0         
	//* 150  306:getfield        #43  <Field Activity c>
	//* 151  309:invokevirtual   #154 <Method int Activity.getRequestedOrientation()>
	//* 152  312:ifne            328
	//* 153  315:aload_0         
	//* 154  316:getfield        #43  <Field Activity c>
	//* 155  319:iconst_1        
	//* 156  320:invokevirtual   #149 <Method void Activity.setRequestedOrientation(int)>
	//* 157  323:aload_0         
	//* 158  324:iconst_1        
	//* 159  325:putfield        #145 <Field boolean d>
	//* 160  328:aload_0         
	//* 161  329:getfield        #113 <Field br b>
	//* 162  332:aload_0         
	//* 163  333:getfield        #41  <Field bq h>
	//* 164  336:invokeinterface #156 <Method void br.e(bq)>
	//* 165  341:aload_0         
	//* 166  342:getfield        #113 <Field br b>
	//* 167  345:aload_1         
	//* 168  346:invokeinterface #158 <Method String br.c(String)>
	//* 169  351:astore_1        
	//* 170  352:aload_0         
	//* 171  353:getfield        #113 <Field br b>
	//* 172  356:aload_0         
	//* 173  357:getfield        #41  <Field bq h>
	//* 174  360:invokeinterface #139 <Method void br.c(bq)>
	//* 175  365:aload_0         
	//* 176  366:getfield        #43  <Field Activity c>
	//* 177  369:invokevirtual   #89  <Method Context Activity.getApplicationContext()>
	//* 178  372:aload_0         
	//* 179  373:getfield        #36  <Field ServiceConnection i>
	//* 180  376:invokevirtual   #143 <Method void Context.unbindService(ServiceConnection)>
	//* 181  379:aload_0         
	//* 182  380:aconst_null     
	//* 183  381:putfield        #45  <Field ho$d e>
	//* 184  384:aload_0         
	//* 185  385:aconst_null     
	//* 186  386:putfield        #41  <Field bq h>
	//* 187  389:aload_0         
	//* 188  390:aconst_null     
	//* 189  391:putfield        #36  <Field ServiceConnection i>
	//* 190  394:aload_0         
	//* 191  395:aconst_null     
	//* 192  396:putfield        #113 <Field br b>
	//* 193  399:aload_1         
	//* 194  400:astore_2        
	//* 195  401:aload_0         
	//* 196  402:getfield        #145 <Field boolean d>
	//* 197  405:ifeq            602
	//* 198  408:aload_1         
	//* 199  409:astore_2        
	//* 200  410:aload_0         
	//* 201  411:getfield        #43  <Field Activity c>
	//* 202  414:ifnull          602
	//* 203  417:aload_0         
	//* 204  418:getfield        #43  <Field Activity c>
	//* 205  421:iconst_0        
	//* 206  422:invokevirtual   #149 <Method void Activity.setRequestedOrientation(int)>
	//* 207  425:aload_0         
	//* 208  426:iconst_0        
	//* 209  427:putfield        #145 <Field boolean d>
	//* 210  430:aload_1         
	//* 211  431:areturn         
	//* 212  432:astore_1        
	//* 213  433:ldc1            #102 <String "biz">
	//* 214  435:ldc1            #160 <String "ClientBindException">
	//* 215  437:aload_1         
	//* 216  438:invokestatic    #109 <Method void ft.e(String, String, Throwable)>
	//* 217  441:invokestatic    #164 <Method String fx.e()>
	//* 218  444:astore_1        
	//* 219  445:aload_0         
	//* 220  446:getfield        #113 <Field br b>
	//* 221  449:aload_0         
	//* 222  450:getfield        #41  <Field bq h>
	//* 223  453:invokeinterface #139 <Method void br.c(bq)>
	//* 224  458:aload_0         
	//* 225  459:getfield        #43  <Field Activity c>
	//* 226  462:invokevirtual   #89  <Method Context Activity.getApplicationContext()>
	//* 227  465:aload_0         
	//* 228  466:getfield        #36  <Field ServiceConnection i>
	//* 229  469:invokevirtual   #143 <Method void Context.unbindService(ServiceConnection)>
	//* 230  472:aload_0         
	//* 231  473:aconst_null     
	//* 232  474:putfield        #45  <Field ho$d e>
	//* 233  477:aload_0         
	//* 234  478:aconst_null     
	//* 235  479:putfield        #41  <Field bq h>
	//* 236  482:aload_0         
	//* 237  483:aconst_null     
	//* 238  484:putfield        #36  <Field ServiceConnection i>
	//* 239  487:aload_0         
	//* 240  488:aconst_null     
	//* 241  489:putfield        #113 <Field br b>
	//* 242  492:aload_1         
	//* 243  493:astore_2        
	//* 244  494:aload_0         
	//* 245  495:getfield        #145 <Field boolean d>
	//* 246  498:ifeq            602
	//* 247  501:aload_1         
	//* 248  502:astore_2        
	//* 249  503:aload_0         
	//* 250  504:getfield        #43  <Field Activity c>
	//* 251  507:ifnull          602
	//* 252  510:aload_0         
	//* 253  511:getfield        #43  <Field Activity c>
	//* 254  514:iconst_0        
	//* 255  515:invokevirtual   #149 <Method void Activity.setRequestedOrientation(int)>
	//* 256  518:aload_0         
	//* 257  519:iconst_0        
	//* 258  520:putfield        #145 <Field boolean d>
	//* 259  523:aload_1         
	//* 260  524:areturn         
	//* 261  525:astore_1        
	//* 262  526:aload_0         
	//* 263  527:getfield        #113 <Field br b>
	//* 264  530:aload_0         
	//* 265  531:getfield        #41  <Field bq h>
	//* 266  534:invokeinterface #139 <Method void br.c(bq)>
	//* 267  539:aload_0         
	//* 268  540:getfield        #43  <Field Activity c>
	//* 269  543:invokevirtual   #89  <Method Context Activity.getApplicationContext()>
	//* 270  546:aload_0         
	//* 271  547:getfield        #36  <Field ServiceConnection i>
	//* 272  550:invokevirtual   #143 <Method void Context.unbindService(ServiceConnection)>
	//* 273  553:aload_0         
	//* 274  554:aconst_null     
	//* 275  555:putfield        #45  <Field ho$d e>
	//* 276  558:aload_0         
	//* 277  559:aconst_null     
	//* 278  560:putfield        #41  <Field bq h>
	//* 279  563:aload_0         
	//* 280  564:aconst_null     
	//* 281  565:putfield        #36  <Field ServiceConnection i>
	//* 282  568:aload_0         
	//* 283  569:aconst_null     
	//* 284  570:putfield        #113 <Field br b>
	//* 285  573:aload_0         
	//* 286  574:getfield        #145 <Field boolean d>
	//* 287  577:ifeq            600
	//* 288  580:aload_0         
	//* 289  581:getfield        #43  <Field Activity c>
	//* 290  584:ifnull          600
	//* 291  587:aload_0         
	//* 292  588:getfield        #43  <Field Activity c>
	//* 293  591:iconst_0        
	//* 294  592:invokevirtual   #149 <Method void Activity.setRequestedOrientation(int)>
	//* 295  595:aload_0         
	//* 296  596:iconst_0        
	//* 297  597:putfield        #145 <Field boolean d>
	//* 298  600:aload_1         
	//* 299  601:athrow          
	//* 300  602:aload_2         
	//* 301  603:areturn         
		// Misplaced declaration of an exception variable
		catch(String s) { }
	//  302  604:astore_1        
		try
		{
			c.getApplicationContext().unbindService(i);
		}
	//* 303  605:goto            225
		// Misplaced declaration of an exception variable
		catch(String s) { }
	//  304  608:astore_1        
		e = null;
		h = null;
		i = null;
		b = null;
		if(d && c != null)
		{
			c.setRequestedOrientation(0);
			d = false;
		}
		return "failed";
		if(e != null)
			e.c();
		if(c.getRequestedOrientation() == 0)
		{
			c.setRequestedOrientation(1);
			d = true;
		}
		b.e(h);
		s = b.c(s);
		try
		{
			b.c(h);
		}
	//* 305  609:goto            239
		catch(Throwable throwable) { }
	//  306  612:astore_2        
		try
		{
			c.getApplicationContext().unbindService(i);
		}
	//* 307  613:goto            365
		catch(Throwable throwable1) { }
	//  308  616:astore_2        
		e = null;
		h = null;
		i = null;
		b = null;
		s2 = s;
		if(d)
		{
			s2 = s;
			if(c != null)
			{
				c.setRequestedOrientation(0);
				d = false;
				return s;
			}
		}
		break MISSING_BLOCK_LABEL_602;
	//  309  617:goto            379
		s;
		ft.e("biz", "ClientBindException", ((Throwable) (s)));
		s = fx.e();
		try
		{
			b.c(h);
		}
		catch(Throwable throwable2) { }
	//  310  620:astore_2        
		try
		{
			c.getApplicationContext().unbindService(i);
		}
	//* 311  621:goto            458
		catch(Throwable throwable3) { }
	//  312  624:astore_2        
		e = null;
		h = null;
		i = null;
		b = null;
		s2 = s;
		if(d)
		{
			s2 = s;
			if(c != null)
			{
				c.setRequestedOrientation(0);
				d = false;
				return s;
			}
		}
		break MISSING_BLOCK_LABEL_602;
	//  313  625:goto            472
		s;
		try
		{
			b.c(h);
		}
		catch(Throwable throwable4) { }
	//  314  628:astore_2        
		try
		{
			c.getApplicationContext().unbindService(i);
		}
	//* 315  629:goto            539
		catch(Throwable throwable5) { }
	//  316  632:astore_2        
		e = null;
		h = null;
		i = null;
		b = null;
		if(d && c != null)
		{
			c.setRequestedOrientation(0);
			d = false;
		}
		throw s;
		return s2;
	//* 317  633:goto            553
	}

	static br c(ho ho1, br br1)
	{
		ho1.b = br1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #113 <Field br b>
		return br1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static Activity d(ho ho1)
	{
		return ho1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Activity c>
	//    2    4:areturn         
	}

	public final String a(String s)
	{
		boolean flag;
		hr.a a1;
		a1 = hr.d(((Context) (c)));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Activity c>
	//    2    4:invokestatic    #169 <Method hr$a hr.d(Context)>
	//    3    7:astore_3        
		flag = a1.b();
	//    4    8:aload_3         
	//    5    9:invokevirtual   #174 <Method boolean hr$a.b()>
	//    6   12:istore_2        
		if(flag)
	//*   7   13:iload_2         
	//*   8   14:ifeq            20
			return "failed";
	//    9   17:ldc1            #111 <String "failed">
	//   10   19:areturn         
		if(a1 == null)
			break MISSING_BLOCK_LABEL_85;
	//   11   20:aload_3         
	//   12   21:ifnull          91
		if(a1.d > 78)
	//*  13   24:aload_3         
	//*  14   25:getfield        #177 <Field int hr$a.d>
	//*  15   28:bipush          78
	//*  16   30:icmpgt          36
	//*  17   33:goto            91
			try
			{
				String s1 = hr.c();
	//   18   36:invokestatic    #60  <Method String hr.c()>
	//   19   39:astore_3        
				Intent intent = new Intent();
	//   20   40:new             #54  <Class Intent>
	//   21   43:dup             
	//   22   44:invokespecial   #55  <Method void Intent()>
	//   23   47:astore          4
				intent.setClassName(s1, "com.alipay.android.app.TransProcessPayActivity");
	//   24   49:aload           4
	//   25   51:aload_3         
	//   26   52:ldc1            #179 <String "com.alipay.android.app.TransProcessPayActivity">
	//   27   54:invokevirtual   #183 <Method Intent Intent.setClassName(String, String)>
	//   28   57:pop             
				c.startActivity(intent);
	//   29   58:aload_0         
	//   30   59:getfield        #43  <Field Activity c>
	//   31   62:aload           4
	//   32   64:invokevirtual   #187 <Method void Activity.startActivity(Intent)>
				Thread.sleep(200L);
	//   33   67:ldc2w           #188 <Long 200L>
	//   34   70:invokestatic    #194 <Method void Thread.sleep(long)>
			}
	//*  35   73:goto            85
			catch(Throwable throwable)
	//*  36   76:astore_3        
			{
				ft.e("biz", "CheckClientSignEx", throwable);
	//   37   77:ldc1            #102 <String "biz">
	//   38   79:ldc1            #196 <String "CheckClientSignEx">
	//   39   81:aload_3         
	//   40   82:invokestatic    #109 <Method void ft.e(String, String, Throwable)>
			}
		return c(s);
	//   41   85:aload_0         
	//   42   86:aload_1         
	//   43   87:invokespecial   #197 <Method String c(String)>
	//   44   90:areturn         
	//*  45   91:goto            85
	}

	private final Object a = o/br;
	private br b;
	public Activity c;
	private boolean d;
	private d e;
	private bq h;
	private ServiceConnection i;
}
