// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;


// Referenced classes of package com.bumptech.glide:
//			Registry

public static class Registry$NoSourceEncoderAvailableException extends Registry.MissingComponentException
{

	public Registry$NoSourceEncoderAvailableException(Class class1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #12  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Failed to find source encoder for data class: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #17  <String "Failed to find source encoder for data class: ">
	//    6   11:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (class1)));
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #24  <Method StringBuilder StringBuilder.append(Object)>
	//   11   20:pop             
		super(stringbuilder.toString());
	//   12   21:aload_0         
	//   13   22:aload_2         
	//   14   23:invokevirtual   #28  <Method String StringBuilder.toString()>
	//   15   26:invokespecial   #31  <Method void Registry$MissingComponentException(String)>
	//   16   29:return          
	}
}
