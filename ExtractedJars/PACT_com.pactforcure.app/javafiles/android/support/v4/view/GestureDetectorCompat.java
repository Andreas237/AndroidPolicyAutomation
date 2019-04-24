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
		//*   8   15:getfield        #82  <Field android.view.GestureDetector$OnGestureListener mListener>
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
			if(mAlwaysInBiggerTapRegion && motionevent2.getEventTime() - motionevent1.getEventTime() <= (long)DOUBLE_TAP_TIMEOUT)
		//*   0    0:aload_0         
		//*   1    1:getfield        #117 <Field boolean mAlwaysInBiggerTapRegion>
		//*   2    4:ifne            9
		//*   3    7:iconst_0        
		//*   4    8:ireturn         
		//*   5    9:aload_3         
		//*   6   10:invokevirtual   #165 <Method long MotionEvent.getEventTime()>
		//*   7   13:aload_2         
		//*   8   14:invokevirtual   #165 <Method long MotionEvent.getEventTime()>
		//*   9   17:lsub            
		//*  10   18:getstatic       #70  <Field int DOUBLE_TAP_TIMEOUT>
		//*  11   21:i2l             
		//*  12   22:lcmp            
		//*  13   23:ifgt            7
			{
				int i = (int)motionevent.getX() - (int)motionevent2.getX();
		//   14   26:aload_1         
		//   15   27:invokevirtual   #169 <Method float MotionEvent.getX()>
		//   16   30:f2i             
		//   17   31:aload_3         
		//   18   32:invokevirtual   #169 <Method float MotionEvent.getX()>
		//   19   35:f2i             
		//   20   36:isub            
		//   21   37:istore          4
				int j = (int)motionevent.getY() - (int)motionevent2.getY();
		//   22   39:aload_1         
		//   23   40:invokevirtual   #172 <Method float MotionEvent.getY()>
		//   24   43:f2i             
		//   25   44:aload_3         
		//   26   45:invokevirtual   #172 <Method float MotionEvent.getY()>
		//   27   48:f2i             
		//   28   49:isub            
		//   29   50:istore          5
				if(i * i + j * j < mDoubleTapSlopSquare)
		//*  30   52:iload           4
		//*  31   54:iload           4
		//*  32   56:imul            
		//*  33   57:iload           5
		//*  34   59:iload           5
		//*  35   61:imul            
		//*  36   62:iadd            
		//*  37   63:aload_0         
		//*  38   64:getfield        #157 <Field int mDoubleTapSlopSquare>
		//*  39   67:icmpge          7
					return true;
		//   40   70:iconst_1        
		//   41   71:ireturn         
			}
			return false;
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
		//   11   19:getfield        #82  <Field android.view.GestureDetector$OnGestureListener mListener>
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
			int j1;
			int j2;
			boolean flag1;
			boolean flag2;
			boolean flag4;
			boolean flag5;
			int k2 = motionevent.getAction();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #188 <Method int MotionEvent.getAction()>
		//    2    4:istore          10
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
			boolean flag;
			int l1;
			if((k2 & 0xff) == 6)
		//*  13   28:iload           10
		//*  14   30:sipush          255
		//*  15   33:iand            
		//*  16   34:bipush          6
		//*  17   36:icmpne          89
				flag = true;
		//   18   39:iconst_1        
		//   19   40:istore          6
			else
		//*  20   42:iload           6
		//*  21   44:ifeq            95
		//*  22   47:aload_1         
		//*  23   48:invokevirtual   #198 <Method int MotionEvent.getActionIndex()>
		//*  24   51:istore          7
		//*  25   53:fconst_0        
		//*  26   54:fstore_3        
		//*  27   55:fconst_0        
		//*  28   56:fstore_2        
		//*  29   57:aload_1         
		//*  30   58:invokevirtual   #201 <Method int MotionEvent.getPointerCount()>
		//*  31   61:istore          9
		//*  32   63:iconst_0        
		//*  33   64:istore          8
		//*  34   66:iload           8
		//*  35   68:iload           9
		//*  36   70:icmpge          122
		//*  37   73:iload           7
		//*  38   75:iload           8
		//*  39   77:icmpne          101
		//*  40   80:iload           8
		//*  41   82:iconst_1        
		//*  42   83:iadd            
		//*  43   84:istore          8
		//*  44   86:goto            66
				flag = false;
		//   45   89:iconst_0        
		//   46   90:istore          6
			if(flag)
				j1 = motionevent.getActionIndex();
			else
		//*  47   92:goto            42
				j1 = -1;
		//   48   95:iconst_m1       
		//   49   96:istore          7
			f1 = 0.0F;
			f = 0.0F;
			j2 = motionevent.getPointerCount();
			l1 = 0;
			while(l1 < j2) 
			{
				if(j1 != l1)
		//*  50   98:goto            53
				{
					f1 += motionevent.getX(l1);
		//   51  101:fload_3         
		//   52  102:aload_1         
		//   53  103:iload           8
		//   54  105:invokevirtual   #204 <Method float MotionEvent.getX(int)>
		//   55  108:fadd            
		//   56  109:fstore_3        
					f += motionevent.getY(l1);
		//   57  110:fload_2         
		//   58  111:aload_1         
		//   59  112:iload           8
		//   60  114:invokevirtual   #206 <Method float MotionEvent.getY(int)>
		//   61  117:fadd            
		//   62  118:fstore_2        
				}
				l1++;
			}
		//*  63  119:goto            80
			int i;
			if(flag)
		//*  64  122:iload           6
		//*  65  124:ifeq            215
				i = j2 - 1;
		//   66  127:iload           9
		//   67  129:iconst_1        
		//   68  130:isub            
		//   69  131:istore          6
			else
		//*  70  133:fload_3         
		//*  71  134:iload           6
		//*  72  136:i2f             
		//*  73  137:fdiv            
		//*  74  138:fstore_3        
		//*  75  139:fload_2         
		//*  76  140:iload           6
		//*  77  142:i2f             
		//*  78  143:fdiv            
		//*  79  144:fstore_2        
		//*  80  145:iconst_0        
		//*  81  146:istore          7
		//*  82  148:iconst_0        
		//*  83  149:istore          13
		//*  84  151:iconst_0        
		//*  85  152:istore          14
		//*  86  154:iconst_0        
		//*  87  155:istore          11
		//*  88  157:iload           11
		//*  89  159:istore          12
		//*  90  161:iload           10
		//*  91  163:sipush          255
		//*  92  166:iand            
		//*  93  167:tableswitch     0 6: default 208
		//		               0 392
		//		               1 892
		//		               2 657
		//		               3 1171
		//		               4 212
		//		               5 222
		//		               6 248
		//*  94  208:iload           11
		//*  95  210:istore          12
		//*  96  212:iload           12
		//*  97  214:ireturn         
				i = j2;
		//   98  215:iload           9
		//   99  217:istore          6
			f1 /= i;
			f /= i;
			j1 = 0;
			flag4 = false;
			flag5 = false;
			flag1 = false;
			flag2 = flag1;
			k2 & 0xff;
			JVM INSTR tableswitch 0 6: default 208
		//		               0 392
		//		               1 892
		//		               2 657
		//		               3 1171
		//		               4 212
		//		               5 222
		//		               6 248;
			   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
			flag2 = flag1;
