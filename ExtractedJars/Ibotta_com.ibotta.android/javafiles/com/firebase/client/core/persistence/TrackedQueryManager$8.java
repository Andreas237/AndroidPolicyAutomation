// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.persistence;

import com.firebase.client.utilities.Utilities;
import java.util.Comparator;

// Referenced classes of package com.firebase.client.core.persistence:
//			TrackedQueryManager, TrackedQuery

class TrackedQueryManager$8
	implements Comparator
{

	public int compare(TrackedQuery trackedquery, TrackedQuery trackedquery1)
	{
		return Utilities.compareLongs(trackedquery.id, trackedquery1.id);
	//    0    0:aload_1         
	//    1    1:getfield        #29  <Field long TrackedQuery.id>
	//    2    4:aload_2         
	//    3    5:getfield        #29  <Field long TrackedQuery.id>
	//    4    8:invokestatic    #35  <Method int Utilities.compareLongs(long, long)>
	//    5   11:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((TrackedQuery)obj, (TrackedQuery)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class TrackedQuery>
	//    3    5:aload_2         
	//    4    6:checkcast       #25  <Class TrackedQuery>
	//    5    9:invokevirtual   #38  <Method int compare(TrackedQuery, TrackedQuery)>
	//    6   12:ireturn         
	}

	final TrackedQueryManager this$0;

	TrackedQueryManager$8()
	{
		this$0 = TrackedQueryManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field TrackedQueryManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
