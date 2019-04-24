// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;


// Referenced classes of package com.bumptech.glide:
//			Registry

public static class Registry$NoResultEncoderAvailableException extends Registry.MissingComponentException
{

	public Registry$NoResultEncoderAvailableException(Class class1)
	{
		super((new StringBuilder()).append("Failed to find result encoder for resource class: ").append(((Object) (class1))).toString());
	//    0    0:aload_0         
	//    1    1:new             #11  <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #14  <Method void StringBuilder()>
	//    4    8:ldc1            #16  <String "Failed to find result encoder for resource class: ">
	//    5   10:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//    6   13:aload_1         
	//    7   14:invokevirtual   #23  <Method StringBuilder StringBuilder.append(Object)>
	//    8   17:invokevirtual   #27  <Method String StringBuilder.toString()>
	//    9   20:invokespecial   #30  <Method void Registry$MissingComponentException(String)>
	//   10   23:return          
	}
}
