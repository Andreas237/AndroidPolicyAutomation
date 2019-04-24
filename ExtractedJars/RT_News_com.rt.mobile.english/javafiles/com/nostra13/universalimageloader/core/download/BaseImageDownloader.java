// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.nostra13.universalimageloader.core.download;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.nostra13.universalimageloader.core.assist.ContentLengthInputStream;
import com.nostra13.universalimageloader.utils.IoUtils;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.nostra13.universalimageloader.core.download:
//			ImageDownloader

public class BaseImageDownloader
	implements ImageDownloader
{

	public BaseImageDownloader(Context context1)
	{
		this(context1, 5000, 20000);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:sipush          5000
	//    3    5:sipush          20000
	//    4    8:invokespecial   #34  <Method void BaseImageDownloader(Context, int, int)>
	//    5   11:return          
	}

	public BaseImageDownloader(Context context1, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		context = context1.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #44  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #46  <Field Context context>
		connectTimeout = i;
	//    6   12:aload_0         
	//    7   13:iload_2         
	//    8   14:putfield        #48  <Field int connectTimeout>
		readTimeout = j;
	//    9   17:aload_0         
	//   10   18:iload_3         
	//   11   19:putfield        #50  <Field int readTimeout>
	//   12   22:return          
	}

	private InputStream getVideoThumbnailStream(String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 8)
	//*   0    0:getstatic       #60  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          8
	//*   2    5:icmplt          48
		{
			s = ((String) (ThumbnailUtils.createVideoThumbnail(s, 2)));
	//    3    8:aload_1         
	//    4    9:iconst_2        
	//    5   10:invokestatic    #66  <Method Bitmap ThumbnailUtils.createVideoThumbnail(String, int)>
	//    6   13:astore_1        
			if(s != null)
	//*   7   14:aload_1         
	//*   8   15:ifnull          48
			{
				ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    9   18:new             #68  <Class ByteArrayOutputStream>
	//   10   21:dup             
	//   11   22:invokespecial   #69  <Method void ByteArrayOutputStream()>
	//   12   25:astore_2        
				((Bitmap) (s)).compress(android.graphics.Bitmap.CompressFormat.PNG, 0, ((java.io.OutputStream) (bytearrayoutputstream)));
	//   13   26:aload_1         
	//   14   27:getstatic       #75  <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.PNG>
	//   15   30:iconst_0        
	//   16   31:aload_2         
	//   17   32:invokevirtual   #81  <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
	//   18   35:pop             
				return ((InputStream) (new ByteArrayInputStream(bytearrayoutputstream.toByteArray())));
	//   19   36:new             #83  <Class ByteArrayInputStream>
	//   20   39:dup             
	//   21   40:aload_2         
	//   22   41:invokevirtual   #87  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   23   44:invokespecial   #90  <Method void ByteArrayInputStream(byte[])>
	//   24   47:areturn         
			}
		}
		return null;
	//   25   48:aconst_null     
	//   26   49:areturn         
	}

	private boolean isVideoContentUri(Uri uri)
	{
		uri = ((Uri) (context.getContentResolver().getType(uri)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Context context>
	//    2    4:invokevirtual   #97  <Method ContentResolver Context.getContentResolver()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #103 <Method String ContentResolver.getType(Uri)>
	//    5   11:astore_1        
		return uri != null && ((String) (uri)).startsWith("video/");
	//    6   12:aload_1         
	//    7   13:ifnull          27
	//    8   16:aload_1         
	//    9   17:ldc1            #105 <String "video/">
	//   10   19:invokevirtual   #111 <Method boolean String.startsWith(String)>
	//   11   22:ifeq            27
	//   12   25:iconst_1        
	//   13   26:ireturn         
	//   14   27:iconst_0        
	//   15   28:ireturn         
	}

	private boolean isVideoFileUri(String s)
	{
		s = MimeTypeMap.getFileExtensionFromUrl(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #118 <Method String MimeTypeMap.getFileExtensionFromUrl(String)>
	//    2    4:astore_1        
		s = MimeTypeMap.getSingleton().getMimeTypeFromExtension(s);
	//    3    5:invokestatic    #122 <Method MimeTypeMap MimeTypeMap.getSingleton()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #125 <Method String MimeTypeMap.getMimeTypeFromExtension(String)>
	//    6   12:astore_1        
		return s != null && s.startsWith("video/");
	//    7   13:aload_1         
	//    8   14:ifnull          28
	//    9   17:aload_1         
	//   10   18:ldc1            #105 <String "video/">
	//   11   20:invokevirtual   #111 <Method boolean String.startsWith(String)>
	//   12   23:ifeq            28
	//   13   26:iconst_1        
	//   14   27:ireturn         
	//   15   28:iconst_0        
	//   16   29:ireturn         
	}

	protected HttpURLConnection createConnection(String s, Object obj)
		throws IOException
	{
		s = ((String) ((HttpURLConnection)(new URL(Uri.encode(s, "@#&=*+-_.,:!?()/~'%"))).openConnection()));
	//    0    0:new             #131 <Class URL>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc1            #10  <String "@#&=*+-_.,:!?()/~'%">
	//    4    7:invokestatic    #137 <Method String Uri.encode(String, String)>
	//    5   10:invokespecial   #140 <Method void URL(String)>
	//    6   13:invokevirtual   #144 <Method java.net.URLConnection URL.openConnection()>
	//    7   16:checkcast       #146 <Class HttpURLConnection>
	//    8   19:astore_1        
		((HttpURLConnection) (s)).setConnectTimeout(connectTimeout);
	//    9   20:aload_1         
	//   10   21:aload_0         
	//   11   22:getfield        #48  <Field int connectTimeout>
	//   12   25:invokevirtual   #150 <Method void HttpURLConnection.setConnectTimeout(int)>
		((HttpURLConnection) (s)).setReadTimeout(readTimeout);
	//   13   28:aload_1         
	//   14   29:aload_0         
	//   15   30:getfield        #50  <Field int readTimeout>
	//   16   33:invokevirtual   #153 <Method void HttpURLConnection.setReadTimeout(int)>
		return ((HttpURLConnection) (s));
	//   17   36:aload_1         
	//   18   37:areturn         
	}

	protected InputStream getContactPhotoStream(Uri uri)
	{
		ContentResolver contentresolver = context.getContentResolver();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Context context>
	//    2    4:invokevirtual   #97  <Method ContentResolver Context.getContentResolver()>
	//    3    7:astore_2        
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   4    8:getstatic       #60  <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   11:bipush          14
	//*   6   13:icmplt          23
			return android.provider.ContactsContract.Contacts.openContactPhotoInputStream(contentresolver, uri, true);
	//    7   16:aload_2         
	//    8   17:aload_1         
	//    9   18:iconst_1        
	//   10   19:invokestatic    #163 <Method InputStream android.provider.ContactsContract$Contacts.openContactPhotoInputStream(ContentResolver, Uri, boolean)>
	//   11   22:areturn         
		else
			return android.provider.ContactsContract.Contacts.openContactPhotoInputStream(contentresolver, uri);
	//   12   23:aload_2         
	//   13   24:aload_1         
	//   14   25:invokestatic    #166 <Method InputStream android.provider.ContactsContract$Contacts.openContactPhotoInputStream(ContentResolver, Uri)>
	//   15   28:areturn         
	}

	public InputStream getStream(String s, Object obj)
		throws IOException
	{
		switch(_cls1..SwitchMap.com.nostra13.universalimageloader.core.download.ImageDownloader.Scheme[ImageDownloader.Scheme.ofUri(s).ordinal()])
	//*   0    0:getstatic       #174 <Field int[] BaseImageDownloader$1.$SwitchMap$com$nostra13$universalimageloader$core$download$ImageDownloader$Scheme>
	//*   1    3:aload_1         
	//*   2    4:invokestatic    #180 <Method ImageDownloader$Scheme ImageDownloader$Scheme.ofUri(String)>
	//*   3    7:invokevirtual   #184 <Method int ImageDownloader$Scheme.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 6: default 48
	//	               1 83
	//	               2 83
	//	               3 76
	//	               4 69
	//	               5 62
	//	               6 55
		default:
			return getStreamFromOtherSource(s, obj);
	//    6   48:aload_0         
	//    7   49:aload_1         
	//    8   50:aload_2         
	//    9   51:invokevirtual   #187 <Method InputStream getStreamFromOtherSource(String, Object)>
	//   10   54:areturn         

		case 6: // '\006'
			return getStreamFromDrawable(s, obj);
	//   11   55:aload_0         
	//   12   56:aload_1         
	//   13   57:aload_2         
	//   14   58:invokevirtual   #190 <Method InputStream getStreamFromDrawable(String, Object)>
	//   15   61:areturn         

		case 5: // '\005'
			return getStreamFromAssets(s, obj);
	//   16   62:aload_0         
	//   17   63:aload_1         
	//   18   64:aload_2         
	//   19   65:invokevirtual   #193 <Method InputStream getStreamFromAssets(String, Object)>
	//   20   68:areturn         

		case 4: // '\004'
			return getStreamFromContent(s, obj);
	//   21   69:aload_0         
	//   22   70:aload_1         
	//   23   71:aload_2         
	//   24   72:invokevirtual   #196 <Method InputStream getStreamFromContent(String, Object)>
	//   25   75:areturn         

		case 3: // '\003'
			return getStreamFromFile(s, obj);
	//   26   76:aload_0         
	//   27   77:aload_1         
	//   28   78:aload_2         
	//   29   79:invokevirtual   #199 <Method InputStream getStreamFromFile(String, Object)>
	//   30   82:areturn         

		case 1: // '\001'
		case 2: // '\002'
			return getStreamFromNetwork(s, obj);
	//   31   83:aload_0         
	//   32   84:aload_1         
	//   33   85:aload_2         
	//   34   86:invokevirtual   #202 <Method InputStream getStreamFromNetwork(String, Object)>
	//   35   89:areturn         
		}
	}

	protected InputStream getStreamFromAssets(String s, Object obj)
		throws IOException
	{
		s = ImageDownloader.Scheme.ASSETS.crop(s);
	//    0    0:getstatic       #206 <Field ImageDownloader$Scheme ImageDownloader$Scheme.ASSETS>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #209 <Method String ImageDownloader$Scheme.crop(String)>
	//    3    7:astore_1        
		return context.getAssets().open(s);
	//    4    8:aload_0         
	//    5    9:getfield        #46  <Field Context context>
	//    6   12:invokevirtual   #213 <Method AssetManager Context.getAssets()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #218 <Method InputStream AssetManager.open(String)>
	//    9   19:areturn         
	}

	protected InputStream getStreamFromContent(String s, Object obj)
		throws FileNotFoundException
	{
		obj = ((Object) (context.getContentResolver()));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Context context>
	//    2    4:invokevirtual   #97  <Method ContentResolver Context.getContentResolver()>
	//    3    7:astore_2        
		Uri uri = Uri.parse(s);
	//    4    8:aload_1         
	//    5    9:invokestatic    #224 <Method Uri Uri.parse(String)>
	//    6   12:astore_3        
		if(isVideoContentUri(uri))
	//*   7   13:aload_0         
	//*   8   14:aload_3         
	//*   9   15:invokespecial   #226 <Method boolean isVideoContentUri(Uri)>
	//*  10   18:ifeq            72
		{
			s = ((String) (android.provider.MediaStore.Video.Thumbnails.getThumbnail(((ContentResolver) (obj)), Long.valueOf(uri.getLastPathSegment()).longValue(), 1, ((android.graphics.BitmapFactory.Options) (null)))));
	//   11   21:aload_2         
	//   12   22:aload_3         
	//   13   23:invokevirtual   #230 <Method String Uri.getLastPathSegment()>
	//   14   26:invokestatic    #236 <Method Long Long.valueOf(String)>
	//   15   29:invokevirtual   #240 <Method long Long.longValue()>
	//   16   32:iconst_1        
	//   17   33:aconst_null     
	//   18   34:invokestatic    #246 <Method Bitmap android.provider.MediaStore$Video$Thumbnails.getThumbnail(ContentResolver, long, int, android.graphics.BitmapFactory$Options)>
	//   19   37:astore_1        
			if(s != null)
	//*  20   38:aload_1         
	//*  21   39:ifnull          87
			{
				obj = ((Object) (new ByteArrayOutputStream()));
	//   22   42:new             #68  <Class ByteArrayOutputStream>
	//   23   45:dup             
	//   24   46:invokespecial   #69  <Method void ByteArrayOutputStream()>
	//   25   49:astore_2        
				((Bitmap) (s)).compress(android.graphics.Bitmap.CompressFormat.PNG, 0, ((java.io.OutputStream) (obj)));
	//   26   50:aload_1         
	//   27   51:getstatic       #75  <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.PNG>
	//   28   54:iconst_0        
	//   29   55:aload_2         
	//   30   56:invokevirtual   #81  <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
	//   31   59:pop             
				return ((InputStream) (new ByteArrayInputStream(((ByteArrayOutputStream) (obj)).toByteArray())));
	//   32   60:new             #83  <Class ByteArrayInputStream>
	//   33   63:dup             
	//   34   64:aload_2         
	//   35   65:invokevirtual   #87  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   36   68:invokespecial   #90  <Method void ByteArrayInputStream(byte[])>
	//   37   71:areturn         
			}
		} else
		if(s.startsWith("content://com.android.contacts/"))
	//*  38   72:aload_1         
	//*  39   73:ldc1            #16  <String "content://com.android.contacts/">
	//*  40   75:invokevirtual   #111 <Method boolean String.startsWith(String)>
	//*  41   78:ifeq            87
			return getContactPhotoStream(uri);
	//   42   81:aload_0         
	//   43   82:aload_3         
	//   44   83:invokevirtual   #248 <Method InputStream getContactPhotoStream(Uri)>
	//   45   86:areturn         
		return ((ContentResolver) (obj)).openInputStream(uri);
	//   46   87:aload_2         
	//   47   88:aload_3         
	//   48   89:invokevirtual   #251 <Method InputStream ContentResolver.openInputStream(Uri)>
	//   49   92:areturn         
	}

	protected InputStream getStreamFromDrawable(String s, Object obj)
	{
		int i = Integer.parseInt(ImageDownloader.Scheme.DRAWABLE.crop(s));
	//    0    0:getstatic       #254 <Field ImageDownloader$Scheme ImageDownloader$Scheme.DRAWABLE>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #209 <Method String ImageDownloader$Scheme.crop(String)>
	//    3    7:invokestatic    #260 <Method int Integer.parseInt(String)>
	//    4   10:istore_3        
		return context.getResources().openRawResource(i);
	//    5   11:aload_0         
	//    6   12:getfield        #46  <Field Context context>
	//    7   15:invokevirtual   #264 <Method Resources Context.getResources()>
	//    8   18:iload_3         
	//    9   19:invokevirtual   #270 <Method InputStream Resources.openRawResource(int)>
	//   10   22:areturn         
	}

	protected InputStream getStreamFromFile(String s, Object obj)
		throws IOException
	{
		obj = ((Object) (ImageDownloader.Scheme.FILE.crop(s)));
	//    0    0:getstatic       #273 <Field ImageDownloader$Scheme ImageDownloader$Scheme.FILE>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #209 <Method String ImageDownloader$Scheme.crop(String)>
	//    3    7:astore_2        
		if(isVideoFileUri(s))
	//*   4    8:aload_0         
	//*   5    9:aload_1         
	//*   6   10:invokespecial   #275 <Method boolean isVideoFileUri(String)>
	//*   7   13:ifeq            22
			return getVideoThumbnailStream(((String) (obj)));
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:invokespecial   #277 <Method InputStream getVideoThumbnailStream(String)>
	//   11   21:areturn         
		else
			return ((InputStream) (new ContentLengthInputStream(((InputStream) (new BufferedInputStream(((InputStream) (new FileInputStream(((String) (obj))))), 32768))), (int)(new File(((String) (obj)))).length())));
	//   12   22:new             #279 <Class ContentLengthInputStream>
	//   13   25:dup             
	//   14   26:new             #281 <Class BufferedInputStream>
	//   15   29:dup             
	//   16   30:new             #283 <Class FileInputStream>
	//   17   33:dup             
	//   18   34:aload_2         
	//   19   35:invokespecial   #284 <Method void FileInputStream(String)>
	//   20   38:ldc1            #13  <Int 32768>
	//   21   40:invokespecial   #287 <Method void BufferedInputStream(InputStream, int)>
	//   22   43:new             #289 <Class File>
	//   23   46:dup             
	//   24   47:aload_2         
	//   25   48:invokespecial   #290 <Method void File(String)>
	//   26   51:invokevirtual   #293 <Method long File.length()>
	//   27   54:l2i             
	//   28   55:invokespecial   #294 <Method void ContentLengthInputStream(InputStream, int)>
	//   29   58:areturn         
	}

	protected InputStream getStreamFromNetwork(String s, Object obj)
		throws IOException
	{
		s = ((String) (createConnection(s, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #296 <Method HttpURLConnection createConnection(String, Object)>
	//    4    6:astore_1        
		for(int i = 0; ((HttpURLConnection) (s)).getResponseCode() / 100 == 3 && i < 5; i++)
	//*   5    7:iconst_0        
	//*   6    8:istore_3        
	//*   7    9:aload_1         
	//*   8   10:invokevirtual   #299 <Method int HttpURLConnection.getResponseCode()>
	//*   9   13:bipush          100
	//*  10   15:idiv            
	//*  11   16:iconst_3        
	//*  12   17:icmpne          45
	//*  13   20:iload_3         
	//*  14   21:iconst_5        
	//*  15   22:icmpge          45
			s = ((String) (createConnection(((HttpURLConnection) (s)).getHeaderField("Location"), obj)));
	//   16   25:aload_0         
	//   17   26:aload_1         
	//   18   27:ldc2            #301 <String "Location">
	//   19   30:invokevirtual   #304 <Method String HttpURLConnection.getHeaderField(String)>
	//   20   33:aload_2         
	//   21   34:invokevirtual   #296 <Method HttpURLConnection createConnection(String, Object)>
	//   22   37:astore_1        

	//   23   38:iload_3         
	//   24   39:iconst_1        
	//   25   40:iadd            
	//   26   41:istore_3        
	//*  27   42:goto            9
		try
		{
			obj = ((Object) (((HttpURLConnection) (s)).getInputStream()));
	//   28   45:aload_1         
	//   29   46:invokevirtual   #308 <Method InputStream HttpURLConnection.getInputStream()>
	//   30   49:astore_2        
		}
	//*  31   50:aload_0         
	//*  32   51:aload_1         
	//*  33   52:invokevirtual   #312 <Method boolean shouldBeProcessed(HttpURLConnection)>
	//*  34   55:ifne            99
	//*  35   58:aload_2         
	//*  36   59:invokestatic    #318 <Method void IoUtils.closeSilently(java.io.Closeable)>
	//*  37   62:new             #320 <Class StringBuilder>
	//*  38   65:dup             
	//*  39   66:invokespecial   #321 <Method void StringBuilder()>
	//*  40   69:astore_2        
	//*  41   70:aload_2         
	//*  42   71:ldc2            #323 <String "Image request failed with response code ">
	//*  43   74:invokevirtual   #327 <Method StringBuilder StringBuilder.append(String)>
	//*  44   77:pop             
	//*  45   78:aload_2         
	//*  46   79:aload_1         
	//*  47   80:invokevirtual   #299 <Method int HttpURLConnection.getResponseCode()>
	//*  48   83:invokevirtual   #330 <Method StringBuilder StringBuilder.append(int)>
	//*  49   86:pop             
	//*  50   87:new             #129 <Class IOException>
	//*  51   90:dup             
	//*  52   91:aload_2         
	//*  53   92:invokevirtual   #333 <Method String StringBuilder.toString()>
	//*  54   95:invokespecial   #334 <Method void IOException(String)>
	//*  55   98:athrow          
	//*  56   99:new             #279 <Class ContentLengthInputStream>
	//*  57  102:dup             
	//*  58  103:new             #281 <Class BufferedInputStream>
	//*  59  106:dup             
	//*  60  107:aload_2         
	//*  61  108:ldc1            #13  <Int 32768>
	//*  62  110:invokespecial   #287 <Method void BufferedInputStream(InputStream, int)>
	//*  63  113:aload_1         
	//*  64  114:invokevirtual   #337 <Method int HttpURLConnection.getContentLength()>
	//*  65  117:invokespecial   #294 <Method void ContentLengthInputStream(InputStream, int)>
	//*  66  120:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  67  121:astore_2        
		{
			IoUtils.readAndCloseStream(((HttpURLConnection) (s)).getErrorStream());
	//   68  122:aload_1         
	//   69  123:invokevirtual   #340 <Method InputStream HttpURLConnection.getErrorStream()>
	//   70  126:invokestatic    #344 <Method void IoUtils.readAndCloseStream(InputStream)>
			throw obj;
	//   71  129:aload_2         
	//   72  130:athrow          
		}
		if(!shouldBeProcessed(((HttpURLConnection) (s))))
		{
			IoUtils.closeSilently(((java.io.Closeable) (obj)));
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append("Image request failed with response code ");
			((StringBuilder) (obj)).append(((HttpURLConnection) (s)).getResponseCode());
			throw new IOException(((StringBuilder) (obj)).toString());
		} else
		{
			return ((InputStream) (new ContentLengthInputStream(((InputStream) (new BufferedInputStream(((InputStream) (obj)), 32768))), ((HttpURLConnection) (s)).getContentLength())));
		}
	}

	protected InputStream getStreamFromOtherSource(String s, Object obj)
		throws IOException
	{
		throw new UnsupportedOperationException(String.format("UIL doesn't support scheme(protocol) by default [%s]. You should implement this support yourself (BaseImageDownloader.getStreamFromOtherSource(...))", new Object[] {
			s
		}));
	//    0    0:new             #346 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #23  <String "UIL doesn't support scheme(protocol) by default [%s]. You should implement this support yourself (BaseImageDownloader.getStreamFromOtherSource(...))">
	//    3    6:iconst_1        
	//    4    7:anewarray       Object[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:aload_1         
	//    8   13:aastore         
	//    9   14:invokestatic    #350 <Method String String.format(String, Object[])>
	//   10   17:invokespecial   #351 <Method void UnsupportedOperationException(String)>
	//   11   20:athrow          
	}

	protected boolean shouldBeProcessed(HttpURLConnection httpurlconnection)
		throws IOException
	{
		return httpurlconnection.getResponseCode() == 200;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #299 <Method int HttpURLConnection.getResponseCode()>
	//    2    4:sipush          200
	//    3    7:icmpne          12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	protected static final String ALLOWED_URI_CHARS = "@#&=*+-_.,:!?()/~'%";
	protected static final int BUFFER_SIZE = 32768;
	protected static final String CONTENT_CONTACTS_URI_PREFIX = "content://com.android.contacts/";
	public static final int DEFAULT_HTTP_CONNECT_TIMEOUT = 5000;
	public static final int DEFAULT_HTTP_READ_TIMEOUT = 20000;
	private static final String ERROR_UNSUPPORTED_SCHEME = "UIL doesn't support scheme(protocol) by default [%s]. You should implement this support yourself (BaseImageDownloader.getStreamFromOtherSource(...))";
	protected static final int MAX_REDIRECT_COUNT = 5;
	protected final int connectTimeout;
	protected final Context context;
	protected final int readTimeout;

	/* member class not found */
	class _cls1 {}

}
