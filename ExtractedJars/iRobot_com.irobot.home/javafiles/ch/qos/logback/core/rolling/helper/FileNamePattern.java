// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.pattern.*;
import ch.qos.logback.core.pattern.parser.Parser;
import ch.qos.logback.core.pattern.util.AlmostAsIsEscapeUtil;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.ScanException;
import java.util.*;

// Referenced classes of package ch.qos.logback.core.rolling.helper:
//			IntegerTokenConverter, DateTokenConverter, FileFilterUtil, MonoTypedConverter

public class FileNamePattern extends ContextAwareBase
{

	public FileNamePattern(String s, Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void ContextAwareBase()>
		setPattern(FileFilterUtil.slashify(s));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #50  <Method String FileFilterUtil.slashify(String)>
	//    5    9:invokevirtual   #54  <Method void setPattern(String)>
		setContext(context);
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #58  <Method void setContext(Context)>
		parse();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #61  <Method void parse()>
		ConverterUtil.startConverters(headTokenConverter);
	//   11   21:aload_0         
	//   12   22:getfield        #63  <Field Converter headTokenConverter>
	//   13   25:invokestatic    #69  <Method void ConverterUtil.startConverters(Converter)>
	//   14   28:return          
	}

	public String convert(Object obj)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #73  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #74  <Method void StringBuilder()>
	//    3    7:astore_3        
		for(Converter converter = headTokenConverter; converter != null; converter = converter.getNext())
	//*   4    8:aload_0         
	//*   5    9:getfield        #63  <Field Converter headTokenConverter>
	//*   6   12:astore_2        
	//*   7   13:aload_2         
	//*   8   14:ifnull          35
			stringbuilder.append(converter.convert(obj));
	//    9   17:aload_3         
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #78  <Method String Converter.convert(Object)>
	//   13   23:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   14   26:pop             

