// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

// Referenced classes of package com.bumptech.glide.load.model:
//			Headers

public class GlideUrl
	implements Key
{

	public GlideUrl(String s)
	{
		this(s, Headers.DEFAULT);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #29  <Field Headers Headers.DEFAULT>
	//    3    5:invokespecial   #32  <Method void GlideUrl(String, Headers)>
	//    4    8:return          
	}

	public GlideUrl(String s, Headers headers1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		url = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #38  <Field URL url>
		stringUrl = Preconditions.checkNotEmpty(s);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokestatic    #44  <Method String Preconditions.checkNotEmpty(String)>
	//    8   14:putfield        #46  <Field String stringUrl>
		headers = (Headers)Preconditions.checkNotNull(((Object) (headers1)));
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:invokestatic    #50  <Method Object Preconditions.checkNotNull(Object)>
	//   12   22:checkcast       #26  <Class Headers>
	//   13   25:putfield        #52  <Field Headers headers>
	//   14   28:return          
	}

	public GlideUrl(URL url1)
	{
		this(url1, Headers.DEFAULT);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #29  <Field Headers Headers.DEFAULT>
	//    3    5:invokespecial   #56  <Method void GlideUrl(URL, Headers)>
	//    4    8:return          
	}

	public GlideUrl(URL url1, Headers headers1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		url = (URL)Preconditions.checkNotNull(((Object) (url1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #50  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #58  <Class URL>
	//    6   12:putfield        #38  <Field URL url>
		stringUrl = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #46  <Field String stringUrl>
		headers = (Headers)Preconditions.checkNotNull(((Object) (headers1)));
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:invokestatic    #50  <Method Object Preconditions.checkNotNull(Object)>
	//   13   25:checkcast       #26  <Class Headers>
	//   14   28:putfield        #52  <Field Headers headers>
	//   15   31:return          
	}

	private byte[] getCacheKeyBytes()
	{
		if(cacheKeyBytes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field byte[] cacheKeyBytes>
	//*   2    4:ifnonnull       21
			cacheKeyBytes = getCacheKey().getBytes(CHARSET);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #66  <Method String getCacheKey()>
	//    6   12:getstatic       #70  <Field java.nio.charset.Charset CHARSET>
	//    7   15:invokevirtual   #76  <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//    8   18:putfield        #62  <Field byte[] cacheKeyBytes>
		return cacheKeyBytes;
	//    9   21:aload_0         
	//   10   22:getfield        #62  <Field byte[] cacheKeyBytes>
	//   11   25:areturn         
	}

	private String getSafeStringUrl()
	{
		if(TextUtils.isEmpty(((CharSequence) (safeStringUrl))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field String safeStringUrl>
	//*   2    4:invokestatic    #85  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   3    7:ifeq            42
		{
			String s1 = stringUrl;
	//    4   10:aload_0         
	//    5   11:getfield        #46  <Field String stringUrl>
	//    6   14:astore_2        
			String s = s1;
	//    7   15:aload_2         
	//    8   16:astore_1        
			if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*   9   17:aload_2         
	//*  10   18:invokestatic    #85  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  11   21:ifeq            32
				s = url.toString();
	//   12   24:aload_0         
	//   13   25:getfield        #38  <Field URL url>
	//   14   28:invokevirtual   #88  <Method String URL.toString()>
	//   15   31:astore_1        
			safeStringUrl = Uri.encode(s, "@#&=*+-_.,:!?()/~'%");
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:ldc1            #10  <String "@#&=*+-_.,:!?()/~'%">
	//   19   36:invokestatic    #94  <Method String Uri.encode(String, String)>
	//   20   39:putfield        #79  <Field String safeStringUrl>
		}
		return safeStringUrl;
	//   21   42:aload_0         
	//   22   43:getfield        #79  <Field String safeStringUrl>
	//   23   46:areturn         
	}

	private URL getSafeUrl()
		throws MalformedURLException
	{
		if(safeUrl == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #100 <Field URL safeUrl>
	//*   2    4:ifnonnull       22
			safeUrl = new URL(getSafeStringUrl());
	//    3    7:aload_0         
	//    4    8:new             #58  <Class URL>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #102 <Method String getSafeStringUrl()>
	//    8   16:invokespecial   #104 <Method void URL(String)>
	//    9   19:putfield        #100 <Field URL safeUrl>
		return safeUrl;
	//   10   22:aload_0         
	//   11   23:getfield        #100 <Field URL safeUrl>
	//   12   26:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof GlideUrl)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class GlideUrl>
	//*   2    4:ifeq            44
		{
			obj = ((Object) ((GlideUrl)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class GlideUrl>
	//    5   11:astore_1        
			return getCacheKey().equals(((Object) (((GlideUrl) (obj)).getCacheKey()))) && ((Object) (headers)).equals(((Object) (((GlideUrl) (obj)).headers)));
	//    6   12:aload_0         
	//    7   13:invokevirtual   #66  <Method String getCacheKey()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #66  <Method String getCacheKey()>
	//   10   20:invokevirtual   #109 <Method boolean String.equals(Object)>
	//   11   23:ifeq            42
	//   12   26:aload_0         
	//   13   27:getfield        #52  <Field Headers headers>
	//   14   30:aload_1         
	//   15   31:getfield        #52  <Field Headers headers>
	//   16   34:invokevirtual   #110 <Method boolean Object.equals(Object)>
	//   17   37:ifeq            42
	//   18   40:iconst_1        
	//   19   41:ireturn         
	//   20   42:iconst_0        
	//   21   43:ireturn         
		} else
		{
			return false;
	//   22   44:iconst_0        
	//   23   45:ireturn         
		}
	}

	public String getCacheKey()
	{
		if(stringUrl != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field String stringUrl>
	//*   2    4:ifnull          12
			return stringUrl;
	//    3    7:aload_0         
	//    4    8:getfield        #46  <Field String stringUrl>
	//    5   11:areturn         
		else
			return url.toString();
	//    6   12:aload_0         
	//    7   13:getfield        #38  <Field URL url>
	//    8   16:invokevirtual   #88  <Method String URL.toString()>
	//    9   19:areturn         
	}

	public Map getHeaders()
	{
		return headers.getHeaders();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Headers headers>
	//    2    4:invokeinterface #114 <Method Map Headers.getHeaders()>
	//    3    9:areturn         
	}

	public int hashCode()
	{
		if(hashCode == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #119 <Field int hashCode>
	//*   2    4:ifne            37
		{
			hashCode = getCacheKey().hashCode();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #66  <Method String getCacheKey()>
	//    6   12:invokevirtual   #121 <Method int String.hashCode()>
	//    7   15:putfield        #119 <Field int hashCode>
			hashCode = hashCode * 31 + ((Object) (headers)).hashCode();
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #119 <Field int hashCode>
	//   11   23:bipush          31
	//   12   25:imul            
	//   13   26:aload_0         
	//   14   27:getfield        #52  <Field Headers headers>
	//   15   30:invokevirtual   #122 <Method int Object.hashCode()>
	//   16   33:iadd            
	//   17   34:putfield        #119 <Field int hashCode>
		}
		return hashCode;
	//   18   37:aload_0         
	//   19   38:getfield        #119 <Field int hashCode>
	//   20   41:ireturn         
	}

	public String toString()
	{
		return getCacheKey();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method String getCacheKey()>
	//    2    4:areturn         
	}

	public String toStringUrl()
	{
		return getSafeStringUrl();
	//    0    0:aload_0         
	//    1    1:invokespecial   #102 <Method String getSafeStringUrl()>
	//    2    4:areturn         
	}

	public URL toURL()
		throws MalformedURLException
	{
		return getSafeUrl();
	//    0    0:aload_0         
	//    1    1:invokespecial   #126 <Method URL getSafeUrl()>
	//    2    4:areturn         
	}

	public void updateDiskCacheKey(MessageDigest messagedigest)
	{
		messagedigest.update(getCacheKeyBytes());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokespecial   #130 <Method byte[] getCacheKeyBytes()>
	//    3    5:invokevirtual   #136 <Method void MessageDigest.update(byte[])>
	//    4    8:return          
	}

	private static final String ALLOWED_URI_CHARS = "@#&=*+-_.,:!?()/~'%";
	private volatile byte cacheKeyBytes[];
	private int hashCode;
	private final Headers headers;
	private String safeStringUrl;
	private URL safeUrl;
	private final String stringUrl;
	private final URL url;
}
