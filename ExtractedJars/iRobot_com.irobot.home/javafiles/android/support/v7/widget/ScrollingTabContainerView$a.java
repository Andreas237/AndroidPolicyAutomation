// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

// Referenced classes of package android.support.v7.widget:
//			ScrollingTabContainerView, LinearLayoutCompat

private class ScrollingTabContainerView$a extends BaseAdapter
{

	public int getCount()
	{
		return a.b.getChildCount();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field ScrollingTabContainerView a>
	//    2    4:getfield        #22  <Field LinearLayoutCompat ScrollingTabContainerView.b>
	//    3    7:invokevirtual   #27  <Method int LinearLayoutCompat.getChildCount()>
	//    4   10:ireturn         
	}

	public Object getItem(int i)
	{
		return ((Object) (((ScrollingTabContainerView$c)a.b.getChildAt(i)).b()));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field ScrollingTabContainerView a>
	//    2    4:getfield        #22  <Field LinearLayoutCompat ScrollingTabContainerView.b>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #33  <Method View LinearLayoutCompat.getChildAt(int)>
	//    5   11:checkcast       #35  <Class ScrollingTabContainerView$c>
	//    6   14:invokevirtual   #38  <Method android.support.v7.app.ActionBar$b ScrollingTabContainerView$c.b()>
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
			return ((View) (a.a((android.support.v7.app.ActionBar.b)getItem(i), true)));
	//    2    4:aload_0         
	//    3    5:getfield        #12  <Field ScrollingTabContainerView a>
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokevirtual   #44  <Method Object getItem(int)>
	//    7   13:checkcast       #46  <Class android.support.v7.app.ActionBar$b>
	//    8   16:iconst_1        
	//    9   17:invokevirtual   #49  <Method ScrollingTabContainerView$c ScrollingTabContainerView.a(android.support.v7.app.ActionBar$b, boolean)>
	//   10   20:areturn         
		} else
		{
			((ScrollingTabContainerView$c)view).a((android.support.v7.app.ActionBar.b)getItem(i));
	//   11   21:aload_2         
	//   12   22:checkcast       #35  <Class ScrollingTabContainerView$c>
	//   13   25:aload_0         
	//   14   26:iload_1         
	//   15   27:invokevirtual   #44  <Method Object getItem(int)>
	//   16   30:checkcast       #46  <Class android.support.v7.app.ActionBar$b>
	//   17   33:invokevirtual   #52  <Method void ScrollingTabContainerView$c.a(android.support.v7.app.ActionBar$b)>
			return view;
	//   18   36:aload_2         
	//   19   37:areturn         
		}
	}

	final ScrollingTabContainerView a;

	ScrollingTabContainerView$a(ScrollingTabContainerView scrollingtabcontainerview)
	{
		a = scrollingtabcontainerview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ScrollingTabContainerView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void BaseAdapter()>
	//    5    9:return          
	}
}
