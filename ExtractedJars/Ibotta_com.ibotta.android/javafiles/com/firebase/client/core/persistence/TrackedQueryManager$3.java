// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.persistence;

import com.firebase.client.core.utilities.Predicate;

// Referenced classes of package com.firebase.client.core.persistence:
//			TrackedQueryManager, TrackedQuery

static final class TrackedQueryManager$3
	implements Predicate
{

	public boolean evaluate(TrackedQuery trackedquery)
	{
		return trackedquery.active ^ true;
	//    0    0:aload_1         
	//    1    1:getfield        #22  <Field boolean TrackedQuery.active>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:ireturn         
	}

	public volatile boolean evaluate(Object obj)
	{
		return evaluate((TrackedQuery)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class TrackedQuery>
	//    3    5:invokevirtual   #25  <Method boolean evaluate(TrackedQuery)>
	//    4    8:ireturn         
	}

	TrackedQueryManager$3()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
