// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v4.view.*;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImpl

class AppCompatDelegateImpl$7 extends az
{

	public void onAnimationEnd(View view)
	{
		mActionModeView.setAlpha(1.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field AppCompatDelegateImpl this$0>
	//    2    4:getfield        #22  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
	//    3    7:fconst_1        
	//    4    8:invokevirtual   #28  <Method void ActionBarContextView.setAlpha(float)>
		mFadeAnim.a(((android.support.v4.view.ay) (null)));
	//    5   11:aload_0         
	//    6   12:getfield        #10  <Field AppCompatDelegateImpl this$0>
	//    7   15:getfield        #32  <Field au AppCompatDelegateImpl.mFadeAnim>
	//    8   18:aconst_null     
	//    9   19:invokevirtual   #38  <Method au au.a(android.support.v4.view.ay)>
	//   10   22:pop             
		mFadeAnim = null;
	//   11   23:aload_0         
	//   12   24:getfield        #10  <Field AppCompatDelegateImpl this$0>
	//   13   27:aconst_null     
	//   14   28:putfield        #32  <Field au AppCompatDelegateImpl.mFadeAnim>
	//   15   31:return          
	}

	public void onAnimationStart(View view)
	{
		mActionModeView.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field AppCompatDelegateImpl this$0>
	//    2    4:getfield        #22  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
	//    3    7:iconst_0        
	//    4    8:invokevirtual   #43  <Method void ActionBarContextView.setVisibility(int)>
		mActionModeView.sendAccessibilityEvent(32);
	//    5   11:aload_0         
	//    6   12:getfield        #10  <Field AppCompatDelegateImpl this$0>
	//    7   15:getfield        #22  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
	//    8   18:bipush          32
	//    9   20:invokevirtual   #46  <Method void ActionBarContextView.sendAccessibilityEvent(int)>
		if(mActionModeView.getParent() instanceof View)
	//*  10   23:aload_0         
	//*  11   24:getfield        #10  <Field AppCompatDelegateImpl this$0>
	//*  12   27:getfield        #22  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
	//*  13   30:invokevirtual   #50  <Method android.view.ViewParent ActionBarContextView.getParent()>
	//*  14   33:instanceof      #52  <Class View>
	//*  15   36:ifeq            55
			ac.p((View)mActionModeView.getParent());
	//   16   39:aload_0         
	//   17   40:getfield        #10  <Field AppCompatDelegateImpl this$0>
	//   18   43:getfield        #22  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
	//   19   46:invokevirtual   #50  <Method android.view.ViewParent ActionBarContextView.getParent()>
	//   20   49:checkcast       #52  <Class View>
	//   21   52:invokestatic    #57  <Method void ac.p(View)>
	//   22   55:return          
	}

	final AppCompatDelegateImpl this$0;

	AppCompatDelegateImpl$7()
	{
		this$0 = AppCompatDelegateImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field AppCompatDelegateImpl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void az()>
	//    5    9:return          
	}
}
