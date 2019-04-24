// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.View;
import android.view.ViewGroup;

public class NestedScrollingParentHelper
{

	public NestedScrollingParentHelper(ViewGroup viewgroup)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mViewGroup = viewgroup;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field ViewGroup mViewGroup>
	//    5    9:return          
	}

	public int getNestedScrollAxes()
	{
		return mNestedScrollAxes;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int mNestedScrollAxes>
	//    2    4:ireturn         
	}

	public void onNestedScrollAccepted(View view, View view1, int i)
	{
		onNestedScrollAccepted(view, view1, i, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #27  <Method void onNestedScrollAccepted(View, View, int, int)>
	//    6    8:return          
	}

	public void onNestedScrollAccepted(View view, View view1, int i, int j)
	{
		mNestedScrollAxes = i;
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:putfield        #22  <Field int mNestedScrollAxes>
	//    3    5:return          
	}

	public void onStopNestedScroll(View view)
	{
		onStopNestedScroll(view, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #32  <Method void onStopNestedScroll(View, int)>
	//    4    6:return          
	}

	public void onStopNestedScroll(View view, int i)
	{
		mNestedScrollAxes = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #22  <Field int mNestedScrollAxes>
	//    3    5:return          
	}

	private int mNestedScrollAxes;
	private final ViewGroup mViewGroup;
}
