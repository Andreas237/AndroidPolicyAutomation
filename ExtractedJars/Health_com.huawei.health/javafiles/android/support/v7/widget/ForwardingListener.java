// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.os.SystemClock;
import android.support.v4.view.ViewCompat;
import android.support.v7.view.menu.ShowableListMenu;
import android.view.*;

// Referenced classes of package android.support.v7.widget:
//			DropDownListView

public abstract class ForwardingListener
	implements android.view.View.OnTouchListener
{
	class DisallowIntercept
		implements Runnable
	{

		public void run()
		{
			ViewParent viewparent = mSrc.getParent();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field ForwardingListener this$0>
		//    2    4:getfield        #24  <Field View ForwardingListener.mSrc>
		//    3    7:invokevirtual   #30  <Method ViewParent View.getParent()>
		//    4   10:astore_1        
			if(viewparent != null)
		//*   5   11:aload_1         
		//*   6   12:ifnull          22
				viewparent.requestDisallowInterceptTouchEvent(true);
		//    7   15:aload_1         
		//    8   16:iconst_1        
		//    9   17:invokeinterface #36  <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
		//   10   22:return          
		}

		final ForwardingListener this$0;

		DisallowIntercept()
		{
			this$0 = ForwardingListener.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field ForwardingListener this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	class TriggerLongPress
		implements Runnable
	{

		public void run()
		{
			onLongPress();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field ForwardingListener this$0>
		//    2    4:invokevirtual   #23  <Method void ForwardingListener.onLongPress()>
		//    3    7:return          
		}

		final ForwardingListener this$0;

		TriggerLongPress()
		{
			this$0 = ForwardingListener.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field ForwardingListener this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}


	public ForwardingListener(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:newarray        int[]
	//    5    8:putfield        #42  <Field int[] mTmpLocation>
		mSrc = view;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #44  <Field View mSrc>
		view.setLongClickable(true);
	//    9   16:aload_1         
	//   10   17:iconst_1        
	//   11   18:invokevirtual   #50  <Method void View.setLongClickable(boolean)>
		if(android.os.Build.VERSION.SDK_INT >= 12)
	//*  12   21:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//*  13   24:bipush          12
	//*  14   26:icmplt          37
			addDetachListenerApi12(view);
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokespecial   #58  <Method void addDetachListenerApi12(View)>
		else
	//*  18   34:goto            42
			addDetachListenerBase(view);
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:invokespecial   #61  <Method void addDetachListenerBase(View)>
		mScaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:invokevirtual   #65  <Method android.content.Context View.getContext()>
	//   25   47:invokestatic    #71  <Method ViewConfiguration ViewConfiguration.get(android.content.Context)>
	//   26   50:invokevirtual   #75  <Method int ViewConfiguration.getScaledTouchSlop()>
	//   27   53:i2f             
	//   28   54:putfield        #77  <Field float mScaledTouchSlop>
	//   29   57:aload_0         
	//   30   58:invokestatic    #80  <Method int ViewConfiguration.getTapTimeout()>
	//   31   61:putfield        #82  <Field int mTapTimeout>
		mLongPressTimeout = (mTapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
	//   32   64:aload_0         
	//   33   65:aload_0         
	//   34   66:getfield        #82  <Field int mTapTimeout>
	//   35   69:invokestatic    #85  <Method int ViewConfiguration.getLongPressTimeout()>
	//   36   72:iadd            
	//   37   73:iconst_2        
	//   38   74:idiv            
	//   39   75:putfield        #87  <Field int mLongPressTimeout>
	//   40   78:return          
	}

	private void addDetachListenerApi12(View view)
	{
		view.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() {

			public void onViewAttachedToWindow(View view1)
			{
			//    0    0:return          
			}

			public void onViewDetachedFromWindow(View view1)
			{
				onDetachedFromWindow();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ForwardingListener this$0>
			//    2    4:invokestatic    #26  <Method void ForwardingListener.access$000(ForwardingListener)>
			//    3    7:return          
			}

			final ForwardingListener this$0;

			
			{
				this$0 = ForwardingListener.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ForwardingListener this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_1         
	//    1    1:new             #8   <Class ForwardingListener$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #97  <Method void ForwardingListener$1(ForwardingListener)>
	//    5    9:invokevirtual   #101 <Method void View.addOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
	//    6   12:return          
	}

	private void addDetachListenerBase(View view)
	{
		view.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

			public void onGlobalLayout()
			{
				boolean flag = mIsAttached;
			//    0    0:aload_0         
			//    1    1:getfield        #34  <Field boolean mIsAttached>
			//    2    4:istore_1        
				mIsAttached = ViewCompat.isAttachedToWindow(mSrc);
			//    3    5:aload_0         
			//    4    6:aload_0         
			//    5    7:getfield        #19  <Field ForwardingListener this$0>
			//    6   10:getfield        #26  <Field View ForwardingListener.mSrc>
			//    7   13:invokestatic    #32  <Method boolean ViewCompat.isAttachedToWindow(View)>
			//    8   16:putfield        #34  <Field boolean mIsAttached>
				if(flag && !mIsAttached)
			//*   9   19:iload_1         
			//*  10   20:ifeq            37
			//*  11   23:aload_0         
			//*  12   24:getfield        #34  <Field boolean mIsAttached>
			//*  13   27:ifne            37
					onDetachedFromWindow();
			//   14   30:aload_0         
			//   15   31:getfield        #19  <Field ForwardingListener this$0>
			//   16   34:invokestatic    #39  <Method void ForwardingListener.access$000(ForwardingListener)>
			//   17   37:return          
			}

			boolean mIsAttached;
			final ForwardingListener this$0;

			
			{
				this$0 = ForwardingListener.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ForwardingListener this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
				mIsAttached = ViewCompat.isAttachedToWindow(mSrc);
			//    5    9:aload_0         
			//    6   10:aload_0         
			//    7   11:getfield        #19  <Field ForwardingListener this$0>
			//    8   14:getfield        #26  <Field View ForwardingListener.mSrc>
			//    9   17:invokestatic    #32  <Method boolean ViewCompat.isAttachedToWindow(View)>
			//   10   20:putfield        #34  <Field boolean mIsAttached>
			//   11   23:return          
			}
		}
);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #106 <Method ViewTreeObserver View.getViewTreeObserver()>
	//    2    4:new             #10  <Class ForwardingListener$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #107 <Method void ForwardingListener$2(ForwardingListener)>
	//    6   12:invokevirtual   #113 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//    7   15:return          
	}

	private void clearCallbacks()
	{
		if(mTriggerLongPress != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field Runnable mTriggerLongPress>
	//*   2    4:ifnull          19
			mSrc.removeCallbacks(mTriggerLongPress);
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field View mSrc>
	//    5   11:aload_0         
	//    6   12:getfield        #116 <Field Runnable mTriggerLongPress>
	//    7   15:invokevirtual   #120 <Method boolean View.removeCallbacks(Runnable)>
	//    8   18:pop             
		if(mDisallowIntercept != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #122 <Field Runnable mDisallowIntercept>
	//*  11   23:ifnull          38
			mSrc.removeCallbacks(mDisallowIntercept);
	//   12   26:aload_0         
	//   13   27:getfield        #44  <Field View mSrc>
	//   14   30:aload_0         
	//   15   31:getfield        #122 <Field Runnable mDisallowIntercept>
	//   16   34:invokevirtual   #120 <Method boolean View.removeCallbacks(Runnable)>
	//   17   37:pop             
	//   18   38:return          
	}

	private void onDetachedFromWindow()
	{
		mForwarding = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #124 <Field boolean mForwarding>
		mActivePointerId = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #126 <Field int mActivePointerId>
		if(mDisallowIntercept != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #122 <Field Runnable mDisallowIntercept>
	//*   8   14:ifnull          29
			mSrc.removeCallbacks(mDisallowIntercept);
	//    9   17:aload_0         
	//   10   18:getfield        #44  <Field View mSrc>
	//   11   21:aload_0         
	//   12   22:getfield        #122 <Field Runnable mDisallowIntercept>
	//   13   25:invokevirtual   #120 <Method boolean View.removeCallbacks(Runnable)>
	//   14   28:pop             
	//   15   29:return          
	}

	private boolean onTouchForwarded(MotionEvent motionevent)
	{
		View view = mSrc;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field View mSrc>
	//    2    4:astore          4
		Object obj = ((Object) (getPopup()));
	//    3    6:aload_0         
	//    4    7:invokevirtual   #132 <Method ShowableListMenu getPopup()>
	//    5   10:astore          5
		if(obj == null || !((ShowableListMenu) (obj)).isShowing())
	//*   6   12:aload           5
	//*   7   14:ifnull          27
	//*   8   17:aload           5
	//*   9   19:invokeinterface #138 <Method boolean ShowableListMenu.isShowing()>
	//*  10   24:ifne            29
			return false;
	//   11   27:iconst_0        
	//   12   28:ireturn         
		obj = ((Object) ((DropDownListView)((ShowableListMenu) (obj)).getListView()));
	//   13   29:aload           5
	//   14   31:invokeinterface #142 <Method android.widget.ListView ShowableListMenu.getListView()>
	//   15   36:checkcast       #144 <Class DropDownListView>
	//   16   39:astore          5
		if(obj == null || !((DropDownListView) (obj)).isShown())
	//*  17   41:aload           5
	//*  18   43:ifnull          54
	//*  19   46:aload           5
	//*  20   48:invokevirtual   #147 <Method boolean DropDownListView.isShown()>
	//*  21   51:ifne            56
			return false;
	//   22   54:iconst_0        
	//   23   55:ireturn         
		MotionEvent motionevent1 = MotionEvent.obtainNoHistory(motionevent);
	//   24   56:aload_1         
	//   25   57:invokestatic    #153 <Method MotionEvent MotionEvent.obtainNoHistory(MotionEvent)>
	//   26   60:astore          6
		toGlobalMotionEvent(view, motionevent1);
	//   27   62:aload_0         
	//   28   63:aload           4
	//   29   65:aload           6
	//   30   67:invokespecial   #157 <Method boolean toGlobalMotionEvent(View, MotionEvent)>
	//   31   70:pop             
		toLocalMotionEvent(((View) (obj)), motionevent1);
	//   32   71:aload_0         
	//   33   72:aload           5
	//   34   74:aload           6
	//   35   76:invokespecial   #160 <Method boolean toLocalMotionEvent(View, MotionEvent)>
	//   36   79:pop             
		boolean flag = ((DropDownListView) (obj)).onForwardedEvent(motionevent1, mActivePointerId);
	//   37   80:aload           5
	//   38   82:aload           6
	//   39   84:aload_0         
	//   40   85:getfield        #126 <Field int mActivePointerId>
	//   41   88:invokevirtual   #164 <Method boolean DropDownListView.onForwardedEvent(MotionEvent, int)>
	//   42   91:istore_3        
		motionevent1.recycle();
	//   43   92:aload           6
	//   44   94:invokevirtual   #167 <Method void MotionEvent.recycle()>
		int i = motionevent.getActionMasked();
	//   45   97:aload_1         
	//   46   98:invokevirtual   #170 <Method int MotionEvent.getActionMasked()>
	//   47  101:istore_2        
		if(i != 1 && i != 3)
	//*  48  102:iload_2         
	//*  49  103:iconst_1        
	//*  50  104:icmpeq          117
	//*  51  107:iload_2         
	//*  52  108:iconst_3        
	//*  53  109:icmpeq          117
			i = 1;
	//   54  112:iconst_1        
	//   55  113:istore_2        
		else
	//*  56  114:goto            119
			i = 0;
	//   57  117:iconst_0        
	//   58  118:istore_2        
		return flag && i;
	//   59  119:iload_3         
	//   60  120:ifeq            129
	//   61  123:iload_2         
	//   62  124:ifeq            129
	//   63  127:iconst_1        
	//   64  128:ireturn         
	//   65  129:iconst_0        
	//   66  130:ireturn         
	}

	private boolean onTouchObserved(MotionEvent motionevent)
	{
		View view = mSrc;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field View mSrc>
	//    2    4:astore_3        
		if(!view.isEnabled())
	//*   3    5:aload_3         
	//*   4    6:invokevirtual   #174 <Method boolean View.isEnabled()>
	//*   5    9:ifne            14
			return false;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		switch(motionevent.getActionMasked())
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #170 <Method int MotionEvent.getActionMasked()>
		{
		default:
			break;

	//*  10   18:tableswitch     0 3: default 48
	//	               0 51
	//	               1 182
	//	               2 129
	//	               3 182
	//*  11   48:goto            186
		case 0: // '\0'
			mActivePointerId = motionevent.getPointerId(0);
	//   12   51:aload_0         
	//   13   52:aload_1         
	//   14   53:iconst_0        
	//   15   54:invokevirtual   #178 <Method int MotionEvent.getPointerId(int)>
	//   16   57:putfield        #126 <Field int mActivePointerId>
			if(mDisallowIntercept == null)
	//*  17   60:aload_0         
	//*  18   61:getfield        #122 <Field Runnable mDisallowIntercept>
	//*  19   64:ifnonnull       79
				mDisallowIntercept = ((Runnable) (new DisallowIntercept()));
	//   20   67:aload_0         
	//   21   68:new             #12  <Class ForwardingListener$DisallowIntercept>
	//   22   71:dup             
	//   23   72:aload_0         
	//   24   73:invokespecial   #179 <Method void ForwardingListener$DisallowIntercept(ForwardingListener)>
	//   25   76:putfield        #122 <Field Runnable mDisallowIntercept>
			view.postDelayed(mDisallowIntercept, mTapTimeout);
	//   26   79:aload_3         
	//   27   80:aload_0         
	//   28   81:getfield        #122 <Field Runnable mDisallowIntercept>
	//   29   84:aload_0         
	//   30   85:getfield        #82  <Field int mTapTimeout>
	//   31   88:i2l             
	//   32   89:invokevirtual   #183 <Method boolean View.postDelayed(Runnable, long)>
	//   33   92:pop             
			if(mTriggerLongPress == null)
	//*  34   93:aload_0         
	//*  35   94:getfield        #116 <Field Runnable mTriggerLongPress>
	//*  36   97:ifnonnull       112
				mTriggerLongPress = ((Runnable) (new TriggerLongPress()));
	//   37  100:aload_0         
	//   38  101:new             #15  <Class ForwardingListener$TriggerLongPress>
	//   39  104:dup             
	//   40  105:aload_0         
	//   41  106:invokespecial   #184 <Method void ForwardingListener$TriggerLongPress(ForwardingListener)>
	//   42  109:putfield        #116 <Field Runnable mTriggerLongPress>
			view.postDelayed(mTriggerLongPress, mLongPressTimeout);
	//   43  112:aload_3         
	//   44  113:aload_0         
	//   45  114:getfield        #116 <Field Runnable mTriggerLongPress>
	//   46  117:aload_0         
	//   47  118:getfield        #87  <Field int mLongPressTimeout>
	//   48  121:i2l             
	//   49  122:invokevirtual   #183 <Method boolean View.postDelayed(Runnable, long)>
	//   50  125:pop             
			break;
	//   51  126:goto            186

		case 2: // '\002'
			int i = motionevent.findPointerIndex(mActivePointerId);
	//   52  129:aload_1         
	//   53  130:aload_0         
	//   54  131:getfield        #126 <Field int mActivePointerId>
	//   55  134:invokevirtual   #187 <Method int MotionEvent.findPointerIndex(int)>
	//   56  137:istore_2        
			if(i >= 0 && !pointInView(view, motionevent.getX(i), motionevent.getY(i), mScaledTouchSlop))
	//*  57  138:iload_2         
	//*  58  139:iflt            186
	//*  59  142:aload_3         
	//*  60  143:aload_1         
	//*  61  144:iload_2         
	//*  62  145:invokevirtual   #191 <Method float MotionEvent.getX(int)>
	//*  63  148:aload_1         
	//*  64  149:iload_2         
	//*  65  150:invokevirtual   #194 <Method float MotionEvent.getY(int)>
	//*  66  153:aload_0         
	//*  67  154:getfield        #77  <Field float mScaledTouchSlop>
	//*  68  157:invokestatic    #198 <Method boolean pointInView(View, float, float, float)>
	//*  69  160:ifne            179
			{
				clearCallbacks();
	//   70  163:aload_0         
	//   71  164:invokespecial   #200 <Method void clearCallbacks()>
				view.getParent().requestDisallowInterceptTouchEvent(true);
	//   72  167:aload_3         
	//   73  168:invokevirtual   #204 <Method ViewParent View.getParent()>
	//   74  171:iconst_1        
	//   75  172:invokeinterface #209 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
				return true;
	//   76  177:iconst_1        
	//   77  178:ireturn         
			}
			break;

	//*  78  179:goto            186
		case 1: // '\001'
		case 3: // '\003'
			clearCallbacks();
	//   79  182:aload_0         
	//   80  183:invokespecial   #200 <Method void clearCallbacks()>
			break;
		}
		return false;
	//   81  186:iconst_0        
	//   82  187:ireturn         
	}

	private static boolean pointInView(View view, float f, float f1, float f2)
	{
		return f >= -f2 && f1 >= -f2 && f < (float)(view.getRight() - view.getLeft()) + f2 && f1 < (float)(view.getBottom() - view.getTop()) + f2;
	//    0    0:fload_1         
	//    1    1:fload_3         
	//    2    2:fneg            
	//    3    3:fcmpl           
	//    4    4:iflt            50
	//    5    7:fload_2         
	//    6    8:fload_3         
	//    7    9:fneg            
	//    8   10:fcmpl           
	//    9   11:iflt            50
	//   10   14:fload_1         
	//   11   15:aload_0         
	//   12   16:invokevirtual   #212 <Method int View.getRight()>
	//   13   19:aload_0         
	//   14   20:invokevirtual   #215 <Method int View.getLeft()>
	//   15   23:isub            
	//   16   24:i2f             
	//   17   25:fload_3         
	//   18   26:fadd            
	//   19   27:fcmpg           
	//   20   28:ifge            50
	//   21   31:fload_2         
	//   22   32:aload_0         
	//   23   33:invokevirtual   #218 <Method int View.getBottom()>
	//   24   36:aload_0         
	//   25   37:invokevirtual   #221 <Method int View.getTop()>
	//   26   40:isub            
	//   27   41:i2f             
	//   28   42:fload_3         
	//   29   43:fadd            
	//   30   44:fcmpg           
	//   31   45:ifge            50
	//   32   48:iconst_1        
	//   33   49:ireturn         
	//   34   50:iconst_0        
	//   35   51:ireturn         
	}

	private boolean toGlobalMotionEvent(View view, MotionEvent motionevent)
	{
		int ai[] = mTmpLocation;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int[] mTmpLocation>
	//    2    4:astore_3        
		view.getLocationOnScreen(ai);
	//    3    5:aload_1         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #225 <Method void View.getLocationOnScreen(int[])>
		motionevent.offsetLocation(ai[0], ai[1]);
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:iconst_0        
	//    9   13:iaload          
	//   10   14:i2f             
	//   11   15:aload_3         
	//   12   16:iconst_1        
	//   13   17:iaload          
	//   14   18:i2f             
	//   15   19:invokevirtual   #229 <Method void MotionEvent.offsetLocation(float, float)>
		return true;
	//   16   22:iconst_1        
	//   17   23:ireturn         
	}

	private boolean toLocalMotionEvent(View view, MotionEvent motionevent)
	{
		int ai[] = mTmpLocation;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int[] mTmpLocation>
	//    2    4:astore_3        
		view.getLocationOnScreen(ai);
	//    3    5:aload_1         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #225 <Method void View.getLocationOnScreen(int[])>
		motionevent.offsetLocation(-ai[0], -ai[1]);
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:iconst_0        
	//    9   13:iaload          
	//   10   14:ineg            
	//   11   15:i2f             
	//   12   16:aload_3         
	//   13   17:iconst_1        
	//   14   18:iaload          
	//   15   19:ineg            
	//   16   20:i2f             
	//   17   21:invokevirtual   #229 <Method void MotionEvent.offsetLocation(float, float)>
		return true;
	//   18   24:iconst_1        
	//   19   25:ireturn         
	}

	public abstract ShowableListMenu getPopup();

	protected boolean onForwardingStarted()
	{
		ShowableListMenu showablelistmenu = getPopup();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #132 <Method ShowableListMenu getPopup()>
	//    2    4:astore_1        
		if(showablelistmenu != null && !showablelistmenu.isShowing())
	//*   3    5:aload_1         
	//*   4    6:ifnull          24
	//*   5    9:aload_1         
	//*   6   10:invokeinterface #138 <Method boolean ShowableListMenu.isShowing()>
	//*   7   15:ifne            24
			showablelistmenu.show();
	//    8   18:aload_1         
	//    9   19:invokeinterface #233 <Method void ShowableListMenu.show()>
		return true;
	//   10   24:iconst_1        
	//   11   25:ireturn         
	}

	protected boolean onForwardingStopped()
	{
		ShowableListMenu showablelistmenu = getPopup();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #132 <Method ShowableListMenu getPopup()>
	//    2    4:astore_1        
		if(showablelistmenu != null && showablelistmenu.isShowing())
	//*   3    5:aload_1         
	//*   4    6:ifnull          24
	//*   5    9:aload_1         
	//*   6   10:invokeinterface #138 <Method boolean ShowableListMenu.isShowing()>
	//*   7   15:ifeq            24
			showablelistmenu.dismiss();
	//    8   18:aload_1         
	//    9   19:invokeinterface #237 <Method void ShowableListMenu.dismiss()>
		return true;
	//   10   24:iconst_1        
	//   11   25:ireturn         
	}

	void onLongPress()
	{
		clearCallbacks();
	//    0    0:aload_0         
	//    1    1:invokespecial   #200 <Method void clearCallbacks()>
		View view = mSrc;
	//    2    4:aload_0         
	//    3    5:getfield        #44  <Field View mSrc>
	//    4    8:astore_3        
		if(!view.isEnabled() || view.isLongClickable())
	//*   5    9:aload_3         
	//*   6   10:invokevirtual   #174 <Method boolean View.isEnabled()>
	//*   7   13:ifeq            23
	//*   8   16:aload_3         
	//*   9   17:invokevirtual   #241 <Method boolean View.isLongClickable()>
	//*  10   20:ifeq            24
			return;
	//   11   23:return          
		if(!onForwardingStarted())
	//*  12   24:aload_0         
	//*  13   25:invokevirtual   #243 <Method boolean onForwardingStarted()>
	//*  14   28:ifne            32
		{
			return;
	//   15   31:return          
		} else
		{
			view.getParent().requestDisallowInterceptTouchEvent(true);
	//   16   32:aload_3         
	//   17   33:invokevirtual   #204 <Method ViewParent View.getParent()>
	//   18   36:iconst_1        
	//   19   37:invokeinterface #209 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
			long l = SystemClock.uptimeMillis();
	//   20   42:invokestatic    #249 <Method long SystemClock.uptimeMillis()>
	//   21   45:lstore_1        
			MotionEvent motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
	//   22   46:lload_1         
	//   23   47:lload_1         
	//   24   48:iconst_3        
	//   25   49:fconst_0        
	//   26   50:fconst_0        
	//   27   51:iconst_0        
	//   28   52:invokestatic    #253 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   29   55:astore          4
			view.onTouchEvent(motionevent);
	//   30   57:aload_3         
	//   31   58:aload           4
	//   32   60:invokevirtual   #256 <Method boolean View.onTouchEvent(MotionEvent)>
	//   33   63:pop             
			motionevent.recycle();
	//   34   64:aload           4
	//   35   66:invokevirtual   #167 <Method void MotionEvent.recycle()>
			mForwarding = true;
	//   36   69:aload_0         
	//   37   70:iconst_1        
	//   38   71:putfield        #124 <Field boolean mForwarding>
			return;
	//   39   74:return          
		}
	}

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		boolean flag3 = mForwarding;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field boolean mForwarding>
	//    2    4:istore          5
		boolean flag2;
		if(flag3)
	//*   3    6:iload           5
	//*   4    8:ifeq            39
		{
			boolean flag;
			if(onTouchForwarded(motionevent) || !onForwardingStopped())
	//*   5   11:aload_0         
	//*   6   12:aload_2         
	//*   7   13:invokespecial   #259 <Method boolean onTouchForwarded(MotionEvent)>
	//*   8   16:ifne            26
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #261 <Method boolean onForwardingStopped()>
	//*  11   23:ifne            31
				flag = true;
	//   12   26:iconst_1        
	//   13   27:istore_3        
			else
	//*  14   28:goto            33
				flag = false;
	//   15   31:iconst_0        
	//   16   32:istore_3        
			flag2 = flag;
	//   17   33:iload_3         
	//   18   34:istore          4
		} else
	//*  19   36:goto            101
		{
			boolean flag1;
			if(onTouchObserved(motionevent) && onForwardingStarted())
	//*  20   39:aload_0         
	//*  21   40:aload_2         
	//*  22   41:invokespecial   #263 <Method boolean onTouchObserved(MotionEvent)>
	//*  23   44:ifeq            59
	//*  24   47:aload_0         
	//*  25   48:invokevirtual   #243 <Method boolean onForwardingStarted()>
	//*  26   51:ifeq            59
				flag1 = true;
	//   27   54:iconst_1        
	//   28   55:istore_3        
			else
	//*  29   56:goto            61
				flag1 = false;
	//   30   59:iconst_0        
	//   31   60:istore_3        
			flag2 = flag1;
	//   32   61:iload_3         
	//   33   62:istore          4
			if(flag1)
	//*  34   64:iload_3         
	//*  35   65:ifeq            101
			{
				long l = SystemClock.uptimeMillis();
	//   36   68:invokestatic    #249 <Method long SystemClock.uptimeMillis()>
	//   37   71:lstore          6
				view = ((View) (MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0)));
	//   38   73:lload           6
	//   39   75:lload           6
	//   40   77:iconst_3        
	//   41   78:fconst_0        
	//   42   79:fconst_0        
	//   43   80:iconst_0        
	//   44   81:invokestatic    #253 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   45   84:astore_1        
				mSrc.onTouchEvent(((MotionEvent) (view)));
	//   46   85:aload_0         
	//   47   86:getfield        #44  <Field View mSrc>
	//   48   89:aload_1         
	//   49   90:invokevirtual   #256 <Method boolean View.onTouchEvent(MotionEvent)>
	//   50   93:pop             
				((MotionEvent) (view)).recycle();
	//   51   94:aload_1         
	//   52   95:invokevirtual   #167 <Method void MotionEvent.recycle()>
				flag2 = flag1;
	//   53   98:iload_3         
	//   54   99:istore          4
			}
		}
		mForwarding = flag2;
	//   55  101:aload_0         
	//   56  102:iload           4
	//   57  104:putfield        #124 <Field boolean mForwarding>
		return flag2 || flag3;
	//   58  107:iload           4
	//   59  109:ifne            117
	//   60  112:iload           5
	//   61  114:ifeq            119
	//   62  117:iconst_1        
	//   63  118:ireturn         
	//   64  119:iconst_0        
	//   65  120:ireturn         
	}

	private int mActivePointerId;
	private Runnable mDisallowIntercept;
	private boolean mForwarding;
	private final int mLongPressTimeout;
	private final float mScaledTouchSlop;
	final View mSrc;
	private final int mTapTimeout = ViewConfiguration.getTapTimeout();
	private final int mTmpLocation[] = new int[2];
	private Runnable mTriggerLongPress;


/*
	static void access$000(ForwardingListener forwardinglistener)
	{
		forwardinglistener.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #93  <Method void onDetachedFromWindow()>
		return;
	//    2    4:return          
	}

*/
}
