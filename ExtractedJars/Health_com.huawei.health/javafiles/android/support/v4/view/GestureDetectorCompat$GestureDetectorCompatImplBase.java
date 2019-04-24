// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.*;

// Referenced classes of package android.support.v4.view:
//			GestureDetectorCompat

static class GestureDetectorCompat$GestureDetectorCompatImplBase
	implements GestureDetectorCompat.GestureDetectorCompatImpl
{
	class GestureHandler extends Handler
	{

		public void handleMessage(Message message)
		{
			switch(message.what)
		//*   0    0:aload_1         
		//*   1    1:getfield        #36  <Field int Message.what>
			{
		//*   2    4:tableswitch     1 3: default 32
		//		               1 35
		//		               2 55
		//		               3 63
		//*   3   32:goto            113
			case 1: // '\001'
				mListener.onShowPress(mCurrentDownEvent);
		//    4   35:aload_0         
		//    5   36:getfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
		//    6   39:getfield        #40  <Field android.view.GestureDetector$OnGestureListener GestureDetectorCompat$GestureDetectorCompatImplBase.mListener>
		//    7   42:aload_0         
		//    8   43:getfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
		//    9   46:getfield        #44  <Field MotionEvent GestureDetectorCompat$GestureDetectorCompatImplBase.mCurrentDownEvent>
		//   10   49:invokeinterface #50  <Method void android.view.GestureDetector$OnGestureListener.onShowPress(MotionEvent)>
				return;
		//   11   54:return          

			case 2: // '\002'
				dispatchLongPress();
		//   12   55:aload_0         
		//   13   56:getfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
		//   14   59:invokevirtual   #53  <Method void GestureDetectorCompat$GestureDetectorCompatImplBase.dispatchLongPress()>
				return;
		//   15   62:return          

			case 3: // '\003'
				if(mDoubleTapListener != null)
		//*  16   63:aload_0         
		//*  17   64:getfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
		//*  18   67:getfield        #57  <Field android.view.GestureDetector$OnDoubleTapListener GestureDetectorCompat$GestureDetectorCompatImplBase.mDoubleTapListener>
		//*  19   70:ifnull          140
				{
					if(!mStillDown)
		//*  20   73:aload_0         
		//*  21   74:getfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
		//*  22   77:getfield        #61  <Field boolean GestureDetectorCompat$GestureDetectorCompatImplBase.mStillDown>
		//*  23   80:ifne            104
					{
						mDoubleTapListener.onSingleTapConfirmed(mCurrentDownEvent);
		//   24   83:aload_0         
		//   25   84:getfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
		//   26   87:getfield        #57  <Field android.view.GestureDetector$OnDoubleTapListener GestureDetectorCompat$GestureDetectorCompatImplBase.mDoubleTapListener>
		//   27   90:aload_0         
		//   28   91:getfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
		//   29   94:getfield        #44  <Field MotionEvent GestureDetectorCompat$GestureDetectorCompatImplBase.mCurrentDownEvent>
		//   30   97:invokeinterface #67  <Method boolean android.view.GestureDetector$OnDoubleTapListener.onSingleTapConfirmed(MotionEvent)>
		//   31  102:pop             
						return;
		//   32  103:return          
					} else
					{
						mDeferConfirmSingleTap = true;
		//   33  104:aload_0         
		//   34  105:getfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
		//   35  108:iconst_1        
		//   36  109:putfield        #70  <Field boolean GestureDetectorCompat$GestureDetectorCompatImplBase.mDeferConfirmSingleTap>
						return;
		//   37  112:return          
					}
				} else
		//*  38  113:new             #72  <Class RuntimeException>
		//*  39  116:dup             
		//*  40  117:new             #74  <Class StringBuilder>
		//*  41  120:dup             
		//*  42  121:invokespecial   #75  <Method void StringBuilder()>
		//*  43  124:ldc1            #77  <String "Unknown message ">
		//*  44  126:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
		//*  45  129:aload_1         
		//*  46  130:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
		//*  47  133:invokevirtual   #88  <Method String StringBuilder.toString()>
		//*  48  136:invokespecial   #91  <Method void RuntimeException(String)>
		//*  49  139:athrow          
				{
					return;
		//   50  140:return          
				}
			}
			throw new RuntimeException((new StringBuilder()).append("Unknown message ").append(((Object) (message))).toString());
		}

		final GestureDetectorCompat.GestureDetectorCompatImplBase this$0;

		GestureHandler()
		{
			this$0 = GestureDetectorCompat.GestureDetectorCompatImplBase.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void Handler()>
		//    5    9:return          
		}

		GestureHandler(Handler handler)
		{
			this$0 = GestureDetectorCompat.GestureDetectorCompatImplBase.this;
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
		if(!mAlwaysInBiggerTapRegion)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field boolean mAlwaysInBiggerTapRegion>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(motionevent2.getEventTime() - motionevent1.getEventTime() > (long)DOUBLE_TAP_TIMEOUT)
	//*   5    9:aload_3         
	//*   6   10:invokevirtual   #165 <Method long MotionEvent.getEventTime()>
	//*   7   13:aload_2         
	//*   8   14:invokevirtual   #165 <Method long MotionEvent.getEventTime()>
	//*   9   17:lsub            
	//*  10   18:getstatic       #70  <Field int DOUBLE_TAP_TIMEOUT>
	//*  11   21:i2l             
	//*  12   22:lcmp            
	//*  13   23:ifle            28
			return false;
	//   14   26:iconst_0        
	//   15   27:ireturn         
		int i = (int)motionevent.getX() - (int)motionevent2.getX();
	//   16   28:aload_1         
	//   17   29:invokevirtual   #169 <Method float MotionEvent.getX()>
	//   18   32:f2i             
	//   19   33:aload_3         
	//   20   34:invokevirtual   #169 <Method float MotionEvent.getX()>
	//   21   37:f2i             
	//   22   38:isub            
	//   23   39:istore          4
		int j = (int)motionevent.getY() - (int)motionevent2.getY();
	//   24   41:aload_1         
	//   25   42:invokevirtual   #172 <Method float MotionEvent.getY()>
	//   26   45:f2i             
	//   27   46:aload_3         
	//   28   47:invokevirtual   #172 <Method float MotionEvent.getY()>
	//   29   50:f2i             
	//   30   51:isub            
	//   31   52:istore          5
		return i * i + j * j < mDoubleTapSlopSquare;
	//   32   54:iload           4
	//   33   56:iload           4
	//   34   58:imul            
	//   35   59:iload           5
	//   36   61:iload           5
	//   37   63:imul            
	//   38   64:iadd            
	//   39   65:aload_0         
	//   40   66:getfield        #157 <Field int mDoubleTapSlopSquare>
	//   41   69:icmpge          74
	//   42   72:iconst_1        
	//   43   73:ireturn         
	//   44   74:iconst_0        
	//   45   75:ireturn         
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
		int l2 = motionevent.getAction();
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
		if((l2 & 0xff) == 6)
	//*  13   28:iload           10
	//*  14   30:sipush          255
	//*  15   33:iand            
	//*  16   34:bipush          6
	//*  17   36:icmpne          45
			flag = true;
	//   18   39:iconst_1        
	//   19   40:istore          6
		else
	//*  20   42:goto            48
			flag = false;
	//   21   45:iconst_0        
	//   22   46:istore          6
		int k1;
		if(flag)
	//*  23   48:iload           6
	//*  24   50:ifeq            62
			k1 = motionevent.getActionIndex();
	//   25   53:aload_1         
	//   26   54:invokevirtual   #198 <Method int MotionEvent.getActionIndex()>
	//   27   57:istore          7
		else
	//*  28   59:goto            65
			k1 = -1;
	//   29   62:iconst_m1       
	//   30   63:istore          7
		float f2 = 0.0F;
	//   31   65:fconst_0        
	//   32   66:fstore_3        
		float f = 0.0F;
	//   33   67:fconst_0        
	//   34   68:fstore_2        
		int k2 = motionevent.getPointerCount();
	//   35   69:aload_1         
	//   36   70:invokevirtual   #201 <Method int MotionEvent.getPointerCount()>
	//   37   73:istore          9
		for(int i2 = 0; i2 < k2; i2++)
	//*  38   75:iconst_0        
	//*  39   76:istore          8
	//*  40   78:iload           8
	//*  41   80:iload           9
	//*  42   82:icmpge          122
			if(k1 != i2)
	//*  43   85:iload           7
	//*  44   87:iload           8
	//*  45   89:icmpne          95
	//*  46   92:goto            113
			{
				f2 += motionevent.getX(i2);
	//   47   95:fload_3         
	//   48   96:aload_1         
	//   49   97:iload           8
	//   50   99:invokevirtual   #204 <Method float MotionEvent.getX(int)>
	//   51  102:fadd            
	//   52  103:fstore_3        
				f += motionevent.getY(i2);
	//   53  104:fload_2         
	//   54  105:aload_1         
	//   55  106:iload           8
	//   56  108:invokevirtual   #206 <Method float MotionEvent.getY(int)>
	//   57  111:fadd            
	//   58  112:fstore_2        
			}

	//   59  113:iload           8
	//   60  115:iconst_1        
	//   61  116:iadd            
	//   62  117:istore          8
	//*  63  119:goto            78
		int i;
		if(flag)
	//*  64  122:iload           6
	//*  65  124:ifeq            136
			i = k2 - 1;
	//   66  127:iload           9
	//   67  129:iconst_1        
	//   68  130:isub            
	//   69  131:istore          6
		else
	//*  70  133:goto            140
			i = k2;
	//   71  136:iload           9
	//   72  138:istore          6
		f2 /= i;
	//   73  140:fload_3         
	//   74  141:iload           6
	//   75  143:i2f             
	//   76  144:fdiv            
	//   77  145:fstore_3        
		f /= i;
	//   78  146:fload_2         
	//   79  147:iload           6
	//   80  149:i2f             
	//   81  150:fdiv            
	//   82  151:fstore_2        
		boolean flag1 = false;
	//   83  152:iconst_0        
	//   84  153:istore          11
		boolean flag4 = false;
	//   85  155:iconst_0        
	//   86  156:istore          12
		k1 = 0;
	//   87  158:iconst_0        
	//   88  159:istore          7
		switch(l2 & 0xff)
	//*  89  161:iload           10
	//*  90  163:sipush          255
	//*  91  166:iand            
		{
	//*  92  167:tableswitch     0 6: default 208
	//	               0 382
	//	               1 868
	//	               2 647
	//	               3 1147
	//	               4 1151
	//	               5 210
	//	               6 236
		default:
			return false;
	//   93  208:iconst_0        
	//   94  209:ireturn         

		case 4: // '\004'
			break;

		case 5: // '\005'
			mLastFocusX = f2;
	//   95  210:aload_0         
	//   96  211:fload_3         
	//   97  212:putfield        #208 <Field float mLastFocusX>
			mDownFocusX = f2;
	//   98  215:aload_0         
	//   99  216:fload_3         
	//  100  217:putfield        #210 <Field float mDownFocusX>
			mLastFocusY = f;
	//  101  220:aload_0         
	//  102  221:fload_2         
	//  103  222:putfield        #212 <Field float mLastFocusY>
			mDownFocusY = f;
	//  104  225:aload_0         
	//  105  226:fload_2         
	//  106  227:putfield        #214 <Field float mDownFocusY>
			cancelTaps();
	//  107  230:aload_0         
	//  108  231:invokespecial   #216 <Method void cancelTaps()>
			return false;
	//  109  234:iconst_0        
	//  110  235:ireturn         

		case 6: // '\006'
			mLastFocusX = f2;
	//  111  236:aload_0         
	//  112  237:fload_3         
	//  113  238:putfield        #208 <Field float mLastFocusX>
			mDownFocusX = f2;
	//  114  241:aload_0         
	//  115  242:fload_3         
	//  116  243:putfield        #210 <Field float mDownFocusX>
			mLastFocusY = f;
	//  117  246:aload_0         
	//  118  247:fload_2         
	//  119  248:putfield        #212 <Field float mLastFocusY>
			mDownFocusY = f;
	//  120  251:aload_0         
	//  121  252:fload_2         
	//  122  253:putfield        #214 <Field float mDownFocusY>
			mVelocityTracker.computeCurrentVelocity(1000, mMaximumFlingVelocity);
	//  123  256:aload_0         
	//  124  257:getfield        #104 <Field VelocityTracker mVelocityTracker>
	//  125  260:sipush          1000
	//  126  263:aload_0         
	//  127  264:getfield        #153 <Field int mMaximumFlingVelocity>
	//  128  267:i2f             
	//  129  268:invokevirtual   #220 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
			k1 = motionevent.getActionIndex();
	//  130  271:aload_1         
	//  131  272:invokevirtual   #198 <Method int MotionEvent.getActionIndex()>
	//  132  275:istore          7
			int j = motionevent.getPointerId(k1);
	//  133  277:aload_1         
	//  134  278:iload           7
	//  135  280:invokevirtual   #224 <Method int MotionEvent.getPointerId(int)>
	//  136  283:istore          6
			f = mVelocityTracker.getXVelocity(j);
	//  137  285:aload_0         
	//  138  286:getfield        #104 <Field VelocityTracker mVelocityTracker>
	//  139  289:iload           6
	//  140  291:invokevirtual   #227 <Method float VelocityTracker.getXVelocity(int)>
	//  141  294:fstore_2        
			f2 = mVelocityTracker.getYVelocity(j);
	//  142  295:aload_0         
	//  143  296:getfield        #104 <Field VelocityTracker mVelocityTracker>
	//  144  299:iload           6
	//  145  301:invokevirtual   #230 <Method float VelocityTracker.getYVelocity(int)>
	//  146  304:fstore_3        
			for(int k = 0; k < k2; k++)
	//* 147  305:iconst_0        
	//* 148  306:istore          6
	//* 149  308:iload           6
	//* 150  310:iload           9
	//* 151  312:icmpge          380
			{
				if(k == k1)
	//* 152  315:iload           6
	//* 153  317:iload           7
	//* 154  319:icmpne          325
					continue;
	//  155  322:goto            371
				int j2 = motionevent.getPointerId(k);
	//  156  325:aload_1         
	//  157  326:iload           6
	//  158  328:invokevirtual   #224 <Method int MotionEvent.getPointerId(int)>
	//  159  331:istore          8
				if(f * mVelocityTracker.getXVelocity(j2) + f2 * mVelocityTracker.getYVelocity(j2) >= 0.0F)
					continue;
	//  160  333:fload_2         
	//  161  334:aload_0         
	//  162  335:getfield        #104 <Field VelocityTracker mVelocityTracker>
	//  163  338:iload           8
	//  164  340:invokevirtual   #227 <Method float VelocityTracker.getXVelocity(int)>
	//  165  343:fmul            
	//  166  344:fload_3         
	//  167  345:aload_0         
	//  168  346:getfield        #104 <Field VelocityTracker mVelocityTracker>
	//  169  349:iload           8
	//  170  351:invokevirtual   #230 <Method float VelocityTracker.getYVelocity(int)>
	//  171  354:fmul            
	//  172  355:fadd            
	//  173  356:fconst_0        
	//  174  357:fcmpg           
	//  175  358:ifge            371
				mVelocityTracker.clear();
	//  176  361:aload_0         
	//  177  362:getfield        #104 <Field VelocityTracker mVelocityTracker>
	//  178  365:invokevirtual   #233 <Method void VelocityTracker.clear()>
				break;
	//  179  368:goto            380
			}

	//  180  371:iload           6
	//  181  373:iconst_1        
	//  182  374:iadd            
	//  183  375:istore          6
	//* 184  377:goto            308
			return false;
	//  185  380:iconst_0        
	//  186  381:ireturn         

		case 0: // '\0'
			int l = k1;
	//  187  382:iload           7
	//  188  384:istore          6
			if(mDoubleTapListener != null)
	//* 189  386:aload_0         
	//* 190  387:getfield        #235 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
	//* 191  390:ifnull          504
			{
				flag1 = mHandler.hasMessages(3);
	//  192  393:aload_0         
	//  193  394:getfield        #80  <Field Handler mHandler>
	//  194  397:iconst_3        
	//  195  398:invokevirtual   #239 <Method boolean Handler.hasMessages(int)>
	//  196  401:istore          11
				if(flag1)
	//* 197  403:iload           11
	//* 198  405:ifeq            416
					mHandler.removeMessages(3);
	//  199  408:aload_0         
	//  200  409:getfield        #80  <Field Handler mHandler>
	//  201  412:iconst_3        
	//  202  413:invokevirtual   #102 <Method void Handler.removeMessages(int)>
				if(mCurrentDownEvent != null && mPreviousUpEvent != null && flag1 && isConsideredDoubleTap(mCurrentDownEvent, mPreviousUpEvent, motionevent))
	//* 203  416:aload_0         
	//* 204  417:getfield        #175 <Field MotionEvent mCurrentDownEvent>
	//* 205  420:ifnull          487
	//* 206  423:aload_0         
	//* 207  424:getfield        #241 <Field MotionEvent mPreviousUpEvent>
	//* 208  427:ifnull          487
	//* 209  430:iload           11
	//* 210  432:ifeq            487
	//* 211  435:aload_0         
	//* 212  436:aload_0         
	//* 213  437:getfield        #175 <Field MotionEvent mCurrentDownEvent>
	//* 214  440:aload_0         
	//* 215  441:getfield        #241 <Field MotionEvent mPreviousUpEvent>
	//* 216  444:aload_1         
	//* 217  445:invokespecial   #243 <Method boolean isConsideredDoubleTap(MotionEvent, MotionEvent, MotionEvent)>
	//* 218  448:ifeq            487
				{
					mIsDoubleTapping = true;
	//  219  451:aload_0         
	//  220  452:iconst_1        
	//  221  453:putfield        #111 <Field boolean mIsDoubleTapping>
					l = ((int) (mDoubleTapListener.onDoubleTap(mCurrentDownEvent) | false | mDoubleTapListener.onDoubleTapEvent(motionevent)));
	//  222  456:aload_0         
	//  223  457:getfield        #235 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
	//  224  460:aload_0         
	//  225  461:getfield        #175 <Field MotionEvent mCurrentDownEvent>
	//  226  464:invokeinterface #246 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onDoubleTap(MotionEvent)>
	//  227  469:iconst_0        
	//  228  470:ior             
	//  229  471:aload_0         
	//  230  472:getfield        #235 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
	//  231  475:aload_1         
	//  232  476:invokeinterface #249 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onDoubleTapEvent(MotionEvent)>
	//  233  481:ior             
	//  234  482:istore          6
				} else
	//* 235  484:goto            504
				{
					mHandler.sendEmptyMessageDelayed(3, DOUBLE_TAP_TIMEOUT);
	//  236  487:aload_0         
	//  237  488:getfield        #80  <Field Handler mHandler>
	//  238  491:iconst_3        
	//  239  492:getstatic       #70  <Field int DOUBLE_TAP_TIMEOUT>
	//  240  495:i2l             
	//  241  496:invokevirtual   #253 <Method boolean Handler.sendEmptyMessageDelayed(int, long)>
	//  242  499:pop             
					l = k1;
	//  243  500:iload           7
	//  244  502:istore          6
				}
			}
			mLastFocusX = f2;
	//  245  504:aload_0         
	//  246  505:fload_3         
	//  247  506:putfield        #208 <Field float mLastFocusX>
			mDownFocusX = f2;
	//  248  509:aload_0         
	//  249  510:fload_3         
	//  250  511:putfield        #210 <Field float mDownFocusX>
			mLastFocusY = f;
	//  251  514:aload_0         
	//  252  515:fload_2         
	//  253  516:putfield        #212 <Field float mLastFocusY>
			mDownFocusY = f;
	//  254  519:aload_0         
	//  255  520:fload_2         
	//  256  521:putfield        #214 <Field float mDownFocusY>
			if(mCurrentDownEvent != null)
	//* 257  524:aload_0         
	//* 258  525:getfield        #175 <Field MotionEvent mCurrentDownEvent>
	//* 259  528:ifnull          538
				mCurrentDownEvent.recycle();
	//  260  531:aload_0         
	//  261  532:getfield        #175 <Field MotionEvent mCurrentDownEvent>
	//  262  535:invokevirtual   #254 <Method void MotionEvent.recycle()>
			mCurrentDownEvent = MotionEvent.obtain(motionevent);
	//  263  538:aload_0         
	//  264  539:aload_1         
	//  265  540:invokestatic    #257 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
	//  266  543:putfield        #175 <Field MotionEvent mCurrentDownEvent>
			mAlwaysInTapRegion = true;
	//  267  546:aload_0         
	//  268  547:iconst_1        
	//  269  548:putfield        #115 <Field boolean mAlwaysInTapRegion>
			mAlwaysInBiggerTapRegion = true;
	//  270  551:aload_0         
	//  271  552:iconst_1        
	//  272  553:putfield        #117 <Field boolean mAlwaysInBiggerTapRegion>
			mStillDown = true;
	//  273  556:aload_0         
	//  274  557:iconst_1        
	//  275  558:putfield        #113 <Field boolean mStillDown>
			mInLongPress = false;
	//  276  561:aload_0         
	//  277  562:iconst_0        
	//  278  563:putfield        #121 <Field boolean mInLongPress>
			mDeferConfirmSingleTap = false;
	//  279  566:aload_0         
	//  280  567:iconst_0        
	//  281  568:putfield        #119 <Field boolean mDeferConfirmSingleTap>
			if(mIsLongpressEnabled)
	//* 282  571:aload_0         
	//* 283  572:getfield        #133 <Field boolean mIsLongpressEnabled>
	//* 284  575:ifeq            612
			{
				mHandler.removeMessages(2);
	//  285  578:aload_0         
	//  286  579:getfield        #80  <Field Handler mHandler>
	//  287  582:iconst_2        
	//  288  583:invokevirtual   #102 <Method void Handler.removeMessages(int)>
				mHandler.sendEmptyMessageAtTime(2, mCurrentDownEvent.getDownTime() + (long)TAP_TIMEOUT + (long)LONGPRESS_TIMEOUT);
	//  289  586:aload_0         
	//  290  587:getfield        #80  <Field Handler mHandler>
	//  291  590:iconst_2        
	//  292  591:aload_0         
	//  293  592:getfield        #175 <Field MotionEvent mCurrentDownEvent>
	//  294  595:invokevirtual   #260 <Method long MotionEvent.getDownTime()>
	//  295  598:getstatic       #65  <Field int TAP_TIMEOUT>
	//  296  601:i2l             
	//  297  602:ladd            
	//  298  603:getstatic       #60  <Field int LONGPRESS_TIMEOUT>
	//  299  606:i2l             
	//  300  607:ladd            
	//  301  608:invokevirtual   #263 <Method boolean Handler.sendEmptyMessageAtTime(int, long)>
	//  302  611:pop             
			}
			mHandler.sendEmptyMessageAtTime(1, mCurrentDownEvent.getDownTime() + (long)TAP_TIMEOUT);
	//  303  612:aload_0         
	//  304  613:getfield        #80  <Field Handler mHandler>
	//  305  616:iconst_1        
	//  306  617:aload_0         
	//  307  618:getfield        #175 <Field MotionEvent mCurrentDownEvent>
	//  308  621:invokevirtual   #260 <Method long MotionEvent.getDownTime()>
	//  309  624:getstatic       #65  <Field int TAP_TIMEOUT>
	//  310  627:i2l             
	//  311  628:ladd            
	//  312  629:invokevirtual   #263 <Method boolean Handler.sendEmptyMessageAtTime(int, long)>
	//  313  632:pop             
			return ((boolean) (l | mListener.onDown(motionevent)));
	//  314  633:iload           6
	//  315  635:aload_0         
	//  316  636:getfield        #85  <Field android.view.GestureDetector$OnGestureListener mListener>
	//  317  639:aload_1         
	//  318  640:invokeinterface #266 <Method boolean android.view.GestureDetector$OnGestureListener.onDown(MotionEvent)>
	//  319  645:ior             
	//  320  646:ireturn         

		case 2: // '\002'
			if(mInLongPress)
	//* 321  647:aload_0         
	//* 322  648:getfield        #121 <Field boolean mInLongPress>
	//* 323  651:ifeq            656
				return false;
	//  324  654:iconst_0        
	//  325  655:ireturn         
			float f4 = mLastFocusX - f2;
	//  326  656:aload_0         
	//  327  657:getfield        #208 <Field float mLastFocusX>
	//  328  660:fload_3         
	//  329  661:fsub            
	//  330  662:fstore          4
			float f5 = mLastFocusY - f;
	//  331  664:aload_0         
	//  332  665:getfield        #212 <Field float mLastFocusY>
	//  333  668:fload_2         
	//  334  669:fsub            
	//  335  670:fstore          5
			if(mIsDoubleTapping)
	//* 336  672:aload_0         
	//* 337  673:getfield        #111 <Field boolean mIsDoubleTapping>
	//* 338  676:ifeq            692
				return mDoubleTapListener.onDoubleTapEvent(motionevent) | false;
	//  339  679:aload_0         
	//  340  680:getfield        #235 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
	//  341  683:aload_1         
	//  342  684:invokeinterface #249 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onDoubleTapEvent(MotionEvent)>
	//  343  689:iconst_0        
	//  344  690:ior             
	//  345  691:ireturn         
			if(mAlwaysInTapRegion)
	//* 346  692:aload_0         
	//* 347  693:getfield        #115 <Field boolean mAlwaysInTapRegion>
	//* 348  696:ifeq            815
			{
				int i1 = (int)(f2 - mDownFocusX);
	//  349  699:fload_3         
	//  350  700:aload_0         
	//  351  701:getfield        #210 <Field float mDownFocusX>
	//  352  704:fsub            
	//  353  705:f2i             
	//  354  706:istore          6
				int l1 = (int)(f - mDownFocusY);
	//  355  708:fload_2         
	//  356  709:aload_0         
	//  357  710:getfield        #214 <Field float mDownFocusY>
	//  358  713:fsub            
	//  359  714:f2i             
	//  360  715:istore          7
				i1 = i1 * i1 + l1 * l1;
	//  361  717:iload           6
	//  362  719:iload           6
	//  363  721:imul            
	//  364  722:iload           7
	//  365  724:iload           7
	//  366  726:imul            
	//  367  727:iadd            
	//  368  728:istore          6
				if(i1 > mTouchSlopSquare)
	//* 369  730:iload           6
	//* 370  732:aload_0         
	//* 371  733:getfield        #155 <Field int mTouchSlopSquare>
	//* 372  736:icmple          798
				{
					flag1 = mListener.onScroll(mCurrentDownEvent, motionevent, f4, f5);
	//  373  739:aload_0         
	//  374  740:getfield        #85  <Field android.view.GestureDetector$OnGestureListener mListener>
	//  375  743:aload_0         
	//  376  744:getfield        #175 <Field MotionEvent mCurrentDownEvent>
	//  377  747:aload_1         
	//  378  748:fload           4
	//  379  750:fload           5
	//  380  752:invokeinterface #270 <Method boolean android.view.GestureDetector$OnGestureListener.onScroll(MotionEvent, MotionEvent, float, float)>
	//  381  757:istore          11
					mLastFocusX = f2;
	//  382  759:aload_0         
	//  383  760:fload_3         
	//  384  761:putfield        #208 <Field float mLastFocusX>
					mLastFocusY = f;
	//  385  764:aload_0         
	//  386  765:fload_2         
	//  387  766:putfield        #212 <Field float mLastFocusY>
					mAlwaysInTapRegion = false;
	//  388  769:aload_0         
	//  389  770:iconst_0        
	//  390  771:putfield        #115 <Field boolean mAlwaysInTapRegion>
					mHandler.removeMessages(3);
	//  391  774:aload_0         
	//  392  775:getfield        #80  <Field Handler mHandler>
	//  393  778:iconst_3        
	//  394  779:invokevirtual   #102 <Method void Handler.removeMessages(int)>
					mHandler.removeMessages(1);
	//  395  782:aload_0         
	//  396  783:getfield        #80  <Field Handler mHandler>
	//  397  786:iconst_1        
	//  398  787:invokevirtual   #102 <Method void Handler.removeMessages(int)>
					mHandler.removeMessages(2);
	//  399  790:aload_0         
	//  400  791:getfield        #80  <Field Handler mHandler>
	//  401  794:iconst_2        
	//  402  795:invokevirtual   #102 <Method void Handler.removeMessages(int)>
				}
				if(i1 > mTouchSlopSquare)
	//* 403  798:iload           6
	//* 404  800:aload_0         
	//* 405  801:getfield        #155 <Field int mTouchSlopSquare>
	//* 406  804:icmple          812
					mAlwaysInBiggerTapRegion = false;
	//  407  807:aload_0         
	//  408  808:iconst_0        
	//  409  809:putfield        #117 <Field boolean mAlwaysInBiggerTapRegion>
				return flag1;
	//  410  812:iload           11
	//  411  814:ireturn         
			}
			if(Math.abs(f4) >= 1.0F || Math.abs(f5) >= 1.0F)
	//* 412  815:fload           4
	//* 413  817:invokestatic    #276 <Method float Math.abs(float)>
	//* 414  820:fconst_1        
	//* 415  821:fcmpl           
	//* 416  822:ifge            835
	//* 417  825:fload           5
	//* 418  827:invokestatic    #276 <Method float Math.abs(float)>
	//* 419  830:fconst_1        
	//* 420  831:fcmpl           
	//* 421  832:iflt            1151
			{
				boolean flag2 = mListener.onScroll(mCurrentDownEvent, motionevent, f4, f5);
	//  422  835:aload_0         
	//  423  836:getfield        #85  <Field android.view.GestureDetector$OnGestureListener mListener>
	//  424  839:aload_0         
	//  425  840:getfield        #175 <Field MotionEvent mCurrentDownEvent>
	//  426  843:aload_1         
	//  427  844:fload           4
	//  428  846:fload           5
	//  429  848:invokeinterface #270 <Method boolean android.view.GestureDetector$OnGestureListener.onScroll(MotionEvent, MotionEvent, float, float)>
	//  430  853:istore          11
				mLastFocusX = f2;
	//  431  855:aload_0         
	//  432  856:fload_3         
	//  433  857:putfield        #208 <Field float mLastFocusX>
				mLastFocusY = f;
	//  434  860:aload_0         
	//  435  861:fload_2         
	//  436  862:putfield        #212 <Field float mLastFocusY>
				return flag2;
	//  437  865:iload           11
	//  438  867:ireturn         
			}
			break;

		case 1: // '\001'
			boolean flag3;
			MotionEvent motionevent1;
label0:
			{
				mStillDown = false;
	//  439  868:aload_0         
	//  440  869:iconst_0        
	//  441  870:putfield        #113 <Field boolean mStillDown>
				motionevent1 = MotionEvent.obtain(motionevent);
	//  442  873:aload_1         
	//  443  874:invokestatic    #257 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
	//  444  877:astore          13
				if(mIsDoubleTapping)
	//* 445  879:aload_0         
	//* 446  880:getfield        #111 <Field boolean mIsDoubleTapping>
	//* 447  883:ifeq            903
				{
					flag3 = mDoubleTapListener.onDoubleTapEvent(motionevent) | false;
	//  448  886:aload_0         
	//  449  887:getfield        #235 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
	//  450  890:aload_1         
	//  451  891:invokeinterface #249 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onDoubleTapEvent(MotionEvent)>
	//  452  896:iconst_0        
	//  453  897:ior             
	//  454  898:istore          11
					break label0;
	//  455  900:goto            1079
				}
				if(mInLongPress)
	//* 456  903:aload_0         
	//* 457  904:getfield        #121 <Field boolean mInLongPress>
	//* 458  907:ifeq            930
				{
					mHandler.removeMessages(3);
	//  459  910:aload_0         
	//  460  911:getfield        #80  <Field Handler mHandler>
	//  461  914:iconst_3        
	//  462  915:invokevirtual   #102 <Method void Handler.removeMessages(int)>
					mInLongPress = false;
	//  463  918:aload_0         
	//  464  919:iconst_0        
	//  465  920:putfield        #121 <Field boolean mInLongPress>
					flag3 = flag4;
	//  466  923:iload           12
	//  467  925:istore          11
					break label0;
	//  468  927:goto            1079
				}
				if(mAlwaysInTapRegion)
	//* 469  930:aload_0         
	//* 470  931:getfield        #115 <Field boolean mAlwaysInTapRegion>
	//* 471  934:ifeq            989
				{
					flag4 = mListener.onSingleTapUp(motionevent);
	//  472  937:aload_0         
	//  473  938:getfield        #85  <Field android.view.GestureDetector$OnGestureListener mListener>
	//  474  941:aload_1         
	//  475  942:invokeinterface #279 <Method boolean android.view.GestureDetector$OnGestureListener.onSingleTapUp(MotionEvent)>
	//  476  947:istore          12
					flag3 = flag4;
	//  477  949:iload           12
	//  478  951:istore          11
					if(mDeferConfirmSingleTap)
	//* 479  953:aload_0         
	//* 480  954:getfield        #119 <Field boolean mDeferConfirmSingleTap>
	//* 481  957:ifeq            1079
					{
						flag3 = flag4;
	//  482  960:iload           12
	//  483  962:istore          11
						if(mDoubleTapListener != null)
	//* 484  964:aload_0         
	//* 485  965:getfield        #235 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
	//* 486  968:ifnull          1079
						{
							mDoubleTapListener.onSingleTapConfirmed(motionevent);
	//  487  971:aload_0         
	//  488  972:getfield        #235 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
	//  489  975:aload_1         
	//  490  976:invokeinterface #282 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onSingleTapConfirmed(MotionEvent)>
	//  491  981:pop             
							flag3 = flag4;
	//  492  982:iload           12
	//  493  984:istore          11
						}
					}
					break label0;
	//  494  986:goto            1079
				}
				VelocityTracker velocitytracker = mVelocityTracker;
	//  495  989:aload_0         
	//  496  990:getfield        #104 <Field VelocityTracker mVelocityTracker>
	//  497  993:astore          14
				int j1 = motionevent.getPointerId(0);
	//  498  995:aload_1         
	//  499  996:iconst_0        
	//  500  997:invokevirtual   #224 <Method int MotionEvent.getPointerId(int)>
	//  501 1000:istore          6
				velocitytracker.computeCurrentVelocity(1000, mMaximumFlingVelocity);
	//  502 1002:aload           14
	//  503 1004:sipush          1000
	//  504 1007:aload_0         
	//  505 1008:getfield        #153 <Field int mMaximumFlingVelocity>
	//  506 1011:i2f             
	//  507 1012:invokevirtual   #220 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
				float f1 = velocitytracker.getYVelocity(j1);
	//  508 1015:aload           14
	//  509 1017:iload           6
	//  510 1019:invokevirtual   #230 <Method float VelocityTracker.getYVelocity(int)>
	//  511 1022:fstore_2        
				float f3 = velocitytracker.getXVelocity(j1);
	//  512 1023:aload           14
	//  513 1025:iload           6
	//  514 1027:invokevirtual   #227 <Method float VelocityTracker.getXVelocity(int)>
	//  515 1030:fstore_3        
				if(Math.abs(f1) <= (float)mMinimumFlingVelocity)
	//* 516 1031:fload_2         
	//* 517 1032:invokestatic    #276 <Method float Math.abs(float)>
	//* 518 1035:aload_0         
	//* 519 1036:getfield        #148 <Field int mMinimumFlingVelocity>
	//* 520 1039:i2f             
	//* 521 1040:fcmpl           
	//* 522 1041:ifgt            1061
				{
					flag3 = flag4;
	//  523 1044:iload           12
	//  524 1046:istore          11
					if(Math.abs(f3) <= (float)mMinimumFlingVelocity)
						break label0;
	//  525 1048:fload_3         
	//  526 1049:invokestatic    #276 <Method float Math.abs(float)>
	//  527 1052:aload_0         
	//  528 1053:getfield        #148 <Field int mMinimumFlingVelocity>
	//  529 1056:i2f             
	//  530 1057:fcmpl           
	//  531 1058:ifle            1079
				}
				flag3 = mListener.onFling(mCurrentDownEvent, motionevent, f3, f1);
	//  532 1061:aload_0         
	//  533 1062:getfield        #85  <Field android.view.GestureDetector$OnGestureListener mListener>
	//  534 1065:aload_0         
	//  535 1066:getfield        #175 <Field MotionEvent mCurrentDownEvent>
	//  536 1069:aload_1         
	//  537 1070:fload_3         
	//  538 1071:fload_2         
	//  539 1072:invokeinterface #285 <Method boolean android.view.GestureDetector$OnGestureListener.onFling(MotionEvent, MotionEvent, float, float)>
	//  540 1077:istore          11
			}
			if(mPreviousUpEvent != null)
	//* 541 1079:aload_0         
	//* 542 1080:getfield        #241 <Field MotionEvent mPreviousUpEvent>
	//* 543 1083:ifnull          1093
				mPreviousUpEvent.recycle();
	//  544 1086:aload_0         
	//  545 1087:getfield        #241 <Field MotionEvent mPreviousUpEvent>
	//  546 1090:invokevirtual   #254 <Method void MotionEvent.recycle()>
			mPreviousUpEvent = motionevent1;
	//  547 1093:aload_0         
	//  548 1094:aload           13
	//  549 1096:putfield        #241 <Field MotionEvent mPreviousUpEvent>
			if(mVelocityTracker != null)
	//* 550 1099:aload_0         
	//* 551 1100:getfield        #104 <Field VelocityTracker mVelocityTracker>
	//* 552 1103:ifnull          1118
			{
				mVelocityTracker.recycle();
	//  553 1106:aload_0         
	//  554 1107:getfield        #104 <Field VelocityTracker mVelocityTracker>
	//  555 1110:invokevirtual   #109 <Method void VelocityTracker.recycle()>
				mVelocityTracker = null;
	//  556 1113:aload_0         
	//  557 1114:aconst_null     
	//  558 1115:putfield        #104 <Field VelocityTracker mVelocityTracker>
			}
			mIsDoubleTapping = false;
	//  559 1118:aload_0         
	//  560 1119:iconst_0        
	//  561 1120:putfield        #111 <Field boolean mIsDoubleTapping>
			mDeferConfirmSingleTap = false;
	//  562 1123:aload_0         
	//  563 1124:iconst_0        
	//  564 1125:putfield        #119 <Field boolean mDeferConfirmSingleTap>
			mHandler.removeMessages(1);
	//  565 1128:aload_0         
	//  566 1129:getfield        #80  <Field Handler mHandler>
	//  567 1132:iconst_1        
	//  568 1133:invokevirtual   #102 <Method void Handler.removeMessages(int)>
			mHandler.removeMessages(2);
	//  569 1136:aload_0         
	//  570 1137:getfield        #80  <Field Handler mHandler>
	//  571 1140:iconst_2        
	//  572 1141:invokevirtual   #102 <Method void Handler.removeMessages(int)>
			return flag3;
	//  573 1144:iload           11
	//  574 1146:ireturn         

		case 3: // '\003'
			cancel();
	//  575 1147:aload_0         
	//  576 1148:invokespecial   #287 <Method void cancel()>
			break;
		}
		return false;
	//  577 1151:iconst_0        
	//  578 1152:ireturn         
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

	public GestureDetectorCompat$GestureDetectorCompatImplBase(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener, Handler handler)
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
