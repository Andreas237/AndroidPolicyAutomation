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
			int i2;
			int j2 = motionevent.getAction();
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
			int l;
			int k1;
			if((j2 & 0xff) == 6)
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
		//*  25   53:aload_1         
		//*  26   54:invokevirtual   #201 <Method int MotionEvent.getPointerCount()>
		//*  27   57:istore          9
		//*  28   59:iconst_0        
		//*  29   60:istore          8
		//*  30   62:fconst_0        
		//*  31   63:fstore_2        
		//*  32   64:fconst_0        
		//*  33   65:fstore_3        
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
				l = motionevent.getActionIndex();
			else
		//*  47   92:goto            42
				l = -1;
		//   48   95:iconst_m1       
		//   49   96:istore          7
			i2 = motionevent.getPointerCount();
			k1 = 0;
			f = 0.0F;
			f1 = 0.0F;
			while(k1 < i2) 
			{
				if(l != k1)
		//*  50   98:goto            53
				{
					f1 += motionevent.getX(k1);
		//   51  101:fload_3         
		//   52  102:aload_1         
		//   53  103:iload           8
		//   54  105:invokevirtual   #204 <Method float MotionEvent.getX(int)>
		//   55  108:fadd            
		//   56  109:fstore_3        
					f += motionevent.getY(k1);
		//   57  110:fload_2         
		//   58  111:aload_1         
		//   59  112:iload           8
		//   60  114:invokevirtual   #206 <Method float MotionEvent.getY(int)>
		//   61  117:fadd            
		//   62  118:fstore_2        
				}
				k1++;
			}
		//*  63  119:goto            80
			int i;
			if(flag)
		//*  64  122:iload           6
		//*  65  124:ifeq            194
				i = i2 - 1;
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
		//*  80  145:iload           10
		//*  81  147:sipush          255
		//*  82  150:iand            
		//*  83  151:tableswitch     0 6: default 192
		//		               0 371
		//		               1 850
		//		               2 631
		//		               3 1124
		//		               4 192
		//		               5 201
		//		               6 227
		//*  84  192:iconst_0        
		//*  85  193:ireturn         
				i = i2;
		//   86  194:iload           9
		//   87  196:istore          6
			f1 /= i;
			f /= i;
			j2 & 0xff;
			JVM INSTR tableswitch 0 6: default 192
		//		               0 371
		//		               1 850
		//		               2 631
		//		               3 1124
		//		               4 192
		//		               5 201
		//		               6 227;
			   goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
			return false;
		//*  88  198:goto            133
_L6:
			mLastFocusX = f1;
		//   89  201:aload_0         
		//   90  202:fload_3         
		//   91  203:putfield        #208 <Field float mLastFocusX>
			mDownFocusX = f1;
		//   92  206:aload_0         
		//   93  207:fload_3         
		//   94  208:putfield        #210 <Field float mDownFocusX>
			mLastFocusY = f;
		//   95  211:aload_0         
		//   96  212:fload_2         
		//   97  213:putfield        #212 <Field float mLastFocusY>
			mDownFocusY = f;
		//   98  216:aload_0         
		//   99  217:fload_2         
		//  100  218:putfield        #214 <Field float mDownFocusY>
			cancelTaps();
		//  101  221:aload_0         
		//  102  222:invokespecial   #216 <Method void cancelTaps()>
			return false;
		//  103  225:iconst_0        
		//  104  226:ireturn         
