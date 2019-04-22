// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.json;

import com.apollographql.apollo.CustomTypeAdapter;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.ScalarType;
import com.apollographql.apollo.response.ScalarTypeAdapters;
import java.io.IOException;

// Referenced classes of package com.apollographql.apollo.internal.json:
//			InputFieldJsonWriter, JsonWriter

private static final class InputFieldJsonWriter$JsonListItemWriter
	implements com.apollographql.apollo.api.InputFieldWriter.ListItemWriter
{

	public void writeBoolean(Boolean boolean1)
		throws IOException
	{
		if(boolean1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			jsonWriter.nullValue();
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field JsonWriter jsonWriter>
	//    4    8:invokevirtual   #33  <Method JsonWriter JsonWriter.nullValue()>
	//    5   11:pop             
			return;
	//    6   12:return          
		} else
		{
			jsonWriter.value(boolean1);
	//    7   13:aload_0         
	//    8   14:getfield        #20  <Field JsonWriter jsonWriter>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #37  <Method JsonWriter JsonWriter.value(Boolean)>
	//   11   21:pop             
			return;
	//   12   22:return          
		}
	}

	public void writeCustom(ScalarType scalartype, Object obj)
		throws IOException
	{
		if(obj == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       13
		{
			jsonWriter.nullValue();
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field JsonWriter jsonWriter>
	//    4    8:invokevirtual   #33  <Method JsonWriter JsonWriter.nullValue()>
	//    5   11:pop             
			return;
	//    6   12:return          
		} else
		{
			writeString(scalarTypeAdapters.adapterFor(scalartype).encode(obj));
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #22  <Field ScalarTypeAdapters scalarTypeAdapters>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #46  <Method CustomTypeAdapter ScalarTypeAdapters.adapterFor(ScalarType)>
	//   12   22:aload_2         
	//   13   23:invokeinterface #52  <Method String CustomTypeAdapter.encode(Object)>
	//   14   28:invokevirtual   #56  <Method void writeString(String)>
			return;
	//   15   31:return          
		}
	}

	public void writeDouble(Double double1)
		throws IOException
	{
		if(double1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			jsonWriter.nullValue();
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field JsonWriter jsonWriter>
	//    4    8:invokevirtual   #33  <Method JsonWriter JsonWriter.nullValue()>
	//    5   11:pop             
			return;
	//    6   12:return          
		} else
		{
			jsonWriter.value(((Number) (double1)));
	//    7   13:aload_0         
	//    8   14:getfield        #20  <Field JsonWriter jsonWriter>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #61  <Method JsonWriter JsonWriter.value(Number)>
	//   11   21:pop             
			return;
	//   12   22:return          
		}
	}

	public void writeInt(Integer integer)
		throws IOException
	{
		if(integer == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			jsonWriter.nullValue();
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field JsonWriter jsonWriter>
	//    4    8:invokevirtual   #33  <Method JsonWriter JsonWriter.nullValue()>
	//    5   11:pop             
			return;
	//    6   12:return          
		} else
		{
			jsonWriter.value(((Number) (integer)));
	//    7   13:aload_0         
	//    8   14:getfield        #20  <Field JsonWriter jsonWriter>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #61  <Method JsonWriter JsonWriter.value(Number)>
	//   11   21:pop             
			return;
	//   12   22:return          
		}
	}

	public void writeList(com.apollographql.apollo.api.InputFieldWriter.ListWriter listwriter)
		throws IOException
	{
		if(listwriter == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			jsonWriter.nullValue();
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field JsonWriter jsonWriter>
	//    4    8:invokevirtual   #33  <Method JsonWriter JsonWriter.nullValue()>
	//    5   11:pop             
			return;
	//    6   12:return          
		} else
		{
			listwriter.write(((com.apollographql.apollo.api.InputFieldWriter.ListItemWriter) (new InputFieldJsonWriter$JsonListItemWriter(jsonWriter, scalarTypeAdapters))));
	//    7   13:aload_1         
	//    8   14:new             #2   <Class InputFieldJsonWriter$JsonListItemWriter>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:getfield        #20  <Field JsonWriter jsonWriter>
	//   12   22:aload_0         
	//   13   23:getfield        #22  <Field ScalarTypeAdapters scalarTypeAdapters>
	//   14   26:invokespecial   #67  <Method void InputFieldJsonWriter$JsonListItemWriter(JsonWriter, ScalarTypeAdapters)>
	//   15   29:invokeinterface #73  <Method void com.apollographql.apollo.api.InputFieldWriter$ListWriter.write(com.apollographql.apollo.api.InputFieldWriter$ListItemWriter)>
			return;
	//   16   34:return          
		}
	}

	public void writeLong(Long long1)
		throws IOException
	{
		if(long1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			jsonWriter.nullValue();
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field JsonWriter jsonWriter>
	//    4    8:invokevirtual   #33  <Method JsonWriter JsonWriter.nullValue()>
	//    5   11:pop             
			return;
	//    6   12:return          
		} else
		{
			jsonWriter.value(((Number) (long1)));
	//    7   13:aload_0         
	//    8   14:getfield        #20  <Field JsonWriter jsonWriter>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #61  <Method JsonWriter JsonWriter.value(Number)>
	//   11   21:pop             
			return;
	//   12   22:return          
		}
	}

	public void writeObject(InputFieldMarshaller inputfieldmarshaller)
		throws IOException
	{
		if(inputfieldmarshaller == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			jsonWriter.nullValue();
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field JsonWriter jsonWriter>
	//    4    8:invokevirtual   #33  <Method JsonWriter JsonWriter.nullValue()>
	//    5   11:pop             
			return;
	//    6   12:return          
		} else
		{
			jsonWriter.beginObject();
	//    7   13:aload_0         
	//    8   14:getfield        #20  <Field JsonWriter jsonWriter>
	//    9   17:invokevirtual   #80  <Method JsonWriter JsonWriter.beginObject()>
	//   10   20:pop             
			inputfieldmarshaller.marshal(((com.apollographql.apollo.api.InputFieldWriter) (new InputFieldJsonWriter(jsonWriter, scalarTypeAdapters))));
	//   11   21:aload_1         
	//   12   22:new             #8   <Class InputFieldJsonWriter>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:getfield        #20  <Field JsonWriter jsonWriter>
	//   16   30:aload_0         
	//   17   31:getfield        #22  <Field ScalarTypeAdapters scalarTypeAdapters>
	//   18   34:invokespecial   #81  <Method void InputFieldJsonWriter(JsonWriter, ScalarTypeAdapters)>
	//   19   37:invokeinterface #87  <Method void InputFieldMarshaller.marshal(com.apollographql.apollo.api.InputFieldWriter)>
			jsonWriter.endObject();
	//   20   42:aload_0         
	//   21   43:getfield        #20  <Field JsonWriter jsonWriter>
	//   22   46:invokevirtual   #90  <Method JsonWriter JsonWriter.endObject()>
	//   23   49:pop             
			return;
	//   24   50:return          
		}
	}

	public void writeString(String s)
		throws IOException
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			jsonWriter.nullValue();
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field JsonWriter jsonWriter>
	//    4    8:invokevirtual   #33  <Method JsonWriter JsonWriter.nullValue()>
	//    5   11:pop             
			return;
	//    6   12:return          
		} else
		{
			jsonWriter.value(s);
	//    7   13:aload_0         
	//    8   14:getfield        #20  <Field JsonWriter jsonWriter>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #93  <Method JsonWriter JsonWriter.value(String)>
	//   11   21:pop             
			return;
	//   12   22:return          
		}
	}

	private final JsonWriter jsonWriter;
	private final ScalarTypeAdapters scalarTypeAdapters;

	InputFieldJsonWriter$JsonListItemWriter(JsonWriter jsonwriter, ScalarTypeAdapters scalartypeadapters)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		jsonWriter = jsonwriter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field JsonWriter jsonWriter>
		scalarTypeAdapters = scalartypeadapters;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field ScalarTypeAdapters scalarTypeAdapters>
	//    8   14:return          
	}
}
