// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
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
		zzbc = ((Object) (activity));
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #22  <Field Object zzbc>
	//    9   16:return          
	}

	public LifecycleActivity(ContextWrapper contextwrapper)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		throw new UnsupportedOperationException();
	//    2    4:new             #26  <Class UnsupportedOperationException>
	//    3    7:dup             
	//    4    8:invokespecial   #27  <Method void UnsupportedOperationException()>
	//    5   11:athrow          
	}

	public Activity asActivity()
	{
		return (Activity)zzbc;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object zzbc>
	//    2    4:checkcast       #32  <Class Activity>
	//    3    7:areturn         
	}

	public FragmentActivity asFragmentActivity()
	{
		return (FragmentActivity)zzbc;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object zzbc>
	//    2    4:checkcast       #36  <Class FragmentActivity>
	//    3    7:areturn         
	}

	public Object asObject()
	{
		return zzbc;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object zzbc>
	//    2    4:areturn         
	}

	public boolean isChimera()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isSupport()
	{
		return zzbc instanceof FragmentActivity;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object zzbc>
	//    2    4:instanceof      #36  <Class FragmentActivity>
	//    3    7:ireturn         
	}

	public final boolean zzh()
	{
		return zzbc instanceof Activity;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object zzbc>
	//    2    4:instanceof      #32  <Class Activity>
	//    3    7:ireturn         
	}

	private final Object zzbc;
}
