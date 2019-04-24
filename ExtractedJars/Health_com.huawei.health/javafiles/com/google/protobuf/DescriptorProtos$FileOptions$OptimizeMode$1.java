// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;


// Referenced classes of package com.google.protobuf:
//			DescriptorProtos

static final class DescriptorProtos$FileOptions$OptimizeMode$1
	implements Internal.EnumLiteMap
{

	public DescriptorProtos.FileOptions.OptimizeMode findValueByNumber(int i)
	{
		return DescriptorProtos.FileOptions.OptimizeMode.forNumber(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #25  <Method DescriptorProtos$FileOptions$OptimizeMode DescriptorProtos$FileOptions$OptimizeMode.forNumber(int)>
	//    2    4:areturn         
	}

	public volatile Internal.EnumLite findValueByNumber(int i)
	{
		return ((Internal.EnumLite) (findValueByNumber(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #28  <Method DescriptorProtos$FileOptions$OptimizeMode findValueByNumber(int)>
	//    3    5:areturn         
	}

	DescriptorProtos$FileOptions$OptimizeMode$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}
}
