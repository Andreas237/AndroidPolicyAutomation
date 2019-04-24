// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.protobuf:
//			Descriptors, TextFormat, Message, MessageLite, 
//			ByteString

public static final class Descriptors$FieldDescriptor extends r
	implements Comparable, 
{
	public static final class JavaType extends Enum
	{

		public static JavaType valueOf(String s)
		{
			return (JavaType)Enum.valueOf(com/google/protobuf/Descriptors$FieldDescriptor$JavaType, s);
		//    0    0:ldc1            #2   <Class Descriptors$FieldDescriptor$JavaType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #108 <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Descriptors$FieldDescriptor$JavaType>
		//    4    9:areturn         
		}

		public static JavaType[] values()
		{
			return (JavaType[])((JavaType []) ($VALUES)).clone();
		//    0    0:getstatic       #94  <Field Descriptors$FieldDescriptor$JavaType[] $VALUES>
		//    1    3:invokevirtual   #115 <Method Object _5B_Lcom.google.protobuf.Descriptors$FieldDescriptor$JavaType_3B_.clone()>
		//    2    6:checkcast       #111 <Class Descriptors$FieldDescriptor$JavaType[]>
		//    3    9:areturn         
		}

		private static final JavaType $VALUES[];
		public static final JavaType BOOLEAN;
		public static final JavaType BYTE_STRING;
		public static final JavaType DOUBLE;
		public static final JavaType ENUM;
		public static final JavaType FLOAT;
		public static final JavaType INT;
		public static final JavaType LONG;
		public static final JavaType MESSAGE;
		public static final JavaType STRING;
		private final Object defaultDefault;

		static 
		{
			INT = new JavaType("INT", 0, ((Object) (Integer.valueOf(0))));
		//    0    0:new             #2   <Class Descriptors$FieldDescriptor$JavaType>
		//    1    3:dup             
		//    2    4:ldc1            #28  <String "INT">
		//    3    6:iconst_0        
		//    4    7:iconst_0        
		//    5    8:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//    6   11:invokespecial   #38  <Method void Descriptors$FieldDescriptor$JavaType(String, int, Object)>
		//    7   14:putstatic       #40  <Field Descriptors$FieldDescriptor$JavaType INT>
			LONG = new JavaType("LONG", 1, ((Object) (Long.valueOf(0L))));
		//    8   17:new             #2   <Class Descriptors$FieldDescriptor$JavaType>
		//    9   20:dup             
		//   10   21:ldc1            #41  <String "LONG">
		//   11   23:iconst_1        
		//   12   24:lconst_0        
		//   13   25:invokestatic    #46  <Method Long Long.valueOf(long)>
		//   14   28:invokespecial   #38  <Method void Descriptors$FieldDescriptor$JavaType(String, int, Object)>
		//   15   31:putstatic       #48  <Field Descriptors$FieldDescriptor$JavaType LONG>
			FLOAT = new JavaType("FLOAT", 2, ((Object) (Float.valueOf(0.0F))));
		//   16   34:new             #2   <Class Descriptors$FieldDescriptor$JavaType>
		//   17   37:dup             
		//   18   38:ldc1            #49  <String "FLOAT">
		//   19   40:iconst_2        
		//   20   41:fconst_0        
		//   21   42:invokestatic    #54  <Method Float Float.valueOf(float)>
		//   22   45:invokespecial   #38  <Method void Descriptors$FieldDescriptor$JavaType(String, int, Object)>
		//   23   48:putstatic       #56  <Field Descriptors$FieldDescriptor$JavaType FLOAT>
			DOUBLE = new JavaType("DOUBLE", 3, ((Object) (Double.valueOf(0.0D))));
		//   24   51:new             #2   <Class Descriptors$FieldDescriptor$JavaType>
		//   25   54:dup             
		//   26   55:ldc1            #57  <String "DOUBLE">
		//   27   57:iconst_3        
		//   28   58:dconst_0        
		//   29   59:invokestatic    #62  <Method Double Double.valueOf(double)>
		//   30   62:invokespecial   #38  <Method void Descriptors$FieldDescriptor$JavaType(String, int, Object)>
		//   31   65:putstatic       #64  <Field Descriptors$FieldDescriptor$JavaType DOUBLE>
			BOOLEAN = new JavaType("BOOLEAN", 4, ((Object) (Boolean.valueOf(false))));
		//   32   68:new             #2   <Class Descriptors$FieldDescriptor$JavaType>
		//   33   71:dup             
		//   34   72:ldc1            #65  <String "BOOLEAN">
		//   35   74:iconst_4        
		//   36   75:iconst_0        
		//   37   76:invokestatic    #70  <Method Boolean Boolean.valueOf(boolean)>
		//   38   79:invokespecial   #38  <Method void Descriptors$FieldDescriptor$JavaType(String, int, Object)>
		//   39   82:putstatic       #72  <Field Descriptors$FieldDescriptor$JavaType BOOLEAN>
			STRING = new JavaType("STRING", 5, "");
		//   40   85:new             #2   <Class Descriptors$FieldDescriptor$JavaType>
		//   41   88:dup             
		//   42   89:ldc1            #73  <String "STRING">
		//   43   91:iconst_5        
		//   44   92:ldc1            #75  <String "">
		//   45   94:invokespecial   #38  <Method void Descriptors$FieldDescriptor$JavaType(String, int, Object)>
		//   46   97:putstatic       #77  <Field Descriptors$FieldDescriptor$JavaType STRING>
			BYTE_STRING = new JavaType("BYTE_STRING", 6, ((Object) (ByteString.EMPTY)));
		//   47  100:new             #2   <Class Descriptors$FieldDescriptor$JavaType>
		//   48  103:dup             
		//   49  104:ldc1            #78  <String "BYTE_STRING">
		//   50  106:bipush          6
		//   51  108:getstatic       #84  <Field ByteString ByteString.EMPTY>
		//   52  111:invokespecial   #38  <Method void Descriptors$FieldDescriptor$JavaType(String, int, Object)>
		//   53  114:putstatic       #86  <Field Descriptors$FieldDescriptor$JavaType BYTE_STRING>
			ENUM = new JavaType("ENUM", 7, ((Object) (null)));
		//   54  117:new             #2   <Class Descriptors$FieldDescriptor$JavaType>
		//   55  120:dup             
		//   56  121:ldc1            #87  <String "ENUM">
		//   57  123:bipush          7
		//   58  125:aconst_null     
		//   59  126:invokespecial   #38  <Method void Descriptors$FieldDescriptor$JavaType(String, int, Object)>
		//   60  129:putstatic       #89  <Field Descriptors$FieldDescriptor$JavaType ENUM>
			MESSAGE = new JavaType("MESSAGE", 8, ((Object) (null)));
		//   61  132:new             #2   <Class Descriptors$FieldDescriptor$JavaType>
		//   62  135:dup             
		//   63  136:ldc1            #90  <String "MESSAGE">
		//   64  138:bipush          8
		//   65  140:aconst_null     
		//   66  141:invokespecial   #38  <Method void Descriptors$FieldDescriptor$JavaType(String, int, Object)>
		//   67  144:putstatic       #92  <Field Descriptors$FieldDescriptor$JavaType MESSAGE>
			$VALUES = (new JavaType[] {
				INT, LONG, FLOAT, DOUBLE, BOOLEAN, STRING, BYTE_STRING, ENUM, MESSAGE
			});
		//   68  147:bipush          9
		//   69  149:anewarray       JavaType[]
		//   70  152:dup             
		//   71  153:iconst_0        
		//   72  154:getstatic       #40  <Field Descriptors$FieldDescriptor$JavaType INT>
		//   73  157:aastore         
		//   74  158:dup             
		//   75  159:iconst_1        
		//   76  160:getstatic       #48  <Field Descriptors$FieldDescriptor$JavaType LONG>
		//   77  163:aastore         
		//   78  164:dup             
		//   79  165:iconst_2        
		//   80  166:getstatic       #56  <Field Descriptors$FieldDescriptor$JavaType FLOAT>
		//   81  169:aastore         
		//   82  170:dup             
		//   83  171:iconst_3        
		//   84  172:getstatic       #64  <Field Descriptors$FieldDescriptor$JavaType DOUBLE>
		//   85  175:aastore         
		//   86  176:dup             
		//   87  177:iconst_4        
		//   88  178:getstatic       #72  <Field Descriptors$FieldDescriptor$JavaType BOOLEAN>
		//   89  181:aastore         
		//   90  182:dup             
		//   91  183:iconst_5        
		//   92  184:getstatic       #77  <Field Descriptors$FieldDescriptor$JavaType STRING>
		//   93  187:aastore         
		//   94  188:dup             
		//   95  189:bipush          6
		//   96  191:getstatic       #86  <Field Descriptors$FieldDescriptor$JavaType BYTE_STRING>
		//   97  194:aastore         
		//   98  195:dup             
		//   99  196:bipush          7
		//  100  198:getstatic       #89  <Field Descriptors$FieldDescriptor$JavaType ENUM>
		//  101  201:aastore         
		//  102  202:dup             
		//  103  203:bipush          8
		//  104  205:getstatic       #92  <Field Descriptors$FieldDescriptor$JavaType MESSAGE>
		//  105  208:aastore         
		//  106  209:putstatic       #94  <Field Descriptors$FieldDescriptor$JavaType[] $VALUES>
		//* 107  212:return          
		}


/*
		static Object access$2300(JavaType javatype)
		{
			return javatype.defaultDefault;
		//    0    0:aload_0         
		//    1    1:getfield        #100 <Field Object defaultDefault>
		//    2    4:areturn         
		}

*/

		private JavaType(String s, int i, Object obj)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #98  <Method void Enum(String, int)>
			defaultDefault = obj;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #100 <Field Object defaultDefault>
		//    7   11:return          
		}
	}

	public static final class Type extends Enum
	{

		public static Type valueOf(DescriptorProtos.FieldDescriptorProto.Type type1)
		{
			return values()[type1.getNumber() - 1];
		//    0    0:invokestatic    #134 <Method Descriptors$FieldDescriptor$Type[] values()>
		//    1    3:aload_0         
		//    2    4:invokevirtual   #140 <Method int DescriptorProtos$FieldDescriptorProto$Type.getNumber()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:aaload          
		//    6   10:areturn         
		}

		public static Type valueOf(String s)
		{
			return (Type)Enum.valueOf(com/google/protobuf/Descriptors$FieldDescriptor$Type, s);
		//    0    0:ldc1            #2   <Class Descriptors$FieldDescriptor$Type>
		//    1    2:aload_0         
		//    2    3:invokestatic    #144 <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Descriptors$FieldDescriptor$Type>
		//    4    9:areturn         
		}

		public static Type[] values()
		{
			return (Type[])((Type []) ($VALUES)).clone();
		//    0    0:getstatic       #120 <Field Descriptors$FieldDescriptor$Type[] $VALUES>
		//    1    3:invokevirtual   #149 <Method Object _5B_Lcom.google.protobuf.Descriptors$FieldDescriptor$Type_3B_.clone()>
		//    2    6:checkcast       #145 <Class Descriptors$FieldDescriptor$Type[]>
		//    3    9:areturn         
		}

		public JavaType getJavaType()
		{
			return javaType;
		//    0    0:aload_0         
		//    1    1:getfield        #126 <Field Descriptors$FieldDescriptor$JavaType javaType>
		//    2    4:areturn         
		}

		public DescriptorProtos.FieldDescriptorProto.Type toProto()
		{
			return DescriptorProtos.FieldDescriptorProto.Type.forNumber(ordinal() + 1);
		//    0    0:aload_0         
		//    1    1:invokevirtual   #156 <Method int ordinal()>
		//    2    4:iconst_1        
		//    3    5:iadd            
		//    4    6:invokestatic    #160 <Method DescriptorProtos$FieldDescriptorProto$Type DescriptorProtos$FieldDescriptorProto$Type.forNumber(int)>
		//    5    9:areturn         
		}

		private static final Type $VALUES[];
		public static final Type BOOL;
		public static final Type BYTES;
		public static final Type DOUBLE;
		public static final Type ENUM;
		public static final Type FIXED32;
		public static final Type FIXED64;
		public static final Type FLOAT;
		public static final Type GROUP;
		public static final Type INT32;
		public static final Type INT64;
		public static final Type MESSAGE;
		public static final Type SFIXED32;
		public static final Type SFIXED64;
		public static final Type SINT32;
		public static final Type SINT64;
		public static final Type STRING;
		public static final Type UINT32;
		public static final Type UINT64;
		private JavaType javaType;

		static 
		{
			DOUBLE = new Type("DOUBLE", 0, JavaType.DOUBLE);
		//    0    0:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//    1    3:dup             
		//    2    4:ldc1            #37  <String "DOUBLE">
		//    3    6:iconst_0        
		//    4    7:getstatic       #41  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.DOUBLE>
		//    5   10:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//    6   13:putstatic       #47  <Field Descriptors$FieldDescriptor$Type DOUBLE>
			FLOAT = new Type("FLOAT", 1, JavaType.FLOAT);
		//    7   16:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//    8   19:dup             
		//    9   20:ldc1            #48  <String "FLOAT">
		//   10   22:iconst_1        
		//   11   23:getstatic       #50  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.FLOAT>
		//   12   26:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//   13   29:putstatic       #52  <Field Descriptors$FieldDescriptor$Type FLOAT>
			INT64 = new Type("INT64", 2, JavaType.LONG);
		//   14   32:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//   15   35:dup             
		//   16   36:ldc1            #53  <String "INT64">
		//   17   38:iconst_2        
		//   18   39:getstatic       #56  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.LONG>
		//   19   42:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//   20   45:putstatic       #58  <Field Descriptors$FieldDescriptor$Type INT64>
			UINT64 = new Type("UINT64", 3, JavaType.LONG);
		//   21   48:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//   22   51:dup             
		//   23   52:ldc1            #59  <String "UINT64">
		//   24   54:iconst_3        
		//   25   55:getstatic       #56  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.LONG>
		//   26   58:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//   27   61:putstatic       #61  <Field Descriptors$FieldDescriptor$Type UINT64>
			INT32 = new Type("INT32", 4, JavaType.INT);
		//   28   64:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//   29   67:dup             
		//   30   68:ldc1            #62  <String "INT32">
		//   31   70:iconst_4        
		//   32   71:getstatic       #65  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.INT>
		//   33   74:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//   34   77:putstatic       #67  <Field Descriptors$FieldDescriptor$Type INT32>
			FIXED64 = new Type("FIXED64", 5, JavaType.LONG);
		//   35   80:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//   36   83:dup             
		//   37   84:ldc1            #68  <String "FIXED64">
		//   38   86:iconst_5        
		//   39   87:getstatic       #56  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.LONG>
		//   40   90:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//   41   93:putstatic       #70  <Field Descriptors$FieldDescriptor$Type FIXED64>
			FIXED32 = new Type("FIXED32", 6, JavaType.INT);
		//   42   96:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//   43   99:dup             
		//   44  100:ldc1            #71  <String "FIXED32">
		//   45  102:bipush          6
		//   46  104:getstatic       #65  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.INT>
		//   47  107:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//   48  110:putstatic       #73  <Field Descriptors$FieldDescriptor$Type FIXED32>
			BOOL = new Type("BOOL", 7, JavaType.BOOLEAN);
		//   49  113:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//   50  116:dup             
		//   51  117:ldc1            #74  <String "BOOL">
		//   52  119:bipush          7
		//   53  121:getstatic       #77  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.BOOLEAN>
		//   54  124:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//   55  127:putstatic       #79  <Field Descriptors$FieldDescriptor$Type BOOL>
			STRING = new Type("STRING", 8, JavaType.STRING);
		//   56  130:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//   57  133:dup             
		//   58  134:ldc1            #80  <String "STRING">
		//   59  136:bipush          8
		//   60  138:getstatic       #82  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.STRING>
		//   61  141:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//   62  144:putstatic       #84  <Field Descriptors$FieldDescriptor$Type STRING>
			GROUP = new Type("GROUP", 9, JavaType.MESSAGE);
		//   63  147:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//   64  150:dup             
		//   65  151:ldc1            #85  <String "GROUP">
		//   66  153:bipush          9
		//   67  155:getstatic       #87  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.MESSAGE>
		//   68  158:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//   69  161:putstatic       #89  <Field Descriptors$FieldDescriptor$Type GROUP>
			MESSAGE = new Type("MESSAGE", 10, JavaType.MESSAGE);
		//   70  164:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//   71  167:dup             
		//   72  168:ldc1            #90  <String "MESSAGE">
		//   73  170:bipush          10
		//   74  172:getstatic       #87  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.MESSAGE>
		//   75  175:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//   76  178:putstatic       #92  <Field Descriptors$FieldDescriptor$Type MESSAGE>
			BYTES = new Type("BYTES", 11, JavaType.BYTE_STRING);
		//   77  181:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//   78  184:dup             
		//   79  185:ldc1            #93  <String "BYTES">
		//   80  187:bipush          11
		//   81  189:getstatic       #96  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.BYTE_STRING>
		//   82  192:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//   83  195:putstatic       #98  <Field Descriptors$FieldDescriptor$Type BYTES>
			UINT32 = new Type("UINT32", 12, JavaType.INT);
		//   84  198:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//   85  201:dup             
		//   86  202:ldc1            #99  <String "UINT32">
		//   87  204:bipush          12
		//   88  206:getstatic       #65  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.INT>
		//   89  209:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//   90  212:putstatic       #101 <Field Descriptors$FieldDescriptor$Type UINT32>
			ENUM = new Type("ENUM", 13, JavaType.ENUM);
		//   91  215:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//   92  218:dup             
		//   93  219:ldc1            #102 <String "ENUM">
		//   94  221:bipush          13
		//   95  223:getstatic       #104 <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.ENUM>
		//   96  226:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//   97  229:putstatic       #106 <Field Descriptors$FieldDescriptor$Type ENUM>
			SFIXED32 = new Type("SFIXED32", 14, JavaType.INT);
		//   98  232:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//   99  235:dup             
		//  100  236:ldc1            #107 <String "SFIXED32">
		//  101  238:bipush          14
		//  102  240:getstatic       #65  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.INT>
		//  103  243:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//  104  246:putstatic       #109 <Field Descriptors$FieldDescriptor$Type SFIXED32>
			SFIXED64 = new Type("SFIXED64", 15, JavaType.LONG);
		//  105  249:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//  106  252:dup             
		//  107  253:ldc1            #110 <String "SFIXED64">
		//  108  255:bipush          15
		//  109  257:getstatic       #56  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.LONG>
		//  110  260:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//  111  263:putstatic       #112 <Field Descriptors$FieldDescriptor$Type SFIXED64>
			SINT32 = new Type("SINT32", 16, JavaType.INT);
		//  112  266:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//  113  269:dup             
		//  114  270:ldc1            #113 <String "SINT32">
		//  115  272:bipush          16
		//  116  274:getstatic       #65  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.INT>
		//  117  277:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//  118  280:putstatic       #115 <Field Descriptors$FieldDescriptor$Type SINT32>
			SINT64 = new Type("SINT64", 17, JavaType.LONG);
		//  119  283:new             #2   <Class Descriptors$FieldDescriptor$Type>
		//  120  286:dup             
		//  121  287:ldc1            #116 <String "SINT64">
		//  122  289:bipush          17
		//  123  291:getstatic       #56  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.LONG>
		//  124  294:invokespecial   #45  <Method void Descriptors$FieldDescriptor$Type(String, int, Descriptors$FieldDescriptor$JavaType)>
		//  125  297:putstatic       #118 <Field Descriptors$FieldDescriptor$Type SINT64>
			$VALUES = (new Type[] {
				DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, 
				MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64
			});
		//  126  300:bipush          18
		//  127  302:anewarray       Type[]
		//  128  305:dup             
		//  129  306:iconst_0        
		//  130  307:getstatic       #47  <Field Descriptors$FieldDescriptor$Type DOUBLE>
		//  131  310:aastore         
		//  132  311:dup             
		//  133  312:iconst_1        
		//  134  313:getstatic       #52  <Field Descriptors$FieldDescriptor$Type FLOAT>
		//  135  316:aastore         
		//  136  317:dup             
		//  137  318:iconst_2        
		//  138  319:getstatic       #58  <Field Descriptors$FieldDescriptor$Type INT64>
		//  139  322:aastore         
		//  140  323:dup             
		//  141  324:iconst_3        
		//  142  325:getstatic       #61  <Field Descriptors$FieldDescriptor$Type UINT64>
		//  143  328:aastore         
		//  144  329:dup             
		//  145  330:iconst_4        
		//  146  331:getstatic       #67  <Field Descriptors$FieldDescriptor$Type INT32>
		//  147  334:aastore         
		//  148  335:dup             
		//  149  336:iconst_5        
		//  150  337:getstatic       #70  <Field Descriptors$FieldDescriptor$Type FIXED64>
		//  151  340:aastore         
		//  152  341:dup             
		//  153  342:bipush          6
		//  154  344:getstatic       #73  <Field Descriptors$FieldDescriptor$Type FIXED32>
		//  155  347:aastore         
		//  156  348:dup             
		//  157  349:bipush          7
		//  158  351:getstatic       #79  <Field Descriptors$FieldDescriptor$Type BOOL>
		//  159  354:aastore         
		//  160  355:dup             
		//  161  356:bipush          8
		//  162  358:getstatic       #84  <Field Descriptors$FieldDescriptor$Type STRING>
		//  163  361:aastore         
		//  164  362:dup             
		//  165  363:bipush          9
		//  166  365:getstatic       #89  <Field Descriptors$FieldDescriptor$Type GROUP>
		//  167  368:aastore         
		//  168  369:dup             
		//  169  370:bipush          10
		//  170  372:getstatic       #92  <Field Descriptors$FieldDescriptor$Type MESSAGE>
		//  171  375:aastore         
		//  172  376:dup             
		//  173  377:bipush          11
		//  174  379:getstatic       #98  <Field Descriptors$FieldDescriptor$Type BYTES>
		//  175  382:aastore         
		//  176  383:dup             
		//  177  384:bipush          12
		//  178  386:getstatic       #101 <Field Descriptors$FieldDescriptor$Type UINT32>
		//  179  389:aastore         
		//  180  390:dup             
		//  181  391:bipush          13
		//  182  393:getstatic       #106 <Field Descriptors$FieldDescriptor$Type ENUM>
		//  183  396:aastore         
		//  184  397:dup             
		//  185  398:bipush          14
		//  186  400:getstatic       #109 <Field Descriptors$FieldDescriptor$Type SFIXED32>
		//  187  403:aastore         
		//  188  404:dup             
		//  189  405:bipush          15
		//  190  407:getstatic       #112 <Field Descriptors$FieldDescriptor$Type SFIXED64>
		//  191  410:aastore         
		//  192  411:dup             
		//  193  412:bipush          16
		//  194  414:getstatic       #115 <Field Descriptors$FieldDescriptor$Type SINT32>
		//  195  417:aastore         
		//  196  418:dup             
		//  197  419:bipush          17
		//  198  421:getstatic       #118 <Field Descriptors$FieldDescriptor$Type SINT64>
		//  199  424:aastore         
		//  200  425:putstatic       #120 <Field Descriptors$FieldDescriptor$Type[] $VALUES>
		//* 201  428:return          
		}

		private Type(String s, int i, JavaType javatype)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #124 <Method void Enum(String, int)>
			javaType = javatype;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #126 <Field Descriptors$FieldDescriptor$JavaType javaType>
		//    7   11:return          
		}
	}


	private void crossLink()
		throws tionException
	{
		if(proto.hasExtendee())
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//*   2    4:invokevirtual   #129 <Method boolean DescriptorProtos$FieldDescriptorProto.hasExtendee()>
	//*   3    7:ifeq            153
		{
			r r = Descriptors.FileDescriptor.access$1400(file).lookupSymbol(proto.getExtendee(), ((r) (this)), earchFilter.TYPES_ONLY);
	//    4   10:aload_0         
	//    5   11:getfield        #91  <Field Descriptors$FileDescriptor file>
	//    6   14:invokestatic    #193 <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
	//    7   17:aload_0         
	//    8   18:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//    9   21:invokevirtual   #221 <Method String DescriptorProtos$FieldDescriptorProto.getExtendee()>
	//   10   24:aload_0         
	//   11   25:getstatic       #227 <Field Descriptors$DescriptorPool$SearchFilter Descriptors$DescriptorPool$SearchFilter.TYPES_ONLY>
	//   12   28:invokevirtual   #231 <Method Descriptors$GenericDescriptor Descriptors$DescriptorPool.lookupSymbol(String, Descriptors$GenericDescriptor, Descriptors$DescriptorPool$SearchFilter)>
	//   13   31:astore_1        
			if(!(r instanceof Descriptors.Descriptor))
	//*  14   32:aload_1         
	//*  15   33:instanceof      #149 <Class Descriptors$Descriptor>
	//*  16   36:ifne            79
				throw new tionException(((r) (this)), (new StringBuilder()).append('"').append(proto.getExtendee()).append("\" is not a message type.").toString(), ((Descriptors._cls1) (null)));
	//   17   39:new             #71  <Class Descriptors$DescriptorValidationException>
	//   18   42:dup             
	//   19   43:aload_0         
	//   20   44:new             #160 <Class StringBuilder>
	//   21   47:dup             
	//   22   48:invokespecial   #161 <Method void StringBuilder()>
	//   23   51:bipush          34
	//   24   53:invokevirtual   #234 <Method StringBuilder StringBuilder.append(char)>
	//   25   56:aload_0         
	//   26   57:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//   27   60:invokevirtual   #221 <Method String DescriptorProtos$FieldDescriptorProto.getExtendee()>
	//   28   63:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   29   66:ldc1            #236 <String "\" is not a message type.">
	//   30   68:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   31   71:invokevirtual   #171 <Method String StringBuilder.toString()>
	//   32   74:aconst_null     
	//   33   75:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
	//   34   78:athrow          
			containingType = (Descriptors.Descriptor)r;
	//   35   79:aload_0         
	//   36   80:aload_1         
	//   37   81:checkcast       #149 <Class Descriptors$Descriptor>
	//   38   84:putfield        #133 <Field Descriptors$Descriptor containingType>
			if(!getContainingType().isExtensionNumber(getNumber()))
	//*  39   87:aload_0         
	//*  40   88:invokevirtual   #240 <Method Descriptors$Descriptor getContainingType()>
	//*  41   91:aload_0         
	//*  42   92:invokevirtual   #121 <Method int getNumber()>
	//*  43   95:invokevirtual   #244 <Method boolean Descriptors$Descriptor.isExtensionNumber(int)>
	//*  44   98:ifne            153
				throw new tionException(((r) (this)), (new StringBuilder()).append('"').append(getContainingType().getFullName()).append("\" does not declare ").append(getNumber()).append(" as an extension number.").toString(), ((Descriptors._cls1) (null)));
	//   45  101:new             #71  <Class Descriptors$DescriptorValidationException>
	//   46  104:dup             
	//   47  105:aload_0         
	//   48  106:new             #160 <Class StringBuilder>
	//   49  109:dup             
	//   50  110:invokespecial   #161 <Method void StringBuilder()>
	//   51  113:bipush          34
	//   52  115:invokevirtual   #234 <Method StringBuilder StringBuilder.append(char)>
	//   53  118:aload_0         
	//   54  119:invokevirtual   #240 <Method Descriptors$Descriptor getContainingType()>
	//   55  122:invokevirtual   #247 <Method String Descriptors$Descriptor.getFullName()>
	//   56  125:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   57  128:ldc1            #249 <String "\" does not declare ">
	//   58  130:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   59  133:aload_0         
	//   60  134:invokevirtual   #121 <Method int getNumber()>
	//   61  137:invokevirtual   #252 <Method StringBuilder StringBuilder.append(int)>
	//   62  140:ldc1            #254 <String " as an extension number.">
	//   63  142:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   64  145:invokevirtual   #171 <Method String StringBuilder.toString()>
	//   65  148:aconst_null     
	//   66  149:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
	//   67  152:athrow          
		}
		if(proto.hasTypeName())
	//*  68  153:aload_0         
	//*  69  154:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//*  70  157:invokevirtual   #257 <Method boolean DescriptorProtos$FieldDescriptorProto.hasTypeName()>
	//*  71  160:ifeq            443
		{
			r r1 = Descriptors.FileDescriptor.access$1400(file).lookupSymbol(proto.getTypeName(), ((r) (this)), earchFilter.TYPES_ONLY);
	//   72  163:aload_0         
	//   73  164:getfield        #91  <Field Descriptors$FileDescriptor file>
	//   74  167:invokestatic    #193 <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
	//   75  170:aload_0         
	//   76  171:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//   77  174:invokevirtual   #260 <Method String DescriptorProtos$FieldDescriptorProto.getTypeName()>
	//   78  177:aload_0         
	//   79  178:getstatic       #227 <Field Descriptors$DescriptorPool$SearchFilter Descriptors$DescriptorPool$SearchFilter.TYPES_ONLY>
	//   80  181:invokevirtual   #231 <Method Descriptors$GenericDescriptor Descriptors$DescriptorPool.lookupSymbol(String, Descriptors$GenericDescriptor, Descriptors$DescriptorPool$SearchFilter)>
	//   81  184:astore_1        
			if(!proto.hasType())
	//*  82  185:aload_0         
	//*  83  186:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//*  84  189:invokevirtual   #107 <Method boolean DescriptorProtos$FieldDescriptorProto.hasType()>
	//*  85  192:ifne            270
				if(r1 instanceof Descriptors.Descriptor)
	//*  86  195:aload_1         
	//*  87  196:instanceof      #149 <Class Descriptors$Descriptor>
	//*  88  199:ifeq            212
					type = Type.MESSAGE;
	//   89  202:aload_0         
	//   90  203:getstatic       #263 <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.MESSAGE>
	//   91  206:putfield        #117 <Field Descriptors$FieldDescriptor$Type type>
				else
	//*  92  209:goto            270
				if(r1 instanceof Descriptors.EnumDescriptor)
	//*  93  212:aload_1         
	//*  94  213:instanceof      #265 <Class Descriptors$EnumDescriptor>
	//*  95  216:ifeq            229
					type = Type.ENUM;
	//   96  219:aload_0         
	//   97  220:getstatic       #268 <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.ENUM>
	//   98  223:putfield        #117 <Field Descriptors$FieldDescriptor$Type type>
				else
	//*  99  226:goto            270
					throw new tionException(((r) (this)), (new StringBuilder()).append('"').append(proto.getTypeName()).append("\" is not a type.").toString(), ((Descriptors._cls1) (null)));
	//  100  229:new             #71  <Class Descriptors$DescriptorValidationException>
	//  101  232:dup             
	//  102  233:aload_0         
	//  103  234:new             #160 <Class StringBuilder>
	//  104  237:dup             
	//  105  238:invokespecial   #161 <Method void StringBuilder()>
	//  106  241:bipush          34
	//  107  243:invokevirtual   #234 <Method StringBuilder StringBuilder.append(char)>
	//  108  246:aload_0         
	//  109  247:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//  110  250:invokevirtual   #260 <Method String DescriptorProtos$FieldDescriptorProto.getTypeName()>
	//  111  253:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  112  256:ldc2            #270 <String "\" is not a type.">
	//  113  259:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  114  262:invokevirtual   #171 <Method String StringBuilder.toString()>
	//  115  265:aconst_null     
	//  116  266:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
	//  117  269:athrow          
			if(getJavaType() == JavaType.MESSAGE)
	//* 118  270:aload_0         
	//* 119  271:invokevirtual   #274 <Method Descriptors$FieldDescriptor$JavaType getJavaType()>
	//* 120  274:getstatic       #277 <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.MESSAGE>
	//* 121  277:if_acmpne       358
			{
				if(!(r1 instanceof Descriptors.Descriptor))
	//* 122  280:aload_1         
	//* 123  281:instanceof      #149 <Class Descriptors$Descriptor>
	//* 124  284:ifne            327
					throw new tionException(((r) (this)), (new StringBuilder()).append('"').append(proto.getTypeName()).append("\" is not a message type.").toString(), ((Descriptors._cls1) (null)));
	//  125  287:new             #71  <Class Descriptors$DescriptorValidationException>
	//  126  290:dup             
	//  127  291:aload_0         
	//  128  292:new             #160 <Class StringBuilder>
	//  129  295:dup             
	//  130  296:invokespecial   #161 <Method void StringBuilder()>
	//  131  299:bipush          34
	//  132  301:invokevirtual   #234 <Method StringBuilder StringBuilder.append(char)>
	//  133  304:aload_0         
	//  134  305:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//  135  308:invokevirtual   #260 <Method String DescriptorProtos$FieldDescriptorProto.getTypeName()>
	//  136  311:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  137  314:ldc1            #236 <String "\" is not a message type.">
	//  138  316:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  139  319:invokevirtual   #171 <Method String StringBuilder.toString()>
	//  140  322:aconst_null     
	//  141  323:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
	//  142  326:athrow          
				messageType = (Descriptors.Descriptor)r1;
	//  143  327:aload_0         
	//  144  328:aload_1         
	//  145  329:checkcast       #149 <Class Descriptors$Descriptor>
	//  146  332:putfield        #279 <Field Descriptors$Descriptor messageType>
				if(proto.hasDefaultValue())
	//* 147  335:aload_0         
	//* 148  336:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//* 149  339:invokevirtual   #282 <Method boolean DescriptorProtos$FieldDescriptorProto.hasDefaultValue()>
	//* 150  342:ifeq            440
					throw new tionException(((r) (this)), "Messages can't have default values.", ((Descriptors._cls1) (null)));
	//  151  345:new             #71  <Class Descriptors$DescriptorValidationException>
	//  152  348:dup             
	//  153  349:aload_0         
	//  154  350:ldc2            #284 <String "Messages can't have default values.">
	//  155  353:aconst_null     
	//  156  354:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
	//  157  357:athrow          
			} else
			if(getJavaType() == JavaType.ENUM)
	//* 158  358:aload_0         
	//* 159  359:invokevirtual   #274 <Method Descriptors$FieldDescriptor$JavaType getJavaType()>
	//* 160  362:getstatic       #286 <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.ENUM>
	//* 161  365:if_acmpne       427
			{
				if(!(r1 instanceof Descriptors.EnumDescriptor))
	//* 162  368:aload_1         
	//* 163  369:instanceof      #265 <Class Descriptors$EnumDescriptor>
	//* 164  372:ifne            416
					throw new tionException(((r) (this)), (new StringBuilder()).append('"').append(proto.getTypeName()).append("\" is not an enum type.").toString(), ((Descriptors._cls1) (null)));
	//  165  375:new             #71  <Class Descriptors$DescriptorValidationException>
	//  166  378:dup             
	//  167  379:aload_0         
	//  168  380:new             #160 <Class StringBuilder>
	//  169  383:dup             
	//  170  384:invokespecial   #161 <Method void StringBuilder()>
	//  171  387:bipush          34
	//  172  389:invokevirtual   #234 <Method StringBuilder StringBuilder.append(char)>
	//  173  392:aload_0         
	//  174  393:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//  175  396:invokevirtual   #260 <Method String DescriptorProtos$FieldDescriptorProto.getTypeName()>
	//  176  399:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  177  402:ldc2            #288 <String "\" is not an enum type.">
	//  178  405:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  179  408:invokevirtual   #171 <Method String StringBuilder.toString()>
	//  180  411:aconst_null     
	//  181  412:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
	//  182  415:athrow          
				enumType = (Descriptors.EnumDescriptor)r1;
	//  183  416:aload_0         
	//  184  417:aload_1         
	//  185  418:checkcast       #265 <Class Descriptors$EnumDescriptor>
	//  186  421:putfield        #290 <Field Descriptors$EnumDescriptor enumType>
			} else
	//* 187  424:goto            440
			{
				throw new tionException(((r) (this)), "Field with primitive type has type_name.", ((Descriptors._cls1) (null)));
	//  188  427:new             #71  <Class Descriptors$DescriptorValidationException>
	//  189  430:dup             
	//  190  431:aload_0         
	//  191  432:ldc2            #292 <String "Field with primitive type has type_name.">
	//  192  435:aconst_null     
	//  193  436:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
	//  194  439:athrow          
			}
		} else
	//* 195  440:goto            476
		if(getJavaType() == JavaType.MESSAGE || getJavaType() == JavaType.ENUM)
	//* 196  443:aload_0         
	//* 197  444:invokevirtual   #274 <Method Descriptors$FieldDescriptor$JavaType getJavaType()>
	//* 198  447:getstatic       #277 <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.MESSAGE>
	//* 199  450:if_acmpeq       463
	//* 200  453:aload_0         
	//* 201  454:invokevirtual   #274 <Method Descriptors$FieldDescriptor$JavaType getJavaType()>
	//* 202  457:getstatic       #286 <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.ENUM>
	//* 203  460:if_acmpne       476
			throw new tionException(((r) (this)), "Field with message or enum type missing type_name.", ((Descriptors._cls1) (null)));
	//  204  463:new             #71  <Class Descriptors$DescriptorValidationException>
	//  205  466:dup             
	//  206  467:aload_0         
	//  207  468:ldc2            #294 <String "Field with message or enum type missing type_name.">
	//  208  471:aconst_null     
	//  209  472:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
	//  210  475:athrow          
		if(proto.getOptions().getPacked() && !isPackable())
	//* 211  476:aload_0         
	//* 212  477:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//* 213  480:invokevirtual   #298 <Method DescriptorProtos$FieldOptions DescriptorProtos$FieldDescriptorProto.getOptions()>
	//* 214  483:invokevirtual   #303 <Method boolean DescriptorProtos$FieldOptions.getPacked()>
	//* 215  486:ifeq            509
	//* 216  489:aload_0         
	//* 217  490:invokevirtual   #306 <Method boolean isPackable()>
	//* 218  493:ifne            509
			throw new tionException(((r) (this)), "[packed = true] can only be specified for repeated primitive fields.", ((Descriptors._cls1) (null)));
	//  219  496:new             #71  <Class Descriptors$DescriptorValidationException>
	//  220  499:dup             
	//  221  500:aload_0         
	//  222  501:ldc2            #308 <String "[packed = true] can only be specified for repeated primitive fields.">
	//  223  504:aconst_null     
	//  224  505:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
	//  225  508:athrow          
		if(!proto.hasDefaultValue()) goto _L2; else goto _L1
	//  226  509:aload_0         
	//  227  510:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//  228  513:invokevirtual   #282 <Method boolean DescriptorProtos$FieldDescriptorProto.hasDefaultValue()>
	//  229  516:ifeq            1132
_L1:
		if(isRepeated())
	//* 230  519:aload_0         
	//* 231  520:invokevirtual   #311 <Method boolean isRepeated()>
	//* 232  523:ifeq            539
			throw new tionException(((r) (this)), "Repeated fields cannot have default values.", ((Descriptors._cls1) (null)));
	//  233  526:new             #71  <Class Descriptors$DescriptorValidationException>
	//  234  529:dup             
	//  235  530:aload_0         
	//  236  531:ldc2            #313 <String "Repeated fields cannot have default values.">
	//  237  534:aconst_null     
	//  238  535:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
	//  239  538:athrow          
		Descriptors._cls1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[getType().ordinal()];
	//  240  539:getstatic       #319 <Field int[] Descriptors$1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
	//  241  542:aload_0         
	//  242  543:invokevirtual   #322 <Method Descriptors$FieldDescriptor$Type getType()>
	//  243  546:invokevirtual   #325 <Method int Descriptors$FieldDescriptor$Type.ordinal()>
	//  244  549:iaload          
		JVM INSTR tableswitch 1 18: default 1319
	//	               1 636
	//	               2 636
	//	               3 636
	//	               4 656
	//	               5 656
	//	               6 676
	//	               7 676
	//	               8 676
	//	               9 696
	//	               10 696
	//	               11 716
	//	               12 820
	//	               13 924
	//	               14 941
	//	               15 955
	//	               16 1007
	//	               17 1073
	//	               18 1073;
	//  245  550:tableswitch     1 18: default 1319
	//	               1 636
	//	               2 636
	//	               3 636
	//	               4 656
	//	               5 656
	//	               6 676
	//	               7 676
	//	               8 676
	//	               9 696
	//	               10 696
	//	               11 716
	//	               12 820
	//	               13 924
	//	               14 941
	//	               15 955
	//	               16 1007
	//	               17 1073
	//	               18 1073
		   goto _L3 _L4 _L4 _L4 _L5 _L5 _L6 _L6 _L6 _L7 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L14
_L3:
		break; /* Loop/switch isn't completed */
_L4:
		defaultValue = ((Object) (Integer.valueOf(TextFormat.parseInt32(proto.getDefaultValue()))));
	//  246  636:aload_0         
	//  247  637:aload_0         
	//  248  638:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//  249  641:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
	//  250  644:invokestatic    #334 <Method int TextFormat.parseInt32(String)>
	//  251  647:invokestatic    #339 <Method Integer Integer.valueOf(int)>
	//  252  650:putfield        #341 <Field Object defaultValue>
		break; /* Loop/switch isn't completed */
	//  253  653:goto            1086
_L5:
		enceException enceexception;
		try
		{
			defaultValue = ((Object) (Integer.valueOf(TextFormat.parseUInt32(proto.getDefaultValue()))));
	//  254  656:aload_0         
	//  255  657:aload_0         
	//  256  658:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//  257  661:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
	//  258  664:invokestatic    #344 <Method int TextFormat.parseUInt32(String)>
	//  259  667:invokestatic    #339 <Method Integer Integer.valueOf(int)>
	//  260  670:putfield        #341 <Field Object defaultValue>
		}
	//* 261  673:goto            1086
	//* 262  676:aload_0         
	//* 263  677:aload_0         
	//* 264  678:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//* 265  681:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
	//* 266  684:invokestatic    #348 <Method long TextFormat.parseInt64(String)>
	//* 267  687:invokestatic    #353 <Method Long Long.valueOf(long)>
	//* 268  690:putfield        #341 <Field Object defaultValue>
	//* 269  693:goto            1086
	//* 270  696:aload_0         
	//* 271  697:aload_0         
	//* 272  698:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//* 273  701:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
	//* 274  704:invokestatic    #356 <Method long TextFormat.parseUInt64(String)>
	//* 275  707:invokestatic    #353 <Method Long Long.valueOf(long)>
	//* 276  710:putfield        #341 <Field Object defaultValue>
	//* 277  713:goto            1086
	//* 278  716:aload_0         
	//* 279  717:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//* 280  720:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
	//* 281  723:ldc2            #358 <String "inf">
	//* 282  726:invokevirtual   #364 <Method boolean String.equals(Object)>
	//* 283  729:ifeq            745
	//* 284  732:aload_0         
	//* 285  733:ldc2            #365 <Float (1.0F / 0.0F)>
	//* 286  736:invokestatic    #370 <Method Float Float.valueOf(float)>
	//* 287  739:putfield        #341 <Field Object defaultValue>
	//* 288  742:goto            1086
	//* 289  745:aload_0         
	//* 290  746:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//* 291  749:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
	//* 292  752:ldc2            #372 <String "-inf">
	//* 293  755:invokevirtual   #364 <Method boolean String.equals(Object)>
	//* 294  758:ifeq            774
	//* 295  761:aload_0         
	//* 296  762:ldc2            #373 <Float (-1.0F / 0.0F)>
	//* 297  765:invokestatic    #370 <Method Float Float.valueOf(float)>
	//* 298  768:putfield        #341 <Field Object defaultValue>
	//* 299  771:goto            1086
	//* 300  774:aload_0         
	//* 301  775:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//* 302  778:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
	//* 303  781:ldc2            #375 <String "nan">
	//* 304  784:invokevirtual   #364 <Method boolean String.equals(Object)>
	//* 305  787:ifeq            803
	//* 306  790:aload_0         
	//* 307  791:ldc2            #376 <Float (0.0F / 0.0F)>
	//* 308  794:invokestatic    #370 <Method Float Float.valueOf(float)>
	//* 309  797:putfield        #341 <Field Object defaultValue>
	//* 310  800:goto            1086
	//* 311  803:aload_0         
	//* 312  804:aload_0         
	//* 313  805:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//* 314  808:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
	//* 315  811:invokestatic    #379 <Method Float Float.valueOf(String)>
	//* 316  814:putfield        #341 <Field Object defaultValue>
	//* 317  817:goto            1086
	//* 318  820:aload_0         
	//* 319  821:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//* 320  824:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
	//* 321  827:ldc2            #358 <String "inf">
	//* 322  830:invokevirtual   #364 <Method boolean String.equals(Object)>
	//* 323  833:ifeq            849
	//* 324  836:aload_0         
	//* 325  837:ldc2w           #380 <Double (1.0D / 0.0D)>
	//* 326  840:invokestatic    #386 <Method Double Double.valueOf(double)>
	//* 327  843:putfield        #341 <Field Object defaultValue>
	//* 328  846:goto            1086
	//* 329  849:aload_0         
	//* 330  850:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//* 331  853:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
	//* 332  856:ldc2            #372 <String "-inf">
	//* 333  859:invokevirtual   #364 <Method boolean String.equals(Object)>
	//* 334  862:ifeq            878
	//* 335  865:aload_0         
	//* 336  866:ldc2w           #387 <Double (-1.0D / 0.0D)>
	//* 337  869:invokestatic    #386 <Method Double Double.valueOf(double)>
	//* 338  872:putfield        #341 <Field Object defaultValue>
	//* 339  875:goto            1086
	//* 340  878:aload_0         
	//* 341  879:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//* 342  882:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
	//* 343  885:ldc2            #375 <String "nan">
	//* 344  888:invokevirtual   #364 <Method boolean String.equals(Object)>
	//* 345  891:ifeq            907
	//* 346  894:aload_0         
	//* 347  895:ldc2w           #389 <Double (0.0D / 0.0D)>
	//* 348  898:invokestatic    #386 <Method Double Double.valueOf(double)>
	//* 349  901:putfield        #341 <Field Object defaultValue>
	//* 350  904:goto            1086
	//* 351  907:aload_0         
	//* 352  908:aload_0         
	//* 353  909:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//* 354  912:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
	//* 355  915:invokestatic    #393 <Method Double Double.valueOf(String)>
	//* 356  918:putfield        #341 <Field Object defaultValue>
	//* 357  921:goto            1086
	//* 358  924:aload_0         
	//* 359  925:aload_0         
	//* 360  926:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//* 361  929:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
	//* 362  932:invokestatic    #398 <Method Boolean Boolean.valueOf(String)>
	//* 363  935:putfield        #341 <Field Object defaultValue>
	//* 364  938:goto            1086
	//* 365  941:aload_0         
	//* 366  942:aload_0         
	//* 367  943:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//* 368  946:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
	//* 369  949:putfield        #341 <Field Object defaultValue>
	//* 370  952:goto            1086
	//* 371  955:aload_0         
	//* 372  956:aload_0         
	//* 373  957:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//* 374  960:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
	//* 375  963:invokestatic    #402 <Method ByteString TextFormat.unescapeBytes(CharSequence)>
	//* 376  966:putfield        #341 <Field Object defaultValue>
	//* 377  969:goto            1086
	//* 378  972:astore_1        
	//* 379  973:new             #71  <Class Descriptors$DescriptorValidationException>
	//* 380  976:dup             
	//* 381  977:aload_0         
	//* 382  978:new             #160 <Class StringBuilder>
	//* 383  981:dup             
	//* 384  982:invokespecial   #161 <Method void StringBuilder()>
	//* 385  985:ldc2            #404 <String "Couldn't parse default value: ">
	//* 386  988:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//* 387  991:aload_1         
	//* 388  992:invokevirtual   #407 <Method String TextFormat$InvalidEscapeSequenceException.getMessage()>
	//* 389  995:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//* 390  998:invokevirtual   #171 <Method String StringBuilder.toString()>
	//* 391 1001:aload_1         
	//* 392 1002:aconst_null     
	//* 393 1003:invokespecial   #410 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Throwable, Descriptors$1)>
	//* 394 1006:athrow          
	//* 395 1007:aload_0         
	//* 396 1008:aload_0         
	//* 397 1009:getfield        #290 <Field Descriptors$EnumDescriptor enumType>
	//* 398 1012:aload_0         
	//* 399 1013:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//* 400 1016:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
	//* 401 1019:invokevirtual   #414 <Method Descriptors$EnumValueDescriptor Descriptors$EnumDescriptor.findValueByName(String)>
	//* 402 1022:putfield        #341 <Field Object defaultValue>
	//* 403 1025:aload_0         
	//* 404 1026:getfield        #341 <Field Object defaultValue>
	//* 405 1029:ifnonnull       1086
	//* 406 1032:new             #71  <Class Descriptors$DescriptorValidationException>
	//* 407 1035:dup             
	//* 408 1036:aload_0         
	//* 409 1037:new             #160 <Class StringBuilder>
	//* 410 1040:dup             
	//* 411 1041:invokespecial   #161 <Method void StringBuilder()>
	//* 412 1044:ldc2            #416 <String "Unknown enum default value: \"">
	//* 413 1047:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//* 414 1050:aload_0         
	//* 415 1051:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//* 416 1054:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
	//* 417 1057:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//* 418 1060:bipush          34
	//* 419 1062:invokevirtual   #234 <Method StringBuilder StringBuilder.append(char)>
	//* 420 1065:invokevirtual   #171 <Method String StringBuilder.toString()>
	//* 421 1068:aconst_null     
	//* 422 1069:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
	//* 423 1072:athrow          
	//* 424 1073:new             #71  <Class Descriptors$DescriptorValidationException>
	//* 425 1076:dup             
	//* 426 1077:aload_0         
	//* 427 1078:ldc2            #418 <String "Message type had default value.">
	//* 428 1081:aconst_null     
	//* 429 1082:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
	//* 430 1085:athrow          
	//* 431 1086:goto            1230
		catch(NumberFormatException numberformatexception)
	//* 432 1089:astore_1        
		{
			throw new tionException(((r) (this)), (new StringBuilder()).append("Could not parse default value: \"").append(proto.getDefaultValue()).append('"').toString(), ((Throwable) (numberformatexception)), ((Descriptors._cls1) (null)));
	//  433 1090:new             #71  <Class Descriptors$DescriptorValidationException>
	//  434 1093:dup             
	//  435 1094:aload_0         
	//  436 1095:new             #160 <Class StringBuilder>
	//  437 1098:dup             
	//  438 1099:invokespecial   #161 <Method void StringBuilder()>
	//  439 1102:ldc2            #420 <String "Could not parse default value: \"">
	//  440 1105:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  441 1108:aload_0         
	//  442 1109:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//  443 1112:invokevirtual   #328 <Method String DescriptorProtos$FieldDescriptorProto.getDefaultValue()>
	//  444 1115:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  445 1118:bipush          34
	//  446 1120:invokevirtual   #234 <Method StringBuilder StringBuilder.append(char)>
	//  447 1123:invokevirtual   #171 <Method String StringBuilder.toString()>
	//  448 1126:aload_1         
	//  449 1127:aconst_null     
	//  450 1128:invokespecial   #410 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Throwable, Descriptors$1)>
	//  451 1131:athrow          
		}
		break; /* Loop/switch isn't completed */
_L6:
		defaultValue = ((Object) (Long.valueOf(TextFormat.parseInt64(proto.getDefaultValue()))));
		break; /* Loop/switch isn't completed */
_L7:
		defaultValue = ((Object) (Long.valueOf(TextFormat.parseUInt64(proto.getDefaultValue()))));
		break; /* Loop/switch isn't completed */
_L8:
		if(proto.getDefaultValue().equals("inf"))
		{
			defaultValue = ((Object) (Float.valueOf((1.0F / 0.0F))));
			break; /* Loop/switch isn't completed */
		}
		if(proto.getDefaultValue().equals("-inf"))
		{
			defaultValue = ((Object) (Float.valueOf((-1.0F / 0.0F))));
			break; /* Loop/switch isn't completed */
		}
		if(proto.getDefaultValue().equals("nan"))
		{
			defaultValue = ((Object) (Float.valueOf((0.0F / 0.0F))));
			break; /* Loop/switch isn't completed */
		}
		defaultValue = ((Object) (Float.valueOf(proto.getDefaultValue())));
		break; /* Loop/switch isn't completed */
_L9:
		if(proto.getDefaultValue().equals("inf"))
		{
			defaultValue = ((Object) (Double.valueOf((1.0D / 0.0D))));
			break; /* Loop/switch isn't completed */
		}
		if(proto.getDefaultValue().equals("-inf"))
		{
			defaultValue = ((Object) (Double.valueOf((-1.0D / 0.0D))));
			break; /* Loop/switch isn't completed */
		}
		if(proto.getDefaultValue().equals("nan"))
		{
			defaultValue = ((Object) (Double.valueOf((0.0D / 0.0D))));
			break; /* Loop/switch isn't completed */
		}
		defaultValue = ((Object) (Double.valueOf(proto.getDefaultValue())));
		break; /* Loop/switch isn't completed */
_L10:
		defaultValue = ((Object) (Boolean.valueOf(proto.getDefaultValue())));
		break; /* Loop/switch isn't completed */
_L11:
		defaultValue = ((Object) (proto.getDefaultValue()));
		break; /* Loop/switch isn't completed */
_L12:
		defaultValue = ((Object) (TextFormat.unescapeBytes(((CharSequence) (proto.getDefaultValue())))));
		break; /* Loop/switch isn't completed */
		enceexception;
		throw new tionException(((r) (this)), (new StringBuilder()).append("Couldn't parse default value: ").append(enceexception.getMessage()).toString(), ((Throwable) (enceexception)), ((Descriptors._cls1) (null)));
_L13:
		defaultValue = ((Object) (enumType.findValueByName(proto.getDefaultValue())));
		if(defaultValue == null)
			throw new tionException(((r) (this)), (new StringBuilder()).append("Unknown enum default value: \"").append(proto.getDefaultValue()).append('"').toString(), ((Descriptors._cls1) (null)));
		break; /* Loop/switch isn't completed */
_L14:
		throw new tionException(((r) (this)), "Message type had default value.", ((Descriptors._cls1) (null)));
_L2:
		if(isRepeated())
	//* 452 1132:aload_0         
	//* 453 1133:invokevirtual   #311 <Method boolean isRepeated()>
	//* 454 1136:ifeq            1149
			defaultValue = ((Object) (Collections.emptyList()));
	//  455 1139:aload_0         
	//  456 1140:invokestatic    #425 <Method List Collections.emptyList()>
	//  457 1143:putfield        #341 <Field Object defaultValue>
		else
	//* 458 1146:goto            1230
			switch(Descriptors._cls1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType[getJavaType().ordinal()])
	//* 459 1149:getstatic       #428 <Field int[] Descriptors$1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType>
	//* 460 1152:aload_0         
	//* 461 1153:invokevirtual   #274 <Method Descriptors$FieldDescriptor$JavaType getJavaType()>
	//* 462 1156:invokevirtual   #429 <Method int Descriptors$FieldDescriptor$JavaType.ordinal()>
	//* 463 1159:iaload          
			{
	//* 464 1160:lookupswitch    2: default 1188
	//	               1: 1191
	//	               2: 1211
	//* 465 1188:goto            1219
			case 1: // '\001'
				defaultValue = enumType.getValues().get(0);
	//  466 1191:aload_0         
	//  467 1192:aload_0         
	//  468 1193:getfield        #290 <Field Descriptors$EnumDescriptor enumType>
	//  469 1196:invokevirtual   #432 <Method List Descriptors$EnumDescriptor.getValues()>
	//  470 1199:iconst_0        
	//  471 1200:invokeinterface #181 <Method Object List.get(int)>
	//  472 1205:putfield        #341 <Field Object defaultValue>
				break;

	//* 473 1208:goto            1230
			case 2: // '\002'
				defaultValue = null;
	//  474 1211:aload_0         
	//  475 1212:aconst_null     
	//  476 1213:putfield        #341 <Field Object defaultValue>
				break;

	//* 477 1216:goto            1230
			default:
				defaultValue = getJavaType().defaultDefault;
	//  478 1219:aload_0         
	//  479 1220:aload_0         
	//  480 1221:invokevirtual   #274 <Method Descriptors$FieldDescriptor$JavaType getJavaType()>
	//  481 1224:invokestatic    #436 <Method Object Descriptors$FieldDescriptor$JavaType.access$2300(Descriptors$FieldDescriptor$JavaType)>
	//  482 1227:putfield        #341 <Field Object defaultValue>
				break;
			}
		if(!isExtension())
	//* 483 1230:aload_0         
	//* 484 1231:invokevirtual   #439 <Method boolean isExtension()>
	//* 485 1234:ifne            1248
			Descriptors.FileDescriptor.access$1400(file).addFieldByNumber(this);
	//  486 1237:aload_0         
	//  487 1238:getfield        #91  <Field Descriptors$FileDescriptor file>
	//  488 1241:invokestatic    #193 <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
	//  489 1244:aload_0         
	//  490 1245:invokevirtual   #442 <Method void Descriptors$DescriptorPool.addFieldByNumber(Descriptors$FieldDescriptor)>
		if(containingType != null && containingType.getOptions().getMessageSetWireFormat())
	//* 491 1248:aload_0         
	//* 492 1249:getfield        #133 <Field Descriptors$Descriptor containingType>
	//* 493 1252:ifnull          1318
	//* 494 1255:aload_0         
	//* 495 1256:getfield        #133 <Field Descriptors$Descriptor containingType>
	//* 496 1259:invokevirtual   #445 <Method DescriptorProtos$MessageOptions Descriptors$Descriptor.getOptions()>
	//* 497 1262:invokevirtual   #450 <Method boolean DescriptorProtos$MessageOptions.getMessageSetWireFormat()>
	//* 498 1265:ifeq            1318
			if(isExtension())
	//* 499 1268:aload_0         
	//* 500 1269:invokevirtual   #439 <Method boolean isExtension()>
	//* 501 1272:ifeq            1305
			{
				if(!isOptional() || getType() != Type.MESSAGE)
	//* 502 1275:aload_0         
	//* 503 1276:invokevirtual   #453 <Method boolean isOptional()>
	//* 504 1279:ifeq            1292
	//* 505 1282:aload_0         
	//* 506 1283:invokevirtual   #322 <Method Descriptors$FieldDescriptor$Type getType()>
	//* 507 1286:getstatic       #263 <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.MESSAGE>
	//* 508 1289:if_acmpeq       1318
					throw new tionException(((r) (this)), "Extensions of MessageSets must be optional messages.", ((Descriptors._cls1) (null)));
	//  509 1292:new             #71  <Class Descriptors$DescriptorValidationException>
	//  510 1295:dup             
	//  511 1296:aload_0         
	//  512 1297:ldc2            #455 <String "Extensions of MessageSets must be optional messages.">
	//  513 1300:aconst_null     
	//  514 1301:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
	//  515 1304:athrow          
			} else
			{
				throw new tionException(((r) (this)), "MessageSets cannot have fields, only extensions.", ((Descriptors._cls1) (null)));
	//  516 1305:new             #71  <Class Descriptors$DescriptorValidationException>
	//  517 1308:dup             
	//  518 1309:aload_0         
	//  519 1310:ldc2            #457 <String "MessageSets cannot have fields, only extensions.">
	//  520 1313:aconst_null     
	//  521 1314:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
	//  522 1317:athrow          
			}
		return;
	//  523 1318:return          
	//* 524 1319:goto            1086
	}

	private static String fieldNameToJsonName(String s)
	{
		StringBuilder stringbuilder = new StringBuilder(s.length());
	//    0    0:new             #160 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #460 <Method int String.length()>
	//    4    8:invokespecial   #463 <Method void StringBuilder(int)>
	//    5   11:astore_3        
		boolean flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_1        
		for(int i = 0; i < s.length(); i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_2        
	//*  10   16:iload_2         
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #460 <Method int String.length()>
	//*  13   21:icmpge          85
		{
			Character character = Character.valueOf(s.charAt(i));
	//   14   24:aload_0         
	//   15   25:iload_2         
	//   16   26:invokevirtual   #467 <Method char String.charAt(int)>
	//   17   29:invokestatic    #472 <Method Character Character.valueOf(char)>
	//   18   32:astore          4
			if(character.charValue() == '_')
	//*  19   34:aload           4
	//*  20   36:invokevirtual   #476 <Method char Character.charValue()>
	//*  21   39:bipush          95
	//*  22   41:icmpne          49
			{
				flag = true;
	//   23   44:iconst_1        
	//   24   45:istore_1        
				continue;
	//   25   46:goto            78
			}
			if(flag)
	//*  26   49:iload_1         
	//*  27   50:ifeq            71
			{
				stringbuilder.append(Character.toUpperCase(character.charValue()));
	//   28   53:aload_3         
	//   29   54:aload           4
	//   30   56:invokevirtual   #476 <Method char Character.charValue()>
	//   31   59:invokestatic    #480 <Method char Character.toUpperCase(char)>
	//   32   62:invokevirtual   #234 <Method StringBuilder StringBuilder.append(char)>
	//   33   65:pop             
				flag = false;
	//   34   66:iconst_0        
	//   35   67:istore_1        
			} else
	//*  36   68:goto            78
			{
				stringbuilder.append(((Object) (character)));
	//   37   71:aload_3         
	//   38   72:aload           4
	//   39   74:invokevirtual   #483 <Method StringBuilder StringBuilder.append(Object)>
	//   40   77:pop             
			}
		}

	//   41   78:iload_2         
	//   42   79:iconst_1        
	//   43   80:iadd            
	//   44   81:istore_2        
	//*  45   82:goto            16
		return stringbuilder.toString();
	//   46   85:aload_3         
	//   47   86:invokevirtual   #171 <Method String StringBuilder.toString()>
	//   48   89:areturn         
	}

	private void setProto(ptorProto ptorproto)
	{
		proto = ptorproto;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//    3    5:return          
	}

	public int compareTo(Descriptors$FieldDescriptor descriptors$fielddescriptor)
	{
		if(descriptors$fielddescriptor.containingType != containingType)
	//*   0    0:aload_1         
	//*   1    1:getfield        #133 <Field Descriptors$Descriptor containingType>
	//*   2    4:aload_0         
	//*   3    5:getfield        #133 <Field Descriptors$Descriptor containingType>
	//*   4    8:if_acmpeq       22
			throw new IllegalArgumentException("FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.");
	//    5   11:new             #487 <Class IllegalArgumentException>
	//    6   14:dup             
	//    7   15:ldc2            #489 <String "FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.">
	//    8   18:invokespecial   #490 <Method void IllegalArgumentException(String)>
	//    9   21:athrow          
		else
			return getNumber() - descriptors$fielddescriptor.getNumber();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #121 <Method int getNumber()>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #121 <Method int getNumber()>
	//   14   30:isub            
	//   15   31:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((Descriptors$FieldDescriptor)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class Descriptors$FieldDescriptor>
	//    3    5:invokevirtual   #493 <Method int compareTo(Descriptors$FieldDescriptor)>
	//    4    8:ireturn         
	}

	public Descriptors$OneofDescriptor getContainingOneof()
	{
		return containingOneof;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field Descriptors$OneofDescriptor containingOneof>
	//    2    4:areturn         
	}

	public Descriptors.Descriptor getContainingType()
	{
		return containingType;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field Descriptors$Descriptor containingType>
	//    2    4:areturn         
	}

	public Object getDefaultValue()
	{
		if(getJavaType() == JavaType.MESSAGE)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #274 <Method Descriptors$FieldDescriptor$JavaType getJavaType()>
	//*   2    4:getstatic       #277 <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.MESSAGE>
	//*   3    7:if_acmpne       21
			throw new UnsupportedOperationException("FieldDescriptor.getDefaultValue() called on an embedded message field.");
	//    4   10:new             #498 <Class UnsupportedOperationException>
	//    5   13:dup             
	//    6   14:ldc2            #500 <String "FieldDescriptor.getDefaultValue() called on an embedded message field.">
	//    7   17:invokespecial   #501 <Method void UnsupportedOperationException(String)>
	//    8   20:athrow          
		else
			return defaultValue;
	//    9   21:aload_0         
	//   10   22:getfield        #341 <Field Object defaultValue>
	//   11   25:areturn         
	}

	public Descriptors.EnumDescriptor getEnumType()
	{
		if(getJavaType() != JavaType.ENUM)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #274 <Method Descriptors$FieldDescriptor$JavaType getJavaType()>
	//*   2    4:getstatic       #286 <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.ENUM>
	//*   3    7:if_acmpeq       21
			throw new UnsupportedOperationException("This field is not of enum type.");
	//    4   10:new             #498 <Class UnsupportedOperationException>
	//    5   13:dup             
	//    6   14:ldc2            #505 <String "This field is not of enum type.">
	//    7   17:invokespecial   #501 <Method void UnsupportedOperationException(String)>
	//    8   20:athrow          
		else
			return enumType;
	//    9   21:aload_0         
	//   10   22:getfield        #290 <Field Descriptors$EnumDescriptor enumType>
	//   11   25:areturn         
	}

	public volatile Internal.EnumLiteMap getEnumType()
	{
		return ((Internal.EnumLiteMap) (getEnumType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #508 <Method Descriptors$EnumDescriptor getEnumType()>
	//    2    4:areturn         
	}

	public Descriptors.Descriptor getExtensionScope()
	{
		if(!isExtension())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #439 <Method boolean isExtension()>
	//*   2    4:ifne            18
			throw new UnsupportedOperationException("This field is not an extension.");
	//    3    7:new             #498 <Class UnsupportedOperationException>
	//    4   10:dup             
	//    5   11:ldc2            #511 <String "This field is not an extension.">
	//    6   14:invokespecial   #501 <Method void UnsupportedOperationException(String)>
	//    7   17:athrow          
		else
			return extensionScope;
	//    8   18:aload_0         
	//    9   19:getfield        #135 <Field Descriptors$Descriptor extensionScope>
	//   10   22:areturn         
	}

	public Descriptors.FileDescriptor getFile()
	{
		return file;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field Descriptors$FileDescriptor file>
	//    2    4:areturn         
	}

	public String getFullName()
	{
		return fullName;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field String fullName>
	//    2    4:areturn         
	}

	public int getIndex()
	{
		return index;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field int index>
	//    2    4:ireturn         
	}

	public JavaType getJavaType()
	{
		return type.getJavaType();
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field Descriptors$FieldDescriptor$Type type>
	//    2    4:invokevirtual   #515 <Method Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$Type.getJavaType()>
	//    3    7:areturn         
	}

	public String getJsonName()
	{
		return jsonName;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field String jsonName>
	//    2    4:areturn         
	}

	public WireFormat.JavaType getLiteJavaType()
	{
		return getLiteType().getJavaType();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #521 <Method WireFormat$FieldType getLiteType()>
	//    2    4:invokevirtual   #523 <Method WireFormat$JavaType WireFormat$FieldType.getJavaType()>
	//    3    7:areturn         
	}

	public WireFormat.FieldType getLiteType()
	{
		return table[type.ordinal()];
	//    0    0:getstatic       #51  <Field WireFormat$FieldType[] table>
	//    1    3:aload_0         
	//    2    4:getfield        #117 <Field Descriptors$FieldDescriptor$Type type>
	//    3    7:invokevirtual   #325 <Method int Descriptors$FieldDescriptor$Type.ordinal()>
	//    4   10:aaload          
	//    5   11:areturn         
	}

	public Descriptors.Descriptor getMessageType()
	{
		if(getJavaType() != JavaType.MESSAGE)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #274 <Method Descriptors$FieldDescriptor$JavaType getJavaType()>
	//*   2    4:getstatic       #277 <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.MESSAGE>
	//*   3    7:if_acmpeq       21
			throw new UnsupportedOperationException("This field is not of message type.");
	//    4   10:new             #498 <Class UnsupportedOperationException>
	//    5   13:dup             
	//    6   14:ldc2            #526 <String "This field is not of message type.">
	//    7   17:invokespecial   #501 <Method void UnsupportedOperationException(String)>
	//    8   20:athrow          
		else
			return messageType;
	//    9   21:aload_0         
	//   10   22:getfield        #279 <Field Descriptors$Descriptor messageType>
	//   11   25:areturn         
	}

	public String getName()
	{
		return proto.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//    2    4:invokevirtual   #83  <Method String DescriptorProtos$FieldDescriptorProto.getName()>
	//    3    7:areturn         
	}

	public int getNumber()
	{
		return proto.getNumber();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//    2    4:invokevirtual   #527 <Method int DescriptorProtos$FieldDescriptorProto.getNumber()>
	//    3    7:ireturn         
	}

	public s getOptions()
	{
		return proto.getOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//    2    4:invokevirtual   #298 <Method DescriptorProtos$FieldOptions DescriptorProtos$FieldDescriptorProto.getOptions()>
	//    3    7:areturn         
	}

	public Type getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field Descriptors$FieldDescriptor$Type type>
	//    2    4:areturn         
	}

	public boolean hasDefaultValue()
	{
		return proto.hasDefaultValue();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//    2    4:invokevirtual   #282 <Method boolean DescriptorProtos$FieldDescriptorProto.hasDefaultValue()>
	//    3    7:ireturn         
	}

	public MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messagelite)
	{
		return ((MessageLite.Builder) (((Message.Builder)builder).mergeFrom((Message)messagelite)));
	//    0    0:aload_1         
	//    1    1:checkcast       #531 <Class Message$Builder>
	//    2    4:aload_2         
	//    3    5:checkcast       #533 <Class Message>
	//    4    8:invokeinterface #537 <Method Message$Builder Message$Builder.mergeFrom(Message)>
	//    5   13:areturn         
	}

	public boolean isExtension()
	{
		return proto.hasExtendee();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//    2    4:invokevirtual   #129 <Method boolean DescriptorProtos$FieldDescriptorProto.hasExtendee()>
	//    3    7:ireturn         
	}

	public boolean isMapField()
	{
		return getType() == Type.MESSAGE && isRepeated() && getMessageType().getOptions().getMapEntry();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #322 <Method Descriptors$FieldDescriptor$Type getType()>
	//    2    4:getstatic       #263 <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.MESSAGE>
	//    3    7:if_acmpne       32
	//    4   10:aload_0         
	//    5   11:invokevirtual   #311 <Method boolean isRepeated()>
	//    6   14:ifeq            32
	//    7   17:aload_0         
	//    8   18:invokevirtual   #540 <Method Descriptors$Descriptor getMessageType()>
	//    9   21:invokevirtual   #445 <Method DescriptorProtos$MessageOptions Descriptors$Descriptor.getOptions()>
	//   10   24:invokevirtual   #543 <Method boolean DescriptorProtos$MessageOptions.getMapEntry()>
	//   11   27:ifeq            32
	//   12   30:iconst_1        
	//   13   31:ireturn         
	//   14   32:iconst_0        
	//   15   33:ireturn         
	}

	public boolean isOptional()
	{
		return proto.getLabel() == ptorProto.Label.LABEL_OPTIONAL;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//    2    4:invokevirtual   #547 <Method DescriptorProtos$FieldDescriptorProto$Label DescriptorProtos$FieldDescriptorProto.getLabel()>
	//    3    7:getstatic       #553 <Field DescriptorProtos$FieldDescriptorProto$Label DescriptorProtos$FieldDescriptorProto$Label.LABEL_OPTIONAL>
	//    4   10:if_acmpne       15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public boolean isPackable()
	{
		return isRepeated() && getLiteType().isPackable();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #311 <Method boolean isRepeated()>
	//    2    4:ifeq            19
	//    3    7:aload_0         
	//    4    8:invokevirtual   #521 <Method WireFormat$FieldType getLiteType()>
	//    5   11:invokevirtual   #554 <Method boolean WireFormat$FieldType.isPackable()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean isPacked()
	{
		if(!isPackable())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #306 <Method boolean isPackable()>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(getFile().getSyntax() == yntax.PROTO2)
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #557 <Method Descriptors$FileDescriptor getFile()>
	//*   7   13:invokevirtual   #561 <Method Descriptors$FileDescriptor$Syntax Descriptors$FileDescriptor.getSyntax()>
	//*   8   16:getstatic       #567 <Field Descriptors$FileDescriptor$Syntax Descriptors$FileDescriptor$Syntax.PROTO2>
	//*   9   19:if_acmpne       30
			return getOptions().getPacked();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #568 <Method DescriptorProtos$FieldOptions getOptions()>
	//   12   26:invokevirtual   #303 <Method boolean DescriptorProtos$FieldOptions.getPacked()>
	//   13   29:ireturn         
		return !getOptions().hasPacked() || getOptions().getPacked();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #568 <Method DescriptorProtos$FieldOptions getOptions()>
	//   16   34:invokevirtual   #571 <Method boolean DescriptorProtos$FieldOptions.hasPacked()>
	//   17   37:ifeq            50
	//   18   40:aload_0         
	//   19   41:invokevirtual   #568 <Method DescriptorProtos$FieldOptions getOptions()>
	//   20   44:invokevirtual   #303 <Method boolean DescriptorProtos$FieldOptions.getPacked()>
	//   21   47:ifeq            52
	//   22   50:iconst_1        
	//   23   51:ireturn         
	//   24   52:iconst_0        
	//   25   53:ireturn         
	}

	public boolean isRepeated()
	{
		return proto.getLabel() == ptorProto.Label.LABEL_REPEATED;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//    2    4:invokevirtual   #547 <Method DescriptorProtos$FieldDescriptorProto$Label DescriptorProtos$FieldDescriptorProto.getLabel()>
	//    3    7:getstatic       #574 <Field DescriptorProtos$FieldDescriptorProto$Label DescriptorProtos$FieldDescriptorProto$Label.LABEL_REPEATED>
	//    4   10:if_acmpne       15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public boolean isRequired()
	{
		return proto.getLabel() == ptorProto.Label.LABEL_REQUIRED;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//    2    4:invokevirtual   #547 <Method DescriptorProtos$FieldDescriptorProto$Label DescriptorProtos$FieldDescriptorProto.getLabel()>
	//    3    7:getstatic       #578 <Field DescriptorProtos$FieldDescriptorProto$Label DescriptorProtos$FieldDescriptorProto$Label.LABEL_REQUIRED>
	//    4   10:if_acmpne       15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public boolean needsUtf8Check()
	{
		if(type != Type.STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field Descriptors$FieldDescriptor$Type type>
	//*   2    4:getstatic       #582 <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.STRING>
	//*   3    7:if_acmpeq       12
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
		if(getContainingType().getOptions().getMapEntry())
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #240 <Method Descriptors$Descriptor getContainingType()>
	//*   8   16:invokevirtual   #445 <Method DescriptorProtos$MessageOptions Descriptors$Descriptor.getOptions()>
	//*   9   19:invokevirtual   #543 <Method boolean DescriptorProtos$MessageOptions.getMapEntry()>
	//*  10   22:ifeq            27
			return true;
	//   11   25:iconst_1        
	//   12   26:ireturn         
		if(getFile().getSyntax() == yntax.PROTO3)
	//*  13   27:aload_0         
	//*  14   28:invokevirtual   #557 <Method Descriptors$FileDescriptor getFile()>
	//*  15   31:invokevirtual   #561 <Method Descriptors$FileDescriptor$Syntax Descriptors$FileDescriptor.getSyntax()>
	//*  16   34:getstatic       #585 <Field Descriptors$FileDescriptor$Syntax Descriptors$FileDescriptor$Syntax.PROTO3>
	//*  17   37:if_acmpne       42
			return true;
	//   18   40:iconst_1        
	//   19   41:ireturn         
		else
			return getFile().getOptions().getJavaStringCheckUtf8();
	//   20   42:aload_0         
	//   21   43:invokevirtual   #557 <Method Descriptors$FileDescriptor getFile()>
	//   22   46:invokevirtual   #588 <Method DescriptorProtos$FileOptions Descriptors$FileDescriptor.getOptions()>
	//   23   49:invokevirtual   #593 <Method boolean DescriptorProtos$FileOptions.getJavaStringCheckUtf8()>
	//   24   52:ireturn         
	}

	public ptorProto toProto()
	{
		return proto;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
	//    2    4:areturn         
	}

	public volatile Message toProto()
	{
		return ((Message) (toProto()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #597 <Method DescriptorProtos$FieldDescriptorProto toProto()>
	//    2    4:areturn         
	}

	public String toString()
	{
		return getFullName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #598 <Method String getFullName()>
	//    2    4:areturn         
	}

	private static final WireFormat.FieldType table[] = WireFormat.FieldType.values();
	private Descriptors$OneofDescriptor containingOneof;
	private Descriptors.Descriptor containingType;
	private Object defaultValue;
	private Descriptors.EnumDescriptor enumType;
	private final Descriptors.Descriptor extensionScope;
	private final Descriptors.FileDescriptor file;
	private final String fullName;
	private final int index;
	private final String jsonName;
	private Descriptors.Descriptor messageType;
	private ptorProto proto;
	private Type type;

	static 
	{
	//    0    0:invokestatic    #49  <Method WireFormat$FieldType[] WireFormat$FieldType.values()>
	//    1    3:putstatic       #51  <Field WireFormat$FieldType[] table>
		if(Type.values().length != ptorProto.Type.values().length)
	//*   2    6:invokestatic    #54  <Method Descriptors$FieldDescriptor$Type[] Descriptors$FieldDescriptor$Type.values()>
	//*   3    9:arraylength     
	//*   4   10:invokestatic    #59  <Method DescriptorProtos$FieldDescriptorProto$Type[] DescriptorProtos$FieldDescriptorProto$Type.values()>
	//*   5   13:arraylength     
	//*   6   14:icmpeq          27
			throw new RuntimeException("descriptor.proto has a new declared type but Descriptors.java wasn't updated.");
	//    7   17:new             #61  <Class RuntimeException>
	//    8   20:dup             
	//    9   21:ldc1            #63  <String "descriptor.proto has a new declared type but Descriptors.java wasn't updated.">
	//   10   23:invokespecial   #67  <Method void RuntimeException(String)>
	//   11   26:athrow          
	//   12   27:return          
	}


/*
	static void access$1300(Descriptors$FieldDescriptor descriptors$fielddescriptor, ptorProto ptorproto)
	{
		descriptors$fielddescriptor.setProto(ptorproto);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #209 <Method void setProto(DescriptorProtos$FieldDescriptorProto)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$900(Descriptors$FieldDescriptor descriptors$fielddescriptor)
		throws tionException
	{
		descriptors$fielddescriptor.crossLink();
	//    0    0:aload_0         
	//    1    1:invokespecial   #214 <Method void crossLink()>
		return;
	//    2    4:return          
	}

*/

	private Descriptors$FieldDescriptor(ptorProto ptorproto, Descriptors.FileDescriptor filedescriptor, Descriptors.Descriptor descriptor, int i, boolean flag)
		throws tionException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void Descriptors$GenericDescriptor()>
		index = i;
	//    2    4:aload_0         
	//    3    5:iload           4
	//    4    7:putfield        #75  <Field int index>
		proto = ptorproto;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #77  <Field DescriptorProtos$FieldDescriptorProto proto>
		fullName = Descriptors.access$1600(filedescriptor, descriptor, ptorproto.getName());
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:aload_3         
	//   11   18:aload_1         
	//   12   19:invokevirtual   #83  <Method String DescriptorProtos$FieldDescriptorProto.getName()>
	//   13   22:invokestatic    #87  <Method String Descriptors.access$1600(Descriptors$FileDescriptor, Descriptors$Descriptor, String)>
	//   14   25:putfield        #89  <Field String fullName>
		file = filedescriptor;
	//   15   28:aload_0         
	//   16   29:aload_2         
	//   17   30:putfield        #91  <Field Descriptors$FileDescriptor file>
		if(ptorproto.hasJsonName())
	//*  18   33:aload_1         
	//*  19   34:invokevirtual   #95  <Method boolean DescriptorProtos$FieldDescriptorProto.hasJsonName()>
	//*  20   37:ifeq            51
			jsonName = ptorproto.getJsonName();
	//   21   40:aload_0         
	//   22   41:aload_1         
	//   23   42:invokevirtual   #98  <Method String DescriptorProtos$FieldDescriptorProto.getJsonName()>
	//   24   45:putfield        #100 <Field String jsonName>
		else
	//*  25   48:goto            62
			jsonName = fieldNameToJsonName(ptorproto.getName());
	//   26   51:aload_0         
	//   27   52:aload_1         
	//   28   53:invokevirtual   #83  <Method String DescriptorProtos$FieldDescriptorProto.getName()>
	//   29   56:invokestatic    #104 <Method String fieldNameToJsonName(String)>
	//   30   59:putfield        #100 <Field String jsonName>
		if(ptorproto.hasType())
	//*  31   62:aload_1         
	//*  32   63:invokevirtual   #107 <Method boolean DescriptorProtos$FieldDescriptorProto.hasType()>
	//*  33   66:ifeq            80
			type = Type.valueOf(ptorproto.getType());
	//   34   69:aload_0         
	//   35   70:aload_1         
	//   36   71:invokevirtual   #111 <Method DescriptorProtos$FieldDescriptorProto$Type DescriptorProtos$FieldDescriptorProto.getType()>
	//   37   74:invokestatic    #115 <Method Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.valueOf(DescriptorProtos$FieldDescriptorProto$Type)>
	//   38   77:putfield        #117 <Field Descriptors$FieldDescriptor$Type type>
		if(getNumber() <= 0)
	//*  39   80:aload_0         
	//*  40   81:invokevirtual   #121 <Method int getNumber()>
	//*  41   84:ifgt            99
			throw new tionException(((r) (this)), "Field numbers must be positive integers.", ((Descriptors._cls1) (null)));
	//   42   87:new             #71  <Class Descriptors$DescriptorValidationException>
	//   43   90:dup             
	//   44   91:aload_0         
	//   45   92:ldc1            #123 <String "Field numbers must be positive integers.">
	//   46   94:aconst_null     
	//   47   95:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
	//   48   98:athrow          
		if(flag)
	//*  49   99:iload           5
	//*  50  101:ifeq            172
		{
			if(!ptorproto.hasExtendee())
	//*  51  104:aload_1         
	//*  52  105:invokevirtual   #129 <Method boolean DescriptorProtos$FieldDescriptorProto.hasExtendee()>
	//*  53  108:ifne            123
				throw new tionException(((r) (this)), "FieldDescriptorProto.extendee not set for extension field.", ((Descriptors._cls1) (null)));
	//   54  111:new             #71  <Class Descriptors$DescriptorValidationException>
	//   55  114:dup             
	//   56  115:aload_0         
	//   57  116:ldc1            #131 <String "FieldDescriptorProto.extendee not set for extension field.">
	//   58  118:aconst_null     
	//   59  119:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
	//   60  122:athrow          
			containingType = null;
	//   61  123:aload_0         
	//   62  124:aconst_null     
	//   63  125:putfield        #133 <Field Descriptors$Descriptor containingType>
			if(descriptor != null)
	//*  64  128:aload_3         
	//*  65  129:ifnull          140
				extensionScope = descriptor;
	//   66  132:aload_0         
	//   67  133:aload_3         
	//   68  134:putfield        #135 <Field Descriptors$Descriptor extensionScope>
			else
	//*  69  137:goto            145
				extensionScope = null;
	//   70  140:aload_0         
	//   71  141:aconst_null     
	//   72  142:putfield        #135 <Field Descriptors$Descriptor extensionScope>
			if(ptorproto.hasOneofIndex())
	//*  73  145:aload_1         
	//*  74  146:invokevirtual   #138 <Method boolean DescriptorProtos$FieldDescriptorProto.hasOneofIndex()>
	//*  75  149:ifeq            164
				throw new tionException(((r) (this)), "FieldDescriptorProto.oneof_index set for extension field.", ((Descriptors._cls1) (null)));
	//   76  152:new             #71  <Class Descriptors$DescriptorValidationException>
	//   77  155:dup             
	//   78  156:aload_0         
	//   79  157:ldc1            #140 <String "FieldDescriptorProto.oneof_index set for extension field.">
	//   80  159:aconst_null     
	//   81  160:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
	//   82  163:athrow          
			containingOneof = null;
	//   83  164:aload_0         
	//   84  165:aconst_null     
	//   85  166:putfield        #142 <Field Descriptors$OneofDescriptor containingOneof>
		} else
	//*  86  169:goto            297
		{
			if(ptorproto.hasExtendee())
	//*  87  172:aload_1         
	//*  88  173:invokevirtual   #129 <Method boolean DescriptorProtos$FieldDescriptorProto.hasExtendee()>
	//*  89  176:ifeq            191
				throw new tionException(((r) (this)), "FieldDescriptorProto.extendee set for non-extension field.", ((Descriptors._cls1) (null)));
	//   90  179:new             #71  <Class Descriptors$DescriptorValidationException>
	//   91  182:dup             
	//   92  183:aload_0         
	//   93  184:ldc1            #144 <String "FieldDescriptorProto.extendee set for non-extension field.">
	//   94  186:aconst_null     
	//   95  187:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
	//   96  190:athrow          
			containingType = descriptor;
	//   97  191:aload_0         
	//   98  192:aload_3         
	//   99  193:putfield        #133 <Field Descriptors$Descriptor containingType>
			if(ptorproto.hasOneofIndex())
	//* 100  196:aload_1         
	//* 101  197:invokevirtual   #138 <Method boolean DescriptorProtos$FieldDescriptorProto.hasOneofIndex()>
	//* 102  200:ifeq            287
			{
				if(ptorproto.getOneofIndex() < 0 || ptorproto.getOneofIndex() >= descriptor.toProto().getOneofDeclCount())
	//* 103  203:aload_1         
	//* 104  204:invokevirtual   #147 <Method int DescriptorProtos$FieldDescriptorProto.getOneofIndex()>
	//* 105  207:iflt            224
	//* 106  210:aload_1         
	//* 107  211:invokevirtual   #147 <Method int DescriptorProtos$FieldDescriptorProto.getOneofIndex()>
	//* 108  214:aload_3         
	//* 109  215:invokevirtual   #153 <Method DescriptorProtos$DescriptorProto Descriptors$Descriptor.toProto()>
	//* 110  218:invokevirtual   #158 <Method int DescriptorProtos$DescriptorProto.getOneofDeclCount()>
	//* 111  221:icmplt          256
					throw new tionException(((r) (this)), (new StringBuilder()).append("FieldDescriptorProto.oneof_index is out of range for type ").append(descriptor.getName()).toString(), ((Descriptors._cls1) (null)));
	//  112  224:new             #71  <Class Descriptors$DescriptorValidationException>
	//  113  227:dup             
	//  114  228:aload_0         
	//  115  229:new             #160 <Class StringBuilder>
	//  116  232:dup             
	//  117  233:invokespecial   #161 <Method void StringBuilder()>
	//  118  236:ldc1            #163 <String "FieldDescriptorProto.oneof_index is out of range for type ">
	//  119  238:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  120  241:aload_3         
	//  121  242:invokevirtual   #168 <Method String Descriptors$Descriptor.getName()>
	//  122  245:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  123  248:invokevirtual   #171 <Method String StringBuilder.toString()>
	//  124  251:aconst_null     
	//  125  252:invokespecial   #126 <Method void Descriptors$DescriptorValidationException(Descriptors$GenericDescriptor, String, Descriptors$1)>
	//  126  255:athrow          
				containingOneof = (Descriptors$OneofDescriptor)descriptor.getOneofs().get(ptorproto.getOneofIndex());
	//  127  256:aload_0         
	//  128  257:aload_3         
	//  129  258:invokevirtual   #175 <Method List Descriptors$Descriptor.getOneofs()>
	//  130  261:aload_1         
	//  131  262:invokevirtual   #147 <Method int DescriptorProtos$FieldDescriptorProto.getOneofIndex()>
	//  132  265:invokeinterface #181 <Method Object List.get(int)>
	//  133  270:checkcast       #183 <Class Descriptors$OneofDescriptor>
	//  134  273:putfield        #142 <Field Descriptors$OneofDescriptor containingOneof>
				int _tmp = Descriptors$OneofDescriptor.access$1908(containingOneof);
	//  135  276:aload_0         
	//  136  277:getfield        #142 <Field Descriptors$OneofDescriptor containingOneof>
	//  137  280:invokestatic    #187 <Method int Descriptors$OneofDescriptor.access$1908(Descriptors$OneofDescriptor)>
	//  138  283:pop             
			} else
	//* 139  284:goto            292
			{
				containingOneof = null;
	//  140  287:aload_0         
	//  141  288:aconst_null     
	//  142  289:putfield        #142 <Field Descriptors$OneofDescriptor containingOneof>
			}
			extensionScope = null;
	//  143  292:aload_0         
	//  144  293:aconst_null     
	//  145  294:putfield        #135 <Field Descriptors$Descriptor extensionScope>
		}
		Descriptors.FileDescriptor.access$1400(filedescriptor).addSymbol(((r) (this)));
	//  146  297:aload_2         
	//  147  298:invokestatic    #193 <Method Descriptors$DescriptorPool Descriptors$FileDescriptor.access$1400(Descriptors$FileDescriptor)>
	//  148  301:aload_0         
	//  149  302:invokevirtual   #199 <Method void Descriptors$DescriptorPool.addSymbol(Descriptors$GenericDescriptor)>
	//  150  305:return          
	}

	Descriptors$FieldDescriptor(ptorProto ptorproto, Descriptors.FileDescriptor filedescriptor, Descriptors.Descriptor descriptor, int i, boolean flag, Descriptors._cls1 _pcls1)
		throws tionException
	{
		this(ptorproto, filedescriptor, descriptor, i, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #203 <Method void Descriptors$FieldDescriptor(DescriptorProtos$FieldDescriptorProto, Descriptors$FileDescriptor, Descriptors$Descriptor, int, boolean)>
	//    7   11:return          
	}
}
