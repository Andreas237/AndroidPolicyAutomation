// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.json;

import java.io.Closeable;
import java.io.IOException;

public abstract class JsonReader
	implements Closeable
{
	public static final class Token extends Enum
	{

		public static Token valueOf(String s)
		{
			return (Token)Enum.valueOf(com/apollographql/apollo/internal/json/JsonReader$Token, s);
		//    0    0:ldc1            #2   <Class JsonReader$Token>
		//    1    2:aload_0         
		//    2    3:invokestatic    #67  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class JsonReader$Token>
		//    4    9:areturn         
		}

		public static Token[] values()
		{
			return (Token[])((Token []) ($VALUES)).clone();
		//    0    0:getstatic       #59  <Field JsonReader$Token[] $VALUES>
		//    1    3:invokevirtual   #74  <Method Object _5B_Lcom.apollographql.apollo.internal.json.JsonReader$Token_3B_.clone()>
		//    2    6:checkcast       #70  <Class JsonReader$Token[]>
		//    3    9:areturn         
		}

		private static final Token $VALUES[];
		public static final Token BEGIN_ARRAY;
		public static final Token BEGIN_OBJECT;
		public static final Token BOOLEAN;
		public static final Token END_ARRAY;
		public static final Token END_DOCUMENT;
		public static final Token END_OBJECT;
		public static final Token NAME;
		public static final Token NULL;
		public static final Token NUMBER;
		public static final Token STRING;

		static 
		{
			BEGIN_ARRAY = new Token("BEGIN_ARRAY", 0);
		//    0    0:new             #2   <Class JsonReader$Token>
		//    1    3:dup             
		//    2    4:ldc1            #24  <String "BEGIN_ARRAY">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #28  <Method void JsonReader$Token(String, int)>
		//    5   10:putstatic       #30  <Field JsonReader$Token BEGIN_ARRAY>
			END_ARRAY = new Token("END_ARRAY", 1);
		//    6   13:new             #2   <Class JsonReader$Token>
		//    7   16:dup             
		//    8   17:ldc1            #31  <String "END_ARRAY">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #28  <Method void JsonReader$Token(String, int)>
		//   11   23:putstatic       #33  <Field JsonReader$Token END_ARRAY>
			BEGIN_OBJECT = new Token("BEGIN_OBJECT", 2);
		//   12   26:new             #2   <Class JsonReader$Token>
		//   13   29:dup             
		//   14   30:ldc1            #34  <String "BEGIN_OBJECT">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #28  <Method void JsonReader$Token(String, int)>
		//   17   36:putstatic       #36  <Field JsonReader$Token BEGIN_OBJECT>
			END_OBJECT = new Token("END_OBJECT", 3);
		//   18   39:new             #2   <Class JsonReader$Token>
		//   19   42:dup             
		//   20   43:ldc1            #37  <String "END_OBJECT">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #28  <Method void JsonReader$Token(String, int)>
		//   23   49:putstatic       #39  <Field JsonReader$Token END_OBJECT>
			NAME = new Token("NAME", 4);
		//   24   52:new             #2   <Class JsonReader$Token>
		//   25   55:dup             
		//   26   56:ldc1            #40  <String "NAME">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #28  <Method void JsonReader$Token(String, int)>
		//   29   62:putstatic       #42  <Field JsonReader$Token NAME>
			STRING = new Token("STRING", 5);
		//   30   65:new             #2   <Class JsonReader$Token>
		//   31   68:dup             
		//   32   69:ldc1            #43  <String "STRING">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #28  <Method void JsonReader$Token(String, int)>
		//   35   75:putstatic       #45  <Field JsonReader$Token STRING>
			NUMBER = new Token("NUMBER", 6);
		//   36   78:new             #2   <Class JsonReader$Token>
		//   37   81:dup             
		//   38   82:ldc1            #46  <String "NUMBER">
		//   39   84:bipush          6
		//   40   86:invokespecial   #28  <Method void JsonReader$Token(String, int)>
		//   41   89:putstatic       #48  <Field JsonReader$Token NUMBER>
			BOOLEAN = new Token("BOOLEAN", 7);
		//   42   92:new             #2   <Class JsonReader$Token>
		//   43   95:dup             
		//   44   96:ldc1            #49  <String "BOOLEAN">
		//   45   98:bipush          7
		//   46  100:invokespecial   #28  <Method void JsonReader$Token(String, int)>
		//   47  103:putstatic       #51  <Field JsonReader$Token BOOLEAN>
			NULL = new Token("NULL", 8);
		//   48  106:new             #2   <Class JsonReader$Token>
		//   49  109:dup             
		//   50  110:ldc1            #52  <String "NULL">
		//   51  112:bipush          8
		//   52  114:invokespecial   #28  <Method void JsonReader$Token(String, int)>
		//   53  117:putstatic       #54  <Field JsonReader$Token NULL>
			END_DOCUMENT = new Token("END_DOCUMENT", 9);
		//   54  120:new             #2   <Class JsonReader$Token>
		//   55  123:dup             
		//   56  124:ldc1            #55  <String "END_DOCUMENT">
		//   57  126:bipush          9
		//   58  128:invokespecial   #28  <Method void JsonReader$Token(String, int)>
		//   59  131:putstatic       #57  <Field JsonReader$Token END_DOCUMENT>
			$VALUES = (new Token[] {
				BEGIN_ARRAY, END_ARRAY, BEGIN_OBJECT, END_OBJECT, NAME, STRING, NUMBER, BOOLEAN, NULL, END_DOCUMENT
			});
		//   60  134:bipush          10
		//   61  136:anewarray       Token[]
		//   62  139:dup             
		//   63  140:iconst_0        
		//   64  141:getstatic       #30  <Field JsonReader$Token BEGIN_ARRAY>
		//   65  144:aastore         
		//   66  145:dup             
		//   67  146:iconst_1        
		//   68  147:getstatic       #33  <Field JsonReader$Token END_ARRAY>
		//   69  150:aastore         
		//   70  151:dup             
		//   71  152:iconst_2        
		//   72  153:getstatic       #36  <Field JsonReader$Token BEGIN_OBJECT>
		//   73  156:aastore         
		//   74  157:dup             
		//   75  158:iconst_3        
		//   76  159:getstatic       #39  <Field JsonReader$Token END_OBJECT>
		//   77  162:aastore         
		//   78  163:dup             
		//   79  164:iconst_4        
		//   80  165:getstatic       #42  <Field JsonReader$Token NAME>
		//   81  168:aastore         
		//   82  169:dup             
		//   83  170:iconst_5        
		//   84  171:getstatic       #45  <Field JsonReader$Token STRING>
		//   85  174:aastore         
		//   86  175:dup             
		//   87  176:bipush          6
		//   88  178:getstatic       #48  <Field JsonReader$Token NUMBER>
		//   89  181:aastore         
		//   90  182:dup             
		//   91  183:bipush          7
		//   92  185:getstatic       #51  <Field JsonReader$Token BOOLEAN>
		//   93  188:aastore         
		//   94  189:dup             
		//   95  190:bipush          8
		//   96  192:getstatic       #54  <Field JsonReader$Token NULL>
		//   97  195:aastore         
		//   98  196:dup             
		//   99  197:bipush          9
		//  100  199:getstatic       #57  <Field JsonReader$Token END_DOCUMENT>
		//  101  202:aastore         
		//  102  203:putstatic       #59  <Field JsonReader$Token[] $VALUES>
		//* 103  206:return          
		}

		private Token(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #61  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	JsonReader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public abstract void beginArray()
		throws IOException;

	public abstract void beginObject()
		throws IOException;

	public abstract void endArray()
		throws IOException;

	public abstract void endObject()
		throws IOException;

	public abstract boolean hasNext()
		throws IOException;

	public abstract boolean nextBoolean()
		throws IOException;

	public abstract String nextName()
		throws IOException;

	public abstract String nextString()
		throws IOException;

	public abstract Token peek()
		throws IOException;

	public abstract void skipValue()
		throws IOException;
}
