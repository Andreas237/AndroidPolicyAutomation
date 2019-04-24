// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.Key;
import java.io.File;

// Referenced classes of package com.bumptech.glide.load.engine.cache:
//			DiskCache

public class DiskCacheAdapter
	implements DiskCache
{

	public DiskCacheAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public void clear()
	{
	//    0    0:return          
	}

	public void delete(Key key)
	{
	//    0    0:return          
	}

	public File get(Key key)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void put(Key key, DiskCache.Writer writer)
	{
	//    0    0:return          
	}
}
