// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;

import java.util.*;

// Referenced classes of package android.support.v7.util:
//			ListUpdateCallback, BatchingListUpdateCallback, AdapterListUpdateCallback

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
							list.add(((Object) (new PostponedUpdate(l, i, false))));
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
					PostponedUpdate postponedupdate = (PostponedUpdate)iterator.next();
		//  114  231:aload           9
		//  115  233:invokeinterface #187 <Method Object Iterator.next()>
		//  116  238:checkcast       #121 <Class DiffUtil$PostponedUpdate>
		//  117  241:astore          10
					postponedupdate.currentPos = postponedupdate.currentPos + 1;
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
							list.add(((Object) (new PostponedUpdate(l, i + j, true))));
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
					PostponedUpdate postponedupdate = removePostponedUpdate(list, j1, false);
		//   85  163:aload_1         
		//   86  164:iload           8
		//   87  166:iconst_0        
		//   88  167:invokestatic    #160 <Method DiffUtil$PostponedUpdate removePostponedUpdate(List, int, boolean)>
		//   89  170:astore          9
					listupdatecallback.onMoved(i + j, postponedupdate.currentPos - 1);
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
						listupdatecallback.onChanged(postponedupdate.currentPos - 1, 1, mCallback.getChangePayload(l, j1));
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
					PostponedUpdate postponedupdate1 = (PostponedUpdate)iterator.next();
		//  127  252:aload           9
		//  128  254:invokeinterface #187 <Method Object Iterator.next()>
		//  129  259:checkcast       #121 <Class DiffUtil$PostponedUpdate>
		//  130  262:astore          10
					postponedupdate1.currentPos = postponedupdate1.currentPos - 1;
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
				Object obj = ((Object) ((Snake)mSnakes.get(k)));
		//   23   38:aload_0         
		//   24   39:getfield        #43  <Field List mSnakes>
		//   25   42:iload_3         
		//   26   43:invokeinterface #89  <Method Object List.get(int)>
		//   27   48:checkcast       #91  <Class DiffUtil$Snake>
		//   28   51:astore          12
				int k1 = ((Snake) (obj)).x;
		//   29   53:aload           12
		//   30   55:getfield        #94  <Field int DiffUtil$Snake.x>
		//   31   58:istore          8
				int l1 = ((Snake) (obj)).size;
		//   32   60:aload           12
		//   33   62:getfield        #104 <Field int DiffUtil$Snake.size>
		//   34   65:istore          9
				int i2 = ((Snake) (obj)).y;
		//   35   67:aload           12
		//   36   69:getfield        #97  <Field int DiffUtil$Snake.y>
		//   37   72:istore          10
				int j2 = ((Snake) (obj)).size;
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
				j = ((Snake) (obj)).x;
		//  149  257:aload           12
		//  150  259:getfield        #94  <Field int DiffUtil$Snake.x>
		//  151  262:istore_2        
				l = ((Snake) (obj)).y;
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
		//*   6   10:iflt            117
			{
				PostponedUpdate postponedupdate = (PostponedUpdate)list.get(j);
		//    7   13:aload_0         
		//    8   14:iload_3         
		//    9   15:invokeinterface #89  <Method Object List.get(int)>
		//   10   20:checkcast       #121 <Class DiffUtil$PostponedUpdate>
		//   11   23:astore          5
				if(postponedupdate.posInOwnerList == i && postponedupdate.removal == flag)
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
						PostponedUpdate postponedupdate1 = (PostponedUpdate)list.get(j);
		//   28   61:aload_0         
		//   29   62:iload_3         
		//   30   63:invokeinterface #89  <Method Object List.get(int)>
		//   31   68:checkcast       #121 <Class DiffUtil$PostponedUpdate>
		//   32   71:astore          6
						int k = postponedupdate1.currentPos;
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
						postponedupdate1.currentPos = k + i;
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
					return postponedupdate;
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
				Snake snake = (Snake)mSnakes.get(i);
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

		public void dispatchUpdatesTo(android.support.v7.widget.RecyclerView.Adapter adapter)
		{
			dispatchUpdatesTo(((ListUpdateCallback) (new AdapterListUpdateCallback(adapter))));
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

	public static abstract class ItemCallback
	{

		public abstract boolean areContentsTheSame(Object obj, Object obj1);

		public abstract boolean areItemsTheSame(Object obj, Object obj1);

		public Object getChangePayload(Object obj, Object obj1)
		{
			return ((Object) (null));
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public ItemCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Object()>
		//    2    4:return          
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
	//    1    1:invokespecial   #36  <Method void Object()>
	//    2    4:return          
	}

	public static DiffResult calculateDiff(Callback callback)
	{
		return calculateDiff(callback, true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #42  <Method DiffUtil$DiffResult calculateDiff(DiffUtil$Callback, boolean)>
	//    3    5:areturn         
	}

	public static DiffResult calculateDiff(Callback callback, boolean flag)
	{
		int i = callback.getOldListSize();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #48  <Method int DiffUtil$Callback.getOldListSize()>
	//    2    4:istore_2        
		int j = callback.getNewListSize();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #51  <Method int DiffUtil$Callback.getNewListSize()>
	//    5    9:istore_3        
		ArrayList arraylist = new ArrayList();
	//    6   10:new             #53  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #54  <Method void ArrayList()>
	//    9   17:astore          5
		ArrayList arraylist1 = new ArrayList();
	//   10   19:new             #53  <Class ArrayList>
	//   11   22:dup             
	//   12   23:invokespecial   #54  <Method void ArrayList()>
	//   13   26:astore          6
		((List) (arraylist1)).add(((Object) (new Range(0, i, 0, j))));
	//   14   28:aload           6
	//   15   30:new             #20  <Class DiffUtil$Range>
	//   16   33:dup             
	//   17   34:iconst_0        
	//   18   35:iload_2         
	//   19   36:iconst_0        
	//   20   37:iload_3         
	//   21   38:invokespecial   #57  <Method void DiffUtil$Range(int, int, int, int)>
	//   22   41:invokeinterface #63  <Method boolean List.add(Object)>
	//   23   46:pop             
		i = Math.abs(i - j) + (i + j);
	//   24   47:iload_2         
	//   25   48:iload_3         
	//   26   49:isub            
	//   27   50:invokestatic    #69  <Method int Math.abs(int)>
	//   28   53:iload_2         
	//   29   54:iload_3         
	//   30   55:iadd            
	//   31   56:iadd            
	//   32   57:istore_2        
		j = i * 2;
	//   33   58:iload_2         
	//   34   59:iconst_2        
	//   35   60:imul            
	//   36   61:istore_3        
		int ai[] = new int[j];
	//   37   62:iload_3         
	//   38   63:newarray        int[]
	//   39   65:astore          7
		int ai1[] = new int[j];
	//   40   67:iload_3         
	//   41   68:newarray        int[]
	//   42   70:astore          8
		ArrayList arraylist2 = new ArrayList();
	//   43   72:new             #53  <Class ArrayList>
	//   44   75:dup             
	//   45   76:invokespecial   #54  <Method void ArrayList()>
	//   46   79:astore          9
		while(!((List) (arraylist1)).isEmpty()) 
	//*  47   81:aload           6
	//*  48   83:invokeinterface #73  <Method boolean List.isEmpty()>
	//*  49   88:ifne            505
		{
			Range range1 = (Range)((List) (arraylist1)).remove(((List) (arraylist1)).size() - 1);
	//   50   91:aload           6
	//   51   93:aload           6
	//   52   95:invokeinterface #76  <Method int List.size()>
	//   53  100:iconst_1        
	//   54  101:isub            
	//   55  102:invokeinterface #80  <Method Object List.remove(int)>
	//   56  107:checkcast       #20  <Class DiffUtil$Range>
	//   57  110:astore          10
			Snake snake = diffPartial(callback, range1.oldListStart, range1.oldListEnd, range1.newListStart, range1.newListEnd, ai, ai1, i);
	//   58  112:aload_0         
	//   59  113:aload           10
	//   60  115:getfield        #84  <Field int DiffUtil$Range.oldListStart>
	//   61  118:aload           10
	//   62  120:getfield        #87  <Field int DiffUtil$Range.oldListEnd>
	//   63  123:aload           10
	//   64  125:getfield        #90  <Field int DiffUtil$Range.newListStart>
	//   65  128:aload           10
	//   66  130:getfield        #93  <Field int DiffUtil$Range.newListEnd>
	//   67  133:aload           7
	//   68  135:aload           8
	//   69  137:iload_2         
	//   70  138:invokestatic    #97  <Method DiffUtil$Snake diffPartial(DiffUtil$Callback, int, int, int, int, int[], int[], int)>
	//   71  141:astore          11
			if(snake != null)
	//*  72  143:aload           11
	//*  73  145:ifnull          492
			{
				if(snake.size > 0)
	//*  74  148:aload           11
	//*  75  150:getfield        #99  <Field int DiffUtil$Snake.size>
	//*  76  153:ifle            166
					((List) (arraylist)).add(((Object) (snake)));
	//   77  156:aload           5
	//   78  158:aload           11
	//   79  160:invokeinterface #63  <Method boolean List.add(Object)>
	//   80  165:pop             
				snake.x = snake.x + range1.oldListStart;
	//   81  166:aload           11
	//   82  168:aload           11
	//   83  170:getfield        #102 <Field int DiffUtil$Snake.x>
	//   84  173:aload           10
	//   85  175:getfield        #84  <Field int DiffUtil$Range.oldListStart>
	//   86  178:iadd            
	//   87  179:putfield        #102 <Field int DiffUtil$Snake.x>
				snake.y = snake.y + range1.newListStart;
	//   88  182:aload           11
	//   89  184:aload           11
	//   90  186:getfield        #105 <Field int DiffUtil$Snake.y>
	//   91  189:aload           10
	//   92  191:getfield        #90  <Field int DiffUtil$Range.newListStart>
	//   93  194:iadd            
	//   94  195:putfield        #105 <Field int DiffUtil$Snake.y>
				Range range;
				if(((List) (arraylist2)).isEmpty())
	//*  95  198:aload           9
	//*  96  200:invokeinterface #73  <Method boolean List.isEmpty()>
	//*  97  205:ifeq            220
					range = new Range();
	//   98  208:new             #20  <Class DiffUtil$Range>
	//   99  211:dup             
	//  100  212:invokespecial   #106 <Method void DiffUtil$Range()>
	//  101  215:astore          4
				else
	//* 102  217:goto            241
					range = (Range)((List) (arraylist2)).remove(((List) (arraylist2)).size() - 1);
	//  103  220:aload           9
	//  104  222:aload           9
	//  105  224:invokeinterface #76  <Method int List.size()>
	//  106  229:iconst_1        
	//  107  230:isub            
	//  108  231:invokeinterface #80  <Method Object List.remove(int)>
	//  109  236:checkcast       #20  <Class DiffUtil$Range>
	//  110  239:astore          4
				range.oldListStart = range1.oldListStart;
	//  111  241:aload           4
	//  112  243:aload           10
	//  113  245:getfield        #84  <Field int DiffUtil$Range.oldListStart>
	//  114  248:putfield        #84  <Field int DiffUtil$Range.oldListStart>
				range.newListStart = range1.newListStart;
	//  115  251:aload           4
	//  116  253:aload           10
	//  117  255:getfield        #90  <Field int DiffUtil$Range.newListStart>
	//  118  258:putfield        #90  <Field int DiffUtil$Range.newListStart>
				if(snake.reverse)
	//* 119  261:aload           11
	//* 120  263:getfield        #110 <Field boolean DiffUtil$Snake.reverse>
	//* 121  266:ifeq            292
				{
					range.oldListEnd = snake.x;
	//  122  269:aload           4
	//  123  271:aload           11
	//  124  273:getfield        #102 <Field int DiffUtil$Snake.x>
	//  125  276:putfield        #87  <Field int DiffUtil$Range.oldListEnd>
					range.newListEnd = snake.y;
	//  126  279:aload           4
	//  127  281:aload           11
	//  128  283:getfield        #105 <Field int DiffUtil$Snake.y>
	//  129  286:putfield        #93  <Field int DiffUtil$Range.newListEnd>
				} else
	//* 130  289:goto            347
				if(snake.removal)
	//* 131  292:aload           11
	//* 132  294:getfield        #113 <Field boolean DiffUtil$Snake.removal>
	//* 133  297:ifeq            325
				{
					range.oldListEnd = snake.x - 1;
	//  134  300:aload           4
	//  135  302:aload           11
	//  136  304:getfield        #102 <Field int DiffUtil$Snake.x>
	//  137  307:iconst_1        
	//  138  308:isub            
	//  139  309:putfield        #87  <Field int DiffUtil$Range.oldListEnd>
					range.newListEnd = snake.y;
	//  140  312:aload           4
	//  141  314:aload           11
	//  142  316:getfield        #105 <Field int DiffUtil$Snake.y>
	//  143  319:putfield        #93  <Field int DiffUtil$Range.newListEnd>
				} else
	//* 144  322:goto            347
				{
					range.oldListEnd = snake.x;
	//  145  325:aload           4
	//  146  327:aload           11
	//  147  329:getfield        #102 <Field int DiffUtil$Snake.x>
	//  148  332:putfield        #87  <Field int DiffUtil$Range.oldListEnd>
					range.newListEnd = snake.y - 1;
	//  149  335:aload           4
	//  150  337:aload           11
	//  151  339:getfield        #105 <Field int DiffUtil$Snake.y>
	//  152  342:iconst_1        
	//  153  343:isub            
	//  154  344:putfield        #93  <Field int DiffUtil$Range.newListEnd>
				}
				((List) (arraylist1)).add(((Object) (range)));
	//  155  347:aload           6
	//  156  349:aload           4
	//  157  351:invokeinterface #63  <Method boolean List.add(Object)>
	//  158  356:pop             
				if(snake.reverse)
	//* 159  357:aload           11
	//* 160  359:getfield        #110 <Field boolean DiffUtil$Snake.reverse>
	//* 161  362:ifeq            447
				{
					if(snake.removal)
	//* 162  365:aload           11
	//* 163  367:getfield        #113 <Field boolean DiffUtil$Snake.removal>
	//* 164  370:ifeq            410
					{
						range1.oldListStart = snake.x + snake.size + 1;
	//  165  373:aload           10
	//  166  375:aload           11
	//  167  377:getfield        #102 <Field int DiffUtil$Snake.x>
	//  168  380:aload           11
	//  169  382:getfield        #99  <Field int DiffUtil$Snake.size>
	//  170  385:iadd            
	//  171  386:iconst_1        
	//  172  387:iadd            
	//  173  388:putfield        #84  <Field int DiffUtil$Range.oldListStart>
						range1.newListStart = snake.y + snake.size;
	//  174  391:aload           10
	//  175  393:aload           11
	//  176  395:getfield        #105 <Field int DiffUtil$Snake.y>
	//  177  398:aload           11
	//  178  400:getfield        #99  <Field int DiffUtil$Snake.size>
	//  179  403:iadd            
	//  180  404:putfield        #90  <Field int DiffUtil$Range.newListStart>
					} else
	//* 181  407:goto            479
					{
						range1.oldListStart = snake.x + snake.size;
	//  182  410:aload           10
	//  183  412:aload           11
	//  184  414:getfield        #102 <Field int DiffUtil$Snake.x>
	//  185  417:aload           11
	//  186  419:getfield        #99  <Field int DiffUtil$Snake.size>
	//  187  422:iadd            
	//  188  423:putfield        #84  <Field int DiffUtil$Range.oldListStart>
						range1.newListStart = snake.y + snake.size + 1;
	//  189  426:aload           10
	//  190  428:aload           11
	//  191  430:getfield        #105 <Field int DiffUtil$Snake.y>
	//  192  433:aload           11
	//  193  435:getfield        #99  <Field int DiffUtil$Snake.size>
	//  194  438:iadd            
	//  195  439:iconst_1        
	//  196  440:iadd            
	//  197  441:putfield        #90  <Field int DiffUtil$Range.newListStart>
					}
				} else
	//* 198  444:goto            479
				{
					range1.oldListStart = snake.x + snake.size;
	//  199  447:aload           10
	//  200  449:aload           11
	//  201  451:getfield        #102 <Field int DiffUtil$Snake.x>
	//  202  454:aload           11
	//  203  456:getfield        #99  <Field int DiffUtil$Snake.size>
	//  204  459:iadd            
	//  205  460:putfield        #84  <Field int DiffUtil$Range.oldListStart>
					range1.newListStart = snake.y + snake.size;
	//  206  463:aload           10
	//  207  465:aload           11
	//  208  467:getfield        #105 <Field int DiffUtil$Snake.y>
	//  209  470:aload           11
	//  210  472:getfield        #99  <Field int DiffUtil$Snake.size>
	//  211  475:iadd            
	//  212  476:putfield        #90  <Field int DiffUtil$Range.newListStart>
				}
				((List) (arraylist1)).add(((Object) (range1)));
	//  213  479:aload           6
	//  214  481:aload           10
	//  215  483:invokeinterface #63  <Method boolean List.add(Object)>
	//  216  488:pop             
			} else
	//* 217  489:goto            81
			{
				((List) (arraylist2)).add(((Object) (range1)));
	//  218  492:aload           9
	//  219  494:aload           10
	//  220  496:invokeinterface #63  <Method boolean List.add(Object)>
	//  221  501:pop             
			}
		}
	//* 222  502:goto            81
		Collections.sort(((List) (arraylist)), SNAKE_COMPARATOR);
	//  223  505:aload           5
	//  224  507:getstatic       #34  <Field Comparator SNAKE_COMPARATOR>
	//  225  510:invokestatic    #119 <Method void Collections.sort(List, Comparator)>
		return new DiffResult(callback, ((List) (arraylist)), ai, ai1, flag);
	//  226  513:new             #11  <Class DiffUtil$DiffResult>
	//  227  516:dup             
	//  228  517:aload_0         
	//  229  518:aload           5
	//  230  520:aload           7
	//  231  522:aload           8
	//  232  524:iload_1         
	//  233  525:invokespecial   #122 <Method void DiffUtil$DiffResult(DiffUtil$Callback, List, int[], int[], boolean)>
	//  234  528:areturn         
	}

	private static Snake diffPartial(Callback callback, int i, int j, int k, int l, int ai[], int ai1[], int i1)
	{
label0:
		{
			j -= i;
	//    0    0:iload_2         
	//    1    1:iload_1         
	//    2    2:isub            
	//    3    3:istore_2        
			int k3 = l - k;
	//    4    4:iload           4
	//    5    6:iload_3         
	//    6    7:isub            
	//    7    8:istore          13
			if(j < 1 || k3 < 1)
	//*   8   10:iload_2         
	//*   9   11:iconst_1        
	//*  10   12:icmplt          663
	//*  11   15:iload           13
	//*  12   17:iconst_1        
	//*  13   18:icmpge          24
				break label0;
	//   14   21:goto            663
			int l3 = j - k3;
	//   15   24:iload_2         
	//   16   25:iload           13
	//   17   27:isub            
	//   18   28:istore          14
			int i4 = (j + k3 + 1) / 2;
	//   19   30:iload_2         
	//   20   31:iload           13
	//   21   33:iadd            
	//   22   34:iconst_1        
	//   23   35:iadd            
	//   24   36:iconst_2        
	//   25   37:idiv            
	//   26   38:istore          15
			l = i1 - i4 - 1;
	//   27   40:iload           7
	//   28   42:iload           15
	//   29   44:isub            
	//   30   45:iconst_1        
	//   31   46:isub            
	//   32   47:istore          4
			int j1 = i1 + i4 + 1;
	//   33   49:iload           7
	//   34   51:iload           15
	//   35   53:iadd            
	//   36   54:iconst_1        
	//   37   55:iadd            
	//   38   56:istore          8
			Arrays.fill(ai, l, j1, 0);
	//   39   58:aload           5
	//   40   60:iload           4
	//   41   62:iload           8
	//   42   64:iconst_0        
	//   43   65:invokestatic    #128 <Method void Arrays.fill(int[], int, int, int)>
			Arrays.fill(ai1, l + l3, j1 + l3, j);
	//   44   68:aload           6
	//   45   70:iload           4
	//   46   72:iload           14
	//   47   74:iadd            
	//   48   75:iload           8
	//   49   77:iload           14
	//   50   79:iadd            
	//   51   80:iload_2         
	//   52   81:invokestatic    #128 <Method void Arrays.fill(int[], int, int, int)>
			boolean flag;
			if(l3 % 2 != 0)
	//*  53   84:iload           14
	//*  54   86:iconst_2        
	//*  55   87:irem            
	//*  56   88:ifeq            97
				flag = true;
	//   57   91:iconst_1        
	//   58   92:istore          8
			else
	//*  59   94:goto            100
				flag = false;
	//   60   97:iconst_0        
	//   61   98:istore          8
			int k1 = 0;
	//   62  100:iconst_0        
	//   63  101:istore          9
			do
			{
				boolean flag1 = false;
	//   64  103:iconst_0        
	//   65  104:istore          17
				if(k1 > i4)
					break;
	//   66  106:iload           9
	//   67  108:iload           15
	//   68  110:icmpgt          653
				int l1 = -k1;
	//   69  113:iload           9
	//   70  115:ineg            
	//   71  116:istore          10
				for(int i2 = l1; i2 <= k1;)
	//*  72  118:iload           10
	//*  73  120:istore          11
	//*  74  122:iload           11
	//*  75  124:iload           9
	//*  76  126:icmpgt          379
				{
label1:
					{
label2:
						{
							if(i2 == l1)
								break label2;
	//   77  129:iload           11
	//   78  131:iload           10
	//   79  133:icmpeq          190
							if(i2 != k1)
	//*  80  136:iload           11
	//*  81  138:iload           9
	//*  82  140:icmpeq          170
							{
								l = i1 + i2;
	//   83  143:iload           7
	//   84  145:iload           11
	//   85  147:iadd            
	//   86  148:istore          4
								if(ai[l - 1] < ai[l + 1])
	//*  87  150:aload           5
	//*  88  152:iload           4
	//*  89  154:iconst_1        
	//*  90  155:isub            
	//*  91  156:iaload          
	//*  92  157:aload           5
	//*  93  159:iload           4
	//*  94  161:iconst_1        
	//*  95  162:iadd            
	//*  96  163:iaload          
	//*  97  164:icmpge          170
									break label2;
	//   98  167:goto            190
							}
							l = ai[(i1 + i2) - 1] + 1;
	//   99  170:aload           5
	//  100  172:iload           7
	//  101  174:iload           11
	//  102  176:iadd            
	//  103  177:iconst_1        
	//  104  178:isub            
	//  105  179:iaload          
	//  106  180:iconst_1        
	//  107  181:iadd            
	//  108  182:istore          4
							flag1 = true;
	//  109  184:iconst_1        
	//  110  185:istore          17
							break label1;
	//  111  187:goto            202
						}
						l = ai[i1 + i2 + 1];
	//  112  190:aload           5
	//  113  192:iload           7
	//  114  194:iload           11
	//  115  196:iadd            
	//  116  197:iconst_1        
	//  117  198:iadd            
	//  118  199:iaload          
	//  119  200:istore          4
					}
					for(int k2 = l - i2; l < j && k2 < k3 && callback.areItemsTheSame(i + l, k + k2); k2++)
	//* 120  202:iload           4
	//* 121  204:iload           11
	//* 122  206:isub            
	//* 123  207:istore          12
	//* 124  209:iload           4
	//* 125  211:iload_2         
	//* 126  212:icmpge          252
	//* 127  215:iload           12
	//* 128  217:iload           13
	//* 129  219:icmpge          252
	//* 130  222:aload_0         
	//* 131  223:iload_1         
	//* 132  224:iload           4
	//* 133  226:iadd            
	//* 134  227:iload_3         
	//* 135  228:iload           12
	//* 136  230:iadd            
	//* 137  231:invokevirtual   #132 <Method boolean DiffUtil$Callback.areItemsTheSame(int, int)>
	//* 138  234:ifeq            252
						l++;
	//  139  237:iload           4
	//  140  239:iconst_1        
	//  141  240:iadd            
	//  142  241:istore          4

	//  143  243:iload           12
	//  144  245:iconst_1        
	//  145  246:iadd            
	//  146  247:istore          12
	//* 147  249:goto            209
					int l2 = i1 + i2;
	//  148  252:iload           7
	//  149  254:iload           11
	//  150  256:iadd            
	//  151  257:istore          12
					ai[l2] = l;
	//  152  259:aload           5
	//  153  261:iload           12
	//  154  263:iload           4
	//  155  265:iastore         
					if(flag && i2 >= (l3 - k1) + 1 && i2 <= (l3 + k1) - 1 && ai[l2] >= ai1[l2])
	//* 156  266:iload           8
	//* 157  268:ifeq            367
	//* 158  271:iload           11
	//* 159  273:iload           14
	//* 160  275:iload           9
	//* 161  277:isub            
	//* 162  278:iconst_1        
	//* 163  279:iadd            
	//* 164  280:icmplt          367
	//* 165  283:iload           11
	//* 166  285:iload           14
	//* 167  287:iload           9
	//* 168  289:iadd            
	//* 169  290:iconst_1        
	//* 170  291:isub            
	//* 171  292:icmpgt          367
	//* 172  295:aload           5
	//* 173  297:iload           12
	//* 174  299:iaload          
	//* 175  300:aload           6
	//* 176  302:iload           12
	//* 177  304:iaload          
	//* 178  305:icmplt          364
					{
						callback = ((Callback) (new Snake()));
	//  179  308:new             #23  <Class DiffUtil$Snake>
	//  180  311:dup             
	//  181  312:invokespecial   #133 <Method void DiffUtil$Snake()>
	//  182  315:astore_0        
						callback.x = ai1[l2];
	//  183  316:aload_0         
	//  184  317:aload           6
	//  185  319:iload           12
	//  186  321:iaload          
	//  187  322:putfield        #102 <Field int DiffUtil$Snake.x>
						callback.y = ((Snake) (callback)).x - i2;
	//  188  325:aload_0         
	//  189  326:aload_0         
	//  190  327:getfield        #102 <Field int DiffUtil$Snake.x>
	//  191  330:iload           11
	//  192  332:isub            
	//  193  333:putfield        #105 <Field int DiffUtil$Snake.y>
						callback.size = ai[l2] - ai1[l2];
	//  194  336:aload_0         
	//  195  337:aload           5
	//  196  339:iload           12
	//  197  341:iaload          
	//  198  342:aload           6
	//  199  344:iload           12
	//  200  346:iaload          
	//  201  347:isub            
	//  202  348:putfield        #99  <Field int DiffUtil$Snake.size>
						callback.removal = flag1;
	//  203  351:aload_0         
	//  204  352:iload           17
	//  205  354:putfield        #113 <Field boolean DiffUtil$Snake.removal>
						callback.reverse = false;
	//  206  357:aload_0         
	//  207  358:iconst_0        
	//  208  359:putfield        #110 <Field boolean DiffUtil$Snake.reverse>
						return ((Snake) (callback));
	//  209  362:aload_0         
	//  210  363:areturn         
					}
	//* 211  364:goto            367
					i2 += 2;
	//  212  367:iload           11
	//  213  369:iconst_2        
	//  214  370:iadd            
	//  215  371:istore          11
					flag1 = false;
	//  216  373:iconst_0        
	//  217  374:istore          17
				}

	//* 218  376:goto            122
				for(int j2 = l1; j2 <= k1;)
	//* 219  379:iload           10
	//* 220  381:istore          11
	//* 221  383:iload           11
	//* 222  385:iload           9
	//* 223  387:icmpgt          644
				{
					int j4;
label3:
					{
label4:
						{
							j4 = j2 + l3;
	//  224  390:iload           11
	//  225  392:iload           14
	//  226  394:iadd            
	//  227  395:istore          16
							if(j4 == k1 + l3)
								break label4;
	//  228  397:iload           16
	//  229  399:iload           9
	//  230  401:iload           14
	//  231  403:iadd            
	//  232  404:icmpeq          464
							if(j4 != l1 + l3)
	//* 233  407:iload           16
	//* 234  409:iload           10
	//* 235  411:iload           14
	//* 236  413:iadd            
	//* 237  414:icmpeq          444
							{
								l = i1 + j4;
	//  238  417:iload           7
	//  239  419:iload           16
	//  240  421:iadd            
	//  241  422:istore          4
								if(ai1[l - 1] < ai1[l + 1])
	//* 242  424:aload           6
	//* 243  426:iload           4
	//* 244  428:iconst_1        
	//* 245  429:isub            
	//* 246  430:iaload          
	//* 247  431:aload           6
	//* 248  433:iload           4
	//* 249  435:iconst_1        
	//* 250  436:iadd            
	//* 251  437:iaload          
	//* 252  438:icmpge          444
									break label4;
	//  253  441:goto            464
							}
							l = ai1[i1 + j4 + 1] - 1;
	//  254  444:aload           6
	//  255  446:iload           7
	//  256  448:iload           16
	//  257  450:iadd            
	//  258  451:iconst_1        
	//  259  452:iadd            
	//  260  453:iaload          
	//  261  454:iconst_1        
	//  262  455:isub            
	//  263  456:istore          4
							flag1 = true;
	//  264  458:iconst_1        
	//  265  459:istore          17
							break label3;
	//  266  461:goto            476
						}
						l = ai1[(i1 + j4) - 1];
	//  267  464:aload           6
	//  268  466:iload           7
	//  269  468:iload           16
	//  270  470:iadd            
	//  271  471:iconst_1        
	//  272  472:isub            
	//  273  473:iaload          
	//  274  474:istore          4
					}
					for(int i3 = l - j4; l > 0 && i3 > 0 && callback.areItemsTheSame((i + l) - 1, (k + i3) - 1); i3--)
	//* 275  476:iload           4
	//* 276  478:iload           16
	//* 277  480:isub            
	//* 278  481:istore          12
	//* 279  483:iload           4
	//* 280  485:ifle            527
	//* 281  488:iload           12
	//* 282  490:ifle            527
	//* 283  493:aload_0         
	//* 284  494:iload_1         
	//* 285  495:iload           4
	//* 286  497:iadd            
	//* 287  498:iconst_1        
	//* 288  499:isub            
	//* 289  500:iload_3         
	//* 290  501:iload           12
	//* 291  503:iadd            
	//* 292  504:iconst_1        
	//* 293  505:isub            
	//* 294  506:invokevirtual   #132 <Method boolean DiffUtil$Callback.areItemsTheSame(int, int)>
	//* 295  509:ifeq            527
						l--;
	//  296  512:iload           4
	//  297  514:iconst_1        
	//  298  515:isub            
	//  299  516:istore          4

	//  300  518:iload           12
	//  301  520:iconst_1        
	//  302  521:isub            
	//  303  522:istore          12
	//* 304  524:goto            483
					int j3 = i1 + j4;
	//  305  527:iload           7
	//  306  529:iload           16
	//  307  531:iadd            
	//  308  532:istore          12
					ai1[j3] = l;
	//  309  534:aload           6
	//  310  536:iload           12
	//  311  538:iload           4
	//  312  540:iastore         
					if(!flag && j4 >= l1 && j4 <= k1 && ai[j3] >= ai1[j3])
	//* 313  541:iload           8
	//* 314  543:ifne            632
	//* 315  546:iload           16
	//* 316  548:iload           10
	//* 317  550:icmplt          632
	//* 318  553:iload           16
	//* 319  555:iload           9
	//* 320  557:icmpgt          632
	//* 321  560:aload           5
	//* 322  562:iload           12
	//* 323  564:iaload          
	//* 324  565:aload           6
	//* 325  567:iload           12
	//* 326  569:iaload          
	//* 327  570:icmplt          629
					{
						callback = ((Callback) (new Snake()));
	//  328  573:new             #23  <Class DiffUtil$Snake>
	//  329  576:dup             
	//  330  577:invokespecial   #133 <Method void DiffUtil$Snake()>
	//  331  580:astore_0        
						callback.x = ai1[j3];
	//  332  581:aload_0         
	//  333  582:aload           6
	//  334  584:iload           12
	//  335  586:iaload          
	//  336  587:putfield        #102 <Field int DiffUtil$Snake.x>
						callback.y = ((Snake) (callback)).x - j4;
	//  337  590:aload_0         
	//  338  591:aload_0         
	//  339  592:getfield        #102 <Field int DiffUtil$Snake.x>
	//  340  595:iload           16
	//  341  597:isub            
	//  342  598:putfield        #105 <Field int DiffUtil$Snake.y>
						callback.size = ai[j3] - ai1[j3];
	//  343  601:aload_0         
	//  344  602:aload           5
	//  345  604:iload           12
	//  346  606:iaload          
	//  347  607:aload           6
	//  348  609:iload           12
	//  349  611:iaload          
	//  350  612:isub            
	//  351  613:putfield        #99  <Field int DiffUtil$Snake.size>
						callback.removal = flag1;
	//  352  616:aload_0         
	//  353  617:iload           17
	//  354  619:putfield        #113 <Field boolean DiffUtil$Snake.removal>
						callback.reverse = true;
	//  355  622:aload_0         
	//  356  623:iconst_1        
	//  357  624:putfield        #110 <Field boolean DiffUtil$Snake.reverse>
						return ((Snake) (callback));
	//  358  627:aload_0         
	//  359  628:areturn         
					}
	//* 360  629:goto            632
					j2 += 2;
	//  361  632:iload           11
	//  362  634:iconst_2        
	//  363  635:iadd            
	//  364  636:istore          11
					flag1 = false;
	//  365  638:iconst_0        
	//  366  639:istore          17
				}

	//* 367  641:goto            383
				k1++;
	//  368  644:iload           9
	//  369  646:iconst_1        
	//  370  647:iadd            
	//  371  648:istore          9
			} while(true);
	//  372  650:goto            103
			throw new IllegalStateException("DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation.");
	//  373  653:new             #135 <Class IllegalStateException>
	//  374  656:dup             
	//  375  657:ldc1            #137 <String "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation.">
	//  376  659:invokespecial   #140 <Method void IllegalStateException(String)>
	//  377  662:athrow          
		}
		return null;
	//  378  663:aconst_null     
	//  379  664:areturn         
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
	//    2    4:invokespecial   #32  <Method void DiffUtil$1()>
	//    3    7:putstatic       #34  <Field Comparator SNAKE_COMPARATOR>
	//*   4   10:return          
	}
}
