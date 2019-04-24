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

		public Object getChangePayload(Object obj, Object obj1)
		{
			return mWrappedCallback.getChangePayload(obj, obj1);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field SortedList$Callback mWrappedCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #51  <Method Object SortedList$Callback.getChangePayload(Object, Object)>
		//    5    9:areturn         
		}

		public void onChanged(int i, int j)
		{
			mBatchingListUpdateCallback.onChanged(i, j, ((Object) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field BatchingListUpdateCallback mBatchingListUpdateCallback>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:aconst_null     
		//    5    7:invokevirtual   #58  <Method void BatchingListUpdateCallback.onChanged(int, int, Object)>
		//    6   10:return          
		}

		public void onChanged(int i, int j, Object obj)
		{
			mBatchingListUpdateCallback.onChanged(i, j, obj);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field BatchingListUpdateCallback mBatchingListUpdateCallback>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #58  <Method void BatchingListUpdateCallback.onChanged(int, int, Object)>
		//    6   10:return          
		}

		public void onInserted(int i, int j)
		{
			mBatchingListUpdateCallback.onInserted(i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field BatchingListUpdateCallback mBatchingListUpdateCallback>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:invokevirtual   #61  <Method void BatchingListUpdateCallback.onInserted(int, int)>
		//    5    9:return          
		}

		public void onMoved(int i, int j)
		{
			mBatchingListUpdateCallback.onMoved(i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field BatchingListUpdateCallback mBatchingListUpdateCallback>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:invokevirtual   #64  <Method void BatchingListUpdateCallback.onMoved(int, int)>
		//    5    9:return          
		}

		public void onRemoved(int i, int j)
		{
			mBatchingListUpdateCallback.onRemoved(i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field BatchingListUpdateCallback mBatchingListUpdateCallback>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:invokevirtual   #67  <Method void BatchingListUpdateCallback.onRemoved(int, int)>
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
		implements Comparator, ListUpdateCallback
	{

		public abstract boolean areContentsTheSame(Object obj, Object obj1);

		public abstract boolean areItemsTheSame(Object obj, Object obj1);

		public abstract int compare(Object obj, Object obj1);

		public Object getChangePayload(Object obj, Object obj1)
		{
			return ((Object) (null));
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public abstract void onChanged(int i, int j);

		public void onChanged(int i, int j, Object obj)
		{
			onChanged(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokevirtual   #33  <Method void onChanged(int, int)>
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
		mData = (Object[])Array.newInstance(class1, i);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:iload_3         
	//    8   12:invokestatic    #57  <Method Object Array.newInstance(Class, int)>
	//    9   15:checkcast       #58  <Class Object[]>
	//   10   18:putfield        #60  <Field Object[] mData>
		mCallback = callback;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #62  <Field SortedList$Callback mCallback>
		mSize = 0;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #64  <Field int mSize>
	//   17   31:return          
	}

	private int add(Object obj, boolean flag)
	{
		int j = findIndexOf(obj, mData, 0, mSize, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #60  <Field Object[] mData>
	//    4    6:iconst_0        
	//    5    7:aload_0         
	//    6    8:getfield        #64  <Field int mSize>
	//    7   11:iconst_1        
	//    8   12:invokespecial   #71  <Method int findIndexOf(Object, Object[], int, int, int)>
	//    9   15:istore          4
		int i;
		if(j == -1)
	//*  10   17:iload           4
	//*  11   19:iconst_m1       
	//*  12   20:icmpne          28
		{
			i = 0;
	//   13   23:iconst_0        
	//   14   24:istore_3        
		} else
	//*  15   25:goto            120
		{
			i = j;
	//   16   28:iload           4
	//   17   30:istore_3        
			if(j < mSize)
	//*  18   31:iload           4
	//*  19   33:aload_0         
	//*  20   34:getfield        #64  <Field int mSize>
	//*  21   37:icmpge          120
			{
				Object obj1 = mData[j];
	//   22   40:aload_0         
	//   23   41:getfield        #60  <Field Object[] mData>
	//   24   44:iload           4
	//   25   46:aaload          
	//   26   47:astore          5
				i = j;
	//   27   49:iload           4
	//   28   51:istore_3        
				if(mCallback.areItemsTheSame(obj1, obj))
	//*  29   52:aload_0         
	//*  30   53:getfield        #62  <Field SortedList$Callback mCallback>
	//*  31   56:aload           5
	//*  32   58:aload_1         
	//*  33   59:invokevirtual   #75  <Method boolean SortedList$Callback.areItemsTheSame(Object, Object)>
	//*  34   62:ifeq            120
					if(mCallback.areContentsTheSame(obj1, obj))
	//*  35   65:aload_0         
	//*  36   66:getfield        #62  <Field SortedList$Callback mCallback>
	//*  37   69:aload           5
	//*  38   71:aload_1         
	//*  39   72:invokevirtual   #78  <Method boolean SortedList$Callback.areContentsTheSame(Object, Object)>
	//*  40   75:ifeq            89
					{
						mData[j] = obj;
	//   41   78:aload_0         
	//   42   79:getfield        #60  <Field Object[] mData>
	//   43   82:iload           4
	//   44   84:aload_1         
	//   45   85:aastore         
						return j;
	//   46   86:iload           4
	//   47   88:ireturn         
					} else
					{
						mData[j] = obj;
	//   48   89:aload_0         
	//   49   90:getfield        #60  <Field Object[] mData>
	//   50   93:iload           4
	//   51   95:aload_1         
	//   52   96:aastore         
						mCallback.onChanged(j, 1, mCallback.getChangePayload(obj1, obj));
	//   53   97:aload_0         
	//   54   98:getfield        #62  <Field SortedList$Callback mCallback>
	//   55  101:iload           4
	//   56  103:iconst_1        
	//   57  104:aload_0         
	//   58  105:getfield        #62  <Field SortedList$Callback mCallback>
	//   59  108:aload           5
	//   60  110:aload_1         
	//   61  111:invokevirtual   #82  <Method Object SortedList$Callback.getChangePayload(Object, Object)>
	//   62  114:invokevirtual   #86  <Method void SortedList$Callback.onChanged(int, int, Object)>
						return j;
	//   63  117:iload           4
	//   64  119:ireturn         
					}
			}
		}
		addToData(i, obj);
	//   65  120:aload_0         
	//   66  121:iload_3         
	//   67  122:aload_1         
	//   68  123:invokespecial   #90  <Method void addToData(int, Object)>
		if(flag)
	//*  69  126:iload_2         
	//*  70  127:ifeq            139
			mCallback.onInserted(i, 1);
	//   71  130:aload_0         
	//   72  131:getfield        #62  <Field SortedList$Callback mCallback>
	//   73  134:iload_3         
	//   74  135:iconst_1        
	//   75  136:invokevirtual   #94  <Method void SortedList$Callback.onInserted(int, int)>
		return i;
	//   76  139:iload_3         
	//   77  140:ireturn         
	}

	private void addAllInternal(Object aobj[])
	{
		if(aobj.length < 1)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:iconst_1        
	//*   3    3:icmpge          7
			return;
	//    4    6:return          
		int i = sortAndDedup(aobj);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokespecial   #101 <Method int sortAndDedup(Object[])>
	//    8   12:istore_2        
		if(mSize == 0)
	//*   9   13:aload_0         
	//*  10   14:getfield        #64  <Field int mSize>
	//*  11   17:ifne            40
		{
			mData = aobj;
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:putfield        #60  <Field Object[] mData>
			mSize = i;
	//   15   25:aload_0         
	//   16   26:iload_2         
	//   17   27:putfield        #64  <Field int mSize>
			mCallback.onInserted(0, i);
	//   18   30:aload_0         
	//   19   31:getfield        #62  <Field SortedList$Callback mCallback>
	//   20   34:iconst_0        
	//   21   35:iload_2         
	//   22   36:invokevirtual   #94  <Method void SortedList$Callback.onInserted(int, int)>
			return;
	//   23   39:return          
		} else
		{
			merge(aobj, i);
	//   24   40:aload_0         
	//   25   41:aload_1         
	//   26   42:iload_2         
	//   27   43:invokespecial   #105 <Method void merge(Object[], int)>
			return;
	//   28   46:return          
		}
	}

	private void addToData(int i, Object obj)
	{
		if(i > mSize)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #64  <Field int mSize>
	//*   3    5:icmple          57
		{
			obj = ((Object) (new StringBuilder()));
	//    4    8:new             #108 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #109 <Method void StringBuilder()>
	//    7   15:astore_2        
			((StringBuilder) (obj)).append("cannot add item to ");
	//    8   16:aload_2         
	//    9   17:ldc1            #111 <String "cannot add item to ">
	//   10   19:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
			((StringBuilder) (obj)).append(i);
	//   12   23:aload_2         
	//   13   24:iload_1         
	//   14   25:invokevirtual   #118 <Method StringBuilder StringBuilder.append(int)>
	//   15   28:pop             
			((StringBuilder) (obj)).append(" because size is ");
	//   16   29:aload_2         
	//   17   30:ldc1            #120 <String " because size is ">
	//   18   32:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
			((StringBuilder) (obj)).append(mSize);
	//   20   36:aload_2         
	//   21   37:aload_0         
	//   22   38:getfield        #64  <Field int mSize>
	//   23   41:invokevirtual   #118 <Method StringBuilder StringBuilder.append(int)>
	//   24   44:pop             
			throw new IndexOutOfBoundsException(((StringBuilder) (obj)).toString());
	//   25   45:new             #122 <Class IndexOutOfBoundsException>
	//   26   48:dup             
	//   27   49:aload_2         
	//   28   50:invokevirtual   #126 <Method String StringBuilder.toString()>
	//   29   53:invokespecial   #129 <Method void IndexOutOfBoundsException(String)>
	//   30   56:athrow          
		}
		if(mSize == mData.length)
	//*  31   57:aload_0         
	//*  32   58:getfield        #64  <Field int mSize>
	//*  33   61:aload_0         
	//*  34   62:getfield        #60  <Field Object[] mData>
	//*  35   65:arraylength     
	//*  36   66:icmpne          129
		{
			Object aobj[] = (Object[])Array.newInstance(mTClass, mData.length + 10);
	//   37   69:aload_0         
	//   38   70:getfield        #51  <Field Class mTClass>
	//   39   73:aload_0         
	//   40   74:getfield        #60  <Field Object[] mData>
	//   41   77:arraylength     
	//   42   78:bipush          10
	//   43   80:iadd            
	//   44   81:invokestatic    #57  <Method Object Array.newInstance(Class, int)>
	//   45   84:checkcast       #58  <Class Object[]>
	//   46   87:astore_3        
			System.arraycopy(((Object) (mData)), 0, ((Object) (aobj)), 0, i);
	//   47   88:aload_0         
	//   48   89:getfield        #60  <Field Object[] mData>
	//   49   92:iconst_0        
	//   50   93:aload_3         
	//   51   94:iconst_0        
	//   52   95:iload_1         
	//   53   96:invokestatic    #135 <Method void System.arraycopy(Object, int, Object, int, int)>
			aobj[i] = obj;
	//   54   99:aload_3         
	//   55  100:iload_1         
	//   56  101:aload_2         
	//   57  102:aastore         
			System.arraycopy(((Object) (mData)), i, ((Object) (aobj)), i + 1, mSize - i);
	//   58  103:aload_0         
	//   59  104:getfield        #60  <Field Object[] mData>
	//   60  107:iload_1         
	//   61  108:aload_3         
	//   62  109:iload_1         
	//   63  110:iconst_1        
	//   64  111:iadd            
	//   65  112:aload_0         
	//   66  113:getfield        #64  <Field int mSize>
	//   67  116:iload_1         
	//   68  117:isub            
	//   69  118:invokestatic    #135 <Method void System.arraycopy(Object, int, Object, int, int)>
			mData = aobj;
	//   70  121:aload_0         
	//   71  122:aload_3         
	//   72  123:putfield        #60  <Field Object[] mData>
		} else
	//*  73  126:goto            157
		{
			System.arraycopy(((Object) (mData)), i, ((Object) (mData)), i + 1, mSize - i);
	//   74  129:aload_0         
	//   75  130:getfield        #60  <Field Object[] mData>
	//   76  133:iload_1         
	//   77  134:aload_0         
	//   78  135:getfield        #60  <Field Object[] mData>
	//   79  138:iload_1         
	//   80  139:iconst_1        
	//   81  140:iadd            
	//   82  141:aload_0         
	//   83  142:getfield        #64  <Field int mSize>
	//   84  145:iload_1         
	//   85  146:isub            
	//   86  147:invokestatic    #135 <Method void System.arraycopy(Object, int, Object, int, int)>
			mData[i] = obj;
	//   87  150:aload_0         
	//   88  151:getfield        #60  <Field Object[] mData>
	//   89  154:iload_1         
	//   90  155:aload_2         
	//   91  156:aastore         
		}
		mSize = mSize + 1;
	//   92  157:aload_0         
	//   93  158:aload_0         
	//   94  159:getfield        #64  <Field int mSize>
	//   95  162:iconst_1        
	//   96  163:iadd            
	//   97  164:putfield        #64  <Field int mSize>
	//   98  167:return          
	}

	private Object[] copyArray(Object aobj[])
	{
		Object aobj1[] = (Object[])Array.newInstance(mTClass, aobj.length);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Class mTClass>
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:invokestatic    #57  <Method Object Array.newInstance(Class, int)>
	//    5    9:checkcast       #58  <Class Object[]>
	//    6   12:astore_2        
		System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, aobj.length);
	//    7   13:aload_1         
	//    8   14:iconst_0        
	//    9   15:aload_2         
	//   10   16:iconst_0        
	//   11   17:aload_1         
	//   12   18:arraylength     
	//   13   19:invokestatic    #135 <Method void System.arraycopy(Object, int, Object, int, int)>
		return aobj1;
	//   14   22:aload_2         
	//   15   23:areturn         
	}

	private int findIndexOf(Object obj, Object aobj[], int i, int j, int k)
	{
		int l;
		for(l = i; l < j;)
	//*   0    0:iload_3         
	//*   1    1:istore          6
	//*   2    3:iload           6
	//*   3    5:iload           4
	//*   4    7:icmpge          111
		{
			i = (l + j) / 2;
	//    5   10:iload           6
	//    6   12:iload           4
	//    7   14:iadd            
	//    8   15:iconst_2        
	//    9   16:idiv            
	//   10   17:istore_3        
			Object obj1 = aobj[i];
	//   11   18:aload_2         
	//   12   19:iload_3         
	//   13   20:aaload          
	//   14   21:astore          8
			int i1 = mCallback.compare(obj1, obj);
	//   15   23:aload_0         
	//   16   24:getfield        #62  <Field SortedList$Callback mCallback>
	//   17   27:aload           8
	//   18   29:aload_1         
	//   19   30:invokevirtual   #143 <Method int SortedList$Callback.compare(Object, Object)>
	//   20   33:istore          7
			if(i1 < 0)
	//*  21   35:iload           7
	//*  22   37:ifge            48
			{
				l = i + 1;
	//   23   40:iload_3         
	//   24   41:iconst_1        
	//   25   42:iadd            
	//   26   43:istore          6
			} else
	//*  27   45:goto            3
			{
				if(i1 == 0)
	//*  28   48:iload           7
	//*  29   50:ifne            105
				{
					if(mCallback.areItemsTheSame(obj1, obj))
	//*  30   53:aload_0         
	//*  31   54:getfield        #62  <Field SortedList$Callback mCallback>
	//*  32   57:aload           8
	//*  33   59:aload_1         
	//*  34   60:invokevirtual   #75  <Method boolean SortedList$Callback.areItemsTheSame(Object, Object)>
	//*  35   63:ifeq            68
						return i;
	//   36   66:iload_3         
	//   37   67:ireturn         
					l = linearEqualitySearch(obj, i, l, j);
	//   38   68:aload_0         
	//   39   69:aload_1         
	//   40   70:iload_3         
	//   41   71:iload           6
	//   42   73:iload           4
	//   43   75:invokespecial   #147 <Method int linearEqualitySearch(Object, int, int, int)>
	//   44   78:istore          6
					if(k == 1)
	//*  45   80:iload           5
	//*  46   82:iconst_1        
	//*  47   83:icmpne          102
					{
						j = l;
	//   48   86:iload           6
	//   49   88:istore          4
						if(l == -1)
	//*  50   90:iload           6
	//*  51   92:iconst_m1       
	//*  52   93:icmpne          99
							j = i;
	//   53   96:iload_3         
	//   54   97:istore          4
						return j;
	//   55   99:iload           4
	//   56  101:ireturn         
					} else
					{
						return l;
	//   57  102:iload           6
	//   58  104:ireturn         
					}
				}
				j = i;
	//   59  105:iload_3         
	//   60  106:istore          4
			}
		}

	//*  61  108:goto            3
		if(k == 1)
	//*  62  111:iload           5
	//*  63  113:iconst_1        
	//*  64  114:icmpne          120
			return l;
	//   65  117:iload           6
	//   66  119:ireturn         
		else
			return -1;
	//   67  120:iconst_m1       
	//   68  121:ireturn         
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
	//*   9   14:invokevirtual   #75  <Method boolean SortedList$Callback.areItemsTheSame(Object, Object)>
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
		int l;
		do
		{
			l = i;
	//    4    5:iload_2         
	//    5    6:istore          5
			if(i1 < j)
				break;
	//    6    8:iload           6
	//    7   10:iload_3         
	//    8   11:icmplt          67
			Object obj1 = mData[i1];
	//    9   14:aload_0         
	//   10   15:getfield        #60  <Field Object[] mData>
	//   11   18:iload           6
	//   12   20:aaload          
	//   13   21:astore          7
			if(mCallback.compare(obj1, obj) != 0)
	//*  14   23:aload_0         
	//*  15   24:getfield        #62  <Field SortedList$Callback mCallback>
	//*  16   27:aload           7
	//*  17   29:aload_1         
	//*  18   30:invokevirtual   #143 <Method int SortedList$Callback.compare(Object, Object)>
	//*  19   33:ifeq            42
			{
				l = i;
	//   20   36:iload_2         
	//   21   37:istore          5
				break;
	//   22   39:goto            67
			}
			if(mCallback.areItemsTheSame(obj1, obj))
	//*  23   42:aload_0         
	//*  24   43:getfield        #62  <Field SortedList$Callback mCallback>
	//*  25   46:aload           7
	//*  26   48:aload_1         
	//*  27   49:invokevirtual   #75  <Method boolean SortedList$Callback.areItemsTheSame(Object, Object)>
	//*  28   52:ifeq            58
				return i1;
	//   29   55:iload           6
	//   30   57:ireturn         
			i1--;
	//   31   58:iload           6
	//   32   60:iconst_1        
	//   33   61:isub            
	//   34   62:istore          6
		} while(true);
	//   35   64:goto            5
		do
		{
			i = l + 1;
	//   36   67:iload           5
	//   37   69:iconst_1        
	//   38   70:iadd            
	//   39   71:istore_2        
			if(i >= k)
				break;
	//   40   72:iload_2         
	//   41   73:iload           4
	//   42   75:icmpge          120
			Object obj2 = mData[i];
	//   43   78:aload_0         
	//   44   79:getfield        #60  <Field Object[] mData>
	//   45   82:iload_2         
	//   46   83:aaload          
	//   47   84:astore          7
			if(mCallback.compare(obj2, obj) != 0)
	//*  48   86:aload_0         
	//*  49   87:getfield        #62  <Field SortedList$Callback mCallback>
	//*  50   90:aload           7
	//*  51   92:aload_1         
	//*  52   93:invokevirtual   #143 <Method int SortedList$Callback.compare(Object, Object)>
	//*  53   96:ifeq            102
				break;
	//   54   99:goto            120
			l = i;
	//   55  102:iload_2         
	//   56  103:istore          5
			if(mCallback.areItemsTheSame(obj2, obj))
	//*  57  105:aload_0         
	//*  58  106:getfield        #62  <Field SortedList$Callback mCallback>
	//*  59  109:aload           7
	//*  60  111:aload_1         
	//*  61  112:invokevirtual   #75  <Method boolean SortedList$Callback.areItemsTheSame(Object, Object)>
	//*  62  115:ifeq            67
				return i;
	//   63  118:iload_2         
	//   64  119:ireturn         
		} while(true);
		return -1;
	//   65  120:iconst_m1       
	//   66  121:ireturn         
	}

	private void merge(Object aobj[], int i)
	{
		boolean flag1 = mCallback instanceof BatchedCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field SortedList$Callback mCallback>
	//    2    4:instanceof      #7   <Class SortedList$BatchedCallback>
	//    3    7:istore          6
		int j = 0;
	//    4    9:iconst_0        
	//    5   10:istore_3        
		boolean flag;
		if(!flag1)
	//*   6   11:iload           6
	//*   7   13:ifne            22
			flag = true;
	//    8   16:iconst_1        
	//    9   17:istore          4
		else
	//*  10   19:goto            25
			flag = false;
	//   11   22:iconst_0        
	//   12   23:istore          4
		if(flag)
	//*  13   25:iload           4
	//*  14   27:ifeq            34
			beginBatchedUpdates();
	//   15   30:aload_0         
	//   16   31:invokevirtual   #155 <Method void beginBatchedUpdates()>
		mOldData = mData;
	//   17   34:aload_0         
	//   18   35:aload_0         
	//   19   36:getfield        #60  <Field Object[] mData>
	//   20   39:putfield        #157 <Field Object[] mOldData>
		mOldDataStart = 0;
	//   21   42:aload_0         
	//   22   43:iconst_0        
	//   23   44:putfield        #159 <Field int mOldDataStart>
		mOldDataSize = mSize;
	//   24   47:aload_0         
	//   25   48:aload_0         
	//   26   49:getfield        #64  <Field int mSize>
	//   27   52:putfield        #161 <Field int mOldDataSize>
		int k = mSize;
	//   28   55:aload_0         
	//   29   56:getfield        #64  <Field int mSize>
	//   30   59:istore          5
		mData = (Object[])Array.newInstance(mTClass, k + i + 10);
	//   31   61:aload_0         
	//   32   62:aload_0         
	//   33   63:getfield        #51  <Field Class mTClass>
	//   34   66:iload           5
	//   35   68:iload_2         
	//   36   69:iadd            
	//   37   70:bipush          10
	//   38   72:iadd            
	//   39   73:invokestatic    #57  <Method Object Array.newInstance(Class, int)>
	//   40   76:checkcast       #58  <Class Object[]>
	//   41   79:putfield        #60  <Field Object[] mData>
		mNewDataStart = 0;
	//   42   82:aload_0         
	//   43   83:iconst_0        
	//   44   84:putfield        #163 <Field int mNewDataStart>
		do
		{
label0:
			{
				if(mOldDataStart < mOldDataSize || j < i)
	//*  45   87:aload_0         
	//*  46   88:getfield        #159 <Field int mOldDataStart>
	//*  47   91:aload_0         
	//*  48   92:getfield        #161 <Field int mOldDataSize>
	//*  49   95:icmplt          103
	//*  50   98:iload_3         
	//*  51   99:iload_2         
	//*  52  100:icmpge          214
					if(mOldDataStart == mOldDataSize)
	//*  53  103:aload_0         
	//*  54  104:getfield        #159 <Field int mOldDataStart>
	//*  55  107:aload_0         
	//*  56  108:getfield        #161 <Field int mOldDataSize>
	//*  57  111:icmpne          169
					{
						i -= j;
	//   58  114:iload_2         
	//   59  115:iload_3         
	//   60  116:isub            
	//   61  117:istore_2        
						System.arraycopy(((Object) (aobj)), j, ((Object) (mData)), mNewDataStart, i);
	//   62  118:aload_1         
	//   63  119:iload_3         
	//   64  120:aload_0         
	//   65  121:getfield        #60  <Field Object[] mData>
	//   66  124:aload_0         
	//   67  125:getfield        #163 <Field int mNewDataStart>
	//   68  128:iload_2         
	//   69  129:invokestatic    #135 <Method void System.arraycopy(Object, int, Object, int, int)>
						mNewDataStart = mNewDataStart + i;
	//   70  132:aload_0         
	//   71  133:aload_0         
	//   72  134:getfield        #163 <Field int mNewDataStart>
	//   73  137:iload_2         
	//   74  138:iadd            
	//   75  139:putfield        #163 <Field int mNewDataStart>
						mSize = mSize + i;
	//   76  142:aload_0         
	//   77  143:aload_0         
	//   78  144:getfield        #64  <Field int mSize>
	//   79  147:iload_2         
	//   80  148:iadd            
	//   81  149:putfield        #64  <Field int mSize>
						mCallback.onInserted(mNewDataStart - i, i);
	//   82  152:aload_0         
	//   83  153:getfield        #62  <Field SortedList$Callback mCallback>
	//   84  156:aload_0         
	//   85  157:getfield        #163 <Field int mNewDataStart>
	//   86  160:iload_2         
	//   87  161:isub            
	//   88  162:iload_2         
	//   89  163:invokevirtual   #94  <Method void SortedList$Callback.onInserted(int, int)>
					} else
	//*  90  166:goto            214
					{
						if(j != i)
							break label0;
	//   91  169:iload_3         
	//   92  170:iload_2         
	//   93  171:icmpne          229
						i = mOldDataSize - mOldDataStart;
	//   94  174:aload_0         
	//   95  175:getfield        #161 <Field int mOldDataSize>
	//   96  178:aload_0         
	//   97  179:getfield        #159 <Field int mOldDataStart>
	//   98  182:isub            
	//   99  183:istore_2        
						System.arraycopy(((Object) (mOldData)), mOldDataStart, ((Object) (mData)), mNewDataStart, i);
	//  100  184:aload_0         
	//  101  185:getfield        #157 <Field Object[] mOldData>
	//  102  188:aload_0         
	//  103  189:getfield        #159 <Field int mOldDataStart>
	//  104  192:aload_0         
	//  105  193:getfield        #60  <Field Object[] mData>
	//  106  196:aload_0         
	//  107  197:getfield        #163 <Field int mNewDataStart>
	//  108  200:iload_2         
	//  109  201:invokestatic    #135 <Method void System.arraycopy(Object, int, Object, int, int)>
						mNewDataStart = mNewDataStart + i;
	//  110  204:aload_0         
	//  111  205:aload_0         
	//  112  206:getfield        #163 <Field int mNewDataStart>
	//  113  209:iload_2         
	//  114  210:iadd            
	//  115  211:putfield        #163 <Field int mNewDataStart>
					}
				mOldData = null;
	//  116  214:aload_0         
	//  117  215:aconst_null     
	//  118  216:putfield        #157 <Field Object[] mOldData>
				if(flag)
	//* 119  219:iload           4
	//* 120  221:ifeq            228
					endBatchedUpdates();
	//  121  224:aload_0         
	//  122  225:invokevirtual   #166 <Method void endBatchedUpdates()>
				return;
	//  123  228:return          
			}
			Object obj = mOldData[mOldDataStart];
	//  124  229:aload_0         
	//  125  230:getfield        #157 <Field Object[] mOldData>
	//  126  233:aload_0         
	//  127  234:getfield        #159 <Field int mOldDataStart>
	//  128  237:aaload          
	//  129  238:astore          7
			Object obj1 = aobj[j];
	//  130  240:aload_1         
	//  131  241:iload_3         
	//  132  242:aaload          
	//  133  243:astore          8
			int l = mCallback.compare(obj, obj1);
	//  134  245:aload_0         
	//  135  246:getfield        #62  <Field SortedList$Callback mCallback>
	//  136  249:aload           7
	//  137  251:aload           8
	//  138  253:invokevirtual   #143 <Method int SortedList$Callback.compare(Object, Object)>
	//  139  256:istore          5
			if(l > 0)
	//* 140  258:iload           5
	//* 141  260:ifle            321
			{
				obj = ((Object) (mData));
	//  142  263:aload_0         
	//  143  264:getfield        #60  <Field Object[] mData>
	//  144  267:astore          7
				l = mNewDataStart;
	//  145  269:aload_0         
	//  146  270:getfield        #163 <Field int mNewDataStart>
	//  147  273:istore          5
				mNewDataStart = l + 1;
	//  148  275:aload_0         
	//  149  276:iload           5
	//  150  278:iconst_1        
	//  151  279:iadd            
	//  152  280:putfield        #163 <Field int mNewDataStart>
				obj[l] = ((/*<invalid signature>*/java.lang.Object) (obj1));
	//  153  283:aload           7
	//  154  285:iload           5
	//  155  287:aload           8
	//  156  289:aastore         
				mSize = mSize + 1;
	//  157  290:aload_0         
	//  158  291:aload_0         
	//  159  292:getfield        #64  <Field int mSize>
	//  160  295:iconst_1        
	//  161  296:iadd            
	//  162  297:putfield        #64  <Field int mSize>
				j++;
	//  163  300:iload_3         
	//  164  301:iconst_1        
	//  165  302:iadd            
	//  166  303:istore_3        
				mCallback.onInserted(mNewDataStart - 1, 1);
	//  167  304:aload_0         
	//  168  305:getfield        #62  <Field SortedList$Callback mCallback>
	//  169  308:aload_0         
	//  170  309:getfield        #163 <Field int mNewDataStart>
	//  171  312:iconst_1        
	//  172  313:isub            
	//  173  314:iconst_1        
	//  174  315:invokevirtual   #94  <Method void SortedList$Callback.onInserted(int, int)>
			} else
	//* 175  318:goto            87
			if(l == 0 && mCallback.areItemsTheSame(obj, obj1))
	//* 176  321:iload           5
	//* 177  323:ifne            430
	//* 178  326:aload_0         
	//* 179  327:getfield        #62  <Field SortedList$Callback mCallback>
	//* 180  330:aload           7
	//* 181  332:aload           8
	//* 182  334:invokevirtual   #75  <Method boolean SortedList$Callback.areItemsTheSame(Object, Object)>
	//* 183  337:ifeq            430
			{
				Object aobj2[] = mData;
	//  184  340:aload_0         
	//  185  341:getfield        #60  <Field Object[] mData>
	//  186  344:astore          9
				int i1 = mNewDataStart;
	//  187  346:aload_0         
	//  188  347:getfield        #163 <Field int mNewDataStart>
	//  189  350:istore          5
				mNewDataStart = i1 + 1;
	//  190  352:aload_0         
	//  191  353:iload           5
	//  192  355:iconst_1        
	//  193  356:iadd            
	//  194  357:putfield        #163 <Field int mNewDataStart>
				aobj2[i1] = obj1;
	//  195  360:aload           9
	//  196  362:iload           5
	//  197  364:aload           8
	//  198  366:aastore         
				i1 = j + 1;
	//  199  367:iload_3         
	//  200  368:iconst_1        
	//  201  369:iadd            
	//  202  370:istore          5
				mOldDataStart = mOldDataStart + 1;
	//  203  372:aload_0         
	//  204  373:aload_0         
	//  205  374:getfield        #159 <Field int mOldDataStart>
	//  206  377:iconst_1        
	//  207  378:iadd            
	//  208  379:putfield        #159 <Field int mOldDataStart>
				j = i1;
	//  209  382:iload           5
	//  210  384:istore_3        
				if(!mCallback.areContentsTheSame(obj, obj1))
	//* 211  385:aload_0         
	//* 212  386:getfield        #62  <Field SortedList$Callback mCallback>
	//* 213  389:aload           7
	//* 214  391:aload           8
	//* 215  393:invokevirtual   #78  <Method boolean SortedList$Callback.areContentsTheSame(Object, Object)>
	//* 216  396:ifne            87
				{
					mCallback.onChanged(mNewDataStart - 1, 1, mCallback.getChangePayload(obj, obj1));
	//  217  399:aload_0         
	//  218  400:getfield        #62  <Field SortedList$Callback mCallback>
	//  219  403:aload_0         
	//  220  404:getfield        #163 <Field int mNewDataStart>
	//  221  407:iconst_1        
	//  222  408:isub            
	//  223  409:iconst_1        
	//  224  410:aload_0         
	//  225  411:getfield        #62  <Field SortedList$Callback mCallback>
	//  226  414:aload           7
	//  227  416:aload           8
	//  228  418:invokevirtual   #82  <Method Object SortedList$Callback.getChangePayload(Object, Object)>
	//  229  421:invokevirtual   #86  <Method void SortedList$Callback.onChanged(int, int, Object)>
					j = i1;
	//  230  424:iload           5
	//  231  426:istore_3        
				}
			} else
	//* 232  427:goto            87
			{
				Object aobj1[] = mData;
	//  233  430:aload_0         
	//  234  431:getfield        #60  <Field Object[] mData>
	//  235  434:astore          8
				int j1 = mNewDataStart;
	//  236  436:aload_0         
	//  237  437:getfield        #163 <Field int mNewDataStart>
	//  238  440:istore          5
				mNewDataStart = j1 + 1;
	//  239  442:aload_0         
	//  240  443:iload           5
	//  241  445:iconst_1        
	//  242  446:iadd            
	//  243  447:putfield        #163 <Field int mNewDataStart>
				aobj1[j1] = obj;
	//  244  450:aload           8
	//  245  452:iload           5
	//  246  454:aload           7
	//  247  456:aastore         
				mOldDataStart = mOldDataStart + 1;
	//  248  457:aload_0         
	//  249  458:aload_0         
	//  250  459:getfield        #159 <Field int mOldDataStart>
	//  251  462:iconst_1        
	//  252  463:iadd            
	//  253  464:putfield        #159 <Field int mOldDataStart>
			}
		} while(true);
	//  254  467:goto            87
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
	//   18   26:invokespecial   #173 <Method void removeItemAtIndex(int, boolean)>
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
	//   14   20:invokestatic    #135 <Method void System.arraycopy(Object, int, Object, int, int)>
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
	//   33   53:invokevirtual   #177 <Method void SortedList$Callback.onRemoved(int, int)>
	//   34   56:return          
	}

	private void replaceAllInsert(Object obj)
	{
		mData[mNewDataStart] = obj;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Object[] mData>
	//    2    4:aload_0         
	//    3    5:getfield        #163 <Field int mNewDataStart>
	//    4    8:aload_1         
	//    5    9:aastore         
		mNewDataStart = mNewDataStart + 1;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #163 <Field int mNewDataStart>
	//    9   15:iconst_1        
	//   10   16:iadd            
	//   11   17:putfield        #163 <Field int mNewDataStart>
		mSize = mSize + 1;
	//   12   20:aload_0         
	//   13   21:aload_0         
	//   14   22:getfield        #64  <Field int mSize>
	//   15   25:iconst_1        
	//   16   26:iadd            
	//   17   27:putfield        #64  <Field int mSize>
		mCallback.onInserted(mNewDataStart - 1, 1);
	//   18   30:aload_0         
	//   19   31:getfield        #62  <Field SortedList$Callback mCallback>
	//   20   34:aload_0         
	//   21   35:getfield        #163 <Field int mNewDataStart>
	//   22   38:iconst_1        
	//   23   39:isub            
	//   24   40:iconst_1        
	//   25   41:invokevirtual   #94  <Method void SortedList$Callback.onInserted(int, int)>
	//   26   44:return          
	}

	private void replaceAllInternal(Object aobj[])
	{
		boolean flag;
		if(!(mCallback instanceof BatchedCallback))
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field SortedList$Callback mCallback>
	//*   2    4:instanceof      #7   <Class SortedList$BatchedCallback>
	//*   3    7:ifne            15
			flag = true;
	//    4   10:iconst_1        
	//    5   11:istore_2        
		else
	//*   6   12:goto            17
			flag = false;
	//    7   15:iconst_0        
	//    8   16:istore_2        
		if(flag)
	//*   9   17:iload_2         
	//*  10   18:ifeq            25
			beginBatchedUpdates();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #155 <Method void beginBatchedUpdates()>
		mOldDataStart = 0;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #159 <Field int mOldDataStart>
		mOldDataSize = mSize;
	//   16   30:aload_0         
	//   17   31:aload_0         
	//   18   32:getfield        #64  <Field int mSize>
	//   19   35:putfield        #161 <Field int mOldDataSize>
		mOldData = mData;
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:getfield        #60  <Field Object[] mData>
	//   23   43:putfield        #157 <Field Object[] mOldData>
		mNewDataStart = 0;
	//   24   46:aload_0         
	//   25   47:iconst_0        
	//   26   48:putfield        #163 <Field int mNewDataStart>
		int i = sortAndDedup(aobj);
	//   27   51:aload_0         
	//   28   52:aload_1         
	//   29   53:invokespecial   #101 <Method int sortAndDedup(Object[])>
	//   30   56:istore_3        
		mData = (Object[])Array.newInstance(mTClass, i);
	//   31   57:aload_0         
	//   32   58:aload_0         
	//   33   59:getfield        #51  <Field Class mTClass>
	//   34   62:iload_3         
	//   35   63:invokestatic    #57  <Method Object Array.newInstance(Class, int)>
	//   36   66:checkcast       #58  <Class Object[]>
	//   37   69:putfield        #60  <Field Object[] mData>
		do
		{
label0:
			{
				if(mNewDataStart < i || mOldDataStart < mOldDataSize)
	//*  38   72:aload_0         
	//*  39   73:getfield        #163 <Field int mNewDataStart>
	//*  40   76:iload_3         
	//*  41   77:icmplt          91
	//*  42   80:aload_0         
	//*  43   81:getfield        #159 <Field int mOldDataStart>
	//*  44   84:aload_0         
	//*  45   85:getfield        #161 <Field int mOldDataSize>
	//*  46   88:icmpge          201
					if(mOldDataStart >= mOldDataSize)
	//*  47   91:aload_0         
	//*  48   92:getfield        #159 <Field int mOldDataStart>
	//*  49   95:aload_0         
	//*  50   96:getfield        #161 <Field int mOldDataSize>
	//*  51   99:icmplt          161
					{
						int j = mNewDataStart;
	//   52  102:aload_0         
	//   53  103:getfield        #163 <Field int mNewDataStart>
	//   54  106:istore          4
						i -= mNewDataStart;
	//   55  108:iload_3         
	//   56  109:aload_0         
	//   57  110:getfield        #163 <Field int mNewDataStart>
	//   58  113:isub            
	//   59  114:istore_3        
						System.arraycopy(((Object) (aobj)), j, ((Object) (mData)), j, i);
	//   60  115:aload_1         
	//   61  116:iload           4
	//   62  118:aload_0         
	//   63  119:getfield        #60  <Field Object[] mData>
	//   64  122:iload           4
	//   65  124:iload_3         
	//   66  125:invokestatic    #135 <Method void System.arraycopy(Object, int, Object, int, int)>
						mNewDataStart = mNewDataStart + i;
	//   67  128:aload_0         
	//   68  129:aload_0         
	//   69  130:getfield        #163 <Field int mNewDataStart>
	//   70  133:iload_3         
	//   71  134:iadd            
	//   72  135:putfield        #163 <Field int mNewDataStart>
						mSize = mSize + i;
	//   73  138:aload_0         
	//   74  139:aload_0         
	//   75  140:getfield        #64  <Field int mSize>
	//   76  143:iload_3         
	//   77  144:iadd            
	//   78  145:putfield        #64  <Field int mSize>
						mCallback.onInserted(j, i);
	//   79  148:aload_0         
	//   80  149:getfield        #62  <Field SortedList$Callback mCallback>
	//   81  152:iload           4
	//   82  154:iload_3         
	//   83  155:invokevirtual   #94  <Method void SortedList$Callback.onInserted(int, int)>
					} else
	//*  84  158:goto            201
					{
						if(mNewDataStart < i)
							break label0;
	//   85  161:aload_0         
	//   86  162:getfield        #163 <Field int mNewDataStart>
	//   87  165:iload_3         
	//   88  166:icmplt          215
						i = mOldDataSize - mOldDataStart;
	//   89  169:aload_0         
	//   90  170:getfield        #161 <Field int mOldDataSize>
	//   91  173:aload_0         
	//   92  174:getfield        #159 <Field int mOldDataStart>
	//   93  177:isub            
	//   94  178:istore_3        
						mSize = mSize - i;
	//   95  179:aload_0         
	//   96  180:aload_0         
	//   97  181:getfield        #64  <Field int mSize>
	//   98  184:iload_3         
	//   99  185:isub            
	//  100  186:putfield        #64  <Field int mSize>
						mCallback.onRemoved(mNewDataStart, i);
	//  101  189:aload_0         
	//  102  190:getfield        #62  <Field SortedList$Callback mCallback>
	//  103  193:aload_0         
	//  104  194:getfield        #163 <Field int mNewDataStart>
	//  105  197:iload_3         
	//  106  198:invokevirtual   #177 <Method void SortedList$Callback.onRemoved(int, int)>
					}
				mOldData = null;
	//  107  201:aload_0         
	//  108  202:aconst_null     
	//  109  203:putfield        #157 <Field Object[] mOldData>
				if(flag)
	//* 110  206:iload_2         
	//* 111  207:ifeq            214
					endBatchedUpdates();
	//  112  210:aload_0         
	//  113  211:invokevirtual   #166 <Method void endBatchedUpdates()>
				return;
	//  114  214:return          
			}
			Object obj = mOldData[mOldDataStart];
	//  115  215:aload_0         
	//  116  216:getfield        #157 <Field Object[] mOldData>
	//  117  219:aload_0         
	//  118  220:getfield        #159 <Field int mOldDataStart>
	//  119  223:aaload          
	//  120  224:astore          5
			Object obj1 = aobj[mNewDataStart];
	//  121  226:aload_1         
	//  122  227:aload_0         
	//  123  228:getfield        #163 <Field int mNewDataStart>
	//  124  231:aaload          
	//  125  232:astore          6
			int k = mCallback.compare(obj, obj1);
	//  126  234:aload_0         
	//  127  235:getfield        #62  <Field SortedList$Callback mCallback>
	//  128  238:aload           5
	//  129  240:aload           6
	//  130  242:invokevirtual   #143 <Method int SortedList$Callback.compare(Object, Object)>
	//  131  245:istore          4
			if(k < 0)
	//* 132  247:iload           4
	//* 133  249:ifge            259
				replaceAllRemove();
	//  134  252:aload_0         
	//  135  253:invokespecial   #185 <Method void replaceAllRemove()>
			else
	//* 136  256:goto            72
			if(k > 0)
	//* 137  259:iload           4
	//* 138  261:ifle            273
				replaceAllInsert(obj1);
	//  139  264:aload_0         
	//  140  265:aload           6
	//  141  267:invokespecial   #187 <Method void replaceAllInsert(Object)>
			else
	//* 142  270:goto            72
			if(!mCallback.areItemsTheSame(obj, obj1))
	//* 143  273:aload_0         
	//* 144  274:getfield        #62  <Field SortedList$Callback mCallback>
	//* 145  277:aload           5
	//* 146  279:aload           6
	//* 147  281:invokevirtual   #75  <Method boolean SortedList$Callback.areItemsTheSame(Object, Object)>
	//* 148  284:ifne            300
			{
				replaceAllRemove();
	//  149  287:aload_0         
	//  150  288:invokespecial   #185 <Method void replaceAllRemove()>
				replaceAllInsert(obj1);
	//  151  291:aload_0         
	//  152  292:aload           6
	//  153  294:invokespecial   #187 <Method void replaceAllInsert(Object)>
			} else
	//* 154  297:goto            72
			{
				mData[mNewDataStart] = obj1;
	//  155  300:aload_0         
	//  156  301:getfield        #60  <Field Object[] mData>
	//  157  304:aload_0         
	//  158  305:getfield        #163 <Field int mNewDataStart>
	//  159  308:aload           6
	//  160  310:aastore         
				mOldDataStart = mOldDataStart + 1;
	//  161  311:aload_0         
	//  162  312:aload_0         
	//  163  313:getfield        #159 <Field int mOldDataStart>
	//  164  316:iconst_1        
	//  165  317:iadd            
	//  166  318:putfield        #159 <Field int mOldDataStart>
				mNewDataStart = mNewDataStart + 1;
	//  167  321:aload_0         
	//  168  322:aload_0         
	//  169  323:getfield        #163 <Field int mNewDataStart>
	//  170  326:iconst_1        
	//  171  327:iadd            
	//  172  328:putfield        #163 <Field int mNewDataStart>
				if(!mCallback.areContentsTheSame(obj, obj1))
	//* 173  331:aload_0         
	//* 174  332:getfield        #62  <Field SortedList$Callback mCallback>
	//* 175  335:aload           5
	//* 176  337:aload           6
	//* 177  339:invokevirtual   #78  <Method boolean SortedList$Callback.areContentsTheSame(Object, Object)>
	//* 178  342:ifne            72
					mCallback.onChanged(mNewDataStart - 1, 1, mCallback.getChangePayload(obj, obj1));
	//  179  345:aload_0         
	//  180  346:getfield        #62  <Field SortedList$Callback mCallback>
	//  181  349:aload_0         
	//  182  350:getfield        #163 <Field int mNewDataStart>
	//  183  353:iconst_1        
	//  184  354:isub            
	//  185  355:iconst_1        
	//  186  356:aload_0         
	//  187  357:getfield        #62  <Field SortedList$Callback mCallback>
	//  188  360:aload           5
	//  189  362:aload           6
	//  190  364:invokevirtual   #82  <Method Object SortedList$Callback.getChangePayload(Object, Object)>
	//  191  367:invokevirtual   #86  <Method void SortedList$Callback.onChanged(int, int, Object)>
			}
		} while(true);
	//  192  370:goto            72
	}

	private void replaceAllRemove()
	{
		mSize = mSize - 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #64  <Field int mSize>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:putfield        #64  <Field int mSize>
		mOldDataStart = mOldDataStart + 1;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #159 <Field int mOldDataStart>
	//    9   15:iconst_1        
	//   10   16:iadd            
	//   11   17:putfield        #159 <Field int mOldDataStart>
		mCallback.onRemoved(mNewDataStart, 1);
	//   12   20:aload_0         
	//   13   21:getfield        #62  <Field SortedList$Callback mCallback>
	//   14   24:aload_0         
	//   15   25:getfield        #163 <Field int mNewDataStart>
	//   16   28:iconst_1        
	//   17   29:invokevirtual   #177 <Method void SortedList$Callback.onRemoved(int, int)>
	//   18   32:return          
	}

	private int sortAndDedup(Object aobj[])
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(aobj.length == 0)
	//*   2    3:aload_1         
	//*   3    4:arraylength     
	//*   4    5:ifne            10
			return 0;
	//    5    8:iconst_0        
	//    6    9:ireturn         
		Arrays.sort(aobj, ((Comparator) (mCallback)));
	//    7   10:aload_1         
	//    8   11:aload_0         
	//    9   12:getfield        #62  <Field SortedList$Callback mCallback>
	//   10   15:invokestatic    #194 <Method void Arrays.sort(Object[], Comparator)>
		int j = 1;
	//   11   18:iconst_1        
	//   12   19:istore_3        
		int i = 1;
	//   13   20:iconst_1        
	//   14   21:istore_2        
		for(; j < aobj.length; j++)
	//*  15   22:iload_3         
	//*  16   23:aload_1         
	//*  17   24:arraylength     
	//*  18   25:icmpge          121
		{
			Object obj = aobj[j];
	//   19   28:aload_1         
	//   20   29:iload_3         
	//   21   30:aaload          
	//   22   31:astore          6
			if(mCallback.compare(aobj[k], obj) == 0)
	//*  23   33:aload_0         
	//*  24   34:getfield        #62  <Field SortedList$Callback mCallback>
	//*  25   37:aload_1         
	//*  26   38:iload           4
	//*  27   40:aaload          
	//*  28   41:aload           6
	//*  29   43:invokevirtual   #143 <Method int SortedList$Callback.compare(Object, Object)>
	//*  30   46:ifne            93
			{
				int l = findSameItem(obj, aobj, k, i);
	//   31   49:aload_0         
	//   32   50:aload           6
	//   33   52:aload_1         
	//   34   53:iload           4
	//   35   55:iload_2         
	//   36   56:invokespecial   #196 <Method int findSameItem(Object, Object[], int, int)>
	//   37   59:istore          5
				if(l != -1)
	//*  38   61:iload           5
	//*  39   63:iconst_m1       
	//*  40   64:icmpeq          76
				{
					aobj[l] = obj;
	//   41   67:aload_1         
	//   42   68:iload           5
	//   43   70:aload           6
	//   44   72:aastore         
					continue;
	//   45   73:goto            114
				}
				if(i != j)
	//*  46   76:iload_2         
	//*  47   77:iload_3         
	//*  48   78:icmpeq          86
					aobj[i] = obj;
	//   49   81:aload_1         
	//   50   82:iload_2         
	//   51   83:aload           6
	//   52   85:aastore         
				i++;
	//   53   86:iload_2         
	//   54   87:iconst_1        
	//   55   88:iadd            
	//   56   89:istore_2        
				continue;
	//   57   90:goto            114
			}
			if(i != j)
	//*  58   93:iload_2         
	//*  59   94:iload_3         
	//*  60   95:icmpeq          103
				aobj[i] = obj;
	//   61   98:aload_1         
	//   62   99:iload_2         
	//   63  100:aload           6
	//   64  102:aastore         
			int i1 = i + 1;
	//   65  103:iload_2         
	//   66  104:iconst_1        
	//   67  105:iadd            
	//   68  106:istore          5
			k = i;
	//   69  108:iload_2         
	//   70  109:istore          4
			i = i1;
	//   71  111:iload           5
	//   72  113:istore_2        
		}

	//   73  114:iload_3         
	//   74  115:iconst_1        
	//   75  116:iadd            
	//   76  117:istore_3        
	//*  77  118:goto            22
		return i;
	//   78  121:iload_2         
	//   79  122:ireturn         
	}

	private void throwIfInMutationOperation()
	{
		if(mOldData != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #157 <Field Object[] mOldData>
	//*   2    4:ifnull          17
			throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
	//    3    7:new             #200 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #202 <String "Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.">
	//    6   13:invokespecial   #203 <Method void IllegalStateException(String)>
	//    7   16:athrow          
		else
			return;
	//    8   17:return          
	}

	public int add(Object obj)
	{
		throwIfInMutationOperation();
	//    0    0:aload_0         
	//    1    1:invokespecial   #206 <Method void throwIfInMutationOperation()>
		return add(obj, true);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:invokespecial   #208 <Method int add(Object, boolean)>
	//    6   10:ireturn         
	}

	public void addAll(Collection collection)
	{
		addAll(collection.toArray((Object[])Array.newInstance(mTClass, collection.size())), true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #51  <Field Class mTClass>
	//    4    6:aload_1         
	//    5    7:invokeinterface #217 <Method int Collection.size()>
	//    6   12:invokestatic    #57  <Method Object Array.newInstance(Class, int)>
	//    7   15:checkcast       #58  <Class Object[]>
	//    8   18:invokeinterface #220 <Method Object[] Collection.toArray(Object[])>
	//    9   23:iconst_1        
	//   10   24:invokevirtual   #223 <Method void addAll(Object[], boolean)>
	//   11   27:return          
	}

	public transient void addAll(Object aobj[])
	{
		addAll(aobj, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #223 <Method void addAll(Object[], boolean)>
	//    4    6:return          
	}

	public void addAll(Object aobj[], boolean flag)
	{
		throwIfInMutationOperation();
	//    0    0:aload_0         
	//    1    1:invokespecial   #206 <Method void throwIfInMutationOperation()>
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
	//   10   16:invokespecial   #226 <Method void addAllInternal(Object[])>
			return;
	//   11   19:return          
		} else
		{
			addAllInternal(copyArray(aobj));
	//   12   20:aload_0         
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:invokespecial   #228 <Method Object[] copyArray(Object[])>
	//   16   26:invokespecial   #226 <Method void addAllInternal(Object[])>
			return;
	//   17   29:return          
		}
	}

	public void beginBatchedUpdates()
	{
		throwIfInMutationOperation();
	//    0    0:aload_0         
	//    1    1:invokespecial   #206 <Method void throwIfInMutationOperation()>
		if(mCallback instanceof BatchedCallback)
	//*   2    4:aload_0         
	//*   3    5:getfield        #62  <Field SortedList$Callback mCallback>
	//*   4    8:instanceof      #7   <Class SortedList$BatchedCallback>
	//*   5   11:ifeq            15
			return;
	//    6   14:return          
		if(mBatchedCallback == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #231 <Field SortedList$BatchedCallback mBatchedCallback>
	//*   9   19:ifnonnull       37
			mBatchedCallback = new BatchedCallback(mCallback);
	//   10   22:aload_0         
	//   11   23:new             #7   <Class SortedList$BatchedCallback>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:getfield        #62  <Field SortedList$Callback mCallback>
	//   15   31:invokespecial   #234 <Method void SortedList$BatchedCallback(SortedList$Callback)>
	//   16   34:putfield        #231 <Field SortedList$BatchedCallback mBatchedCallback>
		mCallback = ((Callback) (mBatchedCallback));
	//   17   37:aload_0         
	//   18   38:aload_0         
	//   19   39:getfield        #231 <Field SortedList$BatchedCallback mBatchedCallback>
	//   20   42:putfield        #62  <Field SortedList$Callback mCallback>
	//   21   45:return          
	}

	public void clear()
	{
		throwIfInMutationOperation();
	//    0    0:aload_0         
	//    1    1:invokespecial   #206 <Method void throwIfInMutationOperation()>
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
	//   14   24:invokestatic    #239 <Method void Arrays.fill(Object[], int, int, Object)>
			mSize = 0;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #64  <Field int mSize>
			mCallback.onRemoved(0, i);
	//   18   32:aload_0         
	//   19   33:getfield        #62  <Field SortedList$Callback mCallback>
	//   20   36:iconst_0        
	//   21   37:iload_1         
	//   22   38:invokevirtual   #177 <Method void SortedList$Callback.onRemoved(int, int)>
			return;
	//   23   41:return          
		}
	}

	public void endBatchedUpdates()
	{
		throwIfInMutationOperation();
	//    0    0:aload_0         
	//    1    1:invokespecial   #206 <Method void throwIfInMutationOperation()>
		if(mCallback instanceof BatchedCallback)
	//*   2    4:aload_0         
	//*   3    5:getfield        #62  <Field SortedList$Callback mCallback>
	//*   4    8:instanceof      #7   <Class SortedList$BatchedCallback>
	//*   5   11:ifeq            24
			((BatchedCallback)mCallback).dispatchLastEvent();
	//    6   14:aload_0         
	//    7   15:getfield        #62  <Field SortedList$Callback mCallback>
	//    8   18:checkcast       #7   <Class SortedList$BatchedCallback>
	//    9   21:invokevirtual   #242 <Method void SortedList$BatchedCallback.dispatchLastEvent()>
		if(mCallback == mBatchedCallback)
	//*  10   24:aload_0         
	//*  11   25:getfield        #62  <Field SortedList$Callback mCallback>
	//*  12   28:aload_0         
	//*  13   29:getfield        #231 <Field SortedList$BatchedCallback mBatchedCallback>
	//*  14   32:if_acmpne       46
			mCallback = mBatchedCallback.mWrappedCallback;
	//   15   35:aload_0         
	//   16   36:aload_0         
	//   17   37:getfield        #231 <Field SortedList$BatchedCallback mBatchedCallback>
	//   18   40:getfield        #245 <Field SortedList$Callback SortedList$BatchedCallback.mWrappedCallback>
	//   19   43:putfield        #62  <Field SortedList$Callback mCallback>
	//   20   46:return          
	}

	public Object get(int i)
		throws IndexOutOfBoundsException
	{
		if(i < mSize && i >= 0)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #64  <Field int mSize>
	//*   3    5:icmpge          54
	//*   4    8:iload_1         
	//*   5    9:ifge            15
	//*   6   12:goto            54
		{
			if(mOldData != null && i >= mNewDataStart)
	//*   7   15:aload_0         
	//*   8   16:getfield        #157 <Field Object[] mOldData>
	//*   9   19:ifnull          47
	//*  10   22:iload_1         
	//*  11   23:aload_0         
	//*  12   24:getfield        #163 <Field int mNewDataStart>
	//*  13   27:icmplt          47
				return mOldData[(i - mNewDataStart) + mOldDataStart];
	//   14   30:aload_0         
	//   15   31:getfield        #157 <Field Object[] mOldData>
	//   16   34:iload_1         
	//   17   35:aload_0         
	//   18   36:getfield        #163 <Field int mNewDataStart>
	//   19   39:isub            
	//   20   40:aload_0         
	//   21   41:getfield        #159 <Field int mOldDataStart>
	//   22   44:iadd            
	//   23   45:aaload          
	//   24   46:areturn         
			else
				return mData[i];
	//   25   47:aload_0         
	//   26   48:getfield        #60  <Field Object[] mData>
	//   27   51:iload_1         
	//   28   52:aaload          
	//   29   53:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   30   54:new             #108 <Class StringBuilder>
	//   31   57:dup             
	//   32   58:invokespecial   #109 <Method void StringBuilder()>
	//   33   61:astore_2        
			stringbuilder.append("Asked to get item at ");
	//   34   62:aload_2         
	//   35   63:ldc1            #249 <String "Asked to get item at ">
	//   36   65:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   37   68:pop             
			stringbuilder.append(i);
	//   38   69:aload_2         
	//   39   70:iload_1         
	//   40   71:invokevirtual   #118 <Method StringBuilder StringBuilder.append(int)>
	//   41   74:pop             
			stringbuilder.append(" but size is ");
	//   42   75:aload_2         
	//   43   76:ldc1            #251 <String " but size is ">
	//   44   78:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   45   81:pop             
			stringbuilder.append(mSize);
	//   46   82:aload_2         
	//   47   83:aload_0         
	//   48   84:getfield        #64  <Field int mSize>
	//   49   87:invokevirtual   #118 <Method StringBuilder StringBuilder.append(int)>
	//   50   90:pop             
			throw new IndexOutOfBoundsException(stringbuilder.toString());
	//   51   91:new             #122 <Class IndexOutOfBoundsException>
	//   52   94:dup             
	//   53   95:aload_2         
	//   54   96:invokevirtual   #126 <Method String StringBuilder.toString()>
	//   55   99:invokespecial   #129 <Method void IndexOutOfBoundsException(String)>
	//   56  102:athrow          
		}
	}

	public int indexOf(Object obj)
	{
		if(mOldData != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #157 <Field Object[] mOldData>
	//*   2    4:ifnull          68
		{
			int i = findIndexOf(obj, mData, 0, mNewDataStart, 4);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #60  <Field Object[] mData>
	//    7   13:iconst_0        
	//    8   14:aload_0         
	//    9   15:getfield        #163 <Field int mNewDataStart>
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
	//   21   33:getfield        #157 <Field Object[] mOldData>
	//   22   36:aload_0         
	//   23   37:getfield        #159 <Field int mOldDataStart>
	//   24   40:aload_0         
	//   25   41:getfield        #161 <Field int mOldDataSize>
	//   26   44:iconst_4        
	//   27   45:invokespecial   #71  <Method int findIndexOf(Object, Object[], int, int, int)>
	//   28   48:istore_2        
			if(i != -1)
	//*  29   49:iload_2         
	//*  30   50:iconst_m1       
	//*  31   51:icmpeq          66
				return (i - mOldDataStart) + mNewDataStart;
	//   32   54:iload_2         
	//   33   55:aload_0         
	//   34   56:getfield        #159 <Field int mOldDataStart>
	//   35   59:isub            
	//   36   60:aload_0         
	//   37   61:getfield        #163 <Field int mNewDataStart>
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
		throwIfInMutationOperation();
	//    0    0:aload_0         
	//    1    1:invokespecial   #206 <Method void throwIfInMutationOperation()>
		Object obj = get(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #258 <Method Object get(int)>
	//    5    9:astore_3        
		removeItemAtIndex(i, false);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:iconst_0        
	//    9   13:invokespecial   #173 <Method void removeItemAtIndex(int, boolean)>
		int j = add(obj, false);
	//   10   16:aload_0         
	//   11   17:aload_3         
	//   12   18:iconst_0        
	//   13   19:invokespecial   #208 <Method int add(Object, boolean)>
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
	//   22   34:invokevirtual   #261 <Method void SortedList$Callback.onMoved(int, int)>
	//   23   37:return          
	}

	public boolean remove(Object obj)
	{
		throwIfInMutationOperation();
	//    0    0:aload_0         
	//    1    1:invokespecial   #206 <Method void throwIfInMutationOperation()>
		return remove(obj, true);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:invokespecial   #264 <Method boolean remove(Object, boolean)>
	//    6   10:ireturn         
	}

	public Object removeItemAt(int i)
	{
		throwIfInMutationOperation();
	//    0    0:aload_0         
	//    1    1:invokespecial   #206 <Method void throwIfInMutationOperation()>
		Object obj = get(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #258 <Method Object get(int)>
	//    5    9:astore_2        
		removeItemAtIndex(i, true);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:iconst_1        
	//    9   13:invokespecial   #173 <Method void removeItemAtIndex(int, boolean)>
		return obj;
	//   10   16:aload_2         
	//   11   17:areturn         
	}

	public void replaceAll(Collection collection)
	{
		replaceAll(collection.toArray((Object[])Array.newInstance(mTClass, collection.size())), true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #51  <Field Class mTClass>
	//    4    6:aload_1         
	//    5    7:invokeinterface #217 <Method int Collection.size()>
	//    6   12:invokestatic    #57  <Method Object Array.newInstance(Class, int)>
	//    7   15:checkcast       #58  <Class Object[]>
	//    8   18:invokeinterface #220 <Method Object[] Collection.toArray(Object[])>
	//    9   23:iconst_1        
	//   10   24:invokevirtual   #269 <Method void replaceAll(Object[], boolean)>
	//   11   27:return          
	}

	public transient void replaceAll(Object aobj[])
	{
		replaceAll(aobj, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #269 <Method void replaceAll(Object[], boolean)>
	//    4    6:return          
	}

	public void replaceAll(Object aobj[], boolean flag)
	{
		throwIfInMutationOperation();
	//    0    0:aload_0         
	//    1    1:invokespecial   #206 <Method void throwIfInMutationOperation()>
		if(flag)
	//*   2    4:iload_2         
	//*   3    5:ifeq            14
		{
			replaceAllInternal(aobj);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #271 <Method void replaceAllInternal(Object[])>
			return;
	//    7   13:return          
		} else
		{
			replaceAllInternal(copyArray(aobj));
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokespecial   #228 <Method Object[] copyArray(Object[])>
	//   12   20:invokespecial   #271 <Method void replaceAllInternal(Object[])>
			return;
	//   13   23:return          
		}
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
		throwIfInMutationOperation();
	//    0    0:aload_0         
	//    1    1:invokespecial   #206 <Method void throwIfInMutationOperation()>
		Object obj1 = get(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #258 <Method Object get(int)>
	//    5    9:astore          4
		boolean flag;
		if(obj1 != obj && mCallback.areContentsTheSame(obj1, obj))
	//*   6   11:aload           4
	//*   7   13:aload_2         
	//*   8   14:if_acmpeq       38
	//*   9   17:aload_0         
	//*  10   18:getfield        #62  <Field SortedList$Callback mCallback>
	//*  11   21:aload           4
	//*  12   23:aload_2         
	//*  13   24:invokevirtual   #78  <Method boolean SortedList$Callback.areContentsTheSame(Object, Object)>
	//*  14   27:ifne            33
	//*  15   30:goto            38
			flag = false;
	//   16   33:iconst_0        
	//   17   34:istore_3        
		else
	//*  18   35:goto            40
			flag = true;
	//   19   38:iconst_1        
	//   20   39:istore_3        
		if(obj1 != obj && mCallback.compare(obj1, obj) == 0)
	//*  21   40:aload           4
	//*  22   42:aload_2         
	//*  23   43:if_acmpeq       90
	//*  24   46:aload_0         
	//*  25   47:getfield        #62  <Field SortedList$Callback mCallback>
	//*  26   50:aload           4
	//*  27   52:aload_2         
	//*  28   53:invokevirtual   #143 <Method int SortedList$Callback.compare(Object, Object)>
	//*  29   56:ifne            90
		{
			mData[i] = obj;
	//   30   59:aload_0         
	//   31   60:getfield        #60  <Field Object[] mData>
	//   32   63:iload_1         
	//   33   64:aload_2         
	//   34   65:aastore         
			if(flag)
	//*  35   66:iload_3         
	//*  36   67:ifeq            89
				mCallback.onChanged(i, 1, mCallback.getChangePayload(obj1, obj));
	//   37   70:aload_0         
	//   38   71:getfield        #62  <Field SortedList$Callback mCallback>
	//   39   74:iload_1         
	//   40   75:iconst_1        
	//   41   76:aload_0         
	//   42   77:getfield        #62  <Field SortedList$Callback mCallback>
	//   43   80:aload           4
	//   44   82:aload_2         
	//   45   83:invokevirtual   #82  <Method Object SortedList$Callback.getChangePayload(Object, Object)>
	//   46   86:invokevirtual   #86  <Method void SortedList$Callback.onChanged(int, int, Object)>
			return;
	//   47   89:return          
		}
		if(flag)
	//*  48   90:iload_3         
	//*  49   91:ifeq            113
			mCallback.onChanged(i, 1, mCallback.getChangePayload(obj1, obj));
	//   50   94:aload_0         
	//   51   95:getfield        #62  <Field SortedList$Callback mCallback>
	//   52   98:iload_1         
	//   53   99:iconst_1        
	//   54  100:aload_0         
	//   55  101:getfield        #62  <Field SortedList$Callback mCallback>
	//   56  104:aload           4
	//   57  106:aload_2         
	//   58  107:invokevirtual   #82  <Method Object SortedList$Callback.getChangePayload(Object, Object)>
	//   59  110:invokevirtual   #86  <Method void SortedList$Callback.onChanged(int, int, Object)>
		removeItemAtIndex(i, false);
	//   60  113:aload_0         
	//   61  114:iload_1         
	//   62  115:iconst_0        
	//   63  116:invokespecial   #173 <Method void removeItemAtIndex(int, boolean)>
		int j = add(obj, false);
	//   64  119:aload_0         
	//   65  120:aload_2         
	//   66  121:iconst_0        
	//   67  122:invokespecial   #208 <Method int add(Object, boolean)>
	//   68  125:istore_3        
		if(i != j)
	//*  69  126:iload_1         
	//*  70  127:iload_3         
	//*  71  128:icmpeq          140
			mCallback.onMoved(i, j);
	//   72  131:aload_0         
	//   73  132:getfield        #62  <Field SortedList$Callback mCallback>
	//   74  135:iload_1         
	//   75  136:iload_3         
	//   76  137:invokevirtual   #261 <Method void SortedList$Callback.onMoved(int, int)>
	//   77  140:return          
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
	private int mNewDataStart;
	private Object mOldData[];
	private int mOldDataSize;
	private int mOldDataStart;
	private int mSize;
	private final Class mTClass;
}
