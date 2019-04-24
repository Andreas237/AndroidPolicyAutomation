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
			mData = mData & l | (mData & (-1L ^ l)) << 1;
		//   31   50:aload_0         
		//   32   51:aload_0         
		//   33   52:getfield        #23  <Field long mData>
		//   34   55:lload           4
		//   35   57:land            
		//   36   58:aload_0         
		//   37   59:getfield        #23  <Field long mData>
		//   38   62:ldc2w           #33  <Long -1L>
		//   39   65:lload           4
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
			mData = mData & (-1L ^ l);
		//   28   46:aload_0         
		//   29   47:aload_0         
		//   30   48:getfield        #23  <Field long mData>
		//   31   51:ldc2w           #33  <Long -1L>
		//   32   54:lload_2         
		//   33   55:lxor            
		//   34   56:land            
		//   35   57:putfield        #23  <Field long mData>
			l--;
		//   36   60:lload_2         
		//   37   61:lconst_1        
		//   38   62:lsub            
		//   39   63:lstore_2        
			mData = mData & l | Long.rotateRight(mData & (-1L ^ l), 1);
		//   40   64:aload_0         
		//   41   65:aload_0         
		//   42   66:getfield        #23  <Field long mData>
		//   43   69:lload_2         
		//   44   70:land            
		//   45   71:aload_0         
		//   46   72:getfield        #23  <Field long mData>
		//   47   75:ldc2w           #33  <Long -1L>
		//   48   78:lload_2         
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
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            6
			return -1;
	//    2    4:iconst_m1       
	//    3    5:ireturn         
		int k = mCallback.getChildCount();
	//    4    6:aload_0         
	//    5    7:getfield        #31  <Field ChildHelper$Callback mCallback>
	//    6   10:invokeinterface #46  <Method int ChildHelper$Callback.getChildCount()>
	//    7   15:istore_3        
		int l;
		for(int j = i; j < k; j += l)
	//*   8   16:iload_1         
	//*   9   17:istore_2        
	//*  10   18:iload_2         
	//*  11   19:iload_3         
	//*  12   20:icmpge          70
		{
			l = i - (j - mBucket.countOnesBefore(j));
	//   13   23:iload_1         
	//   14   24:iload_2         
	//   15   25:aload_0         
	//   16   26:getfield        #34  <Field ChildHelper$Bucket mBucket>
	//   17   29:iload_2         
	//   18   30:invokevirtual   #49  <Method int ChildHelper$Bucket.countOnesBefore(int)>
	//   19   33:isub            
	//   20   34:isub            
	//   21   35:istore          4
			if(l == 0)
	//*  22   37:iload           4
	//*  23   39:ifne            62
			{
				for(; mBucket.get(j); j++);
	//   24   42:aload_0         
	//   25   43:getfield        #34  <Field ChildHelper$Bucket mBucket>
	//   26   46:iload_2         
	//   27   47:invokevirtual   #53  <Method boolean ChildHelper$Bucket.get(int)>
	//   28   50:ifeq            60
	//   29   53:iload_2         
	//   30   54:iconst_1        
	//   31   55:iadd            
	//   32   56:istore_2        
	//*  33   57:goto            42
				return j;
	//   34   60:iload_2         
	//   35   61:ireturn         
			}
		}

	//   36   62:iload_2         
	//   37   63:iload           4
	//   38   65:iadd            
	//   39   66:istore_2        
	//*  40   67:goto            18
		return -1;
	//   41   70:iconst_m1       
	//   42   71:ireturn         
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
	//*   1    1:ifge            17
			i = mCallback.getChildCount();
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field ChildHelper$Callback mCallback>
	//    4    8:invokeinterface #46  <Method int ChildHelper$Callback.getChildCount()>
	//    5   13:istore_2        
		else
	//*   6   14:goto            23
			i = getOffset(i);
	//    7   17:aload_0         
	//    8   18:iload_2         
	//    9   19:invokespecial   #76  <Method int getOffset(int)>
	//   10   22:istore_2        
		mBucket.insert(i, flag);
	//   11   23:aload_0         
	//   12   24:getfield        #34  <Field ChildHelper$Bucket mBucket>
	//   13   27:iload_2         
	//   14   28:iload_3         
	//   15   29:invokevirtual   #80  <Method void ChildHelper$Bucket.insert(int, boolean)>
		if(flag)
	//*  16   32:iload_3         
	//*  17   33:ifeq            41
			hideViewInternal(view);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokespecial   #82  <Method void hideViewInternal(View)>
		mCallback.addView(view, i);
	//   21   41:aload_0         
	//   22   42:getfield        #31  <Field ChildHelper$Callback mCallback>
	//   23   45:aload_1         
	//   24   46:iload_2         
	//   25   47:invokeinterface #85  <Method void ChildHelper$Callback.addView(View, int)>
	//   26   52:return          
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
	//*   1    1:ifge            17
			i = mCallback.getChildCount();
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field ChildHelper$Callback mCallback>
	//    4    8:invokeinterface #46  <Method int ChildHelper$Callback.getChildCount()>
	//    5   13:istore_2        
		else
	//*   6   14:goto            23
			i = getOffset(i);
	//    7   17:aload_0         
	//    8   18:iload_2         
	//    9   19:invokespecial   #76  <Method int getOffset(int)>
	//   10   22:istore_2        
		mBucket.insert(i, flag);
	//   11   23:aload_0         
	//   12   24:getfield        #34  <Field ChildHelper$Bucket mBucket>
	//   13   27:iload_2         
	//   14   28:iload           4
	//   15   30:invokevirtual   #80  <Method void ChildHelper$Bucket.insert(int, boolean)>
		if(flag)
	//*  16   33:iload           4
	//*  17   35:ifeq            43
			hideViewInternal(view);
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:invokespecial   #82  <Method void hideViewInternal(View)>
		mCallback.attachViewToParent(view, i, layoutparams);
	//   21   43:aload_0         
	//   22   44:getfield        #31  <Field ChildHelper$Callback mCallback>
	//   23   47:aload_1         
	//   24   48:iload_2         
	//   25   49:aload_3         
	//   26   50:invokeinterface #93  <Method void ChildHelper$Callback.attachViewToParent(View, int, android.view.ViewGroup$LayoutParams)>
	//   27   55:return          
	}

	void detachViewFromParent(int i)
	{
		i = getOffset(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #76  <Method int getOffset(int)>
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
	//    2    2:invokespecial   #76  <Method int getOffset(int)>
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
	//   25   52:invokespecial   #82  <Method void hideViewInternal(View)>
			return;
	//   26   55:return          
		}
	}

	int indexOfChild(View view)
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
	//*   7   13:icmpne          18
			return -1;
	//    8   16:iconst_m1       
	//    9   17:ireturn         
		if(mBucket.get(i))
	//*  10   18:aload_0         
	//*  11   19:getfield        #34  <Field ChildHelper$Bucket mBucket>
	//*  12   22:iload_2         
	//*  13   23:invokevirtual   #53  <Method boolean ChildHelper$Bucket.get(int)>
	//*  14   26:ifeq            31
			return -1;
	//   15   29:iconst_m1       
	//   16   30:ireturn         
		else
			return i - mBucket.countOnesBefore(i);
	//   17   31:iload_2         
	//   18   32:aload_0         
	//   19   33:getfield        #34  <Field ChildHelper$Bucket mBucket>
	//   20   36:iload_2         
	//   21   37:invokevirtual   #49  <Method int ChildHelper$Bucket.countOnesBefore(int)>
	//   22   40:isub            
	//   23   41:ireturn         
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
	//    2    2:invokespecial   #76  <Method int getOffset(int)>
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
	//*   7   13:icmpne          24
		{
			unhideViewInternal(view);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #175 <Method boolean unhideViewInternal(View)>
	//   11   21:pop             
			return true;
	//   12   22:iconst_1        
	//   13   23:ireturn         
		}
		if(mBucket.get(i))
	//*  14   24:aload_0         
	//*  15   25:getfield        #34  <Field ChildHelper$Bucket mBucket>
	//*  16   28:iload_2         
	//*  17   29:invokevirtual   #53  <Method boolean ChildHelper$Bucket.get(int)>
	//*  18   32:ifeq            62
		{
			mBucket.remove(i);
	//   19   35:aload_0         
	//   20   36:getfield        #34  <Field ChildHelper$Bucket mBucket>
	//   21   39:iload_2         
	//   22   40:invokevirtual   #97  <Method boolean ChildHelper$Bucket.remove(int)>
	//   23   43:pop             
			unhideViewInternal(view);
	//   24   44:aload_0         
	//   25   45:aload_1         
	//   26   46:invokespecial   #175 <Method boolean unhideViewInternal(View)>
	//   27   49:pop             
			mCallback.removeViewAt(i);
	//   28   50:aload_0         
	//   29   51:getfield        #31  <Field ChildHelper$Callback mCallback>
	//   30   54:iload_2         
	//   31   55:invokeinterface #178 <Method void ChildHelper$Callback.removeViewAt(int)>
			return true;
	//   32   60:iconst_1        
	//   33   61:ireturn         
		} else
		{
			return false;
	//   34   62:iconst_0        
	//   35   63:ireturn         
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
