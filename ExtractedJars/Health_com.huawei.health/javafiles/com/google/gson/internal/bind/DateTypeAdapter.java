// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.*;
import java.io.IOException;
import java.text.*;
import java.util.Date;
import java.util.Locale;

public final class DateTypeAdapter extends TypeAdapter
{

	public DateTypeAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void TypeAdapter()>
		enUsFormat = DateFormat.getDateTimeInstance(2, 2, Locale.US);
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:iconst_2        
	//    5    7:getstatic       #27  <Field Locale Locale.US>
	//    6   10:invokestatic    #33  <Method DateFormat DateFormat.getDateTimeInstance(int, int, Locale)>
	//    7   13:putfield        #35  <Field DateFormat enUsFormat>
	//    8   16:aload_0         
	//    9   17:iconst_2        
	//   10   18:iconst_2        
	//   11   19:invokestatic    #38  <Method DateFormat DateFormat.getDateTimeInstance(int, int)>
	//   12   22:putfield        #40  <Field DateFormat localFormat>
	//   13   25:return          
	}

	private Date deserializeToDate(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Date date = localFormat.parse(s);
	//    2    2:aload_0         
	//    3    3:getfield        #40  <Field DateFormat localFormat>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #47  <Method Date DateFormat.parse(String)>
	//    6   10:astore_2        
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return date;
	//    9   13:aload_2         
	//   10   14:areturn         
		ParseException parseexception;
		parseexception;
	//   11   15:astore_2        
		parseexception = ((ParseException) (enUsFormat.parse(s)));
	//   12   16:aload_0         
	//   13   17:getfield        #35  <Field DateFormat enUsFormat>
	//   14   20:aload_1         
	//   15   21:invokevirtual   #47  <Method Date DateFormat.parse(String)>
	//   16   24:astore_2        
		this;
	//   17   25:aload_0         
		JVM INSTR monitorexit ;
	//   18   26:monitorexit     
		return ((Date) (parseexception));
	//   19   27:aload_2         
	//   20   28:areturn         
		parseexception;
	//   21   29:astore_2        
		parseexception = ((ParseException) (ISO8601Utils.parse(s, new ParsePosition(0))));
	//   22   30:aload_1         
	//   23   31:new             #49  <Class ParsePosition>
	//   24   34:dup             
	//   25   35:iconst_0        
	//   26   36:invokespecial   #52  <Method void ParsePosition(int)>
	//   27   39:invokestatic    #57  <Method Date ISO8601Utils.parse(String, ParsePosition)>
	//   28   42:astore_2        
		this;
	//   29   43:aload_0         
		JVM INSTR monitorexit ;
	//   30   44:monitorexit     
		return ((Date) (parseexception));
	//   31   45:aload_2         
	//   32   46:areturn         
		parseexception;
	//   33   47:astore_2        
		throw new JsonSyntaxException(s, ((Throwable) (parseexception)));
	//   34   48:new             #59  <Class JsonSyntaxException>
	//   35   51:dup             
	//   36   52:aload_1         
	//   37   53:aload_2         
	//   38   54:invokespecial   #62  <Method void JsonSyntaxException(String, Throwable)>
	//   39   57:athrow          
		s;
	//   40   58:astore_1        
		this;
	//   41   59:aload_0         
		JVM INSTR monitorexit ;
	//   42   60:monitorexit     
		throw s;
	//   43   61:aload_1         
	//   44   62:athrow          
	}

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #69  <Method Date read(JsonReader)>
	//    3    5:areturn         
	}

	public Date read(JsonReader jsonreader)
		throws IOException
	{
		if(jsonreader.peek() == JsonToken.NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #76  <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #82  <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #85  <Method void JsonReader.nextNull()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		} else
		{
			return deserializeToDate(jsonreader.nextString());
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #89  <Method String JsonReader.nextString()>
	//   11   21:invokespecial   #91  <Method Date deserializeToDate(String)>
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
	//    3    3:checkcast       #95  <Class Date>
	//    4    6:invokevirtual   #98  <Method void write(JsonWriter, Date)>
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
	//    5    7:invokevirtual   #104 <Method JsonWriter JsonWriter.nullValue()>
	//    6   10:pop             
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		jsonwriter.value(enUsFormat.format(date));
	//   10   14:aload_1         
	//   11   15:aload_0         
	//   12   16:getfield        #35  <Field DateFormat enUsFormat>
	//   13   19:aload_2         
	//   14   20:invokevirtual   #108 <Method String DateFormat.format(Date)>
	//   15   23:invokevirtual   #112 <Method JsonWriter JsonWriter.value(String)>
	//   16   26:pop             
		this;
	//   17   27:aload_0         
		JVM INSTR monitorexit ;
	//   18   28:monitorexit     
		return;
	//   19   29:return          
		jsonwriter;
	//   20   30:astore_1        
	//*  21   31:aload_0         
		throw jsonwriter;
	//   22   32:monitorexit     
	//   23   33:aload_1         
	//   24   34:athrow          
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
	private final DateFormat localFormat = DateFormat.getDateTimeInstance(2, 2);

	static 
	{
	//    0    0:new             #7   <Class DateTypeAdapter$1>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void DateTypeAdapter$1()>
	//    3    7:putstatic       #19  <Field TypeAdapterFactory FACTORY>
	//*   4   10:return          
	}
}
