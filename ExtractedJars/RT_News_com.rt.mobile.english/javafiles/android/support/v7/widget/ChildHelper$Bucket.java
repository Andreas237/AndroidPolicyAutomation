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
	//*   5   10:ifnull          41
			{
				mNext.clear(i - 64);
	//    6   13:aload_0         
	//    7   14:getfield        #27  <Field ChildHelper$Bucket mNext>
	//    8   17:iload_1         
	//    9   18:bipush          64
	//   10   20:isub            
	//   11   21:invokevirtual   #32  <Method void clear(int)>
				return;
	//   12   24:return          
			}
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
		}
	//   23   41:return          
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
		mData = mData & l | (mData & ~l) << 1;
	//   31   50:aload_0         
	//   32   51:aload_0         
	//   33   52:getfield        #23  <Field long mData>
	//   34   55:lload           4
	//   35   57:land            
	//   36   58:aload_0         
	//   37   59:getfield        #23  <Field long mData>
	//   38   62:lload           4
	//   39   64:ldc2w           #33  <Long -1L>
	//   40   67:lxor            
	//   41   68:land            
	//   42   69:iconst_1        
	//   43   70:lshl            
	//   44   71:lor             
	//   45   72:putfield        #23  <Field long mData>
		if(flag)
	//*  46   75:iload_2         
	//*  47   76:ifeq            87
			set(i);
	//   48   79:aload_0         
	//   49   80:iload_1         
	//   50   81:invokevirtual   #57  <Method void set(int)>
		else
	//*  51   84:goto            92
			clear(i);
	//   52   87:aload_0         
	//   53   88:iload_1         
	//   54   89:invokevirtual   #32  <Method void clear(int)>
		if(flag1 || mNext != null)
	//*  55   92:iload_3         
	//*  56   93:ifne            103
	//*  57   96:aload_0         
	//*  58   97:getfield        #27  <Field ChildHelper$Bucket mNext>
	//*  59  100:ifnull          116
		{
			ensureNext();
	//   60  103:aload_0         
	//   61  104:invokespecial   #48  <Method void ensureNext()>
			mNext.insert(0, flag1);
	//   62  107:aload_0         
	//   63  108:getfield        #27  <Field ChildHelper$Bucket mNext>
	//   64  111:iconst_0        
	//   65  112:iload_3         
	//   66  113:invokevirtual   #54  <Method void insert(int, boolean)>
		}
	//   67  116:return          
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
	//    4    7:invokespecial   #48  <Method void ensureNext()>
			return mNext.remove(i - 64);
	//    5   10:aload_0         
	//    6   11:getfield        #27  <Field ChildHelper$Bucket mNext>
	//    7   14:iload_1         
	//    8   15:bipush          64
	//    9   17:isub            
	//   10   18:invokevirtual   #60  <Method boolean remove(int)>
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
	//   24   38:istore          4
		else
	//*  25   40:goto            46
			flag = false;
	//   26   43:iconst_0        
	//   27   44:istore          4
		mData = mData & ~l;
	//   28   46:aload_0         
	//   29   47:aload_0         
	//   30   48:getfield        #23  <Field long mData>
	//   31   51:lload_2         
	//   32   52:ldc2w           #33  <Long -1L>
	//   33   55:lxor            
	//   34   56:land            
	//   35   57:putfield        #23  <Field long mData>
		l--;
	//   36   60:lload_2         
	//   37   61:lconst_1        
	//   38   62:lsub            
	//   39   63:lstore_2        
		mData = mData & l | Long.rotateRight(mData & ~l, 1);
	//   40   64:aload_0         
	//   41   65:aload_0         
	//   42   66:getfield        #23  <Field long mData>
	//   43   69:lload_2         
	//   44   70:land            
	//   45   71:aload_0         
	//   46   72:getfield        #23  <Field long mData>
	//   47   75:lload_2         
	//   48   76:ldc2w           #33  <Long -1L>
	//   49   79:lxor            
	//   50   80:land            
	//   51   81:iconst_1        
	//   52   82:invokestatic    #64  <Method long Long.rotateRight(long, int)>
	//   53   85:lor             
	//   54   86:putfield        #23  <Field long mData>
		if(mNext != null)
	//*  55   89:aload_0         
	//*  56   90:getfield        #27  <Field ChildHelper$Bucket mNext>
	//*  57   93:ifnull          122
		{
			if(mNext.get(0))
	//*  58   96:aload_0         
	//*  59   97:getfield        #27  <Field ChildHelper$Bucket mNext>
	//*  60  100:iconst_0        
	//*  61  101:invokevirtual   #50  <Method boolean get(int)>
	//*  62  104:ifeq            113
				set(63);
	//   63  107:aload_0         
	//   64  108:bipush          63
	//   65  110:invokevirtual   #57  <Method void set(int)>
			mNext.remove(0);
	//   66  113:aload_0         
	//   67  114:getfield        #27  <Field ChildHelper$Bucket mNext>
	//   68  117:iconst_0        
	//   69  118:invokevirtual   #60  <Method boolean remove(int)>
	//   70  121:pop             
		}
		return flag;
	//   71  122:iload           4
	//   72  124:ireturn         
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
		{
			return Long.toBinaryString(mData);
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field long mData>
	//    5   11:invokestatic    #73  <Method String Long.toBinaryString(long)>
	//    6   14:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   15:new             #75  <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #76  <Method void StringBuilder()>
	//   10   22:astore_1        
			stringbuilder.append(mNext.toString());
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #27  <Field ChildHelper$Bucket mNext>
	//   14   28:invokevirtual   #78  <Method String toString()>
	//   15   31:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   16   34:pop             
			stringbuilder.append("xx");
	//   17   35:aload_1         
	//   18   36:ldc1            #84  <String "xx">
	//   19   38:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
			stringbuilder.append(Long.toBinaryString(mData));
	//   21   42:aload_1         
	//   22   43:aload_0         
	//   23   44:getfield        #23  <Field long mData>
	//   24   47:invokestatic    #73  <Method String Long.toBinaryString(long)>
	//   25   50:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   26   53:pop             
			return stringbuilder.toString();
	//   27   54:aload_1         
	//   28   55:invokevirtual   #85  <Method String StringBuilder.toString()>
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
