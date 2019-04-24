// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;


// Referenced classes of package com.google.gson.internal:
//			LinkedTreeMap

static final class LinkedTreeMap$Node
	implements java.util.Map.Entry
{

	public boolean equals(Object obj)
	{
		if(obj instanceof java.util.Map.Entry)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #7   <Class java.util.Map$Entry>
	//*   2    4:ifeq            86
		{
			obj = ((Object) ((java.util.Map.Entry)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #7   <Class java.util.Map$Entry>
	//    5   11:astore_1        
			return (key != null ? key.equals(((java.util.Map.Entry) (obj)).getKey()) : ((java.util.Map.Entry) (obj)).getKey() == null) && (value != null ? value.equals(((java.util.Map.Entry) (obj)).getValue()) : ((java.util.Map.Entry) (obj)).getValue() == null);
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field Object key>
	//    8   16:ifnonnull       31
	//    9   19:aload_1         
	//   10   20:invokeinterface #48  <Method Object java.util.Map$Entry.getKey()>
	//   11   25:ifnonnull       84
	//   12   28:goto            47
	//   13   31:aload_0         
	//   14   32:getfield        #30  <Field Object key>
	//   15   35:aload_1         
	//   16   36:invokeinterface #48  <Method Object java.util.Map$Entry.getKey()>
	//   17   41:invokevirtual   #50  <Method boolean Object.equals(Object)>
	//   18   44:ifeq            84
	//   19   47:aload_0         
	//   20   48:getfield        #52  <Field Object value>
	//   21   51:ifnonnull       66
	//   22   54:aload_1         
	//   23   55:invokeinterface #55  <Method Object java.util.Map$Entry.getValue()>
	//   24   60:ifnonnull       84
	//   25   63:goto            82
	//   26   66:aload_0         
	//   27   67:getfield        #52  <Field Object value>
	//   28   70:aload_1         
	//   29   71:invokeinterface #55  <Method Object java.util.Map$Entry.getValue()>
	//   30   76:invokevirtual   #50  <Method boolean Object.equals(Object)>
	//   31   79:ifeq            84
	//   32   82:iconst_1        
	//   33   83:ireturn         
	//   34   84:iconst_0        
	//   35   85:ireturn         
		} else
		{
			return false;
	//   36   86:iconst_0        
	//   37   87:ireturn         
		}
	}

	public LinkedTreeMap$Node first()
	{
		LinkedTreeMap$Node linkedtreemap$node1 = this;
	//    0    0:aload_0         
	//    1    1:astore_2        
		LinkedTreeMap$Node linkedtreemap$node2;
		for(LinkedTreeMap$Node linkedtreemap$node = linkedtreemap$node1.left; linkedtreemap$node != null; linkedtreemap$node = linkedtreemap$node2)
	//*   2    2:aload_2         
	//*   3    3:getfield        #59  <Field LinkedTreeMap$Node left>
	//*   4    6:astore_1        
	//*   5    7:aload_1         
	//*   6    8:ifnull          23
		{
			linkedtreemap$node2 = linkedtreemap$node.left;
	//    7   11:aload_1         
	//    8   12:getfield        #59  <Field LinkedTreeMap$Node left>
	//    9   15:astore_3        
			linkedtreemap$node1 = linkedtreemap$node;
	//   10   16:aload_1         
	//   11   17:astore_2        
		}

	//   12   18:aload_3         
	//   13   19:astore_1        
	//*  14   20:goto            7
		return linkedtreemap$node1;
	//   15   23:aload_2         
	//   16   24:areturn         
	}

	public Object getKey()
	{
		return key;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Object key>
	//    2    4:areturn         
	}

	public Object getValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Object value>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		int i;
		if(key == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field Object key>
	//*   2    4:ifnonnull       12
			i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
		else
	//*   5    9:goto            20
			i = key.hashCode();
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field Object key>
	//    8   16:invokevirtual   #66  <Method int Object.hashCode()>
	//    9   19:istore_1        
		int j;
		if(value == null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #52  <Field Object value>
	//*  12   24:ifnonnull       32
			j = 0;
	//   13   27:iconst_0        
	//   14   28:istore_2        
		else
	//*  15   29:goto            40
			j = value.hashCode();
	//   16   32:aload_0         
	//   17   33:getfield        #52  <Field Object value>
	//   18   36:invokevirtual   #66  <Method int Object.hashCode()>
	//   19   39:istore_2        
		return i ^ j;
	//   20   40:iload_1         
	//   21   41:iload_2         
	//   22   42:ixor            
	//   23   43:ireturn         
	}

	public LinkedTreeMap$Node last()
	{
		LinkedTreeMap$Node linkedtreemap$node1 = this;
	//    0    0:aload_0         
	//    1    1:astore_2        
		LinkedTreeMap$Node linkedtreemap$node2;
		for(LinkedTreeMap$Node linkedtreemap$node = linkedtreemap$node1.right; linkedtreemap$node != null; linkedtreemap$node = linkedtreemap$node2)
	//*   2    2:aload_2         
	//*   3    3:getfield        #69  <Field LinkedTreeMap$Node right>
	//*   4    6:astore_1        
	//*   5    7:aload_1         
	//*   6    8:ifnull          23
		{
			linkedtreemap$node2 = linkedtreemap$node.right;
	//    7   11:aload_1         
	//    8   12:getfield        #69  <Field LinkedTreeMap$Node right>
	//    9   15:astore_3        
			linkedtreemap$node1 = linkedtreemap$node;
	//   10   16:aload_1         
	//   11   17:astore_2        
		}

	//   12   18:aload_3         
	//   13   19:astore_1        
	//*  14   20:goto            7
		return linkedtreemap$node1;
	//   15   23:aload_2         
	//   16   24:areturn         
	}

	public Object setValue(Object obj)
	{
		Object obj1 = value;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Object value>
	//    2    4:astore_2        
		value = obj;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #52  <Field Object value>
		return obj1;
	//    6   10:aload_2         
	//    7   11:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append(key).append("=").append(value).toString();
	//    0    0:new             #76  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #77  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field Object key>
	//    5   11:invokevirtual   #81  <Method StringBuilder StringBuilder.append(Object)>
	//    6   14:ldc1            #83  <String "=">
	//    7   16:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:aload_0         
	//    9   20:getfield        #52  <Field Object value>
	//   10   23:invokevirtual   #81  <Method StringBuilder StringBuilder.append(Object)>
	//   11   26:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   12   29:areturn         
	}

	int height;
	final Object key;
	LinkedTreeMap$Node left;
	LinkedTreeMap$Node next;
	LinkedTreeMap$Node parent;
	LinkedTreeMap$Node prev;
	LinkedTreeMap$Node right;
	Object value;

	LinkedTreeMap$Node()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		key = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #30  <Field Object key>
		prev = this;
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:putfield        #32  <Field LinkedTreeMap$Node prev>
		next = this;
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:putfield        #34  <Field LinkedTreeMap$Node next>
	//   11   19:return          
	}

	LinkedTreeMap$Node(LinkedTreeMap$Node linkedtreemap$node, Object obj, LinkedTreeMap$Node linkedtreemap$node1, LinkedTreeMap$Node linkedtreemap$node2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		parent = linkedtreemap$node;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field LinkedTreeMap$Node parent>
		key = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #30  <Field Object key>
		height = 1;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #40  <Field int height>
		next = linkedtreemap$node1;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #34  <Field LinkedTreeMap$Node next>
		prev = linkedtreemap$node2;
	//   14   24:aload_0         
	//   15   25:aload           4
	//   16   27:putfield        #32  <Field LinkedTreeMap$Node prev>
		linkedtreemap$node2.next = this;
	//   17   30:aload           4
	//   18   32:aload_0         
	//   19   33:putfield        #34  <Field LinkedTreeMap$Node next>
		linkedtreemap$node1.prev = this;
	//   20   36:aload_3         
	//   21   37:aload_0         
	//   22   38:putfield        #32  <Field LinkedTreeMap$Node prev>
	//   23   41:return          
	}
}
