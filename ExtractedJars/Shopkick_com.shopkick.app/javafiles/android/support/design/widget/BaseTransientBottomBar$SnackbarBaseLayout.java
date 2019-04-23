// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityManagerCompat;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;

// Referenced classes of package android.support.design.widget:
//			BaseTransientBottomBar

protected static class BaseTransientBottomBar$SnackbarBaseLayout extends FrameLayout
{

	private void setClickableOrFocusableBasedOnAccessibility(boolean flag)
	{
		setClickable(flag ^ true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:ixor            
	//    4    4:invokevirtual   #98  <Method void setClickable(boolean)>
		setFocusable(flag);
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:invokevirtual   #101 <Method void setFocusable(boolean)>
	//    8   12:return          
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #104 <Method void FrameLayout.onAttachedToWindow()>
		Listener listener = onAttachStateChangeListener;
	//    2    4:aload_0         
	//    3    5:getfield        #106 <Field BaseTransientBottomBar$OnAttachStateChangeListener onAttachStateChangeListener>
	//    4    8:astore_1        
		if(listener != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          20
			listener.onViewAttachedToWindow(((android.view.View) (this)));
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:invokeinterface #112 <Method void BaseTransientBottomBar$OnAttachStateChangeListener.onViewAttachedToWindow(android.view.View)>
		ViewCompat.requestApplyInsets(((android.view.View) (this)));
	//   10   20:aload_0         
	//   11   21:invokestatic    #115 <Method void ViewCompat.requestApplyInsets(android.view.View)>
	//   12   24:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #118 <Method void FrameLayout.onDetachedFromWindow()>
		Listener listener = onAttachStateChangeListener;
	//    2    4:aload_0         
	//    3    5:getfield        #106 <Field BaseTransientBottomBar$OnAttachStateChangeListener onAttachStateChangeListener>
	//    4    8:astore_1        
		if(listener != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          20
			listener.onViewDetachedFromWindow(((android.view.View) (this)));
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:invokeinterface #121 <Method void BaseTransientBottomBar$OnAttachStateChangeListener.onViewDetachedFromWindow(android.view.View)>
		AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(accessibilityManager, touchExplorationStateChangeListener);
	//   10   20:aload_0         
	//   11   21:getfield        #74  <Field AccessibilityManager accessibilityManager>
	//   12   24:aload_0         
	//   13   25:getfield        #79  <Field android.support.v4.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener touchExplorationStateChangeListener>
	//   14   28:invokestatic    #124 <Method boolean AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(AccessibilityManager, android.support.v4.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener)>
	//   15   31:pop             
	//   16   32:return          
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
	//    6    8:invokespecial   #128 <Method void FrameLayout.onLayout(boolean, int, int, int, int)>
		ner ner = onLayoutChangeListener;
	//    7   11:aload_0         
	//    8   12:getfield        #130 <Field BaseTransientBottomBar$OnLayoutChangeListener onLayoutChangeListener>
	//    9   15:astore          6
		if(ner != null)
	//*  10   17:aload           6
	//*  11   19:ifnull          36
			ner.onLayoutChange(((android.view.View) (this)), i, j, k, l);
	//   12   22:aload           6
	//   13   24:aload_0         
	//   14   25:iload_2         
	//   15   26:iload_3         
	//   16   27:iload           4
	//   17   29:iload           5
	//   18   31:invokeinterface #136 <Method void BaseTransientBottomBar$OnLayoutChangeListener.onLayoutChange(android.view.View, int, int, int, int)>
	//   19   36:return          
	}

	void setOnAttachStateChangeListener(Listener listener)
	{
		onAttachStateChangeListener = listener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #106 <Field BaseTransientBottomBar$OnAttachStateChangeListener onAttachStateChangeListener>
	//    3    5:return          
	}

	void setOnLayoutChangeListener(ner ner)
	{
		onLayoutChangeListener = ner;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #130 <Field BaseTransientBottomBar$OnLayoutChangeListener onLayoutChangeListener>
	//    3    5:return          
	}

	private final AccessibilityManager accessibilityManager;
	private Listener onAttachStateChangeListener;
	private ner onLayoutChangeListener;
	private final android.support.v4.view.accessibility.nStateChangeListener touchExplorationStateChangeListener;


/*
	static void access$300(BaseTransientBottomBar$SnackbarBaseLayout basetransientbottombar$snackbarbaselayout, boolean flag)
	{
		basetransientbottombar$snackbarbaselayout.setClickableOrFocusableBasedOnAccessibility(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #93  <Method void setClickableOrFocusableBasedOnAccessibility(boolean)>
		return;
	//    3    5:return          
	}

*/

	protected BaseTransientBottomBar$SnackbarBaseLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #26  <Method void BaseTransientBottomBar$SnackbarBaseLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	protected BaseTransientBottomBar$SnackbarBaseLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #28  <Method void FrameLayout(Context, AttributeSet)>
		attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.SnackbarLayout)));
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:getstatic       #34  <Field int[] android.support.design.R$styleable.SnackbarLayout>
	//    7   11:invokevirtual   #40  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    8   14:astore_2        
		if(((TypedArray) (attributeset)).hasValue(android.support.design.R.styleable.SnackbarLayout_elevation))
	//*   9   15:aload_2         
	//*  10   16:getstatic       #44  <Field int android.support.design.R$styleable.SnackbarLayout_elevation>
	//*  11   19:invokevirtual   #50  <Method boolean TypedArray.hasValue(int)>
	//*  12   22:ifeq            38
			ViewCompat.setElevation(((android.view.View) (this)), ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.R.styleable.SnackbarLayout_elevation, 0));
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:getstatic       #44  <Field int android.support.design.R$styleable.SnackbarLayout_elevation>
	//   16   30:iconst_0        
	//   17   31:invokevirtual   #54  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   18   34:i2f             
	//   19   35:invokestatic    #60  <Method void ViewCompat.setElevation(android.view.View, float)>
		((TypedArray) (attributeset)).recycle();
	//   20   38:aload_2         
	//   21   39:invokevirtual   #64  <Method void TypedArray.recycle()>
		accessibilityManager = (AccessibilityManager)context.getSystemService("accessibility");
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:ldc1            #66  <String "accessibility">
	//   25   46:invokevirtual   #70  <Method Object Context.getSystemService(String)>
	//   26   49:checkcast       #72  <Class AccessibilityManager>
	//   27   52:putfield        #74  <Field AccessibilityManager accessibilityManager>
		touchExplorationStateChangeListener = new android.support.v4.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener() {

			public void onTouchExplorationStateChanged(boolean flag)
			{
				setClickableOrFocusableBasedOnAccessibility(flag);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field BaseTransientBottomBar$SnackbarBaseLayout this$0>
			//    2    4:iload_1         
			//    3    5:invokestatic    #29  <Method void BaseTransientBottomBar$SnackbarBaseLayout.access$300(BaseTransientBottomBar$SnackbarBaseLayout, boolean)>
			//    4    8:return          
			}

			final BaseTransientBottomBar.SnackbarBaseLayout this$0;

			
			{
				this$0 = BaseTransientBottomBar.SnackbarBaseLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BaseTransientBottomBar$SnackbarBaseLayout this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   28   55:aload_0         
	//   29   56:new             #9   <Class BaseTransientBottomBar$SnackbarBaseLayout$1>
	//   30   59:dup             
	//   31   60:aload_0         
	//   32   61:invokespecial   #77  <Method void BaseTransientBottomBar$SnackbarBaseLayout$1(BaseTransientBottomBar$SnackbarBaseLayout)>
	//   33   64:putfield        #79  <Field android.support.v4.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener touchExplorationStateChangeListener>
		AccessibilityManagerCompat.addTouchExplorationStateChangeListener(accessibilityManager, touchExplorationStateChangeListener);
	//   34   67:aload_0         
	//   35   68:getfield        #74  <Field AccessibilityManager accessibilityManager>
	//   36   71:aload_0         
	//   37   72:getfield        #79  <Field android.support.v4.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener touchExplorationStateChangeListener>
	//   38   75:invokestatic    #85  <Method boolean AccessibilityManagerCompat.addTouchExplorationStateChangeListener(AccessibilityManager, android.support.v4.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener)>
	//   39   78:pop             
		setClickableOrFocusableBasedOnAccessibility(accessibilityManager.isTouchExplorationEnabled());
	//   40   79:aload_0         
	//   41   80:aload_0         
	//   42   81:getfield        #74  <Field AccessibilityManager accessibilityManager>
	//   43   84:invokevirtual   #89  <Method boolean AccessibilityManager.isTouchExplorationEnabled()>
	//   44   87:invokespecial   #93  <Method void setClickableOrFocusableBasedOnAccessibility(boolean)>
	//   45   90:return          
	}
}
