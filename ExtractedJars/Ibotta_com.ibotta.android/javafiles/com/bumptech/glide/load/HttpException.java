// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load;

import java.io.IOException;

public final class HttpException extends IOException
{

	public HttpException(int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #14  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Http request failed with status code: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #19  <String "Http request failed with status code: ">
	//    6   11:invokevirtual   #23  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(i);
	//    8   15:aload_2         
	//    9   16:iload_1         
	//   10   17:invokevirtual   #26  <Method StringBuilder StringBuilder.append(int)>
	//   11   20:pop             
		this(stringbuilder.toString(), i);
	//   12   21:aload_0         
	//   13   22:aload_2         
	//   14   23:invokevirtual   #30  <Method String StringBuilder.toString()>
	//   15   26:iload_1         
	//   16   27:invokespecial   #33  <Method void HttpException(String, int)>
	//   17   30:return          
	}

	public HttpException(String s)
	{
		this(s, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokespecial   #33  <Method void HttpException(String, int)>
	//    4    6:return          
	}

	public HttpException(String s, int i)
	{
		this(s, i, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #38  <Method void HttpException(String, int, Throwable)>
	//    5    7:return          
	}

	public HttpException(String s, int i, Throwable throwable)
	{
		super(s, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #42  <Method void IOException(String, Throwable)>
		statusCode = i;
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:putfield        #44  <Field int statusCode>
	//    7   11:return          
	}

	private static final long serialVersionUID = 1L;
	private final int statusCode;
}
