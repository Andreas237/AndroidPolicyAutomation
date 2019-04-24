// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.stream.*;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.gson.internal.bind:
//			ReflectiveTypeAdapterFactory

public static final class ReflectiveTypeAdapterFactory$Adapter extends TypeAdapter
{

	public Object read(JsonReader jsonreader)
		throws IOException
	{
		Object obj;
		if(jsonreader.peek() == JsonToken.NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #43  <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #49  <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #52  <Method void JsonReader.nextNull()>
			return ((Object) (null));
	//    6   14:aconst_null     
	//    7   15:areturn         
		}
		obj = constructor.construct();
	//    8   16:aload_0         
	//    9   17:getfield        #21  <Field ObjectConstructor constructor>
	//   10   20:invokeinterface #58  <Method Object ObjectConstructor.construct()>
	//   11   25:astore_2        
		jsonreader.beginObject();
	//   12   26:aload_1         
	//   13   27:invokevirtual   #61  <Method void JsonReader.beginObject()>
_L1:
		Object obj1;
		if(!jsonreader.hasNext())
			break MISSING_BLOCK_LABEL_103;
	//   14   30:aload_1         
	//   15   31:invokevirtual   #65  <Method boolean JsonReader.hasNext()>
	//   16   34:ifeq            103
		obj1 = ((Object) (jsonreader.nextName()));
	//   17   37:aload_1         
	//   18   38:invokevirtual   #69  <Method String JsonReader.nextName()>
	//   19   41:astore_3        
		obj1 = ((Object) ((ld)boundFields.get(obj1)));
	//   20   42:aload_0         
	//   21   43:getfield        #23  <Field Map boundFields>
	//   22   46:aload_3         
	//   23   47:invokeinterface #75  <Method Object Map.get(Object)>
	//   24   52:checkcast       #77  <Class ReflectiveTypeAdapterFactory$BoundField>
	//   25   55:astore_3        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_67;
	//   26   56:aload_3         
	//   27   57:ifnull          67
		if(((ld) (obj1)).deserialized)
			break MISSING_BLOCK_LABEL_84;
	//   28   60:aload_3         
	//   29   61:getfield        #81  <Field boolean ReflectiveTypeAdapterFactory$BoundField.deserialized>
	//   30   64:ifne            84
		jsonreader.skipValue();
	//   31   67:aload_1         
	//   32   68:invokevirtual   #84  <Method void JsonReader.skipValue()>
		  goto _L1
	//*  33   71:goto            30
	//*  34   74:astore_1        
	//*  35   75:new             #86  <Class JsonSyntaxException>
	//*  36   78:dup             
	//*  37   79:aload_1         
	//*  38   80:invokespecial   #89  <Method void JsonSyntaxException(Throwable)>
	//*  39   83:athrow          
		try
		{
			((ld) (obj1)).read(jsonreader, obj);
	//   40   84:aload_3         
	//   41   85:aload_1         
	//   42   86:aload_2         
	//   43   87:invokevirtual   #92  <Method void ReflectiveTypeAdapterFactory$BoundField.read(JsonReader, Object)>
		}
		// Misplaced declaration of an exception variable
		catch(JsonReader jsonreader)
		{
			throw new JsonSyntaxException(((Throwable) (jsonreader)));
		}
	//*  44   90:goto            30
		// Misplaced declaration of an exception variable
		catch(JsonReader jsonreader)
	//*  45   93:astore_1        
		{
			throw new AssertionError(((Object) (jsonreader)));
	//   46   94:new             #94  <Class AssertionError>
	//   47   97:dup             
	//   48   98:aload_1         
	//   49   99:invokespecial   #97  <Method void AssertionError(Object)>
	//   50  102:athrow          
		}
		  goto _L1
		jsonreader.endObject();
	//   51  103:aload_1         
	//   52  104:invokevirtual   #100 <Method void JsonReader.endObject()>
		return obj;
	//   53  107:aload_2         
	//   54  108:areturn         
	}

	public void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		if(obj == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			jsonwriter.nullValue();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #110 <Method JsonWriter JsonWriter.nullValue()>
	//    4    8:pop             
			return;
	//    5    9:return          
		}
		jsonwriter.beginObject();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #112 <Method JsonWriter JsonWriter.beginObject()>
	//    8   14:pop             
		try
		{
			Iterator iterator = boundFields.values().iterator();
	//    9   15:aload_0         
	//   10   16:getfield        #23  <Field Map boundFields>
	//   11   19:invokeinterface #116 <Method Collection Map.values()>
	//   12   24:invokeinterface #122 <Method Iterator Collection.iterator()>
	//   13   29:astore_3        
			do
			{
				if(!iterator.hasNext())
					break;
	//   14   30:aload_3         
	//   15   31:invokeinterface #125 <Method boolean Iterator.hasNext()>
	//   16   36:ifeq            88
				ld ld = (ld)iterator.next();
	//   17   39:aload_3         
	//   18   40:invokeinterface #128 <Method Object Iterator.next()>
	//   19   45:checkcast       #77  <Class ReflectiveTypeAdapterFactory$BoundField>
	//   20   48:astore          4
				if(ld.writeField(obj))
	//*  21   50:aload           4
	//*  22   52:aload_2         
	//*  23   53:invokevirtual   #132 <Method boolean ReflectiveTypeAdapterFactory$BoundField.writeField(Object)>
	//*  24   56:ifeq            30
				{
					jsonwriter.name(ld.name);
	//   25   59:aload_1         
	//   26   60:aload           4
	//   27   62:getfield        #136 <Field String ReflectiveTypeAdapterFactory$BoundField.name>
	//   28   65:invokevirtual   #139 <Method JsonWriter JsonWriter.name(String)>
	//   29   68:pop             
					ld.write(jsonwriter, obj);
	//   30   69:aload           4
	//   31   71:aload_1         
	//   32   72:aload_2         
	//   33   73:invokevirtual   #141 <Method void ReflectiveTypeAdapterFactory$BoundField.write(JsonWriter, Object)>
				}
			} while(true);
	//   34   76:goto            30
		}
		// Misplaced declaration of an exception variable
		catch(JsonWriter jsonwriter)
	//*  35   79:astore_1        
		{
			throw new AssertionError();
	//   36   80:new             #94  <Class AssertionError>
	//   37   83:dup             
	//   38   84:invokespecial   #142 <Method void AssertionError()>
	//   39   87:athrow          
		}
		jsonwriter.endObject();
	//   40   88:aload_1         
	//   41   89:invokevirtual   #144 <Method JsonWriter JsonWriter.endObject()>
	//   42   92:pop             
	//   43   93:return          
	}

	private final Map boundFields;
	private final ObjectConstructor constructor;

	private ReflectiveTypeAdapterFactory$Adapter(ObjectConstructor objectconstructor, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void TypeAdapter()>
		constructor = objectconstructor;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field ObjectConstructor constructor>
		boundFields = map;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field Map boundFields>
	//    8   14:return          
	}

	ReflectiveTypeAdapterFactory$Adapter(ObjectConstructor objectconstructor, Map map, ReflectiveTypeAdapterFactory._cls1 _pcls1)
	{
		this(objectconstructor, map);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #29  <Method void ReflectiveTypeAdapterFactory$Adapter(ObjectConstructor, Map)>
	//    4    6:return          
	}
}
