// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

// Referenced classes of package com.google.gson.internal.bind:
//			ObjectTypeAdapter

static final class ObjectTypeAdapter$1
	implements TypeAdapterFactory
{

	public TypeAdapter create(Gson gson, TypeToken typetoken)
	{
		if(typetoken.getRawType() == java/lang/Object)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #21  <Method Class TypeToken.getRawType()>
	//*   2    4:ldc1            #4   <Class Object>
	//*   3    6:if_acmpne       19
			return ((TypeAdapter) (new ObjectTypeAdapter(gson, ((ObjectTypeAdapter$1) (null)))));
	//    4    9:new             #8   <Class ObjectTypeAdapter>
	//    5   12:dup             
	//    6   13:aload_1         
	//    7   14:aconst_null     
	//    8   15:invokespecial   #24  <Method void ObjectTypeAdapter(Gson, ObjectTypeAdapter$1)>
	//    9   18:areturn         
		else
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
	}

	ObjectTypeAdapter$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
