// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.view;

import java.util.List;

// Referenced classes of package com.firebase.client.core.view:
//			ViewProcessor, ViewCache

public static class ViewProcessor$ProcessorResult
{

	public final List changes;
	public final ViewCache viewCache;

	public ViewProcessor$ProcessorResult(ViewCache viewcache, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		viewCache = viewcache;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field ViewCache viewCache>
		changes = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field List changes>
	//    8   14:return          
	}
}
