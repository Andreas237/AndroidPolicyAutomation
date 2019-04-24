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
		int j = updateop.positionStart + updateop.itemCount;
	//    3    6:aload_1         
	//    4    7:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//    5   10:aload_1         
	//    6   11:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//    7   14:iadd            
	//    8   15:istore          4
		byte byte0 = -1;
	//    9   17:iconst_m1       
	//   10   18:istore_3        
		int i = updateop.positionStart;
	//   11   19:aload_1         
	//   12   20:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   13   23:istore_2        
		int l = 0;
	//   14   24:iconst_0        
	//   15   25:istore          6
		while(i < j) 
	//*  16   27:iload_2         
	//*  17   28:iload           4
	//*  18   30:icmpge          164
		{
			if(mCallback.findViewHolder(i) != null || canFindInPreLayout(i))
	//*  19   33:aload_0         
	//*  20   34:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//*  21   37:iload_2         
	//*  22   38:invokeinterface #91  <Method RecyclerView$ViewHolder AdapterHelper$Callback.findViewHolder(int)>
	//*  23   43:ifnonnull       54
	//*  24   46:aload_0         
	//*  25   47:iload_2         
	//*  26   48:invokespecial   #95  <Method boolean canFindInPreLayout(int)>
	//*  27   51:ifeq            112
			{
				int k;
				boolean flag;
				UpdateOp updateop1;
				if(byte0 == 0)
	//*  28   54:iload_3         
	//*  29   55:ifne            216
				{
					dispatchAndUpdateViewHolders(obtainUpdateOp(2, i1, l, ((Object) (null))));
	//   30   58:aload_0         
	//   31   59:aload_0         
	//   32   60:iconst_2        
	//   33   61:iload           8
	//   34   63:iload           6
	//   35   65:aconst_null     
	//   36   66:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//   37   69:invokespecial   #102 <Method void dispatchAndUpdateViewHolders(AdapterHelper$UpdateOp)>
					k = 1;
	//   38   72:iconst_1        
	//   39   73:istore          5
				} else
	//*  40   75:iconst_1        
	//*  41   76:istore_3        
	//*  42   77:iload           5
	//*  43   79:ifeq            145
	//*  44   82:iload_2         
	//*  45   83:iload           6
	//*  46   85:isub            
	//*  47   86:istore          5
	//*  48   88:iload           4
	//*  49   90:iload           6
	//*  50   92:isub            
	//*  51   93:istore_2        
	//*  52   94:iconst_1        
	//*  53   95:istore          4
	//*  54   97:iload           4
	//*  55   99:istore          6
	//*  56  101:iload_2         
	//*  57  102:istore          4
	//*  58  104:iload           5
	//*  59  106:iconst_1        
	//*  60  107:iadd            
	//*  61  108:istore_2        
	//*  62  109:goto            27
	//*  63  112:iload_3         
	//*  64  113:iconst_1        
	//*  65  114:icmpne          211
	//*  66  117:aload_0         
	//*  67  118:aload_0         
	//*  68  119:iconst_2        
	//*  69  120:iload           8
	//*  70  122:iload           6
	//*  71  124:aconst_null     
	//*  72  125:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//*  73  128:invokespecial   #79  <Method void postponeAndUpdateViewHolders(AdapterHelper$UpdateOp)>
	//*  74  131:iconst_1        
	//*  75  132:istore_3        
	//*  76  133:iconst_0        
	//*  77  134:istore          7
	//*  78  136:iload_3         
	//*  79  137:istore          5
	//*  80  139:iload           7
	//*  81  141:istore_3        
	//*  82  142:goto            77
	//*  83  145:iload           6
	//*  84  147:iconst_1        
	//*  85  148:iadd            
	//*  86  149:istore          6
	//*  87  151:iload_2         
	//*  88  152:istore          5
	//*  89  154:iload           4
	//*  90  156:istore_2        
	//*  91  157:iload           6
	//*  92  159:istore          4
	//*  93  161:goto            97
	//*  94  164:aload_1         
	//*  95  165:astore          9
	//*  96  167:iload           6
	//*  97  169:aload_1         
	//*  98  170:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  99  173:icmpeq          193
	//* 100  176:aload_0         
	//* 101  177:aload_1         
	//* 102  178:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
	//* 103  181:aload_0         
	//* 104  182:iconst_2        
	//* 105  183:iload           8
	//* 106  185:iload           6
	//* 107  187:aconst_null     
	//* 108  188:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//* 109  191:astore          9
	//* 110  193:iload_3         
	//* 111  194:ifne            204
	//* 112  197:aload_0         
	//* 113  198:aload           9
	//* 114  200:invokespecial   #102 <Method void dispatchAndUpdateViewHolders(AdapterHelper$UpdateOp)>
	//* 115  203:return          
	//* 116  204:aload_0         
	//* 117  205:aload           9
	//* 118  207:invokespecial   #79  <Method void postponeAndUpdateViewHolders(AdapterHelper$UpdateOp)>
	//* 119  210:return          
	//* 120  211:iconst_0        
	//* 121  212:istore_3        
	//* 122  213:goto            133
				{
					k = 0;
	//  123  216:iconst_0        
	//  124  217:istore          5
				}
				byte0 = 1;
			} else
			{
				if(byte0 == 1)
				{
					postponeAndUpdateViewHolders(obtainUpdateOp(2, i1, l, ((Object) (null))));
					byte0 = 1;
				} else
				{
					byte0 = 0;
				}
				flag = false;
				k = ((int) (byte0));
				byte0 = ((byte) (flag));
			}
			if(k != 0)
			{
				k = i - l;
				i = j - l;
				j = 1;
			} else
			{
				l++;
				k = i;
				i = j;
				j = l;
			}
			l = j;
			j = i;
			i = k + 1;
		}
		updateop1 = updateop;
		if(l != updateop.itemCount)
		{
			recycleUpdateOp(updateop);
			updateop1 = obtainUpdateOp(2, i1, l, ((Object) (null)));
		}
		if(byte0 == 0)
		{
			dispatchAndUpdateViewHolders(updateop1);
			return;
		} else
		{
			postponeAndUpdateViewHolders(updateop1);
			return;
		}
	//* 125  219:goto            75
	}

	private void applyUpdate(UpdateOp updateop)
	{
		int k = updateop.positionStart;
	//    0    0:aload_1         
	//    1    1:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//    2    4:istore          4
		int l1 = updateop.positionStart;
	//    3    6:aload_1         
	//    4    7:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//    5   10:istore          8
		int i2 = updateop.itemCount;
	//    6   12:aload_1         
	//    7   13:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//    8   16:istore          9
		int i = updateop.positionStart;
	//    9   18:aload_1         
	//   10   19:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   11   22:istore_2        
		int k1 = -1;
	//   12   23:iconst_m1       
	//   13   24:istore          7
		int j = 0;
	//   14   26:iconst_0        
	//   15   27:istore_3        
		while(i < l1 + i2) 
	//*  16   28:iload_2         
	//*  17   29:iload           8
	//*  18   31:iload           9
	//*  19   33:iadd            
	//*  20   34:icmpge          161
		{
			int l;
			if(mCallback.findViewHolder(i) != null || canFindInPreLayout(i))
	//*  21   37:aload_0         
	//*  22   38:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//*  23   41:iload_2         
	//*  24   42:invokeinterface #91  <Method RecyclerView$ViewHolder AdapterHelper$Callback.findViewHolder(int)>
	//*  25   47:ifnonnull       58
	//*  26   50:aload_0         
	//*  27   51:iload_2         
	//*  28   52:invokespecial   #95  <Method boolean canFindInPreLayout(int)>
	//*  29   55:ifeq            117
			{
				l = j;
	//   30   58:iload_3         
	//   31   59:istore          5
				int i1 = k;
	//   32   61:iload           4
	//   33   63:istore          6
				if(k1 == 0)
	//*  34   65:iload           7
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
					l = 0;
	//   45   86:iconst_0        
	//   46   87:istore          5
					i1 = i;
	//   47   89:iload_2         
	//   48   90:istore          6
				}
				k = i1;
	//   49   92:iload           6
	//   50   94:istore          4
				j = 1;
	//   51   96:iconst_1        
	//   52   97:istore_3        
			} else
	//*  53   98:iload_2         
	//*  54   99:iconst_1        
	//*  55  100:iadd            
	//*  56  101:istore_2        
	//*  57  102:iload           5
	//*  58  104:iconst_1        
	//*  59  105:iadd            
	//*  60  106:istore          5
	//*  61  108:iload_3         
	//*  62  109:istore          7
	//*  63  111:iload           5
	//*  64  113:istore_3        
	//*  65  114:goto            28
			{
				l = j;
	//   66  117:iload_3         
	//   67  118:istore          5
				int j1 = k;
	//   68  120:iload           4
	//   69  122:istore          6
				if(k1 == 1)
	//*  70  124:iload           7
	//*  71  126:iconst_1        
	//*  72  127:icmpne          152
				{
					postponeAndUpdateViewHolders(obtainUpdateOp(4, k, j, updateop.payload));
	//   73  130:aload_0         
	//   74  131:aload_0         
	//   75  132:iconst_4        
	//   76  133:iload           4
	//   77  135:iload_3         
	//   78  136:aload_1         
	//   79  137:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//   80  140:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//   81  143:invokespecial   #79  <Method void postponeAndUpdateViewHolders(AdapterHelper$UpdateOp)>
					l = 0;
	//   82  146:iconst_0        
	//   83  147:istore          5
					j1 = i;
	//   84  149:iload_2         
	//   85  150:istore          6
				}
				k = j1;
	//   86  152:iload           6
	//   87  154:istore          4
				j = 0;
	//   88  156:iconst_0        
	//   89  157:istore_3        
			}
			i++;
			l++;
			k1 = j;
			j = l;
		}
	//*  90  158:goto            98
		Object obj = ((Object) (updateop));
	//   91  161:aload_1         
	//   92  162:astore          10
		if(j != updateop.itemCount)
	//*  93  164:iload_3         
	//*  94  165:aload_1         
	//*  95  166:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  96  169:icmpeq          195
		{
			obj = updateop.payload;
	//   97  172:aload_1         
	//   98  173:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//   99  176:astore          10
			recycleUpdateOp(updateop);
	//  100  178:aload_0         
	//  101  179:aload_1         
	//  102  180:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
			obj = ((Object) (obtainUpdateOp(4, k, j, obj)));
	//  103  183:aload_0         
	//  104  184:iconst_4        
	//  105  185:iload           4
	//  106  187:iload_3         
	//  107  188:aload           10
	//  108  190:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//  109  193:astore          10
		}
		if(k1 == 0)
	//* 110  195:iload           7
	//* 111  197:ifne            207
		{
			dispatchAndUpdateViewHolders(((UpdateOp) (obj)));
	//  112  200:aload_0         
	//  113  201:aload           10
	//  114  203:invokespecial   #102 <Method void dispatchAndUpdateViewHolders(AdapterHelper$UpdateOp)>
			return;
	//  115  206:return          
		} else
		{
			postponeAndUpdateViewHolders(((UpdateOp) (obj)));
	//  116  207:aload_0         
	//  117  208:aload           10
	//  118  210:invokespecial   #79  <Method void postponeAndUpdateViewHolders(AdapterHelper$UpdateOp)>
			return;
	//  119  213:return          
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
		int j;
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
		j = updateop.positionStart;
	//   20   41:aload_1         
	//   21   42:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   22   45:istore_3        
		updateop.cmd;
	//   23   46:aload_1         
	//   24   47:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
		JVM INSTR tableswitch 2 4: default 76
	//	               2 195
	//	               3 76
	//	               4 103;
	//   25   50:tableswitch     2 4: default 76
	//	               2 195
	//	               3 76
	//	               4 103
		   goto _L1 _L2 _L1 _L3
_L1:
		throw new IllegalArgumentException((new StringBuilder()).append("op should be remove or update.").append(((Object) (updateop))).toString());
	//   26   76:new             #127 <Class IllegalArgumentException>
	//   27   79:dup             
	//   28   80:new             #137 <Class StringBuilder>
	//   29   83:dup             
	//   30   84:invokespecial   #138 <Method void StringBuilder()>
	//   31   87:ldc1            #140 <String "op should be remove or update.">
	//   32   89:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   33   92:aload_1         
	//   34   93:invokevirtual   #147 <Method StringBuilder StringBuilder.append(Object)>
	//   35   96:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   36   99:invokespecial   #132 <Method void IllegalArgumentException(String)>
	//   37  102:athrow          
_L3:
		int k = 1;
	//   38  103:iconst_1        
	//   39  104:istore          4
_L8:
		int l;
		int i1;
		i1 = 1;
	//   40  106:iconst_1        
	//   41  107:istore          6
		l = 1;
	//   42  109:iconst_1        
	//   43  110:istore          5
_L7:
		int k1;
		if(l >= updateop.itemCount)
			break MISSING_BLOCK_LABEL_298;
	//   44  112:iload           5
	//   45  114:aload_1         
	//   46  115:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   47  118:icmpge          298
		k1 = updatePositionWithPostponed(updateop.positionStart + k * l, updateop.cmd);
	//   48  121:aload_0         
	//   49  122:aload_1         
	//   50  123:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   51  126:iload           4
	//   52  128:iload           5
	//   53  130:imul            
	//   54  131:iadd            
	//   55  132:aload_1         
	//   56  133:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//   57  136:invokespecial   #135 <Method int updatePositionWithPostponed(int, int)>
	//   58  139:istore          8
		updateop.cmd;
	//   59  141:aload_1         
	//   60  142:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
		JVM INSTR tableswitch 2 4: default 172
	//	               2 220
	//	               3 172
	//	               4 201;
	//   61  145:tableswitch     2 4: default 172
	//	               2 220
	//	               3 172
	//	               4 201
		   goto _L4 _L5 _L4 _L6
_L4:
		int i = 0;
	//   62  172:iconst_0        
	//   63  173:istore_2        
_L9:
		if(i != 0)
	//*  64  174:iload_2         
	//*  65  175:ifeq            237
		{
			i = i1 + 1;
	//   66  178:iload           6
	//   67  180:iconst_1        
	//   68  181:iadd            
	//   69  182:istore_2        
		} else
	//*  70  183:iload           5
	//*  71  185:iconst_1        
	//*  72  186:iadd            
	//*  73  187:istore          5
	//*  74  189:iload_2         
	//*  75  190:istore          6
	//*  76  192:goto            112
	//*  77  195:iconst_0        
	//*  78  196:istore          4
	//*  79  198:goto            106
	//*  80  201:iload           8
	//*  81  203:iload           7
	//*  82  205:iconst_1        
	//*  83  206:iadd            
	//*  84  207:icmpne          215
	//*  85  210:iconst_1        
	//*  86  211:istore_2        
	//*  87  212:goto            174
	//*  88  215:iconst_0        
	//*  89  216:istore_2        
	//*  90  217:goto            174
	//*  91  220:iload           8
	//*  92  222:iload           7
	//*  93  224:icmpne          232
	//*  94  227:iconst_1        
	//*  95  228:istore_2        
	//*  96  229:goto            174
	//*  97  232:iconst_0        
	//*  98  233:istore_2        
	//*  99  234:goto            174
		{
			UpdateOp updateop1 = obtainUpdateOp(updateop.cmd, j1, i1, updateop.payload);
	//  100  237:aload_0         
	//  101  238:aload_1         
	//  102  239:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//  103  242:iload           7
	//  104  244:iload           6
	//  105  246:aload_1         
	//  106  247:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//  107  250:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//  108  253:astore          9
			dispatchFirstPassAndUpdateViewHolders(updateop1, j);
	//  109  255:aload_0         
	//  110  256:aload           9
	//  111  258:iload_3         
	//  112  259:invokevirtual   #155 <Method void dispatchFirstPassAndUpdateViewHolders(AdapterHelper$UpdateOp, int)>
			recycleUpdateOp(updateop1);
	//  113  262:aload_0         
	//  114  263:aload           9
	//  115  265:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
			i = j;
	//  116  268:iload_3         
	//  117  269:istore_2        
			if(updateop.cmd == 4)
	//* 118  270:aload_1         
	//* 119  271:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//* 120  274:iconst_4        
	//* 121  275:icmpne          283
				i = j + i1;
	//  122  278:iload_3         
	//  123  279:iload           6
	//  124  281:iadd            
	//  125  282:istore_2        
			i1 = 1;
	//  126  283:iconst_1        
	//  127  284:istore          6
			j1 = k1;
	//  128  286:iload           8
	//  129  288:istore          7
			j = i;
	//  130  290:iload_2         
	//  131  291:istore_3        
			i = i1;
	//  132  292:iload           6
	//  133  294:istore_2        
		}
		l++;
		i1 = i;
		  goto _L7
_L2:
		k = 0;
		  goto _L8
_L6:
		if(k1 == j1 + 1)
			i = 1;
		else
			i = 0;
		  goto _L9
_L5:
		if(k1 == j1)
			i = 1;
		else
			i = 0;
		  goto _L9
	//* 134  295:goto            183
		Object obj = updateop.payload;
	//  135  298:aload_1         
	//  136  299:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//  137  302:astore          9
		recycleUpdateOp(updateop);
	//  138  304:aload_0         
	//  139  305:aload_1         
	//  140  306:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
		if(i1 > 0)
	//* 141  309:iload           6
	//* 142  311:ifle            340
		{
			updateop = obtainUpdateOp(updateop.cmd, j1, i1, obj);
	//  143  314:aload_0         
	//  144  315:aload_1         
	//  145  316:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//  146  319:iload           7
	//  147  321:iload           6
	//  148  323:aload           9
	//  149  325:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//  150  328:astore_1        
			dispatchFirstPassAndUpdateViewHolders(updateop, j);
	//  151  329:aload_0         
	//  152  330:aload_1         
	//  153  331:iload_3         
	//  154  332:invokevirtual   #155 <Method void dispatchFirstPassAndUpdateViewHolders(AdapterHelper$UpdateOp, int)>
			recycleUpdateOp(updateop);
	//  155  335:aload_0         
	//  156  336:aload_1         
	//  157  337:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
		}
		return;
	//  158  340:return          
		  goto _L7
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
		int l = mPostponedList.size() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field ArrayList mPostponedList>
	//    2    4:invokevirtual   #114 <Method int ArrayList.size()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore          4
		do
		{
			if(l >= 0)
	//*   6   11:iload           4
	//*   7   13:iflt            371
			{
				UpdateOp updateop = (UpdateOp)mPostponedList.get(l);
	//    8   16:aload_0         
	//    9   17:getfield        #61  <Field ArrayList mPostponedList>
	//   10   20:iload           4
	//   11   22:invokevirtual   #118 <Method Object ArrayList.get(int)>
	//   12   25:checkcast       #11  <Class AdapterHelper$UpdateOp>
	//   13   28:astore          6
				int k;
				if(updateop.cmd == 8)
	//*  14   30:aload           6
	//*  15   32:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//*  16   35:bipush          8
	//*  17   37:icmpne          274
				{
					int i1;
					if(updateop.positionStart < updateop.itemCount)
	//*  18   40:aload           6
	//*  19   42:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  20   45:aload           6
	//*  21   47:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  22   50:icmpge          121
					{
						i1 = updateop.positionStart;
	//   23   53:aload           6
	//   24   55:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   25   58:istore          5
						k = updateop.itemCount;
	//   26   60:aload           6
	//   27   62:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   28   65:istore_3        
					} else
	//*  29   66:iload_1         
	//*  30   67:iload           5
	//*  31   69:icmplt          201
	//*  32   72:iload_1         
	//*  33   73:iload_3         
	//*  34   74:icmpgt          201
	//*  35   77:iload           5
	//*  36   79:aload           6
	//*  37   81:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  38   84:icmpne          157
	//*  39   87:iload_2         
	//*  40   88:iconst_1        
	//*  41   89:icmpne          137
	//*  42   92:aload           6
	//*  43   94:aload           6
	//*  44   96:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  45   99:iconst_1        
	//*  46  100:iadd            
	//*  47  101:putfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  48  104:iload_1         
	//*  49  105:iconst_1        
	//*  50  106:iadd            
	//*  51  107:istore_1        
	//*  52  108:iload_1         
	//*  53  109:istore_3        
	//*  54  110:iload           4
	//*  55  112:iconst_1        
	//*  56  113:isub            
	//*  57  114:istore          4
	//*  58  116:iload_3         
	//*  59  117:istore_1        
	//*  60  118:goto            11
					{
						i1 = updateop.itemCount;
	//   61  121:aload           6
	//   62  123:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   63  126:istore          5
						k = updateop.positionStart;
	//   64  128:aload           6
	//   65  130:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   66  133:istore_3        
					}
					if(i >= i1 && i <= k)
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
	//*  70  139:icmpne          104
								updateop.itemCount = updateop.itemCount - 1;
	//   71  142:aload           6
	//   72  144:aload           6
	//   73  146:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   74  149:iconst_1        
	//   75  150:isub            
	//   76  151:putfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
							i++;
						} else
	//*  77  154:goto            104
						{
							if(j == 1)
	//*  78  157:iload_2         
	//*  79  158:iconst_1        
	//*  80  159:icmpne          181
								updateop.positionStart = updateop.positionStart + 1;
	//   81  162:aload           6
	//   82  164:aload           6
	//   83  166:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   84  169:iconst_1        
	//   85  170:iadd            
	//   86  171:putfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
							else
	//*  87  174:iload_1         
	//*  88  175:iconst_1        
	//*  89  176:isub            
	//*  90  177:istore_1        
	//*  91  178:goto            108
							if(j == 2)
	//*  92  181:iload_2         
	//*  93  182:iconst_2        
	//*  94  183:icmpne          174
								updateop.positionStart = updateop.positionStart - 1;
	//   95  186:aload           6
	//   96  188:aload           6
	//   97  190:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   98  193:iconst_1        
	//   99  194:isub            
	//  100  195:putfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
							i--;
						}
					} else
	//* 101  198:goto            174
					if(i < updateop.positionStart)
	//* 102  201:iload_1         
	//* 103  202:aload           6
	//* 104  204:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 105  207:icmpge          271
						if(j == 1)
	//* 106  210:iload_2         
	//* 107  211:iconst_1        
	//* 108  212:icmpne          242
						{
							updateop.positionStart = updateop.positionStart + 1;
	//  109  215:aload           6
	//  110  217:aload           6
	//  111  219:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//  112  222:iconst_1        
	//  113  223:iadd            
	//  114  224:putfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
							updateop.itemCount = updateop.itemCount + 1;
	//  115  227:aload           6
	//  116  229:aload           6
	//  117  231:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//  118  234:iconst_1        
	//  119  235:iadd            
	//  120  236:putfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
						} else
	//* 121  239:goto            108
						if(j == 2)
	//* 122  242:iload_2         
	//* 123  243:iconst_2        
	//* 124  244:icmpne          271
						{
							updateop.positionStart = updateop.positionStart - 1;
	//  125  247:aload           6
	//  126  249:aload           6
	//  127  251:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//  128  254:iconst_1        
	//  129  255:isub            
	//  130  256:putfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
							updateop.itemCount = updateop.itemCount - 1;
	//  131  259:aload           6
	//  132  261:aload           6
	//  133  263:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//  134  266:iconst_1        
	//  135  267:isub            
	//  136  268:putfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
						}
					k = i;
				} else
	//* 137  271:goto            108
				if(updateop.positionStart <= i)
	//* 138  274:aload           6
	//* 139  276:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 140  279:iload_1         
	//* 141  280:icmpgt          325
				{
					if(updateop.cmd == 1)
	//* 142  283:aload           6
	//* 143  285:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//* 144  288:iconst_1        
	//* 145  289:icmpne          303
					{
						k = i - updateop.itemCount;
	//  146  292:iload_1         
	//  147  293:aload           6
	//  148  295:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//  149  298:isub            
	//  150  299:istore_3        
					} else
	//* 151  300:goto            110
					{
						k = i;
	//  152  303:iload_1         
	//  153  304:istore_3        
						if(updateop.cmd == 2)
	//* 154  305:aload           6
	//* 155  307:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//* 156  310:iconst_2        
	//* 157  311:icmpne          110
							k = i + updateop.itemCount;
	//  158  314:iload_1         
	//  159  315:aload           6
	//  160  317:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//  161  320:iadd            
	//  162  321:istore_3        
					}
				} else
	//* 163  322:goto            110
				if(j == 1)
	//* 164  325:iload_2         
	//* 165  326:iconst_1        
	//* 166  327:icmpne          347
				{
					updateop.positionStart = updateop.positionStart + 1;
	//  167  330:aload           6
	//  168  332:aload           6
	//  169  334:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//  170  337:iconst_1        
	//  171  338:iadd            
	//  172  339:putfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
					k = i;
	//  173  342:iload_1         
	//  174  343:istore_3        
				} else
	//* 175  344:goto            110
				{
					k = i;
	//  176  347:iload_1         
	//  177  348:istore_3        
					if(j == 2)
	//* 178  349:iload_2         
	//* 179  350:iconst_2        
	//* 180  351:icmpne          110
					{
						updateop.positionStart = updateop.positionStart - 1;
	//  181  354:aload           6
	//  182  356:aload           6
	//  183  358:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//  184  361:iconst_1        
	//  185  362:isub            
	//  186  363:putfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
						k = i;
	//  187  366:iload_1         
	//  188  367:istore_3        
					}
				}
				l--;
				i = k;
				continue;
			}
	//* 189  368:goto            110
			j = mPostponedList.size() - 1;
	//  190  371:aload_0         
	//  191  372:getfield        #61  <Field ArrayList mPostponedList>
	//  192  375:invokevirtual   #114 <Method int ArrayList.size()>
	//  193  378:iconst_1        
	//  194  379:isub            
	//  195  380:istore_2        
			while(j >= 0) 
	//* 196  381:iload_2         
	//* 197  382:iflt            477
			{
				UpdateOp updateop1 = (UpdateOp)mPostponedList.get(j);
	//  198  385:aload_0         
	//  199  386:getfield        #61  <Field ArrayList mPostponedList>
	//  200  389:iload_2         
	//  201  390:invokevirtual   #118 <Method Object ArrayList.get(int)>
	//  202  393:checkcast       #11  <Class AdapterHelper$UpdateOp>
	//  203  396:astore          6
				if(updateop1.cmd == 8)
	//* 204  398:aload           6
	//* 205  400:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//* 206  403:bipush          8
	//* 207  405:icmpne          451
				{
					if(updateop1.itemCount == updateop1.positionStart || updateop1.itemCount < 0)
	//* 208  408:aload           6
	//* 209  410:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 210  413:aload           6
	//* 211  415:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 212  418:icmpeq          429
	//* 213  421:aload           6
	//* 214  423:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 215  426:ifge            444
					{
						mPostponedList.remove(j);
	//  216  429:aload_0         
	//  217  430:getfield        #61  <Field ArrayList mPostponedList>
	//  218  433:iload_2         
	//  219  434:invokevirtual   #178 <Method Object ArrayList.remove(int)>
	//  220  437:pop             
						recycleUpdateOp(updateop1);
	//  221  438:aload_0         
	//  222  439:aload           6
	//  223  441:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
					}
				} else
	//* 224  444:iload_2         
	//* 225  445:iconst_1        
	//* 226  446:isub            
	//* 227  447:istore_2        
	//* 228  448:goto            381
				if(updateop1.itemCount <= 0)
	//* 229  451:aload           6
	//* 230  453:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 231  456:ifgt            444
				{
					mPostponedList.remove(j);
	//  232  459:aload_0         
	//  233  460:getfield        #61  <Field ArrayList mPostponedList>
	//  234  463:iload_2         
	//  235  464:invokevirtual   #178 <Method Object ArrayList.remove(int)>
	//  236  467:pop             
					recycleUpdateOp(updateop1);
	//  237  468:aload_0         
	//  238  469:aload           6
	//  239  471:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
				}
				j--;
			}
	//* 240  474:goto            444
			return i;
	//  241  477:iload_1         
	//  242  478:ireturn         
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
