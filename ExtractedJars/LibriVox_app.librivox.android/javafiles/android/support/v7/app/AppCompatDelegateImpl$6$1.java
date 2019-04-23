// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v4.view.au;
import android.support.v4.view.az;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImpl

class AppCompatDelegateImpl$6$1 extends az
{

	public void onAnimationEnd(View view)
	{
		mActionModeView.setAlpha(1.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field AppCompatDelegateImpl$6 this$1>
	//    2    4:getfield        #22  <Field AppCompatDelegateImpl AppCompatDelegateImpl$6.this$0>
	//    3    7:getfield        #28  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
	//    4   10:fconst_1        
	//    5   11:invokevirtual   #34  <Method void ActionBarContextView.setAlpha(float)>
		mFadeAnim.a(((android.support.v4.view.ay) (null)));
	//    6   14:aload_0         
	//    7   15:getfield        #10  <Field AppCompatDelegateImpl$6 this$1>
	//    8   18:getfield        #22  <Field AppCompatDelegateImpl AppCompatDelegateImpl$6.this$0>
	//    9   21:getfield        #38  <Field au AppCompatDelegateImpl.mFadeAnim>
	//   10   24:aconst_null     
	//   11   25:invokevirtual   #44  <Method au au.a(android.support.v4.view.ay)>
	//   12   28:pop             
		mFadeAnim = null;
	//   13   29:aload_0         
	//   14   30:getfield        #10  <Field AppCompatDelegateImpl$6 this$1>
	//   15   33:getfield        #22  <Field AppCompatDelegateImpl AppCompatDelegateImpl$6.this$0>
	//   16   36:aconst_null     
	//   17   37:putfield        #38  <Field au AppCompatDelegateImpl.mFadeAnim>
	//   18   40:return          
	}

	public void onAnimationStart(View view)
	{
		mActionModeView.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field AppCompatDelegateImpl$6 this$1>
	//    2    4:getfield        #22  <Field AppCompatDelegateImpl AppCompatDelegateImpl$6.this$0>
	//    3    7:getfield        #28  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
	//    4   10:iconst_0        
	//    5   11:invokevirtual   #49  <Method void ActionBarContextView.setVisibility(int)>
	//    6   14:return          
	}

	final AppCompatDelegateImpl._cls6 this$1;

	AppCompatDelegateImpl$6$1()
	{
		this$1 = AppCompatDelegateImpl._cls6.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field AppCompatDelegateImpl$6 this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void az()>
	//    5    9:return          
	}
}
