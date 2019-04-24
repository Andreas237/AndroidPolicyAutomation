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
	//    1    1:invokespecial   #13  <Method void Object()>
		mViewGroup = viewgroup;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field ViewGroup mViewGroup>
	//    5    9:return          
	}

	public int getNestedScrollAxes()
	{
		return mNestedScrollAxes;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int mNestedScrollAxes>
	//    2    4:ireturn         
	}

	public void onNestedScrollAccepted(View view, View view1, int i)
	{
		mNestedScrollAxes = i;
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:putfield        #20  <Field int mNestedScrollAxes>
	//    3    5:return          
	}

	public void onStopNestedScroll(View view)
	{
		mNestedScrollAxes = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #20  <Field int mNestedScrollAxes>
	//    3    5:return          
	}

	private int mNestedScrollAxes;
	private final ViewGroup mViewGroup;
}
