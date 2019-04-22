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
		//*   1    1:getfield        #21  <Field ChildHelper$Bucket mNext>
		//*   2    4:ifnonnull       18
				mNext = new Bucket();
		//    3    7:aload_0         
		//    4    8:new             #2   <Class ChildHelper$Bucket>
		//    5   11:dup             
		//    6   12:invokespecial   #22  <Method void ChildHelper$Bucket()>
		//    7   15:putfield        #21  <Field ChildHelper$Bucket mNext>
		//    8   18:return          
		}

		void clear(int i)
		{
			if(i >= 64)
		//*   0    0:iload_1         
		//*   1    1:bipush          64
		//*   2    3:icmplt          24
			{
				Bucket bucket = mNext;
		//    3    6:aload_0         
		//    4    7:getfield        #21  <Field ChildHelper$Bucket mNext>
		//    5   10:astore_2        
				if(bucket != null)
		//*   6   11:aload_2         
		//*   7   12:ifnull          36
				{
					bucket.clear(i - 64);
		//    8   15:aload_2         
		//    9   16:iload_1         
		//   10   17:bipush          64
		//   11   19:isub            
		//   12   20:invokevirtual   #26  <Method void clear(int)>
					return;
		//   13   23:return          
				}
			} else
			{
				mData = mData & 1L << i;
		//   14   24:aload_0         
		//   15   25:aload_0         
		//   16   26:getfield        #17  <Field long mData>
		//   17   29:lconst_1        
		//   18   30:iload_1         
		//   19   31:lshl            
		//   20   32:land            
		//   21   33:putfield        #17  <Field long mData>
			}
		//   22   36:return          
		}

		int countOnesBefore(int i)
		{
			Bucket bucket = mNext;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field ChildHelper$Bucket mNext>
		//    2    4:astore_2        
			if(bucket == null)
		//*   3    5:aload_2         
		//*   4    6:ifnonnull       37
				if(i >= 64)
		//*   5    9:iload_1         
		//*   6   10:bipush          64
		//*   7   12:icmplt          23
					return Long.bitCount(mData);
		//    8   15:aload_0         
		//    9   16:getfield        #17  <Field long mData>
		//   10   19:invokestatic    #34  <Method int Long.bitCount(long)>
		//   11   22:ireturn         
				else
					return Long.bitCount(mData & (1L << i) - 1L);
		//   12   23:aload_0         
		//   13   24:getfield        #17  <Field long mData>
		//   14   27:lconst_1        
		//   15   28:iload_1         
		//   16   29:lshl            
		//   17   30:lconst_1        
		//   18   31:lsub            
		//   19   32:land            
		//   20   33:invokestatic    #34  <Method int Long.bitCount(long)>
		//   21   36:ireturn         
			if(i < 64)
		//*  22   37:iload_1         
		//*  23   38:bipush          64
		//*  24   40:icmpge          57
				return Long.bitCount(mData & (1L << i) - 1L);
		//   25   43:aload_0         
		//   26   44:getfield        #17  <Field long mData>
		//   27   47:lconst_1        
		//   28   48:iload_1         
		//   29   49:lshl            
		//   30   50:lconst_1        
		//   31   51:lsub            
		//   32   52:land            
		//   33   53:invokestatic    #34  <Method int Long.bitCount(long)>
		//   34   56:ireturn         
			else
				return bucket.countOnesBefore(i - 64) + Long.bitCount(mData);
		//   35   57:aload_2         
		//   36   58:iload_1         
		//   37   59:bipush          64
		//   38   61:isub            
		//   39   62:invokevirtual   #36  <Method int countOnesBefore(int)>
		//   40   65:aload_0         
		//   41   66:getfield        #17  <Field long mData>
		//   42   69:invokestatic    #34  <Method int Long.bitCount(long)>
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
		//    4    7:invokespecial   #40  <Method void ensureNext()>
				return mNext.get(i - 64);
		//    5   10:aload_0         
		//    6   11:getfield        #21  <Field ChildHelper$Bucket mNext>
		//    7   14:iload_1         
		//    8   15:bipush          64
		//    9   17:isub            
		//   10   18:invokevirtual   #42  <Method boolean get(int)>
		//   11   21:ireturn         
			}
			return (mData & 1L << i) != 0L;
		//   12   22:aload_0         
		//   13   23:getfield        #17  <Field long mData>
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
		//    4    7:invokespecial   #40  <Method void ensureNext()>
				mNext.insert(i - 64, flag);
		//    5   10:aload_0         
		//    6   11:getfield        #21  <Field ChildHelper$Bucket mNext>
		//    7   14:iload_1         
		//    8   15:bipush          64
		//    9   17:isub            
		//   10   18:iload_2         
		//   11   19:invokevirtual   #46  <Method void insert(int, boolean)>
				return;
		//   12   22:return          
			}
			boolean flag1;
			if((mData & 0x0L) != 0L)
		//*  13   23:aload_0         
		//*  14   24:getfield        #17  <Field long mData>
		//*  15   27:ldc2w           #47  <Long 0x0L>
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
		//   32   51:getfield        #17  <Field long mData>
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
		//   44   70:putfield        #17  <Field long mData>
			if(flag)
		//*  45   73:iload_2         
		//*  46   74:ifeq            85
				set(i);
		//   47   77:aload_0         
		//   48   78:iload_1         
		//   49   79:invokevirtual   #51  <Method void set(int)>
			else
		//*  50   82:goto            90
				clear(i);
		//   51   85:aload_0         
		//   52   86:iload_1         
		//   53   87:invokevirtual   #26  <Method void clear(int)>
			if(flag1 || mNext != null)
		//*  54   90:iload_3         
		//*  55   91:ifne            101
		//*  56   94:aload_0         
		//*  57   95:getfield        #21  <Field ChildHelper$Bucket mNext>
		//*  58   98:ifnull          114
			{
				ensureNext();
		//   59  101:aload_0         
		//   60  102:invokespecial   #40  <Method void ensureNext()>
				mNext.insert(0, flag1);
		//   61  105:aload_0         
		//   62  106:getfield        #21  <Field ChildHelper$Bucket mNext>
		//   63  109:iconst_0        
		//   64  110:iload_3         
		//   65  111:invokevirtual   #46  <Method void insert(int, boolean)>
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
		//    4    7:invokespecial   #40  <Method void ensureNext()>
				return mNext.remove(i - 64);
		//    5   10:aload_0         
		//    6   11:getfield        #21  <Field ChildHelper$Bucket mNext>
		//    7   14:iload_1         
		//    8   15:bipush          64
		//    9   17:isub            
		//   10   18:invokevirtual   #54  <Method boolean remove(int)>
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
		//*  17   27:getfield        #17  <Field long mData>
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
		//   30   48:getfield        #17  <Field long mData>
		//   31   51:lload_2         
		//   32   52:land            
		//   33   53:putfield        #17  <Field long mData>
			l--;
		//   34   56:lload_2         
		//   35   57:lconst_1        
		//   36   58:lsub            
		//   37   59:lstore_2        
			long l1 = mData;
		//   38   60:aload_0         
		//   39   61:getfield        #17  <Field long mData>
		//   40   64:lstore          4
			mData = Long.rotateRight(l1 & l, 1) | l1 & l;
		//   41   66:aload_0         
		//   42   67:lload           4
		//   43   69:lload_2         
		//   44   70:land            
		//   45   71:iconst_1        
		//   46   72:invokestatic    #58  <Method long Long.rotateRight(long, int)>
		//   47   75:lload           4
		//   48   77:lload_2         
		//   49   78:land            
		//   50   79:lor             
		//   51   80:putfield        #17  <Field long mData>
			Bucket bucket = mNext;
		//   52   83:aload_0         
		//   53   84:getfield        #21  <Field ChildHelper$Bucket mNext>
		//   54   87:astore          7
			if(bucket != null)
		//*  55   89:aload           7
		//*  56   91:ifnull          118
			{
				if(bucket.get(0))
		//*  57   94:aload           7
		//*  58   96:iconst_0        
		//*  59   97:invokevirtual   #42  <Method boolean get(int)>
		//*  60  100:ifeq            109
					set(63);
		//   61  103:aload_0         
		//   62  104:bipush          63
		//   63  106:invokevirtual   #51  <Method void set(int)>
				mNext.remove(0);
		//   64  109:aload_0         
		//   65  110:getfield        #21  <Field ChildHelper$Bucket mNext>
		//   66  113:iconst_0        
		//   67  114:invokevirtual   #54  <Method boolean remove(int)>
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
		//    2    2:putfield        #17  <Field long mData>
			Bucket bucket = mNext;
		//    3    5:aload_0         
		//    4    6:getfield        #21  <Field ChildHelper$Bucket mNext>
		//    5    9:astore_1        
			if(bucket != null)
		//*   6   10:aload_1         
		//*   7   11:ifnull          18
				bucket.reset();
		//    8   14:aload_1         
		//    9   15:invokevirtual   #61  <Method void reset()>
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
		//    4    7:invokespecial   #40  <Method void ensureNext()>
				mNext.set(i - 64);
		//    5   10:aload_0         
		//    6   11:getfield        #21  <Field ChildHelper$Bucket mNext>
		//    7   14:iload_1         
		//    8   15:bipush          64
		//    9   17:isub            
		//   10   18:invokevirtual   #51  <Method void set(int)>
				return;
		//   11   21:return          
			} else
			{
				mData = mData | 1L << i;
		//   12   22:aload_0         
		//   13   23:aload_0         
		//   14   24:getfield        #17  <Field long mData>
		//   15   27:lconst_1        
		//   16   28:iload_1         
		//   17   29:lshl            
		//   18   30:lor             
		//   19   31:putfield        #17  <Field long mData>
				return;
		//   20   34:return          
			}
		}

		public String toString()
		{
			if(mNext == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field ChildHelper$Bucket mNext>
		//*   2    4:ifnonnull       15
			{
				return Long.toBinaryString(mData);
		//    3    7:aload_0         
		//    4    8:getfield        #17  <Field long mData>
		//    5   11:invokestatic    #67  <Method String Long.toBinaryString(long)>
		//    6   14:areturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    7   15:new             #69  <Class StringBuilder>
		//    8   18:dup             
		//    9   19:invokespecial   #70  <Method void StringBuilder()>
		//   10   22:astore_1        
				stringbuilder.append(mNext.toString());
		//   11   23:aload_1         
		//   12   24:aload_0         
		//   13   25:getfield        #21  <Field ChildHelper$Bucket mNext>
		//   14   28:invokevirtual   #72  <Method String toString()>
		//   15   31:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
		//   16   34:pop             
				stringbuilder.append("xx");
		//   17   35:aload_1         
		//   18   36:ldc1            #78  <String "xx">
		//   19   38:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
		//   20   41:pop             
				stringbuilder.append(Long.toBinaryString(mData));
		//   21   42:aload_1         
		//   22   43:aload_0         
		//   23   44:getfield        #17  <Field long mData>
		//   24   47:invokestatic    #67  <Method String Long.toBinaryString(long)>
		//   25   50:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
		//   26   53:pop             
				return stringbuilder.toString();
		//   27   54:aload_1         
		//   28   55:invokevirtual   #79  <Method String StringBuilder.toString()>
		//   29   58:areturn         
			}
		}

		long mData;
		Bucket mNext;

		Bucket()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			mData = 0L;
		//    2    4:aload_0         
		//    3    5:lconst_0        
		//    4    6:putfield        #17  <Field long mData>
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
	//    1    1:invokespecial   #22  <Method void Object()>
		mCallback = callback;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field ChildHelper$Callback mCallback>
	//    5    9:aload_0         
	//    6   10:new             #6   <Class ChildHelper$Bucket>
	//    7   13:dup             
	//    8   14:invokespecial   #25  <Method void ChildHelper$Bucket()>
	//    9   17:putfield        #27  <Field ChildHelper$Bucket mBucket>
	//   10   20:aload_0         
	//   11   21:new             #29  <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #30  <Method void ArrayList()>
	//   14   28:putfield        #32  <Field List mHiddenViews>
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
	//    5    7:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    6   10:invokeinterface #39  <Method int ChildHelper$Callback.getChildCount()>
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
	//   16   26:getfield        #27  <Field ChildHelper$Bucket mBucket>
	//   17   29:iload_2         
	//   18   30:invokevirtual   #42  <Method int ChildHelper$Bucket.countOnesBefore(int)>
	//   19   33:isub            
	//   20   34:isub            
	//   21   35:istore          4
			if(l == 0)
	//*  22   37:iload           4
	//*  23   39:ifne            62
			{
				for(; mBucket.get(j); j++);
	//   24   42:aload_0         
	//   25   43:getfield        #27  <Field ChildHelper$Bucket mBucket>
	//   26   46:iload_2         
	//   27   47:invokevirtual   #46  <Method boolean ChildHelper$Bucket.get(int)>
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
	//    1    1:getfield        #32  <Field List mHiddenViews>
	//    2    4:aload_1         
	//    3    5:invokeinterface #54  <Method boolean List.add(Object)>
	//    4   10:pop             
		mCallback.onEnteredHiddenState(view);
	//    5   11:aload_0         
	//    6   12:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    7   15:aload_1         
	//    8   16:invokeinterface #57  <Method void ChildHelper$Callback.onEnteredHiddenState(View)>
	//    9   21:return          
	}

	private boolean unhideViewInternal(View view)
	{
		if(mHiddenViews.remove(((Object) (view))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field List mHiddenViews>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #62  <Method boolean List.remove(Object)>
	//*   4   10:ifeq            25
		{
			mCallback.onLeftHiddenState(view);
	//    5   13:aload_0         
	//    6   14:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    7   17:aload_1         
	//    8   18:invokeinterface #65  <Method void ChildHelper$Callback.onLeftHiddenState(View)>
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
	//    3    5:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    4    8:invokeinterface #39  <Method int ChildHelper$Callback.getChildCount()>
	//    5   13:istore_2        
		else
	//*   6   14:goto            23
			i = getOffset(i);
	//    7   17:aload_0         
	//    8   18:iload_2         
	//    9   19:invokespecial   #69  <Method int getOffset(int)>
	//   10   22:istore_2        
		mBucket.insert(i, flag);
	//   11   23:aload_0         
	//   12   24:getfield        #27  <Field ChildHelper$Bucket mBucket>
	//   13   27:iload_2         
	//   14   28:iload_3         
	//   15   29:invokevirtual   #73  <Method void ChildHelper$Bucket.insert(int, boolean)>
		if(flag)
	//*  16   32:iload_3         
	//*  17   33:ifeq            41
			hideViewInternal(view);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokespecial   #75  <Method void hideViewInternal(View)>
		mCallback.addView(view, i);
	//   21   41:aload_0         
	//   22   42:getfield        #24  <Field ChildHelper$Callback mCallback>
	//   23   45:aload_1         
	//   24   46:iload_2         
	//   25   47:invokeinterface #78  <Method void ChildHelper$Callback.addView(View, int)>
	//   26   52:return          
	}

	void addView(View view, boolean flag)
	{
		addView(view, -1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:iload_2         
	//    4    4:invokevirtual   #81  <Method void addView(View, int, boolean)>
	//    5    7:return          
	}

	void attachViewToParent(View view, int i, android.view.ViewGroup.LayoutParams layoutparams, boolean flag)
	{
		if(i < 0)
	//*   0    0:iload_2         
	//*   1    1:ifge            17
			i = mCallback.getChildCount();
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    4    8:invokeinterface #39  <Method int ChildHelper$Callback.getChildCount()>
	//    5   13:istore_2        
		else
	//*   6   14:goto            23
			i = getOffset(i);
	//    7   17:aload_0         
	//    8   18:iload_2         
	//    9   19:invokespecial   #69  <Method int getOffset(int)>
	//   10   22:istore_2        
		mBucket.insert(i, flag);
	//   11   23:aload_0         
	//   12   24:getfield        #27  <Field ChildHelper$Bucket mBucket>
	//   13   27:iload_2         
	//   14   28:iload           4
	//   15   30:invokevirtual   #73  <Method void ChildHelper$Bucket.insert(int, boolean)>
		if(flag)
	//*  16   33:iload           4
	//*  17   35:ifeq            43
			hideViewInternal(view);
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:invokespecial   #75  <Method void hideViewInternal(View)>
		mCallback.attachViewToParent(view, i, layoutparams);
	//   21   43:aload_0         
	//   22   44:getfield        #24  <Field ChildHelper$Callback mCallback>
	//   23   47:aload_1         
	//   24   48:iload_2         
	//   25   49:aload_3         
	//   26   50:invokeinterface #86  <Method void ChildHelper$Callback.attachViewToParent(View, int, android.view.ViewGroup$LayoutParams)>
	//   27   55:return          
	}

	void detachViewFromParent(int i)
	{
		i = getOffset(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #69  <Method int getOffset(int)>
	//    3    5:istore_1        
		mBucket.remove(i);
	//    4    6:aload_0         
	//    5    7:getfield        #27  <Field ChildHelper$Bucket mBucket>
	//    6   10:iload_1         
	//    7   11:invokevirtual   #90  <Method boolean ChildHelper$Bucket.remove(int)>
	//    8   14:pop             
		mCallback.detachViewFromParent(i);
	//    9   15:aload_0         
	//   10   16:getfield        #24  <Field ChildHelper$Callback mCallback>
	//   11   19:iload_1         
	//   12   20:invokeinterface #92  <Method void ChildHelper$Callback.detachViewFromParent(int)>
	//   13   25:return          
	}

	View findHiddenNonRemovedView(int i)
	{
		int k = mHiddenViews.size();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field List mHiddenViews>
	//    2    4:invokeinterface #97  <Method int List.size()>
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
	//   10   18:getfield        #32  <Field List mHiddenViews>
	//   11   21:iload_2         
	//   12   22:invokeinterface #100 <Method Object List.get(int)>
	//   13   27:checkcast       #102 <Class View>
	//   14   30:astore          4
			RecyclerView.ViewHolder viewholder = mCallback.getChildViewHolder(view);
	//   15   32:aload_0         
	//   16   33:getfield        #24  <Field ChildHelper$Callback mCallback>
	//   17   36:aload           4
	//   18   38:invokeinterface #106 <Method RecyclerView$ViewHolder ChildHelper$Callback.getChildViewHolder(View)>
	//   19   43:astore          5
			if(viewholder.getLayoutPosition() == i && !viewholder.isInvalid() && !viewholder.isRemoved())
	//*  20   45:aload           5
	//*  21   47:invokevirtual   #111 <Method int RecyclerView$ViewHolder.getLayoutPosition()>
	//*  22   50:iload_1         
	//*  23   51:icmpne          73
	//*  24   54:aload           5
	//*  25   56:invokevirtual   #115 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//*  26   59:ifne            73
	//*  27   62:aload           5
	//*  28   64:invokevirtual   #118 <Method boolean RecyclerView$ViewHolder.isRemoved()>
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
	//    2    2:invokespecial   #69  <Method int getOffset(int)>
	//    3    5:istore_1        
		return mCallback.getChildAt(i);
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    6   10:iload_1         
	//    7   11:invokeinterface #121 <Method View ChildHelper$Callback.getChildAt(int)>
	//    8   16:areturn         
	}

	int getChildCount()
	{
		return mCallback.getChildCount() - mHiddenViews.size();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    2    4:invokeinterface #39  <Method int ChildHelper$Callback.getChildCount()>
	//    3    9:aload_0         
	//    4   10:getfield        #32  <Field List mHiddenViews>
	//    5   13:invokeinterface #97  <Method int List.size()>
	//    6   18:isub            
	//    7   19:ireturn         
	}

	View getUnfilteredChildAt(int i)
	{
		return mCallback.getChildAt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    2    4:iload_1         
	//    3    5:invokeinterface #121 <Method View ChildHelper$Callback.getChildAt(int)>
	//    4   10:areturn         
	}

	int getUnfilteredChildCount()
	{
		return mCallback.getChildCount();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    2    4:invokeinterface #39  <Method int ChildHelper$Callback.getChildCount()>
	//    3    9:ireturn         
	}

	void hide(View view)
	{
		int i = mCallback.indexOfChild(view);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #128 <Method int ChildHelper$Callback.indexOfChild(View)>
	//    4   10:istore_2        
		if(i >= 0)
	//*   5   11:iload_2         
	//*   6   12:iflt            29
		{
			mBucket.set(i);
	//    7   15:aload_0         
	//    8   16:getfield        #27  <Field ChildHelper$Bucket mBucket>
	//    9   19:iload_2         
	//   10   20:invokevirtual   #131 <Method void ChildHelper$Bucket.set(int)>
			hideViewInternal(view);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokespecial   #75  <Method void hideViewInternal(View)>
			return;
	//   14   28:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   15   29:new             #133 <Class StringBuilder>
	//   16   32:dup             
	//   17   33:invokespecial   #134 <Method void StringBuilder()>
	//   18   36:astore_3        
			stringbuilder.append("view is not a child, cannot hide ");
	//   19   37:aload_3         
	//   20   38:ldc1            #136 <String "view is not a child, cannot hide ">
	//   21   40:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   22   43:pop             
			stringbuilder.append(((Object) (view)));
	//   23   44:aload_3         
	//   24   45:aload_1         
	//   25   46:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
	//   26   49:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   27   50:new             #145 <Class IllegalArgumentException>
	//   28   53:dup             
	//   29   54:aload_3         
	//   30   55:invokevirtual   #149 <Method String StringBuilder.toString()>
	//   31   58:invokespecial   #152 <Method void IllegalArgumentException(String)>
	//   32   61:athrow          
		}
	}

	int indexOfChild(View view)
	{
		int i = mCallback.indexOfChild(view);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #128 <Method int ChildHelper$Callback.indexOfChild(View)>
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
	//*  11   19:getfield        #27  <Field ChildHelper$Bucket mBucket>
	//*  12   22:iload_2         
	//*  13   23:invokevirtual   #46  <Method boolean ChildHelper$Bucket.get(int)>
	//*  14   26:ifeq            31
			return -1;
	//   15   29:iconst_m1       
	//   16   30:ireturn         
		else
			return i - mBucket.countOnesBefore(i);
	//   17   31:iload_2         
	//   18   32:aload_0         
	//   19   33:getfield        #27  <Field ChildHelper$Bucket mBucket>
	//   20   36:iload_2         
	//   21   37:invokevirtual   #42  <Method int ChildHelper$Bucket.countOnesBefore(int)>
	//   22   40:isub            
	//   23   41:ireturn         
	}

	boolean isHidden(View view)
	{
		return mHiddenViews.contains(((Object) (view)));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field List mHiddenViews>
	//    2    4:aload_1         
	//    3    5:invokeinterface #156 <Method boolean List.contains(Object)>
	//    4   10:ireturn         
	}

	void removeAllViewsUnfiltered()
	{
		mBucket.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ChildHelper$Bucket mBucket>
	//    2    4:invokevirtual   #160 <Method void ChildHelper$Bucket.reset()>
		for(int i = mHiddenViews.size() - 1; i >= 0; i--)
	//*   3    7:aload_0         
	//*   4    8:getfield        #32  <Field List mHiddenViews>
	//*   5   11:invokeinterface #97  <Method int List.size()>
	//*   6   16:iconst_1        
	//*   7   17:isub            
	//*   8   18:istore_1        
	//*   9   19:iload_1         
	//*  10   20:iflt            63
		{
			mCallback.onLeftHiddenState((View)mHiddenViews.get(i));
	//   11   23:aload_0         
	//   12   24:getfield        #24  <Field ChildHelper$Callback mCallback>
	//   13   27:aload_0         
	//   14   28:getfield        #32  <Field List mHiddenViews>
	//   15   31:iload_1         
	//   16   32:invokeinterface #100 <Method Object List.get(int)>
	//   17   37:checkcast       #102 <Class View>
	//   18   40:invokeinterface #65  <Method void ChildHelper$Callback.onLeftHiddenState(View)>
			mHiddenViews.remove(i);
	//   19   45:aload_0         
	//   20   46:getfield        #32  <Field List mHiddenViews>
	//   21   49:iload_1         
	//   22   50:invokeinterface #162 <Method Object List.remove(int)>
	//   23   55:pop             
		}

	//   24   56:iload_1         
	//   25   57:iconst_1        
	//   26   58:isub            
	//   27   59:istore_1        
	//*  28   60:goto            19
		mCallback.removeAllViews();
	//   29   63:aload_0         
	//   30   64:getfield        #24  <Field ChildHelper$Callback mCallback>
	//   31   67:invokeinterface #165 <Method void ChildHelper$Callback.removeAllViews()>
	//   32   72:return          
	}

	void removeView(View view)
	{
		int i = mCallback.indexOfChild(view);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #128 <Method int ChildHelper$Callback.indexOfChild(View)>
	//    4   10:istore_2        
		if(i < 0)
	//*   5   11:iload_2         
	//*   6   12:ifge            16
			return;
	//    7   15:return          
		if(mBucket.remove(i))
	//*   8   16:aload_0         
	//*   9   17:getfield        #27  <Field ChildHelper$Bucket mBucket>
	//*  10   20:iload_2         
	//*  11   21:invokevirtual   #90  <Method boolean ChildHelper$Bucket.remove(int)>
	//*  12   24:ifeq            33
			unhideViewInternal(view);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:invokespecial   #168 <Method boolean unhideViewInternal(View)>
	//   16   32:pop             
		mCallback.removeViewAt(i);
	//   17   33:aload_0         
	//   18   34:getfield        #24  <Field ChildHelper$Callback mCallback>
	//   19   37:iload_2         
	//   20   38:invokeinterface #171 <Method void ChildHelper$Callback.removeViewAt(int)>
	//   21   43:return          
	}

	void removeViewAt(int i)
	{
		i = getOffset(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #69  <Method int getOffset(int)>
	//    3    5:istore_1        
		View view = mCallback.getChildAt(i);
	//    4    6:aload_0         
	//    5    7:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    6   10:iload_1         
	//    7   11:invokeinterface #121 <Method View ChildHelper$Callback.getChildAt(int)>
	//    8   16:astore_2        
		if(view == null)
	//*   9   17:aload_2         
	//*  10   18:ifnonnull       22
			return;
	//   11   21:return          
		if(mBucket.remove(i))
	//*  12   22:aload_0         
	//*  13   23:getfield        #27  <Field ChildHelper$Bucket mBucket>
	//*  14   26:iload_1         
	//*  15   27:invokevirtual   #90  <Method boolean ChildHelper$Bucket.remove(int)>
	//*  16   30:ifeq            39
			unhideViewInternal(view);
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:invokespecial   #168 <Method boolean unhideViewInternal(View)>
	//   20   38:pop             
		mCallback.removeViewAt(i);
	//   21   39:aload_0         
	//   22   40:getfield        #24  <Field ChildHelper$Callback mCallback>
	//   23   43:iload_1         
	//   24   44:invokeinterface #171 <Method void ChildHelper$Callback.removeViewAt(int)>
	//   25   49:return          
	}

	boolean removeViewIfHidden(View view)
	{
		int i = mCallback.indexOfChild(view);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #128 <Method int ChildHelper$Callback.indexOfChild(View)>
	//    4   10:istore_2        
		if(i == -1)
	//*   5   11:iload_2         
	//*   6   12:iconst_m1       
	//*   7   13:icmpne          24
		{
			unhideViewInternal(view);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #168 <Method boolean unhideViewInternal(View)>
	//   11   21:pop             
			return true;
	//   12   22:iconst_1        
	//   13   23:ireturn         
		}
		if(mBucket.get(i))
	//*  14   24:aload_0         
	//*  15   25:getfield        #27  <Field ChildHelper$Bucket mBucket>
	//*  16   28:iload_2         
	//*  17   29:invokevirtual   #46  <Method boolean ChildHelper$Bucket.get(int)>
	//*  18   32:ifeq            62
		{
			mBucket.remove(i);
	//   19   35:aload_0         
	//   20   36:getfield        #27  <Field ChildHelper$Bucket mBucket>
	//   21   39:iload_2         
	//   22   40:invokevirtual   #90  <Method boolean ChildHelper$Bucket.remove(int)>
	//   23   43:pop             
			unhideViewInternal(view);
	//   24   44:aload_0         
	//   25   45:aload_1         
	//   26   46:invokespecial   #168 <Method boolean unhideViewInternal(View)>
	//   27   49:pop             
			mCallback.removeViewAt(i);
	//   28   50:aload_0         
	//   29   51:getfield        #24  <Field ChildHelper$Callback mCallback>
	//   30   54:iload_2         
	//   31   55:invokeinterface #171 <Method void ChildHelper$Callback.removeViewAt(int)>
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
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #133 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #134 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(mBucket.toString());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field ChildHelper$Bucket mBucket>
	//    7   13:invokevirtual   #173 <Method String ChildHelper$Bucket.toString()>
	//    8   16:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append(", hidden list:");
	//   10   20:aload_1         
	//   11   21:ldc1            #175 <String ", hidden list:">
	//   12   23:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(mHiddenViews.size());
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:getfield        #32  <Field List mHiddenViews>
	//   17   32:invokeinterface #97  <Method int List.size()>
	//   18   37:invokevirtual   #178 <Method StringBuilder StringBuilder.append(int)>
	//   19   40:pop             
		return stringbuilder.toString();
	//   20   41:aload_1         
	//   21   42:invokevirtual   #149 <Method String StringBuilder.toString()>
	//   22   45:areturn         
	}

	void unhide(View view)
	{
		int i = mCallback.indexOfChild(view);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ChildHelper$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #128 <Method int ChildHelper$Callback.indexOfChild(View)>
	//    4   10:istore_2        
		if(i >= 0)
	//*   5   11:iload_2         
	//*   6   12:iflt            74
		{
			if(mBucket.get(i))
	//*   7   15:aload_0         
	//*   8   16:getfield        #27  <Field ChildHelper$Bucket mBucket>
	//*   9   19:iload_2         
	//*  10   20:invokevirtual   #46  <Method boolean ChildHelper$Bucket.get(int)>
	//*  11   23:ifeq            41
			{
				mBucket.clear(i);
	//   12   26:aload_0         
	//   13   27:getfield        #27  <Field ChildHelper$Bucket mBucket>
	//   14   30:iload_2         
	//   15   31:invokevirtual   #182 <Method void ChildHelper$Bucket.clear(int)>
				unhideViewInternal(view);
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokespecial   #168 <Method boolean unhideViewInternal(View)>
	//   19   39:pop             
				return;
	//   20   40:return          
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   21   41:new             #133 <Class StringBuilder>
	//   22   44:dup             
	//   23   45:invokespecial   #134 <Method void StringBuilder()>
	//   24   48:astore_3        
				stringbuilder.append("trying to unhide a view that was not hidden");
	//   25   49:aload_3         
	//   26   50:ldc1            #184 <String "trying to unhide a view that was not hidden">
	//   27   52:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   28   55:pop             
				stringbuilder.append(((Object) (view)));
	//   29   56:aload_3         
	//   30   57:aload_1         
	//   31   58:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
	//   32   61:pop             
				throw new RuntimeException(stringbuilder.toString());
	//   33   62:new             #186 <Class RuntimeException>
	//   34   65:dup             
	//   35   66:aload_3         
	//   36   67:invokevirtual   #149 <Method String StringBuilder.toString()>
	//   37   70:invokespecial   #187 <Method void RuntimeException(String)>
	//   38   73:athrow          
			}
		} else
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   39   74:new             #133 <Class StringBuilder>
	//   40   77:dup             
	//   41   78:invokespecial   #134 <Method void StringBuilder()>
	//   42   81:astore_3        
			stringbuilder1.append("view is not a child, cannot hide ");
	//   43   82:aload_3         
	//   44   83:ldc1            #136 <String "view is not a child, cannot hide ">
	//   45   85:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   46   88:pop             
			stringbuilder1.append(((Object) (view)));
	//   47   89:aload_3         
	//   48   90:aload_1         
	//   49   91:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
	//   50   94:pop             
			throw new IllegalArgumentException(stringbuilder1.toString());
	//   51   95:new             #145 <Class IllegalArgumentException>
	//   52   98:dup             
	//   53   99:aload_3         
	//   54  100:invokevirtual   #149 <Method String StringBuilder.toString()>
	//   55  103:invokespecial   #152 <Method void IllegalArgumentException(String)>
	//   56  106:athrow          
		}
	}

	final Bucket mBucket = new Bucket();
	final Callback mCallback;
	final List mHiddenViews = new ArrayList();
}
