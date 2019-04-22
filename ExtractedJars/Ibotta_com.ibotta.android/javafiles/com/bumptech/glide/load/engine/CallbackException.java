// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;


final class CallbackException extends RuntimeException
{

	CallbackException(Throwable throwable)
	{
		super("Unexpected exception thrown by non-Glide code", throwable);
	//    0    0:aload_0         
	//    1    1:ldc1            #12  <String "Unexpected exception thrown by non-Glide code">
	//    2    3:aload_1         
	//    3    4:invokespecial   #15  <Method void RuntimeException(String, Throwable)>
	//    4    7:return          
	}

	private static final long serialVersionUID = 0x3d744495L;
}
