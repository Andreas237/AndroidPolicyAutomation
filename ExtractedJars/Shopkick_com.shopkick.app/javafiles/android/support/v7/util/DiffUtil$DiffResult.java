// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;

import java.util.*;

// Referenced classes of package android.support.v7.util:
//			DiffUtil, ListUpdateCallback, BatchingListUpdateCallback, AdapterListUpdateCallback

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
	//*  13   25:iflt            267
		{
			int ai[] = mNewItemStatuses;
	//   14   28:aload_0         
	//   15   29:getfield        #47  <Field int[] mNewItemStatuses>
	//   16   32:astore          9
			int l = k + j;
	//   17   34:iload           5
	//   18   36:iload           4
	//   19   38:iadd            
	//   20   39:istore          6
			int i1 = ai[l] & 0x1f;
	//   21   41:aload           9
	//   22   43:iload           6
	//   23   45:iaload          
	//   24   46:bipush          31
	//   25   48:iand            
	//   26   49:istore          7
			if(i1 != 0)
	//*  27   51:iload           7
	//*  28   53:ifeq            205
			{
				if(i1 != 4 && i1 != 8)
	//*  29   56:iload           7
	//*  30   58:iconst_4        
	//*  31   59:icmpeq          149
	//*  32   62:iload           7
	//*  33   64:bipush          8
	//*  34   66:icmpeq          149
				{
					if(i1 == 16)
	//*  35   69:iload           7
	//*  36   71:bipush          16
	//*  37   73:icmpne          97
					{
						list.add(((Object) (new date(l, i, false))));
	//   38   76:aload_1         
	//   39   77:new             #121 <Class DiffUtil$PostponedUpdate>
	//   40   80:dup             
	//   41   81:iload           6
	//   42   83:iload_3         
	//   43   84:iconst_0        
	//   44   85:invokespecial   #124 <Method void DiffUtil$PostponedUpdate(int, int, boolean)>
	//   45   88:invokeinterface #127 <Method boolean List.add(Object)>
	//   46   93:pop             
					} else
	//*  47   94:goto            258
					{
						list = ((List) (new StringBuilder()));
	//   48   97:new             #129 <Class StringBuilder>
	//   49  100:dup             
	//   50  101:invokespecial   #130 <Method void StringBuilder()>
	//   51  104:astore_1        
						((StringBuilder) (list)).append("unknown flag for pos ");
	//   52  105:aload_1         
	//   53  106:ldc1            #132 <String "unknown flag for pos ">
	//   54  108:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   55  111:pop             
						((StringBuilder) (list)).append(l);
	//   56  112:aload_1         
	//   57  113:iload           6
	//   58  115:invokevirtual   #139 <Method StringBuilder StringBuilder.append(int)>
	//   59  118:pop             
						((StringBuilder) (list)).append(" ");
	//   60  119:aload_1         
	//   61  120:ldc1            #141 <String " ">
	//   62  122:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   63  125:pop             
						((StringBuilder) (list)).append(Long.toBinaryString(i1));
	//   64  126:aload_1         
	//   65  127:iload           7
	//   66  129:i2l             
	//   67  130:invokestatic    #147 <Method String Long.toBinaryString(long)>
	//   68  133:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   69  136:pop             
						throw new IllegalStateException(((StringBuilder) (list)).toString());
	//   70  137:new             #149 <Class IllegalStateException>
	//   71  140:dup             
	//   72  141:aload_1         
	//   73  142:invokevirtual   #153 <Method String StringBuilder.toString()>
	//   74  145:invokespecial   #156 <Method void IllegalStateException(String)>
	//   75  148:athrow          
					}
					continue;
				}
				int j1 = mNewItemStatuses[l] >> 5;
	//   76  149:aload_0         
	//   77  150:getfield        #47  <Field int[] mNewItemStatuses>
	//   78  153:iload           6
	//   79  155:iaload          
	//   80  156:iconst_5        
	//   81  157:ishr            
	//   82  158:istore          8
				listupdatecallback.onMoved(removePostponedUpdate(list, j1, true).currentPos, i);
	//   83  160:aload_2         
	//   84  161:aload_1         
	//   85  162:iload           8
	//   86  164:iconst_1        
	//   87  165:invokestatic    #160 <Method DiffUtil$PostponedUpdate removePostponedUpdate(List, int, boolean)>
	//   88  168:getfield        #163 <Field int DiffUtil$PostponedUpdate.currentPos>
	//   89  171:iload_3         
	//   90  172:invokeinterface #166 <Method void ListUpdateCallback.onMoved(int, int)>
				if(i1 == 4)
	//*  91  177:iload           7
	//*  92  179:iconst_4        
	//*  93  180:icmpne          258
					listupdatecallback.onChanged(i, 1, mCallback.getChangePayload(j1, l));
	//   94  183:aload_2         
	//   95  184:iload_3         
	//   96  185:iconst_1        
	//   97  186:aload_0         
	//   98  187:getfield        #55  <Field DiffUtil$Callback mCallback>
	//   99  190:iload           8
	//  100  192:iload           6
	//  101  194:invokevirtual   #170 <Method Object DiffUtil$Callback.getChangePayload(int, int)>
	//  102  197:invokeinterface #174 <Method void ListUpdateCallback.onChanged(int, int, Object)>
				continue;
	//  103  202:goto            258
			}
			listupdatecallback.onInserted(i, 1);
	//  104  205:aload_2         
	//  105  206:iload_3         
	//  106  207:iconst_1        
	//  107  208:invokeinterface #119 <Method void ListUpdateCallback.onInserted(int, int)>
			for(Iterator iterator = list.iterator(); iterator.hasNext();)
	//* 108  213:aload_1         
	//* 109  214:invokeinterface #178 <Method Iterator List.iterator()>
	//* 110  219:astore          9
	//* 111  221:aload           9
	//* 112  223:invokeinterface #183 <Method boolean Iterator.hasNext()>
	//* 113  228:ifeq            258
			{
				date date = (date)iterator.next();
	//  114  231:aload           9
	//  115  233:invokeinterface #187 <Method Object Iterator.next()>
	//  116  238:checkcast       #121 <Class DiffUtil$PostponedUpdate>
	//  117  241:astore          10
				date.currentPos = date.currentPos + 1;
	//  118  243:aload           10
	//  119  245:aload           10
	//  120  247:getfield        #163 <Field int DiffUtil$PostponedUpdate.currentPos>
	//  121  250:iconst_1        
	//  122  251:iadd            
	//  123  252:putfield        #163 <Field int DiffUtil$PostponedUpdate.currentPos>
			}

		}

	//  124  255:goto            221
	//  125  258:iload           4
	//  126  260:iconst_1        
	//  127  261:isub            
	//  128  262:istore          4
	//* 129  264:goto            23
	//  130  267:return          
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
	//*  13   25:iflt            288
		{
			int ai[] = mOldItemStatuses;
	//   14   28:aload_0         
	//   15   29:getfield        #45  <Field int[] mOldItemStatuses>
	//   16   32:astore          9
			int l = k + j;
	//   17   34:iload           5
	//   18   36:iload           4
	//   19   38:iadd            
	//   20   39:istore          6
			int i1 = ai[l] & 0x1f;
	//   21   41:aload           9
	//   22   43:iload           6
	//   23   45:iaload          
	//   24   46:bipush          31
	//   25   48:iand            
	//   26   49:istore          7
			if(i1 != 0)
	//*  27   51:iload           7
	//*  28   53:ifeq            223
			{
				if(i1 != 4 && i1 != 8)
	//*  29   56:iload           7
	//*  30   58:iconst_4        
	//*  31   59:icmpeq          152
	//*  32   62:iload           7
	//*  33   64:bipush          8
	//*  34   66:icmpeq          152
				{
					if(i1 == 16)
	//*  35   69:iload           7
	//*  36   71:bipush          16
	//*  37   73:icmpne          100
					{
						list.add(((Object) (new date(l, i + j, true))));
	//   38   76:aload_1         
	//   39   77:new             #121 <Class DiffUtil$PostponedUpdate>
	//   40   80:dup             
	//   41   81:iload           6
	//   42   83:iload_3         
	//   43   84:iload           4
	//   44   86:iadd            
	//   45   87:iconst_1        
	//   46   88:invokespecial   #124 <Method void DiffUtil$PostponedUpdate(int, int, boolean)>
	//   47   91:invokeinterface #127 <Method boolean List.add(Object)>
	//   48   96:pop             
					} else
	//*  49   97:goto            279
					{
						list = ((List) (new StringBuilder()));
	//   50  100:new             #129 <Class StringBuilder>
	//   51  103:dup             
	//   52  104:invokespecial   #130 <Method void StringBuilder()>
	//   53  107:astore_1        
						((StringBuilder) (list)).append("unknown flag for pos ");
	//   54  108:aload_1         
	//   55  109:ldc1            #132 <String "unknown flag for pos ">
	//   56  111:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   57  114:pop             
						((StringBuilder) (list)).append(l);
	//   58  115:aload_1         
	//   59  116:iload           6
	//   60  118:invokevirtual   #139 <Method StringBuilder StringBuilder.append(int)>
	//   61  121:pop             
						((StringBuilder) (list)).append(" ");
	//   62  122:aload_1         
	//   63  123:ldc1            #141 <String " ">
	//   64  125:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   65  128:pop             
						((StringBuilder) (list)).append(Long.toBinaryString(i1));
	//   66  129:aload_1         
	//   67  130:iload           7
	//   68  132:i2l             
	//   69  133:invokestatic    #147 <Method String Long.toBinaryString(long)>
	//   70  136:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   71  139:pop             
						throw new IllegalStateException(((StringBuilder) (list)).toString());
	//   72  140:new             #149 <Class IllegalStateException>
	//   73  143:dup             
	//   74  144:aload_1         
	//   75  145:invokevirtual   #153 <Method String StringBuilder.toString()>
	//   76  148:invokespecial   #156 <Method void IllegalStateException(String)>
	//   77  151:athrow          
					}
					continue;
				}
				int j1 = mOldItemStatuses[l] >> 5;
	//   78  152:aload_0         
	//   79  153:getfield        #45  <Field int[] mOldItemStatuses>
	//   80  156:iload           6
	//   81  158:iaload          
	//   82  159:iconst_5        
	//   83  160:ishr            
	//   84  161:istore          8
				date date = removePostponedUpdate(list, j1, false);
	//   85  163:aload_1         
	//   86  164:iload           8
	//   87  166:iconst_0        
	//   88  167:invokestatic    #160 <Method DiffUtil$PostponedUpdate removePostponedUpdate(List, int, boolean)>
	//   89  170:astore          9
				listupdatecallback.onMoved(i + j, date.currentPos - 1);
	//   90  172:aload_2         
	//   91  173:iload_3         
	//   92  174:iload           4
	//   93  176:iadd            
	//   94  177:aload           9
	//   95  179:getfield        #163 <Field int DiffUtil$PostponedUpdate.currentPos>
	//   96  182:iconst_1        
	//   97  183:isub            
	//   98  184:invokeinterface #166 <Method void ListUpdateCallback.onMoved(int, int)>
				if(i1 == 4)
	//*  99  189:iload           7
	//* 100  191:iconst_4        
	//* 101  192:icmpne          279
					listupdatecallback.onChanged(date.currentPos - 1, 1, mCallback.getChangePayload(l, j1));
	//  102  195:aload_2         
	//  103  196:aload           9
	//  104  198:getfield        #163 <Field int DiffUtil$PostponedUpdate.currentPos>
	//  105  201:iconst_1        
	//  106  202:isub            
	//  107  203:iconst_1        
	//  108  204:aload_0         
	//  109  205:getfield        #55  <Field DiffUtil$Callback mCallback>
	//  110  208:iload           6
	//  111  210:iload           8
	//  112  212:invokevirtual   #170 <Method Object DiffUtil$Callback.getChangePayload(int, int)>
	//  113  215:invokeinterface #174 <Method void ListUpdateCallback.onChanged(int, int, Object)>
				continue;
	//  114  220:goto            279
			}
			listupdatecallback.onRemoved(i + j, 1);
	//  115  223:aload_2         
	//  116  224:iload_3         
	//  117  225:iload           4
	//  118  227:iadd            
	//  119  228:iconst_1        
	//  120  229:invokeinterface #192 <Method void ListUpdateCallback.onRemoved(int, int)>
			for(Iterator iterator = list.iterator(); iterator.hasNext();)
	//* 121  234:aload_1         
	//* 122  235:invokeinterface #178 <Method Iterator List.iterator()>
	//* 123  240:astore          9
	//* 124  242:aload           9
	//* 125  244:invokeinterface #183 <Method boolean Iterator.hasNext()>
	//* 126  249:ifeq            279
			{
				date date1 = (date)iterator.next();
	//  127  252:aload           9
	//  128  254:invokeinterface #187 <Method Object Iterator.next()>
	//  129  259:checkcast       #121 <Class DiffUtil$PostponedUpdate>
	//  130  262:astore          10
				date1.currentPos = date1.currentPos - 1;
	//  131  264:aload           10
	//  132  266:aload           10
	//  133  268:getfield        #163 <Field int DiffUtil$PostponedUpdate.currentPos>
	//  134  271:iconst_1        
	//  135  272:isub            
	//  136  273:putfield        #163 <Field int DiffUtil$PostponedUpdate.currentPos>
			}

		}

	//  137  276:goto            242
	//  138  279:iload           4
	//  139  281:iconst_1        
	//  140  282:isub            
	//  141  283:istore          4
	//* 142  285:goto            23
	//  143  288:return          
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
	//*   1    2:ifeq            19
		{
			l = j - 1;
	//    2    5:iload_2         
	//    3    6:iconst_1        
	//    4    7:isub            
	//    5    8:istore          5
			j = i;
	//    6   10:iload_1         
	//    7   11:istore_2        
			i1 = l;
	//    8   12:iload           5
	//    9   14:istore          6
		} else
	//*  10   16:goto            34
		{
			int j1 = i - 1;
	//   11   19:iload_1         
	//   12   20:iconst_1        
	//   13   21:isub            
	//   14   22:istore          7
			i1 = j1;
	//   15   24:iload           7
	//   16   26:istore          6
			l = j;
	//   17   28:iload_2         
	//   18   29:istore          5
			j = j1;
	//   19   31:iload           7
	//   20   33:istore_2        
		}
		for(; k >= 0; k--)
	//*  21   34:iload_3         
	//*  22   35:iflt            277
		{
			Object obj = ((Object) ((DiffUtil.Snake)mSnakes.get(k)));
	//   23   38:aload_0         
	//   24   39:getfield        #43  <Field List mSnakes>
	//   25   42:iload_3         
	//   26   43:invokeinterface #89  <Method Object List.get(int)>
	//   27   48:checkcast       #91  <Class DiffUtil$Snake>
	//   28   51:astore          12
			int k1 = ((DiffUtil.Snake) (obj)).x;
	//   29   53:aload           12
	//   30   55:getfield        #94  <Field int DiffUtil$Snake.x>
	//   31   58:istore          8
			int l1 = ((DiffUtil.Snake) (obj)).size;
	//   32   60:aload           12
	//   33   62:getfield        #104 <Field int DiffUtil$Snake.size>
	//   34   65:istore          9
			int i2 = ((DiffUtil.Snake) (obj)).y;
	//   35   67:aload           12
	//   36   69:getfield        #97  <Field int DiffUtil$Snake.y>
	//   37   72:istore          10
			int j2 = ((DiffUtil.Snake) (obj)).size;
	//   38   74:aload           12
	//   39   76:getfield        #104 <Field int DiffUtil$Snake.size>
	//   40   79:istore          11
			byte byte0 = 8;
	//   41   81:bipush          8
	//   42   83:istore          7
			if(flag)
	//*  43   85:iload           4
	//*  44   87:ifeq            170
				for(j--; j >= k1 + l1; j--)
	//*  45   90:iload_2         
	//*  46   91:iconst_1        
	//*  47   92:isub            
	//*  48   93:istore_2        
	//*  49   94:iload_2         
	//*  50   95:iload           8
	//*  51   97:iload           9
	//*  52   99:iadd            
	//*  53  100:icmplt          257
					if(mCallback.areItemsTheSame(j, i1))
	//*  54  103:aload_0         
	//*  55  104:getfield        #55  <Field DiffUtil$Callback mCallback>
	//*  56  107:iload_2         
	//*  57  108:iload           6
	//*  58  110:invokevirtual   #202 <Method boolean DiffUtil$Callback.areItemsTheSame(int, int)>
	//*  59  113:ifeq            163
					{
						if(!mCallback.areContentsTheSame(j, i1))
	//*  60  116:aload_0         
	//*  61  117:getfield        #55  <Field DiffUtil$Callback mCallback>
	//*  62  120:iload_2         
	//*  63  121:iload           6
	//*  64  123:invokevirtual   #205 <Method boolean DiffUtil$Callback.areContentsTheSame(int, int)>
	//*  65  126:ifeq            132
	//*  66  129:goto            135
							byte0 = 4;
	//   67  132:iconst_4        
	//   68  133:istore          7
						mNewItemStatuses[i1] = j << 5 | 0x10;
	//   69  135:aload_0         
	//   70  136:getfield        #47  <Field int[] mNewItemStatuses>
	//   71  139:iload           6
	//   72  141:iload_2         
	//   73  142:iconst_5        
	//   74  143:ishl            
	//   75  144:bipush          16
	//   76  146:ior             
	//   77  147:iastore         
						mOldItemStatuses[j] = i1 << 5 | byte0;
	//   78  148:aload_0         
	//   79  149:getfield        #45  <Field int[] mOldItemStatuses>
	//   80  152:iload_2         
	//   81  153:iload           6
	//   82  155:iconst_5        
	//   83  156:ishl            
	//   84  157:iload           7
	//   85  159:ior             
	//   86  160:iastore         
						return true;
	//   87  161:iconst_1        
	//   88  162:ireturn         
					}

	//   89  163:iload_2         
	//   90  164:iconst_1        
	//   91  165:isub            
	//   92  166:istore_2        
			else
	//*  93  167:goto            94
				for(j = l - 1; j >= i2 + j2; j--)
	//*  94  170:iload           5
	//*  95  172:iconst_1        
	//*  96  173:isub            
	//*  97  174:istore_2        
	//*  98  175:iload_2         
	//*  99  176:iload           10
	//* 100  178:iload           11
	//* 101  180:iadd            
	//* 102  181:icmplt          257
					if(mCallback.areItemsTheSame(i1, j))
	//* 103  184:aload_0         
	//* 104  185:getfield        #55  <Field DiffUtil$Callback mCallback>
	//* 105  188:iload           6
	//* 106  190:iload_2         
	//* 107  191:invokevirtual   #202 <Method boolean DiffUtil$Callback.areItemsTheSame(int, int)>
	//* 108  194:ifeq            250
					{
						if(!mCallback.areContentsTheSame(i1, j))
	//* 109  197:aload_0         
	//* 110  198:getfield        #55  <Field DiffUtil$Callback mCallback>
	//* 111  201:iload           6
	//* 112  203:iload_2         
	//* 113  204:invokevirtual   #205 <Method boolean DiffUtil$Callback.areContentsTheSame(int, int)>
	//* 114  207:ifeq            213
	//* 115  210:goto            216
							byte0 = 4;
	//  116  213:iconst_4        
	//  117  214:istore          7
						obj = ((Object) (mOldItemStatuses));
	//  118  216:aload_0         
	//  119  217:getfield        #45  <Field int[] mOldItemStatuses>
	//  120  220:astore          12
						i--;
	//  121  222:iload_1         
	//  122  223:iconst_1        
	//  123  224:isub            
	//  124  225:istore_1        
						obj[i] = j << 5 | 0x10;
	//  125  226:aload           12
	//  126  228:iload_1         
	//  127  229:iload_2         
	//  128  230:iconst_5        
	//  129  231:ishl            
	//  130  232:bipush          16
	//  131  234:ior             
	//  132  235:iastore         
						mNewItemStatuses[j] = i << 5 | byte0;
	//  133  236:aload_0         
	//  134  237:getfield        #47  <Field int[] mNewItemStatuses>
	//  135  240:iload_2         
	//  136  241:iload_1         
	//  137  242:iconst_5        
	//  138  243:ishl            
	//  139  244:iload           7
	//  140  246:ior             
	//  141  247:iastore         
						return true;
	//  142  248:iconst_1        
	//  143  249:ireturn         
					}

	//  144  250:iload_2         
	//  145  251:iconst_1        
	//  146  252:isub            
	//  147  253:istore_2        
	//* 148  254:goto            175
			j = ((DiffUtil.Snake) (obj)).x;
	//  149  257:aload           12
	//  150  259:getfield        #94  <Field int DiffUtil$Snake.x>
	//  151  262:istore_2        
			l = ((DiffUtil.Snake) (obj)).y;
	//  152  263:aload           12
	//  153  265:getfield        #97  <Field int DiffUtil$Snake.y>
	//  154  268:istore          5
		}

	//  155  270:iload_3         
	//  156  271:iconst_1        
	//  157  272:isub            
	//  158  273:istore_3        
	//* 159  274:goto            34
		return false;
	//  160  277:iconst_0        
	//  161  278:ireturn         
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
	//*   6   10:iflt            117
		{
			date date = (date)list.get(j);
	//    7   13:aload_0         
	//    8   14:iload_3         
	//    9   15:invokeinterface #89  <Method Object List.get(int)>
	//   10   20:checkcast       #121 <Class DiffUtil$PostponedUpdate>
	//   11   23:astore          5
			if(date.posInOwnerList == i && date.removal == flag)
	//*  12   25:aload           5
	//*  13   27:getfield        #215 <Field int DiffUtil$PostponedUpdate.posInOwnerList>
	//*  14   30:iload_1         
	//*  15   31:icmpne          110
	//*  16   34:aload           5
	//*  17   36:getfield        #216 <Field boolean DiffUtil$PostponedUpdate.removal>
	//*  18   39:iload_2         
	//*  19   40:icmpne          110
			{
				list.remove(j);
	//   20   43:aload_0         
	//   21   44:iload_3         
	//   22   45:invokeinterface #219 <Method Object List.remove(int)>
	//   23   50:pop             
				for(; j < list.size(); j++)
	//*  24   51:iload_3         
	//*  25   52:aload_0         
	//*  26   53:invokeinterface #207 <Method int List.size()>
	//*  27   58:icmpge          107
				{
					date date1 = (date)list.get(j);
	//   28   61:aload_0         
	//   29   62:iload_3         
	//   30   63:invokeinterface #89  <Method Object List.get(int)>
	//   31   68:checkcast       #121 <Class DiffUtil$PostponedUpdate>
	//   32   71:astore          6
					int k = date1.currentPos;
	//   33   73:aload           6
	//   34   75:getfield        #163 <Field int DiffUtil$PostponedUpdate.currentPos>
	//   35   78:istore          4
					if(flag)
	//*  36   80:iload_2         
	//*  37   81:ifeq            89
						i = 1;
	//   38   84:iconst_1        
	//   39   85:istore_1        
					else
	//*  40   86:goto            91
						i = -1;
	//   41   89:iconst_m1       
	//   42   90:istore_1        
					date1.currentPos = k + i;
	//   43   91:aload           6
	//   44   93:iload           4
	//   45   95:iload_1         
	//   46   96:iadd            
	//   47   97:putfield        #163 <Field int DiffUtil$PostponedUpdate.currentPos>
				}

	//   48  100:iload_3         
	//   49  101:iconst_1        
	//   50  102:iadd            
	//   51  103:istore_3        
	//*  52  104:goto            51
				return date;
	//   53  107:aload           5
	//   54  109:areturn         
			}
		}

	//   55  110:iload_3         
	//   56  111:iconst_1        
	//   57  112:isub            
	//   58  113:istore_3        
	//*  59  114:goto            9
		return null;
	//   60  117:aconst_null     
	//   61  118:areturn         
	}

	public int convertNewPositionToOld(int i)
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            32
		{
			int ai[] = mNewItemStatuses;
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field int[] mNewItemStatuses>
	//    4    8:astore_2        
			if(i < ai.length)
	//*   5    9:iload_1         
	//*   6   10:aload_2         
	//*   7   11:arraylength     
	//*   8   12:icmpge          32
			{
				i = ai[i];
	//    9   15:aload_2         
	//   10   16:iload_1         
	//   11   17:iaload          
	//   12   18:istore_1        
				if((i & 0x1f) == 0)
	//*  13   19:iload_1         
	//*  14   20:bipush          31
	//*  15   22:iand            
	//*  16   23:ifne            28
					return -1;
	//   17   26:iconst_m1       
	//   18   27:ireturn         
				else
					return i >> 5;
	//   19   28:iload_1         
	//   20   29:iconst_5        
	//   21   30:ishr            
	//   22   31:ireturn         
			}
		}
		StringBuilder stringbuilder = new StringBuilder();
	//   23   32:new             #129 <Class StringBuilder>
	//   24   35:dup             
	//   25   36:invokespecial   #130 <Method void StringBuilder()>
	//   26   39:astore_2        
		stringbuilder.append("Index out of bounds - passed position = ");
	//   27   40:aload_2         
	//   28   41:ldc1            #228 <String "Index out of bounds - passed position = ">
	//   29   43:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   30   46:pop             
		stringbuilder.append(i);
	//   31   47:aload_2         
	//   32   48:iload_1         
	//   33   49:invokevirtual   #139 <Method StringBuilder StringBuilder.append(int)>
	//   34   52:pop             
		stringbuilder.append(", new list size = ");
	//   35   53:aload_2         
	//   36   54:ldc1            #230 <String ", new list size = ">
	//   37   56:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   38   59:pop             
		stringbuilder.append(mNewItemStatuses.length);
	//   39   60:aload_2         
	//   40   61:aload_0         
	//   41   62:getfield        #47  <Field int[] mNewItemStatuses>
	//   42   65:arraylength     
	//   43   66:invokevirtual   #139 <Method StringBuilder StringBuilder.append(int)>
	//   44   69:pop             
		throw new IndexOutOfBoundsException(stringbuilder.toString());
	//   45   70:new             #232 <Class IndexOutOfBoundsException>
	//   46   73:dup             
	//   47   74:aload_2         
	//   48   75:invokevirtual   #153 <Method String StringBuilder.toString()>
	//   49   78:invokespecial   #233 <Method void IndexOutOfBoundsException(String)>
	//   50   81:athrow          
	}

	public int convertOldPositionToNew(int i)
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            32
		{
			int ai[] = mOldItemStatuses;
	//    2    4:aload_0         
	//    3    5:getfield        #45  <Field int[] mOldItemStatuses>
	//    4    8:astore_2        
			if(i < ai.length)
	//*   5    9:iload_1         
	//*   6   10:aload_2         
	//*   7   11:arraylength     
	//*   8   12:icmpge          32
			{
				i = ai[i];
	//    9   15:aload_2         
	//   10   16:iload_1         
	//   11   17:iaload          
	//   12   18:istore_1        
				if((i & 0x1f) == 0)
	//*  13   19:iload_1         
	//*  14   20:bipush          31
	//*  15   22:iand            
	//*  16   23:ifne            28
					return -1;
	//   17   26:iconst_m1       
	//   18   27:ireturn         
				else
					return i >> 5;
	//   19   28:iload_1         
	//   20   29:iconst_5        
	//   21   30:ishr            
	//   22   31:ireturn         
			}
		}
		StringBuilder stringbuilder = new StringBuilder();
	//   23   32:new             #129 <Class StringBuilder>
	//   24   35:dup             
	//   25   36:invokespecial   #130 <Method void StringBuilder()>
	//   26   39:astore_2        
		stringbuilder.append("Index out of bounds - passed position = ");
	//   27   40:aload_2         
	//   28   41:ldc1            #228 <String "Index out of bounds - passed position = ">
	//   29   43:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   30   46:pop             
		stringbuilder.append(i);
	//   31   47:aload_2         
	//   32   48:iload_1         
	//   33   49:invokevirtual   #139 <Method StringBuilder StringBuilder.append(int)>
	//   34   52:pop             
		stringbuilder.append(", old list size = ");
	//   35   53:aload_2         
	//   36   54:ldc1            #237 <String ", old list size = ">
	//   37   56:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   38   59:pop             
		stringbuilder.append(mOldItemStatuses.length);
	//   39   60:aload_2         
	//   40   61:aload_0         
	//   41   62:getfield        #45  <Field int[] mOldItemStatuses>
	//   42   65:arraylength     
	//   43   66:invokevirtual   #139 <Method StringBuilder StringBuilder.append(int)>
	//   44   69:pop             
		throw new IndexOutOfBoundsException(stringbuilder.toString());
	//   45   70:new             #232 <Class IndexOutOfBoundsException>
	//   46   73:dup             
	//   47   74:aload_2         
	//   48   75:invokevirtual   #153 <Method String StringBuilder.toString()>
	//   49   78:invokespecial   #233 <Method void IndexOutOfBoundsException(String)>
	//   50   81:athrow          
	}

	public void dispatchUpdatesTo(ListUpdateCallback listupdatecallback)
	{
		if(listupdatecallback instanceof BatchingListUpdateCallback)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #242 <Class BatchingListUpdateCallback>
	//*   2    4:ifeq            15
			listupdatecallback = ((ListUpdateCallback) ((BatchingListUpdateCallback)listupdatecallback));
	//    3    7:aload_1         
	//    4    8:checkcast       #242 <Class BatchingListUpdateCallback>
	//    5   11:astore_1        
		else
	//*   6   12:goto            24
			listupdatecallback = ((ListUpdateCallback) (new BatchingListUpdateCallback(listupdatecallback)));
	//    7   15:new             #242 <Class BatchingListUpdateCallback>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokespecial   #244 <Method void BatchingListUpdateCallback(ListUpdateCallback)>
	//   11   23:astore_1        
		ArrayList arraylist = new ArrayList();
	//   12   24:new             #246 <Class ArrayList>
	//   13   27:dup             
	//   14   28:invokespecial   #247 <Method void ArrayList()>
	//   15   31:astore          8
		int j = mOldListSize;
	//   16   33:aload_0         
	//   17   34:getfield        #63  <Field int mOldListSize>
	//   18   37:istore_3        
		int k = mNewListSize;
	//   19   38:aload_0         
	//   20   39:getfield        #68  <Field int mNewListSize>
	//   21   42:istore          4
		int i = mSnakes.size();
	//   22   44:aload_0         
	//   23   45:getfield        #43  <Field List mSnakes>
	//   24   48:invokeinterface #207 <Method int List.size()>
	//   25   53:istore_2        
		for(i--; i >= 0; i--)
	//*  26   54:iload_2         
	//*  27   55:iconst_1        
	//*  28   56:isub            
	//*  29   57:istore_2        
	//*  30   58:iload_2         
	//*  31   59:iflt            236
		{
			DiffUtil.Snake snake = (DiffUtil.Snake)mSnakes.get(i);
	//   32   62:aload_0         
	//   33   63:getfield        #43  <Field List mSnakes>
	//   34   66:iload_2         
	//   35   67:invokeinterface #89  <Method Object List.get(int)>
	//   36   72:checkcast       #91  <Class DiffUtil$Snake>
	//   37   75:astore          9
			int l = snake.size;
	//   38   77:aload           9
	//   39   79:getfield        #104 <Field int DiffUtil$Snake.size>
	//   40   82:istore          5
			int i1 = snake.x + l;
	//   41   84:aload           9
	//   42   86:getfield        #94  <Field int DiffUtil$Snake.x>
	//   43   89:iload           5
	//   44   91:iadd            
	//   45   92:istore          6
			int j1 = snake.y + l;
	//   46   94:aload           9
	//   47   96:getfield        #97  <Field int DiffUtil$Snake.y>
	//   48   99:iload           5
	//   49  101:iadd            
	//   50  102:istore          7
			if(i1 < j)
	//*  51  104:iload           6
	//*  52  106:iload_3         
	//*  53  107:icmpge          125
				dispatchRemovals(((List) (arraylist)), listupdatecallback, i1, j - i1, i1);
	//   54  110:aload_0         
	//   55  111:aload           8
	//   56  113:aload_1         
	//   57  114:iload           6
	//   58  116:iload_3         
	//   59  117:iload           6
	//   60  119:isub            
	//   61  120:iload           6
	//   62  122:invokespecial   #249 <Method void dispatchRemovals(List, ListUpdateCallback, int, int, int)>
			if(j1 < k)
	//*  63  125:iload           7
	//*  64  127:iload           4
	//*  65  129:icmpge          148
				dispatchAdditions(((List) (arraylist)), listupdatecallback, i1, k - j1, j1);
	//   66  132:aload_0         
	//   67  133:aload           8
	//   68  135:aload_1         
	//   69  136:iload           6
	//   70  138:iload           4
	//   71  140:iload           7
	//   72  142:isub            
	//   73  143:iload           7
	//   74  145:invokespecial   #251 <Method void dispatchAdditions(List, ListUpdateCallback, int, int, int)>
			for(j = l - 1; j >= 0; j--)
	//*  75  148:iload           5
	//*  76  150:iconst_1        
	//*  77  151:isub            
	//*  78  152:istore_3        
	//*  79  153:iload_3         
	//*  80  154:iflt            216
				if((mOldItemStatuses[snake.x + j] & 0x1f) == 2)
	//*  81  157:aload_0         
	//*  82  158:getfield        #45  <Field int[] mOldItemStatuses>
	//*  83  161:aload           9
	//*  84  163:getfield        #94  <Field int DiffUtil$Snake.x>
	//*  85  166:iload_3         
	//*  86  167:iadd            
	//*  87  168:iaload          
	//*  88  169:bipush          31
	//*  89  171:iand            
	//*  90  172:iconst_2        
	//*  91  173:icmpne          209
					((BatchingListUpdateCallback) (listupdatecallback)).onChanged(snake.x + j, 1, mCallback.getChangePayload(snake.x + j, snake.y + j));
	//   92  176:aload_1         
	//   93  177:aload           9
	//   94  179:getfield        #94  <Field int DiffUtil$Snake.x>
	//   95  182:iload_3         
	//   96  183:iadd            
	//   97  184:iconst_1        
	//   98  185:aload_0         
	//   99  186:getfield        #55  <Field DiffUtil$Callback mCallback>
	//  100  189:aload           9
	//  101  191:getfield        #94  <Field int DiffUtil$Snake.x>
	//  102  194:iload_3         
	//  103  195:iadd            
	//  104  196:aload           9
	//  105  198:getfield        #97  <Field int DiffUtil$Snake.y>
	//  106  201:iload_3         
	//  107  202:iadd            
	//  108  203:invokevirtual   #170 <Method Object DiffUtil$Callback.getChangePayload(int, int)>
	//  109  206:invokevirtual   #252 <Method void BatchingListUpdateCallback.onChanged(int, int, Object)>

	//  110  209:iload_3         
	//  111  210:iconst_1        
	//  112  211:isub            
	//  113  212:istore_3        
	//* 114  213:goto            153
			j = snake.x;
	//  115  216:aload           9
	//  116  218:getfield        #94  <Field int DiffUtil$Snake.x>
	//  117  221:istore_3        
			k = snake.y;
	//  118  222:aload           9
	//  119  224:getfield        #97  <Field int DiffUtil$Snake.y>
	//  120  227:istore          4
		}

	//  121  229:iload_2         
	//  122  230:iconst_1        
	//  123  231:isub            
	//  124  232:istore_2        
	//* 125  233:goto            58
		((BatchingListUpdateCallback) (listupdatecallback)).dispatchLastEvent();
	//  126  236:aload_1         
	//  127  237:invokevirtual   #255 <Method void BatchingListUpdateCallback.dispatchLastEvent()>
	//  128  240:return          
	}

	public void dispatchUpdatesTo(android.support.v7.widget. )
	{
		dispatchUpdatesTo(((ListUpdateCallback) (new AdapterListUpdateCallback())));
	//    0    0:aload_0         
	//    1    1:new             #258 <Class AdapterListUpdateCallback>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #260 <Method void AdapterListUpdateCallback(android.support.v7.widget.RecyclerView$Adapter)>
	//    5    9:invokevirtual   #262 <Method void dispatchUpdatesTo(ListUpdateCallback)>
	//    6   12:return          
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
	public static final int NO_POSITION = -1;
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
