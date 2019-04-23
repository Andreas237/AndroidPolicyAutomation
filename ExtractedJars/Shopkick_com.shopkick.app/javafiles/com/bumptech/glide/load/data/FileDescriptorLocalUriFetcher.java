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
		if(contentresolver != null)
	//*   5    8:aload_2         
	//*   6    9:ifnull          17
		{
			return ((AssetFileDescriptor) (contentresolver)).getParcelFileDescriptor();
	//    7   12:aload_2         
	//    8   13:invokevirtual   #47  <Method ParcelFileDescriptor AssetFileDescriptor.getParcelFileDescriptor()>
	//    9   16:areturn         
		} else
		{
			contentresolver = ((ContentResolver) (new StringBuilder()));
	//   10   17:new             #49  <Class StringBuilder>
	//   11   20:dup             
	//   12   21:invokespecial   #51  <Method void StringBuilder()>
	//   13   24:astore_2        
			((StringBuilder) (contentresolver)).append("FileDescriptor is null for: ");
	//   14   25:aload_2         
	//   15   26:ldc1            #53  <String "FileDescriptor is null for: ">
	//   16   28:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   17   31:pop             
			((StringBuilder) (contentresolver)).append(((Object) (uri)));
	//   18   32:aload_2         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
	//   21   37:pop             
			throw new FileNotFoundException(((StringBuilder) (contentresolver)).toString());
	//   22   38:new             #33  <Class FileNotFoundException>
	//   23   41:dup             
	//   24   42:aload_2         
	//   25   43:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   26   46:invokespecial   #67  <Method void FileNotFoundException(String)>
	//   27   49:athrow          
		}
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
