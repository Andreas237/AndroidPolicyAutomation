// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			AbsActionBarView

protected class AbsActionBarView$VisibilityAnimListener
	implements ViewPropertyAnimatorListener
{

	public void onAnimationCancel(View view)
	{
		mCanceled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #24  <Field boolean mCanceled>
	//    3    5:return          
	}

	public void onAnimationEnd(View view)
	{
		if(mCanceled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field boolean mCanceled>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			mVisibilityAnim = null;
	//    4    8:aload_0         
	//    5    9:getfield        #19  <Field AbsActionBarView this$0>
	//    6   12:aconst_null     
	//    7   13:putfield        #32  <Field ViewPropertyAnimatorCompat AbsActionBarView.mVisibilityAnim>
			AbsActionBarView.access$101(AbsActionBarView.this, mFinalVisibility);
	//    8   16:aload_0         
	//    9   17:getfield        #19  <Field AbsActionBarView this$0>
	//   10   20:aload_0         
	//   11   21:getfield        #34  <Field int mFinalVisibility>
	//   12   24:invokestatic    #38  <Method void AbsActionBarView.access$101(AbsActionBarView, int)>
			return;
	//   13   27:return          
		}
	}

	public void onAnimationStart(View view)
	{
		AbsActionBarView.access$001(AbsActionBarView.this, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AbsActionBarView this$0>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #42  <Method void AbsActionBarView.access$001(AbsActionBarView, int)>
		mCanceled = false;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #24  <Field boolean mCanceled>
	//    7   13:return          
	}

	public AbsActionBarView$VisibilityAnimListener withFinalVisibility(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, int i)
	{
		mVisibilityAnim = viewpropertyanimatorcompat;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AbsActionBarView this$0>
	//    2    4:aload_1         
	//    3    5:putfield        #32  <Field ViewPropertyAnimatorCompat AbsActionBarView.mVisibilityAnim>
		mFinalVisibility = i;
	//    4    8:aload_0         
	//    5    9:iload_2         
	//    6   10:putfield        #34  <Field int mFinalVisibility>
		return this;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	private boolean mCanceled;
	int mFinalVisibility;
	final AbsActionBarView this$0;

	protected AbsActionBarView$VisibilityAnimListener()
	{
		this$0 = AbsActionBarView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AbsActionBarView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
		mCanceled = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #24  <Field boolean mCanceled>
	//    8   14:return          
	}
}
