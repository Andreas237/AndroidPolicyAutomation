// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			ChildHelper

static class ChildHelper$Bucket
{

	private void ensureNext()
	{
		if(mNext == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field ChildHelper$Bucket mNext>
	//*   2    4:ifnonnull       18
			mNext = new ChildHelper$Bucket();
	//    3    7:aload_0         
	//    4    8:new             #2   <Class ChildHelper$Bucket>
	//    5   11:dup             
	//    6   12:invokespecial   #28  <Method void ChildHelper$Bucket()>
	//    7   15:putfield        #27  <Field ChildHelper$Bucket mNext>
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
	//    4    7:getfield        #27  <Field ChildHelper$Bucket mNext>
	//    5   10:astore_2        
			if(childhelper$bucket != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          36
			{
				childhelper$bucket.clear(i - 64);
	//    8   15:aload_2         
	//    9   16:iload_1         
	//   10   17:bipush          64
	//   11   19:isub            
	//   12   20:invokevirtual   #32  <Method void clear(int)>
				return;
	//   13   23:return          
			}
		} else
		{
			mData = mData & 1L << i;
	//   14   24:aload_0         
	//   15   25:aload_0         
	//   16   26:getfield        #23  <Field long mData>
	//   17   29:lconst_1        
	//   18   30:iload_1         
	//   19   31:lshl            
	//   20   32:land            
	//   21   33:putfield        #23  <Field long mData>
		}
	//   22   36:return          
	}

	int countOnesBefore(int i)
	{
		ChildHelper$Bucket childhelper$bucket = mNext;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ChildHelper$Bucket mNext>
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
	//    9   16:getfield        #23  <Field long mData>
	//   10   19:invokestatic    #40  <Method int Long.bitCount(long)>
	//   11   22:ireturn         
			else
				return Long.bitCount(mData & (1L << i) - 1L);
	//   12   23:aload_0         
	//   13   24:getfield        #23  <Field long mData>
	//   14   27:lconst_1        
	//   15   28:iload_1         
	//   16   29:lshl            
	//   17   30:lconst_1        
	//   18   31:lsub            
	//   19   32:land            
	//   20   33:invokestatic    #40  <Method int Long.bitCount(long)>
	//   21   36:ireturn         
		if(i < 64)
	//*  22   37:iload_1         
	//*  23   38:bipush          64
	//*  24   40:icmpge          57
			return Long.bitCount(mData & (1L << i) - 1L);
	//   25   43:aload_0         
	//   26   44:getfield        #23  <Field long mData>
	//   27   47:lconst_1        
	//   28   48:iload_1         
	//   29   49:lshl            
	//   30   50:lconst_1        
	//   31   51:lsub            
	//   32   52:land            
	//   33   53:invokestatic    #40  <Method int Long.bitCount(long)>
	//   34   56:ireturn         
		else
			return childhelper$bucket.countOnesBefore(i - 64) + Long.bitCount(mData);
	//   35   57:aload_2         
	//   36   58:iload_1         
	//   37   59:bipush          64
	//   38   61:isub            
	//   39   62:invokevirtual   #42  <Method int countOnesBefore(int)>
	//   40   65:aload_0         
	//   41   66:getfield        #23  <Field long mData>
	//   42   69:invokestatic    #40  <Method int Long.bitCount(long)>
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
	//    4    7:invokespecial   #46  <Method void ensureNext()>
			return mNext.get(i - 64);
	//    5   10:aload_0         
	//    6   11:getfield        #27  <Field ChildHelper$Bucket mNext>
	//    7   14:iload_1         
	//    8   15:bipush          64
	//    9   17:isub            
	//   10   18:invokevirtual   #48  <Method boolean get(int)>
	//   11   21:ireturn         
		}
		return (mData & 1L << i) != 0L;
	//   12   22:aload_0         
	//   13   23:getfield        #23  <Field long mData>
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
	//    4    7:invokespecial   #46  <Method void ensureNext()>
			mNext.insert(i - 64, flag);
	//    5   10:aload_0         
	//    6   11:getfield        #27  <Field ChildHelper$Bucket mNext>
	//    7   14:iload_1         
	//    8   15:bipush          64
	//    9   17:isub            
	//   10   18:iload_2         
	//   11   19:invokevirtual   #52  <Method void insert(int, boolean)>
			return;
	//   12   22:return          
		}
		boolean flag1;
		if((mData & 0x0L) != 0L)
	//*  13   23:aload_0         
	//*  14   24:getfield        #23  <Field long mData>
	//*  15   27:ldc2w           #13  <Long 0x0L>
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
	//   32   51:getfield        #23  <Field long mData>
	//   33   54:lstore          6
		mData = (l1 & l) << 1 | l1 & l;
	//   34   56:aload_0         
	//   35   57:lload           6
	//   36   59:lload           4
	//   37   61:land            
	//   38   62:iconst_1        
	//   39   63:lshl            
	//   40   64:lload           6
	//   41   66:lload           4
	//   42   68:land            
	//   43   69:lor             
	//   44   70:putfield        #23  <Field long mData>
		if(flag)
	//*  45   73:iload_2         
	//*  46   74:ifeq            85
			set(i);
	//   47   77:aload_0         
	//   48   78:iload_1         
	//   49   79:invokevirtual   #55  <Method void set(int)>
		else
	//*  50   82:goto            90
			clear(i);
	//   51   85:aload_0         
	//   52   86:iload_1         
	//   53   87:invokevirtual   #32  <Method void clear(int)>
		if(flag1 || mNext != null)
	//*  54   90:iload_3         
	//*  55   91:ifne            101
	//*  56   94:aload_0         
	//*  57   95:getfield        #27  <Field ChildHelper$Bucket mNext>
	//*  58   98:ifnull          114
		{
			ensureNext();
	//   59  101:aload_0         
	//   60  102:invokespecial   #46  <Method void ensureNext()>
			mNext.insert(0, flag1);
	//   61  105:aload_0         
	//   62  106:getfield        #27  <Field ChildHelper$Bucket mNext>
	//   63  109:iconst_0        
	//   64  110:iload_3         
	//   65  111:invokevirtual   #52  <Method void insert(int, boolean)>
		}
	//   66  114:return          
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
	//    4    7:invokespecial   #46  <Method void ensureNext()>
			return mNext.remove(i - 64);
	//    5   10:aload_0         
	//    6   11:getfield        #27  <Field ChildHelper$Bucket mNext>
	//    7   14:iload_1         
	//    8   15:bipush          64
	//    9   17:isub            
	//   10   18:invokevirtual   #58  <Method boolean remove(int)>
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
	//*  17   27:getfield        #23  <Field long mData>
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
		mData = mData & l;
	//   28   46:aload_0         
	//   29   47:aload_0         
	//   30   48:getfield        #23  <Field long mData>
	//   31   51:lload_2         
	//   32   52:land            
	//   33   53:putfield        #23  <Field long mData>
		l--;
	//   34   56:lload_2         
	//   35   57:lconst_1        
	//   36   58:lsub            
	//   37   59:lstore_2        
		long l1 = mData;
	//   38   60:aload_0         
	//   39   61:getfield        #23  <Field long mData>
	//   40   64:lstore          4
		mData = Long.rotateRight(l1 & l, 1) | l1 & l;
	//   41   66:aload_0         
	//   42   67:lload           4
	//   43   69:lload_2         
	//   44   70:land            
	//   45   71:iconst_1        
	//   46   72:invokestatic    #62  <Method long Long.rotateRight(long, int)>
	//   47   75:lload           4
	//   48   77:lload_2         
	//   49   78:land            
	//   50   79:lor             
	//   51   80:putfield        #23  <Field long mData>
		ChildHelper$Bucket childhelper$bucket = mNext;
	//   52   83:aload_0         
	//   53   84:getfield        #27  <Field ChildHelper$Bucket mNext>
	//   54   87:astore          7
		if(childhelper$bucket != null)
	//*  55   89:aload           7
	//*  56   91:ifnull          118
		{
			if(childhelper$bucket.get(0))
	//*  57   94:aload           7
	//*  58   96:iconst_0        
	//*  59   97:invokevirtual   #48  <Method boolean get(int)>
	//*  60  100:ifeq            109
				set(63);
	//   61  103:aload_0         
	//   62  104:bipush          63
	//   63  106:invokevirtual   #55  <Method void set(int)>
			mNext.remove(0);
	//   64  109:aload_0         
	//   65  110:getfield        #27  <Field ChildHelper$Bucket mNext>
	//   66  113:iconst_0        
	//   67  114:invokevirtual   #58  <Method boolean remove(int)>
	//   68  117:pop             
		}
		return flag;
	//   69  118:iload           6
	//   70  120:ireturn         
	}

	void reset()
	{
		mData = 0L;
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:putfield        #23  <Field long mData>
		ChildHelper$Bucket childhelper$bucket = mNext;
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field ChildHelper$Bucket mNext>
	//    5    9:astore_1        
		if(childhelper$bucket != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          18
			childhelper$bucket.reset();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #65  <Method void reset()>
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
	//    4    7:invokespecial   #46  <Method void ensureNext()>
			mNext.set(i - 64);
	//    5   10:aload_0         
	//    6   11:getfield        #27  <Field ChildHelper$Bucket mNext>
	//    7   14:iload_1         
	//    8   15:bipush          64
	//    9   17:isub            
	//   10   18:invokevirtual   #55  <Method void set(int)>
			return;
	//   11   21:return          
		} else
		{
			mData = mData | 1L << i;
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #23  <Field long mData>
	//   15   27:lconst_1        
	//   16   28:iload_1         
	//   17   29:lshl            
	//   18   30:lor             
	//   19   31:putfield        #23  <Field long mData>
			return;
	//   20   34:return          
		}
	}

	public String toString()
	{
		if(mNext == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field ChildHelper$Bucket mNext>
	//*   2    4:ifnonnull       15
		{
			return Long.toBinaryString(mData);
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field long mData>
	//    5   11:invokestatic    #71  <Method String Long.toBinaryString(long)>
	//    6   14:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   15:new             #73  <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #74  <Method void StringBuilder()>
	//   10   22:astore_1        
			stringbuilder.append(mNext.toString());
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #27  <Field ChildHelper$Bucket mNext>
	//   14   28:invokevirtual   #76  <Method String toString()>
	//   15   31:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   16   34:pop             
			stringbuilder.append("xx");
	//   17   35:aload_1         
	//   18   36:ldc1            #82  <String "xx">
	//   19   38:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
			stringbuilder.append(Long.toBinaryString(mData));
	//   21   42:aload_1         
	//   22   43:aload_0         
	//   23   44:getfield        #23  <Field long mData>
	//   24   47:invokestatic    #71  <Method String Long.toBinaryString(long)>
	//   25   50:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   26   53:pop             
			return stringbuilder.toString();
	//   27   54:aload_1         
	//   28   55:invokevirtual   #83  <Method String StringBuilder.toString()>
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
	//    1    1:invokespecial   #21  <Method void Object()>
		mData = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #23  <Field long mData>
	//    5    9:return          
	}
}
