// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

// Referenced classes of package com.google.gson:
//			JsonElement, JsonNull

public final class JsonArray extends JsonElement
	implements Iterable
{

	public JsonArray()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void JsonElement()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void ArrayList()>
	//    6   12:putfield        #19  <Field List elements>
	//    7   15:return          
	}

	public void add(JsonElement jsonelement)
	{
		Object obj = ((Object) (jsonelement));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(jsonelement == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       10
			obj = ((Object) (JsonNull.INSTANCE));
	//    4    6:getstatic       #28  <Field JsonNull JsonNull.INSTANCE>
	//    5    9:astore_2        
		elements.add(obj);
	//    6   10:aload_0         
	//    7   11:getfield        #19  <Field List elements>
	//    8   14:aload_2         
	//    9   15:invokeinterface #33  <Method boolean List.add(Object)>
	//   10   20:pop             
	//   11   21:return          
	}

	public void addAll(JsonArray jsonarray)
	{
		elements.addAll(((java.util.Collection) (jsonarray.elements)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List elements>
	//    2    4:aload_1         
	//    3    5:getfield        #19  <Field List elements>
	//    4    8:invokeinterface #38  <Method boolean List.addAll(java.util.Collection)>
	//    5   13:pop             
	//    6   14:return          
	}

	public boolean contains(JsonElement jsonelement)
	{
		return elements.contains(((Object) (jsonelement)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List elements>
	//    2    4:aload_1         
	//    3    5:invokeinterface #42  <Method boolean List.contains(Object)>
	//    4   10:ireturn         
	}

	JsonArray deepCopy()
	{
		JsonArray jsonarray = new JsonArray();
	//    0    0:new             #2   <Class JsonArray>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void JsonArray()>
	//    3    7:astore_1        
		for(Iterator iterator1 = elements.iterator(); iterator1.hasNext(); jsonarray.add(((JsonElement)iterator1.next()).deepCopy()));
	//    4    8:aload_0         
	//    5    9:getfield        #19  <Field List elements>
	//    6   12:invokeinterface #49  <Method Iterator List.iterator()>
	//    7   17:astore_2        
	//    8   18:aload_2         
	//    9   19:invokeinterface #55  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            46
	//   11   27:aload_1         
	//   12   28:aload_2         
	//   13   29:invokeinterface #59  <Method Object Iterator.next()>
	//   14   34:checkcast       #5   <Class JsonElement>
	//   15   37:invokevirtual   #62  <Method JsonElement JsonElement.deepCopy()>
	//   16   40:invokevirtual   #64  <Method void add(JsonElement)>
	//*  17   43:goto            18
		return jsonarray;
	//   18   46:aload_1         
	//   19   47:areturn         
	}

	volatile JsonElement deepCopy()
	{
		return ((JsonElement) (deepCopy()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method JsonArray deepCopy()>
	//    2    4:areturn         
	}

	public boolean equals(Object obj)
	{
		return obj == this || (obj instanceof JsonArray) && ((Object) (((JsonArray)obj).elements)).equals(((Object) (elements)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:if_acmpeq       34
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class JsonArray>
	//    5    9:ifeq            32
	//    6   12:aload_1         
	//    7   13:checkcast       #2   <Class JsonArray>
	//    8   16:getfield        #19  <Field List elements>
	//    9   19:aload_0         
	//   10   20:getfield        #19  <Field List elements>
	//   11   23:invokevirtual   #71  <Method boolean Object.equals(Object)>
	//   12   26:ifeq            32
	//   13   29:goto            34
	//   14   32:iconst_0        
	//   15   33:ireturn         
	//   16   34:iconst_1        
	//   17   35:ireturn         
	}

	public JsonElement get(int i)
	{
		return (JsonElement)elements.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List elements>
	//    2    4:iload_1         
	//    3    5:invokeinterface #76  <Method Object List.get(int)>
	//    4   10:checkcast       #5   <Class JsonElement>
	//    5   13:areturn         
	}

	public BigDecimal getAsBigDecimal()
	{
		if(elements.size() == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List elements>
	//*   2    4:invokeinterface #82  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:icmpne          30
			return ((JsonElement)elements.get(0)).getAsBigDecimal();
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field List elements>
	//    7   17:iconst_0        
	//    8   18:invokeinterface #76  <Method Object List.get(int)>
	//    9   23:checkcast       #5   <Class JsonElement>
	//   10   26:invokevirtual   #84  <Method BigDecimal JsonElement.getAsBigDecimal()>
	//   11   29:areturn         
		else
			throw new IllegalStateException();
	//   12   30:new             #86  <Class IllegalStateException>
	//   13   33:dup             
	//   14   34:invokespecial   #87  <Method void IllegalStateException()>
	//   15   37:athrow          
	}

	public BigInteger getAsBigInteger()
	{
		if(elements.size() == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List elements>
	//*   2    4:invokeinterface #82  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:icmpne          30
			return ((JsonElement)elements.get(0)).getAsBigInteger();
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field List elements>
	//    7   17:iconst_0        
	//    8   18:invokeinterface #76  <Method Object List.get(int)>
	//    9   23:checkcast       #5   <Class JsonElement>
	//   10   26:invokevirtual   #91  <Method BigInteger JsonElement.getAsBigInteger()>
	//   11   29:areturn         
		else
			throw new IllegalStateException();
	//   12   30:new             #86  <Class IllegalStateException>
	//   13   33:dup             
	//   14   34:invokespecial   #87  <Method void IllegalStateException()>
	//   15   37:athrow          
	}

	public boolean getAsBoolean()
	{
		if(elements.size() == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List elements>
	//*   2    4:invokeinterface #82  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:icmpne          30
			return ((JsonElement)elements.get(0)).getAsBoolean();
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field List elements>
	//    7   17:iconst_0        
	//    8   18:invokeinterface #76  <Method Object List.get(int)>
	//    9   23:checkcast       #5   <Class JsonElement>
	//   10   26:invokevirtual   #94  <Method boolean JsonElement.getAsBoolean()>
	//   11   29:ireturn         
		else
			throw new IllegalStateException();
	//   12   30:new             #86  <Class IllegalStateException>
	//   13   33:dup             
	//   14   34:invokespecial   #87  <Method void IllegalStateException()>
	//   15   37:athrow          
	}

	public byte getAsByte()
	{
		if(elements.size() == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List elements>
	//*   2    4:invokeinterface #82  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:icmpne          30
			return ((JsonElement)elements.get(0)).getAsByte();
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field List elements>
	//    7   17:iconst_0        
	//    8   18:invokeinterface #76  <Method Object List.get(int)>
	//    9   23:checkcast       #5   <Class JsonElement>
	//   10   26:invokevirtual   #98  <Method byte JsonElement.getAsByte()>
	//   11   29:ireturn         
		else
			throw new IllegalStateException();
	//   12   30:new             #86  <Class IllegalStateException>
	//   13   33:dup             
	//   14   34:invokespecial   #87  <Method void IllegalStateException()>
	//   15   37:athrow          
	}

	public char getAsCharacter()
	{
		if(elements.size() == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List elements>
	//*   2    4:invokeinterface #82  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:icmpne          30
			return ((JsonElement)elements.get(0)).getAsCharacter();
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field List elements>
	//    7   17:iconst_0        
	//    8   18:invokeinterface #76  <Method Object List.get(int)>
	//    9   23:checkcast       #5   <Class JsonElement>
	//   10   26:invokevirtual   #102 <Method char JsonElement.getAsCharacter()>
	//   11   29:ireturn         
		else
			throw new IllegalStateException();
	//   12   30:new             #86  <Class IllegalStateException>
	//   13   33:dup             
	//   14   34:invokespecial   #87  <Method void IllegalStateException()>
	//   15   37:athrow          
	}

	public double getAsDouble()
	{
		if(elements.size() == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List elements>
	//*   2    4:invokeinterface #82  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:icmpne          30
			return ((JsonElement)elements.get(0)).getAsDouble();
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field List elements>
	//    7   17:iconst_0        
	//    8   18:invokeinterface #76  <Method Object List.get(int)>
	//    9   23:checkcast       #5   <Class JsonElement>
	//   10   26:invokevirtual   #106 <Method double JsonElement.getAsDouble()>
	//   11   29:dreturn         
		else
			throw new IllegalStateException();
	//   12   30:new             #86  <Class IllegalStateException>
	//   13   33:dup             
	//   14   34:invokespecial   #87  <Method void IllegalStateException()>
	//   15   37:athrow          
	}

	public float getAsFloat()
	{
		if(elements.size() == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List elements>
	//*   2    4:invokeinterface #82  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:icmpne          30
			return ((JsonElement)elements.get(0)).getAsFloat();
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field List elements>
	//    7   17:iconst_0        
	//    8   18:invokeinterface #76  <Method Object List.get(int)>
	//    9   23:checkcast       #5   <Class JsonElement>
	//   10   26:invokevirtual   #110 <Method float JsonElement.getAsFloat()>
	//   11   29:freturn         
		else
			throw new IllegalStateException();
	//   12   30:new             #86  <Class IllegalStateException>
	//   13   33:dup             
	//   14   34:invokespecial   #87  <Method void IllegalStateException()>
	//   15   37:athrow          
	}

	public int getAsInt()
	{
		if(elements.size() == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List elements>
	//*   2    4:invokeinterface #82  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:icmpne          30
			return ((JsonElement)elements.get(0)).getAsInt();
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field List elements>
	//    7   17:iconst_0        
	//    8   18:invokeinterface #76  <Method Object List.get(int)>
	//    9   23:checkcast       #5   <Class JsonElement>
	//   10   26:invokevirtual   #113 <Method int JsonElement.getAsInt()>
	//   11   29:ireturn         
		else
			throw new IllegalStateException();
	//   12   30:new             #86  <Class IllegalStateException>
	//   13   33:dup             
	//   14   34:invokespecial   #87  <Method void IllegalStateException()>
	//   15   37:athrow          
	}

	public long getAsLong()
	{
		if(elements.size() == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List elements>
	//*   2    4:invokeinterface #82  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:icmpne          30
			return ((JsonElement)elements.get(0)).getAsLong();
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field List elements>
	//    7   17:iconst_0        
	//    8   18:invokeinterface #76  <Method Object List.get(int)>
	//    9   23:checkcast       #5   <Class JsonElement>
	//   10   26:invokevirtual   #117 <Method long JsonElement.getAsLong()>
	//   11   29:lreturn         
		else
			throw new IllegalStateException();
	//   12   30:new             #86  <Class IllegalStateException>
	//   13   33:dup             
	//   14   34:invokespecial   #87  <Method void IllegalStateException()>
	//   15   37:athrow          
	}

	public Number getAsNumber()
	{
		if(elements.size() == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List elements>
	//*   2    4:invokeinterface #82  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:icmpne          30
			return ((JsonElement)elements.get(0)).getAsNumber();
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field List elements>
	//    7   17:iconst_0        
	//    8   18:invokeinterface #76  <Method Object List.get(int)>
	//    9   23:checkcast       #5   <Class JsonElement>
	//   10   26:invokevirtual   #121 <Method Number JsonElement.getAsNumber()>
	//   11   29:areturn         
		else
			throw new IllegalStateException();
	//   12   30:new             #86  <Class IllegalStateException>
	//   13   33:dup             
	//   14   34:invokespecial   #87  <Method void IllegalStateException()>
	//   15   37:athrow          
	}

	public short getAsShort()
	{
		if(elements.size() == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List elements>
	//*   2    4:invokeinterface #82  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:icmpne          30
			return ((JsonElement)elements.get(0)).getAsShort();
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field List elements>
	//    7   17:iconst_0        
	//    8   18:invokeinterface #76  <Method Object List.get(int)>
	//    9   23:checkcast       #5   <Class JsonElement>
	//   10   26:invokevirtual   #125 <Method short JsonElement.getAsShort()>
	//   11   29:ireturn         
		else
			throw new IllegalStateException();
	//   12   30:new             #86  <Class IllegalStateException>
	//   13   33:dup             
	//   14   34:invokespecial   #87  <Method void IllegalStateException()>
	//   15   37:athrow          
	}

	public String getAsString()
	{
		if(elements.size() == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List elements>
	//*   2    4:invokeinterface #82  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:icmpne          30
			return ((JsonElement)elements.get(0)).getAsString();
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field List elements>
	//    7   17:iconst_0        
	//    8   18:invokeinterface #76  <Method Object List.get(int)>
	//    9   23:checkcast       #5   <Class JsonElement>
	//   10   26:invokevirtual   #129 <Method String JsonElement.getAsString()>
	//   11   29:areturn         
		else
			throw new IllegalStateException();
	//   12   30:new             #86  <Class IllegalStateException>
	//   13   33:dup             
	//   14   34:invokespecial   #87  <Method void IllegalStateException()>
	//   15   37:athrow          
	}

	public int hashCode()
	{
		return ((Object) (elements)).hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List elements>
	//    2    4:invokevirtual   #132 <Method int Object.hashCode()>
	//    3    7:ireturn         
	}

	public Iterator iterator()
	{
		return elements.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List elements>
	//    2    4:invokeinterface #49  <Method Iterator List.iterator()>
	//    3    9:areturn         
	}

	public JsonElement remove(int i)
	{
		return (JsonElement)elements.remove(i);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List elements>
	//    2    4:iload_1         
	//    3    5:invokeinterface #137 <Method Object List.remove(int)>
	//    4   10:checkcast       #5   <Class JsonElement>
	//    5   13:areturn         
	}

	public boolean remove(JsonElement jsonelement)
	{
		return elements.remove(((Object) (jsonelement)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List elements>
	//    2    4:aload_1         
	//    3    5:invokeinterface #139 <Method boolean List.remove(Object)>
	//    4   10:ireturn         
	}

	public JsonElement set(int i, JsonElement jsonelement)
	{
		return (JsonElement)elements.set(i, ((Object) (jsonelement)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List elements>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #144 <Method Object List.set(int, Object)>
	//    5   11:checkcast       #5   <Class JsonElement>
	//    6   14:areturn         
	}

	public int size()
	{
		return elements.size();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List elements>
	//    2    4:invokeinterface #82  <Method int List.size()>
	//    3    9:ireturn         
	}

	private final List elements = new ArrayList();
}
