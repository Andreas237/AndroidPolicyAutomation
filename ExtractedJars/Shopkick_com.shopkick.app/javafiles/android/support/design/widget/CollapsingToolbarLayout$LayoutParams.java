// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

// Referenced classes of package android.support.design.widget:
//			CollapsingToolbarLayout

public static class CollapsingToolbarLayout$LayoutParams extends android.widget.FrameLayout.LayoutParams
{

	public int getCollapseMode()
	{
		return collapseMode;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int collapseMode>
	//    2    4:ireturn         
	}

	public float getParallaxMultiplier()
	{
		return parallaxMult;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field float parallaxMult>
	//    2    4:freturn         
	}

	public void setCollapseMode(int i)
	{
		collapseMode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #25  <Field int collapseMode>
	//    3    5:return          
	}

	public void setParallaxMultiplier(float f)
	{
		parallaxMult = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #27  <Field float parallaxMult>
	//    3    5:return          
	}

	public static final int COLLAPSE_MODE_OFF = 0;
	public static final int COLLAPSE_MODE_PARALLAX = 2;
	public static final int COLLAPSE_MODE_PIN = 1;
	private static final float DEFAULT_PARALLAX_MULTIPLIER = 0.5F;
	int collapseMode;
	float parallaxMult;

	public CollapsingToolbarLayout$LayoutParams(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #23  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
		collapseMode = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #25  <Field int collapseMode>
		parallaxMult = 0.5F;
	//    7   11:aload_0         
	//    8   12:ldc1            #17  <Float 0.5F>
	//    9   14:putfield        #27  <Field float parallaxMult>
	//   10   17:return          
	}

	public CollapsingToolbarLayout$LayoutParams(int i, int j, int k)
	{
		super(i, j, k);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #31  <Method void android.widget.FrameLayout$LayoutParams(int, int, int)>
		collapseMode = 0;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #25  <Field int collapseMode>
		parallaxMult = 0.5F;
	//    8   12:aload_0         
	//    9   13:ldc1            #17  <Float 0.5F>
	//   10   15:putfield        #27  <Field float parallaxMult>
	//   11   18:return          
	}

	public CollapsingToolbarLayout$LayoutParams(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #34  <Method void android.widget.FrameLayout$LayoutParams(Context, AttributeSet)>
		collapseMode = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #25  <Field int collapseMode>
		parallaxMult = 0.5F;
	//    7   11:aload_0         
	//    8   12:ldc1            #17  <Float 0.5F>
	//    9   14:putfield        #27  <Field float parallaxMult>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.CollapsingToolbarLayout_Layout)));
	//   10   17:aload_1         
	//   11   18:aload_2         
	//   12   19:getstatic       #40  <Field int[] android.support.design.R$styleable.CollapsingToolbarLayout_Layout>
	//   13   22:invokevirtual   #46  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   14   25:astore_1        
		collapseMode = ((TypedArray) (context)).getInt(android.support.design.R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
	//   15   26:aload_0         
	//   16   27:aload_1         
	//   17   28:getstatic       #49  <Field int android.support.design.R$styleable.CollapsingToolbarLayout_Layout_layout_collapseMode>
	//   18   31:iconst_0        
	//   19   32:invokevirtual   #55  <Method int TypedArray.getInt(int, int)>
	//   20   35:putfield        #25  <Field int collapseMode>
		setParallaxMultiplier(((TypedArray) (context)).getFloat(android.support.design.R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5F));
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:getstatic       #58  <Field int android.support.design.R$styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier>
	//   24   43:ldc1            #17  <Float 0.5F>
	//   25   45:invokevirtual   #62  <Method float TypedArray.getFloat(int, float)>
	//   26   48:invokevirtual   #66  <Method void setParallaxMultiplier(float)>
		((TypedArray) (context)).recycle();
	//   27   51:aload_1         
	//   28   52:invokevirtual   #70  <Method void TypedArray.recycle()>
	//   29   55:return          
	}

	public CollapsingToolbarLayout$LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		super(layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #73  <Method void android.widget.FrameLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
		collapseMode = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #25  <Field int collapseMode>
		parallaxMult = 0.5F;
	//    6   10:aload_0         
	//    7   11:ldc1            #17  <Float 0.5F>
	//    8   13:putfield        #27  <Field float parallaxMult>
	//    9   16:return          
	}

	public CollapsingToolbarLayout$LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
	{
		super(marginlayoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #76  <Method void android.widget.FrameLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
		collapseMode = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #25  <Field int collapseMode>
		parallaxMult = 0.5F;
	//    6   10:aload_0         
	//    7   11:ldc1            #17  <Float 0.5F>
	//    8   13:putfield        #27  <Field float parallaxMult>
	//    9   16:return          
	}

	public CollapsingToolbarLayout$LayoutParams(android.widget.FrameLayout.LayoutParams layoutparams)
	{
		super(layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #82  <Method void android.widget.FrameLayout$LayoutParams(android.widget.FrameLayout$LayoutParams)>
		collapseMode = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #25  <Field int collapseMode>
		parallaxMult = 0.5F;
	//    6   10:aload_0         
	//    7   11:ldc1            #17  <Float 0.5F>
	//    8   13:putfield        #27  <Field float parallaxMult>
	//    9   16:return          
	}
}