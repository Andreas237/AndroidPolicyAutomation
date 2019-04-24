// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.io;

import java.io.IOException;

public class MapFailedException extends IOException
{

	public MapFailedException(IOException ioexception)
	{
		super(ioexception.getMessage());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #10  <Method String IOException.getMessage()>
	//    3    5:invokespecial   #13  <Method void IOException(String)>
		initCause(((Throwable) (ioexception)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #17  <Method Throwable initCause(Throwable)>
	//    7   13:pop             
	//    8   14:return          
	}
}
