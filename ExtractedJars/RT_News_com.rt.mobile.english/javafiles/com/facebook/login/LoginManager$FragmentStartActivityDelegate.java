// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import com.facebook.internal.Validate;

// Referenced classes of package com.facebook.login:
//			StartActivityDelegate, LoginManager

private static class LoginManager$FragmentStartActivityDelegate
	implements StartActivityDelegate
{

	public Activity getActivityContext()
	{
		return ((Activity) (fragment.getActivity()));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Fragment fragment>
	//    2    4:invokevirtual   #34  <Method android.support.v4.app.FragmentActivity Fragment.getActivity()>
	//    3    7:areturn         
	}

	public void startActivityForResult(Intent intent, int i)
	{
		fragment.startActivityForResult(intent, i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Fragment fragment>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #38  <Method void Fragment.startActivityForResult(Intent, int)>
	//    5    9:return          
	}

	private final Fragment fragment;

	LoginManager$FragmentStartActivityDelegate(Fragment fragment1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		Validate.notNull(((Object) (fragment1)), "fragment");
	//    2    4:aload_1         
	//    3    5:ldc1            #17  <String "fragment">
	//    4    7:invokestatic    #23  <Method void Validate.notNull(Object, String)>
		fragment = fragment1;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #25  <Field Fragment fragment>
	//    8   15:return          
	}
}
