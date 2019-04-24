// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.data:
//			LocalUriFetcher

public class FileDescriptorLocalUriFetcher extends LocalUriFetcher
{

	public FileDescriptorLocalUriFetcher(ContentResolver contentresolver, Uri uri)
	{
		super(contentresolver, uri);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #9   <Method void LocalUriFetcher(ContentResolver, Uri)>
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

	protected ParcelFileDescriptor loadResource(Uri uri, ContentResolver contentresolver)
		throws FileNotFoundException
	{
		contentresolver = ((ContentResolver) (contentresolver.openAssetFileDescriptor(uri, "r")));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:ldc1            #35  <String "r">
	//    3    4:invokevirtual   #41  <Method AssetFileDescriptor ContentResolver.openAssetFileDescriptor(Uri, String)>
	//    4    7:astore_2        
		if(contentresolver == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       39
			throw new FileNotFoundException((new StringBuilder()).append("FileDescriptor is null for: ").append(((Object) (uri))).toString());
	//    7   12:new             #33  <Class FileNotFoundException>
	//    8   15:dup             
	//    9   16:new             #43  <Class StringBuilder>
	//   10   19:dup             
	//   11   20:invokespecial   #45  <Method void StringBuilder()>
	//   12   23:ldc1            #47  <String "FileDescriptor is null for: ">
	//   13   25:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #54  <Method StringBuilder StringBuilder.append(Object)>
	//   16   32:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   17   35:invokespecial   #61  <Method void FileNotFoundException(String)>
	//   18   38:athrow          
		else
			return ((AssetFileDescriptor) (contentresolver)).getParcelFileDescriptor();
	//   19   39:aload_2         
	//   20   40:invokevirtual   #67  <Method ParcelFileDescriptor AssetFileDescriptor.getParcelFileDescriptor()>
	//   21   43:areturn         
	}

	protected volatile Object loadResource(Uri uri, ContentResolver contentresolver)
		throws FileNotFoundException
	{
		return ((Object) (loadResource(uri, contentresolver)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #70  <Method ParcelFileDescriptor loadResource(Uri, ContentResolver)>
	//    4    6:areturn         
	}
}
