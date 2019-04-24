// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.lang.annotation.Annotation;

// Referenced classes of package android.support.design.widget:
//			CollapsingToolbarLayout

public static class CollapsingToolbarLayout$LayoutParams extends android.widget.FrameLayout.LayoutParams
{
	static interface CollapseMode
		extends Annotation
	{
	}


	public int getCollapseMode()
	{
		return mCollapseMode;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int mCollapseMode>
	//    2    4:ireturn         
	}

	public float getParallaxMultiplier()
	{
		return mParallaxMult;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field float mParallaxMult>
	//    2    4:freturn         
	}

	public void setCollapseMode(int i)
	{
		mCollapseMode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #28  <Field int mCollapseMode>
	//    3    5:return          
	}

	public void setParallaxMultiplier(float f)
	{
		mParallaxMult = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #30  <Field float mParallaxMult>
	//    3    5:return          
	}

	public static final int COLLAPSE_MODE_OFF = 0;
	public static final int COLLAPSE_MODE_PARALLAX = 2;
	public static final int COLLAPSE_MODE_PIN = 1;
	private static final float DEFAULT_PARALLAX_MULTIPLIER = 0.5F;
	int mCollapseMode;
	float mParallaxMult;

	public CollapsingToolbarLayout$LayoutParams(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #26  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
		mCollapseMode = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #28  <Field int mCollapseMode>
		mParallaxMult = 0.5F;
	//    7   11:aload_0         
	//    8   12:ldc1            #20  <Float 0.5F>
	//    9   14:putfield        #30  <Field float mParallaxMult>
	//   10   17:return          
	}

	public CollapsingToolbarLayout$LayoutParams(int i, int j, int k)
	{
		super(i, j, k);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #34  <Method void android.widget.FrameLayout$LayoutParams(int, int, int)>
		mCollapseMode = 0;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #28  <Field int mCollapseMode>
		mParallaxMult = 0.5F;
	//    8   12:aload_0         
	//    9   13:ldc1            #20  <Float 0.5F>
	//   10   15:putfield        #30  <Field float mParallaxMult>
	//   11   18:return          
	}

	public CollapsingToolbarLayout$LayoutParams(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #37  <Method void android.widget.FrameLayout$LayoutParams(Context, AttributeSet)>
		mCollapseMode = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #28  <Field int mCollapseMode>
		mParallaxMult = 0.5F;
	//    7   11:aload_0         
	//    8   12:ldc1            #20  <Float 0.5F>
	//    9   14:putfield        #30  <Field float mParallaxMult>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.CollapsingToolbarLayout_Layout)));
	//   10   17:aload_1         
	//   11   18:aload_2         
	//   12   19:getstatic       #43  <Field int[] android.support.design.R$styleable.CollapsingToolbarLayout_Layout>
	//   13   22:invokevirtual   #49  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   14   25:astore_1        
		mCollapseMode = ((TypedArray) (context)).getInt(android.support.design.R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
	//   15   26:aload_0         
	//   16   27:aload_1         
	//   17   28:getstatic       #52  <Field int android.support.design.R$styleable.CollapsingToolbarLayout_Layout_layout_collapseMode>
	//   18   31:iconst_0        
	//   19   32:invokevirtual   #58  <Method int TypedArray.getInt(int, int)>
	//   20   35:putfield        #28  <Field int mCollapseMode>
		setParallaxMultiplier(((TypedArray) (context)).getFloat(android.support.design.R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5F));
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:getstatic       #61  <Field int android.support.design.R$styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier>
	//   24   43:ldc1            #20  <Float 0.5F>
	//   25   45:invokevirtual   #65  <Method float TypedArray.getFloat(int, float)>
	//   26   48:invokevirtual   #69  <Method void setParallaxMultiplier(float)>
		((TypedArray) (context)).recycle();
	//   27   51:aload_1         
	//   28   52:invokevirtual   #73  <Method void TypedArray.recycle()>
	//   29   55:return          
	}

	public CollapsingToolbarLayout$LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		super(layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #76  <Method void android.widget.FrameLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
		mCollapseMode = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #28  <Field int mCollapseMode>
		mParallaxMult = 0.5F;
	//    6   10:aload_0         
	//    7   11:ldc1            #20  <Float 0.5F>
	//    8   13:putfield        #30  <Field float mParallaxMult>
	//    9   16:return          
	}

	public CollapsingToolbarLayout$LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
	{
		super(marginlayoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #79  <Method void android.widget.FrameLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
		mCollapseMode = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #28  <Field int mCollapseMode>
		mParallaxMult = 0.5F;
	//    6   10:aload_0         
	//    7   11:ldc1            #20  <Float 0.5F>
	//    8   13:putfield        #30  <Field float mParallaxMult>
	//    9   16:return          
	}

	public CollapsingToolbarLayout$LayoutParams(android.widget.FrameLayout.LayoutParams layoutparams)
	{
		super(layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #85  <Method void android.widget.FrameLayout$LayoutParams(android.widget.FrameLayout$LayoutParams)>
		mCollapseMode = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #28  <Field int mCollapseMode>
		mParallaxMult = 0.5F;
	//    6   10:aload_0         
	//    7   11:ldc1            #20  <Float 0.5F>
	//    8   13:putfield        #30  <Field float mParallaxMult>
	//    9   16:return          
	}
}
