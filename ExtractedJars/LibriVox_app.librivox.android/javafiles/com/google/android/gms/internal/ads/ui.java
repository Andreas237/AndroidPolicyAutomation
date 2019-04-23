// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.*;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.ads.internal.gmsg.n;
import com.google.android.gms.common.util.e;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wt, uo, ur, uv, 
//			uw, uq, jv, kp, 
//			wx, we, zzasi, zv, 
//			uj, uk, un, abe, 
//			ul, zzwb

public final class ui extends wt
	implements uo, ur, uv
{

	public ui(Context context, String s, String s1, jv jv1, we we1, uw uw1, ur ur1, 
			long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void wt()>
		j = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #44  <Field int j>
		k = 3;
	//    5    9:aload_0         
	//    6   10:iconst_3        
	//    7   11:putfield        #46  <Field int k>
		c = context;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #48  <Field Context c>
		a = s;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #50  <Field String a>
		g = s1;
	//   14   24:aload_0         
	//   15   25:aload_3         
	//   16   26:putfield        #52  <Field String g>
		h = jv1;
	//   17   29:aload_0         
	//   18   30:aload           4
	//   19   32:putfield        #54  <Field jv h>
		b = we1;
	//   20   35:aload_0         
	//   21   36:aload           5
	//   22   38:putfield        #56  <Field we b>
		d = uw1;
	//   23   41:aload_0         
	//   24   42:aload           6
	//   25   44:putfield        #58  <Field uw d>
	//   26   47:aload_0         
	//   27   48:new             #60  <Class Object>
	//   28   51:dup             
	//   29   52:invokespecial   #61  <Method void Object()>
	//   30   55:putfield        #63  <Field Object f>
		e = ur1;
	//   31   58:aload_0         
	//   32   59:aload           7
	//   33   61:putfield        #65  <Field ur e>
		i = l1;
	//   34   64:aload_0         
	//   35   65:lload           8
	//   36   67:putfield        #67  <Field long i>
	//   37   70:return          
	}

	static Context a(ui ui1)
	{
		return ui1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Context c>
	//    2    4:areturn         
	}

	static void a(ui ui1, zzwb zzwb, kp kp1)
	{
		ui1.a(zzwb, kp1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #73  <Method void a(zzwb, kp)>
	//    4    6:return          
	}

	private final void a(zzwb zzwb, kp kp1)
	{
		d.b().a(((ur) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field uw d>
	//    2    4:invokevirtual   #80  <Method uq uw.b()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #85  <Method void uq.a(ur)>
		if("com.google.ads.mediation.admob.AdMobAdapter".equals(((Object) (a))))
	//*   5   11:ldc1            #87  <String "com.google.ads.mediation.admob.AdMobAdapter">
	//*   6   13:aload_0         
	//*   7   14:getfield        #50  <Field String a>
	//*   8   17:invokevirtual   #93  <Method boolean String.equals(Object)>
	//*   9   20:ifeq            42
		{
			kp1.a(zzwb, g, h.a);
	//   10   23:aload_2         
	//   11   24:aload_1         
	//   12   25:aload_0         
	//   13   26:getfield        #52  <Field String g>
	//   14   29:aload_0         
	//   15   30:getfield        #54  <Field jv h>
	//   16   33:getfield        #96  <Field String jv.a>
	//   17   36:invokeinterface #101 <Method void kp.a(zzwb, String, String)>
			return;
	//   18   41:return          
		}
		try
		{
			kp1.a(zzwb, g);
	//   19   42:aload_2         
	//   20   43:aload_1         
	//   21   44:aload_0         
	//   22   45:getfield        #52  <Field String g>
	//   23   48:invokeinterface #104 <Method void kp.a(zzwb, String)>
			return;
	//   24   53:return          
		}
		// Misplaced declaration of an exception variable
		catch(zzwb zzwb)
	//*  25   54:astore_1        
		{
			wx.c("Fail to load ad from adapter.", ((Throwable) (zzwb)));
	//   26   55:ldc1            #106 <String "Fail to load ad from adapter.">
	//   27   57:aload_1         
	//   28   58:invokestatic    #111 <Method void wx.c(String, Throwable)>
		}
		a(a, 0);
	//   29   61:aload_0         
	//   30   62:aload_0         
	//   31   63:getfield        #50  <Field String a>
	//   32   66:iconst_0        
	//   33   67:invokevirtual   #114 <Method void a(String, int)>
		return;
	//   34   70:return          
	}

	private final boolean a(long l1)
	{
		InterruptedException interruptedexception;
		l1 = i - (aw.l().b() - l1);
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field long i>
	//    2    4:invokestatic    #122 <Method e aw.l()>
	//    3    7:invokeinterface #127 <Method long e.b()>
	//    4   12:lload_1         
	//    5   13:lsub            
	//    6   14:lsub            
	//    7   15:lstore_1        
		if(l1 <= 0L)
	//*   8   16:lload_1         
	//*   9   17:lconst_0        
	//*  10   18:lcmp            
	//*  11   19:ifgt            29
		{
			k = 4;
	//   12   22:aload_0         
	//   13   23:iconst_4        
	//   14   24:putfield        #46  <Field int k>
			return false;
	//   15   27:iconst_0        
	//   16   28:ireturn         
		}
		try
		{
			f.wait(l1);
	//   17   29:aload_0         
	//   18   30:getfield        #63  <Field Object f>
	//   19   33:lload_1         
	//   20   34:invokevirtual   #131 <Method void Object.wait(long)>
		}
	//*  21   37:iconst_1        
	//*  22   38:ireturn         
	//*  23   39:invokestatic    #137 <Method Thread Thread.currentThread()>
	//*  24   42:invokevirtual   #140 <Method void Thread.interrupt()>
	//*  25   45:aload_0         
	//*  26   46:iconst_5        
	//*  27   47:putfield        #46  <Field int k>
	//*  28   50:iconst_0        
	//*  29   51:ireturn         
		// Misplaced declaration of an exception variable
		catch(InterruptedException interruptedexception)
		{
			Thread.currentThread().interrupt();
			k = 5;
			return false;
		}
		return true;
	//*  30   52:astore_3        
	//*  31   53:goto            39
	}

	static String b(ui ui1)
	{
		return ui1.g;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String g>
	//    2    4:areturn         
	}

	public final void a()
	{
		Object obj;
		Object obj1;
		Object obj2;
		obj = ((Object) (d));
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field uw d>
	//    2    4:astore          4
		if(obj == null || ((uw) (obj)).b() == null)
			break MISSING_BLOCK_LABEL_382;
	//    3    6:aload           4
	//    4    8:ifnull          382
	//    5   11:aload           4
	//    6   13:invokevirtual   #80  <Method uq uw.b()>
	//    7   16:ifnull          382
		if(d.a() == null)
	//*   8   19:aload_0         
	//*   9   20:getfield        #58  <Field uw d>
	//*  10   23:invokevirtual   #144 <Method kp uw.a()>
	//*  11   26:ifnonnull       30
			return;
	//   12   29:return          
		obj = ((Object) (d.b()));
	//   13   30:aload_0         
	//   14   31:getfield        #58  <Field uw d>
	//   15   34:invokevirtual   #80  <Method uq uw.b()>
	//   16   37:astore          4
		((uq) (obj)).a(((ur) (null)));
	//   17   39:aload           4
	//   18   41:aconst_null     
	//   19   42:invokevirtual   #85  <Method void uq.a(ur)>
		((uq) (obj)).a(((uo) (this)));
	//   20   45:aload           4
	//   21   47:aload_0         
	//   22   48:invokevirtual   #147 <Method void uq.a(uo)>
		((uq) (obj)).a(((uv) (this)));
	//   23   51:aload           4
	//   24   53:aload_0         
	//   25   54:invokevirtual   #150 <Method void uq.a(uv)>
		obj1 = ((Object) (b.a.c));
	//   26   57:aload_0         
	//   27   58:getfield        #56  <Field we b>
	//   28   61:getfield        #155 <Field zzasi we.a>
	//   29   64:getfield        #160 <Field zzwb zzasi.c>
	//   30   67:astore          5
		obj2 = ((Object) (d.a()));
	//   31   69:aload_0         
	//   32   70:getfield        #58  <Field uw d>
	//   33   73:invokevirtual   #144 <Method kp uw.a()>
	//   34   76:astore          6
		long l1;
label0:
		{
			if(((kp) (obj2)).g())
	//*  35   78:aload           6
	//*  36   80:invokeinterface #163 <Method boolean kp.g()>
	//*  37   85:ifeq            110
			{
				zv.a.post(((Runnable) (new uj(this, ((zzwb) (obj1)), ((kp) (obj2))))));
	//   38   88:getstatic       #168 <Field Handler zv.a>
	//   39   91:new             #170 <Class uj>
	//   40   94:dup             
	//   41   95:aload_0         
	//   42   96:aload           5
	//   43   98:aload           6
	//   44  100:invokespecial   #172 <Method void uj(ui, zzwb, kp)>
	//   45  103:invokevirtual   #178 <Method boolean Handler.post(Runnable)>
	//   46  106:pop             
				break label0;
	//   47  107:goto            152
			}
			try
			{
				zv.a.post(((Runnable) (new uk(this, ((kp) (obj2)), ((zzwb) (obj1)), ((uq) (obj))))));
	//   48  110:getstatic       #168 <Field Handler zv.a>
	//   49  113:new             #180 <Class uk>
	//   50  116:dup             
	//   51  117:aload_0         
	//   52  118:aload           6
	//   53  120:aload           5
	//   54  122:aload           4
	//   55  124:invokespecial   #183 <Method void uk(ui, kp, zzwb, uq)>
	//   56  127:invokevirtual   #178 <Method boolean Handler.post(Runnable)>
	//   57  130:pop             
			}
	//*  58  131:goto            152
			catch(RemoteException remoteexception)
	//*  59  134:astore          5
			{
				wx.c("Fail to check if adapter is initialized.", ((Throwable) (remoteexception)));
	//   60  136:ldc1            #185 <String "Fail to check if adapter is initialized.">
	//   61  138:aload           5
	//   62  140:invokestatic    #111 <Method void wx.c(String, Throwable)>
				a(a, 0);
	//   63  143:aload_0         
	//   64  144:aload_0         
	//   65  145:getfield        #50  <Field String a>
	//   66  148:iconst_0        
	//   67  149:invokevirtual   #114 <Method void a(String, int)>
			}
		}
		l1 = aw.l().b();
	//   68  152:invokestatic    #122 <Method e aw.l()>
	//   69  155:invokeinterface #127 <Method long e.b()>
	//   70  160:lstore_2        
_L5:
		remoteexception = ((RemoteException) (f));
	//   71  161:aload_0         
	//   72  162:getfield        #63  <Field Object f>
	//   73  165:astore          5
		remoteexception;
	//   74  167:aload           5
		JVM INSTR monitorenter ;
	//   75  169:monitorenter    
		if(j == 0) goto _L2; else goto _L1
	//   76  170:aload_0         
	//   77  171:getfield        #44  <Field int j>
	//   78  174:ifeq            254
_L1:
		obj2 = ((Object) ((new un()).a(aw.l().b() - l1)));
	//   79  177:new             #187 <Class un>
	//   80  180:dup             
	//   81  181:invokespecial   #188 <Method void un()>
	//   82  184:invokestatic    #122 <Method e aw.l()>
	//   83  187:invokeinterface #127 <Method long e.b()>
	//   84  192:lload_2         
	//   85  193:lsub            
	//   86  194:invokevirtual   #191 <Method un un.a(long)>
	//   87  197:astore          6
		int i1;
		if(1 == j)
	//*  88  199:iconst_1        
	//*  89  200:aload_0         
	//*  90  201:getfield        #44  <Field int j>
	//*  91  204:icmpne          213
		{
			i1 = 6;
	//   92  207:bipush          6
	//   93  209:istore_1        
			break MISSING_BLOCK_LABEL_218;
	//   94  210:goto            218
		}
		i1 = k;
	//   95  213:aload_0         
	//   96  214:getfield        #46  <Field int k>
	//   97  217:istore_1        
		l = ((un) (obj2)).a(i1).a(a).b(h.d).a();
	//   98  218:aload_0         
	//   99  219:aload           6
	//  100  221:iload_1         
	//  101  222:invokevirtual   #194 <Method un un.a(int)>
	//  102  225:aload_0         
	//  103  226:getfield        #50  <Field String a>
	//  104  229:invokevirtual   #197 <Method un un.a(String)>
	//  105  232:aload_0         
	//  106  233:getfield        #54  <Field jv h>
	//  107  236:getfield        #199 <Field String jv.d>
	//  108  239:invokevirtual   #201 <Method un un.b(String)>
	//  109  242:invokevirtual   #204 <Method ul un.a()>
	//  110  245:putfield        #206 <Field ul l>
		remoteexception;
	//  111  248:aload           5
		JVM INSTR monitorexit ;
	//  112  250:monitorexit     
		  goto _L3
	//* 113  251:goto            316
_L2:
		if(a(l1))
			break MISSING_BLOCK_LABEL_368;
	//  114  254:aload_0         
	//  115  255:lload_2         
	//  116  256:invokespecial   #208 <Method boolean a(long)>
	//  117  259:ifne            368
		l = (new un()).a(k).a(aw.l().b() - l1).a(a).b(h.d).a();
	//  118  262:aload_0         
	//  119  263:new             #187 <Class un>
	//  120  266:dup             
	//  121  267:invokespecial   #188 <Method void un()>
	//  122  270:aload_0         
	//  123  271:getfield        #46  <Field int k>
	//  124  274:invokevirtual   #194 <Method un un.a(int)>
	//  125  277:invokestatic    #122 <Method e aw.l()>
	//  126  280:invokeinterface #127 <Method long e.b()>
	//  127  285:lload_2         
	//  128  286:lsub            
	//  129  287:invokevirtual   #191 <Method un un.a(long)>
	//  130  290:aload_0         
	//  131  291:getfield        #50  <Field String a>
	//  132  294:invokevirtual   #197 <Method un un.a(String)>
	//  133  297:aload_0         
	//  134  298:getfield        #54  <Field jv h>
	//  135  301:getfield        #199 <Field String jv.d>
	//  136  304:invokevirtual   #201 <Method un un.b(String)>
	//  137  307:invokevirtual   #204 <Method ul un.a()>
	//  138  310:putfield        #206 <Field ul l>
		remoteexception;
	//  139  313:aload           5
		JVM INSTR monitorexit ;
	//  140  315:monitorexit     
_L3:
		((uq) (obj)).a(((ur) (null)));
	//  141  316:aload           4
	//  142  318:aconst_null     
	//  143  319:invokevirtual   #85  <Method void uq.a(ur)>
		((uq) (obj)).a(((uo) (null)));
	//  144  322:aload           4
	//  145  324:aconst_null     
	//  146  325:invokevirtual   #147 <Method void uq.a(uo)>
		if(j == 1)
	//* 147  328:aload_0         
	//* 148  329:getfield        #44  <Field int j>
	//* 149  332:iconst_1        
	//* 150  333:icmpne          350
		{
			e.a(a);
	//  151  336:aload_0         
	//  152  337:getfield        #65  <Field ur e>
	//  153  340:aload_0         
	//  154  341:getfield        #50  <Field String a>
	//  155  344:invokeinterface #211 <Method void ur.a(String)>
			return;
	//  156  349:return          
		} else
		{
			e.a(a, k);
	//  157  350:aload_0         
	//  158  351:getfield        #65  <Field ur e>
	//  159  354:aload_0         
	//  160  355:getfield        #50  <Field String a>
	//  161  358:aload_0         
	//  162  359:getfield        #46  <Field int k>
	//  163  362:invokeinterface #212 <Method void ur.a(String, int)>
			return;
	//  164  367:return          
		}
		remoteexception;
	//  165  368:aload           5
		JVM INSTR monitorexit ;
	//  166  370:monitorexit     
		if(true) goto _L5; else goto _L4
	//  167  371:goto            161
_L4:
		Exception exception;
		exception;
	//  168  374:astore          4
		remoteexception;
	//  169  376:aload           5
		JVM INSTR monitorexit ;
	//  170  378:monitorexit     
		throw exception;
	//  171  379:aload           4
	//  172  381:athrow          
	//  173  382:return          
	}

	public final void a(int i1)
	{
		a(a, 0);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #50  <Field String a>
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #114 <Method void a(String, int)>
	//    5    9:return          
	}

	public final void a(Bundle bundle)
	{
		n n1 = n;
	//    0    0:aload_0         
	//    1    1:getfield        #216 <Field n n>
	//    2    4:astore_2        
		if(n1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          18
			n1.a("", bundle);
	//    5    9:aload_2         
	//    6   10:ldc1            #218 <String "">
	//    7   12:aload_1         
	//    8   13:invokeinterface #223 <Method void n.a(String, Bundle)>
	//    9   18:return          
	}

	public final void a(n n1)
	{
		n = n1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #216 <Field n n>
	//    3    5:return          
	}

	public final void a(String s)
	{
		synchronized(f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field Object f>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			j = 1;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #44  <Field int j>
			f.notify();
	//    8   12:aload_0         
	//    9   13:getfield        #63  <Field Object f>
	//   10   16:invokevirtual   #227 <Method void Object.notify()>
		}
	//   11   19:aload_1         
	//   12   20:monitorexit     
		return;
	//   13   21:return          
		exception;
	//   14   22:astore_2        
		s;
	//   15   23:aload_1         
		JVM INSTR monitorexit ;
	//   16   24:monitorexit     
		throw exception;
	//   17   25:aload_2         
	//   18   26:athrow          
	}

	public final void a(String s, int i1)
	{
		synchronized(f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field Object f>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			j = 2;
	//    5    7:aload_0         
	//    6    8:iconst_2        
	//    7    9:putfield        #44  <Field int j>
			k = i1;
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:putfield        #46  <Field int k>
			f.notify();
	//   11   17:aload_0         
	//   12   18:getfield        #63  <Field Object f>
	//   13   21:invokevirtual   #227 <Method void Object.notify()>
		}
	//   14   24:aload_1         
	//   15   25:monitorexit     
		return;
	//   16   26:return          
		exception;
	//   17   27:astore_3        
		s;
	//   18   28:aload_1         
		JVM INSTR monitorexit ;
	//   19   29:monitorexit     
		throw exception;
	//   20   30:aload_3         
	//   21   31:athrow          
	}

	public final void b_()
	{
	//    0    0:return          
	}

	public final Future d()
	{
		Future future = m;
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field Future m>
	//    2    4:astore_1        
		if(future != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
		{
			return future;
	//    5    9:aload_1         
	//    6   10:areturn         
		} else
		{
			abe abe1 = (abe)((wt)this).c();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #234 <Method Object wt.c()>
	//    9   15:checkcast       #236 <Class abe>
	//   10   18:astore_1        
			m = ((Future) (abe1));
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #231 <Field Future m>
			return ((Future) (abe1));
	//   14   24:aload_1         
	//   15   25:areturn         
		}
	}

	public final ul e()
	{
		ul ul;
		synchronized(f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field Object f>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			ul = l;
	//    5    7:aload_0         
	//    6    8:getfield        #206 <Field ul l>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return ul;
	//   10   14:aload_2         
	//   11   15:areturn         
		exception;
	//   12   16:astore_2        
		obj;
	//   13   17:aload_1         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_2         
	//   16   20:athrow          
	}

	public final jv f()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field jv h>
	//    2    4:areturn         
	}

	public final void g()
	{
		a(b.a.c, d.a());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #56  <Field we b>
	//    3    5:getfield        #155 <Field zzasi we.a>
	//    4    8:getfield        #160 <Field zzwb zzasi.c>
	//    5   11:aload_0         
	//    6   12:getfield        #58  <Field uw d>
	//    7   15:invokevirtual   #144 <Method kp uw.a()>
	//    8   18:invokespecial   #73  <Method void a(zzwb, kp)>
	//    9   21:return          
	}

	public final String a;
	private final we b;
	private final Context c;
	private final uw d;
	private final ur e;
	private final Object f = new Object();
	private final String g;
	private final jv h;
	private final long i;
	private int j;
	private int k;
	private ul l;
	private Future m;
	private volatile n n;
}
