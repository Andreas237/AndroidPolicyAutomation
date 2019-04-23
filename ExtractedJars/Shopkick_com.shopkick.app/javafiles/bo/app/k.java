// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.support.AppboyLogger;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package bo.app:
//			q, cr, co, cq, 
//			ck, o, z, aa, 
//			bu, ca

public class k
	implements q
{
	class a
		implements Runnable
	{

		public void run()
		{
			while(k.a(a)) 
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field k a>
		//*   2    4:invokestatic    #27  <Method boolean k.a(k)>
		//*   3    7:ifeq            80
				try
				{
					co co1 = k.b(a).b();
		//    4   10:aload_0         
		//    5   11:getfield        #14  <Field k a>
		//    6   14:invokestatic    #31  <Method o k.b(k)>
		//    7   17:invokevirtual   #36  <Method co o.b()>
		//    8   20:astore_1        
					k.a(a, co1);
		//    9   21:aload_0         
		//   10   22:getfield        #14  <Field k a>
		//   11   25:aload_1         
		//   12   26:invokestatic    #39  <Method void k.a(k, co)>
				}
		//*  13   29:goto            0
				catch(InterruptedException interruptedexception)
		//*  14   32:astore_1        
				{
					String s = k.b();
		//   15   33:invokestatic    #42  <Method String k.b()>
		//   16   36:astore_2        
					StringBuilder stringbuilder = new StringBuilder();
		//   17   37:new             #44  <Class StringBuilder>
		//   18   40:dup             
		//   19   41:invokespecial   #45  <Method void StringBuilder()>
		//   20   44:astore_3        
					stringbuilder.append("Automatic thread interrupted! [");
		//   21   45:aload_3         
		//   22   46:ldc1            #47  <String "Automatic thread interrupted! [">
		//   23   48:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   24   51:pop             
					stringbuilder.append(interruptedexception.getMessage());
		//   25   52:aload_3         
		//   26   53:aload_1         
		//   27   54:invokevirtual   #54  <Method String InterruptedException.getMessage()>
		//   28   57:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   29   60:pop             
					stringbuilder.append("]");
		//   30   61:aload_3         
		//   31   62:ldc1            #56  <String "]">
		//   32   64:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   33   67:pop             
					AppboyLogger.d(s, stringbuilder.toString());
		//   34   68:aload_2         
		//   35   69:aload_3         
		//   36   70:invokevirtual   #59  <Method String StringBuilder.toString()>
		//   37   73:invokestatic    #65  <Method int AppboyLogger.d(String, String)>
		//   38   76:pop             
				}
		//*  39   77:goto            0
		//   40   80:return          
		}

		final k a;

		private a()
		{
			a = k.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field k a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #17  <Method void Object()>
		//    5    9:return          
		}

	}


	public k(AppboyConfigurationProvider appboyconfigurationprovider, aa aa, cq cq1, o o1, ThreadFactory threadfactory, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #43  <Method void Object()>
	//    6   12:putfield        #45  <Field Object e>
		f = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #47  <Field boolean f>
		h = true;
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:putfield        #49  <Field boolean h>
		j = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #51  <Field boolean j>
		b = appboyconfigurationprovider;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:putfield        #53  <Field AppboyConfigurationProvider b>
		c = cq1;
	//   19   35:aload_0         
	//   20   36:aload_3         
	//   21   37:putfield        #55  <Field cq c>
		d = o1;
	//   22   40:aload_0         
	//   23   41:aload           4
	//   24   43:putfield        #57  <Field o d>
		g = threadfactory.newThread(((Runnable) (new a())));
	//   25   46:aload_0         
	//   26   47:aload           5
	//   27   49:new             #10  <Class k$a>
	//   28   52:dup             
	//   29   53:aload_0         
	//   30   54:aconst_null     
	//   31   55:invokespecial   #60  <Method void k$a(k, k$1)>
	//   32   58:invokeinterface #66  <Method Thread ThreadFactory.newThread(Runnable)>
	//   33   63:putfield        #68  <Field Thread g>
		i = new cr(aa);
	//   34   66:aload_0         
	//   35   67:new             #70  <Class cr>
	//   36   70:dup             
	//   37   71:aload_2         
	//   38   72:invokespecial   #73  <Method void cr(aa)>
	//   39   75:putfield        #75  <Field cr i>
		j = flag;
	//   40   78:aload_0         
	//   41   79:iload           6
	//   42   81:putfield        #51  <Field boolean j>
	//   43   84:return          
	}

	static void a(k k1, co co1)
	{
		k1.b(co1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #79  <Method void b(co)>
	//    3    5:return          
	}

	static boolean a(k k1)
	{
		return k1.h;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field boolean h>
	//    2    4:ireturn         
	}

	static o b(k k1)
	{
		return k1.d;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field o d>
	//    2    4:areturn         
	}

	static String b()
	{
		return a;
	//    0    0:getstatic       #38  <Field String a>
	//    1    3:areturn         
	}

	private void b(co co1)
	{
		if(!co1.h() && !j)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #87  <Method boolean co.h()>
	//*   2    6:ifne            30
	//*   3    9:aload_0         
	//*   4   10:getfield        #51  <Field boolean j>
	//*   5   13:ifeq            19
	//*   6   16:goto            30
		{
			c.a(((cp) (co1)));
	//    7   19:aload_0         
	//    8   20:getfield        #55  <Field cq c>
	//    9   23:aload_1         
	//   10   24:invokeinterface #92  <Method void cq.a(cp)>
			return;
	//   11   29:return          
		} else
		{
			i.a(((cp) (co1)));
	//   12   30:aload_0         
	//   13   31:getfield        #75  <Field cr i>
	//   14   34:aload_1         
	//   15   35:invokevirtual   #93  <Method void cr.a(cp)>
			return;
	//   16   38:return          
		}
	}

	private ck c()
	{
		return new ck(b.getBaseUrlForRequests());
	//    0    0:new             #96  <Class ck>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #53  <Field AppboyConfigurationProvider b>
	//    4    8:invokevirtual   #101 <Method String AppboyConfigurationProvider.getBaseUrlForRequests()>
	//    5   11:invokespecial   #104 <Method void ck(String)>
	//    6   14:areturn         
	}

	private void c(co co1)
	{
		if(!co1.h() && !j)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #87  <Method boolean co.h()>
	//*   2    6:ifne            30
	//*   3    9:aload_0         
	//*   4   10:getfield        #51  <Field boolean j>
	//*   5   13:ifeq            19
	//*   6   16:goto            30
		{
			c.b(((cp) (co1)));
	//    7   19:aload_0         
	//    8   20:getfield        #55  <Field cq c>
	//    9   23:aload_1         
	//   10   24:invokeinterface #106 <Method void cq.b(cp)>
			return;
	//   11   29:return          
		} else
		{
			i.b(((cp) (co1)));
	//   12   30:aload_0         
	//   13   31:getfield        #75  <Field cr i>
	//   14   34:aload_1         
	//   15   35:invokevirtual   #107 <Method void cr.b(cp)>
			return;
	//   16   38:return          
		}
	}

	public void a()
	{
label0:
		{
			synchronized(e)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field Object e>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(!f)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #47  <Field boolean f>
	//    7   11:ifeq            26
				AppboyLogger.d(a, "Automatic request execution start was previously requested, continuing without action.");
	//    8   14:getstatic       #38  <Field String a>
	//    9   17:ldc1            #109 <String "Automatic request execution start was previously requested, continuing without action.">
	//   10   19:invokestatic    #112 <Method int AppboyLogger.d(String, String)>
	//   11   22:pop             
			}
	//   12   23:aload_1         
	//   13   24:monitorexit     
			return;
	//   14   25:return          
		}
		if(g != null)
	//*  15   26:aload_0         
	//*  16   27:getfield        #68  <Field Thread g>
	//*  17   30:ifnull          40
			g.start();
	//   18   33:aload_0         
	//   19   34:getfield        #68  <Field Thread g>
	//   20   37:invokevirtual   #117 <Method void Thread.start()>
		f = true;
	//   21   40:aload_0         
	//   22   41:iconst_1        
	//   23   42:putfield        #47  <Field boolean f>
		obj;
	//   24   45:aload_1         
		JVM INSTR monitorexit ;
	//   25   46:monitorexit     
		return;
	//   26   47:return          
		exception;
	//   27   48:astore_2        
		obj;
	//   28   49:aload_1         
		JVM INSTR monitorexit ;
	//   29   50:monitorexit     
		throw exception;
	//   30   51:aload_2         
	//   31   52:athrow          
	}

	public void a(bu bu)
	{
		d.a(bu);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field o d>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #122 <Method void o.a(bu)>
	//    4    8:return          
	}

	public void a(ca ca)
	{
		d.a(ca);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field o d>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #125 <Method void o.a(ca)>
	//    4    8:return          
	}

	public void a(co co1)
	{
		d.a(co1);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field o d>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #127 <Method void o.a(co)>
	//    4    8:return          
	}

	public void a(z z1)
	{
		synchronized(e)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field Object e>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			h = false;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #49  <Field boolean h>
			g.interrupt();
	//    8   12:aload_0         
	//    9   13:getfield        #68  <Field Thread g>
	//   10   16:invokevirtual   #131 <Method void Thread.interrupt()>
			g = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #68  <Field Thread g>
		}
	//   14   24:aload_2         
	//   15   25:monitorexit     
		if(!d.a())
	//*  16   26:aload_0         
	//*  17   27:getfield        #57  <Field o d>
	//*  18   30:invokevirtual   #133 <Method boolean o.a()>
	//*  19   33:ifne            47
			d.a(((co) (c())));
	//   20   36:aload_0         
	//   21   37:getfield        #57  <Field o d>
	//   22   40:aload_0         
	//   23   41:invokespecial   #135 <Method ck c()>
	//   24   44:invokevirtual   #127 <Method void o.a(co)>
		obj = ((Object) (d.c()));
	//   25   47:aload_0         
	//   26   48:getfield        #57  <Field o d>
	//   27   51:invokevirtual   #138 <Method co o.c()>
	//   28   54:astore_2        
		if(obj != null)
	//*  29   55:aload_2         
	//*  30   56:ifnull          64
			c(((co) (obj)));
	//   31   59:aload_0         
	//   32   60:aload_2         
	//   33   61:invokespecial   #140 <Method void c(co)>
		z1.a();
	//   34   64:aload_1         
	//   35   65:invokevirtual   #144 <Method void z.a()>
		return;
	//   36   68:return          
		z1;
	//   37   69:astore_1        
		obj;
	//   38   70:aload_2         
		JVM INSTR monitorexit ;
	//   39   71:monitorexit     
		throw z1;
	//   40   72:aload_1         
	//   41   73:athrow          
	}

	public void b(bu bu)
	{
		d.b(bu);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field o d>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #146 <Method void o.b(bu)>
	//    4    8:return          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/k);
	private final AppboyConfigurationProvider b;
	private final cq c;
	private final o d;
	private final Object e = new Object();
	private volatile boolean f;
	private volatile Thread g;
	private volatile boolean h;
	private cr i;
	private boolean j;

	static 
	{
	//    0    0:ldc1            #2   <Class k>
	//    1    2:invokestatic    #36  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #38  <Field String a>
	//*   3    8:return          
	}
}
