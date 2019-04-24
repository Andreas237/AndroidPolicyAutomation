// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;

import java.util.*;

// Referenced classes of package android.support.v7.util:
//			ListUpdateCallback, BatchingListUpdateCallback

public class DiffUtil
{
	public static abstract class Callback
	{

		public abstract boolean areContentsTheSame(int i, int j);

		public abstract boolean areItemsTheSame(int i, int j);

		public Object getChangePayload(int i, int j)
		{
			return ((Object) (null));
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public abstract int getNewListSize();

		public abstract int getOldListSize();

		public Callback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class DiffResult
	{

		private void addRootSnake()
		{
			Snake snake;
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
				snake = (Snake)mSnakes.get(0);
		//   39   77:aload_0         
		//   40   78:getfield        #43  <Field List mSnakes>
		//   41   81:iconst_0        
		//   42   82:invokeinterface #111 <Method Object List.get(int)>
		//   43   87:checkcast       #87  <Class DiffUtil$Snake>
		//   44   90:astore_1        
			if(snake == null || snake.x != 0 || snake.y != 0)
			{
				snake = new Snake();
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
		//		               0: 133
		//		               4: 186
		//		               8: 186
		//		               16: 254
			default:
				throw new IllegalStateException((new StringBuilder()).append("unknown flag for pos ").append(k + j).append(" ").append(Long.toBinaryString(l)).toString());
		//   25   88:new             #121 <Class IllegalStateException>
		//   26   91:dup             
		//   27   92:new             #123 <Class StringBuilder>
		//   28   95:dup             
		//   29   96:invokespecial   #124 <Method void StringBuilder()>
		//   30   99:ldc1            #126 <String "unknown flag for pos ">
		//   31  101:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
		//   32  104:iload           5
		//   33  106:iload           4
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
					PostponedUpdate postponedupdate = (PostponedUpdate)iterator.next();
		//   55  159:aload           8
		//   56  161:invokeinterface #161 <Method Object Iterator.next()>
		//   57  166:checkcast       #163 <Class DiffUtil$PostponedUpdate>
		//   58  169:astore          9
					postponedupdate.currentPos = postponedupdate.currentPos + 1;
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
			list.add(((Object) (new PostponedUpdate(k + j, i, false))));
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
		//		               0: 133
		//		               4: 189
		//		               8: 189
		//		               16: 272
			default:
				throw new IllegalStateException((new StringBuilder()).append("unknown flag for pos ").append(k + j).append(" ").append(Long.toBinaryString(l)).toString());
		//   25   88:new             #121 <Class IllegalStateException>
		//   26   91:dup             
		//   27   92:new             #123 <Class StringBuilder>
		//   28   95:dup             
		//   29   96:invokespecial   #124 <Method void StringBuilder()>
		//   30   99:ldc1            #126 <String "unknown flag for pos ">
		//   31  101:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
		//   32  104:iload           5
		//   33  106:iload           4
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
					PostponedUpdate postponedupdate1 = (PostponedUpdate)iterator.next();
		//   57  162:aload           8
		//   58  164:invokeinterface #161 <Method Object Iterator.next()>
		//   59  169:checkcast       #163 <Class DiffUtil$PostponedUpdate>
		//   60  172:astore          9
					postponedupdate1.currentPos = postponedupdate1.currentPos - 1;
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
				PostponedUpdate postponedupdate = removePostponedUpdate(list, i1, false);
		//   77  203:aload_1         
		//   78  204:iload           7
		//   79  206:iconst_0        
		//   80  207:invokestatic    #170 <Method DiffUtil$PostponedUpdate removePostponedUpdate(List, int, boolean)>
		//   81  210:astore          8
				listupdatecallback.onMoved(i + j, postponedupdate.currentPos - 1);
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
					listupdatecallback.onChanged(postponedupdate.currentPos - 1, 1, mCallback.getChangePayload(k + j, i1));
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
			list.add(((Object) (new PostponedUpdate(k + j, i + j, true))));
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
			int l;
			int i1;
			if(flag)
		//*   0    0:iload           4
		//*   1    2:ifeq            142
			{
				i1 = j - 1;
		//    2    5:iload_2         
		//    3    6:iconst_1        
		//    4    7:isub            
		//    5    8:istore          6
				int j1 = i;
		//    6   10:iload_1         
		//    7   11:istore          7
				l = j - 1;
		//    8   13:iload_2         
		//    9   14:iconst_1        
		//   10   15:isub            
		//   11   16:istore          5
				j = j1;
		//   12   18:iload           7
		//   13   20:istore_2        
			} else
		//*  14   21:iload_3         
		//*  15   22:iflt            277
		//*  16   25:aload_0         
		//*  17   26:getfield        #43  <Field List mSnakes>
		//*  18   29:iload_3         
		//*  19   30:invokeinterface #111 <Method Object List.get(int)>
		//*  20   35:checkcast       #87  <Class DiffUtil$Snake>
		//*  21   38:astore          11
		//*  22   40:aload           11
		//*  23   42:getfield        #90  <Field int DiffUtil$Snake.x>
		//*  24   45:istore          7
		//*  25   47:aload           11
		//*  26   49:getfield        #100 <Field int DiffUtil$Snake.size>
		//*  27   52:istore          8
		//*  28   54:aload           11
		//*  29   56:getfield        #93  <Field int DiffUtil$Snake.y>
		//*  30   59:istore          9
		//*  31   61:aload           11
		//*  32   63:getfield        #100 <Field int DiffUtil$Snake.size>
		//*  33   66:istore          10
		//*  34   68:iload           4
		//*  35   70:ifeq            173
		//*  36   73:iload_2         
		//*  37   74:iconst_1        
		//*  38   75:isub            
		//*  39   76:istore_2        
		//*  40   77:iload_2         
		//*  41   78:iload           7
		//*  42   80:iload           8
		//*  43   82:iadd            
		//*  44   83:icmplt          257
		//*  45   86:aload_0         
		//*  46   87:getfield        #55  <Field DiffUtil$Callback mCallback>
		//*  47   90:iload_2         
		//*  48   91:iload           6
		//*  49   93:invokevirtual   #202 <Method boolean DiffUtil$Callback.areItemsTheSame(int, int)>
		//*  50   96:ifeq            166
		//*  51   99:aload_0         
		//*  52  100:getfield        #55  <Field DiffUtil$Callback mCallback>
		//*  53  103:iload_2         
		//*  54  104:iload           6
		//*  55  106:invokevirtual   #205 <Method boolean DiffUtil$Callback.areContentsTheSame(int, int)>
		//*  56  109:ifeq            161
		//*  57  112:bipush          8
		//*  58  114:istore_1        
		//*  59  115:aload_0         
		//*  60  116:getfield        #47  <Field int[] mNewItemStatuses>
		//*  61  119:iload           6
		//*  62  121:iload_2         
		//*  63  122:iconst_5        
		//*  64  123:ishl            
		//*  65  124:bipush          16
		//*  66  126:ior             
		//*  67  127:iastore         
		//*  68  128:aload_0         
		//*  69  129:getfield        #45  <Field int[] mOldItemStatuses>
		//*  70  132:iload_2         
		//*  71  133:iload           6
		//*  72  135:iconst_5        
		//*  73  136:ishl            
		//*  74  137:iload_1         
		//*  75  138:ior             
		//*  76  139:iastore         
		//*  77  140:iconst_1        
		//*  78  141:ireturn         
			{
				i1 = i - 1;
		//   79  142:iload_1         
		//   80  143:iconst_1        
		//   81  144:isub            
		//   82  145:istore          6
				int l1 = i - 1;
		//   83  147:iload_1         
		//   84  148:iconst_1        
		//   85  149:isub            
		//   86  150:istore          7
				l = j;
		//   87  152:iload_2         
		//   88  153:istore          5
				j = l1;
		//   89  155:iload           7
		//   90  157:istore_2        
			}
			for(; k >= 0; k--)
			{
				Snake snake = (Snake)mSnakes.get(k);
				int k1 = snake.x;
				int i2 = snake.size;
				int j2 = snake.y;
				int k2 = snake.size;
				if(flag)
					for(j--; j >= k1 + i2; j--)
						if(mCallback.areItemsTheSame(j, i1))
						{
							if(mCallback.areContentsTheSame(j, i1))
								i = 8;
							else
		//*  91  158:goto            21
								i = 4;
		//   92  161:iconst_4        
		//   93  162:istore_1        
							mNewItemStatuses[i1] = j << 5 | 0x10;
							mOldItemStatuses[j] = i1 << 5 | i;
							return true;
						}

		//   94  163:goto            115
		//   95  166:iload_2         
		//   96  167:iconst_1        
		//   97  168:isub            
		//   98  169:istore_2        
				else
		//*  99  170:goto            77
					for(j = l - 1; j >= j2 + k2; j--)
		//* 100  173:iload           5
		//* 101  175:iconst_1        
		//* 102  176:isub            
		//* 103  177:istore_2        
		//* 104  178:iload_2         
		//* 105  179:iload           9
		//* 106  181:iload           10
		//* 107  183:iadd            
		//* 108  184:icmplt          257
						if(mCallback.areItemsTheSame(i1, j))
		//* 109  187:aload_0         
		//* 110  188:getfield        #55  <Field DiffUtil$Callback mCallback>
		//* 111  191:iload           6
		//* 112  193:iload_2         
		//* 113  194:invokevirtual   #202 <Method boolean DiffUtil$Callback.areItemsTheSame(int, int)>
		//* 114  197:ifeq            250
						{
							if(mCallback.areContentsTheSame(i1, j))
		//* 115  200:aload_0         
		//* 116  201:getfield        #55  <Field DiffUtil$Callback mCallback>
		//* 117  204:iload           6
		//* 118  206:iload_2         
		//* 119  207:invokevirtual   #205 <Method boolean DiffUtil$Callback.areContentsTheSame(int, int)>
		//* 120  210:ifeq            245
								k = 8;
		//  121  213:bipush          8
		//  122  215:istore_3        
							else
		//* 123  216:aload_0         
		//* 124  217:getfield        #45  <Field int[] mOldItemStatuses>
		//* 125  220:iload_1         
		//* 126  221:iconst_1        
		//* 127  222:isub            
		//* 128  223:iload_2         
		//* 129  224:iconst_5        
		//* 130  225:ishl            
		//* 131  226:bipush          16
		//* 132  228:ior             
		//* 133  229:iastore         
		//* 134  230:aload_0         
		//* 135  231:getfield        #47  <Field int[] mNewItemStatuses>
		//* 136  234:iload_2         
		//* 137  235:iload_1         
		//* 138  236:iconst_1        
		//* 139  237:isub            
		//* 140  238:iconst_5        
		//* 141  239:ishl            
		//* 142  240:iload_3         
		//* 143  241:ior             
		//* 144  242:iastore         
		//* 145  243:iconst_1        
		//* 146  244:ireturn         
								k = 4;
		//  147  245:iconst_4        
		//  148  246:istore_3        
							mOldItemStatuses[i - 1] = j << 5 | 0x10;
							mNewItemStatuses[j] = i - 1 << 5 | k;
							return true;
						}

		//  149  247:goto            216
		//  150  250:iload_2         
		//  151  251:iconst_1        
		//  152  252:isub            
		//  153  253:istore_2        
		//* 154  254:goto            178
				j = snake.x;
		//  155  257:aload           11
		//  156  259:getfield        #90  <Field int DiffUtil$Snake.x>
		//  157  262:istore_2        
				l = snake.y;
		//  158  263:aload           11
		//  159  265:getfield        #93  <Field int DiffUtil$Snake.y>
		//  160  268:istore          5
			}

		//  161  270:iload_3         
		//  162  271:iconst_1        
		//  163  272:isub            
		//  164  273:istore_3        
		//* 165  274:goto            21
			return false;
		//  166  277:iconst_0        
		//  167  278:ireturn         
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
				Snake snake = (Snake)mSnakes.get(k);
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
		//* 103  193:iload           4
		//* 104  195:iconst_5        
		//* 105  196:ishl            
		//* 106  197:iload_2         
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
					mNewItemStatuses[k1] = i1 << 5 | j;
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

		private static PostponedUpdate removePostponedUpdate(List list, int i, boolean flag)
		{
			PostponedUpdate postponedupdate;
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
					PostponedUpdate postponedupdate1 = (PostponedUpdate)list.get(j);
		//    7   13:aload_0         
		//    8   14:iload_3         
		//    9   15:invokeinterface #111 <Method Object List.get(int)>
		//   10   20:checkcast       #163 <Class DiffUtil$PostponedUpdate>
		//   11   23:astore          6
					if(postponedupdate1.posInOwnerList == i && postponedupdate1.removal == flag)
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
							postponedupdate = postponedupdate1;
		//   26   53:aload           6
		//   27   55:astore          5
							if(i >= list.size())
								break;
		//   28   57:iload_1         
		//   29   58:aload_0         
		//   30   59:invokeinterface #207 <Method int List.size()>
		//   31   64:icmpge          123
							postponedupdate = (PostponedUpdate)list.get(i);
		//   32   67:aload_0         
		//   33   68:iload_1         
		//   34   69:invokeinterface #111 <Method Object List.get(int)>
		//   35   74:checkcast       #163 <Class DiffUtil$PostponedUpdate>
		//   36   77:astore          5
							int k = postponedupdate.currentPos;
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
							postponedupdate.currentPos = j + k;
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
				postponedupdate = null;
		//   62  120:aconst_null     
		//   63  121:astore          5
			}
			return postponedupdate;
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
		//*  12   25:istore          4
		//*  13   27:aload_0         
		//*  14   28:getfield        #68  <Field int mNewListSize>
		//*  15   31:istore_3        
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
		//*  44   92:iload           4
		//*  45   94:icmpge          113
		//*  46   97:aload_0         
		//*  47   98:aload           8
		//*  48  100:aload_1         
		//*  49  101:iload           6
		//*  50  103:iload           4
		//*  51  105:iload           6
		//*  52  107:isub            
		//*  53  108:iload           6
		//*  54  110:invokespecial   #229 <Method void dispatchRemovals(List, ListUpdateCallback, int, int, int)>
		//*  55  113:iload           7
		//*  56  115:iload_3         
		//*  57  116:icmpge          134
		//*  58  119:aload_0         
		//*  59  120:aload           8
		//*  60  122:aload_1         
		//*  61  123:iload           6
		//*  62  125:iload_3         
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
			k = mOldListSize;
			j = mNewListSize;
			for(int i = mSnakes.size() - 1; i >= 0; i--)
			{
				Snake snake = (Snake)mSnakes.get(i);
				int l = snake.size;
				int i1 = snake.x + l;
				int j1 = snake.y + l;
				if(i1 < k)
					dispatchRemovals(((List) (arraylist)), listupdatecallback, i1, k - i1, i1);
				if(j1 < j)
					dispatchAdditions(((List) (arraylist)), listupdatecallback, i1, j - j1, j1);
				for(j = l - 1; j >= 0; j--)
					if((mOldItemStatuses[snake.x + j] & 0x1f) == 2)
						((BatchingListUpdateCallback) (listupdatecallback)).onChanged(snake.x + j, 1, mCallback.getChangePayload(snake.x + j, snake.y + j));

		//* 112  211:goto            12
				k = snake.x;
		//  113  214:aload           9
		//  114  216:getfield        #90  <Field int DiffUtil$Snake.x>
		//  115  219:istore          4
				j = snake.y;
		//  116  221:aload           9
		//  117  223:getfield        #93  <Field int DiffUtil$Snake.y>
		//  118  226:istore_3        
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

		public void dispatchUpdatesTo(android.support.v7.widget.RecyclerView.Adapter adapter)
		{
			dispatchUpdatesTo(((_cls1) (adapter)). new ListUpdateCallback() {

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

				final DiffResult this$0;
				final android.support.v7.widget.RecyclerView.Adapter val$adapter;

			
			{
				this$0 = final_diffresult;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field DiffUtil$DiffResult this$0>
				adapter = android.support.v7.widget.RecyclerView.Adapter.this;
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
		private final Callback mCallback;
		private final boolean mDetectMoves;
		private final int mNewItemStatuses[];
		private final int mNewListSize;
		private final int mOldItemStatuses[];
		private final int mOldListSize;
		private final List mSnakes;

		DiffResult(Callback callback, List list, int ai[], int ai1[], boolean flag)
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

	private static class PostponedUpdate
	{

		int currentPos;
		int posInOwnerList;
		boolean removal;

		public PostponedUpdate(int i, int j, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			posInOwnerList = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #19  <Field int posInOwnerList>
			currentPos = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #21  <Field int currentPos>
			removal = flag;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #23  <Field boolean removal>
		//   11   19:return          
		}
	}

	static class Range
	{

		int newListEnd;
		int newListStart;
		int oldListEnd;
		int oldListStart;

		public Range()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}

		public Range(int i, int j, int k, int l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			oldListStart = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #20  <Field int oldListStart>
			oldListEnd = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #22  <Field int oldListEnd>
			newListStart = k;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #24  <Field int newListStart>
			newListEnd = l;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #26  <Field int newListEnd>
		//   14   25:return          
		}
	}

	static class Snake
	{

		boolean removal;
		boolean reverse;
		int size;
		int x;
		int y;

		Snake()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:return          
		}
	}


	private DiffUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
	//    2    4:return          
	}

	public static DiffResult calculateDiff(Callback callback)
	{
		return calculateDiff(callback, true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #40  <Method DiffUtil$DiffResult calculateDiff(DiffUtil$Callback, boolean)>
	//    3    5:areturn         
	}

	public static DiffResult calculateDiff(Callback callback, boolean flag)
	{
		int i = callback.getOldListSize();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #44  <Method int DiffUtil$Callback.getOldListSize()>
	//    2    4:istore_2        
		int j = callback.getNewListSize();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #47  <Method int DiffUtil$Callback.getNewListSize()>
	//    5    9:istore_3        
		ArrayList arraylist = new ArrayList();
	//    6   10:new             #49  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #50  <Method void ArrayList()>
	//    9   17:astore          5
		ArrayList arraylist1 = new ArrayList();
	//   10   19:new             #49  <Class ArrayList>
	//   11   22:dup             
	//   12   23:invokespecial   #50  <Method void ArrayList()>
	//   13   26:astore          6
		((List) (arraylist1)).add(((Object) (new Range(0, i, 0, j))));
	//   14   28:aload           6
	//   15   30:new             #19  <Class DiffUtil$Range>
	//   16   33:dup             
	//   17   34:iconst_0        
	//   18   35:iload_2         
	//   19   36:iconst_0        
	//   20   37:iload_3         
	//   21   38:invokespecial   #53  <Method void DiffUtil$Range(int, int, int, int)>
	//   22   41:invokeinterface #59  <Method boolean List.add(Object)>
	//   23   46:pop             
		i = i + j + Math.abs(i - j);
	//   24   47:iload_2         
	//   25   48:iload_3         
	//   26   49:iadd            
	//   27   50:iload_2         
	//   28   51:iload_3         
	//   29   52:isub            
	//   30   53:invokestatic    #65  <Method int Math.abs(int)>
	//   31   56:iadd            
	//   32   57:istore_2        
		int ai[] = new int[i * 2];
	//   33   58:iload_2         
	//   34   59:iconst_2        
	//   35   60:imul            
	//   36   61:newarray        int[]
	//   37   63:astore          7
		int ai1[] = new int[i * 2];
	//   38   65:iload_2         
	//   39   66:iconst_2        
	//   40   67:imul            
	//   41   68:newarray        int[]
	//   42   70:astore          8
		ArrayList arraylist2 = new ArrayList();
	//   43   72:new             #49  <Class ArrayList>
	//   44   75:dup             
	//   45   76:invokespecial   #50  <Method void ArrayList()>
	//   46   79:astore          9
		while(!((List) (arraylist1)).isEmpty()) 
	//*  47   81:aload           6
	//*  48   83:invokeinterface #69  <Method boolean List.isEmpty()>
	//*  49   88:ifne            505
		{
			Range range1 = (Range)((List) (arraylist1)).remove(((List) (arraylist1)).size() - 1);
	//   50   91:aload           6
	//   51   93:aload           6
	//   52   95:invokeinterface #72  <Method int List.size()>
	//   53  100:iconst_1        
	//   54  101:isub            
	//   55  102:invokeinterface #76  <Method Object List.remove(int)>
	//   56  107:checkcast       #19  <Class DiffUtil$Range>
	//   57  110:astore          10
			Snake snake = diffPartial(callback, range1.oldListStart, range1.oldListEnd, range1.newListStart, range1.newListEnd, ai, ai1, i);
	//   58  112:aload_0         
	//   59  113:aload           10
	//   60  115:getfield        #80  <Field int DiffUtil$Range.oldListStart>
	//   61  118:aload           10
	//   62  120:getfield        #83  <Field int DiffUtil$Range.oldListEnd>
	//   63  123:aload           10
	//   64  125:getfield        #86  <Field int DiffUtil$Range.newListStart>
	//   65  128:aload           10
	//   66  130:getfield        #89  <Field int DiffUtil$Range.newListEnd>
	//   67  133:aload           7
	//   68  135:aload           8
	//   69  137:iload_2         
	//   70  138:invokestatic    #93  <Method DiffUtil$Snake diffPartial(DiffUtil$Callback, int, int, int, int, int[], int[], int)>
	//   71  141:astore          11
			if(snake != null)
	//*  72  143:aload           11
	//*  73  145:ifnull          492
			{
				if(snake.size > 0)
	//*  74  148:aload           11
	//*  75  150:getfield        #95  <Field int DiffUtil$Snake.size>
	//*  76  153:ifle            166
					((List) (arraylist)).add(((Object) (snake)));
	//   77  156:aload           5
	//   78  158:aload           11
	//   79  160:invokeinterface #59  <Method boolean List.add(Object)>
	//   80  165:pop             
				snake.x = snake.x + range1.oldListStart;
	//   81  166:aload           11
	//   82  168:aload           11
	//   83  170:getfield        #98  <Field int DiffUtil$Snake.x>
	//   84  173:aload           10
	//   85  175:getfield        #80  <Field int DiffUtil$Range.oldListStart>
	//   86  178:iadd            
	//   87  179:putfield        #98  <Field int DiffUtil$Snake.x>
				snake.y = snake.y + range1.newListStart;
	//   88  182:aload           11
	//   89  184:aload           11
	//   90  186:getfield        #101 <Field int DiffUtil$Snake.y>
	//   91  189:aload           10
	//   92  191:getfield        #86  <Field int DiffUtil$Range.newListStart>
	//   93  194:iadd            
	//   94  195:putfield        #101 <Field int DiffUtil$Snake.y>
				Range range;
				if(((List) (arraylist2)).isEmpty())
	//*  95  198:aload           9
	//*  96  200:invokeinterface #69  <Method boolean List.isEmpty()>
	//*  97  205:ifeq            338
					range = new Range();
	//   98  208:new             #19  <Class DiffUtil$Range>
	//   99  211:dup             
	//  100  212:invokespecial   #102 <Method void DiffUtil$Range()>
	//  101  215:astore          4
				else
	//* 102  217:aload           4
	//* 103  219:aload           10
	//* 104  221:getfield        #80  <Field int DiffUtil$Range.oldListStart>
	//* 105  224:putfield        #80  <Field int DiffUtil$Range.oldListStart>
	//* 106  227:aload           4
	//* 107  229:aload           10
	//* 108  231:getfield        #86  <Field int DiffUtil$Range.newListStart>
	//* 109  234:putfield        #86  <Field int DiffUtil$Range.newListStart>
	//* 110  237:aload           11
	//* 111  239:getfield        #106 <Field boolean DiffUtil$Snake.reverse>
	//* 112  242:ifeq            362
	//* 113  245:aload           4
	//* 114  247:aload           11
	//* 115  249:getfield        #98  <Field int DiffUtil$Snake.x>
	//* 116  252:putfield        #83  <Field int DiffUtil$Range.oldListEnd>
	//* 117  255:aload           4
	//* 118  257:aload           11
	//* 119  259:getfield        #101 <Field int DiffUtil$Snake.y>
	//* 120  262:putfield        #89  <Field int DiffUtil$Range.newListEnd>
	//* 121  265:aload           6
	//* 122  267:aload           4
	//* 123  269:invokeinterface #59  <Method boolean List.add(Object)>
	//* 124  274:pop             
	//* 125  275:aload           11
	//* 126  277:getfield        #106 <Field boolean DiffUtil$Snake.reverse>
	//* 127  280:ifeq            457
	//* 128  283:aload           11
	//* 129  285:getfield        #109 <Field boolean DiffUtil$Snake.removal>
	//* 130  288:ifeq            420
	//* 131  291:aload           10
	//* 132  293:aload           11
	//* 133  295:getfield        #98  <Field int DiffUtil$Snake.x>
	//* 134  298:aload           11
	//* 135  300:getfield        #95  <Field int DiffUtil$Snake.size>
	//* 136  303:iadd            
	//* 137  304:iconst_1        
	//* 138  305:iadd            
	//* 139  306:putfield        #80  <Field int DiffUtil$Range.oldListStart>
	//* 140  309:aload           10
	//* 141  311:aload           11
	//* 142  313:getfield        #101 <Field int DiffUtil$Snake.y>
	//* 143  316:aload           11
	//* 144  318:getfield        #95  <Field int DiffUtil$Snake.size>
	//* 145  321:iadd            
	//* 146  322:putfield        #86  <Field int DiffUtil$Range.newListStart>
	//* 147  325:aload           6
	//* 148  327:aload           10
	//* 149  329:invokeinterface #59  <Method boolean List.add(Object)>
	//* 150  334:pop             
	//* 151  335:goto            81
					range = (Range)((List) (arraylist2)).remove(((List) (arraylist2)).size() - 1);
	//  152  338:aload           9
	//  153  340:aload           9
	//  154  342:invokeinterface #72  <Method int List.size()>
	//  155  347:iconst_1        
	//  156  348:isub            
	//  157  349:invokeinterface #76  <Method Object List.remove(int)>
	//  158  354:checkcast       #19  <Class DiffUtil$Range>
	//  159  357:astore          4
				range.oldListStart = range1.oldListStart;
				range.newListStart = range1.newListStart;
				if(snake.reverse)
				{
					range.oldListEnd = snake.x;
					range.newListEnd = snake.y;
				} else
	//* 160  359:goto            217
				if(snake.removal)
	//* 161  362:aload           11
	//* 162  364:getfield        #109 <Field boolean DiffUtil$Snake.removal>
	//* 163  367:ifeq            395
				{
					range.oldListEnd = snake.x - 1;
	//  164  370:aload           4
	//  165  372:aload           11
	//  166  374:getfield        #98  <Field int DiffUtil$Snake.x>
	//  167  377:iconst_1        
	//  168  378:isub            
	//  169  379:putfield        #83  <Field int DiffUtil$Range.oldListEnd>
					range.newListEnd = snake.y;
	//  170  382:aload           4
	//  171  384:aload           11
	//  172  386:getfield        #101 <Field int DiffUtil$Snake.y>
	//  173  389:putfield        #89  <Field int DiffUtil$Range.newListEnd>
				} else
	//* 174  392:goto            265
				{
					range.oldListEnd = snake.x;
	//  175  395:aload           4
	//  176  397:aload           11
	//  177  399:getfield        #98  <Field int DiffUtil$Snake.x>
	//  178  402:putfield        #83  <Field int DiffUtil$Range.oldListEnd>
					range.newListEnd = snake.y - 1;
	//  179  405:aload           4
	//  180  407:aload           11
	//  181  409:getfield        #101 <Field int DiffUtil$Snake.y>
	//  182  412:iconst_1        
	//  183  413:isub            
	//  184  414:putfield        #89  <Field int DiffUtil$Range.newListEnd>
				}
				((List) (arraylist1)).add(((Object) (range)));
				if(snake.reverse)
				{
					if(snake.removal)
					{
						range1.oldListStart = snake.x + snake.size + 1;
						range1.newListStart = snake.y + snake.size;
					} else
	//* 185  417:goto            265
					{
						range1.oldListStart = snake.x + snake.size;
	//  186  420:aload           10
	//  187  422:aload           11
	//  188  424:getfield        #98  <Field int DiffUtil$Snake.x>
	//  189  427:aload           11
	//  190  429:getfield        #95  <Field int DiffUtil$Snake.size>
	//  191  432:iadd            
	//  192  433:putfield        #80  <Field int DiffUtil$Range.oldListStart>
						range1.newListStart = snake.y + snake.size + 1;
	//  193  436:aload           10
	//  194  438:aload           11
	//  195  440:getfield        #101 <Field int DiffUtil$Snake.y>
	//  196  443:aload           11
	//  197  445:getfield        #95  <Field int DiffUtil$Snake.size>
	//  198  448:iadd            
	//  199  449:iconst_1        
	//  200  450:iadd            
	//  201  451:putfield        #86  <Field int DiffUtil$Range.newListStart>
					}
				} else
	//* 202  454:goto            325
				{
					range1.oldListStart = snake.x + snake.size;
	//  203  457:aload           10
	//  204  459:aload           11
	//  205  461:getfield        #98  <Field int DiffUtil$Snake.x>
	//  206  464:aload           11
	//  207  466:getfield        #95  <Field int DiffUtil$Snake.size>
	//  208  469:iadd            
	//  209  470:putfield        #80  <Field int DiffUtil$Range.oldListStart>
					range1.newListStart = snake.y + snake.size;
	//  210  473:aload           10
	//  211  475:aload           11
	//  212  477:getfield        #101 <Field int DiffUtil$Snake.y>
	//  213  480:aload           11
	//  214  482:getfield        #95  <Field int DiffUtil$Snake.size>
	//  215  485:iadd            
	//  216  486:putfield        #86  <Field int DiffUtil$Range.newListStart>
				}
				((List) (arraylist1)).add(((Object) (range1)));
			} else
	//* 217  489:goto            325
			{
				((List) (arraylist2)).add(((Object) (range1)));
	//  218  492:aload           9
	//  219  494:aload           10
	//  220  496:invokeinterface #59  <Method boolean List.add(Object)>
	//  221  501:pop             
			}
		}
	//* 222  502:goto            81
		Collections.sort(((List) (arraylist)), SNAKE_COMPARATOR);
	//  223  505:aload           5
	//  224  507:getstatic       #33  <Field Comparator SNAKE_COMPARATOR>
	//  225  510:invokestatic    #115 <Method void Collections.sort(List, Comparator)>
		return new DiffResult(callback, ((List) (arraylist)), ai, ai1, flag);
	//  226  513:new             #11  <Class DiffUtil$DiffResult>
	//  227  516:dup             
	//  228  517:aload_0         
	//  229  518:aload           5
	//  230  520:aload           7
	//  231  522:aload           8
	//  232  524:iload_1         
	//  233  525:invokespecial   #118 <Method void DiffUtil$DiffResult(DiffUtil$Callback, List, int[], int[], boolean)>
	//  234  528:areturn         
	}

	private static Snake diffPartial(Callback callback, int i, int j, int k, int l, int ai[], int ai1[], int i1)
	{
		int k2 = j - i;
	//    0    0:iload_2         
	//    1    1:iload_1         
	//    2    2:isub            
	//    3    3:istore          11
		int l2 = l - k;
	//    4    5:iload           4
	//    5    7:iload_3         
	//    6    8:isub            
	//    7    9:istore          12
		if(j - i < 1 || l - k < 1)
	//*   8   11:iload_2         
	//*   9   12:iload_1         
	//*  10   13:isub            
	//*  11   14:iconst_1        
	//*  12   15:icmplt          26
	//*  13   18:iload           4
	//*  14   20:iload_3         
	//*  15   21:isub            
	//*  16   22:iconst_1        
	//*  17   23:icmpge          28
			return null;
	//   18   26:aconst_null     
	//   19   27:areturn         
		int i3 = k2 - l2;
	//   20   28:iload           11
	//   21   30:iload           12
	//   22   32:isub            
	//   23   33:istore          13
		int j3 = (k2 + l2 + 1) / 2;
	//   24   35:iload           11
	//   25   37:iload           12
	//   26   39:iadd            
	//   27   40:iconst_1        
	//   28   41:iadd            
	//   29   42:iconst_2        
	//   30   43:idiv            
	//   31   44:istore          14
		Arrays.fill(ai, i1 - j3 - 1, i1 + j3 + 1, 0);
	//   32   46:aload           5
	//   33   48:iload           7
	//   34   50:iload           14
	//   35   52:isub            
	//   36   53:iconst_1        
	//   37   54:isub            
	//   38   55:iload           7
	//   39   57:iload           14
	//   40   59:iadd            
	//   41   60:iconst_1        
	//   42   61:iadd            
	//   43   62:iconst_0        
	//   44   63:invokestatic    #124 <Method void Arrays.fill(int[], int, int, int)>
		Arrays.fill(ai1, (i1 - j3 - 1) + i3, i1 + j3 + 1 + i3, k2);
	//   45   66:aload           6
	//   46   68:iload           7
	//   47   70:iload           14
	//   48   72:isub            
	//   49   73:iconst_1        
	//   50   74:isub            
	//   51   75:iload           13
	//   52   77:iadd            
	//   53   78:iload           7
	//   54   80:iload           14
	//   55   82:iadd            
	//   56   83:iconst_1        
	//   57   84:iadd            
	//   58   85:iload           13
	//   59   87:iadd            
	//   60   88:iload           11
	//   61   90:invokestatic    #124 <Method void Arrays.fill(int[], int, int, int)>
		int j1;
		if(i3 % 2 != 0)
	//*  62   93:iload           13
	//*  63   95:iconst_2        
	//*  64   96:irem            
	//*  65   97:ifeq            223
			l = 1;
	//   66  100:iconst_1        
	//   67  101:istore          4
		else
	//*  68  103:iconst_0        
	//*  69  104:istore          8
	//*  70  106:iload           8
	//*  71  108:iload           14
	//*  72  110:icmpgt          658
	//*  73  113:iload           8
	//*  74  115:ineg            
	//*  75  116:istore          9
	//*  76  118:iload           9
	//*  77  120:iload           8
	//*  78  122:icmpgt          379
	//*  79  125:iload           9
	//*  80  127:iload           8
	//*  81  129:ineg            
	//*  82  130:icmpeq          163
	//*  83  133:iload           9
	//*  84  135:iload           8
	//*  85  137:icmpeq          229
	//*  86  140:aload           5
	//*  87  142:iload           7
	//*  88  144:iload           9
	//*  89  146:iadd            
	//*  90  147:iconst_1        
	//*  91  148:isub            
	//*  92  149:iaload          
	//*  93  150:aload           5
	//*  94  152:iload           7
	//*  95  154:iload           9
	//*  96  156:iadd            
	//*  97  157:iconst_1        
	//*  98  158:iadd            
	//*  99  159:iaload          
	//* 100  160:icmpge          229
	//* 101  163:aload           5
	//* 102  165:iload           7
	//* 103  167:iload           9
	//* 104  169:iadd            
	//* 105  170:iconst_1        
	//* 106  171:iadd            
	//* 107  172:iaload          
	//* 108  173:istore_2        
	//* 109  174:iconst_0        
	//* 110  175:istore          16
	//* 111  177:iload_2         
	//* 112  178:iload           9
	//* 113  180:isub            
	//* 114  181:istore          10
	//* 115  183:iload_2         
	//* 116  184:iload           11
	//* 117  186:icmpge          248
	//* 118  189:iload           10
	//* 119  191:iload           12
	//* 120  193:icmpge          248
	//* 121  196:aload_0         
	//* 122  197:iload_1         
	//* 123  198:iload_2         
	//* 124  199:iadd            
	//* 125  200:iload_3         
	//* 126  201:iload           10
	//* 127  203:iadd            
	//* 128  204:invokevirtual   #128 <Method boolean DiffUtil$Callback.areItemsTheSame(int, int)>
	//* 129  207:ifeq            248
	//* 130  210:iload_2         
	//* 131  211:iconst_1        
	//* 132  212:iadd            
	//* 133  213:istore_2        
	//* 134  214:iload           10
	//* 135  216:iconst_1        
	//* 136  217:iadd            
	//* 137  218:istore          10
	//* 138  220:goto            183
			l = 0;
	//  139  223:iconst_0        
	//  140  224:istore          4
		for(j1 = 0; j1 <= j3; j1++)
		{
			for(int k1 = -j1; k1 <= j1; k1 += 2)
			{
				int i2;
				boolean flag;
				if(k1 == -j1 || k1 != j1 && ai[(i1 + k1) - 1] < ai[i1 + k1 + 1])
				{
					j = ai[i1 + k1 + 1];
					flag = false;
				} else
	//* 141  226:goto            103
				{
					j = ai[(i1 + k1) - 1] + 1;
	//  142  229:aload           5
	//  143  231:iload           7
	//  144  233:iload           9
	//  145  235:iadd            
	//  146  236:iconst_1        
	//  147  237:isub            
	//  148  238:iaload          
	//  149  239:iconst_1        
	//  150  240:iadd            
	//  151  241:istore_2        
					flag = true;
	//  152  242:iconst_1        
	//  153  243:istore          16
				}
				for(i2 = j - k1; j < k2 && i2 < l2 && callback.areItemsTheSame(i + j, k + i2); i2++)
					j++;

	//* 154  245:goto            177
				ai[i1 + k1] = j;
	//  155  248:aload           5
	//  156  250:iload           7
	//  157  252:iload           9
	//  158  254:iadd            
	//  159  255:iload_2         
	//  160  256:iastore         
				if(l != 0 && k1 >= (i3 - j1) + 1 && k1 <= (i3 + j1) - 1 && ai[i1 + k1] >= ai1[i1 + k1])
	//* 161  257:iload           4
	//* 162  259:ifeq            370
	//* 163  262:iload           9
	//* 164  264:iload           13
	//* 165  266:iload           8
	//* 166  268:isub            
	//* 167  269:iconst_1        
	//* 168  270:iadd            
	//* 169  271:icmplt          370
	//* 170  274:iload           9
	//* 171  276:iload           13
	//* 172  278:iload           8
	//* 173  280:iadd            
	//* 174  281:iconst_1        
	//* 175  282:isub            
	//* 176  283:icmpgt          370
	//* 177  286:aload           5
	//* 178  288:iload           7
	//* 179  290:iload           9
	//* 180  292:iadd            
	//* 181  293:iaload          
	//* 182  294:aload           6
	//* 183  296:iload           7
	//* 184  298:iload           9
	//* 185  300:iadd            
	//* 186  301:iaload          
	//* 187  302:icmplt          370
				{
					callback = ((Callback) (new Snake()));
	//  188  305:new             #22  <Class DiffUtil$Snake>
	//  189  308:dup             
	//  190  309:invokespecial   #129 <Method void DiffUtil$Snake()>
	//  191  312:astore_0        
					callback.x = ai1[i1 + k1];
	//  192  313:aload_0         
	//  193  314:aload           6
	//  194  316:iload           7
	//  195  318:iload           9
	//  196  320:iadd            
	//  197  321:iaload          
	//  198  322:putfield        #98  <Field int DiffUtil$Snake.x>
					callback.y = ((Snake) (callback)).x - k1;
	//  199  325:aload_0         
	//  200  326:aload_0         
	//  201  327:getfield        #98  <Field int DiffUtil$Snake.x>
	//  202  330:iload           9
	//  203  332:isub            
	//  204  333:putfield        #101 <Field int DiffUtil$Snake.y>
					callback.size = ai[i1 + k1] - ai1[i1 + k1];
	//  205  336:aload_0         
	//  206  337:aload           5
	//  207  339:iload           7
	//  208  341:iload           9
	//  209  343:iadd            
	//  210  344:iaload          
	//  211  345:aload           6
	//  212  347:iload           7
	//  213  349:iload           9
	//  214  351:iadd            
	//  215  352:iaload          
	//  216  353:isub            
	//  217  354:putfield        #95  <Field int DiffUtil$Snake.size>
					callback.removal = flag;
	//  218  357:aload_0         
	//  219  358:iload           16
	//  220  360:putfield        #109 <Field boolean DiffUtil$Snake.removal>
					callback.reverse = false;
	//  221  363:aload_0         
	//  222  364:iconst_0        
	//  223  365:putfield        #106 <Field boolean DiffUtil$Snake.reverse>
					return ((Snake) (callback));
	//  224  368:aload_0         
	//  225  369:areturn         
				}
			}

	//  226  370:iload           9
	//  227  372:iconst_2        
	//  228  373:iadd            
	//  229  374:istore          9
	//* 230  376:goto            118
			for(int l1 = -j1; l1 <= j1; l1 += 2)
	//* 231  379:iload           8
	//* 232  381:ineg            
	//* 233  382:istore          9
	//* 234  384:iload           9
	//* 235  386:iload           8
	//* 236  388:icmpgt          649
			{
				int k3 = l1 + i3;
	//  237  391:iload           9
	//  238  393:iload           13
	//  239  395:iadd            
	//  240  396:istore          15
				int j2;
				boolean flag1;
				if(k3 == j1 + i3 || k3 != -j1 + i3 && ai1[(i1 + k3) - 1] < ai1[i1 + k3 + 1])
	//* 241  398:iload           15
	//* 242  400:iload           8
	//* 243  402:iload           13
	//* 244  404:iadd            
	//* 245  405:icmpeq          442
	//* 246  408:iload           15
	//* 247  410:iload           8
	//* 248  412:ineg            
	//* 249  413:iload           13
	//* 250  415:iadd            
	//* 251  416:icmpeq          502
	//* 252  419:aload           6
	//* 253  421:iload           7
	//* 254  423:iload           15
	//* 255  425:iadd            
	//* 256  426:iconst_1        
	//* 257  427:isub            
	//* 258  428:iaload          
	//* 259  429:aload           6
	//* 260  431:iload           7
	//* 261  433:iload           15
	//* 262  435:iadd            
	//* 263  436:iconst_1        
	//* 264  437:iadd            
	//* 265  438:iaload          
	//* 266  439:icmpge          502
				{
					j = ai1[(i1 + k3) - 1];
	//  267  442:aload           6
	//  268  444:iload           7
	//  269  446:iload           15
	//  270  448:iadd            
	//  271  449:iconst_1        
	//  272  450:isub            
	//  273  451:iaload          
	//  274  452:istore_2        
					flag1 = false;
	//  275  453:iconst_0        
	//  276  454:istore          16
				} else
	//* 277  456:iload_2         
	//* 278  457:iload           15
	//* 279  459:isub            
	//* 280  460:istore          10
	//* 281  462:iload_2         
	//* 282  463:ifle            521
	//* 283  466:iload           10
	//* 284  468:ifle            521
	//* 285  471:aload_0         
	//* 286  472:iload_1         
	//* 287  473:iload_2         
	//* 288  474:iadd            
	//* 289  475:iconst_1        
	//* 290  476:isub            
	//* 291  477:iload_3         
	//* 292  478:iload           10
	//* 293  480:iadd            
	//* 294  481:iconst_1        
	//* 295  482:isub            
	//* 296  483:invokevirtual   #128 <Method boolean DiffUtil$Callback.areItemsTheSame(int, int)>
	//* 297  486:ifeq            521
	//* 298  489:iload_2         
	//* 299  490:iconst_1        
	//* 300  491:isub            
	//* 301  492:istore_2        
	//* 302  493:iload           10
	//* 303  495:iconst_1        
	//* 304  496:isub            
	//* 305  497:istore          10
	//* 306  499:goto            462
				{
					j = ai1[i1 + k3 + 1] - 1;
	//  307  502:aload           6
	//  308  504:iload           7
	//  309  506:iload           15
	//  310  508:iadd            
	//  311  509:iconst_1        
	//  312  510:iadd            
	//  313  511:iaload          
	//  314  512:iconst_1        
	//  315  513:isub            
	//  316  514:istore_2        
					flag1 = true;
	//  317  515:iconst_1        
	//  318  516:istore          16
				}
				for(j2 = j - k3; j > 0 && j2 > 0 && callback.areItemsTheSame((i + j) - 1, (k + j2) - 1); j2--)
					j--;

	//* 319  518:goto            456
				ai1[i1 + k3] = j;
	//  320  521:aload           6
	//  321  523:iload           7
	//  322  525:iload           15
	//  323  527:iadd            
	//  324  528:iload_2         
	//  325  529:iastore         
				if(l == 0 && l1 + i3 >= -j1 && l1 + i3 <= j1 && ai[i1 + k3] >= ai1[i1 + k3])
	//* 326  530:iload           4
	//* 327  532:ifne            640
	//* 328  535:iload           9
	//* 329  537:iload           13
	//* 330  539:iadd            
	//* 331  540:iload           8
	//* 332  542:ineg            
	//* 333  543:icmplt          640
	//* 334  546:iload           9
	//* 335  548:iload           13
	//* 336  550:iadd            
	//* 337  551:iload           8
	//* 338  553:icmpgt          640
	//* 339  556:aload           5
	//* 340  558:iload           7
	//* 341  560:iload           15
	//* 342  562:iadd            
	//* 343  563:iaload          
	//* 344  564:aload           6
	//* 345  566:iload           7
	//* 346  568:iload           15
	//* 347  570:iadd            
	//* 348  571:iaload          
	//* 349  572:icmplt          640
				{
					callback = ((Callback) (new Snake()));
	//  350  575:new             #22  <Class DiffUtil$Snake>
	//  351  578:dup             
	//  352  579:invokespecial   #129 <Method void DiffUtil$Snake()>
	//  353  582:astore_0        
					callback.x = ai1[i1 + k3];
	//  354  583:aload_0         
	//  355  584:aload           6
	//  356  586:iload           7
	//  357  588:iload           15
	//  358  590:iadd            
	//  359  591:iaload          
	//  360  592:putfield        #98  <Field int DiffUtil$Snake.x>
					callback.y = ((Snake) (callback)).x - k3;
	//  361  595:aload_0         
	//  362  596:aload_0         
	//  363  597:getfield        #98  <Field int DiffUtil$Snake.x>
	//  364  600:iload           15
	//  365  602:isub            
	//  366  603:putfield        #101 <Field int DiffUtil$Snake.y>
					callback.size = ai[i1 + k3] - ai1[i1 + k3];
	//  367  606:aload_0         
	//  368  607:aload           5
	//  369  609:iload           7
	//  370  611:iload           15
	//  371  613:iadd            
	//  372  614:iaload          
	//  373  615:aload           6
	//  374  617:iload           7
	//  375  619:iload           15
	//  376  621:iadd            
	//  377  622:iaload          
	//  378  623:isub            
	//  379  624:putfield        #95  <Field int DiffUtil$Snake.size>
					callback.removal = flag1;
	//  380  627:aload_0         
	//  381  628:iload           16
	//  382  630:putfield        #109 <Field boolean DiffUtil$Snake.removal>
					callback.reverse = true;
	//  383  633:aload_0         
	//  384  634:iconst_1        
	//  385  635:putfield        #106 <Field boolean DiffUtil$Snake.reverse>
					return ((Snake) (callback));
	//  386  638:aload_0         
	//  387  639:areturn         
				}
			}

	//  388  640:iload           9
	//  389  642:iconst_2        
	//  390  643:iadd            
	//  391  644:istore          9
		}

	//  392  646:goto            384
	//  393  649:iload           8
	//  394  651:iconst_1        
	//  395  652:iadd            
	//  396  653:istore          8
	//* 397  655:goto            106
		throw new IllegalStateException("DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation.");
	//  398  658:new             #131 <Class IllegalStateException>
	//  399  661:dup             
	//  400  662:ldc1            #133 <String "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation.">
	//  401  664:invokespecial   #136 <Method void IllegalStateException(String)>
	//  402  667:athrow          
	}

	private static final Comparator SNAKE_COMPARATOR = new Comparator() {

		public int compare(Snake snake, Snake snake1)
		{
			int j = snake.x - snake1.x;
		//    0    0:aload_1         
		//    1    1:getfield        #22  <Field int DiffUtil$Snake.x>
		//    2    4:aload_2         
		//    3    5:getfield        #22  <Field int DiffUtil$Snake.x>
		//    4    8:isub            
		//    5    9:istore          4
			int i = j;
		//    6   11:iload           4
		//    7   13:istore_3        
			if(j == 0)
		//*   8   14:iload           4
		//*   9   16:ifne            29
				i = snake.y - snake1.y;
		//   10   19:aload_1         
		//   11   20:getfield        #25  <Field int DiffUtil$Snake.y>
		//   12   23:aload_2         
		//   13   24:getfield        #25  <Field int DiffUtil$Snake.y>
		//   14   27:isub            
		//   15   28:istore_3        
			return i;
		//   16   29:iload_3         
		//   17   30:ireturn         
		}

		public volatile int compare(Object obj, Object obj1)
		{
			return compare((Snake)obj, (Snake)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class DiffUtil$Snake>
		//    3    5:aload_2         
		//    4    6:checkcast       #18  <Class DiffUtil$Snake>
		//    5    9:invokevirtual   #28  <Method int compare(DiffUtil$Snake, DiffUtil$Snake)>
		//    6   12:ireturn         
		}

	}
;

	static 
	{
	//    0    0:new             #6   <Class DiffUtil$1>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void DiffUtil$1()>
	//    3    7:putstatic       #33  <Field Comparator SNAKE_COMPARATOR>
	//*   4   10:return          
	}
}
