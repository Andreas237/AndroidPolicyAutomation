// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.util.HashMap;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//			PropertyBasedCreator

static class PropertyBasedCreator$CaseInsensitiveMap extends HashMap
{

	public SettableBeanProperty get(Object obj)
	{
		return (SettableBeanProperty)super.get(((Object) (((String)obj).toLowerCase())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class String>
	//    3    5:invokevirtual   #25  <Method String String.toLowerCase()>
	//    4    8:invokespecial   #28  <Method Object HashMap.get(Object)>
	//    5   11:checkcast       #30  <Class SettableBeanProperty>
	//    6   14:areturn         
	}

	public volatile Object get(Object obj)
	{
		return ((Object) (get(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #32  <Method SettableBeanProperty get(Object)>
	//    3    5:areturn         
	}

	public SettableBeanProperty put(String s, SettableBeanProperty settablebeanproperty)
	{
		return (SettableBeanProperty)super.put(((Object) (s.toLowerCase())), ((Object) (settablebeanproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #25  <Method String String.toLowerCase()>
	//    3    5:aload_2         
	//    4    6:invokespecial   #37  <Method Object HashMap.put(Object, Object)>
	//    5    9:checkcast       #30  <Class SettableBeanProperty>
	//    6   12:areturn         
	}

	public volatile Object put(Object obj, Object obj1)
	{
		return ((Object) (put((String)obj, (SettableBeanProperty)obj1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class String>
	//    3    5:aload_2         
	//    4    6:checkcast       #30  <Class SettableBeanProperty>
	//    5    9:invokevirtual   #39  <Method SettableBeanProperty put(String, SettableBeanProperty)>
	//    6   12:areturn         
	}

	private static final long serialVersionUID = 1L;

	PropertyBasedCreator$CaseInsensitiveMap()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void HashMap()>
	//    2    4:return          
	}
}
