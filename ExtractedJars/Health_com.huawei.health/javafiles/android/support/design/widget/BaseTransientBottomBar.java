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
import o.*;

// Referenced classes of package android.support.design.widget:
//			SwipeDismissBehavior, CoordinatorLayout

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
			return view instanceof c;
		//    0    0:aload_1         
		//    1    1:instanceof      #22  <Class BaseTransientBottomBar$c>
		//    2    4:ireturn         
		}

		public boolean d(CoordinatorLayout coordinatorlayout, c c1, MotionEvent motionevent)
		{
			switch(motionevent.getActionMasked())
		//*   0    0:aload_3         
		//*   1    1:invokevirtual   #30  <Method int MotionEvent.getActionMasked()>
			{
			case 2: // '\002'
			default:
				break;

		//*   2    4:tableswitch     0 3: default 36
		//		               0 39
		//		               1 73
		//		               2 86
		//		               3 73
		//*   3   36:goto            86
			case 0: // '\0'
				if(coordinatorlayout.isPointInChildBounds(((View) (c1)), (int)motionevent.getX(), (int)motionevent.getY()))
		//*   4   39:aload_1         
		//*   5   40:aload_2         
		//*   6   41:aload_3         
		//*   7   42:invokevirtual   #34  <Method float MotionEvent.getX()>
		//*   8   45:f2i             
		//*   9   46:aload_3         
		//*  10   47:invokevirtual   #37  <Method float MotionEvent.getY()>
		//*  11   50:f2i             
		//*  12   51:invokevirtual   #43  <Method boolean CoordinatorLayout.isPointInChildBounds(View, int, int)>
		//*  13   54:ifeq            86
					x.b().e(e.mManagerCallback);
		//   14   57:invokestatic    #49  <Method x x.b()>
		//   15   60:aload_0         
		//   16   61:getfield        #14  <Field BaseTransientBottomBar e>
		//   17   64:getfield        #53  <Field o.x$e BaseTransientBottomBar.mManagerCallback>
		//   18   67:invokevirtual   #56  <Method void x.e(o.x$e)>
				break;

		//*  19   70:goto            86
			case 1: // '\001'
			case 3: // '\003'
				x.b().c(e.mManagerCallback);
		//   20   73:invokestatic    #49  <Method x x.b()>
		//   21   76:aload_0         
		//   22   77:getfield        #14  <Field BaseTransientBottomBar e>
		//   23   80:getfield        #53  <Field o.x$e BaseTransientBottomBar.mManagerCallback>
		//   24   83:invokevirtual   #59  <Method void x.c(o.x$e)>
				break;
			}
			return super.onInterceptTouchEvent(coordinatorlayout, ((View) (c1)), motionevent);
		//   25   86:aload_0         
		//   26   87:aload_1         
		//   27   88:aload_2         
		//   28   89:aload_3         
		//   29   90:invokespecial   #63  <Method boolean SwipeDismissBehavior.onInterceptTouchEvent(CoordinatorLayout, View, MotionEvent)>
		//   30   93:ireturn         
		}

		public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
		{
			return d(coordinatorlayout, (c)view, motionevent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #22  <Class BaseTransientBottomBar$c>
		//    4    6:aload_3         
		//    5    7:invokevirtual   #65  <Method boolean d(CoordinatorLayout, BaseTransientBottomBar$c, MotionEvent)>
		//    6   10:ireturn         
		}

		final BaseTransientBottomBar e;

		Behavior()
		{
			e = BaseTransientBottomBar.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field BaseTransientBottomBar e>
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

	static interface b
	{

		public abstract void a(View view, int i, int j, int k, int l);
	}

	static class c extends FrameLayout
	{

		protected void onAttachedToWindow()
		{
			super.onAttachedToWindow();
		//    0    0:aload_0         
		//    1    1:invokespecial   #65  <Method void FrameLayout.onAttachedToWindow()>
			if(mOnAttachStateChangeListener != null)
		//*   2    4:aload_0         
		//*   3    5:getfield        #67  <Field BaseTransientBottomBar$e mOnAttachStateChangeListener>
		//*   4    8:ifnull          21
				mOnAttachStateChangeListener.e(((View) (this)));
		//    5   11:aload_0         
		//    6   12:getfield        #67  <Field BaseTransientBottomBar$e mOnAttachStateChangeListener>
		//    7   15:aload_0         
		//    8   16:invokeinterface #73  <Method void BaseTransientBottomBar$e.e(View)>
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
		//*   3    5:getfield        #67  <Field BaseTransientBottomBar$e mOnAttachStateChangeListener>
		//*   4    8:ifnull          21
				mOnAttachStateChangeListener.a(((View) (this)));
		//    5   11:aload_0         
		//    6   12:getfield        #67  <Field BaseTransientBottomBar$e mOnAttachStateChangeListener>
		//    7   15:aload_0         
		//    8   16:invokeinterface #82  <Method void BaseTransientBottomBar$e.a(View)>
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
		//*   8   12:getfield        #88  <Field BaseTransientBottomBar$b mOnLayoutChangeListener>
		//*   9   15:ifnull          34
				mOnLayoutChangeListener.a(((View) (this)), i, j, k, l);
		//   10   18:aload_0         
		//   11   19:getfield        #88  <Field BaseTransientBottomBar$b mOnLayoutChangeListener>
		//   12   22:aload_0         
		//   13   23:iload_2         
		//   14   24:iload_3         
		//   15   25:iload           4
		//   16   27:iload           5
		//   17   29:invokeinterface #93  <Method void BaseTransientBottomBar$b.a(View, int, int, int, int)>
		//   18   34:return          
		}

		void setOnAttachStateChangeListener(e e1)
		{
			mOnAttachStateChangeListener = e1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #67  <Field BaseTransientBottomBar$e mOnAttachStateChangeListener>
		//    3    5:return          
		}

		void setOnLayoutChangeListener(b b1)
		{
			mOnLayoutChangeListener = b1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #88  <Field BaseTransientBottomBar$b mOnLayoutChangeListener>
		//    3    5:return          
		}

		private e mOnAttachStateChangeListener;
		private b mOnLayoutChangeListener;

		c(Context context)
		{
			this(context, ((AttributeSet) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokespecial   #20  <Method void BaseTransientBottomBar$c(Context, AttributeSet)>
		//    4    6:return          
		}

		c(Context context, AttributeSet attributeset)
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

	static interface e
	{

		public abstract void a(View view);

		public abstract void e(View view);
	}


	protected BaseTransientBottomBar(ViewGroup viewgroup, View view, ContentViewCallback contentviewcallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #118 <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class BaseTransientBottomBar$6>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #121 <Method void BaseTransientBottomBar$6(BaseTransientBottomBar)>
	//    7   13:putfield        #123 <Field o.x$e mManagerCallback>
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
			aa.b(mContext);
	//   39   76:aload_0         
	//   40   77:getfield        #146 <Field Context mContext>
	//   41   80:invokestatic    #151 <Method void aa.b(Context)>
			mView = (c)LayoutInflater.from(mContext).inflate(android.support.design.R.layout.design_layout_snackbar, mTargetParent, false);
	//   42   83:aload_0         
	//   43   84:aload_0         
	//   44   85:getfield        #146 <Field Context mContext>
	//   45   88:invokestatic    #157 <Method LayoutInflater LayoutInflater.from(Context)>
	//   46   91:getstatic       #162 <Field int android.support.design.R$layout.design_layout_snackbar>
	//   47   94:aload_0         
	//   48   95:getfield        #136 <Field ViewGroup mTargetParent>
	//   49   98:iconst_0        
	//   50   99:invokevirtual   #166 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   51  102:checkcast       #51  <Class BaseTransientBottomBar$c>
	//   52  105:putfield        #168 <Field BaseTransientBottomBar$c mView>
			mView.addView(view);
	//   53  108:aload_0         
	//   54  109:getfield        #168 <Field BaseTransientBottomBar$c mView>
	//   55  112:aload_2         
	//   56  113:invokevirtual   #172 <Method void BaseTransientBottomBar$c.addView(View)>
			ViewCompat.setAccessibilityLiveRegion(((View) (mView)), 1);
	//   57  116:aload_0         
	//   58  117:getfield        #168 <Field BaseTransientBottomBar$c mView>
	//   59  120:iconst_1        
	//   60  121:invokestatic    #178 <Method void ViewCompat.setAccessibilityLiveRegion(View, int)>
			ViewCompat.setImportantForAccessibility(((View) (mView)), 1);
	//   61  124:aload_0         
	//   62  125:getfield        #168 <Field BaseTransientBottomBar$c mView>
	//   63  128:iconst_1        
	//   64  129:invokestatic    #181 <Method void ViewCompat.setImportantForAccessibility(View, int)>
			ViewCompat.setFitsSystemWindows(((View) (mView)), true);
	//   65  132:aload_0         
	//   66  133:getfield        #168 <Field BaseTransientBottomBar$c mView>
	//   67  136:iconst_1        
	//   68  137:invokestatic    #185 <Method void ViewCompat.setFitsSystemWindows(View, boolean)>
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

				final BaseTransientBottomBar a;

			
			{
				a = BaseTransientBottomBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BaseTransientBottomBar a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   69  140:aload_0         
	//   70  141:getfield        #168 <Field BaseTransientBottomBar$c mView>
	//   71  144:new             #7   <Class BaseTransientBottomBar$1>
	//   72  147:dup             
	//   73  148:aload_0         
	//   74  149:invokespecial   #186 <Method void BaseTransientBottomBar$1(BaseTransientBottomBar)>
	//   75  152:invokestatic    #190 <Method void ViewCompat.setOnApplyWindowInsetsListener(View, OnApplyWindowInsetsListener)>
			mAccessibilityManager = (AccessibilityManager)mContext.getSystemService("accessibility");
	//   76  155:aload_0         
	//   77  156:aload_0         
	//   78  157:getfield        #146 <Field Context mContext>
	//   79  160:ldc1            #192 <String "accessibility">
	//   80  162:invokevirtual   #198 <Method Object Context.getSystemService(String)>
	//   81  165:checkcast       #200 <Class AccessibilityManager>
	//   82  168:putfield        #202 <Field AccessibilityManager mAccessibilityManager>
			return;
	//   83  171:return          
		}
	}

	private void animateViewOut(int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 12)
	//*   0    0:getstatic       #96  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          12
	//*   2    5:icmplt          82
		{
			ValueAnimator valueanimator = new ValueAnimator();
	//    3    8:new             #211 <Class ValueAnimator>
	//    4   11:dup             
	//    5   12:invokespecial   #212 <Method void ValueAnimator()>
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
	//   17   27:getfield        #168 <Field BaseTransientBottomBar$c mView>
	//   18   30:invokevirtual   #216 <Method int BaseTransientBottomBar$c.getHeight()>
	//   19   33:iastore         
	//   20   34:invokevirtual   #220 <Method void ValueAnimator.setIntValues(int[])>
			valueanimator.setInterpolator(((android.animation.TimeInterpolator) (p.a)));
	//   21   37:aload_2         
	//   22   38:getstatic       #226 <Field android.view.animation.Interpolator p.a>
	//   23   41:invokevirtual   #230 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
			valueanimator.setDuration(250L);
	//   24   44:aload_2         
	//   25   45:ldc2w           #231 <Long 250L>
	//   26   48:invokevirtual   #236 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   27   51:pop             
			valueanimator.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter(i) {

				public void onAnimationEnd(Animator animator)
				{
					b.onViewHidden(a);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field BaseTransientBottomBar b>
				//    2    4:aload_0         
				//    3    5:getfield        #19  <Field int a>
				//    4    8:invokevirtual   #28  <Method void BaseTransientBottomBar.onViewHidden(int)>
				//    5   11:return          
				}

				public void onAnimationStart(Animator animator)
				{
					b.mContentViewCallback.animateContentOut(0, 180);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field BaseTransientBottomBar b>
				//    2    4:invokestatic    #33  <Method BaseTransientBottomBar$ContentViewCallback BaseTransientBottomBar.access$000(BaseTransientBottomBar)>
				//    3    7:iconst_0        
				//    4    8:sipush          180
				//    5   11:invokeinterface #39  <Method void BaseTransientBottomBar$ContentViewCallback.animateContentOut(int, int)>
				//    6   16:return          
				}

				final int a;
				final BaseTransientBottomBar b;

			
			{
				b = BaseTransientBottomBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BaseTransientBottomBar b>
				a = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #19  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void AnimatorListenerAdapter()>
			//    8   14:return          
			}
			}
)));
	//   28   52:aload_2         
	//   29   53:new             #19  <Class BaseTransientBottomBar$4>
	//   30   56:dup             
	//   31   57:aload_0         
	//   32   58:iload_1         
	//   33   59:invokespecial   #239 <Method void BaseTransientBottomBar$4(BaseTransientBottomBar, int)>
	//   34   62:invokevirtual   #243 <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
			valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

				public void onAnimationUpdate(ValueAnimator valueanimator1)
				{
					int j = ((Integer)valueanimator1.getAnimatedValue()).intValue();
				//    0    0:aload_1         
				//    1    1:invokevirtual   #33  <Method Object ValueAnimator.getAnimatedValue()>
				//    2    4:checkcast       #35  <Class Integer>
				//    3    7:invokevirtual   #39  <Method int Integer.intValue()>
				//    4   10:istore_2        
					if(BaseTransientBottomBar.USE_OFFSET_API)
				//*   5   11:invokestatic    #43  <Method boolean BaseTransientBottomBar.access$100()>
				//*   6   14:ifeq            36
						ViewCompat.offsetTopAndBottom(((View) (a.mView)), j - b);
				//    7   17:aload_0         
				//    8   18:getfield        #19  <Field BaseTransientBottomBar a>
				//    9   21:getfield        #47  <Field BaseTransientBottomBar$c BaseTransientBottomBar.mView>
				//   10   24:iload_2         
				//   11   25:aload_0         
				//   12   26:getfield        #24  <Field int b>
				//   13   29:isub            
				//   14   30:invokestatic    #53  <Method void ViewCompat.offsetTopAndBottom(View, int)>
					else
				//*  15   33:goto            48
						a.mView.setTranslationY(j);
				//   16   36:aload_0         
				//   17   37:getfield        #19  <Field BaseTransientBottomBar a>
				//   18   40:getfield        #47  <Field BaseTransientBottomBar$c BaseTransientBottomBar.mView>
				//   19   43:iload_2         
				//   20   44:i2f             
				//   21   45:invokevirtual   #59  <Method void BaseTransientBottomBar$c.setTranslationY(float)>
					b = j;
				//   22   48:aload_0         
				//   23   49:iload_2         
				//   24   50:putfield        #24  <Field int b>
				//   25   53:return          
				}

				final BaseTransientBottomBar a;
				private int b;

			
			{
				a = BaseTransientBottomBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BaseTransientBottomBar a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
				b = 0;
			//    5    9:aload_0         
			//    6   10:iconst_0        
			//    7   11:putfield        #24  <Field int b>
			//    8   14:return          
			}
			}
);
	//   35   65:aload_2         
	//   36   66:new             #21  <Class BaseTransientBottomBar$5>
	//   37   69:dup             
	//   38   70:aload_0         
	//   39   71:invokespecial   #244 <Method void BaseTransientBottomBar$5(BaseTransientBottomBar)>
	//   40   74:invokevirtual   #248 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
			valueanimator.start();
	//   41   77:aload_2         
	//   42   78:invokevirtual   #251 <Method void ValueAnimator.start()>
			return;
	//   43   81:return          
		} else
		{
			Animation animation = AnimationUtils.loadAnimation(mView.getContext(), android.support.design.R.anim.design_snackbar_out);
	//   44   82:aload_0         
	//   45   83:getfield        #168 <Field BaseTransientBottomBar$c mView>
	//   46   86:invokevirtual   #252 <Method Context BaseTransientBottomBar$c.getContext()>
	//   47   89:getstatic       #257 <Field int android.support.design.R$anim.design_snackbar_out>
	//   48   92:invokestatic    #263 <Method Animation AnimationUtils.loadAnimation(Context, int)>
	//   49   95:astore_2        
			animation.setInterpolator(p.a);
	//   50   96:aload_2         
	//   51   97:getstatic       #226 <Field android.view.animation.Interpolator p.a>
	//   52  100:invokevirtual   #268 <Method void Animation.setInterpolator(android.view.animation.Interpolator)>
			animation.setDuration(250L);
	//   53  103:aload_2         
	//   54  104:ldc2w           #231 <Long 250L>
	//   55  107:invokevirtual   #271 <Method void Animation.setDuration(long)>
			animation.setAnimationListener(new android.view.animation.Animation.AnimationListener(i) {

				public void onAnimationEnd(Animation animation1)
				{
					c.onViewHidden(d);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field BaseTransientBottomBar c>
				//    2    4:aload_0         
				//    3    5:getfield        #21  <Field int d>
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

				final BaseTransientBottomBar c;
				final int d;

			
			{
				c = BaseTransientBottomBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BaseTransientBottomBar c>
				d = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int d>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   56  110:aload_2         
	//   57  111:new             #15  <Class BaseTransientBottomBar$2>
	//   58  114:dup             
	//   59  115:aload_0         
	//   60  116:iload_1         
	//   61  117:invokespecial   #272 <Method void BaseTransientBottomBar$2(BaseTransientBottomBar, int)>
	//   62  120:invokevirtual   #276 <Method void Animation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
			mView.startAnimation(animation);
	//   63  123:aload_0         
	//   64  124:getfield        #168 <Field BaseTransientBottomBar$c mView>
	//   65  127:aload_2         
	//   66  128:invokevirtual   #280 <Method void BaseTransientBottomBar$c.startAnimation(Animation)>
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
	//*   5    7:getfield        #284 <Field List mCallbacks>
	//*   6   10:ifnonnull       24
			mCallbacks = ((List) (new ArrayList()));
	//    7   13:aload_0         
	//    8   14:new             #286 <Class ArrayList>
	//    9   17:dup             
	//   10   18:invokespecial   #287 <Method void ArrayList()>
	//   11   21:putfield        #284 <Field List mCallbacks>
		mCallbacks.add(((Object) (basecallback)));
	//   12   24:aload_0         
	//   13   25:getfield        #284 <Field List mCallbacks>
	//   14   28:aload_1         
	//   15   29:invokeinterface #293 <Method boolean List.add(Object)>
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
			int i = mView.getHeight();
	//    3    8:aload_0         
	//    4    9:getfield        #168 <Field BaseTransientBottomBar$c mView>
	//    5   12:invokevirtual   #216 <Method int BaseTransientBottomBar$c.getHeight()>
	//    6   15:istore_1        
			if(USE_OFFSET_API)
	//*   7   16:getstatic       #98  <Field boolean USE_OFFSET_API>
	//*   8   19:ifeq            33
				ViewCompat.offsetTopAndBottom(((View) (mView)), i);
	//    9   22:aload_0         
	//   10   23:getfield        #168 <Field BaseTransientBottomBar$c mView>
	//   11   26:iload_1         
	//   12   27:invokestatic    #300 <Method void ViewCompat.offsetTopAndBottom(View, int)>
			else
	//*  13   30:goto            42
				mView.setTranslationY(i);
	//   14   33:aload_0         
	//   15   34:getfield        #168 <Field BaseTransientBottomBar$c mView>
	//   16   37:iload_1         
	//   17   38:i2f             
	//   18   39:invokevirtual   #304 <Method void BaseTransientBottomBar$c.setTranslationY(float)>
			ValueAnimator valueanimator = new ValueAnimator();
	//   19   42:new             #211 <Class ValueAnimator>
	//   20   45:dup             
	//   21   46:invokespecial   #212 <Method void ValueAnimator()>
	//   22   49:astore_2        
			valueanimator.setIntValues(new int[] {
				i, 0
			});
	//   23   50:aload_2         
	//   24   51:iconst_2        
	//   25   52:newarray        int[]
	//   26   54:dup             
	//   27   55:iconst_0        
	//   28   56:iload_1         
	//   29   57:iastore         
	//   30   58:dup             
	//   31   59:iconst_1        
	//   32   60:iconst_0        
	//   33   61:iastore         
	//   34   62:invokevirtual   #220 <Method void ValueAnimator.setIntValues(int[])>
			valueanimator.setInterpolator(((android.animation.TimeInterpolator) (p.a)));
	//   35   65:aload_2         
	//   36   66:getstatic       #226 <Field android.view.animation.Interpolator p.a>
	//   37   69:invokevirtual   #230 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
			valueanimator.setDuration(250L);
	//   38   72:aload_2         
	//   39   73:ldc2w           #231 <Long 250L>
	//   40   76:invokevirtual   #236 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   41   79:pop             
			valueanimator.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

				public void onAnimationEnd(Animator animator)
				{
					c.onViewShown();
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field BaseTransientBottomBar c>
				//    2    4:invokevirtual   #23  <Method void BaseTransientBottomBar.onViewShown()>
				//    3    7:return          
				}

				public void onAnimationStart(Animator animator)
				{
					c.mContentViewCallback.animateContentIn(70, 180);
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field BaseTransientBottomBar c>
				//    2    4:invokestatic    #28  <Method BaseTransientBottomBar$ContentViewCallback BaseTransientBottomBar.access$000(BaseTransientBottomBar)>
				//    3    7:bipush          70
				//    4    9:sipush          180
				//    5   12:invokeinterface #34  <Method void BaseTransientBottomBar$ContentViewCallback.animateContentIn(int, int)>
				//    6   17:return          
				}

				final BaseTransientBottomBar c;

			
			{
				c = BaseTransientBottomBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field BaseTransientBottomBar c>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void AnimatorListenerAdapter()>
			//    5    9:return          
			}
			}
)));
	//   42   80:aload_2         
	//   43   81:new             #29  <Class BaseTransientBottomBar$8>
	//   44   84:dup             
	//   45   85:aload_0         
	//   46   86:invokespecial   #305 <Method void BaseTransientBottomBar$8(BaseTransientBottomBar)>
	//   47   89:invokevirtual   #243 <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
			valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(i) {

				public void onAnimationUpdate(ValueAnimator valueanimator1)
				{
					int j = ((Integer)valueanimator1.getAnimatedValue()).intValue();
				//    0    0:aload_1         
				//    1    1:invokevirtual   #35  <Method Object ValueAnimator.getAnimatedValue()>
				//    2    4:checkcast       #37  <Class Integer>
				//    3    7:invokevirtual   #41  <Method int Integer.intValue()>
				//    4   10:istore_2        
					if(BaseTransientBottomBar.USE_OFFSET_API)
				//*   5   11:invokestatic    #45  <Method boolean BaseTransientBottomBar.access$100()>
				//*   6   14:ifeq            36
						ViewCompat.offsetTopAndBottom(((View) (b.mView)), j - d);
				//    7   17:aload_0         
				//    8   18:getfield        #20  <Field BaseTransientBottomBar b>
				//    9   21:getfield        #49  <Field BaseTransientBottomBar$c BaseTransientBottomBar.mView>
				//   10   24:iload_2         
				//   11   25:aload_0         
				//   12   26:getfield        #26  <Field int d>
				//   13   29:isub            
				//   14   30:invokestatic    #55  <Method void ViewCompat.offsetTopAndBottom(View, int)>
					else
				//*  15   33:goto            48
						b.mView.setTranslationY(j);
				//   16   36:aload_0         
				//   17   37:getfield        #20  <Field BaseTransientBottomBar b>
				//   18   40:getfield        #49  <Field BaseTransientBottomBar$c BaseTransientBottomBar.mView>
				//   19   43:iload_2         
				//   20   44:i2f             
				//   21   45:invokevirtual   #61  <Method void BaseTransientBottomBar$c.setTranslationY(float)>
					d = j;
				//   22   48:aload_0         
				//   23   49:iload_2         
				//   24   50:putfield        #26  <Field int d>
				//   25   53:return          
				}

				final int a;
				final BaseTransientBottomBar b;
				private int d;

			
			{
				b = BaseTransientBottomBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field BaseTransientBottomBar b>
				a = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #22  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
				d = a;
			//    8   14:aload_0         
			//    9   15:aload_0         
			//   10   16:getfield        #22  <Field int a>
			//   11   19:putfield        #26  <Field int d>
			//   12   22:return          
			}
			}
);
	//   48   92:aload_2         
	//   49   93:new             #13  <Class BaseTransientBottomBar$15>
	//   50   96:dup             
	//   51   97:aload_0         
	//   52   98:iload_1         
	//   53   99:invokespecial   #306 <Method void BaseTransientBottomBar$15(BaseTransientBottomBar, int)>
	//   54  102:invokevirtual   #248 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
			valueanimator.start();
	//   55  105:aload_2         
	//   56  106:invokevirtual   #251 <Method void ValueAnimator.start()>
			return;
	//   57  109:return          
		} else
		{
			Animation animation = AnimationUtils.loadAnimation(mView.getContext(), android.support.design.R.anim.design_snackbar_in);
	//   58  110:aload_0         
	//   59  111:getfield        #168 <Field BaseTransientBottomBar$c mView>
	//   60  114:invokevirtual   #252 <Method Context BaseTransientBottomBar$c.getContext()>
	//   61  117:getstatic       #309 <Field int android.support.design.R$anim.design_snackbar_in>
	//   62  120:invokestatic    #263 <Method Animation AnimationUtils.loadAnimation(Context, int)>
	//   63  123:astore_2        
			animation.setInterpolator(p.a);
	//   64  124:aload_2         
	//   65  125:getstatic       #226 <Field android.view.animation.Interpolator p.a>
	//   66  128:invokevirtual   #268 <Method void Animation.setInterpolator(android.view.animation.Interpolator)>
			animation.setDuration(250L);
	//   67  131:aload_2         
	//   68  132:ldc2w           #231 <Long 250L>
	//   69  135:invokevirtual   #271 <Method void Animation.setDuration(long)>
			animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

				public void onAnimationEnd(Animation animation1)
				{
					b.onViewShown();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field BaseTransientBottomBar b>
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

				final BaseTransientBottomBar b;

			
			{
				b = BaseTransientBottomBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BaseTransientBottomBar b>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   70  138:aload_2         
	//   71  139:new             #11  <Class BaseTransientBottomBar$13>
	//   72  142:dup             
	//   73  143:aload_0         
	//   74  144:invokespecial   #310 <Method void BaseTransientBottomBar$13(BaseTransientBottomBar)>
	//   75  147:invokevirtual   #276 <Method void Animation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
			mView.startAnimation(animation);
	//   76  150:aload_0         
	//   77  151:getfield        #168 <Field BaseTransientBottomBar$c mView>
	//   78  154:aload_2         
	//   79  155:invokevirtual   #280 <Method void BaseTransientBottomBar$c.startAnimation(Animation)>
			return;
	//   80  158:return          
		}
	}

	public void dismiss()
	{
		dispatchDismiss(3);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:invokevirtual   #314 <Method void dispatchDismiss(int)>
	//    3    5:return          
	}

	void dispatchDismiss(int i)
	{
		x.b().b(mManagerCallback, i);
	//    0    0:invokestatic    #319 <Method x x.b()>
	//    1    3:aload_0         
	//    2    4:getfield        #123 <Field o.x$e mManagerCallback>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #322 <Method void x.b(o.x$e, int)>
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
	//    1    1:getfield        #325 <Field int mDuration>
	//    2    4:ireturn         
	}

	public View getView()
	{
		return ((View) (mView));
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field BaseTransientBottomBar$c mView>
	//    2    4:areturn         
	}

	final void hideView(int i)
	{
		if(shouldAnimate() && mView.getVisibility() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #331 <Method boolean shouldAnimate()>
	//*   2    4:ifeq            23
	//*   3    7:aload_0         
	//*   4    8:getfield        #168 <Field BaseTransientBottomBar$c mView>
	//*   5   11:invokevirtual   #334 <Method int BaseTransientBottomBar$c.getVisibility()>
	//*   6   14:ifne            23
		{
			animateViewOut(i);
	//    7   17:aload_0         
	//    8   18:iload_1         
	//    9   19:invokespecial   #336 <Method void animateViewOut(int)>
			return;
	//   10   22:return          
		} else
		{
			onViewHidden(i);
	//   11   23:aload_0         
	//   12   24:iload_1         
	//   13   25:invokevirtual   #339 <Method void onViewHidden(int)>
			return;
	//   14   28:return          
		}
	}

	public boolean isShown()
	{
		return x.b().b(mManagerCallback);
	//    0    0:invokestatic    #319 <Method x x.b()>
	//    1    3:aload_0         
	//    2    4:getfield        #123 <Field o.x$e mManagerCallback>
	//    3    7:invokevirtual   #343 <Method boolean x.b(o.x$e)>
	//    4   10:ireturn         
	}

	public boolean isShownOrQueued()
	{
		return x.b().i(mManagerCallback);
	//    0    0:invokestatic    #319 <Method x x.b()>
	//    1    3:aload_0         
	//    2    4:getfield        #123 <Field o.x$e mManagerCallback>
	//    3    7:invokevirtual   #347 <Method boolean x.i(o.x$e)>
	//    4   10:ireturn         
	}

	void onViewHidden(int i)
	{
		x.b().d(mManagerCallback);
	//    0    0:invokestatic    #319 <Method x x.b()>
	//    1    3:aload_0         
	//    2    4:getfield        #123 <Field o.x$e mManagerCallback>
	//    3    7:invokevirtual   #351 <Method void x.d(o.x$e)>
		if(mCallbacks != null)
	//*   4   10:aload_0         
	//*   5   11:getfield        #284 <Field List mCallbacks>
	//*   6   14:ifnull          58
		{
			for(int j = mCallbacks.size() - 1; j >= 0; j--)
	//*   7   17:aload_0         
	//*   8   18:getfield        #284 <Field List mCallbacks>
	//*   9   21:invokeinterface #354 <Method int List.size()>
	//*  10   26:iconst_1        
	//*  11   27:isub            
	//*  12   28:istore_2        
	//*  13   29:iload_2         
	//*  14   30:iflt            58
				((BaseCallback)mCallbacks.get(j)).onDismissed(((Object) (this)), i);
	//   15   33:aload_0         
	//   16   34:getfield        #284 <Field List mCallbacks>
	//   17   37:iload_2         
	//   18   38:invokeinterface #358 <Method Object List.get(int)>
	//   19   43:checkcast       #33  <Class BaseTransientBottomBar$BaseCallback>
	//   20   46:aload_0         
	//   21   47:iload_1         
	//   22   48:invokevirtual   #362 <Method void BaseTransientBottomBar$BaseCallback.onDismissed(Object, int)>

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
	//   32   67:getfield        #168 <Field BaseTransientBottomBar$c mView>
	//   33   70:bipush          8
	//   34   72:invokevirtual   #365 <Method void BaseTransientBottomBar$c.setVisibility(int)>
		android.view.ViewParent viewparent = mView.getParent();
	//   35   75:aload_0         
	//   36   76:getfield        #168 <Field BaseTransientBottomBar$c mView>
	//   37   79:invokevirtual   #369 <Method android.view.ViewParent BaseTransientBottomBar$c.getParent()>
	//   38   82:astore_3        
		if(viewparent instanceof ViewGroup)
	//*  39   83:aload_3         
	//*  40   84:instanceof      #140 <Class ViewGroup>
	//*  41   87:ifeq            101
			((ViewGroup)viewparent).removeView(((View) (mView)));
	//   42   90:aload_3         
	//   43   91:checkcast       #140 <Class ViewGroup>
	//   44   94:aload_0         
	//   45   95:getfield        #168 <Field BaseTransientBottomBar$c mView>
	//   46   98:invokevirtual   #372 <Method void ViewGroup.removeView(View)>
	//   47  101:return          
	}

	void onViewShown()
	{
		x.b().a(mManagerCallback);
	//    0    0:invokestatic    #319 <Method x x.b()>
	//    1    3:aload_0         
	//    2    4:getfield        #123 <Field o.x$e mManagerCallback>
	//    3    7:invokevirtual   #375 <Method void x.a(o.x$e)>
		if(mCallbacks != null)
	//*   4   10:aload_0         
	//*   5   11:getfield        #284 <Field List mCallbacks>
	//*   6   14:ifnull          57
		{
			for(int i = mCallbacks.size() - 1; i >= 0; i--)
	//*   7   17:aload_0         
	//*   8   18:getfield        #284 <Field List mCallbacks>
	//*   9   21:invokeinterface #354 <Method int List.size()>
	//*  10   26:iconst_1        
	//*  11   27:isub            
	//*  12   28:istore_1        
	//*  13   29:iload_1         
	//*  14   30:iflt            57
				((BaseCallback)mCallbacks.get(i)).onShown(((Object) (this)));
	//   15   33:aload_0         
	//   16   34:getfield        #284 <Field List mCallbacks>
	//   17   37:iload_1         
	//   18   38:invokeinterface #358 <Method Object List.get(int)>
	//   19   43:checkcast       #33  <Class BaseTransientBottomBar$BaseCallback>
	//   20   46:aload_0         
	//   21   47:invokevirtual   #379 <Method void BaseTransientBottomBar$BaseCallback.onShown(Object)>

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
		if(basecallback == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		if(mCallbacks == null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #284 <Field List mCallbacks>
	//*   6   10:ifnonnull       15
		{
			return this;
	//    7   13:aload_0         
	//    8   14:areturn         
		} else
		{
			mCallbacks.remove(((Object) (basecallback)));
	//    9   15:aload_0         
	//   10   16:getfield        #284 <Field List mCallbacks>
	//   11   19:aload_1         
	//   12   20:invokeinterface #383 <Method boolean List.remove(Object)>
	//   13   25:pop             
			return this;
	//   14   26:aload_0         
	//   15   27:areturn         
		}
	}

	public BaseTransientBottomBar setDuration(int i)
	{
		mDuration = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #325 <Field int mDuration>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	boolean shouldAnimate()
	{
		return !mAccessibilityManager.isEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #202 <Field AccessibilityManager mAccessibilityManager>
	//    2    4:invokevirtual   #388 <Method boolean AccessibilityManager.isEnabled()>
	//    3    7:ifne            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public void show()
	{
		x.b().c(mDuration, mManagerCallback);
	//    0    0:invokestatic    #319 <Method x x.b()>
	//    1    3:aload_0         
	//    2    4:getfield        #325 <Field int mDuration>
	//    3    7:aload_0         
	//    4    8:getfield        #123 <Field o.x$e mManagerCallback>
	//    5   11:invokevirtual   #392 <Method void x.c(int, o.x$e)>
	//    6   14:return          
	}

	final void showView()
	{
		if(mView.getParent() == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #168 <Field BaseTransientBottomBar$c mView>
	//*   2    4:invokevirtual   #369 <Method android.view.ViewParent BaseTransientBottomBar$c.getParent()>
	//*   3    7:ifnonnull       92
		{
			Object obj = ((Object) (mView.getLayoutParams()));
	//    4   10:aload_0         
	//    5   11:getfield        #168 <Field BaseTransientBottomBar$c mView>
	//    6   14:invokevirtual   #397 <Method android.view.ViewGroup$LayoutParams BaseTransientBottomBar$c.getLayoutParams()>
	//    7   17:astore_1        
			if(obj instanceof CoordinatorLayout.LayoutParams)
	//*   8   18:aload_1         
	//*   9   19:instanceof      #399 <Class CoordinatorLayout$LayoutParams>
	//*  10   22:ifeq            81
			{
				obj = ((Object) ((CoordinatorLayout.LayoutParams)obj));
	//   11   25:aload_1         
	//   12   26:checkcast       #399 <Class CoordinatorLayout$LayoutParams>
	//   13   29:astore_1        
				Behavior behavior = new Behavior();
	//   14   30:new             #39  <Class BaseTransientBottomBar$Behavior>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:invokespecial   #400 <Method void BaseTransientBottomBar$Behavior(BaseTransientBottomBar)>
	//   18   38:astore_2        
				behavior.setStartAlphaSwipeDistance(0.1F);
	//   19   39:aload_2         
	//   20   40:ldc2            #401 <Float 0.1F>
	//   21   43:invokevirtual   #404 <Method void BaseTransientBottomBar$Behavior.setStartAlphaSwipeDistance(float)>
				behavior.setEndAlphaSwipeDistance(0.6F);
	//   22   46:aload_2         
	//   23   47:ldc2            #405 <Float 0.6F>
	//   24   50:invokevirtual   #408 <Method void BaseTransientBottomBar$Behavior.setEndAlphaSwipeDistance(float)>
				behavior.setSwipeDirection(0);
	//   25   53:aload_2         
	//   26   54:iconst_0        
	//   27   55:invokevirtual   #411 <Method void BaseTransientBottomBar$Behavior.setSwipeDirection(int)>
				behavior.setListener(new SwipeDismissBehavior.OnDismissListener() {

					public void onDismiss(View view)
					{
						view.setVisibility(8);
					//    0    0:aload_1         
					//    1    1:bipush          8
					//    2    3:invokevirtual   #28  <Method void View.setVisibility(int)>
						e.dispatchDismiss(0);
					//    3    6:aload_0         
					//    4    7:getfield        #17  <Field BaseTransientBottomBar e>
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
							x.b().e(e.mManagerCallback);
					//    3   29:invokestatic    #38  <Method x x.b()>
					//    4   32:aload_0         
					//    5   33:getfield        #17  <Field BaseTransientBottomBar e>
					//    6   36:getfield        #42  <Field o.x$e BaseTransientBottomBar.mManagerCallback>
					//    7   39:invokevirtual   #45  <Method void x.e(o.x$e)>
							return;
					//    8   42:return          

						case 0: // '\0'
							x.b().c(e.mManagerCallback);
					//    9   43:invokestatic    #38  <Method x x.b()>
					//   10   46:aload_0         
					//   11   47:getfield        #17  <Field BaseTransientBottomBar e>
					//   12   50:getfield        #42  <Field o.x$e BaseTransientBottomBar.mManagerCallback>
					//   13   53:invokevirtual   #48  <Method void x.c(o.x$e)>
							return;
					//   14   56:return          
						}
					}

					final BaseTransientBottomBar e;

			
			{
				e = BaseTransientBottomBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BaseTransientBottomBar e>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
);
	//   28   58:aload_2         
	//   29   59:new             #31  <Class BaseTransientBottomBar$9>
	//   30   62:dup             
	//   31   63:aload_0         
	//   32   64:invokespecial   #412 <Method void BaseTransientBottomBar$9(BaseTransientBottomBar)>
	//   33   67:invokevirtual   #416 <Method void BaseTransientBottomBar$Behavior.setListener(SwipeDismissBehavior$OnDismissListener)>
				((CoordinatorLayout.LayoutParams) (obj)).setBehavior(((CoordinatorLayout.Behavior) (behavior)));
	//   34   70:aload_1         
	//   35   71:aload_2         
	//   36   72:invokevirtual   #420 <Method void CoordinatorLayout$LayoutParams.setBehavior(CoordinatorLayout$Behavior)>
				obj.insetEdge = 80;
	//   37   75:aload_1         
	//   38   76:bipush          80
	//   39   78:putfield        #423 <Field int CoordinatorLayout$LayoutParams.insetEdge>
			}
			mTargetParent.addView(((View) (mView)));
	//   40   81:aload_0         
	//   41   82:getfield        #136 <Field ViewGroup mTargetParent>
	//   42   85:aload_0         
	//   43   86:getfield        #168 <Field BaseTransientBottomBar$c mView>
	//   44   89:invokevirtual   #424 <Method void ViewGroup.addView(View)>
		}
		mView.setOnAttachStateChangeListener(new e() {

			public void a(View view)
			{
				if(b.isShownOrQueued())
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field BaseTransientBottomBar b>
			//*   2    4:invokevirtual   #28  <Method boolean BaseTransientBottomBar.isShownOrQueued()>
			//*   3    7:ifeq            25
					BaseTransientBottomBar.sHandler.post(new Runnable(this) {

						public void run()
						{
							d.b.onViewHidden(3);
						//    0    0:aload_0         
						//    1    1:getfield        #17  <Field BaseTransientBottomBar$7 d>
						//    2    4:getfield        #26  <Field BaseTransientBottomBar BaseTransientBottomBar$7.b>
						//    3    7:iconst_3        
						//    4    8:invokevirtual   #32  <Method void BaseTransientBottomBar.onViewHidden(int)>
						//    5   11:return          
						}

						final _cls7 d;

			
			{
				d = _pcls7;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BaseTransientBottomBar$7 d>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
					}
);
			//    4   10:getstatic       #32  <Field Handler BaseTransientBottomBar.sHandler>
			//    5   13:new             #13  <Class BaseTransientBottomBar$7$4>
			//    6   16:dup             
			//    7   17:aload_0         
			//    8   18:invokespecial   #35  <Method void BaseTransientBottomBar$7$4(BaseTransientBottomBar$7)>
			//    9   21:invokevirtual   #41  <Method boolean Handler.post(Runnable)>
			//   10   24:pop             
			//   11   25:return          
			}

			public void e(View view)
			{
			//    0    0:return          
			}

			final BaseTransientBottomBar b;

			
			{
				b = BaseTransientBottomBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BaseTransientBottomBar b>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   45   92:aload_0         
	//   46   93:getfield        #168 <Field BaseTransientBottomBar$c mView>
	//   47   96:new             #25  <Class BaseTransientBottomBar$7>
	//   48   99:dup             
	//   49  100:aload_0         
	//   50  101:invokespecial   #425 <Method void BaseTransientBottomBar$7(BaseTransientBottomBar)>
	//   51  104:invokevirtual   #429 <Method void BaseTransientBottomBar$c.setOnAttachStateChangeListener(BaseTransientBottomBar$e)>
		if(ViewCompat.isLaidOut(((View) (mView))))
	//*  52  107:aload_0         
	//*  53  108:getfield        #168 <Field BaseTransientBottomBar$c mView>
	//*  54  111:invokestatic    #433 <Method boolean ViewCompat.isLaidOut(View)>
	//*  55  114:ifeq            134
		{
			if(shouldAnimate())
	//*  56  117:aload_0         
	//*  57  118:invokevirtual   #331 <Method boolean shouldAnimate()>
	//*  58  121:ifeq            129
			{
				animateViewIn();
	//   59  124:aload_0         
	//   60  125:invokevirtual   #435 <Method void animateViewIn()>
				return;
	//   61  128:return          
			} else
			{
				onViewShown();
	//   62  129:aload_0         
	//   63  130:invokevirtual   #437 <Method void onViewShown()>
				return;
	//   64  133:return          
			}
		} else
		{
			mView.setOnLayoutChangeListener(new b() {

				public void a(View view, int i, int j, int k, int l)
				{
					e.mView.setOnLayoutChangeListener(((b) (null)));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field BaseTransientBottomBar e>
				//    2    4:getfield        #26  <Field BaseTransientBottomBar$c BaseTransientBottomBar.mView>
				//    3    7:aconst_null     
				//    4    8:invokevirtual   #32  <Method void BaseTransientBottomBar$c.setOnLayoutChangeListener(BaseTransientBottomBar$b)>
					if(e.shouldAnimate())
				//*   5   11:aload_0         
				//*   6   12:getfield        #17  <Field BaseTransientBottomBar e>
				//*   7   15:invokevirtual   #36  <Method boolean BaseTransientBottomBar.shouldAnimate()>
				//*   8   18:ifeq            29
					{
						e.animateViewIn();
				//    9   21:aload_0         
				//   10   22:getfield        #17  <Field BaseTransientBottomBar e>
				//   11   25:invokevirtual   #39  <Method void BaseTransientBottomBar.animateViewIn()>
						return;
				//   12   28:return          
					} else
					{
						e.onViewShown();
				//   13   29:aload_0         
				//   14   30:getfield        #17  <Field BaseTransientBottomBar e>
				//   15   33:invokevirtual   #42  <Method void BaseTransientBottomBar.onViewShown()>
						return;
				//   16   36:return          
					}
				}

				final BaseTransientBottomBar e;

			
			{
				e = BaseTransientBottomBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BaseTransientBottomBar e>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   65  134:aload_0         
	//   66  135:getfield        #168 <Field BaseTransientBottomBar$c mView>
	//   67  138:new             #9   <Class BaseTransientBottomBar$10>
	//   68  141:dup             
	//   69  142:aload_0         
	//   70  143:invokespecial   #438 <Method void BaseTransientBottomBar$10(BaseTransientBottomBar)>
	//   71  146:invokevirtual   #442 <Method void BaseTransientBottomBar$c.setOnLayoutChangeListener(BaseTransientBottomBar$b)>
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
		//*   2    4:lookupswitch    2: default 32
		//		               0: 35
		//		               1: 47
		//*   3   32:goto            63
			case 0: // '\0'
				((BaseTransientBottomBar)message.obj).showView();
		//    4   35:aload_1         
		//    5   36:getfield        #25  <Field Object Message.obj>
		//    6   39:checkcast       #8   <Class BaseTransientBottomBar>
		//    7   42:invokevirtual   #28  <Method void BaseTransientBottomBar.showView()>
				return true;
		//    8   45:iconst_1        
		//    9   46:ireturn         

			case 1: // '\001'
				((BaseTransientBottomBar)message.obj).hideView(message.arg1);
		//   10   47:aload_1         
		//   11   48:getfield        #25  <Field Object Message.obj>
		//   12   51:checkcast       #8   <Class BaseTransientBottomBar>
		//   13   54:aload_1         
		//   14   55:getfield        #31  <Field int Message.arg1>
		//   15   58:invokevirtual   #35  <Method void BaseTransientBottomBar.hideView(int)>
				return true;
		//   16   61:iconst_1        
		//   17   62:ireturn         
			}
			return false;
		//   18   63:iconst_0        
		//   19   64:ireturn         
		}

	}
);
	private final AccessibilityManager mAccessibilityManager;
	private List mCallbacks;
	private final ContentViewCallback mContentViewCallback;
	private final Context mContext;
	private int mDuration;
	final o.x.e mManagerCallback = new o.x.e() {

		public void c()
		{
			BaseTransientBottomBar.sHandler.sendMessage(BaseTransientBottomBar.sHandler.obtainMessage(0, ((Object) (d))));
		//    0    0:getstatic       #23  <Field Handler BaseTransientBottomBar.sHandler>
		//    1    3:getstatic       #23  <Field Handler BaseTransientBottomBar.sHandler>
		//    2    6:iconst_0        
		//    3    7:aload_0         
		//    4    8:getfield        #14  <Field BaseTransientBottomBar d>
		//    5   11:invokevirtual   #29  <Method Message Handler.obtainMessage(int, Object)>
		//    6   14:invokevirtual   #33  <Method boolean Handler.sendMessage(Message)>
		//    7   17:pop             
		//    8   18:return          
		}

		public void c(int i)
		{
			BaseTransientBottomBar.sHandler.sendMessage(BaseTransientBottomBar.sHandler.obtainMessage(1, i, 0, ((Object) (d))));
		//    0    0:getstatic       #23  <Field Handler BaseTransientBottomBar.sHandler>
		//    1    3:getstatic       #23  <Field Handler BaseTransientBottomBar.sHandler>
		//    2    6:iconst_1        
		//    3    7:iload_1         
		//    4    8:iconst_0        
		//    5    9:aload_0         
		//    6   10:getfield        #14  <Field BaseTransientBottomBar d>
		//    7   13:invokevirtual   #37  <Method Message Handler.obtainMessage(int, int, int, Object)>
		//    8   16:invokevirtual   #33  <Method boolean Handler.sendMessage(Message)>
		//    9   19:pop             
		//   10   20:return          
		}

		final BaseTransientBottomBar d;

			
			{
				d = BaseTransientBottomBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field BaseTransientBottomBar d>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private final ViewGroup mTargetParent;
	final c mView;

	static 
	{
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 16 && android.os.Build.VERSION.SDK_INT <= 19)
	//*   0    0:getstatic       #96  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          21
	//*   3    8:getstatic       #96  <Field int android.os.Build$VERSION.SDK_INT>
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
	//   12   24:putstatic       #98  <Field boolean USE_OFFSET_API>
	//   13   27:new             #100 <Class Handler>
	//   14   30:dup             
	//   15   31:invokestatic    #106 <Method Looper Looper.getMainLooper()>
	//   16   34:new             #17  <Class BaseTransientBottomBar$3>
	//   17   37:dup             
	//   18   38:invokespecial   #109 <Method void BaseTransientBottomBar$3()>
	//   19   41:invokespecial   #112 <Method void Handler(Looper, android.os.Handler$Callback)>
	//   20   44:putstatic       #114 <Field Handler sHandler>
	//*  21   47:return          
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