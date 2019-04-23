// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.gif;

import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Option;

public final class GifOptions
{

	private GifOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
	//    2    4:return          
	}

	public static final Option DECODE_FORMAT;
	public static final Option DISABLE_ANIMATION = Option.memory("com.bumptech.glide.load.resource.gif.GifOptions.DisableAnimation", ((Object) (Boolean.valueOf(false))));

	static 
	{
		DECODE_FORMAT = Option.memory("com.bumptech.glide.load.resource.gif.GifOptions.DecodeFormat", ((Object) (DecodeFormat.DEFAULT)));
	//    0    0:ldc1            #13  <String "com.bumptech.glide.load.resource.gif.GifOptions.DecodeFormat">
	//    1    2:getstatic       #19  <Field DecodeFormat DecodeFormat.DEFAULT>
	//    2    5:invokestatic    #25  <Method Option Option.memory(String, Object)>
	//    3    8:putstatic       #27  <Field Option DECODE_FORMAT>
	//    4   11:ldc1            #29  <String "com.bumptech.glide.load.resource.gif.GifOptions.DisableAnimation">
	//    5   13:iconst_0        
	//    6   14:invokestatic    #35  <Method Boolean Boolean.valueOf(boolean)>
	//    7   17:invokestatic    #25  <Method Option Option.memory(String, Object)>
	//    8   20:putstatic       #37  <Field Option DISABLE_ANIMATION>
	//*   9   23:return          
	}
}
