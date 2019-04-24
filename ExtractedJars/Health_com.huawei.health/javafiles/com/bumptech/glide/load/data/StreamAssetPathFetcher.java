// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.data:
//			AssetPathFetcher

public class StreamAssetPathFetcher extends AssetPathFetcher
{

	public StreamAssetPathFetcher(AssetManager assetmanager, String s)
	{
		super(assetmanager, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #9   <Method void AssetPathFetcher(AssetManager, String)>
	//    4    6:return          
	}

	protected void close(InputStream inputstream)
		throws IOException
	{
		inputstream.close();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #19  <Method void InputStream.close()>
	//    2    4:return          
	}

	protected volatile void close(Object obj)
		throws IOException
	{
		close((InputStream)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #16  <Class InputStream>
	//    3    5:invokevirtual   #23  <Method void close(InputStream)>
	//    4    8:return          
	}

	public Class getDataClass()
	{
		return java/io/InputStream;
	//    0    0:ldc1            #16  <Class InputStream>
	//    1    2:areturn         
	}

	protected InputStream loadResource(AssetManager assetmanager, String s)
		throws IOException
	{
		return assetmanager.open(s);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #37  <Method InputStream AssetManager.open(String)>
	//    3    5:areturn         
	}

	protected volatile Object loadResource(AssetManager assetmanager, String s)
		throws IOException
	{
		return ((Object) (loadResource(assetmanager, s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #40  <Method InputStream loadResource(AssetManager, String)>
	//    4    6:areturn         
	}
}
