// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.File;
import java.io.IOException;
import java.net.*;
import java.nio.charset.Charset;
import java.util.*;
import java.util.regex.Pattern;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdScalarDeserializer

public abstract class FromStringDeserializer extends StdScalarDeserializer
{
	public static class Std extends FromStringDeserializer
	{

		protected Object _deserialize(String s, DeserializationContext deserializationcontext)
			throws IOException
		{
			switch(_kind)
		//*   0    0:aload_0         
		//*   1    1:getfield        #43  <Field int _kind>
			{
		//*   2    4:tableswitch     1 12: default 68
		//		               1 76
		//		               2 85
		//		               3 94
		//		               4 99
		//		               5 121
		//		               6 130
		//		               7 135
		//		               8 140
		//		               9 218
		//		               10 223
		//		               11 228
		//		               12 233
			default:
				throw new IllegalArgumentException();
		//    3   68:new             #54  <Class IllegalArgumentException>
		//    4   71:dup             
		//    5   72:invokespecial   #57  <Method void IllegalArgumentException()>
		//    6   75:athrow          

			case 1: // '\001'
				return ((Object) (new File(s)));
		//    7   76:new             #59  <Class File>
		//    8   79:dup             
		//    9   80:aload_1         
		//   10   81:invokespecial   #62  <Method void File(String)>
		//   11   84:areturn         

			case 2: // '\002'
				return ((Object) (new URL(s)));
		//   12   85:new             #64  <Class URL>
		//   13   88:dup             
		//   14   89:aload_1         
		//   15   90:invokespecial   #65  <Method void URL(String)>
		//   16   93:areturn         

			case 3: // '\003'
				return ((Object) (URI.create(s)));
		//   17   94:aload_1         
		//   18   95:invokestatic    #71  <Method URI URI.create(String)>
		//   19   98:areturn         

			case 4: // '\004'
				try
				{
					s = ((String) (deserializationcontext.findClass(s)));
		//   20   99:aload_2         
		//   21  100:aload_1         
		//   22  101:invokevirtual   #77  <Method Class DeserializationContext.findClass(String)>
		//   23  104:astore_1        
				}
		//*  24  105:aload_1         
		//*  25  106:areturn         
				// Misplaced declaration of an exception variable
				catch(String s)
		//*  26  107:astore_1        
				{
					throw deserializationcontext.instantiationException(_valueClass, ClassUtil.getRootCause(((Throwable) (s))));
		//   27  108:aload_2         
		//   28  109:aload_0         
		//   29  110:getfield        #81  <Field Class _valueClass>
		//   30  113:aload_1         
		//   31  114:invokestatic    #87  <Method Throwable ClassUtil.getRootCause(Throwable)>
		//   32  117:invokevirtual   #91  <Method JsonMappingException DeserializationContext.instantiationException(Class, Throwable)>
		//   33  120:athrow          
				}
				return ((Object) (s));

			case 5: // '\005'
				return ((Object) (deserializationcontext.getTypeFactory().constructFromCanonical(s)));
		//   34  121:aload_2         
		//   35  122:invokevirtual   #95  <Method TypeFactory DeserializationContext.getTypeFactory()>
		//   36  125:aload_1         
		//   37  126:invokevirtual   #101 <Method JavaType TypeFactory.constructFromCanonical(String)>
		//   38  129:areturn         

			case 6: // '\006'
				return ((Object) (Currency.getInstance(s)));
		//   39  130:aload_1         
		//   40  131:invokestatic    #107 <Method Currency Currency.getInstance(String)>
		//   41  134:areturn         

			case 7: // '\007'
				return ((Object) (Pattern.compile(s)));
		//   42  135:aload_1         
		//   43  136:invokestatic    #113 <Method Pattern Pattern.compile(String)>
		//   44  139:areturn         

			case 8: // '\b'
				int i = s.indexOf('_');
		//   45  140:aload_1         
		//   46  141:bipush          95
		//   47  143:invokevirtual   #119 <Method int String.indexOf(int)>
		//   48  146:istore_3        
				if(i < 0)
		//*  49  147:iload_3         
		//*  50  148:ifge            160
					return ((Object) (new Locale(s)));
		//   51  151:new             #121 <Class Locale>
		//   52  154:dup             
		//   53  155:aload_1         
		//   54  156:invokespecial   #122 <Method void Locale(String)>
		//   55  159:areturn         
				deserializationcontext = ((DeserializationContext) (s.substring(0, i)));
		//   56  160:aload_1         
		//   57  161:iconst_0        
		//   58  162:iload_3         
		//   59  163:invokevirtual   #126 <Method String String.substring(int, int)>
		//   60  166:astore_2        
				s = s.substring(i + 1);
		//   61  167:aload_1         
		//   62  168:iload_3         
		//   63  169:iconst_1        
		//   64  170:iadd            
		//   65  171:invokevirtual   #129 <Method String String.substring(int)>
		//   66  174:astore_1        
				i = s.indexOf('_');
		//   67  175:aload_1         
		//   68  176:bipush          95
		//   69  178:invokevirtual   #119 <Method int String.indexOf(int)>
		//   70  181:istore_3        
				if(i < 0)
		//*  71  182:iload_3         
		//*  72  183:ifge            196
					return ((Object) (new Locale(((String) (deserializationcontext)), s)));
		//   73  186:new             #121 <Class Locale>
		//   74  189:dup             
		//   75  190:aload_2         
		//   76  191:aload_1         
		//   77  192:invokespecial   #132 <Method void Locale(String, String)>
		//   78  195:areturn         
				else
					return ((Object) (new Locale(((String) (deserializationcontext)), s.substring(0, i), s.substring(i + 1))));
		//   79  196:new             #121 <Class Locale>
		//   80  199:dup             
		//   81  200:aload_2         
		//   82  201:aload_1         
		//   83  202:iconst_0        
		//   84  203:iload_3         
		//   85  204:invokevirtual   #126 <Method String String.substring(int, int)>
		//   86  207:aload_1         
		//   87  208:iload_3         
		//   88  209:iconst_1        
		//   89  210:iadd            
		//   90  211:invokevirtual   #129 <Method String String.substring(int)>
		//   91  214:invokespecial   #135 <Method void Locale(String, String, String)>
		//   92  217:areturn         

			case 9: // '\t'
				return ((Object) (Charset.forName(s)));
		//   93  218:aload_1         
		//   94  219:invokestatic    #141 <Method Charset Charset.forName(String)>
		//   95  222:areturn         

			case 10: // '\n'
				return ((Object) (TimeZone.getTimeZone(s)));
		//   96  223:aload_1         
		//   97  224:invokestatic    #147 <Method TimeZone TimeZone.getTimeZone(String)>
		//   98  227:areturn         

			case 11: // '\013'
				return ((Object) (InetAddress.getByName(s)));
		//   99  228:aload_1         
		//  100  229:invokestatic    #153 <Method InetAddress InetAddress.getByName(String)>
		//  101  232:areturn         

			case 12: // '\f'
				break;
			}
			if(s.startsWith("["))
		//* 102  233:aload_1         
		//* 103  234:ldc1            #155 <String "[">
		//* 104  236:invokevirtual   #159 <Method boolean String.startsWith(String)>
		//* 105  239:ifeq            321
			{
				int l = s.lastIndexOf(']');
		//  106  242:aload_1         
		//  107  243:bipush          93
		//  108  245:invokevirtual   #162 <Method int String.lastIndexOf(int)>
		//  109  248:istore          4
				if(l == -1)
		//* 110  250:iload           4
		//* 111  252:iconst_m1       
		//* 112  253:icmpne          273
					throw new InvalidFormatException(deserializationcontext.getParser(), "Bracketed IPv6 address must contain closing bracket", ((Object) (s)), java/net/InetSocketAddress);
		//  113  256:new             #164 <Class InvalidFormatException>
		//  114  259:dup             
		//  115  260:aload_2         
		//  116  261:invokevirtual   #168 <Method JsonParser DeserializationContext.getParser()>
		//  117  264:ldc1            #170 <String "Bracketed IPv6 address must contain closing bracket">
		//  118  266:aload_1         
		//  119  267:ldc1            #172 <Class InetSocketAddress>
		//  120  269:invokespecial   #175 <Method void InvalidFormatException(JsonParser, String, Object, Class)>
		//  121  272:athrow          
				int j = s.indexOf(':', l);
		//  122  273:aload_1         
		//  123  274:bipush          58
		//  124  276:iload           4
		//  125  278:invokevirtual   #178 <Method int String.indexOf(int, int)>
		//  126  281:istore_3        
				if(j > -1)
		//* 127  282:iload_3         
		//* 128  283:iconst_m1       
		//* 129  284:icmple          316
					j = Integer.parseInt(s.substring(j + 1));
		//  130  287:aload_1         
		//  131  288:iload_3         
		//  132  289:iconst_1        
		//  133  290:iadd            
		//  134  291:invokevirtual   #129 <Method String String.substring(int)>
		//  135  294:invokestatic    #184 <Method int Integer.parseInt(String)>
		//  136  297:istore_3        
				else
		//* 137  298:new             #172 <Class InetSocketAddress>
		//* 138  301:dup             
		//* 139  302:aload_1         
		//* 140  303:iconst_0        
		//* 141  304:iload           4
		//* 142  306:iconst_1        
		//* 143  307:iadd            
		//* 144  308:invokevirtual   #126 <Method String String.substring(int, int)>
		//* 145  311:iload_3         
		//* 146  312:invokespecial   #187 <Method void InetSocketAddress(String, int)>
		//* 147  315:areturn         
					j = 0;
		//  148  316:iconst_0        
		//  149  317:istore_3        
				return ((Object) (new InetSocketAddress(s.substring(0, l + 1), j)));
			}
		//* 150  318:goto            298
			int k = s.indexOf(':');
		//  151  321:aload_1         
		//  152  322:bipush          58
		//  153  324:invokevirtual   #119 <Method int String.indexOf(int)>
		//  154  327:istore_3        
			if(k >= 0 && s.indexOf(':', k + 1) < 0)
		//* 155  328:iload_3         
		//* 156  329:iflt            372
		//* 157  332:aload_1         
		//* 158  333:bipush          58
		//* 159  335:iload_3         
		//* 160  336:iconst_1        
		//* 161  337:iadd            
		//* 162  338:invokevirtual   #178 <Method int String.indexOf(int, int)>
		//* 163  341:ifge            372
			{
				int i1 = Integer.parseInt(s.substring(k + 1));
		//  164  344:aload_1         
		//  165  345:iload_3         
		//  166  346:iconst_1        
		//  167  347:iadd            
		//  168  348:invokevirtual   #129 <Method String String.substring(int)>
		//  169  351:invokestatic    #184 <Method int Integer.parseInt(String)>
		//  170  354:istore          4
				return ((Object) (new InetSocketAddress(s.substring(0, k), i1)));
		//  171  356:new             #172 <Class InetSocketAddress>
		//  172  359:dup             
		//  173  360:aload_1         
		//  174  361:iconst_0        
		//  175  362:iload_3         
		//  176  363:invokevirtual   #126 <Method String String.substring(int, int)>
		//  177  366:iload           4
		//  178  368:invokespecial   #187 <Method void InetSocketAddress(String, int)>
		//  179  371:areturn         
			} else
			{
				return ((Object) (new InetSocketAddress(s, 0)));
		//  180  372:new             #172 <Class InetSocketAddress>
		//  181  375:dup             
		//  182  376:aload_1         
		//  183  377:iconst_0        
		//  184  378:invokespecial   #187 <Method void InetSocketAddress(String, int)>
		//  185  381:areturn         
			}
		}

