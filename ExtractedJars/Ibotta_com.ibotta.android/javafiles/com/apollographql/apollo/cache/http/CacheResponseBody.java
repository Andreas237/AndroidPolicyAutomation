// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.http;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.*;

final class CacheResponseBody extends ResponseBody
{

	CacheResponseBody(Source source1, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ResponseBody()>
		responseBodySource = Okio.buffer(source1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #20  <Method BufferedSource Okio.buffer(Source)>
	//    5    9:putfield        #22  <Field BufferedSource responseBodySource>
		contentType = s;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #24  <Field String contentType>
		contentLength = s1;
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:putfield        #26  <Field String contentLength>
	//   12   22:return          
	}

	public long contentLength()
	{
		long l = -1L;
	//    0    0:ldc2w           #31  <Long -1L>
	//    1    3:lstore_1        
		try
		{
			if(contentLength != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #26  <Field String contentLength>
	//*   4    8:ifnull          19
				l = Long.parseLong(contentLength);
	//    5   11:aload_0         
	//    6   12:getfield        #26  <Field String contentLength>
	//    7   15:invokestatic    #38  <Method long Long.parseLong(String)>
	//    8   18:lstore_1        
		}
	//*   9   19:lload_1         
	//*  10   20:lreturn         
		catch(NumberFormatException numberformatexception)
	//*  11   21:astore_3        
		{
			return -1L;
	//   12   22:ldc2w           #31  <Long -1L>
	//   13   25:lreturn         
		}
		return l;
	}

	public MediaType contentType()
	{
		String s = contentType;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String contentType>
	//    2    4:astore_1        
		if(s != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return MediaType.parse(s);
	//    5    9:aload_1         
	//    6   10:invokestatic    #45  <Method MediaType MediaType.parse(String)>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public BufferedSource source()
	{
		return responseBodySource;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field BufferedSource responseBodySource>
	//    2    4:areturn         
	}

	private final String contentLength;
	private final String contentType;
	private BufferedSource responseBodySource;
}
