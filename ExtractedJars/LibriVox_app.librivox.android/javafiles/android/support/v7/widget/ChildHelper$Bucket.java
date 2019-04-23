// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


class ChildHelper$Bucket
{

	private void ensureNext()
	{
		if(mNext == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field ChildHelper$Bucket mNext>
	//*   2    4:ifnonnull       18
			mNext = new ChildHelper$Bucket();
	//    3    7:aload_0         
	//    4    8:new             #2   <Class ChildHelper$Bucket>
	//    5   11:dup             
	//    6   12:invokespecial   #25  <Method void ChildHelper$Bucket()>
	//    7   15:putfield        #24  <Field ChildHelper$Bucket mNext>
	//    8   18:return          
	}

	void clear(int i)
	{
		if(i >= 64)
	//*   0    0:iload_1         
	//*   1    1:bipush          64
	//*   2    3:icmplt          24
		{
			ChildHelper$Bucket childhelper$bucket = mNext;
	//    3    6:aload_0         
	//    4    7:getfield        #24  <Field ChildHelper$Bucket mNext>
	//    5   10:astore_2        
			if(childhelper$bucket != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          40
			{
				childhelper$bucket.clear(i - 64);
	//    8   15:aload_2         
	//    9   16:iload_1         
	//   10   17:bipush          64
	//   11   19:isub            
	//   12   20:invokevirtual   #29  <Method void clear(int)>
				return;
	//   13   23:return          
			}
		} else
		{
			mData = mData & ~(1L << i);
	//   14   24:aload_0         
	//   15   25:aload_0         
	//   16   26:getfield        #20  <Field long mData>
	//   17   29:lconst_1        
	//   18   30:iload_1         
	//   19   31:lshl            
	//   20   32:ldc2w           #30  <Long -1L>
	//   21   35:lxor            
	//   22   36:land            
	//   23   37:putfield        #20  <Field long mData>
		}
	//   24   40:return          
	}

	int countOnesBefore(int i)
	{
		ChildHelper$Bucket childhelper$bucket = mNext;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ChildHelper$Bucket mNext>
	//    2    4:astore_2        
		if(childhelper$bucket == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       37
			if(i >= 64)
	//*   5    9:iload_1         
	//*   6   10:bipush          64
	//*   7   12:icmplt          23
				return Long.bitCount(mData);
	//    8   15:aload_0         
	//    9   16:getfield        #20  <Field long mData>
	//   10   19:invokestatic    #39  <Method int Long.bitCount(long)>
	//   11   22:ireturn         
			else
				return Long.bitCount(mData & (1L << i) - 1L);
	//   12   23:aload_0         
	//   13   24:getfield        #20  <Field long mData>
	//   14   27:lconst_1        
	//   15   28:iload_1         
	//   16   29:lshl            
	//   17   30:lconst_1        
	//   18   31:lsub            
	//   19   32:land            
	//   20   33:invokestatic    #39  <Method int Long.bitCount(long)>
	//   21   36:ireturn         
		if(i < 64)
	//*  22   37:iload_1         
	//*  23   38:bipush          64
	//*  24   40:icmpge          57
			return Long.bitCount(mData & (1L << i) - 1L);
	//   25   43:aload_0         
	//   26   44:getfield        #20  <Field long mData>
	//   27   47:lconst_1        
	//   28   48:iload_1         
	//   29   49:lshl            
	//   30   50:lconst_1        
	//   31   51:lsub            
	//   32   52:land            
	//   33   53:invokestatic    #39  <Method int Long.bitCount(long)>
	//   34   56:ireturn         
		else
			return childhelper$bucket.countOnesBefore(i - 64) + Long.bitCount(mData);
	//   35   57:aload_2         
	//   36   58:iload_1         
	//   37   59:bipush          64
	//   38   61:isub            
	//   39   62:invokevirtual   #41  <Method int countOnesBefore(int)>
	//   40   65:aload_0         
	//   41   66:getfield        #20  <Field long mData>
	//   42   69:invokestatic    #39  <Method int Long.bitCount(long)>
	//   43   72:iadd            
	//   44   73:ireturn         
	}

	boolean get(int i)
	{
		if(i >= 64)
	//*   0    0:iload_1         
	//*   1    1:bipush          64
	//*   2    3:icmplt          22
		{
			ensureNext();
	//    3    6:aload_0         
	//    4    7:invokespecial   #45  <Method void ensureNext()>
			return mNext.get(i - 64);
	//    5   10:aload_0         
	//    6   11:getfield        #24  <Field ChildHelper$Bucket mNext>
	//    7   14:iload_1         
	//    8   15:bipush          64
	//    9   17:isub            
	//   10   18:invokevirtual   #47  <Method boolean get(int)>
	//   11   21:ireturn         
		}
		return (mData & 1L << i) != 0L;
	//   12   22:aload_0         
	//   13   23:getfield        #20  <Field long mData>
	//   14   26:lconst_1        
	//   15   27:iload_1         
	//   16   28:lshl            
	//   17   29:land            
	//   18   30:lconst_0        
	//   19   31:lcmp            
	//   20   32:ifeq            37
	//   21   35:iconst_1        
	//   22   36:ireturn         
	//   23   37:iconst_0        
	//   24   38:ireturn         
	}

	void insert(int i, boolean flag)
	{
		if(i >= 64)
	//*   0    0:iload_1         
	//*   1    1:bipush          64
	//*   2    3:icmplt          23
		{
			ensureNext();
	//    3    6:aload_0         
	//    4    7:invokespecial   #45  <Method void ensureNext()>
			mNext.insert(i - 64, flag);
	//    5   10:aload_0         
	//    6   11:getfield        #24  <Field ChildHelper$Bucket mNext>
	//    7   14:iload_1         
	//    8   15:bipush          64
	//    9   17:isub            
	//   10   18:iload_2         
	//   11   19:invokevirtual   #51  <Method void insert(int, boolean)>
			return;
	//   12   22:return          
		}
		boolean flag1;
		if((mData & 0x0L) != 0L)
	//*  13   23:aload_0         
	//*  14   24:getfield        #20  <Field long mData>
	//*  15   27:ldc2w           #10  <Long 0x0L>
	//*  16   30:land            
	//*  17   31:lconst_0        
	//*  18   32:lcmp            
	//*  19   33:ifeq            41
			flag1 = true;
	//   20   36:iconst_1        
	//   21   37:istore_3        
		else
	//*  22   38:goto            43
			flag1 = false;
	//   23   41:iconst_0        
	//   24   42:istore_3        
		long l = (1L << i) - 1L;
	//   25   43:lconst_1        
	//   26   44:iload_1         
	//   27   45:lshl            
	//   28   46:lconst_1        
	//   29   47:lsub            
	//   30   48:lstore          4
		long l1 = mData;
	//   31   50:aload_0         
	//   32   51:getfield        #20  <Field long mData>
	//   33   54:lstore          6
		mData = (l1 & ~l) << 1 | l1 & l;
	//   34   56:aload_0         
	//   35   57:lload           6
	//   36   59:lload           4
	//   37   61:ldc2w           #30  <Long -1L>
	//   38   64:lxor            
	//   39   65:land            
	//   40   66:iconst_1        
	//   41   67:lshl            
	//   42   68:lload           6
	//   43   70:lload           4
	//   44   72:land            
	//   45   73:lor             
	//   46   74:putfield        #20  <Field long mData>
		if(flag)
	//*  47   77:iload_2         
	//*  48   78:ifeq            89
			set(i);
	//   49   81:aload_0         
	//   50   82:iload_1         
	//   51   83:invokevirtual   #54  <Method void set(int)>
		else
	//*  52   86:goto            94
			clear(i);
	//   53   89:aload_0         
	//   54   90:iload_1         
	//   55   91:invokevirtual   #29  <Method void clear(int)>
		if(flag1 || mNext != null)
	//*  56   94:iload_3         
	//*  57   95:ifne            105
	//*  58   98:aload_0         
	//*  59   99:getfield        #24  <Field ChildHelper$Bucket mNext>
	//*  60  102:ifnull          118
		{
			ensureNext();
	//   61  105:aload_0         
	//   62  106:invokespecial   #45  <Method void ensureNext()>
			mNext.insert(0, flag1);
	//   63  109:aload_0         
	//   64  110:getfield        #24  <Field ChildHelper$Bucket mNext>
	//   65  113:iconst_0        
	//   66  114:iload_3         
	//   67  115:invokevirtual   #51  <Method void insert(int, boolean)>
		}
	//   68  118:return          
	}

	boolean remove(int i)
	{
		if(i >= 64)
	//*   0    0:iload_1         
	//*   1    1:bipush          64
	//*   2    3:icmplt          22
		{
			ensureNext();
	//    3    6:aload_0         
	//    4    7:invokespecial   #45  <Method void ensureNext()>
			return mNext.remove(i - 64);
	//    5   10:aload_0         
	//    6   11:getfield        #24  <Field ChildHelper$Bucket mNext>
	//    7   14:iload_1         
	//    8   15:bipush          64
	//    9   17:isub            
	//   10   18:invokevirtual   #57  <Method boolean remove(int)>
	//   11   21:ireturn         
		}
		long l = 1L << i;
	//   12   22:lconst_1        
	//   13   23:iload_1         
	//   14   24:lshl            
	//   15   25:lstore_2        
		boolean flag;
		if((mData & l) != 0L)
	//*  16   26:aload_0         
	//*  17   27:getfield        #20  <Field long mData>
	//*  18   30:lload_2         
	//*  19   31:land            
	//*  20   32:lconst_0        
	//*  21   33:lcmp            
	//*  22   34:ifeq            43
			flag = true;
	//   23   37:iconst_1        
	//   24   38:istore          6
		else
	//*  25   40:goto            46
			flag = false;
	//   26   43:iconst_0        
	//   27   44:istore          6
		mData = mData & ~l;
	//   28   46:aload_0         
	//   29   47:aload_0         
	//   30   48:getfield        #20  <Field long mData>
	//   31   51:lload_2         
	//   32   52:ldc2w           #30  <Long -1L>
	//   33   55:lxor            
	//   34   56:land            
	//   35   57:putfield        #20  <Field long mData>
		l--;
	//   36   60:lload_2         
	//   37   61:lconst_1        
	//   38   62:lsub            
	//   39   63:lstore_2        
		long l1 = mData;
	//   40   64:aload_0         
	//   41   65:getfield        #20  <Field long mData>
	//   42   68:lstore          4
		mData = Long.rotateRight(l1 & ~l, 1) | l1 & l;
	//   43   70:aload_0         
	//   44   71:lload           4
	//   45   73:lload_2         
	//   46   74:ldc2w           #30  <Long -1L>
	//   47   77:lxor            
	//   48   78:land            
	//   49   79:iconst_1        
	//   50   80:invokestatic    #61  <Method long Long.rotateRight(long, int)>
	//   51   83:lload           4
	//   52   85:lload_2         
	//   53   86:land            
	//   54   87:lor             
	//   55   88:putfield        #20  <Field long mData>
		ChildHelper$Bucket childhelper$bucket = mNext;
	//   56   91:aload_0         
	//   57   92:getfield        #24  <Field ChildHelper$Bucket mNext>
	//   58   95:astore          7
		if(childhelper$bucket != null)
	//*  59   97:aload           7
	//*  60   99:ifnull          126
		{
			if(childhelper$bucket.get(0))
	//*  61  102:aload           7
	//*  62  104:iconst_0        
	//*  63  105:invokevirtual   #47  <Method boolean get(int)>
	//*  64  108:ifeq            117
				set(63);
	//   65  111:aload_0         
	//   66  112:bipush          63
	//   67  114:invokevirtual   #54  <Method void set(int)>
			mNext.remove(0);
	//   68  117:aload_0         
	//   69  118:getfield        #24  <Field ChildHelper$Bucket mNext>
	//   70  121:iconst_0        
	//   71  122:invokevirtual   #57  <Method boolean remove(int)>
	//   72  125:pop             
		}
		return flag;
	//   73  126:iload           6
	//   74  128:ireturn         
	}

	void reset()
	{
		mData = 0L;
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:putfield        #20  <Field long mData>
		ChildHelper$Bucket childhelper$bucket = mNext;
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field ChildHelper$Bucket mNext>
	//    5    9:astore_1        
		if(childhelper$bucket != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          18
			childhelper$bucket.reset();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #64  <Method void reset()>
	//   10   18:return          
	}

	void set(int i)
	{
		if(i >= 64)
	//*   0    0:iload_1         
	//*   1    1:bipush          64
	//*   2    3:icmplt          22
		{
			ensureNext();
	//    3    6:aload_0         
	//    4    7:invokespecial   #45  <Method void ensureNext()>
			mNext.set(i - 64);
	//    5   10:aload_0         
	//    6   11:getfield        #24  <Field ChildHelper$Bucket mNext>
	//    7   14:iload_1         
	//    8   15:bipush          64
	//    9   17:isub            
	//   10   18:invokevirtual   #54  <Method void set(int)>
			return;
	//   11   21:return          
		} else
		{
			mData = mData | 1L << i;
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #20  <Field long mData>
	//   15   27:lconst_1        
	//   16   28:iload_1         
	//   17   29:lshl            
	//   18   30:lor             
	//   19   31:putfield        #20  <Field long mData>
			return;
	//   20   34:return          
		}
	}

	public String toString()
	{
		if(mNext == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field ChildHelper$Bucket mNext>
	//*   2    4:ifnonnull       15
		{
			return Long.toBinaryString(mData);
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field long mData>
	//    5   11:invokestatic    #70  <Method String Long.toBinaryString(long)>
	//    6   14:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   15:new             #72  <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #73  <Method void StringBuilder()>
	//   10   22:astore_1        
			stringbuilder.append(mNext.toString());
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #24  <Field ChildHelper$Bucket mNext>
	//   14   28:invokevirtual   #75  <Method String toString()>
	//   15   31:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   16   34:pop             
			stringbuilder.append("xx");
	//   17   35:aload_1         
	//   18   36:ldc1            #81  <String "xx">
	//   19   38:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
			stringbuilder.append(Long.toBinaryString(mData));
	//   21   42:aload_1         
	//   22   43:aload_0         
	//   23   44:getfield        #20  <Field long mData>
	//   24   47:invokestatic    #70  <Method String Long.toBinaryString(long)>
	//   25   50:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   26   53:pop             
			return stringbuilder.toString();
	//   27   54:aload_1         
	//   28   55:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   29   58:areturn         
		}
	}

	static final int BITS_PER_WORD = 64;
	static final long LAST_BIT = 0x0L;
	long mData;
	ChildHelper$Bucket mNext;

	ChildHelper$Bucket()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mData = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #20  <Field long mData>
	//    5    9:return          
	}
}
