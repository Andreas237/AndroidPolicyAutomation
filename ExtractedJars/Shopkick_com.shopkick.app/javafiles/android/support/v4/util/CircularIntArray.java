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
		if(i >= 1)
	//*   2    4:iload_1         
	//*   3    5:iconst_1        
	//*   4    6:icmplt          59
		{
			if(i <= 0x40000000)
	//*   5    9:iload_1         
	//*   6   10:ldc1            #19  <Int 0x40000000>
	//*   7   12:icmpgt          49
			{
				int j = i;
	//    8   15:iload_1         
	//    9   16:istore_2        
				if(Integer.bitCount(i) != 1)
	//*  10   17:iload_1         
	//*  11   18:invokestatic    #25  <Method int Integer.bitCount(int)>
	//*  12   21:iconst_1        
	//*  13   22:icmpeq          34
					j = Integer.highestOneBit(i - 1) << 1;
	//   14   25:iload_1         
	//   15   26:iconst_1        
	//   16   27:isub            
	//   17   28:invokestatic    #28  <Method int Integer.highestOneBit(int)>
	//   18   31:iconst_1        
	//   19   32:ishl            
	//   20   33:istore_2        
				mCapacityBitmask = j - 1;
	//   21   34:aload_0         
	//   22   35:iload_2         
	//   23   36:iconst_1        
	//   24   37:isub            
	//   25   38:putfield        #30  <Field int mCapacityBitmask>
				mElements = new int[j];
	//   26   41:aload_0         
	//   27   42:iload_2         
	//   28   43:newarray        int[]
	//   29   45:putfield        #32  <Field int[] mElements>
				return;
	//   30   48:return          
			} else
			{
				throw new IllegalArgumentException("capacity must be <= 2^30");
	//   31   49:new             #34  <Class IllegalArgumentException>
	//   32   52:dup             
	//   33   53:ldc1            #36  <String "capacity must be <= 2^30">
	//   34   55:invokespecial   #39  <Method void IllegalArgumentException(String)>
	//   35   58:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("capacity must be >= 1");
	//   36   59:new             #34  <Class IllegalArgumentException>
	//   37   62:dup             
	//   38   63:ldc1            #41  <String "capacity must be >= 1">
	//   39   65:invokespecial   #39  <Method void IllegalArgumentException(String)>
	//   40   68:athrow          
		}
	}

	private void doubleCapacity()
	{
		int ai[] = mElements;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int[] mElements>
	//    2    4:astore          5
		int i = ai.length;
	//    3    6:aload           5
	//    4    8:arraylength     
	//    5    9:istore_1        
		int j = mHead;
	//    6   10:aload_0         
	//    7   11:getfield        #44  <Field int mHead>
	//    8   14:istore_2        
		int k = i - j;
	//    9   15:iload_1         
	//   10   16:iload_2         
	//   11   17:isub            
	//   12   18:istore_3        
		int l = i << 1;
	//   13   19:iload_1         
	//   14   20:iconst_1        
	//   15   21:ishl            
	//   16   22:istore          4
		if(l >= 0)
	//*  17   24:iload           4
	//*  18   26:iflt            85
		{
			int ai1[] = new int[l];
	//   19   29:iload           4
	//   20   31:newarray        int[]
	//   21   33:astore          6
			System.arraycopy(((Object) (ai)), j, ((Object) (ai1)), 0, k);
	//   22   35:aload           5
	//   23   37:iload_2         
	//   24   38:aload           6
	//   25   40:iconst_0        
	//   26   41:iload_3         
	//   27   42:invokestatic    #50  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (mElements)), 0, ((Object) (ai1)), k, mHead);
	//   28   45:aload_0         
	//   29   46:getfield        #32  <Field int[] mElements>
	//   30   49:iconst_0        
	//   31   50:aload           6
	//   32   52:iload_3         
	//   33   53:aload_0         
	//   34   54:getfield        #44  <Field int mHead>
	//   35   57:invokestatic    #50  <Method void System.arraycopy(Object, int, Object, int, int)>
			mElements = ai1;
	//   36   60:aload_0         
	//   37   61:aload           6
	//   38   63:putfield        #32  <Field int[] mElements>
			mHead = 0;
	//   39   66:aload_0         
	//   40   67:iconst_0        
	//   41   68:putfield        #44  <Field int mHead>
			mTail = i;
	//   42   71:aload_0         
	//   43   72:iload_1         
	//   44   73:putfield        #52  <Field int mTail>
			mCapacityBitmask = l - 1;
	//   45   76:aload_0         
	//   46   77:iload           4
	//   47   79:iconst_1        
	//   48   80:isub            
	//   49   81:putfield        #30  <Field int mCapacityBitmask>
			return;
	//   50   84:return          
		} else
		{
			throw new RuntimeException("Max array capacity exceeded");
	//   51   85:new             #54  <Class RuntimeException>
	//   52   88:dup             
	//   53   89:ldc1            #56  <String "Max array capacity exceeded">
	//   54   91:invokespecial   #57  <Method void RuntimeException(String)>
	//   55   94:athrow          
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
	//    6    8:getfield        #30  <Field int mCapacityBitmask>
	//    7   11:iand            
	//    8   12:putfield        #44  <Field int mHead>
		int ai[] = mElements;
	//    9   15:aload_0         
	//   10   16:getfield        #32  <Field int[] mElements>
	//   11   19:astore_3        
		int j = mHead;
	//   12   20:aload_0         
	//   13   21:getfield        #44  <Field int mHead>
	//   14   24:istore_2        
		ai[j] = i;
	//   15   25:aload_3         
	//   16   26:iload_2         
	//   17   27:iload_1         
	//   18   28:iastore         
		if(j == mTail)
	//*  19   29:iload_2         
	//*  20   30:aload_0         
	//*  21   31:getfield        #52  <Field int mTail>
	//*  22   34:icmpne          41
			doubleCapacity();
	//   23   37:aload_0         
	//   24   38:invokespecial   #60  <Method void doubleCapacity()>
	//   25   41:return          
	}

	public void addLast(int i)
	{
		int ai[] = mElements;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int[] mElements>
	//    2    4:astore_3        
		int j = mTail;
	//    3    5:aload_0         
	//    4    6:getfield        #52  <Field int mTail>
	//    5    9:istore_2        
		ai[j] = i;
	//    6   10:aload_3         
	//    7   11:iload_2         
	//    8   12:iload_1         
	//    9   13:iastore         
		mTail = mCapacityBitmask & j + 1;
	//   10   14:aload_0         
	//   11   15:aload_0         
	//   12   16:getfield        #30  <Field int mCapacityBitmask>
	//   13   19:iload_2         
	//   14   20:iconst_1        
	//   15   21:iadd            
	//   16   22:iand            
	//   17   23:putfield        #52  <Field int mTail>
		if(mTail == mHead)
	//*  18   26:aload_0         
	//*  19   27:getfield        #52  <Field int mTail>
	//*  20   30:aload_0         
	//*  21   31:getfield        #44  <Field int mHead>
	//*  22   34:icmpne          41
			doubleCapacity();
	//   23   37:aload_0         
	//   24   38:invokespecial   #60  <Method void doubleCapacity()>
	//   25   41:return          
	}

	public void clear()
	{
		mTail = mHead;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #44  <Field int mHead>
	//    3    5:putfield        #52  <Field int mTail>
	//    4    8:return          
	}

	public int get(int i)
	{
		if(i >= 0 && i < size())
	//*   0    0:iload_1         
	//*   1    1:iflt            33
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #67  <Method int size()>
	//*   5    9:icmpge          33
		{
			int ai[] = mElements;
	//    6   12:aload_0         
	//    7   13:getfield        #32  <Field int[] mElements>
	//    8   16:astore_3        
			int j = mHead;
	//    9   17:aload_0         
	//   10   18:getfield        #44  <Field int mHead>
	//   11   21:istore_2        
			return ai[mCapacityBitmask & j + i];
	//   12   22:aload_3         
	//   13   23:aload_0         
	//   14   24:getfield        #30  <Field int mCapacityBitmask>
	//   15   27:iload_2         
	//   16   28:iload_1         
	//   17   29:iadd            
	//   18   30:iand            
	//   19   31:iaload          
	//   20   32:ireturn         
		} else
		{
			throw new ArrayIndexOutOfBoundsException();
	//   21   33:new             #69  <Class ArrayIndexOutOfBoundsException>
	//   22   36:dup             
	//   23   37:invokespecial   #70  <Method void ArrayIndexOutOfBoundsException()>
	//   24   40:athrow          
		}
	}

	public int getFirst()
	{
		int i = mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int mHead>
	//    2    4:istore_1        
		if(i != mTail)
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #52  <Field int mTail>
	//*   6   10:icmpeq          20
			return mElements[i];
	//    7   13:aload_0         
	//    8   14:getfield        #32  <Field int[] mElements>
	//    9   17:iload_1         
	//   10   18:iaload          
	//   11   19:ireturn         
		else
			throw new ArrayIndexOutOfBoundsException();
	//   12   20:new             #69  <Class ArrayIndexOutOfBoundsException>
	//   13   23:dup             
	//   14   24:invokespecial   #70  <Method void ArrayIndexOutOfBoundsException()>
	//   15   27:athrow          
	}

	public int getLast()
	{
		int i = mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int mHead>
	//    2    4:istore_1        
		int j = mTail;
	//    3    5:aload_0         
	//    4    6:getfield        #52  <Field int mTail>
	//    5    9:istore_2        
		if(i != j)
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpeq          29
			return mElements[j - 1 & mCapacityBitmask];
	//    9   15:aload_0         
	//   10   16:getfield        #32  <Field int[] mElements>
	//   11   19:iload_2         
	//   12   20:iconst_1        
	//   13   21:isub            
	//   14   22:aload_0         
	//   15   23:getfield        #30  <Field int mCapacityBitmask>
	//   16   26:iand            
	//   17   27:iaload          
	//   18   28:ireturn         
		else
			throw new ArrayIndexOutOfBoundsException();
	//   19   29:new             #69  <Class ArrayIndexOutOfBoundsException>
	//   20   32:dup             
	//   21   33:invokespecial   #70  <Method void ArrayIndexOutOfBoundsException()>
	//   22   36:athrow          
	}

	public boolean isEmpty()
	{
		return mHead == mTail;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int mHead>
	//    2    4:aload_0         
	//    3    5:getfield        #52  <Field int mTail>
	//    4    8:icmpne          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public int popFirst()
	{
		int i = mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int mHead>
	//    2    4:istore_1        
		if(i != mTail)
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #52  <Field int mTail>
	//*   6   10:icmpeq          34
		{
			int j = mElements[i];
	//    7   13:aload_0         
	//    8   14:getfield        #32  <Field int[] mElements>
	//    9   17:iload_1         
	//   10   18:iaload          
	//   11   19:istore_2        
			mHead = i + 1 & mCapacityBitmask;
	//   12   20:aload_0         
	//   13   21:iload_1         
	//   14   22:iconst_1        
	//   15   23:iadd            
	//   16   24:aload_0         
	//   17   25:getfield        #30  <Field int mCapacityBitmask>
	//   18   28:iand            
	//   19   29:putfield        #44  <Field int mHead>
			return j;
	//   20   32:iload_2         
	//   21   33:ireturn         
		} else
		{
			throw new ArrayIndexOutOfBoundsException();
	//   22   34:new             #69  <Class ArrayIndexOutOfBoundsException>
	//   23   37:dup             
	//   24   38:invokespecial   #70  <Method void ArrayIndexOutOfBoundsException()>
	//   25   41:athrow          
		}
	}

	public int popLast()
	{
		int i = mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int mHead>
	//    2    4:istore_1        
		int k = mTail;
	//    3    5:aload_0         
	//    4    6:getfield        #52  <Field int mTail>
	//    5    9:istore_2        
		if(i != k)
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpeq          38
		{
			int j = mCapacityBitmask & k - 1;
	//    9   15:aload_0         
	//   10   16:getfield        #30  <Field int mCapacityBitmask>
	//   11   19:iload_2         
	//   12   20:iconst_1        
	//   13   21:isub            
	//   14   22:iand            
	//   15   23:istore_1        
			k = mElements[j];
	//   16   24:aload_0         
	//   17   25:getfield        #32  <Field int[] mElements>
	//   18   28:iload_1         
	//   19   29:iaload          
	//   20   30:istore_2        
			mTail = j;
	//   21   31:aload_0         
	//   22   32:iload_1         
	//   23   33:putfield        #52  <Field int mTail>
			return k;
	//   24   36:iload_2         
	//   25   37:ireturn         
		} else
		{
			throw new ArrayIndexOutOfBoundsException();
	//   26   38:new             #69  <Class ArrayIndexOutOfBoundsException>
	//   27   41:dup             
	//   28   42:invokespecial   #70  <Method void ArrayIndexOutOfBoundsException()>
	//   29   45:athrow          
		}
	}

	public void removeFromEnd(int i)
	{
		if(i <= 0)
	//*   0    0:iload_1         
	//*   1    1:ifgt            5
			return;
	//    2    4:return          
		if(i <= size())
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #67  <Method int size()>
	//*   6   10:icmpgt          31
		{
			int j = mTail;
	//    7   13:aload_0         
	//    8   14:getfield        #52  <Field int mTail>
	//    9   17:istore_2        
			mTail = mCapacityBitmask & j - i;
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #30  <Field int mCapacityBitmask>
	//   13   23:iload_2         
	//   14   24:iload_1         
	//   15   25:isub            
	//   16   26:iand            
	//   17   27:putfield        #52  <Field int mTail>
			return;
	//   18   30:return          
		} else
		{
			throw new ArrayIndexOutOfBoundsException();
	//   19   31:new             #69  <Class ArrayIndexOutOfBoundsException>
	//   20   34:dup             
	//   21   35:invokespecial   #70  <Method void ArrayIndexOutOfBoundsException()>
	//   22   38:athrow          
		}
	}

	public void removeFromStart(int i)
	{
		if(i <= 0)
	//*   0    0:iload_1         
	//*   1    1:ifgt            5
			return;
	//    2    4:return          
		if(i <= size())
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #67  <Method int size()>
	//*   6   10:icmpgt          31
		{
			int j = mHead;
	//    7   13:aload_0         
	//    8   14:getfield        #44  <Field int mHead>
	//    9   17:istore_2        
			mHead = mCapacityBitmask & j + i;
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #30  <Field int mCapacityBitmask>
	//   13   23:iload_2         
	//   14   24:iload_1         
	//   15   25:iadd            
	//   16   26:iand            
	//   17   27:putfield        #44  <Field int mHead>
			return;
	//   18   30:return          
		} else
		{
			throw new ArrayIndexOutOfBoundsException();
	//   19   31:new             #69  <Class ArrayIndexOutOfBoundsException>
	//   20   34:dup             
	//   21   35:invokespecial   #70  <Method void ArrayIndexOutOfBoundsException()>
	//   22   38:athrow          
		}
	}

	public int size()
	{
		return mTail - mHead & mCapacityBitmask;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int mTail>
	//    2    4:aload_0         
	//    3    5:getfield        #44  <Field int mHead>
	//    4    8:isub            
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field int mCapacityBitmask>
	//    7   13:iand            
	//    8   14:ireturn         
	}

	private int mCapacityBitmask;
	private int mElements[];
	private int mHead;
	private int mTail;
}
