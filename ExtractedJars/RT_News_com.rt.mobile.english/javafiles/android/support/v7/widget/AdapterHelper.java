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
			int i = cmd;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field int cmd>
		//    2    4:istore_1        
			if(i != 4)
		//*   3    5:iload_1         
		//*   4    6:iconst_4        
		//*   5    7:icmpeq          52
			{
				if(i != 8)
		//*   6   10:iload_1         
		//*   7   11:bipush          8
		//*   8   13:icmpeq          49
					switch(i)
		//*   9   16:iload_1         
					{
		//*  10   17:tableswitch     1 2: default 40
		//		               1 46
		//		               2 43
					default:
						return "??";
		//   11   40:ldc1            #41  <String "??">
		//   12   42:areturn         

					case 2: // '\002'
						return "rm";
		//   13   43:ldc1            #43  <String "rm">
		//   14   45:areturn         

					case 1: // '\001'
						return "add";
		//   15   46:ldc1            #45  <String "add">
		//   16   48:areturn         
					}
				else
					return "mv";
		//   17   49:ldc1            #47  <String "mv">
		//   18   51:areturn         
			} else
			{
				return "up";
		//   19   52:ldc1            #49  <String "up">
		//   20   54:areturn         
			}
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
			if(obj != null)
		//*   5    7:aload_1         
		//*   6    8:ifnull          151
			{
				if(((Object)this).getClass() != obj.getClass())
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
			} else
			{
				return false;
		//   80  151:iconst_0        
		//   81  152:ireturn         
			}
		}

		public int hashCode()
		{
			return 31 * (cmd * 31 + positionStart) + itemCount;
		//    0    0:bipush          31
		//    1    2:aload_0         
		//    2    3:getfield        #30  <Field int cmd>
		//    3    6:bipush          31
		//    4    8:imul            
		//    5    9:aload_0         
		//    6   10:getfield        #32  <Field int positionStart>
		//    7   13:iadd            
		//    8   14:imul            
		//    9   15:aload_0         
		//   10   16:getfield        #34  <Field int itemCount>
		//   11   19:iadd            
		//   12   20:ireturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #68  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #69  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:invokestatic    #75  <Method int System.identityHashCode(Object)>
		//    7   13:invokestatic    #81  <Method String Integer.toHexString(int)>
		//    8   16:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
		//    9   19:pop             
			stringbuilder.append("[");
		//   10   20:aload_1         
		//   11   21:ldc1            #87  <String "[">
		//   12   23:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
		//   13   26:pop             
			stringbuilder.append(cmdToString());
		//   14   27:aload_1         
		//   15   28:aload_0         
		//   16   29:invokevirtual   #89  <Method String cmdToString()>
		//   17   32:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
		//   18   35:pop             
			stringbuilder.append(",s:");
		//   19   36:aload_1         
		//   20   37:ldc1            #91  <String ",s:">
		//   21   39:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
		//   22   42:pop             
			stringbuilder.append(positionStart);
		//   23   43:aload_1         
		//   24   44:aload_0         
		//   25   45:getfield        #32  <Field int positionStart>
		//   26   48:invokevirtual   #94  <Method StringBuilder StringBuilder.append(int)>
		//   27   51:pop             
			stringbuilder.append("c:");
		//   28   52:aload_1         
		//   29   53:ldc1            #96  <String "c:">
		//   30   55:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
		//   31   58:pop             
			stringbuilder.append(itemCount);
		//   32   59:aload_1         
		//   33   60:aload_0         
		//   34   61:getfield        #34  <Field int itemCount>
		//   35   64:invokevirtual   #94  <Method StringBuilder StringBuilder.append(int)>
		//   36   67:pop             
			stringbuilder.append(",p:");
		//   37   68:aload_1         
		//   38   69:ldc1            #98  <String ",p:">
		//   39   71:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
		//   40   74:pop             
			stringbuilder.append(payload);
		//   41   75:aload_1         
		//   42   76:aload_0         
		//   43   77:getfield        #36  <Field Object payload>
		//   44   80:invokevirtual   #101 <Method StringBuilder StringBuilder.append(Object)>
		//   45   83:pop             
			stringbuilder.append("]");
		//   46   84:aload_1         
		//   47   85:ldc1            #103 <String "]">
		//   48   87:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
		//   49   90:pop             
			return stringbuilder.toString();
		//   50   91:aload_1         
		//   51   92:invokevirtual   #105 <Method String StringBuilder.toString()>
		//   52   95:areturn         
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
		int k = updateop.positionStart + updateop.itemCount;
	//    3    6:aload_1         
	//    4    7:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//    5   10:aload_1         
	//    6   11:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//    7   14:iadd            
	//    8   15:istore          5
		int i = updateop.positionStart;
	//    9   17:aload_1         
	//   10   18:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   11   21:istore_2        
		byte byte0 = -1;
	//   12   22:iconst_m1       
	//   13   23:istore_3        
		int j;
		int l;
		for(l = 0; i < k; l = j)
	//*  14   24:iconst_0        
	//*  15   25:istore          6
	//*  16   27:iload_2         
	//*  17   28:iload           5
	//*  18   30:icmpge          164
		{
			if(mCallback.findViewHolder(i) == null && !canFindInPreLayout(i))
	//*  19   33:aload_0         
	//*  20   34:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//*  21   37:iload_2         
	//*  22   38:invokeinterface #91  <Method RecyclerView$ViewHolder AdapterHelper$Callback.findViewHolder(int)>
	//*  23   43:ifnonnull       95
	//*  24   46:aload_0         
	//*  25   47:iload_2         
	//*  26   48:invokespecial   #95  <Method boolean canFindInPreLayout(int)>
	//*  27   51:ifeq            57
	//*  28   54:goto            95
			{
				if(byte0 == 1)
	//*  29   57:iload_3         
	//*  30   58:iconst_1        
	//*  31   59:icmpne          81
				{
					postponeAndUpdateViewHolders(obtainUpdateOp(2, i1, l, ((Object) (null))));
	//   32   62:aload_0         
	//   33   63:aload_0         
	//   34   64:iconst_2        
	//   35   65:iload           8
	//   36   67:iload           6
	//   37   69:aconst_null     
	//   38   70:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//   39   73:invokespecial   #79  <Method void postponeAndUpdateViewHolders(AdapterHelper$UpdateOp)>
					byte0 = 1;
	//   40   76:iconst_1        
	//   41   77:istore_3        
				} else
	//*  42   78:goto            83
				{
					byte0 = 0;
	//   43   81:iconst_0        
	//   44   82:istore_3        
				}
				boolean flag = false;
	//   45   83:iconst_0        
	//   46   84:istore          7
				j = ((int) (byte0));
	//   47   86:iload_3         
	//   48   87:istore          4
				byte0 = ((byte) (flag));
	//   49   89:iload           7
	//   50   91:istore_3        
			} else
	//*  51   92:goto            124
			{
				if(byte0 == 0)
	//*  52   95:iload_3         
	//*  53   96:ifne            119
				{
					dispatchAndUpdateViewHolders(obtainUpdateOp(2, i1, l, ((Object) (null))));
	//   54   99:aload_0         
	//   55  100:aload_0         
	//   56  101:iconst_2        
	//   57  102:iload           8
	//   58  104:iload           6
	//   59  106:aconst_null     
	//   60  107:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//   61  110:invokespecial   #102 <Method void dispatchAndUpdateViewHolders(AdapterHelper$UpdateOp)>
					j = 1;
	//   62  113:iconst_1        
	//   63  114:istore          4
				} else
	//*  64  116:goto            122
				{
					j = 0;
	//   65  119:iconst_0        
	//   66  120:istore          4
				}
				byte0 = 1;
	//   67  122:iconst_1        
	//   68  123:istore_3        
			}
			if(j != 0)
	//*  69  124:iload           4
	//*  70  126:ifeq            147
			{
				i -= l;
	//   71  129:iload_2         
	//   72  130:iload           6
	//   73  132:isub            
	//   74  133:istore_2        
				k -= l;
	//   75  134:iload           5
	//   76  136:iload           6
	//   77  138:isub            
	//   78  139:istore          5
				j = 1;
	//   79  141:iconst_1        
	//   80  142:istore          4
			} else
	//*  81  144:goto            153
			{
				j = l + 1;
	//   82  147:iload           6
	//   83  149:iconst_1        
	//   84  150:iadd            
	//   85  151:istore          4
			}
			i++;
	//   86  153:iload_2         
	//   87  154:iconst_1        
	//   88  155:iadd            
	//   89  156:istore_2        
		}

	//   90  157:iload           4
	//   91  159:istore          6
	//*  92  161:goto            27
		UpdateOp updateop1 = updateop;
	//   93  164:aload_1         
	//   94  165:astore          9
		if(l != updateop.itemCount)
	//*  95  167:iload           6
	//*  96  169:aload_1         
	//*  97  170:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  98  173:icmpeq          193
		{
			recycleUpdateOp(updateop);
	//   99  176:aload_0         
	//  100  177:aload_1         
	//  101  178:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
			updateop1 = obtainUpdateOp(2, i1, l, ((Object) (null)));
	//  102  181:aload_0         
	//  103  182:iconst_2        
	//  104  183:iload           8
	//  105  185:iload           6
	//  106  187:aconst_null     
	//  107  188:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//  108  191:astore          9
		}
		if(byte0 == 0)
	//* 109  193:iload_3         
	//* 110  194:ifne            204
		{
			dispatchAndUpdateViewHolders(updateop1);
	//  111  197:aload_0         
	//  112  198:aload           9
	//  113  200:invokespecial   #102 <Method void dispatchAndUpdateViewHolders(AdapterHelper$UpdateOp)>
			return;
	//  114  203:return          
		} else
		{
			postponeAndUpdateViewHolders(updateop1);
	//  115  204:aload_0         
	//  116  205:aload           9
	//  117  207:invokespecial   #79  <Method void postponeAndUpdateViewHolders(AdapterHelper$UpdateOp)>
			return;
	//  118  210:return          
		}
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
	//*  20   34:icmpge          174
		{
			int j1;
			if(mCallback.findViewHolder(i) == null && !canFindInPreLayout(i))
	//*  21   37:aload_0         
	//*  22   38:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//*  23   41:iload_2         
	//*  24   42:invokeinterface #91  <Method RecyclerView$ViewHolder AdapterHelper$Callback.findViewHolder(int)>
	//*  25   47:ifnonnull       113
	//*  26   50:aload_0         
	//*  27   51:iload_2         
	//*  28   52:invokespecial   #95  <Method boolean canFindInPreLayout(int)>
	//*  29   55:ifeq            61
	//*  30   58:goto            113
			{
				j1 = j;
	//   31   61:iload_3         
	//   32   62:istore          6
				int l = k;
	//   33   64:iload           4
	//   34   66:istore          5
				if(k1 == 1)
	//*  35   68:iload           7
	//*  36   70:iconst_1        
	//*  37   71:icmpne          96
				{
					postponeAndUpdateViewHolders(obtainUpdateOp(4, k, j, updateop.payload));
	//   38   74:aload_0         
	//   39   75:aload_0         
	//   40   76:iconst_4        
	//   41   77:iload           4
	//   42   79:iload_3         
	//   43   80:aload_1         
	//   44   81:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//   45   84:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//   46   87:invokespecial   #79  <Method void postponeAndUpdateViewHolders(AdapterHelper$UpdateOp)>
					l = i;
	//   47   90:iload_2         
	//   48   91:istore          5
					j1 = 0;
	//   49   93:iconst_0        
	//   50   94:istore          6
				}
				k = 0;
	//   51   96:iconst_0        
	//   52   97:istore          4
				j = j1;
	//   53   99:iload           6
	//   54  101:istore_3        
				j1 = k;
	//   55  102:iload           4
	//   56  104:istore          6
				k = l;
	//   57  106:iload           5
	//   58  108:istore          4
			} else
	//*  59  110:goto            159
			{
				int i1 = j;
	//   60  113:iload_3         
	//   61  114:istore          5
				j1 = k;
	//   62  116:iload           4
	//   63  118:istore          6
				if(k1 == 0)
	//*  64  120:iload           7
	//*  65  122:ifne            147
				{
					dispatchAndUpdateViewHolders(obtainUpdateOp(4, k, j, updateop.payload));
	//   66  125:aload_0         
	//   67  126:aload_0         
	//   68  127:iconst_4        
	//   69  128:iload           4
	//   70  130:iload_3         
	//   71  131:aload_1         
	//   72  132:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//   73  135:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//   74  138:invokespecial   #102 <Method void dispatchAndUpdateViewHolders(AdapterHelper$UpdateOp)>
					j1 = i;
	//   75  141:iload_2         
	//   76  142:istore          6
					i1 = 0;
	//   77  144:iconst_0        
	//   78  145:istore          5
				}
				j = 1;
	//   79  147:iconst_1        
	//   80  148:istore_3        
				k = j1;
	//   81  149:iload           6
	//   82  151:istore          4
				j1 = j;
	//   83  153:iload_3         
	//   84  154:istore          6
				j = i1;
	//   85  156:iload           5
	//   86  158:istore_3        
			}
			j++;
	//   87  159:iload_3         
	//   88  160:iconst_1        
	//   89  161:iadd            
	//   90  162:istore_3        
			i++;
	//   91  163:iload_2         
	//   92  164:iconst_1        
	//   93  165:iadd            
	//   94  166:istore_2        
			k1 = j1;
	//   95  167:iload           6
	//   96  169:istore          7
		}
	//*  97  171:goto            28
		Object obj = ((Object) (updateop));
	//   98  174:aload_1         
	//   99  175:astore          10
		if(j != updateop.itemCount)
	//* 100  177:iload_3         
	//* 101  178:aload_1         
	//* 102  179:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 103  182:icmpeq          208
		{
			obj = updateop.payload;
	//  104  185:aload_1         
	//  105  186:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//  106  189:astore          10
			recycleUpdateOp(updateop);
	//  107  191:aload_0         
	//  108  192:aload_1         
	//  109  193:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
			obj = ((Object) (obtainUpdateOp(4, k, j, obj)));
	//  110  196:aload_0         
	//  111  197:iconst_4        
	//  112  198:iload           4
	//  113  200:iload_3         
	//  114  201:aload           10
	//  115  203:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//  116  206:astore          10
		}
		if(k1 == 0)
	//* 117  208:iload           7
	//* 118  210:ifne            220
		{
			dispatchAndUpdateViewHolders(((UpdateOp) (obj)));
	//  119  213:aload_0         
	//  120  214:aload           10
	//  121  216:invokespecial   #102 <Method void dispatchAndUpdateViewHolders(AdapterHelper$UpdateOp)>
			return;
	//  122  219:return          
		} else
		{
			postponeAndUpdateViewHolders(((UpdateOp) (obj)));
	//  123  220:aload_0         
	//  124  221:aload           10
	//  125  223:invokespecial   #79  <Method void postponeAndUpdateViewHolders(AdapterHelper$UpdateOp)>
			return;
	//  126  226:return          
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
		if(updateop.cmd != 1 && updateop.cmd != 8)
	//*   0    0:aload_1         
	//*   1    1:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//*   2    4:iconst_1        
	//*   3    5:icmpeq          305
	//*   4    8:aload_1         
	//*   5    9:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//*   6   12:bipush          8
	//*   7   14:icmpne          20
	//*   8   17:goto            305
		{
			int j1 = updatePositionWithPostponed(updateop.positionStart, updateop.cmd);
	//    9   20:aload_0         
	//   10   21:aload_1         
	//   11   22:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   12   25:aload_1         
	//   13   26:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//   14   29:invokespecial   #128 <Method int updatePositionWithPostponed(int, int)>
	//   15   32:istore          6
			int i = updateop.positionStart;
	//   16   34:aload_1         
	//   17   35:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   18   38:istore_2        
			int j = updateop.cmd;
	//   19   39:aload_1         
	//   20   40:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//   21   43:istore_3        
			int l;
			if(j != 2)
	//*  22   44:iload_3         
	//*  23   45:iconst_2        
	//*  24   46:icmpeq          97
			{
				if(j != 4)
	//*  25   49:iload_3         
	//*  26   50:iconst_4        
	//*  27   51:icmpeq          91
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   28   54:new             #130 <Class StringBuilder>
	//   29   57:dup             
	//   30   58:invokespecial   #131 <Method void StringBuilder()>
	//   31   61:astore          9
					stringbuilder.append("op should be remove or update.");
	//   32   63:aload           9
	//   33   65:ldc1            #133 <String "op should be remove or update.">
	//   34   67:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   35   70:pop             
					stringbuilder.append(((Object) (updateop)));
	//   36   71:aload           9
	//   37   73:aload_1         
	//   38   74:invokevirtual   #140 <Method StringBuilder StringBuilder.append(Object)>
	//   39   77:pop             
					throw new IllegalArgumentException(stringbuilder.toString());
	//   40   78:new             #142 <Class IllegalArgumentException>
	//   41   81:dup             
	//   42   82:aload           9
	//   43   84:invokevirtual   #146 <Method String StringBuilder.toString()>
	//   44   87:invokespecial   #149 <Method void IllegalArgumentException(String)>
	//   45   90:athrow          
				}
				l = 1;
	//   46   91:iconst_1        
	//   47   92:istore          4
			} else
	//*  48   94:goto            100
			{
				l = 0;
	//   49   97:iconst_0        
	//   50   98:istore          4
			}
			int i1 = 1;
	//   51  100:iconst_1        
	//   52  101:istore          5
			int k;
			int k1;
			for(k1 = i1; i1 < updateop.itemCount; k1 = ((int) (flag)))
	//*  53  103:iload           5
	//*  54  105:istore          7
	//*  55  107:iload           5
	//*  56  109:aload_1         
	//*  57  110:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  58  113:icmpge          262
			{
				int l1 = updatePositionWithPostponed(updateop.positionStart + l * i1, updateop.cmd);
	//   59  116:aload_0         
	//   60  117:aload_1         
	//   61  118:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   62  121:iload           4
	//   63  123:iload           5
	//   64  125:imul            
	//   65  126:iadd            
	//   66  127:aload_1         
	//   67  128:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//   68  131:invokespecial   #128 <Method int updatePositionWithPostponed(int, int)>
	//   69  134:istore          8
				k = updateop.cmd;
	//   70  136:aload_1         
	//   71  137:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//   72  140:istore_3        
				boolean flag;
				if(k == 2 ? l1 != j1 : k != 4 || l1 != j1 + 1)
	//*  73  141:iload_3         
	//*  74  142:iconst_2        
	//*  75  143:icmpeq          170
	//*  76  146:iload_3         
	//*  77  147:iconst_4        
	//*  78  148:icmpeq          156
					flag = false;
	//   79  151:iconst_0        
	//   80  152:istore_3        
				else
	//*  81  153:goto            180
	//*  82  156:iload           8
	//*  83  158:iload           6
	//*  84  160:iconst_1        
	//*  85  161:iadd            
	//*  86  162:icmpne          151
					flag = true;
	//   87  165:iconst_1        
	//   88  166:istore_3        
	//   89  167:goto            180
	//   90  170:iload           8
	//   91  172:iload           6
	//   92  174:icmpne          151
	//*  93  177:goto            165
				if(flag)
	//*  94  180:iload_3         
	//*  95  181:ifeq            192
				{
					flag = ((boolean) (k1 + 1));
	//   96  184:iload           7
	//   97  186:iconst_1        
	//   98  187:iadd            
	//   99  188:istore_3        
				} else
	//* 100  189:goto            250
				{
					UpdateOp updateop1 = obtainUpdateOp(updateop.cmd, j1, k1, updateop.payload);
	//  101  192:aload_0         
	//  102  193:aload_1         
	//  103  194:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//  104  197:iload           6
	//  105  199:iload           7
	//  106  201:aload_1         
	//  107  202:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//  108  205:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//  109  208:astore          9
					dispatchFirstPassAndUpdateViewHolders(updateop1, i);
	//  110  210:aload_0         
	//  111  211:aload           9
	//  112  213:iload_2         
	//  113  214:invokevirtual   #153 <Method void dispatchFirstPassAndUpdateViewHolders(AdapterHelper$UpdateOp, int)>
					recycleUpdateOp(updateop1);
	//  114  217:aload_0         
	//  115  218:aload           9
	//  116  220:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
					flag = ((boolean) (i));
	//  117  223:iload_2         
	//  118  224:istore_3        
					if(updateop.cmd == 4)
	//* 119  225:aload_1         
	//* 120  226:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//* 121  229:iconst_4        
	//* 122  230:icmpne          238
						flag = ((boolean) (i + k1));
	//  123  233:iload_2         
	//  124  234:iload           7
	//  125  236:iadd            
	//  126  237:istore_3        
					k1 = 1;
	//  127  238:iconst_1        
	//  128  239:istore          7
					j1 = l1;
	//  129  241:iload           8
	//  130  243:istore          6
					i = ((int) (flag));
	//  131  245:iload_3         
	//  132  246:istore_2        
					flag = ((boolean) (k1));
	//  133  247:iload           7
	//  134  249:istore_3        
				}
				i1++;
	//  135  250:iload           5
	//  136  252:iconst_1        
	//  137  253:iadd            
	//  138  254:istore          5
			}

	//  139  256:iload_3         
	//  140  257:istore          7
	//* 141  259:goto            107
			Object obj = updateop.payload;
	//  142  262:aload_1         
	//  143  263:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//  144  266:astore          9
			recycleUpdateOp(updateop);
	//  145  268:aload_0         
	//  146  269:aload_1         
	//  147  270:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
			if(k1 > 0)
	//* 148  273:iload           7
	//* 149  275:ifle            304
			{
				updateop = obtainUpdateOp(updateop.cmd, j1, k1, obj);
	//  150  278:aload_0         
	//  151  279:aload_1         
	//  152  280:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//  153  283:iload           6
	//  154  285:iload           7
	//  155  287:aload           9
	//  156  289:invokevirtual   #99  <Method AdapterHelper$UpdateOp obtainUpdateOp(int, int, int, Object)>
	//  157  292:astore_1        
				dispatchFirstPassAndUpdateViewHolders(updateop, i);
	//  158  293:aload_0         
	//  159  294:aload_1         
	//  160  295:iload_2         
	//  161  296:invokevirtual   #153 <Method void dispatchFirstPassAndUpdateViewHolders(AdapterHelper$UpdateOp, int)>
				recycleUpdateOp(updateop);
	//  162  299:aload_0         
	//  163  300:aload_1         
	//  164  301:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
			}
			return;
	//  165  304:return          
		} else
		{
			throw new IllegalArgumentException("should not dispatch add or move for pre layout");
	//  166  305:new             #142 <Class IllegalArgumentException>
	//  167  308:dup             
	//  168  309:ldc1            #155 <String "should not dispatch add or move for pre layout">
	//  169  311:invokespecial   #149 <Method void IllegalArgumentException(String)>
	//  170  314:athrow          
		}
	}

	private void postponeAndUpdateViewHolders(UpdateOp updateop)
	{
		mPostponedList.add(((Object) (updateop)));
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field ArrayList mPostponedList>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #159 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		int i = updateop.cmd;
	//    5    9:aload_1         
	//    6   10:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//    7   13:istore_2        
		if(i != 4)
	//*   8   14:iload_2         
	//*   9   15:iconst_4        
	//*  10   16:icmpeq          135
		{
			if(i != 8)
	//*  11   19:iload_2         
	//*  12   20:bipush          8
	//*  13   22:icmpeq          117
			{
				switch(i)
	//*  14   25:iload_2         
				{
	//*  15   26:tableswitch     1 2: default 48
	//	               1 99
	//	               2 81
				default:
					StringBuilder stringbuilder = new StringBuilder();
	//   16   48:new             #130 <Class StringBuilder>
	//   17   51:dup             
	//   18   52:invokespecial   #131 <Method void StringBuilder()>
	//   19   55:astore_3        
					stringbuilder.append("Unknown update op type for ");
	//   20   56:aload_3         
	//   21   57:ldc1            #161 <String "Unknown update op type for ">
	//   22   59:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   23   62:pop             
					stringbuilder.append(((Object) (updateop)));
	//   24   63:aload_3         
	//   25   64:aload_1         
	//   26   65:invokevirtual   #140 <Method StringBuilder StringBuilder.append(Object)>
	//   27   68:pop             
					throw new IllegalArgumentException(stringbuilder.toString());
	//   28   69:new             #142 <Class IllegalArgumentException>
	//   29   72:dup             
	//   30   73:aload_3         
	//   31   74:invokevirtual   #146 <Method String StringBuilder.toString()>
	//   32   77:invokespecial   #149 <Method void IllegalArgumentException(String)>
	//   33   80:athrow          

				case 2: // '\002'
					mCallback.offsetPositionsForRemovingLaidOutOrNewView(updateop.positionStart, updateop.itemCount);
	//   34   81:aload_0         
	//   35   82:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   36   85:aload_1         
	//   37   86:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   38   89:aload_1         
	//   39   90:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   40   93:invokeinterface #165 <Method void AdapterHelper$Callback.offsetPositionsForRemovingLaidOutOrNewView(int, int)>
					return;
	//   41   98:return          

				case 1: // '\001'
					mCallback.offsetPositionsForAdd(updateop.positionStart, updateop.itemCount);
	//   42   99:aload_0         
	//   43  100:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   44  103:aload_1         
	//   45  104:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   46  107:aload_1         
	//   47  108:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   48  111:invokeinterface #168 <Method void AdapterHelper$Callback.offsetPositionsForAdd(int, int)>
					return;
	//   49  116:return          
				}
			} else
			{
				mCallback.offsetPositionsForMove(updateop.positionStart, updateop.itemCount);
	//   50  117:aload_0         
	//   51  118:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   52  121:aload_1         
	//   53  122:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   54  125:aload_1         
	//   55  126:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   56  129:invokeinterface #171 <Method void AdapterHelper$Callback.offsetPositionsForMove(int, int)>
				return;
	//   57  134:return          
			}
		} else
		{
			mCallback.markViewHoldersUpdated(updateop.positionStart, updateop.itemCount, updateop.payload);
	//   58  135:aload_0         
	//   59  136:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   60  139:aload_1         
	//   61  140:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   62  143:aload_1         
	//   63  144:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   64  147:aload_1         
	//   65  148:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//   66  151:invokeinterface #175 <Method void AdapterHelper$Callback.markViewHoldersUpdated(int, int, Object)>
			return;
	//   67  156:return          
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
		int l;
		for(l = i; k >= 0; l = i)
	//*   6   10:iload_1         
	//*   7   11:istore          4
	//*   8   13:iload_3         
	//*   9   14:iflt            391
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
	//*  19   37:icmpne          280
			{
				int i1;
				if(updateop.positionStart < updateop.itemCount)
	//*  20   40:aload           6
	//*  21   42:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  22   45:aload           6
	//*  23   47:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  24   50:icmpge          69
				{
					i = updateop.positionStart;
	//   25   53:aload           6
	//   26   55:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   27   58:istore_1        
					i1 = updateop.itemCount;
	//   28   59:aload           6
	//   29   61:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   30   64:istore          5
				} else
	//*  31   66:goto            82
				{
					i = updateop.itemCount;
	//   32   69:aload           6
	//   33   71:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   34   74:istore_1        
					i1 = updateop.positionStart;
	//   35   75:aload           6
	//   36   77:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   37   80:istore          5
				}
				if(l >= i && l <= i1)
	//*  38   82:iload           4
	//*  39   84:iload_1         
	//*  40   85:icmplt          194
	//*  41   88:iload           4
	//*  42   90:iload           5
	//*  43   92:icmpgt          194
				{
					if(i == updateop.positionStart)
	//*  44   95:iload_1         
	//*  45   96:aload           6
	//*  46   98:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  47  101:icmpne          149
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
						i = l + 1;
	//   67  141:iload           4
	//   68  143:iconst_1        
	//   69  144:iadd            
	//   70  145:istore_1        
					} else
	//*  71  146:goto            381
					{
						if(j == 1)
	//*  72  149:iload_2         
	//*  73  150:iconst_1        
	//*  74  151:icmpne          169
							updateop.positionStart = updateop.positionStart + 1;
	//   75  154:aload           6
	//   76  156:aload           6
	//   77  158:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   78  161:iconst_1        
	//   79  162:iadd            
	//   80  163:putfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
						else
	//*  81  166:goto            186
						if(j == 2)
	//*  82  169:iload_2         
	//*  83  170:iconst_2        
	//*  84  171:icmpne          186
							updateop.positionStart = updateop.positionStart - 1;
	//   85  174:aload           6
	//   86  176:aload           6
	//   87  178:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   88  181:iconst_1        
	//   89  182:isub            
	//   90  183:putfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
						i = l - 1;
	//   91  186:iload           4
	//   92  188:iconst_1        
	//   93  189:isub            
	//   94  190:istore_1        
					}
				} else
	//*  95  191:goto            381
				{
					i = l;
	//   96  194:iload           4
	//   97  196:istore_1        
					if(l < updateop.positionStart)
	//*  98  197:iload           4
	//*  99  199:aload           6
	//* 100  201:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 101  204:icmpge          381
						if(j == 1)
	//* 102  207:iload_2         
	//* 103  208:iconst_1        
	//* 104  209:icmpne          242
						{
							updateop.positionStart = updateop.positionStart + 1;
	//  105  212:aload           6
	//  106  214:aload           6
	//  107  216:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//  108  219:iconst_1        
	//  109  220:iadd            
	//  110  221:putfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
							updateop.itemCount = updateop.itemCount + 1;
	//  111  224:aload           6
	//  112  226:aload           6
	//  113  228:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//  114  231:iconst_1        
	//  115  232:iadd            
	//  116  233:putfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
							i = l;
	//  117  236:iload           4
	//  118  238:istore_1        
						} else
	//* 119  239:goto            381
						{
							i = l;
	//  120  242:iload           4
	//  121  244:istore_1        
							if(j == 2)
	//* 122  245:iload_2         
	//* 123  246:iconst_2        
	//* 124  247:icmpne          381
							{
								updateop.positionStart = updateop.positionStart - 1;
	//  125  250:aload           6
	//  126  252:aload           6
	//  127  254:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//  128  257:iconst_1        
	//  129  258:isub            
	//  130  259:putfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
								updateop.itemCount = updateop.itemCount - 1;
	//  131  262:aload           6
	//  132  264:aload           6
	//  133  266:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//  134  269:iconst_1        
	//  135  270:isub            
	//  136  271:putfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
								i = l;
	//  137  274:iload           4
	//  138  276:istore_1        
							}
						}
				}
			} else
	//* 139  277:goto            381
			if(updateop.positionStart <= l)
	//* 140  280:aload           6
	//* 141  282:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 142  285:iload           4
	//* 143  287:icmpgt          335
			{
				if(updateop.cmd == 1)
	//* 144  290:aload           6
	//* 145  292:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//* 146  295:iconst_1        
	//* 147  296:icmpne          311
				{
					i = l - updateop.itemCount;
	//  148  299:iload           4
	//  149  301:aload           6
	//  150  303:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//  151  306:isub            
	//  152  307:istore_1        
				} else
	//* 153  308:goto            381
				{
					i = l;
	//  154  311:iload           4
	//  155  313:istore_1        
					if(updateop.cmd == 2)
	//* 156  314:aload           6
	//* 157  316:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//* 158  319:iconst_2        
	//* 159  320:icmpne          381
						i = l + updateop.itemCount;
	//  160  323:iload           4
	//  161  325:aload           6
	//  162  327:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//  163  330:iadd            
	//  164  331:istore_1        
				}
			} else
	//* 165  332:goto            381
			if(j == 1)
	//* 166  335:iload_2         
	//* 167  336:iconst_1        
	//* 168  337:icmpne          358
			{
				updateop.positionStart = updateop.positionStart + 1;
	//  169  340:aload           6
	//  170  342:aload           6
	//  171  344:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//  172  347:iconst_1        
	//  173  348:iadd            
	//  174  349:putfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
				i = l;
	//  175  352:iload           4
	//  176  354:istore_1        
			} else
	//* 177  355:goto            381
			{
				i = l;
	//  178  358:iload           4
	//  179  360:istore_1        
				if(j == 2)
	//* 180  361:iload_2         
	//* 181  362:iconst_2        
	//* 182  363:icmpne          381
				{
					updateop.positionStart = updateop.positionStart - 1;
	//  183  366:aload           6
	//  184  368:aload           6
	//  185  370:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//  186  373:iconst_1        
	//  187  374:isub            
	//  188  375:putfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
					i = l;
	//  189  378:iload           4
	//  190  380:istore_1        
				}
			}
			k--;
	//  191  381:iload_3         
	//  192  382:iconst_1        
	//  193  383:isub            
	//  194  384:istore_3        
		}

	//  195  385:iload_1         
	//  196  386:istore          4
	//* 197  388:goto            13
		for(i = mPostponedList.size() - 1; i >= 0; i--)
	//* 198  391:aload_0         
	//* 199  392:getfield        #61  <Field ArrayList mPostponedList>
	//* 200  395:invokevirtual   #114 <Method int ArrayList.size()>
	//* 201  398:iconst_1        
	//* 202  399:isub            
	//* 203  400:istore_1        
	//* 204  401:iload_1         
	//* 205  402:iflt            497
		{
			UpdateOp updateop1 = (UpdateOp)mPostponedList.get(i);
	//  206  405:aload_0         
	//  207  406:getfield        #61  <Field ArrayList mPostponedList>
	//  208  409:iload_1         
	//  209  410:invokevirtual   #118 <Method Object ArrayList.get(int)>
	//  210  413:checkcast       #11  <Class AdapterHelper$UpdateOp>
	//  211  416:astore          6
			if(updateop1.cmd == 8)
	//* 212  418:aload           6
	//* 213  420:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//* 214  423:bipush          8
	//* 215  425:icmpne          467
			{
				if(updateop1.itemCount == updateop1.positionStart || updateop1.itemCount < 0)
	//* 216  428:aload           6
	//* 217  430:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 218  433:aload           6
	//* 219  435:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 220  438:icmpeq          449
	//* 221  441:aload           6
	//* 222  443:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 223  446:ifge            490
				{
					mPostponedList.remove(i);
	//  224  449:aload_0         
	//  225  450:getfield        #61  <Field ArrayList mPostponedList>
	//  226  453:iload_1         
	//  227  454:invokevirtual   #178 <Method Object ArrayList.remove(int)>
	//  228  457:pop             
					recycleUpdateOp(updateop1);
	//  229  458:aload_0         
	//  230  459:aload           6
	//  231  461:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
				}
				continue;
	//  232  464:goto            490
			}
			if(updateop1.itemCount <= 0)
	//* 233  467:aload           6
	//* 234  469:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 235  472:ifgt            490
			{
				mPostponedList.remove(i);
	//  236  475:aload_0         
	//  237  476:getfield        #61  <Field ArrayList mPostponedList>
	//  238  479:iload_1         
	//  239  480:invokevirtual   #178 <Method Object ArrayList.remove(int)>
	//  240  483:pop             
				recycleUpdateOp(updateop1);
	//  241  484:aload_0         
	//  242  485:aload           6
	//  243  487:invokevirtual   #105 <Method void recycleUpdateOp(AdapterHelper$UpdateOp)>
			}
		}

	//  244  490:iload_1         
	//  245  491:iconst_1        
	//  246  492:isub            
	//  247  493:istore_1        
	//* 248  494:goto            401
		return l;
	//  249  497:iload           4
	//  250  499:ireturn         
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
	//*  10   18:icmpge          197
		{
			UpdateOp updateop = (UpdateOp)mPendingUpdates.get(l);
	//   11   21:aload_0         
	//   12   22:getfield        #59  <Field ArrayList mPendingUpdates>
	//   13   25:iload           4
	//   14   27:invokevirtual   #118 <Method Object ArrayList.get(int)>
	//   15   30:checkcast       #11  <Class AdapterHelper$UpdateOp>
	//   16   33:astore          6
			i = updateop.cmd;
	//   17   35:aload           6
	//   18   37:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//   19   40:istore_1        
			if(i != 8)
	//*  20   41:iload_1         
	//*  21   42:bipush          8
	//*  22   44:icmpeq          138
				switch(i)
	//*  23   47:iload_1         
				{
	//*  24   48:tableswitch     1 2: default 72
	//	               1 116
	//	               2 77
				default:
					i = j;
	//   25   72:iload_2         
	//   26   73:istore_1        
					break;

	//*  27   74:goto            186
				case 2: // '\002'
					i = j;
	//   28   77:iload_2         
	//   29   78:istore_1        
					if(updateop.positionStart <= j)
	//*  30   79:aload           6
	//*  31   81:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  32   84:iload_2         
	//*  33   85:icmpgt          186
					{
						if(updateop.positionStart + updateop.itemCount > j)
	//*  34   88:aload           6
	//*  35   90:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  36   93:aload           6
	//*  37   95:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  38   98:iadd            
	//*  39   99:iload_2         
	//*  40  100:icmple          105
							return -1;
	//   41  103:iconst_m1       
	//   42  104:ireturn         
						i = j - updateop.itemCount;
	//   43  105:iload_2         
	//   44  106:aload           6
	//   45  108:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   46  111:isub            
	//   47  112:istore_1        
					}
					break;

	//*  48  113:goto            186
				case 1: // '\001'
					i = j;
	//   49  116:iload_2         
	//   50  117:istore_1        
					if(updateop.positionStart <= j)
	//*  51  118:aload           6
	//*  52  120:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  53  123:iload_2         
	//*  54  124:icmpgt          186
						i = j + updateop.itemCount;
	//   55  127:iload_2         
	//   56  128:aload           6
	//   57  130:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   58  133:iadd            
	//   59  134:istore_1        
					break;
				}
			else
	//*  60  135:goto            186
			if(updateop.positionStart == j)
	//*  61  138:aload           6
	//*  62  140:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  63  143:iload_2         
	//*  64  144:icmpne          156
			{
				i = updateop.itemCount;
	//   65  147:aload           6
	//   66  149:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   67  152:istore_1        
			} else
	//*  68  153:goto            186
			{
				int k = j;
	//   69  156:iload_2         
	//   70  157:istore_3        
				if(updateop.positionStart < j)
	//*  71  158:aload           6
	//*  72  160:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  73  163:iload_2         
	//*  74  164:icmpge          171
					k = j - 1;
	//   75  167:iload_2         
	//   76  168:iconst_1        
	//   77  169:isub            
	//   78  170:istore_3        
				i = k;
	//   79  171:iload_3         
	//   80  172:istore_1        
				if(updateop.itemCount <= k)
	//*  81  173:aload           6
	//*  82  175:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  83  178:iload_3         
	//*  84  179:icmpgt          186
					i = k + 1;
	//   85  182:iload_3         
	//   86  183:iconst_1        
	//   87  184:iadd            
	//   88  185:istore_1        
			}
			l++;
	//   89  186:iload           4
	//   90  188:iconst_1        
	//   91  189:iadd            
	//   92  190:istore          4
		}

	//   93  192:iload_1         
	//   94  193:istore_2        
	//*  95  194:goto            14
		return j;
	//   96  197:iload_2         
	//   97  198:ireturn         
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
	//*  10   16:icmpge          232
		{
			UpdateOp updateop = (UpdateOp)mPendingUpdates.get(i);
	//   11   19:aload_0         
	//   12   20:getfield        #59  <Field ArrayList mPendingUpdates>
	//   13   23:iload_1         
	//   14   24:invokevirtual   #118 <Method Object ArrayList.get(int)>
	//   15   27:checkcast       #11  <Class AdapterHelper$UpdateOp>
	//   16   30:astore          4
			int k = updateop.cmd;
	//   17   32:aload           4
	//   18   34:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//   19   37:istore_3        
			if(k != 4)
	//*  20   38:iload_3         
	//*  21   39:iconst_4        
	//*  22   40:icmpeq          174
			{
				if(k != 8)
	//*  23   43:iload_3         
	//*  24   44:bipush          8
	//*  25   46:icmpeq          141
				{
					switch(k)
	//*  26   49:iload_3         
					{
	//*  27   50:tableswitch     1 2: default 72
	//	               1 108
	//	               2 75
	//*  28   72:goto            209
					case 2: // '\002'
						mCallback.onDispatchSecondPass(updateop);
	//   29   75:aload_0         
	//   30   76:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   31   79:aload           4
	//   32   81:invokeinterface #192 <Method void AdapterHelper$Callback.onDispatchSecondPass(AdapterHelper$UpdateOp)>
						mCallback.offsetPositionsForRemovingInvisible(updateop.positionStart, updateop.itemCount);
	//   33   86:aload_0         
	//   34   87:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   35   90:aload           4
	//   36   92:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   37   95:aload           4
	//   38   97:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   39  100:invokeinterface #202 <Method void AdapterHelper$Callback.offsetPositionsForRemovingInvisible(int, int)>
						break;

	//*  40  105:goto            209
					case 1: // '\001'
						mCallback.onDispatchSecondPass(updateop);
	//   41  108:aload_0         
	//   42  109:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   43  112:aload           4
	//   44  114:invokeinterface #192 <Method void AdapterHelper$Callback.onDispatchSecondPass(AdapterHelper$UpdateOp)>
						mCallback.offsetPositionsForAdd(updateop.positionStart, updateop.itemCount);
	//   45  119:aload_0         
	//   46  120:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   47  123:aload           4
	//   48  125:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   49  128:aload           4
	//   50  130:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   51  133:invokeinterface #168 <Method void AdapterHelper$Callback.offsetPositionsForAdd(int, int)>
						break;
					}
				} else
	//*  52  138:goto            209
				{
					mCallback.onDispatchSecondPass(updateop);
	//   53  141:aload_0         
	//   54  142:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   55  145:aload           4
	//   56  147:invokeinterface #192 <Method void AdapterHelper$Callback.onDispatchSecondPass(AdapterHelper$UpdateOp)>
					mCallback.offsetPositionsForMove(updateop.positionStart, updateop.itemCount);
	//   57  152:aload_0         
	//   58  153:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   59  156:aload           4
	//   60  158:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   61  161:aload           4
	//   62  163:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   63  166:invokeinterface #171 <Method void AdapterHelper$Callback.offsetPositionsForMove(int, int)>
				}
			} else
	//*  64  171:goto            209
			{
				mCallback.onDispatchSecondPass(updateop);
	//   65  174:aload_0         
	//   66  175:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   67  178:aload           4
	//   68  180:invokeinterface #192 <Method void AdapterHelper$Callback.onDispatchSecondPass(AdapterHelper$UpdateOp)>
				mCallback.markViewHoldersUpdated(updateop.positionStart, updateop.itemCount, updateop.payload);
	//   69  185:aload_0         
	//   70  186:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   71  189:aload           4
	//   72  191:getfield        #84  <Field int AdapterHelper$UpdateOp.positionStart>
	//   73  194:aload           4
	//   74  196:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   75  199:aload           4
	//   76  201:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//   77  204:invokeinterface #175 <Method void AdapterHelper$Callback.markViewHoldersUpdated(int, int, Object)>
			}
			if(mOnItemProcessedCallback != null)
	//*  78  209:aload_0         
	//*  79  210:getfield        #204 <Field Runnable mOnItemProcessedCallback>
	//*  80  213:ifnull          225
				mOnItemProcessedCallback.run();
	//   81  216:aload_0         
	//   82  217:getfield        #204 <Field Runnable mOnItemProcessedCallback>
	//   83  220:invokeinterface #209 <Method void Runnable.run()>
		}

	//   84  225:iload_1         
	//   85  226:iconst_1        
	//   86  227:iadd            
	//   87  228:istore_1        
	//*  88  229:goto            14
		recycleUpdateOpsAndClearList(((List) (mPendingUpdates)));
	//   89  232:aload_0         
	//   90  233:aload_0         
	//   91  234:getfield        #59  <Field ArrayList mPendingUpdates>
	//   92  237:invokevirtual   #196 <Method void recycleUpdateOpsAndClearList(List)>
		mExistingUpdateTypes = 0;
	//   93  240:aload_0         
	//   94  241:iconst_0        
	//   95  242:putfield        #63  <Field int mExistingUpdateTypes>
	//   96  245:return          
	}

	void dispatchFirstPassAndUpdateViewHolders(UpdateOp updateop, int i)
	{
		mCallback.onDispatchFirstPass(updateop);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #212 <Method void AdapterHelper$Callback.onDispatchFirstPass(AdapterHelper$UpdateOp)>
		int j = updateop.cmd;
	//    4   10:aload_1         
	//    5   11:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//    6   14:istore_3        
		if(j != 2)
	//*   7   15:iload_3         
	//*   8   16:iconst_2        
	//*   9   17:icmpeq          54
		{
			if(j != 4)
	//*  10   20:iload_3         
	//*  11   21:iconst_4        
	//*  12   22:icmpeq          35
			{
				throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
	//   13   25:new             #142 <Class IllegalArgumentException>
	//   14   28:dup             
	//   15   29:ldc1            #214 <String "only remove and update ops can be dispatched in first pass">
	//   16   31:invokespecial   #149 <Method void IllegalArgumentException(String)>
	//   17   34:athrow          
			} else
			{
				mCallback.markViewHoldersUpdated(i, updateop.itemCount, updateop.payload);
	//   18   35:aload_0         
	//   19   36:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   20   39:iload_2         
	//   21   40:aload_1         
	//   22   41:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   23   44:aload_1         
	//   24   45:getfield        #110 <Field Object AdapterHelper$UpdateOp.payload>
	//   25   48:invokeinterface #175 <Method void AdapterHelper$Callback.markViewHoldersUpdated(int, int, Object)>
				return;
	//   26   53:return          
			}
		} else
		{
			mCallback.offsetPositionsForRemovingInvisible(i, updateop.itemCount);
	//   27   54:aload_0         
	//   28   55:getfield        #65  <Field AdapterHelper$Callback mCallback>
	//   29   58:iload_2         
	//   30   59:aload_1         
	//   31   60:getfield        #87  <Field int AdapterHelper$UpdateOp.itemCount>
	//   32   63:invokeinterface #202 <Method void AdapterHelper$Callback.offsetPositionsForRemovingInvisible(int, int)>
			return;
	//   33   68:return          
		}
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
		return (i & mExistingUpdateTypes) != 0;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #63  <Field int mExistingUpdateTypes>
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
		boolean flag = false;
	//    0    0:iconst_0        
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
		if(mPendingUpdates.size() == 1)
	//*  23   36:aload_0         
	//*  24   37:getfield        #59  <Field ArrayList mPendingUpdates>
	//*  25   40:invokevirtual   #114 <Method int ArrayList.size()>
	//*  26   43:iconst_1        
	//*  27   44:icmpne          50
			flag = true;
	//   28   47:iconst_1        
	//   29   48:istore          4
		return flag;
	//   30   50:iload           4
	//   31   52:ireturn         
	}

	boolean onItemRangeInserted(int i, int j)
	{
		boolean flag = false;
	//    0    0:iconst_0        
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
		if(mPendingUpdates.size() == 1)
	//*  23   35:aload_0         
	//*  24   36:getfield        #59  <Field ArrayList mPendingUpdates>
	//*  25   39:invokevirtual   #114 <Method int ArrayList.size()>
	//*  26   42:iconst_1        
	//*  27   43:icmpne          48
			flag = true;
	//   28   46:iconst_1        
	//   29   47:istore_3        
		return flag;
	//   30   48:iload_3         
	//   31   49:ireturn         
	}

	boolean onItemRangeMoved(int i, int j, int k)
	{
		boolean flag = false;
	//    0    0:iconst_0        
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
	//   10   15:new             #142 <Class IllegalArgumentException>
	//   11   18:dup             
	//   12   19:ldc1            #238 <String "Moving more than 1 item is not supported yet">
	//   13   21:invokespecial   #149 <Method void IllegalArgumentException(String)>
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
		if(mPendingUpdates.size() == 1)
	//*  31   53:aload_0         
	//*  32   54:getfield        #59  <Field ArrayList mPendingUpdates>
	//*  33   57:invokevirtual   #114 <Method int ArrayList.size()>
	//*  34   60:iconst_1        
	//*  35   61:icmpne          67
			flag = true;
	//   36   64:iconst_1        
	//   37   65:istore          4
		return flag;
	//   38   67:iload           4
	//   39   69:ireturn         
	}

	boolean onItemRangeRemoved(int i, int j)
	{
		boolean flag = false;
	//    0    0:iconst_0        
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
		if(mPendingUpdates.size() == 1)
	//*  23   35:aload_0         
	//*  24   36:getfield        #59  <Field ArrayList mPendingUpdates>
	//*  25   39:invokevirtual   #114 <Method int ArrayList.size()>
	//*  26   42:iconst_1        
	//*  27   43:icmpne          48
			flag = true;
	//   28   46:iconst_1        
	//   29   47:istore_3        
		return flag;
	//   30   48:iload_3         
	//   31   49:ireturn         
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
	//*  13   23:icmpge          139
		{
			UpdateOp updateop = (UpdateOp)mPendingUpdates.get(i);
	//   14   26:aload_0         
	//   15   27:getfield        #59  <Field ArrayList mPendingUpdates>
	//   16   30:iload_1         
	//   17   31:invokevirtual   #118 <Method Object ArrayList.get(int)>
	//   18   34:checkcast       #11  <Class AdapterHelper$UpdateOp>
	//   19   37:astore          4
			int k = updateop.cmd;
	//   20   39:aload           4
	//   21   41:getfield        #121 <Field int AdapterHelper$UpdateOp.cmd>
	//   22   44:istore_3        
			if(k != 4)
	//*  23   45:iload_3         
	//*  24   46:iconst_4        
	//*  25   47:icmpeq          110
			{
				if(k != 8)
	//*  26   50:iload_3         
	//*  27   51:bipush          8
	//*  28   53:icmpeq          101
					switch(k)
	//*  29   56:iload_3         
					{
	//*  30   57:tableswitch     1 2: default 80
	//	               1 92
	//	               2 83
	//*  31   80:goto            116
					case 2: // '\002'
						applyRemove(updateop);
	//   32   83:aload_0         
	//   33   84:aload           4
	//   34   86:invokespecial   #245 <Method void applyRemove(AdapterHelper$UpdateOp)>
						break;

	//*  35   89:goto            116
					case 1: // '\001'
						applyAdd(updateop);
	//   36   92:aload_0         
	//   37   93:aload           4
	//   38   95:invokespecial   #247 <Method void applyAdd(AdapterHelper$UpdateOp)>
						break;
					}
				else
	//*  39   98:goto            116
					applyMove(updateop);
	//   40  101:aload_0         
	//   41  102:aload           4
	//   42  104:invokespecial   #249 <Method void applyMove(AdapterHelper$UpdateOp)>
			} else
	//*  43  107:goto            116
			{
				applyUpdate(updateop);
	//   44  110:aload_0         
	//   45  111:aload           4
	//   46  113:invokespecial   #251 <Method void applyUpdate(AdapterHelper$UpdateOp)>
			}
			if(mOnItemProcessedCallback != null)
	//*  47  116:aload_0         
	//*  48  117:getfield        #204 <Field Runnable mOnItemProcessedCallback>
	//*  49  120:ifnull          132
				mOnItemProcessedCallback.run();
	//   50  123:aload_0         
	//   51  124:getfield        #204 <Field Runnable mOnItemProcessedCallback>
	//   52  127:invokeinterface #209 <Method void Runnable.run()>
		}

	//   53  132:iload_1         
	//   54  133:iconst_1        
	//   55  134:iadd            
	//   56  135:istore_1        
	//*  57  136:goto            21
		mPendingUpdates.clear();
	//   58  139:aload_0         
	//   59  140:getfield        #59  <Field ArrayList mPendingUpdates>
	//   60  143:invokevirtual   #254 <Method void ArrayList.clear()>
	//   61  146:return          
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
