// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class LinearLayoutCompat$LayoutParams extends android.view.ViewGroup.MarginLayoutParams
{

	public int gravity;
	public float weight;

	public LinearLayoutCompat$LayoutParams(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #12  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
		gravity = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #14  <Field int gravity>
		weight = 0.0F;
	//    7   11:aload_0         
	//    8   12:fconst_0        
	//    9   13:putfield        #16  <Field float weight>
	//   10   16:return          
	}

	public LinearLayoutCompat$LayoutParams(int i, int j, float f)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #12  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
		gravity = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #14  <Field int gravity>
		weight = f;
	//    7   11:aload_0         
	//    8   12:fload_3         
	//    9   13:putfield        #16  <Field float weight>
	//   10   16:return          
	}

	public LinearLayoutCompat$LayoutParams(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
		gravity = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #14  <Field int gravity>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.LinearLayoutCompat_Layout)));
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:getstatic       #27  <Field int[] android.support.v7.appcompat.R$styleable.LinearLayoutCompat_Layout>
	//   10   16:invokevirtual   #33  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   11   19:astore_1        
		weight = ((TypedArray) (context)).getFloat(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_Layout_android_layout_weight, 0.0F);
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:getstatic       #36  <Field int android.support.v7.appcompat.R$styleable.LinearLayoutCompat_Layout_android_layout_weight>
	//   15   25:fconst_0        
	//   16   26:invokevirtual   #42  <Method float TypedArray.getFloat(int, float)>
	//   17   29:putfield        #16  <Field float weight>
		gravity = ((TypedArray) (context)).getInt(android.support.v7.appcompat.R.styleable.LinearLayoutCompat_Layout_android_layout_gravity, -1);
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:getstatic       #45  <Field int android.support.v7.appcompat.R$styleable.LinearLayoutCompat_Layout_android_layout_gravity>
	//   21   37:iconst_m1       
	//   22   38:invokevirtual   #49  <Method int TypedArray.getInt(int, int)>
	//   23   41:putfield        #14  <Field int gravity>
		((TypedArray) (context)).recycle();
	//   24   44:aload_1         
	//   25   45:invokevirtual   #53  <Method void TypedArray.recycle()>
	//   26   48:return          
	}

	public LinearLayoutCompat$LayoutParams(LinearLayoutCompat$LayoutParams linearlayoutcompat$layoutparams)
	{
		super(((android.view.ViewGroup.MarginLayoutParams) (linearlayoutcompat$layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #57  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
		gravity = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #14  <Field int gravity>
		weight = linearlayoutcompat$layoutparams.weight;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:getfield        #16  <Field float weight>
	//    9   15:putfield        #16  <Field float weight>
		gravity = linearlayoutcompat$layoutparams.gravity;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:getfield        #14  <Field int gravity>
	//   13   23:putfield        #14  <Field int gravity>
	//   14   26:return          
	}

	public LinearLayoutCompat$LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		super(layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #60  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
		gravity = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #14  <Field int gravity>
	//    6   10:return          
	}

	public LinearLayoutCompat$LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
	{
		super(marginlayoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #57  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
		gravity = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #14  <Field int gravity>
	//    6   10:return          
	}
}
