// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource;

import android.content.Context;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;

public final class UnitTransformation
	implements Transformation
{

	private UnitTransformation()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	public static UnitTransformation get()
	{
		return (UnitTransformation)TRANSFORMATION;
	//    0    0:getstatic       #17  <Field Transformation TRANSFORMATION>
	//    1    3:checkcast       #2   <Class UnitTransformation>
	//    2    6:areturn         
	}

	public Resource transform(Context context, Resource resource, int i, int j)
	{
		return resource;
	//    0    0:aload_2         
	//    1    1:areturn         
	}

	public void updateDiskCacheKey(MessageDigest messagedigest)
	{
	//    0    0:return          
	}

	private static final Transformation TRANSFORMATION = new UnitTransformation();

	static 
	{
	//    0    0:new             #2   <Class UnitTransformation>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void UnitTransformation()>
	//    3    7:putstatic       #17  <Field Transformation TRANSFORMATION>
	//*   4   10:return          
	}
}
