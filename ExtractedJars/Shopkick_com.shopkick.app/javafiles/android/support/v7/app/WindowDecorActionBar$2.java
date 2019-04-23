// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v7.widget.ActionBarContainer;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//			WindowDecorActionBar

class WindowDecorActionBar$2 extends ViewPropertyAnimatorListenerAdapter
{

	public void onAnimationEnd(View view)
	{
		view = ((View) (WindowDecorActionBar.this));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field WindowDecorActionBar this$0>
	//    2    4:astore_1        
		view.mCurrentShowAnim = null;
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:putfield        #22  <Field android.support.v7.view.ViewPropertyAnimatorCompatSet WindowDecorActionBar.mCurrentShowAnim>
		((WindowDecorActionBar) (view)).mContainerView.requestLayout();
	//    6   10:aload_1         
	//    7   11:getfield        #26  <Field ActionBarContainer WindowDecorActionBar.mContainerView>
	//    8   14:invokevirtual   #31  <Method void ActionBarContainer.requestLayout()>
	//    9   17:return          
	}

	final WindowDecorActionBar this$0;

	WindowDecorActionBar$2()
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