_L6:
			return flag2;
		//* 100  219:goto            133
_L7:
			mLastFocusX = f1;
		//  101  222:aload_0         
		//  102  223:fload_3         
		//  103  224:putfield        #208 <Field float mLastFocusX>
			mDownFocusX = f1;
		//  104  227:aload_0         
		//  105  228:fload_3         
		//  106  229:putfield        #210 <Field float mDownFocusX>
			mLastFocusY = f;
		//  107  232:aload_0         
		//  108  233:fload_2         
		//  109  234:putfield        #212 <Field float mLastFocusY>
			mDownFocusY = f;
		//  110  237:aload_0         
		//  111  238:fload_2         
		//  112  239:putfield        #214 <Field float mDownFocusY>
			cancelTaps();
		//  113  242:aload_0         
		//  114  243:invokespecial   #216 <Method void cancelTaps()>
			return false;
		//  115  246:iconst_0        
		//  116  247:ireturn         
_L8:
			int j;
			mLastFocusX = f1;
		//  117  248:aload_0         
		//  118  249:fload_3         
		//  119  250:putfield        #208 <Field float mLastFocusX>
			mDownFocusX = f1;
		//  120  253:aload_0         
		//  121  254:fload_3         
		//  122  255:putfield        #210 <Field float mDownFocusX>
			mLastFocusY = f;
		//  123  258:aload_0         
		//  124  259:fload_2         
		//  125  260:putfield        #212 <Field float mLastFocusY>
			mDownFocusY = f;
		//  126  263:aload_0         
		//  127  264:fload_2         
		//  128  265:putfield        #214 <Field float mDownFocusY>
			mVelocityTracker.computeCurrentVelocity(1000, mMaximumFlingVelocity);
		//  129  268:aload_0         
		//  130  269:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//  131  272:sipush          1000
		//  132  275:aload_0         
		//  133  276:getfield        #153 <Field int mMaximumFlingVelocity>
		//  134  279:i2f             
		//  135  280:invokevirtual   #220 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
			j1 = motionevent.getActionIndex();
		//  136  283:aload_1         
		//  137  284:invokevirtual   #198 <Method int MotionEvent.getActionIndex()>
		//  138  287:istore          7
			j = motionevent.getPointerId(j1);
		//  139  289:aload_1         
		//  140  290:iload           7
		//  141  292:invokevirtual   #224 <Method int MotionEvent.getPointerId(int)>
		//  142  295:istore          6
			f = mVelocityTracker.getXVelocity(j);
		//  143  297:aload_0         
		//  144  298:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//  145  301:iload           6
		//  146  303:invokevirtual   #227 <Method float VelocityTracker.getXVelocity(int)>
		//  147  306:fstore_2        
			f1 = mVelocityTracker.getYVelocity(j);
		//  148  307:aload_0         
		//  149  308:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//  150  311:iload           6
		//  151  313:invokevirtual   #230 <Method float VelocityTracker.getYVelocity(int)>
		//  152  316:fstore_3        
			j = 0;
		//  153  317:iconst_0        
		//  154  318:istore          6
_L10:
			flag2 = flag1;
		//  155  320:iload           11
		//  156  322:istore          12
			if(j >= j2)
				continue; /* Loop/switch isn't completed */
		//  157  324:iload           6
		//  158  326:iload           9
		//  159  328:icmpge          212
			if(j != j1)
				break; /* Loop/switch isn't completed */
		//  160  331:iload           6
		//  161  333:iload           7
		//  162  335:icmpne          347
