// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//			StaggeredGridLayoutManager, OrientationHelper

class StaggeredGridLayoutManager$Span
{

	void appendToSpan(View view)
	{
		tParams tparams = getLayoutParams(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #46  <Method StaggeredGridLayoutManager$LayoutParams getLayoutParams(View)>
	//    3    5:astore_2        
		tparams.mSpan = this;
	//    4    6:aload_2         
	//    5    7:aload_0         
	//    6    8:putfield        #52  <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
		mViews.add(((Object) (view)));
	//    7   11:aload_0         
	//    8   12:getfield        #31  <Field ArrayList mViews>
	//    9   15:aload_1         
	//   10   16:invokevirtual   #56  <Method boolean ArrayList.add(Object)>
	//   11   19:pop             
		mCachedEnd = 0x80000000;
	//   12   20:aload_0         
	//   13   21:ldc1            #10  <Int 0x80000000>
	//   14   23:putfield        #35  <Field int mCachedEnd>
		if(mViews.size() == 1)
	//*  15   26:aload_0         
	//*  16   27:getfield        #31  <Field ArrayList mViews>
	//*  17   30:invokevirtual   #60  <Method int ArrayList.size()>
	//*  18   33:iconst_1        
	//*  19   34:icmpne          43
			mCachedStart = 0x80000000;
	//   20   37:aload_0         
	//   21   38:ldc1            #10  <Int 0x80000000>
	//   22   40:putfield        #33  <Field int mCachedStart>
		if(tparams.isItemRemoved() || tparams.isItemChanged())
	//*  23   43:aload_2         
	//*  24   44:invokevirtual   #64  <Method boolean StaggeredGridLayoutManager$LayoutParams.isItemRemoved()>
	//*  25   47:ifne            57
	//*  26   50:aload_2         
	//*  27   51:invokevirtual   #67  <Method boolean StaggeredGridLayoutManager$LayoutParams.isItemChanged()>
	//*  28   54:ifeq            77
			mDeletedSize = mDeletedSize + mPrimaryOrientation.getDecoratedMeasurement(view);
	//   29   57:aload_0         
	//   30   58:aload_0         
	//   31   59:getfield        #37  <Field int mDeletedSize>
	//   32   62:aload_0         
	//   33   63:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//   34   66:getfield        #71  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//   35   69:aload_1         
	//   36   70:invokevirtual   #77  <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   37   73:iadd            
	//   38   74:putfield        #37  <Field int mDeletedSize>
	//   39   77:return          
	}

	void cacheReferenceLineAndClear(boolean flag, int i)
	{
		int j;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            22
			j = getEndLine(0x80000000);
	//    2    4:aload_0         
	//    3    5:ldc1            #10  <Int 0x80000000>
	//    4    7:invokevirtual   #83  <Method int getEndLine(int)>
	//    5   10:istore_3        
		else
	//*   6   11:aload_0         
	//*   7   12:invokevirtual   #86  <Method void clear()>
	//*   8   15:iload_3         
	//*   9   16:ldc1            #10  <Int 0x80000000>
	//*  10   18:icmpne          32
	//*  11   21:return          
			j = getStartLine(0x80000000);
	//   12   22:aload_0         
	//   13   23:ldc1            #10  <Int 0x80000000>
	//   14   25:invokevirtual   #89  <Method int getStartLine(int)>
	//   15   28:istore_3        
		clear();
		while(j == 0x80000000 || flag && j < mPrimaryOrientation.getEndAfterPadding() || !flag && j > mPrimaryOrientation.getStartAfterPadding()) 
			return;
	//   16   29:goto            11
	//   17   32:iload_1         
	//   18   33:ifeq            50
	//   19   36:iload_3         
	//   20   37:aload_0         
	//   21   38:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//   22   41:getfield        #71  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//   23   44:invokevirtual   #92  <Method int OrientationHelper.getEndAfterPadding()>
	//   24   47:icmplt          21
	//   25   50:iload_1         
	//   26   51:ifne            68
	//   27   54:iload_3         
	//   28   55:aload_0         
	//   29   56:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//   30   59:getfield        #71  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//   31   62:invokevirtual   #95  <Method int OrientationHelper.getStartAfterPadding()>
	//   32   65:icmpgt          21
		int k = j;
	//   33   68:iload_3         
	//   34   69:istore          4
		if(i != 0x80000000)
	//*  35   71:iload_2         
	//*  36   72:ldc1            #10  <Int 0x80000000>
	//*  37   74:icmpeq          82
			k = j + i;
	//   38   77:iload_3         
	//   39   78:iload_2         
	//   40   79:iadd            
	//   41   80:istore          4
		mCachedEnd = k;
	//   42   82:aload_0         
	//   43   83:iload           4
	//   44   85:putfield        #35  <Field int mCachedEnd>
		mCachedStart = k;
	//   45   88:aload_0         
	//   46   89:iload           4
	//   47   91:putfield        #33  <Field int mCachedStart>
	//   48   94:return          
	}

	void calculateCachedEnd()
	{
		View view = (View)mViews.get(mViews.size() - 1);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ArrayList mViews>
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field ArrayList mViews>
	//    4    8:invokevirtual   #60  <Method int ArrayList.size()>
	//    5   11:iconst_1        
	//    6   12:isub            
	//    7   13:invokevirtual   #100 <Method Object ArrayList.get(int)>
	//    8   16:checkcast       #102 <Class View>
	//    9   19:astore_2        
		tParams tparams = getLayoutParams(view);
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #46  <Method StaggeredGridLayoutManager$LayoutParams getLayoutParams(View)>
	//   13   25:astore_3        
		mCachedEnd = mPrimaryOrientation.getDecoratedEnd(view);
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//   17   31:getfield        #71  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//   18   34:aload_2         
	//   19   35:invokevirtual   #105 <Method int OrientationHelper.getDecoratedEnd(View)>
	//   20   38:putfield        #35  <Field int mCachedEnd>
		if(tparams.mFullSpan)
	//*  21   41:aload_3         
	//*  22   42:getfield        #109 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*  23   45:ifeq            94
		{
			panLookup.FullSpanItem fullspanitem = mLazySpanLookup.getFullSpanItem(tparams.getViewLayoutPosition());
	//   24   48:aload_0         
	//   25   49:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//   26   52:getfield        #113 <Field StaggeredGridLayoutManager$LazySpanLookup StaggeredGridLayoutManager.mLazySpanLookup>
	//   27   55:aload_3         
	//   28   56:invokevirtual   #116 <Method int StaggeredGridLayoutManager$LayoutParams.getViewLayoutPosition()>
	//   29   59:invokevirtual   #122 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem StaggeredGridLayoutManager$LazySpanLookup.getFullSpanItem(int)>
	//   30   62:astore_2        
			if(fullspanitem != null && fullspanitem.mGapDir == 1)
	//*  31   63:aload_2         
	//*  32   64:ifnull          94
	//*  33   67:aload_2         
	//*  34   68:getfield        #127 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapDir>
	//*  35   71:iconst_1        
	//*  36   72:icmpne          94
			{
				int i = mCachedEnd;
	//   37   75:aload_0         
	//   38   76:getfield        #35  <Field int mCachedEnd>
	//   39   79:istore_1        
				mCachedEnd = fullspanitem.getGapForSpan(mIndex) + i;
	//   40   80:aload_0         
	//   41   81:aload_2         
	//   42   82:aload_0         
	//   43   83:getfield        #39  <Field int mIndex>
	//   44   86:invokevirtual   #130 <Method int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.getGapForSpan(int)>
	//   45   89:iload_1         
	//   46   90:iadd            
	//   47   91:putfield        #35  <Field int mCachedEnd>
			}
		}
	//   48   94:return          
	}

	void calculateCachedStart()
	{
		View view = (View)mViews.get(0);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ArrayList mViews>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #100 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #102 <Class View>
	//    5   11:astore_1        
		tParams tparams = getLayoutParams(view);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #46  <Method StaggeredGridLayoutManager$LayoutParams getLayoutParams(View)>
	//    9   17:astore_2        
		mCachedStart = mPrimaryOrientation.getDecoratedStart(view);
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//   13   23:getfield        #71  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #134 <Method int OrientationHelper.getDecoratedStart(View)>
	//   16   30:putfield        #33  <Field int mCachedStart>
		if(tparams.mFullSpan)
	//*  17   33:aload_2         
	//*  18   34:getfield        #109 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*  19   37:ifeq            84
		{
			panLookup.FullSpanItem fullspanitem = mLazySpanLookup.getFullSpanItem(tparams.getViewLayoutPosition());
	//   20   40:aload_0         
	//   21   41:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//   22   44:getfield        #113 <Field StaggeredGridLayoutManager$LazySpanLookup StaggeredGridLayoutManager.mLazySpanLookup>
	//   23   47:aload_2         
	//   24   48:invokevirtual   #116 <Method int StaggeredGridLayoutManager$LayoutParams.getViewLayoutPosition()>
	//   25   51:invokevirtual   #122 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem StaggeredGridLayoutManager$LazySpanLookup.getFullSpanItem(int)>
	//   26   54:astore_1        
			if(fullspanitem != null && fullspanitem.mGapDir == -1)
	//*  27   55:aload_1         
	//*  28   56:ifnull          84
	//*  29   59:aload_1         
	//*  30   60:getfield        #127 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapDir>
	//*  31   63:iconst_m1       
	//*  32   64:icmpne          84
				mCachedStart = mCachedStart - fullspanitem.getGapForSpan(mIndex);
	//   33   67:aload_0         
	//   34   68:aload_0         
	//   35   69:getfield        #33  <Field int mCachedStart>
	//   36   72:aload_1         
	//   37   73:aload_0         
	//   38   74:getfield        #39  <Field int mIndex>
	//   39   77:invokevirtual   #130 <Method int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.getGapForSpan(int)>
	//   40   80:isub            
	//   41   81:putfield        #33  <Field int mCachedStart>
		}
	//   42   84:return          
	}

	void clear()
	{
		mViews.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ArrayList mViews>
	//    2    4:invokevirtual   #135 <Method void ArrayList.clear()>
		invalidateCache();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #138 <Method void invalidateCache()>
		mDeletedSize = 0;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #37  <Field int mDeletedSize>
	//    8   16:return          
	}

	public int findFirstCompletelyVisibleItemPosition()
	{
		if(mReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//*   2    4:getfield        #142 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
	//*   3    7:ifeq            26
			return findOneVisibleChild(mViews.size() - 1, -1, true);
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:getfield        #31  <Field ArrayList mViews>
	//    7   15:invokevirtual   #60  <Method int ArrayList.size()>
	//    8   18:iconst_1        
	//    9   19:isub            
	//   10   20:iconst_m1       
	//   11   21:iconst_1        
	//   12   22:invokevirtual   #146 <Method int findOneVisibleChild(int, int, boolean)>
	//   13   25:ireturn         
		else
			return findOneVisibleChild(0, mViews.size(), true);
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:aload_0         
	//   17   29:getfield        #31  <Field ArrayList mViews>
	//   18   32:invokevirtual   #60  <Method int ArrayList.size()>
	//   19   35:iconst_1        
	//   20   36:invokevirtual   #146 <Method int findOneVisibleChild(int, int, boolean)>
	//   21   39:ireturn         
	}

	public int findFirstPartiallyVisibleItemPosition()
	{
		if(mReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//*   2    4:getfield        #142 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
	//*   3    7:ifeq            26
			return findOnePartiallyVisibleChild(mViews.size() - 1, -1, true);
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:getfield        #31  <Field ArrayList mViews>
	//    7   15:invokevirtual   #60  <Method int ArrayList.size()>
	//    8   18:iconst_1        
	//    9   19:isub            
	//   10   20:iconst_m1       
	//   11   21:iconst_1        
	//   12   22:invokevirtual   #150 <Method int findOnePartiallyVisibleChild(int, int, boolean)>
	//   13   25:ireturn         
		else
			return findOnePartiallyVisibleChild(0, mViews.size(), true);
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:aload_0         
	//   17   29:getfield        #31  <Field ArrayList mViews>
	//   18   32:invokevirtual   #60  <Method int ArrayList.size()>
	//   19   35:iconst_1        
	//   20   36:invokevirtual   #150 <Method int findOnePartiallyVisibleChild(int, int, boolean)>
	//   21   39:ireturn         
	}

	public int findFirstVisibleItemPosition()
	{
		if(mReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//*   2    4:getfield        #142 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
	//*   3    7:ifeq            26
			return findOneVisibleChild(mViews.size() - 1, -1, false);
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:getfield        #31  <Field ArrayList mViews>
	//    7   15:invokevirtual   #60  <Method int ArrayList.size()>
	//    8   18:iconst_1        
	//    9   19:isub            
	//   10   20:iconst_m1       
	//   11   21:iconst_0        
	//   12   22:invokevirtual   #146 <Method int findOneVisibleChild(int, int, boolean)>
	//   13   25:ireturn         
		else
			return findOneVisibleChild(0, mViews.size(), false);
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:aload_0         
	//   17   29:getfield        #31  <Field ArrayList mViews>
	//   18   32:invokevirtual   #60  <Method int ArrayList.size()>
	//   19   35:iconst_0        
	//   20   36:invokevirtual   #146 <Method int findOneVisibleChild(int, int, boolean)>
	//   21   39:ireturn         
	}

	public int findLastCompletelyVisibleItemPosition()
	{
		if(mReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//*   2    4:getfield        #142 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
	//*   3    7:ifeq            24
			return findOneVisibleChild(0, mViews.size(), true);
	//    4   10:aload_0         
	//    5   11:iconst_0        
	//    6   12:aload_0         
	//    7   13:getfield        #31  <Field ArrayList mViews>
	//    8   16:invokevirtual   #60  <Method int ArrayList.size()>
	//    9   19:iconst_1        
	//   10   20:invokevirtual   #146 <Method int findOneVisibleChild(int, int, boolean)>
	//   11   23:ireturn         
		else
			return findOneVisibleChild(mViews.size() - 1, -1, true);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #31  <Field ArrayList mViews>
	//   15   29:invokevirtual   #60  <Method int ArrayList.size()>
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:iconst_m1       
	//   19   35:iconst_1        
	//   20   36:invokevirtual   #146 <Method int findOneVisibleChild(int, int, boolean)>
	//   21   39:ireturn         
	}

	public int findLastPartiallyVisibleItemPosition()
	{
		if(mReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//*   2    4:getfield        #142 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
	//*   3    7:ifeq            24
			return findOnePartiallyVisibleChild(0, mViews.size(), true);
	//    4   10:aload_0         
	//    5   11:iconst_0        
	//    6   12:aload_0         
	//    7   13:getfield        #31  <Field ArrayList mViews>
	//    8   16:invokevirtual   #60  <Method int ArrayList.size()>
	//    9   19:iconst_1        
	//   10   20:invokevirtual   #150 <Method int findOnePartiallyVisibleChild(int, int, boolean)>
	//   11   23:ireturn         
		else
			return findOnePartiallyVisibleChild(mViews.size() - 1, -1, true);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #31  <Field ArrayList mViews>
	//   15   29:invokevirtual   #60  <Method int ArrayList.size()>
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:iconst_m1       
	//   19   35:iconst_1        
	//   20   36:invokevirtual   #150 <Method int findOnePartiallyVisibleChild(int, int, boolean)>
	//   21   39:ireturn         
	}

	public int findLastVisibleItemPosition()
	{
		if(mReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//*   2    4:getfield        #142 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
	//*   3    7:ifeq            24
			return findOneVisibleChild(0, mViews.size(), false);
	//    4   10:aload_0         
	//    5   11:iconst_0        
	//    6   12:aload_0         
	//    7   13:getfield        #31  <Field ArrayList mViews>
	//    8   16:invokevirtual   #60  <Method int ArrayList.size()>
	//    9   19:iconst_0        
	//   10   20:invokevirtual   #146 <Method int findOneVisibleChild(int, int, boolean)>
	//   11   23:ireturn         
		else
			return findOneVisibleChild(mViews.size() - 1, -1, false);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #31  <Field ArrayList mViews>
	//   15   29:invokevirtual   #60  <Method int ArrayList.size()>
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:iconst_m1       
	//   19   35:iconst_0        
	//   20   36:invokevirtual   #146 <Method int findOneVisibleChild(int, int, boolean)>
	//   21   39:ireturn         
	}

	int findOnePartiallyOrCompletelyVisibleChild(int i, int j, boolean flag, boolean flag1, boolean flag2)
	{
		int l = mPrimaryOrientation.getStartAfterPadding();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//    2    4:getfield        #71  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//    3    7:invokevirtual   #95  <Method int OrientationHelper.getStartAfterPadding()>
	//    4   10:istore          9
		int i1 = mPrimaryOrientation.getEndAfterPadding();
	//    5   12:aload_0         
	//    6   13:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//    7   16:getfield        #71  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//    8   19:invokevirtual   #92  <Method int OrientationHelper.getEndAfterPadding()>
	//    9   22:istore          10
		byte byte0;
		int k;
		if(j > i)
	//*  10   24:iload_2         
	//*  11   25:iload_1         
	//*  12   26:icmple          154
		{
			byte0 = 1;
	//   13   29:iconst_1        
	//   14   30:istore          7
			k = i;
	//   15   32:iload_1         
	//   16   33:istore          8
		} else
	//*  17   35:iload           8
	//*  18   37:iload_2         
	//*  19   38:icmpeq          259
	//*  20   41:aload_0         
	//*  21   42:getfield        #31  <Field ArrayList mViews>
	//*  22   45:iload           8
	//*  23   47:invokevirtual   #100 <Method Object ArrayList.get(int)>
	//*  24   50:checkcast       #102 <Class View>
	//*  25   53:astore          13
	//*  26   55:aload_0         
	//*  27   56:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//*  28   59:getfield        #71  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//*  29   62:aload           13
	//*  30   64:invokevirtual   #134 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  31   67:istore          11
	//*  32   69:aload_0         
	//*  33   70:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//*  34   73:getfield        #71  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//*  35   76:aload           13
	//*  36   78:invokevirtual   #105 <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  37   81:istore          12
	//*  38   83:iload           5
	//*  39   85:ifeq            168
	//*  40   88:iload           11
	//*  41   90:iload           10
	//*  42   92:icmpgt          163
	//*  43   95:iconst_1        
	//*  44   96:istore_1        
	//*  45   97:iload           5
	//*  46   99:ifeq            191
	//*  47  102:iload           12
	//*  48  104:iload           9
	//*  49  106:icmplt          185
	//*  50  109:iconst_1        
	//*  51  110:istore          6
	//*  52  112:iload_1         
	//*  53  113:ifeq            249
	//*  54  116:iload           6
	//*  55  118:ifeq            249
	//*  56  121:iload_3         
	//*  57  122:ifeq            210
	//*  58  125:iload           4
	//*  59  127:ifeq            210
	//*  60  130:iload           11
	//*  61  132:iload           9
	//*  62  134:icmplt          249
	//*  63  137:iload           12
	//*  64  139:iload           10
	//*  65  141:icmpgt          249
	//*  66  144:aload_0         
	//*  67  145:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//*  68  148:aload           13
	//*  69  150:invokevirtual   #159 <Method int StaggeredGridLayoutManager.getPosition(View)>
	//*  70  153:ireturn         
		{
			byte0 = -1;
	//   71  154:iconst_m1       
	//   72  155:istore          7
			k = i;
	//   73  157:iload_1         
	//   74  158:istore          8
		}
		for(; k != j; k += ((int) (byte0)))
		{
			View view = (View)mViews.get(k);
			int j1 = mPrimaryOrientation.getDecoratedStart(view);
			int k1 = mPrimaryOrientation.getDecoratedEnd(view);
			boolean flag3;
			if(flag2)
			{
				if(j1 <= i1)
					i = 1;
				else
	//*  75  160:goto            35
					i = 0;
	//   76  163:iconst_0        
	//   77  164:istore_1        
			} else
	//*  78  165:goto            97
			if(j1 < i1)
	//*  79  168:iload           11
	//*  80  170:iload           10
	//*  81  172:icmpge          180
				i = 1;
	//   82  175:iconst_1        
	//   83  176:istore_1        
			else
	//*  84  177:goto            97
				i = 0;
	//   85  180:iconst_0        
	//   86  181:istore_1        
			if(flag2)
			{
				if(k1 >= l)
					flag3 = true;
				else
	//*  87  182:goto            97
					flag3 = false;
	//   88  185:iconst_0        
	//   89  186:istore          6
			} else
	//*  90  188:goto            112
			if(k1 > l)
	//*  91  191:iload           12
	//*  92  193:iload           9
	//*  93  195:icmple          204
				flag3 = true;
	//   94  198:iconst_1        
	//   95  199:istore          6
			else
	//*  96  201:goto            112
				flag3 = false;
	//   97  204:iconst_0        
	//   98  205:istore          6
			if(i == 0 || !flag3)
				continue;
			if(flag && flag1)
			{
				if(j1 >= l && k1 <= i1)
					return getPosition(view);
				continue;
			}
	//*  99  207:goto            112
			if(flag1)
	//* 100  210:iload           4
	//* 101  212:ifeq            225
				return getPosition(view);
	//  102  215:aload_0         
	//  103  216:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//  104  219:aload           13
	//  105  221:invokevirtual   #159 <Method int StaggeredGridLayoutManager.getPosition(View)>
	//  106  224:ireturn         
			if(j1 < l || k1 > i1)
	//* 107  225:iload           11
	//* 108  227:iload           9
	//* 109  229:icmplt          239
	//* 110  232:iload           12
	//* 111  234:iload           10
	//* 112  236:icmple          249
				return getPosition(view);
	//  113  239:aload_0         
	//  114  240:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//  115  243:aload           13
	//  116  245:invokevirtual   #159 <Method int StaggeredGridLayoutManager.getPosition(View)>
	//  117  248:ireturn         
		}

	//  118  249:iload           8
	//  119  251:iload           7
	//  120  253:iadd            
	//  121  254:istore          8
	//* 122  256:goto            35
		return -1;
	//  123  259:iconst_m1       
	//  124  260:ireturn         
	}

	int findOnePartiallyVisibleChild(int i, int j, boolean flag)
	{
		return findOnePartiallyOrCompletelyVisibleChild(i, j, false, false, flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:iconst_0        
	//    5    5:iload_3         
	//    6    6:invokevirtual   #161 <Method int findOnePartiallyOrCompletelyVisibleChild(int, int, boolean, boolean, boolean)>
	//    7    9:ireturn         
	}

	int findOneVisibleChild(int i, int j, boolean flag)
	{
		return findOnePartiallyOrCompletelyVisibleChild(i, j, flag, true, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iconst_1        
	//    5    5:iconst_0        
	//    6    6:invokevirtual   #161 <Method int findOnePartiallyOrCompletelyVisibleChild(int, int, boolean, boolean, boolean)>
	//    7    9:ireturn         
	}

	public int getDeletedSize()
	{
		return mDeletedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int mDeletedSize>
	//    2    4:ireturn         
	}

	int getEndLine()
	{
		if(mCachedEnd != 0x80000000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field int mCachedEnd>
	//*   2    4:ldc1            #10  <Int 0x80000000>
	//*   3    6:icmpeq          14
		{
			return mCachedEnd;
	//    4    9:aload_0         
	//    5   10:getfield        #35  <Field int mCachedEnd>
	//    6   13:ireturn         
		} else
		{
			calculateCachedEnd();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #164 <Method void calculateCachedEnd()>
			return mCachedEnd;
	//    9   18:aload_0         
	//   10   19:getfield        #35  <Field int mCachedEnd>
	//   11   22:ireturn         
		}
	}

	int getEndLine(int i)
	{
		if(mCachedEnd != 0x80000000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field int mCachedEnd>
	//*   2    4:ldc1            #10  <Int 0x80000000>
	//*   3    6:icmpeq          16
			i = mCachedEnd;
	//    4    9:aload_0         
	//    5   10:getfield        #35  <Field int mCachedEnd>
	//    6   13:istore_1        
		else
	//*   7   14:iload_1         
	//*   8   15:ireturn         
		if(mViews.size() != 0)
	//*   9   16:aload_0         
	//*  10   17:getfield        #31  <Field ArrayList mViews>
	//*  11   20:invokevirtual   #60  <Method int ArrayList.size()>
	//*  12   23:ifeq            14
		{
			calculateCachedEnd();
	//   13   26:aload_0         
	//   14   27:invokevirtual   #164 <Method void calculateCachedEnd()>
			return mCachedEnd;
	//   15   30:aload_0         
	//   16   31:getfield        #35  <Field int mCachedEnd>
	//   17   34:ireturn         
		}
		return i;
	}

	public View getFocusableViewAfter(int i, int j)
	{
		View view2 = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		View view = null;
	//    2    3:aconst_null     
	//    3    4:astore          4
		if(j == -1)
	//*   4    6:iload_2         
	//*   5    7:iconst_m1       
	//*   6    8:icmpne          107
		{
			int k = mViews.size();
	//    7   11:aload_0         
	//    8   12:getfield        #31  <Field ArrayList mViews>
	//    9   15:invokevirtual   #60  <Method int ArrayList.size()>
	//   10   18:istore_3        
			j = 0;
	//   11   19:iconst_0        
	//   12   20:istore_2        
			do
			{
				if(j < k)
	//*  13   21:iload_2         
	//*  14   22:iload_3         
	//*  15   23:icmpge          85
				{
					view2 = (View)mViews.get(j);
	//   16   26:aload_0         
	//   17   27:getfield        #31  <Field ArrayList mViews>
	//   18   30:iload_2         
	//   19   31:invokevirtual   #100 <Method Object ArrayList.get(int)>
	//   20   34:checkcast       #102 <Class View>
	//   21   37:astore          5
					break MISSING_BLOCK_LABEL_39;
				}
				do
	//*  22   39:aload_0         
	//*  23   40:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//*  24   43:getfield        #142 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
	//*  25   46:ifeq            62
	//*  26   49:aload_0         
	//*  27   50:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//*  28   53:aload           5
	//*  29   55:invokevirtual   #159 <Method int StaggeredGridLayoutManager.getPosition(View)>
	//*  30   58:iload_1         
	//*  31   59:icmple          85
	//*  32   62:aload_0         
	//*  33   63:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//*  34   66:getfield        #142 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
	//*  35   69:ifne            88
	//*  36   72:aload_0         
	//*  37   73:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//*  38   76:aload           5
	//*  39   78:invokevirtual   #159 <Method int StaggeredGridLayoutManager.getPosition(View)>
	//*  40   81:iload_1         
	//*  41   82:icmplt          88
					return view;
	//   42   85:aload           4
	//   43   87:areturn         
				while(mReverseLayout && getPosition(view2) <= i || !mReverseLayout && getPosition(view2) >= i || !view2.hasFocusable());
	//   44   88:aload           5
	//   45   90:invokevirtual   #169 <Method boolean View.hasFocusable()>
	//   46   93:ifeq            85
				j++;
	//   47   96:iload_2         
	//   48   97:iconst_1        
	//   49   98:iadd            
	//   50   99:istore_2        
				view = view2;
	//   51  100:aload           5
	//   52  102:astore          4
			} while(true);
	//   53  104:goto            21
		} else
		{
			j = mViews.size() - 1;
	//   54  107:aload_0         
	//   55  108:getfield        #31  <Field ArrayList mViews>
	//   56  111:invokevirtual   #60  <Method int ArrayList.size()>
	//   57  114:iconst_1        
	//   58  115:isub            
	//   59  116:istore_2        
			View view1 = view2;
	//   60  117:aload           5
	//   61  119:astore          4
			do
			{
				if(j < 0)
					break;
	//   62  121:iload_2         
	//   63  122:iflt            206
				View view3 = (View)mViews.get(j);
	//   64  125:aload_0         
	//   65  126:getfield        #31  <Field ArrayList mViews>
	//   66  129:iload_2         
	//   67  130:invokevirtual   #100 <Method Object ArrayList.get(int)>
	//   68  133:checkcast       #102 <Class View>
	//   69  136:astore          5
				if(mReverseLayout && getPosition(view3) >= i)
					break;
	//   70  138:aload_0         
	//   71  139:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//   72  142:getfield        #142 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
	//   73  145:ifeq            161
	//   74  148:aload_0         
	//   75  149:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//   76  152:aload           5
	//   77  154:invokevirtual   #159 <Method int StaggeredGridLayoutManager.getPosition(View)>
	//   78  157:iload_1         
	//   79  158:icmpge          206
				if(!mReverseLayout && getPosition(view3) <= i)
	//*  80  161:aload_0         
	//*  81  162:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//*  82  165:getfield        #142 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
	//*  83  168:ifne            187
	//*  84  171:aload_0         
	//*  85  172:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//*  86  175:aload           5
	//*  87  177:invokevirtual   #159 <Method int StaggeredGridLayoutManager.getPosition(View)>
	//*  88  180:iload_1         
	//*  89  181:icmpgt          187
					return view1;
	//   90  184:aload           4
	//   91  186:areturn         
				if(!view3.hasFocusable())
					break;
	//   92  187:aload           5
	//   93  189:invokevirtual   #169 <Method boolean View.hasFocusable()>
	//   94  192:ifeq            206
				j--;
	//   95  195:iload_2         
	//   96  196:iconst_1        
	//   97  197:isub            
	//   98  198:istore_2        
				view1 = view3;
	//   99  199:aload           5
	//  100  201:astore          4
			} while(true);
	//  101  203:goto            121
			return view1;
	//  102  206:aload           4
	//  103  208:areturn         
		}
	}

	tParams getLayoutParams(View view)
	{
		return (tParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #172 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #48  <Class StaggeredGridLayoutManager$LayoutParams>
	//    3    7:areturn         
	}

	int getStartLine()
	{
		if(mCachedStart != 0x80000000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field int mCachedStart>
	//*   2    4:ldc1            #10  <Int 0x80000000>
	//*   3    6:icmpeq          14
		{
			return mCachedStart;
	//    4    9:aload_0         
	//    5   10:getfield        #33  <Field int mCachedStart>
	//    6   13:ireturn         
		} else
		{
			calculateCachedStart();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #174 <Method void calculateCachedStart()>
			return mCachedStart;
	//    9   18:aload_0         
	//   10   19:getfield        #33  <Field int mCachedStart>
	//   11   22:ireturn         
		}
	}

	int getStartLine(int i)
	{
		if(mCachedStart != 0x80000000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field int mCachedStart>
	//*   2    4:ldc1            #10  <Int 0x80000000>
	//*   3    6:icmpeq          16
			i = mCachedStart;
	//    4    9:aload_0         
	//    5   10:getfield        #33  <Field int mCachedStart>
	//    6   13:istore_1        
		else
	//*   7   14:iload_1         
	//*   8   15:ireturn         
		if(mViews.size() != 0)
	//*   9   16:aload_0         
	//*  10   17:getfield        #31  <Field ArrayList mViews>
	//*  11   20:invokevirtual   #60  <Method int ArrayList.size()>
	//*  12   23:ifeq            14
		{
			calculateCachedStart();
	//   13   26:aload_0         
	//   14   27:invokevirtual   #174 <Method void calculateCachedStart()>
			return mCachedStart;
	//   15   30:aload_0         
	//   16   31:getfield        #33  <Field int mCachedStart>
	//   17   34:ireturn         
		}
		return i;
	}

	void invalidateCache()
	{
		mCachedStart = 0x80000000;
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <Int 0x80000000>
	//    2    3:putfield        #33  <Field int mCachedStart>
		mCachedEnd = 0x80000000;
	//    3    6:aload_0         
	//    4    7:ldc1            #10  <Int 0x80000000>
	//    5    9:putfield        #35  <Field int mCachedEnd>
	//    6   12:return          
	}

	void onOffset(int i)
	{
		if(mCachedStart != 0x80000000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field int mCachedStart>
	//*   2    4:ldc1            #10  <Int 0x80000000>
	//*   3    6:icmpeq          19
			mCachedStart = mCachedStart + i;
	//    4    9:aload_0         
	//    5   10:aload_0         
	//    6   11:getfield        #33  <Field int mCachedStart>
	//    7   14:iload_1         
	//    8   15:iadd            
	//    9   16:putfield        #33  <Field int mCachedStart>
		if(mCachedEnd != 0x80000000)
	//*  10   19:aload_0         
	//*  11   20:getfield        #35  <Field int mCachedEnd>
	//*  12   23:ldc1            #10  <Int 0x80000000>
	//*  13   25:icmpeq          38
			mCachedEnd = mCachedEnd + i;
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #35  <Field int mCachedEnd>
	//   17   33:iload_1         
	//   18   34:iadd            
	//   19   35:putfield        #35  <Field int mCachedEnd>
	//   20   38:return          
	}

	void popEnd()
	{
		int i = mViews.size();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ArrayList mViews>
	//    2    4:invokevirtual   #60  <Method int ArrayList.size()>
	//    3    7:istore_1        
		View view = (View)mViews.remove(i - 1);
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field ArrayList mViews>
	//    6   12:iload_1         
	//    7   13:iconst_1        
	//    8   14:isub            
	//    9   15:invokevirtual   #180 <Method Object ArrayList.remove(int)>
	//   10   18:checkcast       #102 <Class View>
	//   11   21:astore_2        
		tParams tparams = getLayoutParams(view);
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:invokevirtual   #46  <Method StaggeredGridLayoutManager$LayoutParams getLayoutParams(View)>
	//   15   27:astore_3        
		tparams.mSpan = null;
	//   16   28:aload_3         
	//   17   29:aconst_null     
	//   18   30:putfield        #52  <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
		if(tparams.isItemRemoved() || tparams.isItemChanged())
	//*  19   33:aload_3         
	//*  20   34:invokevirtual   #64  <Method boolean StaggeredGridLayoutManager$LayoutParams.isItemRemoved()>
	//*  21   37:ifne            47
	//*  22   40:aload_3         
	//*  23   41:invokevirtual   #67  <Method boolean StaggeredGridLayoutManager$LayoutParams.isItemChanged()>
	//*  24   44:ifeq            67
			mDeletedSize = mDeletedSize - mPrimaryOrientation.getDecoratedMeasurement(view);
	//   25   47:aload_0         
	//   26   48:aload_0         
	//   27   49:getfield        #37  <Field int mDeletedSize>
	//   28   52:aload_0         
	//   29   53:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//   30   56:getfield        #71  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//   31   59:aload_2         
	//   32   60:invokevirtual   #77  <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   33   63:isub            
	//   34   64:putfield        #37  <Field int mDeletedSize>
		if(i == 1)
	//*  35   67:iload_1         
	//*  36   68:iconst_1        
	//*  37   69:icmpne          78
			mCachedStart = 0x80000000;
	//   38   72:aload_0         
	//   39   73:ldc1            #10  <Int 0x80000000>
	//   40   75:putfield        #33  <Field int mCachedStart>
		mCachedEnd = 0x80000000;
	//   41   78:aload_0         
	//   42   79:ldc1            #10  <Int 0x80000000>
	//   43   81:putfield        #35  <Field int mCachedEnd>
	//   44   84:return          
	}

	void popStart()
	{
		View view = (View)mViews.remove(0);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ArrayList mViews>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #180 <Method Object ArrayList.remove(int)>
	//    4    8:checkcast       #102 <Class View>
	//    5   11:astore_1        
		tParams tparams = getLayoutParams(view);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #46  <Method StaggeredGridLayoutManager$LayoutParams getLayoutParams(View)>
	//    9   17:astore_2        
		tparams.mSpan = null;
	//   10   18:aload_2         
	//   11   19:aconst_null     
	//   12   20:putfield        #52  <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
		if(mViews.size() == 0)
	//*  13   23:aload_0         
	//*  14   24:getfield        #31  <Field ArrayList mViews>
	//*  15   27:invokevirtual   #60  <Method int ArrayList.size()>
	//*  16   30:ifne            39
			mCachedEnd = 0x80000000;
	//   17   33:aload_0         
	//   18   34:ldc1            #10  <Int 0x80000000>
	//   19   36:putfield        #35  <Field int mCachedEnd>
		if(tparams.isItemRemoved() || tparams.isItemChanged())
	//*  20   39:aload_2         
	//*  21   40:invokevirtual   #64  <Method boolean StaggeredGridLayoutManager$LayoutParams.isItemRemoved()>
	//*  22   43:ifne            53
	//*  23   46:aload_2         
	//*  24   47:invokevirtual   #67  <Method boolean StaggeredGridLayoutManager$LayoutParams.isItemChanged()>
	//*  25   50:ifeq            73
			mDeletedSize = mDeletedSize - mPrimaryOrientation.getDecoratedMeasurement(view);
	//   26   53:aload_0         
	//   27   54:aload_0         
	//   28   55:getfield        #37  <Field int mDeletedSize>
	//   29   58:aload_0         
	//   30   59:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//   31   62:getfield        #71  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//   32   65:aload_1         
	//   33   66:invokevirtual   #77  <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   34   69:isub            
	//   35   70:putfield        #37  <Field int mDeletedSize>
		mCachedStart = 0x80000000;
	//   36   73:aload_0         
	//   37   74:ldc1            #10  <Int 0x80000000>
	//   38   76:putfield        #33  <Field int mCachedStart>
	//   39   79:return          
	}

	void prependToSpan(View view)
	{
		tParams tparams = getLayoutParams(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #46  <Method StaggeredGridLayoutManager$LayoutParams getLayoutParams(View)>
	//    3    5:astore_2        
		tparams.mSpan = this;
	//    4    6:aload_2         
	//    5    7:aload_0         
	//    6    8:putfield        #52  <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
		mViews.add(0, ((Object) (view)));
	//    7   11:aload_0         
	//    8   12:getfield        #31  <Field ArrayList mViews>
	//    9   15:iconst_0        
	//   10   16:aload_1         
	//   11   17:invokevirtual   #185 <Method void ArrayList.add(int, Object)>
		mCachedStart = 0x80000000;
	//   12   20:aload_0         
	//   13   21:ldc1            #10  <Int 0x80000000>
	//   14   23:putfield        #33  <Field int mCachedStart>
		if(mViews.size() == 1)
	//*  15   26:aload_0         
	//*  16   27:getfield        #31  <Field ArrayList mViews>
	//*  17   30:invokevirtual   #60  <Method int ArrayList.size()>
	//*  18   33:iconst_1        
	//*  19   34:icmpne          43
			mCachedEnd = 0x80000000;
	//   20   37:aload_0         
	//   21   38:ldc1            #10  <Int 0x80000000>
	//   22   40:putfield        #35  <Field int mCachedEnd>
		if(tparams.isItemRemoved() || tparams.isItemChanged())
	//*  23   43:aload_2         
	//*  24   44:invokevirtual   #64  <Method boolean StaggeredGridLayoutManager$LayoutParams.isItemRemoved()>
	//*  25   47:ifne            57
	//*  26   50:aload_2         
	//*  27   51:invokevirtual   #67  <Method boolean StaggeredGridLayoutManager$LayoutParams.isItemChanged()>
	//*  28   54:ifeq            77
			mDeletedSize = mDeletedSize + mPrimaryOrientation.getDecoratedMeasurement(view);
	//   29   57:aload_0         
	//   30   58:aload_0         
	//   31   59:getfield        #37  <Field int mDeletedSize>
	//   32   62:aload_0         
	//   33   63:getfield        #23  <Field StaggeredGridLayoutManager this$0>
	//   34   66:getfield        #71  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//   35   69:aload_1         
	//   36   70:invokevirtual   #77  <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   37   73:iadd            
	//   38   74:putfield        #37  <Field int mDeletedSize>
	//   39   77:return          
	}

	void setLine(int i)
	{
		mCachedStart = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #33  <Field int mCachedStart>
		mCachedEnd = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #35  <Field int mCachedEnd>
	//    6   10:return          
	}

	static final int INVALID_LINE = 0x80000000;
	int mCachedEnd;
	int mCachedStart;
	int mDeletedSize;
	final int mIndex;
	ArrayList mViews;
	final StaggeredGridLayoutManager this$0;

	StaggeredGridLayoutManager$Span(int i)
	{
		this$0 = StaggeredGridLayoutManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field StaggeredGridLayoutManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #26  <Method void Object()>
		mViews = new ArrayList();
	//    5    9:aload_0         
	//    6   10:new             #28  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #29  <Method void ArrayList()>
	//    9   17:putfield        #31  <Field ArrayList mViews>
		mCachedStart = 0x80000000;
	//   10   20:aload_0         
	//   11   21:ldc1            #10  <Int 0x80000000>
	//   12   23:putfield        #33  <Field int mCachedStart>
		mCachedEnd = 0x80000000;
	//   13   26:aload_0         
	//   14   27:ldc1            #10  <Int 0x80000000>
	//   15   29:putfield        #35  <Field int mCachedEnd>
		mDeletedSize = 0;
	//   16   32:aload_0         
	//   17   33:iconst_0        
	//   18   34:putfield        #37  <Field int mDeletedSize>
		mIndex = i;
	//   19   37:aload_0         
	//   20   38:iload_2         
	//   21   39:putfield        #39  <Field int mIndex>
	//   22   42:return          
	}
}
