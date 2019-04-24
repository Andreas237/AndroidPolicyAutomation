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
	//*   3    9:ifeq            17
			snake = null;
	//    4   12:aconst_null     
	//    5   13:astore_1        
		else
	//*   6   14:goto            31
			snake = (DiffUtil.Snake)mSnakes.get(0);
	//    7   17:aload_0         
	//    8   18:getfield        #43  <Field List mSnakes>
	//    9   21:iconst_0        
	//   10   22:invokeinterface #89  <Method Object List.get(int)>
	//   11   27:checkcast       #91  <Class DiffUtil$Snake>
	//   12   30:astore_1        
		if(snake == null || snake.x != 0 || snake.y != 0)
	//*  13   31:aload_1         
	//*  14   32:ifnull          49
	//*  15   35:aload_1         
	//*  16   36:getfield        #94  <Field int DiffUtil$Snake.x>
	//*  17   39:ifne            49
	//*  18   42:aload_1         
	//*  19   43:getfield        #97  <Field int DiffUtil$Snake.y>
	//*  20   46:ifeq            93
		{
			DiffUtil.Snake snake1 = new DiffUtil.Snake();
	//   21   49:new             #91  <Class DiffUtil$Snake>
	//   22   52:dup             
	//   23   53:invokespecial   #98  <Method void DiffUtil$Snake()>
	//   24   56:astore_1        
			snake1.x = 0;
	//   25   57:aload_1         
	//   26   58:iconst_0        
	//   27   59:putfield        #94  <Field int DiffUtil$Snake.x>
			snake1.y = 0;
	//   28   62:aload_1         
	//   29   63:iconst_0        
	//   30   64:putfield        #97  <Field int DiffUtil$Snake.y>
			snake1.removal = false;
	//   31   67:aload_1         
	//   32   68:iconst_0        
	//   33   69:putfield        #101 <Field boolean DiffUtil$Snake.removal>
			snake1.size = 0;
	//   34   72:aload_1         
	//   35   73:iconst_0        
	//   36   74:putfield        #104 <Field int DiffUtil$Snake.size>
			snake1.reverse = false;
	//   37   77:aload_1         
	//   38   78:iconst_0        
	//   39   79:putfield        #107 <Field boolean DiffUtil$Snake.reverse>
			mSnakes.add(0, ((Object) (snake1)));
	//   40   82:aload_0         
	//   41   83:getfield        #43  <Field List mSnakes>
	//   42   86:iconst_0        
	//   43   87:aload_1         
	//   44   88:invokeinterface #111 <Method void List.add(int, Object)>
		}
	//   45   93:return          
	}

	private void dispatchAdditions(List list, ListUpdateCallback listupdatecallback, int i, int j, int k)
	{
		if(!mDetectMoves)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field boolean mDetectMoves>
	//*   2    4:ifne            17
		{
			listupdatecallback.onInserted(i, j);
	//    3    7:aload_2         
	//    4    8:iload_3         
	//    5    9:iload           4
	//    6   11:invokeinterface #119 <Method void ListUpdateCallback.onInserted(int, int)>
			return;
	//    7   16:return          
		}
		for(j--; j >= 0; j--)
	//*   8   17:iload           4
	//*   9   19:iconst_1        
	//*  10   20:isub            
	//*  11   21:istore          4
	//*  12   23:iload           4
	//*  13   25:iflt            287
		{
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
	//	               0: 91
	//	               4: 147
	//	               8: 147
	//	               16: 209
	//*  25   88:goto            233
			case 0: // '\0'
				listupdatecallback.onInserted(i, 1);
	//   26   91:aload_2         
	//   27   92:iload_3         
	//   28   93:iconst_1        
	//   29   94:invokeinterface #119 <Method void ListUpdateCallback.onInserted(int, int)>
				for(Iterator iterator = list.iterator(); iterator.hasNext();)
	//*  30   99:aload_1         
	//*  31  100:invokeinterface #123 <Method Iterator List.iterator()>
	//*  32  105:astore          8
	//*  33  107:aload           8
	//*  34  109:invokeinterface #128 <Method boolean Iterator.hasNext()>
	//*  35  114:ifeq            144
				{
					date date = (date)iterator.next();
	//   36  117:aload           8
	//   37  119:invokeinterface #132 <Method Object Iterator.next()>
	//   38  124:checkcast       #134 <Class DiffUtil$PostponedUpdate>
	//   39  127:astore          9
					date.currentPos = date.currentPos + 1;
	//   40  129:aload           9
	//   41  131:aload           9
	//   42  133:getfield        #137 <Field int DiffUtil$PostponedUpdate.currentPos>
	//   43  136:iconst_1        
	//   44  137:iadd            
	//   45  138:putfield        #137 <Field int DiffUtil$PostponedUpdate.currentPos>
				}

				break;
	//   46  141:goto            107

	//*  47  144:goto            278
			case 4: // '\004'
			case 8: // '\b'
				int i1 = mNewItemStatuses[k + j] >> 5;
	//   48  147:aload_0         
	//   49  148:getfield        #47  <Field int[] mNewItemStatuses>
	//   50  151:iload           5
	//   51  153:iload           4
	//   52  155:iadd            
	//   53  156:iaload          
	//   54  157:iconst_5        
	//   55  158:ishr            
	//   56  159:istore          7
				listupdatecallback.onMoved(removePostponedUpdate(list, i1, true).currentPos, i);
	//   57  161:aload_2         
	//   58  162:aload_1         
	//   59  163:iload           7
	//   60  165:iconst_1        
	//   61  166:invokestatic    #141 <Method DiffUtil$PostponedUpdate removePostponedUpdate(List, int, boolean)>
	//   62  169:getfield        #137 <Field int DiffUtil$PostponedUpdate.currentPos>
	//   63  172:iload_3         
	//   64  173:invokeinterface #144 <Method void ListUpdateCallback.onMoved(int, int)>
				if(l == 4)
	//*  65  178:iload           6
	//*  66  180:iconst_4        
	//*  67  181:icmpne          278
					listupdatecallback.onChanged(i, 1, mCallback.getChangePayload(i1, k + j));
	//   68  184:aload_2         
	//   69  185:iload_3         
	//   70  186:iconst_1        
	//   71  187:aload_0         
	//   72  188:getfield        #55  <Field DiffUtil$Callback mCallback>
	//   73  191:iload           7
	//   74  193:iload           5
	//   75  195:iload           4
	//   76  197:iadd            
	//   77  198:invokevirtual   #148 <Method Object DiffUtil$Callback.getChangePayload(int, int)>
	//   78  201:invokeinterface #152 <Method void ListUpdateCallback.onChanged(int, int, Object)>
				break;

	//*  79  206:goto            278
			case 16: // '\020'
				list.add(((Object) (new date(k + j, i, false))));
	//   80  209:aload_1         
	//   81  210:new             #134 <Class DiffUtil$PostponedUpdate>
	//   82  213:dup             
	//   83  214:iload           5
	//   84  216:iload           4
	//   85  218:iadd            
	//   86  219:iload_3         
	//   87  220:iconst_0        
	//   88  221:invokespecial   #155 <Method void DiffUtil$PostponedUpdate(int, int, boolean)>
	//   89  224:invokeinterface #158 <Method boolean List.add(Object)>
	//   90  229:pop             
				break;

	//*  91  230:goto            278
			default:
				throw new IllegalStateException((new StringBuilder()).append("unknown flag for pos ").append(k + j).append(" ").append(Long.toBinaryString(l)).toString());
	//   92  233:new             #160 <Class IllegalStateException>
	//   93  236:dup             
	//   94  237:new             #162 <Class StringBuilder>
	//   95  240:dup             
	//   96  241:invokespecial   #163 <Method void StringBuilder()>
	//   97  244:ldc1            #165 <String "unknown flag for pos ">
	//   98  246:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   99  249:iload           5
	//  100  251:iload           4
	//  101  253:iadd            
	//  102  254:invokevirtual   #172 <Method StringBuilder StringBuilder.append(int)>
	//  103  257:ldc1            #174 <String " ">
	//  104  259:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//  105  262:iload           6
	//  106  264:i2l             
	//  107  265:invokestatic    #180 <Method String Long.toBinaryString(long)>
	//  108  268:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//  109  271:invokevirtual   #184 <Method String StringBuilder.toString()>
	//  110  274:invokespecial   #187 <Method void IllegalStateException(String)>
	//  111  277:athrow          
			}
		}

	//  112  278:iload           4
	//  113  280:iconst_1        
	//  114  281:isub            
	//  115  282:istore          4
	//* 116  284:goto            23
	//  117  287:return          
	}

	private void dispatchRemovals(List list, ListUpdateCallback listupdatecallback, int i, int j, int k)
	{
		if(!mDetectMoves)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field boolean mDetectMoves>
	//*   2    4:ifne            17
		{
			listupdatecallback.onRemoved(i, j);
	//    3    7:aload_2         
	//    4    8:iload_3         
	//    5    9:iload           4
	//    6   11:invokeinterface #192 <Method void ListUpdateCallback.onRemoved(int, int)>
			return;
	//    7   16:return          
		}
		for(j--; j >= 0; j--)
	//*   8   17:iload           4
	//*   9   19:iconst_1        
	//*  10   20:isub            
	//*  11   21:istore          4
	//*  12   23:iload           4
	//*  13   25:iflt            308
		{
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
	//	               0: 91
	//	               4: 150
	//	               8: 150
	//	               16: 227
	//*  25   88:goto            254
			case 0: // '\0'
				listupdatecallback.onRemoved(i + j, 1);
	//   26   91:aload_2         
	//   27   92:iload_3         
	//   28   93:iload           4
	//   29   95:iadd            
	//   30   96:iconst_1        
	//   31   97:invokeinterface #192 <Method void ListUpdateCallback.onRemoved(int, int)>
				for(Iterator iterator = list.iterator(); iterator.hasNext();)
	//*  32  102:aload_1         
	//*  33  103:invokeinterface #123 <Method Iterator List.iterator()>
	//*  34  108:astore          8
	//*  35  110:aload           8
	//*  36  112:invokeinterface #128 <Method boolean Iterator.hasNext()>
	//*  37  117:ifeq            147
				{
					date date1 = (date)iterator.next();
	//   38  120:aload           8
	//   39  122:invokeinterface #132 <Method Object Iterator.next()>
	//   40  127:checkcast       #134 <Class DiffUtil$PostponedUpdate>
	//   41  130:astore          9
					date1.currentPos = date1.currentPos - 1;
	//   42  132:aload           9
	//   43  134:aload           9
	//   44  136:getfield        #137 <Field int DiffUtil$PostponedUpdate.currentPos>
	//   45  139:iconst_1        
	//   46  140:isub            
	//   47  141:putfield        #137 <Field int DiffUtil$PostponedUpdate.currentPos>
				}

				break;
	//   48  144:goto            110

	//*  49  147:goto            299
			case 4: // '\004'
			case 8: // '\b'
				int i1 = mOldItemStatuses[k + j] >> 5;
	//   50  150:aload_0         
	//   51  151:getfield        #45  <Field int[] mOldItemStatuses>
	//   52  154:iload           5
	//   53  156:iload           4
	//   54  158:iadd            
	//   55  159:iaload          
	//   56  160:iconst_5        
	//   57  161:ishr            
	//   58  162:istore          7
				date date = removePostponedUpdate(list, i1, false);
	//   59  164:aload_1         
	//   60  165:iload           7
	//   61  167:iconst_0        
	//   62  168:invokestatic    #141 <Method DiffUtil$PostponedUpdate removePostponedUpdate(List, int, boolean)>
	//   63  171:astore          8
				listupdatecallback.onMoved(i + j, date.currentPos - 1);
	//   64  173:aload_2         
	//   65  174:iload_3         
	//   66  175:iload           4
	//   67  177:iadd            
	//   68  178:aload           8
	//   69  180:getfield        #137 <Field int DiffUtil$PostponedUpdate.currentPos>
	//   70  183:iconst_1        
	//   71  184:isub            
	//   72  185:invokeinterface #144 <Method void ListUpdateCallback.onMoved(int, int)>
				if(l == 4)
	//*  73  190:iload           6
	//*  74  192:iconst_4        
	//*  75  193:icmpne          299
					listupdatecallback.onChanged(date.currentPos - 1, 1, mCallback.getChangePayload(k + j, i1));
	//   76  196:aload_2         
	//   77  197:aload           8
	//   78  199:getfield        #137 <Field int DiffUtil$PostponedUpdate.currentPos>
	//   79  202:iconst_1        
	//   80  203:isub            
	//   81  204:iconst_1        
	//   82  205:aload_0         
	//   83  206:getfield        #55  <Field DiffUtil$Callback mCallback>
	//   84  209:iload           5
	//   85  211:iload           4
	//   86  213:iadd            
	//   87  214:iload           7
	//   88  216:invokevirtual   #148 <Method Object DiffUtil$Callback.getChangePayload(int, int)>
	//   89  219:invokeinterface #152 <Method void ListUpdateCallback.onChanged(int, int, Object)>
				break;

	//*  90  224:goto            299
			case 16: // '\020'
				list.add(((Object) (new date(k + j, i + j, true))));
	//   91  227:aload_1         
	//   92  228:new             #134 <Class DiffUtil$PostponedUpdate>
	//   93  231:dup             
	//   94  232:iload           5
	//   95  234:iload           4
	//   96  236:iadd            
	//   97  237:iload_3         
	//   98  238:iload           4
	//   99  240:iadd            
	//  100  241:iconst_1        
	//  101  242:invokespecial   #155 <Method void DiffUtil$PostponedUpdate(int, int, boolean)>
	//  102  245:invokeinterface #158 <Method boolean List.add(Object)>
	//  103  250:pop             
				break;

	//* 104  251:goto            299
			default:
				throw new IllegalStateException((new StringBuilder()).append("unknown flag for pos ").append(k + j).append(" ").append(Long.toBinaryString(l)).toString());
	//  105  254:new             #160 <Class IllegalStateException>
	//  106  257:dup             
	//  107  258:new             #162 <Class StringBuilder>
	//  108  261:dup             
	//  109  262:invokespecial   #163 <Method void StringBuilder()>
	//  110  265:ldc1            #165 <String "unknown flag for pos ">
	//  111  267:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//  112  270:iload           5
	//  113  272:iload           4
	//  114  274:iadd            
	//  115  275:invokevirtual   #172 <Method StringBuilder StringBuilder.append(int)>
	//  116  278:ldc1            #174 <String " ">
	//  117  280:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//  118  283:iload           6
	//  119  285:i2l             
	//  120  286:invokestatic    #180 <Method String Long.toBinaryString(long)>
	//  121  289:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//  122  292:invokevirtual   #184 <Method String StringBuilder.toString()>
	//  123  295:invokespecial   #187 <Method void IllegalStateException(String)>
	//  124  298:athrow          
			}
		}

	//  125  299:iload           4
	//  126  301:iconst_1        
	//  127  302:isub            
	//  128  303:istore          4
	//* 129  305:goto            23
	//  130  308:return          
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
		int l;
		int i1;
		if(flag)
	//*   0    0:iload           4
	//*   1    2:ifeq            28
		{
			i1 = j - 1;
	//    2    5:iload_2         
	//    3    6:iconst_1        
	//    4    7:isub            
	//    5    8:istore          6
			l = i;
	//    6   10:iload_1         
	//    7   11:istore          5
			int j1 = j - 1;
	//    8   13:iload_2         
	//    9   14:iconst_1        
	//   10   15:isub            
	//   11   16:istore          7
			j = l;
	//   12   18:iload           5
	//   13   20:istore_2        
			l = j1;
	//   14   21:iload           7
	//   15   23:istore          5
		} else
	//*  16   25:goto            44
		{
			i1 = i - 1;
	//   17   28:iload_1         
	//   18   29:iconst_1        
	//   19   30:isub            
	//   20   31:istore          6
			int k1 = i - 1;
	//   21   33:iload_1         
	//   22   34:iconst_1        
	//   23   35:isub            
	//   24   36:istore          7
			l = j;
	//   25   38:iload_2         
	//   26   39:istore          5
			j = k1;
	//   27   41:iload           7
	//   28   43:istore_2        
		}
		for(; k >= 0; k--)
	//*  29   44:iload_3         
	//*  30   45:iflt            284
		{
			DiffUtil.Snake snake = (DiffUtil.Snake)mSnakes.get(k);
	//   31   48:aload_0         
	//   32   49:getfield        #43  <Field List mSnakes>
	//   33   52:iload_3         
	//   34   53:invokeinterface #89  <Method Object List.get(int)>
	//   35   58:checkcast       #91  <Class DiffUtil$Snake>
	//   36   61:astore          11
			int l1 = snake.x;
	//   37   63:aload           11
	//   38   65:getfield        #94  <Field int DiffUtil$Snake.x>
	//   39   68:istore          7
			int i2 = snake.size;
	//   40   70:aload           11
	//   41   72:getfield        #104 <Field int DiffUtil$Snake.size>
	//   42   75:istore          8
			int j2 = snake.y;
	//   43   77:aload           11
	//   44   79:getfield        #97  <Field int DiffUtil$Snake.y>
	//   45   82:istore          9
			int k2 = snake.size;
	//   46   84:aload           11
	//   47   86:getfield        #104 <Field int DiffUtil$Snake.size>
	//   48   89:istore          10
			if(flag)
	//*  49   91:iload           4
	//*  50   93:ifeq            180
				for(j--; j >= l1 + i2; j--)
	//*  51   96:iload_2         
	//*  52   97:iconst_1        
	//*  53   98:isub            
	//*  54   99:istore_2        
	//*  55  100:iload_2         
	//*  56  101:iload           7
	//*  57  103:iload           8
	//*  58  105:iadd            
	//*  59  106:icmplt          177
					if(mCallback.areItemsTheSame(j, i1))
	//*  60  109:aload_0         
	//*  61  110:getfield        #55  <Field DiffUtil$Callback mCallback>
	//*  62  113:iload_2         
	//*  63  114:iload           6
	//*  64  116:invokevirtual   #202 <Method boolean DiffUtil$Callback.areItemsTheSame(int, int)>
	//*  65  119:ifeq            170
					{
						if(mCallback.areContentsTheSame(j, i1))
	//*  66  122:aload_0         
	//*  67  123:getfield        #55  <Field DiffUtil$Callback mCallback>
	//*  68  126:iload_2         
	//*  69  127:iload           6
	//*  70  129:invokevirtual   #205 <Method boolean DiffUtil$Callback.areContentsTheSame(int, int)>
	//*  71  132:ifeq            141
							i = 8;
	//   72  135:bipush          8
	//   73  137:istore_1        
						else
	//*  74  138:goto            143
							i = 4;
	//   75  141:iconst_4        
	//   76  142:istore_1        
						mNewItemStatuses[i1] = j << 5 | 0x10;
	//   77  143:aload_0         
	//   78  144:getfield        #47  <Field int[] mNewItemStatuses>
	//   79  147:iload           6
	//   80  149:iload_2         
	//   81  150:iconst_5        
	//   82  151:ishl            
	//   83  152:bipush          16
	//   84  154:ior             
	//   85  155:iastore         
						mOldItemStatuses[j] = i1 << 5 | i;
	//   86  156:aload_0         
	//   87  157:getfield        #45  <Field int[] mOldItemStatuses>
	//   88  160:iload_2         
	//   89  161:iload           6
	//   90  163:iconst_5        
	//   91  164:ishl            
	//   92  165:iload_1         
	//   93  166:ior             
	//   94  167:iastore         
						return true;
	//   95  168:iconst_1        
	//   96  169:ireturn         
					}

	//   97  170:iload_2         
	//   98  171:iconst_1        
	//   99  172:isub            
	//  100  173:istore_2        
			else
	//* 101  174:goto            100
	//* 102  177:goto            264
				for(j = l - 1; j >= j2 + k2; j--)
	//* 103  180:iload           5
	//* 104  182:iconst_1        
	//* 105  183:isub            
	//* 106  184:istore_2        
	//* 107  185:iload_2         
	//* 108  186:iload           9
	//* 109  188:iload           10
	//* 110  190:iadd            
	//* 111  191:icmplt          264
					if(mCallback.areItemsTheSame(i1, j))
	//* 112  194:aload_0         
	//* 113  195:getfield        #55  <Field DiffUtil$Callback mCallback>
	//* 114  198:iload           6
	//* 115  200:iload_2         
	//* 116  201:invokevirtual   #202 <Method boolean DiffUtil$Callback.areItemsTheSame(int, int)>
	//* 117  204:ifeq            257
					{
						if(mCallback.areContentsTheSame(i1, j))
	//* 118  207:aload_0         
	//* 119  208:getfield        #55  <Field DiffUtil$Callback mCallback>
	//* 120  211:iload           6
	//* 121  213:iload_2         
	//* 122  214:invokevirtual   #205 <Method boolean DiffUtil$Callback.areContentsTheSame(int, int)>
	//* 123  217:ifeq            226
							k = 8;
	//  124  220:bipush          8
	//  125  222:istore_3        
						else
	//* 126  223:goto            228
							k = 4;
	//  127  226:iconst_4        
	//  128  227:istore_3        
						mOldItemStatuses[i - 1] = j << 5 | 0x10;
	//  129  228:aload_0         
	//  130  229:getfield        #45  <Field int[] mOldItemStatuses>
	//  131  232:iload_1         
	//  132  233:iconst_1        
	//  133  234:isub            
	//  134  235:iload_2         
	//  135  236:iconst_5        
	//  136  237:ishl            
	//  137  238:bipush          16
	//  138  240:ior             
	//  139  241:iastore         
						mNewItemStatuses[j] = i - 1 << 5 | k;
	//  140  242:aload_0         
	//  141  243:getfield        #47  <Field int[] mNewItemStatuses>
	//  142  246:iload_2         
	//  143  247:iload_1         
	//  144  248:iconst_1        
	//  145  249:isub            
	//  146  250:iconst_5        
	//  147  251:ishl            
	//  148  252:iload_3         
	//  149  253:ior             
	//  150  254:iastore         
						return true;
	//  151  255:iconst_1        
	//  152  256:ireturn         
					}

	//  153  257:iload_2         
	//  154  258:iconst_1        
	//  155  259:isub            
	//  156  260:istore_2        
	//* 157  261:goto            185
			j = snake.x;
	//  158  264:aload           11
	//  159  266:getfield        #94  <Field int DiffUtil$Snake.x>
	//  160  269:istore_2        
			l = snake.y;
	//  161  270:aload           11
	//  162  272:getfield        #97  <Field int DiffUtil$Snake.y>
	//  163  275:istore          5
		}

	//  164  277:iload_3         
	//  165  278:iconst_1        
	//  166  279:isub            
	//  167  280:istore_3        
	//* 168  281:goto            44
		return false;
	//  169  284:iconst_0        
	//  170  285:ireturn         
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
	//   17   31:invokeinterface #89  <Method Object List.get(int)>
	//   18   36:checkcast       #91  <Class DiffUtil$Snake>
	//   19   39:astore          9
			int i2 = snake.x;
	//   20   41:aload           9
	//   21   43:getfield        #94  <Field int DiffUtil$Snake.x>
	//   22   46:istore          7
			int j2 = snake.size;
	//   23   48:aload           9
	//   24   50:getfield        #104 <Field int DiffUtil$Snake.size>
	//   25   53:istore          8
			int j1 = snake.y;
	//   26   55:aload           9
	//   27   57:getfield        #97  <Field int DiffUtil$Snake.y>
	//   28   60:istore          5
			int l1 = snake.size;
	//   29   62:aload           9
	//   30   64:getfield        #104 <Field int DiffUtil$Snake.size>
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
			for(i = 0; i < snake.size; i++)
	//*  67  129:iconst_0        
	//*  68  130:istore_1        
	//*  69  131:iload_1         
	//*  70  132:aload           9
	//*  71  134:getfield        #104 <Field int DiffUtil$Snake.size>
	//*  72  137:icmpge          212
			{
				int i1 = snake.x + i;
	//   73  140:aload           9
	//   74  142:getfield        #94  <Field int DiffUtil$Snake.x>
	//   75  145:iload_1         
	//   76  146:iadd            
	//   77  147:istore          4
				int k1 = snake.y + i;
	//   78  149:aload           9
	//   79  151:getfield        #97  <Field int DiffUtil$Snake.y>
	//   80  154:iload_1         
	//   81  155:iadd            
	//   82  156:istore          5
				if(mCallback.areContentsTheSame(i1, k1))
	//*  83  158:aload_0         
	//*  84  159:getfield        #55  <Field DiffUtil$Callback mCallback>
	//*  85  162:iload           4
	//*  86  164:iload           5
	//*  87  166:invokevirtual   #205 <Method boolean DiffUtil$Callback.areContentsTheSame(int, int)>
	//*  88  169:ifeq            177
					j = 1;
	//   89  172:iconst_1        
	//   90  173:istore_2        
				else
	//*  91  174:goto            179
					j = 2;
	//   92  177:iconst_2        
	//   93  178:istore_2        
				mOldItemStatuses[i1] = k1 << 5 | j;
	//   94  179:aload_0         
	//   95  180:getfield        #45  <Field int[] mOldItemStatuses>
	//   96  183:iload           4
	//   97  185:iload           5
	//   98  187:iconst_5        
	//   99  188:ishl            
	//  100  189:iload_2         
	//  101  190:ior             
	//  102  191:iastore         
				mNewItemStatuses[k1] = i1 << 5 | j;
	//  103  192:aload_0         
	//  104  193:getfield        #47  <Field int[] mNewItemStatuses>
	//  105  196:iload           5
	//  106  198:iload           4
	//  107  200:iconst_5        
	//  108  201:ishl            
	//  109  202:iload_2         
	//  110  203:ior             
	//  111  204:iastore         
			}

	//  112  205:iload_1         
	//  113  206:iconst_1        
	//  114  207:iadd            
	//  115  208:istore_1        
	//* 116  209:goto            131
			j = snake.x;
	//  117  212:aload           9
	//  118  214:getfield        #94  <Field int DiffUtil$Snake.x>
	//  119  217:istore_2        
			i = snake.y;
	//  120  218:aload           9
	//  121  220:getfield        #97  <Field int DiffUtil$Snake.y>
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
		for(int j = list.size() - 1; j >= 0; j--)
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #207 <Method int List.size()>
	//*   2    6:iconst_1        
	//*   3    7:isub            
	//*   4    8:istore_3        
	//*   5    9:iload_3         
	//*   6   10:iflt            119
		{
			date date = (date)list.get(j);
	//    7   13:aload_0         
	//    8   14:iload_3         
	//    9   15:invokeinterface #89  <Method Object List.get(int)>
	//   10   20:checkcast       #134 <Class DiffUtil$PostponedUpdate>
	//   11   23:astore          5
			if(date.posInOwnerList == i && date.removal == flag)
	//*  12   25:aload           5
	//*  13   27:getfield        #215 <Field int DiffUtil$PostponedUpdate.posInOwnerList>
	//*  14   30:iload_1         
	//*  15   31:icmpne          112
	//*  16   34:aload           5
	//*  17   36:getfield        #216 <Field boolean DiffUtil$PostponedUpdate.removal>
	//*  18   39:iload_2         
	//*  19   40:icmpne          112
			{
				list.remove(j);
	//   20   43:aload_0         
	//   21   44:iload_3         
	//   22   45:invokeinterface #219 <Method Object List.remove(int)>
	//   23   50:pop             
				for(i = j; i < list.size(); i++)
	//*  24   51:iload_3         
	//*  25   52:istore_1        
	//*  26   53:iload_1         
	//*  27   54:aload_0         
	//*  28   55:invokeinterface #207 <Method int List.size()>
	//*  29   60:icmpge          109
				{
					date date1 = (date)list.get(i);
	//   30   63:aload_0         
	//   31   64:iload_1         
	//   32   65:invokeinterface #89  <Method Object List.get(int)>
	//   33   70:checkcast       #134 <Class DiffUtil$PostponedUpdate>
	//   34   73:astore          6
					int k = date1.currentPos;
	//   35   75:aload           6
	//   36   77:getfield        #137 <Field int DiffUtil$PostponedUpdate.currentPos>
	//   37   80:istore          4
					if(flag)
	//*  38   82:iload_2         
	//*  39   83:ifeq            91
						j = 1;
	//   40   86:iconst_1        
	//   41   87:istore_3        
					else
	//*  42   88:goto            93
						j = -1;
	//   43   91:iconst_m1       
	//   44   92:istore_3        
					date1.currentPos = k + j;
	//   45   93:aload           6
	//   46   95:iload           4
	//   47   97:iload_3         
	//   48   98:iadd            
	//   49   99:putfield        #137 <Field int DiffUtil$PostponedUpdate.currentPos>
				}

	//   50  102:iload_1         
	//   51  103:iconst_1        
	//   52  104:iadd            
	//   53  105:istore_1        
	//*  54  106:goto            53
				return date;
	//   55  109:aload           5
	//   56  111:areturn         
			}
		}

	//   57  112:iload_3         
	//   58  113:iconst_1        
	//   59  114:isub            
	//   60  115:istore_3        
	//*  61  116:goto            9
		return null;
	//   62  119:aconst_null     
	//   63  120:areturn         
	}

	public void dispatchUpdatesTo(ListUpdateCallback listupdatecallback)
	{
		if(listupdatecallback instanceof BatchingListUpdateCallback)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #224 <Class BatchingListUpdateCallback>
	//*   2    4:ifeq            15
			listupdatecallback = ((ListUpdateCallback) ((BatchingListUpdateCallback)listupdatecallback));
	//    3    7:aload_1         
	//    4    8:checkcast       #224 <Class BatchingListUpdateCallback>
	//    5   11:astore_1        
		else
	//*   6   12:goto            24
			listupdatecallback = ((ListUpdateCallback) (new BatchingListUpdateCallback(listupdatecallback)));
	//    7   15:new             #224 <Class BatchingListUpdateCallback>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokespecial   #226 <Method void BatchingListUpdateCallback(ListUpdateCallback)>
	//   11   23:astore_1        
		ArrayList arraylist = new ArrayList();
	//   12   24:new             #228 <Class ArrayList>
	//   13   27:dup             
	//   14   28:invokespecial   #229 <Method void ArrayList()>
	//   15   31:astore          8
		int j = mOldListSize;
	//   16   33:aload_0         
	//   17   34:getfield        #63  <Field int mOldListSize>
	//   18   37:istore_3        
		int k = mNewListSize;
	//   19   38:aload_0         
	//   20   39:getfield        #68  <Field int mNewListSize>
	//   21   42:istore          4
		for(int i = mSnakes.size() - 1; i >= 0; i--)
	//*  22   44:aload_0         
	//*  23   45:getfield        #43  <Field List mSnakes>
	//*  24   48:invokeinterface #207 <Method int List.size()>
	//*  25   53:iconst_1        
	//*  26   54:isub            
	//*  27   55:istore_2        
	//*  28   56:iload_2         
	//*  29   57:iflt            234
		{
			DiffUtil.Snake snake = (DiffUtil.Snake)mSnakes.get(i);
	//   30   60:aload_0         
	//   31   61:getfield        #43  <Field List mSnakes>
	//   32   64:iload_2         
	//   33   65:invokeinterface #89  <Method Object List.get(int)>
	//   34   70:checkcast       #91  <Class DiffUtil$Snake>
	//   35   73:astore          9
			int l = snake.size;
	//   36   75:aload           9
	//   37   77:getfield        #104 <Field int DiffUtil$Snake.size>
	//   38   80:istore          5
			int i1 = snake.x + l;
	//   39   82:aload           9
	//   40   84:getfield        #94  <Field int DiffUtil$Snake.x>
	//   41   87:iload           5
	//   42   89:iadd            
	//   43   90:istore          6
			int j1 = snake.y + l;
	//   44   92:aload           9
	//   45   94:getfield        #97  <Field int DiffUtil$Snake.y>
	//   46   97:iload           5
	//   47   99:iadd            
	//   48  100:istore          7
			if(i1 < j)
	//*  49  102:iload           6
	//*  50  104:iload_3         
	//*  51  105:icmpge          123
				dispatchRemovals(((List) (arraylist)), listupdatecallback, i1, j - i1, i1);
	//   52  108:aload_0         
	//   53  109:aload           8
	//   54  111:aload_1         
	//   55  112:iload           6
	//   56  114:iload_3         
	//   57  115:iload           6
	//   58  117:isub            
	//   59  118:iload           6
	//   60  120:invokespecial   #231 <Method void dispatchRemovals(List, ListUpdateCallback, int, int, int)>
			if(j1 < k)
	//*  61  123:iload           7
	//*  62  125:iload           4
	//*  63  127:icmpge          146
				dispatchAdditions(((List) (arraylist)), listupdatecallback, i1, k - j1, j1);
	//   64  130:aload_0         
	//   65  131:aload           8
	//   66  133:aload_1         
	//   67  134:iload           6
	//   68  136:iload           4
	//   69  138:iload           7
	//   70  140:isub            
	//   71  141:iload           7
	//   72  143:invokespecial   #233 <Method void dispatchAdditions(List, ListUpdateCallback, int, int, int)>
			for(j = l - 1; j >= 0; j--)
	//*  73  146:iload           5
	//*  74  148:iconst_1        
	//*  75  149:isub            
	//*  76  150:istore_3        
	//*  77  151:iload_3         
	//*  78  152:iflt            214
				if((mOldItemStatuses[snake.x + j] & 0x1f) == 2)
	//*  79  155:aload_0         
	//*  80  156:getfield        #45  <Field int[] mOldItemStatuses>
	//*  81  159:aload           9
	//*  82  161:getfield        #94  <Field int DiffUtil$Snake.x>
	//*  83  164:iload_3         
	//*  84  165:iadd            
	//*  85  166:iaload          
	//*  86  167:bipush          31
	//*  87  169:iand            
	//*  88  170:iconst_2        
	//*  89  171:icmpne          207
					((BatchingListUpdateCallback) (listupdatecallback)).onChanged(snake.x + j, 1, mCallback.getChangePayload(snake.x + j, snake.y + j));
	//   90  174:aload_1         
	//   91  175:aload           9
	//   92  177:getfield        #94  <Field int DiffUtil$Snake.x>
	//   93  180:iload_3         
	//   94  181:iadd            
	//   95  182:iconst_1        
	//   96  183:aload_0         
	//   97  184:getfield        #55  <Field DiffUtil$Callback mCallback>
	//   98  187:aload           9
	//   99  189:getfield        #94  <Field int DiffUtil$Snake.x>
	//  100  192:iload_3         
	//  101  193:iadd            
	//  102  194:aload           9
	//  103  196:getfield        #97  <Field int DiffUtil$Snake.y>
	//  104  199:iload_3         
	//  105  200:iadd            
	//  106  201:invokevirtual   #148 <Method Object DiffUtil$Callback.getChangePayload(int, int)>
	//  107  204:invokevirtual   #234 <Method void BatchingListUpdateCallback.onChanged(int, int, Object)>

	//  108  207:iload_3         
	//  109  208:iconst_1        
	//  110  209:isub            
	//  111  210:istore_3        
	//* 112  211:goto            151
			j = snake.x;
	//  113  214:aload           9
	//  114  216:getfield        #94  <Field int DiffUtil$Snake.x>
	//  115  219:istore_3        
			k = snake.y;
	//  116  220:aload           9
	//  117  222:getfield        #97  <Field int DiffUtil$Snake.y>
	//  118  225:istore          4
		}

	//  119  227:iload_2         
	//  120  228:iconst_1        
	//  121  229:isub            
	//  122  230:istore_2        
	//* 123  231:goto            56
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
