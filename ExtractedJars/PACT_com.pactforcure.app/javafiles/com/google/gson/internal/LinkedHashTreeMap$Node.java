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
		boolean flag1;
		flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		flag = flag1;
	//    2    2:iload_3         
	//    3    3:istore_2        
		if(!(obj instanceof java.util.Map.Entry)) goto _L2; else goto _L1
	//    4    4:aload_1         
	//    5    5:instanceof      #7   <Class java.util.Map$Entry>
	//    6    8:ifeq            54
_L1:
		obj = ((Object) ((java.util.Map.Entry)obj));
	//    7   11:aload_1         
	//    8   12:checkcast       #7   <Class java.util.Map$Entry>
	//    9   15:astore_1        
		if(key != null) goto _L4; else goto _L3
	//   10   16:aload_0         
	//   11   17:getfield        #31  <Field Object key>
	//   12   20:ifnonnull       56
_L3:
		flag = flag1;
	//   13   23:iload_3         
	//   14   24:istore_2        
		if(((java.util.Map.Entry) (obj)).getKey() != null) goto _L2; else goto _L5
	//   15   25:aload_1         
	//   16   26:invokeinterface #51  <Method Object java.util.Map$Entry.getKey()>
	//   17   31:ifnonnull       54
_L5:
		if(value != null) goto _L7; else goto _L6
	//   18   34:aload_0         
	//   19   35:getfield        #53  <Field Object value>
	//   20   38:ifnonnull       77
_L6:
		flag = flag1;
	//   21   41:iload_3         
	//   22   42:istore_2        
		if(((java.util.Map.Entry) (obj)).getValue() != null) goto _L2; else goto _L8
	//   23   43:aload_1         
	//   24   44:invokeinterface #56  <Method Object java.util.Map$Entry.getValue()>
	//   25   49:ifnonnull       54
_L8:
		flag = true;
	//   26   52:iconst_1        
	//   27   53:istore_2        
_L2:
		return flag;
	//   28   54:iload_2         
	//   29   55:ireturn         
_L4:
		flag = flag1;
	//   30   56:iload_3         
	//   31   57:istore_2        
		if(!key.equals(((java.util.Map.Entry) (obj)).getKey())) goto _L2; else goto _L5
	//   32   58:aload_0         
	//   33   59:getfield        #31  <Field Object key>
	//   34   62:aload_1         
	//   35   63:invokeinterface #51  <Method Object java.util.Map$Entry.getKey()>
	//   36   68:invokevirtual   #58  <Method boolean Object.equals(Object)>
	//   37   71:ifeq            54
	//*  38   74:goto            34
_L7:
		flag = flag1;
	//   39   77:iload_3         
	//   40   78:istore_2        
		if(!value.equals(((java.util.Map.Entry) (obj)).getValue())) goto _L2; else goto _L8
	//   41   79:aload_0         
	//   42   80:getfield        #53  <Field Object value>
	//   43   83:aload_1         
	//   44   84:invokeinterface #56  <Method Object java.util.Map$Entry.getValue()>
	//   45   89:invokevirtual   #58  <Method boolean Object.equals(Object)>
	//   46   92:ifeq            54
	//*  47   95:goto            52
	}

	public LinkedHashTreeMap$Node first()
	{
		LinkedHashTreeMap$Node linkedhashtreemap$node1 = this;
	//    0    0:aload_0         
	//    1    1:astore_2        
		for(LinkedHashTreeMap$Node linkedhashtreemap$node = linkedhashtreemap$node1.left; linkedhashtreemap$node != null; linkedhashtreemap$node = linkedhashtreemap$node1.left)
	//*   2    2:aload_2         
	//*   3    3:getfield        #62  <Field LinkedHashTreeMap$Node left>
	//*   4    6:astore_1        
	//*   5    7:aload_1         
	//*   6    8:ifnull          21
			linkedhashtreemap$node1 = linkedhashtreemap$node;
	//    7   11:aload_1         
	//    8   12:astore_2        

	//    9   13:aload_2         
	//   10   14:getfield        #62  <Field LinkedHashTreeMap$Node left>
	//   11   17:astore_1        
	//*  12   18:goto            7
		return linkedhashtreemap$node1;
	//   13   21:aload_2         
	//   14   22:areturn         
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
	//    1    1:getfield        #53  <Field Object value>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int i;
		if(key == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #31  <Field Object key>
	//*   4    6:ifnonnull       22
			i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_1        
		else
	//*   7   11:aload_0         
	//*   8   12:getfield        #53  <Field Object value>
	//*   9   15:ifnonnull       33
	//*  10   18:iload_1         
	//*  11   19:iload_2         
	//*  12   20:ixor            
	//*  13   21:ireturn         
			i = key.hashCode();
	//   14   22:aload_0         
	//   15   23:getfield        #31  <Field Object key>
	//   16   26:invokevirtual   #69  <Method int Object.hashCode()>
	//   17   29:istore_1        
		if(value != null)
	//*  18   30:goto            11
			j = value.hashCode();
	//   19   33:aload_0         
	//   20   34:getfield        #53  <Field Object value>
	//   21   37:invokevirtual   #69  <Method int Object.hashCode()>
	//   22   40:istore_2        
		return ((int) (i ^ j));
	//*  23   41:goto            18
	}

	public LinkedHashTreeMap$Node last()
	{
		LinkedHashTreeMap$Node linkedhashtreemap$node1 = this;
	//    0    0:aload_0         
	//    1    1:astore_2        
		for(LinkedHashTreeMap$Node linkedhashtreemap$node = linkedhashtreemap$node1.right; linkedhashtreemap$node != null; linkedhashtreemap$node = linkedhashtreemap$node1.right)
	//*   2    2:aload_2         
	//*   3    3:getfield        #72  <Field LinkedHashTreeMap$Node right>
	//*   4    6:astore_1        
	//*   5    7:aload_1         
	//*   6    8:ifnull          21
			linkedhashtreemap$node1 = linkedhashtreemap$node;
	//    7   11:aload_1         
	//    8   12:astore_2        

	//    9   13:aload_2         
	//   10   14:getfield        #72  <Field LinkedHashTreeMap$Node right>
	//   11   17:astore_1        
	//*  12   18:goto            7
		return linkedhashtreemap$node1;
	//   13   21:aload_2         
	//   14   22:areturn         
	}

	public Object setValue(Object obj)
	{
		Object obj1 = value;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Object value>
	//    2    4:astore_2        
		value = obj;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #53  <Field Object value>
		return obj1;
	//    6   10:aload_2         
	//    7   11:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append(key).append("=").append(value).toString();
	//    0    0:new             #79  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #80  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:getfield        #31  <Field Object key>
	//    5   11:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
	//    6   14:ldc1            #86  <String "=">
	//    7   16:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:aload_0         
	//    9   20:getfield        #53  <Field Object value>
	//   10   23:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
	//   11   26:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   12   29:areturn         
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
