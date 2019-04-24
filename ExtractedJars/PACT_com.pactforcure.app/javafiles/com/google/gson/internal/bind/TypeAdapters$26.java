// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$26
	implements TypeAdapterFactory
{

	public TypeAdapter create(Gson gson, TypeToken typetoken)
	{
		typetoken = ((TypeToken) (typetoken.getRawType()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #21  <Method Class TypeToken.getRawType()>
	//    2    4:astore_2        
		if(!((Class) (java/lang/Enum)).isAssignableFrom(((Class) (typetoken))) || typetoken == java/lang/Enum)
	//*   3    5:ldc1            #23  <Class Enum>
	//*   4    7:aload_2         
	//*   5    8:invokevirtual   #29  <Method boolean Class.isAssignableFrom(Class)>
	//*   6   11:ifeq            20
	//*   7   14:aload_2         
	//*   8   15:ldc1            #23  <Class Enum>
	//*   9   17:if_acmpne       22
			return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
		gson = ((Gson) (typetoken));
	//   12   22:aload_2         
	//   13   23:astore_1        
		if(!((Class) (typetoken)).isEnum())
	//*  14   24:aload_2         
	//*  15   25:invokevirtual   #33  <Method boolean Class.isEnum()>
	//*  16   28:ifne            36
			gson = ((Gson) (((Class) (typetoken)).getSuperclass()));
	//   17   31:aload_2         
	//   18   32:invokevirtual   #36  <Method Class Class.getSuperclass()>
	//   19   35:astore_1        
		return ((TypeAdapter) (new mTypeAdapter(((Class) (gson)))));
	//   20   36:new             #38  <Class TypeAdapters$EnumTypeAdapter>
	//   21   39:dup             
	//   22   40:aload_1         
	//   23   41:invokespecial   #41  <Method void TypeAdapters$EnumTypeAdapter(Class)>
	//   24   44:areturn         
	}

	TypeAdapters$26()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