_L12:
			j++;
		//  163  338:iload           6
		//  164  340:iconst_1        
		//  165  341:iadd            
		//  166  342:istore          6
			int i2;
			if(true) goto _L10; else goto _L9
		//  167  344:goto            320
		//* 168  347:aload_1         
		//* 169  348:iload           6
		//* 170  350:invokevirtual   #224 <Method int MotionEvent.getPointerId(int)>
		//* 171  353:istore          8
_L9:
			if(f * mVelocityTracker.getXVelocity(i2 = motionevent.getPointerId(j)) + f1 * mVelocityTracker.getYVelocity(i2) >= 0.0F) goto _L12; else goto _L11
		//  172  355:fload_2         
		//  173  356:aload_0         
		//  174  357:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//  175  360:iload           8
		//  176  362:invokevirtual   #227 <Method float VelocityTracker.getXVelocity(int)>
		//  177  365:fmul            
		//  178  366:fload_3         
		//  179  367:aload_0         
		//  180  368:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//  181  371:iload           8
		//  182  373:invokevirtual   #230 <Method float VelocityTracker.getYVelocity(int)>
		//  183  376:fmul            
		//  184  377:fadd            
		//  185  378:fconst_0        
		//  186  379:fcmpg           
		//  187  380:ifge            338
_L11:
			mVelocityTracker.clear();
		//  188  383:aload_0         
		//  189  384:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//  190  387:invokevirtual   #233 <Method void VelocityTracker.clear()>
			return false;
		//  191  390:iconst_0        
		//  192  391:ireturn         
