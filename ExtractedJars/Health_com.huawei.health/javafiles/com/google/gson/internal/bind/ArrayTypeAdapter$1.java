// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.GenericArrayType;

// Referenced classes of package com.google.gson.internal.bind:
//			ArrayTypeAdapter

static final class ArrayTypeAdapter$1
	implements TypeAdapterFactory
{

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

	ArrayTypeAdapter$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
