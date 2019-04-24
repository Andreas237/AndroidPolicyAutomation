// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.widget:
//			LinearLayoutCompat

public static class LinearLayoutCompat$LayoutParams extends android.view.ViewGroup.MarginLayoutParams
{

	public float g;
	public int h;

	public LinearLayoutCompat$LayoutParams(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #15  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
		h = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #17  <Field int h>
		g = 0.0F;
	//    7   11:aload_0         
	//    8   12:fconst_0        
	//    9   13:putfield        #19  <Field float g>
	//   10   16:return          
	}

	public LinearLayoutCompat$LayoutParams(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #23  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
		h = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #17  <Field int h>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.a.a.j.LinearLayoutCompat_Layout)));
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:getstatic       #29  <Field int[] android.support.v7.a.a$j.LinearLayoutCompat_Layout>
	//   10   16:invokevirtual   #35  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   11   19:astore_1        
		g = ((TypedArray) (context)).getFloat(android.support.v7.a.a.j.LinearLayoutCompat_Layout_android_layout_weight, 0.0F);
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:getstatic       #38  <Field int android.support.v7.a.a$j.LinearLayoutCompat_Layout_android_layout_weight>
	//   15   25:fconst_0        
	//   16   26:invokevirtual   #44  <Method float TypedArray.getFloat(int, float)>
	//   17   29:putfield        #19  <Field float g>
		h = ((TypedArray) (context)).getInt(android.support.v7.a.a.j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:getstatic       #47  <Field int android.support.v7.a.a$j.LinearLayoutCompat_Layout_android_layout_gravity>
	//   21   37:iconst_m1       
	//   22   38:invokevirtual   #51  <Method int TypedArray.getInt(int, int)>
	//   23   41:putfield        #17  <Field int h>
		((TypedArray) (context)).recycle();
	//   24   44:aload_1         
	//   25   45:invokevirtual   #55  <Method void TypedArray.recycle()>
	//   26   48:return          
	}

	public LinearLayoutCompat$LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		super(layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #58  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
		h = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #17  <Field int h>
	//    6   10:return          
	}
}
