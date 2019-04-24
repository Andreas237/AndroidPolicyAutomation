// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;


// Referenced classes of package com.google.protobuf:
//			Descriptors, ByteString

public static final class Descriptors$FieldDescriptor$JavaType extends Enum
{

	public static Descriptors$FieldDescriptor$JavaType valueOf(String s)
	{
		return (Descriptors$FieldDescriptor$JavaType)Enum.valueOf(com/google/protobuf/Descriptors$FieldDescriptor$JavaType, s);
	//    0    0:ldc1            #2   <Class Descriptors$FieldDescriptor$JavaType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #108 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Descriptors$FieldDescriptor$JavaType>
	//    4    9:areturn         
	}

	public static Descriptors$FieldDescriptor$JavaType[] values()
	{
		return (Descriptors$FieldDescriptor$JavaType[])((Descriptors$FieldDescriptor$JavaType []) ($VALUES)).clone();
	//    0    0:getstatic       #94  <Field Descriptors$FieldDescriptor$JavaType[] $VALUES>
	//    1    3:invokevirtual   #115 <Method Object _5B_Lcom.google.protobuf.Descriptors$FieldDescriptor$JavaType_3B_.clone()>
	//    2    6:checkcast       #111 <Class Descriptors$FieldDescriptor$JavaType[]>
	//    3    9:areturn         
	}

	private static final Descriptors$FieldDescriptor$JavaType $VALUES[];
	public static final Descriptors$FieldDescriptor$JavaType BOOLEAN;
	public static final Descriptors$FieldDescriptor$JavaType BYTE_STRING;
	public static final Descriptors$FieldDescriptor$JavaType DOUBLE;
	public static final Descriptors$FieldDescriptor$JavaType ENUM;
	public static final Descriptors$FieldDescriptor$JavaType FLOAT;
	public static final Descriptors$FieldDescriptor$JavaType INT;
	public static final Descriptors$FieldDescriptor$JavaType LONG;
	public static final Descriptors$FieldDescriptor$JavaType MESSAGE;
	public static final Descriptors$FieldDescriptor$JavaType STRING;
	private final Object defaultDefault;