_L2:
			int k = j1;
		//  193  392:iload           7
		//  194  394:istore          6
			if(mDoubleTapListener != null)
		//* 195  396:aload_0         
		//* 196  397:getfield        #235 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
		//* 197  400:ifnull          494
			{
				flag1 = mHandler.hasMessages(3);
		//  198  403:aload_0         
		//  199  404:getfield        #80  <Field Handler mHandler>
		//  200  407:iconst_3        
		//  201  408:invokevirtual   #239 <Method boolean Handler.hasMessages(int)>
		//  202  411:istore          11
				if(flag1)
		//* 203  413:iload           11
		//* 204  415:ifeq            426
					mHandler.removeMessages(3);
		//  205  418:aload_0         
		//  206  419:getfield        #80  <Field Handler mHandler>
		//  207  422:iconst_3        
		//  208  423:invokevirtual   #102 <Method void Handler.removeMessages(int)>
				if(mCurrentDownEvent != null && mPreviousUpEvent != null && flag1 && isConsideredDoubleTap(mCurrentDownEvent, mPreviousUpEvent, motionevent))
		//* 209  426:aload_0         
		//* 210  427:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//* 211  430:ifnull          637
		//* 212  433:aload_0         
		//* 213  434:getfield        #241 <Field MotionEvent mPreviousUpEvent>
		//* 214  437:ifnull          637
		//* 215  440:iload           11
		//* 216  442:ifeq            637
		//* 217  445:aload_0         
		//* 218  446:aload_0         
		//* 219  447:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//* 220  450:aload_0         
		//* 221  451:getfield        #241 <Field MotionEvent mPreviousUpEvent>
		//* 222  454:aload_1         
		//* 223  455:invokespecial   #243 <Method boolean isConsideredDoubleTap(MotionEvent, MotionEvent, MotionEvent)>
		//* 224  458:ifeq            637
				{
					mIsDoubleTapping = true;
		//  225  461:aload_0         
		//  226  462:iconst_1        
		//  227  463:putfield        #111 <Field boolean mIsDoubleTapping>
					k = ((int) (false | mDoubleTapListener.onDoubleTap(mCurrentDownEvent) | mDoubleTapListener.onDoubleTapEvent(motionevent)));
		//  228  466:iconst_0        
		//  229  467:aload_0         
		//  230  468:getfield        #235 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
		//  231  471:aload_0         
		//  232  472:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//  233  475:invokeinterface #246 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onDoubleTap(MotionEvent)>
		//  234  480:ior             
		//  235  481:aload_0         
		//  236  482:getfield        #235 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
		//  237  485:aload_1         
		//  238  486:invokeinterface #249 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onDoubleTapEvent(MotionEvent)>
		//  239  491:ior             
		//  240  492:istore          6
				} else
		//* 241  494:aload_0         
		//* 242  495:fload_3         
		//* 243  496:putfield        #208 <Field float mLastFocusX>
		//* 244  499:aload_0         
		//* 245  500:fload_3         
		//* 246  501:putfield        #210 <Field float mDownFocusX>
		//* 247  504:aload_0         
		//* 248  505:fload_2         
		//* 249  506:putfield        #212 <Field float mLastFocusY>
		//* 250  509:aload_0         
		//* 251  510:fload_2         
		//* 252  511:putfield        #214 <Field float mDownFocusY>
		//* 253  514:aload_0         
		//* 254  515:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//* 255  518:ifnull          528
		//* 256  521:aload_0         
		//* 257  522:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//* 258  525:invokevirtual   #250 <Method void MotionEvent.recycle()>
		//* 259  528:aload_0         
		//* 260  529:aload_1         
		//* 261  530:invokestatic    #253 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
		//* 262  533:putfield        #175 <Field MotionEvent mCurrentDownEvent>
		//* 263  536:aload_0         
		//* 264  537:iconst_1        
		//* 265  538:putfield        #115 <Field boolean mAlwaysInTapRegion>
		//* 266  541:aload_0         
		//* 267  542:iconst_1        
		//* 268  543:putfield        #117 <Field boolean mAlwaysInBiggerTapRegion>
		//* 269  546:aload_0         
		//* 270  547:iconst_1        
		//* 271  548:putfield        #113 <Field boolean mStillDown>
		//* 272  551:aload_0         
		//* 273  552:iconst_0        
		//* 274  553:putfield        #121 <Field boolean mInLongPress>
		//* 275  556:aload_0         
		//* 276  557:iconst_0        
		//* 277  558:putfield        #119 <Field boolean mDeferConfirmSingleTap>
		//* 278  561:aload_0         
		//* 279  562:getfield        #133 <Field boolean mIsLongpressEnabled>
		//* 280  565:ifeq            602
		//* 281  568:aload_0         
		//* 282  569:getfield        #80  <Field Handler mHandler>
		//* 283  572:iconst_2        
		//* 284  573:invokevirtual   #102 <Method void Handler.removeMessages(int)>
		//* 285  576:aload_0         
		//* 286  577:getfield        #80  <Field Handler mHandler>
		//* 287  580:iconst_2        
		//* 288  581:aload_0         
		//* 289  582:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//* 290  585:invokevirtual   #256 <Method long MotionEvent.getDownTime()>
		//* 291  588:getstatic       #65  <Field int TAP_TIMEOUT>
		//* 292  591:i2l             
		//* 293  592:ladd            
		//* 294  593:getstatic       #60  <Field int LONGPRESS_TIMEOUT>
		//* 295  596:i2l             
		//* 296  597:ladd            
		//* 297  598:invokevirtual   #260 <Method boolean Handler.sendEmptyMessageAtTime(int, long)>
		//* 298  601:pop             
		//* 299  602:aload_0         
		//* 300  603:getfield        #80  <Field Handler mHandler>
		//* 301  606:iconst_1        
		//* 302  607:aload_0         
		//* 303  608:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//* 304  611:invokevirtual   #256 <Method long MotionEvent.getDownTime()>
		//* 305  614:getstatic       #65  <Field int TAP_TIMEOUT>
		//* 306  617:i2l             
		//* 307  618:ladd            
		//* 308  619:invokevirtual   #260 <Method boolean Handler.sendEmptyMessageAtTime(int, long)>
		//* 309  622:pop             
		//* 310  623:iload           6
		//* 311  625:aload_0         
		//* 312  626:getfield        #82  <Field android.view.GestureDetector$OnGestureListener mListener>
		//* 313  629:aload_1         
		//* 314  630:invokeinterface #263 <Method boolean android.view.GestureDetector$OnGestureListener.onDown(MotionEvent)>
		//* 315  635:ior             
		//* 316  636:ireturn         
				{
					mHandler.sendEmptyMessageDelayed(3, DOUBLE_TAP_TIMEOUT);
		//  317  637:aload_0         
		//  318  638:getfield        #80  <Field Handler mHandler>
		//  319  641:iconst_3        
		//  320  642:getstatic       #70  <Field int DOUBLE_TAP_TIMEOUT>
		//  321  645:i2l             
		//  322  646:invokevirtual   #266 <Method boolean Handler.sendEmptyMessageDelayed(int, long)>
		//  323  649:pop             
					k = j1;
		//  324  650:iload           7
		//  325  652:istore          6
				}
			}
			mLastFocusX = f1;
			mDownFocusX = f1;
			mLastFocusY = f;
			mDownFocusY = f;
			if(mCurrentDownEvent != null)
				mCurrentDownEvent.recycle();
			mCurrentDownEvent = MotionEvent.obtain(motionevent);
			mAlwaysInTapRegion = true;
			mAlwaysInBiggerTapRegion = true;
			mStillDown = true;
			mInLongPress = false;
			mDeferConfirmSingleTap = false;
			if(mIsLongpressEnabled)
			{
				mHandler.removeMessages(2);
				mHandler.sendEmptyMessageAtTime(2, mCurrentDownEvent.getDownTime() + (long)TAP_TIMEOUT + (long)LONGPRESS_TIMEOUT);
			}
			mHandler.sendEmptyMessageAtTime(1, mCurrentDownEvent.getDownTime() + (long)TAP_TIMEOUT);
			return ((boolean) (k | mListener.onDown(motionevent)));
		//* 326  654:goto            494
