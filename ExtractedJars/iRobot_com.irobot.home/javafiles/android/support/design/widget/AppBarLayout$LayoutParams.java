// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.design.widget:
//			AppBarLayout

public static class AppBarLayout$LayoutParams extends android.widget.LinearLayout$LayoutParams
{

	public int a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int a>
	//    2    4:ireturn         
	}

	public Interpolator b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Interpolator b>
	//    2    4:areturn         
	}

	boolean c()
	{
		return (a & 1) == 1 && (a & 0xa) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int a>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:iconst_1        
	//    5    7:icmpne          22
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field int a>
	//    8   14:bipush          10
	//    9   16:iand            
	//   10   17:ifeq            22
	//   11   20:iconst_1        
	//   12   21:ireturn         
	//   13   22:iconst_0        
	//   14   23:ireturn         
	}

	int a;
	Interpolator b;

	public AppBarLayout$LayoutParams(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #15  <Method void android.widget.LinearLayout$LayoutParams(int, int)>
		a = 1;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #17  <Field int a>
	//    7   11:return          
	}

	public AppBarLayout$LayoutParams(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void android.widget.LinearLayout$LayoutParams(Context, AttributeSet)>
		a = 1;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #17  <Field int a>
		attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, android.support.design.a.k.AppBarLayout_Layout)));
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:getstatic       #27  <Field int[] android.support.design.a$k.AppBarLayout_Layout>
	//   10   16:invokevirtual   #33  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   11   19:astore_2        
		a = ((TypedArray) (attributeset)).getInt(android.support.design.a.k.AppBarLayout_Layout_layout_scrollFlags, 0);
	//   12   20:aload_0         
	//   13   21:aload_2         
	//   14   22:getstatic       #36  <Field int android.support.design.a$k.AppBarLayout_Layout_layout_scrollFlags>
	//   15   25:iconst_0        
	//   16   26:invokevirtual   #42  <Method int TypedArray.getInt(int, int)>
	//   17   29:putfield        #17  <Field int a>
		if(((TypedArray) (attributeset)).hasValue(android.support.design.a.k.AppBarLayout_Layout_layout_scrollInterpolator))
	//*  18   32:aload_2         
	//*  19   33:getstatic       #45  <Field int android.support.design.a$k.AppBarLayout_Layout_layout_scrollInterpolator>
	//*  20   36:invokevirtual   #49  <Method boolean TypedArray.hasValue(int)>
	//*  21   39:ifeq            58
			b = AnimationUtils.loadInterpolator(context, ((TypedArray) (attributeset)).getResourceId(android.support.design.a.k.AppBarLayout_Layout_layout_scrollInterpolator, 0));
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:aload_2         
	//   25   45:getstatic       #45  <Field int android.support.design.a$k.AppBarLayout_Layout_layout_scrollInterpolator>
	//   26   48:iconst_0        
	//   27   49:invokevirtual   #52  <Method int TypedArray.getResourceId(int, int)>
	//   28   52:invokestatic    #58  <Method Interpolator AnimationUtils.loadInterpolator(Context, int)>
	//   29   55:putfield        #60  <Field Interpolator b>
		((TypedArray) (attributeset)).recycle();
	//   30   58:aload_2         
	//   31   59:invokevirtual   #64  <Method void TypedArray.recycle()>
	//   32   62:return          
	}

	public AppBarLayout$LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		super(layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void android.widget.LinearLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
		a = 1;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #17  <Field int a>
	//    6   10:return          
	}

	public AppBarLayout$LayoutParams(android.view.ms ms)
	{
		super(ms);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #70  <Method void android.widget.LinearLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
		a = 1;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #17  <Field int a>
	//    6   10:return          
	}

	public AppBarLayout$LayoutParams(android.widget.LinearLayout$LayoutParams linearlayout$layoutparams)
	{
		super(linearlayout$layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #73  <Method void android.widget.LinearLayout$LayoutParams(android.widget.LinearLayout$LayoutParams)>
		a = 1;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #17  <Field int a>
	//    6   10:return          
	}
}
