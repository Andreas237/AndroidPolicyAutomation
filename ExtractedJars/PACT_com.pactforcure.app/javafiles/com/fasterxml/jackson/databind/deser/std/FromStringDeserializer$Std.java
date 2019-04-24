// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

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
	//*   1    1:getfield        #43  <Field int _kind>
		{
	//*   2    4:tableswitch     1 12: default 68
	//	               1 76
	//	               2 85
	//	               3 94
	//	               4 99
	//	               5 121
	//	               6 130
	//	               7 135
	//	               8 140
	//	               9 218
	//	               10 223
	//	               11 228
	//	               12 233
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
	//   32  117:invokevirtual   #91  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.instantiationException(Class, Throwable)>
	//   33  120:athrow          
			}
			return ((Object) (s));

		case 5: // '\005'
			return ((Object) (deserializationcontext.getTypeFactory().constructFromCanonical(s)));
	//   34  121:aload_2         
	//   35  122:invokevirtual   #95  <Method TypeFactory DeserializationContext.getTypeFactory()>
	//   36  125:aload_1         
	//   37  126:invokevirtual   #101 <Method com.fasterxml.jackson.databind.JavaType TypeFactory.constructFromCanonical(String)>
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
	//  116  261:invokevirtual   #168 <Method com.fasterxml.jackson.core.JsonParser DeserializationContext.getParser()>
	//  117  264:ldc1            #170 <String "Bracketed IPv6 address must contain closing bracket">
	//  118  266:aload_1         
	//  119  267:ldc1            #172 <Class InetSocketAddress>
	//  120  269:invokespecial   #175 <Method void InvalidFormatException(com.fasterxml.jackson.core.JsonParser, String, Object, Class)>
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
			return super._deserializeFromEmptyString();
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

	protected FromStringDeserializer$Std(Class class1, int i)
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
