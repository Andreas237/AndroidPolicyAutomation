// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.data;


// Referenced classes of package com.bumptech.glide.load.data:
//			DataRewinderRegistry, DataRewinder

static final class DataRewinderRegistry$1
	implements DataRewinder.Factory
{

	public DataRewinder build(Object obj)
	{
		return ((DataRewinder) (new faultRewinder(obj)));
	//    0    0:new             #18  <Class DataRewinderRegistry$DefaultRewinder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #21  <Method void DataRewinderRegistry$DefaultRewinder(Object)>
	//    4    8:areturn         
	}

	public Class getDataClass()
	{
		throw new UnsupportedOperationException("Not implemented");
	//    0    0:new             #27  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #29  <String "Not implemented">
	//    3    6:invokespecial   #32  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	DataRewinderRegistry$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
