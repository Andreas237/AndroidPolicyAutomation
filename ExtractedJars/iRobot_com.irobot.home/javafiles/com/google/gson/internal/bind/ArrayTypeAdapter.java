// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.*;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapterRuntimeTypeWrapper

public final class ArrayTypeAdapter extends TypeAdapter
{

	public ArrayTypeAdapter(Gson gson, TypeAdapter typeadapter, Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void TypeAdapter()>
		componentTypeAdapter = ((TypeAdapter) (new TypeAdapterRuntimeTypeWrapper(gson, typeadapter, ((java.lang.reflect.Type) (class1)))));
	//    2    4:aload_0         
	//    3    5:new             #27  <Class TypeAdapterRuntimeTypeWrapper>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #30  <Method void TypeAdapterRuntimeTypeWrapper(Gson, TypeAdapter, java.lang.reflect.Type)>
	//    9   15:putfield        #32  <Field TypeAdapter componentTypeAdapter>
		componentType = class1;
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:putfield        #34  <Field Class componentType>
	//   13   23:return          
	}

	public Object read(JsonReader jsonreader)
	{
		if(jsonreader.peek() == JsonToken.NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #44  <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #50  <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #53  <Method void JsonReader.nextNull()>
			return ((Object) (null));
	//    6   14:aconst_null     
	//    7   15:areturn         
		}
		ArrayList arraylist = new ArrayList();
	//    8   16:new             #55  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #56  <Method void ArrayList()>
	//   11   23:astore_3        
		jsonreader.beginArray();
	//   12   24:aload_1         
	//   13   25:invokevirtual   #59  <Method void JsonReader.beginArray()>
		for(; jsonreader.hasNext(); ((List) (arraylist)).add(componentTypeAdapter.read(jsonreader)));
	//   14   28:aload_1         
	//   15   29:invokevirtual   #63  <Method boolean JsonReader.hasNext()>
	//   16   32:ifeq            53
	//   17   35:aload_3         
	//   18   36:aload_0         
	//   19   37:getfield        #32  <Field TypeAdapter componentTypeAdapter>
	//   20   40:aload_1         
	//   21   41:invokevirtual   #65  <Method Object TypeAdapter.read(JsonReader)>
	//   22   44:invokeinterface #71  <Method boolean List.add(Object)>
	//   23   49:pop             
	//*  24   50:goto            28
		jsonreader.endArray();
	//   25   53:aload_1         
	//   26   54:invokevirtual   #74  <Method void JsonReader.endArray()>
		jsonreader = ((JsonReader) (Array.newInstance(componentType, ((List) (arraylist)).size())));
	//   27   57:aload_0         
	//   28   58:getfield        #34  <Field Class componentType>
	//   29   61:aload_3         
	//   30   62:invokeinterface #78  <Method int List.size()>
	//   31   67:invokestatic    #84  <Method Object Array.newInstance(Class, int)>
	//   32   70:astore_1        
		for(int i = 0; i < ((List) (arraylist)).size(); i++)
	//*  33   71:iconst_0        
	//*  34   72:istore_2        
	//*  35   73:iload_2         
	//*  36   74:aload_3         
	//*  37   75:invokeinterface #78  <Method int List.size()>
	//*  38   80:icmpge          102
			Array.set(((Object) (jsonreader)), i, ((List) (arraylist)).get(i));
	//   39   83:aload_1         
	//   40   84:iload_2         
	//   41   85:aload_3         
	//   42   86:iload_2         
	//   43   87:invokeinterface #88  <Method Object List.get(int)>
	//   44   92:invokestatic    #92  <Method void Array.set(Object, int, Object)>

	//   45   95:iload_2         
	//   46   96:iconst_1        
	//   47   97:iadd            
	//   48   98:istore_2        
	//*  49   99:goto            73
		return ((Object) (jsonreader));
	//   50  102:aload_1         
	//   51  103:areturn         
	}

