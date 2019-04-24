// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.sql.Date;

// Referenced classes of package com.google.gson.internal.bind:
//			SqlDateTypeAdapter

static final class SqlDateTypeAdapter$1
	implements TypeAdapterFactory
{

	public TypeAdapter create(Gson gson, TypeToken typetoken)
	{
		if(typetoken.getRawType() == java/sql/Date)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #21  <Method Class TypeToken.getRawType()>
	//*   2    4:ldc1            #23  <Class Date>
	//*   3    6:if_acmpne       17
			return ((TypeAdapter) (new SqlDateTypeAdapter()));
	//    4    9:new             #8   <Class SqlDateTypeAdapter>
	//    5   12:dup             
	//    6   13:invokespecial   #24  <Method void SqlDateTypeAdapter()>
	//    7   16:areturn         
		else
			return null;
	//    8   17:aconst_null     
	//    9   18:areturn         
	}

	SqlDateTypeAdapter$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
