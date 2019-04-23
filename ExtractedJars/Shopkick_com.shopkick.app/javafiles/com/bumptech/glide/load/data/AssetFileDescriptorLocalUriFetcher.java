// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.data:
//			LocalUriFetcher

public final class AssetFileDescriptorLocalUriFetcher extends LocalUriFetcher
{

	public AssetFileDescriptorLocalUriFetcher(ContentResolver contentresolver, Uri uri)
	{
		super(contentresolver, uri);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #9   <Method void LocalUriFetcher(ContentResolver, Uri)>
	//    4    6:return          
	}

	protected void close(AssetFileDescriptor assetfiledescriptor)
		throws IOException
	{
		assetfiledescriptor.close();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #19  <Method void AssetFileDescriptor.close()>
	//    2    4:return          
	}

	protected volatile void close(Object obj)
		throws IOException
	{
		close((AssetFileDescriptor)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #16  <Class AssetFileDescriptor>
	//    3    5:invokevirtual   #23  <Method void close(AssetFileDescriptor)>
	//    4    8:return          
	}

	public Class getDataClass()
	{
		return android/content/res/AssetFileDescriptor;
	//    0    0:ldc1            #16  <Class AssetFileDescriptor>
	//    1    2:areturn         
	}

	protected AssetFileDescriptor loadResource(Uri uri, ContentResolver contentresolver)
		throws FileNotFoundException
	{
		contentresolver = ((ContentResolver) (contentresolver.openAssetFileDescriptor(uri, "r")));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:ldc1            #35  <String "r">
	//    3    4:invokevirtual   #41  <Method AssetFileDescriptor ContentResolver.openAssetFileDescriptor(Uri, String)>
	//    4    7:astore_2        
		if(contentresolver != null)
	//*   5    8:aload_2         
	//*   6    9:ifnull          14
		{
			return ((AssetFileDescriptor) (contentresolver));
	//    7   12:aload_2         
	//    8   13:areturn         
		} else
		{
			contentresolver = ((ContentResolver) (new StringBuilder()));
	//    9   14:new             #43  <Class StringBuilder>
	//   10   17:dup             
	//   11   18:invokespecial   #45  <Method void StringBuilder()>
	//   12   21:astore_2        
			((StringBuilder) (contentresolver)).append("FileDescriptor is null for: ");
	//   13   22:aload_2         
	//   14   23:ldc1            #47  <String "FileDescriptor is null for: ">
	//   15   25:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   16   28:pop             
			((StringBuilder) (contentresolver)).append(((Object) (uri)));
	//   17   29:aload_2         
	//   18   30:aload_1         
	//   19   31:invokevirtual   #54  <Method StringBuilder StringBuilder.append(Object)>
	//   20   34:pop             
			throw new FileNotFoundException(((StringBuilder) (contentresolver)).toString());
	//   21   35:new             #33  <Class FileNotFoundException>
	//   22   38:dup             
	//   23   39:aload_2         
	//   24   40:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   25   43:invokespecial   #61  <Method void FileNotFoundException(String)>
	//   26   46:athrow          
		}
	}

	protected volatile Object loadResource(Uri uri, ContentResolver contentresolver)
		throws FileNotFoundException
	{
		return ((Object) (loadResource(uri, contentresolver)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #64  <Method AssetFileDescriptor loadResource(Uri, ContentResolver)>
	//    4    6:areturn         
	}
}
