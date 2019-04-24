// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook:
//			RequestOutputStream, RequestProgress, GraphRequest

class ProgressNoopOutputStream extends OutputStream
	implements RequestOutputStream
{

	ProgressNoopOutputStream(Handler handler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void OutputStream()>
	//    2    4:aload_0         
	//    3    5:new             #24  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void HashMap()>
	//    6   12:putfield        #27  <Field Map progressMap>
		callbackHandler = handler;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #29  <Field Handler callbackHandler>
	//   10   20:return          
	}

	void addProgress(long l)
	{
		if(currentRequestProgress == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field RequestProgress currentRequestProgress>
	//*   2    4:ifnonnull       44
		{
			currentRequestProgress = new RequestProgress(callbackHandler, currentRequest);
	//    3    7:aload_0         
	//    4    8:new             #36  <Class RequestProgress>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #29  <Field Handler callbackHandler>
	//    8   16:aload_0         
	//    9   17:getfield        #38  <Field GraphRequest currentRequest>
	//   10   20:invokespecial   #41  <Method void RequestProgress(Handler, GraphRequest)>
	//   11   23:putfield        #34  <Field RequestProgress currentRequestProgress>
			progressMap.put(((Object) (currentRequest)), ((Object) (currentRequestProgress)));
	//   12   26:aload_0         
	//   13   27:getfield        #27  <Field Map progressMap>
	//   14   30:aload_0         
	//   15   31:getfield        #38  <Field GraphRequest currentRequest>
	//   16   34:aload_0         
	//   17   35:getfield        #34  <Field RequestProgress currentRequestProgress>
	//   18   38:invokeinterface #47  <Method Object Map.put(Object, Object)>
	//   19   43:pop             
		}
		currentRequestProgress.addToMax(l);
	//   20   44:aload_0         
	//   21   45:getfield        #34  <Field RequestProgress currentRequestProgress>
	//   22   48:lload_1         
	//   23   49:invokevirtual   #50  <Method void RequestProgress.addToMax(long)>
		batchMax = (int)((long)batchMax + l);
	//   24   52:aload_0         
	//   25   53:aload_0         
	//   26   54:getfield        #52  <Field int batchMax>
	//   27   57:i2l             
	//   28   58:lload_1         
	//   29   59:ladd            
	//   30   60:l2i             
	//   31   61:putfield        #52  <Field int batchMax>
	//   32   64:return          
	}

	int getMaxProgress()
	{
		return batchMax;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int batchMax>
	//    2    4:ireturn         
	}

	Map getProgressMap()
	{
		return progressMap;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Map progressMap>
	//    2    4:areturn         
	}

	public void setCurrentRequest(GraphRequest graphrequest)
	{
		currentRequest = graphrequest;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field GraphRequest currentRequest>
		if(graphrequest != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          26
			graphrequest = ((GraphRequest) ((RequestProgress)progressMap.get(((Object) (graphrequest)))));
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field Map progressMap>
	//    7   13:aload_1         
	//    8   14:invokeinterface #64  <Method Object Map.get(Object)>
	//    9   19:checkcast       #36  <Class RequestProgress>
	//   10   22:astore_1        
		else
	//*  11   23:goto            28
			graphrequest = null;
	//   12   26:aconst_null     
	//   13   27:astore_1        
		currentRequestProgress = ((RequestProgress) (graphrequest));
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:putfield        #34  <Field RequestProgress currentRequestProgress>
	//   17   33:return          
	}

	public void write(int i)
	{
		addProgress(1L);
	//    0    0:aload_0         
	//    1    1:lconst_1        
	//    2    2:invokevirtual   #68  <Method void addProgress(long)>
	//    3    5:return          
	}

	public void write(byte abyte0[])
	{
		addProgress(abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:arraylength     
	//    3    3:i2l             
	//    4    4:invokevirtual   #68  <Method void addProgress(long)>
	//    5    7:return          
	}

	public void write(byte abyte0[], int i, int j)
	{
		addProgress(j);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:i2l             
	//    3    3:invokevirtual   #68  <Method void addProgress(long)>
	//    4    6:return          
	}

	private int batchMax;
	private final Handler callbackHandler;
	private GraphRequest currentRequest;
	private RequestProgress currentRequestProgress;
	private final Map progressMap = new HashMap();
}
