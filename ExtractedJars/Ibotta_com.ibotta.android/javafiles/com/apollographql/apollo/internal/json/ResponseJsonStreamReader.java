// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.json;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

// Referenced classes of package com.apollographql.apollo.internal.json:
//			JsonReader

public class ResponseJsonStreamReader
{
	public static interface ListReader
	{

		public abstract Object read(ResponseJsonStreamReader responsejsonstreamreader)
			throws IOException;
	}

	public static interface ObjectReader
	{

		public abstract Object read(ResponseJsonStreamReader responsejsonstreamreader)
			throws IOException;
	}


	public ResponseJsonStreamReader(JsonReader jsonreader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		jsonReader = jsonreader;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field JsonReader jsonReader>
	//    5    9:return          
	}

	private void checkNextValue(boolean flag)
		throws IOException
	{
		if(!flag)
	//*   0    0:iload_1         
	//*   1    1:ifne            28
		{
			if(jsonReader.peek() != JsonReader.Token.NULL)
	//*   2    4:aload_0         
	//*   3    5:getfield        #23  <Field JsonReader jsonReader>
	//*   4    8:invokevirtual   #34  <Method JsonReader$Token JsonReader.peek()>
	//*   5   11:getstatic       #40  <Field JsonReader$Token JsonReader$Token.NULL>
	//*   6   14:if_acmpeq       18
				return;
	//    7   17:return          
			else
				throw new NullPointerException("corrupted response reader, expected non null value");
	//    8   18:new             #42  <Class NullPointerException>
	//    9   21:dup             
	//   10   22:ldc1            #44  <String "corrupted response reader, expected non null value">
	//   11   24:invokespecial   #47  <Method void NullPointerException(String)>
	//   12   27:athrow          
		} else
		{
			return;
	//   13   28:return          
		}
	}

