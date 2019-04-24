// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.net.Uri;
import com.facebook.LoggingBehavior;
import java.io.*;

// Referenced classes of package com.facebook.internal:
//			FileLruCache, Utility, Logger

class UrlRedirectCache
{

	UrlRedirectCache()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
	//    2    4:return          
	}

	static void cacheUriRedirect(Uri uri, Uri uri1)
	{
		if(uri == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnull          64
_L1:
		Object obj;
		Object obj1;
		if(uri1 == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       9
			return;
	//    4    8:return          
		obj1 = null;
	//    5    9:aconst_null     
	//    6   10:astore_3        
		obj = null;
	//    7   11:aconst_null     
	//    8   12:astore_2        
		try
		{
			uri = ((Uri) (getCache().openPutStream(uri.toString(), REDIRECT_CONTENT_TAG)));
	//    9   13:invokestatic    #42  <Method FileLruCache getCache()>
	//   10   16:aload_0         
	//   11   17:invokevirtual   #45  <Method String Uri.toString()>
	//   12   20:getstatic       #32  <Field String REDIRECT_CONTENT_TAG>
	//   13   23:invokevirtual   #51  <Method OutputStream FileLruCache.openPutStream(String, String)>
	//   14   26:astore_0        
		}
	//*  15   27:aload_0         
	//*  16   28:aload_1         
	//*  17   29:invokevirtual   #45  <Method String Uri.toString()>
	//*  18   32:invokevirtual   #57  <Method byte[] String.getBytes()>
	//*  19   35:invokevirtual   #63  <Method void OutputStream.write(byte[])>
	//*  20   38:aload_0         
	//*  21   39:invokestatic    #69  <Method void Utility.closeQuietly(java.io.Closeable)>
	//*  22   42:return          
	//*  23   43:astore_1        
	//*  24   44:goto            53
	//*  25   47:goto            59
	//*  26   50:astore_1        
	//*  27   51:aload_2         
	//*  28   52:astore_0        
	//*  29   53:aload_0         
	//*  30   54:invokestatic    #69  <Method void Utility.closeQuietly(java.io.Closeable)>
	//*  31   57:aload_1         
	//*  32   58:athrow          
	//*  33   59:aload_0         
	//*  34   60:invokestatic    #69  <Method void Utility.closeQuietly(java.io.Closeable)>
	//*  35   63:return          
	//*  36   64:return          
		// Misplaced declaration of an exception variable
		catch(Uri uri)
	//*  37   65:astore_0        
		{
			uri = ((Uri) (obj1));
	//   38   66:aload_3         
	//   39   67:astore_0        
			continue; /* Loop/switch isn't completed */
	//   40   68:goto            59
		}
		((OutputStream) (uri)).write(uri1.toString().getBytes());
		Utility.closeQuietly(((java.io.Closeable) (uri)));
		return;
		uri1;
		break MISSING_BLOCK_LABEL_53;
		uri1;
		uri = ((Uri) (obj));
		Utility.closeQuietly(((java.io.Closeable) (uri)));
		throw uri1;
_L4:
		Utility.closeQuietly(((java.io.Closeable) (uri)));
		return;
_L2:
		return;
		uri1;
	//   41   71:astore_1        
		if(true) goto _L4; else goto _L3
_L3:
	//*  42   72:goto            47
	}

	static void clearCache()
	{
		try
		{
			getCache().clearCache();
	//    0    0:invokestatic    #42  <Method FileLruCache getCache()>
	//    1    3:invokevirtual   #72  <Method void FileLruCache.clearCache()>
			return;
	//    2    6:return          
		}
		catch(IOException ioexception)
	//*   3    7:astore_0        
		{
			LoggingBehavior loggingbehavior = LoggingBehavior.CACHE;
	//    4    8:getstatic       #78  <Field LoggingBehavior LoggingBehavior.CACHE>
	//    5   11:astore_1        
			String s = TAG;
	//    6   12:getstatic       #20  <Field String TAG>
	//    7   15:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    8   16:new             #15  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #18  <Method void StringBuilder()>
	//   11   23:astore_3        
			stringbuilder.append("clearCache failed ");
	//   12   24:aload_3         
	//   13   25:ldc1            #80  <String "clearCache failed ">
	//   14   27:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			stringbuilder.append(ioexception.getMessage());
	//   16   31:aload_3         
	//   17   32:aload_0         
	//   18   33:invokevirtual   #83  <Method String IOException.getMessage()>
	//   19   36:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
			Logger.log(loggingbehavior, 5, s, stringbuilder.toString());
	//   21   40:aload_1         
	//   22   41:iconst_5        
	//   23   42:aload_2         
	//   24   43:aload_3         
	//   25   44:invokevirtual   #30  <Method String StringBuilder.toString()>
	//   26   47:invokestatic    #89  <Method void Logger.log(LoggingBehavior, int, String, String)>
			return;
	//   27   50:return          
		}
	}

	static FileLruCache getCache()
		throws IOException
	{
		com/facebook/internal/UrlRedirectCache;
	//    0    0:ldc1            #2   <Class UrlRedirectCache>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		FileLruCache filelrucache;
		if(urlRedirectCache == null)
	//*   2    3:getstatic       #91  <Field FileLruCache urlRedirectCache>
	//*   3    6:ifnonnull       29
			urlRedirectCache = new FileLruCache(TAG, new FileLruCache.Limits());
	//    4    9:new             #47  <Class FileLruCache>
	//    5   12:dup             
	//    6   13:getstatic       #20  <Field String TAG>
	//    7   16:new             #93  <Class FileLruCache$Limits>
	//    8   19:dup             
	//    9   20:invokespecial   #94  <Method void FileLruCache$Limits()>
	//   10   23:invokespecial   #97  <Method void FileLruCache(String, FileLruCache$Limits)>
	//   11   26:putstatic       #91  <Field FileLruCache urlRedirectCache>
		filelrucache = urlRedirectCache;
	//   12   29:getstatic       #91  <Field FileLruCache urlRedirectCache>
	//   13   32:astore_0        
		com/facebook/internal/UrlRedirectCache;
	//   14   33:ldc1            #2   <Class UrlRedirectCache>
		JVM INSTR monitorexit ;
	//   15   35:monitorexit     
		return filelrucache;
	//   16   36:aload_0         
	//   17   37:areturn         
		Exception exception;
		exception;
	//   18   38:astore_0        
	//*  19   39:ldc1            #2   <Class UrlRedirectCache>
		throw exception;
	//   20   41:monitorexit     
	//   21   42:aload_0         
	//   22   43:athrow          
	}

	static Uri getRedirectedUri(Uri uri)
	{
		Object obj;
		if(uri == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		obj = ((Object) (uri.toString()));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #45  <Method String Uri.toString()>
	//    6   10:astore_3        
		FileLruCache filelrucache = getCache();
	//    7   11:invokestatic    #42  <Method FileLruCache getCache()>
	//    8   14:astore          5
		boolean flag;
		uri = null;
	//    9   16:aconst_null     
	//   10   17:astore_0        
		flag = false;
	//   11   18:iconst_0        
	//   12   19:istore_1        
_L4:
		Object obj1 = ((Object) (filelrucache.get(((String) (obj)), REDIRECT_CONTENT_TAG)));
	//   13   20:aload           5
	//   14   22:aload_3         
	//   15   23:getstatic       #32  <Field String REDIRECT_CONTENT_TAG>
	//   16   26:invokevirtual   #104 <Method java.io.InputStream FileLruCache.get(String, String)>
	//   17   29:astore          4
		if(obj1 == null) goto _L2; else goto _L1
	//   18   31:aload           4
	//   19   33:ifnull          111
_L1:
		flag = true;
	//   20   36:iconst_1        
	//   21   37:istore_1        
		obj = ((Object) (new InputStreamReader(((java.io.InputStream) (obj1)))));
	//   22   38:new             #106 <Class InputStreamReader>
	//   23   41:dup             
	//   24   42:aload           4
	//   25   44:invokespecial   #109 <Method void InputStreamReader(java.io.InputStream)>
	//   26   47:astore_3        
		uri = ((Uri) (new char[128]));
	//   27   48:sipush          128
	//   28   51:newarray        char[]
	//   29   53:astore_0        
		obj1 = ((Object) (new StringBuilder()));
	//   30   54:new             #15  <Class StringBuilder>
	//   31   57:dup             
	//   32   58:invokespecial   #18  <Method void StringBuilder()>
	//   33   61:astore          4
_L3:
		int i = ((InputStreamReader) (obj)).read(((char []) (uri)), 0, uri.length);
	//   34   63:aload_3         
	//   35   64:aload_0         
	//   36   65:iconst_0        
	//   37   66:aload_0         
	//   38   67:arraylength     
	//   39   68:invokevirtual   #113 <Method int InputStreamReader.read(char[], int, int)>
	//   40   71:istore_2        
		if(i <= 0)
			break MISSING_BLOCK_LABEL_88;
	//   41   72:iload_2         
	//   42   73:ifle            88
		((StringBuilder) (obj1)).append(((char []) (uri)), 0, i);
	//   43   76:aload           4
	//   44   78:aload_0         
	//   45   79:iconst_0        
	//   46   80:iload_2         
	//   47   81:invokevirtual   #116 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//   48   84:pop             
		  goto _L3
	//*  49   85:goto            63
		Utility.closeQuietly(((java.io.Closeable) (obj)));
	//   50   88:aload_3         
	//   51   89:invokestatic    #69  <Method void Utility.closeQuietly(java.io.Closeable)>
		obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   52   92:aload           4
	//   53   94:invokevirtual   #30  <Method String StringBuilder.toString()>
	//   54   97:astore          4
		uri = ((Uri) (obj));
	//   55   99:aload_3         
	//   56  100:astore_0        
		obj = obj1;
	//   57  101:aload           4
	//   58  103:astore_3        
		  goto _L4
	//*  59  104:goto            20
		uri;
	//   60  107:astore_0        
		  goto _L5
	//*  61  108:goto            150
_L2:
		if(!flag)
			break MISSING_BLOCK_LABEL_126;
	//   62  111:iload_1         
	//   63  112:ifeq            126
		obj = ((Object) (Uri.parse(((String) (obj)))));
	//   64  115:aload_3         
	//   65  116:invokestatic    #120 <Method Uri Uri.parse(String)>
	//   66  119:astore_3        
		Utility.closeQuietly(((java.io.Closeable) (uri)));
	//   67  120:aload_0         
	//   68  121:invokestatic    #69  <Method void Utility.closeQuietly(java.io.Closeable)>
		return ((Uri) (obj));
	//   69  124:aload_3         
	//   70  125:areturn         
		Utility.closeQuietly(((java.io.Closeable) (uri)));
	//   71  126:aload_0         
	//   72  127:invokestatic    #69  <Method void Utility.closeQuietly(java.io.Closeable)>
		return null;
	//   73  130:aconst_null     
	//   74  131:areturn         
		Exception exception;
		exception;
	//   75  132:astore          4
		obj = ((Object) (uri));
	//   76  134:aload_0         
	//   77  135:astore_3        
		uri = ((Uri) (exception));
	//   78  136:aload           4
	//   79  138:astore_0        
		  goto _L5
	//*  80  139:goto            150
_L8:
		obj = ((Object) (uri));
	//   81  142:aload_0         
	//   82  143:astore_3        
		  goto _L6
	//*  83  144:goto            158
		uri;
	//   84  147:astore_0        
		obj = null;
	//   85  148:aconst_null     
	//   86  149:astore_3        
_L5:
		Utility.closeQuietly(((java.io.Closeable) (obj)));
	//   87  150:aload_3         
	//   88  151:invokestatic    #69  <Method void Utility.closeQuietly(java.io.Closeable)>
		throw uri;
	//   89  154:aload_0         
	//   90  155:athrow          
_L7:
		obj = null;
	//   91  156:aconst_null     
	//   92  157:astore_3        
_L6:
		Utility.closeQuietly(((java.io.Closeable) (obj)));
	//   93  158:aload_3         
	//   94  159:invokestatic    #69  <Method void Utility.closeQuietly(java.io.Closeable)>
		return null;
	//   95  162:aconst_null     
	//   96  163:areturn         
		uri;
	//   97  164:astore_0        
		  goto _L7
	//*  98  165:goto            156
		IOException ioexception;
		ioexception;
	//   99  168:astore_3        
		  goto _L8
	//* 100  169:goto            142
		uri;
	//  101  172:astore_0        
		  goto _L6
	//* 102  173:goto            158
	}

	private static final String REDIRECT_CONTENT_TAG;
	static final String TAG = "UrlRedirectCache";
	private static volatile FileLruCache urlRedirectCache;

	static 
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #15  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void StringBuilder()>
	//    3    7:astore_0        
		stringbuilder.append(TAG);
	//    4    8:aload_0         
	//    5    9:getstatic       #20  <Field String TAG>
	//    6   12:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append("_Redirect");
	//    8   16:aload_0         
	//    9   17:ldc1            #26  <String "_Redirect">
	//   10   19:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		REDIRECT_CONTENT_TAG = stringbuilder.toString();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #30  <Method String StringBuilder.toString()>
	//   14   27:putstatic       #32  <Field String REDIRECT_CONTENT_TAG>
	//*  15   30:return          
	}
}
