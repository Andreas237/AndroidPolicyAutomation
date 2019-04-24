// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.google.gson:
//			JsonSerializer, JsonDeserializer, JsonElement, JsonSyntaxException, 
//			JsonParseException, JsonPrimitive, JsonDeserializationContext, JsonSerializationContext

final class DefaultDateTypeAdapter
	implements JsonSerializer, JsonDeserializer
{

	DefaultDateTypeAdapter()
	{
		this(DateFormat.getDateTimeInstance(2, 2, Locale.US), DateFormat.getDateTimeInstance(2, 2));
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:iconst_2        
	//    3    3:getstatic       #21  <Field Locale Locale.US>
	//    4    6:invokestatic    #27  <Method DateFormat DateFormat.getDateTimeInstance(int, int, Locale)>
	//    5    9:iconst_2        
	//    6   10:iconst_2        
	//    7   11:invokestatic    #30  <Method DateFormat DateFormat.getDateTimeInstance(int, int)>
	//    8   14:invokespecial   #33  <Method void DefaultDateTypeAdapter(DateFormat, DateFormat)>
	//    9   17:return          
	}

	DefaultDateTypeAdapter(int i)
	{
		this(DateFormat.getDateInstance(i, Locale.US), DateFormat.getDateInstance(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:getstatic       #21  <Field Locale Locale.US>
	//    3    5:invokestatic    #39  <Method DateFormat DateFormat.getDateInstance(int, Locale)>
	//    4    8:iload_1         
	//    5    9:invokestatic    #42  <Method DateFormat DateFormat.getDateInstance(int)>
	//    6   12:invokespecial   #33  <Method void DefaultDateTypeAdapter(DateFormat, DateFormat)>
	//    7   15:return          
	}

	public DefaultDateTypeAdapter(int i, int j)
	{
		this(DateFormat.getDateTimeInstance(i, j, Locale.US), DateFormat.getDateTimeInstance(i, j));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:getstatic       #21  <Field Locale Locale.US>
	//    4    6:invokestatic    #27  <Method DateFormat DateFormat.getDateTimeInstance(int, int, Locale)>
	//    5    9:iload_1         
	//    6   10:iload_2         
	//    7   11:invokestatic    #30  <Method DateFormat DateFormat.getDateTimeInstance(int, int)>
	//    8   14:invokespecial   #33  <Method void DefaultDateTypeAdapter(DateFormat, DateFormat)>
	//    9   17:return          
	}

	DefaultDateTypeAdapter(String s)
	{
		this(((DateFormat) (new SimpleDateFormat(s, Locale.US))), ((DateFormat) (new SimpleDateFormat(s))));
	//    0    0:aload_0         
	//    1    1:new             #46  <Class SimpleDateFormat>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:getstatic       #21  <Field Locale Locale.US>
	//    5    9:invokespecial   #49  <Method void SimpleDateFormat(String, Locale)>
	//    6   12:new             #46  <Class SimpleDateFormat>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #51  <Method void SimpleDateFormat(String)>
	//   10   20:invokespecial   #33  <Method void DefaultDateTypeAdapter(DateFormat, DateFormat)>
	//   11   23:return          
	}

	DefaultDateTypeAdapter(DateFormat dateformat, DateFormat dateformat1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Object()>
		enUsFormat = dateformat;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #55  <Field DateFormat enUsFormat>
		localFormat = dateformat1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #57  <Field DateFormat localFormat>
		iso8601Format = ((DateFormat) (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US)));
	//    8   14:aload_0         
	//    9   15:new             #46  <Class SimpleDateFormat>
	//   10   18:dup             
	//   11   19:ldc1            #59  <String "yyyy-MM-dd'T'HH:mm:ss'Z'">
	//   12   21:getstatic       #21  <Field Locale Locale.US>
	//   13   24:invokespecial   #49  <Method void SimpleDateFormat(String, Locale)>
	//   14   27:putfield        #61  <Field DateFormat iso8601Format>
		iso8601Format.setTimeZone(TimeZone.getTimeZone("UTC"));
	//   15   30:aload_0         
	//   16   31:getfield        #61  <Field DateFormat iso8601Format>
	//   17   34:ldc1            #63  <String "UTC">
	//   18   36:invokestatic    #69  <Method TimeZone TimeZone.getTimeZone(String)>
	//   19   39:invokevirtual   #73  <Method void DateFormat.setTimeZone(TimeZone)>
	//   20   42:return          
	}

	private Date deserializeToDate(JsonElement jsonelement)
	{
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field DateFormat localFormat>
	//*   2    4:astore_2        
		dateformat;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Date date;
		synchronized(localFormat)
		{
			date = localFormat.parse(jsonelement.getAsString());
	//    5    7:aload_0         
	//    6    8:getfield        #57  <Field DateFormat localFormat>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #83  <Method String JsonElement.getAsString()>
	//    9   15:invokevirtual   #87  <Method Date DateFormat.parse(String)>
	//   10   18:astore_3        
		}
	//   11   19:aload_2         
	//   12   20:monitorexit     
		return date;
	//   13   21:aload_3         
	//   14   22:areturn         
		ParseException parseexception;
		parseexception;
	//   15   23:astore_3        
		Date date1 = enUsFormat.parse(jsonelement.getAsString());
	//   16   24:aload_0         
	//   17   25:getfield        #55  <Field DateFormat enUsFormat>
	//   18   28:aload_1         
	//   19   29:invokevirtual   #83  <Method String JsonElement.getAsString()>
	//   20   32:invokevirtual   #87  <Method Date DateFormat.parse(String)>
	//   21   35:astore_3        
		dateformat;
	//   22   36:aload_2         
		JVM INSTR monitorexit ;
	//   23   37:monitorexit     
		return date1;
	//   24   38:aload_3         
	//   25   39:areturn         
		jsonelement;
	//   26   40:astore_1        
		dateformat;
	//   27   41:aload_2         
		JVM INSTR monitorexit ;
	//   28   42:monitorexit     
		throw jsonelement;
	//   29   43:aload_1         
	//   30   44:athrow          
		date1;
	//   31   45:astore_3        
		date1 = iso8601Format.parse(jsonelement.getAsString());
	//   32   46:aload_0         
	//   33   47:getfield        #61  <Field DateFormat iso8601Format>
	//   34   50:aload_1         
	//   35   51:invokevirtual   #83  <Method String JsonElement.getAsString()>
	//   36   54:invokevirtual   #87  <Method Date DateFormat.parse(String)>
	//   37   57:astore_3        
		dateformat;
	//   38   58:aload_2         
		JVM INSTR monitorexit ;
	//   39   59:monitorexit     
		return date1;
	//   40   60:aload_3         
	//   41   61:areturn         
		date1;
	//   42   62:astore_3        
		throw new JsonSyntaxException(jsonelement.getAsString(), ((Throwable) (date1)));
	//   43   63:new             #89  <Class JsonSyntaxException>
	//   44   66:dup             
	//   45   67:aload_1         
	//   46   68:invokevirtual   #83  <Method String JsonElement.getAsString()>
	//   47   71:aload_3         
	//   48   72:invokespecial   #92  <Method void JsonSyntaxException(String, Throwable)>
	//   49   75:athrow          
	}

	public volatile Object deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext)
		throws JsonParseException
	{
		return ((Object) (deserialize(jsonelement, type, jsondeserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #99  <Method Date deserialize(JsonElement, Type, JsonDeserializationContext)>
	//    5    7:areturn         
	}

	public Date deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext)
		throws JsonParseException
	{
		if(!(jsonelement instanceof JsonPrimitive))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #102 <Class JsonPrimitive>
	//*   2    4:ifne            17
			throw new JsonParseException("The date should be a string value");
	//    3    7:new             #96  <Class JsonParseException>
	//    4   10:dup             
	//    5   11:ldc1            #104 <String "The date should be a string value">
	//    6   13:invokespecial   #105 <Method void JsonParseException(String)>
	//    7   16:athrow          
		jsonelement = ((JsonElement) (deserializeToDate(jsonelement)));
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:invokespecial   #107 <Method Date deserializeToDate(JsonElement)>
	//   11   22:astore_1        
		if(type == java/util/Date)
	//*  12   23:aload_2         
	//*  13   24:ldc1            #109 <Class Date>
	//*  14   26:if_acmpne       31
			return ((Date) (jsonelement));
	//   15   29:aload_1         
	//   16   30:areturn         
		if(type == java/sql/Timestamp)
	//*  17   31:aload_2         
	//*  18   32:ldc1            #111 <Class Timestamp>
	//*  19   34:if_acmpne       49
			return ((Date) (new Timestamp(((Date) (jsonelement)).getTime())));
	//   20   37:new             #111 <Class Timestamp>
	//   21   40:dup             
	//   22   41:aload_1         
	//   23   42:invokevirtual   #115 <Method long Date.getTime()>
	//   24   45:invokespecial   #118 <Method void Timestamp(long)>
	//   25   48:areturn         
		if(type == java/sql/Date)
	//*  26   49:aload_2         
	//*  27   50:ldc1            #120 <Class java.sql.Date>
	//*  28   52:if_acmpne       67
			return ((Date) (new java.sql.Date(((Date) (jsonelement)).getTime())));
	//   29   55:new             #120 <Class java.sql.Date>
	//   30   58:dup             
	//   31   59:aload_1         
	//   32   60:invokevirtual   #115 <Method long Date.getTime()>
	//   33   63:invokespecial   #121 <Method void java.sql.Date(long)>
	//   34   66:areturn         
		else
			throw new IllegalArgumentException((new StringBuilder()).append(((Object) (((Object)this).getClass()))).append(" cannot deserialize to ").append(((Object) (type))).toString());
	//   35   67:new             #123 <Class IllegalArgumentException>
	//   36   70:dup             
	//   37   71:new             #125 <Class StringBuilder>
	//   38   74:dup             
	//   39   75:invokespecial   #126 <Method void StringBuilder()>
	//   40   78:aload_0         
	//   41   79:invokevirtual   #130 <Method Class Object.getClass()>
	//   42   82:invokevirtual   #134 <Method StringBuilder StringBuilder.append(Object)>
	//   43   85:ldc1            #136 <String " cannot deserialize to ">
	//   44   87:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//   45   90:aload_2         
	//   46   91:invokevirtual   #134 <Method StringBuilder StringBuilder.append(Object)>
	//   47   94:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   48   97:invokespecial   #143 <Method void IllegalArgumentException(String)>
	//   49  100:athrow          
	}

	public volatile JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonserializationcontext)
	{
		return serialize((Date)obj, type, jsonserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #109 <Class Date>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #148 <Method JsonElement serialize(Date, Type, JsonSerializationContext)>
	//    6   10:areturn         
	}

	public JsonElement serialize(Date date, Type type, JsonSerializationContext jsonserializationcontext)
	{
		synchronized(localFormat)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field DateFormat localFormat>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			date = ((Date) (new JsonPrimitive(enUsFormat.format(date))));
	//    5    7:new             #102 <Class JsonPrimitive>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:getfield        #55  <Field DateFormat enUsFormat>
	//    9   15:aload_1         
	//   10   16:invokevirtual   #152 <Method String DateFormat.format(Date)>
	//   11   19:invokespecial   #153 <Method void JsonPrimitive(String)>
	//   12   22:astore_1        
		}
	//   13   23:aload_2         
	//   14   24:monitorexit     
		return ((JsonElement) (date));
	//   15   25:aload_1         
	//   16   26:areturn         
		date;
	//   17   27:astore_1        
		type;
	//   18   28:aload_2         
		JVM INSTR monitorexit ;
	//   19   29:monitorexit     
		throw date;
	//   20   30:aload_1         
	//   21   31:athrow          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #125 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #126 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(((Class) (com/google/gson/DefaultDateTypeAdapter)).getSimpleName());
	//    4    8:aload_1         
	//    5    9:ldc1            #2   <Class DefaultDateTypeAdapter>
	//    6   11:invokevirtual   #158 <Method String Class.getSimpleName()>
	//    7   14:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
		stringbuilder.append('(').append(((Object) (localFormat)).getClass().getSimpleName()).append(')');
	//    9   18:aload_1         
	//   10   19:bipush          40
	//   11   21:invokevirtual   #161 <Method StringBuilder StringBuilder.append(char)>
	//   12   24:aload_0         
	//   13   25:getfield        #57  <Field DateFormat localFormat>
	//   14   28:invokevirtual   #130 <Method Class Object.getClass()>
	//   15   31:invokevirtual   #158 <Method String Class.getSimpleName()>
	//   16   34:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:bipush          41
	//   18   39:invokevirtual   #161 <Method StringBuilder StringBuilder.append(char)>
	//   19   42:pop             
		return stringbuilder.toString();
	//   20   43:aload_1         
	//   21   44:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   22   47:areturn         
	}

	private final DateFormat enUsFormat;
	private final DateFormat iso8601Format;
	private final DateFormat localFormat;
}
