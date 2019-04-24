// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;

import java.util.*;

// Referenced classes of package android.support.v7.util:
//			DiffUtil, ListUpdateCallback, BatchingListUpdateCallback

public static class DiffUtil$DiffResult
{

	private void addRootSnake()
	{
		DiffUtil.Snake snake;
		if(mSnakes.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field List mSnakes>
	//*   2    4:invokeinterface #85  <Method boolean List.isEmpty()>
	//*   3    9:ifeq            77
			snake = null;
	//    4   12:aconst_null     
	//    5   13:astore_1        
		else
	//*   6   14:aload_1         
	//*   7   15:ifnull          32
	//*   8   18:aload_1         
	//*   9   19:getfield        #90  <Field int DiffUtil$Snake.x>
	//*  10   22:ifne            32
	//*  11   25:aload_1         
	//*  12   26:getfield        #93  <Field int DiffUtil$Snake.y>
	//*  13   29:ifeq            76
	//*  14   32:new             #87  <Class DiffUtil$Snake>
	//*  15   35:dup             
	//*  16   36:invokespecial   #94  <Method void DiffUtil$Snake()>
	//*  17   39:astore_1        
	//*  18   40:aload_1         
	//*  19   41:iconst_0        
	//*  20   42:putfield        #90  <Field int DiffUtil$Snake.x>
	//*  21   45:aload_1         
	//*  22   46:iconst_0        
	//*  23   47:putfield        #93  <Field int DiffUtil$Snake.y>
	//*  24   50:aload_1         
	//*  25   51:iconst_0        
	//*  26   52:putfield        #97  <Field boolean DiffUtil$Snake.removal>
	//*  27   55:aload_1         
	//*  28   56:iconst_0        
	//*  29   57:putfield        #100 <Field int DiffUtil$Snake.size>
	//*  30   60:aload_1         
	//*  31   61:iconst_0        
	//*  32   62:putfield        #103 <Field boolean DiffUtil$Snake.reverse>
	//*  33   65:aload_0         
	//*  34   66:getfield        #43  <Field List mSnakes>
	//*  35   69:iconst_0        
	//*  36   70:aload_1         
	//*  37   71:invokeinterface #107 <Method void List.add(int, Object)>
	//*  38   76:return          
			snake = (DiffUtil.Snake)mSnakes.get(0);
	//   39   77:aload_0         
	//   40   78:getfield        #43  <Field List mSnakes>
	//   41   81:iconst_0        
	//   42   82:invokeinterface #111 <Method Object List.get(int)>
	//   43   87:checkcast       #87  <Class DiffUtil$Snake>
	//   44   90:astore_1        
		if(snake == null || snake.x != 0 || snake.y != 0)
		{
			snake = new DiffUtil.Snake();
			snake.x = 0;
			snake.y = 0;
			snake.removal = false;
			snake.size = 0;
			snake.reverse = false;
			mSnakes.add(0, ((Object) (snake)));
		}
	//*  45   91:goto            14
	}

	private void dispatchAdditions(List list, ListUpdateCallback listupdatecallback, int i, int j, int k)
	{
		if(mDetectMoves) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field boolean mDetectMoves>
	//    2    4:ifne            17
_L1:
		listupdatecallback.onInserted(i, j);
	//    3    7:aload_2         
	//    4    8:iload_3         
	//    5    9:iload           4
	//    6   11:invokeinterface #119 <Method void ListUpdateCallback.onInserted(int, int)>
_L4:
		return;
	//    7   16:return          
_L2:
		j--;
	//    8   17:iload           4
	//    9   19:iconst_1        
	//   10   20:isub            
	//   11   21:istore          4
_L5:
		if(j < 0) goto _L4; else goto _L3
	//   12   23:iload           4
	//   13   25:iflt            16
_L3:
		int l = mNewItemStatuses[k + j] & 0x1f;
	//   14   28:aload_0         
	//   15   29:getfield        #47  <Field int[] mNewItemStatuses>
	//   16   32:iload           5
	//   17   34:iload           4
	//   18   36:iadd            
	//   19   37:iaload          
	//   20   38:bipush          31
	//   21   40:iand            
	//   22   41:istore          6
		switch(l)
	//*  23   43:iload           6
		{
	//*  24   45:lookupswitch    4: default 88
	//	               0: 133
	//	               4: 186
	//	               8: 186
	//	               16: 254
		default:
			throw new IllegalStateException((new StringBuilder()).append("unknown flag for pos ").append(j + k).append(" ").append(Long.toBinaryString(l)).toString());
	//   25   88:new             #121 <Class IllegalStateException>
	//   26   91:dup             
	//   27   92:new             #123 <Class StringBuilder>
	//   28   95:dup             
	//   29   96:invokespecial   #124 <Method void StringBuilder()>
	//   30   99:ldc1            #126 <String "unknown flag for pos ">
	//   31  101:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   32  104:iload           4
	//   33  106:iload           5
	//   34  108:iadd            
	//   35  109:invokevirtual   #133 <Method StringBuilder StringBuilder.append(int)>
	//   36  112:ldc1            #135 <String " ">
	//   37  114:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   38  117:iload           6
	//   39  119:i2l             
	//   40  120:invokestatic    #141 <Method String Long.toBinaryString(long)>
	//   41  123:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   42  126:invokevirtual   #145 <Method String StringBuilder.toString()>
	//   43  129:invokespecial   #148 <Method void IllegalStateException(String)>
	//   44  132:athrow          

		case 16: // '\020'
			break MISSING_BLOCK_LABEL_254;

		case 0: // '\0'
			listupdatecallback.onInserted(i, 1);
	//   45  133:aload_2         
	//   46  134:iload_3         
	//   47  135:iconst_1        
	//   48  136:invokeinterface #119 <Method void ListUpdateCallback.onInserted(int, int)>
			for(Iterator iterator = list.iterator(); iterator.hasNext();)
	//*  49  141:aload_1         
	//*  50  142:invokeinterface #152 <Method Iterator List.iterator()>
	//*  51  147:astore          8
	//*  52  149:aload           8
	//*  53  151:invokeinterface #157 <Method boolean Iterator.hasNext()>
	//*  54  156:ifeq            245
			{
				date date = (date)iterator.next();
	//   55  159:aload           8
	//   56  161:invokeinterface #161 <Method Object Iterator.next()>
	//   57  166:checkcast       #163 <Class DiffUtil$PostponedUpdate>
	//   58  169:astore          9
				date.currentPos = date.currentPos + 1;
	//   59  171:aload           9
	//   60  173:aload           9
	//   61  175:getfield        #166 <Field int DiffUtil$PostponedUpdate.currentPos>
	//   62  178:iconst_1        
	//   63  179:iadd            
	//   64  180:putfield        #166 <Field int DiffUtil$PostponedUpdate.currentPos>
			}

			break;
	//   65  183:goto            149

		case 4: // '\004'
		case 8: // '\b'
			int i1 = mNewItemStatuses[k + j] >> 5;
	//   66  186:aload_0         
	//   67  187:getfield        #47  <Field int[] mNewItemStatuses>
	//   68  190:iload           5
	//   69  192:iload           4
	//   70  194:iadd            
	//   71  195:iaload          
	//   72  196:iconst_5        
	//   73  197:ishr            
	//   74  198:istore          7
			listupdatecallback.onMoved(removePostponedUpdate(list, i1, true).currentPos, i);
	//   75  200:aload_2         
	//   76  201:aload_1         
	//   77  202:iload           7
	//   78  204:iconst_1        
	//   79  205:invokestatic    #170 <Method DiffUtil$PostponedUpdate removePostponedUpdate(List, int, boolean)>
	//   80  208:getfield        #166 <Field int DiffUtil$PostponedUpdate.currentPos>
	//   81  211:iload_3         
	//   82  212:invokeinterface #173 <Method void ListUpdateCallback.onMoved(int, int)>
			if(l == 4)
	//*  83  217:iload           6
	//*  84  219:iconst_4        
	//*  85  220:icmpne          245
				listupdatecallback.onChanged(i, 1, mCallback.getChangePayload(i1, k + j));
	//   86  223:aload_2         
	//   87  224:iload_3         
	//   88  225:iconst_1        
	//   89  226:aload_0         
	//   90  227:getfield        #55  <Field DiffUtil$Callback mCallback>
	//   91  230:iload           7
	//   92  232:iload           5
	//   93  234:iload           4
	//   94  236:iadd            
	//   95  237:invokevirtual   #177 <Method Object DiffUtil$Callback.getChangePayload(int, int)>
	//   96  240:invokeinterface #181 <Method void ListUpdateCallback.onChanged(int, int, Object)>
			break;
		}
_L6:
		j--;
	//   97  245:iload           4
	//   98  247:iconst_1        
	//   99  248:isub            
	//  100  249:istore          4
		  goto _L5
		  goto _L4
	//* 101  251:goto            23
		list.add(((Object) (new date(k + j, i, false))));
	//  102  254:aload_1         
	//  103  255:new             #163 <Class DiffUtil$PostponedUpdate>
	//  104  258:dup             
	//  105  259:iload           5
	//  106  261:iload           4
	//  107  263:iadd            
	//  108  264:iload_3         
	//  109  265:iconst_0        
	//  110  266:invokespecial   #184 <Method void DiffUtil$PostponedUpdate(int, int, boolean)>
	//  111  269:invokeinterface #187 <Method boolean List.add(Object)>
	//  112  274:pop             
		  goto _L6
	//* 113  275:goto            245
	}

	private void dispatchRemovals(List list, ListUpdateCallback listupdatecallback, int i, int j, int k)
	{
		if(mDetectMoves) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field boolean mDetectMoves>
	//    2    4:ifne            17
_L1:
		listupdatecallback.onRemoved(i, j);
	//    3    7:aload_2         
	//    4    8:iload_3         
	//    5    9:iload           4
	//    6   11:invokeinterface #192 <Method void ListUpdateCallback.onRemoved(int, int)>
_L4:
		return;
	//    7   16:return          
_L2:
		j--;
	//    8   17:iload           4
	//    9   19:iconst_1        
	//   10   20:isub            
	//   11   21:istore          4
_L5:
		if(j < 0) goto _L4; else goto _L3
	//   12   23:iload           4
	//   13   25:iflt            16
_L3:
		int l = mOldItemStatuses[k + j] & 0x1f;
	//   14   28:aload_0         
	//   15   29:getfield        #45  <Field int[] mOldItemStatuses>
	//   16   32:iload           5
	//   17   34:iload           4
	//   18   36:iadd            
	//   19   37:iaload          
	//   20   38:bipush          31
	//   21   40:iand            
	//   22   41:istore          6
		switch(l)
	//*  23   43:iload           6
		{
	//*  24   45:lookupswitch    4: default 88
	//	               0: 133
	//	               4: 189
	//	               8: 189
	//	               16: 272
		default:
			throw new IllegalStateException((new StringBuilder()).append("unknown flag for pos ").append(j + k).append(" ").append(Long.toBinaryString(l)).toString());
	//   25   88:new             #121 <Class IllegalStateException>
	//   26   91:dup             
	//   27   92:new             #123 <Class StringBuilder>
	//   28   95:dup             
	//   29   96:invokespecial   #124 <Method void StringBuilder()>
	//   30   99:ldc1            #126 <String "unknown flag for pos ">
	//   31  101:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   32  104:iload           4
	//   33  106:iload           5
	//   34  108:iadd            
	//   35  109:invokevirtual   #133 <Method StringBuilder StringBuilder.append(int)>
	//   36  112:ldc1            #135 <String " ">
	//   37  114:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   38  117:iload           6
	//   39  119:i2l             
	//   40  120:invokestatic    #141 <Method String Long.toBinaryString(long)>
	//   41  123:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   42  126:invokevirtual   #145 <Method String StringBuilder.toString()>
	//   43  129:invokespecial   #148 <Method void IllegalStateException(String)>
	//   44  132:athrow          

		case 16: // '\020'
			break MISSING_BLOCK_LABEL_272;

		case 0: // '\0'
			listupdatecallback.onRemoved(i + j, 1);
	//   45  133:aload_2         
	//   46  134:iload_3         
	//   47  135:iload           4
	//   48  137:iadd            
	//   49  138:iconst_1        
	//   50  139:invokeinterface #192 <Method void ListUpdateCallback.onRemoved(int, int)>
			for(Iterator iterator = list.iterator(); iterator.hasNext();)
	//*  51  144:aload_1         
	//*  52  145:invokeinterface #152 <Method Iterator List.iterator()>
	//*  53  150:astore          8
	//*  54  152:aload           8
	//*  55  154:invokeinterface #157 <Method boolean Iterator.hasNext()>
	//*  56  159:ifeq            263
			{
				date date1 = (date)iterator.next();
	//   57  162:aload           8
	//   58  164:invokeinterface #161 <Method Object Iterator.next()>
	//   59  169:checkcast       #163 <Class DiffUtil$PostponedUpdate>
	//   60  172:astore          9
				date1.currentPos = date1.currentPos - 1;
	//   61  174:aload           9
	//   62  176:aload           9
	//   63  178:getfield        #166 <Field int DiffUtil$PostponedUpdate.currentPos>
	//   64  181:iconst_1        
	//   65  182:isub            
	//   66  183:putfield        #166 <Field int DiffUtil$PostponedUpdate.currentPos>
			}

			break;
	//   67  186:goto            152

		case 4: // '\004'
		case 8: // '\b'
			int i1 = mOldItemStatuses[k + j] >> 5;
	//   68  189:aload_0         
	//   69  190:getfield        #45  <Field int[] mOldItemStatuses>
	//   70  193:iload           5
	//   71  195:iload           4
	//   72  197:iadd            
	//   73  198:iaload          
	//   74  199:iconst_5        
	//   75  200:ishr            
	//   76  201:istore          7
			date date = removePostponedUpdate(list, i1, false);
	//   77  203:aload_1         
	//   78  204:iload           7
	//   79  206:iconst_0        
	//   80  207:invokestatic    #170 <Method DiffUtil$PostponedUpdate removePostponedUpdate(List, int, boolean)>
	//   81  210:astore          8
			listupdatecallback.onMoved(i + j, date.currentPos - 1);
	//   82  212:aload_2         
	//   83  213:iload_3         
	//   84  214:iload           4
	//   85  216:iadd            
	//   86  217:aload           8
	//   87  219:getfield        #166 <Field int DiffUtil$PostponedUpdate.currentPos>
	//   88  222:iconst_1        
	//   89  223:isub            
	//   90  224:invokeinterface #173 <Method void ListUpdateCallback.onMoved(int, int)>
			if(l == 4)
	//*  91  229:iload           6
	//*  92  231:iconst_4        
	//*  93  232:icmpne          263
				listupdatecallback.onChanged(date.currentPos - 1, 1, mCallback.getChangePayload(k + j, i1));
	//   94  235:aload_2         
	//   95  236:aload           8
	//   96  238:getfield        #166 <Field int DiffUtil$PostponedUpdate.currentPos>
	//   97  241:iconst_1        
	//   98  242:isub            
	//   99  243:iconst_1        
	//  100  244:aload_0         
	//  101  245:getfield        #55  <Field DiffUtil$Callback mCallback>
	//  102  248:iload           5
	//  103  250:iload           4
	//  104  252:iadd            
	//  105  253:iload           7
	//  106  255:invokevirtual   #177 <Method Object DiffUtil$Callback.getChangePayload(int, int)>
	//  107  258:invokeinterface #181 <Method void ListUpdateCallback.onChanged(int, int, Object)>
			break;
		}
_L6:
		j--;
	//  108  263:iload           4
	//  109  265:iconst_1        
	//  110  266:isub            
	//  111  267:istore          4
		  goto _L5
		  goto _L4
	//* 112  269:goto            23
		list.add(((Object) (new date(k + j, i + j, true))));
	//  113  272:aload_1         
	//  114  273:new             #163 <Class DiffUtil$PostponedUpdate>
	//  115  276:dup             
	//  116  277:iload           5
	//  117  279:iload           4
	//  118  281:iadd            
	//  119  282:iload_3         
	//  120  283:iload           4
	//  121  285:iadd            
	//  122  286:iconst_1        
	//  123  287:invokespecial   #184 <Method void DiffUtil$PostponedUpdate(int, int, boolean)>
	//  124  290:invokeinterface #187 <Method boolean List.add(Object)>
	//  125  295:pop             
		  goto _L6
	//* 126  296:goto            263
	}

	private void findAddition(int i, int j, int k)
	{
		if(mOldItemStatuses[i - 1] != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field int[] mOldItemStatuses>
	//*   2    4:iload_1         
	//*   3    5:iconst_1        
	//*   4    6:isub            
	//*   5    7:iaload          
	//*   6    8:ifeq            12
		{
			return;
	//    7   11:return          
		} else
		{
			findMatchingItem(i, j, k, false);
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:iload_2         
	//   11   15:iload_3         
	//   12   16:iconst_0        
	//   13   17:invokespecial   #198 <Method boolean findMatchingItem(int, int, int, boolean)>
	//   14   20:pop             
			return;
	//   15   21:return          
		}
	}

	private boolean findMatchingItem(int i, int j, int k, boolean flag)
	{
		byte byte0 = 8;
	//    0    0:bipush          8
	//    1    2:istore          8
		int l;
		int i1;
		int k1;
		if(flag)
	//*   2    4:iload           4
	//*   3    6:ifeq            160
		{
			i1 = j - 1;
	//    4    9:iload_2         
	//    5   10:iconst_1        
	//    6   11:isub            
	//    7   12:istore          6
			int j1 = j - 1;
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:isub            
	//   11   17:istore          7
			l = i;
	//   12   19:iload_1         
	//   13   20:istore          5
			j = i1;
	//   14   22:iload           6
	//   15   24:istore_2        
			i1 = j1;
	//   16   25:iload           7
	//   17   27:istore          6
		} else
	//*  18   29:iload           5
	//*  19   31:istore          7
	//*  20   33:iload_2         
	//*  21   34:istore          5
	//*  22   36:iload           7
	//*  23   38:istore_2        
	//*  24   39:iload_3         
	//*  25   40:iflt            289
	//*  26   43:aload_0         
	//*  27   44:getfield        #43  <Field List mSnakes>
	//*  28   47:iload_3         
	//*  29   48:invokeinterface #111 <Method Object List.get(int)>
	//*  30   53:checkcast       #87  <Class DiffUtil$Snake>
	//*  31   56:astore          12
	//*  32   58:aload           12
	//*  33   60:getfield        #90  <Field int DiffUtil$Snake.x>
	//*  34   63:istore          7
	//*  35   65:aload           12
	//*  36   67:getfield        #100 <Field int DiffUtil$Snake.size>
	//*  37   70:istore          9
	//*  38   72:aload           12
	//*  39   74:getfield        #93  <Field int DiffUtil$Snake.y>
	//*  40   77:istore          10
	//*  41   79:aload           12
	//*  42   81:getfield        #100 <Field int DiffUtil$Snake.size>
	//*  43   84:istore          11
	//*  44   86:iload           4
	//*  45   88:ifeq            185
	//*  46   91:iload_2         
	//*  47   92:iconst_1        
	//*  48   93:isub            
	//*  49   94:istore_2        
	//*  50   95:iload_2         
	//*  51   96:iload           7
	//*  52   98:iload           9
	//*  53  100:iadd            
	//*  54  101:icmplt          269
	//*  55  104:aload_0         
	//*  56  105:getfield        #55  <Field DiffUtil$Callback mCallback>
	//*  57  108:iload_2         
	//*  58  109:iload           6
	//*  59  111:invokevirtual   #202 <Method boolean DiffUtil$Callback.areItemsTheSame(int, int)>
	//*  60  114:ifeq            178
	//*  61  117:aload_0         
	//*  62  118:getfield        #55  <Field DiffUtil$Callback mCallback>
	//*  63  121:iload_2         
	//*  64  122:iload           6
	//*  65  124:invokevirtual   #205 <Method boolean DiffUtil$Callback.areContentsTheSame(int, int)>
	//*  66  127:ifeq            173
	//*  67  130:bipush          8
	//*  68  132:istore_1        
	//*  69  133:aload_0         
	//*  70  134:getfield        #47  <Field int[] mNewItemStatuses>
	//*  71  137:iload           6
	//*  72  139:iload_2         
	//*  73  140:iconst_5        
	//*  74  141:ishl            
	//*  75  142:bipush          16
	//*  76  144:ior             
	//*  77  145:iastore         
	//*  78  146:aload_0         
	//*  79  147:getfield        #45  <Field int[] mOldItemStatuses>
	//*  80  150:iload_2         
	//*  81  151:iload_1         
	//*  82  152:iload           6
	//*  83  154:iconst_5        
	//*  84  155:ishl            
	//*  85  156:ior             
	//*  86  157:iastore         
	//*  87  158:iconst_1        
	//*  88  159:ireturn         
		{
			i1 = i - 1;
	//   89  160:iload_1         
	//   90  161:iconst_1        
	//   91  162:isub            
	//   92  163:istore          6
			l = i - 1;
	//   93  165:iload_1         
	//   94  166:iconst_1        
	//   95  167:isub            
	//   96  168:istore          5
		}
		k1 = l;
		l = j;
		j = k1;
		for(; k >= 0; k--)
		{
			DiffUtil.Snake snake = (DiffUtil.Snake)mSnakes.get(k);
			int l1 = snake.x;
			int i2 = snake.size;
			int j2 = snake.y;
			int k2 = snake.size;
			if(flag)
				for(j--; j >= l1 + i2; j--)
					if(mCallback.areItemsTheSame(j, i1))
					{
						if(mCallback.areContentsTheSame(j, i1))
							i = 8;
						else
	//*  97  170:goto            29
							i = 4;
	//   98  173:iconst_4        
	//   99  174:istore_1        
						mNewItemStatuses[i1] = j << 5 | 0x10;
						mOldItemStatuses[j] = i | i1 << 5;
						return true;
					}

	//  100  175:goto            133
	//  101  178:iload_2         
	//  102  179:iconst_1        
	//  103  180:isub            
	//  104  181:istore_2        
			else
	//* 105  182:goto            95
				for(j = l - 1; j >= j2 + k2; j--)
	//* 106  185:iload           5
	//* 107  187:iconst_1        
	//* 108  188:isub            
	//* 109  189:istore_2        
	//* 110  190:iload_2         
	//* 111  191:iload           10
	//* 112  193:iload           11
	//* 113  195:iadd            
	//* 114  196:icmplt          269
					if(mCallback.areItemsTheSame(i1, j))
	//* 115  199:aload_0         
	//* 116  200:getfield        #55  <Field DiffUtil$Callback mCallback>
	//* 117  203:iload           6
	//* 118  205:iload_2         
	//* 119  206:invokevirtual   #202 <Method boolean DiffUtil$Callback.areItemsTheSame(int, int)>
	//* 120  209:ifeq            262
					{
						if(mCallback.areContentsTheSame(i1, j))
	//* 121  212:aload_0         
	//* 122  213:getfield        #55  <Field DiffUtil$Callback mCallback>
	//* 123  216:iload           6
	//* 124  218:iload_2         
	//* 125  219:invokevirtual   #205 <Method boolean DiffUtil$Callback.areContentsTheSame(int, int)>
	//* 126  222:ifeq            257
							k = ((int) (byte0));
	//  127  225:iload           8
	//  128  227:istore_3        
						else
	//* 129  228:aload_0         
	//* 130  229:getfield        #45  <Field int[] mOldItemStatuses>
	//* 131  232:iload_1         
	//* 132  233:iconst_1        
	//* 133  234:isub            
	//* 134  235:iload_2         
	//* 135  236:iconst_5        
	//* 136  237:ishl            
	//* 137  238:bipush          16
	//* 138  240:ior             
	//* 139  241:iastore         
	//* 140  242:aload_0         
	//* 141  243:getfield        #47  <Field int[] mNewItemStatuses>
	//* 142  246:iload_2         
	//* 143  247:iload_1         
	//* 144  248:iconst_1        
	//* 145  249:isub            
	//* 146  250:iconst_5        
	//* 147  251:ishl            
	//* 148  252:iload_3         
	//* 149  253:ior             
	//* 150  254:iastore         
	//* 151  255:iconst_1        
	//* 152  256:ireturn         
							k = 4;
	//  153  257:iconst_4        
	//  154  258:istore_3        
						mOldItemStatuses[i - 1] = j << 5 | 0x10;
						mNewItemStatuses[j] = i - 1 << 5 | k;
						return true;
					}

	//  155  259:goto            228
	//  156  262:iload_2         
	//  157  263:iconst_1        
	//  158  264:isub            
	//  159  265:istore_2        
	//* 160  266:goto            190
			j = snake.x;
	//  161  269:aload           12
	//  162  271:getfield        #90  <Field int DiffUtil$Snake.x>
	//  163  274:istore_2        
			l = snake.y;
	//  164  275:aload           12
	//  165  277:getfield        #93  <Field int DiffUtil$Snake.y>
	//  166  280:istore          5
		}

	//  167  282:iload_3         
	//  168  283:iconst_1        
	//  169  284:isub            
	//  170  285:istore_3        
	//* 171  286:goto            39
		return false;
	//  172  289:iconst_0        
	//  173  290:ireturn         
	}

	private void findMatchingItems()
	{
		int j = mOldListSize;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int mOldListSize>
	//    2    4:istore_2        
		int i = mNewListSize;
	//    3    5:aload_0         
	//    4    6:getfield        #68  <Field int mNewListSize>
	//    5    9:istore_1        
		for(int k = mSnakes.size() - 1; k >= 0; k--)
	//*   6   10:aload_0         
	//*   7   11:getfield        #43  <Field List mSnakes>
	//*   8   14:invokeinterface #207 <Method int List.size()>
	//*   9   19:iconst_1        
	//*  10   20:isub            
	//*  11   21:istore_3        
	//*  12   22:iload_3         
	//*  13   23:iflt            231
		{
			DiffUtil.Snake snake = (DiffUtil.Snake)mSnakes.get(k);
	//   14   26:aload_0         
	//   15   27:getfield        #43  <Field List mSnakes>
	//   16   30:iload_3         
	//   17   31:invokeinterface #111 <Method Object List.get(int)>
	//   18   36:checkcast       #87  <Class DiffUtil$Snake>
	//   19   39:astore          9
			int i2 = snake.x;
	//   20   41:aload           9
	//   21   43:getfield        #90  <Field int DiffUtil$Snake.x>
	//   22   46:istore          7
			int j2 = snake.size;
	//   23   48:aload           9
	//   24   50:getfield        #100 <Field int DiffUtil$Snake.size>
	//   25   53:istore          8
			int j1 = snake.y;
	//   26   55:aload           9
	//   27   57:getfield        #93  <Field int DiffUtil$Snake.y>
	//   28   60:istore          5
			int l1 = snake.size;
	//   29   62:aload           9
	//   30   64:getfield        #100 <Field int DiffUtil$Snake.size>
	//   31   67:istore          6
			if(mDetectMoves)
	//*  32   69:aload_0         
	//*  33   70:getfield        #70  <Field boolean mDetectMoves>
	//*  34   73:ifeq            129
			{
				int l;
				do
				{
					l = i;
	//   35   76:iload_1         
	//   36   77:istore          4
					if(j <= i2 + j2)
						break;
	//   37   79:iload_2         
	//   38   80:iload           7
	//   39   82:iload           8
	//   40   84:iadd            
	//   41   85:icmple          102
					findAddition(j, i, k);
	//   42   88:aload_0         
	//   43   89:iload_2         
	//   44   90:iload_1         
	//   45   91:iload_3         
	//   46   92:invokespecial   #209 <Method void findAddition(int, int, int)>
					j--;
	//   47   95:iload_2         
	//   48   96:iconst_1        
	//   49   97:isub            
	//   50   98:istore_2        
				} while(true);
	//   51   99:goto            76
				for(; l > j1 + l1; l--)
	//*  52  102:iload           4
	//*  53  104:iload           5
	//*  54  106:iload           6
	//*  55  108:iadd            
	//*  56  109:icmple          129
					findRemoval(j, l, k);
	//   57  112:aload_0         
	//   58  113:iload_2         
	//   59  114:iload           4
	//   60  116:iload_3         
	//   61  117:invokespecial   #212 <Method void findRemoval(int, int, int)>

	//   62  120:iload           4
	//   63  122:iconst_1        
	//   64  123:isub            
	//   65  124:istore          4
			}
	//*  66  126:goto            102
			i = 0;
	//   67  129:iconst_0        
	//   68  130:istore_1        
			while(i < snake.size) 
	//*  69  131:iload_1         
	//*  70  132:aload           9
	//*  71  134:getfield        #100 <Field int DiffUtil$Snake.size>
	//*  72  137:icmpge          212
			{
				int i1 = snake.x + i;
	//   73  140:aload           9
	//   74  142:getfield        #90  <Field int DiffUtil$Snake.x>
	//   75  145:iload_1         
	//   76  146:iadd            
	//   77  147:istore          4
				int k1 = snake.y + i;
	//   78  149:aload           9
	//   79  151:getfield        #93  <Field int DiffUtil$Snake.y>
	//   80  154:iload_1         
	//   81  155:iadd            
	//   82  156:istore          5
				if(mCallback.areContentsTheSame(i1, k1))
	//*  83  158:aload_0         
	//*  84  159:getfield        #55  <Field DiffUtil$Callback mCallback>
	//*  85  162:iload           4
	//*  86  164:iload           5
	//*  87  166:invokevirtual   #205 <Method boolean DiffUtil$Callback.areContentsTheSame(int, int)>
	//*  88  169:ifeq            207
					j = 1;
	//   89  172:iconst_1        
	//   90  173:istore_2        
				else
	//*  91  174:aload_0         
	//*  92  175:getfield        #45  <Field int[] mOldItemStatuses>
	//*  93  178:iload           4
	//*  94  180:iload           5
	//*  95  182:iconst_5        
	//*  96  183:ishl            
	//*  97  184:iload_2         
	//*  98  185:ior             
	//*  99  186:iastore         
	//* 100  187:aload_0         
	//* 101  188:getfield        #47  <Field int[] mNewItemStatuses>
	//* 102  191:iload           5
	//* 103  193:iload_2         
	//* 104  194:iload           4
	//* 105  196:iconst_5        
	//* 106  197:ishl            
	//* 107  198:ior             
	//* 108  199:iastore         
	//* 109  200:iload_1         
	//* 110  201:iconst_1        
	//* 111  202:iadd            
	//* 112  203:istore_1        
	//* 113  204:goto            131
					j = 2;
	//  114  207:iconst_2        
	//  115  208:istore_2        
				mOldItemStatuses[i1] = k1 << 5 | j;
				mNewItemStatuses[k1] = j | i1 << 5;
				i++;
			}
	//* 116  209:goto            174
			j = snake.x;
	//  117  212:aload           9
	//  118  214:getfield        #90  <Field int DiffUtil$Snake.x>
	//  119  217:istore_2        
			i = snake.y;
	//  120  218:aload           9
	//  121  220:getfield        #93  <Field int DiffUtil$Snake.y>
	//  122  223:istore_1        
		}

	//  123  224:iload_3         
	//  124  225:iconst_1        
	//  125  226:isub            
	//  126  227:istore_3        
	//* 127  228:goto            22
	//  128  231:return          
	}

	private void findRemoval(int i, int j, int k)
	{
		if(mNewItemStatuses[j - 1] != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field int[] mNewItemStatuses>
	//*   2    4:iload_2         
	//*   3    5:iconst_1        
	//*   4    6:isub            
	//*   5    7:iaload          
	//*   6    8:ifeq            12
		{
			return;
	//    7   11:return          
		} else
		{
			findMatchingItem(i, j, k, true);
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:iload_2         
	//   11   15:iload_3         
	//   12   16:iconst_1        
	//   13   17:invokespecial   #198 <Method boolean findMatchingItem(int, int, int, boolean)>
	//   14   20:pop             
			return;
	//   15   21:return          
		}
	}

	private static date removePostponedUpdate(List list, int i, boolean flag)
	{
		date date;
label0:
		{
			int j = list.size() - 1;
	//    0    0:aload_0         
	//    1    1:invokeinterface #207 <Method int List.size()>
	//    2    6:iconst_1        
	//    3    7:isub            
	//    4    8:istore_3        
			do
			{
				if(j < 0)
					break;
	//    5    9:iload_3         
	//    6   10:iflt            120
				date date1 = (date)list.get(j);
	//    7   13:aload_0         
	//    8   14:iload_3         
	//    9   15:invokeinterface #111 <Method Object List.get(int)>
	//   10   20:checkcast       #163 <Class DiffUtil$PostponedUpdate>
	//   11   23:astore          6
				if(date1.posInOwnerList == i && date1.removal == flag)
	//*  12   25:aload           6
	//*  13   27:getfield        #215 <Field int DiffUtil$PostponedUpdate.posInOwnerList>
	//*  14   30:iload_1         
	//*  15   31:icmpne          113
	//*  16   34:aload           6
	//*  17   36:getfield        #216 <Field boolean DiffUtil$PostponedUpdate.removal>
	//*  18   39:iload_2         
	//*  19   40:icmpne          113
				{
					list.remove(j);
	//   20   43:aload_0         
	//   21   44:iload_3         
	//   22   45:invokeinterface #219 <Method Object List.remove(int)>
	//   23   50:pop             
					i = j;
	//   24   51:iload_3         
	//   25   52:istore_1        
					do
					{
						date = date1;
	//   26   53:aload           6
	//   27   55:astore          5
						if(i >= list.size())
							break;
	//   28   57:iload_1         
	//   29   58:aload_0         
	//   30   59:invokeinterface #207 <Method int List.size()>
	//   31   64:icmpge          123
						date = (date)list.get(i);
	//   32   67:aload_0         
	//   33   68:iload_1         
	//   34   69:invokeinterface #111 <Method Object List.get(int)>
	//   35   74:checkcast       #163 <Class DiffUtil$PostponedUpdate>
	//   36   77:astore          5
						int k = date.currentPos;
	//   37   79:aload           5
	//   38   81:getfield        #166 <Field int DiffUtil$PostponedUpdate.currentPos>
	//   39   84:istore          4
						if(flag)
	//*  40   86:iload_2         
	//*  41   87:ifeq            108
							j = 1;
	//   42   90:iconst_1        
	//   43   91:istore_3        
						else
	//*  44   92:aload           5
	//*  45   94:iload_3         
	//*  46   95:iload           4
	//*  47   97:iadd            
	//*  48   98:putfield        #166 <Field int DiffUtil$PostponedUpdate.currentPos>
	//*  49  101:iload_1         
	//*  50  102:iconst_1        
	//*  51  103:iadd            
	//*  52  104:istore_1        
	//*  53  105:goto            53
							j = -1;
	//   54  108:iconst_m1       
	//   55  109:istore_3        
						date.currentPos = j + k;
						i++;
					} while(true);
	//   56  110:goto            92
					break label0;
				}
				j--;
	//   57  113:iload_3         
	//   58  114:iconst_1        
	//   59  115:isub            
	//   60  116:istore_3        
			} while(true);
	//   61  117:goto            9
			date = null;
	//   62  120:aconst_null     
	//   63  121:astore          5
		}
		return date;
	//   64  123:aload           5
	//   65  125:areturn         
	}

	public void dispatchUpdatesTo(ListUpdateCallback listupdatecallback)
	{
		int j;
		int k;
		ArrayList arraylist;
		if(listupdatecallback instanceof BatchingListUpdateCallback)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #224 <Class BatchingListUpdateCallback>
	//*   2    4:ifeq            202
			listupdatecallback = ((ListUpdateCallback) ((BatchingListUpdateCallback)listupdatecallback));
	//    3    7:aload_1         
	//    4    8:checkcast       #224 <Class BatchingListUpdateCallback>
	//    5   11:astore_1        
		else
	//*   6   12:new             #226 <Class ArrayList>
	//*   7   15:dup             
	//*   8   16:invokespecial   #227 <Method void ArrayList()>
	//*   9   19:astore          8
	//*  10   21:aload_0         
	//*  11   22:getfield        #63  <Field int mOldListSize>
	//*  12   25:istore_3        
	//*  13   26:aload_0         
	//*  14   27:getfield        #68  <Field int mNewListSize>
	//*  15   30:istore          4
	//*  16   32:aload_0         
	//*  17   33:getfield        #43  <Field List mSnakes>
	//*  18   36:invokeinterface #207 <Method int List.size()>
	//*  19   41:iconst_1        
	//*  20   42:isub            
	//*  21   43:istore_2        
	//*  22   44:iload_2         
	//*  23   45:iflt            234
	//*  24   48:aload_0         
	//*  25   49:getfield        #43  <Field List mSnakes>
	//*  26   52:iload_2         
	//*  27   53:invokeinterface #111 <Method Object List.get(int)>
	//*  28   58:checkcast       #87  <Class DiffUtil$Snake>
	//*  29   61:astore          9
	//*  30   63:aload           9
	//*  31   65:getfield        #100 <Field int DiffUtil$Snake.size>
	//*  32   68:istore          5
	//*  33   70:aload           9
	//*  34   72:getfield        #90  <Field int DiffUtil$Snake.x>
	//*  35   75:iload           5
	//*  36   77:iadd            
	//*  37   78:istore          6
	//*  38   80:aload           9
	//*  39   82:getfield        #93  <Field int DiffUtil$Snake.y>
	//*  40   85:iload           5
	//*  41   87:iadd            
	//*  42   88:istore          7
	//*  43   90:iload           6
	//*  44   92:iload_3         
	//*  45   93:icmpge          111
	//*  46   96:aload_0         
	//*  47   97:aload           8
	//*  48   99:aload_1         
	//*  49  100:iload           6
	//*  50  102:iload_3         
	//*  51  103:iload           6
	//*  52  105:isub            
	//*  53  106:iload           6
	//*  54  108:invokespecial   #229 <Method void dispatchRemovals(List, ListUpdateCallback, int, int, int)>
	//*  55  111:iload           7
	//*  56  113:iload           4
	//*  57  115:icmpge          134
	//*  58  118:aload_0         
	//*  59  119:aload           8
	//*  60  121:aload_1         
	//*  61  122:iload           6
	//*  62  124:iload           4
	//*  63  126:iload           7
	//*  64  128:isub            
	//*  65  129:iload           7
	//*  66  131:invokespecial   #231 <Method void dispatchAdditions(List, ListUpdateCallback, int, int, int)>
	//*  67  134:iload           5
	//*  68  136:iconst_1        
	//*  69  137:isub            
	//*  70  138:istore_3        
	//*  71  139:iload_3         
	//*  72  140:iflt            214
	//*  73  143:aload_0         
	//*  74  144:getfield        #45  <Field int[] mOldItemStatuses>
	//*  75  147:aload           9
	//*  76  149:getfield        #90  <Field int DiffUtil$Snake.x>
	//*  77  152:iload_3         
	//*  78  153:iadd            
	//*  79  154:iaload          
	//*  80  155:bipush          31
	//*  81  157:iand            
	//*  82  158:iconst_2        
	//*  83  159:icmpne          195
	//*  84  162:aload_1         
	//*  85  163:aload           9
	//*  86  165:getfield        #90  <Field int DiffUtil$Snake.x>
	//*  87  168:iload_3         
	//*  88  169:iadd            
	//*  89  170:iconst_1        
	//*  90  171:aload_0         
	//*  91  172:getfield        #55  <Field DiffUtil$Callback mCallback>
	//*  92  175:aload           9
	//*  93  177:getfield        #90  <Field int DiffUtil$Snake.x>
	//*  94  180:iload_3         
	//*  95  181:iadd            
	//*  96  182:aload           9
	//*  97  184:getfield        #93  <Field int DiffUtil$Snake.y>
	//*  98  187:iload_3         
	//*  99  188:iadd            
	//* 100  189:invokevirtual   #177 <Method Object DiffUtil$Callback.getChangePayload(int, int)>
	//* 101  192:invokevirtual   #232 <Method void BatchingListUpdateCallback.onChanged(int, int, Object)>
	//* 102  195:iload_3         
	//* 103  196:iconst_1        
	//* 104  197:isub            
	//* 105  198:istore_3        
	//* 106  199:goto            139
			listupdatecallback = ((ListUpdateCallback) (new BatchingListUpdateCallback(listupdatecallback)));
	//  107  202:new             #224 <Class BatchingListUpdateCallback>
	//  108  205:dup             
	//  109  206:aload_1         
	//  110  207:invokespecial   #234 <Method void BatchingListUpdateCallback(ListUpdateCallback)>
	//  111  210:astore_1        
		arraylist = new ArrayList();
		j = mOldListSize;
		k = mNewListSize;
		for(int i = mSnakes.size() - 1; i >= 0; i--)
		{
			DiffUtil.Snake snake = (DiffUtil.Snake)mSnakes.get(i);
			int l = snake.size;
			int i1 = snake.x + l;
			int j1 = snake.y + l;
			if(i1 < j)
				dispatchRemovals(((List) (arraylist)), listupdatecallback, i1, j - i1, i1);
			if(j1 < k)
				dispatchAdditions(((List) (arraylist)), listupdatecallback, i1, k - j1, j1);
			for(j = l - 1; j >= 0; j--)
				if((mOldItemStatuses[snake.x + j] & 0x1f) == 2)
					((BatchingListUpdateCallback) (listupdatecallback)).onChanged(snake.x + j, 1, mCallback.getChangePayload(snake.x + j, snake.y + j));

	//* 112  211:goto            12
			j = snake.x;
	//  113  214:aload           9
	//  114  216:getfield        #90  <Field int DiffUtil$Snake.x>
	//  115  219:istore_3        
			k = snake.y;
	//  116  220:aload           9
	//  117  222:getfield        #93  <Field int DiffUtil$Snake.y>
	//  118  225:istore          4
		}

	//  119  227:iload_2         
	//  120  228:iconst_1        
	//  121  229:isub            
	//  122  230:istore_2        
	//* 123  231:goto            44
		((BatchingListUpdateCallback) (listupdatecallback)).dispatchLastEvent();
	//  124  234:aload_1         
	//  125  235:invokevirtual   #237 <Method void BatchingListUpdateCallback.dispatchLastEvent()>
	//  126  238:return          
	}

	public void dispatchUpdatesTo(final android.support.v7.widget. adapter)
	{
		dispatchUpdatesTo(new ListUpdateCallback() {

			public void onChanged(int i, int j, Object obj)
			{
				adapter.notifyItemRangeChanged(i, j, obj);
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field android.support.v7.widget.RecyclerView$Adapter val$adapter>
			//    2    4:iload_1         
			//    3    5:iload_2         
			//    4    6:aload_3         
			//    5    7:invokevirtual   #35  <Method void android.support.v7.widget.RecyclerView$Adapter.notifyItemRangeChanged(int, int, Object)>
			//    6   10:return          
			}

			public void onInserted(int i, int j)
			{
				adapter.notifyItemRangeInserted(i, j);
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field android.support.v7.widget.RecyclerView$Adapter val$adapter>
			//    2    4:iload_1         
			//    3    5:iload_2         
			//    4    6:invokevirtual   #40  <Method void android.support.v7.widget.RecyclerView$Adapter.notifyItemRangeInserted(int, int)>
			//    5    9:return          
			}

			public void onMoved(int i, int j)
			{
				adapter.notifyItemMoved(i, j);
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field android.support.v7.widget.RecyclerView$Adapter val$adapter>
			//    2    4:iload_1         
			//    3    5:iload_2         
			//    4    6:invokevirtual   #44  <Method void android.support.v7.widget.RecyclerView$Adapter.notifyItemMoved(int, int)>
			//    5    9:return          
			}

			public void onRemoved(int i, int j)
			{
				adapter.notifyItemRangeRemoved(i, j);
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field android.support.v7.widget.RecyclerView$Adapter val$adapter>
			//    2    4:iload_1         
			//    3    5:iload_2         
			//    4    6:invokevirtual   #48  <Method void android.support.v7.widget.RecyclerView$Adapter.notifyItemRangeRemoved(int, int)>
			//    5    9:return          
			}

			final DiffUtil.DiffResult this$0;
			final android.support.v7.widget.RecyclerView.Adapter val$adapter;

			
			{
				this$0 = DiffUtil.DiffResult.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field DiffUtil$DiffResult this$0>
				adapter = adapter1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field android.support.v7.widget.RecyclerView$Adapter val$adapter>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #9   <Class DiffUtil$DiffResult$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #241 <Method void DiffUtil$DiffResult$1(DiffUtil$DiffResult, android.support.v7.widget.RecyclerView$Adapter)>
	//    6   10:invokevirtual   #243 <Method void dispatchUpdatesTo(ListUpdateCallback)>
	//    7   13:return          
	}

	List getSnakes()
	{
		return mSnakes;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List mSnakes>
	//    2    4:areturn         
	}

	private static final int FLAG_CHANGED = 2;
	private static final int FLAG_IGNORE = 16;
	private static final int FLAG_MASK = 31;
	private static final int FLAG_MOVED_CHANGED = 4;
	private static final int FLAG_MOVED_NOT_CHANGED = 8;
	private static final int FLAG_NOT_CHANGED = 1;
	private static final int FLAG_OFFSET = 5;
	private final DiffUtil.Callback mCallback;
	private final boolean mDetectMoves;
	private final int mNewItemStatuses[];
	private final int mNewListSize;
	private final int mOldItemStatuses[];
	private final int mOldListSize;
	private final List mSnakes;

	DiffUtil$DiffResult(DiffUtil.Callback callback, List list, int ai[], int ai1[], boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		mSnakes = list;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #43  <Field List mSnakes>
		mOldItemStatuses = ai;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #45  <Field int[] mOldItemStatuses>
		mNewItemStatuses = ai1;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #47  <Field int[] mNewItemStatuses>
		Arrays.fill(mOldItemStatuses, 0);
	//   11   20:aload_0         
	//   12   21:getfield        #45  <Field int[] mOldItemStatuses>
	//   13   24:iconst_0        
	//   14   25:invokestatic    #53  <Method void Arrays.fill(int[], int)>
		Arrays.fill(mNewItemStatuses, 0);
	//   15   28:aload_0         
	//   16   29:getfield        #47  <Field int[] mNewItemStatuses>
	//   17   32:iconst_0        
	//   18   33:invokestatic    #53  <Method void Arrays.fill(int[], int)>
		mCallback = callback;
	//   19   36:aload_0         
	//   20   37:aload_1         
	//   21   38:putfield        #55  <Field DiffUtil$Callback mCallback>
		mOldListSize = callback.getOldListSize();
	//   22   41:aload_0         
	//   23   42:aload_1         
	//   24   43:invokevirtual   #61  <Method int DiffUtil$Callback.getOldListSize()>
	//   25   46:putfield        #63  <Field int mOldListSize>
		mNewListSize = callback.getNewListSize();
	//   26   49:aload_0         
	//   27   50:aload_1         
	//   28   51:invokevirtual   #66  <Method int DiffUtil$Callback.getNewListSize()>
	//   29   54:putfield        #68  <Field int mNewListSize>
		mDetectMoves = flag;
	//   30   57:aload_0         
	//   31   58:iload           5
	//   32   60:putfield        #70  <Field boolean mDetectMoves>
		addRootSnake();
	//   33   63:aload_0         
	//   34   64:invokespecial   #73  <Method void addRootSnake()>
		findMatchingItems();
	//   35   67:aload_0         
	//   36   68:invokespecial   #76  <Method void findMatchingItems()>
	//   37   71:return          
	}
}
