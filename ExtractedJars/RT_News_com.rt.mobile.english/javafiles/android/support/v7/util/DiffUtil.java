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
		//*   1    1:getfield        #41  <Field List mSnakes>
		//*   2    4:invokeinterface #83  <Method boolean List.isEmpty()>
		//*   3    9:ifeq            17
				snake = null;
		//    4   12:aconst_null     
		//    5   13:astore_1        
			else
		//*   6   14:goto            31
				snake = (Snake)mSnakes.get(0);
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
				Snake snake1 = new Snake();
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
						list.add(((Object) (new PostponedUpdate(l, i, false))));
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
					PostponedUpdate postponedupdate = (PostponedUpdate)iterator.next();
		//  114  231:aload           9
		//  115  233:invokeinterface #185 <Method Object Iterator.next()>
		//  116  238:checkcast       #148 <Class DiffUtil$PostponedUpdate>
		//  117  241:astore          10
					postponedupdate.currentPos = postponedupdate.currentPos + 1;
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
						list.add(((Object) (new PostponedUpdate(l, i + j, true))));
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
					PostponedUpdate postponedupdate = removePostponedUpdate(list, j1, false);
		//   85  163:aload_1         
		//   86  164:iload           8
		//   87  166:iconst_0        
		//   88  167:invokestatic    #158 <Method DiffUtil$PostponedUpdate removePostponedUpdate(List, int, boolean)>
		//   89  170:astore          9
					listupdatecallback.onMoved(i + j, postponedupdate.currentPos - 1);
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
						listupdatecallback.onChanged(postponedupdate.currentPos - 1, 1, mCallback.getChangePayload(l, j1));
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
					PostponedUpdate postponedupdate1 = (PostponedUpdate)iterator.next();
		//  127  252:aload           9
		//  128  254:invokeinterface #185 <Method Object Iterator.next()>
		//  129  259:checkcast       #148 <Class DiffUtil$PostponedUpdate>
		//  130  262:astore          10
					postponedupdate1.currentPos = postponedupdate1.currentPos - 1;
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
				Object obj = ((Object) ((Snake)mSnakes.get(k)));
		//   23   38:aload_0         
		//   24   39:getfield        #41  <Field List mSnakes>
		//   25   42:iload_3         
		//   26   43:invokeinterface #87  <Method Object List.get(int)>
		//   27   48:checkcast       #89  <Class DiffUtil$Snake>
		//   28   51:astore          12
				int k1 = ((Snake) (obj)).x;
		//   29   53:aload           12
		//   30   55:getfield        #92  <Field int DiffUtil$Snake.x>
		//   31   58:istore          8
				int l1 = ((Snake) (obj)).size;
		//   32   60:aload           12
		//   33   62:getfield        #102 <Field int DiffUtil$Snake.size>
		//   34   65:istore          9
				int i2 = ((Snake) (obj)).y;
		//   35   67:aload           12
		//   36   69:getfield        #95  <Field int DiffUtil$Snake.y>
		//   37   72:istore          10
				int j2 = ((Snake) (obj)).size;
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
				j = ((Snake) (obj)).x;
		//  147  252:aload           12
		//  148  254:getfield        #92  <Field int DiffUtil$Snake.x>
		//  149  257:istore_2        
				l = ((Snake) (obj)).y;
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
				Snake snake = (Snake)mSnakes.get(k);
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

		private static PostponedUpdate removePostponedUpdate(List list, int i, boolean flag)
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
				PostponedUpdate postponedupdate = (PostponedUpdate)list.get(j);
		//    7   13:aload_0         
		//    8   14:iload_3         
		//    9   15:invokeinterface #87  <Method Object List.get(int)>
		//   10   20:checkcast       #148 <Class DiffUtil$PostponedUpdate>
		//   11   23:astore          5
				if(postponedupdate.posInOwnerList == i && postponedupdate.removal == flag)
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
						PostponedUpdate postponedupdate1 = (PostponedUpdate)list.get(j);
		//   28   61:aload_0         
		//   29   62:iload_3         
		//   30   63:invokeinterface #87  <Method Object List.get(int)>
		//   31   68:checkcast       #148 <Class DiffUtil$PostponedUpdate>
		//   32   71:astore          6
						int k = postponedupdate1.currentPos;
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
						postponedupdate1.currentPos = k + i;
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
				Snake snake = (Snake)mSnakes.get(i);
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

		public void dispatchUpdatesTo(android.support.v7.widget.RecyclerView.Adapter adapter)
		{
			dispatchUpdatesTo(((ListUpdateCallback) (new AdapterListUpdateCallback(adapter))));
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
	//    2    2:invokestatic    #41  <Method DiffUtil$DiffResult calculateDiff(DiffUtil$Callback, boolean)>
	//    3    5:areturn         
	}

	public static DiffResult calculateDiff(Callback callback, boolean flag)
	{
		int i = callback.getOldListSize();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method int DiffUtil$Callback.getOldListSize()>
	//    2    4:istore_2        
		int j = callback.getNewListSize();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #48  <Method int DiffUtil$Callback.getNewListSize()>
	//    5    9:istore_3        
		ArrayList arraylist = new ArrayList();
	//    6   10:new             #50  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #51  <Method void ArrayList()>
	//    9   17:astore          5
		ArrayList arraylist1 = new ArrayList();
	//   10   19:new             #50  <Class ArrayList>
	//   11   22:dup             
	//   12   23:invokespecial   #51  <Method void ArrayList()>
	//   13   26:astore          6
		((List) (arraylist1)).add(((Object) (new Range(0, i, 0, j))));
	//   14   28:aload           6
	//   15   30:new             #20  <Class DiffUtil$Range>
	//   16   33:dup             
	//   17   34:iconst_0        
	//   18   35:iload_2         
	//   19   36:iconst_0        
	//   20   37:iload_3         
	//   21   38:invokespecial   #54  <Method void DiffUtil$Range(int, int, int, int)>
	//   22   41:invokeinterface #60  <Method boolean List.add(Object)>
	//   23   46:pop             
		i = Math.abs(i - j) + (i + j);
	//   24   47:iload_2         
	//   25   48:iload_3         
	//   26   49:isub            
	//   27   50:invokestatic    #66  <Method int Math.abs(int)>
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
	//   43   72:new             #50  <Class ArrayList>
	//   44   75:dup             
	//   45   76:invokespecial   #51  <Method void ArrayList()>
	//   46   79:astore          9
		while(!((List) (arraylist1)).isEmpty()) 
	//*  47   81:aload           6
	//*  48   83:invokeinterface #70  <Method boolean List.isEmpty()>
	//*  49   88:ifne            505
		{
			Range range1 = (Range)((List) (arraylist1)).remove(((List) (arraylist1)).size() - 1);
	//   50   91:aload           6
	//   51   93:aload           6
	//   52   95:invokeinterface #73  <Method int List.size()>
	//   53  100:iconst_1        
	//   54  101:isub            
	//   55  102:invokeinterface #77  <Method Object List.remove(int)>
	//   56  107:checkcast       #20  <Class DiffUtil$Range>
	//   57  110:astore          10
			Snake snake = diffPartial(callback, range1.oldListStart, range1.oldListEnd, range1.newListStart, range1.newListEnd, ai, ai1, i);
	//   58  112:aload_0         
	//   59  113:aload           10
	//   60  115:getfield        #81  <Field int DiffUtil$Range.oldListStart>
	//   61  118:aload           10
	//   62  120:getfield        #84  <Field int DiffUtil$Range.oldListEnd>
	//   63  123:aload           10
	//   64  125:getfield        #87  <Field int DiffUtil$Range.newListStart>
	//   65  128:aload           10
	//   66  130:getfield        #90  <Field int DiffUtil$Range.newListEnd>
	//   67  133:aload           7
	//   68  135:aload           8
	//   69  137:iload_2         
	//   70  138:invokestatic    #94  <Method DiffUtil$Snake diffPartial(DiffUtil$Callback, int, int, int, int, int[], int[], int)>
	//   71  141:astore          11
			if(snake != null)
	//*  72  143:aload           11
	//*  73  145:ifnull          492
			{
				if(snake.size > 0)
	//*  74  148:aload           11
	//*  75  150:getfield        #96  <Field int DiffUtil$Snake.size>
	//*  76  153:ifle            166
					((List) (arraylist)).add(((Object) (snake)));
	//   77  156:aload           5
	//   78  158:aload           11
	//   79  160:invokeinterface #60  <Method boolean List.add(Object)>
	//   80  165:pop             
				snake.x = snake.x + range1.oldListStart;
	//   81  166:aload           11
	//   82  168:aload           11
	//   83  170:getfield        #99  <Field int DiffUtil$Snake.x>
	//   84  173:aload           10
	//   85  175:getfield        #81  <Field int DiffUtil$Range.oldListStart>
	//   86  178:iadd            
	//   87  179:putfield        #99  <Field int DiffUtil$Snake.x>
				snake.y = snake.y + range1.newListStart;
	//   88  182:aload           11
	//   89  184:aload           11
	//   90  186:getfield        #102 <Field int DiffUtil$Snake.y>
	//   91  189:aload           10
	//   92  191:getfield        #87  <Field int DiffUtil$Range.newListStart>
	//   93  194:iadd            
	//   94  195:putfield        #102 <Field int DiffUtil$Snake.y>
				Range range;
				if(((List) (arraylist2)).isEmpty())
	//*  95  198:aload           9
	//*  96  200:invokeinterface #70  <Method boolean List.isEmpty()>
	//*  97  205:ifeq            220
					range = new Range();
	//   98  208:new             #20  <Class DiffUtil$Range>
	//   99  211:dup             
	//  100  212:invokespecial   #103 <Method void DiffUtil$Range()>
	//  101  215:astore          4
				else
	//* 102  217:goto            241
					range = (Range)((List) (arraylist2)).remove(((List) (arraylist2)).size() - 1);
	//  103  220:aload           9
	//  104  222:aload           9
	//  105  224:invokeinterface #73  <Method int List.size()>
	//  106  229:iconst_1        
	//  107  230:isub            
	//  108  231:invokeinterface #77  <Method Object List.remove(int)>
	//  109  236:checkcast       #20  <Class DiffUtil$Range>
	//  110  239:astore          4
				range.oldListStart = range1.oldListStart;
	//  111  241:aload           4
	//  112  243:aload           10
	//  113  245:getfield        #81  <Field int DiffUtil$Range.oldListStart>
	//  114  248:putfield        #81  <Field int DiffUtil$Range.oldListStart>
				range.newListStart = range1.newListStart;
	//  115  251:aload           4
	//  116  253:aload           10
	//  117  255:getfield        #87  <Field int DiffUtil$Range.newListStart>
	//  118  258:putfield        #87  <Field int DiffUtil$Range.newListStart>
				if(snake.reverse)
	//* 119  261:aload           11
	//* 120  263:getfield        #107 <Field boolean DiffUtil$Snake.reverse>
	//* 121  266:ifeq            292
				{
					range.oldListEnd = snake.x;
	//  122  269:aload           4
	//  123  271:aload           11
	//  124  273:getfield        #99  <Field int DiffUtil$Snake.x>
	//  125  276:putfield        #84  <Field int DiffUtil$Range.oldListEnd>
					range.newListEnd = snake.y;
	//  126  279:aload           4
	//  127  281:aload           11
	//  128  283:getfield        #102 <Field int DiffUtil$Snake.y>
	//  129  286:putfield        #90  <Field int DiffUtil$Range.newListEnd>
				} else
	//* 130  289:goto            347
				if(snake.removal)
	//* 131  292:aload           11
	//* 132  294:getfield        #110 <Field boolean DiffUtil$Snake.removal>
	//* 133  297:ifeq            325
				{
					range.oldListEnd = snake.x - 1;
	//  134  300:aload           4
	//  135  302:aload           11
	//  136  304:getfield        #99  <Field int DiffUtil$Snake.x>
	//  137  307:iconst_1        
	//  138  308:isub            
	//  139  309:putfield        #84  <Field int DiffUtil$Range.oldListEnd>
					range.newListEnd = snake.y;
	//  140  312:aload           4
	//  141  314:aload           11
	//  142  316:getfield        #102 <Field int DiffUtil$Snake.y>
	//  143  319:putfield        #90  <Field int DiffUtil$Range.newListEnd>
				} else
	//* 144  322:goto            347
				{
					range.oldListEnd = snake.x;
	//  145  325:aload           4
	//  146  327:aload           11
	//  147  329:getfield        #99  <Field int DiffUtil$Snake.x>
	//  148  332:putfield        #84  <Field int DiffUtil$Range.oldListEnd>
					range.newListEnd = snake.y - 1;
	//  149  335:aload           4
	//  150  337:aload           11
	//  151  339:getfield        #102 <Field int DiffUtil$Snake.y>
	//  152  342:iconst_1        
	//  153  343:isub            
	//  154  344:putfield        #90  <Field int DiffUtil$Range.newListEnd>
				}
				((List) (arraylist1)).add(((Object) (range)));
	//  155  347:aload           6
	//  156  349:aload           4
	//  157  351:invokeinterface #60  <Method boolean List.add(Object)>
	//  158  356:pop             
				if(snake.reverse)
	//* 159  357:aload           11
	//* 160  359:getfield        #107 <Field boolean DiffUtil$Snake.reverse>
	//* 161  362:ifeq            447
				{
					if(snake.removal)
	//* 162  365:aload           11
	//* 163  367:getfield        #110 <Field boolean DiffUtil$Snake.removal>
	//* 164  370:ifeq            410
					{
						range1.oldListStart = snake.x + snake.size + 1;
	//  165  373:aload           10
	//  166  375:aload           11
	//  167  377:getfield        #99  <Field int DiffUtil$Snake.x>
	//  168  380:aload           11
	//  169  382:getfield        #96  <Field int DiffUtil$Snake.size>
	//  170  385:iadd            
	//  171  386:iconst_1        
	//  172  387:iadd            
	//  173  388:putfield        #81  <Field int DiffUtil$Range.oldListStart>
						range1.newListStart = snake.y + snake.size;
	//  174  391:aload           10
	//  175  393:aload           11
	//  176  395:getfield        #102 <Field int DiffUtil$Snake.y>
	//  177  398:aload           11
	//  178  400:getfield        #96  <Field int DiffUtil$Snake.size>
	//  179  403:iadd            
	//  180  404:putfield        #87  <Field int DiffUtil$Range.newListStart>
					} else
	//* 181  407:goto            479
					{
						range1.oldListStart = snake.x + snake.size;
	//  182  410:aload           10
	//  183  412:aload           11
	//  184  414:getfield        #99  <Field int DiffUtil$Snake.x>
	//  185  417:aload           11
	//  186  419:getfield        #96  <Field int DiffUtil$Snake.size>
	//  187  422:iadd            
	//  188  423:putfield        #81  <Field int DiffUtil$Range.oldListStart>
						range1.newListStart = snake.y + snake.size + 1;
	//  189  426:aload           10
	//  190  428:aload           11
	//  191  430:getfield        #102 <Field int DiffUtil$Snake.y>
	//  192  433:aload           11
	//  193  435:getfield        #96  <Field int DiffUtil$Snake.size>
	//  194  438:iadd            
	//  195  439:iconst_1        
	//  196  440:iadd            
	//  197  441:putfield        #87  <Field int DiffUtil$Range.newListStart>
					}
				} else
	//* 198  444:goto            479
				{
					range1.oldListStart = snake.x + snake.size;
	//  199  447:aload           10
	//  200  449:aload           11
	//  201  451:getfield        #99  <Field int DiffUtil$Snake.x>
	//  202  454:aload           11
	//  203  456:getfield        #96  <Field int DiffUtil$Snake.size>
	//  204  459:iadd            
	//  205  460:putfield        #81  <Field int DiffUtil$Range.oldListStart>
					range1.newListStart = snake.y + snake.size;
	//  206  463:aload           10
	//  207  465:aload           11
	//  208  467:getfield        #102 <Field int DiffUtil$Snake.y>
	//  209  470:aload           11
	//  210  472:getfield        #96  <Field int DiffUtil$Snake.size>
	//  211  475:iadd            
	//  212  476:putfield        #87  <Field int DiffUtil$Range.newListStart>
				}
				((List) (arraylist1)).add(((Object) (range1)));
	//  213  479:aload           6
	//  214  481:aload           10
	//  215  483:invokeinterface #60  <Method boolean List.add(Object)>
	//  216  488:pop             
			} else
	//* 217  489:goto            81
			{
				((List) (arraylist2)).add(((Object) (range1)));
	//  218  492:aload           9
	//  219  494:aload           10
	//  220  496:invokeinterface #60  <Method boolean List.add(Object)>
	//  221  501:pop             
			}
		}
	//* 222  502:goto            81
		Collections.sort(((List) (arraylist)), SNAKE_COMPARATOR);
	//  223  505:aload           5
	//  224  507:getstatic       #34  <Field Comparator SNAKE_COMPARATOR>
	//  225  510:invokestatic    #116 <Method void Collections.sort(List, Comparator)>
		return new DiffResult(callback, ((List) (arraylist)), ai, ai1, flag);
	//  226  513:new             #11  <Class DiffUtil$DiffResult>
	//  227  516:dup             
	//  228  517:aload_0         
	//  229  518:aload           5
	//  230  520:aload           7
	//  231  522:aload           8
	//  232  524:iload_1         
	//  233  525:invokespecial   #119 <Method void DiffUtil$DiffResult(DiffUtil$Callback, List, int[], int[], boolean)>
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
			l -= k;
	//    4    4:iload           4
	//    5    6:iload_3         
	//    6    7:isub            
	//    7    8:istore          4
			if(j < 1 || l < 1)
	//*   8   10:iload_2         
	//*   9   11:iconst_1        
	//*  10   12:icmplt          657
	//*  11   15:iload           4
	//*  12   17:iconst_1        
	//*  13   18:icmpge          24
				break label0;
	//   14   21:goto            657
			int i5 = j - l;
	//   15   24:iload_2         
	//   16   25:iload           4
	//   17   27:isub            
	//   18   28:istore          15
			int j1 = (j + l + 1) / 2;
	//   19   30:iload_2         
	//   20   31:iload           4
	//   21   33:iadd            
	//   22   34:iconst_1        
	//   23   35:iadd            
	//   24   36:iconst_2        
	//   25   37:idiv            
	//   26   38:istore          8
			int k1 = i1 - j1 - 1;
	//   27   40:iload           7
	//   28   42:iload           8
	//   29   44:isub            
	//   30   45:iconst_1        
	//   31   46:isub            
	//   32   47:istore          9
			int l2 = i1 + j1 + 1;
	//   33   49:iload           7
	//   34   51:iload           8
	//   35   53:iadd            
	//   36   54:iconst_1        
	//   37   55:iadd            
	//   38   56:istore          10
			Arrays.fill(ai, k1, l2, 0);
	//   39   58:aload           5
	//   40   60:iload           9
	//   41   62:iload           10
	//   42   64:iconst_0        
	//   43   65:invokestatic    #125 <Method void Arrays.fill(int[], int, int, int)>
			Arrays.fill(ai1, k1 + i5, l2 + i5, j);
	//   44   68:aload           6
	//   45   70:iload           9
	//   46   72:iload           15
	//   47   74:iadd            
	//   48   75:iload           10
	//   49   77:iload           15
	//   50   79:iadd            
	//   51   80:iload_2         
	//   52   81:invokestatic    #125 <Method void Arrays.fill(int[], int, int, int)>
			boolean flag;
			if(i5 % 2 != 0)
	//*  53   84:iload           15
	//*  54   86:iconst_2        
	//*  55   87:irem            
	//*  56   88:ifeq            97
				flag = true;
	//   57   91:iconst_1        
	//   58   92:istore          10
			else
	//*  59   94:goto            100
				flag = false;
	//   60   97:iconst_0        
	//   61   98:istore          10
			int i3 = 0;
	//   62  100:iconst_0        
	//   63  101:istore          11
			do
			{
				if(i3 > j1)
					break;
	//   64  103:iload           11
	//   65  105:iload           8
	//   66  107:icmpgt          647
				int j3 = -i3;
	//   67  110:iload           11
	//   68  112:ineg            
	//   69  113:istore          12
				for(int k3 = j3; k3 <= i3; k3 += 2)
	//*  70  115:iload           12
	//*  71  117:istore          13
	//*  72  119:iload           13
	//*  73  121:iload           11
	//*  74  123:icmpgt          373
				{
					int i2;
					boolean flag1;
label1:
					{
label2:
						{
							if(k3 == j3)
								break label2;
	//   75  126:iload           13
	//   76  128:iload           12
	//   77  130:icmpeq          187
							if(k3 != i3)
	//*  78  133:iload           13
	//*  79  135:iload           11
	//*  80  137:icmpeq          167
							{
								int l1 = i1 + k3;
	//   81  140:iload           7
	//   82  142:iload           13
	//   83  144:iadd            
	//   84  145:istore          9
								if(ai[l1 - 1] < ai[l1 + 1])
	//*  85  147:aload           5
	//*  86  149:iload           9
	//*  87  151:iconst_1        
	//*  88  152:isub            
	//*  89  153:iaload          
	//*  90  154:aload           5
	//*  91  156:iload           9
	//*  92  158:iconst_1        
	//*  93  159:iadd            
	//*  94  160:iaload          
	//*  95  161:icmpge          167
									break label2;
	//   96  164:goto            187
							}
							i2 = ai[(i1 + k3) - 1] + 1;
	//   97  167:aload           5
	//   98  169:iload           7
	//   99  171:iload           13
	//  100  173:iadd            
	//  101  174:iconst_1        
	//  102  175:isub            
	//  103  176:iaload          
	//  104  177:iconst_1        
	//  105  178:iadd            
	//  106  179:istore          9
							flag1 = true;
	//  107  181:iconst_1        
	//  108  182:istore          17
							break label1;
	//  109  184:goto            202
						}
						i2 = ai[i1 + k3 + 1];
	//  110  187:aload           5
	//  111  189:iload           7
	//  112  191:iload           13
	//  113  193:iadd            
	//  114  194:iconst_1        
	//  115  195:iadd            
	//  116  196:iaload          
	//  117  197:istore          9
						flag1 = false;
	//  118  199:iconst_0        
	//  119  200:istore          17
					}
					for(int i4 = i2 - k3; i2 < j && i4 < l && callback.areItemsTheSame(i + i2, k + i4); i4++)
	//* 120  202:iload           9
	//* 121  204:iload           13
	//* 122  206:isub            
	//* 123  207:istore          14
	//* 124  209:iload           9
	//* 125  211:iload_2         
	//* 126  212:icmpge          252
	//* 127  215:iload           14
	//* 128  217:iload           4
	//* 129  219:icmpge          252
	//* 130  222:aload_0         
	//* 131  223:iload_1         
	//* 132  224:iload           9
	//* 133  226:iadd            
	//* 134  227:iload_3         
	//* 135  228:iload           14
	//* 136  230:iadd            
	//* 137  231:invokevirtual   #129 <Method boolean DiffUtil$Callback.areItemsTheSame(int, int)>
	//* 138  234:ifeq            252
						i2++;
	//  139  237:iload           9
	//  140  239:iconst_1        
	//  141  240:iadd            
	//  142  241:istore          9

	//  143  243:iload           14
	//  144  245:iconst_1        
	//  145  246:iadd            
	//  146  247:istore          14
	//* 147  249:goto            209
					int j4 = i1 + k3;
	//  148  252:iload           7
	//  149  254:iload           13
	//  150  256:iadd            
	//  151  257:istore          14
					ai[j4] = i2;
	//  152  259:aload           5
	//  153  261:iload           14
	//  154  263:iload           9
	//  155  265:iastore         
					if(flag && k3 >= (i5 - i3) + 1 && k3 <= (i5 + i3) - 1 && ai[j4] >= ai1[j4])
	//* 156  266:iload           10
	//* 157  268:ifeq            364
	//* 158  271:iload           13
	//* 159  273:iload           15
	//* 160  275:iload           11
	//* 161  277:isub            
	//* 162  278:iconst_1        
	//* 163  279:iadd            
	//* 164  280:icmplt          364
	//* 165  283:iload           13
	//* 166  285:iload           15
	//* 167  287:iload           11
	//* 168  289:iadd            
	//* 169  290:iconst_1        
	//* 170  291:isub            
	//* 171  292:icmpgt          364
	//* 172  295:aload           5
	//* 173  297:iload           14
	//* 174  299:iaload          
	//* 175  300:aload           6
	//* 176  302:iload           14
	//* 177  304:iaload          
	//* 178  305:icmplt          364
					{
						callback = ((Callback) (new Snake()));
	//  179  308:new             #23  <Class DiffUtil$Snake>
	//  180  311:dup             
	//  181  312:invokespecial   #130 <Method void DiffUtil$Snake()>
	//  182  315:astore_0        
						callback.x = ai1[j4];
	//  183  316:aload_0         
	//  184  317:aload           6
	//  185  319:iload           14
	//  186  321:iaload          
	//  187  322:putfield        #99  <Field int DiffUtil$Snake.x>
						callback.y = ((Snake) (callback)).x - k3;
	//  188  325:aload_0         
	//  189  326:aload_0         
	//  190  327:getfield        #99  <Field int DiffUtil$Snake.x>
	//  191  330:iload           13
	//  192  332:isub            
	//  193  333:putfield        #102 <Field int DiffUtil$Snake.y>
						callback.size = ai[j4] - ai1[j4];
	//  194  336:aload_0         
	//  195  337:aload           5
	//  196  339:iload           14
	//  197  341:iaload          
	//  198  342:aload           6
	//  199  344:iload           14
	//  200  346:iaload          
	//  201  347:isub            
	//  202  348:putfield        #96  <Field int DiffUtil$Snake.size>
						callback.removal = flag1;
	//  203  351:aload_0         
	//  204  352:iload           17
	//  205  354:putfield        #110 <Field boolean DiffUtil$Snake.removal>
						callback.reverse = false;
	//  206  357:aload_0         
	//  207  358:iconst_0        
	//  208  359:putfield        #107 <Field boolean DiffUtil$Snake.reverse>
						return ((Snake) (callback));
	//  209  362:aload_0         
	//  210  363:areturn         
					}
				}

	//  211  364:iload           13
	//  212  366:iconst_2        
	//  213  367:iadd            
	//  214  368:istore          13
	//* 215  370:goto            119
				boolean flag2 = false;
	//  216  373:iconst_0        
	//  217  374:istore          17
				for(int l3 = j3; l3 <= i3;)
	//* 218  376:iload           12
	//* 219  378:istore          13
	//* 220  380:iload           13
	//* 221  382:iload           11
	//* 222  384:icmpgt          638
				{
					int k2;
					int j5;
label3:
					{
label4:
						{
							j5 = l3 + i5;
	//  223  387:iload           13
	//  224  389:iload           15
	//  225  391:iadd            
	//  226  392:istore          16
							if(j5 == i3 + i5)
								break label4;
	//  227  394:iload           16
	//  228  396:iload           11
	//  229  398:iload           15
	//  230  400:iadd            
	//  231  401:icmpeq          461
							if(j5 != j3 + i5)
	//* 232  404:iload           16
	//* 233  406:iload           12
	//* 234  408:iload           15
	//* 235  410:iadd            
	//* 236  411:icmpeq          441
							{
								int j2 = i1 + j5;
	//  237  414:iload           7
	//  238  416:iload           16
	//  239  418:iadd            
	//  240  419:istore          9
								if(ai1[j2 - 1] < ai1[j2 + 1])
	//* 241  421:aload           6
	//* 242  423:iload           9
	//* 243  425:iconst_1        
	//* 244  426:isub            
	//* 245  427:iaload          
	//* 246  428:aload           6
	//* 247  430:iload           9
	//* 248  432:iconst_1        
	//* 249  433:iadd            
	//* 250  434:iaload          
	//* 251  435:icmpge          441
									break label4;
	//  252  438:goto            461
							}
							k2 = ai1[i1 + j5 + 1] - 1;
	//  253  441:aload           6
	//  254  443:iload           7
	//  255  445:iload           16
	//  256  447:iadd            
	//  257  448:iconst_1        
	//  258  449:iadd            
	//  259  450:iaload          
	//  260  451:iconst_1        
	//  261  452:isub            
	//  262  453:istore          9
							flag2 = true;
	//  263  455:iconst_1        
	//  264  456:istore          17
							break label3;
	//  265  458:goto            473
						}
						k2 = ai1[(i1 + j5) - 1];
	//  266  461:aload           6
	//  267  463:iload           7
	//  268  465:iload           16
	//  269  467:iadd            
	//  270  468:iconst_1        
	//  271  469:isub            
	//  272  470:iaload          
	//  273  471:istore          9
					}
					for(int k4 = k2 - j5; k2 > 0 && k4 > 0 && callback.areItemsTheSame((i + k2) - 1, (k + k4) - 1); k4--)
	//* 274  473:iload           9
	//* 275  475:iload           16
	//* 276  477:isub            
	//* 277  478:istore          14
	//* 278  480:iload           9
	//* 279  482:ifle            524
	//* 280  485:iload           14
	//* 281  487:ifle            524
	//* 282  490:aload_0         
	//* 283  491:iload_1         
	//* 284  492:iload           9
	//* 285  494:iadd            
	//* 286  495:iconst_1        
	//* 287  496:isub            
	//* 288  497:iload_3         
	//* 289  498:iload           14
	//* 290  500:iadd            
	//* 291  501:iconst_1        
	//* 292  502:isub            
	//* 293  503:invokevirtual   #129 <Method boolean DiffUtil$Callback.areItemsTheSame(int, int)>
	//* 294  506:ifeq            524
						k2--;
	//  295  509:iload           9
	//  296  511:iconst_1        
	//  297  512:isub            
	//  298  513:istore          9

	//  299  515:iload           14
	//  300  517:iconst_1        
	//  301  518:isub            
	//  302  519:istore          14
	//* 303  521:goto            480
					int l4 = i1 + j5;
	//  304  524:iload           7
	//  305  526:iload           16
	//  306  528:iadd            
	//  307  529:istore          14
					ai1[l4] = k2;
	//  308  531:aload           6
	//  309  533:iload           14
	//  310  535:iload           9
	//  311  537:iastore         
					if(!flag && j5 >= j3 && j5 <= i3 && ai[l4] >= ai1[l4])
	//* 312  538:iload           10
	//* 313  540:ifne            626
	//* 314  543:iload           16
	//* 315  545:iload           12
	//* 316  547:icmplt          626
	//* 317  550:iload           16
	//* 318  552:iload           11
	//* 319  554:icmpgt          626
	//* 320  557:aload           5
	//* 321  559:iload           14
	//* 322  561:iaload          
	//* 323  562:aload           6
	//* 324  564:iload           14
	//* 325  566:iaload          
	//* 326  567:icmplt          626
					{
						callback = ((Callback) (new Snake()));
	//  327  570:new             #23  <Class DiffUtil$Snake>
	//  328  573:dup             
	//  329  574:invokespecial   #130 <Method void DiffUtil$Snake()>
	//  330  577:astore_0        
						callback.x = ai1[l4];
	//  331  578:aload_0         
	//  332  579:aload           6
	//  333  581:iload           14
	//  334  583:iaload          
	//  335  584:putfield        #99  <Field int DiffUtil$Snake.x>
						callback.y = ((Snake) (callback)).x - j5;
	//  336  587:aload_0         
	//  337  588:aload_0         
	//  338  589:getfield        #99  <Field int DiffUtil$Snake.x>
	//  339  592:iload           16
	//  340  594:isub            
	//  341  595:putfield        #102 <Field int DiffUtil$Snake.y>
						callback.size = ai[l4] - ai1[l4];
	//  342  598:aload_0         
	//  343  599:aload           5
	//  344  601:iload           14
	//  345  603:iaload          
	//  346  604:aload           6
	//  347  606:iload           14
	//  348  608:iaload          
	//  349  609:isub            
	//  350  610:putfield        #96  <Field int DiffUtil$Snake.size>
						callback.removal = flag2;
	//  351  613:aload_0         
	//  352  614:iload           17
	//  353  616:putfield        #110 <Field boolean DiffUtil$Snake.removal>
						callback.reverse = true;
	//  354  619:aload_0         
	//  355  620:iconst_1        
	//  356  621:putfield        #107 <Field boolean DiffUtil$Snake.reverse>
						return ((Snake) (callback));
	//  357  624:aload_0         
	//  358  625:areturn         
					}
					l3 += 2;
	//  359  626:iload           13
	//  360  628:iconst_2        
	//  361  629:iadd            
	//  362  630:istore          13
					flag2 = false;
	//  363  632:iconst_0        
	//  364  633:istore          17
				}

	//* 365  635:goto            380
				i3++;
	//  366  638:iload           11
	//  367  640:iconst_1        
	//  368  641:iadd            
	//  369  642:istore          11
			} while(true);
	//  370  644:goto            103
			throw new IllegalStateException("DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation.");
	//  371  647:new             #132 <Class IllegalStateException>
	//  372  650:dup             
	//  373  651:ldc1            #134 <String "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation.">
	//  374  653:invokespecial   #137 <Method void IllegalStateException(String)>
	//  375  656:athrow          
		}
		return null;
	//  376  657:aconst_null     
	//  377  658:areturn         
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
