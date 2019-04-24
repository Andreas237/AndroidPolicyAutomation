// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.offlinemap;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ExpandableListView;

public class CityExpandView extends ExpandableListView
{

	public CityExpandView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #9   <Method void CityExpandView(Context, AttributeSet)>
	//    4    6:return          
	}

	public CityExpandView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_m1       
	//    4    4:invokespecial   #13  <Method void ExpandableListView(Context, AttributeSet, int)>
		setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.LinearLayout.LayoutParams(-1, -1))));
	//    5    7:aload_0         
	//    6    8:new             #15  <Class android.widget.LinearLayout$LayoutParams>
	//    7   11:dup             
	//    8   12:iconst_m1       
	//    9   13:iconst_m1       
	//   10   14:invokespecial   #18  <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//   11   17:invokevirtual   #22  <Method void setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   12   20:return          
	}

	protected void onMeasure(int i, int j)
	{
		System.currentTimeMillis();
	//    0    0:invokestatic    #29  <Method long System.currentTimeMillis()>
	//    1    3:pop2            
		super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(0x1fffffff, 0x80000000));
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:ldc1            #30  <Int 0x1fffffff>
	//    5    8:ldc1            #31  <Int 0x80000000>
	//    6   10:invokestatic    #37  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//    7   13:invokespecial   #39  <Method void ExpandableListView.onMeasure(int, int)>
		System.currentTimeMillis();
	//    8   16:invokestatic    #29  <Method long System.currentTimeMillis()>
	//    9   19:pop2            
	//   10   20:return          
	}
}
