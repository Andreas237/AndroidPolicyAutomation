// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class SqlDateTypeAdapter extends TypeAdapter
{

	public SqlDateTypeAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void TypeAdapter()>
	//    2    4:aload_0         
	//    3    5:new             #22  <Class SimpleDateFormat>
	//    4    8:dup             
	//    5    9:ldc1            #24  <String "MMM d, yyyy">
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
	//    2    2:invokevirtual   #36  <Method Date read(JsonReader)>
	//    3    5:areturn         
	}

	public Date read(JsonReader jsonreader)
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(jsonreader.peek() != JsonToken.NULL)
			break MISSING_BLOCK_LABEL_20;
	//    2    2:aload_1         
	//    3    3:invokevirtual   #45  <Method JsonToken JsonReader.peek()>
	//    4    6:getstatic       #51  <Field JsonToken JsonToken.NULL>
	//    5    9:if_acmpne       20
		jsonreader.nextNull();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #54  <Method void JsonReader.nextNull()>
		this;
	//    8   16:aload_0         
		JVM INSTR monitorexit ;
	//    9   17:monitorexit     
		return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		jsonreader = ((JsonReader) (new Date(format.parse(jsonreader.nextString()).getTime())));
	//   12   20:new             #56  <Class Date>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:getfield        #29  <Field DateFormat format>
	//   16   28:aload_1         
	//   17   29:invokevirtual   #60  <Method String JsonReader.nextString()>
	//   18   32:invokevirtual   #66  <Method java.util.Date DateFormat.parse(String)>
	//   19   35:invokevirtual   #72  <Method long java.util.Date.getTime()>
	//   20   38:invokespecial   #75  <Method void Date(long)>
	//   21   41:astore_1        
		this;
	//   22   42:aload_0         
		JVM INSTR monitorexit ;
	//   23   43:monitorexit     
		return ((Date) (jsonreader));
	//   24   44:aload_1         
	//   25   45:areturn         
		jsonreader;
	//   26   46:astore_1        
		throw new JsonSyntaxException(((Throwable) (jsonreader)));
	//   27   47:new             #77  <Class JsonSyntaxException>
	//   28   50:dup             
	//   29   51:aload_1         
	//   30   52:invokespecial   #80  <Method void JsonSyntaxException(Throwable)>
	//   31   55:athrow          
		jsonreader;
	//   32   56:astore_1        
		this;
	//   33   57:aload_0         
		JVM INSTR monitorexit ;
	//   34   58:monitorexit     
		throw jsonreader;
	//   35   59:aload_1         
	//   36   60:athrow          
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (Date)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #56  <Class Date>
	//    4    6:invokevirtual   #85  <Method void write(JsonWriter, Date)>
	//    5    9:return          
	}

	public void write(JsonWriter jsonwriter, Date date)
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(date == null)
	//*   2    2:aload_2         
	//*   3    3:ifnonnull       11
		{
			date = null;
	//    4    6:aconst_null     
	//    5    7:astore_2        
			break MISSING_BLOCK_LABEL_20;
	//    6    8:goto            20
		}
		date = ((Date) (format.format(((java.util.Date) (date)))));
	//    7   11:aload_0         
	//    8   12:getfield        #29  <Field DateFormat format>
	//    9   15:aload_2         
	//   10   16:invokevirtual   #88  <Method String DateFormat.format(java.util.Date)>
	//   11   19:astore_2        
		jsonwriter.value(((String) (date)));
	//   12   20:aload_1         
	//   13   21:aload_2         
	//   14   22:invokevirtual   #94  <Method JsonWriter JsonWriter.value(String)>
	//   15   25:pop             
		this;
	//   16   26:aload_0         
		JVM INSTR monitorexit ;
	//   17   27:monitorexit     
		return;
	//   18   28:return          
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
			if(typetoken.getRawType() == java/sql/Date)
		//*   0    0:aload_2         
		//*   1    1:invokevirtual   #21  <Method Class TypeToken.getRawType()>
		//*   2    4:ldc1            #23  <Class Date>
		//*   3    6:if_acmpne       17
				return ((TypeAdapter) (new SqlDateTypeAdapter()));
		//    4    9:new             #8   <Class SqlDateTypeAdapter>
		//    5   12:dup             
		//    6   13:invokespecial   #24  <Method void SqlDateTypeAdapter()>
		//    7   16:areturn         
			else
				return null;
		//    8   17:aconst_null     
		//    9   18:areturn         
		}

	}
;
	private final DateFormat format = new SimpleDateFormat("MMM d, yyyy");

	static 
	{
	//    0    0:new             #7   <Class SqlDateTypeAdapter$1>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void SqlDateTypeAdapter$1()>
	//    3    7:putstatic       #18  <Field TypeAdapterFactory FACTORY>
	//*   4   10:return          
	}
}
