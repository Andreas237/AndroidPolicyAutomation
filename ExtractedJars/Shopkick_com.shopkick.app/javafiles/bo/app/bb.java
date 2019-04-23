// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executor;

// Referenced classes of package bo.app:
//			bh, dd, bu, q

public class bb
{

	public bb(dd dd1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		c = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #31  <Field boolean c>
		b = dd1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #33  <Field dd b>
	//    8   14:return          
	}

	static dd a(bb bb1)
	{
		return bb1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field dd b>
	//    2    4:areturn         
	}

	static String b()
	{
		return a;
	//    0    0:getstatic       #24  <Field String a>
	//    1    3:areturn         
	}

	public void a()
	{
		c = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #31  <Field boolean c>
		b.b();
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field dd b>
	//    5    9:invokeinterface #39  <Method void dd.b()>
	//    6   14:return          
	}

	public void a(bu bu)
	{
		if(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field boolean c>
	//*   2    4:ifeq            42
		{
			String s = a;
	//    3    7:getstatic       #24  <Field String a>
	//    4   10:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #43  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #44  <Method void StringBuilder()>
	//    8   18:astore_3        
			stringbuilder.append("Storage manager is closed. Not adding event: ");
	//    9   19:aload_3         
	//   10   20:ldc1            #46  <String "Storage manager is closed. Not adding event: ">
	//   11   22:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			stringbuilder.append(((Object) (bu)));
	//   13   26:aload_3         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #53  <Method StringBuilder StringBuilder.append(Object)>
	//   16   31:pop             
			AppboyLogger.w(s, stringbuilder.toString());
	//   17   32:aload_2         
	//   18   33:aload_3         
	//   19   34:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   20   37:invokestatic    #60  <Method int AppboyLogger.w(String, String)>
	//   21   40:pop             
			return;
	//   22   41:return          
		} else
		{
			b.a(bu);
	//   23   42:aload_0         
	//   24   43:getfield        #33  <Field dd b>
	//   25   46:aload_1         
	//   26   47:invokeinterface #62  <Method void dd.a(bu)>
			return;
	//   27   52:return          
		}
	}

	public void a(Executor executor, q q)
	{
		if(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field boolean c>
	//*   2    4:ifeq            17
		{
			AppboyLogger.w(a, "Storage manager is closed. Not starting offline recovery.");
	//    3    7:getstatic       #24  <Field String a>
	//    4   10:ldc1            #66  <String "Storage manager is closed. Not starting offline recovery.">
	//    5   12:invokestatic    #60  <Method int AppboyLogger.w(String, String)>
	//    6   15:pop             
			return;
	//    7   16:return          
		} else
		{
			executor.execute(new Runnable(q) {

				public void run()
				{
					AppboyLogger.d(bb.b(), "Started offline AppboyEvent recovery task.");
				//    0    0:invokestatic    #28  <Method String bb.b()>
				//    1    3:ldc1            #30  <String "Started offline AppboyEvent recovery task.">
				//    2    5:invokestatic    #36  <Method int AppboyLogger.d(String, String)>
				//    3    8:pop             
					bu bu1;
					for(Iterator iterator = bb.a(b).a().iterator(); iterator.hasNext(); a.a(bu1))
				//*   4    9:aload_0         
				//*   5   10:getfield        #18  <Field bb b>
				//*   6   13:invokestatic    #39  <Method dd bb.a(bb)>
				//*   7   16:invokeinterface #44  <Method Collection dd.a()>
				//*   8   21:invokeinterface #50  <Method Iterator Collection.iterator()>
				//*   9   26:astore_1        
				//*  10   27:aload_1         
				//*  11   28:invokeinterface #56  <Method boolean Iterator.hasNext()>
				//*  12   33:ifeq            59
						bu1 = (bu)iterator.next();
				//   13   36:aload_1         
				//   14   37:invokeinterface #60  <Method Object Iterator.next()>
				//   15   42:checkcast       #62  <Class bu>
				//   16   45:astore_2        

				//   17   46:aload_0         
				//   18   47:getfield        #20  <Field q a>
				//   19   50:aload_2         
				//   20   51:invokeinterface #67  <Method void q.a(bu)>
				//*  21   56:goto            27
				//   22   59:return          
				}

				final q a;
				final bb b;

			
			{
				b = bb.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field bb b>
				a = q1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field q a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    8   17:aload_1         
	//    9   18:new             #6   <Class bb$1>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:aload_2         
	//   13   24:invokespecial   #69  <Method void bb$1(bb, q)>
	//   14   27:invokeinterface #75  <Method void Executor.execute(Runnable)>
			return;
	//   15   32:return          
		}
	}

	public void b(bu bu)
	{
		if(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field boolean c>
	//*   2    4:ifeq            42
		{
			String s = a;
	//    3    7:getstatic       #24  <Field String a>
	//    4   10:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #43  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #44  <Method void StringBuilder()>
	//    8   18:astore_3        
			stringbuilder.append("Storage manager is closed. Not deleting event: ");
	//    9   19:aload_3         
	//   10   20:ldc1            #77  <String "Storage manager is closed. Not deleting event: ">
	//   11   22:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			stringbuilder.append(((Object) (bu)));
	//   13   26:aload_3         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #53  <Method StringBuilder StringBuilder.append(Object)>
	//   16   31:pop             
			AppboyLogger.w(s, stringbuilder.toString());
	//   17   32:aload_2         
	//   18   33:aload_3         
	//   19   34:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   20   37:invokestatic    #60  <Method int AppboyLogger.w(String, String)>
	//   21   40:pop             
			return;
	//   22   41:return          
		} else
		{
			b.b(bu);
	//   23   42:aload_0         
	//   24   43:getfield        #33  <Field dd b>
	//   25   46:aload_1         
	//   26   47:invokeinterface #79  <Method void dd.b(bu)>
			return;
	//   27   52:return          
		}
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/bh);
	private final dd b;
	private boolean c;

	static 
	{
	//    0    0:ldc1            #16  <Class bh>
	//    1    2:invokestatic    #22  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #24  <Field String a>
	//*   3    8:return          
	}
}
