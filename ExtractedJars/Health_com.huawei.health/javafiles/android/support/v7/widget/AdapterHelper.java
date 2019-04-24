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
		//		               3 67
		//		               4 61
		//		               5 67
		//		               6 67
		//		               7 67
		//		               8 64
		//*   3   52:goto            67
			case 1: // '\001'
				return "add";
		//    4   55:ldc1            #41  <String "add">
		//    5   57:areturn         

			case 2: // '\002'
				return "rm";
		//    6   58:ldc1            #43  <String "rm">
		//    7   60:areturn         

			case 4: // '\004'
				return "up";
		//    8   61:ldc1            #45  <String "up">
		//    9   63:areturn         

			case 8: // '\b'
				return "mv";
		//   10   64:ldc1            #47  <String "mv">
		//   11   66:areturn         
			}
			return "??";
		//   12   67:ldc1            #49  <String "??">
		//   13   69:areturn         
		}

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
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
			if(cmd == 8 && Math.abs(itemCount - positionStart) == 1 && itemCount == ((UpdateOp) (obj)).positionStart && positionStart == ((UpdateOp) (obj)).itemCount)
		//*  24   42:aload_0         
		//*  25   43:getfield        #30  <Field int cmd>
		//*  26   46:bipush          8
		//*  27   48:icmpne          91
		//*  28   51:aload_0         
		//*  29   52:getfield        #34  <Field int itemCount>
		//*  30   55:aload_0         
		//*  31   56:getfield        #32  <Field int positionStart>
		//*  32   59:isub            
		//*  33   60:invokestatic    #61  <Method int Math.abs(int)>
		//*  34   63:iconst_1        
		//*  35   64:icmpne          91
		//*  36   67:aload_0         
		//*  37   68:getfield        #34  <Field int itemCount>
		//*  38   71:aload_1         
		//*  39   72:getfield        #32  <Field int positionStart>
		//*  40   75:icmpne          91
		//*  41   78:aload_0         
		//*  42   79:getfield        #32  <Field int positionStart>
		//*  43   82:aload_1         
		//*  44   83:getfield        #34  <Field int itemCount>
		//*  45   86:icmpne          91
				return true;
		//   46   89:iconst_1        
		//   47   90:ireturn         
			if(itemCount != ((UpdateOp) (obj)).itemCount)
		//*  48   91:aload_0         
		//*  49   92:getfield        #34  <Field int itemCount>
		//*  50   95:aload_1         
		//*  51   96:getfield        #34  <Field int itemCount>
		//*  52   99:icmpeq          104
				return false;
		//   53  102:iconst_0        
		//   54  103:ireturn         
			if(positionStart != ((UpdateOp) (obj)).positionStart)
		//*  55  104:aload_0         
		//*  56  105:getfield        #32  <Field int positionStart>
		//*  57  108:aload_1         
		//*  58  109:getfield        #32  <Field int positionStart>
		//*  59  112:icmpeq          117
				return false;
		//   60  115:iconst_0        
		//   61  116:ireturn         
			if(payload != null)
		//*  62  117:aload_0         
		//*  63  118:getfield        #36  <Field Object payload>
		//*  64  121:ifnull          140
			{
				if(!payload.equals(((UpdateOp) (obj)).payload))
		//*  65  124:aload_0         
		//*  66  125:getfield        #36  <Field Object payload>
		//*  67  128:aload_1         
		//*  68  129:getfield        #36  <Field Object payload>
		//*  69  132:invokevirtual   #63  <Method boolean Object.equals(Object)>
		//*  70  135:ifne            149
					return false;
		//   71  138:iconst_0        
		//   72  139:ireturn         
			} else
			if(((UpdateOp) (obj)).payload != null)
		//*  73  140:aload_1         
		//*  74  141:getfield        #36  <Field Object payload>
		//*  75  144:ifnull          149
				return false;
		//   76  147:iconst_0        
		//   77  148:ireturn         
			return true;
		//   78  149:iconst_1        
		//   79  150:ireturn         
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
		int j;
		for(int i = updateop.positionStart; i < k; i = j)
	//*  13   23:aload_1         
	//*  14   24:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  15   27:istore_2        
	//*  16   28:iload_2         
	//*  17   29:iload           5
	//*  18   31:icmpge          171
		{
			byte byte0 = 0;
	//   19   34:iconst_0        
	//   20   35:istore_3        
			j = 0;
	//   21   36:iconst_0        
	//   22   37:istore          4
			if(mCallback.findViewHolder(i) != null || canFindInPreLayout(i))
	//*  23   39:aload_0         
	//*  24   40:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//*  25   43:iload_2         
	//*  26   44:invokeinterface #91  <Method RecyclerView$ViewHolder AdapterHelper$Callback.findViewHolder(int)>
	//*  27   49:ifnonnull       60
	//*  28   52:aload_0         
	//*  29   53:iload_2         
	//*  30   54:invokespecial   #95  <Method boolean canFindInPreLayout(int)>
	//*  31   57:ifeq            87
			{
				if(byte1 == 0)
	//*  32   60:iload           7
	//*  33   62:ifne            82
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
					j = 1;
	//   42   79:iconst_1        
	//   43   80:istore          4
				}
				byte0 = 1;
	//   44   82:iconst_1        
	//   45   83:istore_3        
			} else
	//*  46   84:goto            118
			{
				if(byte1 == 1)
	//*  47   87:iload           7
	//*  48   89:iconst_1        
	//*  49   90:icmpne          109
				{
					postponeAndUpdateViewHolders(obtainUpdateOp(2, i1, l, ((Object) (null))));
	//   50   93:aload_0         
	//   51   94:aload_0         
	//   52   95:iconst_2        
	//   53   96:iload           8
	//   54   98:iload           6
	//   55  100:aconst_null     
	//   56  101:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//   57  104:invokespecial   #79  <Method void postponeAndUpdateViewHolders(AdapterHelper$UpdateOp)>
					byte0 = 1;
	//   58  107:iconst_1        
	//   59  108:istore_3        
				}
				byte1 = 0;
	//   60  109:iconst_0        
	//   61  110:istore          7
				j = ((int) (byte0));
	//   62  112:iload_3         
	//   63  113:istore          4
				byte0 = byte1;
	//   64  115:iload           7
	//   65  117:istore_3        
			}
			if(j != 0)
	//*  66  118:iload           4
	//*  67  120:ifeq            141
			{
				j = i - l;
	//   68  123:iload_2         
	//   69  124:iload           6
	//   70  126:isub            
	//   71  127:istore          4
				k -= l;
	//   72  129:iload           5
	//   73  131:iload           6
	//   74  133:isub            
	//   75  134:istore          5
				i = 1;
	//   76  136:iconst_1        
	//   77  137:istore_2        
			} else
	//*  78  138:goto            153
			{
				l++;
	//   79  141:iload           6
	//   80  143:iconst_1        
	//   81  144:iadd            
	//   82  145:istore          6
				j = i;
	//   83  147:iload_2         
	//   84  148:istore          4
				i = l;
	//   85  150:iload           6
	//   86  152:istore_2        
			}
			j++;
	//   87  153:iload           4
	//   88  155:iconst_1        
	//   89  156:iadd            
	//   90  157:istore          4
			l = i;
	//   91  159:iload_2         
	//   92  160:istore          6
			byte1 = byte0;
	//   93  162:iload_3         
	//   94  163:istore          7
		}

	//   95  165:iload           4
	//   96  167:istore_2        
	//*  97  168:goto            28
		UpdateOp updateop1 = updateop;
	//   98  171:aload_1         
	//   99  172:astore          9
		if(l != updateop.itemCount)
	//* 100  174:iload           6
	//* 101  176:aload_1         
	//* 102  177:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 103  180:icmpeq          200
		{
			recycleUpdateOp(updateop);
	//  104  183:aload_0         
	//  105  184:aload_1         
	//  106  185:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
			updateop1 = obtainUpdateOp(2, i1, l, ((Object) (null)));
	//  107  188:aload_0         
	//  108  189:iconst_2        
	//  109  190:iload           8
	//  110  192:iload           6
	//  111  194:aconst_null     
	//  112  195:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//  113  198:astore          9
		}
		if(byte1 == 0)
	//* 114  200:iload           7
	//* 115  202:ifne            212
		{
			dispatchAndUpdateViewHolders(updateop1);
	//  116  205:aload_0         
	//  117  206:aload           9
	//  118  208:invokespecial   #102 <Method void dispatchAndUpdateViewHolders(AdapterHelper$UpdateOp)>
			return;
	//  119  211:return          
		} else
		{
			postponeAndUpdateViewHolders(updateop1);
	//  120  212:aload_0         
	//  121  213:aload           9
	//  122  215:invokespecial   #79  <Method void postponeAndUpdateViewHolders(AdapterHelper$UpdateOp)>
			return;
	//  123  218:return          
		}
	}

	private void applyUpdate(UpdateOp updateop)
	{
		int j = updateop.positionStart;
	//    0    0:aload_1         
	//    1    1:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//    2    4:istore_3        
		int k = 0;
	//    3    5:iconst_0        
	//    4    6:istore          4
		int i2 = updateop.positionStart;
	//    5    8:aload_1         
	//    6    9:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//    7   12:istore          9
		int j2 = updateop.itemCount;
	//    8   14:aload_1         
	//    9   15:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   10   18:istore          10
		int l1 = -1;
	//   11   20:iconst_m1       
	//   12   21:istore          8
		for(int i = updateop.positionStart; i < i2 + j2;)
	//*  13   23:aload_1         
	//*  14   24:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  15   27:istore_2        
	//*  16   28:iload_2         
	//*  17   29:iload           9
	//*  18   31:iload           10
	//*  19   33:iadd            
	//*  20   34:icmpge          167
		{
			int l;
			int k1;
			if(mCallback.findViewHolder(i) != null || canFindInPreLayout(i))
	//*  21   37:aload_0         
	//*  22   38:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//*  23   41:iload_2         
	//*  24   42:invokeinterface #91  <Method RecyclerView$ViewHolder AdapterHelper$Callback.findViewHolder(int)>
	//*  25   47:ifnonnull       58
	//*  26   50:aload_0         
	//*  27   51:iload_2         
	//*  28   52:invokespecial   #95  <Method boolean canFindInPreLayout(int)>
	//*  29   55:ifeq            109
			{
				int i1 = j;
	//   30   58:iload_3         
	//   31   59:istore          6
				l = k;
	//   32   61:iload           4
	//   33   63:istore          5
				if(l1 == 0)
	//*  34   65:iload           8
	//*  35   67:ifne            92
				{
					dispatchAndUpdateViewHolders(obtainUpdateOp(4, j, k, updateop.payload));
	//   36   70:aload_0         
	//   37   71:aload_0         
	//   38   72:iconst_4        
	//   39   73:iload_3         
	//   40   74:iload           4
	//   41   76:aload_1         
	//   42   77:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//   43   80:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//   44   83:invokespecial   #102 <Method void dispatchAndUpdateViewHolders(AdapterHelper$UpdateOp)>
					l = 0;
	//   45   86:iconst_0        
	//   46   87:istore          5
					i1 = i;
	//   47   89:iload_2         
	//   48   90:istore          6
				}
				k = 1;
	//   49   92:iconst_1        
	//   50   93:istore          4
				j = i1;
	//   51   95:iload           6
	//   52   97:istore_3        
				k1 = l;
	//   53   98:iload           5
	//   54  100:istore          7
				l = k;
	//   55  102:iload           4
	//   56  104:istore          5
			} else
	//*  57  106:goto            150
			{
				int j1 = j;
	//   58  109:iload_3         
	//   59  110:istore          6
				k1 = k;
	//   60  112:iload           4
	//   61  114:istore          7
				if(l1 == 1)
	//*  62  116:iload           8
	//*  63  118:iconst_1        
	//*  64  119:icmpne          144
				{
					postponeAndUpdateViewHolders(obtainUpdateOp(4, j, k, updateop.payload));
	//   65  122:aload_0         
	//   66  123:aload_0         
	//   67  124:iconst_4        
	//   68  125:iload_3         
	//   69  126:iload           4
	//   70  128:aload_1         
	//   71  129:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//   72  132:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//   73  135:invokespecial   #79  <Method void postponeAndUpdateViewHolders(AdapterHelper$UpdateOp)>
					k1 = 0;
	//   74  138:iconst_0        
	//   75  139:istore          7
					j1 = i;
	//   76  141:iload_2         
	//   77  142:istore          6
				}
				l = 0;
	//   78  144:iconst_0        
	//   79  145:istore          5
				j = j1;
	//   80  147:iload           6
	//   81  149:istore_3        
			}
			k = k1 + 1;
	//   82  150:iload           7
	//   83  152:iconst_1        
	//   84  153:iadd            
	//   85  154:istore          4
			i++;
	//   86  156:iload_2         
	//   87  157:iconst_1        
	//   88  158:iadd            
	//   89  159:istore_2        
			l1 = l;
	//   90  160:iload           5
	//   91  162:istore          8
		}

	//*  92  164:goto            28
		Object obj = ((Object) (updateop));
	//   93  167:aload_1         
	//   94  168:astore          11
		if(k != updateop.itemCount)
	//*  95  170:iload           4
	//*  96  172:aload_1         
	//*  97  173:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  98  176:icmpeq          202
		{
			obj = updateop.payload;
	//   99  179:aload_1         
	//  100  180:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//  101  183:astore          11
			recycleUpdateOp(updateop);
	//  102  185:aload_0         
	//  103  186:aload_1         
	//  104  187:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
			obj = ((Object) (obtainUpdateOp(4, j, k, obj)));
	//  105  190:aload_0         
	//  106  191:iconst_4        
	//  107  192:iload_3         
	//  108  193:iload           4
	//  109  195:aload           11
	//  110  197:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//  111  200:astore          11
		}
		if(l1 == 0)
	//* 112  202:iload           8
	//* 113  204:ifne            214
		{
			dispatchAndUpdateViewHolders(((UpdateOp) (obj)));
	//  114  207:aload_0         
	//  115  208:aload           11
	//  116  210:invokespecial   #102 <Method void dispatchAndUpdateViewHolders(AdapterHelper$UpdateOp)>
			return;
	//  117  213:return          
		} else
		{
			postponeAndUpdateViewHolders(((UpdateOp) (obj)));
	//  118  214:aload_0         
	//  119  215:aload           11
	//  120  217:invokespecial   #79  <Method void postponeAndUpdateViewHolders(AdapterHelper$UpdateOp)>
			return;
	//  121  220:return          
		}
	}

	private boolean canFindInPreLayout(int i)
	{
		int l = mPostponedList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field ArrayList mPostponedList>
	//    2    4:invokevirtual   #114 <Method int ArrayList.size()>
	//    3    7:istore          4
label0:
		for(int j = 0; j < l; j++)
	//*   4    9:iconst_0        
	//*   5   10:istore_2        
	//*   6   11:iload_2         
	//*   7   12:iload           4
	//*   8   14:icmpge          124
		{
			UpdateOp updateop = (UpdateOp)mPostponedList.get(j);
	//    9   17:aload_0         
	//   10   18:getfield        #61  <Field ArrayList mPostponedList>
	//   11   21:iload_2         
	//   12   22:invokevirtual   #118 <Method Object ArrayList.get(int)>
	//   13   25:checkcast       #11  <Class AdapterHelper$UpdateOp>
	//   14   28:astore          7
			if(updateop.cmd == 8)
	//*  15   30:aload           7
	//*  16   32:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//*  17   35:bipush          8
	//*  18   37:icmpne          58
			{
				if(findPositionOffset(updateop.itemCount, j + 1) == i)
	//*  19   40:aload_0         
	//*  20   41:aload           7
	//*  21   43:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  22   46:iload_2         
	//*  23   47:iconst_1        
	//*  24   48:iadd            
	//*  25   49:invokevirtual   #125 <Method int findPositionOffset(int, int)>
	//*  26   52:iload_1         
	//*  27   53:icmpne          117
					return true;
	//   28   56:iconst_1        
	//   29   57:ireturn         
				continue;
			}
			if(updateop.cmd != 1)
				continue;
	//   30   58:aload           7
	//   31   60:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//   32   63:iconst_1        
	//   33   64:icmpne          117
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
					continue label0;
	//   43   87:iload_3         
	//   44   88:iload           5
	//   45   90:iload           6
	//   46   92:iadd            
	//   47   93:icmpge          117
				if(findPositionOffset(k, j + 1) == i)
	//*  48   96:aload_0         
	//*  49   97:iload_3         
	//*  50   98:iload_2         
	//*  51   99:iconst_1        
	//*  52  100:iadd            
	//*  53  101:invokevirtual   #125 <Method int findPositionOffset(int, int)>
	//*  54  104:iload_1         
	//*  55  105:icmpne          110
					return true;
	//   56  108:iconst_1        
	//   57  109:ireturn         
				k++;
	//   58  110:iload_3         
	//   59  111:iconst_1        
	//   60  112:iadd            
	//   61  113:istore_3        
			} while(true);
	//   62  114:goto            87
		}

	//   63  117:iload_2         
	//   64  118:iconst_1        
	//   65  119:iadd            
	//   66  120:istore_2        
	//*  67  121:goto            11
		return false;
	//   68  124:iconst_0        
	//   69  125:ireturn         
	}

	private void dispatchAndUpdateViewHolders(UpdateOp updateop)
	{
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
		int i1 = updatePositionWithPostponed(updateop.positionStart, updateop.cmd);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   16   32:aload_1         
	//   17   33:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//   18   36:invokespecial   #135 <Method int updatePositionWithPostponed(int, int)>
	//   19   39:istore          6
		int j1 = 1;
	//   20   41:iconst_1        
	//   21   42:istore          7
		int j = updateop.positionStart;
	//   22   44:aload_1         
	//   23   45:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   24   48:istore_3        
		int k;
		switch(updateop.cmd)
	//*  25   49:aload_1         
	//*  26   50:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
		{
	//*  27   53:lookupswitch    2: default 80
	//	               2: 89
	//	               4: 83
	//*  28   80:goto            95
		case 4: // '\004'
			k = 1;
	//   29   83:iconst_1        
	//   30   84:istore          4
			break;

	//*  31   86:goto            122
		case 2: // '\002'
			k = 0;
	//   32   89:iconst_0        
	//   33   90:istore          4
			break;

	//*  34   92:goto            122
		default:
			throw new IllegalArgumentException((new StringBuilder()).append("op should be remove or update.").append(((Object) (updateop))).toString());
	//   35   95:new             #127 <Class IllegalArgumentException>
	//   36   98:dup             
	//   37   99:new             #137 <Class StringBuilder>
	//   38  102:dup             
	//   39  103:invokespecial   #138 <Method void StringBuilder()>
	//   40  106:ldc1            #140 <String "op should be remove or update.">
	//   41  108:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   42  111:aload_1         
	//   43  112:invokevirtual   #147 <Method StringBuilder StringBuilder.append(Object)>
	//   44  115:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   45  118:invokespecial   #132 <Method void IllegalArgumentException(String)>
	//   46  121:athrow          
		}
		for(int l = 1; l < updateop.itemCount;)
	//*  47  122:iconst_1        
	//*  48  123:istore          5
	//*  49  125:iload           5
	//*  50  127:aload_1         
	//*  51  128:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  52  131:icmpge          306
		{
			int k1 = updatePositionWithPostponed(updateop.positionStart + k * l, updateop.cmd);
	//   53  134:aload_0         
	//   54  135:aload_1         
	//   55  136:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   56  139:iload           4
	//   57  141:iload           5
	//   58  143:imul            
	//   59  144:iadd            
	//   60  145:aload_1         
	//   61  146:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//   62  149:invokespecial   #135 <Method int updatePositionWithPostponed(int, int)>
	//   63  152:istore          8
			boolean flag = false;
	//   64  154:iconst_0        
	//   65  155:istore_2        
			switch(updateop.cmd)
	//*  66  156:aload_1         
	//*  67  157:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
			{
	//*  68  160:lookupswitch    2: default 188
	//	               2: 210
	//	               4: 191
	//*  69  188:goto            224
			case 4: // '\004'
				if(k1 == i1 + 1)
	//*  70  191:iload           8
	//*  71  193:iload           6
	//*  72  195:iconst_1        
	//*  73  196:iadd            
	//*  74  197:icmpne          205
					flag = true;
	//   75  200:iconst_1        
	//   76  201:istore_2        
				else
	//*  77  202:goto            207
					flag = false;
	//   78  205:iconst_0        
	//   79  206:istore_2        
				break;

	//*  80  207:goto            224
			case 2: // '\002'
				if(k1 == i1)
	//*  81  210:iload           8
	//*  82  212:iload           6
	//*  83  214:icmpne          222
					flag = true;
	//   84  217:iconst_1        
	//   85  218:istore_2        
				else
	//*  86  219:goto            224
					flag = false;
	//   87  222:iconst_0        
	//   88  223:istore_2        
				break;
			}
			int i;
			if(flag)
	//*  89  224:iload_2         
	//*  90  225:ifeq            236
			{
				i = j1 + 1;
	//   91  228:iload           7
	//   92  230:iconst_1        
	//   93  231:iadd            
	//   94  232:istore_2        
			} else
	//*  95  233:goto            294
			{
				UpdateOp updateop1 = obtainUpdateOp(updateop.cmd, i1, j1, updateop.payload);
	//   96  236:aload_0         
	//   97  237:aload_1         
	//   98  238:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//   99  241:iload           6
	//  100  243:iload           7
	//  101  245:aload_1         
	//  102  246:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//  103  249:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//  104  252:astore          9
				dispatchFirstPassAndUpdateViewHolders(updateop1, j);
	//  105  254:aload_0         
	//  106  255:aload           9
	//  107  257:iload_3         
	//  108  258:invokevirtual   #155 <Method void dispatchFirstPassAndUpdateViewHolders(AdapterHelper$UpdateOp, int)>
				recycleUpdateOp(updateop1);
	//  109  261:aload_0         
	//  110  262:aload           9
	//  111  264:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
				i = j;
	//  112  267:iload_3         
	//  113  268:istore_2        
				if(updateop.cmd == 4)
	//* 114  269:aload_1         
	//* 115  270:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//* 116  273:iconst_4        
	//* 117  274:icmpne          282
					i = j + j1;
	//  118  277:iload_3         
	//  119  278:iload           7
	//  120  280:iadd            
	//  121  281:istore_2        
				i1 = k1;
	//  122  282:iload           8
	//  123  284:istore          6
				j1 = 1;
	//  124  286:iconst_1        
	//  125  287:istore          7
				j = i;
	//  126  289:iload_2         
	//  127  290:istore_3        
				i = j1;
	//  128  291:iload           7
	//  129  293:istore_2        
			}
			l++;
	//  130  294:iload           5
	//  131  296:iconst_1        
	//  132  297:iadd            
	//  133  298:istore          5
			j1 = i;
	//  134  300:iload_2         
	//  135  301:istore          7
		}

	//* 136  303:goto            125
		Object obj = updateop.payload;
	//  137  306:aload_1         
	//  138  307:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//  139  310:astore          9
		recycleUpdateOp(updateop);
	//  140  312:aload_0         
	//  141  313:aload_1         
	//  142  314:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
		if(j1 > 0)
	//* 143  317:iload           7
	//* 144  319:ifle            348
		{
			updateop = obtainUpdateOp(updateop.cmd, i1, j1, obj);
	//  145  322:aload_0         
	//  146  323:aload_1         
	//  147  324:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//  148  327:iload           6
	//  149  329:iload           7
	//  150  331:aload           9
	//  151  333:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//  152  336:astore_1        
			dispatchFirstPassAndUpdateViewHolders(updateop, j);
	//  153  337:aload_0         
	//  154  338:aload_1         
	//  155  339:iload_3         
	//  156  340:invokevirtual   #155 <Method void dispatchFirstPassAndUpdateViewHolders(AdapterHelper$UpdateOp, int)>
			recycleUpdateOp(updateop);
	//  157  343:aload_0         
	//  158  344:aload_1         
	//  159  345:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
		}
	//  160  348:return          
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
	//	               1 63
	//	               2 99
	//	               3 139
	//	               4 117
	//	               5 139
	//	               6 139
	//	               7 139
	//	               8 81
	//*   8   60:goto            139
		case 1: // '\001'
			mCallback.offsetPositionsForAdd(updateop.positionStart, updateop.itemCount);
	//    9   63:aload_0         
	//   10   64:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   11   67:aload_1         
	//   12   68:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   13   71:aload_1         
	//   14   72:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   15   75:invokeinterface #163 <Method void AdapterHelper$Callback.offsetPositionsForAdd(int, int)>
			return;
	//   16   80:return          

		case 8: // '\b'
			mCallback.offsetPositionsForMove(updateop.positionStart, updateop.itemCount);
	//   17   81:aload_0         
	//   18   82:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   19   85:aload_1         
	//   20   86:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   21   89:aload_1         
	//   22   90:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   23   93:invokeinterface #166 <Method void AdapterHelper$Callback.offsetPositionsForMove(int, int)>
			return;
	//   24   98:return          

		case 2: // '\002'
			mCallback.offsetPositionsForRemovingLaidOutOrNewView(updateop.positionStart, updateop.itemCount);
	//   25   99:aload_0         
	//   26  100:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   27  103:aload_1         
	//   28  104:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   29  107:aload_1         
	//   30  108:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   31  111:invokeinterface #169 <Method void AdapterHelper$Callback.offsetPositionsForRemovingLaidOutOrNewView(int, int)>
			return;
	//   32  116:return          

		case 4: // '\004'
			mCallback.markViewHoldersUpdated(updateop.positionStart, updateop.itemCount, updateop.payload);
	//   33  117:aload_0         
	//   34  118:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   35  121:aload_1         
	//   36  122:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   37  125:aload_1         
	//   38  126:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   39  129:aload_1         
	//   40  130:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//   41  133:invokeinterface #173 <Method void AdapterHelper$Callback.markViewHoldersUpdated(int, int, Object)>
			return;
	//   42  138:return          
		}
		throw new IllegalArgumentException((new StringBuilder()).append("Unknown update op type for ").append(((Object) (updateop))).toString());
	//   43  139:new             #127 <Class IllegalArgumentException>
	//   44  142:dup             
	//   45  143:new             #137 <Class StringBuilder>
	//   46  146:dup             
	//   47  147:invokespecial   #138 <Method void StringBuilder()>
	//   48  150:ldc1            #175 <String "Unknown update op type for ">
	//   49  152:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   50  155:aload_1         
	//   51  156:invokevirtual   #147 <Method StringBuilder StringBuilder.append(Object)>
	//   52  159:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   53  162:invokespecial   #132 <Method void IllegalArgumentException(String)>
	//   54  165:athrow          
	}

	private int updatePositionWithPostponed(int i, int j)
	{
		int l = mPostponedList.size() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field ArrayList mPostponedList>
	//    2    4:invokevirtual   #114 <Method int ArrayList.size()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore          4
		int k;
		for(k = i; l >= 0; k = i)
	//*   6   11:iload_1         
	//*   7   12:istore_3        
	//*   8   13:iload           4
	//*   9   15:iflt            378
		{
			UpdateOp updateop = (UpdateOp)mPostponedList.get(l);
	//   10   18:aload_0         
	//   11   19:getfield        #61  <Field ArrayList mPostponedList>
	//   12   22:iload           4
	//   13   24:invokevirtual   #118 <Method Object ArrayList.get(int)>
	//   14   27:checkcast       #11  <Class AdapterHelper$UpdateOp>
	//   15   30:astore          6
			if(updateop.cmd == 8)
	//*  16   32:aload           6
	//*  17   34:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//*  18   37:bipush          8
	//*  19   39:icmpne          273
			{
				int i1;
				if(updateop.positionStart < updateop.itemCount)
	//*  20   42:aload           6
	//*  21   44:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  22   47:aload           6
	//*  23   49:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  24   52:icmpge          71
				{
					i = updateop.positionStart;
	//   25   55:aload           6
	//   26   57:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   27   60:istore_1        
					i1 = updateop.itemCount;
	//   28   61:aload           6
	//   29   63:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   30   66:istore          5
				} else
	//*  31   68:goto            84
				{
					i = updateop.itemCount;
	//   32   71:aload           6
	//   33   73:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   34   76:istore_1        
					i1 = updateop.positionStart;
	//   35   77:aload           6
	//   36   79:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   37   82:istore          5
				}
				if(k >= i && k <= i1)
	//*  38   84:iload_3         
	//*  39   85:iload_1         
	//*  40   86:icmplt          192
	//*  41   89:iload_3         
	//*  42   90:iload           5
	//*  43   92:icmpgt          192
				{
					if(i == updateop.positionStart)
	//*  44   95:iload_1         
	//*  45   96:aload           6
	//*  46   98:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  47  101:icmpne          148
					{
						if(j == 1)
	//*  48  104:iload_2         
	//*  49  105:iconst_1        
	//*  50  106:icmpne          124
							updateop.itemCount = updateop.itemCount + 1;
	//   51  109:aload           6
	//   52  111:aload           6
	//   53  113:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   54  116:iconst_1        
	//   55  117:iadd            
	//   56  118:putfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
						else
	//*  57  121:goto            141
						if(j == 2)
	//*  58  124:iload_2         
	//*  59  125:iconst_2        
	//*  60  126:icmpne          141
							updateop.itemCount = updateop.itemCount - 1;
	//   61  129:aload           6
	//   62  131:aload           6
	//   63  133:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   64  136:iconst_1        
	//   65  137:isub            
	//   66  138:putfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
						i = k + 1;
	//   67  141:iload_3         
	//   68  142:iconst_1        
	//   69  143:iadd            
	//   70  144:istore_1        
					} else
	//*  71  145:goto            270
					{
						if(j == 1)
	//*  72  148:iload_2         
	//*  73  149:iconst_1        
	//*  74  150:icmpne          168
							updateop.positionStart = updateop.positionStart + 1;
	//   75  153:aload           6
	//   76  155:aload           6
	//   77  157:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   78  160:iconst_1        
	//   79  161:iadd            
	//   80  162:putfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
						else
	//*  81  165:goto            185
						if(j == 2)
	//*  82  168:iload_2         
	//*  83  169:iconst_2        
	//*  84  170:icmpne          185
							updateop.positionStart = updateop.positionStart - 1;
	//   85  173:aload           6
	//   86  175:aload           6
	//   87  177:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   88  180:iconst_1        
	//   89  181:isub            
	//   90  182:putfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
						i = k - 1;
	//   91  185:iload_3         
	//   92  186:iconst_1        
	//   93  187:isub            
	//   94  188:istore_1        
					}
				} else
	//*  95  189:goto            270
				{
					i = k;
	//   96  192:iload_3         
	//   97  193:istore_1        
					if(k < updateop.positionStart)
	//*  98  194:iload_3         
	//*  99  195:aload           6
	//* 100  197:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 101  200:icmpge          270
						if(j == 1)
	//* 102  203:iload_2         
	//* 103  204:iconst_1        
	//* 104  205:icmpne          237
						{
							updateop.positionStart = updateop.positionStart + 1;
	//  105  208:aload           6
	//  106  210:aload           6
	//  107  212:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//  108  215:iconst_1        
	//  109  216:iadd            
	//  110  217:putfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
							updateop.itemCount = updateop.itemCount + 1;
	//  111  220:aload           6
	//  112  222:aload           6
	//  113  224:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//  114  227:iconst_1        
	//  115  228:iadd            
	//  116  229:putfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
							i = k;
	//  117  232:iload_3         
	//  118  233:istore_1        
						} else
	//* 119  234:goto            270
						{
							i = k;
	//  120  237:iload_3         
	//  121  238:istore_1        
							if(j == 2)
	//* 122  239:iload_2         
	//* 123  240:iconst_2        
	//* 124  241:icmpne          270
							{
								updateop.positionStart = updateop.positionStart - 1;
	//  125  244:aload           6
	//  126  246:aload           6
	//  127  248:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//  128  251:iconst_1        
	//  129  252:isub            
	//  130  253:putfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
								updateop.itemCount = updateop.itemCount - 1;
	//  131  256:aload           6
	//  132  258:aload           6
	//  133  260:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//  134  263:iconst_1        
	//  135  264:isub            
	//  136  265:putfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
								i = k;
	//  137  268:iload_3         
	//  138  269:istore_1        
							}
						}
				}
			} else
	//* 139  270:goto            367
			if(updateop.positionStart <= k)
	//* 140  273:aload           6
	//* 141  275:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 142  278:iload_3         
	//* 143  279:icmpgt          324
			{
				if(updateop.cmd == 1)
	//* 144  282:aload           6
	//* 145  284:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//* 146  287:iconst_1        
	//* 147  288:icmpne          302
				{
					i = k - updateop.itemCount;
	//  148  291:iload_3         
	//  149  292:aload           6
	//  150  294:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//  151  297:isub            
	//  152  298:istore_1        
				} else
	//* 153  299:goto            367
				{
					i = k;
	//  154  302:iload_3         
	//  155  303:istore_1        
					if(updateop.cmd == 2)
	//* 156  304:aload           6
	//* 157  306:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//* 158  309:iconst_2        
	//* 159  310:icmpne          367
						i = k + updateop.itemCount;
	//  160  313:iload_3         
	//  161  314:aload           6
	//  162  316:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//  163  319:iadd            
	//  164  320:istore_1        
				}
			} else
	//* 165  321:goto            367
			if(j == 1)
	//* 166  324:iload_2         
	//* 167  325:iconst_1        
	//* 168  326:icmpne          346
			{
				updateop.positionStart = updateop.positionStart + 1;
	//  169  329:aload           6
	//  170  331:aload           6
	//  171  333:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//  172  336:iconst_1        
	//  173  337:iadd            
	//  174  338:putfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
				i = k;
	//  175  341:iload_3         
	//  176  342:istore_1        
			} else
	//* 177  343:goto            367
			{
				i = k;
	//  178  346:iload_3         
	//  179  347:istore_1        
				if(j == 2)
	//* 180  348:iload_2         
	//* 181  349:iconst_2        
	//* 182  350:icmpne          367
				{
					updateop.positionStart = updateop.positionStart - 1;
	//  183  353:aload           6
	//  184  355:aload           6
	//  185  357:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//  186  360:iconst_1        
	//  187  361:isub            
	//  188  362:putfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
					i = k;
	//  189  365:iload_3         
	//  190  366:istore_1        
				}
			}
			l--;
	//  191  367:iload           4
	//  192  369:iconst_1        
	//  193  370:isub            
	//  194  371:istore          4
		}

	//  195  373:iload_1         
	//  196  374:istore_3        
	//* 197  375:goto            13
		for(i = mPostponedList.size() - 1; i >= 0; i--)
	//* 198  378:aload_0         
	//* 199  379:getfield        #61  <Field ArrayList mPostponedList>
	//* 200  382:invokevirtual   #114 <Method int ArrayList.size()>
	//* 201  385:iconst_1        
	//* 202  386:isub            
	//* 203  387:istore_1        
	//* 204  388:iload_1         
	//* 205  389:iflt            484
		{
			UpdateOp updateop1 = (UpdateOp)mPostponedList.get(i);
	//  206  392:aload_0         
	//  207  393:getfield        #61  <Field ArrayList mPostponedList>
	//  208  396:iload_1         
	//  209  397:invokevirtual   #118 <Method Object ArrayList.get(int)>
	//  210  400:checkcast       #11  <Class AdapterHelper$UpdateOp>
	//  211  403:astore          6
			if(updateop1.cmd == 8)
	//* 212  405:aload           6
	//* 213  407:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//* 214  410:bipush          8
	//* 215  412:icmpne          454
			{
				if(updateop1.itemCount == updateop1.positionStart || updateop1.itemCount < 0)
	//* 216  415:aload           6
	//* 217  417:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 218  420:aload           6
	//* 219  422:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 220  425:icmpeq          436
	//* 221  428:aload           6
	//* 222  430:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 223  433:ifge            477
				{
					mPostponedList.remove(i);
	//  224  436:aload_0         
	//  225  437:getfield        #61  <Field ArrayList mPostponedList>
	//  226  440:iload_1         
	//  227  441:invokevirtual   #178 <Method Object ArrayList.remove(int)>
	//  228  444:pop             
					recycleUpdateOp(updateop1);
	//  229  445:aload_0         
	//  230  446:aload           6
	//  231  448:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
				}
				continue;
	//  232  451:goto            477
			}
			if(updateop1.itemCount <= 0)
	//* 233  454:aload           6
	//* 234  456:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 235  459:ifgt            477
			{
				mPostponedList.remove(i);
	//  236  462:aload_0         
	//  237  463:getfield        #61  <Field ArrayList mPostponedList>
	//  238  466:iload_1         
	//  239  467:invokevirtual   #178 <Method Object ArrayList.remove(int)>
	//  240  470:pop             
				recycleUpdateOp(updateop1);
	//  241  471:aload_0         
	//  242  472:aload           6
	//  243  474:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
			}
		}

	//  244  477:iload_1         
	//  245  478:iconst_1        
	//  246  479:isub            
	//  247  480:istore_1        
	//* 248  481:goto            388
		return k;
	//  249  484:iload_3         
	//  250  485:ireturn         
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
		int i1 = mPendingUpdates.size();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field ArrayList mPendingUpdates>
	//    2    4:invokevirtual   #114 <Method int ArrayList.size()>
	//    3    7:istore          5
		int l = 0;
	//    4    9:iconst_0        
	//    5   10:istore          4
		int j;
		for(j = i; l < i1; j = i)
	//*   6   12:iload_1         
	//*   7   13:istore_2        
	//*   8   14:iload           4
	//*   9   16:iload           5
	//*  10   18:icmpge          201
		{
			UpdateOp updateop = (UpdateOp)mPendingUpdates.get(l);
	//   11   21:aload_0         
	//   12   22:getfield        #59  <Field ArrayList mPendingUpdates>
	//   13   25:iload           4
	//   14   27:invokevirtual   #118 <Method Object ArrayList.get(int)>
	//   15   30:checkcast       #11  <Class AdapterHelper$UpdateOp>
	//   16   33:astore          6
			switch(updateop.cmd)
	//*  17   35:aload           6
	//*  18   37:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
			{
	//*  19   40:lookupswitch    3: default 76
	//	               1: 81
	//	               2: 103
	//	               8: 142
			default:
				i = j;
	//   20   76:iload_2         
	//   21   77:istore_1        
				break;
	//   22   78:goto            190

			case 1: // '\001'
				i = j;
	//   23   81:iload_2         
	//   24   82:istore_1        
				if(updateop.positionStart <= j)
	//*  25   83:aload           6
	//*  26   85:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  27   88:iload_2         
	//*  28   89:icmpgt          190
					i = j + updateop.itemCount;
	//   29   92:iload_2         
	//   30   93:aload           6
	//   31   95:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   32   98:iadd            
	//   33   99:istore_1        
				break;
	//   34  100:goto            190

			case 2: // '\002'
				i = j;
	//   35  103:iload_2         
	//   36  104:istore_1        
				if(updateop.positionStart > j)
					break;
	//   37  105:aload           6
	//   38  107:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   39  110:iload_2         
	//   40  111:icmpgt          190
				if(updateop.positionStart + updateop.itemCount > j)
	//*  41  114:aload           6
	//*  42  116:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  43  119:aload           6
	//*  44  121:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  45  124:iadd            
	//*  46  125:iload_2         
	//*  47  126:icmple          131
					return -1;
	//   48  129:iconst_m1       
	//   49  130:ireturn         
				i = j - updateop.itemCount;
	//   50  131:iload_2         
	//   51  132:aload           6
	//   52  134:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   53  137:isub            
	//   54  138:istore_1        
				break;
	//   55  139:goto            190

			case 8: // '\b'
				if(updateop.positionStart == j)
	//*  56  142:aload           6
	//*  57  144:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  58  147:iload_2         
	//*  59  148:icmpne          160
				{
					i = updateop.itemCount;
	//   60  151:aload           6
	//   61  153:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   62  156:istore_1        
					break;
	//   63  157:goto            190
				}
				int k = j;
	//   64  160:iload_2         
	//   65  161:istore_3        
				if(updateop.positionStart < j)
	//*  66  162:aload           6
	//*  67  164:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  68  167:iload_2         
	//*  69  168:icmpge          175
					k = j - 1;
	//   70  171:iload_2         
	//   71  172:iconst_1        
	//   72  173:isub            
	//   73  174:istore_3        
				i = k;
	//   74  175:iload_3         
	//   75  176:istore_1        
				if(updateop.itemCount <= k)
	//*  76  177:aload           6
	//*  77  179:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  78  182:iload_3         
	//*  79  183:icmpgt          190
					i = k + 1;
	//   80  186:iload_3         
	//   81  187:iconst_1        
	//   82  188:iadd            
	//   83  189:istore_1        
				break;
			}
			l++;
	//   84  190:iload           4
	//   85  192:iconst_1        
	//   86  193:iadd            
	//   87  194:istore          4
		}

	//   88  196:iload_1         
	//   89  197:istore_2        
	//*  90  198:goto            14
		return j;
	//   91  201:iload_2         
	//   92  202:ireturn         
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
		consumePostponedUpdates();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #199 <Method void consumePostponedUpdates()>
		int j = mPendingUpdates.size();
	//    2    4:aload_0         
	//    3    5:getfield        #59  <Field ArrayList mPendingUpdates>
	//    4    8:invokevirtual   #114 <Method int ArrayList.size()>
	//    5   11:istore_2        
		for(int i = 0; i < j; i++)
	//*   6   12:iconst_0        
	//*   7   13:istore_1        
	//*   8   14:iload_1         
	//*   9   15:iload_2         
	//*  10   16:icmpge          227
		{
			UpdateOp updateop = (UpdateOp)mPendingUpdates.get(i);
	//   11   19:aload_0         
	//   12   20:getfield        #59  <Field ArrayList mPendingUpdates>
	//   13   23:iload_1         
	//   14   24:invokevirtual   #118 <Method Object ArrayList.get(int)>
	//   15   27:checkcast       #11  <Class AdapterHelper$UpdateOp>
	//   16   30:astore_3        
			switch(updateop.cmd)
	//*  17   31:aload_3         
	//*  18   32:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
			{
	//*  19   35:tableswitch     1 8: default 80
	//	               1 83
	//	               2 113
	//	               3 204
	//	               4 143
	//	               5 204
	//	               6 204
	//	               7 204
	//	               8 177
	//*  20   80:goto            204
			case 1: // '\001'
				mCallback.onDispatchSecondPass(updateop);
	//   21   83:aload_0         
	//   22   84:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   23   87:aload_3         
	//   24   88:invokeinterface #192 <Method void AdapterHelper$Callback.onDispatchSecondPass(AdapterHelper$UpdateOp)>
				mCallback.offsetPositionsForAdd(updateop.positionStart, updateop.itemCount);
	//   25   93:aload_0         
	//   26   94:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   27   97:aload_3         
	//   28   98:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   29  101:aload_3         
	//   30  102:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   31  105:invokeinterface #163 <Method void AdapterHelper$Callback.offsetPositionsForAdd(int, int)>
				break;

	//*  32  110:goto            204
			case 2: // '\002'
				mCallback.onDispatchSecondPass(updateop);
	//   33  113:aload_0         
	//   34  114:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   35  117:aload_3         
	//   36  118:invokeinterface #192 <Method void AdapterHelper$Callback.onDispatchSecondPass(AdapterHelper$UpdateOp)>
				mCallback.offsetPositionsForRemovingInvisible(updateop.positionStart, updateop.itemCount);
	//   37  123:aload_0         
	//   38  124:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   39  127:aload_3         
	//   40  128:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   41  131:aload_3         
	//   42  132:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   43  135:invokeinterface #202 <Method void AdapterHelper$Callback.offsetPositionsForRemovingInvisible(int, int)>
				break;

	//*  44  140:goto            204
			case 4: // '\004'
				mCallback.onDispatchSecondPass(updateop);
	//   45  143:aload_0         
	//   46  144:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   47  147:aload_3         
	//   48  148:invokeinterface #192 <Method void AdapterHelper$Callback.onDispatchSecondPass(AdapterHelper$UpdateOp)>
				mCallback.markViewHoldersUpdated(updateop.positionStart, updateop.itemCount, updateop.payload);
	//   49  153:aload_0         
	//   50  154:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   51  157:aload_3         
	//   52  158:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   53  161:aload_3         
	//   54  162:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   55  165:aload_3         
	//   56  166:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//   57  169:invokeinterface #173 <Method void AdapterHelper$Callback.markViewHoldersUpdated(int, int, Object)>
				break;

	//*  58  174:goto            204
			case 8: // '\b'
				mCallback.onDispatchSecondPass(updateop);
	//   59  177:aload_0         
	//   60  178:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   61  181:aload_3         
	//   62  182:invokeinterface #192 <Method void AdapterHelper$Callback.onDispatchSecondPass(AdapterHelper$UpdateOp)>
				mCallback.offsetPositionsForMove(updateop.positionStart, updateop.itemCount);
	//   63  187:aload_0         
	//   64  188:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   65  191:aload_3         
	//   66  192:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   67  195:aload_3         
	//   68  196:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   69  199:invokeinterface #166 <Method void AdapterHelper$Callback.offsetPositionsForMove(int, int)>
				break;
			}
			if(mOnItemProcessedCallback != null)
	//*  70  204:aload_0         
	//*  71  205:getfield        #204 <Field Runnable mOnItemProcessedCallback>
	//*  72  208:ifnull          220
				mOnItemProcessedCallback.run();
	//   73  211:aload_0         
	//   74  212:getfield        #204 <Field Runnable mOnItemProcessedCallback>
	//   75  215:invokeinterface #209 <Method void Runnable.run()>
		}

	//   76  220:iload_1         
	//   77  221:iconst_1        
	//   78  222:iadd            
	//   79  223:istore_1        
	//*  80  224:goto            14
		recycleUpdateOpsAndClearList(((List) (mPendingUpdates)));
	//   81  227:aload_0         
	//   82  228:aload_0         
	//   83  229:getfield        #59  <Field ArrayList mPendingUpdates>
	//   84  232:invokevirtual   #196 <Method void recycleUpdateOpsAndClearList(List)>
		mExistingUpdateTypes = 0;
	//   85  235:aload_0         
	//   86  236:iconst_0        
	//   87  237:putfield        #63  <Field int mExistingUpdateTypes>
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
	//*   6   14:lookupswitch    2: default 40
	//	               2: 43
	//	               4: 58
	//*   7   40:goto            77
		case 2: // '\002'
			mCallback.offsetPositionsForRemovingInvisible(i, updateop.itemCount);
	//    8   43:aload_0         
	//    9   44:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   10   47:iload_2         
	//   11   48:aload_1         
	//   12   49:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   13   52:invokeinterface #202 <Method void AdapterHelper$Callback.offsetPositionsForRemovingInvisible(int, int)>
			return;
	//   14   57:return          

		case 4: // '\004'
			mCallback.markViewHoldersUpdated(i, updateop.itemCount, updateop.payload);
	//   15   58:aload_0         
	//   16   59:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   17   62:iload_2         
	//   18   63:aload_1         
	//   19   64:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   20   67:aload_1         
	//   21   68:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//   22   71:invokeinterface #173 <Method void AdapterHelper$Callback.markViewHoldersUpdated(int, int, Object)>
			return;
	//   23   76:return          
		}
		throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
	//   24   77:new             #127 <Class IllegalArgumentException>
	//   25   80:dup             
	//   26   81:ldc1            #214 <String "only remove and update ops can be dispatched in first pass">
	//   27   83:invokespecial   #132 <Method void IllegalArgumentException(String)>
	//   28   86:athrow          
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
		int i1 = mPostponedList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field ArrayList mPostponedList>
	//    2    4:invokevirtual   #114 <Method int ArrayList.size()>
	//    3    7:istore          5
		int l = j;
	//    4    9:iload_2         
	//    5   10:istore          4
		for(j = i; l < i1; j = i)
	//*   6   12:iload_1         
	//*   7   13:istore_2        
	//*   8   14:iload           4
	//*   9   16:iload           5
	//*  10   18:icmpge          174
		{
			UpdateOp updateop = (UpdateOp)mPostponedList.get(l);
	//   11   21:aload_0         
	//   12   22:getfield        #61  <Field ArrayList mPostponedList>
	//   13   25:iload           4
	//   14   27:invokevirtual   #118 <Method Object ArrayList.get(int)>
	//   15   30:checkcast       #11  <Class AdapterHelper$UpdateOp>
	//   16   33:astore          6
			if(updateop.cmd == 8)
	//*  17   35:aload           6
	//*  18   37:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//*  19   40:bipush          8
	//*  20   42:icmpne          96
			{
				if(updateop.positionStart == j)
	//*  21   45:aload           6
	//*  22   47:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  23   50:iload_2         
	//*  24   51:icmpne          63
				{
					i = updateop.itemCount;
	//   25   54:aload           6
	//   26   56:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   27   59:istore_1        
				} else
	//*  28   60:goto            163
				{
					int k = j;
	//   29   63:iload_2         
	//   30   64:istore_3        
					if(updateop.positionStart < j)
	//*  31   65:aload           6
	//*  32   67:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  33   70:iload_2         
	//*  34   71:icmpge          78
						k = j - 1;
	//   35   74:iload_2         
	//   36   75:iconst_1        
	//   37   76:isub            
	//   38   77:istore_3        
					i = k;
	//   39   78:iload_3         
	//   40   79:istore_1        
					if(updateop.itemCount <= k)
	//*  41   80:aload           6
	//*  42   82:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  43   85:iload_3         
	//*  44   86:icmpgt          163
						i = k + 1;
	//   45   89:iload_3         
	//   46   90:iconst_1        
	//   47   91:iadd            
	//   48   92:istore_1        
				}
			} else
	//*  49   93:goto            163
			{
				i = j;
	//   50   96:iload_2         
	//   51   97:istore_1        
				if(updateop.positionStart <= j)
	//*  52   98:aload           6
	//*  53  100:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  54  103:iload_2         
	//*  55  104:icmpgt          163
					if(updateop.cmd == 2)
	//*  56  107:aload           6
	//*  57  109:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//*  58  112:iconst_2        
	//*  59  113:icmpne          144
					{
						if(j < updateop.positionStart + updateop.itemCount)
	//*  60  116:iload_2         
	//*  61  117:aload           6
	//*  62  119:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  63  122:aload           6
	//*  64  124:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  65  127:iadd            
	//*  66  128:icmpge          133
							return -1;
	//   67  131:iconst_m1       
	//   68  132:ireturn         
						i = j - updateop.itemCount;
	//   69  133:iload_2         
	//   70  134:aload           6
	//   71  136:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   72  139:isub            
	//   73  140:istore_1        
					} else
	//*  74  141:goto            163
					{
						i = j;
	//   75  144:iload_2         
	//   76  145:istore_1        
						if(updateop.cmd == 1)
	//*  77  146:aload           6
	//*  78  148:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//*  79  151:iconst_1        
	//*  80  152:icmpne          163
							i = j + updateop.itemCount;
	//   81  155:iload_2         
	//   82  156:aload           6
	//   83  158:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   84  161:iadd            
	//   85  162:istore_1        
					}
			}
			l++;
	//   86  163:iload           4
	//   87  165:iconst_1        
	//   88  166:iadd            
	//   89  167:istore          4
		}

	//   90  169:iload_1         
	//   91  170:istore_2        
	//*  92  171:goto            14
		return j;
	//   93  174:iload_2         
	//   94  175:ireturn         
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
		if(j < 1)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:icmpge          7
			return false;
	//    3    5:iconst_0        
	//    4    6:ireturn         
		mPendingUpdates.add(((Object) (obtainUpdateOp(4, i, j, obj))));
	//    5    7:aload_0         
	//    6    8:getfield        #59  <Field ArrayList mPendingUpdates>
	//    7   11:aload_0         
	//    8   12:iconst_4        
	//    9   13:iload_1         
	//   10   14:iload_2         
	//   11   15:aload_3         
	//   12   16:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//   13   19:invokevirtual   #159 <Method boolean ArrayList.add(Object)>
	//   14   22:pop             
		mExistingUpdateTypes = mExistingUpdateTypes | 4;
	//   15   23:aload_0         
	//   16   24:aload_0         
	//   17   25:getfield        #63  <Field int mExistingUpdateTypes>
	//   18   28:iconst_4        
	//   19   29:ior             
	//   20   30:putfield        #63  <Field int mExistingUpdateTypes>
		return mPendingUpdates.size() == 1;
	//   21   33:aload_0         
	//   22   34:getfield        #59  <Field ArrayList mPendingUpdates>
	//   23   37:invokevirtual   #114 <Method int ArrayList.size()>
	//   24   40:iconst_1        
	//   25   41:icmpne          46
	//   26   44:iconst_1        
	//   27   45:ireturn         
	//   28   46:iconst_0        
	//   29   47:ireturn         
	}

	boolean onItemRangeInserted(int i, int j)
	{
		if(j < 1)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:icmpge          7
			return false;
	//    3    5:iconst_0        
	//    4    6:ireturn         
		mPendingUpdates.add(((Object) (obtainUpdateOp(1, i, j, ((Object) (null))))));
	//    5    7:aload_0         
	//    6    8:getfield        #59  <Field ArrayList mPendingUpdates>
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:iload_1         
	//   10   14:iload_2         
	//   11   15:aconst_null     
	//   12   16:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//   13   19:invokevirtual   #159 <Method boolean ArrayList.add(Object)>
	//   14   22:pop             
		mExistingUpdateTypes = mExistingUpdateTypes | 1;
	//   15   23:aload_0         
	//   16   24:aload_0         
	//   17   25:getfield        #63  <Field int mExistingUpdateTypes>
	//   18   28:iconst_1        
	//   19   29:ior             
	//   20   30:putfield        #63  <Field int mExistingUpdateTypes>
		return mPendingUpdates.size() == 1;
	//   21   33:aload_0         
	//   22   34:getfield        #59  <Field ArrayList mPendingUpdates>
	//   23   37:invokevirtual   #114 <Method int ArrayList.size()>
	//   24   40:iconst_1        
	//   25   41:icmpne          46
	//   26   44:iconst_1        
	//   27   45:ireturn         
	//   28   46:iconst_0        
	//   29   47:ireturn         
	}

	boolean onItemRangeMoved(int i, int j, int k)
	{
		if(i == j)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmpne          7
			return false;
	//    3    5:iconst_0        
	//    4    6:ireturn         
		if(k != 1)
	//*   5    7:iload_3         
	//*   6    8:iconst_1        
	//*   7    9:icmpeq          22
			throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
	//    8   12:new             #127 <Class IllegalArgumentException>
	//    9   15:dup             
	//   10   16:ldc1            #238 <String "Moving more than 1 item is not supported yet">
	//   11   18:invokespecial   #132 <Method void IllegalArgumentException(String)>
	//   12   21:athrow          
		mPendingUpdates.add(((Object) (obtainUpdateOp(8, i, j, ((Object) (null))))));
	//   13   22:aload_0         
	//   14   23:getfield        #59  <Field ArrayList mPendingUpdates>
	//   15   26:aload_0         
	//   16   27:bipush          8
	//   17   29:iload_1         
	//   18   30:iload_2         
	//   19   31:aconst_null     
	//   20   32:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//   21   35:invokevirtual   #159 <Method boolean ArrayList.add(Object)>
	//   22   38:pop             
		mExistingUpdateTypes = mExistingUpdateTypes | 8;
	//   23   39:aload_0         
	//   24   40:aload_0         
	//   25   41:getfield        #63  <Field int mExistingUpdateTypes>
	//   26   44:bipush          8
	//   27   46:ior             
	//   28   47:putfield        #63  <Field int mExistingUpdateTypes>
		return mPendingUpdates.size() == 1;
	//   29   50:aload_0         
	//   30   51:getfield        #59  <Field ArrayList mPendingUpdates>
	//   31   54:invokevirtual   #114 <Method int ArrayList.size()>
	//   32   57:iconst_1        
	//   33   58:icmpne          63
	//   34   61:iconst_1        
	//   35   62:ireturn         
	//   36   63:iconst_0        
	//   37   64:ireturn         
	}

	boolean onItemRangeRemoved(int i, int j)
	{
		if(j < 1)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:icmpge          7
			return false;
	//    3    5:iconst_0        
	//    4    6:ireturn         
		mPendingUpdates.add(((Object) (obtainUpdateOp(2, i, j, ((Object) (null))))));
	//    5    7:aload_0         
	//    6    8:getfield        #59  <Field ArrayList mPendingUpdates>
	//    7   11:aload_0         
	//    8   12:iconst_2        
	//    9   13:iload_1         
	//   10   14:iload_2         
	//   11   15:aconst_null     
	//   12   16:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//   13   19:invokevirtual   #159 <Method boolean ArrayList.add(Object)>
	//   14   22:pop             
		mExistingUpdateTypes = mExistingUpdateTypes | 2;
	//   15   23:aload_0         
	//   16   24:aload_0         
	//   17   25:getfield        #63  <Field int mExistingUpdateTypes>
	//   18   28:iconst_2        
	//   19   29:ior             
	//   20   30:putfield        #63  <Field int mExistingUpdateTypes>
		return mPendingUpdates.size() == 1;
	//   21   33:aload_0         
	//   22   34:getfield        #59  <Field ArrayList mPendingUpdates>
	//   23   37:invokevirtual   #114 <Method int ArrayList.size()>
	//   24   40:iconst_1        
	//   25   41:icmpne          46
	//   26   44:iconst_1        
	//   27   45:ireturn         
	//   28   46:iconst_0        
	//   29   47:ireturn         
	}

	void preProcess()
	{
		mOpReorderer.reorderOps(((List) (mPendingUpdates)));
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field OpReorderer mOpReorderer>
	//    2    4:aload_0         
	//    3    5:getfield        #59  <Field ArrayList mPendingUpdates>
	//    4    8:invokevirtual   #243 <Method void OpReorderer.reorderOps(List)>
		int j = mPendingUpdates.size();
	//    5   11:aload_0         
	//    6   12:getfield        #59  <Field ArrayList mPendingUpdates>
	//    7   15:invokevirtual   #114 <Method int ArrayList.size()>
	//    8   18:istore_2        
		for(int i = 0; i < j; i++)
	//*   9   19:iconst_0        
	//*  10   20:istore_1        
	//*  11   21:iload_1         
	//*  12   22:iload_2         
	//*  13   23:icmpge          143
		{
			UpdateOp updateop = (UpdateOp)mPendingUpdates.get(i);
	//   14   26:aload_0         
	//   15   27:getfield        #59  <Field ArrayList mPendingUpdates>
	//   16   30:iload_1         
	//   17   31:invokevirtual   #118 <Method Object ArrayList.get(int)>
	//   18   34:checkcast       #11  <Class AdapterHelper$UpdateOp>
	//   19   37:astore_3        
			switch(updateop.cmd)
	//*  20   38:aload_3         
	//*  21   39:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
			{
	//*  22   42:tableswitch     1 8: default 88
	//	               1 91
	//	               2 99
	//	               3 120
	//	               4 107
	//	               5 120
	//	               6 120
	//	               7 120
	//	               8 115
	//*  23   88:goto            120
			case 1: // '\001'
				applyAdd(updateop);
	//   24   91:aload_0         
	//   25   92:aload_3         
	//   26   93:invokespecial   #245 <Method void applyAdd(AdapterHelper$UpdateOp)>
				break;

	//*  27   96:goto            120
			case 2: // '\002'
				applyRemove(updateop);
	//   28   99:aload_0         
	//   29  100:aload_3         
	//   30  101:invokespecial   #247 <Method void applyRemove(AdapterHelper$UpdateOp)>
				break;

	//*  31  104:goto            120
			case 4: // '\004'
				applyUpdate(updateop);
	//   32  107:aload_0         
	//   33  108:aload_3         
	//   34  109:invokespecial   #249 <Method void applyUpdate(AdapterHelper$UpdateOp)>
				break;

	//*  35  112:goto            120
			case 8: // '\b'
				applyMove(updateop);
	//   36  115:aload_0         
	//   37  116:aload_3         
	//   38  117:invokespecial   #251 <Method void applyMove(AdapterHelper$UpdateOp)>
				break;
			}
			if(mOnItemProcessedCallback != null)
	//*  39  120:aload_0         
	//*  40  121:getfield        #204 <Field Runnable mOnItemProcessedCallback>
	//*  41  124:ifnull          136
				mOnItemProcessedCallback.run();
	//   42  127:aload_0         
	//   43  128:getfield        #204 <Field Runnable mOnItemProcessedCallback>
	//   44  131:invokeinterface #209 <Method void Runnable.run()>
		}

	//   45  136:iload_1         
	//   46  137:iconst_1        
	//   47  138:iadd            
	//   48  139:istore_1        
	//*  49  140:goto            21
		mPendingUpdates.clear();
	//   50  143:aload_0         
	//   51  144:getfield        #59  <Field ArrayList mPendingUpdates>
	//   52  147:invokevirtual   #254 <Method void ArrayList.clear()>
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
