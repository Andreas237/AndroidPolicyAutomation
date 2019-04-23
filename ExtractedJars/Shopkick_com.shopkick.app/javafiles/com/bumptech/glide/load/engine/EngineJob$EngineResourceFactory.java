// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;


// Referenced classes of package com.bumptech.glide.load.engine:
//			EngineJob, EngineResource, Resource

static class EngineJob$EngineResourceFactory
{

	public EngineResource build(Resource resource, boolean flag)
	{
		return new EngineResource(resource, flag, true);
	//    0    0:new             #17  <Class EngineResource>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iconst_1        
	//    5    7:invokespecial   #20  <Method void EngineResource(Resource, boolean, boolean)>
	//    6   10:areturn         
	}

	EngineJob$EngineResourceFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
