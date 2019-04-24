// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.LruCache;

// Referenced classes of package com.bumptech.glide.load.engine.cache:
//			MemoryCache

public class LruResourceCache extends LruCache
	implements MemoryCache
{

	public LruResourceCache(int i)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #13  <Method void LruCache(int)>
	//    3    5:return          
	}

	protected int getSize(Resource resource)
	{
		return resource.getSize();
	//    0    0:aload_1         
	//    1    1:invokeinterface #21  <Method int Resource.getSize()>
	//    2    6:ireturn         
	}

	public volatile int getSize(Object obj)
	{
		return getSize((Resource)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class Resource>
	//    3    5:invokevirtual   #26  <Method int getSize(Resource)>
	//    4    8:ireturn         
	}

	protected void onItemEvicted(Key key, Resource resource)
	{
		if(listener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field MemoryCache$ResourceRemovedListener listener>
	//*   2    4:ifnull          17
			listener.onResourceRemoved(resource);
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field MemoryCache$ResourceRemovedListener listener>
	//    5   11:aload_2         
	//    6   12:invokeinterface #36  <Method void MemoryCache$ResourceRemovedListener.onResourceRemoved(Resource)>
	//    7   17:return          
	}

	public volatile void onItemEvicted(Object obj, Object obj1)
	{
		onItemEvicted((Key)obj, (Resource)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #40  <Class Key>
	//    3    5:aload_2         
	//    4    6:checkcast       #18  <Class Resource>
	//    5    9:invokevirtual   #42  <Method void onItemEvicted(Key, Resource)>
	//    6   12:return          
	}

	public volatile Resource put(Key key, Resource resource)
	{
		return (Resource)super.put(((Object) (key)), ((Object) (resource)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #47  <Method Object LruCache.put(Object, Object)>
	//    4    6:checkcast       #18  <Class Resource>
	//    5    9:areturn         
	}

	public volatile Resource remove(Key key)
	{
		return (Resource)super.remove(((Object) (key)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #53  <Method Object LruCache.remove(Object)>
	//    3    5:checkcast       #18  <Class Resource>
	//    4    8:areturn         
	}

	public void setResourceRemovedListener(MemoryCache.ResourceRemovedListener resourceremovedlistener)
	{
		listener = resourceremovedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field MemoryCache$ResourceRemovedListener listener>
	//    3    5:return          
	}

	public void trimMemory(int i)
	{
		if(i >= 40)
	//*   0    0:iload_1         
	//*   1    1:bipush          40
	//*   2    3:icmplt          11
		{
			clearMemory();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #64  <Method void clearMemory()>
			return;
	//    5   10:return          
		}
		if(i >= 20)
	//*   6   11:iload_1         
	//*   7   12:bipush          20
	//*   8   14:icmplt          27
			trimToSize(getCurrentSize() / 2);
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #67  <Method int getCurrentSize()>
	//   12   22:iconst_2        
	//   13   23:idiv            
	//   14   24:invokevirtual   #70  <Method void trimToSize(int)>
	//   15   27:return          
	}

	private MemoryCache.ResourceRemovedListener listener;
}
