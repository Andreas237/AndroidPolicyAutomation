// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.util.List;

// Referenced classes of package com.google.protobuf:
//			ProtocolMessageEnum, DescriptorProtos

public static final class DescriptorProtos$FieldDescriptorProto$Type extends Enum
	implements ProtocolMessageEnum
{

	public static DescriptorProtos$FieldDescriptorProto$Type forNumber(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     1 18: default 88
	//	               1 91
	//	               2 95
	//	               3 99
	//	               4 103
	//	               5 107
	//	               6 111
	//	               7 115
	//	               8 119
	//	               9 123
	//	               10 127
	//	               11 131
	//	               12 135
	//	               13 139
	//	               14 143
	//	               15 147
	//	               16 151
	//	               17 155
	//	               18 159
	//*   2   88:goto            163
		case 1: // '\001'
			return TYPE_DOUBLE;
	//    3   91:getstatic       #87  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_DOUBLE>
	//    4   94:areturn         

		case 2: // '\002'
			return TYPE_FLOAT;
	//    5   95:getstatic       #90  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_FLOAT>
	//    6   98:areturn         

		case 3: // '\003'
			return TYPE_INT64;
	//    7   99:getstatic       #93  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_INT64>
	//    8  102:areturn         

		case 4: // '\004'
			return TYPE_UINT64;
	//    9  103:getstatic       #96  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_UINT64>
	//   10  106:areturn         

		case 5: // '\005'
			return TYPE_INT32;
	//   11  107:getstatic       #99  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_INT32>
	//   12  110:areturn         

		case 6: // '\006'
			return TYPE_FIXED64;
	//   13  111:getstatic       #102 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_FIXED64>
	//   14  114:areturn         

		case 7: // '\007'
			return TYPE_FIXED32;
	//   15  115:getstatic       #105 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_FIXED32>
	//   16  118:areturn         

		case 8: // '\b'
			return TYPE_BOOL;
	//   17  119:getstatic       #108 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_BOOL>
	//   18  122:areturn         

		case 9: // '\t'
			return TYPE_STRING;
	//   19  123:getstatic       #111 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_STRING>
	//   20  126:areturn         

		case 10: // '\n'
			return TYPE_GROUP;
	//   21  127:getstatic       #114 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_GROUP>
	//   22  130:areturn         

		case 11: // '\013'
			return TYPE_MESSAGE;
	//   23  131:getstatic       #117 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_MESSAGE>
	//   24  134:areturn         

		case 12: // '\f'
			return TYPE_BYTES;
	//   25  135:getstatic       #120 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_BYTES>
	//   26  138:areturn         

		case 13: // '\r'
			return TYPE_UINT32;
	//   27  139:getstatic       #123 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_UINT32>
	//   28  142:areturn         

		case 14: // '\016'
			return TYPE_ENUM;
	//   29  143:getstatic       #126 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_ENUM>
	//   30  146:areturn         

		case 15: // '\017'
			return TYPE_SFIXED32;
	//   31  147:getstatic       #129 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_SFIXED32>
	//   32  150:areturn         

		case 16: // '\020'
			return TYPE_SFIXED64;
	//   33  151:getstatic       #132 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_SFIXED64>
	//   34  154:areturn         

		case 17: // '\021'
			return TYPE_SINT32;
	//   35  155:getstatic       #135 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_SINT32>
	//   36  158:areturn         

		case 18: // '\022'
			return TYPE_SINT64;
	//   37  159:getstatic       #138 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_SINT64>
	//   38  162:areturn         
		}
		return null;
	//   39  163:aconst_null     
	//   40  164:areturn         
	}

	public static final Descriptors.EnumDescriptor getDescriptor()
	{
		return (Descriptors.EnumDescriptor)DescriptorProtos.FieldDescriptorProto.getDescriptor().getEnumTypes().get(0);
	//    0    0:invokestatic    #165 <Method Descriptors$Descriptor DescriptorProtos$FieldDescriptorProto.getDescriptor()>
	//    1    3:invokevirtual   #171 <Method List Descriptors$Descriptor.getEnumTypes()>
	//    2    6:iconst_0        
	//    3    7:invokeinterface #177 <Method Object List.get(int)>
	//    4   12:checkcast       #179 <Class Descriptors$EnumDescriptor>
	//    5   15:areturn         
	}

	public static Internal.EnumLiteMap internalGetValueMap()
	{
		return internalValueMap;
	//    0    0:getstatic       #144 <Field Internal$EnumLiteMap internalValueMap>
	//    1    3:areturn         
	}

	public static DescriptorProtos$FieldDescriptorProto$Type valueOf(int i)
	{
		return forNumber(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #186 <Method DescriptorProtos$FieldDescriptorProto$Type forNumber(int)>
	//    2    4:areturn         
	}

	public static DescriptorProtos$FieldDescriptorProto$Type valueOf(Descriptors.EnumValueDescriptor enumvaluedescriptor)
	{
		if(enumvaluedescriptor.getType() != getDescriptor())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #193 <Method Descriptors$EnumDescriptor Descriptors$EnumValueDescriptor.getType()>
	//*   2    4:invokestatic    #195 <Method Descriptors$EnumDescriptor getDescriptor()>
	//*   3    7:if_acmpeq       20
			throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
	//    4   10:new             #197 <Class IllegalArgumentException>
	//    5   13:dup             
	//    6   14:ldc1            #199 <String "EnumValueDescriptor is not for this type.">
	//    7   16:invokespecial   #202 <Method void IllegalArgumentException(String)>
	//    8   19:athrow          
		else
			return VALUES[enumvaluedescriptor.getIndex()];
	//    9   20:getstatic       #150 <Field DescriptorProtos$FieldDescriptorProto$Type[] VALUES>
	//   10   23:aload_0         
	//   11   24:invokevirtual   #206 <Method int Descriptors$EnumValueDescriptor.getIndex()>
	//   12   27:aaload          
	//   13   28:areturn         
	}

	public static DescriptorProtos$FieldDescriptorProto$Type valueOf(String s)
	{
		return (DescriptorProtos$FieldDescriptorProto$Type)Enum.valueOf(com/google/protobuf/DescriptorProtos$FieldDescriptorProto$Type, s);
	//    0    0:ldc1            #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
	//    1    2:aload_0         
	//    2    3:invokestatic    #210 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
	//    4    9:areturn         
	}

	public static DescriptorProtos$FieldDescriptorProto$Type[] values()
	{
		return (DescriptorProtos$FieldDescriptorProto$Type[])((DescriptorProtos$FieldDescriptorProto$Type []) ($VALUES)).clone();
	//    0    0:getstatic       #140 <Field DescriptorProtos$FieldDescriptorProto$Type[] $VALUES>
	//    1    3:invokevirtual   #215 <Method Object _5B_Lcom.google.protobuf.DescriptorProtos$FieldDescriptorProto$Type_3B_.clone()>
	//    2    6:checkcast       #211 <Class DescriptorProtos$FieldDescriptorProto$Type[]>
	//    3    9:areturn         
	}

	public final Descriptors.EnumDescriptor getDescriptorForType()
	{
		return getDescriptor();
	//    0    0:invokestatic    #195 <Method Descriptors$EnumDescriptor getDescriptor()>
	//    1    3:areturn         
	}

	public final int getNumber()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field int value>
	//    2    4:ireturn         
	}

	public final Descriptors.EnumValueDescriptor getValueDescriptor()
	{
		return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(ordinal());
	//    0    0:invokestatic    #195 <Method Descriptors$EnumDescriptor getDescriptor()>
	//    1    3:invokevirtual   #222 <Method List Descriptors$EnumDescriptor.getValues()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #225 <Method int ordinal()>
	//    4   10:invokeinterface #177 <Method Object List.get(int)>
	//    5   15:checkcast       #190 <Class Descriptors$EnumValueDescriptor>
	//    6   18:areturn         
	}

	private static final DescriptorProtos$FieldDescriptorProto$Type $VALUES[];
	public static final DescriptorProtos$FieldDescriptorProto$Type TYPE_BOOL;
	public static final int TYPE_BOOL_VALUE = 8;
	public static final DescriptorProtos$FieldDescriptorProto$Type TYPE_BYTES;
	public static final int TYPE_BYTES_VALUE = 12;
	public static final DescriptorProtos$FieldDescriptorProto$Type TYPE_DOUBLE;
	public static final int TYPE_DOUBLE_VALUE = 1;
	public static final DescriptorProtos$FieldDescriptorProto$Type TYPE_ENUM;
	public static final int TYPE_ENUM_VALUE = 14;
	public static final DescriptorProtos$FieldDescriptorProto$Type TYPE_FIXED32;
	public static final int TYPE_FIXED32_VALUE = 7;
	public static final DescriptorProtos$FieldDescriptorProto$Type TYPE_FIXED64;
	public static final int TYPE_FIXED64_VALUE = 6;
	public static final DescriptorProtos$FieldDescriptorProto$Type TYPE_FLOAT;
	public static final int TYPE_FLOAT_VALUE = 2;
	public static final DescriptorProtos$FieldDescriptorProto$Type TYPE_GROUP;
	public static final int TYPE_GROUP_VALUE = 10;
	public static final DescriptorProtos$FieldDescriptorProto$Type TYPE_INT32;
	public static final int TYPE_INT32_VALUE = 5;
	public static final DescriptorProtos$FieldDescriptorProto$Type TYPE_INT64;
	public static final int TYPE_INT64_VALUE = 3;
	public static final DescriptorProtos$FieldDescriptorProto$Type TYPE_MESSAGE;
	public static final int TYPE_MESSAGE_VALUE = 11;
	public static final DescriptorProtos$FieldDescriptorProto$Type TYPE_SFIXED32;
	public static final int TYPE_SFIXED32_VALUE = 15;
	public static final DescriptorProtos$FieldDescriptorProto$Type TYPE_SFIXED64;
	public static final int TYPE_SFIXED64_VALUE = 16;
	public static final DescriptorProtos$FieldDescriptorProto$Type TYPE_SINT32;
	public static final int TYPE_SINT32_VALUE = 17;
	public static final DescriptorProtos$FieldDescriptorProto$Type TYPE_SINT64;
	public static final int TYPE_SINT64_VALUE = 18;
	public static final DescriptorProtos$FieldDescriptorProto$Type TYPE_STRING;
	public static final int TYPE_STRING_VALUE = 9;
	public static final DescriptorProtos$FieldDescriptorProto$Type TYPE_UINT32;
	public static final int TYPE_UINT32_VALUE = 13;
	public static final DescriptorProtos$FieldDescriptorProto$Type TYPE_UINT64;
	public static final int TYPE_UINT64_VALUE = 4;
	private static final DescriptorProtos$FieldDescriptorProto$Type VALUES[] = values();
	private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() {

		public DescriptorProtos.FieldDescriptorProto.Type findValueByNumber(int i)
		{
			return DescriptorProtos.FieldDescriptorProto.Type.forNumber(i);
		//    0    0:iload_1         
		//    1    1:invokestatic    #25  <Method DescriptorProtos$FieldDescriptorProto$Type DescriptorProtos$FieldDescriptorProto$Type.forNumber(int)>
		//    2    4:areturn         
		}

		public volatile Internal.EnumLite findValueByNumber(int i)
		{
			return ((Internal.EnumLite) (findValueByNumber(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method DescriptorProtos$FieldDescriptorProto$Type findValueByNumber(int)>
		//    3    5:areturn         
		}

	}
;
	private final int value;

	static 
	{
		TYPE_DOUBLE = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_DOUBLE", 0, 1);
	//    0    0:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
	//    1    3:dup             
	//    2    4:ldc1            #81  <String "TYPE_DOUBLE">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
	//    6   11:putstatic       #87  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_DOUBLE>
		TYPE_FLOAT = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_FLOAT", 1, 2);
	//    7   14:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
	//    8   17:dup             
	//    9   18:ldc1            #88  <String "TYPE_FLOAT">
	//   10   20:iconst_1        
	//   11   21:iconst_2        
	//   12   22:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
	//   13   25:putstatic       #90  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_FLOAT>
		TYPE_INT64 = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_INT64", 2, 3);
	//   14   28:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
	//   15   31:dup             
	//   16   32:ldc1            #91  <String "TYPE_INT64">
	//   17   34:iconst_2        
	//   18   35:iconst_3        
	//   19   36:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
	//   20   39:putstatic       #93  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_INT64>
		TYPE_UINT64 = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_UINT64", 3, 4);
	//   21   42:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
	//   22   45:dup             
	//   23   46:ldc1            #94  <String "TYPE_UINT64">
	//   24   48:iconst_3        
	//   25   49:iconst_4        
	//   26   50:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
	//   27   53:putstatic       #96  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_UINT64>
		TYPE_INT32 = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_INT32", 4, 5);
	//   28   56:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
	//   29   59:dup             
	//   30   60:ldc1            #97  <String "TYPE_INT32">
	//   31   62:iconst_4        
	//   32   63:iconst_5        
	//   33   64:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
	//   34   67:putstatic       #99  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_INT32>
		TYPE_FIXED64 = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_FIXED64", 5, 6);
	//   35   70:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
	//   36   73:dup             
	//   37   74:ldc1            #100 <String "TYPE_FIXED64">
	//   38   76:iconst_5        
	//   39   77:bipush          6
	//   40   79:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
	//   41   82:putstatic       #102 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_FIXED64>
		TYPE_FIXED32 = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_FIXED32", 6, 7);
	//   42   85:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
	//   43   88:dup             
	//   44   89:ldc1            #103 <String "TYPE_FIXED32">
	//   45   91:bipush          6
	//   46   93:bipush          7
	//   47   95:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
	//   48   98:putstatic       #105 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_FIXED32>
		TYPE_BOOL = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_BOOL", 7, 8);
	//   49  101:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
	//   50  104:dup             
	//   51  105:ldc1            #106 <String "TYPE_BOOL">
	//   52  107:bipush          7
	//   53  109:bipush          8
	//   54  111:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
	//   55  114:putstatic       #108 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_BOOL>
		TYPE_STRING = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_STRING", 8, 9);
	//   56  117:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
	//   57  120:dup             
	//   58  121:ldc1            #109 <String "TYPE_STRING">
	//   59  123:bipush          8
	//   60  125:bipush          9
	//   61  127:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
	//   62  130:putstatic       #111 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_STRING>
		TYPE_GROUP = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_GROUP", 9, 10);
	//   63  133:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
	//   64  136:dup             
	//   65  137:ldc1            #112 <String "TYPE_GROUP">
	//   66  139:bipush          9
	//   67  141:bipush          10
	//   68  143:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
	//   69  146:putstatic       #114 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_GROUP>
		TYPE_MESSAGE = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_MESSAGE", 10, 11);
	//   70  149:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
	//   71  152:dup             
	//   72  153:ldc1            #115 <String "TYPE_MESSAGE">
	//   73  155:bipush          10
	//   74  157:bipush          11
	//   75  159:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
	//   76  162:putstatic       #117 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_MESSAGE>
		TYPE_BYTES = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_BYTES", 11, 12);
	//   77  165:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
	//   78  168:dup             
	//   79  169:ldc1            #118 <String "TYPE_BYTES">
	//   80  171:bipush          11
	//   81  173:bipush          12
	//   82  175:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
	//   83  178:putstatic       #120 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_BYTES>
		TYPE_UINT32 = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_UINT32", 12, 13);
	//   84  181:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
	//   85  184:dup             
	//   86  185:ldc1            #121 <String "TYPE_UINT32">
	//   87  187:bipush          12
	//   88  189:bipush          13
	//   89  191:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
	//   90  194:putstatic       #123 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_UINT32>
		TYPE_ENUM = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_ENUM", 13, 14);
	//   91  197:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
	//   92  200:dup             
	//   93  201:ldc1            #124 <String "TYPE_ENUM">
	//   94  203:bipush          13
	//   95  205:bipush          14
	//   96  207:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
	//   97  210:putstatic       #126 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_ENUM>
		TYPE_SFIXED32 = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_SFIXED32", 14, 15);
	//   98  213:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
	//   99  216:dup             
	//  100  217:ldc1            #127 <String "TYPE_SFIXED32">
	//  101  219:bipush          14
	//  102  221:bipush          15
	//  103  223:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
	//  104  226:putstatic       #129 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_SFIXED32>
		TYPE_SFIXED64 = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_SFIXED64", 15, 16);
	//  105  229:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
	//  106  232:dup             
	//  107  233:ldc1            #130 <String "TYPE_SFIXED64">
	//  108  235:bipush          15
	//  109  237:bipush          16
	//  110  239:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
	//  111  242:putstatic       #132 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_SFIXED64>
		TYPE_SINT32 = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_SINT32", 16, 17);
	//  112  245:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
	//  113  248:dup             
	//  114  249:ldc1            #133 <String "TYPE_SINT32">
	//  115  251:bipush          16
	//  116  253:bipush          17
	//  117  255:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
	//  118  258:putstatic       #135 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_SINT32>
		TYPE_SINT64 = new DescriptorProtos$FieldDescriptorProto$Type("TYPE_SINT64", 17, 18);
	//  119  261:new             #2   <Class DescriptorProtos$FieldDescriptorProto$Type>
	//  120  264:dup             
	//  121  265:ldc1            #136 <String "TYPE_SINT64">
	//  122  267:bipush          17
	//  123  269:bipush          18
	//  124  271:invokespecial   #85  <Method void DescriptorProtos$FieldDescriptorProto$Type(String, int, int)>
	//  125  274:putstatic       #138 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_SINT64>
		$VALUES = (new DescriptorProtos$FieldDescriptorProto$Type[] {
			TYPE_DOUBLE, TYPE_FLOAT, TYPE_INT64, TYPE_UINT64, TYPE_INT32, TYPE_FIXED64, TYPE_FIXED32, TYPE_BOOL, TYPE_STRING, TYPE_GROUP, 
			TYPE_MESSAGE, TYPE_BYTES, TYPE_UINT32, TYPE_ENUM, TYPE_SFIXED32, TYPE_SFIXED64, TYPE_SINT32, TYPE_SINT64
		});
	//  126  277:bipush          18
	//  127  279:anewarray       DescriptorProtos$FieldDescriptorProto$Type[]
	//  128  282:dup             
	//  129  283:iconst_0        
	//  130  284:getstatic       #87  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_DOUBLE>
	//  131  287:aastore         
	//  132  288:dup             
	//  133  289:iconst_1        
	//  134  290:getstatic       #90  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_FLOAT>
	//  135  293:aastore         
	//  136  294:dup             
	//  137  295:iconst_2        
	//  138  296:getstatic       #93  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_INT64>
	//  139  299:aastore         
	//  140  300:dup             
	//  141  301:iconst_3        
	//  142  302:getstatic       #96  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_UINT64>
	//  143  305:aastore         
	//  144  306:dup             
	//  145  307:iconst_4        
	//  146  308:getstatic       #99  <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_INT32>
	//  147  311:aastore         
	//  148  312:dup             
	//  149  313:iconst_5        
	//  150  314:getstatic       #102 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_FIXED64>
	//  151  317:aastore         
	//  152  318:dup             
	//  153  319:bipush          6
	//  154  321:getstatic       #105 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_FIXED32>
	//  155  324:aastore         
	//  156  325:dup             
	//  157  326:bipush          7
	//  158  328:getstatic       #108 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_BOOL>
	//  159  331:aastore         
	//  160  332:dup             
	//  161  333:bipush          8
	//  162  335:getstatic       #111 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_STRING>
	//  163  338:aastore         
	//  164  339:dup             
	//  165  340:bipush          9
	//  166  342:getstatic       #114 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_GROUP>
	//  167  345:aastore         
	//  168  346:dup             
	//  169  347:bipush          10
	//  170  349:getstatic       #117 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_MESSAGE>
	//  171  352:aastore         
	//  172  353:dup             
	//  173  354:bipush          11
	//  174  356:getstatic       #120 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_BYTES>
	//  175  359:aastore         
	//  176  360:dup             
	//  177  361:bipush          12
	//  178  363:getstatic       #123 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_UINT32>
	//  179  366:aastore         
	//  180  367:dup             
	//  181  368:bipush          13
	//  182  370:getstatic       #126 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_ENUM>
	//  183  373:aastore         
	//  184  374:dup             
	//  185  375:bipush          14
	//  186  377:getstatic       #129 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_SFIXED32>
	//  187  380:aastore         
	//  188  381:dup             
	//  189  382:bipush          15
	//  190  384:getstatic       #132 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_SFIXED64>
	//  191  387:aastore         
	//  192  388:dup             
	//  193  389:bipush          16
	//  194  391:getstatic       #135 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_SINT32>
	//  195  394:aastore         
	//  196  395:dup             
	//  197  396:bipush          17
	//  198  398:getstatic       #138 <Field DescriptorProtos$FieldDescriptorProto$Type TYPE_SINT64>
	//  199  401:aastore         
	//  200  402:putstatic       #140 <Field DescriptorProtos$FieldDescriptorProto$Type[] $VALUES>
	//  201  405:new             #15  <Class DescriptorProtos$FieldDescriptorProto$Type$1>
	//  202  408:dup             
	//  203  409:invokespecial   #142 <Method void DescriptorProtos$FieldDescriptorProto$Type$1()>
	//  204  412:putstatic       #144 <Field Internal$EnumLiteMap internalValueMap>
	//  205  415:invokestatic    #148 <Method DescriptorProtos$FieldDescriptorProto$Type[] values()>
	//  206  418:putstatic       #150 <Field DescriptorProtos$FieldDescriptorProto$Type[] VALUES>
	//* 207  421:return          
	}

	private DescriptorProtos$FieldDescriptorProto$Type(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #154 <Method void Enum(String, int)>
		value = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #156 <Field int value>
	//    7   11:return          
	}
}
