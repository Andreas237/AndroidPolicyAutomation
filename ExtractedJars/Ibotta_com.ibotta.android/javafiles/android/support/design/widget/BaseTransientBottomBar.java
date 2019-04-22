// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.*;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.*;
import android.support.design.animation.AnimationUtils;
import android.support.design.snackbar.ContentViewCallback;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityManagerCompat;
import android.util.AttributeSet;
import android.view.*;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import java.lang.annotation.Annotation;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//			SnackbarManager, SwipeDismissBehavior, CoordinatorLayout

public abstract class BaseTransientBottomBar
{
	public static abstract class BaseCallback
	{

		public void onDismissed(Object obj, int i)
		{
		//    0    0:return          
		}

		public void onShown(Object obj)
		{
		//    0    0:return          
		}

		public BaseCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface BaseCallback.DismissEvent
		extends Annotation
	{
	}

	public static class Behavior extends SwipeDismissBehavior
	{

		private void setBaseTransientBottomBar(BaseTransientBottomBar basetransientbottombar)
		{
			_flddelegate.setBaseTransientBottomBar(basetransientbottombar);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field BaseTransientBottomBar$BehaviorDelegate _flddelegate>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #29  <Method void BaseTransientBottomBar$BehaviorDelegate.setBaseTransientBottomBar(BaseTransientBottomBar)>
		//    4    8:return          
		}

		public boolean canSwipeDismissView(View view1)
		{
			return _flddelegate.canSwipeDismissView(view1);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field BaseTransientBottomBar$BehaviorDelegate _flddelegate>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #35  <Method boolean BaseTransientBottomBar$BehaviorDelegate.canSwipeDismissView(View)>
		//    4    8:ireturn         
		}

		public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorlayout, View view1, MotionEvent motionevent)
		{
			_flddelegate.onInterceptTouchEvent(coordinatorlayout, view1, motionevent);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field BaseTransientBottomBar$BehaviorDelegate _flddelegate>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #40  <Method void BaseTransientBottomBar$BehaviorDelegate.onInterceptTouchEvent(CoordinatorLayout, View, MotionEvent)>
			return super.onInterceptTouchEvent(coordinatorlayout, view1, motionevent);
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:aload_2         
		//    9   13:aload_3         
		//   10   14:invokespecial   #42  <Method boolean SwipeDismissBehavior.onInterceptTouchEvent(CoordinatorLayout, View, MotionEvent)>
		//   11   17:ireturn         
		}

		private final BehaviorDelegate _flddelegate = new BehaviorDelegate(((SwipeDismissBehavior) (this)));


/*
		static void access$000(Behavior behavior1, BaseTransientBottomBar basetransientbottombar)
		{
			behavior1.setBaseTransientBottomBar(basetransientbottombar);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #28  <Method void setBaseTransientBottomBar(BaseTransientBottomBar)>
			return;
		//    3    5:return          
		}

*/