		protected Object _deserializeFromEmptyString()
			throws IOException
		{
			if(_kind == 3)
		//*   0    0:aload_0         
		//*   1    1:getfield        #43  <Field int _kind>
		//*   2    4:iconst_3        
		//*   3    5:icmpne          14
				return ((Object) (URI.create("")));
		//    4    8:ldc1            #192 <String "">
		//    5   10:invokestatic    #71  <Method URI URI.create(String)>
		//    6   13:areturn         
			if(_kind == 8)
		//*   7   14:aload_0         
		//*   8   15:getfield        #43  <Field int _kind>
		//*   9   18:bipush          8
		//*  10   20:icmpne          27
				return ((Object) (Locale.ROOT));
		//   11   23:getstatic       #196 <Field Locale Locale.ROOT>
		//   12   26:areturn         
			else
				return _deserializeFromEmptyString();
		//   13   27:aload_0         
		//   14   28:invokespecial   #198 <Method Object FromStringDeserializer._deserializeFromEmptyString()>
		//   15   31:areturn         
		}

		public static final int STD_CHARSET = 9;
		public static final int STD_CLASS = 4;
		public static final int STD_CURRENCY = 6;
		public static final int STD_FILE = 1;
		public static final int STD_INET_ADDRESS = 11;
		public static final int STD_INET_SOCKET_ADDRESS = 12;
		public static final int STD_JAVA_TYPE = 5;
		public static final int STD_LOCALE = 8;
		public static final int STD_PATTERN = 7;
		public static final int STD_TIME_ZONE = 10;
		public static final int STD_URI = 3;
		public static final int STD_URL = 2;
		private static final long serialVersionUID = 1L;
		protected final int _kind;

