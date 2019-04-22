// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.field;

import com.apollographql.apollo.api.ResponseField;
import java.util.Map;

// Referenced classes of package com.apollographql.apollo.internal.field:
//			FieldValueResolver

public final class MapFieldValueResolver
	implements FieldValueResolver
{

	public MapFieldValueResolver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public volatile Object valueFor(Object obj, ResponseField responsefield)
	{
		return valueFor((Map)obj, responsefield);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #16  <Class Map>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #19  <Method Object valueFor(Map, ResponseField)>
	//    5    9:areturn         
	}

	public Object valueFor(Map map, ResponseField responsefield)
	{
		return map.get(((Object) (responsefield.responseName())));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #25  <Method String ResponseField.responseName()>
	//    3    5:invokeinterface #29  <Method Object Map.get(Object)>
	//    4   10:areturn         
	}
}
