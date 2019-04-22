// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.lang.annotation.Annotation;

// Referenced classes of package android.support.design.widget:
//			AppBarLayout

public static class AppBarLayout$LayoutParams extends android.widget.LinearLayout$LayoutParams
{
	public static interface ScrollFlags
		extends Annotation
	{
	}


	public int getScrollFlags()
	{
		return scrollFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int scrollFlags>
	//    2    4:ireturn         
	}

	public Interpolator getScrollInterpolator()
	{
		return scrollInterpolator;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field Interpolator scrollInterpolator>
	//    2    4:areturn         
	}

	boolean isCollapsible()
	{
		int i = scrollFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int scrollFlags>
	//    2    4:istore_1        
		return (i & 1) == 1 && (i & 0xa) != 0;
	//    3    5:iload_1         
	//    4    6:iconst_1        
	//    5    7:iand            
	//    6    8:iconst_1        
	//    7    9:icmpne          21
	//    8   12:iload_1         
	//    9   13:bipush          10
	//   10   15:iand            
	//   11   16:ifeq            21
	//   12   19:iconst_1        
	//   13   20:ireturn         
	//   14   21:iconst_0        
	//   15   22:ireturn         
	}

	public void setScrollFlags(int i)
	{
		scrollFlags = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #20  <Field int scrollFlags>
	//    3    5:return          
	}

	int scrollFlags;
	Interpolator scrollInterpolator;

	public AppBarLayout$LayoutParams(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #18  <Method void android.widget.LinearLayout$LayoutParams(int, int)>
		scrollFlags = 1;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #20  <Field int scrollFlags>
	//    7   11:return          
	}

	public AppBarLayout$LayoutParams(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #24  <Method void android.widget.LinearLayout$LayoutParams(Context, AttributeSet)>
		scrollFlags = 1;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #20  <Field int scrollFlags>
		attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.AppBarLayout_Layout)));
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:getstatic       #30  <Field int[] android.support.design.R$styleable.AppBarLayout_Layout>
	//   10   16:invokevirtual   #36  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   11   19:astore_2        
		scrollFlags = ((TypedArray) (attributeset)).getInt(android.support.design.R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
	//   12   20:aload_0         
	//   13   21:aload_2         
	//   14   22:getstatic       #39  <Field int android.support.design.R$styleable.AppBarLayout_Layout_layout_scrollFlags>
	//   15   25:iconst_0        
	//   16   26:invokevirtual   #45  <Method int TypedArray.getInt(int, int)>
	//   17   29:putfield        #20  <Field int scrollFlags>
		if(((TypedArray) (attributeset)).hasValue(android.support.design.R.styleable.AppBarLayout_Layout_layout_scrollInterpolator))
	//*  18   32:aload_2         
	//*  19   33:getstatic       #48  <Field int android.support.design.R$styleable.AppBarLayout_Layout_layout_scrollInterpolator>
	//*  20   36:invokevirtual   #52  <Method boolean TypedArray.hasValue(int)>
	//*  21   39:ifeq            58
			scrollInterpolator = AnimationUtils.loadInterpolator(context, ((TypedArray) (attributeset)).getResourceId(android.support.design.R.styleable.AppBarLayout_Layout_layout_scrollInterpolator, 0));
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:aload_2         
	//   25   45:getstatic       #48  <Field int android.support.design.R$styleable.AppBarLayout_Layout_layout_scrollInterpolator>
	//   26   48:iconst_0        
	//   27   49:invokevirtual   #55  <Method int TypedArray.getResourceId(int, int)>
	//   28   52:invokestatic    #61  <Method Interpolator AnimationUtils.loadInterpolator(Context, int)>
	//   29   55:putfield        #63  <Field Interpolator scrollInterpolator>
		((TypedArray) (attributeset)).recycle();
	//   30   58:aload_2         
	//   31   59:invokevirtual   #67  <Method void TypedArray.recycle()>
	//   32   62:return          
	}

	public AppBarLayout$LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		super(layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #70  <Method void android.widget.LinearLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
		scrollFlags = 1;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #20  <Field int scrollFlags>
	//    6   10:return          
	}

	public AppBarLayout$LayoutParams(android.view.ms ms)
	{
		super(ms);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #73  <Method void android.widget.LinearLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
		scrollFlags = 1;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #20  <Field int scrollFlags>
	//    6   10:return          
	}

	public AppBarLayout$LayoutParams(android.widget.LinearLayout$LayoutParams linearlayout$layoutparams)
	{
		super(linearlayout$layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #79  <Method void android.widget.LinearLayout$LayoutParams(android.widget.LinearLayout$LayoutParams)>
		scrollFlags = 1;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #20  <Field int scrollFlags>
	//    6   10:return          
	}
}