		protected Std(Class class1, int i)
		{
			super(class1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #41  <Method void FromStringDeserializer(Class)>
			_kind = i;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #43  <Field int _kind>
		//    6   10:return          
		}
	}


	protected FromStringDeserializer(Class class1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void StdScalarDeserializer(Class)>
	//    3    5:return          
	}

	public static Std findDeserializer(Class class1)
	{
		int i;
		if(class1 == java/io/File)
	//*   0    0:aload_0         
	//*   1    1:ldc1            #19  <Class File>
	//*   2    3:if_acmpne       18
			i = 1;
	//    3    6:iconst_1        
	//    4    7:istore_1        
		else
	//*   5    8:new             #7   <Class FromStringDeserializer$Std>
	//*   6   11:dup             
	//*   7   12:aload_0         
	//*   8   13:iload_1         
	//*   9   14:invokespecial   #22  <Method void FromStringDeserializer$Std(Class, int)>
	//*  10   17:areturn         
		if(class1 == java/net/URL)
	//*  11   18:aload_0         
	//*  12   19:ldc1            #24  <Class URL>
	//*  13   21:if_acmpne       29
			i = 2;
	//   14   24:iconst_2        
	//   15   25:istore_1        
		else
	//*  16   26:goto            8
		if(class1 == java/net/URI)
	//*  17   29:aload_0         
	//*  18   30:ldc1            #26  <Class URI>
	//*  19   32:if_acmpne       40
			i = 3;
	//   20   35:iconst_3        
	//   21   36:istore_1        
		else
	//*  22   37:goto            8
		if(class1 == java/lang/Class)
	//*  23   40:aload_0         
	//*  24   41:ldc1            #28  <Class Class>
	//*  25   43:if_acmpne       51
			i = 4;
	//   26   46:iconst_4        
	//   27   47:istore_1        
		else
	//*  28   48:goto            8
		if(class1 == com/fasterxml/jackson/databind/JavaType)
	//*  29   51:aload_0         
	//*  30   52:ldc1            #30  <Class JavaType>
	//*  31   54:if_acmpne       62
			i = 5;
	//   32   57:iconst_5        
	//   33   58:istore_1        
		else
	//*  34   59:goto            8
		if(class1 == java/util/Currency)
	//*  35   62:aload_0         
	//*  36   63:ldc1            #32  <Class Currency>
	//*  37   65:if_acmpne       74
			i = 6;
	//   38   68:bipush          6
	//   39   70:istore_1        
		else
	//*  40   71:goto            8
		if(class1 == java/util/regex/Pattern)
	//*  41   74:aload_0         
	//*  42   75:ldc1            #34  <Class Pattern>
	//*  43   77:if_acmpne       86
			i = 7;
	//   44   80:bipush          7
	//   45   82:istore_1        
		else
	//*  46   83:goto            8
		if(class1 == java/util/Locale)
	//*  47   86:aload_0         
	//*  48   87:ldc1            #36  <Class Locale>
	//*  49   89:if_acmpne       98
			i = 8;
	//   50   92:bipush          8
	//   51   94:istore_1        
		else
	//*  52   95:goto            8
		if(class1 == java/nio/charset/Charset)
	//*  53   98:aload_0         
	//*  54   99:ldc1            #38  <Class Charset>
	//*  55  101:if_acmpne       110
			i = 9;
	//   56  104:bipush          9
	//   57  106:istore_1        
		else
	//*  58  107:goto            8
		if(class1 == java/util/TimeZone)
	//*  59  110:aload_0         
	//*  60  111:ldc1            #40  <Class TimeZone>
	//*  61  113:if_acmpne       122
			i = 10;
	//   62  116:bipush          10
	//   63  118:istore_1        
		else
	//*  64  119:goto            8
		if(class1 == java/net/InetAddress)
	//*  65  122:aload_0         
	//*  66  123:ldc1            #42  <Class InetAddress>
	//*  67  125:if_acmpne       134
			i = 11;
	//   68  128:bipush          11
	//   69  130:istore_1        
		else
	//*  70  131:goto            8
		if(class1 == java/net/InetSocketAddress)
	//*  71  134:aload_0         
	//*  72  135:ldc1            #44  <Class InetSocketAddress>
	//*  73  137:if_acmpne       146
			i = 12;
	//   74  140:bipush          12
	//   75  142:istore_1        
		else
	//*  76  143:goto            8
			return null;
	//   77  146:aconst_null     
	//   78  147:areturn         
		return new Std(class1, i);
	}

