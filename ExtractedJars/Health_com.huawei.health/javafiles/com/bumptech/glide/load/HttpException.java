// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load;

import java.io.IOException;

public final class HttpException extends IOException
{

	public HttpException(int i)
	{
		this((new StringBuilder()).append("Http request failed with status code: ").append(i).toString(), i);
	//    0    0:aload_0         
	//    1    1:new             #12  <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #15  <Method void StringBuilder()>
	//    4    8:ldc1            #17  <String "Http request failed with status code: ">
	//    5   10:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//    6   13:iload_1         
	//    7   14:invokevirtual   #24  <Method StringBuilder StringBuilder.append(int)>
	//    8   17:invokevirtual   #28  <Method String StringBuilder.toString()>
	//    9   20:iload_1         
	//   10   21:invokespecial   #31  <Method void HttpException(String, int)>
	//   11   24:return          
	}

	public HttpException(String s)
	{
		this(s, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokespecial   #31  <Method void HttpException(String, int)>
	//    4    6:return          
	}

	public HttpException(String s, int i)
	{
		this(s, i, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #36  <Method void HttpException(String, int, Throwable)>
	//    5    7:return          
	}

	public HttpException(String s, int i, Throwable throwable)
	{
		super(s, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #40  <Method void IOException(String, Throwable)>
		statusCode = i;
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:putfield        #42  <Field int statusCode>
	//    7   11:return          
	}

	public int getStatusCode()
	{
		return statusCode;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int statusCode>
	//    2    4:ireturn         
	}

	public static final int UNKNOWN = -1;
	private final int statusCode;
}
