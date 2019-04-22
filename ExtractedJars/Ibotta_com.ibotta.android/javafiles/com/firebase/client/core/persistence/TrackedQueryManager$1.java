// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.persistence;

import com.firebase.client.core.utilities.Predicate;
import com.firebase.client.core.view.QueryParams;
import java.util.Map;

// Referenced classes of package com.firebase.client.core.persistence:
//			TrackedQueryManager, TrackedQuery

static final class TrackedQueryManager$1
	implements Predicate
{

	public volatile boolean evaluate(Object obj)
	{
		return evaluate((Map)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class Map>
	//    3    5:invokevirtual   #21  <Method boolean evaluate(Map)>
	//    4    8:ireturn         
	}

	public boolean evaluate(Map map)
	{
		map = ((Map) ((TrackedQuery)map.get(((Object) (QueryParams.DEFAULT_PARAMS)))));
	//    0    0:aload_1         
	//    1    1:getstatic       #27  <Field QueryParams QueryParams.DEFAULT_PARAMS>
	//    2    4:invokeinterface #31  <Method Object Map.get(Object)>
	//    3    9:checkcast       #33  <Class TrackedQuery>
	//    4   12:astore_1        
		return map != null && ((TrackedQuery) (map)).complete;
	//    5   13:aload_1         
	//    6   14:ifnull          26
	//    7   17:aload_1         
	//    8   18:getfield        #37  <Field boolean TrackedQuery.complete>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	TrackedQueryManager$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
