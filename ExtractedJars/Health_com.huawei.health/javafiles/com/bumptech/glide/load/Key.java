// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load;

import java.nio.charset.Charset;
import java.security.MessageDigest;

public interface Key
{

	public abstract boolean equals(Object obj);

	public abstract int hashCode();

	public abstract void updateDiskCacheKey(MessageDigest messagedigest);

	public static final Charset CHARSET = Charset.forName("UTF-8");
	public static final String STRING_CHARSET_NAME = "UTF-8";

	/* static  */
	/* { */
	//    0    0:ldc1            #10  <String "UTF-8">
	//    1    2:invokestatic    #18  <Method Charset Charset.forName(String)>
	//    2    5:putstatic       #20  <Field Charset CHARSET>
	//*   3    8:return          
	/* } */
}