	static 
	{
		INT = new Descriptors$FieldDescriptor$JavaType("INT", 0, ((Object) (Integer.valueOf(0))));
	//    0    0:new             #2   <Class Descriptors$FieldDescriptor$JavaType>
	//    1    3:dup             
	//    2    4:ldc1            #28  <String "INT">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//    6   11:invokespecial   #38  <Method void Descriptors$FieldDescriptor$JavaType(String, int, Object)>
	//    7   14:putstatic       #40  <Field Descriptors$FieldDescriptor$JavaType INT>
		LONG = new Descriptors$FieldDescriptor$JavaType("LONG", 1, ((Object) (Long.valueOf(0L))));
	//    8   17:new             #2   <Class Descriptors$FieldDescriptor$JavaType>
	//    9   20:dup             
	//   10   21:ldc1            #41  <String "LONG">
	//   11   23:iconst_1        
	//   12   24:lconst_0        
	//   13   25:invokestatic    #46  <Method Long Long.valueOf(long)>
	//   14   28:invokespecial   #38  <Method void Descriptors$FieldDescriptor$JavaType(String, int, Object)>
	//   15   31:putstatic       #48  <Field Descriptors$FieldDescriptor$JavaType LONG>
		FLOAT = new Descriptors$FieldDescriptor$JavaType("FLOAT", 2, ((Object) (Float.valueOf(0.0F))));
	//   16   34:new             #2   <Class Descriptors$FieldDescriptor$JavaType>
	//   17   37:dup             
	//   18   38:ldc1            #49  <String "FLOAT">
	//   19   40:iconst_2        
	//   20   41:fconst_0        
	//   21   42:invokestatic    #54  <Method Float Float.valueOf(float)>
	//   22   45:invokespecial   #38  <Method void Descriptors$FieldDescriptor$JavaType(String, int, Object)>
	//   23   48:putstatic       #56  <Field Descriptors$FieldDescriptor$JavaType FLOAT>
		DOUBLE = new Descriptors$FieldDescriptor$JavaType("DOUBLE", 3, ((Object) (Double.valueOf(0.0D))));
	//   24   51:new             #2   <Class Descriptors$FieldDescriptor$JavaType>
	//   25   54:dup             
	//   26   55:ldc1            #57  <String "DOUBLE">
	//   27   57:iconst_3        
	//   28   58:dconst_0        
	//   29   59:invokestatic    #62  <Method Double Double.valueOf(double)>
	//   30   62:invokespecial   #38  <Method void Descriptors$FieldDescriptor$JavaType(String, int, Object)>
	//   31   65:putstatic       #64  <Field Descriptors$FieldDescriptor$JavaType DOUBLE>
		BOOLEAN = new Descriptors$FieldDescriptor$JavaType("BOOLEAN", 4, ((Object) (Boolean.valueOf(false))));
	//   32   68:new             #2   <Class Descriptors$FieldDescriptor$JavaType>
	//   33   71:dup             
	//   34   72:ldc1            #65  <String "BOOLEAN">
	//   35   74:iconst_4        
	//   36   75:iconst_0        
	//   37   76:invokestatic    #70  <Method Boolean Boolean.valueOf(boolean)>
	//   38   79:invokespecial   #38  <Method void Descriptors$FieldDescriptor$JavaType(String, int, Object)>
	//   39   82:putstatic       #72  <Field Descriptors$FieldDescriptor$JavaType BOOLEAN>
		STRING = new Descriptors$FieldDescriptor$JavaType("STRING", 5, "");
	//   40   85:new             #2   <Class Descriptors$FieldDescriptor$JavaType>
	//   41   88:dup             
	//   42   89:ldc1            #73  <String "STRING">
	//   43   91:iconst_5        
	//   44   92:ldc1            #75  <String "">
	//   45   94:invokespecial   #38  <Method void Descriptors$FieldDescriptor$JavaType(String, int, Object)>
	//   46   97:putstatic       #77  <Field Descriptors$FieldDescriptor$JavaType STRING>
		BYTE_STRING = new Descriptors$FieldDescriptor$JavaType("BYTE_STRING", 6, ((Object) (ByteString.EMPTY)));
	//   47  100:new             #2   <Class Descriptors$FieldDescriptor$JavaType>
	//   48  103:dup             
	//   49  104:ldc1            #78  <String "BYTE_STRING">
	//   50  106:bipush          6
	//   51  108:getstatic       #84  <Field ByteString ByteString.EMPTY>
	//   52  111:invokespecial   #38  <Method void Descriptors$FieldDescriptor$JavaType(String, int, Object)>
	//   53  114:putstatic       #86  <Field Descriptors$FieldDescriptor$JavaType BYTE_STRING>
		ENUM = new Descriptors$FieldDescriptor$JavaType("ENUM", 7, ((Object) (null)));
	//   54  117:new             #2   <Class Descriptors$FieldDescriptor$JavaType>
	//   55  120:dup             
	//   56  121:ldc1            #87  <String "ENUM">
	//   57  123:bipush          7
	//   58  125:aconst_null     
	//   59  126:invokespecial   #38  <Method void Descriptors$FieldDescriptor$JavaType(String, int, Object)>
	//   60  129:putstatic       #89  <Field Descriptors$FieldDescriptor$JavaType ENUM>
		MESSAGE = new Descriptors$FieldDescriptor$JavaType("MESSAGE", 8, ((Object) (null)));
	//   61  132:new             #2   <Class Descriptors$FieldDescriptor$JavaType>
	//   62  135:dup             
	//   63  136:ldc1            #90  <String "MESSAGE">
	//   64  138:bipush          8
	//   65  140:aconst_null     
	//   66  141:invokespecial   #38  <Method void Descriptors$FieldDescriptor$JavaType(String, int, Object)>
	//   67  144:putstatic       #92  <Field Descriptors$FieldDescriptor$JavaType MESSAGE>
		$VALUES = (new Descriptors$FieldDescriptor$JavaType[] {
			INT, LONG, FLOAT, DOUBLE, BOOLEAN, STRING, BYTE_STRING, ENUM, MESSAGE
		});
	//   68  147:bipush          9
	//   69  149:anewarray       Descriptors$FieldDescriptor$JavaType[]
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
	static Object access$2300(Descriptors$FieldDescriptor$JavaType descriptors$fielddescriptor$javatype)
	{
		return descriptors$fielddescriptor$javatype.defaultDefault;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field Object defaultDefault>
	//    2    4:areturn         
	}

*/

	private Descriptors$FieldDescriptor$JavaType(String s, int i, Object obj)
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
