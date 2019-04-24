// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.*;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.ExifOrientationStream;
import java.io.*;

// Referenced classes of package com.bumptech.glide.load.data.mediastore:
//			ThumbnailStreamOpener, ThumbnailQuery

public class ThumbFetcher
	implements DataFetcher
{
	static class ImageThumbnailQuery
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

		ImageThumbnailQuery(ContentResolver contentresolver)
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

	static class VideoThumbnailQuery
		implements ThumbnailQuery
	{

		public Cursor query(Uri uri)
		{
			uri = ((Uri) (uri.getLastPathSegment()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #40  <Method String Uri.getLastPathSegment()>
		//    2    4:astore_1        
			return contentResolver.query(android.provider.MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, PATH_PROJECTION, "kind = 1 AND video_id = ?", new String[] {
				uri
			}, ((String) (null)));
		//    3    5:aload_0         
		//    4    6:getfield        #32  <Field ContentResolver contentResolver>
		//    5    9:getstatic       #46  <Field Uri android.provider.MediaStore$Video$Thumbnails.EXTERNAL_CONTENT_URI>
		//    6   12:getstatic       #25  <Field String[] PATH_PROJECTION>
		//    7   15:ldc1            #15  <String "kind = 1 AND video_id = ?">
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
		private static final String PATH_SELECTION = "kind = 1 AND video_id = ?";
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

		VideoThumbnailQuery(ContentResolver contentresolver)
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


	ThumbFetcher(Uri uri, ThumbnailStreamOpener thumbnailstreamopener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		mediaStoreImageUri = uri;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field Uri mediaStoreImageUri>
		opener = thumbnailstreamopener;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #32  <Field ThumbnailStreamOpener opener>
	//    8   14:return          
	}

	private static ThumbFetcher build(Context context, Uri uri, ThumbnailQuery thumbnailquery)
	{
		com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arraypool = Glide.get(context).getArrayPool();
	//    0    0:aload_0         
	//    1    1:invokestatic    #41  <Method Glide Glide.get(Context)>
	//    2    4:invokevirtual   #45  <Method com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool Glide.getArrayPool()>
	//    3    7:astore_3        
		return new ThumbFetcher(uri, new ThumbnailStreamOpener(Glide.get(context).getRegistry().getImageHeaderParsers(), thumbnailquery, arraypool, context.getContentResolver()));
	//    4    8:new             #2   <Class ThumbFetcher>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:new             #47  <Class ThumbnailStreamOpener>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokestatic    #41  <Method Glide Glide.get(Context)>
	//   11   21:invokevirtual   #51  <Method Registry Glide.getRegistry()>
	//   12   24:invokevirtual   #57  <Method java.util.List Registry.getImageHeaderParsers()>
	//   13   27:aload_2         
	//   14   28:aload_3         
	//   15   29:aload_0         
	//   16   30:invokevirtual   #63  <Method ContentResolver Context.getContentResolver()>
	//   17   33:invokespecial   #66  <Method void ThumbnailStreamOpener(java.util.List, ThumbnailQuery, com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool, ContentResolver)>
	//   18   36:invokespecial   #68  <Method void ThumbFetcher(Uri, ThumbnailStreamOpener)>
	//   19   39:areturn         
	}

	public static ThumbFetcher buildImageFetcher(Context context, Uri uri)
	{
		return build(context, uri, ((ThumbnailQuery) (new ImageThumbnailQuery(context.getContentResolver()))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #9   <Class ThumbFetcher$ImageThumbnailQuery>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:invokevirtual   #63  <Method ContentResolver Context.getContentResolver()>
	//    6   10:invokespecial   #73  <Method void ThumbFetcher$ImageThumbnailQuery(ContentResolver)>
	//    7   13:invokestatic    #75  <Method ThumbFetcher build(Context, Uri, ThumbnailQuery)>
	//    8   16:areturn         
	}

	public static ThumbFetcher buildVideoFetcher(Context context, Uri uri)
	{
		return build(context, uri, ((ThumbnailQuery) (new VideoThumbnailQuery(context.getContentResolver()))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #12  <Class ThumbFetcher$VideoThumbnailQuery>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:invokevirtual   #63  <Method ContentResolver Context.getContentResolver()>
	//    6   10:invokespecial   #77  <Method void ThumbFetcher$VideoThumbnailQuery(ContentResolver)>
	//    7   13:invokestatic    #75  <Method ThumbFetcher build(Context, Uri, ThumbnailQuery)>
	//    8   16:areturn         
	}

	private InputStream openThumbInputStream()
		throws FileNotFoundException
	{
		InputStream inputstream = opener.open(mediaStoreImageUri);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field ThumbnailStreamOpener opener>
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field Uri mediaStoreImageUri>
	//    4    8:invokevirtual   #85  <Method InputStream ThumbnailStreamOpener.open(Uri)>
	//    5   11:astore_3        
		int i = -1;
	//    6   12:iconst_m1       
	//    7   13:istore_1        
		if(inputstream != null)
	//*   8   14:aload_3         
	//*   9   15:ifnull          30
			i = opener.getOrientation(mediaStoreImageUri);
	//   10   18:aload_0         
	//   11   19:getfield        #32  <Field ThumbnailStreamOpener opener>
	//   12   22:aload_0         
	//   13   23:getfield        #30  <Field Uri mediaStoreImageUri>
	//   14   26:invokevirtual   #89  <Method int ThumbnailStreamOpener.getOrientation(Uri)>
	//   15   29:istore_1        
		Object obj = ((Object) (inputstream));
	//   16   30:aload_3         
	//   17   31:astore_2        
		if(i != -1)
	//*  18   32:iload_1         
	//*  19   33:iconst_m1       
	//*  20   34:icmpeq          47
			obj = ((Object) (new ExifOrientationStream(inputstream, i)));
	//   21   37:new             #91  <Class ExifOrientationStream>
	//   22   40:dup             
	//   23   41:aload_3         
	//   24   42:iload_1         
	//   25   43:invokespecial   #94  <Method void ExifOrientationStream(InputStream, int)>
	//   26   46:astore_2        
		return ((InputStream) (obj));
	//   27   47:aload_2         
	//   28   48:areturn         
	}

	public void cancel()
	{
	//    0    0:return          
	}

	public void cleanup()
	{
		if(inputStream != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field InputStream inputStream>
	//*   2    4:ifnull          16
			try
			{
				inputStream.close();
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field InputStream inputStream>
	//    5   11:invokevirtual   #106 <Method void InputStream.close()>
				return;
	//    6   14:return          
			}
			catch(IOException ioexception) { }
	//    7   15:astore_1        
	//    8   16:return          
	}

	public Class getDataClass()
	{
		return java/io/InputStream;
	//    0    0:ldc1            #103 <Class InputStream>
	//    1    2:areturn         
	}

	public DataSource getDataSource()
	{
		return DataSource.LOCAL;
	//    0    0:getstatic       #120 <Field DataSource DataSource.LOCAL>
	//    1    3:areturn         
	}

	public void loadData(Priority priority, com.bumptech.glide.load.data.DataFetcher.DataCallback datacallback)
	{
		try
		{
			inputStream = openThumbInputStream();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #124 <Method InputStream openThumbInputStream()>
	//    3    5:putfield        #101 <Field InputStream inputStream>
		}
	//*   4    8:goto            38
		// Misplaced declaration of an exception variable
		catch(Priority priority)
	//*   5   11:astore_1        
		{
			if(Log.isLoggable("MediaStoreThumbFetcher", 3))
	//*   6   12:ldc1            #17  <String "MediaStoreThumbFetcher">
	//*   7   14:iconst_3        
	//*   8   15:invokestatic    #130 <Method boolean Log.isLoggable(String, int)>
	//*   9   18:ifeq            30
				Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", ((Throwable) (priority)));
	//   10   21:ldc1            #17  <String "MediaStoreThumbFetcher">
	//   11   23:ldc1            #132 <String "Failed to find thumbnail file">
	//   12   25:aload_1         
	//   13   26:invokestatic    #136 <Method int Log.d(String, String, Throwable)>
	//   14   29:pop             
			datacallback.onLoadFailed(((Exception) (priority)));
	//   15   30:aload_2         
	//   16   31:aload_1         
	//   17   32:invokeinterface #142 <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onLoadFailed(Exception)>
			return;
	//   18   37:return          
		}
		datacallback.onDataReady(((Object) (inputStream)));
	//   19   38:aload_2         
	//   20   39:aload_0         
	//   21   40:getfield        #101 <Field InputStream inputStream>
	//   22   43:invokeinterface #146 <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onDataReady(Object)>
	//   23   48:return          
	}

	private static final String TAG = "MediaStoreThumbFetcher";
	private InputStream inputStream;
	private final Uri mediaStoreImageUri;
	private final ThumbnailStreamOpener opener;
}
