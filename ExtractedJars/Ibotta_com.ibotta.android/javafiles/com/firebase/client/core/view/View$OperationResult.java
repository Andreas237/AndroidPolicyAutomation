// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.view;

import java.util.List;

// Referenced classes of package com.firebase.client.core.view:
//			View

public static class View$OperationResult
{

	public final List changes;
	public final List events;

	public View$OperationResult(List list, List list1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		events = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field List events>
		changes = list1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field List changes>
	//    8   14:return          
	}
}
