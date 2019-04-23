// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;

import android.util.*;

// Referenced classes of package android.support.v7.util:
//			TileList, MessageThreadUtil, ThreadUtil

public class AsyncListUtil
{
	public static abstract class DataCallback
	{

		public abstract void fillData(Object aobj[], int i, int j);

		public int getMaxCachedTiles()
		{
			return 10;
		//    0    0:bipush          10
		//    1    2:ireturn         
		}

		public void recycleData(Object aobj[], int i)
		{
		//    0    0:return          
		}

		public abstract int refreshData();

		public DataCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Object()>
		//    2    4:return          
		}
	}

	public static abstract class ViewCallback
	{

		public void extendRangeInto(int ai[], int ai1[], int i)
		{
			int j = (ai[1] - ai[0]) + 1;
		//    0    0:aload_1         
		//    1    1:iconst_1        
		//    2    2:iaload          
		//    3    3:aload_1         
		//    4    4:iconst_0        
		//    5    5:iaload          
		//    6    6:isub            
		//    7    7:iconst_1        
		//    8    8:iadd            
		//    9    9:istore          4
			int k = j / 2;
		//   10   11:iload           4
		//   11   13:iconst_2        
		//   12   14:idiv            
		//   13   15:istore          5
			int i1 = ai[0];
		//   14   17:aload_1         
		//   15   18:iconst_0        
		//   16   19:iaload          
		//   17   20:istore          7
			int l;
			if(i == 1)
		//*  18   22:iload_3         
		//*  19   23:iconst_1        
		//*  20   24:icmpne          34
				l = j;
		//   21   27:iload           4
		//   22   29:istore          6
			else
		//*  23   31:goto            38
				l = k;
		//   24   34:iload           5
		//   25   36:istore          6
			ai1[0] = i1 - l;
		//   26   38:aload_2         
		//   27   39:iconst_0        
		//   28   40:iload           7
		//   29   42:iload           6
		//   30   44:isub            
		//   31   45:iastore         
			l = ai[1];
		//   32   46:aload_1         
		//   33   47:iconst_1        
		//   34   48:iaload          
		//   35   49:istore          6
			if(i != 2)
		//*  36   51:iload_3         
		//*  37   52:iconst_2        
		//*  38   53:icmpne          59
		//*  39   56:goto            63
				j = k;
		//   40   59:iload           5
		//   41   61:istore          4
			ai1[1] = l + j;
		//   42   63:aload_2         
		//   43   64:iconst_1        
		//   44   65:iload           6
		//   45   67:iload           4
		//   46   69:iadd            
		//   47   70:iastore         
		//   48   71:return          
		}

		public abstract void getItemRangeInto(int ai[]);

		public abstract void onDataRefresh();

		public abstract void onItemLoaded(int i);

		public static final int HINT_SCROLL_ASC = 2;
		public static final int HINT_SCROLL_DESC = 1;
		public static final int HINT_SCROLL_NONE = 0;

		public ViewCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:return          
		}
	}


	public AsyncListUtil(Class class1, int i, DataCallback datacallback, ViewCallback viewcallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:newarray        int[]
	//    5    8:putfield        #62  <Field int[] mTmpRange>
	//    6   11:aload_0         
	//    7   12:iconst_2        
	//    8   13:newarray        int[]
	//    9   15:putfield        #64  <Field int[] mPrevRange>
	//   10   18:aload_0         
	//   11   19:iconst_2        
	//   12   20:newarray        int[]
	//   13   22:putfield        #66  <Field int[] mTmpRangeExtended>
		mScrollHint = 0;
	//   14   25:aload_0         
	//   15   26:iconst_0        
	//   16   27:putfield        #68  <Field int mScrollHint>
		mItemCount = 0;
	//   17   30:aload_0         
	//   18   31:iconst_0        
	//   19   32:putfield        #70  <Field int mItemCount>
		mDisplayedGeneration = 0;
	//   20   35:aload_0         
	//   21   36:iconst_0        
	//   22   37:putfield        #72  <Field int mDisplayedGeneration>
		mRequestedGeneration = mDisplayedGeneration;
	//   23   40:aload_0         
	//   24   41:aload_0         
	//   25   42:getfield        #72  <Field int mDisplayedGeneration>
	//   26   45:putfield        #74  <Field int mRequestedGeneration>
	//   27   48:aload_0         
	//   28   49:new             #76  <Class SparseIntArray>
	//   29   52:dup             
	//   30   53:invokespecial   #77  <Method void SparseIntArray()>
	//   31   56:putfield        #79  <Field SparseIntArray mMissingPositions>
	//   32   59:aload_0         
	//   33   60:new             #7   <Class AsyncListUtil$1>
	//   34   63:dup             
	//   35   64:aload_0         
	//   36   65:invokespecial   #82  <Method void AsyncListUtil$1(AsyncListUtil)>
	//   37   68:putfield        #84  <Field ThreadUtil$MainThreadCallback mMainThreadCallback>
	//   38   71:aload_0         
	//   39   72:new             #9   <Class AsyncListUtil$2>
	//   40   75:dup             
	//   41   76:aload_0         
	//   42   77:invokespecial   #85  <Method void AsyncListUtil$2(AsyncListUtil)>
	//   43   80:putfield        #87  <Field ThreadUtil$BackgroundCallback mBackgroundCallback>
		mTClass = class1;
	//   44   83:aload_0         
	//   45   84:aload_1         
	//   46   85:putfield        #89  <Field Class mTClass>
		mTileSize = i;
	//   47   88:aload_0         
	//   48   89:iload_2         
	//   49   90:putfield        #91  <Field int mTileSize>
		mDataCallback = datacallback;
	//   50   93:aload_0         
	//   51   94:aload_3         
	//   52   95:putfield        #93  <Field AsyncListUtil$DataCallback mDataCallback>
		mViewCallback = viewcallback;
	//   53   98:aload_0         
	//   54   99:aload           4
	//   55  101:putfield        #95  <Field AsyncListUtil$ViewCallback mViewCallback>
		mTileList = new TileList(mTileSize);
	//   56  104:aload_0         
	//   57  105:new             #97  <Class TileList>
	//   58  108:dup             
	//   59  109:aload_0         
	//   60  110:getfield        #91  <Field int mTileSize>
	//   61  113:invokespecial   #100 <Method void TileList(int)>
	//   62  116:putfield        #102 <Field TileList mTileList>
		class1 = ((Class) (new MessageThreadUtil()));
	//   63  119:new             #104 <Class MessageThreadUtil>
	//   64  122:dup             
	//   65  123:invokespecial   #105 <Method void MessageThreadUtil()>
	//   66  126:astore_1        
		mMainThreadProxy = ((ThreadUtil) (class1)).getMainThreadProxy(mMainThreadCallback);
	//   67  127:aload_0         
	//   68  128:aload_1         
	//   69  129:aload_0         
	//   70  130:getfield        #84  <Field ThreadUtil$MainThreadCallback mMainThreadCallback>
	//   71  133:invokeinterface #111 <Method ThreadUtil$MainThreadCallback ThreadUtil.getMainThreadProxy(ThreadUtil$MainThreadCallback)>
	//   72  138:putfield        #113 <Field ThreadUtil$MainThreadCallback mMainThreadProxy>
		mBackgroundProxy = ((ThreadUtil) (class1)).getBackgroundProxy(mBackgroundCallback);
	//   73  141:aload_0         
	//   74  142:aload_1         
	//   75  143:aload_0         
	//   76  144:getfield        #87  <Field ThreadUtil$BackgroundCallback mBackgroundCallback>
	//   77  147:invokeinterface #117 <Method ThreadUtil$BackgroundCallback ThreadUtil.getBackgroundProxy(ThreadUtil$BackgroundCallback)>
	//   78  152:putfield        #119 <Field ThreadUtil$BackgroundCallback mBackgroundProxy>
		refresh();
	//   79  155:aload_0         
	//   80  156:invokevirtual   #122 <Method void refresh()>
	//   81  159:return          
	}

	private boolean isRefreshPending()
	{
		return mRequestedGeneration != mDisplayedGeneration;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field int mRequestedGeneration>
	//    2    4:aload_0         
	//    3    5:getfield        #72  <Field int mDisplayedGeneration>
	//    4    8:icmpeq          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public Object getItem(int i)
	{
		if(i >= 0 && i < mItemCount)
	//*   0    0:iload_1         
	//*   1    1:iflt            43
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #70  <Field int mItemCount>
	//*   5    9:icmpge          43
		{
			Object obj = mTileList.getItemAt(i);
	//    6   12:aload_0         
	//    7   13:getfield        #102 <Field TileList mTileList>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #134 <Method Object TileList.getItemAt(int)>
	//   10   20:astore_2        
			if(obj == null && !isRefreshPending())
	//*  11   21:aload_2         
	//*  12   22:ifnonnull       41
	//*  13   25:aload_0         
	//*  14   26:invokespecial   #136 <Method boolean isRefreshPending()>
	//*  15   29:ifne            41
				mMissingPositions.put(i, 0);
	//   16   32:aload_0         
	//   17   33:getfield        #79  <Field SparseIntArray mMissingPositions>
	//   18   36:iload_1         
	//   19   37:iconst_0        
	//   20   38:invokevirtual   #140 <Method void SparseIntArray.put(int, int)>
			return obj;
	//   21   41:aload_2         
	//   22   42:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   23   43:new             #142 <Class StringBuilder>
	//   24   46:dup             
	//   25   47:invokespecial   #143 <Method void StringBuilder()>
	//   26   50:astore_2        
			stringbuilder.append(i);
	//   27   51:aload_2         
	//   28   52:iload_1         
	//   29   53:invokevirtual   #147 <Method StringBuilder StringBuilder.append(int)>
	//   30   56:pop             
			stringbuilder.append(" is not within 0 and ");
	//   31   57:aload_2         
	//   32   58:ldc1            #149 <String " is not within 0 and ">
	//   33   60:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   34   63:pop             
			stringbuilder.append(mItemCount);
	//   35   64:aload_2         
	//   36   65:aload_0         
	//   37   66:getfield        #70  <Field int mItemCount>
	//   38   69:invokevirtual   #147 <Method StringBuilder StringBuilder.append(int)>
	//   39   72:pop             
			throw new IndexOutOfBoundsException(stringbuilder.toString());
	//   40   73:new             #154 <Class IndexOutOfBoundsException>
	//   41   76:dup             
	//   42   77:aload_2         
	//   43   78:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   44   81:invokespecial   #161 <Method void IndexOutOfBoundsException(String)>
	//   45   84:athrow          
		}
	}

	public int getItemCount()
	{
		return mItemCount;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field int mItemCount>
	//    2    4:ireturn         
	}

	transient void log(String s, Object aobj[])
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #142 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #143 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("[MAIN] ");
	//    4    8:aload_3         
	//    5    9:ldc1            #169 <String "[MAIN] ">
	//    6   11:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(String.format(s, aobj));
	//    8   15:aload_3         
	//    9   16:aload_1         
	//   10   17:aload_2         
	//   11   18:invokestatic    #175 <Method String String.format(String, Object[])>
	//   12   21:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
		Log.d("AsyncListUtil", stringbuilder.toString());
	//   14   25:ldc1            #22  <String "AsyncListUtil">
	//   15   27:aload_3         
	//   16   28:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   17   31:invokestatic    #181 <Method int Log.d(String, String)>
	//   18   34:pop             
	//   19   35:return          
	}

	public void onRangeChanged()
	{
		if(isRefreshPending())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #136 <Method boolean isRefreshPending()>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			updateRange();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #185 <Method void updateRange()>
			mAllowScrollHints = true;
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:putfield        #187 <Field boolean mAllowScrollHints>
			return;
	//    9   17:return          
		}
	}

	public void refresh()
	{
		mMissingPositions.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field SparseIntArray mMissingPositions>
	//    2    4:invokevirtual   #190 <Method void SparseIntArray.clear()>
		ThreadUtil.BackgroundCallback backgroundcallback = mBackgroundProxy;
	//    3    7:aload_0         
	//    4    8:getfield        #119 <Field ThreadUtil$BackgroundCallback mBackgroundProxy>
	//    5   11:astore_2        
		int i = mRequestedGeneration + 1;
	//    6   12:aload_0         
	//    7   13:getfield        #74  <Field int mRequestedGeneration>
	//    8   16:iconst_1        
	//    9   17:iadd            
	//   10   18:istore_1        
		mRequestedGeneration = i;
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:putfield        #74  <Field int mRequestedGeneration>
		backgroundcallback.refresh(i);
	//   14   24:aload_2         
	//   15   25:iload_1         
	//   16   26:invokeinterface #194 <Method void ThreadUtil$BackgroundCallback.refresh(int)>
	//   17   31:return          
	}

	void updateRange()
	{
		mViewCallback.getItemRangeInto(mTmpRange);
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field AsyncListUtil$ViewCallback mViewCallback>
	//    2    4:aload_0         
	//    3    5:getfield        #62  <Field int[] mTmpRange>
	//    4    8:invokevirtual   #198 <Method void AsyncListUtil$ViewCallback.getItemRangeInto(int[])>
		int ai[] = mTmpRange;
	//    5   11:aload_0         
	//    6   12:getfield        #62  <Field int[] mTmpRange>
	//    7   15:astore_3        
		if(ai[0] <= ai[1])
	//*   8   16:aload_3         
	//*   9   17:iconst_0        
	//*  10   18:iaload          
	//*  11   19:aload_3         
	//*  12   20:iconst_1        
	//*  13   21:iaload          
	//*  14   22:icmpgt          273
		{
			if(ai[0] < 0)
	//*  15   25:aload_3         
	//*  16   26:iconst_0        
	//*  17   27:iaload          
	//*  18   28:ifge            32
				return;
	//   19   31:return          
			if(ai[1] >= mItemCount)
	//*  20   32:aload_3         
	//*  21   33:iconst_1        
	//*  22   34:iaload          
	//*  23   35:aload_0         
	//*  24   36:getfield        #70  <Field int mItemCount>
	//*  25   39:icmplt          43
				return;
	//   26   42:return          
			if(!mAllowScrollHints)
	//*  27   43:aload_0         
	//*  28   44:getfield        #187 <Field boolean mAllowScrollHints>
	//*  29   47:ifne            58
			{
				mScrollHint = 0;
	//   30   50:aload_0         
	//   31   51:iconst_0        
	//   32   52:putfield        #68  <Field int mScrollHint>
			} else
	//*  33   55:goto            130
			{
				int i = ai[0];
	//   34   58:aload_3         
	//   35   59:iconst_0        
	//   36   60:iaload          
	//   37   61:istore_1        
				int ai1[] = mPrevRange;
	//   38   62:aload_0         
	//   39   63:getfield        #64  <Field int[] mPrevRange>
	//   40   66:astore          4
				if(i <= ai1[1] && ai1[0] <= ai[1])
	//*  41   68:iload_1         
	//*  42   69:aload           4
	//*  43   71:iconst_1        
	//*  44   72:iaload          
	//*  45   73:icmpgt          125
	//*  46   76:aload           4
	//*  47   78:iconst_0        
	//*  48   79:iaload          
	//*  49   80:aload_3         
	//*  50   81:iconst_1        
	//*  51   82:iaload          
	//*  52   83:icmple          89
	//*  53   86:goto            125
				{
					if(ai[0] < ai1[0])
	//*  54   89:aload_3         
	//*  55   90:iconst_0        
	//*  56   91:iaload          
	//*  57   92:aload           4
	//*  58   94:iconst_0        
	//*  59   95:iaload          
	//*  60   96:icmpge          107
						mScrollHint = 1;
	//   61   99:aload_0         
	//   62  100:iconst_1        
	//   63  101:putfield        #68  <Field int mScrollHint>
					else
	//*  64  104:goto            130
					if(ai[0] > ai1[0])
	//*  65  107:aload_3         
	//*  66  108:iconst_0        
	//*  67  109:iaload          
	//*  68  110:aload           4
	//*  69  112:iconst_0        
	//*  70  113:iaload          
	//*  71  114:icmple          130
						mScrollHint = 2;
	//   72  117:aload_0         
	//   73  118:iconst_2        
	//   74  119:putfield        #68  <Field int mScrollHint>
				} else
	//*  75  122:goto            130
				{
					mScrollHint = 0;
	//   76  125:aload_0         
	//   77  126:iconst_0        
	//   78  127:putfield        #68  <Field int mScrollHint>
				}
			}
			ai = mPrevRange;
	//   79  130:aload_0         
	//   80  131:getfield        #64  <Field int[] mPrevRange>
	//   81  134:astore_3        
			int ai2[] = mTmpRange;
	//   82  135:aload_0         
	//   83  136:getfield        #62  <Field int[] mTmpRange>
	//   84  139:astore          4
			ai[0] = ai2[0];
	//   85  141:aload_3         
	//   86  142:iconst_0        
	//   87  143:aload           4
	//   88  145:iconst_0        
	//   89  146:iaload          
	//   90  147:iastore         
			ai[1] = ai2[1];
	//   91  148:aload_3         
	//   92  149:iconst_1        
	//   93  150:aload           4
	//   94  152:iconst_1        
	//   95  153:iaload          
	//   96  154:iastore         
			mViewCallback.extendRangeInto(ai2, mTmpRangeExtended, mScrollHint);
	//   97  155:aload_0         
	//   98  156:getfield        #95  <Field AsyncListUtil$ViewCallback mViewCallback>
	//   99  159:aload           4
	//  100  161:aload_0         
	//  101  162:getfield        #66  <Field int[] mTmpRangeExtended>
	//  102  165:aload_0         
	//  103  166:getfield        #68  <Field int mScrollHint>
	//  104  169:invokevirtual   #202 <Method void AsyncListUtil$ViewCallback.extendRangeInto(int[], int[], int)>
			ai = mTmpRangeExtended;
	//  105  172:aload_0         
	//  106  173:getfield        #66  <Field int[] mTmpRangeExtended>
	//  107  176:astore_3        
			ai[0] = Math.min(mTmpRange[0], Math.max(ai[0], 0));
	//  108  177:aload_3         
	//  109  178:iconst_0        
	//  110  179:aload_0         
	//  111  180:getfield        #62  <Field int[] mTmpRange>
	//  112  183:iconst_0        
	//  113  184:iaload          
	//  114  185:aload_3         
	//  115  186:iconst_0        
	//  116  187:iaload          
	//  117  188:iconst_0        
	//  118  189:invokestatic    #208 <Method int Math.max(int, int)>
	//  119  192:invokestatic    #211 <Method int Math.min(int, int)>
	//  120  195:iastore         
			ai = mTmpRangeExtended;
	//  121  196:aload_0         
	//  122  197:getfield        #66  <Field int[] mTmpRangeExtended>
	//  123  200:astore_3        
			ai[1] = Math.max(mTmpRange[1], Math.min(ai[1], mItemCount - 1));
	//  124  201:aload_3         
	//  125  202:iconst_1        
	//  126  203:aload_0         
	//  127  204:getfield        #62  <Field int[] mTmpRange>
	//  128  207:iconst_1        
	//  129  208:iaload          
	//  130  209:aload_3         
	//  131  210:iconst_1        
	//  132  211:iaload          
	//  133  212:aload_0         
	//  134  213:getfield        #70  <Field int mItemCount>
	//  135  216:iconst_1        
	//  136  217:isub            
	//  137  218:invokestatic    #211 <Method int Math.min(int, int)>
	//  138  221:invokestatic    #208 <Method int Math.max(int, int)>
	//  139  224:iastore         
			ThreadUtil.BackgroundCallback backgroundcallback = mBackgroundProxy;
	//  140  225:aload_0         
	//  141  226:getfield        #119 <Field ThreadUtil$BackgroundCallback mBackgroundProxy>
	//  142  229:astore_3        
			ai2 = mTmpRange;
	//  143  230:aload_0         
	//  144  231:getfield        #62  <Field int[] mTmpRange>
	//  145  234:astore          4
			int j = ai2[0];
	//  146  236:aload           4
	//  147  238:iconst_0        
	//  148  239:iaload          
	//  149  240:istore_1        
			int k = ai2[1];
	//  150  241:aload           4
	//  151  243:iconst_1        
	//  152  244:iaload          
	//  153  245:istore_2        
			ai2 = mTmpRangeExtended;
	//  154  246:aload_0         
	//  155  247:getfield        #66  <Field int[] mTmpRangeExtended>
	//  156  250:astore          4
			backgroundcallback.updateRange(j, k, ai2[0], ai2[1], mScrollHint);
	//  157  252:aload_3         
	//  158  253:iload_1         
	//  159  254:iload_2         
	//  160  255:aload           4
	//  161  257:iconst_0        
	//  162  258:iaload          
	//  163  259:aload           4
	//  164  261:iconst_1        
	//  165  262:iaload          
	//  166  263:aload_0         
	//  167  264:getfield        #68  <Field int mScrollHint>
	//  168  267:invokeinterface #214 <Method void ThreadUtil$BackgroundCallback.updateRange(int, int, int, int, int)>
			return;
	//  169  272:return          
		} else
		{
			return;
	//  170  273:return          
		}
	}

	static final boolean DEBUG = false;
	static final String TAG = "AsyncListUtil";
	boolean mAllowScrollHints;
	private final ThreadUtil.BackgroundCallback mBackgroundCallback = new ThreadUtil.BackgroundCallback() {

		private TileList.Tile acquireTile()
		{
			TileList.Tile tile = mRecycledRoot;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field TileList$Tile mRecycledRoot>
		//    2    4:astore_1        
			if(tile != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          19
			{
				mRecycledRoot = tile.mNext;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:getfield        #43  <Field TileList$Tile TileList$Tile.mNext>
		//    8   14:putfield        #38  <Field TileList$Tile mRecycledRoot>
				return tile;
		//    9   17:aload_1         
		//   10   18:areturn         
			} else
			{
				return new TileList.Tile(mTClass, mTileSize);
		//   11   19:new             #40  <Class TileList$Tile>
		//   12   22:dup             
		//   13   23:aload_0         
		//   14   24:getfield        #25  <Field AsyncListUtil this$0>
		//   15   27:getfield        #47  <Field Class AsyncListUtil.mTClass>
		//   16   30:aload_0         
		//   17   31:getfield        #25  <Field AsyncListUtil this$0>
		//   18   34:getfield        #50  <Field int AsyncListUtil.mTileSize>
		//   19   37:invokespecial   #53  <Method void TileList$Tile(Class, int)>
		//   20   40:areturn         
			}
		}

		private void addTile(TileList.Tile tile)
		{
			mLoadedTiles.put(tile.mStartPosition, true);
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field SparseBooleanArray mLoadedTiles>
		//    2    4:aload_1         
		//    3    5:getfield        #60  <Field int TileList$Tile.mStartPosition>
		//    4    8:iconst_1        
		//    5    9:invokevirtual   #64  <Method void SparseBooleanArray.put(int, boolean)>
			mMainThreadProxy.addTile(mGeneration, tile);
		//    6   12:aload_0         
		//    7   13:getfield        #25  <Field AsyncListUtil this$0>
		//    8   16:getfield        #68  <Field ThreadUtil$MainThreadCallback AsyncListUtil.mMainThreadProxy>
		//    9   19:aload_0         
		//   10   20:getfield        #70  <Field int mGeneration>
		//   11   23:aload_1         
		//   12   24:invokeinterface #75  <Method void ThreadUtil$MainThreadCallback.addTile(int, TileList$Tile)>
		//   13   29:return          
		}

		private void flushTileCache(int j)
		{
			for(int k = mDataCallback.getMaxCachedTiles(); mLoadedTiles.size() >= k;)
		//*   0    0:aload_0         
		//*   1    1:getfield        #25  <Field AsyncListUtil this$0>
		//*   2    4:getfield        #82  <Field AsyncListUtil$DataCallback AsyncListUtil.mDataCallback>
		//*   3    7:invokevirtual   #88  <Method int AsyncListUtil$DataCallback.getMaxCachedTiles()>
		//*   4   10:istore_2        
		//*   5   11:aload_0         
		//*   6   12:getfield        #33  <Field SparseBooleanArray mLoadedTiles>
		//*   7   15:invokevirtual   #91  <Method int SparseBooleanArray.size()>
		//*   8   18:iload_2         
		//*   9   19:icmplt          120
			{
				int l = mLoadedTiles.keyAt(0);
		//   10   22:aload_0         
		//   11   23:getfield        #33  <Field SparseBooleanArray mLoadedTiles>
		//   12   26:iconst_0        
		//   13   27:invokevirtual   #95  <Method int SparseBooleanArray.keyAt(int)>
		//   14   30:istore_3        
				SparseBooleanArray sparsebooleanarray = mLoadedTiles;
		//   15   31:aload_0         
		//   16   32:getfield        #33  <Field SparseBooleanArray mLoadedTiles>
		//   17   35:astore          7
				int i1 = sparsebooleanarray.keyAt(sparsebooleanarray.size() - 1);
		//   18   37:aload           7
		//   19   39:aload           7
		//   20   41:invokevirtual   #91  <Method int SparseBooleanArray.size()>
		//   21   44:iconst_1        
		//   22   45:isub            
		//   23   46:invokevirtual   #95  <Method int SparseBooleanArray.keyAt(int)>
		//   24   49:istore          4
				int j1 = mFirstRequiredTileStart - l;
		//   25   51:aload_0         
		//   26   52:getfield        #97  <Field int mFirstRequiredTileStart>
		//   27   55:iload_3         
		//   28   56:isub            
		//   29   57:istore          5
				int k1 = i1 - mLastRequiredTileStart;
		//   30   59:iload           4
		//   31   61:aload_0         
		//   32   62:getfield        #99  <Field int mLastRequiredTileStart>
		//   33   65:isub            
		//   34   66:istore          6
				if(j1 > 0 && (j1 >= k1 || j == 2))
		//*  35   68:iload           5
		//*  36   70:ifle            93
		//*  37   73:iload           5
		//*  38   75:iload           6
		//*  39   77:icmpge          85
		//*  40   80:iload_1         
		//*  41   81:iconst_2        
		//*  42   82:icmpne          93
					removeTile(l);
		//   43   85:aload_0         
		//   44   86:iload_3         
		//   45   87:invokespecial   #102 <Method void removeTile(int)>
				else
		//*  46   90:goto            11
				if(k1 > 0 && (j1 < k1 || j == 1))
		//*  47   93:iload           6
		//*  48   95:ifle            119
		//*  49   98:iload           5
		//*  50  100:iload           6
		//*  51  102:icmplt          110
		//*  52  105:iload_1         
		//*  53  106:iconst_1        
		//*  54  107:icmpne          119
					removeTile(i1);
		//   55  110:aload_0         
		//   56  111:iload           4
		//   57  113:invokespecial   #102 <Method void removeTile(int)>
				else
		//*  58  116:goto            11
					return;
		//   59  119:return          
			}

		//   60  120:return          
		}

		private int getTileStart(int j)
		{
			return j - j % mTileSize;
		//    0    0:iload_1         
		//    1    1:iload_1         
		//    2    2:aload_0         
		//    3    3:getfield        #25  <Field AsyncListUtil this$0>
		//    4    6:getfield        #50  <Field int AsyncListUtil.mTileSize>
		//    5    9:irem            
		//    6   10:isub            
		//    7   11:ireturn         
		}

		private boolean isTileLoaded(int j)
		{
			return mLoadedTiles.get(j);
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field SparseBooleanArray mLoadedTiles>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #108 <Method boolean SparseBooleanArray.get(int)>
		//    4    8:ireturn         
		}

		private transient void log(String s, Object aobj[])
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #112 <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #113 <Method void StringBuilder()>
		//    3    7:astore_3        
			stringbuilder.append("[BKGR] ");
		//    4    8:aload_3         
		//    5    9:ldc1            #115 <String "[BKGR] ">
		//    6   11:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(String.format(s, aobj));
		//    8   15:aload_3         
		//    9   16:aload_1         
		//   10   17:aload_2         
		//   11   18:invokestatic    #125 <Method String String.format(String, Object[])>
		//   12   21:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
		//   13   24:pop             
			Log.d("AsyncListUtil", stringbuilder.toString());
		//   14   25:ldc1            #127 <String "AsyncListUtil">
		//   15   27:aload_3         
		//   16   28:invokevirtual   #131 <Method String StringBuilder.toString()>
		//   17   31:invokestatic    #137 <Method int Log.d(String, String)>
		//   18   34:pop             
		//   19   35:return          
		}

		private void removeTile(int j)
		{
			mLoadedTiles.delete(j);
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field SparseBooleanArray mLoadedTiles>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #140 <Method void SparseBooleanArray.delete(int)>
			mMainThreadProxy.removeTile(mGeneration, j);
		//    4    8:aload_0         
		//    5    9:getfield        #25  <Field AsyncListUtil this$0>
		//    6   12:getfield        #68  <Field ThreadUtil$MainThreadCallback AsyncListUtil.mMainThreadProxy>
		//    7   15:aload_0         
		//    8   16:getfield        #70  <Field int mGeneration>
		//    9   19:iload_1         
		//   10   20:invokeinterface #143 <Method void ThreadUtil$MainThreadCallback.removeTile(int, int)>
		//   11   25:return          
		}

		private void requestTiles(int j, int k, int l, boolean flag)
		{
			for(int i1 = j; i1 <= k; i1 += mTileSize)
		//*   0    0:iload_1         
		//*   1    1:istore          5
		//*   2    3:iload           5
		//*   3    5:iload_2         
		//*   4    6:icmpgt          59
			{
				int j1;
				if(flag)
		//*   5    9:iload           4
		//*   6   11:ifeq            25
					j1 = (k + j) - i1;
		//    7   14:iload_2         
		//    8   15:iload_1         
		//    9   16:iadd            
		//   10   17:iload           5
		//   11   19:isub            
		//   12   20:istore          6
				else
		//*  13   22:goto            29
					j1 = i1;
		//   14   25:iload           5
		//   15   27:istore          6
				mBackgroundProxy.loadTile(j1, l);
		//   16   29:aload_0         
		//   17   30:getfield        #25  <Field AsyncListUtil this$0>
		//   18   33:getfield        #149 <Field ThreadUtil$BackgroundCallback AsyncListUtil.mBackgroundProxy>
		//   19   36:iload           6
		//   20   38:iload_3         
		//   21   39:invokeinterface #152 <Method void ThreadUtil$BackgroundCallback.loadTile(int, int)>
			}

		//   22   44:iload           5
		//   23   46:aload_0         
		//   24   47:getfield        #25  <Field AsyncListUtil this$0>
		//   25   50:getfield        #50  <Field int AsyncListUtil.mTileSize>
		//   26   53:iadd            
		//   27   54:istore          5
		//*  28   56:goto            3
		//   29   59:return          
		}

		public void loadTile(int j, int k)
		{
			if(isTileLoaded(j))
		//*   0    0:aload_0         
		//*   1    1:iload_1         
		//*   2    2:invokespecial   #154 <Method boolean isTileLoaded(int)>
		//*   3    5:ifeq            9
			{
				return;
		//    4    8:return          
			} else
			{
				TileList.Tile tile = acquireTile();
		//    5    9:aload_0         
		//    6   10:invokespecial   #156 <Method TileList$Tile acquireTile()>
		//    7   13:astore_3        
				tile.mStartPosition = j;
		//    8   14:aload_3         
		//    9   15:iload_1         
		//   10   16:putfield        #60  <Field int TileList$Tile.mStartPosition>
				tile.mItemCount = Math.min(mTileSize, mItemCount - tile.mStartPosition);
		//   11   19:aload_3         
		//   12   20:aload_0         
		//   13   21:getfield        #25  <Field AsyncListUtil this$0>
		//   14   24:getfield        #50  <Field int AsyncListUtil.mTileSize>
		//   15   27:aload_0         
		//   16   28:getfield        #158 <Field int mItemCount>
		//   17   31:aload_3         
		//   18   32:getfield        #60  <Field int TileList$Tile.mStartPosition>
		//   19   35:isub            
		//   20   36:invokestatic    #164 <Method int Math.min(int, int)>
		//   21   39:putfield        #165 <Field int TileList$Tile.mItemCount>
				mDataCallback.fillData(tile.mItems, tile.mStartPosition, tile.mItemCount);
		//   22   42:aload_0         
		//   23   43:getfield        #25  <Field AsyncListUtil this$0>
		//   24   46:getfield        #82  <Field AsyncListUtil$DataCallback AsyncListUtil.mDataCallback>
		//   25   49:aload_3         
		//   26   50:getfield        #169 <Field Object[] TileList$Tile.mItems>
		//   27   53:aload_3         
		//   28   54:getfield        #60  <Field int TileList$Tile.mStartPosition>
		//   29   57:aload_3         
		//   30   58:getfield        #165 <Field int TileList$Tile.mItemCount>
		//   31   61:invokevirtual   #173 <Method void AsyncListUtil$DataCallback.fillData(Object[], int, int)>
				flushTileCache(k);
		//   32   64:aload_0         
		//   33   65:iload_2         
		//   34   66:invokespecial   #175 <Method void flushTileCache(int)>
				addTile(tile);
		//   35   69:aload_0         
		//   36   70:aload_3         
		//   37   71:invokespecial   #177 <Method void addTile(TileList$Tile)>
				return;
		//   38   74:return          
			}
		}

		public void recycleTile(TileList.Tile tile)
		{
			mDataCallback.recycleData(tile.mItems, tile.mItemCount);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field AsyncListUtil this$0>
		//    2    4:getfield        #82  <Field AsyncListUtil$DataCallback AsyncListUtil.mDataCallback>
		//    3    7:aload_1         
		//    4    8:getfield        #169 <Field Object[] TileList$Tile.mItems>
		//    5   11:aload_1         
		//    6   12:getfield        #165 <Field int TileList$Tile.mItemCount>
		//    7   15:invokevirtual   #182 <Method void AsyncListUtil$DataCallback.recycleData(Object[], int)>
			tile.mNext = mRecycledRoot;
		//    8   18:aload_1         
		//    9   19:aload_0         
		//   10   20:getfield        #38  <Field TileList$Tile mRecycledRoot>
		//   11   23:putfield        #43  <Field TileList$Tile TileList$Tile.mNext>
			mRecycledRoot = tile;
		//   12   26:aload_0         
		//   13   27:aload_1         
		//   14   28:putfield        #38  <Field TileList$Tile mRecycledRoot>
		//   15   31:return          
		}

		public void refresh(int j)
		{
			mGeneration = j;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #70  <Field int mGeneration>
			mLoadedTiles.clear();
		//    3    5:aload_0         
		//    4    6:getfield        #33  <Field SparseBooleanArray mLoadedTiles>
		//    5    9:invokevirtual   #186 <Method void SparseBooleanArray.clear()>
			mItemCount = mDataCallback.refreshData();
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #25  <Field AsyncListUtil this$0>
		//    9   17:getfield        #82  <Field AsyncListUtil$DataCallback AsyncListUtil.mDataCallback>
		//   10   20:invokevirtual   #189 <Method int AsyncListUtil$DataCallback.refreshData()>
		//   11   23:putfield        #158 <Field int mItemCount>
			mMainThreadProxy.updateItemCount(mGeneration, mItemCount);
		//   12   26:aload_0         
		//   13   27:getfield        #25  <Field AsyncListUtil this$0>
		//   14   30:getfield        #68  <Field ThreadUtil$MainThreadCallback AsyncListUtil.mMainThreadProxy>
		//   15   33:aload_0         
		//   16   34:getfield        #70  <Field int mGeneration>
		//   17   37:aload_0         
		//   18   38:getfield        #158 <Field int mItemCount>
		//   19   41:invokeinterface #192 <Method void ThreadUtil$MainThreadCallback.updateItemCount(int, int)>
		//   20   46:return          
		}

		public void updateRange(int j, int k, int l, int i1, int j1)
		{
			if(j > k)
		//*   0    0:iload_1         
		//*   1    1:iload_2         
		//*   2    2:icmple          6
				return;
		//    3    5:return          
			j = getTileStart(j);
		//    4    6:aload_0         
		//    5    7:iload_1         
		//    6    8:invokespecial   #196 <Method int getTileStart(int)>
		//    7   11:istore_1        
			k = getTileStart(k);
		//    8   12:aload_0         
		//    9   13:iload_2         
		//   10   14:invokespecial   #196 <Method int getTileStart(int)>
		//   11   17:istore_2        
			mFirstRequiredTileStart = getTileStart(l);
		//   12   18:aload_0         
		//   13   19:aload_0         
		//   14   20:iload_3         
		//   15   21:invokespecial   #196 <Method int getTileStart(int)>
		//   16   24:putfield        #97  <Field int mFirstRequiredTileStart>
			mLastRequiredTileStart = getTileStart(i1);
		//   17   27:aload_0         
		//   18   28:aload_0         
		//   19   29:iload           4
		//   20   31:invokespecial   #196 <Method int getTileStart(int)>
		//   21   34:putfield        #99  <Field int mLastRequiredTileStart>
			if(j1 == 1)
		//*  22   37:iload           5
		//*  23   39:iconst_1        
		//*  24   40:icmpne          76
			{
				requestTiles(mFirstRequiredTileStart, k, j1, true);
		//   25   43:aload_0         
		//   26   44:aload_0         
		//   27   45:getfield        #97  <Field int mFirstRequiredTileStart>
		//   28   48:iload_2         
		//   29   49:iload           5
		//   30   51:iconst_1        
		//   31   52:invokespecial   #198 <Method void requestTiles(int, int, int, boolean)>
				requestTiles(k + mTileSize, mLastRequiredTileStart, j1, false);
		//   32   55:aload_0         
		//   33   56:iload_2         
		//   34   57:aload_0         
		//   35   58:getfield        #25  <Field AsyncListUtil this$0>
		//   36   61:getfield        #50  <Field int AsyncListUtil.mTileSize>
		//   37   64:iadd            
		//   38   65:aload_0         
		//   39   66:getfield        #99  <Field int mLastRequiredTileStart>
		//   40   69:iload           5
		//   41   71:iconst_0        
		//   42   72:invokespecial   #198 <Method void requestTiles(int, int, int, boolean)>
				return;
		//   43   75:return          
			} else
			{
				requestTiles(j, mLastRequiredTileStart, j1, false);
		//   44   76:aload_0         
		//   45   77:iload_1         
		//   46   78:aload_0         
		//   47   79:getfield        #99  <Field int mLastRequiredTileStart>
		//   48   82:iload           5
		//   49   84:iconst_0        
		//   50   85:invokespecial   #198 <Method void requestTiles(int, int, int, boolean)>
				requestTiles(mFirstRequiredTileStart, j - mTileSize, j1, true);
		//   51   88:aload_0         
		//   52   89:aload_0         
		//   53   90:getfield        #97  <Field int mFirstRequiredTileStart>
		//   54   93:iload_1         
		//   55   94:aload_0         
		//   56   95:getfield        #25  <Field AsyncListUtil this$0>
		//   57   98:getfield        #50  <Field int AsyncListUtil.mTileSize>
		//   58  101:isub            
		//   59  102:iload           5
		//   60  104:iconst_1        
		//   61  105:invokespecial   #198 <Method void requestTiles(int, int, int, boolean)>
				return;
		//   62  108:return          
			}
		}

		private int mFirstRequiredTileStart;
		private int mGeneration;
		private int mItemCount;
		private int mLastRequiredTileStart;
		final SparseBooleanArray mLoadedTiles = new SparseBooleanArray();
		private TileList.Tile mRecycledRoot;
		final AsyncListUtil this$0;

			
			{
				this$0 = AsyncListUtil.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field AsyncListUtil this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #28  <Method void Object()>
			//    5    9:aload_0         
			//    6   10:new             #30  <Class SparseBooleanArray>
			//    7   13:dup             
			//    8   14:invokespecial   #31  <Method void SparseBooleanArray()>
			//    9   17:putfield        #33  <Field SparseBooleanArray mLoadedTiles>
			//   10   20:return          
			}
	}
