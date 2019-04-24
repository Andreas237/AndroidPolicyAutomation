// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package android.support.v4.view:
//			GestureDetectorCompat

private class GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler extends Handler
{

	public void handleMessage(Message message)
	{
		message.what;
	//    0    0:aload_1         
	//    1    1:getfield        #36  <Field int Message.what>
		JVM INSTR tableswitch 1 3: default 32
	//	               1 59
	//	               2 79
	//	               3 87;
	//    2    4:tableswitch     1 3: default 32
	//	               1 59
	//	               2 79
	//	               3 87
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
	//   20   70:getfield        #65  <Field android.view.MotionEvent GestureDetectorCompat$GestureDetectorCompatImplBase.mCurrentDownEvent>
	//   21   73:invokeinterface #71  <Method void android.view.GestureDetector$OnGestureListener.onShowPress(android.view.MotionEvent)>
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
	//   40  118:getfield        #65  <Field android.view.MotionEvent GestureDetectorCompat$GestureDetectorCompatImplBase.mCurrentDownEvent>
	//   41  121:invokeinterface #88  <Method boolean android.view.GestureDetector$OnDoubleTapListener.onSingleTapConfirmed(android.view.MotionEvent)>
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

	final GestureDetectorCompat.GestureDetectorCompatImplBase this$0;

	GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler()
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

	GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler(Handler handler)
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
