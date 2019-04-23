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
	private class GestureHandler extends Handler
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
		if(context != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          72
		{
			if(mListener != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #85  <Field android.view.GestureDetector$OnGestureListener mListener>
	//*   4    8:ifnull          62
			{
				mIsLongpressEnabled = true;
	//    5   11:aload_0         
	//    6   12:iconst_1        
	//    7   13:putfield        #124 <Field boolean mIsLongpressEnabled>
				context = ((Context) (ViewConfiguration.get(context)));
	//    8   16:aload_1         
	//    9   17:invokestatic    #128 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   10   20:astore_1        
				int i = ((ViewConfiguration) (context)).getScaledTouchSlop();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #131 <Method int ViewConfiguration.getScaledTouchSlop()>
	//   13   25:istore_2        
				int j = ((ViewConfiguration) (context)).getScaledDoubleTapSlop();
	//   14   26:aload_1         
	//   15   27:invokevirtual   #134 <Method int ViewConfiguration.getScaledDoubleTapSlop()>
	//   16   30:istore_3        
				mMinimumFlingVelocity = ((ViewConfiguration) (context)).getScaledMinimumFlingVelocity();
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:invokevirtual   #137 <Method int ViewConfiguration.getScaledMinimumFlingVelocity()>
	//   20   36:putfield        #139 <Field int mMinimumFlingVelocity>
				mMaximumFlingVelocity = ((ViewConfiguration) (context)).getScaledMaximumFlingVelocity();
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:invokevirtual   #142 <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
	//   24   44:putfield        #144 <Field int mMaximumFlingVelocity>
				mTouchSlopSquare = i * i;
	//   25   47:aload_0         
	//   26   48:iload_2         
	//   27   49:iload_2         
	//   28   50:imul            
	//   29   51:putfield        #146 <Field int mTouchSlopSquare>
				mDoubleTapSlopSquare = j * j;
	//   30   54:aload_0         
	//   31   55:iload_3         
	//   32   56:iload_3         
	//   33   57:imul            
	//   34   58:putfield        #148 <Field int mDoubleTapSlopSquare>
				return;
	//   35   61:return          
			} else
			{
				throw new IllegalArgumentException("OnGestureListener must not be null");
	//   36   62:new             #150 <Class IllegalArgumentException>
	//   37   65:dup             
	//   38   66:ldc1            #152 <String "OnGestureListener must not be null">
	//   39   68:invokespecial   #155 <Method void IllegalArgumentException(String)>
	//   40   71:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("Context must not be null");
	//   41   72:new             #150 <Class IllegalArgumentException>
	//   42   75:dup             
	//   43   76:ldc1            #157 <String "Context must not be null">
	//   44   78:invokespecial   #155 <Method void IllegalArgumentException(String)>
	//   45   81:athrow          
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
	//*  44   73:getfield        #148 <Field int mDoubleTapSlopSquare>
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
	//    1    1:getfield        #124 <Field boolean mIsLongpressEnabled>
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
	//	               0 888
	//	               1 620
	//	               2 389
	//	               3 383
	//	               4 208
	//	               5 357
	//	               6 210;
	//   89  164:tableswitch     0 6: default 208
	//	               0 888
	//	               1 620
	//	               2 389
	//	               3 383
	//	               4 208
	//	               5 357
	//	               6 210
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
	//  108  238:getfield        #144 <Field int mMaximumFlingVelocity>
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
	//  134  290:icmpge          1155
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
	//* 216  438:ifeq            563
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
	//* 239  475:getfield        #146 <Field int mTouchSlopSquare>
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
			if(k > mTouchSlopSquare)
	//* 274  546:iload           6
	//* 275  548:aload_0         
	//* 276  549:getfield        #146 <Field int mTouchSlopSquare>
	//* 277  552:icmple          560
				mAlwaysInBiggerTapRegion = false;
	//  278  555:aload_0         
	//  279  556:iconst_0        
	//  280  557:putfield        #117 <Field boolean mAlwaysInBiggerTapRegion>
			return flag2;
	//  281  560:iload           11
	//  282  562:ireturn         
		}
		if(Math.abs(f3) < 1.0F)
	//* 283  563:fload           4
	//* 284  565:invokestatic    #250 <Method float Math.abs(float)>
	//* 285  568:fconst_1        
	//* 286  569:fcmpl           
	//* 287  570:ifge            587
		{
			flag2 = flag3;
	//  288  573:iload           12
	//  289  575:istore          11
			if(Math.abs(f4) < 1.0F)
				break; /* Loop/switch isn't completed */
	//  290  577:fload           5
	//  291  579:invokestatic    #250 <Method float Math.abs(float)>
	//  292  582:fconst_1        
	//  293  583:fcmpl           
	//  294  584:iflt            1155
		}
		flag2 = mListener.onScroll(mCurrentDownEvent, motionevent, f3, f4);
	//  295  587:aload_0         
	//  296  588:getfield        #85  <Field android.view.GestureDetector$OnGestureListener mListener>
	//  297  591:aload_0         
	//  298  592:getfield        #175 <Field MotionEvent mCurrentDownEvent>
	//  299  595:aload_1         
	//  300  596:fload           4
	//  301  598:fload           5
	//  302  600:invokeinterface #244 <Method boolean android.view.GestureDetector$OnGestureListener.onScroll(MotionEvent, MotionEvent, float, float)>
	//  303  605:istore          11
		mLastFocusX = f1;
	//  304  607:aload_0         
	//  305  608:fload_3         
	//  306  609:putfield        #208 <Field float mLastFocusX>
		mLastFocusY = f;
	//  307  612:aload_0         
	//  308  613:fload_2         
	//  309  614:putfield        #212 <Field float mLastFocusY>
		return flag2;
	//  310  617:iload           11
	//  311  619:ireturn         
_L3:
		MotionEvent motionevent1;
		mStillDown = false;
	//  312  620:aload_0         
	//  313  621:iconst_0        
	//  314  622:putfield        #113 <Field boolean mStillDown>
		motionevent1 = MotionEvent.obtain(motionevent);
	//  315  625:aload_1         
	//  316  626:invokestatic    #253 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
	//  317  629:astore          13
		if(mIsDoubleTapping)
	//* 318  631:aload_0         
	//* 319  632:getfield        #111 <Field boolean mIsDoubleTapping>
	//* 320  635:ifeq            655
		{
			flag2 = mDoubleTapListener.onDoubleTapEvent(motionevent) | false;
	//  321  638:aload_0         
	//  322  639:getfield        #237 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
	//  323  642:aload_1         
	//  324  643:invokeinterface #240 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onDoubleTapEvent(MotionEvent)>
	//  325  648:iconst_0        
	//  326  649:ior             
	//  327  650:istore          11
			break MISSING_BLOCK_LABEL_822;
	//  328  652:goto            822
		}
		if(!mInLongPress) goto _L9; else goto _L8
	//  329  655:aload_0         
	//  330  656:getfield        #121 <Field boolean mInLongPress>
	//  331  659:ifeq            678
_L8:
		mHandler.removeMessages(3);
	//  332  662:aload_0         
	//  333  663:getfield        #80  <Field Handler mHandler>
	//  334  666:iconst_3        
	//  335  667:invokevirtual   #102 <Method void Handler.removeMessages(int)>
		mInLongPress = false;
	//  336  670:aload_0         
	//  337  671:iconst_0        
	//  338  672:putfield        #121 <Field boolean mInLongPress>
		  goto _L10
	//* 339  675:goto            798
_L9:
		if(mAlwaysInTapRegion)
	//* 340  678:aload_0         
	//* 341  679:getfield        #115 <Field boolean mAlwaysInTapRegion>
	//* 342  682:ifeq            727
		{
			flag2 = mListener.onSingleTapUp(motionevent);
	//  343  685:aload_0         
	//  344  686:getfield        #85  <Field android.view.GestureDetector$OnGestureListener mListener>
	//  345  689:aload_1         
	//  346  690:invokeinterface #256 <Method boolean android.view.GestureDetector$OnGestureListener.onSingleTapUp(MotionEvent)>
	//  347  695:istore          11
			if(mDeferConfirmSingleTap)
	//* 348  697:aload_0         
	//* 349  698:getfield        #119 <Field boolean mDeferConfirmSingleTap>
	//* 350  701:ifeq            724
			{
				android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener = mDoubleTapListener;
	//  351  704:aload_0         
	//  352  705:getfield        #237 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
	//  353  708:astore          14
				if(ondoubletaplistener != null)
	//* 354  710:aload           14
	//* 355  712:ifnull          724
					ondoubletaplistener.onSingleTapConfirmed(motionevent);
	//  356  715:aload           14
	//  357  717:aload_1         
	//  358  718:invokeinterface #259 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onSingleTapConfirmed(MotionEvent)>
	//  359  723:pop             
			}
			break MISSING_BLOCK_LABEL_822;
	//  360  724:goto            822
		}
		VelocityTracker velocitytracker = mVelocityTracker;
	//  361  727:aload_0         
	//  362  728:getfield        #104 <Field VelocityTracker mVelocityTracker>
	//  363  731:astore          14
		int l = motionevent.getPointerId(0);
	//  364  733:aload_1         
	//  365  734:iconst_0        
	//  366  735:invokevirtual   #222 <Method int MotionEvent.getPointerId(int)>
	//  367  738:istore          6
		velocitytracker.computeCurrentVelocity(1000, mMaximumFlingVelocity);
	//  368  740:aload           14
	//  369  742:sipush          1000
	//  370  745:aload_0         
	//  371  746:getfield        #144 <Field int mMaximumFlingVelocity>
	//  372  749:i2f             
	//  373  750:invokevirtual   #218 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
		f = velocitytracker.getYVelocity(l);
	//  374  753:aload           14
	//  375  755:iload           6
	//  376  757:invokevirtual   #228 <Method float VelocityTracker.getYVelocity(int)>
	//  377  760:fstore_2        
		f1 = velocitytracker.getXVelocity(l);
	//  378  761:aload           14
	//  379  763:iload           6
	//  380  765:invokevirtual   #225 <Method float VelocityTracker.getXVelocity(int)>
	//  381  768:fstore_3        
		if(Math.abs(f) <= (float)mMinimumFlingVelocity && Math.abs(f1) <= (float)mMinimumFlingVelocity) goto _L10; else goto _L11
	//  382  769:fload_2         
	//  383  770:invokestatic    #250 <Method float Math.abs(float)>
	//  384  773:aload_0         
	//  385  774:getfield        #139 <Field int mMinimumFlingVelocity>
	//  386  777:i2f             
	//  387  778:fcmpl           
	//  388  779:ifgt            804
	//  389  782:fload_3         
	//  390  783:invokestatic    #250 <Method float Math.abs(float)>
	//  391  786:aload_0         
	//  392  787:getfield        #139 <Field int mMinimumFlingVelocity>
	//  393  790:i2f             
	//  394  791:fcmpl           
	//  395  792:ifle            798
	//* 396  795:goto            804
_L10:
		flag2 = false;
	//  397  798:iconst_0        
	//  398  799:istore          11
		break MISSING_BLOCK_LABEL_822;
	//  399  801:goto            822
_L11:
		flag2 = mListener.onFling(mCurrentDownEvent, motionevent, f1, f);
	//  400  804:aload_0         
	//  401  805:getfield        #85  <Field android.view.GestureDetector$OnGestureListener mListener>
	//  402  808:aload_0         
	//  403  809:getfield        #175 <Field MotionEvent mCurrentDownEvent>
	//  404  812:aload_1         
	//  405  813:fload_3         
	//  406  814:fload_2         
	//  407  815:invokeinterface #262 <Method boolean android.view.GestureDetector$OnGestureListener.onFling(MotionEvent, MotionEvent, float, float)>
	//  408  820:istore          11
		motionevent = mPreviousUpEvent;
	//  409  822:aload_0         
	//  410  823:getfield        #264 <Field MotionEvent mPreviousUpEvent>
	//  411  826:astore_1        
		if(motionevent != null)
	//* 412  827:aload_1         
	//* 413  828:ifnull          835
			motionevent.recycle();
	//  414  831:aload_1         
	//  415  832:invokevirtual   #265 <Method void MotionEvent.recycle()>
		mPreviousUpEvent = motionevent1;
	//  416  835:aload_0         
	//  417  836:aload           13
	//  418  838:putfield        #264 <Field MotionEvent mPreviousUpEvent>
		motionevent = ((MotionEvent) (mVelocityTracker));
	//  419  841:aload_0         
	//  420  842:getfield        #104 <Field VelocityTracker mVelocityTracker>
	//  421  845:astore_1        
		if(motionevent != null)
	//* 422  846:aload_1         
	//* 423  847:ifnull          859
		{
			((VelocityTracker) (motionevent)).recycle();
	//  424  850:aload_1         
	//  425  851:invokevirtual   #109 <Method void VelocityTracker.recycle()>
			mVelocityTracker = null;
	//  426  854:aload_0         
	//  427  855:aconst_null     
	//  428  856:putfield        #104 <Field VelocityTracker mVelocityTracker>
		}
		mIsDoubleTapping = false;
	//  429  859:aload_0         
	//  430  860:iconst_0        
	//  431  861:putfield        #111 <Field boolean mIsDoubleTapping>
		mDeferConfirmSingleTap = false;
	//  432  864:aload_0         
	//  433  865:iconst_0        
	//  434  866:putfield        #119 <Field boolean mDeferConfirmSingleTap>
		mHandler.removeMessages(1);
	//  435  869:aload_0         
	//  436  870:getfield        #80  <Field Handler mHandler>
	//  437  873:iconst_1        
	//  438  874:invokevirtual   #102 <Method void Handler.removeMessages(int)>
		mHandler.removeMessages(2);
	//  439  877:aload_0         
	//  440  878:getfield        #80  <Field Handler mHandler>
	//  441  881:iconst_2        
	//  442  882:invokevirtual   #102 <Method void Handler.removeMessages(int)>
		return flag2;
	//  443  885:iload           11
	//  444  887:ireturn         
_L2:
		if(mDoubleTapListener == null) goto _L13; else goto _L12
	//  445  888:aload_0         
	//  446  889:getfield        #237 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
	//  447  892:ifnull          1006
_L12:
		flag2 = mHandler.hasMessages(3);
	//  448  895:aload_0         
	//  449  896:getfield        #80  <Field Handler mHandler>
	//  450  899:iconst_3        
	//  451  900:invokevirtual   #269 <Method boolean Handler.hasMessages(int)>
	//  452  903:istore          11
		if(flag2)
	//* 453  905:iload           11
	//* 454  907:ifeq            918
			mHandler.removeMessages(3);
	//  455  910:aload_0         
	//  456  911:getfield        #80  <Field Handler mHandler>
	//  457  914:iconst_3        
	//  458  915:invokevirtual   #102 <Method void Handler.removeMessages(int)>
		motionevent1 = mCurrentDownEvent;
	//  459  918:aload_0         
	//  460  919:getfield        #175 <Field MotionEvent mCurrentDownEvent>
	//  461  922:astore          13
		if(motionevent1 == null) goto _L15; else goto _L14
	//  462  924:aload           13
	//  463  926:ifnull          993
_L14:
		MotionEvent motionevent3 = mPreviousUpEvent;
	//  464  929:aload_0         
	//  465  930:getfield        #264 <Field MotionEvent mPreviousUpEvent>
	//  466  933:astore          14
		if(motionevent3 == null || !flag2 || !isConsideredDoubleTap(motionevent1, motionevent3, motionevent)) goto _L15; else goto _L16
	//  467  935:aload           14
	//  468  937:ifnull          993
	//  469  940:iload           11
	//  470  942:ifeq            993
	//  471  945:aload_0         
	//  472  946:aload           13
	//  473  948:aload           14
	//  474  950:aload_1         
	//  475  951:invokespecial   #271 <Method boolean isConsideredDoubleTap(MotionEvent, MotionEvent, MotionEvent)>
	//  476  954:ifeq            993
_L16:
		boolean flag1;
		mIsDoubleTapping = true;
	//  477  957:aload_0         
	//  478  958:iconst_1        
	//  479  959:putfield        #111 <Field boolean mIsDoubleTapping>
		flag1 = mDoubleTapListener.onDoubleTap(mCurrentDownEvent) | false | mDoubleTapListener.onDoubleTapEvent(motionevent);
	//  480  962:aload_0         
	//  481  963:getfield        #237 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
	//  482  966:aload_0         
	//  483  967:getfield        #175 <Field MotionEvent mCurrentDownEvent>
	//  484  970:invokeinterface #274 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onDoubleTap(MotionEvent)>
	//  485  975:iconst_0        
	//  486  976:ior             
	//  487  977:aload_0         
	//  488  978:getfield        #237 <Field android.view.GestureDetector$OnDoubleTapListener mDoubleTapListener>
	//  489  981:aload_1         
	//  490  982:invokeinterface #240 <Method boolean android.view.GestureDetector$OnDoubleTapListener.onDoubleTapEvent(MotionEvent)>
	//  491  987:ior             
	//  492  988:istore          6
		  goto _L17
	//* 493  990:goto            1009
_L15:
		mHandler.sendEmptyMessageDelayed(3, DOUBLE_TAP_TIMEOUT);
	//  494  993:aload_0         
	//  495  994:getfield        #80  <Field Handler mHandler>
	//  496  997:iconst_3        
	//  497  998:getstatic       #70  <Field int DOUBLE_TAP_TIMEOUT>
	//  498 1001:i2l             
	//  499 1002:invokevirtual   #278 <Method boolean Handler.sendEmptyMessageDelayed(int, long)>
	//  500 1005:pop             
_L13:
		flag1 = false;
	//  501 1006:iconst_0        
	//  502 1007:istore          6
_L17:
		mLastFocusX = f1;
	//  503 1009:aload_0         
	//  504 1010:fload_3         
	//  505 1011:putfield        #208 <Field float mLastFocusX>
		mDownFocusX = f1;
	//  506 1014:aload_0         
	//  507 1015:fload_3         
	//  508 1016:putfield        #210 <Field float mDownFocusX>
		mLastFocusY = f;
	//  509 1019:aload_0         
	//  510 1020:fload_2         
	//  511 1021:putfield        #212 <Field float mLastFocusY>
		mDownFocusY = f;
	//  512 1024:aload_0         
	//  513 1025:fload_2         
	//  514 1026:putfield        #214 <Field float mDownFocusY>
		MotionEvent motionevent2 = mCurrentDownEvent;
	//  515 1029:aload_0         
	//  516 1030:getfield        #175 <Field MotionEvent mCurrentDownEvent>
	//  517 1033:astore          13
		if(motionevent2 != null)
	//* 518 1035:aload           13
	//* 519 1037:ifnull          1045
			motionevent2.recycle();
	//  520 1040:aload           13
	//  521 1042:invokevirtual   #265 <Method void MotionEvent.recycle()>
		mCurrentDownEvent = MotionEvent.obtain(motionevent);
	//  522 1045:aload_0         
	//  523 1046:aload_1         
	//  524 1047:invokestatic    #253 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
	//  525 1050:putfield        #175 <Field MotionEvent mCurrentDownEvent>
		mAlwaysInTapRegion = true;
	//  526 1053:aload_0         
	//  527 1054:iconst_1        
	//  528 1055:putfield        #115 <Field boolean mAlwaysInTapRegion>
		mAlwaysInBiggerTapRegion = true;
	//  529 1058:aload_0         
	//  530 1059:iconst_1        
	//  531 1060:putfield        #117 <Field boolean mAlwaysInBiggerTapRegion>
		mStillDown = true;
	//  532 1063:aload_0         
	//  533 1064:iconst_1        
	//  534 1065:putfield        #113 <Field boolean mStillDown>
		mInLongPress = false;
	//  535 1068:aload_0         
	//  536 1069:iconst_0        
	//  537 1070:putfield        #121 <Field boolean mInLongPress>
		mDeferConfirmSingleTap = false;
	//  538 1073:aload_0         
	//  539 1074:iconst_0        
	//  540 1075:putfield        #119 <Field boolean mDeferConfirmSingleTap>
		if(mIsLongpressEnabled)
	//* 541 1078:aload_0         
	//* 542 1079:getfield        #124 <Field boolean mIsLongpressEnabled>
	//* 543 1082:ifeq            1119
		{
			mHandler.removeMessages(2);
	//  544 1085:aload_0         
	//  545 1086:getfield        #80  <Field Handler mHandler>
	//  546 1089:iconst_2        
	//  547 1090:invokevirtual   #102 <Method void Handler.removeMessages(int)>
			mHandler.sendEmptyMessageAtTime(2, mCurrentDownEvent.getDownTime() + (long)TAP_TIMEOUT + (long)LONGPRESS_TIMEOUT);
	//  548 1093:aload_0         
	//  549 1094:getfield        #80  <Field Handler mHandler>
	//  550 1097:iconst_2        
	//  551 1098:aload_0         
	//  552 1099:getfield        #175 <Field MotionEvent mCurrentDownEvent>
	//  553 1102:invokevirtual   #281 <Method long MotionEvent.getDownTime()>
	//  554 1105:getstatic       #65  <Field int TAP_TIMEOUT>
	//  555 1108:i2l             
	//  556 1109:ladd            
	//  557 1110:getstatic       #60  <Field int LONGPRESS_TIMEOUT>
	//  558 1113:i2l             
	//  559 1114:ladd            
	//  560 1115:invokevirtual   #284 <Method boolean Handler.sendEmptyMessageAtTime(int, long)>
	//  561 1118:pop             
		}
		mHandler.sendEmptyMessageAtTime(1, mCurrentDownEvent.getDownTime() + (long)TAP_TIMEOUT);
	//  562 1119:aload_0         
	//  563 1120:getfield        #80  <Field Handler mHandler>
	//  564 1123:iconst_1        
	//  565 1124:aload_0         
	//  566 1125:getfield        #175 <Field MotionEvent mCurrentDownEvent>
	//  567 1128:invokevirtual   #281 <Method long MotionEvent.getDownTime()>
	//  568 1131:getstatic       #65  <Field int TAP_TIMEOUT>
	//  569 1134:i2l             
	//  570 1135:ladd            
	//  571 1136:invokevirtual   #284 <Method boolean Handler.sendEmptyMessageAtTime(int, long)>
	//  572 1139:pop             
		flag2 = flag1 | mListener.onDown(motionevent);
	//  573 1140:iload           6
	//  574 1142:aload_0         
	//  575 1143:getfield        #85  <Field android.view.GestureDetector$OnGestureListener mListener>
	//  576 1146:aload_1         
	//  577 1147:invokeinterface #287 <Method boolean android.view.GestureDetector$OnGestureListener.onDown(MotionEvent)>
	//  578 1152:ior             
	//  579 1153:istore          11
		return flag2;
	//  580 1155:iload           11
	//  581 1157:ireturn         
	}

	public void setIsLongpressEnabled(boolean flag)
	{
		mIsLongpressEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #124 <Field boolean mIsLongpressEnabled>
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

	GestureDetectorCompat$GestureDetectorCompatImplBase(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener, Handler handler)
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
