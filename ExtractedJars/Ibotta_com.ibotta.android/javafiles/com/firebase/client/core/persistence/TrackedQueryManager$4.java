// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.persistence;

import com.firebase.client.core.utilities.Predicate;

// Referenced classes of package com.firebase.client.core.persistence:
//			TrackedQueryManager, TrackedQuery

static final class TrackedQueryManager$4
	implements Predicate
{

	public boolean evaluate(TrackedQuery trackedquery)
	{
		return TrackedQueryManager.access$000().evaluate(((Object) (trackedquery))) ^ true;
	//    0    0:invokestatic    #20  <Method Predicate TrackedQueryManager.access$000()>
	//    1    3:aload_1         
	//    2    4:invokeinterface #23  <Method boolean Predicate.evaluate(Object)>
	//    3    9:iconst_1        
	//    4   10:ixor            
	//    5   11:ireturn         
	}

	public volatile boolean evaluate(Object obj)
	{
		return evaluate((TrackedQuery)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class TrackedQuery>
	//    3    5:invokevirtual   #27  <Method boolean evaluate(TrackedQuery)>
	//    4    8:ireturn         
	}

	TrackedQueryManager$4()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
