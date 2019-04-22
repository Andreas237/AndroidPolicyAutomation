// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.collection;

import java.util.*;

// Referenced classes of package com.firebase.client.collection:
//			RBTreeSortedMap, LLRBEmptyNode, LLRBBlackValueNode, LLRBRedValueNode, 
//			LLRBValueNode, LLRBNode

private static class RBTreeSortedMap$Builder
{
	static class Base1_2
		implements Iterable
	{

		public Iterator iterator()
		{
			return new Iterator() {

				public boolean hasNext()
				{
					return current >= 0;
				//    0    0:aload_0         
				//    1    1:getfield        #35  <Field int current>
				//    2    4:iflt            9
				//    3    7:iconst_1        
				//    4    8:ireturn         
				//    5    9:iconst_0        
				//    6   10:ireturn         
				}

				public BooleanChunk next()
				{
					long l = value;
				//    0    0:aload_0         
				//    1    1:getfield        #26  <Field RBTreeSortedMap$Builder$Base1_2 this$0>
				//    2    4:invokestatic    #44  <Method long RBTreeSortedMap$Builder$Base1_2.access$100(RBTreeSortedMap$Builder$Base1_2)>
				//    3    7:lstore_1        
					long l1 = 1 << current;
				//    4    8:iconst_1        
				//    5    9:aload_0         
				//    6   10:getfield        #35  <Field int current>
				//    7   13:ishl            
				//    8   14:i2l             
				//    9   15:lstore_3        
					BooleanChunk booleanchunk = new BooleanChunk();
				//   10   16:new             #46  <Class RBTreeSortedMap$Builder$BooleanChunk>
				//   11   19:dup             
				//   12   20:invokespecial   #47  <Method void RBTreeSortedMap$Builder$BooleanChunk()>
				//   13   23:astore          6
					boolean flag;
					if((l & l1) == 0L)
				//*  14   25:lload_1         
				//*  15   26:lload_3         
				//*  16   27:land            
				//*  17   28:lconst_0        
				//*  18   29:lcmp            
				//*  19   30:ifne            39
						flag = true;
				//   20   33:iconst_1        
				//   21   34:istore          5
					else
				//*  22   36:goto            42
						flag = false;
				//   23   39:iconst_0        
				//   24   40:istore          5
					booleanchunk.isOne = flag;
				//   25   42:aload           6
				//   26   44:iload           5
				//   27   46:putfield        #51  <Field boolean RBTreeSortedMap$Builder$BooleanChunk.isOne>
					booleanchunk.chunkSize = (int)Math.pow(2D, current);
				//   28   49:aload           6
				//   29   51:ldc2w           #52  <Double 2D>
				//   30   54:aload_0         
				//   31   55:getfield        #35  <Field int current>
				//   32   58:i2d             
				//   33   59:invokestatic    #59  <Method double Math.pow(double, double)>
				//   34   62:d2i             
				//   35   63:putfield        #62  <Field int RBTreeSortedMap$Builder$BooleanChunk.chunkSize>
					current = current - 1;
				//   36   66:aload_0         
				//   37   67:aload_0         
				//   38   68:getfield        #35  <Field int current>
				//   39   71:iconst_1        
				//   40   72:isub            
				//   41   73:putfield        #35  <Field int current>
					return booleanchunk;
				//   42   76:aload           6
				//   43   78:areturn         
				}

				public volatile Object next()
				{
					return ((Object) (next()));
				//    0    0:aload_0         
				//    1    1:invokevirtual   #65  <Method RBTreeSortedMap$Builder$BooleanChunk next()>
				//    2    4:areturn         
				}

				public void remove()
				{
				//    0    0:return          
				}

				private int current;
				final Base1_2 this$0;

			
			{
				this$0 = Base1_2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field RBTreeSortedMap$Builder$Base1_2 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #29  <Method void Object()>
				current = length - 1;
			//    5    9:aload_0         
			//    6   10:aload_0         
			//    7   11:getfield        #26  <Field RBTreeSortedMap$Builder$Base1_2 this$0>
			//    8   14:invokestatic    #33  <Method int RBTreeSortedMap$Builder$Base1_2.access$000(RBTreeSortedMap$Builder$Base1_2)>
			//    9   17:iconst_1        
			//   10   18:isub            
			//   11   19:putfield        #35  <Field int current>
			//   12   22:return          
			}
			}
;
		//    0    0:new             #15  <Class RBTreeSortedMap$Builder$Base1_2$1>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #53  <Method void RBTreeSortedMap$Builder$Base1_2$1(RBTreeSortedMap$Builder$Base1_2)>
		//    4    8:areturn         
		}

		private final int length;
		private long value;


/*
		static int access$000(Base1_2 base1_2)
		{
			return base1_2.length;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field int length>
		//    2    4:ireturn         
		}

*/


/*
		static long access$100(Base1_2 base1_2)
		{
			return base1_2.value;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field long value>
		//    2    4:lreturn         
		}

*/

		public Base1_2(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			i++;
		//    2    4:iload_1         
		//    3    5:iconst_1        
		//    4    6:iadd            
		//    5    7:istore_1        
			length = (int)Math.floor(Math.log(i) / Math.log(2D));
		//    6    8:aload_0         
		//    7    9:iload_1         
		//    8   10:i2d             
		//    9   11:invokestatic    #30  <Method double Math.log(double)>
		//   10   14:ldc2w           #31  <Double 2D>
		//   11   17:invokestatic    #30  <Method double Math.log(double)>
		//   12   20:ddiv            
		//   13   21:invokestatic    #35  <Method double Math.floor(double)>
		//   14   24:d2i             
		//   15   25:putfield        #37  <Field int length>
			value = (long)Math.pow(2D, length) - 1L & (long)i;
		//   16   28:aload_0         
		//   17   29:ldc2w           #31  <Double 2D>
		//   18   32:aload_0         
		//   19   33:getfield        #37  <Field int length>
		//   20   36:i2d             
		//   21   37:invokestatic    #41  <Method double Math.pow(double, double)>
		//   22   40:d2l             
		//   23   41:lconst_1        
		//   24   42:lsub            
		//   25   43:iload_1         
		//   26   44:i2l             
		//   27   45:land            
		//   28   46:putfield        #43  <Field long value>
		//   29   49:return          
		}
	}

