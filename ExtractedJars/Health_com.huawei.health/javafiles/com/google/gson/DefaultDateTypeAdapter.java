// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Referenced classes of package com.google.gson:
//			TypeAdapter, JsonSyntaxException

final class DefaultDateTypeAdapter extends TypeAdapter
{

	public DefaultDateTypeAdapter(int i, int j)
	{
		this(java/util/Date, DateFormat.getDateTimeInstance(i, j, Locale.US), DateFormat.getDateTimeInstance(i, j));
	//    0    0:aload_0         
	//    1    1:ldc1            #19  <Class Date>
	//    2    3:iload_1         
	//    3    4:iload_2         
	//    4    5:getstatic       #25  <Field Locale Locale.US>
	//    5    8:invokestatic    #31  <Method DateFormat DateFormat.getDateTimeInstance(int, int, Locale)>
	//    6   11:iload_1         
	//    7   12:iload_2         
	//    8   13:invokestatic    #34  <Method DateFormat DateFormat.getDateTimeInstance(int, int)>
	//    9   16:invokespecial   #37  <Method void DefaultDateTypeAdapter(Class, DateFormat, DateFormat)>
	//   10   19:return          
	}

	DefaultDateTypeAdapter(Class class1)
	{
		this(class1, DateFormat.getDateTimeInstance(2, 2, Locale.US), DateFormat.getDateTimeInstance(2, 2));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_2        
	//    3    3:iconst_2        
	//    4    4:getstatic       #25  <Field Locale Locale.US>
	//    5    7:invokestatic    #31  <Method DateFormat DateFormat.getDateTimeInstance(int, int, Locale)>
	//    6   10:iconst_2        
	//    7   11:iconst_2        
	//    8   12:invokestatic    #34  <Method DateFormat DateFormat.getDateTimeInstance(int, int)>
	//    9   15:invokespecial   #37  <Method void DefaultDateTypeAdapter(Class, DateFormat, DateFormat)>
	//   10   18:return          
	}

	DefaultDateTypeAdapter(Class class1, int i)
	{
		this(class1, DateFormat.getDateInstance(i, Locale.US), DateFormat.getDateInstance(i));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:getstatic       #25  <Field Locale Locale.US>
	//    4    6:invokestatic    #46  <Method DateFormat DateFormat.getDateInstance(int, Locale)>
	//    5    9:iload_2         
	//    6   10:invokestatic    #49  <Method DateFormat DateFormat.getDateInstance(int)>
	//    7   13:invokespecial   #37  <Method void DefaultDateTypeAdapter(Class, DateFormat, DateFormat)>
	//    8   16:return          
	}

	public DefaultDateTypeAdapter(Class class1, int i, int j)
	{
		this(class1, DateFormat.getDateTimeInstance(i, j, Locale.US), DateFormat.getDateTimeInstance(i, j));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:getstatic       #25  <Field Locale Locale.US>
	//    5    7:invokestatic    #31  <Method DateFormat DateFormat.getDateTimeInstance(int, int, Locale)>
	//    6   10:iload_2         
	//    7   11:iload_3         
	//    8   12:invokestatic    #34  <Method DateFormat DateFormat.getDateTimeInstance(int, int)>
	//    9   15:invokespecial   #37  <Method void DefaultDateTypeAdapter(Class, DateFormat, DateFormat)>
	//   10   18:return          
	}

