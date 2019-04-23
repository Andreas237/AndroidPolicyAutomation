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
	//*  28   57:goto            110
			{
				flag = false;
	//   29   60:iconst_0        
	//   30   61:istore          6
			}
		} else
	//*  31   63:goto            110
		if(updateop1.positionStart == updateop.itemCount + 1 && updateop1.itemCount == updateop.positionStart - updateop.itemCount)
	//*  32   66:aload           5
	//*  33   68:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  34   71:aload_3         
	//*  35   72:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  36   75:iconst_1        
	//*  37   76:iadd            
	//*  38   77:icmpne          107
	//*  39   80:aload           5
	//*  40   82:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  41   85:aload_3         
	//*  42   86:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  43   89:aload_3         
	//*  44   90:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  45   93:isub            
	//*  46   94:icmpne          107
		{
			flag = true;
	//   47   97:iconst_1        
	//   48   98:istore          6
			flag1 = flag;
	//   49  100:iload           6
	//   50  102:istore          7
		} else
	//*  51  104:goto            110
		{
			flag = true;
	//   52  107:iconst_1        
	//   53  108:istore          6
		}
		if(updateop.itemCount < updateop1.positionStart)
	//*  54  110:aload_3         
	//*  55  111:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  56  114:aload           5
	//*  57  116:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  58  119:icmpge          137
			updateop1.positionStart = updateop1.positionStart - 1;
	//   59  122:aload           5
	//   60  124:aload           5
	//   61  126:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//   62  129:iconst_1        
	//   63  130:isub            
	//   64  131:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
		else
	//*  65  134:goto            206
		if(updateop.itemCount < updateop1.positionStart + updateop1.itemCount)
	//*  66  137:aload_3         
	//*  67  138:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  68  141:aload           5
	//*  69  143:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  70  146:aload           5
	//*  71  148:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  72  151:iadd            
	//*  73  152:icmpge          206
		{
			updateop1.itemCount = updateop1.itemCount - 1;
	//   74  155:aload           5
	//   75  157:aload           5
	//   76  159:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//   77  162:iconst_1        
	//   78  163:isub            
	//   79  164:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
			updateop.cmd = 2;
	//   80  167:aload_3         
	//   81  168:iconst_2        
	//   82  169:putfield        #35  <Field int AdapterHelper$UpdateOp.cmd>
			updateop.itemCount = 1;
	//   83  172:aload_3         
	//   84  173:iconst_1        
	//   85  174:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
			if(updateop1.itemCount == 0)
	//*  86  177:aload           5
	//*  87  179:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  88  182:ifne            205
			{
				list.remove(j);
	//   89  185:aload_1         
	//   90  186:iload           4
	//   91  188:invokeinterface #71  <Method Object List.remove(int)>
	//   92  193:pop             
				mCallback.recycleUpdateOp(updateop1);
	//   93  194:aload_0         
	//   94  195:getfield        #16  <Field OpReorderer$Callback mCallback>
	//   95  198:aload           5
	//   96  200:invokeinterface #75  <Method void OpReorderer$Callback.recycleUpdateOp(AdapterHelper$UpdateOp)>
			}
			return;
	//   97  205:return          
		}
		l = updateop.positionStart;
	//   98  206:aload_3         
	//   99  207:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  100  210:istore          8
		int j1 = updateop1.positionStart;
	//  101  212:aload           5
	//  102  214:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  103  217:istore          9
		AdapterHelper.UpdateOp updateop2 = null;
	//  104  219:aconst_null     
	//  105  220:astore          11
		if(l <= j1)
	//* 106  222:iload           8
	//* 107  224:iload           9
	//* 108  226:icmpgt          244
			updateop1.positionStart = updateop1.positionStart + 1;
	//  109  229:aload           5
	//  110  231:aload           5
	//  111  233:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  112  236:iconst_1        
	//  113  237:iadd            
	//  114  238:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
		else
	//* 115  241:goto            324
		if(updateop.positionStart < updateop1.positionStart + updateop1.itemCount)
	//* 116  244:aload_3         
	//* 117  245:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 118  248:aload           5
	//* 119  250:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 120  253:aload           5
	//* 121  255:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 122  258:iadd            
	//* 123  259:icmpge          324
		{
			int i1 = updateop1.positionStart;
	//  124  262:aload           5
	//  125  264:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  126  267:istore          8
			int k1 = updateop1.itemCount;
	//  127  269:aload           5
	//  128  271:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  129  274:istore          9
			int l1 = updateop.positionStart;
	//  130  276:aload_3         
	//  131  277:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  132  280:istore          10
			updateop2 = mCallback.obtainUpdateOp(2, updateop.positionStart + 1, (i1 + k1) - l1, ((Object) (null)));
	//  133  282:aload_0         
	//  134  283:getfield        #16  <Field OpReorderer$Callback mCallback>
	//  135  286:iconst_2        
	//  136  287:aload_3         
	//  137  288:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  138  291:iconst_1        
	//  139  292:iadd            
	//  140  293:iload           8
	//  141  295:iload           9
	//  142  297:iadd            
	//  143  298:iload           10
	//  144  300:isub            
	//  145  301:aconst_null     
	//  146  302:invokeinterface #79  <Method AdapterHelper$UpdateOp OpReorderer$Callback.obtainUpdateOp(int, int, int, Object)>
	//  147  307:astore          11
			updateop1.itemCount = updateop.positionStart - updateop1.positionStart;
	//  148  309:aload           5
	//  149  311:aload_3         
	//  150  312:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  151  315:aload           5
	//  152  317:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  153  320:isub            
	//  154  321:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
		}
		if(flag1)
	//* 155  324:iload           7
	//* 156  326:ifeq            359
		{
			list.set(i, ((Object) (updateop1)));
	//  157  329:aload_1         
	//  158  330:iload_2         
	//  159  331:aload           5
	//  160  333:invokeinterface #49  <Method Object List.set(int, Object)>
	//  161  338:pop             
			list.remove(j);
	//  162  339:aload_1         
	//  163  340:iload           4
	//  164  342:invokeinterface #71  <Method Object List.remove(int)>
	//  165  347:pop             
			mCallback.recycleUpdateOp(updateop);
	//  166  348:aload_0         
	//  167  349:getfield        #16  <Field OpReorderer$Callback mCallback>
	//  168  352:aload_3         
	//  169  353:invokeinterface #75  <Method void OpReorderer$Callback.recycleUpdateOp(AdapterHelper$UpdateOp)>
			return;
	//  170  358:return          
		}
		if(flag)
	//* 171  359:iload           6
	//* 172  361:ifeq            476
		{
			if(updateop2 != null)
	//* 173  364:aload           11
	//* 174  366:ifnull          421
			{
				if(updateop.positionStart > updateop2.positionStart)
	//* 175  369:aload_3         
	//* 176  370:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 177  373:aload           11
	//* 178  375:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 179  378:icmple          395
					updateop.positionStart = updateop.positionStart - updateop2.itemCount;
	//  180  381:aload_3         
	//  181  382:aload_3         
	//  182  383:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  183  386:aload           11
	//  184  388:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  185  391:isub            
	//  186  392:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
				if(updateop.itemCount > updateop2.positionStart)
	//* 187  395:aload_3         
	//* 188  396:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 189  399:aload           11
	//* 190  401:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 191  404:icmple          421
					updateop.itemCount = updateop.itemCount - updateop2.itemCount;
	//  192  407:aload_3         
	//  193  408:aload_3         
	//  194  409:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  195  412:aload           11
	//  196  414:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  197  417:isub            
	//  198  418:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
			}
			if(updateop.positionStart > updateop1.positionStart)
	//* 199  421:aload_3         
	//* 200  422:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 201  425:aload           5
	//* 202  427:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 203  430:icmple          447
				updateop.positionStart = updateop.positionStart - updateop1.itemCount;
	//  204  433:aload_3         
	//  205  434:aload_3         
	//  206  435:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  207  438:aload           5
	//  208  440:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  209  443:isub            
	//  210  444:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
			if(updateop.itemCount > updateop1.positionStart)
	//* 211  447:aload_3         
	//* 212  448:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 213  451:aload           5
	//* 214  453:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 215  456:icmple          585
				updateop.itemCount = updateop.itemCount - updateop1.itemCount;
	//  216  459:aload_3         
	//  217  460:aload_3         
	//  218  461:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  219  464:aload           5
	//  220  466:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  221  469:isub            
	//  222  470:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
		} else
	//* 223  473:goto            585
		{
			if(updateop2 != null)
	//* 224  476:aload           11
	//* 225  478:ifnull          533
			{
				if(updateop.positionStart >= updateop2.positionStart)
	//* 226  481:aload_3         
	//* 227  482:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 228  485:aload           11
	//* 229  487:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 230  490:icmplt          507
					updateop.positionStart = updateop.positionStart - updateop2.itemCount;
	//  231  493:aload_3         
	//  232  494:aload_3         
	//  233  495:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  234  498:aload           11
	//  235  500:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  236  503:isub            
	//  237  504:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
				if(updateop.itemCount >= updateop2.positionStart)
	//* 238  507:aload_3         
	//* 239  508:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 240  511:aload           11
	//* 241  513:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 242  516:icmplt          533
					updateop.itemCount = updateop.itemCount - updateop2.itemCount;
	//  243  519:aload_3         
	//  244  520:aload_3         
	//  245  521:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  246  524:aload           11
	//  247  526:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  248  529:isub            
	//  249  530:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
			}
			if(updateop.positionStart >= updateop1.positionStart)
	//* 250  533:aload_3         
	//* 251  534:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 252  537:aload           5
	//* 253  539:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 254  542:icmplt          559
				updateop.positionStart = updateop.positionStart - updateop1.itemCount;
	//  255  545:aload_3         
	//  256  546:aload_3         
	//  257  547:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  258  550:aload           5
	//  259  552:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  260  555:isub            
	//  261  556:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
			if(updateop.itemCount >= updateop1.positionStart)
	//* 262  559:aload_3         
	//* 263  560:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 264  563:aload           5
	//* 265  565:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 266  568:icmplt          585
				updateop.itemCount = updateop.itemCount - updateop1.itemCount;
	//  267  571:aload_3         
	//  268  572:aload_3         
	//  269  573:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  270  576:aload           5
	//  271  578:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  272  581:isub            
	//  273  582:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
		}
		list.set(i, ((Object) (updateop1)));
	//  274  585:aload_1         
	//  275  586:iload_2         
	//  276  587:aload           5
	//  277  589:invokeinterface #49  <Method Object List.set(int, Object)>
	//  278  594:pop             
		if(updateop.positionStart != updateop.itemCount)
	//* 279  595:aload_3         
	//* 280  596:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 281  599:aload_3         
	//* 282  600:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 283  603:icmpeq          619
			list.set(j, ((Object) (updateop)));
	//  284  606:aload_1         
	//  285  607:iload           4
	//  286  609:aload_3         
	//  287  610:invokeinterface #49  <Method Object List.set(int, Object)>
	//  288  615:pop             
		else
	//* 289  616:goto            628
			list.remove(j);
	//  290  619:aload_1         
	//  291  620:iload           4
	//  292  622:invokeinterface #71  <Method Object List.remove(int)>
	//  293  627:pop             
		if(updateop2 != null)
	//* 294  628:aload           11
	//* 295  630:ifnull          642
			list.add(i, ((Object) (updateop2)));
	//  296  633:aload_1         
	//  297  634:iload_2         
	//  298  635:aload           11
	//  299  637:invokeinterface #83  <Method void List.add(int, Object)>
	//  300  642:return          
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
