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
	//    1    1:invokespecial   #29  <Method void Object()>
		mediaStoreImageUri = uri;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #31  <Field Uri mediaStoreImageUri>
		opener = thumbnailstreamopener;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #33  <Field ThumbnailStreamOpener opener>
	//    8   14:return          
	}

	private static ThumbFetcher build(Context context, Uri uri, ThumbnailQuery thumbnailquery)
	{
		com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arraypool = Glide.get(context).getArrayPool();
	//    0    0:aload_0         
	//    1    1:invokestatic    #43  <Method Glide Glide.get(Context)>
	//    2    4:invokevirtual   #47  <Method com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool Glide.getArrayPool()>
	//    3    7:astore_3        
		return new ThumbFetcher(uri, new ThumbnailStreamOpener(Glide.get(context).getRegistry().getImageHeaderParsers(), thumbnailquery, arraypool, context.getContentResolver()));
	//    4    8:new             #2   <Class ThumbFetcher>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:new             #49  <Class ThumbnailStreamOpener>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokestatic    #43  <Method Glide Glide.get(Context)>
	//   11   21:invokevirtual   #53  <Method Registry Glide.getRegistry()>
	//   12   24:invokevirtual   #59  <Method java.util.List Registry.getImageHeaderParsers()>
	//   13   27:aload_2         
	//   14   28:aload_3         
	//   15   29:aload_0         
	//   16   30:invokevirtual   #65  <Method ContentResolver Context.getContentResolver()>
	//   17   33:invokespecial   #68  <Method void ThumbnailStreamOpener(java.util.List, ThumbnailQuery, com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool, ContentResolver)>
	//   18   36:invokespecial   #70  <Method void ThumbFetcher(Uri, ThumbnailStreamOpener)>
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
	//    5    7:invokevirtual   #65  <Method ContentResolver Context.getContentResolver()>
	//    6   10:invokespecial   #75  <Method void ThumbFetcher$ImageThumbnailQuery(ContentResolver)>
	//    7   13:invokestatic    #77  <Method ThumbFetcher build(Context, Uri, ThumbnailQuery)>
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
	//    5    7:invokevirtual   #65  <Method ContentResolver Context.getContentResolver()>
	//    6   10:invokespecial   #79  <Method void ThumbFetcher$VideoThumbnailQuery(ContentResolver)>
	//    7   13:invokestatic    #77  <Method ThumbFetcher build(Context, Uri, ThumbnailQuery)>
	//    8   16:areturn         
	}

	private InputStream openThumbInputStream()
		throws FileNotFoundException
	{
		InputStream inputstream = opener.open(mediaStoreImageUri);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ThumbnailStreamOpener opener>
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field Uri mediaStoreImageUri>
	//    4    8:invokevirtual   #87  <Method InputStream ThumbnailStreamOpener.open(Uri)>
	//    5   11:astore_3        
		int i;
		if(inputstream != null)
	//*   6   12:aload_3         
	//*   7   13:ifnull          31
			i = opener.getOrientation(mediaStoreImageUri);
	//    8   16:aload_0         
	//    9   17:getfield        #33  <Field ThumbnailStreamOpener opener>
	//   10   20:aload_0         
	//   11   21:getfield        #31  <Field Uri mediaStoreImageUri>
	//   12   24:invokevirtual   #91  <Method int ThumbnailStreamOpener.getOrientation(Uri)>
	//   13   27:istore_1        
		else
	//*  14   28:goto            33
			i = -1;
	//   15   31:iconst_m1       
	//   16   32:istore_1        
		Object obj = ((Object) (inputstream));
	//   17   33:aload_3         
	//   18   34:astore_2        
		if(i != -1)
	//*  19   35:iload_1         
	//*  20   36:iconst_m1       
	//*  21   37:icmpeq          50
			obj = ((Object) (new ExifOrientationStream(inputstream, i)));
	//   22   40:new             #93  <Class ExifOrientationStream>
	//   23   43:dup             
	//   24   44:aload_3         
	//   25   45:iload_1         
	//   26   46:invokespecial   #96  <Method void ExifOrientationStream(InputStream, int)>
	//   27   49:astore_2        
		return ((InputStream) (obj));
	//   28   50:aload_2         
	//   29   51:areturn         
	}

	public void cancel()
	{
	//    0    0:return          
	}

	public void cleanup()
	{
		InputStream inputstream;
		inputstream = inputStream;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field InputStream inputStream>
	//    2    4:astore_1        
		if(inputstream == null)
			break MISSING_BLOCK_LABEL_13;
	//    3    5:aload_1         
	//    4    6:ifnull          13
		inputstream.close();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #108 <Method void InputStream.close()>
		return;
	//    7   13:return          
		IOException ioexception;
		ioexception;
	//    8   14:astore_1        
	//    9   15:return          
	}

	public Class getDataClass()
	{
		return java/io/InputStream;
	//    0    0:ldc1            #105 <Class InputStream>
	//    1    2:areturn         
	}

	public DataSource getDataSource()
	{
		return DataSource.LOCAL;
	//    0    0:getstatic       #121 <Field DataSource DataSource.LOCAL>
	//    1    3:areturn         
	}

	public void loadData(Priority priority, com.bumptech.glide.load.data.DataFetcher.DataCallback datacallback)
	{
		try
		{
			inputStream = openThumbInputStream();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #125 <Method InputStream openThumbInputStream()>
	//    3    5:putfield        #103 <Field InputStream inputStream>
		}
	//*   4    8:aload_2         
	//*   5    9:aload_0         
	//*   6   10:getfield        #103 <Field InputStream inputStream>
	//*   7   13:invokeinterface #131 <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onDataReady(Object)>
	//*   8   18:return          
		// Misplaced declaration of an exception variable
		catch(Priority priority)
	//*   9   19:astore_1        
		{
			if(Log.isLoggable("MediaStoreThumbFetcher", 3))
	//*  10   20:ldc1            #17  <String "MediaStoreThumbFetcher">
	//*  11   22:iconst_3        
	//*  12   23:invokestatic    #137 <Method boolean Log.isLoggable(String, int)>
	//*  13   26:ifeq            38
				Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", ((Throwable) (priority)));
	//   14   29:ldc1            #17  <String "MediaStoreThumbFetcher">
	//   15   31:ldc1            #139 <String "Failed to find thumbnail file">
	//   16   33:aload_1         
	//   17   34:invokestatic    #143 <Method int Log.d(String, String, Throwable)>
	//   18   37:pop             
			datacallback.onLoadFailed(((Exception) (priority)));
	//   19   38:aload_2         
	//   20   39:aload_1         
	//   21   40:invokeinterface #147 <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onLoadFailed(Exception)>
			return;
	//   22   45:return          
		}
		datacallback.onDataReady(((Object) (inputStream)));
	}

	private static final String TAG = "MediaStoreThumbFetcher";
	private InputStream inputStream;
	private final Uri mediaStoreImageUri;
	private final ThumbnailStreamOpener opener;
}
