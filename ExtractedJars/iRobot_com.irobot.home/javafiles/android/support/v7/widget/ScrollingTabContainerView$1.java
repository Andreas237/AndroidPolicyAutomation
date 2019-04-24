// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ScrollingTabContainerView

class ScrollingTabContainerView$1
	implements Runnable
{

	public void run()
	{
		int i = a.getLeft();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field View a>
	//    2    4:invokevirtual   #31  <Method int View.getLeft()>
	//    3    7:istore_1        
		int j = (b.getWidth() - a.getWidth()) / 2;
	//    4    8:aload_0         
	//    5    9:getfield        #18  <Field ScrollingTabContainerView b>
	//    6   12:invokevirtual   #34  <Method int ScrollingTabContainerView.getWidth()>
	//    7   15:aload_0         
	//    8   16:getfield        #20  <Field View a>
	//    9   19:invokevirtual   #35  <Method int View.getWidth()>
	//   10   22:isub            
	//   11   23:iconst_2        
	//   12   24:idiv            
	//   13   25:istore_2        
		b.smoothScrollTo(i - j, 0);
	//   14   26:aload_0         
	//   15   27:getfield        #18  <Field ScrollingTabContainerView b>
	//   16   30:iload_1         
	//   17   31:iload_2         
	//   18   32:isub            
	//   19   33:iconst_0        
	//   20   34:invokevirtual   #39  <Method void ScrollingTabContainerView.smoothScrollTo(int, int)>
		b.a = null;
	//   21   37:aload_0         
	//   22   38:getfield        #18  <Field ScrollingTabContainerView b>
	//   23   41:aconst_null     
	//   24   42:putfield        #42  <Field Runnable ScrollingTabContainerView.a>
	//   25   45:return          
	}

	final View a;
	final ScrollingTabContainerView b;

	ScrollingTabContainerView$1(ScrollingTabContainerView scrollingtabcontainerview, View view)
	{
		b = scrollingtabcontainerview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ScrollingTabContainerView b>
		a = view;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field View a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
