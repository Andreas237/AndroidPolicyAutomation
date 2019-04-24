// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;

import java.lang.reflect.Array;
import java.util.*;

// Referenced classes of package android.support.v7.util:
//			BatchingListUpdateCallback, ListUpdateCallback

public class SortedList
{
	public static class BatchedCallback extends Callback
	{

		public boolean areContentsTheSame(Object obj, Object obj1)
		{
			return mWrappedCallback.areContentsTheSame(obj, obj1);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field SortedList$Callback mWrappedCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #34  <Method boolean SortedList$Callback.areContentsTheSame(Object, Object)>
		//    5    9:ireturn         
		}

		public boolean areItemsTheSame(Object obj, Object obj1)
		{
			return mWrappedCallback.areItemsTheSame(obj, obj1);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field SortedList$Callback mWrappedCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #38  <Method boolean SortedList$Callback.areItemsTheSame(Object, Object)>
		//    5    9:ireturn         
		}

		public int compare(Object obj, Object obj1)
		{
			return mWrappedCallback.compare(obj, obj1);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field SortedList$Callback mWrappedCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #42  <Method int SortedList$Callback.compare(Object, Object)>
		//    5    9:ireturn         
		}

		public void dispatchLastEvent()
		{
			mBatchingListUpdateCallback.dispatchLastEvent();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field BatchingListUpdateCallback mBatchingListUpdateCallback>
		//    2    4:invokevirtual   #46  <Method void BatchingListUpdateCallback.dispatchLastEvent()>
		//    3    7:return          
		}

