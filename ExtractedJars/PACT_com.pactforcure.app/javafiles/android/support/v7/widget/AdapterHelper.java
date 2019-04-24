// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import java.util.*;

// Referenced classes of package android.support.v7.widget:
//			OpReorderer

class AdapterHelper
	implements OpReorderer.Callback
{
	static interface Callback
	{

		public abstract RecyclerView.ViewHolder findViewHolder(int i);

		public abstract void markViewHoldersUpdated(int i, int j, Object obj);

		public abstract void offsetPositionsForAdd(int i, int j);

		public abstract void offsetPositionsForMove(int i, int j);

		public abstract void offsetPositionsForRemovingInvisible(int i, int j);

		public abstract void offsetPositionsForRemovingLaidOutOrNewView(int i, int j);

		public abstract void onDispatchFirstPass(UpdateOp updateop);

		public abstract void onDispatchSecondPass(UpdateOp updateop);
	}

	static class UpdateOp
	{

		String cmdToString()
		{
			switch(cmd)
		//*   0    0:aload_0         
		//*   1    1:getfield        #30  <Field int cmd>
			{
		//*   2    4:tableswitch     1 8: default 52
		//		               1 55
		//		               2 58
		//		               3 52
		//		               4 61
		//		               5 52
		//		               6 52
		//		               7 52
		//		               8 64
			case 3: // '\003'
			case 5: // '\005'
			case 6: // '\006'
			case 7: // '\007'
			default:
				return "??";
		//    3   52:ldc1            #41  <String "??">
		//    4   54:areturn         

			case 1: // '\001'
				return "add";
		//    5   55:ldc1            #43  <String "add">
		//    6   57:areturn         

			case 2: // '\002'
				return "rm";
		//    7   58:ldc1            #45  <String "rm">
		//    8   60:areturn         

			case 4: // '\004'
				return "up";
		//    9   61:ldc1            #47  <String "up">
		//   10   63:areturn         

			case 8: // '\b'
				return "mv";
		//   11   64:ldc1            #49  <String "mv">
		//   12   66:areturn         
			}
		}

		public boolean equals(Object obj)
		{
			if(this != obj) goto _L2; else goto _L1
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:if_acmpne       7
_L1:
			return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
_L2:
			if(obj == null || ((Object)this).getClass() != obj.getClass())
		//*   5    7:aload_1         
		//*   6    8:ifnull          22
		//*   7   11:aload_0         
		//*   8   12:invokevirtual   #55  <Method Class Object.getClass()>
		//*   9   15:aload_1         
		//*  10   16:invokevirtual   #55  <Method Class Object.getClass()>
		//*  11   19:if_acmpeq       24
				return false;
		//   12   22:iconst_0        
		//   13   23:ireturn         
			obj = ((Object) ((UpdateOp)obj));
		//   14   24:aload_1         
		//   15   25:checkcast       #2   <Class AdapterHelper$UpdateOp>
		//   16   28:astore_1        
			if(cmd != ((UpdateOp) (obj)).cmd)
		//*  17   29:aload_0         
		//*  18   30:getfield        #30  <Field int cmd>
		//*  19   33:aload_1         
		//*  20   34:getfield        #30  <Field int cmd>
		//*  21   37:icmpeq          42
				return false;
		//   22   40:iconst_0        
		//   23   41:ireturn         
			if(cmd == 8 && Math.abs(itemCount - positionStart) == 1 && itemCount == ((UpdateOp) (obj)).positionStart && positionStart == ((UpdateOp) (obj)).itemCount) goto _L1; else goto _L3
		//   24   42:aload_0         
		//   25   43:getfield        #30  <Field int cmd>
		//   26   46:bipush          8
		//   27   48:icmpne          89
		//   28   51:aload_0         
		//   29   52:getfield        #34  <Field int itemCount>
		//   30   55:aload_0         
		//   31   56:getfield        #32  <Field int positionStart>
		//   32   59:isub            
		//   33   60:invokestatic    #61  <Method int Math.abs(int)>
		//   34   63:iconst_1        
		//   35   64:icmpne          89
		//   36   67:aload_0         
		//   37   68:getfield        #34  <Field int itemCount>
		//   38   71:aload_1         
		//   39   72:getfield        #32  <Field int positionStart>
		//   40   75:icmpne          89
		//   41   78:aload_0         
		//   42   79:getfield        #32  <Field int positionStart>
		//   43   82:aload_1         
		//   44   83:getfield        #34  <Field int itemCount>
		//   45   86:icmpeq          5
_L3:
			if(itemCount != ((UpdateOp) (obj)).itemCount)
		//*  46   89:aload_0         
		//*  47   90:getfield        #34  <Field int itemCount>
		//*  48   93:aload_1         
		//*  49   94:getfield        #34  <Field int itemCount>
		//*  50   97:icmpeq          102
				return false;
		//   51  100:iconst_0        
		//   52  101:ireturn         
			if(positionStart != ((UpdateOp) (obj)).positionStart)
		//*  53  102:aload_0         
		//*  54  103:getfield        #32  <Field int positionStart>
		//*  55  106:aload_1         
		//*  56  107:getfield        #32  <Field int positionStart>
		//*  57  110:icmpeq          115
				return false;
		//   58  113:iconst_0        
		//   59  114:ireturn         
			if(payload == null)
				continue; /* Loop/switch isn't completed */
		//   60  115:aload_0         
		//   61  116:getfield        #36  <Field Object payload>
		//   62  119:ifnull          138
			if(payload.equals(((UpdateOp) (obj)).payload)) goto _L1; else goto _L4
		//   63  122:aload_0         
		//   64  123:getfield        #36  <Field Object payload>
		//   65  126:aload_1         
		//   66  127:getfield        #36  <Field Object payload>
		//   67  130:invokevirtual   #63  <Method boolean Object.equals(Object)>
		//   68  133:ifne            5
_L4:
			return false;
		//   69  136:iconst_0        
		//   70  137:ireturn         
			if(((UpdateOp) (obj)).payload == null) goto _L1; else goto _L5
		//   71  138:aload_1         
		//   72  139:getfield        #36  <Field Object payload>
		//   73  142:ifnull          5
_L5:
			return false;
		//   74  145:iconst_0        
		//   75  146:ireturn         
		}

		public int hashCode()
		{
			return (cmd * 31 + positionStart) * 31 + itemCount;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field int cmd>
		//    2    4:bipush          31
		//    3    6:imul            
		//    4    7:aload_0         
		//    5    8:getfield        #32  <Field int positionStart>
		//    6   11:iadd            
		//    7   12:bipush          31
		//    8   14:imul            
		//    9   15:aload_0         
		//   10   16:getfield        #34  <Field int itemCount>
		//   11   19:iadd            
		//   12   20:ireturn         
		}

		public String toString()
		{
			return (new StringBuilder()).append(Integer.toHexString(System.identityHashCode(((Object) (this))))).append("[").append(cmdToString()).append(",s:").append(positionStart).append("c:").append(itemCount).append(",p:").append(payload).append("]").toString();
		//    0    0:new             #68  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #69  <Method void StringBuilder()>
		//    3    7:aload_0         
		//    4    8:invokestatic    #75  <Method int System.identityHashCode(Object)>
		//    5   11:invokestatic    #81  <Method String Integer.toHexString(int)>
		//    6   14:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
		//    7   17:ldc1            #87  <String "[">
		//    8   19:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
		//    9   22:aload_0         
		//   10   23:invokevirtual   #89  <Method String cmdToString()>
		//   11   26:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
		//   12   29:ldc1            #91  <String ",s:">
		//   13   31:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
		//   14   34:aload_0         
		//   15   35:getfield        #32  <Field int positionStart>
		//   16   38:invokevirtual   #94  <Method StringBuilder StringBuilder.append(int)>
		//   17   41:ldc1            #96  <String "c:">
		//   18   43:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
		//   19   46:aload_0         
		//   20   47:getfield        #34  <Field int itemCount>
		//   21   50:invokevirtual   #94  <Method StringBuilder StringBuilder.append(int)>
		//   22   53:ldc1            #98  <String ",p:">
		//   23   55:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
		//   24   58:aload_0         
		//   25   59:getfield        #36  <Field Object payload>
		//   26   62:invokevirtual   #101 <Method StringBuilder StringBuilder.append(Object)>
		//   27   65:ldc1            #103 <String "]">
		//   28   67:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
		//   29   70:invokevirtual   #105 <Method String StringBuilder.toString()>
		//   30   73:areturn         
		}

		static final int ADD = 1;
		static final int MOVE = 8;
		static final int POOL_SIZE = 30;
		static final int REMOVE = 2;
		static final int UPDATE = 4;
		int cmd;
		int itemCount;
		Object payload;
		int positionStart;

		UpdateOp(int i, int j, int k, Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
			cmd = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #30  <Field int cmd>
			positionStart = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #32  <Field int positionStart>
			itemCount = k;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #34  <Field int itemCount>
			payload = obj;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #36  <Field Object payload>
		//   14   25:return          
		}
	}


	AdapterHelper(Callback callback)
	{
		this(callback, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #43  <Method void AdapterHelper(AdapterHelper$Callback, boolean)>
	//    4    6:return          
	}

	AdapterHelper(Callback callback, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		mUpdateOpPool = ((android.support.v4.util.Pools.Pool) (new android.support.v4.util.Pools.SimplePool(30)));
	//    2    4:aload_0         
	//    3    5:new             #49  <Class android.support.v4.util.Pools$SimplePool>
	//    4    8:dup             
	//    5    9:bipush          30
	//    6   11:invokespecial   #52  <Method void android.support.v4.util.Pools$SimplePool(int)>
	//    7   14:putfield        #54  <Field android.support.v4.util.Pools$Pool mUpdateOpPool>
		mPendingUpdates = new ArrayList();
	//    8   17:aload_0         
	//    9   18:new             #56  <Class ArrayList>
	//   10   21:dup             
	//   11   22:invokespecial   #57  <Method void ArrayList()>
	//   12   25:putfield        #59  <Field ArrayList mPendingUpdates>
		mPostponedList = new ArrayList();
	//   13   28:aload_0         
	//   14   29:new             #56  <Class ArrayList>
	//   15   32:dup             
	//   16   33:invokespecial   #57  <Method void ArrayList()>
	//   17   36:putfield        #61  <Field ArrayList mPostponedList>
		mExistingUpdateTypes = 0;
	//   18   39:aload_0         
	//   19   40:iconst_0        
	//   20   41:putfield        #63  <Field int mExistingUpdateTypes>
		mCallback = callback;
	//   21   44:aload_0         
	//   22   45:aload_1         
	//   23   46:putfield        #65  <Field AdapterHelper$Callback mCallback>
		mDisableRecycler = flag;
	//   24   49:aload_0         
	//   25   50:iload_2         
	//   26   51:putfield        #67  <Field boolean mDisableRecycler>
		mOpReorderer = new OpReorderer(((OpReorderer.Callback) (this)));
	//   27   54:aload_0         
	//   28   55:new             #69  <Class OpReorderer>
	//   29   58:dup             
	//   30   59:aload_0         
	//   31   60:invokespecial   #72  <Method void OpReorderer(OpReorderer$Callback)>
	//   32   63:putfield        #74  <Field OpReorderer mOpReorderer>
	//   33   66:return          
	}

	private void applyAdd(UpdateOp updateop)
	{
		postponeAndUpdateViewHolders(updateop);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #79  <Method void postponeAndUpdateViewHolders(AdapterHelper$UpdateOp)>
	//    3    5:return          
	}

	private void applyMove(UpdateOp updateop)
	{
		postponeAndUpdateViewHolders(updateop);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #79  <Method void postponeAndUpdateViewHolders(AdapterHelper$UpdateOp)>
	//    3    5:return          
	}

	private void applyRemove(UpdateOp updateop)
	{
		int i1 = updateop.positionStart;
	//    0    0:aload_1         
	//    1    1:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//    2    4:istore          8
		int l = 0;
	//    3    6:iconst_0        
	//    4    7:istore          6
		int k = updateop.positionStart + updateop.itemCount;
	//    5    9:aload_1         
	//    6   10:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//    7   13:aload_1         
	//    8   14:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//    9   17:iadd            
	//   10   18:istore          5
		byte byte1 = -1;
	//   11   20:iconst_m1       
	//   12   21:istore          7
		int i = updateop.positionStart;
	//   13   23:aload_1         
	//   14   24:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   15   27:istore_2        
		while(i < k) 
	//*  16   28:iload_2         
	//*  17   29:iload           5
	//*  18   31:icmpge          161
		{
			int j = 0;
	//   19   34:iconst_0        
	//   20   35:istore          4
			byte byte0 = 0;
	//   21   37:iconst_0        
	//   22   38:istore_3        
			if(mCallback.findViewHolder(i) != null || canFindInPreLayout(i))
	//*  23   39:aload_0         
	//*  24   40:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//*  25   43:iload_2         
	//*  26   44:invokeinterface #91  <Method RecyclerView$ViewHolder AdapterHelper$Callback.findViewHolder(int)>
	//*  27   49:ifnonnull       60
	//*  28   52:aload_0         
	//*  29   53:iload_2         
	//*  30   54:invokespecial   #95  <Method boolean canFindInPreLayout(int)>
	//*  31   57:ifeq            124
			{
				if(byte1 == 0)
	//*  32   60:iload           7
	//*  33   62:ifne            81
				{
					dispatchAndUpdateViewHolders(obtainUpdateOp(2, i1, l, ((Object) (null))));
	//   34   65:aload_0         
	//   35   66:aload_0         
	//   36   67:iconst_2        
	//   37   68:iload           8
	//   38   70:iload           6
	//   39   72:aconst_null     
	//   40   73:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//   41   76:invokespecial   #102 <Method void dispatchAndUpdateViewHolders(AdapterHelper$UpdateOp)>
					byte0 = 1;
	//   42   79:iconst_1        
	//   43   80:istore_3        
				}
				byte1 = 1;
	//   44   81:iconst_1        
	//   45   82:istore          7
				j = ((int) (byte0));
	//   46   84:iload_3         
	//   47   85:istore          4
				byte0 = byte1;
	//   48   87:iload           7
	//   49   89:istore_3        
			} else
	//*  50   90:iload           4
	//*  51   92:ifeq            152
	//*  52   95:iload_2         
	//*  53   96:iload           6
	//*  54   98:isub            
	//*  55   99:istore_2        
	//*  56  100:iload           5
	//*  57  102:iload           6
	//*  58  104:isub            
	//*  59  105:istore          5
	//*  60  107:iconst_1        
	//*  61  108:istore          4
	//*  62  110:iload_2         
	//*  63  111:iconst_1        
	//*  64  112:iadd            
	//*  65  113:istore_2        
	//*  66  114:iload           4
	//*  67  116:istore          6
	//*  68  118:iload_3         
	//*  69  119:istore          7
	//*  70  121:goto            28
			{
				if(byte1 == 1)
	//*  71  124:iload           7
	//*  72  126:iconst_1        
	//*  73  127:icmpne          147
				{
					postponeAndUpdateViewHolders(obtainUpdateOp(2, i1, l, ((Object) (null))));
	//   74  130:aload_0         
	//   75  131:aload_0         
	//   76  132:iconst_2        
	//   77  133:iload           8
	//   78  135:iload           6
	//   79  137:aconst_null     
	//   80  138:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//   81  141:invokespecial   #79  <Method void postponeAndUpdateViewHolders(AdapterHelper$UpdateOp)>
					j = 1;
	//   82  144:iconst_1        
	//   83  145:istore          4
				}
				byte0 = 0;
	//   84  147:iconst_0        
	//   85  148:istore_3        
			}
			if(j != 0)
			{
				i -= l;
				k -= l;
				j = 1;
			} else
	//*  86  149:goto            90
			{
				j = l + 1;
	//   87  152:iload           6
	//   88  154:iconst_1        
	//   89  155:iadd            
	//   90  156:istore          4
			}
			i++;
			l = j;
			byte1 = byte0;
		}
	//*  91  158:goto            110
		UpdateOp updateop1 = updateop;
	//   92  161:aload_1         
	//   93  162:astore          9
		if(l != updateop.itemCount)
	//*  94  164:iload           6
	//*  95  166:aload_1         
	//*  96  167:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  97  170:icmpeq          190
		{
			recycleUpdateOp(updateop);
	//   98  173:aload_0         
	//   99  174:aload_1         
	//  100  175:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
			updateop1 = obtainUpdateOp(2, i1, l, ((Object) (null)));
	//  101  178:aload_0         
	//  102  179:iconst_2        
	//  103  180:iload           8
	//  104  182:iload           6
	//  105  184:aconst_null     
	//  106  185:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//  107  188:astore          9
		}
		if(byte1 == 0)
	//* 108  190:iload           7
	//* 109  192:ifne            202
		{
			dispatchAndUpdateViewHolders(updateop1);
	//  110  195:aload_0         
	//  111  196:aload           9
	//  112  198:invokespecial   #102 <Method void dispatchAndUpdateViewHolders(AdapterHelper$UpdateOp)>
			return;
	//  113  201:return          
		} else
		{
			postponeAndUpdateViewHolders(updateop1);
	//  114  202:aload_0         
	//  115  203:aload           9
	//  116  205:invokespecial   #79  <Method void postponeAndUpdateViewHolders(AdapterHelper$UpdateOp)>
			return;
	//  117  208:return          
		}
	}

	private void applyUpdate(UpdateOp updateop)
	{
		int k = updateop.positionStart;
	//    0    0:aload_1         
	//    1    1:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//    2    4:istore          4
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		int k1 = updateop.positionStart;
	//    5    8:aload_1         
	//    6    9:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//    7   12:istore          9
		int l1 = updateop.itemCount;
	//    8   14:aload_1         
	//    9   15:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   10   18:istore          10
		byte byte0 = -1;
	//   11   20:iconst_m1       
	//   12   21:istore          8
		int i = updateop.positionStart;
	//   13   23:aload_1         
	//   14   24:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   15   27:istore_2        
		while(i < k1 + l1) 
	//*  16   28:iload_2         
	//*  17   29:iload           9
	//*  18   31:iload           10
	//*  19   33:iadd            
	//*  20   34:icmpge          162
		{
			int l;
			int i1;
			if(mCallback.findViewHolder(i) != null || canFindInPreLayout(i))
	//*  21   37:aload_0         
	//*  22   38:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//*  23   41:iload_2         
	//*  24   42:invokeinterface #91  <Method RecyclerView$ViewHolder AdapterHelper$Callback.findViewHolder(int)>
	//*  25   47:ifnonnull       58
	//*  26   50:aload_0         
	//*  27   51:iload_2         
	//*  28   52:invokespecial   #95  <Method boolean canFindInPreLayout(int)>
	//*  29   55:ifeq            115
			{
				i1 = j;
	//   30   58:iload_3         
	//   31   59:istore          6
				int j1 = k;
	//   32   61:iload           4
	//   33   63:istore          7
				if(byte0 == 0)
	//*  34   65:iload           8
	//*  35   67:ifne            92
				{
					dispatchAndUpdateViewHolders(obtainUpdateOp(4, k, j, updateop.payload));
	//   36   70:aload_0         
	//   37   71:aload_0         
	//   38   72:iconst_4        
	//   39   73:iload           4
	//   40   75:iload_3         
	//   41   76:aload_1         
	//   42   77:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//   43   80:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//   44   83:invokespecial   #102 <Method void dispatchAndUpdateViewHolders(AdapterHelper$UpdateOp)>
					i1 = 0;
	//   45   86:iconst_0        
	//   46   87:istore          6
					j1 = i;
	//   47   89:iload_2         
	//   48   90:istore          7
				}
				l = 1;
	//   49   92:iconst_1        
	//   50   93:istore          5
				k = j1;
	//   51   95:iload           7
	//   52   97:istore          4
			} else
	//*  53   99:iload           6
	//*  54  101:iconst_1        
	//*  55  102:iadd            
	//*  56  103:istore_3        
	//*  57  104:iload_2         
	//*  58  105:iconst_1        
	//*  59  106:iadd            
	//*  60  107:istore_2        
	//*  61  108:iload           5
	//*  62  110:istore          8
	//*  63  112:goto            28
			{
				i1 = j;
	//   64  115:iload_3         
	//   65  116:istore          6
				l = k;
	//   66  118:iload           4
	//   67  120:istore          5
				if(byte0 == 1)
	//*  68  122:iload           8
	//*  69  124:iconst_1        
	//*  70  125:icmpne          150
				{
					postponeAndUpdateViewHolders(obtainUpdateOp(4, k, j, updateop.payload));
	//   71  128:aload_0         
	//   72  129:aload_0         
	//   73  130:iconst_4        
	//   74  131:iload           4
	//   75  133:iload_3         
	//   76  134:aload_1         
	//   77  135:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//   78  138:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//   79  141:invokespecial   #79  <Method void postponeAndUpdateViewHolders(AdapterHelper$UpdateOp)>
					i1 = 0;
	//   80  144:iconst_0        
	//   81  145:istore          6
					l = i;
	//   82  147:iload_2         
	//   83  148:istore          5
				}
				j = 0;
	//   84  150:iconst_0        
	//   85  151:istore_3        
				k = l;
	//   86  152:iload           5
	//   87  154:istore          4
				l = j;
	//   88  156:iload_3         
	//   89  157:istore          5
			}
			j = i1 + 1;
			i++;
			byte0 = ((byte) (l));
		}
	//*  90  159:goto            99
		Object obj = ((Object) (updateop));
	//   91  162:aload_1         
	//   92  163:astore          11
		if(j != updateop.itemCount)
	//*  93  165:iload_3         
	//*  94  166:aload_1         
	//*  95  167:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  96  170:icmpeq          196
		{
			obj = updateop.payload;
	//   97  173:aload_1         
	//   98  174:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//   99  177:astore          11
			recycleUpdateOp(updateop);
	//  100  179:aload_0         
	//  101  180:aload_1         
	//  102  181:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
			obj = ((Object) (obtainUpdateOp(4, k, j, obj)));
	//  103  184:aload_0         
	//  104  185:iconst_4        
	//  105  186:iload           4
	//  106  188:iload_3         
	//  107  189:aload           11
	//  108  191:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//  109  194:astore          11
		}
		if(byte0 == 0)
	//* 110  196:iload           8
	//* 111  198:ifne            208
		{
			dispatchAndUpdateViewHolders(((UpdateOp) (obj)));
	//  112  201:aload_0         
	//  113  202:aload           11
	//  114  204:invokespecial   #102 <Method void dispatchAndUpdateViewHolders(AdapterHelper$UpdateOp)>
			return;
	//  115  207:return          
		} else
		{
			postponeAndUpdateViewHolders(((UpdateOp) (obj)));
	//  116  208:aload_0         
	//  117  209:aload           11
	//  118  211:invokespecial   #79  <Method void postponeAndUpdateViewHolders(AdapterHelper$UpdateOp)>
			return;
	//  119  214:return          
		}
	}

	private boolean canFindInPreLayout(int i)
	{
		int j;
		int l;
		l = mPostponedList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field ArrayList mPostponedList>
	//    2    4:invokevirtual   #114 <Method int ArrayList.size()>
	//    3    7:istore          4
		j = 0;
	//    4    9:iconst_0        
	//    5   10:istore_2        
_L7:
		if(j >= l) goto _L2; else goto _L1
	//    6   11:iload_2         
	//    7   12:iload           4
	//    8   14:icmpge          122
_L1:
		UpdateOp updateop = (UpdateOp)mPostponedList.get(j);
	//    9   17:aload_0         
	//   10   18:getfield        #61  <Field ArrayList mPostponedList>
	//   11   21:iload_2         
	//   12   22:invokevirtual   #118 <Method Object ArrayList.get(int)>
	//   13   25:checkcast       #11  <Class AdapterHelper$UpdateOp>
	//   14   28:astore          7
		if(updateop.cmd != 8) goto _L4; else goto _L3
	//   15   30:aload           7
	//   16   32:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//   17   35:bipush          8
	//   18   37:icmpne          58
_L3:
		if(findPositionOffset(updateop.itemCount, j + 1) != i)
			continue; /* Loop/switch isn't completed */
	//   19   40:aload_0         
	//   20   41:aload           7
	//   21   43:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   22   46:iload_2         
	//   23   47:iconst_1        
	//   24   48:iadd            
	//   25   49:invokevirtual   #125 <Method int findPositionOffset(int, int)>
	//   26   52:iload_1         
	//   27   53:icmpne          115
_L6:
		return true;
	//   28   56:iconst_1        
	//   29   57:ireturn         
_L4:
		if(updateop.cmd != 1)
			continue; /* Loop/switch isn't completed */
	//   30   58:aload           7
	//   31   60:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//   32   63:iconst_1        
	//   33   64:icmpne          115
		int i1 = updateop.positionStart;
	//   34   67:aload           7
	//   35   69:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   36   72:istore          5
		int j1 = updateop.itemCount;
	//   37   74:aload           7
	//   38   76:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   39   79:istore          6
		int k = updateop.positionStart;
	//   40   81:aload           7
	//   41   83:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   42   86:istore_3        
		do
		{
			if(k >= i1 + j1)
				continue; /* Loop/switch isn't completed */
	//   43   87:iload_3         
	//   44   88:iload           5
	//   45   90:iload           6
	//   46   92:iadd            
	//   47   93:icmpge          115
			if(findPositionOffset(k, j + 1) == i)
				break;
	//   48   96:aload_0         
	//   49   97:iload_3         
	//   50   98:iload_2         
	//   51   99:iconst_1        
	//   52  100:iadd            
	//   53  101:invokevirtual   #125 <Method int findPositionOffset(int, int)>
	//   54  104:iload_1         
	//   55  105:icmpeq          56
			k++;
	//   56  108:iload_3         
	//   57  109:iconst_1        
	//   58  110:iadd            
	//   59  111:istore_3        
		} while(true);
	//   60  112:goto            87
		if(true) goto _L6; else goto _L5
_L5:
		j++;
	//   61  115:iload_2         
	//   62  116:iconst_1        
	//   63  117:iadd            
	//   64  118:istore_2        
		  goto _L7
	//*  65  119:goto            11
_L2:
		return false;
	//   66  122:iconst_0        
	//   67  123:ireturn         
	}

	private void dispatchAndUpdateViewHolders(UpdateOp updateop)
	{
		int i;
		int i1;
		int j1;
		if(updateop.cmd == 1 || updateop.cmd == 8)
	//*   0    0:aload_1         
	//*   1    1:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//*   2    4:iconst_1        
	//*   3    5:icmpeq          17
	//*   4    8:aload_1         
	//*   5    9:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//*   6   12:bipush          8
	//*   7   14:icmpne          27
			throw new IllegalArgumentException("should not dispatch add or move for pre layout");
	//    8   17:new             #127 <Class IllegalArgumentException>
	//    9   20:dup             
	//   10   21:ldc1            #129 <String "should not dispatch add or move for pre layout">
	//   11   23:invokespecial   #132 <Method void IllegalArgumentException(String)>
	//   12   26:athrow          
		j1 = updatePositionWithPostponed(updateop.positionStart, updateop.cmd);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   16   32:aload_1         
	//   17   33:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//   18   36:invokespecial   #135 <Method int updatePositionWithPostponed(int, int)>
	//   19   39:istore          7
		i1 = 1;
	//   20   41:iconst_1        
	//   21   42:istore          6
		i = updateop.positionStart;
	//   22   44:aload_1         
	//   23   45:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   24   48:istore_2        
		updateop.cmd;
	//   25   49:aload_1         
	//   26   50:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
		JVM INSTR tableswitch 2 4: default 80
	//	               2 204
	//	               3 80
	//	               4 107;
	//   27   53:tableswitch     2 4: default 80
	//	               2 204
	//	               3 80
	//	               4 107
		   goto _L1 _L2 _L1 _L3
_L1:
		throw new IllegalArgumentException((new StringBuilder()).append("op should be remove or update.").append(((Object) (updateop))).toString());
	//   28   80:new             #127 <Class IllegalArgumentException>
	//   29   83:dup             
	//   30   84:new             #137 <Class StringBuilder>
	//   31   87:dup             
	//   32   88:invokespecial   #138 <Method void StringBuilder()>
	//   33   91:ldc1            #140 <String "op should be remove or update.">
	//   34   93:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   35   96:aload_1         
	//   36   97:invokevirtual   #147 <Method StringBuilder StringBuilder.append(Object)>
	//   37  100:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   38  103:invokespecial   #132 <Method void IllegalArgumentException(String)>
	//   39  106:athrow          
_L3:
		int k = 1;
	//   40  107:iconst_1        
	//   41  108:istore          4
_L9:
		int l = 1;
	//   42  110:iconst_1        
	//   43  111:istore          5
_L8:
		int j;
		int k1;
		boolean flag;
		if(l >= updateop.itemCount)
			break MISSING_BLOCK_LABEL_307;
	//   44  113:iload           5
	//   45  115:aload_1         
	//   46  116:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   47  119:icmpge          307
		k1 = updatePositionWithPostponed(updateop.positionStart + k * l, updateop.cmd);
	//   48  122:aload_0         
	//   49  123:aload_1         
	//   50  124:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   51  127:iload           4
	//   52  129:iload           5
	//   53  131:imul            
	//   54  132:iadd            
	//   55  133:aload_1         
	//   56  134:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//   57  137:invokespecial   #135 <Method int updatePositionWithPostponed(int, int)>
	//   58  140:istore          8
		flag = false;
	//   59  142:iconst_0        
	//   60  143:istore          9
		j = ((int) (flag));
	//   61  145:iload           9
	//   62  147:istore_3        
		updateop.cmd;
	//   63  148:aload_1         
	//   64  149:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
		JVM INSTR tableswitch 2 4: default 180
	//	               2 229
	//	               3 183
	//	               4 210;
	//   65  152:tableswitch     2 4: default 180
	//	               2 229
	//	               3 183
	//	               4 210
		   goto _L4 _L5 _L6 _L7
_L6:
		break; /* Loop/switch isn't completed */
_L4:
		j = ((int) (flag));
	//   66  180:iload           9
	//   67  182:istore_3        
_L10:
		if(j != 0)
	//*  68  183:iload_3         
	//*  69  184:ifeq            246
		{
			j = i1 + 1;
	//   70  187:iload           6
	//   71  189:iconst_1        
	//   72  190:iadd            
	//   73  191:istore_3        
		} else
	//*  74  192:iload           5
	//*  75  194:iconst_1        
	//*  76  195:iadd            
	//*  77  196:istore          5
	//*  78  198:iload_3         
	//*  79  199:istore          6
	//*  80  201:goto            113
	//*  81  204:iconst_0        
	//*  82  205:istore          4
	//*  83  207:goto            110
	//*  84  210:iload           8
	//*  85  212:iload           7
	//*  86  214:iconst_1        
	//*  87  215:iadd            
	//*  88  216:icmpne          224
	//*  89  219:iconst_1        
	//*  90  220:istore_3        
	//*  91  221:goto            183
	//*  92  224:iconst_0        
	//*  93  225:istore_3        
	//*  94  226:goto            221
	//*  95  229:iload           8
	//*  96  231:iload           7
	//*  97  233:icmpne          241
	//*  98  236:iconst_1        
	//*  99  237:istore_3        
	//* 100  238:goto            183
	//* 101  241:iconst_0        
	//* 102  242:istore_3        
	//* 103  243:goto            238
		{
			UpdateOp updateop1 = obtainUpdateOp(updateop.cmd, j1, i1, updateop.payload);
	//  104  246:aload_0         
	//  105  247:aload_1         
	//  106  248:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//  107  251:iload           7
	//  108  253:iload           6
	//  109  255:aload_1         
	//  110  256:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//  111  259:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//  112  262:astore          10
			dispatchFirstPassAndUpdateViewHolders(updateop1, i);
	//  113  264:aload_0         
	//  114  265:aload           10
	//  115  267:iload_2         
	//  116  268:invokevirtual   #155 <Method void dispatchFirstPassAndUpdateViewHolders(AdapterHelper$UpdateOp, int)>
			recycleUpdateOp(updateop1);
	//  117  271:aload_0         
	//  118  272:aload           10
	//  119  274:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
			j = i;
	//  120  277:iload_2         
	//  121  278:istore_3        
			if(updateop.cmd == 4)
	//* 122  279:aload_1         
	//* 123  280:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//* 124  283:iconst_4        
	//* 125  284:icmpne          292
				j = i + i1;
	//  126  287:iload_2         
	//  127  288:iload           6
	//  128  290:iadd            
	//  129  291:istore_3        
			j1 = k1;
	//  130  292:iload           8
	//  131  294:istore          7
			i1 = 1;
	//  132  296:iconst_1        
	//  133  297:istore          6
			i = j;
	//  134  299:iload_3         
	//  135  300:istore_2        
			j = i1;
	//  136  301:iload           6
	//  137  303:istore_3        
		}
		l++;
		i1 = j;
		  goto _L8
_L2:
		k = 0;
		  goto _L9
_L7:
		if(k1 == j1 + 1)
			j = 1;
		else
			j = 0;
		  goto _L10
_L5:
		if(k1 == j1)
			j = 1;
		else
			j = 0;
		  goto _L10
	//* 138  304:goto            192
		Object obj = updateop.payload;
	//  139  307:aload_1         
	//  140  308:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//  141  311:astore          10
		recycleUpdateOp(updateop);
	//  142  313:aload_0         
	//  143  314:aload_1         
	//  144  315:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
		if(i1 > 0)
	//* 145  318:iload           6
	//* 146  320:ifle            349
		{
			updateop = obtainUpdateOp(updateop.cmd, j1, i1, obj);
	//  147  323:aload_0         
	//  148  324:aload_1         
	//  149  325:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//  150  328:iload           7
	//  151  330:iload           6
	//  152  332:aload           10
	//  153  334:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//  154  337:astore_1        
			dispatchFirstPassAndUpdateViewHolders(updateop, i);
	//  155  338:aload_0         
	//  156  339:aload_1         
	//  157  340:iload_2         
	//  158  341:invokevirtual   #155 <Method void dispatchFirstPassAndUpdateViewHolders(AdapterHelper$UpdateOp, int)>
			recycleUpdateOp(updateop);
	//  159  344:aload_0         
	//  160  345:aload_1         
	//  161  346:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
		}
		return;
	//  162  349:return          
		  goto _L8
	}

	private void postponeAndUpdateViewHolders(UpdateOp updateop)
	{
		mPostponedList.add(((Object) (updateop)));
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field ArrayList mPostponedList>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #159 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		switch(updateop.cmd)
	//*   5    9:aload_1         
	//*   6   10:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
		{
	//*   7   13:tableswitch     1 8: default 60
	//	               1 87
	//	               2 123
	//	               3 60
	//	               4 141
	//	               5 60
	//	               6 60
	//	               7 60
	//	               8 105
		case 3: // '\003'
		case 5: // '\005'
		case 6: // '\006'
		case 7: // '\007'
		default:
			throw new IllegalArgumentException((new StringBuilder()).append("Unknown update op type for ").append(((Object) (updateop))).toString());
	//    8   60:new             #127 <Class IllegalArgumentException>
	//    9   63:dup             
	//   10   64:new             #137 <Class StringBuilder>
	//   11   67:dup             
	//   12   68:invokespecial   #138 <Method void StringBuilder()>
	//   13   71:ldc1            #161 <String "Unknown update op type for ">
	//   14   73:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   15   76:aload_1         
	//   16   77:invokevirtual   #147 <Method StringBuilder StringBuilder.append(Object)>
	//   17   80:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   18   83:invokespecial   #132 <Method void IllegalArgumentException(String)>
	//   19   86:athrow          

		case 1: // '\001'
			mCallback.offsetPositionsForAdd(updateop.positionStart, updateop.itemCount);
	//   20   87:aload_0         
	//   21   88:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   22   91:aload_1         
	//   23   92:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   24   95:aload_1         
	//   25   96:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   26   99:invokeinterface #165 <Method void AdapterHelper$Callback.offsetPositionsForAdd(int, int)>
			return;
	//   27  104:return          

		case 8: // '\b'
			mCallback.offsetPositionsForMove(updateop.positionStart, updateop.itemCount);
	//   28  105:aload_0         
	//   29  106:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   30  109:aload_1         
	//   31  110:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   32  113:aload_1         
	//   33  114:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   34  117:invokeinterface #168 <Method void AdapterHelper$Callback.offsetPositionsForMove(int, int)>
			return;
	//   35  122:return          

		case 2: // '\002'
			mCallback.offsetPositionsForRemovingLaidOutOrNewView(updateop.positionStart, updateop.itemCount);
	//   36  123:aload_0         
	//   37  124:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   38  127:aload_1         
	//   39  128:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   40  131:aload_1         
	//   41  132:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   42  135:invokeinterface #171 <Method void AdapterHelper$Callback.offsetPositionsForRemovingLaidOutOrNewView(int, int)>
			return;
	//   43  140:return          

		case 4: // '\004'
			mCallback.markViewHoldersUpdated(updateop.positionStart, updateop.itemCount, updateop.payload);
	//   44  141:aload_0         
	//   45  142:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   46  145:aload_1         
	//   47  146:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   48  149:aload_1         
	//   49  150:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   50  153:aload_1         
	//   51  154:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//   52  157:invokeinterface #175 <Method void AdapterHelper$Callback.markViewHoldersUpdated(int, int, Object)>
			return;
	//   53  162:return          
		}
	}

	private int updatePositionWithPostponed(int i, int j)
	{
		int k = mPostponedList.size() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field ArrayList mPostponedList>
	//    2    4:invokevirtual   #114 <Method int ArrayList.size()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_3        
		int l = i;
	//    6   10:iload_1         
	//    7   11:istore          4
		do
		{
			if(k >= 0)
	//*   8   13:iload_3         
	//*   9   14:iflt            392
			{
				UpdateOp updateop = (UpdateOp)mPostponedList.get(k);
	//   10   17:aload_0         
	//   11   18:getfield        #61  <Field ArrayList mPostponedList>
	//   12   21:iload_3         
	//   13   22:invokevirtual   #118 <Method Object ArrayList.get(int)>
	//   14   25:checkcast       #11  <Class AdapterHelper$UpdateOp>
	//   15   28:astore          6
				if(updateop.cmd == 8)
	//*  16   30:aload           6
	//*  17   32:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//*  18   35:bipush          8
	//*  19   37:icmpne          288
				{
					int i1;
					if(updateop.positionStart < updateop.itemCount)
	//*  20   40:aload           6
	//*  21   42:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  22   45:aload           6
	//*  23   47:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  24   50:icmpge          121
					{
						i1 = updateop.positionStart;
	//   25   53:aload           6
	//   26   55:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   27   58:istore          5
						i = updateop.itemCount;
	//   28   60:aload           6
	//   29   62:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   30   65:istore_1        
					} else
	//*  31   66:iload           4
	//*  32   68:iload           5
	//*  33   70:icmplt          202
	//*  34   73:iload           4
	//*  35   75:iload_1         
	//*  36   76:icmpgt          202
	//*  37   79:iload           5
	//*  38   81:aload           6
	//*  39   83:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  40   86:icmpne          157
	//*  41   89:iload_2         
	//*  42   90:iconst_1        
	//*  43   91:icmpne          137
	//*  44   94:aload           6
	//*  45   96:aload           6
	//*  46   98:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  47  101:iconst_1        
	//*  48  102:iadd            
	//*  49  103:putfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  50  106:iload           4
	//*  51  108:iconst_1        
	//*  52  109:iadd            
	//*  53  110:istore_1        
	//*  54  111:iload_3         
	//*  55  112:iconst_1        
	//*  56  113:isub            
	//*  57  114:istore_3        
	//*  58  115:iload_1         
	//*  59  116:istore          4
	//*  60  118:goto            13
					{
						i1 = updateop.itemCount;
	//   61  121:aload           6
	//   62  123:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   63  126:istore          5
						i = updateop.positionStart;
	//   64  128:aload           6
	//   65  130:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   66  133:istore_1        
					}
					if(l >= i1 && l <= i)
					{
						if(i1 == updateop.positionStart)
						{
							if(j == 1)
								updateop.itemCount = updateop.itemCount + 1;
							else
	//*  67  134:goto            66
							if(j == 2)
	//*  68  137:iload_2         
	//*  69  138:iconst_2        
	//*  70  139:icmpne          106
								updateop.itemCount = updateop.itemCount - 1;
	//   71  142:aload           6
	//   72  144:aload           6
	//   73  146:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   74  149:iconst_1        
	//   75  150:isub            
	//   76  151:putfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
							i = l + 1;
						} else
	//*  77  154:goto            106
						{
							if(j == 1)
	//*  78  157:iload_2         
	//*  79  158:iconst_1        
	//*  80  159:icmpne          182
								updateop.positionStart = updateop.positionStart + 1;
	//   81  162:aload           6
	//   82  164:aload           6
	//   83  166:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   84  169:iconst_1        
	//   85  170:iadd            
	//   86  171:putfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
							else
	//*  87  174:iload           4
	//*  88  176:iconst_1        
	//*  89  177:isub            
	//*  90  178:istore_1        
	//*  91  179:goto            111
							if(j == 2)
	//*  92  182:iload_2         
	//*  93  183:iconst_2        
	//*  94  184:icmpne          174
								updateop.positionStart = updateop.positionStart - 1;
	//   95  187:aload           6
	//   96  189:aload           6
	//   97  191:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   98  194:iconst_1        
	//   99  195:isub            
	//  100  196:putfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
							i = l - 1;
						}
					} else
	//* 101  199:goto            174
					{
						i = l;
	//  102  202:iload           4
	//  103  204:istore_1        
						if(l < updateop.positionStart)
	//* 104  205:iload           4
	//* 105  207:aload           6
	//* 106  209:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 107  212:icmpge          111
							if(j == 1)
	//* 108  215:iload_2         
	//* 109  216:iconst_1        
	//* 110  217:icmpne          250
							{
								updateop.positionStart = updateop.positionStart + 1;
	//  111  220:aload           6
	//  112  222:aload           6
	//  113  224:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//  114  227:iconst_1        
	//  115  228:iadd            
	//  116  229:putfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
								updateop.itemCount = updateop.itemCount + 1;
	//  117  232:aload           6
	//  118  234:aload           6
	//  119  236:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//  120  239:iconst_1        
	//  121  240:iadd            
	//  122  241:putfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
								i = l;
	//  123  244:iload           4
	//  124  246:istore_1        
							} else
	//* 125  247:goto            111
							{
								i = l;
	//  126  250:iload           4
	//  127  252:istore_1        
								if(j == 2)
	//* 128  253:iload_2         
	//* 129  254:iconst_2        
	//* 130  255:icmpne          111
								{
									updateop.positionStart = updateop.positionStart - 1;
	//  131  258:aload           6
	//  132  260:aload           6
	//  133  262:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//  134  265:iconst_1        
	//  135  266:isub            
	//  136  267:putfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
									updateop.itemCount = updateop.itemCount - 1;
	//  137  270:aload           6
	//  138  272:aload           6
	//  139  274:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//  140  277:iconst_1        
	//  141  278:isub            
	//  142  279:putfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
									i = l;
	//  143  282:iload           4
	//  144  284:istore_1        
								}
							}
					}
				} else
	//* 145  285:goto            111
				if(updateop.positionStart <= l)
	//* 146  288:aload           6
	//* 147  290:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 148  293:iload           4
	//* 149  295:icmpgt          343
				{
					if(updateop.cmd == 1)
	//* 150  298:aload           6
	//* 151  300:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//* 152  303:iconst_1        
	//* 153  304:icmpne          319
					{
						i = l - updateop.itemCount;
	//  154  307:iload           4
	//  155  309:aload           6
	//  156  311:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//  157  314:isub            
	//  158  315:istore_1        
					} else
	//* 159  316:goto            111
					{
						i = l;
	//  160  319:iload           4
	//  161  321:istore_1        
						if(updateop.cmd == 2)
	//* 162  322:aload           6
	//* 163  324:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//* 164  327:iconst_2        
	//* 165  328:icmpne          111
							i = l + updateop.itemCount;
	//  166  331:iload           4
	//  167  333:aload           6
	//  168  335:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//  169  338:iadd            
	//  170  339:istore_1        
					}
				} else
	//* 171  340:goto            111
				if(j == 1)
	//* 172  343:iload_2         
	//* 173  344:iconst_1        
	//* 174  345:icmpne          366
				{
					updateop.positionStart = updateop.positionStart + 1;
	//  175  348:aload           6
	//  176  350:aload           6
	//  177  352:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//  178  355:iconst_1        
	//  179  356:iadd            
	//  180  357:putfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
					i = l;
	//  181  360:iload           4
	//  182  362:istore_1        
				} else
	//* 183  363:goto            111
				{
					i = l;
	//  184  366:iload           4
	//  185  368:istore_1        
					if(j == 2)
	//* 186  369:iload_2         
	//* 187  370:iconst_2        
	//* 188  371:icmpne          111
					{
						updateop.positionStart = updateop.positionStart - 1;
	//  189  374:aload           6
	//  190  376:aload           6
	//  191  378:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//  192  381:iconst_1        
	//  193  382:isub            
	//  194  383:putfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
						i = l;
	//  195  386:iload           4
	//  196  388:istore_1        
					}
				}
				k--;
				l = i;
				continue;
			}
	//* 197  389:goto            111
			i = mPostponedList.size() - 1;
	//  198  392:aload_0         
	//  199  393:getfield        #61  <Field ArrayList mPostponedList>
	//  200  396:invokevirtual   #114 <Method int ArrayList.size()>
	//  201  399:iconst_1        
	//  202  400:isub            
	//  203  401:istore_1        
			while(i >= 0) 
	//* 204  402:iload_1         
	//* 205  403:iflt            498
			{
				UpdateOp updateop1 = (UpdateOp)mPostponedList.get(i);
	//  206  406:aload_0         
	//  207  407:getfield        #61  <Field ArrayList mPostponedList>
	//  208  410:iload_1         
	//  209  411:invokevirtual   #118 <Method Object ArrayList.get(int)>
	//  210  414:checkcast       #11  <Class AdapterHelper$UpdateOp>
	//  211  417:astore          6
				if(updateop1.cmd == 8)
	//* 212  419:aload           6
	//* 213  421:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//* 214  424:bipush          8
	//* 215  426:icmpne          472
				{
					if(updateop1.itemCount == updateop1.positionStart || updateop1.itemCount < 0)
	//* 216  429:aload           6
	//* 217  431:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 218  434:aload           6
	//* 219  436:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 220  439:icmpeq          450
	//* 221  442:aload           6
	//* 222  444:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 223  447:ifge            465
					{
						mPostponedList.remove(i);
	//  224  450:aload_0         
	//  225  451:getfield        #61  <Field ArrayList mPostponedList>
	//  226  454:iload_1         
	//  227  455:invokevirtual   #178 <Method Object ArrayList.remove(int)>
	//  228  458:pop             
						recycleUpdateOp(updateop1);
	//  229  459:aload_0         
	//  230  460:aload           6
	//  231  462:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
					}
				} else
	//* 232  465:iload_1         
	//* 233  466:iconst_1        
	//* 234  467:isub            
	//* 235  468:istore_1        
	//* 236  469:goto            402
				if(updateop1.itemCount <= 0)
	//* 237  472:aload           6
	//* 238  474:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 239  477:ifgt            465
				{
					mPostponedList.remove(i);
	//  240  480:aload_0         
	//  241  481:getfield        #61  <Field ArrayList mPostponedList>
	//  242  484:iload_1         
	//  243  485:invokevirtual   #178 <Method Object ArrayList.remove(int)>
	//  244  488:pop             
					recycleUpdateOp(updateop1);
	//  245  489:aload_0         
	//  246  490:aload           6
	//  247  492:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
				}
				i--;
			}
	//* 248  495:goto            465
			return l;
	//  249  498:iload           4
	//  250  500:ireturn         
		} while(true);
	}

	transient AdapterHelper addUpdateOp(UpdateOp aupdateop[])
	{
		Collections.addAll(((java.util.Collection) (mPendingUpdates)), ((Object []) (aupdateop)));
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field ArrayList mPendingUpdates>
	//    2    4:aload_1         
	//    3    5:invokestatic    #186 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public int applyPendingUpdatesToPosition(int i)
	{
		int j;
		int l;
		int i1;
		i1 = mPendingUpdates.size();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field ArrayList mPendingUpdates>
	//    2    4:invokevirtual   #114 <Method int ArrayList.size()>
	//    3    7:istore          5
		l = 0;
	//    4    9:iconst_0        
	//    5   10:istore          4
		j = i;
	//    6   12:iload_1         
	//    7   13:istore_2        
_L7:
		i = j;
	//    8   14:iload_2         
	//    9   15:istore_1        
		if(l >= i1) goto _L2; else goto _L1
	//   10   16:iload           4
	//   11   18:iload           5
	//   12   20:icmpge          139
_L1:
		UpdateOp updateop = (UpdateOp)mPendingUpdates.get(l);
	//   13   23:aload_0         
	//   14   24:getfield        #59  <Field ArrayList mPendingUpdates>
	//   15   27:iload           4
	//   16   29:invokevirtual   #118 <Method Object ArrayList.get(int)>
	//   17   32:checkcast       #11  <Class AdapterHelper$UpdateOp>
	//   18   35:astore          6
		updateop.cmd;
	//   19   37:aload           6
	//   20   39:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
		JVM INSTR lookupswitch 3: default 76
	//	               1: 89
	//	               2: 111
	//	               8: 152;
	//   21   42:lookupswitch    3: default 76
	//	               1: 89
	//	               2: 111
	//	               8: 152
		   goto _L3 _L4 _L5 _L6
_L6:
		break MISSING_BLOCK_LABEL_152;
_L3:
		i = j;
	//   22   76:iload_2         
	//   23   77:istore_1        
_L8:
		l++;
	//   24   78:iload           4
	//   25   80:iconst_1        
	//   26   81:iadd            
	//   27   82:istore          4
		j = i;
	//   28   84:iload_1         
	//   29   85:istore_2        
		  goto _L7
	//*  30   86:goto            14
_L4:
		i = j;
	//   31   89:iload_2         
	//   32   90:istore_1        
		if(updateop.positionStart <= j)
	//*  33   91:aload           6
	//*  34   93:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  35   96:iload_2         
	//*  36   97:icmpgt          78
			i = j + updateop.itemCount;
	//   37  100:iload_2         
	//   38  101:aload           6
	//   39  103:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   40  106:iadd            
	//   41  107:istore_1        
		  goto _L8
	//*  42  108:goto            78
_L5:
		i = j;
	//   43  111:iload_2         
	//   44  112:istore_1        
		if(updateop.positionStart > j) goto _L8; else goto _L9
	//   45  113:aload           6
	//   46  115:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   47  118:iload_2         
	//   48  119:icmpgt          78
_L9:
		if(updateop.positionStart + updateop.itemCount <= j) goto _L11; else goto _L10
	//   49  122:aload           6
	//   50  124:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   51  127:aload           6
	//   52  129:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   53  132:iadd            
	//   54  133:iload_2         
	//   55  134:icmple          141
_L10:
		i = -1;
	//   56  137:iconst_m1       
	//   57  138:istore_1        
_L2:
		return i;
	//   58  139:iload_1         
	//   59  140:ireturn         
_L11:
		i = j - updateop.itemCount;
	//   60  141:iload_2         
	//   61  142:aload           6
	//   62  144:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   63  147:isub            
	//   64  148:istore_1        
		  goto _L8
	//*  65  149:goto            78
		if(updateop.positionStart == j)
	//*  66  152:aload           6
	//*  67  154:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  68  157:iload_2         
	//*  69  158:icmpne          170
		{
			i = updateop.itemCount;
	//   70  161:aload           6
	//   71  163:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   72  166:istore_1        
		} else
	//*  73  167:goto            78
		{
			int k = j;
	//   74  170:iload_2         
	//   75  171:istore_3        
			if(updateop.positionStart < j)
	//*  76  172:aload           6
	//*  77  174:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  78  177:iload_2         
	//*  79  178:icmpge          185
				k = j - 1;
	//   80  181:iload_2         
	//   81  182:iconst_1        
	//   82  183:isub            
	//   83  184:istore_3        
			i = k;
	//   84  185:iload_3         
	//   85  186:istore_1        
			if(updateop.itemCount <= k)
	//*  86  187:aload           6
	//*  87  189:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  88  192:iload_3         
	//*  89  193:icmpgt          78
				i = k + 1;
	//   90  196:iload_3         
	//   91  197:iconst_1        
	//   92  198:iadd            
	//   93  199:istore_1        
		}
		  goto _L8
	//*  94  200:goto            78
	}

	void consumePostponedUpdates()
	{
		int j = mPostponedList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field ArrayList mPostponedList>
	//    2    4:invokevirtual   #114 <Method int ArrayList.size()>
	//    3    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          42
			mCallback.onDispatchSecondPass((UpdateOp)mPostponedList.get(i));
	//    9   15:aload_0         
	//   10   16:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   11   19:aload_0         
	//   12   20:getfield        #61  <Field ArrayList mPostponedList>
	//   13   23:iload_1         
	//   14   24:invokevirtual   #118 <Method Object ArrayList.get(int)>
	//   15   27:checkcast       #11  <Class AdapterHelper$UpdateOp>
	//   16   30:invokeinterface #192 <Method void AdapterHelper$Callback.onDispatchSecondPass(AdapterHelper$UpdateOp)>

	//   17   35:iload_1         
	//   18   36:iconst_1        
	//   19   37:iadd            
	//   20   38:istore_1        
	//*  21   39:goto            10
		recycleUpdateOpsAndClearList(((List) (mPostponedList)));
	//   22   42:aload_0         
	//   23   43:aload_0         
	//   24   44:getfield        #61  <Field ArrayList mPostponedList>
	//   25   47:invokevirtual   #196 <Method void recycleUpdateOpsAndClearList(List)>
		mExistingUpdateTypes = 0;
	//   26   50:aload_0         
	//   27   51:iconst_0        
	//   28   52:putfield        #63  <Field int mExistingUpdateTypes>
	//   29   55:return          
	}

	void consumeUpdatesInOnePass()
	{
		int i;
		int j;
		consumePostponedUpdates();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #199 <Method void consumePostponedUpdates()>
		j = mPendingUpdates.size();
	//    2    4:aload_0         
	//    3    5:getfield        #59  <Field ArrayList mPendingUpdates>
	//    4    8:invokevirtual   #114 <Method int ArrayList.size()>
	//    5   11:istore_2        
		i = 0;
	//    6   12:iconst_0        
	//    7   13:istore_1        
_L7:
		UpdateOp updateop;
		if(i >= j)
			break MISSING_BLOCK_LABEL_227;
	//    8   14:iload_1         
	//    9   15:iload_2         
	//   10   16:icmpge          227
		updateop = (UpdateOp)mPendingUpdates.get(i);
	//   11   19:aload_0         
	//   12   20:getfield        #59  <Field ArrayList mPendingUpdates>
	//   13   23:iload_1         
	//   14   24:invokevirtual   #118 <Method Object ArrayList.get(int)>
	//   15   27:checkcast       #11  <Class AdapterHelper$UpdateOp>
	//   16   30:astore_3        
		updateop.cmd;
	//   17   31:aload_3         
	//   18   32:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
		JVM INSTR tableswitch 1 8: default 80
	//	               1 103
	//	               2 133
	//	               3 80
	//	               4 163
	//	               5 80
	//	               6 80
	//	               7 80
	//	               8 197;
	//   19   35:tableswitch     1 8: default 80
	//	               1 103
	//	               2 133
	//	               3 80
	//	               4 163
	//	               5 80
	//	               6 80
	//	               7 80
	//	               8 197
		   goto _L1 _L2 _L3 _L1 _L4 _L1 _L1 _L1 _L5
_L5:
		break MISSING_BLOCK_LABEL_197;
_L1:
		break; /* Loop/switch isn't completed */
_L2:
		break; /* Loop/switch isn't completed */
_L8:
		if(mOnItemProcessedCallback != null)
	//*  20   80:aload_0         
	//*  21   81:getfield        #201 <Field Runnable mOnItemProcessedCallback>
	//*  22   84:ifnull          96
			mOnItemProcessedCallback.run();
	//   23   87:aload_0         
	//   24   88:getfield        #201 <Field Runnable mOnItemProcessedCallback>
	//   25   91:invokeinterface #206 <Method void Runnable.run()>
		i++;
	//   26   96:iload_1         
	//   27   97:iconst_1        
	//   28   98:iadd            
	//   29   99:istore_1        
		if(true) goto _L7; else goto _L6
	//   30  100:goto            14
_L6:
		mCallback.onDispatchSecondPass(updateop);
	//   31  103:aload_0         
	//   32  104:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   33  107:aload_3         
	//   34  108:invokeinterface #192 <Method void AdapterHelper$Callback.onDispatchSecondPass(AdapterHelper$UpdateOp)>
		mCallback.offsetPositionsForAdd(updateop.positionStart, updateop.itemCount);
	//   35  113:aload_0         
	//   36  114:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   37  117:aload_3         
	//   38  118:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   39  121:aload_3         
	//   40  122:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   41  125:invokeinterface #165 <Method void AdapterHelper$Callback.offsetPositionsForAdd(int, int)>
		  goto _L8
	//*  42  130:goto            80
_L3:
		mCallback.onDispatchSecondPass(updateop);
	//   43  133:aload_0         
	//   44  134:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   45  137:aload_3         
	//   46  138:invokeinterface #192 <Method void AdapterHelper$Callback.onDispatchSecondPass(AdapterHelper$UpdateOp)>
		mCallback.offsetPositionsForRemovingInvisible(updateop.positionStart, updateop.itemCount);
	//   47  143:aload_0         
	//   48  144:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   49  147:aload_3         
	//   50  148:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   51  151:aload_3         
	//   52  152:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   53  155:invokeinterface #209 <Method void AdapterHelper$Callback.offsetPositionsForRemovingInvisible(int, int)>
		  goto _L8
	//*  54  160:goto            80
_L4:
		mCallback.onDispatchSecondPass(updateop);
	//   55  163:aload_0         
	//   56  164:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   57  167:aload_3         
	//   58  168:invokeinterface #192 <Method void AdapterHelper$Callback.onDispatchSecondPass(AdapterHelper$UpdateOp)>
		mCallback.markViewHoldersUpdated(updateop.positionStart, updateop.itemCount, updateop.payload);
	//   59  173:aload_0         
	//   60  174:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   61  177:aload_3         
	//   62  178:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   63  181:aload_3         
	//   64  182:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   65  185:aload_3         
	//   66  186:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//   67  189:invokeinterface #175 <Method void AdapterHelper$Callback.markViewHoldersUpdated(int, int, Object)>
		  goto _L8
	//*  68  194:goto            80
		mCallback.onDispatchSecondPass(updateop);
	//   69  197:aload_0         
	//   70  198:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   71  201:aload_3         
	//   72  202:invokeinterface #192 <Method void AdapterHelper$Callback.onDispatchSecondPass(AdapterHelper$UpdateOp)>
		mCallback.offsetPositionsForMove(updateop.positionStart, updateop.itemCount);
	//   73  207:aload_0         
	//   74  208:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   75  211:aload_3         
	//   76  212:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   77  215:aload_3         
	//   78  216:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   79  219:invokeinterface #168 <Method void AdapterHelper$Callback.offsetPositionsForMove(int, int)>
		  goto _L8
	//*  80  224:goto            80
		recycleUpdateOpsAndClearList(((List) (mPendingUpdates)));
	//   81  227:aload_0         
	//   82  228:aload_0         
	//   83  229:getfield        #59  <Field ArrayList mPendingUpdates>
	//   84  232:invokevirtual   #196 <Method void recycleUpdateOpsAndClearList(List)>
		mExistingUpdateTypes = 0;
	//   85  235:aload_0         
	//   86  236:iconst_0        
	//   87  237:putfield        #63  <Field int mExistingUpdateTypes>
		return;
	//   88  240:return          
	}

	void dispatchFirstPassAndUpdateViewHolders(UpdateOp updateop, int i)
	{
		mCallback.onDispatchFirstPass(updateop);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #212 <Method void AdapterHelper$Callback.onDispatchFirstPass(AdapterHelper$UpdateOp)>
		switch(updateop.cmd)
	//*   4   10:aload_1         
	//*   5   11:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
		{
	//*   6   14:tableswitch     2 4: default 40
	//	               2 50
	//	               3 40
	//	               4 65
		case 3: // '\003'
		default:
			throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
	//    7   40:new             #127 <Class IllegalArgumentException>
	//    8   43:dup             
	//    9   44:ldc1            #214 <String "only remove and update ops can be dispatched in first pass">
	//   10   46:invokespecial   #132 <Method void IllegalArgumentException(String)>
	//   11   49:athrow          

		case 2: // '\002'
			mCallback.offsetPositionsForRemovingInvisible(i, updateop.itemCount);
	//   12   50:aload_0         
	//   13   51:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   14   54:iload_2         
	//   15   55:aload_1         
	//   16   56:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   17   59:invokeinterface #209 <Method void AdapterHelper$Callback.offsetPositionsForRemovingInvisible(int, int)>
			return;
	//   18   64:return          

		case 4: // '\004'
			mCallback.markViewHoldersUpdated(i, updateop.itemCount, updateop.payload);
	//   19   65:aload_0         
	//   20   66:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   21   69:iload_2         
	//   22   70:aload_1         
	//   23   71:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   24   74:aload_1         
	//   25   75:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//   26   78:invokeinterface #175 <Method void AdapterHelper$Callback.markViewHoldersUpdated(int, int, Object)>
			break;
		}
	//   27   83:return          
	}

	int findPositionOffset(int i)
	{
		return findPositionOffset(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #125 <Method int findPositionOffset(int, int)>
	//    4    6:ireturn         
	}

	int findPositionOffset(int i, int j)
	{
		int l;
		int i1;
		i1 = mPostponedList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field ArrayList mPostponedList>
	//    2    4:invokevirtual   #114 <Method int ArrayList.size()>
	//    3    7:istore          5
		l = j;
	//    4    9:iload_2         
	//    5   10:istore          4
		j = i;
	//    6   12:iload_1         
	//    7   13:istore_2        
_L5:
		i = j;
	//    8   14:iload_2         
	//    9   15:istore_1        
		if(l >= i1) goto _L2; else goto _L1
	//   10   16:iload           4
	//   11   18:iload           5
	//   12   20:icmpge          143
_L1:
		UpdateOp updateop = (UpdateOp)mPostponedList.get(l);
	//   13   23:aload_0         
	//   14   24:getfield        #61  <Field ArrayList mPostponedList>
	//   15   27:iload           4
	//   16   29:invokevirtual   #118 <Method Object ArrayList.get(int)>
	//   17   32:checkcast       #11  <Class AdapterHelper$UpdateOp>
	//   18   35:astore          6
		if(updateop.cmd != 8) goto _L4; else goto _L3
	//   19   37:aload           6
	//   20   39:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//   21   42:bipush          8
	//   22   44:icmpne          106
_L3:
		if(updateop.positionStart == j)
	//*  23   47:aload           6
	//*  24   49:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  25   52:iload_2         
	//*  26   53:icmpne          73
		{
			i = updateop.itemCount;
	//   27   56:aload           6
	//   28   58:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   29   61:istore_1        
		} else
	//*  30   62:iload           4
	//*  31   64:iconst_1        
	//*  32   65:iadd            
	//*  33   66:istore          4
	//*  34   68:iload_1         
	//*  35   69:istore_2        
	//*  36   70:goto            14
		{
			int k = j;
	//   37   73:iload_2         
	//   38   74:istore_3        
			if(updateop.positionStart < j)
	//*  39   75:aload           6
	//*  40   77:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  41   80:iload_2         
	//*  42   81:icmpge          88
				k = j - 1;
	//   43   84:iload_2         
	//   44   85:iconst_1        
	//   45   86:isub            
	//   46   87:istore_3        
			i = k;
	//   47   88:iload_3         
	//   48   89:istore_1        
			if(updateop.itemCount <= k)
	//*  49   90:aload           6
	//*  50   92:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  51   95:iload_3         
	//*  52   96:icmpgt          62
				i = k + 1;
	//   53   99:iload_3         
	//   54  100:iconst_1        
	//   55  101:iadd            
	//   56  102:istore_1        
		}
_L7:
		l++;
		j = i;
		  goto _L5
	//*  57  103:goto            62
_L4:
		i = j;
	//   58  106:iload_2         
	//   59  107:istore_1        
		if(updateop.positionStart > j) goto _L7; else goto _L6
	//   60  108:aload           6
	//   61  110:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   62  113:iload_2         
	//   63  114:icmpgt          62
_L6:
		if(updateop.cmd != 2)
			break MISSING_BLOCK_LABEL_156;
	//   64  117:aload           6
	//   65  119:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//   66  122:iconst_2        
	//   67  123:icmpne          156
		if(j >= updateop.positionStart + updateop.itemCount) goto _L9; else goto _L8
	//   68  126:iload_2         
	//   69  127:aload           6
	//   70  129:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   71  132:aload           6
	//   72  134:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   73  137:iadd            
	//   74  138:icmpge          145
_L8:
		i = -1;
	//   75  141:iconst_m1       
	//   76  142:istore_1        
_L2:
		return i;
	//   77  143:iload_1         
	//   78  144:ireturn         
_L9:
		i = j - updateop.itemCount;
	//   79  145:iload_2         
	//   80  146:aload           6
	//   81  148:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   82  151:isub            
	//   83  152:istore_1        
		  goto _L7
	//*  84  153:goto            62
		i = j;
	//   85  156:iload_2         
	//   86  157:istore_1        
		if(updateop.cmd == 1)
	//*  87  158:aload           6
	//*  88  160:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//*  89  163:iconst_1        
	//*  90  164:icmpne          62
			i = j + updateop.itemCount;
	//   91  167:iload_2         
	//   92  168:aload           6
	//   93  170:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   94  173:iadd            
	//   95  174:istore_1        
		  goto _L7
	//*  96  175:goto            62
	}

	boolean hasAnyUpdateTypes(int i)
	{
		return (mExistingUpdateTypes & i) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int mExistingUpdateTypes>
	//    2    4:iload_1         
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	boolean hasPendingUpdates()
	{
		return mPendingUpdates.size() > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field ArrayList mPendingUpdates>
	//    2    4:invokevirtual   #114 <Method int ArrayList.size()>
	//    3    7:ifle            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	boolean hasUpdates()
	{
		return !mPostponedList.isEmpty() && !mPendingUpdates.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field ArrayList mPostponedList>
	//    2    4:invokevirtual   #221 <Method boolean ArrayList.isEmpty()>
	//    3    7:ifne            22
	//    4   10:aload_0         
	//    5   11:getfield        #59  <Field ArrayList mPendingUpdates>
	//    6   14:invokevirtual   #221 <Method boolean ArrayList.isEmpty()>
	//    7   17:ifne            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public UpdateOp obtainUpdateOp(int i, int j, int k, Object obj)
	{
		UpdateOp updateop = (UpdateOp)mUpdateOpPool.acquire();
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field android.support.v4.util.Pools$Pool mUpdateOpPool>
	//    2    4:invokeinterface #227 <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    3    9:checkcast       #11  <Class AdapterHelper$UpdateOp>
	//    4   12:astore          5
		if(updateop == null)
	//*   5   14:aload           5
	//*   6   16:ifnonnull       32
		{
			return new UpdateOp(i, j, k, obj);
	//    7   19:new             #11  <Class AdapterHelper$UpdateOp>
	//    8   22:dup             
	//    9   23:iload_1         
	//   10   24:iload_2         
	//   11   25:iload_3         
	//   12   26:aload           4
	//   13   28:invokespecial   #230 <Method void AdapterHelper$UpdateOp(int, int, int, Object)>
	//   14   31:areturn         
		} else
		{
			updateop.cmd = i;
	//   15   32:aload           5
	//   16   34:iload_1         
	//   17   35:putfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
			updateop.positionStart = j;
	//   18   38:aload           5
	//   19   40:iload_2         
	//   20   41:putfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
			updateop.itemCount = k;
	//   21   44:aload           5
	//   22   46:iload_3         
	//   23   47:putfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
			updateop.payload = obj;
	//   24   50:aload           5
	//   25   52:aload           4
	//   26   54:putfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
			return updateop;
	//   27   57:aload           5
	//   28   59:areturn         
		}
	}

	boolean onItemRangeChanged(int i, int j, Object obj)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		if(j < 1)
	//*   2    3:iload_2         
	//*   3    4:iconst_1        
	//*   4    5:icmpge          10
			return false;
	//    5    8:iconst_0        
	//    6    9:ireturn         
		mPendingUpdates.add(((Object) (obtainUpdateOp(4, i, j, obj))));
	//    7   10:aload_0         
	//    8   11:getfield        #59  <Field ArrayList mPendingUpdates>
	//    9   14:aload_0         
	//   10   15:iconst_4        
	//   11   16:iload_1         
	//   12   17:iload_2         
	//   13   18:aload_3         
	//   14   19:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//   15   22:invokevirtual   #159 <Method boolean ArrayList.add(Object)>
	//   16   25:pop             
		mExistingUpdateTypes = mExistingUpdateTypes | 4;
	//   17   26:aload_0         
	//   18   27:aload_0         
	//   19   28:getfield        #63  <Field int mExistingUpdateTypes>
	//   20   31:iconst_4        
	//   21   32:ior             
	//   22   33:putfield        #63  <Field int mExistingUpdateTypes>
		if(mPendingUpdates.size() != 1)
	//*  23   36:aload_0         
	//*  24   37:getfield        #59  <Field ArrayList mPendingUpdates>
	//*  25   40:invokevirtual   #114 <Method int ArrayList.size()>
	//*  26   43:iconst_1        
	//*  27   44:icmpne          50
	//*  28   47:iload           4
	//*  29   49:ireturn         
			flag = false;
	//   30   50:iconst_0        
	//   31   51:istore          4
		return flag;
	//*  32   53:goto            47
	}

	boolean onItemRangeInserted(int i, int j)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		if(j < 1)
	//*   2    2:iload_2         
	//*   3    3:iconst_1        
	//*   4    4:icmpge          9
			return false;
	//    5    7:iconst_0        
	//    6    8:ireturn         
		mPendingUpdates.add(((Object) (obtainUpdateOp(1, i, j, ((Object) (null))))));
	//    7    9:aload_0         
	//    8   10:getfield        #59  <Field ArrayList mPendingUpdates>
	//    9   13:aload_0         
	//   10   14:iconst_1        
	//   11   15:iload_1         
	//   12   16:iload_2         
	//   13   17:aconst_null     
	//   14   18:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//   15   21:invokevirtual   #159 <Method boolean ArrayList.add(Object)>
	//   16   24:pop             
		mExistingUpdateTypes = mExistingUpdateTypes | 1;
	//   17   25:aload_0         
	//   18   26:aload_0         
	//   19   27:getfield        #63  <Field int mExistingUpdateTypes>
	//   20   30:iconst_1        
	//   21   31:ior             
	//   22   32:putfield        #63  <Field int mExistingUpdateTypes>
		if(mPendingUpdates.size() != 1)
	//*  23   35:aload_0         
	//*  24   36:getfield        #59  <Field ArrayList mPendingUpdates>
	//*  25   39:invokevirtual   #114 <Method int ArrayList.size()>
	//*  26   42:iconst_1        
	//*  27   43:icmpne          48
	//*  28   46:iload_3         
	//*  29   47:ireturn         
			flag = false;
	//   30   48:iconst_0        
	//   31   49:istore_3        
		return flag;
	//*  32   50:goto            46
	}

	boolean onItemRangeMoved(int i, int j, int k)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		if(i == j)
	//*   2    3:iload_1         
	//*   3    4:iload_2         
	//*   4    5:icmpne          10
			return false;
	//    5    8:iconst_0        
	//    6    9:ireturn         
		if(k != 1)
	//*   7   10:iload_3         
	//*   8   11:iconst_1        
	//*   9   12:icmpeq          25
			throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
	//   10   15:new             #127 <Class IllegalArgumentException>
	//   11   18:dup             
	//   12   19:ldc1            #238 <String "Moving more than 1 item is not supported yet">
	//   13   21:invokespecial   #132 <Method void IllegalArgumentException(String)>
	//   14   24:athrow          
		mPendingUpdates.add(((Object) (obtainUpdateOp(8, i, j, ((Object) (null))))));
	//   15   25:aload_0         
	//   16   26:getfield        #59  <Field ArrayList mPendingUpdates>
	//   17   29:aload_0         
	//   18   30:bipush          8
	//   19   32:iload_1         
	//   20   33:iload_2         
	//   21   34:aconst_null     
	//   22   35:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//   23   38:invokevirtual   #159 <Method boolean ArrayList.add(Object)>
	//   24   41:pop             
		mExistingUpdateTypes = mExistingUpdateTypes | 8;
	//   25   42:aload_0         
	//   26   43:aload_0         
	//   27   44:getfield        #63  <Field int mExistingUpdateTypes>
	//   28   47:bipush          8
	//   29   49:ior             
	//   30   50:putfield        #63  <Field int mExistingUpdateTypes>
		if(mPendingUpdates.size() != 1)
	//*  31   53:aload_0         
	//*  32   54:getfield        #59  <Field ArrayList mPendingUpdates>
	//*  33   57:invokevirtual   #114 <Method int ArrayList.size()>
	//*  34   60:iconst_1        
	//*  35   61:icmpne          67
	//*  36   64:iload           4
	//*  37   66:ireturn         
			flag = false;
	//   38   67:iconst_0        
	//   39   68:istore          4
		return flag;
	//*  40   70:goto            64
	}

	boolean onItemRangeRemoved(int i, int j)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		if(j < 1)
	//*   2    2:iload_2         
	//*   3    3:iconst_1        
	//*   4    4:icmpge          9
			return false;
	//    5    7:iconst_0        
	//    6    8:ireturn         
		mPendingUpdates.add(((Object) (obtainUpdateOp(2, i, j, ((Object) (null))))));
	//    7    9:aload_0         
	//    8   10:getfield        #59  <Field ArrayList mPendingUpdates>
	//    9   13:aload_0         
	//   10   14:iconst_2        
	//   11   15:iload_1         
	//   12   16:iload_2         
	//   13   17:aconst_null     
	//   14   18:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//   15   21:invokevirtual   #159 <Method boolean ArrayList.add(Object)>
	//   16   24:pop             
		mExistingUpdateTypes = mExistingUpdateTypes | 2;
	//   17   25:aload_0         
	//   18   26:aload_0         
	//   19   27:getfield        #63  <Field int mExistingUpdateTypes>
	//   20   30:iconst_2        
	//   21   31:ior             
	//   22   32:putfield        #63  <Field int mExistingUpdateTypes>
		if(mPendingUpdates.size() != 1)
	//*  23   35:aload_0         
	//*  24   36:getfield        #59  <Field ArrayList mPendingUpdates>
	//*  25   39:invokevirtual   #114 <Method int ArrayList.size()>
	//*  26   42:iconst_1        
	//*  27   43:icmpne          48
	//*  28   46:iload_3         
	//*  29   47:ireturn         
			flag = false;
	//   30   48:iconst_0        
	//   31   49:istore_3        
		return flag;
	//*  32   50:goto            46
	}

	void preProcess()
	{
		int i;
		int j;
		mOpReorderer.reorderOps(((List) (mPendingUpdates)));
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field OpReorderer mOpReorderer>
	//    2    4:aload_0         
	//    3    5:getfield        #59  <Field ArrayList mPendingUpdates>
	//    4    8:invokevirtual   #243 <Method void OpReorderer.reorderOps(List)>
		j = mPendingUpdates.size();
	//    5   11:aload_0         
	//    6   12:getfield        #59  <Field ArrayList mPendingUpdates>
	//    7   15:invokevirtual   #114 <Method int ArrayList.size()>
	//    8   18:istore_2        
		i = 0;
	//    9   19:iconst_0        
	//   10   20:istore_1        
_L7:
		UpdateOp updateop;
		if(i >= j)
			break MISSING_BLOCK_LABEL_143;
	//   11   21:iload_1         
	//   12   22:iload_2         
	//   13   23:icmpge          143
		updateop = (UpdateOp)mPendingUpdates.get(i);
	//   14   26:aload_0         
	//   15   27:getfield        #59  <Field ArrayList mPendingUpdates>
	//   16   30:iload_1         
	//   17   31:invokevirtual   #118 <Method Object ArrayList.get(int)>
	//   18   34:checkcast       #11  <Class AdapterHelper$UpdateOp>
	//   19   37:astore_3        
		updateop.cmd;
	//   20   38:aload_3         
	//   21   39:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
		JVM INSTR tableswitch 1 8: default 88
	//	               1 111
	//	               2 119
	//	               3 88
	//	               4 127
	//	               5 88
	//	               6 88
	//	               7 88
	//	               8 135;
	//   22   42:tableswitch     1 8: default 88
	//	               1 111
	//	               2 119
	//	               3 88
	//	               4 127
	//	               5 88
	//	               6 88
	//	               7 88
	//	               8 135
		   goto _L1 _L2 _L3 _L1 _L4 _L1 _L1 _L1 _L5
_L5:
		break MISSING_BLOCK_LABEL_135;
_L1:
		break; /* Loop/switch isn't completed */
_L2:
		break; /* Loop/switch isn't completed */
_L8:
		if(mOnItemProcessedCallback != null)
	//*  23   88:aload_0         
	//*  24   89:getfield        #201 <Field Runnable mOnItemProcessedCallback>
	//*  25   92:ifnull          104
			mOnItemProcessedCallback.run();
	//   26   95:aload_0         
	//   27   96:getfield        #201 <Field Runnable mOnItemProcessedCallback>
	//   28   99:invokeinterface #206 <Method void Runnable.run()>
		i++;
	//   29  104:iload_1         
	//   30  105:iconst_1        
	//   31  106:iadd            
	//   32  107:istore_1        
		if(true) goto _L7; else goto _L6
	//   33  108:goto            21
_L6:
		applyAdd(updateop);
	//   34  111:aload_0         
	//   35  112:aload_3         
	//   36  113:invokespecial   #245 <Method void applyAdd(AdapterHelper$UpdateOp)>
		  goto _L8
	//*  37  116:goto            88
_L3:
		applyRemove(updateop);
	//   38  119:aload_0         
	//   39  120:aload_3         
	//   40  121:invokespecial   #247 <Method void applyRemove(AdapterHelper$UpdateOp)>
		  goto _L8
	//*  41  124:goto            88
_L4:
		applyUpdate(updateop);
	//   42  127:aload_0         
	//   43  128:aload_3         
	//   44  129:invokespecial   #249 <Method void applyUpdate(AdapterHelper$UpdateOp)>
		  goto _L8
	//*  45  132:goto            88
		applyMove(updateop);
	//   46  135:aload_0         
	//   47  136:aload_3         
	//   48  137:invokespecial   #251 <Method void applyMove(AdapterHelper$UpdateOp)>
		  goto _L8
	//*  49  140:goto            88
		mPendingUpdates.clear();
	//   50  143:aload_0         
	//   51  144:getfield        #59  <Field ArrayList mPendingUpdates>
	//   52  147:invokevirtual   #254 <Method void ArrayList.clear()>
		return;
	//   53  150:return          
	}

	public void recycleUpdateOp(UpdateOp updateop)
	{
		if(!mDisableRecycler)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field boolean mDisableRecycler>
	//*   2    4:ifne            23
		{
			updateop.payload = null;
	//    3    7:aload_1         
	//    4    8:aconst_null     
	//    5    9:putfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
			mUpdateOpPool.release(((Object) (updateop)));
	//    6   12:aload_0         
	//    7   13:getfield        #54  <Field android.support.v4.util.Pools$Pool mUpdateOpPool>
	//    8   16:aload_1         
	//    9   17:invokeinterface #257 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   10   22:pop             
		}
	//   11   23:return          
	}

	void recycleUpdateOpsAndClearList(List list)
	{
		int j = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #260 <Method int List.size()>
	//    2    6:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_2        
	//*   5    9:iload_2         
	//*   6   10:iload_3         
	//*   7   11:icmpge          35
			recycleUpdateOp((UpdateOp)list.get(i));
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:invokeinterface #261 <Method Object List.get(int)>
	//   12   22:checkcast       #11  <Class AdapterHelper$UpdateOp>
	//   13   25:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>

	//   14   28:iload_2         
	//   15   29:iconst_1        
	//   16   30:iadd            
	//   17   31:istore_2        
	//*  18   32:goto            9
		list.clear();
	//   19   35:aload_1         
	//   20   36:invokeinterface #262 <Method void List.clear()>
	//   21   41:return          
	}

	void reset()
	{
		recycleUpdateOpsAndClearList(((List) (mPendingUpdates)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #59  <Field ArrayList mPendingUpdates>
	//    3    5:invokevirtual   #196 <Method void recycleUpdateOpsAndClearList(List)>
		recycleUpdateOpsAndClearList(((List) (mPostponedList)));
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #61  <Field ArrayList mPostponedList>
	//    7   13:invokevirtual   #196 <Method void recycleUpdateOpsAndClearList(List)>
		mExistingUpdateTypes = 0;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #63  <Field int mExistingUpdateTypes>
	//   11   21:return          
	}

	private static final boolean DEBUG = false;
	static final int POSITION_TYPE_INVISIBLE = 0;
	static final int POSITION_TYPE_NEW_OR_LAID_OUT = 1;
	private static final String TAG = "AHT";
	final Callback mCallback;
	final boolean mDisableRecycler;
	private int mExistingUpdateTypes;
	Runnable mOnItemProcessedCallback;
	final OpReorderer mOpReorderer;
	final ArrayList mPendingUpdates;
	final ArrayList mPostponedList;
	private android.support.v4.util.Pools.Pool mUpdateOpPool;
}
