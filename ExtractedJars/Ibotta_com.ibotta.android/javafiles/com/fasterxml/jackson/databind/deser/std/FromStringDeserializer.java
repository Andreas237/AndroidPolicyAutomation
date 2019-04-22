// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.VersionUtil;
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
		//*   1    1:getfield        #19  <Field int _kind>
			{
		//*   2    4:tableswitch     1 13: default 72
		//		               1 389
		//		               2 380
		//		               3 375
		//		               4 348
		//		               5 339
		//		               6 334
		//		               7 329
		//		               8 253
		//		               9 248
		//		               10 243
		//		               11 238
		//		               12 86
		//		               13 77
			default:
				VersionUtil.throwInternal();
		//    3   72:invokestatic    #34  <Method void VersionUtil.throwInternal()>
				return ((Object) (null));
		//    4   75:aconst_null     
		//    5   76:areturn         

			case 13: // '\r'
				return ((Object) (new StringBuilder(s)));
		//    6   77:new             #36  <Class StringBuilder>
		//    7   80:dup             
		//    8   81:aload_1         
		//    9   82:invokespecial   #39  <Method void StringBuilder(String)>
		//   10   85:areturn         

			case 12: // '\f'
				if(s.startsWith("["))
		//*  11   86:aload_1         
		//*  12   87:ldc1            #41  <String "[">
		//*  13   89:invokevirtual   #47  <Method boolean String.startsWith(String)>
		//*  14   92:ifeq            174
				{
					int l = s.lastIndexOf(']');
		//   15   95:aload_1         
		//   16   96:bipush          93
		//   17   98:invokevirtual   #51  <Method int String.lastIndexOf(int)>
		//   18  101:istore          4
					if(l != -1)
		//*  19  103:iload           4
		//*  20  105:iconst_m1       
		//*  21  106:icmpeq          157
					{
						int i = s.indexOf(':', l);
		//   22  109:aload_1         
		//   23  110:bipush          58
		//   24  112:iload           4
		//   25  114:invokevirtual   #55  <Method int String.indexOf(int, int)>
		//   26  117:istore_3        
						if(i > -1)
		//*  27  118:iload_3         
		//*  28  119:iconst_m1       
		//*  29  120:icmple          137
							i = Integer.parseInt(s.substring(i + 1));
		//   30  123:aload_1         
		//   31  124:iload_3         
		//   32  125:iconst_1        
		//   33  126:iadd            
		//   34  127:invokevirtual   #59  <Method String String.substring(int)>
		//   35  130:invokestatic    #65  <Method int Integer.parseInt(String)>
		//   36  133:istore_3        
						else
		//*  37  134:goto            139
							i = 0;
		//   38  137:iconst_0        
		//   39  138:istore_3        
						return ((Object) (new InetSocketAddress(s.substring(0, l + 1), i)));
		//   40  139:new             #67  <Class InetSocketAddress>
		//   41  142:dup             
		//   42  143:aload_1         
		//   43  144:iconst_0        
		//   44  145:iload           4
		//   45  147:iconst_1        
		//   46  148:iadd            
		//   47  149:invokevirtual   #70  <Method String String.substring(int, int)>
		//   48  152:iload_3         
		//   49  153:invokespecial   #73  <Method void InetSocketAddress(String, int)>
		//   50  156:areturn         
					} else
					{
						throw new InvalidFormatException(deserializationcontext.getParser(), "Bracketed IPv6 address must contain closing bracket", ((Object) (s)), java/net/InetSocketAddress);
		//   51  157:new             #75  <Class InvalidFormatException>
		//   52  160:dup             
		//   53  161:aload_2         
		//   54  162:invokevirtual   #81  <Method JsonParser DeserializationContext.getParser()>
		//   55  165:ldc1            #83  <String "Bracketed IPv6 address must contain closing bracket">
		//   56  167:aload_1         
		//   57  168:ldc1            #67  <Class InetSocketAddress>
		//   58  170:invokespecial   #86  <Method void InvalidFormatException(JsonParser, String, Object, Class)>
		//   59  173:athrow          
					}
				}
				int j = s.indexOf(':');
		//   60  174:aload_1         
		//   61  175:bipush          58
		//   62  177:invokevirtual   #88  <Method int String.indexOf(int)>
		//   63  180:istore_3        
				if(j >= 0)
		//*  64  181:iload_3         
		//*  65  182:iflt            228
				{
					int i1 = j + 1;
		//   66  185:iload_3         
		//   67  186:iconst_1        
		//   68  187:iadd            
		//   69  188:istore          4
					if(s.indexOf(':', i1) < 0)
		//*  70  190:aload_1         
		//*  71  191:bipush          58
		//*  72  193:iload           4
		//*  73  195:invokevirtual   #55  <Method int String.indexOf(int, int)>
		//*  74  198:ifge            228
					{
						i1 = Integer.parseInt(s.substring(i1));
		//   75  201:aload_1         
		//   76  202:iload           4
		//   77  204:invokevirtual   #59  <Method String String.substring(int)>
		//   78  207:invokestatic    #65  <Method int Integer.parseInt(String)>
		//   79  210:istore          4
						return ((Object) (new InetSocketAddress(s.substring(0, j), i1)));
		//   80  212:new             #67  <Class InetSocketAddress>
		//   81  215:dup             
		//   82  216:aload_1         
		//   83  217:iconst_0        
		//   84  218:iload_3         
		//   85  219:invokevirtual   #70  <Method String String.substring(int, int)>
		//   86  222:iload           4
		//   87  224:invokespecial   #73  <Method void InetSocketAddress(String, int)>
		//   88  227:areturn         
					}
				}
				return ((Object) (new InetSocketAddress(s, 0)));
		//   89  228:new             #67  <Class InetSocketAddress>
		//   90  231:dup             
		//   91  232:aload_1         
		//   92  233:iconst_0        
		//   93  234:invokespecial   #73  <Method void InetSocketAddress(String, int)>
		//   94  237:areturn         

			case 11: // '\013'
				return ((Object) (InetAddress.getByName(s)));
		//   95  238:aload_1         
		//   96  239:invokestatic    #94  <Method InetAddress InetAddress.getByName(String)>
		//   97  242:areturn         

			case 10: // '\n'
				return ((Object) (TimeZone.getTimeZone(s)));
		//   98  243:aload_1         
		//   99  244:invokestatic    #100 <Method TimeZone TimeZone.getTimeZone(String)>
		//  100  247:areturn         

			case 9: // '\t'
				return ((Object) (Charset.forName(s)));
		//  101  248:aload_1         
		//  102  249:invokestatic    #106 <Method Charset Charset.forName(String)>
		//  103  252:areturn         

			case 8: // '\b'
				int k = _firstHyphenOrUnderscore(s);
		//  104  253:aload_0         
		//  105  254:aload_1         
		//  106  255:invokevirtual   #109 <Method int _firstHyphenOrUnderscore(String)>
		//  107  258:istore_3        
				if(k < 0)
		//* 108  259:iload_3         
		//* 109  260:ifge            272
					return ((Object) (new Locale(s)));
		//  110  263:new             #111 <Class Locale>
		//  111  266:dup             
		//  112  267:aload_1         
		//  113  268:invokespecial   #112 <Method void Locale(String)>
		//  114  271:areturn         
				deserializationcontext = ((DeserializationContext) (s.substring(0, k)));
		//  115  272:aload_1         
		//  116  273:iconst_0        
		//  117  274:iload_3         
		//  118  275:invokevirtual   #70  <Method String String.substring(int, int)>
		//  119  278:astore_2        
				s = s.substring(k + 1);
		//  120  279:aload_1         
		//  121  280:iload_3         
		//  122  281:iconst_1        
		//  123  282:iadd            
		//  124  283:invokevirtual   #59  <Method String String.substring(int)>
		//  125  286:astore_1        
				k = _firstHyphenOrUnderscore(s);
		//  126  287:aload_0         
		//  127  288:aload_1         
		//  128  289:invokevirtual   #109 <Method int _firstHyphenOrUnderscore(String)>
		//  129  292:istore_3        
				if(k < 0)
		//* 130  293:iload_3         
		//* 131  294:ifge            307
					return ((Object) (new Locale(((String) (deserializationcontext)), s)));
		//  132  297:new             #111 <Class Locale>
		//  133  300:dup             
		//  134  301:aload_2         
		//  135  302:aload_1         
		//  136  303:invokespecial   #115 <Method void Locale(String, String)>
		//  137  306:areturn         
				else
					return ((Object) (new Locale(((String) (deserializationcontext)), s.substring(0, k), s.substring(k + 1))));
		//  138  307:new             #111 <Class Locale>
		//  139  310:dup             
		//  140  311:aload_2         
		//  141  312:aload_1         
		//  142  313:iconst_0        
		//  143  314:iload_3         
		//  144  315:invokevirtual   #70  <Method String String.substring(int, int)>
		//  145  318:aload_1         
		//  146  319:iload_3         
		//  147  320:iconst_1        
		//  148  321:iadd            
		//  149  322:invokevirtual   #59  <Method String String.substring(int)>
		//  150  325:invokespecial   #118 <Method void Locale(String, String, String)>
		//  151  328:areturn         

			case 7: // '\007'
				return ((Object) (Pattern.compile(s)));
		//  152  329:aload_1         
		//  153  330:invokestatic    #124 <Method Pattern Pattern.compile(String)>
		//  154  333:areturn         

			case 6: // '\006'
				return ((Object) (Currency.getInstance(s)));
		//  155  334:aload_1         
		//  156  335:invokestatic    #130 <Method Currency Currency.getInstance(String)>
		//  157  338:areturn         

			case 5: // '\005'
				return ((Object) (deserializationcontext.getTypeFactory().constructFromCanonical(s)));
		//  158  339:aload_2         
		//  159  340:invokevirtual   #134 <Method TypeFactory DeserializationContext.getTypeFactory()>
		//  160  343:aload_1         
		//  161  344:invokevirtual   #140 <Method JavaType TypeFactory.constructFromCanonical(String)>
		//  162  347:areturn         

			case 4: // '\004'
				Class class1;
				try
				{
					class1 = deserializationcontext.findClass(s);
		//  163  348:aload_2         
		//  164  349:aload_1         
		//  165  350:invokevirtual   #144 <Method Class DeserializationContext.findClass(String)>
		//  166  353:astore          5
				}
		//* 167  355:aload           5
		//* 168  357:areturn         
				catch(Exception exception)
		//* 169  358:astore          5
				{
					return deserializationcontext.handleInstantiationProblem(_valueClass, ((Object) (s)), ClassUtil.getRootCause(((Throwable) (exception))));
		//  170  360:aload_2         
		//  171  361:aload_0         
		//  172  362:getfield        #148 <Field Class _valueClass>
		//  173  365:aload_1         
		//  174  366:aload           5
		//  175  368:invokestatic    #154 <Method Throwable ClassUtil.getRootCause(Throwable)>
		//  176  371:invokevirtual   #158 <Method Object DeserializationContext.handleInstantiationProblem(Class, Object, Throwable)>
		//  177  374:areturn         
				}
				return ((Object) (class1));

			case 3: // '\003'
				return ((Object) (URI.create(s)));
		//  178  375:aload_1         
		//  179  376:invokestatic    #164 <Method URI URI.create(String)>
		//  180  379:areturn         

			case 2: // '\002'
				return ((Object) (new URL(s)));
		//  181  380:new             #166 <Class URL>
		//  182  383:dup             
		//  183  384:aload_1         
		//  184  385:invokespecial   #167 <Method void URL(String)>
		//  185  388:areturn         

			case 1: // '\001'
				return ((Object) (new File(s)));
		//  186  389:new             #169 <Class File>
		//  187  392:dup             
		//  188  393:aload_1         
		//  189  394:invokespecial   #170 <Method void File(String)>
		//  190  397:areturn         
			}
		}

		protected Object _deserializeFromEmptyString()
			throws IOException
		{
			int i = _kind;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field int _kind>
		//    2    4:istore_1        
			if(i == 3)
		//*   3    5:iload_1         
		//*   4    6:iconst_3        
		//*   5    7:icmpne          16
				return ((Object) (URI.create("")));
		//    6   10:ldc1            #175 <String "">
		//    7   12:invokestatic    #164 <Method URI URI.create(String)>
		//    8   15:areturn         
			if(i == 8)
		//*   9   16:iload_1         
		//*  10   17:bipush          8
		//*  11   19:icmpne          26
				return ((Object) (Locale.ROOT));
		//   12   22:getstatic       #179 <Field Locale Locale.ROOT>
		//   13   25:areturn         
			if(i == 13)
		//*  14   26:iload_1         
		//*  15   27:bipush          13
		//*  16   29:icmpne          40
				return ((Object) (new StringBuilder()));
		//   17   32:new             #36  <Class StringBuilder>
		//   18   35:dup             
		//   19   36:invokespecial   #181 <Method void StringBuilder()>
		//   20   39:areturn         
			else
				return _deserializeFromEmptyString();
		//   21   40:aload_0         
		//   22   41:invokespecial   #183 <Method Object FromStringDeserializer._deserializeFromEmptyString()>
		//   23   44:areturn         
		}

		protected int _firstHyphenOrUnderscore(String s)
		{
			int j = s.length();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #187 <Method int String.length()>
		//    2    4:istore_3        
			for(int i = 0; i < j;)
		//*   3    5:iconst_0        
		//*   4    6:istore_2        
		//*   5    7:iload_2         
		//*   6    8:iload_3         
		//*   7    9:icmpge          44
			{
				char c = s.charAt(i);
		//    8   12:aload_1         
		//    9   13:iload_2         
		//   10   14:invokevirtual   #191 <Method char String.charAt(int)>
		//   11   17:istore          4
				if(c != '_')
		//*  12   19:iload           4
		//*  13   21:bipush          95
		//*  14   23:icmpeq          42
				{
					if(c == '-')
		//*  15   26:iload           4
		//*  16   28:bipush          45
		//*  17   30:icmpne          35
						return i;
		//   18   33:iload_2         
		//   19   34:ireturn         
					i++;
		//   20   35:iload_2         
		//   21   36:iconst_1        
		//   22   37:iadd            
		//   23   38:istore_2        
				} else
		//*  24   39:goto            7
				{
					return i;
		//   25   42:iload_2         
		//   26   43:ireturn         
				}
			}

			return -1;
		//   27   44:iconst_m1       
		//   28   45:ireturn         
		}

		private static final long serialVersionUID = 1L;
		protected final int _kind;

		protected Std(Class class1, int i)
		{
			super(class1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #17  <Method void FromStringDeserializer(Class)>
			_kind = i;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #19  <Field int _kind>
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
label0:
		{
			byte byte0;
			if(class1 == java/io/File)
	//*   0    0:aload_0         
	//*   1    1:ldc1            #19  <Class File>
	//*   2    3:if_acmpne       11
				byte0 = 1;
	//    3    6:iconst_1        
	//    4    7:istore_1        
			else
	//*   5    8:goto            148
			if(class1 == java/net/URL)
	//*   6   11:aload_0         
	//*   7   12:ldc1            #21  <Class URL>
	//*   8   14:if_acmpne       22
				byte0 = 2;
	//    9   17:iconst_2        
	//   10   18:istore_1        
			else
	//*  11   19:goto            148
			if(class1 == java/net/URI)
	//*  12   22:aload_0         
	//*  13   23:ldc1            #23  <Class URI>
	//*  14   25:if_acmpne       33
				byte0 = 3;
	//   15   28:iconst_3        
	//   16   29:istore_1        
			else
	//*  17   30:goto            148
			if(class1 == java/lang/Class)
	//*  18   33:aload_0         
	//*  19   34:ldc1            #25  <Class Class>
	//*  20   36:if_acmpne       44
				byte0 = 4;
	//   21   39:iconst_4        
	//   22   40:istore_1        
			else
	//*  23   41:goto            148
			if(class1 == com/fasterxml/jackson/databind/JavaType)
	//*  24   44:aload_0         
	//*  25   45:ldc1            #27  <Class JavaType>
	//*  26   47:if_acmpne       55
				byte0 = 5;
	//   27   50:iconst_5        
	//   28   51:istore_1        
			else
	//*  29   52:goto            148
			if(class1 == java/util/Currency)
	//*  30   55:aload_0         
	//*  31   56:ldc1            #29  <Class Currency>
	//*  32   58:if_acmpne       67
				byte0 = 6;
	//   33   61:bipush          6
	//   34   63:istore_1        
			else
	//*  35   64:goto            148
			if(class1 == java/util/regex/Pattern)
	//*  36   67:aload_0         
	//*  37   68:ldc1            #31  <Class Pattern>
	//*  38   70:if_acmpne       79
				byte0 = 7;
	//   39   73:bipush          7
	//   40   75:istore_1        
			else
	//*  41   76:goto            148
			if(class1 == java/util/Locale)
	//*  42   79:aload_0         
	//*  43   80:ldc1            #33  <Class Locale>
	//*  44   82:if_acmpne       91
				byte0 = 8;
	//   45   85:bipush          8
	//   46   87:istore_1        
			else
	//*  47   88:goto            148
			if(class1 == java/nio/charset/Charset)
	//*  48   91:aload_0         
	//*  49   92:ldc1            #35  <Class Charset>
	//*  50   94:if_acmpne       103
				byte0 = 9;
	//   51   97:bipush          9
	//   52   99:istore_1        
			else
	//*  53  100:goto            148
			if(class1 == java/util/TimeZone)
	//*  54  103:aload_0         
	//*  55  104:ldc1            #37  <Class TimeZone>
	//*  56  106:if_acmpne       115
				byte0 = 10;
	//   57  109:bipush          10
	//   58  111:istore_1        
			else
	//*  59  112:goto            148
			if(class1 == java/net/InetAddress)
	//*  60  115:aload_0         
	//*  61  116:ldc1            #39  <Class InetAddress>
	//*  62  118:if_acmpne       127
				byte0 = 11;
	//   63  121:bipush          11
	//   64  123:istore_1        
			else
	//*  65  124:goto            148
			if(class1 == java/net/InetSocketAddress)
	//*  66  127:aload_0         
	//*  67  128:ldc1            #41  <Class InetSocketAddress>
	//*  68  130:if_acmpne       139
			{
				byte0 = 12;
	//   69  133:bipush          12
	//   70  135:istore_1        
			} else
	//*  71  136:goto            148
			{
				if(class1 != java/lang/StringBuilder)
					break label0;
	//   72  139:aload_0         
	//   73  140:ldc1            #43  <Class StringBuilder>
	//   74  142:if_acmpne       158
				byte0 = 13;
	//   75  145:bipush          13
	//   76  147:istore_1        
			}
			return new Std(class1, ((int) (byte0)));
	//   77  148:new             #7   <Class FromStringDeserializer$Std>
	//   78  151:dup             
	//   79  152:aload_0         
	//   80  153:iload_1         
	//   81  154:invokespecial   #46  <Method void FromStringDeserializer$Std(Class, int)>
	//   82  157:areturn         
		}
		return null;
	//   83  158:aconst_null     
	//   84  159:areturn         
	}

	public static Class[] types()
	{
		return (new Class[] {
			java/io/File, java/net/URL, java/net/URI, java/lang/Class, com/fasterxml/jackson/databind/JavaType, java/util/Currency, java/util/regex/Pattern, java/util/Locale, java/nio/charset/Charset, java/util/TimeZone, 
			java/net/InetAddress, java/net/InetSocketAddress, java/lang/StringBuilder
		});
	//    0    0:bipush          13
	//    1    2:anewarray       Class[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #19  <Class File>
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #21  <Class URL>
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #23  <Class URI>
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #25  <Class Class>
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #27  <Class JavaType>
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #29  <Class Currency>
	//   25   34:aastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #31  <Class Pattern>
	//   29   40:aastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #33  <Class Locale>
	//   33   46:aastore         
	//   34   47:dup             
	//   35   48:bipush          8
	//   36   50:ldc1            #35  <Class Charset>
	//   37   52:aastore         
	//   38   53:dup             
	//   39   54:bipush          9
	//   40   56:ldc1            #37  <Class TimeZone>
	//   41   58:aastore         
	//   42   59:dup             
	//   43   60:bipush          10
	//   44   62:ldc1            #39  <Class InetAddress>
	//   45   64:aastore         
	//   46   65:dup             
	//   47   66:bipush          11
	//   48   68:ldc1            #41  <Class InetSocketAddress>
	//   49   70:aastore         
	//   50   71:dup             
	//   51   72:bipush          12
	//   52   74:ldc1            #43  <Class StringBuilder>
	//   53   76:aastore         
	//   54   77:areturn         
	}

	protected abstract Object _deserialize(String s, DeserializationContext deserializationcontext)
		throws IOException;

	protected Object _deserializeEmbedded(Object obj, DeserializationContext deserializationcontext)
		throws IOException
	{
		deserializationcontext.reportInputMismatch(((com.fasterxml.jackson.databind.JsonDeserializer) (this)), "Don't know how to convert embedded Object of type %s into %s", new Object[] {
			obj.getClass().getName(), _valueClass.getName()
		});
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:ldc1            #58  <String "Don't know how to convert embedded Object of type %s into %s">
	//    3    4:iconst_2        
	//    4    5:anewarray       Object[]
	//    5    8:dup             
	//    6    9:iconst_0        
	//    7   10:aload_1         
	//    8   11:invokevirtual   #64  <Method Class Object.getClass()>
	//    9   14:invokevirtual   #68  <Method String Class.getName()>
	//   10   17:aastore         
	//   11   18:dup             
	//   12   19:iconst_1        
	//   13   20:aload_0         
	//   14   21:getfield        #72  <Field Class _valueClass>
	//   15   24:invokevirtual   #68  <Method String Class.getName()>
	//   16   27:aastore         
	//   17   28:invokevirtual   #78  <Method Object DeserializationContext.reportInputMismatch(com.fasterxml.jackson.databind.JsonDeserializer, String, Object[])>
	//   18   31:pop             
		return ((Object) (null));
	//   19   32:aconst_null     
	//   20   33:areturn         
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
		String s1;
		String s = jsonparser.getValueAsString();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #94  <Method String JsonParser.getValueAsString()>
	//    2    4:astore_3        
		if(s == null)
			break MISSING_BLOCK_LABEL_121;
	//    3    5:aload_3         
	//    4    6:ifnull          121
		if(s.length() == 0)
			break MISSING_BLOCK_LABEL_116;
	//    5    9:aload_3         
	//    6   10:invokevirtual   #100 <Method int String.length()>
	//    7   13:ifeq            116
		s1 = s.trim();
	//    8   16:aload_3         
	//    9   17:invokevirtual   #103 <Method String String.trim()>
	//   10   20:astore          4
		if(s1.length() == 0)
	//*  11   22:aload           4
	//*  12   24:invokevirtual   #100 <Method int String.length()>
	//*  13   27:ifne            33
			break MISSING_BLOCK_LABEL_116;
	//   14   30:goto            116
		jsonparser = ((JsonParser) (_deserialize(s1, deserializationcontext)));
	//   15   33:aload_0         
	//   16   34:aload           4
	//   17   36:aload_2         
	//   18   37:invokevirtual   #105 <Method Object _deserialize(String, DeserializationContext)>
	//   19   40:astore_1        
		return ((Object) (jsonparser));
	//   20   41:aload_1         
	//   21   42:areturn         
		jsonparser;
	//   22   43:astore_1        
		break MISSING_BLOCK_LABEL_48;
	//   23   44:goto            48
		jsonparser;
	//   24   47:astore_1        
		Object obj = "not a valid textual representation";
	//   25   48:ldc1            #107 <String "not a valid textual representation">
	//   26   50:astore_3        
		String s2 = ((Exception) (jsonparser)).getMessage();
	//   27   51:aload_1         
	//   28   52:invokevirtual   #112 <Method String Exception.getMessage()>
	//   29   55:astore          5
		if(s2 != null)
	//*  30   57:aload           5
	//*  31   59:ifnull          96
		{
			obj = ((Object) (new StringBuilder()));
	//   32   62:new             #43  <Class StringBuilder>
	//   33   65:dup             
	//   34   66:invokespecial   #115 <Method void StringBuilder()>
	//   35   69:astore_3        
			((StringBuilder) (obj)).append("not a valid textual representation");
	//   36   70:aload_3         
	//   37   71:ldc1            #107 <String "not a valid textual representation">
	//   38   73:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   39   76:pop             
			((StringBuilder) (obj)).append(", problem: ");
	//   40   77:aload_3         
	//   41   78:ldc1            #121 <String ", problem: ">
	//   42   80:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   43   83:pop             
			((StringBuilder) (obj)).append(s2);
	//   44   84:aload_3         
	//   45   85:aload           5
	//   46   87:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   47   90:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   48   91:aload_3         
	//   49   92:invokevirtual   #124 <Method String StringBuilder.toString()>
	//   50   95:astore_3        
		}
		deserializationcontext = ((DeserializationContext) (deserializationcontext.weirdStringException(s1, _valueClass, ((String) (obj)))));
	//   51   96:aload_2         
	//   52   97:aload           4
	//   53   99:aload_0         
	//   54  100:getfield        #72  <Field Class _valueClass>
	//   55  103:aload_3         
	//   56  104:invokevirtual   #128 <Method JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
	//   57  107:astore_2        
		((JsonMappingException) (deserializationcontext)).initCause(((Throwable) (jsonparser)));
	//   58  108:aload_2         
	//   59  109:aload_1         
	//   60  110:invokevirtual   #134 <Method Throwable JsonMappingException.initCause(Throwable)>
	//   61  113:pop             
		throw deserializationcontext;
	//   62  114:aload_2         
	//   63  115:athrow          
		return _deserializeFromEmptyString();
	//   64  116:aload_0         
	//   65  117:invokevirtual   #136 <Method Object _deserializeFromEmptyString()>
	//   66  120:areturn         
		JsonToken jsontoken = jsonparser.getCurrentToken();
	//   67  121:aload_1         
	//   68  122:invokevirtual   #140 <Method JsonToken JsonParser.getCurrentToken()>
	//   69  125:astore_3        
		if(jsontoken == JsonToken.START_ARRAY)
	//*  70  126:aload_3         
	//*  71  127:getstatic       #146 <Field JsonToken JsonToken.START_ARRAY>
	//*  72  130:if_acmpne       140
			return _deserializeFromArray(jsonparser, deserializationcontext);
	//   73  133:aload_0         
	//   74  134:aload_1         
	//   75  135:aload_2         
	//   76  136:invokevirtual   #149 <Method Object _deserializeFromArray(JsonParser, DeserializationContext)>
	//   77  139:areturn         
		if(jsontoken == JsonToken.VALUE_EMBEDDED_OBJECT)
	//*  78  140:aload_3         
	//*  79  141:getstatic       #152 <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//*  80  144:if_acmpne       181
		{
			jsonparser = ((JsonParser) (jsonparser.getEmbeddedObject()));
	//   81  147:aload_1         
	//   82  148:invokevirtual   #155 <Method Object JsonParser.getEmbeddedObject()>
	//   83  151:astore_1        
			if(jsonparser == null)
	//*  84  152:aload_1         
	//*  85  153:ifnonnull       158
				return ((Object) (null));
	//   86  156:aconst_null     
	//   87  157:areturn         
			if(_valueClass.isAssignableFrom(((Object) (jsonparser)).getClass()))
	//*  88  158:aload_0         
	//*  89  159:getfield        #72  <Field Class _valueClass>
	//*  90  162:aload_1         
	//*  91  163:invokevirtual   #64  <Method Class Object.getClass()>
	//*  92  166:invokevirtual   #159 <Method boolean Class.isAssignableFrom(Class)>
	//*  93  169:ifeq            174
				return ((Object) (jsonparser));
	//   94  172:aload_1         
	//   95  173:areturn         
			else
				return _deserializeEmbedded(((Object) (jsonparser)), deserializationcontext);
	//   96  174:aload_0         
	//   97  175:aload_1         
	//   98  176:aload_2         
	//   99  177:invokevirtual   #161 <Method Object _deserializeEmbedded(Object, DeserializationContext)>
	//  100  180:areturn         
		} else
		{
			return deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser);
	//  101  181:aload_2         
	//  102  182:aload_0         
	//  103  183:getfield        #72  <Field Class _valueClass>
	//  104  186:aload_1         
	//  105  187:invokevirtual   #165 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//  106  190:areturn         
		}
	}
}
