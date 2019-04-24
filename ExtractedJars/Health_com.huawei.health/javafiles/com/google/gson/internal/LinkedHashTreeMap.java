// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.*;

public final class LinkedHashTreeMap extends AbstractMap
	implements Serializable
{
	static final class AvlBuilder
	{

		void add(Node node)
		{
			node.right = null;
		//    0    0:aload_1         
		//    1    1:aconst_null     
		//    2    2:putfield        #27  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
			node.parent = null;
		//    3    5:aload_1         
		//    4    6:aconst_null     
		//    5    7:putfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
			node.left = null;
		//    6   10:aload_1         
		//    7   11:aconst_null     
		//    8   12:putfield        #33  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
			node.height = 1;
		//    9   15:aload_1         
		//   10   16:iconst_1        
		//   11   17:putfield        #36  <Field int LinkedHashTreeMap$Node.height>
			if(leavesToSkip > 0 && (size & 1) == 0)
		//*  12   20:aload_0         
		//*  13   21:getfield        #38  <Field int leavesToSkip>
		//*  14   24:ifle            66
		//*  15   27:aload_0         
		//*  16   28:getfield        #40  <Field int size>
		//*  17   31:iconst_1        
		//*  18   32:iand            
		//*  19   33:ifne            66
			{
				size = size + 1;
		//   20   36:aload_0         
		//   21   37:aload_0         
		//   22   38:getfield        #40  <Field int size>
		//   23   41:iconst_1        
		//   24   42:iadd            
		//   25   43:putfield        #40  <Field int size>
				leavesToSkip = leavesToSkip - 1;
		//   26   46:aload_0         
		//   27   47:aload_0         
		//   28   48:getfield        #38  <Field int leavesToSkip>
		//   29   51:iconst_1        
		//   30   52:isub            
		//   31   53:putfield        #38  <Field int leavesToSkip>
				leavesSkipped = leavesSkipped + 1;
		//   32   56:aload_0         
		//   33   57:aload_0         
		//   34   58:getfield        #42  <Field int leavesSkipped>
		//   35   61:iconst_1        
		//   36   62:iadd            
		//   37   63:putfield        #42  <Field int leavesSkipped>
			}
			node.parent = stack;
		//   38   66:aload_1         
		//   39   67:aload_0         
		//   40   68:getfield        #44  <Field LinkedHashTreeMap$Node stack>
		//   41   71:putfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
			stack = node;
		//   42   74:aload_0         
		//   43   75:aload_1         
		//   44   76:putfield        #44  <Field LinkedHashTreeMap$Node stack>
			size = size + 1;
		//   45   79:aload_0         
		//   46   80:aload_0         
		//   47   81:getfield        #40  <Field int size>
		//   48   84:iconst_1        
		//   49   85:iadd            
		//   50   86:putfield        #40  <Field int size>
			if(leavesToSkip > 0 && (size & 1) == 0)
		//*  51   89:aload_0         
		//*  52   90:getfield        #38  <Field int leavesToSkip>
		//*  53   93:ifle            135
		//*  54   96:aload_0         
		//*  55   97:getfield        #40  <Field int size>
		//*  56  100:iconst_1        
		//*  57  101:iand            
		//*  58  102:ifne            135
			{
				size = size + 1;
		//   59  105:aload_0         
		//   60  106:aload_0         
		//   61  107:getfield        #40  <Field int size>
		//   62  110:iconst_1        
		//   63  111:iadd            
		//   64  112:putfield        #40  <Field int size>
				leavesToSkip = leavesToSkip - 1;
		//   65  115:aload_0         
		//   66  116:aload_0         
		//   67  117:getfield        #38  <Field int leavesToSkip>
		//   68  120:iconst_1        
		//   69  121:isub            
		//   70  122:putfield        #38  <Field int leavesToSkip>
				leavesSkipped = leavesSkipped + 1;
		//   71  125:aload_0         
		//   72  126:aload_0         
		//   73  127:getfield        #42  <Field int leavesSkipped>
		//   74  130:iconst_1        
		//   75  131:iadd            
		//   76  132:putfield        #42  <Field int leavesSkipped>
			}
			for(int i = 4; (size & i - 1) == i - 1; i *= 2)
		//*  77  135:iconst_4        
		//*  78  136:istore_2        
		//*  79  137:aload_0         
		//*  80  138:getfield        #40  <Field int size>
		//*  81  141:iload_2         
		//*  82  142:iconst_1        
		//*  83  143:isub            
		//*  84  144:iand            
		//*  85  145:iload_2         
		//*  86  146:iconst_1        
		//*  87  147:isub            
		//*  88  148:icmpne          294
			{
				if(leavesSkipped == 0)
		//*  89  151:aload_0         
		//*  90  152:getfield        #42  <Field int leavesSkipped>
		//*  91  155:ifne            223
				{
					node = stack;
		//   92  158:aload_0         
		//   93  159:getfield        #44  <Field LinkedHashTreeMap$Node stack>
		//   94  162:astore_1        
					Node node1 = node.parent;
		//   95  163:aload_1         
		//   96  164:getfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		//   97  167:astore_3        
					Node node3 = node1.parent;
		//   98  168:aload_3         
		//   99  169:getfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		//  100  172:astore          4
					node1.parent = node3.parent;
		//  101  174:aload_3         
		//  102  175:aload           4
		//  103  177:getfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		//  104  180:putfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
					stack = node1;
		//  105  183:aload_0         
		//  106  184:aload_3         
		//  107  185:putfield        #44  <Field LinkedHashTreeMap$Node stack>
					node1.left = node3;
		//  108  188:aload_3         
		//  109  189:aload           4
		//  110  191:putfield        #33  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
					node1.right = node;
		//  111  194:aload_3         
		//  112  195:aload_1         
		//  113  196:putfield        #27  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
					node1.height = node.height + 1;
		//  114  199:aload_3         
		//  115  200:aload_1         
		//  116  201:getfield        #36  <Field int LinkedHashTreeMap$Node.height>
		//  117  204:iconst_1        
		//  118  205:iadd            
		//  119  206:putfield        #36  <Field int LinkedHashTreeMap$Node.height>
					node3.parent = node1;
		//  120  209:aload           4
		//  121  211:aload_3         
		//  122  212:putfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
					node.parent = node1;
		//  123  215:aload_1         
		//  124  216:aload_3         
		//  125  217:putfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
					continue;
		//  126  220:goto            287
				}
				if(leavesSkipped == 1)
		//* 127  223:aload_0         
		//* 128  224:getfield        #42  <Field int leavesSkipped>
		//* 129  227:iconst_1        
		//* 130  228:icmpne          274
				{
					node = stack;
		//  131  231:aload_0         
		//  132  232:getfield        #44  <Field LinkedHashTreeMap$Node stack>
		//  133  235:astore_1        
					Node node2 = node.parent;
		//  134  236:aload_1         
		//  135  237:getfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		//  136  240:astore_3        
					stack = node2;
		//  137  241:aload_0         
		//  138  242:aload_3         
		//  139  243:putfield        #44  <Field LinkedHashTreeMap$Node stack>
					node2.right = node;
		//  140  246:aload_3         
		//  141  247:aload_1         
		//  142  248:putfield        #27  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
					node2.height = node.height + 1;
		//  143  251:aload_3         
		//  144  252:aload_1         
		//  145  253:getfield        #36  <Field int LinkedHashTreeMap$Node.height>
		//  146  256:iconst_1        
		//  147  257:iadd            
		//  148  258:putfield        #36  <Field int LinkedHashTreeMap$Node.height>
					node.parent = node2;
		//  149  261:aload_1         
		//  150  262:aload_3         
		//  151  263:putfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
					leavesSkipped = 0;
		//  152  266:aload_0         
		//  153  267:iconst_0        
		//  154  268:putfield        #42  <Field int leavesSkipped>
					continue;
		//  155  271:goto            287
				}
				if(leavesSkipped == 2)
		//* 156  274:aload_0         
		//* 157  275:getfield        #42  <Field int leavesSkipped>
		//* 158  278:iconst_2        
		//* 159  279:icmpne          287
					leavesSkipped = 0;
		//  160  282:aload_0         
		//  161  283:iconst_0        
		//  162  284:putfield        #42  <Field int leavesSkipped>
			}

		//  163  287:iload_2         
		//  164  288:iconst_2        
		//  165  289:imul            
		//  166  290:istore_2        
		//* 167  291:goto            137
		//  168  294:return          
		}

		void reset(int i)
		{
			leavesToSkip = Integer.highestOneBit(i) * 2 - 1 - i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokestatic    #54  <Method int Integer.highestOneBit(int)>
		//    3    5:iconst_2        
		//    4    6:imul            
		//    5    7:iconst_1        
		//    6    8:isub            
		//    7    9:iload_1         
		//    8   10:isub            
		//    9   11:putfield        #38  <Field int leavesToSkip>
			size = 0;
		//   10   14:aload_0         
		//   11   15:iconst_0        
		//   12   16:putfield        #40  <Field int size>
			leavesSkipped = 0;
		//   13   19:aload_0         
		//   14   20:iconst_0        
		//   15   21:putfield        #42  <Field int leavesSkipped>
			stack = null;
		//   16   24:aload_0         
		//   17   25:aconst_null     
		//   18   26:putfield        #44  <Field LinkedHashTreeMap$Node stack>
		//   19   29:return          
		}

		Node root()
		{
			Node node = stack;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field LinkedHashTreeMap$Node stack>
		//    2    4:astore_1        
			if(node.parent != null)
		//*   3    5:aload_1         
		//*   4    6:getfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		//*   5    9:ifnull          20
				throw new IllegalStateException();
		//    6   12:new             #58  <Class IllegalStateException>
		//    7   15:dup             
		//    8   16:invokespecial   #59  <Method void IllegalStateException()>
		//    9   19:athrow          
			else
				return node;
		//   10   20:aload_1         
		//   11   21:areturn         
		}

		private int leavesSkipped;
		private int leavesToSkip;
		private int size;
		private Node stack;

		AvlBuilder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}
	}

	static class AvlIterator
	{

		public Node next()
		{
			Node node2 = stackTop;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field LinkedHashTreeMap$Node stackTop>
		//    2    4:astore_3        
			if(node2 == null)
		//*   3    5:aload_3         
		//*   4    6:ifnonnull       11
				return null;
		//    5    9:aconst_null     
		//    6   10:areturn         
			Node node1 = node2.parent;
		//    7   11:aload_3         
		//    8   12:getfield        #25  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		//    9   15:astore_2        
			node2.parent = null;
		//   10   16:aload_3         
		//   11   17:aconst_null     
		//   12   18:putfield        #25  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
			for(Node node = node2.right; node != null; node = node.left)
		//*  13   21:aload_3         
		//*  14   22:getfield        #28  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
		//*  15   25:astore_1        
		//*  16   26:aload_1         
		//*  17   27:ifnull          45
			{
				node.parent = node1;
		//   18   30:aload_1         
		//   19   31:aload_2         
		//   20   32:putfield        #25  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
				node1 = node;
		//   21   35:aload_1         
		//   22   36:astore_2        
			}

		//   23   37:aload_1         
		//   24   38:getfield        #31  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
		//   25   41:astore_1        
		//*  26   42:goto            26
			stackTop = node1;
		//   27   45:aload_0         
		//   28   46:aload_2         
		//   29   47:putfield        #20  <Field LinkedHashTreeMap$Node stackTop>
			return node2;
		//   30   50:aload_3         
		//   31   51:areturn         
		}

		void reset(Node node)
		{
			Node node1 = null;
		//    0    0:aconst_null     
		//    1    1:astore_2        
			for(; node != null; node = node.left)
		//*   2    2:aload_1         
		//*   3    3:ifnull          21
			{
				node.parent = node1;
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:putfield        #25  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
				node1 = node;
		//    7   11:aload_1         
		//    8   12:astore_2        
			}

		//    9   13:aload_1         
		//   10   14:getfield        #31  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
		//   11   17:astore_1        
		//*  12   18:goto            2
			stackTop = node1;
		//   13   21:aload_0         
		//   14   22:aload_2         
		//   15   23:putfield        #20  <Field LinkedHashTreeMap$Node stackTop>
		//   16   26:return          
		}

		private Node stackTop;

		AvlIterator()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:return          
		}
	}

	final class EntrySet extends AbstractSet
	{

		public void clear()
		{
			LinkedHashTreeMap.this.clear();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field LinkedHashTreeMap this$0>
		//    2    4:invokevirtual   #23  <Method void LinkedHashTreeMap.clear()>
		//    3    7:return          
		}

		public boolean contains(Object obj)
		{
			return (obj instanceof java.util.Map.Entry) && findByEntry((java.util.Map.Entry)obj) != null;
		//    0    0:aload_1         
		//    1    1:instanceof      #27  <Class java.util.Map$Entry>
		//    2    4:ifeq            23
		//    3    7:aload_0         
		//    4    8:getfield        #16  <Field LinkedHashTreeMap this$0>
		//    5   11:aload_1         
		//    6   12:checkcast       #27  <Class java.util.Map$Entry>
		//    7   15:invokevirtual   #31  <Method LinkedHashTreeMap$Node LinkedHashTreeMap.findByEntry(java.util.Map$Entry)>
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
				//    1    1:invokevirtual   #36  <Method LinkedHashTreeMap$Node nextNode()>
				//    2    4:areturn         
				}

				final EntrySet this$1;

			
			{
				this$1 = EntrySet.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field LinkedHashTreeMap$EntrySet this$1>
				super();
			//    3    5:aload_0         
			//    4    6:aload_1         
			//    5    7:getfield        #23  <Field LinkedHashTreeMap LinkedHashTreeMap$EntrySet.this$0>
			//    6   10:invokespecial   #26  <Method void LinkedHashTreeMap$LinkedTreeMapIterator(LinkedHashTreeMap)>
			//    7   13:return          
			}
			}
));
		//    0    0:new             #10  <Class LinkedHashTreeMap$EntrySet$1>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #36  <Method void LinkedHashTreeMap$EntrySet$1(LinkedHashTreeMap$EntrySet)>
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
		//    6   10:getfield        #16  <Field LinkedHashTreeMap this$0>
		//    7   13:aload_1         
		//    8   14:checkcast       #27  <Class java.util.Map$Entry>
		//    9   17:invokevirtual   #31  <Method LinkedHashTreeMap$Node LinkedHashTreeMap.findByEntry(java.util.Map$Entry)>
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
		//   16   28:getfield        #16  <Field LinkedHashTreeMap this$0>
		//   17   31:aload_1         
		//   18   32:iconst_1        
		//   19   33:invokevirtual   #43  <Method void LinkedHashTreeMap.removeInternal(LinkedHashTreeMap$Node, boolean)>
				return true;
		//   20   36:iconst_1        
		//   21   37:ireturn         
			}
		}

		public int size()
		{
			return LinkedHashTreeMap.this.size;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field LinkedHashTreeMap this$0>
		//    2    4:getfield        #48  <Field int LinkedHashTreeMap.size>
		//    3    7:ireturn         
		}

		final LinkedHashTreeMap this$0;

		EntrySet()
		{
			this$0 = LinkedHashTreeMap.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field LinkedHashTreeMap this$0>
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
			LinkedHashTreeMap.this.clear();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field LinkedHashTreeMap this$0>
		//    2    4:invokevirtual   #23  <Method void LinkedHashTreeMap.clear()>
		//    3    7:return          
		}

		public boolean contains(Object obj)
		{
			return containsKey(obj);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field LinkedHashTreeMap this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #28  <Method boolean LinkedHashTreeMap.containsKey(Object)>
		//    4    8:ireturn         
		}

		public Iterator iterator()
		{
			return ((Iterator) (new LinkedTreeMapIterator() {

				public Object next()
				{
					return nextNode().key;
				//    0    0:aload_0         
				//    1    1:invokevirtual   #33  <Method LinkedHashTreeMap$Node nextNode()>
				//    2    4:getfield        #39  <Field Object LinkedHashTreeMap$Node.key>
				//    3    7:areturn         
				}

				final KeySet this$1;

			
			{
				this$1 = KeySet.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field LinkedHashTreeMap$KeySet this$1>
				super();
			//    3    5:aload_0         
			//    4    6:aload_1         
			//    5    7:getfield        #23  <Field LinkedHashTreeMap LinkedHashTreeMap$KeySet.this$0>
			//    6   10:invokespecial   #26  <Method void LinkedHashTreeMap$LinkedTreeMapIterator(LinkedHashTreeMap)>
			//    7   13:return          
			}
			}
));
		//    0    0:new             #10  <Class LinkedHashTreeMap$KeySet$1>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #33  <Method void LinkedHashTreeMap$KeySet$1(LinkedHashTreeMap$KeySet)>
		//    4    8:areturn         
		}

		public boolean remove(Object obj)
		{
			return removeInternalByKey(obj) != null;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field LinkedHashTreeMap this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #40  <Method LinkedHashTreeMap$Node LinkedHashTreeMap.removeInternalByKey(Object)>
		//    4    8:ifnull          13
		//    5   11:iconst_1        
		//    6   12:ireturn         
		//    7   13:iconst_0        
		//    8   14:ireturn         
		}

		public int size()
		{
			return LinkedHashTreeMap.this.size;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field LinkedHashTreeMap this$0>
		//    2    4:getfield        #45  <Field int LinkedHashTreeMap.size>
		//    3    7:ireturn         
		}

		final LinkedHashTreeMap this$0;

		KeySet()
		{
			this$0 = LinkedHashTreeMap.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field LinkedHashTreeMap this$0>
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
		//    1    1:getfield        #33  <Field LinkedHashTreeMap$Node next>
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field LinkedHashTreeMap this$0>
		//    4    8:getfield        #28  <Field LinkedHashTreeMap$Node LinkedHashTreeMap.header>
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
		//    1    1:getfield        #33  <Field LinkedHashTreeMap$Node next>
		//    2    4:astore_1        
			if(node == header)
		//*   3    5:aload_1         
		//*   4    6:aload_0         
		//*   5    7:getfield        #22  <Field LinkedHashTreeMap this$0>
		//*   6   10:getfield        #28  <Field LinkedHashTreeMap$Node LinkedHashTreeMap.header>
		//*   7   13:if_acmpne       24
				throw new NoSuchElementException();
		//    8   16:new             #47  <Class NoSuchElementException>
		//    9   19:dup             
		//   10   20:invokespecial   #48  <Method void NoSuchElementException()>
		//   11   23:athrow          
			if(modCount != expectedModCount)
		//*  12   24:aload_0         
		//*  13   25:getfield        #22  <Field LinkedHashTreeMap this$0>
		//*  14   28:getfield        #38  <Field int LinkedHashTreeMap.modCount>
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
		//   24   48:getfield        #32  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.next>
		//   25   51:putfield        #33  <Field LinkedHashTreeMap$Node next>
				lastReturned = node;
		//   26   54:aload_0         
		//   27   55:aload_1         
		//   28   56:putfield        #35  <Field LinkedHashTreeMap$Node lastReturned>
				return node;
		//   29   59:aload_1         
		//   30   60:areturn         
			}
		}

		public final void remove()
		{
			if(lastReturned == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #35  <Field LinkedHashTreeMap$Node lastReturned>
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
		//    8   16:getfield        #22  <Field LinkedHashTreeMap this$0>
		//    9   19:aload_0         
		//   10   20:getfield        #35  <Field LinkedHashTreeMap$Node lastReturned>
		//   11   23:iconst_1        
		//   12   24:invokevirtual   #61  <Method void LinkedHashTreeMap.removeInternal(LinkedHashTreeMap$Node, boolean)>
				lastReturned = null;
		//   13   27:aload_0         
		//   14   28:aconst_null     
		//   15   29:putfield        #35  <Field LinkedHashTreeMap$Node lastReturned>
				expectedModCount = modCount;
		//   16   32:aload_0         
		//   17   33:aload_0         
		//   18   34:getfield        #22  <Field LinkedHashTreeMap this$0>
		//   19   37:getfield        #38  <Field int LinkedHashTreeMap.modCount>
		//   20   40:putfield        #40  <Field int expectedModCount>
				return;
		//   21   43:return          
			}
		}

		int expectedModCount;
		Node lastReturned;
		Node next;
		final LinkedHashTreeMap this$0;

		LinkedTreeMapIterator()
		{
			this$0 = LinkedHashTreeMap.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #22  <Field LinkedHashTreeMap this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #25  <Method void Object()>
			next = header.next;
		//    5    9:aload_0         
		//    6   10:aload_0         
		//    7   11:getfield        #22  <Field LinkedHashTreeMap this$0>
		//    8   14:getfield        #28  <Field LinkedHashTreeMap$Node LinkedHashTreeMap.header>
		//    9   17:getfield        #32  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.next>
		//   10   20:putfield        #33  <Field LinkedHashTreeMap$Node next>
			lastReturned = null;
		//   11   23:aload_0         
		//   12   24:aconst_null     
		//   13   25:putfield        #35  <Field LinkedHashTreeMap$Node lastReturned>
			expectedModCount = modCount;
		//   14   28:aload_0         
		//   15   29:aload_0         
		//   16   30:getfield        #22  <Field LinkedHashTreeMap this$0>
		//   17   33:getfield        #38  <Field int LinkedHashTreeMap.modCount>
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
		//    7   13:getfield        #31  <Field Object key>
		//    8   16:ifnonnull       31
		//    9   19:aload_1         
		//   10   20:invokeinterface #51  <Method Object java.util.Map$Entry.getKey()>
		//   11   25:ifnonnull       84
		//   12   28:goto            47
		//   13   31:aload_0         
		//   14   32:getfield        #31  <Field Object key>
		//   15   35:aload_1         
		//   16   36:invokeinterface #51  <Method Object java.util.Map$Entry.getKey()>
		//   17   41:invokevirtual   #53  <Method boolean Object.equals(Object)>
		//   18   44:ifeq            84
		//   19   47:aload_0         
		//   20   48:getfield        #55  <Field Object value>
		//   21   51:ifnonnull       66
		//   22   54:aload_1         
		//   23   55:invokeinterface #58  <Method Object java.util.Map$Entry.getValue()>
		//   24   60:ifnonnull       84
		//   25   63:goto            82
		//   26   66:aload_0         
		//   27   67:getfield        #55  <Field Object value>
		//   28   70:aload_1         
		//   29   71:invokeinterface #58  <Method Object java.util.Map$Entry.getValue()>
		//   30   76:invokevirtual   #53  <Method boolean Object.equals(Object)>
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
		//*   3    3:getfield        #62  <Field LinkedHashTreeMap$Node left>
		//*   4    6:astore_1        
		//*   5    7:aload_1         
		//*   6    8:ifnull          23
			{
				node2 = node.left;
		//    7   11:aload_1         
		//    8   12:getfield        #62  <Field LinkedHashTreeMap$Node left>
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
			int i;
			if(key == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #31  <Field Object key>
		//*   2    4:ifnonnull       12
				i = 0;
		//    3    7:iconst_0        
		//    4    8:istore_1        
			else
		//*   5    9:goto            20
				i = key.hashCode();
		//    6   12:aload_0         
		//    7   13:getfield        #31  <Field Object key>
		//    8   16:invokevirtual   #69  <Method int Object.hashCode()>
		//    9   19:istore_1        
			int j;
			if(value == null)
		//*  10   20:aload_0         
		//*  11   21:getfield        #55  <Field Object value>
		//*  12   24:ifnonnull       32
				j = 0;
		//   13   27:iconst_0        
		//   14   28:istore_2        
			else
		//*  15   29:goto            40
				j = value.hashCode();
		//   16   32:aload_0         
		//   17   33:getfield        #55  <Field Object value>
		//   18   36:invokevirtual   #69  <Method int Object.hashCode()>
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
		//*   3    3:getfield        #72  <Field LinkedHashTreeMap$Node right>
		//*   4    6:astore_1        
		//*   5    7:aload_1         
		//*   6    8:ifnull          23
			{
				node2 = node.right;
		//    7   11:aload_1         
		//    8   12:getfield        #72  <Field LinkedHashTreeMap$Node right>
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
		//    9   20:getfield        #55  <Field Object value>
		//   10   23:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
		//   11   26:invokevirtual   #91  <Method String StringBuilder.toString()>
		//   12   29:areturn         
		}

		final int hash;
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

		Node(Node node, Object obj, int i, Node node1, Node node2)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #29  <Method void Object()>
			parent = node;
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
			next = node1;
		//   14   24:aload_0         
		//   15   25:aload           4
		//   16   27:putfield        #37  <Field LinkedHashTreeMap$Node next>
			prev = node2;
		//   17   30:aload_0         
		//   18   31:aload           5
		//   19   33:putfield        #35  <Field LinkedHashTreeMap$Node prev>
			node2.next = this;
		//   20   36:aload           5
		//   21   38:aload_0         
		//   22   39:putfield        #37  <Field LinkedHashTreeMap$Node next>
			node1.prev = this;
		//   23   42:aload           4
		//   24   44:aload_0         
		//   25   45:putfield        #35  <Field LinkedHashTreeMap$Node prev>
		//   26   48:return          
		}
	}


	public LinkedHashTreeMap()
	{
		this(NATURAL_ORDER);
	//    0    0:aload_0         
	//    1    1:getstatic       #69  <Field Comparator NATURAL_ORDER>
	//    2    4:invokespecial   #73  <Method void LinkedHashTreeMap(Comparator)>
	//    3    7:return          
	}

	public LinkedHashTreeMap(Comparator comparator1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #74  <Method void AbstractMap()>
		size = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #76  <Field int size>
		modCount = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #78  <Field int modCount>
		if(comparator1 == null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          21
	//*  10   18:goto            25
			comparator1 = NATURAL_ORDER;
	//   11   21:getstatic       #69  <Field Comparator NATURAL_ORDER>
	//   12   24:astore_1        
		comparator = comparator1;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #80  <Field Comparator comparator>
		header = new Node();
	//   16   30:aload_0         
	//   17   31:new             #30  <Class LinkedHashTreeMap$Node>
	//   18   34:dup             
	//   19   35:invokespecial   #81  <Method void LinkedHashTreeMap$Node()>
	//   20   38:putfield        #83  <Field LinkedHashTreeMap$Node header>
		table = new Node[16];
	//   21   41:aload_0         
	//   22   42:bipush          16
	//   23   44:anewarray       Node[]
	//   24   47:putfield        #85  <Field LinkedHashTreeMap$Node[] table>
		threshold = table.length / 2 + table.length / 4;
	//   25   50:aload_0         
	//   26   51:aload_0         
	//   27   52:getfield        #85  <Field LinkedHashTreeMap$Node[] table>
	//   28   55:arraylength     
	//   29   56:iconst_2        
	//   30   57:idiv            
	//   31   58:aload_0         
	//   32   59:getfield        #85  <Field LinkedHashTreeMap$Node[] table>
	//   33   62:arraylength     
	//   34   63:iconst_4        
	//   35   64:idiv            
	//   36   65:iadd            
	//   37   66:putfield        #87  <Field int threshold>
	//   38   69:return          
	}

	private void doubleCapacity()
	{
		table = doubleCapacity(table);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #85  <Field LinkedHashTreeMap$Node[] table>
	//    3    5:invokestatic    #93  <Method LinkedHashTreeMap$Node[] doubleCapacity(LinkedHashTreeMap$Node[])>
	//    4    8:putfield        #85  <Field LinkedHashTreeMap$Node[] table>
		threshold = table.length / 2 + table.length / 4;
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #85  <Field LinkedHashTreeMap$Node[] table>
	//    8   16:arraylength     
	//    9   17:iconst_2        
	//   10   18:idiv            
	//   11   19:aload_0         
	//   12   20:getfield        #85  <Field LinkedHashTreeMap$Node[] table>
	//   13   23:arraylength     
	//   14   24:iconst_4        
	//   15   25:idiv            
	//   16   26:iadd            
	//   17   27:putfield        #87  <Field int threshold>
	//   18   30:return          
	}

	static Node[] doubleCapacity(Node anode[])
	{
		int l = anode.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore          4
		Node anode1[] = new Node[l * 2];
	//    3    4:iload           4
	//    4    6:iconst_2        
	//    5    7:imul            
	//    6    8:anewarray       Node[]
	//    7   11:astore          6
		AvlIterator avliterator = new AvlIterator();
	//    8   13:new             #14  <Class LinkedHashTreeMap$AvlIterator>
	//    9   16:dup             
	//   10   17:invokespecial   #94  <Method void LinkedHashTreeMap$AvlIterator()>
	//   11   20:astore          7
		AvlBuilder avlbuilder = new AvlBuilder();
	//   12   22:new             #11  <Class LinkedHashTreeMap$AvlBuilder>
	//   13   25:dup             
	//   14   26:invokespecial   #95  <Method void LinkedHashTreeMap$AvlBuilder()>
	//   15   29:astore          8
		AvlBuilder avlbuilder1 = new AvlBuilder();
	//   16   31:new             #11  <Class LinkedHashTreeMap$AvlBuilder>
	//   17   34:dup             
	//   18   35:invokespecial   #95  <Method void LinkedHashTreeMap$AvlBuilder()>
	//   19   38:astore          9
		for(int i = 0; i < l; i++)
	//*  20   40:iconst_0        
	//*  21   41:istore_1        
	//*  22   42:iload_1         
	//*  23   43:iload           4
	//*  24   45:icmpge          227
		{
			Node node = anode[i];
	//   25   48:aload_0         
	//   26   49:iload_1         
	//   27   50:aaload          
	//   28   51:astore          5
			if(node == null)
	//*  29   53:aload           5
	//*  30   55:ifnonnull       61
				continue;
	//   31   58:goto            220
			avliterator.reset(node);
	//   32   61:aload           7
	//   33   63:aload           5
	//   34   65:invokevirtual   #99  <Method void LinkedHashTreeMap$AvlIterator.reset(LinkedHashTreeMap$Node)>
			int k = 0;
	//   35   68:iconst_0        
	//   36   69:istore_3        
			int j = 0;
	//   37   70:iconst_0        
	//   38   71:istore_2        
			do
			{
				Node node1 = avliterator.next();
	//   39   72:aload           7
	//   40   74:invokevirtual   #103 <Method LinkedHashTreeMap$Node LinkedHashTreeMap$AvlIterator.next()>
	//   41   77:astore          10
				if(node1 == null)
					break;
	//   42   79:aload           10
	//   43   81:ifnull          109
				if((node1.hash & l) == 0)
	//*  44   84:aload           10
	//*  45   86:getfield        #106 <Field int LinkedHashTreeMap$Node.hash>
	//*  46   89:iload           4
	//*  47   91:iand            
	//*  48   92:ifne            102
					k++;
	//   49   95:iload_3         
	//   50   96:iconst_1        
	//   51   97:iadd            
	//   52   98:istore_3        
				else
	//*  53   99:goto            72
					j++;
	//   54  102:iload_2         
	//   55  103:iconst_1        
	//   56  104:iadd            
	//   57  105:istore_2        
			} while(true);
	//   58  106:goto            72
			avlbuilder.reset(k);
	//   59  109:aload           8
	//   60  111:iload_3         
	//   61  112:invokevirtual   #109 <Method void LinkedHashTreeMap$AvlBuilder.reset(int)>
			avlbuilder1.reset(j);
	//   62  115:aload           9
	//   63  117:iload_2         
	//   64  118:invokevirtual   #109 <Method void LinkedHashTreeMap$AvlBuilder.reset(int)>
			avliterator.reset(node);
	//   65  121:aload           7
	//   66  123:aload           5
	//   67  125:invokevirtual   #99  <Method void LinkedHashTreeMap$AvlIterator.reset(LinkedHashTreeMap$Node)>
			do
			{
				node = avliterator.next();
	//   68  128:aload           7
	//   69  130:invokevirtual   #103 <Method LinkedHashTreeMap$Node LinkedHashTreeMap$AvlIterator.next()>
	//   70  133:astore          5
				if(node == null)
					break;
	//   71  135:aload           5
	//   72  137:ifnull          171
				if((node.hash & l) == 0)
	//*  73  140:aload           5
	//*  74  142:getfield        #106 <Field int LinkedHashTreeMap$Node.hash>
	//*  75  145:iload           4
	//*  76  147:iand            
	//*  77  148:ifne            161
					avlbuilder.add(node);
	//   78  151:aload           8
	//   79  153:aload           5
	//   80  155:invokevirtual   #112 <Method void LinkedHashTreeMap$AvlBuilder.add(LinkedHashTreeMap$Node)>
				else
	//*  81  158:goto            128
					avlbuilder1.add(node);
	//   82  161:aload           9
	//   83  163:aload           5
	//   84  165:invokevirtual   #112 <Method void LinkedHashTreeMap$AvlBuilder.add(LinkedHashTreeMap$Node)>
			} while(true);
	//   85  168:goto            128
			if(k > 0)
	//*  86  171:iload_3         
	//*  87  172:ifle            185
				node = avlbuilder.root();
	//   88  175:aload           8
	//   89  177:invokevirtual   #115 <Method LinkedHashTreeMap$Node LinkedHashTreeMap$AvlBuilder.root()>
	//   90  180:astore          5
			else
	//*  91  182:goto            188
				node = null;
	//   92  185:aconst_null     
	//   93  186:astore          5
			anode1[i] = node;
	//   94  188:aload           6
	//   95  190:iload_1         
	//   96  191:aload           5
	//   97  193:aastore         
			if(j > 0)
	//*  98  194:iload_2         
	//*  99  195:ifle            208
				node = avlbuilder1.root();
	//  100  198:aload           9
	//  101  200:invokevirtual   #115 <Method LinkedHashTreeMap$Node LinkedHashTreeMap$AvlBuilder.root()>
	//  102  203:astore          5
			else
	//* 103  205:goto            211
				node = null;
	//  104  208:aconst_null     
	//  105  209:astore          5
			anode1[i + l] = node;
	//  106  211:aload           6
	//  107  213:iload_1         
	//  108  214:iload           4
	//  109  216:iadd            
	//  110  217:aload           5
	//  111  219:aastore         
		}

	//  112  220:iload_1         
	//  113  221:iconst_1        
	//  114  222:iadd            
	//  115  223:istore_1        
	//* 116  224:goto            42
		return anode1;
	//  117  227:aload           6
	//  118  229:areturn         
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
	//    7   11:invokevirtual   #124 <Method boolean Object.equals(Object)>
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
	//    3    5:getfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//    4    8:astore          6
			Node node2 = node.right;
	//    5   10:aload_1         
	//    6   11:getfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//    7   14:astore          7
			int i;
			if(node1 != null)
	//*   8   16:aload           6
	//*   9   18:ifnull          30
				i = node1.height;
	//   10   21:aload           6
	//   11   23:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
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
	//   19   39:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
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
	//   32   65:getfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//   33   68:astore          6
				Node node4 = node2.right;
	//   34   70:aload           7
	//   35   72:getfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//   36   75:astore          8
				if(node4 != null)
	//*  37   77:aload           8
	//*  38   79:ifnull          91
					i = node4.height;
	//   39   82:aload           8
	//   40   84:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
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
	//   48  100:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
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
	//   66  131:invokespecial   #138 <Method void rotateLeft(LinkedHashTreeMap$Node)>
				} else
	//*  67  134:goto            167
				{
					if(!$assertionsDisabled && i != 1)
	//*  68  137:getstatic       #64  <Field boolean $assertionsDisabled>
	//*  69  140:ifne            156
	//*  70  143:iload_3         
	//*  71  144:iconst_1        
	//*  72  145:icmpeq          156
						throw new AssertionError();
	//   73  148:new             #140 <Class AssertionError>
	//   74  151:dup             
	//   75  152:invokespecial   #141 <Method void AssertionError()>
	//   76  155:athrow          
					rotateRight(node2);
	//   77  156:aload_0         
	//   78  157:aload           7
	//   79  159:invokespecial   #144 <Method void rotateRight(LinkedHashTreeMap$Node)>
					rotateLeft(node);
	//   80  162:aload_0         
	//   81  163:aload_1         
	//   82  164:invokespecial   #138 <Method void rotateLeft(LinkedHashTreeMap$Node)>
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
	//   91  183:getfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//   92  186:astore          7
				Node node5 = node1.right;
	//   93  188:aload           6
	//   94  190:getfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//   95  193:astore          8
				if(node5 != null)
	//*  96  195:aload           8
	//*  97  197:ifnull          209
					i = node5.height;
	//   98  200:aload           8
	//   99  202:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
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
	//  107  218:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
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
	//  125  249:invokespecial   #144 <Method void rotateRight(LinkedHashTreeMap$Node)>
				} else
	//* 126  252:goto            285
				{
					if(!$assertionsDisabled && i != -1)
	//* 127  255:getstatic       #64  <Field boolean $assertionsDisabled>
	//* 128  258:ifne            274
	//* 129  261:iload_3         
	//* 130  262:iconst_m1       
	//* 131  263:icmpeq          274
						throw new AssertionError();
	//  132  266:new             #140 <Class AssertionError>
	//  133  269:dup             
	//  134  270:invokespecial   #141 <Method void AssertionError()>
	//  135  273:athrow          
					rotateLeft(node1);
	//  136  274:aload_0         
	//  137  275:aload           6
	//  138  277:invokespecial   #138 <Method void rotateLeft(LinkedHashTreeMap$Node)>
					rotateRight(node);
	//  139  280:aload_0         
	//  140  281:aload_1         
	//  141  282:invokespecial   #144 <Method void rotateRight(LinkedHashTreeMap$Node)>
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
	//  152  302:putfield        #135 <Field int LinkedHashTreeMap$Node.height>
				if(flag)
	//* 153  305:iload_2         
	//* 154  306:ifeq            353
					return;
	//  155  309:return          
				continue;
			}
			if(!$assertionsDisabled && k != -1 && k != 1)
	//* 156  310:getstatic       #64  <Field boolean $assertionsDisabled>
	//* 157  313:ifne            336
	//* 158  316:iload           5
	//* 159  318:iconst_m1       
	//* 160  319:icmpeq          336
	//* 161  322:iload           5
	//* 162  324:iconst_1        
	//* 163  325:icmpeq          336
				throw new AssertionError();
	//  164  328:new             #140 <Class AssertionError>
	//  165  331:dup             
	//  166  332:invokespecial   #141 <Method void AssertionError()>
	//  167  335:athrow          
			node.height = Math.max(i, j) + 1;
	//  168  336:aload_1         
	//  169  337:iload_3         
	//  170  338:iload           4
	//  171  340:invokestatic    #150 <Method int Math.max(int, int)>
	//  172  343:iconst_1        
	//  173  344:iadd            
	//  174  345:putfield        #135 <Field int LinkedHashTreeMap$Node.height>
			if(!flag)
	//* 175  348:iload_2         
	//* 176  349:ifne            353
				return;
	//  177  352:return          
		}

	//  178  353:aload_1         
	//  179  354:getfield        #153 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
	//  180  357:astore_1        
	//* 181  358:goto            0
	//  182  361:return          
	}

	private void replaceInParent(Node node, Node node1)
	{
		Node node2 = node.parent;
	//    0    0:aload_1         
	//    1    1:getfield        #153 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
	//    2    4:astore          5
		node.parent = null;
	//    3    6:aload_1         
	//    4    7:aconst_null     
	//    5    8:putfield        #153 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		if(node1 != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          21
			node1.parent = node2;
	//    8   15:aload_2         
	//    9   16:aload           5
	//   10   18:putfield        #153 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		if(node2 != null)
	//*  11   21:aload           5
	//*  12   23:ifnull          72
		{
			if(node2.left == node)
	//*  13   26:aload           5
	//*  14   28:getfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//*  15   31:aload_1         
	//*  16   32:if_acmpne       42
			{
				node2.left = node1;
	//   17   35:aload           5
	//   18   37:aload_2         
	//   19   38:putfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
				return;
	//   20   41:return          
			}
			if(!$assertionsDisabled && node2.right != node)
	//*  21   42:getstatic       #64  <Field boolean $assertionsDisabled>
	//*  22   45:ifne            65
	//*  23   48:aload           5
	//*  24   50:getfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//*  25   53:aload_1         
	//*  26   54:if_acmpeq       65
			{
				throw new AssertionError();
	//   27   57:new             #140 <Class AssertionError>
	//   28   60:dup             
	//   29   61:invokespecial   #141 <Method void AssertionError()>
	//   30   64:athrow          
			} else
			{
				node2.right = node1;
	//   31   65:aload           5
	//   32   67:aload_2         
	//   33   68:putfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
				return;
	//   34   71:return          
			}
		} else
		{
			int i = node.hash;
	//   35   72:aload_1         
	//   36   73:getfield        #106 <Field int LinkedHashTreeMap$Node.hash>
	//   37   76:istore_3        
			int j = table.length;
	//   38   77:aload_0         
	//   39   78:getfield        #85  <Field LinkedHashTreeMap$Node[] table>
	//   40   81:arraylength     
	//   41   82:istore          4
			table[i & j - 1] = node1;
	//   42   84:aload_0         
	//   43   85:getfield        #85  <Field LinkedHashTreeMap$Node[] table>
	//   44   88:iload_3         
	//   45   89:iload           4
	//   46   91:iconst_1        
	//   47   92:isub            
	//   48   93:iand            
	//   49   94:aload_2         
	//   50   95:aastore         
			return;
	//   51   96:return          
		}
	}

	private void rotateLeft(Node node)
	{
		Node node1 = node.left;
	//    0    0:aload_1         
	//    1    1:getfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//    2    4:astore          4
		Node node2 = node.right;
	//    3    6:aload_1         
	//    4    7:getfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//    5   10:astore          5
		Node node3 = node2.left;
	//    6   12:aload           5
	//    7   14:getfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//    8   17:astore          6
		Node node4 = node2.right;
	//    9   19:aload           5
	//   10   21:getfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//   11   24:astore          7
		node.right = node3;
	//   12   26:aload_1         
	//   13   27:aload           6
	//   14   29:putfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
		if(node3 != null)
	//*  15   32:aload           6
	//*  16   34:ifnull          43
			node3.parent = node;
	//   17   37:aload           6
	//   18   39:aload_1         
	//   19   40:putfield        #153 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		replaceInParent(node, node2);
	//   20   43:aload_0         
	//   21   44:aload_1         
	//   22   45:aload           5
	//   23   47:invokespecial   #159 <Method void replaceInParent(LinkedHashTreeMap$Node, LinkedHashTreeMap$Node)>
		node2.left = node;
	//   24   50:aload           5
	//   25   52:aload_1         
	//   26   53:putfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
		node.parent = node2;
	//   27   56:aload_1         
	//   28   57:aload           5
	//   29   59:putfield        #153 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		int i;
		if(node1 != null)
	//*  30   62:aload           4
	//*  31   64:ifnull          76
			i = node1.height;
	//   32   67:aload           4
	//   33   69:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
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
	//   41   85:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
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
	//   49   97:invokestatic    #150 <Method int Math.max(int, int)>
	//   50  100:iconst_1        
	//   51  101:iadd            
	//   52  102:putfield        #135 <Field int LinkedHashTreeMap$Node.height>
		j = node.height;
	//   53  105:aload_1         
	//   54  106:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
	//   55  109:istore_3        
		if(node4 != null)
	//*  56  110:aload           7
	//*  57  112:ifnull          124
			i = node4.height;
	//   58  115:aload           7
	//   59  117:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
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
	//   67  130:invokestatic    #150 <Method int Math.max(int, int)>
	//   68  133:iconst_1        
	//   69  134:iadd            
	//   70  135:putfield        #135 <Field int LinkedHashTreeMap$Node.height>
	//   71  138:return          
	}

	private void rotateRight(Node node)
	{
		Node node1 = node.left;
	//    0    0:aload_1         
	//    1    1:getfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//    2    4:astore          4
		Node node2 = node.right;
	//    3    6:aload_1         
	//    4    7:getfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//    5   10:astore          5
		Node node3 = node1.left;
	//    6   12:aload           4
	//    7   14:getfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//    8   17:astore          6
		Node node4 = node1.right;
	//    9   19:aload           4
	//   10   21:getfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//   11   24:astore          7
		node.left = node4;
	//   12   26:aload_1         
	//   13   27:aload           7
	//   14   29:putfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
		if(node4 != null)
	//*  15   32:aload           7
	//*  16   34:ifnull          43
			node4.parent = node;
	//   17   37:aload           7
	//   18   39:aload_1         
	//   19   40:putfield        #153 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		replaceInParent(node, node1);
	//   20   43:aload_0         
	//   21   44:aload_1         
	//   22   45:aload           4
	//   23   47:invokespecial   #159 <Method void replaceInParent(LinkedHashTreeMap$Node, LinkedHashTreeMap$Node)>
		node1.right = node;
	//   24   50:aload           4
	//   25   52:aload_1         
	//   26   53:putfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
		node.parent = node1;
	//   27   56:aload_1         
	//   28   57:aload           4
	//   29   59:putfield        #153 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		int i;
		if(node2 != null)
	//*  30   62:aload           5
	//*  31   64:ifnull          76
			i = node2.height;
	//   32   67:aload           5
	//   33   69:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
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
	//   41   85:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
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
	//   49   97:invokestatic    #150 <Method int Math.max(int, int)>
	//   50  100:iconst_1        
	//   51  101:iadd            
	//   52  102:putfield        #135 <Field int LinkedHashTreeMap$Node.height>
		j = node.height;
	//   53  105:aload_1         
	//   54  106:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
	//   55  109:istore_3        
		if(node3 != null)
	//*  56  110:aload           6
	//*  57  112:ifnull          124
			i = node3.height;
	//   58  115:aload           6
	//   59  117:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
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
	//   67  130:invokestatic    #150 <Method int Math.max(int, int)>
	//   68  133:iconst_1        
	//   69  134:iadd            
	//   70  135:putfield        #135 <Field int LinkedHashTreeMap$Node.height>
	//   71  138:return          
	}

	private static int secondaryHash(int i)
	{
		i ^= i >>> 20 ^ i >>> 12;
	//    0    0:iload_0         
	//    1    1:iload_0         
	//    2    2:bipush          20
	//    3    4:iushr           
	//    4    5:iload_0         
	//    5    6:bipush          12
	//    6    8:iushr           
	//    7    9:ixor            
	//    8   10:ixor            
	//    9   11:istore_0        
		return i >>> 7 ^ i ^ i >>> 4;
	//   10   12:iload_0         
	//   11   13:bipush          7
	//   12   15:iushr           
	//   13   16:iload_0         
	//   14   17:ixor            
	//   15   18:iload_0         
	//   16   19:iconst_4        
	//   17   20:iushr           
	//   18   21:ixor            
	//   19   22:ireturn         
	}

	private Object writeReplace()
		throws ObjectStreamException
	{
		return ((Object) (new LinkedHashMap(((java.util.Map) (this)))));
	//    0    0:new             #168 <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #171 <Method void LinkedHashMap(java.util.Map)>
	//    4    8:areturn         
	}

	public void clear()
	{
		Arrays.fill(((Object []) (table)), ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field LinkedHashTreeMap$Node[] table>
	//    2    4:aconst_null     
	//    3    5:invokestatic    #179 <Method void Arrays.fill(Object[], Object)>
		size = 0;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #76  <Field int size>
		modCount = modCount + 1;
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #78  <Field int modCount>
	//   10   18:iconst_1        
	//   11   19:iadd            
	//   12   20:putfield        #78  <Field int modCount>
		Node node2 = header;
	//   13   23:aload_0         
	//   14   24:getfield        #83  <Field LinkedHashTreeMap$Node header>
	//   15   27:astore_3        
		Node node1;
		for(Node node = node2.next; node != node2; node = node1)
	//*  16   28:aload_3         
	//*  17   29:getfield        #181 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.next>
	//*  18   32:astore_1        
	//*  19   33:aload_1         
	//*  20   34:aload_3         
	//*  21   35:if_acmpeq       58
		{
			node1 = node.next;
	//   22   38:aload_1         
	//   23   39:getfield        #181 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.next>
	//   24   42:astore_2        
			node.prev = null;
	//   25   43:aload_1         
	//   26   44:aconst_null     
	//   27   45:putfield        #184 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.prev>
			node.next = null;
	//   28   48:aload_1         
	//   29   49:aconst_null     
	//   30   50:putfield        #181 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.next>
		}

	//   31   53:aload_2         
	//   32   54:astore_1        
	//*  33   55:goto            33
		node2.prev = node2;
	//   34   58:aload_3         
	//   35   59:aload_3         
	//   36   60:putfield        #184 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.prev>
		node2.next = node2;
	//   37   63:aload_3         
	//   38   64:aload_3         
	//   39   65:putfield        #181 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.next>
	//   40   68:return          
	}

	public boolean containsKey(Object obj)
	{
		return findByObject(obj) != null;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #189 <Method LinkedHashTreeMap$Node findByObject(Object)>
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
	//    1    1:getfield        #192 <Field LinkedHashTreeMap$EntrySet entrySet>
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
	//    7   11:new             #17  <Class LinkedHashTreeMap$EntrySet>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokespecial   #195 <Method void LinkedHashTreeMap$EntrySet(LinkedHashTreeMap)>
	//   11   19:astore_1        
			entrySet = entryset1;
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:putfield        #192 <Field LinkedHashTreeMap$EntrySet entrySet>
			return ((Set) (entryset1));
	//   15   25:aload_1         
	//   16   26:areturn         
		}
	}

	Node find(Object obj, boolean flag)
	{
		Comparator comparator1 = comparator;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Comparator comparator>
	//    2    4:astore          10
		Node anode[] = table;
	//    3    6:aload_0         
	//    4    7:getfield        #85  <Field LinkedHashTreeMap$Node[] table>
	//    5   10:astore          9
		int j = secondaryHash(obj.hashCode());
	//    6   12:aload_1         
	//    7   13:invokevirtual   #202 <Method int Object.hashCode()>
	//    8   16:invokestatic    #204 <Method int secondaryHash(int)>
	//    9   19:istore          4
		int k = j & anode.length - 1;
	//   10   21:iload           4
	//   11   23:aload           9
	//   12   25:arraylength     
	//   13   26:iconst_1        
	//   14   27:isub            
	//   15   28:iand            
	//   16   29:istore          5
		Node node = anode[k];
	//   17   31:aload           9
	//   18   33:iload           5
	//   19   35:aaload          
	//   20   36:astore          6
		int i = 0;
	//   21   38:iconst_0        
	//   22   39:istore_3        
		Node node1 = node;
	//   23   40:aload           6
	//   24   42:astore          7
		if(node != null)
	//*  25   44:aload           6
	//*  26   46:ifnull          151
		{
			Comparable comparable;
			if(comparator1 == NATURAL_ORDER)
	//*  27   49:aload           10
	//*  28   51:getstatic       #69  <Field Comparator NATURAL_ORDER>
	//*  29   54:if_acmpne       66
				comparable = (Comparable)obj;
	//   30   57:aload_1         
	//   31   58:checkcast       #206 <Class Comparable>
	//   32   61:astore          8
			else
	//*  33   63:goto            69
				comparable = null;
	//   34   66:aconst_null     
	//   35   67:astore          8
			do
			{
				if(comparable != null)
	//*  36   69:aload           8
	//*  37   71:ifnull          90
					i = comparable.compareTo(node.key);
	//   38   74:aload           8
	//   39   76:aload           6
	//   40   78:getfield        #210 <Field Object LinkedHashTreeMap$Node.key>
	//   41   81:invokeinterface #214 <Method int Comparable.compareTo(Object)>
	//   42   86:istore_3        
				else
	//*  43   87:goto            104
					i = comparator1.compare(obj, node.key);
	//   44   90:aload           10
	//   45   92:aload_1         
	//   46   93:aload           6
	//   47   95:getfield        #210 <Field Object LinkedHashTreeMap$Node.key>
	//   48   98:invokeinterface #220 <Method int Comparator.compare(Object, Object)>
	//   49  103:istore_3        
				if(i == 0)
	//*  50  104:iload_3         
	//*  51  105:ifne            111
					return node;
	//   52  108:aload           6
	//   53  110:areturn         
				if(i < 0)
	//*  54  111:iload_3         
	//*  55  112:ifge            125
					node1 = node.left;
	//   56  115:aload           6
	//   57  117:getfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//   58  120:astore          7
				else
	//*  59  122:goto            132
					node1 = node.right;
	//   60  125:aload           6
	//   61  127:getfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//   62  130:astore          7
				if(node1 == null)
	//*  63  132:aload           7
	//*  64  134:ifnonnull       144
				{
					node1 = node;
	//   65  137:aload           6
	//   66  139:astore          7
					break;
	//   67  141:goto            151
				}
				node = node1;
	//   68  144:aload           7
	//   69  146:astore          6
			} while(true);
	//   70  148:goto            69
		}
		if(!flag)
	//*  71  151:iload_2         
	//*  72  152:ifne            157
			return null;
	//   73  155:aconst_null     
	//   74  156:areturn         
		node = header;
	//   75  157:aload_0         
	//   76  158:getfield        #83  <Field LinkedHashTreeMap$Node header>
	//   77  161:astore          6
		if(node1 == null)
	//*  78  163:aload           7
	//*  79  165:ifnonnull       245
		{
			if(comparator1 == NATURAL_ORDER && !(obj instanceof Comparable))
	//*  80  168:aload           10
	//*  81  170:getstatic       #69  <Field Comparator NATURAL_ORDER>
	//*  82  173:if_acmpne       216
	//*  83  176:aload_1         
	//*  84  177:instanceof      #206 <Class Comparable>
	//*  85  180:ifne            216
				throw new ClassCastException((new StringBuilder()).append(obj.getClass().getName()).append(" is not Comparable").toString());
	//   86  183:new             #222 <Class ClassCastException>
	//   87  186:dup             
	//   88  187:new             #224 <Class StringBuilder>
	//   89  190:dup             
	//   90  191:invokespecial   #225 <Method void StringBuilder()>
	//   91  194:aload_1         
	//   92  195:invokevirtual   #229 <Method Class Object.getClass()>
	//   93  198:invokevirtual   #233 <Method String Class.getName()>
	//   94  201:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//   95  204:ldc1            #239 <String " is not Comparable">
	//   96  206:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//   97  209:invokevirtual   #242 <Method String StringBuilder.toString()>
	//   98  212:invokespecial   #245 <Method void ClassCastException(String)>
	//   99  215:athrow          
			obj = ((Object) (new Node(node1, obj, j, node, node.prev)));
	//  100  216:new             #30  <Class LinkedHashTreeMap$Node>
	//  101  219:dup             
	//  102  220:aload           7
	//  103  222:aload_1         
	//  104  223:iload           4
	//  105  225:aload           6
	//  106  227:aload           6
	//  107  229:getfield        #184 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.prev>
	//  108  232:invokespecial   #248 <Method void LinkedHashTreeMap$Node(LinkedHashTreeMap$Node, Object, int, LinkedHashTreeMap$Node, LinkedHashTreeMap$Node)>
	//  109  235:astore_1        
			anode[k] = ((Node) (obj));
	//  110  236:aload           9
	//  111  238:iload           5
	//  112  240:aload_1         
	//  113  241:aastore         
		} else
	//* 114  242:goto            291
		{
			obj = ((Object) (new Node(node1, obj, j, node, node.prev)));
	//  115  245:new             #30  <Class LinkedHashTreeMap$Node>
	//  116  248:dup             
	//  117  249:aload           7
	//  118  251:aload_1         
	//  119  252:iload           4
	//  120  254:aload           6
	//  121  256:aload           6
	//  122  258:getfield        #184 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.prev>
	//  123  261:invokespecial   #248 <Method void LinkedHashTreeMap$Node(LinkedHashTreeMap$Node, Object, int, LinkedHashTreeMap$Node, LinkedHashTreeMap$Node)>
	//  124  264:astore_1        
			if(i < 0)
	//* 125  265:iload_3         
	//* 126  266:ifge            278
				node1.left = ((Node) (obj));
	//  127  269:aload           7
	//  128  271:aload_1         
	//  129  272:putfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
			else
	//* 130  275:goto            284
				node1.right = ((Node) (obj));
	//  131  278:aload           7
	//  132  280:aload_1         
	//  133  281:putfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
			rebalance(node1, true);
	//  134  284:aload_0         
	//  135  285:aload           7
	//  136  287:iconst_1        
	//  137  288:invokespecial   #250 <Method void rebalance(LinkedHashTreeMap$Node, boolean)>
		}
		i = size;
	//  138  291:aload_0         
	//  139  292:getfield        #76  <Field int size>
	//  140  295:istore_3        
		size = i + 1;
	//  141  296:aload_0         
	//  142  297:iload_3         
	//  143  298:iconst_1        
	//  144  299:iadd            
	//  145  300:putfield        #76  <Field int size>
		if(i > threshold)
	//* 146  303:iload_3         
	//* 147  304:aload_0         
	//* 148  305:getfield        #87  <Field int threshold>
	//* 149  308:icmple          315
			doubleCapacity();
	//  150  311:aload_0         
	//  151  312:invokespecial   #252 <Method void doubleCapacity()>
		modCount = modCount + 1;
	//  152  315:aload_0         
	//  153  316:aload_0         
	//  154  317:getfield        #78  <Field int modCount>
	//  155  320:iconst_1        
	//  156  321:iadd            
	//  157  322:putfield        #78  <Field int modCount>
		return ((Node) (obj));
	//  158  325:aload_1         
	//  159  326:areturn         
	}

	Node findByEntry(java.util.Map.Entry entry)
	{
		Node node = findByObject(entry.getKey());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #260 <Method Object java.util.Map$Entry.getKey()>
	//    3    7:invokevirtual   #189 <Method LinkedHashTreeMap$Node findByObject(Object)>
	//    4   10:astore_3        
		boolean flag;
		if(node != null && equal(node.value, entry.getValue()))
	//*   5   11:aload_3         
	//*   6   12:ifnull          37
	//*   7   15:aload_0         
	//*   8   16:aload_3         
	//*   9   17:getfield        #263 <Field Object LinkedHashTreeMap$Node.value>
	//*  10   20:aload_1         
	//*  11   21:invokeinterface #266 <Method Object java.util.Map$Entry.getValue()>
	//*  12   26:invokespecial   #268 <Method boolean equal(Object, Object)>
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
	//    5    7:invokevirtual   #271 <Method LinkedHashTreeMap$Node find(Object, boolean)>
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
	//    2    2:invokevirtual   #189 <Method LinkedHashTreeMap$Node findByObject(Object)>
	//    3    5:astore_1        
		if(obj != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          15
			return ((Node) (obj)).value;
	//    6   10:aload_1         
	//    7   11:getfield        #263 <Field Object LinkedHashTreeMap$Node.value>
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
	//    1    1:getfield        #277 <Field LinkedHashTreeMap$KeySet keySet>
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
	//    7   11:new             #22  <Class LinkedHashTreeMap$KeySet>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokespecial   #278 <Method void LinkedHashTreeMap$KeySet(LinkedHashTreeMap)>
	//   11   19:astore_1        
			keySet = keyset1;
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:putfield        #277 <Field LinkedHashTreeMap$KeySet keySet>
			return ((Set) (keyset1));
	//   15   25:aload_1         
	//   16   26:areturn         
		}
	}

	public Object put(Object obj, Object obj1)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			throw new NullPointerException("key == null");
	//    2    4:new             #283 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc2            #285 <String "key == null">
	//    5   11:invokespecial   #286 <Method void NullPointerException(String)>
	//    6   14:athrow          
		} else
		{
			obj = ((Object) (find(obj, true)));
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #271 <Method LinkedHashTreeMap$Node find(Object, boolean)>
	//   11   21:astore_1        
			Object obj2 = ((Node) (obj)).value;
	//   12   22:aload_1         
	//   13   23:getfield        #263 <Field Object LinkedHashTreeMap$Node.value>
	//   14   26:astore_3        
			obj.value = obj1;
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:putfield        #263 <Field Object LinkedHashTreeMap$Node.value>
			return obj2;
	//   18   32:aload_3         
	//   19   33:areturn         
		}
	}

	public Object remove(Object obj)
	{
		obj = ((Object) (removeInternalByKey(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #291 <Method LinkedHashTreeMap$Node removeInternalByKey(Object)>
	//    3    5:astore_1        
		if(obj != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          15
			return ((Node) (obj)).value;
	//    6   10:aload_1         
	//    7   11:getfield        #263 <Field Object LinkedHashTreeMap$Node.value>
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
	//*   1    1:ifeq            36
		{
			node.prev.next = node.next;
	//    2    4:aload_1         
	//    3    5:getfield        #184 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.prev>
	//    4    8:aload_1         
	//    5    9:getfield        #181 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.next>
	//    6   12:putfield        #181 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.next>
			node.next.prev = node.prev;
	//    7   15:aload_1         
	//    8   16:getfield        #181 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.next>
	//    9   19:aload_1         
	//   10   20:getfield        #184 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.prev>
	//   11   23:putfield        #184 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.prev>
			node.prev = null;
	//   12   26:aload_1         
	//   13   27:aconst_null     
	//   14   28:putfield        #184 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.prev>
			node.next = null;
	//   15   31:aload_1         
	//   16   32:aconst_null     
	//   17   33:putfield        #181 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.next>
		}
		Node node1 = node.left;
	//   18   36:aload_1         
	//   19   37:getfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//   20   40:astore          5
		Node node2 = node.right;
	//   21   42:aload_1         
	//   22   43:getfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//   23   46:astore          6
		Node node3 = node.parent;
	//   24   48:aload_1         
	//   25   49:getfield        #153 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
	//   26   52:astore          7
		if(node1 != null && node2 != null)
	//*  27   54:aload           5
	//*  28   56:ifnull          200
	//*  29   59:aload           6
	//*  30   61:ifnull          200
		{
			if(node1.height > node2.height)
	//*  31   64:aload           5
	//*  32   66:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
	//*  33   69:aload           6
	//*  34   71:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
	//*  35   74:icmple          87
				node1 = node1.last();
	//   36   77:aload           5
	//   37   79:invokevirtual   #295 <Method LinkedHashTreeMap$Node LinkedHashTreeMap$Node.last()>
	//   38   82:astore          5
			else
	//*  39   84:goto            94
				node1 = node2.first();
	//   40   87:aload           6
	//   41   89:invokevirtual   #298 <Method LinkedHashTreeMap$Node LinkedHashTreeMap$Node.first()>
	//   42   92:astore          5
			removeInternal(node1, false);
	//   43   94:aload_0         
	//   44   95:aload           5
	//   45   97:iconst_0        
	//   46   98:invokevirtual   #300 <Method void removeInternal(LinkedHashTreeMap$Node, boolean)>
			int i = 0;
	//   47  101:iconst_0        
	//   48  102:istore_3        
			node2 = node.left;
	//   49  103:aload_1         
	//   50  104:getfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//   51  107:astore          6
			if(node2 != null)
	//*  52  109:aload           6
	//*  53  111:ifnull          139
			{
				i = node2.height;
	//   54  114:aload           6
	//   55  116:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
	//   56  119:istore_3        
				node1.left = node2;
	//   57  120:aload           5
	//   58  122:aload           6
	//   59  124:putfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
				node2.parent = node1;
	//   60  127:aload           6
	//   61  129:aload           5
	//   62  131:putfield        #153 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
				node.left = null;
	//   63  134:aload_1         
	//   64  135:aconst_null     
	//   65  136:putfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
			}
			int j = 0;
	//   66  139:iconst_0        
	//   67  140:istore          4
			node2 = node.right;
	//   68  142:aload_1         
	//   69  143:getfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//   70  146:astore          6
			if(node2 != null)
	//*  71  148:aload           6
	//*  72  150:ifnull          179
			{
				j = node2.height;
	//   73  153:aload           6
	//   74  155:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
	//   75  158:istore          4
				node1.right = node2;
	//   76  160:aload           5
	//   77  162:aload           6
	//   78  164:putfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
				node2.parent = node1;
	//   79  167:aload           6
	//   80  169:aload           5
	//   81  171:putfield        #153 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
				node.right = null;
	//   82  174:aload_1         
	//   83  175:aconst_null     
	//   84  176:putfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
			}
			node1.height = Math.max(i, j) + 1;
	//   85  179:aload           5
	//   86  181:iload_3         
	//   87  182:iload           4
	//   88  184:invokestatic    #150 <Method int Math.max(int, int)>
	//   89  187:iconst_1        
	//   90  188:iadd            
	//   91  189:putfield        #135 <Field int LinkedHashTreeMap$Node.height>
			replaceInParent(node, node1);
	//   92  192:aload_0         
	//   93  193:aload_1         
	//   94  194:aload           5
	//   95  196:invokespecial   #159 <Method void replaceInParent(LinkedHashTreeMap$Node, LinkedHashTreeMap$Node)>
			return;
	//   96  199:return          
		}
		if(node1 != null)
	//*  97  200:aload           5
	//*  98  202:ifnull          220
		{
			replaceInParent(node, node1);
	//   99  205:aload_0         
	//  100  206:aload_1         
	//  101  207:aload           5
	//  102  209:invokespecial   #159 <Method void replaceInParent(LinkedHashTreeMap$Node, LinkedHashTreeMap$Node)>
			node.left = null;
	//  103  212:aload_1         
	//  104  213:aconst_null     
	//  105  214:putfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
		} else
	//* 106  217:goto            246
		if(node2 != null)
	//* 107  220:aload           6
	//* 108  222:ifnull          240
		{
			replaceInParent(node, node2);
	//  109  225:aload_0         
	//  110  226:aload_1         
	//  111  227:aload           6
	//  112  229:invokespecial   #159 <Method void replaceInParent(LinkedHashTreeMap$Node, LinkedHashTreeMap$Node)>
			node.right = null;
	//  113  232:aload_1         
	//  114  233:aconst_null     
	//  115  234:putfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
		} else
	//* 116  237:goto            246
		{
			replaceInParent(node, ((Node) (null)));
	//  117  240:aload_0         
	//  118  241:aload_1         
	//  119  242:aconst_null     
	//  120  243:invokespecial   #159 <Method void replaceInParent(LinkedHashTreeMap$Node, LinkedHashTreeMap$Node)>
		}
		rebalance(node3, false);
	//  121  246:aload_0         
	//  122  247:aload           7
	//  123  249:iconst_0        
	//  124  250:invokespecial   #250 <Method void rebalance(LinkedHashTreeMap$Node, boolean)>
		size = size - 1;
	//  125  253:aload_0         
	//  126  254:aload_0         
	//  127  255:getfield        #76  <Field int size>
	//  128  258:iconst_1        
	//  129  259:isub            
	//  130  260:putfield        #76  <Field int size>
		modCount = modCount + 1;
	//  131  263:aload_0         
	//  132  264:aload_0         
	//  133  265:getfield        #78  <Field int modCount>
	//  134  268:iconst_1        
	//  135  269:iadd            
	//  136  270:putfield        #78  <Field int modCount>
	//  137  273:return          
	}

	Node removeInternalByKey(Object obj)
	{
		obj = ((Object) (findByObject(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #189 <Method LinkedHashTreeMap$Node findByObject(Object)>
	//    3    5:astore_1        
		if(obj != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          16
			removeInternal(((Node) (obj)), true);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:iconst_1        
	//    9   13:invokevirtual   #300 <Method void removeInternal(LinkedHashTreeMap$Node, boolean)>
		return ((Node) (obj));
	//   10   16:aload_1         
	//   11   17:areturn         
	}

	public int size()
	{
		return size;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field int size>
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
	int size;
	Node table[];
	int threshold;

	static 
	{
		boolean flag;
		if(!((Class) (com/google/gson/internal/LinkedHashTreeMap)).desiredAssertionStatus())
	//*   0    0:ldc1            #2   <Class LinkedHashTreeMap>
	//*   1    2:invokevirtual   #62  <Method boolean Class.desiredAssertionStatus()>
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
	//    9   16:putstatic       #64  <Field boolean $assertionsDisabled>
	//   10   19:new             #9   <Class LinkedHashTreeMap$1>
	//   11   22:dup             
	//   12   23:invokespecial   #67  <Method void LinkedHashTreeMap$1()>
	//   13   26:putstatic       #69  <Field Comparator NATURAL_ORDER>
	//*  14   29:return          
	}
}