	public static Class[] types()
	{
		return (new Class[] {
			java/io/File, java/net/URL, java/net/URI, java/lang/Class, com/fasterxml/jackson/databind/JavaType, java/util/Currency, java/util/regex/Pattern, java/util/Locale, java/nio/charset/Charset, java/util/TimeZone, 
			java/net/InetAddress, java/net/InetSocketAddress
		});
	//    0    0:bipush          12
	//    1    2:anewarray       Class[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #19  <Class File>
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #24  <Class URL>
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #26  <Class URI>
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #28  <Class Class>
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #30  <Class JavaType>
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #32  <Class Currency>
	//   25   34:aastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #34  <Class Pattern>
	//   29   40:aastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #36  <Class Locale>
	//   33   46:aastore         
	//   34   47:dup             
	//   35   48:bipush          8
	//   36   50:ldc1            #38  <Class Charset>
	//   37   52:aastore         
	//   38   53:dup             
	//   39   54:bipush          9
	//   40   56:ldc1            #40  <Class TimeZone>
	//   41   58:aastore         
	//   42   59:dup             
	//   43   60:bipush          10
	//   44   62:ldc1            #42  <Class InetAddress>
	//   45   64:aastore         
	//   46   65:dup             
	//   47   66:bipush          11
	//   48   68:ldc1            #44  <Class InetSocketAddress>
	//   49   70:aastore         
	//   50   71:areturn         
	}

