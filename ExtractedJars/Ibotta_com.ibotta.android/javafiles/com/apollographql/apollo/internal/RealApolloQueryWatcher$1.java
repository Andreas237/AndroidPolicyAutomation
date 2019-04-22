// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal;

import com.apollographql.apollo.api.internal.Utils;
import java.util.Set;

// Referenced classes of package com.apollographql.apollo.internal:
//			RealApolloQueryWatcher

class RealApolloQueryWatcher$1
	implements com.apollographql.apollo.cache.normalized.ubscriber
{

	public void onCacheRecordsChanged(Set set)
	{
		if(!Utils.areDisjoint(dependentKeys, set))
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field RealApolloQueryWatcher this$0>
	//*   2    4:getfield        #24  <Field Set RealApolloQueryWatcher.dependentKeys>
	//*   3    7:aload_1         
	//*   4    8:invokestatic    #30  <Method boolean Utils.areDisjoint(Set, Set)>
	//*   5   11:ifne            21
			refetch();
	//    6   14:aload_0         
	//    7   15:getfield        #14  <Field RealApolloQueryWatcher this$0>
	//    8   18:invokevirtual   #33  <Method void RealApolloQueryWatcher.refetch()>
	//    9   21:return          
	}

	final RealApolloQueryWatcher this$0;

	RealApolloQueryWatcher$1()
	{
		this$0 = RealApolloQueryWatcher.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field RealApolloQueryWatcher this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
