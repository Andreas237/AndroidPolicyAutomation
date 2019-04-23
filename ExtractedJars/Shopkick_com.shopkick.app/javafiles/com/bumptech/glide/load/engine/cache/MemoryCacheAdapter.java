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

	public long getCurrentSize()
	{
		return 0L;
	//    0    0:lconst_0        
	//    1    1:lreturn         
	}

	public long getMaxSize()
	{
		return 0L;
	//    0    0:lconst_0        
	//    1    1:lreturn         
	}

	public Resource put(Key key, Resource resource)
	{
		if(resource != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          14
			listener.onResourceRemoved(resource);
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field MemoryCache$ResourceRemovedListener listener>
	//    4    8:aload_2         
	//    5    9:invokeinterface #29  <Method void MemoryCache$ResourceRemovedListener.onResourceRemoved(Resource)>
		return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
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
	//    2    2:putfield        #23  <Field MemoryCache$ResourceRemovedListener listener>
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
