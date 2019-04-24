// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.data:
//			AssetPathFetcher

public class FileDescriptorAssetPathFetcher extends AssetPathFetcher
{

	public FileDescriptorAssetPathFetcher(AssetManager assetmanager, String s)
	{
		super(assetmanager, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #9   <Method void AssetPathFetcher(AssetManager, String)>
	//    4    6:return          
	}

	protected void close(ParcelFileDescriptor parcelfiledescriptor)
		throws IOException
	{
		parcelfiledescriptor.close();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #19  <Method void ParcelFileDescriptor.close()>
	//    2    4:return          
	}

	protected volatile void close(Object obj)
		throws IOException
	{
		close((ParcelFileDescriptor)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #16  <Class ParcelFileDescriptor>
	//    3    5:invokevirtual   #23  <Method void close(ParcelFileDescriptor)>
	//    4    8:return          
	}

	public Class getDataClass()
	{
		return android/os/ParcelFileDescriptor;
	//    0    0:ldc1            #16  <Class ParcelFileDescriptor>
	//    1    2:areturn         
	}

	protected ParcelFileDescriptor loadResource(AssetManager assetmanager, String s)
		throws IOException
	{
		return assetmanager.openFd(s).getParcelFileDescriptor();
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #37  <Method AssetFileDescriptor AssetManager.openFd(String)>
	//    3    5:invokevirtual   #43  <Method ParcelFileDescriptor AssetFileDescriptor.getParcelFileDescriptor()>
	//    4    8:areturn         
	}

	protected volatile Object loadResource(AssetManager assetmanager, String s)
		throws IOException
	{
		return ((Object) (loadResource(assetmanager, s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #46  <Method ParcelFileDescriptor loadResource(AssetManager, String)>
	//    4    6:areturn         
	}
}
