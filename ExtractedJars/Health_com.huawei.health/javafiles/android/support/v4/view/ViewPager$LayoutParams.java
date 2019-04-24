// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

// Referenced classes of package android.support.v4.view:
//			ViewPager

public static class ViewPager$LayoutParams extends android.view.ViewGroup$LayoutParams
{

	int childIndex;
	public int gravity;
	public boolean isDecor;
	boolean needsMeasure;
	int position;
	float widthFactor;

	public ViewPager$LayoutParams()
	{
		super(-1, -1);
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:iconst_m1       
	//    3    3:invokespecial   #21  <Method void android.view.ViewGroup$LayoutParams(int, int)>
		widthFactor = 0.0F;
	//    4    6:aload_0         
	//    5    7:fconst_0        
	//    6    8:putfield        #23  <Field float widthFactor>
	//    7   11:return          
	}

	public ViewPager$LayoutParams(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #27  <Method void android.view.ViewGroup$LayoutParams(Context, AttributeSet)>
		widthFactor = 0.0F;
	//    4    6:aload_0         
	//    5    7:fconst_0        
	//    6    8:putfield        #23  <Field float widthFactor>
		context = ((Context) (context.obtainStyledAttributes(attributeset, ViewPager.LAYOUT_ATTRS)));
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:getstatic       #31  <Field int[] ViewPager.LAYOUT_ATTRS>
	//   10   16:invokevirtual   #37  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   11   19:astore_1        
		gravity = ((TypedArray) (context)).getInteger(0, 48);
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:iconst_0        
	//   15   23:bipush          48
	//   16   25:invokevirtual   #43  <Method int TypedArray.getInteger(int, int)>
	//   17   28:putfield        #45  <Field int gravity>
		((TypedArray) (context)).recycle();
	//   18   31:aload_1         
	//   19   32:invokevirtual   #48  <Method void TypedArray.recycle()>
	//   20   35:return          
	}
}
