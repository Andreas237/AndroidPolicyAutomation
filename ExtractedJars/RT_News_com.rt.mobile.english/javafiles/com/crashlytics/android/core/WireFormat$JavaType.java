// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//			WireFormat, ByteString

static final class WireFormat$JavaType extends Enum
{

	public static WireFormat$JavaType valueOf(String s)
	{
		return (WireFormat$JavaType)Enum.valueOf(com/crashlytics/android/core/WireFormat$JavaType, s);
	//    0    0:ldc1            #2   <Class WireFormat$JavaType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #103 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class WireFormat$JavaType>
	//    4    9:areturn         
	}

	public static WireFormat$JavaType[] values()
	{
		return (WireFormat$JavaType[])((WireFormat$JavaType []) ($VALUES)).clone();
	//    0    0:getstatic       #91  <Field WireFormat$JavaType[] $VALUES>
	//    1    3:invokevirtual   #110 <Method Object _5B_Lcom.crashlytics.android.core.WireFormat$JavaType_3B_.clone()>
	//    2    6:checkcast       #106 <Class WireFormat$JavaType[]>
	//    3    9:areturn         
	}

	Object getDefaultDefault()
	{
		return defaultDefault;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field Object defaultDefault>
	//    2    4:areturn         
	}

	private static final WireFormat$JavaType $VALUES[];
	public static final WireFormat$JavaType BOOLEAN;
	public static final WireFormat$JavaType BYTE_STRING;
	public static final WireFormat$JavaType DOUBLE;
	public static final WireFormat$JavaType ENUM;
	public static final WireFormat$JavaType FLOAT;
	public static final WireFormat$JavaType INT;
	public static final WireFormat$JavaType LONG;
	public static final WireFormat$JavaType MESSAGE;
	public static final WireFormat$JavaType STRING;
	private final Object defaultDefault;

