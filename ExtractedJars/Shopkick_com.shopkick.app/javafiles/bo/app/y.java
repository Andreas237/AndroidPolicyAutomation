// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import com.appboy.Appboy;
import com.appboy.AppboyInternal;
import com.appboy.events.IEventSubscriber;
import com.appboy.support.AppboyLogger;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

// Referenced classes of package bo.app:
//			aj, by, cc, bu, 
//			bl, ab, z, ai, 
//			am, ah, ap, ao, 
//			af, ac, ae, an, 
//			fe, fl, fg, dl, 
//			bo, q, dj, cz, 
//			dh, bb, bc, br, 
//			bf, co, cg, bt

public class y
{

	public y(Context context, bo bo, q q, bf bf, dj dj, cz cz, dh dh, 
			fl fl1, bb bb, bc bc, br br)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void Object()>
		a = new AtomicBoolean(false);
	//    2    4:aload_0         
	//    3    5:new             #77  <Class AtomicBoolean>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:invokespecial   #80  <Method void AtomicBoolean(boolean)>
	//    7   13:putfield        #82  <Field AtomicBoolean a>
		o = new AtomicBoolean(false);
	//    8   16:aload_0         
	//    9   17:new             #77  <Class AtomicBoolean>
	//   10   20:dup             
	//   11   21:iconst_0        
	//   12   22:invokespecial   #80  <Method void AtomicBoolean(boolean)>
	//   13   25:putfield        #84  <Field AtomicBoolean o>
		b = 0L;
	//   14   28:aload_0         
	//   15   29:lconst_0        
	//   16   30:putfield        #86  <Field long b>
		d = bo;
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:putfield        #88  <Field bo d>
		e = q;
	//   20   38:aload_0         
	//   21   39:aload_3         
	//   22   40:putfield        #90  <Field q e>
		f = ((bl) (bf));
	//   23   43:aload_0         
	//   24   44:aload           4
	//   25   46:putfield        #92  <Field bl f>
		g = context;
	//   26   49:aload_0         
	//   27   50:aload_1         
	//   28   51:putfield        #94  <Field Context g>
		h = dj;
	//   29   54:aload_0         
	//   30   55:aload           5
	//   31   57:putfield        #96  <Field dj h>
		i = cz;
	//   32   60:aload_0         
	//   33   61:aload           6
	//   34   63:putfield        #98  <Field cz i>
		j = dh;
	//   35   66:aload_0         
	//   36   67:aload           7
	//   37   69:putfield        #100 <Field dh j>
		k = fl1;
	//   38   72:aload_0         
	//   39   73:aload           8
	//   40   75:putfield        #102 <Field fl k>
		l = bb;
	//   41   78:aload_0         
	//   42   79:aload           9
	//   43   81:putfield        #104 <Field bb l>
		m = bc;
	//   44   84:aload_0         
	//   45   85:aload           10
	//   46   87:putfield        #106 <Field bc m>
		n = br;
	//   47   90:aload_0         
	//   48   91:aload           11
	//   49   93:putfield        #108 <Field br n>
	//   50   96:return          
	}

	static am a(y y1, am am1)
	{
		y1.p = am1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #111 <Field am p>
		return am1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static dh a(y y1)
	{
		return y1.j;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field dh j>
	//    2    4:areturn         
	}

	private void a(aj aj1)
	{
		try
		{
			aj1 = ((aj) (aj1.a()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #120 <Method by aj.a()>
	//    2    4:astore_1        
			cc cc1 = cc.a(((by) (aj1)).f());
	//    3    5:aload_1         
	//    4    6:invokevirtual   #125 <Method long by.f()>
	//    5    9:invokestatic    #130 <Method cc cc.a(long)>
	//    6   12:astore_2        
			((bu) (cc1)).a(((by) (aj1)).a());
	//    7   13:aload_2         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #133 <Method ca by.a()>
	//   10   18:invokeinterface #138 <Method void bu.a(ca)>
			f.a(((bu) (cc1)));
	//   11   23:aload_0         
	//   12   24:getfield        #92  <Field bl f>
	//   13   27:aload_2         
	//   14   28:invokeinterface #143 <Method boolean bl.a(bu)>
	//   15   33:pop             
			return;
	//   16   34:return          
		}
	//*  17   35:getstatic       #70  <Field String c>
	//*  18   38:ldc1            #145 <String "Could not create session end event.">
	//*  19   40:invokestatic    #149 <Method int AppboyLogger.w(String, String)>
	//*  20   43:pop             
	//*  21   44:return          
		// Misplaced declaration of an exception variable
		catch(aj aj1)
		{
			AppboyLogger.w(c, "Could not create session end event.");
		}
	//*  22   45:astore_1        
	//*  23   46:goto            35
	}

	static void a(y y1, aj aj1)
	{
		y1.a(aj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #152 <Method void a(aj)>
	//    3    5:return          
	}

	static cz b(y y1)
	{
		return y1.i;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field cz i>
	//    2    4:areturn         
	}

	static dj c(y y1)
	{
		return y1.h;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field dj h>
	//    2    4:areturn         
	}

	static bb d(y y1)
	{
		return y1.l;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field bb l>
	//    2    4:areturn         
	}

	static q e(y y1)
	{
		return y1.e;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field q e>
	//    2    4:areturn         
	}

	static bl f(y y1)
	{
		return y1.f;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field bl f>
	//    2    4:areturn         
	}

	static bo g(y y1)
	{
		return y1.d;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field bo d>
	//    2    4:areturn         
	}

	static Context h(y y1)
	{
		return y1.g;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field Context g>
	//    2    4:areturn         
	}

	static bc i(y y1)
	{
		return y1.m;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field bc m>
	//    2    4:areturn         
	}

	static br j(y y1)
	{
		return y1.n;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field br n>
	//    2    4:areturn         
	}

	static AtomicBoolean k(y y1)
	{
		return y1.o;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field AtomicBoolean o>
	//    2    4:areturn         
	}

	static fl l(y y1)
	{
		return y1.k;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field fl k>
	//    2    4:areturn         
	}

	static String o()
	{
		return c;
	//    0    0:getstatic       #70  <Field String c>
	//    1    3:areturn         
	}

	protected IEventSubscriber a()
	{
		return new IEventSubscriber() {

			public void a(ac ac1)
			{
				ac1 = ((ac) (ac1.a()));
			//    0    0:aload_1         
			//    1    1:invokevirtual   #27  <Method co ac.a()>
			//    2    4:astore_1        
				Object obj = ((Object) (((co) (ac1)).e()));
			//    3    5:aload_1         
			//    4    6:invokeinterface #33  <Method cg co.e()>
			//    5   11:astore_2        
				if(obj != null && ((cg) (obj)).c())
			//*   6   12:aload_2         
			//*   7   13:ifnull          34
			//*   8   16:aload_2         
			//*   9   17:invokevirtual   #39  <Method boolean cg.c()>
			//*  10   20:ifeq            34
					y.a(a).a(false);
			//   11   23:aload_0         
			//   12   24:getfield        #17  <Field y a>
			//   13   27:invokestatic    #42  <Method dh y.a(y)>
			//   14   30:iconst_0        
			//   15   31:invokevirtual   #47  <Method void dh.a(boolean)>
				obj = ((Object) (((co) (ac1)).c()));
			//   16   34:aload_1         
			//   17   35:invokeinterface #50  <Method ce co.c()>
			//   18   40:astore_2        
				if(obj != null)
			//*  19   41:aload_2         
			//*  20   42:ifnull          58
					y.b(a).b(obj, true);
			//   21   45:aload_0         
			//   22   46:getfield        #17  <Field y a>
			//   23   49:invokestatic    #54  <Method cz y.b(y)>
			//   24   52:aload_2         
			//   25   53:iconst_1        
			//   26   54:invokevirtual   #59  <Method boolean cz.b(Object, boolean)>
			//   27   57:pop             
				obj = ((Object) (((co) (ac1)).d()));
			//   28   58:aload_1         
			//   29   59:invokeinterface #63  <Method ch co.d()>
			//   30   64:astore_2        
				if(obj != null)
			//*  31   65:aload_2         
			//*  32   66:ifnull          82
					y.c(a).b(obj, true);
			//   33   69:aload_0         
			//   34   70:getfield        #17  <Field y a>
			//   35   73:invokestatic    #66  <Method dj y.c(y)>
			//   36   76:aload_2         
			//   37   77:iconst_1        
			//   38   78:invokevirtual   #69  <Method boolean dj.b(Object, boolean)>
			//   39   81:pop             
				ac1 = ((ac) (((co) (ac1)).f()));
			//   40   82:aload_1         
			//   41   83:invokeinterface #73  <Method bt co.f()>
			//   42   88:astore_1        
				if(ac1 != null)
			//*  43   89:aload_1         
			//*  44   90:ifnull          136
				{
					bu bu1;
					for(ac1 = ((ac) (((bt) (ac1)).a().iterator())); ((Iterator) (ac1)).hasNext(); y.d(a).b(bu1))
			//*  45   93:aload_1         
			//*  46   94:invokevirtual   #78  <Method Set bt.a()>
			//*  47   97:invokeinterface #84  <Method Iterator Set.iterator()>
			//*  48  102:astore_1        
			//*  49  103:aload_1         
			//*  50  104:invokeinterface #89  <Method boolean Iterator.hasNext()>
			//*  51  109:ifeq            136
						bu1 = (bu)((Iterator) (ac1)).next();
			//   52  112:aload_1         
			//   53  113:invokeinterface #93  <Method Object Iterator.next()>
			//   54  118:checkcast       #95  <Class bu>
			//   55  121:astore_2        

			//   56  122:aload_0         
			//   57  123:getfield        #17  <Field y a>
			//   58  126:invokestatic    #98  <Method bb y.d(y)>
			//   59  129:aload_2         
			//   60  130:invokevirtual   #103 <Method void bb.b(bu)>
				}
			//*  61  133:goto            103
			//   62  136:return          
			}

			public void trigger(Object obj)
			{
				a((ac)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #24  <Class ac>
			//    3    5:invokevirtual   #107 <Method void a(ac)>
			//    4    8:return          
			}

			final y a;

			
			{
				a = y.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field y a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #6   <Class y$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #168 <Method void y$1(y)>
	//    4    8:areturn         
	}

	protected IEventSubscriber a(Semaphore semaphore)
	{
		return new IEventSubscriber(semaphore) {

			public void a(Throwable throwable)
			{
				y.f(b).a(throwable);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field y b>
			//    2    4:invokestatic    #32  <Method bl y.f(y)>
			//    3    7:aload_1         
			//    4    8:invokeinterface #36  <Method void bl.a(Throwable)>
				throwable = ((Throwable) (a));
			//    5   13:aload_0         
			//    6   14:getfield        #21  <Field Semaphore a>
			//    7   17:astore_1        
				if(throwable == null) goto _L2; else goto _L1
			//    8   18:aload_1         
			//    9   19:ifnull          54
_L1:
				((Semaphore) (throwable)).release();
			//   10   22:aload_1         
			//   11   23:invokevirtual   #41  <Method void Semaphore.release()>
				return;
			//   12   26:return          
				throwable;
			//   13   27:astore_1        
				break MISSING_BLOCK_LABEL_55;
			//   14   28:goto            55
				throwable;
			//   15   31:astore_1        
				AppboyLogger.e(y.o(), "Failed to log error.", throwable);
			//   16   32:invokestatic    #45  <Method String y.o()>
			//   17   35:ldc1            #47  <String "Failed to log error.">
			//   18   37:aload_1         
			//   19   38:invokestatic    #53  <Method int AppboyLogger.e(String, String, Throwable)>
			//   20   41:pop             
				throwable = ((Throwable) (a));
			//   21   42:aload_0         
			//   22   43:getfield        #21  <Field Semaphore a>
			//   23   46:astore_1        
				if(throwable == null) goto _L2; else goto _L1
			//   24   47:aload_1         
			//   25   48:ifnull          54
			//*  26   51:goto            22
_L2:
				return;
			//   27   54:return          
				Semaphore semaphore1 = a;
			//   28   55:aload_0         
			//   29   56:getfield        #21  <Field Semaphore a>
			//   30   59:astore_2        
				if(semaphore1 != null)
			//*  31   60:aload_2         
			//*  32   61:ifnull          68
					semaphore1.release();
			//   33   64:aload_2         
			//   34   65:invokevirtual   #41  <Method void Semaphore.release()>
				throw throwable;
			//   35   68:aload_1         
			//   36   69:athrow          
			}

			public void trigger(Object obj)
			{
				a((Throwable)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #57  <Class Throwable>
			//    3    5:invokevirtual   #58  <Method void a(Throwable)>
			//    4    8:return          
			}

			final Semaphore a;
			final y b;

			
			{
				b = y.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field y b>
				a = semaphore;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Semaphore a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//    0    0:new             #16  <Class y$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #174 <Method void y$3(y, Semaphore)>
	//    5    9:areturn         
	}

	public void a(z z1)
	{
		z1.a(b(), bo/app/ab);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #178 <Method IEventSubscriber b()>
	//    3    5:ldc1            #180 <Class ab>
	//    4    7:invokevirtual   #185 <Method boolean z.a(IEventSubscriber, Class)>
	//    5   10:pop             
		z1.a(e(), bo/app/ai);
	//    6   11:aload_1         
	//    7   12:aload_0         
	//    8   13:invokevirtual   #187 <Method IEventSubscriber e()>
	//    9   16:ldc1            #189 <Class ai>
	//   10   18:invokevirtual   #185 <Method boolean z.a(IEventSubscriber, Class)>
	//   11   21:pop             
		z1.a(g(), bo/app/aj);
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #191 <Method IEventSubscriber g()>
	//   15   27:ldc1            #117 <Class aj>
	//   16   29:invokevirtual   #185 <Method boolean z.a(IEventSubscriber, Class)>
	//   17   32:pop             
		z1.a(j(), bo/app/am);
	//   18   33:aload_1         
	//   19   34:aload_0         
	//   20   35:invokevirtual   #193 <Method IEventSubscriber j()>
	//   21   38:ldc1            #195 <Class am>
	//   22   40:invokevirtual   #185 <Method boolean z.a(IEventSubscriber, Class)>
	//   23   43:pop             
		z1.a(h(), bo/app/ah);
	//   24   44:aload_1         
	//   25   45:aload_0         
	//   26   46:invokevirtual   #197 <Method IEventSubscriber h()>
	//   27   49:ldc1            #199 <Class ah>
	//   28   51:invokevirtual   #185 <Method boolean z.a(IEventSubscriber, Class)>
	//   29   54:pop             
		z1.a(a(((Semaphore) (null))), java/lang/Throwable);
	//   30   55:aload_1         
	//   31   56:aload_0         
	//   32   57:aconst_null     
	//   33   58:invokevirtual   #201 <Method IEventSubscriber a(Semaphore)>
	//   34   61:ldc1            #203 <Class Throwable>
	//   35   63:invokevirtual   #185 <Method boolean z.a(IEventSubscriber, Class)>
	//   36   66:pop             
		z1.a(n(), bo/app/ap);
	//   37   67:aload_1         
	//   38   68:aload_0         
	//   39   69:invokevirtual   #205 <Method IEventSubscriber n()>
	//   40   72:ldc1            #207 <Class ap>
	//   41   74:invokevirtual   #185 <Method boolean z.a(IEventSubscriber, Class)>
	//   42   77:pop             
		z1.a(k(), bo/app/ao);
	//   43   78:aload_1         
	//   44   79:aload_0         
	//   45   80:invokevirtual   #209 <Method IEventSubscriber k()>
	//   46   83:ldc1            #211 <Class ao>
	//   47   85:invokevirtual   #185 <Method boolean z.a(IEventSubscriber, Class)>
	//   48   88:pop             
		z1.a(f(), bo/app/af);
	//   49   89:aload_1         
	//   50   90:aload_0         
	//   51   91:invokevirtual   #213 <Method IEventSubscriber f()>
	//   52   94:ldc1            #215 <Class af>
	//   53   96:invokevirtual   #185 <Method boolean z.a(IEventSubscriber, Class)>
	//   54   99:pop             
		z1.a(a(), bo/app/ac);
	//   55  100:aload_1         
	//   56  101:aload_0         
	//   57  102:invokevirtual   #217 <Method IEventSubscriber a()>
	//   58  105:ldc1            #219 <Class ac>
	//   59  107:invokevirtual   #185 <Method boolean z.a(IEventSubscriber, Class)>
	//   60  110:pop             
		z1.a(i(), bo/app/ae);
	//   61  111:aload_1         
	//   62  112:aload_0         
	//   63  113:invokevirtual   #221 <Method IEventSubscriber i()>
	//   64  116:ldc1            #223 <Class ae>
	//   65  118:invokevirtual   #185 <Method boolean z.a(IEventSubscriber, Class)>
	//   66  121:pop             
		z1.a(l(), bo/app/an);
	//   67  122:aload_1         
	//   68  123:aload_0         
	//   69  124:invokevirtual   #225 <Method IEventSubscriber l()>
	//   70  127:ldc1            #227 <Class an>
	//   71  129:invokevirtual   #185 <Method boolean z.a(IEventSubscriber, Class)>
	//   72  132:pop             
	//   73  133:return          
	}

	protected IEventSubscriber b()
	{
		return new IEventSubscriber() {

			public void a(ab ab1)
			{
				ab1 = ((ab) (ab1.a()));
			//    0    0:aload_1         
			//    1    1:invokevirtual   #28  <Method co ab.a()>
			//    2    4:astore_1        
				Object obj = ((Object) (((co) (ab1)).e()));
			//    3    5:aload_1         
			//    4    6:invokeinterface #34  <Method cg co.e()>
			//    5   11:astore_2        
				if(obj != null)
			//*   6   12:aload_2         
			//*   7   13:ifnull          55
				{
					if(((cg) (obj)).d())
			//*   8   16:aload_2         
			//*   9   17:invokevirtual   #40  <Method boolean cg.d()>
			//*  10   20:ifeq            37
					{
						a.c();
			//   11   23:aload_0         
			//   12   24:getfield        #18  <Field y a>
			//   13   27:invokevirtual   #43  <Method void y.c()>
						a.d();
			//   14   30:aload_0         
			//   15   31:getfield        #18  <Field y a>
			//   16   34:invokevirtual   #45  <Method void y.d()>
					}
					if(((cg) (obj)).c())
			//*  17   37:aload_2         
			//*  18   38:invokevirtual   #47  <Method boolean cg.c()>
			//*  19   41:ifeq            55
						y.a(a).a(true);
			//   20   44:aload_0         
			//   21   45:getfield        #18  <Field y a>
			//   22   48:invokestatic    #50  <Method dh y.a(y)>
			//   23   51:iconst_1        
			//   24   52:invokevirtual   #55  <Method void dh.a(boolean)>
				}
				obj = ((Object) (((co) (ab1)).c()));
			//   25   55:aload_1         
			//   26   56:invokeinterface #58  <Method ce co.c()>
			//   27   61:astore_2        
				if(obj != null)
			//*  28   62:aload_2         
			//*  29   63:ifnull          79
					y.b(a).b(obj, false);
			//   30   66:aload_0         
			//   31   67:getfield        #18  <Field y a>
			//   32   70:invokestatic    #61  <Method cz y.b(y)>
			//   33   73:aload_2         
			//   34   74:iconst_0        
			//   35   75:invokevirtual   #66  <Method boolean cz.b(Object, boolean)>
			//   36   78:pop             
				obj = ((Object) (((co) (ab1)).d()));
			//   37   79:aload_1         
			//   38   80:invokeinterface #69  <Method ch co.d()>
			//   39   85:astore_2        
				if(obj != null)
			//*  40   86:aload_2         
			//*  41   87:ifnull          103
					y.c(a).b(obj, false);
			//   42   90:aload_0         
			//   43   91:getfield        #18  <Field y a>
			//   44   94:invokestatic    #72  <Method dj y.c(y)>
			//   45   97:aload_2         
			//   46   98:iconst_0        
			//   47   99:invokevirtual   #75  <Method boolean dj.b(Object, boolean)>
			//   48  102:pop             
				ab1 = ((ab) (((co) (ab1)).f()));
			//   49  103:aload_1         
			//   50  104:invokeinterface #79  <Method bt co.f()>
			//   51  109:astore_1        
				if(ab1 != null)
			//*  52  110:aload_1         
			//*  53  111:ifnull          159
				{
					bu bu1;
					for(ab1 = ((ab) (((bt) (ab1)).a().iterator())); ((Iterator) (ab1)).hasNext(); y.e(a).a(bu1))
			//*  54  114:aload_1         
			//*  55  115:invokevirtual   #84  <Method Set bt.a()>
			//*  56  118:invokeinterface #90  <Method Iterator Set.iterator()>
			//*  57  123:astore_1        
			//*  58  124:aload_1         
			//*  59  125:invokeinterface #95  <Method boolean Iterator.hasNext()>
			//*  60  130:ifeq            159
						bu1 = (bu)((Iterator) (ab1)).next();
			//   61  133:aload_1         
			//   62  134:invokeinterface #99  <Method Object Iterator.next()>
			//   63  139:checkcast       #101 <Class bu>
			//   64  142:astore_2        

			//   65  143:aload_0         
			//   66  144:getfield        #18  <Field y a>
			//   67  147:invokestatic    #104 <Method q y.e(y)>
			//   68  150:aload_2         
			//   69  151:invokeinterface #109 <Method void q.a(bu)>
				}
			//*  70  156:goto            124
			//   71  159:return          
			}

			public void trigger(Object obj)
			{
				a((ab)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #25  <Class ab>
			//    3    5:invokevirtual   #113 <Method void a(ab)>
			//    4    8:return          
			}

			final y a;

			
			{
				a = y.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field y a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #20  <Class y$5>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #228 <Method void y$5(y)>
	//    4    8:areturn         
	}

	protected void c()
	{
		if(a.compareAndSet(true, false))
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field AtomicBoolean a>
	//*   2    4:iconst_1        
	//*   3    5:iconst_0        
	//*   4    6:invokevirtual   #233 <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//*   5    9:ifeq            28
			k.a(((fb) (new fe())));
	//    6   12:aload_0         
	//    7   13:getfield        #102 <Field fl k>
	//    8   16:new             #235 <Class fe>
	//    9   19:dup             
	//   10   20:invokespecial   #236 <Method void fe()>
	//   11   23:invokeinterface #241 <Method void fl.a(fb)>
	//   12   28:return          
	}

	protected void d()
	{
		if(o.compareAndSet(true, false) && p.a() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field AtomicBoolean o>
	//*   2    4:iconst_1        
	//*   3    5:iconst_0        
	//*   4    6:invokevirtual   #233 <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//*   5    9:ifeq            57
	//*   6   12:aload_0         
	//*   7   13:getfield        #111 <Field am p>
	//*   8   16:invokevirtual   #244 <Method String am.a()>
	//*   9   19:ifnull          57
		{
			k.a(((fb) (new fg(p.a(), p.b()))));
	//   10   22:aload_0         
	//   11   23:getfield        #102 <Field fl k>
	//   12   26:new             #246 <Class fg>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:getfield        #111 <Field am p>
	//   16   34:invokevirtual   #244 <Method String am.a()>
	//   17   37:aload_0         
	//   18   38:getfield        #111 <Field am p>
	//   19   41:invokevirtual   #249 <Method bu am.b()>
	//   20   44:invokespecial   #252 <Method void fg(String, bu)>
	//   21   47:invokeinterface #241 <Method void fl.a(fb)>
			p = null;
	//   22   52:aload_0         
	//   23   53:aconst_null     
	//   24   54:putfield        #111 <Field am p>
		}
	//   25   57:return          
	}

	protected IEventSubscriber e()
	{
		return new IEventSubscriber() {

			public void a(ai ai1)
			{
				AppboyLogger.d(y.o(), "Session start event for new session received.");
			//    0    0:invokestatic    #27  <Method String y.o()>
			//    1    3:ldc1            #29  <String "Session start event for new session received.">
			//    2    5:invokestatic    #35  <Method int AppboyLogger.d(String, String)>
			//    3    8:pop             
				ai1 = ((ai) (cc.i()));
			//    4    9:invokestatic    #41  <Method cc cc.i()>
			//    5   12:astore_1        
				y.f(a).a(((bu) (ai1)));
			//    6   13:aload_0         
			//    7   14:getfield        #18  <Field y a>
			//    8   17:invokestatic    #45  <Method bl y.f(y)>
			//    9   20:aload_1         
			//   10   21:invokeinterface #50  <Method boolean bl.a(bu)>
			//   11   26:pop             
				y.g(a).b();
			//   12   27:aload_0         
			//   13   28:getfield        #18  <Field y a>
			//   14   31:invokestatic    #54  <Method bo y.g(y)>
			//   15   34:invokeinterface #60  <Method boolean bo.b()>
			//   16   39:pop             
				y.g(a).c();
			//   17   40:aload_0         
			//   18   41:getfield        #18  <Field y a>
			//   19   44:invokestatic    #54  <Method bo y.g(y)>
			//   20   47:invokeinterface #63  <Method boolean bo.c()>
			//   21   52:pop             
				a.m();
			//   22   53:aload_0         
			//   23   54:getfield        #18  <Field y a>
			//   24   57:invokevirtual   #66  <Method void y.m()>
				AppboyInternal.requestGeofenceRefresh(y.h(a), false);
			//   25   60:aload_0         
			//   26   61:getfield        #18  <Field y a>
			//   27   64:invokestatic    #70  <Method Context y.h(y)>
			//   28   67:iconst_0        
			//   29   68:invokestatic    #76  <Method void AppboyInternal.requestGeofenceRefresh(Context, boolean)>
				y.c(a).d();
			//   30   71:aload_0         
			//   31   72:getfield        #18  <Field y a>
			//   32   75:invokestatic    #79  <Method dj y.c(y)>
			//   33   78:invokevirtual   #83  <Method void dj.d()>
			//   34   81:return          
			}

			public void trigger(Object obj)
			{
				a((ai)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #87  <Class ai>
			//    3    5:invokevirtual   #89  <Method void a(ai)>
			//    4    8:return          
			}

			final y a;

			
			{
				a = y.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field y a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #22  <Class y$6>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #253 <Method void y$6(y)>
	//    4    8:areturn         
	}

	protected IEventSubscriber f()
	{
		return new IEventSubscriber() {

			public void a(af af1)
			{
				a.m();
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field y a>
			//    2    4:invokevirtual   #26  <Method void y.m()>
			//    3    7:return          
			}

			public void trigger(Object obj)
			{
				a((af)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #30  <Class af>
			//    3    5:invokevirtual   #32  <Method void a(af)>
			//    4    8:return          
			}

			final y a;

			
			{
				a = y.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field y a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #24  <Class y$7>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #255 <Method void y$7(y)>
	//    4    8:areturn         
	}

	protected IEventSubscriber g()
	{
		return new IEventSubscriber() {

			public void a(aj aj1)
			{
				y.a(a, aj1);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field y a>
			//    2    4:aload_1         
			//    3    5:invokestatic    #26  <Method void y.a(y, aj)>
				Appboy.getInstance(y.h(a)).requestImmediateDataFlush();
			//    4    8:aload_0         
			//    5    9:getfield        #18  <Field y a>
			//    6   12:invokestatic    #30  <Method Context y.h(y)>
			//    7   15:invokestatic    #36  <Method Appboy Appboy.getInstance(Context)>
			//    8   18:invokevirtual   #39  <Method void Appboy.requestImmediateDataFlush()>
			//    9   21:return          
			}

			public void trigger(Object obj)
			{
				a((aj)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #43  <Class aj>
			//    3    5:invokevirtual   #45  <Method void a(aj)>
			//    4    8:return          
			}

			final y a;

			
			{
				a = y.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field y a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #26  <Class y$8>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #257 <Method void y$8(y)>
	//    4    8:areturn         
	}

	protected IEventSubscriber h()
	{
		return new IEventSubscriber() {

			public void a(ah ah1)
			{
				y.g(a).a(ah1.a());
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field y a>
			//    2    4:invokestatic    #27  <Method bo y.g(y)>
			//    3    7:aload_1         
			//    4    8:invokevirtual   #32  <Method bz ah.a()>
			//    5   11:invokeinterface #37  <Method void bo.a(bz)>
				y.i(a).a(ah1.a());
			//    6   16:aload_0         
			//    7   17:getfield        #18  <Field y a>
			//    8   20:invokestatic    #41  <Method bc y.i(y)>
			//    9   23:aload_1         
			//   10   24:invokevirtual   #32  <Method bz ah.a()>
			//   11   27:invokevirtual   #44  <Method void bc.a(bz)>
				y.j(a).a(ah1.a());
			//   12   30:aload_0         
			//   13   31:getfield        #18  <Field y a>
			//   14   34:invokestatic    #48  <Method br y.j(y)>
			//   15   37:aload_1         
			//   16   38:invokevirtual   #32  <Method bz ah.a()>
			//   17   41:invokevirtual   #51  <Method void br.a(bz)>
			//   18   44:return          
			}

			public void trigger(Object obj)
			{
				a((ah)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #29  <Class ah>
			//    3    5:invokevirtual   #55  <Method void a(ah)>
			//    4    8:return          
			}

			final y a;

			
			{
				a = y.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field y a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #28  <Class y$9>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #259 <Method void y$9(y)>
	//    4    8:areturn         
	}

	protected IEventSubscriber i()
	{
		return new IEventSubscriber() {

			public void a(ae ae1)
			{
				y.i(a).a(ae1.a());
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field y a>
			//    2    4:invokestatic    #26  <Method bc y.i(y)>
			//    3    7:aload_1         
			//    4    8:invokevirtual   #31  <Method java.util.List ae.a()>
			//    5   11:invokevirtual   #36  <Method void bc.a(java.util.List)>
			//    6   14:return          
			}

			public void trigger(Object obj)
			{
				a((ae)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #28  <Class ae>
			//    3    5:invokevirtual   #40  <Method void a(ae)>
			//    4    8:return          
			}

			final y a;

			
			{
				a = y.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field y a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #8   <Class y$10>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #261 <Method void y$10(y)>
	//    4    8:areturn         
	}

	protected IEventSubscriber j()
	{
		return new IEventSubscriber() {

			public void a(am am1)
			{
				y.k(a).set(true);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field y a>
			//    2    4:invokestatic    #27  <Method AtomicBoolean y.k(y)>
			//    3    7:iconst_1        
			//    4    8:invokevirtual   #33  <Method void AtomicBoolean.set(boolean)>
				y.a(a, am1);
			//    5   11:aload_0         
			//    6   12:getfield        #18  <Field y a>
			//    7   15:aload_1         
			//    8   16:invokestatic    #36  <Method am y.a(y, am)>
			//    9   19:pop             
				AppboyLogger.i(y.o(), "Requesting trigger update due to trigger-eligible push click event");
			//   10   20:invokestatic    #40  <Method String y.o()>
			//   11   23:ldc1            #42  <String "Requesting trigger update due to trigger-eligible push click event">
			//   12   25:invokestatic    #48  <Method int AppboyLogger.i(String, String)>
			//   13   28:pop             
				y.f(a).a((new cg.a()).b());
			//   14   29:aload_0         
			//   15   30:getfield        #18  <Field y a>
			//   16   33:invokestatic    #52  <Method bl y.f(y)>
			//   17   36:new             #54  <Class cg$a>
			//   18   39:dup             
			//   19   40:invokespecial   #55  <Method void cg$a()>
			//   20   43:invokevirtual   #59  <Method cg$a cg$a.b()>
			//   21   46:invokeinterface #64  <Method void bl.a(cg$a)>
			//   22   51:return          
			}

			public void trigger(Object obj)
			{
				a((am)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #68  <Class am>
			//    3    5:invokevirtual   #70  <Method void a(am)>
			//    4    8:return          
			}

			final y a;

			
			{
				a = y.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field y a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #10  <Class y$11>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #263 <Method void y$11(y)>
	//    4    8:areturn         
	}

	protected IEventSubscriber k()
	{
		return new IEventSubscriber() {

			public void a(ao ao1)
			{
				y.l(a).a(ao1.a());
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field y a>
			//    2    4:invokestatic    #27  <Method fl y.l(y)>
			//    3    7:aload_1         
			//    4    8:invokevirtual   #32  <Method java.util.List ao.a()>
			//    5   11:invokeinterface #37  <Method void fl.a(java.util.List)>
				a.c();
			//    6   16:aload_0         
			//    7   17:getfield        #18  <Field y a>
			//    8   20:invokevirtual   #40  <Method void y.c()>
				a.d();
			//    9   23:aload_0         
			//   10   24:getfield        #18  <Field y a>
			//   11   27:invokevirtual   #43  <Method void y.d()>
			//   12   30:return          
			}

			public void trigger(Object obj)
			{
				a((ao)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #29  <Class ao>
			//    3    5:invokevirtual   #47  <Method void a(ao)>
			//    4    8:return          
			}

			final y a;

			
			{
				a = y.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field y a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #12  <Class y$12>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #265 <Method void y$12(y)>
	//    4    8:areturn         
	}

	protected IEventSubscriber l()
	{
		return new IEventSubscriber() {

			public void a(an an1)
			{
				y.l(a).a(an1.a());
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field y a>
			//    2    4:invokestatic    #26  <Method fl y.l(y)>
			//    3    7:aload_1         
			//    4    8:invokevirtual   #31  <Method fb an.a()>
			//    5   11:invokeinterface #36  <Method void fl.a(fb)>
			//    6   16:return          
			}

			public void trigger(Object obj)
			{
				a((an)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #28  <Class an>
			//    3    5:invokevirtual   #40  <Method void a(an)>
			//    4    8:return          
			}

			final y a;

			
			{
				a = y.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field y a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #14  <Class y$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #267 <Method void y$2(y)>
	//    4    8:areturn         
	}

	void m()
	{
		if(b + 5L < dl.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field long b>
	//*   2    4:ldc2w           #269 <Long 5L>
	//*   3    7:ladd            
	//*   4    8:invokestatic    #274 <Method long dl.a()>
	//*   5   11:lcmp            
	//*   6   12:ifge            59
		{
			a.set(true);
	//    7   15:aload_0         
	//    8   16:getfield        #82  <Field AtomicBoolean a>
	//    9   19:iconst_1        
	//   10   20:invokevirtual   #277 <Method void AtomicBoolean.set(boolean)>
			AppboyLogger.d(c, "Requesting trigger refresh.");
	//   11   23:getstatic       #70  <Field String c>
	//   12   26:ldc2            #279 <String "Requesting trigger refresh.">
	//   13   29:invokestatic    #281 <Method int AppboyLogger.d(String, String)>
	//   14   32:pop             
			f.a((new cg.a()).b());
	//   15   33:aload_0         
	//   16   34:getfield        #92  <Field bl f>
	//   17   37:new             #283 <Class cg$a>
	//   18   40:dup             
	//   19   41:invokespecial   #284 <Method void cg$a()>
	//   20   44:invokevirtual   #287 <Method cg$a cg$a.b()>
	//   21   47:invokeinterface #290 <Method void bl.a(cg$a)>
			b = dl.a();
	//   22   52:aload_0         
	//   23   53:invokestatic    #274 <Method long dl.a()>
	//   24   56:putfield        #86  <Field long b>
		}
	//   25   59:return          
	}

	protected IEventSubscriber n()
	{
		return new IEventSubscriber() {

			public void a(ap ap1)
			{
				try
				{
					y.f(a).a(ap1);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field y a>
			//    2    4:invokestatic    #29  <Method bl y.f(y)>
			//    3    7:aload_1         
			//    4    8:invokeinterface #33  <Method void bl.a(ap)>
					return;
			//    5   13:return          
				}
				// Misplaced declaration of an exception variable
				catch(ap ap1)
			//*   6   14:astore_1        
				{
					AppboyLogger.e(y.o(), "Failed to log the database exception.", ((Throwable) (ap1)));
			//    7   15:invokestatic    #37  <Method String y.o()>
			//    8   18:ldc1            #39  <String "Failed to log the database exception.">
			//    9   20:aload_1         
			//   10   21:invokestatic    #45  <Method int AppboyLogger.e(String, String, Throwable)>
			//   11   24:pop             
				}
			//   12   25:return          
			}

			public void trigger(Object obj)
			{
				a((ap)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #49  <Class ap>
			//    3    5:invokevirtual   #50  <Method void a(ap)>
			//    4    8:return          
			}

			final y a;

			
			{
				a = y.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field y a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #18  <Class y$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #291 <Method void y$4(y)>
	//    4    8:areturn         
	}

	private static final String c = AppboyLogger.getAppboyLogTag(bo/app/y);
	AtomicBoolean a;
	long b;
	private final bo d;
	private final q e;
	private final bl f;
	private final Context g;
	private final dj h;
	private final cz i;
	private final dh j;
	private final fl k;
	private final bb l;
	private final bc m;
	private final br n;
	private AtomicBoolean o;
	private am p;

	static 
	{
	//    0    0:ldc1            #2   <Class y>
	//    1    2:invokestatic    #68  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #70  <Field String c>
	//*   3    8:return          
	}
}
