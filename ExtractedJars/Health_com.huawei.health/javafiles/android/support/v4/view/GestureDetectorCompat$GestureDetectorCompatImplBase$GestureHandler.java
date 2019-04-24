// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package android.support.v4.view:
//			GestureDetectorCompat

class GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler extends Handler
{

	public void handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #36  <Field int Message.what>
		{
	//*   2    4:tableswitch     1 3: default 32
	//	               1 35
	//	               2 55
	//	               3 63
	//*   3   32:goto            113
		case 1: // '\001'
			mListener.onShowPress(mCurrentDownEvent);
	//    4   35:aload_0         
	//    5   36:getfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
	//    6   39:getfield        #40  <Field android.view.GestureDetector$OnGestureListener GestureDetectorCompat$GestureDetectorCompatImplBase.mListener>
	//    7   42:aload_0         
	//    8   43:getfield        #16  <Field GestureDetectorCompat$GestureDetectorCompatImplBase this$0>
	//    9   46:getfield        #44  <Field android.view.MotionEvent GestureDetectorCompat$GestureDetectorCompatImplBase.mCurrentDownEvent>
	//   10   49:invokeinterface #50  <Method void android.view.GestureDetector$OnGestureListener.onShowPress(android.view.MotionEvent)>
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
	//   29   94:getfield        #44  <Field android.view.MotionEvent GestureDetectorCompat$GestureDetectorCompatImplBase.mCurrentDownEvent>
	//   30   97:invokeinterface #67  <Method boolean android.view.GestureDetector$OnDoubleTapListener.onSingleTapConfirmed(android.view.MotionEvent)>
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
