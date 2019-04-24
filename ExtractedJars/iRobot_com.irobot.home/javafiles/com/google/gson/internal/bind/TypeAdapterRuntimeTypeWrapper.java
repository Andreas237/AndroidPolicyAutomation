// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class TypeAdapterRuntimeTypeWrapper extends TypeAdapter
{

	TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter typeadapter, Type type1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void TypeAdapter()>
		context = gson;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Gson context>
		_flddelegate = typeadapter;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field TypeAdapter _flddelegate>
		type = type1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field Type type>
	//   11   19:return          
	}

	private Type getRuntimeTypeIfMoreSpecific(Type type1, Object obj)
	{
		Object obj1;
label0:
		{
			obj1 = ((Object) (type1));
	//    0    0:aload_1         
	//    1    1:astore_3        
			if(obj == null)
				break label0;
	//    2    2:aload_2         
	//    3    3:ifnull          33
			if(type1 != java/lang/Object && !(type1 instanceof TypeVariable))
	//*   4    6:aload_1         
	//*   5    7:ldc1            #30  <Class Object>
	//*   6    9:if_acmpeq       28
	//*   7   12:aload_1         
	//*   8   13:instanceof      #32  <Class TypeVariable>
	//*   9   16:ifne            28
			{
				obj1 = ((Object) (type1));
	//   10   19:aload_1         
	//   11   20:astore_3        
				if(!(type1 instanceof Class))
					break label0;
	//   12   21:aload_1         
	//   13   22:instanceof      #34  <Class Class>
	//   14   25:ifeq            33
			}
			obj1 = ((Object) (obj.getClass()));
	//   15   28:aload_2         
	//   16   29:invokevirtual   #38  <Method Class Object.getClass()>
	//   17   32:astore_3        
		}
		return ((Type) (obj1));
	//   18   33:aload_3         
	//   19   34:areturn         
	}

	public Object read(JsonReader jsonreader)
	{
		return _flddelegate.read(jsonreader);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field TypeAdapter _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #42  <Method Object TypeAdapter.read(JsonReader)>
	//    4    8:areturn         
	}

	public void write(JsonWriter jsonwriter, Object obj)
	{
		TypeAdapter typeadapter = _flddelegate;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field TypeAdapter _flddelegate>
	//    2    4:astore_3        
		Type type1 = getRuntimeTypeIfMoreSpecific(type, obj);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #23  <Field Type type>
	//    6   10:aload_2         
	//    7   11:invokespecial   #47  <Method Type getRuntimeTypeIfMoreSpecific(Type, Object)>
	//    8   14:astore          4
		if(type1 != type)
	//*   9   16:aload           4
	//*  10   18:aload_0         
	//*  11   19:getfield        #23  <Field Type type>
	//*  12   22:if_acmpeq       63
		{
			typeadapter = context.getAdapter(TypeToken.get(type1));
	//   13   25:aload_0         
	//   14   26:getfield        #19  <Field Gson context>
	//   15   29:aload           4
	//   16   31:invokestatic    #53  <Method TypeToken TypeToken.get(Type)>
	//   17   34:invokevirtual   #59  <Method TypeAdapter Gson.getAdapter(TypeToken)>
	//   18   37:astore_3        
			if((typeadapter instanceof ReflectiveTypeAdapterFactory.Adapter) && !(_flddelegate instanceof ReflectiveTypeAdapterFactory.Adapter))
	//*  19   38:aload_3         
	//*  20   39:instanceof      #61  <Class ReflectiveTypeAdapterFactory$Adapter>
	//*  21   42:ifne            48
	//*  22   45:goto            63
	//*  23   48:aload_0         
	//*  24   49:getfield        #21  <Field TypeAdapter _flddelegate>
	//*  25   52:instanceof      #61  <Class ReflectiveTypeAdapterFactory$Adapter>
	//*  26   55:ifne            63
				typeadapter = _flddelegate;
	//   27   58:aload_0         
	//   28   59:getfield        #21  <Field TypeAdapter _flddelegate>
	//   29   62:astore_3        
		}
		typeadapter.write(jsonwriter, obj);
	//   30   63:aload_3         
	//   31   64:aload_1         
	//   32   65:aload_2         
	//   33   66:invokevirtual   #63  <Method void TypeAdapter.write(JsonWriter, Object)>
	//   34   69:return          
	}

	private final Gson context;
	private final TypeAdapter _flddelegate;
	private final Type type;
}
