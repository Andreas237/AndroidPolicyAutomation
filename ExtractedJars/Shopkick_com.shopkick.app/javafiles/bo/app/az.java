// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.amazon.device.messaging.development.ADMManifest;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//			bp

public class az
{

	public az(Context context, bp bp1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		a = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field Context a>
		b = bp1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field bp b>
	//    8   14:return          
	}

	public static boolean a(Context context)
	{
		return b() && b(context);
	//    0    0:invokestatic    #33  <Method boolean b()>
	//    1    3:ifeq            15
	//    2    6:aload_0         
	//    3    7:invokestatic    #35  <Method boolean b(Context)>
	//    4   10:ifeq            15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	private static boolean b()
	{
		Exception exception;
		try
		{
			Class.forName("com.amazon.device.messaging.ADM");
	//    0    0:ldc1            #39  <String "com.amazon.device.messaging.ADM">
	//    1    2:invokestatic    #45  <Method Class Class.forName(String)>
	//    2    5:pop             
		}
	//*   3    6:iconst_1        
	//*   4    7:ireturn         
	//*   5    8:getstatic       #20  <Field String c>
	//*   6   11:ldc1            #47  <String "com.amazon.device.messaging.ADM not found">
	//*   7   13:invokestatic    #51  <Method int AppboyLogger.i(String, String)>
	//*   8   16:pop             
	//*   9   17:iconst_0        
	//*  10   18:ireturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			AppboyLogger.i(c, "com.amazon.device.messaging.ADM not found");
			return false;
		}
		return true;
	//*  11   19:astore_0        
	//*  12   20:goto            8
	}

	private static boolean b(Context context)
	{
		try
		{
			ADMManifest.checkManifestAuthoredProperly(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #57  <Method void ADMManifest.checkManifestAuthoredProperly(Context)>
		}
	//*   2    4:iconst_1        
	//*   3    5:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*   4    6:astore_0        
		{
			AppboyLogger.i(c, "Manifest not authored properly to support ADM.");
	//    5    7:getstatic       #20  <Field String c>
	//    6   10:ldc1            #59  <String "Manifest not authored properly to support ADM.">
	//    7   12:invokestatic    #51  <Method int AppboyLogger.i(String, String)>
	//    8   15:pop             
			AppboyLogger.i(c, "ADM manifest exception: ", ((Throwable) (context)));
	//    9   16:getstatic       #20  <Field String c>
	//   10   19:ldc1            #61  <String "ADM manifest exception: ">
	//   11   21:aload_0         
	//   12   22:invokestatic    #64  <Method int AppboyLogger.i(String, String, Throwable)>
	//   13   25:pop             
			return false;
	//   14   26:iconst_0        
	//   15   27:ireturn         
		}
		return true;
	}

	public void a()
	{
		if(b.a() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field bp b>
	//*   2    4:invokeinterface #69  <Method String bp.a()>
	//*   3    9:ifnull          81
		{
			AppboyLogger.i(c, "The device is already registered with the ADM server and is eligible to receive ADM messages.");
	//    4   12:getstatic       #20  <Field String c>
	//    5   15:ldc1            #71  <String "The device is already registered with the ADM server and is eligible to receive ADM messages.">
	//    6   17:invokestatic    #51  <Method int AppboyLogger.i(String, String)>
	//    7   20:pop             
			Object obj = ((Object) (c));
	//    8   21:getstatic       #20  <Field String c>
	//    9   24:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   10   25:new             #73  <Class StringBuilder>
	//   11   28:dup             
	//   12   29:invokespecial   #74  <Method void StringBuilder()>
	//   13   32:astore_2        
			stringbuilder.append("ADM registration id: ");
	//   14   33:aload_2         
	//   15   34:ldc1            #76  <String "ADM registration id: ">
	//   16   36:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   17   39:pop             
			stringbuilder.append(b.a());
	//   18   40:aload_2         
	//   19   41:aload_0         
	//   20   42:getfield        #29  <Field bp b>
	//   21   45:invokeinterface #69  <Method String bp.a()>
	//   22   50:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   23   53:pop             
			AppboyLogger.i(((String) (obj)), stringbuilder.toString());
	//   24   54:aload_1         
	//   25   55:aload_2         
	//   26   56:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   27   59:invokestatic    #51  <Method int AppboyLogger.i(String, String)>
	//   28   62:pop             
			obj = ((Object) (b));
	//   29   63:aload_0         
	//   30   64:getfield        #29  <Field bp b>
	//   31   67:astore_1        
			((bp) (obj)).a(((bp) (obj)).a());
	//   32   68:aload_1         
	//   33   69:aload_1         
	//   34   70:invokeinterface #69  <Method String bp.a()>
	//   35   75:invokeinterface #86  <Method void bp.a(String)>
			return;
	//   36   80:return          
		}
		ADM adm = new ADM(a);
	//   37   81:new             #88  <Class ADM>
	//   38   84:dup             
	//   39   85:aload_0         
	//   40   86:getfield        #27  <Field Context a>
	//   41   89:invokespecial   #90  <Method void ADM(Context)>
	//   42   92:astore_1        
		if(adm.isSupported())
	//*  43   93:aload_1         
	//*  44   94:invokevirtual   #93  <Method boolean ADM.isSupported()>
	//*  45   97:ifeq            113
		{
			AppboyLogger.i(c, "Registering with ADM server...");
	//   46  100:getstatic       #20  <Field String c>
	//   47  103:ldc1            #95  <String "Registering with ADM server...">
	//   48  105:invokestatic    #51  <Method int AppboyLogger.i(String, String)>
	//   49  108:pop             
			adm.startRegister();
	//   50  109:aload_1         
	//   51  110:invokevirtual   #98  <Method void ADM.startRegister()>
		}
	//   52  113:return          
	}

	private static final String c = AppboyLogger.getAppboyLogTag(bo/app/az);
	private final Context a;
	private final bp b;

	static 
	{
	//    0    0:ldc1            #2   <Class az>
	//    1    2:invokestatic    #18  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #20  <Field String c>
	//*   3    8:return          
	}
}