	DefaultDateTypeAdapter(Class class1, String s)
	{
		this(class1, ((DateFormat) (new SimpleDateFormat(s, Locale.US))), ((DateFormat) (new SimpleDateFormat(s))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #55  <Class SimpleDateFormat>
	//    3    5:dup             
	//    4    6:aload_2         
	//    5    7:getstatic       #25  <Field Locale Locale.US>
	//    6   10:invokespecial   #58  <Method void SimpleDateFormat(String, Locale)>
	//    7   13:new             #55  <Class SimpleDateFormat>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #61  <Method void SimpleDateFormat(String)>
	//   11   21:invokespecial   #37  <Method void DefaultDateTypeAdapter(Class, DateFormat, DateFormat)>
	//   12   24:return          
	}

	DefaultDateTypeAdapter(Class class1, DateFormat dateformat, DateFormat dateformat1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void TypeAdapter()>
		if(class1 != java/util/Date && class1 != java/sql/Date && class1 != java/sql/Timestamp)
	//*   2    4:aload_1         
	//*   3    5:ldc1            #19  <Class Date>
	//*   4    7:if_acmpeq       79
	//*   5   10:aload_1         
	//*   6   11:ldc1            #67  <Class java.sql.Date>
	//*   7   13:if_acmpeq       79
	//*   8   16:aload_1         
	//*   9   17:ldc1            #69  <Class Timestamp>
	//*  10   19:if_acmpeq       79
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Date type must be one of ").append(java/util/Date).append(", ").append(java/sql/Timestamp).append(", or ").append(java/sql/Date).append(" but was ").append(((Object) (class1))).toString());
	//   11   22:new             #71  <Class IllegalArgumentException>
	//   12   25:dup             
	//   13   26:new             #73  <Class StringBuilder>
	//   14   29:dup             
	//   15   30:invokespecial   #74  <Method void StringBuilder()>
	//   16   33:ldc1            #76  <String "Date type must be one of ">
	//   17   35:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   18   38:ldc1            #19  <Class Date>
	//   19   40:invokevirtual   #83  <Method StringBuilder StringBuilder.append(Object)>
	//   20   43:ldc1            #85  <String ", ">
	//   21   45:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   22   48:ldc1            #69  <Class Timestamp>
	//   23   50:invokevirtual   #83  <Method StringBuilder StringBuilder.append(Object)>
	//   24   53:ldc1            #87  <String ", or ">
	//   25   55:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   26   58:ldc1            #67  <Class java.sql.Date>
	//   27   60:invokevirtual   #83  <Method StringBuilder StringBuilder.append(Object)>
	//   28   63:ldc1            #89  <String " but was ">
	//   29   65:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   30   68:aload_1         
	//   31   69:invokevirtual   #83  <Method StringBuilder StringBuilder.append(Object)>
	//   32   72:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   33   75:invokespecial   #94  <Method void IllegalArgumentException(String)>
	//   34   78:athrow          
		} else
		{
			dateType = class1;
	//   35   79:aload_0         
	//   36   80:aload_1         
	//   37   81:putfield        #96  <Field Class dateType>
			enUsFormat = dateformat;
	//   38   84:aload_0         
	//   39   85:aload_2         
	//   40   86:putfield        #98  <Field DateFormat enUsFormat>
			localFormat = dateformat1;
	//   41   89:aload_0         
	//   42   90:aload_3         
	//   43   91:putfield        #100 <Field DateFormat localFormat>
			return;
	//   44   94:return          
		}
	}

	private Date deserializeToDate(String s)
	{
		DateFormat dateformat = localFormat;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field DateFormat localFormat>
	//    2    4:astore_2        
		dateformat;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Date date = localFormat.parse(s);
	//    5    7:aload_0         
	//    6    8:getfield        #100 <Field DateFormat localFormat>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #108 <Method Date DateFormat.parse(String)>
	//    9   15:astore_3        
		dateformat;
	//   10   16:aload_2         
		JVM INSTR monitorexit ;
	//   11   17:monitorexit     
		return date;
	//   12   18:aload_3         
	//   13   19:areturn         
		ParseException parseexception;
		parseexception;
	//   14   20:astore_3        
		parseexception = ((ParseException) (enUsFormat.parse(s)));
	//   15   21:aload_0         
	//   16   22:getfield        #98  <Field DateFormat enUsFormat>
	//   17   25:aload_1         
	//   18   26:invokevirtual   #108 <Method Date DateFormat.parse(String)>
	//   19   29:astore_3        
		dateformat;
	//   20   30:aload_2         
		JVM INSTR monitorexit ;
	//   21   31:monitorexit     
		return ((Date) (parseexception));
	//   22   32:aload_3         
	//   23   33:areturn         
		parseexception;
	//   24   34:astore_3        
		parseexception = ((ParseException) (ISO8601Utils.parse(s, new ParsePosition(0))));
	//   25   35:aload_1         
	//   26   36:new             #110 <Class ParsePosition>
	//   27   39:dup             
	//   28   40:iconst_0        
	//   29   41:invokespecial   #113 <Method void ParsePosition(int)>
	//   30   44:invokestatic    #118 <Method Date ISO8601Utils.parse(String, ParsePosition)>
	//   31   47:astore_3        
		dateformat;
	//   32   48:aload_2         
		JVM INSTR monitorexit ;
	//   33   49:monitorexit     
		return ((Date) (parseexception));
	//   34   50:aload_3         
	//   35   51:areturn         
		parseexception;
	//   36   52:astore_3        
		throw new JsonSyntaxException(s, ((Throwable) (parseexception)));
	//   37   53:new             #120 <Class JsonSyntaxException>
	//   38   56:dup             
	//   39   57:aload_1         
	//   40   58:aload_3         
	//   41   59:invokespecial   #123 <Method void JsonSyntaxException(String, Throwable)>
	//   42   62:athrow          
		s;
	//   43   63:astore_1        
		dateformat;
	//   44   64:aload_2         
		JVM INSTR monitorexit ;
	//   45   65:monitorexit     
		throw s;
	//   46   66:aload_1         
	//   47   67:athrow          
	}

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #130 <Method Date read(JsonReader)>
	//    3    5:areturn         
	}