	public void write(JsonWriter jsonwriter, Object obj)
	{
		if(obj == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			jsonwriter.nullValue();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #100 <Method JsonWriter JsonWriter.nullValue()>
	//    4    8:pop             
			return;
	//    5    9:return          
		}
		jsonwriter.beginArray();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #102 <Method JsonWriter JsonWriter.beginArray()>
	//    8   14:pop             
		int i = 0;
	//    9   15:iconst_0        
	//   10   16:istore_3        
		for(int j = Array.getLength(obj); i < j; i++)
	//*  11   17:aload_2         
	//*  12   18:invokestatic    #106 <Method int Array.getLength(Object)>
	//*  13   21:istore          4
	//*  14   23:iload_3         
	//*  15   24:iload           4
	//*  16   26:icmpge          53
		{
			Object obj1 = Array.get(obj, i);
	//   17   29:aload_2         
	//   18   30:iload_3         
	//   19   31:invokestatic    #109 <Method Object Array.get(Object, int)>
	//   20   34:astore          5
			componentTypeAdapter.write(jsonwriter, obj1);
	//   21   36:aload_0         
	//   22   37:getfield        #32  <Field TypeAdapter componentTypeAdapter>
	//   23   40:aload_1         
	//   24   41:aload           5
	//   25   43:invokevirtual   #111 <Method void TypeAdapter.write(JsonWriter, Object)>
		}

	//   26   46:iload_3         
	//   27   47:iconst_1        
	//   28   48:iadd            
	//   29   49:istore_3        
	//*  30   50:goto            23
		jsonwriter.endArray();
	//   31   53:aload_1         
	//   32   54:invokevirtual   #113 <Method JsonWriter JsonWriter.endArray()>
	//   33   57:pop             
	//   34   58:return          
	}

	public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() {

		public TypeAdapter create(Gson gson, TypeToken typetoken)
		{
			typetoken = ((TypeToken) (typetoken.getType()));
		//    0    0:aload_2         
		//    1    1:invokevirtual   #21  <Method java.lang.reflect.Type TypeToken.getType()>
		//    2    4:astore_2        
			if(!(typetoken instanceof GenericArrayType) && (!(typetoken instanceof Class) || !((Class)typetoken).isArray()))
		//*   3    5:aload_2         
		//*   4    6:instanceof      #23  <Class GenericArrayType>
		//*   5    9:ifne            31
		//*   6   12:aload_2         
		//*   7   13:instanceof      #25  <Class Class>
		//*   8   16:ifeq            29
		//*   9   19:aload_2         
		//*  10   20:checkcast       #25  <Class Class>
		//*  11   23:invokevirtual   #29  <Method boolean Class.isArray()>
		//*  12   26:ifne            31
			{
				return null;
		//   13   29:aconst_null     
		//   14   30:areturn         
			} else
			{
				typetoken = ((TypeToken) (com.google.gson.internal..Gson.Types.getArrayComponentType(((java.lang.reflect.Type) (typetoken)))));
		//   15   31:aload_2         
		//   16   32:invokestatic    #35  <Method java.lang.reflect.Type com.google.gson.internal.$Gson$Types.getArrayComponentType(java.lang.reflect.Type)>
		//   17   35:astore_2        
				return ((TypeAdapter) (new ArrayTypeAdapter(gson, gson.getAdapter(TypeToken.get(((java.lang.reflect.Type) (typetoken)))), com.google.gson.internal..Gson.Types.getRawType(((java.lang.reflect.Type) (typetoken))))));
		//   18   36:new             #8   <Class ArrayTypeAdapter>
		//   19   39:dup             
		//   20   40:aload_1         
		//   21   41:aload_1         
		//   22   42:aload_2         
		//   23   43:invokestatic    #39  <Method TypeToken TypeToken.get(java.lang.reflect.Type)>
		//   24   46:invokevirtual   #45  <Method TypeAdapter Gson.getAdapter(TypeToken)>
		//   25   49:aload_2         
		//   26   50:invokestatic    #49  <Method Class com.google.gson.internal.$Gson$Types.getRawType(java.lang.reflect.Type)>
		//   27   53:invokespecial   #52  <Method void ArrayTypeAdapter(Gson, TypeAdapter, Class)>
		//   28   56:areturn         
			}
		}

	}
;
	private final Class componentType;
	private final TypeAdapter componentTypeAdapter;

	static 
	{
	//    0    0:new             #7   <Class ArrayTypeAdapter$1>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void ArrayTypeAdapter$1()>
	//    3    7:putstatic       #22  <Field TypeAdapterFactory FACTORY>
	//*   4   10:return          
	}
}
