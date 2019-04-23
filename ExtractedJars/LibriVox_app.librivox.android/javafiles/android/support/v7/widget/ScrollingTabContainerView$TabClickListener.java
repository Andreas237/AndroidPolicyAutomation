// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ScrollingTabContainerView, LinearLayoutCompat

class ScrollingTabContainerView$TabClickListener
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		((ScrollingTabContainerView.TabView)view).getTab().select();
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class ScrollingTabContainerView$TabView>
	//    2    4:invokevirtual   #24  <Method android.support.v7.app.ActionBar$Tab ScrollingTabContainerView$TabView.getTab()>
	//    3    7:invokevirtual   #29  <Method void android.support.v7.app.ActionBar$Tab.select()>
		int j = mTabLayout.getChildCount();
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field ScrollingTabContainerView this$0>
	//    6   14:getfield        #35  <Field LinearLayoutCompat ScrollingTabContainerView.mTabLayout>
	//    7   17:invokevirtual   #41  <Method int LinearLayoutCompat.getChildCount()>
	//    8   20:istore_3        
		for(int i = 0; i < j; i++)
	//*   9   21:iconst_0        
	//*  10   22:istore_2        
	//*  11   23:iload_2         
	//*  12   24:iload_3         
	//*  13   25:icmpge          70
		{
			View view1 = mTabLayout.getChildAt(i);
	//   14   28:aload_0         
	//   15   29:getfield        #12  <Field ScrollingTabContainerView this$0>
	//   16   32:getfield        #35  <Field LinearLayoutCompat ScrollingTabContainerView.mTabLayout>
	//   17   35:iload_2         
	//   18   36:invokevirtual   #45  <Method View LinearLayoutCompat.getChildAt(int)>
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
	//   30   60:invokevirtual   #51  <Method void View.setSelected(boolean)>
		}

	//   31   63:iload_2         
	//   32   64:iconst_1        
	//   33   65:iadd            
	//   34   66:istore_2        
	//*  35   67:goto            23
	//   36   70:return          
	}

	final ScrollingTabContainerView this$0;

	ScrollingTabContainerView$TabClickListener()
	{
		this$0 = ScrollingTabContainerView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ScrollingTabContainerView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
