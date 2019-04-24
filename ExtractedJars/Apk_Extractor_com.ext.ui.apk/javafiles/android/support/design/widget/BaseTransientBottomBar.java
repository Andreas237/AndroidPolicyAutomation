// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.*;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.*;
import android.support.v4.view.*;
import android.util.AttributeSet;
import android.view.*;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//			ThemeUtils, AnimationUtils, SnackbarManager, SwipeDismissBehavior, 
//			CoordinatorLayout

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

		public static final int DISMISS_EVENT_ACTION = 1;
		public static final int DISMISS_EVENT_CONSECUTIVE = 4;
		public static final int DISMISS_EVENT_MANUAL = 3;
		public static final int DISMISS_EVENT_SWIPE = 0;
		public static final int DISMISS_EVENT_TIMEOUT = 2;

		public BaseCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface BaseCallback.DismissEvent
		extends Annotation
	{
	}

	final class Behavior extends SwipeDismissBehavior
	{

		public boolean canSwipeDismissView(View view)
		{
			return view instanceof SnackbarBaseLayout;
		//    0    0:aload_1         
		//    1    1:instanceof      #22  <Class BaseTransientBottomBar$SnackbarBaseLayout>
		//    2    4:ireturn         
		}

		public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorlayout, SnackbarBaseLayout snackbarbaselayout, MotionEvent motionevent)
		{
			motionevent.getActionMasked();
		//    0    0:aload_3         
		//    1    1:invokevirtual   #30  <Method int MotionEvent.getActionMasked()>
			JVM INSTR tableswitch 0 3: default 36
		//		               0 44
		//		               1 78
		//		               2 36
		//		               3 78;
		//    2    4:tableswitch     0 3: default 36
		//		               0 44
		//		               1 78
		//		               2 36
		//		               3 78
			   goto _L1 _L2 _L3 _L1 _L3
_L1:
			return super.onInterceptTouchEvent(coordinatorlayout, ((View) (snackbarbaselayout)), motionevent);
		//    3   36:aload_0         
		//    4   37:aload_1         
		//    5   38:aload_2         
		//    6   39:aload_3         
		//    7   40:invokespecial   #33  <Method boolean SwipeDismissBehavior.onInterceptTouchEvent(CoordinatorLayout, View, MotionEvent)>
		//    8   43:ireturn         
_L2:
			if(coordinatorlayout.isPointInChildBounds(((View) (snackbarbaselayout)), (int)motionevent.getX(), (int)motionevent.getY()))
		//*   9   44:aload_1         
		//*  10   45:aload_2         
		//*  11   46:aload_3         
		//*  12   47:invokevirtual   #37  <Method float MotionEvent.getX()>
		//*  13   50:f2i             
		//*  14   51:aload_3         
		//*  15   52:invokevirtual   #40  <Method float MotionEvent.getY()>
		//*  16   55:f2i             
		//*  17   56:invokevirtual   #46  <Method boolean CoordinatorLayout.isPointInChildBounds(View, int, int)>
		//*  18   59:ifeq            36
				SnackbarManager.getInstance().pauseTimeout(mManagerCallback);
		//   19   62:invokestatic    #52  <Method SnackbarManager SnackbarManager.getInstance()>
		//   20   65:aload_0         
		//   21   66:getfield        #14  <Field BaseTransientBottomBar this$0>
		//   22   69:getfield        #56  <Field SnackbarManager$Callback BaseTransientBottomBar.mManagerCallback>
		//   23   72:invokevirtual   #60  <Method void SnackbarManager.pauseTimeout(SnackbarManager$Callback)>
			continue; /* Loop/switch isn't completed */
		//   24   75:goto            36
_L3:
			SnackbarManager.getInstance().restoreTimeoutIfPaused(mManagerCallback);
		//   25   78:invokestatic    #52  <Method SnackbarManager SnackbarManager.getInstance()>
		//   26   81:aload_0         
		//   27   82:getfield        #14  <Field BaseTransientBottomBar this$0>
		//   28   85:getfield        #56  <Field SnackbarManager$Callback BaseTransientBottomBar.mManagerCallback>
		//   29   88:invokevirtual   #63  <Method void SnackbarManager.restoreTimeoutIfPaused(SnackbarManager$Callback)>
			if(true) goto _L1; else goto _L4
		//   30   91:goto            36
_L4:
		}

		public volatile boolean onInterceptTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
		{
			return onInterceptTouchEvent(coordinatorlayout, (SnackbarBaseLayout)view, motionevent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #22  <Class BaseTransientBottomBar$SnackbarBaseLayout>
		//    4    6:aload_3         
		//    5    7:invokevirtual   #65  <Method boolean onInterceptTouchEvent(CoordinatorLayout, BaseTransientBottomBar$SnackbarBaseLayout, MotionEvent)>
		//    6   10:ireturn         
		}

		final BaseTransientBottomBar this$0;

		Behavior()
		{
			this$0 = BaseTransientBottomBar.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field BaseTransientBottomBar this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #17  <Method void SwipeDismissBehavior()>
		//    5    9:return          
		}
	}

	public static interface ContentViewCallback
	{

		public abstract void animateContentIn(int i, int j);

		public abstract void animateContentOut(int i, int j);
	}

	public static interface Duration
		extends Annotation
	{
	}

	static interface OnAttachStateChangeListener
	{

		public abstract void onViewAttachedToWindow(View view);

		public abstract void onViewDetachedFromWindow(View view);
	}

	static interface OnLayoutChangeListener
	{

		public abstract void onLayoutChange(View view, int i, int j, int k, int l);
	}

	static class SnackbarBaseLayout extends FrameLayout
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
				mOnAttachStateChangeListener.onViewAttachedToWindow(((View) (this)));
		//    5   11:aload_0         
		//    6   12:getfield        #67  <Field BaseTransientBottomBar$OnAttachStateChangeListener mOnAttachStateChangeListener>
		//    7   15:aload_0         
		//    8   16:invokeinterface #73  <Method void BaseTransientBottomBar$OnAttachStateChangeListener.onViewAttachedToWindow(View)>
			ViewCompat.requestApplyInsets(((View) (this)));
		//    9   21:aload_0         
		//   10   22:invokestatic    #76  <Method void ViewCompat.requestApplyInsets(View)>
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
				mOnAttachStateChangeListener.onViewDetachedFromWindow(((View) (this)));
		//    5   11:aload_0         
		//    6   12:getfield        #67  <Field BaseTransientBottomBar$OnAttachStateChangeListener mOnAttachStateChangeListener>
		//    7   15:aload_0         
		//    8   16:invokeinterface #82  <Method void BaseTransientBottomBar$OnAttachStateChangeListener.onViewDetachedFromWindow(View)>
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
				mOnLayoutChangeListener.onLayoutChange(((View) (this)), i, j, k, l);
		//   10   18:aload_0         
		//   11   19:getfield        #88  <Field BaseTransientBottomBar$OnLayoutChangeListener mOnLayoutChangeListener>
		//   12   22:aload_0         
		//   13   23:iload_2         
		//   14   24:iload_3         
		//   15   25:iload           4
		//   16   27:iload           5
		//   17   29:invokeinterface #94  <Method void BaseTransientBottomBar$OnLayoutChangeListener.onLayoutChange(View, int, int, int, int)>
		//   18   34:return          
		}

		void setOnAttachStateChangeListener(OnAttachStateChangeListener onattachstatechangelistener)
		{
			mOnAttachStateChangeListener = onattachstatechangelistener;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #67  <Field BaseTransientBottomBar$OnAttachStateChangeListener mOnAttachStateChangeListener>
		//    3    5:return          
		}

		void setOnLayoutChangeListener(OnLayoutChangeListener onlayoutchangelistener)
		{
			mOnLayoutChangeListener = onlayoutchangelistener;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #88  <Field BaseTransientBottomBar$OnLayoutChangeListener mOnLayoutChangeListener>
		//    3    5:return          
		}

		private OnAttachStateChangeListener mOnAttachStateChangeListener;
		private OnLayoutChangeListener mOnLayoutChangeListener;

		SnackbarBaseLayout(Context context)
		{
			this(context, ((AttributeSet) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokespecial   #20  <Method void BaseTransientBottomBar$SnackbarBaseLayout(Context, AttributeSet)>
		//    4    6:return          
		}

		SnackbarBaseLayout(Context context, AttributeSet attributeset)
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
				ViewCompat.setElevation(((View) (this)), ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.SnackbarLayout_elevation, 0));
		//   13   25:aload_0         
		//   14   26:aload_1         
		//   15   27:getstatic       #38  <Field int android.support.design.R$styleable.SnackbarLayout_elevation>
		//   16   30:iconst_0        
		//   17   31:invokevirtual   #48  <Method int TypedArray.getDimensionPixelSize(int, int)>
		//   18   34:i2f             
		//   19   35:invokestatic    #54  <Method void ViewCompat.setElevation(View, float)>
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


	protected BaseTransientBottomBar(ViewGroup viewgroup, View view, ContentViewCallback contentviewcallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #118 <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #17  <Class BaseTransientBottomBar$3>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #121 <Method void BaseTransientBottomBar$3(BaseTransientBottomBar)>
	//    7   13:putfield        #123 <Field SnackbarManager$Callback mManagerCallback>
		if(viewgroup == null)
	//*   8   16:aload_1         
	//*   9   17:ifnonnull       30
			throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
	//   10   20:new             #125 <Class IllegalArgumentException>
	//   11   23:dup             
	//   12   24:ldc1            #127 <String "Transient bottom bar must have non-null parent">
	//   13   26:invokespecial   #130 <Method void IllegalArgumentException(String)>
	//   14   29:athrow          
		if(view == null)
	//*  15   30:aload_2         
	//*  16   31:ifnonnull       44
			throw new IllegalArgumentException("Transient bottom bar must have non-null content");
	//   17   34:new             #125 <Class IllegalArgumentException>
	//   18   37:dup             
	//   19   38:ldc1            #132 <String "Transient bottom bar must have non-null content">
	//   20   40:invokespecial   #130 <Method void IllegalArgumentException(String)>
	//   21   43:athrow          
		if(contentviewcallback == null)
	//*  22   44:aload_3         
	//*  23   45:ifnonnull       58
		{
			throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
	//   24   48:new             #125 <Class IllegalArgumentException>
	//   25   51:dup             
	//   26   52:ldc1            #134 <String "Transient bottom bar must have non-null callback">
	//   27   54:invokespecial   #130 <Method void IllegalArgumentException(String)>
	//   28   57:athrow          
		} else
		{
			mTargetParent = viewgroup;
	//   29   58:aload_0         
	//   30   59:aload_1         
	//   31   60:putfield        #136 <Field ViewGroup mTargetParent>
			mContentViewCallback = contentviewcallback;
	//   32   63:aload_0         
	//   33   64:aload_3         
	//   34   65:putfield        #138 <Field BaseTransientBottomBar$ContentViewCallback mContentViewCallback>
			mContext = viewgroup.getContext();
	//   35   68:aload_0         
	//   36   69:aload_1         
	//   37   70:invokevirtual   #144 <Method Context ViewGroup.getContext()>
	//   38   73:putfield        #146 <Field Context mContext>
			ThemeUtils.checkAppCompatTheme(mContext);
	//   39   76:aload_0         
	//   40   77:getfield        #146 <Field Context mContext>
	//   41   80:invokestatic    #152 <Method void ThemeUtils.checkAppCompatTheme(Context)>
			mView = (SnackbarBaseLayout)LayoutInflater.from(mContext).inflate(android.support.design.R.layout.design_layout_snackbar, mTargetParent, false);
	//   42   83:aload_0         
	//   43   84:aload_0         
	//   44   85:getfield        #146 <Field Context mContext>
	//   45   88:invokestatic    #158 <Method LayoutInflater LayoutInflater.from(Context)>
	//   46   91:getstatic       #163 <Field int android.support.design.R$layout.design_layout_snackbar>
	//   47   94:aload_0         
	//   48   95:getfield        #136 <Field ViewGroup mTargetParent>
	//   49   98:iconst_0        
	//   50   99:invokevirtual   #167 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   51  102:checkcast       #54  <Class BaseTransientBottomBar$SnackbarBaseLayout>
	//   52  105:putfield        #169 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
			mView.addView(view);
	//   53  108:aload_0         
	//   54  109:getfield        #169 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//   55  112:aload_2         
	//   56  113:invokevirtual   #173 <Method void BaseTransientBottomBar$SnackbarBaseLayout.addView(View)>
			ViewCompat.setAccessibilityLiveRegion(((View) (mView)), 1);
	//   57  116:aload_0         
	//   58  117:getfield        #169 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//   59  120:iconst_1        
	//   60  121:invokestatic    #179 <Method void ViewCompat.setAccessibilityLiveRegion(View, int)>
			ViewCompat.setImportantForAccessibility(((View) (mView)), 1);
	//   61  124:aload_0         
	//   62  125:getfield        #169 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//   63  128:iconst_1        
	//   64  129:invokestatic    #182 <Method void ViewCompat.setImportantForAccessibility(View, int)>
			ViewCompat.setFitsSystemWindows(((View) (mView)), true);
	//   65  132:aload_0         
	//   66  133:getfield        #169 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//   67  136:iconst_1        
	//   68  137:invokestatic    #186 <Method void ViewCompat.setFitsSystemWindows(View, boolean)>
			ViewCompat.setOnApplyWindowInsetsListener(((View) (mView)), new OnApplyWindowInsetsListener() {

				public WindowInsetsCompat onApplyWindowInsets(View view1, WindowInsetsCompat windowinsetscompat)
				{
					view1.setPadding(view1.getPaddingLeft(), view1.getPaddingTop(), view1.getPaddingRight(), windowinsetscompat.getSystemWindowInsetBottom());
				//    0    0:aload_1         
				//    1    1:aload_1         
				//    2    2:invokevirtual   #28  <Method int View.getPaddingLeft()>
				//    3    5:aload_1         
				//    4    6:invokevirtual   #31  <Method int View.getPaddingTop()>
				//    5    9:aload_1         
				//    6   10:invokevirtual   #34  <Method int View.getPaddingRight()>
				//    7   13:aload_2         
				//    8   14:invokevirtual   #39  <Method int WindowInsetsCompat.getSystemWindowInsetBottom()>
				//    9   17:invokevirtual   #43  <Method void View.setPadding(int, int, int, int)>
					return windowinsetscompat;
				//   10   20:aload_2         
				//   11   21:areturn         
				}

				final BaseTransientBottomBar this$0;

			
			{
				this$0 = BaseTransientBottomBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BaseTransientBottomBar this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   69  140:aload_0         
	//   70  141:getfield        #169 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//   71  144:new             #15  <Class BaseTransientBottomBar$2>
	//   72  147:dup             
	//   73  148:aload_0         
	//   74  149:invokespecial   #187 <Method void BaseTransientBottomBar$2(BaseTransientBottomBar)>
	//   75  152:invokestatic    #191 <Method void ViewCompat.setOnApplyWindowInsetsListener(View, OnApplyWindowInsetsListener)>
			mAccessibilityManager = (AccessibilityManager)mContext.getSystemService("accessibility");
	//   76  155:aload_0         
	//   77  156:aload_0         
	//   78  157:getfield        #146 <Field Context mContext>
	//   79  160:ldc1            #193 <String "accessibility">
	//   80  162:invokevirtual   #199 <Method Object Context.getSystemService(String)>
	//   81  165:checkcast       #201 <Class AccessibilityManager>
	//   82  168:putfield        #203 <Field AccessibilityManager mAccessibilityManager>
			return;
	//   83  171:return          
		}
	}

	private void animateViewOut(final int event)
	{
		if(android.os.Build.VERSION.SDK_INT >= 12)
	//*   0    0:getstatic       #96  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          12
	//*   2    5:icmplt          82
		{
			ValueAnimator valueanimator = new ValueAnimator();
	//    3    8:new             #212 <Class ValueAnimator>
	//    4   11:dup             
	//    5   12:invokespecial   #213 <Method void ValueAnimator()>
	//    6   15:astore_2        
			valueanimator.setIntValues(new int[] {
				0, mView.getHeight()
			});
	//    7   16:aload_2         
	//    8   17:iconst_2        
	//    9   18:newarray        int[]
	//   10   20:dup             
	//   11   21:iconst_0        
	//   12   22:iconst_0        
	//   13   23:iastore         
	//   14   24:dup             
	//   15   25:iconst_1        
	//   16   26:aload_0         
	//   17   27:getfield        #169 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//   18   30:invokevirtual   #217 <Method int BaseTransientBottomBar$SnackbarBaseLayout.getHeight()>
	//   19   33:iastore         
	//   20   34:invokevirtual   #221 <Method void ValueAnimator.setIntValues(int[])>
			valueanimator.setInterpolator(((android.animation.TimeInterpolator) (AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR)));
	//   21   37:aload_2         
	//   22   38:getstatic       #227 <Field android.view.animation.Interpolator AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR>
	//   23   41:invokevirtual   #231 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
			valueanimator.setDuration(250L);
	//   24   44:aload_2         
	//   25   45:ldc2w           #232 <Long 250L>
	//   26   48:invokevirtual   #237 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   27   51:pop             
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
					mContentViewCallback.animateContentOut(0, 180);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field BaseTransientBottomBar this$0>
				//    2    4:invokestatic    #33  <Method BaseTransientBottomBar$ContentViewCallback BaseTransientBottomBar.access$000(BaseTransientBottomBar)>
				//    3    7:iconst_0        
				//    4    8:sipush          180
				//    5   11:invokeinterface #39  <Method void BaseTransientBottomBar$ContentViewCallback.animateContentOut(int, int)>
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
	//   28   52:aload_2         
	//   29   53:new             #9   <Class BaseTransientBottomBar$10>
	//   30   56:dup             
	//   31   57:aload_0         
	//   32   58:iload_1         
	//   33   59:invokespecial   #240 <Method void BaseTransientBottomBar$10(BaseTransientBottomBar, int)>
	//   34   62:invokevirtual   #244 <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
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
				//*   5   11:invokestatic    #43  <Method boolean BaseTransientBottomBar.access$100()>
				//*   6   14:ifeq            39
						ViewCompat.offsetTopAndBottom(((View) (mView)), i - mPreviousAnimatedIntValue);
				//    7   17:aload_0         
				//    8   18:getfield        #19  <Field BaseTransientBottomBar this$0>
				//    9   21:getfield        #47  <Field BaseTransientBottomBar$SnackbarBaseLayout BaseTransientBottomBar.mView>
				//   10   24:iload_2         
				//   11   25:aload_0         
				//   12   26:getfield        #24  <Field int mPreviousAnimatedIntValue>
				//   13   29:isub            
				//   14   30:invokestatic    #53  <Method void ViewCompat.offsetTopAndBottom(View, int)>
					else
				//*  15   33:aload_0         
				//*  16   34:iload_2         
				//*  17   35:putfield        #24  <Field int mPreviousAnimatedIntValue>
				//*  18   38:return          
						mView.setTranslationY(i);
				//   19   39:aload_0         
				//   20   40:getfield        #19  <Field BaseTransientBottomBar this$0>
				//   21   43:getfield        #47  <Field BaseTransientBottomBar$SnackbarBaseLayout BaseTransientBottomBar.mView>
				//   22   46:iload_2         
				//   23   47:i2f             
				//   24   48:invokevirtual   #59  <Method void BaseTransientBottomBar$SnackbarBaseLayout.setTranslationY(float)>
					mPreviousAnimatedIntValue = i;
				//*  25   51:goto            33
				}

				private int mPreviousAnimatedIntValue;
				final BaseTransientBottomBar this$0;

			
			{
				this$0 = BaseTransientBottomBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BaseTransientBottomBar this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
				mPreviousAnimatedIntValue = 0;
			//    5    9:aload_0         
			//    6   10:iconst_0        
			//    7   11:putfield        #24  <Field int mPreviousAnimatedIntValue>
			//    8   14:return          
			}
			}
);
	//   35   65:aload_2         
	//   36   66:new             #11  <Class BaseTransientBottomBar$11>
	//   37   69:dup             
	//   38   70:aload_0         
	//   39   71:invokespecial   #245 <Method void BaseTransientBottomBar$11(BaseTransientBottomBar)>
	//   40   74:invokevirtual   #249 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
			valueanimator.start();
	//   41   77:aload_2         
	//   42   78:invokevirtual   #252 <Method void ValueAnimator.start()>
			return;
	//   43   81:return          
		} else
		{
			Animation animation = AnimationUtils.loadAnimation(mView.getContext(), android.support.design.R.anim.design_snackbar_out);
	//   44   82:aload_0         
	//   45   83:getfield        #169 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//   46   86:invokevirtual   #253 <Method Context BaseTransientBottomBar$SnackbarBaseLayout.getContext()>
	//   47   89:getstatic       #258 <Field int android.support.design.R$anim.design_snackbar_out>
	//   48   92:invokestatic    #264 <Method Animation AnimationUtils.loadAnimation(Context, int)>
	//   49   95:astore_2        
			animation.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
	//   50   96:aload_2         
	//   51   97:getstatic       #227 <Field android.view.animation.Interpolator AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR>
	//   52  100:invokevirtual   #269 <Method void Animation.setInterpolator(android.view.animation.Interpolator)>
			animation.setDuration(250L);
	//   53  103:aload_2         
	//   54  104:ldc2w           #232 <Long 250L>
	//   55  107:invokevirtual   #272 <Method void Animation.setDuration(long)>
			animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

				public void onAnimationEnd(Animation animation1)
				{
					onViewHidden(event);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field BaseTransientBottomBar this$0>
				//    2    4:aload_0         
				//    3    5:getfield        #21  <Field int val$event>
				//    4    8:invokevirtual   #30  <Method void BaseTransientBottomBar.onViewHidden(int)>
				//    5   11:return          
				}

				public void onAnimationRepeat(Animation animation1)
				{
				//    0    0:return          
				}

				public void onAnimationStart(Animation animation1)
				{
				//    0    0:return          
				}

				final BaseTransientBottomBar this$0;
				final int val$event;

			
			{
				this$0 = BaseTransientBottomBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BaseTransientBottomBar this$0>
				event = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int val$event>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   56  110:aload_2         
	//   57  111:new             #13  <Class BaseTransientBottomBar$12>
	//   58  114:dup             
	//   59  115:aload_0         
	//   60  116:iload_1         
	//   61  117:invokespecial   #273 <Method void BaseTransientBottomBar$12(BaseTransientBottomBar, int)>
	//   62  120:invokevirtual   #277 <Method void Animation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
			mView.startAnimation(animation);
	//   63  123:aload_0         
	//   64  124:getfield        #169 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//   65  127:aload_2         
	//   66  128:invokevirtual   #281 <Method void BaseTransientBottomBar$SnackbarBaseLayout.startAnimation(Animation)>
			return;
	//   67  131:return          
		}
	}

	public BaseTransientBottomBar addCallback(BaseCallback basecallback)
	{
		if(basecallback == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		if(mCallbacks == null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #285 <Field List mCallbacks>
	//*   6   10:ifnonnull       24
			mCallbacks = ((List) (new ArrayList()));
	//    7   13:aload_0         
	//    8   14:new             #287 <Class ArrayList>
	//    9   17:dup             
	//   10   18:invokespecial   #288 <Method void ArrayList()>
	//   11   21:putfield        #285 <Field List mCallbacks>
		mCallbacks.add(((Object) (basecallback)));
	//   12   24:aload_0         
	//   13   25:getfield        #285 <Field List mCallbacks>
	//   14   28:aload_1         
	//   15   29:invokeinterface #294 <Method boolean List.add(Object)>
	//   16   34:pop             
		return this;
	//   17   35:aload_0         
	//   18   36:areturn         
	}

	void animateViewIn()
	{
		if(android.os.Build.VERSION.SDK_INT >= 12)
	//*   0    0:getstatic       #96  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          12
	//*   2    5:icmplt          110
		{
			final int viewHeight = mView.getHeight();
	//    3    8:aload_0         
	//    4    9:getfield        #169 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//    5   12:invokevirtual   #217 <Method int BaseTransientBottomBar$SnackbarBaseLayout.getHeight()>
	//    6   15:istore_1        
			ValueAnimator valueanimator;
			if(USE_OFFSET_API)
	//*   7   16:getstatic       #98  <Field boolean USE_OFFSET_API>
	//*   8   19:ifeq            98
				ViewCompat.offsetTopAndBottom(((View) (mView)), viewHeight);
	//    9   22:aload_0         
	//   10   23:getfield        #169 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//   11   26:iload_1         
	//   12   27:invokestatic    #301 <Method void ViewCompat.offsetTopAndBottom(View, int)>
			else
	//*  13   30:new             #212 <Class ValueAnimator>
	//*  14   33:dup             
	//*  15   34:invokespecial   #213 <Method void ValueAnimator()>
	//*  16   37:astore_2        
	//*  17   38:aload_2         
	//*  18   39:iconst_2        
	//*  19   40:newarray        int[]
	//*  20   42:dup             
	//*  21   43:iconst_0        
	//*  22   44:iload_1         
	//*  23   45:iastore         
	//*  24   46:dup             
	//*  25   47:iconst_1        
	//*  26   48:iconst_0        
	//*  27   49:iastore         
	//*  28   50:invokevirtual   #221 <Method void ValueAnimator.setIntValues(int[])>
	//*  29   53:aload_2         
	//*  30   54:getstatic       #227 <Field android.view.animation.Interpolator AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR>
	//*  31   57:invokevirtual   #231 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//*  32   60:aload_2         
	//*  33   61:ldc2w           #232 <Long 250L>
	//*  34   64:invokevirtual   #237 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//*  35   67:pop             
	//*  36   68:aload_2         
	//*  37   69:new             #27  <Class BaseTransientBottomBar$7>
	//*  38   72:dup             
	//*  39   73:aload_0         
	//*  40   74:invokespecial   #302 <Method void BaseTransientBottomBar$7(BaseTransientBottomBar)>
	//*  41   77:invokevirtual   #244 <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
	//*  42   80:aload_2         
	//*  43   81:new             #29  <Class BaseTransientBottomBar$8>
	//*  44   84:dup             
	//*  45   85:aload_0         
	//*  46   86:iload_1         
	//*  47   87:invokespecial   #303 <Method void BaseTransientBottomBar$8(BaseTransientBottomBar, int)>
	//*  48   90:invokevirtual   #249 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
	//*  49   93:aload_2         
	//*  50   94:invokevirtual   #252 <Method void ValueAnimator.start()>
	//*  51   97:return          
				mView.setTranslationY(viewHeight);
	//   52   98:aload_0         
	//   53   99:getfield        #169 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//   54  102:iload_1         
	//   55  103:i2f             
	//   56  104:invokevirtual   #307 <Method void BaseTransientBottomBar$SnackbarBaseLayout.setTranslationY(float)>
			valueanimator = new ValueAnimator();
			valueanimator.setIntValues(new int[] {
				viewHeight, 0
			});
			valueanimator.setInterpolator(((android.animation.TimeInterpolator) (AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR)));
			valueanimator.setDuration(250L);
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
					mContentViewCallback.animateContentIn(70, 180);
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field BaseTransientBottomBar this$0>
				//    2    4:invokestatic    #28  <Method BaseTransientBottomBar$ContentViewCallback BaseTransientBottomBar.access$000(BaseTransientBottomBar)>
				//    3    7:bipush          70
				//    4    9:sipush          180
				//    5   12:invokeinterface #34  <Method void BaseTransientBottomBar$ContentViewCallback.animateContentIn(int, int)>
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
				//*   5   11:invokestatic    #45  <Method boolean BaseTransientBottomBar.access$100()>
				//*   6   14:ifeq            39
						ViewCompat.offsetTopAndBottom(((View) (mView)), i - mPreviousAnimatedIntValue);
				//    7   17:aload_0         
				//    8   18:getfield        #20  <Field BaseTransientBottomBar this$0>
				//    9   21:getfield        #49  <Field BaseTransientBottomBar$SnackbarBaseLayout BaseTransientBottomBar.mView>
				//   10   24:iload_2         
				//   11   25:aload_0         
				//   12   26:getfield        #26  <Field int mPreviousAnimatedIntValue>
				//   13   29:isub            
				//   14   30:invokestatic    #55  <Method void ViewCompat.offsetTopAndBottom(View, int)>
					else
				//*  15   33:aload_0         
				//*  16   34:iload_2         
				//*  17   35:putfield        #26  <Field int mPreviousAnimatedIntValue>
				//*  18   38:return          
						mView.setTranslationY(i);
				//   19   39:aload_0         
				//   20   40:getfield        #20  <Field BaseTransientBottomBar this$0>
				//   21   43:getfield        #49  <Field BaseTransientBottomBar$SnackbarBaseLayout BaseTransientBottomBar.mView>
				//   22   46:iload_2         
				//   23   47:i2f             
				//   24   48:invokevirtual   #61  <Method void BaseTransientBottomBar$SnackbarBaseLayout.setTranslationY(float)>
					mPreviousAnimatedIntValue = i;
				//*  25   51:goto            33
				}

				private int mPreviousAnimatedIntValue;
				final BaseTransientBottomBar this$0;
				final int val$viewHeight;

			
			{
				this$0 = BaseTransientBottomBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field BaseTransientBottomBar this$0>
				viewHeight = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #22  <Field int val$viewHeight>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
				mPreviousAnimatedIntValue = viewHeight;
			//    8   14:aload_0         
			//    9   15:aload_0         
			//   10   16:getfield        #22  <Field int val$viewHeight>
			//   11   19:putfield        #26  <Field int mPreviousAnimatedIntValue>
			//   12   22:return          
			}
			}
);
			valueanimator.start();
			return;
		} else
	//*  57  107:goto            30
		{
			Animation animation = AnimationUtils.loadAnimation(mView.getContext(), android.support.design.R.anim.design_snackbar_in);
	//   58  110:aload_0         
	//   59  111:getfield        #169 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//   60  114:invokevirtual   #253 <Method Context BaseTransientBottomBar$SnackbarBaseLayout.getContext()>
	//   61  117:getstatic       #310 <Field int android.support.design.R$anim.design_snackbar_in>
	//   62  120:invokestatic    #264 <Method Animation AnimationUtils.loadAnimation(Context, int)>
	//   63  123:astore_2        
			animation.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
	//   64  124:aload_2         
	//   65  125:getstatic       #227 <Field android.view.animation.Interpolator AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR>
	//   66  128:invokevirtual   #269 <Method void Animation.setInterpolator(android.view.animation.Interpolator)>
			animation.setDuration(250L);
	//   67  131:aload_2         
	//   68  132:ldc2w           #232 <Long 250L>
	//   69  135:invokevirtual   #272 <Method void Animation.setDuration(long)>
			animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

				public void onAnimationEnd(Animation animation1)
				{
					onViewShown();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field BaseTransientBottomBar this$0>
				//    2    4:invokevirtual   #25  <Method void BaseTransientBottomBar.onViewShown()>
				//    3    7:return          
				}

				public void onAnimationRepeat(Animation animation1)
				{
				//    0    0:return          
				}

				public void onAnimationStart(Animation animation1)
				{
				//    0    0:return          
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
	//   70  138:aload_2         
	//   71  139:new             #31  <Class BaseTransientBottomBar$9>
	//   72  142:dup             
	//   73  143:aload_0         
	//   74  144:invokespecial   #311 <Method void BaseTransientBottomBar$9(BaseTransientBottomBar)>
	//   75  147:invokevirtual   #277 <Method void Animation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
			mView.startAnimation(animation);
	//   76  150:aload_0         
	//   77  151:getfield        #169 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//   78  154:aload_2         
	//   79  155:invokevirtual   #281 <Method void BaseTransientBottomBar$SnackbarBaseLayout.startAnimation(Animation)>
			return;
	//   80  158:return          
		}
	}

	public void dismiss()
	{
		dispatchDismiss(3);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:invokevirtual   #315 <Method void dispatchDismiss(int)>
	//    3    5:return          
	}

	void dispatchDismiss(int i)
	{
		SnackbarManager.getInstance().dismiss(mManagerCallback, i);
	//    0    0:invokestatic    #321 <Method SnackbarManager SnackbarManager.getInstance()>
	//    1    3:aload_0         
	//    2    4:getfield        #123 <Field SnackbarManager$Callback mManagerCallback>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #324 <Method void SnackbarManager.dismiss(SnackbarManager$Callback, int)>
	//    5   11:return          
	}

	public Context getContext()
	{
		return mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field Context mContext>
	//    2    4:areturn         
	}

	public int getDuration()
	{
		return mDuration;
	//    0    0:aload_0         
	//    1    1:getfield        #327 <Field int mDuration>
	//    2    4:ireturn         
	}

	public View getView()
	{
		return ((View) (mView));
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//    2    4:areturn         
	}

	final void hideView(int i)
	{
		if(shouldAnimate() && mView.getVisibility() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #333 <Method boolean shouldAnimate()>
	//*   2    4:ifeq            23
	//*   3    7:aload_0         
	//*   4    8:getfield        #169 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//*   5   11:invokevirtual   #336 <Method int BaseTransientBottomBar$SnackbarBaseLayout.getVisibility()>
	//*   6   14:ifne            23
		{
			animateViewOut(i);
	//    7   17:aload_0         
	//    8   18:iload_1         
	//    9   19:invokespecial   #338 <Method void animateViewOut(int)>
			return;
	//   10   22:return          
		} else
		{
			onViewHidden(i);
	//   11   23:aload_0         
	//   12   24:iload_1         
	//   13   25:invokevirtual   #341 <Method void onViewHidden(int)>
			return;
	//   14   28:return          
		}
	}

	public boolean isShown()
	{
		return SnackbarManager.getInstance().isCurrent(mManagerCallback);
	//    0    0:invokestatic    #321 <Method SnackbarManager SnackbarManager.getInstance()>
	//    1    3:aload_0         
	//    2    4:getfield        #123 <Field SnackbarManager$Callback mManagerCallback>
	//    3    7:invokevirtual   #346 <Method boolean SnackbarManager.isCurrent(SnackbarManager$Callback)>
	//    4   10:ireturn         
	}

	public boolean isShownOrQueued()
	{
		return SnackbarManager.getInstance().isCurrentOrNext(mManagerCallback);
	//    0    0:invokestatic    #321 <Method SnackbarManager SnackbarManager.getInstance()>
	//    1    3:aload_0         
	//    2    4:getfield        #123 <Field SnackbarManager$Callback mManagerCallback>
	//    3    7:invokevirtual   #350 <Method boolean SnackbarManager.isCurrentOrNext(SnackbarManager$Callback)>
	//    4   10:ireturn         
	}

	void onViewHidden(int i)
	{
		SnackbarManager.getInstance().onDismissed(mManagerCallback);
	//    0    0:invokestatic    #321 <Method SnackbarManager SnackbarManager.getInstance()>
	//    1    3:aload_0         
	//    2    4:getfield        #123 <Field SnackbarManager$Callback mManagerCallback>
	//    3    7:invokevirtual   #354 <Method void SnackbarManager.onDismissed(SnackbarManager$Callback)>
		if(mCallbacks != null)
	//*   4   10:aload_0         
	//*   5   11:getfield        #285 <Field List mCallbacks>
	//*   6   14:ifnull          58
		{
			for(int j = mCallbacks.size() - 1; j >= 0; j--)
	//*   7   17:aload_0         
	//*   8   18:getfield        #285 <Field List mCallbacks>
	//*   9   21:invokeinterface #357 <Method int List.size()>
	//*  10   26:iconst_1        
	//*  11   27:isub            
	//*  12   28:istore_2        
	//*  13   29:iload_2         
	//*  14   30:iflt            58
				((BaseCallback)mCallbacks.get(j)).onDismissed(((Object) (this)), i);
	//   15   33:aload_0         
	//   16   34:getfield        #285 <Field List mCallbacks>
	//   17   37:iload_2         
	//   18   38:invokeinterface #361 <Method Object List.get(int)>
	//   19   43:checkcast       #33  <Class BaseTransientBottomBar$BaseCallback>
	//   20   46:aload_0         
	//   21   47:iload_1         
	//   22   48:invokevirtual   #364 <Method void BaseTransientBottomBar$BaseCallback.onDismissed(Object, int)>

	//   23   51:iload_2         
	//   24   52:iconst_1        
	//   25   53:isub            
	//   26   54:istore_2        
		}
	//*  27   55:goto            29
		if(android.os.Build.VERSION.SDK_INT < 11)
	//*  28   58:getstatic       #96  <Field int android.os.Build$VERSION.SDK_INT>
	//*  29   61:bipush          11
	//*  30   63:icmpge          75
			mView.setVisibility(8);
	//   31   66:aload_0         
	//   32   67:getfield        #169 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//   33   70:bipush          8
	//   34   72:invokevirtual   #367 <Method void BaseTransientBottomBar$SnackbarBaseLayout.setVisibility(int)>
		android.view.ViewParent viewparent = mView.getParent();
	//   35   75:aload_0         
	//   36   76:getfield        #169 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//   37   79:invokevirtual   #371 <Method android.view.ViewParent BaseTransientBottomBar$SnackbarBaseLayout.getParent()>
	//   38   82:astore_3        
		if(viewparent instanceof ViewGroup)
	//*  39   83:aload_3         
	//*  40   84:instanceof      #140 <Class ViewGroup>
	//*  41   87:ifeq            101
			((ViewGroup)viewparent).removeView(((View) (mView)));
	//   42   90:aload_3         
	//   43   91:checkcast       #140 <Class ViewGroup>
	//   44   94:aload_0         
	//   45   95:getfield        #169 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//   46   98:invokevirtual   #374 <Method void ViewGroup.removeView(View)>
	//   47  101:return          
	}

	void onViewShown()
	{
		SnackbarManager.getInstance().onShown(mManagerCallback);
	//    0    0:invokestatic    #321 <Method SnackbarManager SnackbarManager.getInstance()>
	//    1    3:aload_0         
	//    2    4:getfield        #123 <Field SnackbarManager$Callback mManagerCallback>
	//    3    7:invokevirtual   #378 <Method void SnackbarManager.onShown(SnackbarManager$Callback)>
		if(mCallbacks != null)
	//*   4   10:aload_0         
	//*   5   11:getfield        #285 <Field List mCallbacks>
	//*   6   14:ifnull          57
		{
			for(int i = mCallbacks.size() - 1; i >= 0; i--)
	//*   7   17:aload_0         
	//*   8   18:getfield        #285 <Field List mCallbacks>
	//*   9   21:invokeinterface #357 <Method int List.size()>
	//*  10   26:iconst_1        
	//*  11   27:isub            
	//*  12   28:istore_1        
	//*  13   29:iload_1         
	//*  14   30:iflt            57
				((BaseCallback)mCallbacks.get(i)).onShown(((Object) (this)));
	//   15   33:aload_0         
	//   16   34:getfield        #285 <Field List mCallbacks>
	//   17   37:iload_1         
	//   18   38:invokeinterface #361 <Method Object List.get(int)>
	//   19   43:checkcast       #33  <Class BaseTransientBottomBar$BaseCallback>
	//   20   46:aload_0         
	//   21   47:invokevirtual   #381 <Method void BaseTransientBottomBar$BaseCallback.onShown(Object)>

	//   22   50:iload_1         
	//   23   51:iconst_1        
	//   24   52:isub            
	//   25   53:istore_1        
		}
	//*  26   54:goto            29
	//   27   57:return          
	}

	public BaseTransientBottomBar removeCallback(BaseCallback basecallback)
	{
		while(basecallback == null || mCallbacks == null) 
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
	//    4    6:aload_0         
	//    5    7:getfield        #285 <Field List mCallbacks>
	//    6   10:ifnull          4
		mCallbacks.remove(((Object) (basecallback)));
	//    7   13:aload_0         
	//    8   14:getfield        #285 <Field List mCallbacks>
	//    9   17:aload_1         
	//   10   18:invokeinterface #385 <Method boolean List.remove(Object)>
	//   11   23:pop             
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public BaseTransientBottomBar setDuration(int i)
	{
		mDuration = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #327 <Field int mDuration>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	boolean shouldAnimate()
	{
		return !mAccessibilityManager.isEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field AccessibilityManager mAccessibilityManager>
	//    2    4:invokevirtual   #390 <Method boolean AccessibilityManager.isEnabled()>
	//    3    7:ifne            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public void show()
	{
		SnackbarManager.getInstance().show(mDuration, mManagerCallback);
	//    0    0:invokestatic    #321 <Method SnackbarManager SnackbarManager.getInstance()>
	//    1    3:aload_0         
	//    2    4:getfield        #327 <Field int mDuration>
	//    3    7:aload_0         
	//    4    8:getfield        #123 <Field SnackbarManager$Callback mManagerCallback>
	//    5   11:invokevirtual   #394 <Method void SnackbarManager.show(int, SnackbarManager$Callback)>
	//    6   14:return          
	}

	final void showView()
	{
		if(mView.getParent() == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//*   2    4:invokevirtual   #371 <Method android.view.ViewParent BaseTransientBottomBar$SnackbarBaseLayout.getParent()>
	//*   3    7:ifnonnull       92
		{
			Object obj = ((Object) (mView.getLayoutParams()));
	//    4   10:aload_0         
	//    5   11:getfield        #169 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//    6   14:invokevirtual   #399 <Method android.view.ViewGroup$LayoutParams BaseTransientBottomBar$SnackbarBaseLayout.getLayoutParams()>
	//    7   17:astore_1        
			if(obj instanceof CoordinatorLayout.LayoutParams)
	//*   8   18:aload_1         
	//*   9   19:instanceof      #401 <Class CoordinatorLayout$LayoutParams>
	//*  10   22:ifeq            81
			{
				obj = ((Object) ((CoordinatorLayout.LayoutParams)obj));
	//   11   25:aload_1         
	//   12   26:checkcast       #401 <Class CoordinatorLayout$LayoutParams>
	//   13   29:astore_1        
				Behavior behavior = new Behavior();
	//   14   30:new             #39  <Class BaseTransientBottomBar$Behavior>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:invokespecial   #402 <Method void BaseTransientBottomBar$Behavior(BaseTransientBottomBar)>
	//   18   38:astore_2        
				behavior.setStartAlphaSwipeDistance(0.1F);
	//   19   39:aload_2         
	//   20   40:ldc2            #403 <Float 0.1F>
	//   21   43:invokevirtual   #406 <Method void BaseTransientBottomBar$Behavior.setStartAlphaSwipeDistance(float)>
				behavior.setEndAlphaSwipeDistance(0.6F);
	//   22   46:aload_2         
	//   23   47:ldc2            #407 <Float 0.6F>
	//   24   50:invokevirtual   #410 <Method void BaseTransientBottomBar$Behavior.setEndAlphaSwipeDistance(float)>
				behavior.setSwipeDirection(0);
	//   25   53:aload_2         
	//   26   54:iconst_0        
	//   27   55:invokevirtual   #413 <Method void BaseTransientBottomBar$Behavior.setSwipeDirection(int)>
				behavior.setListener(new SwipeDismissBehavior.OnDismissListener() {

					public void onDismiss(View view)
					{
						view.setVisibility(8);
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
							SnackbarManager.getInstance().pauseTimeout(mManagerCallback);
					//    3   29:invokestatic    #38  <Method SnackbarManager SnackbarManager.getInstance()>
					//    4   32:aload_0         
					//    5   33:getfield        #17  <Field BaseTransientBottomBar this$0>
					//    6   36:getfield        #42  <Field SnackbarManager$Callback BaseTransientBottomBar.mManagerCallback>
					//    7   39:invokevirtual   #46  <Method void SnackbarManager.pauseTimeout(SnackbarManager$Callback)>
							return;
					//    8   42:return          

						case 0: // '\0'
							SnackbarManager.getInstance().restoreTimeoutIfPaused(mManagerCallback);
					//    9   43:invokestatic    #38  <Method SnackbarManager SnackbarManager.getInstance()>
					//   10   46:aload_0         
					//   11   47:getfield        #17  <Field BaseTransientBottomBar this$0>
					//   12   50:getfield        #42  <Field SnackbarManager$Callback BaseTransientBottomBar.mManagerCallback>
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
	//   28   58:aload_2         
	//   29   59:new             #19  <Class BaseTransientBottomBar$4>
	//   30   62:dup             
	//   31   63:aload_0         
	//   32   64:invokespecial   #414 <Method void BaseTransientBottomBar$4(BaseTransientBottomBar)>
	//   33   67:invokevirtual   #418 <Method void BaseTransientBottomBar$Behavior.setListener(SwipeDismissBehavior$OnDismissListener)>
				((CoordinatorLayout.LayoutParams) (obj)).setBehavior(((CoordinatorLayout.Behavior) (behavior)));
	//   34   70:aload_1         
	//   35   71:aload_2         
	//   36   72:invokevirtual   #422 <Method void CoordinatorLayout$LayoutParams.setBehavior(CoordinatorLayout$Behavior)>
				obj.insetEdge = 80;
	//   37   75:aload_1         
	//   38   76:bipush          80
	//   39   78:putfield        #425 <Field int CoordinatorLayout$LayoutParams.insetEdge>
			}
			mTargetParent.addView(((View) (mView)));
	//   40   81:aload_0         
	//   41   82:getfield        #136 <Field ViewGroup mTargetParent>
	//   42   85:aload_0         
	//   43   86:getfield        #169 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//   44   89:invokevirtual   #426 <Method void ViewGroup.addView(View)>
		}
		mView.setOnAttachStateChangeListener(new OnAttachStateChangeListener() {

			public void onViewAttachedToWindow(View view)
			{
			//    0    0:return          
			}

			public void onViewDetachedFromWindow(View view)
			{
				if(isShownOrQueued())
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field BaseTransientBottomBar this$0>
			//*   2    4:invokevirtual   #29  <Method boolean BaseTransientBottomBar.isShownOrQueued()>
			//*   3    7:ifeq            25
					BaseTransientBottomBar.sHandler.post(new Runnable() {

						public void run()
						{
							onViewHidden(3);
						//    0    0:aload_0         
						//    1    1:getfield        #17  <Field BaseTransientBottomBar$5 this$1>
						//    2    4:getfield        #26  <Field BaseTransientBottomBar BaseTransientBottomBar$5.this$0>
						//    3    7:iconst_3        
						//    4    8:invokevirtual   #32  <Method void BaseTransientBottomBar.onViewHidden(int)>
						//    5   11:return          
						}

						final _cls5 this$1;

			
			{
				this$1 = _cls5.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BaseTransientBottomBar$5 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
					}
);
			//    4   10:getstatic       #33  <Field Handler BaseTransientBottomBar.sHandler>
			//    5   13:new             #13  <Class BaseTransientBottomBar$5$1>
			//    6   16:dup             
			//    7   17:aload_0         
			//    8   18:invokespecial   #36  <Method void BaseTransientBottomBar$5$1(BaseTransientBottomBar$5)>
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
	//   45   92:aload_0         
	//   46   93:getfield        #169 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//   47   96:new             #21  <Class BaseTransientBottomBar$5>
	//   48   99:dup             
	//   49  100:aload_0         
	//   50  101:invokespecial   #427 <Method void BaseTransientBottomBar$5(BaseTransientBottomBar)>
	//   51  104:invokevirtual   #431 <Method void BaseTransientBottomBar$SnackbarBaseLayout.setOnAttachStateChangeListener(BaseTransientBottomBar$OnAttachStateChangeListener)>
		if(ViewCompat.isLaidOut(((View) (mView))))
	//*  52  107:aload_0         
	//*  53  108:getfield        #169 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//*  54  111:invokestatic    #435 <Method boolean ViewCompat.isLaidOut(View)>
	//*  55  114:ifeq            134
		{
			if(shouldAnimate())
	//*  56  117:aload_0         
	//*  57  118:invokevirtual   #333 <Method boolean shouldAnimate()>
	//*  58  121:ifeq            129
			{
				animateViewIn();
	//   59  124:aload_0         
	//   60  125:invokevirtual   #437 <Method void animateViewIn()>
				return;
	//   61  128:return          
			} else
			{
				onViewShown();
	//   62  129:aload_0         
	//   63  130:invokevirtual   #439 <Method void onViewShown()>
				return;
	//   64  133:return          
			}
		} else
		{
			mView.setOnLayoutChangeListener(new OnLayoutChangeListener() {

				public void onLayoutChange(View view, int i, int j, int k, int l)
				{
					mView.setOnLayoutChangeListener(((OnLayoutChangeListener) (null)));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field BaseTransientBottomBar this$0>
				//    2    4:getfield        #26  <Field BaseTransientBottomBar$SnackbarBaseLayout BaseTransientBottomBar.mView>
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
	//   65  134:aload_0         
	//   66  135:getfield        #169 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//   67  138:new             #25  <Class BaseTransientBottomBar$6>
	//   68  141:dup             
	//   69  142:aload_0         
	//   70  143:invokespecial   #440 <Method void BaseTransientBottomBar$6(BaseTransientBottomBar)>
	//   71  146:invokevirtual   #444 <Method void BaseTransientBottomBar$SnackbarBaseLayout.setOnLayoutChangeListener(BaseTransientBottomBar$OnLayoutChangeListener)>
			return;
	//   72  149:return          
		}
	}

	static final int ANIMATION_DURATION = 250;
	static final int ANIMATION_FADE_DURATION = 180;
	public static final int LENGTH_INDEFINITE = -2;
	public static final int LENGTH_LONG = 0;
	public static final int LENGTH_SHORT = -1;
	static final int MSG_DISMISS = 1;
	static final int MSG_SHOW = 0;
	private static final boolean USE_OFFSET_API;
	static final Handler sHandler = new Handler(Looper.getMainLooper(), new android.os.Handler.Callback() {

		public boolean handleMessage(Message message)
		{
			switch(message.what)
		//*   0    0:aload_1         
		//*   1    1:getfield        #21  <Field int Message.what>
			{
		//*   2    4:tableswitch     0 1: default 28
		//		               0 30
		//		               1 42
			default:
				return false;
		//    3   28:iconst_0        
		//    4   29:ireturn         

			case 0: // '\0'
				((BaseTransientBottomBar)message.obj).showView();
		//    5   30:aload_1         
		//    6   31:getfield        #25  <Field Object Message.obj>
		//    7   34:checkcast       #8   <Class BaseTransientBottomBar>
		//    8   37:invokevirtual   #28  <Method void BaseTransientBottomBar.showView()>
				return true;
		//    9   40:iconst_1        
		//   10   41:ireturn         

			case 1: // '\001'
				((BaseTransientBottomBar)message.obj).hideView(message.arg1);
		//   11   42:aload_1         
		//   12   43:getfield        #25  <Field Object Message.obj>
		//   13   46:checkcast       #8   <Class BaseTransientBottomBar>
		//   14   49:aload_1         
		//   15   50:getfield        #31  <Field int Message.arg1>
		//   16   53:invokevirtual   #35  <Method void BaseTransientBottomBar.hideView(int)>
				break;
			}
			return true;
		//   17   56:iconst_1        
		//   18   57:ireturn         
		}

	}
);
	private final AccessibilityManager mAccessibilityManager;
	private List mCallbacks;
	private final ContentViewCallback mContentViewCallback;
	private final Context mContext;
	private int mDuration;
	final SnackbarManager.Callback mManagerCallback = new SnackbarManager.Callback() {

		public void dismiss(int i)
		{
			BaseTransientBottomBar.sHandler.sendMessage(BaseTransientBottomBar.sHandler.obtainMessage(1, i, 0, ((Object) (BaseTransientBottomBar.this))));
		//    0    0:getstatic       #24  <Field Handler BaseTransientBottomBar.sHandler>
		//    1    3:getstatic       #24  <Field Handler BaseTransientBottomBar.sHandler>
		//    2    6:iconst_1        
		//    3    7:iload_1         
		//    4    8:iconst_0        
		//    5    9:aload_0         
		//    6   10:getfield        #14  <Field BaseTransientBottomBar this$0>
		//    7   13:invokevirtual   #30  <Method Message Handler.obtainMessage(int, int, int, Object)>
		//    8   16:invokevirtual   #34  <Method boolean Handler.sendMessage(Message)>
		//    9   19:pop             
		//   10   20:return          
		}

		public void show()
		{
			BaseTransientBottomBar.sHandler.sendMessage(BaseTransientBottomBar.sHandler.obtainMessage(0, ((Object) (BaseTransientBottomBar.this))));
		//    0    0:getstatic       #24  <Field Handler BaseTransientBottomBar.sHandler>
		//    1    3:getstatic       #24  <Field Handler BaseTransientBottomBar.sHandler>
		//    2    6:iconst_0        
		//    3    7:aload_0         
		//    4    8:getfield        #14  <Field BaseTransientBottomBar this$0>
		//    5   11:invokevirtual   #38  <Method Message Handler.obtainMessage(int, Object)>
		//    6   14:invokevirtual   #34  <Method boolean Handler.sendMessage(Message)>
		//    7   17:pop             
		//    8   18:return          
		}

		final BaseTransientBottomBar this$0;

			
			{
				this$0 = BaseTransientBottomBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field BaseTransientBottomBar this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private final ViewGroup mTargetParent;
	final SnackbarBaseLayout mView;

	static 
	{
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 16 && android.os.Build.VERSION.SDK_INT <= 19)
	//*   0    0:getstatic       #96  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          43
	//*   3    8:getstatic       #96  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   11:bipush          19
	//*   5   13:icmpgt          43
			flag = true;
	//    6   16:iconst_1        
	//    7   17:istore_0        
		else
	//*   8   18:iload_0         
	//*   9   19:putstatic       #98  <Field boolean USE_OFFSET_API>
	//*  10   22:new             #100 <Class Handler>
	//*  11   25:dup             
	//*  12   26:invokestatic    #106 <Method Looper Looper.getMainLooper()>
	//*  13   29:new             #7   <Class BaseTransientBottomBar$1>
	//*  14   32:dup             
	//*  15   33:invokespecial   #109 <Method void BaseTransientBottomBar$1()>
	//*  16   36:invokespecial   #112 <Method void Handler(Looper, android.os.Handler$Callback)>
	//*  17   39:putstatic       #114 <Field Handler sHandler>
	//*  18   42:return          
			flag = false;
	//   19   43:iconst_0        
	//   20   44:istore_0        
		USE_OFFSET_API = flag;
	//*  21   45:goto            18
	}


/*
	static ContentViewCallback access$000(BaseTransientBottomBar basetransientbottombar)
	{
		return basetransientbottombar.mContentViewCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field BaseTransientBottomBar$ContentViewCallback mContentViewCallback>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$100()
	{
		return USE_OFFSET_API;
	//    0    0:getstatic       #98  <Field boolean USE_OFFSET_API>
	//    1    3:ireturn         
	}

*/
}
