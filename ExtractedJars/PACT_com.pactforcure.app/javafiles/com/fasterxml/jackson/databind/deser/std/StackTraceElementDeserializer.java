// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdScalarDeserializer

public class StackTraceElementDeserializer extends StdScalarDeserializer
{

	public StackTraceElementDeserializer()
	{
		super(java/lang/StackTraceElement);
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <Class StackTraceElement>
	//    2    3:invokespecial   #16  <Method void StdScalarDeserializer(Class)>
	//    3    6:return          
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #26  <Method StackTraceElement deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public StackTraceElement deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		Object obj = ((Object) (jsonparser.getCurrentToken()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #33  <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore          4
		if(obj == JsonToken.START_OBJECT)
	//*   3    6:aload           4
	//*   4    8:getstatic       #39  <Field JsonToken JsonToken.START_OBJECT>
	//*   5   11:if_acmpne       205
		{
			String s1 = "";
	//    6   14:ldc1            #41  <String "">
	//    7   16:astore          6
			obj = "";
	//    8   18:ldc1            #41  <String "">
	//    9   20:astore          4
			String s = "";
	//   10   22:ldc1            #41  <String "">
	//   11   24:astore          5
			int i = -1;
	//   12   26:iconst_m1       
	//   13   27:istore_3        
			do
			{
				JsonToken jsontoken = jsonparser.nextValue();
	//   14   28:aload_1         
	//   15   29:invokevirtual   #44  <Method JsonToken JsonParser.nextValue()>
	//   16   32:astore          7
				if(jsontoken == JsonToken.END_OBJECT)
					break;
	//   17   34:aload           7
	//   18   36:getstatic       #47  <Field JsonToken JsonToken.END_OBJECT>
	//   19   39:if_acmpeq       186
				String s2 = jsonparser.getCurrentName();
	//   20   42:aload_1         
	//   21   43:invokevirtual   #51  <Method String JsonParser.getCurrentName()>
	//   22   46:astore          8
				if("className".equals(((Object) (s2))))
	//*  23   48:ldc1            #53  <String "className">
	//*  24   50:aload           8
	//*  25   52:invokevirtual   #59  <Method boolean String.equals(Object)>
	//*  26   55:ifeq            67
					s1 = jsonparser.getText();
	//   27   58:aload_1         
	//   28   59:invokevirtual   #62  <Method String JsonParser.getText()>
	//   29   62:astore          6
				else
	//*  30   64:goto            28
				if("fileName".equals(((Object) (s2))))
	//*  31   67:ldc1            #64  <String "fileName">
	//*  32   69:aload           8
	//*  33   71:invokevirtual   #59  <Method boolean String.equals(Object)>
	//*  34   74:ifeq            86
					s = jsonparser.getText();
	//   35   77:aload_1         
	//   36   78:invokevirtual   #62  <Method String JsonParser.getText()>
	//   37   81:astore          5
				else
	//*  38   83:goto            28
				if("lineNumber".equals(((Object) (s2))))
	//*  39   86:ldc1            #66  <String "lineNumber">
	//*  40   88:aload           8
	//*  41   90:invokevirtual   #59  <Method boolean String.equals(Object)>
	//*  42   93:ifeq            142
				{
					if(jsontoken.isNumeric())
	//*  43   96:aload           7
	//*  44   98:invokevirtual   #70  <Method boolean JsonToken.isNumeric()>
	//*  45  101:ifeq            112
						i = jsonparser.getIntValue();
	//   46  104:aload_1         
	//   47  105:invokevirtual   #74  <Method int JsonParser.getIntValue()>
	//   48  108:istore_3        
					else
	//*  49  109:goto            28
						throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Non-numeric token (").append(((Object) (jsontoken))).append(") for property 'lineNumber'").toString());
	//   50  112:aload_1         
	//   51  113:new             #76  <Class StringBuilder>
	//   52  116:dup             
	//   53  117:invokespecial   #78  <Method void StringBuilder()>
	//   54  120:ldc1            #80  <String "Non-numeric token (">
	//   55  122:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   56  125:aload           7
	//   57  127:invokevirtual   #87  <Method StringBuilder StringBuilder.append(Object)>
	//   58  130:ldc1            #89  <String ") for property 'lineNumber'">
	//   59  132:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   60  135:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   61  138:invokestatic    #98  <Method JsonMappingException JsonMappingException.from(JsonParser, String)>
	//   62  141:athrow          
				} else
				if("methodName".equals(((Object) (s2))))
	//*  63  142:ldc1            #100 <String "methodName">
	//*  64  144:aload           8
	//*  65  146:invokevirtual   #59  <Method boolean String.equals(Object)>
	//*  66  149:ifeq            161
					obj = ((Object) (jsonparser.getText()));
	//   67  152:aload_1         
	//   68  153:invokevirtual   #62  <Method String JsonParser.getText()>
	//   69  156:astore          4
				else
	//*  70  158:goto            28
				if(!"nativeMethod".equals(((Object) (s2))))
	//*  71  161:ldc1            #102 <String "nativeMethod">
	//*  72  163:aload           8
	//*  73  165:invokevirtual   #59  <Method boolean String.equals(Object)>
	//*  74  168:ifne            28
					handleUnknownProperty(jsonparser, deserializationcontext, ((Object) (_valueClass)), s2);
	//   75  171:aload_0         
	//   76  172:aload_1         
	//   77  173:aload_2         
	//   78  174:aload_0         
	//   79  175:getfield        #106 <Field Class _valueClass>
	//   80  178:aload           8
	//   81  180:invokevirtual   #110 <Method void handleUnknownProperty(JsonParser, DeserializationContext, Object, String)>
			} while(true);
	//   82  183:goto            28
			obj = ((Object) (new StackTraceElement(s1, ((String) (obj)), s, i)));
	//   83  186:new             #13  <Class StackTraceElement>
	//   84  189:dup             
	//   85  190:aload           6
	//   86  192:aload           4
	//   87  194:aload           5
	//   88  196:iload_3         
	//   89  197:invokespecial   #113 <Method void StackTraceElement(String, String, String, int)>
	//   90  200:astore          4
		} else
	//*  91  202:aload           4
	//*  92  204:areturn         
		if(obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
	//*  93  205:aload           4
	//*  94  207:getstatic       #116 <Field JsonToken JsonToken.START_ARRAY>
	//*  95  210:if_acmpne       257
	//*  96  213:aload_2         
	//*  97  214:getstatic       #122 <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//*  98  217:invokevirtual   #128 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  99  220:ifeq            257
		{
			jsonparser.nextToken();
	//  100  223:aload_1         
	//  101  224:invokevirtual   #131 <Method JsonToken JsonParser.nextToken()>
	//  102  227:pop             
			obj = ((Object) (deserialize(jsonparser, deserializationcontext)));
	//  103  228:aload_0         
	//  104  229:aload_1         
	//  105  230:aload_2         
	//  106  231:invokevirtual   #26  <Method StackTraceElement deserialize(JsonParser, DeserializationContext)>
	//  107  234:astore          4
			if(jsonparser.nextToken() != JsonToken.END_ARRAY)
	//* 108  236:aload_1         
	//* 109  237:invokevirtual   #131 <Method JsonToken JsonParser.nextToken()>
	//* 110  240:getstatic       #134 <Field JsonToken JsonToken.END_ARRAY>
	//* 111  243:if_acmpeq       202
				throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'java.lang.StackTraceElement' value but there was more than a single value in the array");
	//  112  246:aload_2         
	//  113  247:aload_1         
	//  114  248:getstatic       #134 <Field JsonToken JsonToken.END_ARRAY>
	//  115  251:ldc1            #136 <String "Attempted to unwrap single value array for single 'java.lang.StackTraceElement' value but there was more than a single value in the array">
	//  116  253:invokevirtual   #140 <Method JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//  117  256:athrow          
		} else
		{
			throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
	//  118  257:aload_2         
	//  119  258:aload_0         
	//  120  259:getfield        #106 <Field Class _valueClass>
	//  121  262:aload           4
	//  122  264:invokevirtual   #144 <Method JsonMappingException DeserializationContext.mappingException(Class, JsonToken)>
	//  123  267:athrow          
		}
		return ((StackTraceElement) (obj));
	}

	private static final long serialVersionUID = 1L;
}