_L4:
			float f2;
			float f3;
			flag2 = flag1;
		//  327  657:iload           11
		//  328  659:istore          12
			if(mInLongPress)
				continue; /* Loop/switch isn't completed */
		//  329  661:aload_0         
		//  330  662:getfield        #121 <Field boolean mInLongPress>
		//  331  665:ifne            212
			f2 = mLastFocusX - f1;
		//  332  668:aload_0         
		//  333  669:getfield        #208 <Field float mLastFocusX>
		//  334  672:fload_3         
		//  335  673:fsub            
		//  336  674:fstore          4
			f3 = mLastFocusY - f;
		//  337  676:aload_0         
		//  338  677:getfield        #212 <Field float mLastFocusY>
		//  339  680:fload_2         
		//  340  681:fsub            
		//  341  682:fstore          5
			if(mIsDoubleTapping)
		//* 342  684:aload_0         
		//* 343  685:getfield        #111 <Field boolean mIsDoubleTapping>
		//* 344  688:ifeq            704
				return false | mDoubleTapListener.onDoubleTapEvent(motionevent);
		//  345  691:iconst_0        
		//  346  692:aload_0         
		//  347  693:getfield        #235 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
		//  348  696:aload_1         
		//  349  697:invokeinterface #249 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onDoubleTapEvent(MotionEvent)>
		//  350  702:ior             
		//  351  703:ireturn         
			if(!mAlwaysInTapRegion)
				break; /* Loop/switch isn't completed */
		//  352  704:aload_0         
		//  353  705:getfield        #115 <Field boolean mAlwaysInTapRegion>
		//  354  708:ifeq            835
			int l = (int)(f1 - mDownFocusX);
		//  355  711:fload_3         
		//  356  712:aload_0         
		//  357  713:getfield        #210 <Field float mDownFocusX>
		//  358  716:fsub            
		//  359  717:f2i             
		//  360  718:istore          6
			int k1 = (int)(f - mDownFocusY);
		//  361  720:fload_2         
		//  362  721:aload_0         
		//  363  722:getfield        #214 <Field float mDownFocusY>
		//  364  725:fsub            
		//  365  726:f2i             
		//  366  727:istore          7
			l = l * l + k1 * k1;
		//  367  729:iload           6
		//  368  731:iload           6
		//  369  733:imul            
		//  370  734:iload           7
		//  371  736:iload           7
		//  372  738:imul            
		//  373  739:iadd            
		//  374  740:istore          6
			flag1 = flag4;
		//  375  742:iload           13
		//  376  744:istore          11
			if(l > mTouchSlopSquare)
		//* 377  746:iload           6
		//* 378  748:aload_0         
		//* 379  749:getfield        #155 <Field int mTouchSlopSquare>
		//* 380  752:icmple          814
			{
				flag1 = mListener.onScroll(mCurrentDownEvent, motionevent, f2, f3);
		//  381  755:aload_0         
		//  382  756:getfield        #82  <Field android.view.GestureDetector$OnGestureListener mListener>
		//  383  759:aload_0         
		//  384  760:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//  385  763:aload_1         
		//  386  764:fload           4
		//  387  766:fload           5
		//  388  768:invokeinterface #270 <Method boolean android.view.GestureDetector$OnGestureListener.onScroll(MotionEvent, MotionEvent, float, float)>
		//  389  773:istore          11
				mLastFocusX = f1;
		//  390  775:aload_0         
		//  391  776:fload_3         
		//  392  777:putfield        #208 <Field float mLastFocusX>
				mLastFocusY = f;
		//  393  780:aload_0         
		//  394  781:fload_2         
		//  395  782:putfield        #212 <Field float mLastFocusY>
				mAlwaysInTapRegion = false;
		//  396  785:aload_0         
		//  397  786:iconst_0        
		//  398  787:putfield        #115 <Field boolean mAlwaysInTapRegion>
				mHandler.removeMessages(3);
		//  399  790:aload_0         
		//  400  791:getfield        #80  <Field Handler mHandler>
		//  401  794:iconst_3        
		//  402  795:invokevirtual   #102 <Method void Handler.removeMessages(int)>
				mHandler.removeMessages(1);
		//  403  798:aload_0         
		//  404  799:getfield        #80  <Field Handler mHandler>
		//  405  802:iconst_1        
		//  406  803:invokevirtual   #102 <Method void Handler.removeMessages(int)>
				mHandler.removeMessages(2);
		//  407  806:aload_0         
		//  408  807:getfield        #80  <Field Handler mHandler>
		//  409  810:iconst_2        
		//  410  811:invokevirtual   #102 <Method void Handler.removeMessages(int)>
			}
			flag2 = flag1;
		//  411  814:iload           11
		//  412  816:istore          12
			if(l > mTouchSlopSquare)
		//* 413  818:iload           6
		//* 414  820:aload_0         
		//* 415  821:getfield        #155 <Field int mTouchSlopSquare>
		//* 416  824:icmple          212
			{
				mAlwaysInBiggerTapRegion = false;
		//  417  827:aload_0         
		//  418  828:iconst_0        
		//  419  829:putfield        #117 <Field boolean mAlwaysInBiggerTapRegion>
				return flag1;
		//  420  832:iload           11
		//  421  834:ireturn         
			}
			if(true) goto _L6; else goto _L13
_L13:
			if(Math.abs(f2) >= 1.0F)
				break; /* Loop/switch isn't completed */
		//  422  835:fload           4
		//  423  837:invokestatic    #276 <Method float Math.abs(float)>
		//  424  840:fconst_1        
		//  425  841:fcmpl           
		//  426  842:ifge            859
			flag2 = flag1;
		//  427  845:iload           11
		//  428  847:istore          12
			if(Math.abs(f3) < 1.0F) goto _L6; else goto _L14
		//  429  849:fload           5
		//  430  851:invokestatic    #276 <Method float Math.abs(float)>
		//  431  854:fconst_1        
		//  432  855:fcmpl           
		//  433  856:iflt            212
