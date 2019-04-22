// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.persistence;

import com.firebase.client.core.Path;
import java.util.*;

// Referenced classes of package com.firebase.client.core.persistence:
//			TrackedQueryManager, TrackedQuery

class TrackedQueryManager$7
	implements com.firebase.client.core.utilities.tor
{

	public volatile Object onNodeValue(Path path, Object obj, Object obj1)
	{
		return ((Object) (onNodeValue(path, (Map)obj, (Void)obj1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #29  <Class Map>
	//    4    6:aload_3         
	//    5    7:checkcast       #31  <Class Void>
	//    6   10:invokevirtual   #34  <Method Void onNodeValue(Path, Map, Void)>
	//    7   13:areturn         
	}

	public Void onNodeValue(Path path, Map map, Void void1)
	{
		for(path = ((Path) (map.values().iterator())); ((Iterator) (path)).hasNext(); val$trackedQueries.add(((Object) (map))))
	//*   0    0:aload_2         
	//*   1    1:invokeinterface #38  <Method Collection Map.values()>
	//*   2    6:invokeinterface #44  <Method Iterator Collection.iterator()>
	//*   3   11:astore_1        
	//*   4   12:aload_1         
	//*   5   13:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            45
			map = ((Map) ((TrackedQuery)((Iterator) (path)).next()));
	//    7   21:aload_1         
	//    8   22:invokeinterface #54  <Method Object Iterator.next()>
	//    9   27:checkcast       #56  <Class TrackedQuery>
	//   10   30:astore_2        

	//   11   31:aload_0         
	//   12   32:getfield        #22  <Field List val$trackedQueries>
	//   13   35:aload_2         
	//   14   36:invokeinterface #62  <Method boolean List.add(Object)>
	//   15   41:pop             
	//*  16   42:goto            12
		return null;
	//   17   45:aconst_null     
	//   18   46:areturn         
	}

	final TrackedQueryManager this$0;
	final List val$trackedQueries;

	TrackedQueryManager$7()
	{
		this$0 = final_trackedquerymanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field TrackedQueryManager this$0>
		val$trackedQueries = List.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field List val$trackedQueries>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
