// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api;


// Referenced classes of package com.apollographql.apollo.api:
//			ResponseField

public static final class ResponseField$Type extends Enum
{

	public static ResponseField$Type valueOf(String s)
	{
		return (ResponseField$Type)Enum.valueOf(com/apollographql/apollo/api/ResponseField$Type, s);
	//    0    0:ldc1            #2   <Class ResponseField$Type>
	//    1    2:aload_0         
	//    2    3:invokestatic    #71  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ResponseField$Type>
	//    4    9:areturn         
	}

	public static ResponseField$Type[] values()
	{
		return (ResponseField$Type[])((ResponseField$Type []) ($VALUES)).clone();
	//    0    0:getstatic       #63  <Field ResponseField$Type[] $VALUES>
	//    1    3:invokevirtual   #78  <Method Object _5B_Lcom.apollographql.apollo.api.ResponseField$Type_3B_.clone()>
	//    2    6:checkcast       #74  <Class ResponseField$Type[]>
	//    3    9:areturn         
	}

	private static final ResponseField$Type $VALUES[];
	public static final ResponseField$Type BOOLEAN;
	public static final ResponseField$Type CUSTOM;
	public static final ResponseField$Type DOUBLE;
	public static final ResponseField$Type ENUM;
	public static final ResponseField$Type FRAGMENT;
	public static final ResponseField$Type INLINE_FRAGMENT;
	public static final ResponseField$Type INT;
	public static final ResponseField$Type LIST;
	public static final ResponseField$Type LONG;
	public static final ResponseField$Type OBJECT;
	public static final ResponseField$Type STRING;

