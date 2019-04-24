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
	//    1    1:istore_2        
		for(int i = list.size() - 1; i >= 0; i--)
	//*   2    2:aload_1         
	//*   3    3:invokeinterface #25  <Method int List.size()>
	//*   4    8:iconst_1        
	//*   5    9:isub            
	//*   6   10:istore_3        
	//*   7   11:iload_3         
	//*   8   12:iflt            48
			if(((AdapterHelper.UpdateOp)list.get(i)).cmd == 8)
	//*   9   15:aload_1         
	//*  10   16:iload_3         
	//*  11   17:invokeinterface #29  <Method Object List.get(int)>
	//*  12   22:checkcast       #31  <Class AdapterHelper$UpdateOp>
	//*  13   25:getfield        #35  <Field int AdapterHelper$UpdateOp.cmd>
	//*  14   28:bipush          8
	//*  15   30:icmpne          39
			{
				if(flag)
	//*  16   33:iload_2         
	//*  17   34:ifeq            50
					return i;
	//   18   37:iload_3         
	//   19   38:ireturn         
			} else
			{
				flag = true;
	//   20   39:iconst_1        
	//   21   40:istore_2        
			}

	//   22   41:iload_3         
	//   23   42:iconst_1        
	//   24   43:isub            
	//   25   44:istore_3        
	//*  26   45:goto            11
		return -1;
	//   27   48:iconst_m1       
	//   28   49:ireturn         
	//*  29   50:goto            41
	}

	private void swapMoveAdd(List list, int i, AdapterHelper.UpdateOp updateop, int j, AdapterHelper.UpdateOp updateop1)
	{
		byte byte0 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          6
		if(updateop.itemCount < updateop1.positionStart)
	//*   2    3:aload_3         
	//*   3    4:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*   4    7:aload           5
	//*   5    9:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*   6   12:icmpge          18
			byte0 = -1;
	//    7   15:iconst_m1       
	//    8   16:istore          6
		int k = ((int) (byte0));
	//    9   18:iload           6
	//   10   20:istore          7
		if(updateop.positionStart < updateop1.positionStart)
	//*  11   22:aload_3         
	//*  12   23:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  13   26:aload           5
	//*  14   28:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  15   31:icmpge          40
			k = byte0 + 1;
	//   16   34:iload           6
	//   17   36:iconst_1        
	//   18   37:iadd            
	//   19   38:istore          7
		if(updateop1.positionStart <= updateop.positionStart)
	//*  20   40:aload           5
	//*  21   42:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  22   45:aload_3         
	//*  23   46:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  24   49:icmpgt          66
			updateop.positionStart = updateop.positionStart + updateop1.itemCount;
	//   25   52:aload_3         
	//   26   53:aload_3         
	//   27   54:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//   28   57:aload           5
	//   29   59:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//   30   62:iadd            
	//   31   63:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
		if(updateop1.positionStart <= updateop.itemCount)
	//*  32   66:aload           5
	//*  33   68:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  34   71:aload_3         
	//*  35   72:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  36   75:icmpgt          92
			updateop.itemCount = updateop.itemCount + updateop1.itemCount;
	//   37   78:aload_3         
	//   38   79:aload_3         
	//   39   80:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//   40   83:aload           5
	//   41   85:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//   42   88:iadd            
	//   43   89:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
		updateop1.positionStart = k + updateop1.positionStart;
	//   44   92:aload           5
	//   45   94:iload           7
	//   46   96:aload           5
	//   47   98:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//   48  101:iadd            
	//   49  102:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
		list.set(i, ((Object) (updateop1)));
	//   50  105:aload_1         
	//   51  106:iload_2         
	//   52  107:aload           5
	//   53  109:invokeinterface #49  <Method Object List.set(int, Object)>
	//   54  114:pop             
		list.set(j, ((Object) (updateop)));
	//   55  115:aload_1         
	//   56  116:iload           4
	//   57  118:aload_3         
	//   58  119:invokeinterface #49  <Method Object List.set(int, Object)>
	//   59  124:pop             
	//   60  125:return          
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
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
		boolean flag;
		int k;
		int l;
		int i1;
		AdapterHelper.UpdateOp updateop2;
		if(updateop.positionStart < updateop.itemCount)
	//*   2    3:aload_3         
	//*   3    4:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*   4    7:aload_3         
	//*   5    8:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*   6   11:icmpge          132
		{
			if(updateop1.positionStart == updateop.positionStart && updateop1.itemCount == updateop.itemCount - updateop.positionStart)
	//*   7   14:aload           5
	//*   8   16:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*   9   19:aload_3         
	//*  10   20:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  11   23:icmpne          623
	//*  12   26:aload           5
	//*  13   28:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  14   31:aload_3         
	//*  15   32:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  16   35:aload_3         
	//*  17   36:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  18   39:isub            
	//*  19   40:icmpne          623
				flag = true;
	//   20   43:iconst_1        
	//   21   44:istore          6
			else
	//*  22   46:aload_3         
	//*  23   47:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  24   50:aload           5
	//*  25   52:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  26   55:icmpge          172
	//*  27   58:aload           5
	//*  28   60:aload           5
	//*  29   62:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  30   65:iconst_1        
	//*  31   66:isub            
	//*  32   67:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  33   70:aload_3         
	//*  34   71:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  35   74:aload           5
	//*  36   76:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  37   79:icmpgt          241
	//*  38   82:aload           5
	//*  39   84:aload           5
	//*  40   86:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  41   89:iconst_1        
	//*  42   90:iadd            
	//*  43   91:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  44   94:aconst_null     
	//*  45   95:astore          11
	//*  46   97:iload           6
	//*  47   99:ifeq            324
	//*  48  102:aload_1         
	//*  49  103:iload_2         
	//*  50  104:aload           5
	//*  51  106:invokeinterface #49  <Method Object List.set(int, Object)>
	//*  52  111:pop             
	//*  53  112:aload_1         
	//*  54  113:iload           4
	//*  55  115:invokeinterface #71  <Method Object List.remove(int)>
	//*  56  120:pop             
	//*  57  121:aload_0         
	//*  58  122:getfield        #16  <Field OpReorderer$Callback mCallback>
	//*  59  125:aload_3         
	//*  60  126:invokeinterface #75  <Method void OpReorderer$Callback.recycleUpdateOp(AdapterHelper$UpdateOp)>
	//*  61  131:return          
	//*  62  132:aload           5
	//*  63  134:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  64  137:aload_3         
	//*  65  138:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  66  141:iconst_1        
	//*  67  142:iadd            
	//*  68  143:icmpne          614
	//*  69  146:aload           5
	//*  70  148:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  71  151:aload_3         
	//*  72  152:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  73  155:aload_3         
	//*  74  156:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  75  159:isub            
	//*  76  160:icmpne          614
	//*  77  163:iconst_1        
	//*  78  164:istore          7
	//*  79  166:iconst_1        
	//*  80  167:istore          6
	//*  81  169:goto            46
	//*  82  172:aload_3         
	//*  83  173:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  84  176:aload           5
	//*  85  178:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  86  181:aload           5
	//*  87  183:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  88  186:iadd            
	//*  89  187:icmpge          70
	//*  90  190:aload           5
	//*  91  192:aload           5
	//*  92  194:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  93  197:iconst_1        
	//*  94  198:isub            
	//*  95  199:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  96  202:aload_3         
	//*  97  203:iconst_2        
	//*  98  204:putfield        #35  <Field int AdapterHelper$UpdateOp.cmd>
	//*  99  207:aload_3         
	//* 100  208:iconst_1        
	//* 101  209:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 102  212:aload           5
	//* 103  214:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 104  217:ifne            131
	//* 105  220:aload_1         
	//* 106  221:iload           4
	//* 107  223:invokeinterface #71  <Method Object List.remove(int)>
	//* 108  228:pop             
	//* 109  229:aload_0         
	//* 110  230:getfield        #16  <Field OpReorderer$Callback mCallback>
	//* 111  233:aload           5
	//* 112  235:invokeinterface #75  <Method void OpReorderer$Callback.recycleUpdateOp(AdapterHelper$UpdateOp)>
	//* 113  240:return          
	//* 114  241:aload_3         
	//* 115  242:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 116  245:aload           5
	//* 117  247:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 118  250:aload           5
	//* 119  252:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 120  255:iadd            
	//* 121  256:icmpge          608
	//* 122  259:aload           5
	//* 123  261:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 124  264:istore          8
	//* 125  266:aload           5
	//* 126  268:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 127  271:istore          9
	//* 128  273:aload_3         
	//* 129  274:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 130  277:istore          10
	//* 131  279:aload_0         
	//* 132  280:getfield        #16  <Field OpReorderer$Callback mCallback>
	//* 133  283:iconst_2        
	//* 134  284:aload_3         
	//* 135  285:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 136  288:iconst_1        
	//* 137  289:iadd            
	//* 138  290:iload           8
	//* 139  292:iload           9
	//* 140  294:iadd            
	//* 141  295:iload           10
	//* 142  297:isub            
	//* 143  298:aconst_null     
	//* 144  299:invokeinterface #79  <Method AdapterHelper$UpdateOp OpReorderer$Callback.obtainUpdateOp(int, int, int, Object)>
	//* 145  304:astore          11
	//* 146  306:aload           5
	//* 147  308:aload_3         
	//* 148  309:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 149  312:aload           5
	//* 150  314:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 151  317:isub            
	//* 152  318:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 153  321:goto            97
	//* 154  324:iload           7
	//* 155  326:ifeq            484
	//* 156  329:aload           11
	//* 157  331:ifnull          386
	//* 158  334:aload_3         
	//* 159  335:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 160  338:aload           11
	//* 161  340:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 162  343:icmple          360
	//* 163  346:aload_3         
	//* 164  347:aload_3         
	//* 165  348:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 166  351:aload           11
	//* 167  353:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 168  356:isub            
	//* 169  357:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 170  360:aload_3         
	//* 171  361:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 172  364:aload           11
	//* 173  366:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 174  369:icmple          386
	//* 175  372:aload_3         
	//* 176  373:aload_3         
	//* 177  374:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 178  377:aload           11
	//* 179  379:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 180  382:isub            
	//* 181  383:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 182  386:aload_3         
	//* 183  387:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 184  390:aload           5
	//* 185  392:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 186  395:icmple          412
	//* 187  398:aload_3         
	//* 188  399:aload_3         
	//* 189  400:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 190  403:aload           5
	//* 191  405:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 192  408:isub            
	//* 193  409:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 194  412:aload_3         
	//* 195  413:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 196  416:aload           5
	//* 197  418:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 198  421:icmple          438
	//* 199  424:aload_3         
	//* 200  425:aload_3         
	//* 201  426:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 202  429:aload           5
	//* 203  431:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 204  434:isub            
	//* 205  435:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 206  438:aload_1         
	//* 207  439:iload_2         
	//* 208  440:aload           5
	//* 209  442:invokeinterface #49  <Method Object List.set(int, Object)>
	//* 210  447:pop             
	//* 211  448:aload_3         
	//* 212  449:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 213  452:aload_3         
	//* 214  453:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 215  456:icmpeq          596
	//* 216  459:aload_1         
	//* 217  460:iload           4
	//* 218  462:aload_3         
	//* 219  463:invokeinterface #49  <Method Object List.set(int, Object)>
	//* 220  468:pop             
	//* 221  469:aload           11
	//* 222  471:ifnull          131
	//* 223  474:aload_1         
	//* 224  475:iload_2         
	//* 225  476:aload           11
	//* 226  478:invokeinterface #83  <Method void List.add(int, Object)>
	//* 227  483:return          
	//* 228  484:aload           11
	//* 229  486:ifnull          541
	//* 230  489:aload_3         
	//* 231  490:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 232  493:aload           11
	//* 233  495:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 234  498:icmplt          515
	//* 235  501:aload_3         
	//* 236  502:aload_3         
	//* 237  503:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 238  506:aload           11
	//* 239  508:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 240  511:isub            
	//* 241  512:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 242  515:aload_3         
	//* 243  516:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 244  519:aload           11
	//* 245  521:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 246  524:icmplt          541
	//* 247  527:aload_3         
	//* 248  528:aload_3         
	//* 249  529:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 250  532:aload           11
	//* 251  534:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 252  537:isub            
	//* 253  538:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 254  541:aload_3         
	//* 255  542:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 256  545:aload           5
	//* 257  547:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 258  550:icmplt          567
	//* 259  553:aload_3         
	//* 260  554:aload_3         
	//* 261  555:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 262  558:aload           5
	//* 263  560:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 264  563:isub            
	//* 265  564:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 266  567:aload_3         
	//* 267  568:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 268  571:aload           5
	//* 269  573:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//* 270  576:icmplt          438
	//* 271  579:aload_3         
	//* 272  580:aload_3         
	//* 273  581:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 274  584:aload           5
	//* 275  586:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 276  589:isub            
	//* 277  590:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 278  593:goto            438
	//* 279  596:aload_1         
	//* 280  597:iload           4
	//* 281  599:invokeinterface #71  <Method Object List.remove(int)>
	//* 282  604:pop             
	//* 283  605:goto            469
	//* 284  608:aconst_null     
	//* 285  609:astore          11
	//* 286  611:goto            97
	//* 287  614:iconst_0        
	//* 288  615:istore          6
	//* 289  617:iconst_1        
	//* 290  618:istore          7
	//* 291  620:goto            46
				flag = false;
	//  292  623:iconst_0        
	//  293  624:istore          6
		} else
		if(updateop1.positionStart == updateop.itemCount + 1 && updateop1.itemCount == updateop.positionStart - updateop.itemCount)
		{
			flag1 = true;
			flag = true;
		} else
		{
			flag = false;
			flag1 = true;
		}
		if(updateop.itemCount >= updateop1.positionStart) goto _L2; else goto _L1
_L1:
		updateop1.positionStart = updateop1.positionStart - 1;
_L4:
		if(updateop.positionStart <= updateop1.positionStart)
		{
			updateop1.positionStart = updateop1.positionStart + 1;
			updateop2 = null;
		} else
		if(updateop.positionStart < updateop1.positionStart + updateop1.itemCount)
		{
			k = updateop1.positionStart;
			l = updateop1.itemCount;
			i1 = updateop.positionStart;
			updateop2 = mCallback.obtainUpdateOp(2, updateop.positionStart + 1, (k + l) - i1, ((Object) (null)));
			updateop1.itemCount = updateop.positionStart - updateop1.positionStart;
		} else
		{
			updateop2 = null;
		}
		if(flag)
		{
			list.set(i, ((Object) (updateop1)));
			list.remove(j);
			mCallback.recycleUpdateOp(updateop);
		} else
		{
			if(flag1)
			{
				if(updateop2 != null)
				{
					if(updateop.positionStart > updateop2.positionStart)
						updateop.positionStart = updateop.positionStart - updateop2.itemCount;
					if(updateop.itemCount > updateop2.positionStart)
						updateop.itemCount = updateop.itemCount - updateop2.itemCount;
				}
				if(updateop.positionStart > updateop1.positionStart)
					updateop.positionStart = updateop.positionStart - updateop1.itemCount;
				if(updateop.itemCount > updateop1.positionStart)
					updateop.itemCount = updateop.itemCount - updateop1.itemCount;
			} else
			{
				if(updateop2 != null)
				{
					if(updateop.positionStart >= updateop2.positionStart)
						updateop.positionStart = updateop.positionStart - updateop2.itemCount;
					if(updateop.itemCount >= updateop2.positionStart)
						updateop.itemCount = updateop.itemCount - updateop2.itemCount;
				}
				if(updateop.positionStart >= updateop1.positionStart)
					updateop.positionStart = updateop.positionStart - updateop1.itemCount;
				if(updateop.itemCount >= updateop1.positionStart)
					updateop.itemCount = updateop.itemCount - updateop1.itemCount;
			}
			list.set(i, ((Object) (updateop1)));
			if(updateop.positionStart != updateop.itemCount)
				list.set(j, ((Object) (updateop)));
			else
				list.remove(j);
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
	//* 294  626:goto            46
	}

	void swapMoveUpdate(List list, int i, AdapterHelper.UpdateOp updateop, int j, AdapterHelper.UpdateOp updateop1)
	{
		AdapterHelper.UpdateOp updateop3 = null;
	//    0    0:aconst_null     
	//    1    1:astore          8
		AdapterHelper.UpdateOp updateop2;
		if(updateop.itemCount < updateop1.positionStart)
	//*   2    3:aload_3         
	//*   3    4:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*   4    7:aload           5
	//*   5    9:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*   6   12:icmpge          111
		{
			updateop1.positionStart = updateop1.positionStart - 1;
	//    7   15:aload           5
	//    8   17:aload           5
	//    9   19:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//   10   22:iconst_1        
	//   11   23:isub            
	//   12   24:putfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
			updateop2 = null;
	//   13   27:aconst_null     
	//   14   28:astore          7
		} else
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
	//*  59  126:icmpge          265
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
		} else
	//*  76  163:goto            30
	//*  77  166:aload_3         
	//*  78  167:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  79  170:aload           5
	//*  80  172:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  81  175:aload           5
	//*  82  177:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  83  180:iadd            
	//*  84  181:icmpge          54
	//*  85  184:aload           5
	//*  86  186:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  87  189:aload           5
	//*  88  191:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//*  89  194:iadd            
	//*  90  195:aload_3         
	//*  91  196:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  92  199:isub            
	//*  93  200:istore          6
	//*  94  202:aload_0         
	//*  95  203:getfield        #16  <Field OpReorderer$Callback mCallback>
	//*  96  206:iconst_4        
	//*  97  207:aload_3         
	//*  98  208:getfield        #45  <Field int AdapterHelper$UpdateOp.positionStart>
	//*  99  211:iconst_1        
	//* 100  212:iadd            
	//* 101  213:iload           6
	//* 102  215:aload           5
	//* 103  217:getfield        #87  <Field Object AdapterHelper$UpdateOp.payload>
	//* 104  220:invokeinterface #79  <Method AdapterHelper$UpdateOp OpReorderer$Callback.obtainUpdateOp(int, int, int, Object)>
	//* 105  225:astore          8
	//* 106  227:aload           5
	//* 107  229:aload           5
	//* 108  231:getfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 109  234:iload           6
	//* 110  236:isub            
	//* 111  237:putfield        #42  <Field int AdapterHelper$UpdateOp.itemCount>
	//* 112  240:goto            54
	//* 113  243:aload_1         
	//* 114  244:iload_2         
	//* 115  245:invokeinterface #71  <Method Object List.remove(int)>
	//* 116  250:pop             
	//* 117  251:aload_0         
	//* 118  252:getfield        #16  <Field OpReorderer$Callback mCallback>
	//* 119  255:aload           5
	//* 120  257:invokeinterface #75  <Method void OpReorderer$Callback.recycleUpdateOp(AdapterHelper$UpdateOp)>
	//* 121  262:goto            82
		{
			updateop2 = null;
	//  122  265:aconst_null     
	//  123  266:astore          7
		}
		if(updateop.positionStart <= updateop1.positionStart)
			updateop1.positionStart = updateop1.positionStart + 1;
		else
		if(updateop.positionStart < updateop1.positionStart + updateop1.itemCount)
		{
			int k = (updateop1.positionStart + updateop1.itemCount) - updateop.positionStart;
			updateop3 = mCallback.obtainUpdateOp(4, updateop.positionStart + 1, k, updateop1.payload);
			updateop1.itemCount = updateop1.itemCount - k;
		}
		list.set(j, ((Object) (updateop)));
		if(updateop1.itemCount > 0)
		{
			list.set(i, ((Object) (updateop1)));
		} else
		{
			list.remove(i);
			mCallback.recycleUpdateOp(updateop1);
		}
		if(updateop2 != null)
			list.add(i, ((Object) (updateop2)));
		if(updateop3 != null)
			list.add(i, ((Object) (updateop3)));
	//* 124  268:goto            30
	}

	final Callback mCallback;
}
