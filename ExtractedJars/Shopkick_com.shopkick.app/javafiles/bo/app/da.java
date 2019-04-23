// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package bo.app:
//			dd, ap, aa, bu

public class da
	implements dd
{

	public da(dd dd1, aa aa1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		d = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #31  <Field boolean d>
		b = dd1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #33  <Field dd b>
		c = aa1;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #35  <Field aa c>
	//   11   19:return          
	}

	private void a(aa aa1, Throwable throwable)
	{
		try
		{
			aa1.a(((Object) (new ap("A database exception has occurred. Please view the stack trace for more details.", throwable))), bo/app/ap);
	//    0    0:aload_1         
	//    1    1:new             #40  <Class ap>
	//    2    4:dup             
	//    3    5:ldc1            #42  <String "A database exception has occurred. Please view the stack trace for more details.">
	//    4    7:aload_2         
	//    5    8:invokespecial   #45  <Method void ap(String, Throwable)>
	//    6   11:ldc1            #40  <Class ap>
	//    7   13:invokeinterface #50  <Method void aa.a(Object, Class)>
			return;
	//    8   18:return          
		}
		// Misplaced declaration of an exception variable
		catch(aa aa1)
	//*   9   19:astore_1        
		{
			AppboyLogger.e(a, "Failed to log throwable.", ((Throwable) (aa1)));
	//   10   20:getstatic       #24  <Field String a>
	//   11   23:ldc1            #52  <String "Failed to log throwable.">
	//   12   25:aload_1         
	//   13   26:invokestatic    #56  <Method int AppboyLogger.e(String, String, Throwable)>
	//   14   29:pop             
		}
	//   15   30:return          
	}

	public Collection a()
	{
		if(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field boolean d>
	//*   2    4:ifeq            20
		{
			AppboyLogger.w(a, "Storage provider is closed. Not getting all events.");
	//    3    7:getstatic       #24  <Field String a>
	//    4   10:ldc1            #60  <String "Storage provider is closed. Not getting all events.">
	//    5   12:invokestatic    #64  <Method int AppboyLogger.w(String, String)>
	//    6   15:pop             
			return ((Collection) (Collections.emptyList()));
	//    7   16:invokestatic    #70  <Method java.util.List Collections.emptyList()>
	//    8   19:areturn         
		}
		Collection collection;
		try
		{
			collection = b.a();
	//    9   20:aload_0         
	//   10   21:getfield        #33  <Field dd b>
	//   11   24:invokeinterface #72  <Method Collection dd.a()>
	//   12   29:astore_1        
		}
	//*  13   30:aload_1         
	//*  14   31:areturn         
		catch(Exception exception)
	//*  15   32:astore_1        
		{
			AppboyLogger.e(a, "Failed to get all events from storage.", ((Throwable) (exception)));
	//   16   33:getstatic       #24  <Field String a>
	//   17   36:ldc1            #74  <String "Failed to get all events from storage.">
	//   18   38:aload_1         
	//   19   39:invokestatic    #56  <Method int AppboyLogger.e(String, String, Throwable)>
	//   20   42:pop             
			a(c, ((Throwable) (exception)));
	//   21   43:aload_0         
	//   22   44:aload_0         
	//   23   45:getfield        #35  <Field aa c>
	//   24   48:aload_1         
	//   25   49:invokespecial   #76  <Method void a(aa, Throwable)>
			return ((Collection) (Collections.emptyList()));
	//   26   52:invokestatic    #70  <Method java.util.List Collections.emptyList()>
	//   27   55:areturn         
		}
		return collection;
	}

	public void a(bu bu)
	{
		if(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field boolean d>
	//*   2    4:ifeq            42
		{
			String s = a;
	//    3    7:getstatic       #24  <Field String a>
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
	//   20   37:invokestatic    #64  <Method int AppboyLogger.w(String, String)>
	//   21   40:pop             
			return;
	//   22   41:return          
		}
		try
		{
			b.a(bu);
	//   23   42:aload_0         
	//   24   43:getfield        #33  <Field dd b>
	//   25   46:aload_1         
	//   26   47:invokeinterface #98  <Method void dd.a(bu)>
			return;
	//   27   52:return          
		}
		// Misplaced declaration of an exception variable
		catch(bu bu)
	//*  28   53:astore_1        
		{
			AppboyLogger.e(a, "Failed to insert event into storage.", ((Throwable) (bu)));
	//   29   54:getstatic       #24  <Field String a>
	//   30   57:ldc1            #100 <String "Failed to insert event into storage.">
	//   31   59:aload_1         
	//   32   60:invokestatic    #56  <Method int AppboyLogger.e(String, String, Throwable)>
	//   33   63:pop             
		}
		a(c, ((Throwable) (bu)));
	//   34   64:aload_0         
	//   35   65:aload_0         
	//   36   66:getfield        #35  <Field aa c>
	//   37   69:aload_1         
	//   38   70:invokespecial   #76  <Method void a(aa, Throwable)>
	//   39   73:return          
	}

	public void b()
	{
		AppboyLogger.w(a, "Setting this provider and internal storage provider to closed.");
	//    0    0:getstatic       #24  <Field String a>
	//    1    3:ldc1            #102 <String "Setting this provider and internal storage provider to closed.">
	//    2    5:invokestatic    #64  <Method int AppboyLogger.w(String, String)>
	//    3    8:pop             
		d = true;
	//    4    9:aload_0         
	//    5   10:iconst_1        
	//    6   11:putfield        #31  <Field boolean d>
		b.b();
	//    7   14:aload_0         
	//    8   15:getfield        #33  <Field dd b>
	//    9   18:invokeinterface #104 <Method void dd.b()>
	//   10   23:return          
	}

	public void b(bu bu)
	{
		if(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field boolean d>
	//*   2    4:ifeq            42
		{
			String s = a;
	//    3    7:getstatic       #24  <Field String a>
	//    4   10:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #82  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #83  <Method void StringBuilder()>
	//    8   18:astore_3        
			stringbuilder.append("Storage provider is closed. Not deleting event: ");
	//    9   19:aload_3         
	//   10   20:ldc1            #106 <String "Storage provider is closed. Not deleting event: ">
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
	//   20   37:invokestatic    #64  <Method int AppboyLogger.w(String, String)>
	//   21   40:pop             
			return;
	//   22   41:return          
		}
		try
		{
			b.b(bu);
	//   23   42:aload_0         
	//   24   43:getfield        #33  <Field dd b>
	//   25   46:aload_1         
	//   26   47:invokeinterface #108 <Method void dd.b(bu)>
			return;
	//   27   52:return          
		}
		// Misplaced declaration of an exception variable
		catch(bu bu)
	//*  28   53:astore_1        
		{
			AppboyLogger.e(a, "Failed to delete event from storage.", ((Throwable) (bu)));
	//   29   54:getstatic       #24  <Field String a>
	//   30   57:ldc1            #110 <String "Failed to delete event from storage.">
	//   31   59:aload_1         
	//   32   60:invokestatic    #56  <Method int AppboyLogger.e(String, String, Throwable)>
	//   33   63:pop             
		}
		a(c, ((Throwable) (bu)));
	//   34   64:aload_0         
	//   35   65:aload_0         
	//   36   66:getfield        #35  <Field aa c>
	//   37   69:aload_1         
	//   38   70:invokespecial   #76  <Method void a(aa, Throwable)>
	//   39   73:return          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/da);
	private final dd b;
	private final aa c;
	private boolean d;

	static 
	{
	//    0    0:ldc1            #2   <Class da>
	//    1    2:invokestatic    #22  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #24  <Field String a>
	//*   3    8:return          
	}
}
