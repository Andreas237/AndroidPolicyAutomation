// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.os.Handler;
import java.io.*;
import java.util.*;

// Referenced classes of package com.facebook:
//			RequestOutputStream, FacebookSdk, RequestProgress, GraphRequestBatch, 
//			GraphRequest

class ProgressOutputStream extends FilterOutputStream
	implements RequestOutputStream
{

	ProgressOutputStream(OutputStream outputstream, GraphRequestBatch graphrequestbatch, Map map, long l)
	{
		super(outputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void FilterOutputStream(OutputStream)>
		requests = graphrequestbatch;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #27  <Field GraphRequestBatch requests>
		progressMap = map;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #29  <Field Map progressMap>
		maxProgress = l;
	//    9   15:aload_0         
	//   10   16:lload           4
	//   11   18:putfield        #31  <Field long maxProgress>
	//   12   21:aload_0         
	//   13   22:invokestatic    #37  <Method long FacebookSdk.getOnProgressThreshold()>
	//   14   25:putfield        #39  <Field long threshold>
	//   15   28:return          
	}

	private void addProgress(long l)
	{
		if(currentRequestProgress != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field RequestProgress currentRequestProgress>
	//*   2    4:ifnull          15
			currentRequestProgress.addProgress(l);
	//    3    7:aload_0         
	//    4    8:getfield        #53  <Field RequestProgress currentRequestProgress>
	//    5   11:lload_1         
	//    6   12:invokevirtual   #57  <Method void RequestProgress.addProgress(long)>
		batchProgress = batchProgress + l;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #48  <Field long batchProgress>
	//   10   20:lload_1         
	//   11   21:ladd            
	//   12   22:putfield        #48  <Field long batchProgress>
		if(batchProgress >= lastReportedProgress + threshold || batchProgress >= maxProgress)
	//*  13   25:aload_0         
	//*  14   26:getfield        #48  <Field long batchProgress>
	//*  15   29:aload_0         
	//*  16   30:getfield        #59  <Field long lastReportedProgress>
	//*  17   33:aload_0         
	//*  18   34:getfield        #39  <Field long threshold>
	//*  19   37:ladd            
	//*  20   38:lcmp            
	//*  21   39:ifge            54
	//*  22   42:aload_0         
	//*  23   43:getfield        #48  <Field long batchProgress>
	//*  24   46:aload_0         
	//*  25   47:getfield        #31  <Field long maxProgress>
	//*  26   50:lcmp            
	//*  27   51:iflt            58
			reportBatchProgress();
	//   28   54:aload_0         
	//   29   55:invokespecial   #63  <Method void reportBatchProgress()>
	//   30   58:return          
	}

	private void reportBatchProgress()
	{
		if(batchProgress > lastReportedProgress)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field long batchProgress>
	//*   2    4:aload_0         
	//*   3    5:getfield        #59  <Field long lastReportedProgress>
	//*   4    8:lcmp            
	//*   5    9:ifle            114
		{
			Iterator iterator = requests.getCallbacks().iterator();
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field GraphRequestBatch requests>
	//    8   16:invokevirtual   #69  <Method List GraphRequestBatch.getCallbacks()>
	//    9   19:invokeinterface #75  <Method Iterator List.iterator()>
	//   10   24:astore_1        
			do
			{
				if(!iterator.hasNext())
					break;
	//   11   25:aload_1         
	//   12   26:invokeinterface #81  <Method boolean Iterator.hasNext()>
	//   13   31:ifeq            106
				final GraphRequestBatch.OnProgressCallback progressCallback = ((GraphRequestBatch.OnProgressCallback) ((GraphRequestBatch.Callback)iterator.next()));
	//   14   34:aload_1         
	//   15   35:invokeinterface #85  <Method Object Iterator.next()>
	//   16   40:checkcast       #87  <Class GraphRequestBatch$Callback>
	//   17   43:astore_3        
				if(progressCallback instanceof GraphRequestBatch.OnProgressCallback)
	//*  18   44:aload_3         
	//*  19   45:instanceof      #89  <Class GraphRequestBatch$OnProgressCallback>
	//*  20   48:ifeq            25
				{
					Handler handler = requests.getCallbackHandler();
	//   21   51:aload_0         
	//   22   52:getfield        #27  <Field GraphRequestBatch requests>
	//   23   55:invokevirtual   #93  <Method Handler GraphRequestBatch.getCallbackHandler()>
	//   24   58:astore_2        
					progressCallback = (GraphRequestBatch.OnProgressCallback)progressCallback;
	//   25   59:aload_3         
	//   26   60:checkcast       #89  <Class GraphRequestBatch$OnProgressCallback>
	//   27   63:astore_3        
					if(handler == null)
	//*  28   64:aload_2         
	//*  29   65:ifnonnull       89
						progressCallback.onBatchProgress(requests, batchProgress, maxProgress);
	//   30   68:aload_3         
	//   31   69:aload_0         
	//   32   70:getfield        #27  <Field GraphRequestBatch requests>
	//   33   73:aload_0         
	//   34   74:getfield        #48  <Field long batchProgress>
	//   35   77:aload_0         
	//   36   78:getfield        #31  <Field long maxProgress>
	//   37   81:invokeinterface #97  <Method void GraphRequestBatch$OnProgressCallback.onBatchProgress(GraphRequestBatch, long, long)>
					else
	//*  38   86:goto            25
						handler.post(new Runnable() {

							public void run()
							{
								progressCallback.onBatchProgress(requests, batchProgress, maxProgress);
							//    0    0:aload_0         
							//    1    1:getfield        #21  <Field GraphRequestBatch$OnProgressCallback val$progressCallback>
							//    2    4:aload_0         
							//    3    5:getfield        #19  <Field ProgressOutputStream this$0>
							//    4    8:invokestatic    #29  <Method GraphRequestBatch ProgressOutputStream.access$000(ProgressOutputStream)>
							//    5   11:aload_0         
							//    6   12:getfield        #19  <Field ProgressOutputStream this$0>
							//    7   15:invokestatic    #33  <Method long ProgressOutputStream.access$100(ProgressOutputStream)>
							//    8   18:aload_0         
							//    9   19:getfield        #19  <Field ProgressOutputStream this$0>
							//   10   22:invokestatic    #36  <Method long ProgressOutputStream.access$200(ProgressOutputStream)>
							//   11   25:invokeinterface #42  <Method void GraphRequestBatch$OnProgressCallback.onBatchProgress(GraphRequestBatch, long, long)>
							//   12   30:return          
							}

							final ProgressOutputStream this$0;
							final GraphRequestBatch.OnProgressCallback val$progressCallback;

			
			{
				this$0 = ProgressOutputStream.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ProgressOutputStream this$0>
				progressCallback = onprogresscallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field GraphRequestBatch$OnProgressCallback val$progressCallback>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
						}
);
	//   39   89:aload_2         
	//   40   90:new             #8   <Class ProgressOutputStream$1>
	//   41   93:dup             
	//   42   94:aload_0         
	//   43   95:aload_3         
	//   44   96:invokespecial   #100 <Method void ProgressOutputStream$1(ProgressOutputStream, GraphRequestBatch$OnProgressCallback)>
	//   45   99:invokevirtual   #106 <Method boolean Handler.post(Runnable)>
	//   46  102:pop             
				}
			} while(true);
	//   47  103:goto            25
			lastReportedProgress = batchProgress;
	//   48  106:aload_0         
	//   49  107:aload_0         
	//   50  108:getfield        #48  <Field long batchProgress>
	//   51  111:putfield        #59  <Field long lastReportedProgress>
		}
	//   52  114:return          
	}

	public void close()
		throws IOException
	{
		super.close();
	//    0    0:aload_0         
	//    1    1:invokespecial   #111 <Method void FilterOutputStream.close()>
		for(Iterator iterator = progressMap.values().iterator(); iterator.hasNext(); ((RequestProgress)iterator.next()).reportProgress());
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field Map progressMap>
	//    4    8:invokeinterface #117 <Method Collection Map.values()>
	//    5   13:invokeinterface #120 <Method Iterator Collection.iterator()>
	//    6   18:astore_1        
	//    7   19:aload_1         
	//    8   20:invokeinterface #81  <Method boolean Iterator.hasNext()>
	//    9   25:ifeq            43
	//   10   28:aload_1         
	//   11   29:invokeinterface #85  <Method Object Iterator.next()>
	//   12   34:checkcast       #55  <Class RequestProgress>
	//   13   37:invokevirtual   #123 <Method void RequestProgress.reportProgress()>
	//*  14   40:goto            19
		reportBatchProgress();
	//   15   43:aload_0         
	//   16   44:invokespecial   #63  <Method void reportBatchProgress()>
	//   17   47:return          
	}

	long getBatchProgress()
	{
		return batchProgress;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field long batchProgress>
	//    2    4:lreturn         
	}

	long getMaxProgress()
	{
		return maxProgress;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field long maxProgress>
	//    2    4:lreturn         
	}

	public void setCurrentRequest(GraphRequest graphrequest)
	{
		if(graphrequest != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          21
			graphrequest = ((GraphRequest) ((RequestProgress)progressMap.get(((Object) (graphrequest)))));
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field Map progressMap>
	//    4    8:aload_1         
	//    5    9:invokeinterface #132 <Method Object Map.get(Object)>
	//    6   14:checkcast       #55  <Class RequestProgress>
	//    7   17:astore_1        
		else
	//*   8   18:goto            23
			graphrequest = null;
	//    9   21:aconst_null     
	//   10   22:astore_1        
		currentRequestProgress = ((RequestProgress) (graphrequest));
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #53  <Field RequestProgress currentRequestProgress>
	//   14   28:return          
	}

	public void write(int i)
		throws IOException
	{
		out.write(i);
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field OutputStream out>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #142 <Method void OutputStream.write(int)>
		addProgress(1L);
	//    4    8:aload_0         
	//    5    9:lconst_1        
	//    6   10:invokespecial   #143 <Method void addProgress(long)>
	//    7   13:return          
	}

	public void write(byte abyte0[])
		throws IOException
	{
		out.write(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field OutputStream out>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #146 <Method void OutputStream.write(byte[])>
		addProgress(abyte0.length);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:arraylength     
	//    7   11:i2l             
	//    8   12:invokespecial   #143 <Method void addProgress(long)>
	//    9   15:return          
	}

	public void write(byte abyte0[], int i, int j)
		throws IOException
	{
		out.write(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field OutputStream out>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #149 <Method void OutputStream.write(byte[], int, int)>
		addProgress(j);
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:i2l             
	//    9   13:invokespecial   #143 <Method void addProgress(long)>
	//   10   16:return          
	}

	private long batchProgress;
	private RequestProgress currentRequestProgress;
	private long lastReportedProgress;
	private long maxProgress;
	private final Map progressMap;
	private final GraphRequestBatch requests;
	private final long threshold = FacebookSdk.getOnProgressThreshold();


/*
	static GraphRequestBatch access$000(ProgressOutputStream progressoutputstream)
	{
		return progressoutputstream.requests;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field GraphRequestBatch requests>
	//    2    4:areturn         
	}

*/


/*
	static long access$100(ProgressOutputStream progressoutputstream)
	{
		return progressoutputstream.batchProgress;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field long batchProgress>
	//    2    4:lreturn         
	}

*/


/*
	static long access$200(ProgressOutputStream progressoutputstream)
	{
		return progressoutputstream.maxProgress;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field long maxProgress>
	//    2    4:lreturn         
	}

*/
}
