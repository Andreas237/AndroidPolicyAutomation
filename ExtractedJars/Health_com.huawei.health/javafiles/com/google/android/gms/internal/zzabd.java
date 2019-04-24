// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.common.internal.zzac;

public class zzabd
{

	public zzabd(Activity activity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zzac.zzb(((Object) (activity)), "Activity must not be null");
	//    2    4:aload_1         
	//    3    5:ldc1            #13  <String "Activity must not be null">
	//    4    7:invokestatic    #19  <Method Object zzac.zzb(Object, Object)>
	//    5   10:pop             
		zzaCQ = ((Object) (activity));
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #21  <Field Object zzaCQ>
	//    9   16:return          
	}

	public boolean zzwS()
	{
		return zzaCQ instanceof FragmentActivity;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Object zzaCQ>
	//    2    4:instanceof      #26  <Class FragmentActivity>
	//    3    7:ireturn         
	}

	public Activity zzwT()
	{
		return (Activity)zzaCQ;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Object zzaCQ>
	//    2    4:checkcast       #30  <Class Activity>
	//    3    7:areturn         
	}

	public FragmentActivity zzwU()
	{
		return (FragmentActivity)zzaCQ;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Object zzaCQ>
	//    2    4:checkcast       #26  <Class FragmentActivity>
	//    3    7:areturn         
	}

	private final Object zzaCQ;
}