		public Behavior()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void SwipeDismissBehavior()>
		//    2    4:aload_0         
		//    3    5:new             #16  <Class BaseTransientBottomBar$BehaviorDelegate>
		//    4    8:dup             
		//    5    9:aload_0         
		//    6   10:invokespecial   #19  <Method void BaseTransientBottomBar$BehaviorDelegate(SwipeDismissBehavior)>
		//    7   13:putfield        #21  <Field BaseTransientBottomBar$BehaviorDelegate _flddelegate>
		//    8   16:return          
		}
	}

	public static class BehaviorDelegate
	{

		public boolean canSwipeDismissView(View view1)
		{
			return view1 instanceof SnackbarBaseLayout;
		//    0    0:aload_1         
		//    1    1:instanceof      #40  <Class BaseTransientBottomBar$SnackbarBaseLayout>
		//    2    4:ireturn         
		}

		public void onInterceptTouchEvent(CoordinatorLayout coordinatorlayout, View view1, MotionEvent motionevent)
		{
			int i = motionevent.getActionMasked();
		//    0    0:aload_3         
		//    1    1:invokevirtual   #48  <Method int MotionEvent.getActionMasked()>
		//    2    4:istore          4
			if(i == 3) goto _L2; else goto _L1
		//    3    6:iload           4
		//    4    8:iconst_3        
		//    5    9:icmpeq          66
_L1:
			i;
		//    6   12:iload           4
			JVM INSTR tableswitch 0 1: default 36
		//		               0 37
		//		               1 66;
		//    7   14:tableswitch     0 1: default 36
		//		               0 37
		//		               1 66
			   goto _L3 _L4 _L2
_L3:
			return;
		//    8   36:return          
_L4:
			if(coordinatorlayout.isPointInChildBounds(view1, (int)motionevent.getX(), (int)motionevent.getY()))
		//*   9   37:aload_1         
		//*  10   38:aload_2         
		//*  11   39:aload_3         
		//*  12   40:invokevirtual   #52  <Method float MotionEvent.getX()>
		//*  13   43:f2i             
		//*  14   44:aload_3         
		//*  15   45:invokevirtual   #55  <Method float MotionEvent.getY()>
		//*  16   48:f2i             
		//*  17   49:invokevirtual   #61  <Method boolean CoordinatorLayout.isPointInChildBounds(View, int, int)>
		//*  18   52:ifeq            76
			{
				SnackbarManager.getInstance().pauseTimeout(managerCallback);
		//   19   55:invokestatic    #67  <Method SnackbarManager SnackbarManager.getInstance()>
		//   20   58:aload_0         
		//   21   59:getfield        #69  <Field SnackbarManager$Callback managerCallback>
		//   22   62:invokevirtual   #73  <Method void SnackbarManager.pauseTimeout(SnackbarManager$Callback)>
				return;
		//   23   65:return          
			}
			break; /* Loop/switch isn't completed */
_L2:
			SnackbarManager.getInstance().restoreTimeoutIfPaused(managerCallback);
		//   24   66:invokestatic    #67  <Method SnackbarManager SnackbarManager.getInstance()>
		//   25   69:aload_0         
		//   26   70:getfield        #69  <Field SnackbarManager$Callback managerCallback>
		//   27   73:invokevirtual   #76  <Method void SnackbarManager.restoreTimeoutIfPaused(SnackbarManager$Callback)>
		//   28   76:return          
		}

		public void setBaseTransientBottomBar(BaseTransientBottomBar basetransientbottombar)
		{
			managerCallback = basetransientbottombar.managerCallback;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getfield        #79  <Field SnackbarManager$Callback BaseTransientBottomBar.managerCallback>
		//    3    5:putfield        #69  <Field SnackbarManager$Callback managerCallback>
		//    4    8:return          
		}

		private SnackbarManager.Callback managerCallback;

		public BehaviorDelegate(SwipeDismissBehavior swipedismissbehavior)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			swipedismissbehavior.setStartAlphaSwipeDistance(0.1F);
		//    2    4:aload_1         
		//    3    5:ldc1            #19  <Float 0.1F>
		//    4    7:invokevirtual   #25  <Method void SwipeDismissBehavior.setStartAlphaSwipeDistance(float)>
			swipedismissbehavior.setEndAlphaSwipeDistance(0.6F);
		//    5   10:aload_1         
		//    6   11:ldc1            #26  <Float 0.6F>
		//    7   13:invokevirtual   #29  <Method void SwipeDismissBehavior.setEndAlphaSwipeDistance(float)>
			swipedismissbehavior.setSwipeDirection(0);
		//    8   16:aload_1         
		//    9   17:iconst_0        
		//   10   18:invokevirtual   #33  <Method void SwipeDismissBehavior.setSwipeDirection(int)>
		//   11   21:return          
		}
	}

	public static interface ContentViewCallback
		extends android.support.design.snackbar.ContentViewCallback
	{
	}

	public static interface Duration
		extends Annotation
	{
	}

	protected static interface OnAttachStateChangeListener
	{

		public abstract void onViewAttachedToWindow(View view1);

		public abstract void onViewDetachedFromWindow(View view1);
	}

	protected static interface OnLayoutChangeListener
	{

		public abstract void onLayoutChange(View view1, int i, int j, int k, int l);
	}

	protected static class SnackbarBaseLayout extends FrameLayout
	{

		private void setClickableOrFocusableBasedOnAccessibility(boolean flag)
		{
			setClickable(flag ^ true);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_1        
		//    3    3:ixor            
		//    4    4:invokevirtual   #96  <Method void setClickable(boolean)>
			setFocusable(flag);
		//    5    7:aload_0         
		//    6    8:iload_1         
		//    7    9:invokevirtual   #99  <Method void setFocusable(boolean)>
		//    8   12:return          
		}

		protected void onAttachedToWindow()
		{
			super.onAttachedToWindow();
		//    0    0:aload_0         
		//    1    1:invokespecial   #102 <Method void FrameLayout.onAttachedToWindow()>
			OnAttachStateChangeListener onattachstatechangelistener = onAttachStateChangeListener;
		//    2    4:aload_0         
		//    3    5:getfield        #104 <Field BaseTransientBottomBar$OnAttachStateChangeListener onAttachStateChangeListener>
		//    4    8:astore_1        
			if(onattachstatechangelistener != null)
		//*   5    9:aload_1         
		//*   6   10:ifnull          20
				onattachstatechangelistener.onViewAttachedToWindow(((View) (this)));
		//    7   13:aload_1         
		//    8   14:aload_0         
		//    9   15:invokeinterface #110 <Method void BaseTransientBottomBar$OnAttachStateChangeListener.onViewAttachedToWindow(View)>
			ViewCompat.requestApplyInsets(((View) (this)));
		//   10   20:aload_0         
		//   11   21:invokestatic    #113 <Method void ViewCompat.requestApplyInsets(View)>
		//   12   24:return          
		}

		protected void onDetachedFromWindow()
		{
			super.onDetachedFromWindow();
		//    0    0:aload_0         
		//    1    1:invokespecial   #116 <Method void FrameLayout.onDetachedFromWindow()>
			OnAttachStateChangeListener onattachstatechangelistener = onAttachStateChangeListener;
		//    2    4:aload_0         
		//    3    5:getfield        #104 <Field BaseTransientBottomBar$OnAttachStateChangeListener onAttachStateChangeListener>
		//    4    8:astore_1        
			if(onattachstatechangelistener != null)
		//*   5    9:aload_1         
		//*   6   10:ifnull          20
				onattachstatechangelistener.onViewDetachedFromWindow(((View) (this)));
		//    7   13:aload_1         
		//    8   14:aload_0         
		//    9   15:invokeinterface #119 <Method void BaseTransientBottomBar$OnAttachStateChangeListener.onViewDetachedFromWindow(View)>
			AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(accessibilityManager, touchExplorationStateChangeListener);
		//   10   20:aload_0         
		//   11   21:getfield        #71  <Field AccessibilityManager accessibilityManager>
		//   12   24:aload_0         
		//   13   25:getfield        #76  <Field android.support.v4.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener touchExplorationStateChangeListener>
		//   14   28:invokestatic    #122 <Method boolean AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(AccessibilityManager, android.support.v4.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener)>
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
		//    6    8:invokespecial   #126 <Method void FrameLayout.onLayout(boolean, int, int, int, int)>
			OnLayoutChangeListener onlayoutchangelistener = onLayoutChangeListener;
		//    7   11:aload_0         
		//    8   12:getfield        #128 <Field BaseTransientBottomBar$OnLayoutChangeListener onLayoutChangeListener>
		//    9   15:astore          6
			if(onlayoutchangelistener != null)
		//*  10   17:aload           6
		//*  11   19:ifnull          36
				onlayoutchangelistener.onLayoutChange(((View) (this)), i, j, k, l);
		//   12   22:aload           6
		//   13   24:aload_0         
		//   14   25:iload_2         
		//   15   26:iload_3         
		//   16   27:iload           4
		//   17   29:iload           5
		//   18   31:invokeinterface #134 <Method void BaseTransientBottomBar$OnLayoutChangeListener.onLayoutChange(View, int, int, int, int)>
		//   19   36:return          
		}

		void setOnAttachStateChangeListener(OnAttachStateChangeListener onattachstatechangelistener)
		{
			onAttachStateChangeListener = onattachstatechangelistener;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #104 <Field BaseTransientBottomBar$OnAttachStateChangeListener onAttachStateChangeListener>
		//    3    5:return          
		}

		void setOnLayoutChangeListener(OnLayoutChangeListener onlayoutchangelistener)
		{
			onLayoutChangeListener = onlayoutchangelistener;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #128 <Field BaseTransientBottomBar$OnLayoutChangeListener onLayoutChangeListener>
		//    3    5:return          
		}

		private final AccessibilityManager accessibilityManager;
		private OnAttachStateChangeListener onAttachStateChangeListener;
		private OnLayoutChangeListener onLayoutChangeListener;
		private final android.support.v4.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new _cls1();


/*
		static void access$300(SnackbarBaseLayout snackbarbaselayout, boolean flag)
		{
			snackbarbaselayout.setClickableOrFocusableBasedOnAccessibility(flag);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #90  <Method void setClickableOrFocusableBasedOnAccessibility(boolean)>
			return;
		//    3    5:return          
		}

*/

		protected SnackbarBaseLayout(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #25  <Method void FrameLayout(Context, AttributeSet)>
			attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.SnackbarLayout)));
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:getstatic       #31  <Field int[] android.support.design.R$styleable.SnackbarLayout>
		//    7   11:invokevirtual   #37  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//    8   14:astore_2        
			if(((TypedArray) (attributeset)).hasValue(android.support.design.R.styleable.SnackbarLayout_elevation))
		//*   9   15:aload_2         
		//*  10   16:getstatic       #41  <Field int android.support.design.R$styleable.SnackbarLayout_elevation>
		//*  11   19:invokevirtual   #47  <Method boolean TypedArray.hasValue(int)>
		//*  12   22:ifeq            38
				ViewCompat.setElevation(((View) (this)), ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.R.styleable.SnackbarLayout_elevation, 0));
		//   13   25:aload_0         
		//   14   26:aload_2         
		//   15   27:getstatic       #41  <Field int android.support.design.R$styleable.SnackbarLayout_elevation>
		//   16   30:iconst_0        
		//   17   31:invokevirtual   #51  <Method int TypedArray.getDimensionPixelSize(int, int)>
		//   18   34:i2f             
		//   19   35:invokestatic    #57  <Method void ViewCompat.setElevation(View, float)>
			((TypedArray) (attributeset)).recycle();
		//   20   38:aload_2         
		//   21   39:invokevirtual   #61  <Method void TypedArray.recycle()>
			accessibilityManager = (AccessibilityManager)context.getSystemService("accessibility");
		//   22   42:aload_0         
		//   23   43:aload_1         
		//   24   44:ldc1            #63  <String "accessibility">
		//   25   46:invokevirtual   #67  <Method Object Context.getSystemService(String)>
		//   26   49:checkcast       #69  <Class AccessibilityManager>
		//   27   52:putfield        #71  <Field AccessibilityManager accessibilityManager>
		//   28   55:aload_0         
		//   29   56:new             #9   <Class BaseTransientBottomBar$SnackbarBaseLayout$1>
		//   30   59:dup             
		//   31   60:aload_0         
		//   32   61:invokespecial   #74  <Method void BaseTransientBottomBar$SnackbarBaseLayout$1(BaseTransientBottomBar$SnackbarBaseLayout)>
		//   33   64:putfield        #76  <Field android.support.v4.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener touchExplorationStateChangeListener>
			AccessibilityManagerCompat.addTouchExplorationStateChangeListener(accessibilityManager, touchExplorationStateChangeListener);
		//   34   67:aload_0         
		//   35   68:getfield        #71  <Field AccessibilityManager accessibilityManager>
		//   36   71:aload_0         
		//   37   72:getfield        #76  <Field android.support.v4.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener touchExplorationStateChangeListener>
		//   38   75:invokestatic    #82  <Method boolean AccessibilityManagerCompat.addTouchExplorationStateChangeListener(AccessibilityManager, android.support.v4.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener)>
		//   39   78:pop             
			setClickableOrFocusableBasedOnAccessibility(accessibilityManager.isTouchExplorationEnabled());
		//   40   79:aload_0         
		//   41   80:aload_0         
		//   42   81:getfield        #71  <Field AccessibilityManager accessibilityManager>
		//   43   84:invokevirtual   #86  <Method boolean AccessibilityManager.isTouchExplorationEnabled()>
		//   44   87:invokespecial   #90  <Method void setClickableOrFocusableBasedOnAccessibility(boolean)>
		//   45   90:return          
		}
	}


	private void animateViewOut(final int event)
	{
		ValueAnimator valueanimator = new ValueAnimator();
	//    0    0:new             #117 <Class ValueAnimator>
	//    1    3:dup             
	//    2    4:invokespecial   #118 <Method void ValueAnimator()>
	//    3    7:astore_2        
		valueanimator.setIntValues(new int[] {
			0, getTranslationYBottom()
		});
	//    4    8:aload_2         
	//    5    9:iconst_2        
	//    6   10:newarray        int[]
	//    7   12:dup             
	//    8   13:iconst_0        
	//    9   14:iconst_0        
	//   10   15:iastore         
	//   11   16:dup             
	//   12   17:iconst_1        
	//   13   18:aload_0         
	//   14   19:invokespecial   #122 <Method int getTranslationYBottom()>
	//   15   22:iastore         
	//   16   23:invokevirtual   #126 <Method void ValueAnimator.setIntValues(int[])>
		valueanimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
	//   17   26:aload_2         
	//   18   27:getstatic       #132 <Field android.animation.TimeInterpolator AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR>
	//   19   30:invokevirtual   #136 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
		valueanimator.setDuration(250L);
	//   20   33:aload_2         
	//   21   34:ldc2w           #137 <Long 250L>
	//   22   37:invokevirtual   #142 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   23   40:pop             
		valueanimator.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

			public void onAnimationEnd(Animator animator)
			{
				onViewHidden(event);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BaseTransientBottomBar this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #19  <Field int val$event>
			//    4    8:invokevirtual   #28  <Method void BaseTransientBottomBar.onViewHidden(int)>
			//    5   11:return          
			}

			public void onAnimationStart(Animator animator)
			{
				contentViewCallback.animateContentOut(0, 180);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BaseTransientBottomBar this$0>
			//    2    4:invokestatic    #33  <Method ContentViewCallback BaseTransientBottomBar.access$100(BaseTransientBottomBar)>
			//    3    7:iconst_0        
			//    4    8:sipush          180
			//    5   11:invokeinterface #39  <Method void ContentViewCallback.animateContentOut(int, int)>
			//    6   16:return          
			}

			final BaseTransientBottomBar this$0;
			final int val$event;

			
			{
				this$0 = BaseTransientBottomBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BaseTransientBottomBar this$0>
				event = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #19  <Field int val$event>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void AnimatorListenerAdapter()>
			//    8   14:return          
			}
		}
)));
	//   24   41:aload_2         
	//   25   42:new             #9   <Class BaseTransientBottomBar$10>
	//   26   45:dup             
	//   27   46:aload_0         
	//   28   47:iload_1         
	//   29   48:invokespecial   #145 <Method void BaseTransientBottomBar$10(BaseTransientBottomBar, int)>
	//   30   51:invokevirtual   #149 <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
		valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

			public void onAnimationUpdate(ValueAnimator valueanimator1)
			{
				int i = ((Integer)valueanimator1.getAnimatedValue()).intValue();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #33  <Method Object ValueAnimator.getAnimatedValue()>
			//    2    4:checkcast       #35  <Class Integer>
			//    3    7:invokevirtual   #39  <Method int Integer.intValue()>
			//    4   10:istore_2        
				if(BaseTransientBottomBar.USE_OFFSET_API)
			//*   5   11:invokestatic    #43  <Method boolean BaseTransientBottomBar.access$200()>
			//*   6   14:ifeq            36
					ViewCompat.offsetTopAndBottom(((View) (view)), i - previousAnimatedIntValue);
			//    7   17:aload_0         
			//    8   18:getfield        #19  <Field BaseTransientBottomBar this$0>
			//    9   21:getfield        #47  <Field BaseTransientBottomBar$SnackbarBaseLayout BaseTransientBottomBar.view>
			//   10   24:iload_2         
			//   11   25:aload_0         
			//   12   26:getfield        #24  <Field int previousAnimatedIntValue>
			//   13   29:isub            
			//   14   30:invokestatic    #53  <Method void ViewCompat.offsetTopAndBottom(View, int)>
				else
			//*  15   33:goto            48
					view.setTranslationY(i);
			//   16   36:aload_0         
			//   17   37:getfield        #19  <Field BaseTransientBottomBar this$0>
			//   18   40:getfield        #47  <Field BaseTransientBottomBar$SnackbarBaseLayout BaseTransientBottomBar.view>
			//   19   43:iload_2         
			//   20   44:i2f             
			//   21   45:invokevirtual   #59  <Method void BaseTransientBottomBar$SnackbarBaseLayout.setTranslationY(float)>
				previousAnimatedIntValue = i;
			//   22   48:aload_0         
			//   23   49:iload_2         
			//   24   50:putfield        #24  <Field int previousAnimatedIntValue>
			//   25   53:return          
			}

			private int previousAnimatedIntValue;
			final BaseTransientBottomBar this$0;

			
			{
				this$0 = BaseTransientBottomBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BaseTransientBottomBar this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
				previousAnimatedIntValue = 0;
			//    5    9:aload_0         
			//    6   10:iconst_0        
			//    7   11:putfield        #24  <Field int previousAnimatedIntValue>
			//    8   14:return          
			}
		}
);
	//   31   54:aload_2         
	//   32   55:new             #11  <Class BaseTransientBottomBar$11>
	//   33   58:dup             
	//   34   59:aload_0         
	//   35   60:invokespecial   #152 <Method void BaseTransientBottomBar$11(BaseTransientBottomBar)>
	//   36   63:invokevirtual   #156 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		valueanimator.start();
	//   37   66:aload_2         
	//   38   67:invokevirtual   #159 <Method void ValueAnimator.start()>
	//   39   70:return          
	}

	private int getTranslationYBottom()
	{
		int j = view.getHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field BaseTransientBottomBar$SnackbarBaseLayout view>
	//    2    4:invokevirtual   #164 <Method int BaseTransientBottomBar$SnackbarBaseLayout.getHeight()>
	//    3    7:istore_2        
		android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
	//    4    8:aload_0         
	//    5    9:getfield        #161 <Field BaseTransientBottomBar$SnackbarBaseLayout view>
	//    6   12:invokevirtual   #168 <Method android.view.ViewGroup$LayoutParams BaseTransientBottomBar$SnackbarBaseLayout.getLayoutParams()>
	//    7   15:astore_3        
		int i = j;
	//    8   16:iload_2         
	//    9   17:istore_1        
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*  10   18:aload_3         
	//*  11   19:instanceof      #170 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  12   22:ifeq            35
			i = j + ((android.view.ViewGroup.MarginLayoutParams)layoutparams).bottomMargin;
	//   13   25:iload_2         
	//   14   26:aload_3         
	//   15   27:checkcast       #170 <Class android.view.ViewGroup$MarginLayoutParams>
	//   16   30:getfield        #173 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//   17   33:iadd            
	//   18   34:istore_1        
		return i;
	//   19   35:iload_1         
	//   20   36:ireturn         
	}

	void animateViewIn()
	{
		final int translationYBottom = getTranslationYBottom();
	//    0    0:aload_0         
	//    1    1:invokespecial   #122 <Method int getTranslationYBottom()>
	//    2    4:istore_1        
		if(USE_OFFSET_API)
	//*   3    5:getstatic       #83  <Field boolean USE_OFFSET_API>
	//*   4    8:ifeq            22
			ViewCompat.offsetTopAndBottom(((View) (view)), translationYBottom);
	//    5   11:aload_0         
	//    6   12:getfield        #161 <Field BaseTransientBottomBar$SnackbarBaseLayout view>
	//    7   15:iload_1         
	//    8   16:invokestatic    #180 <Method void ViewCompat.offsetTopAndBottom(View, int)>
		else
	//*   9   19:goto            31
			view.setTranslationY(translationYBottom);
	//   10   22:aload_0         
	//   11   23:getfield        #161 <Field BaseTransientBottomBar$SnackbarBaseLayout view>
	//   12   26:iload_1         
	//   13   27:i2f             
	//   14   28:invokevirtual   #184 <Method void BaseTransientBottomBar$SnackbarBaseLayout.setTranslationY(float)>
		ValueAnimator valueanimator = new ValueAnimator();
	//   15   31:new             #117 <Class ValueAnimator>
	//   16   34:dup             
	//   17   35:invokespecial   #118 <Method void ValueAnimator()>
	//   18   38:astore_2        
		valueanimator.setIntValues(new int[] {
			translationYBottom, 0
		});
	//   19   39:aload_2         
	//   20   40:iconst_2        
	//   21   41:newarray        int[]
	//   22   43:dup             
	//   23   44:iconst_0        
	//   24   45:iload_1         
	//   25   46:iastore         
	//   26   47:dup             
	//   27   48:iconst_1        
	//   28   49:iconst_0        
	//   29   50:iastore         
	//   30   51:invokevirtual   #126 <Method void ValueAnimator.setIntValues(int[])>
		valueanimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
	//   31   54:aload_2         
	//   32   55:getstatic       #132 <Field android.animation.TimeInterpolator AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR>
	//   33   58:invokevirtual   #136 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
		valueanimator.setDuration(250L);
	//   34   61:aload_2         
	//   35   62:ldc2w           #137 <Long 250L>
	//   36   65:invokevirtual   #142 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   37   68:pop             
		valueanimator.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

			public void onAnimationEnd(Animator animator)
			{
				onViewShown();
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field BaseTransientBottomBar this$0>
			//    2    4:invokevirtual   #23  <Method void BaseTransientBottomBar.onViewShown()>
			//    3    7:return          
			}

			public void onAnimationStart(Animator animator)
			{
				contentViewCallback.animateContentIn(70, 180);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field BaseTransientBottomBar this$0>
			//    2    4:invokestatic    #28  <Method ContentViewCallback BaseTransientBottomBar.access$100(BaseTransientBottomBar)>
			//    3    7:bipush          70
			//    4    9:sipush          180
			//    5   12:invokeinterface #34  <Method void ContentViewCallback.animateContentIn(int, int)>
			//    6   17:return          
			}

			final BaseTransientBottomBar this$0;

			
			{
				this$0 = BaseTransientBottomBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field BaseTransientBottomBar this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void AnimatorListenerAdapter()>
			//    5    9:return          
			}
		}
)));
	//   38   69:aload_2         
	//   39   70:new             #21  <Class BaseTransientBottomBar$8>
	//   40   73:dup             
	//   41   74:aload_0         
	//   42   75:invokespecial   #185 <Method void BaseTransientBottomBar$8(BaseTransientBottomBar)>
	//   43   78:invokevirtual   #149 <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
		valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

			public void onAnimationUpdate(ValueAnimator valueanimator1)
			{
				int i = ((Integer)valueanimator1.getAnimatedValue()).intValue();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #35  <Method Object ValueAnimator.getAnimatedValue()>
			//    2    4:checkcast       #37  <Class Integer>
			//    3    7:invokevirtual   #41  <Method int Integer.intValue()>
			//    4   10:istore_2        
				if(BaseTransientBottomBar.USE_OFFSET_API)
			//*   5   11:invokestatic    #45  <Method boolean BaseTransientBottomBar.access$200()>
			//*   6   14:ifeq            36
					ViewCompat.offsetTopAndBottom(((View) (view)), i - previousAnimatedIntValue);
			//    7   17:aload_0         
			//    8   18:getfield        #20  <Field BaseTransientBottomBar this$0>
			//    9   21:getfield        #49  <Field BaseTransientBottomBar$SnackbarBaseLayout BaseTransientBottomBar.view>
			//   10   24:iload_2         
			//   11   25:aload_0         
			//   12   26:getfield        #26  <Field int previousAnimatedIntValue>
			//   13   29:isub            
			//   14   30:invokestatic    #55  <Method void ViewCompat.offsetTopAndBottom(View, int)>
				else
			//*  15   33:goto            48
					view.setTranslationY(i);
			//   16   36:aload_0         
			//   17   37:getfield        #20  <Field BaseTransientBottomBar this$0>
			//   18   40:getfield        #49  <Field BaseTransientBottomBar$SnackbarBaseLayout BaseTransientBottomBar.view>
			//   19   43:iload_2         
			//   20   44:i2f             
			//   21   45:invokevirtual   #61  <Method void BaseTransientBottomBar$SnackbarBaseLayout.setTranslationY(float)>
				previousAnimatedIntValue = i;
			//   22   48:aload_0         
			//   23   49:iload_2         
			//   24   50:putfield        #26  <Field int previousAnimatedIntValue>
			//   25   53:return          
			}

			private int previousAnimatedIntValue;
			final BaseTransientBottomBar this$0;
			final int val$translationYBottom;

			
			{
				this$0 = BaseTransientBottomBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field BaseTransientBottomBar this$0>
				translationYBottom = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #22  <Field int val$translationYBottom>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
				previousAnimatedIntValue = translationYBottom;
			//    8   14:aload_0         
			//    9   15:aload_0         
			//   10   16:getfield        #22  <Field int val$translationYBottom>
			//   11   19:putfield        #26  <Field int previousAnimatedIntValue>
			//   12   22:return          
			}
		}
);
	//   44   81:aload_2         
	//   45   82:new             #23  <Class BaseTransientBottomBar$9>
	//   46   85:dup             
	//   47   86:aload_0         
	//   48   87:iload_1         
	//   49   88:invokespecial   #186 <Method void BaseTransientBottomBar$9(BaseTransientBottomBar, int)>
	//   50   91:invokevirtual   #156 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		valueanimator.start();
	//   51   94:aload_2         
	//   52   95:invokevirtual   #159 <Method void ValueAnimator.start()>
	//   53   98:return          
	}

	protected void dispatchDismiss(int i)
	{
		SnackbarManager.getInstance().dismiss(managerCallback, i);
	//    0    0:invokestatic    #193 <Method SnackbarManager SnackbarManager.getInstance()>
	//    1    3:aload_0         
	//    2    4:getfield        #195 <Field SnackbarManager$Callback managerCallback>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #199 <Method void SnackbarManager.dismiss(SnackbarManager$Callback, int)>
	//    5   11:return          
	}

	protected SwipeDismissBehavior getNewBehavior()
	{
		return ((SwipeDismissBehavior) (new Behavior()));
	//    0    0:new             #31  <Class BaseTransientBottomBar$Behavior>
	//    1    3:dup             
	//    2    4:invokespecial   #202 <Method void BaseTransientBottomBar$Behavior()>
	//    3    7:areturn         
	}

	final void hideView(int i)
	{
		if(shouldAnimate() && view.getVisibility() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #208 <Method boolean shouldAnimate()>
	//*   2    4:ifeq            23
	//*   3    7:aload_0         
	//*   4    8:getfield        #161 <Field BaseTransientBottomBar$SnackbarBaseLayout view>
	//*   5   11:invokevirtual   #211 <Method int BaseTransientBottomBar$SnackbarBaseLayout.getVisibility()>
	//*   6   14:ifne            23
		{
			animateViewOut(i);
	//    7   17:aload_0         
	//    8   18:iload_1         
	//    9   19:invokespecial   #213 <Method void animateViewOut(int)>
			return;
	//   10   22:return          
		} else
		{
			onViewHidden(i);
	//   11   23:aload_0         
	//   12   24:iload_1         
	//   13   25:invokevirtual   #216 <Method void onViewHidden(int)>
			return;
	//   14   28:return          
		}
	}

	public boolean isShownOrQueued()
	{
		return SnackbarManager.getInstance().isCurrentOrNext(managerCallback);
	//    0    0:invokestatic    #193 <Method SnackbarManager SnackbarManager.getInstance()>
	//    1    3:aload_0         
	//    2    4:getfield        #195 <Field SnackbarManager$Callback managerCallback>
	//    3    7:invokevirtual   #221 <Method boolean SnackbarManager.isCurrentOrNext(SnackbarManager$Callback)>
	//    4   10:ireturn         
	}

	void onViewHidden(int i)
	{
		SnackbarManager.getInstance().onDismissed(managerCallback);
	//    0    0:invokestatic    #193 <Method SnackbarManager SnackbarManager.getInstance()>
	//    1    3:aload_0         
	//    2    4:getfield        #195 <Field SnackbarManager$Callback managerCallback>
	//    3    7:invokevirtual   #225 <Method void SnackbarManager.onDismissed(SnackbarManager$Callback)>
		Object obj = ((Object) (callbacks));
	//    4   10:aload_0         
	//    5   11:getfield        #227 <Field List callbacks>
	//    6   14:astore_3        
		if(obj != null)
	//*   7   15:aload_3         
	//*   8   16:ifnull          57
		{
			for(int j = ((List) (obj)).size() - 1; j >= 0; j--)
	//*   9   19:aload_3         
	//*  10   20:invokeinterface #232 <Method int List.size()>
	//*  11   25:iconst_1        
	//*  12   26:isub            
	//*  13   27:istore_2        
	//*  14   28:iload_2         
	//*  15   29:iflt            57
				((BaseCallback)callbacks.get(j)).onDismissed(((Object) (this)), i);
	//   16   32:aload_0         
	//   17   33:getfield        #227 <Field List callbacks>
	//   18   36:iload_2         
	//   19   37:invokeinterface #236 <Method Object List.get(int)>
	//   20   42:checkcast       #25  <Class BaseTransientBottomBar$BaseCallback>
	//   21   45:aload_0         
	//   22   46:iload_1         
	//   23   47:invokevirtual   #239 <Method void BaseTransientBottomBar$BaseCallback.onDismissed(Object, int)>

	//   24   50:iload_2         
	//   25   51:iconst_1        
	//   26   52:isub            
	//   27   53:istore_2        
		}
	//*  28   54:goto            28
		obj = ((Object) (view.getParent()));
	//   29   57:aload_0         
	//   30   58:getfield        #161 <Field BaseTransientBottomBar$SnackbarBaseLayout view>
	//   31   61:invokevirtual   #243 <Method android.view.ViewParent BaseTransientBottomBar$SnackbarBaseLayout.getParent()>
	//   32   64:astore_3        
		if(obj instanceof ViewGroup)
	//*  33   65:aload_3         
	//*  34   66:instanceof      #245 <Class ViewGroup>
	//*  35   69:ifeq            83
			((ViewGroup)obj).removeView(((View) (view)));
	//   36   72:aload_3         
	//   37   73:checkcast       #245 <Class ViewGroup>
	//   38   76:aload_0         
	//   39   77:getfield        #161 <Field BaseTransientBottomBar$SnackbarBaseLayout view>
	//   40   80:invokevirtual   #249 <Method void ViewGroup.removeView(View)>
	//   41   83:return          
	}

	void onViewShown()
	{
		SnackbarManager.getInstance().onShown(managerCallback);
	//    0    0:invokestatic    #193 <Method SnackbarManager SnackbarManager.getInstance()>
	//    1    3:aload_0         
	//    2    4:getfield        #195 <Field SnackbarManager$Callback managerCallback>
	//    3    7:invokevirtual   #253 <Method void SnackbarManager.onShown(SnackbarManager$Callback)>
		List list = callbacks;
	//    4   10:aload_0         
	//    5   11:getfield        #227 <Field List callbacks>
	//    6   14:astore_2        
		if(list != null)
	//*   7   15:aload_2         
	//*   8   16:ifnull          56
		{
			for(int i = list.size() - 1; i >= 0; i--)
	//*   9   19:aload_2         
	//*  10   20:invokeinterface #232 <Method int List.size()>
	//*  11   25:iconst_1        
	//*  12   26:isub            
	//*  13   27:istore_1        
	//*  14   28:iload_1         
	//*  15   29:iflt            56
				((BaseCallback)callbacks.get(i)).onShown(((Object) (this)));
	//   16   32:aload_0         
	//   17   33:getfield        #227 <Field List callbacks>
	//   18   36:iload_1         
	//   19   37:invokeinterface #236 <Method Object List.get(int)>
	//   20   42:checkcast       #25  <Class BaseTransientBottomBar$BaseCallback>
	//   21   45:aload_0         
	//   22   46:invokevirtual   #256 <Method void BaseTransientBottomBar$BaseCallback.onShown(Object)>

	//   23   49:iload_1         
	//   24   50:iconst_1        
	//   25   51:isub            
	//   26   52:istore_1        
		}
	//*  27   53:goto            28
	//   28   56:return          
	}

	boolean shouldAnimate()
	{
		List list = accessibilityManager.getEnabledAccessibilityServiceList(1);
	//    0    0:aload_0         
	//    1    1:getfield        #258 <Field AccessibilityManager accessibilityManager>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #264 <Method List AccessibilityManager.getEnabledAccessibilityServiceList(int)>
	//    4    8:astore_1        
		return list != null && list.isEmpty();
	//    5    9:aload_1         
	//    6   10:ifnull          24
	//    7   13:aload_1         
	//    8   14:invokeinterface #267 <Method boolean List.isEmpty()>
	//    9   19:ifeq            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	final void showView()
	{
		if(view.getParent() == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #161 <Field BaseTransientBottomBar$SnackbarBaseLayout view>
	//*   2    4:invokevirtual   #243 <Method android.view.ViewParent BaseTransientBottomBar$SnackbarBaseLayout.getParent()>
	//*   3    7:ifnonnull       95
		{
			Object obj = ((Object) (view.getLayoutParams()));
	//    4   10:aload_0         
	//    5   11:getfield        #161 <Field BaseTransientBottomBar$SnackbarBaseLayout view>
	//    6   14:invokevirtual   #168 <Method android.view.ViewGroup$LayoutParams BaseTransientBottomBar$SnackbarBaseLayout.getLayoutParams()>
	//    7   17:astore_1        
			if(obj instanceof CoordinatorLayout.LayoutParams)
	//*   8   18:aload_1         
	//*   9   19:instanceof      #270 <Class CoordinatorLayout$LayoutParams>
	//*  10   22:ifeq            84
			{
				CoordinatorLayout.LayoutParams layoutparams = (CoordinatorLayout.LayoutParams)obj;
	//   11   25:aload_1         
	//   12   26:checkcast       #270 <Class CoordinatorLayout$LayoutParams>
	//   13   29:astore_3        
				Behavior behavior1 = behavior;
	//   14   30:aload_0         
	//   15   31:getfield        #272 <Field BaseTransientBottomBar$Behavior behavior>
	//   16   34:astore_2        
				obj = ((Object) (behavior1));
	//   17   35:aload_2         
	//   18   36:astore_1        
				if(behavior1 == null)
	//*  19   37:aload_2         
	//*  20   38:ifnonnull       46
					obj = ((Object) (getNewBehavior()));
	//   21   41:aload_0         
	//   22   42:invokevirtual   #274 <Method SwipeDismissBehavior getNewBehavior()>
	//   23   45:astore_1        
				if(obj instanceof Behavior)
	//*  24   46:aload_1         
	//*  25   47:instanceof      #31  <Class BaseTransientBottomBar$Behavior>
	//*  26   50:ifeq            61
					((Behavior)obj).setBaseTransientBottomBar(this);
	//   27   53:aload_1         
	//   28   54:checkcast       #31  <Class BaseTransientBottomBar$Behavior>
	//   29   57:aload_0         
	//   30   58:invokestatic    #278 <Method void BaseTransientBottomBar$Behavior.access$000(BaseTransientBottomBar$Behavior, BaseTransientBottomBar)>
				((SwipeDismissBehavior) (obj)).setListener(new SwipeDismissBehavior.OnDismissListener() {

					public void onDismiss(View view1)
					{
						view1.setVisibility(8);
					//    0    0:aload_1         
					//    1    1:bipush          8
					//    2    3:invokevirtual   #28  <Method void View.setVisibility(int)>
						dispatchDismiss(0);
					//    3    6:aload_0         
					//    4    7:getfield        #17  <Field BaseTransientBottomBar this$0>
					//    5   10:iconst_0        
					//    6   11:invokevirtual   #31  <Method void BaseTransientBottomBar.dispatchDismiss(int)>
					//    7   14:return          
					}

					public void onDragStateChanged(int i)
					{
						switch(i)
					//*   0    0:iload_1         
						{
					//*   1    1:tableswitch     0 2: default 28
					//					               0 43
					//					               1 29
					//					               2 29
						default:
							return;
					//    2   28:return          

						case 1: // '\001'
						case 2: // '\002'
							SnackbarManager.getInstance().pauseTimeout(managerCallback);
					//    3   29:invokestatic    #38  <Method SnackbarManager SnackbarManager.getInstance()>
					//    4   32:aload_0         
					//    5   33:getfield        #17  <Field BaseTransientBottomBar this$0>
					//    6   36:getfield        #42  <Field SnackbarManager$Callback BaseTransientBottomBar.managerCallback>
					//    7   39:invokevirtual   #46  <Method void SnackbarManager.pauseTimeout(SnackbarManager$Callback)>
							return;
					//    8   42:return          

						case 0: // '\0'
							SnackbarManager.getInstance().restoreTimeoutIfPaused(managerCallback);
					//    9   43:invokestatic    #38  <Method SnackbarManager SnackbarManager.getInstance()>
					//   10   46:aload_0         
					//   11   47:getfield        #17  <Field BaseTransientBottomBar this$0>
					//   12   50:getfield        #42  <Field SnackbarManager$Callback BaseTransientBottomBar.managerCallback>
					//   13   53:invokevirtual   #49  <Method void SnackbarManager.restoreTimeoutIfPaused(SnackbarManager$Callback)>
							return;
					//   14   56:return          
						}
					}

					final BaseTransientBottomBar this$0;

			
			{
				this$0 = BaseTransientBottomBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BaseTransientBottomBar this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
);
	//   31   61:aload_1         
	//   32   62:new             #13  <Class BaseTransientBottomBar$5>
	//   33   65:dup             
	//   34   66:aload_0         
	//   35   67:invokespecial   #279 <Method void BaseTransientBottomBar$5(BaseTransientBottomBar)>
	//   36   70:invokevirtual   #285 <Method void SwipeDismissBehavior.setListener(SwipeDismissBehavior$OnDismissListener)>
				layoutparams.setBehavior(((CoordinatorLayout.Behavior) (obj)));
	//   37   73:aload_3         
	//   38   74:aload_1         
	//   39   75:invokevirtual   #289 <Method void CoordinatorLayout$LayoutParams.setBehavior(CoordinatorLayout$Behavior)>
				layoutparams.insetEdge = 80;
	//   40   78:aload_3         
	//   41   79:bipush          80
	//   42   81:putfield        #292 <Field int CoordinatorLayout$LayoutParams.insetEdge>
			}
			targetParent.addView(((View) (view)));
	//   43   84:aload_0         
	//   44   85:getfield        #294 <Field ViewGroup targetParent>
	//   45   88:aload_0         
	//   46   89:getfield        #161 <Field BaseTransientBottomBar$SnackbarBaseLayout view>
	//   47   92:invokevirtual   #297 <Method void ViewGroup.addView(View)>
		}
		view.setOnAttachStateChangeListener(new OnAttachStateChangeListener() {

			public void onViewAttachedToWindow(View view1)
			{
			//    0    0:return          
			}

			public void onViewDetachedFromWindow(View view1)
			{
				if(isShownOrQueued())
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field BaseTransientBottomBar this$0>
			//*   2    4:invokevirtual   #29  <Method boolean BaseTransientBottomBar.isShownOrQueued()>
			//*   3    7:ifeq            25
					BaseTransientBottomBar.handler.post(new Runnable() {

						public void run()
						{
							onViewHidden(3);
						//    0    0:aload_0         
						//    1    1:getfield        #17  <Field BaseTransientBottomBar$6 this$1>
						//    2    4:getfield        #26  <Field BaseTransientBottomBar BaseTransientBottomBar$6.this$0>
						//    3    7:iconst_3        
						//    4    8:invokevirtual   #32  <Method void BaseTransientBottomBar.onViewHidden(int)>
						//    5   11:return          
						}

						final _cls6 this$1;

			
			{
				this$1 = _cls6.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BaseTransientBottomBar$6 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
					}
);
			//    4   10:getstatic       #33  <Field Handler BaseTransientBottomBar.handler>
			//    5   13:new             #13  <Class BaseTransientBottomBar$6$1>
			//    6   16:dup             
			//    7   17:aload_0         
			//    8   18:invokespecial   #36  <Method void BaseTransientBottomBar$6$1(BaseTransientBottomBar$6)>
			//    9   21:invokevirtual   #42  <Method boolean Handler.post(Runnable)>
			//   10   24:pop             
			//   11   25:return          
			}

			final BaseTransientBottomBar this$0;

			
			{
				this$0 = BaseTransientBottomBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BaseTransientBottomBar this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   48   95:aload_0         
	//   49   96:getfield        #161 <Field BaseTransientBottomBar$SnackbarBaseLayout view>
	//   50   99:new             #15  <Class BaseTransientBottomBar$6>
	//   51  102:dup             
	//   52  103:aload_0         
	//   53  104:invokespecial   #298 <Method void BaseTransientBottomBar$6(BaseTransientBottomBar)>
	//   54  107:invokevirtual   #302 <Method void BaseTransientBottomBar$SnackbarBaseLayout.setOnAttachStateChangeListener(BaseTransientBottomBar$OnAttachStateChangeListener)>
		if(ViewCompat.isLaidOut(((View) (view))))
	//*  55  110:aload_0         
	//*  56  111:getfield        #161 <Field BaseTransientBottomBar$SnackbarBaseLayout view>
	//*  57  114:invokestatic    #306 <Method boolean ViewCompat.isLaidOut(View)>
	//*  58  117:ifeq            137
		{
			if(shouldAnimate())
	//*  59  120:aload_0         
	//*  60  121:invokevirtual   #208 <Method boolean shouldAnimate()>
	//*  61  124:ifeq            132
			{
				animateViewIn();
	//   62  127:aload_0         
	//   63  128:invokevirtual   #308 <Method void animateViewIn()>
				return;
	//   64  131:return          
			} else
			{
				onViewShown();
	//   65  132:aload_0         
	//   66  133:invokevirtual   #310 <Method void onViewShown()>
				return;
	//   67  136:return          
			}
		} else
		{
			view.setOnLayoutChangeListener(new OnLayoutChangeListener() {

				public void onLayoutChange(View view1, int i, int j, int k, int l)
				{
					view.setOnLayoutChangeListener(((OnLayoutChangeListener) (null)));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field BaseTransientBottomBar this$0>
				//    2    4:getfield        #26  <Field BaseTransientBottomBar$SnackbarBaseLayout BaseTransientBottomBar.view>
				//    3    7:aconst_null     
				//    4    8:invokevirtual   #32  <Method void BaseTransientBottomBar$SnackbarBaseLayout.setOnLayoutChangeListener(BaseTransientBottomBar$OnLayoutChangeListener)>
					if(shouldAnimate())
				//*   5   11:aload_0         
				//*   6   12:getfield        #17  <Field BaseTransientBottomBar this$0>
				//*   7   15:invokevirtual   #36  <Method boolean BaseTransientBottomBar.shouldAnimate()>
				//*   8   18:ifeq            29
					{
						animateViewIn();
				//    9   21:aload_0         
				//   10   22:getfield        #17  <Field BaseTransientBottomBar this$0>
				//   11   25:invokevirtual   #39  <Method void BaseTransientBottomBar.animateViewIn()>
						return;
				//   12   28:return          
					} else
					{
						onViewShown();
				//   13   29:aload_0         
				//   14   30:getfield        #17  <Field BaseTransientBottomBar this$0>
				//   15   33:invokevirtual   #42  <Method void BaseTransientBottomBar.onViewShown()>
						return;
				//   16   36:return          
					}
				}

				final BaseTransientBottomBar this$0;

			
			{
				this$0 = BaseTransientBottomBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BaseTransientBottomBar this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   68  137:aload_0         
	//   69  138:getfield        #161 <Field BaseTransientBottomBar$SnackbarBaseLayout view>
	//   70  141:new             #19  <Class BaseTransientBottomBar$7>
	//   71  144:dup             
	//   72  145:aload_0         
	//   73  146:invokespecial   #311 <Method void BaseTransientBottomBar$7(BaseTransientBottomBar)>
	//   74  149:invokevirtual   #315 <Method void BaseTransientBottomBar$SnackbarBaseLayout.setOnLayoutChangeListener(BaseTransientBottomBar$OnLayoutChangeListener)>
			return;
	//   75  152:return          
		}
	}

	private static final int SNACKBAR_STYLE_ATTR[];
	private static final boolean USE_OFFSET_API;
	static final Handler handler = new Handler(Looper.getMainLooper(), new android.os.Handler.Callback() {

		public boolean handleMessage(Message message)
		{
			switch(message.what)
		//*   0    0:aload_1         
		//*   1    1:getfield        #21  <Field int Message.what>
			{
		//*   2    4:tableswitch     0 1: default 28
		//		               0 46
		//		               1 30
			default:
				return false;
		//    3   28:iconst_0        
		//    4   29:ireturn         

			case 1: // '\001'
				((BaseTransientBottomBar)message.obj).hideView(message.arg1);
		//    5   30:aload_1         
		//    6   31:getfield        #25  <Field Object Message.obj>
		//    7   34:checkcast       #8   <Class BaseTransientBottomBar>
		//    8   37:aload_1         
		//    9   38:getfield        #28  <Field int Message.arg1>
		//   10   41:invokevirtual   #32  <Method void BaseTransientBottomBar.hideView(int)>
				return true;
		//   11   44:iconst_1        
		//   12   45:ireturn         

			case 0: // '\0'
				((BaseTransientBottomBar)message.obj).showView();
		//   13   46:aload_1         
		//   14   47:getfield        #25  <Field Object Message.obj>
		//   15   50:checkcast       #8   <Class BaseTransientBottomBar>
		//   16   53:invokevirtual   #35  <Method void BaseTransientBottomBar.showView()>
				return true;
		//   17   56:iconst_1        
		//   18   57:ireturn         
			}
		}

	}
);
	private final AccessibilityManager accessibilityManager;
	private Behavior behavior;
	private List callbacks;
	private final android.support.design.snackbar.ContentViewCallback contentViewCallback;
	final SnackbarManager.Callback managerCallback;
	private final ViewGroup targetParent;
	protected final SnackbarBaseLayout view;

	static 
	{
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 16 && android.os.Build.VERSION.SDK_INT <= 19)
	//*   0    0:getstatic       #81  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          21
	//*   3    8:getstatic       #81  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   11:bipush          19
	//*   5   13:icmpgt          21
			flag = true;
	//    6   16:iconst_1        
	//    7   17:istore_0        
		else
	//*   8   18:goto            23
			flag = false;
	//    9   21:iconst_0        
	//   10   22:istore_0        
		USE_OFFSET_API = flag;
	//   11   23:iload_0         
	//   12   24:putstatic       #83  <Field boolean USE_OFFSET_API>
		SNACKBAR_STYLE_ATTR = (new int[] {
			android.support.design.R.attr.snackbarStyle
		});
	//   13   27:iconst_1        
	//   14   28:newarray        int[]
	//   15   30:dup             
	//   16   31:iconst_0        
	//   17   32:getstatic       #88  <Field int android.support.design.R$attr.snackbarStyle>
	//   18   35:iastore         
	//   19   36:putstatic       #90  <Field int[] SNACKBAR_STYLE_ATTR>
	//   20   39:new             #92  <Class Handler>
	//   21   42:dup             
	//   22   43:invokestatic    #98  <Method Looper Looper.getMainLooper()>
	//   23   46:new             #7   <Class BaseTransientBottomBar$1>
	//   24   49:dup             
	//   25   50:invokespecial   #101 <Method void BaseTransientBottomBar$1()>
	//   26   53:invokespecial   #104 <Method void Handler(Looper, android.os.Handler$Callback)>
	//   27   56:putstatic       #106 <Field Handler handler>
	//*  28   59:return          
	}


/*
	static ContentViewCallback access$100(BaseTransientBottomBar basetransientbottombar)
	{
		return basetransientbottombar.contentViewCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field ContentViewCallback contentViewCallback>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$200()
	{
		return USE_OFFSET_API;
	//    0    0:getstatic       #83  <Field boolean USE_OFFSET_API>
	//    1    3:ireturn         
	}

*/

	// Unreferenced inner class android/support/design/widget/BaseTransientBottomBar$SnackbarBaseLayout$1

/* anonymous class */
	class SnackbarBaseLayout._cls1
		implements android.support.v4.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
	{

		public void onTouchExplorationStateChanged(boolean flag)
		{
			setClickableOrFocusableBasedOnAccessibility(flag);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field BaseTransientBottomBar$SnackbarBaseLayout this$0>
		//    2    4:iload_1         
		//    3    5:invokestatic    #29  <Method void BaseTransientBottomBar$SnackbarBaseLayout.access$300(BaseTransientBottomBar$SnackbarBaseLayout, boolean)>
		//    4    8:return          
		}

		final SnackbarBaseLayout this$0;

			
			{
				this$0 = SnackbarBaseLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BaseTransientBottomBar$SnackbarBaseLayout this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
	}

}