_L7:
			int j;
			int i1;
			mLastFocusX = f1;
		//  105  227:aload_0         
		//  106  228:fload_3         
		//  107  229:putfield        #208 <Field float mLastFocusX>
			mDownFocusX = f1;
		//  108  232:aload_0         
		//  109  233:fload_3         
		//  110  234:putfield        #210 <Field float mDownFocusX>
			mLastFocusY = f;
		//  111  237:aload_0         
		//  112  238:fload_2         
		//  113  239:putfield        #212 <Field float mLastFocusY>
			mDownFocusY = f;
		//  114  242:aload_0         
		//  115  243:fload_2         
		//  116  244:putfield        #214 <Field float mDownFocusY>
			mVelocityTracker.computeCurrentVelocity(1000, mMaximumFlingVelocity);
		//  117  247:aload_0         
		//  118  248:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//  119  251:sipush          1000
		//  120  254:aload_0         
		//  121  255:getfield        #153 <Field int mMaximumFlingVelocity>
		//  122  258:i2f             
		//  123  259:invokevirtual   #220 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
			i1 = motionevent.getActionIndex();
		//  124  262:aload_1         
		//  125  263:invokevirtual   #198 <Method int MotionEvent.getActionIndex()>
		//  126  266:istore          7
			j = motionevent.getPointerId(i1);
		//  127  268:aload_1         
		//  128  269:iload           7
		//  129  271:invokevirtual   #224 <Method int MotionEvent.getPointerId(int)>
		//  130  274:istore          6
			f = mVelocityTracker.getXVelocity(j);
		//  131  276:aload_0         
		//  132  277:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//  133  280:iload           6
		//  134  282:invokevirtual   #227 <Method float VelocityTracker.getXVelocity(int)>
		//  135  285:fstore_2        
			f1 = mVelocityTracker.getYVelocity(j);
		//  136  286:aload_0         
		//  137  287:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//  138  290:iload           6
		//  139  292:invokevirtual   #230 <Method float VelocityTracker.getYVelocity(int)>
		//  140  295:fstore_3        
			j = 0;
		//  141  296:iconst_0        
		//  142  297:istore          6
_L11:
			if(j >= i2) goto _L1; else goto _L8
		//  143  299:iload           6
		//  144  301:iload           9
		//  145  303:icmpge          192
_L8:
			if(j != i1) goto _L10; else goto _L9
		//  146  306:iload           6
		//  147  308:iload           7
		//  148  310:icmpne          322
_L9:
			j++;
		//  149  313:iload           6
		//  150  315:iconst_1        
		//  151  316:iadd            
		//  152  317:istore          6
			  goto _L11
		//* 153  319:goto            299
_L10:
			float f2;
			int l1;
			l1 = motionevent.getPointerId(j);
		//  154  322:aload_1         
		//  155  323:iload           6
		//  156  325:invokevirtual   #224 <Method int MotionEvent.getPointerId(int)>
		//  157  328:istore          8
			f2 = mVelocityTracker.getXVelocity(l1);
		//  158  330:aload_0         
		//  159  331:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//  160  334:iload           8
		//  161  336:invokevirtual   #227 <Method float VelocityTracker.getXVelocity(int)>
		//  162  339:fstore          4
			if(mVelocityTracker.getYVelocity(l1) * f1 + f2 * f >= 0.0F) goto _L9; else goto _L12
		//  163  341:aload_0         
		//  164  342:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//  165  345:iload           8
		//  166  347:invokevirtual   #230 <Method float VelocityTracker.getYVelocity(int)>
		//  167  350:fload_3         
		//  168  351:fmul            
		//  169  352:fload           4
		//  170  354:fload_2         
		//  171  355:fmul            
		//  172  356:fadd            
		//  173  357:fconst_0        
		//  174  358:fcmpg           
		//  175  359:ifge            313
_L12:
			mVelocityTracker.clear();
		//  176  362:aload_0         
		//  177  363:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//  178  366:invokevirtual   #233 <Method void VelocityTracker.clear()>
			return false;
		//  179  369:iconst_0        
		//  180  370:ireturn         
_L2:
			if(mDoubleTapListener == null) goto _L14; else goto _L13
		//  181  371:aload_0         
		//  182  372:getfield        #235 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
		//  183  375:ifnull          625
