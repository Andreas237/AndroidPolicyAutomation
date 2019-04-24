// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.util.List;

// Referenced classes of package com.google.protobuf:
//			ProtocolMessageEnum, DescriptorProtos

public static final class DescriptorProtos$MethodOptions$IdempotencyLevel extends Enum
	implements ProtocolMessageEnum
{

	public static DescriptorProtos$MethodOptions$IdempotencyLevel forNumber(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 31
	//	               1 35
	//	               2 39
	//*   2   28:goto            43
		case 0: // '\0'
			return IDEMPOTENCY_UNKNOWN;
	//    3   31:getstatic       #42  <Field DescriptorProtos$MethodOptions$IdempotencyLevel IDEMPOTENCY_UNKNOWN>
	//    4   34:areturn         

		case 1: // '\001'
			return NO_SIDE_EFFECTS;
	//    5   35:getstatic       #45  <Field DescriptorProtos$MethodOptions$IdempotencyLevel NO_SIDE_EFFECTS>
	//    6   38:areturn         

		case 2: // '\002'
			return IDEMPOTENT;
	//    7   39:getstatic       #48  <Field DescriptorProtos$MethodOptions$IdempotencyLevel IDEMPOTENT>
	//    8   42:areturn         
		}
		return null;
	//    9   43:aconst_null     
	//   10   44:areturn         
	}

	public static final Descriptors.EnumDescriptor getDescriptor()
	{
		return (Descriptors.EnumDescriptor)DescriptorProtos.MethodOptions.getDescriptor().getEnumTypes().get(0);
	//    0    0:invokestatic    #75  <Method Descriptors$Descriptor DescriptorProtos$MethodOptions.getDescriptor()>
	//    1    3:invokevirtual   #81  <Method List Descriptors$Descriptor.getEnumTypes()>
	//    2    6:iconst_0        
	//    3    7:invokeinterface #87  <Method Object List.get(int)>
	//    4   12:checkcast       #89  <Class Descriptors$EnumDescriptor>
	//    5   15:areturn         
	}

	public static Internal.EnumLiteMap internalGetValueMap()
	{
		return internalValueMap;
	//    0    0:getstatic       #54  <Field Internal$EnumLiteMap internalValueMap>
	//    1    3:areturn         
	}

	public static DescriptorProtos$MethodOptions$IdempotencyLevel valueOf(int i)
	{
		return forNumber(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #96  <Method DescriptorProtos$MethodOptions$IdempotencyLevel forNumber(int)>
	//    2    4:areturn         
	}

	public static DescriptorProtos$MethodOptions$IdempotencyLevel valueOf(Descriptors.EnumValueDescriptor enumvaluedescriptor)
	{
		if(enumvaluedescriptor.getType() != getDescriptor())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #103 <Method Descriptors$EnumDescriptor Descriptors$EnumValueDescriptor.getType()>
	//*   2    4:invokestatic    #105 <Method Descriptors$EnumDescriptor getDescriptor()>
	//*   3    7:if_acmpeq       20
			throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
	//    4   10:new             #107 <Class IllegalArgumentException>
	//    5   13:dup             
	//    6   14:ldc1            #109 <String "EnumValueDescriptor is not for this type.">
	//    7   16:invokespecial   #112 <Method void IllegalArgumentException(String)>
	//    8   19:athrow          
		else
			return VALUES[enumvaluedescriptor.getIndex()];
	//    9   20:getstatic       #60  <Field DescriptorProtos$MethodOptions$IdempotencyLevel[] VALUES>
	//   10   23:aload_0         
	//   11   24:invokevirtual   #116 <Method int Descriptors$EnumValueDescriptor.getIndex()>
	//   12   27:aaload          
	//   13   28:areturn         
	}

	public static DescriptorProtos$MethodOptions$IdempotencyLevel valueOf(String s)
	{
		return (DescriptorProtos$MethodOptions$IdempotencyLevel)Enum.valueOf(com/google/protobuf/DescriptorProtos$MethodOptions$IdempotencyLevel, s);
	//    0    0:ldc1            #2   <Class DescriptorProtos$MethodOptions$IdempotencyLevel>
	//    1    2:aload_0         
	//    2    3:invokestatic    #120 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class DescriptorProtos$MethodOptions$IdempotencyLevel>
	//    4    9:areturn         
	}

	public static DescriptorProtos$MethodOptions$IdempotencyLevel[] values()
	{
		return (DescriptorProtos$MethodOptions$IdempotencyLevel[])((DescriptorProtos$MethodOptions$IdempotencyLevel []) ($VALUES)).clone();
	//    0    0:getstatic       #50  <Field DescriptorProtos$MethodOptions$IdempotencyLevel[] $VALUES>
	//    1    3:invokevirtual   #125 <Method Object _5B_Lcom.google.protobuf.DescriptorProtos$MethodOptions$IdempotencyLevel_3B_.clone()>
	//    2    6:checkcast       #121 <Class DescriptorProtos$MethodOptions$IdempotencyLevel[]>
	//    3    9:areturn         
	}

	public final Descriptors.EnumDescriptor getDescriptorForType()
	{
		return getDescriptor();
	//    0    0:invokestatic    #105 <Method Descriptors$EnumDescriptor getDescriptor()>
	//    1    3:areturn         
	}

	public final int getNumber()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field int value>
	//    2    4:ireturn         
	}

	public final Descriptors.EnumValueDescriptor getValueDescriptor()
	{
		return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(ordinal());
	//    0    0:invokestatic    #105 <Method Descriptors$EnumDescriptor getDescriptor()>
	//    1    3:invokevirtual   #132 <Method List Descriptors$EnumDescriptor.getValues()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #135 <Method int ordinal()>
	//    4   10:invokeinterface #87  <Method Object List.get(int)>
	//    5   15:checkcast       #100 <Class Descriptors$EnumValueDescriptor>
	//    6   18:areturn         
	}

	private static final DescriptorProtos$MethodOptions$IdempotencyLevel $VALUES[];
	public static final DescriptorProtos$MethodOptions$IdempotencyLevel IDEMPOTENCY_UNKNOWN;
	public static final int IDEMPOTENCY_UNKNOWN_VALUE = 0;
	public static final DescriptorProtos$MethodOptions$IdempotencyLevel IDEMPOTENT;
	public static final int IDEMPOTENT_VALUE = 2;
	public static final DescriptorProtos$MethodOptions$IdempotencyLevel NO_SIDE_EFFECTS;
	public static final int NO_SIDE_EFFECTS_VALUE = 1;
	private static final DescriptorProtos$MethodOptions$IdempotencyLevel VALUES[] = values();
	private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() {

		public DescriptorProtos.MethodOptions.IdempotencyLevel findValueByNumber(int i)
		{
			return DescriptorProtos.MethodOptions.IdempotencyLevel.forNumber(i);
		//    0    0:iload_1         
		//    1    1:invokestatic    #25  <Method DescriptorProtos$MethodOptions$IdempotencyLevel DescriptorProtos$MethodOptions$IdempotencyLevel.forNumber(int)>
		//    2    4:areturn         
		}

		public volatile Internal.EnumLite findValueByNumber(int i)
		{
			return ((Internal.EnumLite) (findValueByNumber(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method DescriptorProtos$MethodOptions$IdempotencyLevel findValueByNumber(int)>
		//    3    5:areturn         
		}

	}
;
	private final int value;

	static 
	{
		IDEMPOTENCY_UNKNOWN = new DescriptorProtos$MethodOptions$IdempotencyLevel("IDEMPOTENCY_UNKNOWN", 0, 0);
	//    0    0:new             #2   <Class DescriptorProtos$MethodOptions$IdempotencyLevel>
	//    1    3:dup             
	//    2    4:ldc1            #36  <String "IDEMPOTENCY_UNKNOWN">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #40  <Method void DescriptorProtos$MethodOptions$IdempotencyLevel(String, int, int)>
	//    6   11:putstatic       #42  <Field DescriptorProtos$MethodOptions$IdempotencyLevel IDEMPOTENCY_UNKNOWN>
		NO_SIDE_EFFECTS = new DescriptorProtos$MethodOptions$IdempotencyLevel("NO_SIDE_EFFECTS", 1, 1);
	//    7   14:new             #2   <Class DescriptorProtos$MethodOptions$IdempotencyLevel>
	//    8   17:dup             
	//    9   18:ldc1            #43  <String "NO_SIDE_EFFECTS">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #40  <Method void DescriptorProtos$MethodOptions$IdempotencyLevel(String, int, int)>
	//   13   25:putstatic       #45  <Field DescriptorProtos$MethodOptions$IdempotencyLevel NO_SIDE_EFFECTS>
		IDEMPOTENT = new DescriptorProtos$MethodOptions$IdempotencyLevel("IDEMPOTENT", 2, 2);
	//   14   28:new             #2   <Class DescriptorProtos$MethodOptions$IdempotencyLevel>
	//   15   31:dup             
	//   16   32:ldc1            #46  <String "IDEMPOTENT">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #40  <Method void DescriptorProtos$MethodOptions$IdempotencyLevel(String, int, int)>
	//   20   39:putstatic       #48  <Field DescriptorProtos$MethodOptions$IdempotencyLevel IDEMPOTENT>
		$VALUES = (new DescriptorProtos$MethodOptions$IdempotencyLevel[] {
			IDEMPOTENCY_UNKNOWN, NO_SIDE_EFFECTS, IDEMPOTENT
		});
	//   21   42:iconst_3        
	//   22   43:anewarray       DescriptorProtos$MethodOptions$IdempotencyLevel[]
	//   23   46:dup             
	//   24   47:iconst_0        
	//   25   48:getstatic       #42  <Field DescriptorProtos$MethodOptions$IdempotencyLevel IDEMPOTENCY_UNKNOWN>
	//   26   51:aastore         
	//   27   52:dup             
	//   28   53:iconst_1        
	//   29   54:getstatic       #45  <Field DescriptorProtos$MethodOptions$IdempotencyLevel NO_SIDE_EFFECTS>
	//   30   57:aastore         
	//   31   58:dup             
	//   32   59:iconst_2        
	//   33   60:getstatic       #48  <Field DescriptorProtos$MethodOptions$IdempotencyLevel IDEMPOTENT>
	//   34   63:aastore         
	//   35   64:putstatic       #50  <Field DescriptorProtos$MethodOptions$IdempotencyLevel[] $VALUES>
	//   36   67:new             #15  <Class DescriptorProtos$MethodOptions$IdempotencyLevel$1>
	//   37   70:dup             
	//   38   71:invokespecial   #52  <Method void DescriptorProtos$MethodOptions$IdempotencyLevel$1()>
	//   39   74:putstatic       #54  <Field Internal$EnumLiteMap internalValueMap>
	//   40   77:invokestatic    #58  <Method DescriptorProtos$MethodOptions$IdempotencyLevel[] values()>
	//   41   80:putstatic       #60  <Field DescriptorProtos$MethodOptions$IdempotencyLevel[] VALUES>
	//*  42   83:return          
	}

	private DescriptorProtos$MethodOptions$IdempotencyLevel(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #64  <Method void Enum(String, int)>
		value = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #66  <Field int value>
	//    7   11:return          
	}
}
