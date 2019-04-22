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
		int i = list.size() - 1;
	//    0    0:aload_1         
	//    1    1:invokeinterface #25  <Method int List.size()>
	//    2    6:iconst_1        
	//    3    7:isub            
	//    4    8:istore_2        
		boolean flag1;
		for(boolean flag = false; i >= 0; flag = flag1)
	//*   5    9:iconst_0        
	//*   6   10:istore_3        
	//*   7   11:iload_2         
	//*   8   12:iflt            55
		{
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
		}

	//   28   49:iload           4
	//   29   51:istore_3        
	//*  30   52:goto            11
		return -1;
	//   31   55:iconst_m1       
	//   32   56:ireturn         
	}

	private void swapMoveAdd(List list, int i, AdapterHelper.UpdateOp updateop, int j, AdapterHelper.UpdateOp updateop1)
	{
		byte byte0;
		if(updateop.itemCount < updateop1.positionStart)
	//*   0    0:aload_3         
	//*   1    1:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*   2    4:aload           5
	//*   3    6:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*   4    9:icmpge          18
			byte0 = -1;
	//    5   12:iconst_m1       
	//    6   13:istore          6
		else
	//*   7   15:goto            21
			byte0 = 0;
	//    8   18:iconst_0        
	//    9   19:istore          6
		int k = ((int) (byte0));
	//   10   21:iload           6
	//   11   23:istore          7
		if(updateop.positionStart < updateop1.positionStart)
	//*  12   25:aload_3         
	//*  13   26:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  14   29:aload           5
	//*  15   31:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  16   34:icmpge          43
			k = byte0 + 1;
	//   17   37:iload           6
	//   18   39:iconst_1        
	//   19   40:iadd            
	//   20   41:istore          7
		if(updateop1.positionStart <= updateop.positionStart)
	//*  21   43:aload           5
	//*  22   45:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  23   48:aload_3         
	//*  24   49:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  25   52:icmpgt          69
			updateop.positionStart = updateop.positionStart + updateop1.itemCount;
	//   26   55:aload_3         
	//   27   56:aload_3         
	//   28   57:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//   29   60:aload           5
	//   30   62:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//   31   65:iadd            
	//   32   66:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
		if(updateop1.positionStart <= updateop.itemCount)
	//*  33   69:aload           5
	//*  34   71:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  35   74:aload_3         
	//*  36   75:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  37   78:icmpgt          95
			updateop.itemCount = updateop.itemCount + updateop1.itemCount;
	//   38   81:aload_3         
	//   39   82:aload_3         
	//   40   83:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//   41   86:aload           5
	//   42   88:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//   43   91:iadd            
	//   44   92:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
		updateop1.positionStart = updateop1.positionStart + k;
	//   45   95:aload           5
	//   46   97:aload           5
	//   47   99:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//   48  102:iload           7
	//   49  104:iadd            
	//   50  105:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
		list.set(i, ((Object) (updateop1)));
	//   51  108:aload_1         
	//   52  109:iload_2         
	//   53  110:aload           5
	//   54  112:invokeinterface #49  <Method Object List.set(int, Object)>
	//   55  117:pop             
		list.set(j, ((Object) (updateop)));
	//   56  118:aload_1         
	//   57  119:iload           4
	//   58  121:aload_3         
	//   59  122:invokeinterface #49  <Method Object List.set(int, Object)>
	//   60  127:pop             
	//   61  128:return          
	}

	private void swapMoveOp(List list, int i, int j)
	{
		AdapterHelper.UpdateOp updateop = (AdapterHelper.UpdateOp)list.get(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokeinterface #29  <Method Object List.get(int)>
	//    3    7:checkcast       #31  <Class AdapterHelper$UpdateOp>
	//    4   10:astore          5
		AdapterHelper.UpdateOp updateop1 = (AdapterHelper.UpdateOp)list.get(j);
	//    5   12:aload_1         
	//    6   13:iload_3         
	//    7   14:invokeinterface #29  <Method Object List.get(int)>
	//    8   19:checkcast       #31  <Class AdapterHelper$UpdateOp>
	//    9   22:astore          6
		int k = updateop1.cmd;
	//   10   24:aload           6
	//   11   26:getfield        #35  <Field int AdapterHelper$UpdateOp.cmd>
	//   12   29:istore          4
		if(k != 4)
	//*  13   31:iload           4
	//*  14   33:iconst_4        
	//*  15   34:icmpeq          85
		{
			switch(k)
	//*  16   37:iload           4
			{
	//*  17   39:tableswitch     1 2: default 60
	//	               1 73
	//	               2 61
			default:
				return;
	//   18   60:return          

			case 2: // '\002'
				swapMoveRemove(list, i, updateop, j, updateop1);
	//   19   61:aload_0         
	//   20   62:aload_1         
	//   21   63:iload_2         
	//   22   64:aload           5
	//   23   66:iload_3         
	//   24   67:aload           6
	//   25   69:invokevirtual   #55  <Method void swapMoveRemove(List, int, AdapterHelper$UpdateOp, int, AdapterHelper$UpdateOp)>
				return;
	//   26   72:return          

			case 1: // '\001'
				swapMoveAdd(list, i, updateop, j, updateop1);
	//   27   73:aload_0         
	//   28   74:aload_1         
	//   29   75:iload_2         
	//   30   76:aload           5
	//   31   78:iload_3         
	//   32   79:aload           6
	//   33   81:invokespecial   #57  <Method void swapMoveAdd(List, int, AdapterHelper$UpdateOp, int, AdapterHelper$UpdateOp)>
				return;
	//   34   84:return          
			}
		} else
		{
			swapMoveUpdate(list, i, updateop, j, updateop1);
	//   35   85:aload_0         
	//   36   86:aload_1         
	//   37   87:iload_2         
	//   38   88:aload           5
	//   39   90:iload_3         
	//   40   91:aload           6
	//   41   93:invokevirtual   #60  <Method void swapMoveUpdate(List, int, AdapterHelper$UpdateOp, int, AdapterHelper$UpdateOp)>
			return;
	//   42   96:return          
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
		int k = updateop.positionStart;
	//    0    0:aload_3         
	//    1    1:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//    2    4:istore          6
		int l = updateop.itemCount;
	//    3    6:aload_3         
	//    4    7:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//    5   10:istore          8
		boolean flag1 = false;
	//    6   12:iconst_0        
	//    7   13:istore          7
		boolean flag;
		if(k < l)
	//*   8   15:iload           6
	//*   9   17:iload           8
	//*  10   19:icmpge          66
		{
			if(updateop1.positionStart == updateop.positionStart && updateop1.itemCount == updateop.itemCount - updateop.positionStart)
	//*  11   22:aload           5
	//*  12   24:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  13   27:aload_3         
	//*  14   28:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  15   31:icmpne          60
	//*  16   34:aload           5
	//*  17   36:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  18   39:aload_3         
	//*  19   40:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  20   43:aload_3         
	//*  21   44:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  22   47:isub            
	//*  23   48:icmpne          60
			{
				flag = false;
	//   24   51:iconst_0        
	//   25   52:istore          6
				flag1 = true;
	//   26   54:iconst_1        
	//   27   55:istore          7
			} else
	//*  28   57:goto            109
			{
				flag = false;
	//   29   60:iconst_0        
	//   30   61:istore          6
			}
		} else
	//*  31   63:goto            109
		if(updateop1.positionStart == updateop.itemCount + 1 && updateop1.itemCount == updateop.positionStart - updateop.itemCount)
	//*  32   66:aload           5
	//*  33   68:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  34   71:aload_3         
	//*  35   72:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  36   75:iconst_1        
	//*  37   76:iadd            
	//*  38   77:icmpne          106
	//*  39   80:aload           5
	//*  40   82:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  41   85:aload_3         
	//*  42   86:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  43   89:aload_3         
	//*  44   90:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  45   93:isub            
	//*  46   94:icmpne          106
		{
			flag = true;
	//   47   97:iconst_1        
	//   48   98:istore          6
			flag1 = true;
	//   49  100:iconst_1        
	//   50  101:istore          7
		} else
	//*  51  103:goto            109
		{
			flag = true;
	//   52  106:iconst_1        
	//   53  107:istore          6
		}
		if(updateop.itemCount < updateop1.positionStart)
	//*  54  109:aload_3         
	//*  55  110:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  56  113:aload           5
	//*  57  115:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  58  118:icmpge          136
			updateop1.positionStart = updateop1.positionStart - 1;
	//   59  121:aload           5
	//   60  123:aload           5
	//   61  125:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//   62  128:iconst_1        
	//   63  129:isub            
	//   64  130:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
		else
	//*  65  133:goto            205
		if(updateop.itemCount < updateop1.positionStart + updateop1.itemCount)
	//*  66  136:aload_3         
	//*  67  137:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  68  140:aload           5
	//*  69  142:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  70  145:aload           5
	//*  71  147:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  72  150:iadd            
	//*  73  151:icmpge          205
		{
			updateop1.itemCount = updateop1.itemCount - 1;
	//   74  154:aload           5
	//   75  156:aload           5
	//   76  158:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//   77  161:iconst_1        
	//   78  162:isub            
	//   79  163:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
			updateop.cmd = 2;
	//   80  166:aload_3         
	//   81  167:iconst_2        
	//   82  168:putfield        #35  <Field int AdapterHelper$UpdateOp.cmd>
			updateop.itemCount = 1;
	//   83  171:aload_3         
	//   84  172:iconst_1        
	//   85  173:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
			if(updateop1.itemCount == 0)
	//*  86  176:aload           5
	//*  87  178:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  88  181:ifne            204
			{
				list.remove(j);
	//   89  184:aload_1         
	//   90  185:iload           4
	//   91  187:invokeinterface #71  <Method Object List.remove(int)>
	//   92  192:pop             
				mCallback.recycleUpdateOp(updateop1);
	//   93  193:aload_0         
	//   94  194:getfield        #16  <Field OpReorderer$Callback mCallback>
	//   95  197:aload           5
	//   96  199:invokeinterface #75  <Method void OpReorderer$Callback.recycleUpdateOp(AdapterHelper$UpdateOp)>
			}
			return;
	//   97  204:return          
		}
		l = updateop.positionStart;
	//   98  205:aload_3         
	//   99  206:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  100  209:istore          8
		int j1 = updateop1.positionStart;
	//  101  211:aload           5
	//  102  213:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  103  216:istore          9
		AdapterHelper.UpdateOp updateop2 = null;
	//  104  218:aconst_null     
	//  105  219:astore          11
		if(l <= j1)
	//* 106  221:iload           8
	//* 107  223:iload           9
	//* 108  225:icmpgt          243
			updateop1.positionStart = updateop1.positionStart + 1;
	//  109  228:aload           5
	//  110  230:aload           5
	//  111  232:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  112  235:iconst_1        
	//  113  236:iadd            
	//  114  237:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
		else
	//* 115  240:goto            323
		if(updateop.positionStart < updateop1.positionStart + updateop1.itemCount)
	//* 116  243:aload_3         
	//* 117  244:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 118  247:aload           5
	//* 119  249:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 120  252:aload           5
	//* 121  254:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 122  257:iadd            
	//* 123  258:icmpge          323
		{
			int i1 = updateop1.positionStart;
	//  124  261:aload           5
	//  125  263:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  126  266:istore          8
			int k1 = updateop1.itemCount;
	//  127  268:aload           5
	//  128  270:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  129  273:istore          9
			int l1 = updateop.positionStart;
	//  130  275:aload_3         
	//  131  276:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  132  279:istore          10
			updateop2 = mCallback.obtainUpdateOp(2, updateop.positionStart + 1, (i1 + k1) - l1, ((Object) (null)));
	//  133  281:aload_0         
	//  134  282:getfield        #16  <Field OpReorderer$Callback mCallback>
	//  135  285:iconst_2        
	//  136  286:aload_3         
	//  137  287:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  138  290:iconst_1        
	//  139  291:iadd            
	//  140  292:iload           8
	//  141  294:iload           9
	//  142  296:iadd            
	//  143  297:iload           10
	//  144  299:isub            
	//  145  300:aconst_null     
	//  146  301:invokeinterface #79  <Method AdapterHelper$UpdateOp OpReorderer$Callback.obtainUpdateOp(int, int, int, Object)>
	//  147  306:astore          11
			updateop1.itemCount = updateop.positionStart - updateop1.positionStart;
	//  148  308:aload           5
	//  149  310:aload_3         
	//  150  311:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  151  314:aload           5
	//  152  316:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  153  319:isub            
	//  154  320:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
		}
		if(flag1)
	//* 155  323:iload           7
	//* 156  325:ifeq            358
		{
			list.set(i, ((Object) (updateop1)));
	//  157  328:aload_1         
	//  158  329:iload_2         
	//  159  330:aload           5
	//  160  332:invokeinterface #49  <Method Object List.set(int, Object)>
	//  161  337:pop             
			list.remove(j);
	//  162  338:aload_1         
	//  163  339:iload           4
	//  164  341:invokeinterface #71  <Method Object List.remove(int)>
	//  165  346:pop             
			mCallback.recycleUpdateOp(updateop);
	//  166  347:aload_0         
	//  167  348:getfield        #16  <Field OpReorderer$Callback mCallback>
	//  168  351:aload_3         
	//  169  352:invokeinterface #75  <Method void OpReorderer$Callback.recycleUpdateOp(AdapterHelper$UpdateOp)>
			return;
	//  170  357:return          
		}
		if(flag)
	//* 171  358:iload           6
	//* 172  360:ifeq            475
		{
			if(updateop2 != null)
	//* 173  363:aload           11
	//* 174  365:ifnull          420
			{
				if(updateop.positionStart > updateop2.positionStart)
	//* 175  368:aload_3         
	//* 176  369:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 177  372:aload           11
	//* 178  374:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 179  377:icmple          394
					updateop.positionStart = updateop.positionStart - updateop2.itemCount;
	//  180  380:aload_3         
	//  181  381:aload_3         
	//  182  382:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  183  385:aload           11
	//  184  387:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  185  390:isub            
	//  186  391:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
				if(updateop.itemCount > updateop2.positionStart)
	//* 187  394:aload_3         
	//* 188  395:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 189  398:aload           11
	//* 190  400:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 191  403:icmple          420
					updateop.itemCount = updateop.itemCount - updateop2.itemCount;
	//  192  406:aload_3         
	//  193  407:aload_3         
	//  194  408:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  195  411:aload           11
	//  196  413:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  197  416:isub            
	//  198  417:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
			}
			if(updateop.positionStart > updateop1.positionStart)
	//* 199  420:aload_3         
	//* 200  421:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 201  424:aload           5
	//* 202  426:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 203  429:icmple          446
				updateop.positionStart = updateop.positionStart - updateop1.itemCount;
	//  204  432:aload_3         
	//  205  433:aload_3         
	//  206  434:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  207  437:aload           5
	//  208  439:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  209  442:isub            
	//  210  443:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
			if(updateop.itemCount > updateop1.positionStart)
	//* 211  446:aload_3         
	//* 212  447:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 213  450:aload           5
	//* 214  452:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 215  455:icmple          584
				updateop.itemCount = updateop.itemCount - updateop1.itemCount;
	//  216  458:aload_3         
	//  217  459:aload_3         
	//  218  460:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  219  463:aload           5
	//  220  465:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  221  468:isub            
	//  222  469:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
		} else
	//* 223  472:goto            584
		{
			if(updateop2 != null)
	//* 224  475:aload           11
	//* 225  477:ifnull          532
			{
				if(updateop.positionStart >= updateop2.positionStart)
	//* 226  480:aload_3         
	//* 227  481:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 228  484:aload           11
	//* 229  486:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 230  489:icmplt          506
					updateop.positionStart = updateop.positionStart - updateop2.itemCount;
	//  231  492:aload_3         
	//  232  493:aload_3         
	//  233  494:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  234  497:aload           11
	//  235  499:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  236  502:isub            
	//  237  503:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
				if(updateop.itemCount >= updateop2.positionStart)
	//* 238  506:aload_3         
	//* 239  507:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 240  510:aload           11
	//* 241  512:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 242  515:icmplt          532
					updateop.itemCount = updateop.itemCount - updateop2.itemCount;
	//  243  518:aload_3         
	//  244  519:aload_3         
	//  245  520:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  246  523:aload           11
	//  247  525:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  248  528:isub            
	//  249  529:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
			}
			if(updateop.positionStart >= updateop1.positionStart)
	//* 250  532:aload_3         
	//* 251  533:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 252  536:aload           5
	//* 253  538:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 254  541:icmplt          558
				updateop.positionStart = updateop.positionStart - updateop1.itemCount;
	//  255  544:aload_3         
	//  256  545:aload_3         
	//  257  546:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  258  549:aload           5
	//  259  551:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  260  554:isub            
	//  261  555:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
			if(updateop.itemCount >= updateop1.positionStart)
	//* 262  558:aload_3         
	//* 263  559:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 264  562:aload           5
	//* 265  564:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 266  567:icmplt          584
				updateop.itemCount = updateop.itemCount - updateop1.itemCount;
	//  267  570:aload_3         
	//  268  571:aload_3         
	//  269  572:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  270  575:aload           5
	//  271  577:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  272  580:isub            
	//  273  581:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
		}
		list.set(i, ((Object) (updateop1)));
	//  274  584:aload_1         
	//  275  585:iload_2         
	//  276  586:aload           5
	//  277  588:invokeinterface #49  <Method Object List.set(int, Object)>
	//  278  593:pop             
		if(updateop.positionStart != updateop.itemCount)
	//* 279  594:aload_3         
	//* 280  595:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 281  598:aload_3         
	//* 282  599:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 283  602:icmpeq          618
			list.set(j, ((Object) (updateop)));
	//  284  605:aload_1         
	//  285  606:iload           4
	//  286  608:aload_3         
	//  287  609:invokeinterface #49  <Method Object List.set(int, Object)>
	//  288  614:pop             
		else
	//* 289  615:goto            627
			list.remove(j);
	//  290  618:aload_1         
	//  291  619:iload           4
	//  292  621:invokeinterface #71  <Method Object List.remove(int)>
	//  293  626:pop             
		if(updateop2 != null)
	//* 294  627:aload           11
	//* 295  629:ifnull          641
			list.add(i, ((Object) (updateop2)));
	//  296  632:aload_1         
	//  297  633:iload_2         
	//  298  634:aload           11
	//  299  636:invokeinterface #83  <Method void List.add(int, Object)>
	//  300  641:return          
	}

	void swapMoveUpdate(List list, int i, AdapterHelper.UpdateOp updateop, int j, AdapterHelper.UpdateOp updateop1)
	{
		AdapterHelper.UpdateOp updateop2;
		AdapterHelper.UpdateOp updateop3;
label0:
		{
			int k = updateop.itemCount;
	//    0    0:aload_3         
	//    1    1:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//    2    4:istore          6
			int i1 = updateop1.positionStart;
	//    3    6:aload           5
	//    4    8:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//    5   11:istore          7
			updateop3 = null;
	//    6   13:aconst_null     
	//    7   14:astore          9
			if(k < i1)
	//*   8   16:iload           6
	//*   9   18:iload           7
	//*  10   20:icmpge          38
				updateop1.positionStart = updateop1.positionStart - 1;
	//   11   23:aload           5
	//   12   25:aload           5
	//   13   27:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//   14   30:iconst_1        
	//   15   31:isub            
	//   16   32:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
			else
	//*  17   35:goto            93
			if(updateop.itemCount < updateop1.positionStart + updateop1.itemCount)
	//*  18   38:aload_3         
	//*  19   39:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  20   42:aload           5
	//*  21   44:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  22   47:aload           5
	//*  23   49:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  24   52:iadd            
	//*  25   53:icmpge          93
			{
				updateop1.itemCount = updateop1.itemCount - 1;
	//   26   56:aload           5
	//   27   58:aload           5
	//   28   60:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//   29   63:iconst_1        
	//   30   64:isub            
	//   31   65:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
				updateop2 = mCallback.obtainUpdateOp(4, updateop.positionStart, 1, updateop1.payload);
	//   32   68:aload_0         
	//   33   69:getfield        #16  <Field OpReorderer$Callback mCallback>
	//   34   72:iconst_4        
	//   35   73:aload_3         
	//   36   74:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//   37   77:iconst_1        
	//   38   78:aload           5
	//   39   80:getfield        #87  <Field Object AdapterHelper$UpdateOp.payload>
	//   40   83:invokeinterface #79  <Method AdapterHelper$UpdateOp OpReorderer$Callback.obtainUpdateOp(int, int, int, Object)>
	//   41   88:astore          8
				break label0;
	//   42   90:goto            96
			}
			updateop2 = null;
	//   43   93:aconst_null     
	//   44   94:astore          8
		}
		if(updateop.positionStart <= updateop1.positionStart)
	//*  45   96:aload_3         
	//*  46   97:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  47  100:aload           5
	//*  48  102:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  49  105:icmpgt          123
			updateop1.positionStart = updateop1.positionStart + 1;
	//   50  108:aload           5
	//   51  110:aload           5
	//   52  112:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//   53  115:iconst_1        
	//   54  116:iadd            
	//   55  117:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
		else
	//*  56  120:goto            197
		if(updateop.positionStart < updateop1.positionStart + updateop1.itemCount)
	//*  57  123:aload_3         
	//*  58  124:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  59  127:aload           5
	//*  60  129:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  61  132:aload           5
	//*  62  134:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  63  137:iadd            
	//*  64  138:icmpge          197
		{
			int l = (updateop1.positionStart + updateop1.itemCount) - updateop.positionStart;
	//   65  141:aload           5
	//   66  143:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//   67  146:aload           5
	//   68  148:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//   69  151:iadd            
	//   70  152:aload_3         
	//   71  153:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//   72  156:isub            
	//   73  157:istore          6
			updateop3 = mCallback.obtainUpdateOp(4, updateop.positionStart + 1, l, updateop1.payload);
	//   74  159:aload_0         
	//   75  160:getfield        #16  <Field OpReorderer$Callback mCallback>
	//   76  163:iconst_4        
	//   77  164:aload_3         
	//   78  165:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//   79  168:iconst_1        
	//   80  169:iadd            
	//   81  170:iload           6
	//   82  172:aload           5
	//   83  174:getfield        #87  <Field Object AdapterHelper$UpdateOp.payload>
	//   84  177:invokeinterface #79  <Method AdapterHelper$UpdateOp OpReorderer$Callback.obtainUpdateOp(int, int, int, Object)>
	//   85  182:astore          9
			updateop1.itemCount = updateop1.itemCount - l;
	//   86  184:aload           5
	//   87  186:aload           5
	//   88  188:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//   89  191:iload           6
	//   90  193:isub            
	//   91  194:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
		}
		list.set(j, ((Object) (updateop)));
	//   92  197:aload_1         
	//   93  198:iload           4
	//   94  200:aload_3         
	//   95  201:invokeinterface #49  <Method Object List.set(int, Object)>
	//   96  206:pop             
		if(updateop1.itemCount > 0)
	//*  97  207:aload           5
	//*  98  209:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  99  212:ifle            228
		{
			list.set(i, ((Object) (updateop1)));
	//  100  215:aload_1         
	//  101  216:iload_2         
	//  102  217:aload           5
	//  103  219:invokeinterface #49  <Method Object List.set(int, Object)>
	//  104  224:pop             
		} else
	//* 105  225:goto            247
		{
			list.remove(i);
	//  106  228:aload_1         
	//  107  229:iload_2         
	//  108  230:invokeinterface #71  <Method Object List.remove(int)>
	//  109  235:pop             
			mCallback.recycleUpdateOp(updateop1);
	//  110  236:aload_0         
	//  111  237:getfield        #16  <Field OpReorderer$Callback mCallback>
	//  112  240:aload           5
	//  113  242:invokeinterface #75  <Method void OpReorderer$Callback.recycleUpdateOp(AdapterHelper$UpdateOp)>
		}
		if(updateop2 != null)
	//* 114  247:aload           8
	//* 115  249:ifnull          261
			list.add(i, ((Object) (updateop2)));
	//  116  252:aload_1         
	//  117  253:iload_2         
	//  118  254:aload           8
	//  119  256:invokeinterface #83  <Method void List.add(int, Object)>
		if(updateop3 != null)
	//* 120  261:aload           9
	//* 121  263:ifnull          275
			list.add(i, ((Object) (updateop3)));
	//  122  266:aload_1         
	//  123  267:iload_2         
	//  124  268:aload           9
	//  125  270:invokeinterface #83  <Method void List.add(int, Object)>
	//  126  275:return          
	}

	final Callback mCallback;
}
