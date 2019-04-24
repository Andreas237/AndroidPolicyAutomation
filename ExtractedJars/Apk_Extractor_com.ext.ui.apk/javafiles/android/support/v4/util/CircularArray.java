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
		if(i < 1)
	//*   2    4:iload_1         
	//*   3    5:iconst_1        
	//*   4    6:icmpge          19
			throw new IllegalArgumentException("capacity must be >= 1");
	//    5    9:new             #22  <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:ldc1            #24  <String "capacity must be >= 1">
	//    8   15:invokespecial   #27  <Method void IllegalArgumentException(String)>
	//    9   18:athrow          
		if(i > 0x40000000)
	//*  10   19:iload_1         
	//*  11   20:ldc1            #28  <Int 0x40000000>
	//*  12   22:icmple          35
			throw new IllegalArgumentException("capacity must be <= 2^30");
	//   13   25:new             #22  <Class IllegalArgumentException>
	//   14   28:dup             
	//   15   29:ldc1            #30  <String "capacity must be <= 2^30">
	//   16   31:invokespecial   #27  <Method void IllegalArgumentException(String)>
	//   17   34:athrow          
		int j = i;
	//   18   35:iload_1         
	//   19   36:istore_2        
		if(Integer.bitCount(i) != 1)
	//*  20   37:iload_1         
	//*  21   38:invokestatic    #36  <Method int Integer.bitCount(int)>
	//*  22   41:iconst_1        
	//*  23   42:icmpeq          54
			j = Integer.highestOneBit(i - 1) << 1;
	//   24   45:iload_1         
	//   25   46:iconst_1        
	//   26   47:isub            
	//   27   48:invokestatic    #39  <Method int Integer.highestOneBit(int)>
	//   28   51:iconst_1        
	//   29   52:ishl            
	//   30   53:istore_2        
		mCapacityBitmask = j - 1;
	//   31   54:aload_0         
	//   32   55:iload_2         
	//   33   56:iconst_1        
	//   34   57:isub            
	//   35   58:putfield        #41  <Field int mCapacityBitmask>
		mElements = (Object[])new Object[j];
	//   36   61:aload_0         
	//   37   62:iload_2         
	//   38   63:anewarray       Object[]
	//   39   66:checkcast       #42  <Class Object[]>
	//   40   69:putfield        #44  <Field Object[] mElements>
	//   41   72:return          
	}

	private void doubleCapacity()
	{
		int i = mElements.length;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Object[] mElements>
	//    2    4:arraylength     
	//    3    5:istore_1        
		int j = i - mHead;
	//    4    6:iload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #47  <Field int mHead>
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
	//   15   21:new             #49  <Class RuntimeException>
	//   16   24:dup             
	//   17   25:ldc1            #51  <String "Max array capacity exceeded">
	//   18   27:invokespecial   #52  <Method void RuntimeException(String)>
	//   19   30:athrow          
		} else
		{
			Object aobj[] = new Object[k];
	//   20   31:iload_3         
	//   21   32:anewarray       Object[]
	//   22   35:astore          4
			System.arraycopy(((Object) (mElements)), mHead, ((Object) (aobj)), 0, j);
	//   23   37:aload_0         
	//   24   38:getfield        #44  <Field Object[] mElements>
	//   25   41:aload_0         
	//   26   42:getfield        #47  <Field int mHead>
	//   27   45:aload           4
	//   28   47:iconst_0        
	//   29   48:iload_2         
	//   30   49:invokestatic    #58  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (mElements)), 0, ((Object) (aobj)), j, mHead);
	//   31   52:aload_0         
	//   32   53:getfield        #44  <Field Object[] mElements>
	//   33   56:iconst_0        
	//   34   57:aload           4
	//   35   59:iload_2         
	//   36   60:aload_0         
	//   37   61:getfield        #47  <Field int mHead>
	//   38   64:invokestatic    #58  <Method void System.arraycopy(Object, int, Object, int, int)>
			mElements = (Object[])aobj;
	//   39   67:aload_0         
	//   40   68:aload           4
	//   41   70:checkcast       #42  <Class Object[]>
	//   42   73:putfield        #44  <Field Object[] mElements>
			mHead = 0;
	//   43   76:aload_0         
	//   44   77:iconst_0        
	//   45   78:putfield        #47  <Field int mHead>
			mTail = i;
	//   46   81:aload_0         
	//   47   82:iload_1         
	//   48   83:putfield        #60  <Field int mTail>
			mCapacityBitmask = k - 1;
	//   49   86:aload_0         
	//   50   87:iload_3         
	//   51   88:iconst_1        
	//   52   89:isub            
	//   53   90:putfield        #41  <Field int mCapacityBitmask>
			return;
	//   54   93:return          
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
	//    6    8:getfield        #41  <Field int mCapacityBitmask>
	//    7   11:iand            
	//    8   12:putfield        #47  <Field int mHead>
		mElements[mHead] = obj;
	//    9   15:aload_0         
	//   10   16:getfield        #44  <Field Object[] mElements>
	//   11   19:aload_0         
	//   12   20:getfield        #47  <Field int mHead>
	//   13   23:aload_1         
	//   14   24:aastore         
		if(mHead == mTail)
	//*  15   25:aload_0         
	//*  16   26:getfield        #47  <Field int mHead>
	//*  17   29:aload_0         
	//*  18   30:getfield        #60  <Field int mTail>
	//*  19   33:icmpne          40
			doubleCapacity();
	//   20   36:aload_0         
	//   21   37:invokespecial   #64  <Method void doubleCapacity()>
	//   22   40:return          
	}

	public void addLast(Object obj)
	{
		mElements[mTail] = obj;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Object[] mElements>
	//    2    4:aload_0         
	//    3    5:getfield        #60  <Field int mTail>
	//    4    8:aload_1         
	//    5    9:aastore         
		mTail = mTail + 1 & mCapacityBitmask;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #60  <Field int mTail>
	//    9   15:iconst_1        
	//   10   16:iadd            
	//   11   17:aload_0         
	//   12   18:getfield        #41  <Field int mCapacityBitmask>
	//   13   21:iand            
	//   14   22:putfield        #60  <Field int mTail>
		if(mTail == mHead)
	//*  15   25:aload_0         
	//*  16   26:getfield        #60  <Field int mTail>
	//*  17   29:aload_0         
	//*  18   30:getfield        #47  <Field int mHead>
	//*  19   33:icmpne          40
			doubleCapacity();
	//   20   36:aload_0         
	//   21   37:invokespecial   #64  <Method void doubleCapacity()>
	//   22   40:return          
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
		if(i < 0 || i >= size())
	//*   0    0:iload_1         
	//*   1    1:iflt            12
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #72  <Method int size()>
	//*   5    9:icmplt          20
			throw new ArrayIndexOutOfBoundsException();
	//    6   12:new             #79  <Class ArrayIndexOutOfBoundsException>
	//    7   15:dup             
	//    8   16:invokespecial   #80  <Method void ArrayIndexOutOfBoundsException()>
	//    9   19:athrow          
		else
			return mElements[mHead + i & mCapacityBitmask];
	//   10   20:aload_0         
	//   11   21:getfield        #44  <Field Object[] mElements>
	//   12   24:aload_0         
	//   13   25:getfield        #47  <Field int mHead>
	//   14   28:iload_1         
	//   15   29:iadd            
	//   16   30:aload_0         
	//   17   31:getfield        #41  <Field int mCapacityBitmask>
	//   18   34:iand            
	//   19   35:aaload          
	//   20   36:areturn         
	}

	public Object getFirst()
	{
		if(mHead == mTail)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field int mHead>
	//*   2    4:aload_0         
	//*   3    5:getfield        #60  <Field int mTail>
	//*   4    8:icmpne          19
			throw new ArrayIndexOutOfBoundsException();
	//    5   11:new             #79  <Class ArrayIndexOutOfBoundsException>
	//    6   14:dup             
	//    7   15:invokespecial   #80  <Method void ArrayIndexOutOfBoundsException()>
	//    8   18:athrow          
		else
			return mElements[mHead];
	//    9   19:aload_0         
	//   10   20:getfield        #44  <Field Object[] mElements>
	//   11   23:aload_0         
	//   12   24:getfield        #47  <Field int mHead>
	//   13   27:aaload          
	//   14   28:areturn         
	}

	public Object getLast()
	{
		if(mHead == mTail)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field int mHead>
	//*   2    4:aload_0         
	//*   3    5:getfield        #60  <Field int mTail>
	//*   4    8:icmpne          19
			throw new ArrayIndexOutOfBoundsException();
	//    5   11:new             #79  <Class ArrayIndexOutOfBoundsException>
	//    6   14:dup             
	//    7   15:invokespecial   #80  <Method void ArrayIndexOutOfBoundsException()>
	//    8   18:athrow          
		else
			return mElements[mTail - 1 & mCapacityBitmask];
	//    9   19:aload_0         
	//   10   20:getfield        #44  <Field Object[] mElements>
	//   11   23:aload_0         
	//   12   24:getfield        #60  <Field int mTail>
	//   13   27:iconst_1        
	//   14   28:isub            
	//   15   29:aload_0         
	//   16   30:getfield        #41  <Field int mCapacityBitmask>
	//   17   33:iand            
	//   18   34:aaload          
	//   19   35:areturn         
	}

	public boolean isEmpty()
	{
		return mHead == mTail;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mHead>
	//    2    4:aload_0         
	//    3    5:getfield        #60  <Field int mTail>
	//    4    8:icmpne          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public Object popFirst()
	{
		if(mHead == mTail)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field int mHead>
	//*   2    4:aload_0         
	//*   3    5:getfield        #60  <Field int mTail>
	//*   4    8:icmpne          19
		{
			throw new ArrayIndexOutOfBoundsException();
	//    5   11:new             #79  <Class ArrayIndexOutOfBoundsException>
	//    6   14:dup             
	//    7   15:invokespecial   #80  <Method void ArrayIndexOutOfBoundsException()>
	//    8   18:athrow          
		} else
		{
			Object obj = mElements[mHead];
	//    9   19:aload_0         
	//   10   20:getfield        #44  <Field Object[] mElements>
	//   11   23:aload_0         
	//   12   24:getfield        #47  <Field int mHead>
	//   13   27:aaload          
	//   14   28:astore_1        
			mElements[mHead] = null;
	//   15   29:aload_0         
	//   16   30:getfield        #44  <Field Object[] mElements>
	//   17   33:aload_0         
	//   18   34:getfield        #47  <Field int mHead>
	//   19   37:aconst_null     
	//   20   38:aastore         
			mHead = mHead + 1 & mCapacityBitmask;
	//   21   39:aload_0         
	//   22   40:aload_0         
	//   23   41:getfield        #47  <Field int mHead>
	//   24   44:iconst_1        
	//   25   45:iadd            
	//   26   46:aload_0         
	//   27   47:getfield        #41  <Field int mCapacityBitmask>
	//   28   50:iand            
	//   29   51:putfield        #47  <Field int mHead>
			return obj;
	//   30   54:aload_1         
	//   31   55:areturn         
		}
	}

	public Object popLast()
	{
		if(mHead == mTail)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field int mHead>
	//*   2    4:aload_0         
	//*   3    5:getfield        #60  <Field int mTail>
	//*   4    8:icmpne          19
		{
			throw new ArrayIndexOutOfBoundsException();
	//    5   11:new             #79  <Class ArrayIndexOutOfBoundsException>
	//    6   14:dup             
	//    7   15:invokespecial   #80  <Method void ArrayIndexOutOfBoundsException()>
	//    8   18:athrow          
		} else
		{
			int i = mTail - 1 & mCapacityBitmask;
	//    9   19:aload_0         
	//   10   20:getfield        #60  <Field int mTail>
	//   11   23:iconst_1        
	//   12   24:isub            
	//   13   25:aload_0         
	//   14   26:getfield        #41  <Field int mCapacityBitmask>
	//   15   29:iand            
	//   16   30:istore_1        
			Object obj = mElements[i];
	//   17   31:aload_0         
	//   18   32:getfield        #44  <Field Object[] mElements>
	//   19   35:iload_1         
	//   20   36:aaload          
	//   21   37:astore_2        
			mElements[i] = null;
	//   22   38:aload_0         
	//   23   39:getfield        #44  <Field Object[] mElements>
	//   24   42:iload_1         
	//   25   43:aconst_null     
	//   26   44:aastore         
			mTail = i;
	//   27   45:aload_0         
	//   28   46:iload_1         
	//   29   47:putfield        #60  <Field int mTail>
			return obj;
	//   30   50:aload_2         
	//   31   51:areturn         
		}
	}

	public void removeFromEnd(int i)
	{
		if(i > 0)
	//*   0    0:iload_1         
	//*   1    1:ifgt            5
	//*   2    4:return          
		{
			if(i > size())
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #72  <Method int size()>
	//*   6   10:icmple          21
				throw new ArrayIndexOutOfBoundsException();
	//    7   13:new             #79  <Class ArrayIndexOutOfBoundsException>
	//    8   16:dup             
	//    9   17:invokespecial   #80  <Method void ArrayIndexOutOfBoundsException()>
	//   10   20:athrow          
			int j = 0;
	//   11   21:iconst_0        
	//   12   22:istore_2        
			if(i < mTail)
	//*  13   23:iload_1         
	//*  14   24:aload_0         
	//*  15   25:getfield        #60  <Field int mTail>
	//*  16   28:icmpge          38
				j = mTail - i;
	//   17   31:aload_0         
	//   18   32:getfield        #60  <Field int mTail>
	//   19   35:iload_1         
	//   20   36:isub            
	//   21   37:istore_2        
			for(int l = j; l < mTail; l++)
	//*  22   38:iload_2         
	//*  23   39:istore_3        
	//*  24   40:iload_3         
	//*  25   41:aload_0         
	//*  26   42:getfield        #60  <Field int mTail>
	//*  27   45:icmpge          62
				mElements[l] = null;
	//   28   48:aload_0         
	//   29   49:getfield        #44  <Field Object[] mElements>
	//   30   52:iload_3         
	//   31   53:aconst_null     
	//   32   54:aastore         

	//   33   55:iload_3         
	//   34   56:iconst_1        
	//   35   57:iadd            
	//   36   58:istore_3        
	//*  37   59:goto            40
			j = mTail - j;
	//   38   62:aload_0         
	//   39   63:getfield        #60  <Field int mTail>
	//   40   66:iload_2         
	//   41   67:isub            
	//   42   68:istore_2        
			i -= j;
	//   43   69:iload_1         
	//   44   70:iload_2         
	//   45   71:isub            
	//   46   72:istore_1        
			mTail = mTail - j;
	//   47   73:aload_0         
	//   48   74:aload_0         
	//   49   75:getfield        #60  <Field int mTail>
	//   50   78:iload_2         
	//   51   79:isub            
	//   52   80:putfield        #60  <Field int mTail>
			if(i > 0)
	//*  53   83:iload_1         
	//*  54   84:ifle            4
			{
				mTail = mElements.length;
	//   55   87:aload_0         
	//   56   88:aload_0         
	//   57   89:getfield        #44  <Field Object[] mElements>
	//   58   92:arraylength     
	//   59   93:putfield        #60  <Field int mTail>
				int k = mTail - i;
	//   60   96:aload_0         
	//   61   97:getfield        #60  <Field int mTail>
	//   62  100:iload_1         
	//   63  101:isub            
	//   64  102:istore_2        
				for(i = k; i < mTail; i++)
	//*  65  103:iload_2         
	//*  66  104:istore_1        
	//*  67  105:iload_1         
	//*  68  106:aload_0         
	//*  69  107:getfield        #60  <Field int mTail>
	//*  70  110:icmpge          127
					mElements[i] = null;
	//   71  113:aload_0         
	//   72  114:getfield        #44  <Field Object[] mElements>
	//   73  117:iload_1         
	//   74  118:aconst_null     
	//   75  119:aastore         

	//   76  120:iload_1         
	//   77  121:iconst_1        
	//   78  122:iadd            
	//   79  123:istore_1        
	//*  80  124:goto            105
				mTail = k;
	//   81  127:aload_0         
	//   82  128:iload_2         
	//   83  129:putfield        #60  <Field int mTail>
				return;
	//   84  132:return          
			}
		}
	}

	public void removeFromStart(int i)
	{
		if(i > 0)
	//*   0    0:iload_1         
	//*   1    1:ifgt            5
	//*   2    4:return          
		{
			if(i > size())
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #72  <Method int size()>
	//*   6   10:icmple          21
				throw new ArrayIndexOutOfBoundsException();
	//    7   13:new             #79  <Class ArrayIndexOutOfBoundsException>
	//    8   16:dup             
	//    9   17:invokespecial   #80  <Method void ArrayIndexOutOfBoundsException()>
	//   10   20:athrow          
			int k = mElements.length;
	//   11   21:aload_0         
	//   12   22:getfield        #44  <Field Object[] mElements>
	//   13   25:arraylength     
	//   14   26:istore_3        
			int j = k;
	//   15   27:iload_3         
	//   16   28:istore_2        
			if(i < k - mHead)
	//*  17   29:iload_1         
	//*  18   30:iload_3         
	//*  19   31:aload_0         
	//*  20   32:getfield        #47  <Field int mHead>
	//*  21   35:isub            
	//*  22   36:icmpge          46
				j = mHead + i;
	//   23   39:aload_0         
	//   24   40:getfield        #47  <Field int mHead>
	//   25   43:iload_1         
	//   26   44:iadd            
	//   27   45:istore_2        
			for(k = mHead; k < j; k++)
	//*  28   46:aload_0         
	//*  29   47:getfield        #47  <Field int mHead>
	//*  30   50:istore_3        
	//*  31   51:iload_3         
	//*  32   52:iload_2         
	//*  33   53:icmpge          70
				mElements[k] = null;
	//   34   56:aload_0         
	//   35   57:getfield        #44  <Field Object[] mElements>
	//   36   60:iload_3         
	//   37   61:aconst_null     
	//   38   62:aastore         

	//   39   63:iload_3         
	//   40   64:iconst_1        
	//   41   65:iadd            
	//   42   66:istore_3        
	//*  43   67:goto            51
			k = j - mHead;
	//   44   70:iload_2         
	//   45   71:aload_0         
	//   46   72:getfield        #47  <Field int mHead>
	//   47   75:isub            
	//   48   76:istore_3        
			j = i - k;
	//   49   77:iload_1         
	//   50   78:iload_3         
	//   51   79:isub            
	//   52   80:istore_2        
			mHead = k + mHead & mCapacityBitmask;
	//   53   81:aload_0         
	//   54   82:iload_3         
	//   55   83:aload_0         
	//   56   84:getfield        #47  <Field int mHead>
	//   57   87:iadd            
	//   58   88:aload_0         
	//   59   89:getfield        #41  <Field int mCapacityBitmask>
	//   60   92:iand            
	//   61   93:putfield        #47  <Field int mHead>
			if(j > 0)
	//*  62   96:iload_2         
	//*  63   97:ifle            4
			{
				for(i = 0; i < j; i++)
	//*  64  100:iconst_0        
	//*  65  101:istore_1        
	//*  66  102:iload_1         
	//*  67  103:iload_2         
	//*  68  104:icmpge          121
					mElements[i] = null;
	//   69  107:aload_0         
	//   70  108:getfield        #44  <Field Object[] mElements>
	//   71  111:iload_1         
	//   72  112:aconst_null     
	//   73  113:aastore         

	//   74  114:iload_1         
	//   75  115:iconst_1        
	//   76  116:iadd            
	//   77  117:istore_1        
	//*  78  118:goto            102
				mHead = j;
	//   79  121:aload_0         
	//   80  122:iload_2         
	//   81  123:putfield        #47  <Field int mHead>
				return;
	//   82  126:return          
			}
		}
	}

	public int size()
	{
		return mTail - mHead & mCapacityBitmask;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int mTail>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field int mHead>
	//    4    8:isub            
	//    5    9:aload_0         
	//    6   10:getfield        #41  <Field int mCapacityBitmask>
	//    7   13:iand            
	//    8   14:ireturn         
	}

	private int mCapacityBitmask;
	private Object mElements[];
	private int mHead;
	private int mTail;
}