;
	final ThreadUtil.BackgroundCallback mBackgroundProxy;
	final DataCallback mDataCallback;
	int mDisplayedGeneration;
	int mItemCount;
	private final ThreadUtil.MainThreadCallback mMainThreadCallback = new ThreadUtil.MainThreadCallback() {

		private boolean isRequestedGeneration(int j)
		{
			return j == mRequestedGeneration;
		//    0    0:iload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #15  <Field AsyncListUtil this$0>
		//    3    5:getfield        #25  <Field int AsyncListUtil.mRequestedGeneration>
		//    4    8:icmpne          13
		//    5   11:iconst_1        
		//    6   12:ireturn         
		//    7   13:iconst_0        
		//    8   14:ireturn         
		}

		private void recycleAllTiles()
		{
			for(int j = 0; j < mTileList.size(); j++)
		//*   0    0:iconst_0        
		//*   1    1:istore_1        
		//*   2    2:iload_1         
		//*   3    3:aload_0         
		//*   4    4:getfield        #15  <Field AsyncListUtil this$0>
		//*   5    7:getfield        #30  <Field TileList AsyncListUtil.mTileList>
		//*   6   10:invokevirtual   #36  <Method int TileList.size()>
		//*   7   13:icmpge          46
				mBackgroundProxy.recycleTile(mTileList.getAtIndex(j));
		//    8   16:aload_0         
		//    9   17:getfield        #15  <Field AsyncListUtil this$0>
		//   10   20:getfield        #40  <Field ThreadUtil$BackgroundCallback AsyncListUtil.mBackgroundProxy>
		//   11   23:aload_0         
		//   12   24:getfield        #15  <Field AsyncListUtil this$0>
		//   13   27:getfield        #30  <Field TileList AsyncListUtil.mTileList>
		//   14   30:iload_1         
		//   15   31:invokevirtual   #44  <Method TileList$Tile TileList.getAtIndex(int)>
		//   16   34:invokeinterface #50  <Method void ThreadUtil$BackgroundCallback.recycleTile(TileList$Tile)>

		//   17   39:iload_1         
		//   18   40:iconst_1        
		//   19   41:iadd            
		//   20   42:istore_1        
		//*  21   43:goto            2
			mTileList.clear();
		//   22   46:aload_0         
		//   23   47:getfield        #15  <Field AsyncListUtil this$0>
		//   24   50:getfield        #30  <Field TileList AsyncListUtil.mTileList>
		//   25   53:invokevirtual   #53  <Method void TileList.clear()>
		//   26   56:return          
		}

		public void addTile(int j, TileList.Tile tile)
		{
			if(!isRequestedGeneration(j))
		//*   0    0:aload_0         
		//*   1    1:iload_1         
		//*   2    2:invokespecial   #57  <Method boolean isRequestedGeneration(int)>
		//*   3    5:ifne            22
			{
				mBackgroundProxy.recycleTile(tile);
		//    4    8:aload_0         
		//    5    9:getfield        #15  <Field AsyncListUtil this$0>
		//    6   12:getfield        #40  <Field ThreadUtil$BackgroundCallback AsyncListUtil.mBackgroundProxy>
		//    7   15:aload_2         
		//    8   16:invokeinterface #50  <Method void ThreadUtil$BackgroundCallback.recycleTile(TileList$Tile)>
				return;
		//    9   21:return          
			}
			TileList.Tile tile1 = mTileList.addOrReplace(tile);
		//   10   22:aload_0         
		//   11   23:getfield        #15  <Field AsyncListUtil this$0>
		//   12   26:getfield        #30  <Field TileList AsyncListUtil.mTileList>
		//   13   29:aload_2         
		//   14   30:invokevirtual   #61  <Method TileList$Tile TileList.addOrReplace(TileList$Tile)>
		//   15   33:astore          6
			if(tile1 != null)
		//*  16   35:aload           6
		//*  17   37:ifnull          93
			{
				StringBuilder stringbuilder = new StringBuilder();
		//   18   40:new             #63  <Class StringBuilder>
		//   19   43:dup             
		//   20   44:invokespecial   #64  <Method void StringBuilder()>
		//   21   47:astore          7
				stringbuilder.append("duplicate tile @");
		//   22   49:aload           7
		//   23   51:ldc1            #66  <String "duplicate tile @">
		//   24   53:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
		//   25   56:pop             
				stringbuilder.append(tile1.mStartPosition);
		//   26   57:aload           7
		//   27   59:aload           6
		//   28   61:getfield        #75  <Field int TileList$Tile.mStartPosition>
		//   29   64:invokevirtual   #78  <Method StringBuilder StringBuilder.append(int)>
		//   30   67:pop             
				Log.e("AsyncListUtil", stringbuilder.toString());
		//   31   68:ldc1            #80  <String "AsyncListUtil">
		//   32   70:aload           7
		//   33   72:invokevirtual   #84  <Method String StringBuilder.toString()>
		//   34   75:invokestatic    #90  <Method int Log.e(String, String)>
		//   35   78:pop             
				mBackgroundProxy.recycleTile(tile1);
		//   36   79:aload_0         
		//   37   80:getfield        #15  <Field AsyncListUtil this$0>
		//   38   83:getfield        #40  <Field ThreadUtil$BackgroundCallback AsyncListUtil.mBackgroundProxy>
		//   39   86:aload           6
		//   40   88:invokeinterface #50  <Method void ThreadUtil$BackgroundCallback.recycleTile(TileList$Tile)>
			}
			int k = tile.mStartPosition;
		//   41   93:aload_2         
		//   42   94:getfield        #75  <Field int TileList$Tile.mStartPosition>
		//   43   97:istore_3        
			int l = tile.mItemCount;
		//   44   98:aload_2         
		//   45   99:getfield        #93  <Field int TileList$Tile.mItemCount>
		//   46  102:istore          4
			for(j = 0; j < mMissingPositions.size();)
		//*  47  104:iconst_0        
		//*  48  105:istore_1        
		//*  49  106:iload_1         
		//*  50  107:aload_0         
		//*  51  108:getfield        #15  <Field AsyncListUtil this$0>
		//*  52  111:getfield        #97  <Field SparseIntArray AsyncListUtil.mMissingPositions>
		//*  53  114:invokevirtual   #100 <Method int SparseIntArray.size()>
		//*  54  117:icmpge          184
			{
				int i1 = mMissingPositions.keyAt(j);
		//   55  120:aload_0         
		//   56  121:getfield        #15  <Field AsyncListUtil this$0>
		//   57  124:getfield        #97  <Field SparseIntArray AsyncListUtil.mMissingPositions>
		//   58  127:iload_1         
		//   59  128:invokevirtual   #104 <Method int SparseIntArray.keyAt(int)>
		//   60  131:istore          5
				if(tile.mStartPosition <= i1 && i1 < k + l)
		//*  61  133:aload_2         
		//*  62  134:getfield        #75  <Field int TileList$Tile.mStartPosition>
		//*  63  137:iload           5
		//*  64  139:icmpgt          177
		//*  65  142:iload           5
		//*  66  144:iload_3         
		//*  67  145:iload           4
		//*  68  147:iadd            
		//*  69  148:icmpge          177
				{
					mMissingPositions.removeAt(j);
		//   70  151:aload_0         
		//   71  152:getfield        #15  <Field AsyncListUtil this$0>
		//   72  155:getfield        #97  <Field SparseIntArray AsyncListUtil.mMissingPositions>
		//   73  158:iload_1         
		//   74  159:invokevirtual   #108 <Method void SparseIntArray.removeAt(int)>
					mViewCallback.onItemLoaded(i1);
		//   75  162:aload_0         
		//   76  163:getfield        #15  <Field AsyncListUtil this$0>
		//   77  166:getfield        #112 <Field AsyncListUtil$ViewCallback AsyncListUtil.mViewCallback>
		//   78  169:iload           5
		//   79  171:invokevirtual   #117 <Method void AsyncListUtil$ViewCallback.onItemLoaded(int)>
				} else
		//*  80  174:goto            106
				{
					j++;
		//   81  177:iload_1         
		//   82  178:iconst_1        
		//   83  179:iadd            
		//   84  180:istore_1        
				}
			}

		//*  85  181:goto            106
		//   86  184:return          
		}

		public void removeTile(int j, int k)
		{
			if(!isRequestedGeneration(j))
		//*   0    0:aload_0         
		//*   1    1:iload_1         
		//*   2    2:invokespecial   #57  <Method boolean isRequestedGeneration(int)>
		//*   3    5:ifne            9
				return;
		//    4    8:return          
			Object obj = ((Object) (mTileList.removeAtPos(k)));
		//    5    9:aload_0         
		//    6   10:getfield        #15  <Field AsyncListUtil this$0>
		//    7   13:getfield        #30  <Field TileList AsyncListUtil.mTileList>
		//    8   16:iload_2         
		//    9   17:invokevirtual   #124 <Method TileList$Tile TileList.removeAtPos(int)>
		//   10   20:astore_3        
			if(obj == null)
		//*  11   21:aload_3         
		//*  12   22:ifnonnull       57
			{
				obj = ((Object) (new StringBuilder()));
		//   13   25:new             #63  <Class StringBuilder>
		//   14   28:dup             
		//   15   29:invokespecial   #64  <Method void StringBuilder()>
		//   16   32:astore_3        
				((StringBuilder) (obj)).append("tile not found @");
		//   17   33:aload_3         
		//   18   34:ldc1            #126 <String "tile not found @">
		//   19   36:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
		//   20   39:pop             
				((StringBuilder) (obj)).append(k);
		//   21   40:aload_3         
		//   22   41:iload_2         
		//   23   42:invokevirtual   #78  <Method StringBuilder StringBuilder.append(int)>
		//   24   45:pop             
				Log.e("AsyncListUtil", ((StringBuilder) (obj)).toString());
		//   25   46:ldc1            #80  <String "AsyncListUtil">
		//   26   48:aload_3         
		//   27   49:invokevirtual   #84  <Method String StringBuilder.toString()>
		//   28   52:invokestatic    #90  <Method int Log.e(String, String)>
		//   29   55:pop             
				return;
		//   30   56:return          
			} else
			{
				mBackgroundProxy.recycleTile(((TileList.Tile) (obj)));
		//   31   57:aload_0         
		//   32   58:getfield        #15  <Field AsyncListUtil this$0>
		//   33   61:getfield        #40  <Field ThreadUtil$BackgroundCallback AsyncListUtil.mBackgroundProxy>
		//   34   64:aload_3         
		//   35   65:invokeinterface #50  <Method void ThreadUtil$BackgroundCallback.recycleTile(TileList$Tile)>
				return;
		//   36   70:return          
			}
		}

		public void updateItemCount(int j, int k)
		{
			if(!isRequestedGeneration(j))
		//*   0    0:aload_0         
		//*   1    1:iload_1         
		//*   2    2:invokespecial   #57  <Method boolean isRequestedGeneration(int)>
		//*   3    5:ifne            9
			{
				return;
		//    4    8:return          
			} else
			{
				AsyncListUtil asynclistutil = AsyncListUtil.this;
		//    5    9:aload_0         
		//    6   10:getfield        #15  <Field AsyncListUtil this$0>
		//    7   13:astore_3        
				asynclistutil.mItemCount = k;
		//    8   14:aload_3         
		//    9   15:iload_2         
		//   10   16:putfield        #128 <Field int AsyncListUtil.mItemCount>
				asynclistutil.mViewCallback.onDataRefresh();
		//   11   19:aload_3         
		//   12   20:getfield        #112 <Field AsyncListUtil$ViewCallback AsyncListUtil.mViewCallback>
		//   13   23:invokevirtual   #131 <Method void AsyncListUtil$ViewCallback.onDataRefresh()>
				asynclistutil = AsyncListUtil.this;
		//   14   26:aload_0         
		//   15   27:getfield        #15  <Field AsyncListUtil this$0>
		//   16   30:astore_3        
				asynclistutil.mDisplayedGeneration = asynclistutil.mRequestedGeneration;
		//   17   31:aload_3         
		//   18   32:aload_3         
		//   19   33:getfield        #25  <Field int AsyncListUtil.mRequestedGeneration>
		//   20   36:putfield        #134 <Field int AsyncListUtil.mDisplayedGeneration>
				recycleAllTiles();
		//   21   39:aload_0         
		//   22   40:invokespecial   #136 <Method void recycleAllTiles()>
				asynclistutil = AsyncListUtil.this;
		//   23   43:aload_0         
		//   24   44:getfield        #15  <Field AsyncListUtil this$0>
		//   25   47:astore_3        
				asynclistutil.mAllowScrollHints = false;
		//   26   48:aload_3         
		//   27   49:iconst_0        
		//   28   50:putfield        #140 <Field boolean AsyncListUtil.mAllowScrollHints>
				asynclistutil.updateRange();
		//   29   53:aload_3         
		//   30   54:invokevirtual   #143 <Method void AsyncListUtil.updateRange()>
				return;
		//   31   57:return          
			}
		}

		final AsyncListUtil this$0;

			
			{
				this$0 = AsyncListUtil.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AsyncListUtil this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
	}
;
	final ThreadUtil.MainThreadCallback mMainThreadProxy;
	final SparseIntArray mMissingPositions = new SparseIntArray();
	final int mPrevRange[] = new int[2];
	int mRequestedGeneration;
	private int mScrollHint;
	final Class mTClass;
	final TileList mTileList;
	final int mTileSize;
	final int mTmpRange[] = new int[2];
	final int mTmpRangeExtended[] = new int[2];
	final ViewCallback mViewCallback;
}
