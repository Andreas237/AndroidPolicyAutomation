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

	public ForwardingListener(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:newarray        int[]
	//    5    8:putfield        #30  <Field int[] mTmpLocation>
		mSrc = view;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #32  <Field View mSrc>
		view.setLongClickable(true);
	//    9   16:aload_1         
	//   10   17:iconst_1        
	//   11   18:invokevirtual   #38  <Method void View.setLongClickable(boolean)>
		view.addOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (this)));
	//   12   21:aload_1         
	//   13   22:aload_0         
	//   14   23:invokevirtual   #42  <Method void View.addOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
		mScaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
	//   15   26:aload_0         
	//   16   27:aload_1         
	//   17   28:invokevirtual   #46  <Method android.content.Context View.getContext()>
	//   18   31:invokestatic    #52  <Method ViewConfiguration ViewConfiguration.get(android.content.Context)>
	//   19   34:invokevirtual   #56  <Method int ViewConfiguration.getScaledTouchSlop()>
	//   20   37:i2f             
	//   21   38:putfield        #58  <Field float mScaledTouchSlop>
	//   22   41:aload_0         
	//   23   42:invokestatic    #61  <Method int ViewConfiguration.getTapTimeout()>
	//   24   45:putfield        #63  <Field int mTapTimeout>
		mLongPressTimeout = (mTapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
	//   25   48:aload_0         
	//   26   49:aload_0         
	//   27   50:getfield        #63  <Field int mTapTimeout>
	//   28   53:invokestatic    #66  <Method int ViewConfiguration.getLongPressTimeout()>
	//   29   56:iadd            
	//   30   57:iconst_2        
	//   31   58:idiv            
	//   32   59:putfield        #68  <Field int mLongPressTimeout>
	//   33   62:return          
	}

	private void clearCallbacks()
	{
		Runnable runnable = mTriggerLongPress;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Runnable mTriggerLongPress>
	//    2    4:astore_1        
		if(runnable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
			mSrc.removeCallbacks(runnable);
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field View mSrc>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #76  <Method boolean View.removeCallbacks(Runnable)>
	//    9   17:pop             
		runnable = mDisallowIntercept;
	//   10   18:aload_0         
	//   11   19:getfield        #78  <Field Runnable mDisallowIntercept>
	//   12   22:astore_1        
		if(runnable != null)
	//*  13   23:aload_1         
	//*  14   24:ifnull          36
			mSrc.removeCallbacks(runnable);
	//   15   27:aload_0         
	//   16   28:getfield        #32  <Field View mSrc>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #76  <Method boolean View.removeCallbacks(Runnable)>
	//   19   35:pop             
	//   20   36:return          
	}

	private boolean onTouchForwarded(MotionEvent motionevent)
	{
		View view = mSrc;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field View mSrc>
	//    2    4:astore          4
		Object obj = ((Object) (getPopup()));
	//    3    6:aload_0         
	//    4    7:invokevirtual   #84  <Method ShowableListMenu getPopup()>
	//    5   10:astore          5
		if(obj != null)
	//*   6   12:aload           5
	//*   7   14:ifnull          133
		{
			if(!((ShowableListMenu) (obj)).isShowing())
	//*   8   17:aload           5
	//*   9   19:invokeinterface #90  <Method boolean ShowableListMenu.isShowing()>
	//*  10   24:ifne            29
				return false;
	//   11   27:iconst_0        
	//   12   28:ireturn         
			obj = ((Object) ((DropDownListView)((ShowableListMenu) (obj)).getListView()));
	//   13   29:aload           5
	//   14   31:invokeinterface #94  <Method android.widget.ListView ShowableListMenu.getListView()>
	//   15   36:checkcast       #96  <Class DropDownListView>
	//   16   39:astore          5
			if(obj != null)
	//*  17   41:aload           5
	//*  18   43:ifnull          131
			{
				if(!((DropDownListView) (obj)).isShown())
	//*  19   46:aload           5
	//*  20   48:invokevirtual   #99  <Method boolean DropDownListView.isShown()>
	//*  21   51:ifne            56
					return false;
	//   22   54:iconst_0        
	//   23   55:ireturn         
				MotionEvent motionevent1 = MotionEvent.obtainNoHistory(motionevent);
	//   24   56:aload_1         
	//   25   57:invokestatic    #105 <Method MotionEvent MotionEvent.obtainNoHistory(MotionEvent)>
	//   26   60:astore          6
				toGlobalMotionEvent(view, motionevent1);
	//   27   62:aload_0         
	//   28   63:aload           4
	//   29   65:aload           6
	//   30   67:invokespecial   #109 <Method boolean toGlobalMotionEvent(View, MotionEvent)>
	//   31   70:pop             
				toLocalMotionEvent(((View) (obj)), motionevent1);
	//   32   71:aload_0         
	//   33   72:aload           5
	//   34   74:aload           6
	//   35   76:invokespecial   #112 <Method boolean toLocalMotionEvent(View, MotionEvent)>
	//   36   79:pop             
				boolean flag = ((DropDownListView) (obj)).onForwardedEvent(motionevent1, mActivePointerId);
	//   37   80:aload           5
	//   38   82:aload           6
	//   39   84:aload_0         
	//   40   85:getfield        #114 <Field int mActivePointerId>
	//   41   88:invokevirtual   #118 <Method boolean DropDownListView.onForwardedEvent(MotionEvent, int)>
	//   42   91:istore_3        
				motionevent1.recycle();
	//   43   92:aload           6
	//   44   94:invokevirtual   #121 <Method void MotionEvent.recycle()>
				int i = motionevent.getActionMasked();
	//   45   97:aload_1         
	//   46   98:invokevirtual   #124 <Method int MotionEvent.getActionMasked()>
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
			} else
			{
				return false;
	//   67  131:iconst_0        
	//   68  132:ireturn         
			}
		} else
		{
			return false;
	//   69  133:iconst_0        
	//   70  134:ireturn         
		}
	}

	private boolean onTouchObserved(MotionEvent motionevent)
	{
		View view = mSrc;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field View mSrc>
	//    2    4:astore_3        
		if(!view.isEnabled())
	//*   3    5:aload_3         
	//*   4    6:invokevirtual   #128 <Method boolean View.isEnabled()>
	//*   5    9:ifne            14
			return false;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		switch(motionevent.getActionMasked())
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #124 <Method int MotionEvent.getActionMasked()>
		{
	//*  10   18:tableswitch     0 3: default 48
	//	               0 106
	//	               1 100
	//	               2 50
	//	               3 100
		default:
			return false;
	//   11   48:iconst_0        
	//   12   49:ireturn         

		case 2: // '\002'
			int i = motionevent.findPointerIndex(mActivePointerId);
	//   13   50:aload_1         
	//   14   51:aload_0         
	//   15   52:getfield        #114 <Field int mActivePointerId>
	//   16   55:invokevirtual   #132 <Method int MotionEvent.findPointerIndex(int)>
	//   17   58:istore_2        
			if(i >= 0 && !pointInView(view, motionevent.getX(i), motionevent.getY(i), mScaledTouchSlop))
	//*  18   59:iload_2         
	//*  19   60:iflt            181
	//*  20   63:aload_3         
	//*  21   64:aload_1         
	//*  22   65:iload_2         
	//*  23   66:invokevirtual   #136 <Method float MotionEvent.getX(int)>
	//*  24   69:aload_1         
	//*  25   70:iload_2         
	//*  26   71:invokevirtual   #139 <Method float MotionEvent.getY(int)>
	//*  27   74:aload_0         
	//*  28   75:getfield        #58  <Field float mScaledTouchSlop>
	//*  29   78:invokestatic    #143 <Method boolean pointInView(View, float, float, float)>
	//*  30   81:ifne            181
			{
				clearCallbacks();
	//   31   84:aload_0         
	//   32   85:invokespecial   #145 <Method void clearCallbacks()>
				view.getParent().requestDisallowInterceptTouchEvent(true);
	//   33   88:aload_3         
	//   34   89:invokevirtual   #149 <Method ViewParent View.getParent()>
	//   35   92:iconst_1        
	//   36   93:invokeinterface #154 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
				return true;
	//   37   98:iconst_1        
	//   38   99:ireturn         
			}
			break;

		case 1: // '\001'
		case 3: // '\003'
			clearCallbacks();
	//   39  100:aload_0         
	//   40  101:invokespecial   #145 <Method void clearCallbacks()>
			return false;
	//   41  104:iconst_0        
	//   42  105:ireturn         

		case 0: // '\0'
			mActivePointerId = motionevent.getPointerId(0);
	//   43  106:aload_0         
	//   44  107:aload_1         
	//   45  108:iconst_0        
	//   46  109:invokevirtual   #157 <Method int MotionEvent.getPointerId(int)>
	//   47  112:putfield        #114 <Field int mActivePointerId>
			if(mDisallowIntercept == null)
	//*  48  115:aload_0         
	//*  49  116:getfield        #78  <Field Runnable mDisallowIntercept>
	//*  50  119:ifnonnull       134
				mDisallowIntercept = ((Runnable) (new DisallowIntercept()));
	//   51  122:aload_0         
	//   52  123:new             #159 <Class ForwardingListener$DisallowIntercept>
	//   53  126:dup             
	//   54  127:aload_0         
	//   55  128:invokespecial   #162 <Method void ForwardingListener$DisallowIntercept(ForwardingListener)>
	//   56  131:putfield        #78  <Field Runnable mDisallowIntercept>
			view.postDelayed(mDisallowIntercept, mTapTimeout);
	//   57  134:aload_3         
	//   58  135:aload_0         
	//   59  136:getfield        #78  <Field Runnable mDisallowIntercept>
	//   60  139:aload_0         
	//   61  140:getfield        #63  <Field int mTapTimeout>
	//   62  143:i2l             
	//   63  144:invokevirtual   #166 <Method boolean View.postDelayed(Runnable, long)>
	//   64  147:pop             
			if(mTriggerLongPress == null)
	//*  65  148:aload_0         
	//*  66  149:getfield        #72  <Field Runnable mTriggerLongPress>
	//*  67  152:ifnonnull       167
				mTriggerLongPress = ((Runnable) (new TriggerLongPress()));
	//   68  155:aload_0         
	//   69  156:new             #168 <Class ForwardingListener$TriggerLongPress>
	//   70  159:dup             
	//   71  160:aload_0         
	//   72  161:invokespecial   #169 <Method void ForwardingListener$TriggerLongPress(ForwardingListener)>
	//   73  164:putfield        #72  <Field Runnable mTriggerLongPress>
			view.postDelayed(mTriggerLongPress, mLongPressTimeout);
	//   74  167:aload_3         
	//   75  168:aload_0         
	//   76  169:getfield        #72  <Field Runnable mTriggerLongPress>
	//   77  172:aload_0         
	//   78  173:getfield        #68  <Field int mLongPressTimeout>
	//   79  176:i2l             
	//   80  177:invokevirtual   #166 <Method boolean View.postDelayed(Runnable, long)>
	//   81  180:pop             
			break;
		}
		return false;
	//   82  181:iconst_0        
	//   83  182:ireturn         
	}

	private static boolean pointInView(View view, float f, float f1, float f2)
	{
		float f3 = -f2;
	//    0    0:fload_3         
	//    1    1:fneg            
	//    2    2:fstore          4
		return f >= f3 && f1 >= f3 && f < (float)(view.getRight() - view.getLeft()) + f2 && f1 < (float)(view.getBottom() - view.getTop()) + f2;
	//    3    4:fload_1         
	//    4    5:fload           4
	//    5    7:fcmpl           
	//    6    8:iflt            54
	//    7   11:fload_2         
	//    8   12:fload           4
	//    9   14:fcmpl           
	//   10   15:iflt            54
	//   11   18:fload_1         
	//   12   19:aload_0         
	//   13   20:invokevirtual   #172 <Method int View.getRight()>
	//   14   23:aload_0         
	//   15   24:invokevirtual   #175 <Method int View.getLeft()>
	//   16   27:isub            
	//   17   28:i2f             
	//   18   29:fload_3         
	//   19   30:fadd            
	//   20   31:fcmpg           
	//   21   32:ifge            54
	//   22   35:fload_2         
	//   23   36:aload_0         
	//   24   37:invokevirtual   #178 <Method int View.getBottom()>
	//   25   40:aload_0         
	//   26   41:invokevirtual   #181 <Method int View.getTop()>
	//   27   44:isub            
	//   28   45:i2f             
	//   29   46:fload_3         
	//   30   47:fadd            
	//   31   48:fcmpg           
	//   32   49:ifge            54
	//   33   52:iconst_1        
	//   34   53:ireturn         
	//   35   54:iconst_0        
	//   36   55:ireturn         
	}

	private boolean toGlobalMotionEvent(View view, MotionEvent motionevent)
	{
		int ai[] = mTmpLocation;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int[] mTmpLocation>
	//    2    4:astore_3        
		view.getLocationOnScreen(ai);
	//    3    5:aload_1         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #185 <Method void View.getLocationOnScreen(int[])>
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
	//   15   19:invokevirtual   #189 <Method void MotionEvent.offsetLocation(float, float)>
		return true;
	//   16   22:iconst_1        
	//   17   23:ireturn         
	}

	private boolean toLocalMotionEvent(View view, MotionEvent motionevent)
	{
		int ai[] = mTmpLocation;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int[] mTmpLocation>
	//    2    4:astore_3        
		view.getLocationOnScreen(ai);
	//    3    5:aload_1         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #185 <Method void View.getLocationOnScreen(int[])>
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
	//   17   21:invokevirtual   #189 <Method void MotionEvent.offsetLocation(float, float)>
		return true;
	//   18   24:iconst_1        
	//   19   25:ireturn         
	}

	public abstract ShowableListMenu getPopup();

	protected boolean onForwardingStarted()
	{
		ShowableListMenu showablelistmenu = getPopup();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #84  <Method ShowableListMenu getPopup()>
	//    2    4:astore_1        
		if(showablelistmenu != null && !showablelistmenu.isShowing())
	//*   3    5:aload_1         
	//*   4    6:ifnull          24
	//*   5    9:aload_1         
	//*   6   10:invokeinterface #90  <Method boolean ShowableListMenu.isShowing()>
	//*   7   15:ifne            24
			showablelistmenu.show();
	//    8   18:aload_1         
	//    9   19:invokeinterface #193 <Method void ShowableListMenu.show()>
		return true;
	//   10   24:iconst_1        
	//   11   25:ireturn         
	}

	protected boolean onForwardingStopped()
	{
		ShowableListMenu showablelistmenu = getPopup();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #84  <Method ShowableListMenu getPopup()>
	//    2    4:astore_1        
		if(showablelistmenu != null && showablelistmenu.isShowing())
	//*   3    5:aload_1         
	//*   4    6:ifnull          24
	//*   5    9:aload_1         
	//*   6   10:invokeinterface #90  <Method boolean ShowableListMenu.isShowing()>
	//*   7   15:ifeq            24
			showablelistmenu.dismiss();
	//    8   18:aload_1         
	//    9   19:invokeinterface #197 <Method void ShowableListMenu.dismiss()>
		return true;
	//   10   24:iconst_1        
	//   11   25:ireturn         
	}

	void onLongPress()
	{
		clearCallbacks();
	//    0    0:aload_0         
	//    1    1:invokespecial   #145 <Method void clearCallbacks()>
		View view = mSrc;
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field View mSrc>
	//    4    8:astore_3        
		if(view.isEnabled())
	//*   5    9:aload_3         
	//*   6   10:invokevirtual   #128 <Method boolean View.isEnabled()>
	//*   7   13:ifeq            75
		{
			if(view.isLongClickable())
	//*   8   16:aload_3         
	//*   9   17:invokevirtual   #201 <Method boolean View.isLongClickable()>
	//*  10   20:ifeq            24
				return;
	//   11   23:return          
			if(!onForwardingStarted())
	//*  12   24:aload_0         
	//*  13   25:invokevirtual   #203 <Method boolean onForwardingStarted()>
	//*  14   28:ifne            32
			{
				return;
	//   15   31:return          
			} else
			{
				view.getParent().requestDisallowInterceptTouchEvent(true);
	//   16   32:aload_3         
	//   17   33:invokevirtual   #149 <Method ViewParent View.getParent()>
	//   18   36:iconst_1        
	//   19   37:invokeinterface #154 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
				long l = SystemClock.uptimeMillis();
	//   20   42:invokestatic    #209 <Method long SystemClock.uptimeMillis()>
	//   21   45:lstore_1        
				MotionEvent motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
	//   22   46:lload_1         
	//   23   47:lload_1         
	//   24   48:iconst_3        
	//   25   49:fconst_0        
	//   26   50:fconst_0        
	//   27   51:iconst_0        
	//   28   52:invokestatic    #213 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   29   55:astore          4
				view.onTouchEvent(motionevent);
	//   30   57:aload_3         
	//   31   58:aload           4
	//   32   60:invokevirtual   #216 <Method boolean View.onTouchEvent(MotionEvent)>
	//   33   63:pop             
				motionevent.recycle();
	//   34   64:aload           4
	//   35   66:invokevirtual   #121 <Method void MotionEvent.recycle()>
				mForwarding = true;
	//   36   69:aload_0         
	//   37   70:iconst_1        
	//   38   71:putfield        #218 <Field boolean mForwarding>
				return;
	//   39   74:return          
			}
		} else
		{
			return;
	//   40   75:return          
		}
	}

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		boolean flag4 = mForwarding;
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field boolean mForwarding>
	//    2    4:istore          6
		boolean flag3 = true;
	//    3    6:iconst_1        
	//    4    7:istore          5
		boolean flag;
		if(flag4)
	//*   5    9:iload           6
	//*   6   11:ifeq            42
		{
			if(!onTouchForwarded(motionevent) && onForwardingStopped())
	//*   7   14:aload_0         
	//*   8   15:aload_2         
	//*   9   16:invokespecial   #221 <Method boolean onTouchForwarded(MotionEvent)>
	//*  10   19:ifne            37
	//*  11   22:aload_0         
	//*  12   23:invokevirtual   #223 <Method boolean onForwardingStopped()>
	//*  13   26:ifne            32
	//*  14   29:goto            37
				flag = false;
	//   15   32:iconst_0        
	//   16   33:istore_3        
			else
	//*  17   34:goto            107
				flag = true;
	//   18   37:iconst_1        
	//   19   38:istore_3        
		} else
	//*  20   39:goto            107
		{
			boolean flag1;
			if(onTouchObserved(motionevent) && onForwardingStarted())
	//*  21   42:aload_0         
	//*  22   43:aload_2         
	//*  23   44:invokespecial   #225 <Method boolean onTouchObserved(MotionEvent)>
	//*  24   47:ifeq            63
	//*  25   50:aload_0         
	//*  26   51:invokevirtual   #203 <Method boolean onForwardingStarted()>
	//*  27   54:ifeq            63
				flag1 = true;
	//   28   57:iconst_1        
	//   29   58:istore          4
			else
	//*  30   60:goto            66
				flag1 = false;
	//   31   63:iconst_0        
	//   32   64:istore          4
			flag = flag1;
	//   33   66:iload           4
	//   34   68:istore_3        
			if(flag1)
	//*  35   69:iload           4
	//*  36   71:ifeq            107
			{
				long l = SystemClock.uptimeMillis();
	//   37   74:invokestatic    #209 <Method long SystemClock.uptimeMillis()>
	//   38   77:lstore          7
				view = ((View) (MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0)));
	//   39   79:lload           7
	//   40   81:lload           7
	//   41   83:iconst_3        
	//   42   84:fconst_0        
	//   43   85:fconst_0        
	//   44   86:iconst_0        
	//   45   87:invokestatic    #213 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   46   90:astore_1        
				mSrc.onTouchEvent(((MotionEvent) (view)));
	//   47   91:aload_0         
	//   48   92:getfield        #32  <Field View mSrc>
	//   49   95:aload_1         
	//   50   96:invokevirtual   #216 <Method boolean View.onTouchEvent(MotionEvent)>
	//   51   99:pop             
				((MotionEvent) (view)).recycle();
	//   52  100:aload_1         
	//   53  101:invokevirtual   #121 <Method void MotionEvent.recycle()>
				flag = flag1;
	//   54  104:iload           4
	//   55  106:istore_3        
			}
		}
		mForwarding = flag;
	//   56  107:aload_0         
	//   57  108:iload_3         
	//   58  109:putfield        #218 <Field boolean mForwarding>
		boolean flag2 = flag3;
	//   59  112:iload           5
	//   60  114:istore          4
		if(!flag)
	//*  61  116:iload_3         
	//*  62  117:ifne            130
		{
			if(flag4)
	//*  63  120:iload           6
	//*  64  122:ifeq            127
				return true;
	//   65  125:iconst_1        
	//   66  126:ireturn         
			flag2 = false;
	//   67  127:iconst_0        
	//   68  128:istore          4
		}
		return flag2;
	//   69  130:iload           4
	//   70  132:ireturn         
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
	//    2    2:putfield        #218 <Field boolean mForwarding>
		mActivePointerId = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #114 <Field int mActivePointerId>
		view = ((View) (mDisallowIntercept));
	//    6   10:aload_0         
	//    7   11:getfield        #78  <Field Runnable mDisallowIntercept>
	//    8   14:astore_1        
		if(view != null)
	//*   9   15:aload_1         
	//*  10   16:ifnull          28
			mSrc.removeCallbacks(((Runnable) (view)));
	//   11   19:aload_0         
	//   12   20:getfield        #32  <Field View mSrc>
	//   13   23:aload_1         
	//   14   24:invokevirtual   #76  <Method boolean View.removeCallbacks(Runnable)>
	//   15   27:pop             
	//   16   28:return          
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

	private class DisallowIntercept
		implements Runnable
	{

		public void run()
		{
			ViewParent viewparent = mSrc.getParent();
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field ForwardingListener this$0>
		//    2    4:getfield        #23  <Field View ForwardingListener.mSrc>
		//    3    7:invokevirtual   #29  <Method ViewParent View.getParent()>
		//    4   10:astore_1        
			if(viewparent != null)
		//*   5   11:aload_1         
		//*   6   12:ifnull          22
				viewparent.requestDisallowInterceptTouchEvent(true);
		//    7   15:aload_1         
		//    8   16:iconst_1        
		//    9   17:invokeinterface #35  <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
		//   10   22:return          
		}

		final ForwardingListener this$0;

		DisallowIntercept()
		{
			this$0 = ForwardingListener.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field ForwardingListener this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
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
		//    1    1:getfield        #12  <Field ForwardingListener this$0>
		//    2    4:invokevirtual   #22  <Method void ForwardingListener.onLongPress()>
		//    3    7:return          
		}

		final ForwardingListener this$0;

		TriggerLongPress()
		{
			this$0 = ForwardingListener.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field ForwardingListener this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}

}
