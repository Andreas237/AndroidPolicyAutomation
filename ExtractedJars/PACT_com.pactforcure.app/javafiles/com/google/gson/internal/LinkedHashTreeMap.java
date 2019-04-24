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
			int i = 4;
		//   77  135:iconst_4        
		//   78  136:istore_2        
			while((size & i - 1) == i - 1) 
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
		//*  91  155:ifne            227
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
				} else
		//* 126  220:iload_2         
		//* 127  221:iconst_2        
		//* 128  222:imul            
		//* 129  223:istore_2        
		//* 130  224:goto            137
				if(leavesSkipped == 1)
		//* 131  227:aload_0         
		//* 132  228:getfield        #42  <Field int leavesSkipped>
		//* 133  231:iconst_1        
		//* 134  232:icmpne          278
				{
					node = stack;
		//  135  235:aload_0         
		//  136  236:getfield        #44  <Field LinkedHashTreeMap$Node stack>
		//  137  239:astore_1        
					Node node2 = node.parent;
		//  138  240:aload_1         
		//  139  241:getfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		//  140  244:astore_3        
					stack = node2;
		//  141  245:aload_0         
		//  142  246:aload_3         
		//  143  247:putfield        #44  <Field LinkedHashTreeMap$Node stack>
					node2.right = node;
		//  144  250:aload_3         
		//  145  251:aload_1         
		//  146  252:putfield        #27  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
					node2.height = node.height + 1;
		//  147  255:aload_3         
		//  148  256:aload_1         
		//  149  257:getfield        #36  <Field int LinkedHashTreeMap$Node.height>
		//  150  260:iconst_1        
		//  151  261:iadd            
		//  152  262:putfield        #36  <Field int LinkedHashTreeMap$Node.height>
					node.parent = node2;
		//  153  265:aload_1         
		//  154  266:aload_3         
		//  155  267:putfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
					leavesSkipped = 0;
		//  156  270:aload_0         
		//  157  271:iconst_0        
		//  158  272:putfield        #42  <Field int leavesSkipped>
				} else
		//* 159  275:goto            220
				if(leavesSkipped == 2)
		//* 160  278:aload_0         
		//* 161  279:getfield        #42  <Field int leavesSkipped>
		//* 162  282:iconst_2        
		//* 163  283:icmpne          220
					leavesSkipped = 0;
		//  164  286:aload_0         
		//  165  287:iconst_0        
		//  166  288:putfield        #42  <Field int leavesSkipped>
				i *= 2;
			}
		//* 167  291:goto            220
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
			//    6   10:aconst_null     
			//    7   11:invokespecial   #26  <Method void LinkedHashTreeMap$LinkedTreeMapIterator(LinkedHashTreeMap, LinkedHashTreeMap$1)>
			//    8   14:return          
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
			if(obj instanceof java.util.Map.Entry)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #27  <Class java.util.Map$Entry>
		//*   2    4:ifne            9
		//*   3    7:iconst_0        
		//*   4    8:ireturn         
		//*   5    9:aload_0         
		//*   6   10:getfield        #16  <Field LinkedHashTreeMap this$0>
		//*   7   13:aload_1         
		//*   8   14:checkcast       #27  <Class java.util.Map$Entry>
		//*   9   17:invokevirtual   #31  <Method LinkedHashTreeMap$Node LinkedHashTreeMap.findByEntry(java.util.Map$Entry)>
		//*  10   20:astore_1        
				if((obj = ((Object) (findByEntry((java.util.Map.Entry)obj)))) != null)
		//*  11   21:aload_1         
		//*  12   22:ifnull          7
				{
					removeInternal(((Node) (obj)), true);
		//   13   25:aload_0         
		//   14   26:getfield        #16  <Field LinkedHashTreeMap this$0>
		//   15   29:aload_1         
		//   16   30:iconst_1        
		//   17   31:invokevirtual   #43  <Method void LinkedHashTreeMap.removeInternal(LinkedHashTreeMap$Node, boolean)>
					return true;
		//   18   34:iconst_1        
		//   19   35:ireturn         
				}
			return false;
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
			//    6   10:aconst_null     
			//    7   11:invokespecial   #26  <Method void LinkedHashTreeMap$LinkedTreeMapIterator(LinkedHashTreeMap, LinkedHashTreeMap$1)>
			//    8   14:return          
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

	private abstract class LinkedTreeMapIterator
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
		//    8   16:new             #50  <Class NoSuchElementException>
		//    9   19:dup             
		//   10   20:invokespecial   #51  <Method void NoSuchElementException()>
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
		//   18   38:new             #53  <Class ConcurrentModificationException>
		//   19   41:dup             
		//   20   42:invokespecial   #54  <Method void ConcurrentModificationException()>
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
		//    3    7:new             #59  <Class IllegalStateException>
		//    4   10:dup             
		//    5   11:invokespecial   #60  <Method void IllegalStateException()>
		//    6   14:athrow          
			} else
			{
				removeInternal(lastReturned, true);
		//    7   15:aload_0         
		//    8   16:getfield        #22  <Field LinkedHashTreeMap this$0>
		//    9   19:aload_0         
		//   10   20:getfield        #35  <Field LinkedHashTreeMap$Node lastReturned>
		//   11   23:iconst_1        
		//   12   24:invokevirtual   #64  <Method void LinkedHashTreeMap.removeInternal(LinkedHashTreeMap$Node, boolean)>
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

		private LinkedTreeMapIterator()
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

		public Node first()
		{
			Node node1 = this;
		//    0    0:aload_0         
		//    1    1:astore_2        
			for(Node node = node1.left; node != null; node = node1.left)
		//*   2    2:aload_2         
		//*   3    3:getfield        #62  <Field LinkedHashTreeMap$Node left>
		//*   4    6:astore_1        
		//*   5    7:aload_1         
		//*   6    8:ifnull          21
				node1 = node;
		//    7   11:aload_1         
		//    8   12:astore_2        

		//    9   13:aload_2         
		//   10   14:getfield        #62  <Field LinkedHashTreeMap$Node left>
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

		public Node last()
		{
			Node node1 = this;
		//    0    0:aload_0         
		//    1    1:astore_2        
			for(Node node = node1.right; node != null; node = node1.right)
		//*   2    2:aload_2         
		//*   3    3:getfield        #72  <Field LinkedHashTreeMap$Node right>
		//*   4    6:astore_1        
		//*   5    7:aload_1         
		//*   6    8:ifnull          21
				node1 = node;
		//    7   11:aload_1         
		//    8   12:astore_2        

		//    9   13:aload_2         
		//   10   14:getfield        #72  <Field LinkedHashTreeMap$Node right>
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
	//*   9   15:ifnull          63
	//*  10   18:aload_0         
	//*  11   19:aload_1         
	//*  12   20:putfield        #80  <Field Comparator comparator>
	//*  13   23:aload_0         
	//*  14   24:new             #30  <Class LinkedHashTreeMap$Node>
	//*  15   27:dup             
	//*  16   28:invokespecial   #81  <Method void LinkedHashTreeMap$Node()>
	//*  17   31:putfield        #83  <Field LinkedHashTreeMap$Node header>
	//*  18   34:aload_0         
	//*  19   35:bipush          16
	//*  20   37:anewarray       Node[]
	//*  21   40:putfield        #85  <Field LinkedHashTreeMap$Node[] table>
	//*  22   43:aload_0         
	//*  23   44:aload_0         
	//*  24   45:getfield        #85  <Field LinkedHashTreeMap$Node[] table>
	//*  25   48:arraylength     
	//*  26   49:iconst_2        
	//*  27   50:idiv            
	//*  28   51:aload_0         
	//*  29   52:getfield        #85  <Field LinkedHashTreeMap$Node[] table>
	//*  30   55:arraylength     
	//*  31   56:iconst_4        
	//*  32   57:idiv            
	//*  33   58:iadd            
	//*  34   59:putfield        #87  <Field int threshold>
	//*  35   62:return          
			comparator1 = NATURAL_ORDER;
	//   36   63:getstatic       #69  <Field Comparator NATURAL_ORDER>
	//   37   66:astore_1        
		comparator = comparator1;
		header = new Node();
		table = new Node[16];
		threshold = table.length / 2 + table.length / 4;
	//*  38   67:goto            18
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
		int i = 0;
	//   20   40:iconst_0        
	//   21   41:istore_1        
		while(i < l) 
	//*  22   42:iload_1         
	//*  23   43:iload           4
	//*  24   45:icmpge          227
		{
			Node node = anode[i];
	//   25   48:aload_0         
	//   26   49:iload_1         
	//   27   50:aaload          
	//   28   51:astore          5
			if(node != null)
	//*  29   53:aload           5
	//*  30   55:ifnonnull       65
	//*  31   58:iload_1         
	//*  32   59:iconst_1        
	//*  33   60:iadd            
	//*  34   61:istore_1        
	//*  35   62:goto            42
			{
				avliterator.reset(node);
	//   36   65:aload           7
	//   37   67:aload           5
	//   38   69:invokevirtual   #99  <Method void LinkedHashTreeMap$AvlIterator.reset(LinkedHashTreeMap$Node)>
				int k = 0;
	//   39   72:iconst_0        
	//   40   73:istore_3        
				int j = 0;
	//   41   74:iconst_0        
	//   42   75:istore_2        
				do
				{
					Node node1 = avliterator.next();
	//   43   76:aload           7
	//   44   78:invokevirtual   #103 <Method LinkedHashTreeMap$Node LinkedHashTreeMap$AvlIterator.next()>
	//   45   81:astore          10
					if(node1 == null)
						break;
	//   46   83:aload           10
	//   47   85:ifnull          113
					if((node1.hash & l) == 0)
	//*  48   88:aload           10
	//*  49   90:getfield        #106 <Field int LinkedHashTreeMap$Node.hash>
	//*  50   93:iload           4
	//*  51   95:iand            
	//*  52   96:ifne            106
						k++;
	//   53   99:iload_3         
	//   54  100:iconst_1        
	//   55  101:iadd            
	//   56  102:istore_3        
					else
	//*  57  103:goto            76
						j++;
	//   58  106:iload_2         
	//   59  107:iconst_1        
	//   60  108:iadd            
	//   61  109:istore_2        
				} while(true);
	//   62  110:goto            76
				avlbuilder.reset(k);
	//   63  113:aload           8
	//   64  115:iload_3         
	//   65  116:invokevirtual   #109 <Method void LinkedHashTreeMap$AvlBuilder.reset(int)>
				avlbuilder1.reset(j);
	//   66  119:aload           9
	//   67  121:iload_2         
	//   68  122:invokevirtual   #109 <Method void LinkedHashTreeMap$AvlBuilder.reset(int)>
				avliterator.reset(node);
	//   69  125:aload           7
	//   70  127:aload           5
	//   71  129:invokevirtual   #99  <Method void LinkedHashTreeMap$AvlIterator.reset(LinkedHashTreeMap$Node)>
				do
				{
					node = avliterator.next();
	//   72  132:aload           7
	//   73  134:invokevirtual   #103 <Method LinkedHashTreeMap$Node LinkedHashTreeMap$AvlIterator.next()>
	//   74  137:astore          5
					if(node == null)
						break;
	//   75  139:aload           5
	//   76  141:ifnull          175
					if((node.hash & l) == 0)
	//*  77  144:aload           5
	//*  78  146:getfield        #106 <Field int LinkedHashTreeMap$Node.hash>
	//*  79  149:iload           4
	//*  80  151:iand            
	//*  81  152:ifne            165
						avlbuilder.add(node);
	//   82  155:aload           8
	//   83  157:aload           5
	//   84  159:invokevirtual   #112 <Method void LinkedHashTreeMap$AvlBuilder.add(LinkedHashTreeMap$Node)>
					else
	//*  85  162:goto            132
						avlbuilder1.add(node);
	//   86  165:aload           9
	//   87  167:aload           5
	//   88  169:invokevirtual   #112 <Method void LinkedHashTreeMap$AvlBuilder.add(LinkedHashTreeMap$Node)>
				} while(true);
	//   89  172:goto            132
				if(k > 0)
	//*  90  175:iload_3         
	//*  91  176:ifle            215
					node = avlbuilder.root();
	//   92  179:aload           8
	//   93  181:invokevirtual   #115 <Method LinkedHashTreeMap$Node LinkedHashTreeMap$AvlBuilder.root()>
	//   94  184:astore          5
				else
	//*  95  186:aload           6
	//*  96  188:iload_1         
	//*  97  189:aload           5
	//*  98  191:aastore         
	//*  99  192:iload_2         
	//* 100  193:ifle            221
	//* 101  196:aload           9
	//* 102  198:invokevirtual   #115 <Method LinkedHashTreeMap$Node LinkedHashTreeMap$AvlBuilder.root()>
	//* 103  201:astore          5
	//* 104  203:aload           6
	//* 105  205:iload_1         
	//* 106  206:iload           4
	//* 107  208:iadd            
	//* 108  209:aload           5
	//* 109  211:aastore         
	//* 110  212:goto            58
					node = null;
	//  111  215:aconst_null     
	//  112  216:astore          5
				anode1[i] = node;
				if(j > 0)
					node = avlbuilder1.root();
				else
	//* 113  218:goto            186
					node = null;
	//  114  221:aconst_null     
	//  115  222:astore          5
				anode1[i + l] = node;
			}
			i++;
		}
	//* 116  224:goto            203
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
	//    3    5:getfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//    4    8:astore          6
		node2 = node.right;
	//    5   10:aload_1         
	//    6   11:getfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//    7   14:astore          7
		Node node4;
		if(node1 != null)
	//*   8   16:aload           6
	//*   9   18:ifnull          117
			i = node1.height;
	//   10   21:aload           6
	//   11   23:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
	//   12   26:istore_3        
		else
	//*  13   27:aload           7
	//*  14   29:ifnull          122
	//*  15   32:aload           7
	//*  16   34:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
	//*  17   37:istore          4
	//*  18   39:iload_3         
	//*  19   40:iload           4
	//*  20   42:isub            
	//*  21   43:istore          5
	//*  22   45:iload           5
	//*  23   47:bipush          -2
	//*  24   49:icmpne          172
	//*  25   52:aload           7
	//*  26   54:getfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//*  27   57:astore          6
	//*  28   59:aload           7
	//*  29   61:getfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//*  30   64:astore          8
	//*  31   66:aload           8
	//*  32   68:ifnull          128
	//*  33   71:aload           8
	//*  34   73:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
	//*  35   76:istore_3        
	//*  36   77:aload           6
	//*  37   79:ifnull          133
	//*  38   82:aload           6
	//*  39   84:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
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
	//*  54  109:invokespecial   #138 <Method void rotateLeft(LinkedHashTreeMap$Node)>
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
	//*  70  139:getstatic       #64  <Field boolean $assertionsDisabled>
	//*  71  142:ifne            158
	//*  72  145:iload_3         
	//*  73  146:iconst_1        
	//*  74  147:icmpeq          158
				throw new AssertionError();
	//   75  150:new             #140 <Class AssertionError>
	//   76  153:dup             
	//   77  154:invokespecial   #141 <Method void AssertionError()>
	//   78  157:athrow          
			rotateRight(node2);
	//   79  158:aload_0         
	//   80  159:aload           7
	//   81  161:invokespecial   #144 <Method void rotateRight(LinkedHashTreeMap$Node)>
			rotateLeft(node);
	//   82  164:aload_0         
	//   83  165:aload_1         
	//   84  166:invokespecial   #138 <Method void rotateLeft(LinkedHashTreeMap$Node)>
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
	//   90  180:getfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//   91  183:astore          7
		Node node5 = node1.right;
	//   92  185:aload           6
	//   93  187:getfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//   94  190:astore          8
		if(node5 != null)
	//*  95  192:aload           8
	//*  96  194:ifnull          250
			i = node5.height;
	//   97  197:aload           8
	//   98  199:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
	//   99  202:istore_3        
		else
	//* 100  203:aload           7
	//* 101  205:ifnull          255
	//* 102  208:aload           7
	//* 103  210:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
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
	//* 118  235:invokespecial   #144 <Method void rotateRight(LinkedHashTreeMap$Node)>
	//* 119  238:iload_2         
	//* 120  239:ifne            116
	//* 121  242:aload_1         
	//* 122  243:getfield        #147 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
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
	//* 131  261:getstatic       #64  <Field boolean $assertionsDisabled>
	//* 132  264:ifne            280
	//* 133  267:iload_3         
	//* 134  268:iconst_m1       
	//* 135  269:icmpeq          280
				throw new AssertionError();
	//  136  272:new             #140 <Class AssertionError>
	//  137  275:dup             
	//  138  276:invokespecial   #141 <Method void AssertionError()>
	//  139  279:athrow          
			rotateLeft(node1);
	//  140  280:aload_0         
	//  141  281:aload           6
	//  142  283:invokespecial   #138 <Method void rotateLeft(LinkedHashTreeMap$Node)>
			rotateRight(node);
	//  143  286:aload_0         
	//  144  287:aload_1         
	//  145  288:invokespecial   #144 <Method void rotateRight(LinkedHashTreeMap$Node)>
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
	//  153  303:putfield        #135 <Field int LinkedHashTreeMap$Node.height>
		if(flag)
	//* 154  306:iload_2         
	//* 155  307:ifeq            242
			return;
	//  156  310:return          
		if(true) goto _L5; else goto _L8
_L8:
		if(!$assertionsDisabled && k != -1 && k != 1)
	//* 157  311:getstatic       #64  <Field boolean $assertionsDisabled>
	//* 158  314:ifne            337
	//* 159  317:iload           5
	//* 160  319:iconst_m1       
	//* 161  320:icmpeq          337
	//* 162  323:iload           5
	//* 163  325:iconst_1        
	//* 164  326:icmpeq          337
			throw new AssertionError();
	//  165  329:new             #140 <Class AssertionError>
	//  166  332:dup             
	//  167  333:invokespecial   #141 <Method void AssertionError()>
	//  168  336:athrow          
		node.height = Math.max(i, j) + 1;
	//  169  337:aload_1         
	//  170  338:iload_3         
	//  171  339:iload           4
	//  172  341:invokestatic    #153 <Method int Math.max(int, int)>
	//  173  344:iconst_1        
	//  174  345:iadd            
	//  175  346:putfield        #135 <Field int LinkedHashTreeMap$Node.height>
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
	//    1    1:getfield        #147 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
	//    2    4:astore          5
		node.parent = null;
	//    3    6:aload_1         
	//    4    7:aconst_null     
	//    5    8:putfield        #147 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		if(node1 != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          21
			node1.parent = node2;
	//    8   15:aload_2         
	//    9   16:aload           5
	//   10   18:putfield        #147 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
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
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		Node node1 = node.left;
	//    2    3:aload_1         
	//    3    4:getfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//    4    7:astore          5
		Node node2 = node.right;
	//    5    9:aload_1         
	//    6   10:getfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//    7   13:astore          6
		Node node3 = node2.left;
	//    8   15:aload           6
	//    9   17:getfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//   10   20:astore          7
		Node node4 = node2.right;
	//   11   22:aload           6
	//   12   24:getfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//   13   27:astore          8
		node.right = node3;
	//   14   29:aload_1         
	//   15   30:aload           7
	//   16   32:putfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
		if(node3 != null)
	//*  17   35:aload           7
	//*  18   37:ifnull          46
			node3.parent = node;
	//   19   40:aload           7
	//   20   42:aload_1         
	//   21   43:putfield        #147 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		replaceInParent(node, node2);
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:aload           6
	//   25   50:invokespecial   #159 <Method void replaceInParent(LinkedHashTreeMap$Node, LinkedHashTreeMap$Node)>
		node2.left = node;
	//   26   53:aload           6
	//   27   55:aload_1         
	//   28   56:putfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
		node.parent = node2;
	//   29   59:aload_1         
	//   30   60:aload           6
	//   31   62:putfield        #147 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		int i;
		int j;
		if(node1 != null)
	//*  32   65:aload           5
	//*  33   67:ifnull          130
			i = node1.height;
	//   34   70:aload           5
	//   35   72:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
	//   36   75:istore_2        
		else
	//*  37   76:aload           7
	//*  38   78:ifnull          135
	//*  39   81:aload           7
	//*  40   83:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
	//*  41   86:istore_3        
	//*  42   87:aload_1         
	//*  43   88:iload_2         
	//*  44   89:iload_3         
	//*  45   90:invokestatic    #153 <Method int Math.max(int, int)>
	//*  46   93:iconst_1        
	//*  47   94:iadd            
	//*  48   95:putfield        #135 <Field int LinkedHashTreeMap$Node.height>
	//*  49   98:aload_1         
	//*  50   99:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
	//*  51  102:istore_3        
	//*  52  103:iload           4
	//*  53  105:istore_2        
	//*  54  106:aload           8
	//*  55  108:ifnull          117
	//*  56  111:aload           8
	//*  57  113:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
	//*  58  116:istore_2        
	//*  59  117:aload           6
	//*  60  119:iload_3         
	//*  61  120:iload_2         
	//*  62  121:invokestatic    #153 <Method int Math.max(int, int)>
	//*  63  124:iconst_1        
	//*  64  125:iadd            
	//*  65  126:putfield        #135 <Field int LinkedHashTreeMap$Node.height>
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
	//    3    4:getfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//    4    7:astore          5
		Node node2 = node.right;
	//    5    9:aload_1         
	//    6   10:getfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//    7   13:astore          6
		Node node3 = node1.left;
	//    8   15:aload           5
	//    9   17:getfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//   10   20:astore          7
		Node node4 = node1.right;
	//   11   22:aload           5
	//   12   24:getfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//   13   27:astore          8
		node.left = node4;
	//   14   29:aload_1         
	//   15   30:aload           8
	//   16   32:putfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
		if(node4 != null)
	//*  17   35:aload           8
	//*  18   37:ifnull          46
			node4.parent = node;
	//   19   40:aload           8
	//   20   42:aload_1         
	//   21   43:putfield        #147 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		replaceInParent(node, node1);
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:aload           5
	//   25   50:invokespecial   #159 <Method void replaceInParent(LinkedHashTreeMap$Node, LinkedHashTreeMap$Node)>
		node1.right = node;
	//   26   53:aload           5
	//   27   55:aload_1         
	//   28   56:putfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
		node.parent = node1;
	//   29   59:aload_1         
	//   30   60:aload           5
	//   31   62:putfield        #147 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		int i;
		int j;
		if(node2 != null)
	//*  32   65:aload           6
	//*  33   67:ifnull          130
			i = node2.height;
	//   34   70:aload           6
	//   35   72:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
	//   36   75:istore_2        
		else
	//*  37   76:aload           8
	//*  38   78:ifnull          135
	//*  39   81:aload           8
	//*  40   83:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
	//*  41   86:istore_3        
	//*  42   87:aload_1         
	//*  43   88:iload_2         
	//*  44   89:iload_3         
	//*  45   90:invokestatic    #153 <Method int Math.max(int, int)>
	//*  46   93:iconst_1        
	//*  47   94:iadd            
	//*  48   95:putfield        #135 <Field int LinkedHashTreeMap$Node.height>
	//*  49   98:aload_1         
	//*  50   99:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
	//*  51  102:istore_3        
	//*  52  103:iload           4
	//*  53  105:istore_2        
	//*  54  106:aload           7
	//*  55  108:ifnull          117
	//*  56  111:aload           7
	//*  57  113:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
	//*  58  116:istore_2        
	//*  59  117:aload           5
	//*  60  119:iload_3         
	//*  61  120:iload_2         
	//*  62  121:invokestatic    #153 <Method int Math.max(int, int)>
	//*  63  124:iconst_1        
	//*  64  125:iadd            
	//*  65  126:putfield        #135 <Field int LinkedHashTreeMap$Node.height>
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
		int i;
		int j;
		int k;
		Node node;
		Node node1;
		Object obj1;
		Node anode[];
		Comparator comparator1;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          9
		comparator1 = comparator;
	//    2    3:aload_0         
	//    3    4:getfield        #80  <Field Comparator comparator>
	//    4    7:astore          11
		anode = table;
	//    5    9:aload_0         
	//    6   10:getfield        #85  <Field LinkedHashTreeMap$Node[] table>
	//    7   13:astore          10
		j = secondaryHash(obj.hashCode());
	//    8   15:aload_1         
	//    9   16:invokevirtual   #202 <Method int Object.hashCode()>
	//   10   19:invokestatic    #204 <Method int secondaryHash(int)>
	//   11   22:istore          4
		k = j & anode.length - 1;
	//   12   24:iload           4
	//   13   26:aload           10
	//   14   28:arraylength     
	//   15   29:iconst_1        
	//   16   30:isub            
	//   17   31:iand            
	//   18   32:istore          5
		node = anode[k];
	//   19   34:aload           10
	//   20   36:iload           5
	//   21   38:aaload          
	//   22   39:astore          6
		i = 0;
	//   23   41:iconst_0        
	//   24   42:istore_3        
		node1 = node;
	//   25   43:aload           6
	//   26   45:astore          7
		if(node == null) goto _L2; else goto _L1
	//   27   47:aload           6
	//   28   49:ifnull          134
_L1:
		Comparable comparable;
		if(comparator1 == NATURAL_ORDER)
	//*  29   52:aload           11
	//*  30   54:getstatic       #69  <Field Comparator NATURAL_ORDER>
	//*  31   57:if_acmpne       91
			comparable = (Comparable)obj;
	//   32   60:aload_1         
	//   33   61:checkcast       #206 <Class Comparable>
	//   34   64:astore          8
		else
	//*  35   66:aload           8
	//*  36   68:ifnull          97
	//*  37   71:aload           8
	//*  38   73:aload           6
	//*  39   75:getfield        #210 <Field Object LinkedHashTreeMap$Node.key>
	//*  40   78:invokeinterface #214 <Method int Comparable.compareTo(Object)>
	//*  41   83:istore_3        
	//*  42   84:iload_3         
	//*  43   85:ifne            114
	//*  44   88:aload           6
	//*  45   90:areturn         
			comparable = null;
	//   46   91:aconst_null     
	//   47   92:astore          8
_L9:
		if(comparable != null)
			i = comparable.compareTo(node.key);
		else
	//*  48   94:goto            66
			i = comparator1.compare(obj, node.key);
	//   49   97:aload           11
	//   50   99:aload_1         
	//   51  100:aload           6
	//   52  102:getfield        #210 <Field Object LinkedHashTreeMap$Node.key>
	//   53  105:invokeinterface #220 <Method int Comparator.compare(Object, Object)>
	//   54  110:istore_3        
		if(i != 0) goto _L4; else goto _L3
_L3:
		return node;
	//*  55  111:goto            84
_L4:
		if(i < 0)
	//*  56  114:iload_3         
	//*  57  115:ifge            201
			node1 = node.left;
	//   58  118:aload           6
	//   59  120:getfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//   60  123:astore          7
		else
	//*  61  125:aload           7
	//*  62  127:ifnonnull       211
	//*  63  130:aload           6
	//*  64  132:astore          7
	//*  65  134:aload           9
	//*  66  136:astore          6
	//*  67  138:iload_2         
	//*  68  139:ifeq            88
	//*  69  142:aload_0         
	//*  70  143:getfield        #83  <Field LinkedHashTreeMap$Node header>
	//*  71  146:astore          6
	//*  72  148:aload           7
	//*  73  150:ifnonnull       280
	//*  74  153:aload           11
	//*  75  155:getstatic       #69  <Field Comparator NATURAL_ORDER>
	//*  76  158:if_acmpne       218
	//*  77  161:aload_1         
	//*  78  162:instanceof      #206 <Class Comparable>
	//*  79  165:ifne            218
	//*  80  168:new             #222 <Class ClassCastException>
	//*  81  171:dup             
	//*  82  172:new             #224 <Class StringBuilder>
	//*  83  175:dup             
	//*  84  176:invokespecial   #225 <Method void StringBuilder()>
	//*  85  179:aload_1         
	//*  86  180:invokevirtual   #229 <Method Class Object.getClass()>
	//*  87  183:invokevirtual   #233 <Method String Class.getName()>
	//*  88  186:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//*  89  189:ldc1            #239 <String " is not Comparable">
	//*  90  191:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//*  91  194:invokevirtual   #242 <Method String StringBuilder.toString()>
	//*  92  197:invokespecial   #245 <Method void ClassCastException(String)>
	//*  93  200:athrow          
			node1 = node.right;
	//   94  201:aload           6
	//   95  203:getfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//   96  206:astore          7
		if(node1 != null) goto _L6; else goto _L5
_L5:
		node1 = node;
_L2:
		node = ((Node) (obj1));
		if(!flag) goto _L3; else goto _L7
	//*  97  208:goto            125
_L6:
		node = node1;
	//   98  211:aload           7
	//   99  213:astore          6
		if(true) goto _L9; else goto _L8
	//  100  215:goto            66
_L7:
		node = header;
		if(node1 != null)
			break; /* Loop/switch isn't completed */
		if(comparator1 == NATURAL_ORDER && !(obj instanceof Comparable))
			throw new ClassCastException((new StringBuilder()).append(obj.getClass().getName()).append(" is not Comparable").toString());
		obj = ((Object) (new Node(node1, obj, j, node, node.prev)));
	//  101  218:new             #30  <Class LinkedHashTreeMap$Node>
	//  102  221:dup             
	//  103  222:aload           7
	//  104  224:aload_1         
	//  105  225:iload           4
	//  106  227:aload           6
	//  107  229:aload           6
	//  108  231:getfield        #184 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.prev>
	//  109  234:invokespecial   #248 <Method void LinkedHashTreeMap$Node(LinkedHashTreeMap$Node, Object, int, LinkedHashTreeMap$Node, LinkedHashTreeMap$Node)>
	//  110  237:astore_1        
		anode[k] = ((Node) (obj));
	//  111  238:aload           10
	//  112  240:iload           5
	//  113  242:aload_1         
	//  114  243:aastore         
_L11:
		i = size;
	//  115  244:aload_0         
	//  116  245:getfield        #76  <Field int size>
	//  117  248:istore_3        
		size = i + 1;
	//  118  249:aload_0         
	//  119  250:iload_3         
	//  120  251:iconst_1        
	//  121  252:iadd            
	//  122  253:putfield        #76  <Field int size>
		if(i > threshold)
	//* 123  256:iload_3         
	//* 124  257:aload_0         
	//* 125  258:getfield        #87  <Field int threshold>
	//* 126  261:icmple          268
			doubleCapacity();
	//  127  264:aload_0         
	//  128  265:invokespecial   #250 <Method void doubleCapacity()>
		modCount = modCount + 1;
	//  129  268:aload_0         
	//  130  269:aload_0         
	//  131  270:getfield        #78  <Field int modCount>
	//  132  273:iconst_1        
	//  133  274:iadd            
	//  134  275:putfield        #78  <Field int modCount>
		return ((Node) (obj));
	//  135  278:aload_1         
	//  136  279:areturn         
_L8:
		obj = ((Object) (new Node(node1, obj, j, node, node.prev)));
	//  137  280:new             #30  <Class LinkedHashTreeMap$Node>
	//  138  283:dup             
	//  139  284:aload           7
	//  140  286:aload_1         
	//  141  287:iload           4
	//  142  289:aload           6
	//  143  291:aload           6
	//  144  293:getfield        #184 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.prev>
	//  145  296:invokespecial   #248 <Method void LinkedHashTreeMap$Node(LinkedHashTreeMap$Node, Object, int, LinkedHashTreeMap$Node, LinkedHashTreeMap$Node)>
	//  146  299:astore_1        
		if(i < 0)
	//* 147  300:iload_3         
	//* 148  301:ifge            320
			node1.left = ((Node) (obj));
	//  149  304:aload           7
	//  150  306:aload_1         
	//  151  307:putfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
		else
	//* 152  310:aload_0         
	//* 153  311:aload           7
	//* 154  313:iconst_1        
	//* 155  314:invokespecial   #252 <Method void rebalance(LinkedHashTreeMap$Node, boolean)>
	//* 156  317:goto            244
			node1.right = ((Node) (obj));
	//  157  320:aload           7
	//  158  322:aload_1         
	//  159  323:putfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
		rebalance(node1, true);
		if(true) goto _L11; else goto _L10
	//  160  326:goto            310
_L10:
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
	//*   6   12:ifnull          40
	//*   7   15:aload_0         
	//*   8   16:aload_3         
	//*   9   17:getfield        #263 <Field Object LinkedHashTreeMap$Node.value>
	//*  10   20:aload_1         
	//*  11   21:invokeinterface #266 <Method Object java.util.Map$Entry.getValue()>
	//*  12   26:invokespecial   #268 <Method boolean equal(Object, Object)>
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
	//    7    9:invokevirtual   #271 <Method LinkedHashTreeMap$Node find(Object, boolean)>
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
	//   25   49:getfield        #147 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
	//   26   52:astore          7
		if(node1 != null && node2 != null)
	//*  27   54:aload           5
	//*  28   56:ifnull          200
	//*  29   59:aload           6
	//*  30   61:ifnull          200
		{
			int i;
			int j;
			if(node1.height > node2.height)
	//*  31   64:aload           5
	//*  32   66:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
	//*  33   69:aload           6
	//*  34   71:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
	//*  35   74:icmple          190
				node1 = node1.last();
	//   36   77:aload           5
	//   37   79:invokevirtual   #295 <Method LinkedHashTreeMap$Node LinkedHashTreeMap$Node.last()>
	//   38   82:astore          5
			else
	//*  39   84:aload_0         
	//*  40   85:aload           5
	//*  41   87:iconst_0        
	//*  42   88:invokevirtual   #297 <Method void removeInternal(LinkedHashTreeMap$Node, boolean)>
	//*  43   91:iconst_0        
	//*  44   92:istore_3        
	//*  45   93:aload_1         
	//*  46   94:getfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//*  47   97:astore          6
	//*  48   99:aload           6
	//*  49  101:ifnull          129
	//*  50  104:aload           6
	//*  51  106:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
	//*  52  109:istore_3        
	//*  53  110:aload           5
	//*  54  112:aload           6
	//*  55  114:putfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//*  56  117:aload           6
	//*  57  119:aload           5
	//*  58  121:putfield        #147 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
	//*  59  124:aload_1         
	//*  60  125:aconst_null     
	//*  61  126:putfield        #129 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//*  62  129:iconst_0        
	//*  63  130:istore          4
	//*  64  132:aload_1         
	//*  65  133:getfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//*  66  136:astore          6
	//*  67  138:aload           6
	//*  68  140:ifnull          169
	//*  69  143:aload           6
	//*  70  145:getfield        #135 <Field int LinkedHashTreeMap$Node.height>
	//*  71  148:istore          4
	//*  72  150:aload           5
	//*  73  152:aload           6
	//*  74  154:putfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//*  75  157:aload           6
	//*  76  159:aload           5
	//*  77  161:putfield        #147 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
	//*  78  164:aload_1         
	//*  79  165:aconst_null     
	//*  80  166:putfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//*  81  169:aload           5
	//*  82  171:iload_3         
	//*  83  172:iload           4
	//*  84  174:invokestatic    #153 <Method int Math.max(int, int)>
	//*  85  177:iconst_1        
	//*  86  178:iadd            
	//*  87  179:putfield        #135 <Field int LinkedHashTreeMap$Node.height>
	//*  88  182:aload_0         
	//*  89  183:aload_1         
	//*  90  184:aload           5
	//*  91  186:invokespecial   #159 <Method void replaceInParent(LinkedHashTreeMap$Node, LinkedHashTreeMap$Node)>
	//*  92  189:return          
				node1 = node2.first();
	//   93  190:aload           6
	//   94  192:invokevirtual   #300 <Method LinkedHashTreeMap$Node LinkedHashTreeMap$Node.first()>
	//   95  195:astore          5
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
	//*  96  197:goto            84
		if(node1 != null)
	//*  97  200:aload           5
	//*  98  202:ifnull          245
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
	//* 106  217:aload_0         
	//* 107  218:aload           7
	//* 108  220:iconst_0        
	//* 109  221:invokespecial   #252 <Method void rebalance(LinkedHashTreeMap$Node, boolean)>
	//* 110  224:aload_0         
	//* 111  225:aload_0         
	//* 112  226:getfield        #76  <Field int size>
	//* 113  229:iconst_1        
	//* 114  230:isub            
	//* 115  231:putfield        #76  <Field int size>
	//* 116  234:aload_0         
	//* 117  235:aload_0         
	//* 118  236:getfield        #78  <Field int modCount>
	//* 119  239:iconst_1        
	//* 120  240:iadd            
	//* 121  241:putfield        #78  <Field int modCount>
	//* 122  244:return          
		if(node2 != null)
	//* 123  245:aload           6
	//* 124  247:ifnull          265
		{
			replaceInParent(node, node2);
	//  125  250:aload_0         
	//  126  251:aload_1         
	//  127  252:aload           6
	//  128  254:invokespecial   #159 <Method void replaceInParent(LinkedHashTreeMap$Node, LinkedHashTreeMap$Node)>
			node.right = null;
	//  129  257:aload_1         
	//  130  258:aconst_null     
	//  131  259:putfield        #132 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
		} else
	//* 132  262:goto            217
		{
			replaceInParent(node, ((Node) (null)));
	//  133  265:aload_0         
	//  134  266:aload_1         
	//  135  267:aconst_null     
	//  136  268:invokespecial   #159 <Method void replaceInParent(LinkedHashTreeMap$Node, LinkedHashTreeMap$Node)>
		}
		rebalance(node3, false);
		size = size - 1;
		modCount = modCount + 1;
	//* 137  271:goto            217
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
	//    9   13:invokevirtual   #297 <Method void removeInternal(LinkedHashTreeMap$Node, boolean)>
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
	//*   2    5:ifne            25
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:iload_0         
	//*   6   11:putstatic       #64  <Field boolean $assertionsDisabled>
	//*   7   14:new             #9   <Class LinkedHashTreeMap$1>
	//*   8   17:dup             
	//*   9   18:invokespecial   #67  <Method void LinkedHashTreeMap$1()>
	//*  10   21:putstatic       #69  <Field Comparator NATURAL_ORDER>
	//*  11   24:return          
			flag = false;
	//   12   25:iconst_0        
	//   13   26:istore_0        
		$assertionsDisabled = flag;
	//*  14   27:goto            10
	}
}