	static 
	{
		STRING = new ResponseField$Type("STRING", 0);
	//    0    0:new             #2   <Class ResponseField$Type>
	//    1    3:dup             
	//    2    4:ldc1            #25  <String "STRING">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #29  <Method void ResponseField$Type(String, int)>
	//    5   10:putstatic       #31  <Field ResponseField$Type STRING>
		INT = new ResponseField$Type("INT", 1);
	//    6   13:new             #2   <Class ResponseField$Type>
	//    7   16:dup             
	//    8   17:ldc1            #32  <String "INT">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #29  <Method void ResponseField$Type(String, int)>
	//   11   23:putstatic       #34  <Field ResponseField$Type INT>
		LONG = new ResponseField$Type("LONG", 2);
	//   12   26:new             #2   <Class ResponseField$Type>
	//   13   29:dup             
	//   14   30:ldc1            #35  <String "LONG">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #29  <Method void ResponseField$Type(String, int)>
	//   17   36:putstatic       #37  <Field ResponseField$Type LONG>
		DOUBLE = new ResponseField$Type("DOUBLE", 3);
	//   18   39:new             #2   <Class ResponseField$Type>
	//   19   42:dup             
	//   20   43:ldc1            #38  <String "DOUBLE">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #29  <Method void ResponseField$Type(String, int)>
	//   23   49:putstatic       #40  <Field ResponseField$Type DOUBLE>
		BOOLEAN = new ResponseField$Type("BOOLEAN", 4);
	//   24   52:new             #2   <Class ResponseField$Type>
	//   25   55:dup             
	//   26   56:ldc1            #41  <String "BOOLEAN">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #29  <Method void ResponseField$Type(String, int)>
	//   29   62:putstatic       #43  <Field ResponseField$Type BOOLEAN>
		ENUM = new ResponseField$Type("ENUM", 5);
	//   30   65:new             #2   <Class ResponseField$Type>
	//   31   68:dup             
	//   32   69:ldc1            #44  <String "ENUM">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #29  <Method void ResponseField$Type(String, int)>
	//   35   75:putstatic       #46  <Field ResponseField$Type ENUM>
		OBJECT = new ResponseField$Type("OBJECT", 6);
	//   36   78:new             #2   <Class ResponseField$Type>
	//   37   81:dup             
	//   38   82:ldc1            #47  <String "OBJECT">
	//   39   84:bipush          6
	//   40   86:invokespecial   #29  <Method void ResponseField$Type(String, int)>
	//   41   89:putstatic       #49  <Field ResponseField$Type OBJECT>
		LIST = new ResponseField$Type("LIST", 7);
	//   42   92:new             #2   <Class ResponseField$Type>
	//   43   95:dup             
	//   44   96:ldc1            #50  <String "LIST">
	//   45   98:bipush          7
	//   46  100:invokespecial   #29  <Method void ResponseField$Type(String, int)>
	//   47  103:putstatic       #52  <Field ResponseField$Type LIST>
		CUSTOM = new ResponseField$Type("CUSTOM", 8);
	//   48  106:new             #2   <Class ResponseField$Type>
	//   49  109:dup             
	//   50  110:ldc1            #53  <String "CUSTOM">
	//   51  112:bipush          8
	//   52  114:invokespecial   #29  <Method void ResponseField$Type(String, int)>
	//   53  117:putstatic       #55  <Field ResponseField$Type CUSTOM>
		FRAGMENT = new ResponseField$Type("FRAGMENT", 9);
	//   54  120:new             #2   <Class ResponseField$Type>
	//   55  123:dup             
	//   56  124:ldc1            #56  <String "FRAGMENT">
	//   57  126:bipush          9
	//   58  128:invokespecial   #29  <Method void ResponseField$Type(String, int)>
	//   59  131:putstatic       #58  <Field ResponseField$Type FRAGMENT>
		INLINE_FRAGMENT = new ResponseField$Type("INLINE_FRAGMENT", 10);
	//   60  134:new             #2   <Class ResponseField$Type>
	//   61  137:dup             
	//   62  138:ldc1            #59  <String "INLINE_FRAGMENT">
	//   63  140:bipush          10
	//   64  142:invokespecial   #29  <Method void ResponseField$Type(String, int)>
	//   65  145:putstatic       #61  <Field ResponseField$Type INLINE_FRAGMENT>
		$VALUES = (new ResponseField$Type[] {
			STRING, INT, LONG, DOUBLE, BOOLEAN, ENUM, OBJECT, LIST, CUSTOM, FRAGMENT, 
			INLINE_FRAGMENT
		});
	//   66  148:bipush          11
	//   67  150:anewarray       ResponseField$Type[]
	//   68  153:dup             
	//   69  154:iconst_0        
	//   70  155:getstatic       #31  <Field ResponseField$Type STRING>
	//   71  158:aastore         
	//   72  159:dup             
	//   73  160:iconst_1        
	//   74  161:getstatic       #34  <Field ResponseField$Type INT>
	//   75  164:aastore         
	//   76  165:dup             
	//   77  166:iconst_2        
	//   78  167:getstatic       #37  <Field ResponseField$Type LONG>
	//   79  170:aastore         
	//   80  171:dup             
	//   81  172:iconst_3        
	//   82  173:getstatic       #40  <Field ResponseField$Type DOUBLE>
	//   83  176:aastore         
	//   84  177:dup             
	//   85  178:iconst_4        
	//   86  179:getstatic       #43  <Field ResponseField$Type BOOLEAN>
	//   87  182:aastore         
	//   88  183:dup             
	//   89  184:iconst_5        
	//   90  185:getstatic       #46  <Field ResponseField$Type ENUM>
	//   91  188:aastore         
	//   92  189:dup             
	//   93  190:bipush          6
	//   94  192:getstatic       #49  <Field ResponseField$Type OBJECT>
	//   95  195:aastore         
	//   96  196:dup             
	//   97  197:bipush          7
	//   98  199:getstatic       #52  <Field ResponseField$Type LIST>
	//   99  202:aastore         
	//  100  203:dup             
	//  101  204:bipush          8
	//  102  206:getstatic       #55  <Field ResponseField$Type CUSTOM>
	//  103  209:aastore         
	//  104  210:dup             
	//  105  211:bipush          9
	//  106  213:getstatic       #58  <Field ResponseField$Type FRAGMENT>
	//  107  216:aastore         
	//  108  217:dup             
	//  109  218:bipush          10
	//  110  220:getstatic       #61  <Field ResponseField$Type INLINE_FRAGMENT>
	//  111  223:aastore         
	//  112  224:putstatic       #63  <Field ResponseField$Type[] $VALUES>
	//* 113  227:return          
	}

	private ResponseField$Type(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #65  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
