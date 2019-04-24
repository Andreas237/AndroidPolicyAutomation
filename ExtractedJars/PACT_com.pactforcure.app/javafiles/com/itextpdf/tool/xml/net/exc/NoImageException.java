// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.net.exc;

import com.itextpdf.tool.xml.exceptions.LocaleMessages;

public class NoImageException extends Exception
{

	public NoImageException(String s)
	{
		this(s, ((Exception) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #13  <Method void NoImageException(String, Exception)>
	//    4    6:return          
	}

	public NoImageException(String s, Exception exception)
	{
		super(String.format(LocaleMessages.getInstance().getMessage("exc.img.notconverted"), new Object[] {
			s
		}), ((Throwable) (exception)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #20  <Method LocaleMessages LocaleMessages.getInstance()>
	//    2    4:ldc1            #22  <String "exc.img.notconverted">
	//    3    6:invokevirtual   #26  <Method String LocaleMessages.getMessage(String)>
	//    4    9:iconst_1        
	//    5   10:anewarray       Object[]
	//    6   13:dup             
	//    7   14:iconst_0        
	//    8   15:aload_1         
	//    9   16:aastore         
	//   10   17:invokestatic    #34  <Method String String.format(String, Object[])>
	//   11   20:aload_2         
	//   12   21:invokespecial   #37  <Method void Exception(String, Throwable)>
	//   13   24:return          
	}

	private static final long serialVersionUID = 1L;
}
