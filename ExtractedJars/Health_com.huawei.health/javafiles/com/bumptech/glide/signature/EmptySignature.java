// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.signature;

import com.bumptech.glide.load.Key;
import java.security.MessageDigest;

public final class EmptySignature
	implements Key
{

	private EmptySignature()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static EmptySignature obtain()
	{
		return EMPTY_KEY;
	//    0    0:getstatic       #15  <Field EmptySignature EMPTY_KEY>
	//    1    3:areturn         
	}

	public String toString()
	{
		return "EmptySignature";
	//    0    0:ldc1            #23  <String "EmptySignature">
	//    1    2:areturn         
	}

	public void updateDiskCacheKey(MessageDigest messagedigest)
	{
	//    0    0:return          
	}

	private static final EmptySignature EMPTY_KEY = new EmptySignature();

	static 
	{
	//    0    0:new             #2   <Class EmptySignature>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void EmptySignature()>
	//    3    7:putstatic       #15  <Field EmptySignature EMPTY_KEY>
	//*   4   10:return          
	}
}