		public void onChanged(int i, int j)
		{
			mBatchingListUpdateCallback.onChanged(i, j, ((Object) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field BatchingListUpdateCallback mBatchingListUpdateCallback>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:aconst_null     
		//    5    7:invokevirtual   #51  <Method void BatchingListUpdateCallback.onChanged(int, int, Object)>
		//    6   10:return          
		}

		public void onInserted(int i, int j)
		{
			mBatchingListUpdateCallback.onInserted(i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field BatchingListUpdateCallback mBatchingListUpdateCallback>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:invokevirtual   #54  <Method void BatchingListUpdateCallback.onInserted(int, int)>
		//    5    9:return          
		}

		public void onMoved(int i, int j)
		{
			mBatchingListUpdateCallback.onMoved(i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field BatchingListUpdateCallback mBatchingListUpdateCallback>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:invokevirtual   #57  <Method void BatchingListUpdateCallback.onMoved(int, int)>
		//    5    9:return          
		}

		public void onRemoved(int i, int j)
		{
			mBatchingListUpdateCallback.onRemoved(i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field BatchingListUpdateCallback mBatchingListUpdateCallback>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:invokevirtual   #60  <Method void BatchingListUpdateCallback.onRemoved(int, int)>
		//    5    9:return          
		}

		private final BatchingListUpdateCallback mBatchingListUpdateCallback;
		final Callback mWrappedCallback;

		public BatchedCallback(Callback callback)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void SortedList$Callback()>
			mWrappedCallback = callback;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field SortedList$Callback mWrappedCallback>
			mBatchingListUpdateCallback = new BatchingListUpdateCallback(((ListUpdateCallback) (mWrappedCallback)));
		//    5    9:aload_0         
		//    6   10:new             #22  <Class BatchingListUpdateCallback>
		//    7   13:dup             
		//    8   14:aload_0         
		//    9   15:getfield        #20  <Field SortedList$Callback mWrappedCallback>
		//   10   18:invokespecial   #25  <Method void BatchingListUpdateCallback(ListUpdateCallback)>
		//   11   21:putfield        #27  <Field BatchingListUpdateCallback mBatchingListUpdateCallback>
		//   12   24:return          
		}
	}

	public static abstract class Callback
		implements ListUpdateCallback, Comparator
	{

		public abstract boolean areContentsTheSame(Object obj, Object obj1);

		public abstract boolean areItemsTheSame(Object obj, Object obj1);

		public abstract int compare(Object obj, Object obj1);

		public abstract void onChanged(int i, int j);

		public void onChanged(int i, int j, Object obj)
		{
			onChanged(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokevirtual   #27  <Method void onChanged(int, int)>
		//    4    6:return          
		}

		public Callback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}


	public SortedList(Class class1, Callback callback)
	{
		this(class1, callback, 10);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:bipush          10
	//    4    5:invokespecial   #43  <Method void SortedList(Class, SortedList$Callback, int)>
	//    5    8:return          
	}

	public SortedList(Class class1, Callback callback, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
		mTClass = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #51  <Field Class mTClass>
		mData = (Object[])(Object[])Array.newInstance(class1, i);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:iload_3         
	//    8   12:invokestatic    #57  <Method Object Array.newInstance(Class, int)>
	//    9   15:checkcast       #58  <Class Object[]>
	//   10   18:checkcast       #58  <Class Object[]>
	//   11   21:putfield        #60  <Field Object[] mData>
		mCallback = callback;
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:putfield        #62  <Field SortedList$Callback mCallback>
		mSize = 0;
	//   15   29:aload_0         
	//   16   30:iconst_0        
	//   17   31:putfield        #64  <Field int mSize>
	//   18   34:return          
	}

	private int add(Object obj, boolean flag)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int j = findIndexOf(obj, mData, 0, mSize, 1);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_0         
	//    5    5:getfield        #60  <Field Object[] mData>
	//    6    8:iconst_0        
	//    7    9:aload_0         
	//    8   10:getfield        #64  <Field int mSize>
	//    9   13:iconst_1        
	//   10   14:invokespecial   #71  <Method int findIndexOf(Object, Object[], int, int, int)>
	//   11   17:istore          4
		if(j != -1)
	//*  12   19:iload           4
	//*  13   21:iconst_m1       
	//*  14   22:icmpne          46
	//*  15   25:aload_0         
	//*  16   26:iload_3         
	//*  17   27:aload_1         
	//*  18   28:invokespecial   #75  <Method void addToData(int, Object)>
	//*  19   31:iload_2         
	//*  20   32:ifeq            44
	//*  21   35:aload_0         
	//*  22   36:getfield        #62  <Field SortedList$Callback mCallback>
	//*  23   39:iload_3         
	//*  24   40:iconst_1        
	//*  25   41:invokevirtual   #79  <Method void SortedList$Callback.onInserted(int, int)>
	//*  26   44:iload_3         
	//*  27   45:ireturn         
		{
			if(j < mSize)
	//*  28   46:iload           4
	//*  29   48:aload_0         
	//*  30   49:getfield        #64  <Field int mSize>
	//*  31   52:icmpge          122
			{
				Object obj1 = mData[j];
	//   32   55:aload_0         
	//   33   56:getfield        #60  <Field Object[] mData>
	//   34   59:iload           4
	//   35   61:aaload          
	//   36   62:astore          5
				if(mCallback.areItemsTheSame(obj1, obj))
	//*  37   64:aload_0         
	//*  38   65:getfield        #62  <Field SortedList$Callback mCallback>
	//*  39   68:aload           5
	//*  40   70:aload_1         
	//*  41   71:invokevirtual   #83  <Method boolean SortedList$Callback.areItemsTheSame(Object, Object)>
	//*  42   74:ifeq            122
					if(mCallback.areContentsTheSame(obj1, obj))
	//*  43   77:aload_0         
	//*  44   78:getfield        #62  <Field SortedList$Callback mCallback>
	//*  45   81:aload           5
	//*  46   83:aload_1         
	//*  47   84:invokevirtual   #86  <Method boolean SortedList$Callback.areContentsTheSame(Object, Object)>
	//*  48   87:ifeq            101
					{
						mData[j] = obj;
	//   49   90:aload_0         
	//   50   91:getfield        #60  <Field Object[] mData>
	//   51   94:iload           4
	//   52   96:aload_1         
	//   53   97:aastore         
						return j;
	//   54   98:iload           4
	//   55  100:ireturn         
					} else
					{
						mData[j] = obj;
	//   56  101:aload_0         
	//   57  102:getfield        #60  <Field Object[] mData>
	//   58  105:iload           4
	//   59  107:aload_1         
	//   60  108:aastore         
						mCallback.onChanged(j, 1);
	//   61  109:aload_0         
	//   62  110:getfield        #62  <Field SortedList$Callback mCallback>
	//   63  113:iload           4
	//   64  115:iconst_1        
	//   65  116:invokevirtual   #89  <Method void SortedList$Callback.onChanged(int, int)>
						return j;
	//   66  119:iload           4
	//   67  121:ireturn         
					}
			}
			i = j;
	//   68  122:iload           4
	//   69  124:istore_3        
		}
		addToData(i, obj);
		if(flag)
			mCallback.onInserted(i, 1);
		return i;
	//*  70  125:goto            25
	}

	private void addAllInternal(Object aobj[])
	{
		boolean flag;
		int i;
		if(!(mCallback instanceof BatchedCallback))
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field SortedList$Callback mCallback>
	//*   2    4:instanceof      #7   <Class SortedList$BatchedCallback>
	//*   3    7:ifne            100
			flag = true;
	//    4   10:iconst_1        
	//    5   11:istore_2        
		else
	//*   6   12:iload_2         
	//*   7   13:ifeq            20
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #95  <Method void beginBatchedUpdates()>
	//*  10   20:aload_0         
	//*  11   21:aload_0         
	//*  12   22:getfield        #60  <Field Object[] mData>
	//*  13   25:putfield        #97  <Field Object[] mOldData>
	//*  14   28:aload_0         
	//*  15   29:iconst_0        
	//*  16   30:putfield        #99  <Field int mOldDataStart>
	//*  17   33:aload_0         
	//*  18   34:aload_0         
	//*  19   35:getfield        #64  <Field int mSize>
	//*  20   38:putfield        #101 <Field int mOldDataSize>
	//*  21   41:aload_1         
	//*  22   42:aload_0         
	//*  23   43:getfield        #62  <Field SortedList$Callback mCallback>
	//*  24   46:invokestatic    #107 <Method void Arrays.sort(Object[], Comparator)>
	//*  25   49:aload_0         
	//*  26   50:aload_1         
	//*  27   51:invokespecial   #111 <Method int deduplicate(Object[])>
	//*  28   54:istore_3        
	//*  29   55:aload_0         
	//*  30   56:getfield        #64  <Field int mSize>
	//*  31   59:ifne            105
	//*  32   62:aload_0         
	//*  33   63:aload_1         
	//*  34   64:putfield        #60  <Field Object[] mData>
	//*  35   67:aload_0         
	//*  36   68:iload_3         
	//*  37   69:putfield        #64  <Field int mSize>
	//*  38   72:aload_0         
	//*  39   73:iload_3         
	//*  40   74:putfield        #113 <Field int mMergedSize>
	//*  41   77:aload_0         
	//*  42   78:getfield        #62  <Field SortedList$Callback mCallback>
	//*  43   81:iconst_0        
	//*  44   82:iload_3         
	//*  45   83:invokevirtual   #79  <Method void SortedList$Callback.onInserted(int, int)>
	//*  46   86:aload_0         
	//*  47   87:aconst_null     
	//*  48   88:putfield        #97  <Field Object[] mOldData>
	//*  49   91:iload_2         
	//*  50   92:ifeq            99
	//*  51   95:aload_0         
	//*  52   96:invokevirtual   #116 <Method void endBatchedUpdates()>
	//*  53   99:return          
			flag = false;
	//   54  100:iconst_0        
	//   55  101:istore_2        
		if(flag)
			beginBatchedUpdates();
		mOldData = mData;
		mOldDataStart = 0;
		mOldDataSize = mSize;
		Arrays.sort(aobj, ((Comparator) (mCallback)));
		i = deduplicate(aobj);
		if(mSize == 0)
		{
			mData = aobj;
			mSize = i;
			mMergedSize = i;
			mCallback.onInserted(0, i);
		} else
	//*  56  102:goto            12
		{
			merge(aobj, i);
	//   57  105:aload_0         
	//   58  106:aload_1         
	//   59  107:iload_3         
	//   60  108:invokespecial   #120 <Method void merge(Object[], int)>
		}
		mOldData = null;
		if(flag)
			endBatchedUpdates();
	//*  61  111:goto            86
	}

	private void addToData(int i, Object obj)
	{
		if(i > mSize)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #64  <Field int mSize>
	//*   3    5:icmple          47
			throw new IndexOutOfBoundsException((new StringBuilder()).append("cannot add item to ").append(i).append(" because size is ").append(mSize).toString());
	//    4    8:new             #123 <Class IndexOutOfBoundsException>
	//    5   11:dup             
	//    6   12:new             #125 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #126 <Method void StringBuilder()>
	//    9   19:ldc1            #128 <String "cannot add item to ">
	//   10   21:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:iload_1         
	//   12   25:invokevirtual   #135 <Method StringBuilder StringBuilder.append(int)>
	//   13   28:ldc1            #137 <String " because size is ">
	//   14   30:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:aload_0         
	//   16   34:getfield        #64  <Field int mSize>
	//   17   37:invokevirtual   #135 <Method StringBuilder StringBuilder.append(int)>
	//   18   40:invokevirtual   #141 <Method String StringBuilder.toString()>
	//   19   43:invokespecial   #144 <Method void IndexOutOfBoundsException(String)>
	//   20   46:athrow          
		if(mSize == mData.length)
	//*  21   47:aload_0         
	//*  22   48:getfield        #64  <Field int mSize>
	//*  23   51:aload_0         
	//*  24   52:getfield        #60  <Field Object[] mData>
	//*  25   55:arraylength     
	//*  26   56:icmpne          130
		{
			Object aobj[] = (Object[])(Object[])Array.newInstance(mTClass, mData.length + 10);
	//   27   59:aload_0         
	//   28   60:getfield        #51  <Field Class mTClass>
	//   29   63:aload_0         
	//   30   64:getfield        #60  <Field Object[] mData>
	//   31   67:arraylength     
	//   32   68:bipush          10
	//   33   70:iadd            
	//   34   71:invokestatic    #57  <Method Object Array.newInstance(Class, int)>
	//   35   74:checkcast       #58  <Class Object[]>
	//   36   77:checkcast       #58  <Class Object[]>
	//   37   80:astore_3        
			System.arraycopy(((Object) (mData)), 0, ((Object) (aobj)), 0, i);
	//   38   81:aload_0         
	//   39   82:getfield        #60  <Field Object[] mData>
	//   40   85:iconst_0        
	//   41   86:aload_3         
	//   42   87:iconst_0        
	//   43   88:iload_1         
	//   44   89:invokestatic    #150 <Method void System.arraycopy(Object, int, Object, int, int)>
			aobj[i] = obj;
	//   45   92:aload_3         
	//   46   93:iload_1         
	//   47   94:aload_2         
	//   48   95:aastore         
			System.arraycopy(((Object) (mData)), i, ((Object) (aobj)), i + 1, mSize - i);
	//   49   96:aload_0         
	//   50   97:getfield        #60  <Field Object[] mData>
	//   51  100:iload_1         
	//   52  101:aload_3         
	//   53  102:iload_1         
	//   54  103:iconst_1        
	//   55  104:iadd            
	//   56  105:aload_0         
	//   57  106:getfield        #64  <Field int mSize>
	//   58  109:iload_1         
	//   59  110:isub            
	//   60  111:invokestatic    #150 <Method void System.arraycopy(Object, int, Object, int, int)>
			mData = aobj;
	//   61  114:aload_0         
	//   62  115:aload_3         
	//   63  116:putfield        #60  <Field Object[] mData>
		} else
	//*  64  119:aload_0         
	//*  65  120:aload_0         
	//*  66  121:getfield        #64  <Field int mSize>
	//*  67  124:iconst_1        
	//*  68  125:iadd            
	//*  69  126:putfield        #64  <Field int mSize>
	//*  70  129:return          
		{
			System.arraycopy(((Object) (mData)), i, ((Object) (mData)), i + 1, mSize - i);
	//   71  130:aload_0         
	//   72  131:getfield        #60  <Field Object[] mData>
	//   73  134:iload_1         
	//   74  135:aload_0         
	//   75  136:getfield        #60  <Field Object[] mData>
	//   76  139:iload_1         
	//   77  140:iconst_1        
	//   78  141:iadd            
	//   79  142:aload_0         
	//   80  143:getfield        #64  <Field int mSize>
	//   81  146:iload_1         
	//   82  147:isub            
	//   83  148:invokestatic    #150 <Method void System.arraycopy(Object, int, Object, int, int)>
			mData[i] = obj;
	//   84  151:aload_0         
	//   85  152:getfield        #60  <Field Object[] mData>
	//   86  155:iload_1         
	//   87  156:aload_2         
	//   88  157:aastore         
		}
		mSize = mSize + 1;
	//*  89  158:goto            119
	}

	private int deduplicate(Object aobj[])
	{
		int j = 1;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		if(aobj.length == 0)
	//*   2    2:aload_1         
	//*   3    3:arraylength     
	//*   4    4:ifne            17
			throw new IllegalArgumentException("Input array must be non-empty");
	//    5    7:new             #153 <Class IllegalArgumentException>
	//    6   10:dup             
	//    7   11:ldc1            #155 <String "Input array must be non-empty">
	//    8   13:invokespecial   #156 <Method void IllegalArgumentException(String)>
	//    9   16:athrow          
		int k = 0;
	//   10   17:iconst_0        
	//   11   18:istore          4
		int i = 1;
	//   12   20:iconst_1        
	//   13   21:istore_2        
		while(j < aobj.length) 
	//*  14   22:iload_3         
	//*  15   23:aload_1         
	//*  16   24:arraylength     
	//*  17   25:icmpge          136
		{
			Object obj = aobj[j];
	//   18   28:aload_1         
	//   19   29:iload_3         
	//   20   30:aaload          
	//   21   31:astore          6
			int l = mCallback.compare(aobj[k], obj);
	//   22   33:aload_0         
	//   23   34:getfield        #62  <Field SortedList$Callback mCallback>
	//   24   37:aload_1         
	//   25   38:iload           4
	//   26   40:aaload          
	//   27   41:aload           6
	//   28   43:invokevirtual   #160 <Method int SortedList$Callback.compare(Object, Object)>
	//   29   46:istore          5
			if(l > 0)
	//*  30   48:iload           5
	//*  31   50:ifle            63
				throw new IllegalArgumentException("Input must be sorted in ascending order.");
	//   32   53:new             #153 <Class IllegalArgumentException>
	//   33   56:dup             
	//   34   57:ldc1            #162 <String "Input must be sorted in ascending order.">
	//   35   59:invokespecial   #156 <Method void IllegalArgumentException(String)>
	//   36   62:athrow          
			if(l == 0)
	//*  37   63:iload           5
	//*  38   65:ifne            116
			{
				int i1 = findSameItem(obj, aobj, k, i);
	//   39   68:aload_0         
	//   40   69:aload           6
	//   41   71:aload_1         
	//   42   72:iload           4
	//   43   74:iload_2         
	//   44   75:invokespecial   #166 <Method int findSameItem(Object, Object[], int, int)>
	//   45   78:istore          5
				if(i1 != -1)
	//*  46   80:iload           5
	//*  47   82:iconst_m1       
	//*  48   83:icmpeq          99
				{
					aobj[i1] = obj;
	//   49   86:aload_1         
	//   50   87:iload           5
	//   51   89:aload           6
	//   52   91:aastore         
				} else
	//*  53   92:iload_3         
	//*  54   93:iconst_1        
	//*  55   94:iadd            
	//*  56   95:istore_3        
	//*  57   96:goto            22
				{
					if(i != j)
	//*  58   99:iload_2         
	//*  59  100:iload_3         
	//*  60  101:icmpeq          109
						aobj[i] = obj;
	//   61  104:aload_1         
	//   62  105:iload_2         
	//   63  106:aload           6
	//   64  108:aastore         
					i++;
	//   65  109:iload_2         
	//   66  110:iconst_1        
	//   67  111:iadd            
	//   68  112:istore_2        
				}
			} else
	//*  69  113:goto            92
			{
				if(i != j)
	//*  70  116:iload_2         
	//*  71  117:iload_3         
	//*  72  118:icmpeq          126
					aobj[i] = obj;
	//   73  121:aload_1         
	//   74  122:iload_2         
	//   75  123:aload           6
	//   76  125:aastore         
				k = i;
	//   77  126:iload_2         
	//   78  127:istore          4
				i++;
	//   79  129:iload_2         
	//   80  130:iconst_1        
	//   81  131:iadd            
	//   82  132:istore_2        
			}
			j++;
		}
	//*  83  133:goto            92
		return i;
	//   84  136:iload_2         
	//   85  137:ireturn         
	}

	private int findIndexOf(Object obj, Object aobj[], int i, int j, int k)
	{
		while(i < j) 
	//*   0    0:iload_3         
	//*   1    1:iload           4
	//*   2    3:icmpge          119
		{
			int l = (i + j) / 2;
	//    3    6:iload_3         
	//    4    7:iload           4
	//    5    9:iadd            
	//    6   10:iconst_2        
	//    7   11:idiv            
	//    8   12:istore          6
			Object obj1 = aobj[l];
	//    9   14:aload_2         
	//   10   15:iload           6
	//   11   17:aaload          
	//   12   18:astore          8
			int i1 = mCallback.compare(obj1, obj);
	//   13   20:aload_0         
	//   14   21:getfield        #62  <Field SortedList$Callback mCallback>
	//   15   24:aload           8
	//   16   26:aload_1         
	//   17   27:invokevirtual   #160 <Method int SortedList$Callback.compare(Object, Object)>
	//   18   30:istore          7
			if(i1 < 0)
	//*  19   32:iload           7
	//*  20   34:ifge            63
			{
				l++;
	//   21   37:iload           6
	//   22   39:iconst_1        
	//   23   40:iadd            
	//   24   41:istore          6
				i = j;
	//   25   43:iload           4
	//   26   45:istore_3        
				j = l;
	//   27   46:iload           6
	//   28   48:istore          4
			} else
	//*  29   50:iload           4
	//*  30   52:istore          6
	//*  31   54:iload_3         
	//*  32   55:istore          4
	//*  33   57:iload           6
	//*  34   59:istore_3        
	//*  35   60:goto            0
			{
				if(i1 == 0)
	//*  36   63:iload           7
	//*  37   65:ifne            110
				{
					if(!mCallback.areItemsTheSame(obj1, obj))
	//*  38   68:aload_0         
	//*  39   69:getfield        #62  <Field SortedList$Callback mCallback>
	//*  40   72:aload           8
	//*  41   74:aload_1         
	//*  42   75:invokevirtual   #83  <Method boolean SortedList$Callback.areItemsTheSame(Object, Object)>
	//*  43   78:ifeq            84
	//*  44   81:iload           6
	//*  45   83:ireturn         
					{
						i = linearEqualitySearch(obj, l, i, j);
	//   46   84:aload_0         
	//   47   85:aload_1         
	//   48   86:iload           6
	//   49   88:iload_3         
	//   50   89:iload           4
	//   51   91:invokespecial   #171 <Method int linearEqualitySearch(Object, int, int, int)>
	//   52   94:istore_3        
						if(k == 1)
	//*  53   95:iload           5
	//*  54   97:iconst_1        
	//*  55   98:icmpne          108
						{
							if(i != -1)
	//*  56  101:iload_3         
	//*  57  102:iconst_m1       
	//*  58  103:icmpeq          81
								return i;
	//   59  106:iload_3         
	//   60  107:ireturn         
						} else
						{
							return i;
	//   61  108:iload_3         
	//   62  109:ireturn         
						}
					}
					return l;
				}
				j = i;
	//   63  110:iload_3         
	//   64  111:istore          4
				i = l;
	//   65  113:iload           6
	//   66  115:istore_3        
			}
			l = j;
			j = i;
			i = l;
		}
	//*  67  116:goto            50
		if(k != 1)
	//*  68  119:iload           5
	//*  69  121:iconst_1        
	//*  70  122:icmpne          127
	//*  71  125:iload_3         
	//*  72  126:ireturn         
			i = -1;
	//   73  127:iconst_m1       
	//   74  128:istore_3        
		return i;
	//*  75  129:goto            125
	}

	private int findSameItem(Object obj, Object aobj[], int i, int j)
	{
		for(; i < j; i++)
	//*   0    0:iload_3         
	//*   1    1:iload           4
	//*   2    3:icmpge          29
			if(mCallback.areItemsTheSame(aobj[i], obj))
	//*   3    6:aload_0         
	//*   4    7:getfield        #62  <Field SortedList$Callback mCallback>
	//*   5   10:aload_2         
	//*   6   11:iload_3         
	//*   7   12:aaload          
	//*   8   13:aload_1         
	//*   9   14:invokevirtual   #83  <Method boolean SortedList$Callback.areItemsTheSame(Object, Object)>
	//*  10   17:ifeq            22
				return i;
	//   11   20:iload_3         
	//   12   21:ireturn         

	//   13   22:iload_3         
	//   14   23:iconst_1        
	//   15   24:iadd            
	//   16   25:istore_3        
	//*  17   26:goto            0
		return -1;
	//   18   29:iconst_m1       
	//   19   30:ireturn         
	}

	private int linearEqualitySearch(Object obj, int i, int j, int k)
	{
		int i1 = i - 1;
	//    0    0:iload_2         
	//    1    1:iconst_1        
	//    2    2:isub            
	//    3    3:istore          6
_L9:
		if(i1 < j) goto _L2; else goto _L1
	//    4    5:iload           6
	//    5    7:iload_3         
	//    6    8:icmplt          33
_L1:
		Object obj1 = mData[i1];
	//    7   11:aload_0         
	//    8   12:getfield        #60  <Field Object[] mData>
	//    9   15:iload           6
	//   10   17:aaload          
	//   11   18:astore          7
		if(mCallback.compare(obj1, obj) == 0) goto _L3; else goto _L2
	//   12   20:aload_0         
	//   13   21:getfield        #62  <Field SortedList$Callback mCallback>
	//   14   24:aload           7
	//   15   26:aload_1         
	//   16   27:invokevirtual   #160 <Method int SortedList$Callback.compare(Object, Object)>
	//   17   30:ifeq            70
_L2:
		i++;
	//   18   33:iload_2         
	//   19   34:iconst_1        
	//   20   35:iadd            
	//   21   36:istore_2        
_L11:
		if(i >= k) goto _L5; else goto _L4
	//   22   37:iload_2         
	//   23   38:iload           4
	//   24   40:icmpge          64
_L4:
		obj1 = mData[i];
	//   25   43:aload_0         
	//   26   44:getfield        #60  <Field Object[] mData>
	//   27   47:iload_2         
	//   28   48:aaload          
	//   29   49:astore          7
		if(mCallback.compare(obj1, obj) == 0) goto _L6; else goto _L5
	//   30   51:aload_0         
	//   31   52:getfield        #62  <Field SortedList$Callback mCallback>
	//   32   55:aload           7
	//   33   57:aload_1         
	//   34   58:invokevirtual   #160 <Method int SortedList$Callback.compare(Object, Object)>
	//   35   61:ifeq            96
_L5:
		int l = -1;
	//   36   64:iconst_m1       
	//   37   65:istore          5
_L8:
		return l;
	//   38   67:iload           5
	//   39   69:ireturn         
_L3:
		l = i1;
	//   40   70:iload           6
	//   41   72:istore          5
		if(mCallback.areItemsTheSame(obj1, obj)) goto _L8; else goto _L7
	//   42   74:aload_0         
	//   43   75:getfield        #62  <Field SortedList$Callback mCallback>
	//   44   78:aload           7
	//   45   80:aload_1         
	//   46   81:invokevirtual   #83  <Method boolean SortedList$Callback.areItemsTheSame(Object, Object)>
	//   47   84:ifne            67
_L7:
		i1--;
	//   48   87:iload           6
	//   49   89:iconst_1        
	//   50   90:isub            
	//   51   91:istore          6
		  goto _L9
	//*  52   93:goto            5
_L6:
		l = i;
	//   53   96:iload_2         
	//   54   97:istore          5
		if(mCallback.areItemsTheSame(obj1, obj)) goto _L8; else goto _L10
	//   55   99:aload_0         
	//   56  100:getfield        #62  <Field SortedList$Callback mCallback>
	//   57  103:aload           7
	//   58  105:aload_1         
	//   59  106:invokevirtual   #83  <Method boolean SortedList$Callback.areItemsTheSame(Object, Object)>
	//   60  109:ifne            67
_L10:
		i++;
	//   61  112:iload_2         
	//   62  113:iconst_1        
	//   63  114:iadd            
	//   64  115:istore_2        
		  goto _L11
	//*  65  116:goto            37
	}

	private void merge(Object aobj[], int i)
	{
		int j = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int mSize>
	//    2    4:istore_3        
		mData = (Object[])(Object[])Array.newInstance(mTClass, j + i + 10);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #51  <Field Class mTClass>
	//    6   10:iload_3         
	//    7   11:iload_2         
	//    8   12:iadd            
	//    9   13:bipush          10
	//   10   15:iadd            
	//   11   16:invokestatic    #57  <Method Object Array.newInstance(Class, int)>
	//   12   19:checkcast       #58  <Class Object[]>
	//   13   22:checkcast       #58  <Class Object[]>
	//   14   25:putfield        #60  <Field Object[] mData>
		mMergedSize = 0;
	//   15   28:aload_0         
	//   16   29:iconst_0        
	//   17   30:putfield        #113 <Field int mMergedSize>
		j = 0;
	//   18   33:iconst_0        
	//   19   34:istore_3        
		do
		{
label0:
			{
				if(mOldDataStart < mOldDataSize || j < i)
	//*  20   35:aload_0         
	//*  21   36:getfield        #99  <Field int mOldDataStart>
	//*  22   39:aload_0         
	//*  23   40:getfield        #101 <Field int mOldDataSize>
	//*  24   43:icmplt          51
	//*  25   46:iload_3         
	//*  26   47:iload_2         
	//*  27   48:icmpge          114
				{
					if(mOldDataStart != mOldDataSize)
						break label0;
	//   28   51:aload_0         
	//   29   52:getfield        #99  <Field int mOldDataStart>
	//   30   55:aload_0         
	//   31   56:getfield        #101 <Field int mOldDataSize>
	//   32   59:icmpne          115
					i -= j;
	//   33   62:iload_2         
	//   34   63:iload_3         
	//   35   64:isub            
	//   36   65:istore_2        
					System.arraycopy(((Object) (aobj)), j, ((Object) (mData)), mMergedSize, i);
	//   37   66:aload_1         
	//   38   67:iload_3         
	//   39   68:aload_0         
	//   40   69:getfield        #60  <Field Object[] mData>
	//   41   72:aload_0         
	//   42   73:getfield        #113 <Field int mMergedSize>
	//   43   76:iload_2         
	//   44   77:invokestatic    #150 <Method void System.arraycopy(Object, int, Object, int, int)>
					mMergedSize = mMergedSize + i;
	//   45   80:aload_0         
	//   46   81:aload_0         
	//   47   82:getfield        #113 <Field int mMergedSize>
	//   48   85:iload_2         
	//   49   86:iadd            
	//   50   87:putfield        #113 <Field int mMergedSize>
					mSize = mSize + i;
	//   51   90:aload_0         
	//   52   91:aload_0         
	//   53   92:getfield        #64  <Field int mSize>
	//   54   95:iload_2         
	//   55   96:iadd            
	//   56   97:putfield        #64  <Field int mSize>
					mCallback.onInserted(mMergedSize - i, i);
	//   57  100:aload_0         
	//   58  101:getfield        #62  <Field SortedList$Callback mCallback>
	//   59  104:aload_0         
	//   60  105:getfield        #113 <Field int mMergedSize>
	//   61  108:iload_2         
	//   62  109:isub            
	//   63  110:iload_2         
	//   64  111:invokevirtual   #79  <Method void SortedList$Callback.onInserted(int, int)>
				}
				return;
	//   65  114:return          
			}
			if(j == i)
	//*  66  115:iload_3         
	//*  67  116:iload_2         
	//*  68  117:icmpne          161
			{
				i = mOldDataSize - mOldDataStart;
	//   69  120:aload_0         
	//   70  121:getfield        #101 <Field int mOldDataSize>
	//   71  124:aload_0         
	//   72  125:getfield        #99  <Field int mOldDataStart>
	//   73  128:isub            
	//   74  129:istore_2        
				System.arraycopy(((Object) (mOldData)), mOldDataStart, ((Object) (mData)), mMergedSize, i);
	//   75  130:aload_0         
	//   76  131:getfield        #97  <Field Object[] mOldData>
	//   77  134:aload_0         
	//   78  135:getfield        #99  <Field int mOldDataStart>
	//   79  138:aload_0         
	//   80  139:getfield        #60  <Field Object[] mData>
	//   81  142:aload_0         
	//   82  143:getfield        #113 <Field int mMergedSize>
	//   83  146:iload_2         
	//   84  147:invokestatic    #150 <Method void System.arraycopy(Object, int, Object, int, int)>
				mMergedSize = i + mMergedSize;
	//   85  150:aload_0         
	//   86  151:iload_2         
	//   87  152:aload_0         
	//   88  153:getfield        #113 <Field int mMergedSize>
	//   89  156:iadd            
	//   90  157:putfield        #113 <Field int mMergedSize>
				return;
	//   91  160:return          
			}
			Object obj = mOldData[mOldDataStart];
	//   92  161:aload_0         
	//   93  162:getfield        #97  <Field Object[] mOldData>
	//   94  165:aload_0         
	//   95  166:getfield        #99  <Field int mOldDataStart>
	//   96  169:aaload          
	//   97  170:astore          5
			Object obj1 = aobj[j];
	//   98  172:aload_1         
	//   99  173:iload_3         
	//  100  174:aaload          
	//  101  175:astore          6
			int k = mCallback.compare(obj, obj1);
	//  102  177:aload_0         
	//  103  178:getfield        #62  <Field SortedList$Callback mCallback>
	//  104  181:aload           5
	//  105  183:aload           6
	//  106  185:invokevirtual   #160 <Method int SortedList$Callback.compare(Object, Object)>
	//  107  188:istore          4
			if(k > 0)
	//* 108  190:iload           4
	//* 109  192:ifle            253
			{
				obj = ((Object) (mData));
	//  110  195:aload_0         
	//  111  196:getfield        #60  <Field Object[] mData>
	//  112  199:astore          5
				k = mMergedSize;
	//  113  201:aload_0         
	//  114  202:getfield        #113 <Field int mMergedSize>
	//  115  205:istore          4
				mMergedSize = k + 1;
	//  116  207:aload_0         
	//  117  208:iload           4
	//  118  210:iconst_1        
	//  119  211:iadd            
	//  120  212:putfield        #113 <Field int mMergedSize>
				obj[k] = ((/*<invalid signature>*/java.lang.Object) (obj1));
	//  121  215:aload           5
	//  122  217:iload           4
	//  123  219:aload           6
	//  124  221:aastore         
				mSize = mSize + 1;
	//  125  222:aload_0         
	//  126  223:aload_0         
	//  127  224:getfield        #64  <Field int mSize>
	//  128  227:iconst_1        
	//  129  228:iadd            
	//  130  229:putfield        #64  <Field int mSize>
				j++;
	//  131  232:iload_3         
	//  132  233:iconst_1        
	//  133  234:iadd            
	//  134  235:istore_3        
				mCallback.onInserted(mMergedSize - 1, 1);
	//  135  236:aload_0         
	//  136  237:getfield        #62  <Field SortedList$Callback mCallback>
	//  137  240:aload_0         
	//  138  241:getfield        #113 <Field int mMergedSize>
	//  139  244:iconst_1        
	//  140  245:isub            
	//  141  246:iconst_1        
	//  142  247:invokevirtual   #79  <Method void SortedList$Callback.onInserted(int, int)>
			} else
	//* 143  250:goto            35
			if(k == 0 && mCallback.areItemsTheSame(obj, obj1))
	//* 144  253:iload           4
	//* 145  255:ifne            351
	//* 146  258:aload_0         
	//* 147  259:getfield        #62  <Field SortedList$Callback mCallback>
	//* 148  262:aload           5
	//* 149  264:aload           6
	//* 150  266:invokevirtual   #83  <Method boolean SortedList$Callback.areItemsTheSame(Object, Object)>
	//* 151  269:ifeq            351
			{
				Object aobj2[] = mData;
	//  152  272:aload_0         
	//  153  273:getfield        #60  <Field Object[] mData>
	//  154  276:astore          7
				int l = mMergedSize;
	//  155  278:aload_0         
	//  156  279:getfield        #113 <Field int mMergedSize>
	//  157  282:istore          4
				mMergedSize = l + 1;
	//  158  284:aload_0         
	//  159  285:iload           4
	//  160  287:iconst_1        
	//  161  288:iadd            
	//  162  289:putfield        #113 <Field int mMergedSize>
				aobj2[l] = obj1;
	//  163  292:aload           7
	//  164  294:iload           4
	//  165  296:aload           6
	//  166  298:aastore         
				l = j + 1;
	//  167  299:iload_3         
	//  168  300:iconst_1        
	//  169  301:iadd            
	//  170  302:istore          4
				mOldDataStart = mOldDataStart + 1;
	//  171  304:aload_0         
	//  172  305:aload_0         
	//  173  306:getfield        #99  <Field int mOldDataStart>
	//  174  309:iconst_1        
	//  175  310:iadd            
	//  176  311:putfield        #99  <Field int mOldDataStart>
				j = l;
	//  177  314:iload           4
	//  178  316:istore_3        
				if(!mCallback.areContentsTheSame(obj, obj1))
	//* 179  317:aload_0         
	//* 180  318:getfield        #62  <Field SortedList$Callback mCallback>
	//* 181  321:aload           5
	//* 182  323:aload           6
	//* 183  325:invokevirtual   #86  <Method boolean SortedList$Callback.areContentsTheSame(Object, Object)>
	//* 184  328:ifne            35
				{
					mCallback.onChanged(mMergedSize - 1, 1);
	//  185  331:aload_0         
	//  186  332:getfield        #62  <Field SortedList$Callback mCallback>
	//  187  335:aload_0         
	//  188  336:getfield        #113 <Field int mMergedSize>
	//  189  339:iconst_1        
	//  190  340:isub            
	//  191  341:iconst_1        
	//  192  342:invokevirtual   #89  <Method void SortedList$Callback.onChanged(int, int)>
					j = l;
	//  193  345:iload           4
	//  194  347:istore_3        
				}
			} else
	//* 195  348:goto            35
			{
				Object aobj1[] = mData;
	//  196  351:aload_0         
	//  197  352:getfield        #60  <Field Object[] mData>
	//  198  355:astore          6
				int i1 = mMergedSize;
	//  199  357:aload_0         
	//  200  358:getfield        #113 <Field int mMergedSize>
	//  201  361:istore          4
				mMergedSize = i1 + 1;
	//  202  363:aload_0         
	//  203  364:iload           4
	//  204  366:iconst_1        
	//  205  367:iadd            
	//  206  368:putfield        #113 <Field int mMergedSize>
				aobj1[i1] = obj;
	//  207  371:aload           6
	//  208  373:iload           4
	//  209  375:aload           5
	//  210  377:aastore         
				mOldDataStart = mOldDataStart + 1;
	//  211  378:aload_0         
	//  212  379:aload_0         
	//  213  380:getfield        #99  <Field int mOldDataStart>
	//  214  383:iconst_1        
	//  215  384:iadd            
	//  216  385:putfield        #99  <Field int mOldDataStart>
			}
		} while(true);
	//  217  388:goto            35
	}

	private boolean remove(Object obj, boolean flag)
	{
		int i = findIndexOf(obj, mData, 0, mSize, 2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #60  <Field Object[] mData>
	//    4    6:iconst_0        
	//    5    7:aload_0         
	//    6    8:getfield        #64  <Field int mSize>
	//    7   11:iconst_2        
	//    8   12:invokespecial   #71  <Method int findIndexOf(Object, Object[], int, int, int)>
	//    9   15:istore_3        
		if(i == -1)
	//*  10   16:iload_3         
	//*  11   17:iconst_m1       
	//*  12   18:icmpne          23
		{
			return false;
	//   13   21:iconst_0        
	//   14   22:ireturn         
		} else
		{
			removeItemAtIndex(i, flag);
	//   15   23:aload_0         
	//   16   24:iload_3         
	//   17   25:iload_2         
	//   18   26:invokespecial   #181 <Method void removeItemAtIndex(int, boolean)>
			return true;
	//   19   29:iconst_1        
	//   20   30:ireturn         
		}
	}

	private void removeItemAtIndex(int i, boolean flag)
	{
		System.arraycopy(((Object) (mData)), i + 1, ((Object) (mData)), i, mSize - i - 1);
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Object[] mData>
	//    2    4:iload_1         
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:aload_0         
	//    6    8:getfield        #60  <Field Object[] mData>
	//    7   11:iload_1         
	//    8   12:aload_0         
	//    9   13:getfield        #64  <Field int mSize>
	//   10   16:iload_1         
	//   11   17:isub            
	//   12   18:iconst_1        
	//   13   19:isub            
	//   14   20:invokestatic    #150 <Method void System.arraycopy(Object, int, Object, int, int)>
		mSize = mSize - 1;
	//   15   23:aload_0         
	//   16   24:aload_0         
	//   17   25:getfield        #64  <Field int mSize>
	//   18   28:iconst_1        
	//   19   29:isub            
	//   20   30:putfield        #64  <Field int mSize>
		mData[mSize] = null;
	//   21   33:aload_0         
	//   22   34:getfield        #60  <Field Object[] mData>
	//   23   37:aload_0         
	//   24   38:getfield        #64  <Field int mSize>
	//   25   41:aconst_null     
	//   26   42:aastore         
		if(flag)
	//*  27   43:iload_2         
	//*  28   44:ifeq            56
			mCallback.onRemoved(i, 1);
	//   29   47:aload_0         
	//   30   48:getfield        #62  <Field SortedList$Callback mCallback>
	//   31   51:iload_1         
	//   32   52:iconst_1        
	//   33   53:invokevirtual   #185 <Method void SortedList$Callback.onRemoved(int, int)>
	//   34   56:return          
	}

	private void throwIfMerging()
	{
		if(mOldData != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field Object[] mOldData>
	//*   2    4:ifnull          17
			throw new IllegalStateException("Cannot call this method from within addAll");
	//    3    7:new             #188 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #190 <String "Cannot call this method from within addAll">
	//    6   13:invokespecial   #191 <Method void IllegalStateException(String)>
	//    7   16:athrow          
		else
			return;
	//    8   17:return          
	}

	public int add(Object obj)
	{
		throwIfMerging();
	//    0    0:aload_0         
	//    1    1:invokespecial   #194 <Method void throwIfMerging()>
		return add(obj, true);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:invokespecial   #196 <Method int add(Object, boolean)>
	//    6   10:ireturn         
	}

	public void addAll(Collection collection)
	{
		addAll(collection.toArray((Object[])(Object[])Array.newInstance(mTClass, collection.size())), true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #51  <Field Class mTClass>
	//    4    6:aload_1         
	//    5    7:invokeinterface #205 <Method int Collection.size()>
	//    6   12:invokestatic    #57  <Method Object Array.newInstance(Class, int)>
	//    7   15:checkcast       #58  <Class Object[]>
	//    8   18:checkcast       #58  <Class Object[]>
	//    9   21:invokeinterface #209 <Method Object[] Collection.toArray(Object[])>
	//   10   26:iconst_1        
	//   11   27:invokevirtual   #212 <Method void addAll(Object[], boolean)>
	//   12   30:return          
	}

	public transient void addAll(Object aobj[])
	{
		addAll(aobj, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #212 <Method void addAll(Object[], boolean)>
	//    4    6:return          
	}

	public void addAll(Object aobj[], boolean flag)
	{
		throwIfMerging();
	//    0    0:aload_0         
	//    1    1:invokespecial   #194 <Method void throwIfMerging()>
		if(aobj.length == 0)
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:ifne            10
			return;
	//    5    9:return          
		if(flag)
	//*   6   10:iload_2         
	//*   7   11:ifeq            20
		{
			addAllInternal(aobj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #215 <Method void addAllInternal(Object[])>
			return;
	//   11   19:return          
		} else
		{
			Object aobj1[] = (Object[])(Object[])Array.newInstance(mTClass, aobj.length);
	//   12   20:aload_0         
	//   13   21:getfield        #51  <Field Class mTClass>
	//   14   24:aload_1         
	//   15   25:arraylength     
	//   16   26:invokestatic    #57  <Method Object Array.newInstance(Class, int)>
	//   17   29:checkcast       #58  <Class Object[]>
	//   18   32:checkcast       #58  <Class Object[]>
	//   19   35:astore_3        
			System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, aobj.length);
	//   20   36:aload_1         
	//   21   37:iconst_0        
	//   22   38:aload_3         
	//   23   39:iconst_0        
	//   24   40:aload_1         
	//   25   41:arraylength     
	//   26   42:invokestatic    #150 <Method void System.arraycopy(Object, int, Object, int, int)>
			addAllInternal(aobj1);
	//   27   45:aload_0         
	//   28   46:aload_3         
	//   29   47:invokespecial   #215 <Method void addAllInternal(Object[])>
			return;
	//   30   50:return          
		}
	}

	public void beginBatchedUpdates()
	{
		throwIfMerging();
	//    0    0:aload_0         
	//    1    1:invokespecial   #194 <Method void throwIfMerging()>
		if(mCallback instanceof BatchedCallback)
	//*   2    4:aload_0         
	//*   3    5:getfield        #62  <Field SortedList$Callback mCallback>
	//*   4    8:instanceof      #7   <Class SortedList$BatchedCallback>
	//*   5   11:ifeq            15
			return;
	//    6   14:return          
		if(mBatchedCallback == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #218 <Field SortedList$BatchedCallback mBatchedCallback>
	//*   9   19:ifnonnull       37
			mBatchedCallback = new BatchedCallback(mCallback);
	//   10   22:aload_0         
	//   11   23:new             #7   <Class SortedList$BatchedCallback>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:getfield        #62  <Field SortedList$Callback mCallback>
	//   15   31:invokespecial   #221 <Method void SortedList$BatchedCallback(SortedList$Callback)>
	//   16   34:putfield        #218 <Field SortedList$BatchedCallback mBatchedCallback>
		mCallback = ((Callback) (mBatchedCallback));
	//   17   37:aload_0         
	//   18   38:aload_0         
	//   19   39:getfield        #218 <Field SortedList$BatchedCallback mBatchedCallback>
	//   20   42:putfield        #62  <Field SortedList$Callback mCallback>
	//   21   45:return          
	}

	public void clear()
	{
		throwIfMerging();
	//    0    0:aload_0         
	//    1    1:invokespecial   #194 <Method void throwIfMerging()>
		if(mSize == 0)
	//*   2    4:aload_0         
	//*   3    5:getfield        #64  <Field int mSize>
	//*   4    8:ifne            12
		{
			return;
	//    5   11:return          
		} else
		{
			int i = mSize;
	//    6   12:aload_0         
	//    7   13:getfield        #64  <Field int mSize>
	//    8   16:istore_1        
			Arrays.fill(mData, 0, i, ((Object) (null)));
	//    9   17:aload_0         
	//   10   18:getfield        #60  <Field Object[] mData>
	//   11   21:iconst_0        
	//   12   22:iload_1         
	//   13   23:aconst_null     
	//   14   24:invokestatic    #226 <Method void Arrays.fill(Object[], int, int, Object)>
			mSize = 0;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #64  <Field int mSize>
			mCallback.onRemoved(0, i);
	//   18   32:aload_0         
	//   19   33:getfield        #62  <Field SortedList$Callback mCallback>
	//   20   36:iconst_0        
	//   21   37:iload_1         
	//   22   38:invokevirtual   #185 <Method void SortedList$Callback.onRemoved(int, int)>
			return;
	//   23   41:return          
		}
	}

	public void endBatchedUpdates()
	{
		throwIfMerging();
	//    0    0:aload_0         
	//    1    1:invokespecial   #194 <Method void throwIfMerging()>
		if(mCallback instanceof BatchedCallback)
	//*   2    4:aload_0         
	//*   3    5:getfield        #62  <Field SortedList$Callback mCallback>
	//*   4    8:instanceof      #7   <Class SortedList$BatchedCallback>
	//*   5   11:ifeq            24
			((BatchedCallback)mCallback).dispatchLastEvent();
	//    6   14:aload_0         
	//    7   15:getfield        #62  <Field SortedList$Callback mCallback>
	//    8   18:checkcast       #7   <Class SortedList$BatchedCallback>
	//    9   21:invokevirtual   #229 <Method void SortedList$BatchedCallback.dispatchLastEvent()>
		if(mCallback == mBatchedCallback)
	//*  10   24:aload_0         
	//*  11   25:getfield        #62  <Field SortedList$Callback mCallback>
	//*  12   28:aload_0         
	//*  13   29:getfield        #218 <Field SortedList$BatchedCallback mBatchedCallback>
	//*  14   32:if_acmpne       46
			mCallback = mBatchedCallback.mWrappedCallback;
	//   15   35:aload_0         
	//   16   36:aload_0         
	//   17   37:getfield        #218 <Field SortedList$BatchedCallback mBatchedCallback>
	//   18   40:getfield        #232 <Field SortedList$Callback SortedList$BatchedCallback.mWrappedCallback>
	//   19   43:putfield        #62  <Field SortedList$Callback mCallback>
	//   20   46:return          
	}

	public Object get(int i)
		throws IndexOutOfBoundsException
	{
		if(i >= mSize || i < 0)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #64  <Field int mSize>
	//*   3    5:icmpge          12
	//*   4    8:iload_1         
	//*   5    9:ifge            51
			throw new IndexOutOfBoundsException((new StringBuilder()).append("Asked to get item at ").append(i).append(" but size is ").append(mSize).toString());
	//    6   12:new             #123 <Class IndexOutOfBoundsException>
	//    7   15:dup             
	//    8   16:new             #125 <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #126 <Method void StringBuilder()>
	//   11   23:ldc1            #236 <String "Asked to get item at ">
	//   12   25:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   13   28:iload_1         
	//   14   29:invokevirtual   #135 <Method StringBuilder StringBuilder.append(int)>
	//   15   32:ldc1            #238 <String " but size is ">
	//   16   34:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:aload_0         
	//   18   38:getfield        #64  <Field int mSize>
	//   19   41:invokevirtual   #135 <Method StringBuilder StringBuilder.append(int)>
	//   20   44:invokevirtual   #141 <Method String StringBuilder.toString()>
	//   21   47:invokespecial   #144 <Method void IndexOutOfBoundsException(String)>
	//   22   50:athrow          
		if(mOldData != null && i >= mMergedSize)
	//*  23   51:aload_0         
	//*  24   52:getfield        #97  <Field Object[] mOldData>
	//*  25   55:ifnull          83
	//*  26   58:iload_1         
	//*  27   59:aload_0         
	//*  28   60:getfield        #113 <Field int mMergedSize>
	//*  29   63:icmplt          83
			return mOldData[(i - mMergedSize) + mOldDataStart];
	//   30   66:aload_0         
	//   31   67:getfield        #97  <Field Object[] mOldData>
	//   32   70:iload_1         
	//   33   71:aload_0         
	//   34   72:getfield        #113 <Field int mMergedSize>
	//   35   75:isub            
	//   36   76:aload_0         
	//   37   77:getfield        #99  <Field int mOldDataStart>
	//   38   80:iadd            
	//   39   81:aaload          
	//   40   82:areturn         
		else
			return mData[i];
	//   41   83:aload_0         
	//   42   84:getfield        #60  <Field Object[] mData>
	//   43   87:iload_1         
	//   44   88:aaload          
	//   45   89:areturn         
	}

	public int indexOf(Object obj)
	{
		if(mOldData != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field Object[] mOldData>
	//*   2    4:ifnull          68
		{
			int i = findIndexOf(obj, mData, 0, mMergedSize, 4);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #60  <Field Object[] mData>
	//    7   13:iconst_0        
	//    8   14:aload_0         
	//    9   15:getfield        #113 <Field int mMergedSize>
	//   10   18:iconst_4        
	//   11   19:invokespecial   #71  <Method int findIndexOf(Object, Object[], int, int, int)>
	//   12   22:istore_2        
			if(i != -1)
	//*  13   23:iload_2         
	//*  14   24:iconst_m1       
	//*  15   25:icmpeq          30
				return i;
	//   16   28:iload_2         
	//   17   29:ireturn         
			i = findIndexOf(obj, mOldData, mOldDataStart, mOldDataSize, 4);
	//   18   30:aload_0         
	//   19   31:aload_1         
	//   20   32:aload_0         
	//   21   33:getfield        #97  <Field Object[] mOldData>
	//   22   36:aload_0         
	//   23   37:getfield        #99  <Field int mOldDataStart>
	//   24   40:aload_0         
	//   25   41:getfield        #101 <Field int mOldDataSize>
	//   26   44:iconst_4        
	//   27   45:invokespecial   #71  <Method int findIndexOf(Object, Object[], int, int, int)>
	//   28   48:istore_2        
			if(i != -1)
	//*  29   49:iload_2         
	//*  30   50:iconst_m1       
	//*  31   51:icmpeq          66
				return (i - mOldDataStart) + mMergedSize;
	//   32   54:iload_2         
	//   33   55:aload_0         
	//   34   56:getfield        #99  <Field int mOldDataStart>
	//   35   59:isub            
	//   36   60:aload_0         
	//   37   61:getfield        #113 <Field int mMergedSize>
	//   38   64:iadd            
	//   39   65:ireturn         
			else
				return -1;
	//   40   66:iconst_m1       
	//   41   67:ireturn         
		} else
		{
			return findIndexOf(obj, mData, 0, mSize, 4);
	//   42   68:aload_0         
	//   43   69:aload_1         
	//   44   70:aload_0         
	//   45   71:getfield        #60  <Field Object[] mData>
	//   46   74:iconst_0        
	//   47   75:aload_0         
	//   48   76:getfield        #64  <Field int mSize>
	//   49   79:iconst_4        
	//   50   80:invokespecial   #71  <Method int findIndexOf(Object, Object[], int, int, int)>
	//   51   83:ireturn         
		}
	}

	public void recalculatePositionOfItemAt(int i)
	{
		throwIfMerging();
	//    0    0:aload_0         
	//    1    1:invokespecial   #194 <Method void throwIfMerging()>
		Object obj = get(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #245 <Method Object get(int)>
	//    5    9:astore_3        
		removeItemAtIndex(i, false);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:iconst_0        
	//    9   13:invokespecial   #181 <Method void removeItemAtIndex(int, boolean)>
		int j = add(obj, false);
	//   10   16:aload_0         
	//   11   17:aload_3         
	//   12   18:iconst_0        
	//   13   19:invokespecial   #196 <Method int add(Object, boolean)>
	//   14   22:istore_2        
		if(i != j)
	//*  15   23:iload_1         
	//*  16   24:iload_2         
	//*  17   25:icmpeq          37
			mCallback.onMoved(i, j);
	//   18   28:aload_0         
	//   19   29:getfield        #62  <Field SortedList$Callback mCallback>
	//   20   32:iload_1         
	//   21   33:iload_2         
	//   22   34:invokevirtual   #248 <Method void SortedList$Callback.onMoved(int, int)>
	//   23   37:return          
	}

	public boolean remove(Object obj)
	{
		throwIfMerging();
	//    0    0:aload_0         
	//    1    1:invokespecial   #194 <Method void throwIfMerging()>
		return remove(obj, true);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:invokespecial   #251 <Method boolean remove(Object, boolean)>
	//    6   10:ireturn         
	}

	public Object removeItemAt(int i)
	{
		throwIfMerging();
	//    0    0:aload_0         
	//    1    1:invokespecial   #194 <Method void throwIfMerging()>
		Object obj = get(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #245 <Method Object get(int)>
	//    5    9:astore_2        
		removeItemAtIndex(i, true);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:iconst_1        
	//    9   13:invokespecial   #181 <Method void removeItemAtIndex(int, boolean)>
		return obj;
	//   10   16:aload_2         
	//   11   17:areturn         
	}

	public int size()
	{
		return mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int mSize>
	//    2    4:ireturn         
	}

	public void updateItemAt(int i, Object obj)
	{
		throwIfMerging();
	//    0    0:aload_0         
	//    1    1:invokespecial   #194 <Method void throwIfMerging()>
		Object obj1 = get(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #245 <Method Object get(int)>
	//    5    9:astore          4
		boolean flag;
		if(obj1 == obj || !mCallback.areContentsTheSame(obj1, obj))
	//*   6   11:aload           4
	//*   7   13:aload_2         
	//*   8   14:if_acmpeq       30
	//*   9   17:aload_0         
	//*  10   18:getfield        #62  <Field SortedList$Callback mCallback>
	//*  11   21:aload           4
	//*  12   23:aload_2         
	//*  13   24:invokevirtual   #86  <Method boolean SortedList$Callback.areContentsTheSame(Object, Object)>
	//*  14   27:ifne            72
			flag = true;
	//   15   30:iconst_1        
	//   16   31:istore_3        
		else
	//*  17   32:aload           4
	//*  18   34:aload_2         
	//*  19   35:if_acmpeq       77
	//*  20   38:aload_0         
	//*  21   39:getfield        #62  <Field SortedList$Callback mCallback>
	//*  22   42:aload           4
	//*  23   44:aload_2         
	//*  24   45:invokevirtual   #160 <Method int SortedList$Callback.compare(Object, Object)>
	//*  25   48:ifne            77
	//*  26   51:aload_0         
	//*  27   52:getfield        #60  <Field Object[] mData>
	//*  28   55:iload_1         
	//*  29   56:aload_2         
	//*  30   57:aastore         
	//*  31   58:iload_3         
	//*  32   59:ifeq            71
	//*  33   62:aload_0         
	//*  34   63:getfield        #62  <Field SortedList$Callback mCallback>
	//*  35   66:iload_1         
	//*  36   67:iconst_1        
	//*  37   68:invokevirtual   #89  <Method void SortedList$Callback.onChanged(int, int)>
	//*  38   71:return          
			flag = false;
	//   39   72:iconst_0        
	//   40   73:istore_3        
		if(obj1 != obj && mCallback.compare(obj1, obj) == 0)
		{
			mData[i] = obj;
			if(flag)
				mCallback.onChanged(i, 1);
		} else
	//*  41   74:goto            32
		{
			if(flag)
	//*  42   77:iload_3         
	//*  43   78:ifeq            90
				mCallback.onChanged(i, 1);
	//   44   81:aload_0         
	//   45   82:getfield        #62  <Field SortedList$Callback mCallback>
	//   46   85:iload_1         
	//   47   86:iconst_1        
	//   48   87:invokevirtual   #89  <Method void SortedList$Callback.onChanged(int, int)>
			removeItemAtIndex(i, false);
	//   49   90:aload_0         
	//   50   91:iload_1         
	//   51   92:iconst_0        
	//   52   93:invokespecial   #181 <Method void removeItemAtIndex(int, boolean)>
			int j = add(obj, false);
	//   53   96:aload_0         
	//   54   97:aload_2         
	//   55   98:iconst_0        
	//   56   99:invokespecial   #196 <Method int add(Object, boolean)>
	//   57  102:istore_3        
			if(i != j)
	//*  58  103:iload_1         
	//*  59  104:iload_3         
	//*  60  105:icmpeq          71
			{
				mCallback.onMoved(i, j);
	//   61  108:aload_0         
	//   62  109:getfield        #62  <Field SortedList$Callback mCallback>
	//   63  112:iload_1         
	//   64  113:iload_3         
	//   65  114:invokevirtual   #248 <Method void SortedList$Callback.onMoved(int, int)>
				return;
	//   66  117:return          
			}
		}
	}

	private static final int CAPACITY_GROWTH = 10;
	private static final int DELETION = 2;
	private static final int INSERTION = 1;
	public static final int INVALID_POSITION = -1;
	private static final int LOOKUP = 4;
	private static final int MIN_CAPACITY = 10;
	private BatchedCallback mBatchedCallback;
	private Callback mCallback;
	Object mData[];
	private int mMergedSize;
	private Object mOldData[];
	private int mOldDataSize;
	private int mOldDataStart;
	private int mSize;
	private final Class mTClass;
}
