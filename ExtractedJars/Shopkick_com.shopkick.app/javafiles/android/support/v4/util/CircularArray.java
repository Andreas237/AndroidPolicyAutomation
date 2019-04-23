// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;


public final class CircularArray
{

	public CircularArray()
	{
		this(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokespecial   #17  <Method void CircularArray(int)>
	//    3    6:return          
	}

	public CircularArray(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		if(i >= 1)
	//*   2    4:iload_1         
	//*   3    5:iconst_1        
	//*   4    6:icmplt          63
		{
			if(i <= 0x40000000)
	//*   5    9:iload_1         
	//*   6   10:ldc1            #21  <Int 0x40000000>
	//*   7   12:icmpgt          53
			{
				int j = i;
	//    8   15:iload_1         
	//    9   16:istore_2        
				if(Integer.bitCount(i) != 1)
	//*  10   17:iload_1         
	//*  11   18:invokestatic    #27  <Method int Integer.bitCount(int)>
	//*  12   21:iconst_1        
	//*  13   22:icmpeq          34
					j = Integer.highestOneBit(i - 1) << 1;
	//   14   25:iload_1         
	//   15   26:iconst_1        
	//   16   27:isub            
	//   17   28:invokestatic    #30  <Method int Integer.highestOneBit(int)>
	//   18   31:iconst_1        
	//   19   32:ishl            
	//   20   33:istore_2        
				mCapacityBitmask = j - 1;
	//   21   34:aload_0         
	//   22   35:iload_2         
	//   23   36:iconst_1        
	//   24   37:isub            
	//   25   38:putfield        #32  <Field int mCapacityBitmask>
				mElements = (Object[])new Object[j];
	//   26   41:aload_0         
	//   27   42:iload_2         
	//   28   43:anewarray       Object[]
	//   29   46:checkcast       #33  <Class Object[]>
	//   30   49:putfield        #35  <Field Object[] mElements>
				return;
	//   31   52:return          
			} else
			{
				throw new IllegalArgumentException("capacity must be <= 2^30");
	//   32   53:new             #37  <Class IllegalArgumentException>
	//   33   56:dup             
	//   34   57:ldc1            #39  <String "capacity must be <= 2^30">
	//   35   59:invokespecial   #42  <Method void IllegalArgumentException(String)>
	//   36   62:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("capacity must be >= 1");
	//   37   63:new             #37  <Class IllegalArgumentException>
	//   38   66:dup             
	//   39   67:ldc1            #44  <String "capacity must be >= 1">
	//   40   69:invokespecial   #42  <Method void IllegalArgumentException(String)>
	//   41   72:athrow          
		}
	}

	private void doubleCapacity()
	{
		Object aobj[] = mElements;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Object[] mElements>
	//    2    4:astore          5
		int i = aobj.length;
	//    3    6:aload           5
	//    4    8:arraylength     
	//    5    9:istore_1        
		int j = mHead;
	//    6   10:aload_0         
	//    7   11:getfield        #47  <Field int mHead>
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
	//*  18   26:iflt            89
		{
			Object aobj1[] = new Object[l];
	//   19   29:iload           4
	//   20   31:anewarray       Object[]
	//   21   34:astore          6
			System.arraycopy(((Object) (aobj)), j, ((Object) (aobj1)), 0, k);
	//   22   36:aload           5
	//   23   38:iload_2         
	//   24   39:aload           6
	//   25   41:iconst_0        
	//   26   42:iload_3         
	//   27   43:invokestatic    #53  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (mElements)), 0, ((Object) (aobj1)), k, mHead);
	//   28   46:aload_0         
	//   29   47:getfield        #35  <Field Object[] mElements>
	//   30   50:iconst_0        
	//   31   51:aload           6
	//   32   53:iload_3         
	//   33   54:aload_0         
	//   34   55:getfield        #47  <Field int mHead>
	//   35   58:invokestatic    #53  <Method void System.arraycopy(Object, int, Object, int, int)>
			mElements = (Object[])aobj1;
	//   36   61:aload_0         
	//   37   62:aload           6
	//   38   64:checkcast       #33  <Class Object[]>
	//   39   67:putfield        #35  <Field Object[] mElements>
			mHead = 0;
	//   40   70:aload_0         
	//   41   71:iconst_0        
	//   42   72:putfield        #47  <Field int mHead>
			mTail = i;
	//   43   75:aload_0         
	//   44   76:iload_1         
	//   45   77:putfield        #55  <Field int mTail>
			mCapacityBitmask = l - 1;
	//   46   80:aload_0         
	//   47   81:iload           4
	//   48   83:iconst_1        
	//   49   84:isub            
	//   50   85:putfield        #32  <Field int mCapacityBitmask>
			return;
	//   51   88:return          
		} else
		{
			throw new RuntimeException("Max array capacity exceeded");
	//   52   89:new             #57  <Class RuntimeException>
	//   53   92:dup             
	//   54   93:ldc1            #59  <String "Max array capacity exceeded">
	//   55   95:invokespecial   #60  <Method void RuntimeException(String)>
	//   56   98:athrow          
		}
	}

	public void addFirst(Object obj)
	{
		mHead = mHead - 1 & mCapacityBitmask;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #47  <Field int mHead>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:aload_0         
	//    6    8:getfield        #32  <Field int mCapacityBitmask>
	//    7   11:iand            
	//    8   12:putfield        #47  <Field int mHead>
		Object aobj[] = mElements;
	//    9   15:aload_0         
	//   10   16:getfield        #35  <Field Object[] mElements>
	//   11   19:astore_3        
		int i = mHead;
	//   12   20:aload_0         
	//   13   21:getfield        #47  <Field int mHead>
	//   14   24:istore_2        
		aobj[i] = obj;
	//   15   25:aload_3         
	//   16   26:iload_2         
	//   17   27:aload_1         
	//   18   28:aastore         
		if(i == mTail)
	//*  19   29:iload_2         
	//*  20   30:aload_0         
	//*  21   31:getfield        #55  <Field int mTail>
	//*  22   34:icmpne          41
			doubleCapacity();
	//   23   37:aload_0         
	//   24   38:invokespecial   #64  <Method void doubleCapacity()>
	//   25   41:return          
	}

	public void addLast(Object obj)
	{
		Object aobj[] = mElements;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Object[] mElements>
	//    2    4:astore_3        
		int i = mTail;
	//    3    5:aload_0         
	//    4    6:getfield        #55  <Field int mTail>
	//    5    9:istore_2        
		aobj[i] = obj;
	//    6   10:aload_3         
	//    7   11:iload_2         
	//    8   12:aload_1         
	//    9   13:aastore         
		mTail = mCapacityBitmask & i + 1;
	//   10   14:aload_0         
	//   11   15:aload_0         
	//   12   16:getfield        #32  <Field int mCapacityBitmask>
	//   13   19:iload_2         
	//   14   20:iconst_1        
	//   15   21:iadd            
	//   16   22:iand            
	//   17   23:putfield        #55  <Field int mTail>
		if(mTail == mHead)
	//*  18   26:aload_0         
	//*  19   27:getfield        #55  <Field int mTail>
	//*  20   30:aload_0         
	//*  21   31:getfield        #47  <Field int mHead>
	//*  22   34:icmpne          41
			doubleCapacity();
	//   23   37:aload_0         
	//   24   38:invokespecial   #64  <Method void doubleCapacity()>
	//   25   41:return          
	}

	public void clear()
	{
		removeFromStart(size());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #72  <Method int size()>
	//    3    5:invokevirtual   #75  <Method void removeFromStart(int)>
	//    4    8:return          
	}

	public Object get(int i)
	{
		if(i >= 0 && i < size())
	//*   0    0:iload_1         
	//*   1    1:iflt            33
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #72  <Method int size()>
	//*   5    9:icmpge          33
		{
			Object aobj[] = mElements;
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field Object[] mElements>
	//    8   16:astore_3        
			int j = mHead;
	//    9   17:aload_0         
	//   10   18:getfield        #47  <Field int mHead>
	//   11   21:istore_2        
			return aobj[mCapacityBitmask & j + i];
	//   12   22:aload_3         
	//   13   23:aload_0         
	//   14   24:getfield        #32  <Field int mCapacityBitmask>
	//   15   27:iload_2         
	//   16   28:iload_1         
	//   17   29:iadd            
	//   18   30:iand            
	//   19   31:aaload          
	//   20   32:areturn         
		} else
		{
			throw new ArrayIndexOutOfBoundsException();
	//   21   33:new             #79  <Class ArrayIndexOutOfBoundsException>
	//   22   36:dup             
	//   23   37:invokespecial   #80  <Method void ArrayIndexOutOfBoundsException()>
	//   24   40:athrow          
		}
	}

	public Object getFirst()
	{
		int i = mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mHead>
	//    2    4:istore_1        
		if(i != mTail)
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #55  <Field int mTail>
	//*   6   10:icmpeq          20
			return mElements[i];
	//    7   13:aload_0         
	//    8   14:getfield        #35  <Field Object[] mElements>
	//    9   17:iload_1         
	//   10   18:aaload          
	//   11   19:areturn         
		else
			throw new ArrayIndexOutOfBoundsException();
	//   12   20:new             #79  <Class ArrayIndexOutOfBoundsException>
	//   13   23:dup             
	//   14   24:invokespecial   #80  <Method void ArrayIndexOutOfBoundsException()>
	//   15   27:athrow          
	}

	public Object getLast()
	{
		int i = mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mHead>
	//    2    4:istore_1        
		int j = mTail;
	//    3    5:aload_0         
	//    4    6:getfield        #55  <Field int mTail>
	//    5    9:istore_2        
		if(i != j)
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpeq          29
			return mElements[j - 1 & mCapacityBitmask];
	//    9   15:aload_0         
	//   10   16:getfield        #35  <Field Object[] mElements>
	//   11   19:iload_2         
	//   12   20:iconst_1        
	//   13   21:isub            
	//   14   22:aload_0         
	//   15   23:getfield        #32  <Field int mCapacityBitmask>
	//   16   26:iand            
	//   17   27:aaload          
	//   18   28:areturn         
		else
			throw new ArrayIndexOutOfBoundsException();
	//   19   29:new             #79  <Class ArrayIndexOutOfBoundsException>
	//   20   32:dup             
	//   21   33:invokespecial   #80  <Method void ArrayIndexOutOfBoundsException()>
	//   22   36:athrow          
	}

	public boolean isEmpty()
	{
		return mHead == mTail;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mHead>
	//    2    4:aload_0         
	//    3    5:getfield        #55  <Field int mTail>
	//    4    8:icmpne          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public Object popFirst()
	{
		int i = mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mHead>
	//    2    4:istore_1        
		if(i != mTail)
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #55  <Field int mTail>
	//*   6   10:icmpeq          40
		{
			Object aobj[] = mElements;
	//    7   13:aload_0         
	//    8   14:getfield        #35  <Field Object[] mElements>
	//    9   17:astore_2        
			Object obj = aobj[i];
	//   10   18:aload_2         
	//   11   19:iload_1         
	//   12   20:aaload          
	//   13   21:astore_3        
			aobj[i] = null;
	//   14   22:aload_2         
	//   15   23:iload_1         
	//   16   24:aconst_null     
	//   17   25:aastore         
			mHead = i + 1 & mCapacityBitmask;
	//   18   26:aload_0         
	//   19   27:iload_1         
	//   20   28:iconst_1        
	//   21   29:iadd            
	//   22   30:aload_0         
	//   23   31:getfield        #32  <Field int mCapacityBitmask>
	//   24   34:iand            
	//   25   35:putfield        #47  <Field int mHead>
			return obj;
	//   26   38:aload_3         
	//   27   39:areturn         
		} else
		{
			throw new ArrayIndexOutOfBoundsException();
	//   28   40:new             #79  <Class ArrayIndexOutOfBoundsException>
	//   29   43:dup             
	//   30   44:invokespecial   #80  <Method void ArrayIndexOutOfBoundsException()>
	//   31   47:athrow          
		}
	}

	public Object popLast()
	{
		int i = mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mHead>
	//    2    4:istore_1        
		int k = mTail;
	//    3    5:aload_0         
	//    4    6:getfield        #55  <Field int mTail>
	//    5    9:istore_2        
		if(i != k)
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpeq          46
		{
			int j = mCapacityBitmask & k - 1;
	//    9   15:aload_0         
	//   10   16:getfield        #32  <Field int mCapacityBitmask>
	//   11   19:iload_2         
	//   12   20:iconst_1        
	//   13   21:isub            
	//   14   22:iand            
	//   15   23:istore_1        
			Object aobj[] = mElements;
	//   16   24:aload_0         
	//   17   25:getfield        #35  <Field Object[] mElements>
	//   18   28:astore_3        
			Object obj = aobj[j];
	//   19   29:aload_3         
	//   20   30:iload_1         
	//   21   31:aaload          
	//   22   32:astore          4
			aobj[j] = null;
	//   23   34:aload_3         
	//   24   35:iload_1         
	//   25   36:aconst_null     
	//   26   37:aastore         
			mTail = j;
	//   27   38:aload_0         
	//   28   39:iload_1         
	//   29   40:putfield        #55  <Field int mTail>
			return obj;
	//   30   43:aload           4
	//   31   45:areturn         
		} else
		{
			throw new ArrayIndexOutOfBoundsException();
	//   32   46:new             #79  <Class ArrayIndexOutOfBoundsException>
	//   33   49:dup             
	//   34   50:invokespecial   #80  <Method void ArrayIndexOutOfBoundsException()>
	//   35   53:athrow          
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
	//*   5    7:invokevirtual   #72  <Method int size()>
	//*   6   10:icmpgt          124
		{
			int j = 0;
	//    7   13:iconst_0        
	//    8   14:istore_2        
			int l = mTail;
	//    9   15:aload_0         
	//   10   16:getfield        #55  <Field int mTail>
	//   11   19:istore_3        
			if(i < l)
	//*  12   20:iload_1         
	//*  13   21:iload_3         
	//*  14   22:icmpge          29
				j = l - i;
	//   15   25:iload_3         
	//   16   26:iload_1         
	//   17   27:isub            
	//   18   28:istore_2        
			l = j;
	//   19   29:iload_2         
	//   20   30:istore_3        
			int i1;
			do
			{
				i1 = mTail;
	//   21   31:aload_0         
	//   22   32:getfield        #55  <Field int mTail>
	//   23   35:istore          4
				if(l >= i1)
					break;
	//   24   37:iload_3         
	//   25   38:iload           4
	//   26   40:icmpge          57
				mElements[l] = null;
	//   27   43:aload_0         
	//   28   44:getfield        #35  <Field Object[] mElements>
	//   29   47:iload_3         
	//   30   48:aconst_null     
	//   31   49:aastore         
				l++;
	//   32   50:iload_3         
	//   33   51:iconst_1        
	//   34   52:iadd            
	//   35   53:istore_3        
			} while(true);
	//   36   54:goto            31
			j = i1 - j;
	//   37   57:iload           4
	//   38   59:iload_2         
	//   39   60:isub            
	//   40   61:istore_2        
			i -= j;
	//   41   62:iload_1         
	//   42   63:iload_2         
	//   43   64:isub            
	//   44   65:istore_1        
			mTail = i1 - j;
	//   45   66:aload_0         
	//   46   67:iload           4
	//   47   69:iload_2         
	//   48   70:isub            
	//   49   71:putfield        #55  <Field int mTail>
			if(i > 0)
	//*  50   74:iload_1         
	//*  51   75:ifle            123
			{
				mTail = mElements.length;
	//   52   78:aload_0         
	//   53   79:aload_0         
	//   54   80:getfield        #35  <Field Object[] mElements>
	//   55   83:arraylength     
	//   56   84:putfield        #55  <Field int mTail>
				int k = mTail - i;
	//   57   87:aload_0         
	//   58   88:getfield        #55  <Field int mTail>
	//   59   91:iload_1         
	//   60   92:isub            
	//   61   93:istore_2        
				for(i = k; i < mTail; i++)
	//*  62   94:iload_2         
	//*  63   95:istore_1        
	//*  64   96:iload_1         
	//*  65   97:aload_0         
	//*  66   98:getfield        #55  <Field int mTail>
	//*  67  101:icmpge          118
					mElements[i] = null;
	//   68  104:aload_0         
	//   69  105:getfield        #35  <Field Object[] mElements>
	//   70  108:iload_1         
	//   71  109:aconst_null     
	//   72  110:aastore         

	//   73  111:iload_1         
	//   74  112:iconst_1        
	//   75  113:iadd            
	//   76  114:istore_1        
	//*  77  115:goto            96
				mTail = k;
	//   78  118:aload_0         
	//   79  119:iload_2         
	//   80  120:putfield        #55  <Field int mTail>
			}
			return;
	//   81  123:return          
		} else
		{
			throw new ArrayIndexOutOfBoundsException();
	//   82  124:new             #79  <Class ArrayIndexOutOfBoundsException>
	//   83  127:dup             
	//   84  128:invokespecial   #80  <Method void ArrayIndexOutOfBoundsException()>
	//   85  131:athrow          
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
	//*   5    7:invokevirtual   #72  <Method int size()>
	//*   6   10:icmpgt          123
		{
			int k = mElements.length;
	//    7   13:aload_0         
	//    8   14:getfield        #35  <Field Object[] mElements>
	//    9   17:arraylength     
	//   10   18:istore_3        
			int l = mHead;
	//   11   19:aload_0         
	//   12   20:getfield        #47  <Field int mHead>
	//   13   23:istore          4
			int j = k;
	//   14   25:iload_3         
	//   15   26:istore_2        
			if(i < k - l)
	//*  16   27:iload_1         
	//*  17   28:iload_3         
	//*  18   29:iload           4
	//*  19   31:isub            
	//*  20   32:icmpge          40
				j = l + i;
	//   21   35:iload           4
	//   22   37:iload_1         
	//   23   38:iadd            
	//   24   39:istore_2        
			for(k = mHead; k < j; k++)
	//*  25   40:aload_0         
	//*  26   41:getfield        #47  <Field int mHead>
	//*  27   44:istore_3        
	//*  28   45:iload_3         
	//*  29   46:iload_2         
	//*  30   47:icmpge          64
				mElements[k] = null;
	//   31   50:aload_0         
	//   32   51:getfield        #35  <Field Object[] mElements>
	//   33   54:iload_3         
	//   34   55:aconst_null     
	//   35   56:aastore         

	//   36   57:iload_3         
	//   37   58:iconst_1        
	//   38   59:iadd            
	//   39   60:istore_3        
	//*  40   61:goto            45
			k = mHead;
	//   41   64:aload_0         
	//   42   65:getfield        #47  <Field int mHead>
	//   43   68:istore_3        
			l = j - k;
	//   44   69:iload_2         
	//   45   70:iload_3         
	//   46   71:isub            
	//   47   72:istore          4
			j = i - l;
	//   48   74:iload_1         
	//   49   75:iload           4
	//   50   77:isub            
	//   51   78:istore_2        
			mHead = mCapacityBitmask & k + l;
	//   52   79:aload_0         
	//   53   80:aload_0         
	//   54   81:getfield        #32  <Field int mCapacityBitmask>
	//   55   84:iload_3         
	//   56   85:iload           4
	//   57   87:iadd            
	//   58   88:iand            
	//   59   89:putfield        #47  <Field int mHead>
			if(j > 0)
	//*  60   92:iload_2         
	//*  61   93:ifle            122
			{
				for(i = 0; i < j; i++)
	//*  62   96:iconst_0        
	//*  63   97:istore_1        
	//*  64   98:iload_1         
	//*  65   99:iload_2         
	//*  66  100:icmpge          117
					mElements[i] = null;
	//   67  103:aload_0         
	//   68  104:getfield        #35  <Field Object[] mElements>
	//   69  107:iload_1         
	//   70  108:aconst_null     
	//   71  109:aastore         

	//   72  110:iload_1         
	//   73  111:iconst_1        
	//   74  112:iadd            
	//   75  113:istore_1        
	//*  76  114:goto            98
				mHead = j;
	//   77  117:aload_0         
	//   78  118:iload_2         
	//   79  119:putfield        #47  <Field int mHead>
			}
			return;
	//   80  122:return          
		} else
		{
			throw new ArrayIndexOutOfBoundsException();
	//   81  123:new             #79  <Class ArrayIndexOutOfBoundsException>
	//   82  126:dup             
	//   83  127:invokespecial   #80  <Method void ArrayIndexOutOfBoundsException()>
	//   84  130:athrow          
		}
	}

	public int size()
	{
		return mTail - mHead & mCapacityBitmask;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int mTail>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field int mHead>
	//    4    8:isub            
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field int mCapacityBitmask>
	//    7   13:iand            
	//    8   14:ireturn         
	}

	private int mCapacityBitmask;
	private Object mElements[];
	private int mHead;
	private int mTail;
}
