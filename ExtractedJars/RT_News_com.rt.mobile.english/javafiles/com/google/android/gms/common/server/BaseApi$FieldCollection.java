// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server;


// Referenced classes of package com.google.android.gms.common.server:
//			BaseApi

public static class BaseApi$FieldCollection
{

	protected s.Collector getCollector()
	{
		return zzvw;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field BaseApi$BaseApiaryOptions$Collector zzvw>
	//    2    4:areturn         
	}

	protected Object getParent()
	{
		return zzwc;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Object zzwc>
	//    2    4:areturn         
	}

	private final s.Collector zzvw;
	private final Object zzwc;

	protected BaseApi$FieldCollection(Object obj, s.Collector collector)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		Object obj1 = obj;
	//    2    4:aload_1         
	//    3    5:astore_3        
		if(obj == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       12
			obj1 = ((Object) (this));
	//    6   10:aload_0         
	//    7   11:astore_3        
		zzwc = obj1;
	//    8   12:aload_0         
	//    9   13:aload_3         
	//   10   14:putfield        #21  <Field Object zzwc>
		zzvw = collector;
	//   11   17:aload_0         
	//   12   18:aload_2         
	//   13   19:putfield        #23  <Field BaseApi$BaseApiaryOptions$Collector zzvw>
	//   14   22:return          
	}
}
