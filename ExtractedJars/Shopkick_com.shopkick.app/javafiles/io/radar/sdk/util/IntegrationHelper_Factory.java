// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.util;

import io.radar.shadow.dagger.internal.Factory;

// Referenced classes of package io.radar.sdk.util:
//			IntegrationHelper

public final class IntegrationHelper_Factory
	implements Factory
{

	public IntegrationHelper_Factory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public static IntegrationHelper_Factory create()
	{
		return INSTANCE;
	//    0    0:getstatic       #16  <Field IntegrationHelper_Factory INSTANCE>
	//    1    3:areturn         
	}

	public static IntegrationHelper newIntegrationHelper()
	{
		return new IntegrationHelper();
	//    0    0:new             #24  <Class IntegrationHelper>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void IntegrationHelper()>
	//    3    7:areturn         
	}

	public static IntegrationHelper provideInstance()
	{
		return new IntegrationHelper();
	//    0    0:new             #24  <Class IntegrationHelper>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void IntegrationHelper()>
	//    3    7:areturn         
	}

	public IntegrationHelper get()
	{
		return provideInstance();
	//    0    0:invokestatic    #29  <Method IntegrationHelper provideInstance()>
	//    1    3:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method IntegrationHelper get()>
	//    2    4:areturn         
	}

	private static final IntegrationHelper_Factory INSTANCE = new IntegrationHelper_Factory();

	static 
	{
	//    0    0:new             #2   <Class IntegrationHelper_Factory>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void IntegrationHelper_Factory()>
	//    3    7:putstatic       #16  <Field IntegrationHelper_Factory INSTANCE>
	//*   4   10:return          
	}
}
