// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.*;
import java.io.IOException;
import java.sql.Time;
import java.text.*;
import java.util.Date;

public final class TimeTypeAdapter extends TypeAdapter
{

	public TimeTypeAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void TypeAdapter()>
	//    2    4:aload_0         
	//    3    5:new             #22  <Class SimpleDateFormat>
	//    4    8:dup             
	//    5    9:ldc1            #24  <String "hh:mm:ss a">
	//    6   11:invokespecial   #27  <Method void SimpleDateFormat(String)>
	//    7   14:putfield        #29  <Field DateFormat format>
	//    8   17:return          
	}

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #36  <Method Time read(JsonReader)>
	//    3    5:areturn         
	}

	public Time read(JsonReader jsonreader)
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(jsonreader.peek() != JsonToken.NULL) goto _L2; else goto _L1
	//    2    2:aload_1         
	//    3    3:invokevirtual   #45  <Method JsonToken JsonReader.peek()>
	//    4    6:getstatic       #51  <Field JsonToken JsonToken.NULL>
	//    5    9:if_acmpne       22
_L1:
		jsonreader.nextNull();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #54  <Method void JsonReader.nextNull()>
		jsonreader = null;
	//    8   16:aconst_null     
	//    9   17:astore_1        
_L4:
		this;
	//   10   18:aload_0         
		JVM INSTR monitorexit ;
	//   11   19:monitorexit     
		return ((Time) (jsonreader));
	//   12   20:aload_1         
	//   13   21:areturn         
_L2:
		jsonreader = ((JsonReader) (new Time(format.parse(jsonreader.nextString()).getTime())));
	//   14   22:new             #56  <Class Time>
	//   15   25:dup             
	//   16   26:aload_0         
	//   17   27:getfield        #29  <Field DateFormat format>
	//   18   30:aload_1         
	//   19   31:invokevirtual   #60  <Method String JsonReader.nextString()>
	//   20   34:invokevirtual   #66  <Method Date DateFormat.parse(String)>
	//   21   37:invokevirtual   #72  <Method long Date.getTime()>
	//   22   40:invokespecial   #75  <Method void Time(long)>
	//   23   43:astore_1        
		if(true) goto _L4; else goto _L3
	//   24   44:goto            18
_L3:
		jsonreader;
	//   25   47:astore_1        
		throw new JsonSyntaxException(((Throwable) (jsonreader)));
	//   26   48:new             #77  <Class JsonSyntaxException>
	//   27   51:dup             
	//   28   52:aload_1         
	//   29   53:invokespecial   #80  <Method void JsonSyntaxException(Throwable)>
	//   30   56:athrow          
		jsonreader;
	//   31   57:astore_1        
		this;
	//   32   58:aload_0         
		JVM INSTR monitorexit ;
	//   33   59:monitorexit     
		throw jsonreader;
	//   34   60:aload_1         
	//   35   61:athrow          
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (Time)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #56  <Class Time>
	//    4    6:invokevirtual   #85  <Method void write(JsonWriter, Time)>
	//    5    9:return          
	}

	public void write(JsonWriter jsonwriter, Time time)
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(time != null) goto _L2; else goto _L1
	//    2    2:aload_2         
	//    3    3:ifnonnull       17
_L1:
		time = null;
	//    4    6:aconst_null     
	//    5    7:astore_2        
_L4:
		jsonwriter.value(((String) (time)));
	//    6    8:aload_1         
	//    7    9:aload_2         
	//    8   10:invokevirtual   #91  <Method JsonWriter JsonWriter.value(String)>
	//    9   13:pop             
		this;
	//   10   14:aload_0         
		JVM INSTR monitorexit ;
	//   11   15:monitorexit     
		return;
	//   12   16:return          
_L2:
		time = ((Time) (format.format(((Date) (time)))));
	//   13   17:aload_0         
	//   14   18:getfield        #29  <Field DateFormat format>
	//   15   21:aload_2         
	//   16   22:invokevirtual   #94  <Method String DateFormat.format(Date)>
	//   17   25:astore_2        
		if(true) goto _L4; else goto _L3
	//   18   26:goto            8
_L3:
		jsonwriter;
	//   19   29:astore_1        
	//*  20   30:aload_0         
		throw jsonwriter;
	//   21   31:monitorexit     
	//   22   32:aload_1         
	//   23   33:athrow          
	}

	public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() {

		public TypeAdapter create(Gson gson, TypeToken typetoken)
		{
			if(typetoken.getRawType() == java/sql/Time)
		//*   0    0:aload_2         
		//*   1    1:invokevirtual   #21  <Method Class TypeToken.getRawType()>
		//*   2    4:ldc1            #23  <Class Time>
		//*   3    6:if_acmpne       17
				return ((TypeAdapter) (new TimeTypeAdapter()));
		//    4    9:new             #8   <Class TimeTypeAdapter>
		//    5   12:dup             
		//    6   13:invokespecial   #24  <Method void TimeTypeAdapter()>
		//    7   16:areturn         
			else
				return null;
		//    8   17:aconst_null     
		//    9   18:areturn         
		}

	}
;
	private final DateFormat format = new SimpleDateFormat("hh:mm:ss a");

	static 
	{
	//    0    0:new             #7   <Class TimeTypeAdapter$1>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void TimeTypeAdapter$1()>
	//    3    7:putstatic       #18  <Field TypeAdapterFactory FACTORY>
	//*   4   10:return          
	}
}
