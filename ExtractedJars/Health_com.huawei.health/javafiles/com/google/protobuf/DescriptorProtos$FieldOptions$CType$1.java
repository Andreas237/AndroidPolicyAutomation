// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;


// Referenced classes of package com.google.protobuf:
//			DescriptorProtos

static final class DescriptorProtos$FieldOptions$CType$1
	implements Internal.EnumLiteMap
{

	public DescriptorProtos.FieldOptions.CType findValueByNumber(int i)
	{
		return DescriptorProtos.FieldOptions.CType.forNumber(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #25  <Method DescriptorProtos$FieldOptions$CType DescriptorProtos$FieldOptions$CType.forNumber(int)>
	//    2    4:areturn         
	}

	public volatile Internal.EnumLite findValueByNumber(int i)
	{
		return ((Internal.EnumLite) (findValueByNumber(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #28  <Method DescriptorProtos$FieldOptions$CType findValueByNumber(int)>
	//    3    5:areturn         
	}

	DescriptorProtos$FieldOptions$CType$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}
}
