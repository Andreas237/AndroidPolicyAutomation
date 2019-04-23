// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.di;

import android.content.Context;
import io.radar.sdk.util.DeviceHelper;
import kotlin.jvm.internal.Intrinsics;

public final class CoreModule
{

	public CoreModule(Context context1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (context1)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #27  <String "context">
	//    2    3:invokestatic    #33  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super();
	//    3    6:aload_0         
	//    4    7:invokespecial   #36  <Method void Object()>
		context = context1;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #38  <Field Context context>
	//    8   15:return          
	}

	public final Context context()
	{
		return context;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Context context>
	//    2    4:areturn         
	}

	public final DeviceHelper deviceHelper()
	{
		return DeviceHelper.INSTANCE;
	//    0    0:getstatic       #51  <Field DeviceHelper DeviceHelper.INSTANCE>
	//    1    3:areturn         
	}

	private final Context context;
}
