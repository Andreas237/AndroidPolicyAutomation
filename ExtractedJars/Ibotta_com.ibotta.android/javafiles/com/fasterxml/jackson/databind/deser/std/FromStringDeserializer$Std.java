// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.databind.DeserializationContext;
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
//			FromStringDeserializer

public static class FromStringDeserializer$Std extends FromStringDeserializer
{

	protected Object _deserialize(String s, DeserializationContext deserializationcontext)
		throws IOException
	{
		switch(_kind)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field int _kind>
		{
	//*   2    4:tableswitch     1 13: default 72
	//	               1 389
	//	               2 380
	//	               3 375
	//	               4 348
	//	               5 339
	//	               6 334
	//	               7 329
	//	               8 253
	//	               9 248
	//	               10 243
	//	               11 238
	//	               12 86
	//	               13 77
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
	//   54  162:invokevirtual   #81  <Method com.fasterxml.jackson.core.JsonParser DeserializationContext.getParser()>
	//   55  165:ldc1            #83  <String "Bracketed IPv6 address must contain closing bracket">
	//   56  167:aload_1         
	//   57  168:ldc1            #67  <Class InetSocketAddress>
	//   58  170:invokespecial   #86  <Method void InvalidFormatException(com.fasterxml.jackson.core.JsonParser, String, Object, Class)>
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
	//  161  344:invokevirtual   #140 <Method com.fasterxml.jackson.databind.JavaType TypeFactory.constructFromCanonical(String)>
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
			return super._deserializeFromEmptyString();
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

	protected FromStringDeserializer$Std(Class class1, int i)
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
