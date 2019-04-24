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
				Snake snake = (Snake)mSnakes.get(k);
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
				Snake snake = (Snake)mSnakes.get(i);
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
	//*  65   97:ifeq            225
			l = 1;
	//   66  100:iconst_1        
	//   67  101:istore          4
		else
	//*  68  103:iconst_0        
	//*  69  104:istore          8
	//*  70  106:iload           8
	//*  71  108:iload           14
	//*  72  110:icmpgt          664
	//*  73  113:iload           8
	//*  74  115:ineg            
	//*  75  116:istore          9
	//*  76  118:iload           9
	//*  77  120:iload           8
	//*  78  122:icmpgt          382
	//*  79  125:iload           9
	//*  80  127:iload           8
	//*  81  129:ineg            
	//*  82  130:icmpeq          163
	//*  83  133:iload           9
	//*  84  135:iload           8
	//*  85  137:icmpeq          231
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
	//* 100  160:icmpge          231
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
	//* 112  178:istore          10
	//* 113  180:iload_2         
	//* 114  181:iload           9
	//* 115  183:isub            
	//* 116  184:istore_2        
	//* 117  185:iload           10
	//* 118  187:iload           11
	//* 119  189:icmpge          250
	//* 120  192:iload_2         
	//* 121  193:iload           12
	//* 122  195:icmpge          250
	//* 123  198:aload_0         
	//* 124  199:iload_1         
	//* 125  200:iload           10
	//* 126  202:iadd            
	//* 127  203:iload_3         
	//* 128  204:iload_2         
	//* 129  205:iadd            
	//* 130  206:invokevirtual   #128 <Method boolean DiffUtil$Callback.areItemsTheSame(int, int)>
	//* 131  209:ifeq            250
	//* 132  212:iload           10
	//* 133  214:iconst_1        
	//* 134  215:iadd            
	//* 135  216:istore          10
	//* 136  218:iload_2         
	//* 137  219:iconst_1        
	//* 138  220:iadd            
	//* 139  221:istore_2        
	//* 140  222:goto            185
			l = 0;
	//  141  225:iconst_0        
	//  142  226:istore          4
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
	//* 143  228:goto            103
				{
					j = ai[(i1 + k1) - 1] + 1;
	//  144  231:aload           5
	//  145  233:iload           7
	//  146  235:iload           9
	//  147  237:iadd            
	//  148  238:iconst_1        
	//  149  239:isub            
	//  150  240:iaload          
	//  151  241:iconst_1        
	//  152  242:iadd            
	//  153  243:istore_2        
					flag = true;
	//  154  244:iconst_1        
	//  155  245:istore          16
				}
				i2 = j;
				for(j -= k1; i2 < k2 && j < l2 && callback.areItemsTheSame(i + i2, k + j); j++)
					i2++;

	//* 156  247:goto            177
				ai[i1 + k1] = i2;
	//  157  250:aload           5
	//  158  252:iload           7
	//  159  254:iload           9
	//  160  256:iadd            
	//  161  257:iload           10
	//  162  259:iastore         
				if(l != 0 && k1 >= (i3 - j1) + 1 && k1 <= (i3 + j1) - 1 && ai[i1 + k1] >= ai1[i1 + k1])
	//* 163  260:iload           4
	//* 164  262:ifeq            373
	//* 165  265:iload           9
	//* 166  267:iload           13
	//* 167  269:iload           8
	//* 168  271:isub            
	//* 169  272:iconst_1        
	//* 170  273:iadd            
	//* 171  274:icmplt          373
	//* 172  277:iload           9
	//* 173  279:iload           13
	//* 174  281:iload           8
	//* 175  283:iadd            
	//* 176  284:iconst_1        
	//* 177  285:isub            
	//* 178  286:icmpgt          373
	//* 179  289:aload           5
	//* 180  291:iload           7
	//* 181  293:iload           9
	//* 182  295:iadd            
	//* 183  296:iaload          
	//* 184  297:aload           6
	//* 185  299:iload           7
	//* 186  301:iload           9
	//* 187  303:iadd            
	//* 188  304:iaload          
	//* 189  305:icmplt          373
				{
					callback = ((Callback) (new Snake()));
	//  190  308:new             #22  <Class DiffUtil$Snake>
	//  191  311:dup             
	//  192  312:invokespecial   #129 <Method void DiffUtil$Snake()>
	//  193  315:astore_0        
					callback.x = ai1[i1 + k1];
	//  194  316:aload_0         
	//  195  317:aload           6
	//  196  319:iload           7
	//  197  321:iload           9
	//  198  323:iadd            
	//  199  324:iaload          
	//  200  325:putfield        #98  <Field int DiffUtil$Snake.x>
					callback.y = ((Snake) (callback)).x - k1;
	//  201  328:aload_0         
	//  202  329:aload_0         
	//  203  330:getfield        #98  <Field int DiffUtil$Snake.x>
	//  204  333:iload           9
	//  205  335:isub            
	//  206  336:putfield        #101 <Field int DiffUtil$Snake.y>
					callback.size = ai[i1 + k1] - ai1[i1 + k1];
	//  207  339:aload_0         
	//  208  340:aload           5
	//  209  342:iload           7
	//  210  344:iload           9
	//  211  346:iadd            
	//  212  347:iaload          
	//  213  348:aload           6
	//  214  350:iload           7
	//  215  352:iload           9
	//  216  354:iadd            
	//  217  355:iaload          
	//  218  356:isub            
	//  219  357:putfield        #95  <Field int DiffUtil$Snake.size>
					callback.removal = flag;
	//  220  360:aload_0         
	//  221  361:iload           16
	//  222  363:putfield        #109 <Field boolean DiffUtil$Snake.removal>
					callback.reverse = false;
	//  223  366:aload_0         
	//  224  367:iconst_0        
	//  225  368:putfield        #106 <Field boolean DiffUtil$Snake.reverse>
					return ((Snake) (callback));
	//  226  371:aload_0         
	//  227  372:areturn         
				}
			}

	//  228  373:iload           9
	//  229  375:iconst_2        
	//  230  376:iadd            
	//  231  377:istore          9
	//* 232  379:goto            118
			for(int l1 = -j1; l1 <= j1; l1 += 2)
	//* 233  382:iload           8
	//* 234  384:ineg            
	//* 235  385:istore          9
	//* 236  387:iload           9
	//* 237  389:iload           8
	//* 238  391:icmpgt          655
			{
				int k3 = l1 + i3;
	//  239  394:iload           9
	//  240  396:iload           13
	//  241  398:iadd            
	//  242  399:istore          15
				int j2;
				boolean flag1;
				if(k3 == j1 + i3 || k3 != -j1 + i3 && ai1[(i1 + k3) - 1] < ai1[i1 + k3 + 1])
	//* 243  401:iload           15
	//* 244  403:iload           8
	//* 245  405:iload           13
	//* 246  407:iadd            
	//* 247  408:icmpeq          445
	//* 248  411:iload           15
	//* 249  413:iload           8
	//* 250  415:ineg            
	//* 251  416:iload           13
	//* 252  418:iadd            
	//* 253  419:icmpeq          507
	//* 254  422:aload           6
	//* 255  424:iload           7
	//* 256  426:iload           15
	//* 257  428:iadd            
	//* 258  429:iconst_1        
	//* 259  430:isub            
	//* 260  431:iaload          
	//* 261  432:aload           6
	//* 262  434:iload           7
	//* 263  436:iload           15
	//* 264  438:iadd            
	//* 265  439:iconst_1        
	//* 266  440:iadd            
	//* 267  441:iaload          
	//* 268  442:icmpge          507
				{
					j = ai1[(i1 + k3) - 1];
	//  269  445:aload           6
	//  270  447:iload           7
	//  271  449:iload           15
	//  272  451:iadd            
	//  273  452:iconst_1        
	//  274  453:isub            
	//  275  454:iaload          
	//  276  455:istore_2        
					flag1 = false;
	//  277  456:iconst_0        
	//  278  457:istore          16
				} else
	//* 279  459:iload_2         
	//* 280  460:istore          10
	//* 281  462:iload_2         
	//* 282  463:iload           15
	//* 283  465:isub            
	//* 284  466:istore_2        
	//* 285  467:iload           10
	//* 286  469:ifle            526
	//* 287  472:iload_2         
	//* 288  473:ifle            526
	//* 289  476:aload_0         
	//* 290  477:iload_1         
	//* 291  478:iload           10
	//* 292  480:iadd            
	//* 293  481:iconst_1        
	//* 294  482:isub            
	//* 295  483:iload_3         
	//* 296  484:iload_2         
	//* 297  485:iadd            
	//* 298  486:iconst_1        
	//* 299  487:isub            
	//* 300  488:invokevirtual   #128 <Method boolean DiffUtil$Callback.areItemsTheSame(int, int)>
	//* 301  491:ifeq            526
	//* 302  494:iload           10
	//* 303  496:iconst_1        
	//* 304  497:isub            
	//* 305  498:istore          10
	//* 306  500:iload_2         
	//* 307  501:iconst_1        
	//* 308  502:isub            
	//* 309  503:istore_2        
	//* 310  504:goto            467
				{
					j = ai1[i1 + k3 + 1] - 1;
	//  311  507:aload           6
	//  312  509:iload           7
	//  313  511:iload           15
	//  314  513:iadd            
	//  315  514:iconst_1        
	//  316  515:iadd            
	//  317  516:iaload          
	//  318  517:iconst_1        
	//  319  518:isub            
	//  320  519:istore_2        
					flag1 = true;
	//  321  520:iconst_1        
	//  322  521:istore          16
				}
				j2 = j;
				for(j -= k3; j2 > 0 && j > 0 && callback.areItemsTheSame((i + j2) - 1, (k + j) - 1); j--)
					j2--;

	//* 323  523:goto            459
				ai1[i1 + k3] = j2;
	//  324  526:aload           6
	//  325  528:iload           7
	//  326  530:iload           15
	//  327  532:iadd            
	//  328  533:iload           10
	//  329  535:iastore         
				if(l == 0 && l1 + i3 >= -j1 && l1 + i3 <= j1 && ai[i1 + k3] >= ai1[i1 + k3])
	//* 330  536:iload           4
	//* 331  538:ifne            646
	//* 332  541:iload           9
	//* 333  543:iload           13
	//* 334  545:iadd            
	//* 335  546:iload           8
	//* 336  548:ineg            
	//* 337  549:icmplt          646
	//* 338  552:iload           9
	//* 339  554:iload           13
	//* 340  556:iadd            
	//* 341  557:iload           8
	//* 342  559:icmpgt          646
	//* 343  562:aload           5
	//* 344  564:iload           7
	//* 345  566:iload           15
	//* 346  568:iadd            
	//* 347  569:iaload          
	//* 348  570:aload           6
	//* 349  572:iload           7
	//* 350  574:iload           15
	//* 351  576:iadd            
	//* 352  577:iaload          
	//* 353  578:icmplt          646
				{
					callback = ((Callback) (new Snake()));
	//  354  581:new             #22  <Class DiffUtil$Snake>
	//  355  584:dup             
	//  356  585:invokespecial   #129 <Method void DiffUtil$Snake()>
	//  357  588:astore_0        
					callback.x = ai1[i1 + k3];
	//  358  589:aload_0         
	//  359  590:aload           6
	//  360  592:iload           7
	//  361  594:iload           15
	//  362  596:iadd            
	//  363  597:iaload          
	//  364  598:putfield        #98  <Field int DiffUtil$Snake.x>
					callback.y = ((Snake) (callback)).x - k3;
	//  365  601:aload_0         
	//  366  602:aload_0         
	//  367  603:getfield        #98  <Field int DiffUtil$Snake.x>
	//  368  606:iload           15
	//  369  608:isub            
	//  370  609:putfield        #101 <Field int DiffUtil$Snake.y>
					callback.size = ai[i1 + k3] - ai1[i1 + k3];
	//  371  612:aload_0         
	//  372  613:aload           5
	//  373  615:iload           7
	//  374  617:iload           15
	//  375  619:iadd            
	//  376  620:iaload          
	//  377  621:aload           6
	//  378  623:iload           7
	//  379  625:iload           15
	//  380  627:iadd            
	//  381  628:iaload          
	//  382  629:isub            
	//  383  630:putfield        #95  <Field int DiffUtil$Snake.size>
					callback.removal = flag1;
	//  384  633:aload_0         
	//  385  634:iload           16
	//  386  636:putfield        #109 <Field boolean DiffUtil$Snake.removal>
					callback.reverse = true;
	//  387  639:aload_0         
	//  388  640:iconst_1        
	//  389  641:putfield        #106 <Field boolean DiffUtil$Snake.reverse>
					return ((Snake) (callback));
	//  390  644:aload_0         
	//  391  645:areturn         
				}
			}

	//  392  646:iload           9
	//  393  648:iconst_2        
	//  394  649:iadd            
	//  395  650:istore          9
		}

	//  396  652:goto            387
	//  397  655:iload           8
	//  398  657:iconst_1        
	//  399  658:iadd            
	//  400  659:istore          8
	//* 401  661:goto            106
		throw new IllegalStateException("DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation.");
	//  402  664:new             #131 <Class IllegalStateException>
	//  403  667:dup             
	//  404  668:ldc1            #133 <String "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation.">
	//  405  670:invokespecial   #136 <Method void IllegalStateException(String)>
	//  406  673:athrow          
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