_L14:
			flag1 = mListener.onScroll(mCurrentDownEvent, motionevent, f2, f3);
		//  434  859:aload_0         
		//  435  860:getfield        #82  <Field android.view.GestureDetector$OnGestureListener mListener>
		//  436  863:aload_0         
		//  437  864:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//  438  867:aload_1         
		//  439  868:fload           4
		//  440  870:fload           5
		//  441  872:invokeinterface #270 <Method boolean android.view.GestureDetector$OnGestureListener.onScroll(MotionEvent, MotionEvent, float, float)>
		//  442  877:istore          11
			mLastFocusX = f1;
		//  443  879:aload_0         
		//  444  880:fload_3         
		//  445  881:putfield        #208 <Field float mLastFocusX>
			mLastFocusY = f;
		//  446  884:aload_0         
		//  447  885:fload_2         
		//  448  886:putfield        #212 <Field float mLastFocusY>
			return flag1;
		//  449  889:iload           11
		//  450  891:ireturn         
_L3:
			MotionEvent motionevent1;
			mStillDown = false;
		//  451  892:aload_0         
		//  452  893:iconst_0        
		//  453  894:putfield        #113 <Field boolean mStillDown>
			motionevent1 = MotionEvent.obtain(motionevent);
		//  454  897:aload_1         
		//  455  898:invokestatic    #253 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
		//  456  901:astore          15
			if(!mIsDoubleTapping) goto _L16; else goto _L15
		//  457  903:aload_0         
		//  458  904:getfield        #111 <Field boolean mIsDoubleTapping>
		//  459  907:ifeq            992
_L15:
			flag1 = false | mDoubleTapListener.onDoubleTapEvent(motionevent);
		//  460  910:iconst_0        
		//  461  911:aload_0         
		//  462  912:getfield        #235 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
		//  463  915:aload_1         
		//  464  916:invokeinterface #249 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onDoubleTapEvent(MotionEvent)>
		//  465  921:ior             
		//  466  922:istore          11
_L19:
			if(mPreviousUpEvent != null)
		//* 467  924:aload_0         
		//* 468  925:getfield        #241 <Field MotionEvent mPreviousUpEvent>
		//* 469  928:ifnull          938
				mPreviousUpEvent.recycle();
		//  470  931:aload_0         
		//  471  932:getfield        #241 <Field MotionEvent mPreviousUpEvent>
		//  472  935:invokevirtual   #250 <Method void MotionEvent.recycle()>
			mPreviousUpEvent = motionevent1;
		//  473  938:aload_0         
		//  474  939:aload           15
		//  475  941:putfield        #241 <Field MotionEvent mPreviousUpEvent>
			if(mVelocityTracker != null)
		//* 476  944:aload_0         
		//* 477  945:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//* 478  948:ifnull          963
			{
				mVelocityTracker.recycle();
		//  479  951:aload_0         
		//  480  952:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//  481  955:invokevirtual   #109 <Method void VelocityTracker.recycle()>
				mVelocityTracker = null;
		//  482  958:aload_0         
		//  483  959:aconst_null     
		//  484  960:putfield        #104 <Field VelocityTracker mVelocityTracker>
			}
			mIsDoubleTapping = false;
		//  485  963:aload_0         
		//  486  964:iconst_0        
		//  487  965:putfield        #111 <Field boolean mIsDoubleTapping>
			mDeferConfirmSingleTap = false;
		//  488  968:aload_0         
		//  489  969:iconst_0        
		//  490  970:putfield        #119 <Field boolean mDeferConfirmSingleTap>
			mHandler.removeMessages(1);
		//  491  973:aload_0         
		//  492  974:getfield        #80  <Field Handler mHandler>
		//  493  977:iconst_1        
		//  494  978:invokevirtual   #102 <Method void Handler.removeMessages(int)>
			mHandler.removeMessages(2);
		//  495  981:aload_0         
		//  496  982:getfield        #80  <Field Handler mHandler>
		//  497  985:iconst_2        
		//  498  986:invokevirtual   #102 <Method void Handler.removeMessages(int)>
			return flag1;
		//  499  989:iload           11
		//  500  991:ireturn         
_L16:
			if(!mInLongPress) goto _L18; else goto _L17
		//  501  992:aload_0         
		//  502  993:getfield        #121 <Field boolean mInLongPress>
		//  503  996:ifeq            1019
_L17:
			mHandler.removeMessages(3);
		//  504  999:aload_0         
		//  505 1000:getfield        #80  <Field Handler mHandler>
		//  506 1003:iconst_3        
		//  507 1004:invokevirtual   #102 <Method void Handler.removeMessages(int)>
			mInLongPress = false;
		//  508 1007:aload_0         
		//  509 1008:iconst_0        
		//  510 1009:putfield        #121 <Field boolean mInLongPress>
			flag1 = flag5;
		//  511 1012:iload           14
		//  512 1014:istore          11
			  goto _L19
		//* 513 1016:goto            924
_L18:
			if(!mAlwaysInTapRegion) goto _L21; else goto _L20
		//  514 1019:aload_0         
		//  515 1020:getfield        #115 <Field boolean mAlwaysInTapRegion>
		//  516 1023:ifeq            1078
