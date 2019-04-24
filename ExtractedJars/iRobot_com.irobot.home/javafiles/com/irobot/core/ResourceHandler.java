// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


// Referenced classes of package com.irobot.core:
//			ImageId

public abstract class ResourceHandler
{

	public ResourceHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public abstract byte[] createTextImage(String s, String s1, float f, int i, float f1, int j);

	public abstract byte[] loadImageResource(ImageId imageid);

	public abstract byte[] loadResource(String s, String s1);
}
