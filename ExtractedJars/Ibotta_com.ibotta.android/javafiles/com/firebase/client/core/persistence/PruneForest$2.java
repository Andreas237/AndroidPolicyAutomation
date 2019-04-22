// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.persistence;

import com.firebase.client.core.utilities.Predicate;

// Referenced classes of package com.firebase.client.core.persistence:
//			PruneForest

static final class PruneForest$2
	implements Predicate
{

	public boolean evaluate(Boolean boolean1)
	{
		return boolean1.booleanValue();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method boolean Boolean.booleanValue()>
	//    2    4:ireturn         
	}

	public volatile boolean evaluate(Object obj)
	{
		return evaluate((Boolean)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class Boolean>
	//    3    5:invokevirtual   #25  <Method boolean evaluate(Boolean)>
	//    4    8:ireturn         
	}

	PruneForest$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
