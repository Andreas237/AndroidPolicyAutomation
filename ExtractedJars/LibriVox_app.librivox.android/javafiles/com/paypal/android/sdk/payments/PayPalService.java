// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk.payments;

import android.app.Service;
import android.content.*;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.paypal.android.sdk.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk.payments:
//			a, dg, bc, bf, 
//			bd, az, PayPalConfiguration, cd, 
//			bj, dh, bh, PayPalItem, 
//			bi, c, bk, be

public final class PayPalService extends Service
{

	public PayPalService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void Service()>
		h = new com.paypal.android.sdk.payments.a();
	//    2    4:aload_0         
	//    3    5:new             #60  <Class com.paypal.android.sdk.payments.a>
	//    4    8:dup             
	//    5    9:invokespecial   #61  <Method void com.paypal.android.sdk.payments.a()>
	//    6   12:putfield        #63  <Field com.paypal.android.sdk.payments.a h>
		i = new com.paypal.android.sdk.payments.a();
	//    7   15:aload_0         
	//    8   16:new             #60  <Class com.paypal.android.sdk.payments.a>
	//    9   19:dup             
	//   10   20:invokespecial   #61  <Method void com.paypal.android.sdk.payments.a()>
	//   11   23:putfield        #65  <Field com.paypal.android.sdk.payments.a i>
		j = ((com.paypal.android.sdk.payments.dh) (new dg(this)));
	//   12   26:aload_0         
	//   13   27:new             #67  <Class dg>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:invokespecial   #70  <Method void dg(PayPalService)>
	//   17   35:putfield        #72  <Field com.paypal.android.sdk.payments.dh j>
		q = ((List) (new ArrayList()));
	//   18   38:aload_0         
	//   19   39:new             #74  <Class ArrayList>
	//   20   42:dup             
	//   21   43:invokespecial   #75  <Method void ArrayList()>
	//   22   46:putfield        #77  <Field List q>
		r = true;
	//   23   49:aload_0         
	//   24   50:iconst_1        
	//   25   51:putfield        #79  <Field boolean r>
		s = true;
	//   26   54:aload_0         
	//   27   55:iconst_1        
	//   28   56:putfield        #81  <Field boolean s>
	//   29   59:aload_0         
	//   30   60:new             #83  <Class bc>
	//   31   63:dup             
	//   32   64:aload_0         
	//   33   65:invokespecial   #84  <Method void bc(PayPalService)>
	//   34   68:putfield        #86  <Field BroadcastReceiver u>
	//   35   71:aload_0         
	//   36   72:new             #88  <Class bf>
	//   37   75:dup             
	//   38   76:aload_0         
	//   39   77:invokespecial   #89  <Method void bf(PayPalService)>
	//   40   80:putfield        #91  <Field IBinder v>
	//   41   83:return          
	}

	private boolean A()
	{
		return f != null && e != null;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field PayPalConfiguration f>
	//    2    4:ifnull          16
	//    3    7:aload_0         
	//    4    8:getfield        #97  <Field ck e>
	//    5   11:ifnull          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	private static ck B()
	{
		return new ck();
	//    0    0:new             #101 <Class ck>
	//    1    3:dup             
	//    2    4:invokespecial   #102 <Method void ck()>
	//    3    7:areturn         
	}

	private void C()
	{
		a(((bh) (new com.paypal.android.sdk.payments.bd(this))), false);
	//    0    0:aload_0         
	//    1    1:new             #105 <Class com.paypal.android.sdk.payments.bd>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #106 <Method void com.paypal.android.sdk.payments.bd(PayPalService)>
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #109 <Method void a(bh, boolean)>
	//    7   13:return          
	}

	static PayPalConfiguration a(PayPalService paypalservice)
	{
		return paypalservice.f;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field PayPalConfiguration f>
	//    2    4:areturn         
	}

	static bh a(PayPalService paypalservice, bh bh1)
	{
		paypalservice.m = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #113 <Field bh m>
		return null;
	//    3    5:aconst_null     
	//    4    6:areturn         
	}

	public static void a(Context context)
	{
		Log.w("paypal.sdk", "clearing user data");
	//    0    0:ldc1            #116 <String "paypal.sdk">
	//    1    2:ldc1            #118 <String "clearing user data">
	//    2    4:invokestatic    #124 <Method int Log.w(String, String)>
	//    3    7:pop             
		a.submit(((Runnable) (new az(context))));
	//    4    8:getstatic       #54  <Field ExecutorService a>
	//    5   11:new             #126 <Class az>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #128 <Method void az(Context)>
	//    9   19:invokeinterface #134 <Method java.util.concurrent.Future ExecutorService.submit(Runnable)>
	//   10   24:pop             
	//   11   25:return          
	}

	private void a(Intent intent)
	{
label0:
		{
			Object obj1;
label1:
			{
				t = intent;
	//    0    0:aload_1         
	//    1    1:putstatic       #137 <Field Intent t>
				(new StringBuilder("init:")).append(b(intent));
	//    2    4:new             #139 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:ldc1            #141 <String "init:">
	//    5   10:invokespecial   #144 <Method void StringBuilder(String)>
	//    6   13:aload_1         
	//    7   14:invokestatic    #147 <Method String b(Intent)>
	//    8   17:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
				if(f == null)
	//*  10   21:aload_0         
	//*  11   22:getfield        #95  <Field PayPalConfiguration f>
	//*  12   25:ifnonnull       61
				{
					f = (PayPalConfiguration)intent.getParcelableExtra("com.paypal.android.sdk.paypalConfiguration");
	//   13   28:aload_0         
	//   14   29:aload_1         
	//   15   30:ldc1            #153 <String "com.paypal.android.sdk.paypalConfiguration">
	//   16   32:invokevirtual   #159 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   17   35:checkcast       #161 <Class PayPalConfiguration>
	//   18   38:putfield        #95  <Field PayPalConfiguration f>
					if(f == null)
	//*  19   41:aload_0         
	//*  20   42:getfield        #95  <Field PayPalConfiguration f>
	//*  21   45:ifnull          51
	//*  22   48:goto            61
						throw new RuntimeException("Missing EXTRA_PAYPAL_CONFIGURATION. To avoid this error, set EXTRA_PAYPAL_CONFIGURATION in both PayPalService, and the initializing activity.");
	//   23   51:new             #163 <Class RuntimeException>
	//   24   54:dup             
	//   25   55:ldc1            #165 <String "Missing EXTRA_PAYPAL_CONFIGURATION. To avoid this error, set EXTRA_PAYPAL_CONFIGURATION in both PayPalService, and the initializing activity.">
	//   26   57:invokespecial   #166 <Method void RuntimeException(String)>
	//   27   60:athrow          
				}
				if(!f.o())
					break label0;
	//   28   61:aload_0         
	//   29   62:getfield        #95  <Field PayPalConfiguration f>
	//   30   65:invokevirtual   #168 <Method boolean PayPalConfiguration.o()>
	//   31   68:ifeq            643
				if(f.i() && !cd.d())
	//*  32   71:aload_0         
	//*  33   72:getfield        #95  <Field PayPalConfiguration f>
	//*  34   75:invokevirtual   #170 <Method boolean PayPalConfiguration.i()>
	//*  35   78:ifeq            100
	//*  36   81:invokestatic    #174 <Method boolean cd.d()>
	//*  37   84:ifeq            90
	//*  38   87:goto            100
					throw new RuntimeException("Credit Cards cannot be accepted without card.io dependency. Please check the docs.");
	//   39   90:new             #163 <Class RuntimeException>
	//   40   93:dup             
	//   41   94:ldc1            #176 <String "Credit Cards cannot be accepted without card.io dependency. Please check the docs.">
	//   42   96:invokespecial   #166 <Method void RuntimeException(String)>
	//   43   99:athrow          
				obj1 = ((Object) (f.b()));
	//   44  100:aload_0         
	//   45  101:getfield        #95  <Field PayPalConfiguration f>
	//   46  104:invokevirtual   #179 <Method String PayPalConfiguration.b()>
	//   47  107:astore          7
				Object obj;
				if(at.c(((String) (obj1))))
	//*  48  109:aload           7
	//*  49  111:invokestatic    #184 <Method boolean at.c(String)>
	//*  50  114:ifeq            124
					obj = "https://api-m.paypal.com/v1/";
	//   51  117:ldc1            #186 <String "https://api-m.paypal.com/v1/">
	//   52  119:astore          6
				else
	//*  53  121:goto            176
				if(at.b(((String) (obj1))))
	//*  54  124:aload           7
	//*  55  126:invokestatic    #188 <Method boolean at.b(String)>
	//*  56  129:ifeq            139
					obj = "https://api-m.sandbox.paypal.com/v1/";
	//   57  132:ldc1            #190 <String "https://api-m.sandbox.paypal.com/v1/">
	//   58  134:astore          6
				else
	//*  59  136:goto            176
				if(at.a(((String) (obj1))))
	//*  60  139:aload           7
	//*  61  141:invokestatic    #192 <Method boolean at.a(String)>
	//*  62  144:ifeq            153
				{
					obj = null;
	//   63  147:aconst_null     
	//   64  148:astore          6
				} else
	//*  65  150:goto            176
				{
					if(!z() || !intent.hasExtra("com.paypal.android.sdk.baseEnvironmentUrl"))
						break label1;
	//   66  153:invokestatic    #195 <Method boolean z()>
	//   67  156:ifeq            613
	//   68  159:aload_1         
	//   69  160:ldc1            #197 <String "com.paypal.android.sdk.baseEnvironmentUrl">
	//   70  162:invokevirtual   #200 <Method boolean Intent.hasExtra(String)>
	//   71  165:ifeq            613
					obj = ((Object) (intent.getStringExtra("com.paypal.android.sdk.baseEnvironmentUrl")));
	//   72  168:aload_1         
	//   73  169:ldc1            #197 <String "com.paypal.android.sdk.baseEnvironmentUrl">
	//   74  171:invokevirtual   #204 <Method String Intent.getStringExtra(String)>
	//   75  174:astore          6
				}
				p = new cp(o, f.b());
	//   76  176:aload_0         
	//   77  177:new             #206 <Class cp>
	//   78  180:dup             
	//   79  181:aload_0         
	//   80  182:getfield        #208 <Field a o>
	//   81  185:aload_0         
	//   82  186:getfield        #95  <Field PayPalConfiguration f>
	//   83  189:invokevirtual   #179 <Method String PayPalConfiguration.b()>
	//   84  192:invokespecial   #211 <Method void cp(a, String)>
	//   85  195:putfield        #213 <Field cp p>
				obj = ((Object) (b(((String) (obj1)), ((String) (obj)))));
	//   86  198:aload           7
	//   87  200:aload           6
	//   88  202:invokestatic    #216 <Method au b(String, String)>
	//   89  205:astore          6
				if(l == null)
	//*  90  207:aload_0         
	//*  91  208:getfield        #218 <Field av l>
	//*  92  211:ifnonnull       546
				{
					boolean flag = z();
	//   93  214:invokestatic    #195 <Method boolean z()>
	//   94  217:istore          4
					int j1 = 500;
	//   95  219:sipush          500
	//   96  222:istore_3        
					int i1 = j1;
	//   97  223:iload_3         
	//   98  224:istore_2        
					if(flag)
	//*  99  225:iload           4
	//* 100  227:ifeq            251
					{
						i1 = j1;
	//  101  230:iload_3         
	//  102  231:istore_2        
						if(intent.hasExtra("com.paypal.android.sdk.mockNetworkDelay"))
	//* 103  232:aload_1         
	//* 104  233:ldc1            #220 <String "com.paypal.android.sdk.mockNetworkDelay">
	//* 105  235:invokevirtual   #200 <Method boolean Intent.hasExtra(String)>
	//* 106  238:ifeq            251
							i1 = intent.getIntExtra("com.paypal.android.sdk.mockNetworkDelay", 500);
	//  107  241:aload_1         
	//  108  242:ldc1            #220 <String "com.paypal.android.sdk.mockNetworkDelay">
	//  109  244:sipush          500
	//  110  247:invokevirtual   #224 <Method int Intent.getIntExtra(String, int)>
	//  111  250:istore_2        
					}
					if(z() && intent.hasExtra("com.paypal.android.sdk.mockEnable2fa"))
	//* 112  251:invokestatic    #195 <Method boolean z()>
	//* 113  254:ifeq            278
	//* 114  257:aload_1         
	//* 115  258:ldc1            #226 <String "com.paypal.android.sdk.mockEnable2fa">
	//* 116  260:invokevirtual   #200 <Method boolean Intent.hasExtra(String)>
	//* 117  263:ifeq            278
						flag = intent.getBooleanExtra("com.paypal.android.sdk.mockEnable2fa", false);
	//  118  266:aload_1         
	//  119  267:ldc1            #226 <String "com.paypal.android.sdk.mockEnable2fa">
	//  120  269:iconst_0        
	//  121  270:invokevirtual   #230 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//  122  273:istore          4
					else
	//* 123  275:goto            281
						flag = false;
	//  124  278:iconst_0        
	//  125  279:istore          4
					if(z() && intent.hasExtra("com.paypal.android.sdk.mock2faPhoneNumberCount"))
	//* 126  281:invokestatic    #195 <Method boolean z()>
	//* 127  284:ifeq            307
	//* 128  287:aload_1         
	//* 129  288:ldc1            #232 <String "com.paypal.android.sdk.mock2faPhoneNumberCount">
	//* 130  290:invokevirtual   #200 <Method boolean Intent.hasExtra(String)>
	//* 131  293:ifeq            307
						j1 = intent.getIntExtra("com.paypal.android.sdk.mock2faPhoneNumberCount", 1);
	//  132  296:aload_1         
	//  133  297:ldc1            #232 <String "com.paypal.android.sdk.mock2faPhoneNumberCount">
	//  134  299:iconst_1        
	//  135  300:invokevirtual   #224 <Method int Intent.getIntExtra(String, int)>
	//  136  303:istore_3        
					else
	//* 137  304:goto            309
						j1 = 1;
	//  138  307:iconst_1        
	//  139  308:istore_3        
					r = true;
	//  140  309:aload_0         
	//  141  310:iconst_1        
	//  142  311:putfield        #79  <Field boolean r>
					if(z() && intent.hasExtra("com.paypal.android.sdk.enableAuthenticator"))
	//* 143  314:invokestatic    #195 <Method boolean z()>
	//* 144  317:ifeq            340
	//* 145  320:aload_1         
	//* 146  321:ldc1            #234 <String "com.paypal.android.sdk.enableAuthenticator">
	//* 147  323:invokevirtual   #200 <Method boolean Intent.hasExtra(String)>
	//* 148  326:ifeq            340
						r = intent.getBooleanExtra("com.paypal.android.sdk.enableAuthenticator", true);
	//  149  329:aload_0         
	//  150  330:aload_1         
	//  151  331:ldc1            #234 <String "com.paypal.android.sdk.enableAuthenticator">
	//  152  333:iconst_1        
	//  153  334:invokevirtual   #230 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//  154  337:putfield        #79  <Field boolean r>
					if(z() && intent.hasExtra("com.paypal.android.sdk.enableAuthenticatorSecurity"))
	//* 155  340:invokestatic    #195 <Method boolean z()>
	//* 156  343:ifeq            366
	//* 157  346:aload_1         
	//* 158  347:ldc1            #236 <String "com.paypal.android.sdk.enableAuthenticatorSecurity">
	//* 159  349:invokevirtual   #200 <Method boolean Intent.hasExtra(String)>
	//* 160  352:ifeq            366
						s = intent.getBooleanExtra("com.paypal.android.sdk.enableAuthenticatorSecurity", true);
	//  161  355:aload_0         
	//  162  356:aload_1         
	//  163  357:ldc1            #236 <String "com.paypal.android.sdk.enableAuthenticatorSecurity">
	//  164  359:iconst_1        
	//  165  360:invokevirtual   #230 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//  166  363:putfield        #81  <Field boolean s>
					boolean flag1;
					if(z() && intent.hasExtra("com.paypal.android.sdk.enableStageSsl"))
	//* 167  366:invokestatic    #195 <Method boolean z()>
	//* 168  369:ifeq            393
	//* 169  372:aload_1         
	//* 170  373:ldc1            #238 <String "com.paypal.android.sdk.enableStageSsl">
	//* 171  375:invokevirtual   #200 <Method boolean Intent.hasExtra(String)>
	//* 172  378:ifeq            393
						flag1 = intent.getBooleanExtra("com.paypal.android.sdk.enableStageSsl", true);
	//  173  381:aload_1         
	//  174  382:ldc1            #238 <String "com.paypal.android.sdk.enableStageSsl">
	//  175  384:iconst_1        
	//  176  385:invokevirtual   #230 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//  177  388:istore          5
					else
	//* 178  390:goto            396
						flag1 = true;
	//  179  393:iconst_1        
	//  180  394:istore          5
					l = new av(o, ((au) (obj)), a());
	//  181  396:aload_0         
	//  182  397:new             #240 <Class av>
	//  183  400:dup             
	//  184  401:aload_0         
	//  185  402:getfield        #208 <Field a o>
	//  186  405:aload           6
	//  187  407:aload_0         
	//  188  408:invokevirtual   #243 <Method ab a()>
	//  189  411:invokespecial   #246 <Method void av(a, au, ab)>
	//  190  414:putfield        #218 <Field av l>
					l.a(((com.paypal.android.sdk.bb) (new df(((com.paypal.android.sdk.de) (new bj(this, (byte)0)))))));
	//  191  417:aload_0         
	//  192  418:getfield        #218 <Field av l>
	//  193  421:new             #248 <Class df>
	//  194  424:dup             
	//  195  425:new             #250 <Class bj>
	//  196  428:dup             
	//  197  429:aload_0         
	//  198  430:iconst_0        
	//  199  431:invokespecial   #253 <Method void bj(PayPalService, byte)>
	//  200  434:invokespecial   #256 <Method void df(com.paypal.android.sdk.de)>
	//  201  437:invokevirtual   #259 <Method void av.a(com.paypal.android.sdk.bb)>
					if(at.a(f.b()))
	//* 202  440:aload_0         
	//* 203  441:getfield        #95  <Field PayPalConfiguration f>
	//* 204  444:invokevirtual   #179 <Method String PayPalConfiguration.b()>
	//* 205  447:invokestatic    #192 <Method boolean at.a(String)>
	//* 206  450:ifeq            473
						obj = ((Object) (new ez(((com.paypal.android.sdk.ca) (l)), i1, flag, j1)));
	//  207  453:new             #261 <Class ez>
	//  208  456:dup             
	//  209  457:aload_0         
	//  210  458:getfield        #218 <Field av l>
	//  211  461:iload_2         
	//  212  462:iload           4
	//  213  464:iload_3         
	//  214  465:invokespecial   #264 <Method void ez(com.paypal.android.sdk.ca, int, boolean, int)>
	//  215  468:astore          6
					else
	//* 216  470:goto            524
						obj = ((Object) (new bp(o, f.b(), a(), ((com.paypal.android.sdk.ca) (l)), 90, flag1, Collections.singletonList(((Object) (new cl(a().c())))))));
	//  217  473:new             #266 <Class bp>
	//  218  476:dup             
	//  219  477:aload_0         
	//  220  478:getfield        #208 <Field a o>
	//  221  481:aload_0         
	//  222  482:getfield        #95  <Field PayPalConfiguration f>
	//  223  485:invokevirtual   #179 <Method String PayPalConfiguration.b()>
	//  224  488:aload_0         
	//  225  489:invokevirtual   #243 <Method ab a()>
	//  226  492:aload_0         
	//  227  493:getfield        #218 <Field av l>
	//  228  496:bipush          90
	//  229  498:iload           5
	//  230  500:new             #268 <Class cl>
	//  231  503:dup             
	//  232  504:aload_0         
	//  233  505:invokevirtual   #243 <Method ab a()>
	//  234  508:invokeinterface #272 <Method String ab.c()>
	//  235  513:invokespecial   #273 <Method void cl(String)>
	//  236  516:invokestatic    #279 <Method List Collections.singletonList(Object)>
	//  237  519:invokespecial   #282 <Method void bp(a, String, ab, com.paypal.android.sdk.ca, int, boolean, List)>
	//  238  522:astore          6
					obj1 = ((Object) (l));
	//  239  524:aload_0         
	//  240  525:getfield        #218 <Field av l>
	//  241  528:astore          7
					((av) (obj1)).a(new bv(((com.paypal.android.sdk.ca) (obj1)), ((com.paypal.android.sdk.bw) (obj))));
	//  242  530:aload           7
	//  243  532:new             #284 <Class bv>
	//  244  535:dup             
	//  245  536:aload           7
	//  246  538:aload           6
	//  247  540:invokespecial   #287 <Method void bv(com.paypal.android.sdk.ca, com.paypal.android.sdk.bw)>
	//  248  543:invokevirtual   #290 <Method void av.a(bv)>
				}
				fa.b(f.a());
	//  249  546:aload_0         
	//  250  547:getfield        #95  <Field PayPalConfiguration f>
	//  251  550:invokevirtual   #292 <Method String com.paypal.android.sdk.payments.PayPalConfiguration.a()>
	//  252  553:invokestatic    #296 <Method void fa.b(String)>
				if(e == null)
	//* 253  556:aload_0         
	//* 254  557:getfield        #97  <Field ck e>
	//* 255  560:ifnonnull       570
					e = B();
	//  256  563:aload_0         
	//  257  564:invokestatic    #298 <Method ck B()>
	//  258  567:putfield        #97  <Field ck e>
				if(!f.j())
	//* 259  570:aload_0         
	//* 260  571:getfield        #95  <Field PayPalConfiguration f>
	//* 261  574:invokevirtual   #300 <Method boolean PayPalConfiguration.j()>
	//* 262  577:ifne            590
					a(o.f());
	//  263  580:aload_0         
	//  264  581:getfield        #208 <Field a o>
	//  265  584:invokevirtual   #305 <Method Context a.f()>
	//  266  587:invokestatic    #307 <Method void a(Context)>
				k = intent.getComponent().getPackageName();
	//  267  590:aload_0         
	//  268  591:aload_1         
	//  269  592:invokevirtual   #311 <Method ComponentName Intent.getComponent()>
	//  270  595:invokevirtual   #316 <Method String ComponentName.getPackageName()>
	//  271  598:putfield        #318 <Field String k>
				a(ed.a);
	//  272  601:aload_0         
	//  273  602:getstatic       #323 <Field ed ed.a>
	//  274  605:invokevirtual   #326 <Method void a(ed)>
				C();
	//  275  608:aload_0         
	//  276  609:invokespecial   #328 <Method void C()>
				return;
	//  277  612:return          
			}
			intent = ((Intent) (new StringBuilder("Invalid environment selected:")));
	//  278  613:new             #139 <Class StringBuilder>
	//  279  616:dup             
	//  280  617:ldc2            #330 <String "Invalid environment selected:">
	//  281  620:invokespecial   #144 <Method void StringBuilder(String)>
	//  282  623:astore_1        
			((StringBuilder) (intent)).append(((String) (obj1)));
	//  283  624:aload_1         
	//  284  625:aload           7
	//  285  627:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  286  630:pop             
			throw new RuntimeException(((StringBuilder) (intent)).toString());
	//  287  631:new             #163 <Class RuntimeException>
	//  288  634:dup             
	//  289  635:aload_1         
	//  290  636:invokevirtual   #333 <Method String StringBuilder.toString()>
	//  291  639:invokespecial   #166 <Method void RuntimeException(String)>
	//  292  642:athrow          
		}
		throw new RuntimeException("Service extras invalid.  Please check the docs.");
	//  293  643:new             #163 <Class RuntimeException>
	//  294  646:dup             
	//  295  647:ldc2            #335 <String "Service extras invalid.  Please check the docs.">
	//  296  650:invokespecial   #166 <Method void RuntimeException(String)>
	//  297  653:athrow          
	}

	private void a(bz bz1)
	{
		l.b(bz1);
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field av l>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #338 <Method void av.b(bz)>
	//    4    8:return          
	}

	private void a(ed ed1, boolean flag, String s1, String s2, String s3)
	{
		j.a(ed1, flag, s1, s2, s3);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field com.paypal.android.sdk.payments.dh j>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:invokevirtual   #343 <Method void com.paypal.android.sdk.payments.dh.a(ed, boolean, String, String, String)>
	//    8   14:return          
	}

	static void a(PayPalService paypalservice, bz bz1)
	{
		paypalservice.e.b = null;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field ck e>
	//    2    4:aconst_null     
	//    3    5:putfield        #347 <Field dw ck.b>
		Object obj = ((Object) (new StringBuilder()));
	//    4    8:new             #139 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #348 <Method void StringBuilder()>
	//    7   15:astore_2        
		((StringBuilder) (obj)).append(bz1.n());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #352 <Method String bz.n()>
	//   11   21:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		((StringBuilder) (obj)).append(" request error");
	//   13   25:aload_2         
	//   14   26:ldc2            #354 <String " request error">
	//   15   29:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		obj = ((Object) (bz1.p().b()));
	//   17   33:aload_1         
	//   18   34:invokevirtual   #357 <Method bd bz.p()>
	//   19   37:invokevirtual   #360 <Method String bd.b()>
	//   20   40:astore_2        
		Log.e("paypal.sdk", ((String) (obj)));
	//   21   41:ldc1            #116 <String "paypal.sdk">
	//   22   43:aload_2         
	//   23   44:invokestatic    #362 <Method int Log.e(String, String)>
	//   24   47:pop             
		paypalservice.b(ed.b, ((String) (obj)), bz1.j());
	//   25   48:aload_0         
	//   26   49:getstatic       #364 <Field ed ed.b>
	//   27   52:aload_2         
	//   28   53:aload_1         
	//   29   54:invokevirtual   #366 <Method String bz.j()>
	//   30   57:invokespecial   #369 <Method void b(ed, String, String)>
		obj = ((Object) (paypalservice.m));
	//   31   60:aload_0         
	//   32   61:getfield        #113 <Field bh m>
	//   33   64:astore_2        
		if(obj != null)
	//*  34   65:aload_2         
	//*  35   66:ifnull          85
		{
			((bh) (obj)).a(paypalservice.b(bz1));
	//   36   69:aload_2         
	//   37   70:aload_0         
	//   38   71:aload_1         
	//   39   72:invokespecial   #372 <Method bi b(bz)>
	//   40   75:invokeinterface #377 <Method void com.paypal.android.sdk.payments.bh.a(bi)>
			paypalservice.m = null;
	//   41   80:aload_0         
	//   42   81:aconst_null     
	//   43   82:putfield        #113 <Field bh m>
		}
		paypalservice.g = false;
	//   44   85:aload_0         
	//   45   86:iconst_0        
	//   46   87:putfield        #379 <Field boolean g>
	//   47   90:return          
	}

	static void a(PayPalService paypalservice, ed ed1, boolean flag, String s1, String s2, String s3)
	{
		paypalservice.a(ed1, flag, s1, s2, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aconst_null     
	//    6    7:invokespecial   #381 <Method void a(ed, boolean, String, String, String)>
	//    7   10:return          
	}

	private static boolean a(dw dw1)
	{
		return dw1 != null && dw1.b();
	//    0    0:aload_0         
	//    1    1:ifnull          13
	//    2    4:aload_0         
	//    3    5:invokevirtual   #386 <Method boolean dw.b()>
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	static boolean a(PayPalService paypalservice, boolean flag)
	{
		paypalservice.g = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #379 <Field boolean g>
		return false;
	//    3    5:iconst_0        
	//    4    6:ireturn         
	}

	private es[] a(PayPalItem apaypalitem[])
	{
		if(apaypalitem == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		es aes[] = new es[apaypalitem.length];
	//    4    6:aload_1         
	//    5    7:arraylength     
	//    6    8:anewarray       es[]
	//    7   11:astore          5
		int k1 = apaypalitem.length;
	//    8   13:aload_1         
	//    9   14:arraylength     
	//   10   15:istore          4
		int j1 = 0;
	//   11   17:iconst_0        
	//   12   18:istore_3        
		for(int i1 = 0; j1 < k1; i1++)
	//*  13   19:iconst_0        
	//*  14   20:istore_2        
	//*  15   21:iload_3         
	//*  16   22:iload           4
	//*  17   24:icmpge          79
		{
			PayPalItem paypalitem = apaypalitem[j1];
	//   18   27:aload_1         
	//   19   28:iload_3         
	//   20   29:aaload          
	//   21   30:astore          6
			aes[i1] = new es(paypalitem.b(), paypalitem.c(), paypalitem.d(), paypalitem.e(), paypalitem.f());
	//   22   32:aload           5
	//   23   34:iload_2         
	//   24   35:new             #390 <Class es>
	//   25   38:dup             
	//   26   39:aload           6
	//   27   41:invokevirtual   #393 <Method String PayPalItem.b()>
	//   28   44:aload           6
	//   29   46:invokevirtual   #396 <Method Integer PayPalItem.c()>
	//   30   49:aload           6
	//   31   51:invokevirtual   #399 <Method java.math.BigDecimal PayPalItem.d()>
	//   32   54:aload           6
	//   33   56:invokevirtual   #401 <Method String PayPalItem.e()>
	//   34   59:aload           6
	//   35   61:invokevirtual   #403 <Method String PayPalItem.f()>
	//   36   64:invokespecial   #406 <Method void es(String, Integer, java.math.BigDecimal, String, String)>
	//   37   67:aastore         
			j1++;
	//   38   68:iload_3         
	//   39   69:iconst_1        
	//   40   70:iadd            
	//   41   71:istore_3        
		}

	//   42   72:iload_2         
	//   43   73:iconst_1        
	//   44   74:iadd            
	//   45   75:istore_2        
	//*  46   76:goto            21
		return aes;
	//   47   79:aload           5
	//   48   81:areturn         
	}

	private static au b(String s1, String s2)
	{
		Object obj = ((Object) (new au(s1, s2)));
	//    0    0:new             #408 <Class au>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #411 <Method void au(String, String)>
	//    5    9:astore_2        
		if(s2 != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          213
			if(s2.startsWith("https://"))
	//*   8   14:aload_1         
	//*   9   15:ldc2            #413 <String "https://">
	//*  10   18:invokevirtual   #418 <Method boolean String.startsWith(String)>
	//*  11   21:ifeq            173
			{
				s1 = s2;
	//   12   24:aload_1         
	//   13   25:astore_0        
				if(!s2.endsWith("/"))
	//*  14   26:aload_1         
	//*  15   27:ldc2            #420 <String "/">
	//*  16   30:invokevirtual   #423 <Method boolean String.endsWith(String)>
	//*  17   33:ifne            85
				{
					s1 = ((String) (new StringBuilder()));
	//   18   36:new             #139 <Class StringBuilder>
	//   19   39:dup             
	//   20   40:invokespecial   #348 <Method void StringBuilder()>
	//   21   43:astore_0        
					((StringBuilder) (s1)).append(s2);
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
					((StringBuilder) (s1)).append(" does not end with a slash, adding one.");
	//   26   50:aload_0         
	//   27   51:ldc2            #425 <String " does not end with a slash, adding one.">
	//   28   54:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   29   57:pop             
					s1 = ((String) (new StringBuilder()));
	//   30   58:new             #139 <Class StringBuilder>
	//   31   61:dup             
	//   32   62:invokespecial   #348 <Method void StringBuilder()>
	//   33   65:astore_0        
					((StringBuilder) (s1)).append(s2);
	//   34   66:aload_0         
	//   35   67:aload_1         
	//   36   68:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   37   71:pop             
					((StringBuilder) (s1)).append("/");
	//   38   72:aload_0         
	//   39   73:ldc2            #420 <String "/">
	//   40   76:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   41   79:pop             
					s1 = ((StringBuilder) (s1)).toString();
	//   42   80:aload_0         
	//   43   81:invokevirtual   #333 <Method String StringBuilder.toString()>
	//   44   84:astore_0        
				}
				Map map;
				String s3;
				StringBuilder stringbuilder;
				for(s2 = ((String) (cg.d().iterator())); ((Iterator) (s2)).hasNext(); map.put(((Object) (s3)), ((Object) (stringbuilder.toString()))))
	//*  45   85:invokestatic    #430 <Method List cg.d()>
	//*  46   88:invokeinterface #436 <Method Iterator List.iterator()>
	//*  47   93:astore_1        
	//*  48   94:aload_1         
	//*  49   95:invokeinterface #441 <Method boolean Iterator.hasNext()>
	//*  50  100:ifeq            213
				{
					bx bx1 = (bx)((Iterator) (s2)).next();
	//   51  103:aload_1         
	//   52  104:invokeinterface #445 <Method Object Iterator.next()>
	//   53  109:checkcast       #447 <Class bx>
	//   54  112:astore_3        
					map = ((au) (obj)).c();
	//   55  113:aload_2         
	//   56  114:invokevirtual   #450 <Method Map au.c()>
	//   57  117:astore          4
					s3 = bx1.a();
	//   58  119:aload_3         
	//   59  120:invokeinterface #451 <Method String bx.a()>
	//   60  125:astore          5
					stringbuilder = new StringBuilder();
	//   61  127:new             #139 <Class StringBuilder>
	//   62  130:dup             
	//   63  131:invokespecial   #348 <Method void StringBuilder()>
	//   64  134:astore          6
					stringbuilder.append(s1);
	//   65  136:aload           6
	//   66  138:aload_0         
	//   67  139:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   68  142:pop             
					stringbuilder.append(bx1.c());
	//   69  143:aload           6
	//   70  145:aload_3         
	//   71  146:invokeinterface #452 <Method String bx.c()>
	//   72  151:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   73  154:pop             
				}

	//   74  155:aload           4
	//   75  157:aload           5
	//   76  159:aload           6
	//   77  161:invokevirtual   #333 <Method String StringBuilder.toString()>
	//   78  164:invokeinterface #458 <Method Object Map.put(Object, Object)>
	//   79  169:pop             
			} else
	//*  80  170:goto            94
			{
				obj = ((Object) (new StringBuilder()));
	//   81  173:new             #139 <Class StringBuilder>
	//   82  176:dup             
	//   83  177:invokespecial   #348 <Method void StringBuilder()>
	//   84  180:astore_2        
				((StringBuilder) (obj)).append(s2);
	//   85  181:aload_2         
	//   86  182:aload_1         
	//   87  183:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   88  186:pop             
				((StringBuilder) (obj)).append(" does not start with 'https://', ignoring ");
	//   89  187:aload_2         
	//   90  188:ldc2            #460 <String " does not start with 'https://', ignoring ">
	//   91  191:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   92  194:pop             
				((StringBuilder) (obj)).append(s1);
	//   93  195:aload_2         
	//   94  196:aload_0         
	//   95  197:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   96  200:pop             
				throw new RuntimeException(((StringBuilder) (obj)).toString());
	//   97  201:new             #163 <Class RuntimeException>
	//   98  204:dup             
	//   99  205:aload_2         
	//  100  206:invokevirtual   #333 <Method String StringBuilder.toString()>
	//  101  209:invokespecial   #166 <Method void RuntimeException(String)>
	//  102  212:athrow          
			}
		return ((au) (obj));
	//  103  213:aload_2         
	//  104  214:areturn         
	}

	static bh b(PayPalService paypalservice)
	{
		return paypalservice.m;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field bh m>
	//    2    4:areturn         
	}

	private bi b(bz bz1)
	{
		return new bi(this, bz1.p().b(), bz1.r(), bz1.p().a());
	//    0    0:new             #463 <Class bi>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #357 <Method bd bz.p()>
	//    5    9:invokevirtual   #360 <Method String bd.b()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #465 <Method Integer bz.r()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #357 <Method bd bz.p()>
	//   10   20:invokevirtual   #466 <Method String bd.a()>
	//   11   23:invokespecial   #469 <Method void bi(PayPalService, String, Integer, String)>
	//   12   26:areturn         
	}

	static bi b(PayPalService paypalservice, bz bz1)
	{
		return paypalservice.b(bz1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #372 <Method bi b(bz)>
	//    3    5:areturn         
	}

	private static String b(Intent intent)
	{
		if(intent == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return "Intent = null";
	//    2    4:ldc2            #472 <String "Intent = null">
	//    3    7:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #139 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #348 <Method void StringBuilder()>
	//    7   15:astore_1        
		stringbuilder.append("Intent{");
	//    8   16:aload_1         
	//    9   17:ldc2            #474 <String "Intent{">
	//   10   20:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		StringBuilder stringbuilder1 = new StringBuilder("action:");
	//   12   24:new             #139 <Class StringBuilder>
	//   13   27:dup             
	//   14   28:ldc2            #476 <String "action:">
	//   15   31:invokespecial   #144 <Method void StringBuilder(String)>
	//   16   34:astore_2        
		stringbuilder1.append(intent.getAction());
	//   17   35:aload_2         
	//   18   36:aload_0         
	//   19   37:invokevirtual   #479 <Method String Intent.getAction()>
	//   20   40:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   21   43:pop             
		stringbuilder.append(stringbuilder1.toString());
	//   22   44:aload_1         
	//   23   45:aload_2         
	//   24   46:invokevirtual   #333 <Method String StringBuilder.toString()>
	//   25   49:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
		stringbuilder1 = new StringBuilder(", cmp:");
	//   27   53:new             #139 <Class StringBuilder>
	//   28   56:dup             
	//   29   57:ldc2            #481 <String ", cmp:">
	//   30   60:invokespecial   #144 <Method void StringBuilder(String)>
	//   31   63:astore_2        
		stringbuilder1.append(((Object) (intent.getComponent())));
	//   32   64:aload_2         
	//   33   65:aload_0         
	//   34   66:invokevirtual   #311 <Method ComponentName Intent.getComponent()>
	//   35   69:invokevirtual   #484 <Method StringBuilder StringBuilder.append(Object)>
	//   36   72:pop             
		stringbuilder1.append(", ");
	//   37   73:aload_2         
	//   38   74:ldc2            #486 <String ", ">
	//   39   77:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   40   80:pop             
		stringbuilder.append(stringbuilder1.toString());
	//   41   81:aload_1         
	//   42   82:aload_2         
	//   43   83:invokevirtual   #333 <Method String StringBuilder.toString()>
	//   44   86:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   45   89:pop             
		if(intent.getExtras() == null)
	//*  46   90:aload_0         
	//*  47   91:invokevirtual   #490 <Method Bundle Intent.getExtras()>
	//*  48   94:ifnonnull       108
		{
			stringbuilder.append("null extras");
	//   49   97:aload_1         
	//   50   98:ldc2            #492 <String "null extras">
	//   51  101:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   52  104:pop             
		} else
	//*  53  105:goto            212
		{
			stringbuilder.append("extras:");
	//   54  108:aload_1         
	//   55  109:ldc2            #494 <String "extras:">
	//   56  112:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   57  115:pop             
			StringBuilder stringbuilder2;
			for(Iterator iterator = intent.getExtras().keySet().iterator(); iterator.hasNext(); stringbuilder.append(stringbuilder2.toString()))
	//*  58  116:aload_0         
	//*  59  117:invokevirtual   #490 <Method Bundle Intent.getExtras()>
	//*  60  120:invokevirtual   #500 <Method Set Bundle.keySet()>
	//*  61  123:invokeinterface #503 <Method Iterator Set.iterator()>
	//*  62  128:astore_2        
	//*  63  129:aload_2         
	//*  64  130:invokeinterface #441 <Method boolean Iterator.hasNext()>
	//*  65  135:ifeq            212
			{
				String s1 = (String)iterator.next();
	//   66  138:aload_2         
	//   67  139:invokeinterface #445 <Method Object Iterator.next()>
	//   68  144:checkcast       #415 <Class String>
	//   69  147:astore_3        
				stringbuilder2 = new StringBuilder("(");
	//   70  148:new             #139 <Class StringBuilder>
	//   71  151:dup             
	//   72  152:ldc2            #505 <String "(">
	//   73  155:invokespecial   #144 <Method void StringBuilder(String)>
	//   74  158:astore          4
				stringbuilder2.append(s1);
	//   75  160:aload           4
	//   76  162:aload_3         
	//   77  163:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   78  166:pop             
				stringbuilder2.append(":");
	//   79  167:aload           4
	//   80  169:ldc2            #507 <String ":">
	//   81  172:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   82  175:pop             
				stringbuilder2.append(intent.getExtras().get(s1));
	//   83  176:aload           4
	//   84  178:aload_0         
	//   85  179:invokevirtual   #490 <Method Bundle Intent.getExtras()>
	//   86  182:aload_3         
	//   87  183:invokevirtual   #511 <Method Object Bundle.get(String)>
	//   88  186:invokevirtual   #484 <Method StringBuilder StringBuilder.append(Object)>
	//   89  189:pop             
				stringbuilder2.append(")");
	//   90  190:aload           4
	//   91  192:ldc2            #513 <String ")">
	//   92  195:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   93  198:pop             
			}

	//   94  199:aload_1         
	//   95  200:aload           4
	//   96  202:invokevirtual   #333 <Method String StringBuilder.toString()>
	//   97  205:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   98  208:pop             
		}
	//*  99  209:goto            129
		stringbuilder.append("}");
	//  100  212:aload_1         
	//  101  213:ldc2            #515 <String "}">
	//  102  216:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  103  219:pop             
		return stringbuilder.toString();
	//  104  220:aload_1         
	//  105  221:invokevirtual   #333 <Method String StringBuilder.toString()>
	//  106  224:areturn         
	}

	private void b(ed ed1, String s1, String s2)
	{
		a(ed1, false, s1, s2, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:aconst_null     
	//    6    6:invokespecial   #381 <Method void a(ed, boolean, String, String, String)>
	//    7    9:return          
	}

	static com.paypal.android.sdk.payments.a c(PayPalService paypalservice)
	{
		return paypalservice.h;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field com.paypal.android.sdk.payments.a h>
	//    2    4:areturn         
	}

	static void c(PayPalService paypalservice, bz bz1)
	{
		String s1 = bz1.p().b();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #357 <Method bd bz.p()>
	//    2    4:invokevirtual   #360 <Method String bd.b()>
	//    3    7:astore_2        
		Log.e("paypal.sdk", s1);
	//    4    8:ldc1            #116 <String "paypal.sdk">
	//    5   10:aload_2         
	//    6   11:invokestatic    #362 <Method int Log.e(String, String)>
	//    7   14:pop             
		paypalservice.b(ed.h, s1, bz1.j());
	//    8   15:aload_0         
	//    9   16:getstatic       #518 <Field ed ed.h>
	//   10   19:aload_2         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #366 <Method String bz.j()>
	//   13   24:invokespecial   #369 <Method void b(ed, String, String)>
		paypalservice.i.a(paypalservice.b(bz1));
	//   14   27:aload_0         
	//   15   28:getfield        #65  <Field com.paypal.android.sdk.payments.a i>
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:invokespecial   #372 <Method bi b(bz)>
	//   19   36:invokevirtual   #519 <Method void com.paypal.android.sdk.payments.a.a(bi)>
	//   20   39:return          
	}

	static cp d(PayPalService paypalservice)
	{
		return paypalservice.p;
	//    0    0:aload_0         
	//    1    1:getfield        #213 <Field cp p>
	//    2    4:areturn         
	}

	static com.paypal.android.sdk.payments.a e(PayPalService paypalservice)
	{
		return paypalservice.i;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field com.paypal.android.sdk.payments.a i>
	//    2    4:areturn         
	}

	static a f(PayPalService paypalservice)
	{
		return paypalservice.o;
	//    0    0:aload_0         
	//    1    1:getfield        #208 <Field a o>
	//    2    4:areturn         
	}

	static String y()
	{
		return c;
	//    0    0:getstatic       #524 <Field String c>
	//    1    3:areturn         
	}

	private static boolean z()
	{
		return "partner".equals("general");
	//    0    0:ldc2            #526 <String "partner">
	//    1    3:ldc2            #528 <String "general">
	//    2    6:invokevirtual   #532 <Method boolean String.equals(Object)>
	//    3    9:ifeq            14
	//    4   12:iconst_1        
	//    5   13:ireturn         
	//    6   14:iconst_0        
	//    7   15:ireturn         
	}

	final ab a()
	{
		if(d == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #534 <Field ab d>
	//*   2    4:ifnonnull       18
			d = ((ab) (new com.paypal.android.sdk.payments.cd()));
	//    3    7:aload_0         
	//    4    8:new             #172 <Class com.paypal.android.sdk.payments.cd>
	//    5   11:dup             
	//    6   12:invokespecial   #535 <Method void com.paypal.android.sdk.payments.cd()>
	//    7   15:putfield        #534 <Field ab d>
		return d;
	//    8   18:aload_0         
	//    9   19:getfield        #534 <Field ab d>
	//   10   22:areturn         
	}

	final String a(String s1)
	{
		return o.c(s1);
	//    0    0:aload_0         
	//    1    1:getfield        #208 <Field a o>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #537 <Method String a.c(String)>
	//    4    8:areturn         
	}

	final void a(int i1)
	{
		av av1 = l;
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field av l>
	//    2    4:astore_2        
		av1.b(((bz) (new en(((com.paypal.android.sdk.ca) (av1)), a(), l.c(), f.k(), e.i, (String)(new ArrayList(((java.util.Collection) (e.f.a.keySet())))).get(i1)))));
	//    3    5:aload_2         
	//    4    6:new             #540 <Class en>
	//    5    9:dup             
	//    6   10:aload_2         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #243 <Method ab a()>
	//    9   15:aload_0         
	//   10   16:getfield        #218 <Field av l>
	//   11   19:invokevirtual   #541 <Method String av.c()>
	//   12   22:aload_0         
	//   13   23:getfield        #95  <Field PayPalConfiguration f>
	//   14   26:invokevirtual   #543 <Method String PayPalConfiguration.k()>
	//   15   29:aload_0         
	//   16   30:getfield        #97  <Field ck e>
	//   17   33:getfield        #545 <Field String ck.i>
	//   18   36:new             #74  <Class ArrayList>
	//   19   39:dup             
	//   20   40:aload_0         
	//   21   41:getfield        #97  <Field ck e>
	//   22   44:getfield        #548 <Field dd ck.f>
	//   23   47:getfield        #553 <Field Map dd.a>
	//   24   50:invokeinterface #554 <Method Set Map.keySet()>
	//   25   55:invokespecial   #557 <Method void ArrayList(java.util.Collection)>
	//   26   58:iload_1         
	//   27   59:invokevirtual   #560 <Method Object ArrayList.get(int)>
	//   28   62:checkcast       #415 <Class String>
	//   29   65:invokespecial   #563 <Method void en(com.paypal.android.sdk.ca, ab, String, String, String, String)>
	//   30   68:invokevirtual   #338 <Method void av.b(bz)>
	//   31   71:return          
	}

	public final void a(ay ay)
	{
		a(((bz) (new el(((com.paypal.android.sdk.ca) (l)), a(), ea.a(ay)))));
	//    0    0:aload_0         
	//    1    1:new             #566 <Class el>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #218 <Field av l>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #243 <Method ab a()>
	//    7   13:aload_1         
	//    8   14:invokestatic    #571 <Method ay ea.a(ay)>
	//    9   17:invokespecial   #574 <Method void el(com.paypal.android.sdk.ca, ab, ay)>
	//   10   20:invokespecial   #576 <Method void a(bz)>
	//   11   23:return          
	}

	final void a(ed ed1)
	{
		a(ed1, false, ((String) (null)), ((String) (null)), ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokespecial   #381 <Method void a(ed, boolean, String, String, String)>
	//    7    9:return          
	}

	final void a(ed ed1, Boolean boolean1)
	{
		a(ed1, boolean1.booleanValue(), ((String) (null)), ((String) (null)), ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #582 <Method boolean Boolean.booleanValue()>
	//    4    6:aconst_null     
	//    5    7:aconst_null     
	//    6    8:aconst_null     
	//    7    9:invokespecial   #381 <Method void a(ed, boolean, String, String, String)>
	//    8   12:return          
	}

	final void a(ed ed1, Boolean boolean1, String s1)
	{
		a(ed1, boolean1.booleanValue(), ((String) (null)), s1, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #582 <Method boolean Boolean.booleanValue()>
	//    4    6:aconst_null     
	//    5    7:aload_3         
	//    6    8:aconst_null     
	//    7    9:invokespecial   #381 <Method void a(ed, boolean, String, String, String)>
	//    8   12:return          
	}

	final void a(ed ed1, String s1)
	{
		a(ed1, false, ((String) (null)), s1, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aconst_null     
	//    4    4:aload_2         
	//    5    5:aconst_null     
	//    6    6:invokespecial   #381 <Method void a(ed, boolean, String, String, String)>
	//    7    9:return          
	}

	final void a(ed ed1, String s1, String s2)
	{
		a(ed1, false, ((String) (null)), s1, s2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aconst_null     
	//    4    4:aload_2         
	//    5    5:aload_3         
	//    6    6:invokespecial   #381 <Method void a(ed, boolean, String, String, String)>
	//    7    9:return          
	}

	final void a(ep ep, String s1, boolean flag, String s2, boolean flag1, String s3)
	{
		av av1 = l;
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field av l>
	//    2    4:astore          7
		av1.b(((bz) (new eo(((com.paypal.android.sdk.ca) (av1)), a(), l.c(), f.k(), ep, s1, e.i, flag, s2, flag1, s3))));
	//    3    6:aload           7
	//    4    8:new             #587 <Class eo>
	//    5   11:dup             
	//    6   12:aload           7
	//    7   14:aload_0         
	//    8   15:invokevirtual   #243 <Method ab a()>
	//    9   18:aload_0         
	//   10   19:getfield        #218 <Field av l>
	//   11   22:invokevirtual   #541 <Method String av.c()>
	//   12   25:aload_0         
	//   13   26:getfield        #95  <Field PayPalConfiguration f>
	//   14   29:invokevirtual   #543 <Method String PayPalConfiguration.k()>
	//   15   32:aload_1         
	//   16   33:aload_2         
	//   17   34:aload_0         
	//   18   35:getfield        #97  <Field ck e>
	//   19   38:getfield        #545 <Field String ck.i>
	//   20   41:iload_3         
	//   21   42:aload           4
	//   22   44:iload           5
	//   23   46:aload           6
	//   24   48:invokespecial   #590 <Method void eo(com.paypal.android.sdk.ca, ab, String, String, ep, String, String, boolean, String, boolean, String)>
	//   25   51:invokevirtual   #338 <Method void av.b(bz)>
	//   26   54:return          
	}

	final void a(ep ep, boolean flag, String s1, boolean flag1, String s2)
	{
		av av1 = l;
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field av l>
	//    2    4:astore          6
		av1.b(((bz) (new eo(((com.paypal.android.sdk.ca) (av1)), a(), l.c(), f.k(), ep, flag, s1, flag1, s2))));
	//    3    6:aload           6
	//    4    8:new             #587 <Class eo>
	//    5   11:dup             
	//    6   12:aload           6
	//    7   14:aload_0         
	//    8   15:invokevirtual   #243 <Method ab a()>
	//    9   18:aload_0         
	//   10   19:getfield        #218 <Field av l>
	//   11   22:invokevirtual   #541 <Method String av.c()>
	//   12   25:aload_0         
	//   13   26:getfield        #95  <Field PayPalConfiguration f>
	//   14   29:invokevirtual   #543 <Method String PayPalConfiguration.k()>
	//   15   32:aload_1         
	//   16   33:iload_2         
	//   17   34:aload_3         
	//   18   35:iload           4
	//   19   37:aload           5
	//   20   39:invokespecial   #594 <Method void eo(com.paypal.android.sdk.ca, ab, String, String, ep, boolean, String, boolean, String)>
	//   21   42:invokevirtual   #338 <Method void av.b(bz)>
	//   22   45:return          
	}

	final void a(er er, Map map, PayPalItem apaypalitem[], String s1, boolean flag, String s2, String s3, 
			boolean flag1, String s4, String s5, String s6, boolean flag2, String s7)
	{
		av av1 = l;
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field av l>
	//    2    4:astore          14
		av1.b(((bz) ((new eh(((com.paypal.android.sdk.ca) (av1)), a(), e.g.c(), e.b(), ((String) (null)), er, map, a(apaypalitem), s1, flag, s2, n, s3, flag1)).d(s4).e(s5).f(s6).a(flag2).g(s7))));
	//    3    6:aload           14
	//    4    8:new             #597 <Class eh>
	//    5   11:dup             
	//    6   12:aload           14
	//    7   14:aload_0         
	//    8   15:invokevirtual   #243 <Method ab a()>
	//    9   18:aload_0         
	//   10   19:getfield        #97  <Field ck e>
	//   11   22:getfield        #599 <Field dw ck.g>
	//   12   25:invokevirtual   #600 <Method String dw.c()>
	//   13   28:aload_0         
	//   14   29:getfield        #97  <Field ck e>
	//   15   32:invokevirtual   #601 <Method String ck.b()>
	//   16   35:aconst_null     
	//   17   36:aload_1         
	//   18   37:aload_2         
	//   19   38:aload_0         
	//   20   39:aload_3         
	//   21   40:invokespecial   #603 <Method es[] a(PayPalItem[])>
	//   22   43:aload           4
	//   23   45:iload           5
	//   24   47:aload           6
	//   25   49:aload_0         
	//   26   50:getfield        #605 <Field String n>
	//   27   53:aload           7
	//   28   55:iload           8
	//   29   57:invokespecial   #608 <Method void eh(com.paypal.android.sdk.ca, ab, String, String, String, er, Map, es[], String, boolean, String, String, String, boolean)>
	//   30   60:aload           9
	//   31   62:invokevirtual   #611 <Method eh eh.d(String)>
	//   32   65:aload           10
	//   33   67:invokevirtual   #613 <Method eh eh.e(String)>
	//   34   70:aload           11
	//   35   72:invokevirtual   #615 <Method eh eh.f(String)>
	//   36   75:iload           12
	//   37   77:invokevirtual   #618 <Method eh eh.a(boolean)>
	//   38   80:aload           13
	//   39   82:invokevirtual   #620 <Method eh eh.g(String)>
	//   40   85:invokevirtual   #338 <Method void av.b(bz)>
	//   41   88:return          
	}

	final void a(be be)
	{
		h.a(be);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field com.paypal.android.sdk.payments.a h>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #623 <Method void com.paypal.android.sdk.payments.a.a(be)>
	//    4    8:return          
	}

	final void a(bh bh1, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            12
			e.b = null;
	//    2    4:aload_0         
	//    3    5:getfield        #97  <Field ck e>
	//    4    8:aconst_null     
	//    5    9:putfield        #347 <Field dw ck.b>
		m = bh1;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #113 <Field bh m>
		if(g)
	//*   9   17:aload_0         
	//*  10   18:getfield        #379 <Field boolean g>
	//*  11   21:ifeq            25
			return;
	//   12   24:return          
		if(!e.c())
	//*  13   25:aload_0         
	//*  14   26:getfield        #97  <Field ck e>
	//*  15   29:invokevirtual   #625 <Method boolean ck.c()>
	//*  16   32:ifne            83
		{
			g = true;
	//   17   35:aload_0         
	//   18   36:iconst_1        
	//   19   37:putfield        #379 <Field boolean g>
			a(ed.b);
	//   20   40:aload_0         
	//   21   41:getstatic       #364 <Field ed ed.b>
	//   22   44:invokevirtual   #326 <Method void a(ed)>
			l.b(((bz) (new ew(f.b(), ((com.paypal.android.sdk.ca) (l)), a(), f.k()))));
	//   23   47:aload_0         
	//   24   48:getfield        #218 <Field av l>
	//   25   51:new             #627 <Class ew>
	//   26   54:dup             
	//   27   55:aload_0         
	//   28   56:getfield        #95  <Field PayPalConfiguration f>
	//   29   59:invokevirtual   #179 <Method String PayPalConfiguration.b()>
	//   30   62:aload_0         
	//   31   63:getfield        #218 <Field av l>
	//   32   66:aload_0         
	//   33   67:invokevirtual   #243 <Method ab a()>
	//   34   70:aload_0         
	//   35   71:getfield        #95  <Field PayPalConfiguration f>
	//   36   74:invokevirtual   #543 <Method String PayPalConfiguration.k()>
	//   37   77:invokespecial   #630 <Method void ew(String, com.paypal.android.sdk.ca, ab, String)>
	//   38   80:invokevirtual   #338 <Method void av.b(bz)>
		}
	//   39   83:return          
	}

	public final void a(String s1, String s2)
	{
		a(((bz) (new ek(((com.paypal.android.sdk.ca) (l)), a(), s1, s2))));
	//    0    0:aload_0         
	//    1    1:new             #632 <Class ek>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #218 <Field av l>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #243 <Method ab a()>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokespecial   #635 <Method void ek(com.paypal.android.sdk.ca, ab, String, String)>
	//   10   18:invokespecial   #576 <Method void a(bz)>
	//   11   21:return          
	}

	final void a(String s1, String s2, er er, Map map, PayPalItem apaypalitem[], String s3, boolean flag, 
			String s4, String s5, String s6, String s7, String s8, String s9)
	{
		av av1 = l;
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field av l>
	//    2    4:astore          14
		av1.b(((bz) ((new ej(((com.paypal.android.sdk.ca) (av1)), a(), e.b.c(), s1, s2, s4, er, map, a(apaypalitem), s3, flag, s5, n, s6)).d(s7).e(s8).f(s9))));
	//    3    6:aload           14
	//    4    8:new             #638 <Class ej>
	//    5   11:dup             
	//    6   12:aload           14
	//    7   14:aload_0         
	//    8   15:invokevirtual   #243 <Method ab a()>
	//    9   18:aload_0         
	//   10   19:getfield        #97  <Field ck e>
	//   11   22:getfield        #347 <Field dw ck.b>
	//   12   25:invokevirtual   #600 <Method String dw.c()>
	//   13   28:aload_1         
	//   14   29:aload_2         
	//   15   30:aload           8
	//   16   32:aload_3         
	//   17   33:aload           4
	//   18   35:aload_0         
	//   19   36:aload           5
	//   20   38:invokespecial   #603 <Method es[] a(PayPalItem[])>
	//   21   41:aload           6
	//   22   43:iload           7
	//   23   45:aload           9
	//   24   47:aload_0         
	//   25   48:getfield        #605 <Field String n>
	//   26   51:aload           10
	//   27   53:invokespecial   #641 <Method void ej(com.paypal.android.sdk.ca, ab, String, String, String, String, er, Map, es[], String, boolean, String, String, String)>
	//   28   56:aload           11
	//   29   58:invokevirtual   #644 <Method ej ej.d(String)>
	//   30   61:aload           12
	//   31   63:invokevirtual   #646 <Method ej ej.e(String)>
	//   32   66:aload           13
	//   33   68:invokevirtual   #648 <Method ej ej.f(String)>
	//   34   71:invokevirtual   #338 <Method void av.b(bz)>
	//   35   74:return          
	}

	final void a(String s1, String s2, String s3, String s4, int i1, int j1, er er, 
			Map map, PayPalItem apaypalitem[], String s5, boolean flag, String s6, String s7, String s8, 
			String s9, String s10)
	{
		if(s3.equalsIgnoreCase("4111111111111111") && at.b(f.b()))
	//*   0    0:aload_3         
	//*   1    1:ldc2            #651 <String "4111111111111111">
	//*   2    4:invokevirtual   #654 <Method boolean String.equalsIgnoreCase(String)>
	//*   3    7:ifeq            30
	//*   4   10:aload_0         
	//*   5   11:getfield        #95  <Field PayPalConfiguration f>
	//*   6   14:invokevirtual   #179 <Method String PayPalConfiguration.b()>
	//*   7   17:invokestatic    #188 <Method boolean at.b(String)>
	//*   8   20:ifeq            30
			s3 = "4444333322221111";
	//    9   23:ldc2            #656 <String "4444333322221111">
	//   10   26:astore_3        
	//*  11   27:goto            30
		av av1 = l;
	//   12   30:aload_0         
	//   13   31:getfield        #218 <Field av l>
	//   14   34:astore          17
		av1.b(((bz) ((new ej(((com.paypal.android.sdk.ca) (av1)), a(), e.b.c(), s1, s2, s3, s4, i1, j1, ((String) (null)), er, map, a(apaypalitem), s5, flag, s6, n, s7)).d(s8).e(s9).f(s10))));
	//   15   36:aload           17
	//   16   38:new             #638 <Class ej>
	//   17   41:dup             
	//   18   42:aload           17
	//   19   44:aload_0         
	//   20   45:invokevirtual   #243 <Method ab a()>
	//   21   48:aload_0         
	//   22   49:getfield        #97  <Field ck e>
	//   23   52:getfield        #347 <Field dw ck.b>
	//   24   55:invokevirtual   #600 <Method String dw.c()>
	//   25   58:aload_1         
	//   26   59:aload_2         
	//   27   60:aload_3         
	//   28   61:aload           4
	//   29   63:iload           5
	//   30   65:iload           6
	//   31   67:aconst_null     
	//   32   68:aload           7
	//   33   70:aload           8
	//   34   72:aload_0         
	//   35   73:aload           9
	//   36   75:invokespecial   #603 <Method es[] a(PayPalItem[])>
	//   37   78:aload           10
	//   38   80:iload           11
	//   39   82:aload           12
	//   40   84:aload_0         
	//   41   85:getfield        #605 <Field String n>
	//   42   88:aload           13
	//   43   90:invokespecial   #659 <Method void ej(com.paypal.android.sdk.ca, ab, String, String, String, String, String, int, int, String, er, Map, es[], String, boolean, String, String, String)>
	//   44   93:aload           14
	//   45   95:invokevirtual   #644 <Method ej ej.d(String)>
	//   46   98:aload           15
	//   47  100:invokevirtual   #646 <Method ej ej.e(String)>
	//   48  103:aload           16
	//   49  105:invokevirtual   #648 <Method ej ej.f(String)>
	//   50  108:invokevirtual   #338 <Method void av.b(bz)>
	//   51  111:return          
	}

	final void a(List list)
	{
		av av1 = l;
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field av l>
	//    2    4:astore_2        
		av1.b(((bz) (new eg(((com.paypal.android.sdk.ca) (av1)), a(), l.c(), f.k(), e.e.a(), e.i, list))));
	//    3    5:aload_2         
	//    4    6:new             #662 <Class eg>
	//    5    9:dup             
	//    6   10:aload_2         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #243 <Method ab a()>
	//    9   15:aload_0         
	//   10   16:getfield        #218 <Field av l>
	//   11   19:invokevirtual   #541 <Method String av.c()>
	//   12   22:aload_0         
	//   13   23:getfield        #95  <Field PayPalConfiguration f>
	//   14   26:invokevirtual   #543 <Method String PayPalConfiguration.k()>
	//   15   29:aload_0         
	//   16   30:getfield        #97  <Field ck e>
	//   17   33:getfield        #665 <Field dy ck.e>
	//   18   36:invokevirtual   #668 <Method String dy.a()>
	//   19   39:aload_0         
	//   20   40:getfield        #97  <Field ck e>
	//   21   43:getfield        #545 <Field String ck.i>
	//   22   46:aload_1         
	//   23   47:invokespecial   #671 <Method void eg(com.paypal.android.sdk.ca, ab, String, String, String, String, List)>
	//   24   50:invokevirtual   #338 <Method void av.b(bz)>
	//   25   53:return          
	}

	final void a(boolean flag, String s1, String s2, JSONObject jsonobject, JSONObject jsonobject1, String s3)
	{
		av av1 = l;
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field av l>
	//    2    4:astore          7
		av1.b(((bz) (new ee(((com.paypal.android.sdk.ca) (av1)), a(), e.g.c(), e.b(), flag, s3, n, s1, s2, jsonobject, jsonobject1))));
	//    3    6:aload           7
	//    4    8:new             #674 <Class ee>
	//    5   11:dup             
	//    6   12:aload           7
	//    7   14:aload_0         
	//    8   15:invokevirtual   #243 <Method ab a()>
	//    9   18:aload_0         
	//   10   19:getfield        #97  <Field ck e>
	//   11   22:getfield        #599 <Field dw ck.g>
	//   12   25:invokevirtual   #600 <Method String dw.c()>
	//   13   28:aload_0         
	//   14   29:getfield        #97  <Field ck e>
	//   15   32:invokevirtual   #601 <Method String ck.b()>
	//   16   35:iload_1         
	//   17   36:aload           6
	//   18   38:aload_0         
	//   19   39:getfield        #605 <Field String n>
	//   20   42:aload_2         
	//   21   43:aload_3         
	//   22   44:aload           4
	//   23   46:aload           5
	//   24   48:invokespecial   #677 <Method void ee(com.paypal.android.sdk.ca, ab, String, String, boolean, String, String, String, String, JSONObject, JSONObject)>
	//   25   51:invokevirtual   #338 <Method void av.b(bz)>
	//   26   54:return          
	}

	protected final boolean a(bk bk1)
	{
		if(A())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #680 <Method boolean A()>
	//*   2    4:ifeq            9
		{
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		} else
		{
			q.add(((Object) (bk1)));
	//    5    9:aload_0         
	//    6   10:getfield        #77  <Field List q>
	//    7   13:aload_1         
	//    8   14:invokeinterface #683 <Method boolean List.add(Object)>
	//    9   19:pop             
			return false;
	//   10   20:iconst_0        
	//   11   21:ireturn         
		}
	}

	protected final av b()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field av l>
	//    2    4:areturn         
	}

	final void b(be be)
	{
		i.a(be);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field com.paypal.android.sdk.payments.a i>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #623 <Method void com.paypal.android.sdk.payments.a.a(be)>
	//    4    8:return          
	}

	protected final ck c()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field ck e>
	//    2    4:areturn         
	}

	final PayPalConfiguration d()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field PayPalConfiguration f>
	//    2    4:areturn         
	}

	protected final String e()
	{
		return f.b();
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field PayPalConfiguration f>
	//    2    4:invokevirtual   #179 <Method String PayPalConfiguration.b()>
	//    3    7:areturn         
	}

	protected final String f()
	{
		return f.k();
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field PayPalConfiguration f>
	//    2    4:invokevirtual   #543 <Method String PayPalConfiguration.k()>
	//    3    7:areturn         
	}

	final void g()
	{
		t();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #687 <Method void t()>
		h();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #689 <Method void h()>
		p.b();
	//    4    8:aload_0         
	//    5    9:getfield        #213 <Field cp p>
	//    6   12:invokevirtual   #691 <Method void cp.b()>
		u();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #693 <Method void u()>
	//    9   19:return          
	}

	final void h()
	{
		e.g = null;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field ck e>
	//    2    4:aconst_null     
	//    3    5:putfield        #599 <Field dw ck.g>
		cm.b(f.b());
	//    4    8:aload_0         
	//    5    9:getfield        #95  <Field PayPalConfiguration f>
	//    6   12:invokevirtual   #179 <Method String PayPalConfiguration.b()>
	//    7   15:invokestatic    #696 <Method void cm.b(String)>
		ck ck1 = e;
	//    8   18:aload_0         
	//    9   19:getfield        #97  <Field ck e>
	//   10   22:astore_1        
		ck1.d = null;
	//   11   23:aload_1         
	//   12   24:aconst_null     
	//   13   25:putfield        #699 <Field dm ck.d>
		ck1.c = null;
	//   14   28:aload_1         
	//   15   29:aconst_null     
	//   16   30:putfield        #700 <Field String ck.c>
	//   17   33:return          
	}

	final boolean i()
	{
		return e.c();
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field ck e>
	//    2    4:invokevirtual   #625 <Method boolean ck.c()>
	//    3    7:ireturn         
	}

	final boolean j()
	{
		ck ck1 = e;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field ck e>
	//    2    4:astore_1        
		return ck1.g != null && ck1.g.b();
	//    3    5:aload_1         
	//    4    6:getfield        #599 <Field dw ck.g>
	//    5    9:ifnull          24
	//    6   12:aload_1         
	//    7   13:getfield        #599 <Field dw ck.g>
	//    8   16:invokevirtual   #386 <Method boolean dw.b()>
	//    9   19:ifeq            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	final boolean k()
	{
		return e.e != null && e.i != null;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field ck e>
	//    2    4:getfield        #665 <Field dy ck.e>
	//    3    7:ifnull          22
	//    4   10:aload_0         
	//    5   11:getfield        #97  <Field ck e>
	//    6   14:getfield        #545 <Field String ck.i>
	//    7   17:ifnull          22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	final void l()
	{
		Object obj = ((Object) (p.a()));
	//    0    0:aload_0         
	//    1    1:getfield        #213 <Field cp p>
	//    2    4:invokevirtual   #703 <Method dm cp.a()>
	//    3    7:astore_1        
		if(obj == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       17
		{
			h();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #689 <Method void h()>
			return;
	//    8   16:return          
		}
		Object obj1 = ((Object) (e.g));
	//    9   17:aload_0         
	//   10   18:getfield        #97  <Field ck e>
	//   11   21:getfield        #599 <Field dw ck.g>
	//   12   24:astore_2        
		dw dw1 = cm.a(f.b());
	//   13   25:aload_0         
	//   14   26:getfield        #95  <Field PayPalConfiguration f>
	//   15   29:invokevirtual   #179 <Method String PayPalConfiguration.b()>
	//   16   32:invokestatic    #706 <Method dw cm.a(String)>
	//   17   35:astore_3        
		if(!a(((dw) (obj1))) && a(dw1))
	//*  18   36:aload_2         
	//*  19   37:invokestatic    #708 <Method boolean a(dw)>
	//*  20   40:ifne            58
	//*  21   43:aload_3         
	//*  22   44:invokestatic    #708 <Method boolean a(dw)>
	//*  23   47:ifeq            58
			e.g = dw1;
	//   24   50:aload_0         
	//   25   51:getfield        #97  <Field ck e>
	//   26   54:aload_3         
	//   27   55:putfield        #599 <Field dw ck.g>
		obj1 = ((Object) (e));
	//   28   58:aload_0         
	//   29   59:getfield        #97  <Field ck e>
	//   30   62:astore_2        
		if(((dm) (obj)).d())
	//*  31   63:aload_1         
	//*  32   64:invokevirtual   #711 <Method boolean dm.d()>
	//*  33   67:ifeq            105
		{
			if(((dm) (obj)).c().equals(((Object) (cr.a))))
	//*  34   70:aload_1         
	//*  35   71:invokevirtual   #714 <Method cr dm.c()>
	//*  36   74:getstatic       #719 <Field cr cr.a>
	//*  37   77:invokevirtual   #720 <Method boolean cr.equals(Object)>
	//*  38   80:ifeq            91
				obj = ((Object) (((dm) (obj)).b()));
	//   39   83:aload_1         
	//   40   84:invokevirtual   #721 <Method String dm.b()>
	//   41   87:astore_1        
			else
	//*  42   88:goto            107
				obj = ((Object) (((dm) (obj)).a().a(((com.paypal.android.sdk.ds) (ci.a())))));
	//   43   91:aload_1         
	//   44   92:invokevirtual   #724 <Method ev dm.a()>
	//   45   95:invokestatic    #729 <Method ci ci.a()>
	//   46   98:invokevirtual   #734 <Method String ev.a(com.paypal.android.sdk.ds)>
	//   47  101:astore_1        
		} else
	//*  48  102:goto            107
		{
			obj = null;
	//   49  105:aconst_null     
	//   50  106:astore_1        
		}
		obj1.c = ((String) (obj));
	//   51  107:aload_2         
	//   52  108:aload_1         
	//   53  109:putfield        #700 <Field String ck.c>
	//   54  112:return          
	}

	final void m()
	{
		i.b();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field com.paypal.android.sdk.payments.a i>
	//    2    4:invokevirtual   #735 <Method void a.b()>
	//    3    7:return          
	}

	final void n()
	{
		h.b();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field com.paypal.android.sdk.payments.a h>
	//    2    4:invokevirtual   #735 <Method void a.b()>
	//    3    7:return          
	}

	final void o()
	{
		m = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #113 <Field bh m>
	//    3    5:return          
	}

	public final IBinder onBind(Intent intent)
	{
		StringBuilder stringbuilder = new StringBuilder("onBind(");
	//    0    0:new             #139 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc2            #739 <String "onBind(">
	//    3    7:invokespecial   #144 <Method void StringBuilder(String)>
	//    4   10:astore_2        
		stringbuilder.append(b(intent));
	//    5   11:aload_2         
	//    6   12:aload_1         
	//    7   13:invokestatic    #147 <Method String b(Intent)>
	//    8   16:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append(")");
	//   10   20:aload_2         
	//   11   21:ldc2            #513 <String ")">
	//   12   24:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		if(!A())
	//*  14   28:aload_0         
	//*  15   29:invokespecial   #680 <Method boolean A()>
	//*  16   32:ifne            56
		{
			Intent intent1 = t;
	//   17   35:getstatic       #137 <Field Intent t>
	//   18   38:astore_2        
			if(intent1 == null)
	//*  19   39:aload_2         
	//*  20   40:ifnonnull       51
				a(intent);
	//   21   43:aload_0         
	//   22   44:aload_1         
	//   23   45:invokespecial   #741 <Method void a(Intent)>
			else
	//*  24   48:goto            56
				a(intent1);
	//   25   51:aload_0         
	//   26   52:aload_2         
	//   27   53:invokespecial   #741 <Method void a(Intent)>
		}
		return v;
	//   28   56:aload_0         
	//   29   57:getfield        #91  <Field IBinder v>
	//   30   60:areturn         
	}

	public final void onCreate()
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #139 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #348 <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append(((Class) (com/paypal/android/sdk/payments/PayPalService)).getSimpleName());
	//    4    8:aload_1         
	//    5    9:ldc1            #2   <Class PayPalService>
	//    6   11:invokevirtual   #747 <Method String Class.getSimpleName()>
	//    7   14:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
		((StringBuilder) (obj)).append(" created. API:");
	//    9   18:aload_1         
	//   10   19:ldc2            #749 <String " created. API:">
	//   11   22:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
		((StringBuilder) (obj)).append(android.os.Build.VERSION.SDK_INT);
	//   13   26:aload_1         
	//   14   27:getstatic       #755 <Field int android.os.Build$VERSION.SDK_INT>
	//   15   30:invokevirtual   #758 <Method StringBuilder StringBuilder.append(int)>
	//   16   33:pop             
		((StringBuilder) (obj)).append(" ");
	//   17   34:aload_1         
	//   18   35:ldc2            #760 <String " ">
	//   19   38:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
		((StringBuilder) (obj)).append(a().b());
	//   21   42:aload_1         
	//   22   43:aload_0         
	//   23   44:invokevirtual   #243 <Method ab a()>
	//   24   47:invokeinterface #761 <Method String ab.b()>
	//   25   52:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   26   55:pop             
		Log.w("paypal.sdk", ((StringBuilder) (obj)).toString());
	//   27   56:ldc1            #116 <String "paypal.sdk">
	//   28   58:aload_1         
	//   29   59:invokevirtual   #333 <Method String StringBuilder.toString()>
	//   30   62:invokestatic    #124 <Method int Log.w(String, String)>
	//   31   65:pop             
		new com.paypal.android.sdk.payments.cd();
	//   32   66:new             #172 <Class com.paypal.android.sdk.payments.cd>
	//   33   69:dup             
	//   34   70:invokespecial   #535 <Method void com.paypal.android.sdk.payments.cd()>
	//   35   73:pop             
		o = new a(((Context) (this)), "AndroidBasePrefs", new cd());
	//   36   74:aload_0         
	//   37   75:new             #302 <Class a>
	//   38   78:dup             
	//   39   79:aload_0         
	//   40   80:ldc2            #763 <String "AndroidBasePrefs">
	//   41   83:new             #765 <Class cd>
	//   42   86:dup             
	//   43   87:invokespecial   #766 <Method void cd()>
	//   44   90:invokespecial   #769 <Method void a(Context, String, cd)>
	//   45   93:putfield        #208 <Field a o>
		dh.a(o);
	//   46   96:aload_0         
	//   47   97:getfield        #208 <Field a o>
	//   48  100:invokestatic    #774 <Method void dh.a(a)>
		dl.a(o);
	//   49  103:aload_0         
	//   50  104:getfield        #208 <Field a o>
	//   51  107:invokestatic    #777 <Method void dl.a(a)>
		n = da.a(a, ((Context) (this)), o.e(), "2.16.0", ((String) (null)));
	//   52  110:aload_0         
	//   53  111:getstatic       #54  <Field ExecutorService a>
	//   54  114:aload_0         
	//   55  115:aload_0         
	//   56  116:getfield        #208 <Field a o>
	//   57  119:invokevirtual   #778 <Method String a.e()>
	//   58  122:ldc2            #780 <String "2.16.0">
	//   59  125:aconst_null     
	//   60  126:invokestatic    #785 <Method String da.a(ExecutorService, Context, String, String, String)>
	//   61  129:putfield        #605 <Field String n>
		obj = ((Object) (new IntentFilter()));
	//   62  132:new             #787 <Class IntentFilter>
	//   63  135:dup             
	//   64  136:invokespecial   #788 <Method void IntentFilter()>
	//   65  139:astore_1        
		((IntentFilter) (obj)).addAction("com.paypal.android.sdk.clearAllUserData");
	//   66  140:aload_1         
	//   67  141:ldc2            #790 <String "com.paypal.android.sdk.clearAllUserData">
	//   68  144:invokevirtual   #793 <Method void IntentFilter.addAction(String)>
		com.paypal.android.sdk.payments.c.a(((Context) (this))).a(u, ((IntentFilter) (obj)));
	//   69  147:aload_0         
	//   70  148:invokestatic    #798 <Method c com.paypal.android.sdk.payments.c.a(Context)>
	//   71  151:aload_0         
	//   72  152:getfield        #86  <Field BroadcastReceiver u>
	//   73  155:aload_1         
	//   74  156:invokevirtual   #801 <Method void com.paypal.android.sdk.payments.c.a(BroadcastReceiver, IntentFilter)>
	//   75  159:return          
	}

	public final void onDestroy()
	{
		av av1 = l;
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field av l>
	//    2    4:astore_1        
		if(av1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          25
		{
			av1.a();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #806 <Method void av.a()>
			l.b();
	//    7   13:aload_0         
	//    8   14:getfield        #218 <Field av l>
	//    9   17:invokevirtual   #807 <Method void av.b()>
			l = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #218 <Field av l>
		}
		try
		{
			com.paypal.android.sdk.payments.c.a(((Context) (this))).a(u);
	//   13   25:aload_0         
	//   14   26:invokestatic    #798 <Method c com.paypal.android.sdk.payments.c.a(Context)>
	//   15   29:aload_0         
	//   16   30:getfield        #86  <Field BroadcastReceiver u>
	//   17   33:invokevirtual   #810 <Method void com.paypal.android.sdk.payments.c.a(BroadcastReceiver)>
		}
	//*  18   36:goto            58
		catch(Throwable throwable)
	//*  19   39:astore_1        
		{
			(new StringBuilder("ignoring:")).append(throwable.getMessage());
	//   20   40:new             #139 <Class StringBuilder>
	//   21   43:dup             
	//   22   44:ldc2            #812 <String "ignoring:">
	//   23   47:invokespecial   #144 <Method void StringBuilder(String)>
	//   24   50:aload_1         
	//   25   51:invokevirtual   #815 <Method String Throwable.getMessage()>
	//   26   54:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   27   57:pop             
		}
		(new StringBuilder("service destroyed: ")).append(((Object) (this)));
	//   28   58:new             #139 <Class StringBuilder>
	//   29   61:dup             
	//   30   62:ldc2            #817 <String "service destroyed: ">
	//   31   65:invokespecial   #144 <Method void StringBuilder(String)>
	//   32   68:aload_0         
	//   33   69:invokevirtual   #484 <Method StringBuilder StringBuilder.append(Object)>
	//   34   72:pop             
	//   35   73:return          
	}

	public final void onRebind(Intent intent)
	{
		super.onRebind(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #820 <Method void Service.onRebind(Intent)>
		StringBuilder stringbuilder = new StringBuilder("onRebind(");
	//    3    5:new             #139 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:ldc2            #822 <String "onRebind(">
	//    6   12:invokespecial   #144 <Method void StringBuilder(String)>
	//    7   15:astore_2        
		stringbuilder.append(b(intent));
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokestatic    #147 <Method String b(Intent)>
	//   11   21:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append(")");
	//   13   25:aload_2         
	//   14   26:ldc2            #513 <String ")">
	//   15   29:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
	//   17   33:return          
	}

	public final int onStartCommand(Intent intent, int i1, int j1)
	{
		StringBuilder stringbuilder = new StringBuilder("onStartCommand(");
	//    0    0:new             #139 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc2            #826 <String "onStartCommand(">
	//    3    7:invokespecial   #144 <Method void StringBuilder(String)>
	//    4   10:astore          4
		stringbuilder.append(b(intent));
	//    5   12:aload           4
	//    6   14:aload_1         
	//    7   15:invokestatic    #147 <Method String b(Intent)>
	//    8   18:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
		stringbuilder.append(", ");
	//   10   22:aload           4
	//   11   24:ldc2            #486 <String ", ">
	//   12   27:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   13   30:pop             
		stringbuilder.append(i1);
	//   14   31:aload           4
	//   15   33:iload_2         
	//   16   34:invokevirtual   #758 <Method StringBuilder StringBuilder.append(int)>
	//   17   37:pop             
		stringbuilder.append(", ");
	//   18   38:aload           4
	//   19   40:ldc2            #486 <String ", ">
	//   20   43:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   21   46:pop             
		stringbuilder.append(j1);
	//   22   47:aload           4
	//   23   49:iload_3         
	//   24   50:invokevirtual   #758 <Method StringBuilder StringBuilder.append(int)>
	//   25   53:pop             
		stringbuilder.append(")");
	//   26   54:aload           4
	//   27   56:ldc2            #513 <String ")">
	//   28   59:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   29   62:pop             
		if(!A())
	//*  30   63:aload_0         
	//*  31   64:invokespecial   #680 <Method boolean A()>
	//*  32   67:ifne            111
		{
			(new fz(((Context) (this)))).a();
	//   33   70:new             #828 <Class fz>
	//   34   73:dup             
	//   35   74:aload_0         
	//   36   75:invokespecial   #829 <Method void fz(Context)>
	//   37   78:invokevirtual   #830 <Method void fz.a()>
			if(intent != null && intent.getExtras() != null)
	//*  38   81:aload_1         
	//*  39   82:ifnull          100
	//*  40   85:aload_1         
	//*  41   86:invokevirtual   #490 <Method Bundle Intent.getExtras()>
	//*  42   89:ifnull          100
				a(intent);
	//   43   92:aload_0         
	//   44   93:aload_1         
	//   45   94:invokespecial   #741 <Method void a(Intent)>
			else
	//*  46   97:goto            111
				throw new RuntimeException("Service extras required. Please see the docs.");
	//   47  100:new             #163 <Class RuntimeException>
	//   48  103:dup             
	//   49  104:ldc2            #832 <String "Service extras required. Please see the docs.">
	//   50  107:invokespecial   #166 <Method void RuntimeException(String)>
	//   51  110:athrow          
		}
		if(q.size() > 0)
	//*  52  111:aload_0         
	//*  53  112:getfield        #77  <Field List q>
	//*  54  115:invokeinterface #836 <Method int List.size()>
	//*  55  120:ifle            168
		{
			for(intent = ((Intent) (q.iterator())); ((Iterator) (intent)).hasNext(); ((bk)((Iterator) (intent)).next()).a());
	//   56  123:aload_0         
	//   57  124:getfield        #77  <Field List q>
	//   58  127:invokeinterface #436 <Method Iterator List.iterator()>
	//   59  132:astore_1        
	//   60  133:aload_1         
	//   61  134:invokeinterface #441 <Method boolean Iterator.hasNext()>
	//   62  139:ifeq            159
	//   63  142:aload_1         
	//   64  143:invokeinterface #445 <Method Object Iterator.next()>
	//   65  148:checkcast       #838 <Class bk>
	//   66  151:invokeinterface #839 <Method void com.paypal.android.sdk.payments.bk.a()>
	//*  67  156:goto            133
			q.clear();
	//   68  159:aload_0         
	//   69  160:getfield        #77  <Field List q>
	//   70  163:invokeinterface #842 <Method void List.clear()>
		}
		return 3;
	//   71  168:iconst_3        
	//   72  169:ireturn         
	}

	public final boolean onUnbind(Intent intent)
	{
		StringBuilder stringbuilder = new StringBuilder("onUnbind(");
	//    0    0:new             #139 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc2            #846 <String "onUnbind(">
	//    3    7:invokespecial   #144 <Method void StringBuilder(String)>
	//    4   10:astore_2        
		stringbuilder.append(b(intent));
	//    5   11:aload_2         
	//    6   12:aload_1         
	//    7   13:invokestatic    #147 <Method String b(Intent)>
	//    8   16:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append(")");
	//   10   20:aload_2         
	//   11   21:ldc2            #513 <String ")">
	//   12   24:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		return true;
	//   14   28:iconst_1        
	//   15   29:ireturn         
	}

	final void p()
	{
		av av1 = l;
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field av l>
	//    2    4:astore_1        
		av1.b(((bz) (new em(((com.paypal.android.sdk.ca) (av1)), a(), l.c(), e.b.c(), f.k()))));
	//    3    5:aload_1         
	//    4    6:new             #848 <Class em>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #243 <Method ab a()>
	//    9   15:aload_0         
	//   10   16:getfield        #218 <Field av l>
	//   11   19:invokevirtual   #541 <Method String av.c()>
	//   12   22:aload_0         
	//   13   23:getfield        #97  <Field ck e>
	//   14   26:getfield        #347 <Field dw ck.b>
	//   15   29:invokevirtual   #600 <Method String dw.c()>
	//   16   32:aload_0         
	//   17   33:getfield        #95  <Field PayPalConfiguration f>
	//   18   36:invokevirtual   #543 <Method String PayPalConfiguration.k()>
	//   19   39:invokespecial   #851 <Method void em(com.paypal.android.sdk.ca, ab, String, String, String)>
	//   20   42:invokevirtual   #338 <Method void av.b(bz)>
	//   21   45:return          
	}

	final dm q()
	{
		return p.a();
	//    0    0:aload_0         
	//    1    1:getfield        #213 <Field cp p>
	//    2    4:invokevirtual   #703 <Method dm cp.a()>
	//    3    7:areturn         
	}

	final String r()
	{
		return e.c;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field ck e>
	//    2    4:getfield        #700 <Field String ck.c>
	//    3    7:areturn         
	}

	final dt s()
	{
		return p.a(f.k());
	//    0    0:aload_0         
	//    1    1:getfield        #213 <Field cp p>
	//    2    4:aload_0         
	//    3    5:getfield        #95  <Field PayPalConfiguration f>
	//    4    8:invokevirtual   #543 <Method String PayPalConfiguration.k()>
	//    5   11:invokevirtual   #855 <Method dt cp.a(String)>
	//    6   14:areturn         
	}

	final void t()
	{
		b = s();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #857 <Method dt s()>
	//    3    5:putfield        #859 <Field dt b>
		p.c();
	//    4    8:aload_0         
	//    5    9:getfield        #213 <Field cp p>
	//    6   12:invokevirtual   #861 <Method void cp.c()>
		if(b != null && e.b != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #859 <Field dt b>
	//*   9   19:ifnull          58
	//*  10   22:aload_0         
	//*  11   23:getfield        #97  <Field ck e>
	//*  12   26:getfield        #347 <Field dw ck.b>
	//*  13   29:ifnull          58
		{
			a(e.b.c(), b.e());
	//   14   32:aload_0         
	//   15   33:aload_0         
	//   16   34:getfield        #97  <Field ck e>
	//   17   37:getfield        #347 <Field dw ck.b>
	//   18   40:invokevirtual   #600 <Method String dw.c()>
	//   19   43:aload_0         
	//   20   44:getfield        #859 <Field dt b>
	//   21   47:invokevirtual   #864 <Method String dt.e()>
	//   22   50:invokevirtual   #866 <Method void a(String, String)>
			b = null;
	//   23   53:aload_0         
	//   24   54:aconst_null     
	//   25   55:putfield        #859 <Field dt b>
		}
	//   26   58:return          
	}

	final void u()
	{
		PayPalConfiguration paypalconfiguration = f;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field PayPalConfiguration f>
	//    2    4:astore_1        
		if(paypalconfiguration != null && paypalconfiguration.o())
	//*   3    5:aload_1         
	//*   4    6:ifnull          27
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #168 <Method boolean PayPalConfiguration.o()>
	//*   7   13:ifeq            27
		{
			e = B();
	//    8   16:aload_0         
	//    9   17:invokestatic    #298 <Method ck B()>
	//   10   20:putfield        #97  <Field ck e>
			C();
	//   11   23:aload_0         
	//   12   24:invokespecial   #328 <Method void C()>
		}
	//   13   27:return          
	}

	protected final String v()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #318 <Field String k>
	//    2    4:areturn         
	}

	final boolean w()
	{
		return r;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field boolean r>
	//    2    4:ireturn         
	}

	final boolean x()
	{
		return s;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field boolean s>
	//    2    4:ireturn         
	}

	static final ExecutorService a = cf.a();
	private static final String c = "PayPalService";
	private static Intent t;
	dt b;
	private ab d;
	private ck e;
	private PayPalConfiguration f;
	private boolean g;
	private com.paypal.android.sdk.payments.a h;
	private com.paypal.android.sdk.payments.a i;
	private com.paypal.android.sdk.payments.dh j;
	private String k;
	private av l;
	private bh m;
	private String n;
	private a o;
	private cp p;
	private List q;
	private boolean r;
	private boolean s;
	private final BroadcastReceiver u = new bc(this);
	private final IBinder v = new bf(this);

	static 
	{
	//    0    0:invokestatic    #52  <Method java.util.concurrent.ThreadPoolExecutor cf.a()>
	//    1    3:putstatic       #54  <Field ExecutorService a>
	//*   2    6:return          
	}
}
