// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//			de, ap, aa, by

public class db
	implements de
{

	public db(de de1, aa aa1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		b = de1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field de b>
		c = aa1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field aa c>
	//    8   14:return          
	}

	public by a()
	{
		by by;
		try
		{
			by = b.a();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field de b>
	//    2    4:invokeinterface #36  <Method by de.a()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(Exception exception)
	//*   6   12:astore_1        
		{
			AppboyLogger.e(a, "Failed to get the active session from the storage.", ((Throwable) (exception)));
	//    7   13:getstatic       #22  <Field String a>
	//    8   16:ldc1            #38  <String "Failed to get the active session from the storage.">
	//    9   18:aload_1         
	//   10   19:invokestatic    #42  <Method int AppboyLogger.e(String, String, Throwable)>
	//   11   22:pop             
			a(c, ((Throwable) (exception)));
	//   12   23:aload_0         
	//   13   24:aload_0         
	//   14   25:getfield        #31  <Field aa c>
	//   15   28:aload_1         
	//   16   29:invokevirtual   #45  <Method void a(aa, Throwable)>
			return null;
	//   17   32:aconst_null     
	//   18   33:areturn         
		}
		return by;
	}

	void a(aa aa1, Throwable throwable)
	{
		try
		{
			aa1.a(((Object) (new ap("A database exception has occurred. Please view the stack trace for more details.", throwable))), bo/app/ap);
	//    0    0:aload_1         
	//    1    1:new             #47  <Class ap>
	//    2    4:dup             
	//    3    5:ldc1            #49  <String "A database exception has occurred. Please view the stack trace for more details.">
	//    4    7:aload_2         
	//    5    8:invokespecial   #52  <Method void ap(String, Throwable)>
	//    6   11:ldc1            #47  <Class ap>
	//    7   13:invokeinterface #57  <Method void aa.a(Object, Class)>
			return;
	//    8   18:return          
		}
		// Misplaced declaration of an exception variable
		catch(aa aa1)
	//*   9   19:astore_1        
		{
			AppboyLogger.e(a, "Failed to log throwable.", ((Throwable) (aa1)));
	//   10   20:getstatic       #22  <Field String a>
	//   11   23:ldc1            #59  <String "Failed to log throwable.">
	//   12   25:aload_1         
	//   13   26:invokestatic    #42  <Method int AppboyLogger.e(String, String, Throwable)>
	//   14   29:pop             
		}
	//   15   30:return          
	}

	public void a(by by)
	{
		try
		{
			b.a(by);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field de b>
	//    2    4:aload_1         
	//    3    5:invokeinterface #62  <Method void de.a(by)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(by by)
	//*   5   11:astore_1        
		{
			AppboyLogger.e(a, "Failed to upsert active session in the storage.", ((Throwable) (by)));
	//    6   12:getstatic       #22  <Field String a>
	//    7   15:ldc1            #64  <String "Failed to upsert active session in the storage.">
	//    8   17:aload_1         
	//    9   18:invokestatic    #42  <Method int AppboyLogger.e(String, String, Throwable)>
	//   10   21:pop             
		}
		a(c, ((Throwable) (by)));
	//   11   22:aload_0         
	//   12   23:aload_0         
	//   13   24:getfield        #31  <Field aa c>
	//   14   27:aload_1         
	//   15   28:invokevirtual   #45  <Method void a(aa, Throwable)>
	//   16   31:return          
	}

	public void b(by by)
	{
		try
		{
			b.b(by);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field de b>
	//    2    4:aload_1         
	//    3    5:invokeinterface #66  <Method void de.b(by)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(by by)
	//*   5   11:astore_1        
		{
			AppboyLogger.e(a, "Failed to delete the sealed session from the storage.", ((Throwable) (by)));
	//    6   12:getstatic       #22  <Field String a>
	//    7   15:ldc1            #68  <String "Failed to delete the sealed session from the storage.">
	//    8   17:aload_1         
	//    9   18:invokestatic    #42  <Method int AppboyLogger.e(String, String, Throwable)>
	//   10   21:pop             
		}
		a(c, ((Throwable) (by)));
	//   11   22:aload_0         
	//   12   23:aload_0         
	//   13   24:getfield        #31  <Field aa c>
	//   14   27:aload_1         
	//   15   28:invokevirtual   #45  <Method void a(aa, Throwable)>
	//   16   31:return          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/db);
	private final de b;
	private final aa c;

	static 
	{
	//    0    0:ldc1            #2   <Class db>
	//    1    2:invokestatic    #20  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #22  <Field String a>
	//*   3    8:return          
	}
}
