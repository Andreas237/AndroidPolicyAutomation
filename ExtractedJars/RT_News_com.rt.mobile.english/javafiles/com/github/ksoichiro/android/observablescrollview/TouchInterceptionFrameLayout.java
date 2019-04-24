// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.ksoichiro.android.observablescrollview;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class TouchInterceptionFrameLayout extends FrameLayout
{
	public static interface TouchInterceptionListener
	{

		public abstract void onDownMotionEvent(MotionEvent motionevent);

		public abstract void onMoveMotionEvent(MotionEvent motionevent, float f, float f1);

		public abstract void onUpOrCancelMotionEvent(MotionEvent motionevent);

		public abstract boolean shouldInterceptTouchEvent(MotionEvent motionevent, boolean flag, float f, float f1);
	}


	public TouchInterceptionFrameLayout(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void FrameLayout(Context)>
	//    3    5:return          
	}

	public TouchInterceptionFrameLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #26  <Method void FrameLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public TouchInterceptionFrameLayout(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #29  <Method void FrameLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public TouchInterceptionFrameLayout(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #35  <Method void FrameLayout(Context, AttributeSet, int, int)>
	//    6    9:return          
	}

	private transient void duplicateTouchEventForChildren(MotionEvent motionevent, MotionEvent amotionevent[])
	{
		if(motionevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		for(int i = getChildCount() - 1; i >= 0; i--)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #42  <Method int getChildCount()>
	//*   5    9:iconst_1        
	//*   6   10:isub            
	//*   7   11:istore          6
	//*   8   13:iload           6
	//*   9   15:iflt            203
		{
			View view = getChildAt(i);
	//   10   18:aload_0         
	//   11   19:iload           6
	//   12   21:invokevirtual   #46  <Method View getChildAt(int)>
	//   13   24:astore          10
			if(view == null)
				continue;
	//   14   26:aload           10
	//   15   28:ifnull          194
			Rect rect = new Rect();
	//   16   31:new             #48  <Class Rect>
	//   17   34:dup             
	//   18   35:invokespecial   #51  <Method void Rect()>
	//   19   38:astore          12
			view.getHitRect(rect);
	//   20   40:aload           10
	//   21   42:aload           12
	//   22   44:invokevirtual   #57  <Method void View.getHitRect(Rect)>
			MotionEvent motionevent1 = MotionEvent.obtainNoHistory(motionevent);
	//   23   47:aload_1         
	//   24   48:invokestatic    #63  <Method MotionEvent MotionEvent.obtainNoHistory(MotionEvent)>
	//   25   51:astore          11
			if(!rect.contains((int)motionevent1.getX(), (int)motionevent1.getY()))
	//*  26   53:aload           12
	//*  27   55:aload           11
	//*  28   57:invokevirtual   #67  <Method float MotionEvent.getX()>
	//*  29   60:f2i             
	//*  30   61:aload           11
	//*  31   63:invokevirtual   #70  <Method float MotionEvent.getY()>
	//*  32   66:f2i             
	//*  33   67:invokevirtual   #74  <Method boolean Rect.contains(int, int)>
	//*  34   70:ifne            76
				continue;
	//   35   73:goto            194
			float f = -view.getLeft();
	//   36   76:aload           10
	//   37   78:invokevirtual   #77  <Method int View.getLeft()>
	//   38   81:ineg            
	//   39   82:i2f             
	//   40   83:fstore_3        
			float f1 = -view.getTop();
	//   41   84:aload           10
	//   42   86:invokevirtual   #80  <Method int View.getTop()>
	//   43   89:ineg            
	//   44   90:i2f             
	//   45   91:fstore          4
			boolean flag = false;
	//   46   93:iconst_0        
	//   47   94:istore          5
			int j = 0;
	//   48   96:iconst_0        
	//   49   97:istore          7
			if(amotionevent != null)
	//*  50   99:aload_2         
	//*  51  100:ifnull          172
			{
				int k = amotionevent.length;
	//   52  103:aload_2         
	//   53  104:arraylength     
	//   54  105:istore          9
				boolean flag1;
				for(flag = false; j < k; flag = flag1)
	//*  55  107:iconst_0        
	//*  56  108:istore          5
	//*  57  110:iload           7
	//*  58  112:iload           9
	//*  59  114:icmpge          172
				{
					MotionEvent motionevent2 = amotionevent[j];
	//   60  117:aload_2         
	//   61  118:iload           7
	//   62  120:aaload          
	//   63  121:astore          12
					flag1 = flag;
	//   64  123:iload           5
	//   65  125:istore          8
					if(motionevent2 != null)
	//*  66  127:aload           12
	//*  67  129:ifnull          159
					{
						motionevent2 = MotionEvent.obtainNoHistory(motionevent2);
	//   68  132:aload           12
	//   69  134:invokestatic    #63  <Method MotionEvent MotionEvent.obtainNoHistory(MotionEvent)>
	//   70  137:astore          12
						motionevent2.offsetLocation(f, f1);
	//   71  139:aload           12
	//   72  141:fload_3         
	//   73  142:fload           4
	//   74  144:invokevirtual   #84  <Method void MotionEvent.offsetLocation(float, float)>
						flag1 = flag | view.dispatchTouchEvent(motionevent2);
	//   75  147:iload           5
	//   76  149:aload           10
	//   77  151:aload           12
	//   78  153:invokevirtual   #88  <Method boolean View.dispatchTouchEvent(MotionEvent)>
	//   79  156:ior             
	//   80  157:istore          8
					}
					j++;
	//   81  159:iload           7
	//   82  161:iconst_1        
	//   83  162:iadd            
	//   84  163:istore          7
				}

	//   85  165:iload           8
	//   86  167:istore          5
			}
	//*  87  169:goto            110
			motionevent1.offsetLocation(f, f1);
	//   88  172:aload           11
	//   89  174:fload_3         
	//   90  175:fload           4
	//   91  177:invokevirtual   #84  <Method void MotionEvent.offsetLocation(float, float)>
			if(view.dispatchTouchEvent(motionevent1) | flag)
	//*  92  180:aload           10
	//*  93  182:aload           11
	//*  94  184:invokevirtual   #88  <Method boolean View.dispatchTouchEvent(MotionEvent)>
	//*  95  187:iload           5
	//*  96  189:ior             
	//*  97  190:ifeq            194
				return;
	//   98  193:return          
		}

	//   99  194:iload           6
	//  100  196:iconst_1        
	//  101  197:isub            
	//  102  198:istore          6
	//* 103  200:goto            13
	//  104  203:return          
	}

	private MotionEvent obtainMotionEvent(MotionEvent motionevent, int i)
	{
		motionevent = MotionEvent.obtainNoHistory(motionevent);
	//    0    0:aload_1         
	//    1    1:invokestatic    #63  <Method MotionEvent MotionEvent.obtainNoHistory(MotionEvent)>
	//    2    4:astore_1        
		motionevent.setAction(i);
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #94  <Method void MotionEvent.setAction(int)>
		return motionevent;
	//    6   10:aload_1         
	//    7   11:areturn         
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		if(mTouchInterceptionListener == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field TouchInterceptionFrameLayout$TouchInterceptionListener mTouchInterceptionListener>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		int i = motionevent.getActionMasked();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #100 <Method int MotionEvent.getActionMasked()>
	//    7   13:istore          6
		if(i != 0)
	//*   8   15:iload           6
	//*   9   17:ifeq            110
		{
			if(i != 2)
	//*  10   20:iload           6
	//*  11   22:iconst_2        
	//*  12   23:icmpeq          28
				return false;
	//   13   26:iconst_0        
	//   14   27:ireturn         
			if(mInitialPoint == null)
	//*  15   28:aload_0         
	//*  16   29:getfield        #102 <Field PointF mInitialPoint>
	//*  17   32:ifnonnull       54
				mInitialPoint = new PointF(motionevent.getX(), motionevent.getY());
	//   18   35:aload_0         
	//   19   36:new             #104 <Class PointF>
	//   20   39:dup             
	//   21   40:aload_1         
	//   22   41:invokevirtual   #67  <Method float MotionEvent.getX()>
	//   23   44:aload_1         
	//   24   45:invokevirtual   #70  <Method float MotionEvent.getY()>
	//   25   48:invokespecial   #106 <Method void PointF(float, float)>
	//   26   51:putfield        #102 <Field PointF mInitialPoint>
			float f = motionevent.getX();
	//   27   54:aload_1         
	//   28   55:invokevirtual   #67  <Method float MotionEvent.getX()>
	//   29   58:fstore_2        
			float f1 = mInitialPoint.x;
	//   30   59:aload_0         
	//   31   60:getfield        #102 <Field PointF mInitialPoint>
	//   32   63:getfield        #110 <Field float PointF.x>
	//   33   66:fstore_3        
			float f2 = motionevent.getY();
	//   34   67:aload_1         
	//   35   68:invokevirtual   #70  <Method float MotionEvent.getY()>
	//   36   71:fstore          4
			float f3 = mInitialPoint.y;
	//   37   73:aload_0         
	//   38   74:getfield        #102 <Field PointF mInitialPoint>
	//   39   77:getfield        #113 <Field float PointF.y>
	//   40   80:fstore          5
			mIntercepting = mTouchInterceptionListener.shouldInterceptTouchEvent(motionevent, true, f - f1, f2 - f3);
	//   41   82:aload_0         
	//   42   83:aload_0         
	//   43   84:getfield        #97  <Field TouchInterceptionFrameLayout$TouchInterceptionListener mTouchInterceptionListener>
	//   44   87:aload_1         
	//   45   88:iconst_1        
	//   46   89:fload_2         
	//   47   90:fload_3         
	//   48   91:fsub            
	//   49   92:fload           4
	//   50   94:fload           5
	//   51   96:fsub            
	//   52   97:invokeinterface #117 <Method boolean TouchInterceptionFrameLayout$TouchInterceptionListener.shouldInterceptTouchEvent(MotionEvent, boolean, float, float)>
	//   53  102:putfield        #119 <Field boolean mIntercepting>
			return mIntercepting;
	//   54  105:aload_0         
	//   55  106:getfield        #119 <Field boolean mIntercepting>
	//   56  109:ireturn         
		} else
		{
			mInitialPoint = new PointF(motionevent.getX(), motionevent.getY());
	//   57  110:aload_0         
	//   58  111:new             #104 <Class PointF>
	//   59  114:dup             
	//   60  115:aload_1         
	//   61  116:invokevirtual   #67  <Method float MotionEvent.getX()>
	//   62  119:aload_1         
	//   63  120:invokevirtual   #70  <Method float MotionEvent.getY()>
	//   64  123:invokespecial   #106 <Method void PointF(float, float)>
	//   65  126:putfield        #102 <Field PointF mInitialPoint>
			mPendingDownMotionEvent = MotionEvent.obtainNoHistory(motionevent);
	//   66  129:aload_0         
	//   67  130:aload_1         
	//   68  131:invokestatic    #63  <Method MotionEvent MotionEvent.obtainNoHistory(MotionEvent)>
	//   69  134:putfield        #121 <Field MotionEvent mPendingDownMotionEvent>
			mDownMotionEventPended = true;
	//   70  137:aload_0         
	//   71  138:iconst_1        
	//   72  139:putfield        #123 <Field boolean mDownMotionEventPended>
			mIntercepting = mTouchInterceptionListener.shouldInterceptTouchEvent(motionevent, false, 0.0F, 0.0F);
	//   73  142:aload_0         
	//   74  143:aload_0         
	//   75  144:getfield        #97  <Field TouchInterceptionFrameLayout$TouchInterceptionListener mTouchInterceptionListener>
	//   76  147:aload_1         
	//   77  148:iconst_0        
	//   78  149:fconst_0        
	//   79  150:fconst_0        
	//   80  151:invokeinterface #117 <Method boolean TouchInterceptionFrameLayout$TouchInterceptionListener.shouldInterceptTouchEvent(MotionEvent, boolean, float, float)>
	//   81  156:putfield        #119 <Field boolean mIntercepting>
			mBeganFromDownMotionEvent = mIntercepting;
	//   82  159:aload_0         
	//   83  160:aload_0         
	//   84  161:getfield        #119 <Field boolean mIntercepting>
	//   85  164:putfield        #125 <Field boolean mBeganFromDownMotionEvent>
			mChildrenEventsCanceled = false;
	//   86  167:aload_0         
	//   87  168:iconst_0        
	//   88  169:putfield        #127 <Field boolean mChildrenEventsCanceled>
			return mIntercepting;
	//   89  172:aload_0         
	//   90  173:getfield        #119 <Field boolean mIntercepting>
	//   91  176:ireturn         
		}
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(mTouchInterceptionListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field TouchInterceptionFrameLayout$TouchInterceptionListener mTouchInterceptionListener>
	//*   2    4:ifnull          428
			switch(motionevent.getActionMasked())
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #100 <Method int MotionEvent.getActionMasked()>
			{
			default:
				break;

	//*   5   11:tableswitch     0 3: default 40
	//	               0 400
	//	               1 305
	//	               2 43
	//	               3 305
	//*   6   40:goto            428
			case 2: // '\002'
				if(mInitialPoint == null)
	//*   7   43:aload_0         
	//*   8   44:getfield        #102 <Field PointF mInitialPoint>
	//*   9   47:ifnonnull       69
					mInitialPoint = new PointF(motionevent.getX(), motionevent.getY());
	//   10   50:aload_0         
	//   11   51:new             #104 <Class PointF>
	//   12   54:dup             
	//   13   55:aload_1         
	//   14   56:invokevirtual   #67  <Method float MotionEvent.getX()>
	//   15   59:aload_1         
	//   16   60:invokevirtual   #70  <Method float MotionEvent.getY()>
	//   17   63:invokespecial   #106 <Method void PointF(float, float)>
	//   18   66:putfield        #102 <Field PointF mInitialPoint>
				float f = motionevent.getX() - mInitialPoint.x;
	//   19   69:aload_1         
	//   20   70:invokevirtual   #67  <Method float MotionEvent.getX()>
	//   21   73:aload_0         
	//   22   74:getfield        #102 <Field PointF mInitialPoint>
	//   23   77:getfield        #110 <Field float PointF.x>
	//   24   80:fsub            
	//   25   81:fstore_2        
				float f1 = motionevent.getY() - mInitialPoint.y;
	//   26   82:aload_1         
	//   27   83:invokevirtual   #70  <Method float MotionEvent.getY()>
	//   28   86:aload_0         
	//   29   87:getfield        #102 <Field PointF mInitialPoint>
	//   30   90:getfield        #113 <Field float PointF.y>
	//   31   93:fsub            
	//   32   94:fstore_3        
				mIntercepting = mTouchInterceptionListener.shouldInterceptTouchEvent(motionevent, true, f, f1);
	//   33   95:aload_0         
	//   34   96:aload_0         
	//   35   97:getfield        #97  <Field TouchInterceptionFrameLayout$TouchInterceptionListener mTouchInterceptionListener>
	//   36  100:aload_1         
	//   37  101:iconst_1        
	//   38  102:fload_2         
	//   39  103:fload_3         
	//   40  104:invokeinterface #117 <Method boolean TouchInterceptionFrameLayout$TouchInterceptionListener.shouldInterceptTouchEvent(MotionEvent, boolean, float, float)>
	//   41  109:putfield        #119 <Field boolean mIntercepting>
				if(mIntercepting)
	//*  42  112:aload_0         
	//*  43  113:getfield        #119 <Field boolean mIntercepting>
	//*  44  116:ifeq            232
				{
					if(!mBeganFromDownMotionEvent)
	//*  45  119:aload_0         
	//*  46  120:getfield        #125 <Field boolean mBeganFromDownMotionEvent>
	//*  47  123:ifne            187
					{
						mBeganFromDownMotionEvent = true;
	//   48  126:aload_0         
	//   49  127:iconst_1        
	//   50  128:putfield        #125 <Field boolean mBeganFromDownMotionEvent>
						MotionEvent motionevent1 = MotionEvent.obtainNoHistory(mPendingDownMotionEvent);
	//   51  131:aload_0         
	//   52  132:getfield        #121 <Field MotionEvent mPendingDownMotionEvent>
	//   53  135:invokestatic    #63  <Method MotionEvent MotionEvent.obtainNoHistory(MotionEvent)>
	//   54  138:astore          4
						motionevent1.setLocation(motionevent.getX(), motionevent.getY());
	//   55  140:aload           4
	//   56  142:aload_1         
	//   57  143:invokevirtual   #67  <Method float MotionEvent.getX()>
	//   58  146:aload_1         
	//   59  147:invokevirtual   #70  <Method float MotionEvent.getY()>
	//   60  150:invokevirtual   #131 <Method void MotionEvent.setLocation(float, float)>
						mTouchInterceptionListener.onDownMotionEvent(motionevent1);
	//   61  153:aload_0         
	//   62  154:getfield        #97  <Field TouchInterceptionFrameLayout$TouchInterceptionListener mTouchInterceptionListener>
	//   63  157:aload           4
	//   64  159:invokeinterface #135 <Method void TouchInterceptionFrameLayout$TouchInterceptionListener.onDownMotionEvent(MotionEvent)>
						mInitialPoint = new PointF(motionevent.getX(), motionevent.getY());
	//   65  164:aload_0         
	//   66  165:new             #104 <Class PointF>
	//   67  168:dup             
	//   68  169:aload_1         
	//   69  170:invokevirtual   #67  <Method float MotionEvent.getX()>
	//   70  173:aload_1         
	//   71  174:invokevirtual   #70  <Method float MotionEvent.getY()>
	//   72  177:invokespecial   #106 <Method void PointF(float, float)>
	//   73  180:putfield        #102 <Field PointF mInitialPoint>
						f = 0.0F;
	//   74  183:fconst_0        
	//   75  184:fstore_2        
						f1 = 0.0F;
	//   76  185:fconst_0        
	//   77  186:fstore_3        
					}
					if(!mChildrenEventsCanceled)
	//*  78  187:aload_0         
	//*  79  188:getfield        #127 <Field boolean mChildrenEventsCanceled>
	//*  80  191:ifne            213
					{
						mChildrenEventsCanceled = true;
	//   81  194:aload_0         
	//   82  195:iconst_1        
	//   83  196:putfield        #127 <Field boolean mChildrenEventsCanceled>
						duplicateTouchEventForChildren(obtainMotionEvent(motionevent, 3), new MotionEvent[0]);
	//   84  199:aload_0         
	//   85  200:aload_0         
	//   86  201:aload_1         
	//   87  202:iconst_3        
	//   88  203:invokespecial   #137 <Method MotionEvent obtainMotionEvent(MotionEvent, int)>
	//   89  206:iconst_0        
	//   90  207:anewarray       MotionEvent[]
	//   91  210:invokespecial   #139 <Method void duplicateTouchEventForChildren(MotionEvent, MotionEvent[])>
					}
					mTouchInterceptionListener.onMoveMotionEvent(motionevent, f, f1);
	//   92  213:aload_0         
	//   93  214:getfield        #97  <Field TouchInterceptionFrameLayout$TouchInterceptionListener mTouchInterceptionListener>
	//   94  217:aload_1         
	//   95  218:fload_2         
	//   96  219:fload_3         
	//   97  220:invokeinterface #143 <Method void TouchInterceptionFrameLayout$TouchInterceptionListener.onMoveMotionEvent(MotionEvent, float, float)>
					mDownMotionEventPended = true;
	//   98  225:aload_0         
	//   99  226:iconst_1        
	//  100  227:putfield        #123 <Field boolean mDownMotionEventPended>
					return true;
	//  101  230:iconst_1        
	//  102  231:ireturn         
				}
				if(mDownMotionEventPended)
	//* 103  232:aload_0         
	//* 104  233:getfield        #123 <Field boolean mDownMotionEventPended>
	//* 105  236:ifeq            283
				{
					mDownMotionEventPended = false;
	//  106  239:aload_0         
	//  107  240:iconst_0        
	//  108  241:putfield        #123 <Field boolean mDownMotionEventPended>
					MotionEvent motionevent2 = MotionEvent.obtainNoHistory(mPendingDownMotionEvent);
	//  109  244:aload_0         
	//  110  245:getfield        #121 <Field MotionEvent mPendingDownMotionEvent>
	//  111  248:invokestatic    #63  <Method MotionEvent MotionEvent.obtainNoHistory(MotionEvent)>
	//  112  251:astore          4
					motionevent2.setLocation(motionevent.getX(), motionevent.getY());
	//  113  253:aload           4
	//  114  255:aload_1         
	//  115  256:invokevirtual   #67  <Method float MotionEvent.getX()>
	//  116  259:aload_1         
	//  117  260:invokevirtual   #70  <Method float MotionEvent.getY()>
	//  118  263:invokevirtual   #131 <Method void MotionEvent.setLocation(float, float)>
					duplicateTouchEventForChildren(motionevent, new MotionEvent[] {
						motionevent2
					});
	//  119  266:aload_0         
	//  120  267:aload_1         
	//  121  268:iconst_1        
	//  122  269:anewarray       MotionEvent[]
	//  123  272:dup             
	//  124  273:iconst_0        
	//  125  274:aload           4
	//  126  276:aastore         
	//  127  277:invokespecial   #139 <Method void duplicateTouchEventForChildren(MotionEvent, MotionEvent[])>
				} else
	//* 128  280:goto            292
				{
					duplicateTouchEventForChildren(motionevent, new MotionEvent[0]);
	//  129  283:aload_0         
	//  130  284:aload_1         
	//  131  285:iconst_0        
	//  132  286:anewarray       MotionEvent[]
	//  133  289:invokespecial   #139 <Method void duplicateTouchEventForChildren(MotionEvent, MotionEvent[])>
				}
				mBeganFromDownMotionEvent = false;
	//  134  292:aload_0         
	//  135  293:iconst_0        
	//  136  294:putfield        #125 <Field boolean mBeganFromDownMotionEvent>
				mChildrenEventsCanceled = false;
	//  137  297:aload_0         
	//  138  298:iconst_0        
	//  139  299:putfield        #127 <Field boolean mChildrenEventsCanceled>
				break;
	//  140  302:goto            428

			case 1: // '\001'
			case 3: // '\003'
				mBeganFromDownMotionEvent = false;
	//  141  305:aload_0         
	//  142  306:iconst_0        
	//  143  307:putfield        #125 <Field boolean mBeganFromDownMotionEvent>
				if(mIntercepting)
	//* 144  310:aload_0         
	//* 145  311:getfield        #119 <Field boolean mIntercepting>
	//* 146  314:ifeq            327
					mTouchInterceptionListener.onUpOrCancelMotionEvent(motionevent);
	//  147  317:aload_0         
	//  148  318:getfield        #97  <Field TouchInterceptionFrameLayout$TouchInterceptionListener mTouchInterceptionListener>
	//  149  321:aload_1         
	//  150  322:invokeinterface #146 <Method void TouchInterceptionFrameLayout$TouchInterceptionListener.onUpOrCancelMotionEvent(MotionEvent)>
				if(!mChildrenEventsCanceled)
	//* 151  327:aload_0         
	//* 152  328:getfield        #127 <Field boolean mChildrenEventsCanceled>
	//* 153  331:ifne            398
				{
					mChildrenEventsCanceled = true;
	//  154  334:aload_0         
	//  155  335:iconst_1        
	//  156  336:putfield        #127 <Field boolean mChildrenEventsCanceled>
					if(mDownMotionEventPended)
	//* 157  339:aload_0         
	//* 158  340:getfield        #123 <Field boolean mDownMotionEventPended>
	//* 159  343:ifeq            389
					{
						mDownMotionEventPended = false;
	//  160  346:aload_0         
	//  161  347:iconst_0        
	//  162  348:putfield        #123 <Field boolean mDownMotionEventPended>
						MotionEvent motionevent3 = MotionEvent.obtainNoHistory(mPendingDownMotionEvent);
	//  163  351:aload_0         
	//  164  352:getfield        #121 <Field MotionEvent mPendingDownMotionEvent>
	//  165  355:invokestatic    #63  <Method MotionEvent MotionEvent.obtainNoHistory(MotionEvent)>
	//  166  358:astore          4
						motionevent3.setLocation(motionevent.getX(), motionevent.getY());
	//  167  360:aload           4
	//  168  362:aload_1         
	//  169  363:invokevirtual   #67  <Method float MotionEvent.getX()>
	//  170  366:aload_1         
	//  171  367:invokevirtual   #70  <Method float MotionEvent.getY()>
	//  172  370:invokevirtual   #131 <Method void MotionEvent.setLocation(float, float)>
						duplicateTouchEventForChildren(motionevent, new MotionEvent[] {
							motionevent3
						});
	//  173  373:aload_0         
	//  174  374:aload_1         
	//  175  375:iconst_1        
	//  176  376:anewarray       MotionEvent[]
	//  177  379:dup             
	//  178  380:iconst_0        
	//  179  381:aload           4
	//  180  383:aastore         
	//  181  384:invokespecial   #139 <Method void duplicateTouchEventForChildren(MotionEvent, MotionEvent[])>
						return true;
	//  182  387:iconst_1        
	//  183  388:ireturn         
					}
					duplicateTouchEventForChildren(motionevent, new MotionEvent[0]);
	//  184  389:aload_0         
	//  185  390:aload_1         
	//  186  391:iconst_0        
	//  187  392:anewarray       MotionEvent[]
	//  188  395:invokespecial   #139 <Method void duplicateTouchEventForChildren(MotionEvent, MotionEvent[])>
				}
				return true;
	//  189  398:iconst_1        
	//  190  399:ireturn         

			case 0: // '\0'
				if(mIntercepting)
	//* 191  400:aload_0         
	//* 192  401:getfield        #119 <Field boolean mIntercepting>
	//* 193  404:ifeq            428
				{
					mTouchInterceptionListener.onDownMotionEvent(motionevent);
	//  194  407:aload_0         
	//  195  408:getfield        #97  <Field TouchInterceptionFrameLayout$TouchInterceptionListener mTouchInterceptionListener>
	//  196  411:aload_1         
	//  197  412:invokeinterface #135 <Method void TouchInterceptionFrameLayout$TouchInterceptionListener.onDownMotionEvent(MotionEvent)>
					duplicateTouchEventForChildren(motionevent, new MotionEvent[0]);
	//  198  417:aload_0         
	//  199  418:aload_1         
	//  200  419:iconst_0        
	//  201  420:anewarray       MotionEvent[]
	//  202  423:invokespecial   #139 <Method void duplicateTouchEventForChildren(MotionEvent, MotionEvent[])>
					return true;
	//  203  426:iconst_1        
	//  204  427:ireturn         
				}
				break;
			}
		return super.onTouchEvent(motionevent);
	//  205  428:aload_0         
	//  206  429:aload_1         
	//  207  430:invokespecial   #148 <Method boolean FrameLayout.onTouchEvent(MotionEvent)>
	//  208  433:ireturn         
	}

	public void setScrollInterceptionListener(TouchInterceptionListener touchinterceptionlistener)
	{
		mTouchInterceptionListener = touchinterceptionlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #97  <Field TouchInterceptionFrameLayout$TouchInterceptionListener mTouchInterceptionListener>
	//    3    5:return          
	}

	private boolean mBeganFromDownMotionEvent;
	private boolean mChildrenEventsCanceled;
	private boolean mDownMotionEventPended;
	private PointF mInitialPoint;
	private boolean mIntercepting;
	private MotionEvent mPendingDownMotionEvent;
	private TouchInterceptionListener mTouchInterceptionListener;
}
