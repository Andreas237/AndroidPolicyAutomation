// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.view.View;

// Referenced classes of package android.support.transition:
//			Transition, TransitionValues, WindowIdImpl

private static class Transition$AnimationInfo
{

	String mName;
	Transition mTransition;
	TransitionValues mValues;
	View mView;
	WindowIdImpl mWindowId;

	Transition$AnimationInfo(View view, String s, Transition transition, WindowIdImpl windowidimpl, TransitionValues transitionvalues)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		mView = view;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field View mView>
		mName = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field String mName>
		mValues = transitionvalues;
	//    8   14:aload_0         
	//    9   15:aload           5
	//   10   17:putfield        #28  <Field TransitionValues mValues>
		mWindowId = windowidimpl;
	//   11   20:aload_0         
	//   12   21:aload           4
	//   13   23:putfield        #30  <Field WindowIdImpl mWindowId>
		mTransition = transition;
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:putfield        #32  <Field Transition mTransition>
	//   17   31:return          
	}
}
