// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.*;

public final class GestureDetectorCompat
{
	static interface GestureDetectorCompatImpl
	{

		public abstract boolean isLongpressEnabled();

		public abstract boolean onTouchEvent(MotionEvent motionevent);

		public abstract void setIsLongpressEnabled(boolean flag);

		public abstract void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener);
	}

	static class GestureDetectorCompatImplBase
		implements GestureDetectorCompatImpl
	{

		private void cancel()
		{
			mHandler.removeMessages(1);
		//    0    0:aload_0         
		//    1    1:getfield        #80  <Field Handler mHandler>
		//    2    4:iconst_1        
		//    3    5:invokevirtual   #102 <Method void Handler.removeMessages(int)>
			mHandler.removeMessages(2);
		//    4    8:aload_0         
		//    5    9:getfield        #80  <Field Handler mHandler>
		//    6   12:iconst_2        
		//    7   13:invokevirtual   #102 <Method void Handler.removeMessages(int)>
			mHandler.removeMessages(3);
		//    8   16:aload_0         
		//    9   17:getfield        #80  <Field Handler mHandler>
		//   10   20:iconst_3        
		//   11   21:invokevirtual   #102 <Method void Handler.removeMessages(int)>
			mVelocityTracker.recycle();
		//   12   24:aload_0         
		//   13   25:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//   14   28:invokevirtual   #109 <Method void VelocityTracker.recycle()>
			mVelocityTracker = null;
		//   15   31:aload_0         
		//   16   32:aconst_null     
		//   17   33:putfield        #104 <Field VelocityTracker mVelocityTracker>
			mIsDoubleTapping = false;
		//   18   36:aload_0         
		//   19   37:iconst_0        
		//   20   38:putfield        #111 <Field boolean mIsDoubleTapping>
			mStillDown = false;
		//   21   41:aload_0         
		//   22   42:iconst_0        
		//   23   43:putfield        #113 <Field boolean mStillDown>
			mAlwaysInTapRegion = false;
		//   24   46:aload_0         
		//   25   47:iconst_0        
		//   26   48:putfield        #115 <Field boolean mAlwaysInTapRegion>
			mAlwaysInBiggerTapRegion = false;
		//   27   51:aload_0         
		//   28   52:iconst_0        
		//   29   53:putfield        #117 <Field boolean mAlwaysInBiggerTapRegion>
			mDeferConfirmSingleTap = false;
		//   30   56:aload_0         
		//   31   57:iconst_0        
		//   32   58:putfield        #119 <Field boolean mDeferConfirmSingleTap>
			if(mInLongPress)
		//*  33   61:aload_0         
		//*  34   62:getfield        #121 <Field boolean mInLongPress>
		//*  35   65:ifeq            73
				mInLongPress = false;
		//   36   68:aload_0         
		//   37   69:iconst_0        
		//   38   70:putfield        #121 <Field boolean mInLongPress>
		//   39   73:return          
		}

		private void cancelTaps()
		{
			mHandler.removeMessages(1);
		//    0    0:aload_0         
		//    1    1:getfield        #80  <Field Handler mHandler>
		//    2    4:iconst_1        
		//    3    5:invokevirtual   #102 <Method void Handler.removeMessages(int)>
			mHandler.removeMessages(2);
		//    4    8:aload_0         
		//    5    9:getfield        #80  <Field Handler mHandler>
		//    6   12:iconst_2        
		//    7   13:invokevirtual   #102 <Method void Handler.removeMessages(int)>
			mHandler.removeMessages(3);
		//    8   16:aload_0         
		//    9   17:getfield        #80  <Field Handler mHandler>
		//   10   20:iconst_3        
		//   11   21:invokevirtual   #102 <Method void Handler.removeMessages(int)>
			mIsDoubleTapping = false;
		//   12   24:aload_0         
		//   13   25:iconst_0        
		//   14   26:putfield        #111 <Field boolean mIsDoubleTapping>
			mAlwaysInTapRegion = false;
		//   15   29:aload_0         
		//   16   30:iconst_0        
		//   17   31:putfield        #115 <Field boolean mAlwaysInTapRegion>
			mAlwaysInBiggerTapRegion = false;
		//   18   34:aload_0         
		//   19   35:iconst_0        
		//   20   36:putfield        #117 <Field boolean mAlwaysInBiggerTapRegion>
			mDeferConfirmSingleTap = false;
		//   21   39:aload_0         
		//   22   40:iconst_0        
		//   23   41:putfield        #119 <Field boolean mDeferConfirmSingleTap>
			if(mInLongPress)
		//*  24   44:aload_0         
		//*  25   45:getfield        #121 <Field boolean mInLongPress>
		//*  26   48:ifeq            56
				mInLongPress = false;
		//   27   51:aload_0         
		//   28   52:iconst_0        
		//   29   53:putfield        #121 <Field boolean mInLongPress>
		//   30   56:return          
		}

		private void init(Context context)
		{
			if(context == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       14
				throw new IllegalArgumentException("Context must not be null");
		//    2    4:new             #124 <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc1            #126 <String "Context must not be null">
		//    5   10:invokespecial   #129 <Method void IllegalArgumentException(String)>
		//    6   13:athrow          
			if(mListener == null)
		//*   7   14:aload_0         
		//*   8   15:getfield        #85  <Field android.view.GestureDetector$OnGestureListener mListener>
		//*   9   18:ifnonnull       31
			{
				throw new IllegalArgumentException("OnGestureListener must not be null");
		//   10   21:new             #124 <Class IllegalArgumentException>
		//   11   24:dup             
		//   12   25:ldc1            #131 <String "OnGestureListener must not be null">
		//   13   27:invokespecial   #129 <Method void IllegalArgumentException(String)>
		//   14   30:athrow          
			} else
			{
				mIsLongpressEnabled = true;
		//   15   31:aload_0         
		//   16   32:iconst_1        
		//   17   33:putfield        #133 <Field boolean mIsLongpressEnabled>
				context = ((Context) (ViewConfiguration.get(context)));
		//   18   36:aload_1         
		//   19   37:invokestatic    #137 <Method ViewConfiguration ViewConfiguration.get(Context)>
		//   20   40:astore_1        
				int i = ((ViewConfiguration) (context)).getScaledTouchSlop();
		//   21   41:aload_1         
		//   22   42:invokevirtual   #140 <Method int ViewConfiguration.getScaledTouchSlop()>
		//   23   45:istore_2        
				int j = ((ViewConfiguration) (context)).getScaledDoubleTapSlop();
		//   24   46:aload_1         
		//   25   47:invokevirtual   #143 <Method int ViewConfiguration.getScaledDoubleTapSlop()>
		//   26   50:istore_3        
				mMinimumFlingVelocity = ((ViewConfiguration) (context)).getScaledMinimumFlingVelocity();
		//   27   51:aload_0         
		//   28   52:aload_1         
		//   29   53:invokevirtual   #146 <Method int ViewConfiguration.getScaledMinimumFlingVelocity()>
		//   30   56:putfield        #148 <Field int mMinimumFlingVelocity>
				mMaximumFlingVelocity = ((ViewConfiguration) (context)).getScaledMaximumFlingVelocity();
		//   31   59:aload_0         
		//   32   60:aload_1         
		//   33   61:invokevirtual   #151 <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
		//   34   64:putfield        #153 <Field int mMaximumFlingVelocity>
				mTouchSlopSquare = i * i;
		//   35   67:aload_0         
		//   36   68:iload_2         
		//   37   69:iload_2         
		//   38   70:imul            
		//   39   71:putfield        #155 <Field int mTouchSlopSquare>
				mDoubleTapSlopSquare = j * j;
		//   40   74:aload_0         
		//   41   75:iload_3         
		//   42   76:iload_3         
		//   43   77:imul            
		//   44   78:putfield        #157 <Field int mDoubleTapSlopSquare>
				return;
		//   45   81:return          
			}
		}

		private boolean isConsideredDoubleTap(MotionEvent motionevent, MotionEvent motionevent1, MotionEvent motionevent2)
		{
			boolean flag1 = mAlwaysInBiggerTapRegion;
		//    0    0:aload_0         
		//    1    1:getfield        #117 <Field boolean mAlwaysInBiggerTapRegion>
		//    2    4:istore          7
			boolean flag = false;
		//    3    6:iconst_0        
		//    4    7:istore          6
			if(!flag1)
		//*   5    9:iload           7
		//*   6   11:ifne            16
				return false;
		//    7   14:iconst_0        
		//    8   15:ireturn         
			if(motionevent2.getEventTime() - motionevent1.getEventTime() > (long)DOUBLE_TAP_TIMEOUT)
		//*   9   16:aload_3         
		//*  10   17:invokevirtual   #165 <Method long MotionEvent.getEventTime()>
		//*  11   20:aload_2         
		//*  12   21:invokevirtual   #165 <Method long MotionEvent.getEventTime()>
		//*  13   24:lsub            
		//*  14   25:getstatic       #70  <Field int DOUBLE_TAP_TIMEOUT>
		//*  15   28:i2l             
		//*  16   29:lcmp            
		//*  17   30:ifle            35
				return false;
		//   18   33:iconst_0        
		//   19   34:ireturn         
			int i = (int)motionevent.getX() - (int)motionevent2.getX();
		//   20   35:aload_1         
		//   21   36:invokevirtual   #169 <Method float MotionEvent.getX()>
		//   22   39:f2i             
		//   23   40:aload_3         
		//   24   41:invokevirtual   #169 <Method float MotionEvent.getX()>
		//   25   44:f2i             
		//   26   45:isub            
		//   27   46:istore          4
			int j = (int)motionevent.getY() - (int)motionevent2.getY();
		//   28   48:aload_1         
		//   29   49:invokevirtual   #172 <Method float MotionEvent.getY()>
		//   30   52:f2i             
		//   31   53:aload_3         
		//   32   54:invokevirtual   #172 <Method float MotionEvent.getY()>
		//   33   57:f2i             
		//   34   58:isub            
		//   35   59:istore          5
			if(i * i + j * j < mDoubleTapSlopSquare)
		//*  36   61:iload           4
		//*  37   63:iload           4
		//*  38   65:imul            
		//*  39   66:iload           5
		//*  40   68:iload           5
		//*  41   70:imul            
		//*  42   71:iadd            
		//*  43   72:aload_0         
		//*  44   73:getfield        #157 <Field int mDoubleTapSlopSquare>
		//*  45   76:icmpge          82
				flag = true;
		//   46   79:iconst_1        
		//   47   80:istore          6
			return flag;
		//   48   82:iload           6
		//   49   84:ireturn         
		}

		void dispatchLongPress()
		{
			mHandler.removeMessages(3);
		//    0    0:aload_0         
		//    1    1:getfield        #80  <Field Handler mHandler>
		//    2    4:iconst_3        
		//    3    5:invokevirtual   #102 <Method void Handler.removeMessages(int)>
			mDeferConfirmSingleTap = false;
		//    4    8:aload_0         
		//    5    9:iconst_0        
		//    6   10:putfield        #119 <Field boolean mDeferConfirmSingleTap>
			mInLongPress = true;
		//    7   13:aload_0         
		//    8   14:iconst_1        
		//    9   15:putfield        #121 <Field boolean mInLongPress>
			mListener.onLongPress(mCurrentDownEvent);
		//   10   18:aload_0         
		//   11   19:getfield        #85  <Field android.view.GestureDetector$OnGestureListener mListener>
		//   12   22:aload_0         
		//   13   23:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//   14   26:invokeinterface #181 <Method void android.view.GestureDetector$OnGestureListener.onLongPress(MotionEvent)>
		//   15   31:return          
		}

		public boolean isLongpressEnabled()
		{
			return mIsLongpressEnabled;
		//    0    0:aload_0         
		//    1    1:getfield        #133 <Field boolean mIsLongpressEnabled>
		//    2    4:ireturn         
		}

		public boolean onTouchEvent(MotionEvent motionevent)
		{
			float f;
			float f1;
			int j2;
			int k2;
			boolean flag3;
			int i = motionevent.getAction();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #188 <Method int MotionEvent.getAction()>
		//    2    4:istore          6
			if(mVelocityTracker == null)
		//*   3    6:aload_0         
		//*   4    7:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//*   5   10:ifnonnull       20
				mVelocityTracker = VelocityTracker.obtain();
		//    6   13:aload_0         
		//    7   14:invokestatic    #192 <Method VelocityTracker VelocityTracker.obtain()>
		//    8   17:putfield        #104 <Field VelocityTracker mVelocityTracker>
			mVelocityTracker.addMovement(motionevent);
		//    9   20:aload_0         
		//   10   21:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//   11   24:aload_1         
		//   12   25:invokevirtual   #195 <Method void VelocityTracker.addMovement(MotionEvent)>
			k2 = i & 0xff;
		//   13   28:iload           6
		//   14   30:sipush          255
		//   15   33:iand            
		//   16   34:istore          10
			flag3 = false;
		//   17   36:iconst_0        
		//   18   37:istore          12
			boolean flag;
			if(k2 == 6)
		//*  19   39:iload           10
		//*  20   41:bipush          6
		//*  21   43:icmpne          52
				flag = true;
		//   22   46:iconst_1        
		//   23   47:istore          6
			else
		//*  24   49:goto            55
				flag = false;
		//   25   52:iconst_0        
		//   26   53:istore          6
			int i1;
			if(flag)
		//*  27   55:iload           6
		//*  28   57:ifeq            69
				i1 = motionevent.getActionIndex();
		//   29   60:aload_1         
		//   30   61:invokevirtual   #198 <Method int MotionEvent.getActionIndex()>
		//   31   64:istore          7
			else
		//*  32   66:goto            72
				i1 = -1;
		//   33   69:iconst_m1       
		//   34   70:istore          7
			j2 = motionevent.getPointerCount();
		//   35   72:aload_1         
		//   36   73:invokevirtual   #201 <Method int MotionEvent.getPointerCount()>
		//   37   76:istore          9
			int l1 = 0;
		//   38   78:iconst_0        
		//   39   79:istore          8
			f1 = 0.0F;
		//   40   81:fconst_0        
		//   41   82:fstore_3        
			f = f1;
		//   42   83:fload_3         
		//   43   84:fstore_2        
			for(; l1 < j2; l1++)
		//*  44   85:iload           8
		//*  45   87:iload           9
		//*  46   89:icmpge          129
				if(i1 != l1)
		//*  47   92:iload           7
		//*  48   94:iload           8
		//*  49   96:icmpne          102
		//*  50   99:goto            120
				{
					f1 += motionevent.getX(l1);
		//   51  102:fload_3         
		//   52  103:aload_1         
		//   53  104:iload           8
		//   54  106:invokevirtual   #204 <Method float MotionEvent.getX(int)>
		//   55  109:fadd            
		//   56  110:fstore_3        
					f += motionevent.getY(l1);
		//   57  111:fload_2         
		//   58  112:aload_1         
		//   59  113:iload           8
		//   60  115:invokevirtual   #206 <Method float MotionEvent.getY(int)>
		//   61  118:fadd            
		//   62  119:fstore_2        
				}

		//   63  120:iload           8
		//   64  122:iconst_1        
		//   65  123:iadd            
		//   66  124:istore          8
		//*  67  126:goto            85
			if(flag)
		//*  68  129:iload           6
		//*  69  131:ifeq            143
				flag = ((boolean) (j2 - 1));
		//   70  134:iload           9
		//   71  136:iconst_1        
		//   72  137:isub            
		//   73  138:istore          6
			else
		//*  74  140:goto            147
				flag = ((boolean) (j2));
		//   75  143:iload           9
		//   76  145:istore          6
			float f2 = flag;
		//   77  147:iload           6
		//   78  149:i2f             
		//   79  150:fstore          4
			f1 /= f2;
		//   80  152:fload_3         
		//   81  153:fload           4
		//   82  155:fdiv            
		//   83  156:fstore_3        
			f /= f2;
		//   84  157:fload_2         
		//   85  158:fload           4
		//   86  160:fdiv            
		//   87  161:fstore_2        
			k2;
		//   88  162:iload           10
			JVM INSTR tableswitch 0 6: default 208
		//		               0 900
		//		               1 628
		//		               2 389
		//		               3 383
		//		               4 208
		//		               5 357
		//		               6 210;
		//   89  164:tableswitch     0 6: default 208
		//		               0 900
		//		               1 628
		//		               2 389
		//		               3 383
		//		               4 208
		//		               5 357
		//		               6 210
			   goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
			return false;
		//   90  208:iconst_0        
		//   91  209:ireturn         
_L7:
			boolean flag2;
			mLastFocusX = f1;
		//   92  210:aload_0         
		//   93  211:fload_3         
		//   94  212:putfield        #208 <Field float mLastFocusX>
			mDownFocusX = f1;
		//   95  215:aload_0         
		//   96  216:fload_3         
		//   97  217:putfield        #210 <Field float mDownFocusX>
			mLastFocusY = f;
		//   98  220:aload_0         
		//   99  221:fload_2         
		//  100  222:putfield        #212 <Field float mLastFocusY>
			mDownFocusY = f;
		//  101  225:aload_0         
		//  102  226:fload_2         
		//  103  227:putfield        #214 <Field float mDownFocusY>
			mVelocityTracker.computeCurrentVelocity(1000, mMaximumFlingVelocity);
		//  104  230:aload_0         
		//  105  231:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//  106  234:sipush          1000
		//  107  237:aload_0         
		//  108  238:getfield        #153 <Field int mMaximumFlingVelocity>
		//  109  241:i2f             
		//  110  242:invokevirtual   #218 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
			int j1 = motionevent.getActionIndex();
		//  111  245:aload_1         
		//  112  246:invokevirtual   #198 <Method int MotionEvent.getActionIndex()>
		//  113  249:istore          7
			int j = motionevent.getPointerId(j1);
		//  114  251:aload_1         
		//  115  252:iload           7
		//  116  254:invokevirtual   #222 <Method int MotionEvent.getPointerId(int)>
		//  117  257:istore          6
			f = mVelocityTracker.getXVelocity(j);
		//  118  259:aload_0         
		//  119  260:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//  120  263:iload           6
		//  121  265:invokevirtual   #225 <Method float VelocityTracker.getXVelocity(int)>
		//  122  268:fstore_2        
			f1 = mVelocityTracker.getYVelocity(j);
		//  123  269:aload_0         
		//  124  270:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//  125  273:iload           6
		//  126  275:invokevirtual   #228 <Method float VelocityTracker.getYVelocity(int)>
		//  127  278:fstore_3        
			j = 0;
		//  128  279:iconst_0        
		//  129  280:istore          6
			do
			{
				flag2 = flag3;
		//  130  282:iload           12
		//  131  284:istore          11
				if(j >= j2)
					break;
		//  132  286:iload           6
		//  133  288:iload           9
		//  134  290:icmpge          1161
				if(j != j1)
		//* 135  293:iload           6
		//* 136  295:iload           7
		//* 137  297:icmpne          303
		//* 138  300:goto            348
				{
					int i2 = motionevent.getPointerId(j);
		//  139  303:aload_1         
		//  140  304:iload           6
		//  141  306:invokevirtual   #222 <Method int MotionEvent.getPointerId(int)>
		//  142  309:istore          8
					if(mVelocityTracker.getXVelocity(i2) * f + mVelocityTracker.getYVelocity(i2) * f1 < 0.0F)
		//* 143  311:aload_0         
		//* 144  312:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//* 145  315:iload           8
		//* 146  317:invokevirtual   #225 <Method float VelocityTracker.getXVelocity(int)>
		//* 147  320:fload_2         
		//* 148  321:fmul            
		//* 149  322:aload_0         
		//* 150  323:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//* 151  326:iload           8
		//* 152  328:invokevirtual   #228 <Method float VelocityTracker.getYVelocity(int)>
		//* 153  331:fload_3         
		//* 154  332:fmul            
		//* 155  333:fadd            
		//* 156  334:fconst_0        
		//* 157  335:fcmpg           
		//* 158  336:ifge            348
					{
						mVelocityTracker.clear();
		//  159  339:aload_0         
		//  160  340:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//  161  343:invokevirtual   #231 <Method void VelocityTracker.clear()>
						return false;
		//  162  346:iconst_0        
		//  163  347:ireturn         
					}
				}
				j++;
		//  164  348:iload           6
		//  165  350:iconst_1        
		//  166  351:iadd            
		//  167  352:istore          6
			} while(true);
		//  168  354:goto            282
			break; /* Loop/switch isn't completed */
_L6:
			mLastFocusX = f1;
		//  169  357:aload_0         
		//  170  358:fload_3         
		//  171  359:putfield        #208 <Field float mLastFocusX>
			mDownFocusX = f1;
		//  172  362:aload_0         
		//  173  363:fload_3         
		//  174  364:putfield        #210 <Field float mDownFocusX>
			mLastFocusY = f;
		//  175  367:aload_0         
		//  176  368:fload_2         
		//  177  369:putfield        #212 <Field float mLastFocusY>
			mDownFocusY = f;
		//  178  372:aload_0         
		//  179  373:fload_2         
		//  180  374:putfield        #214 <Field float mDownFocusY>
			cancelTaps();
		//  181  377:aload_0         
		//  182  378:invokespecial   #233 <Method void cancelTaps()>
			return false;
		//  183  381:iconst_0        
		//  184  382:ireturn         
_L5:
			cancel();
		//  185  383:aload_0         
		//  186  384:invokespecial   #235 <Method void cancel()>
			return false;
		//  187  387:iconst_0        
		//  188  388:ireturn         
_L4:
			if(mInLongPress)
		//* 189  389:aload_0         
		//* 190  390:getfield        #121 <Field boolean mInLongPress>
		//* 191  393:ifeq            398
				return false;
		//  192  396:iconst_0        
		//  193  397:ireturn         
			float f3 = mLastFocusX - f1;
		//  194  398:aload_0         
		//  195  399:getfield        #208 <Field float mLastFocusX>
		//  196  402:fload_3         
		//  197  403:fsub            
		//  198  404:fstore          4
			float f4 = mLastFocusY - f;
		//  199  406:aload_0         
		//  200  407:getfield        #212 <Field float mLastFocusY>
		//  201  410:fload_2         
		//  202  411:fsub            
		//  203  412:fstore          5
			if(mIsDoubleTapping)
		//* 204  414:aload_0         
		//* 205  415:getfield        #111 <Field boolean mIsDoubleTapping>
		//* 206  418:ifeq            434
				return false | mDoubleTapListener.onDoubleTapEvent(motionevent);
		//  207  421:iconst_0        
		//  208  422:aload_0         
		//  209  423:getfield        #237 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
		//  210  426:aload_1         
		//  211  427:invokeinterface #240 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onDoubleTapEvent(MotionEvent)>
		//  212  432:ior             
		//  213  433:ireturn         
			if(mAlwaysInTapRegion)
		//* 214  434:aload_0         
		//* 215  435:getfield        #115 <Field boolean mAlwaysInTapRegion>
		//* 216  438:ifeq            571
			{
				int k = (int)(f1 - mDownFocusX);
		//  217  441:fload_3         
		//  218  442:aload_0         
		//  219  443:getfield        #210 <Field float mDownFocusX>
		//  220  446:fsub            
		//  221  447:f2i             
		//  222  448:istore          6
				int k1 = (int)(f - mDownFocusY);
		//  223  450:fload_2         
		//  224  451:aload_0         
		//  225  452:getfield        #214 <Field float mDownFocusY>
		//  226  455:fsub            
		//  227  456:f2i             
		//  228  457:istore          7
				k = k * k + k1 * k1;
		//  229  459:iload           6
		//  230  461:iload           6
		//  231  463:imul            
		//  232  464:iload           7
		//  233  466:iload           7
		//  234  468:imul            
		//  235  469:iadd            
		//  236  470:istore          6
				if(k > mTouchSlopSquare)
		//* 237  472:iload           6
		//* 238  474:aload_0         
		//* 239  475:getfield        #155 <Field int mTouchSlopSquare>
		//* 240  478:icmple          543
				{
					flag2 = mListener.onScroll(mCurrentDownEvent, motionevent, f3, f4);
		//  241  481:aload_0         
		//  242  482:getfield        #85  <Field android.view.GestureDetector$OnGestureListener mListener>
		//  243  485:aload_0         
		//  244  486:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//  245  489:aload_1         
		//  246  490:fload           4
		//  247  492:fload           5
		//  248  494:invokeinterface #244 <Method boolean android.view.GestureDetector$OnGestureListener.onScroll(MotionEvent, MotionEvent, float, float)>
		//  249  499:istore          11
					mLastFocusX = f1;
		//  250  501:aload_0         
		//  251  502:fload_3         
		//  252  503:putfield        #208 <Field float mLastFocusX>
					mLastFocusY = f;
		//  253  506:aload_0         
		//  254  507:fload_2         
		//  255  508:putfield        #212 <Field float mLastFocusY>
					mAlwaysInTapRegion = false;
		//  256  511:aload_0         
		//  257  512:iconst_0        
		//  258  513:putfield        #115 <Field boolean mAlwaysInTapRegion>
					mHandler.removeMessages(3);
		//  259  516:aload_0         
		//  260  517:getfield        #80  <Field Handler mHandler>
		//  261  520:iconst_3        
		//  262  521:invokevirtual   #102 <Method void Handler.removeMessages(int)>
					mHandler.removeMessages(1);
		//  263  524:aload_0         
		//  264  525:getfield        #80  <Field Handler mHandler>
		//  265  528:iconst_1        
		//  266  529:invokevirtual   #102 <Method void Handler.removeMessages(int)>
					mHandler.removeMessages(2);
		//  267  532:aload_0         
		//  268  533:getfield        #80  <Field Handler mHandler>
		//  269  536:iconst_2        
		//  270  537:invokevirtual   #102 <Method void Handler.removeMessages(int)>
				} else
		//* 271  540:goto            546
				{
					flag2 = false;
		//  272  543:iconst_0        
		//  273  544:istore          11
				}
				flag3 = flag2;
		//  274  546:iload           11
		//  275  548:istore          12
				if(k > mTouchSlopSquare)
		//* 276  550:iload           6
		//* 277  552:aload_0         
		//* 278  553:getfield        #155 <Field int mTouchSlopSquare>
		//* 279  556:icmple          897
				{
					mAlwaysInBiggerTapRegion = false;
		//  280  559:aload_0         
		//  281  560:iconst_0        
		//  282  561:putfield        #117 <Field boolean mAlwaysInBiggerTapRegion>
					flag3 = flag2;
		//  283  564:iload           11
		//  284  566:istore          12
				}
			} else
		//* 285  568:goto            897
			{
				if(Math.abs(f3) < 1.0F)
		//* 286  571:fload           4
		//* 287  573:invokestatic    #250 <Method float Math.abs(float)>
		//* 288  576:fconst_1        
		//* 289  577:fcmpl           
		//* 290  578:ifge            595
				{
					flag2 = flag3;
		//  291  581:iload           12
		//  292  583:istore          11
					if(Math.abs(f4) < 1.0F)
						break; /* Loop/switch isn't completed */
		//  293  585:fload           5
		//  294  587:invokestatic    #250 <Method float Math.abs(float)>
		//  295  590:fconst_1        
		//  296  591:fcmpl           
		//  297  592:iflt            1161
				}
				flag2 = mListener.onScroll(mCurrentDownEvent, motionevent, f3, f4);
		//  298  595:aload_0         
		//  299  596:getfield        #85  <Field android.view.GestureDetector$OnGestureListener mListener>
		//  300  599:aload_0         
		//  301  600:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//  302  603:aload_1         
		//  303  604:fload           4
		//  304  606:fload           5
		//  305  608:invokeinterface #244 <Method boolean android.view.GestureDetector$OnGestureListener.onScroll(MotionEvent, MotionEvent, float, float)>
		//  306  613:istore          11
				mLastFocusX = f1;
		//  307  615:aload_0         
		//  308  616:fload_3         
		//  309  617:putfield        #208 <Field float mLastFocusX>
				mLastFocusY = f;
		//  310  620:aload_0         
		//  311  621:fload_2         
		//  312  622:putfield        #212 <Field float mLastFocusY>
				return flag2;
		//  313  625:iload           11
		//  314  627:ireturn         
			}
			  goto _L8
_L3:
			MotionEvent motionevent1;
			mStillDown = false;
		//  315  628:aload_0         
		//  316  629:iconst_0        
		//  317  630:putfield        #113 <Field boolean mStillDown>
			motionevent1 = MotionEvent.obtain(motionevent);
		//  318  633:aload_1         
		//  319  634:invokestatic    #253 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
		//  320  637:astore          13
			if(mIsDoubleTapping)
		//* 321  639:aload_0         
		//* 322  640:getfield        #111 <Field boolean mIsDoubleTapping>
		//* 323  643:ifeq            663
			{
				flag2 = mDoubleTapListener.onDoubleTapEvent(motionevent) | false;
		//  324  646:aload_0         
		//  325  647:getfield        #237 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
		//  326  650:aload_1         
		//  327  651:invokeinterface #240 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onDoubleTapEvent(MotionEvent)>
		//  328  656:iconst_0        
		//  329  657:ior             
		//  330  658:istore          11
				break MISSING_BLOCK_LABEL_828;
		//  331  660:goto            828
			}
			if(!mInLongPress) goto _L10; else goto _L9
		//  332  663:aload_0         
		//  333  664:getfield        #121 <Field boolean mInLongPress>
		//  334  667:ifeq            686
_L9:
			mHandler.removeMessages(3);
		//  335  670:aload_0         
		//  336  671:getfield        #80  <Field Handler mHandler>
		//  337  674:iconst_3        
		//  338  675:invokevirtual   #102 <Method void Handler.removeMessages(int)>
			mInLongPress = false;
		//  339  678:aload_0         
		//  340  679:iconst_0        
		//  341  680:putfield        #121 <Field boolean mInLongPress>
			  goto _L11
		//* 342  683:goto            804
_L10:
			if(mAlwaysInTapRegion)
		//* 343  686:aload_0         
		//* 344  687:getfield        #115 <Field boolean mAlwaysInTapRegion>
		//* 345  690:ifeq            733
			{
				flag2 = mListener.onSingleTapUp(motionevent);
		//  346  693:aload_0         
		//  347  694:getfield        #85  <Field android.view.GestureDetector$OnGestureListener mListener>
		//  348  697:aload_1         
		//  349  698:invokeinterface #256 <Method boolean android.view.GestureDetector$OnGestureListener.onSingleTapUp(MotionEvent)>
		//  350  703:istore          11
				if(mDeferConfirmSingleTap && mDoubleTapListener != null)
		//* 351  705:aload_0         
		//* 352  706:getfield        #119 <Field boolean mDeferConfirmSingleTap>
		//* 353  709:ifeq            730
		//* 354  712:aload_0         
		//* 355  713:getfield        #237 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
		//* 356  716:ifnull          730
					mDoubleTapListener.onSingleTapConfirmed(motionevent);
		//  357  719:aload_0         
		//  358  720:getfield        #237 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
		//  359  723:aload_1         
		//  360  724:invokeinterface #259 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onSingleTapConfirmed(MotionEvent)>
		//  361  729:pop             
				break MISSING_BLOCK_LABEL_828;
		//  362  730:goto            828
			}
			VelocityTracker velocitytracker = mVelocityTracker;
		//  363  733:aload_0         
		//  364  734:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//  365  737:astore          14
			int l = motionevent.getPointerId(0);
		//  366  739:aload_1         
		//  367  740:iconst_0        
		//  368  741:invokevirtual   #222 <Method int MotionEvent.getPointerId(int)>
		//  369  744:istore          6
			velocitytracker.computeCurrentVelocity(1000, mMaximumFlingVelocity);
		//  370  746:aload           14
		//  371  748:sipush          1000
		//  372  751:aload_0         
		//  373  752:getfield        #153 <Field int mMaximumFlingVelocity>
		//  374  755:i2f             
		//  375  756:invokevirtual   #218 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
			f = velocitytracker.getYVelocity(l);
		//  376  759:aload           14
		//  377  761:iload           6
		//  378  763:invokevirtual   #228 <Method float VelocityTracker.getYVelocity(int)>
		//  379  766:fstore_2        
			f1 = velocitytracker.getXVelocity(l);
		//  380  767:aload           14
		//  381  769:iload           6
		//  382  771:invokevirtual   #225 <Method float VelocityTracker.getXVelocity(int)>
		//  383  774:fstore_3        
			if(Math.abs(f) <= (float)mMinimumFlingVelocity && Math.abs(f1) <= (float)mMinimumFlingVelocity) goto _L11; else goto _L12
		//  384  775:fload_2         
		//  385  776:invokestatic    #250 <Method float Math.abs(float)>
		//  386  779:aload_0         
		//  387  780:getfield        #148 <Field int mMinimumFlingVelocity>
		//  388  783:i2f             
		//  389  784:fcmpl           
		//  390  785:ifgt            810
		//  391  788:fload_3         
		//  392  789:invokestatic    #250 <Method float Math.abs(float)>
		//  393  792:aload_0         
		//  394  793:getfield        #148 <Field int mMinimumFlingVelocity>
		//  395  796:i2f             
		//  396  797:fcmpl           
		//  397  798:ifle            804
		//* 398  801:goto            810
_L11:
			flag2 = false;
		//  399  804:iconst_0        
		//  400  805:istore          11
			break MISSING_BLOCK_LABEL_828;
		//  401  807:goto            828
_L12:
			flag2 = mListener.onFling(mCurrentDownEvent, motionevent, f1, f);
		//  402  810:aload_0         
		//  403  811:getfield        #85  <Field android.view.GestureDetector$OnGestureListener mListener>
		//  404  814:aload_0         
		//  405  815:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//  406  818:aload_1         
		//  407  819:fload_3         
		//  408  820:fload_2         
		//  409  821:invokeinterface #262 <Method boolean android.view.GestureDetector$OnGestureListener.onFling(MotionEvent, MotionEvent, float, float)>
		//  410  826:istore          11
			if(mPreviousUpEvent != null)
		//* 411  828:aload_0         
		//* 412  829:getfield        #264 <Field MotionEvent mPreviousUpEvent>
		//* 413  832:ifnull          842
				mPreviousUpEvent.recycle();
		//  414  835:aload_0         
		//  415  836:getfield        #264 <Field MotionEvent mPreviousUpEvent>
		//  416  839:invokevirtual   #265 <Method void MotionEvent.recycle()>
			mPreviousUpEvent = motionevent1;
		//  417  842:aload_0         
		//  418  843:aload           13
		//  419  845:putfield        #264 <Field MotionEvent mPreviousUpEvent>
			if(mVelocityTracker != null)
		//* 420  848:aload_0         
		//* 421  849:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//* 422  852:ifnull          867
			{
				mVelocityTracker.recycle();
		//  423  855:aload_0         
		//  424  856:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//  425  859:invokevirtual   #109 <Method void VelocityTracker.recycle()>
				mVelocityTracker = null;
		//  426  862:aload_0         
		//  427  863:aconst_null     
		//  428  864:putfield        #104 <Field VelocityTracker mVelocityTracker>
			}
			mIsDoubleTapping = false;
		//  429  867:aload_0         
		//  430  868:iconst_0        
		//  431  869:putfield        #111 <Field boolean mIsDoubleTapping>
			mDeferConfirmSingleTap = false;
		//  432  872:aload_0         
		//  433  873:iconst_0        
		//  434  874:putfield        #119 <Field boolean mDeferConfirmSingleTap>
			mHandler.removeMessages(1);
		//  435  877:aload_0         
		//  436  878:getfield        #80  <Field Handler mHandler>
		//  437  881:iconst_1        
		//  438  882:invokevirtual   #102 <Method void Handler.removeMessages(int)>
			mHandler.removeMessages(2);
		//  439  885:aload_0         
		//  440  886:getfield        #80  <Field Handler mHandler>
		//  441  889:iconst_2        
		//  442  890:invokevirtual   #102 <Method void Handler.removeMessages(int)>
			flag3 = flag2;
		//  443  893:iload           11
		//  444  895:istore          12
_L8:
			return flag3;
		//  445  897:iload           12
		//  446  899:ireturn         
_L2:
			if(mDoubleTapListener == null) goto _L14; else goto _L13
		//  447  900:aload_0         
		//  448  901:getfield        #237 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
		//  449  904:ifnull          1014
_L13:
			flag2 = mHandler.hasMessages(3);
		//  450  907:aload_0         
		//  451  908:getfield        #80  <Field Handler mHandler>
		//  452  911:iconst_3        
		//  453  912:invokevirtual   #269 <Method boolean Handler.hasMessages(int)>
		//  454  915:istore          11
			if(flag2)
		//* 455  917:iload           11
		//* 456  919:ifeq            930
				mHandler.removeMessages(3);
		//  457  922:aload_0         
		//  458  923:getfield        #80  <Field Handler mHandler>
		//  459  926:iconst_3        
		//  460  927:invokevirtual   #102 <Method void Handler.removeMessages(int)>
			if(mCurrentDownEvent == null || mPreviousUpEvent == null || !flag2 || !isConsideredDoubleTap(mCurrentDownEvent, mPreviousUpEvent, motionevent)) goto _L16; else goto _L15
		//  461  930:aload_0         
		//  462  931:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//  463  934:ifnull          1001
		//  464  937:aload_0         
		//  465  938:getfield        #264 <Field MotionEvent mPreviousUpEvent>
		//  466  941:ifnull          1001
		//  467  944:iload           11
		//  468  946:ifeq            1001
		//  469  949:aload_0         
		//  470  950:aload_0         
		//  471  951:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//  472  954:aload_0         
		//  473  955:getfield        #264 <Field MotionEvent mPreviousUpEvent>
		//  474  958:aload_1         
		//  475  959:invokespecial   #271 <Method boolean isConsideredDoubleTap(MotionEvent, MotionEvent, MotionEvent)>
		//  476  962:ifeq            1001
_L15:
			boolean flag1;
			mIsDoubleTapping = true;
		//  477  965:aload_0         
		//  478  966:iconst_1        
		//  479  967:putfield        #111 <Field boolean mIsDoubleTapping>
			flag1 = mDoubleTapListener.onDoubleTap(mCurrentDownEvent) | false | mDoubleTapListener.onDoubleTapEvent(motionevent);
		//  480  970:aload_0         
		//  481  971:getfield        #237 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
		//  482  974:aload_0         
		//  483  975:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//  484  978:invokeinterface #274 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onDoubleTap(MotionEvent)>
		//  485  983:iconst_0        
		//  486  984:ior             
		//  487  985:aload_0         
		//  488  986:getfield        #237 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
		//  489  989:aload_1         
		//  490  990:invokeinterface #240 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onDoubleTapEvent(MotionEvent)>
		//  491  995:ior             
		//  492  996:istore          6
			  goto _L17
		//* 493  998:goto            1017
_L16:
			mHandler.sendEmptyMessageDelayed(3, DOUBLE_TAP_TIMEOUT);
		//  494 1001:aload_0         
		//  495 1002:getfield        #80  <Field Handler mHandler>
		//  496 1005:iconst_3        
		//  497 1006:getstatic       #70  <Field int DOUBLE_TAP_TIMEOUT>
		//  498 1009:i2l             
		//  499 1010:invokevirtual   #278 <Method boolean Handler.sendEmptyMessageDelayed(int, long)>
		//  500 1013:pop             
_L14:
			flag1 = false;
		//  501 1014:iconst_0        
		//  502 1015:istore          6
_L17:
			mLastFocusX = f1;
		//  503 1017:aload_0         
		//  504 1018:fload_3         
		//  505 1019:putfield        #208 <Field float mLastFocusX>
			mDownFocusX = f1;
		//  506 1022:aload_0         
		//  507 1023:fload_3         
		//  508 1024:putfield        #210 <Field float mDownFocusX>
			mLastFocusY = f;
		//  509 1027:aload_0         
		//  510 1028:fload_2         
		//  511 1029:putfield        #212 <Field float mLastFocusY>
			mDownFocusY = f;
		//  512 1032:aload_0         
		//  513 1033:fload_2         
		//  514 1034:putfield        #214 <Field float mDownFocusY>
			if(mCurrentDownEvent != null)
		//* 515 1037:aload_0         
		//* 516 1038:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//* 517 1041:ifnull          1051
				mCurrentDownEvent.recycle();
		//  518 1044:aload_0         
		//  519 1045:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//  520 1048:invokevirtual   #265 <Method void MotionEvent.recycle()>
			mCurrentDownEvent = MotionEvent.obtain(motionevent);
		//  521 1051:aload_0         
		//  522 1052:aload_1         
		//  523 1053:invokestatic    #253 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
		//  524 1056:putfield        #175 <Field MotionEvent mCurrentDownEvent>
			mAlwaysInTapRegion = true;
		//  525 1059:aload_0         
		//  526 1060:iconst_1        
		//  527 1061:putfield        #115 <Field boolean mAlwaysInTapRegion>
			mAlwaysInBiggerTapRegion = true;
		//  528 1064:aload_0         
		//  529 1065:iconst_1        
		//  530 1066:putfield        #117 <Field boolean mAlwaysInBiggerTapRegion>
			mStillDown = true;
		//  531 1069:aload_0         
		//  532 1070:iconst_1        
		//  533 1071:putfield        #113 <Field boolean mStillDown>
			mInLongPress = false;
		//  534 1074:aload_0         
		//  535 1075:iconst_0        
		//  536 1076:putfield        #121 <Field boolean mInLongPress>
			mDeferConfirmSingleTap = false;
		//  537 1079:aload_0         
		//  538 1080:iconst_0        
		//  539 1081:putfield        #119 <Field boolean mDeferConfirmSingleTap>
			if(mIsLongpressEnabled)
		//* 540 1084:aload_0         
		//* 541 1085:getfield        #133 <Field boolean mIsLongpressEnabled>
		//* 542 1088:ifeq            1125
			{
				mHandler.removeMessages(2);
		//  543 1091:aload_0         
		//  544 1092:getfield        #80  <Field Handler mHandler>
		//  545 1095:iconst_2        
		//  546 1096:invokevirtual   #102 <Method void Handler.removeMessages(int)>
				mHandler.sendEmptyMessageAtTime(2, mCurrentDownEvent.getDownTime() + (long)TAP_TIMEOUT + (long)LONGPRESS_TIMEOUT);
		//  547 1099:aload_0         
		//  548 1100:getfield        #80  <Field Handler mHandler>
		//  549 1103:iconst_2        
		//  550 1104:aload_0         
		//  551 1105:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//  552 1108:invokevirtual   #281 <Method long MotionEvent.getDownTime()>
		//  553 1111:getstatic       #65  <Field int TAP_TIMEOUT>
		//  554 1114:i2l             
		//  555 1115:ladd            
		//  556 1116:getstatic       #60  <Field int LONGPRESS_TIMEOUT>
		//  557 1119:i2l             
		//  558 1120:ladd            
		//  559 1121:invokevirtual   #284 <Method boolean Handler.sendEmptyMessageAtTime(int, long)>
		//  560 1124:pop             
			}
			mHandler.sendEmptyMessageAtTime(1, mCurrentDownEvent.getDownTime() + (long)TAP_TIMEOUT);
		//  561 1125:aload_0         
		//  562 1126:getfield        #80  <Field Handler mHandler>
		//  563 1129:iconst_1        
		//  564 1130:aload_0         
		//  565 1131:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//  566 1134:invokevirtual   #281 <Method long MotionEvent.getDownTime()>
		//  567 1137:getstatic       #65  <Field int TAP_TIMEOUT>
		//  568 1140:i2l             
		//  569 1141:ladd            
		//  570 1142:invokevirtual   #284 <Method boolean Handler.sendEmptyMessageAtTime(int, long)>
		//  571 1145:pop             
			flag2 = flag1 | mListener.onDown(motionevent);
		//  572 1146:iload           6
		//  573 1148:aload_0         
		//  574 1149:getfield        #85  <Field android.view.GestureDetector$OnGestureListener mListener>
		//  575 1152:aload_1         
		//  576 1153:invokeinterface #287 <Method boolean android.view.GestureDetector$OnGestureListener.onDown(MotionEvent)>
		//  577 1158:ior             
		//  578 1159:istore          11
			return flag2;
		//  579 1161:iload           11
		//  580 1163:ireturn         
		}

		public void setIsLongpressEnabled(boolean flag)
		{
			mIsLongpressEnabled = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #133 <Field boolean mIsLongpressEnabled>
		//    3    5:return          
		}

		public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener)
		{
			mDoubleTapListener = ondoubletaplistener;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #237 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
		//    3    5:return          
		}

		private static final int DOUBLE_TAP_TIMEOUT = ViewConfiguration.getDoubleTapTimeout();
		private static final int LONGPRESS_TIMEOUT = ViewConfiguration.getLongPressTimeout();
		private static final int LONG_PRESS = 2;
		private static final int SHOW_PRESS = 1;
		private static final int TAP = 3;
		private static final int TAP_TIMEOUT = ViewConfiguration.getTapTimeout();
		private boolean mAlwaysInBiggerTapRegion;
		private boolean mAlwaysInTapRegion;
		MotionEvent mCurrentDownEvent;
		boolean mDeferConfirmSingleTap;
		android.view.GestureDetector.OnDoubleTapListener mDoubleTapListener;
		private int mDoubleTapSlopSquare;
		private float mDownFocusX;
		private float mDownFocusY;
		private final Handler mHandler;
		private boolean mInLongPress;
		private boolean mIsDoubleTapping;
		private boolean mIsLongpressEnabled;
		private float mLastFocusX;
		private float mLastFocusY;
		final android.view.GestureDetector.OnGestureListener mListener;
		private int mMaximumFlingVelocity;
		private int mMinimumFlingVelocity;
		private MotionEvent mPreviousUpEvent;
		boolean mStillDown;
		private int mTouchSlopSquare;
		private VelocityTracker mVelocityTracker;

		static 
		{
		//    0    0:invokestatic    #58  <Method int ViewConfiguration.getLongPressTimeout()>
		//    1    3:putstatic       #60  <Field int LONGPRESS_TIMEOUT>
		//    2    6:invokestatic    #63  <Method int ViewConfiguration.getTapTimeout()>
		//    3    9:putstatic       #65  <Field int TAP_TIMEOUT>
		//    4   12:invokestatic    #68  <Method int ViewConfiguration.getDoubleTapTimeout()>
		//    5   15:putstatic       #70  <Field int DOUBLE_TAP_TIMEOUT>
		//*   6   18:return          
		}

		GestureDetectorCompatImplBase(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener, Handler handler)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #75  <Method void Object()>
			if(handler != null)
		//*   2    4:aload_3         
		//*   3    5:ifnull          24
				mHandler = ((Handler) (new GestureHandler(handler)));
		//    4    8:aload_0         
		//    5    9:new             #11  <Class GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler>
		//    6   12:dup             
		//    7   13:aload_0         
		//    8   14:aload_3         
		//    9   15:invokespecial   #78  <Method void GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler(GestureDetectorCompat$GestureDetectorCompatImplBase, Handler)>
		//   10   18:putfield        #80  <Field Handler mHandler>
			else
		//*  11   21:goto            36
				mHandler = ((Handler) (new GestureHandler()));
		//   12   24:aload_0         
		//   13   25:new             #11  <Class GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler>
		//   14   28:dup             
		//   15   29:aload_0         
		//   16   30:invokespecial   #83  <Method void GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler(GestureDetectorCompat$GestureDetectorCompatImplBase)>
		//   17   33:putfield        #80  <Field Handler mHandler>
			mListener = ongesturelistener;
		//   18   36:aload_0         
		//   19   37:aload_2         
		//   20   38:putfield        #85  <Field android.view.GestureDetector$OnGestureListener mListener>
			if(ongesturelistener instanceof android.view.GestureDetector.OnDoubleTapListener)
		//*  21   41:aload_2         
		//*  22   42:instanceof      #87  <Class android.view.GestureDetector$OnDoubleTapListener>
		//*  23   45:ifeq            56
				setOnDoubleTapListener((android.view.GestureDetector.OnDoubleTapListener)ongesturelistener);
		//   24   48:aload_0         
		//   25   49:aload_2         
		//   26   50:checkcast       #87  <Class android.view.GestureDetector$OnDoubleTapListener>
		//   27   53:invokevirtual   #91  <Method void setOnDoubleTapListener(android.view.GestureDetector$OnDoubleTapListener)>
			init(context);
		//   28   56:aload_0         
		//   29   57:aload_1         
		//   30   58:invokespecial   #95  <Method void init(Context)>
		//   31   61:return          
		}
	}

	private class GestureDetectorCompatImplBase.GestureHandler extends Handler
	{

		public void handleMessage(Message message)
		{
			switch(message.what)
		//*   0    0:aload_1         
		//*   1    1:getfield        #36  <Field int Message.what>
			{
		//*   2    4:tableswitch     1 3: default 32
		//		               1 123
		//		               2 115
		//		               3 65
			default:
				StringBuilder stringbuilder = new StringBuilder();
		//    3   32:new             #38  <Class StringBuilder>
		//    4   35:dup             
		//    5   36:invokespecial   #39  <Method void StringBuilder()>
		//    6   39:astore_2        
				stringbuilder.append("Unknown message ");
		//    7   40:aload_2         
		//    8   41:ldc1            #41  <String "Unknown message ">
		//    9   43:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
		//   10   46:pop             
				stringbuilder.append(((Object) (message)));
		//   11   47:aload_2         
		//   12   48:aload_1         
		//   13   49:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
		//   14   52:pop             
				throw new RuntimeException(stringbuilder.toString());
		//   15   53:new             #50  <Class RuntimeException>
		//   16   56:dup             
		//   17   57:aload_2         
		//   18   58:invokevirtual   #54  <Method String StringBuilder.toString()>
		//   19   61:invokespecial   #57  <Method void RuntimeException(String)>
		//   20   64:athrow          

			case 3: // '\003'
				if(mDoubleTapListener != null)
		//*  21   65:aload_0         
		//*  22   66:getfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
		//*  23   69:getfield        #61  <Field android.view.GestureDetector$OnDoubleTapListener GestureDetectorCompat$GestureDetectorCompatImplBase.mDoubleTapListener>
		//*  24   72:ifnull          142
					if(!mStillDown)
		//*  25   75:aload_0         
		//*  26   76:getfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
		//*  27   79:getfield        #65  <Field boolean GestureDetectorCompat$GestureDetectorCompatImplBase.mStillDown>
		//*  28   82:ifne            106
					{
						mDoubleTapListener.onSingleTapConfirmed(mCurrentDownEvent);
		//   29   85:aload_0         
		//   30   86:getfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
		//   31   89:getfield        #61  <Field android.view.GestureDetector$OnDoubleTapListener GestureDetectorCompat$GestureDetectorCompatImplBase.mDoubleTapListener>
		//   32   92:aload_0         
		//   33   93:getfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
		//   34   96:getfield        #69  <Field MotionEvent GestureDetectorCompat$GestureDetectorCompatImplBase.mCurrentDownEvent>
		//   35   99:invokeinterface #75  <Method boolean android.view.GestureDetector$OnDoubleTapListener.onSingleTapConfirmed(MotionEvent)>
		//   36  104:pop             
						return;
		//   37  105:return          
					} else
					{
						mDeferConfirmSingleTap = true;
		//   38  106:aload_0         
		//   39  107:getfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
		//   40  110:iconst_1        
		//   41  111:putfield        #78  <Field boolean GestureDetectorCompat$GestureDetectorCompatImplBase.mDeferConfirmSingleTap>
						return;
		//   42  114:return          
					}
				break;

			case 2: // '\002'
				dispatchLongPress();
		//   43  115:aload_0         
		//   44  116:getfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
		//   45  119:invokevirtual   #81  <Method void GestureDetectorCompat$GestureDetectorCompatImplBase.dispatchLongPress()>
				return;
		//   46  122:return          

			case 1: // '\001'
				mListener.onShowPress(mCurrentDownEvent);
		//   47  123:aload_0         
		//   48  124:getfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
		//   49  127:getfield        #85  <Field android.view.GestureDetector$OnGestureListener GestureDetectorCompat$GestureDetectorCompatImplBase.mListener>
		//   50  130:aload_0         
		//   51  131:getfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
		//   52  134:getfield        #69  <Field MotionEvent GestureDetectorCompat$GestureDetectorCompatImplBase.mCurrentDownEvent>
		//   53  137:invokeinterface #91  <Method void android.view.GestureDetector$OnGestureListener.onShowPress(MotionEvent)>
				break;
			}
		//   54  142:return          
		}

		final GestureDetectorCompatImplBase this$0;

		GestureDetectorCompatImplBase.GestureHandler()
		{
			this$0 = GestureDetectorCompatImplBase.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void Handler()>
		//    5    9:return          
		}

		GestureDetectorCompatImplBase.GestureHandler(Handler handler)
		{
			this$0 = GestureDetectorCompatImplBase.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
			super(handler.getLooper());
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokevirtual   #25  <Method android.os.Looper Handler.getLooper()>
		//    6   10:invokespecial   #28  <Method void Handler(android.os.Looper)>
		//    7   13:return          
		}
	}

	static class GestureDetectorCompatImplJellybeanMr2
		implements GestureDetectorCompatImpl
	{

		public boolean isLongpressEnabled()
		{
			return mDetector.isLongpressEnabled();
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field GestureDetector mDetector>
		//    2    4:invokevirtual   #27  <Method boolean GestureDetector.isLongpressEnabled()>
		//    3    7:ireturn         
		}

		public boolean onTouchEvent(MotionEvent motionevent)
		{
			return mDetector.onTouchEvent(motionevent);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field GestureDetector mDetector>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #31  <Method boolean GestureDetector.onTouchEvent(MotionEvent)>
		//    4    8:ireturn         
		}

		public void setIsLongpressEnabled(boolean flag)
		{
			mDetector.setIsLongpressEnabled(flag);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field GestureDetector mDetector>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #35  <Method void GestureDetector.setIsLongpressEnabled(boolean)>
		//    4    8:return          
		}

		public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener)
		{
			mDetector.setOnDoubleTapListener(ondoubletaplistener);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field GestureDetector mDetector>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #39  <Method void GestureDetector.setOnDoubleTapListener(android.view.GestureDetector$OnDoubleTapListener)>
		//    4    8:return          
		}

		private final GestureDetector mDetector;

		GestureDetectorCompatImplJellybeanMr2(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener, Handler handler)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			mDetector = new GestureDetector(context, ongesturelistener, handler);
		//    2    4:aload_0         
		//    3    5:new             #18  <Class GestureDetector>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:aload_3         
		//    8   12:invokespecial   #20  <Method void GestureDetector(Context, android.view.GestureDetector$OnGestureListener, Handler)>
		//    9   15:putfield        #22  <Field GestureDetector mDetector>
		//   10   18:return          
		}
	}


	public GestureDetectorCompat(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener)
	{
		this(context, ongesturelistener, ((Handler) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #23  <Method void GestureDetectorCompat(Context, android.view.GestureDetector$OnGestureListener, Handler)>
	//    5    7:return          
	}

	public GestureDetectorCompat(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener, Handler handler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT > 17)
	//*   2    4:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          17
	//*   4    9:icmple          27
		{
			mImpl = ((GestureDetectorCompatImpl) (new GestureDetectorCompatImplJellybeanMr2(context, ongesturelistener, handler)));
	//    5   12:aload_0         
	//    6   13:new             #15  <Class GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2>
	//    7   16:dup             
	//    8   17:aload_1         
	//    9   18:aload_2         
	//   10   19:aload_3         
	//   11   20:invokespecial   #34  <Method void GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2(Context, android.view.GestureDetector$OnGestureListener, Handler)>
	//   12   23:putfield        #36  <Field GestureDetectorCompat$GestureDetectorCompatImpl mImpl>
			return;
	//   13   26:return          
		} else
		{
			mImpl = ((GestureDetectorCompatImpl) (new GestureDetectorCompatImplBase(context, ongesturelistener, handler)));
	//   14   27:aload_0         
	//   15   28:new             #9   <Class GestureDetectorCompat$GestureDetectorCompatImplBase>
	//   16   31:dup             
	//   17   32:aload_1         
	//   18   33:aload_2         
	//   19   34:aload_3         
	//   20   35:invokespecial   #37  <Method void GestureDetectorCompat$GestureDetectorCompatImplBase(Context, android.view.GestureDetector$OnGestureListener, Handler)>
	//   21   38:putfield        #36  <Field GestureDetectorCompat$GestureDetectorCompatImpl mImpl>
			return;
	//   22   41:return          
		}
	}

	public boolean isLongpressEnabled()
	{
		return mImpl.isLongpressEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field GestureDetectorCompat$GestureDetectorCompatImpl mImpl>
	//    2    4:invokeinterface #41  <Method boolean GestureDetectorCompat$GestureDetectorCompatImpl.isLongpressEnabled()>
	//    3    9:ireturn         
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		return mImpl.onTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field GestureDetectorCompat$GestureDetectorCompatImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #45  <Method boolean GestureDetectorCompat$GestureDetectorCompatImpl.onTouchEvent(MotionEvent)>
	//    4   10:ireturn         
	}

	public void setIsLongpressEnabled(boolean flag)
	{
		mImpl.setIsLongpressEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field GestureDetectorCompat$GestureDetectorCompatImpl mImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #49  <Method void GestureDetectorCompat$GestureDetectorCompatImpl.setIsLongpressEnabled(boolean)>
	//    4   10:return          
	}

	public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener)
	{
		mImpl.setOnDoubleTapListener(ondoubletaplistener);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field GestureDetectorCompat$GestureDetectorCompatImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #53  <Method void GestureDetectorCompat$GestureDetectorCompatImpl.setOnDoubleTapListener(android.view.GestureDetector$OnDoubleTapListener)>
	//    4   10:return          
	}

	private final GestureDetectorCompatImpl mImpl;
}
