// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.animation.ValueAnimator;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//			ViewPropertyAnimatorCompatKK, ViewPropertyAnimatorUpdateListener

static final class ViewPropertyAnimatorCompatKK$1
	implements android.animation.tener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		val$listener.onAnimationUpdate(val$view);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ViewPropertyAnimatorUpdateListener val$listener>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field View val$view>
	//    4    8:invokeinterface #32  <Method void ViewPropertyAnimatorUpdateListener.onAnimationUpdate(View)>
	//    5   13:return          
	}

	final ViewPropertyAnimatorUpdateListener val$listener;
	final View val$view;

	ViewPropertyAnimatorCompatKK$1(ViewPropertyAnimatorUpdateListener viewpropertyanimatorupdatelistener, View view1)
	{
		val$listener = viewpropertyanimatorupdatelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ViewPropertyAnimatorUpdateListener val$listener>
		val$view = view1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field View val$view>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
