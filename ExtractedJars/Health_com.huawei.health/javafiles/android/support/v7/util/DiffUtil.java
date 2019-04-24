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
		//*   3    9:ifeq            17
				snake = null;
		//    4   12:aconst_null     
		//    5   13:astore_1        
			else
		//*   6   14:goto            31
				snake = (Snake)mSnakes.get(0);
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
				Snake snake1 = new Snake();
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
		//		               0: 91
		//		               4: 147
		//		               8: 147
		//		               16: 209
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
						PostponedUpdate postponedupdate = (PostponedUpdate)iterator.next();
		//   36  117:aload           8
		//   37  119:invokeinterface #132 <Method Object Iterator.next()>
		//   38  124:checkcast       #134 <Class DiffUtil$PostponedUpdate>
		//   39  127:astore          9
						postponedupdate.currentPos = postponedupdate.currentPos + 1;
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
					list.add(((Object) (new PostponedUpdate(k + j, i, false))));
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
		//		               0: 91
		//		               4: 150
		//		               8: 150
		//		               16: 227
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
						PostponedUpdate postponedupdate1 = (PostponedUpdate)iterator.next();
		//   38  120:aload           8
		//   39  122:invokeinterface #132 <Method Object Iterator.next()>
		//   40  127:checkcast       #134 <Class DiffUtil$PostponedUpdate>
		//   41  130:astore          9
						postponedupdate1.currentPos = postponedupdate1.currentPos - 1;
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
					PostponedUpdate postponedupdate = removePostponedUpdate(list, i1, false);
		//   59  164:aload_1         
		//   60  165:iload           7
		//   61  167:iconst_0        
		//   62  168:invokestatic    #141 <Method DiffUtil$PostponedUpdate removePostponedUpdate(List, int, boolean)>
		//   63  171:astore          8
					listupdatecallback.onMoved(i + j, postponedupdate.currentPos - 1);
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
						listupdatecallback.onChanged(postponedupdate.currentPos - 1, 1, mCallback.getChangePayload(k + j, i1));
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
					list.add(((Object) (new PostponedUpdate(k + j, i + j, true))));
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
				Snake snake = (Snake)mSnakes.get(k);
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
				Snake snake = (Snake)mSnakes.get(k);
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

		private static PostponedUpdate removePostponedUpdate(List list, int i, boolean flag)
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
				PostponedUpdate postponedupdate = (PostponedUpdate)list.get(j);
		//    7   13:aload_0         
		//    8   14:iload_3         
		//    9   15:invokeinterface #89  <Method Object List.get(int)>
		//   10   20:checkcast       #134 <Class DiffUtil$PostponedUpdate>
		//   11   23:astore          5
				if(postponedupdate.posInOwnerList == i && postponedupdate.removal == flag)
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
						PostponedUpdate postponedupdate1 = (PostponedUpdate)list.get(i);
		//   30   63:aload_0         
		//   31   64:iload_1         
		//   32   65:invokeinterface #89  <Method Object List.get(int)>
		//   33   70:checkcast       #134 <Class DiffUtil$PostponedUpdate>
		//   34   73:astore          6
						int k = postponedupdate1.currentPos;
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
						postponedupdate1.currentPos = k + j;
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
					return postponedupdate;
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
				Snake snake = (Snake)mSnakes.get(i);
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

	static class PostponedUpdate
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
	//*  97  205:ifeq            220
					range = new Range();
	//   98  208:new             #19  <Class DiffUtil$Range>
	//   99  211:dup             
	//  100  212:invokespecial   #102 <Method void DiffUtil$Range()>
	//  101  215:astore          4
				else
	//* 102  217:goto            241
					range = (Range)((List) (arraylist2)).remove(((List) (arraylist2)).size() - 1);
	//  103  220:aload           9
	//  104  222:aload           9
	//  105  224:invokeinterface #72  <Method int List.size()>
	//  106  229:iconst_1        
	//  107  230:isub            
	//  108  231:invokeinterface #76  <Method Object List.remove(int)>
	//  109  236:checkcast       #19  <Class DiffUtil$Range>
	//  110  239:astore          4
				range.oldListStart = range1.oldListStart;
	//  111  241:aload           4
	//  112  243:aload           10
	//  113  245:getfield        #80  <Field int DiffUtil$Range.oldListStart>
	//  114  248:putfield        #80  <Field int DiffUtil$Range.oldListStart>
				range.newListStart = range1.newListStart;
	//  115  251:aload           4
	//  116  253:aload           10
	//  117  255:getfield        #86  <Field int DiffUtil$Range.newListStart>
	//  118  258:putfield        #86  <Field int DiffUtil$Range.newListStart>
				if(snake.reverse)
	//* 119  261:aload           11
	//* 120  263:getfield        #106 <Field boolean DiffUtil$Snake.reverse>
	//* 121  266:ifeq            292
				{
					range.oldListEnd = snake.x;
	//  122  269:aload           4
	//  123  271:aload           11
	//  124  273:getfield        #98  <Field int DiffUtil$Snake.x>
	//  125  276:putfield        #83  <Field int DiffUtil$Range.oldListEnd>
					range.newListEnd = snake.y;
	//  126  279:aload           4
	//  127  281:aload           11
	//  128  283:getfield        #101 <Field int DiffUtil$Snake.y>
	//  129  286:putfield        #89  <Field int DiffUtil$Range.newListEnd>
				} else
	//* 130  289:goto            347
				if(snake.removal)
	//* 131  292:aload           11
	//* 132  294:getfield        #109 <Field boolean DiffUtil$Snake.removal>
	//* 133  297:ifeq            325
				{
					range.oldListEnd = snake.x - 1;
	//  134  300:aload           4
	//  135  302:aload           11
	//  136  304:getfield        #98  <Field int DiffUtil$Snake.x>
	//  137  307:iconst_1        
	//  138  308:isub            
	//  139  309:putfield        #83  <Field int DiffUtil$Range.oldListEnd>
					range.newListEnd = snake.y;
	//  140  312:aload           4
	//  141  314:aload           11
	//  142  316:getfield        #101 <Field int DiffUtil$Snake.y>
	//  143  319:putfield        #89  <Field int DiffUtil$Range.newListEnd>
				} else
	//* 144  322:goto            347
				{
					range.oldListEnd = snake.x;
	//  145  325:aload           4
	//  146  327:aload           11
	//  147  329:getfield        #98  <Field int DiffUtil$Snake.x>
	//  148  332:putfield        #83  <Field int DiffUtil$Range.oldListEnd>
					range.newListEnd = snake.y - 1;
	//  149  335:aload           4
	//  150  337:aload           11
	//  151  339:getfield        #101 <Field int DiffUtil$Snake.y>
	//  152  342:iconst_1        
	//  153  343:isub            
	//  154  344:putfield        #89  <Field int DiffUtil$Range.newListEnd>
				}
				((List) (arraylist1)).add(((Object) (range)));
	//  155  347:aload           6
	//  156  349:aload           4
	//  157  351:invokeinterface #59  <Method boolean List.add(Object)>
	//  158  356:pop             
				if(snake.reverse)
	//* 159  357:aload           11
	//* 160  359:getfield        #106 <Field boolean DiffUtil$Snake.reverse>
	//* 161  362:ifeq            447
				{
					if(snake.removal)
	//* 162  365:aload           11
	//* 163  367:getfield        #109 <Field boolean DiffUtil$Snake.removal>
	//* 164  370:ifeq            410
					{
						range1.oldListStart = snake.x + snake.size + 1;
	//  165  373:aload           10
	//  166  375:aload           11
	//  167  377:getfield        #98  <Field int DiffUtil$Snake.x>
	//  168  380:aload           11
	//  169  382:getfield        #95  <Field int DiffUtil$Snake.size>
	//  170  385:iadd            
	//  171  386:iconst_1        
	//  172  387:iadd            
	//  173  388:putfield        #80  <Field int DiffUtil$Range.oldListStart>
						range1.newListStart = snake.y + snake.size;
	//  174  391:aload           10
	//  175  393:aload           11
	//  176  395:getfield        #101 <Field int DiffUtil$Snake.y>
	//  177  398:aload           11
	//  178  400:getfield        #95  <Field int DiffUtil$Snake.size>
	//  179  403:iadd            
	//  180  404:putfield        #86  <Field int DiffUtil$Range.newListStart>
					} else
	//* 181  407:goto            479
					{
						range1.oldListStart = snake.x + snake.size;
	//  182  410:aload           10
	//  183  412:aload           11
	//  184  414:getfield        #98  <Field int DiffUtil$Snake.x>
	//  185  417:aload           11
	//  186  419:getfield        #95  <Field int DiffUtil$Snake.size>
	//  187  422:iadd            
	//  188  423:putfield        #80  <Field int DiffUtil$Range.oldListStart>
						range1.newListStart = snake.y + snake.size + 1;
	//  189  426:aload           10
	//  190  428:aload           11
	//  191  430:getfield        #101 <Field int DiffUtil$Snake.y>
	//  192  433:aload           11
	//  193  435:getfield        #95  <Field int DiffUtil$Snake.size>
	//  194  438:iadd            
	//  195  439:iconst_1        
	//  196  440:iadd            
	//  197  441:putfield        #86  <Field int DiffUtil$Range.newListStart>
					}
				} else
	//* 198  444:goto            479
				{
					range1.oldListStart = snake.x + snake.size;
	//  199  447:aload           10
	//  200  449:aload           11
	//  201  451:getfield        #98  <Field int DiffUtil$Snake.x>
	//  202  454:aload           11
	//  203  456:getfield        #95  <Field int DiffUtil$Snake.size>
	//  204  459:iadd            
	//  205  460:putfield        #80  <Field int DiffUtil$Range.oldListStart>
					range1.newListStart = snake.y + snake.size;
	//  206  463:aload           10
	//  207  465:aload           11
	//  208  467:getfield        #101 <Field int DiffUtil$Snake.y>
	//  209  470:aload           11
	//  210  472:getfield        #95  <Field int DiffUtil$Snake.size>
	//  211  475:iadd            
	//  212  476:putfield        #86  <Field int DiffUtil$Range.newListStart>
				}
				((List) (arraylist1)).add(((Object) (range1)));
	//  213  479:aload           6
	//  214  481:aload           10
	//  215  483:invokeinterface #59  <Method boolean List.add(Object)>
	//  216  488:pop             
			} else
	//* 217  489:goto            502
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
		if(i3 % 2 != 0)
	//*  62   93:iload           13
	//*  63   95:iconst_2        
	//*  64   96:irem            
	//*  65   97:ifeq            106
			l = 1;
	//   66  100:iconst_1        
	//   67  101:istore          4
		else
	//*  68  103:goto            109
			l = 0;
	//   69  106:iconst_0        
	//   70  107:istore          4
		for(int j1 = 0; j1 <= j3; j1++)
	//*  71  109:iconst_0        
	//*  72  110:istore          8
	//*  73  112:iload           8
	//*  74  114:iload           14
	//*  75  116:icmpgt          658
		{
			for(int k1 = -j1; k1 <= j1; k1 += 2)
	//*  76  119:iload           8
	//*  77  121:ineg            
	//*  78  122:istore          9
	//*  79  124:iload           9
	//*  80  126:iload           8
	//*  81  128:icmpgt          379
			{
				boolean flag;
				if(k1 == -j1 || k1 != j1 && ai[(i1 + k1) - 1] < ai[i1 + k1 + 1])
	//*  82  131:iload           9
	//*  83  133:iload           8
	//*  84  135:ineg            
	//*  85  136:icmpeq          169
	//*  86  139:iload           9
	//*  87  141:iload           8
	//*  88  143:icmpeq          186
	//*  89  146:aload           5
	//*  90  148:iload           7
	//*  91  150:iload           9
	//*  92  152:iadd            
	//*  93  153:iconst_1        
	//*  94  154:isub            
	//*  95  155:iaload          
	//*  96  156:aload           5
	//*  97  158:iload           7
	//*  98  160:iload           9
	//*  99  162:iadd            
	//* 100  163:iconst_1        
	//* 101  164:iadd            
	//* 102  165:iaload          
	//* 103  166:icmpge          186
				{
					j = ai[i1 + k1 + 1];
	//  104  169:aload           5
	//  105  171:iload           7
	//  106  173:iload           9
	//  107  175:iadd            
	//  108  176:iconst_1        
	//  109  177:iadd            
	//  110  178:iaload          
	//  111  179:istore_2        
					flag = false;
	//  112  180:iconst_0        
	//  113  181:istore          16
				} else
	//* 114  183:goto            202
				{
					j = ai[(i1 + k1) - 1] + 1;
	//  115  186:aload           5
	//  116  188:iload           7
	//  117  190:iload           9
	//  118  192:iadd            
	//  119  193:iconst_1        
	//  120  194:isub            
	//  121  195:iaload          
	//  122  196:iconst_1        
	//  123  197:iadd            
	//  124  198:istore_2        
					flag = true;
	//  125  199:iconst_1        
	//  126  200:istore          16
				}
				for(int i2 = j - k1; j < k2 && i2 < l2 && callback.areItemsTheSame(i + j, k + i2); i2++)
	//* 127  202:iload_2         
	//* 128  203:iload           9
	//* 129  205:isub            
	//* 130  206:istore          10
	//* 131  208:iload_2         
	//* 132  209:iload           11
	//* 133  211:icmpge          248
	//* 134  214:iload           10
	//* 135  216:iload           12
	//* 136  218:icmpge          248
	//* 137  221:aload_0         
	//* 138  222:iload_1         
	//* 139  223:iload_2         
	//* 140  224:iadd            
	//* 141  225:iload_3         
	//* 142  226:iload           10
	//* 143  228:iadd            
	//* 144  229:invokevirtual   #128 <Method boolean DiffUtil$Callback.areItemsTheSame(int, int)>
	//* 145  232:ifeq            248
					j++;
	//  146  235:iload_2         
	//  147  236:iconst_1        
	//  148  237:iadd            
	//  149  238:istore_2        

	//  150  239:iload           10
	//  151  241:iconst_1        
	//  152  242:iadd            
	//  153  243:istore          10
	//* 154  245:goto            208
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
	//* 230  376:goto            124
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
	//* 251  416:icmpeq          459
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
	//* 266  439:icmpge          459
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
	//* 277  456:goto            475
				{
					j = ai1[i1 + k3 + 1] - 1;
	//  278  459:aload           6
	//  279  461:iload           7
	//  280  463:iload           15
	//  281  465:iadd            
	//  282  466:iconst_1        
	//  283  467:iadd            
	//  284  468:iaload          
	//  285  469:iconst_1        
	//  286  470:isub            
	//  287  471:istore_2        
					flag1 = true;
	//  288  472:iconst_1        
	//  289  473:istore          16
				}
				for(int j2 = j - k3; j > 0 && j2 > 0 && callback.areItemsTheSame((i + j) - 1, (k + j2) - 1); j2--)
	//* 290  475:iload_2         
	//* 291  476:iload           15
	//* 292  478:isub            
	//* 293  479:istore          10
	//* 294  481:iload_2         
	//* 295  482:ifle            521
	//* 296  485:iload           10
	//* 297  487:ifle            521
	//* 298  490:aload_0         
	//* 299  491:iload_1         
	//* 300  492:iload_2         
	//* 301  493:iadd            
	//* 302  494:iconst_1        
	//* 303  495:isub            
	//* 304  496:iload_3         
	//* 305  497:iload           10
	//* 306  499:iadd            
	//* 307  500:iconst_1        
	//* 308  501:isub            
	//* 309  502:invokevirtual   #128 <Method boolean DiffUtil$Callback.areItemsTheSame(int, int)>
	//* 310  505:ifeq            521
					j--;
	//  311  508:iload_2         
	//  312  509:iconst_1        
	//  313  510:isub            
	//  314  511:istore_2        

	//  315  512:iload           10
	//  316  514:iconst_1        
	//  317  515:isub            
	//  318  516:istore          10
	//* 319  518:goto            481
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
	//* 397  655:goto            112
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
			int i = snake.x - snake1.x;
		//    0    0:aload_1         
		//    1    1:getfield        #22  <Field int DiffUtil$Snake.x>
		//    2    4:aload_2         
		//    3    5:getfield        #22  <Field int DiffUtil$Snake.x>
		//    4    8:isub            
		//    5    9:istore_3        
			if(i == 0)
		//*   6   10:iload_3         
		//*   7   11:ifne            24
				return snake.y - snake1.y;
		//    8   14:aload_1         
		//    9   15:getfield        #25  <Field int DiffUtil$Snake.y>
		//   10   18:aload_2         
		//   11   19:getfield        #25  <Field int DiffUtil$Snake.y>
		//   12   22:isub            
		//   13   23:ireturn         
			else
				return i;
		//   14   24:iload_3         
		//   15   25:ireturn         
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
