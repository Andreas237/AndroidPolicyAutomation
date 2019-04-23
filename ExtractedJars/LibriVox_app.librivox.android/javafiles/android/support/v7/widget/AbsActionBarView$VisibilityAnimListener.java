// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.view.au;
import android.support.v4.view.ay;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			AbsActionBarView

public class AbsActionBarView$VisibilityAnimListener
	implements ay
{

	public void onAnimationCancel(View view)
	{
		mCanceled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #21  <Field boolean mCanceled>
	//    3    5:return          
	}

	public void onAnimationEnd(View view)
	{
		if(mCanceled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean mCanceled>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			view = ((View) (AbsActionBarView.this));
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field AbsActionBarView this$0>
	//    6   12:astore_1        
			view.mVisibilityAnim = null;
	//    7   13:aload_1         
	//    8   14:aconst_null     
	//    9   15:putfield        #31  <Field au AbsActionBarView.mVisibilityAnim>
			AbsActionBarView.access$101(((AbsActionBarView) (view)), mFinalVisibility);
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #33  <Field int mFinalVisibility>
	//   13   23:invokestatic    #37  <Method void AbsActionBarView.access$101(AbsActionBarView, int)>
			return;
	//   14   26:return          
		}
	}

	public void onAnimationStart(View view)
	{
		AbsActionBarView.access$001(AbsActionBarView.this, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field AbsActionBarView this$0>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #41  <Method void AbsActionBarView.access$001(AbsActionBarView, int)>
		mCanceled = false;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #21  <Field boolean mCanceled>
	//    7   13:return          
	}

	public AbsActionBarView$VisibilityAnimListener withFinalVisibility(au au, int i)
	{
		mVisibilityAnim = au;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field AbsActionBarView this$0>
	//    2    4:aload_1         
	//    3    5:putfield        #31  <Field au AbsActionBarView.mVisibilityAnim>
		mFinalVisibility = i;
	//    4    8:aload_0         
	//    5    9:iload_2         
	//    6   10:putfield        #33  <Field int mFinalVisibility>
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
	//    2    2:putfield        #16  <Field AbsActionBarView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
		mCanceled = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #21  <Field boolean mCanceled>
	//    8   14:return          
	}
}
