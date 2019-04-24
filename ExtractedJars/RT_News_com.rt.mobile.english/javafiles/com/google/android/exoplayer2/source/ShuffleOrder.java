// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import java.util.Arrays;
import java.util.Random;

public interface ShuffleOrder
{
	public static class DefaultShuffleOrder
		implements ShuffleOrder
	{

		private static int[] createShuffledList(int i, Random random1)
		{
			int ai[] = new int[i];
		//    0    0:iload_0         
		//    1    1:newarray        int[]
		//    2    3:astore          5
			int k;
			for(int j = 0; j < i; j = k)
		//*   3    5:iconst_0        
		//*   4    6:istore_2        
		//*   5    7:iload_2         
		//*   6    8:iload_0         
		//*   7    9:icmpge          43
			{
				k = j + 1;
		//    8   12:iload_2         
		//    9   13:iconst_1        
		//   10   14:iadd            
		//   11   15:istore_3        
				int l = random1.nextInt(k);
		//   12   16:aload_1         
		//   13   17:iload_3         
		//   14   18:invokevirtual   #45  <Method int Random.nextInt(int)>
		//   15   21:istore          4
				ai[j] = ai[l];
		//   16   23:aload           5
		//   17   25:iload_2         
		//   18   26:aload           5
		//   19   28:iload           4
		//   20   30:iaload          
		//   21   31:iastore         
				ai[l] = j;
		//   22   32:aload           5
		//   23   34:iload           4
		//   24   36:iload_2         
		//   25   37:iastore         
			}

		//   26   38:iload_3         
		//   27   39:istore_2        
		//*  28   40:goto            7
			return ai;
		//   29   43:aload           5
		//   30   45:areturn         
		}

		public ShuffleOrder cloneAndClear()
		{
			return ((ShuffleOrder) (new DefaultShuffleOrder(0, new Random(random.nextLong()))));
		//    0    0:new             #2   <Class ShuffleOrder$DefaultShuffleOrder>
		//    1    3:dup             
		//    2    4:iconst_0        
		//    3    5:new             #16  <Class Random>
		//    4    8:dup             
		//    5    9:aload_0         
		//    6   10:getfield        #39  <Field Random random>
		//    7   13:invokevirtual   #51  <Method long Random.nextLong()>
		//    8   16:invokespecial   #27  <Method void Random(long)>
		//    9   19:invokespecial   #22  <Method void ShuffleOrder$DefaultShuffleOrder(int, Random)>
		//   10   22:areturn         
		}

		public ShuffleOrder cloneAndInsert(int i, int j)
		{
			int ai[] = new int[j];
		//    0    0:iload_2         
		//    1    1:newarray        int[]
		//    2    3:astore          7
			int ai1[] = new int[j];
		//    3    5:iload_2         
		//    4    6:newarray        int[]
		//    5    8:astore          8
			boolean flag = false;
		//    6   10:iconst_0        
		//    7   11:istore          6
			int i1;
			for(int k = 0; k < j; k = i1)
		//*   8   13:iconst_0        
		//*   9   14:istore_3        
		//*  10   15:iload_3         
		//*  11   16:iload_2         
		//*  12   17:icmpge          81
			{
				ai[k] = random.nextInt(shuffled.length + 1);
		//   13   20:aload           7
		//   14   22:iload_3         
		//   15   23:aload_0         
		//   16   24:getfield        #39  <Field Random random>
		//   17   27:aload_0         
		//   18   28:getfield        #37  <Field int[] shuffled>
		//   19   31:arraylength     
		//   20   32:iconst_1        
		//   21   33:iadd            
		//   22   34:invokevirtual   #45  <Method int Random.nextInt(int)>
		//   23   37:iastore         
				Random random1 = random;
		//   24   38:aload_0         
		//   25   39:getfield        #39  <Field Random random>
		//   26   42:astore          9
				i1 = k + 1;
		//   27   44:iload_3         
		//   28   45:iconst_1        
		//   29   46:iadd            
		//   30   47:istore          4
				int k1 = random1.nextInt(i1);
		//   31   49:aload           9
		//   32   51:iload           4
		//   33   53:invokevirtual   #45  <Method int Random.nextInt(int)>
		//   34   56:istore          5
				ai1[k] = ai1[k1];
		//   35   58:aload           8
		//   36   60:iload_3         
		//   37   61:aload           8
		//   38   63:iload           5
		//   39   65:iaload          
		//   40   66:iastore         
				ai1[k1] = k + i;
		//   41   67:aload           8
		//   42   69:iload           5
		//   43   71:iload_3         
		//   44   72:iload_1         
		//   45   73:iadd            
		//   46   74:iastore         
			}

		//   47   75:iload           4
		//   48   77:istore_3        
		//*  49   78:goto            15
			Arrays.sort(ai);
		//   50   81:aload           7
		//   51   83:invokestatic    #59  <Method void Arrays.sort(int[])>
			int ai2[] = new int[shuffled.length + j];
		//   52   86:aload_0         
		//   53   87:getfield        #37  <Field int[] shuffled>
		//   54   90:arraylength     
		//   55   91:iload_2         
		//   56   92:iadd            
		//   57   93:newarray        int[]
		//   58   95:astore          9
			int l1 = 0;
		//   59   97:iconst_0        
		//   60   98:istore          5
			int j1 = l1;
		//   61  100:iload           5
		//   62  102:istore          4
			for(int l = ((int) (flag)); l < shuffled.length + j; l++)
		//*  63  104:iload           6
		//*  64  106:istore_3        
		//*  65  107:iload_3         
		//*  66  108:aload_0         
		//*  67  109:getfield        #37  <Field int[] shuffled>
		//*  68  112:arraylength     
		//*  69  113:iload_2         
		//*  70  114:iadd            
		//*  71  115:icmpge          194
			{
				if(l1 < j && j1 == ai[l1])
		//*  72  118:iload           5
		//*  73  120:iload_2         
		//*  74  121:icmpge          152
		//*  75  124:iload           4
		//*  76  126:aload           7
		//*  77  128:iload           5
		//*  78  130:iaload          
		//*  79  131:icmpne          152
				{
					ai2[l] = ai1[l1];
		//   80  134:aload           9
		//   81  136:iload_3         
		//   82  137:aload           8
		//   83  139:iload           5
		//   84  141:iaload          
		//   85  142:iastore         
					l1++;
		//   86  143:iload           5
		//   87  145:iconst_1        
		//   88  146:iadd            
		//   89  147:istore          5
					continue;
		//   90  149:goto            187
				}
				ai2[l] = shuffled[j1];
		//   91  152:aload           9
		//   92  154:iload_3         
		//   93  155:aload_0         
		//   94  156:getfield        #37  <Field int[] shuffled>
		//   95  159:iload           4
		//   96  161:iaload          
		//   97  162:iastore         
				if(ai2[l] >= i)
		//*  98  163:aload           9
		//*  99  165:iload_3         
		//* 100  166:iaload          
		//* 101  167:iload_1         
		//* 102  168:icmplt          181
					ai2[l] = ai2[l] + j;
		//  103  171:aload           9
		//  104  173:iload_3         
		//  105  174:aload           9
		//  106  176:iload_3         
		//  107  177:iaload          
		//  108  178:iload_2         
		//  109  179:iadd            
		//  110  180:iastore         
				j1++;
		//  111  181:iload           4
		//  112  183:iconst_1        
		//  113  184:iadd            
		//  114  185:istore          4
			}

		//  115  187:iload_3         
		//  116  188:iconst_1        
		//  117  189:iadd            
		//  118  190:istore_3        
		//* 119  191:goto            107
			return ((ShuffleOrder) (new DefaultShuffleOrder(ai2, new Random(random.nextLong()))));
		//  120  194:new             #2   <Class ShuffleOrder$DefaultShuffleOrder>
		//  121  197:dup             
		//  122  198:aload           9
		//  123  200:new             #16  <Class Random>
		//  124  203:dup             
		//  125  204:aload_0         
		//  126  205:getfield        #39  <Field Random random>
		//  127  208:invokevirtual   #51  <Method long Random.nextLong()>
		//  128  211:invokespecial   #27  <Method void Random(long)>
		//  129  214:invokespecial   #34  <Method void ShuffleOrder$DefaultShuffleOrder(int[], Random)>
		//  130  217:areturn         
		}

		public ShuffleOrder cloneAndRemove(int i)
		{
			int ai[] = shuffled;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field int[] shuffled>
		//    2    4:astore          6
			int j = 0;
		//    3    6:iconst_0        
		//    4    7:istore_2        
			ai = new int[ai.length - 1];
		//    5    8:aload           6
		//    6   10:arraylength     
		//    7   11:iconst_1        
		//    8   12:isub            
		//    9   13:newarray        int[]
		//   10   15:astore          6
			boolean flag = false;
		//   11   17:iconst_0        
		//   12   18:istore_3        
			for(; j < shuffled.length; j++)
		//*  13   19:iload_2         
		//*  14   20:aload_0         
		//*  15   21:getfield        #37  <Field int[] shuffled>
		//*  16   24:arraylength     
		//*  17   25:icmpge          103
			{
				if(shuffled[j] == i)
		//*  18   28:aload_0         
		//*  19   29:getfield        #37  <Field int[] shuffled>
		//*  20   32:iload_2         
		//*  21   33:iaload          
		//*  22   34:iload_1         
		//*  23   35:icmpne          43
				{
					flag = true;
		//   24   38:iconst_1        
		//   25   39:istore_3        
					continue;
		//   26   40:goto            96
				}
				int k;
				if(flag)
		//*  27   43:iload_3         
		//*  28   44:ifeq            55
					k = j - 1;
		//   29   47:iload_2         
		//   30   48:iconst_1        
		//   31   49:isub            
		//   32   50:istore          4
				else
		//*  33   52:goto            58
					k = j;
		//   34   55:iload_2         
		//   35   56:istore          4
				int l;
				if(shuffled[j] > i)
		//*  36   58:aload_0         
		//*  37   59:getfield        #37  <Field int[] shuffled>
		//*  38   62:iload_2         
		//*  39   63:iaload          
		//*  40   64:iload_1         
		//*  41   65:icmple          81
					l = shuffled[j] - 1;
		//   42   68:aload_0         
		//   43   69:getfield        #37  <Field int[] shuffled>
		//   44   72:iload_2         
		//   45   73:iaload          
		//   46   74:iconst_1        
		//   47   75:isub            
		//   48   76:istore          5
				else
		//*  49   78:goto            89
					l = shuffled[j];
		//   50   81:aload_0         
		//   51   82:getfield        #37  <Field int[] shuffled>
		//   52   85:iload_2         
		//   53   86:iaload          
		//   54   87:istore          5
				ai[k] = l;
		//   55   89:aload           6
		//   56   91:iload           4
		//   57   93:iload           5
		//   58   95:iastore         
			}

		//   59   96:iload_2         
		//   60   97:iconst_1        
		//   61   98:iadd            
		//   62   99:istore_2        
		//*  63  100:goto            19
			return ((ShuffleOrder) (new DefaultShuffleOrder(ai, new Random(random.nextLong()))));
		//   64  103:new             #2   <Class ShuffleOrder$DefaultShuffleOrder>
		//   65  106:dup             
		//   66  107:aload           6
		//   67  109:new             #16  <Class Random>
		//   68  112:dup             
		//   69  113:aload_0         
		//   70  114:getfield        #39  <Field Random random>
		//   71  117:invokevirtual   #51  <Method long Random.nextLong()>
		//   72  120:invokespecial   #27  <Method void Random(long)>
		//   73  123:invokespecial   #34  <Method void ShuffleOrder$DefaultShuffleOrder(int[], Random)>
		//   74  126:areturn         
		}

		public int getFirstIndex()
		{
			if(shuffled.length > 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #37  <Field int[] shuffled>
		//*   2    4:arraylength     
		//*   3    5:ifle            15
				return shuffled[0];
		//    4    8:aload_0         
		//    5    9:getfield        #37  <Field int[] shuffled>
		//    6   12:iconst_0        
		//    7   13:iaload          
		//    8   14:ireturn         
			else
				return -1;
		//    9   15:iconst_m1       
		//   10   16:ireturn         
		}

		public int getLastIndex()
		{
			if(shuffled.length > 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #37  <Field int[] shuffled>
		//*   2    4:arraylength     
		//*   3    5:ifle            21
				return shuffled[shuffled.length - 1];
		//    4    8:aload_0         
		//    5    9:getfield        #37  <Field int[] shuffled>
		//    6   12:aload_0         
		//    7   13:getfield        #37  <Field int[] shuffled>
		//    8   16:arraylength     
		//    9   17:iconst_1        
		//   10   18:isub            
		//   11   19:iaload          
		//   12   20:ireturn         
			else
				return -1;
		//   13   21:iconst_m1       
		//   14   22:ireturn         
		}

		public int getLength()
		{
			return shuffled.length;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field int[] shuffled>
		//    2    4:arraylength     
		//    3    5:ireturn         
		}

		public int getNextIndex(int i)
		{
			i = indexInShuffled[i] + 1;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field int[] indexInShuffled>
		//    2    4:iload_1         
		//    3    5:iaload          
		//    4    6:iconst_1        
		//    5    7:iadd            
		//    6    8:istore_1        
			if(i < shuffled.length)
		//*   7    9:iload_1         
		//*   8   10:aload_0         
		//*   9   11:getfield        #37  <Field int[] shuffled>
		//*  10   14:arraylength     
		//*  11   15:icmpge          25
				return shuffled[i];
		//   12   18:aload_0         
		//   13   19:getfield        #37  <Field int[] shuffled>
		//   14   22:iload_1         
		//   15   23:iaload          
		//   16   24:ireturn         
			else
				return -1;
		//   17   25:iconst_m1       
		//   18   26:ireturn         
		}

		public int getPreviousIndex(int i)
		{
			int j = indexInShuffled[i];
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field int[] indexInShuffled>
		//    2    4:iload_1         
		//    3    5:iaload          
		//    4    6:istore_2        
			i = -1;
		//    5    7:iconst_m1       
		//    6    8:istore_1        
			j--;
		//    7    9:iload_2         
		//    8   10:iconst_1        
		//    9   11:isub            
		//   10   12:istore_2        
			if(j >= 0)
		//*  11   13:iload_2         
		//*  12   14:iflt            24
				i = shuffled[j];
		//   13   17:aload_0         
		//   14   18:getfield        #37  <Field int[] shuffled>
		//   15   21:iload_2         
		//   16   22:iaload          
		//   17   23:istore_1        
			return i;
		//   18   24:iload_1         
		//   19   25:ireturn         
		}

		private final int indexInShuffled[];
		private final Random random;
		private final int shuffled[];

		public DefaultShuffleOrder(int i)
		{
			this(i, new Random());
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:new             #16  <Class Random>
		//    3    5:dup             
		//    4    6:invokespecial   #19  <Method void Random()>
		//    5    9:invokespecial   #22  <Method void ShuffleOrder$DefaultShuffleOrder(int, Random)>
		//    6   12:return          
		}

		public DefaultShuffleOrder(int i, long l)
		{
			this(i, new Random(l));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:new             #16  <Class Random>
		//    3    5:dup             
		//    4    6:lload_2         
		//    5    7:invokespecial   #27  <Method void Random(long)>
		//    6   10:invokespecial   #22  <Method void ShuffleOrder$DefaultShuffleOrder(int, Random)>
		//    7   13:return          
		}

		private DefaultShuffleOrder(int i, Random random1)
		{
			this(createShuffledList(i, random1), random1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokestatic    #31  <Method int[] createShuffledList(int, Random)>
		//    4    6:aload_2         
		//    5    7:invokespecial   #34  <Method void ShuffleOrder$DefaultShuffleOrder(int[], Random)>
		//    6   10:return          
		}

		private DefaultShuffleOrder(int ai[], Random random1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #35  <Method void Object()>
			shuffled = ai;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #37  <Field int[] shuffled>
			random = random1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #39  <Field Random random>
			int i = 0;
		//    8   14:iconst_0        
		//    9   15:istore_3        
			indexInShuffled = new int[ai.length];
		//   10   16:aload_0         
		//   11   17:aload_1         
		//   12   18:arraylength     
		//   13   19:newarray        int[]
		//   14   21:putfield        #41  <Field int[] indexInShuffled>
			for(; i < ai.length; i++)
		//*  15   24:iload_3         
		//*  16   25:aload_1         
		//*  17   26:arraylength     
		//*  18   27:icmpge          46
				indexInShuffled[ai[i]] = i;
		//   19   30:aload_0         
		//   20   31:getfield        #41  <Field int[] indexInShuffled>
		//   21   34:aload_1         
		//   22   35:iload_3         
		//   23   36:iaload          
		//   24   37:iload_3         
		//   25   38:iastore         

		//   26   39:iload_3         
		//   27   40:iconst_1        
		//   28   41:iadd            
		//   29   42:istore_3        
		//*  30   43:goto            24
		//   31   46:return          
		}
	}

	public static final class UnshuffledShuffleOrder
		implements ShuffleOrder
	{

		public ShuffleOrder cloneAndClear()
		{
			return ((ShuffleOrder) (new UnshuffledShuffleOrder(0)));
		//    0    0:new             #2   <Class ShuffleOrder$UnshuffledShuffleOrder>
		//    1    3:dup             
		//    2    4:iconst_0        
		//    3    5:invokespecial   #21  <Method void ShuffleOrder$UnshuffledShuffleOrder(int)>
		//    4    8:areturn         
		}

		public ShuffleOrder cloneAndInsert(int i, int j)
		{
			return ((ShuffleOrder) (new UnshuffledShuffleOrder(length + j)));
		//    0    0:new             #2   <Class ShuffleOrder$UnshuffledShuffleOrder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #16  <Field int length>
		//    4    8:iload_2         
		//    5    9:iadd            
		//    6   10:invokespecial   #21  <Method void ShuffleOrder$UnshuffledShuffleOrder(int)>
		//    7   13:areturn         
		}

		public ShuffleOrder cloneAndRemove(int i)
		{
			return ((ShuffleOrder) (new UnshuffledShuffleOrder(length - 1)));
		//    0    0:new             #2   <Class ShuffleOrder$UnshuffledShuffleOrder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #16  <Field int length>
		//    4    8:iconst_1        
		//    5    9:isub            
		//    6   10:invokespecial   #21  <Method void ShuffleOrder$UnshuffledShuffleOrder(int)>
		//    7   13:areturn         
		}

		public int getFirstIndex()
		{
			return length <= 0 ? -1 : 0;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field int length>
		//    2    4:ifle            9
		//    3    7:iconst_0        
		//    4    8:ireturn         
		//    5    9:iconst_m1       
		//    6   10:ireturn         
		}

		public int getLastIndex()
		{
			if(length > 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field int length>
		//*   2    4:ifle            14
				return length - 1;
		//    3    7:aload_0         
		//    4    8:getfield        #16  <Field int length>
		//    5   11:iconst_1        
		//    6   12:isub            
		//    7   13:ireturn         
			else
				return -1;
		//    8   14:iconst_m1       
		//    9   15:ireturn         
		}

		public int getLength()
		{
			return length;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field int length>
		//    2    4:ireturn         
		}

		public int getNextIndex(int i)
		{
			i++;
		//    0    0:iload_1         
		//    1    1:iconst_1        
		//    2    2:iadd            
		//    3    3:istore_1        
			if(i < length)
		//*   4    4:iload_1         
		//*   5    5:aload_0         
		//*   6    6:getfield        #16  <Field int length>
		//*   7    9:icmpge          14
				return i;
		//    8   12:iload_1         
		//    9   13:ireturn         
			else
				return -1;
		//   10   14:iconst_m1       
		//   11   15:ireturn         
		}

		public int getPreviousIndex(int i)
		{
			i--;
		//    0    0:iload_1         
		//    1    1:iconst_1        
		//    2    2:isub            
		//    3    3:istore_1        
			if(i >= 0)
		//*   4    4:iload_1         
		//*   5    5:iflt            10
				return i;
		//    6    8:iload_1         
		//    7    9:ireturn         
			else
				return -1;
		//    8   10:iconst_m1       
		//    9   11:ireturn         
		}

		private final int length;

		public UnshuffledShuffleOrder(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			length = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #16  <Field int length>
		//    5    9:return          
		}
	}


	public abstract ShuffleOrder cloneAndClear();

	public abstract ShuffleOrder cloneAndInsert(int i, int j);

	public abstract ShuffleOrder cloneAndRemove(int i);

	public abstract int getFirstIndex();

	public abstract int getLastIndex();

	public abstract int getLength();

	public abstract int getNextIndex(int i);

	public abstract int getPreviousIndex(int i);
}
