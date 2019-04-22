// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.collection;

import java.util.Iterator;

// Referenced classes of package com.firebase.client.collection:
//			RBTreeSortedMap

static class RBTreeSortedMap$Builder$Base1_2
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

			public RBTreeSortedMap.Builder.BooleanChunk next()
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
				RBTreeSortedMap.Builder.BooleanChunk booleanchunk = new RBTreeSortedMap.Builder.BooleanChunk();
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
			final RBTreeSortedMap.Builder.Base1_2 this$0;

			
			{
				this$0 = RBTreeSortedMap.Builder.Base1_2.this;
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
	static int access$000(RBTreeSortedMap$Builder$Base1_2 rbtreesortedmap$builder$base1_2)
	{
		return rbtreesortedmap$builder$base1_2.length;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int length>
	//    2    4:ireturn         
	}

*/


/*
	static long access$100(RBTreeSortedMap$Builder$Base1_2 rbtreesortedmap$builder$base1_2)
	{
		return rbtreesortedmap$builder$base1_2.value;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field long value>
	//    2    4:lreturn         
	}

*/

	public RBTreeSortedMap$Builder$Base1_2(int i)
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
