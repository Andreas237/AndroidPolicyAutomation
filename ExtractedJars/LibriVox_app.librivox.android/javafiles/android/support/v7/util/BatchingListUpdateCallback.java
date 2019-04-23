// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;


// Referenced classes of package android.support.v7.util:
//			ListUpdateCallback

public class BatchingListUpdateCallback
	implements ListUpdateCallback
{

	public BatchingListUpdateCallback(ListUpdateCallback listupdatecallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		mLastEventType = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #29  <Field int mLastEventType>
		mLastEventPosition = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #31  <Field int mLastEventPosition>
		mLastEventCount = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #33  <Field int mLastEventCount>
		mLastEventPayload = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #35  <Field Object mLastEventPayload>
		mWrapped = listupdatecallback;
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:putfield        #37  <Field ListUpdateCallback mWrapped>
	//   17   29:return          
	}

	public void dispatchLastEvent()
	{
		int i = mLastEventType;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int mLastEventType>
	//    2    4:istore_1        
		if(i == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            10
			return;
	//    5    9:return          
		switch(i)
	//*   6   10:iload_1         
		{
	//*   7   11:tableswitch     1 3: default 36
	//	               1 83
	//	               2 63
	//	               3 39
	//*   8   36:goto            100
		case 3: // '\003'
			mWrapped.onChanged(mLastEventPosition, mLastEventCount, mLastEventPayload);
	//    9   39:aload_0         
	//   10   40:getfield        #37  <Field ListUpdateCallback mWrapped>
	//   11   43:aload_0         
	//   12   44:getfield        #31  <Field int mLastEventPosition>
	//   13   47:aload_0         
	//   14   48:getfield        #33  <Field int mLastEventCount>
	//   15   51:aload_0         
	//   16   52:getfield        #35  <Field Object mLastEventPayload>
	//   17   55:invokeinterface #43  <Method void ListUpdateCallback.onChanged(int, int, Object)>
			break;

	//*  18   60:goto            100
		case 2: // '\002'
			mWrapped.onRemoved(mLastEventPosition, mLastEventCount);
	//   19   63:aload_0         
	//   20   64:getfield        #37  <Field ListUpdateCallback mWrapped>
	//   21   67:aload_0         
	//   22   68:getfield        #31  <Field int mLastEventPosition>
	//   23   71:aload_0         
	//   24   72:getfield        #33  <Field int mLastEventCount>
	//   25   75:invokeinterface #47  <Method void ListUpdateCallback.onRemoved(int, int)>
			break;

	//*  26   80:goto            100
		case 1: // '\001'
			mWrapped.onInserted(mLastEventPosition, mLastEventCount);
	//   27   83:aload_0         
	//   28   84:getfield        #37  <Field ListUpdateCallback mWrapped>
	//   29   87:aload_0         
	//   30   88:getfield        #31  <Field int mLastEventPosition>
	//   31   91:aload_0         
	//   32   92:getfield        #33  <Field int mLastEventCount>
	//   33   95:invokeinterface #50  <Method void ListUpdateCallback.onInserted(int, int)>
			break;
		}
		mLastEventPayload = null;
	//   34  100:aload_0         
	//   35  101:aconst_null     
	//   36  102:putfield        #35  <Field Object mLastEventPayload>
		mLastEventType = 0;
	//   37  105:aload_0         
	//   38  106:iconst_0        
	//   39  107:putfield        #29  <Field int mLastEventType>
	//   40  110:return          
	}

	public void onChanged(int i, int j, Object obj)
	{
		if(mLastEventType == 3)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field int mLastEventType>
	//*   2    4:iconst_3        
	//*   3    5:icmpne          79
		{
			int k = mLastEventPosition;
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field int mLastEventPosition>
	//    6   12:istore          4
			int l = mLastEventCount;
	//    7   14:aload_0         
	//    8   15:getfield        #33  <Field int mLastEventCount>
	//    9   18:istore          5
			if(i <= k + l)
	//*  10   20:iload_1         
	//*  11   21:iload           4
	//*  12   23:iload           5
	//*  13   25:iadd            
	//*  14   26:icmpgt          79
			{
				int i1 = i + j;
	//   15   29:iload_1         
	//   16   30:iload_2         
	//   17   31:iadd            
	//   18   32:istore          6
				if(i1 >= k && mLastEventPayload == obj)
	//*  19   34:iload           6
	//*  20   36:iload           4
	//*  21   38:icmplt          79
	//*  22   41:aload_0         
	//*  23   42:getfield        #35  <Field Object mLastEventPayload>
	//*  24   45:aload_3         
	//*  25   46:if_acmpne       79
				{
					mLastEventPosition = Math.min(i, k);
	//   26   49:aload_0         
	//   27   50:iload_1         
	//   28   51:iload           4
	//   29   53:invokestatic    #56  <Method int Math.min(int, int)>
	//   30   56:putfield        #31  <Field int mLastEventPosition>
					mLastEventCount = Math.max(l + k, i1) - mLastEventPosition;
	//   31   59:aload_0         
	//   32   60:iload           5
	//   33   62:iload           4
	//   34   64:iadd            
	//   35   65:iload           6
	//   36   67:invokestatic    #59  <Method int Math.max(int, int)>
	//   37   70:aload_0         
	//   38   71:getfield        #31  <Field int mLastEventPosition>
	//   39   74:isub            
	//   40   75:putfield        #33  <Field int mLastEventCount>
					return;
	//   41   78:return          
				}
			}
		}
		dispatchLastEvent();
	//   42   79:aload_0         
	//   43   80:invokevirtual   #61  <Method void dispatchLastEvent()>
		mLastEventPosition = i;
	//   44   83:aload_0         
	//   45   84:iload_1         
	//   46   85:putfield        #31  <Field int mLastEventPosition>
		mLastEventCount = j;
	//   47   88:aload_0         
	//   48   89:iload_2         
	//   49   90:putfield        #33  <Field int mLastEventCount>
		mLastEventPayload = obj;
	//   50   93:aload_0         
	//   51   94:aload_3         
	//   52   95:putfield        #35  <Field Object mLastEventPayload>
		mLastEventType = 3;
	//   53   98:aload_0         
	//   54   99:iconst_3        
	//   55  100:putfield        #29  <Field int mLastEventType>
	//   56  103:return          
	}

	public void onInserted(int i, int j)
	{
		if(mLastEventType == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field int mLastEventType>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          50
		{
			int k = mLastEventPosition;
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field int mLastEventPosition>
	//    6   12:istore_3        
			if(i >= k)
	//*   7   13:iload_1         
	//*   8   14:iload_3         
	//*   9   15:icmplt          50
			{
				int l = mLastEventCount;
	//   10   18:aload_0         
	//   11   19:getfield        #33  <Field int mLastEventCount>
	//   12   22:istore          4
				if(i <= k + l)
	//*  13   24:iload_1         
	//*  14   25:iload_3         
	//*  15   26:iload           4
	//*  16   28:iadd            
	//*  17   29:icmpgt          50
				{
					mLastEventCount = l + j;
	//   18   32:aload_0         
	//   19   33:iload           4
	//   20   35:iload_2         
	//   21   36:iadd            
	//   22   37:putfield        #33  <Field int mLastEventCount>
					mLastEventPosition = Math.min(i, k);
	//   23   40:aload_0         
	//   24   41:iload_1         
	//   25   42:iload_3         
	//   26   43:invokestatic    #56  <Method int Math.min(int, int)>
	//   27   46:putfield        #31  <Field int mLastEventPosition>
					return;
	//   28   49:return          
				}
			}
		}
		dispatchLastEvent();
	//   29   50:aload_0         
	//   30   51:invokevirtual   #61  <Method void dispatchLastEvent()>
		mLastEventPosition = i;
	//   31   54:aload_0         
	//   32   55:iload_1         
	//   33   56:putfield        #31  <Field int mLastEventPosition>
		mLastEventCount = j;
	//   34   59:aload_0         
	//   35   60:iload_2         
	//   36   61:putfield        #33  <Field int mLastEventCount>
		mLastEventType = 1;
	//   37   64:aload_0         
	//   38   65:iconst_1        
	//   39   66:putfield        #29  <Field int mLastEventType>
	//   40   69:return          
	}

	public void onMoved(int i, int j)
	{
		dispatchLastEvent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #61  <Method void dispatchLastEvent()>
		mWrapped.onMoved(i, j);
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field ListUpdateCallback mWrapped>
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:invokeinterface #64  <Method void ListUpdateCallback.onMoved(int, int)>
	//    7   15:return          
	}

	public void onRemoved(int i, int j)
	{
		if(mLastEventType == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field int mLastEventType>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          41
		{
			int k = mLastEventPosition;
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field int mLastEventPosition>
	//    6   12:istore_3        
			if(k >= i && k <= i + j)
	//*   7   13:iload_3         
	//*   8   14:iload_1         
	//*   9   15:icmplt          41
	//*  10   18:iload_3         
	//*  11   19:iload_1         
	//*  12   20:iload_2         
	//*  13   21:iadd            
	//*  14   22:icmpgt          41
			{
				mLastEventCount = mLastEventCount + j;
	//   15   25:aload_0         
	//   16   26:aload_0         
	//   17   27:getfield        #33  <Field int mLastEventCount>
	//   18   30:iload_2         
	//   19   31:iadd            
	//   20   32:putfield        #33  <Field int mLastEventCount>
				mLastEventPosition = i;
	//   21   35:aload_0         
	//   22   36:iload_1         
	//   23   37:putfield        #31  <Field int mLastEventPosition>
				return;
	//   24   40:return          
			}
		}
		dispatchLastEvent();
	//   25   41:aload_0         
	//   26   42:invokevirtual   #61  <Method void dispatchLastEvent()>
		mLastEventPosition = i;
	//   27   45:aload_0         
	//   28   46:iload_1         
	//   29   47:putfield        #31  <Field int mLastEventPosition>
		mLastEventCount = j;
	//   30   50:aload_0         
	//   31   51:iload_2         
	//   32   52:putfield        #33  <Field int mLastEventCount>
		mLastEventType = 2;
	//   33   55:aload_0         
	//   34   56:iconst_2        
	//   35   57:putfield        #29  <Field int mLastEventType>
	//   36   60:return          
	}

	private static final int TYPE_ADD = 1;
	private static final int TYPE_CHANGE = 3;
	private static final int TYPE_NONE = 0;
	private static final int TYPE_REMOVE = 2;
	int mLastEventCount;
	Object mLastEventPayload;
	int mLastEventPosition;
	int mLastEventType;
	final ListUpdateCallback mWrapped;
}
