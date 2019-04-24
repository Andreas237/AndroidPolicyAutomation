// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.widget:
//			SlidingPaneLayout

class SlidingPaneLayout$DisableLayerRunnable
	implements Runnable
{

	public void run()
	{
		if(mChildView.getParent() == SlidingPaneLayout.this)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field View mChildView>
	//*   2    4:invokevirtual   #30  <Method android.view.ViewParent View.getParent()>
	//*   3    7:aload_0         
	//*   4    8:getfield        #17  <Field SlidingPaneLayout this$0>
	//*   5   11:if_acmpne       34
		{
			mChildView.setLayerType(0, ((android.graphics.Paint) (null)));
	//    6   14:aload_0         
	//    7   15:getfield        #22  <Field View mChildView>
	//    8   18:iconst_0        
	//    9   19:aconst_null     
	//   10   20:invokevirtual   #34  <Method void View.setLayerType(int, android.graphics.Paint)>
			invalidateChildRegion(mChildView);
	//   11   23:aload_0         
	//   12   24:getfield        #17  <Field SlidingPaneLayout this$0>
	//   13   27:aload_0         
	//   14   28:getfield        #22  <Field View mChildView>
	//   15   31:invokevirtual   #38  <Method void SlidingPaneLayout.invalidateChildRegion(View)>
		}
		mPostedRunnables.remove(((Object) (this)));
	//   16   34:aload_0         
	//   17   35:getfield        #17  <Field SlidingPaneLayout this$0>
	//   18   38:getfield        #42  <Field ArrayList SlidingPaneLayout.mPostedRunnables>
	//   19   41:aload_0         
	//   20   42:invokevirtual   #48  <Method boolean ArrayList.remove(Object)>
	//   21   45:pop             
	//   22   46:return          
	}

	final View mChildView;
	final SlidingPaneLayout this$0;

	SlidingPaneLayout$DisableLayerRunnable(View view)
	{
		this$0 = SlidingPaneLayout.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field SlidingPaneLayout this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
		mChildView = view;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field View mChildView>
	//    8   14:return          
	}
}
