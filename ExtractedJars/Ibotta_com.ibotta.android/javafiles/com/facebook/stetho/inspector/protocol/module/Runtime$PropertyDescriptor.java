// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;


// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			Runtime

private static class Runtime$PropertyDescriptor
{

	public final boolean configurable;
	public final boolean enumerable;
	public final boolean isOwn;
	public String name;
	public Runtime.RemoteObject value;
	public final boolean writable;

	private Runtime$PropertyDescriptor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		isOwn = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #25  <Field boolean isOwn>
		configurable = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #27  <Field boolean configurable>
		enumerable = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #29  <Field boolean enumerable>
		writable = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #31  <Field boolean writable>
	//   14   24:return          
	}

	Runtime$PropertyDescriptor(Runtime._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Runtime$PropertyDescriptor()>
	//    2    4:return          
	}
}
