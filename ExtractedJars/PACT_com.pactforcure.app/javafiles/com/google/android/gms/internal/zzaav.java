// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.util.zzs;

public class zzaav
{

	public zzaav(Activity activity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zzac.zzb(((Object) (activity)), "Activity must not be null");
	//    2    4:aload_1         
	//    3    5:ldc1            #13  <String "Activity must not be null">
	//    4    7:invokestatic    #19  <Method Object zzac.zzb(Object, Object)>
	//    5   10:pop             
		boolean flag;
		if(zzs.zzyx() || (activity instanceof FragmentActivity))
	//*   6   11:invokestatic    #25  <Method boolean zzs.zzyx()>
	//*   7   14:ifne            24
	//*   8   17:aload_1         
	//*   9   18:instanceof      #27  <Class FragmentActivity>
	//*  10   21:ifeq            38
			flag = true;
	//   11   24:iconst_1        
	//   12   25:istore_2        
		else
	//*  13   26:iload_2         
	//*  14   27:ldc1            #29  <String "This Activity is not supported before platform version 11 (3.0 Honeycomb). Please use FragmentActivity instead.">
	//*  15   29:invokestatic    #32  <Method void zzac.zzb(boolean, Object)>
	//*  16   32:aload_0         
	//*  17   33:aload_1         
	//*  18   34:putfield        #34  <Field Object zzaBr>
	//*  19   37:return          
			flag = false;
	//   20   38:iconst_0        
	//   21   39:istore_2        
		zzac.zzb(flag, "This Activity is not supported before platform version 11 (3.0 Honeycomb). Please use FragmentActivity instead.");
		zzaBr = ((Object) (activity));
	//*  22   40:goto            26
	}

	public boolean zzwl()
	{
		return zzaBr instanceof FragmentActivity;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Object zzaBr>
	//    2    4:instanceof      #27  <Class FragmentActivity>
	//    3    7:ireturn         
	}

	public Activity zzwm()
	{
		return (Activity)zzaBr;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Object zzaBr>
	//    2    4:checkcast       #40  <Class Activity>
	//    3    7:areturn         
	}

	public FragmentActivity zzwn()
	{
		return (FragmentActivity)zzaBr;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Object zzaBr>
	//    2    4:checkcast       #27  <Class FragmentActivity>
	//    3    7:areturn         
	}

	private final Object zzaBr;
}
