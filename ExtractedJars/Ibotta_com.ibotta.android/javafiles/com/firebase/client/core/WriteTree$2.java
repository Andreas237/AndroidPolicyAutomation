// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.core.utilities.Predicate;

// Referenced classes of package com.firebase.client.core:
//			WriteTree, UserWriteRecord

static final class WriteTree$2
	implements Predicate
{

	public boolean evaluate(UserWriteRecord userwriterecord)
	{
		return userwriterecord.isVisible();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method boolean UserWriteRecord.isVisible()>
	//    2    4:ireturn         
	}

	public volatile boolean evaluate(Object obj)
	{
		return evaluate((UserWriteRecord)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class UserWriteRecord>
	//    3    5:invokevirtual   #25  <Method boolean evaluate(UserWriteRecord)>
	//    4    8:ireturn         
	}

	WriteTree$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
