// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.*;
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
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return date;
	//    9   13:aload_2         
	//   10   14:areturn         
		s;
	//   11   15:astore_1        
		  goto _L1
	//*  12   16:goto            56
_L2:
		date = enUsFormat.parse(s);
	//   13   19:aload_0         
	//   14   20:getfield        #36  <Field DateFormat enUsFormat>
	//   15   23:aload_1         
	//   16   24:invokevirtual   #73  <Method Date DateFormat.parse(String)>
	//   17   27:astore_2        
		this;
	//   18   28:aload_0         
		JVM INSTR monitorexit ;
	//   19   29:monitorexit     
		return date;
	//   20   30:aload_2         
	//   21   31:areturn         
_L3:
		date = iso8601Format.parse(s);
	//   22   32:aload_0         
	//   23   33:getfield        #47  <Field DateFormat iso8601Format>
	//   24   36:aload_1         
	//   25   37:invokevirtual   #73  <Method Date DateFormat.parse(String)>
	//   26   40:astore_2        
		this;
	//   27   41:aload_0         
		JVM INSTR monitorexit ;
	//   28   42:monitorexit     
		return date;
	//   29   43:aload_2         
	//   30   44:areturn         
		ParseException parseexception;
		parseexception;
	//   31   45:astore_2        
		throw new JsonSyntaxException(s, ((Throwable) (parseexception)));
	//   32   46:new             #75  <Class JsonSyntaxException>
	//   33   49:dup             
	//   34   50:aload_1         
	//   35   51:aload_2         
	//   36   52:invokespecial   #78  <Method void JsonSyntaxException(String, Throwable)>
	//   37   55:athrow          
	//*  38   56:aload_0         
_L1:
		throw s;
	//   39   57:monitorexit     
	//   40   58:aload_1         
	//   41   59:athrow          
		parseexception;
	//   42   60:astore_2        
		  goto _L2
	//*  43   61:goto            19
		parseexception;
	//   44   64:astore_2        
		  goto _L3
	//*  45   65:goto            32
	}

	public volatile Object read(JsonReader jsonreader)
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #83  <Method Date read(JsonReader)>
	//    3    5:areturn         
	}

	public Date read(JsonReader jsonreader)
	{
		if(jsonreader.peek() == JsonToken.NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #89  <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #95  <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #98  <Method void JsonReader.nextNull()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		} else
		{
			return deserializeToDate(jsonreader.nextString());
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #102 <Method String JsonReader.nextString()>
	//   11   21:invokespecial   #104 <Method Date deserializeToDate(String)>
	//   12   24:areturn         
		}
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
	{
		write(jsonwriter, (Date)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #108 <Class Date>
	//    4    6:invokevirtual   #111 <Method void write(JsonWriter, Date)>
	//    5    9:return          
	}

	public void write(JsonWriter jsonwriter, Date date)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(date != null)
			break MISSING_BLOCK_LABEL_18;
	//    2    2:aload_2         
	//    3    3:ifnonnull       18
		jsonwriter.nullValue();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #117 <Method JsonWriter JsonWriter.nullValue()>
	//    6   10:pop             
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		jsonwriter;
	//   10   14:astore_1        
		break MISSING_BLOCK_LABEL_35;
	//   11   15:goto            34
		jsonwriter.value(enUsFormat.format(date));
	//   12   18:aload_1         
	//   13   19:aload_0         
	//   14   20:getfield        #36  <Field DateFormat enUsFormat>
	//   15   23:aload_2         
	//   16   24:invokevirtual   #121 <Method String DateFormat.format(Date)>
	//   17   27:invokevirtual   #125 <Method JsonWriter JsonWriter.value(String)>
	//   18   30:pop             
		this;
	//   19   31:aload_0         
		JVM INSTR monitorexit ;
	//   20   32:monitorexit     
		return;
	//   21   33:return          
	//*  22   34:aload_0         
		throw jsonwriter;
	//   23   35:monitorexit     
	//   24   36:aload_1         
	//   25   37:athrow          
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
