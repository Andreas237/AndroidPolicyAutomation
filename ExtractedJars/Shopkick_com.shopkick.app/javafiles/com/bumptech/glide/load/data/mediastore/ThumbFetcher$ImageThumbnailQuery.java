// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

// Referenced classes of package com.bumptech.glide.load.data.mediastore:
//			ThumbnailQuery, ThumbFetcher

static class ThumbFetcher$ImageThumbnailQuery
	implements ThumbnailQuery
{

	public Cursor query(Uri uri)
	{
		uri = ((Uri) (uri.getLastPathSegment()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #40  <Method String Uri.getLastPathSegment()>
	//    2    4:astore_1        
		return contentResolver.query(android.provider.MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, PATH_PROJECTION, "kind = 1 AND image_id = ?", new String[] {
			uri
		}, ((String) (null)));
	//    3    5:aload_0         
	//    4    6:getfield        #32  <Field ContentResolver contentResolver>
	//    5    9:getstatic       #46  <Field Uri android.provider.MediaStore$Images$Thumbnails.EXTERNAL_CONTENT_URI>
	//    6   12:getstatic       #25  <Field String[] PATH_PROJECTION>
	//    7   15:ldc1            #15  <String "kind = 1 AND image_id = ?">
	//    8   17:iconst_1        
	//    9   18:anewarray       String[]
	//   10   21:dup             
	//   11   22:iconst_0        
	//   12   23:aload_1         
	//   13   24:aastore         
	//   14   25:aconst_null     
	//   15   26:invokevirtual   #51  <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   16   29:areturn         
	}

	private static final String PATH_PROJECTION[] = {
		"_data"
	};
	private static final String PATH_SELECTION = "kind = 1 AND image_id = ?";
	private final ContentResolver contentResolver;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #23  <String "_data">
	//    5    8:aastore         
	//    6    9:putstatic       #25  <Field String[] PATH_PROJECTION>
	//*   7   12:return          
	}

	ThumbFetcher$ImageThumbnailQuery(ContentResolver contentresolver)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		contentResolver = contentresolver;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field ContentResolver contentResolver>
	//    5    9:return          
	}
}
