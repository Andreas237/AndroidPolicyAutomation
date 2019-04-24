// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package com.google.android.gms.internal:
//			zzaav, zzabm, zzaay, zzaax

public class zzaaw
{

	protected zzaaw(zzaax zzaax1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zzaBs = zzaax1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field zzaax zzaBs>
	//    5    9:return          
	}

	protected static zzaax zzc(zzaav zzaav1)
	{
		if(zzaav1.zzwl())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #22  <Method boolean zzaav.zzwl()>
	//*   2    4:ifeq            15
			return ((zzaax) (zzabm.zza(zzaav1.zzwn())));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #26  <Method android.support.v4.app.FragmentActivity zzaav.zzwn()>
	//    5   11:invokestatic    #32  <Method zzabm zzabm.zza(android.support.v4.app.FragmentActivity)>
	//    6   14:areturn         
		else
			return ((zzaax) (zzaay.zzt(zzaav1.zzwm())));
	//    7   15:aload_0         
	//    8   16:invokevirtual   #36  <Method Activity zzaav.zzwm()>
	//    9   19:invokestatic    #42  <Method zzaay zzaay.zzt(Activity)>
	//   10   22:areturn         
	}

	public static zzaax zzs(Activity activity)
	{
		return zzc(new zzaav(activity));
	//    0    0:new             #18  <Class zzaav>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #47  <Method void zzaav(Activity)>
	//    4    8:invokestatic    #49  <Method zzaax zzc(zzaav)>
	//    5   11:areturn         
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
	//    0    0:return          
	}

	public Activity getActivity()
	{
		return zzaBs.zzwo();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field zzaax zzaBs>
	//    2    4:invokeinterface #59  <Method Activity zzaax.zzwo()>
	//    3    9:areturn         
	}

	public void onActivityResult(int i, int j, Intent intent)
	{
	//    0    0:return          
	}

	public void onCreate(Bundle bundle)
	{
	//    0    0:return          
	}

	public void onDestroy()
	{
	//    0    0:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
	//    0    0:return          
	}

	public void onStart()
	{
	//    0    0:return          
	}

	public void onStop()
	{
	//    0    0:return          
	}

	protected final zzaax zzaBs;
}
