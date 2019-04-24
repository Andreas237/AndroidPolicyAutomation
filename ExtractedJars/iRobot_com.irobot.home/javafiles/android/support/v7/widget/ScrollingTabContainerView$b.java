// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ScrollingTabContainerView, LinearLayoutCompat

private class ScrollingTabContainerView$b
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		((ScrollingTabContainerView$c)view).b().d();
	//    0    0:aload_1         
	//    1    1:checkcast       #23  <Class ScrollingTabContainerView$c>
	//    2    4:invokevirtual   #26  <Method android.support.v7.app.ActionBar$b ScrollingTabContainerView$c.b()>
	//    3    7:invokevirtual   #31  <Method void android.support.v7.app.ActionBar$b.d()>
		int j = a.b.getChildCount();
	//    4   10:aload_0         
	//    5   11:getfield        #15  <Field ScrollingTabContainerView a>
	//    6   14:getfield        #34  <Field LinearLayoutCompat ScrollingTabContainerView.b>
	//    7   17:invokevirtual   #40  <Method int LinearLayoutCompat.getChildCount()>
	//    8   20:istore_3        
		for(int i = 0; i < j; i++)
	//*   9   21:iconst_0        
	//*  10   22:istore_2        
	//*  11   23:iload_2         
	//*  12   24:iload_3         
	//*  13   25:icmpge          70
		{
			View view1 = a.b.getChildAt(i);
	//   14   28:aload_0         
	//   15   29:getfield        #15  <Field ScrollingTabContainerView a>
	//   16   32:getfield        #34  <Field LinearLayoutCompat ScrollingTabContainerView.b>
	//   17   35:iload_2         
	//   18   36:invokevirtual   #44  <Method View LinearLayoutCompat.getChildAt(int)>
	//   19   39:astore          5
			boolean flag;
			if(view1 == view)
	//*  20   41:aload           5
	//*  21   43:aload_1         
	//*  22   44:if_acmpne       53
				flag = true;
	//   23   47:iconst_1        
	//   24   48:istore          4
			else
	//*  25   50:goto            56
				flag = false;
	//   26   53:iconst_0        
	//   27   54:istore          4
			view1.setSelected(flag);
	//   28   56:aload           5
	//   29   58:iload           4
	//   30   60:invokevirtual   #50  <Method void View.setSelected(boolean)>
		}

	//   31   63:iload_2         
	//   32   64:iconst_1        
	//   33   65:iadd            
	//   34   66:istore_2        
	//*  35   67:goto            23
	//   36   70:return          
	}

	final ScrollingTabContainerView a;

	ScrollingTabContainerView$b(ScrollingTabContainerView scrollingtabcontainerview)
	{
		a = scrollingtabcontainerview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ScrollingTabContainerView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
