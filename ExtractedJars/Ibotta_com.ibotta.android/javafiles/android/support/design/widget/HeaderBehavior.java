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
			if(layout != null && scroller != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field View layout>
		//*   2    4:ifnull          79
		//*   3    7:aload_0         
		//*   4    8:getfield        #20  <Field HeaderBehavior this$0>
		//*   5   11:getfield        #35  <Field OverScroller HeaderBehavior.scroller>
		//*   6   14:ifnull          79
			{
				if(scroller.computeScrollOffset())
		//*   7   17:aload_0         
		//*   8   18:getfield        #20  <Field HeaderBehavior this$0>
		//*   9   21:getfield        #35  <Field OverScroller HeaderBehavior.scroller>
		//*  10   24:invokevirtual   #41  <Method boolean OverScroller.computeScrollOffset()>
		//*  11   27:ifeq            64
				{
					HeaderBehavior headerbehavior = HeaderBehavior.this;
		//   12   30:aload_0         
		//   13   31:getfield        #20  <Field HeaderBehavior this$0>
		//   14   34:astore_1        
					headerbehavior.setHeaderTopBottomOffset(parent, layout, headerbehavior.scroller.getCurrY());
		//   15   35:aload_1         
		//   16   36:aload_0         
		//   17   37:getfield        #25  <Field CoordinatorLayout parent>
		//   18   40:aload_0         
		//   19   41:getfield        #27  <Field View layout>
		//   20   44:aload_1         
		//   21   45:getfield        #35  <Field OverScroller HeaderBehavior.scroller>
		//   22   48:invokevirtual   #45  <Method int OverScroller.getCurrY()>
		//   23   51:invokevirtual   #49  <Method int HeaderBehavior.setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
		//   24   54:pop             
					ViewCompat.postOnAnimation(layout, ((Runnable) (this)));
		//   25   55:aload_0         
		//   26   56:getfield        #27  <Field View layout>
		//   27   59:aload_0         
		//   28   60:invokestatic    #55  <Method void ViewCompat.postOnAnimation(View, Runnable)>
					return;
		//   29   63:return          
				}
				onFlingFinished(parent, layout);
		//   30   64:aload_0         
		//   31   65:getfield        #20  <Field HeaderBehavior this$0>
		//   32   68:aload_0         
		//   33   69:getfield        #25  <Field CoordinatorLayout parent>
		//   34   72:aload_0         
		//   35   73:getfield        #27  <Field View layout>
		//   36   76:invokevirtual   #59  <Method void HeaderBehavior.onFlingFinished(CoordinatorLayout, View)>
			}
		//   37   79:return          
		}

		private final View layout;
		private final CoordinatorLayout parent;
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
			parent = coordinatorlayout;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field CoordinatorLayout parent>
			layout = view;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #27  <Field View layout>
		//   11   19:return          
		}
	}


	public HeaderBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void ViewOffsetBehavior()>
		activePointerId = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #26  <Field int activePointerId>
		touchSlop = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #28  <Field int touchSlop>
	//    8   14:return          
	}

	public HeaderBehavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #32  <Method void ViewOffsetBehavior(Context, AttributeSet)>
		activePointerId = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #26  <Field int activePointerId>
		touchSlop = -1;
	//    7   11:aload_0         
	//    8   12:iconst_m1       
	//    9   13:putfield        #28  <Field int touchSlop>
	//   10   16:return          
	}

	private void ensureVelocityTracker()
	{
		if(velocityTracker == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field VelocityTracker velocityTracker>
	//*   2    4:ifnonnull       14
			velocityTracker = VelocityTracker.obtain();
	//    3    7:aload_0         
	//    4    8:invokestatic    #41  <Method VelocityTracker VelocityTracker.obtain()>
	//    5   11:putfield        #35  <Field VelocityTracker velocityTracker>
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
		Runnable runnable = flingRunnable;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Runnable flingRunnable>
	//    2    4:astore          6
		if(runnable != null)
	//*   3    6:aload           6
	//*   4    8:ifnull          23
		{
			view.removeCallbacks(runnable);
	//    5   11:aload_2         
	//    6   12:aload           6
	//    7   14:invokevirtual   #55  <Method boolean View.removeCallbacks(Runnable)>
	//    8   17:pop             
			flingRunnable = null;
	//    9   18:aload_0         
	//   10   19:aconst_null     
	//   11   20:putfield        #49  <Field Runnable flingRunnable>
		}
		if(scroller == null)
	//*  12   23:aload_0         
	//*  13   24:getfield        #57  <Field OverScroller scroller>
	//*  14   27:ifnonnull       45
			scroller = new OverScroller(view.getContext());
	//   15   30:aload_0         
	//   16   31:new             #59  <Class OverScroller>
	//   17   34:dup             
	//   18   35:aload_2         
	//   19   36:invokevirtual   #63  <Method Context View.getContext()>
	//   20   39:invokespecial   #66  <Method void OverScroller(Context)>
	//   21   42:putfield        #57  <Field OverScroller scroller>
		scroller.fling(0, getTopAndBottomOffset(), 0, Math.round(f), 0, 0, i, j);
	//   22   45:aload_0         
	//   23   46:getfield        #57  <Field OverScroller scroller>
	//   24   49:iconst_0        
	//   25   50:aload_0         
	//   26   51:invokevirtual   #70  <Method int getTopAndBottomOffset()>
	//   27   54:iconst_0        
	//   28   55:fload           5
	//   29   57:invokestatic    #76  <Method int Math.round(float)>
	//   30   60:iconst_0        
	//   31   61:iconst_0        
	//   32   62:iload_3         
	//   33   63:iload           4
	//   34   65:invokevirtual   #79  <Method void OverScroller.fling(int, int, int, int, int, int, int, int)>
		if(scroller.computeScrollOffset())
	//*  35   68:aload_0         
	//*  36   69:getfield        #57  <Field OverScroller scroller>
	//*  37   72:invokevirtual   #83  <Method boolean OverScroller.computeScrollOffset()>
	//*  38   75:ifeq            102
		{
			flingRunnable = ((Runnable) (new FlingRunnable(coordinatorlayout, view)));
	//   39   78:aload_0         
	//   40   79:new             #7   <Class HeaderBehavior$FlingRunnable>
	//   41   82:dup             
	//   42   83:aload_0         
	//   43   84:aload_1         
	//   44   85:aload_2         
	//   45   86:invokespecial   #86  <Method void HeaderBehavior$FlingRunnable(HeaderBehavior, CoordinatorLayout, View)>
	//   46   89:putfield        #49  <Field Runnable flingRunnable>
			ViewCompat.postOnAnimation(view, flingRunnable);
	//   47   92:aload_2         
	//   48   93:aload_0         
	//   49   94:getfield        #49  <Field Runnable flingRunnable>
	//   50   97:invokestatic    #92  <Method void ViewCompat.postOnAnimation(View, Runnable)>
			return true;
	//   51  100:iconst_1        
	//   52  101:ireturn         
		} else
		{
			onFlingFinished(coordinatorlayout, view);
	//   53  102:aload_0         
	//   54  103:aload_1         
	//   55  104:aload_2         
	//   56  105:invokevirtual   #96  <Method void onFlingFinished(CoordinatorLayout, View)>
			return false;
	//   57  108:iconst_0        
	//   58  109:ireturn         
		}
	}

	int getMaxDragOffset(View view)
	{
		return -view.getHeight();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #102 <Method int View.getHeight()>
	//    2    4:ineg            
	//    3    5:ireturn         
	}

	int getScrollRangeForDragFling(View view)
	{
		return view.getHeight();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #102 <Method int View.getHeight()>
	//    2    4:ireturn         
	}

	int getTopBottomOffsetForScrollingSibling()
	{
		return getTopAndBottomOffset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method int getTopAndBottomOffset()>
	//    2    4:ireturn         
	}

	void onFlingFinished(CoordinatorLayout coordinatorlayout, View view)
	{
	//    0    0:return          
	}

	public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		if(touchSlop < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field int touchSlop>
	//*   2    4:ifge            21
			touchSlop = ViewConfiguration.get(coordinatorlayout.getContext()).getScaledTouchSlop();
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #111 <Method Context CoordinatorLayout.getContext()>
	//    6   12:invokestatic    #117 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//    7   15:invokevirtual   #120 <Method int ViewConfiguration.getScaledTouchSlop()>
	//    8   18:putfield        #28  <Field int touchSlop>
		if(motionevent.getAction() == 2 && isBeingDragged)
	//*   9   21:aload_3         
	//*  10   22:invokevirtual   #125 <Method int MotionEvent.getAction()>
	//*  11   25:iconst_2        
	//*  12   26:icmpne          38
	//*  13   29:aload_0         
	//*  14   30:getfield        #127 <Field boolean isBeingDragged>
	//*  15   33:ifeq            38
			return true;
	//   16   36:iconst_1        
	//   17   37:ireturn         
		switch(motionevent.getActionMasked())
	//*  18   38:aload_3         
	//*  19   39:invokevirtual   #130 <Method int MotionEvent.getActionMasked()>
		{
		default:
			break;

	//*  20   42:tableswitch     0 3: default 72
	//	               0 178
	//	               1 147
	//	               2 75
	//	               3 147
	//*  21   72:goto            236
		case 2: // '\002'
			int i = activePointerId;
	//   22   75:aload_0         
	//   23   76:getfield        #26  <Field int activePointerId>
	//   24   79:istore          4
			if(i != -1)
	//*  25   81:iload           4
	//*  26   83:iconst_m1       
	//*  27   84:icmpne          90
	//*  28   87:goto            236
			{
				i = motionevent.findPointerIndex(i);
	//   29   90:aload_3         
	//   30   91:iload           4
	//   31   93:invokevirtual   #134 <Method int MotionEvent.findPointerIndex(int)>
	//   32   96:istore          4
				if(i != -1)
	//*  33   98:iload           4
	//*  34  100:iconst_m1       
	//*  35  101:icmpne          107
	//*  36  104:goto            236
				{
					i = (int)motionevent.getY(i);
	//   37  107:aload_3         
	//   38  108:iload           4
	//   39  110:invokevirtual   #138 <Method float MotionEvent.getY(int)>
	//   40  113:f2i             
	//   41  114:istore          4
					if(Math.abs(i - lastMotionY) > touchSlop)
	//*  42  116:iload           4
	//*  43  118:aload_0         
	//*  44  119:getfield        #140 <Field int lastMotionY>
	//*  45  122:isub            
	//*  46  123:invokestatic    #143 <Method int Math.abs(int)>
	//*  47  126:aload_0         
	//*  48  127:getfield        #28  <Field int touchSlop>
	//*  49  130:icmple          236
					{
						isBeingDragged = true;
	//   50  133:aload_0         
	//   51  134:iconst_1        
	//   52  135:putfield        #127 <Field boolean isBeingDragged>
						lastMotionY = i;
	//   53  138:aload_0         
	//   54  139:iload           4
	//   55  141:putfield        #140 <Field int lastMotionY>
					}
				}
			}
			break;
	//   56  144:goto            236

		case 1: // '\001'
		case 3: // '\003'
			isBeingDragged = false;
	//   57  147:aload_0         
	//   58  148:iconst_0        
	//   59  149:putfield        #127 <Field boolean isBeingDragged>
			activePointerId = -1;
	//   60  152:aload_0         
	//   61  153:iconst_m1       
	//   62  154:putfield        #26  <Field int activePointerId>
			coordinatorlayout = ((CoordinatorLayout) (velocityTracker));
	//   63  157:aload_0         
	//   64  158:getfield        #35  <Field VelocityTracker velocityTracker>
	//   65  161:astore_1        
			if(coordinatorlayout != null)
	//*  66  162:aload_1         
	//*  67  163:ifnull          236
			{
				((VelocityTracker) (coordinatorlayout)).recycle();
	//   68  166:aload_1         
	//   69  167:invokevirtual   #146 <Method void VelocityTracker.recycle()>
				velocityTracker = null;
	//   70  170:aload_0         
	//   71  171:aconst_null     
	//   72  172:putfield        #35  <Field VelocityTracker velocityTracker>
			}
			break;
	//   73  175:goto            236

		case 0: // '\0'
			isBeingDragged = false;
	//   74  178:aload_0         
	//   75  179:iconst_0        
	//   76  180:putfield        #127 <Field boolean isBeingDragged>
			int j = (int)motionevent.getX();
	//   77  183:aload_3         
	//   78  184:invokevirtual   #150 <Method float MotionEvent.getX()>
	//   79  187:f2i             
	//   80  188:istore          4
			int k = (int)motionevent.getY();
	//   81  190:aload_3         
	//   82  191:invokevirtual   #152 <Method float MotionEvent.getY()>
	//   83  194:f2i             
	//   84  195:istore          5
			if(canDragView(view) && coordinatorlayout.isPointInChildBounds(view, j, k))
	//*  85  197:aload_0         
	//*  86  198:aload_2         
	//*  87  199:invokevirtual   #154 <Method boolean canDragView(View)>
	//*  88  202:ifeq            236
	//*  89  205:aload_1         
	//*  90  206:aload_2         
	//*  91  207:iload           4
	//*  92  209:iload           5
	//*  93  211:invokevirtual   #158 <Method boolean CoordinatorLayout.isPointInChildBounds(View, int, int)>
	//*  94  214:ifeq            236
			{
				lastMotionY = k;
	//   95  217:aload_0         
	//   96  218:iload           5
	//   97  220:putfield        #140 <Field int lastMotionY>
				activePointerId = motionevent.getPointerId(0);
	//   98  223:aload_0         
	//   99  224:aload_3         
	//  100  225:iconst_0        
	//  101  226:invokevirtual   #161 <Method int MotionEvent.getPointerId(int)>
	//  102  229:putfield        #26  <Field int activePointerId>
				ensureVelocityTracker();
	//  103  232:aload_0         
	//  104  233:invokespecial   #163 <Method void ensureVelocityTracker()>
			}
			break;
		}
		coordinatorlayout = ((CoordinatorLayout) (velocityTracker));
	//  105  236:aload_0         
	//  106  237:getfield        #35  <Field VelocityTracker velocityTracker>
	//  107  240:astore_1        
		if(coordinatorlayout != null)
	//* 108  241:aload_1         
	//* 109  242:ifnull          250
			((VelocityTracker) (coordinatorlayout)).addMovement(motionevent);
	//  110  245:aload_1         
	//  111  246:aload_3         
	//  112  247:invokevirtual   #167 <Method void VelocityTracker.addMovement(MotionEvent)>
		return isBeingDragged;
	//  113  250:aload_0         
	//  114  251:getfield        #127 <Field boolean isBeingDragged>
	//  115  254:ireturn         
	}

	public boolean onTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		if(touchSlop < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field int touchSlop>
	//*   2    4:ifge            21
			touchSlop = ViewConfiguration.get(coordinatorlayout.getContext()).getScaledTouchSlop();
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #111 <Method Context CoordinatorLayout.getContext()>
	//    6   12:invokestatic    #117 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//    7   15:invokevirtual   #120 <Method int ViewConfiguration.getScaledTouchSlop()>
	//    8   18:putfield        #28  <Field int touchSlop>
		switch(motionevent.getActionMasked())
	//*   9   21:aload_3         
	//*  10   22:invokevirtual   #130 <Method int MotionEvent.getActionMasked()>
		{
		default:
			break;

	//*  11   25:tableswitch     0 3: default 56
	//	               0 270
	//	               1 183
	//	               2 59
	//	               3 239
	//*  12   56:goto            328
		case 2: // '\002'
			int i = motionevent.findPointerIndex(activePointerId);
	//   13   59:aload_3         
	//   14   60:aload_0         
	//   15   61:getfield        #26  <Field int activePointerId>
	//   16   64:invokevirtual   #134 <Method int MotionEvent.findPointerIndex(int)>
	//   17   67:istore          5
			if(i == -1)
	//*  18   69:iload           5
	//*  19   71:iconst_m1       
	//*  20   72:icmpne          77
				return false;
	//   21   75:iconst_0        
	//   22   76:ireturn         
			int k = (int)motionevent.getY(i);
	//   23   77:aload_3         
	//   24   78:iload           5
	//   25   80:invokevirtual   #138 <Method float MotionEvent.getY(int)>
	//   26   83:f2i             
	//   27   84:istore          6
			i = lastMotionY - k;
	//   28   86:aload_0         
	//   29   87:getfield        #140 <Field int lastMotionY>
	//   30   90:iload           6
	//   31   92:isub            
	//   32   93:istore          5
			if(!isBeingDragged)
	//*  33   95:aload_0         
	//*  34   96:getfield        #127 <Field boolean isBeingDragged>
	//*  35   99:ifne            152
			{
				int i1 = Math.abs(i);
	//   36  102:iload           5
	//   37  104:invokestatic    #143 <Method int Math.abs(int)>
	//   38  107:istore          7
				int j1 = touchSlop;
	//   39  109:aload_0         
	//   40  110:getfield        #28  <Field int touchSlop>
	//   41  113:istore          8
				if(i1 > j1)
	//*  42  115:iload           7
	//*  43  117:iload           8
	//*  44  119:icmple          152
				{
					isBeingDragged = true;
	//   45  122:aload_0         
	//   46  123:iconst_1        
	//   47  124:putfield        #127 <Field boolean isBeingDragged>
					if(i > 0)
	//*  48  127:iload           5
	//*  49  129:ifle            142
						i -= j1;
	//   50  132:iload           5
	//   51  134:iload           8
	//   52  136:isub            
	//   53  137:istore          5
					else
	//*  54  139:goto            152
						i += j1;
	//   55  142:iload           5
	//   56  144:iload           8
	//   57  146:iadd            
	//   58  147:istore          5
				}
			}
	//*  59  149:goto            152
			if(isBeingDragged)
	//*  60  152:aload_0         
	//*  61  153:getfield        #127 <Field boolean isBeingDragged>
	//*  62  156:ifeq            328
			{
				lastMotionY = k;
	//   63  159:aload_0         
	//   64  160:iload           6
	//   65  162:putfield        #140 <Field int lastMotionY>
				scroll(coordinatorlayout, view, i, getMaxDragOffset(view), 0);
	//   66  165:aload_0         
	//   67  166:aload_1         
	//   68  167:aload_2         
	//   69  168:iload           5
	//   70  170:aload_0         
	//   71  171:aload_2         
	//   72  172:invokevirtual   #171 <Method int getMaxDragOffset(View)>
	//   73  175:iconst_0        
	//   74  176:invokevirtual   #175 <Method int scroll(CoordinatorLayout, View, int, int, int)>
	//   75  179:pop             
			}
			break;
	//   76  180:goto            328

		case 1: // '\001'
			VelocityTracker velocitytracker = velocityTracker;
	//   77  183:aload_0         
	//   78  184:getfield        #35  <Field VelocityTracker velocityTracker>
	//   79  187:astore          9
			if(velocitytracker != null)
	//*  80  189:aload           9
	//*  81  191:ifnull          239
			{
				velocitytracker.addMovement(motionevent);
	//   82  194:aload           9
	//   83  196:aload_3         
	//   84  197:invokevirtual   #167 <Method void VelocityTracker.addMovement(MotionEvent)>
				velocityTracker.computeCurrentVelocity(1000);
	//   85  200:aload_0         
	//   86  201:getfield        #35  <Field VelocityTracker velocityTracker>
	//   87  204:sipush          1000
	//   88  207:invokevirtual   #179 <Method void VelocityTracker.computeCurrentVelocity(int)>
				float f = velocityTracker.getYVelocity(activePointerId);
	//   89  210:aload_0         
	//   90  211:getfield        #35  <Field VelocityTracker velocityTracker>
	//   91  214:aload_0         
	//   92  215:getfield        #26  <Field int activePointerId>
	//   93  218:invokevirtual   #182 <Method float VelocityTracker.getYVelocity(int)>
	//   94  221:fstore          4
				fling(coordinatorlayout, view, -getScrollRangeForDragFling(view), 0, f);
	//   95  223:aload_0         
	//   96  224:aload_1         
	//   97  225:aload_2         
	//   98  226:aload_0         
	//   99  227:aload_2         
	//  100  228:invokevirtual   #184 <Method int getScrollRangeForDragFling(View)>
	//  101  231:ineg            
	//  102  232:iconst_0        
	//  103  233:fload           4
	//  104  235:invokevirtual   #186 <Method boolean fling(CoordinatorLayout, View, int, int, float)>
	//  105  238:pop             
			}
			// fall through

		case 3: // '\003'
			isBeingDragged = false;
	//  106  239:aload_0         
	//  107  240:iconst_0        
	//  108  241:putfield        #127 <Field boolean isBeingDragged>
			activePointerId = -1;
	//  109  244:aload_0         
	//  110  245:iconst_m1       
	//  111  246:putfield        #26  <Field int activePointerId>
			coordinatorlayout = ((CoordinatorLayout) (velocityTracker));
	//  112  249:aload_0         
	//  113  250:getfield        #35  <Field VelocityTracker velocityTracker>
	//  114  253:astore_1        
			if(coordinatorlayout != null)
	//* 115  254:aload_1         
	//* 116  255:ifnull          328
			{
				((VelocityTracker) (coordinatorlayout)).recycle();
	//  117  258:aload_1         
	//  118  259:invokevirtual   #146 <Method void VelocityTracker.recycle()>
				velocityTracker = null;
	//  119  262:aload_0         
	//  120  263:aconst_null     
	//  121  264:putfield        #35  <Field VelocityTracker velocityTracker>
			}
			break;
	//  122  267:goto            328

		case 0: // '\0'
			int j = (int)motionevent.getX();
	//  123  270:aload_3         
	//  124  271:invokevirtual   #150 <Method float MotionEvent.getX()>
	//  125  274:f2i             
	//  126  275:istore          5
			int l = (int)motionevent.getY();
	//  127  277:aload_3         
	//  128  278:invokevirtual   #152 <Method float MotionEvent.getY()>
	//  129  281:f2i             
	//  130  282:istore          6
			if(coordinatorlayout.isPointInChildBounds(view, j, l) && canDragView(view))
	//* 131  284:aload_1         
	//* 132  285:aload_2         
	//* 133  286:iload           5
	//* 134  288:iload           6
	//* 135  290:invokevirtual   #158 <Method boolean CoordinatorLayout.isPointInChildBounds(View, int, int)>
	//* 136  293:ifeq            326
	//* 137  296:aload_0         
	//* 138  297:aload_2         
	//* 139  298:invokevirtual   #154 <Method boolean canDragView(View)>
	//* 140  301:ifeq            326
			{
				lastMotionY = l;
	//  141  304:aload_0         
	//  142  305:iload           6
	//  143  307:putfield        #140 <Field int lastMotionY>
				activePointerId = motionevent.getPointerId(0);
	//  144  310:aload_0         
	//  145  311:aload_3         
	//  146  312:iconst_0        
	//  147  313:invokevirtual   #161 <Method int MotionEvent.getPointerId(int)>
	//  148  316:putfield        #26  <Field int activePointerId>
				ensureVelocityTracker();
	//  149  319:aload_0         
	//  150  320:invokespecial   #163 <Method void ensureVelocityTracker()>
			} else
	//* 151  323:goto            328
			{
				return false;
	//  152  326:iconst_0        
	//  153  327:ireturn         
			}
			break;
		}
		coordinatorlayout = ((CoordinatorLayout) (velocityTracker));
	//  154  328:aload_0         
	//  155  329:getfield        #35  <Field VelocityTracker velocityTracker>
	//  156  332:astore_1        
		if(coordinatorlayout != null)
	//* 157  333:aload_1         
	//* 158  334:ifnull          342
			((VelocityTracker) (coordinatorlayout)).addMovement(motionevent);
	//  159  337:aload_1         
	//  160  338:aload_3         
	//  161  339:invokevirtual   #167 <Method void VelocityTracker.addMovement(MotionEvent)>
		return true;
	//  162  342:iconst_1        
	//  163  343:ireturn         
	}

	final int scroll(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k)
	{
		return setHeaderTopBottomOffset(coordinatorlayout, view, getTopBottomOffsetForScrollingSibling() - i, j, k);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:invokevirtual   #188 <Method int getTopBottomOffsetForScrollingSibling()>
	//    5    7:iload_3         
	//    6    8:isub            
	//    7    9:iload           4
	//    8   11:iload           5
	//    9   13:invokevirtual   #191 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int, int, int)>
	//   10   16:ireturn         
	}

	int setHeaderTopBottomOffset(CoordinatorLayout coordinatorlayout, View view, int i)
	{
		return setHeaderTopBottomOffset(coordinatorlayout, view, i, 0x80000000, 0x7fffffff);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:ldc1            #194 <Int 0x80000000>
	//    5    6:ldc1            #195 <Int 0x7fffffff>
	//    6    8:invokevirtual   #191 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int, int, int)>
	//    7   11:ireturn         
	}

	int setHeaderTopBottomOffset(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k)
	{
		int l = getTopAndBottomOffset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method int getTopAndBottomOffset()>
	//    2    4:istore          6
		if(j != 0 && l >= j && l <= k)
	//*   3    6:iload           4
	//*   4    8:ifeq            51
	//*   5   11:iload           6
	//*   6   13:iload           4
	//*   7   15:icmplt          51
	//*   8   18:iload           6
	//*   9   20:iload           5
	//*  10   22:icmpgt          51
		{
			i = MathUtils.clamp(i, j, k);
	//   11   25:iload_3         
	//   12   26:iload           4
	//   13   28:iload           5
	//   14   30:invokestatic    #202 <Method int MathUtils.clamp(int, int, int)>
	//   15   33:istore_3        
			if(l != i)
	//*  16   34:iload           6
	//*  17   36:iload_3         
	//*  18   37:icmpeq          51
			{
				setTopAndBottomOffset(i);
	//   19   40:aload_0         
	//   20   41:iload_3         
	//   21   42:invokevirtual   #206 <Method boolean setTopAndBottomOffset(int)>
	//   22   45:pop             
				return l - i;
	//   23   46:iload           6
	//   24   48:iload_3         
	//   25   49:isub            
	//   26   50:ireturn         
			}
		}
		return 0;
	//   27   51:iconst_0        
	//   28   52:ireturn         
	}

	private int activePointerId;
	private Runnable flingRunnable;
	private boolean isBeingDragged;
	private int lastMotionY;
	OverScroller scroller;
	private int touchSlop;
	private VelocityTracker velocityTracker;
}
