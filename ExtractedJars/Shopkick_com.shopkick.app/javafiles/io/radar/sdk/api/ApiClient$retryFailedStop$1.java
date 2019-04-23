// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.api;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

// Referenced classes of package io.radar.sdk.api:
//			ApiClient

static final class ApiClient$retryFailedStop$1 extends Lambda
	implements Function0
{

	public volatile Object invoke()
	{
		invoke();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #42  <Method void invoke()>
		return ((Object) (Unit.INSTANCE));
	//    2    4:getstatic       #47  <Field Unit Unit.INSTANCE>
	//    3    7:areturn         
	}

	public final void invoke()
	{
	//    0    0:return          
	}

	public static final ApiClient$retryFailedStop$1 INSTANCE = new ApiClient$retryFailedStop$1();

	static 
	{
	//    0    0:new             #2   <Class ApiClient$retryFailedStop$1>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void ApiClient$retryFailedStop$1()>
	//    3    7:putstatic       #35  <Field ApiClient$retryFailedStop$1 INSTANCE>
	//*   4   10:return          
	}

	ApiClient$retryFailedStop$1()
	{
		super(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #39  <Method void Lambda(int)>
	//    3    5:return          
	}
}
