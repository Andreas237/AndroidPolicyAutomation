// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.*;
import android.net.ConnectivityManager;
import com.appboy.events.IEventSubscriber;
import com.appboy.receivers.AppboyActionReceiver;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//			x, dl, aa, ak, 
//			z, al, p, w, 
//			m

public class n
{

	public n(Context context, aa aa1, p p1, AlarmManager alarmmanager, m m1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
		k = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #50  <Field boolean k>
		b = context;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #52  <Field Context b>
		c = p1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #54  <Field p c>
		d = alarmmanager;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #56  <Field AlarmManager d>
		e = m1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #58  <Field m e>
		h = x.b;
	//   17   31:aload_0         
	//   18   32:getstatic       #62  <Field x x.b>
	//   19   35:putfield        #64  <Field x h>
		i = -1L;
	//   20   38:aload_0         
	//   21   39:ldc2w           #65  <Long -1L>
	//   22   42:putfield        #68  <Field long i>
		context = ((Context) ((new Intent("com.appboy.action.receiver.DATA_SYNC")).setClass(context, com/appboy/receivers/AppboyActionReceiver)));
	//   23   45:new             #70  <Class Intent>
	//   24   48:dup             
	//   25   49:ldc1            #72  <String "com.appboy.action.receiver.DATA_SYNC">
	//   26   51:invokespecial   #75  <Method void Intent(String)>
	//   27   54:aload_1         
	//   28   55:ldc1            #77  <Class AppboyActionReceiver>
	//   29   57:invokevirtual   #81  <Method Intent Intent.setClass(Context, Class)>
	//   30   60:astore_1        
		g = PendingIntent.getBroadcast(b, s.hashCode(), ((Intent) (context)), 0x8000000);
	//   31   61:aload_0         
	//   32   62:aload_0         
	//   33   63:getfield        #52  <Field Context b>
	//   34   66:aload           6
	//   35   68:invokevirtual   #87  <Method int String.hashCode()>
	//   36   71:aload_1         
	//   37   72:ldc1            #88  <Int 0x8000000>
	//   38   74:invokestatic    #94  <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   39   77:putfield        #96  <Field PendingIntent g>
		f = ((BroadcastReceiver) (new BroadcastReceiver(aa1) {

			public void onReceive(Context context1, Intent intent)
			{
				try
				{
					context1 = ((Context) ((ConnectivityManager)context1.getSystemService("connectivity")));
			//    0    0:aload_1         
			//    1    1:ldc1            #28  <String "connectivity">
			//    2    3:invokevirtual   #34  <Method Object Context.getSystemService(String)>
			//    3    6:checkcast       #36  <Class ConnectivityManager>
			//    4    9:astore_1        
					n.a(b).a(intent, ((ConnectivityManager) (context1)));
			//    5   10:aload_0         
			//    6   11:getfield        #16  <Field n b>
			//    7   14:invokestatic    #39  <Method p n.a(n)>
			//    8   17:aload_2         
			//    9   18:aload_1         
			//   10   19:invokeinterface #44  <Method void p.a(Intent, ConnectivityManager)>
					b.c();
			//   11   24:aload_0         
			//   12   25:getfield        #16  <Field n b>
			//   13   28:invokevirtual   #47  <Method void n.c()>
					return;
			//   14   31:return          
				}
				// Misplaced declaration of an exception variable
				catch(Context context1)
			//*  15   32:astore_1        
				{
					AppboyLogger.e(n.f(), "Failed to process connectivity event.", ((Throwable) (context1)));
			//   16   33:invokestatic    #51  <Method String n.f()>
			//   17   36:ldc1            #53  <String "Failed to process connectivity event.">
			//   18   38:aload_1         
			//   19   39:invokestatic    #59  <Method int AppboyLogger.e(String, String, Throwable)>
			//   20   42:pop             
				}
				n.a(b, a, ((Throwable) (context1)));
			//   21   43:aload_0         
			//   22   44:getfield        #16  <Field n b>
			//   23   47:aload_0         
			//   24   48:getfield        #18  <Field aa a>
			//   25   51:aload_1         
			//   26   52:invokestatic    #62  <Method void n.a(n, aa, Throwable)>
			//   27   55:return          
			}

			final aa a;
			final n b;

			
			{
				b = n.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field n b>
				a = aa1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #18  <Field aa a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #21  <Method void BroadcastReceiver()>
			//    8   14:return          
			}
		}
));
	//   40   80:aload_0         
	//   41   81:new             #6   <Class n$1>
	//   42   84:dup             
	//   43   85:aload_0         
	//   44   86:aload_2         
	//   45   87:invokespecial   #99  <Method void n$1(n, aa)>
	//   46   90:putfield        #101 <Field BroadcastReceiver f>
		AppboyLogger.d(a, "Registered broadcast filters");
	//   47   93:getstatic       #43  <Field String a>
	//   48   96:ldc1            #103 <String "Registered broadcast filters">
	//   49   98:invokestatic    #106 <Method int AppboyLogger.d(String, String)>
	//   50  101:pop             
	//   51  102:return          
	}

