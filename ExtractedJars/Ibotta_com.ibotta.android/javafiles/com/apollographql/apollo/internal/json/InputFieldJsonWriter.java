// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.json;

import com.apollographql.apollo.CustomTypeAdapter;
import com.apollographql.apollo.api.*;
import com.apollographql.apollo.api.internal.Utils;
import com.apollographql.apollo.response.ScalarTypeAdapters;
import java.io.IOException;

// Referenced classes of package com.apollographql.apollo.internal.json:
//			JsonWriter

public class InputFieldJsonWriter
	implements InputFieldWriter
{
	private static final class JsonListItemWriter
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
				listwriter.write(((com.apollographql.apollo.api.InputFieldWriter.ListItemWriter) (new JsonListItemWriter(jsonWriter, scalarTypeAdapters))));
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
				inputfieldmarshaller.marshal(((InputFieldWriter) (new InputFieldJsonWriter(jsonWriter, scalarTypeAdapters))));
		//   11   21:aload_1         
		//   12   22:new             #8   <Class InputFieldJsonWriter>
		//   13   25:dup             
		//   14   26:aload_0         
		//   15   27:getfield        #20  <Field JsonWriter jsonWriter>
		//   16   30:aload_0         
		//   17   31:getfield        #22  <Field ScalarTypeAdapters scalarTypeAdapters>
		//   18   34:invokespecial   #81  <Method void InputFieldJsonWriter(JsonWriter, ScalarTypeAdapters)>
		//   19   37:invokeinterface #87  <Method void InputFieldMarshaller.marshal(InputFieldWriter)>
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

		JsonListItemWriter(JsonWriter jsonwriter, ScalarTypeAdapters scalartypeadapters)
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


	public InputFieldJsonWriter(JsonWriter jsonwriter, ScalarTypeAdapters scalartypeadapters)
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

	public void writeBoolean(String s, Boolean boolean1)
		throws IOException
	{
		Utils.checkNotNull(((Object) (s)), "fieldName == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #30  <String "fieldName == null">
	//    2    3:invokestatic    #36  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		if(boolean1 != null)
	//*   4    7:aload_2         
	//*   5    8:ifnull          25
		{
			jsonWriter.name(s).value(boolean1);
	//    6   11:aload_0         
	//    7   12:getfield        #20  <Field JsonWriter jsonWriter>
	//    8   15:aload_1         
	//    9   16:invokevirtual   #42  <Method JsonWriter JsonWriter.name(String)>
	//   10   19:aload_2         
	//   11   20:invokevirtual   #46  <Method JsonWriter JsonWriter.value(Boolean)>
	//   12   23:pop             
			return;
	//   13   24:return          
		} else
		{
			jsonWriter.name(s).nullValue();
	//   14   25:aload_0         
	//   15   26:getfield        #20  <Field JsonWriter jsonWriter>
	//   16   29:aload_1         
	//   17   30:invokevirtual   #42  <Method JsonWriter JsonWriter.name(String)>
	//   18   33:invokevirtual   #50  <Method JsonWriter JsonWriter.nullValue()>
	//   19   36:pop             
			return;
	//   20   37:return          
		}
	}

	public void writeCustom(String s, ScalarType scalartype, Object obj)
		throws IOException
	{
		Utils.checkNotNull(((Object) (s)), "fieldName == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #30  <String "fieldName == null">
	//    2    3:invokestatic    #36  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		if(obj != null)
	//*   4    7:aload_3         
	//*   5    8:ifnull          31
		{
			writeString(s, scalarTypeAdapters.adapterFor(scalartype).encode(obj));
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:aload_0         
	//    9   14:getfield        #22  <Field ScalarTypeAdapters scalarTypeAdapters>
	//   10   17:aload_2         
	//   11   18:invokevirtual   #60  <Method CustomTypeAdapter ScalarTypeAdapters.adapterFor(ScalarType)>
	//   12   21:aload_3         
	//   13   22:invokeinterface #66  <Method String CustomTypeAdapter.encode(Object)>
	//   14   27:invokevirtual   #70  <Method void writeString(String, String)>
			return;
	//   15   30:return          
		} else
		{
			writeString(s, ((String) (null)));
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:aconst_null     
	//   19   34:invokevirtual   #70  <Method void writeString(String, String)>
			return;
	//   20   37:return          
		}
	}

	public void writeDouble(String s, Double double1)
		throws IOException
	{
		Utils.checkNotNull(((Object) (s)), "fieldName == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #30  <String "fieldName == null">
	//    2    3:invokestatic    #36  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		if(double1 != null)
	//*   4    7:aload_2         
	//*   5    8:ifnull          25
		{
			jsonWriter.name(s).value(((Number) (double1)));
	//    6   11:aload_0         
	//    7   12:getfield        #20  <Field JsonWriter jsonWriter>
	//    8   15:aload_1         
	//    9   16:invokevirtual   #42  <Method JsonWriter JsonWriter.name(String)>
	//   10   19:aload_2         
	//   11   20:invokevirtual   #75  <Method JsonWriter JsonWriter.value(Number)>
	//   12   23:pop             
			return;
	//   13   24:return          
		} else
		{
			jsonWriter.name(s).nullValue();
	//   14   25:aload_0         
	//   15   26:getfield        #20  <Field JsonWriter jsonWriter>
	//   16   29:aload_1         
	//   17   30:invokevirtual   #42  <Method JsonWriter JsonWriter.name(String)>
	//   18   33:invokevirtual   #50  <Method JsonWriter JsonWriter.nullValue()>
	//   19   36:pop             
			return;
	//   20   37:return          
		}
	}

	public void writeInt(String s, Integer integer)
		throws IOException
	{
		Utils.checkNotNull(((Object) (s)), "fieldName == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #30  <String "fieldName == null">
	//    2    3:invokestatic    #36  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		if(integer != null)
	//*   4    7:aload_2         
	//*   5    8:ifnull          25
		{
			jsonWriter.name(s).value(((Number) (integer)));
	//    6   11:aload_0         
	//    7   12:getfield        #20  <Field JsonWriter jsonWriter>
	//    8   15:aload_1         
	//    9   16:invokevirtual   #42  <Method JsonWriter JsonWriter.name(String)>
	//   10   19:aload_2         
	//   11   20:invokevirtual   #75  <Method JsonWriter JsonWriter.value(Number)>
	//   12   23:pop             
			return;
	//   13   24:return          
		} else
		{
			jsonWriter.name(s).nullValue();
	//   14   25:aload_0         
	//   15   26:getfield        #20  <Field JsonWriter jsonWriter>
	//   16   29:aload_1         
	//   17   30:invokevirtual   #42  <Method JsonWriter JsonWriter.name(String)>
	//   18   33:invokevirtual   #50  <Method JsonWriter JsonWriter.nullValue()>
	//   19   36:pop             
			return;
	//   20   37:return          
		}
	}

	public void writeList(String s, com.apollographql.apollo.api.InputFieldWriter.ListWriter listwriter)
		throws IOException
	{
		Utils.checkNotNull(((Object) (s)), "fieldName == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #30  <String "fieldName == null">
	//    2    3:invokestatic    #36  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		if(listwriter != null)
	//*   4    7:aload_2         
	//*   5    8:ifnull          53
		{
			jsonWriter.name(s).beginArray();
	//    6   11:aload_0         
	//    7   12:getfield        #20  <Field JsonWriter jsonWriter>
	//    8   15:aload_1         
	//    9   16:invokevirtual   #42  <Method JsonWriter JsonWriter.name(String)>
	//   10   19:invokevirtual   #82  <Method JsonWriter JsonWriter.beginArray()>
	//   11   22:pop             
			listwriter.write(((com.apollographql.apollo.api.InputFieldWriter.ListItemWriter) (new JsonListItemWriter(jsonWriter, scalarTypeAdapters))));
	//   12   23:aload_2         
	//   13   24:new             #8   <Class InputFieldJsonWriter$JsonListItemWriter>
	//   14   27:dup             
	//   15   28:aload_0         
	//   16   29:getfield        #20  <Field JsonWriter jsonWriter>
	//   17   32:aload_0         
	//   18   33:getfield        #22  <Field ScalarTypeAdapters scalarTypeAdapters>
	//   19   36:invokespecial   #84  <Method void InputFieldJsonWriter$JsonListItemWriter(JsonWriter, ScalarTypeAdapters)>
	//   20   39:invokeinterface #90  <Method void com.apollographql.apollo.api.InputFieldWriter$ListWriter.write(com.apollographql.apollo.api.InputFieldWriter$ListItemWriter)>
			jsonWriter.endArray();
	//   21   44:aload_0         
	//   22   45:getfield        #20  <Field JsonWriter jsonWriter>
	//   23   48:invokevirtual   #93  <Method JsonWriter JsonWriter.endArray()>
	//   24   51:pop             
			return;
	//   25   52:return          
		} else
		{
			jsonWriter.name(s).nullValue();
	//   26   53:aload_0         
	//   27   54:getfield        #20  <Field JsonWriter jsonWriter>
	//   28   57:aload_1         
	//   29   58:invokevirtual   #42  <Method JsonWriter JsonWriter.name(String)>
	//   30   61:invokevirtual   #50  <Method JsonWriter JsonWriter.nullValue()>
	//   31   64:pop             
			return;
	//   32   65:return          
		}
	}

	public void writeLong(String s, Long long1)
		throws IOException
	{
		Utils.checkNotNull(((Object) (s)), "fieldName == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #30  <String "fieldName == null">
	//    2    3:invokestatic    #36  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		if(long1 != null)
	//*   4    7:aload_2         
	//*   5    8:ifnull          25
		{
			jsonWriter.name(s).value(((Number) (long1)));
	//    6   11:aload_0         
	//    7   12:getfield        #20  <Field JsonWriter jsonWriter>
	//    8   15:aload_1         
	//    9   16:invokevirtual   #42  <Method JsonWriter JsonWriter.name(String)>
	//   10   19:aload_2         
	//   11   20:invokevirtual   #75  <Method JsonWriter JsonWriter.value(Number)>
	//   12   23:pop             
			return;
	//   13   24:return          
		} else
		{
			jsonWriter.name(s).nullValue();
	//   14   25:aload_0         
	//   15   26:getfield        #20  <Field JsonWriter jsonWriter>
	//   16   29:aload_1         
	//   17   30:invokevirtual   #42  <Method JsonWriter JsonWriter.name(String)>
	//   18   33:invokevirtual   #50  <Method JsonWriter JsonWriter.nullValue()>
	//   19   36:pop             
			return;
	//   20   37:return          
		}
	}

	public void writeObject(String s, InputFieldMarshaller inputfieldmarshaller)
		throws IOException
	{
		Utils.checkNotNull(((Object) (s)), "fieldName == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #30  <String "fieldName == null">
	//    2    3:invokestatic    #36  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		if(inputfieldmarshaller != null)
	//*   4    7:aload_2         
	//*   5    8:ifnull          39
		{
			jsonWriter.name(s).beginObject();
	//    6   11:aload_0         
	//    7   12:getfield        #20  <Field JsonWriter jsonWriter>
	//    8   15:aload_1         
	//    9   16:invokevirtual   #42  <Method JsonWriter JsonWriter.name(String)>
	//   10   19:invokevirtual   #100 <Method JsonWriter JsonWriter.beginObject()>
	//   11   22:pop             
			inputfieldmarshaller.marshal(((InputFieldWriter) (this)));
	//   12   23:aload_2         
	//   13   24:aload_0         
	//   14   25:invokeinterface #106 <Method void InputFieldMarshaller.marshal(InputFieldWriter)>
			jsonWriter.endObject();
	//   15   30:aload_0         
	//   16   31:getfield        #20  <Field JsonWriter jsonWriter>
	//   17   34:invokevirtual   #109 <Method JsonWriter JsonWriter.endObject()>
	//   18   37:pop             
			return;
	//   19   38:return          
		} else
		{
			jsonWriter.name(s).nullValue();
	//   20   39:aload_0         
	//   21   40:getfield        #20  <Field JsonWriter jsonWriter>
	//   22   43:aload_1         
	//   23   44:invokevirtual   #42  <Method JsonWriter JsonWriter.name(String)>
	//   24   47:invokevirtual   #50  <Method JsonWriter JsonWriter.nullValue()>
	//   25   50:pop             
			return;
	//   26   51:return          
		}
	}

	public void writeString(String s, String s1)
		throws IOException
	{
		Utils.checkNotNull(((Object) (s)), "fieldName == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #30  <String "fieldName == null">
	//    2    3:invokestatic    #36  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		if(s1 != null)
	//*   4    7:aload_2         
	//*   5    8:ifnull          25
		{
			jsonWriter.name(s).value(s1);
	//    6   11:aload_0         
	//    7   12:getfield        #20  <Field JsonWriter jsonWriter>
	//    8   15:aload_1         
	//    9   16:invokevirtual   #42  <Method JsonWriter JsonWriter.name(String)>
	//   10   19:aload_2         
	//   11   20:invokevirtual   #111 <Method JsonWriter JsonWriter.value(String)>
	//   12   23:pop             
			return;
	//   13   24:return          
		} else
		{
			jsonWriter.name(s).nullValue();
	//   14   25:aload_0         
	//   15   26:getfield        #20  <Field JsonWriter jsonWriter>
	//   16   29:aload_1         
	//   17   30:invokevirtual   #42  <Method JsonWriter JsonWriter.name(String)>
	//   18   33:invokevirtual   #50  <Method JsonWriter JsonWriter.nullValue()>
	//   19   36:pop             
			return;
	//   20   37:return          
		}
	}

	private final JsonWriter jsonWriter;
	private final ScalarTypeAdapters scalarTypeAdapters;
}
