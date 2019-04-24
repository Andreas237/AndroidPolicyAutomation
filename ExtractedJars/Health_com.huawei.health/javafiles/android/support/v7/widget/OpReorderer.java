// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import java.util.List;

class OpReorderer
{
	static interface Callback
	{

		public abstract AdapterHelper.UpdateOp obtainUpdateOp(int i, int j, int k, Object obj);

		public abstract void recycleUpdateOp(AdapterHelper.UpdateOp updateop);
	}


	OpReorderer(Callback callback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mCallback = callback;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field OpReorderer$Callback mCallback>
	//    5    9:return          
	}

	private int getLastMoveOutOfOrder(List list)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		for(int i = list.size() - 1; i >= 0;)
	//*   2    2:aload_1         
	//*   3    3:invokeinterface #25  <Method int List.size()>
	//*   4    8:iconst_1        
	//*   5    9:isub            
	//*   6   10:istore_2        
	//*   7   11:iload_2         
	//*   8   12:iflt            55
		{
			boolean flag1;
			if(((AdapterHelper.UpdateOp)list.get(i)).cmd == 8)
	//*   9   15:aload_1         
	//*  10   16:iload_2         
	//*  11   17:invokeinterface #29  <Method Object List.get(int)>
	//*  12   22:checkcast       #31  <Class AdapterHelper$UpdateOp>
	//*  13   25:getfield        #35  <Field int AdapterHelper$UpdateOp.cmd>
	//*  14   28:bipush          8
	//*  15   30:icmpne          42
			{
				flag1 = flag;
	//   16   33:iload_3         
	//   17   34:istore          4
				if(flag)
	//*  18   36:iload_3         
	//*  19   37:ifeq            45
					return i;
	//   20   40:iload_2         
	//   21   41:ireturn         
			} else
			{
				flag1 = true;
	//   22   42:iconst_1        
	//   23   43:istore          4
			}
			i--;
	//   24   45:iload_2         
	//   25   46:iconst_1        
	//   26   47:isub            
	//   27   48:istore_2        
			flag = flag1;
	//   28   49:iload           4
	//   29   51:istore_3        
		}