	public Date read(JsonReader jsonreader)
		throws IOException
	{
		if(jsonreader.peek() == JsonToken.NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #137 <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #143 <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #146 <Method void JsonReader.nextNull()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		}
		jsonreader = ((JsonReader) (deserializeToDate(jsonreader.nextString())));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #149 <Method String JsonReader.nextString()>
	//   11   21:invokespecial   #151 <Method Date deserializeToDate(String)>
	//   12   24:astore_1        
		if(dateType == java/util/Date)
	//*  13   25:aload_0         
	//*  14   26:getfield        #96  <Field Class dateType>
	//*  15   29:ldc1            #19  <Class Date>
	//*  16   31:if_acmpne       36
			return ((Date) (jsonreader));
	//   17   34:aload_1         
	//   18   35:areturn         
		if(dateType == java/sql/Timestamp)
	//*  19   36:aload_0         
	//*  20   37:getfield        #96  <Field Class dateType>
	//*  21   40:ldc1            #69  <Class Timestamp>
	//*  22   42:if_acmpne       57
			return ((Date) (new Timestamp(((Date) (jsonreader)).getTime())));
	//   23   45:new             #69  <Class Timestamp>
	//   24   48:dup             
	//   25   49:aload_1         
	//   26   50:invokevirtual   #155 <Method long Date.getTime()>
	//   27   53:invokespecial   #158 <Method void Timestamp(long)>
	//   28   56:areturn         
		if(dateType == java/sql/Date)
	//*  29   57:aload_0         
	//*  30   58:getfield        #96  <Field Class dateType>
	//*  31   61:ldc1            #67  <Class java.sql.Date>
	//*  32   63:if_acmpne       78
			return ((Date) (new java.sql.Date(((Date) (jsonreader)).getTime())));
	//   33   66:new             #67  <Class java.sql.Date>
	//   34   69:dup             
	//   35   70:aload_1         
	//   36   71:invokevirtual   #155 <Method long Date.getTime()>
	//   37   74:invokespecial   #159 <Method void java.sql.Date(long)>
	//   38   77:areturn         
		else
			throw new AssertionError();
	//   39   78:new             #161 <Class AssertionError>
	//   40   81:dup             
	//   41   82:invokespecial   #162 <Method void AssertionError()>
	//   42   85:athrow          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #73  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #74  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("DefaultDateTypeAdapter");
	//    4    8:aload_1         
	//    5    9:ldc1            #9   <String "DefaultDateTypeAdapter">
	//    6   11:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append('(').append(((Object) (localFormat)).getClass().getSimpleName()).append(')');
	//    8   15:aload_1         
	//    9   16:bipush          40
	//   10   18:invokevirtual   #165 <Method StringBuilder StringBuilder.append(char)>
	//   11   21:aload_0         
	//   12   22:getfield        #100 <Field DateFormat localFormat>
	//   13   25:invokevirtual   #171 <Method Class Object.getClass()>
	//   14   28:invokevirtual   #176 <Method String Class.getSimpleName()>
	//   15   31:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   16   34:bipush          41
	//   17   36:invokevirtual   #165 <Method StringBuilder StringBuilder.append(char)>
	//   18   39:pop             
		return stringbuilder.toString();
	//   19   40:aload_1         
	//   20   41:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   21   44:areturn         
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (Date)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #19  <Class Date>
	//    4    6:invokevirtual   #181 <Method void write(JsonWriter, Date)>
	//    5    9:return          
	}

	public void write(JsonWriter jsonwriter, Date date)
		throws IOException
	{
		if(date == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			jsonwriter.nullValue();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #187 <Method JsonWriter JsonWriter.nullValue()>
	//    4    8:pop             
			return;
	//    5    9:return          
		}
		DateFormat dateformat = localFormat;
	//    6   10:aload_0         
	//    7   11:getfield        #100 <Field DateFormat localFormat>
	//    8   14:astore_3        
		dateformat;
	//    9   15:aload_3         
		JVM INSTR monitorenter ;
	//   10   16:monitorenter    
		jsonwriter.value(enUsFormat.format(date));
	//   11   17:aload_1         
	//   12   18:aload_0         
	//   13   19:getfield        #98  <Field DateFormat enUsFormat>
	//   14   22:aload_2         
	//   15   23:invokevirtual   #191 <Method String DateFormat.format(Date)>
	//   16   26:invokevirtual   #195 <Method JsonWriter JsonWriter.value(String)>
	//   17   29:pop             
		dateformat;
	//   18   30:aload_3         
		JVM INSTR monitorexit ;
	//   19   31:monitorexit     
		return;
	//   20   32:return          
		jsonwriter;
	//   21   33:astore_1        
	//*  22   34:aload_3         
		throw jsonwriter;
	//   23   35:monitorexit     
	//   24   36:aload_1         
	//   25   37:athrow          
	}

	private static final String SIMPLE_NAME = "DefaultDateTypeAdapter";
	private final Class dateType;
	private final DateFormat enUsFormat;
	private final DateFormat localFormat;
}
