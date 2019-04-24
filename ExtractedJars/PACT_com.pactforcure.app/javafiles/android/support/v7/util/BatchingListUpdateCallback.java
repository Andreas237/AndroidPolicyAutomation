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
		if(mLastEventType == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field int mLastEventType>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		mLastEventType;
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field int mLastEventType>
		JVM INSTR tableswitch 1 3: default 40
	//	               1 51
	//	               2 71
	//	               3 91;
	//    6   12:tableswitch     1 3: default 40
	//	               1 51
	//	               2 71
	//	               3 91
		   goto _L1 _L2 _L3 _L4
_L1:
		mLastEventPayload = null;
	//    7   40:aload_0         
	//    8   41:aconst_null     
	//    9   42:putfield        #35  <Field Object mLastEventPayload>
		mLastEventType = 0;
	//   10   45:aload_0         
	//   11   46:iconst_0        
	//   12   47:putfield        #29  <Field int mLastEventType>
		return;
	//   13   50:return          
_L2:
		mWrapped.onInserted(mLastEventPosition, mLastEventCount);
	//   14   51:aload_0         
	//   15   52:getfield        #37  <Field ListUpdateCallback mWrapped>
	//   16   55:aload_0         
	//   17   56:getfield        #31  <Field int mLastEventPosition>
	//   18   59:aload_0         
	//   19   60:getfield        #33  <Field int mLastEventCount>
	//   20   63:invokeinterface #43  <Method void ListUpdateCallback.onInserted(int, int)>
		continue; /* Loop/switch isn't completed */
	//   21   68:goto            40
_L3:
		mWrapped.onRemoved(mLastEventPosition, mLastEventCount);
	//   22   71:aload_0         
	//   23   72:getfield        #37  <Field ListUpdateCallback mWrapped>
	//   24   75:aload_0         
	//   25   76:getfield        #31  <Field int mLastEventPosition>
	//   26   79:aload_0         
	//   27   80:getfield        #33  <Field int mLastEventCount>
	//   28   83:invokeinterface #46  <Method void ListUpdateCallback.onRemoved(int, int)>
		continue; /* Loop/switch isn't completed */
	//   29   88:goto            40
_L4:
		mWrapped.onChanged(mLastEventPosition, mLastEventCount, mLastEventPayload);
	//   30   91:aload_0         
	//   31   92:getfield        #37  <Field ListUpdateCallback mWrapped>
	//   32   95:aload_0         
	//   33   96:getfield        #31  <Field int mLastEventPosition>
	//   34   99:aload_0         
	//   35  100:getfield        #33  <Field int mLastEventCount>
	//   36  103:aload_0         
	//   37  104:getfield        #35  <Field Object mLastEventPayload>
	//   38  107:invokeinterface #50  <Method void ListUpdateCallback.onChanged(int, int, Object)>
		if(true) goto _L1; else goto _L5
	//   39  112:goto            40
_L5:
	}

	public void onChanged(int i, int j, Object obj)
	{
		if(mLastEventType == 3 && i <= mLastEventPosition + mLastEventCount && i + j >= mLastEventPosition && mLastEventPayload == obj)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field int mLastEventType>
	//*   2    4:iconst_3        
	//*   3    5:icmpne          84
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:getfield        #31  <Field int mLastEventPosition>
	//*   7   13:aload_0         
	//*   8   14:getfield        #33  <Field int mLastEventCount>
	//*   9   17:iadd            
	//*  10   18:icmpgt          84
	//*  11   21:iload_1         
	//*  12   22:iload_2         
	//*  13   23:iadd            
	//*  14   24:aload_0         
	//*  15   25:getfield        #31  <Field int mLastEventPosition>
	//*  16   28:icmplt          84
	//*  17   31:aload_0         
	//*  18   32:getfield        #35  <Field Object mLastEventPayload>
	//*  19   35:aload_3         
	//*  20   36:if_acmpne       84
		{
			int k = mLastEventPosition;
	//   21   39:aload_0         
	//   22   40:getfield        #31  <Field int mLastEventPosition>
	//   23   43:istore          4
			int l = mLastEventCount;
	//   24   45:aload_0         
	//   25   46:getfield        #33  <Field int mLastEventCount>
	//   26   49:istore          5
			mLastEventPosition = Math.min(i, mLastEventPosition);
	//   27   51:aload_0         
	//   28   52:iload_1         
	//   29   53:aload_0         
	//   30   54:getfield        #31  <Field int mLastEventPosition>
	//   31   57:invokestatic    #56  <Method int Math.min(int, int)>
	//   32   60:putfield        #31  <Field int mLastEventPosition>
			mLastEventCount = Math.max(k + l, i + j) - mLastEventPosition;
	//   33   63:aload_0         
	//   34   64:iload           4
	//   35   66:iload           5
	//   36   68:iadd            
	//   37   69:iload_1         
	//   38   70:iload_2         
	//   39   71:iadd            
	//   40   72:invokestatic    #59  <Method int Math.max(int, int)>
	//   41   75:aload_0         
	//   42   76:getfield        #31  <Field int mLastEventPosition>
	//   43   79:isub            
	//   44   80:putfield        #33  <Field int mLastEventCount>
			return;
	//   45   83:return          
		} else
		{
			dispatchLastEvent();
	//   46   84:aload_0         
	//   47   85:invokevirtual   #61  <Method void dispatchLastEvent()>
			mLastEventPosition = i;
	//   48   88:aload_0         
	//   49   89:iload_1         
	//   50   90:putfield        #31  <Field int mLastEventPosition>
			mLastEventCount = j;
	//   51   93:aload_0         
	//   52   94:iload_2         
	//   53   95:putfield        #33  <Field int mLastEventCount>
			mLastEventPayload = obj;
	//   54   98:aload_0         
	//   55   99:aload_3         
	//   56  100:putfield        #35  <Field Object mLastEventPayload>
			mLastEventType = 3;
	//   57  103:aload_0         
	//   58  104:iconst_3        
	//   59  105:putfield        #29  <Field int mLastEventType>
			return;
	//   60  108:return          
		}
	}

	public void onInserted(int i, int j)
	{
		if(mLastEventType == 1 && i >= mLastEventPosition && i <= mLastEventPosition + mLastEventCount)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field int mLastEventType>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          52
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:getfield        #31  <Field int mLastEventPosition>
	//*   7   13:icmplt          52
	//*   8   16:iload_1         
	//*   9   17:aload_0         
	//*  10   18:getfield        #31  <Field int mLastEventPosition>
	//*  11   21:aload_0         
	//*  12   22:getfield        #33  <Field int mLastEventCount>
	//*  13   25:iadd            
	//*  14   26:icmpgt          52
		{
			mLastEventCount = mLastEventCount + j;
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #33  <Field int mLastEventCount>
	//   18   34:iload_2         
	//   19   35:iadd            
	//   20   36:putfield        #33  <Field int mLastEventCount>
			mLastEventPosition = Math.min(i, mLastEventPosition);
	//   21   39:aload_0         
	//   22   40:iload_1         
	//   23   41:aload_0         
	//   24   42:getfield        #31  <Field int mLastEventPosition>
	//   25   45:invokestatic    #56  <Method int Math.min(int, int)>
	//   26   48:putfield        #31  <Field int mLastEventPosition>
			return;
	//   27   51:return          
		} else
		{
			dispatchLastEvent();
	//   28   52:aload_0         
	//   29   53:invokevirtual   #61  <Method void dispatchLastEvent()>
			mLastEventPosition = i;
	//   30   56:aload_0         
	//   31   57:iload_1         
	//   32   58:putfield        #31  <Field int mLastEventPosition>
			mLastEventCount = j;
	//   33   61:aload_0         
	//   34   62:iload_2         
	//   35   63:putfield        #33  <Field int mLastEventCount>
			mLastEventType = 1;
	//   36   66:aload_0         
	//   37   67:iconst_1        
	//   38   68:putfield        #29  <Field int mLastEventType>
			return;
	//   39   71:return          
		}
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
		if(mLastEventType == 2 && mLastEventPosition >= i && mLastEventPosition <= i + j)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field int mLastEventType>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          42
	//*   4    8:aload_0         
	//*   5    9:getfield        #31  <Field int mLastEventPosition>
	//*   6   12:iload_1         
	//*   7   13:icmplt          42
	//*   8   16:aload_0         
	//*   9   17:getfield        #31  <Field int mLastEventPosition>
	//*  10   20:iload_1         
	//*  11   21:iload_2         
	//*  12   22:iadd            
	//*  13   23:icmpgt          42
		{
			mLastEventCount = mLastEventCount + j;
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #33  <Field int mLastEventCount>
	//   17   31:iload_2         
	//   18   32:iadd            
	//   19   33:putfield        #33  <Field int mLastEventCount>
			mLastEventPosition = i;
	//   20   36:aload_0         
	//   21   37:iload_1         
	//   22   38:putfield        #31  <Field int mLastEventPosition>
			return;
	//   23   41:return          
		} else
		{
			dispatchLastEvent();
	//   24   42:aload_0         
	//   25   43:invokevirtual   #61  <Method void dispatchLastEvent()>
			mLastEventPosition = i;
	//   26   46:aload_0         
	//   27   47:iload_1         
	//   28   48:putfield        #31  <Field int mLastEventPosition>
			mLastEventCount = j;
	//   29   51:aload_0         
	//   30   52:iload_2         
	//   31   53:putfield        #33  <Field int mLastEventCount>
			mLastEventType = 2;
	//   32   56:aload_0         
	//   33   57:iconst_2        
	//   34   58:putfield        #29  <Field int mLastEventType>
			return;
	//   35   61:return          
		}
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