_L20:
			boolean flag3 = mListener.onSingleTapUp(motionevent);
		//  517 1026:aload_0         
		//  518 1027:getfield        #82  <Field android.view.GestureDetector$OnGestureListener mListener>
		//  519 1030:aload_1         
		//  520 1031:invokeinterface #279 <Method boolean android.view.GestureDetector$OnGestureListener.onSingleTapUp(MotionEvent)>
		//  521 1036:istore          12
			flag1 = flag3;
		//  522 1038:iload           12
		//  523 1040:istore          11
			if(mDeferConfirmSingleTap)
		//* 524 1042:aload_0         
		//* 525 1043:getfield        #119 <Field boolean mDeferConfirmSingleTap>
		//* 526 1046:ifeq            924
			{
				flag1 = flag3;
		//  527 1049:iload           12
		//  528 1051:istore          11
				if(mDoubleTapListener != null)
		//* 529 1053:aload_0         
		//* 530 1054:getfield        #235 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
		//* 531 1057:ifnull          924
				{
					mDoubleTapListener.onSingleTapConfirmed(motionevent);
		//  532 1060:aload_0         
		//  533 1061:getfield        #235 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
		//  534 1064:aload_1         
		//  535 1065:invokeinterface #282 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onSingleTapConfirmed(MotionEvent)>
		//  536 1070:pop             
					flag1 = flag3;
		//  537 1071:iload           12
		//  538 1073:istore          11
				}
			}
			  goto _L19
		//* 539 1075:goto            924
_L21:
			VelocityTracker velocitytracker = mVelocityTracker;
		//  540 1078:aload_0         
		//  541 1079:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//  542 1082:astore          16
			int i1 = motionevent.getPointerId(0);
		//  543 1084:aload_1         
		//  544 1085:iconst_0        
		//  545 1086:invokevirtual   #224 <Method int MotionEvent.getPointerId(int)>
		//  546 1089:istore          6
			velocitytracker.computeCurrentVelocity(1000, mMaximumFlingVelocity);
		//  547 1091:aload           16
		//  548 1093:sipush          1000
		//  549 1096:aload_0         
		//  550 1097:getfield        #153 <Field int mMaximumFlingVelocity>
		//  551 1100:i2f             
		//  552 1101:invokevirtual   #220 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
			f = velocitytracker.getYVelocity(i1);
		//  553 1104:aload           16
		//  554 1106:iload           6
		//  555 1108:invokevirtual   #230 <Method float VelocityTracker.getYVelocity(int)>
		//  556 1111:fstore_2        
			f1 = velocitytracker.getXVelocity(i1);
		//  557 1112:aload           16
		//  558 1114:iload           6
		//  559 1116:invokevirtual   #227 <Method float VelocityTracker.getXVelocity(int)>
		//  560 1119:fstore_3        
			if(Math.abs(f) > (float)mMinimumFlingVelocity) goto _L23; else goto _L22
		//  561 1120:fload_2         
		//  562 1121:invokestatic    #276 <Method float Math.abs(float)>
		//  563 1124:aload_0         
		//  564 1125:getfield        #148 <Field int mMinimumFlingVelocity>
		//  565 1128:i2f             
		//  566 1129:fcmpl           
		//  567 1130:ifgt            1150
_L22:
			flag1 = flag5;
		//  568 1133:iload           14
		//  569 1135:istore          11
			if(Math.abs(f1) <= (float)mMinimumFlingVelocity) goto _L19; else goto _L23
		//  570 1137:fload_3         
		//  571 1138:invokestatic    #276 <Method float Math.abs(float)>
		//  572 1141:aload_0         
		//  573 1142:getfield        #148 <Field int mMinimumFlingVelocity>
		//  574 1145:i2f             
		//  575 1146:fcmpl           
		//  576 1147:ifle            924
_L23:
			flag1 = mListener.onFling(mCurrentDownEvent, motionevent, f1, f);
		//  577 1150:aload_0         
		//  578 1151:getfield        #82  <Field android.view.GestureDetector$OnGestureListener mListener>
		//  579 1154:aload_0         
		//  580 1155:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//  581 1158:aload_1         
		//  582 1159:fload_3         
		//  583 1160:fload_2         
		//  584 1161:invokeinterface #285 <Method boolean android.view.GestureDetector$OnGestureListener.onFling(MotionEvent, MotionEvent, float, float)>
		//  585 1166:istore          11
			  goto _L19
		//* 586 1168:goto            924
