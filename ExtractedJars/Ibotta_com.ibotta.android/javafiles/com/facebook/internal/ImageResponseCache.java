// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import com.facebook.LoggingBehavior;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.facebook.internal:
//			FileLruCache, Logger, Utility

class ImageResponseCache
{
	private static class BufferedHttpInputStream extends BufferedInputStream
	{

		public void close()
			throws IOException
		{
			super.close();
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void BufferedInputStream.close()>
			Utility.disconnectQuietly(((java.net.URLConnection) (connection)));
		//    2    4:aload_0         
		//    3    5:getfield        #16  <Field HttpURLConnection connection>
		//    4    8:invokestatic    #29  <Method void Utility.disconnectQuietly(java.net.URLConnection)>
		//    5   11:return          
		}

		HttpURLConnection connection;

		BufferedHttpInputStream(InputStream inputstream, HttpURLConnection httpurlconnection)
		{
			super(inputstream, 8192);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:sipush          8192
		//    3    5:invokespecial   #14  <Method void BufferedInputStream(InputStream, int)>
			connection = httpurlconnection;
		//    4    8:aload_0         
		//    5    9:aload_2         
		//    6   10:putfield        #16  <Field HttpURLConnection connection>
		//    7   13:return          
		}
	}


	ImageResponseCache()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	static FileLruCache getCache(Context context)
		throws IOException
	{
		com/facebook/internal/ImageResponseCache;
	//    0    0:ldc1            #2   <Class ImageResponseCache>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(imageCache == null)
	//*   2    3:getstatic       #25  <Field FileLruCache imageCache>
	//*   3    6:ifnonnull       29
			imageCache = new FileLruCache(TAG, new FileLruCache.Limits());
	//    4    9:new             #27  <Class FileLruCache>
	//    5   12:dup             
	//    6   13:getstatic       #29  <Field String TAG>
	//    7   16:new             #31  <Class FileLruCache$Limits>
	//    8   19:dup             
	//    9   20:invokespecial   #32  <Method void FileLruCache$Limits()>
	//   10   23:invokespecial   #35  <Method void FileLruCache(String, FileLruCache$Limits)>
	//   11   26:putstatic       #25  <Field FileLruCache imageCache>
		context = ((Context) (imageCache));
	//   12   29:getstatic       #25  <Field FileLruCache imageCache>
	//   13   32:astore_0        
		com/facebook/internal/ImageResponseCache;
	//   14   33:ldc1            #2   <Class ImageResponseCache>
		JVM INSTR monitorexit ;
	//   15   35:monitorexit     
		return ((FileLruCache) (context));
	//   16   36:aload_0         
	//   17   37:areturn         
		context;
	//   18   38:astore_0        
	//*  19   39:ldc1            #2   <Class ImageResponseCache>
		throw context;
	//   20   41:monitorexit     
	//   21   42:aload_0         
	//   22   43:athrow          
	}

	static InputStream getCachedImageStream(Uri uri, Context context)
	{
		if(uri == null || !isCDNURL(uri))
			break MISSING_BLOCK_LABEL_40;
	//    0    0:aload_0         
	//    1    1:ifnull          40
	//    2    4:aload_0         
	//    3    5:invokestatic    #42  <Method boolean isCDNURL(Uri)>
	//    4    8:ifeq            40
		uri = ((Uri) (getCache(context).get(uri.toString())));
	//    5   11:aload_1         
	//    6   12:invokestatic    #44  <Method FileLruCache getCache(Context)>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #50  <Method String Uri.toString()>
	//    9   19:invokevirtual   #54  <Method InputStream FileLruCache.get(String)>
	//   10   22:astore_0        
		return ((InputStream) (uri));
	//   11   23:aload_0         
	//   12   24:areturn         
		uri;
	//   13   25:astore_0        
		Logger.log(LoggingBehavior.CACHE, 5, TAG, ((IOException) (uri)).toString());
	//   14   26:getstatic       #60  <Field LoggingBehavior LoggingBehavior.CACHE>
	//   15   29:iconst_5        
	//   16   30:getstatic       #29  <Field String TAG>
	//   17   33:aload_0         
	//   18   34:invokevirtual   #61  <Method String IOException.toString()>
	//   19   37:invokestatic    #67  <Method void Logger.log(LoggingBehavior, int, String, String)>
		return null;
	//   20   40:aconst_null     
	//   21   41:areturn         
	}

