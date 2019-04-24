// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.support.v4.math.MathUtils;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.*;
import android.widget.OverScroller;

// Referenced classes of package android.support.design.widget:
//			ViewOffsetBehavior, CoordinatorLayout

abstract class HeaderBehavior extends ViewOffsetBehavior
{
	private class FlingRunnable
		implements Runnable
	{

		public void run()
		{
label0:
			{
				if(mLayout != null && mScroller != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field View mLayout>
		//*   2    4:ifnull          64
		//*   3    7:aload_0         
		//*   4    8:getfield        #20  <Field HeaderBehavior this$0>
		//*   5   11:getfield        #35  <Field OverScroller HeaderBehavior.mScroller>
		//*   6   14:ifnull          64
				{
					if(!mScroller.computeScrollOffset())
						break label0;
		//    7   17:aload_0         
		//    8   18:getfield        #20  <Field HeaderBehavior this$0>
		//    9   21:getfield        #35  <Field OverScroller HeaderBehavior.mScroller>
		//   10   24:invokevirtual   #41  <Method boolean OverScroller.computeScrollOffset()>
		//   11   27:ifeq            65
					setHeaderTopBottomOffset(mParent, mLayout, mScroller.getCurrY());
		//   12   30:aload_0         
		//   13   31:getfield        #20  <Field HeaderBehavior this$0>
		//   14   34:aload_0         
		//   15   35:getfield        #25  <Field CoordinatorLayout mParent>
		//   16   38:aload_0         
		//   17   39:getfield        #27  <Field View mLayout>
		//   18   42:aload_0         
		//   19   43:getfield        #20  <Field HeaderBehavior this$0>
		//   20   46:getfield        #35  <Field OverScroller HeaderBehavior.mScroller>
		//   21   49:invokevirtual   #45  <Method int OverScroller.getCurrY()>
		//   22   52:invokevirtual   #49  <Method int HeaderBehavior.setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
		//   23   55:pop             
					ViewCompat.postOnAnimation(mLayout, ((Runnable) (this)));
		//   24   56:aload_0         
		//   25   57:getfield        #27  <Field View mLayout>
		//   26   60:aload_0         
		//   27   61:invokestatic    #55  <Method void ViewCompat.postOnAnimation(View, Runnable)>
				}
				return;
		//   28   64:return          
			}
			onFlingFinished(mParent, mLayout);
		//   29   65:aload_0         
		//   30   66:getfield        #20  <Field HeaderBehavior this$0>
		//   31   69:aload_0         
		//   32   70:getfield        #25  <Field CoordinatorLayout mParent>
		//   33   73:aload_0         
		//   34   74:getfield        #27  <Field View mLayout>
		//   35   77:invokevirtual   #59  <Method void HeaderBehavior.onFlingFinished(CoordinatorLayout, View)>
		//   36   80:return          
		}

		private final View mLayout;
		private final CoordinatorLayout mParent;
		final HeaderBehavior this$0;

		FlingRunnable(CoordinatorLayout coordinatorlayout, View view)
		{
			this$0 = HeaderBehavior.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #20  <Field HeaderBehavior this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #23  <Method void Object()>
			mParent = coordinatorlayout;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field CoordinatorLayout mParent>
			mLayout = view;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #27  <Field View mLayout>
		//   11   19:return          
		}
	}


	public HeaderBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void ViewOffsetBehavior()>
		mActivePointerId = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #28  <Field int mActivePointerId>
		mTouchSlop = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #30  <Field int mTouchSlop>
	//    8   14:return          
	}

