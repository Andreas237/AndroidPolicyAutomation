// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.screencast;

import android.os.Handler;
import android.os.HandlerThread;

// Referenced classes of package com.facebook.stetho.inspector.screencast:
//			ScreencastDispatcher

private class ScreencastDispatcher$CancellationRunnable
	implements Runnable
{

	public void run()
	{
		ScreencastDispatcher.access$1800(ScreencastDispatcher.this).interrupt();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ScreencastDispatcher this$0>
	//    2    4:invokestatic    #27  <Method HandlerThread ScreencastDispatcher.access$1800(ScreencastDispatcher)>
	//    3    7:invokevirtual   #32  <Method void HandlerThread.interrupt()>
		ScreencastDispatcher.access$1700(ScreencastDispatcher.this).removeCallbacks(((Runnable) (ScreencastDispatcher.access$1900(ScreencastDispatcher.this))));
	//    4   10:aload_0         
	//    5   11:getfield        #15  <Field ScreencastDispatcher this$0>
	//    6   14:invokestatic    #36  <Method Handler ScreencastDispatcher.access$1700(ScreencastDispatcher)>
	//    7   17:aload_0         
	//    8   18:getfield        #15  <Field ScreencastDispatcher this$0>
	//    9   21:invokestatic    #40  <Method ScreencastDispatcher$BitmapFetchRunnable ScreencastDispatcher.access$1900(ScreencastDispatcher)>
	//   10   24:invokevirtual   #46  <Method void Handler.removeCallbacks(Runnable)>
		ScreencastDispatcher.access$500(ScreencastDispatcher.this).removeCallbacks(((Runnable) (ScreencastDispatcher.access$300(ScreencastDispatcher.this))));
	//   11   27:aload_0         
	//   12   28:getfield        #15  <Field ScreencastDispatcher this$0>
	//   13   31:invokestatic    #49  <Method Handler ScreencastDispatcher.access$500(ScreencastDispatcher)>
	//   14   34:aload_0         
	//   15   35:getfield        #15  <Field ScreencastDispatcher this$0>
	//   16   38:invokestatic    #53  <Method ScreencastDispatcher$EventDispatchRunnable ScreencastDispatcher.access$300(ScreencastDispatcher)>
	//   17   41:invokevirtual   #46  <Method void Handler.removeCallbacks(Runnable)>
		ScreencastDispatcher.access$602(ScreencastDispatcher.this, false);
	//   18   44:aload_0         
	//   19   45:getfield        #15  <Field ScreencastDispatcher this$0>
	//   20   48:iconst_0        
	//   21   49:invokestatic    #57  <Method boolean ScreencastDispatcher.access$602(ScreencastDispatcher, boolean)>
	//   22   52:pop             
		ScreencastDispatcher.access$1802(ScreencastDispatcher.this, ((HandlerThread) (null)));
	//   23   53:aload_0         
	//   24   54:getfield        #15  <Field ScreencastDispatcher this$0>
	//   25   57:aconst_null     
	//   26   58:invokestatic    #61  <Method HandlerThread ScreencastDispatcher.access$1802(ScreencastDispatcher, HandlerThread)>
	//   27   61:pop             
		ScreencastDispatcher.access$802(ScreencastDispatcher.this, ((android.graphics.Bitmap) (null)));
	//   28   62:aload_0         
	//   29   63:getfield        #15  <Field ScreencastDispatcher this$0>
	//   30   66:aconst_null     
	//   31   67:invokestatic    #65  <Method android.graphics.Bitmap ScreencastDispatcher.access$802(ScreencastDispatcher, android.graphics.Bitmap)>
	//   32   70:pop             
		ScreencastDispatcher.access$1002(ScreencastDispatcher.this, ((android.graphics.Canvas) (null)));
	//   33   71:aload_0         
	//   34   72:getfield        #15  <Field ScreencastDispatcher this$0>
	//   35   75:aconst_null     
	//   36   76:invokestatic    #69  <Method android.graphics.Canvas ScreencastDispatcher.access$1002(ScreencastDispatcher, android.graphics.Canvas)>
	//   37   79:pop             
		ScreencastDispatcher.access$1302(ScreencastDispatcher.this, ((java.io.ByteArrayOutputStream) (null)));
	//   38   80:aload_0         
	//   39   81:getfield        #15  <Field ScreencastDispatcher this$0>
	//   40   84:aconst_null     
	//   41   85:invokestatic    #73  <Method java.io.ByteArrayOutputStream ScreencastDispatcher.access$1302(ScreencastDispatcher, java.io.ByteArrayOutputStream)>
	//   42   88:pop             
	//   43   89:return          
	}

	final ScreencastDispatcher this$0;

	private ScreencastDispatcher$CancellationRunnable()
	{
		this$0 = ScreencastDispatcher.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ScreencastDispatcher this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	ScreencastDispatcher$CancellationRunnable(ScreencastDispatcher._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void ScreencastDispatcher$CancellationRunnable(ScreencastDispatcher)>
	//    3    5:return          
	}
}