_L13:
			boolean flag1;
			flag1 = mHandler.hasMessages(3);
		//  184  378:aload_0         
		//  185  379:getfield        #80  <Field Handler mHandler>
		//  186  382:iconst_3        
		//  187  383:invokevirtual   #239 <Method boolean Handler.hasMessages(int)>
		//  188  386:istore          11
			if(flag1)
		//* 189  388:iload           11
		//* 190  390:ifeq            401
				mHandler.removeMessages(3);
		//  191  393:aload_0         
		//  192  394:getfield        #80  <Field Handler mHandler>
		//  193  397:iconst_3        
		//  194  398:invokevirtual   #102 <Method void Handler.removeMessages(int)>
			if(mCurrentDownEvent == null || mPreviousUpEvent == null || !flag1 || !isConsideredDoubleTap(mCurrentDownEvent, mPreviousUpEvent, motionevent)) goto _L16; else goto _L15
		//  195  401:aload_0         
		//  196  402:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//  197  405:ifnull          612
		//  198  408:aload_0         
		//  199  409:getfield        #241 <Field MotionEvent mPreviousUpEvent>
		//  200  412:ifnull          612
		//  201  415:iload           11
		//  202  417:ifeq            612
		//  203  420:aload_0         
		//  204  421:aload_0         
		//  205  422:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//  206  425:aload_0         
		//  207  426:getfield        #241 <Field MotionEvent mPreviousUpEvent>
		//  208  429:aload_1         
		//  209  430:invokespecial   #243 <Method boolean isConsideredDoubleTap(MotionEvent, MotionEvent, MotionEvent)>
		//  210  433:ifeq            612
_L15:
			mIsDoubleTapping = true;
		//  211  436:aload_0         
		//  212  437:iconst_1        
		//  213  438:putfield        #111 <Field boolean mIsDoubleTapping>
			j = ((int) (mDoubleTapListener.onDoubleTap(mCurrentDownEvent) | false | mDoubleTapListener.onDoubleTapEvent(motionevent)));
		//  214  441:aload_0         
		//  215  442:getfield        #235 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
		//  216  445:aload_0         
		//  217  446:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//  218  449:invokeinterface #246 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onDoubleTap(MotionEvent)>
		//  219  454:iconst_0        
		//  220  455:ior             
		//  221  456:aload_0         
		//  222  457:getfield        #235 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
		//  223  460:aload_1         
		//  224  461:invokeinterface #249 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onDoubleTapEvent(MotionEvent)>
		//  225  466:ior             
		//  226  467:istore          6
