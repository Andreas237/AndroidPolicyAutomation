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
	//*   2    3:icmplt          25
		{
			if(mNext != null)
	//*   3    6:aload_0         
	//*   4    7:getfield        #27  <Field ChildHelper$Bucket mNext>
	//*   5   10:ifnull          24
				mNext.clear(i - 64);
	//    6   13:aload_0         
	//    7   14:getfield        #27  <Field ChildHelper$Bucket mNext>
	//    8   17:iload_1         
	//    9   18:bipush          64
	//   10   20:isub            
	//   11   21:invokevirtual   #32  <Method void clear(int)>
			return;
	//   12   24:return          
		} else
		{
			mData = mData & ~(1L << i);
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #23  <Field long mData>
	//   16   30:lconst_1        
	//   17   31:iload_1         
	//   18   32:lshl            
	//   19   33:ldc2w           #33  <Long -1L>
	//   20   36:lxor            
	//   21   37:land            
	//   22   38:putfield        #23  <Field long mData>
			return;
	//   23   41:return          
		}
	}

	int countOnesBefore(int i)
	{
		if(mNext == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field ChildHelper$Bucket mNext>
	//*   2    4:ifnonnull       35
			if(i >= 64)
	//*   3    7:iload_1         
	//*   4    8:bipush          64
	//*   5   10:icmplt          21
				return Long.bitCount(mData);
	//    6   13:aload_0         
	//    7   14:getfield        #23  <Field long mData>
	//    8   17:invokestatic    #42  <Method int Long.bitCount(long)>
	//    9   20:ireturn         
			else
				return Long.bitCount(mData & (1L << i) - 1L);
	//   10   21:aload_0         
	//   11   22:getfield        #23  <Field long mData>
	//   12   25:lconst_1        
	//   13   26:iload_1         
	//   14   27:lshl            
	//   15   28:lconst_1        
	//   16   29:lsub            
	//   17   30:land            
	//   18   31:invokestatic    #42  <Method int Long.bitCount(long)>
	//   19   34:ireturn         
		if(i < 64)
	//*  20   35:iload_1         
	//*  21   36:bipush          64
	//*  22   38:icmpge          55
			return Long.bitCount(mData & (1L << i) - 1L);
	//   23   41:aload_0         
	//   24   42:getfield        #23  <Field long mData>
	//   25   45:lconst_1        
	//   26   46:iload_1         
	//   27   47:lshl            
	//   28   48:lconst_1        
	//   29   49:lsub            
	//   30   50:land            
	//   31   51:invokestatic    #42  <Method int Long.bitCount(long)>
	//   32   54:ireturn         
		else
			return mNext.countOnesBefore(i - 64) + Long.bitCount(mData);
	//   33   55:aload_0         
	//   34   56:getfield        #27  <Field ChildHelper$Bucket mNext>
	//   35   59:iload_1         
	//   36   60:bipush          64
	//   37   62:isub            
	//   38   63:invokevirtual   #44  <Method int countOnesBefore(int)>
	//   39   66:aload_0         
	//   40   67:getfield        #23  <Field long mData>
	//   41   70:invokestatic    #42  <Method int Long.bitCount(long)>
	//   42   73:iadd            
	//   43   74:ireturn         
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
	//    4    7:invokespecial   #48  <Method void ensureNext()>
			return mNext.get(i - 64);
	//    5   10:aload_0         
	//    6   11:getfield        #27  <Field ChildHelper$Bucket mNext>
	//    7   14:iload_1         
	//    8   15:bipush          64
	//    9   17:isub            
	//   10   18:invokevirtual   #50  <Method boolean get(int)>
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
	//    4    7:invokespecial   #48  <Method void ensureNext()>
			mNext.insert(i - 64, flag);
	//    5   10:aload_0         
	//    6   11:getfield        #27  <Field ChildHelper$Bucket mNext>
	//    7   14:iload_1         
	//    8   15:bipush          64
	//    9   17:isub            
	//   10   18:iload_2         
	//   11   19:invokevirtual   #54  <Method void insert(int, boolean)>
		} else
	//*  12   22:return          
		{
			boolean flag1;
			long l;
			if((mData & 0x0L) != 0L)
	//*  13   23:aload_0         
	//*  14   24:getfield        #23  <Field long mData>
	//*  15   27:ldc2w           #13  <Long 0x0L>
	//*  16   30:land            
	//*  17   31:lconst_0        
	//*  18   32:lcmp            
	//*  19   33:ifeq            104
				flag1 = true;
	//   20   36:iconst_1        
	//   21   37:istore_3        
			else
	//*  22   38:lconst_1        
	//*  23   39:iload_1         
	//*  24   40:lshl            
	//*  25   41:lconst_1        
	//*  26   42:lsub            
	//*  27   43:lstore          4
	//*  28   45:aload_0         
	//*  29   46:aload_0         
	//*  30   47:getfield        #23  <Field long mData>
	//*  31   50:lload           4
	//*  32   52:land            
	//*  33   53:aload_0         
	//*  34   54:getfield        #23  <Field long mData>
	//*  35   57:ldc2w           #33  <Long -1L>
	//*  36   60:lload           4
	//*  37   62:lxor            
	//*  38   63:land            
	//*  39   64:iconst_1        
	//*  40   65:lshl            
	//*  41   66:lor             
	//*  42   67:putfield        #23  <Field long mData>
	//*  43   70:iload_2         
	//*  44   71:ifeq            109
	//*  45   74:aload_0         
	//*  46   75:iload_1         
	//*  47   76:invokevirtual   #57  <Method void set(int)>
	//*  48   79:iload_3         
	//*  49   80:ifne            90
	//*  50   83:aload_0         
	//*  51   84:getfield        #27  <Field ChildHelper$Bucket mNext>
	//*  52   87:ifnull          22
	//*  53   90:aload_0         
	//*  54   91:invokespecial   #48  <Method void ensureNext()>
	//*  55   94:aload_0         
	//*  56   95:getfield        #27  <Field ChildHelper$Bucket mNext>
	//*  57   98:iconst_0        
	//*  58   99:iload_3         
	//*  59  100:invokevirtual   #54  <Method void insert(int, boolean)>
	//*  60  103:return          
				flag1 = false;
	//   61  104:iconst_0        
	//   62  105:istore_3        
			l = (1L << i) - 1L;
			mData = mData & l | (mData & (-1L ^ l)) << 1;
			if(flag)
				set(i);
			else
	//*  63  106:goto            38
				clear(i);
	//   64  109:aload_0         
	//   65  110:iload_1         
	//   66  111:invokevirtual   #32  <Method void clear(int)>
			if(flag1 || mNext != null)
			{
				ensureNext();
				mNext.insert(0, flag1);
				return;
			}
		}
	//*  67  114:goto            79
	}

	boolean remove(int i)
	{
		boolean flag1;
		if(i >= 64)
	//*   0    0:iload_1         
	//*   1    1:bipush          64
	//*   2    3:icmplt          24
		{
			ensureNext();
	//    3    6:aload_0         
	//    4    7:invokespecial   #48  <Method void ensureNext()>
			flag1 = mNext.remove(i - 64);
	//    5   10:aload_0         
	//    6   11:getfield        #27  <Field ChildHelper$Bucket mNext>
	//    7   14:iload_1         
	//    8   15:bipush          64
	//    9   17:isub            
	//   10   18:invokevirtual   #60  <Method boolean remove(int)>
	//   11   21:istore_3        
		} else
	//*  12   22:iload_3         
	//*  13   23:ireturn         
		{
			long l = 1L << i;
	//   14   24:lconst_1        
	//   15   25:iload_1         
	//   16   26:lshl            
	//   17   27:lstore          4
			boolean flag;
			if((mData & l) != 0L)
	//*  18   29:aload_0         
	//*  19   30:getfield        #23  <Field long mData>
	//*  20   33:lload           4
	//*  21   35:land            
	//*  22   36:lconst_0        
	//*  23   37:lcmp            
	//*  24   38:ifeq            128
				flag = true;
	//   25   41:iconst_1        
	//   26   42:istore_2        
			else
	//*  27   43:aload_0         
	//*  28   44:aload_0         
	//*  29   45:getfield        #23  <Field long mData>
	//*  30   48:ldc2w           #33  <Long -1L>
	//*  31   51:lload           4
	//*  32   53:lxor            
	//*  33   54:land            
	//*  34   55:putfield        #23  <Field long mData>
	//*  35   58:lload           4
	//*  36   60:lconst_1        
	//*  37   61:lsub            
	//*  38   62:lstore          4
	//*  39   64:aload_0         
	//*  40   65:aload_0         
	//*  41   66:getfield        #23  <Field long mData>
	//*  42   69:lload           4
	//*  43   71:land            
	//*  44   72:aload_0         
	//*  45   73:getfield        #23  <Field long mData>
	//*  46   76:ldc2w           #33  <Long -1L>
	//*  47   79:lload           4
	//*  48   81:lxor            
	//*  49   82:land            
	//*  50   83:iconst_1        
	//*  51   84:invokestatic    #64  <Method long Long.rotateRight(long, int)>
	//*  52   87:lor             
	//*  53   88:putfield        #23  <Field long mData>
	//*  54   91:iload_2         
	//*  55   92:istore_3        
	//*  56   93:aload_0         
	//*  57   94:getfield        #27  <Field ChildHelper$Bucket mNext>
	//*  58   97:ifnull          22
	//*  59  100:aload_0         
	//*  60  101:getfield        #27  <Field ChildHelper$Bucket mNext>
	//*  61  104:iconst_0        
	//*  62  105:invokevirtual   #50  <Method boolean get(int)>
	//*  63  108:ifeq            117
	//*  64  111:aload_0         
	//*  65  112:bipush          63
	//*  66  114:invokevirtual   #57  <Method void set(int)>
	//*  67  117:aload_0         
	//*  68  118:getfield        #27  <Field ChildHelper$Bucket mNext>
	//*  69  121:iconst_0        
	//*  70  122:invokevirtual   #60  <Method boolean remove(int)>
	//*  71  125:pop             
	//*  72  126:iload_2         
	//*  73  127:ireturn         
				flag = false;
	//   74  128:iconst_0        
	//   75  129:istore_2        
			mData = mData & (-1L ^ l);
			l--;
			mData = mData & l | Long.rotateRight(mData & (-1L ^ l), 1);
			flag1 = flag;
			if(mNext != null)
			{
				if(mNext.get(0))
					set(63);
				mNext.remove(0);
				return flag;
			}
		}
		return flag1;
	//*  76  130:goto            43
	}

	void reset()
	{
		mData = 0L;
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:putfield        #23  <Field long mData>
		if(mNext != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #27  <Field ChildHelper$Bucket mNext>
	//*   5    9:ifnull          19
			mNext.reset();
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field ChildHelper$Bucket mNext>
	//    8   16:invokevirtual   #67  <Method void reset()>
	//    9   19:return          
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
	//    4    7:invokespecial   #48  <Method void ensureNext()>
			mNext.set(i - 64);
	//    5   10:aload_0         
	//    6   11:getfield        #27  <Field ChildHelper$Bucket mNext>
	//    7   14:iload_1         
	//    8   15:bipush          64
	//    9   17:isub            
	//   10   18:invokevirtual   #57  <Method void set(int)>
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
			return Long.toBinaryString(mData);
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field long mData>
	//    5   11:invokestatic    #73  <Method String Long.toBinaryString(long)>
	//    6   14:areturn         
		else
			return (new StringBuilder()).append(mNext.toString()).append("xx").append(Long.toBinaryString(mData)).toString();
	//    7   15:new             #75  <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #76  <Method void StringBuilder()>
	//   10   22:aload_0         
	//   11   23:getfield        #27  <Field ChildHelper$Bucket mNext>
	//   12   26:invokevirtual   #78  <Method String toString()>
	//   13   29:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   14   32:ldc1            #84  <String "xx">
	//   15   34:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   16   37:aload_0         
	//   17   38:getfield        #23  <Field long mData>
	//   18   41:invokestatic    #73  <Method String Long.toBinaryString(long)>
	//   19   44:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   20   47:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   21   50:areturn         
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