	static InputStream interceptAndCacheImageStream(Context context, HttpURLConnection httpurlconnection)
		throws IOException
	{
label0:
		{
			if(httpurlconnection.getResponseCode() == 200)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #75  <Method int HttpURLConnection.getResponseCode()>
	//*   2    4:sipush          200
	//*   3    7:icmpne          61
			{
				Uri uri = Uri.parse(httpurlconnection.getURL().toString());
	//    4   10:aload_1         
	//    5   11:invokevirtual   #79  <Method URL HttpURLConnection.getURL()>
	//    6   14:invokevirtual   #82  <Method String URL.toString()>
	//    7   17:invokestatic    #86  <Method Uri Uri.parse(String)>
	//    8   20:astore          4
				InputStream inputstream1 = httpurlconnection.getInputStream();
	//    9   22:aload_1         
	//   10   23:invokevirtual   #90  <Method InputStream HttpURLConnection.getInputStream()>
	//   11   26:astore_3        
				InputStream inputstream = inputstream1;
	//   12   27:aload_3         
	//   13   28:astore_2        
				try
				{
					if(!isCDNURL(uri))
						break label0;
	//   14   29:aload           4
	//   15   31:invokestatic    #42  <Method boolean isCDNURL(Uri)>
	//   16   34:ifeq            63
					context = ((Context) (getCache(context).interceptAndPut(uri.toString(), ((InputStream) (new BufferedHttpInputStream(inputstream1, httpurlconnection))))));
	//   17   37:aload_0         
	//   18   38:invokestatic    #44  <Method FileLruCache getCache(Context)>
	//   19   41:aload           4
	//   20   43:invokevirtual   #50  <Method String Uri.toString()>
	//   21   46:new             #6   <Class ImageResponseCache$BufferedHttpInputStream>
	//   22   49:dup             
	//   23   50:aload_3         
	//   24   51:aload_1         
	//   25   52:invokespecial   #93  <Method void ImageResponseCache$BufferedHttpInputStream(InputStream, HttpURLConnection)>
	//   26   55:invokevirtual   #97  <Method InputStream FileLruCache.interceptAndPut(String, InputStream)>
	//   27   58:astore_0        
				}
	//*  28   59:aload_0         
	//*  29   60:areturn         
	//*  30   61:aconst_null     
	//*  31   62:astore_2        
	//*  32   63:aload_2         
	//*  33   64:areturn         
				// Misplaced declaration of an exception variable
				catch(Context context)
	//*  34   65:astore_0        
				{
					return inputstream1;
	//   35   66:aload_3         
	//   36   67:areturn         
				}
				return ((InputStream) (context));
			}
			inputstream = null;
		}
		return inputstream;
	}

	private static boolean isCDNURL(Uri uri)
	{
		if(uri != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          40
		{
			uri = ((Uri) (uri.getHost()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #100 <Method String Uri.getHost()>
	//    4    8:astore_0        
			if(((String) (uri)).endsWith("fbcdn.net"))
	//*   5    9:aload_0         
	//*   6   10:ldc1            #102 <String "fbcdn.net">
	//*   7   12:invokevirtual   #108 <Method boolean String.endsWith(String)>
	//*   8   15:ifeq            20
				return true;
	//    9   18:iconst_1        
	//   10   19:ireturn         
			if(((String) (uri)).startsWith("fbcdn") && ((String) (uri)).endsWith("akamaihd.net"))
	//*  11   20:aload_0         
	//*  12   21:ldc1            #110 <String "fbcdn">
	//*  13   23:invokevirtual   #113 <Method boolean String.startsWith(String)>
	//*  14   26:ifeq            40
	//*  15   29:aload_0         
	//*  16   30:ldc1            #115 <String "akamaihd.net">
	//*  17   32:invokevirtual   #108 <Method boolean String.endsWith(String)>
	//*  18   35:ifeq            40
				return true;
	//   19   38:iconst_1        
	//   20   39:ireturn         
		}
		return false;
	//   21   40:iconst_0        
	//   22   41:ireturn         
	}

	static final String TAG = "ImageResponseCache";
	private static FileLruCache imageCache;

	static 
	{
	//    0    0:return          
	}
}
