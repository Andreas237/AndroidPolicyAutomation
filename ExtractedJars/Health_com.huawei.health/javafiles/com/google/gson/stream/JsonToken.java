// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.stream;


public final class JsonToken extends Enum
{

	private JsonToken(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #58  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static JsonToken valueOf(String s)
	{
		return (JsonToken)Enum.valueOf(com/google/gson/stream/JsonToken, s);
	//    0    0:ldc1            #2   <Class JsonToken>
	//    1    2:aload_0         
	//    2    3:invokestatic    #64  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class JsonToken>
	//    4    9:areturn         
	}

	public static JsonToken[] values()
	{
		return (JsonToken[])((JsonToken []) ($VALUES)).clone();
	//    0    0:getstatic       #56  <Field JsonToken[] $VALUES>
	//    1    3:invokevirtual   #71  <Method Object _5B_Lcom.google.gson.stream.JsonToken_3B_.clone()>
	//    2    6:checkcast       #67  <Class JsonToken[]>
	//    3    9:areturn         
	}

	private static final JsonToken $VALUES[];
	public static final JsonToken BEGIN_ARRAY;
	public static final JsonToken BEGIN_OBJECT;
	public static final JsonToken BOOLEAN;
	public static final JsonToken END_ARRAY;
	public static final JsonToken END_DOCUMENT;
	public static final JsonToken END_OBJECT;
	public static final JsonToken NAME;
	public static final JsonToken NULL;
	public static final JsonToken NUMBER;
	public static final JsonToken STRING;

	static 
	{
		BEGIN_ARRAY = new JsonToken("BEGIN_ARRAY", 0);
	//    0    0:new             #2   <Class JsonToken>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "BEGIN_ARRAY">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #25  <Method void JsonToken(String, int)>
	//    5   10:putstatic       #27  <Field JsonToken BEGIN_ARRAY>
		END_ARRAY = new JsonToken("END_ARRAY", 1);
	//    6   13:new             #2   <Class JsonToken>
	//    7   16:dup             
	//    8   17:ldc1            #28  <String "END_ARRAY">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #25  <Method void JsonToken(String, int)>
	//   11   23:putstatic       #30  <Field JsonToken END_ARRAY>
		BEGIN_OBJECT = new JsonToken("BEGIN_OBJECT", 2);
	//   12   26:new             #2   <Class JsonToken>
	//   13   29:dup             
	//   14   30:ldc1            #31  <String "BEGIN_OBJECT">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #25  <Method void JsonToken(String, int)>
	//   17   36:putstatic       #33  <Field JsonToken BEGIN_OBJECT>
		END_OBJECT = new JsonToken("END_OBJECT", 3);
	//   18   39:new             #2   <Class JsonToken>
	//   19   42:dup             
	//   20   43:ldc1            #34  <String "END_OBJECT">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #25  <Method void JsonToken(String, int)>
	//   23   49:putstatic       #36  <Field JsonToken END_OBJECT>
		NAME = new JsonToken("NAME", 4);
	//   24   52:new             #2   <Class JsonToken>
	//   25   55:dup             
	//   26   56:ldc1            #37  <String "NAME">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #25  <Method void JsonToken(String, int)>
	//   29   62:putstatic       #39  <Field JsonToken NAME>
		STRING = new JsonToken("STRING", 5);
	//   30   65:new             #2   <Class JsonToken>
	//   31   68:dup             
	//   32   69:ldc1            #40  <String "STRING">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #25  <Method void JsonToken(String, int)>
	//   35   75:putstatic       #42  <Field JsonToken STRING>
		NUMBER = new JsonToken("NUMBER", 6);
	//   36   78:new             #2   <Class JsonToken>
	//   37   81:dup             
	//   38   82:ldc1            #43  <String "NUMBER">
	//   39   84:bipush          6
	//   40   86:invokespecial   #25  <Method void JsonToken(String, int)>
	//   41   89:putstatic       #45  <Field JsonToken NUMBER>
		BOOLEAN = new JsonToken("BOOLEAN", 7);
	//   42   92:new             #2   <Class JsonToken>
	//   43   95:dup             
	//   44   96:ldc1            #46  <String "BOOLEAN">
	//   45   98:bipush          7
	//   46  100:invokespecial   #25  <Method void JsonToken(String, int)>
	//   47  103:putstatic       #48  <Field JsonToken BOOLEAN>
		NULL = new JsonToken("NULL", 8);
	//   48  106:new             #2   <Class JsonToken>
	//   49  109:dup             
	//   50  110:ldc1            #49  <String "NULL">
	//   51  112:bipush          8
	//   52  114:invokespecial   #25  <Method void JsonToken(String, int)>
	//   53  117:putstatic       #51  <Field JsonToken NULL>
		END_DOCUMENT = new JsonToken("END_DOCUMENT", 9);
	//   54  120:new             #2   <Class JsonToken>
	//   55  123:dup             
	//   56  124:ldc1            #52  <String "END_DOCUMENT">
	//   57  126:bipush          9
	//   58  128:invokespecial   #25  <Method void JsonToken(String, int)>
	//   59  131:putstatic       #54  <Field JsonToken END_DOCUMENT>
		$VALUES = (new JsonToken[] {
			BEGIN_ARRAY, END_ARRAY, BEGIN_OBJECT, END_OBJECT, NAME, STRING, NUMBER, BOOLEAN, NULL, END_DOCUMENT
		});
	//   60  134:bipush          10
	//   61  136:anewarray       JsonToken[]
	//   62  139:dup             
	//   63  140:iconst_0        
	//   64  141:getstatic       #27  <Field JsonToken BEGIN_ARRAY>
	//   65  144:aastore         
	//   66  145:dup             
	//   67  146:iconst_1        
	//   68  147:getstatic       #30  <Field JsonToken END_ARRAY>
	//   69  150:aastore         
	//   70  151:dup             
	//   71  152:iconst_2        
	//   72  153:getstatic       #33  <Field JsonToken BEGIN_OBJECT>
	//   73  156:aastore         
	//   74  157:dup             
	//   75  158:iconst_3        
	//   76  159:getstatic       #36  <Field JsonToken END_OBJECT>
	//   77  162:aastore         
	//   78  163:dup             
	//   79  164:iconst_4        
	//   80  165:getstatic       #39  <Field JsonToken NAME>
	//   81  168:aastore         
	//   82  169:dup             
	//   83  170:iconst_5        
	//   84  171:getstatic       #42  <Field JsonToken STRING>
	//   85  174:aastore         
	//   86  175:dup             
	//   87  176:bipush          6
	//   88  178:getstatic       #45  <Field JsonToken NUMBER>
	//   89  181:aastore         
	//   90  182:dup             
	//   91  183:bipush          7
	//   92  185:getstatic       #48  <Field JsonToken BOOLEAN>
	//   93  188:aastore         
	//   94  189:dup             
	//   95  190:bipush          8
	//   96  192:getstatic       #51  <Field JsonToken NULL>
	//   97  195:aastore         
	//   98  196:dup             
	//   99  197:bipush          9
	//  100  199:getstatic       #54  <Field JsonToken END_DOCUMENT>
	//  101  202:aastore         
	//  102  203:putstatic       #56  <Field JsonToken[] $VALUES>
	//* 103  206:return          
	}
}
