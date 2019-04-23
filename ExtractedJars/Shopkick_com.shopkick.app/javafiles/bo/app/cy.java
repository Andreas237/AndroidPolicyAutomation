// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

// Referenced classes of package bo.app:
//			dd, at, bu

public class cy
	implements dd
{

	public cy(dd dd1, at at1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		d = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #37  <Field boolean d>
		b = dd1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #39  <Field dd b>
		c = at1;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #41  <Field at c>
	//   11   19:return          
	}

	static dd a(cy cy1)
	{
		return cy1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field dd b>
	//    2    4:areturn         
	}

	public Collection a()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!d)
			break MISSING_BLOCK_LABEL_22;
	//    2    2:aload_0         
	//    3    3:getfield        #37  <Field boolean d>
	//    4    6:ifeq            22
		AppboyLogger.w(a, "Storage provider is closed. Not getting all events.");
	//    5    9:getstatic       #30  <Field String a>
	//    6   12:ldc1            #48  <String "Storage provider is closed. Not getting all events.">
	//    7   14:invokestatic    #52  <Method int AppboyLogger.w(String, String)>
	//    8   17:pop             
		this;
	//    9   18:aload_0         
		JVM INSTR monitorexit ;
	//   10   19:monitorexit     
		return null;
	//   11   20:aconst_null     
	//   12   21:areturn         
		Collection collection = (Collection)c.submit(new Callable() {

			public Collection a()
			{
				return cy.a(a).a();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field cy a>
			//    2    4:invokestatic    #24  <Method dd cy.a(cy)>
			//    3    7:invokeinterface #27  <Method Collection dd.a()>
			//    4   12:areturn         
			}

			public Object call()
			{
				return ((Object) (a()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #32  <Method Collection a()>
			//    2    4:areturn         
			}

			final cy a;

			
			{
				a = cy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field cy a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
).get();
	//   13   22:aload_0         
	//   14   23:getfield        #41  <Field at c>
	//   15   26:new             #12  <Class cy$3>
	//   16   29:dup             
	//   17   30:aload_0         
	//   18   31:invokespecial   #55  <Method void cy$3(cy)>
	//   19   34:invokevirtual   #61  <Method Future at.submit(Callable)>
	//   20   37:invokeinterface #67  <Method Object Future.get()>
	//   21   42:checkcast       #69  <Class Collection>
	//   22   45:astore_1        
		this;
	//   23   46:aload_0         
		JVM INSTR monitorexit ;
	//   24   47:monitorexit     
		return collection;
	//   25   48:aload_1         
	//   26   49:areturn         
		Object obj;
		obj;
	//   27   50:astore_1        
		throw new RuntimeException("Error while trying to asynchronously get all events.", ((Throwable) (obj)));
	//   28   51:new             #71  <Class RuntimeException>
	//   29   54:dup             
	//   30   55:ldc1            #73  <String "Error while trying to asynchronously get all events.">
	//   31   57:aload_1         
	//   32   58:invokespecial   #76  <Method void RuntimeException(String, Throwable)>
	//   33   61:athrow          
		obj;
	//   34   62:astore_1        
		this;
	//   35   63:aload_0         
		JVM INSTR monitorexit ;
	//   36   64:monitorexit     
		throw obj;
	//   37   65:aload_1         
	//   38   66:athrow          
	}

	public void a(bu bu)
	{
		if(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field boolean d>
	//*   2    4:ifeq            42
		{
			String s = a;
	//    3    7:getstatic       #30  <Field String a>
	//    4   10:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #82  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #83  <Method void StringBuilder()>
	//    8   18:astore_3        
			stringbuilder.append("Storage provider is closed. Not adding event: ");
	//    9   19:aload_3         
	//   10   20:ldc1            #85  <String "Storage provider is closed. Not adding event: ">
	//   11   22:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			stringbuilder.append(((Object) (bu)));
	//   13   26:aload_3         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #92  <Method StringBuilder StringBuilder.append(Object)>
	//   16   31:pop             
			AppboyLogger.w(s, stringbuilder.toString());
	//   17   32:aload_2         
	//   18   33:aload_3         
	//   19   34:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   20   37:invokestatic    #52  <Method int AppboyLogger.w(String, String)>
	//   21   40:pop             
			return;
	//   22   41:return          
		} else
		{
			c.execute(new Runnable(bu) {

				public void run()
				{
					cy.a(b).a(a);
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field cy b>
				//    2    4:invokestatic    #28  <Method dd cy.a(cy)>
				//    3    7:aload_0         
				//    4    8:getfield        #20  <Field bu a>
				//    5   11:invokeinterface #31  <Method void dd.a(bu)>
				//    6   16:return          
				}

				final bu a;
				final cy b;

			
			{
				b = cy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field cy b>
				a = bu;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field bu a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   23   42:aload_0         
	//   24   43:getfield        #41  <Field at c>
	//   25   46:new             #8   <Class cy$1>
	//   26   49:dup             
	//   27   50:aload_0         
	//   28   51:aload_1         
	//   29   52:invokespecial   #99  <Method void cy$1(cy, bu)>
	//   30   55:invokevirtual   #103 <Method void at.execute(Runnable)>
			return;
	//   31   58:return          
		}
	}

	public void b()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		AppboyLogger.w(a, "Setting this provider and internal storage provider to closed. Cancelling all queued storage provider work.");
	//    2    2:getstatic       #30  <Field String a>
	//    3    5:ldc1            #105 <String "Setting this provider and internal storage provider to closed. Cancelling all queued storage provider work.">
	//    4    7:invokestatic    #52  <Method int AppboyLogger.w(String, String)>
	//    5   10:pop             
		d = true;
	//    6   11:aload_0         
	//    7   12:iconst_1        
	//    8   13:putfield        #37  <Field boolean d>
		b.b();
	//    9   16:aload_0         
	//   10   17:getfield        #39  <Field dd b>
	//   11   20:invokeinterface #107 <Method void dd.b()>
		c.shutdownNow();
	//   12   25:aload_0         
	//   13   26:getfield        #41  <Field at c>
	//   14   29:invokevirtual   #111 <Method java.util.List at.shutdownNow()>
	//   15   32:pop             
		this;
	//   16   33:aload_0         
		JVM INSTR monitorexit ;
	//   17   34:monitorexit     
		return;
	//   18   35:return          
		Exception exception;
		exception;
	//   19   36:astore_1        
	//*  20   37:aload_0         
		throw exception;
	//   21   38:monitorexit     
	//   22   39:aload_1         
	//   23   40:athrow          
	}

	public void b(bu bu)
	{
		if(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field boolean d>
	//*   2    4:ifeq            42
		{
			String s = a;
	//    3    7:getstatic       #30  <Field String a>
	//    4   10:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #82  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #83  <Method void StringBuilder()>
	//    8   18:astore_3        
			stringbuilder.append("Storage provider is closed. Not deleting event: ");
	//    9   19:aload_3         
	//   10   20:ldc1            #113 <String "Storage provider is closed. Not deleting event: ">
	//   11   22:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			stringbuilder.append(((Object) (bu)));
	//   13   26:aload_3         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #92  <Method StringBuilder StringBuilder.append(Object)>
	//   16   31:pop             
			AppboyLogger.w(s, stringbuilder.toString());
	//   17   32:aload_2         
	//   18   33:aload_3         
	//   19   34:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   20   37:invokestatic    #52  <Method int AppboyLogger.w(String, String)>
	//   21   40:pop             
			return;
	//   22   41:return          
		} else
		{
			c.execute(new Runnable(bu) {

				public void run()
				{
					cy.a(b).b(a);
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field cy b>
				//    2    4:invokestatic    #28  <Method dd cy.a(cy)>
				//    3    7:aload_0         
				//    4    8:getfield        #20  <Field bu a>
				//    5   11:invokeinterface #31  <Method void dd.b(bu)>
				//    6   16:return          
				}

				final bu a;
				final cy b;

			
			{
				b = cy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field cy b>
				a = bu;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field bu a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   23   42:aload_0         
	//   24   43:getfield        #41  <Field at c>
	//   25   46:new             #10  <Class cy$2>
	//   26   49:dup             
	//   27   50:aload_0         
	//   28   51:aload_1         
	//   29   52:invokespecial   #114 <Method void cy$2(cy, bu)>
	//   30   55:invokevirtual   #103 <Method void at.execute(Runnable)>
			return;
	//   31   58:return          
		}
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/cy);
	private final dd b;
	private final at c;
	private boolean d;

	static 
	{
	//    0    0:ldc1            #2   <Class cy>
	//    1    2:invokestatic    #28  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #30  <Field String a>
	//*   3    8:return          
	}
}
