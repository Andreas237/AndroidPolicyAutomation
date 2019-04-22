// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
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

	protected StackTraceElement constructValue(DeserializationContext deserializationcontext, String s, String s1, String s2, int i, String s3, String s4, 
			String s5)
	{
		return new StackTraceElement(s, s1, s2, i);
	//    0    0:new             #13  <Class StackTraceElement>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:aload_3         
	//    4    6:aload           4
	//    5    8:iload           5
	//    6   10:invokespecial   #22  <Method void StackTraceElement(String, String, String, int)>
	//    7   13:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #31  <Method StackTraceElement deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public StackTraceElement deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		Object obj = ((Object) (jsonparser.getCurrentToken()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #38  <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore          4
		if(obj == JsonToken.START_OBJECT)
	//*   3    6:aload           4
	//*   4    8:getstatic       #44  <Field JsonToken JsonToken.START_OBJECT>
	//*   5   11:if_acmpne       273
		{
			String s4 = "";
	//    6   14:ldc1            #46  <String "">
	//    7   16:astore          9
			String s3 = "";
	//    8   18:ldc1            #46  <String "">
	//    9   20:astore          8
			String s2 = "";
	//   10   22:ldc1            #46  <String "">
	//   11   24:astore          7
			int i = -1;
	//   12   26:iconst_m1       
	//   13   27:istore_3        
			String s1 = null;
	//   14   28:aconst_null     
	//   15   29:astore          6
			String s = null;
	//   16   31:aconst_null     
	//   17   32:astore          5
			obj = ((Object) (s));
	//   18   34:aload           5
	//   19   36:astore          4
			do
			{
				JsonToken jsontoken = jsonparser.nextValue();
	//   20   38:aload_1         
	//   21   39:invokevirtual   #49  <Method JsonToken JsonParser.nextValue()>
	//   22   42:astore          10
				if(jsontoken != JsonToken.END_OBJECT)
	//*  23   44:aload           10
	//*  24   46:getstatic       #52  <Field JsonToken JsonToken.END_OBJECT>
	//*  25   49:if_acmpeq       254
				{
					String s5 = jsonparser.getCurrentName();
	//   26   52:aload_1         
	//   27   53:invokevirtual   #56  <Method String JsonParser.getCurrentName()>
	//   28   56:astore          11
					if("className".equals(((Object) (s5))))
	//*  29   58:ldc1            #58  <String "className">
	//*  30   60:aload           11
	//*  31   62:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  32   65:ifeq            77
						s4 = jsonparser.getText();
	//   33   68:aload_1         
	//   34   69:invokevirtual   #67  <Method String JsonParser.getText()>
	//   35   72:astore          9
					else
	//*  36   74:goto            246
					if("classLoaderName".equals(((Object) (s5))))
	//*  37   77:ldc1            #69  <String "classLoaderName">
	//*  38   79:aload           11
	//*  39   81:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  40   84:ifeq            96
						obj = ((Object) (jsonparser.getText()));
	//   41   87:aload_1         
	//   42   88:invokevirtual   #67  <Method String JsonParser.getText()>
	//   43   91:astore          4
					else
	//*  44   93:goto            246
					if("fileName".equals(((Object) (s5))))
	//*  45   96:ldc1            #71  <String "fileName">
	//*  46   98:aload           11
	//*  47  100:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  48  103:ifeq            115
						s2 = jsonparser.getText();
	//   49  106:aload_1         
	//   50  107:invokevirtual   #67  <Method String JsonParser.getText()>
	//   51  110:astore          7
					else
	//*  52  112:goto            246
					if("lineNumber".equals(((Object) (s5))))
	//*  53  115:ldc1            #73  <String "lineNumber">
	//*  54  117:aload           11
	//*  55  119:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  56  122:ifeq            151
					{
						if(jsontoken.isNumeric())
	//*  57  125:aload           10
	//*  58  127:invokevirtual   #77  <Method boolean JsonToken.isNumeric()>
	//*  59  130:ifeq            141
							i = jsonparser.getIntValue();
	//   60  133:aload_1         
	//   61  134:invokevirtual   #81  <Method int JsonParser.getIntValue()>
	//   62  137:istore_3        
						else
	//*  63  138:goto            246
							i = _parseIntPrimitive(jsonparser, deserializationcontext);
	//   64  141:aload_0         
	//   65  142:aload_1         
	//   66  143:aload_2         
	//   67  144:invokevirtual   #85  <Method int _parseIntPrimitive(JsonParser, DeserializationContext)>
	//   68  147:istore_3        
					} else
	//*  69  148:goto            246
					if("methodName".equals(((Object) (s5))))
	//*  70  151:ldc1            #87  <String "methodName">
	//*  71  153:aload           11
	//*  72  155:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  73  158:ifeq            170
						s3 = jsonparser.getText();
	//   74  161:aload_1         
	//   75  162:invokevirtual   #67  <Method String JsonParser.getText()>
	//   76  165:astore          8
					else
	//*  77  167:goto            246
					if(!"nativeMethod".equals(((Object) (s5))))
	//*  78  170:ldc1            #89  <String "nativeMethod">
	//*  79  172:aload           11
	//*  80  174:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  81  177:ifeq            183
	//*  82  180:goto            246
						if("moduleName".equals(((Object) (s5))))
	//*  83  183:ldc1            #91  <String "moduleName">
	//*  84  185:aload           11
	//*  85  187:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  86  190:ifeq            202
							s1 = jsonparser.getText();
	//   87  193:aload_1         
	//   88  194:invokevirtual   #67  <Method String JsonParser.getText()>
	//   89  197:astore          6
						else
	//*  90  199:goto            246
						if("moduleVersion".equals(((Object) (s5))))
	//*  91  202:ldc1            #93  <String "moduleVersion">
	//*  92  204:aload           11
	//*  93  206:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  94  209:ifeq            221
							s = jsonparser.getText();
	//   95  212:aload_1         
	//   96  213:invokevirtual   #67  <Method String JsonParser.getText()>
	//   97  216:astore          5
						else
	//*  98  218:goto            246
						if(!"declaringClass".equals(((Object) (s5))))
	//*  99  221:ldc1            #95  <String "declaringClass">
	//* 100  223:aload           11
	//* 101  225:invokevirtual   #64  <Method boolean String.equals(Object)>
	//* 102  228:ifeq            234
	//* 103  231:goto            246
							handleUnknownProperty(jsonparser, deserializationcontext, ((Object) (_valueClass)), s5);
	//  104  234:aload_0         
	//  105  235:aload_1         
	//  106  236:aload_2         
	//  107  237:aload_0         
	//  108  238:getfield        #99  <Field Class _valueClass>
	//  109  241:aload           11
	//  110  243:invokevirtual   #103 <Method void handleUnknownProperty(JsonParser, DeserializationContext, Object, String)>
					jsonparser.skipChildren();
	//  111  246:aload_1         
	//  112  247:invokevirtual   #107 <Method JsonParser JsonParser.skipChildren()>
	//  113  250:pop             
				} else
	//* 114  251:goto            38
				{
					return constructValue(deserializationcontext, s4, s3, s2, i, s1, s, ((String) (obj)));
	//  115  254:aload_0         
	//  116  255:aload_2         
	//  117  256:aload           9
	//  118  258:aload           8
	//  119  260:aload           7
	//  120  262:iload_3         
	//  121  263:aload           6
	//  122  265:aload           5
	//  123  267:aload           4
	//  124  269:invokevirtual   #109 <Method StackTraceElement constructValue(DeserializationContext, String, String, String, int, String, String, String)>
	//  125  272:areturn         
				}
			} while(true);
		}
		if(obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
	//* 126  273:aload           4
	//* 127  275:getstatic       #112 <Field JsonToken JsonToken.START_ARRAY>
	//* 128  278:if_acmpne       323
	//* 129  281:aload_2         
	//* 130  282:getstatic       #118 <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//* 131  285:invokevirtual   #124 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//* 132  288:ifeq            323
		{
			jsonparser.nextToken();
	//  133  291:aload_1         
	//  134  292:invokevirtual   #127 <Method JsonToken JsonParser.nextToken()>
	//  135  295:pop             
			StackTraceElement stacktraceelement = deserialize(jsonparser, deserializationcontext);
	//  136  296:aload_0         
	//  137  297:aload_1         
	//  138  298:aload_2         
	//  139  299:invokevirtual   #31  <Method StackTraceElement deserialize(JsonParser, DeserializationContext)>
	//  140  302:astore          4
			if(jsonparser.nextToken() != JsonToken.END_ARRAY)
	//* 141  304:aload_1         
	//* 142  305:invokevirtual   #127 <Method JsonToken JsonParser.nextToken()>
	//* 143  308:getstatic       #130 <Field JsonToken JsonToken.END_ARRAY>
	//* 144  311:if_acmpeq       320
				handleMissingEndArrayForSingle(jsonparser, deserializationcontext);
	//  145  314:aload_0         
	//  146  315:aload_1         
	//  147  316:aload_2         
	//  148  317:invokevirtual   #134 <Method void handleMissingEndArrayForSingle(JsonParser, DeserializationContext)>
			return stacktraceelement;
	//  149  320:aload           4
	//  150  322:areturn         
		} else
		{
			return (StackTraceElement)deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser);
	//  151  323:aload_2         
	//  152  324:aload_0         
	//  153  325:getfield        #99  <Field Class _valueClass>
	//  154  328:aload_1         
	//  155  329:invokevirtual   #138 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//  156  332:checkcast       #13  <Class StackTraceElement>
	//  157  335:areturn         
		}
	}

	private static final long serialVersionUID = 1L;
}
