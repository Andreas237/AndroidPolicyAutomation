// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;


// Referenced classes of package com.bumptech.glide:
//			Registry

public static final class Registry$NoImageHeaderParserException extends Registry.MissingComponentException
{

	public Registry$NoImageHeaderParserException()
	{
		super("Failed to find image header parser.");
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "Failed to find image header parser.">
	//    2    3:invokespecial   #14  <Method void Registry$MissingComponentException(String)>
	//    3    6:return          
	}
}
