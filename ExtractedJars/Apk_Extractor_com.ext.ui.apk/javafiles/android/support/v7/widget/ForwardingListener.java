// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.os.SystemClock;
import android.support.v7.view.menu.ShowableListMenu;
import android.view.*;

// Referenced classes of package android.support.v7.widget:
//			DropDownListView

public abstract class ForwardingListener
	implements android.view.View.OnAttachStateChangeListener, android.view.View.OnTouchListener
{
	private class DisallowIntercept
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

	private class TriggerLongPress
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
	//    1    1:invokespecial   #38  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:newarray        int[]
	//    5    8:putfield        #40  <Field int[] mTmpLocation>
		mSrc = view;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #42  <Field View mSrc>
		view.setLongClickable(true);
	//    9   16:aload_1         
	//   10   17:iconst_1        
	//   11   18:invokevirtual   #48  <Method void View.setLongClickable(boolean)>
		view.addOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (this)));
	//   12   21:aload_1         
	//   13   22:aload_0         
	//   14   23:invokevirtual   #52  <Method void View.addOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
		mScaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
	//   15   26:aload_0         
	//   16   27:aload_1         
	//   17   28:invokevirtual   #56  <Method android.content.Context View.getContext()>
	//   18   31:invokestatic    #62  <Method ViewConfiguration ViewConfiguration.get(android.content.Context)>
	//   19   34:invokevirtual   #66  <Method int ViewConfiguration.getScaledTouchSlop()>
	//   20   37:i2f             
	//   21   38:putfield        #68  <Field float mScaledTouchSlop>
	//   22   41:aload_0         
	//   23   42:invokestatic    #71  <Method int ViewConfiguration.getTapTimeout()>
	//   24   45:putfield        #73  <Field int mTapTimeout>
		mLongPressTimeout = (mTapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
	//   25   48:aload_0         
	//   26   49:aload_0         
	//   27   50:getfield        #73  <Field int mTapTimeout>
	//   28   53:invokestatic    #76  <Method int ViewConfiguration.getLongPressTimeout()>
	//   29   56:iadd            
	//   30   57:iconst_2        
	//   31   58:idiv            
	//   32   59:putfield        #78  <Field int mLongPressTimeout>
	//   33   62:return          
	}

	private void clearCallbacks()
	{
		if(mTriggerLongPress != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field Runnable mTriggerLongPress>
	//*   2    4:ifnull          19
			mSrc.removeCallbacks(mTriggerLongPress);
	//    3    7:aload_0         
	//    4    8:getfield        #42  <Field View mSrc>
	//    5   11:aload_0         
	//    6   12:getfield        #82  <Field Runnable mTriggerLongPress>
	//    7   15:invokevirtual   #86  <Method boolean View.removeCallbacks(Runnable)>
	//    8   18:pop             
		if(mDisallowIntercept != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #88  <Field Runnable mDisallowIntercept>
	//*  11   23:ifnull          38
			mSrc.removeCallbacks(mDisallowIntercept);
	//   12   26:aload_0         
	//   13   27:getfield        #42  <Field View mSrc>
	//   14   30:aload_0         
	//   15   31:getfield        #88  <Field Runnable mDisallowIntercept>
	//   16   34:invokevirtual   #86  <Method boolean View.removeCallbacks(Runnable)>
	//   17   37:pop             
	//   18   38:return          
	}

	private boolean onTouchForwarded(MotionEvent motionevent)
	{
		View view = mSrc;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field View mSrc>
	//    2    4:astore          4
		Object obj = ((Object) (getPopup()));
	//    3    6:aload_0         
	//    4    7:invokevirtual   #94  <Method ShowableListMenu getPopup()>
	//    5   10:astore          5
		if(obj != null && ((ShowableListMenu) (obj)).isShowing())
	//*   6   12:aload           5
	//*   7   14:ifnull          27
	//*   8   17:aload           5
	//*   9   19:invokeinterface #100 <Method boolean ShowableListMenu.isShowing()>
	//*  10   24:ifne            29
	//*  11   27:iconst_0        
	//*  12   28:ireturn         
	//*  13   29:aload           5
	//*  14   31:invokeinterface #104 <Method android.widget.ListView ShowableListMenu.getListView()>
	//*  15   36:checkcast       #106 <Class DropDownListView>
	//*  16   39:astore          5
			if((obj = ((Object) ((DropDownListView)((ShowableListMenu) (obj)).getListView()))) != null && ((DropDownListView) (obj)).isShown())
	//*  17   41:aload           5
	//*  18   43:ifnull          27
	//*  19   46:aload           5
	//*  20   48:invokevirtual   #109 <Method boolean DropDownListView.isShown()>
	//*  21   51:ifeq            27
			{
				MotionEvent motionevent1 = MotionEvent.obtainNoHistory(motionevent);
	//   22   54:aload_1         
	//   23   55:invokestatic    #115 <Method MotionEvent MotionEvent.obtainNoHistory(MotionEvent)>
	//   24   58:astore          6
				toGlobalMotionEvent(view, motionevent1);
	//   25   60:aload_0         
	//   26   61:aload           4
	//   27   63:aload           6
	//   28   65:invokespecial   #119 <Method boolean toGlobalMotionEvent(View, MotionEvent)>
	//   29   68:pop             
				toLocalMotionEvent(((View) (obj)), motionevent1);
	//   30   69:aload_0         
	//   31   70:aload           5
	//   32   72:aload           6
	//   33   74:invokespecial   #122 <Method boolean toLocalMotionEvent(View, MotionEvent)>
	//   34   77:pop             
				boolean flag = ((DropDownListView) (obj)).onForwardedEvent(motionevent1, mActivePointerId);
	//   35   78:aload           5
	//   36   80:aload           6
	//   37   82:aload_0         
	//   38   83:getfield        #124 <Field int mActivePointerId>
	//   39   86:invokevirtual   #128 <Method boolean DropDownListView.onForwardedEvent(MotionEvent, int)>
	//   40   89:istore_3        
				motionevent1.recycle();
	//   41   90:aload           6
	//   42   92:invokevirtual   #131 <Method void MotionEvent.recycle()>
				int i = motionevent.getActionMasked();
	//   43   95:aload_1         
	//   44   96:invokevirtual   #134 <Method int MotionEvent.getActionMasked()>
	//   45   99:istore_2        
				if(i != 1 && i != 3)
	//*  46  100:iload_2         
	//*  47  101:iconst_1        
	//*  48  102:icmpeq          124
	//*  49  105:iload_2         
	//*  50  106:iconst_3        
	//*  51  107:icmpeq          124
					i = 1;
	//   52  110:iconst_1        
	//   53  111:istore_2        
				else
	//*  54  112:iload_3         
	//*  55  113:ifeq            129
	//*  56  116:iload_2         
	//*  57  117:ifeq            129
	//*  58  120:iconst_1        
	//*  59  121:istore_3        
	//*  60  122:iload_3         
	//*  61  123:ireturn         
					i = 0;
	//   62  124:iconst_0        
	//   63  125:istore_2        
				if(flag && i)
					flag = true;
				else
	//*  64  126:goto            112
					flag = false;
	//   65  129:iconst_0        
	//   66  130:istore_3        
				return flag;
			}
		return false;
	//*  67  131:goto            122
	}

	private boolean onTouchObserved(MotionEvent motionevent)
	{
		View view = mSrc;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field View mSrc>
	//    2    4:astore_3        
		if(view.isEnabled()) goto _L2; else goto _L1
	//    3    5:aload_3         
	//    4    6:invokevirtual   #138 <Method boolean View.isEnabled()>
	//    5    9:ifne            14
_L1:
		return false;
	//    6   12:iconst_0        
	//    7   13:ireturn         
_L2:
		switch(motionevent.getActionMasked())
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #134 <Method int MotionEvent.getActionMasked()>
		{
	//*  10   18:tableswitch     0 3: default 48
	//	               0 50
	//	               1 177
	//	               2 127
	//	               3 177
		default:
			return false;
	//   11   48:iconst_0        
	//   12   49:ireturn         

		case 0: // '\0'
			mActivePointerId = motionevent.getPointerId(0);
	//   13   50:aload_0         
	//   14   51:aload_1         
	//   15   52:iconst_0        
	//   16   53:invokevirtual   #142 <Method int MotionEvent.getPointerId(int)>
	//   17   56:putfield        #124 <Field int mActivePointerId>
			if(mDisallowIntercept == null)
	//*  18   59:aload_0         
	//*  19   60:getfield        #88  <Field Runnable mDisallowIntercept>
	//*  20   63:ifnonnull       78
				mDisallowIntercept = ((Runnable) (new DisallowIntercept()));
	//   21   66:aload_0         
	//   22   67:new             #10  <Class ForwardingListener$DisallowIntercept>
	//   23   70:dup             
	//   24   71:aload_0         
	//   25   72:invokespecial   #145 <Method void ForwardingListener$DisallowIntercept(ForwardingListener)>
	//   26   75:putfield        #88  <Field Runnable mDisallowIntercept>
			view.postDelayed(mDisallowIntercept, mTapTimeout);
	//   27   78:aload_3         
	//   28   79:aload_0         
	//   29   80:getfield        #88  <Field Runnable mDisallowIntercept>
	//   30   83:aload_0         
	//   31   84:getfield        #73  <Field int mTapTimeout>
	//   32   87:i2l             
	//   33   88:invokevirtual   #149 <Method boolean View.postDelayed(Runnable, long)>
	//   34   91:pop             
			if(mTriggerLongPress == null)
	//*  35   92:aload_0         
	//*  36   93:getfield        #82  <Field Runnable mTriggerLongPress>
	//*  37   96:ifnonnull       111
				mTriggerLongPress = ((Runnable) (new TriggerLongPress()));
	//   38   99:aload_0         
	//   39  100:new             #13  <Class ForwardingListener$TriggerLongPress>
	//   40  103:dup             
	//   41  104:aload_0         
	//   42  105:invokespecial   #150 <Method void ForwardingListener$TriggerLongPress(ForwardingListener)>
	//   43  108:putfield        #82  <Field Runnable mTriggerLongPress>
			view.postDelayed(mTriggerLongPress, mLongPressTimeout);
	//   44  111:aload_3         
	//   45  112:aload_0         
	//   46  113:getfield        #82  <Field Runnable mTriggerLongPress>
	//   47  116:aload_0         
	//   48  117:getfield        #78  <Field int mLongPressTimeout>
	//   49  120:i2l             
	//   50  121:invokevirtual   #149 <Method boolean View.postDelayed(Runnable, long)>
	//   51  124:pop             
			return false;
	//   52  125:iconst_0        
	//   53  126:ireturn         

		case 2: // '\002'
			int i = motionevent.findPointerIndex(mActivePointerId);
	//   54  127:aload_1         
	//   55  128:aload_0         
	//   56  129:getfield        #124 <Field int mActivePointerId>
	//   57  132:invokevirtual   #153 <Method int MotionEvent.findPointerIndex(int)>
	//   58  135:istore_2        
			if(i >= 0 && !pointInView(view, motionevent.getX(i), motionevent.getY(i), mScaledTouchSlop))
	//*  59  136:iload_2         
	//*  60  137:iflt            12
	//*  61  140:aload_3         
	//*  62  141:aload_1         
	//*  63  142:iload_2         
	//*  64  143:invokevirtual   #157 <Method float MotionEvent.getX(int)>
	//*  65  146:aload_1         
	//*  66  147:iload_2         
	//*  67  148:invokevirtual   #160 <Method float MotionEvent.getY(int)>
	//*  68  151:aload_0         
	//*  69  152:getfield        #68  <Field float mScaledTouchSlop>
	//*  70  155:invokestatic    #164 <Method boolean pointInView(View, float, float, float)>
	//*  71  158:ifne            12
			{
				clearCallbacks();
	//   72  161:aload_0         
	//   73  162:invokespecial   #166 <Method void clearCallbacks()>
				view.getParent().requestDisallowInterceptTouchEvent(true);
	//   74  165:aload_3         
	//   75  166:invokevirtual   #170 <Method ViewParent View.getParent()>
	//   76  169:iconst_1        
	//   77  170:invokeinterface #175 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
				return true;
	//   78  175:iconst_1        
	//   79  176:ireturn         
			}
			break;

		case 1: // '\001'
		case 3: // '\003'
			clearCallbacks();
	//   80  177:aload_0         
	//   81  178:invokespecial   #166 <Method void clearCallbacks()>
			return false;
	//   82  181:iconst_0        
	//   83  182:ireturn         
		}
		if(true) goto _L1; else goto _L3
_L3:
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
	//   12   16:invokevirtual   #178 <Method int View.getRight()>
	//   13   19:aload_0         
	//   14   20:invokevirtual   #181 <Method int View.getLeft()>
	//   15   23:isub            
	//   16   24:i2f             
	//   17   25:fload_3         
	//   18   26:fadd            
	//   19   27:fcmpg           
	//   20   28:ifge            50
	//   21   31:fload_2         
	//   22   32:aload_0         
	//   23   33:invokevirtual   #184 <Method int View.getBottom()>
	//   24   36:aload_0         
	//   25   37:invokevirtual   #187 <Method int View.getTop()>
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
	//    1    1:getfield        #40  <Field int[] mTmpLocation>
	//    2    4:astore_3        
		view.getLocationOnScreen(ai);
	//    3    5:aload_1         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #191 <Method void View.getLocationOnScreen(int[])>
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
	//   15   19:invokevirtual   #195 <Method void MotionEvent.offsetLocation(float, float)>
		return true;
	//   16   22:iconst_1        
	//   17   23:ireturn         
	}

	private boolean toLocalMotionEvent(View view, MotionEvent motionevent)
	{
		int ai[] = mTmpLocation;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int[] mTmpLocation>
	//    2    4:astore_3        
		view.getLocationOnScreen(ai);
	//    3    5:aload_1         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #191 <Method void View.getLocationOnScreen(int[])>
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
	//   17   21:invokevirtual   #195 <Method void MotionEvent.offsetLocation(float, float)>
		return true;
	//   18   24:iconst_1        
	//   19   25:ireturn         
	}

	public abstract ShowableListMenu getPopup();

	protected boolean onForwardingStarted()
	{
		ShowableListMenu showablelistmenu = getPopup();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #94  <Method ShowableListMenu getPopup()>
	//    2    4:astore_1        
		if(showablelistmenu != null && !showablelistmenu.isShowing())
	//*   3    5:aload_1         
	//*   4    6:ifnull          24
	//*   5    9:aload_1         
	//*   6   10:invokeinterface #100 <Method boolean ShowableListMenu.isShowing()>
	//*   7   15:ifne            24
			showablelistmenu.show();
	//    8   18:aload_1         
	//    9   19:invokeinterface #199 <Method void ShowableListMenu.show()>
		return true;
	//   10   24:iconst_1        
	//   11   25:ireturn         
	}

	protected boolean onForwardingStopped()
	{
		ShowableListMenu showablelistmenu = getPopup();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #94  <Method ShowableListMenu getPopup()>
	//    2    4:astore_1        
		if(showablelistmenu != null && showablelistmenu.isShowing())
	//*   3    5:aload_1         
	//*   4    6:ifnull          24
	//*   5    9:aload_1         
	//*   6   10:invokeinterface #100 <Method boolean ShowableListMenu.isShowing()>
	//*   7   15:ifeq            24
			showablelistmenu.dismiss();
	//    8   18:aload_1         
	//    9   19:invokeinterface #203 <Method void ShowableListMenu.dismiss()>
		return true;
	//   10   24:iconst_1        
	//   11   25:ireturn         
	}

	void onLongPress()
	{
		clearCallbacks();
	//    0    0:aload_0         
	//    1    1:invokespecial   #166 <Method void clearCallbacks()>
		View view;
		for(view = mSrc; !view.isEnabled() || view.isLongClickable() || !onForwardingStarted();)
	//*   2    4:aload_0         
	//*   3    5:getfield        #42  <Field View mSrc>
	//*   4    8:astore_3        
	//*   5    9:aload_3         
	//*   6   10:invokevirtual   #138 <Method boolean View.isEnabled()>
	//*   7   13:ifeq            23
	//*   8   16:aload_3         
	//*   9   17:invokevirtual   #207 <Method boolean View.isLongClickable()>
	//*  10   20:ifeq            24
			return;
	//   11   23:return          

	//   12   24:aload_0         
	//   13   25:invokevirtual   #209 <Method boolean onForwardingStarted()>
	//   14   28:ifeq            23
		view.getParent().requestDisallowInterceptTouchEvent(true);
	//   15   31:aload_3         
	//   16   32:invokevirtual   #170 <Method ViewParent View.getParent()>
	//   17   35:iconst_1        
	//   18   36:invokeinterface #175 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
		long l = SystemClock.uptimeMillis();
	//   19   41:invokestatic    #215 <Method long SystemClock.uptimeMillis()>
	//   20   44:lstore_1        
		MotionEvent motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
	//   21   45:lload_1         
	//   22   46:lload_1         
	//   23   47:iconst_3        
	//   24   48:fconst_0        
	//   25   49:fconst_0        
	//   26   50:iconst_0        
	//   27   51:invokestatic    #219 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   28   54:astore          4
		view.onTouchEvent(motionevent);
	//   29   56:aload_3         
	//   30   57:aload           4
	//   31   59:invokevirtual   #222 <Method boolean View.onTouchEvent(MotionEvent)>
	//   32   62:pop             
		motionevent.recycle();
	//   33   63:aload           4
	//   34   65:invokevirtual   #131 <Method void MotionEvent.recycle()>
		mForwarding = true;
	//   35   68:aload_0         
	//   36   69:iconst_1        
	//   37   70:putfield        #224 <Field boolean mForwarding>
	//   38   73:return          
	}

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		boolean flag1;
		boolean flag2;
		flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		flag2 = mForwarding;
	//    2    3:aload_0         
	//    3    4:getfield        #224 <Field boolean mForwarding>
	//    4    7:istore          5
		if(!flag2) goto _L2; else goto _L1
	//    5    9:iload           5
	//    6   11:ifeq            57
_L1:
		boolean flag;
		if(onTouchForwarded(motionevent) || !onForwardingStopped())
	//*   7   14:aload_0         
	//*   8   15:aload_2         
	//*   9   16:invokespecial   #227 <Method boolean onTouchForwarded(MotionEvent)>
	//*  10   19:ifne            29
	//*  11   22:aload_0         
	//*  12   23:invokevirtual   #229 <Method boolean onForwardingStopped()>
	//*  13   26:ifne            52
			flag = true;
	//   14   29:iconst_1        
	//   15   30:istore_3        
		else
	//*  16   31:aload_0         
	//*  17   32:iload_3         
	//*  18   33:putfield        #224 <Field boolean mForwarding>
	//*  19   36:iload_3         
	//*  20   37:ifne            48
	//*  21   40:iload           4
	//*  22   42:istore_3        
	//*  23   43:iload           5
	//*  24   45:ifeq            50
	//*  25   48:iconst_1        
	//*  26   49:istore_3        
	//*  27   50:iload_3         
	//*  28   51:ireturn         
			flag = false;
	//   29   52:iconst_0        
	//   30   53:istore_3        
_L4:
label0:
		{
			mForwarding = flag;
			if(!flag)
			{
				flag = flag1;
				if(!flag2)
					break label0;
			}
			flag = true;
		}
		return flag;
	//*  31   54:goto            31
_L2:
		if(onTouchObserved(motionevent) && onForwardingStarted())
	//*  32   57:aload_0         
	//*  33   58:aload_2         
	//*  34   59:invokespecial   #231 <Method boolean onTouchObserved(MotionEvent)>
	//*  35   62:ifeq            111
	//*  36   65:aload_0         
	//*  37   66:invokevirtual   #209 <Method boolean onForwardingStarted()>
	//*  38   69:ifeq            111
			flag = true;
	//   39   72:iconst_1        
	//   40   73:istore_3        
		else
	//*  41   74:iload_3         
	//*  42   75:ifeq            108
	//*  43   78:invokestatic    #215 <Method long SystemClock.uptimeMillis()>
	//*  44   81:lstore          6
	//*  45   83:lload           6
	//*  46   85:lload           6
	//*  47   87:iconst_3        
	//*  48   88:fconst_0        
	//*  49   89:fconst_0        
	//*  50   90:iconst_0        
	//*  51   91:invokestatic    #219 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//*  52   94:astore_1        
	//*  53   95:aload_0         
	//*  54   96:getfield        #42  <Field View mSrc>
	//*  55   99:aload_1         
	//*  56  100:invokevirtual   #222 <Method boolean View.onTouchEvent(MotionEvent)>
	//*  57  103:pop             
	//*  58  104:aload_1         
	//*  59  105:invokevirtual   #131 <Method void MotionEvent.recycle()>
	//*  60  108:goto            31
			flag = false;
	//   61  111:iconst_0        
	//   62  112:istore_3        
		if(flag)
		{
			long l = SystemClock.uptimeMillis();
			view = ((View) (MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0)));
			mSrc.onTouchEvent(((MotionEvent) (view)));
			((MotionEvent) (view)).recycle();
		}
		if(true) goto _L4; else goto _L3
_L3:
	//*  63  113:goto            74
	}

	public void onViewAttachedToWindow(View view)
	{
	//    0    0:return          
	}

	public void onViewDetachedFromWindow(View view)
	{
		mForwarding = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #224 <Field boolean mForwarding>
		mActivePointerId = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #124 <Field int mActivePointerId>
		if(mDisallowIntercept != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #88  <Field Runnable mDisallowIntercept>
	//*   8   14:ifnull          29
			mSrc.removeCallbacks(mDisallowIntercept);
	//    9   17:aload_0         
	//   10   18:getfield        #42  <Field View mSrc>
	//   11   21:aload_0         
	//   12   22:getfield        #88  <Field Runnable mDisallowIntercept>
	//   13   25:invokevirtual   #86  <Method boolean View.removeCallbacks(Runnable)>
	//   14   28:pop             
	//   15   29:return          
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
}
