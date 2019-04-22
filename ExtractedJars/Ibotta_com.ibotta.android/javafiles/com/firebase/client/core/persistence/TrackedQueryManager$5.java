// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.persistence;

import com.firebase.client.core.Path;
import java.util.*;

// Referenced classes of package com.firebase.client.core.persistence:
//			TrackedQueryManager, TrackedQuery

class TrackedQueryManager$5
	implements com.firebase.client.core.utilities.tor
{

	public volatile Object onNodeValue(Path path, Object obj, Object obj1)
	{
		return ((Object) (onNodeValue(path, (Map)obj, (Void)obj1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #26  <Class Map>
	//    4    6:aload_3         
	//    5    7:checkcast       #28  <Class Void>
	//    6   10:invokevirtual   #31  <Method Void onNodeValue(Path, Map, Void)>
	//    7   13:areturn         
	}

	public Void onNodeValue(Path path, Map map, Void void1)
	{
		path = ((Path) (map.entrySet().iterator()));
	//    0    0:aload_2         
	//    1    1:invokeinterface #35  <Method Set Map.entrySet()>
	//    2    6:invokeinterface #41  <Method Iterator Set.iterator()>
	//    3   11:astore_1        
		do
		{
			if(!((Iterator) (path)).hasNext())
				break;
	//    4   12:aload_1         
	//    5   13:invokeinterface #47  <Method boolean Iterator.hasNext()>
	//    6   18:ifeq            60
			map = ((Map) ((TrackedQuery)((java.util.Map.Entry)((Iterator) (path)).next()).getValue()));
	//    7   21:aload_1         
	//    8   22:invokeinterface #51  <Method Object Iterator.next()>
	//    9   27:checkcast       #53  <Class java.util.Map$Entry>
	//   10   30:invokeinterface #56  <Method Object java.util.Map$Entry.getValue()>
	//   11   35:checkcast       #58  <Class TrackedQuery>
	//   12   38:astore_2        
			if(!((TrackedQuery) (map)).complete)
	//*  13   39:aload_2         
	//*  14   40:getfield        #62  <Field boolean TrackedQuery.complete>
	//*  15   43:ifne            12
				TrackedQueryManager.access$100(TrackedQueryManager.this, ((TrackedQuery) (map)).setComplete());
	//   16   46:aload_0         
	//   17   47:getfield        #18  <Field TrackedQueryManager this$0>
	//   18   50:aload_2         
	//   19   51:invokevirtual   #66  <Method TrackedQuery TrackedQuery.setComplete()>
	//   20   54:invokestatic    #70  <Method void TrackedQueryManager.access$100(TrackedQueryManager, TrackedQuery)>
		} while(true);
	//   21   57:goto            12
		return null;
	//   22   60:aconst_null     
	//   23   61:areturn         
	}

	final TrackedQueryManager this$0;

	TrackedQueryManager$5()
	{
		this$0 = TrackedQueryManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field TrackedQueryManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
