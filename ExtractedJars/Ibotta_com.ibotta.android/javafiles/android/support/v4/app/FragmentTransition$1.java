// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			FragmentTransition

static final class FragmentTransition$1
	implements Runnable
{

	public void run()
	{
		FragmentTransition.setViewVisibility(val$exitingViews, 4);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ArrayList val$exitingViews>
	//    2    4:iconst_4        
	//    3    5:invokestatic    #26  <Method void FragmentTransition.setViewVisibility(ArrayList, int)>
	//    4    8:return          
	}

	final ArrayList val$exitingViews;

	FragmentTransition$1(ArrayList arraylist)
	{
		val$exitingViews = arraylist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ArrayList val$exitingViews>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