	static 
	{
		INT = new WireFormat$JavaType("INT", 0, ((Object) (Integer.valueOf(0))));
	//    0    0:new             #2   <Class WireFormat$JavaType>
	//    1    3:dup             
	//    2    4:ldc1            #25  <String "INT">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokestatic    #31  <Method Integer Integer.valueOf(int)>
	//    6   11:invokespecial   #35  <Method void WireFormat$JavaType(String, int, Object)>
	//    7   14:putstatic       #37  <Field WireFormat$JavaType INT>
		LONG = new WireFormat$JavaType("LONG", 1, ((Object) (Long.valueOf(0L))));
	//    8   17:new             #2   <Class WireFormat$JavaType>
	//    9   20:dup             
	//   10   21:ldc1            #38  <String "LONG">
	//   11   23:iconst_1        
	//   12   24:lconst_0        
	//   13   25:invokestatic    #43  <Method Long Long.valueOf(long)>
	//   14   28:invokespecial   #35  <Method void WireFormat$JavaType(String, int, Object)>
	//   15   31:putstatic       #45  <Field WireFormat$JavaType LONG>
		FLOAT = new WireFormat$JavaType("FLOAT", 2, ((Object) (Float.valueOf(0.0F))));
	//   16   34:new             #2   <Class WireFormat$JavaType>
	//   17   37:dup             
	//   18   38:ldc1            #46  <String "FLOAT">
	//   19   40:iconst_2        
	//   20   41:fconst_0        
	//   21   42:invokestatic    #51  <Method Float Float.valueOf(float)>
	//   22   45:invokespecial   #35  <Method void WireFormat$JavaType(String, int, Object)>
	//   23   48:putstatic       #53  <Field WireFormat$JavaType FLOAT>
		DOUBLE = new WireFormat$JavaType("DOUBLE", 3, ((Object) (Double.valueOf(0.0D))));
	//   24   51:new             #2   <Class WireFormat$JavaType>
	//   25   54:dup             
	//   26   55:ldc1            #54  <String "DOUBLE">
	//   27   57:iconst_3        
	//   28   58:dconst_0        
	//   29   59:invokestatic    #59  <Method Double Double.valueOf(double)>
	//   30   62:invokespecial   #35  <Method void WireFormat$JavaType(String, int, Object)>
	//   31   65:putstatic       #61  <Field WireFormat$JavaType DOUBLE>
		BOOLEAN = new WireFormat$JavaType("BOOLEAN", 4, ((Object) (Boolean.valueOf(false))));
	//   32   68:new             #2   <Class WireFormat$JavaType>
	//   33   71:dup             
	//   34   72:ldc1            #62  <String "BOOLEAN">
	//   35   74:iconst_4        
	//   36   75:iconst_0        
	//   37   76:invokestatic    #67  <Method Boolean Boolean.valueOf(boolean)>
	//   38   79:invokespecial   #35  <Method void WireFormat$JavaType(String, int, Object)>
	//   39   82:putstatic       #69  <Field WireFormat$JavaType BOOLEAN>
		STRING = new WireFormat$JavaType("STRING", 5, "");
	//   40   85:new             #2   <Class WireFormat$JavaType>
	//   41   88:dup             
	//   42   89:ldc1            #70  <String "STRING">
	//   43   91:iconst_5        
	//   44   92:ldc1            #72  <String "">
	//   45   94:invokespecial   #35  <Method void WireFormat$JavaType(String, int, Object)>
	//   46   97:putstatic       #74  <Field WireFormat$JavaType STRING>
		BYTE_STRING = new WireFormat$JavaType("BYTE_STRING", 6, ((Object) (ByteString.EMPTY)));
	//   47  100:new             #2   <Class WireFormat$JavaType>
	//   48  103:dup             
	//   49  104:ldc1            #75  <String "BYTE_STRING">
	//   50  106:bipush          6
	//   51  108:getstatic       #81  <Field ByteString ByteString.EMPTY>
	//   52  111:invokespecial   #35  <Method void WireFormat$JavaType(String, int, Object)>
	//   53  114:putstatic       #83  <Field WireFormat$JavaType BYTE_STRING>
		ENUM = new WireFormat$JavaType("ENUM", 7, ((Object) (null)));
	//   54  117:new             #2   <Class WireFormat$JavaType>
	//   55  120:dup             
	//   56  121:ldc1            #84  <String "ENUM">
	//   57  123:bipush          7
	//   58  125:aconst_null     
	//   59  126:invokespecial   #35  <Method void WireFormat$JavaType(String, int, Object)>
	//   60  129:putstatic       #86  <Field WireFormat$JavaType ENUM>
		MESSAGE = new WireFormat$JavaType("MESSAGE", 8, ((Object) (null)));
	//   61  132:new             #2   <Class WireFormat$JavaType>
	//   62  135:dup             
	//   63  136:ldc1            #87  <String "MESSAGE">
	//   64  138:bipush          8
	//   65  140:aconst_null     
	//   66  141:invokespecial   #35  <Method void WireFormat$JavaType(String, int, Object)>
	//   67  144:putstatic       #89  <Field WireFormat$JavaType MESSAGE>
		$VALUES = (new WireFormat$JavaType[] {
			INT, LONG, FLOAT, DOUBLE, BOOLEAN, STRING, BYTE_STRING, ENUM, MESSAGE
		});
	//   68  147:bipush          9
	//   69  149:anewarray       WireFormat$JavaType[]
	//   70  152:dup             
	//   71  153:iconst_0        
	//   72  154:getstatic       #37  <Field WireFormat$JavaType INT>
	//   73  157:aastore         
	//   74  158:dup             
	//   75  159:iconst_1        
	//   76  160:getstatic       #45  <Field WireFormat$JavaType LONG>
	//   77  163:aastore         
	//   78  164:dup             
	//   79  165:iconst_2        
	//   80  166:getstatic       #53  <Field WireFormat$JavaType FLOAT>
	//   81  169:aastore         
	//   82  170:dup             
	//   83  171:iconst_3        
	//   84  172:getstatic       #61  <Field WireFormat$JavaType DOUBLE>
	//   85  175:aastore         
	//   86  176:dup             
	//   87  177:iconst_4        
	//   88  178:getstatic       #69  <Field WireFormat$JavaType BOOLEAN>
	//   89  181:aastore         
	//   90  182:dup             
	//   91  183:iconst_5        
	//   92  184:getstatic       #74  <Field WireFormat$JavaType STRING>
	//   93  187:aastore         
	//   94  188:dup             
	//   95  189:bipush          6
	//   96  191:getstatic       #83  <Field WireFormat$JavaType BYTE_STRING>
	//   97  194:aastore         
	//   98  195:dup             
	//   99  196:bipush          7
	//  100  198:getstatic       #86  <Field WireFormat$JavaType ENUM>
	//  101  201:aastore         
	//  102  202:dup             
	//  103  203:bipush          8
	//  104  205:getstatic       #89  <Field WireFormat$JavaType MESSAGE>
	//  105  208:aastore         
	//  106  209:putstatic       #91  <Field WireFormat$JavaType[] $VALUES>
	//* 107  212:return          
	}

	private WireFormat$JavaType(String s, int i, Object obj)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #95  <Method void Enum(String, int)>
		defaultDefault = obj;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #97  <Field Object defaultDefault>
	//    7   11:return          
	}
}
