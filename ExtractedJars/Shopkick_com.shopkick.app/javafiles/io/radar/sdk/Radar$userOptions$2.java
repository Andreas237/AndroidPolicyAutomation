// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

// Referenced classes of package io.radar.sdk:
//			Radar

static final class Radar$userOptions$2 extends Lambda
	implements Function0
{

	public final Radar.UserOptions invoke()
	{
		return new Radar.UserOptions();
	//    0    0:new             #40  <Class Radar$UserOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void Radar$UserOptions()>
	//    3    7:areturn         
	}

	public volatile Object invoke()
	{
		return ((Object) (invoke()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method Radar$UserOptions invoke()>
	//    2    4:areturn         
	}

	public static final Radar$userOptions$2 INSTANCE = new Radar$userOptions$2();

	static 
	{
	//    0    0:new             #2   <Class Radar$userOptions$2>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void Radar$userOptions$2()>
	//    3    7:putstatic       #32  <Field Radar$userOptions$2 INSTANCE>
	//*   4   10:return          
	}

	Radar$userOptions$2()
	{
		super(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #36  <Method void Lambda(int)>
	//    3    5:return          
	}
}
