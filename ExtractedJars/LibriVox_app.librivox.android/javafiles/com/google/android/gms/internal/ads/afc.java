// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.util.e;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aeq, aee, adx, add, 
//			adw, wx, abj, afd, 
//			p, bwk, m, bct, 
//			adc

public final class afc extends aeq
	implements aee
{

	public afc(add add1, adc adc)
	{
		super(add1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void aeq(add)>
		d = new adx(add1.getContext(), adc);
	//    3    5:aload_0         
	//    4    6:new             #26  <Class adx>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokeinterface #32  <Method android.content.Context add.getContext()>
	//    8   16:aload_2         
	//    9   17:invokespecial   #35  <Method void adx(android.content.Context, adc)>
	//   10   20:putfield        #37  <Field adx d>
		d.a(((aee) (this)));
	//   11   23:aload_0         
	//   12   24:getfield        #37  <Field adx d>
	//   13   27:aload_0         
	//   14   28:invokevirtual   #41  <Method void adx.a(aee)>
	//   15   31:return          
	}

	private static String b(String s, Exception exception)
	{
		String s1 = ((Object) (exception)).getClass().getCanonicalName();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #50  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #56  <Method String Class.getCanonicalName()>
	//    3    7:astore_2        
		exception = ((Exception) (exception.getMessage()));
	//    4    8:aload_1         
	//    5    9:invokevirtual   #61  <Method String Exception.getMessage()>
	//    6   12:astore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 2 + String.valueOf(((Object) (s1))).length() + String.valueOf(((Object) (exception))).length());
	//    7   13:new             #63  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokestatic    #69  <Method String String.valueOf(Object)>
	//   11   21:invokevirtual   #73  <Method int String.length()>
	//   12   24:iconst_2        
	//   13   25:iadd            
	//   14   26:aload_2         
	//   15   27:invokestatic    #69  <Method String String.valueOf(Object)>
	//   16   30:invokevirtual   #73  <Method int String.length()>
	//   17   33:iadd            
	//   18   34:aload_1         
	//   19   35:invokestatic    #69  <Method String String.valueOf(Object)>
	//   20   38:invokevirtual   #73  <Method int String.length()>
	//   21   41:iadd            
	//   22   42:invokespecial   #76  <Method void StringBuilder(int)>
	//   23   45:astore_3        
		stringbuilder.append(s);
	//   24   46:aload_3         
	//   25   47:aload_0         
	//   26   48:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
		stringbuilder.append("/");
	//   28   52:aload_3         
	//   29   53:ldc1            #82  <String "/">
	//   30   55:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   31   58:pop             
		stringbuilder.append(s1);
	//   32   59:aload_3         
	//   33   60:aload_2         
	//   34   61:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   35   64:pop             
		stringbuilder.append(":");
	//   36   65:aload_3         
	//   37   66:ldc1            #84  <String ":">
	//   38   68:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   39   71:pop             
		stringbuilder.append(((String) (exception)));
	//   40   72:aload_3         
	//   41   73:aload_1         
	//   42   74:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   43   77:pop             
		return stringbuilder.toString();
	//   44   78:aload_3         
	//   45   79:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   46   82:areturn         
	}

	private final void c(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		f = true;
	//    2    2:aload_0         
	//    3    3:iconst_1        
	//    4    4:putfield        #91  <Field boolean f>
		((Object)this).notify();
	//    5    7:aload_0         
	//    6    8:invokevirtual   #95  <Method void Object.notify()>
		((aeq)this).a();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #97  <Method void aeq.a()>
		this;
	//    9   15:aload_0         
		JVM INSTR monitorexit ;
	//   10   16:monitorexit     
		String s1 = e;
	//   11   17:aload_0         
	//   12   18:getfield        #99  <Field String e>
	//   13   21:astore_2        
		if(s1 != null)
	//*  14   22:aload_2         
	//*  15   23:ifnull          71
		{
			s1 = ((aeq)this).b(s1);
	//   16   26:aload_0         
	//   17   27:aload_2         
	//   18   28:invokevirtual   #102 <Method String aeq.b(String)>
	//   19   31:astore_2        
			Exception exception = g;
	//   20   32:aload_0         
	//   21   33:getfield        #104 <Field Exception g>
	//   22   36:astore_3        
			if(exception != null)
	//*  23   37:aload_3         
	//*  24   38:ifnull          58
			{
				((aeq)this).a(e, s1, "badUrl", b(s, exception));
	//   25   41:aload_0         
	//   26   42:aload_0         
	//   27   43:getfield        #99  <Field String e>
	//   28   46:aload_2         
	//   29   47:ldc1            #106 <String "badUrl">
	//   30   49:aload_1         
	//   31   50:aload_3         
	//   32   51:invokestatic    #108 <Method String b(String, Exception)>
	//   33   54:invokevirtual   #111 <Method void aeq.a(String, String, String, String)>
				return;
	//   34   57:return          
			}
			((aeq)this).a(e, s1, "externalAbort", "Programmatic precache abort.");
	//   35   58:aload_0         
	//   36   59:aload_0         
	//   37   60:getfield        #99  <Field String e>
	//   38   63:aload_2         
	//   39   64:ldc1            #113 <String "externalAbort">
	//   40   66:ldc1            #115 <String "Programmatic precache abort.">
	//   41   68:invokevirtual   #111 <Method void aeq.a(String, String, String, String)>
		}
		return;
	//   42   71:return          
		s;
	//   43   72:astore_1        
		this;
	//   44   73:aload_0         
		JVM INSTR monitorexit ;
	//   45   74:monitorexit     
		throw s;
	//   46   75:aload_1         
	//   47   76:athrow          
	}

	public final void a()
	{
		adx adx1 = d;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field adx d>
	//    2    4:astore_1        
		if(adx1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          21
		{
			adx1.a(((aee) (null)));
	//    5    9:aload_1         
	//    6   10:aconst_null     
	//    7   11:invokevirtual   #41  <Method void adx.a(aee)>
			d.e();
	//    8   14:aload_0         
	//    9   15:getfield        #37  <Field adx d>
	//   10   18:invokevirtual   #117 <Method void com.google.android.gms.internal.ads.adx.e()>
		}
		super.a();
	//   11   21:aload_0         
	//   12   22:invokespecial   #97  <Method void aeq.a()>
	//   13   25:return          
	}

	public final void a(int i)
	{
		d.d().b(i);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field adx d>
	//    2    4:invokevirtual   #120 <Method adw adx.d()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #124 <Method void adw.b(int)>
	//    5   11:return          
	}

	public final void a(int i, int j)
	{
	//    0    0:return          
	}

	public final void a(String s, Exception exception)
	{
		g = exception;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #104 <Field Exception g>
		wx.c("Precache error", ((Throwable) (exception)));
	//    3    5:ldc1            #128 <String "Precache error">
	//    4    7:aload_2         
	//    5    8:invokestatic    #133 <Method void wx.c(String, Throwable)>
		c(s);
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:invokespecial   #135 <Method void c(String)>
	//    9   16:return          
	}

	public final void a(boolean flag, long l)
	{
		add add1 = (add)c.get();
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field WeakReference c>
	//    2    4:invokevirtual   #145 <Method Object WeakReference.get()>
	//    3    7:checkcast       #28  <Class add>
	//    4   10:astore          4
		if(add1 != null)
	//*   5   12:aload           4
	//*   6   14:ifnull          36
			abj.a.execute(((Runnable) (new afd(add1, flag, l))));
	//    7   17:getstatic       #150 <Field Executor abj.a>
	//    8   20:new             #152 <Class afd>
	//    9   23:dup             
	//   10   24:aload           4
	//   11   26:iload_1         
	//   12   27:lload_2         
	//   13   28:invokespecial   #155 <Method void afd(add, boolean, long)>
	//   14   31:invokeinterface #161 <Method void Executor.execute(Runnable)>
	//   15   36:return          
	}

	public final boolean a(String s)
	{
		Object obj;
		Object obj2;
		String s1;
		e = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #99  <Field String e>
		s1 = ((aeq)this).b(s);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #102 <Method String aeq.b(String)>
	//    6   10:astore          20
		obj = "error";
	//    7   12:ldc1            #166 <String "error">
	//    8   14:astore          17
		obj2 = obj;
	//    9   16:aload           17
	//   10   18:astore          18
		Object obj3 = ((Object) (Uri.parse(s)));
	//   11   20:aload_1         
	//   12   21:invokestatic    #172 <Method Uri Uri.parse(String)>
	//   13   24:astore          19
		obj2 = obj;
	//   14   26:aload           17
	//   15   28:astore          18
		d.a(((Uri) (obj3)), b);
	//   16   30:aload_0         
	//   17   31:getfield        #37  <Field adx d>
	//   18   34:aload           19
	//   19   36:aload_0         
	//   20   37:getfield        #174 <Field String b>
	//   21   40:invokevirtual   #177 <Method void adx.a(Uri, String)>
		obj2 = obj;
	//   22   43:aload           17
	//   23   45:astore          18
		Object obj4 = ((Object) ((add)c.get()));
	//   24   47:aload_0         
	//   25   48:getfield        #139 <Field WeakReference c>
	//   26   51:invokevirtual   #145 <Method Object WeakReference.get()>
	//   27   54:checkcast       #28  <Class add>
	//   28   57:astore          21
		if(obj4 == null)
			break MISSING_BLOCK_LABEL_90;
	//   29   59:aload           21
	//   30   61:ifnull          90
		obj3 = obj;
	//   31   64:aload           17
	//   32   66:astore          19
		((add) (obj4)).a(s1, ((aeq) (this)));
	//   33   68:aload           21
	//   34   70:aload           20
	//   35   72:aload_0         
	//   36   73:invokeinterface #180 <Method void add.a(String, aeq)>
	//*  37   78:goto            90
	//*  38   81:astore          17
	//*  39   83:aload           19
	//*  40   85:astore          18
	//*  41   87:goto            612
		obj2 = obj;
	//   42   90:aload           17
	//   43   92:astore          18
		obj3 = ((Object) (aw.l()));
	//   44   94:invokestatic    #186 <Method e aw.l()>
	//   45   97:astore          19
		obj2 = obj;
	//   46   99:aload           17
	//   47  101:astore          18
		long l5 = ((e) (obj3)).a();
	//   48  103:aload           19
	//   49  105:invokeinterface #191 <Method long e.a()>
	//   50  110:lstore          12
		obj2 = obj;
	//   51  112:aload           17
	//   52  114:astore          18
		obj4 = ((Object) (p.r));
	//   53  116:getstatic       #197 <Field com.google.android.gms.internal.ads.e p.r>
	//   54  119:astore          21
		obj2 = obj;
	//   55  121:aload           17
	//   56  123:astore          18
		long l = ((Long)com.google.android.gms.internal.ads.bwk.e().a(((com.google.android.gms.internal.ads.e) (obj4)))).longValue();
	//   57  125:invokestatic    #202 <Method m com.google.android.gms.internal.ads.bwk.e()>
	//   58  128:aload           21
	//   59  130:invokevirtual   #207 <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//   60  133:checkcast       #209 <Class Long>
	//   61  136:invokevirtual   #212 <Method long Long.longValue()>
	//   62  139:lstore_2        
		obj2 = obj;
	//   63  140:aload           17
	//   64  142:astore          18
		obj4 = ((Object) (p.q));
	//   65  144:getstatic       #215 <Field com.google.android.gms.internal.ads.e p.q>
	//   66  147:astore          21
		obj2 = obj;
	//   67  149:aload           17
	//   68  151:astore          18
		long l2 = ((Long)com.google.android.gms.internal.ads.bwk.e().a(((com.google.android.gms.internal.ads.e) (obj4)))).longValue() * 1000L;
	//   69  153:invokestatic    #202 <Method m com.google.android.gms.internal.ads.bwk.e()>
	//   70  156:aload           21
	//   71  158:invokevirtual   #207 <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//   72  161:checkcast       #209 <Class Long>
	//   73  164:invokevirtual   #212 <Method long Long.longValue()>
	//   74  167:ldc2w           #216 <Long 1000L>
	//   75  170:lmul            
	//   76  171:lstore          6
		obj2 = obj;
	//   77  173:aload           17
	//   78  175:astore          18
		obj4 = ((Object) (p.p));
	//   79  177:getstatic       #220 <Field com.google.android.gms.internal.ads.e p.p>
	//   80  180:astore          21
		obj2 = obj;
	//   81  182:aload           17
	//   82  184:astore          18
		long l3 = ((Integer)com.google.android.gms.internal.ads.bwk.e().a(((com.google.android.gms.internal.ads.e) (obj4)))).intValue();
	//   83  186:invokestatic    #202 <Method m com.google.android.gms.internal.ads.bwk.e()>
	//   84  189:aload           21
	//   85  191:invokevirtual   #207 <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//   86  194:checkcast       #222 <Class Integer>
	//   87  197:invokevirtual   #225 <Method int Integer.intValue()>
	//   88  200:i2l             
	//   89  201:lstore          8
		long l1 = -1L;
	//   90  203:ldc2w           #226 <Long -1L>
	//   91  206:lstore          4
_L5:
		obj2 = obj;
	//   92  208:aload           17
	//   93  210:astore          18
		this;
	//   94  212:aload_0         
		JVM INSTR monitorenter ;
	//   95  213:monitorenter    
		if(((e) (obj3)).a() - l5 > l2) goto _L2; else goto _L1
	//   96  214:aload           19
	//   97  216:invokeinterface #191 <Method long e.a()>
	//   98  221:lload           12
	//   99  223:lsub            
	//  100  224:lload           6
	//  101  226:lcmp            
	//  102  227:ifgt            501
_L1:
		boolean flag = f;
	//  103  230:aload_0         
	//  104  231:getfield        #91  <Field boolean f>
	//  105  234:istore          16
		if(!flag)
			break MISSING_BLOCK_LABEL_275;
	//  106  236:iload           16
	//  107  238:ifeq            275
		obj3 = obj;
	//  108  241:aload           17
	//  109  243:astore          19
		if(g == null)
			break MISSING_BLOCK_LABEL_261;
	//  110  245:aload_0         
	//  111  246:getfield        #104 <Field Exception g>
	//  112  249:ifnull          261
		obj = "badUrl";
	//  113  252:ldc1            #106 <String "badUrl">
	//  114  254:astore          17
		throw g;
	//  115  256:aload_0         
	//  116  257:getfield        #104 <Field Exception g>
	//  117  260:athrow          
		obj = "externalAbort";
	//  118  261:ldc1            #113 <String "externalAbort">
	//  119  263:astore          17
		throw new IOException("Abort requested before buffering finished. ");
	//  120  265:new             #229 <Class IOException>
	//  121  268:dup             
	//  122  269:ldc1            #231 <String "Abort requested before buffering finished. ">
	//  123  271:invokespecial   #233 <Method void IOException(String)>
	//  124  274:athrow          
		flag = h;
	//  125  275:aload_0         
	//  126  276:getfield        #235 <Field boolean h>
	//  127  279:istore          16
		if(!flag)
			break MISSING_BLOCK_LABEL_294;
	//  128  281:iload           16
	//  129  283:ifeq            294
		obj3 = obj;
	//  130  286:aload           17
	//  131  288:astore          19
		this;
	//  132  290:aload_0         
		JVM INSTR monitorexit ;
	//  133  291:monitorexit     
		return true;
	//  134  292:iconst_1        
	//  135  293:ireturn         
		obj2 = ((Object) (d.a()));
	//  136  294:aload_0         
	//  137  295:getfield        #37  <Field adx d>
	//  138  298:invokevirtual   #238 <Method bct adx.a()>
	//  139  301:astore          18
		if(obj2 == null) goto _L4; else goto _L3
	//  140  303:aload           18
	//  141  305:ifnull          485
_L3:
		long l6 = ((bct) (obj2)).f();
	//  142  308:aload           18
	//  143  310:invokeinterface #242 <Method long bct.f()>
	//  144  315:lstore          14
		if(l6 <= 0L)
			break MISSING_BLOCK_LABEL_438;
	//  145  317:lload           14
	//  146  319:lconst_0        
	//  147  320:lcmp            
	//  148  321:ifle            438
		long l4 = ((bct) (obj2)).h();
	//  149  324:aload           18
	//  150  326:invokeinterface #244 <Method long bct.h()>
	//  151  331:lstore          10
		if(l4 == l1)
			break MISSING_BLOCK_LABEL_380;
	//  152  333:lload           10
	//  153  335:lload           4
	//  154  337:lcmp            
	//  155  338:ifeq            721
		boolean flag1;
		Object obj1;
		StringBuilder stringbuilder;
		if(l4 > 0L)
	//* 156  341:lload           10
	//* 157  343:lconst_0        
	//* 158  344:lcmp            
	//* 159  345:ifle            715
			flag1 = true;
	//  160  348:iconst_1        
	//  161  349:istore          16
		else
	//* 162  351:goto            354
	//* 163  354:aload_0         
	//* 164  355:aload_1         
	//* 165  356:aload           20
	//* 166  358:lload           10
	//* 167  360:lload           14
	//* 168  362:iload           16
	//* 169  364:invokestatic    #246 <Method int adx.b()>
	//* 170  367:invokestatic    #248 <Method int adx.c()>
	//* 171  370:invokevirtual   #251 <Method void aeq.a(String, String, long, long, boolean, int, int)>
	//* 172  373:lload           10
	//* 173  375:lstore          4
	//* 174  377:goto            380
	//* 175  380:lload           10
	//* 176  382:lload           14
	//* 177  384:lcmp            
	//* 178  385:iflt            401
	//* 179  388:aload_0         
	//* 180  389:aload_1         
	//* 181  390:aload           20
	//* 182  392:lload           14
	//* 183  394:invokevirtual   #254 <Method void aeq.a(String, String, long)>
	//* 184  397:aload_0         
	//* 185  398:monitorexit     
	//* 186  399:iconst_1        
	//* 187  400:ireturn         
	//* 188  401:aload_0         
	//* 189  402:getfield        #37  <Field adx d>
	//* 190  405:invokevirtual   #255 <Method long adx.f()>
	//* 191  408:lload           8
	//* 192  410:lcmp            
	//* 193  411:iflt            425
	//* 194  414:lload           10
	//* 195  416:lconst_0        
	//* 196  417:lcmp            
	//* 197  418:ifle            425
	//* 198  421:aload_0         
	//* 199  422:monitorexit     
	//* 200  423:iconst_1        
	//* 201  424:ireturn         
	//* 202  425:lload           4
	//* 203  427:lstore          10
	//* 204  429:lload_2         
	//* 205  430:lstore          4
	//* 206  432:lload           10
	//* 207  434:lstore_2        
	//* 208  435:goto            448
	//* 209  438:lload_2         
	//* 210  439:lstore          10
	//* 211  441:lload           4
	//* 212  443:lstore_2        
	//* 213  444:lload           10
	//* 214  446:lstore          4
	//* 215  448:aload_0         
	//* 216  449:lload           4
	//* 217  451:invokevirtual   #259 <Method void Object.wait(long)>
	//* 218  454:aload_0         
	//* 219  455:monitorexit     
	//* 220  456:lload           4
	//* 221  458:lstore          10
	//* 222  460:lload_2         
	//* 223  461:lstore          4
	//* 224  463:lload           10
	//* 225  465:lstore_2        
	//* 226  466:goto            208
	//* 227  469:ldc2            #261 <String "interrupted">
	//* 228  472:astore          17
	//* 229  474:new             #229 <Class IOException>
	//* 230  477:dup             
	//* 231  478:ldc2            #263 <String "Wait interrupted.">
	//* 232  481:invokespecial   #233 <Method void IOException(String)>
	//* 233  484:athrow          
	//* 234  485:ldc2            #265 <String "exoPlayerReleased">
	//* 235  488:astore          17
	//* 236  490:new             #229 <Class IOException>
	//* 237  493:dup             
	//* 238  494:ldc2            #267 <String "ExoPlayer was released during preloading.">
	//* 239  497:invokespecial   #233 <Method void IOException(String)>
	//* 240  500:athrow          
	//* 241  501:ldc2            #269 <String "downloadTimeout">
	//* 242  504:astore          18
	//* 243  506:aload           18
	//* 244  508:astore          17
	//* 245  510:new             #63  <Class StringBuilder>
	//* 246  513:dup             
	//* 247  514:bipush          47
	//* 248  516:invokespecial   #76  <Method void StringBuilder(int)>
	//* 249  519:astore          19
	//* 250  521:aload           18
	//* 251  523:astore          17
	//* 252  525:aload           19
	//* 253  527:ldc2            #271 <String "Timeout reached. Limit: ">
	//* 254  530:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//* 255  533:pop             
	//* 256  534:aload           18
	//* 257  536:astore          17
	//* 258  538:aload           19
	//* 259  540:lload           6
	//* 260  542:invokevirtual   #274 <Method StringBuilder StringBuilder.append(long)>
	//* 261  545:pop             
	//* 262  546:aload           18
	//* 263  548:astore          17
	//* 264  550:aload           19
	//* 265  552:ldc2            #276 <String " ms">
	//* 266  555:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//* 267  558:pop             
	//* 268  559:aload           18
	//* 269  561:astore          17
	//* 270  563:new             #229 <Class IOException>
	//* 271  566:dup             
	//* 272  567:aload           19
	//* 273  569:invokevirtual   #87  <Method String StringBuilder.toString()>
	//* 274  572:invokespecial   #233 <Method void IOException(String)>
	//* 275  575:athrow          
	//* 276  576:astore          18
	//* 277  578:goto            588
	//* 278  581:astore          18
	//* 279  583:goto            588
	//* 280  586:astore          18
	//* 281  588:aload           17
	//* 282  590:astore          19
	//* 283  592:aload_0         
	//* 284  593:monitorexit     
	//* 285  594:aload           17
	//* 286  596:astore          19
	//* 287  598:aload           18
	//* 288  600:athrow          
	//* 289  601:astore          18
	//* 290  603:aload           19
	//* 291  605:astore          17
	//* 292  607:goto            588
	//* 293  610:astore          17
	//* 294  612:aload           17
	//* 295  614:invokevirtual   #61  <Method String Exception.getMessage()>
	//* 296  617:astore          19
	//* 297  619:new             #63  <Class StringBuilder>
	//* 298  622:dup             
	//* 299  623:aload_1         
	//* 300  624:invokestatic    #69  <Method String String.valueOf(Object)>
	//* 301  627:invokevirtual   #73  <Method int String.length()>
	//* 302  630:bipush          34
	//* 303  632:iadd            
	//* 304  633:aload           19
	//* 305  635:invokestatic    #69  <Method String String.valueOf(Object)>
	//* 306  638:invokevirtual   #73  <Method int String.length()>
	//* 307  641:iadd            
	//* 308  642:invokespecial   #76  <Method void StringBuilder(int)>
	//* 309  645:astore          21
	//* 310  647:aload           21
	//* 311  649:ldc2            #278 <String "Failed to preload url ">
	//* 312  652:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//* 313  655:pop             
	//* 314  656:aload           21
	//* 315  658:aload_1         
	//* 316  659:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//* 317  662:pop             
	//* 318  663:aload           21
	//* 319  665:ldc2            #280 <String " Exception: ">
	//* 320  668:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//* 321  671:pop             
	//* 322  672:aload           21
	//* 323  674:aload           19
	//* 324  676:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//* 325  679:pop             
	//* 326  680:aload           21
	//* 327  682:invokevirtual   #87  <Method String StringBuilder.toString()>
	//* 328  685:invokestatic    #282 <Method void com.google.android.gms.internal.ads.wx.e(String)>
	//* 329  688:aload_0         
	//* 330  689:invokevirtual   #97  <Method void aeq.a()>
	//* 331  692:aload_0         
	//* 332  693:aload_1         
	//* 333  694:aload           20
	//* 334  696:aload           18
	//* 335  698:aload           18
	//* 336  700:aload           17
	//* 337  702:invokestatic    #108 <Method String b(String, Exception)>
	//* 338  705:invokevirtual   #111 <Method void aeq.a(String, String, String, String)>
	//* 339  708:iconst_0        
	//* 340  709:ireturn         
	//* 341  710:astore          17
	//* 342  712:goto            469
			flag1 = false;
	//  343  715:iconst_0        
	//  344  716:istore          16
		((aeq)this).a(s, s1, l4, l6, flag1, adx.b(), adx.c());
		l1 = l4;
		if(l4 < l6)
			break MISSING_BLOCK_LABEL_401;
		((aeq)this).a(s, s1, l6);
		this;
		JVM INSTR monitorexit ;
		return true;
		if(d.f() < l3 || l4 <= 0L)
			break MISSING_BLOCK_LABEL_425;
		this;
		JVM INSTR monitorexit ;
		return true;
		l4 = l1;
		l1 = l;
		l = l4;
		break MISSING_BLOCK_LABEL_448;
		l4 = l;
		l = l1;
		l1 = l4;
		((Object)this).wait(l1);
		this;
		JVM INSTR monitorexit ;
		l4 = l1;
		l1 = l;
		l = l4;
		  goto _L5
_L9:
		obj = "interrupted";
		throw new IOException("Wait interrupted.");
_L4:
		obj = "exoPlayerReleased";
		throw new IOException("ExoPlayer was released during preloading.");
_L2:
		obj2 = "downloadTimeout";
		obj = obj2;
		obj3 = ((Object) (new StringBuilder(47)));
		obj = obj2;
		((StringBuilder) (obj3)).append("Timeout reached. Limit: ");
		obj = obj2;
		((StringBuilder) (obj3)).append(l2);
		obj = obj2;
		((StringBuilder) (obj3)).append(" ms");
		obj = obj2;
		throw new IOException(((StringBuilder) (obj3)).toString());
		obj2;
		break MISSING_BLOCK_LABEL_588;
		obj2;
		break MISSING_BLOCK_LABEL_588;
		obj2;
_L7:
		obj3 = obj;
		this;
		JVM INSTR monitorexit ;
		obj3 = obj;
		try
		{
			throw obj2;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			obj2 = obj3;
		}
		break; /* Loop/switch isn't completed */
		obj2;
		obj = obj3;
		if(true) goto _L7; else goto _L6
		obj1;
_L6:
		obj3 = ((Object) (((Exception) (obj1)).getMessage()));
		stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 34 + String.valueOf(obj3).length());
		stringbuilder.append("Failed to preload url ");
		stringbuilder.append(s);
		stringbuilder.append(" Exception: ");
		stringbuilder.append(((String) (obj3)));
		com.google.android.gms.internal.ads.wx.e(stringbuilder.toString());
		((aeq)this).a();
		((aeq)this).a(s, s1, ((String) (obj2)), b(((String) (obj2)), ((Exception) (obj1))));
		return false;
		obj1;
		if(true) goto _L9; else goto _L8
_L8:
	//* 345  718:goto            354
	//* 346  721:goto            380
	}

	protected final String b(String s)
	{
		String s1 = String.valueOf("cache:");
	//    0    0:ldc2            #284 <String "cache:">
	//    1    3:invokestatic    #69  <Method String String.valueOf(Object)>
	//    2    6:astore_2        
		s = String.valueOf(((Object) (super.b(s))));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #102 <Method String aeq.b(String)>
	//    6   12:invokestatic    #69  <Method String String.valueOf(Object)>
	//    7   15:astore_1        
		if(s.length() != 0)
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #73  <Method int String.length()>
	//*  10   20:ifeq            29
			return s1.concat(s);
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #287 <Method String String.concat(String)>
	//   14   28:areturn         
		else
			return new String(s1);
	//   15   29:new             #65  <Class String>
	//   16   32:dup             
	//   17   33:aload_2         
	//   18   34:invokespecial   #288 <Method void String(String)>
	//   19   37:areturn         
	}

	public final void b()
	{
		c(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #135 <Method void c(String)>
	//    3    5:return          
	}

	public final void b(int i)
	{
	//    0    0:return          
	}

	public final adx c()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		h = true;
	//    2    2:aload_0         
	//    3    3:iconst_1        
	//    4    4:putfield        #235 <Field boolean h>
		((Object)this).notify();
	//    5    7:aload_0         
	//    6    8:invokevirtual   #95  <Method void Object.notify()>
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		d.a(((aee) (null)));
	//    9   13:aload_0         
	//   10   14:getfield        #37  <Field adx d>
	//   11   17:aconst_null     
	//   12   18:invokevirtual   #41  <Method void adx.a(aee)>
		adx adx1 = d;
	//   13   21:aload_0         
	//   14   22:getfield        #37  <Field adx d>
	//   15   25:astore_1        
		d = null;
	//   16   26:aload_0         
	//   17   27:aconst_null     
	//   18   28:putfield        #37  <Field adx d>
		return adx1;
	//   19   31:aload_1         
	//   20   32:areturn         
		Exception exception;
		exception;
	//   21   33:astore_1        
		this;
	//   22   34:aload_0         
		JVM INSTR monitorexit ;
	//   23   35:monitorexit     
		throw exception;
	//   24   36:aload_1         
	//   25   37:athrow          
	}

	public final void c(int i)
	{
		d.d().a(i);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field adx d>
	//    2    4:invokevirtual   #120 <Method adw adx.d()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #291 <Method void adw.a(int)>
	//    5   11:return          
	}

	public final void d(int i)
	{
		d.d().c(i);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field adx d>
	//    2    4:invokevirtual   #120 <Method adw adx.d()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #293 <Method void adw.c(int)>
	//    5   11:return          
	}

	public final void e(int i)
	{
		d.d().d(i);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field adx d>
	//    2    4:invokevirtual   #120 <Method adw adx.d()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #295 <Method void adw.d(int)>
	//    5   11:return          
	}

	private adx d;
	private String e;
	private boolean f;
	private Exception g;
	private boolean h;
}
