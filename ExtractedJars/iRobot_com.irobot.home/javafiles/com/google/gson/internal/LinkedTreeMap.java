// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

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
			//    6   10:aconst_null     
			//    7   11:invokespecial   #26  <Method void LinkedTreeMap$LinkedTreeMapIterator(LinkedTreeMap, LinkedTreeMap$1)>
			//    8   14:return          
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
			//    6   10:aconst_null     
			//    7   11:invokespecial   #26  <Method void LinkedTreeMap$LinkedTreeMapIterator(LinkedTreeMap, LinkedTreeMap$1)>
			//    8   14:return          
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

	private abstract class LinkedTreeMapIterator
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
		//    8   16:new             #50  <Class NoSuchElementException>
		//    9   19:dup             
		//   10   20:invokespecial   #51  <Method void NoSuchElementException()>
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
		//   18   38:new             #53  <Class ConcurrentModificationException>
		//   19   41:dup             
		//   20   42:invokespecial   #54  <Method void ConcurrentModificationException()>
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
		//    3    7:new             #59  <Class IllegalStateException>
		//    4   10:dup             
		//    5   11:invokespecial   #60  <Method void IllegalStateException()>
		//    6   14:athrow          
			} else
			{
				removeInternal(lastReturned, true);
		//    7   15:aload_0         
		//    8   16:getfield        #22  <Field LinkedTreeMap this$0>
		//    9   19:aload_0         
		//   10   20:getfield        #35  <Field LinkedTreeMap$Node lastReturned>
		//   11   23:iconst_1        
		//   12   24:invokevirtual   #64  <Method void LinkedTreeMap.removeInternal(LinkedTreeMap$Node, boolean)>
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

		private LinkedTreeMapIterator()
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
		//*  13   21:getfield        #30  <Field Object key>
		//*  14   24:ifnonnull       41
				{
					flag = flag1;
		//   15   27:iload_3         
		//   16   28:istore_2        
					if(((java.util.Map.Entry) (obj)).getKey() != null)
		//*  17   29:aload_1         
		//*  18   30:invokeinterface #48  <Method Object java.util.Map$Entry.getKey()>
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
		//   24   44:getfield        #30  <Field Object key>
		//   25   47:aload_1         
		//   26   48:invokeinterface #48  <Method Object java.util.Map$Entry.getKey()>
		//   27   53:invokevirtual   #50  <Method boolean Object.equals(Object)>
		//   28   56:ifeq            100
				}
				if(value == null)
		//*  29   59:aload_0         
		//*  30   60:getfield        #52  <Field Object value>
		//*  31   63:ifnonnull       80
				{
					flag = flag1;
		//   32   66:iload_3         
		//   33   67:istore_2        
					if(((java.util.Map.Entry) (obj)).getValue() != null)
		//*  34   68:aload_1         
		//*  35   69:invokeinterface #55  <Method Object java.util.Map$Entry.getValue()>
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
		//   41   83:getfield        #52  <Field Object value>
		//   42   86:aload_1         
		//   43   87:invokeinterface #55  <Method Object java.util.Map$Entry.getValue()>
		//   44   92:invokevirtual   #50  <Method boolean Object.equals(Object)>
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

		public Node first()
		{
			Node node = left;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field LinkedTreeMap$Node left>
		//    2    4:astore_1        
			Node node1 = this;
		//    3    5:aload_0         
		//    4    6:astore_2        
			Node node2;
			for(; node != null; node = node2)
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
			Object obj = key;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field Object key>
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
		//   11   17:getfield        #30  <Field Object key>
		//   12   20:invokevirtual   #66  <Method int Object.hashCode()>
		//   13   23:istore_1        
			if(value != null)
		//*  14   24:aload_0         
		//*  15   25:getfield        #52  <Field Object value>
		//*  16   28:ifnonnull       34
		//*  17   31:goto            42
				j = value.hashCode();
		//   18   34:aload_0         
		//   19   35:getfield        #52  <Field Object value>
		//   20   38:invokevirtual   #66  <Method int Object.hashCode()>
		//   21   41:istore_2        
			return i ^ j;
		//   22   42:iload_1         
		//   23   43:iload_2         
		//   24   44:ixor            
		//   25   45:ireturn         
		}

		public Node last()
		{
			Node node = right;
		//    0    0:aload_0         
		//    1    1:getfield        #69  <Field LinkedTreeMap$Node right>
		//    2    4:astore_1        
			Node node1 = this;
		//    3    5:aload_0         
		//    4    6:astore_2        
			Node node2;
			for(; node != null; node = node2)
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
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #76  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #77  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append(key);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #30  <Field Object key>
		//    7   13:invokevirtual   #81  <Method StringBuilder StringBuilder.append(Object)>
		//    8   16:pop             
			stringbuilder.append("=");
		//    9   17:aload_1         
		//   10   18:ldc1            #83  <String "=">
		//   11   20:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
		//   12   23:pop             
			stringbuilder.append(value);
		//   13   24:aload_1         
		//   14   25:aload_0         
		//   15   26:getfield        #52  <Field Object value>
		//   16   29:invokevirtual   #81  <Method StringBuilder StringBuilder.append(Object)>
		//   17   32:pop             
			return stringbuilder.toString();
		//   18   33:aload_1         
		//   19   34:invokevirtual   #88  <Method String StringBuilder.toString()>
		//   20   37:areturn         
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
	//    1    1:getstatic       #53  <Field Comparator NATURAL_ORDER>
	//    2    4:invokespecial   #57  <Method void LinkedTreeMap(Comparator)>
	//    3    7:return          
	}

	public LinkedTreeMap(Comparator comparator1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void AbstractMap()>
		size = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #60  <Field int size>
		modCount = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #62  <Field int modCount>
		header = new Node();
	//    8   14:aload_0         
	//    9   15:new             #24  <Class LinkedTreeMap$Node>
	//   10   18:dup             
	//   11   19:invokespecial   #63  <Method void LinkedTreeMap$Node()>
	//   12   22:putfield        #65  <Field LinkedTreeMap$Node header>
		if(comparator1 == null)
	//*  13   25:aload_1         
	//*  14   26:ifnull          32
	//*  15   29:goto            36
			comparator1 = NATURAL_ORDER;
	//   16   32:getstatic       #53  <Field Comparator NATURAL_ORDER>
	//   17   35:astore_1        
		comparator = comparator1;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:putfield        #67  <Field Comparator comparator>
	//   21   41:return          
	}

	private boolean equal(Object obj, Object obj1)
	{
		return obj == obj1 || obj != null && obj.equals(obj1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:if_acmpeq       22
	//    3    5:aload_1         
	//    4    6:ifnull          20
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #77  <Method boolean Object.equals(Object)>
	//    8   14:ifeq            20
	//    9   17:goto            22
	//   10   20:iconst_0        
	//   11   21:ireturn         
	//   12   22:iconst_1        
	//   13   23:ireturn         
	}

	private void rebalance(Node node, boolean flag)
	{
		for(; node != null; node = node.parent)
	//*   0    0:aload_1         
	//*   1    1:ifnull          283
		{
			Node node1 = node.left;
	//    2    4:aload_1         
	//    3    5:getfield        #82  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//    4    8:astore          8
			Node node2 = node.right;
	//    5   10:aload_1         
	//    6   11:getfield        #85  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//    7   14:astore          9
			boolean flag2 = false;
	//    8   16:iconst_0        
	//    9   17:istore          6
			boolean flag1 = false;
	//   10   19:iconst_0        
	//   11   20:istore          5
			int i;
			if(node1 != null)
	//*  12   22:aload           8
	//*  13   24:ifnull          36
				i = node1.height;
	//   14   27:aload           8
	//   15   29:getfield        #88  <Field int LinkedTreeMap$Node.height>
	//   16   32:istore_3        
			else
	//*  17   33:goto            38
				i = 0;
	//   18   36:iconst_0        
	//   19   37:istore_3        
			int j;
			if(node2 != null)
	//*  20   38:aload           9
	//*  21   40:ifnull          53
				j = node2.height;
	//   22   43:aload           9
	//   23   45:getfield        #88  <Field int LinkedTreeMap$Node.height>
	//   24   48:istore          4
			else
	//*  25   50:goto            56
				j = 0;
	//   26   53:iconst_0        
	//   27   54:istore          4
			int k = i - j;
	//   28   56:iload_3         
	//   29   57:iload           4
	//   30   59:isub            
	//   31   60:istore          7
			if(k == -2)
	//*  32   62:iload           7
	//*  33   64:bipush          -2
	//*  34   66:icmpne          152
			{
				node1 = node2.left;
	//   35   69:aload           9
	//   36   71:getfield        #82  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//   37   74:astore          8
				Node node4 = node2.right;
	//   38   76:aload           9
	//   39   78:getfield        #85  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//   40   81:astore          10
				if(node4 != null)
	//*  41   83:aload           10
	//*  42   85:ifnull          97
					i = node4.height;
	//   43   88:aload           10
	//   44   90:getfield        #88  <Field int LinkedTreeMap$Node.height>
	//   45   93:istore_3        
				else
	//*  46   94:goto            99
					i = 0;
	//   47   97:iconst_0        
	//   48   98:istore_3        
				j = ((int) (flag1));
	//   49   99:iload           5
	//   50  101:istore          4
				if(node1 != null)
	//*  51  103:aload           8
	//*  52  105:ifnull          115
					j = node1.height;
	//   53  108:aload           8
	//   54  110:getfield        #88  <Field int LinkedTreeMap$Node.height>
	//   55  113:istore          4
				i = j - i;
	//   56  115:iload           4
	//   57  117:iload_3         
	//   58  118:isub            
	//   59  119:istore_3        
				if(i != -1 && (i != 0 || flag))
	//*  60  120:iload_3         
	//*  61  121:iconst_m1       
	//*  62  122:icmpeq          142
	//*  63  125:iload_3         
	//*  64  126:ifne            136
	//*  65  129:iload_2         
	//*  66  130:ifne            136
	//*  67  133:goto            142
					rotateRight(node2);
	//   68  136:aload_0         
	//   69  137:aload           9
	//   70  139:invokespecial   #92  <Method void rotateRight(LinkedTreeMap$Node)>
				rotateLeft(node);
	//   71  142:aload_0         
	//   72  143:aload_1         
	//   73  144:invokespecial   #95  <Method void rotateLeft(LinkedTreeMap$Node)>
				if(flag)
	//*  74  147:iload_2         
	//*  75  148:ifeq            275
					return;
	//   76  151:return          
				continue;
			}
			if(k == 2)
	//*  77  152:iload           7
	//*  78  154:iconst_2        
	//*  79  155:icmpne          241
			{
				Node node3 = node1.left;
	//   80  158:aload           8
	//   81  160:getfield        #82  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//   82  163:astore          9
				Node node5 = node1.right;
	//   83  165:aload           8
	//   84  167:getfield        #85  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//   85  170:astore          10
				if(node5 != null)
	//*  86  172:aload           10
	//*  87  174:ifnull          186
					i = node5.height;
	//   88  177:aload           10
	//   89  179:getfield        #88  <Field int LinkedTreeMap$Node.height>
	//   90  182:istore_3        
				else
	//*  91  183:goto            188
					i = 0;
	//   92  186:iconst_0        
	//   93  187:istore_3        
				j = ((int) (flag2));
	//   94  188:iload           6
	//   95  190:istore          4
				if(node3 != null)
	//*  96  192:aload           9
	//*  97  194:ifnull          204
					j = node3.height;
	//   98  197:aload           9
	//   99  199:getfield        #88  <Field int LinkedTreeMap$Node.height>
	//  100  202:istore          4
				i = j - i;
	//  101  204:iload           4
	//  102  206:iload_3         
	//  103  207:isub            
	//  104  208:istore_3        
				if(i != 1 && (i != 0 || flag))
	//* 105  209:iload_3         
	//* 106  210:iconst_1        
	//* 107  211:icmpeq          231
	//* 108  214:iload_3         
	//* 109  215:ifne            225
	//* 110  218:iload_2         
	//* 111  219:ifne            225
	//* 112  222:goto            231
					rotateLeft(node1);
	//  113  225:aload_0         
	//  114  226:aload           8
	//  115  228:invokespecial   #95  <Method void rotateLeft(LinkedTreeMap$Node)>
				rotateRight(node);
	//  116  231:aload_0         
	//  117  232:aload_1         
	//  118  233:invokespecial   #92  <Method void rotateRight(LinkedTreeMap$Node)>
				if(flag)
	//* 119  236:iload_2         
	//* 120  237:ifeq            275
					return;
	//  121  240:return          
				continue;
			}
			if(k == 0)
	//* 122  241:iload           7
	//* 123  243:ifne            258
			{
				node.height = i + 1;
	//  124  246:aload_1         
	//  125  247:iload_3         
	//  126  248:iconst_1        
	//  127  249:iadd            
	//  128  250:putfield        #88  <Field int LinkedTreeMap$Node.height>
				if(flag)
	//* 129  253:iload_2         
	//* 130  254:ifeq            275
					return;
	//  131  257:return          
				continue;
			}
			node.height = Math.max(i, j) + 1;
	//  132  258:aload_1         
	//  133  259:iload_3         
	//  134  260:iload           4
	//  135  262:invokestatic    #101 <Method int Math.max(int, int)>
	//  136  265:iconst_1        
	//  137  266:iadd            
	//  138  267:putfield        #88  <Field int LinkedTreeMap$Node.height>
			if(!flag)
	//* 139  270:iload_2         
	//* 140  271:ifne            275
				return;
	//  141  274:return          
		}

	//  142  275:aload_1         
	//  143  276:getfield        #104 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
	//  144  279:astore_1        
	//* 145  280:goto            0
	//  146  283:return          
	}

	private void replaceInParent(Node node, Node node1)
	{
		Node node2 = node.parent;
	//    0    0:aload_1         
	//    1    1:getfield        #104 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
	//    2    4:astore_3        
		node.parent = null;
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:putfield        #104 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
		if(node1 != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			node1.parent = node2;
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:putfield        #104 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
		if(node2 != null)
	//*  11   19:aload_3         
	//*  12   20:ifnull          43
		{
			if(node2.left == node)
	//*  13   23:aload_3         
	//*  14   24:getfield        #82  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//*  15   27:aload_1         
	//*  16   28:if_acmpne       37
			{
				node2.left = node1;
	//   17   31:aload_3         
	//   18   32:aload_2         
	//   19   33:putfield        #82  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
				return;
	//   20   36:return          
			} else
			{
				node2.right = node1;
	//   21   37:aload_3         
	//   22   38:aload_2         
	//   23   39:putfield        #85  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
				return;
	//   24   42:return          
			}
		} else
		{
			root = node1;
	//   25   43:aload_0         
	//   26   44:aload_2         
	//   27   45:putfield        #109 <Field LinkedTreeMap$Node root>
			return;
	//   28   48:return          
		}
	}

	private void rotateLeft(Node node)
	{
		Node node1 = node.left;
	//    0    0:aload_1         
	//    1    1:getfield        #82  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//    2    4:astore          5
		Node node2 = node.right;
	//    3    6:aload_1         
	//    4    7:getfield        #85  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//    5   10:astore          6
		Node node3 = node2.left;
	//    6   12:aload           6
	//    7   14:getfield        #82  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//    8   17:astore          7
		Node node4 = node2.right;
	//    9   19:aload           6
	//   10   21:getfield        #85  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//   11   24:astore          8
		node.right = node3;
	//   12   26:aload_1         
	//   13   27:aload           7
	//   14   29:putfield        #85  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
		if(node3 != null)
	//*  15   32:aload           7
	//*  16   34:ifnull          43
			node3.parent = node;
	//   17   37:aload           7
	//   18   39:aload_1         
	//   19   40:putfield        #104 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
		replaceInParent(node, node2);
	//   20   43:aload_0         
	//   21   44:aload_1         
	//   22   45:aload           6
	//   23   47:invokespecial   #112 <Method void replaceInParent(LinkedTreeMap$Node, LinkedTreeMap$Node)>
		node2.left = node;
	//   24   50:aload           6
	//   25   52:aload_1         
	//   26   53:putfield        #82  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
		node.parent = node2;
	//   27   56:aload_1         
	//   28   57:aload           6
	//   29   59:putfield        #104 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
		boolean flag = false;
	//   30   62:iconst_0        
	//   31   63:istore          4
		int i;
		if(node1 != null)
	//*  32   65:aload           5
	//*  33   67:ifnull          79
			i = node1.height;
	//   34   70:aload           5
	//   35   72:getfield        #88  <Field int LinkedTreeMap$Node.height>
	//   36   75:istore_2        
		else
	//*  37   76:goto            81
			i = 0;
	//   38   79:iconst_0        
	//   39   80:istore_2        
		int j;
		if(node3 != null)
	//*  40   81:aload           7
	//*  41   83:ifnull          95
			j = node3.height;
	//   42   86:aload           7
	//   43   88:getfield        #88  <Field int LinkedTreeMap$Node.height>
	//   44   91:istore_3        
		else
	//*  45   92:goto            97
			j = 0;
	//   46   95:iconst_0        
	//   47   96:istore_3        
		node.height = Math.max(i, j) + 1;
	//   48   97:aload_1         
	//   49   98:iload_2         
	//   50   99:iload_3         
	//   51  100:invokestatic    #101 <Method int Math.max(int, int)>
	//   52  103:iconst_1        
	//   53  104:iadd            
	//   54  105:putfield        #88  <Field int LinkedTreeMap$Node.height>
		j = node.height;
	//   55  108:aload_1         
	//   56  109:getfield        #88  <Field int LinkedTreeMap$Node.height>
	//   57  112:istore_3        
		i = ((int) (flag));
	//   58  113:iload           4
	//   59  115:istore_2        
		if(node4 != null)
	//*  60  116:aload           8
	//*  61  118:ifnull          127
			i = node4.height;
	//   62  121:aload           8
	//   63  123:getfield        #88  <Field int LinkedTreeMap$Node.height>
	//   64  126:istore_2        
		node2.height = Math.max(j, i) + 1;
	//   65  127:aload           6
	//   66  129:iload_3         
	//   67  130:iload_2         
	//   68  131:invokestatic    #101 <Method int Math.max(int, int)>
	//   69  134:iconst_1        
	//   70  135:iadd            
	//   71  136:putfield        #88  <Field int LinkedTreeMap$Node.height>
	//   72  139:return          
	}

	private void rotateRight(Node node)
	{
		Node node1 = node.left;
	//    0    0:aload_1         
	//    1    1:getfield        #82  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//    2    4:astore          5
		Node node2 = node.right;
	//    3    6:aload_1         
	//    4    7:getfield        #85  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//    5   10:astore          6
		Node node3 = node1.left;
	//    6   12:aload           5
	//    7   14:getfield        #82  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//    8   17:astore          7
		Node node4 = node1.right;
	//    9   19:aload           5
	//   10   21:getfield        #85  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//   11   24:astore          8
		node.left = node4;
	//   12   26:aload_1         
	//   13   27:aload           8
	//   14   29:putfield        #82  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
		if(node4 != null)
	//*  15   32:aload           8
	//*  16   34:ifnull          43
			node4.parent = node;
	//   17   37:aload           8
	//   18   39:aload_1         
	//   19   40:putfield        #104 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
		replaceInParent(node, node1);
	//   20   43:aload_0         
	//   21   44:aload_1         
	//   22   45:aload           5
	//   23   47:invokespecial   #112 <Method void replaceInParent(LinkedTreeMap$Node, LinkedTreeMap$Node)>
		node1.right = node;
	//   24   50:aload           5
	//   25   52:aload_1         
	//   26   53:putfield        #85  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
		node.parent = node1;
	//   27   56:aload_1         
	//   28   57:aload           5
	//   29   59:putfield        #104 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
		boolean flag = false;
	//   30   62:iconst_0        
	//   31   63:istore          4
		int i;
		if(node2 != null)
	//*  32   65:aload           6
	//*  33   67:ifnull          79
			i = node2.height;
	//   34   70:aload           6
	//   35   72:getfield        #88  <Field int LinkedTreeMap$Node.height>
	//   36   75:istore_2        
		else
	//*  37   76:goto            81
			i = 0;
	//   38   79:iconst_0        
	//   39   80:istore_2        
		int j;
		if(node4 != null)
	//*  40   81:aload           8
	//*  41   83:ifnull          95
			j = node4.height;
	//   42   86:aload           8
	//   43   88:getfield        #88  <Field int LinkedTreeMap$Node.height>
	//   44   91:istore_3        
		else
	//*  45   92:goto            97
			j = 0;
	//   46   95:iconst_0        
	//   47   96:istore_3        
		node.height = Math.max(i, j) + 1;
	//   48   97:aload_1         
	//   49   98:iload_2         
	//   50   99:iload_3         
	//   51  100:invokestatic    #101 <Method int Math.max(int, int)>
	//   52  103:iconst_1        
	//   53  104:iadd            
	//   54  105:putfield        #88  <Field int LinkedTreeMap$Node.height>
		j = node.height;
	//   55  108:aload_1         
	//   56  109:getfield        #88  <Field int LinkedTreeMap$Node.height>
	//   57  112:istore_3        
		i = ((int) (flag));
	//   58  113:iload           4
	//   59  115:istore_2        
		if(node3 != null)
	//*  60  116:aload           7
	//*  61  118:ifnull          127
			i = node3.height;
	//   62  121:aload           7
	//   63  123:getfield        #88  <Field int LinkedTreeMap$Node.height>
	//   64  126:istore_2        
		node1.height = Math.max(j, i) + 1;
	//   65  127:aload           5
	//   66  129:iload_3         
	//   67  130:iload_2         
	//   68  131:invokestatic    #101 <Method int Math.max(int, int)>
	//   69  134:iconst_1        
	//   70  135:iadd            
	//   71  136:putfield        #88  <Field int LinkedTreeMap$Node.height>
	//   72  139:return          
	}

	private Object writeReplace()
	{
		return ((Object) (new LinkedHashMap(((java.util.Map) (this)))));
	//    0    0:new             #117 <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #120 <Method void LinkedHashMap(java.util.Map)>
	//    4    8:areturn         
	}

	public void clear()
	{
		root = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #109 <Field LinkedTreeMap$Node root>
		size = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #60  <Field int size>
		modCount = modCount + 1;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #62  <Field int modCount>
	//    9   15:iconst_1        
	//   10   16:iadd            
	//   11   17:putfield        #62  <Field int modCount>
		Node node = header;
	//   12   20:aload_0         
	//   13   21:getfield        #65  <Field LinkedTreeMap$Node header>
	//   14   24:astore_1        
		node.prev = node;
	//   15   25:aload_1         
	//   16   26:aload_1         
	//   17   27:putfield        #124 <Field LinkedTreeMap$Node LinkedTreeMap$Node.prev>
		node.next = node;
	//   18   30:aload_1         
	//   19   31:aload_1         
	//   20   32:putfield        #127 <Field LinkedTreeMap$Node LinkedTreeMap$Node.next>
	//   21   35:return          
	}

	public boolean containsKey(Object obj)
	{
		return findByObject(obj) != null;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #132 <Method LinkedTreeMap$Node findByObject(Object)>
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
	//    1    1:getfield        #135 <Field LinkedTreeMap$EntrySet entrySet>
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
	//   10   16:invokespecial   #138 <Method void LinkedTreeMap$EntrySet(LinkedTreeMap)>
	//   11   19:astore_1        
			entrySet = entryset1;
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:putfield        #135 <Field LinkedTreeMap$EntrySet entrySet>
			return ((Set) (entryset1));
	//   15   25:aload_1         
	//   16   26:areturn         
		}
	}

	Node find(Object obj, boolean flag)
	{
		Comparator comparator1 = comparator;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Comparator comparator>
	//    2    4:astore          7
		Object obj1 = ((Object) (root));
	//    3    6:aload_0         
	//    4    7:getfield        #109 <Field LinkedTreeMap$Node root>
	//    5   10:astore          4
		int i;
		if(obj1 != null)
	//*   6   12:aload           4
	//*   7   14:ifnull          115
		{
			Comparable comparable;
			if(comparator1 == NATURAL_ORDER)
	//*   8   17:aload           7
	//*   9   19:getstatic       #53  <Field Comparator NATURAL_ORDER>
	//*  10   22:if_acmpne       34
				comparable = (Comparable)obj;
	//   11   25:aload_1         
	//   12   26:checkcast       #143 <Class Comparable>
	//   13   29:astore          6
			else
	//*  14   31:goto            37
				comparable = null;
	//   15   34:aconst_null     
	//   16   35:astore          6
			do
			{
				if(comparable != null)
	//*  17   37:aload           6
	//*  18   39:ifnull          58
					i = comparable.compareTo(((Node) (obj1)).key);
	//   19   42:aload           6
	//   20   44:aload           4
	//   21   46:getfield        #147 <Field Object LinkedTreeMap$Node.key>
	//   22   49:invokeinterface #151 <Method int Comparable.compareTo(Object)>
	//   23   54:istore_3        
				else
	//*  24   55:goto            72
					i = comparator1.compare(obj, ((Node) (obj1)).key);
	//   25   58:aload           7
	//   26   60:aload_1         
	//   27   61:aload           4
	//   28   63:getfield        #147 <Field Object LinkedTreeMap$Node.key>
	//   29   66:invokeinterface #157 <Method int Comparator.compare(Object, Object)>
	//   30   71:istore_3        
				if(i == 0)
	//*  31   72:iload_3         
	//*  32   73:ifne            79
					return ((Node) (obj1));
	//   33   76:aload           4
	//   34   78:areturn         
				Node node;
				if(i < 0)
	//*  35   79:iload_3         
	//*  36   80:ifge            93
					node = ((Node) (obj1)).left;
	//   37   83:aload           4
	//   38   85:getfield        #82  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//   39   88:astore          5
				else
	//*  40   90:goto            100
					node = ((Node) (obj1)).right;
	//   41   93:aload           4
	//   42   95:getfield        #85  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//   43   98:astore          5
				if(node == null)
	//*  44  100:aload           5
	//*  45  102:ifnonnull       108
					break;
	//   46  105:goto            117
				obj1 = ((Object) (node));
	//   47  108:aload           5
	//   48  110:astore          4
			} while(true);
	//   49  112:goto            37
		} else
		{
			i = 0;
	//   50  115:iconst_0        
	//   51  116:istore_3        
		}
		if(!flag)
	//*  52  117:iload_2         
	//*  53  118:ifne            123
			return null;
	//   54  121:aconst_null     
	//   55  122:areturn         
		Node node1 = header;
	//   56  123:aload_0         
	//   57  124:getfield        #65  <Field LinkedTreeMap$Node header>
	//   58  127:astore          5
		if(obj1 == null)
	//*  59  129:aload           4
	//*  60  131:ifnonnull       218
		{
			if(comparator1 == NATURAL_ORDER && !(obj instanceof Comparable))
	//*  61  134:aload           7
	//*  62  136:getstatic       #53  <Field Comparator NATURAL_ORDER>
	//*  63  139:if_acmpne       192
	//*  64  142:aload_1         
	//*  65  143:instanceof      #143 <Class Comparable>
	//*  66  146:ifne            192
			{
				obj1 = ((Object) (new StringBuilder()));
	//   67  149:new             #159 <Class StringBuilder>
	//   68  152:dup             
	//   69  153:invokespecial   #160 <Method void StringBuilder()>
	//   70  156:astore          4
				((StringBuilder) (obj1)).append(obj.getClass().getName());
	//   71  158:aload           4
	//   72  160:aload_1         
	//   73  161:invokevirtual   #164 <Method Class Object.getClass()>
	//   74  164:invokevirtual   #170 <Method String Class.getName()>
	//   75  167:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   76  170:pop             
				((StringBuilder) (obj1)).append(" is not Comparable");
	//   77  171:aload           4
	//   78  173:ldc1            #176 <String " is not Comparable">
	//   79  175:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   80  178:pop             
				throw new ClassCastException(((StringBuilder) (obj1)).toString());
	//   81  179:new             #178 <Class ClassCastException>
	//   82  182:dup             
	//   83  183:aload           4
	//   84  185:invokevirtual   #181 <Method String StringBuilder.toString()>
	//   85  188:invokespecial   #184 <Method void ClassCastException(String)>
	//   86  191:athrow          
			}
			obj = ((Object) (new Node(((Node) (obj1)), obj, node1, node1.prev)));
	//   87  192:new             #24  <Class LinkedTreeMap$Node>
	//   88  195:dup             
	//   89  196:aload           4
	//   90  198:aload_1         
	//   91  199:aload           5
	//   92  201:aload           5
	//   93  203:getfield        #124 <Field LinkedTreeMap$Node LinkedTreeMap$Node.prev>
	//   94  206:invokespecial   #187 <Method void LinkedTreeMap$Node(LinkedTreeMap$Node, Object, LinkedTreeMap$Node, LinkedTreeMap$Node)>
	//   95  209:astore_1        
			root = ((Node) (obj));
	//   96  210:aload_0         
	//   97  211:aload_1         
	//   98  212:putfield        #109 <Field LinkedTreeMap$Node root>
		} else
	//*  99  215:goto            262
		{
			obj = ((Object) (new Node(((Node) (obj1)), obj, node1, node1.prev)));
	//  100  218:new             #24  <Class LinkedTreeMap$Node>
	//  101  221:dup             
	//  102  222:aload           4
	//  103  224:aload_1         
	//  104  225:aload           5
	//  105  227:aload           5
	//  106  229:getfield        #124 <Field LinkedTreeMap$Node LinkedTreeMap$Node.prev>
	//  107  232:invokespecial   #187 <Method void LinkedTreeMap$Node(LinkedTreeMap$Node, Object, LinkedTreeMap$Node, LinkedTreeMap$Node)>
	//  108  235:astore_1        
			if(i < 0)
	//* 109  236:iload_3         
	//* 110  237:ifge            249
				obj1.left = ((Node) (obj));
	//  111  240:aload           4
	//  112  242:aload_1         
	//  113  243:putfield        #82  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
			else
	//* 114  246:goto            255
				obj1.right = ((Node) (obj));
	//  115  249:aload           4
	//  116  251:aload_1         
	//  117  252:putfield        #85  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
			rebalance(((Node) (obj1)), true);
	//  118  255:aload_0         
	//  119  256:aload           4
	//  120  258:iconst_1        
	//  121  259:invokespecial   #189 <Method void rebalance(LinkedTreeMap$Node, boolean)>
		}
		size = size + 1;
	//  122  262:aload_0         
	//  123  263:aload_0         
	//  124  264:getfield        #60  <Field int size>
	//  125  267:iconst_1        
	//  126  268:iadd            
	//  127  269:putfield        #60  <Field int size>
		modCount = modCount + 1;
	//  128  272:aload_0         
	//  129  273:aload_0         
	//  130  274:getfield        #62  <Field int modCount>
	//  131  277:iconst_1        
	//  132  278:iadd            
	//  133  279:putfield        #62  <Field int modCount>
		return ((Node) (obj));
	//  134  282:aload_1         
	//  135  283:areturn         
	}

	Node findByEntry(java.util.Map.Entry entry)
	{
		Node node = findByObject(entry.getKey());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #197 <Method Object java.util.Map$Entry.getKey()>
	//    3    7:invokevirtual   #132 <Method LinkedTreeMap$Node findByObject(Object)>
	//    4   10:astore_3        
		boolean flag;
		if(node != null && equal(node.value, entry.getValue()))
	//*   5   11:aload_3         
	//*   6   12:ifnull          37
	//*   7   15:aload_0         
	//*   8   16:aload_3         
	//*   9   17:getfield        #200 <Field Object LinkedTreeMap$Node.value>
	//*  10   20:aload_1         
	//*  11   21:invokeinterface #203 <Method Object java.util.Map$Entry.getValue()>
	//*  12   26:invokespecial   #205 <Method boolean equal(Object, Object)>
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
	//    5    7:invokevirtual   #208 <Method LinkedTreeMap$Node find(Object, boolean)>
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
	//    2    2:invokevirtual   #132 <Method LinkedTreeMap$Node findByObject(Object)>
	//    3    5:astore_1        
		if(obj != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          15
			return ((Node) (obj)).value;
	//    6   10:aload_1         
	//    7   11:getfield        #200 <Field Object LinkedTreeMap$Node.value>
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
	//    1    1:getfield        #214 <Field LinkedTreeMap$KeySet keySet>
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
	//   10   16:invokespecial   #215 <Method void LinkedTreeMap$KeySet(LinkedTreeMap)>
	//   11   19:astore_1        
			keySet = keyset1;
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:putfield        #214 <Field LinkedTreeMap$KeySet keySet>
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
	//    2    4:new             #220 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #222 <String "key == null">
	//    5   10:invokespecial   #223 <Method void NullPointerException(String)>
	//    6   13:athrow          
		} else
		{
			obj = ((Object) (find(obj, true)));
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:iconst_1        
	//   10   17:invokevirtual   #208 <Method LinkedTreeMap$Node find(Object, boolean)>
	//   11   20:astore_1        
			Object obj2 = ((Node) (obj)).value;
	//   12   21:aload_1         
	//   13   22:getfield        #200 <Field Object LinkedTreeMap$Node.value>
	//   14   25:astore_3        
			obj.value = obj1;
	//   15   26:aload_1         
	//   16   27:aload_2         
	//   17   28:putfield        #200 <Field Object LinkedTreeMap$Node.value>
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
	//    2    2:invokevirtual   #228 <Method LinkedTreeMap$Node removeInternalByKey(Object)>
	//    3    5:astore_1        
		if(obj != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          15
			return ((Node) (obj)).value;
	//    6   10:aload_1         
	//    7   11:getfield        #200 <Field Object LinkedTreeMap$Node.value>
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
	//    3    5:getfield        #124 <Field LinkedTreeMap$Node LinkedTreeMap$Node.prev>
	//    4    8:aload_1         
	//    5    9:getfield        #127 <Field LinkedTreeMap$Node LinkedTreeMap$Node.next>
	//    6   12:putfield        #127 <Field LinkedTreeMap$Node LinkedTreeMap$Node.next>
			node.next.prev = node.prev;
	//    7   15:aload_1         
	//    8   16:getfield        #127 <Field LinkedTreeMap$Node LinkedTreeMap$Node.next>
	//    9   19:aload_1         
	//   10   20:getfield        #124 <Field LinkedTreeMap$Node LinkedTreeMap$Node.prev>
	//   11   23:putfield        #124 <Field LinkedTreeMap$Node LinkedTreeMap$Node.prev>
		}
		Node node1 = node.left;
	//   12   26:aload_1         
	//   13   27:getfield        #82  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//   14   30:astore          5
		Node node2 = node.right;
	//   15   32:aload_1         
	//   16   33:getfield        #85  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//   17   36:astore          6
		Node node3 = node.parent;
	//   18   38:aload_1         
	//   19   39:getfield        #104 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
	//   20   42:astore          7
		int j = 0;
	//   21   44:iconst_0        
	//   22   45:istore          4
		if(node1 != null && node2 != null)
	//*  23   47:aload           5
	//*  24   49:ifnull          193
	//*  25   52:aload           6
	//*  26   54:ifnull          193
		{
			if(node1.height > node2.height)
	//*  27   57:aload           5
	//*  28   59:getfield        #88  <Field int LinkedTreeMap$Node.height>
	//*  29   62:aload           6
	//*  30   64:getfield        #88  <Field int LinkedTreeMap$Node.height>
	//*  31   67:icmple          80
				node1 = node1.last();
	//   32   70:aload           5
	//   33   72:invokevirtual   #233 <Method LinkedTreeMap$Node LinkedTreeMap$Node.last()>
	//   34   75:astore          5
			else
	//*  35   77:goto            87
				node1 = node2.first();
	//   36   80:aload           6
	//   37   82:invokevirtual   #236 <Method LinkedTreeMap$Node LinkedTreeMap$Node.first()>
	//   38   85:astore          5
			removeInternal(node1, false);
	//   39   87:aload_0         
	//   40   88:aload           5
	//   41   90:iconst_0        
	//   42   91:invokevirtual   #238 <Method void removeInternal(LinkedTreeMap$Node, boolean)>
			node2 = node.left;
	//   43   94:aload_1         
	//   44   95:getfield        #82  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//   45   98:astore          6
			int i;
			if(node2 != null)
	//*  46  100:aload           6
	//*  47  102:ifnull          133
			{
				i = node2.height;
	//   48  105:aload           6
	//   49  107:getfield        #88  <Field int LinkedTreeMap$Node.height>
	//   50  110:istore_3        
				node1.left = node2;
	//   51  111:aload           5
	//   52  113:aload           6
	//   53  115:putfield        #82  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
				node2.parent = node1;
	//   54  118:aload           6
	//   55  120:aload           5
	//   56  122:putfield        #104 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
				node.left = null;
	//   57  125:aload_1         
	//   58  126:aconst_null     
	//   59  127:putfield        #82  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
			} else
	//*  60  130:goto            135
			{
				i = 0;
	//   61  133:iconst_0        
	//   62  134:istore_3        
			}
			node2 = node.right;
	//   63  135:aload_1         
	//   64  136:getfield        #85  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//   65  139:astore          6
			if(node2 != null)
	//*  66  141:aload           6
	//*  67  143:ifnull          172
			{
				j = node2.height;
	//   68  146:aload           6
	//   69  148:getfield        #88  <Field int LinkedTreeMap$Node.height>
	//   70  151:istore          4
				node1.right = node2;
	//   71  153:aload           5
	//   72  155:aload           6
	//   73  157:putfield        #85  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
				node2.parent = node1;
	//   74  160:aload           6
	//   75  162:aload           5
	//   76  164:putfield        #104 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
				node.right = null;
	//   77  167:aload_1         
	//   78  168:aconst_null     
	//   79  169:putfield        #85  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
			}
			node1.height = Math.max(i, j) + 1;
	//   80  172:aload           5
	//   81  174:iload_3         
	//   82  175:iload           4
	//   83  177:invokestatic    #101 <Method int Math.max(int, int)>
	//   84  180:iconst_1        
	//   85  181:iadd            
	//   86  182:putfield        #88  <Field int LinkedTreeMap$Node.height>
			replaceInParent(node, node1);
	//   87  185:aload_0         
	//   88  186:aload_1         
	//   89  187:aload           5
	//   90  189:invokespecial   #112 <Method void replaceInParent(LinkedTreeMap$Node, LinkedTreeMap$Node)>
			return;
	//   91  192:return          
		}
		if(node1 != null)
	//*  92  193:aload           5
	//*  93  195:ifnull          213
		{
			replaceInParent(node, node1);
	//   94  198:aload_0         
	//   95  199:aload_1         
	//   96  200:aload           5
	//   97  202:invokespecial   #112 <Method void replaceInParent(LinkedTreeMap$Node, LinkedTreeMap$Node)>
			node.left = null;
	//   98  205:aload_1         
	//   99  206:aconst_null     
	//  100  207:putfield        #82  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
		} else
	//* 101  210:goto            239
		if(node2 != null)
	//* 102  213:aload           6
	//* 103  215:ifnull          233
		{
			replaceInParent(node, node2);
	//  104  218:aload_0         
	//  105  219:aload_1         
	//  106  220:aload           6
	//  107  222:invokespecial   #112 <Method void replaceInParent(LinkedTreeMap$Node, LinkedTreeMap$Node)>
			node.right = null;
	//  108  225:aload_1         
	//  109  226:aconst_null     
	//  110  227:putfield        #85  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
		} else
	//* 111  230:goto            239
		{
			replaceInParent(node, ((Node) (null)));
	//  112  233:aload_0         
	//  113  234:aload_1         
	//  114  235:aconst_null     
	//  115  236:invokespecial   #112 <Method void replaceInParent(LinkedTreeMap$Node, LinkedTreeMap$Node)>
		}
		rebalance(node3, false);
	//  116  239:aload_0         
	//  117  240:aload           7
	//  118  242:iconst_0        
	//  119  243:invokespecial   #189 <Method void rebalance(LinkedTreeMap$Node, boolean)>
		size = size - 1;
	//  120  246:aload_0         
	//  121  247:aload_0         
	//  122  248:getfield        #60  <Field int size>
	//  123  251:iconst_1        
	//  124  252:isub            
	//  125  253:putfield        #60  <Field int size>
		modCount = modCount + 1;
	//  126  256:aload_0         
	//  127  257:aload_0         
	//  128  258:getfield        #62  <Field int modCount>
	//  129  261:iconst_1        
	//  130  262:iadd            
	//  131  263:putfield        #62  <Field int modCount>
	//  132  266:return          
	}

	Node removeInternalByKey(Object obj)
	{
		obj = ((Object) (findByObject(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #132 <Method LinkedTreeMap$Node findByObject(Object)>
	//    3    5:astore_1        
		if(obj != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          16
			removeInternal(((Node) (obj)), true);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:iconst_1        
	//    9   13:invokevirtual   #238 <Method void removeInternal(LinkedTreeMap$Node, boolean)>
		return ((Node) (obj));
	//   10   16:aload_1         
	//   11   17:areturn         
	}

	public int size()
	{
		return size;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int size>
	//    2    4:ireturn         
	}

	static final boolean $assertionsDisabled = false;
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
	//    0    0:new             #9   <Class LinkedTreeMap$1>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void LinkedTreeMap$1()>
	//    3    7:putstatic       #53  <Field Comparator NATURAL_ORDER>
	//*   4   10:return          
	}
}