	//*  30   52:goto            11
		return -1;
	//   31   55:iconst_m1       
	//   32   56:ireturn         
	}

	private void swapMoveAdd(List list, int i, AdapterHelper.UpdateOp updateop, int j, AdapterHelper.UpdateOp updateop1)
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore          6
		if(updateop.itemCount < updateop1.positionStart)
	//*   2    3:aload_3         
	//*   3    4:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*   4    7:aload           5
	//*   5    9:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*   6   12:icmpge          20
			k = 0 - 1;
	//    7   15:iconst_0        
	//    8   16:iconst_1        
	//    9   17:isub            
	//   10   18:istore          6
		int l = k;
	//   11   20:iload           6
	//   12   22:istore          7
		if(updateop.positionStart < updateop1.positionStart)
	//*  13   24:aload_3         
	//*  14   25:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  15   28:aload           5
	//*  16   30:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  17   33:icmpge          42
			l = k + 1;
	//   18   36:iload           6
	//   19   38:iconst_1        
	//   20   39:iadd            
	//   21   40:istore          7
		if(updateop1.positionStart <= updateop.positionStart)
	//*  22   42:aload           5
	//*  23   44:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  24   47:aload_3         
	//*  25   48:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  26   51:icmpgt          68
			updateop.positionStart = updateop.positionStart + updateop1.itemCount;
	//   27   54:aload_3         
	//   28   55:aload_3         
	//   29   56:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//   30   59:aload           5
	//   31   61:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//   32   64:iadd            
	//   33   65:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
		if(updateop1.positionStart <= updateop.itemCount)
	//*  34   68:aload           5
	//*  35   70:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  36   73:aload_3         
	//*  37   74:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  38   77:icmpgt          94
			updateop.itemCount = updateop.itemCount + updateop1.itemCount;
	//   39   80:aload_3         
	//   40   81:aload_3         
	//   41   82:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//   42   85:aload           5
	//   43   87:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//   44   90:iadd            
	//   45   91:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
		updateop1.positionStart = updateop1.positionStart + l;
	//   46   94:aload           5
	//   47   96:aload           5
	//   48   98:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//   49  101:iload           7
	//   50  103:iadd            
	//   51  104:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
		list.set(i, ((Object) (updateop1)));
	//   52  107:aload_1         
	//   53  108:iload_2         
	//   54  109:aload           5
	//   55  111:invokeinterface #49  <Method Object List.set(int, Object)>
	//   56  116:pop             
		list.set(j, ((Object) (updateop)));
	//   57  117:aload_1         
	//   58  118:iload           4
	//   59  120:aload_3         
	//   60  121:invokeinterface #49  <Method Object List.set(int, Object)>
	//   61  126:pop             
	//   62  127:return          
	}

	private void swapMoveOp(List list, int i, int j)
	{
		AdapterHelper.UpdateOp updateop = (AdapterHelper.UpdateOp)list.get(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokeinterface #29  <Method Object List.get(int)>
	//    3    7:checkcast       #31  <Class AdapterHelper$UpdateOp>
	//    4   10:astore          4
		AdapterHelper.UpdateOp updateop1 = (AdapterHelper.UpdateOp)list.get(j);
	//    5   12:aload_1         
	//    6   13:iload_3         
	//    7   14:invokeinterface #29  <Method Object List.get(int)>
	//    8   19:checkcast       #31  <Class AdapterHelper$UpdateOp>
	//    9   22:astore          5
		switch(updateop1.cmd)
	//*  10   24:aload           5
	//*  11   26:getfield        #35  <Field int AdapterHelper$UpdateOp.cmd>
		{
	//*  12   29:tableswitch     1 4: default 60
	//	               1 73
	//	               2 61
	//	               3 96
	//	               4 85
		default:
			return;
	//   13   60:return          

		case 2: // '\002'
			swapMoveRemove(list, i, updateop, j, updateop1);
	//   14   61:aload_0         
	//   15   62:aload_1         
	//   16   63:iload_2         
	//   17   64:aload           4
	//   18   66:iload_3         
	//   19   67:aload           5
	//   20   69:invokevirtual   #55  <Method void swapMoveRemove(List, int, AdapterHelper$UpdateOp, int, AdapterHelper$UpdateOp)>
			return;
	//   21   72:return          

		case 1: // '\001'
			swapMoveAdd(list, i, updateop, j, updateop1);
	//   22   73:aload_0         
	//   23   74:aload_1         
	//   24   75:iload_2         
	//   25   76:aload           4
	//   26   78:iload_3         
	//   27   79:aload           5
	//   28   81:invokespecial   #57  <Method void swapMoveAdd(List, int, AdapterHelper$UpdateOp, int, AdapterHelper$UpdateOp)>
			return;
	//   29   84:return          

		case 4: // '\004'
			swapMoveUpdate(list, i, updateop, j, updateop1);
	//   30   85:aload_0         
	//   31   86:aload_1         
	//   32   87:iload_2         
	//   33   88:aload           4
	//   34   90:iload_3         
	//   35   91:aload           5
	//   36   93:invokevirtual   #60  <Method void swapMoveUpdate(List, int, AdapterHelper$UpdateOp, int, AdapterHelper$UpdateOp)>
			// fall through

		case 3: // '\003'
			return;
	//   37   96:return          
		}
	}

	void reorderOps(List list)
	{
		do
		{
			int i = getLastMoveOutOfOrder(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #65  <Method int getLastMoveOutOfOrder(List)>
	//    3    5:istore_2        
			if(i != -1)
	//*   4    6:iload_2         
	//*   5    7:iconst_m1       
	//*   6    8:icmpeq          23
				swapMoveOp(list, i, i + 1);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:iload_2         
	//   10   14:iload_2         
	//   11   15:iconst_1        
	//   12   16:iadd            
	//   13   17:invokespecial   #67  <Method void swapMoveOp(List, int, int)>
			else
	//*  14   20:goto            0
				return;
	//   15   23:return          
		} while(true);
	}

	void swapMoveRemove(List list, int i, AdapterHelper.UpdateOp updateop, int j, AdapterHelper.UpdateOp updateop1)
	{
		AdapterHelper.UpdateOp updateop2 = null;
	//    0    0:aconst_null     
	//    1    1:astore          11
		boolean flag2 = false;
	//    2    3:iconst_0        
	//    3    4:istore          8
		boolean flag;
		boolean flag1;
		if(updateop.positionStart < updateop.itemCount)
	//*   4    6:aload_3         
	//*   5    7:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*   6   10:aload_3         
	//*   7   11:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*   8   14:icmpge          75
		{
			boolean flag3 = false;
	//    9   17:iconst_0        
	//   10   18:istore          9
			flag = flag2;
	//   11   20:iload           8
	//   12   22:istore          6
			flag1 = flag3;
	//   13   24:iload           9
	//   14   26:istore          7
			if(updateop1.positionStart == updateop.positionStart)
	//*  15   28:aload           5
	//*  16   30:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  17   33:aload_3         
	//*  18   34:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  19   37:icmpne          132
			{
				flag = flag2;
	//   20   40:iload           8
	//   21   42:istore          6
				flag1 = flag3;
	//   22   44:iload           9
	//   23   46:istore          7
				if(updateop1.itemCount == updateop.itemCount - updateop.positionStart)
	//*  24   48:aload           5
	//*  25   50:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  26   53:aload_3         
	//*  27   54:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  28   57:aload_3         
	//*  29   58:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  30   61:isub            
	//*  31   62:icmpne          132
				{
					flag = true;
	//   32   65:iconst_1        
	//   33   66:istore          6
					flag1 = flag3;
	//   34   68:iload           9
	//   35   70:istore          7
				}
			}
		} else
	//*  36   72:goto            132
		{
			boolean flag4 = true;
	//   37   75:iconst_1        
	//   38   76:istore          9
			flag = flag2;
	//   39   78:iload           8
	//   40   80:istore          6
			flag1 = flag4;
	//   41   82:iload           9
	//   42   84:istore          7
			if(updateop1.positionStart == updateop.itemCount + 1)
	//*  43   86:aload           5
	//*  44   88:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  45   91:aload_3         
	//*  46   92:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  47   95:iconst_1        
	//*  48   96:iadd            
	//*  49   97:icmpne          132
			{
				flag = flag2;
	//   50  100:iload           8
	//   51  102:istore          6
				flag1 = flag4;
	//   52  104:iload           9
	//   53  106:istore          7
				if(updateop1.itemCount == updateop.positionStart - updateop.itemCount)
	//*  54  108:aload           5
	//*  55  110:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  56  113:aload_3         
	//*  57  114:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  58  117:aload_3         
	//*  59  118:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  60  121:isub            
	//*  61  122:icmpne          132
				{
					flag = true;
	//   62  125:iconst_1        
	//   63  126:istore          6
					flag1 = flag4;
	//   64  128:iload           9
	//   65  130:istore          7
				}
			}
		}
		if(updateop.itemCount < updateop1.positionStart)
	//*  66  132:aload_3         
	//*  67  133:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  68  136:aload           5
	//*  69  138:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  70  141:icmpge          159
			updateop1.positionStart = updateop1.positionStart - 1;
	//   71  144:aload           5
	//   72  146:aload           5
	//   73  148:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//   74  151:iconst_1        
	//   75  152:isub            
	//   76  153:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
		else
	//*  77  156:goto            228
		if(updateop.itemCount < updateop1.positionStart + updateop1.itemCount)
	//*  78  159:aload_3         
	//*  79  160:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  80  163:aload           5
	//*  81  165:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  82  168:aload           5
	//*  83  170:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  84  173:iadd            
	//*  85  174:icmpge          228
		{
			updateop1.itemCount = updateop1.itemCount - 1;
	//   86  177:aload           5
	//   87  179:aload           5
	//   88  181:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//   89  184:iconst_1        
	//   90  185:isub            
	//   91  186:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
			updateop.cmd = 2;
	//   92  189:aload_3         
	//   93  190:iconst_2        
	//   94  191:putfield        #35  <Field int AdapterHelper$UpdateOp.cmd>
			updateop.itemCount = 1;
	//   95  194:aload_3         
	//   96  195:iconst_1        
	//   97  196:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
			if(updateop1.itemCount == 0)
	//*  98  199:aload           5
	//*  99  201:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 100  204:ifne            227
			{
				list.remove(j);
	//  101  207:aload_1         
	//  102  208:iload           4
	//  103  210:invokeinterface #71  <Method Object List.remove(int)>
	//  104  215:pop             
				mCallback.recycleUpdateOp(updateop1);
	//  105  216:aload_0         
	//  106  217:getfield        #16  <Field OpReorderer$Callback mCallback>
	//  107  220:aload           5
	//  108  222:invokeinterface #75  <Method void OpReorderer$Callback.recycleUpdateOp(AdapterHelper$UpdateOp)>
			}
			return;
	//  109  227:return          
		}
		if(updateop.positionStart <= updateop1.positionStart)
	//* 110  228:aload_3         
	//* 111  229:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 112  232:aload           5
	//* 113  234:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 114  237:icmpgt          255
			updateop1.positionStart = updateop1.positionStart + 1;
	//  115  240:aload           5
	//  116  242:aload           5
	//  117  244:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  118  247:iconst_1        
	//  119  248:iadd            
	//  120  249:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
		else
	//* 121  252:goto            335
		if(updateop.positionStart < updateop1.positionStart + updateop1.itemCount)
	//* 122  255:aload_3         
	//* 123  256:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 124  259:aload           5
	//* 125  261:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 126  264:aload           5
	//* 127  266:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 128  269:iadd            
	//* 129  270:icmpge          335
		{
			int k = updateop1.positionStart;
	//  130  273:aload           5
	//  131  275:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  132  278:istore          8
			int l = updateop1.itemCount;
	//  133  280:aload           5
	//  134  282:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  135  285:istore          9
			int i1 = updateop.positionStart;
	//  136  287:aload_3         
	//  137  288:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  138  291:istore          10
			updateop2 = mCallback.obtainUpdateOp(2, updateop.positionStart + 1, (k + l) - i1, ((Object) (null)));
	//  139  293:aload_0         
	//  140  294:getfield        #16  <Field OpReorderer$Callback mCallback>
	//  141  297:iconst_2        
	//  142  298:aload_3         
	//  143  299:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  144  302:iconst_1        
	//  145  303:iadd            
	//  146  304:iload           8
	//  147  306:iload           9
	//  148  308:iadd            
	//  149  309:iload           10
	//  150  311:isub            
	//  151  312:aconst_null     
	//  152  313:invokeinterface #79  <Method AdapterHelper$UpdateOp OpReorderer$Callback.obtainUpdateOp(int, int, int, Object)>
	//  153  318:astore          11
			updateop1.itemCount = updateop.positionStart - updateop1.positionStart;
	//  154  320:aload           5
	//  155  322:aload_3         
	//  156  323:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  157  326:aload           5
	//  158  328:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  159  331:isub            
	//  160  332:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
		}
		if(flag)
	//* 161  335:iload           6
	//* 162  337:ifeq            370
		{
			list.set(i, ((Object) (updateop1)));
	//  163  340:aload_1         
	//  164  341:iload_2         
	//  165  342:aload           5
	//  166  344:invokeinterface #49  <Method Object List.set(int, Object)>
	//  167  349:pop             
			list.remove(j);
	//  168  350:aload_1         
	//  169  351:iload           4
	//  170  353:invokeinterface #71  <Method Object List.remove(int)>
	//  171  358:pop             
			mCallback.recycleUpdateOp(updateop);
	//  172  359:aload_0         
	//  173  360:getfield        #16  <Field OpReorderer$Callback mCallback>
	//  174  363:aload_3         
	//  175  364:invokeinterface #75  <Method void OpReorderer$Callback.recycleUpdateOp(AdapterHelper$UpdateOp)>
			return;
	//  176  369:return          
		}
		if(flag1)
	//* 177  370:iload           7
	//* 178  372:ifeq            487
		{
			if(updateop2 != null)
	//* 179  375:aload           11
	//* 180  377:ifnull          432
			{
				if(updateop.positionStart > updateop2.positionStart)
	//* 181  380:aload_3         
	//* 182  381:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 183  384:aload           11
	//* 184  386:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 185  389:icmple          406
					updateop.positionStart = updateop.positionStart - updateop2.itemCount;
	//  186  392:aload_3         
	//  187  393:aload_3         
	//  188  394:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  189  397:aload           11
	//  190  399:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  191  402:isub            
	//  192  403:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
				if(updateop.itemCount > updateop2.positionStart)
	//* 193  406:aload_3         
	//* 194  407:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 195  410:aload           11
	//* 196  412:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 197  415:icmple          432
					updateop.itemCount = updateop.itemCount - updateop2.itemCount;
	//  198  418:aload_3         
	//  199  419:aload_3         
	//  200  420:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  201  423:aload           11
	//  202  425:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  203  428:isub            
	//  204  429:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
			}
			if(updateop.positionStart > updateop1.positionStart)
	//* 205  432:aload_3         
	//* 206  433:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 207  436:aload           5
	//* 208  438:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 209  441:icmple          458
				updateop.positionStart = updateop.positionStart - updateop1.itemCount;
	//  210  444:aload_3         
	//  211  445:aload_3         
	//  212  446:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  213  449:aload           5
	//  214  451:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  215  454:isub            
	//  216  455:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
			if(updateop.itemCount > updateop1.positionStart)
	//* 217  458:aload_3         
	//* 218  459:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 219  462:aload           5
	//* 220  464:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 221  467:icmple          596
				updateop.itemCount = updateop.itemCount - updateop1.itemCount;
	//  222  470:aload_3         
	//  223  471:aload_3         
	//  224  472:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  225  475:aload           5
	//  226  477:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  227  480:isub            
	//  228  481:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
		} else
	//* 229  484:goto            596
		{
			if(updateop2 != null)
	//* 230  487:aload           11
	//* 231  489:ifnull          544
			{
				if(updateop.positionStart >= updateop2.positionStart)
	//* 232  492:aload_3         
	//* 233  493:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 234  496:aload           11
	//* 235  498:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 236  501:icmplt          518
					updateop.positionStart = updateop.positionStart - updateop2.itemCount;
	//  237  504:aload_3         
	//  238  505:aload_3         
	//  239  506:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  240  509:aload           11
	//  241  511:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  242  514:isub            
	//  243  515:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
				if(updateop.itemCount >= updateop2.positionStart)
	//* 244  518:aload_3         
	//* 245  519:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 246  522:aload           11
	//* 247  524:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 248  527:icmplt          544
					updateop.itemCount = updateop.itemCount - updateop2.itemCount;
	//  249  530:aload_3         
	//  250  531:aload_3         
	//  251  532:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  252  535:aload           11
	//  253  537:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  254  540:isub            
	//  255  541:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
			}
			if(updateop.positionStart >= updateop1.positionStart)
	//* 256  544:aload_3         
	//* 257  545:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 258  548:aload           5
	//* 259  550:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 260  553:icmplt          570
				updateop.positionStart = updateop.positionStart - updateop1.itemCount;
	//  261  556:aload_3         
	//  262  557:aload_3         
	//  263  558:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  264  561:aload           5
	//  265  563:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  266  566:isub            
	//  267  567:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
			if(updateop.itemCount >= updateop1.positionStart)
	//* 268  570:aload_3         
	//* 269  571:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 270  574:aload           5
	//* 271  576:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 272  579:icmplt          596
				updateop.itemCount = updateop.itemCount - updateop1.itemCount;
	//  273  582:aload_3         
	//  274  583:aload_3         
	//  275  584:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  276  587:aload           5
	//  277  589:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  278  592:isub            
	//  279  593:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
		}
		list.set(i, ((Object) (updateop1)));
	//  280  596:aload_1         
	//  281  597:iload_2         
	//  282  598:aload           5
	//  283  600:invokeinterface #49  <Method Object List.set(int, Object)>
	//  284  605:pop             
		if(updateop.positionStart != updateop.itemCount)
	//* 285  606:aload_3         
	//* 286  607:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 287  610:aload_3         
	//* 288  611:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 289  614:icmpeq          630
			list.set(j, ((Object) (updateop)));
	//  290  617:aload_1         
	//  291  618:iload           4
	//  292  620:aload_3         
	//  293  621:invokeinterface #49  <Method Object List.set(int, Object)>
	//  294  626:pop             
		else
	//* 295  627:goto            639
			list.remove(j);
	//  296  630:aload_1         
	//  297  631:iload           4
	//  298  633:invokeinterface #71  <Method Object List.remove(int)>
	//  299  638:pop             
		if(updateop2 != null)
	//* 300  639:aload           11
	//* 301  641:ifnull          653
			list.add(i, ((Object) (updateop2)));
	//  302  644:aload_1         
	//  303  645:iload_2         
	//  304  646:aload           11
	//  305  648:invokeinterface #83  <Method void List.add(int, Object)>
	//  306  653:return          
	}

	void swapMoveUpdate(List list, int i, AdapterHelper.UpdateOp updateop, int j, AdapterHelper.UpdateOp updateop1)
	{
		AdapterHelper.UpdateOp updateop2 = null;
	//    0    0:aconst_null     
	//    1    1:astore          7
		AdapterHelper.UpdateOp updateop3 = null;
	//    2    3:aconst_null     
	//    3    4:astore          8
		if(updateop.itemCount < updateop1.positionStart)
	//*   4    6:aload_3         
	//*   5    7:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*   6   10:aload           5
	//*   7   12:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*   8   15:icmpge          33
			updateop1.positionStart = updateop1.positionStart - 1;
	//    9   18:aload           5
	//   10   20:aload           5
	//   11   22:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//   12   25:iconst_1        
	//   13   26:isub            
	//   14   27:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
		else
	//*  15   30:goto            85
		if(updateop.itemCount < updateop1.positionStart + updateop1.itemCount)
	//*  16   33:aload_3         
	//*  17   34:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  18   37:aload           5
	//*  19   39:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  20   42:aload           5
	//*  21   44:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  22   47:iadd            
	//*  23   48:icmpge          85
		{
			updateop1.itemCount = updateop1.itemCount - 1;
	//   24   51:aload           5
	//   25   53:aload           5
	//   26   55:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//   27   58:iconst_1        
	//   28   59:isub            
	//   29   60:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
			updateop2 = mCallback.obtainUpdateOp(4, updateop.positionStart, 1, updateop1.payload);
	//   30   63:aload_0         
	//   31   64:getfield        #16  <Field OpReorderer$Callback mCallback>
	//   32   67:iconst_4        
	//   33   68:aload_3         
	//   34   69:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//   35   72:iconst_1        
	//   36   73:aload           5
	//   37   75:getfield        #87  <Field Object AdapterHelper$UpdateOp.payload>
	//   38   78:invokeinterface #79  <Method AdapterHelper$UpdateOp OpReorderer$Callback.obtainUpdateOp(int, int, int, Object)>
	//   39   83:astore          7
		}
		if(updateop.positionStart <= updateop1.positionStart)
	//*  40   85:aload_3         
	//*  41   86:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  42   89:aload           5
	//*  43   91:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  44   94:icmpgt          112
			updateop1.positionStart = updateop1.positionStart + 1;
	//   45   97:aload           5
	//   46   99:aload           5
	//   47  101:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//   48  104:iconst_1        
	//   49  105:iadd            
	//   50  106:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
		else
	//*  51  109:goto            186
		if(updateop.positionStart < updateop1.positionStart + updateop1.itemCount)
	//*  52  112:aload_3         
	//*  53  113:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  54  116:aload           5
	//*  55  118:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  56  121:aload           5
	//*  57  123:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  58  126:iadd            
	//*  59  127:icmpge          186
		{
			int k = (updateop1.positionStart + updateop1.itemCount) - updateop.positionStart;
	//   60  130:aload           5
	//   61  132:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//   62  135:aload           5
	//   63  137:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//   64  140:iadd            
	//   65  141:aload_3         
	//   66  142:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//   67  145:isub            
	//   68  146:istore          6
			updateop3 = mCallback.obtainUpdateOp(4, updateop.positionStart + 1, k, updateop1.payload);
	//   69  148:aload_0         
	//   70  149:getfield        #16  <Field OpReorderer$Callback mCallback>
	//   71  152:iconst_4        
	//   72  153:aload_3         
	//   73  154:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//   74  157:iconst_1        
	//   75  158:iadd            
	//   76  159:iload           6
	//   77  161:aload           5
	//   78  163:getfield        #87  <Field Object AdapterHelper$UpdateOp.payload>
	//   79  166:invokeinterface #79  <Method AdapterHelper$UpdateOp OpReorderer$Callback.obtainUpdateOp(int, int, int, Object)>
	//   80  171:astore          8
			updateop1.itemCount = updateop1.itemCount - k;
	//   81  173:aload           5
	//   82  175:aload           5
	//   83  177:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//   84  180:iload           6
	//   85  182:isub            
	//   86  183:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
		}
		list.set(j, ((Object) (updateop)));
	//   87  186:aload_1         
	//   88  187:iload           4
	//   89  189:aload_3         
	//   90  190:invokeinterface #49  <Method Object List.set(int, Object)>
	//   91  195:pop             
		if(updateop1.itemCount > 0)
	//*  92  196:aload           5
	//*  93  198:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  94  201:ifle            217
		{
			list.set(i, ((Object) (updateop1)));
	//   95  204:aload_1         
	//   96  205:iload_2         
	//   97  206:aload           5
	//   98  208:invokeinterface #49  <Method Object List.set(int, Object)>
	//   99  213:pop             
		} else
	//* 100  214:goto            236
		{
			list.remove(i);
	//  101  217:aload_1         
	//  102  218:iload_2         
	//  103  219:invokeinterface #71  <Method Object List.remove(int)>
	//  104  224:pop             
			mCallback.recycleUpdateOp(updateop1);
	//  105  225:aload_0         
	//  106  226:getfield        #16  <Field OpReorderer$Callback mCallback>
	//  107  229:aload           5
	//  108  231:invokeinterface #75  <Method void OpReorderer$Callback.recycleUpdateOp(AdapterHelper$UpdateOp)>
		}
		if(updateop2 != null)
	//* 109  236:aload           7
	//* 110  238:ifnull          250
			list.add(i, ((Object) (updateop2)));
	//  111  241:aload_1         
	//  112  242:iload_2         
	//  113  243:aload           7
	//  114  245:invokeinterface #83  <Method void List.add(int, Object)>
		if(updateop3 != null)
	//* 115  250:aload           8
	//* 116  252:ifnull          264
			list.add(i, ((Object) (updateop3)));
	//  117  255:aload_1         
	//  118  256:iload_2         
	//  119  257:aload           8
	//  120  259:invokeinterface #83  <Method void List.add(int, Object)>
	//  121  264:return          
	}

	final Callback mCallback;
}
