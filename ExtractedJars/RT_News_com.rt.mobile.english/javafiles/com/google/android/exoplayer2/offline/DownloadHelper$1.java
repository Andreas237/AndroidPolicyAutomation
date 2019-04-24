// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;

import android.os.Handler;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.offline:
//			DownloadHelper

class DownloadHelper$1 extends Thread
{

	public void run()
	{
		try
		{
			prepareInternal();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field DownloadHelper this$0>
	//    2    4:invokevirtual   #37  <Method void DownloadHelper.prepareInternal()>
			val$handler.post(new Runnable() {

				public void run()
				{
					callback.onPrepared(this$0);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field DownloadHelper$1 this$1>
				//    2    4:getfield        #24  <Field DownloadHelper$Callback DownloadHelper$1.val$callback>
				//    3    7:aload_0         
				//    4    8:getfield        #17  <Field DownloadHelper$1 this$1>
				//    5   11:getfield        #28  <Field DownloadHelper DownloadHelper$1.this$0>
				//    6   14:invokeinterface #34  <Method void DownloadHelper$Callback.onPrepared(DownloadHelper)>
				//    7   19:return          
				}

				final DownloadHelper._cls1 this$1;

			
			{
				this$1 = DownloadHelper._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DownloadHelper$1 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field Handler val$handler>
	//    5   11:new             #11  <Class DownloadHelper$1$1>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #40  <Method void DownloadHelper$1$1(DownloadHelper$1)>
	//    9   19:invokevirtual   #46  <Method boolean Handler.post(Runnable)>
	//   10   22:pop             
			return;
	//   11   23:return          
		}
		catch(final IOException e)
	//*  12   24:astore_1        
		{
			val$handler.post(new Runnable() {

				public void run()
				{
					callback.onPrepareError(this$0, e);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field DownloadHelper$1 this$1>
				//    2    4:getfield        #28  <Field DownloadHelper$Callback DownloadHelper$1.val$callback>
				//    3    7:aload_0         
				//    4    8:getfield        #19  <Field DownloadHelper$1 this$1>
				//    5   11:getfield        #32  <Field DownloadHelper DownloadHelper$1.this$0>
				//    6   14:aload_0         
				//    7   15:getfield        #21  <Field IOException val$e>
				//    8   18:invokeinterface #38  <Method void DownloadHelper$Callback.onPrepareError(DownloadHelper, IOException)>
				//    9   23:return          
				}

				final DownloadHelper._cls1 this$1;
				final IOException val$e;

			
			{
				this$1 = DownloadHelper._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field DownloadHelper$1 this$1>
				e = ioexception;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field IOException val$e>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   13   25:aload_0         
	//   14   26:getfield        #25  <Field Handler val$handler>
	//   15   29:new             #13  <Class DownloadHelper$1$2>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:invokespecial   #49  <Method void DownloadHelper$1$2(DownloadHelper$1, IOException)>
	//   20   38:invokevirtual   #46  <Method boolean Handler.post(Runnable)>
	//   21   41:pop             
		}
	//   22   42:return          
	}

	final DownloadHelper this$0;
	final llback val$callback;
	final Handler val$handler;

	DownloadHelper$1()
	{
		this$0 = final_downloadhelper;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field DownloadHelper this$0>
		val$handler = handler1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field Handler val$handler>
		val$callback = llback.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field DownloadHelper$Callback val$callback>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #30  <Method void Thread()>
	//   11   19:return          
	}
}
