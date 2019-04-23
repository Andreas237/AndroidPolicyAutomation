// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.data;


// Referenced classes of package com.bumptech.glide.load.data:
//			DataRewinder, DataRewinderRegistry

private static final class DataRewinderRegistry$DefaultRewinder
	implements DataRewinder
{

	public void cleanup()
	{
	//    0    0:return          
	}

	public Object rewindAndGet()
	{
		return data;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Object data>
	//    2    4:areturn         
	}

	private final Object data;

	DataRewinderRegistry$DefaultRewinder(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		data = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Object data>
	//    5    9:return          
	}
}