	private boolean isNextBoolean()
		throws IOException
	{
		return jsonReader.peek() == JsonReader.Token.BOOLEAN;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field JsonReader jsonReader>
	//    2    4:invokevirtual   #34  <Method JsonReader$Token JsonReader.peek()>
	//    3    7:getstatic       #53  <Field JsonReader$Token JsonReader$Token.BOOLEAN>
	//    4   10:if_acmpne       15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	private boolean isNextNull()
		throws IOException
	{
		return jsonReader.peek() == JsonReader.Token.NULL;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field JsonReader jsonReader>
	//    2    4:invokevirtual   #34  <Method JsonReader$Token JsonReader.peek()>
	//    3    7:getstatic       #40  <Field JsonReader$Token JsonReader$Token.NULL>
	//    4   10:if_acmpne       15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	private boolean isNextNumber()
		throws IOException
	{
		return jsonReader.peek() == JsonReader.Token.NUMBER;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field JsonReader jsonReader>
	//    2    4:invokevirtual   #34  <Method JsonReader$Token JsonReader.peek()>
	//    3    7:getstatic       #58  <Field JsonReader$Token JsonReader$Token.NUMBER>
	//    4   10:if_acmpne       15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public boolean hasNext()
		throws IOException
	{
		return jsonReader.hasNext();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field JsonReader jsonReader>
	//    2    4:invokevirtual   #61  <Method boolean JsonReader.hasNext()>
	//    3    7:ireturn         
	}

	boolean isNextList()
		throws IOException
	{
		return jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field JsonReader jsonReader>
	//    2    4:invokevirtual   #34  <Method JsonReader$Token JsonReader.peek()>
	//    3    7:getstatic       #65  <Field JsonReader$Token JsonReader$Token.BEGIN_ARRAY>
	//    4   10:if_acmpne       15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	boolean isNextObject()
		throws IOException
	{
		return jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field JsonReader jsonReader>
	//    2    4:invokevirtual   #34  <Method JsonReader$Token JsonReader.peek()>
	//    3    7:getstatic       #69  <Field JsonReader$Token JsonReader$Token.BEGIN_OBJECT>
	//    4   10:if_acmpne       15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public Boolean nextBoolean(boolean flag)
		throws IOException
	{
		checkNextValue(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #73  <Method void checkNextValue(boolean)>
		if(jsonReader.peek() == JsonReader.Token.NULL)
	//*   3    5:aload_0         
	//*   4    6:getfield        #23  <Field JsonReader jsonReader>
	//*   5    9:invokevirtual   #34  <Method JsonReader$Token JsonReader.peek()>
	//*   6   12:getstatic       #40  <Field JsonReader$Token JsonReader$Token.NULL>
	//*   7   15:if_acmpne       27
		{
			jsonReader.skipValue();
	//    8   18:aload_0         
	//    9   19:getfield        #23  <Field JsonReader jsonReader>
	//   10   22:invokevirtual   #76  <Method void JsonReader.skipValue()>
			return null;
	//   11   25:aconst_null     
	//   12   26:areturn         
		} else
		{
			return Boolean.valueOf(jsonReader.nextBoolean());
	//   13   27:aload_0         
	//   14   28:getfield        #23  <Field JsonReader jsonReader>
	//   15   31:invokevirtual   #78  <Method boolean JsonReader.nextBoolean()>
	//   16   34:invokestatic    #83  <Method Boolean Boolean.valueOf(boolean)>
	//   17   37:areturn         
		}
	}

	public List nextList(boolean flag, ListReader listreader)
		throws IOException
	{
		checkNextValue(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #73  <Method void checkNextValue(boolean)>
		if(jsonReader.peek() == JsonReader.Token.NULL)
	//*   3    5:aload_0         
	//*   4    6:getfield        #23  <Field JsonReader jsonReader>
	//*   5    9:invokevirtual   #34  <Method JsonReader$Token JsonReader.peek()>
	//*   6   12:getstatic       #40  <Field JsonReader$Token JsonReader$Token.NULL>
	//*   7   15:if_acmpne       27
		{
			jsonReader.skipValue();
	//    8   18:aload_0         
	//    9   19:getfield        #23  <Field JsonReader jsonReader>
	//   10   22:invokevirtual   #76  <Method void JsonReader.skipValue()>
			return null;
	//   11   25:aconst_null     
	//   12   26:areturn         
		}
		ArrayList arraylist = new ArrayList();
	//   13   27:new             #87  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #88  <Method void ArrayList()>
	//   16   34:astore_3        
		jsonReader.beginArray();
	//   17   35:aload_0         
	//   18   36:getfield        #23  <Field JsonReader jsonReader>
	//   19   39:invokevirtual   #91  <Method void JsonReader.beginArray()>
		for(; jsonReader.hasNext(); ((List) (arraylist)).add(listreader.read(this)));
	//   20   42:aload_0         
	//   21   43:getfield        #23  <Field JsonReader jsonReader>
	//   22   46:invokevirtual   #61  <Method boolean JsonReader.hasNext()>
	//   23   49:ifeq            69
	//   24   52:aload_3         
	//   25   53:aload_2         
	//   26   54:aload_0         
	//   27   55:invokeinterface #95  <Method Object ResponseJsonStreamReader$ListReader.read(ResponseJsonStreamReader)>
	//   28   60:invokeinterface #101 <Method boolean List.add(Object)>
	//   29   65:pop             
	//*  30   66:goto            42
		jsonReader.endArray();
	//   31   69:aload_0         
	//   32   70:getfield        #23  <Field JsonReader jsonReader>
	//   33   73:invokevirtual   #104 <Method void JsonReader.endArray()>
		return ((List) (arraylist));
	//   34   76:aload_3         
	//   35   77:areturn         
	}

	public String nextName()
		throws IOException
	{
		return jsonReader.nextName();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field JsonReader jsonReader>
	//    2    4:invokevirtual   #110 <Method String JsonReader.nextName()>
	//    3    7:areturn         
	}

	public Object nextObject(boolean flag, ObjectReader objectreader)
		throws IOException
	{
		checkNextValue(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #73  <Method void checkNextValue(boolean)>
		if(jsonReader.peek() == JsonReader.Token.NULL)
	//*   3    5:aload_0         
	//*   4    6:getfield        #23  <Field JsonReader jsonReader>
	//*   5    9:invokevirtual   #34  <Method JsonReader$Token JsonReader.peek()>
	//*   6   12:getstatic       #40  <Field JsonReader$Token JsonReader$Token.NULL>
	//*   7   15:if_acmpne       27
		{
			jsonReader.skipValue();
	//    8   18:aload_0         
	//    9   19:getfield        #23  <Field JsonReader jsonReader>
	//   10   22:invokevirtual   #76  <Method void JsonReader.skipValue()>
			return ((Object) (null));
	//   11   25:aconst_null     
	//   12   26:areturn         
		} else
		{
			jsonReader.beginObject();
	//   13   27:aload_0         
	//   14   28:getfield        #23  <Field JsonReader jsonReader>
	//   15   31:invokevirtual   #115 <Method void JsonReader.beginObject()>
			objectreader = ((ObjectReader) (objectreader.read(this)));
	//   16   34:aload_2         
	//   17   35:aload_0         
	//   18   36:invokeinterface #116 <Method Object ResponseJsonStreamReader$ObjectReader.read(ResponseJsonStreamReader)>
	//   19   41:astore_2        
			jsonReader.endObject();
	//   20   42:aload_0         
	//   21   43:getfield        #23  <Field JsonReader jsonReader>
	//   22   46:invokevirtual   #119 <Method void JsonReader.endObject()>
			return ((Object) (objectreader));
	//   23   49:aload_2         
	//   24   50:areturn         
		}
	}

	public Object nextScalar(boolean flag)
		throws IOException
	{
		checkNextValue(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #73  <Method void checkNextValue(boolean)>
		if(isNextNull())
	//*   3    5:aload_0         
	//*   4    6:invokespecial   #124 <Method boolean isNextNull()>
	//*   5    9:ifeq            18
		{
			skipNext();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #127 <Method void skipNext()>
			return ((Object) (null));
	//    8   16:aconst_null     
	//    9   17:areturn         
		}
		if(isNextBoolean())
	//*  10   18:aload_0         
	//*  11   19:invokespecial   #129 <Method boolean isNextBoolean()>
	//*  12   22:ifeq            31
			return ((Object) (nextBoolean(false)));
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #131 <Method Boolean nextBoolean(boolean)>
	//   16   30:areturn         
		if(isNextNumber())
	//*  17   31:aload_0         
	//*  18   32:invokespecial   #133 <Method boolean isNextNumber()>
	//*  19   35:ifeq            51
			return ((Object) (new BigDecimal(nextString(false))));
	//   20   38:new             #135 <Class BigDecimal>
	//   21   41:dup             
	//   22   42:aload_0         
	//   23   43:iconst_0        
	//   24   44:invokevirtual   #139 <Method String nextString(boolean)>
	//   25   47:invokespecial   #140 <Method void BigDecimal(String)>
	//   26   50:areturn         
		else
			return ((Object) (nextString(false)));
	//   27   51:aload_0         
	//   28   52:iconst_0        
	//   29   53:invokevirtual   #139 <Method String nextString(boolean)>
	//   30   56:areturn         
	}

	public String nextString(boolean flag)
		throws IOException
	{
		checkNextValue(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #73  <Method void checkNextValue(boolean)>
		if(jsonReader.peek() == JsonReader.Token.NULL)
	//*   3    5:aload_0         
	//*   4    6:getfield        #23  <Field JsonReader jsonReader>
	//*   5    9:invokevirtual   #34  <Method JsonReader$Token JsonReader.peek()>
	//*   6   12:getstatic       #40  <Field JsonReader$Token JsonReader$Token.NULL>
	//*   7   15:if_acmpne       27
		{
			jsonReader.skipValue();
	//    8   18:aload_0         
	//    9   19:getfield        #23  <Field JsonReader jsonReader>
	//   10   22:invokevirtual   #76  <Method void JsonReader.skipValue()>
			return null;
	//   11   25:aconst_null     
	//   12   26:areturn         
		} else
		{
			return jsonReader.nextString();
	//   13   27:aload_0         
	//   14   28:getfield        #23  <Field JsonReader jsonReader>
	//   15   31:invokevirtual   #142 <Method String JsonReader.nextString()>
	//   16   34:areturn         
		}
	}

	List readList(final ResponseJsonStreamReader streamReader)
		throws IOException
	{
		return streamReader.nextList(false, new ListReader() {

			public Object read(ResponseJsonStreamReader responsejsonstreamreader)
				throws IOException
			{
				if(streamReader.isNextList())
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field ResponseJsonStreamReader val$streamReader>
			//*   2    4:invokevirtual   #33  <Method boolean ResponseJsonStreamReader.isNextList()>
			//*   3    7:ifeq            19
					return ((Object) (readList(responsejsonstreamreader)));
			//    4   10:aload_0         
			//    5   11:getfield        #19  <Field ResponseJsonStreamReader this$0>
			//    6   14:aload_1         
			//    7   15:invokevirtual   #34  <Method List ResponseJsonStreamReader.readList(ResponseJsonStreamReader)>
			//    8   18:areturn         
				if(streamReader.isNextObject())
			//*   9   19:aload_0         
			//*  10   20:getfield        #21  <Field ResponseJsonStreamReader val$streamReader>
			//*  11   23:invokevirtual   #37  <Method boolean ResponseJsonStreamReader.isNextObject()>
			//*  12   26:ifeq            38
					return ((Object) (readObject(responsejsonstreamreader)));
			//   13   29:aload_0         
			//   14   30:getfield        #19  <Field ResponseJsonStreamReader this$0>
			//   15   33:aload_1         
			//   16   34:invokevirtual   #41  <Method Map ResponseJsonStreamReader.readObject(ResponseJsonStreamReader)>
			//   17   37:areturn         
				else
					return responsejsonstreamreader.nextScalar(true);
			//   18   38:aload_1         
			//   19   39:iconst_1        
			//   20   40:invokevirtual   #45  <Method Object ResponseJsonStreamReader.nextScalar(boolean)>
			//   21   43:areturn         
			}

			final ResponseJsonStreamReader this$0;
			final ResponseJsonStreamReader val$streamReader;

			
			{
				this$0 = ResponseJsonStreamReader.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ResponseJsonStreamReader this$0>
				streamReader = responsejsonstreamreader1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ResponseJsonStreamReader val$streamReader>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:new             #8   <Class ResponseJsonStreamReader$2>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #147 <Method void ResponseJsonStreamReader$2(ResponseJsonStreamReader, ResponseJsonStreamReader)>
	//    7   11:invokevirtual   #149 <Method List nextList(boolean, ResponseJsonStreamReader$ListReader)>
	//    8   14:areturn         
	}

	Map readObject(ResponseJsonStreamReader responsejsonstreamreader)
		throws IOException
	{
		return (Map)responsejsonstreamreader.nextObject(false, new ObjectReader() {

			public volatile Object read(ResponseJsonStreamReader responsejsonstreamreader1)
				throws IOException
			{
				return ((Object) (read(responsejsonstreamreader1)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #28  <Method Map read(ResponseJsonStreamReader)>
			//    3    5:areturn         
			}

			public Map read(ResponseJsonStreamReader responsejsonstreamreader1)
				throws IOException
			{
				return responsejsonstreamreader1.toMap();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #33  <Method Map ResponseJsonStreamReader.toMap()>
			//    2    4:areturn         
			}

			final ResponseJsonStreamReader this$0;

			
			{
				this$0 = ResponseJsonStreamReader.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ResponseJsonStreamReader this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:new             #6   <Class ResponseJsonStreamReader$1>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:invokespecial   #155 <Method void ResponseJsonStreamReader$1(ResponseJsonStreamReader)>
	//    6   10:invokevirtual   #157 <Method Object nextObject(boolean, ResponseJsonStreamReader$ObjectReader)>
	//    7   13:checkcast       #159 <Class Map>
	//    8   16:areturn         
	}

	public void skipNext()
		throws IOException
	{
		jsonReader.skipValue();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field JsonReader jsonReader>
	//    2    4:invokevirtual   #76  <Method void JsonReader.skipValue()>
	//    3    7:return          
	}

	public Map toMap()
		throws IOException
	{
		if(isNextObject())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #164 <Method boolean isNextObject()>
	//*   2    4:ifeq            13
			return readObject(this);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #166 <Method Map readObject(ResponseJsonStreamReader)>
	//    6   12:areturn         
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//    7   13:new             #168 <Class LinkedHashMap>
	//    8   16:dup             
	//    9   17:invokespecial   #169 <Method void LinkedHashMap()>
	//   10   20:astore_1        
		while(hasNext()) 
	//*  11   21:aload_0         
	//*  12   22:invokevirtual   #170 <Method boolean hasNext()>
	//*  13   25:ifeq            118
		{
			String s = nextName();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #171 <Method String nextName()>
	//   16   32:astore_2        
			if(isNextNull())
	//*  17   33:aload_0         
	//*  18   34:invokespecial   #124 <Method boolean isNextNull()>
	//*  19   37:ifeq            56
			{
				skipNext();
	//   20   40:aload_0         
	//   21   41:invokevirtual   #127 <Method void skipNext()>
				((Map) (linkedhashmap)).put(((Object) (s)), ((Object) (null)));
	//   22   44:aload_1         
	//   23   45:aload_2         
	//   24   46:aconst_null     
	//   25   47:invokeinterface #175 <Method Object Map.put(Object, Object)>
	//   26   52:pop             
			} else
	//*  27   53:goto            21
			if(isNextObject())
	//*  28   56:aload_0         
	//*  29   57:invokevirtual   #164 <Method boolean isNextObject()>
	//*  30   60:ifeq            79
				((Map) (linkedhashmap)).put(((Object) (s)), ((Object) (readObject(this))));
	//   31   63:aload_1         
	//   32   64:aload_2         
	//   33   65:aload_0         
	//   34   66:aload_0         
	//   35   67:invokevirtual   #166 <Method Map readObject(ResponseJsonStreamReader)>
	//   36   70:invokeinterface #175 <Method Object Map.put(Object, Object)>
	//   37   75:pop             
			else
	//*  38   76:goto            21
			if(isNextList())
	//*  39   79:aload_0         
	//*  40   80:invokevirtual   #177 <Method boolean isNextList()>
	//*  41   83:ifeq            102
				((Map) (linkedhashmap)).put(((Object) (s)), ((Object) (readList(this))));
	//   42   86:aload_1         
	//   43   87:aload_2         
	//   44   88:aload_0         
	//   45   89:aload_0         
	//   46   90:invokevirtual   #179 <Method List readList(ResponseJsonStreamReader)>
	//   47   93:invokeinterface #175 <Method Object Map.put(Object, Object)>
	//   48   98:pop             
			else
	//*  49   99:goto            21
				((Map) (linkedhashmap)).put(((Object) (s)), nextScalar(true));
	//   50  102:aload_1         
	//   51  103:aload_2         
	//   52  104:aload_0         
	//   53  105:iconst_1        
	//   54  106:invokevirtual   #181 <Method Object nextScalar(boolean)>
	//   55  109:invokeinterface #175 <Method Object Map.put(Object, Object)>
	//   56  114:pop             
		}
	//*  57  115:goto            21
		return ((Map) (linkedhashmap));
	//   58  118:aload_1         
	//   59  119:areturn         
	}

	private final JsonReader jsonReader;
}
