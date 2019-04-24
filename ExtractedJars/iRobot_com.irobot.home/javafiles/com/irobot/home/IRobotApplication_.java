// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.home.rest.RegistrationRestClient_;
import com.irobot.home.rest.RegistrationRestErrorHandler_;
import com.irobot.home.util.k;

// Referenced classes of package com.irobot.home:
//			IRobotApplication

public final class IRobotApplication_ extends IRobotApplication
{

	public IRobotApplication_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void IRobotApplication()>
	//    2    4:return          
	}

	public static IRobotApplication r()
	{
		return f;
	//    0    0:getstatic       #15  <Field IRobotApplication f>
	//    1    3:areturn         
	}

	private void s()
	{
		a = new k(((android.content.Context) (this)));
	//    0    0:aload_0         
	//    1    1:new             #18  <Class k>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void k(android.content.Context)>
	//    5    9:putfield        #25  <Field k a>
		e = ((com.irobot.home.rest.RegistrationRestErrorHandler) (RegistrationRestErrorHandler_.getInstance_(((android.content.Context) (this)))));
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:invokestatic    #31  <Method RegistrationRestErrorHandler_ RegistrationRestErrorHandler_.getInstance_(android.content.Context)>
	//    9   17:putfield        #35  <Field com.irobot.home.rest.RegistrationRestErrorHandler e>
		d = ((com.irobot.home.rest.RegistrationRestClient) (new RegistrationRestClient_(((android.content.Context) (this)))));
	//   10   20:aload_0         
	//   11   21:new             #37  <Class RegistrationRestClient_>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:invokespecial   #38  <Method void RegistrationRestClient_(android.content.Context)>
	//   15   29:putfield        #42  <Field com.irobot.home.rest.RegistrationRestClient d>
		a();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #44  <Method void a()>
	//   18   36:return          
	}

	public void onCreate()
	{
		f = ((IRobotApplication) (this));
	//    0    0:aload_0         
	//    1    1:putstatic       #15  <Field IRobotApplication f>
		s();
	//    2    4:aload_0         
	//    3    5:invokespecial   #47  <Method void s()>
		super.onCreate();
	//    4    8:aload_0         
	//    5    9:invokespecial   #49  <Method void IRobotApplication.onCreate()>
	//    6   12:return          
	}

	private static IRobotApplication f;
}
