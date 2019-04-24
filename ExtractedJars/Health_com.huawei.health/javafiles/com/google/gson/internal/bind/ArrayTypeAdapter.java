// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.*;
import java.io.IOException;
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
		throws IOException
	{
		if(jsonreader.peek() == JsonToken.NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #46  <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #52  <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #55  <Method void JsonReader.nextNull()>
			return ((Object) (null));
	//    6   14:aconst_null     
	//    7   15:areturn         
		}
		ArrayList arraylist = new ArrayList();
	//    8   16:new             #57  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #58  <Method void ArrayList()>
	//   11   23:astore          4
		jsonreader.beginArray();
	//   12   25:aload_1         
	//   13   26:invokevirtual   #61  <Method void JsonReader.beginArray()>
		for(; jsonreader.hasNext(); ((List) (arraylist)).add(componentTypeAdapter.read(jsonreader)));
	//   14   29:aload_1         
	//   15   30:invokevirtual   #65  <Method boolean JsonReader.hasNext()>
	//   16   33:ifeq            55
	//   17   36:aload           4
	//   18   38:aload_0         
	//   19   39:getfield        #32  <Field TypeAdapter componentTypeAdapter>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #67  <Method Object TypeAdapter.read(JsonReader)>
	//   22   46:invokeinterface #73  <Method boolean List.add(Object)>
	//   23   51:pop             
	//*  24   52:goto            29
		jsonreader.endArray();
	//   25   55:aload_1         
	//   26   56:invokevirtual   #76  <Method void JsonReader.endArray()>
		int j = ((List) (arraylist)).size();
	//   27   59:aload           4
	//   28   61:invokeinterface #80  <Method int List.size()>
	//   29   66:istore_3        
		jsonreader = ((JsonReader) (Array.newInstance(componentType, j)));
	//   30   67:aload_0         
	//   31   68:getfield        #34  <Field Class componentType>
	//   32   71:iload_3         
	//   33   72:invokestatic    #86  <Method Object Array.newInstance(Class, int)>
	//   34   75:astore_1        
		for(int i = 0; i < j; i++)
	//*  35   76:iconst_0        
	//*  36   77:istore_2        
	//*  37   78:iload_2         
	//*  38   79:iload_3         
	//*  39   80:icmpge          103
			Array.set(((Object) (jsonreader)), i, ((List) (arraylist)).get(i));
	//   40   83:aload_1         
	//   41   84:iload_2         
	//   42   85:aload           4
	//   43   87:iload_2         
	//   44   88:invokeinterface #90  <Method Object List.get(int)>
	//   45   93:invokestatic    #94  <Method void Array.set(Object, int, Object)>

	//   46   96:iload_2         
	//   47   97:iconst_1        
	//   48   98:iadd            
	//   49   99:istore_2        
	//*  50  100:goto            78
		return ((Object) (jsonreader));
	//   51  103:aload_1         
	//   52  104:areturn         
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
	//    3    5:invokevirtual   #103 <Method JsonWriter JsonWriter.nullValue()>
	//    4    8:pop             
			return;
	//    5    9:return          
		}
		jsonwriter.beginArray();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #105 <Method JsonWriter JsonWriter.beginArray()>
	//    8   14:pop             
		int i = 0;
	//    9   15:iconst_0        
	//   10   16:istore_3        
		for(int j = Array.getLength(obj); i < j; i++)
	//*  11   17:aload_2         
	//*  12   18:invokestatic    #109 <Method int Array.getLength(Object)>
	//*  13   21:istore          4
	//*  14   23:iload_3         
	//*  15   24:iload           4
	//*  16   26:icmpge          53
		{
			Object obj1 = Array.get(obj, i);
	//   17   29:aload_2         
	//   18   30:iload_3         
	//   19   31:invokestatic    #112 <Method Object Array.get(Object, int)>
	//   20   34:astore          5
			componentTypeAdapter.write(jsonwriter, obj1);
	//   21   36:aload_0         
	//   22   37:getfield        #32  <Field TypeAdapter componentTypeAdapter>
	//   23   40:aload_1         
	//   24   41:aload           5
	//   25   43:invokevirtual   #114 <Method void TypeAdapter.write(JsonWriter, Object)>
		}

	//   26   46:iload_3         
	//   27   47:iconst_1        
	//   28   48:iadd            
	//   29   49:istore_3        
	//*  30   50:goto            23
		jsonwriter.endArray();
	//   31   53:aload_1         
	//   32   54:invokevirtual   #116 <Method JsonWriter JsonWriter.endArray()>
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
