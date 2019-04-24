// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;


// Referenced classes of package com.google.gson.internal:
//			LinkedHashTreeMap

static final class LinkedHashTreeMap$Node
	implements java.util.Map.Entry
{

	public boolean equals(Object obj)
	{
		boolean flag;
label0:
		{
			boolean flag2 = obj instanceof java.util.Map.Entry;
	//    0    0:aload_1         
	//    1    1:instanceof      #7   <Class java.util.Map$Entry>
	//    2    4:istore          4
			boolean flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
			flag = flag1;
	//    5    8:iload_3         
	//    6    9:istore_2        
			if(!flag2)
				break label0;
	//    7   10:iload           4
	//    8   12:ifeq            100
			obj = ((Object) ((java.util.Map.Entry)obj));
	//    9   15:aload_1         
	//   10   16:checkcast       #7   <Class java.util.Map$Entry>
	//   11   19:astore_1        
			if(key == null)
	//*  12   20:aload_0         
	//*  13   21:getfield        #31  <Field Object key>
	//*  14   24:ifnonnull       41
			{
				flag = flag1;
	//   15   27:iload_3         
	//   16   28:istore_2        
				if(((java.util.Map.Entry) (obj)).getKey() != null)
	//*  17   29:aload_1         
	//*  18   30:invokeinterface #51  <Method Object java.util.Map$Entry.getKey()>
	//*  19   35:ifnonnull       100
					break label0;
	//   20   38:goto            59
			} else
			{
				flag = flag1;
	//   21   41:iload_3         
	//   22   42:istore_2        
				if(!key.equals(((java.util.Map.Entry) (obj)).getKey()))
					break label0;
	//   23   43:aload_0         
	//   24   44:getfield        #31  <Field Object key>
	//   25   47:aload_1         
	//   26   48:invokeinterface #51  <Method Object java.util.Map$Entry.getKey()>
	//   27   53:invokevirtual   #53  <Method boolean Object.equals(Object)>
	//   28   56:ifeq            100
			}
			if(value == null)
	//*  29   59:aload_0         
	//*  30   60:getfield        #55  <Field Object value>
	//*  31   63:ifnonnull       80
			{
				flag = flag1;
	//   32   66:iload_3         
	//   33   67:istore_2        
				if(((java.util.Map.Entry) (obj)).getValue() != null)
	//*  34   68:aload_1         
	//*  35   69:invokeinterface #58  <Method Object java.util.Map$Entry.getValue()>
	//*  36   74:ifnonnull       100
					break label0;
	//   37   77:goto            98
			} else
			{
				flag = flag1;
	//   38   80:iload_3         
	//   39   81:istore_2        
				if(!value.equals(((java.util.Map.Entry) (obj)).getValue()))
					break label0;
	//   40   82:aload_0         
	//   41   83:getfield        #55  <Field Object value>
	//   42   86:aload_1         
	//   43   87:invokeinterface #58  <Method Object java.util.Map$Entry.getValue()>
	//   44   92:invokevirtual   #53  <Method boolean Object.equals(Object)>
	//   45   95:ifeq            100
			}
			flag = true;
	//   46   98:iconst_1        
	//   47   99:istore_2        
		}
		return flag;
	//   48  100:iload_2         
	//   49  101:ireturn         
	}

	public LinkedHashTreeMap$Node first()
	{
		LinkedHashTreeMap$Node linkedhashtreemap$node = left;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field LinkedHashTreeMap$Node left>
	//    2    4:astore_1        
		LinkedHashTreeMap$Node linkedhashtreemap$node1 = this;
	//    3    5:aload_0         
	//    4    6:astore_2        
		LinkedHashTreeMap$Node linkedhashtreemap$node2;
		for(; linkedhashtreemap$node != null; linkedhashtreemap$node = linkedhashtreemap$node2)
	//*   5    7:aload_1         
	//*   6    8:ifnull          23
		{
			linkedhashtreemap$node2 = linkedhashtreemap$node.left;
	//    7   11:aload_1         
	//    8   12:getfield        #62  <Field LinkedHashTreeMap$Node left>
	//    9   15:astore_3        
			linkedhashtreemap$node1 = linkedhashtreemap$node;
	//   10   16:aload_1         
	//   11   17:astore_2        
		}

	//   12   18:aload_3         
	//   13   19:astore_1        
	//*  14   20:goto            7
		return linkedhashtreemap$node1;
	//   15   23:aload_2         
	//   16   24:areturn         
	}

	public Object getKey()
	{
		return key;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Object key>
	//    2    4:areturn         
	}

	public Object getValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Object value>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		Object obj = key;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Object key>
	//    2    4:astore_3        
		int j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		int i;
		if(obj == null)
	//*   5    7:aload_3         
	//*   6    8:ifnonnull       16
			i = 0;
	//    7   11:iconst_0        
	//    8   12:istore_1        
		else
	//*   9   13:goto            24
			i = key.hashCode();
	//   10   16:aload_0         
	//   11   17:getfield        #31  <Field Object key>
	//   12   20:invokevirtual   #69  <Method int Object.hashCode()>
	//   13   23:istore_1        
		if(value != null)
	//*  14   24:aload_0         
	//*  15   25:getfield        #55  <Field Object value>
	//*  16   28:ifnonnull       34
	//*  17   31:goto            42
			j = value.hashCode();
	//   18   34:aload_0         
	//   19   35:getfield        #55  <Field Object value>
	//   20   38:invokevirtual   #69  <Method int Object.hashCode()>
	//   21   41:istore_2        
		return i ^ j;
	//   22   42:iload_1         
	//   23   43:iload_2         
	//   24   44:ixor            
	//   25   45:ireturn         
	}

	public LinkedHashTreeMap$Node last()
	{
		LinkedHashTreeMap$Node linkedhashtreemap$node = right;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field LinkedHashTreeMap$Node right>
	//    2    4:astore_1        
		LinkedHashTreeMap$Node linkedhashtreemap$node1 = this;
	//    3    5:aload_0         
	//    4    6:astore_2        
		LinkedHashTreeMap$Node linkedhashtreemap$node2;
		for(; linkedhashtreemap$node != null; linkedhashtreemap$node = linkedhashtreemap$node2)
	//*   5    7:aload_1         
	//*   6    8:ifnull          23
		{
			linkedhashtreemap$node2 = linkedhashtreemap$node.right;
	//    7   11:aload_1         
	//    8   12:getfield        #72  <Field LinkedHashTreeMap$Node right>
	//    9   15:astore_3        
			linkedhashtreemap$node1 = linkedhashtreemap$node;
	//   10   16:aload_1         
	//   11   17:astore_2        
		}

	//   12   18:aload_3         
	//   13   19:astore_1        
	//*  14   20:goto            7
		return linkedhashtreemap$node1;
	//   15   23:aload_2         
	//   16   24:areturn         
	}

	public Object setValue(Object obj)
	{
		Object obj1 = value;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Object value>
	//    2    4:astore_2        
		value = obj;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #55  <Field Object value>
		return obj1;
	//    6   10:aload_2         
	//    7   11:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #79  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #80  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(key);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field Object key>
	//    7   13:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
	//    8   16:pop             
		stringbuilder.append("=");
	//    9   17:aload_1         
	//   10   18:ldc1            #86  <String "=">
	//   11   20:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(value);
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #55  <Field Object value>
	//   16   29:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
	//   17   32:pop             
		return stringbuilder.toString();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   20   37:areturn         
	}

	final int hash;
	int height;
	final Object key;
	LinkedHashTreeMap$Node left;
	LinkedHashTreeMap$Node next;
	LinkedHashTreeMap$Node parent;
	LinkedHashTreeMap$Node prev;
	LinkedHashTreeMap$Node right;
	Object value;

	LinkedHashTreeMap$Node()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		key = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #31  <Field Object key>
		hash = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #33  <Field int hash>
		prev = this;
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:putfield        #35  <Field LinkedHashTreeMap$Node prev>
		next = this;
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:putfield        #37  <Field LinkedHashTreeMap$Node next>
	//   14   24:return          
	}

	LinkedHashTreeMap$Node(LinkedHashTreeMap$Node linkedhashtreemap$node, Object obj, int i, LinkedHashTreeMap$Node linkedhashtreemap$node1, LinkedHashTreeMap$Node linkedhashtreemap$node2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		parent = linkedhashtreemap$node;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #41  <Field LinkedHashTreeMap$Node parent>
		key = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field Object key>
		hash = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #33  <Field int hash>
		height = 1;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #43  <Field int height>
		next = linkedhashtreemap$node1;
	//   14   24:aload_0         
	//   15   25:aload           4
	//   16   27:putfield        #37  <Field LinkedHashTreeMap$Node next>
		prev = linkedhashtreemap$node2;
	//   17   30:aload_0         
	//   18   31:aload           5
	//   19   33:putfield        #35  <Field LinkedHashTreeMap$Node prev>
		linkedhashtreemap$node2.next = this;
	//   20   36:aload           5
	//   21   38:aload_0         
	//   22   39:putfield        #37  <Field LinkedHashTreeMap$Node next>
		linkedhashtreemap$node1.prev = this;
	//   23   42:aload           4
	//   24   44:aload_0         
	//   25   45:putfield        #35  <Field LinkedHashTreeMap$Node prev>
	//   26   48:return          
	}
}
