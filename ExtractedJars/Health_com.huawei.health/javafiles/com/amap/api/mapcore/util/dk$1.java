// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.animation.Animator;

// Referenced classes of package com.amap.api.mapcore.util:
//			dk

class dk$1
	implements android.animation.tor.AnimatorListener
{

	public void onAnimationCancel(Animator animator)
	{
	//    0    0:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		dk.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field dk a>
	//    2    4:invokestatic    #23  <Method void dk.a(dk)>
	//    3    7:return          
	}

	public void onAnimationRepeat(Animator animator)
	{
	//    0    0:return          
	}

	public void onAnimationStart(Animator animator)
	{
	//    0    0:return          
	}

	final dk a;

	dk$1(dk dk1)
	{
		a = dk1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field dk a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
