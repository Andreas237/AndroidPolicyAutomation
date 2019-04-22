// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.collection;

import java.util.*;

// Referenced classes of package com.firebase.client.collection:
//			ImmutableSortedMap, LLRBEmptyNode, LLRBNode, ImmutableSortedMapIterator, 
//			LLRBBlackValueNode, LLRBRedValueNode, LLRBValueNode

public class RBTreeSortedMap extends ImmutableSortedMap
{
	private static class Builder
	{

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

		public static RBTreeSortedMap buildFrom(List list, Map map, ImmutableSortedMap.Builder.KeyTranslator keytranslator, Comparator comparator1)
		{
			map = ((Map) (new Builder(list, map, keytranslator)));
		//    0    0:new             #2   <Class RBTreeSortedMap$Builder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #73  <Method void RBTreeSortedMap$Builder(List, Map, ImmutableSortedMap$Builder$KeyTranslator)>
		//    6   10:astore_1        
			Collections.sort(list, comparator1);
		//    7   11:aload_0         
		//    8   12:aload_3         
		//    9   13:invokestatic    #79  <Method void Collections.sort(List, Comparator)>
			keytranslator = ((ImmutableSortedMap.Builder.KeyTranslator) ((new Base1_2(list.size())).iterator()));
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
					((Builder) (map)).buildPennant(LLRBNode.Color.BLACK, ((BooleanChunk) (list)).chunkSize, i);
		//   35   76:aload_1         
		//   36   77:getstatic       #114 <Field LLRBNode$Color LLRBNode$Color.BLACK>
		//   37   80:aload_0         
		//   38   81:getfield        #104 <Field int RBTreeSortedMap$Builder$BooleanChunk.chunkSize>
		//   39   84:iload           4
		//   40   86:invokespecial   #118 <Method void buildPennant(LLRBNode$Color, int, int)>
				} else
		//*  41   89:goto            41
				{
					((Builder) (map)).buildPennant(LLRBNode.Color.BLACK, ((BooleanChunk) (list)).chunkSize, i);
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
					((Builder) (map)).buildPennant(LLRBNode.Color.RED, ((BooleanChunk) (list)).chunkSize, i);
		//   53  114:aload_1         
		//   54  115:getstatic       #121 <Field LLRBNode$Color LLRBNode$Color.RED>
		//   55  118:aload_0         
		//   56  119:getfield        #104 <Field int RBTreeSortedMap$Builder$BooleanChunk.chunkSize>
		//   57  122:iload           4
		//   58  124:invokespecial   #118 <Method void buildPennant(LLRBNode$Color, int, int)>
				}
			}
		//*  59  127:goto            41
			map = ((Map) (((Builder) (map)).root));
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
			return new RBTreeSortedMap(((LLRBNode) (list)), comparator1);
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

		private final ImmutableSortedMap.Builder.KeyTranslator keyTranslator;
		private final List keys;
		private LLRBValueNode leaf;
		private LLRBValueNode root;
		private final Map values;

		private Builder(List list, Map map, ImmutableSortedMap.Builder.KeyTranslator keytranslator)
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

	static class Builder.Base1_2
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

				public Builder.BooleanChunk next()
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
					Builder.BooleanChunk booleanchunk = new Builder.BooleanChunk();
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
				final Builder.Base1_2 this$0;

			
			{
				this$0 = Builder.Base1_2.this;
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
		static int access$000(Builder.Base1_2 base1_2)
		{
			return base1_2.length;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field int length>
		//    2    4:ireturn         
		}

*/


/*
		static long access$100(Builder.Base1_2 base1_2)
		{
			return base1_2.value;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field long value>
		//    2    4:lreturn         
		}

*/

		public Builder.Base1_2(int i)
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

	static class Builder.BooleanChunk
	{

		public int chunkSize;
		public boolean isOne;

		Builder.BooleanChunk()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:return          
		}
	}


	private RBTreeSortedMap(LLRBNode llrbnode, Comparator comparator1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void ImmutableSortedMap()>
		root = llrbnode;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #31  <Field LLRBNode root>
		comparator = comparator1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #33  <Field Comparator comparator>
	//    8   14:return          
	}


