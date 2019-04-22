// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.util.Pair;
import java.util.*;

// Referenced classes of package com.facebook:
//			GraphRequest, GraphResponse, GraphRequestBatch

static final class GraphRequest$5
	implements Runnable
{

	public void run()
	{
		Pair pair;
		for(Iterator iterator = val$callbacks.iterator(); iterator.hasNext(); ((llback)pair.first).onCompleted((GraphResponse)pair.second))
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field ArrayList val$callbacks>
	//*   2    4:invokevirtual   #32  <Method Iterator ArrayList.iterator()>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #38  <Method boolean Iterator.hasNext()>
	//*   6   14:ifeq            49
			pair = (Pair)iterator.next();
	//    7   17:aload_1         
	//    8   18:invokeinterface #42  <Method Object Iterator.next()>
	//    9   23:checkcast       #44  <Class Pair>
	//   10   26:astore_2        

	//   11   27:aload_2         
	//   12   28:getfield        #48  <Field Object Pair.first>
	//   13   31:checkcast       #50  <Class GraphRequest$Callback>
	//   14   34:aload_2         
	//   15   35:getfield        #53  <Field Object Pair.second>
	//   16   38:checkcast       #55  <Class GraphResponse>
	//   17   41:invokeinterface #59  <Method void GraphRequest$Callback.onCompleted(GraphResponse)>
	//*  18   46:goto            8
		for(Iterator iterator1 = val$requests.getCallbacks().iterator(); iterator1.hasNext(); ((ch.Callback)iterator1.next()).onBatchCompleted(val$requests));
	//   19   49:aload_0         
	//   20   50:getfield        #21  <Field GraphRequestBatch val$requests>
	//   21   53:invokevirtual   #65  <Method List GraphRequestBatch.getCallbacks()>
	//   22   56:invokeinterface #68  <Method Iterator List.iterator()>
	//   23   61:astore_1        
	//   24   62:aload_1         
	//   25   63:invokeinterface #38  <Method boolean Iterator.hasNext()>
	//   26   68:ifeq            92
	//   27   71:aload_1         
	//   28   72:invokeinterface #42  <Method Object Iterator.next()>
	//   29   77:checkcast       #70  <Class GraphRequestBatch$Callback>
	//   30   80:aload_0         
	//   31   81:getfield        #21  <Field GraphRequestBatch val$requests>
	//   32   84:invokeinterface #74  <Method void GraphRequestBatch$Callback.onBatchCompleted(GraphRequestBatch)>
	//*  33   89:goto            62
	//   34   92:return          
	}

	final ArrayList val$callbacks;
	final GraphRequestBatch val$requests;

	GraphRequest$5(ArrayList arraylist, GraphRequestBatch graphrequestbatch)
	{
		val$callbacks = arraylist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ArrayList val$callbacks>
		val$requests = graphrequestbatch;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field GraphRequestBatch val$requests>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