	protected abstract Object _deserialize(String s, DeserializationContext deserializationcontext)
		throws IOException;

	protected Object _deserializeEmbedded(Object obj, DeserializationContext deserializationcontext)
		throws IOException
	{
		throw deserializationcontext.mappingException("Don't know how to convert embedded Object of type %s into %s", new Object[] {
			obj.getClass().getName(), _valueClass.getName()
		});
	//    0    0:aload_2         
	//    1    1:ldc1            #56  <String "Don't know how to convert embedded Object of type %s into %s">
	//    2    3:iconst_2        
	//    3    4:anewarray       Object[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:aload_1         
	//    7   10:invokevirtual   #62  <Method Class Object.getClass()>
	//    8   13:invokevirtual   #66  <Method String Class.getName()>
	//    9   16:aastore         
	//   10   17:dup             
	//   11   18:iconst_1        
	//   12   19:aload_0         
	//   13   20:getfield        #70  <Field Class _valueClass>
	//   14   23:invokevirtual   #66  <Method String Class.getName()>
	//   15   26:aastore         
	//   16   27:invokevirtual   #76  <Method JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   17   30:athrow          
	}

	protected Object _deserializeFromEmptyString()
		throws IOException
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
label0:
		{
			String s2;
label1:
			{
				Object obj;
				if(jsonparser.getCurrentToken() == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #91  <Method JsonToken JsonParser.getCurrentToken()>
	//*   2    4:getstatic       #97  <Field JsonToken JsonToken.START_ARRAY>
	//*   3    7:if_acmpne       81
	//*   4   10:aload_2         
	//*   5   11:getstatic       #103 <Field DeserializationFeature DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS>
	//*   6   14:invokevirtual   #107 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*   7   17:ifeq            81
				{
					jsonparser.nextToken();
	//    8   20:aload_1         
	//    9   21:invokevirtual   #110 <Method JsonToken JsonParser.nextToken()>
	//   10   24:pop             
					obj = deserialize(jsonparser, deserializationcontext);
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:aload_2         
	//   14   28:invokevirtual   #112 <Method Object deserialize(JsonParser, DeserializationContext)>
	//   15   31:astore_3        
					if(jsonparser.nextToken() != JsonToken.END_ARRAY)
	//*  16   32:aload_1         
	//*  17   33:invokevirtual   #110 <Method JsonToken JsonParser.nextToken()>
	//*  18   36:getstatic       #115 <Field JsonToken JsonToken.END_ARRAY>
	//*  19   39:if_acmpeq       116
						throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, (new StringBuilder()).append("Attempted to unwrap single value array for single '").append(_valueClass.getName()).append("' value but there was more than a single value in the array").toString());
	//   20   42:aload_2         
	//   21   43:aload_1         
	//   22   44:getstatic       #115 <Field JsonToken JsonToken.END_ARRAY>
	//   23   47:new             #117 <Class StringBuilder>
	//   24   50:dup             
	//   25   51:invokespecial   #120 <Method void StringBuilder()>
	//   26   54:ldc1            #122 <String "Attempted to unwrap single value array for single '">
	//   27   56:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   28   59:aload_0         
	//   29   60:getfield        #70  <Field Class _valueClass>
	//   30   63:invokevirtual   #66  <Method String Class.getName()>
	//   31   66:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   32   69:ldc1            #128 <String "' value but there was more than a single value in the array">
	//   33   71:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   34   74:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   35   77:invokevirtual   #135 <Method JsonMappingException DeserializationContext.wrongTokenException(JsonParser, JsonToken, String)>
	//   36   80:athrow          
				} else
				{
					obj = ((Object) (jsonparser.getValueAsString()));
	//   37   81:aload_1         
	//   38   82:invokevirtual   #138 <Method String JsonParser.getValueAsString()>
	//   39   85:astore_3        
					if(obj == null)
						break label0;
	//   40   86:aload_3         
	//   41   87:ifnull          210
					if(((String) (obj)).length() != 0)
	//*  42   90:aload_3         
	//*  43   91:invokevirtual   #144 <Method int String.length()>
	//*  44   94:ifeq            111
					{
						s2 = ((String) (obj)).trim();
	//   45   97:aload_3         
	//   46   98:invokevirtual   #147 <Method String String.trim()>
	//   47  101:astore          5
						if(s2.length() != 0)
							break label1;
	//   48  103:aload           5
	//   49  105:invokevirtual   #144 <Method int String.length()>
	//   50  108:ifne            118
					}
					obj = _deserializeFromEmptyString();
	//   51  111:aload_0         
	//   52  112:invokevirtual   #149 <Method Object _deserializeFromEmptyString()>
	//   53  115:astore_3        
				}
				return obj;
	//   54  116:aload_3         
	//   55  117:areturn         
			}
			jsonparser = null;
	//   56  118:aconst_null     
	//   57  119:astore_1        
			Object obj1;
			try
			{
				obj1 = _deserialize(s2, deserializationcontext);
	//   58  120:aload_0         
	//   59  121:aload           5
	//   60  123:aload_2         
	//   61  124:invokevirtual   #151 <Method Object _deserialize(String, DeserializationContext)>
	//   62  127:astore_3        
			}
	//*  63  128:aload_3         
	//*  64  129:ifnull          135
	//*  65  132:aload_3         
	//*  66  133:areturn         
			// Misplaced declaration of an exception variable
			catch(JsonParser jsonparser)
	//*  67  134:astore_1        
			{
				String s1 = "not a valid textual representation";
	//   68  135:ldc1            #153 <String "not a valid textual representation">
	//   69  137:astore          4
				String s = s1;
	//   70  139:aload           4
	//   71  141:astore_3        
				if(jsonparser != null)
	//*  72  142:aload_1         
	//*  73  143:ifnull          186
				{
					String s3 = ((Exception) (jsonparser)).getMessage();
	//   74  146:aload_1         
	//   75  147:invokevirtual   #158 <Method String Exception.getMessage()>
	//   76  150:astore          6
					s = s1;
	//   77  152:aload           4
	//   78  154:astore_3        
					if(s3 != null)
	//*  79  155:aload           6
	//*  80  157:ifnull          186
						s = (new StringBuilder()).append("not a valid textual representation").append(", problem: ").append(s3).toString();
	//   81  160:new             #117 <Class StringBuilder>
	//   82  163:dup             
	//   83  164:invokespecial   #120 <Method void StringBuilder()>
	//   84  167:ldc1            #153 <String "not a valid textual representation">
	//   85  169:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   86  172:ldc1            #160 <String ", problem: ">
	//   87  174:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   88  177:aload           6
	//   89  179:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   90  182:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   91  185:astore_3        
				}
				deserializationcontext = ((DeserializationContext) (deserializationcontext.weirdStringException(s2, _valueClass, s)));
	//   92  186:aload_2         
	//   93  187:aload           5
	//   94  189:aload_0         
	//   95  190:getfield        #70  <Field Class _valueClass>
	//   96  193:aload_3         
	//   97  194:invokevirtual   #164 <Method JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
	//   98  197:astore_2        
				if(jsonparser != null)
	//*  99  198:aload_1         
	//* 100  199:ifnull          208
					((JsonMappingException) (deserializationcontext)).initCause(((Throwable) (jsonparser)));
	//  101  202:aload_2         
	//  102  203:aload_1         
	//  103  204:invokevirtual   #170 <Method Throwable JsonMappingException.initCause(Throwable)>
	//  104  207:pop             
				throw deserializationcontext;
	//  105  208:aload_2         
	//  106  209:athrow          
			}
label2:
			{
				if(obj1 != null)
					return obj1;
				break label2;
			}
		}
		if(jsonparser.getCurrentToken() == JsonToken.VALUE_EMBEDDED_OBJECT)
	//* 107  210:aload_1         
	//* 108  211:invokevirtual   #91  <Method JsonToken JsonParser.getCurrentToken()>
	//* 109  214:getstatic       #173 <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//* 110  217:if_acmpne       254
		{
			jsonparser = ((JsonParser) (jsonparser.getEmbeddedObject()));
	//  111  220:aload_1         
	//  112  221:invokevirtual   #176 <Method Object JsonParser.getEmbeddedObject()>
	//  113  224:astore_1        
			if(jsonparser == null)
	//* 114  225:aload_1         
	//* 115  226:ifnonnull       231
				return ((Object) (null));
	//  116  229:aconst_null     
	//  117  230:areturn         
			if(_valueClass.isAssignableFrom(((Object) (jsonparser)).getClass()))
	//* 118  231:aload_0         
	//* 119  232:getfield        #70  <Field Class _valueClass>
	//* 120  235:aload_1         
	//* 121  236:invokevirtual   #62  <Method Class Object.getClass()>
	//* 122  239:invokevirtual   #180 <Method boolean Class.isAssignableFrom(Class)>
	//* 123  242:ifeq            247
				return ((Object) (jsonparser));
	//  124  245:aload_1         
	//  125  246:areturn         
			else
				return _deserializeEmbedded(((Object) (jsonparser)), deserializationcontext);
	//  126  247:aload_0         
	//  127  248:aload_1         
	//  128  249:aload_2         
	//  129  250:invokevirtual   #182 <Method Object _deserializeEmbedded(Object, DeserializationContext)>
	//  130  253:areturn         
		} else
		{
			throw deserializationcontext.mappingException(_valueClass);
	//  131  254:aload_2         
	//  132  255:aload_0         
	//  133  256:getfield        #70  <Field Class _valueClass>
	//  134  259:invokevirtual   #185 <Method JsonMappingException DeserializationContext.mappingException(Class)>
	//  135  262:athrow          
		}
	}
}