_L17:
			mLastFocusX = f1;
		//  227  469:aload_0         
		//  228  470:fload_3         
		//  229  471:putfield        #208 <Field float mLastFocusX>
			mDownFocusX = f1;
		//  230  474:aload_0         
		//  231  475:fload_3         
		//  232  476:putfield        #210 <Field float mDownFocusX>
			mLastFocusY = f;
		//  233  479:aload_0         
		//  234  480:fload_2         
		//  235  481:putfield        #212 <Field float mLastFocusY>
			mDownFocusY = f;
		//  236  484:aload_0         
		//  237  485:fload_2         
		//  238  486:putfield        #214 <Field float mDownFocusY>
			if(mCurrentDownEvent != null)
		//* 239  489:aload_0         
		//* 240  490:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//* 241  493:ifnull          503
				mCurrentDownEvent.recycle();
		//  242  496:aload_0         
		//  243  497:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//  244  500:invokevirtual   #250 <Method void MotionEvent.recycle()>
			mCurrentDownEvent = MotionEvent.obtain(motionevent);
		//  245  503:aload_0         
		//  246  504:aload_1         
		//  247  505:invokestatic    #253 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
		//  248  508:putfield        #175 <Field MotionEvent mCurrentDownEvent>
			mAlwaysInTapRegion = true;
		//  249  511:aload_0         
		//  250  512:iconst_1        
		//  251  513:putfield        #115 <Field boolean mAlwaysInTapRegion>
			mAlwaysInBiggerTapRegion = true;
		//  252  516:aload_0         
		//  253  517:iconst_1        
		//  254  518:putfield        #117 <Field boolean mAlwaysInBiggerTapRegion>
			mStillDown = true;
		//  255  521:aload_0         
		//  256  522:iconst_1        
		//  257  523:putfield        #113 <Field boolean mStillDown>
			mInLongPress = false;
		//  258  526:aload_0         
		//  259  527:iconst_0        
		//  260  528:putfield        #121 <Field boolean mInLongPress>
			mDeferConfirmSingleTap = false;
		//  261  531:aload_0         
		//  262  532:iconst_0        
		//  263  533:putfield        #119 <Field boolean mDeferConfirmSingleTap>
			if(mIsLongpressEnabled)
		//* 264  536:aload_0         
		//* 265  537:getfield        #133 <Field boolean mIsLongpressEnabled>
		//* 266  540:ifeq            577
			{
				mHandler.removeMessages(2);
		//  267  543:aload_0         
		//  268  544:getfield        #80  <Field Handler mHandler>
		//  269  547:iconst_2        
		//  270  548:invokevirtual   #102 <Method void Handler.removeMessages(int)>
				mHandler.sendEmptyMessageAtTime(2, mCurrentDownEvent.getDownTime() + (long)TAP_TIMEOUT + (long)LONGPRESS_TIMEOUT);
		//  271  551:aload_0         
		//  272  552:getfield        #80  <Field Handler mHandler>
		//  273  555:iconst_2        
		//  274  556:aload_0         
		//  275  557:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//  276  560:invokevirtual   #256 <Method long MotionEvent.getDownTime()>
		//  277  563:getstatic       #65  <Field int TAP_TIMEOUT>
		//  278  566:i2l             
		//  279  567:ladd            
		//  280  568:getstatic       #60  <Field int LONGPRESS_TIMEOUT>
		//  281  571:i2l             
		//  282  572:ladd            
		//  283  573:invokevirtual   #260 <Method boolean Handler.sendEmptyMessageAtTime(int, long)>
		//  284  576:pop             
			}
			mHandler.sendEmptyMessageAtTime(1, mCurrentDownEvent.getDownTime() + (long)TAP_TIMEOUT);
		//  285  577:aload_0         
		//  286  578:getfield        #80  <Field Handler mHandler>
		//  287  581:iconst_1        
		//  288  582:aload_0         
		//  289  583:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//  290  586:invokevirtual   #256 <Method long MotionEvent.getDownTime()>
		//  291  589:getstatic       #65  <Field int TAP_TIMEOUT>
		//  292  592:i2l             
		//  293  593:ladd            
		//  294  594:invokevirtual   #260 <Method boolean Handler.sendEmptyMessageAtTime(int, long)>
		//  295  597:pop             
			return j | mListener.onDown(motionevent);
		//  296  598:iload           6
		//  297  600:aload_0         
		//  298  601:getfield        #82  <Field android.view.GestureDetector$OnGestureListener mListener>
		//  299  604:aload_1         
		//  300  605:invokeinterface #263 <Method boolean android.view.GestureDetector$OnGestureListener.onDown(MotionEvent)>
		//  301  610:ior             
		//  302  611:ireturn         
_L16:
			mHandler.sendEmptyMessageDelayed(3, DOUBLE_TAP_TIMEOUT);
		//  303  612:aload_0         
		//  304  613:getfield        #80  <Field Handler mHandler>
		//  305  616:iconst_3        
		//  306  617:getstatic       #70  <Field int DOUBLE_TAP_TIMEOUT>
		//  307  620:i2l             
		//  308  621:invokevirtual   #266 <Method boolean Handler.sendEmptyMessageDelayed(int, long)>
		//  309  624:pop             
_L14:
			j = 0;
		//  310  625:iconst_0        
		//  311  626:istore          6
			  goto _L17
		//* 312  628:goto            469
