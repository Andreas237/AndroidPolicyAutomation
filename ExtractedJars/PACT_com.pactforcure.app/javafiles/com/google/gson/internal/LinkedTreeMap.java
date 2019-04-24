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
			if(obj instanceof java.util.Map.Entry)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #27  <Class java.util.Map$Entry>
		//*   2    4:ifne            9
		//*   3    7:iconst_0        
		//*   4    8:ireturn         
		//*   5    9:aload_0         
		//*   6   10:getfield        #16  <Field LinkedTreeMap this$0>
		//*   7   13:aload_1         
		//*   8   14:checkcast       #27  <Class java.util.Map$Entry>
		//*   9   17:invokevirtual   #31  <Method LinkedTreeMap$Node LinkedTreeMap.findByEntry(java.util.Map$Entry)>
		//*  10   20:astore_1        
				if((obj = ((Object) (findByEntry((java.util.Map.Entry)obj)))) != null)
		//*  11   21:aload_1         
		//*  12   22:ifnull          7
				{
					removeInternal(((Node) (obj)), true);
		//   13   25:aload_0         
		//   14   26:getfield        #16  <Field LinkedTreeMap this$0>
		//   15   29:aload_1         
		//   16   30:iconst_1        
		//   17   31:invokevirtual   #43  <Method void LinkedTreeMap.removeInternal(LinkedTreeMap$Node, boolean)>
					return true;
		//   18   34:iconst_1        
		//   19   35:ireturn         
				}
			return false;
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
		//   11   17:getfield        #30  <Field Object key>
		//   12   20:ifnonnull       56
_L3:
			flag = flag1;
		//   13   23:iload_3         
		//   14   24:istore_2        
			if(((java.util.Map.Entry) (obj)).getKey() != null) goto _L2; else goto _L5
		//   15   25:aload_1         
		//   16   26:invokeinterface #48  <Method Object java.util.Map$Entry.getKey()>
		//   17   31:ifnonnull       54
_L5:
			if(value != null) goto _L7; else goto _L6
		//   18   34:aload_0         
		//   19   35:getfield        #50  <Field Object value>
		//   20   38:ifnonnull       77
_L6:
			flag = flag1;
		//   21   41:iload_3         
		//   22   42:istore_2        
			if(((java.util.Map.Entry) (obj)).getValue() != null) goto _L2; else goto _L8
		//   23   43:aload_1         
		//   24   44:invokeinterface #53  <Method Object java.util.Map$Entry.getValue()>
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
		//   33   59:getfield        #30  <Field Object key>
		//   34   62:aload_1         
		//   35   63:invokeinterface #48  <Method Object java.util.Map$Entry.getKey()>
		//   36   68:invokevirtual   #55  <Method boolean Object.equals(Object)>
		//   37   71:ifeq            54
		//*  38   74:goto            34
