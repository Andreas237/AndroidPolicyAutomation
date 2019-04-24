// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.rest;

import android.content.Context;

// Referenced classes of package com.irobot.home.rest:
//			RegistrationRestErrorHandler

public final class RegistrationRestErrorHandler_ extends RegistrationRestErrorHandler
{

	private RegistrationRestErrorHandler_(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void RegistrationRestErrorHandler()>
		context_ = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field Context context_>
		init_();
	//    5    9:aload_0         
	//    6   10:invokespecial   #16  <Method void init_()>
	//    7   13:return          
	}

	public static RegistrationRestErrorHandler_ getInstance_(Context context)
	{
		return new RegistrationRestErrorHandler_(context);
	//    0    0:new             #2   <Class RegistrationRestErrorHandler_>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #21  <Method void RegistrationRestErrorHandler_(Context)>
	//    4    8:areturn         
	}

	private void init_()
	{
	//    0    0:return          
	}

	public void rebind(Context context)
	{
		context_ = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field Context context_>
		init_();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void init_()>
	//    5    9:return          
	}

	private Context context_;
}
