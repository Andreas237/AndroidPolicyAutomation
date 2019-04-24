// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.widget.FrameLayout;

// Referenced classes of package android.support.design.widget:
//			BaseTransientBottomBar

static class BaseTransientBottomBar$SnackbarBaseLayout extends FrameLayout
{

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void FrameLayout.onAttachedToWindow()>
		if(mOnAttachStateChangeListener != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #67  <Field BaseTransientBottomBar$OnAttachStateChangeListener mOnAttachStateChangeListener>
	//*   4    8:ifnull          21
			mOnAttachStateChangeListener.onViewAttachedToWindow(((android.view.View) (this)));
	//    5   11:aload_0         
	//    6   12:getfield        #67  <Field BaseTransientBottomBar$OnAttachStateChangeListener mOnAttachStateChangeListener>
	//    7   15:aload_0         
	//    8   16:invokeinterface #73  <Method void BaseTransientBottomBar$OnAttachStateChangeListener.onViewAttachedToWindow(android.view.View)>
		ViewCompat.requestApplyInsets(((android.view.View) (this)));
	//    9   21:aload_0         
	//   10   22:invokestatic    #76  <Method void ViewCompat.requestApplyInsets(android.view.View)>
	//   11   25:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void FrameLayout.onDetachedFromWindow()>
		if(mOnAttachStateChangeListener != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #67  <Field BaseTransientBottomBar$OnAttachStateChangeListener mOnAttachStateChangeListener>
	//*   4    8:ifnull          21
			mOnAttachStateChangeListener.onViewDetachedFromWindow(((android.view.View) (this)));
	//    5   11:aload_0         
	//    6   12:getfield        #67  <Field BaseTransientBottomBar$OnAttachStateChangeListener mOnAttachStateChangeListener>
	//    7   15:aload_0         
	//    8   16:invokeinterface #82  <Method void BaseTransientBottomBar$OnAttachStateChangeListener.onViewDetachedFromWindow(android.view.View)>
	//    9   21:return          
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		super.onLayout(flag, i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #86  <Method void FrameLayout.onLayout(boolean, int, int, int, int)>
		if(mOnLayoutChangeListener != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #88  <Field BaseTransientBottomBar$OnLayoutChangeListener mOnLayoutChangeListener>
	//*   9   15:ifnull          34
			mOnLayoutChangeListener.onLayoutChange(((android.view.View) (this)), i, j, k, l);
	//   10   18:aload_0         
	//   11   19:getfield        #88  <Field BaseTransientBottomBar$OnLayoutChangeListener mOnLayoutChangeListener>
	//   12   22:aload_0         
	//   13   23:iload_2         
	//   14   24:iload_3         
	//   15   25:iload           4
	//   16   27:iload           5
	//   17   29:invokeinterface #94  <Method void BaseTransientBottomBar$OnLayoutChangeListener.onLayoutChange(android.view.View, int, int, int, int)>
	//   18   34:return          
	}

	void setOnAttachStateChangeListener(Listener listener)
	{
		mOnAttachStateChangeListener = listener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field BaseTransientBottomBar$OnAttachStateChangeListener mOnAttachStateChangeListener>
	//    3    5:return          
	}

	void setOnLayoutChangeListener(ner ner)
	{
		mOnLayoutChangeListener = ner;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #88  <Field BaseTransientBottomBar$OnLayoutChangeListener mOnLayoutChangeListener>
	//    3    5:return          
	}

	private Listener mOnAttachStateChangeListener;
	private ner mOnLayoutChangeListener;

	BaseTransientBottomBar$SnackbarBaseLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #20  <Method void BaseTransientBottomBar$SnackbarBaseLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	BaseTransientBottomBar$SnackbarBaseLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #22  <Method void FrameLayout(Context, AttributeSet)>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.SnackbarLayout)));
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:getstatic       #28  <Field int[] android.support.design.R$styleable.SnackbarLayout>
	//    7   11:invokevirtual   #34  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    8   14:astore_1        
		if(((TypedArray) (context)).hasValue(android.support.design.R.styleable.SnackbarLayout_elevation))
	//*   9   15:aload_1         
	//*  10   16:getstatic       #38  <Field int android.support.design.R$styleable.SnackbarLayout_elevation>
	//*  11   19:invokevirtual   #44  <Method boolean TypedArray.hasValue(int)>
	//*  12   22:ifeq            38
			ViewCompat.setElevation(((android.view.View) (this)), ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.SnackbarLayout_elevation, 0));
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:getstatic       #38  <Field int android.support.design.R$styleable.SnackbarLayout_elevation>
	//   16   30:iconst_0        
	//   17   31:invokevirtual   #48  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   18   34:i2f             
	//   19   35:invokestatic    #54  <Method void ViewCompat.setElevation(android.view.View, float)>
		((TypedArray) (context)).recycle();
	//   20   38:aload_1         
	//   21   39:invokevirtual   #58  <Method void TypedArray.recycle()>
		setClickable(true);
	//   22   42:aload_0         
	//   23   43:iconst_1        
	//   24   44:invokevirtual   #62  <Method void setClickable(boolean)>
	//   25   47:return          
	}
}
