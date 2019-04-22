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
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #36  <Field int Message.what>
		{
	//*   2    4:tableswitch     1 3: default 32
	//	               1 123
	//	               2 115
	//	               3 65
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
	//   34   96:getfield        #69  <Field android.view.MotionEvent GestureDetectorCompat$GestureDetectorCompatImplBase.mCurrentDownEvent>
	//   35   99:invokeinterface #75  <Method boolean android.view.GestureDetector$OnDoubleTapListener.onSingleTapConfirmed(android.view.MotionEvent)>
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
	//   52  134:getfield        #69  <Field android.view.MotionEvent GestureDetectorCompat$GestureDetectorCompatImplBase.mCurrentDownEvent>
	//   53  137:invokeinterface #91  <Method void android.view.GestureDetector$OnGestureListener.onShowPress(android.view.MotionEvent)>
			break;
		}
	//   54  142:return          
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