	//   15   27:aload_2         
	//   16   28:invokevirtual   #86  <Method Converter Converter.getNext()>
	//   17   31:astore_2        
	//*  18   32:goto            13
		return stringbuilder.toString();
	//   19   35:aload_3         
	//   20   36:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   21   39:areturn         
	}

	public String convertInt(int i)
	{
		return convert(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #97  <Method Integer Integer.valueOf(int)>
	//    3    5:invokevirtual   #98  <Method String convert(Object)>
	//    4    8:areturn         
	}

	public transient String convertMultipleArguments(Object aobj[])
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #73  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #74  <Method void StringBuilder()>
	//    3    7:astore          5
label0:
		for(Converter converter = headTokenConverter; converter != null; converter = converter.getNext())
	//*   4    9:aload_0         
	//*   5   10:getfield        #63  <Field Converter headTokenConverter>
	//*   6   13:astore          4
	//*   7   15:aload           4
	//*   8   17:ifnull          104
		{
			if(converter instanceof MonoTypedConverter)
	//*   9   20:aload           4
	//*  10   22:instanceof      #102 <Class MonoTypedConverter>
	//*  11   25:ifeq            82
			{
				MonoTypedConverter monotypedconverter = (MonoTypedConverter)converter;
	//   12   28:aload           4
	//   13   30:checkcast       #102 <Class MonoTypedConverter>
	//   14   33:astore          6
				int j = aobj.length;
	//   15   35:aload_1         
	//   16   36:arraylength     
	//   17   37:istore_3        
				int i = 0;
	//   18   38:iconst_0        
	//   19   39:istore_2        
				do
				{
					if(i >= j)
						continue label0;
	//   20   40:iload_2         
	//   21   41:iload_3         
	//   22   42:icmpge          94
					Object obj = aobj[i];
	//   23   45:aload_1         
	//   24   46:iload_2         
	//   25   47:aaload          
	//   26   48:astore          7
					if(monotypedconverter.isApplicable(obj))
	//*  27   50:aload           6
	//*  28   52:aload           7
	//*  29   54:invokeinterface #106 <Method boolean MonoTypedConverter.isApplicable(Object)>
	//*  30   59:ifeq            75
						stringbuilder.append(converter.convert(obj));
	//   31   62:aload           5
	//   32   64:aload           4
	//   33   66:aload           7
	//   34   68:invokevirtual   #78  <Method String Converter.convert(Object)>
	//   35   71:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   36   74:pop             
					i++;
	//   37   75:iload_2         
	//   38   76:iconst_1        
	//   39   77:iadd            
	//   40   78:istore_2        
				} while(true);
	//   41   79:goto            40
			}
			stringbuilder.append(converter.convert(((Object) (aobj))));
	//   42   82:aload           5
	//   43   84:aload           4
	//   44   86:aload_1         
	//   45   87:invokevirtual   #78  <Method String Converter.convert(Object)>
	//   46   90:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   47   93:pop             
		}

	//   48   94:aload           4
	//   49   96:invokevirtual   #86  <Method Converter Converter.getNext()>
	//   50   99:astore          4
	//*  51  101:goto            15
		return stringbuilder.toString();
	//   52  104:aload           5
	//   53  106:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   54  109:areturn         
	}

	String escapeRightParantesis(String s)
	{
		return pattern.replace(")", "\\)");
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field String pattern>
	//    2    4:ldc1            #111 <String ")">
	//    3    6:ldc1            #113 <String "\\)">
	//    4    8:invokevirtual   #119 <Method String String.replace(CharSequence, CharSequence)>
	//    5   11:areturn         
	}

	public IntegerTokenConverter getIntegerTokenConverter()
	{
		for(Converter converter = headTokenConverter; converter != null; converter = converter.getNext())
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field Converter headTokenConverter>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:ifnull          29
			if(converter instanceof IntegerTokenConverter)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #25  <Class IntegerTokenConverter>
	//*   7   13:ifeq            21
				return (IntegerTokenConverter)converter;
	//    8   16:aload_1         
	//    9   17:checkcast       #25  <Class IntegerTokenConverter>
	//   10   20:areturn         

	//   11   21:aload_1         
	//   12   22:invokevirtual   #86  <Method Converter Converter.getNext()>
	//   13   25:astore_1        
	//*  14   26:goto            5
		return null;
	//   15   29:aconst_null     
	//   16   30:areturn         
	}

	public String getPattern()
	{
		return pattern;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field String pattern>
	//    2    4:areturn         
	}

	public DateTokenConverter getPrimaryDateTokenConverter()
	{
		for(Converter converter = headTokenConverter; converter != null; converter = converter.getNext())
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field Converter headTokenConverter>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:ifnull          38
		{
			if(!(converter instanceof DateTokenConverter))
				continue;
	//    5    9:aload_1         
	//    6   10:instanceof      #41  <Class DateTokenConverter>
	//    7   13:ifeq            30
			DateTokenConverter datetokenconverter = (DateTokenConverter)converter;
	//    8   16:aload_1         
	//    9   17:checkcast       #41  <Class DateTokenConverter>
	//   10   20:astore_2        
			if(datetokenconverter.isPrimary())
	//*  11   21:aload_2         
	//*  12   22:invokevirtual   #128 <Method boolean DateTokenConverter.isPrimary()>
	//*  13   25:ifeq            30
				return datetokenconverter;
	//   14   28:aload_2         
	//   15   29:areturn         
		}

	//   16   30:aload_1         
	//   17   31:invokevirtual   #86  <Method Converter Converter.getNext()>
	//   18   34:astore_1        
	//*  19   35:goto            5
		return null;
	//   20   38:aconst_null     
	//   21   39:areturn         
	}

	void parse()
	{
		try
		{
			Parser parser = new Parser(escapeRightParantesis(pattern), ((ch.qos.logback.core.pattern.util.IEscapeUtil) (new AlmostAsIsEscapeUtil())));
	//    0    0:new             #132 <Class Parser>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #109 <Field String pattern>
	//    5    9:invokevirtual   #134 <Method String escapeRightParantesis(String)>
	//    6   12:new             #136 <Class AlmostAsIsEscapeUtil>
	//    7   15:dup             
	//    8   16:invokespecial   #137 <Method void AlmostAsIsEscapeUtil()>
	//    9   19:invokespecial   #140 <Method void Parser(String, ch.qos.logback.core.pattern.util.IEscapeUtil)>
	//   10   22:astore_1        
			parser.setContext(context);
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #144 <Field Context context>
	//   14   28:invokevirtual   #145 <Method void Parser.setContext(Context)>
			headTokenConverter = parser.compile(parser.parse(), CONVERTER_MAP);
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #148 <Method ch.qos.logback.core.pattern.parser.Node Parser.parse()>
	//   19   37:getstatic       #21  <Field Map CONVERTER_MAP>
	//   20   40:invokevirtual   #152 <Method Converter Parser.compile(ch.qos.logback.core.pattern.parser.Node, Map)>
	//   21   43:putfield        #63  <Field Converter headTokenConverter>
			return;
	//   22   46:return          
		}
		catch(ScanException scanexception)
	//*  23   47:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   24   48:new             #73  <Class StringBuilder>
	//   25   51:dup             
	//   26   52:invokespecial   #74  <Method void StringBuilder()>
	//   27   55:astore_2        
			stringbuilder.append("Failed to parse pattern \"");
	//   28   56:aload_2         
	//   29   57:ldc1            #154 <String "Failed to parse pattern \"">
	//   30   59:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   31   62:pop             
			stringbuilder.append(pattern);
	//   32   63:aload_2         
	//   33   64:aload_0         
	//   34   65:getfield        #109 <Field String pattern>
	//   35   68:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   36   71:pop             
			stringbuilder.append("\".");
	//   37   72:aload_2         
	//   38   73:ldc1            #156 <String "\".">
	//   39   75:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   40   78:pop             
			addError(stringbuilder.toString(), ((Throwable) (scanexception)));
	//   41   79:aload_0         
	//   42   80:aload_2         
	//   43   81:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   44   84:aload_1         
	//   45   85:invokevirtual   #160 <Method void addError(String, Throwable)>
			return;
	//   46   88:return          
		}
	}

	public void setPattern(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
			pattern = s.trim();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #163 <Method String String.trim()>
	//    5    9:putfield        #109 <Field String pattern>
	//    6   12:return          
	}

	public String toRegex()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #73  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #74  <Method void StringBuilder()>
	//    3    7:astore_3        
		for(Converter converter = headTokenConverter; converter != null; converter = converter.getNext())
	//*   4    8:aload_0         
	//*   5    9:getfield        #63  <Field Converter headTokenConverter>
	//*   6   12:astore_2        
	//*   7   13:aload_2         
	//*   8   14:ifnull          78
		{
			String s;
			if(converter instanceof LiteralConverter)
	//*   9   17:aload_2         
	//*  10   18:instanceof      #166 <Class LiteralConverter>
	//*  11   21:ifeq            39
				s = converter.convert(((Object) (null)));
	//   12   24:aload_2         
	//   13   25:aconst_null     
	//   14   26:invokevirtual   #78  <Method String Converter.convert(Object)>
	//   15   29:astore_1        
			else
	//*  16   30:aload_3         
	//*  17   31:aload_1         
	//*  18   32:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//*  19   35:pop             
	//*  20   36:goto            70
			if(converter instanceof IntegerTokenConverter)
	//*  21   39:aload_2         
	//*  22   40:instanceof      #25  <Class IntegerTokenConverter>
	//*  23   43:ifeq            52
			{
				s = "\\d{1,2}";
	//   24   46:ldc1            #168 <String "\\d{1,2}">
	//   25   48:astore_1        
			} else
	//*  26   49:goto            30
			{
				if(!(converter instanceof DateTokenConverter))
					continue;
	//   27   52:aload_2         
	//   28   53:instanceof      #41  <Class DateTokenConverter>
	//   29   56:ifeq            70
				s = ((DateTokenConverter)converter).toRegex();
	//   30   59:aload_2         
	//   31   60:checkcast       #41  <Class DateTokenConverter>
	//   32   63:invokevirtual   #170 <Method String DateTokenConverter.toRegex()>
	//   33   66:astore_1        
			}
			stringbuilder.append(s);
		}

	//   34   67:goto            30
	//   35   70:aload_2         
	//   36   71:invokevirtual   #86  <Method Converter Converter.getNext()>
	//   37   74:astore_2        
	//*  38   75:goto            13
		return stringbuilder.toString();
	//   39   78:aload_3         
	//   40   79:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   41   82:areturn         
	}

	public String toRegexForFixedDate(Date date)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #73  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #74  <Method void StringBuilder()>
	//    3    7:astore          4
		for(Converter converter = headTokenConverter; converter != null; converter = converter.getNext())
	//*   4    9:aload_0         
	//*   5   10:getfield        #63  <Field Converter headTokenConverter>
	//*   6   13:astore_3        
	//*   7   14:aload_3         
	//*   8   15:ifnull          78
		{
			String s;
			if(converter instanceof LiteralConverter)
	//*   9   18:aload_3         
	//*  10   19:instanceof      #166 <Class LiteralConverter>
	//*  11   22:ifeq            41
				s = converter.convert(((Object) (null)));
	//   12   25:aload_3         
	//   13   26:aconst_null     
	//   14   27:invokevirtual   #78  <Method String Converter.convert(Object)>
	//   15   30:astore_2        
			else
	//*  16   31:aload           4
	//*  17   33:aload_2         
	//*  18   34:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//*  19   37:pop             
	//*  20   38:goto            70
			if(converter instanceof IntegerTokenConverter)
	//*  21   41:aload_3         
	//*  22   42:instanceof      #25  <Class IntegerTokenConverter>
	//*  23   45:ifeq            54
			{
				s = "(\\d{1,3})";
	//   24   48:ldc1            #174 <String "(\\d{1,3})">
	//   25   50:astore_2        
			} else
	//*  26   51:goto            31
			{
				if(!(converter instanceof DateTokenConverter))
					continue;
	//   27   54:aload_3         
	//   28   55:instanceof      #41  <Class DateTokenConverter>
	//   29   58:ifeq            70
				s = converter.convert(((Object) (date)));
	//   30   61:aload_3         
	//   31   62:aload_1         
	//   32   63:invokevirtual   #78  <Method String Converter.convert(Object)>
	//   33   66:astore_2        
			}
			stringbuilder.append(s);
		}

	//   34   67:goto            31
	//   35   70:aload_3         
	//   36   71:invokevirtual   #86  <Method Converter Converter.getNext()>
	//   37   74:astore_3        
	//*  38   75:goto            14
		return stringbuilder.toString();
	//   39   78:aload           4
	//   40   80:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   41   83:areturn         
	}

	public String toString()
	{
		return pattern;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field String pattern>
	//    2    4:areturn         
	}

	static final Map CONVERTER_MAP;
	Converter headTokenConverter;
	String pattern;

	static 
	{
		CONVERTER_MAP = ((Map) (new HashMap()));
	//    0    0:new             #16  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void HashMap()>
	//    3    7:putstatic       #21  <Field Map CONVERTER_MAP>
		CONVERTER_MAP.put("i", ((Object) (((Class) (ch/qos/logback/core/rolling/helper/IntegerTokenConverter)).getName())));
	//    4   10:getstatic       #21  <Field Map CONVERTER_MAP>
	//    5   13:ldc1            #23  <String "i">
	//    6   15:ldc1            #25  <Class IntegerTokenConverter>
	//    7   17:invokevirtual   #31  <Method String Class.getName()>
	//    8   20:invokeinterface #37  <Method Object Map.put(Object, Object)>
	//    9   25:pop             
		CONVERTER_MAP.put("d", ((Object) (((Class) (ch/qos/logback/core/rolling/helper/DateTokenConverter)).getName())));
	//   10   26:getstatic       #21  <Field Map CONVERTER_MAP>
	//   11   29:ldc1            #39  <String "d">
	//   12   31:ldc1            #41  <Class DateTokenConverter>
	//   13   33:invokevirtual   #31  <Method String Class.getName()>
	//   14   36:invokeinterface #37  <Method Object Map.put(Object, Object)>
	//   15   41:pop             
	//*  16   42:return          
	}
}
