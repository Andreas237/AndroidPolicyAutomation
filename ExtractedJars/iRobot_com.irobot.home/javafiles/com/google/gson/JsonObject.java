// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.gson:
//			JsonElement, JsonNull, JsonPrimitive, JsonArray

public final class JsonObject extends JsonElement
{

	public JsonObject()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void JsonElement()>
	//    2    4:aload_0         
	//    3    5:new             #13  <Class LinkedTreeMap>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void LinkedTreeMap()>
	//    6   12:putfield        #16  <Field LinkedTreeMap members>
	//    7   15:return          
	}

	private JsonElement createJsonElement(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       8
			return ((JsonElement) (JsonNull.INSTANCE));
	//    2    4:getstatic       #25  <Field JsonNull JsonNull.INSTANCE>
	//    3    7:areturn         
		else
			return ((JsonElement) (new JsonPrimitive(obj)));
	//    4    8:new             #27  <Class JsonPrimitive>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokespecial   #30  <Method void JsonPrimitive(Object)>
	//    8   16:areturn         
	}

	public void add(String s, JsonElement jsonelement)
	{
		Object obj = ((Object) (jsonelement));
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(jsonelement == null)
	//*   2    2:aload_2         
	//*   3    3:ifnonnull       10
			obj = ((Object) (JsonNull.INSTANCE));
	//    4    6:getstatic       #25  <Field JsonNull JsonNull.INSTANCE>
	//    5    9:astore_3        
		members.put(((Object) (s)), obj);
	//    6   10:aload_0         
	//    7   11:getfield        #16  <Field LinkedTreeMap members>
	//    8   14:aload_1         
	//    9   15:aload_3         
	//   10   16:invokevirtual   #36  <Method Object LinkedTreeMap.put(Object, Object)>
	//   11   19:pop             
	//   12   20:return          
	}

	public void addProperty(String s, Boolean boolean1)
	{
		add(s, createJsonElement(((Object) (boolean1))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:aload_2         
	//    4    4:invokespecial   #40  <Method JsonElement createJsonElement(Object)>
	//    5    7:invokevirtual   #42  <Method void add(String, JsonElement)>
	//    6   10:return          
	}

	public void addProperty(String s, Character character)
	{
		add(s, createJsonElement(((Object) (character))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:aload_2         
	//    4    4:invokespecial   #40  <Method JsonElement createJsonElement(Object)>
	//    5    7:invokevirtual   #42  <Method void add(String, JsonElement)>
	//    6   10:return          
	}

	public void addProperty(String s, Number number)
	{
		add(s, createJsonElement(((Object) (number))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:aload_2         
	//    4    4:invokespecial   #40  <Method JsonElement createJsonElement(Object)>
	//    5    7:invokevirtual   #42  <Method void add(String, JsonElement)>
	//    6   10:return          
	}

	public void addProperty(String s, String s1)
	{
		add(s, createJsonElement(((Object) (s1))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:aload_2         
	//    4    4:invokespecial   #40  <Method JsonElement createJsonElement(Object)>
	//    5    7:invokevirtual   #42  <Method void add(String, JsonElement)>
	//    6   10:return          
	}

	volatile JsonElement deepCopy()
	{
		return ((JsonElement) (deepCopy()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method JsonObject deepCopy()>
	//    2    4:areturn         
	}

	JsonObject deepCopy()
	{
		JsonObject jsonobject = new JsonObject();
	//    0    0:new             #2   <Class JsonObject>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void JsonObject()>
	//    3    7:astore_1        
		java.util.Map.Entry entry;
		for(Iterator iterator = members.entrySet().iterator(); iterator.hasNext(); jsonobject.add((String)entry.getKey(), ((JsonElement)entry.getValue()).deepCopy()))
	//*   4    8:aload_0         
	//*   5    9:getfield        #16  <Field LinkedTreeMap members>
	//*   6   12:invokevirtual   #55  <Method Set LinkedTreeMap.entrySet()>
	//*   7   15:invokeinterface #61  <Method Iterator Set.iterator()>
	//*   8   20:astore_2        
	//*   9   21:aload_2         
	//*  10   22:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//*  11   27:ifeq            68
			entry = (java.util.Map.Entry)iterator.next();
	//   12   30:aload_2         
	//   13   31:invokeinterface #71  <Method Object Iterator.next()>
	//   14   36:checkcast       #73  <Class java.util.Map$Entry>
	//   15   39:astore_3        

	//   16   40:aload_1         
	//   17   41:aload_3         
	//   18   42:invokeinterface #76  <Method Object java.util.Map$Entry.getKey()>
	//   19   47:checkcast       #78  <Class String>
	//   20   50:aload_3         
	//   21   51:invokeinterface #81  <Method Object java.util.Map$Entry.getValue()>
	//   22   56:checkcast       #4   <Class JsonElement>
	//   23   59:invokevirtual   #83  <Method JsonElement JsonElement.deepCopy()>
	//   24   62:invokevirtual   #42  <Method void add(String, JsonElement)>
	//*  25   65:goto            21
		return jsonobject;
	//   26   68:aload_1         
	//   27   69:areturn         
	}

	public Set entrySet()
	{
		return members.entrySet();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field LinkedTreeMap members>
	//    2    4:invokevirtual   #55  <Method Set LinkedTreeMap.entrySet()>
	//    3    7:areturn         
	}

	public boolean equals(Object obj)
	{
		return obj == this || (obj instanceof JsonObject) && ((JsonObject)obj).members.equals(((Object) (members)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:if_acmpeq       34
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class JsonObject>
	//    5    9:ifeq            32
	//    6   12:aload_1         
	//    7   13:checkcast       #2   <Class JsonObject>
	//    8   16:getfield        #16  <Field LinkedTreeMap members>
	//    9   19:aload_0         
	//   10   20:getfield        #16  <Field LinkedTreeMap members>
	//   11   23:invokevirtual   #89  <Method boolean LinkedTreeMap.equals(Object)>
	//   12   26:ifeq            32
	//   13   29:goto            34
	//   14   32:iconst_0        
	//   15   33:ireturn         
	//   16   34:iconst_1        
	//   17   35:ireturn         
	}

	public JsonElement get(String s)
	{
		return (JsonElement)members.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field LinkedTreeMap members>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #94  <Method Object LinkedTreeMap.get(Object)>
	//    4    8:checkcast       #4   <Class JsonElement>
	//    5   11:areturn         
	}

	public JsonArray getAsJsonArray(String s)
	{
		return (JsonArray)members.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field LinkedTreeMap members>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #94  <Method Object LinkedTreeMap.get(Object)>
	//    4    8:checkcast       #98  <Class JsonArray>
	//    5   11:areturn         
	}

	public JsonObject getAsJsonObject(String s)
	{
		return (JsonObject)members.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field LinkedTreeMap members>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #94  <Method Object LinkedTreeMap.get(Object)>
	//    4    8:checkcast       #2   <Class JsonObject>
	//    5   11:areturn         
	}

	public JsonPrimitive getAsJsonPrimitive(String s)
	{
		return (JsonPrimitive)members.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field LinkedTreeMap members>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #94  <Method Object LinkedTreeMap.get(Object)>
	//    4    8:checkcast       #27  <Class JsonPrimitive>
	//    5   11:areturn         
	}

	public boolean has(String s)
	{
		return members.containsKey(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field LinkedTreeMap members>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #107 <Method boolean LinkedTreeMap.containsKey(Object)>
	//    4    8:ireturn         
	}

	public int hashCode()
	{
		return members.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field LinkedTreeMap members>
	//    2    4:invokevirtual   #111 <Method int LinkedTreeMap.hashCode()>
	//    3    7:ireturn         
	}

	public JsonElement remove(String s)
	{
		return (JsonElement)members.remove(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field LinkedTreeMap members>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #114 <Method Object LinkedTreeMap.remove(Object)>
	//    4    8:checkcast       #4   <Class JsonElement>
	//    5   11:areturn         
	}

	private final LinkedTreeMap members = new LinkedTreeMap();
}
