// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;

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

	static TypeAdapter getTypeAdapter(ConstructorConstructor constructorconstructor, Gson gson, TypeToken typetoken, JsonAdapter jsonadapter)
	{
		jsonadapter = ((JsonAdapter) (jsonadapter.value()));
	//    0    0:aload_3         
	//    1    1:invokeinterface #24  <Method Class JsonAdapter.value()>
	//    2    6:astore_3        
		if(((Class) (com/google/gson/TypeAdapter)).isAssignableFrom(((Class) (jsonadapter))))
	//*   3    7:ldc1            #26  <Class TypeAdapter>
	//*   4    9:aload_3         
	//*   5   10:invokevirtual   #32  <Method boolean Class.isAssignableFrom(Class)>
	//*   6   13:ifeq            33
			return (TypeAdapter)constructorconstructor.get(TypeToken.get(((Class) (jsonadapter)))).construct();
	//    7   16:aload_0         
	//    8   17:aload_3         
	//    9   18:invokestatic    #38  <Method TypeToken TypeToken.get(Class)>
	//   10   21:invokevirtual   #43  <Method ObjectConstructor ConstructorConstructor.get(TypeToken)>
	//   11   24:invokeinterface #49  <Method Object ObjectConstructor.construct()>
	//   12   29:checkcast       #26  <Class TypeAdapter>
	//   13   32:areturn         
		if(((Class) (com/google/gson/TypeAdapterFactory)).isAssignableFrom(((Class) (jsonadapter))))
	//*  14   33:ldc1            #6   <Class TypeAdapterFactory>
	//*  15   35:aload_3         
	//*  16   36:invokevirtual   #32  <Method boolean Class.isAssignableFrom(Class)>
	//*  17   39:ifeq            66
			return ((TypeAdapterFactory)constructorconstructor.get(TypeToken.get(((Class) (jsonadapter)))).construct()).create(gson, typetoken);
	//   18   42:aload_0         
	//   19   43:aload_3         
	//   20   44:invokestatic    #38  <Method TypeToken TypeToken.get(Class)>
	//   21   47:invokevirtual   #43  <Method ObjectConstructor ConstructorConstructor.get(TypeToken)>
	//   22   50:invokeinterface #49  <Method Object ObjectConstructor.construct()>
	//   23   55:checkcast       #6   <Class TypeAdapterFactory>
	//   24   58:aload_1         
	//   25   59:aload_2         
	//   26   60:invokeinterface #53  <Method TypeAdapter TypeAdapterFactory.create(Gson, TypeToken)>
	//   27   65:areturn         
		else
			throw new IllegalArgumentException("@JsonAdapter value must be TypeAdapter or TypeAdapterFactory reference.");
	//   28   66:new             #55  <Class IllegalArgumentException>
	//   29   69:dup             
	//   30   70:ldc1            #57  <String "@JsonAdapter value must be TypeAdapter or TypeAdapterFactory reference.">
	//   31   72:invokespecial   #60  <Method void IllegalArgumentException(String)>
	//   32   75:athrow          
	}

	public TypeAdapter create(Gson gson, TypeToken typetoken)
	{
		JsonAdapter jsonadapter = (JsonAdapter)typetoken.getRawType().getAnnotation(com/google/gson/annotations/JsonAdapter);
	//    0    0:aload_2         
	//    1    1:invokevirtual   #65  <Method Class TypeToken.getRawType()>
	//    2    4:ldc1            #20  <Class JsonAdapter>
	//    3    6:invokevirtual   #69  <Method java.lang.annotation.Annotation Class.getAnnotation(Class)>
	//    4    9:checkcast       #20  <Class JsonAdapter>
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
	//   11   20:getfield        #15  <Field ConstructorConstructor constructorConstructor>
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:invokestatic    #71  <Method TypeAdapter getTypeAdapter(ConstructorConstructor, Gson, TypeToken, JsonAdapter)>
	//   16   29:areturn         
	}

	private final ConstructorConstructor constructorConstructor;
}
