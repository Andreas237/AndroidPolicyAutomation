// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.stream.*;
import java.util.*;

// Referenced classes of package com.google.gson.internal.bind:
//			ReflectiveTypeAdapterFactory

public static final class ReflectiveTypeAdapterFactory$Adapter extends TypeAdapter
{

	public Object read(JsonReader jsonreader)
	{
		Object obj;
		if(jsonreader.peek() == JsonToken.NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #41  <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #47  <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #50  <Method void JsonReader.nextNull()>
			return ((Object) (null));
	//    6   14:aconst_null     
	//    7   15:areturn         
		}
		obj = constructor.construct();
	//    8   16:aload_0         
	//    9   17:getfield        #21  <Field ObjectConstructor constructor>
	//   10   20:invokeinterface #56  <Method Object ObjectConstructor.construct()>
	//   11   25:astore_2        
		jsonreader.beginObject();
	//   12   26:aload_1         
	//   13   27:invokevirtual   #59  <Method void JsonReader.beginObject()>
_L1:
		Object obj1;
		if(!jsonreader.hasNext())
			break MISSING_BLOCK_LABEL_86;
	//   14   30:aload_1         
	//   15   31:invokevirtual   #63  <Method boolean JsonReader.hasNext()>
	//   16   34:ifeq            86
		obj1 = ((Object) (jsonreader.nextName()));
	//   17   37:aload_1         
	//   18   38:invokevirtual   #67  <Method String JsonReader.nextName()>
	//   19   41:astore_3        
		obj1 = ((Object) ((ld)boundFields.get(obj1)));
	//   20   42:aload_0         
	//   21   43:getfield        #23  <Field Map boundFields>
	//   22   46:aload_3         
	//   23   47:invokeinterface #73  <Method Object Map.get(Object)>
	//   24   52:checkcast       #75  <Class ReflectiveTypeAdapterFactory$BoundField>
	//   25   55:astore_3        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_79;
	//   26   56:aload_3         
	//   27   57:ifnull          79
		if(!((ld) (obj1)).deserialized)
	//*  28   60:aload_3         
	//*  29   61:getfield        #79  <Field boolean ReflectiveTypeAdapterFactory$BoundField.deserialized>
	//*  30   64:ifne            70
			break MISSING_BLOCK_LABEL_79;
	//   31   67:goto            79
		try
		{
			((ld) (obj1)).read(jsonreader, obj);
	//   32   70:aload_3         
	//   33   71:aload_1         
	//   34   72:aload_2         
	//   35   73:invokevirtual   #82  <Method void ReflectiveTypeAdapterFactory$BoundField.read(JsonReader, Object)>
		}
	//*  36   76:goto            30
	//*  37   79:aload_1         
	//*  38   80:invokevirtual   #85  <Method void JsonReader.skipValue()>
	//*  39   83:goto            30
	//*  40   86:aload_1         
	//*  41   87:invokevirtual   #88  <Method void JsonReader.endObject()>
	//*  42   90:aload_2         
	//*  43   91:areturn         
	//*  44   92:astore_1        
	//*  45   93:new             #90  <Class AssertionError>
	//*  46   96:dup             
	//*  47   97:aload_1         
	//*  48   98:invokespecial   #93  <Method void AssertionError(Object)>
	//*  49  101:athrow          
		// Misplaced declaration of an exception variable
		catch(JsonReader jsonreader)
	//*  50  102:astore_1        
		{
			throw new JsonSyntaxException(((Throwable) (jsonreader)));
	//   51  103:new             #95  <Class JsonSyntaxException>
	//   52  106:dup             
	//   53  107:aload_1         
	//   54  108:invokespecial   #98  <Method void JsonSyntaxException(Throwable)>
	//   55  111:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(JsonReader jsonreader)
		{
			throw new AssertionError(((Object) (jsonreader)));
		}
		  goto _L1
		jsonreader.skipValue();
		  goto _L1
		jsonreader.endObject();
		return obj;
	}

	public void write(JsonWriter jsonwriter, Object obj)
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
	//   19   45:checkcast       #75  <Class ReflectiveTypeAdapterFactory$BoundField>
	//   20   48:astore          4
			if(ld.writeField(obj))
	//*  21   50:aload           4
	//*  22   52:aload_2         
	//*  23   53:invokevirtual   #129 <Method boolean ReflectiveTypeAdapterFactory$BoundField.writeField(Object)>
	//*  24   56:ifeq            30
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
		jsonwriter.endObject();
	//   35   79:aload_1         
	//   36   80:invokevirtual   #140 <Method JsonWriter JsonWriter.endObject()>
	//   37   83:pop             
		return;
	//   38   84:return          
_L2:
		throw new AssertionError();
	//   39   85:new             #90  <Class AssertionError>
	//   40   88:dup             
	//   41   89:invokespecial   #141 <Method void AssertionError()>
	//   42   92:athrow          
		jsonwriter;
	//   43   93:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  44   94:goto            85
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
