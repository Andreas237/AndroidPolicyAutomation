// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.common.internal.Preconditions;

public class LifecycleActivity
{

	public LifecycleActivity(Activity activity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		Preconditions.checkNotNull(((Object) (activity)), "Activity must not be null");
	//    2    4:aload_1         
	//    3    5:ldc1            #14  <String "Activity must not be null">
	//    4    7:invokestatic    #20  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    5   10:pop             
		zzkz = ((Object) (activity));
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #22  <Field Object zzkz>
	//    9   16:return          
	}

	public final boolean zzbv()
	{
		return zzkz instanceof FragmentActivity;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object zzkz>
	//    2    4:instanceof      #27  <Class FragmentActivity>
	//    3    7:ireturn         
	}

	public final boolean zzbw()
	{
		return zzkz instanceof Activity;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object zzkz>
	//    2    4:instanceof      #30  <Class Activity>
	//    3    7:ireturn         
	}

	public final Activity zzbx()
	{
		return (Activity)zzkz;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object zzkz>
	//    2    4:checkcast       #30  <Class Activity>
	//    3    7:areturn         
	}

	public final FragmentActivity zzby()
	{
		return (FragmentActivity)zzkz;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object zzkz>
	//    2    4:checkcast       #27  <Class FragmentActivity>
	//    3    7:areturn         
	}

	private final Object zzkz;
}
