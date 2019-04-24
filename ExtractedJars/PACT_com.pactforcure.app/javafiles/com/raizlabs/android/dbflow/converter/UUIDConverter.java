// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.converter;

import java.util.UUID;

// Referenced classes of package com.raizlabs.android.dbflow.converter:
//			TypeConverter

public class UUIDConverter extends TypeConverter
{

	public UUIDConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void TypeConverter()>
	//    2    4:return          
	}

	public volatile Object getDBValue(Object obj)
	{
		return ((Object) (getDBValue((UUID)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #14  <Class UUID>
	//    3    5:invokevirtual   #17  <Method String getDBValue(UUID)>
	//    4    8:areturn         
	}

	public String getDBValue(UUID uuid)
	{
		if(uuid != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
			return uuid.toString();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #21  <Method String UUID.toString()>
	//    4    8:areturn         
		else
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
	}

	public volatile Object getModelValue(Object obj)
	{
		return ((Object) (getModelValue((String)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #24  <Class String>
	//    3    5:invokevirtual   #27  <Method UUID getModelValue(String)>
	//    4    8:areturn         
	}

	public UUID getModelValue(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return UUID.fromString(s);
	//    4    6:aload_1         
	//    5    7:invokestatic    #30  <Method UUID UUID.fromString(String)>
	//    6   10:areturn         
	}
}
