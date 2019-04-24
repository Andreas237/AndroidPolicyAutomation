// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

// Referenced classes of package com.google.gson:
//			JsonElement, JsonNull, JsonPrimitive

public final class JsonArray extends JsonElement
	implements Iterable
{

	public JsonArray()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void JsonElement()>
		elements = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void ArrayList()>
	//    6   12:putfield        #19  <Field List elements>
	//    7   15:return          
	}

	public JsonArray(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void JsonElement()>
		elements = ((List) (new ArrayList(i)));
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ArrayList>
	//    4    8:dup             
	//    5    9:iload_1         
	//    6   10:invokespecial   #23  <Method void ArrayList(int)>
	//    7   13:putfield        #19  <Field List elements>
	//    8   16:return          
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
	//    4    6:getstatic       #31  <Field JsonNull JsonNull.INSTANCE>
	//    5    9:astore_2        
		elements.add(obj);
	//    6   10:aload_0         
	//    7   11:getfield        #19  <Field List elements>
	//    8   14:aload_2         
	//    9   15:invokeinterface #36  <Method boolean List.add(Object)>
	//   10   20:pop             
	//   11   21:return          
	}

	public void add(Boolean boolean1)
	{
		List list = elements;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List elements>
	//    2    4:astore_2        
		if(boolean1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       16
			boolean1 = ((Boolean) (JsonNull.INSTANCE));
	//    5    9:getstatic       #31  <Field JsonNull JsonNull.INSTANCE>
	//    6   12:astore_1        
		else
	//*   7   13:goto            25
			boolean1 = ((Boolean) (new JsonPrimitive(boolean1)));
	//    8   16:new             #39  <Class JsonPrimitive>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokespecial   #41  <Method void JsonPrimitive(Boolean)>
	//   12   24:astore_1        
		list.add(((Object) (boolean1)));
	//   13   25:aload_2         
	//   14   26:aload_1         
	//   15   27:invokeinterface #36  <Method boolean List.add(Object)>
	//   16   32:pop             
	//   17   33:return          
	}

	public void add(Character character)
	{
		List list = elements;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List elements>
	//    2    4:astore_2        
		if(character == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       16
			character = ((Character) (JsonNull.INSTANCE));
	//    5    9:getstatic       #31  <Field JsonNull JsonNull.INSTANCE>
	//    6   12:astore_1        
		else
	//*   7   13:goto            25
			character = ((Character) (new JsonPrimitive(character)));
	//    8   16:new             #39  <Class JsonPrimitive>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokespecial   #44  <Method void JsonPrimitive(Character)>
	//   12   24:astore_1        
		list.add(((Object) (character)));
	//   13   25:aload_2         
	//   14   26:aload_1         
	//   15   27:invokeinterface #36  <Method boolean List.add(Object)>
	//   16   32:pop             
	//   17   33:return          
	}

	public void add(Number number)
	{
		List list = elements;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List elements>
	//    2    4:astore_2        
		if(number == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       16
			number = ((Number) (JsonNull.INSTANCE));
	//    5    9:getstatic       #31  <Field JsonNull JsonNull.INSTANCE>
	//    6   12:astore_1        
		else
	//*   7   13:goto            25
			number = ((Number) (new JsonPrimitive(number)));
	//    8   16:new             #39  <Class JsonPrimitive>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokespecial   #47  <Method void JsonPrimitive(Number)>
	//   12   24:astore_1        
		list.add(((Object) (number)));
	//   13   25:aload_2         
	//   14   26:aload_1         
	//   15   27:invokeinterface #36  <Method boolean List.add(Object)>
	//   16   32:pop             
	//   17   33:return          
	}

	public void add(String s)
	{
		List list = elements;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List elements>
	//    2    4:astore_2        
		if(s == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       16
			s = ((String) (JsonNull.INSTANCE));
	//    5    9:getstatic       #31  <Field JsonNull JsonNull.INSTANCE>
	//    6   12:astore_1        
		else
	//*   7   13:goto            25
			s = ((String) (new JsonPrimitive(s)));
	//    8   16:new             #39  <Class JsonPrimitive>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokespecial   #50  <Method void JsonPrimitive(String)>
	//   12   24:astore_1        
		list.add(((Object) (s)));
	//   13   25:aload_2         
	//   14   26:aload_1         
	//   15   27:invokeinterface #36  <Method boolean List.add(Object)>
	//   16   32:pop             
	//   17   33:return          
	}

	public void addAll(JsonArray jsonarray)
	{
		elements.addAll(((java.util.Collection) (jsonarray.elements)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List elements>
	//    2    4:aload_1         
	//    3    5:getfield        #19  <Field List elements>
	//    4    8:invokeinterface #55  <Method boolean List.addAll(java.util.Collection)>
	//    5   13:pop             
	//    6   14:return          
	}

	public boolean contains(JsonElement jsonelement)
	{
		return elements.contains(((Object) (jsonelement)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List elements>
	//    2    4:aload_1         
	//    3    5:invokeinterface #59  <Method boolean List.contains(Object)>
	//    4   10:ireturn         
	}

	public JsonArray deepCopy()
	{
		if(!elements.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List elements>
	//*   2    4:invokeinterface #65  <Method boolean List.isEmpty()>
	//*   3    9:ifne            69
		{
			JsonArray jsonarray = new JsonArray(elements.size());
	//    4   12:new             #2   <Class JsonArray>
	//    5   15:dup             
	//    6   16:aload_0         
	//    7   17:getfield        #19  <Field List elements>
	//    8   20:invokeinterface #69  <Method int List.size()>
	//    9   25:invokespecial   #70  <Method void JsonArray(int)>
	//   10   28:astore_1        
			for(Iterator iterator1 = elements.iterator(); iterator1.hasNext(); jsonarray.add(((JsonElement)iterator1.next()).deepCopy()));
	//   11   29:aload_0         
	//   12   30:getfield        #19  <Field List elements>
	//   13   33:invokeinterface #74  <Method Iterator List.iterator()>
	//   14   38:astore_2        
	//   15   39:aload_2         
	//   16   40:invokeinterface #79  <Method boolean Iterator.hasNext()>
	//   17   45:ifeq            67
	//   18   48:aload_1         
	//   19   49:aload_2         
	//   20   50:invokeinterface #83  <Method Object Iterator.next()>
	//   21   55:checkcast       #5   <Class JsonElement>
	//   22   58:invokevirtual   #86  <Method JsonElement JsonElement.deepCopy()>
	//   23   61:invokevirtual   #88  <Method void add(JsonElement)>
	//*  24   64:goto            39
			return jsonarray;
	//   25   67:aload_1         
	//   26   68:areturn         
		} else
		{
			return new JsonArray();
	//   27   69:new             #2   <Class JsonArray>
	//   28   72:dup             
	//   29   73:invokespecial   #89  <Method void JsonArray()>
	//   30   76:areturn         
		}
	}

	public volatile JsonElement deepCopy()
	{
		return ((JsonElement) (deepCopy()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #91  <Method JsonArray deepCopy()>
	//    2    4:areturn         
	}

	public boolean equals(Object obj)
	{
		return obj == this || (obj instanceof JsonArray) && ((JsonArray)obj).elements.equals(((Object) (elements)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:if_acmpeq       31
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class JsonArray>
	//    5    9:ifeq            33
	//    6   12:aload_1         
	//    7   13:checkcast       #2   <Class JsonArray>
	//    8   16:getfield        #19  <Field List elements>
	//    9   19:aload_0         
	//   10   20:getfield        #19  <Field List elements>
	//   11   23:invokeinterface #94  <Method boolean List.equals(Object)>
	//   12   28:ifeq            33
	//   13   31:iconst_1        
	//   14   32:ireturn         
	//   15   33:iconst_0        
	//   16   34:ireturn         
	}

	public JsonElement get(int i)
	{
		return (JsonElement)elements.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List elements>
	//    2    4:iload_1         
	//    3    5:invokeinterface #99  <Method Object List.get(int)>
	//    4   10:checkcast       #5   <Class JsonElement>
	//    5   13:areturn         
	}

	public BigDecimal getAsBigDecimal()
	{
		if(elements.size() == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List elements>
	//*   2    4:invokeinterface #69  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:icmpne          30
			return ((JsonElement)elements.get(0)).getAsBigDecimal();
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field List elements>
	//    7   17:iconst_0        
	//    8   18:invokeinterface #99  <Method Object List.get(int)>
	//    9   23:checkcast       #5   <Class JsonElement>
	//   10   26:invokevirtual   #103 <Method BigDecimal JsonElement.getAsBigDecimal()>
	//   11   29:areturn         
		else
			throw new IllegalStateException();
	//   12   30:new             #105 <Class IllegalStateException>
	//   13   33:dup             
	//   14   34:invokespecial   #106 <Method void IllegalStateException()>
	//   15   37:athrow          
	}

	public BigInteger getAsBigInteger()
	{
		if(elements.size() == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List elements>
	//*   2    4:invokeinterface #69  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:icmpne          30
			return ((JsonElement)elements.get(0)).getAsBigInteger();
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field List elements>
	//    7   17:iconst_0        
	//    8   18:invokeinterface #99  <Method Object List.get(int)>
	//    9   23:checkcast       #5   <Class JsonElement>
	//   10   26:invokevirtual   #110 <Method BigInteger JsonElement.getAsBigInteger()>
	//   11   29:areturn         
		else
			throw new IllegalStateException();
	//   12   30:new             #105 <Class IllegalStateException>
	//   13   33:dup             
	//   14   34:invokespecial   #106 <Method void IllegalStateException()>
	//   15   37:athrow          
	}

	public boolean getAsBoolean()
	{
		if(elements.size() == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List elements>
	//*   2    4:invokeinterface #69  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:icmpne          30
			return ((JsonElement)elements.get(0)).getAsBoolean();
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field List elements>
	//    7   17:iconst_0        
	//    8   18:invokeinterface #99  <Method Object List.get(int)>
	//    9   23:checkcast       #5   <Class JsonElement>
	//   10   26:invokevirtual   #113 <Method boolean JsonElement.getAsBoolean()>
	//   11   29:ireturn         
		else
			throw new IllegalStateException();
	//   12   30:new             #105 <Class IllegalStateException>
	//   13   33:dup             
	//   14   34:invokespecial   #106 <Method void IllegalStateException()>
	//   15   37:athrow          
	}

	public byte getAsByte()
	{
		if(elements.size() == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List elements>
	//*   2    4:invokeinterface #69  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:icmpne          30
			return ((JsonElement)elements.get(0)).getAsByte();
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field List elements>
	//    7   17:iconst_0        
	//    8   18:invokeinterface #99  <Method Object List.get(int)>
	//    9   23:checkcast       #5   <Class JsonElement>
	//   10   26:invokevirtual   #117 <Method byte JsonElement.getAsByte()>
	//   11   29:ireturn         
		else
			throw new IllegalStateException();
	//   12   30:new             #105 <Class IllegalStateException>
	//   13   33:dup             
	//   14   34:invokespecial   #106 <Method void IllegalStateException()>
	//   15   37:athrow          
	}

	public char getAsCharacter()
	{
		if(elements.size() == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List elements>
	//*   2    4:invokeinterface #69  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:icmpne          30
			return ((JsonElement)elements.get(0)).getAsCharacter();
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field List elements>
	//    7   17:iconst_0        
	//    8   18:invokeinterface #99  <Method Object List.get(int)>
	//    9   23:checkcast       #5   <Class JsonElement>
	//   10   26:invokevirtual   #121 <Method char JsonElement.getAsCharacter()>
	//   11   29:ireturn         
		else
			throw new IllegalStateException();
	//   12   30:new             #105 <Class IllegalStateException>
	//   13   33:dup             
	//   14   34:invokespecial   #106 <Method void IllegalStateException()>
	//   15   37:athrow          
	}

	public double getAsDouble()
	{
		if(elements.size() == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List elements>
	//*   2    4:invokeinterface #69  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:icmpne          30
			return ((JsonElement)elements.get(0)).getAsDouble();
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field List elements>
	//    7   17:iconst_0        
	//    8   18:invokeinterface #99  <Method Object List.get(int)>
	//    9   23:checkcast       #5   <Class JsonElement>
	//   10   26:invokevirtual   #125 <Method double JsonElement.getAsDouble()>
	//   11   29:dreturn         
		else
			throw new IllegalStateException();
	//   12   30:new             #105 <Class IllegalStateException>
	//   13   33:dup             
	//   14   34:invokespecial   #106 <Method void IllegalStateException()>
	//   15   37:athrow          
	}

	public float getAsFloat()
	{
		if(elements.size() == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List elements>
	//*   2    4:invokeinterface #69  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:icmpne          30
			return ((JsonElement)elements.get(0)).getAsFloat();
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field List elements>
	//    7   17:iconst_0        
	//    8   18:invokeinterface #99  <Method Object List.get(int)>
	//    9   23:checkcast       #5   <Class JsonElement>
	//   10   26:invokevirtual   #129 <Method float JsonElement.getAsFloat()>
	//   11   29:freturn         
		else
			throw new IllegalStateException();
	//   12   30:new             #105 <Class IllegalStateException>
	//   13   33:dup             
	//   14   34:invokespecial   #106 <Method void IllegalStateException()>
	//   15   37:athrow          
	}

	public int getAsInt()
	{
		if(elements.size() == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List elements>
	//*   2    4:invokeinterface #69  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:icmpne          30
			return ((JsonElement)elements.get(0)).getAsInt();
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field List elements>
	//    7   17:iconst_0        
	//    8   18:invokeinterface #99  <Method Object List.get(int)>
	//    9   23:checkcast       #5   <Class JsonElement>
	//   10   26:invokevirtual   #132 <Method int JsonElement.getAsInt()>
	//   11   29:ireturn         
		else
			throw new IllegalStateException();
	//   12   30:new             #105 <Class IllegalStateException>
	//   13   33:dup             
	//   14   34:invokespecial   #106 <Method void IllegalStateException()>
	//   15   37:athrow          
	}

	public long getAsLong()
	{
		if(elements.size() == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List elements>
	//*   2    4:invokeinterface #69  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:icmpne          30
			return ((JsonElement)elements.get(0)).getAsLong();
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field List elements>
	//    7   17:iconst_0        
	//    8   18:invokeinterface #99  <Method Object List.get(int)>
	//    9   23:checkcast       #5   <Class JsonElement>
	//   10   26:invokevirtual   #136 <Method long JsonElement.getAsLong()>
	//   11   29:lreturn         
		else
			throw new IllegalStateException();
	//   12   30:new             #105 <Class IllegalStateException>
	//   13   33:dup             
	//   14   34:invokespecial   #106 <Method void IllegalStateException()>
	//   15   37:athrow          
	}

	public Number getAsNumber()
	{
		if(elements.size() == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List elements>
	//*   2    4:invokeinterface #69  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:icmpne          30
			return ((JsonElement)elements.get(0)).getAsNumber();
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field List elements>
	//    7   17:iconst_0        
	//    8   18:invokeinterface #99  <Method Object List.get(int)>
	//    9   23:checkcast       #5   <Class JsonElement>
	//   10   26:invokevirtual   #140 <Method Number JsonElement.getAsNumber()>
	//   11   29:areturn         
		else
			throw new IllegalStateException();
	//   12   30:new             #105 <Class IllegalStateException>
	//   13   33:dup             
	//   14   34:invokespecial   #106 <Method void IllegalStateException()>
	//   15   37:athrow          
	}

	public short getAsShort()
	{
		if(elements.size() == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List elements>
	//*   2    4:invokeinterface #69  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:icmpne          30
			return ((JsonElement)elements.get(0)).getAsShort();
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field List elements>
	//    7   17:iconst_0        
	//    8   18:invokeinterface #99  <Method Object List.get(int)>
	//    9   23:checkcast       #5   <Class JsonElement>
	//   10   26:invokevirtual   #144 <Method short JsonElement.getAsShort()>
	//   11   29:ireturn         
		else
			throw new IllegalStateException();
	//   12   30:new             #105 <Class IllegalStateException>
	//   13   33:dup             
	//   14   34:invokespecial   #106 <Method void IllegalStateException()>
	//   15   37:athrow          
	}

	public String getAsString()
	{
		if(elements.size() == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List elements>
	//*   2    4:invokeinterface #69  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:icmpne          30
			return ((JsonElement)elements.get(0)).getAsString();
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field List elements>
	//    7   17:iconst_0        
	//    8   18:invokeinterface #99  <Method Object List.get(int)>
	//    9   23:checkcast       #5   <Class JsonElement>
	//   10   26:invokevirtual   #148 <Method String JsonElement.getAsString()>
	//   11   29:areturn         
		else
			throw new IllegalStateException();
	//   12   30:new             #105 <Class IllegalStateException>
	//   13   33:dup             
	//   14   34:invokespecial   #106 <Method void IllegalStateException()>
	//   15   37:athrow          
	}

	public int hashCode()
	{
		return elements.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List elements>
	//    2    4:invokeinterface #151 <Method int List.hashCode()>
	//    3    9:ireturn         
	}

	public Iterator iterator()
	{
		return elements.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List elements>
	//    2    4:invokeinterface #74  <Method Iterator List.iterator()>
	//    3    9:areturn         
	}

	public JsonElement remove(int i)
	{
		return (JsonElement)elements.remove(i);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List elements>
	//    2    4:iload_1         
	//    3    5:invokeinterface #156 <Method Object List.remove(int)>
	//    4   10:checkcast       #5   <Class JsonElement>
	//    5   13:areturn         
	}

	public boolean remove(JsonElement jsonelement)
	{
		return elements.remove(((Object) (jsonelement)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List elements>
	//    2    4:aload_1         
	//    3    5:invokeinterface #158 <Method boolean List.remove(Object)>
	//    4   10:ireturn         
	}

	public JsonElement set(int i, JsonElement jsonelement)
	{
		return (JsonElement)elements.set(i, ((Object) (jsonelement)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List elements>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #163 <Method Object List.set(int, Object)>
	//    5   11:checkcast       #5   <Class JsonElement>
	//    6   14:areturn         
	}

	public int size()
	{
		return elements.size();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List elements>
	//    2    4:invokeinterface #69  <Method int List.size()>
	//    3    9:ireturn         
	}

	private final List elements;
}
