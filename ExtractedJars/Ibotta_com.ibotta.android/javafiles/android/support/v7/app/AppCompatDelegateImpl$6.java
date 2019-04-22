// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v4.view.*;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImpl

class AppCompatDelegateImpl$6
	implements Runnable
{

	public void run()
	{
		mActionModePopup.showAtLocation(((View) (mActionModeView)), 55, 0, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AppCompatDelegateImpl this$0>
	//    2    4:getfield        #28  <Field PopupWindow AppCompatDelegateImpl.mActionModePopup>
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field AppCompatDelegateImpl this$0>
	//    5   11:getfield        #32  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
	//    6   14:bipush          55
	//    7   16:iconst_0        
	//    8   17:iconst_0        
	//    9   18:invokevirtual   #38  <Method void PopupWindow.showAtLocation(View, int, int, int)>
		endOnGoingFadeAnimation();
	//   10   21:aload_0         
	//   11   22:getfield        #19  <Field AppCompatDelegateImpl this$0>
	//   12   25:invokevirtual   #41  <Method void AppCompatDelegateImpl.endOnGoingFadeAnimation()>
		if(shouldAnimateActionModeView())
	//*  13   28:aload_0         
	//*  14   29:getfield        #19  <Field AppCompatDelegateImpl this$0>
	//*  15   32:invokevirtual   #45  <Method boolean AppCompatDelegateImpl.shouldAnimateActionModeView()>
	//*  16   35:ifeq            89
		{
			mActionModeView.setAlpha(0.0F);
	//   17   38:aload_0         
	//   18   39:getfield        #19  <Field AppCompatDelegateImpl this$0>
	//   19   42:getfield        #32  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
	//   20   45:fconst_0        
	//   21   46:invokevirtual   #51  <Method void ActionBarContextView.setAlpha(float)>
			AppCompatDelegateImpl appcompatdelegateimpl = AppCompatDelegateImpl.this;
	//   22   49:aload_0         
	//   23   50:getfield        #19  <Field AppCompatDelegateImpl this$0>
	//   24   53:astore_1        
			appcompatdelegateimpl.mFadeAnim = ViewCompat.animate(((View) (appcompatdelegateimpl.mActionModeView))).alpha(1.0F);
	//   25   54:aload_1         
	//   26   55:aload_1         
	//   27   56:getfield        #32  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
	//   28   59:invokestatic    #57  <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//   29   62:fconst_1        
	//   30   63:invokevirtual   #63  <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.alpha(float)>
	//   31   66:putfield        #67  <Field ViewPropertyAnimatorCompat AppCompatDelegateImpl.mFadeAnim>
			mFadeAnim.setListener(((android.support.v4.view.ViewPropertyAnimatorListener) (new ViewPropertyAnimatorListenerAdapter() {

				public void onAnimationEnd(View view)
				{
					mActionModeView.setAlpha(1.0F);
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field AppCompatDelegateImpl$6 this$1>
				//    2    4:getfield        #24  <Field AppCompatDelegateImpl AppCompatDelegateImpl$6.this$0>
				//    3    7:getfield        #30  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
				//    4   10:fconst_1        
				//    5   11:invokevirtual   #36  <Method void ActionBarContextView.setAlpha(float)>
					mFadeAnim.setListener(((android.support.v4.view.ViewPropertyAnimatorListener) (null)));
				//    6   14:aload_0         
				//    7   15:getfield        #15  <Field AppCompatDelegateImpl$6 this$1>
				//    8   18:getfield        #24  <Field AppCompatDelegateImpl AppCompatDelegateImpl$6.this$0>
				//    9   21:getfield        #40  <Field ViewPropertyAnimatorCompat AppCompatDelegateImpl.mFadeAnim>
				//   10   24:aconst_null     
				//   11   25:invokevirtual   #46  <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setListener(android.support.v4.view.ViewPropertyAnimatorListener)>
				//   12   28:pop             
					mFadeAnim = null;
				//   13   29:aload_0         
				//   14   30:getfield        #15  <Field AppCompatDelegateImpl$6 this$1>
				//   15   33:getfield        #24  <Field AppCompatDelegateImpl AppCompatDelegateImpl$6.this$0>
				//   16   36:aconst_null     
				//   17   37:putfield        #40  <Field ViewPropertyAnimatorCompat AppCompatDelegateImpl.mFadeAnim>
				//   18   40:return          
				}

				public void onAnimationStart(View view)
				{
					mActionModeView.setVisibility(0);
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field AppCompatDelegateImpl$6 this$1>
				//    2    4:getfield        #24  <Field AppCompatDelegateImpl AppCompatDelegateImpl$6.this$0>
				//    3    7:getfield        #30  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
				//    4   10:iconst_0        
				//    5   11:invokevirtual   #51  <Method void ActionBarContextView.setVisibility(int)>
				//    6   14:return          
				}

				final AppCompatDelegateImpl._cls6 this$1;

			
			{
				this$1 = AppCompatDelegateImpl._cls6.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AppCompatDelegateImpl$6 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void ViewPropertyAnimatorListenerAdapter()>
			//    5    9:return          
			}
			}
)));
	//   32   69:aload_0         
	//   33   70:getfield        #19  <Field AppCompatDelegateImpl this$0>
	//   34   73:getfield        #67  <Field ViewPropertyAnimatorCompat AppCompatDelegateImpl.mFadeAnim>
	//   35   76:new             #13  <Class AppCompatDelegateImpl$6$1>
	//   36   79:dup             
	//   37   80:aload_0         
	//   38   81:invokespecial   #70  <Method void AppCompatDelegateImpl$6$1(AppCompatDelegateImpl$6)>
	//   39   84:invokevirtual   #74  <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setListener(android.support.v4.view.ViewPropertyAnimatorListener)>
	//   40   87:pop             
			return;
	//   41   88:return          
		} else
		{
			mActionModeView.setAlpha(1.0F);
	//   42   89:aload_0         
	//   43   90:getfield        #19  <Field AppCompatDelegateImpl this$0>
	//   44   93:getfield        #32  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
	//   45   96:fconst_1        
	//   46   97:invokevirtual   #51  <Method void ActionBarContextView.setAlpha(float)>
			mActionModeView.setVisibility(0);
	//   47  100:aload_0         
	//   48  101:getfield        #19  <Field AppCompatDelegateImpl this$0>
	//   49  104:getfield        #32  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
	//   50  107:iconst_0        
	//   51  108:invokevirtual   #78  <Method void ActionBarContextView.setVisibility(int)>
			return;
	//   52  111:return          
		}
	}

	final AppCompatDelegateImpl this$0;

	AppCompatDelegateImpl$6()
	{
		this$0 = AppCompatDelegateImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AppCompatDelegateImpl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
	//    5    9:return          
	}
}
