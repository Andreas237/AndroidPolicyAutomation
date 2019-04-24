// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;

public class CustomSquaredImageButton extends AppCompatImageButton
{

	public CustomSquaredImageButton(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void AppCompatImageButton(Context)>
	//    3    5:return          
	}

	public CustomSquaredImageButton(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void AppCompatImageButton(Context, AttributeSet)>
	//    4    6:return          
	}

	public CustomSquaredImageButton(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #15  <Method void AppCompatImageButton(Context, AttributeSet, int)>
	//    5    7:return          
	}

	protected void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #19  <Method void AppCompatImageButton.onMeasure(int, int)>
		i = getMeasuredWidth();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #23  <Method int getMeasuredWidth()>
	//    6   10:istore_1        
		setMeasuredDimension(i, i);
	//    7   11:aload_0         
	//    8   12:iload_1         
	//    9   13:iload_1         
	//   10   14:invokevirtual   #26  <Method void setMeasuredDimension(int, int)>
	//   11   17:return          
	}
}
