// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.widget:
//			SlidingPaneLayout

private class SlidingPaneLayout$b
	implements Runnable
{

	public void run()
	{
		if(a.getParent() == b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field View a>
	//*   2    4:invokevirtual   #29  <Method android.view.ViewParent View.getParent()>
	//*   3    7:aload_0         
	//*   4    8:getfield        #16  <Field SlidingPaneLayout b>
	//*   5   11:if_acmpne       34
		{
			a.setLayerType(0, ((android.graphics.Paint) (null)));
	//    6   14:aload_0         
	//    7   15:getfield        #21  <Field View a>
	//    8   18:iconst_0        
	//    9   19:aconst_null     
	//   10   20:invokevirtual   #33  <Method void View.setLayerType(int, android.graphics.Paint)>
			b.e(a);
	//   11   23:aload_0         
	//   12   24:getfield        #16  <Field SlidingPaneLayout b>
	//   13   27:aload_0         
	//   14   28:getfield        #21  <Field View a>
	//   15   31:invokevirtual   #37  <Method void SlidingPaneLayout.e(View)>
		}
		b.g.remove(((Object) (this)));
	//   16   34:aload_0         
	//   17   35:getfield        #16  <Field SlidingPaneLayout b>
	//   18   38:getfield        #41  <Field ArrayList SlidingPaneLayout.g>
	//   19   41:aload_0         
	//   20   42:invokevirtual   #47  <Method boolean ArrayList.remove(Object)>
	//   21   45:pop             
	//   22   46:return          
	}

	final View a;
	final SlidingPaneLayout b;

	SlidingPaneLayout$b(SlidingPaneLayout slidingpanelayout, View view)
	{
		b = slidingpanelayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field SlidingPaneLayout b>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
		a = view;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field View a>
	//    8   14:return          
	}
}
