// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import java.util.List;

// Referenced classes of package com.firebase.jobdispatcher:
//			JobTrigger

public static final class JobTrigger$ContentUriTrigger extends JobTrigger
{

	public List getUris()
	{
		return uris;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field List uris>
	//    2    4:areturn         
	}

	private final List uris;

	JobTrigger$ContentUriTrigger(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void JobTrigger()>
		uris = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field List uris>
	//    5    9:return          
	}
}
