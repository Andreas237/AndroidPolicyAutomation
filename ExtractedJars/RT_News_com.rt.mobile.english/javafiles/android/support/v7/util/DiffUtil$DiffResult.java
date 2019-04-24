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
	//*   1    1:getfield        #41  <Field List mSnakes>
	//*   2    4:invokeinterface #83  <Method boolean List.isEmpty()>
	//*   3    9:ifeq            17
			snake = null;
	//    4   12:aconst_null     
	//    5   13:astore_1        
		else
	//*   6   14:goto            31
			snake = (DiffUtil.Snake)mSnakes.get(0);
	//    7   17:aload_0         
	//    8   18:getfield        #41  <Field List mSnakes>
	//    9   21:iconst_0        
	//   10   22:invokeinterface #87  <Method Object List.get(int)>
	//   11   27:checkcast       #89  <Class DiffUtil$Snake>
	//   12   30:astore_1        
		if(snake == null || snake.x != 0 || snake.y != 0)
	//*  13   31:aload_1         
	//*  14   32:ifnull          49
	//*  15   35:aload_1         
	//*  16   36:getfield        #92  <Field int DiffUtil$Snake.x>
	//*  17   39:ifne            49
	//*  18   42:aload_1         
	//*  19   43:getfield        #95  <Field int DiffUtil$Snake.y>
	//*  20   46:ifeq            93
		{
			DiffUtil.Snake snake1 = new DiffUtil.Snake();
	//   21   49:new             #89  <Class DiffUtil$Snake>
	//   22   52:dup             
	//   23   53:invokespecial   #96  <Method void DiffUtil$Snake()>
	//   24   56:astore_1        
			snake1.x = 0;
	//   25   57:aload_1         
	//   26   58:iconst_0        
	//   27   59:putfield        #92  <Field int DiffUtil$Snake.x>
			snake1.y = 0;
	//   28   62:aload_1         
	//   29   63:iconst_0        
	//   30   64:putfield        #95  <Field int DiffUtil$Snake.y>
			snake1.removal = false;
	//   31   67:aload_1         
	//   32   68:iconst_0        
	//   33   69:putfield        #99  <Field boolean DiffUtil$Snake.removal>
			snake1.size = 0;
	//   34   72:aload_1         
	//   35   73:iconst_0        
	//   36   74:putfield        #102 <Field int DiffUtil$Snake.size>
			snake1.reverse = false;
	//   37   77:aload_1         
	//   38   78:iconst_0        
	//   39   79:putfield        #105 <Field boolean DiffUtil$Snake.reverse>
			mSnakes.add(0, ((Object) (snake1)));
	//   40   82:aload_0         
	//   41   83:getfield        #41  <Field List mSnakes>
	//   42   86:iconst_0        
	//   43   87:aload_1         
	//   44   88:invokeinterface #109 <Method void List.add(int, Object)>
		}
	//   45   93:return          
	}

	private void dispatchAdditions(List list, ListUpdateCallback listupdatecallback, int i, int j, int k)
	{
		if(!mDetectMoves)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field boolean mDetectMoves>
	//*   2    4:ifne            17
		{
			listupdatecallback.onInserted(i, j);
	//    3    7:aload_2         
	//    4    8:iload_3         
	//    5    9:iload           4
	//    6   11:invokeinterface #117 <Method void ListUpdateCallback.onInserted(int, int)>
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
	//   15   29:getfield        #45  <Field int[] mNewItemStatuses>
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
					if(i1 != 16)
	//*  35   69:iload           7
	//*  36   71:bipush          16
	//*  37   73:icmpeq          128
					{
						list = ((List) (new StringBuilder()));
	//   38   76:new             #119 <Class StringBuilder>
	//   39   79:dup             
	//   40   80:invokespecial   #120 <Method void StringBuilder()>
	//   41   83:astore_1        
						((StringBuilder) (list)).append("unknown flag for pos ");
	//   42   84:aload_1         
	//   43   85:ldc1            #122 <String "unknown flag for pos ">
	//   44   87:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   45   90:pop             
						((StringBuilder) (list)).append(l);
	//   46   91:aload_1         
	//   47   92:iload           6
	//   48   94:invokevirtual   #129 <Method StringBuilder StringBuilder.append(int)>
	//   49   97:pop             
						((StringBuilder) (list)).append(" ");
	//   50   98:aload_1         
	//   51   99:ldc1            #131 <String " ">
	//   52  101:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   53  104:pop             
						((StringBuilder) (list)).append(Long.toBinaryString(i1));
	//   54  105:aload_1         
	//   55  106:iload           7
	//   56  108:i2l             
	//   57  109:invokestatic    #137 <Method String Long.toBinaryString(long)>
	//   58  112:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   59  115:pop             
						throw new IllegalStateException(((StringBuilder) (list)).toString());
	//   60  116:new             #139 <Class IllegalStateException>
	//   61  119:dup             
	//   62  120:aload_1         
	//   63  121:invokevirtual   #143 <Method String StringBuilder.toString()>
	//   64  124:invokespecial   #146 <Method void IllegalStateException(String)>
	//   65  127:athrow          
					}
					list.add(((Object) (new date(l, i, false))));
	//   66  128:aload_1         
	//   67  129:new             #148 <Class DiffUtil$PostponedUpdate>
	//   68  132:dup             
	//   69  133:iload           6
	//   70  135:iload_3         
	//   71  136:iconst_0        
	//   72  137:invokespecial   #151 <Method void DiffUtil$PostponedUpdate(int, int, boolean)>
	//   73  140:invokeinterface #154 <Method boolean List.add(Object)>
	//   74  145:pop             
					continue;
	//   75  146:goto            258
				}
				int j1 = mNewItemStatuses[l] >> 5;
	//   76  149:aload_0         
	//   77  150:getfield        #45  <Field int[] mNewItemStatuses>
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
	//   87  165:invokestatic    #158 <Method DiffUtil$PostponedUpdate removePostponedUpdate(List, int, boolean)>
	//   88  168:getfield        #161 <Field int DiffUtil$PostponedUpdate.currentPos>
	//   89  171:iload_3         
	//   90  172:invokeinterface #164 <Method void ListUpdateCallback.onMoved(int, int)>
				if(i1 == 4)
	//*  91  177:iload           7
	//*  92  179:iconst_4        
	//*  93  180:icmpne          258
					listupdatecallback.onChanged(i, 1, mCallback.getChangePayload(j1, l));
	//   94  183:aload_2         
	//   95  184:iload_3         
	//   96  185:iconst_1        
	//   97  186:aload_0         
	//   98  187:getfield        #53  <Field DiffUtil$Callback mCallback>
	//   99  190:iload           8
	//  100  192:iload           6
	//  101  194:invokevirtual   #168 <Method Object DiffUtil$Callback.getChangePayload(int, int)>
	//  102  197:invokeinterface #172 <Method void ListUpdateCallback.onChanged(int, int, Object)>
				continue;
	//  103  202:goto            258
			}
			listupdatecallback.onInserted(i, 1);
	//  104  205:aload_2         
	//  105  206:iload_3         
	//  106  207:iconst_1        
	//  107  208:invokeinterface #117 <Method void ListUpdateCallback.onInserted(int, int)>
			for(Iterator iterator = list.iterator(); iterator.hasNext();)
	//* 108  213:aload_1         
	//* 109  214:invokeinterface #176 <Method Iterator List.iterator()>
	//* 110  219:astore          9
	//* 111  221:aload           9
	//* 112  223:invokeinterface #181 <Method boolean Iterator.hasNext()>
	//* 113  228:ifeq            258
			{
				date date = (date)iterator.next();
	//  114  231:aload           9
	//  115  233:invokeinterface #185 <Method Object Iterator.next()>
	//  116  238:checkcast       #148 <Class DiffUtil$PostponedUpdate>
	//  117  241:astore          10
				date.currentPos = date.currentPos + 1;
	//  118  243:aload           10
	//  119  245:aload           10
	//  120  247:getfield        #161 <Field int DiffUtil$PostponedUpdate.currentPos>
	//  121  250:iconst_1        
	//  122  251:iadd            
	//  123  252:putfield        #161 <Field int DiffUtil$PostponedUpdate.currentPos>
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
	//*   1    1:getfield        #68  <Field boolean mDetectMoves>
	//*   2    4:ifne            17
		{
			listupdatecallback.onRemoved(i, j);
	//    3    7:aload_2         
	//    4    8:iload_3         
	//    5    9:iload           4
	//    6   11:invokeinterface #190 <Method void ListUpdateCallback.onRemoved(int, int)>
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
	//   15   29:getfield        #43  <Field int[] mOldItemStatuses>
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
					if(i1 != 16)
	//*  35   69:iload           7
	//*  36   71:bipush          16
	//*  37   73:icmpeq          128
					{
						list = ((List) (new StringBuilder()));
	//   38   76:new             #119 <Class StringBuilder>
	//   39   79:dup             
	//   40   80:invokespecial   #120 <Method void StringBuilder()>
	//   41   83:astore_1        
						((StringBuilder) (list)).append("unknown flag for pos ");
	//   42   84:aload_1         
	//   43   85:ldc1            #122 <String "unknown flag for pos ">
	//   44   87:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   45   90:pop             
						((StringBuilder) (list)).append(l);
	//   46   91:aload_1         
	//   47   92:iload           6
	//   48   94:invokevirtual   #129 <Method StringBuilder StringBuilder.append(int)>
	//   49   97:pop             
						((StringBuilder) (list)).append(" ");
	//   50   98:aload_1         
	//   51   99:ldc1            #131 <String " ">
	//   52  101:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   53  104:pop             
						((StringBuilder) (list)).append(Long.toBinaryString(i1));
	//   54  105:aload_1         
	//   55  106:iload           7
	//   56  108:i2l             
	//   57  109:invokestatic    #137 <Method String Long.toBinaryString(long)>
	//   58  112:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   59  115:pop             
						throw new IllegalStateException(((StringBuilder) (list)).toString());
	//   60  116:new             #139 <Class IllegalStateException>
	//   61  119:dup             
	//   62  120:aload_1         
	//   63  121:invokevirtual   #143 <Method String StringBuilder.toString()>
	//   64  124:invokespecial   #146 <Method void IllegalStateException(String)>
	//   65  127:athrow          
					}
					list.add(((Object) (new date(l, i + j, true))));
	//   66  128:aload_1         
	//   67  129:new             #148 <Class DiffUtil$PostponedUpdate>
	//   68  132:dup             
	//   69  133:iload           6
	//   70  135:iload_3         
	//   71  136:iload           4
	//   72  138:iadd            
	//   73  139:iconst_1        
	//   74  140:invokespecial   #151 <Method void DiffUtil$PostponedUpdate(int, int, boolean)>
	//   75  143:invokeinterface #154 <Method boolean List.add(Object)>
	//   76  148:pop             
					continue;
	//   77  149:goto            279
				}
				int j1 = mOldItemStatuses[l] >> 5;
	//   78  152:aload_0         
	//   79  153:getfield        #43  <Field int[] mOldItemStatuses>
	//   80  156:iload           6
	//   81  158:iaload          
	//   82  159:iconst_5        
	//   83  160:ishr            
	//   84  161:istore          8
				date date = removePostponedUpdate(list, j1, false);
	//   85  163:aload_1         
	//   86  164:iload           8
	//   87  166:iconst_0        
	//   88  167:invokestatic    #158 <Method DiffUtil$PostponedUpdate removePostponedUpdate(List, int, boolean)>
	//   89  170:astore          9
				listupdatecallback.onMoved(i + j, date.currentPos - 1);
	//   90  172:aload_2         
	//   91  173:iload_3         
	//   92  174:iload           4
	//   93  176:iadd            
	//   94  177:aload           9
	//   95  179:getfield        #161 <Field int DiffUtil$PostponedUpdate.currentPos>
	//   96  182:iconst_1        
	//   97  183:isub            
	//   98  184:invokeinterface #164 <Method void ListUpdateCallback.onMoved(int, int)>
				if(i1 == 4)
	//*  99  189:iload           7
	//* 100  191:iconst_4        
	//* 101  192:icmpne          279
					listupdatecallback.onChanged(date.currentPos - 1, 1, mCallback.getChangePayload(l, j1));
	//  102  195:aload_2         
	//  103  196:aload           9
	//  104  198:getfield        #161 <Field int DiffUtil$PostponedUpdate.currentPos>
	//  105  201:iconst_1        
	//  106  202:isub            
	//  107  203:iconst_1        
	//  108  204:aload_0         
	//  109  205:getfield        #53  <Field DiffUtil$Callback mCallback>
	//  110  208:iload           6
	//  111  210:iload           8
	//  112  212:invokevirtual   #168 <Method Object DiffUtil$Callback.getChangePayload(int, int)>
	//  113  215:invokeinterface #172 <Method void ListUpdateCallback.onChanged(int, int, Object)>
				continue;
	//  114  220:goto            279
			}
			listupdatecallback.onRemoved(i + j, 1);
	//  115  223:aload_2         
	//  116  224:iload_3         
	//  117  225:iload           4
	//  118  227:iadd            
	//  119  228:iconst_1        
	//  120  229:invokeinterface #190 <Method void ListUpdateCallback.onRemoved(int, int)>
			for(Iterator iterator = list.iterator(); iterator.hasNext();)
	//* 121  234:aload_1         
	//* 122  235:invokeinterface #176 <Method Iterator List.iterator()>
	//* 123  240:astore          9
	//* 124  242:aload           9
	//* 125  244:invokeinterface #181 <Method boolean Iterator.hasNext()>
	//* 126  249:ifeq            279
			{
				date date1 = (date)iterator.next();
	//  127  252:aload           9
	//  128  254:invokeinterface #185 <Method Object Iterator.next()>
	//  129  259:checkcast       #148 <Class DiffUtil$PostponedUpdate>
	//  130  262:astore          10
				date1.currentPos = date1.currentPos - 1;
	//  131  264:aload           10
	//  132  266:aload           10
	//  133  268:getfield        #161 <Field int DiffUtil$PostponedUpdate.currentPos>
	//  134  271:iconst_1        
	//  135  272:isub            
	//  136  273:putfield        #161 <Field int DiffUtil$PostponedUpdate.currentPos>
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
	//*   1    1:getfield        #43  <Field int[] mOldItemStatuses>
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
	//   13   17:invokespecial   #196 <Method boolean findMatchingItem(int, int, int, boolean)>
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
	//*  22   35:iflt            272
		{
			Object obj = ((Object) ((DiffUtil.Snake)mSnakes.get(k)));
	//   23   38:aload_0         
	//   24   39:getfield        #41  <Field List mSnakes>
	//   25   42:iload_3         
	//   26   43:invokeinterface #87  <Method Object List.get(int)>
	//   27   48:checkcast       #89  <Class DiffUtil$Snake>
	//   28   51:astore          12
			int k1 = ((DiffUtil.Snake) (obj)).x;
	//   29   53:aload           12
	//   30   55:getfield        #92  <Field int DiffUtil$Snake.x>
	//   31   58:istore          8
			int l1 = ((DiffUtil.Snake) (obj)).size;
	//   32   60:aload           12
	//   33   62:getfield        #102 <Field int DiffUtil$Snake.size>
	//   34   65:istore          9
			int i2 = ((DiffUtil.Snake) (obj)).y;
	//   35   67:aload           12
	//   36   69:getfield        #95  <Field int DiffUtil$Snake.y>
	//   37   72:istore          10
			int j2 = ((DiffUtil.Snake) (obj)).size;
	//   38   74:aload           12
	//   39   76:getfield        #102 <Field int DiffUtil$Snake.size>
	//   40   79:istore          11
			byte byte0 = 4;
	//   41   81:iconst_4        
	//   42   82:istore          7
			if(flag)
	//*  43   84:iload           4
	//*  44   86:ifeq            167
				for(j--; j >= k1 + l1; j--)
	//*  45   89:iload_2         
	//*  46   90:iconst_1        
	//*  47   91:isub            
	//*  48   92:istore_2        
	//*  49   93:iload_2         
	//*  50   94:iload           8
	//*  51   96:iload           9
	//*  52   98:iadd            
	//*  53   99:icmplt          252
					if(mCallback.areItemsTheSame(j, i1))
	//*  54  102:aload_0         
	//*  55  103:getfield        #53  <Field DiffUtil$Callback mCallback>
	//*  56  106:iload_2         
	//*  57  107:iload           6
	//*  58  109:invokevirtual   #200 <Method boolean DiffUtil$Callback.areItemsTheSame(int, int)>
	//*  59  112:ifeq            160
					{
						if(mCallback.areContentsTheSame(j, i1))
	//*  60  115:aload_0         
	//*  61  116:getfield        #53  <Field DiffUtil$Callback mCallback>
	//*  62  119:iload_2         
	//*  63  120:iload           6
	//*  64  122:invokevirtual   #203 <Method boolean DiffUtil$Callback.areContentsTheSame(int, int)>
	//*  65  125:ifeq            132
							byte0 = 8;
	//   66  128:bipush          8
	//   67  130:istore          7
						mNewItemStatuses[i1] = j << 5 | 0x10;
	//   68  132:aload_0         
	//   69  133:getfield        #45  <Field int[] mNewItemStatuses>
	//   70  136:iload           6
	//   71  138:iload_2         
	//   72  139:iconst_5        
	//   73  140:ishl            
	//   74  141:bipush          16
	//   75  143:ior             
	//   76  144:iastore         
						mOldItemStatuses[j] = i1 << 5 | byte0;
	//   77  145:aload_0         
	//   78  146:getfield        #43  <Field int[] mOldItemStatuses>
	//   79  149:iload_2         
	//   80  150:iload           6
	//   81  152:iconst_5        
	//   82  153:ishl            
	//   83  154:iload           7
	//   84  156:ior             
	//   85  157:iastore         
						return true;
	//   86  158:iconst_1        
	//   87  159:ireturn         
					}

	//   88  160:iload_2         
	//   89  161:iconst_1        
	//   90  162:isub            
	//   91  163:istore_2        
			else
	//*  92  164:goto            93
				for(j = l - 1; j >= i2 + j2; j--)
	//*  93  167:iload           5
	//*  94  169:iconst_1        
	//*  95  170:isub            
	//*  96  171:istore_2        
	//*  97  172:iload_2         
	//*  98  173:iload           10
	//*  99  175:iload           11
	//* 100  177:iadd            
	//* 101  178:icmplt          252
					if(mCallback.areItemsTheSame(i1, j))
	//* 102  181:aload_0         
	//* 103  182:getfield        #53  <Field DiffUtil$Callback mCallback>
	//* 104  185:iload           6
	//* 105  187:iload_2         
	//* 106  188:invokevirtual   #200 <Method boolean DiffUtil$Callback.areItemsTheSame(int, int)>
	//* 107  191:ifeq            245
					{
						if(mCallback.areContentsTheSame(i1, j))
	//* 108  194:aload_0         
	//* 109  195:getfield        #53  <Field DiffUtil$Callback mCallback>
	//* 110  198:iload           6
	//* 111  200:iload_2         
	//* 112  201:invokevirtual   #203 <Method boolean DiffUtil$Callback.areContentsTheSame(int, int)>
	//* 113  204:ifeq            211
							byte0 = 8;
	//  114  207:bipush          8
	//  115  209:istore          7
						obj = ((Object) (mOldItemStatuses));
	//  116  211:aload_0         
	//  117  212:getfield        #43  <Field int[] mOldItemStatuses>
	//  118  215:astore          12
						i--;
	//  119  217:iload_1         
	//  120  218:iconst_1        
	//  121  219:isub            
	//  122  220:istore_1        
						obj[i] = j << 5 | 0x10;
	//  123  221:aload           12
	//  124  223:iload_1         
	//  125  224:iload_2         
	//  126  225:iconst_5        
	//  127  226:ishl            
	//  128  227:bipush          16
	//  129  229:ior             
	//  130  230:iastore         
						mNewItemStatuses[j] = i << 5 | byte0;
	//  131  231:aload_0         
	//  132  232:getfield        #45  <Field int[] mNewItemStatuses>
	//  133  235:iload_2         
	//  134  236:iload_1         
	//  135  237:iconst_5        
	//  136  238:ishl            
	//  137  239:iload           7
	//  138  241:ior             
	//  139  242:iastore         
						return true;
	//  140  243:iconst_1        
	//  141  244:ireturn         
					}

	//  142  245:iload_2         
	//  143  246:iconst_1        
	//  144  247:isub            
	//  145  248:istore_2        
	//* 146  249:goto            172
			j = ((DiffUtil.Snake) (obj)).x;
	//  147  252:aload           12
	//  148  254:getfield        #92  <Field int DiffUtil$Snake.x>
	//  149  257:istore_2        
			l = ((DiffUtil.Snake) (obj)).y;
	//  150  258:aload           12
	//  151  260:getfield        #95  <Field int DiffUtil$Snake.y>
	//  152  263:istore          5
		}

	//  153  265:iload_3         
	//  154  266:iconst_1        
	//  155  267:isub            
	//  156  268:istore_3        
	//* 157  269:goto            34
		return false;
	//  158  272:iconst_0        
	//  159  273:ireturn         
	}

	private void findMatchingItems()
	{
		int j = mOldListSize;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int mOldListSize>
	//    2    4:istore_2        
		int i = mNewListSize;
	//    3    5:aload_0         
	//    4    6:getfield        #66  <Field int mNewListSize>
	//    5    9:istore_1        
		for(int k = mSnakes.size() - 1; k >= 0; k--)
	//*   6   10:aload_0         
	//*   7   11:getfield        #41  <Field List mSnakes>
	//*   8   14:invokeinterface #205 <Method int List.size()>
	//*   9   19:iconst_1        
	//*  10   20:isub            
	//*  11   21:istore_3        
	//*  12   22:iload_3         
	//*  13   23:iflt            231
		{
			DiffUtil.Snake snake = (DiffUtil.Snake)mSnakes.get(k);
	//   14   26:aload_0         
	//   15   27:getfield        #41  <Field List mSnakes>
	//   16   30:iload_3         
	//   17   31:invokeinterface #87  <Method Object List.get(int)>
	//   18   36:checkcast       #89  <Class DiffUtil$Snake>
	//   19   39:astore          9
			int i2 = snake.x;
	//   20   41:aload           9
	//   21   43:getfield        #92  <Field int DiffUtil$Snake.x>
	//   22   46:istore          7
			int j2 = snake.size;
	//   23   48:aload           9
	//   24   50:getfield        #102 <Field int DiffUtil$Snake.size>
	//   25   53:istore          8
			int j1 = snake.y;
	//   26   55:aload           9
	//   27   57:getfield        #95  <Field int DiffUtil$Snake.y>
	//   28   60:istore          5
			int l1 = snake.size;
	//   29   62:aload           9
	//   30   64:getfield        #102 <Field int DiffUtil$Snake.size>
	//   31   67:istore          6
			if(mDetectMoves)
	//*  32   69:aload_0         
	//*  33   70:getfield        #68  <Field boolean mDetectMoves>
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
	//   46   92:invokespecial   #207 <Method void findAddition(int, int, int)>
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
	//   61  117:invokespecial   #210 <Method void findRemoval(int, int, int)>

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
	//*  71  134:getfield        #102 <Field int DiffUtil$Snake.size>
	//*  72  137:icmpge          212
			{
				int i1 = snake.x + i;
	//   73  140:aload           9
	//   74  142:getfield        #92  <Field int DiffUtil$Snake.x>
	//   75  145:iload_1         
	//   76  146:iadd            
	//   77  147:istore          4
				int k1 = snake.y + i;
	//   78  149:aload           9
	//   79  151:getfield        #95  <Field int DiffUtil$Snake.y>
	//   80  154:iload_1         
	//   81  155:iadd            
	//   82  156:istore          5
				if(mCallback.areContentsTheSame(i1, k1))
	//*  83  158:aload_0         
	//*  84  159:getfield        #53  <Field DiffUtil$Callback mCallback>
	//*  85  162:iload           4
	//*  86  164:iload           5
	//*  87  166:invokevirtual   #203 <Method boolean DiffUtil$Callback.areContentsTheSame(int, int)>
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
	//   95  180:getfield        #43  <Field int[] mOldItemStatuses>
	//   96  183:iload           4
	//   97  185:iload           5
	//   98  187:iconst_5        
	//   99  188:ishl            
	//  100  189:iload_2         
	//  101  190:ior             
	//  102  191:iastore         
				mNewItemStatuses[k1] = i1 << 5 | j;
	//  103  192:aload_0         
	//  104  193:getfield        #45  <Field int[] mNewItemStatuses>
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
	//  118  214:getfield        #92  <Field int DiffUtil$Snake.x>
	//  119  217:istore_2        
			i = snake.y;
	//  120  218:aload           9
	//  121  220:getfield        #95  <Field int DiffUtil$Snake.y>
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
	//*   1    1:getfield        #45  <Field int[] mNewItemStatuses>
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
	//   13   17:invokespecial   #196 <Method boolean findMatchingItem(int, int, int, boolean)>
	//   14   20:pop             
			return;
	//   15   21:return          
		}
	}

	private static date removePostponedUpdate(List list, int i, boolean flag)
	{
		for(int j = list.size() - 1; j >= 0; j--)
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #205 <Method int List.size()>
	//*   2    6:iconst_1        
	//*   3    7:isub            
	//*   4    8:istore_3        
	//*   5    9:iload_3         
	//*   6   10:iflt            117
		{
			date date = (date)list.get(j);
	//    7   13:aload_0         
	//    8   14:iload_3         
	//    9   15:invokeinterface #87  <Method Object List.get(int)>
	//   10   20:checkcast       #148 <Class DiffUtil$PostponedUpdate>
	//   11   23:astore          5
			if(date.posInOwnerList == i && date.removal == flag)
	//*  12   25:aload           5
	//*  13   27:getfield        #213 <Field int DiffUtil$PostponedUpdate.posInOwnerList>
	//*  14   30:iload_1         
	//*  15   31:icmpne          110
	//*  16   34:aload           5
	//*  17   36:getfield        #214 <Field boolean DiffUtil$PostponedUpdate.removal>
	//*  18   39:iload_2         
	//*  19   40:icmpne          110
			{
				list.remove(j);
	//   20   43:aload_0         
	//   21   44:iload_3         
	//   22   45:invokeinterface #217 <Method Object List.remove(int)>
	//   23   50:pop             
				for(; j < list.size(); j++)
	//*  24   51:iload_3         
	//*  25   52:aload_0         
	//*  26   53:invokeinterface #205 <Method int List.size()>
	//*  27   58:icmpge          107
				{
					date date1 = (date)list.get(j);
	//   28   61:aload_0         
	//   29   62:iload_3         
	//   30   63:invokeinterface #87  <Method Object List.get(int)>
	//   31   68:checkcast       #148 <Class DiffUtil$PostponedUpdate>
	//   32   71:astore          6
					int k = date1.currentPos;
	//   33   73:aload           6
	//   34   75:getfield        #161 <Field int DiffUtil$PostponedUpdate.currentPos>
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
	//   47   97:putfield        #161 <Field int DiffUtil$PostponedUpdate.currentPos>
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

	public void dispatchUpdatesTo(ListUpdateCallback listupdatecallback)
	{
		if(listupdatecallback instanceof BatchingListUpdateCallback)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #222 <Class BatchingListUpdateCallback>
	//*   2    4:ifeq            15
			listupdatecallback = ((ListUpdateCallback) ((BatchingListUpdateCallback)listupdatecallback));
	//    3    7:aload_1         
	//    4    8:checkcast       #222 <Class BatchingListUpdateCallback>
	//    5   11:astore_1        
		else
	//*   6   12:goto            24
			listupdatecallback = ((ListUpdateCallback) (new BatchingListUpdateCallback(listupdatecallback)));
	//    7   15:new             #222 <Class BatchingListUpdateCallback>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokespecial   #224 <Method void BatchingListUpdateCallback(ListUpdateCallback)>
	//   11   23:astore_1        
		ArrayList arraylist = new ArrayList();
	//   12   24:new             #226 <Class ArrayList>
	//   13   27:dup             
	//   14   28:invokespecial   #227 <Method void ArrayList()>
	//   15   31:astore          8
		int j = mOldListSize;
	//   16   33:aload_0         
	//   17   34:getfield        #61  <Field int mOldListSize>
	//   18   37:istore_3        
		int k = mNewListSize;
	//   19   38:aload_0         
	//   20   39:getfield        #66  <Field int mNewListSize>
	//   21   42:istore          4
		int i = mSnakes.size();
	//   22   44:aload_0         
	//   23   45:getfield        #41  <Field List mSnakes>
	//   24   48:invokeinterface #205 <Method int List.size()>
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
	//   33   63:getfield        #41  <Field List mSnakes>
	//   34   66:iload_2         
	//   35   67:invokeinterface #87  <Method Object List.get(int)>
	//   36   72:checkcast       #89  <Class DiffUtil$Snake>
	//   37   75:astore          9
			int l = snake.size;
	//   38   77:aload           9
	//   39   79:getfield        #102 <Field int DiffUtil$Snake.size>
	//   40   82:istore          5
			int i1 = snake.x + l;
	//   41   84:aload           9
	//   42   86:getfield        #92  <Field int DiffUtil$Snake.x>
	//   43   89:iload           5
	//   44   91:iadd            
	//   45   92:istore          6
			int j1 = snake.y + l;
	//   46   94:aload           9
	//   47   96:getfield        #95  <Field int DiffUtil$Snake.y>
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
	//   62  122:invokespecial   #229 <Method void dispatchRemovals(List, ListUpdateCallback, int, int, int)>
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
	//   74  145:invokespecial   #231 <Method void dispatchAdditions(List, ListUpdateCallback, int, int, int)>
			for(j = l - 1; j >= 0; j--)
	//*  75  148:iload           5
	//*  76  150:iconst_1        
	//*  77  151:isub            
	//*  78  152:istore_3        
	//*  79  153:iload_3         
	//*  80  154:iflt            216
				if((mOldItemStatuses[snake.x + j] & 0x1f) == 2)
	//*  81  157:aload_0         
	//*  82  158:getfield        #43  <Field int[] mOldItemStatuses>
	//*  83  161:aload           9
	//*  84  163:getfield        #92  <Field int DiffUtil$Snake.x>
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
	//   94  179:getfield        #92  <Field int DiffUtil$Snake.x>
	//   95  182:iload_3         
	//   96  183:iadd            
	//   97  184:iconst_1        
	//   98  185:aload_0         
	//   99  186:getfield        #53  <Field DiffUtil$Callback mCallback>
	//  100  189:aload           9
	//  101  191:getfield        #92  <Field int DiffUtil$Snake.x>
	//  102  194:iload_3         
	//  103  195:iadd            
	//  104  196:aload           9
	//  105  198:getfield        #95  <Field int DiffUtil$Snake.y>
	//  106  201:iload_3         
	//  107  202:iadd            
	//  108  203:invokevirtual   #168 <Method Object DiffUtil$Callback.getChangePayload(int, int)>
	//  109  206:invokevirtual   #232 <Method void BatchingListUpdateCallback.onChanged(int, int, Object)>

	//  110  209:iload_3         
	//  111  210:iconst_1        
	//  112  211:isub            
	//  113  212:istore_3        
	//* 114  213:goto            153
			j = snake.x;
	//  115  216:aload           9
	//  116  218:getfield        #92  <Field int DiffUtil$Snake.x>
	//  117  221:istore_3        
			k = snake.y;
	//  118  222:aload           9
	//  119  224:getfield        #95  <Field int DiffUtil$Snake.y>
	//  120  227:istore          4
		}

	//  121  229:iload_2         
	//  122  230:iconst_1        
	//  123  231:isub            
	//  124  232:istore_2        
	//* 125  233:goto            58
		((BatchingListUpdateCallback) (listupdatecallback)).dispatchLastEvent();
	//  126  236:aload_1         
	//  127  237:invokevirtual   #235 <Method void BatchingListUpdateCallback.dispatchLastEvent()>
	//  128  240:return          
	}

	public void dispatchUpdatesTo(android.support.v7.widget. )
	{
		dispatchUpdatesTo(((ListUpdateCallback) (new AdapterListUpdateCallback())));
	//    0    0:aload_0         
	//    1    1:new             #238 <Class AdapterListUpdateCallback>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #240 <Method void AdapterListUpdateCallback(android.support.v7.widget.RecyclerView$Adapter)>
	//    5    9:invokevirtual   #242 <Method void dispatchUpdatesTo(ListUpdateCallback)>
	//    6   12:return          
	}

	List getSnakes()
	{
		return mSnakes;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List mSnakes>
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
	//    1    1:invokespecial   #39  <Method void Object()>
		mSnakes = list;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #41  <Field List mSnakes>
		mOldItemStatuses = ai;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #43  <Field int[] mOldItemStatuses>
		mNewItemStatuses = ai1;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #45  <Field int[] mNewItemStatuses>
		Arrays.fill(mOldItemStatuses, 0);
	//   11   20:aload_0         
	//   12   21:getfield        #43  <Field int[] mOldItemStatuses>
	//   13   24:iconst_0        
	//   14   25:invokestatic    #51  <Method void Arrays.fill(int[], int)>
		Arrays.fill(mNewItemStatuses, 0);
	//   15   28:aload_0         
	//   16   29:getfield        #45  <Field int[] mNewItemStatuses>
	//   17   32:iconst_0        
	//   18   33:invokestatic    #51  <Method void Arrays.fill(int[], int)>
		mCallback = callback;
	//   19   36:aload_0         
	//   20   37:aload_1         
	//   21   38:putfield        #53  <Field DiffUtil$Callback mCallback>
		mOldListSize = callback.getOldListSize();
	//   22   41:aload_0         
	//   23   42:aload_1         
	//   24   43:invokevirtual   #59  <Method int DiffUtil$Callback.getOldListSize()>
	//   25   46:putfield        #61  <Field int mOldListSize>
		mNewListSize = callback.getNewListSize();
	//   26   49:aload_0         
	//   27   50:aload_1         
	//   28   51:invokevirtual   #64  <Method int DiffUtil$Callback.getNewListSize()>
	//   29   54:putfield        #66  <Field int mNewListSize>
		mDetectMoves = flag;
	//   30   57:aload_0         
	//   31   58:iload           5
	//   32   60:putfield        #68  <Field boolean mDetectMoves>
		addRootSnake();
	//   33   63:aload_0         
	//   34   64:invokespecial   #71  <Method void addRootSnake()>
		findMatchingItems();
	//   35   67:aload_0         
	//   36   68:invokespecial   #74  <Method void findMatchingItems()>
	//   37   71:return          
	}
}