_L7:
			flag = flag1;
		//   39   77:iload_3         
		//   40   78:istore_2        
			if(!value.equals(((java.util.Map.Entry) (obj)).getValue())) goto _L2; else goto _L8
		//   41   79:aload_0         
		//   42   80:getfield        #50  <Field Object value>
		//   43   83:aload_1         
		//   44   84:invokeinterface #53  <Method Object java.util.Map$Entry.getValue()>
		//   45   89:invokevirtual   #55  <Method boolean Object.equals(Object)>
		//   46   92:ifeq            54
		//*  47   95:goto            52
		}

		public Node first()
		{
			Node node1 = this;
		//    0    0:aload_0         
		//    1    1:astore_2        
			for(Node node = node1.left; node != null; node = node1.left)
		//*   2    2:aload_2         
		//*   3    3:getfield        #59  <Field LinkedTreeMap$Node left>
		//*   4    6:astore_1        
		//*   5    7:aload_1         
		//*   6    8:ifnull          21
				node1 = node;
		//    7   11:aload_1         
		//    8   12:astore_2        

		//    9   13:aload_2         
		//   10   14:getfield        #59  <Field LinkedTreeMap$Node left>
		//   11   17:astore_1        
		//*  12   18:goto            7
			return node1;
		//   13   21:aload_2         
		//   14   22:areturn         
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
		//    1    1:getfield        #50  <Field Object value>
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
		//*   3    3:getfield        #30  <Field Object key>
		//*   4    6:ifnonnull       22
				i = 0;
		//    5    9:iconst_0        
		//    6   10:istore_1        
			else
		//*   7   11:aload_0         
		//*   8   12:getfield        #50  <Field Object value>
		//*   9   15:ifnonnull       33
		//*  10   18:iload_1         
		//*  11   19:iload_2         
		//*  12   20:ixor            
		//*  13   21:ireturn         
				i = key.hashCode();
		//   14   22:aload_0         
		//   15   23:getfield        #30  <Field Object key>
		//   16   26:invokevirtual   #66  <Method int Object.hashCode()>
		//   17   29:istore_1        
			if(value != null)
		//*  18   30:goto            11
				j = value.hashCode();
		//   19   33:aload_0         
		//   20   34:getfield        #50  <Field Object value>
		//   21   37:invokevirtual   #66  <Method int Object.hashCode()>
		//   22   40:istore_2        
			return ((int) (i ^ j));
		//*  23   41:goto            18
		}

		public Node last()
		{
			Node node1 = this;
		//    0    0:aload_0         
		//    1    1:astore_2        
			for(Node node = node1.right; node != null; node = node1.right)
		//*   2    2:aload_2         
		//*   3    3:getfield        #69  <Field LinkedTreeMap$Node right>
		//*   4    6:astore_1        
		//*   5    7:aload_1         
		//*   6    8:ifnull          21
				node1 = node;
		//    7   11:aload_1         
		//    8   12:astore_2        

		//    9   13:aload_2         
		//   10   14:getfield        #69  <Field LinkedTreeMap$Node right>
		//   11   17:astore_1        
		//*  12   18:goto            7
			return node1;
		//   13   21:aload_2         
		//   14   22:areturn         
		}

		public Object setValue(Object obj)
		{
			Object obj1 = value;
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field Object value>
		//    2    4:astore_2        
			value = obj;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:putfield        #50  <Field Object value>
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
		//    9   20:getfield        #50  <Field Object value>
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
	//*  14   26:ifnull          35
	//*  15   29:aload_0         
	//*  16   30:aload_1         
	//*  17   31:putfield        #74  <Field Comparator comparator>
	//*  18   34:return          
			comparator1 = NATURAL_ORDER;
	//   19   35:getstatic       #60  <Field Comparator NATURAL_ORDER>
	//   20   38:astore_1        
		comparator = comparator1;
	//*  21   39:goto            29
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
_L11:
		if(node == null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnull          116
_L1:
		int i;
		int j;
		int k;
		Node node1;
		Node node2;
		node1 = node.left;
	//    2    4:aload_1         
	//    3    5:getfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//    4    8:astore          6
		node2 = node.right;
	//    5   10:aload_1         
	//    6   11:getfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//    7   14:astore          7
		Node node4;
		if(node1 != null)
	//*   8   16:aload           6
	//*   9   18:ifnull          117
			i = node1.height;
	//   10   21:aload           6
	//   11   23:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//   12   26:istore_3        
		else
	//*  13   27:aload           7
	//*  14   29:ifnull          122
	//*  15   32:aload           7
	//*  16   34:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//*  17   37:istore          4
	//*  18   39:iload_3         
	//*  19   40:iload           4
	//*  20   42:isub            
	//*  21   43:istore          5
	//*  22   45:iload           5
	//*  23   47:bipush          -2
	//*  24   49:icmpne          172
	//*  25   52:aload           7
	//*  26   54:getfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//*  27   57:astore          6
	//*  28   59:aload           7
	//*  29   61:getfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//*  30   64:astore          8
	//*  31   66:aload           8
	//*  32   68:ifnull          128
	//*  33   71:aload           8
	//*  34   73:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//*  35   76:istore_3        
	//*  36   77:aload           6
	//*  37   79:ifnull          133
	//*  38   82:aload           6
	//*  39   84:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//*  40   87:istore          4
	//*  41   89:iload           4
	//*  42   91:iload_3         
	//*  43   92:isub            
	//*  44   93:istore_3        
	//*  45   94:iload_3         
	//*  46   95:iconst_m1       
	//*  47   96:icmpeq          107
	//*  48   99:iload_3         
	//*  49  100:ifne            139
	//*  50  103:iload_2         
	//*  51  104:ifne            139
	//*  52  107:aload_0         
	//*  53  108:aload_1         
	//*  54  109:invokespecial   #99  <Method void rotateLeft(LinkedTreeMap$Node)>
	//*  55  112:iload_2         
	//*  56  113:ifeq            242
	//*  57  116:return          
			i = 0;
	//   58  117:iconst_0        
	//   59  118:istore_3        
		if(node2 != null)
			j = node2.height;
		else
	//*  60  119:goto            27
			j = 0;
	//   61  122:iconst_0        
	//   62  123:istore          4
		k = i - j;
		if(k != -2) goto _L4; else goto _L3
_L3:
		node1 = node2.left;
		node4 = node2.right;
		if(node4 != null)
			i = node4.height;
		else
	//*  63  125:goto            39
			i = 0;
	//   64  128:iconst_0        
	//   65  129:istore_3        
		if(node1 != null)
			j = node1.height;
		else
	//*  66  130:goto            77
			j = 0;
	//   67  133:iconst_0        
	//   68  134:istore          4
		i = j - i;
		if(i == -1 || i == 0 && !flag)
		{
			rotateLeft(node);
		} else
	//*  69  136:goto            89
		{
			if(!$assertionsDisabled && i != 1)
	//*  70  139:getstatic       #55  <Field boolean $assertionsDisabled>
	//*  71  142:ifne            158
	//*  72  145:iload_3         
	//*  73  146:iconst_1        
	//*  74  147:icmpeq          158
				throw new AssertionError();
	//   75  150:new             #101 <Class AssertionError>
	//   76  153:dup             
	//   77  154:invokespecial   #102 <Method void AssertionError()>
	//   78  157:athrow          
			rotateRight(node2);
	//   79  158:aload_0         
	//   80  159:aload           7
	//   81  161:invokespecial   #105 <Method void rotateRight(LinkedTreeMap$Node)>
			rotateLeft(node);
	//   82  164:aload_0         
	//   83  165:aload_1         
	//   84  166:invokespecial   #99  <Method void rotateLeft(LinkedTreeMap$Node)>
		}
		if(!flag) goto _L5; else goto _L2
_L2:
		return;
	//*  85  169:goto            112
_L4:
		if(k != 2) goto _L7; else goto _L6
	//   86  172:iload           5
	//   87  174:iconst_2        
	//   88  175:icmpne          294
_L6:
		Node node3 = node1.left;
	//   89  178:aload           6
	//   90  180:getfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//   91  183:astore          7
		Node node5 = node1.right;
	//   92  185:aload           6
	//   93  187:getfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//   94  190:astore          8
		if(node5 != null)
	//*  95  192:aload           8
	//*  96  194:ifnull          250
			i = node5.height;
	//   97  197:aload           8
	//   98  199:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//   99  202:istore_3        
		else
	//* 100  203:aload           7
	//* 101  205:ifnull          255
	//* 102  208:aload           7
	//* 103  210:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//* 104  213:istore          4
	//* 105  215:iload           4
	//* 106  217:iload_3         
	//* 107  218:isub            
	//* 108  219:istore_3        
	//* 109  220:iload_3         
	//* 110  221:iconst_1        
	//* 111  222:icmpeq          233
	//* 112  225:iload_3         
	//* 113  226:ifne            261
	//* 114  229:iload_2         
	//* 115  230:ifne            261
	//* 116  233:aload_0         
	//* 117  234:aload_1         
	//* 118  235:invokespecial   #105 <Method void rotateRight(LinkedTreeMap$Node)>
	//* 119  238:iload_2         
	//* 120  239:ifne            116
	//* 121  242:aload_1         
	//* 122  243:getfield        #108 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
	//* 123  246:astore_1        
	//* 124  247:goto            0
			i = 0;
	//  125  250:iconst_0        
	//  126  251:istore_3        
		if(node3 != null)
			j = node3.height;
		else
	//* 127  252:goto            203
			j = 0;
	//  128  255:iconst_0        
	//  129  256:istore          4
		i = j - i;
		if(i == 1 || i == 0 && !flag)
		{
			rotateRight(node);
		} else
	//* 130  258:goto            215
		{
			if(!$assertionsDisabled && i != -1)
	//* 131  261:getstatic       #55  <Field boolean $assertionsDisabled>
	//* 132  264:ifne            280
	//* 133  267:iload_3         
	//* 134  268:iconst_m1       
	//* 135  269:icmpeq          280
				throw new AssertionError();
	//  136  272:new             #101 <Class AssertionError>
	//  137  275:dup             
	//  138  276:invokespecial   #102 <Method void AssertionError()>
	//  139  279:athrow          
			rotateLeft(node1);
	//  140  280:aload_0         
	//  141  281:aload           6
	//  142  283:invokespecial   #99  <Method void rotateLeft(LinkedTreeMap$Node)>
			rotateRight(node);
	//  143  286:aload_0         
	//  144  287:aload_1         
	//  145  288:invokespecial   #105 <Method void rotateRight(LinkedTreeMap$Node)>
		}
		if(flag) goto _L2; else goto _L5
_L5:
		node = node.parent;
		continue; /* Loop/switch isn't completed */
	//* 146  291:goto            238
_L7:
		if(k != 0)
			break; /* Loop/switch isn't completed */
	//  147  294:iload           5
	//  148  296:ifne            311
		node.height = i + 1;
	//  149  299:aload_1         
	//  150  300:iload_3         
	//  151  301:iconst_1        
	//  152  302:iadd            
	//  153  303:putfield        #95  <Field int LinkedTreeMap$Node.height>
		if(flag)
	//* 154  306:iload_2         
	//* 155  307:ifeq            242
			return;
	//  156  310:return          
		if(true) goto _L5; else goto _L8
_L8:
		if(!$assertionsDisabled && k != -1 && k != 1)
	//* 157  311:getstatic       #55  <Field boolean $assertionsDisabled>
	//* 158  314:ifne            337
	//* 159  317:iload           5
	//* 160  319:iconst_m1       
	//* 161  320:icmpeq          337
	//* 162  323:iload           5
	//* 163  325:iconst_1        
	//* 164  326:icmpeq          337
			throw new AssertionError();
	//  165  329:new             #101 <Class AssertionError>
	//  166  332:dup             
	//  167  333:invokespecial   #102 <Method void AssertionError()>
	//  168  336:athrow          
		node.height = Math.max(i, j) + 1;
	//  169  337:aload_1         
	//  170  338:iload_3         
	//  171  339:iload           4
	//  172  341:invokestatic    #114 <Method int Math.max(int, int)>
	//  173  344:iconst_1        
	//  174  345:iadd            
	//  175  346:putfield        #95  <Field int LinkedTreeMap$Node.height>
		if(flag) goto _L5; else goto _L9
	//  176  349:iload_2         
	//  177  350:ifne            242
_L9:
		return;
	//  178  353:return          
		if(true) goto _L11; else goto _L10
_L10:
	}

	private void replaceInParent(Node node, Node node1)
	{
		Node node2 = node.parent;
	//    0    0:aload_1         
	//    1    1:getfield        #108 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
	//    2    4:astore_3        
		node.parent = null;
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:putfield        #108 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
		if(node1 != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			node1.parent = node2;
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:putfield        #108 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
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
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		Node node1 = node.left;
	//    2    3:aload_1         
	//    3    4:getfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//    4    7:astore          5
		Node node2 = node.right;
	//    5    9:aload_1         
	//    6   10:getfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//    7   13:astore          6
		Node node3 = node2.left;
	//    8   15:aload           6
	//    9   17:getfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//   10   20:astore          7
		Node node4 = node2.right;
	//   11   22:aload           6
	//   12   24:getfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//   13   27:astore          8
		node.right = node3;
	//   14   29:aload_1         
	//   15   30:aload           7
	//   16   32:putfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
		if(node3 != null)
	//*  17   35:aload           7
	//*  18   37:ifnull          46
			node3.parent = node;
	//   19   40:aload           7
	//   20   42:aload_1         
	//   21   43:putfield        #108 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
		replaceInParent(node, node2);
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:aload           6
	//   25   50:invokespecial   #122 <Method void replaceInParent(LinkedTreeMap$Node, LinkedTreeMap$Node)>
		node2.left = node;
	//   26   53:aload           6
	//   27   55:aload_1         
	//   28   56:putfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
		node.parent = node2;
	//   29   59:aload_1         
	//   30   60:aload           6
	//   31   62:putfield        #108 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
		int i;
		int j;
		if(node1 != null)
	//*  32   65:aload           5
	//*  33   67:ifnull          130
			i = node1.height;
	//   34   70:aload           5
	//   35   72:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//   36   75:istore_2        
		else
	//*  37   76:aload           7
	//*  38   78:ifnull          135
	//*  39   81:aload           7
	//*  40   83:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//*  41   86:istore_3        
	//*  42   87:aload_1         
	//*  43   88:iload_2         
	//*  44   89:iload_3         
	//*  45   90:invokestatic    #114 <Method int Math.max(int, int)>
	//*  46   93:iconst_1        
	//*  47   94:iadd            
	//*  48   95:putfield        #95  <Field int LinkedTreeMap$Node.height>
	//*  49   98:aload_1         
	//*  50   99:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//*  51  102:istore_3        
	//*  52  103:iload           4
	//*  53  105:istore_2        
	//*  54  106:aload           8
	//*  55  108:ifnull          117
	//*  56  111:aload           8
	//*  57  113:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//*  58  116:istore_2        
	//*  59  117:aload           6
	//*  60  119:iload_3         
	//*  61  120:iload_2         
	//*  62  121:invokestatic    #114 <Method int Math.max(int, int)>
	//*  63  124:iconst_1        
	//*  64  125:iadd            
	//*  65  126:putfield        #95  <Field int LinkedTreeMap$Node.height>
	//*  66  129:return          
			i = 0;
	//   67  130:iconst_0        
	//   68  131:istore_2        
		if(node3 != null)
			j = node3.height;
		else
	//*  69  132:goto            76
			j = 0;
	//   70  135:iconst_0        
	//   71  136:istore_3        
		node.height = Math.max(i, j) + 1;
		j = node.height;
		i = ((int) (flag));
		if(node4 != null)
			i = node4.height;
		node2.height = Math.max(j, i) + 1;
	//*  72  137:goto            87
	}

	private void rotateRight(Node node)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		Node node1 = node.left;
	//    2    3:aload_1         
	//    3    4:getfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//    4    7:astore          5
		Node node2 = node.right;
	//    5    9:aload_1         
	//    6   10:getfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//    7   13:astore          6
		Node node3 = node1.left;
	//    8   15:aload           5
	//    9   17:getfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//   10   20:astore          7
		Node node4 = node1.right;
	//   11   22:aload           5
	//   12   24:getfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//   13   27:astore          8
		node.left = node4;
	//   14   29:aload_1         
	//   15   30:aload           8
	//   16   32:putfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
		if(node4 != null)
	//*  17   35:aload           8
	//*  18   37:ifnull          46
			node4.parent = node;
	//   19   40:aload           8
	//   20   42:aload_1         
	//   21   43:putfield        #108 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
		replaceInParent(node, node1);
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:aload           5
	//   25   50:invokespecial   #122 <Method void replaceInParent(LinkedTreeMap$Node, LinkedTreeMap$Node)>
		node1.right = node;
	//   26   53:aload           5
	//   27   55:aload_1         
	//   28   56:putfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
		node.parent = node1;
	//   29   59:aload_1         
	//   30   60:aload           5
	//   31   62:putfield        #108 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
		int i;
		int j;
		if(node2 != null)
	//*  32   65:aload           6
	//*  33   67:ifnull          130
			i = node2.height;
	//   34   70:aload           6
	//   35   72:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//   36   75:istore_2        
		else
	//*  37   76:aload           8
	//*  38   78:ifnull          135
	//*  39   81:aload           8
	//*  40   83:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//*  41   86:istore_3        
	//*  42   87:aload_1         
	//*  43   88:iload_2         
	//*  44   89:iload_3         
	//*  45   90:invokestatic    #114 <Method int Math.max(int, int)>
	//*  46   93:iconst_1        
	//*  47   94:iadd            
	//*  48   95:putfield        #95  <Field int LinkedTreeMap$Node.height>
	//*  49   98:aload_1         
	//*  50   99:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//*  51  102:istore_3        
	//*  52  103:iload           4
	//*  53  105:istore_2        
	//*  54  106:aload           7
	//*  55  108:ifnull          117
	//*  56  111:aload           7
	//*  57  113:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//*  58  116:istore_2        
	//*  59  117:aload           5
	//*  60  119:iload_3         
	//*  61  120:iload_2         
	//*  62  121:invokestatic    #114 <Method int Math.max(int, int)>
	//*  63  124:iconst_1        
	//*  64  125:iadd            
	//*  65  126:putfield        #95  <Field int LinkedTreeMap$Node.height>
	//*  66  129:return          
			i = 0;
	//   67  130:iconst_0        
	//   68  131:istore_2        
		if(node4 != null)
			j = node4.height;
		else
	//*  69  132:goto            76
			j = 0;
	//   70  135:iconst_0        
	//   71  136:istore_3        
		node.height = Math.max(i, j) + 1;
		j = node.height;
		i = ((int) (flag));
		if(node3 != null)
			i = node3.height;
		node1.height = Math.max(j, i) + 1;
	//*  72  137:goto            87
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
		int i;
		Node node;
		Node node1;
		Object obj1;
		Comparator comparator1;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          7
		comparator1 = comparator;
	//    2    3:aload_0         
	//    3    4:getfield        #74  <Field Comparator comparator>
	//    4    7:astore          8
		node = root;
	//    5    9:aload_0         
	//    6   10:getfield        #119 <Field LinkedTreeMap$Node root>
	//    7   13:astore          4
		i = 0;
	//    8   15:iconst_0        
	//    9   16:istore_3        
		node1 = node;
	//   10   17:aload           4
	//   11   19:astore          5
		if(node == null) goto _L2; else goto _L1
	//   12   21:aload           4
	//   13   23:ifnull          108
_L1:
		Comparable comparable;
		if(comparator1 == NATURAL_ORDER)
	//*  14   26:aload           8
	//*  15   28:getstatic       #60  <Field Comparator NATURAL_ORDER>
	//*  16   31:if_acmpne       65
			comparable = (Comparable)obj;
	//   17   34:aload_1         
	//   18   35:checkcast       #156 <Class Comparable>
	//   19   38:astore          6
		else
	//*  20   40:aload           6
	//*  21   42:ifnull          71
	//*  22   45:aload           6
	//*  23   47:aload           4
	//*  24   49:getfield        #160 <Field Object LinkedTreeMap$Node.key>
	//*  25   52:invokeinterface #164 <Method int Comparable.compareTo(Object)>
	//*  26   57:istore_3        
	//*  27   58:iload_3         
	//*  28   59:ifne            88
	//*  29   62:aload           4
	//*  30   64:areturn         
			comparable = null;
	//   31   65:aconst_null     
	//   32   66:astore          6
_L9:
		if(comparable != null)
			i = comparable.compareTo(node.key);
		else
	//*  33   68:goto            40
			i = comparator1.compare(obj, node.key);
	//   34   71:aload           8
	//   35   73:aload_1         
	//   36   74:aload           4
	//   37   76:getfield        #160 <Field Object LinkedTreeMap$Node.key>
	//   38   79:invokeinterface #170 <Method int Comparator.compare(Object, Object)>
	//   39   84:istore_3        
		if(i != 0) goto _L4; else goto _L3
_L3:
		return node;
	//*  40   85:goto            58
_L4:
		if(i < 0)
	//*  41   88:iload_3         
	//*  42   89:ifge            175
			node1 = node.left;
	//   43   92:aload           4
	//   44   94:getfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//   45   97:astore          5
		else
	//*  46   99:aload           5
	//*  47  101:ifnonnull       185
	//*  48  104:aload           4
	//*  49  106:astore          5
	//*  50  108:aload           7
	//*  51  110:astore          4
	//*  52  112:iload_2         
	//*  53  113:ifeq            62
	//*  54  116:aload_0         
	//*  55  117:getfield        #72  <Field LinkedTreeMap$Node header>
	//*  56  120:astore          4
	//*  57  122:aload           5
	//*  58  124:ifnonnull       237
	//*  59  127:aload           8
	//*  60  129:getstatic       #60  <Field Comparator NATURAL_ORDER>
	//*  61  132:if_acmpne       192
	//*  62  135:aload_1         
	//*  63  136:instanceof      #156 <Class Comparable>
	//*  64  139:ifne            192
	//*  65  142:new             #172 <Class ClassCastException>
	//*  66  145:dup             
	//*  67  146:new             #174 <Class StringBuilder>
	//*  68  149:dup             
	//*  69  150:invokespecial   #175 <Method void StringBuilder()>
	//*  70  153:aload_1         
	//*  71  154:invokevirtual   #179 <Method Class Object.getClass()>
	//*  72  157:invokevirtual   #183 <Method String Class.getName()>
	//*  73  160:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//*  74  163:ldc1            #189 <String " is not Comparable">
	//*  75  165:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//*  76  168:invokevirtual   #192 <Method String StringBuilder.toString()>
	//*  77  171:invokespecial   #195 <Method void ClassCastException(String)>
	//*  78  174:athrow          
			node1 = node.right;
	//   79  175:aload           4
	//   80  177:getfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//   81  180:astore          5
		if(node1 != null) goto _L6; else goto _L5
_L5:
		node1 = node;
_L2:
		node = ((Node) (obj1));
		if(!flag) goto _L3; else goto _L7
	//*  82  182:goto            99
_L6:
		node = node1;
	//   83  185:aload           5
	//   84  187:astore          4
		if(true) goto _L9; else goto _L8
	//   85  189:goto            40
_L7:
		node = header;
		if(node1 != null)
			break; /* Loop/switch isn't completed */
		if(comparator1 == NATURAL_ORDER && !(obj instanceof Comparable))
			throw new ClassCastException((new StringBuilder()).append(obj.getClass().getName()).append(" is not Comparable").toString());
		obj = ((Object) (new Node(node1, obj, node, node.prev)));
	//   86  192:new             #24  <Class LinkedTreeMap$Node>
	//   87  195:dup             
	//   88  196:aload           5
	//   89  198:aload_1         
	//   90  199:aload           4
	//   91  201:aload           4
	//   92  203:getfield        #137 <Field LinkedTreeMap$Node LinkedTreeMap$Node.prev>
	//   93  206:invokespecial   #198 <Method void LinkedTreeMap$Node(LinkedTreeMap$Node, Object, LinkedTreeMap$Node, LinkedTreeMap$Node)>
	//   94  209:astore_1        
		root = ((Node) (obj));
	//   95  210:aload_0         
	//   96  211:aload_1         
	//   97  212:putfield        #119 <Field LinkedTreeMap$Node root>
_L11:
		size = size + 1;
	//   98  215:aload_0         
	//   99  216:aload_0         
	//  100  217:getfield        #67  <Field int size>
	//  101  220:iconst_1        
	//  102  221:iadd            
	//  103  222:putfield        #67  <Field int size>
		modCount = modCount + 1;
	//  104  225:aload_0         
	//  105  226:aload_0         
	//  106  227:getfield        #69  <Field int modCount>
	//  107  230:iconst_1        
	//  108  231:iadd            
	//  109  232:putfield        #69  <Field int modCount>
		return ((Node) (obj));
	//  110  235:aload_1         
	//  111  236:areturn         
_L8:
		obj = ((Object) (new Node(node1, obj, node, node.prev)));
	//  112  237:new             #24  <Class LinkedTreeMap$Node>
	//  113  240:dup             
	//  114  241:aload           5
	//  115  243:aload_1         
	//  116  244:aload           4
	//  117  246:aload           4
	//  118  248:getfield        #137 <Field LinkedTreeMap$Node LinkedTreeMap$Node.prev>
	//  119  251:invokespecial   #198 <Method void LinkedTreeMap$Node(LinkedTreeMap$Node, Object, LinkedTreeMap$Node, LinkedTreeMap$Node)>
	//  120  254:astore_1        
		if(i < 0)
	//* 121  255:iload_3         
	//* 122  256:ifge            275
			node1.left = ((Node) (obj));
	//  123  259:aload           5
	//  124  261:aload_1         
	//  125  262:putfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
		else
	//* 126  265:aload_0         
	//* 127  266:aload           5
	//* 128  268:iconst_1        
	//* 129  269:invokespecial   #200 <Method void rebalance(LinkedTreeMap$Node, boolean)>
	//* 130  272:goto            215
			node1.right = ((Node) (obj));
	//  131  275:aload           5
	//  132  277:aload_1         
	//  133  278:putfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
		rebalance(node1, true);
		if(true) goto _L11; else goto _L10
	//  134  281:goto            265
_L10:
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
	//*   6   12:ifnull          40
	//*   7   15:aload_0         
	//*   8   16:aload_3         
	//*   9   17:getfield        #211 <Field Object LinkedTreeMap$Node.value>
	//*  10   20:aload_1         
	//*  11   21:invokeinterface #214 <Method Object java.util.Map$Entry.getValue()>
	//*  12   26:invokespecial   #216 <Method boolean equal(Object, Object)>
	//*  13   29:ifeq            40
			flag = true;
	//   14   32:iconst_1        
	//   15   33:istore_2        
		else
	//*  16   34:iload_2         
	//*  17   35:ifeq            45
	//*  18   38:aload_3         
	//*  19   39:areturn         
			flag = false;
	//   20   40:iconst_0        
	//   21   41:istore_2        
		if(flag)
			return node;
		else
	//*  22   42:goto            34
			return null;
	//   23   45:aconst_null     
	//   24   46:areturn         
	}

	Node findByObject(Object obj)
	{
		Node node = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(obj != null)
	//*   2    2:aload_1         
	//*   3    3:ifnull          13
			try
			{
				node = find(obj, false);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #219 <Method LinkedTreeMap$Node find(Object, boolean)>
	//    8   12:astore_2        
			}
	//*   9   13:aload_2         
	//*  10   14:areturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  11   15:astore_1        
			{
				return null;
	//   12   16:aconst_null     
	//   13   17:areturn         
			}
		return node;
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
	//   19   39:getfield        #108 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
	//   20   42:astore          7
		if(node1 != null && node2 != null)
	//*  21   44:aload           5
	//*  22   46:ifnull          190
	//*  23   49:aload           6
	//*  24   51:ifnull          190
		{
			int i;
			int j;
			if(node1.height > node2.height)
	//*  25   54:aload           5
	//*  26   56:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//*  27   59:aload           6
	//*  28   61:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//*  29   64:icmple          180
				node1 = node1.last();
	//   30   67:aload           5
	//   31   69:invokevirtual   #244 <Method LinkedTreeMap$Node LinkedTreeMap$Node.last()>
	//   32   72:astore          5
			else
	//*  33   74:aload_0         
	//*  34   75:aload           5
	//*  35   77:iconst_0        
	//*  36   78:invokevirtual   #246 <Method void removeInternal(LinkedTreeMap$Node, boolean)>
	//*  37   81:iconst_0        
	//*  38   82:istore_3        
	//*  39   83:aload_1         
	//*  40   84:getfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//*  41   87:astore          6
	//*  42   89:aload           6
	//*  43   91:ifnull          119
	//*  44   94:aload           6
	//*  45   96:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//*  46   99:istore_3        
	//*  47  100:aload           5
	//*  48  102:aload           6
	//*  49  104:putfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//*  50  107:aload           6
	//*  51  109:aload           5
	//*  52  111:putfield        #108 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
	//*  53  114:aload_1         
	//*  54  115:aconst_null     
	//*  55  116:putfield        #89  <Field LinkedTreeMap$Node LinkedTreeMap$Node.left>
	//*  56  119:iconst_0        
	//*  57  120:istore          4
	//*  58  122:aload_1         
	//*  59  123:getfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//*  60  126:astore          6
	//*  61  128:aload           6
	//*  62  130:ifnull          159
	//*  63  133:aload           6
	//*  64  135:getfield        #95  <Field int LinkedTreeMap$Node.height>
	//*  65  138:istore          4
	//*  66  140:aload           5
	//*  67  142:aload           6
	//*  68  144:putfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//*  69  147:aload           6
	//*  70  149:aload           5
	//*  71  151:putfield        #108 <Field LinkedTreeMap$Node LinkedTreeMap$Node.parent>
	//*  72  154:aload_1         
	//*  73  155:aconst_null     
	//*  74  156:putfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
	//*  75  159:aload           5
	//*  76  161:iload_3         
	//*  77  162:iload           4
	//*  78  164:invokestatic    #114 <Method int Math.max(int, int)>
	//*  79  167:iconst_1        
	//*  80  168:iadd            
	//*  81  169:putfield        #95  <Field int LinkedTreeMap$Node.height>
	//*  82  172:aload_0         
	//*  83  173:aload_1         
	//*  84  174:aload           5
	//*  85  176:invokespecial   #122 <Method void replaceInParent(LinkedTreeMap$Node, LinkedTreeMap$Node)>
	//*  86  179:return          
				node1 = node2.first();
	//   87  180:aload           6
	//   88  182:invokevirtual   #249 <Method LinkedTreeMap$Node LinkedTreeMap$Node.first()>
	//   89  185:astore          5
			removeInternal(node1, false);
			i = 0;
			node2 = node.left;
			if(node2 != null)
			{
				i = node2.height;
				node1.left = node2;
				node2.parent = node1;
				node.left = null;
			}
			j = 0;
			node2 = node.right;
			if(node2 != null)
			{
				j = node2.height;
				node1.right = node2;
				node2.parent = node1;
				node.right = null;
			}
			node1.height = Math.max(i, j) + 1;
			replaceInParent(node, node1);
			return;
		}
	//*  90  187:goto            74
		if(node1 != null)
	//*  91  190:aload           5
	//*  92  192:ifnull          235
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
	//* 100  207:aload_0         
	//* 101  208:aload           7
	//* 102  210:iconst_0        
	//* 103  211:invokespecial   #200 <Method void rebalance(LinkedTreeMap$Node, boolean)>
	//* 104  214:aload_0         
	//* 105  215:aload_0         
	//* 106  216:getfield        #67  <Field int size>
	//* 107  219:iconst_1        
	//* 108  220:isub            
	//* 109  221:putfield        #67  <Field int size>
	//* 110  224:aload_0         
	//* 111  225:aload_0         
	//* 112  226:getfield        #69  <Field int modCount>
	//* 113  229:iconst_1        
	//* 114  230:iadd            
	//* 115  231:putfield        #69  <Field int modCount>
	//* 116  234:return          
		if(node2 != null)
	//* 117  235:aload           6
	//* 118  237:ifnull          255
		{
			replaceInParent(node, node2);
	//  119  240:aload_0         
	//  120  241:aload_1         
	//  121  242:aload           6
	//  122  244:invokespecial   #122 <Method void replaceInParent(LinkedTreeMap$Node, LinkedTreeMap$Node)>
			node.right = null;
	//  123  247:aload_1         
	//  124  248:aconst_null     
	//  125  249:putfield        #92  <Field LinkedTreeMap$Node LinkedTreeMap$Node.right>
		} else
	//* 126  252:goto            207
		{
			replaceInParent(node, ((Node) (null)));
	//  127  255:aload_0         
	//  128  256:aload_1         
	//  129  257:aconst_null     
	//  130  258:invokespecial   #122 <Method void replaceInParent(LinkedTreeMap$Node, LinkedTreeMap$Node)>
		}
		rebalance(node3, false);
		size = size - 1;
		modCount = modCount + 1;
	//* 131  261:goto            207
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
	//    9   13:invokevirtual   #246 <Method void removeInternal(LinkedTreeMap$Node, boolean)>
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
	//*   2    5:ifne            25
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:iload_0         
	//*   6   11:putstatic       #55  <Field boolean $assertionsDisabled>
	//*   7   14:new             #9   <Class LinkedTreeMap$1>
	//*   8   17:dup             
	//*   9   18:invokespecial   #58  <Method void LinkedTreeMap$1()>
	//*  10   21:putstatic       #60  <Field Comparator NATURAL_ORDER>
	//*  11   24:return          
			flag = false;
	//   12   25:iconst_0        
	//   13   26:istore_0        
		$assertionsDisabled = flag;
	//*  14   27:goto            10
	}
}