	RBTreeSortedMap(Comparator comparator1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void ImmutableSortedMap()>
		root = ((LLRBNode) (LLRBEmptyNode.getInstance()));
	//    2    4:aload_0         
	//    3    5:invokestatic    #46  <Method LLRBEmptyNode LLRBEmptyNode.getInstance()>
	//    4    8:putfield        #31  <Field LLRBNode root>
		comparator = comparator1;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #33  <Field Comparator comparator>
	//    8   16:return          
	}

	public static RBTreeSortedMap buildFrom(List list, Map map, ImmutableSortedMap.Builder.KeyTranslator keytranslator, Comparator comparator1)
	{
		return Builder.buildFrom(list, map, keytranslator, comparator1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokestatic    #51  <Method RBTreeSortedMap RBTreeSortedMap$Builder.buildFrom(List, Map, ImmutableSortedMap$Builder$KeyTranslator, Comparator)>
	//    5    7:areturn         
	}

	public static RBTreeSortedMap fromMap(Map map, Comparator comparator1)
	{
		return Builder.buildFrom(((List) (new ArrayList(((java.util.Collection) (map.keySet()))))), map, ImmutableSortedMap.Builder.identityTranslator(), comparator1);
	//    0    0:new             #56  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #62  <Method java.util.Set Map.keySet()>
	//    4   10:invokespecial   #65  <Method void ArrayList(java.util.Collection)>
	//    5   13:aload_0         
	//    6   14:invokestatic    #71  <Method ImmutableSortedMap$Builder$KeyTranslator ImmutableSortedMap$Builder.identityTranslator()>
	//    7   17:aload_1         
	//    8   18:invokestatic    #51  <Method RBTreeSortedMap RBTreeSortedMap$Builder.buildFrom(List, Map, ImmutableSortedMap$Builder$KeyTranslator, Comparator)>
	//    9   21:areturn         
	}

	private LLRBNode getNode(Object obj)
	{
		for(LLRBNode llrbnode = root; !llrbnode.isEmpty();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field LLRBNode root>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:invokeinterface #80  <Method boolean LLRBNode.isEmpty()>
	//*   5   11:ifne            61
		{
			int i = comparator.compare(obj, llrbnode.getKey());
	//    6   14:aload_0         
	//    7   15:getfield        #33  <Field Comparator comparator>
	//    8   18:aload_1         
	//    9   19:aload_3         
	//   10   20:invokeinterface #84  <Method Object LLRBNode.getKey()>
	//   11   25:invokeinterface #90  <Method int Comparator.compare(Object, Object)>
	//   12   30:istore_2        
			if(i < 0)
	//*  13   31:iload_2         
	//*  14   32:ifge            45
			{
				llrbnode = llrbnode.getLeft();
	//   15   35:aload_3         
	//   16   36:invokeinterface #94  <Method LLRBNode LLRBNode.getLeft()>
	//   17   41:astore_3        
			} else
	//*  18   42:goto            5
			{
				if(i == 0)
	//*  19   45:iload_2         
	//*  20   46:ifne            51
					return llrbnode;
	//   21   49:aload_3         
	//   22   50:areturn         
				llrbnode = llrbnode.getRight();
	//   23   51:aload_3         
	//   24   52:invokeinterface #97  <Method LLRBNode LLRBNode.getRight()>
	//   25   57:astore_3        
			}
		}

	//*  26   58:goto            5
		return null;
	//   27   61:aconst_null     
	//   28   62:areturn         
	}

	public boolean containsKey(Object obj)
	{
		return getNode(obj) != null;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #102 <Method LLRBNode getNode(Object)>
	//    3    5:ifnull          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public Object get(Object obj)
	{
		obj = ((Object) (getNode(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #102 <Method LLRBNode getNode(Object)>
	//    3    5:astore_1        
		if(obj != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          17
			return ((LLRBNode) (obj)).getValue();
	//    6   10:aload_1         
	//    7   11:invokeinterface #108 <Method Object LLRBNode.getValue()>
	//    8   16:areturn         
		else
			return ((Object) (null));
	//    9   17:aconst_null     
	//   10   18:areturn         
	}

	public Comparator getComparator()
	{
		return comparator;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Comparator comparator>
	//    2    4:areturn         
	}

	public Object getMaxKey()
	{
		return root.getMax().getKey();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field LLRBNode root>
	//    2    4:invokeinterface #116 <Method LLRBNode LLRBNode.getMax()>
	//    3    9:invokeinterface #84  <Method Object LLRBNode.getKey()>
	//    4   14:areturn         
	}

	public Object getMinKey()
	{
		return root.getMin().getKey();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field LLRBNode root>
	//    2    4:invokeinterface #121 <Method LLRBNode LLRBNode.getMin()>
	//    3    9:invokeinterface #84  <Method Object LLRBNode.getKey()>
	//    4   14:areturn         
	}

	public Object getPredecessorKey(Object obj)
	{
		Object obj1 = ((Object) (root));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field LLRBNode root>
	//    2    4:astore_3        
		LLRBNode llrbnode = null;
	//    3    5:aconst_null     
	//    4    6:astore          4
		while(!((LLRBNode) (obj1)).isEmpty()) 
	//*   5    8:aload_3         
	//*   6    9:invokeinterface #80  <Method boolean LLRBNode.isEmpty()>
	//*   7   14:ifne            136
		{
			int i = comparator.compare(obj, ((LLRBNode) (obj1)).getKey());
	//    8   17:aload_0         
	//    9   18:getfield        #33  <Field Comparator comparator>
	//   10   21:aload_1         
	//   11   22:aload_3         
	//   12   23:invokeinterface #84  <Method Object LLRBNode.getKey()>
	//   13   28:invokeinterface #90  <Method int Comparator.compare(Object, Object)>
	//   14   33:istore_2        
			if(i == 0)
	//*  15   34:iload_2         
	//*  16   35:ifne            105
			{
				if(!((LLRBNode) (obj1)).getLeft().isEmpty())
	//*  17   38:aload_3         
	//*  18   39:invokeinterface #94  <Method LLRBNode LLRBNode.getLeft()>
	//*  19   44:invokeinterface #80  <Method boolean LLRBNode.isEmpty()>
	//*  20   49:ifne            90
				{
					for(obj = ((Object) (((LLRBNode) (obj1)).getLeft())); !((LLRBNode) (obj)).getRight().isEmpty(); obj = ((Object) (((LLRBNode) (obj)).getRight())));
	//   21   52:aload_3         
	//   22   53:invokeinterface #94  <Method LLRBNode LLRBNode.getLeft()>
	//   23   58:astore_1        
	//   24   59:aload_1         
	//   25   60:invokeinterface #97  <Method LLRBNode LLRBNode.getRight()>
	//   26   65:invokeinterface #80  <Method boolean LLRBNode.isEmpty()>
	//   27   70:ifne            83
	//   28   73:aload_1         
	//   29   74:invokeinterface #97  <Method LLRBNode LLRBNode.getRight()>
	//   30   79:astore_1        
	//*  31   80:goto            59
					return ((LLRBNode) (obj)).getKey();
	//   32   83:aload_1         
	//   33   84:invokeinterface #84  <Method Object LLRBNode.getKey()>
	//   34   89:areturn         
				}
				if(llrbnode != null)
	//*  35   90:aload           4
	//*  36   92:ifnull          103
					return llrbnode.getKey();
	//   37   95:aload           4
	//   38   97:invokeinterface #84  <Method Object LLRBNode.getKey()>
	//   39  102:areturn         
				else
					return ((Object) (null));
	//   40  103:aconst_null     
	//   41  104:areturn         
			}
			if(i < 0)
	//*  42  105:iload_2         
	//*  43  106:ifge            119
			{
				obj1 = ((Object) (((LLRBNode) (obj1)).getLeft()));
	//   44  109:aload_3         
	//   45  110:invokeinterface #94  <Method LLRBNode LLRBNode.getLeft()>
	//   46  115:astore_3        
			} else
	//*  47  116:goto            8
			{
				LLRBNode llrbnode1 = ((LLRBNode) (obj1)).getRight();
	//   48  119:aload_3         
	//   49  120:invokeinterface #97  <Method LLRBNode LLRBNode.getRight()>
	//   50  125:astore          5
				llrbnode = ((LLRBNode) (obj1));
	//   51  127:aload_3         
	//   52  128:astore          4
				obj1 = ((Object) (llrbnode1));
	//   53  130:aload           5
	//   54  132:astore_3        
			}
		}
	//*  55  133:goto            8
		obj1 = ((Object) (new StringBuilder()));
	//   56  136:new             #124 <Class StringBuilder>
	//   57  139:dup             
	//   58  140:invokespecial   #125 <Method void StringBuilder()>
	//   59  143:astore_3        
		((StringBuilder) (obj1)).append("Couldn't find predecessor key of non-present key: ");
	//   60  144:aload_3         
	//   61  145:ldc1            #127 <String "Couldn't find predecessor key of non-present key: ">
	//   62  147:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   63  150:pop             
		((StringBuilder) (obj1)).append(obj);
	//   64  151:aload_3         
	//   65  152:aload_1         
	//   66  153:invokevirtual   #134 <Method StringBuilder StringBuilder.append(Object)>
	//   67  156:pop             
		throw new IllegalArgumentException(((StringBuilder) (obj1)).toString());
	//   68  157:new             #136 <Class IllegalArgumentException>
	//   69  160:dup             
	//   70  161:aload_3         
	//   71  162:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   72  165:invokespecial   #143 <Method void IllegalArgumentException(String)>
	//   73  168:athrow          
	}

	LLRBNode getRoot()
	{
		return root;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field LLRBNode root>
	//    2    4:areturn         
	}

	public Object getSuccessorKey(Object obj)
	{
		Object obj1 = ((Object) (root));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field LLRBNode root>
	//    2    4:astore_3        
		LLRBNode llrbnode = null;
	//    3    5:aconst_null     
	//    4    6:astore          4
		while(!((LLRBNode) (obj1)).isEmpty()) 
	//*   5    8:aload_3         
	//*   6    9:invokeinterface #80  <Method boolean LLRBNode.isEmpty()>
	//*   7   14:ifne            136
		{
			int i = comparator.compare(((LLRBNode) (obj1)).getKey(), obj);
	//    8   17:aload_0         
	//    9   18:getfield        #33  <Field Comparator comparator>
	//   10   21:aload_3         
	//   11   22:invokeinterface #84  <Method Object LLRBNode.getKey()>
	//   12   27:aload_1         
	//   13   28:invokeinterface #90  <Method int Comparator.compare(Object, Object)>
	//   14   33:istore_2        
			if(i == 0)
	//*  15   34:iload_2         
	//*  16   35:ifne            105
			{
				if(!((LLRBNode) (obj1)).getRight().isEmpty())
	//*  17   38:aload_3         
	//*  18   39:invokeinterface #97  <Method LLRBNode LLRBNode.getRight()>
	//*  19   44:invokeinterface #80  <Method boolean LLRBNode.isEmpty()>
	//*  20   49:ifne            90
				{
					for(obj = ((Object) (((LLRBNode) (obj1)).getRight())); !((LLRBNode) (obj)).getLeft().isEmpty(); obj = ((Object) (((LLRBNode) (obj)).getLeft())));
	//   21   52:aload_3         
	//   22   53:invokeinterface #97  <Method LLRBNode LLRBNode.getRight()>
	//   23   58:astore_1        
	//   24   59:aload_1         
	//   25   60:invokeinterface #94  <Method LLRBNode LLRBNode.getLeft()>
	//   26   65:invokeinterface #80  <Method boolean LLRBNode.isEmpty()>
	//   27   70:ifne            83
	//   28   73:aload_1         
	//   29   74:invokeinterface #94  <Method LLRBNode LLRBNode.getLeft()>
	//   30   79:astore_1        
	//*  31   80:goto            59
					return ((LLRBNode) (obj)).getKey();
	//   32   83:aload_1         
	//   33   84:invokeinterface #84  <Method Object LLRBNode.getKey()>
	//   34   89:areturn         
				}
				if(llrbnode != null)
	//*  35   90:aload           4
	//*  36   92:ifnull          103
					return llrbnode.getKey();
	//   37   95:aload           4
	//   38   97:invokeinterface #84  <Method Object LLRBNode.getKey()>
	//   39  102:areturn         
				else
					return ((Object) (null));
	//   40  103:aconst_null     
	//   41  104:areturn         
			}
			if(i < 0)
	//*  42  105:iload_2         
	//*  43  106:ifge            119
			{
				obj1 = ((Object) (((LLRBNode) (obj1)).getRight()));
	//   44  109:aload_3         
	//   45  110:invokeinterface #97  <Method LLRBNode LLRBNode.getRight()>
	//   46  115:astore_3        
			} else
	//*  47  116:goto            8
			{
				LLRBNode llrbnode1 = ((LLRBNode) (obj1)).getLeft();
	//   48  119:aload_3         
	//   49  120:invokeinterface #94  <Method LLRBNode LLRBNode.getLeft()>
	//   50  125:astore          5
				llrbnode = ((LLRBNode) (obj1));
	//   51  127:aload_3         
	//   52  128:astore          4
				obj1 = ((Object) (llrbnode1));
	//   53  130:aload           5
	//   54  132:astore_3        
			}
		}
	//*  55  133:goto            8
		obj1 = ((Object) (new StringBuilder()));
	//   56  136:new             #124 <Class StringBuilder>
	//   57  139:dup             
	//   58  140:invokespecial   #125 <Method void StringBuilder()>
	//   59  143:astore_3        
		((StringBuilder) (obj1)).append("Couldn't find successor key of non-present key: ");
	//   60  144:aload_3         
	//   61  145:ldc1            #149 <String "Couldn't find successor key of non-present key: ">
	//   62  147:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   63  150:pop             
		((StringBuilder) (obj1)).append(obj);
	//   64  151:aload_3         
	//   65  152:aload_1         
	//   66  153:invokevirtual   #134 <Method StringBuilder StringBuilder.append(Object)>
	//   67  156:pop             
		throw new IllegalArgumentException(((StringBuilder) (obj1)).toString());
	//   68  157:new             #136 <Class IllegalArgumentException>
	//   69  160:dup             
	//   70  161:aload_3         
	//   71  162:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   72  165:invokespecial   #143 <Method void IllegalArgumentException(String)>
	//   73  168:athrow          
	}

	public void inOrderTraversal(LLRBNode.NodeVisitor nodevisitor)
	{
		root.inOrderTraversal(nodevisitor);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field LLRBNode root>
	//    2    4:aload_1         
	//    3    5:invokeinterface #153 <Method void LLRBNode.inOrderTraversal(LLRBNode$NodeVisitor)>
	//    4   10:return          
	}

	public ImmutableSortedMap insert(Object obj, Object obj1)
	{
		return ((ImmutableSortedMap) (new RBTreeSortedMap(root.insert(obj, obj1, comparator).copy(((Object) (null)), ((Object) (null)), LLRBNode.Color.BLACK, ((LLRBNode) (null)), ((LLRBNode) (null))), comparator)));
	//    0    0:new             #2   <Class RBTreeSortedMap>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field LLRBNode root>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_0         
	//    7   11:getfield        #33  <Field Comparator comparator>
	//    8   14:invokeinterface #159 <Method LLRBNode LLRBNode.insert(Object, Object, Comparator)>
	//    9   19:aconst_null     
	//   10   20:aconst_null     
	//   11   21:getstatic       #165 <Field LLRBNode$Color LLRBNode$Color.BLACK>
	//   12   24:aconst_null     
	//   13   25:aconst_null     
	//   14   26:invokeinterface #169 <Method LLRBNode LLRBNode.copy(Object, Object, LLRBNode$Color, LLRBNode, LLRBNode)>
	//   15   31:aload_0         
	//   16   32:getfield        #33  <Field Comparator comparator>
	//   17   35:invokespecial   #39  <Method void RBTreeSortedMap(LLRBNode, Comparator)>
	//   18   38:areturn         
	}

	public boolean isEmpty()
	{
		return root.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field LLRBNode root>
	//    2    4:invokeinterface #80  <Method boolean LLRBNode.isEmpty()>
	//    3    9:ireturn         
	}

	public Iterator iterator()
	{
		return ((Iterator) (new ImmutableSortedMapIterator(root, ((Object) (null)), comparator, false)));
	//    0    0:new             #174 <Class ImmutableSortedMapIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field LLRBNode root>
	//    4    8:aconst_null     
	//    5    9:aload_0         
	//    6   10:getfield        #33  <Field Comparator comparator>
	//    7   13:iconst_0        
	//    8   14:invokespecial   #177 <Method void ImmutableSortedMapIterator(LLRBNode, Object, Comparator, boolean)>
	//    9   17:areturn         
	}

	public Iterator iteratorFrom(Object obj)
	{
		return ((Iterator) (new ImmutableSortedMapIterator(root, obj, comparator, false)));
	//    0    0:new             #174 <Class ImmutableSortedMapIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field LLRBNode root>
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #33  <Field Comparator comparator>
	//    7   13:iconst_0        
	//    8   14:invokespecial   #177 <Method void ImmutableSortedMapIterator(LLRBNode, Object, Comparator, boolean)>
	//    9   17:areturn         
	}

	public ImmutableSortedMap remove(Object obj)
	{
		if(!containsKey(obj))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #185 <Method boolean containsKey(Object)>
	//*   3    5:ifne            10
			return ((ImmutableSortedMap) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return ((ImmutableSortedMap) (new RBTreeSortedMap(root.remove(obj, comparator).copy(((Object) (null)), ((Object) (null)), LLRBNode.Color.BLACK, ((LLRBNode) (null)), ((LLRBNode) (null))), comparator)));
	//    6   10:new             #2   <Class RBTreeSortedMap>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #31  <Field LLRBNode root>
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #33  <Field Comparator comparator>
	//   13   23:invokeinterface #188 <Method LLRBNode LLRBNode.remove(Object, Comparator)>
	//   14   28:aconst_null     
	//   15   29:aconst_null     
	//   16   30:getstatic       #165 <Field LLRBNode$Color LLRBNode$Color.BLACK>
	//   17   33:aconst_null     
	//   18   34:aconst_null     
	//   19   35:invokeinterface #169 <Method LLRBNode LLRBNode.copy(Object, Object, LLRBNode$Color, LLRBNode, LLRBNode)>
	//   20   40:aload_0         
	//   21   41:getfield        #33  <Field Comparator comparator>
	//   22   44:invokespecial   #39  <Method void RBTreeSortedMap(LLRBNode, Comparator)>
	//   23   47:areturn         
	}

	public Iterator reverseIterator()
	{
		return ((Iterator) (new ImmutableSortedMapIterator(root, ((Object) (null)), comparator, true)));
	//    0    0:new             #174 <Class ImmutableSortedMapIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field LLRBNode root>
	//    4    8:aconst_null     
	//    5    9:aload_0         
	//    6   10:getfield        #33  <Field Comparator comparator>
	//    7   13:iconst_1        
	//    8   14:invokespecial   #177 <Method void ImmutableSortedMapIterator(LLRBNode, Object, Comparator, boolean)>
	//    9   17:areturn         
	}

	public Iterator reverseIteratorFrom(Object obj)
	{
		return ((Iterator) (new ImmutableSortedMapIterator(root, obj, comparator, true)));
	//    0    0:new             #174 <Class ImmutableSortedMapIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field LLRBNode root>
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #33  <Field Comparator comparator>
	//    7   13:iconst_1        
	//    8   14:invokespecial   #177 <Method void ImmutableSortedMapIterator(LLRBNode, Object, Comparator, boolean)>
	//    9   17:areturn         
	}

	public int size()
	{
		return root.count();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field LLRBNode root>
	//    2    4:invokeinterface #196 <Method int LLRBNode.count()>
	//    3    9:ireturn         
	}

	private Comparator comparator;
	private LLRBNode root;
}
