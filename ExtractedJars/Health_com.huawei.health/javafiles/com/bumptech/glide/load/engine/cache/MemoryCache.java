// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Resource;

public interface MemoryCache
{
	public static interface ResourceRemovedListener
	{

		public abstract void onResourceRemoved(Resource resource);
	}


	public abstract void clearMemory();

	public abstract int getCurrentSize();

	public abstract int getMaxSize();

	public abstract Resource put(Key key, Resource resource);

	public abstract Resource remove(Key key);

	public abstract void setResourceRemovedListener(ResourceRemovedListener resourceremovedlistener);

	public abstract void setSizeMultiplier(float f);

	public abstract void trimMemory(int i);
}
