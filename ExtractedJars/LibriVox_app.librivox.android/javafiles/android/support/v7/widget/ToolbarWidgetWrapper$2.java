// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.view.az;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ToolbarWidgetWrapper, Toolbar

class ToolbarWidgetWrapper$2 extends az
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
		if(!mCanceled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean mCanceled>
	//*   2    4:ifne            21
			mToolbar.setVisibility(val$visibility);
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field ToolbarWidgetWrapper this$0>
	//    5   11:getfield        #31  <Field Toolbar ToolbarWidgetWrapper.mToolbar>
	//    6   14:aload_0         
	//    7   15:getfield        #16  <Field int val$visibility>
	//    8   18:invokevirtual   #37  <Method void Toolbar.setVisibility(int)>
	//    9   21:return          
	}

	public void onAnimationStart(View view)
	{
		mToolbar.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ToolbarWidgetWrapper this$0>
	//    2    4:getfield        #31  <Field Toolbar ToolbarWidgetWrapper.mToolbar>
	//    3    7:iconst_0        
	//    4    8:invokevirtual   #37  <Method void Toolbar.setVisibility(int)>
	//    5   11:return          
	}

	private boolean mCanceled;
	final ToolbarWidgetWrapper this$0;
	final int val$visibility;

	ToolbarWidgetWrapper$2()
	{
		this$0 = final_toolbarwidgetwrapper;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ToolbarWidgetWrapper this$0>
		val$visibility = I.this;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #16  <Field int val$visibility>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void az()>
		mCanceled = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #21  <Field boolean mCanceled>
	//   11   19:return          
	}
}
