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
	//*   1    1:invokevirtual   #40  <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #46  <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #49  <Method void JsonReader.nextNull()>
			return ((Object) (null));
	//    6   14:aconst_null     
	//    7   15:areturn         
		}
		obj = constructor.construct();
	//    8   16:aload_0         
	//    9   17:getfield        #21  <Field ObjectConstructor constructor>
	//   10   20:invokeinterface #55  <Method Object ObjectConstructor.construct()>
	//   11   25:astore_2        
		jsonreader.beginObject();
	//   12   26:aload_1         
	//   13   27:invokevirtual   #58  <Method void JsonReader.beginObject()>
_L1:
		Object obj1;
		if(!jsonreader.hasNext())
			break MISSING_BLOCK_LABEL_106;
	//   14   30:aload_1         
	//   15   31:invokevirtual   #62  <Method boolean JsonReader.hasNext()>
	//   16   34:ifeq            83
		obj1 = ((Object) (jsonreader.nextName()));
	//   17   37:aload_1         
	//   18   38:invokevirtual   #66  <Method String JsonReader.nextName()>
	//   19   41:astore_3        
		obj1 = ((Object) ((ld)boundFields.get(obj1)));
	//   20   42:aload_0         
	//   21   43:getfield        #23  <Field Map boundFields>
	//   22   46:aload_3         
	//   23   47:invokeinterface #72  <Method Object Map.get(Object)>
	//   24   52:checkcast       #74  <Class ReflectiveTypeAdapterFactory$BoundField>
	//   25   55:astore_3        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_67;
	//   26   56:aload_3         
	//   27   57:ifnull          67
		if(((ld) (obj1)).deserialized)
			break MISSING_BLOCK_LABEL_74;
	//   28   60:aload_3         
	//   29   61:getfield        #78  <Field boolean ReflectiveTypeAdapterFactory$BoundField.deserialized>
	//   30   64:ifne            74
		jsonreader.skipValue();
	//   31   67:aload_1         
	//   32   68:invokevirtual   #81  <Method void JsonReader.skipValue()>
		  goto _L1
	//*  33   71:goto            80
		try
		{
			((ld) (obj1)).read(jsonreader, obj);
	//   34   74:aload_3         
	//   35   75:aload_1         
	//   36   76:aload_2         
	//   37   77:invokevirtual   #84  <Method void ReflectiveTypeAdapterFactory$BoundField.read(JsonReader, Object)>
		}
	//*  38   80:goto            30
	//*  39   83:goto            106
		// Misplaced declaration of an exception variable
		catch(JsonReader jsonreader)
	//*  40   86:astore_1        
		{
			throw new JsonSyntaxException(((Throwable) (jsonreader)));
	//   41   87:new             #86  <Class JsonSyntaxException>
	//   42   90:dup             
	//   43   91:aload_1         
	//   44   92:invokespecial   #89  <Method void JsonSyntaxException(Throwable)>
	//   45   95:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(JsonReader jsonreader)
	//*  46   96:astore_1        
		{
			throw new AssertionError(((Object) (jsonreader)));
	//   47   97:new             #91  <Class AssertionError>
	//   48  100:dup             
	//   49  101:aload_1         
	//   50  102:invokespecial   #94  <Method void AssertionError(Object)>
	//   51  105:athrow          
		}
		  goto _L1
		jsonreader.endObject();
	//   52  106:aload_1         
	//   53  107:invokevirtual   #97  <Method void JsonReader.endObject()>
		return obj;
	//   54  110:aload_2         
	//   55  111:areturn         
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
	//    3    5:invokevirtual   #107 <Method JsonWriter JsonWriter.nullValue()>
	//    4    8:pop             
			return;
	//    5    9:return          
		}
		jsonwriter.beginObject();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #109 <Method JsonWriter JsonWriter.beginObject()>
	//    8   14:pop             
		try
		{
			Iterator iterator = boundFields.values().iterator();
	//    9   15:aload_0         
	//   10   16:getfield        #23  <Field Map boundFields>
	//   11   19:invokeinterface #113 <Method Collection Map.values()>
	//   12   24:invokeinterface #119 <Method Iterator Collection.iterator()>
	//   13   29:astore_3        
			do
			{
				if(!iterator.hasNext())
					break;
	//   14   30:aload_3         
	//   15   31:invokeinterface #122 <Method boolean Iterator.hasNext()>
	//   16   36:ifeq            79
				ld ld = (ld)iterator.next();
	//   17   39:aload_3         
	//   18   40:invokeinterface #125 <Method Object Iterator.next()>
	//   19   45:checkcast       #74  <Class ReflectiveTypeAdapterFactory$BoundField>
	//   20   48:astore          4
				if(ld.writeField(obj))
	//*  21   50:aload           4
	//*  22   52:aload_2         
	//*  23   53:invokevirtual   #129 <Method boolean ReflectiveTypeAdapterFactory$BoundField.writeField(Object)>
	//*  24   56:ifeq            76
				{
					jsonwriter.name(ld.name);
	//   25   59:aload_1         
	//   26   60:aload           4
	//   27   62:getfield        #133 <Field String ReflectiveTypeAdapterFactory$BoundField.name>
	//   28   65:invokevirtual   #136 <Method JsonWriter JsonWriter.name(String)>
	//   29   68:pop             
					ld.write(jsonwriter, obj);
	//   30   69:aload           4
	//   31   71:aload_1         
	//   32   72:aload_2         
	//   33   73:invokevirtual   #138 <Method void ReflectiveTypeAdapterFactory$BoundField.write(JsonWriter, Object)>
				}
			} while(true);
	//   34   76:goto            30
		}
	//*  35   79:goto            92
		// Misplaced declaration of an exception variable
		catch(JsonWriter jsonwriter)
	//*  36   82:astore_1        
		{
			throw new AssertionError(((Object) (jsonwriter)));
	//   37   83:new             #91  <Class AssertionError>
	//   38   86:dup             
	//   39   87:aload_1         
	//   40   88:invokespecial   #94  <Method void AssertionError(Object)>
	//   41   91:athrow          
		}
		jsonwriter.endObject();
	//   42   92:aload_1         
	//   43   93:invokevirtual   #140 <Method JsonWriter JsonWriter.endObject()>
	//   44   96:pop             
	//   45   97:return          
	}

	private final Map boundFields;
	private final ObjectConstructor constructor;

	ReflectiveTypeAdapterFactory$Adapter(ObjectConstructor objectconstructor, Map map)
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
}