	public HeaderBehavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #34  <Method void ViewOffsetBehavior(Context, AttributeSet)>
		mActivePointerId = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #28  <Field int mActivePointerId>
		mTouchSlop = -1;
	//    7   11:aload_0         
	//    8   12:iconst_m1       
	//    9   13:putfield        #30  <Field int mTouchSlop>
	//   10   16:return          
	}

	private void ensureVelocityTracker()
	{
		if(mVelocityTracker == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field VelocityTracker mVelocityTracker>
	//*   2    4:ifnonnull       14
			mVelocityTracker = VelocityTracker.obtain();
	//    3    7:aload_0         
	//    4    8:invokestatic    #43  <Method VelocityTracker VelocityTracker.obtain()>
	//    5   11:putfield        #37  <Field VelocityTracker mVelocityTracker>
	//    6   14:return          
	}

	boolean canDragView(View view)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	final boolean fling(CoordinatorLayout coordinatorlayout, View view, int i, int j, float f)
	{
		if(mFlingRunnable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field Runnable mFlingRunnable>
	//*   2    4:ifnull          21
		{
			view.removeCallbacks(mFlingRunnable);
	//    3    7:aload_2         
	//    4    8:aload_0         
	//    5    9:getfield        #51  <Field Runnable mFlingRunnable>
	//    6   12:invokevirtual   #57  <Method boolean View.removeCallbacks(Runnable)>
	//    7   15:pop             
			mFlingRunnable = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #51  <Field Runnable mFlingRunnable>
		}
		if(mScroller == null)
	//*  11   21:aload_0         
	//*  12   22:getfield        #59  <Field OverScroller mScroller>
	//*  13   25:ifnonnull       43
			mScroller = new OverScroller(view.getContext());
	//   14   28:aload_0         
	//   15   29:new             #61  <Class OverScroller>
	//   16   32:dup             
	//   17   33:aload_2         
	//   18   34:invokevirtual   #65  <Method Context View.getContext()>
	//   19   37:invokespecial   #68  <Method void OverScroller(Context)>
	//   20   40:putfield        #59  <Field OverScroller mScroller>
		mScroller.fling(0, getTopAndBottomOffset(), 0, Math.round(f), 0, 0, i, j);
	//   21   43:aload_0         
	//   22   44:getfield        #59  <Field OverScroller mScroller>
	//   23   47:iconst_0        
	//   24   48:aload_0         
	//   25   49:invokevirtual   #72  <Method int getTopAndBottomOffset()>
	//   26   52:iconst_0        
	//   27   53:fload           5
	//   28   55:invokestatic    #78  <Method int Math.round(float)>
	//   29   58:iconst_0        
	//   30   59:iconst_0        
	//   31   60:iload_3         
	//   32   61:iload           4
	//   33   63:invokevirtual   #81  <Method void OverScroller.fling(int, int, int, int, int, int, int, int)>
		if(mScroller.computeScrollOffset())
	//*  34   66:aload_0         
	//*  35   67:getfield        #59  <Field OverScroller mScroller>
	//*  36   70:invokevirtual   #85  <Method boolean OverScroller.computeScrollOffset()>
	//*  37   73:ifeq            100
		{
			mFlingRunnable = ((Runnable) (new FlingRunnable(coordinatorlayout, view)));
	//   38   76:aload_0         
	//   39   77:new             #7   <Class HeaderBehavior$FlingRunnable>
	//   40   80:dup             
	//   41   81:aload_0         
	//   42   82:aload_1         
	//   43   83:aload_2         
	//   44   84:invokespecial   #88  <Method void HeaderBehavior$FlingRunnable(HeaderBehavior, CoordinatorLayout, View)>
	//   45   87:putfield        #51  <Field Runnable mFlingRunnable>
			ViewCompat.postOnAnimation(view, mFlingRunnable);
	//   46   90:aload_2         
	//   47   91:aload_0         
	//   48   92:getfield        #51  <Field Runnable mFlingRunnable>
	//   49   95:invokestatic    #94  <Method void ViewCompat.postOnAnimation(View, Runnable)>
			return true;
	//   50   98:iconst_1        
	//   51   99:ireturn         
		} else
		{
			onFlingFinished(coordinatorlayout, view);
	//   52  100:aload_0         
	//   53  101:aload_1         
	//   54  102:aload_2         
	//   55  103:invokevirtual   #98  <Method void onFlingFinished(CoordinatorLayout, View)>
			return false;
	//   56  106:iconst_0        
	//   57  107:ireturn         
		}
	}

	int getMaxDragOffset(View view)
	{
		return -view.getHeight();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #104 <Method int View.getHeight()>
	//    2    4:ineg            
	//    3    5:ireturn         
	}

	int getScrollRangeForDragFling(View view)
	{
		return view.getHeight();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #104 <Method int View.getHeight()>
	//    2    4:ireturn         
	}

	int getTopBottomOffsetForScrollingSibling()
	{
		return getTopAndBottomOffset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method int getTopAndBottomOffset()>
	//    2    4:ireturn         
	}

	void onFlingFinished(CoordinatorLayout coordinatorlayout, View view)
	{
	//    0    0:return          
	}

	public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		if(mTouchSlop < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field int mTouchSlop>
	//*   2    4:ifge            21
			mTouchSlop = ViewConfiguration.get(coordinatorlayout.getContext()).getScaledTouchSlop();
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #113 <Method Context CoordinatorLayout.getContext()>
	//    6   12:invokestatic    #119 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//    7   15:invokevirtual   #122 <Method int ViewConfiguration.getScaledTouchSlop()>
	//    8   18:putfield        #30  <Field int mTouchSlop>
		if(motionevent.getAction() == 2 && mIsBeingDragged)
	//*   9   21:aload_3         
	//*  10   22:invokevirtual   #127 <Method int MotionEvent.getAction()>
	//*  11   25:iconst_2        
	//*  12   26:icmpne          38
	//*  13   29:aload_0         
	//*  14   30:getfield        #129 <Field boolean mIsBeingDragged>
	//*  15   33:ifeq            38
			return true;
	//   16   36:iconst_1        
	//   17   37:ireturn         
		motionevent.getActionMasked();
	//   18   38:aload_3         
	//   19   39:invokevirtual   #132 <Method int MotionEvent.getActionMasked()>
		JVM INSTR tableswitch 0 3: default 72
	//	               0 92
	//	               1 219
	//	               2 153
	//	               3 219;
	//   20   42:tableswitch     0 3: default 72
	//	               0 92
	//	               1 219
	//	               2 153
	//	               3 219
		   goto _L1 _L2 _L3 _L4 _L3
_L1:
		if(mVelocityTracker != null)
	//*  21   72:aload_0         
	//*  22   73:getfield        #37  <Field VelocityTracker mVelocityTracker>
	//*  23   76:ifnull          87
			mVelocityTracker.addMovement(motionevent);
	//   24   79:aload_0         
	//   25   80:getfield        #37  <Field VelocityTracker mVelocityTracker>
	//   26   83:aload_3         
	//   27   84:invokevirtual   #136 <Method void VelocityTracker.addMovement(MotionEvent)>
		return mIsBeingDragged;
	//   28   87:aload_0         
	//   29   88:getfield        #129 <Field boolean mIsBeingDragged>
	//   30   91:ireturn         
_L2:
		mIsBeingDragged = false;
	//   31   92:aload_0         
	//   32   93:iconst_0        
	//   33   94:putfield        #129 <Field boolean mIsBeingDragged>
		int i = (int)motionevent.getX();
	//   34   97:aload_3         
	//   35   98:invokevirtual   #140 <Method float MotionEvent.getX()>
	//   36  101:f2i             
	//   37  102:istore          4
		int k = (int)motionevent.getY();
	//   38  104:aload_3         
	//   39  105:invokevirtual   #143 <Method float MotionEvent.getY()>
	//   40  108:f2i             
	//   41  109:istore          5
		if(canDragView(view) && coordinatorlayout.isPointInChildBounds(view, i, k))
	//*  42  111:aload_0         
	//*  43  112:aload_2         
	//*  44  113:invokevirtual   #145 <Method boolean canDragView(View)>
	//*  45  116:ifeq            72
	//*  46  119:aload_1         
	//*  47  120:aload_2         
	//*  48  121:iload           4
	//*  49  123:iload           5
	//*  50  125:invokevirtual   #149 <Method boolean CoordinatorLayout.isPointInChildBounds(View, int, int)>
	//*  51  128:ifeq            72
		{
			mLastMotionY = k;
	//   52  131:aload_0         
	//   53  132:iload           5
	//   54  134:putfield        #151 <Field int mLastMotionY>
			mActivePointerId = motionevent.getPointerId(0);
	//   55  137:aload_0         
	//   56  138:aload_3         
	//   57  139:iconst_0        
	//   58  140:invokevirtual   #155 <Method int MotionEvent.getPointerId(int)>
	//   59  143:putfield        #28  <Field int mActivePointerId>
			ensureVelocityTracker();
	//   60  146:aload_0         
	//   61  147:invokespecial   #157 <Method void ensureVelocityTracker()>
		}
		continue; /* Loop/switch isn't completed */
	//   62  150:goto            72
_L4:
		int j = mActivePointerId;
	//   63  153:aload_0         
	//   64  154:getfield        #28  <Field int mActivePointerId>
	//   65  157:istore          4
		if(j != -1)
	//*  66  159:iload           4
	//*  67  161:iconst_m1       
	//*  68  162:icmpeq          72
		{
			j = motionevent.findPointerIndex(j);
	//   69  165:aload_3         
	//   70  166:iload           4
	//   71  168:invokevirtual   #160 <Method int MotionEvent.findPointerIndex(int)>
	//   72  171:istore          4
			if(j != -1)
	//*  73  173:iload           4
	//*  74  175:iconst_m1       
	//*  75  176:icmpeq          72
			{
				j = (int)motionevent.getY(j);
	//   76  179:aload_3         
	//   77  180:iload           4
	//   78  182:invokevirtual   #163 <Method float MotionEvent.getY(int)>
	//   79  185:f2i             
	//   80  186:istore          4
				if(Math.abs(j - mLastMotionY) > mTouchSlop)
	//*  81  188:iload           4
	//*  82  190:aload_0         
	//*  83  191:getfield        #151 <Field int mLastMotionY>
	//*  84  194:isub            
	//*  85  195:invokestatic    #166 <Method int Math.abs(int)>
	//*  86  198:aload_0         
	//*  87  199:getfield        #30  <Field int mTouchSlop>
	//*  88  202:icmple          72
				{
					mIsBeingDragged = true;
	//   89  205:aload_0         
	//   90  206:iconst_1        
	//   91  207:putfield        #129 <Field boolean mIsBeingDragged>
					mLastMotionY = j;
	//   92  210:aload_0         
	//   93  211:iload           4
	//   94  213:putfield        #151 <Field int mLastMotionY>
				}
			}
		}
		continue; /* Loop/switch isn't completed */
	//   95  216:goto            72
_L3:
		mIsBeingDragged = false;
	//   96  219:aload_0         
	//   97  220:iconst_0        
	//   98  221:putfield        #129 <Field boolean mIsBeingDragged>
		mActivePointerId = -1;
	//   99  224:aload_0         
	//  100  225:iconst_m1       
	//  101  226:putfield        #28  <Field int mActivePointerId>
		if(mVelocityTracker != null)
	//* 102  229:aload_0         
	//* 103  230:getfield        #37  <Field VelocityTracker mVelocityTracker>
	//* 104  233:ifnull          72
		{
			mVelocityTracker.recycle();
	//  105  236:aload_0         
	//  106  237:getfield        #37  <Field VelocityTracker mVelocityTracker>
	//  107  240:invokevirtual   #169 <Method void VelocityTracker.recycle()>
			mVelocityTracker = null;
	//  108  243:aload_0         
	//  109  244:aconst_null     
	//  110  245:putfield        #37  <Field VelocityTracker mVelocityTracker>
		}
		if(true) goto _L1; else goto _L5
	//  111  248:goto            72
_L5:
	}

	public boolean onTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		if(mTouchSlop < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field int mTouchSlop>
	//*   2    4:ifge            21
			mTouchSlop = ViewConfiguration.get(coordinatorlayout.getContext()).getScaledTouchSlop();
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #113 <Method Context CoordinatorLayout.getContext()>
	//    6   12:invokestatic    #119 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//    7   15:invokevirtual   #122 <Method int ViewConfiguration.getScaledTouchSlop()>
	//    8   18:putfield        #30  <Field int mTouchSlop>
		motionevent.getActionMasked();
	//    9   21:aload_3         
	//   10   22:invokevirtual   #132 <Method int MotionEvent.getActionMasked()>
		JVM INSTR tableswitch 0 3: default 56
	//	               0 73
	//	               1 256
	//	               2 131
	//	               3 310;
	//   11   25:tableswitch     0 3: default 56
	//	               0 73
	//	               1 256
	//	               2 131
	//	               3 310
		   goto _L1 _L2 _L3 _L4 _L5
_L1:
		if(mVelocityTracker != null)
	//*  12   56:aload_0         
	//*  13   57:getfield        #37  <Field VelocityTracker mVelocityTracker>
	//*  14   60:ifnull          71
			mVelocityTracker.addMovement(motionevent);
	//   15   63:aload_0         
	//   16   64:getfield        #37  <Field VelocityTracker mVelocityTracker>
	//   17   67:aload_3         
	//   18   68:invokevirtual   #136 <Method void VelocityTracker.addMovement(MotionEvent)>
		return true;
	//   19   71:iconst_1        
	//   20   72:ireturn         
_L2:
		int i = (int)motionevent.getX();
	//   21   73:aload_3         
	//   22   74:invokevirtual   #140 <Method float MotionEvent.getX()>
	//   23   77:f2i             
	//   24   78:istore          5
		int k = (int)motionevent.getY();
	//   25   80:aload_3         
	//   26   81:invokevirtual   #143 <Method float MotionEvent.getY()>
	//   27   84:f2i             
	//   28   85:istore          6
		if(coordinatorlayout.isPointInChildBounds(view, i, k) && canDragView(view))
	//*  29   87:aload_1         
	//*  30   88:aload_2         
	//*  31   89:iload           5
	//*  32   91:iload           6
	//*  33   93:invokevirtual   #149 <Method boolean CoordinatorLayout.isPointInChildBounds(View, int, int)>
	//*  34   96:ifeq            129
	//*  35   99:aload_0         
	//*  36  100:aload_2         
	//*  37  101:invokevirtual   #145 <Method boolean canDragView(View)>
	//*  38  104:ifeq            129
		{
			mLastMotionY = k;
	//   39  107:aload_0         
	//   40  108:iload           6
	//   41  110:putfield        #151 <Field int mLastMotionY>
			mActivePointerId = motionevent.getPointerId(0);
	//   42  113:aload_0         
	//   43  114:aload_3         
	//   44  115:iconst_0        
	//   45  116:invokevirtual   #155 <Method int MotionEvent.getPointerId(int)>
	//   46  119:putfield        #28  <Field int mActivePointerId>
			ensureVelocityTracker();
	//   47  122:aload_0         
	//   48  123:invokespecial   #157 <Method void ensureVelocityTracker()>
		} else
	//*  49  126:goto            56
		{
			return false;
	//   50  129:iconst_0        
	//   51  130:ireturn         
		}
		continue; /* Loop/switch isn't completed */
_L4:
		int j = motionevent.findPointerIndex(mActivePointerId);
	//   52  131:aload_3         
	//   53  132:aload_0         
	//   54  133:getfield        #28  <Field int mActivePointerId>
	//   55  136:invokevirtual   #160 <Method int MotionEvent.findPointerIndex(int)>
	//   56  139:istore          5
		if(j == -1)
	//*  57  141:iload           5
	//*  58  143:iconst_m1       
	//*  59  144:icmpne          149
			return false;
	//   60  147:iconst_0        
	//   61  148:ireturn         
		int i1 = (int)motionevent.getY(j);
	//   62  149:aload_3         
	//   63  150:iload           5
	//   64  152:invokevirtual   #163 <Method float MotionEvent.getY(int)>
	//   65  155:f2i             
	//   66  156:istore          7
		int l = mLastMotionY - i1;
	//   67  158:aload_0         
	//   68  159:getfield        #151 <Field int mLastMotionY>
	//   69  162:iload           7
	//   70  164:isub            
	//   71  165:istore          6
		j = l;
	//   72  167:iload           6
	//   73  169:istore          5
		if(!mIsBeingDragged)
	//*  74  171:aload_0         
	//*  75  172:getfield        #129 <Field boolean mIsBeingDragged>
	//*  76  175:ifne            213
		{
			j = l;
	//   77  178:iload           6
	//   78  180:istore          5
			if(Math.abs(l) > mTouchSlop)
	//*  79  182:iload           6
	//*  80  184:invokestatic    #166 <Method int Math.abs(int)>
	//*  81  187:aload_0         
	//*  82  188:getfield        #30  <Field int mTouchSlop>
	//*  83  191:icmple          213
			{
				mIsBeingDragged = true;
	//   84  194:aload_0         
	//   85  195:iconst_1        
	//   86  196:putfield        #129 <Field boolean mIsBeingDragged>
				if(l > 0)
	//*  87  199:iload           6
	//*  88  201:ifle            244
					j = l - mTouchSlop;
	//   89  204:iload           6
	//   90  206:aload_0         
	//   91  207:getfield        #30  <Field int mTouchSlop>
	//   92  210:isub            
	//   93  211:istore          5
				else
	//*  94  213:aload_0         
	//*  95  214:getfield        #129 <Field boolean mIsBeingDragged>
	//*  96  217:ifeq            56
	//*  97  220:aload_0         
	//*  98  221:iload           7
	//*  99  223:putfield        #151 <Field int mLastMotionY>
	//* 100  226:aload_0         
	//* 101  227:aload_1         
	//* 102  228:aload_2         
	//* 103  229:iload           5
	//* 104  231:aload_0         
	//* 105  232:aload_2         
	//* 106  233:invokevirtual   #173 <Method int getMaxDragOffset(View)>
	//* 107  236:iconst_0        
	//* 108  237:invokevirtual   #177 <Method int scroll(CoordinatorLayout, View, int, int, int)>
	//* 109  240:pop             
	//* 110  241:goto            56
					j = l + mTouchSlop;
	//  111  244:iload           6
	//  112  246:aload_0         
	//  113  247:getfield        #30  <Field int mTouchSlop>
	//  114  250:iadd            
	//  115  251:istore          5
			}
		}
		if(mIsBeingDragged)
		{
			mLastMotionY = i1;
			scroll(coordinatorlayout, view, j, getMaxDragOffset(view), 0);
		}
		continue; /* Loop/switch isn't completed */
	//  116  253:goto            213
_L3:
		if(mVelocityTracker != null)
	//* 117  256:aload_0         
	//* 118  257:getfield        #37  <Field VelocityTracker mVelocityTracker>
	//* 119  260:ifnull          310
		{
			mVelocityTracker.addMovement(motionevent);
	//  120  263:aload_0         
	//  121  264:getfield        #37  <Field VelocityTracker mVelocityTracker>
	//  122  267:aload_3         
	//  123  268:invokevirtual   #136 <Method void VelocityTracker.addMovement(MotionEvent)>
			mVelocityTracker.computeCurrentVelocity(1000);
	//  124  271:aload_0         
	//  125  272:getfield        #37  <Field VelocityTracker mVelocityTracker>
	//  126  275:sipush          1000
	//  127  278:invokevirtual   #181 <Method void VelocityTracker.computeCurrentVelocity(int)>
			float f = mVelocityTracker.getYVelocity(mActivePointerId);
	//  128  281:aload_0         
	//  129  282:getfield        #37  <Field VelocityTracker mVelocityTracker>
	//  130  285:aload_0         
	//  131  286:getfield        #28  <Field int mActivePointerId>
	//  132  289:invokevirtual   #184 <Method float VelocityTracker.getYVelocity(int)>
	//  133  292:fstore          4
			fling(coordinatorlayout, view, -getScrollRangeForDragFling(view), 0, f);
	//  134  294:aload_0         
	//  135  295:aload_1         
	//  136  296:aload_2         
	//  137  297:aload_0         
	//  138  298:aload_2         
	//  139  299:invokevirtual   #186 <Method int getScrollRangeForDragFling(View)>
	//  140  302:ineg            
	//  141  303:iconst_0        
	//  142  304:fload           4
	//  143  306:invokevirtual   #188 <Method boolean fling(CoordinatorLayout, View, int, int, float)>
	//  144  309:pop             
		}
_L5:
		mIsBeingDragged = false;
	//  145  310:aload_0         
	//  146  311:iconst_0        
	//  147  312:putfield        #129 <Field boolean mIsBeingDragged>
		mActivePointerId = -1;
	//  148  315:aload_0         
	//  149  316:iconst_m1       
	//  150  317:putfield        #28  <Field int mActivePointerId>
		if(mVelocityTracker != null)
	//* 151  320:aload_0         
	//* 152  321:getfield        #37  <Field VelocityTracker mVelocityTracker>
	//* 153  324:ifnull          56
		{
			mVelocityTracker.recycle();
	//  154  327:aload_0         
	//  155  328:getfield        #37  <Field VelocityTracker mVelocityTracker>
	//  156  331:invokevirtual   #169 <Method void VelocityTracker.recycle()>
			mVelocityTracker = null;
	//  157  334:aload_0         
	//  158  335:aconst_null     
	//  159  336:putfield        #37  <Field VelocityTracker mVelocityTracker>
		}
		if(true) goto _L1; else goto _L6
	//  160  339:goto            56
_L6:
	}

	final int scroll(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k)
	{
		return setHeaderTopBottomOffset(coordinatorlayout, view, getTopBottomOffsetForScrollingSibling() - i, j, k);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:invokevirtual   #190 <Method int getTopBottomOffsetForScrollingSibling()>
	//    5    7:iload_3         
	//    6    8:isub            
	//    7    9:iload           4
	//    8   11:iload           5
	//    9   13:invokevirtual   #193 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int, int, int)>
	//   10   16:ireturn         
	}

	int setHeaderTopBottomOffset(CoordinatorLayout coordinatorlayout, View view, int i)
	{
		return setHeaderTopBottomOffset(coordinatorlayout, view, i, 0x80000000, 0x7fffffff);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:ldc1            #196 <Int 0x80000000>
	//    5    6:ldc1            #197 <Int 0x7fffffff>
	//    6    8:invokevirtual   #193 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int, int, int)>
	//    7   11:ireturn         
	}

	int setHeaderTopBottomOffset(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k)
	{
		int i1 = getTopAndBottomOffset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method int getTopAndBottomOffset()>
	//    2    4:istore          8
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          7
		int l = ((int) (flag));
	//    5    9:iload           7
	//    6   11:istore          6
		if(j != 0)
	//*   7   13:iload           4
	//*   8   15:ifeq            71
		{
			l = ((int) (flag));
	//    9   18:iload           7
	//   10   20:istore          6
			if(i1 >= j)
	//*  11   22:iload           8
	//*  12   24:iload           4
	//*  13   26:icmplt          71
			{
				l = ((int) (flag));
	//   14   29:iload           7
	//   15   31:istore          6
				if(i1 <= k)
	//*  16   33:iload           8
	//*  17   35:iload           5
	//*  18   37:icmpgt          71
				{
					i = MathUtils.clamp(i, j, k);
	//   19   40:iload_3         
	//   20   41:iload           4
	//   21   43:iload           5
	//   22   45:invokestatic    #204 <Method int MathUtils.clamp(int, int, int)>
	//   23   48:istore_3        
					l = ((int) (flag));
	//   24   49:iload           7
	//   25   51:istore          6
					if(i1 != i)
	//*  26   53:iload           8
	//*  27   55:iload_3         
	//*  28   56:icmpeq          71
					{
						setTopAndBottomOffset(i);
	//   29   59:aload_0         
	//   30   60:iload_3         
	//   31   61:invokevirtual   #208 <Method boolean setTopAndBottomOffset(int)>
	//   32   64:pop             
						l = i1 - i;
	//   33   65:iload           8
	//   34   67:iload_3         
	//   35   68:isub            
	//   36   69:istore          6
					}
				}
			}
		}
		return l;
	//   37   71:iload           6
	//   38   73:ireturn         
	}

	private static final int INVALID_POINTER = -1;
	private int mActivePointerId;
	private Runnable mFlingRunnable;
	private boolean mIsBeingDragged;
	private int mLastMotionY;
	OverScroller mScroller;
	private int mTouchSlop;
	private VelocityTracker mVelocityTracker;
}
