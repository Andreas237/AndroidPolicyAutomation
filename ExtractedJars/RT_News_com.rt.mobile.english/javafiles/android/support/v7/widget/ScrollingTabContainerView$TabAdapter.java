// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

// Referenced classes of package android.support.v7.widget:
//			ScrollingTabContainerView, LinearLayoutCompat

private class ScrollingTabContainerView$TabAdapter extends BaseAdapter
{

	public int getCount()
	{
		return mTabLayout.getChildCount();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field ScrollingTabContainerView this$0>
	//    2    4:getfield        #23  <Field LinearLayoutCompat ScrollingTabContainerView.mTabLayout>
	//    3    7:invokevirtual   #28  <Method int LinearLayoutCompat.getChildCount()>
	//    4   10:ireturn         
	}

	public Object getItem(int i)
	{
		return ((Object) (((ScrollingTabContainerView.TabView)mTabLayout.getChildAt(i)).getTab()));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field ScrollingTabContainerView this$0>
	//    2    4:getfield        #23  <Field LinearLayoutCompat ScrollingTabContainerView.mTabLayout>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #34  <Method View LinearLayoutCompat.getChildAt(int)>
	//    5   11:checkcast       #36  <Class ScrollingTabContainerView$TabView>
	//    6   14:invokevirtual   #40  <Method android.support.v7.app.ActionBar$Tab ScrollingTabContainerView$TabView.getTab()>
	//    7   17:areturn         
	}

	public long getItemId(int i)
	{
		return (long)i;
	//    0    0:iload_1         
	//    1    1:i2l             
	//    2    2:lreturn         
	}

	public View getView(int i, View view, ViewGroup viewgroup)
	{
		if(view == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       21
		{
			return ((View) (createTabView((android.support.v7.app.ActionBar.Tab)getItem(i), true)));
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field ScrollingTabContainerView this$0>
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokevirtual   #46  <Method Object getItem(int)>
	//    7   13:checkcast       #48  <Class android.support.v7.app.ActionBar$Tab>
	//    8   16:iconst_1        
	//    9   17:invokevirtual   #52  <Method ScrollingTabContainerView$TabView ScrollingTabContainerView.createTabView(android.support.v7.app.ActionBar$Tab, boolean)>
	//   10   20:areturn         
		} else
		{
			((ScrollingTabContainerView.TabView)view).bindTab((android.support.v7.app.ActionBar.Tab)getItem(i));
	//   11   21:aload_2         
	//   12   22:checkcast       #36  <Class ScrollingTabContainerView$TabView>
	//   13   25:aload_0         
	//   14   26:iload_1         
	//   15   27:invokevirtual   #46  <Method Object getItem(int)>
	//   16   30:checkcast       #48  <Class android.support.v7.app.ActionBar$Tab>
	//   17   33:invokevirtual   #56  <Method void ScrollingTabContainerView$TabView.bindTab(android.support.v7.app.ActionBar$Tab)>
			return view;
	//   18   36:aload_2         
	//   19   37:areturn         
		}
	}

	final ScrollingTabContainerView this$0;

	ScrollingTabContainerView$TabAdapter()
	{
		this$0 = ScrollingTabContainerView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field ScrollingTabContainerView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void BaseAdapter()>
	//    5    9:return          
	}
}
