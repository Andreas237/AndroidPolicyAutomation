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
		if(progress >= lastReportedProgress + threshold || progress >= maxProgress)
	//*   6   10:aload_0         
	//*   7   11:getfield        #37  <Field long progress>
	//*   8   14:aload_0         
	//*   9   15:getfield        #39  <Field long lastReportedProgress>
	//*  10   18:aload_0         
	//*  11   19:getfield        #32  <Field long threshold>
	//*  12   22:ladd            
	//*  13   23:lcmp            
	//*  14   24:ifge            39
	//*  15   27:aload_0         
	//*  16   28:getfield        #37  <Field long progress>
	//*  17   31:aload_0         
	//*  18   32:getfield        #41  <Field long maxProgress>
	//*  19   35:lcmp            
	//*  20   36:iflt            43
			reportProgress();
	//   21   39:aload_0         
	//   22   40:invokevirtual   #44  <Method void reportProgress()>
	//   23   43:return          
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

	long getMaxProgress()
	{
		return maxProgress;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field long maxProgress>
	//    2    4:lreturn         
	}

	long getProgress()
	{
		return progress;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field long progress>
	//    2    4:lreturn         
	}

	void reportProgress()
	{
		if(progress > lastReportedProgress)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field long progress>
	//*   2    4:aload_0         
	//*   3    5:getfield        #39  <Field long lastReportedProgress>
	//*   4    8:lcmp            
	//*   5    9:ifle            102
		{
			final GraphRequest.OnProgressCallback callbackCopy = ((GraphRequest.OnProgressCallback) (request.getCallback()));
	//    6   12:aload_0         
	//    7   13:getfield        #22  <Field GraphRequest request>
	//    8   16:invokevirtual   #53  <Method GraphRequest$Callback GraphRequest.getCallback()>
	//    9   19:astore          5
			if(maxProgress > 0L && (callbackCopy instanceof GraphRequest.OnProgressCallback))
	//*  10   21:aload_0         
	//*  11   22:getfield        #41  <Field long maxProgress>
	//*  12   25:lconst_0        
	//*  13   26:lcmp            
	//*  14   27:ifle            102
	//*  15   30:aload           5
	//*  16   32:instanceof      #55  <Class GraphRequest$OnProgressCallback>
	//*  17   35:ifeq            102
			{
				final long currentCopy = progress;
	//   18   38:aload_0         
	//   19   39:getfield        #37  <Field long progress>
	//   20   42:lstore_1        
				final long maxProgressCopy = maxProgress;
	//   21   43:aload_0         
	//   22   44:getfield        #41  <Field long maxProgress>
	//   23   47:lstore_3        
				callbackCopy = (GraphRequest.OnProgressCallback)callbackCopy;
	//   24   48:aload           5
	//   25   50:checkcast       #55  <Class GraphRequest$OnProgressCallback>
	//   26   53:astore          5
				if(callbackHandler == null)
	//*  27   55:aload_0         
	//*  28   56:getfield        #24  <Field Handler callbackHandler>
	//*  29   59:ifnonnull       74
					callbackCopy.onProgress(currentCopy, maxProgressCopy);
	//   30   62:aload           5
	//   31   64:lload_1         
	//   32   65:lload_3         
	//   33   66:invokeinterface #59  <Method void GraphRequest$OnProgressCallback.onProgress(long, long)>
				else
	//*  34   71:goto            94
					callbackHandler.post(new Runnable() {

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
	//   35   74:aload_0         
	//   36   75:getfield        #24  <Field Handler callbackHandler>
	//   37   78:new             #6   <Class RequestProgress$1>
	//   38   81:dup             
	//   39   82:aload_0         
	//   40   83:aload           5
	//   41   85:lload_1         
	//   42   86:lload_3         
	//   43   87:invokespecial   #62  <Method void RequestProgress$1(RequestProgress, GraphRequest$OnProgressCallback, long, long)>
	//   44   90:invokevirtual   #68  <Method boolean Handler.post(Runnable)>
	//   45   93:pop             
				lastReportedProgress = progress;
	//   46   94:aload_0         
	//   47   95:aload_0         
	//   48   96:getfield        #37  <Field long progress>
	//   49   99:putfield        #39  <Field long lastReportedProgress>
			}
		}
	//   50  102:return          
	}

	private final Handler callbackHandler;
	private long lastReportedProgress;
	private long maxProgress;
	private long progress;
	private final GraphRequest request;
	private final long threshold = FacebookSdk.getOnProgressThreshold();
}
