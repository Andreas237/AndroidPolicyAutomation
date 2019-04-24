// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.view.*;
import java.lang.annotation.Annotation;

// Referenced classes of package android.support.design.widget:
//			CoordinatorLayout

public class SwipeDismissBehavior extends CoordinatorLayout.Behavior
{
	public static interface OnDismissListener
	{

		public abstract void onDismiss(View view);

		public abstract void onDragStateChanged(int i);
	}

	private class SettleRunnable
		implements Runnable
	{

		public void run()
		{
			if(mViewDragHelper != null && mViewDragHelper.continueSettling(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field SwipeDismissBehavior this$0>
		//*   2    4:getfield        #32  <Field ViewDragHelper SwipeDismissBehavior.mViewDragHelper>
		//*   3    7:ifnull          33
		//*   4   10:aload_0         
		//*   5   11:getfield        #19  <Field SwipeDismissBehavior this$0>
		//*   6   14:getfield        #32  <Field ViewDragHelper SwipeDismissBehavior.mViewDragHelper>
		//*   7   17:iconst_1        
		//*   8   18:invokevirtual   #38  <Method boolean ViewDragHelper.continueSettling(boolean)>
		//*   9   21:ifeq            33
				ViewCompat.postOnAnimation(mView, ((Runnable) (this)));
		//   10   24:aload_0         
		//   11   25:getfield        #24  <Field View mView>
		//   12   28:aload_0         
		//   13   29:invokestatic    #44  <Method void ViewCompat.postOnAnimation(View, Runnable)>
			else
		//*  14   32:return          
			if(mDismiss && mListener != null)
		//*  15   33:aload_0         
		//*  16   34:getfield        #26  <Field boolean mDismiss>
		//*  17   37:ifeq            32
		//*  18   40:aload_0         
		//*  19   41:getfield        #19  <Field SwipeDismissBehavior this$0>
		//*  20   44:getfield        #48  <Field SwipeDismissBehavior$OnDismissListener SwipeDismissBehavior.mListener>
		//*  21   47:ifnull          32
			{
				mListener.onDismiss(mView);
		//   22   50:aload_0         
		//   23   51:getfield        #19  <Field SwipeDismissBehavior this$0>
		//   24   54:getfield        #48  <Field SwipeDismissBehavior$OnDismissListener SwipeDismissBehavior.mListener>
		//   25   57:aload_0         
		//   26   58:getfield        #24  <Field View mView>
		//   27   61:invokeinterface #54  <Method void SwipeDismissBehavior$OnDismissListener.onDismiss(View)>
				return;
		//   28   66:return          
			}
		}

		private final boolean mDismiss;
		private final View mView;
		final SwipeDismissBehavior this$0;

		SettleRunnable(View view, boolean flag)
		{
			this$0 = SwipeDismissBehavior.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field SwipeDismissBehavior this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
			mView = view;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field View mView>
			mDismiss = flag;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #26  <Field boolean mDismiss>
		//   11   19:return          
		}
	}

	private static interface SwipeDirection
		extends Annotation
	{
	}


	public SwipeDismissBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void CoordinatorLayout$Behavior()>
		mSensitivity = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #52  <Field float mSensitivity>
		mSwipeDirection = 2;
	//    5    9:aload_0         
	//    6   10:iconst_2        
	//    7   11:putfield        #54  <Field int mSwipeDirection>
		mDragDismissThreshold = 0.5F;
	//    8   14:aload_0         
	//    9   15:ldc1            #19  <Float 0.5F>
	//   10   17:putfield        #56  <Field float mDragDismissThreshold>
		mAlphaStartSwipeDistance = 0.0F;
	//   11   20:aload_0         
	//   12   21:fconst_0        
	//   13   22:putfield        #58  <Field float mAlphaStartSwipeDistance>
		mAlphaEndSwipeDistance = 0.5F;
	//   14   25:aload_0         
	//   15   26:ldc1            #19  <Float 0.5F>
	//   16   28:putfield        #60  <Field float mAlphaEndSwipeDistance>
	//   17   31:aload_0         
	//   18   32:new             #7   <Class SwipeDismissBehavior$1>
	//   19   35:dup             
	//   20   36:aload_0         
	//   21   37:invokespecial   #63  <Method void SwipeDismissBehavior$1(SwipeDismissBehavior)>
	//   22   40:putfield        #65  <Field android.support.v4.widget.ViewDragHelper$Callback mDragCallback>
	//   23   43:return          
	}

	static float clamp(float f, float f1, float f2)
	{
		return Math.min(Math.max(f, f1), f2);
	//    0    0:fload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #74  <Method float Math.max(float, float)>
	//    3    5:fload_2         
	//    4    6:invokestatic    #77  <Method float Math.min(float, float)>
	//    5    9:freturn         
	}

	static int clamp(int i, int j, int k)
	{
		return Math.min(Math.max(i, j), k);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #81  <Method int Math.max(int, int)>
	//    3    5:iload_2         
	//    4    6:invokestatic    #83  <Method int Math.min(int, int)>
	//    5    9:ireturn         
	}

	private void ensureViewDragHelper(ViewGroup viewgroup)
	{
		if(mViewDragHelper == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field ViewDragHelper mViewDragHelper>
	//*   2    4:ifnonnull       32
		{
			if(mSensitivitySet)
	//*   3    7:aload_0         
	//*   4    8:getfield        #89  <Field boolean mSensitivitySet>
	//*   5   11:ifeq            33
				viewgroup = ((ViewGroup) (ViewDragHelper.create(viewgroup, mSensitivity, mDragCallback)));
	//    6   14:aload_1         
	//    7   15:aload_0         
	//    8   16:getfield        #52  <Field float mSensitivity>
	//    9   19:aload_0         
	//   10   20:getfield        #65  <Field android.support.v4.widget.ViewDragHelper$Callback mDragCallback>
	//   11   23:invokestatic    #95  <Method ViewDragHelper ViewDragHelper.create(ViewGroup, float, android.support.v4.widget.ViewDragHelper$Callback)>
	//   12   26:astore_1        
			else
	//*  13   27:aload_0         
	//*  14   28:aload_1         
	//*  15   29:putfield        #87  <Field ViewDragHelper mViewDragHelper>
	//*  16   32:return          
				viewgroup = ((ViewGroup) (ViewDragHelper.create(viewgroup, mDragCallback)));
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #65  <Field android.support.v4.widget.ViewDragHelper$Callback mDragCallback>
	//   20   38:invokestatic    #98  <Method ViewDragHelper ViewDragHelper.create(ViewGroup, android.support.v4.widget.ViewDragHelper$Callback)>
	//   21   41:astore_1        
			mViewDragHelper = ((ViewDragHelper) (viewgroup));
		}
	//*  22   42:goto            27
	}

	static float fraction(float f, float f1, float f2)
	{
		return (f2 - f) / (f1 - f);
	//    0    0:fload_2         
	//    1    1:fload_0         
	//    2    2:fsub            
	//    3    3:fload_1         
	//    4    4:fload_0         
	//    5    5:fsub            
	//    6    6:fdiv            
	//    7    7:freturn         
	}

	public boolean canSwipeDismissView(View view)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public int getDragState()
	{
		if(mViewDragHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field ViewDragHelper mViewDragHelper>
	//*   2    4:ifnull          15
			return mViewDragHelper.getViewDragState();
	//    3    7:aload_0         
	//    4    8:getfield        #87  <Field ViewDragHelper mViewDragHelper>
	//    5   11:invokevirtual   #108 <Method int ViewDragHelper.getViewDragState()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		boolean flag;
		boolean flag1;
		boolean flag2;
		flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		flag2 = mInterceptingEvents;
	//    2    3:aload_0         
	//    3    4:getfield        #112 <Field boolean mInterceptingEvents>
	//    4    7:istore          6
		flag = flag2;
	//    5    9:iload           6
	//    6   11:istore          4
		motionevent.getActionMasked();
	//    7   13:aload_3         
	//    8   14:invokevirtual   #117 <Method int MotionEvent.getActionMasked()>
		JVM INSTR tableswitch 0 3: default 48
	//	               0 75
	//	               1 103
	//	               2 52
	//	               3 103;
	//    9   17:tableswitch     0 3: default 48
	//	               0 75
	//	               1 103
	//	               2 52
	//	               3 103
		   goto _L1 _L2 _L3 _L4 _L3
_L4:
		break; /* Loop/switch isn't completed */
_L1:
		flag = flag2;
	//   10   48:iload           6
	//   11   50:istore          4
_L6:
		if(flag)
	//*  12   52:iload           4
	//*  13   54:ifeq            72
		{
			ensureViewDragHelper(((ViewGroup) (coordinatorlayout)));
	//   14   57:aload_0         
	//   15   58:aload_1         
	//   16   59:invokespecial   #119 <Method void ensureViewDragHelper(ViewGroup)>
			flag1 = mViewDragHelper.shouldInterceptTouchEvent(motionevent);
	//   17   62:aload_0         
	//   18   63:getfield        #87  <Field ViewDragHelper mViewDragHelper>
	//   19   66:aload_3         
	//   20   67:invokevirtual   #123 <Method boolean ViewDragHelper.shouldInterceptTouchEvent(MotionEvent)>
	//   21   70:istore          5
		}
		return flag1;
	//   22   72:iload           5
	//   23   74:ireturn         
_L2:
		mInterceptingEvents = coordinatorlayout.isPointInChildBounds(view, (int)motionevent.getX(), (int)motionevent.getY());
	//   24   75:aload_0         
	//   25   76:aload_1         
	//   26   77:aload_2         
	//   27   78:aload_3         
	//   28   79:invokevirtual   #127 <Method float MotionEvent.getX()>
	//   29   82:f2i             
	//   30   83:aload_3         
	//   31   84:invokevirtual   #130 <Method float MotionEvent.getY()>
	//   32   87:f2i             
	//   33   88:invokevirtual   #136 <Method boolean CoordinatorLayout.isPointInChildBounds(View, int, int)>
	//   34   91:putfield        #112 <Field boolean mInterceptingEvents>
		flag = mInterceptingEvents;
	//   35   94:aload_0         
	//   36   95:getfield        #112 <Field boolean mInterceptingEvents>
	//   37   98:istore          4
		continue; /* Loop/switch isn't completed */
	//   38  100:goto            52
_L3:
		mInterceptingEvents = false;
	//   39  103:aload_0         
	//   40  104:iconst_0        
	//   41  105:putfield        #112 <Field boolean mInterceptingEvents>
		flag = flag2;
	//   42  108:iload           6
	//   43  110:istore          4
		if(true) goto _L6; else goto _L5
	//   44  112:goto            52
_L5:
	}

	public boolean onTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		if(mViewDragHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field ViewDragHelper mViewDragHelper>
	//*   2    4:ifnull          17
		{
			mViewDragHelper.processTouchEvent(motionevent);
	//    3    7:aload_0         
	//    4    8:getfield        #87  <Field ViewDragHelper mViewDragHelper>
	//    5   11:aload_3         
	//    6   12:invokevirtual   #143 <Method void ViewDragHelper.processTouchEvent(MotionEvent)>
			return true;
	//    7   15:iconst_1        
	//    8   16:ireturn         
		} else
		{
			return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		}
	}

	public void setDragDismissDistance(float f)
	{
		mDragDismissThreshold = clamp(0.0F, f, 1.0F);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fload_1         
	//    3    3:fconst_1        
	//    4    4:invokestatic    #147 <Method float clamp(float, float, float)>
	//    5    7:putfield        #56  <Field float mDragDismissThreshold>
	//    6   10:return          
	}

	public void setEndAlphaSwipeDistance(float f)
	{
		mAlphaEndSwipeDistance = clamp(0.0F, f, 1.0F);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fload_1         
	//    3    3:fconst_1        
	//    4    4:invokestatic    #147 <Method float clamp(float, float, float)>
	//    5    7:putfield        #60  <Field float mAlphaEndSwipeDistance>
	//    6   10:return          
	}

	public void setListener(OnDismissListener ondismisslistener)
	{
		mListener = ondismisslistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #152 <Field SwipeDismissBehavior$OnDismissListener mListener>
	//    3    5:return          
	}

	public void setSensitivity(float f)
	{
		mSensitivity = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #52  <Field float mSensitivity>
		mSensitivitySet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #89  <Field boolean mSensitivitySet>
	//    6   10:return          
	}

	public void setStartAlphaSwipeDistance(float f)
	{
		mAlphaStartSwipeDistance = clamp(0.0F, f, 1.0F);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fload_1         
	//    3    3:fconst_1        
	//    4    4:invokestatic    #147 <Method float clamp(float, float, float)>
	//    5    7:putfield        #58  <Field float mAlphaStartSwipeDistance>
	//    6   10:return          
	}

	public void setSwipeDirection(int i)
	{
		mSwipeDirection = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #54  <Field int mSwipeDirection>
	//    3    5:return          
	}

	private static final float DEFAULT_ALPHA_END_DISTANCE = 0.5F;
	private static final float DEFAULT_ALPHA_START_DISTANCE = 0F;
	private static final float DEFAULT_DRAG_DISMISS_THRESHOLD = 0.5F;
	public static final int STATE_DRAGGING = 1;
	public static final int STATE_IDLE = 0;
	public static final int STATE_SETTLING = 2;
	public static final int SWIPE_DIRECTION_ANY = 2;
	public static final int SWIPE_DIRECTION_END_TO_START = 1;
	public static final int SWIPE_DIRECTION_START_TO_END = 0;
	float mAlphaEndSwipeDistance;
	float mAlphaStartSwipeDistance;
	private final android.support.v4.widget.ViewDragHelper.Callback mDragCallback = new android.support.v4.widget.ViewDragHelper.Callback() {

		private boolean shouldDismiss(View view, float f)
		{
			if(f == 0.0F) goto _L2; else goto _L1
		//    0    0:fload_2         
		//    1    1:fconst_0        
		//    2    2:fcmpl           
		//    3    3:ifeq            95
_L1:
			boolean flag;
			if(ViewCompat.getLayoutDirection(view) == 1)
		//*   4    6:aload_1         
		//*   5    7:invokestatic    #31  <Method int ViewCompat.getLayoutDirection(View)>
		//*   6   10:iconst_1        
		//*   7   11:icmpne          29
				flag = true;
		//    8   14:iconst_1        
		//    9   15:istore_3        
			else
		//*  10   16:aload_0         
		//*  11   17:getfield        #17  <Field SwipeDismissBehavior this$0>
		//*  12   20:getfield        #34  <Field int SwipeDismissBehavior.mSwipeDirection>
		//*  13   23:iconst_2        
		//*  14   24:icmpne          34
		//*  15   27:iconst_1        
		//*  16   28:ireturn         
				flag = false;
		//   17   29:iconst_0        
		//   18   30:istore_3        
			if(mSwipeDirection != 2) goto _L4; else goto _L3
_L3:
			return true;
		//*  19   31:goto            16
_L4:
			if(mSwipeDirection == 0)
		//*  20   34:aload_0         
		//*  21   35:getfield        #17  <Field SwipeDismissBehavior this$0>
		//*  22   38:getfield        #34  <Field int SwipeDismissBehavior.mSwipeDirection>
		//*  23   41:ifne            64
			{
				if(!flag)
					continue; /* Loop/switch isn't completed */
		//   24   44:iload_3         
		//   25   45:ifeq            56
				if(f >= 0.0F)
		//*  26   48:fload_2         
		//*  27   49:fconst_0        
		//*  28   50:fcmpg           
		//*  29   51:iflt            27
					return false;
		//   30   54:iconst_0        
		//   31   55:ireturn         
				continue; /* Loop/switch isn't completed */
			}
			break MISSING_BLOCK_LABEL_64;
			if(f > 0.0F) goto _L3; else goto _L5
		//   32   56:fload_2         
		//   33   57:fconst_0        
		//   34   58:fcmpl           
		//   35   59:ifgt            27
_L5:
			return false;
		//   36   62:iconst_0        
		//   37   63:ireturn         
			if(mSwipeDirection != 1)
				break; /* Loop/switch isn't completed */
		//   38   64:aload_0         
		//   39   65:getfield        #17  <Field SwipeDismissBehavior this$0>
		//   40   68:getfield        #34  <Field int SwipeDismissBehavior.mSwipeDirection>
		//   41   71:iconst_1        
		//   42   72:icmpne          138
			if(!flag)
				continue; /* Loop/switch isn't completed */
		//   43   75:iload_3         
		//   44   76:ifeq            87
			if(f <= 0.0F)
		//*  45   79:fload_2         
		//*  46   80:fconst_0        
		//*  47   81:fcmpl           
		//*  48   82:ifgt            27
				return false;
		//   49   85:iconst_0        
		//   50   86:ireturn         
			continue; /* Loop/switch isn't completed */
			if(f < 0.0F) goto _L3; else goto _L6
		//   51   87:fload_2         
		//   52   88:fconst_0        
		//   53   89:fcmpg           
		//   54   90:iflt            27
_L6:
			return false;
		//   55   93:iconst_0        
		//   56   94:ireturn         
_L2:
			int i = view.getLeft();
		//   57   95:aload_1         
		//   58   96:invokevirtual   #40  <Method int View.getLeft()>
		//   59   99:istore_3        
			int j = mOriginalCapturedViewLeft;
		//   60  100:aload_0         
		//   61  101:getfield        #42  <Field int mOriginalCapturedViewLeft>
		//   62  104:istore          4
			int k = Math.round((float)view.getWidth() * mDragDismissThreshold);
		//   63  106:aload_1         
		//   64  107:invokevirtual   #45  <Method int View.getWidth()>
		//   65  110:i2f             
		//   66  111:aload_0         
		//   67  112:getfield        #17  <Field SwipeDismissBehavior this$0>
		//   68  115:getfield        #49  <Field float SwipeDismissBehavior.mDragDismissThreshold>
		//   69  118:fmul            
		//   70  119:invokestatic    #55  <Method int Math.round(float)>
		//   71  122:istore          5
			if(Math.abs(i - j) < k)
		//*  72  124:iload_3         
		//*  73  125:iload           4
		//*  74  127:isub            
		//*  75  128:invokestatic    #59  <Method int Math.abs(int)>
		//*  76  131:iload           5
		//*  77  133:icmpge          27
				return false;
		//   78  136:iconst_0        
		//   79  137:ireturn         
			if(true) goto _L3; else goto _L7
_L7:
			return false;
		//   80  138:iconst_0        
		//   81  139:ireturn         
		}

		public int clampViewPositionHorizontal(View view, int i, int j)
		{
			int k;
			if(ViewCompat.getLayoutDirection(view) == 1)
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #31  <Method int ViewCompat.getLayoutDirection(View)>
		//*   2    4:iconst_1        
		//*   3    5:icmpne          48
				j = 1;
		//    4    8:iconst_1        
		//    5    9:istore_3        
			else
		//*   6   10:aload_0         
		//*   7   11:getfield        #17  <Field SwipeDismissBehavior this$0>
		//*   8   14:getfield        #34  <Field int SwipeDismissBehavior.mSwipeDirection>
		//*   9   17:ifne            72
		//*  10   20:iload_3         
		//*  11   21:ifeq            53
		//*  12   24:aload_0         
		//*  13   25:getfield        #42  <Field int mOriginalCapturedViewLeft>
		//*  14   28:aload_1         
		//*  15   29:invokevirtual   #45  <Method int View.getWidth()>
		//*  16   32:isub            
		//*  17   33:istore          4
		//*  18   35:aload_0         
		//*  19   36:getfield        #42  <Field int mOriginalCapturedViewLeft>
		//*  20   39:istore_3        
		//*  21   40:iload           4
		//*  22   42:iload_2         
		//*  23   43:iload_3         
		//*  24   44:invokestatic    #65  <Method int SwipeDismissBehavior.clamp(int, int, int)>
		//*  25   47:ireturn         
				j = 0;
		//   26   48:iconst_0        
		//   27   49:istore_3        
			if(mSwipeDirection == 0)
			{
				if(j != 0)
				{
					k = mOriginalCapturedViewLeft - view.getWidth();
					j = mOriginalCapturedViewLeft;
				} else
		//*  28   50:goto            10
				{
					k = mOriginalCapturedViewLeft;
		//   29   53:aload_0         
		//   30   54:getfield        #42  <Field int mOriginalCapturedViewLeft>
		//   31   57:istore          4
					j = mOriginalCapturedViewLeft + view.getWidth();
		//   32   59:aload_0         
		//   33   60:getfield        #42  <Field int mOriginalCapturedViewLeft>
		//   34   63:aload_1         
		//   35   64:invokevirtual   #45  <Method int View.getWidth()>
		//   36   67:iadd            
		//   37   68:istore_3        
				}
			} else
		//*  38   69:goto            40
			if(mSwipeDirection == 1)
		//*  39   72:aload_0         
		//*  40   73:getfield        #17  <Field SwipeDismissBehavior this$0>
		//*  41   76:getfield        #34  <Field int SwipeDismissBehavior.mSwipeDirection>
		//*  42   79:iconst_1        
		//*  43   80:icmpne          125
			{
				if(j != 0)
		//*  44   83:iload_3         
		//*  45   84:ifeq            106
				{
					k = mOriginalCapturedViewLeft;
		//   46   87:aload_0         
		//   47   88:getfield        #42  <Field int mOriginalCapturedViewLeft>
		//   48   91:istore          4
					j = mOriginalCapturedViewLeft + view.getWidth();
		//   49   93:aload_0         
		//   50   94:getfield        #42  <Field int mOriginalCapturedViewLeft>
		//   51   97:aload_1         
		//   52   98:invokevirtual   #45  <Method int View.getWidth()>
		//   53  101:iadd            
		//   54  102:istore_3        
				} else
		//*  55  103:goto            40
				{
					k = mOriginalCapturedViewLeft - view.getWidth();
		//   56  106:aload_0         
		//   57  107:getfield        #42  <Field int mOriginalCapturedViewLeft>
		//   58  110:aload_1         
		//   59  111:invokevirtual   #45  <Method int View.getWidth()>
		//   60  114:isub            
		//   61  115:istore          4
					j = mOriginalCapturedViewLeft;
		//   62  117:aload_0         
		//   63  118:getfield        #42  <Field int mOriginalCapturedViewLeft>
		//   64  121:istore_3        
				}
			} else
		//*  65  122:goto            40
			{
				k = mOriginalCapturedViewLeft - view.getWidth();
		//   66  125:aload_0         
		//   67  126:getfield        #42  <Field int mOriginalCapturedViewLeft>
		//   68  129:aload_1         
		//   69  130:invokevirtual   #45  <Method int View.getWidth()>
		//   70  133:isub            
		//   71  134:istore          4
				j = mOriginalCapturedViewLeft + view.getWidth();
		//   72  136:aload_0         
		//   73  137:getfield        #42  <Field int mOriginalCapturedViewLeft>
		//   74  140:aload_1         
		//   75  141:invokevirtual   #45  <Method int View.getWidth()>
		//   76  144:iadd            
		//   77  145:istore_3        
			}
			return SwipeDismissBehavior.clamp(k, i, j);
		//*  78  146:goto            40
		}

		public int clampViewPositionVertical(View view, int i, int j)
		{
			return view.getTop();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #69  <Method int View.getTop()>
		//    2    4:ireturn         
		}

		public int getViewHorizontalDragRange(View view)
		{
			return view.getWidth();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #45  <Method int View.getWidth()>
		//    2    4:ireturn         
		}

		public void onViewCaptured(View view, int i)
		{
			mActivePointerId = i;
		//    0    0:aload_0         
		//    1    1:iload_2         
		//    2    2:putfield        #22  <Field int mActivePointerId>
			mOriginalCapturedViewLeft = view.getLeft();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #40  <Method int View.getLeft()>
		//    6   10:putfield        #42  <Field int mOriginalCapturedViewLeft>
			view = ((View) (view.getParent()));
		//    7   13:aload_1         
		//    8   14:invokevirtual   #76  <Method ViewParent View.getParent()>
		//    9   17:astore_1        
			if(view != null)
		//*  10   18:aload_1         
		//*  11   19:ifnull          29
				((ViewParent) (view)).requestDisallowInterceptTouchEvent(true);
		//   12   22:aload_1         
		//   13   23:iconst_1        
		//   14   24:invokeinterface #82  <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
		//   15   29:return          
		}

		public void onViewDragStateChanged(int i)
		{
			if(mListener != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field SwipeDismissBehavior this$0>
		//*   2    4:getfield        #88  <Field SwipeDismissBehavior$OnDismissListener SwipeDismissBehavior.mListener>
		//*   3    7:ifnull          23
				mListener.onDragStateChanged(i);
		//    4   10:aload_0         
		//    5   11:getfield        #17  <Field SwipeDismissBehavior this$0>
		//    6   14:getfield        #88  <Field SwipeDismissBehavior$OnDismissListener SwipeDismissBehavior.mListener>
		//    7   17:iload_1         
		//    8   18:invokeinterface #93  <Method void SwipeDismissBehavior$OnDismissListener.onDragStateChanged(int)>
		//    9   23:return          
		}

		public void onViewPositionChanged(View view, int i, int j, int k, int l)
		{
			float f = (float)mOriginalCapturedViewLeft + (float)view.getWidth() * mAlphaStartSwipeDistance;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field int mOriginalCapturedViewLeft>
		//    2    4:i2f             
		//    3    5:aload_1         
		//    4    6:invokevirtual   #45  <Method int View.getWidth()>
		//    5    9:i2f             
		//    6   10:aload_0         
		//    7   11:getfield        #17  <Field SwipeDismissBehavior this$0>
		//    8   14:getfield        #98  <Field float SwipeDismissBehavior.mAlphaStartSwipeDistance>
		//    9   17:fmul            
		//   10   18:fadd            
		//   11   19:fstore          6
			float f1 = (float)mOriginalCapturedViewLeft + (float)view.getWidth() * mAlphaEndSwipeDistance;
		//   12   21:aload_0         
		//   13   22:getfield        #42  <Field int mOriginalCapturedViewLeft>
		//   14   25:i2f             
		//   15   26:aload_1         
		//   16   27:invokevirtual   #45  <Method int View.getWidth()>
		//   17   30:i2f             
		//   18   31:aload_0         
		//   19   32:getfield        #17  <Field SwipeDismissBehavior this$0>
		//   20   35:getfield        #101 <Field float SwipeDismissBehavior.mAlphaEndSwipeDistance>
		//   21   38:fmul            
		//   22   39:fadd            
		//   23   40:fstore          7
			if((float)i <= f)
		//*  24   42:iload_2         
		//*  25   43:i2f             
		//*  26   44:fload           6
		//*  27   46:fcmpg           
		//*  28   47:ifgt            56
			{
				view.setAlpha(1.0F);
		//   29   50:aload_1         
		//   30   51:fconst_1        
		//   31   52:invokevirtual   #105 <Method void View.setAlpha(float)>
				return;
		//   32   55:return          
			}
			if((float)i >= f1)
		//*  33   56:iload_2         
		//*  34   57:i2f             
		//*  35   58:fload           7
		//*  36   60:fcmpl           
		//*  37   61:iflt            70
			{
				view.setAlpha(0.0F);
		//   38   64:aload_1         
		//   39   65:fconst_0        
		//   40   66:invokevirtual   #105 <Method void View.setAlpha(float)>
				return;
		//   41   69:return          
			} else
			{
				view.setAlpha(SwipeDismissBehavior.clamp(0.0F, 1.0F - SwipeDismissBehavior.fraction(f, f1, i), 1.0F));
		//   42   70:aload_1         
		//   43   71:fconst_0        
		//   44   72:fconst_1        
		//   45   73:fload           6
		//   46   75:fload           7
		//   47   77:iload_2         
		//   48   78:i2f             
		//   49   79:invokestatic    #109 <Method float SwipeDismissBehavior.fraction(float, float, float)>
		//   50   82:fsub            
		//   51   83:fconst_1        
		//   52   84:invokestatic    #111 <Method float SwipeDismissBehavior.clamp(float, float, float)>
		//   53   87:invokevirtual   #105 <Method void View.setAlpha(float)>
				return;
		//   54   90:return          
			}
		}

		public void onViewReleased(View view, float f, float f1)
		{
			mActivePointerId = -1;
		//    0    0:aload_0         
		//    1    1:iconst_m1       
		//    2    2:putfield        #22  <Field int mActivePointerId>
			int i = view.getWidth();
		//    3    5:aload_1         
		//    4    6:invokevirtual   #45  <Method int View.getWidth()>
		//    5    9:istore          4
			boolean flag = false;
		//    6   11:iconst_0        
		//    7   12:istore          5
			if(shouldDismiss(view, f))
		//*   8   14:aload_0         
		//*   9   15:aload_1         
		//*  10   16:fload_2         
		//*  11   17:invokespecial   #115 <Method boolean shouldDismiss(View, float)>
		//*  12   20:ifeq            96
			{
				if(view.getLeft() < mOriginalCapturedViewLeft)
		//*  13   23:aload_1         
		//*  14   24:invokevirtual   #40  <Method int View.getLeft()>
		//*  15   27:aload_0         
		//*  16   28:getfield        #42  <Field int mOriginalCapturedViewLeft>
		//*  17   31:icmpge          84
					i = mOriginalCapturedViewLeft - i;
		//   18   34:aload_0         
		//   19   35:getfield        #42  <Field int mOriginalCapturedViewLeft>
		//   20   38:iload           4
		//   21   40:isub            
		//   22   41:istore          4
				else
		//*  23   43:iconst_1        
		//*  24   44:istore          5
		//*  25   46:aload_0         
		//*  26   47:getfield        #17  <Field SwipeDismissBehavior this$0>
		//*  27   50:getfield        #119 <Field ViewDragHelper SwipeDismissBehavior.mViewDragHelper>
		//*  28   53:iload           4
		//*  29   55:aload_1         
		//*  30   56:invokevirtual   #69  <Method int View.getTop()>
		//*  31   59:invokevirtual   #125 <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
		//*  32   62:ifeq            105
		//*  33   65:aload_1         
		//*  34   66:new             #127 <Class SwipeDismissBehavior$SettleRunnable>
		//*  35   69:dup             
		//*  36   70:aload_0         
		//*  37   71:getfield        #17  <Field SwipeDismissBehavior this$0>
		//*  38   74:aload_1         
		//*  39   75:iload           5
		//*  40   77:invokespecial   #130 <Method void SwipeDismissBehavior$SettleRunnable(SwipeDismissBehavior, View, boolean)>
		//*  41   80:invokestatic    #134 <Method void ViewCompat.postOnAnimation(View, Runnable)>
		//*  42   83:return          
					i = mOriginalCapturedViewLeft + i;
		//   43   84:aload_0         
		//   44   85:getfield        #42  <Field int mOriginalCapturedViewLeft>
		//   45   88:iload           4
		//   46   90:iadd            
		//   47   91:istore          4
				flag = true;
			} else
		//*  48   93:goto            43
			{
				i = mOriginalCapturedViewLeft;
		//   49   96:aload_0         
		//   50   97:getfield        #42  <Field int mOriginalCapturedViewLeft>
		//   51  100:istore          4
			}
			if(mViewDragHelper.settleCapturedViewAt(i, view.getTop()))
				ViewCompat.postOnAnimation(view, ((Runnable) (new SettleRunnable(view, flag))));
			else
		//*  52  102:goto            46
			if(flag && mListener != null)
		//*  53  105:iload           5
		//*  54  107:ifeq            83
		//*  55  110:aload_0         
		//*  56  111:getfield        #17  <Field SwipeDismissBehavior this$0>
		//*  57  114:getfield        #88  <Field SwipeDismissBehavior$OnDismissListener SwipeDismissBehavior.mListener>
		//*  58  117:ifnull          83
			{
				mListener.onDismiss(view);
		//   59  120:aload_0         
		//   60  121:getfield        #17  <Field SwipeDismissBehavior this$0>
		//   61  124:getfield        #88  <Field SwipeDismissBehavior$OnDismissListener SwipeDismissBehavior.mListener>
		//   62  127:aload_1         
		//   63  128:invokeinterface #138 <Method void SwipeDismissBehavior$OnDismissListener.onDismiss(View)>
				return;
		//   64  133:return          
			}
		}

		public boolean tryCaptureView(View view, int i)
		{
			return mActivePointerId == -1 && canSwipeDismissView(view);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field int mActivePointerId>
		//    2    4:iconst_m1       
		//    3    5:icmpne          21
		//    4    8:aload_0         
		//    5    9:getfield        #17  <Field SwipeDismissBehavior this$0>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #144 <Method boolean SwipeDismissBehavior.canSwipeDismissView(View)>
		//    8   16:ifeq            21
		//    9   19:iconst_1        
		//   10   20:ireturn         
		//   11   21:iconst_0        
		//   12   22:ireturn         
		}

		private static final int INVALID_POINTER_ID = -1;
		private int mActivePointerId;
		private int mOriginalCapturedViewLeft;
		final SwipeDismissBehavior this$0;

			
			{
				this$0 = SwipeDismissBehavior.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field SwipeDismissBehavior this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void android.support.v4.widget.ViewDragHelper$Callback()>
				mActivePointerId = -1;
			//    5    9:aload_0         
			//    6   10:iconst_m1       
			//    7   11:putfield        #22  <Field int mActivePointerId>
			//    8   14:return          
			}
	}
;
	float mDragDismissThreshold;
	private boolean mInterceptingEvents;
	OnDismissListener mListener;
	private float mSensitivity;
	private boolean mSensitivitySet;
	int mSwipeDirection;
	ViewDragHelper mViewDragHelper;
}
