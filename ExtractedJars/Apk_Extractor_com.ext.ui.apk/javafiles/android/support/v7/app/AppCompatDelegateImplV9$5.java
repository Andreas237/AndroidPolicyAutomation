// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v4.view.*;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV9

class AppCompatDelegateImplV9$5
	implements Runnable
{

	public void run()
	{
		mActionModePopup.showAtLocation(((View) (mActionModeView)), 55, 0, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
	//    2    4:getfield        #28  <Field PopupWindow AppCompatDelegateImplV9.mActionModePopup>
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
	//    5   11:getfield        #32  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
	//    6   14:bipush          55
	//    7   16:iconst_0        
	//    8   17:iconst_0        
	//    9   18:invokevirtual   #38  <Method void PopupWindow.showAtLocation(View, int, int, int)>
		endOnGoingFadeAnimation();
	//   10   21:aload_0         
	//   11   22:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
	//   12   25:invokevirtual   #41  <Method void AppCompatDelegateImplV9.endOnGoingFadeAnimation()>
		if(shouldAnimateActionModeView())
	//*  13   28:aload_0         
	//*  14   29:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
	//*  15   32:invokevirtual   #45  <Method boolean AppCompatDelegateImplV9.shouldAnimateActionModeView()>
	//*  16   35:ifeq            90
		{
			mActionModeView.setAlpha(0.0F);
	//   17   38:aload_0         
	//   18   39:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
	//   19   42:getfield        #32  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
	//   20   45:fconst_0        
	//   21   46:invokevirtual   #51  <Method void ActionBarContextView.setAlpha(float)>
			mFadeAnim = ViewCompat.animate(((View) (mActionModeView))).alpha(1.0F);
	//   22   49:aload_0         
	//   23   50:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
	//   24   53:aload_0         
	//   25   54:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
	//   26   57:getfield        #32  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
	//   27   60:invokestatic    #57  <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//   28   63:fconst_1        
	//   29   64:invokevirtual   #63  <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.alpha(float)>
	//   30   67:putfield        #67  <Field ViewPropertyAnimatorCompat AppCompatDelegateImplV9.mFadeAnim>
			mFadeAnim.setListener(((android.support.v4.view.ViewPropertyAnimatorListener) (new ViewPropertyAnimatorListenerAdapter() {

				public void onAnimationEnd(View view)
				{
					mActionModeView.setAlpha(1.0F);
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field AppCompatDelegateImplV9$5 this$1>
				//    2    4:getfield        #24  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$5.this$0>
				//    3    7:getfield        #30  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
				//    4   10:fconst_1        
				//    5   11:invokevirtual   #36  <Method void ActionBarContextView.setAlpha(float)>
					mFadeAnim.setListener(((android.support.v4.view.ViewPropertyAnimatorListener) (null)));
				//    6   14:aload_0         
				//    7   15:getfield        #15  <Field AppCompatDelegateImplV9$5 this$1>
				//    8   18:getfield        #24  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$5.this$0>
				//    9   21:getfield        #40  <Field ViewPropertyAnimatorCompat AppCompatDelegateImplV9.mFadeAnim>
				//   10   24:aconst_null     
				//   11   25:invokevirtual   #46  <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setListener(android.support.v4.view.ViewPropertyAnimatorListener)>
				//   12   28:pop             
					mFadeAnim = null;
				//   13   29:aload_0         
				//   14   30:getfield        #15  <Field AppCompatDelegateImplV9$5 this$1>
				//   15   33:getfield        #24  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$5.this$0>
				//   16   36:aconst_null     
				//   17   37:putfield        #40  <Field ViewPropertyAnimatorCompat AppCompatDelegateImplV9.mFadeAnim>
				//   18   40:return          
				}

				public void onAnimationStart(View view)
				{
					mActionModeView.setVisibility(0);
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field AppCompatDelegateImplV9$5 this$1>
				//    2    4:getfield        #24  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$5.this$0>
				//    3    7:getfield        #30  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
				//    4   10:iconst_0        
				//    5   11:invokevirtual   #51  <Method void ActionBarContextView.setVisibility(int)>
				//    6   14:return          
				}

				final AppCompatDelegateImplV9._cls5 this$1;

			
			{
				this$1 = AppCompatDelegateImplV9._cls5.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AppCompatDelegateImplV9$5 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void ViewPropertyAnimatorListenerAdapter()>
			//    5    9:return          
			}
			}
)));
	//   31   70:aload_0         
	//   32   71:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
	//   33   74:getfield        #67  <Field ViewPropertyAnimatorCompat AppCompatDelegateImplV9.mFadeAnim>
	//   34   77:new             #13  <Class AppCompatDelegateImplV9$5$1>
	//   35   80:dup             
	//   36   81:aload_0         
	//   37   82:invokespecial   #70  <Method void AppCompatDelegateImplV9$5$1(AppCompatDelegateImplV9$5)>
	//   38   85:invokevirtual   #74  <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setListener(android.support.v4.view.ViewPropertyAnimatorListener)>
	//   39   88:pop             
			return;
	//   40   89:return          
		} else
		{
			mActionModeView.setAlpha(1.0F);
	//   41   90:aload_0         
	//   42   91:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
	//   43   94:getfield        #32  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
	//   44   97:fconst_1        
	//   45   98:invokevirtual   #51  <Method void ActionBarContextView.setAlpha(float)>
			mActionModeView.setVisibility(0);
	//   46  101:aload_0         
	//   47  102:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
	//   48  105:getfield        #32  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
	//   49  108:iconst_0        
	//   50  109:invokevirtual   #78  <Method void ActionBarContextView.setVisibility(int)>
			return;
	//   51  112:return          
		}
	}

	final AppCompatDelegateImplV9 this$0;

	AppCompatDelegateImplV9$5()
	{
		this$0 = AppCompatDelegateImplV9.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AppCompatDelegateImplV9 this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
	//    5    9:return          
	}
}
