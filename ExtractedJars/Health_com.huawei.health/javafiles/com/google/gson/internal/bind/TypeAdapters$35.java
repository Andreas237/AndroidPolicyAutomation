// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$35
	implements TypeAdapterFactory
{

	public TypeAdapter create(final Gson requestedType, TypeToken typetoken)
	{
		requestedType = ((Gson) (typetoken.getRawType()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #35  <Method Class TypeToken.getRawType()>
	//    2    4:astore_1        
		if(!val$clazz.isAssignableFrom(((Class) (requestedType))))
	//*   3    5:aload_0         
	//*   4    6:getfield        #21  <Field Class val$clazz>
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #41  <Method boolean Class.isAssignableFrom(Class)>
	//*   7   13:ifne            18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		else
			return ((TypeAdapter) (new TypeAdapter() {

				public Object read(JsonReader jsonreader)
					throws IOException
				{
					jsonreader = ((JsonReader) (typeAdapter.read(jsonreader)));
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field TypeAdapters$35 this$0>
				//    2    4:getfield        #32  <Field TypeAdapter TypeAdapters$35.val$typeAdapter>
				//    3    7:aload_1         
				//    4    8:invokevirtual   #34  <Method Object TypeAdapter.read(JsonReader)>
				//    5   11:astore_1        
					if(jsonreader != null && !requestedType.isInstance(((Object) (jsonreader))))
				//*   6   12:aload_1         
				//*   7   13:ifnull          75
				//*   8   16:aload_0         
				//*   9   17:getfield        #20  <Field Class val$requestedType>
				//*  10   20:aload_1         
				//*  11   21:invokevirtual   #40  <Method boolean Class.isInstance(Object)>
				//*  12   24:ifne            75
						throw new JsonSyntaxException((new StringBuilder()).append("Expected a ").append(requestedType.getName()).append(" but was ").append(((Object) (jsonreader)).getClass().getName()).toString());
				//   13   27:new             #42  <Class JsonSyntaxException>
				//   14   30:dup             
				//   15   31:new             #44  <Class StringBuilder>
				//   16   34:dup             
				//   17   35:invokespecial   #45  <Method void StringBuilder()>
				//   18   38:ldc1            #47  <String "Expected a ">
				//   19   40:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
				//   20   43:aload_0         
				//   21   44:getfield        #20  <Field Class val$requestedType>
				//   22   47:invokevirtual   #55  <Method String Class.getName()>
				//   23   50:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
				//   24   53:ldc1            #57  <String " but was ">
				//   25   55:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
				//   26   58:aload_1         
				//   27   59:invokevirtual   #63  <Method Class Object.getClass()>
				//   28   62:invokevirtual   #55  <Method String Class.getName()>
				//   29   65:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
				//   30   68:invokevirtual   #66  <Method String StringBuilder.toString()>
				//   31   71:invokespecial   #69  <Method void JsonSyntaxException(String)>
				//   32   74:athrow          
					else
						return ((Object) (jsonreader));
				//   33   75:aload_1         
				//   34   76:areturn         
				}

				public void write(JsonWriter jsonwriter, Object obj)
					throws IOException
				{
					typeAdapter.write(jsonwriter, obj);
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field TypeAdapters$35 this$0>
				//    2    4:getfield        #32  <Field TypeAdapter TypeAdapters$35.val$typeAdapter>
				//    3    7:aload_1         
				//    4    8:aload_2         
				//    5    9:invokevirtual   #76  <Method void TypeAdapter.write(JsonWriter, Object)>
				//    6   12:return          
				}

				final TypeAdapters._cls35 this$0;
				final Class val$requestedType;

			
			{
				this$0 = TypeAdapters._cls35.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field TypeAdapters$35 this$0>
				requestedType = class1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field Class val$requestedType>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void TypeAdapter()>
			//    8   14:return          
			}
			}
));
	//   10   18:new             #13  <Class TypeAdapters$35$1>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokespecial   #44  <Method void TypeAdapters$35$1(TypeAdapters$35, Class)>
	//   15   27:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("Factory[typeHierarchy=").append(val$clazz.getName()).append(",adapter=").append(((Object) (val$typeAdapter))).append("]").toString();
	//    0    0:new             #50  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void StringBuilder()>
	//    3    7:ldc1            #53  <String "Factory[typeHierarchy=">
	//    4    9:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #21  <Field Class val$clazz>
	//    7   16:invokevirtual   #60  <Method String Class.getName()>
	//    8   19:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:ldc1            #62  <String ",adapter=">
	//   10   24:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:aload_0         
	//   12   28:getfield        #23  <Field TypeAdapter val$typeAdapter>
	//   13   31:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//   14   34:ldc1            #67  <String "]">
	//   15   36:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   16   39:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   17   42:areturn         
	}

	final Class val$clazz;
	final TypeAdapter val$typeAdapter;

	TypeAdapters$35(Class class1, TypeAdapter typeadapter)
	{
		val$clazz = class1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field Class val$clazz>
		val$typeAdapter = typeadapter;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field TypeAdapter val$typeAdapter>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void Object()>
	//    8   14:return          
	}
}
