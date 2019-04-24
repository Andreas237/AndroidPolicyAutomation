// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v4.view.*;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV9

class AppCompatDelegateImplV9$6 extends ViewPropertyAnimatorListenerAdapter
{

	public void onAnimationEnd(View view)
	{
		mActionModeView.setAlpha(1.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
	//    2    4:getfield        #25  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
	//    3    7:fconst_1        
	//    4    8:invokevirtual   #31  <Method void ActionBarContextView.setAlpha(float)>
		mFadeAnim.setListener(((android.support.v4.view.ViewPropertyAnimatorListener) (null)));
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
	//    7   15:getfield        #35  <Field ViewPropertyAnimatorCompat AppCompatDelegateImplV9.mFadeAnim>
	//    8   18:aconst_null     
	//    9   19:invokevirtual   #41  <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setListener(android.support.v4.view.ViewPropertyAnimatorListener)>
	//   10   22:pop             
		mFadeAnim = null;
	//   11   23:aload_0         
	//   12   24:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
	//   13   27:aconst_null     
	//   14   28:putfield        #35  <Field ViewPropertyAnimatorCompat AppCompatDelegateImplV9.mFadeAnim>
	//   15   31:return          
	}

	public void onAnimationStart(View view)
	{
		mActionModeView.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
	//    2    4:getfield        #25  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
	//    3    7:iconst_0        
	//    4    8:invokevirtual   #46  <Method void ActionBarContextView.setVisibility(int)>
		mActionModeView.sendAccessibilityEvent(32);
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
	//    7   15:getfield        #25  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
	//    8   18:bipush          32
	//    9   20:invokevirtual   #49  <Method void ActionBarContextView.sendAccessibilityEvent(int)>
		if(mActionModeView.getParent() instanceof View)
	//*  10   23:aload_0         
	//*  11   24:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
	//*  12   27:getfield        #25  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
	//*  13   30:invokevirtual   #53  <Method android.view.ViewParent ActionBarContextView.getParent()>
	//*  14   33:instanceof      #55  <Class View>
	//*  15   36:ifeq            55
			ViewCompat.requestApplyInsets((View)mActionModeView.getParent());
	//   16   39:aload_0         
	//   17   40:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
	//   18   43:getfield        #25  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
	//   19   46:invokevirtual   #53  <Method android.view.ViewParent ActionBarContextView.getParent()>
	//   20   49:checkcast       #55  <Class View>
	//   21   52:invokestatic    #60  <Method void ViewCompat.requestApplyInsets(View)>
	//   22   55:return          
	}

	final AppCompatDelegateImplV9 this$0;

	AppCompatDelegateImplV9$6()
	{
		this$0 = AppCompatDelegateImplV9.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field AppCompatDelegateImplV9 this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void ViewPropertyAnimatorListenerAdapter()>
	//    5    9:return          
	}
}
