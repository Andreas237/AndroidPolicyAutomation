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
		return mScrollFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int mScrollFlags>
	//    2    4:ireturn         
	}

	public Interpolator getScrollInterpolator()
	{
		return mScrollInterpolator;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field Interpolator mScrollInterpolator>
	//    2    4:areturn         
	}

	boolean isCollapsible()
	{
		return (mScrollFlags & 1) == 1 && (mScrollFlags & 0xa) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int mScrollFlags>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:iconst_1        
	//    5    7:icmpne          22
	//    6   10:aload_0         
	//    7   11:getfield        #36  <Field int mScrollFlags>
	//    8   14:bipush          10
	//    9   16:iand            
	//   10   17:ifeq            22
	//   11   20:iconst_1        
	//   12   21:ireturn         
	//   13   22:iconst_0        
	//   14   23:ireturn         
	}

	public void setScrollFlags(int i)
	{
		mScrollFlags = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #36  <Field int mScrollFlags>
	//    3    5:return          
	}

	public void setScrollInterpolator(Interpolator interpolator)
	{
		mScrollInterpolator = interpolator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #82  <Field Interpolator mScrollInterpolator>
	//    3    5:return          
	}

	static final int COLLAPSIBLE_FLAGS = 10;
	static final int FLAG_QUICK_RETURN = 5;
	static final int FLAG_SNAP = 17;
	public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
	public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
	public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
	public static final int SCROLL_FLAG_SCROLL = 1;
	public static final int SCROLL_FLAG_SNAP = 16;
	int mScrollFlags;
	Interpolator mScrollInterpolator;

	public AppBarLayout$LayoutParams(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #34  <Method void android.widget.LinearLayout$LayoutParams(int, int)>
		mScrollFlags = 1;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #36  <Field int mScrollFlags>
	//    7   11:return          
	}

	public AppBarLayout$LayoutParams(int i, int j, float f)
	{
		super(i, j, f);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:fload_3         
	//    4    4:invokespecial   #40  <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
		mScrollFlags = 1;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #36  <Field int mScrollFlags>
	//    8   12:return          
	}

	public AppBarLayout$LayoutParams(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #43  <Method void android.widget.LinearLayout$LayoutParams(Context, AttributeSet)>
		mScrollFlags = 1;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #36  <Field int mScrollFlags>
		attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.AppBarLayout_Layout)));
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:getstatic       #49  <Field int[] android.support.design.R$styleable.AppBarLayout_Layout>
	//   10   16:invokevirtual   #55  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   11   19:astore_2        
		mScrollFlags = ((TypedArray) (attributeset)).getInt(android.support.design.R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
	//   12   20:aload_0         
	//   13   21:aload_2         
	//   14   22:getstatic       #58  <Field int android.support.design.R$styleable.AppBarLayout_Layout_layout_scrollFlags>
	//   15   25:iconst_0        
	//   16   26:invokevirtual   #64  <Method int TypedArray.getInt(int, int)>
	//   17   29:putfield        #36  <Field int mScrollFlags>
		if(((TypedArray) (attributeset)).hasValue(android.support.design.R.styleable.AppBarLayout_Layout_layout_scrollInterpolator))
	//*  18   32:aload_2         
	//*  19   33:getstatic       #67  <Field int android.support.design.R$styleable.AppBarLayout_Layout_layout_scrollInterpolator>
	//*  20   36:invokevirtual   #71  <Method boolean TypedArray.hasValue(int)>
	//*  21   39:ifeq            58
			mScrollInterpolator = AnimationUtils.loadInterpolator(context, ((TypedArray) (attributeset)).getResourceId(android.support.design.R.styleable.AppBarLayout_Layout_layout_scrollInterpolator, 0));
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:aload_2         
	//   25   45:getstatic       #67  <Field int android.support.design.R$styleable.AppBarLayout_Layout_layout_scrollInterpolator>
	//   26   48:iconst_0        
	//   27   49:invokevirtual   #74  <Method int TypedArray.getResourceId(int, int)>
	//   28   52:invokestatic    #80  <Method Interpolator AnimationUtils.loadInterpolator(Context, int)>
	//   29   55:putfield        #82  <Field Interpolator mScrollInterpolator>
		((TypedArray) (attributeset)).recycle();
	//   30   58:aload_2         
	//   31   59:invokevirtual   #86  <Method void TypedArray.recycle()>
	//   32   62:return          
	}

	public AppBarLayout$LayoutParams(AppBarLayout$LayoutParams appbarlayout$layoutparams)
	{
		super(((android.widget.LinearLayout$LayoutParams) (appbarlayout$layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #93  <Method void android.widget.LinearLayout$LayoutParams(android.widget.LinearLayout$LayoutParams)>
		mScrollFlags = 1;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #36  <Field int mScrollFlags>
		mScrollFlags = appbarlayout$layoutparams.mScrollFlags;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:getfield        #36  <Field int mScrollFlags>
	//    9   15:putfield        #36  <Field int mScrollFlags>
		mScrollInterpolator = appbarlayout$layoutparams.mScrollInterpolator;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:getfield        #82  <Field Interpolator mScrollInterpolator>
	//   13   23:putfield        #82  <Field Interpolator mScrollInterpolator>
	//   14   26:return          
	}

	public AppBarLayout$LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		super(layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #97  <Method void android.widget.LinearLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
		mScrollFlags = 1;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #36  <Field int mScrollFlags>
	//    6   10:return          
	}

	public AppBarLayout$LayoutParams(android.view.ms ms)
	{
		super(ms);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #100 <Method void android.widget.LinearLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
		mScrollFlags = 1;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #36  <Field int mScrollFlags>
	//    6   10:return          
	}

	public AppBarLayout$LayoutParams(android.widget.LinearLayout$LayoutParams linearlayout$layoutparams)
	{
		super(linearlayout$layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #93  <Method void android.widget.LinearLayout$LayoutParams(android.widget.LinearLayout$LayoutParams)>
		mScrollFlags = 1;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #36  <Field int mScrollFlags>
	//    6   10:return          
	}
}
