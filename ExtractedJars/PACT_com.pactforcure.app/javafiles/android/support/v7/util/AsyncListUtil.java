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
		//*  20   24:icmpne          58
				l = j;
		//   21   27:iload           4
		//   22   29:istore          6
			else
		//*  23   31:aload_2         
		//*  24   32:iconst_0        
		//*  25   33:iload           7
		//*  26   35:iload           6
		//*  27   37:isub            
		//*  28   38:iastore         
		//*  29   39:aload_1         
		//*  30   40:iconst_1        
		//*  31   41:iaload          
		//*  32   42:istore          6
		//*  33   44:iload_3         
		//*  34   45:iconst_2        
		//*  35   46:icmpne          65
		//*  36   49:aload_2         
		//*  37   50:iconst_1        
		//*  38   51:iload           6
		//*  39   53:iload           4
		//*  40   55:iadd            
		//*  41   56:iastore         
		//*  42   57:return          
				l = k;
		//   43   58:iload           5
		//   44   60:istore          6
			ai1[0] = i1 - l;
			l = ai[1];
			if(i != 2)
		//*  45   62:goto            31
				j = k;
		//   46   65:iload           5
		//   47   67:istore          4
			ai1[1] = l + j;
		//*  48   69:goto            49
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
	//    1    1:invokespecial   #59  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:newarray        int[]
	//    5    8:putfield        #61  <Field int[] mTmpRange>
	//    6   11:aload_0         
	//    7   12:iconst_2        
	//    8   13:newarray        int[]
	//    9   15:putfield        #63  <Field int[] mPrevRange>
	//   10   18:aload_0         
	//   11   19:iconst_2        
	//   12   20:newarray        int[]
	//   13   22:putfield        #65  <Field int[] mTmpRangeExtended>
		mScrollHint = 0;
	//   14   25:aload_0         
	//   15   26:iconst_0        
	//   16   27:putfield        #67  <Field int mScrollHint>
		mItemCount = 0;
	//   17   30:aload_0         
	//   18   31:iconst_0        
	//   19   32:putfield        #69  <Field int mItemCount>
		mDisplayedGeneration = 0;
	//   20   35:aload_0         
	//   21   36:iconst_0        
	//   22   37:putfield        #71  <Field int mDisplayedGeneration>
		mRequestedGeneration = mDisplayedGeneration;
	//   23   40:aload_0         
	//   24   41:aload_0         
	//   25   42:getfield        #71  <Field int mDisplayedGeneration>
	//   26   45:putfield        #73  <Field int mRequestedGeneration>
	//   27   48:aload_0         
	//   28   49:new             #75  <Class SparseIntArray>
	//   29   52:dup             
	//   30   53:invokespecial   #76  <Method void SparseIntArray()>
	//   31   56:putfield        #78  <Field SparseIntArray mMissingPositions>
	//   32   59:aload_0         
	//   33   60:new             #7   <Class AsyncListUtil$1>
	//   34   63:dup             
	//   35   64:aload_0         
	//   36   65:invokespecial   #81  <Method void AsyncListUtil$1(AsyncListUtil)>
	//   37   68:putfield        #83  <Field ThreadUtil$MainThreadCallback mMainThreadCallback>
	//   38   71:aload_0         
	//   39   72:new             #9   <Class AsyncListUtil$2>
	//   40   75:dup             
	//   41   76:aload_0         
	//   42   77:invokespecial   #84  <Method void AsyncListUtil$2(AsyncListUtil)>
	//   43   80:putfield        #86  <Field ThreadUtil$BackgroundCallback mBackgroundCallback>
		mTClass = class1;
	//   44   83:aload_0         
	//   45   84:aload_1         
	//   46   85:putfield        #88  <Field Class mTClass>
		mTileSize = i;
	//   47   88:aload_0         
	//   48   89:iload_2         
	//   49   90:putfield        #90  <Field int mTileSize>
		mDataCallback = datacallback;
	//   50   93:aload_0         
	//   51   94:aload_3         
	//   52   95:putfield        #92  <Field AsyncListUtil$DataCallback mDataCallback>
		mViewCallback = viewcallback;
	//   53   98:aload_0         
	//   54   99:aload           4
	//   55  101:putfield        #94  <Field AsyncListUtil$ViewCallback mViewCallback>
		mTileList = new TileList(mTileSize);
	//   56  104:aload_0         
	//   57  105:new             #96  <Class TileList>
	//   58  108:dup             
	//   59  109:aload_0         
	//   60  110:getfield        #90  <Field int mTileSize>
	//   61  113:invokespecial   #99  <Method void TileList(int)>
	//   62  116:putfield        #101 <Field TileList mTileList>
		class1 = ((Class) (new MessageThreadUtil()));
	//   63  119:new             #103 <Class MessageThreadUtil>
	//   64  122:dup             
	//   65  123:invokespecial   #104 <Method void MessageThreadUtil()>
	//   66  126:astore_1        
		mMainThreadProxy = ((ThreadUtil) (class1)).getMainThreadProxy(mMainThreadCallback);
	//   67  127:aload_0         
	//   68  128:aload_1         
	//   69  129:aload_0         
	//   70  130:getfield        #83  <Field ThreadUtil$MainThreadCallback mMainThreadCallback>
	//   71  133:invokeinterface #110 <Method ThreadUtil$MainThreadCallback ThreadUtil.getMainThreadProxy(ThreadUtil$MainThreadCallback)>
	//   72  138:putfield        #112 <Field ThreadUtil$MainThreadCallback mMainThreadProxy>
		mBackgroundProxy = ((ThreadUtil) (class1)).getBackgroundProxy(mBackgroundCallback);
	//   73  141:aload_0         
	//   74  142:aload_1         
	//   75  143:aload_0         
	//   76  144:getfield        #86  <Field ThreadUtil$BackgroundCallback mBackgroundCallback>
	//   77  147:invokeinterface #116 <Method ThreadUtil$BackgroundCallback ThreadUtil.getBackgroundProxy(ThreadUtil$BackgroundCallback)>
	//   78  152:putfield        #118 <Field ThreadUtil$BackgroundCallback mBackgroundProxy>
		refresh();
	//   79  155:aload_0         
	//   80  156:invokevirtual   #121 <Method void refresh()>
	//   81  159:return          
	}

	private boolean isRefreshPending()
	{
		return mRequestedGeneration != mDisplayedGeneration;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field int mRequestedGeneration>
	//    2    4:aload_0         
	//    3    5:getfield        #71  <Field int mDisplayedGeneration>
	//    4    8:icmpeq          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public Object getItem(int i)
	{
		if(i < 0 || i >= mItemCount)
	//*   0    0:iload_1         
	//*   1    1:iflt            12
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #69  <Field int mItemCount>
	//*   5    9:icmplt          46
			throw new IndexOutOfBoundsException((new StringBuilder()).append(i).append(" is not within 0 and ").append(mItemCount).toString());
	//    6   12:new             #130 <Class IndexOutOfBoundsException>
	//    7   15:dup             
	//    8   16:new             #132 <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #133 <Method void StringBuilder()>
	//   11   23:iload_1         
	//   12   24:invokevirtual   #137 <Method StringBuilder StringBuilder.append(int)>
	//   13   27:ldc1            #139 <String " is not within 0 and ">
	//   14   29:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   15   32:aload_0         
	//   16   33:getfield        #69  <Field int mItemCount>
	//   17   36:invokevirtual   #137 <Method StringBuilder StringBuilder.append(int)>
	//   18   39:invokevirtual   #146 <Method String StringBuilder.toString()>
	//   19   42:invokespecial   #149 <Method void IndexOutOfBoundsException(String)>
	//   20   45:athrow          
		Object obj = mTileList.getItemAt(i);
	//   21   46:aload_0         
	//   22   47:getfield        #101 <Field TileList mTileList>
	//   23   50:iload_1         
	//   24   51:invokevirtual   #152 <Method Object TileList.getItemAt(int)>
	//   25   54:astore_2        
		if(obj == null && !isRefreshPending())
	//*  26   55:aload_2         
	//*  27   56:ifnonnull       75
	//*  28   59:aload_0         
	//*  29   60:invokespecial   #154 <Method boolean isRefreshPending()>
	//*  30   63:ifne            75
			mMissingPositions.put(i, 0);
	//   31   66:aload_0         
	//   32   67:getfield        #78  <Field SparseIntArray mMissingPositions>
	//   33   70:iload_1         
	//   34   71:iconst_0        
	//   35   72:invokevirtual   #158 <Method void SparseIntArray.put(int, int)>
		return obj;
	//   36   75:aload_2         
	//   37   76:areturn         
	}

	public int getItemCount()
	{
		return mItemCount;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int mItemCount>
	//    2    4:ireturn         
	}

	transient void log(String s, Object aobj[])
	{
		Log.d("AsyncListUtil", (new StringBuilder()).append("[MAIN] ").append(String.format(s, aobj)).toString());
	//    0    0:ldc1            #22  <String "AsyncListUtil">
	//    1    2:new             #132 <Class StringBuilder>
	//    2    5:dup             
	//    3    6:invokespecial   #133 <Method void StringBuilder()>
	//    4    9:ldc1            #165 <String "[MAIN] ">
	//    5   11:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:aload_1         
	//    7   15:aload_2         
	//    8   16:invokestatic    #171 <Method String String.format(String, Object[])>
	//    9   19:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:invokevirtual   #146 <Method String StringBuilder.toString()>
	//   11   25:invokestatic    #177 <Method int Log.d(String, String)>
	//   12   28:pop             
	//   13   29:return          
	}

	public void onRangeChanged()
	{
		if(isRefreshPending())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #154 <Method boolean isRefreshPending()>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			updateRange();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #181 <Method void updateRange()>
			mAllowScrollHints = true;
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:putfield        #183 <Field boolean mAllowScrollHints>
			return;
	//    9   17:return          
		}
	}

	public void refresh()
	{
		mMissingPositions.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field SparseIntArray mMissingPositions>
	//    2    4:invokevirtual   #186 <Method void SparseIntArray.clear()>
		ThreadUtil.BackgroundCallback backgroundcallback = mBackgroundProxy;
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field ThreadUtil$BackgroundCallback mBackgroundProxy>
	//    5   11:astore_2        
		int i = mRequestedGeneration + 1;
	//    6   12:aload_0         
	//    7   13:getfield        #73  <Field int mRequestedGeneration>
	//    8   16:iconst_1        
	//    9   17:iadd            
	//   10   18:istore_1        
		mRequestedGeneration = i;
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:putfield        #73  <Field int mRequestedGeneration>
		backgroundcallback.refresh(i);
	//   14   24:aload_2         
	//   15   25:iload_1         
	//   16   26:invokeinterface #190 <Method void ThreadUtil$BackgroundCallback.refresh(int)>
	//   17   31:return          
	}

	void updateRange()
	{
		mViewCallback.getItemRangeInto(mTmpRange);
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field AsyncListUtil$ViewCallback mViewCallback>
	//    2    4:aload_0         
	//    3    5:getfield        #61  <Field int[] mTmpRange>
	//    4    8:invokevirtual   #194 <Method void AsyncListUtil$ViewCallback.getItemRangeInto(int[])>
		while(mTmpRange[0] > mTmpRange[1] || mTmpRange[0] < 0 || mTmpRange[1] >= mItemCount) 
	//*   5   11:aload_0         
	//*   6   12:getfield        #61  <Field int[] mTmpRange>
	//*   7   15:iconst_0        
	//*   8   16:iaload          
	//*   9   17:aload_0         
	//*  10   18:getfield        #61  <Field int[] mTmpRange>
	//*  11   21:iconst_1        
	//*  12   22:iaload          
	//*  13   23:icmpgt          35
	//*  14   26:aload_0         
	//*  15   27:getfield        #61  <Field int[] mTmpRange>
	//*  16   30:iconst_0        
	//*  17   31:iaload          
	//*  18   32:ifge            36
			return;
	//   19   35:return          
	//   20   36:aload_0         
	//   21   37:getfield        #61  <Field int[] mTmpRange>
	//   22   40:iconst_1        
	//   23   41:iaload          
	//   24   42:aload_0         
	//   25   43:getfield        #69  <Field int mItemCount>
	//   26   46:icmpge          35
		if(mAllowScrollHints) goto _L2; else goto _L1
	//   27   49:aload_0         
	//   28   50:getfield        #183 <Field boolean mAllowScrollHints>
	//   29   53:ifne            197
_L1:
		mScrollHint = 0;
	//   30   56:aload_0         
	//   31   57:iconst_0        
	//   32   58:putfield        #67  <Field int mScrollHint>
_L4:
		mPrevRange[0] = mTmpRange[0];
	//   33   61:aload_0         
	//   34   62:getfield        #63  <Field int[] mPrevRange>
	//   35   65:iconst_0        
	//   36   66:aload_0         
	//   37   67:getfield        #61  <Field int[] mTmpRange>
	//   38   70:iconst_0        
	//   39   71:iaload          
	//   40   72:iastore         
		mPrevRange[1] = mTmpRange[1];
	//   41   73:aload_0         
	//   42   74:getfield        #63  <Field int[] mPrevRange>
	//   43   77:iconst_1        
	//   44   78:aload_0         
	//   45   79:getfield        #61  <Field int[] mTmpRange>
	//   46   82:iconst_1        
	//   47   83:iaload          
	//   48   84:iastore         
		mViewCallback.extendRangeInto(mTmpRange, mTmpRangeExtended, mScrollHint);
	//   49   85:aload_0         
	//   50   86:getfield        #94  <Field AsyncListUtil$ViewCallback mViewCallback>
	//   51   89:aload_0         
	//   52   90:getfield        #61  <Field int[] mTmpRange>
	//   53   93:aload_0         
	//   54   94:getfield        #65  <Field int[] mTmpRangeExtended>
	//   55   97:aload_0         
	//   56   98:getfield        #67  <Field int mScrollHint>
	//   57  101:invokevirtual   #198 <Method void AsyncListUtil$ViewCallback.extendRangeInto(int[], int[], int)>
		mTmpRangeExtended[0] = Math.min(mTmpRange[0], Math.max(mTmpRangeExtended[0], 0));
	//   58  104:aload_0         
	//   59  105:getfield        #65  <Field int[] mTmpRangeExtended>
	//   60  108:iconst_0        
	//   61  109:aload_0         
	//   62  110:getfield        #61  <Field int[] mTmpRange>
	//   63  113:iconst_0        
	//   64  114:iaload          
	//   65  115:aload_0         
	//   66  116:getfield        #65  <Field int[] mTmpRangeExtended>
	//   67  119:iconst_0        
	//   68  120:iaload          
	//   69  121:iconst_0        
	//   70  122:invokestatic    #204 <Method int Math.max(int, int)>
	//   71  125:invokestatic    #207 <Method int Math.min(int, int)>
	//   72  128:iastore         
		mTmpRangeExtended[1] = Math.max(mTmpRange[1], Math.min(mTmpRangeExtended[1], mItemCount - 1));
	//   73  129:aload_0         
	//   74  130:getfield        #65  <Field int[] mTmpRangeExtended>
	//   75  133:iconst_1        
	//   76  134:aload_0         
	//   77  135:getfield        #61  <Field int[] mTmpRange>
	//   78  138:iconst_1        
	//   79  139:iaload          
	//   80  140:aload_0         
	//   81  141:getfield        #65  <Field int[] mTmpRangeExtended>
	//   82  144:iconst_1        
	//   83  145:iaload          
	//   84  146:aload_0         
	//   85  147:getfield        #69  <Field int mItemCount>
	//   86  150:iconst_1        
	//   87  151:isub            
	//   88  152:invokestatic    #207 <Method int Math.min(int, int)>
	//   89  155:invokestatic    #204 <Method int Math.max(int, int)>
	//   90  158:iastore         
		mBackgroundProxy.updateRange(mTmpRange[0], mTmpRange[1], mTmpRangeExtended[0], mTmpRangeExtended[1], mScrollHint);
	//   91  159:aload_0         
	//   92  160:getfield        #118 <Field ThreadUtil$BackgroundCallback mBackgroundProxy>
	//   93  163:aload_0         
	//   94  164:getfield        #61  <Field int[] mTmpRange>
	//   95  167:iconst_0        
	//   96  168:iaload          
	//   97  169:aload_0         
	//   98  170:getfield        #61  <Field int[] mTmpRange>
	//   99  173:iconst_1        
	//  100  174:iaload          
	//  101  175:aload_0         
	//  102  176:getfield        #65  <Field int[] mTmpRangeExtended>
	//  103  179:iconst_0        
	//  104  180:iaload          
	//  105  181:aload_0         
	//  106  182:getfield        #65  <Field int[] mTmpRangeExtended>
	//  107  185:iconst_1        
	//  108  186:iaload          
	//  109  187:aload_0         
	//  110  188:getfield        #67  <Field int mScrollHint>
	//  111  191:invokeinterface #210 <Method void ThreadUtil$BackgroundCallback.updateRange(int, int, int, int, int)>
		return;
	//  112  196:return          
_L2:
		if(mTmpRange[0] > mPrevRange[1] || mPrevRange[0] > mTmpRange[1])
	//* 113  197:aload_0         
	//* 114  198:getfield        #61  <Field int[] mTmpRange>
	//* 115  201:iconst_0        
	//* 116  202:iaload          
	//* 117  203:aload_0         
	//* 118  204:getfield        #63  <Field int[] mPrevRange>
	//* 119  207:iconst_1        
	//* 120  208:iaload          
	//* 121  209:icmpgt          227
	//* 122  212:aload_0         
	//* 123  213:getfield        #63  <Field int[] mPrevRange>
	//* 124  216:iconst_0        
	//* 125  217:iaload          
	//* 126  218:aload_0         
	//* 127  219:getfield        #61  <Field int[] mTmpRange>
	//* 128  222:iconst_1        
	//* 129  223:iaload          
	//* 130  224:icmple          235
			mScrollHint = 0;
	//  131  227:aload_0         
	//  132  228:iconst_0        
	//  133  229:putfield        #67  <Field int mScrollHint>
		else
	//* 134  232:goto            61
		if(mTmpRange[0] < mPrevRange[0])
	//* 135  235:aload_0         
	//* 136  236:getfield        #61  <Field int[] mTmpRange>
	//* 137  239:iconst_0        
	//* 138  240:iaload          
	//* 139  241:aload_0         
	//* 140  242:getfield        #63  <Field int[] mPrevRange>
	//* 141  245:iconst_0        
	//* 142  246:iaload          
	//* 143  247:icmpge          258
			mScrollHint = 1;
	//  144  250:aload_0         
	//  145  251:iconst_1        
	//  146  252:putfield        #67  <Field int mScrollHint>
		else
	//* 147  255:goto            61
		if(mTmpRange[0] > mPrevRange[0])
	//* 148  258:aload_0         
	//* 149  259:getfield        #61  <Field int[] mTmpRange>
	//* 150  262:iconst_0        
	//* 151  263:iaload          
	//* 152  264:aload_0         
	//* 153  265:getfield        #63  <Field int[] mPrevRange>
	//* 154  268:iconst_0        
	//* 155  269:iaload          
	//* 156  270:icmple          61
			mScrollHint = 2;
	//  157  273:aload_0         
	//  158  274:iconst_2        
	//  159  275:putfield        #67  <Field int mScrollHint>
		if(true) goto _L4; else goto _L3
	//  160  278:goto            61
_L3:
	}

	static final boolean DEBUG = false;
	static final String TAG = "AsyncListUtil";
	boolean mAllowScrollHints;
	private final ThreadUtil.BackgroundCallback mBackgroundCallback = new ThreadUtil.BackgroundCallback() {

		private TileList.Tile acquireTile()
		{
			if(mRecycledRoot != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #38  <Field TileList$Tile mRecycledRoot>
		//*   2    4:ifnull          25
			{
				TileList.Tile tile = mRecycledRoot;
		//    3    7:aload_0         
		//    4    8:getfield        #38  <Field TileList$Tile mRecycledRoot>
		//    5   11:astore_1        
				mRecycledRoot = mRecycledRoot.mNext;
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #38  <Field TileList$Tile mRecycledRoot>
		//    9   17:getfield        #43  <Field TileList$Tile TileList$Tile.mNext>
		//   10   20:putfield        #38  <Field TileList$Tile mRecycledRoot>
				return tile;
		//   11   23:aload_1         
		//   12   24:areturn         
			} else
			{
				return new TileList.Tile(mTClass, mTileSize);
		//   13   25:new             #40  <Class TileList$Tile>
		//   14   28:dup             
		//   15   29:aload_0         
		//   16   30:getfield        #25  <Field AsyncListUtil this$0>
		//   17   33:getfield        #47  <Field Class AsyncListUtil.mTClass>
		//   18   36:aload_0         
		//   19   37:getfield        #25  <Field AsyncListUtil this$0>
		//   20   40:getfield        #50  <Field int AsyncListUtil.mTileSize>
		//   21   43:invokespecial   #53  <Method void TileList$Tile(Class, int)>
		//   22   46:areturn         
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
			int k = mDataCallback.getMaxCachedTiles();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field AsyncListUtil this$0>
		//    2    4:getfield        #82  <Field AsyncListUtil$DataCallback AsyncListUtil.mDataCallback>
		//    3    7:invokevirtual   #88  <Method int AsyncListUtil$DataCallback.getMaxCachedTiles()>
		//    4   10:istore_2        
			do
			{
				if(mLoadedTiles.size() < k)
					break;
		//    5   11:aload_0         
		//    6   12:getfield        #33  <Field SparseBooleanArray mLoadedTiles>
		//    7   15:invokevirtual   #91  <Method int SparseBooleanArray.size()>
		//    8   18:iload_2         
		//    9   19:icmplt          117
				int l = mLoadedTiles.keyAt(0);
		//   10   22:aload_0         
		//   11   23:getfield        #33  <Field SparseBooleanArray mLoadedTiles>
		//   12   26:iconst_0        
		//   13   27:invokevirtual   #95  <Method int SparseBooleanArray.keyAt(int)>
		//   14   30:istore_3        
				int i1 = mLoadedTiles.keyAt(mLoadedTiles.size() - 1);
		//   15   31:aload_0         
		//   16   32:getfield        #33  <Field SparseBooleanArray mLoadedTiles>
		//   17   35:aload_0         
		//   18   36:getfield        #33  <Field SparseBooleanArray mLoadedTiles>
		//   19   39:invokevirtual   #91  <Method int SparseBooleanArray.size()>
		//   20   42:iconst_1        
		//   21   43:isub            
		//   22   44:invokevirtual   #95  <Method int SparseBooleanArray.keyAt(int)>
		//   23   47:istore          4
				int j1 = mFirstRequiredTileStart - l;
		//   24   49:aload_0         
		//   25   50:getfield        #97  <Field int mFirstRequiredTileStart>
		//   26   53:iload_3         
		//   27   54:isub            
		//   28   55:istore          5
				int k1 = i1 - mLastRequiredTileStart;
		//   29   57:iload           4
		//   30   59:aload_0         
		//   31   60:getfield        #99  <Field int mLastRequiredTileStart>
		//   32   63:isub            
		//   33   64:istore          6
				if(j1 > 0 && (j1 >= k1 || j == 2))
		//*  34   66:iload           5
		//*  35   68:ifle            91
		//*  36   71:iload           5
		//*  37   73:iload           6
		//*  38   75:icmpge          83
		//*  39   78:iload_1         
		//*  40   79:iconst_2        
		//*  41   80:icmpne          91
				{
					removeTile(l);
		//   42   83:aload_0         
		//   43   84:iload_3         
		//   44   85:invokespecial   #102 <Method void removeTile(int)>
					continue;
		//   45   88:goto            11
				}
				if(k1 <= 0 || j1 >= k1 && j != 1)
					break;
		//   46   91:iload           6
		//   47   93:ifle            117
		//   48   96:iload           5
		//   49   98:iload           6
		//   50  100:icmplt          108
		//   51  103:iload_1         
		//   52  104:iconst_1        
		//   53  105:icmpne          117
				removeTile(i1);
		//   54  108:aload_0         
		//   55  109:iload           4
		//   56  111:invokespecial   #102 <Method void removeTile(int)>
			} while(true);
		//   57  114:goto            11
		//   58  117:return          
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
			Log.d("AsyncListUtil", (new StringBuilder()).append("[BKGR] ").append(String.format(s, aobj)).toString());
		//    0    0:ldc1            #112 <String "AsyncListUtil">
		//    1    2:new             #114 <Class StringBuilder>
		//    2    5:dup             
		//    3    6:invokespecial   #115 <Method void StringBuilder()>
		//    4    9:ldc1            #117 <String "[BKGR] ">
		//    5   11:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//    6   14:aload_1         
		//    7   15:aload_2         
		//    8   16:invokestatic    #127 <Method String String.format(String, Object[])>
		//    9   19:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   10   22:invokevirtual   #131 <Method String StringBuilder.toString()>
		//   11   25:invokestatic    #137 <Method int Log.d(String, String)>
		//   12   28:pop             
		//   13   29:return          
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
			int i1 = j;
		//    0    0:iload_1         
		//    1    1:istore          5
			while(i1 <= k) 
		//*   2    3:iload           5
		//*   3    5:iload_2         
		//*   4    6:icmpgt          59
			{
				int j1;
				if(flag)
		//*   5    9:iload           4
		//*   6   11:ifeq            52
					j1 = (k + j) - i1;
		//    7   14:iload_2         
		//    8   15:iload_1         
		//    9   16:iadd            
		//   10   17:iload           5
		//   11   19:isub            
		//   12   20:istore          6
				else
		//*  13   22:aload_0         
		//*  14   23:getfield        #25  <Field AsyncListUtil this$0>
		//*  15   26:getfield        #149 <Field ThreadUtil$BackgroundCallback AsyncListUtil.mBackgroundProxy>
		//*  16   29:iload           6
		//*  17   31:iload_3         
		//*  18   32:invokeinterface #152 <Method void ThreadUtil$BackgroundCallback.loadTile(int, int)>
		//*  19   37:iload           5
		//*  20   39:aload_0         
		//*  21   40:getfield        #25  <Field AsyncListUtil this$0>
		//*  22   43:getfield        #50  <Field int AsyncListUtil.mTileSize>
		//*  23   46:iadd            
		//*  24   47:istore          5
		//*  25   49:goto            3
					j1 = i1;
		//   26   52:iload           5
		//   27   54:istore          6
				mBackgroundProxy.loadTile(j1, l);
				i1 += mTileSize;
			}
		//*  28   56:goto            22
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
				requestTiles(mTileSize + k, mLastRequiredTileStart, j1, false);
		//   32   55:aload_0         
		//   33   56:aload_0         
		//   34   57:getfield        #25  <Field AsyncListUtil this$0>
		//   35   60:getfield        #50  <Field int AsyncListUtil.mTileSize>
		//   36   63:iload_2         
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
			} else
		//*   9   21:return          
			{
				TileList.Tile tile1 = mTileList.addOrReplace(tile);
		//   10   22:aload_0         
		//   11   23:getfield        #15  <Field AsyncListUtil this$0>
		//   12   26:getfield        #30  <Field TileList AsyncListUtil.mTileList>
		//   13   29:aload_2         
		//   14   30:invokevirtual   #61  <Method TileList$Tile TileList.addOrReplace(TileList$Tile)>
		//   15   33:astore          6
				if(tile1 != null)
		//*  16   35:aload           6
		//*  17   37:ifnull          83
				{
					Log.e("AsyncListUtil", (new StringBuilder()).append("duplicate tile @").append(tile1.mStartPosition).toString());
		//   18   40:ldc1            #63  <String "AsyncListUtil">
		//   19   42:new             #65  <Class StringBuilder>
		//   20   45:dup             
		//   21   46:invokespecial   #66  <Method void StringBuilder()>
		//   22   49:ldc1            #68  <String "duplicate tile @">
		//   23   51:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
		//   24   54:aload           6
		//   25   56:getfield        #77  <Field int TileList$Tile.mStartPosition>
		//   26   59:invokevirtual   #80  <Method StringBuilder StringBuilder.append(int)>
		//   27   62:invokevirtual   #84  <Method String StringBuilder.toString()>
		//   28   65:invokestatic    #90  <Method int Log.e(String, String)>
		//   29   68:pop             
					mBackgroundProxy.recycleTile(tile1);
		//   30   69:aload_0         
		//   31   70:getfield        #15  <Field AsyncListUtil this$0>
		//   32   73:getfield        #40  <Field ThreadUtil$BackgroundCallback AsyncListUtil.mBackgroundProxy>
		//   33   76:aload           6
		//   34   78:invokeinterface #50  <Method void ThreadUtil$BackgroundCallback.recycleTile(TileList$Tile)>
				}
				int k = tile.mStartPosition;
		//   35   83:aload_2         
		//   36   84:getfield        #77  <Field int TileList$Tile.mStartPosition>
		//   37   87:istore_3        
				int l = tile.mItemCount;
		//   38   88:aload_2         
		//   39   89:getfield        #93  <Field int TileList$Tile.mItemCount>
		//   40   92:istore          4
				j = 0;
		//   41   94:iconst_0        
		//   42   95:istore_1        
				while(j < mMissingPositions.size()) 
		//*  43   96:iload_1         
		//*  44   97:aload_0         
		//*  45   98:getfield        #15  <Field AsyncListUtil this$0>
		//*  46  101:getfield        #97  <Field SparseIntArray AsyncListUtil.mMissingPositions>
		//*  47  104:invokevirtual   #100 <Method int SparseIntArray.size()>
		//*  48  107:icmpge          21
				{
					int i1 = mMissingPositions.keyAt(j);
		//   49  110:aload_0         
		//   50  111:getfield        #15  <Field AsyncListUtil this$0>
		//   51  114:getfield        #97  <Field SparseIntArray AsyncListUtil.mMissingPositions>
		//   52  117:iload_1         
		//   53  118:invokevirtual   #104 <Method int SparseIntArray.keyAt(int)>
		//   54  121:istore          5
					if(tile.mStartPosition <= i1 && i1 < k + l)
		//*  55  123:aload_2         
		//*  56  124:getfield        #77  <Field int TileList$Tile.mStartPosition>
		//*  57  127:iload           5
		//*  58  129:icmpgt          167
		//*  59  132:iload           5
		//*  60  134:iload_3         
		//*  61  135:iload           4
		//*  62  137:iadd            
		//*  63  138:icmpge          167
					{
						mMissingPositions.removeAt(j);
		//   64  141:aload_0         
		//   65  142:getfield        #15  <Field AsyncListUtil this$0>
		//   66  145:getfield        #97  <Field SparseIntArray AsyncListUtil.mMissingPositions>
		//   67  148:iload_1         
		//   68  149:invokevirtual   #108 <Method void SparseIntArray.removeAt(int)>
						mViewCallback.onItemLoaded(i1);
		//   69  152:aload_0         
		//   70  153:getfield        #15  <Field AsyncListUtil this$0>
		//   71  156:getfield        #112 <Field AsyncListUtil$ViewCallback AsyncListUtil.mViewCallback>
		//   72  159:iload           5
		//   73  161:invokevirtual   #117 <Method void AsyncListUtil$ViewCallback.onItemLoaded(int)>
					} else
		//*  74  164:goto            96
					{
						j++;
		//   75  167:iload_1         
		//   76  168:iconst_1        
		//   77  169:iadd            
		//   78  170:istore_1        
					}
				}
			}
		//*  79  171:goto            96
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
			TileList.Tile tile = mTileList.removeAtPos(k);
		//    5    9:aload_0         
		//    6   10:getfield        #15  <Field AsyncListUtil this$0>
		//    7   13:getfield        #30  <Field TileList AsyncListUtil.mTileList>
		//    8   16:iload_2         
		//    9   17:invokevirtual   #124 <Method TileList$Tile TileList.removeAtPos(int)>
		//   10   20:astore_3        
			if(tile == null)
		//*  11   21:aload_3         
		//*  12   22:ifnonnull       51
			{
				Log.e("AsyncListUtil", (new StringBuilder()).append("tile not found @").append(k).toString());
		//   13   25:ldc1            #63  <String "AsyncListUtil">
		//   14   27:new             #65  <Class StringBuilder>
		//   15   30:dup             
		//   16   31:invokespecial   #66  <Method void StringBuilder()>
		//   17   34:ldc1            #126 <String "tile not found @">
		//   18   36:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
		//   19   39:iload_2         
		//   20   40:invokevirtual   #80  <Method StringBuilder StringBuilder.append(int)>
		//   21   43:invokevirtual   #84  <Method String StringBuilder.toString()>
		//   22   46:invokestatic    #90  <Method int Log.e(String, String)>
		//   23   49:pop             
				return;
		//   24   50:return          
			} else
			{
				mBackgroundProxy.recycleTile(tile);
		//   25   51:aload_0         
		//   26   52:getfield        #15  <Field AsyncListUtil this$0>
		//   27   55:getfield        #40  <Field ThreadUtil$BackgroundCallback AsyncListUtil.mBackgroundProxy>
		//   28   58:aload_3         
		//   29   59:invokeinterface #50  <Method void ThreadUtil$BackgroundCallback.recycleTile(TileList$Tile)>
				return;
		//   30   64:return          
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
				mItemCount = k;
		//    5    9:aload_0         
		//    6   10:getfield        #15  <Field AsyncListUtil this$0>
		//    7   13:iload_2         
		//    8   14:putfield        #128 <Field int AsyncListUtil.mItemCount>
				mViewCallback.onDataRefresh();
		//    9   17:aload_0         
		//   10   18:getfield        #15  <Field AsyncListUtil this$0>
		//   11   21:getfield        #112 <Field AsyncListUtil$ViewCallback AsyncListUtil.mViewCallback>
		//   12   24:invokevirtual   #131 <Method void AsyncListUtil$ViewCallback.onDataRefresh()>
				mDisplayedGeneration = mRequestedGeneration;
		//   13   27:aload_0         
		//   14   28:getfield        #15  <Field AsyncListUtil this$0>
		//   15   31:aload_0         
		//   16   32:getfield        #15  <Field AsyncListUtil this$0>
		//   17   35:getfield        #25  <Field int AsyncListUtil.mRequestedGeneration>
		//   18   38:putfield        #134 <Field int AsyncListUtil.mDisplayedGeneration>
				recycleAllTiles();
		//   19   41:aload_0         
		//   20   42:invokespecial   #136 <Method void recycleAllTiles()>
				mAllowScrollHints = false;
		//   21   45:aload_0         
		//   22   46:getfield        #15  <Field AsyncListUtil this$0>
		//   23   49:iconst_0        
		//   24   50:putfield        #140 <Field boolean AsyncListUtil.mAllowScrollHints>
				updateRange();
		//   25   53:aload_0         
		//   26   54:getfield        #15  <Field AsyncListUtil this$0>
		//   27   57:invokevirtual   #143 <Method void AsyncListUtil.updateRange()>
				return;
		//   28   60:return          
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
