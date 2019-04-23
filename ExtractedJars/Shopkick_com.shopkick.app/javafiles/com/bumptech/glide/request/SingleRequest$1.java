// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request;


// Referenced classes of package com.bumptech.glide.request:
//			SingleRequest

class SingleRequest$1
	implements com.bumptech.glide.util.pool.tory
{

	public SingleRequest create()
	{
		return new SingleRequest();
	//    0    0:new             #9   <Class SingleRequest>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void SingleRequest()>
	//    3    7:areturn         
	}

	public volatile Object create()
	{
		return ((Object) (create()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method SingleRequest create()>
	//    2    4:areturn         
	}

	SingleRequest$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
