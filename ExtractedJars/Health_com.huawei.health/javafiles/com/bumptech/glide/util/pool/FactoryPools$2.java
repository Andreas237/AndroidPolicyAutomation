// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util.pool;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.bumptech.glide.util.pool:
//			FactoryPools

static final class FactoryPools$2
	implements ctory
{

	public volatile Object create()
	{
		return ((Object) (create()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method List create()>
	//    2    4:areturn         
	}

	public List create()
	{
		return ((List) (new ArrayList()));
	//    0    0:new             #24  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void ArrayList()>
	//    3    7:areturn         
	}

	FactoryPools$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
