// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class HttpResponse
{

	public HttpResponse(int i, List list)
	{
		this(i, list, -1, ((InputStream) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iconst_m1       
	//    4    4:aconst_null     
	//    5    5:invokespecial   #17  <Method void HttpResponse(int, List, int, InputStream)>
	//    6    8:return          
	}

	public HttpResponse(int i, List list, int j, InputStream inputstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		mStatusCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #25  <Field int mStatusCode>
		mHeaders = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field List mHeaders>
		mContentLength = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #29  <Field int mContentLength>
		mContent = inputstream;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #31  <Field InputStream mContent>
	//   14   25:return          
	}

	public final InputStream getContent()
	{
		return mContent;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field InputStream mContent>
	//    2    4:areturn         
	}

	public final int getContentLength()
	{
		return mContentLength;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int mContentLength>
	//    2    4:ireturn         
	}

	public final List getHeaders()
	{
		return Collections.unmodifiableList(mHeaders);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field List mHeaders>
	//    2    4:invokestatic    #44  <Method List Collections.unmodifiableList(List)>
	//    3    7:areturn         
	}

	public final int getStatusCode()
	{
		return mStatusCode;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int mStatusCode>
	//    2    4:ireturn         
	}

	private final InputStream mContent;
	private final int mContentLength;
	private final List mHeaders;
	private final int mStatusCode;
}
