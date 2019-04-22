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

	public void setParallaxMultiplier(float f)
	{
		parallaxMult = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #20  <Field float parallaxMult>
	//    3    5:return          
	}

	int collapseMode;
	float parallaxMult;

	public CollapsingToolbarLayout$LayoutParams(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #15  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
		collapseMode = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #17  <Field int collapseMode>
		parallaxMult = 0.5F;
	//    7   11:aload_0         
	//    8   12:ldc1            #18  <Float 0.5F>
	//    9   14:putfield        #20  <Field float parallaxMult>
	//   10   17:return          
	}

	public CollapsingToolbarLayout$LayoutParams(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #24  <Method void android.widget.FrameLayout$LayoutParams(Context, AttributeSet)>
		collapseMode = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #17  <Field int collapseMode>
		parallaxMult = 0.5F;
	//    7   11:aload_0         
	//    8   12:ldc1            #18  <Float 0.5F>
	//    9   14:putfield        #20  <Field float parallaxMult>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.CollapsingToolbarLayout_Layout)));
	//   10   17:aload_1         
	//   11   18:aload_2         
	//   12   19:getstatic       #30  <Field int[] android.support.design.R$styleable.CollapsingToolbarLayout_Layout>
	//   13   22:invokevirtual   #36  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   14   25:astore_1        
		collapseMode = ((TypedArray) (context)).getInt(android.support.design.R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
	//   15   26:aload_0         
	//   16   27:aload_1         
	//   17   28:getstatic       #39  <Field int android.support.design.R$styleable.CollapsingToolbarLayout_Layout_layout_collapseMode>
	//   18   31:iconst_0        
	//   19   32:invokevirtual   #45  <Method int TypedArray.getInt(int, int)>
	//   20   35:putfield        #17  <Field int collapseMode>
		setParallaxMultiplier(((TypedArray) (context)).getFloat(android.support.design.R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5F));
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:getstatic       #48  <Field int android.support.design.R$styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier>
	//   24   43:ldc1            #18  <Float 0.5F>
	//   25   45:invokevirtual   #52  <Method float TypedArray.getFloat(int, float)>
	//   26   48:invokevirtual   #56  <Method void setParallaxMultiplier(float)>
		((TypedArray) (context)).recycle();
	//   27   51:aload_1         
	//   28   52:invokevirtual   #60  <Method void TypedArray.recycle()>
	//   29   55:return          
	}

	public CollapsingToolbarLayout$LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		super(layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #63  <Method void android.widget.FrameLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
		collapseMode = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #17  <Field int collapseMode>
		parallaxMult = 0.5F;
	//    6   10:aload_0         
	//    7   11:ldc1            #18  <Float 0.5F>
	//    8   13:putfield        #20  <Field float parallaxMult>
	//    9   16:return          
	}
}
