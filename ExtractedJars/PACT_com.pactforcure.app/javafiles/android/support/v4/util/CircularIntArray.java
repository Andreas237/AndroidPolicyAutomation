// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;


public final class CircularIntArray
{

	public CircularIntArray()
	{
		this(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokespecial   #15  <Method void CircularIntArray(int)>
	//    3    6:return          
	}

	public CircularIntArray(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		if(i < 1)
	//*   2    4:iload_1         
	//*   3    5:iconst_1        
	//*   4    6:icmpge          19
			throw new IllegalArgumentException("capacity must be >= 1");
	//    5    9:new             #20  <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:ldc1            #22  <String "capacity must be >= 1">
	//    8   15:invokespecial   #25  <Method void IllegalArgumentException(String)>
	//    9   18:athrow          
		if(i > 0x40000000)
	//*  10   19:iload_1         
	//*  11   20:ldc1            #26  <Int 0x40000000>
	//*  12   22:icmple          35
			throw new IllegalArgumentException("capacity must be <= 2^30");
	//   13   25:new             #20  <Class IllegalArgumentException>
	//   14   28:dup             
	//   15   29:ldc1            #28  <String "capacity must be <= 2^30">
	//   16   31:invokespecial   #25  <Method void IllegalArgumentException(String)>
	//   17   34:athrow          
		if(Integer.bitCount(i) != 1)
	//*  18   35:iload_1         
	//*  19   36:invokestatic    #34  <Method int Integer.bitCount(int)>
	//*  20   39:iconst_1        
	//*  21   40:icmpeq          67
			i = Integer.highestOneBit(i - 1) << 1;
	//   22   43:iload_1         
	//   23   44:iconst_1        
	//   24   45:isub            
	//   25   46:invokestatic    #37  <Method int Integer.highestOneBit(int)>
	//   26   49:iconst_1        
	//   27   50:ishl            
	//   28   51:istore_1        
		mCapacityBitmask = i - 1;
	//   29   52:aload_0         
	//   30   53:iload_1         
	//   31   54:iconst_1        
	//   32   55:isub            
	//   33   56:putfield        #39  <Field int mCapacityBitmask>
		mElements = new int[i];
	//   34   59:aload_0         
	//   35   60:iload_1         
	//   36   61:newarray        int[]
	//   37   63:putfield        #41  <Field int[] mElements>
	//   38   66:return          
	//*  39   67:goto            52
	}

	private void doubleCapacity()
	{
		int i = mElements.length;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int[] mElements>
	//    2    4:arraylength     
	//    3    5:istore_1        
		int j = i - mHead;
	//    4    6:iload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #44  <Field int mHead>
	//    7   11:isub            
	//    8   12:istore_2        
		int k = i << 1;
	//    9   13:iload_1         
	//   10   14:iconst_1        
	//   11   15:ishl            
	//   12   16:istore_3        
		if(k < 0)
	//*  13   17:iload_3         
	//*  14   18:ifge            31
		{
			throw new RuntimeException("Max array capacity exceeded");
	//   15   21:new             #46  <Class RuntimeException>
	//   16   24:dup             
	//   17   25:ldc1            #48  <String "Max array capacity exceeded">
	//   18   27:invokespecial   #49  <Method void RuntimeException(String)>
	//   19   30:athrow          
		} else
		{
			int ai[] = new int[k];
	//   20   31:iload_3         
	//   21   32:newarray        int[]
	//   22   34:astore          4
			System.arraycopy(((Object) (mElements)), mHead, ((Object) (ai)), 0, j);
	//   23   36:aload_0         
	//   24   37:getfield        #41  <Field int[] mElements>
	//   25   40:aload_0         
	//   26   41:getfield        #44  <Field int mHead>
	//   27   44:aload           4
	//   28   46:iconst_0        
	//   29   47:iload_2         
	//   30   48:invokestatic    #55  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (mElements)), 0, ((Object) (ai)), j, mHead);
	//   31   51:aload_0         
	//   32   52:getfield        #41  <Field int[] mElements>
	//   33   55:iconst_0        
	//   34   56:aload           4
	//   35   58:iload_2         
	//   36   59:aload_0         
	//   37   60:getfield        #44  <Field int mHead>
	//   38   63:invokestatic    #55  <Method void System.arraycopy(Object, int, Object, int, int)>
			mElements = ai;
	//   39   66:aload_0         
	//   40   67:aload           4
	//   41   69:putfield        #41  <Field int[] mElements>
			mHead = 0;
	//   42   72:aload_0         
	//   43   73:iconst_0        
	//   44   74:putfield        #44  <Field int mHead>
			mTail = i;
	//   45   77:aload_0         
	//   46   78:iload_1         
	//   47   79:putfield        #57  <Field int mTail>
			mCapacityBitmask = k - 1;
	//   48   82:aload_0         
	//   49   83:iload_3         
	//   50   84:iconst_1        
	//   51   85:isub            
	//   52   86:putfield        #39  <Field int mCapacityBitmask>
			return;
	//   53   89:return          
		}
	}

	public void addFirst(int i)
	{
		mHead = mHead - 1 & mCapacityBitmask;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #44  <Field int mHead>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:aload_0         
	//    6    8:getfield        #39  <Field int mCapacityBitmask>
	//    7   11:iand            
	//    8   12:putfield        #44  <Field int mHead>
		mElements[mHead] = i;
	//    9   15:aload_0         
	//   10   16:getfield        #41  <Field int[] mElements>
	//   11   19:aload_0         
	//   12   20:getfield        #44  <Field int mHead>
	//   13   23:iload_1         
	//   14   24:iastore         
		if(mHead == mTail)
	//*  15   25:aload_0         
	//*  16   26:getfield        #44  <Field int mHead>
	//*  17   29:aload_0         
	//*  18   30:getfield        #57  <Field int mTail>
	//*  19   33:icmpne          40
			doubleCapacity();
	//   20   36:aload_0         
	//   21   37:invokespecial   #60  <Method void doubleCapacity()>
	//   22   40:return          
	}

	public void addLast(int i)
	{
		mElements[mTail] = i;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int[] mElements>
	//    2    4:aload_0         
	//    3    5:getfield        #57  <Field int mTail>
	//    4    8:iload_1         
	//    5    9:iastore         
		mTail = mTail + 1 & mCapacityBitmask;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #57  <Field int mTail>
	//    9   15:iconst_1        
	//   10   16:iadd            
	//   11   17:aload_0         
	//   12   18:getfield        #39  <Field int mCapacityBitmask>
	//   13   21:iand            
	//   14   22:putfield        #57  <Field int mTail>
		if(mTail == mHead)
	//*  15   25:aload_0         
	//*  16   26:getfield        #57  <Field int mTail>
	//*  17   29:aload_0         
	//*  18   30:getfield        #44  <Field int mHead>
	//*  19   33:icmpne          40
			doubleCapacity();
	//   20   36:aload_0         
	//   21   37:invokespecial   #60  <Method void doubleCapacity()>
	//   22   40:return          
	}

	public void clear()
	{
		mTail = mHead;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #44  <Field int mHead>
	//    3    5:putfield        #57  <Field int mTail>
	//    4    8:return          
	}

	public int get(int i)
	{
		if(i < 0 || i >= size())
	//*   0    0:iload_1         
	//*   1    1:iflt            12
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #67  <Method int size()>
	//*   5    9:icmplt          20
			throw new ArrayIndexOutOfBoundsException();
	//    6   12:new             #69  <Class ArrayIndexOutOfBoundsException>
	//    7   15:dup             
	//    8   16:invokespecial   #70  <Method void ArrayIndexOutOfBoundsException()>
	//    9   19:athrow          
		else
			return mElements[mHead + i & mCapacityBitmask];
	//   10   20:aload_0         
	//   11   21:getfield        #41  <Field int[] mElements>
	//   12   24:aload_0         
	//   13   25:getfield        #44  <Field int mHead>
	//   14   28:iload_1         
	//   15   29:iadd            
	//   16   30:aload_0         
	//   17   31:getfield        #39  <Field int mCapacityBitmask>
	//   18   34:iand            
	//   19   35:iaload          
	//   20   36:ireturn         
	}

	public int getFirst()
	{
		if(mHead == mTail)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field int mHead>
	//*   2    4:aload_0         
	//*   3    5:getfield        #57  <Field int mTail>
	//*   4    8:icmpne          19
			throw new ArrayIndexOutOfBoundsException();
	//    5   11:new             #69  <Class ArrayIndexOutOfBoundsException>
	//    6   14:dup             
	//    7   15:invokespecial   #70  <Method void ArrayIndexOutOfBoundsException()>
	//    8   18:athrow          
		else
			return mElements[mHead];
	//    9   19:aload_0         
	//   10   20:getfield        #41  <Field int[] mElements>
	//   11   23:aload_0         
	//   12   24:getfield        #44  <Field int mHead>
	//   13   27:iaload          
	//   14   28:ireturn         
	}

	public int getLast()
	{
		if(mHead == mTail)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field int mHead>
	//*   2    4:aload_0         
	//*   3    5:getfield        #57  <Field int mTail>
	//*   4    8:icmpne          19
			throw new ArrayIndexOutOfBoundsException();
	//    5   11:new             #69  <Class ArrayIndexOutOfBoundsException>
	//    6   14:dup             
	//    7   15:invokespecial   #70  <Method void ArrayIndexOutOfBoundsException()>
	//    8   18:athrow          
		else
			return mElements[mTail - 1 & mCapacityBitmask];
	//    9   19:aload_0         
	//   10   20:getfield        #41  <Field int[] mElements>
	//   11   23:aload_0         
	//   12   24:getfield        #57  <Field int mTail>
	//   13   27:iconst_1        
	//   14   28:isub            
	//   15   29:aload_0         
	//   16   30:getfield        #39  <Field int mCapacityBitmask>
	//   17   33:iand            
	//   18   34:iaload          
	//   19   35:ireturn         
	}

	public boolean isEmpty()
	{
		return mHead == mTail;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int mHead>
	//    2    4:aload_0         
	//    3    5:getfield        #57  <Field int mTail>
	//    4    8:icmpne          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public int popFirst()
	{
		if(mHead == mTail)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field int mHead>
	//*   2    4:aload_0         
	//*   3    5:getfield        #57  <Field int mTail>
	//*   4    8:icmpne          19
		{
			throw new ArrayIndexOutOfBoundsException();
	//    5   11:new             #69  <Class ArrayIndexOutOfBoundsException>
	//    6   14:dup             
	//    7   15:invokespecial   #70  <Method void ArrayIndexOutOfBoundsException()>
	//    8   18:athrow          
		} else
		{
			int i = mElements[mHead];
	//    9   19:aload_0         
	//   10   20:getfield        #41  <Field int[] mElements>
	//   11   23:aload_0         
	//   12   24:getfield        #44  <Field int mHead>
	//   13   27:iaload          
	//   14   28:istore_1        
			mHead = mHead + 1 & mCapacityBitmask;
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #44  <Field int mHead>
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:aload_0         
	//   21   37:getfield        #39  <Field int mCapacityBitmask>
	//   22   40:iand            
	//   23   41:putfield        #44  <Field int mHead>
			return i;
	//   24   44:iload_1         
	//   25   45:ireturn         
		}
	}

	public int popLast()
	{
		if(mHead == mTail)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field int mHead>
	//*   2    4:aload_0         
	//*   3    5:getfield        #57  <Field int mTail>
	//*   4    8:icmpne          19
		{
			throw new ArrayIndexOutOfBoundsException();
	//    5   11:new             #69  <Class ArrayIndexOutOfBoundsException>
	//    6   14:dup             
	//    7   15:invokespecial   #70  <Method void ArrayIndexOutOfBoundsException()>
	//    8   18:athrow          
		} else
		{
			int i = mTail - 1 & mCapacityBitmask;
	//    9   19:aload_0         
	//   10   20:getfield        #57  <Field int mTail>
	//   11   23:iconst_1        
	//   12   24:isub            
	//   13   25:aload_0         
	//   14   26:getfield        #39  <Field int mCapacityBitmask>
	//   15   29:iand            
	//   16   30:istore_1        
			int j = mElements[i];
	//   17   31:aload_0         
	//   18   32:getfield        #41  <Field int[] mElements>
	//   19   35:iload_1         
	//   20   36:iaload          
	//   21   37:istore_2        
			mTail = i;
	//   22   38:aload_0         
	//   23   39:iload_1         
	//   24   40:putfield        #57  <Field int mTail>
			return j;
	//   25   43:iload_2         
	//   26   44:ireturn         
		}
	}

	public void removeFromEnd(int i)
	{
		if(i <= 0)
	//*   0    0:iload_1         
	//*   1    1:ifgt            5
			return;
	//    2    4:return          
		if(i > size())
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #67  <Method int size()>
	//*   6   10:icmple          21
		{
			throw new ArrayIndexOutOfBoundsException();
	//    7   13:new             #69  <Class ArrayIndexOutOfBoundsException>
	//    8   16:dup             
	//    9   17:invokespecial   #70  <Method void ArrayIndexOutOfBoundsException()>
	//   10   20:athrow          
		} else
		{
			mTail = mTail - i & mCapacityBitmask;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #57  <Field int mTail>
	//   14   26:iload_1         
	//   15   27:isub            
	//   16   28:aload_0         
	//   17   29:getfield        #39  <Field int mCapacityBitmask>
	//   18   32:iand            
	//   19   33:putfield        #57  <Field int mTail>
			return;
	//   20   36:return          
		}
	}

	public void removeFromStart(int i)
	{
		if(i <= 0)
	//*   0    0:iload_1         
	//*   1    1:ifgt            5
			return;
	//    2    4:return          
		if(i > size())
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #67  <Method int size()>
	//*   6   10:icmple          21
		{
			throw new ArrayIndexOutOfBoundsException();
	//    7   13:new             #69  <Class ArrayIndexOutOfBoundsException>
	//    8   16:dup             
	//    9   17:invokespecial   #70  <Method void ArrayIndexOutOfBoundsException()>
	//   10   20:athrow          
		} else
		{
			mHead = mHead + i & mCapacityBitmask;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #44  <Field int mHead>
	//   14   26:iload_1         
	//   15   27:iadd            
	//   16   28:aload_0         
	//   17   29:getfield        #39  <Field int mCapacityBitmask>
	//   18   32:iand            
	//   19   33:putfield        #44  <Field int mHead>
			return;
	//   20   36:return          
		}
	}

	public int size()
	{
		return mTail - mHead & mCapacityBitmask;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int mTail>
	//    2    4:aload_0         
	//    3    5:getfield        #44  <Field int mHead>
	//    4    8:isub            
	//    5    9:aload_0         
	//    6   10:getfield        #39  <Field int mCapacityBitmask>
	//    7   13:iand            
	//    8   14:ireturn         
	}

	private int mCapacityBitmask;
	private int mElements[];
	private int mHead;
	private int mTail;
}