	static class BooleanChunk
	{

		public int chunkSize;
		public boolean isOne;

		BooleanChunk()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:return          
		}
	}


	private LLRBNode buildBalancedTree(int i, int j)
	{
		if(j == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            8
			return ((LLRBNode) (LLRBEmptyNode.getInstance()));
	//    2    4:invokestatic    #51  <Method LLRBEmptyNode LLRBEmptyNode.getInstance()>
	//    3    7:areturn         
		if(j == 1)
	//*   4    8:iload_2         
	//*   5    9:iconst_1        
	//*   6   10:icmpne          43
		{
			Object obj = keys.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #36  <Field List keys>
	//    9   17:iload_1         
	//   10   18:invokeinterface #57  <Method Object List.get(int)>
	//   11   23:astore          4
			return ((LLRBNode) (new LLRBBlackValueNode(obj, getValue(obj), ((LLRBNode) (null)), ((LLRBNode) (null)))));
	//   12   25:new             #59  <Class LLRBBlackValueNode>
	//   13   28:dup             
	//   14   29:aload           4
	//   15   31:aload_0         
	//   16   32:aload           4
	//   17   34:invokespecial   #63  <Method Object getValue(Object)>
	//   18   37:aconst_null     
	//   19   38:aconst_null     
	//   20   39:invokespecial   #66  <Method void LLRBBlackValueNode(Object, Object, LLRBNode, LLRBNode)>
	//   21   42:areturn         
		} else
		{
			j /= 2;
	//   22   43:iload_2         
	//   23   44:iconst_2        
	//   24   45:idiv            
	//   25   46:istore_2        
			int k = i + j;
	//   26   47:iload_1         
	//   27   48:iload_2         
	//   28   49:iadd            
	//   29   50:istore_3        
			LLRBNode llrbnode = buildBalancedTree(i, j);
	//   30   51:aload_0         
	//   31   52:iload_1         
	//   32   53:iload_2         
	//   33   54:invokespecial   #68  <Method LLRBNode buildBalancedTree(int, int)>
	//   34   57:astore          4
			LLRBNode llrbnode1 = buildBalancedTree(k + 1, j);
	//   35   59:aload_0         
	//   36   60:iload_3         
	//   37   61:iconst_1        
	//   38   62:iadd            
	//   39   63:iload_2         
	//   40   64:invokespecial   #68  <Method LLRBNode buildBalancedTree(int, int)>
	//   41   67:astore          5
			Object obj1 = keys.get(k);
	//   42   69:aload_0         
	//   43   70:getfield        #36  <Field List keys>
	//   44   73:iload_3         
	//   45   74:invokeinterface #57  <Method Object List.get(int)>
	//   46   79:astore          6
			return ((LLRBNode) (new LLRBBlackValueNode(obj1, getValue(obj1), llrbnode, llrbnode1)));
	//   47   81:new             #59  <Class LLRBBlackValueNode>
	//   48   84:dup             
	//   49   85:aload           6
	//   50   87:aload_0         
	//   51   88:aload           6
	//   52   90:invokespecial   #63  <Method Object getValue(Object)>
	//   53   93:aload           4
	//   54   95:aload           5
	//   55   97:invokespecial   #66  <Method void LLRBBlackValueNode(Object, Object, LLRBNode, LLRBNode)>
	//   56  100:areturn         
		}
	}

	public static RBTreeSortedMap buildFrom(List list, Map map, er.KeyTranslator keytranslator, Comparator comparator)
	{
		map = ((Map) (new RBTreeSortedMap$Builder(list, map, keytranslator)));
	//    0    0:new             #2   <Class RBTreeSortedMap$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #73  <Method void RBTreeSortedMap$Builder(List, Map, ImmutableSortedMap$Builder$KeyTranslator)>
	//    6   10:astore_1        
		Collections.sort(list, comparator);
	//    7   11:aload_0         
	//    8   12:aload_3         
	//    9   13:invokestatic    #79  <Method void Collections.sort(List, Comparator)>
		keytranslator = ((er.KeyTranslator) ((new Base1_2(list.size())).iterator()));
	//   10   16:new             #10  <Class RBTreeSortedMap$Builder$Base1_2>
	//   11   19:dup             
	//   12   20:aload_0         
	//   13   21:invokeinterface #83  <Method int List.size()>
	//   14   26:invokespecial   #86  <Method void RBTreeSortedMap$Builder$Base1_2(int)>
	//   15   29:invokevirtual   #90  <Method Iterator RBTreeSortedMap$Builder$Base1_2.iterator()>
	//   16   32:astore_2        
		int i = list.size();
	//   17   33:aload_0         
	//   18   34:invokeinterface #83  <Method int List.size()>
	//   19   39:istore          4
		while(((Iterator) (keytranslator)).hasNext()) 
	//*  20   41:aload_2         
	//*  21   42:invokeinterface #96  <Method boolean Iterator.hasNext()>
	//*  22   47:ifeq            130
		{
			list = ((List) ((BooleanChunk)((Iterator) (keytranslator)).next()));
	//   23   50:aload_2         
	//   24   51:invokeinterface #100 <Method Object Iterator.next()>
	//   25   56:checkcast       #15  <Class RBTreeSortedMap$Builder$BooleanChunk>
	//   26   59:astore_0        
			i -= ((BooleanChunk) (list)).chunkSize;
	//   27   60:iload           4
	//   28   62:aload_0         
	//   29   63:getfield        #104 <Field int RBTreeSortedMap$Builder$BooleanChunk.chunkSize>
	//   30   66:isub            
	//   31   67:istore          4
			if(((BooleanChunk) (list)).isOne)
	//*  32   69:aload_0         
	//*  33   70:getfield        #108 <Field boolean RBTreeSortedMap$Builder$BooleanChunk.isOne>
	//*  34   73:ifeq            92
			{
				((RBTreeSortedMap$Builder) (map)).buildPennant(LLRBNode.Color.BLACK, ((BooleanChunk) (list)).chunkSize, i);
	//   35   76:aload_1         
	//   36   77:getstatic       #114 <Field LLRBNode$Color LLRBNode$Color.BLACK>
	//   37   80:aload_0         
	//   38   81:getfield        #104 <Field int RBTreeSortedMap$Builder$BooleanChunk.chunkSize>
	//   39   84:iload           4
	//   40   86:invokespecial   #118 <Method void buildPennant(LLRBNode$Color, int, int)>
			} else
	//*  41   89:goto            41
			{
				((RBTreeSortedMap$Builder) (map)).buildPennant(LLRBNode.Color.BLACK, ((BooleanChunk) (list)).chunkSize, i);
	//   42   92:aload_1         
	//   43   93:getstatic       #114 <Field LLRBNode$Color LLRBNode$Color.BLACK>
	//   44   96:aload_0         
	//   45   97:getfield        #104 <Field int RBTreeSortedMap$Builder$BooleanChunk.chunkSize>
	//   46  100:iload           4
	//   47  102:invokespecial   #118 <Method void buildPennant(LLRBNode$Color, int, int)>
				i -= ((BooleanChunk) (list)).chunkSize;
	//   48  105:iload           4
	//   49  107:aload_0         
	//   50  108:getfield        #104 <Field int RBTreeSortedMap$Builder$BooleanChunk.chunkSize>
	//   51  111:isub            
	//   52  112:istore          4
				((RBTreeSortedMap$Builder) (map)).buildPennant(LLRBNode.Color.RED, ((BooleanChunk) (list)).chunkSize, i);
	//   53  114:aload_1         
	//   54  115:getstatic       #121 <Field LLRBNode$Color LLRBNode$Color.RED>
	//   55  118:aload_0         
	//   56  119:getfield        #104 <Field int RBTreeSortedMap$Builder$BooleanChunk.chunkSize>
	//   57  122:iload           4
	//   58  124:invokespecial   #118 <Method void buildPennant(LLRBNode$Color, int, int)>
			}
		}
	//*  59  127:goto            41
		map = ((Map) (((RBTreeSortedMap$Builder) (map)).root));
	//   60  130:aload_1         
	//   61  131:getfield        #123 <Field LLRBValueNode root>
	//   62  134:astore_1        
		list = ((List) (map));
	//   63  135:aload_1         
	//   64  136:astore_0        
		if(map == null)
	//*  65  137:aload_1         
	//*  66  138:ifnonnull       145
			list = ((List) (LLRBEmptyNode.getInstance()));
	//   67  141:invokestatic    #51  <Method LLRBEmptyNode LLRBEmptyNode.getInstance()>
	//   68  144:astore_0        
		return new RBTreeSortedMap(((LLRBNode) (list)), comparator, ((RBTreeSortedMap._cls1) (null)));
	//   69  145:new             #7   <Class RBTreeSortedMap>
	//   70  148:dup             
	//   71  149:aload_0         
	//   72  150:aload_3         
	//   73  151:aconst_null     
	//   74  152:invokespecial   #126 <Method void RBTreeSortedMap(LLRBNode, Comparator, RBTreeSortedMap$1)>
	//   75  155:areturn         
	}

	private void buildPennant(LLRBNode.Color color, int i, int j)
	{
		LLRBNode llrbnode = buildBalancedTree(j + 1, i - 1);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:iconst_1        
	//    3    3:iadd            
	//    4    4:iload_2         
	//    5    5:iconst_1        
	//    6    6:isub            
	//    7    7:invokespecial   #68  <Method LLRBNode buildBalancedTree(int, int)>
	//    8   10:astore          4
		Object obj = keys.get(j);
	//    9   12:aload_0         
	//   10   13:getfield        #36  <Field List keys>
	//   11   16:iload_3         
	//   12   17:invokeinterface #57  <Method Object List.get(int)>
	//   13   22:astore          5
		if(color == LLRBNode.Color.RED)
	//*  14   24:aload_1         
	//*  15   25:getstatic       #121 <Field LLRBNode$Color LLRBNode$Color.RED>
	//*  16   28:if_acmpne       53
			color = ((LLRBNode.Color) (new LLRBRedValueNode(obj, getValue(obj), ((LLRBNode) (null)), llrbnode)));
	//   17   31:new             #129 <Class LLRBRedValueNode>
	//   18   34:dup             
	//   19   35:aload           5
	//   20   37:aload_0         
	//   21   38:aload           5
	//   22   40:invokespecial   #63  <Method Object getValue(Object)>
	//   23   43:aconst_null     
	//   24   44:aload           4
	//   25   46:invokespecial   #130 <Method void LLRBRedValueNode(Object, Object, LLRBNode, LLRBNode)>
	//   26   49:astore_1        
		else
	//*  27   50:goto            72
			color = ((LLRBNode.Color) (new LLRBBlackValueNode(obj, getValue(obj), ((LLRBNode) (null)), llrbnode)));
	//   28   53:new             #59  <Class LLRBBlackValueNode>
	//   29   56:dup             
	//   30   57:aload           5
	//   31   59:aload_0         
	//   32   60:aload           5
	//   33   62:invokespecial   #63  <Method Object getValue(Object)>
	//   34   65:aconst_null     
	//   35   66:aload           4
	//   36   68:invokespecial   #66  <Method void LLRBBlackValueNode(Object, Object, LLRBNode, LLRBNode)>
	//   37   71:astore_1        
		if(root == null)
	//*  38   72:aload_0         
	//*  39   73:getfield        #123 <Field LLRBValueNode root>
	//*  40   76:ifnonnull       90
		{
			root = ((LLRBValueNode) (color));
	//   41   79:aload_0         
	//   42   80:aload_1         
	//   43   81:putfield        #123 <Field LLRBValueNode root>
			leaf = ((LLRBValueNode) (color));
	//   44   84:aload_0         
	//   45   85:aload_1         
	//   46   86:putfield        #132 <Field LLRBValueNode leaf>
			return;
	//   47   89:return          
		} else
		{
			leaf.setLeft(((LLRBNode) (color)));
	//   48   90:aload_0         
	//   49   91:getfield        #132 <Field LLRBValueNode leaf>
	//   50   94:aload_1         
	//   51   95:invokevirtual   #138 <Method void LLRBValueNode.setLeft(LLRBNode)>
			leaf = ((LLRBValueNode) (color));
	//   52   98:aload_0         
	//   53   99:aload_1         
	//   54  100:putfield        #132 <Field LLRBValueNode leaf>
			return;
	//   55  103:return          
		}
	}

	private Object getValue(Object obj)
	{
		return values.get(keyTranslator.translate(obj));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Map values>
	//    2    4:aload_0         
	//    3    5:getfield        #40  <Field ImmutableSortedMap$Builder$KeyTranslator keyTranslator>
	//    4    8:aload_1         
	//    5    9:invokeinterface #143 <Method Object ImmutableSortedMap$Builder$KeyTranslator.translate(Object)>
	//    6   14:invokeinterface #147 <Method Object Map.get(Object)>
	//    7   19:areturn         
	}

	private final er.KeyTranslator keyTranslator;
	private final List keys;
	private LLRBValueNode leaf;
	private LLRBValueNode root;
	private final Map values;

	private RBTreeSortedMap$Builder(List list, Map map, er.KeyTranslator keytranslator)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		keys = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #36  <Field List keys>
		values = map;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #38  <Field Map values>
		keyTranslator = keytranslator;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #40  <Field ImmutableSortedMap$Builder$KeyTranslator keyTranslator>
	//   11   19:return          
	}
}
