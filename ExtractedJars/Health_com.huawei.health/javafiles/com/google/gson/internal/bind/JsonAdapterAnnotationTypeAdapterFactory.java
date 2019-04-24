// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;

// Referenced classes of package com.google.gson.internal.bind:
//			TreeTypeAdapter

public final class JsonAdapterAnnotationTypeAdapterFactory
	implements TypeAdapterFactory
{

	public JsonAdapterAnnotationTypeAdapterFactory(ConstructorConstructor constructorconstructor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		constructorConstructor = constructorconstructor;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field ConstructorConstructor constructorConstructor>
	//    5    9:return          
	}

	public TypeAdapter create(Gson gson, TypeToken typetoken)
	{
		JsonAdapter jsonadapter = (JsonAdapter)typetoken.getRawType().getAnnotation(com/google/gson/annotations/JsonAdapter);
	//    0    0:aload_2         
	//    1    1:invokevirtual   #24  <Method Class TypeToken.getRawType()>
	//    2    4:ldc1            #26  <Class JsonAdapter>
	//    3    6:invokevirtual   #32  <Method java.lang.annotation.Annotation Class.getAnnotation(Class)>
	//    4    9:checkcast       #26  <Class JsonAdapter>
	//    5   12:astore_3        
		if(jsonadapter == null)
	//*   6   13:aload_3         
	//*   7   14:ifnonnull       19
			return null;
	//    8   17:aconst_null     
	//    9   18:areturn         
		else
			return getTypeAdapter(constructorConstructor, gson, typetoken, jsonadapter);
	//   10   19:aload_0         
	//   11   20:aload_0         
	//   12   21:getfield        #15  <Field ConstructorConstructor constructorConstructor>
	//   13   24:aload_1         
	//   14   25:aload_2         
	//   15   26:aload_3         
	//   16   27:invokevirtual   #36  <Method TypeAdapter getTypeAdapter(ConstructorConstructor, Gson, TypeToken, JsonAdapter)>
	//   17   30:areturn         
	}

	TypeAdapter getTypeAdapter(ConstructorConstructor constructorconstructor, Gson gson, TypeToken typetoken, JsonAdapter jsonadapter)
	{
		Object obj = constructorconstructor.get(TypeToken.get(jsonadapter.value())).construct();
	//    0    0:aload_1         
	//    1    1:aload           4
	//    2    3:invokeinterface #41  <Method Class JsonAdapter.value()>
	//    3    8:invokestatic    #45  <Method TypeToken TypeToken.get(Class)>
	//    4   11:invokevirtual   #50  <Method ObjectConstructor ConstructorConstructor.get(TypeToken)>
	//    5   14:invokeinterface #56  <Method Object ObjectConstructor.construct()>
	//    6   19:astore          5
		if(obj instanceof TypeAdapter)
	//*   7   21:aload           5
	//*   8   23:instanceof      #58  <Class TypeAdapter>
	//*   9   26:ifeq            38
			constructorconstructor = ((ConstructorConstructor) ((TypeAdapter)obj));
	//   10   29:aload           5
	//   11   31:checkcast       #58  <Class TypeAdapter>
	//   12   34:astore_1        
		else
	//*  13   35:goto            186
		if(obj instanceof TypeAdapterFactory)
	//*  14   38:aload           5
	//*  15   40:instanceof      #6   <Class TypeAdapterFactory>
	//*  16   43:ifeq            62
			constructorconstructor = ((ConstructorConstructor) (((TypeAdapterFactory)obj).create(gson, typetoken)));
	//   17   46:aload           5
	//   18   48:checkcast       #6   <Class TypeAdapterFactory>
	//   19   51:aload_2         
	//   20   52:aload_3         
	//   21   53:invokeinterface #60  <Method TypeAdapter TypeAdapterFactory.create(Gson, TypeToken)>
	//   22   58:astore_1        
		else
	//*  23   59:goto            186
		if((obj instanceof JsonSerializer) || (obj instanceof JsonDeserializer))
	//*  24   62:aload           5
	//*  25   64:instanceof      #62  <Class JsonSerializer>
	//*  26   67:ifne            78
	//*  27   70:aload           5
	//*  28   72:instanceof      #64  <Class JsonDeserializer>
	//*  29   75:ifeq            135
		{
			if(obj instanceof JsonSerializer)
	//*  30   78:aload           5
	//*  31   80:instanceof      #62  <Class JsonSerializer>
	//*  32   83:ifeq            95
				constructorconstructor = ((ConstructorConstructor) ((JsonSerializer)obj));
	//   33   86:aload           5
	//   34   88:checkcast       #62  <Class JsonSerializer>
	//   35   91:astore_1        
			else
	//*  36   92:goto            97
				constructorconstructor = null;
	//   37   95:aconst_null     
	//   38   96:astore_1        
			if(obj instanceof JsonDeserializer)
	//*  39   97:aload           5
	//*  40   99:instanceof      #64  <Class JsonDeserializer>
	//*  41  102:ifeq            115
				obj = ((Object) ((JsonDeserializer)obj));
	//   42  105:aload           5
	//   43  107:checkcast       #64  <Class JsonDeserializer>
	//   44  110:astore          5
			else
	//*  45  112:goto            118
				obj = null;
	//   46  115:aconst_null     
	//   47  116:astore          5
			constructorconstructor = ((ConstructorConstructor) (new TreeTypeAdapter(((JsonSerializer) (constructorconstructor)), ((JsonDeserializer) (obj)), gson, typetoken, ((TypeAdapterFactory) (null)))));
	//   48  118:new             #66  <Class TreeTypeAdapter>
	//   49  121:dup             
	//   50  122:aload_1         
	//   51  123:aload           5
	//   52  125:aload_2         
	//   53  126:aload_3         
	//   54  127:aconst_null     
	//   55  128:invokespecial   #69  <Method void TreeTypeAdapter(JsonSerializer, JsonDeserializer, Gson, TypeToken, TypeAdapterFactory)>
	//   56  131:astore_1        
		} else
	//*  57  132:goto            186
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Invalid attempt to bind an instance of ").append(obj.getClass().getName()).append(" as a @JsonAdapter for ").append(typetoken.toString()).append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.").toString());
	//   58  135:new             #71  <Class IllegalArgumentException>
	//   59  138:dup             
	//   60  139:new             #73  <Class StringBuilder>
	//   61  142:dup             
	//   62  143:invokespecial   #74  <Method void StringBuilder()>
	//   63  146:ldc1            #76  <String "Invalid attempt to bind an instance of ">
	//   64  148:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   65  151:aload           5
	//   66  153:invokevirtual   #83  <Method Class Object.getClass()>
	//   67  156:invokevirtual   #87  <Method String Class.getName()>
	//   68  159:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   69  162:ldc1            #89  <String " as a @JsonAdapter for ">
	//   70  164:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   71  167:aload_3         
	//   72  168:invokevirtual   #92  <Method String TypeToken.toString()>
	//   73  171:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   74  174:ldc1            #94  <String ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.">
	//   75  176:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   76  179:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   77  182:invokespecial   #98  <Method void IllegalArgumentException(String)>
	//   78  185:athrow          
		}
		gson = ((Gson) (constructorconstructor));
	//   79  186:aload_1         
	//   80  187:astore_2        
		if(constructorconstructor != null)
	//*  81  188:aload_1         
	//*  82  189:ifnull          209
		{
			gson = ((Gson) (constructorconstructor));
	//   83  192:aload_1         
	//   84  193:astore_2        
			if(jsonadapter.nullSafe())
	//*  85  194:aload           4
	//*  86  196:invokeinterface #102 <Method boolean JsonAdapter.nullSafe()>
	//*  87  201:ifeq            209
				gson = ((Gson) (((TypeAdapter) (constructorconstructor)).nullSafe()));
	//   88  204:aload_1         
	//   89  205:invokevirtual   #105 <Method TypeAdapter TypeAdapter.nullSafe()>
	//   90  208:astore_2        
		}
		return ((TypeAdapter) (gson));
	//   91  209:aload_2         
	//   92  210:areturn         
	}

	private final ConstructorConstructor constructorConstructor;
}
