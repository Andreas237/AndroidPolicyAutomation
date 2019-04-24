// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Resource;

// Referenced classes of package com.bumptech.glide.load.engine.cache:
//			MemoryCache

public class MemoryCacheAdapter
	implements MemoryCache
{

	public MemoryCacheAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public void clearMemory()
	{
	//    0    0:return          
	}

	public int getCurrentSize()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getMaxSize()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Resource put(Key key, Resource resource)
	{
		listener.onResourceRemoved(resource);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MemoryCache$ResourceRemovedListener listener>
	//    2    4:aload_2         
	//    3    5:invokeinterface #27  <Method void MemoryCache$ResourceRemovedListener.onResourceRemoved(Resource)>
		return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
	}

	public Resource remove(Key key)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void setResourceRemovedListener(MemoryCache.ResourceRemovedListener resourceremovedlistener)
	{
		listener = resourceremovedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field MemoryCache$ResourceRemovedListener listener>
	//    3    5:return          
	}

	public void setSizeMultiplier(float f)
	{
	//    0    0:return          
	}

	public void trimMemory(int i)
	{
	//    0    0:return          
	}

	private MemoryCache.ResourceRemovedListener listener;
}