_L5:
			cancel();
		//  587 1171:aload_0         
		//  588 1172:invokespecial   #287 <Method void cancel()>
			return false;
		//  589 1175:iconst_0        
		//  590 1176:ireturn         
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
		//    2    2:putfield        #235 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
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

		public GestureDetectorCompatImplBase(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener, Handler handler)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #75  <Method void Object()>
			if(handler != null)
		//*   2    4:aload_3         
		//*   3    5:ifnull          47
				mHandler = ((Handler) (new GestureHandler(handler)));
		//    4    8:aload_0         
		//    5    9:new             #11  <Class GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler>
		//    6   12:dup             
		//    7   13:aload_0         
		//    8   14:aload_3         
		//    9   15:invokespecial   #78  <Method void GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler(GestureDetectorCompat$GestureDetectorCompatImplBase, Handler)>
		//   10   18:putfield        #80  <Field Handler mHandler>
			else
		//*  11   21:aload_0         
		//*  12   22:aload_2         
		//*  13   23:putfield        #82  <Field android.view.GestureDetector$OnGestureListener mListener>
		//*  14   26:aload_2         
		//*  15   27:instanceof      #84  <Class android.view.GestureDetector$OnDoubleTapListener>
		//*  16   30:ifeq            41
		//*  17   33:aload_0         
		//*  18   34:aload_2         
		//*  19   35:checkcast       #84  <Class android.view.GestureDetector$OnDoubleTapListener>
		//*  20   38:invokevirtual   #88  <Method void setOnDoubleTapListener(android.view.GestureDetector$OnDoubleTapListener)>
		//*  21   41:aload_0         
		//*  22   42:aload_1         
		//*  23   43:invokespecial   #92  <Method void init(Context)>
		//*  24   46:return          
				mHandler = ((Handler) (new GestureHandler()));
		//   25   47:aload_0         
		//   26   48:new             #11  <Class GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler>
		//   27   51:dup             
		//   28   52:aload_0         
		//   29   53:invokespecial   #95  <Method void GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler(GestureDetectorCompat$GestureDetectorCompatImplBase)>
		//   30   56:putfield        #80  <Field Handler mHandler>
			mListener = ongesturelistener;
			if(ongesturelistener instanceof android.view.GestureDetector.OnDoubleTapListener)
				setOnDoubleTapListener((android.view.GestureDetector.OnDoubleTapListener)ongesturelistener);
			init(context);
		//*  31   59:goto            21
		}
	}

	private class GestureDetectorCompatImplBase.GestureHandler extends Handler
	{

		public void handleMessage(Message message)
		{
			message.what;
		//    0    0:aload_1         
		//    1    1:getfield        #36  <Field int Message.what>
			JVM INSTR tableswitch 1 3: default 32
		//		               1 59
		//		               2 79
		//		               3 87;
		//    2    4:tableswitch     1 3: default 32
		//		               1 59
		//		               2 79
		//		               3 87
			   goto _L1 _L2 _L3 _L4
_L1:
			throw new RuntimeException((new StringBuilder()).append("Unknown message ").append(((Object) (message))).toString());
		//    3   32:new             #38  <Class RuntimeException>
		//    4   35:dup             
		//    5   36:new             #40  <Class StringBuilder>
		//    6   39:dup             
		//    7   40:invokespecial   #41  <Method void StringBuilder()>
		//    8   43:ldc1            #43  <String "Unknown message ">
		//    9   45:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   10   48:aload_1         
		//   11   49:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
		//   12   52:invokevirtual   #54  <Method String StringBuilder.toString()>
		//   13   55:invokespecial   #57  <Method void RuntimeException(String)>
		//   14   58:athrow          
_L2:
			mListener.onShowPress(mCurrentDownEvent);
		//   15   59:aload_0         
		//   16   60:getfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
		//   17   63:getfield        #61  <Field android.view.GestureDetector$OnGestureListener GestureDetectorCompat$GestureDetectorCompatImplBase.mListener>
		//   18   66:aload_0         
		//   19   67:getfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
		//   20   70:getfield        #65  <Field MotionEvent GestureDetectorCompat$GestureDetectorCompatImplBase.mCurrentDownEvent>
		//   21   73:invokeinterface #71  <Method void android.view.GestureDetector$OnGestureListener.onShowPress(MotionEvent)>
_L6:
			return;
		//   22   78:return          
_L3:
			dispatchLongPress();
		//   23   79:aload_0         
		//   24   80:getfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
		//   25   83:invokevirtual   #74  <Method void GestureDetectorCompat$GestureDetectorCompatImplBase.dispatchLongPress()>
			return;
		//   26   86:return          
_L4:
			if(mDoubleTapListener != null)
		//*  27   87:aload_0         
		//*  28   88:getfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
		//*  29   91:getfield        #78  <Field android.view.GestureDetector$OnDoubleTapListener GestureDetectorCompat$GestureDetectorCompatImplBase.mDoubleTapListener>
		//*  30   94:ifnull          78
				if(!mStillDown)
		//*  31   97:aload_0         
		//*  32   98:getfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
		//*  33  101:getfield        #82  <Field boolean GestureDetectorCompat$GestureDetectorCompatImplBase.mStillDown>
		//*  34  104:ifne            128
				{
					mDoubleTapListener.onSingleTapConfirmed(mCurrentDownEvent);
		//   35  107:aload_0         
		//   36  108:getfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
		//   37  111:getfield        #78  <Field android.view.GestureDetector$OnDoubleTapListener GestureDetectorCompat$GestureDetectorCompatImplBase.mDoubleTapListener>
		//   38  114:aload_0         
		//   39  115:getfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
		//   40  118:getfield        #65  <Field MotionEvent GestureDetectorCompat$GestureDetectorCompatImplBase.mCurrentDownEvent>
		//   41  121:invokeinterface #88  <Method boolean android.view.GestureDetector$OnDoubleTapListener.onSingleTapConfirmed(MotionEvent)>
		//   42  126:pop             
					return;
		//   43  127:return          
				} else
				{
					mDeferConfirmSingleTap = true;
		//   44  128:aload_0         
		//   45  129:getfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
		//   46  132:iconst_1        
		//   47  133:putfield        #91  <Field boolean GestureDetectorCompat$GestureDetectorCompatImplBase.mDeferConfirmSingleTap>
					return;
		//   48  136:return          
				}
			if(true) goto _L6; else goto _L5
_L5:
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

		public GestureDetectorCompatImplJellybeanMr2(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener, Handler handler)
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