	static p a(n n1)
	{
		return n1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field p c>
	//    2    4:areturn         
	}

	static x a(n n1, x x1)
	{
		n1.h = x1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #64  <Field x h>
		return x1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private void a(long l)
	{
		if(d == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field AlarmManager d>
	//*   2    4:ifnonnull       17
		{
			AppboyLogger.d(a, "Alarm manager was null. Ignoring request to reset it.");
	//    3    7:getstatic       #43  <Field String a>
	//    4   10:ldc1            #111 <String "Alarm manager was null. Ignoring request to reset it.">
	//    5   12:invokestatic    #106 <Method int AppboyLogger.d(String, String)>
	//    6   15:pop             
			return;
	//    7   16:return          
		}
		if(i <= 0L)
	//*   8   17:aload_0         
	//*   9   18:getfield        #68  <Field long i>
	//*  10   21:lconst_0        
	//*  11   22:lcmp            
	//*  12   23:ifgt            40
		{
			AppboyLogger.d(a, "Cancelling alarm because delay value was not positive.");
	//   13   26:getstatic       #43  <Field String a>
	//   14   29:ldc1            #113 <String "Cancelling alarm because delay value was not positive.">
	//   15   31:invokestatic    #106 <Method int AppboyLogger.d(String, String)>
	//   16   34:pop             
			g();
	//   17   35:aload_0         
	//   18   36:invokespecial   #115 <Method void g()>
			return;
	//   19   39:return          
		} else
		{
			a(dl.c() + l, i);
	//   20   40:aload_0         
	//   21   41:invokestatic    #120 <Method long dl.c()>
	//   22   44:lload_1         
	//   23   45:ladd            
	//   24   46:aload_0         
	//   25   47:getfield        #68  <Field long i>
	//   26   50:invokespecial   #123 <Method void a(long, long)>
			return;
	//   27   53:return          
		}
	}

	private void a(long l, long l1)
	{
		d.setInexactRepeating(1, l, l1, g);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field AlarmManager d>
	//    2    4:iconst_1        
	//    3    5:lload_1         
	//    4    6:lload_3         
	//    5    7:aload_0         
	//    6    8:getfield        #96  <Field PendingIntent g>
	//    7   11:invokevirtual   #129 <Method void AlarmManager.setInexactRepeating(int, long, long, PendingIntent)>
	//    8   14:return          
	}

	private void a(aa aa1, Throwable throwable)
	{
		try
		{
			aa1.a(((Object) (throwable)), java/lang/Throwable);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:ldc1            #134 <Class Throwable>
	//    3    4:invokeinterface #139 <Method void aa.a(Object, Class)>
			return;
	//    4    9:return          
		}
		// Misplaced declaration of an exception variable
		catch(aa aa1)
	//*   5   10:astore_1        
		{
			AppboyLogger.e(a, "Failed to log throwable.", ((Throwable) (aa1)));
	//    6   11:getstatic       #43  <Field String a>
	//    7   14:ldc1            #141 <String "Failed to log throwable.">
	//    8   16:aload_1         
	//    9   17:invokestatic    #144 <Method int AppboyLogger.e(String, String, Throwable)>
	//   10   20:pop             
		}
	//   11   21:return          
	}

	static void a(n n1, aa aa1, Throwable throwable)
	{
		n1.a(aa1, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #147 <Method void a(aa, Throwable)>
	//    4    6:return          
	}

	static String f()
	{
		return a;
	//    0    0:getstatic       #43  <Field String a>
	//    1    3:areturn         
	}

	private void g()
	{
		PendingIntent pendingintent = g;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field PendingIntent g>
	//    2    4:astore_1        
		if(pendingintent != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
			d.cancel(pendingintent);
	//    5    9:aload_0         
	//    6   10:getfield        #56  <Field AlarmManager d>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #152 <Method void AlarmManager.cancel(PendingIntent)>
	//    9   17:return          
	}

	public void a(z z1)
	{
		z1.a(new IEventSubscriber() {

			public void a(ak ak1)
			{
				n.a(a, x.a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field n a>
			//    2    4:getstatic       #27  <Field x x.a>
			//    3    7:invokestatic    #30  <Method x n.a(n, x)>
			//    4   10:pop             
				a.c();
			//    5   11:aload_0         
			//    6   12:getfield        #17  <Field n a>
			//    7   15:invokevirtual   #33  <Method void n.c()>
			//    8   18:return          
			}

			public void trigger(Object obj)
			{
				a((ak)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #37  <Class ak>
			//    3    5:invokevirtual   #39  <Method void a(ak)>
			//    4    8:return          
			}

			final n a;

			
			{
				a = n.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field n a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
, bo/app/ak);
	//    0    0:aload_1         
	//    1    1:new             #8   <Class n$2>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #156 <Method void n$2(n)>
	//    5    9:ldc1            #158 <Class ak>
	//    6   11:invokevirtual   #163 <Method boolean z.a(IEventSubscriber, Class)>
	//    7   14:pop             
		z1.a(new IEventSubscriber() {

			public void a(al al1)
			{
				n.a(a, x.b);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field n a>
			//    2    4:getstatic       #28  <Field x x.b>
			//    3    7:invokestatic    #31  <Method x n.a(n, x)>
			//    4   10:pop             
				a.c();
			//    5   11:aload_0         
			//    6   12:getfield        #17  <Field n a>
			//    7   15:invokevirtual   #34  <Method void n.c()>
			//    8   18:return          
			}

			public void trigger(Object obj)
			{
				a((al)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #38  <Class al>
			//    3    5:invokevirtual   #40  <Method void a(al)>
			//    4    8:return          
			}

			final n a;

			
			{
				a = n.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field n a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
, bo/app/al);
	//    8   15:aload_1         
	//    9   16:new             #10  <Class n$3>
	//   10   19:dup             
	//   11   20:aload_0         
	//   12   21:invokespecial   #164 <Method void n$3(n)>
	//   13   24:ldc1            #166 <Class al>
	//   14   26:invokevirtual   #163 <Method boolean z.a(IEventSubscriber, Class)>
	//   15   29:pop             
	//   16   30:return          
	}

	public void a(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		j = flag;
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:putfield        #169 <Field boolean j>
		c();
	//    5    7:aload_0         
	//    6    8:invokevirtual   #171 <Method void c()>
		if(!flag)
			break MISSING_BLOCK_LABEL_23;
	//    7   11:iload_1         
	//    8   12:ifeq            23
		b();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #174 <Method boolean b()>
	//   11   19:pop             
		break MISSING_BLOCK_LABEL_28;
	//   12   20:goto            28
		a();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #176 <Method boolean a()>
	//   15   27:pop             
		this;
	//   16   28:aload_0         
		JVM INSTR monitorexit ;
	//   17   29:monitorexit     
		return;
	//   18   30:return          
		Exception exception;
		exception;
	//   19   31:astore_2        
	//*  20   32:aload_0         
		throw exception;
	//   21   33:monitorexit     
	//   22   34:aload_2         
	//   23   35:athrow          
	}

	public boolean a()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!k)
			break MISSING_BLOCK_LABEL_22;
	//    2    2:aload_0         
	//    3    3:getfield        #50  <Field boolean k>
	//    4    6:ifeq            22
		AppboyLogger.d(a, "The data sync policy is already running. Ignoring request.");
	//    5    9:getstatic       #43  <Field String a>
	//    6   12:ldc1            #178 <String "The data sync policy is already running. Ignoring request.">
	//    7   14:invokestatic    #106 <Method int AppboyLogger.d(String, String)>
	//    8   17:pop             
		this;
	//    9   18:aload_0         
		JVM INSTR monitorexit ;
	//   10   19:monitorexit     
		return false;
	//   11   20:iconst_0        
	//   12   21:ireturn         
		AppboyLogger.d(a, "Data sync started");
	//   13   22:getstatic       #43  <Field String a>
	//   14   25:ldc1            #180 <String "Data sync started">
	//   15   27:invokestatic    #106 <Method int AppboyLogger.d(String, String)>
	//   16   30:pop             
		d();
	//   17   31:aload_0         
	//   18   32:invokevirtual   #182 <Method void d()>
		a(3000L);
	//   19   35:aload_0         
	//   20   36:ldc2w           #183 <Long 3000L>
	//   21   39:invokespecial   #186 <Method void a(long)>
		k = true;
	//   22   42:aload_0         
	//   23   43:iconst_1        
	//   24   44:putfield        #50  <Field boolean k>
		this;
	//   25   47:aload_0         
		JVM INSTR monitorexit ;
	//   26   48:monitorexit     
		return true;
	//   27   49:iconst_1        
	//   28   50:ireturn         
		Exception exception;
		exception;
	//   29   51:astore_1        
	//*  30   52:aload_0         
		throw exception;
	//   31   53:monitorexit     
	//   32   54:aload_1         
	//   33   55:athrow          
	}

	public boolean b()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(k)
			break MISSING_BLOCK_LABEL_22;
	//    2    2:aload_0         
	//    3    3:getfield        #50  <Field boolean k>
	//    4    6:ifne            22
		AppboyLogger.d(a, "The data sync policy is not running. Ignoring request.");
	//    5    9:getstatic       #43  <Field String a>
	//    6   12:ldc1            #188 <String "The data sync policy is not running. Ignoring request.">
	//    7   14:invokestatic    #106 <Method int AppboyLogger.d(String, String)>
	//    8   17:pop             
		this;
	//    9   18:aload_0         
		JVM INSTR monitorexit ;
	//   10   19:monitorexit     
		return false;
	//   11   20:iconst_0        
	//   12   21:ireturn         
		AppboyLogger.d(a, "Data sync stopped");
	//   13   22:getstatic       #43  <Field String a>
	//   14   25:ldc1            #190 <String "Data sync stopped">
	//   15   27:invokestatic    #106 <Method int AppboyLogger.d(String, String)>
	//   16   30:pop             
		g();
	//   17   31:aload_0         
	//   18   32:invokespecial   #115 <Method void g()>
		e();
	//   19   35:aload_0         
	//   20   36:invokevirtual   #192 <Method void e()>
		k = false;
	//   21   39:aload_0         
	//   22   40:iconst_0        
	//   23   41:putfield        #50  <Field boolean k>
		this;
	//   24   44:aload_0         
		JVM INSTR monitorexit ;
	//   25   45:monitorexit     
		return true;
	//   26   46:iconst_1        
	//   27   47:ireturn         
		Exception exception;
		exception;
	//   28   48:astore_1        
	//*  29   49:aload_0         
		throw exception;
	//   30   50:monitorexit     
	//   31   51:aload_1         
	//   32   52:athrow          
	}

	protected void c()
	{
		long l = i;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field long i>
	//    2    4:lstore_1        
		static class _cls4
		{

			static final int a[];

			static 
			{
				a = new int[w.values().length];
			//    0    0:invokestatic    #18  <Method w[] w.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] a>
				try
				{
					a[w.b.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] a>
			//    5   12:getstatic       #24  <Field w w.b>
			//    6   15:invokevirtual   #28  <Method int w.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] a>
			//*  10   23:getstatic       #31  <Field w w.c>
			//*  11   26:invokevirtual   #28  <Method int w.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] a>
			//*  15   34:getstatic       #34  <Field w w.e>
			//*  16   37:invokevirtual   #28  <Method int w.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] a>
			//*  20   45:getstatic       #37  <Field w w.f>
			//*  21   48:invokevirtual   #28  <Method int w.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] a>
			//*  25   56:getstatic       #40  <Field w w.d>
			//*  26   59:invokevirtual   #28  <Method int w.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   30   65:astore_0        
				try
				{
					a[w.c.ordinal()] = 2;
				}
			//*  31   66:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   32   69:astore_0        
				try
				{
					a[w.e.ordinal()] = 3;
				}
			//*  33   70:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   34   73:astore_0        
				try
				{
					a[w.f.ordinal()] = 4;
				}
			//*  35   74:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   36   77:astore_0        
				try
				{
					a[w.d.ordinal()] = 5;
				}
			//*  37   78:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   38   81:astore_0        
			//*  39   82:return          
			}
		}

		if(h != x.b && !j)
	//*   3    5:aload_0         
	//*   4    6:getfield        #64  <Field x h>
	//*   5    9:getstatic       #62  <Field x x.b>
	//*   6   12:if_acmpeq       124
	//*   7   15:aload_0         
	//*   8   16:getfield        #169 <Field boolean j>
	//*   9   19:ifeq            25
	//*  10   22:goto            124
			switch(_cls4.a[c.a().ordinal()])
	//*  11   25:getstatic       #196 <Field int[] n$4.a>
	//*  12   28:aload_0         
	//*  13   29:getfield        #54  <Field p c>
	//*  14   32:invokeinterface #201 <Method w p.a()>
	//*  15   37:invokevirtual   #206 <Method int w.ordinal()>
	//*  16   40:iaload          
			{
	//*  17   41:tableswitch     1 4: default 72
	//	               1 114
	//	               2 100
	//	               3 86
	//	               4 86
			default:
				i = e.b();
	//   18   72:aload_0         
	//   19   73:aload_0         
	//   20   74:getfield        #58  <Field m e>
	//   21   77:invokevirtual   #210 <Method long m.b()>
	//   22   80:putfield        #68  <Field long i>
				break;

	//*  23   83:goto            131
			case 3: // '\003'
			case 4: // '\004'
				i = e.c();
	//   24   86:aload_0         
	//   25   87:aload_0         
	//   26   88:getfield        #58  <Field m e>
	//   27   91:invokevirtual   #211 <Method long m.c()>
	//   28   94:putfield        #68  <Field long i>
				break;

	//*  29   97:goto            131
			case 2: // '\002'
				i = e.a();
	//   30  100:aload_0         
	//   31  101:aload_0         
	//   32  102:getfield        #58  <Field m e>
	//   33  105:invokevirtual   #213 <Method long m.a()>
	//   34  108:putfield        #68  <Field long i>
				break;

	//*  35  111:goto            131
			case 1: // '\001'
				i = -1L;
	//   36  114:aload_0         
	//   37  115:ldc2w           #65  <Long -1L>
	//   38  118:putfield        #68  <Field long i>
				break;
			}
		else
	//*  39  121:goto            131
			i = -1L;
	//   40  124:aload_0         
	//   41  125:ldc2w           #65  <Long -1L>
	//   42  128:putfield        #68  <Field long i>
		long l1 = i;
	//   43  131:aload_0         
	//   44  132:getfield        #68  <Field long i>
	//   45  135:lstore_3        
		if(l != l1)
	//*  46  136:lload_1         
	//*  47  137:lload_3         
	//*  48  138:lcmp            
	//*  49  139:ifeq            213
		{
			a(l1);
	//   50  142:aload_0         
	//   51  143:lload_3         
	//   52  144:invokespecial   #186 <Method void a(long)>
			String s = a;
	//   53  147:getstatic       #43  <Field String a>
	//   54  150:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//   55  152:new             #215 <Class StringBuilder>
	//   56  155:dup             
	//   57  156:invokespecial   #216 <Method void StringBuilder()>
	//   58  159:astore          6
			stringbuilder.append("Dispatch state has changed from ");
	//   59  161:aload           6
	//   60  163:ldc1            #218 <String "Dispatch state has changed from ">
	//   61  165:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   62  168:pop             
			stringbuilder.append(l);
	//   63  169:aload           6
	//   64  171:lload_1         
	//   65  172:invokevirtual   #225 <Method StringBuilder StringBuilder.append(long)>
	//   66  175:pop             
			stringbuilder.append(" to ");
	//   67  176:aload           6
	//   68  178:ldc1            #227 <String " to ">
	//   69  180:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   70  183:pop             
			stringbuilder.append(i);
	//   71  184:aload           6
	//   72  186:aload_0         
	//   73  187:getfield        #68  <Field long i>
	//   74  190:invokevirtual   #225 <Method StringBuilder StringBuilder.append(long)>
	//   75  193:pop             
			stringbuilder.append(".");
	//   76  194:aload           6
	//   77  196:ldc1            #229 <String ".">
	//   78  198:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   79  201:pop             
			AppboyLogger.d(s, stringbuilder.toString());
	//   80  202:aload           5
	//   81  204:aload           6
	//   82  206:invokevirtual   #232 <Method String StringBuilder.toString()>
	//   83  209:invokestatic    #106 <Method int AppboyLogger.d(String, String)>
	//   84  212:pop             
		}
	//   85  213:return          
	}

	protected void d()
	{
		IntentFilter intentfilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
	//    0    0:new             #235 <Class IntentFilter>
	//    1    3:dup             
	//    2    4:ldc1            #237 <String "android.net.conn.CONNECTIVITY_CHANGE">
	//    3    6:invokespecial   #238 <Method void IntentFilter(String)>
	//    4    9:astore_1        
		b.registerReceiver(f, intentfilter);
	//    5   10:aload_0         
	//    6   11:getfield        #52  <Field Context b>
	//    7   14:aload_0         
	//    8   15:getfield        #101 <Field BroadcastReceiver f>
	//    9   18:aload_1         
	//   10   19:invokevirtual   #244 <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   11   22:pop             
	//   12   23:return          
	}

	protected void e()
	{
		b.unregisterReceiver(f);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Context b>
	//    2    4:aload_0         
	//    3    5:getfield        #101 <Field BroadcastReceiver f>
	//    4    8:invokevirtual   #248 <Method void Context.unregisterReceiver(BroadcastReceiver)>
	//    5   11:return          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/n);
	private final Context b;
	private final p c;
	private final AlarmManager d;
	private final m e;
	private final BroadcastReceiver f;
	private final PendingIntent g;
	private x h;
	private long i;
	private boolean j;
	private volatile boolean k;

	static 
	{
	//    0    0:ldc1            #2   <Class n>
	//    1    2:invokestatic    #41  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #43  <Field String a>
	//*   3    8:return          
	}
}
