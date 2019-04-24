// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import com.alipay.sdk.auth.AuthActivity;

public final class fz
	implements Runnable
{

	public fz(AuthActivity authactivity)
	{
		e = authactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field AuthActivity e>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		AuthActivity.f(e);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field AuthActivity e>
	//    2    4:invokestatic    #22  <Method void AuthActivity.f(AuthActivity)>
	//    3    7:return          
	}

	final AuthActivity e;
}
