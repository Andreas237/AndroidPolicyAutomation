// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.os.Handler;

// Referenced classes of package com.facebook:
//			FacebookSdk, GraphRequest

class RequestProgress
{

	RequestProgress(Handler handler, GraphRequest graphrequest)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		request = graphrequest;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #22  <Field GraphRequest request>
		callbackHandler = handler;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #24  <Field Handler callbackHandler>
	//    8   14:aload_0         
	//    9   15:invokestatic    #30  <Method long FacebookSdk.getOnProgressThreshold()>
	//   10   18:putfield        #32  <Field long threshold>
	//   11   21:return          
	}

	void addProgress(long l)
	{
		progress = progress + l;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #37  <Field long progress>
	//    3    5:lload_1         
	//    4    6:ladd            
	//    5    7:putfield        #37  <Field long progress>
		l = progress;
	//    6   10:aload_0         
	//    7   11:getfield        #37  <Field long progress>
	//    8   14:lstore_1        
		if(l >= lastReportedProgress + threshold || l >= maxProgress)
	//*   9   15:lload_1         
	//*  10   16:aload_0         
	//*  11   17:getfield        #39  <Field long lastReportedProgress>
	//*  12   20:aload_0         
	//*  13   21:getfield        #32  <Field long threshold>
	//*  14   24:ladd            
	//*  15   25:lcmp            
	//*  16   26:ifge            38
	//*  17   29:lload_1         
	//*  18   30:aload_0         
	//*  19   31:getfield        #41  <Field long maxProgress>
	//*  20   34:lcmp            
	//*  21   35:iflt            42
			reportProgress();
	//   22   38:aload_0         
	//   23   39:invokevirtual   #44  <Method void reportProgress()>
	//   24   42:return          
	}

	void addToMax(long l)
	{
		maxProgress = maxProgress + l;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field long maxProgress>
	//    3    5:lload_1         
	//    4    6:ladd            
	//    5    7:putfield        #41  <Field long maxProgress>
	//    6   10:return          
	}

	void reportProgress()
	{
		if(progress > lastReportedProgress)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field long progress>
	//*   2    4:aload_0         
	//*   3    5:getfield        #39  <Field long lastReportedProgress>
	//*   4    8:lcmp            
	//*   5    9:ifle            101
		{
			final GraphRequest.OnProgressCallback callbackCopy = ((GraphRequest.OnProgressCallback) (request.getCallback()));
	//    6   12:aload_0         
	//    7   13:getfield        #22  <Field GraphRequest request>
	//    8   16:invokevirtual   #51  <Method GraphRequest$Callback GraphRequest.getCallback()>
	//    9   19:astore          5
			final long maxProgressCopy = maxProgress;
	//   10   21:aload_0         
	//   11   22:getfield        #41  <Field long maxProgress>
	//   12   25:lstore_1        
			if(maxProgressCopy > 0L && (callbackCopy instanceof GraphRequest.OnProgressCallback))
	//*  13   26:lload_1         
	//*  14   27:lconst_0        
	//*  15   28:lcmp            
	//*  16   29:ifle            101
	//*  17   32:aload           5
	//*  18   34:instanceof      #53  <Class GraphRequest$OnProgressCallback>
	//*  19   37:ifeq            101
			{
				final long currentCopy = progress;
	//   20   40:aload_0         
	//   21   41:getfield        #37  <Field long progress>
	//   22   44:lstore_3        
				callbackCopy = (GraphRequest.OnProgressCallback)callbackCopy;
	//   23   45:aload           5
	//   24   47:checkcast       #53  <Class GraphRequest$OnProgressCallback>
	//   25   50:astore          5
				Handler handler = callbackHandler;
	//   26   52:aload_0         
	//   27   53:getfield        #24  <Field Handler callbackHandler>
	//   28   56:astore          6
				if(handler == null)
	//*  29   58:aload           6
	//*  30   60:ifnonnull       75
					callbackCopy.onProgress(currentCopy, maxProgressCopy);
	//   31   63:aload           5
	//   32   65:lload_3         
	//   33   66:lload_1         
	//   34   67:invokeinterface #57  <Method void GraphRequest$OnProgressCallback.onProgress(long, long)>
				else
	//*  35   72:goto            93
					handler.post(new Runnable() {

						public void run()
						{
							callbackCopy.onProgress(currentCopy, maxProgressCopy);
						//    0    0:aload_0         
						//    1    1:getfield        #24  <Field GraphRequest$OnProgressCallback val$callbackCopy>
						//    2    4:aload_0         
						//    3    5:getfield        #26  <Field long val$currentCopy>
						//    4    8:aload_0         
						//    5    9:getfield        #28  <Field long val$maxProgressCopy>
						//    6   12:invokeinterface #38  <Method void GraphRequest$OnProgressCallback.onProgress(long, long)>
						//    7   17:return          
						}

						final RequestProgress this$0;
						final GraphRequest.OnProgressCallback val$callbackCopy;
						final long val$currentCopy;
						final long val$maxProgressCopy;

			
			{
				this$0 = RequestProgress.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field RequestProgress this$0>
				callbackCopy = onprogresscallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field GraphRequest$OnProgressCallback val$callbackCopy>
				currentCopy = l;
			//    6   10:aload_0         
			//    7   11:lload_3         
			//    8   12:putfield        #26  <Field long val$currentCopy>
				maxProgressCopy = l1;
			//    9   15:aload_0         
			//   10   16:lload           5
			//   11   18:putfield        #28  <Field long val$maxProgressCopy>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #30  <Method void Object()>
			//   14   25:return          
			}
					}
);
	//   36   75:aload           6
	//   37   77:new             #6   <Class RequestProgress$1>
	//   38   80:dup             
	//   39   81:aload_0         
	//   40   82:aload           5
	//   41   84:lload_3         
	//   42   85:lload_1         
	//   43   86:invokespecial   #60  <Method void RequestProgress$1(RequestProgress, GraphRequest$OnProgressCallback, long, long)>
	//   44   89:invokevirtual   #66  <Method boolean Handler.post(Runnable)>
	//   45   92:pop             
				lastReportedProgress = progress;
	//   46   93:aload_0         
	//   47   94:aload_0         
	//   48   95:getfield        #37  <Field long progress>
	//   49   98:putfield        #39  <Field long lastReportedProgress>
			}
		}
	//   50  101:return          
	}

	private final Handler callbackHandler;
	private long lastReportedProgress;
	private long maxProgress;
	private long progress;
	private final GraphRequest request;
	private final long threshold = FacebookSdk.getOnProgressThreshold();
}