_L4:
			if(!mInLongPress)
		//* 313  631:aload_0         
		//* 314  632:getfield        #121 <Field boolean mInLongPress>
		//* 315  635:ifne            192
			{
				float f3 = mLastFocusX - f1;
		//  316  638:aload_0         
		//  317  639:getfield        #208 <Field float mLastFocusX>
		//  318  642:fload_3         
		//  319  643:fsub            
		//  320  644:fstore          4
				float f4 = mLastFocusY - f;
		//  321  646:aload_0         
		//  322  647:getfield        #212 <Field float mLastFocusY>
		//  323  650:fload_2         
		//  324  651:fsub            
		//  325  652:fstore          5
				if(mIsDoubleTapping)
		//* 326  654:aload_0         
		//* 327  655:getfield        #111 <Field boolean mIsDoubleTapping>
		//* 328  658:ifeq            674
					return false | mDoubleTapListener.onDoubleTapEvent(motionevent);
		//  329  661:iconst_0        
		//  330  662:aload_0         
		//  331  663:getfield        #235 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
		//  332  666:aload_1         
		//  333  667:invokeinterface #249 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onDoubleTapEvent(MotionEvent)>
		//  334  672:ior             
		//  335  673:ireturn         
				if(mAlwaysInTapRegion)
		//* 336  674:aload_0         
		//* 337  675:getfield        #115 <Field boolean mAlwaysInTapRegion>
		//* 338  678:ifeq            797
				{
					int k = (int)(f1 - mDownFocusX);
		//  339  681:fload_3         
		//  340  682:aload_0         
		//  341  683:getfield        #210 <Field float mDownFocusX>
		//  342  686:fsub            
		//  343  687:f2i             
		//  344  688:istore          6
					int j1 = (int)(f - mDownFocusY);
		//  345  690:fload_2         
		//  346  691:aload_0         
		//  347  692:getfield        #214 <Field float mDownFocusY>
		//  348  695:fsub            
		//  349  696:f2i             
		//  350  697:istore          7
					k = k * k + j1 * j1;
		//  351  699:iload           6
		//  352  701:iload           6
		//  353  703:imul            
		//  354  704:iload           7
		//  355  706:iload           7
		//  356  708:imul            
		//  357  709:iadd            
		//  358  710:istore          6
					boolean flag2;
					boolean flag3;
					MotionEvent motionevent1;
					VelocityTracker velocitytracker;
					if(k > mTouchSlopSquare)
		//* 359  712:iload           6
		//* 360  714:aload_0         
		//* 361  715:getfield        #155 <Field int mTouchSlopSquare>
		//* 362  718:icmple          1136
					{
						flag2 = mListener.onScroll(mCurrentDownEvent, motionevent, f3, f4);
		//  363  721:aload_0         
		//  364  722:getfield        #82  <Field android.view.GestureDetector$OnGestureListener mListener>
		//  365  725:aload_0         
		//  366  726:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//  367  729:aload_1         
		//  368  730:fload           4
		//  369  732:fload           5
		//  370  734:invokeinterface #270 <Method boolean android.view.GestureDetector$OnGestureListener.onScroll(MotionEvent, MotionEvent, float, float)>
		//  371  739:istore          11
						mLastFocusX = f1;
		//  372  741:aload_0         
		//  373  742:fload_3         
		//  374  743:putfield        #208 <Field float mLastFocusX>
						mLastFocusY = f;
		//  375  746:aload_0         
		//  376  747:fload_2         
		//  377  748:putfield        #212 <Field float mLastFocusY>
						mAlwaysInTapRegion = false;
		//  378  751:aload_0         
		//  379  752:iconst_0        
		//  380  753:putfield        #115 <Field boolean mAlwaysInTapRegion>
						mHandler.removeMessages(3);
		//  381  756:aload_0         
		//  382  757:getfield        #80  <Field Handler mHandler>
		//  383  760:iconst_3        
		//  384  761:invokevirtual   #102 <Method void Handler.removeMessages(int)>
						mHandler.removeMessages(1);
		//  385  764:aload_0         
		//  386  765:getfield        #80  <Field Handler mHandler>
		//  387  768:iconst_1        
		//  388  769:invokevirtual   #102 <Method void Handler.removeMessages(int)>
						mHandler.removeMessages(2);
		//  389  772:aload_0         
		//  390  773:getfield        #80  <Field Handler mHandler>
		//  391  776:iconst_2        
		//  392  777:invokevirtual   #102 <Method void Handler.removeMessages(int)>
					} else
		//* 393  780:iload           6
		//* 394  782:aload_0         
		//* 395  783:getfield        #155 <Field int mTouchSlopSquare>
		//* 396  786:icmple          794
		//* 397  789:aload_0         
		//* 398  790:iconst_0        
		//* 399  791:putfield        #117 <Field boolean mAlwaysInBiggerTapRegion>
		//* 400  794:iload           11
		//* 401  796:ireturn         
		//* 402  797:fload           4
		//* 403  799:invokestatic    #276 <Method float Math.abs(float)>
		//* 404  802:fconst_1        
		//* 405  803:fcmpl           
		//* 406  804:ifge            817
		//* 407  807:fload           5
		//* 408  809:invokestatic    #276 <Method float Math.abs(float)>
		//* 409  812:fconst_1        
		//* 410  813:fcmpl           
		//* 411  814:iflt            192
		//* 412  817:aload_0         
		//* 413  818:getfield        #82  <Field android.view.GestureDetector$OnGestureListener mListener>
		//* 414  821:aload_0         
		//* 415  822:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//* 416  825:aload_1         
		//* 417  826:fload           4
		//* 418  828:fload           5
		//* 419  830:invokeinterface #270 <Method boolean android.view.GestureDetector$OnGestureListener.onScroll(MotionEvent, MotionEvent, float, float)>
		//* 420  835:istore          11
		//* 421  837:aload_0         
		//* 422  838:fload_3         
		//* 423  839:putfield        #208 <Field float mLastFocusX>
		//* 424  842:aload_0         
		//* 425  843:fload_2         
		//* 426  844:putfield        #212 <Field float mLastFocusY>
		//* 427  847:iload           11
		//* 428  849:ireturn         
		//* 429  850:aload_0         
		//* 430  851:iconst_0        
		//* 431  852:putfield        #113 <Field boolean mStillDown>
		//* 432  855:aload_1         
		//* 433  856:invokestatic    #253 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
		//* 434  859:astore          13
		//* 435  861:aload_0         
		//* 436  862:getfield        #111 <Field boolean mIsDoubleTapping>
		//* 437  865:ifeq            950
		//* 438  868:aload_0         
		//* 439  869:getfield        #235 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
		//* 440  872:aload_1         
		//* 441  873:invokeinterface #249 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onDoubleTapEvent(MotionEvent)>
		//* 442  878:iconst_0        
		//* 443  879:ior             
		//* 444  880:istore          11
		//* 445  882:aload_0         
		//* 446  883:getfield        #241 <Field MotionEvent mPreviousUpEvent>
		//* 447  886:ifnull          896
		//* 448  889:aload_0         
		//* 449  890:getfield        #241 <Field MotionEvent mPreviousUpEvent>
		//* 450  893:invokevirtual   #250 <Method void MotionEvent.recycle()>
		//* 451  896:aload_0         
		//* 452  897:aload           13
		//* 453  899:putfield        #241 <Field MotionEvent mPreviousUpEvent>
		//* 454  902:aload_0         
		//* 455  903:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//* 456  906:ifnull          921
		//* 457  909:aload_0         
		//* 458  910:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//* 459  913:invokevirtual   #109 <Method void VelocityTracker.recycle()>
		//* 460  916:aload_0         
		//* 461  917:aconst_null     
		//* 462  918:putfield        #104 <Field VelocityTracker mVelocityTracker>
		//* 463  921:aload_0         
		//* 464  922:iconst_0        
		//* 465  923:putfield        #111 <Field boolean mIsDoubleTapping>
		//* 466  926:aload_0         
		//* 467  927:iconst_0        
		//* 468  928:putfield        #119 <Field boolean mDeferConfirmSingleTap>
		//* 469  931:aload_0         
		//* 470  932:getfield        #80  <Field Handler mHandler>
		//* 471  935:iconst_1        
		//* 472  936:invokevirtual   #102 <Method void Handler.removeMessages(int)>
		//* 473  939:aload_0         
		//* 474  940:getfield        #80  <Field Handler mHandler>
		//* 475  943:iconst_2        
		//* 476  944:invokevirtual   #102 <Method void Handler.removeMessages(int)>
		//* 477  947:iload           11
		//* 478  949:ireturn         
		//* 479  950:aload_0         
		//* 480  951:getfield        #121 <Field boolean mInLongPress>
		//* 481  954:ifeq            976
		//* 482  957:aload_0         
		//* 483  958:getfield        #80  <Field Handler mHandler>
		//* 484  961:iconst_3        
		//* 485  962:invokevirtual   #102 <Method void Handler.removeMessages(int)>
		//* 486  965:aload_0         
		//* 487  966:iconst_0        
		//* 488  967:putfield        #121 <Field boolean mInLongPress>
		//* 489  970:iconst_0        
		//* 490  971:istore          11
		//* 491  973:goto            882
		//* 492  976:aload_0         
		//* 493  977:getfield        #115 <Field boolean mAlwaysInTapRegion>
		//* 494  980:ifeq            1035
		//* 495  983:aload_0         
		//* 496  984:getfield        #82  <Field android.view.GestureDetector$OnGestureListener mListener>
		//* 497  987:aload_1         
		//* 498  988:invokeinterface #279 <Method boolean android.view.GestureDetector$OnGestureListener.onSingleTapUp(MotionEvent)>
		//* 499  993:istore          12
		//* 500  995:iload           12
		//* 501  997:istore          11
		//* 502  999:aload_0         
		//* 503 1000:getfield        #119 <Field boolean mDeferConfirmSingleTap>
		//* 504 1003:ifeq            882
		//* 505 1006:iload           12
		//* 506 1008:istore          11
		//* 507 1010:aload_0         
		//* 508 1011:getfield        #235 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
		//* 509 1014:ifnull          882
		//* 510 1017:aload_0         
		//* 511 1018:getfield        #235 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
		//* 512 1021:aload_1         
		//* 513 1022:invokeinterface #282 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onSingleTapConfirmed(MotionEvent)>
		//* 514 1027:pop             
		//* 515 1028:iload           12
		//* 516 1030:istore          11
		//* 517 1032:goto            882
		//* 518 1035:aload_0         
		//* 519 1036:getfield        #104 <Field VelocityTracker mVelocityTracker>
		//* 520 1039:astore          14
		//* 521 1041:aload_1         
		//* 522 1042:iconst_0        
		//* 523 1043:invokevirtual   #224 <Method int MotionEvent.getPointerId(int)>
		//* 524 1046:istore          6
		//* 525 1048:aload           14
		//* 526 1050:sipush          1000
		//* 527 1053:aload_0         
		//* 528 1054:getfield        #153 <Field int mMaximumFlingVelocity>
		//* 529 1057:i2f             
		//* 530 1058:invokevirtual   #220 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
		//* 531 1061:aload           14
		//* 532 1063:iload           6
		//* 533 1065:invokevirtual   #230 <Method float VelocityTracker.getYVelocity(int)>
		//* 534 1068:fstore_2        
		//* 535 1069:aload           14
		//* 536 1071:iload           6
		//* 537 1073:invokevirtual   #227 <Method float VelocityTracker.getXVelocity(int)>
		//* 538 1076:fstore_3        
		//* 539 1077:fload_2         
		//* 540 1078:invokestatic    #276 <Method float Math.abs(float)>
		//* 541 1081:aload_0         
		//* 542 1082:getfield        #148 <Field int mMinimumFlingVelocity>
		//* 543 1085:i2f             
		//* 544 1086:fcmpl           
		//* 545 1087:ifgt            1103
		//* 546 1090:fload_3         
		//* 547 1091:invokestatic    #276 <Method float Math.abs(float)>
		//* 548 1094:aload_0         
		//* 549 1095:getfield        #148 <Field int mMinimumFlingVelocity>
		//* 550 1098:i2f             
		//* 551 1099:fcmpl           
		//* 552 1100:ifle            1130
		//* 553 1103:aload_0         
		//* 554 1104:getfield        #82  <Field android.view.GestureDetector$OnGestureListener mListener>
		//* 555 1107:aload_0         
		//* 556 1108:getfield        #175 <Field MotionEvent mCurrentDownEvent>
		//* 557 1111:aload_1         
		//* 558 1112:fload_3         
		//* 559 1113:fload_2         
		//* 560 1114:invokeinterface #285 <Method boolean android.view.GestureDetector$OnGestureListener.onFling(MotionEvent, MotionEvent, float, float)>
		//* 561 1119:istore          11
		//* 562 1121:goto            882
		//* 563 1124:aload_0         
		//* 564 1125:invokespecial   #287 <Method void cancel()>
		//* 565 1128:iconst_0        
		//* 566 1129:ireturn         
		//* 567 1130:iconst_0        
		//* 568 1131:istore          11
		//* 569 1133:goto            882
					{
						flag2 = false;
		//  570 1136:iconst_0        
		//  571 1137:istore          11
					}
					if(k > mTouchSlopSquare)
						mAlwaysInBiggerTapRegion = false;
					return flag2;
				}
				if(Math.abs(f3) >= 1.0F || Math.abs(f4) >= 1.0F)
				{
					flag2 = mListener.onScroll(mCurrentDownEvent, motionevent, f3, f4);
					mLastFocusX = f1;
					mLastFocusY = f;
					return flag2;
				}
			}
			  goto _L1
