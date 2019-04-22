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

	public LruResourceCache(long l)
	{
		super(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #13  <Method void LruCache(long)>
	//    3    5:return          
	}

	protected int getSize(Resource resource)
	{
		if(resource == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
			return super.getSize(((Object) (null)));
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #20  <Method int LruCache.getSize(Object)>
	//    5    9:ireturn         
		else
			return resource.getSize();
	//    6   10:aload_1         
	//    7   11:invokeinterface #25  <Method int Resource.getSize()>
	//    8   16:ireturn         
	}

	protected volatile int getSize(Object obj)
	{
		return getSize((Resource)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #22  <Class Resource>
	//    3    5:invokevirtual   #30  <Method int getSize(Resource)>
	//    4    8:ireturn         
	}

	protected void onItemEvicted(Key key, Resource resource)
	{
		key = ((Key) (listener));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field MemoryCache$ResourceRemovedListener listener>
	//    2    4:astore_1        
		if(key != null && resource != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          20
	//*   5    9:aload_2         
	//*   6   10:ifnull          20
			((MemoryCache.ResourceRemovedListener) (key)).onResourceRemoved(resource);
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokeinterface #41  <Method void MemoryCache$ResourceRemovedListener.onResourceRemoved(Resource)>
	//   10   20:return          
	}

	protected volatile void onItemEvicted(Object obj, Object obj1)
	{
		onItemEvicted((Key)obj, (Resource)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #45  <Class Key>
	//    3    5:aload_2         
	//    4    6:checkcast       #22  <Class Resource>
	//    5    9:invokevirtual   #47  <Method void onItemEvicted(Key, Resource)>
	//    6   12:return          
	}

	public volatile Resource put(Key key, Resource resource)
	{
		return (Resource)super.put(((Object) (key)), ((Object) (resource)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #52  <Method Object LruCache.put(Object, Object)>
	//    4    6:checkcast       #22  <Class Resource>
	//    5    9:areturn         
	}

	public volatile Resource remove(Key key)
	{
		return (Resource)super.remove(((Object) (key)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #58  <Method Object LruCache.remove(Object)>
	//    3    5:checkcast       #22  <Class Resource>
	//    4    8:areturn         
	}

	public void setResourceRemovedListener(MemoryCache.ResourceRemovedListener resourceremovedlistener)
	{
		listener = resourceremovedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field MemoryCache$ResourceRemovedListener listener>
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
	//    4    7:invokevirtual   #69  <Method void clearMemory()>
			return;
	//    5   10:return          
		}
		if(i >= 20 || i == 15)
	//*   6   11:iload_1         
	//*   7   12:bipush          20
	//*   8   14:icmpge          23
	//*   9   17:iload_1         
	//*  10   18:bipush          15
	//*  11   20:icmpne          35
			trimToSize(getMaxSize() / 2L);
	//   12   23:aload_0         
	//   13   24:aload_0         
	//   14   25:invokevirtual   #73  <Method long getMaxSize()>
	//   15   28:ldc2w           #74  <Long 2L>
	//   16   31:ldiv            
	//   17   32:invokevirtual   #78  <Method void trimToSize(long)>
	//   18   35:return          
	}

	private MemoryCache.ResourceRemovedListener listener;
}
