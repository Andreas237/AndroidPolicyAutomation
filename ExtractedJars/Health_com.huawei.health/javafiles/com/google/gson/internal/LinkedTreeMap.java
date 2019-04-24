// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.*;

public final class LinkedTreeMap extends AbstractMap
	implements Serializable
{
	class EntrySet extends AbstractSet
	{

		public void clear()
		{
			LinkedTreeMap.this.clear();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field LinkedTreeMap this$0>
		//    2    4:invokevirtual   #23  <Method void LinkedTreeMap.clear()>
		//    3    7:return          
		}

		public boolean contains(Object obj)
		{
			return (obj instanceof java.util.Map.Entry) && findByEntry((java.util.Map.Entry)obj) != null;
		//    0    0:aload_1         
		//    1    1:instanceof      #27  <Class java.util.Map$Entry>
		//    2    4:ifeq            23
		//    3    7:aload_0         
		//    4    8:getfield        #16  <Field LinkedTreeMap this$0>
		//    5   11:aload_1         
		//    6   12:checkcast       #27  <Class java.util.Map$Entry>
		//    7   15:invokevirtual   #31  <Method LinkedTreeMap$Node LinkedTreeMap.findByEntry(java.util.Map$Entry)>
		//    8   18:ifnull          23
		//    9   21:iconst_1        
		//   10   22:ireturn         
		//   11   23:iconst_0        
		//   12   24:ireturn         
		}

		public Iterator iterator()
		{
			return ((Iterator) (new LinkedTreeMapIterator() {

				public volatile Object next()
				{
					return ((Object) (next()));
				//    0    0:aload_0         
				//    1    1:invokevirtual   #32  <Method java.util.Map$Entry next()>
				//    2    4:areturn         
				}

				public java.util.Map.Entry next()
				{
					return ((java.util.Map.Entry) (nextNode()));
				//    0    0:aload_0         
				//    1    1:invokevirtual   #36  <Method LinkedTreeMap$Node nextNode()>
				//    2    4:areturn         
				}

				final EntrySet this$1;

			
			{
				this$1 = EntrySet.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field LinkedTreeMap$EntrySet this$1>
				super();
			//    3    5:aload_0         
			//    4    6:aload_1         
			//    5    7:getfield        #23  <Field LinkedTreeMap LinkedTreeMap$EntrySet.this$0>
			//    6   10:invokespecial   #26  <Method void LinkedTreeMap$LinkedTreeMapIterator(LinkedTreeMap)>
			//    7   13:return          
			}
			}
));
		//    0    0:new             #10  <Class LinkedTreeMap$EntrySet$1>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #36  <Method void LinkedTreeMap$EntrySet$1(LinkedTreeMap$EntrySet)>
		//    4    8:areturn         
		}

		public boolean remove(Object obj)
		{
			if(!(obj instanceof java.util.Map.Entry))
		//*   0    0:aload_1         
		//*   1    1:instanceof      #27  <Class java.util.Map$Entry>
		//*   2    4:ifne            9
				return false;
		//    3    7:iconst_0        
		//    4    8:ireturn         
			obj = ((Object) (findByEntry((java.util.Map.Entry)obj)));
		//    5    9:aload_0         
		//    6   10:getfield        #16  <Field LinkedTreeMap this$0>
		//    7   13:aload_1         
		//    8   14:checkcast       #27  <Class java.util.Map$Entry>
		//    9   17:invokevirtual   #31  <Method LinkedTreeMap$Node LinkedTreeMap.findByEntry(java.util.Map$Entry)>
		//   10   20:astore_1        
			if(obj == null)
		//*  11   21:aload_1         
		//*  12   22:ifnonnull       27
			{
				return false;
		//   13   25:iconst_0        
		//   14   26:ireturn         
			} else
			{
				removeInternal(((Node) (obj)), true);
		//   15   27:aload_0         
		//   16   28:getfield        #16  <Field LinkedTreeMap this$0>
		//   17   31:aload_1         
		//   18   32:iconst_1        
		//   19   33:invokevirtual   #43  <Method void LinkedTreeMap.removeInternal(LinkedTreeMap$Node, boolean)>
				return true;
		//   20   36:iconst_1        
		//   21   37:ireturn         
			}
		}

		public int size()
		{
			return LinkedTreeMap.this.size;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field LinkedTreeMap this$0>
		//    2    4:getfield        #48  <Field int LinkedTreeMap.size>
		//    3    7:ireturn         
		}

		final LinkedTreeMap this$0;

		EntrySet()
		{
			this$0 = LinkedTreeMap.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field LinkedTreeMap this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void AbstractSet()>
		//    5    9:return          
		}
	}

	final class KeySet extends AbstractSet
	{

		public void clear()
		{
			LinkedTreeMap.this.clear();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field LinkedTreeMap this$0>
		//    2    4:invokevirtual   #23  <Method void LinkedTreeMap.clear()>
		//    3    7:return          
		}

		public boolean contains(Object obj)
		{
			return containsKey(obj);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field LinkedTreeMap this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #28  <Method boolean LinkedTreeMap.containsKey(Object)>
		//    4    8:ireturn         
		}

		public Iterator iterator()
		{
			return ((Iterator) (new LinkedTreeMapIterator() {

				public Object next()
				{
					return nextNode().key;
				//    0    0:aload_0         
				//    1    1:invokevirtual   #33  <Method LinkedTreeMap$Node nextNode()>
				//    2    4:getfield        #39  <Field Object LinkedTreeMap$Node.key>
				//    3    7:areturn         
				}

				final KeySet this$1;

			
			{
				this$1 = KeySet.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field LinkedTreeMap$KeySet this$1>
				super();
			//    3    5:aload_0         
			//    4    6:aload_1         
			//    5    7:getfield        #23  <Field LinkedTreeMap LinkedTreeMap$KeySet.this$0>
			//    6   10:invokespecial   #26  <Method void LinkedTreeMap$LinkedTreeMapIterator(LinkedTreeMap)>
			//    7   13:return          
			}
			}
));
		//    0    0:new             #10  <Class LinkedTreeMap$KeySet$1>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #33  <Method void LinkedTreeMap$KeySet$1(LinkedTreeMap$KeySet)>
		//    4    8:areturn         
		}

		public boolean remove(Object obj)
		{
			return removeInternalByKey(obj) != null;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field LinkedTreeMap this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #40  <Method LinkedTreeMap$Node LinkedTreeMap.removeInternalByKey(Object)>
		//    4    8:ifnull          13
		//    5   11:iconst_1        
		//    6   12:ireturn         
		//    7   13:iconst_0        
		//    8   14:ireturn         
		}

		public int size()
		{
			return LinkedTreeMap.this.size;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field LinkedTreeMap this$0>
		//    2    4:getfield        #45  <Field int LinkedTreeMap.size>
		//    3    7:ireturn         
		}

		final LinkedTreeMap this$0;

		KeySet()
		{
			this$0 = LinkedTreeMap.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field LinkedTreeMap this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void AbstractSet()>
		//    5    9:return          
		}
	}

	abstract class LinkedTreeMapIterator
		implements Iterator
	{

		public final boolean hasNext()
		{
			return next != header;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field LinkedTreeMap$Node next>
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field LinkedTreeMap this$0>
		//    4    8:getfield        #28  <Field LinkedTreeMap$Node LinkedTreeMap.header>
		//    5   11:if_acmpeq       16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		final Node nextNode()
		{
			Node node = next;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field LinkedTreeMap$Node next>
		//    2    4:astore_1        
			if(node == header)
		//*   3    5:aload_1         
		//*   4    6:aload_0         
		//*   5    7:getfield        #22  <Field LinkedTreeMap this$0>
		//*   6   10:getfield        #28  <Field LinkedTreeMap$Node LinkedTreeMap.header>
		//*   7   13:if_acmpne       24
				throw new NoSuchElementException();
		//    8   16:new             #47  <Class NoSuchElementException>
		//    9   19:dup             
		//   10   20:invokespecial   #48  <Method void NoSuchElementException()>
		//   11   23:athrow          
			if(modCount != expectedModCount)
		//*  12   24:aload_0         
		//*  13   25:getfield        #22  <Field LinkedTreeMap this$0>
		//*  14   28:getfield        #38  <Field int LinkedTreeMap.modCount>
		//*  15   31:aload_0         
		//*  16   32:getfield        #40  <Field int expectedModCount>
		//*  17   35:icmpeq          46
			{
				throw new ConcurrentModificationException();
		//   18   38:new             #50  <Class ConcurrentModificationException>
		//   19   41:dup             
		//   20   42:invokespecial   #51  <Method void ConcurrentModificationException()>
		//   21   45:athrow          
			} else
			{
				next = node.next;
		//   22   46:aload_0         
		//   23   47:aload_1         
		//   24   48:getfield        #32  <Field LinkedTreeMap$Node LinkedTreeMap$Node.next>
		//   25   51:putfield        #33  <Field LinkedTreeMap$Node next>
				lastReturned = node;
		//   26   54:aload_0         
		//   27   55:aload_1         
		//   28   56:putfield        #35  <Field LinkedTreeMap$Node lastReturned>
				return node;
		//   29   59:aload_1         
		//   30   60:areturn         
			}
		}

		public final void remove()
		{
			if(lastReturned == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #35  <Field LinkedTreeMap$Node lastReturned>
		//*   2    4:ifnonnull       15
			{
				throw new IllegalStateException();
		//    3    7:new             #56  <Class IllegalStateException>
		//    4   10:dup             
		//    5   11:invokespecial   #57  <Method void IllegalStateException()>
		//    6   14:athrow          
			} else
			{
				removeInternal(lastReturned, true);
		//    7   15:aload_0         
		//    8   16:getfield        #22  <Field LinkedTreeMap this$0>
		//    9   19:aload_0         
		//   10   20:getfield        #35  <Field LinkedTreeMap$Node lastReturned>
		//   11   23:iconst_1        
		//   12   24:invokevirtual   #61  <Method void LinkedTreeMap.removeInternal(LinkedTreeMap$Node, boolean)>
				lastReturned = null;
		//   13   27:aload_0         
		//   14   28:aconst_null     
		//   15   29:putfield        #35  <Field LinkedTreeMap$Node lastReturned>
				expectedModCount = modCount;
		//   16   32:aload_0         
		//   17   33:aload_0         
		//   18   34:getfield        #22  <Field LinkedTreeMap this$0>
		//   19   37:getfield        #38  <Field int LinkedTreeMap.modCount>
		//   20   40:putfield        #40  <Field int expectedModCount>
				return;
		//   21   43:return          
			}
		}

		int expectedModCount;
		Node lastReturned;
		Node next;
		final LinkedTreeMap this$0;

		LinkedTreeMapIterator()
		{
			this$0 = LinkedTreeMap.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #22  <Field LinkedTreeMap this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #25  <Method void Object()>
			next = header.next;
		//    5    9:aload_0         
		//    6   10:aload_0         
		//    7   11:getfield        #22  <Field LinkedTreeMap this$0>
		//    8   14:getfield        #28  <Field LinkedTreeMap$Node LinkedTreeMap.header>
		//    9   17:getfield        #32  <Field LinkedTreeMap$Node LinkedTreeMap$Node.next>
		//   10   20:putfield        #33  <Field LinkedTreeMap$Node next>
			lastReturned = null;
		//   11   23:aload_0         
		//   12   24:aconst_null     
		//   13   25:putfield        #35  <Field LinkedTreeMap$Node lastReturned>
			expectedModCount = modCount;
		//   14   28:aload_0         
		//   15   29:aload_0         
		//   16   30:getfield        #22  <Field LinkedTreeMap this$0>
		//   17   33:getfield        #38  <Field int LinkedTreeMap.modCount>
		//   18   36:putfield        #40  <Field int expectedModCount>
		//   19   39:return          
		}
	}

	static final class Node
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

		public Node first()
		{
			Node node1 = this;
		//    0    0:aload_0         
		//    1    1:astore_2        
			Node node2;
			for(Node node = node1.left; node != null; node = node2)
		//*   2    2:aload_2         
		//*   3    3:getfield        #59  <Field LinkedTreeMap$Node left>
		//*   4    6:astore_1        
		//*   5    7:aload_1         
		//*   6    8:ifnull          23
			{
				node2 = node.left;
		//    7   11:aload_1         
		//    8   12:getfield        #59  <Field LinkedTreeMap$Node left>
		//    9   15:astore_3        
				node1 = node;
		//   10   16:aload_1         
		//   11   17:astore_2        
			}

		//   12   18:aload_3         
		//   13   19:astore_1        
		//*  14   20:goto            7
			return node1;
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

		public Node last()
		{
			Node node1 = this;
		//    0    0:aload_0         
		//    1    1:astore_2        
			Node node2;
			for(Node node = node1.right; node != null; node = node2)
		//*   2    2:aload_2         
		//*   3    3:getfield        #69  <Field LinkedTreeMap$Node right>
		//*   4    6:astore_1        
		//*   5    7:aload_1         
		//*   6    8:ifnull          23
			{
				node2 = node.right;
		//    7   11:aload_1         
		//    8   12:getfield        #69  <Field LinkedTreeMap$Node right>
		//    9   15:astore_3        
				node1 = node;
		//   10   16:aload_1         
		//   11   17:astore_2        
			}

		//   12   18:aload_3         
		//   13   19:astore_1        
		//*  14   20:goto            7
			return node1;
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
		Node left;
		Node next;
		Node parent;
		Node prev;
		Node right;
		Object value;

		Node()
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

		Node(Node node, Object obj, Node node1, Node node2)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
			parent = node;
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
			next = node1;
		//   11   19:aload_0         
		//   12   20:aload_3         
		//   13   21:putfield        #34  <Field LinkedTreeMap$Node next>
			prev = node2;
		//   14   24:aload_0         
		//   15   25:aload           4
		//   16   27:putfield        #32  <Field LinkedTreeMap$Node prev>
			node2.next = this;
		//   17   30:aload           4
		//   18   32:aload_0         
		//   19   33:putfield        #34  <Field LinkedTreeMap$Node next>
			node1.prev = this;
		//   20   36:aload_3         
		//   21   37:aload_0         
		//   22   38:putfield        #32  <Field LinkedTreeMap$Node prev>
		//   23   41:return          
		}
	}


	public LinkedTreeMap()
	{
		this(NATURAL_ORDER);
	//    0    0:aload_0         
	//    1    1:getstatic       #60  <Field Comparator NATURAL_ORDER>
	//    2    4:invokespecial   #64  <Method void LinkedTreeMap(Comparator)>
	//    3    7:return          
	}

	public LinkedTreeMap(Comparator comparator1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void AbstractMap()>
		size = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #67  <Field int size>
		modCount = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #69  <Field int modCount>
		header = new Node();
	//    8   14:aload_0         
	//    9   15:new             #24  <Class LinkedTreeMap$Node>
	//   10   18:dup             
	//   11   19:invokespecial   #70  <Method void LinkedTreeMap$Node()>
	//   12   22:putfield        #72  <Field LinkedTreeMap$Node header>
		if(comparator1 == null)
	//*  13   25:aload_1         
	//*  14   26:ifnull          32
	//*  15   29:goto            36
			comparator1 = NATURAL_ORDER;
	//   16   32:getstatic       #60  <Field Comparator NATURAL_ORDER>
	//   17   35:astore_1        
		comparator = comparator1;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:putfield        #74  <Field Comparator comparator>
	//   21   41:return          
	}

	private boolean equal(Object obj, Object obj1)
	{
		return obj == obj1 || obj != null && obj.equals(obj1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:if_acmpeq       17
	//    3    5:aload_1         
	//    4    6:ifnull          19
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #84  <Method boolean Object.equals(Object)>
	//    8   14:ifeq            19
	//    9   17:iconst_1        
	//   10   18:ireturn         
	//   11   19:iconst_0        
	//   12   20:ireturn         
	}

	private void rebalance(Node node, boolean flag)
	{
		for(; node != null; node = node.parent)
	//*   0    0:aload_1         
	//*   1    1:ifnull          361
		{
			Node node1 = node.left;
	//    2    4:aload_1         
	//    3    5:getfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//    4    8:astore          6
			Node node2 = node.right;
	//    5   10:aload_1         
	//    6   11:getfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//    7   14:astore          7
			int i;
			if(node1 != null)
	//*   8   16:aload           6
	//*   9   18:ifnull          30
				i = node1.height;
	//   10   21:aload           6
	//   11   23:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//   12   26:istore_3        
			else
	//*  13   27:goto            32
				i = 0;
	//   14   30:iconst_0        
	//   15   31:istore_3        
			int j;
			if(node2 != null)
	//*  16   32:aload           7
	//*  17   34:ifnull          47
				j = node2.height;
	//   18   37:aload           7
	//   19   39:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//   20   42:istore          4
			else
	//*  21   44:goto            50
				j = 0;
	//   22   47:iconst_0        
	//   23   48:istore          4
			int k = i - j;
	//   24   50:iload_3         
	//   25   51:iload           4
	//   26   53:isub            
	//   27   54:istore          5
			if(k == -2)
	//*  28   56:iload           5
	//*  29   58:bipush          -2
	//*  30   60:icmpne          175
			{
				node1 = node2.left;
	//   31   63:aload           7
	//   32   65:getfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//   33   68:astore          6
				Node node4 = node2.right;
	//   34   70:aload           7
	//   35   72:getfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//   36   75:astore          8
				if(node4 != null)
	//*  37   77:aload           8
	//*  38   79:ifnull          91
					i = node4.height;
	//   39   82:aload           8
	//   40   84:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//   41   87:istore_3        
				else
	//*  42   88:goto            93
					i = 0;
	//   43   91:iconst_0        
	//   44   92:istore_3        
				if(node1 != null)
	//*  45   93:aload           6
	//*  46   95:ifnull          108
					j = node1.height;
	//   47   98:aload           6
	//   48  100:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//   49  103:istore          4
				else
	//*  50  105:goto            111
					j = 0;
	//   51  108:iconst_0        
	//   52  109:istore          4
				i = j - i;
	//   53  111:iload           4
	//   54  113:iload_3         
	//   55  114:isub            
	//   56  115:istore_3        
				if(i == -1 || i == 0 && !flag)
	//*  57  116:iload_3         
	//*  58  117:iconst_m1       
	//*  59  118:icmpeq          129
	//*  60  121:iload_3         
	//*  61  122:ifne            137
	//*  62  125:iload_2         
	//*  63  126:ifne            137
				{
					rotateLeft(node);
	//   64  129:aload_0         
	//   65  130:aload_1         
	//   66  131:invokespecial   #99  <Method void rotateLeft(LinkedTreeMap$Node)>
				} else
	//*  67  134:goto            167
				{
					if(!$assertionsDisabled && i != 1)
	//*  68  137:getstatic       #55  <Field boolean $assertionsDisabled>
	//*  69  140:ifne            156
	//*  70  143:iload_3         
	//*  71  144:iconst_1        
	//*  72  145:icmpeq          156
						throw new AssertionError();
	//   73  148:new             #101 <Class AssertionError>
	//   74  151:dup             
	//   75  152:invokespecial   #102 <Method void AssertionError()>
	//   76  155:athrow          
					rotateRight(node2);
	//   77  156:aload_0         
	//   78  157:aload           7
	//   79  159:invokespecial   #105 <Method void rotateRight(LinkedTreeMap$Node)>
					rotateLeft(node);
	//   80  162:aload_0         
	//   81  163:aload_1         
	//   82  164:invokespecial   #99  <Method void rotateLeft(LinkedTreeMap$Node)>
				}
				if(flag)
	//*  83  167:iload_2         
	//*  84  168:ifeq            172
					return;
	//   85  171:return          
				continue;
	//   86  172:goto            353
			}
			if(k == 2)
	//*  87  175:iload           5
	//*  88  177:iconst_2        
	//*  89  178:icmpne          293
			{
				Node node3 = node1.left;
	//   90  181:aload           6
	//   91  183:getfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//   92  186:astore          7
				Node node5 = node1.right;
	//   93  188:aload           6
	//   94  190:getfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//   95  193:astore          8
				if(node5 != null)
	//*  96  195:aload           8
	//*  97  197:ifnull          209
					i = node5.height;
	//   98  200:aload           8
	//   99  202:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//  100  205:istore_3        
				else
	//* 101  206:goto            211
					i = 0;
	//  102  209:iconst_0        
	//  103  210:istore_3        
				if(node3 != null)
	//* 104  211:aload           7
	//* 105  213:ifnull          226
					j = node3.height;
	//  106  216:aload           7
	//  107  218:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//  108  221:istore          4
				else
	//* 109  223:goto            229
					j = 0;
	//  110  226:iconst_0        
	//  111  227:istore          4
				i = j - i;
	//  112  229:iload           4
	//  113  231:iload_3         
	//  114  232:isub            
	//  115  233:istore_3        
				if(i == 1 || i == 0 && !flag)
	//* 116  234:iload_3         
	//* 117  235:iconst_1        
	//* 118  236:icmpeq          247
	//* 119  239:iload_3         
	//* 120  240:ifne            255
	//* 121  243:iload_2         
	//* 122  244:ifne            255
				{
					rotateRight(node);
	//  123  247:aload_0         
	//  124  248:aload_1         
	//  125  249:invokespecial   #105 <Method void rotateRight(LinkedTreeMap$Node)>
				} else
	//* 126  252:goto            285
				{
					if(!$assertionsDisabled && i != -1)
	//* 127  255:getstatic       #55  <Field boolean $assertionsDisabled>
	//* 128  258:ifne            274
	//* 129  261:iload_3         
	//* 130  262:iconst_m1       
	//* 131  263:icmpeq          274
						throw new AssertionError();
	//  132  266:new             #101 <Class AssertionError>
	//  133  269:dup             
	//  134  270:invokespecial   #102 <Method void AssertionError()>
	//  135  273:athrow          
					rotateLeft(node1);
	//  136  274:aload_0         
	//  137  275:aload           6
	//  138  277:invokespecial   #99  <Method void rotateLeft(LinkedTreeMap$Node)>
					rotateRight(node);
	//  139  280:aload_0         
	//  140  281:aload_1         
	//  141  282:invokespecial   #105 <Method void rotateRight(LinkedTreeMap$Node)>
				}
				if(flag)
	//* 142  285:iload_2         
	//* 143  286:ifeq            290
					return;
	//  144  289:return          
				continue;
	//  145  290:goto            353
			}
			if(k == 0)
	//* 146  293:iload           5
	//* 147  295:ifne            310
			{
				node.height = i + 1;
	//  148  298:aload_1         
	//  149  299:iload_3         
	//  150  300:iconst_1        
	//  151  301:iadd            
	//  152  302:putfield        #95  <Field int LinkedTreeMap$Node.height>
				if(flag)
	//* 153  305:iload_2         
	//* 154  306:ifeq            353
					return;
	//  155  309:return          
				continue;
			}
			if(!$assertionsDisabled && k != -1 && k != 1)
	//* 156  310:getstatic       #55  <Field boolean $assertionsDisabled>
	//* 157  313:ifne            336
	//* 158  316:iload           5
	//* 159  318:iconst_m1       
	//* 160  319:icmpeq          336
	//* 161  322:iload           5
	//* 162  324:iconst_1        
	//* 163  325:icmpeq          336
				throw new AssertionError();
	//  164  328:new             #101 <Class AssertionError>
	//  165  331:dup             
	//  166  332:invokespecial   #102 <Method void AssertionError()>
	//  167  335:athrow          
			node.height = Math.max(i, j) + 1;
	//  168  336:aload_1         
	//  169  337:iload_3         
	//  170  338:iload           4
	//  171  340:invokestatic    #111 <Method int Math.max(int, int)>
	//  172  343:iconst_1        
	//  173  344:iadd            
	//  174  345:putfield        #95  <Field int LinkedTreeMap$Node.height>
			if(!flag)
	//* 175  348:iload_2         
	//* 176  349:ifne            353
				return;
	//  177  352:return          
		}

	//  178  353:aload_1         
	//  179  354:getfield        #114 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
	//  180  357:astore_1        
	//* 181  358:goto            0
	//  182  361:return          
	}

	private void replaceInParent(Node node, Node node1)
	{
		Node node2 = node.parent;
	//    0    0:aload_1         
	//    1    1:getfield        #114 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
	//    2    4:astore_3        
		node.parent = null;
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:putfield        #114 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
		if(node1 != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			node1.parent = node2;
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:putfield        #114 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
		if(node2 != null)
	//*  11   19:aload_3         
	//*  12   20:ifnull          65
		{
			if(node2.left == node)
	//*  13   23:aload_3         
	//*  14   24:getfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//*  15   27:aload_1         
	//*  16   28:if_acmpne       37
			{
				node2.left = node1;
	//   17   31:aload_3         
	//   18   32:aload_2         
	//   19   33:putfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
				return;
	//   20   36:return          
			}
			if(!$assertionsDisabled && node2.right != node)
	//*  21   37:getstatic       #55  <Field boolean $assertionsDisabled>
	//*  22   40:ifne            59
	//*  23   43:aload_3         
	//*  24   44:getfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//*  25   47:aload_1         
	//*  26   48:if_acmpeq       59
			{
				throw new AssertionError();
	//   27   51:new             #101 <Class AssertionError>
	//   28   54:dup             
	//   29   55:invokespecial   #102 <Method void AssertionError()>
	//   30   58:athrow          
			} else
			{
				node2.right = node1;
	//   31   59:aload_3         
	//   32   60:aload_2         
	//   33   61:putfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
				return;
	//   34   64:return          
			}
		} else
		{
			root = node1;
	//   35   65:aload_0         
	//   36   66:aload_2         
	//   37   67:putfield        #119 <Field LinkedTreeMap$Node root>
			return;
	//   38   70:return          
		}
	}

	private void rotateLeft(Node node)
	{
		Node node1 = node.left;
	//    0    0:aload_1         
	//    1    1:getfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//    2    4:astore          4
		Node node2 = node.right;
	//    3    6:aload_1         
	//    4    7:getfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//    5   10:astore          5
		Node node3 = node2.left;
	//    6   12:aload           5
	//    7   14:getfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//    8   17:astore          6
		Node node4 = node2.right;
	//    9   19:aload           5
	//   10   21:getfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//   11   24:astore          7
		node.right = node3;
	//   12   26:aload_1         
	//   13   27:aload           6
	//   14   29:putfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
		if(node3 != null)
	//*  15   32:aload           6
	//*  16   34:ifnull          43
			node3.parent = node;
	//   17   37:aload           6
	//   18   39:aload_1         
	//   19   40:putfield        #114 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
		replaceInParent(node, node2);
	//   20   43:aload_0         
	//   21   44:aload_1         
	//   22   45:aload           5
	//   23   47:invokespecial   #122 <Method void replaceInParent(LinkedTreeMap$Node, LinkedTreeMap$Node)>
		node2.left = node;
	//   24   50:aload           5
	//   25   52:aload_1         
	//   26   53:putfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
		node.parent = node2;
	//   27   56:aload_1         
	//   28   57:aload           5
	//   29   59:putfield        #114 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
		int i;
		if(node1 != null)
	//*  30   62:aload           4
	//*  31   64:ifnull          76
			i = node1.height;
	//   32   67:aload           4
	//   33   69:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//   34   72:istore_2        
		else
	//*  35   73:goto            78
			i = 0;
	//   36   76:iconst_0        
	//   37   77:istore_2        
		int j;
		if(node3 != null)
	//*  38   78:aload           6
	//*  39   80:ifnull          92
			j = node3.height;
	//   40   83:aload           6
	//   41   85:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//   42   88:istore_3        
		else
	//*  43   89:goto            94
			j = 0;
	//   44   92:iconst_0        
	//   45   93:istore_3        
		node.height = Math.max(i, j) + 1;
	//   46   94:aload_1         
	//   47   95:iload_2         
	//   48   96:iload_3         
	//   49   97:invokestatic    #111 <Method int Math.max(int, int)>
	//   50  100:iconst_1        
	//   51  101:iadd            
	//   52  102:putfield        #95  <Field int LinkedTreeMap$Node.height>
		j = node.height;
	//   53  105:aload_1         
	//   54  106:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//   55  109:istore_3        
		if(node4 != null)
	//*  56  110:aload           7
	//*  57  112:ifnull          124
			i = node4.height;
	//   58  115:aload           7
	//   59  117:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//   60  120:istore_2        
		else
	//*  61  121:goto            126
			i = 0;
	//   62  124:iconst_0        
	//   63  125:istore_2        
		node2.height = Math.max(j, i) + 1;
	//   64  126:aload           5
	//   65  128:iload_3         
	//   66  129:iload_2         
	//   67  130:invokestatic    #111 <Method int Math.max(int, int)>
	//   68  133:iconst_1        
	//   69  134:iadd            
	//   70  135:putfield        #95  <Field int LinkedTreeMap$Node.height>
	//   71  138:return          
	}

	private void rotateRight(Node node)
	{
		Node node1 = node.left;
	//    0    0:aload_1         
	//    1    1:getfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//    2    4:astore          4
		Node node2 = node.right;
	//    3    6:aload_1         
	//    4    7:getfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//    5   10:astore          5
		Node node3 = node1.left;
	//    6   12:aload           4
	//    7   14:getfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//    8   17:astore          6
		Node node4 = node1.right;
	//    9   19:aload           4
	//   10   21:getfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//   11   24:astore          7
		node.left = node4;
	//   12   26:aload_1         
	//   13   27:aload           7
	//   14   29:putfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
		if(node4 != null)
	//*  15   32:aload           7
	//*  16   34:ifnull          43
			node4.parent = node;
	//   17   37:aload           7
	//   18   39:aload_1         
	//   19   40:putfield        #114 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
		replaceInParent(node, node1);
	//   20   43:aload_0         
	//   21   44:aload_1         
	//   22   45:aload           4
	//   23   47:invokespecial   #122 <Method void replaceInParent(LinkedTreeMap$Node, LinkedTreeMap$Node)>
		node1.right = node;
	//   24   50:aload           4
	//   25   52:aload_1         
	//   26   53:putfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
		node.parent = node1;
	//   27   56:aload_1         
	//   28   57:aload           4
	//   29   59:putfield        #114 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
		int i;
		if(node2 != null)
	//*  30   62:aload           5
	//*  31   64:ifnull          76
			i = node2.height;
	//   32   67:aload           5
	//   33   69:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//   34   72:istore_2        
		else
	//*  35   73:goto            78
			i = 0;
	//   36   76:iconst_0        
	//   37   77:istore_2        
		int j;
		if(node4 != null)
	//*  38   78:aload           7
	//*  39   80:ifnull          92
			j = node4.height;
	//   40   83:aload           7
	//   41   85:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//   42   88:istore_3        
		else
	//*  43   89:goto            94
			j = 0;
	//   44   92:iconst_0        
	//   45   93:istore_3        
		node.height = Math.max(i, j) + 1;
	//   46   94:aload_1         
	//   47   95:iload_2         
	//   48   96:iload_3         
	//   49   97:invokestatic    #111 <Method int Math.max(int, int)>
	//   50  100:iconst_1        
	//   51  101:iadd            
	//   52  102:putfield        #95  <Field int LinkedTreeMap$Node.height>
		j = node.height;
	//   53  105:aload_1         
	//   54  106:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//   55  109:istore_3        
		if(node3 != null)
	//*  56  110:aload           6
	//*  57  112:ifnull          124
			i = node3.height;
	//   58  115:aload           6
	//   59  117:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//   60  120:istore_2        
		else
	//*  61  121:goto            126
			i = 0;
	//   62  124:iconst_0        
	//   63  125:istore_2        
		node1.height = Math.max(j, i) + 1;
	//   64  126:aload           4
	//   65  128:iload_3         
	//   66  129:iload_2         
	//   67  130:invokestatic    #111 <Method int Math.max(int, int)>
	//   68  133:iconst_1        
	//   69  134:iadd            
	//   70  135:putfield        #95  <Field int LinkedTreeMap$Node.height>
	//   71  138:return          
	}

	private Object writeReplace()
		throws ObjectStreamException
	{
		return ((Object) (new LinkedHashMap(((java.util.Map) (this)))));
	//    0    0:new             #129 <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #132 <Method void LinkedHashMap(java.util.Map)>
	//    4    8:areturn         
	}

	public void clear()
	{
		root = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #119 <Field LinkedTreeMap$Node root>
		size = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #67  <Field int size>
		modCount = modCount + 1;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #69  <Field int modCount>
	//    9   15:iconst_1        
	//   10   16:iadd            
	//   11   17:putfield        #69  <Field int modCount>
		Node node = header;
	//   12   20:aload_0         
	//   13   21:getfield        #72  <Field LinkedTreeMap$Node header>
	//   14   24:astore_1        
		node.prev = node;
	//   15   25:aload_1         
	//   16   26:aload_1         
	//   17   27:putfield        #137 <Field LinkedTreeMap$Node LinkedTreeMap$Node.prev>
		node.next = node;
	//   18   30:aload_1         
	//   19   31:aload_1         
	//   20   32:putfield        #140 <Field LinkedTreeMap$Node LinkedTreeMap$Node.next>
	//   21   35:return          
	}

	public boolean containsKey(Object obj)
	{
		return findByObject(obj) != null;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #145 <Method LinkedTreeMap$Node findByObject(Object)>
	//    3    5:ifnull          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public Set entrySet()
	{
		EntrySet entryset = entrySet;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field LinkedTreeMap$EntrySet entrySet>
	//    2    4:astore_1        
		if(entryset != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
		{
			return ((Set) (entryset));
	//    5    9:aload_1         
	//    6   10:areturn         
		} else
		{
			EntrySet entryset1 = new EntrySet();
	//    7   11:new             #11  <Class LinkedTreeMap$EntrySet>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokespecial   #151 <Method void LinkedTreeMap$EntrySet(LinkedTreeMap)>
	//   11   19:astore_1        
			entrySet = entryset1;
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:putfield        #148 <Field LinkedTreeMap$EntrySet entrySet>
			return ((Set) (entryset1));
	//   15   25:aload_1         
	//   16   26:areturn         
		}
	}

	Node find(Object obj, boolean flag)
	{
		Comparator comparator1 = comparator;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Comparator comparator>
	//    2    4:astore          7
		Node node = root;
	//    3    6:aload_0         
	//    4    7:getfield        #119 <Field LinkedTreeMap$Node root>
	//    5   10:astore          4
		int i = 0;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		Node node1 = node;
	//    8   14:aload           4
	//    9   16:astore          5
		if(node != null)
	//*  10   18:aload           4
	//*  11   20:ifnull          125
		{
			Comparable comparable;
			if(comparator1 == NATURAL_ORDER)
	//*  12   23:aload           7
	//*  13   25:getstatic       #60  <Field Comparator NATURAL_ORDER>
	//*  14   28:if_acmpne       40
				comparable = (Comparable)obj;
	//   15   31:aload_1         
	//   16   32:checkcast       #156 <Class Comparable>
	//   17   35:astore          6
			else
	//*  18   37:goto            43
				comparable = null;
	//   19   40:aconst_null     
	//   20   41:astore          6
			do
			{
				if(comparable != null)
	//*  21   43:aload           6
	//*  22   45:ifnull          64
					i = comparable.compareTo(node.key);
	//   23   48:aload           6
	//   24   50:aload           4
	//   25   52:getfield        #160 <Field Object LinkedTreeMap$Node.key>
	//   26   55:invokeinterface #164 <Method int Comparable.compareTo(Object)>
	//   27   60:istore_3        
				else
	//*  28   61:goto            78
					i = comparator1.compare(obj, node.key);
	//   29   64:aload           7
	//   30   66:aload_1         
	//   31   67:aload           4
	//   32   69:getfield        #160 <Field Object LinkedTreeMap$Node.key>
	//   33   72:invokeinterface #170 <Method int Comparator.compare(Object, Object)>
	//   34   77:istore_3        
				if(i == 0)
	//*  35   78:iload_3         
	//*  36   79:ifne            85
					return node;
	//   37   82:aload           4
	//   38   84:areturn         
				if(i < 0)
	//*  39   85:iload_3         
	//*  40   86:ifge            99
					node1 = node.left;
	//   41   89:aload           4
	//   42   91:getfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//   43   94:astore          5
				else
	//*  44   96:goto            106
					node1 = node.right;
	//   45   99:aload           4
	//   46  101:getfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//   47  104:astore          5
				if(node1 == null)
	//*  48  106:aload           5
	//*  49  108:ifnonnull       118
				{
					node1 = node;
	//   50  111:aload           4
	//   51  113:astore          5
					break;
	//   52  115:goto            125
				}
				node = node1;
	//   53  118:aload           5
	//   54  120:astore          4
			} while(true);
	//   55  122:goto            43
		}
		if(!flag)
	//*  56  125:iload_2         
	//*  57  126:ifne            131
			return null;
	//   58  129:aconst_null     
	//   59  130:areturn         
		node = header;
	//   60  131:aload_0         
	//   61  132:getfield        #72  <Field LinkedTreeMap$Node header>
	//   62  135:astore          4
		if(node1 == null)
	//*  63  137:aload           5
	//*  64  139:ifnonnull       216
		{
			if(comparator1 == NATURAL_ORDER && !(obj instanceof Comparable))
	//*  65  142:aload           7
	//*  66  144:getstatic       #60  <Field Comparator NATURAL_ORDER>
	//*  67  147:if_acmpne       190
	//*  68  150:aload_1         
	//*  69  151:instanceof      #156 <Class Comparable>
	//*  70  154:ifne            190
				throw new ClassCastException((new StringBuilder()).append(obj.getClass().getName()).append(" is not Comparable").toString());
	//   71  157:new             #172 <Class ClassCastException>
	//   72  160:dup             
	//   73  161:new             #174 <Class StringBuilder>
	//   74  164:dup             
	//   75  165:invokespecial   #175 <Method void StringBuilder()>
	//   76  168:aload_1         
	//   77  169:invokevirtual   #179 <Method Class Object.getClass()>
	//   78  172:invokevirtual   #183 <Method String Class.getName()>
	//   79  175:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   80  178:ldc1            #189 <String " is not Comparable">
	//   81  180:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   82  183:invokevirtual   #192 <Method String StringBuilder.toString()>
	//   83  186:invokespecial   #195 <Method void ClassCastException(String)>
	//   84  189:athrow          
			obj = ((Object) (new Node(node1, obj, node, node.prev)));
	//   85  190:new             #24  <Class LinkedTreeMap$Node>
	//   86  193:dup             
	//   87  194:aload           5
	//   88  196:aload_1         
	//   89  197:aload           4
	//   90  199:aload           4
	//   91  201:getfield        #137 <Field LinkedTreeMap$Node LinkedTreeMap$Node.prev>
	//   92  204:invokespecial   #198 <Method void LinkedTreeMap$Node(LinkedTreeMap$Node, Object, LinkedTreeMap$Node, LinkedTreeMap$Node)>
	//   93  207:astore_1        
			root = ((Node) (obj));
	//   94  208:aload_0         
	//   95  209:aload_1         
	//   96  210:putfield        #119 <Field LinkedTreeMap$Node root>
		} else
	//*  97  213:goto            260
		{
			obj = ((Object) (new Node(node1, obj, node, node.prev)));
	//   98  216:new             #24  <Class LinkedTreeMap$Node>
	//   99  219:dup             
	//  100  220:aload           5
	//  101  222:aload_1         
	//  102  223:aload           4
	//  103  225:aload           4
	//  104  227:getfield        #137 <Field LinkedTreeMap$Node LinkedTreeMap$Node.prev>
	//  105  230:invokespecial   #198 <Method void LinkedTreeMap$Node(LinkedTreeMap$Node, Object, LinkedTreeMap$Node, LinkedTreeMap$Node)>
	//  106  233:astore_1        
			if(i < 0)
	//* 107  234:iload_3         
	//* 108  235:ifge            247
				node1.left = ((Node) (obj));
	//  109  238:aload           5
	//  110  240:aload_1         
	//  111  241:putfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
			else
	//* 112  244:goto            253
				node1.right = ((Node) (obj));
	//  113  247:aload           5
	//  114  249:aload_1         
	//  115  250:putfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
			rebalance(node1, true);
	//  116  253:aload_0         
	//  117  254:aload           5
	//  118  256:iconst_1        
	//  119  257:invokespecial   #200 <Method void rebalance(LinkedTreeMap$Node, boolean)>
		}
		size = size + 1;
	//  120  260:aload_0         
	//  121  261:aload_0         
	//  122  262:getfield        #67  <Field int size>
	//  123  265:iconst_1        
	//  124  266:iadd            
	//  125  267:putfield        #67  <Field int size>
		modCount = modCount + 1;
	//  126  270:aload_0         
	//  127  271:aload_0         
	//  128  272:getfield        #69  <Field int modCount>
	//  129  275:iconst_1        
	//  130  276:iadd            
	//  131  277:putfield        #69  <Field int modCount>
		return ((Node) (obj));
	//  132  280:aload_1         
	//  133  281:areturn         
	}

	Node findByEntry(java.util.Map.Entry entry)
	{
		Node node = findByObject(entry.getKey());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #208 <Method Object java.util.Map$Entry.getKey()>
	//    3    7:invokevirtual   #145 <Method LinkedTreeMap$Node findByObject(Object)>
	//    4   10:astore_3        
		boolean flag;
		if(node != null && equal(node.value, entry.getValue()))
	//*   5   11:aload_3         
	//*   6   12:ifnull          37
	//*   7   15:aload_0         
	//*   8   16:aload_3         
	//*   9   17:getfield        #211 <Field Object LinkedTreeMap$Node.value>
	//*  10   20:aload_1         
	//*  11   21:invokeinterface #214 <Method Object java.util.Map$Entry.getValue()>
	//*  12   26:invokespecial   #216 <Method boolean equal(Object, Object)>
	//*  13   29:ifeq            37
			flag = true;
	//   14   32:iconst_1        
	//   15   33:istore_2        
		else
	//*  16   34:goto            39
			flag = false;
	//   17   37:iconst_0        
	//   18   38:istore_2        
		if(flag)
	//*  19   39:iload_2         
	//*  20   40:ifeq            45
			return node;
	//   21   43:aload_3         
	//   22   44:areturn         
		else
			return null;
	//   23   45:aconst_null     
	//   24   46:areturn         
	}

	Node findByObject(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
		{
			try
			{
				obj = ((Object) (find(obj, false)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #219 <Method LinkedTreeMap$Node find(Object, boolean)>
	//    6   10:astore_1        
			}
	//*   7   11:aload_1         
	//*   8   12:areturn         
	//*   9   13:aconst_null     
	//*  10   14:areturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  11   15:astore_1        
			{
				return null;
	//   12   16:aconst_null     
	//   13   17:areturn         
			}
			return ((Node) (obj));
		} else
		{
			return null;
		}
	}

	public Object get(Object obj)
	{
		obj = ((Object) (findByObject(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #145 <Method LinkedTreeMap$Node findByObject(Object)>
	//    3    5:astore_1        
		if(obj != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          15
			return ((Node) (obj)).value;
	//    6   10:aload_1         
	//    7   11:getfield        #211 <Field Object LinkedTreeMap$Node.value>
	//    8   14:areturn         
		else
			return ((Object) (null));
	//    9   15:aconst_null     
	//   10   16:areturn         
	}

	public Set keySet()
	{
		KeySet keyset = keySet;
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field LinkedTreeMap$KeySet keySet>
	//    2    4:astore_1        
		if(keyset != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
		{
			return ((Set) (keyset));
	//    5    9:aload_1         
	//    6   10:areturn         
		} else
		{
			KeySet keyset1 = new KeySet();
	//    7   11:new             #16  <Class LinkedTreeMap$KeySet>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokespecial   #226 <Method void LinkedTreeMap$KeySet(LinkedTreeMap)>
	//   11   19:astore_1        
			keySet = keyset1;
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:putfield        #225 <Field LinkedTreeMap$KeySet keySet>
			return ((Set) (keyset1));
	//   15   25:aload_1         
	//   16   26:areturn         
		}
	}

	public Object put(Object obj, Object obj1)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			throw new NullPointerException("key == null");
	//    2    4:new             #231 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #233 <String "key == null">
	//    5   10:invokespecial   #234 <Method void NullPointerException(String)>
	//    6   13:athrow          
		} else
		{
			obj = ((Object) (find(obj, true)));
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:iconst_1        
	//   10   17:invokevirtual   #219 <Method LinkedTreeMap$Node find(Object, boolean)>
	//   11   20:astore_1        
			Object obj2 = ((Node) (obj)).value;
	//   12   21:aload_1         
	//   13   22:getfield        #211 <Field Object LinkedTreeMap$Node.value>
	//   14   25:astore_3        
			obj.value = obj1;
	//   15   26:aload_1         
	//   16   27:aload_2         
	//   17   28:putfield        #211 <Field Object LinkedTreeMap$Node.value>
			return obj2;
	//   18   31:aload_3         
	//   19   32:areturn         
		}
	}

	public Object remove(Object obj)
	{
		obj = ((Object) (removeInternalByKey(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #239 <Method LinkedTreeMap$Node removeInternalByKey(Object)>
	//    3    5:astore_1        
		if(obj != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          15
			return ((Node) (obj)).value;
	//    6   10:aload_1         
	//    7   11:getfield        #211 <Field Object LinkedTreeMap$Node.value>
	//    8   14:areturn         
		else
			return ((Object) (null));
	//    9   15:aconst_null     
	//   10   16:areturn         
	}

	void removeInternal(Node node, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            26
		{
			node.prev.next = node.next;
	//    2    4:aload_1         
	//    3    5:getfield        #137 <Field LinkedTreeMap$Node LinkedTreeMap$Node.prev>
	//    4    8:aload_1         
	//    5    9:getfield        #140 <Field LinkedTreeMap$Node LinkedTreeMap$Node.next>
	//    6   12:putfield        #140 <Field LinkedTreeMap$Node LinkedTreeMap$Node.next>
			node.next.prev = node.prev;
	//    7   15:aload_1         
	//    8   16:getfield        #140 <Field LinkedTreeMap$Node LinkedTreeMap$Node.next>
	//    9   19:aload_1         
	//   10   20:getfield        #137 <Field LinkedTreeMap$Node LinkedTreeMap$Node.prev>
	//   11   23:putfield        #137 <Field LinkedTreeMap$Node LinkedTreeMap$Node.prev>
		}
		Node node1 = node.left;
	//   12   26:aload_1         
	//   13   27:getfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//   14   30:astore          5
		Node node2 = node.right;
	//   15   32:aload_1         
	//   16   33:getfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//   17   36:astore          6
		Node node3 = node.parent;
	//   18   38:aload_1         
	//   19   39:getfield        #114 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
	//   20   42:astore          7
		if(node1 != null && node2 != null)
	//*  21   44:aload           5
	//*  22   46:ifnull          190
	//*  23   49:aload           6
	//*  24   51:ifnull          190
		{
			if(node1.height > node2.height)
	//*  25   54:aload           5
	//*  26   56:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//*  27   59:aload           6
	//*  28   61:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//*  29   64:icmple          77
				node1 = node1.last();
	//   30   67:aload           5
	//   31   69:invokevirtual   #244 <Method LinkedTreeMap$Node LinkedTreeMap$Node.last()>
	//   32   72:astore          5
			else
	//*  33   74:goto            84
				node1 = node2.first();
	//   34   77:aload           6
	//   35   79:invokevirtual   #247 <Method LinkedTreeMap$Node LinkedTreeMap$Node.first()>
	//   36   82:astore          5
			removeInternal(node1, false);
	//   37   84:aload_0         
	//   38   85:aload           5
	//   39   87:iconst_0        
	//   40   88:invokevirtual   #249 <Method void removeInternal(LinkedTreeMap$Node, boolean)>
			int i = 0;
	//   41   91:iconst_0        
	//   42   92:istore_3        
			node2 = node.left;
	//   43   93:aload_1         
	//   44   94:getfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//   45   97:astore          6
			if(node2 != null)
	//*  46   99:aload           6
	//*  47  101:ifnull          129
			{
				i = node2.height;
	//   48  104:aload           6
	//   49  106:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//   50  109:istore_3        
				node1.left = node2;
	//   51  110:aload           5
	//   52  112:aload           6
	//   53  114:putfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
				node2.parent = node1;
	//   54  117:aload           6
	//   55  119:aload           5
	//   56  121:putfield        #114 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
				node.left = null;
	//   57  124:aload_1         
	//   58  125:aconst_null     
	//   59  126:putfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
			}
			int j = 0;
	//   60  129:iconst_0        
	//   61  130:istore          4
			node2 = node.right;
	//   62  132:aload_1         
	//   63  133:getfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//   64  136:astore          6
			if(node2 != null)
	//*  65  138:aload           6
	//*  66  140:ifnull          169
			{
				j = node2.height;
	//   67  143:aload           6
	//   68  145:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//   69  148:istore          4
				node1.right = node2;
	//   70  150:aload           5
	//   71  152:aload           6
	//   72  154:putfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
				node2.parent = node1;
	//   73  157:aload           6
	//   74  159:aload           5
	//   75  161:putfield        #114 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
				node.right = null;
	//   76  164:aload_1         
	//   77  165:aconst_null     
	//   78  166:putfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
			}
			node1.height = Math.max(i, j) + 1;
	//   79  169:aload           5
	//   80  171:iload_3         
	//   81  172:iload           4
	//   82  174:invokestatic    #111 <Method int Math.max(int, int)>
	//   83  177:iconst_1        
	//   84  178:iadd            
	//   85  179:putfield        #95  <Field int LinkedTreeMap$Node.height>
			replaceInParent(node, node1);
	//   86  182:aload_0         
	//   87  183:aload_1         
	//   88  184:aload           5
	//   89  186:invokespecial   #122 <Method void replaceInParent(LinkedTreeMap$Node, LinkedTreeMap$Node)>
			return;
	//   90  189:return          
		}
		if(node1 != null)
	//*  91  190:aload           5
	//*  92  192:ifnull          210
		{
			replaceInParent(node, node1);
	//   93  195:aload_0         
	//   94  196:aload_1         
	//   95  197:aload           5
	//   96  199:invokespecial   #122 <Method void replaceInParent(LinkedTreeMap$Node, LinkedTreeMap$Node)>
			node.left = null;
	//   97  202:aload_1         
	//   98  203:aconst_null     
	//   99  204:putfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
		} else
	//* 100  207:goto            236
		if(node2 != null)
	//* 101  210:aload           6
	//* 102  212:ifnull          230
		{
			replaceInParent(node, node2);
	//  103  215:aload_0         
	//  104  216:aload_1         
	//  105  217:aload           6
	//  106  219:invokespecial   #122 <Method void replaceInParent(LinkedTreeMap$Node, LinkedTreeMap$Node)>
			node.right = null;
	//  107  222:aload_1         
	//  108  223:aconst_null     
	//  109  224:putfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
		} else
	//* 110  227:goto            236
		{
			replaceInParent(node, ((Node) (null)));
	//  111  230:aload_0         
	//  112  231:aload_1         
	//  113  232:aconst_null     
	//  114  233:invokespecial   #122 <Method void replaceInParent(LinkedTreeMap$Node, LinkedTreeMap$Node)>
		}
		rebalance(node3, false);
	//  115  236:aload_0         
	//  116  237:aload           7
	//  117  239:iconst_0        
	//  118  240:invokespecial   #200 <Method void rebalance(LinkedTreeMap$Node, boolean)>
		size = size - 1;
	//  119  243:aload_0         
	//  120  244:aload_0         
	//  121  245:getfield        #67  <Field int size>
	//  122  248:iconst_1        
	//  123  249:isub            
	//  124  250:putfield        #67  <Field int size>
		modCount = modCount + 1;
	//  125  253:aload_0         
	//  126  254:aload_0         
	//  127  255:getfield        #69  <Field int modCount>
	//  128  258:iconst_1        
	//  129  259:iadd            
	//  130  260:putfield        #69  <Field int modCount>
	//  131  263:return          
	}

	Node removeInternalByKey(Object obj)
	{
		obj = ((Object) (findByObject(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #145 <Method LinkedTreeMap$Node findByObject(Object)>
	//    3    5:astore_1        
		if(obj != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          16
			removeInternal(((Node) (obj)), true);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:iconst_1        
	//    9   13:invokevirtual   #249 <Method void removeInternal(LinkedTreeMap$Node, boolean)>
		return ((Node) (obj));
	//   10   16:aload_1         
	//   11   17:areturn         
	}

	public int size()
	{
		return size;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field int size>
	//    2    4:ireturn         
	}

	static final boolean $assertionsDisabled;
	private static final Comparator NATURAL_ORDER = new Comparator() {

		public int compare(Comparable comparable, Comparable comparable1)
		{
			return comparable.compareTo(((Object) (comparable1)));
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokeinterface #22  <Method int Comparable.compareTo(Object)>
		//    3    7:ireturn         
		}

		public volatile int compare(Object obj, Object obj1)
		{
			return compare((Comparable)obj, (Comparable)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class Comparable>
		//    3    5:aload_2         
		//    4    6:checkcast       #18  <Class Comparable>
		//    5    9:invokevirtual   #25  <Method int compare(Comparable, Comparable)>
		//    6   12:ireturn         
		}

	}
;
	Comparator comparator;
	private EntrySet entrySet;
	final Node header;
	private KeySet keySet;
	int modCount;
	Node root;
	int size;

	static 
	{
		boolean flag;
		if(!((Class) (com/google/gson/internal/LinkedTreeMap)).desiredAssertionStatus())
	//*   0    0:ldc1            #2   <Class LinkedTreeMap>
	//*   1    2:invokevirtual   #53  <Method boolean Class.desiredAssertionStatus()>
	//*   2    5:ifne            13
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:goto            15
			flag = false;
	//    6   13:iconst_0        
	//    7   14:istore_0        
		$assertionsDisabled = flag;
	//    8   15:iload_0         
	//    9   16:putstatic       #55  <Field boolean $assertionsDisabled>
	//   10   19:new             #9   <Class LinkedTreeMap$1>
	//   11   22:dup             
	//   12   23:invokespecial   #58  <Method void LinkedTreeMap$1()>
	//   13   26:putstatic       #60  <Field Comparator NATURAL_ORDER>
	//*  14   29:return          
	}
}
