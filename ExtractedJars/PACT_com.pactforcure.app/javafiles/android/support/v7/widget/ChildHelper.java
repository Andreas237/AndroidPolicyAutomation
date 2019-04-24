// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

class ChildHelper
{
	static class Bucket
	{

		private void ensureNext()
		{
			if(mNext == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field ChildHelper$Bucket mNext>
		//*   2    4:ifnonnull       18
				mNext = new Bucket();
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
		Bucket mNext;

		Bucket()
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

	static interface Callback
	{

		public abstract void addView(View view, int i);

		public abstract void attachViewToParent(View view, int i, android.view.ViewGroup.LayoutParams layoutparams);

		public abstract void detachViewFromParent(int i);

		public abstract View getChildAt(int i);

		public abstract int getChildCount();

		public abstract RecyclerView.ViewHolder getChildViewHolder(View view);

		public abstract int indexOfChild(View view);

		public abstract void onEnteredHiddenState(View view);

		public abstract void onLeftHiddenState(View view);

		public abstract void removeAllViews();

		public abstract void removeViewAt(int i);
	}


	ChildHelper(Callback callback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		mCallback = callback;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #31  <Field ChildHelper$Callback mCallback>
	//    5    9:aload_0         
	//    6   10:new             #6   <Class ChildHelper$Bucket>
	//    7   13:dup             
	//    8   14:invokespecial   #32  <Method void ChildHelper$Bucket()>
	//    9   17:putfield        #34  <Field ChildHelper$Bucket mBucket>
	//   10   20:aload_0         
	//   11   21:new             #36  <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #37  <Method void ArrayList()>
	//   14   28:putfield        #39  <Field List mHiddenViews>
	//   15   31:return          
	}

	private int getOffset(int i)
	{
		if(i >= 0)
			break MISSING_BLOCK_LABEL_8;
	//    0    0:iload_1         
	//    1    1:ifge            8
		i = -1;
	//    2    4:iconst_m1       
	//    3    5:istore_1        
		return i;
	//    4    6:iload_1         
	//    5    7:ireturn         
		int j;
		int k;
		int l;
		k = mCallback.getChildCount();
	//    6    8:aload_0         
	//    7    9:getfield        #31  <Field ChildHelper$Callback mCallback>
	//    8   12:invokeinterface #46  <Method int ChildHelper$Callback.getChildCount()>
	//    9   17:istore_3        
		j = i;
	//   10   18:iload_1         
	//   11   19:istore_2        
		  goto _L1
	//*  12   20:iload_2         
	//*  13   21:iload_3         
	//*  14   22:icmpge          72
	//*  15   25:iload_1         
	//*  16   26:iload_2         
	//*  17   27:aload_0         
	//*  18   28:getfield        #34  <Field ChildHelper$Bucket mBucket>
	//*  19   31:iload_2         
	//*  20   32:invokevirtual   #49  <Method int ChildHelper$Bucket.countOnesBefore(int)>
	//*  21   35:isub            
	//*  22   36:isub            
	//*  23   37:istore          4
	//*  24   39:iload           4
	//*  25   41:ifne            64
	//*  26   44:iload_2         
	//*  27   45:istore_1        
	//*  28   46:aload_0         
	//*  29   47:getfield        #34  <Field ChildHelper$Bucket mBucket>
	//*  30   50:iload_2         
	//*  31   51:invokevirtual   #53  <Method boolean ChildHelper$Bucket.get(int)>
	//*  32   54:ifeq            6
	//*  33   57:iload_2         
	//*  34   58:iconst_1        
	//*  35   59:iadd            
	//*  36   60:istore_2        
		continue; /* Loop/switch isn't completed */
	//   37   61:goto            44
		j += l;
	//   38   64:iload_2         
	//   39   65:iload           4
	//   40   67:iadd            
	//   41   68:istore_2        
	//*  42   69:goto            20
	//*  43   72:iconst_m1       
	//*  44   73:ireturn         
	}

	private void hideViewInternal(View view)
	{
		mHiddenViews.add(((Object) (view)));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field List mHiddenViews>
	//    2    4:aload_1         
	//    3    5:invokeinterface #61  <Method boolean List.add(Object)>
	//    4   10:pop             
		mCallback.onEnteredHiddenState(view);
	//    5   11:aload_0         
	//    6   12:getfield        #31  <Field ChildHelper$Callback mCallback>
	//    7   15:aload_1         
	//    8   16:invokeinterface #64  <Method void ChildHelper$Callback.onEnteredHiddenState(View)>
	//    9   21:return          
	}

	private boolean unhideViewInternal(View view)
	{
		if(mHiddenViews.remove(((Object) (view))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field List mHiddenViews>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #69  <Method boolean List.remove(Object)>
	//*   4   10:ifeq            25
		{
			mCallback.onLeftHiddenState(view);
	//    5   13:aload_0         
	//    6   14:getfield        #31  <Field ChildHelper$Callback mCallback>
	//    7   17:aload_1         
	//    8   18:invokeinterface #72  <Method void ChildHelper$Callback.onLeftHiddenState(View)>
			return true;
	//    9   23:iconst_1        
	//   10   24:ireturn         
		} else
		{
			return false;
	//   11   25:iconst_0        
	//   12   26:ireturn         
		}
	}

	void addView(View view, int i, boolean flag)
	{
		if(i < 0)
	//*   0    0:iload_2         
	//*   1    1:ifge            44
			i = mCallback.getChildCount();
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field ChildHelper$Callback mCallback>
	//    4    8:invokeinterface #46  <Method int ChildHelper$Callback.getChildCount()>
	//    5   13:istore_2        
		else
	//*   6   14:aload_0         
	//*   7   15:getfield        #34  <Field ChildHelper$Bucket mBucket>
	//*   8   18:iload_2         
	//*   9   19:iload_3         
	//*  10   20:invokevirtual   #78  <Method void ChildHelper$Bucket.insert(int, boolean)>
	//*  11   23:iload_3         
	//*  12   24:ifeq            32
	//*  13   27:aload_0         
	//*  14   28:aload_1         
	//*  15   29:invokespecial   #80  <Method void hideViewInternal(View)>
	//*  16   32:aload_0         
	//*  17   33:getfield        #31  <Field ChildHelper$Callback mCallback>
	//*  18   36:aload_1         
	//*  19   37:iload_2         
	//*  20   38:invokeinterface #83  <Method void ChildHelper$Callback.addView(View, int)>
	//*  21   43:return          
			i = getOffset(i);
	//   22   44:aload_0         
	//   23   45:iload_2         
	//   24   46:invokespecial   #85  <Method int getOffset(int)>
	//   25   49:istore_2        
		mBucket.insert(i, flag);
		if(flag)
			hideViewInternal(view);
		mCallback.addView(view, i);
	//*  26   50:goto            14
	}

	void addView(View view, boolean flag)
	{
		addView(view, -1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:iload_2         
	//    4    4:invokevirtual   #88  <Method void addView(View, int, boolean)>
	//    5    7:return          
	}

	void attachViewToParent(View view, int i, android.view.ViewGroup.LayoutParams layoutparams, boolean flag)
	{
		if(i < 0)
	//*   0    0:iload_2         
	//*   1    1:ifge            47
			i = mCallback.getChildCount();
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field ChildHelper$Callback mCallback>
	//    4    8:invokeinterface #46  <Method int ChildHelper$Callback.getChildCount()>
	//    5   13:istore_2        
		else
	//*   6   14:aload_0         
	//*   7   15:getfield        #34  <Field ChildHelper$Bucket mBucket>
	//*   8   18:iload_2         
	//*   9   19:iload           4
	//*  10   21:invokevirtual   #78  <Method void ChildHelper$Bucket.insert(int, boolean)>
	//*  11   24:iload           4
	//*  12   26:ifeq            34
	//*  13   29:aload_0         
	//*  14   30:aload_1         
	//*  15   31:invokespecial   #80  <Method void hideViewInternal(View)>
	//*  16   34:aload_0         
	//*  17   35:getfield        #31  <Field ChildHelper$Callback mCallback>
	//*  18   38:aload_1         
	//*  19   39:iload_2         
	//*  20   40:aload_3         
	//*  21   41:invokeinterface #93  <Method void ChildHelper$Callback.attachViewToParent(View, int, android.view.ViewGroup$LayoutParams)>
	//*  22   46:return          
			i = getOffset(i);
	//   23   47:aload_0         
	//   24   48:iload_2         
	//   25   49:invokespecial   #85  <Method int getOffset(int)>
	//   26   52:istore_2        
		mBucket.insert(i, flag);
		if(flag)
			hideViewInternal(view);
		mCallback.attachViewToParent(view, i, layoutparams);
	//*  27   53:goto            14
	}

	void detachViewFromParent(int i)
	{
		i = getOffset(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #85  <Method int getOffset(int)>
	//    3    5:istore_1        
		mBucket.remove(i);
	//    4    6:aload_0         
	//    5    7:getfield        #34  <Field ChildHelper$Bucket mBucket>
	//    6   10:iload_1         
	//    7   11:invokevirtual   #97  <Method boolean ChildHelper$Bucket.remove(int)>
	//    8   14:pop             
		mCallback.detachViewFromParent(i);
	//    9   15:aload_0         
	//   10   16:getfield        #31  <Field ChildHelper$Callback mCallback>
	//   11   19:iload_1         
	//   12   20:invokeinterface #99  <Method void ChildHelper$Callback.detachViewFromParent(int)>
	//   13   25:return          
	}

	View findHiddenNonRemovedView(int i)
	{
		int k = mHiddenViews.size();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field List mHiddenViews>
	//    2    4:invokeinterface #104 <Method int List.size()>
	//    3    9:istore_3        
		for(int j = 0; j < k; j++)
	//*   4   10:iconst_0        
	//*   5   11:istore_2        
	//*   6   12:iload_2         
	//*   7   13:iload_3         
	//*   8   14:icmpge          80
		{
			View view = (View)mHiddenViews.get(j);
	//    9   17:aload_0         
	//   10   18:getfield        #39  <Field List mHiddenViews>
	//   11   21:iload_2         
	//   12   22:invokeinterface #107 <Method Object List.get(int)>
	//   13   27:checkcast       #109 <Class View>
	//   14   30:astore          4
			RecyclerView.ViewHolder viewholder = mCallback.getChildViewHolder(view);
	//   15   32:aload_0         
	//   16   33:getfield        #31  <Field ChildHelper$Callback mCallback>
	//   17   36:aload           4
	//   18   38:invokeinterface #113 <Method RecyclerView$ViewHolder ChildHelper$Callback.getChildViewHolder(View)>
	//   19   43:astore          5
			if(viewholder.getLayoutPosition() == i && !viewholder.isInvalid() && !viewholder.isRemoved())
	//*  20   45:aload           5
	//*  21   47:invokevirtual   #118 <Method int RecyclerView$ViewHolder.getLayoutPosition()>
	//*  22   50:iload_1         
	//*  23   51:icmpne          73
	//*  24   54:aload           5
	//*  25   56:invokevirtual   #122 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//*  26   59:ifne            73
	//*  27   62:aload           5
	//*  28   64:invokevirtual   #125 <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*  29   67:ifne            73
				return view;
	//   30   70:aload           4
	//   31   72:areturn         
		}

	//   32   73:iload_2         
	//   33   74:iconst_1        
	//   34   75:iadd            
	//   35   76:istore_2        
	//*  36   77:goto            12
		return null;
	//   37   80:aconst_null     
	//   38   81:areturn         
	}

	View getChildAt(int i)
	{
		i = getOffset(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #85  <Method int getOffset(int)>
	//    3    5:istore_1        
		return mCallback.getChildAt(i);
	//    4    6:aload_0         
	//    5    7:getfield        #31  <Field ChildHelper$Callback mCallback>
	//    6   10:iload_1         
	//    7   11:invokeinterface #128 <Method View ChildHelper$Callback.getChildAt(int)>
	//    8   16:areturn         
	}

	int getChildCount()
	{
		return mCallback.getChildCount() - mHiddenViews.size();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ChildHelper$Callback mCallback>
	//    2    4:invokeinterface #46  <Method int ChildHelper$Callback.getChildCount()>
	//    3    9:aload_0         
	//    4   10:getfield        #39  <Field List mHiddenViews>
	//    5   13:invokeinterface #104 <Method int List.size()>
	//    6   18:isub            
	//    7   19:ireturn         
	}

	View getUnfilteredChildAt(int i)
	{
		return mCallback.getChildAt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ChildHelper$Callback mCallback>
	//    2    4:iload_1         
	//    3    5:invokeinterface #128 <Method View ChildHelper$Callback.getChildAt(int)>
	//    4   10:areturn         
	}

	int getUnfilteredChildCount()
	{
		return mCallback.getChildCount();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ChildHelper$Callback mCallback>
	//    2    4:invokeinterface #46  <Method int ChildHelper$Callback.getChildCount()>
	//    3    9:ireturn         
	}

	void hide(View view)
	{
		int i = mCallback.indexOfChild(view);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ChildHelper$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #135 <Method int ChildHelper$Callback.indexOfChild(View)>
	//    4   10:istore_2        
		if(i < 0)
	//*   5   11:iload_2         
	//*   6   12:ifge            42
		{
			throw new IllegalArgumentException((new StringBuilder()).append("view is not a child, cannot hide ").append(((Object) (view))).toString());
	//    7   15:new             #137 <Class IllegalArgumentException>
	//    8   18:dup             
	//    9   19:new             #139 <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #140 <Method void StringBuilder()>
	//   12   26:ldc1            #142 <String "view is not a child, cannot hide ">
	//   13   28:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   14   31:aload_1         
	//   15   32:invokevirtual   #149 <Method StringBuilder StringBuilder.append(Object)>
	//   16   35:invokevirtual   #153 <Method String StringBuilder.toString()>
	//   17   38:invokespecial   #156 <Method void IllegalArgumentException(String)>
	//   18   41:athrow          
		} else
		{
			mBucket.set(i);
	//   19   42:aload_0         
	//   20   43:getfield        #34  <Field ChildHelper$Bucket mBucket>
	//   21   46:iload_2         
	//   22   47:invokevirtual   #159 <Method void ChildHelper$Bucket.set(int)>
			hideViewInternal(view);
	//   23   50:aload_0         
	//   24   51:aload_1         
	//   25   52:invokespecial   #80  <Method void hideViewInternal(View)>
			return;
	//   26   55:return          
		}
	}

	int indexOfChild(View view)
	{
		int i;
		for(i = mCallback.indexOfChild(view); i == -1 || mBucket.get(i);)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field ChildHelper$Callback mCallback>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #135 <Method int ChildHelper$Callback.indexOfChild(View)>
	//*   4   10:istore_2        
	//*   5   11:iload_2         
	//*   6   12:iconst_m1       
	//*   7   13:icmpne          18
			return -1;
	//    8   16:iconst_m1       
	//    9   17:ireturn         

	//   10   18:aload_0         
	//   11   19:getfield        #34  <Field ChildHelper$Bucket mBucket>
	//   12   22:iload_2         
	//   13   23:invokevirtual   #53  <Method boolean ChildHelper$Bucket.get(int)>
	//   14   26:ifne            16
		return i - mBucket.countOnesBefore(i);
	//   15   29:iload_2         
	//   16   30:aload_0         
	//   17   31:getfield        #34  <Field ChildHelper$Bucket mBucket>
	//   18   34:iload_2         
	//   19   35:invokevirtual   #49  <Method int ChildHelper$Bucket.countOnesBefore(int)>
	//   20   38:isub            
	//   21   39:ireturn         
	}

	boolean isHidden(View view)
	{
		return mHiddenViews.contains(((Object) (view)));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field List mHiddenViews>
	//    2    4:aload_1         
	//    3    5:invokeinterface #163 <Method boolean List.contains(Object)>
	//    4   10:ireturn         
	}

	void removeAllViewsUnfiltered()
	{
		mBucket.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ChildHelper$Bucket mBucket>
	//    2    4:invokevirtual   #167 <Method void ChildHelper$Bucket.reset()>
		for(int i = mHiddenViews.size() - 1; i >= 0; i--)
	//*   3    7:aload_0         
	//*   4    8:getfield        #39  <Field List mHiddenViews>
	//*   5   11:invokeinterface #104 <Method int List.size()>
	//*   6   16:iconst_1        
	//*   7   17:isub            
	//*   8   18:istore_1        
	//*   9   19:iload_1         
	//*  10   20:iflt            63
		{
			mCallback.onLeftHiddenState((View)mHiddenViews.get(i));
	//   11   23:aload_0         
	//   12   24:getfield        #31  <Field ChildHelper$Callback mCallback>
	//   13   27:aload_0         
	//   14   28:getfield        #39  <Field List mHiddenViews>
	//   15   31:iload_1         
	//   16   32:invokeinterface #107 <Method Object List.get(int)>
	//   17   37:checkcast       #109 <Class View>
	//   18   40:invokeinterface #72  <Method void ChildHelper$Callback.onLeftHiddenState(View)>
			mHiddenViews.remove(i);
	//   19   45:aload_0         
	//   20   46:getfield        #39  <Field List mHiddenViews>
	//   21   49:iload_1         
	//   22   50:invokeinterface #169 <Method Object List.remove(int)>
	//   23   55:pop             
		}

	//   24   56:iload_1         
	//   25   57:iconst_1        
	//   26   58:isub            
	//   27   59:istore_1        
	//*  28   60:goto            19
		mCallback.removeAllViews();
	//   29   63:aload_0         
	//   30   64:getfield        #31  <Field ChildHelper$Callback mCallback>
	//   31   67:invokeinterface #172 <Method void ChildHelper$Callback.removeAllViews()>
	//   32   72:return          
	}

	void removeView(View view)
	{
		int i = mCallback.indexOfChild(view);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ChildHelper$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #135 <Method int ChildHelper$Callback.indexOfChild(View)>
	//    4   10:istore_2        
		if(i < 0)
	//*   5   11:iload_2         
	//*   6   12:ifge            16
			return;
	//    7   15:return          
		if(mBucket.remove(i))
	//*   8   16:aload_0         
	//*   9   17:getfield        #34  <Field ChildHelper$Bucket mBucket>
	//*  10   20:iload_2         
	//*  11   21:invokevirtual   #97  <Method boolean ChildHelper$Bucket.remove(int)>
	//*  12   24:ifeq            33
			unhideViewInternal(view);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:invokespecial   #175 <Method boolean unhideViewInternal(View)>
	//   16   32:pop             
		mCallback.removeViewAt(i);
	//   17   33:aload_0         
	//   18   34:getfield        #31  <Field ChildHelper$Callback mCallback>
	//   19   37:iload_2         
	//   20   38:invokeinterface #178 <Method void ChildHelper$Callback.removeViewAt(int)>
	//   21   43:return          
	}

	void removeViewAt(int i)
	{
		i = getOffset(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #85  <Method int getOffset(int)>
	//    3    5:istore_1        
		View view = mCallback.getChildAt(i);
	//    4    6:aload_0         
	//    5    7:getfield        #31  <Field ChildHelper$Callback mCallback>
	//    6   10:iload_1         
	//    7   11:invokeinterface #128 <Method View ChildHelper$Callback.getChildAt(int)>
	//    8   16:astore_2        
		if(view == null)
	//*   9   17:aload_2         
	//*  10   18:ifnonnull       22
			return;
	//   11   21:return          
		if(mBucket.remove(i))
	//*  12   22:aload_0         
	//*  13   23:getfield        #34  <Field ChildHelper$Bucket mBucket>
	//*  14   26:iload_1         
	//*  15   27:invokevirtual   #97  <Method boolean ChildHelper$Bucket.remove(int)>
	//*  16   30:ifeq            39
			unhideViewInternal(view);
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:invokespecial   #175 <Method boolean unhideViewInternal(View)>
	//   20   38:pop             
		mCallback.removeViewAt(i);
	//   21   39:aload_0         
	//   22   40:getfield        #31  <Field ChildHelper$Callback mCallback>
	//   23   43:iload_1         
	//   24   44:invokeinterface #178 <Method void ChildHelper$Callback.removeViewAt(int)>
	//   25   49:return          
	}

	boolean removeViewIfHidden(View view)
	{
		int i = mCallback.indexOfChild(view);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ChildHelper$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #135 <Method int ChildHelper$Callback.indexOfChild(View)>
	//    4   10:istore_2        
		if(i == -1)
	//*   5   11:iload_2         
	//*   6   12:iconst_m1       
	//*   7   13:icmpne          26
		{
			if(!unhideViewInternal(view));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #175 <Method boolean unhideViewInternal(View)>
	//   11   21:ifeq            24
			return true;
	//   12   24:iconst_1        
	//   13   25:ireturn         
		}
		if(mBucket.get(i))
	//*  14   26:aload_0         
	//*  15   27:getfield        #34  <Field ChildHelper$Bucket mBucket>
	//*  16   30:iload_2         
	//*  17   31:invokevirtual   #53  <Method boolean ChildHelper$Bucket.get(int)>
	//*  18   34:ifeq            66
		{
			mBucket.remove(i);
	//   19   37:aload_0         
	//   20   38:getfield        #34  <Field ChildHelper$Bucket mBucket>
	//   21   41:iload_2         
	//   22   42:invokevirtual   #97  <Method boolean ChildHelper$Bucket.remove(int)>
	//   23   45:pop             
			if(unhideViewInternal(view));
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:invokespecial   #175 <Method boolean unhideViewInternal(View)>
	//   27   51:ifne            54
			mCallback.removeViewAt(i);
	//   28   54:aload_0         
	//   29   55:getfield        #31  <Field ChildHelper$Callback mCallback>
	//   30   58:iload_2         
	//   31   59:invokeinterface #178 <Method void ChildHelper$Callback.removeViewAt(int)>
			return true;
	//   32   64:iconst_1        
	//   33   65:ireturn         
		} else
		{
			return false;
	//   34   66:iconst_0        
	//   35   67:ireturn         
		}
	}

	public String toString()
	{
		return (new StringBuilder()).append(mBucket.toString()).append(", hidden list:").append(mHiddenViews.size()).toString();
	//    0    0:new             #139 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #140 <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:getfield        #34  <Field ChildHelper$Bucket mBucket>
	//    5   11:invokevirtual   #180 <Method String ChildHelper$Bucket.toString()>
	//    6   14:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:ldc1            #182 <String ", hidden list:">
	//    8   19:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//    9   22:aload_0         
	//   10   23:getfield        #39  <Field List mHiddenViews>
	//   11   26:invokeinterface #104 <Method int List.size()>
	//   12   31:invokevirtual   #185 <Method StringBuilder StringBuilder.append(int)>
	//   13   34:invokevirtual   #153 <Method String StringBuilder.toString()>
	//   14   37:areturn         
	}

	void unhide(View view)
	{
		int i = mCallback.indexOfChild(view);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ChildHelper$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #135 <Method int ChildHelper$Callback.indexOfChild(View)>
	//    4   10:istore_2        
		if(i < 0)
	//*   5   11:iload_2         
	//*   6   12:ifge            42
			throw new IllegalArgumentException((new StringBuilder()).append("view is not a child, cannot hide ").append(((Object) (view))).toString());
	//    7   15:new             #137 <Class IllegalArgumentException>
	//    8   18:dup             
	//    9   19:new             #139 <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #140 <Method void StringBuilder()>
	//   12   26:ldc1            #142 <String "view is not a child, cannot hide ">
	//   13   28:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   14   31:aload_1         
	//   15   32:invokevirtual   #149 <Method StringBuilder StringBuilder.append(Object)>
	//   16   35:invokevirtual   #153 <Method String StringBuilder.toString()>
	//   17   38:invokespecial   #156 <Method void IllegalArgumentException(String)>
	//   18   41:athrow          
		if(!mBucket.get(i))
	//*  19   42:aload_0         
	//*  20   43:getfield        #34  <Field ChildHelper$Bucket mBucket>
	//*  21   46:iload_2         
	//*  22   47:invokevirtual   #53  <Method boolean ChildHelper$Bucket.get(int)>
	//*  23   50:ifne            80
		{
			throw new RuntimeException((new StringBuilder()).append("trying to unhide a view that was not hidden").append(((Object) (view))).toString());
	//   24   53:new             #188 <Class RuntimeException>
	//   25   56:dup             
	//   26   57:new             #139 <Class StringBuilder>
	//   27   60:dup             
	//   28   61:invokespecial   #140 <Method void StringBuilder()>
	//   29   64:ldc1            #190 <String "trying to unhide a view that was not hidden">
	//   30   66:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   31   69:aload_1         
	//   32   70:invokevirtual   #149 <Method StringBuilder StringBuilder.append(Object)>
	//   33   73:invokevirtual   #153 <Method String StringBuilder.toString()>
	//   34   76:invokespecial   #191 <Method void RuntimeException(String)>
	//   35   79:athrow          
		} else
		{
			mBucket.clear(i);
	//   36   80:aload_0         
	//   37   81:getfield        #34  <Field ChildHelper$Bucket mBucket>
	//   38   84:iload_2         
	//   39   85:invokevirtual   #194 <Method void ChildHelper$Bucket.clear(int)>
			unhideViewInternal(view);
	//   40   88:aload_0         
	//   41   89:aload_1         
	//   42   90:invokespecial   #175 <Method boolean unhideViewInternal(View)>
	//   43   93:pop             
			return;
	//   44   94:return          
		}
	}

	private static final boolean DEBUG = false;
	private static final String TAG = "ChildrenHelper";
	final Bucket mBucket = new Bucket();
	final Callback mCallback;
	final List mHiddenViews = new ArrayList();
}
