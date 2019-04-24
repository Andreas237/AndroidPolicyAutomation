// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v7.widget.ActionBarContainer;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//			WindowDecorActionBar

class WindowDecorActionBar$1 extends ViewPropertyAnimatorListenerAdapter
{

	public void onAnimationEnd(View view)
	{
		if(mContentAnimations && mContentView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field WindowDecorActionBar this$0>
	//*   2    4:getfield        #22  <Field boolean WindowDecorActionBar.mContentAnimations>
	//*   3    7:ifeq            42
	//*   4   10:aload_0         
	//*   5   11:getfield        #12  <Field WindowDecorActionBar this$0>
	//*   6   14:getfield        #26  <Field View WindowDecorActionBar.mContentView>
	//*   7   17:ifnull          42
		{
			mContentView.setTranslationY(0.0F);
	//    8   20:aload_0         
	//    9   21:getfield        #12  <Field WindowDecorActionBar this$0>
	//   10   24:getfield        #26  <Field View WindowDecorActionBar.mContentView>
	//   11   27:fconst_0        
	//   12   28:invokevirtual   #32  <Method void View.setTranslationY(float)>
			mContainerView.setTranslationY(0.0F);
	//   13   31:aload_0         
	//   14   32:getfield        #12  <Field WindowDecorActionBar this$0>
	//   15   35:getfield        #36  <Field ActionBarContainer WindowDecorActionBar.mContainerView>
	//   16   38:fconst_0        
	//   17   39:invokevirtual   #39  <Method void ActionBarContainer.setTranslationY(float)>
		}
		mContainerView.setVisibility(8);
	//   18   42:aload_0         
	//   19   43:getfield        #12  <Field WindowDecorActionBar this$0>
	//   20   46:getfield        #36  <Field ActionBarContainer WindowDecorActionBar.mContainerView>
	//   21   49:bipush          8
	//   22   51:invokevirtual   #43  <Method void ActionBarContainer.setVisibility(int)>
		mContainerView.setTransitioning(false);
	//   23   54:aload_0         
	//   24   55:getfield        #12  <Field WindowDecorActionBar this$0>
	//   25   58:getfield        #36  <Field ActionBarContainer WindowDecorActionBar.mContainerView>
	//   26   61:iconst_0        
	//   27   62:invokevirtual   #47  <Method void ActionBarContainer.setTransitioning(boolean)>
		mCurrentShowAnim = null;
	//   28   65:aload_0         
	//   29   66:getfield        #12  <Field WindowDecorActionBar this$0>
	//   30   69:aconst_null     
	//   31   70:putfield        #51  <Field android.support.v7.view.ViewPropertyAnimatorCompatSet WindowDecorActionBar.mCurrentShowAnim>
		completeDeferredDestroyActionMode();
	//   32   73:aload_0         
	//   33   74:getfield        #12  <Field WindowDecorActionBar this$0>
	//   34   77:invokevirtual   #54  <Method void WindowDecorActionBar.completeDeferredDestroyActionMode()>
		if(mOverlayLayout != null)
	//*  35   80:aload_0         
	//*  36   81:getfield        #12  <Field WindowDecorActionBar this$0>
	//*  37   84:getfield        #58  <Field android.support.v7.widget.ActionBarOverlayLayout WindowDecorActionBar.mOverlayLayout>
	//*  38   87:ifnull          100
			ViewCompat.requestApplyInsets(((View) (mOverlayLayout)));
	//   39   90:aload_0         
	//   40   91:getfield        #12  <Field WindowDecorActionBar this$0>
	//   41   94:getfield        #58  <Field android.support.v7.widget.ActionBarOverlayLayout WindowDecorActionBar.mOverlayLayout>
	//   42   97:invokestatic    #63  <Method void ViewCompat.requestApplyInsets(View)>
	//   43  100:return          
	}

	final WindowDecorActionBar this$0;

	WindowDecorActionBar$1()
	{
		this$0 = WindowDecorActionBar.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field WindowDecorActionBar this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void ViewPropertyAnimatorListenerAdapter()>
	//    5    9:return          
	}
}
