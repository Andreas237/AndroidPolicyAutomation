// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.io.Serializable;
import java.util.*;

public final class LinkedHashTreeMap extends AbstractMap
	implements Serializable
{
	static final class AvlBuilder
	{

		void add(Node node)
		{
			int i;
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
			i = 4;
		//   77  135:iconst_4        
		//   78  136:istore_2        
_L8:
			int j = size;
		//   79  137:aload_0         
		//   80  138:getfield        #40  <Field int size>
		//   81  141:istore_3        
			int k = i - 1;
		//   82  142:iload_2         
		//   83  143:iconst_1        
		//   84  144:isub            
		//   85  145:istore          4
			if((j & k) != k)
				break; /* Loop/switch isn't completed */
		//   86  147:iload_3         
		//   87  148:iload           4
		//   88  150:iand            
		//   89  151:iload           4
		//   90  153:icmpne          311
			if(leavesSkipped != 0) goto _L2; else goto _L1
		//   91  156:aload_0         
		//   92  157:getfield        #42  <Field int leavesSkipped>
		//   93  160:ifne            237
_L1:
			node = stack;
		//   94  163:aload_0         
		//   95  164:getfield        #44  <Field LinkedHashTreeMap$Node stack>
		//   96  167:astore_1        
			Node node1 = node.parent;
		//   97  168:aload_1         
		//   98  169:getfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		//   99  172:astore          5
			Node node3 = node1.parent;
		//  100  174:aload           5
		//  101  176:getfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		//  102  179:astore          6
			node1.parent = node3.parent;
		//  103  181:aload           5
		//  104  183:aload           6
		//  105  185:getfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		//  106  188:putfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
			stack = node1;
		//  107  191:aload_0         
		//  108  192:aload           5
		//  109  194:putfield        #44  <Field LinkedHashTreeMap$Node stack>
			node1.left = node3;
		//  110  197:aload           5
		//  111  199:aload           6
		//  112  201:putfield        #33  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
			node1.right = node;
		//  113  204:aload           5
		//  114  206:aload_1         
		//  115  207:putfield        #27  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
			node1.height = node.height + 1;
		//  116  210:aload           5
		//  117  212:aload_1         
		//  118  213:getfield        #36  <Field int LinkedHashTreeMap$Node.height>
		//  119  216:iconst_1        
		//  120  217:iadd            
		//  121  218:putfield        #36  <Field int LinkedHashTreeMap$Node.height>
			node3.parent = node1;
		//  122  221:aload           6
		//  123  223:aload           5
		//  124  225:putfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
			node.parent = node1;
		//  125  228:aload_1         
		//  126  229:aload           5
		//  127  231:putfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
			  goto _L3
		//* 128  234:goto            304
_L2:
			if(leavesSkipped != 1) goto _L5; else goto _L4
		//  129  237:aload_0         
		//  130  238:getfield        #42  <Field int leavesSkipped>
		//  131  241:iconst_1        
		//  132  242:icmpne          293
_L4:
			node = stack;
		//  133  245:aload_0         
		//  134  246:getfield        #44  <Field LinkedHashTreeMap$Node stack>
		//  135  249:astore_1        
			Node node2 = node.parent;
		//  136  250:aload_1         
		//  137  251:getfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		//  138  254:astore          5
			stack = node2;
		//  139  256:aload_0         
		//  140  257:aload           5
		//  141  259:putfield        #44  <Field LinkedHashTreeMap$Node stack>
			node2.right = node;
		//  142  262:aload           5
		//  143  264:aload_1         
		//  144  265:putfield        #27  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
			node2.height = node.height + 1;
		//  145  268:aload           5
		//  146  270:aload_1         
		//  147  271:getfield        #36  <Field int LinkedHashTreeMap$Node.height>
		//  148  274:iconst_1        
		//  149  275:iadd            
		//  150  276:putfield        #36  <Field int LinkedHashTreeMap$Node.height>
			node.parent = node2;
		//  151  279:aload_1         
		//  152  280:aload           5
		//  153  282:putfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
_L6:
			leavesSkipped = 0;
		//  154  285:aload_0         
		//  155  286:iconst_0        
		//  156  287:putfield        #42  <Field int leavesSkipped>
			break; /* Loop/switch isn't completed */
		//  157  290:goto            304
_L5:
			if(leavesSkipped != 2) goto _L3; else goto _L6
		//  158  293:aload_0         
		//  159  294:getfield        #42  <Field int leavesSkipped>
		//  160  297:iconst_2        
		//  161  298:icmpne          304
		//* 162  301:goto            285
_L3:
			i *= 2;
		//  163  304:iload_2         
		//  164  305:iconst_2        
		//  165  306:imul            
		//  166  307:istore_2        
			if(true) goto _L8; else goto _L7
		//  167  308:goto            137
_L7:
		//  168  311:return          
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
			Node node3 = stackTop;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field LinkedHashTreeMap$Node stackTop>
		//    2    4:astore          4
			if(node3 == null)
		//*   3    6:aload           4
		//*   4    8:ifnonnull       13
				return null;
		//    5   11:aconst_null     
		//    6   12:areturn         
			Node node1 = node3.parent;
		//    7   13:aload           4
		//    8   15:getfield        #25  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		//    9   18:astore_2        
			node3.parent = null;
		//   10   19:aload           4
		//   11   21:aconst_null     
		//   12   22:putfield        #25  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
			Node node = node3.right;
		//   13   25:aload           4
		//   14   27:getfield        #28  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
		//   15   30:astore_1        
			do
			{
				Node node2 = node1;
		//   16   31:aload_2         
		//   17   32:astore_3        
				node1 = node;
		//   18   33:aload_1         
		//   19   34:astore_2        
				if(node1 != null)
		//*  20   35:aload_2         
		//*  21   36:ifnull          52
				{
					node1.parent = node2;
		//   22   39:aload_2         
		//   23   40:aload_3         
		//   24   41:putfield        #25  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
					node = node1.left;
		//   25   44:aload_2         
		//   26   45:getfield        #31  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
		//   27   48:astore_1        
				} else
		//*  28   49:goto            31
				{
					stackTop = node2;
		//   29   52:aload_0         
		//   30   53:aload_3         
		//   31   54:putfield        #20  <Field LinkedHashTreeMap$Node stackTop>
					return node3;
		//   32   57:aload           4
		//   33   59:areturn         
				}
			} while(true);
		}

		void reset(Node node)
		{
			Node node1 = null;
		//    0    0:aconst_null     
		//    1    1:astore_2        
			Node node2;
			for(; node != null; node = node2)
		//*   2    2:aload_1         
		//*   3    3:ifnull          23
			{
				node.parent = node1;
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:putfield        #25  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
				node2 = node.left;
		//    7   11:aload_1         
		//    8   12:getfield        #31  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
		//    9   15:astore_3        
				node1 = node;
		//   10   16:aload_1         
		//   11   17:astore_2        
			}

		//   12   18:aload_3         
		//   13   19:astore_1        
		//*  14   20:goto            2
			stackTop = node1;
		//   15   23:aload_0         
		//   16   24:aload_2         
		//   17   25:putfield        #20  <Field LinkedHashTreeMap$Node stackTop>
		//   18   28:return          
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

		public Node first()
		{
			Node node = left;
		//    0    0:aload_0         
		//    1    1:getfield        #62  <Field LinkedHashTreeMap$Node left>
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

		public Node last()
		{
			Node node = right;
		//    0    0:aload_0         
		//    1    1:getfield        #72  <Field LinkedHashTreeMap$Node right>
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
	//    1    1:getstatic       #62  <Field Comparator NATURAL_ORDER>
	//    2    4:invokespecial   #66  <Method void LinkedHashTreeMap(Comparator)>
	//    3    7:return          
	}

	public LinkedHashTreeMap(Comparator comparator1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void AbstractMap()>
		size = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #69  <Field int size>
		modCount = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #71  <Field int modCount>
		if(comparator1 == null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          21
	//*  10   18:goto            25
			comparator1 = NATURAL_ORDER;
	//   11   21:getstatic       #62  <Field Comparator NATURAL_ORDER>
	//   12   24:astore_1        
		comparator = comparator1;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #73  <Field Comparator comparator>
		header = new Node();
	//   16   30:aload_0         
	//   17   31:new             #30  <Class LinkedHashTreeMap$Node>
	//   18   34:dup             
	//   19   35:invokespecial   #74  <Method void LinkedHashTreeMap$Node()>
	//   20   38:putfield        #76  <Field LinkedHashTreeMap$Node header>
		table = new Node[16];
	//   21   41:aload_0         
	//   22   42:bipush          16
	//   23   44:anewarray       Node[]
	//   24   47:putfield        #78  <Field LinkedHashTreeMap$Node[] table>
		threshold = table.length / 2 + table.length / 4;
	//   25   50:aload_0         
	//   26   51:aload_0         
	//   27   52:getfield        #78  <Field LinkedHashTreeMap$Node[] table>
	//   28   55:arraylength     
	//   29   56:iconst_2        
	//   30   57:idiv            
	//   31   58:aload_0         
	//   32   59:getfield        #78  <Field LinkedHashTreeMap$Node[] table>
	//   33   62:arraylength     
	//   34   63:iconst_4        
	//   35   64:idiv            
	//   36   65:iadd            
	//   37   66:putfield        #80  <Field int threshold>
	//   38   69:return          
	}

	private void doubleCapacity()
	{
		table = doubleCapacity(table);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #78  <Field LinkedHashTreeMap$Node[] table>
	//    3    5:invokestatic    #86  <Method LinkedHashTreeMap$Node[] doubleCapacity(LinkedHashTreeMap$Node[])>
	//    4    8:putfield        #78  <Field LinkedHashTreeMap$Node[] table>
		threshold = table.length / 2 + table.length / 4;
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #78  <Field LinkedHashTreeMap$Node[] table>
	//    8   16:arraylength     
	//    9   17:iconst_2        
	//   10   18:idiv            
	//   11   19:aload_0         
	//   12   20:getfield        #78  <Field LinkedHashTreeMap$Node[] table>
	//   13   23:arraylength     
	//   14   24:iconst_4        
	//   15   25:idiv            
	//   16   26:iadd            
	//   17   27:putfield        #80  <Field int threshold>
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
	//    7   11:astore          7
		AvlIterator avliterator = new AvlIterator();
	//    8   13:new             #14  <Class LinkedHashTreeMap$AvlIterator>
	//    9   16:dup             
	//   10   17:invokespecial   #87  <Method void LinkedHashTreeMap$AvlIterator()>
	//   11   20:astore          8
		AvlBuilder avlbuilder = new AvlBuilder();
	//   12   22:new             #11  <Class LinkedHashTreeMap$AvlBuilder>
	//   13   25:dup             
	//   14   26:invokespecial   #88  <Method void LinkedHashTreeMap$AvlBuilder()>
	//   15   29:astore          9
		AvlBuilder avlbuilder1 = new AvlBuilder();
	//   16   31:new             #11  <Class LinkedHashTreeMap$AvlBuilder>
	//   17   34:dup             
	//   18   35:invokespecial   #88  <Method void LinkedHashTreeMap$AvlBuilder()>
	//   19   38:astore          10
		for(int i = 0; i < l; i++)
	//*  20   40:iconst_0        
	//*  21   41:istore_1        
	//*  22   42:iload_1         
	//*  23   43:iload           4
	//*  24   45:icmpge          228
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
	//   31   58:goto            221
			avliterator.reset(node);
	//   32   61:aload           8
	//   33   63:aload           5
	//   34   65:invokevirtual   #92  <Method void LinkedHashTreeMap$AvlIterator.reset(LinkedHashTreeMap$Node)>
			int k = 0;
	//   35   68:iconst_0        
	//   36   69:istore_3        
			int j = 0;
	//   37   70:iconst_0        
	//   38   71:istore_2        
			do
			{
				Node node1 = avliterator.next();
	//   39   72:aload           8
	//   40   74:invokevirtual   #96  <Method LinkedHashTreeMap$Node LinkedHashTreeMap$AvlIterator.next()>
	//   41   77:astore          6
				if(node1 == null)
					break;
	//   42   79:aload           6
	//   43   81:ifnull          109
				if((node1.hash & l) == 0)
	//*  44   84:aload           6
	//*  45   86:getfield        #99  <Field int LinkedHashTreeMap$Node.hash>
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
	//   59  109:aload           9
	//   60  111:iload_3         
	//   61  112:invokevirtual   #102 <Method void LinkedHashTreeMap$AvlBuilder.reset(int)>
			avlbuilder1.reset(j);
	//   62  115:aload           10
	//   63  117:iload_2         
	//   64  118:invokevirtual   #102 <Method void LinkedHashTreeMap$AvlBuilder.reset(int)>
			avliterator.reset(node);
	//   65  121:aload           8
	//   66  123:aload           5
	//   67  125:invokevirtual   #92  <Method void LinkedHashTreeMap$AvlIterator.reset(LinkedHashTreeMap$Node)>
			do
			{
				node = avliterator.next();
	//   68  128:aload           8
	//   69  130:invokevirtual   #96  <Method LinkedHashTreeMap$Node LinkedHashTreeMap$AvlIterator.next()>
	//   70  133:astore          5
				if(node == null)
					break;
	//   71  135:aload           5
	//   72  137:ifnull          171
				if((node.hash & l) == 0)
	//*  73  140:aload           5
	//*  74  142:getfield        #99  <Field int LinkedHashTreeMap$Node.hash>
	//*  75  145:iload           4
	//*  76  147:iand            
	//*  77  148:ifne            161
					avlbuilder.add(node);
	//   78  151:aload           9
	//   79  153:aload           5
	//   80  155:invokevirtual   #105 <Method void LinkedHashTreeMap$AvlBuilder.add(LinkedHashTreeMap$Node)>
				else
	//*  81  158:goto            128
					avlbuilder1.add(node);
	//   82  161:aload           10
	//   83  163:aload           5
	//   84  165:invokevirtual   #105 <Method void LinkedHashTreeMap$AvlBuilder.add(LinkedHashTreeMap$Node)>
			} while(true);
	//   85  168:goto            128
			Object obj = null;
	//   86  171:aconst_null     
	//   87  172:astore          6
			if(k > 0)
	//*  88  174:iload_3         
	//*  89  175:ifle            188
				node = avlbuilder.root();
	//   90  178:aload           9
	//   91  180:invokevirtual   #108 <Method LinkedHashTreeMap$Node LinkedHashTreeMap$AvlBuilder.root()>
	//   92  183:astore          5
			else
	//*  93  185:goto            191
				node = null;
	//   94  188:aconst_null     
	//   95  189:astore          5
			anode1[i] = node;
	//   96  191:aload           7
	//   97  193:iload_1         
	//   98  194:aload           5
	//   99  196:aastore         
			node = ((Node) (obj));
	//  100  197:aload           6
	//  101  199:astore          5
			if(j > 0)
	//* 102  201:iload_2         
	//* 103  202:ifle            212
				node = avlbuilder1.root();
	//  104  205:aload           10
	//  105  207:invokevirtual   #108 <Method LinkedHashTreeMap$Node LinkedHashTreeMap$AvlBuilder.root()>
	//  106  210:astore          5
			anode1[i + l] = node;
	//  107  212:aload           7
	//  108  214:iload_1         
	//  109  215:iload           4
	//  110  217:iadd            
	//  111  218:aload           5
	//  112  220:aastore         
		}

	//  113  221:iload_1         
	//  114  222:iconst_1        
	//  115  223:iadd            
	//  116  224:istore_1        
	//* 117  225:goto            42
		return anode1;
	//  118  228:aload           7
	//  119  230:areturn         
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
	//    7   11:invokevirtual   #117 <Method boolean Object.equals(Object)>
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
	//    3    5:getfield        #122 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//    4    8:astore          8
			Node node2 = node.right;
	//    5   10:aload_1         
	//    6   11:getfield        #125 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
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
	//   15   29:getfield        #128 <Field int LinkedHashTreeMap$Node.height>
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
	//   23   45:getfield        #128 <Field int LinkedHashTreeMap$Node.height>
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
	//   36   71:getfield        #122 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//   37   74:astore          8
				Node node4 = node2.right;
	//   38   76:aload           9
	//   39   78:getfield        #125 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//   40   81:astore          10
				if(node4 != null)
	//*  41   83:aload           10
	//*  42   85:ifnull          97
					i = node4.height;
	//   43   88:aload           10
	//   44   90:getfield        #128 <Field int LinkedHashTreeMap$Node.height>
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
	//   54  110:getfield        #128 <Field int LinkedHashTreeMap$Node.height>
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
	//   70  139:invokespecial   #131 <Method void rotateRight(LinkedHashTreeMap$Node)>
				rotateLeft(node);
	//   71  142:aload_0         
	//   72  143:aload_1         
	//   73  144:invokespecial   #134 <Method void rotateLeft(LinkedHashTreeMap$Node)>
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
	//   81  160:getfield        #122 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//   82  163:astore          9
				Node node5 = node1.right;
	//   83  165:aload           8
	//   84  167:getfield        #125 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//   85  170:astore          10
				if(node5 != null)
	//*  86  172:aload           10
	//*  87  174:ifnull          186
					i = node5.height;
	//   88  177:aload           10
	//   89  179:getfield        #128 <Field int LinkedHashTreeMap$Node.height>
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
	//   99  199:getfield        #128 <Field int LinkedHashTreeMap$Node.height>
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
	//  115  228:invokespecial   #134 <Method void rotateLeft(LinkedHashTreeMap$Node)>
				rotateRight(node);
	//  116  231:aload_0         
	//  117  232:aload_1         
	//  118  233:invokespecial   #131 <Method void rotateRight(LinkedHashTreeMap$Node)>
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
	//  128  250:putfield        #128 <Field int LinkedHashTreeMap$Node.height>
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
	//  135  262:invokestatic    #140 <Method int Math.max(int, int)>
	//  136  265:iconst_1        
	//  137  266:iadd            
	//  138  267:putfield        #128 <Field int LinkedHashTreeMap$Node.height>
			if(!flag)
	//* 139  270:iload_2         
	//* 140  271:ifne            275
				return;
	//  141  274:return          
		}

	//  142  275:aload_1         
	//  143  276:getfield        #143 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
	//  144  279:astore_1        
	//* 145  280:goto            0
	//  146  283:return          
	}

	private void replaceInParent(Node node, Node node1)
	{
		Node node2 = node.parent;
	//    0    0:aload_1         
	//    1    1:getfield        #143 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
	//    2    4:astore          5
		node.parent = null;
	//    3    6:aload_1         
	//    4    7:aconst_null     
	//    5    8:putfield        #143 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		if(node1 != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          21
			node1.parent = node2;
	//    8   15:aload_2         
	//    9   16:aload           5
	//   10   18:putfield        #143 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		if(node2 != null)
	//*  11   21:aload           5
	//*  12   23:ifnull          49
		{
			if(node2.left == node)
	//*  13   26:aload           5
	//*  14   28:getfield        #122 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//*  15   31:aload_1         
	//*  16   32:if_acmpne       42
			{
				node2.left = node1;
	//   17   35:aload           5
	//   18   37:aload_2         
	//   19   38:putfield        #122 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
				return;
	//   20   41:return          
			} else
			{
				node2.right = node1;
	//   21   42:aload           5
	//   22   44:aload_2         
	//   23   45:putfield        #125 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
				return;
	//   24   48:return          
			}
		} else
		{
			int i = node.hash;
	//   25   49:aload_1         
	//   26   50:getfield        #99  <Field int LinkedHashTreeMap$Node.hash>
	//   27   53:istore_3        
			int j = table.length;
	//   28   54:aload_0         
	//   29   55:getfield        #78  <Field LinkedHashTreeMap$Node[] table>
	//   30   58:arraylength     
	//   31   59:istore          4
			table[i & j - 1] = node1;
	//   32   61:aload_0         
	//   33   62:getfield        #78  <Field LinkedHashTreeMap$Node[] table>
	//   34   65:iload_3         
	//   35   66:iload           4
	//   36   68:iconst_1        
	//   37   69:isub            
	//   38   70:iand            
	//   39   71:aload_2         
	//   40   72:aastore         
			return;
	//   41   73:return          
		}
	}

	private void rotateLeft(Node node)
	{
		Node node1 = node.left;
	//    0    0:aload_1         
	//    1    1:getfield        #122 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//    2    4:astore          5
		Node node2 = node.right;
	//    3    6:aload_1         
	//    4    7:getfield        #125 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//    5   10:astore          6
		Node node3 = node2.left;
	//    6   12:aload           6
	//    7   14:getfield        #122 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//    8   17:astore          7
		Node node4 = node2.right;
	//    9   19:aload           6
	//   10   21:getfield        #125 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//   11   24:astore          8
		node.right = node3;
	//   12   26:aload_1         
	//   13   27:aload           7
	//   14   29:putfield        #125 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
		if(node3 != null)
	//*  15   32:aload           7
	//*  16   34:ifnull          43
			node3.parent = node;
	//   17   37:aload           7
	//   18   39:aload_1         
	//   19   40:putfield        #143 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		replaceInParent(node, node2);
	//   20   43:aload_0         
	//   21   44:aload_1         
	//   22   45:aload           6
	//   23   47:invokespecial   #149 <Method void replaceInParent(LinkedHashTreeMap$Node, LinkedHashTreeMap$Node)>
		node2.left = node;
	//   24   50:aload           6
	//   25   52:aload_1         
	//   26   53:putfield        #122 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
		node.parent = node2;
	//   27   56:aload_1         
	//   28   57:aload           6
	//   29   59:putfield        #143 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		boolean flag = false;
	//   30   62:iconst_0        
	//   31   63:istore          4
		int i;
		if(node1 != null)
	//*  32   65:aload           5
	//*  33   67:ifnull          79
			i = node1.height;
	//   34   70:aload           5
	//   35   72:getfield        #128 <Field int LinkedHashTreeMap$Node.height>
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
	//   43   88:getfield        #128 <Field int LinkedHashTreeMap$Node.height>
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
	//   51  100:invokestatic    #140 <Method int Math.max(int, int)>
	//   52  103:iconst_1        
	//   53  104:iadd            
	//   54  105:putfield        #128 <Field int LinkedHashTreeMap$Node.height>
		j = node.height;
	//   55  108:aload_1         
	//   56  109:getfield        #128 <Field int LinkedHashTreeMap$Node.height>
	//   57  112:istore_3        
		i = ((int) (flag));
	//   58  113:iload           4
	//   59  115:istore_2        
		if(node4 != null)
	//*  60  116:aload           8
	//*  61  118:ifnull          127
			i = node4.height;
	//   62  121:aload           8
	//   63  123:getfield        #128 <Field int LinkedHashTreeMap$Node.height>
	//   64  126:istore_2        
		node2.height = Math.max(j, i) + 1;
	//   65  127:aload           6
	//   66  129:iload_3         
	//   67  130:iload_2         
	//   68  131:invokestatic    #140 <Method int Math.max(int, int)>
	//   69  134:iconst_1        
	//   70  135:iadd            
	//   71  136:putfield        #128 <Field int LinkedHashTreeMap$Node.height>
	//   72  139:return          
	}

	private void rotateRight(Node node)
	{
		Node node1 = node.left;
	//    0    0:aload_1         
	//    1    1:getfield        #122 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//    2    4:astore          5
		Node node2 = node.right;
	//    3    6:aload_1         
	//    4    7:getfield        #125 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//    5   10:astore          6
		Node node3 = node1.left;
	//    6   12:aload           5
	//    7   14:getfield        #122 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//    8   17:astore          7
		Node node4 = node1.right;
	//    9   19:aload           5
	//   10   21:getfield        #125 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//   11   24:astore          8
		node.left = node4;
	//   12   26:aload_1         
	//   13   27:aload           8
	//   14   29:putfield        #122 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
		if(node4 != null)
	//*  15   32:aload           8
	//*  16   34:ifnull          43
			node4.parent = node;
	//   17   37:aload           8
	//   18   39:aload_1         
	//   19   40:putfield        #143 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		replaceInParent(node, node1);
	//   20   43:aload_0         
	//   21   44:aload_1         
	//   22   45:aload           5
	//   23   47:invokespecial   #149 <Method void replaceInParent(LinkedHashTreeMap$Node, LinkedHashTreeMap$Node)>
		node1.right = node;
	//   24   50:aload           5
	//   25   52:aload_1         
	//   26   53:putfield        #125 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
		node.parent = node1;
	//   27   56:aload_1         
	//   28   57:aload           5
	//   29   59:putfield        #143 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		boolean flag = false;
	//   30   62:iconst_0        
	//   31   63:istore          4
		int i;
		if(node2 != null)
	//*  32   65:aload           6
	//*  33   67:ifnull          79
			i = node2.height;
	//   34   70:aload           6
	//   35   72:getfield        #128 <Field int LinkedHashTreeMap$Node.height>
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
	//   43   88:getfield        #128 <Field int LinkedHashTreeMap$Node.height>
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
	//   51  100:invokestatic    #140 <Method int Math.max(int, int)>
	//   52  103:iconst_1        
	//   53  104:iadd            
	//   54  105:putfield        #128 <Field int LinkedHashTreeMap$Node.height>
		j = node.height;
	//   55  108:aload_1         
	//   56  109:getfield        #128 <Field int LinkedHashTreeMap$Node.height>
	//   57  112:istore_3        
		i = ((int) (flag));
	//   58  113:iload           4
	//   59  115:istore_2        
		if(node3 != null)
	//*  60  116:aload           7
	//*  61  118:ifnull          127
			i = node3.height;
	//   62  121:aload           7
	//   63  123:getfield        #128 <Field int LinkedHashTreeMap$Node.height>
	//   64  126:istore_2        
		node1.height = Math.max(j, i) + 1;
	//   65  127:aload           5
	//   66  129:iload_3         
	//   67  130:iload_2         
	//   68  131:invokestatic    #140 <Method int Math.max(int, int)>
	//   69  134:iconst_1        
	//   70  135:iadd            
	//   71  136:putfield        #128 <Field int LinkedHashTreeMap$Node.height>
	//   72  139:return          
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
		return i >>> 4 ^ (i >>> 7 ^ i);
	//   10   12:iload_0         
	//   11   13:iconst_4        
	//   12   14:iushr           
	//   13   15:iload_0         
	//   14   16:bipush          7
	//   15   18:iushr           
	//   16   19:iload_0         
	//   17   20:ixor            
	//   18   21:ixor            
	//   19   22:ireturn         
	}

	private Object writeReplace()
	{
		return ((Object) (new LinkedHashMap(((java.util.Map) (this)))));
	//    0    0:new             #156 <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #159 <Method void LinkedHashMap(java.util.Map)>
	//    4    8:areturn         
	}

	public void clear()
	{
		Arrays.fill(((Object []) (table)), ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field LinkedHashTreeMap$Node[] table>
	//    2    4:aconst_null     
	//    3    5:invokestatic    #166 <Method void Arrays.fill(Object[], Object)>
		size = 0;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #69  <Field int size>
		modCount = modCount + 1;
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #71  <Field int modCount>
	//   10   18:iconst_1        
	//   11   19:iadd            
	//   12   20:putfield        #71  <Field int modCount>
		Node node2 = header;
	//   13   23:aload_0         
	//   14   24:getfield        #76  <Field LinkedHashTreeMap$Node header>
	//   15   27:astore_3        
		Node node1;
		for(Node node = node2.next; node != node2; node = node1)
	//*  16   28:aload_3         
	//*  17   29:getfield        #168 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.next>
	//*  18   32:astore_1        
	//*  19   33:aload_1         
	//*  20   34:aload_3         
	//*  21   35:if_acmpeq       58
		{
			node1 = node.next;
	//   22   38:aload_1         
	//   23   39:getfield        #168 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.next>
	//   24   42:astore_2        
			node.prev = null;
	//   25   43:aload_1         
	//   26   44:aconst_null     
	//   27   45:putfield        #171 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.prev>
			node.next = null;
	//   28   48:aload_1         
	//   29   49:aconst_null     
	//   30   50:putfield        #168 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.next>
		}

	//   31   53:aload_2         
	//   32   54:astore_1        
	//*  33   55:goto            33
		node2.prev = node2;
	//   34   58:aload_3         
	//   35   59:aload_3         
	//   36   60:putfield        #171 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.prev>
		node2.next = node2;
	//   37   63:aload_3         
	//   38   64:aload_3         
	//   39   65:putfield        #168 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.next>
	//   40   68:return          
	}

	public boolean containsKey(Object obj)
	{
		return findByObject(obj) != null;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #176 <Method LinkedHashTreeMap$Node findByObject(Object)>
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
	//    1    1:getfield        #179 <Field LinkedHashTreeMap$EntrySet entrySet>
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
	//   10   16:invokespecial   #182 <Method void LinkedHashTreeMap$EntrySet(LinkedHashTreeMap)>
	//   11   19:astore_1        
			entrySet = entryset1;
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:putfield        #179 <Field LinkedHashTreeMap$EntrySet entrySet>
			return ((Set) (entryset1));
	//   15   25:aload_1         
	//   16   26:areturn         
		}
	}

	Node find(Object obj, boolean flag)
	{
		Comparator comparator1 = comparator;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field Comparator comparator>
	//    2    4:astore          10
		Node anode[] = table;
	//    3    6:aload_0         
	//    4    7:getfield        #78  <Field LinkedHashTreeMap$Node[] table>
	//    5   10:astore          9
		int j = secondaryHash(obj.hashCode());
	//    6   12:aload_1         
	//    7   13:invokevirtual   #189 <Method int Object.hashCode()>
	//    8   16:invokestatic    #191 <Method int secondaryHash(int)>
	//    9   19:istore          4
		int k = anode.length - 1 & j;
	//   10   21:aload           9
	//   11   23:arraylength     
	//   12   24:iconst_1        
	//   13   25:isub            
	//   14   26:iload           4
	//   15   28:iand            
	//   16   29:istore          5
		Object obj1 = ((Object) (anode[k]));
	//   17   31:aload           9
	//   18   33:iload           5
	//   19   35:aaload          
	//   20   36:astore          6
		int i;
		if(obj1 != null)
	//*  21   38:aload           6
	//*  22   40:ifnull          141
		{
			Comparable comparable;
			if(comparator1 == NATURAL_ORDER)
	//*  23   43:aload           10
	//*  24   45:getstatic       #62  <Field Comparator NATURAL_ORDER>
	//*  25   48:if_acmpne       60
				comparable = (Comparable)obj;
	//   26   51:aload_1         
	//   27   52:checkcast       #193 <Class Comparable>
	//   28   55:astore          8
			else
	//*  29   57:goto            63
				comparable = null;
	//   30   60:aconst_null     
	//   31   61:astore          8
			do
			{
				if(comparable != null)
	//*  32   63:aload           8
	//*  33   65:ifnull          84
					i = comparable.compareTo(((Node) (obj1)).key);
	//   34   68:aload           8
	//   35   70:aload           6
	//   36   72:getfield        #197 <Field Object LinkedHashTreeMap$Node.key>
	//   37   75:invokeinterface #201 <Method int Comparable.compareTo(Object)>
	//   38   80:istore_3        
				else
	//*  39   81:goto            98
					i = comparator1.compare(obj, ((Node) (obj1)).key);
	//   40   84:aload           10
	//   41   86:aload_1         
	//   42   87:aload           6
	//   43   89:getfield        #197 <Field Object LinkedHashTreeMap$Node.key>
	//   44   92:invokeinterface #207 <Method int Comparator.compare(Object, Object)>
	//   45   97:istore_3        
				if(i == 0)
	//*  46   98:iload_3         
	//*  47   99:ifne            105
					return ((Node) (obj1));
	//   48  102:aload           6
	//   49  104:areturn         
				Node node;
				if(i < 0)
	//*  50  105:iload_3         
	//*  51  106:ifge            119
					node = ((Node) (obj1)).left;
	//   52  109:aload           6
	//   53  111:getfield        #122 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//   54  114:astore          7
				else
	//*  55  116:goto            126
					node = ((Node) (obj1)).right;
	//   56  119:aload           6
	//   57  121:getfield        #125 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//   58  124:astore          7
				if(node == null)
	//*  59  126:aload           7
	//*  60  128:ifnonnull       134
					break;
	//   61  131:goto            143
				obj1 = ((Object) (node));
	//   62  134:aload           7
	//   63  136:astore          6
			} while(true);
	//   64  138:goto            63
		} else
		{
			i = 0;
	//   65  141:iconst_0        
	//   66  142:istore_3        
		}
		if(!flag)
	//*  67  143:iload_2         
	//*  68  144:ifne            149
			return null;
	//   69  147:aconst_null     
	//   70  148:areturn         
		Node node1 = header;
	//   71  149:aload_0         
	//   72  150:getfield        #76  <Field LinkedHashTreeMap$Node header>
	//   73  153:astore          7
		if(obj1 == null)
	//*  74  155:aload           6
	//*  75  157:ifnonnull       247
		{
			if(comparator1 == NATURAL_ORDER && !(obj instanceof Comparable))
	//*  76  160:aload           10
	//*  77  162:getstatic       #62  <Field Comparator NATURAL_ORDER>
	//*  78  165:if_acmpne       218
	//*  79  168:aload_1         
	//*  80  169:instanceof      #193 <Class Comparable>
	//*  81  172:ifne            218
			{
				obj1 = ((Object) (new StringBuilder()));
	//   82  175:new             #209 <Class StringBuilder>
	//   83  178:dup             
	//   84  179:invokespecial   #210 <Method void StringBuilder()>
	//   85  182:astore          6
				((StringBuilder) (obj1)).append(obj.getClass().getName());
	//   86  184:aload           6
	//   87  186:aload_1         
	//   88  187:invokevirtual   #214 <Method Class Object.getClass()>
	//   89  190:invokevirtual   #220 <Method String Class.getName()>
	//   90  193:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   91  196:pop             
				((StringBuilder) (obj1)).append(" is not Comparable");
	//   92  197:aload           6
	//   93  199:ldc1            #226 <String " is not Comparable">
	//   94  201:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   95  204:pop             
				throw new ClassCastException(((StringBuilder) (obj1)).toString());
	//   96  205:new             #228 <Class ClassCastException>
	//   97  208:dup             
	//   98  209:aload           6
	//   99  211:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  100  214:invokespecial   #234 <Method void ClassCastException(String)>
	//  101  217:athrow          
			}
			obj = ((Object) (new Node(((Node) (obj1)), obj, j, node1, node1.prev)));
	//  102  218:new             #30  <Class LinkedHashTreeMap$Node>
	//  103  221:dup             
	//  104  222:aload           6
	//  105  224:aload_1         
	//  106  225:iload           4
	//  107  227:aload           7
	//  108  229:aload           7
	//  109  231:getfield        #171 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.prev>
	//  110  234:invokespecial   #237 <Method void LinkedHashTreeMap$Node(LinkedHashTreeMap$Node, Object, int, LinkedHashTreeMap$Node, LinkedHashTreeMap$Node)>
	//  111  237:astore_1        
			anode[k] = ((Node) (obj));
	//  112  238:aload           9
	//  113  240:iload           5
	//  114  242:aload_1         
	//  115  243:aastore         
		} else
	//* 116  244:goto            293
		{
			obj = ((Object) (new Node(((Node) (obj1)), obj, j, node1, node1.prev)));
	//  117  247:new             #30  <Class LinkedHashTreeMap$Node>
	//  118  250:dup             
	//  119  251:aload           6
	//  120  253:aload_1         
	//  121  254:iload           4
	//  122  256:aload           7
	//  123  258:aload           7
	//  124  260:getfield        #171 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.prev>
	//  125  263:invokespecial   #237 <Method void LinkedHashTreeMap$Node(LinkedHashTreeMap$Node, Object, int, LinkedHashTreeMap$Node, LinkedHashTreeMap$Node)>
	//  126  266:astore_1        
			if(i < 0)
	//* 127  267:iload_3         
	//* 128  268:ifge            280
				obj1.left = ((Node) (obj));
	//  129  271:aload           6
	//  130  273:aload_1         
	//  131  274:putfield        #122 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
			else
	//* 132  277:goto            286
				obj1.right = ((Node) (obj));
	//  133  280:aload           6
	//  134  282:aload_1         
	//  135  283:putfield        #125 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
			rebalance(((Node) (obj1)), true);
	//  136  286:aload_0         
	//  137  287:aload           6
	//  138  289:iconst_1        
	//  139  290:invokespecial   #239 <Method void rebalance(LinkedHashTreeMap$Node, boolean)>
		}
		i = size;
	//  140  293:aload_0         
	//  141  294:getfield        #69  <Field int size>
	//  142  297:istore_3        
		size = i + 1;
	//  143  298:aload_0         
	//  144  299:iload_3         
	//  145  300:iconst_1        
	//  146  301:iadd            
	//  147  302:putfield        #69  <Field int size>
		if(i > threshold)
	//* 148  305:iload_3         
	//* 149  306:aload_0         
	//* 150  307:getfield        #80  <Field int threshold>
	//* 151  310:icmple          317
			doubleCapacity();
	//  152  313:aload_0         
	//  153  314:invokespecial   #241 <Method void doubleCapacity()>
		modCount = modCount + 1;
	//  154  317:aload_0         
	//  155  318:aload_0         
	//  156  319:getfield        #71  <Field int modCount>
	//  157  322:iconst_1        
	//  158  323:iadd            
	//  159  324:putfield        #71  <Field int modCount>
		return ((Node) (obj));
	//  160  327:aload_1         
	//  161  328:areturn         
	}

	Node findByEntry(java.util.Map.Entry entry)
	{
		Node node = findByObject(entry.getKey());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #249 <Method Object java.util.Map$Entry.getKey()>
	//    3    7:invokevirtual   #176 <Method LinkedHashTreeMap$Node findByObject(Object)>
	//    4   10:astore_3        
		boolean flag;
		if(node != null && equal(node.value, entry.getValue()))
	//*   5   11:aload_3         
	//*   6   12:ifnull          37
	//*   7   15:aload_0         
	//*   8   16:aload_3         
	//*   9   17:getfield        #252 <Field Object LinkedHashTreeMap$Node.value>
	//*  10   20:aload_1         
	//*  11   21:invokeinterface #255 <Method Object java.util.Map$Entry.getValue()>
	//*  12   26:invokespecial   #257 <Method boolean equal(Object, Object)>
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
	//    5    7:invokevirtual   #260 <Method LinkedHashTreeMap$Node find(Object, boolean)>
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
	//    2    2:invokevirtual   #176 <Method LinkedHashTreeMap$Node findByObject(Object)>
	//    3    5:astore_1        
		if(obj != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          15
			return ((Node) (obj)).value;
	//    6   10:aload_1         
	//    7   11:getfield        #252 <Field Object LinkedHashTreeMap$Node.value>
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
	//    1    1:getfield        #266 <Field LinkedHashTreeMap$KeySet keySet>
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
	//   10   16:invokespecial   #267 <Method void LinkedHashTreeMap$KeySet(LinkedHashTreeMap)>
	//   11   19:astore_1        
			keySet = keyset1;
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:putfield        #266 <Field LinkedHashTreeMap$KeySet keySet>
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
	//    2    4:new             #272 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc2            #274 <String "key == null">
	//    5   11:invokespecial   #275 <Method void NullPointerException(String)>
	//    6   14:athrow          
		} else
		{
			obj = ((Object) (find(obj, true)));
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #260 <Method LinkedHashTreeMap$Node find(Object, boolean)>
	//   11   21:astore_1        
			Object obj2 = ((Node) (obj)).value;
	//   12   22:aload_1         
	//   13   23:getfield        #252 <Field Object LinkedHashTreeMap$Node.value>
	//   14   26:astore_3        
			obj.value = obj1;
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:putfield        #252 <Field Object LinkedHashTreeMap$Node.value>
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
	//    2    2:invokevirtual   #280 <Method LinkedHashTreeMap$Node removeInternalByKey(Object)>
	//    3    5:astore_1        
		if(obj != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          15
			return ((Node) (obj)).value;
	//    6   10:aload_1         
	//    7   11:getfield        #252 <Field Object LinkedHashTreeMap$Node.value>
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
	//    3    5:getfield        #171 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.prev>
	//    4    8:aload_1         
	//    5    9:getfield        #168 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.next>
	//    6   12:putfield        #168 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.next>
			node.next.prev = node.prev;
	//    7   15:aload_1         
	//    8   16:getfield        #168 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.next>
	//    9   19:aload_1         
	//   10   20:getfield        #171 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.prev>
	//   11   23:putfield        #171 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.prev>
			node.prev = null;
	//   12   26:aload_1         
	//   13   27:aconst_null     
	//   14   28:putfield        #171 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.prev>
			node.next = null;
	//   15   31:aload_1         
	//   16   32:aconst_null     
	//   17   33:putfield        #168 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.next>
		}
		Node node1 = node.left;
	//   18   36:aload_1         
	//   19   37:getfield        #122 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//   20   40:astore          5
		Node node2 = node.right;
	//   21   42:aload_1         
	//   22   43:getfield        #125 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//   23   46:astore          6
		Node node3 = node.parent;
	//   24   48:aload_1         
	//   25   49:getfield        #143 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
	//   26   52:astore          7
		int j = 0;
	//   27   54:iconst_0        
	//   28   55:istore          4
		if(node1 != null && node2 != null)
	//*  29   57:aload           5
	//*  30   59:ifnull          203
	//*  31   62:aload           6
	//*  32   64:ifnull          203
		{
			if(node1.height > node2.height)
	//*  33   67:aload           5
	//*  34   69:getfield        #128 <Field int LinkedHashTreeMap$Node.height>
	//*  35   72:aload           6
	//*  36   74:getfield        #128 <Field int LinkedHashTreeMap$Node.height>
	//*  37   77:icmple          90
				node1 = node1.last();
	//   38   80:aload           5
	//   39   82:invokevirtual   #284 <Method LinkedHashTreeMap$Node LinkedHashTreeMap$Node.last()>
	//   40   85:astore          5
			else
	//*  41   87:goto            97
				node1 = node2.first();
	//   42   90:aload           6
	//   43   92:invokevirtual   #287 <Method LinkedHashTreeMap$Node LinkedHashTreeMap$Node.first()>
	//   44   95:astore          5
			removeInternal(node1, false);
	//   45   97:aload_0         
	//   46   98:aload           5
	//   47  100:iconst_0        
	//   48  101:invokevirtual   #289 <Method void removeInternal(LinkedHashTreeMap$Node, boolean)>
			node2 = node.left;
	//   49  104:aload_1         
	//   50  105:getfield        #122 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
	//   51  108:astore          6
			int i;
			if(node2 != null)
	//*  52  110:aload           6
	//*  53  112:ifnull          143
			{
				i = node2.height;
	//   54  115:aload           6
	//   55  117:getfield        #128 <Field int LinkedHashTreeMap$Node.height>
	//   56  120:istore_3        
				node1.left = node2;
	//   57  121:aload           5
	//   58  123:aload           6
	//   59  125:putfield        #122 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
				node2.parent = node1;
	//   60  128:aload           6
	//   61  130:aload           5
	//   62  132:putfield        #143 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
				node.left = null;
	//   63  135:aload_1         
	//   64  136:aconst_null     
	//   65  137:putfield        #122 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
			} else
	//*  66  140:goto            145
			{
				i = 0;
	//   67  143:iconst_0        
	//   68  144:istore_3        
			}
			node2 = node.right;
	//   69  145:aload_1         
	//   70  146:getfield        #125 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
	//   71  149:astore          6
			if(node2 != null)
	//*  72  151:aload           6
	//*  73  153:ifnull          182
			{
				j = node2.height;
	//   74  156:aload           6
	//   75  158:getfield        #128 <Field int LinkedHashTreeMap$Node.height>
	//   76  161:istore          4
				node1.right = node2;
	//   77  163:aload           5
	//   78  165:aload           6
	//   79  167:putfield        #125 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
				node2.parent = node1;
	//   80  170:aload           6
	//   81  172:aload           5
	//   82  174:putfield        #143 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
				node.right = null;
	//   83  177:aload_1         
	//   84  178:aconst_null     
	//   85  179:putfield        #125 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
			}
			node1.height = Math.max(i, j) + 1;
	//   86  182:aload           5
	//   87  184:iload_3         
	//   88  185:iload           4
	//   89  187:invokestatic    #140 <Method int Math.max(int, int)>
	//   90  190:iconst_1        
	//   91  191:iadd            
	//   92  192:putfield        #128 <Field int LinkedHashTreeMap$Node.height>
			replaceInParent(node, node1);
	//   93  195:aload_0         
	//   94  196:aload_1         
	//   95  197:aload           5
	//   96  199:invokespecial   #149 <Method void replaceInParent(LinkedHashTreeMap$Node, LinkedHashTreeMap$Node)>
			return;
	//   97  202:return          
		}
		if(node1 != null)
	//*  98  203:aload           5
	//*  99  205:ifnull          223
		{
			replaceInParent(node, node1);
	//  100  208:aload_0         
	//  101  209:aload_1         
	//  102  210:aload           5
	//  103  212:invokespecial   #149 <Method void replaceInParent(LinkedHashTreeMap$Node, LinkedHashTreeMap$Node)>
			node.left = null;
	//  104  215:aload_1         
	//  105  216:aconst_null     
	//  106  217:putfield        #122 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
		} else
	//* 107  220:goto            249
		if(node2 != null)
	//* 108  223:aload           6
	//* 109  225:ifnull          243
		{
			replaceInParent(node, node2);
	//  110  228:aload_0         
	//  111  229:aload_1         
	//  112  230:aload           6
	//  113  232:invokespecial   #149 <Method void replaceInParent(LinkedHashTreeMap$Node, LinkedHashTreeMap$Node)>
			node.right = null;
	//  114  235:aload_1         
	//  115  236:aconst_null     
	//  116  237:putfield        #125 <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
		} else
	//* 117  240:goto            249
		{
			replaceInParent(node, ((Node) (null)));
	//  118  243:aload_0         
	//  119  244:aload_1         
	//  120  245:aconst_null     
	//  121  246:invokespecial   #149 <Method void replaceInParent(LinkedHashTreeMap$Node, LinkedHashTreeMap$Node)>
		}
		rebalance(node3, false);
	//  122  249:aload_0         
	//  123  250:aload           7
	//  124  252:iconst_0        
	//  125  253:invokespecial   #239 <Method void rebalance(LinkedHashTreeMap$Node, boolean)>
		size = size - 1;
	//  126  256:aload_0         
	//  127  257:aload_0         
	//  128  258:getfield        #69  <Field int size>
	//  129  261:iconst_1        
	//  130  262:isub            
	//  131  263:putfield        #69  <Field int size>
		modCount = modCount + 1;
	//  132  266:aload_0         
	//  133  267:aload_0         
	//  134  268:getfield        #71  <Field int modCount>
	//  135  271:iconst_1        
	//  136  272:iadd            
	//  137  273:putfield        #71  <Field int modCount>
	//  138  276:return          
	}

	Node removeInternalByKey(Object obj)
	{
		obj = ((Object) (findByObject(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #176 <Method LinkedHashTreeMap$Node findByObject(Object)>
	//    3    5:astore_1        
		if(obj != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          16
			removeInternal(((Node) (obj)), true);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:iconst_1        
	//    9   13:invokevirtual   #289 <Method void removeInternal(LinkedHashTreeMap$Node, boolean)>
		return ((Node) (obj));
	//   10   16:aload_1         
	//   11   17:areturn         
	}

	public int size()
	{
		return size;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int size>
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
	int size;
	Node table[];
	int threshold;

	static 
	{
	//    0    0:new             #9   <Class LinkedHashTreeMap$1>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void LinkedHashTreeMap$1()>
	//    3    7:putstatic       #62  <Field Comparator NATURAL_ORDER>
	//*   4   10:return          
	}
}
