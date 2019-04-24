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
	//	               3 60
	//	               4 85
		case 3: // '\003'
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
			break;
		}
	//   37   96:return          
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
		boolean flag1;
		AdapterHelper.UpdateOp updateop2;
		updateop2 = null;
	//    0    0:aconst_null     
	//    1    1:astore          11
		boolean flag2 = false;
	//    2    3:iconst_0        
	//    3    4:istore          8
		boolean flag;
		if(updateop.positionStart < updateop.itemCount)
	//*   4    6:aload_3         
	//*   5    7:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*   6   10:aload_3         
	//*   7   11:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*   8   14:icmpge          155
		{
			boolean flag3 = false;
	//    9   17:iconst_0        
	//   10   18:istore          9
			flag1 = flag3;
	//   11   20:iload           9
	//   12   22:istore          7
			flag = flag2;
	//   13   24:iload           8
	//   14   26:istore          6
			if(updateop1.positionStart == updateop.positionStart)
	//*  15   28:aload           5
	//*  16   30:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  17   33:aload_3         
	//*  18   34:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  19   37:icmpne          72
			{
				flag1 = flag3;
	//   20   40:iload           9
	//   21   42:istore          7
				flag = flag2;
	//   22   44:iload           8
	//   23   46:istore          6
				if(updateop1.itemCount == updateop.itemCount - updateop.positionStart)
	//*  24   48:aload           5
	//*  25   50:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  26   53:aload_3         
	//*  27   54:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  28   57:aload_3         
	//*  29   58:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  30   61:isub            
	//*  31   62:icmpne          72
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
	//*  36   72:aload_3         
	//*  37   73:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  38   76:aload           5
	//*  39   78:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  40   81:icmpge          215
	//*  41   84:aload           5
	//*  42   86:aload           5
	//*  43   88:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  44   91:iconst_1        
	//*  45   92:isub            
	//*  46   93:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  47   96:aload_3         
	//*  48   97:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  49  100:aload           5
	//*  50  102:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  51  105:icmpgt          284
	//*  52  108:aload           5
	//*  53  110:aload           5
	//*  54  112:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  55  115:iconst_1        
	//*  56  116:iadd            
	//*  57  117:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  58  120:iload           6
	//*  59  122:ifeq            367
	//*  60  125:aload_1         
	//*  61  126:iload_2         
	//*  62  127:aload           5
	//*  63  129:invokeinterface #49  <Method Object List.set(int, Object)>
	//*  64  134:pop             
	//*  65  135:aload_1         
	//*  66  136:iload           4
	//*  67  138:invokeinterface #71  <Method Object List.remove(int)>
	//*  68  143:pop             
	//*  69  144:aload_0         
	//*  70  145:getfield        #16  <Field OpReorderer$Callback mCallback>
	//*  71  148:aload_3         
	//*  72  149:invokeinterface #75  <Method void OpReorderer$Callback.recycleUpdateOp(AdapterHelper$UpdateOp)>
	//*  73  154:return          
		{
			boolean flag4 = true;
	//   74  155:iconst_1        
	//   75  156:istore          9
			flag1 = flag4;
	//   76  158:iload           9
	//   77  160:istore          7
			flag = flag2;
	//   78  162:iload           8
	//   79  164:istore          6
			if(updateop1.positionStart == updateop.itemCount + 1)
	//*  80  166:aload           5
	//*  81  168:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  82  171:aload_3         
	//*  83  172:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  84  175:iconst_1        
	//*  85  176:iadd            
	//*  86  177:icmpne          72
			{
				flag1 = flag4;
	//   87  180:iload           9
	//   88  182:istore          7
				flag = flag2;
	//   89  184:iload           8
	//   90  186:istore          6
				if(updateop1.itemCount == updateop.positionStart - updateop.itemCount)
	//*  91  188:aload           5
	//*  92  190:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  93  193:aload_3         
	//*  94  194:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  95  197:aload_3         
	//*  96  198:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  97  201:isub            
	//*  98  202:icmpne          72
				{
					flag = true;
	//   99  205:iconst_1        
	//  100  206:istore          6
					flag1 = flag4;
	//  101  208:iload           9
	//  102  210:istore          7
				}
			}
		}
		if(updateop.itemCount >= updateop1.positionStart) goto _L2; else goto _L1
_L1:
		updateop1.positionStart = updateop1.positionStart - 1;
_L4:
		if(updateop.positionStart <= updateop1.positionStart)
			updateop1.positionStart = updateop1.positionStart + 1;
		else
	//* 103  212:goto            72
	//* 104  215:aload_3         
	//* 105  216:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 106  219:aload           5
	//* 107  221:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 108  224:aload           5
	//* 109  226:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 110  229:iadd            
	//* 111  230:icmpge          96
	//* 112  233:aload           5
	//* 113  235:aload           5
	//* 114  237:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 115  240:iconst_1        
	//* 116  241:isub            
	//* 117  242:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 118  245:aload_3         
	//* 119  246:iconst_2        
	//* 120  247:putfield        #35  <Field int AdapterHelper$UpdateOp.cmd>
	//* 121  250:aload_3         
	//* 122  251:iconst_1        
	//* 123  252:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 124  255:aload           5
	//* 125  257:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 126  260:ifne            154
	//* 127  263:aload_1         
	//* 128  264:iload           4
	//* 129  266:invokeinterface #71  <Method Object List.remove(int)>
	//* 130  271:pop             
	//* 131  272:aload_0         
	//* 132  273:getfield        #16  <Field OpReorderer$Callback mCallback>
	//* 133  276:aload           5
	//* 134  278:invokeinterface #75  <Method void OpReorderer$Callback.recycleUpdateOp(AdapterHelper$UpdateOp)>
	//* 135  283:return          
		if(updateop.positionStart < updateop1.positionStart + updateop1.itemCount)
	//* 136  284:aload_3         
	//* 137  285:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 138  288:aload           5
	//* 139  290:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 140  293:aload           5
	//* 141  295:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 142  298:iadd            
	//* 143  299:icmpge          120
		{
			int k = updateop1.positionStart;
	//  144  302:aload           5
	//  145  304:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  146  307:istore          8
			int l = updateop1.itemCount;
	//  147  309:aload           5
	//  148  311:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  149  314:istore          9
			int i1 = updateop.positionStart;
	//  150  316:aload_3         
	//  151  317:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  152  320:istore          10
			updateop2 = mCallback.obtainUpdateOp(2, updateop.positionStart + 1, (k + l) - i1, ((Object) (null)));
	//  153  322:aload_0         
	//  154  323:getfield        #16  <Field OpReorderer$Callback mCallback>
	//  155  326:iconst_2        
	//  156  327:aload_3         
	//  157  328:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  158  331:iconst_1        
	//  159  332:iadd            
	//  160  333:iload           8
	//  161  335:iload           9
	//  162  337:iadd            
	//  163  338:iload           10
	//  164  340:isub            
	//  165  341:aconst_null     
	//  166  342:invokeinterface #79  <Method AdapterHelper$UpdateOp OpReorderer$Callback.obtainUpdateOp(int, int, int, Object)>
	//  167  347:astore          11
			updateop1.itemCount = updateop.positionStart - updateop1.positionStart;
	//  168  349:aload           5
	//  169  351:aload_3         
	//  170  352:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  171  355:aload           5
	//  172  357:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  173  360:isub            
	//  174  361:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
		}
		if(flag)
		{
			list.set(i, ((Object) (updateop1)));
			list.remove(j);
			mCallback.recycleUpdateOp(updateop);
		} else
	//* 175  364:goto            120
		{
			if(flag1)
	//* 176  367:iload           7
	//* 177  369:ifeq            527
			{
				if(updateop2 != null)
	//* 178  372:aload           11
	//* 179  374:ifnull          429
				{
					if(updateop.positionStart > updateop2.positionStart)
	//* 180  377:aload_3         
	//* 181  378:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 182  381:aload           11
	//* 183  383:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 184  386:icmple          403
						updateop.positionStart = updateop.positionStart - updateop2.itemCount;
	//  185  389:aload_3         
	//  186  390:aload_3         
	//  187  391:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  188  394:aload           11
	//  189  396:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  190  399:isub            
	//  191  400:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
					if(updateop.itemCount > updateop2.positionStart)
	//* 192  403:aload_3         
	//* 193  404:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 194  407:aload           11
	//* 195  409:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 196  412:icmple          429
						updateop.itemCount = updateop.itemCount - updateop2.itemCount;
	//  197  415:aload_3         
	//  198  416:aload_3         
	//  199  417:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  200  420:aload           11
	//  201  422:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  202  425:isub            
	//  203  426:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
				}
				if(updateop.positionStart > updateop1.positionStart)
	//* 204  429:aload_3         
	//* 205  430:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 206  433:aload           5
	//* 207  435:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 208  438:icmple          455
					updateop.positionStart = updateop.positionStart - updateop1.itemCount;
	//  209  441:aload_3         
	//  210  442:aload_3         
	//  211  443:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  212  446:aload           5
	//  213  448:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  214  451:isub            
	//  215  452:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
				if(updateop.itemCount > updateop1.positionStart)
	//* 216  455:aload_3         
	//* 217  456:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 218  459:aload           5
	//* 219  461:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 220  464:icmple          481
					updateop.itemCount = updateop.itemCount - updateop1.itemCount;
	//  221  467:aload_3         
	//  222  468:aload_3         
	//  223  469:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  224  472:aload           5
	//  225  474:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  226  477:isub            
	//  227  478:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
			} else
	//* 228  481:aload_1         
	//* 229  482:iload_2         
	//* 230  483:aload           5
	//* 231  485:invokeinterface #49  <Method Object List.set(int, Object)>
	//* 232  490:pop             
	//* 233  491:aload_3         
	//* 234  492:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 235  495:aload_3         
	//* 236  496:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 237  499:icmpeq          639
	//* 238  502:aload_1         
	//* 239  503:iload           4
	//* 240  505:aload_3         
	//* 241  506:invokeinterface #49  <Method Object List.set(int, Object)>
	//* 242  511:pop             
	//* 243  512:aload           11
	//* 244  514:ifnull          154
	//* 245  517:aload_1         
	//* 246  518:iload_2         
	//* 247  519:aload           11
	//* 248  521:invokeinterface #83  <Method void List.add(int, Object)>
	//* 249  526:return          
			{
				if(updateop2 != null)
	//* 250  527:aload           11
	//* 251  529:ifnull          584
				{
					if(updateop.positionStart >= updateop2.positionStart)
	//* 252  532:aload_3         
	//* 253  533:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 254  536:aload           11
	//* 255  538:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 256  541:icmplt          558
						updateop.positionStart = updateop.positionStart - updateop2.itemCount;
	//  257  544:aload_3         
	//  258  545:aload_3         
	//  259  546:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  260  549:aload           11
	//  261  551:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  262  554:isub            
	//  263  555:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
					if(updateop.itemCount >= updateop2.positionStart)
	//* 264  558:aload_3         
	//* 265  559:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 266  562:aload           11
	//* 267  564:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 268  567:icmplt          584
						updateop.itemCount = updateop.itemCount - updateop2.itemCount;
	//  269  570:aload_3         
	//  270  571:aload_3         
	//  271  572:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  272  575:aload           11
	//  273  577:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  274  580:isub            
	//  275  581:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
				}
				if(updateop.positionStart >= updateop1.positionStart)
	//* 276  584:aload_3         
	//* 277  585:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 278  588:aload           5
	//* 279  590:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 280  593:icmplt          610
					updateop.positionStart = updateop.positionStart - updateop1.itemCount;
	//  281  596:aload_3         
	//  282  597:aload_3         
	//  283  598:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//  284  601:aload           5
	//  285  603:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  286  606:isub            
	//  287  607:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
				if(updateop.itemCount >= updateop1.positionStart)
	//* 288  610:aload_3         
	//* 289  611:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 290  614:aload           5
	//* 291  616:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 292  619:icmplt          481
					updateop.itemCount = updateop.itemCount - updateop1.itemCount;
	//  293  622:aload_3         
	//  294  623:aload_3         
	//  295  624:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  296  627:aload           5
	//  297  629:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  298  632:isub            
	//  299  633:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
			}
			list.set(i, ((Object) (updateop1)));
			if(updateop.positionStart != updateop.itemCount)
				list.set(j, ((Object) (updateop)));
			else
	//* 300  636:goto            481
				list.remove(j);
	//  301  639:aload_1         
	//  302  640:iload           4
	//  303  642:invokeinterface #71  <Method Object List.remove(int)>
	//  304  647:pop             
			if(updateop2 != null)
			{
				list.add(i, ((Object) (updateop2)));
				return;
			}
		}
_L5:
		return;
_L2:
		if(updateop.itemCount >= updateop1.positionStart + updateop1.itemCount) goto _L4; else goto _L3
_L3:
		updateop1.itemCount = updateop1.itemCount - 1;
		updateop.cmd = 2;
		updateop.itemCount = 1;
		if(updateop1.itemCount == 0)
		{
			list.remove(j);
			mCallback.recycleUpdateOp(updateop1);
			return;
		}
		  goto _L5
	//* 305  648:goto            512
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
	//*   8   15:icmpge          111
			updateop1.positionStart = updateop1.positionStart - 1;
	//    9   18:aload           5
	//   10   20:aload           5
	//   11   22:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//   12   25:iconst_1        
	//   13   26:isub            
	//   14   27:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
		else
	//*  15   30:aload_3         
	//*  16   31:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  17   34:aload           5
	//*  18   36:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  19   39:icmpgt          166
	//*  20   42:aload           5
	//*  21   44:aload           5
	//*  22   46:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  23   49:iconst_1        
	//*  24   50:iadd            
	//*  25   51:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  26   54:aload_1         
	//*  27   55:iload           4
	//*  28   57:aload_3         
	//*  29   58:invokeinterface #49  <Method Object List.set(int, Object)>
	//*  30   63:pop             
	//*  31   64:aload           5
	//*  32   66:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  33   69:ifle            243
	//*  34   72:aload_1         
	//*  35   73:iload_2         
	//*  36   74:aload           5
	//*  37   76:invokeinterface #49  <Method Object List.set(int, Object)>
	//*  38   81:pop             
	//*  39   82:aload           7
	//*  40   84:ifnull          96
	//*  41   87:aload_1         
	//*  42   88:iload_2         
	//*  43   89:aload           7
	//*  44   91:invokeinterface #83  <Method void List.add(int, Object)>
	//*  45   96:aload           8
	//*  46   98:ifnull          110
	//*  47  101:aload_1         
	//*  48  102:iload_2         
	//*  49  103:aload           8
	//*  50  105:invokeinterface #83  <Method void List.add(int, Object)>
	//*  51  110:return          
		if(updateop.itemCount < updateop1.positionStart + updateop1.itemCount)
	//*  52  111:aload_3         
	//*  53  112:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  54  115:aload           5
	//*  55  117:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  56  120:aload           5
	//*  57  122:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  58  125:iadd            
	//*  59  126:icmpge          30
		{
			updateop1.itemCount = updateop1.itemCount - 1;
	//   60  129:aload           5
	//   61  131:aload           5
	//   62  133:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//   63  136:iconst_1        
	//   64  137:isub            
	//   65  138:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
			updateop2 = mCallback.obtainUpdateOp(4, updateop.positionStart, 1, updateop1.payload);
	//   66  141:aload_0         
	//   67  142:getfield        #16  <Field OpReorderer$Callback mCallback>
	//   68  145:iconst_4        
	//   69  146:aload_3         
	//   70  147:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//   71  150:iconst_1        
	//   72  151:aload           5
	//   73  153:getfield        #87  <Field Object AdapterHelper$UpdateOp.payload>
	//   74  156:invokeinterface #79  <Method AdapterHelper$UpdateOp OpReorderer$Callback.obtainUpdateOp(int, int, int, Object)>
	//   75  161:astore          7
		}
		if(updateop.positionStart <= updateop1.positionStart)
			updateop1.positionStart = updateop1.positionStart + 1;
		else
	//*  76  163:goto            30
		if(updateop.positionStart < updateop1.positionStart + updateop1.itemCount)
	//*  77  166:aload_3         
	//*  78  167:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  79  170:aload           5
	//*  80  172:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  81  175:aload           5
	//*  82  177:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  83  180:iadd            
	//*  84  181:icmpge          54
		{
			int k = (updateop1.positionStart + updateop1.itemCount) - updateop.positionStart;
	//   85  184:aload           5
	//   86  186:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//   87  189:aload           5
	//   88  191:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//   89  194:iadd            
	//   90  195:aload_3         
	//   91  196:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//   92  199:isub            
	//   93  200:istore          6
			updateop3 = mCallback.obtainUpdateOp(4, updateop.positionStart + 1, k, updateop1.payload);
	//   94  202:aload_0         
	//   95  203:getfield        #16  <Field OpReorderer$Callback mCallback>
	//   96  206:iconst_4        
	//   97  207:aload_3         
	//   98  208:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//   99  211:iconst_1        
	//  100  212:iadd            
	//  101  213:iload           6
	//  102  215:aload           5
	//  103  217:getfield        #87  <Field Object AdapterHelper$UpdateOp.payload>
	//  104  220:invokeinterface #79  <Method AdapterHelper$UpdateOp OpReorderer$Callback.obtainUpdateOp(int, int, int, Object)>
	//  105  225:astore          8
			updateop1.itemCount = updateop1.itemCount - k;
	//  106  227:aload           5
	//  107  229:aload           5
	//  108  231:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//  109  234:iload           6
	//  110  236:isub            
	//  111  237:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
		}
		list.set(j, ((Object) (updateop)));
		if(updateop1.itemCount > 0)
		{
			list.set(i, ((Object) (updateop1)));
		} else
	//* 112  240:goto            54
		{
			list.remove(i);
	//  113  243:aload_1         
	//  114  244:iload_2         
	//  115  245:invokeinterface #71  <Method Object List.remove(int)>
	//  116  250:pop             
			mCallback.recycleUpdateOp(updateop1);
	//  117  251:aload_0         
	//  118  252:getfield        #16  <Field OpReorderer$Callback mCallback>
	//  119  255:aload           5
	//  120  257:invokeinterface #75  <Method void OpReorderer$Callback.recycleUpdateOp(AdapterHelper$UpdateOp)>
		}
		if(updateop2 != null)
			list.add(i, ((Object) (updateop2)));
		if(updateop3 != null)
			list.add(i, ((Object) (updateop3)));
	//* 121  262:goto            82
	}

	final Callback mCallback;
}
