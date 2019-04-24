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
		if(((Class) (java/lang/Enum)).isAssignableFrom(((Class) (typetoken))) && typetoken != java/lang/Enum)
	//*   3    5:ldc1            #23  <Class Enum>
	//*   4    7:aload_2         
	//*   5    8:invokevirtual   #29  <Method boolean Class.isAssignableFrom(Class)>
	//*   6   11:ifeq            46
	//*   7   14:aload_2         
	//*   8   15:ldc1            #23  <Class Enum>
	//*   9   17:if_acmpne       23
	//*  10   20:goto            46
		{
			gson = ((Gson) (typetoken));
	//   11   23:aload_2         
	//   12   24:astore_1        
			if(!((Class) (typetoken)).isEnum())
	//*  13   25:aload_2         
	//*  14   26:invokevirtual   #33  <Method boolean Class.isEnum()>
	//*  15   29:ifne            37
				gson = ((Gson) (((Class) (typetoken)).getSuperclass()));
	//   16   32:aload_2         
	//   17   33:invokevirtual   #36  <Method Class Class.getSuperclass()>
	//   18   36:astore_1        
			return ((TypeAdapter) (new mTypeAdapter(((Class) (gson)))));
	//   19   37:new             #38  <Class TypeAdapters$EnumTypeAdapter>
	//   20   40:dup             
	//   21   41:aload_1         
	//   22   42:invokespecial   #41  <Method void TypeAdapters$EnumTypeAdapter(Class)>
	//   23   45:areturn         
		} else
		{
			return null;
	//   24   46:aconst_null     
	//   25   47:areturn         
		}
	}

	TypeAdapters$26()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
