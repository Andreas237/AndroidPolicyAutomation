// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.*;
import java.io.IOException;
import java.text.*;
import java.util.*;

public final class DateTypeAdapter extends TypeAdapter
{

	public DateTypeAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void TypeAdapter()>
		enUsFormat = DateFormat.getDateTimeInstance(2, 2, Locale.US);
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:iconst_2        
	//    5    7:getstatic       #28  <Field Locale Locale.US>
	//    6   10:invokestatic    #34  <Method DateFormat DateFormat.getDateTimeInstance(int, int, Locale)>
	//    7   13:putfield        #36  <Field DateFormat enUsFormat>
	//    8   16:aload_0         
	//    9   17:iconst_2        
	//   10   18:iconst_2        
	//   11   19:invokestatic    #39  <Method DateFormat DateFormat.getDateTimeInstance(int, int)>
	//   12   22:putfield        #41  <Field DateFormat localFormat>
	//   13   25:aload_0         
	//   14   26:invokestatic    #45  <Method DateFormat buildIso8601Format()>
	//   15   29:putfield        #47  <Field DateFormat iso8601Format>
	//   16   32:return          
	}

	private static DateFormat buildIso8601Format()
	{
		SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
	//    0    0:new             #49  <Class SimpleDateFormat>
	//    1    3:dup             
	//    2    4:ldc1            #51  <String "yyyy-MM-dd'T'HH:mm:ss'Z'">
	//    3    6:getstatic       #28  <Field Locale Locale.US>
	//    4    9:invokespecial   #54  <Method void SimpleDateFormat(String, Locale)>
	//    5   12:astore_0        
		((DateFormat) (simpledateformat)).setTimeZone(TimeZone.getTimeZone("UTC"));
	//    6   13:aload_0         
	//    7   14:ldc1            #56  <String "UTC">
	//    8   16:invokestatic    #62  <Method TimeZone TimeZone.getTimeZone(String)>
	//    9   19:invokevirtual   #66  <Method void DateFormat.setTimeZone(TimeZone)>
		return ((DateFormat) (simpledateformat));
	//   10   22:aload_0         
	//   11   23:areturn         
	}

	private Date deserializeToDate(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Date date = localFormat.parse(s);
	//    2    2:aload_0         
	//    3    3:getfield        #41  <Field DateFormat localFormat>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #73  <Method Date DateFormat.parse(String)>
	//    6   10:astore_2        
		s = ((String) (date));
	//    7   11:aload_2         
	//    8   12:astore_1        
_L1:
		this;
	//    9   13:aload_0         
		JVM INSTR monitorexit ;
	//   10   14:monitorexit     
		return ((Date) (s));
	//   11   15:aload_1         
	//   12   16:areturn         
		ParseException parseexception;
		parseexception;
	//   13   17:astore_2        
		parseexception = ((ParseException) (enUsFormat.parse(s)));
	//   14   18:aload_0         
	//   15   19:getfield        #36  <Field DateFormat enUsFormat>
	//   16   22:aload_1         
	//   17   23:invokevirtual   #73  <Method Date DateFormat.parse(String)>
	//   18   26:astore_2        
		s = ((String) (parseexception));
	//   19   27:aload_2         
	//   20   28:astore_1        
		  goto _L1
	//*  21   29:goto            13
		parseexception;
	//   22   32:astore_2        
		parseexception = ((ParseException) (iso8601Format.parse(s)));
	//   23   33:aload_0         
	//   24   34:getfield        #47  <Field DateFormat iso8601Format>
	//   25   37:aload_1         
	//   26   38:invokevirtual   #73  <Method Date DateFormat.parse(String)>
	//   27   41:astore_2        
		s = ((String) (parseexception));
	//   28   42:aload_2         
	//   29   43:astore_1        
		  goto _L1
	//*  30   44:goto            13
		parseexception;
	//   31   47:astore_2        
		throw new JsonSyntaxException(s, ((Throwable) (parseexception)));
	//   32   48:new             #75  <Class JsonSyntaxException>
	//   33   51:dup             
	//   34   52:aload_1         
	//   35   53:aload_2         
	//   36   54:invokespecial   #78  <Method void JsonSyntaxException(String, Throwable)>
	//   37   57:athrow          
		s;
	//   38   58:astore_1        
		this;
	//   39   59:aload_0         
		JVM INSTR monitorexit ;
	//   40   60:monitorexit     
		throw s;
	//   41   61:aload_1         
	//   42   62:athrow          
	}

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #85  <Method Date read(JsonReader)>
	//    3    5:areturn         
	}

	public Date read(JsonReader jsonreader)
		throws IOException
	{
		if(jsonreader.peek() == JsonToken.NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #92  <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #98  <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #101 <Method void JsonReader.nextNull()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		} else
		{
			return deserializeToDate(jsonreader.nextString());
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #105 <Method String JsonReader.nextString()>
	//   11   21:invokespecial   #107 <Method Date deserializeToDate(String)>
	//   12   24:areturn         
		}
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (Date)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #111 <Class Date>
	//    4    6:invokevirtual   #114 <Method void write(JsonWriter, Date)>
	//    5    9:return          
	}

	public void write(JsonWriter jsonwriter, Date date)
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(date != null)
			break MISSING_BLOCK_LABEL_14;
	//    2    2:aload_2         
	//    3    3:ifnonnull       14
		jsonwriter.nullValue();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #120 <Method JsonWriter JsonWriter.nullValue()>
	//    6   10:pop             
_L1:
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		jsonwriter.value(enUsFormat.format(date));
	//   10   14:aload_1         
	//   11   15:aload_0         
	//   12   16:getfield        #36  <Field DateFormat enUsFormat>
	//   13   19:aload_2         
	//   14   20:invokevirtual   #124 <Method String DateFormat.format(Date)>
	//   15   23:invokevirtual   #128 <Method JsonWriter JsonWriter.value(String)>
	//   16   26:pop             
		  goto _L1
	//*  17   27:goto            11
		jsonwriter;
	//   18   30:astore_1        
	//*  19   31:aload_0         
		throw jsonwriter;
	//   20   32:monitorexit     
	//   21   33:aload_1         
	//   22   34:athrow          
	}

	public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() {

		public TypeAdapter create(Gson gson, TypeToken typetoken)
		{
			if(typetoken.getRawType() == java/util/Date)
		//*   0    0:aload_2         
		//*   1    1:invokevirtual   #21  <Method Class TypeToken.getRawType()>
		//*   2    4:ldc1            #23  <Class Date>
		//*   3    6:if_acmpne       17
				return ((TypeAdapter) (new DateTypeAdapter()));
		//    4    9:new             #8   <Class DateTypeAdapter>
		//    5   12:dup             
		//    6   13:invokespecial   #24  <Method void DateTypeAdapter()>
		//    7   16:areturn         
			else
				return null;
		//    8   17:aconst_null     
		//    9   18:areturn         
		}

	}
;
	private final DateFormat enUsFormat;
	private final DateFormat iso8601Format = buildIso8601Format();
	private final DateFormat localFormat = DateFormat.getDateTimeInstance(2, 2);

	static 
	{
	//    0    0:new             #7   <Class DateTypeAdapter$1>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void DateTypeAdapter$1()>
	//    3    7:putstatic       #20  <Field TypeAdapterFactory FACTORY>
	//*   4   10:return          
	}
}
