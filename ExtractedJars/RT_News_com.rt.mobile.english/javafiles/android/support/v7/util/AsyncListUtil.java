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
		if(i >= 0 && i < mItemCount)
	//*   0    0:iload_1         
	//*   1    1:iflt            46
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #69  <Field int mItemCount>
	//*   5    9:icmplt          15
	//*   6   12:goto            46
		{
			Object obj = mTileList.getItemAt(i);
	//    7   15:aload_0         
	//    8   16:getfield        #101 <Field TileList mTileList>
	//    9   19:iload_1         
	//   10   20:invokevirtual   #131 <Method Object TileList.getItemAt(int)>
	//   11   23:astore_2        
			if(obj == null && !isRefreshPending())
	//*  12   24:aload_2         
	//*  13   25:ifnonnull       44
	//*  14   28:aload_0         
	//*  15   29:invokespecial   #133 <Method boolean isRefreshPending()>
	//*  16   32:ifne            44
				mMissingPositions.put(i, 0);
	//   17   35:aload_0         
	//   18   36:getfield        #78  <Field SparseIntArray mMissingPositions>
	//   19   39:iload_1         
	//   20   40:iconst_0        
	//   21   41:invokevirtual   #137 <Method void SparseIntArray.put(int, int)>
			return obj;
	//   22   44:aload_2         
	//   23   45:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   24   46:new             #139 <Class StringBuilder>
	//   25   49:dup             
	//   26   50:invokespecial   #140 <Method void StringBuilder()>
	//   27   53:astore_2        
			stringbuilder.append(i);
	//   28   54:aload_2         
	//   29   55:iload_1         
	//   30   56:invokevirtual   #144 <Method StringBuilder StringBuilder.append(int)>
	//   31   59:pop             
			stringbuilder.append(" is not within 0 and ");
	//   32   60:aload_2         
	//   33   61:ldc1            #146 <String " is not within 0 and ">
	//   34   63:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   35   66:pop             
			stringbuilder.append(mItemCount);
	//   36   67:aload_2         
	//   37   68:aload_0         
	//   38   69:getfield        #69  <Field int mItemCount>
	//   39   72:invokevirtual   #144 <Method StringBuilder StringBuilder.append(int)>
	//   40   75:pop             
			throw new IndexOutOfBoundsException(stringbuilder.toString());
	//   41   76:new             #151 <Class IndexOutOfBoundsException>
	//   42   79:dup             
	//   43   80:aload_2         
	//   44   81:invokevirtual   #155 <Method String StringBuilder.toString()>
	//   45   84:invokespecial   #158 <Method void IndexOutOfBoundsException(String)>
	//   46   87:athrow          
		}
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
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #139 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #140 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("[MAIN] ");
	//    4    8:aload_3         
	//    5    9:ldc1            #165 <String "[MAIN] ">
	//    6   11:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(String.format(s, aobj));
	//    8   15:aload_3         
	//    9   16:aload_1         
	//   10   17:aload_2         
	//   11   18:invokestatic    #171 <Method String String.format(String, Object[])>
	//   12   21:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
		Log.d("AsyncListUtil", stringbuilder.toString());
	//   14   25:ldc1            #22  <String "AsyncListUtil">
	//   15   27:aload_3         
	//   16   28:invokevirtual   #155 <Method String StringBuilder.toString()>
	//   17   31:invokestatic    #177 <Method int Log.d(String, String)>
	//   18   34:pop             
	//   19   35:return          
	}

	public void onRangeChanged()
	{
		if(isRefreshPending())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #133 <Method boolean isRefreshPending()>
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
		if(mTmpRange[0] <= mTmpRange[1])
	//*   5   11:aload_0         
	//*   6   12:getfield        #61  <Field int[] mTmpRange>
	//*   7   15:iconst_0        
	//*   8   16:iaload          
	//*   9   17:aload_0         
	//*  10   18:getfield        #61  <Field int[] mTmpRange>
	//*  11   21:iconst_1        
	//*  12   22:iaload          
	//*  13   23:icmpgt          285
		{
			if(mTmpRange[0] < 0)
	//*  14   26:aload_0         
	//*  15   27:getfield        #61  <Field int[] mTmpRange>
	//*  16   30:iconst_0        
	//*  17   31:iaload          
	//*  18   32:ifge            36
				return;
	//   19   35:return          
			if(mTmpRange[1] >= mItemCount)
	//*  20   36:aload_0         
	//*  21   37:getfield        #61  <Field int[] mTmpRange>
	//*  22   40:iconst_1        
	//*  23   41:iaload          
	//*  24   42:aload_0         
	//*  25   43:getfield        #69  <Field int mItemCount>
	//*  26   46:icmplt          50
				return;
	//   27   49:return          
			if(!mAllowScrollHints)
	//*  28   50:aload_0         
	//*  29   51:getfield        #183 <Field boolean mAllowScrollHints>
	//*  30   54:ifne            65
				mScrollHint = 0;
	//   31   57:aload_0         
	//   32   58:iconst_0        
	//   33   59:putfield        #67  <Field int mScrollHint>
			else
	//*  34   62:goto            149
			if(mTmpRange[0] <= mPrevRange[1] && mPrevRange[0] <= mTmpRange[1])
	//*  35   65:aload_0         
	//*  36   66:getfield        #61  <Field int[] mTmpRange>
	//*  37   69:iconst_0        
	//*  38   70:iaload          
	//*  39   71:aload_0         
	//*  40   72:getfield        #63  <Field int[] mPrevRange>
	//*  41   75:iconst_1        
	//*  42   76:iaload          
	//*  43   77:icmpgt          144
	//*  44   80:aload_0         
	//*  45   81:getfield        #63  <Field int[] mPrevRange>
	//*  46   84:iconst_0        
	//*  47   85:iaload          
	//*  48   86:aload_0         
	//*  49   87:getfield        #61  <Field int[] mTmpRange>
	//*  50   90:iconst_1        
	//*  51   91:iaload          
	//*  52   92:icmple          98
	//*  53   95:goto            144
			{
				if(mTmpRange[0] < mPrevRange[0])
	//*  54   98:aload_0         
	//*  55   99:getfield        #61  <Field int[] mTmpRange>
	//*  56  102:iconst_0        
	//*  57  103:iaload          
	//*  58  104:aload_0         
	//*  59  105:getfield        #63  <Field int[] mPrevRange>
	//*  60  108:iconst_0        
	//*  61  109:iaload          
	//*  62  110:icmpge          121
					mScrollHint = 1;
	//   63  113:aload_0         
	//   64  114:iconst_1        
	//   65  115:putfield        #67  <Field int mScrollHint>
				else
	//*  66  118:goto            149
				if(mTmpRange[0] > mPrevRange[0])
	//*  67  121:aload_0         
	//*  68  122:getfield        #61  <Field int[] mTmpRange>
	//*  69  125:iconst_0        
	//*  70  126:iaload          
	//*  71  127:aload_0         
	//*  72  128:getfield        #63  <Field int[] mPrevRange>
	//*  73  131:iconst_0        
	//*  74  132:iaload          
	//*  75  133:icmple          149
					mScrollHint = 2;
	//   76  136:aload_0         
	//   77  137:iconst_2        
	//   78  138:putfield        #67  <Field int mScrollHint>
			} else
	//*  79  141:goto            149
			{
				mScrollHint = 0;
	//   80  144:aload_0         
	//   81  145:iconst_0        
	//   82  146:putfield        #67  <Field int mScrollHint>
			}
			mPrevRange[0] = mTmpRange[0];
	//   83  149:aload_0         
	//   84  150:getfield        #63  <Field int[] mPrevRange>
	//   85  153:iconst_0        
	//   86  154:aload_0         
	//   87  155:getfield        #61  <Field int[] mTmpRange>
	//   88  158:iconst_0        
	//   89  159:iaload          
	//   90  160:iastore         
			mPrevRange[1] = mTmpRange[1];
	//   91  161:aload_0         
	//   92  162:getfield        #63  <Field int[] mPrevRange>
	//   93  165:iconst_1        
	//   94  166:aload_0         
	//   95  167:getfield        #61  <Field int[] mTmpRange>
	//   96  170:iconst_1        
	//   97  171:iaload          
	//   98  172:iastore         
			mViewCallback.extendRangeInto(mTmpRange, mTmpRangeExtended, mScrollHint);
	//   99  173:aload_0         
	//  100  174:getfield        #94  <Field AsyncListUtil$ViewCallback mViewCallback>
	//  101  177:aload_0         
	//  102  178:getfield        #61  <Field int[] mTmpRange>
	//  103  181:aload_0         
	//  104  182:getfield        #65  <Field int[] mTmpRangeExtended>
	//  105  185:aload_0         
	//  106  186:getfield        #67  <Field int mScrollHint>
	//  107  189:invokevirtual   #198 <Method void AsyncListUtil$ViewCallback.extendRangeInto(int[], int[], int)>
			mTmpRangeExtended[0] = Math.min(mTmpRange[0], Math.max(mTmpRangeExtended[0], 0));
	//  108  192:aload_0         
	//  109  193:getfield        #65  <Field int[] mTmpRangeExtended>
	//  110  196:iconst_0        
	//  111  197:aload_0         
	//  112  198:getfield        #61  <Field int[] mTmpRange>
	//  113  201:iconst_0        
	//  114  202:iaload          
	//  115  203:aload_0         
	//  116  204:getfield        #65  <Field int[] mTmpRangeExtended>
	//  117  207:iconst_0        
	//  118  208:iaload          
	//  119  209:iconst_0        
	//  120  210:invokestatic    #204 <Method int Math.max(int, int)>
	//  121  213:invokestatic    #207 <Method int Math.min(int, int)>
	//  122  216:iastore         
			mTmpRangeExtended[1] = Math.max(mTmpRange[1], Math.min(mTmpRangeExtended[1], mItemCount - 1));
	//  123  217:aload_0         
	//  124  218:getfield        #65  <Field int[] mTmpRangeExtended>
	//  125  221:iconst_1        
	//  126  222:aload_0         
	//  127  223:getfield        #61  <Field int[] mTmpRange>
	//  128  226:iconst_1        
	//  129  227:iaload          
	//  130  228:aload_0         
	//  131  229:getfield        #65  <Field int[] mTmpRangeExtended>
	//  132  232:iconst_1        
	//  133  233:iaload          
	//  134  234:aload_0         
	//  135  235:getfield        #69  <Field int mItemCount>
	//  136  238:iconst_1        
	//  137  239:isub            
	//  138  240:invokestatic    #207 <Method int Math.min(int, int)>
	//  139  243:invokestatic    #204 <Method int Math.max(int, int)>
	//  140  246:iastore         
			mBackgroundProxy.updateRange(mTmpRange[0], mTmpRange[1], mTmpRangeExtended[0], mTmpRangeExtended[1], mScrollHint);
	//  141  247:aload_0         
	//  142  248:getfield        #118 <Field ThreadUtil$BackgroundCallback mBackgroundProxy>
	//  143  251:aload_0         
	//  144  252:getfield        #61  <Field int[] mTmpRange>
	//  145  255:iconst_0        
	//  146  256:iaload          
	//  147  257:aload_0         
	//  148  258:getfield        #61  <Field int[] mTmpRange>
	//  149  261:iconst_1        
	//  150  262:iaload          
	//  151  263:aload_0         
	//  152  264:getfield        #65  <Field int[] mTmpRangeExtended>
	//  153  267:iconst_0        
	//  154  268:iaload          
	//  155  269:aload_0         
	//  156  270:getfield        #65  <Field int[] mTmpRangeExtended>
	//  157  273:iconst_1        
	//  158  274:iaload          
	//  159  275:aload_0         
	//  160  276:getfield        #67  <Field int mScrollHint>
	//  161  279:invokeinterface #210 <Method void ThreadUtil$BackgroundCallback.updateRange(int, int, int, int, int)>
			return;
	//  162  284:return          
		} else
		{
			return;
	//  163  285:return          
		}
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
		//*   9   19:icmplt          118
			{
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
					removeTile(l);
		//   42   83:aload_0         
		//   43   84:iload_3         
		//   44   85:invokespecial   #102 <Method void removeTile(int)>
				else
		//*  45   88:goto            11
				if(k1 > 0 && (j1 < k1 || j == 1))
		//*  46   91:iload           6
		//*  47   93:ifle            117
		//*  48   96:iload           5
		//*  49   98:iload           6
		//*  50  100:icmplt          108
		//*  51  103:iload_1         
		//*  52  104:iconst_1        
		//*  53  105:icmpne          117
					removeTile(i1);
		//   54  108:aload_0         
		//   55  109:iload           4
		//   56  111:invokespecial   #102 <Method void removeTile(int)>
				else
		//*  57  114:goto            11
					return;
		//   58  117:return          
			}

		//   59  118:return          
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
