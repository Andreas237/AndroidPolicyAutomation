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
			long l1;
			if((mData & 0x0L) != 0L)
	//*  13   23:aload_0         
	//*  14   24:getfield        #23  <Field long mData>
	//*  15   27:ldc2w           #13  <Long 0x0L>
	//*  16   30:land            
	//*  17   31:lconst_0        
	//*  18   32:lcmp            
	//*  19   33:ifeq            108
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
	//*  29   46:getfield        #23  <Field long mData>
	//*  30   49:lstore          6
	//*  31   51:aload_0         
	//*  32   52:lload           4
	//*  33   54:ldc2w           #33  <Long -1L>
	//*  34   57:lxor            
	//*  35   58:aload_0         
	//*  36   59:getfield        #23  <Field long mData>
	//*  37   62:land            
	//*  38   63:iconst_1        
	//*  39   64:lshl            
	//*  40   65:lload           6
	//*  41   67:lload           4
	//*  42   69:land            
	//*  43   70:lor             
	//*  44   71:putfield        #23  <Field long mData>
	//*  45   74:iload_2         
	//*  46   75:ifeq            113
	//*  47   78:aload_0         
	//*  48   79:iload_1         
	//*  49   80:invokevirtual   #57  <Method void set(int)>
	//*  50   83:iload_3         
	//*  51   84:ifne            94
	//*  52   87:aload_0         
	//*  53   88:getfield        #27  <Field ChildHelper$Bucket mNext>
	//*  54   91:ifnull          22
	//*  55   94:aload_0         
	//*  56   95:invokespecial   #48  <Method void ensureNext()>
	//*  57   98:aload_0         
	//*  58   99:getfield        #27  <Field ChildHelper$Bucket mNext>
	//*  59  102:iconst_0        
	//*  60  103:iload_3         
	//*  61  104:invokevirtual   #54  <Method void insert(int, boolean)>
	//*  62  107:return          
				flag1 = false;
	//   63  108:iconst_0        
	//   64  109:istore_3        
			l = (1L << i) - 1L;
			l1 = mData;
			mData = (~l & mData) << 1 | l1 & l;
			if(flag)
				set(i);
			else
	//*  65  110:goto            38
				clear(i);
	//   66  113:aload_0         
	//   67  114:iload_1         
	//   68  115:invokevirtual   #32  <Method void clear(int)>
			if(flag1 || mNext != null)
			{
				ensureNext();
				mNext.insert(0, flag1);
				return;
			}
		}
	//*  69  118:goto            83
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
			long l1;
			if((mData & l) != 0L)
	//*  18   29:aload_0         
	//*  19   30:getfield        #23  <Field long mData>
	//*  20   33:lload           4
	//*  21   35:land            
	//*  22   36:lconst_0        
	//*  23   37:lcmp            
	//*  24   38:ifeq            132
				flag = true;
	//   25   41:iconst_1        
	//   26   42:istore_2        
			else
	//*  27   43:aload_0         
	//*  28   44:aload_0         
	//*  29   45:getfield        #23  <Field long mData>
	//*  30   48:lload           4
	//*  31   50:ldc2w           #33  <Long -1L>
	//*  32   53:lxor            
	//*  33   54:land            
	//*  34   55:putfield        #23  <Field long mData>
	//*  35   58:lload           4
	//*  36   60:lconst_1        
	//*  37   61:lsub            
	//*  38   62:lstore          4
	//*  39   64:aload_0         
	//*  40   65:getfield        #23  <Field long mData>
	//*  41   68:lstore          6
	//*  42   70:aload_0         
	//*  43   71:lload           4
	//*  44   73:ldc2w           #33  <Long -1L>
	//*  45   76:lxor            
	//*  46   77:aload_0         
	//*  47   78:getfield        #23  <Field long mData>
	//*  48   81:land            
	//*  49   82:iconst_1        
	//*  50   83:invokestatic    #64  <Method long Long.rotateRight(long, int)>
	//*  51   86:lload           6
	//*  52   88:lload           4
	//*  53   90:land            
	//*  54   91:lor             
	//*  55   92:putfield        #23  <Field long mData>
	//*  56   95:iload_2         
	//*  57   96:istore_3        
	//*  58   97:aload_0         
	//*  59   98:getfield        #27  <Field ChildHelper$Bucket mNext>
	//*  60  101:ifnull          22
	//*  61  104:aload_0         
	//*  62  105:getfield        #27  <Field ChildHelper$Bucket mNext>
	//*  63  108:iconst_0        
	//*  64  109:invokevirtual   #50  <Method boolean get(int)>
	//*  65  112:ifeq            121
	//*  66  115:aload_0         
	//*  67  116:bipush          63
	//*  68  118:invokevirtual   #57  <Method void set(int)>
	//*  69  121:aload_0         
	//*  70  122:getfield        #27  <Field ChildHelper$Bucket mNext>
	//*  71  125:iconst_0        
	//*  72  126:invokevirtual   #60  <Method boolean remove(int)>
	//*  73  129:pop             
	//*  74  130:iload_2         
	//*  75  131:ireturn         
				flag = false;
	//   76  132:iconst_0        
	//   77  133:istore_2        
			mData = mData & ~l;
			l--;
			l1 = mData;
			mData = Long.rotateRight(~l & mData, 1) | l1 & l;
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
	//*  78  134:goto            43
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