_L3:
			mStillDown = false;
			motionevent1 = MotionEvent.obtain(motionevent);
			if(mIsDoubleTapping)
				flag2 = mDoubleTapListener.onDoubleTapEvent(motionevent) | false;
			else
			if(mInLongPress)
			{
				mHandler.removeMessages(3);
				mInLongPress = false;
				flag2 = false;
			} else
			if(mAlwaysInTapRegion)
			{
				flag3 = mListener.onSingleTapUp(motionevent);
				flag2 = flag3;
				if(mDeferConfirmSingleTap)
				{
					flag2 = flag3;
					if(mDoubleTapListener != null)
					{
						mDoubleTapListener.onSingleTapConfirmed(motionevent);
						flag2 = flag3;
					}
				}
			} else
			{
				velocitytracker = mVelocityTracker;
				k = motionevent.getPointerId(0);
				velocitytracker.computeCurrentVelocity(1000, mMaximumFlingVelocity);
				f = velocitytracker.getYVelocity(k);
				f1 = velocitytracker.getXVelocity(k);
				if(Math.abs(f) > (float)mMinimumFlingVelocity || Math.abs(f1) > (float)mMinimumFlingVelocity)
					flag2 = mListener.onFling(mCurrentDownEvent, motionevent, f1, f);
				else
					flag2 = false;
			}
			if(mPreviousUpEvent != null)
				mPreviousUpEvent.recycle();
			mPreviousUpEvent = motionevent1;
			if(mVelocityTracker != null)
			{
				mVelocityTracker.recycle();
				mVelocityTracker = null;
			}
			mIsDoubleTapping = false;
			mDeferConfirmSingleTap = false;
			mHandler.removeMessages(1);
			mHandler.removeMessages(2);
			return flag2;
_L5:
			cancel();
			return false;
		//* 572 1139:goto            780
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
