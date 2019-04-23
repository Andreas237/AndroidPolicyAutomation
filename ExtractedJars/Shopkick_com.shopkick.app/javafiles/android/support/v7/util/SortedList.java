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
	//    4    5:invokespecial   #44  <Method void SortedList(Class, SortedList$Callback, int)>
	//    5    8:return          
	}

	public SortedList(Class class1, Callback callback, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
		mTClass = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #53  <Field Class mTClass>
		mData = (Object[])Array.newInstance(class1, i);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:iload_3         
	//    8   12:invokestatic    #59  <Method Object Array.newInstance(Class, int)>
	//    9   15:checkcast       #60  <Class Object[]>
	//   10   18:putfield        #62  <Field Object[] mData>
		mCallback = callback;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #64  <Field SortedList$Callback mCallback>
		mSize = 0;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #66  <Field int mSize>
	//   17   31:return          
	}

	private int add(Object obj, boolean flag)
	{
		int j = findIndexOf(obj, mData, 0, mSize, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #62  <Field Object[] mData>
	//    4    6:iconst_0        
	//    5    7:aload_0         
	//    6    8:getfield        #66  <Field int mSize>
	//    7   11:iconst_1        
	//    8   12:invokespecial   #73  <Method int findIndexOf(Object, Object[], int, int, int)>
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
	//*  15   25:goto            122
		{
			i = j;
	//   16   28:iload           4
	//   17   30:istore_3        
			if(j < mSize)
	//*  18   31:iload           4
	//*  19   33:aload_0         
	//*  20   34:getfield        #66  <Field int mSize>
	//*  21   37:icmpge          122
			{
				Object obj1 = mData[j];
	//   22   40:aload_0         
	//   23   41:getfield        #62  <Field Object[] mData>
	//   24   44:iload           4
	//   25   46:aaload          
	//   26   47:astore          5
				i = j;
	//   27   49:iload           4
	//   28   51:istore_3        
				if(mCallback.areItemsTheSame(obj1, obj))
	//*  29   52:aload_0         
	//*  30   53:getfield        #64  <Field SortedList$Callback mCallback>
	//*  31   56:aload           5
	//*  32   58:aload_1         
	//*  33   59:invokevirtual   #77  <Method boolean SortedList$Callback.areItemsTheSame(Object, Object)>
	//*  34   62:ifeq            122
					if(mCallback.areContentsTheSame(obj1, obj))
	//*  35   65:aload_0         
	//*  36   66:getfield        #64  <Field SortedList$Callback mCallback>
	//*  37   69:aload           5
	//*  38   71:aload_1         
	//*  39   72:invokevirtual   #80  <Method boolean SortedList$Callback.areContentsTheSame(Object, Object)>
	//*  40   75:ifeq            89
					{
						mData[j] = obj;
	//   41   78:aload_0         
	//   42   79:getfield        #62  <Field Object[] mData>
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
	//   49   90:getfield        #62  <Field Object[] mData>
	//   50   93:iload           4
	//   51   95:aload_1         
	//   52   96:aastore         
						Callback callback = mCallback;
	//   53   97:aload_0         
	//   54   98:getfield        #64  <Field SortedList$Callback mCallback>
	//   55  101:astore          6
						callback.onChanged(j, 1, callback.getChangePayload(obj1, obj));
	//   56  103:aload           6
	//   57  105:iload           4
	//   58  107:iconst_1        
	//   59  108:aload           6
	//   60  110:aload           5
	//   61  112:aload_1         
	//   62  113:invokevirtual   #84  <Method Object SortedList$Callback.getChangePayload(Object, Object)>
	//   63  116:invokevirtual   #88  <Method void SortedList$Callback.onChanged(int, int, Object)>
						return j;
	//   64  119:iload           4
	//   65  121:ireturn         
					}
			}
		}
		addToData(i, obj);
	//   66  122:aload_0         
	//   67  123:iload_3         
	//   68  124:aload_1         
	//   69  125:invokespecial   #92  <Method void addToData(int, Object)>
		if(flag)
	//*  70  128:iload_2         
	//*  71  129:ifeq            141
			mCallback.onInserted(i, 1);
	//   72  132:aload_0         
	//   73  133:getfield        #64  <Field SortedList$Callback mCallback>
	//   74  136:iload_3         
	//   75  137:iconst_1        
	//   76  138:invokevirtual   #96  <Method void SortedList$Callback.onInserted(int, int)>
		return i;
	//   77  141:iload_3         
	//   78  142:ireturn         
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
	//    7    9:invokespecial   #103 <Method int sortAndDedup(Object[])>
	//    8   12:istore_2        
		if(mSize == 0)
	//*   9   13:aload_0         
	//*  10   14:getfield        #66  <Field int mSize>
	//*  11   17:ifne            40
		{
			mData = aobj;
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:putfield        #62  <Field Object[] mData>
			mSize = i;
	//   15   25:aload_0         
	//   16   26:iload_2         
	//   17   27:putfield        #66  <Field int mSize>
			mCallback.onInserted(0, i);
	//   18   30:aload_0         
	//   19   31:getfield        #64  <Field SortedList$Callback mCallback>
	//   20   34:iconst_0        
	//   21   35:iload_2         
	//   22   36:invokevirtual   #96  <Method void SortedList$Callback.onInserted(int, int)>
			return;
	//   23   39:return          
		} else
		{
			merge(aobj, i);
	//   24   40:aload_0         
	//   25   41:aload_1         
	//   26   42:iload_2         
	//   27   43:invokespecial   #107 <Method void merge(Object[], int)>
			return;
	//   28   46:return          
		}
	}

	private void addToData(int i, Object obj)
	{
		int j = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field int mSize>
	//    2    4:istore_3        
		if(i <= j)
	//*   3    5:iload_1         
	//*   4    6:iload_3         
	//*   5    7:icmpgt          118
		{
			Object aobj[] = mData;
	//    6   10:aload_0         
	//    7   11:getfield        #62  <Field Object[] mData>
	//    8   14:astore          4
			if(j == aobj.length)
	//*   9   16:iload_3         
	//*  10   17:aload           4
	//*  11   19:arraylength     
	//*  12   20:icmpne          86
			{
				aobj = (Object[])Array.newInstance(mTClass, aobj.length + 10);
	//   13   23:aload_0         
	//   14   24:getfield        #53  <Field Class mTClass>
	//   15   27:aload           4
	//   16   29:arraylength     
	//   17   30:bipush          10
	//   18   32:iadd            
	//   19   33:invokestatic    #59  <Method Object Array.newInstance(Class, int)>
	//   20   36:checkcast       #60  <Class Object[]>
	//   21   39:astore          4
				System.arraycopy(((Object) (mData)), 0, ((Object) (aobj)), 0, i);
	//   22   41:aload_0         
	//   23   42:getfield        #62  <Field Object[] mData>
	//   24   45:iconst_0        
	//   25   46:aload           4
	//   26   48:iconst_0        
	//   27   49:iload_1         
	//   28   50:invokestatic    #114 <Method void System.arraycopy(Object, int, Object, int, int)>
				aobj[i] = obj;
	//   29   53:aload           4
	//   30   55:iload_1         
	//   31   56:aload_2         
	//   32   57:aastore         
				System.arraycopy(((Object) (mData)), i, ((Object) (aobj)), i + 1, mSize - i);
	//   33   58:aload_0         
	//   34   59:getfield        #62  <Field Object[] mData>
	//   35   62:iload_1         
	//   36   63:aload           4
	//   37   65:iload_1         
	//   38   66:iconst_1        
	//   39   67:iadd            
	//   40   68:aload_0         
	//   41   69:getfield        #66  <Field int mSize>
	//   42   72:iload_1         
	//   43   73:isub            
	//   44   74:invokestatic    #114 <Method void System.arraycopy(Object, int, Object, int, int)>
				mData = aobj;
	//   45   77:aload_0         
	//   46   78:aload           4
	//   47   80:putfield        #62  <Field Object[] mData>
			} else
	//*  48   83:goto            107
			{
				System.arraycopy(((Object) (aobj)), i, ((Object) (aobj)), i + 1, j - i);
	//   49   86:aload           4
	//   50   88:iload_1         
	//   51   89:aload           4
	//   52   91:iload_1         
	//   53   92:iconst_1        
	//   54   93:iadd            
	//   55   94:iload_3         
	//   56   95:iload_1         
	//   57   96:isub            
	//   58   97:invokestatic    #114 <Method void System.arraycopy(Object, int, Object, int, int)>
				mData[i] = obj;
	//   59  100:aload_0         
	//   60  101:getfield        #62  <Field Object[] mData>
	//   61  104:iload_1         
	//   62  105:aload_2         
	//   63  106:aastore         
			}
			mSize = mSize + 1;
	//   64  107:aload_0         
	//   65  108:aload_0         
	//   66  109:getfield        #66  <Field int mSize>
	//   67  112:iconst_1        
	//   68  113:iadd            
	//   69  114:putfield        #66  <Field int mSize>
			return;
	//   70  117:return          
		} else
		{
			obj = ((Object) (new StringBuilder()));
	//   71  118:new             #116 <Class StringBuilder>
	//   72  121:dup             
	//   73  122:invokespecial   #117 <Method void StringBuilder()>
	//   74  125:astore_2        
			((StringBuilder) (obj)).append("cannot add item to ");
	//   75  126:aload_2         
	//   76  127:ldc1            #119 <String "cannot add item to ">
	//   77  129:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   78  132:pop             
			((StringBuilder) (obj)).append(i);
	//   79  133:aload_2         
	//   80  134:iload_1         
	//   81  135:invokevirtual   #126 <Method StringBuilder StringBuilder.append(int)>
	//   82  138:pop             
			((StringBuilder) (obj)).append(" because size is ");
	//   83  139:aload_2         
	//   84  140:ldc1            #128 <String " because size is ">
	//   85  142:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   86  145:pop             
			((StringBuilder) (obj)).append(mSize);
	//   87  146:aload_2         
	//   88  147:aload_0         
	//   89  148:getfield        #66  <Field int mSize>
	//   90  151:invokevirtual   #126 <Method StringBuilder StringBuilder.append(int)>
	//   91  154:pop             
			throw new IndexOutOfBoundsException(((StringBuilder) (obj)).toString());
	//   92  155:new             #130 <Class IndexOutOfBoundsException>
	//   93  158:dup             
	//   94  159:aload_2         
	//   95  160:invokevirtual   #134 <Method String StringBuilder.toString()>
	//   96  163:invokespecial   #137 <Method void IndexOutOfBoundsException(String)>
	//   97  166:athrow          
		}
	}

	private Object[] copyArray(Object aobj[])
	{
		Object aobj1[] = (Object[])Array.newInstance(mTClass, aobj.length);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Class mTClass>
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:invokestatic    #59  <Method Object Array.newInstance(Class, int)>
	//    5    9:checkcast       #60  <Class Object[]>
	//    6   12:astore_2        
		System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, aobj.length);
	//    7   13:aload_1         
	//    8   14:iconst_0        
	//    9   15:aload_2         
	//   10   16:iconst_0        
	//   11   17:aload_1         
	//   12   18:arraylength     
	//   13   19:invokestatic    #114 <Method void System.arraycopy(Object, int, Object, int, int)>
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
	//   16   24:getfield        #64  <Field SortedList$Callback mCallback>
	//   17   27:aload           8
	//   18   29:aload_1         
	//   19   30:invokevirtual   #145 <Method int SortedList$Callback.compare(Object, Object)>
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
	//*  31   54:getfield        #64  <Field SortedList$Callback mCallback>
	//*  32   57:aload           8
	//*  33   59:aload_1         
	//*  34   60:invokevirtual   #77  <Method boolean SortedList$Callback.areItemsTheSame(Object, Object)>
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
	//   43   75:invokespecial   #149 <Method int linearEqualitySearch(Object, int, int, int)>
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
	//*   4    7:getfield        #64  <Field SortedList$Callback mCallback>
	//*   5   10:aload_2         
	//*   6   11:iload_3         
	//*   7   12:aaload          
	//*   8   13:aload_1         
	//*   9   14:invokevirtual   #77  <Method boolean SortedList$Callback.areItemsTheSame(Object, Object)>
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
	//   10   15:getfield        #62  <Field Object[] mData>
	//   11   18:iload           6
	//   12   20:aaload          
	//   13   21:astore          7
			if(mCallback.compare(obj1, obj) != 0)
	//*  14   23:aload_0         
	//*  15   24:getfield        #64  <Field SortedList$Callback mCallback>
	//*  16   27:aload           7
	//*  17   29:aload_1         
	//*  18   30:invokevirtual   #145 <Method int SortedList$Callback.compare(Object, Object)>
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
	//*  24   43:getfield        #64  <Field SortedList$Callback mCallback>
	//*  25   46:aload           7
	//*  26   48:aload_1         
	//*  27   49:invokevirtual   #77  <Method boolean SortedList$Callback.areItemsTheSame(Object, Object)>
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
	//   44   79:getfield        #62  <Field Object[] mData>
	//   45   82:iload_2         
	//   46   83:aaload          
	//   47   84:astore          7
			if(mCallback.compare(obj2, obj) != 0)
	//*  48   86:aload_0         
	//*  49   87:getfield        #64  <Field SortedList$Callback mCallback>
	//*  50   90:aload           7
	//*  51   92:aload_1         
	//*  52   93:invokevirtual   #145 <Method int SortedList$Callback.compare(Object, Object)>
	//*  53   96:ifeq            102
				break;
	//   54   99:goto            120
			l = i;
	//   55  102:iload_2         
	//   56  103:istore          5
			if(mCallback.areItemsTheSame(obj2, obj))
	//*  57  105:aload_0         
	//*  58  106:getfield        #64  <Field SortedList$Callback mCallback>
	//*  59  109:aload           7
	//*  60  111:aload_1         
	//*  61  112:invokevirtual   #77  <Method boolean SortedList$Callback.areItemsTheSame(Object, Object)>
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
	//    1    1:getfield        #64  <Field SortedList$Callback mCallback>
	//    2    4:instanceof      #7   <Class SortedList$BatchedCallback>
	//    3    7:istore          7
		int j = 0;
	//    4    9:iconst_0        
	//    5   10:istore_3        
		boolean flag;
		if(!flag1)
	//*   6   11:iload           7
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
	//   16   31:invokevirtual   #157 <Method void beginBatchedUpdates()>
		mOldData = mData;
	//   17   34:aload_0         
	//   18   35:aload_0         
	//   19   36:getfield        #62  <Field Object[] mData>
	//   20   39:putfield        #159 <Field Object[] mOldData>
		mOldDataStart = 0;
	//   21   42:aload_0         
	//   22   43:iconst_0        
	//   23   44:putfield        #161 <Field int mOldDataStart>
		int k = mSize;
	//   24   47:aload_0         
	//   25   48:getfield        #66  <Field int mSize>
	//   26   51:istore          5
		mOldDataSize = k;
	//   27   53:aload_0         
	//   28   54:iload           5
	//   29   56:putfield        #163 <Field int mOldDataSize>
		mData = (Object[])Array.newInstance(mTClass, k + i + 10);
	//   30   59:aload_0         
	//   31   60:aload_0         
	//   32   61:getfield        #53  <Field Class mTClass>
	//   33   64:iload           5
	//   34   66:iload_2         
	//   35   67:iadd            
	//   36   68:bipush          10
	//   37   70:iadd            
	//   38   71:invokestatic    #59  <Method Object Array.newInstance(Class, int)>
	//   39   74:checkcast       #60  <Class Object[]>
	//   40   77:putfield        #62  <Field Object[] mData>
		mNewDataStart = 0;
	//   41   80:aload_0         
	//   42   81:iconst_0        
	//   43   82:putfield        #165 <Field int mNewDataStart>
		do
		{
			int l;
label0:
			{
				if(mOldDataStart < mOldDataSize || j < i)
	//*  44   85:aload_0         
	//*  45   86:getfield        #161 <Field int mOldDataStart>
	//*  46   89:aload_0         
	//*  47   90:getfield        #163 <Field int mOldDataSize>
	//*  48   93:icmplt          101
	//*  49   96:iload_3         
	//*  50   97:iload_2         
	//*  51   98:icmpge          214
				{
					l = mOldDataStart;
	//   52  101:aload_0         
	//   53  102:getfield        #161 <Field int mOldDataStart>
	//   54  105:istore          5
					int k1 = mOldDataSize;
	//   55  107:aload_0         
	//   56  108:getfield        #163 <Field int mOldDataSize>
	//   57  111:istore          6
					if(l == k1)
	//*  58  113:iload           5
	//*  59  115:iload           6
	//*  60  117:icmpne          175
					{
						i -= j;
	//   61  120:iload_2         
	//   62  121:iload_3         
	//   63  122:isub            
	//   64  123:istore_2        
						System.arraycopy(((Object) (aobj)), j, ((Object) (mData)), mNewDataStart, i);
	//   65  124:aload_1         
	//   66  125:iload_3         
	//   67  126:aload_0         
	//   68  127:getfield        #62  <Field Object[] mData>
	//   69  130:aload_0         
	//   70  131:getfield        #165 <Field int mNewDataStart>
	//   71  134:iload_2         
	//   72  135:invokestatic    #114 <Method void System.arraycopy(Object, int, Object, int, int)>
						mNewDataStart = mNewDataStart + i;
	//   73  138:aload_0         
	//   74  139:aload_0         
	//   75  140:getfield        #165 <Field int mNewDataStart>
	//   76  143:iload_2         
	//   77  144:iadd            
	//   78  145:putfield        #165 <Field int mNewDataStart>
						mSize = mSize + i;
	//   79  148:aload_0         
	//   80  149:aload_0         
	//   81  150:getfield        #66  <Field int mSize>
	//   82  153:iload_2         
	//   83  154:iadd            
	//   84  155:putfield        #66  <Field int mSize>
						mCallback.onInserted(mNewDataStart - i, i);
	//   85  158:aload_0         
	//   86  159:getfield        #64  <Field SortedList$Callback mCallback>
	//   87  162:aload_0         
	//   88  163:getfield        #165 <Field int mNewDataStart>
	//   89  166:iload_2         
	//   90  167:isub            
	//   91  168:iload_2         
	//   92  169:invokevirtual   #96  <Method void SortedList$Callback.onInserted(int, int)>
					} else
	//*  93  172:goto            214
					{
						if(j != i)
							break label0;
	//   94  175:iload_3         
	//   95  176:iload_2         
	//   96  177:icmpne          229
						i = k1 - l;
	//   97  180:iload           6
	//   98  182:iload           5
	//   99  184:isub            
	//  100  185:istore_2        
						System.arraycopy(((Object) (mOldData)), l, ((Object) (mData)), mNewDataStart, i);
	//  101  186:aload_0         
	//  102  187:getfield        #159 <Field Object[] mOldData>
	//  103  190:iload           5
	//  104  192:aload_0         
	//  105  193:getfield        #62  <Field Object[] mData>
	//  106  196:aload_0         
	//  107  197:getfield        #165 <Field int mNewDataStart>
	//  108  200:iload_2         
	//  109  201:invokestatic    #114 <Method void System.arraycopy(Object, int, Object, int, int)>
						mNewDataStart = mNewDataStart + i;
	//  110  204:aload_0         
	//  111  205:aload_0         
	//  112  206:getfield        #165 <Field int mNewDataStart>
	//  113  209:iload_2         
	//  114  210:iadd            
	//  115  211:putfield        #165 <Field int mNewDataStart>
					}
				}
				mOldData = null;
	//  116  214:aload_0         
	//  117  215:aconst_null     
	//  118  216:putfield        #159 <Field Object[] mOldData>
				if(flag)
	//* 119  219:iload           4
	//* 120  221:ifeq            228
					endBatchedUpdates();
	//  121  224:aload_0         
	//  122  225:invokevirtual   #168 <Method void endBatchedUpdates()>
				return;
	//  123  228:return          
			}
			Object obj = mOldData[l];
	//  124  229:aload_0         
	//  125  230:getfield        #159 <Field Object[] mOldData>
	//  126  233:iload           5
	//  127  235:aaload          
	//  128  236:astore          8
			Object obj1 = aobj[j];
	//  129  238:aload_1         
	//  130  239:iload_3         
	//  131  240:aaload          
	//  132  241:astore          9
			l = mCallback.compare(obj, obj1);
	//  133  243:aload_0         
	//  134  244:getfield        #64  <Field SortedList$Callback mCallback>
	//  135  247:aload           8
	//  136  249:aload           9
	//  137  251:invokevirtual   #145 <Method int SortedList$Callback.compare(Object, Object)>
	//  138  254:istore          5
			if(l > 0)
	//* 139  256:iload           5
	//* 140  258:ifle            319
			{
				obj = ((Object) (mData));
	//  141  261:aload_0         
	//  142  262:getfield        #62  <Field Object[] mData>
	//  143  265:astore          8
				l = mNewDataStart;
	//  144  267:aload_0         
	//  145  268:getfield        #165 <Field int mNewDataStart>
	//  146  271:istore          5
				mNewDataStart = l + 1;
	//  147  273:aload_0         
	//  148  274:iload           5
	//  149  276:iconst_1        
	//  150  277:iadd            
	//  151  278:putfield        #165 <Field int mNewDataStart>
				obj[l] = ((/*<invalid signature>*/java.lang.Object) (obj1));
	//  152  281:aload           8
	//  153  283:iload           5
	//  154  285:aload           9
	//  155  287:aastore         
				mSize = mSize + 1;
	//  156  288:aload_0         
	//  157  289:aload_0         
	//  158  290:getfield        #66  <Field int mSize>
	//  159  293:iconst_1        
	//  160  294:iadd            
	//  161  295:putfield        #66  <Field int mSize>
				j++;
	//  162  298:iload_3         
	//  163  299:iconst_1        
	//  164  300:iadd            
	//  165  301:istore_3        
				mCallback.onInserted(mNewDataStart - 1, 1);
	//  166  302:aload_0         
	//  167  303:getfield        #64  <Field SortedList$Callback mCallback>
	//  168  306:aload_0         
	//  169  307:getfield        #165 <Field int mNewDataStart>
	//  170  310:iconst_1        
	//  171  311:isub            
	//  172  312:iconst_1        
	//  173  313:invokevirtual   #96  <Method void SortedList$Callback.onInserted(int, int)>
			} else
	//* 174  316:goto            85
			if(l == 0 && mCallback.areItemsTheSame(obj, obj1))
	//* 175  319:iload           5
	//* 176  321:ifne            430
	//* 177  324:aload_0         
	//* 178  325:getfield        #64  <Field SortedList$Callback mCallback>
	//* 179  328:aload           8
	//* 180  330:aload           9
	//* 181  332:invokevirtual   #77  <Method boolean SortedList$Callback.areItemsTheSame(Object, Object)>
	//* 182  335:ifeq            430
			{
				Object aobj2[] = mData;
	//  183  338:aload_0         
	//  184  339:getfield        #62  <Field Object[] mData>
	//  185  342:astore          10
				int i1 = mNewDataStart;
	//  186  344:aload_0         
	//  187  345:getfield        #165 <Field int mNewDataStart>
	//  188  348:istore          5
				mNewDataStart = i1 + 1;
	//  189  350:aload_0         
	//  190  351:iload           5
	//  191  353:iconst_1        
	//  192  354:iadd            
	//  193  355:putfield        #165 <Field int mNewDataStart>
				aobj2[i1] = obj1;
	//  194  358:aload           10
	//  195  360:iload           5
	//  196  362:aload           9
	//  197  364:aastore         
				i1 = j + 1;
	//  198  365:iload_3         
	//  199  366:iconst_1        
	//  200  367:iadd            
	//  201  368:istore          5
				mOldDataStart = mOldDataStart + 1;
	//  202  370:aload_0         
	//  203  371:aload_0         
	//  204  372:getfield        #161 <Field int mOldDataStart>
	//  205  375:iconst_1        
	//  206  376:iadd            
	//  207  377:putfield        #161 <Field int mOldDataStart>
				j = i1;
	//  208  380:iload           5
	//  209  382:istore_3        
				if(!mCallback.areContentsTheSame(obj, obj1))
	//* 210  383:aload_0         
	//* 211  384:getfield        #64  <Field SortedList$Callback mCallback>
	//* 212  387:aload           8
	//* 213  389:aload           9
	//* 214  391:invokevirtual   #80  <Method boolean SortedList$Callback.areContentsTheSame(Object, Object)>
	//* 215  394:ifne            85
				{
					Callback callback = mCallback;
	//  216  397:aload_0         
	//  217  398:getfield        #64  <Field SortedList$Callback mCallback>
	//  218  401:astore          10
					callback.onChanged(mNewDataStart - 1, 1, callback.getChangePayload(obj, obj1));
	//  219  403:aload           10
	//  220  405:aload_0         
	//  221  406:getfield        #165 <Field int mNewDataStart>
	//  222  409:iconst_1        
	//  223  410:isub            
	//  224  411:iconst_1        
	//  225  412:aload           10
	//  226  414:aload           8
	//  227  416:aload           9
	//  228  418:invokevirtual   #84  <Method Object SortedList$Callback.getChangePayload(Object, Object)>
	//  229  421:invokevirtual   #88  <Method void SortedList$Callback.onChanged(int, int, Object)>
					j = i1;
	//  230  424:iload           5
	//  231  426:istore_3        
				}
			} else
	//* 232  427:goto            85
			{
				Object aobj1[] = mData;
	//  233  430:aload_0         
	//  234  431:getfield        #62  <Field Object[] mData>
	//  235  434:astore          9
				int j1 = mNewDataStart;
	//  236  436:aload_0         
	//  237  437:getfield        #165 <Field int mNewDataStart>
	//  238  440:istore          5
				mNewDataStart = j1 + 1;
	//  239  442:aload_0         
	//  240  443:iload           5
	//  241  445:iconst_1        
	//  242  446:iadd            
	//  243  447:putfield        #165 <Field int mNewDataStart>
				aobj1[j1] = obj;
	//  244  450:aload           9
	//  245  452:iload           5
	//  246  454:aload           8
	//  247  456:aastore         
				mOldDataStart = mOldDataStart + 1;
	//  248  457:aload_0         
	//  249  458:aload_0         
	//  250  459:getfield        #161 <Field int mOldDataStart>
	//  251  462:iconst_1        
	//  252  463:iadd            
	//  253  464:putfield        #161 <Field int mOldDataStart>
			}
		} while(true);
	//  254  467:goto            85
	}

	private boolean remove(Object obj, boolean flag)
	{
		int i = findIndexOf(obj, mData, 0, mSize, 2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #62  <Field Object[] mData>
	//    4    6:iconst_0        
	//    5    7:aload_0         
	//    6    8:getfield        #66  <Field int mSize>
	//    7   11:iconst_2        
	//    8   12:invokespecial   #73  <Method int findIndexOf(Object, Object[], int, int, int)>
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
	//   18   26:invokespecial   #175 <Method void removeItemAtIndex(int, boolean)>
			return true;
	//   19   29:iconst_1        
	//   20   30:ireturn         
		}
	}

	private void removeItemAtIndex(int i, boolean flag)
	{
		Object aobj[] = mData;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Object[] mData>
	//    2    4:astore_3        
		System.arraycopy(((Object) (aobj)), i + 1, ((Object) (aobj)), i, mSize - i - 1);
	//    3    5:aload_3         
	//    4    6:iload_1         
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:aload_3         
	//    8   10:iload_1         
	//    9   11:aload_0         
	//   10   12:getfield        #66  <Field int mSize>
	//   11   15:iload_1         
	//   12   16:isub            
	//   13   17:iconst_1        
	//   14   18:isub            
	//   15   19:invokestatic    #114 <Method void System.arraycopy(Object, int, Object, int, int)>
		mSize = mSize - 1;
	//   16   22:aload_0         
	//   17   23:aload_0         
	//   18   24:getfield        #66  <Field int mSize>
	//   19   27:iconst_1        
	//   20   28:isub            
	//   21   29:putfield        #66  <Field int mSize>
		mData[mSize] = null;
	//   22   32:aload_0         
	//   23   33:getfield        #62  <Field Object[] mData>
	//   24   36:aload_0         
	//   25   37:getfield        #66  <Field int mSize>
	//   26   40:aconst_null     
	//   27   41:aastore         
		if(flag)
	//*  28   42:iload_2         
	//*  29   43:ifeq            55
			mCallback.onRemoved(i, 1);
	//   30   46:aload_0         
	//   31   47:getfield        #64  <Field SortedList$Callback mCallback>
	//   32   50:iload_1         
	//   33   51:iconst_1        
	//   34   52:invokevirtual   #179 <Method void SortedList$Callback.onRemoved(int, int)>
	//   35   55:return          
	}

	private void replaceAllInsert(Object obj)
	{
		Object aobj[] = mData;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Object[] mData>
	//    2    4:astore_3        
		int i = mNewDataStart;
	//    3    5:aload_0         
	//    4    6:getfield        #165 <Field int mNewDataStart>
	//    5    9:istore_2        
		aobj[i] = obj;
	//    6   10:aload_3         
	//    7   11:iload_2         
	//    8   12:aload_1         
	//    9   13:aastore         
		mNewDataStart = i + 1;
	//   10   14:aload_0         
	//   11   15:iload_2         
	//   12   16:iconst_1        
	//   13   17:iadd            
	//   14   18:putfield        #165 <Field int mNewDataStart>
		mSize = mSize + 1;
	//   15   21:aload_0         
	//   16   22:aload_0         
	//   17   23:getfield        #66  <Field int mSize>
	//   18   26:iconst_1        
	//   19   27:iadd            
	//   20   28:putfield        #66  <Field int mSize>
		mCallback.onInserted(mNewDataStart - 1, 1);
	//   21   31:aload_0         
	//   22   32:getfield        #64  <Field SortedList$Callback mCallback>
	//   23   35:aload_0         
	//   24   36:getfield        #165 <Field int mNewDataStart>
	//   25   39:iconst_1        
	//   26   40:isub            
	//   27   41:iconst_1        
	//   28   42:invokevirtual   #96  <Method void SortedList$Callback.onInserted(int, int)>
	//   29   45:return          
	}

	private void replaceAllInternal(Object aobj[])
	{
		boolean flag;
		if(!(mCallback instanceof BatchedCallback))
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field SortedList$Callback mCallback>
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
	//   12   22:invokevirtual   #157 <Method void beginBatchedUpdates()>
		mOldDataStart = 0;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #161 <Field int mOldDataStart>
		mOldDataSize = mSize;
	//   16   30:aload_0         
	//   17   31:aload_0         
	//   18   32:getfield        #66  <Field int mSize>
	//   19   35:putfield        #163 <Field int mOldDataSize>
		mOldData = mData;
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:getfield        #62  <Field Object[] mData>
	//   23   43:putfield        #159 <Field Object[] mOldData>
		mNewDataStart = 0;
	//   24   46:aload_0         
	//   25   47:iconst_0        
	//   26   48:putfield        #165 <Field int mNewDataStart>
		int i = sortAndDedup(aobj);
	//   27   51:aload_0         
	//   28   52:aload_1         
	//   29   53:invokespecial   #103 <Method int sortAndDedup(Object[])>
	//   30   56:istore_3        
		mData = (Object[])Array.newInstance(mTClass, i);
	//   31   57:aload_0         
	//   32   58:aload_0         
	//   33   59:getfield        #53  <Field Class mTClass>
	//   34   62:iload_3         
	//   35   63:invokestatic    #59  <Method Object Array.newInstance(Class, int)>
	//   36   66:checkcast       #60  <Class Object[]>
	//   37   69:putfield        #62  <Field Object[] mData>
		do
		{
			int k;
			int i1;
label0:
			{
				if(mNewDataStart < i || mOldDataStart < mOldDataSize)
	//*  38   72:aload_0         
	//*  39   73:getfield        #165 <Field int mNewDataStart>
	//*  40   76:iload_3         
	//*  41   77:icmplt          91
	//*  42   80:aload_0         
	//*  43   81:getfield        #161 <Field int mOldDataStart>
	//*  44   84:aload_0         
	//*  45   85:getfield        #163 <Field int mOldDataSize>
	//*  46   88:icmpge          205
				{
					i1 = mOldDataStart;
	//   47   91:aload_0         
	//   48   92:getfield        #161 <Field int mOldDataStart>
	//   49   95:istore          5
					int j1 = mOldDataSize;
	//   50   97:aload_0         
	//   51   98:getfield        #163 <Field int mOldDataSize>
	//   52  101:istore          6
					if(i1 >= j1)
	//*  53  103:iload           5
	//*  54  105:iload           6
	//*  55  107:icmplt          167
					{
						int j = mNewDataStart;
	//   56  110:aload_0         
	//   57  111:getfield        #165 <Field int mNewDataStart>
	//   58  114:istore          4
						i -= j;
	//   59  116:iload_3         
	//   60  117:iload           4
	//   61  119:isub            
	//   62  120:istore_3        
						System.arraycopy(((Object) (aobj)), j, ((Object) (mData)), j, i);
	//   63  121:aload_1         
	//   64  122:iload           4
	//   65  124:aload_0         
	//   66  125:getfield        #62  <Field Object[] mData>
	//   67  128:iload           4
	//   68  130:iload_3         
	//   69  131:invokestatic    #114 <Method void System.arraycopy(Object, int, Object, int, int)>
						mNewDataStart = mNewDataStart + i;
	//   70  134:aload_0         
	//   71  135:aload_0         
	//   72  136:getfield        #165 <Field int mNewDataStart>
	//   73  139:iload_3         
	//   74  140:iadd            
	//   75  141:putfield        #165 <Field int mNewDataStart>
						mSize = mSize + i;
	//   76  144:aload_0         
	//   77  145:aload_0         
	//   78  146:getfield        #66  <Field int mSize>
	//   79  149:iload_3         
	//   80  150:iadd            
	//   81  151:putfield        #66  <Field int mSize>
						mCallback.onInserted(j, i);
	//   82  154:aload_0         
	//   83  155:getfield        #64  <Field SortedList$Callback mCallback>
	//   84  158:iload           4
	//   85  160:iload_3         
	//   86  161:invokevirtual   #96  <Method void SortedList$Callback.onInserted(int, int)>
					} else
	//*  87  164:goto            205
					{
						k = mNewDataStart;
	//   88  167:aload_0         
	//   89  168:getfield        #165 <Field int mNewDataStart>
	//   90  171:istore          4
						if(k < i)
							break label0;
	//   91  173:iload           4
	//   92  175:iload_3         
	//   93  176:icmplt          219
						i = j1 - i1;
	//   94  179:iload           6
	//   95  181:iload           5
	//   96  183:isub            
	//   97  184:istore_3        
						mSize = mSize - i;
	//   98  185:aload_0         
	//   99  186:aload_0         
	//  100  187:getfield        #66  <Field int mSize>
	//  101  190:iload_3         
	//  102  191:isub            
	//  103  192:putfield        #66  <Field int mSize>
						mCallback.onRemoved(k, i);
	//  104  195:aload_0         
	//  105  196:getfield        #64  <Field SortedList$Callback mCallback>
	//  106  199:iload           4
	//  107  201:iload_3         
	//  108  202:invokevirtual   #179 <Method void SortedList$Callback.onRemoved(int, int)>
					}
				}
				mOldData = null;
	//  109  205:aload_0         
	//  110  206:aconst_null     
	//  111  207:putfield        #159 <Field Object[] mOldData>
				if(flag)
	//* 112  210:iload_2         
	//* 113  211:ifeq            218
					endBatchedUpdates();
	//  114  214:aload_0         
	//  115  215:invokevirtual   #168 <Method void endBatchedUpdates()>
				return;
	//  116  218:return          
			}
			Object obj = mOldData[i1];
	//  117  219:aload_0         
	//  118  220:getfield        #159 <Field Object[] mOldData>
	//  119  223:iload           5
	//  120  225:aaload          
	//  121  226:astore          7
			Object obj1 = aobj[k];
	//  122  228:aload_1         
	//  123  229:iload           4
	//  124  231:aaload          
	//  125  232:astore          8
			k = mCallback.compare(obj, obj1);
	//  126  234:aload_0         
	//  127  235:getfield        #64  <Field SortedList$Callback mCallback>
	//  128  238:aload           7
	//  129  240:aload           8
	//  130  242:invokevirtual   #145 <Method int SortedList$Callback.compare(Object, Object)>
	//  131  245:istore          4
			if(k < 0)
	//* 132  247:iload           4
	//* 133  249:ifge            259
				replaceAllRemove();
	//  134  252:aload_0         
	//  135  253:invokespecial   #186 <Method void replaceAllRemove()>
			else
	//* 136  256:goto            72
			if(k > 0)
	//* 137  259:iload           4
	//* 138  261:ifle            273
				replaceAllInsert(obj1);
	//  139  264:aload_0         
	//  140  265:aload           8
	//  141  267:invokespecial   #188 <Method void replaceAllInsert(Object)>
			else
	//* 142  270:goto            72
			if(!mCallback.areItemsTheSame(obj, obj1))
	//* 143  273:aload_0         
	//* 144  274:getfield        #64  <Field SortedList$Callback mCallback>
	//* 145  277:aload           7
	//* 146  279:aload           8
	//* 147  281:invokevirtual   #77  <Method boolean SortedList$Callback.areItemsTheSame(Object, Object)>
	//* 148  284:ifne            300
			{
				replaceAllRemove();
	//  149  287:aload_0         
	//  150  288:invokespecial   #186 <Method void replaceAllRemove()>
				replaceAllInsert(obj1);
	//  151  291:aload_0         
	//  152  292:aload           8
	//  153  294:invokespecial   #188 <Method void replaceAllInsert(Object)>
			} else
	//* 154  297:goto            72
			{
				Object aobj1[] = mData;
	//  155  300:aload_0         
	//  156  301:getfield        #62  <Field Object[] mData>
	//  157  304:astore          9
				int l = mNewDataStart;
	//  158  306:aload_0         
	//  159  307:getfield        #165 <Field int mNewDataStart>
	//  160  310:istore          4
				aobj1[l] = obj1;
	//  161  312:aload           9
	//  162  314:iload           4
	//  163  316:aload           8
	//  164  318:aastore         
				mOldDataStart = mOldDataStart + 1;
	//  165  319:aload_0         
	//  166  320:aload_0         
	//  167  321:getfield        #161 <Field int mOldDataStart>
	//  168  324:iconst_1        
	//  169  325:iadd            
	//  170  326:putfield        #161 <Field int mOldDataStart>
				mNewDataStart = l + 1;
	//  171  329:aload_0         
	//  172  330:iload           4
	//  173  332:iconst_1        
	//  174  333:iadd            
	//  175  334:putfield        #165 <Field int mNewDataStart>
				if(!mCallback.areContentsTheSame(obj, obj1))
	//* 176  337:aload_0         
	//* 177  338:getfield        #64  <Field SortedList$Callback mCallback>
	//* 178  341:aload           7
	//* 179  343:aload           8
	//* 180  345:invokevirtual   #80  <Method boolean SortedList$Callback.areContentsTheSame(Object, Object)>
	//* 181  348:ifne            72
				{
					Callback callback = mCallback;
	//  182  351:aload_0         
	//  183  352:getfield        #64  <Field SortedList$Callback mCallback>
	//  184  355:astore          9
					callback.onChanged(mNewDataStart - 1, 1, callback.getChangePayload(obj, obj1));
	//  185  357:aload           9
	//  186  359:aload_0         
	//  187  360:getfield        #165 <Field int mNewDataStart>
	//  188  363:iconst_1        
	//  189  364:isub            
	//  190  365:iconst_1        
	//  191  366:aload           9
	//  192  368:aload           7
	//  193  370:aload           8
	//  194  372:invokevirtual   #84  <Method Object SortedList$Callback.getChangePayload(Object, Object)>
	//  195  375:invokevirtual   #88  <Method void SortedList$Callback.onChanged(int, int, Object)>
				}
			}
		} while(true);
	//  196  378:goto            72
	}

	private void replaceAllRemove()
	{
		mSize = mSize - 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #66  <Field int mSize>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:putfield        #66  <Field int mSize>
		mOldDataStart = mOldDataStart + 1;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #161 <Field int mOldDataStart>
	//    9   15:iconst_1        
	//   10   16:iadd            
	//   11   17:putfield        #161 <Field int mOldDataStart>
		mCallback.onRemoved(mNewDataStart, 1);
	//   12   20:aload_0         
	//   13   21:getfield        #64  <Field SortedList$Callback mCallback>
	//   14   24:aload_0         
	//   15   25:getfield        #165 <Field int mNewDataStart>
	//   16   28:iconst_1        
	//   17   29:invokevirtual   #179 <Method void SortedList$Callback.onRemoved(int, int)>
	//   18   32:return          
	}

	private int sortAndDedup(Object aobj[])
	{
		if(aobj.length == 0)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:ifne            7
			return 0;
	//    3    5:iconst_0        
	//    4    6:ireturn         
		Arrays.sort(aobj, ((Comparator) (mCallback)));
	//    5    7:aload_1         
	//    6    8:aload_0         
	//    7    9:getfield        #64  <Field SortedList$Callback mCallback>
	//    8   12:invokestatic    #194 <Method void Arrays.sort(Object[], Comparator)>
		int j = 1;
	//    9   15:iconst_1        
	//   10   16:istore_3        
		int k = 0;
	//   11   17:iconst_0        
	//   12   18:istore          4
		int i = 1;
	//   13   20:iconst_1        
	//   14   21:istore_2        
		for(; j < aobj.length; j++)
	//*  15   22:iload_3         
	//*  16   23:aload_1         
	//*  17   24:arraylength     
	//*  18   25:icmpge          117
		{
			Object obj = aobj[j];
	//   19   28:aload_1         
	//   20   29:iload_3         
	//   21   30:aaload          
	//   22   31:astore          6
			if(mCallback.compare(aobj[k], obj) == 0)
	//*  23   33:aload_0         
	//*  24   34:getfield        #64  <Field SortedList$Callback mCallback>
	//*  25   37:aload_1         
	//*  26   38:iload           4
	//*  27   40:aaload          
	//*  28   41:aload           6
	//*  29   43:invokevirtual   #145 <Method int SortedList$Callback.compare(Object, Object)>
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
	//   45   73:goto            110
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
	//   57   90:goto            110
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
			k = i;
	//   65  103:iload_2         
	//   66  104:istore          4
			i++;
	//   67  106:iload_2         
	//   68  107:iconst_1        
	//   69  108:iadd            
	//   70  109:istore_2        
		}

	//   71  110:iload_3         
	//   72  111:iconst_1        
	//   73  112:iadd            
	//   74  113:istore_3        
	//*  75  114:goto            22
		return i;
	//   76  117:iload_2         
	//   77  118:ireturn         
	}

	private void throwIfInMutationOperation()
	{
		if(mOldData == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #159 <Field Object[] mOldData>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		else
			throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
	//    4    8:new             #200 <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:ldc1            #202 <String "Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.">
	//    7   14:invokespecial   #203 <Method void IllegalStateException(String)>
	//    8   17:athrow          
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
	//    3    3:getfield        #53  <Field Class mTClass>
	//    4    6:aload_1         
	//    5    7:invokeinterface #217 <Method int Collection.size()>
	//    6   12:invokestatic    #59  <Method Object Array.newInstance(Class, int)>
	//    7   15:checkcast       #60  <Class Object[]>
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
		Callback callback = mCallback;
	//    2    4:aload_0         
	//    3    5:getfield        #64  <Field SortedList$Callback mCallback>
	//    4    8:astore_1        
		if(callback instanceof BatchedCallback)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #7   <Class SortedList$BatchedCallback>
	//*   7   13:ifeq            17
			return;
	//    8   16:return          
		if(mBatchedCallback == null)
	//*   9   17:aload_0         
	//*  10   18:getfield        #231 <Field SortedList$BatchedCallback mBatchedCallback>
	//*  11   21:ifnonnull       36
			mBatchedCallback = new BatchedCallback(callback);
	//   12   24:aload_0         
	//   13   25:new             #7   <Class SortedList$BatchedCallback>
	//   14   28:dup             
	//   15   29:aload_1         
	//   16   30:invokespecial   #234 <Method void SortedList$BatchedCallback(SortedList$Callback)>
	//   17   33:putfield        #231 <Field SortedList$BatchedCallback mBatchedCallback>
		mCallback = ((Callback) (mBatchedCallback));
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:getfield        #231 <Field SortedList$BatchedCallback mBatchedCallback>
	//   21   41:putfield        #64  <Field SortedList$Callback mCallback>
	//   22   44:return          
	}

	public void clear()
	{
		throwIfInMutationOperation();
	//    0    0:aload_0         
	//    1    1:invokespecial   #206 <Method void throwIfInMutationOperation()>
		int i = mSize;
	//    2    4:aload_0         
	//    3    5:getfield        #66  <Field int mSize>
	//    4    8:istore_1        
		if(i == 0)
	//*   5    9:iload_1         
	//*   6   10:ifne            14
		{
			return;
	//    7   13:return          
		} else
		{
			Arrays.fill(mData, 0, i, ((Object) (null)));
	//    8   14:aload_0         
	//    9   15:getfield        #62  <Field Object[] mData>
	//   10   18:iconst_0        
	//   11   19:iload_1         
	//   12   20:aconst_null     
	//   13   21:invokestatic    #239 <Method void Arrays.fill(Object[], int, int, Object)>
			mSize = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #66  <Field int mSize>
			mCallback.onRemoved(0, i);
	//   17   29:aload_0         
	//   18   30:getfield        #64  <Field SortedList$Callback mCallback>
	//   19   33:iconst_0        
	//   20   34:iload_1         
	//   21   35:invokevirtual   #179 <Method void SortedList$Callback.onRemoved(int, int)>
			return;
	//   22   38:return          
		}
	}

	public void endBatchedUpdates()
	{
		throwIfInMutationOperation();
	//    0    0:aload_0         
	//    1    1:invokespecial   #206 <Method void throwIfInMutationOperation()>
		Callback callback = mCallback;
	//    2    4:aload_0         
	//    3    5:getfield        #64  <Field SortedList$Callback mCallback>
	//    4    8:astore_1        
		if(callback instanceof BatchedCallback)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #7   <Class SortedList$BatchedCallback>
	//*   7   13:ifeq            23
			((BatchedCallback)callback).dispatchLastEvent();
	//    8   16:aload_1         
	//    9   17:checkcast       #7   <Class SortedList$BatchedCallback>
	//   10   20:invokevirtual   #242 <Method void SortedList$BatchedCallback.dispatchLastEvent()>
		callback = mCallback;
	//   11   23:aload_0         
	//   12   24:getfield        #64  <Field SortedList$Callback mCallback>
	//   13   27:astore_1        
		BatchedCallback batchedcallback = mBatchedCallback;
	//   14   28:aload_0         
	//   15   29:getfield        #231 <Field SortedList$BatchedCallback mBatchedCallback>
	//   16   32:astore_2        
		if(callback == batchedcallback)
	//*  17   33:aload_1         
	//*  18   34:aload_2         
	//*  19   35:if_acmpne       46
			mCallback = batchedcallback.mWrappedCallback;
	//   20   38:aload_0         
	//   21   39:aload_2         
	//   22   40:getfield        #245 <Field SortedList$Callback SortedList$BatchedCallback.mWrappedCallback>
	//   23   43:putfield        #64  <Field SortedList$Callback mCallback>
	//   24   46:return          
	}

	public Object get(int i)
		throws IndexOutOfBoundsException
	{
		if(i < mSize && i >= 0)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #66  <Field int mSize>
	//*   3    5:icmpge          49
	//*   4    8:iload_1         
	//*   5    9:iflt            49
		{
			Object aobj[] = mOldData;
	//    6   12:aload_0         
	//    7   13:getfield        #159 <Field Object[] mOldData>
	//    8   16:astore_3        
			if(aobj != null)
	//*   9   17:aload_3         
	//*  10   18:ifnull          42
			{
				int j = mNewDataStart;
	//   11   21:aload_0         
	//   12   22:getfield        #165 <Field int mNewDataStart>
	//   13   25:istore_2        
				if(i >= j)
	//*  14   26:iload_1         
	//*  15   27:iload_2         
	//*  16   28:icmplt          42
					return aobj[(i - j) + mOldDataStart];
	//   17   31:aload_3         
	//   18   32:iload_1         
	//   19   33:iload_2         
	//   20   34:isub            
	//   21   35:aload_0         
	//   22   36:getfield        #161 <Field int mOldDataStart>
	//   23   39:iadd            
	//   24   40:aaload          
	//   25   41:areturn         
			}
			return mData[i];
	//   26   42:aload_0         
	//   27   43:getfield        #62  <Field Object[] mData>
	//   28   46:iload_1         
	//   29   47:aaload          
	//   30   48:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   31   49:new             #116 <Class StringBuilder>
	//   32   52:dup             
	//   33   53:invokespecial   #117 <Method void StringBuilder()>
	//   34   56:astore_3        
			stringbuilder.append("Asked to get item at ");
	//   35   57:aload_3         
	//   36   58:ldc1            #249 <String "Asked to get item at ">
	//   37   60:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   38   63:pop             
			stringbuilder.append(i);
	//   39   64:aload_3         
	//   40   65:iload_1         
	//   41   66:invokevirtual   #126 <Method StringBuilder StringBuilder.append(int)>
	//   42   69:pop             
			stringbuilder.append(" but size is ");
	//   43   70:aload_3         
	//   44   71:ldc1            #251 <String " but size is ">
	//   45   73:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   46   76:pop             
			stringbuilder.append(mSize);
	//   47   77:aload_3         
	//   48   78:aload_0         
	//   49   79:getfield        #66  <Field int mSize>
	//   50   82:invokevirtual   #126 <Method StringBuilder StringBuilder.append(int)>
	//   51   85:pop             
			throw new IndexOutOfBoundsException(stringbuilder.toString());
	//   52   86:new             #130 <Class IndexOutOfBoundsException>
	//   53   89:dup             
	//   54   90:aload_3         
	//   55   91:invokevirtual   #134 <Method String StringBuilder.toString()>
	//   56   94:invokespecial   #137 <Method void IndexOutOfBoundsException(String)>
	//   57   97:athrow          
		}
	}

	public int indexOf(Object obj)
	{
		if(mOldData != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #159 <Field Object[] mOldData>
	//*   2    4:ifnull          68
		{
			int i = findIndexOf(obj, mData, 0, mNewDataStart, 4);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #62  <Field Object[] mData>
	//    7   13:iconst_0        
	//    8   14:aload_0         
	//    9   15:getfield        #165 <Field int mNewDataStart>
	//   10   18:iconst_4        
	//   11   19:invokespecial   #73  <Method int findIndexOf(Object, Object[], int, int, int)>
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
	//   21   33:getfield        #159 <Field Object[] mOldData>
	//   22   36:aload_0         
	//   23   37:getfield        #161 <Field int mOldDataStart>
	//   24   40:aload_0         
	//   25   41:getfield        #163 <Field int mOldDataSize>
	//   26   44:iconst_4        
	//   27   45:invokespecial   #73  <Method int findIndexOf(Object, Object[], int, int, int)>
	//   28   48:istore_2        
			if(i != -1)
	//*  29   49:iload_2         
	//*  30   50:iconst_m1       
	//*  31   51:icmpeq          66
				return (i - mOldDataStart) + mNewDataStart;
	//   32   54:iload_2         
	//   33   55:aload_0         
	//   34   56:getfield        #161 <Field int mOldDataStart>
	//   35   59:isub            
	//   36   60:aload_0         
	//   37   61:getfield        #165 <Field int mNewDataStart>
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
	//   45   71:getfield        #62  <Field Object[] mData>
	//   46   74:iconst_0        
	//   47   75:aload_0         
	//   48   76:getfield        #66  <Field int mSize>
	//   49   79:iconst_4        
	//   50   80:invokespecial   #73  <Method int findIndexOf(Object, Object[], int, int, int)>
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
	//    9   13:invokespecial   #175 <Method void removeItemAtIndex(int, boolean)>
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
	//   19   29:getfield        #64  <Field SortedList$Callback mCallback>
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
	//    9   13:invokespecial   #175 <Method void removeItemAtIndex(int, boolean)>
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
	//    3    3:getfield        #53  <Field Class mTClass>
	//    4    6:aload_1         
	//    5    7:invokeinterface #217 <Method int Collection.size()>
	//    6   12:invokestatic    #59  <Method Object Array.newInstance(Class, int)>
	//    7   15:checkcast       #60  <Class Object[]>
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
	//    1    1:getfield        #66  <Field int mSize>
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
	//*  10   18:getfield        #64  <Field SortedList$Callback mCallback>
	//*  11   21:aload           4
	//*  12   23:aload_2         
	//*  13   24:invokevirtual   #80  <Method boolean SortedList$Callback.areContentsTheSame(Object, Object)>
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
	//*  23   43:if_acmpeq       92
	//*  24   46:aload_0         
	//*  25   47:getfield        #64  <Field SortedList$Callback mCallback>
	//*  26   50:aload           4
	//*  27   52:aload_2         
	//*  28   53:invokevirtual   #145 <Method int SortedList$Callback.compare(Object, Object)>
	//*  29   56:ifne            92
		{
			mData[i] = obj;
	//   30   59:aload_0         
	//   31   60:getfield        #62  <Field Object[] mData>
	//   32   63:iload_1         
	//   33   64:aload_2         
	//   34   65:aastore         
			if(flag)
	//*  35   66:iload_3         
	//*  36   67:ifeq            91
			{
				Callback callback = mCallback;
	//   37   70:aload_0         
	//   38   71:getfield        #64  <Field SortedList$Callback mCallback>
	//   39   74:astore          5
				callback.onChanged(i, 1, callback.getChangePayload(obj1, obj));
	//   40   76:aload           5
	//   41   78:iload_1         
	//   42   79:iconst_1        
	//   43   80:aload           5
	//   44   82:aload           4
	//   45   84:aload_2         
	//   46   85:invokevirtual   #84  <Method Object SortedList$Callback.getChangePayload(Object, Object)>
	//   47   88:invokevirtual   #88  <Method void SortedList$Callback.onChanged(int, int, Object)>
			}
			return;
	//   48   91:return          
		}
		if(flag)
	//*  49   92:iload_3         
	//*  50   93:ifeq            117
		{
			Callback callback1 = mCallback;
	//   51   96:aload_0         
	//   52   97:getfield        #64  <Field SortedList$Callback mCallback>
	//   53  100:astore          5
			callback1.onChanged(i, 1, callback1.getChangePayload(obj1, obj));
	//   54  102:aload           5
	//   55  104:iload_1         
	//   56  105:iconst_1        
	//   57  106:aload           5
	//   58  108:aload           4
	//   59  110:aload_2         
	//   60  111:invokevirtual   #84  <Method Object SortedList$Callback.getChangePayload(Object, Object)>
	//   61  114:invokevirtual   #88  <Method void SortedList$Callback.onChanged(int, int, Object)>
		}
		removeItemAtIndex(i, false);
	//   62  117:aload_0         
	//   63  118:iload_1         
	//   64  119:iconst_0        
	//   65  120:invokespecial   #175 <Method void removeItemAtIndex(int, boolean)>
		int j = add(obj, false);
	//   66  123:aload_0         
	//   67  124:aload_2         
	//   68  125:iconst_0        
	//   69  126:invokespecial   #208 <Method int add(Object, boolean)>
	//   70  129:istore_3        
		if(i != j)
	//*  71  130:iload_1         
	//*  72  131:iload_3         
	//*  73  132:icmpeq          144
			mCallback.onMoved(i, j);
	//   74  135:aload_0         
	//   75  136:getfield        #64  <Field SortedList$Callback mCallback>
	//   76  139:iload_1         
	//   77  140:iload_3         
	//   78  141:invokevirtual   #261 <Method void SortedList$Callback.onMoved(int, int)>
	//   79  144:return          
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
