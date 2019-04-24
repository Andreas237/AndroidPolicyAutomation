// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.offlinemap;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ExpandableListView;

public class DownLoadExpandListView extends ExpandableListView
{

	public DownLoadExpandListView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void ExpandableListView(Context)>
	//    3    5:return          
	}

	public DownLoadExpandListView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void ExpandableListView(Context, AttributeSet)>
		setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.LinearLayout.LayoutParams(-1, -1))));
	//    4    6:aload_0         
	//    5    7:new             #14  <Class android.widget.LinearLayout$LayoutParams>
	//    6   10:dup             
	//    7   11:iconst_m1       
	//    8   12:iconst_m1       
	//    9   13:invokespecial   #17  <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//   10   16:invokevirtual   #21  <Method void setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   11   19:return          
	}

	protected void onMeasure(int i, int j)
	{
		super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(0x1fffffff, 0x80000000));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:ldc1            #23  <Int 0x1fffffff>
	//    3    4:ldc1            #24  <Int 0x80000000>
	//    4    6:invokestatic    #30  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//    5    9:invokespecial   #32  <Method void ExpandableListView.onMeasure(int, int)>
	//    6   12:return          
	}
}
