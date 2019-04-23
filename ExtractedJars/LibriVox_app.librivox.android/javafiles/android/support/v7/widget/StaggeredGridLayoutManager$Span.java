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
	//    2    2:invokevirtual   #42  <Method StaggeredGridLayoutManager$LayoutParams getLayoutParams(View)>
	//    3    5:astore_2        
		tparams.mSpan = this;
	//    4    6:aload_2         
	//    5    7:aload_0         
	//    6    8:putfield        #48  <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
		mViews.add(((Object) (view)));
	//    7   11:aload_0         
	//    8   12:getfield        #27  <Field ArrayList mViews>
	//    9   15:aload_1         
	//   10   16:invokevirtual   #52  <Method boolean ArrayList.add(Object)>
	//   11   19:pop             
		mCachedEnd = 0x80000000;
	//   12   20:aload_0         
	//   13   21:ldc1            #7   <Int 0x80000000>
	//   14   23:putfield        #31  <Field int mCachedEnd>
		if(mViews.size() == 1)
	//*  15   26:aload_0         
	//*  16   27:getfield        #27  <Field ArrayList mViews>
	//*  17   30:invokevirtual   #56  <Method int ArrayList.size()>
	//*  18   33:iconst_1        
	//*  19   34:icmpne          43
			mCachedStart = 0x80000000;
	//   20   37:aload_0         
	//   21   38:ldc1            #7   <Int 0x80000000>
	//   22   40:putfield        #29  <Field int mCachedStart>
		if(tparams.isItemRemoved() || tparams.isItemChanged())
	//*  23   43:aload_2         
	//*  24   44:invokevirtual   #60  <Method boolean StaggeredGridLayoutManager$LayoutParams.isItemRemoved()>
	//*  25   47:ifne            57
	//*  26   50:aload_2         
	//*  27   51:invokevirtual   #63  <Method boolean StaggeredGridLayoutManager$LayoutParams.isItemChanged()>
	//*  28   54:ifeq            77
			mDeletedSize = mDeletedSize + mPrimaryOrientation.getDecoratedMeasurement(view);
	//   29   57:aload_0         
	//   30   58:aload_0         
	//   31   59:getfield        #33  <Field int mDeletedSize>
	//   32   62:aload_0         
	//   33   63:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//   34   66:getfield        #69  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//   35   69:aload_1         
	//   36   70:invokevirtual   #75  <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   37   73:iadd            
	//   38   74:putfield        #33  <Field int mDeletedSize>
	//   39   77:return          
	}

	void cacheReferenceLineAndClear(boolean flag, int i)
	{
		int j;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            14
			j = getEndLine(0x80000000);
	//    2    4:aload_0         
	//    3    5:ldc1            #7   <Int 0x80000000>
	//    4    7:invokevirtual   #81  <Method int getEndLine(int)>
	//    5   10:istore_3        
		else
	//*   6   11:goto            21
			j = getStartLine(0x80000000);
	//    7   14:aload_0         
	//    8   15:ldc1            #7   <Int 0x80000000>
	//    9   17:invokevirtual   #84  <Method int getStartLine(int)>
	//   10   20:istore_3        
		clear();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #87  <Method void clear()>
		if(j == 0x80000000)
	//*  13   25:iload_3         
	//*  14   26:ldc1            #7   <Int 0x80000000>
	//*  15   28:icmpne          32
			return;
	//   16   31:return          
		if(flag && j < mPrimaryOrientation.getEndAfterPadding() || !flag && j > mPrimaryOrientation.getStartAfterPadding())
	//*  17   32:iload_1         
	//*  18   33:ifeq            50
	//*  19   36:iload_3         
	//*  20   37:aload_0         
	//*  21   38:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//*  22   41:getfield        #69  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//*  23   44:invokevirtual   #90  <Method int OrientationHelper.getEndAfterPadding()>
	//*  24   47:icmplt          68
	//*  25   50:iload_1         
	//*  26   51:ifne            69
	//*  27   54:iload_3         
	//*  28   55:aload_0         
	//*  29   56:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//*  30   59:getfield        #69  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//*  31   62:invokevirtual   #93  <Method int OrientationHelper.getStartAfterPadding()>
	//*  32   65:icmple          69
			return;
	//   33   68:return          
		int k = j;
	//   34   69:iload_3         
	//   35   70:istore          4
		if(i != 0x80000000)
	//*  36   72:iload_2         
	//*  37   73:ldc1            #7   <Int 0x80000000>
	//*  38   75:icmpeq          83
			k = j + i;
	//   39   78:iload_3         
	//   40   79:iload_2         
	//   41   80:iadd            
	//   42   81:istore          4
		mCachedEnd = k;
	//   43   83:aload_0         
	//   44   84:iload           4
	//   45   86:putfield        #31  <Field int mCachedEnd>
		mCachedStart = k;
	//   46   89:aload_0         
	//   47   90:iload           4
	//   48   92:putfield        #29  <Field int mCachedStart>
	//   49   95:return          
	}

	void calculateCachedEnd()
	{
		Object obj = ((Object) (mViews));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ArrayList mViews>
	//    2    4:astore_1        
		obj = ((Object) ((View)((ArrayList) (obj)).get(((ArrayList) (obj)).size() - 1)));
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #56  <Method int ArrayList.size()>
	//    6   10:iconst_1        
	//    7   11:isub            
	//    8   12:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//    9   15:checkcast       #100 <Class View>
	//   10   18:astore_1        
		tParams tparams = getLayoutParams(((View) (obj)));
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #42  <Method StaggeredGridLayoutManager$LayoutParams getLayoutParams(View)>
	//   14   24:astore_2        
		mCachedEnd = mPrimaryOrientation.getDecoratedEnd(((View) (obj)));
	//   15   25:aload_0         
	//   16   26:aload_0         
	//   17   27:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//   18   30:getfield        #69  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//   19   33:aload_1         
	//   20   34:invokevirtual   #103 <Method int OrientationHelper.getDecoratedEnd(View)>
	//   21   37:putfield        #31  <Field int mCachedEnd>
		if(tparams.mFullSpan)
	//*  22   40:aload_2         
	//*  23   41:getfield        #107 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*  24   44:ifeq            91
		{
			panLookup.FullSpanItem fullspanitem = mLazySpanLookup.getFullSpanItem(tparams.getViewLayoutPosition());
	//   25   47:aload_0         
	//   26   48:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//   27   51:getfield        #111 <Field StaggeredGridLayoutManager$LazySpanLookup StaggeredGridLayoutManager.mLazySpanLookup>
	//   28   54:aload_2         
	//   29   55:invokevirtual   #114 <Method int StaggeredGridLayoutManager$LayoutParams.getViewLayoutPosition()>
	//   30   58:invokevirtual   #120 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem StaggeredGridLayoutManager$LazySpanLookup.getFullSpanItem(int)>
	//   31   61:astore_1        
			if(fullspanitem != null && fullspanitem.mGapDir == 1)
	//*  32   62:aload_1         
	//*  33   63:ifnull          91
	//*  34   66:aload_1         
	//*  35   67:getfield        #125 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapDir>
	//*  36   70:iconst_1        
	//*  37   71:icmpne          91
				mCachedEnd = mCachedEnd + fullspanitem.getGapForSpan(mIndex);
	//   38   74:aload_0         
	//   39   75:aload_0         
	//   40   76:getfield        #31  <Field int mCachedEnd>
	//   41   79:aload_1         
	//   42   80:aload_0         
	//   43   81:getfield        #35  <Field int mIndex>
	//   44   84:invokevirtual   #128 <Method int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.getGapForSpan(int)>
	//   45   87:iadd            
	//   46   88:putfield        #31  <Field int mCachedEnd>
		}
	//   47   91:return          
	}

	void calculateCachedStart()
	{
		View view = (View)mViews.get(0);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ArrayList mViews>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #100 <Class View>
	//    5   11:astore_1        
		tParams tparams = getLayoutParams(view);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #42  <Method StaggeredGridLayoutManager$LayoutParams getLayoutParams(View)>
	//    9   17:astore_2        
		mCachedStart = mPrimaryOrientation.getDecoratedStart(view);
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//   13   23:getfield        #69  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #132 <Method int OrientationHelper.getDecoratedStart(View)>
	//   16   30:putfield        #29  <Field int mCachedStart>
		if(tparams.mFullSpan)
	//*  17   33:aload_2         
	//*  18   34:getfield        #107 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*  19   37:ifeq            84
		{
			panLookup.FullSpanItem fullspanitem = mLazySpanLookup.getFullSpanItem(tparams.getViewLayoutPosition());
	//   20   40:aload_0         
	//   21   41:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//   22   44:getfield        #111 <Field StaggeredGridLayoutManager$LazySpanLookup StaggeredGridLayoutManager.mLazySpanLookup>
	//   23   47:aload_2         
	//   24   48:invokevirtual   #114 <Method int StaggeredGridLayoutManager$LayoutParams.getViewLayoutPosition()>
	//   25   51:invokevirtual   #120 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem StaggeredGridLayoutManager$LazySpanLookup.getFullSpanItem(int)>
	//   26   54:astore_1        
			if(fullspanitem != null && fullspanitem.mGapDir == -1)
	//*  27   55:aload_1         
	//*  28   56:ifnull          84
	//*  29   59:aload_1         
	//*  30   60:getfield        #125 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapDir>
	//*  31   63:iconst_m1       
	//*  32   64:icmpne          84
				mCachedStart = mCachedStart - fullspanitem.getGapForSpan(mIndex);
	//   33   67:aload_0         
	//   34   68:aload_0         
	//   35   69:getfield        #29  <Field int mCachedStart>
	//   36   72:aload_1         
	//   37   73:aload_0         
	//   38   74:getfield        #35  <Field int mIndex>
	//   39   77:invokevirtual   #128 <Method int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.getGapForSpan(int)>
	//   40   80:isub            
	//   41   81:putfield        #29  <Field int mCachedStart>
		}
	//   42   84:return          
	}

	void clear()
	{
		mViews.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ArrayList mViews>
	//    2    4:invokevirtual   #133 <Method void ArrayList.clear()>
		invalidateCache();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #136 <Method void invalidateCache()>
		mDeletedSize = 0;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #33  <Field int mDeletedSize>
	//    8   16:return          
	}

	public int findFirstCompletelyVisibleItemPosition()
	{
		if(mReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//*   2    4:getfield        #140 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
	//*   3    7:ifeq            26
			return findOneVisibleChild(mViews.size() - 1, -1, true);
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field ArrayList mViews>
	//    7   15:invokevirtual   #56  <Method int ArrayList.size()>
	//    8   18:iconst_1        
	//    9   19:isub            
	//   10   20:iconst_m1       
	//   11   21:iconst_1        
	//   12   22:invokevirtual   #144 <Method int findOneVisibleChild(int, int, boolean)>
	//   13   25:ireturn         
		else
			return findOneVisibleChild(0, mViews.size(), true);
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:aload_0         
	//   17   29:getfield        #27  <Field ArrayList mViews>
	//   18   32:invokevirtual   #56  <Method int ArrayList.size()>
	//   19   35:iconst_1        
	//   20   36:invokevirtual   #144 <Method int findOneVisibleChild(int, int, boolean)>
	//   21   39:ireturn         
	}

	public int findFirstPartiallyVisibleItemPosition()
	{
		if(mReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//*   2    4:getfield        #140 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
	//*   3    7:ifeq            26
			return findOnePartiallyVisibleChild(mViews.size() - 1, -1, true);
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field ArrayList mViews>
	//    7   15:invokevirtual   #56  <Method int ArrayList.size()>
	//    8   18:iconst_1        
	//    9   19:isub            
	//   10   20:iconst_m1       
	//   11   21:iconst_1        
	//   12   22:invokevirtual   #148 <Method int findOnePartiallyVisibleChild(int, int, boolean)>
	//   13   25:ireturn         
		else
			return findOnePartiallyVisibleChild(0, mViews.size(), true);
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:aload_0         
	//   17   29:getfield        #27  <Field ArrayList mViews>
	//   18   32:invokevirtual   #56  <Method int ArrayList.size()>
	//   19   35:iconst_1        
	//   20   36:invokevirtual   #148 <Method int findOnePartiallyVisibleChild(int, int, boolean)>
	//   21   39:ireturn         
	}

	public int findFirstVisibleItemPosition()
	{
		if(mReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//*   2    4:getfield        #140 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
	//*   3    7:ifeq            26
			return findOneVisibleChild(mViews.size() - 1, -1, false);
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field ArrayList mViews>
	//    7   15:invokevirtual   #56  <Method int ArrayList.size()>
	//    8   18:iconst_1        
	//    9   19:isub            
	//   10   20:iconst_m1       
	//   11   21:iconst_0        
	//   12   22:invokevirtual   #144 <Method int findOneVisibleChild(int, int, boolean)>
	//   13   25:ireturn         
		else
			return findOneVisibleChild(0, mViews.size(), false);
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:aload_0         
	//   17   29:getfield        #27  <Field ArrayList mViews>
	//   18   32:invokevirtual   #56  <Method int ArrayList.size()>
	//   19   35:iconst_0        
	//   20   36:invokevirtual   #144 <Method int findOneVisibleChild(int, int, boolean)>
	//   21   39:ireturn         
	}

	public int findLastCompletelyVisibleItemPosition()
	{
		if(mReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//*   2    4:getfield        #140 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
	//*   3    7:ifeq            24
			return findOneVisibleChild(0, mViews.size(), true);
	//    4   10:aload_0         
	//    5   11:iconst_0        
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field ArrayList mViews>
	//    8   16:invokevirtual   #56  <Method int ArrayList.size()>
	//    9   19:iconst_1        
	//   10   20:invokevirtual   #144 <Method int findOneVisibleChild(int, int, boolean)>
	//   11   23:ireturn         
		else
			return findOneVisibleChild(mViews.size() - 1, -1, true);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #27  <Field ArrayList mViews>
	//   15   29:invokevirtual   #56  <Method int ArrayList.size()>
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:iconst_m1       
	//   19   35:iconst_1        
	//   20   36:invokevirtual   #144 <Method int findOneVisibleChild(int, int, boolean)>
	//   21   39:ireturn         
	}

	public int findLastPartiallyVisibleItemPosition()
	{
		if(mReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//*   2    4:getfield        #140 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
	//*   3    7:ifeq            24
			return findOnePartiallyVisibleChild(0, mViews.size(), true);
	//    4   10:aload_0         
	//    5   11:iconst_0        
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field ArrayList mViews>
	//    8   16:invokevirtual   #56  <Method int ArrayList.size()>
	//    9   19:iconst_1        
	//   10   20:invokevirtual   #148 <Method int findOnePartiallyVisibleChild(int, int, boolean)>
	//   11   23:ireturn         
		else
			return findOnePartiallyVisibleChild(mViews.size() - 1, -1, true);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #27  <Field ArrayList mViews>
	//   15   29:invokevirtual   #56  <Method int ArrayList.size()>
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:iconst_m1       
	//   19   35:iconst_1        
	//   20   36:invokevirtual   #148 <Method int findOnePartiallyVisibleChild(int, int, boolean)>
	//   21   39:ireturn         
	}

	public int findLastVisibleItemPosition()
	{
		if(mReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//*   2    4:getfield        #140 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
	//*   3    7:ifeq            24
			return findOneVisibleChild(0, mViews.size(), false);
	//    4   10:aload_0         
	//    5   11:iconst_0        
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field ArrayList mViews>
	//    8   16:invokevirtual   #56  <Method int ArrayList.size()>
	//    9   19:iconst_0        
	//   10   20:invokevirtual   #144 <Method int findOneVisibleChild(int, int, boolean)>
	//   11   23:ireturn         
		else
			return findOneVisibleChild(mViews.size() - 1, -1, false);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #27  <Field ArrayList mViews>
	//   15   29:invokevirtual   #56  <Method int ArrayList.size()>
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:iconst_m1       
	//   19   35:iconst_0        
	//   20   36:invokevirtual   #144 <Method int findOneVisibleChild(int, int, boolean)>
	//   21   39:ireturn         
	}

	int findOnePartiallyOrCompletelyVisibleChild(int i, int j, boolean flag, boolean flag1, boolean flag2)
	{
		int k = mPrimaryOrientation.getStartAfterPadding();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//    2    4:getfield        #69  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//    3    7:invokevirtual   #93  <Method int OrientationHelper.getStartAfterPadding()>
	//    4   10:istore          9
		int l = mPrimaryOrientation.getEndAfterPadding();
	//    5   12:aload_0         
	//    6   13:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//    7   16:getfield        #69  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//    8   19:invokevirtual   #90  <Method int OrientationHelper.getEndAfterPadding()>
	//    9   22:istore          10
		byte byte0;
		if(j > i)
	//*  10   24:iload_2         
	//*  11   25:iload_1         
	//*  12   26:icmple          35
			byte0 = 1;
	//   13   29:iconst_1        
	//   14   30:istore          6
		else
	//*  15   32:goto            38
			byte0 = -1;
	//   16   35:iconst_m1       
	//   17   36:istore          6
		for(; i != j; i += ((int) (byte0)))
	//*  18   38:iload_1         
	//*  19   39:iload_2         
	//*  20   40:icmpeq          233
		{
			View view = (View)mViews.get(i);
	//   21   43:aload_0         
	//   22   44:getfield        #27  <Field ArrayList mViews>
	//   23   47:iload_1         
	//   24   48:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   25   51:checkcast       #100 <Class View>
	//   26   54:astore          13
			int i1 = mPrimaryOrientation.getDecoratedStart(view);
	//   27   56:aload_0         
	//   28   57:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//   29   60:getfield        #69  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//   30   63:aload           13
	//   31   65:invokevirtual   #132 <Method int OrientationHelper.getDecoratedStart(View)>
	//   32   68:istore          11
			int j1 = mPrimaryOrientation.getDecoratedEnd(view);
	//   33   70:aload_0         
	//   34   71:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//   35   74:getfield        #69  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//   36   77:aload           13
	//   37   79:invokevirtual   #103 <Method int OrientationHelper.getDecoratedEnd(View)>
	//   38   82:istore          12
			boolean flag4 = false;
	//   39   84:iconst_0        
	//   40   85:istore          8
			boolean flag3;
			if(flag2 ? i1 <= l : i1 < l)
	//*  41   87:iload           5
	//*  42   89:ifeq            102
	//*  43   92:iload           11
	//*  44   94:iload           10
	//*  45   96:icmpgt          115
	//*  46   99:goto            109
	//*  47  102:iload           11
	//*  48  104:iload           10
	//*  49  106:icmpge          115
				flag3 = true;
	//   50  109:iconst_1        
	//   51  110:istore          7
			else
	//*  52  112:goto            118
				flag3 = false;
	//   53  115:iconst_0        
	//   54  116:istore          7
			if(flag2 ? j1 >= k : j1 > k)
	//*  55  118:iload           5
	//*  56  120:ifeq            133
	//*  57  123:iload           12
	//*  58  125:iload           9
	//*  59  127:icmplt          143
	//*  60  130:goto            140
	//*  61  133:iload           12
	//*  62  135:iload           9
	//*  63  137:icmple          143
				flag4 = true;
	//   64  140:iconst_1        
	//   65  141:istore          8
			if(!flag3 || !flag4)
				continue;
	//   66  143:iload           7
	//   67  145:ifeq            225
	//   68  148:iload           8
	//   69  150:ifeq            225
			if(flag && flag1)
	//*  70  153:iload_3         
	//*  71  154:ifeq            186
	//*  72  157:iload           4
	//*  73  159:ifeq            186
			{
				if(i1 >= k && j1 <= l)
	//*  74  162:iload           11
	//*  75  164:iload           9
	//*  76  166:icmplt          225
	//*  77  169:iload           12
	//*  78  171:iload           10
	//*  79  173:icmpgt          225
					return getPosition(view);
	//   80  176:aload_0         
	//   81  177:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//   82  180:aload           13
	//   83  182:invokevirtual   #157 <Method int StaggeredGridLayoutManager.getPosition(View)>
	//   84  185:ireturn         
				continue;
			}
			if(flag1)
	//*  85  186:iload           4
	//*  86  188:ifeq            201
				return getPosition(view);
	//   87  191:aload_0         
	//   88  192:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//   89  195:aload           13
	//   90  197:invokevirtual   #157 <Method int StaggeredGridLayoutManager.getPosition(View)>
	//   91  200:ireturn         
			if(i1 < k || j1 > l)
	//*  92  201:iload           11
	//*  93  203:iload           9
	//*  94  205:icmplt          215
	//*  95  208:iload           12
	//*  96  210:iload           10
	//*  97  212:icmple          225
				return getPosition(view);
	//   98  215:aload_0         
	//   99  216:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//  100  219:aload           13
	//  101  221:invokevirtual   #157 <Method int StaggeredGridLayoutManager.getPosition(View)>
	//  102  224:ireturn         
		}

	//  103  225:iload_1         
	//  104  226:iload           6
	//  105  228:iadd            
	//  106  229:istore_1        
	//* 107  230:goto            38
		return -1;
	//  108  233:iconst_m1       
	//  109  234:ireturn         
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
	//    6    6:invokevirtual   #159 <Method int findOnePartiallyOrCompletelyVisibleChild(int, int, boolean, boolean, boolean)>
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
	//    6    6:invokevirtual   #159 <Method int findOnePartiallyOrCompletelyVisibleChild(int, int, boolean, boolean, boolean)>
	//    7    9:ireturn         
	}

	public int getDeletedSize()
	{
		return mDeletedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int mDeletedSize>
	//    2    4:ireturn         
	}

	int getEndLine()
	{
		int i = mCachedEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int mCachedEnd>
	//    2    4:istore_1        
		if(i != 0x80000000)
	//*   3    5:iload_1         
	//*   4    6:ldc1            #7   <Int 0x80000000>
	//*   5    8:icmpeq          13
		{
			return i;
	//    6   11:iload_1         
	//    7   12:ireturn         
		} else
		{
			calculateCachedEnd();
	//    8   13:aload_0         
	//    9   14:invokevirtual   #162 <Method void calculateCachedEnd()>
			return mCachedEnd;
	//   10   17:aload_0         
	//   11   18:getfield        #31  <Field int mCachedEnd>
	//   12   21:ireturn         
		}
	}

	int getEndLine(int i)
	{
		int j = mCachedEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int mCachedEnd>
	//    2    4:istore_2        
		if(j != 0x80000000)
	//*   3    5:iload_2         
	//*   4    6:ldc1            #7   <Int 0x80000000>
	//*   5    8:icmpeq          13
			return j;
	//    6   11:iload_2         
	//    7   12:ireturn         
		if(mViews.size() == 0)
	//*   8   13:aload_0         
	//*   9   14:getfield        #27  <Field ArrayList mViews>
	//*  10   17:invokevirtual   #56  <Method int ArrayList.size()>
	//*  11   20:ifne            25
		{
			return i;
	//   12   23:iload_1         
	//   13   24:ireturn         
		} else
		{
			calculateCachedEnd();
	//   14   25:aload_0         
	//   15   26:invokevirtual   #162 <Method void calculateCachedEnd()>
			return mCachedEnd;
	//   16   29:aload_0         
	//   17   30:getfield        #31  <Field int mCachedEnd>
	//   18   33:ireturn         
		}
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
	//*   6    8:icmpne          119
		{
			int k = mViews.size();
	//    7   11:aload_0         
	//    8   12:getfield        #27  <Field ArrayList mViews>
	//    9   15:invokevirtual   #56  <Method int ArrayList.size()>
	//   10   18:istore_3        
			j = 0;
	//   11   19:iconst_0        
	//   12   20:istore_2        
			do
			{
				view2 = view;
	//   13   21:aload           4
	//   14   23:astore          5
				if(j >= k)
					break;
	//   15   25:iload_2         
	//   16   26:iload_3         
	//   17   27:icmpge          230
				View view3 = (View)mViews.get(j);
	//   18   30:aload_0         
	//   19   31:getfield        #27  <Field ArrayList mViews>
	//   20   34:iload_2         
	//   21   35:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   22   38:checkcast       #100 <Class View>
	//   23   41:astore          6
				if(mReverseLayout)
	//*  24   43:aload_0         
	//*  25   44:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//*  26   47:getfield        #140 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
	//*  27   50:ifeq            70
				{
					view2 = view;
	//   28   53:aload           4
	//   29   55:astore          5
					if(getPosition(view3) <= i)
						break;
	//   30   57:aload_0         
	//   31   58:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//   32   61:aload           6
	//   33   63:invokevirtual   #157 <Method int StaggeredGridLayoutManager.getPosition(View)>
	//   34   66:iload_1         
	//   35   67:icmple          230
				}
				if(!mReverseLayout && getPosition(view3) >= i)
	//*  36   70:aload_0         
	//*  37   71:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//*  38   74:getfield        #140 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
	//*  39   77:ifne            96
	//*  40   80:aload_0         
	//*  41   81:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//*  42   84:aload           6
	//*  43   86:invokevirtual   #157 <Method int StaggeredGridLayoutManager.getPosition(View)>
	//*  44   89:iload_1         
	//*  45   90:icmplt          96
					return view;
	//   46   93:aload           4
	//   47   95:areturn         
				view2 = view;
	//   48   96:aload           4
	//   49   98:astore          5
				if(!view3.hasFocusable())
					break;
	//   50  100:aload           6
	//   51  102:invokevirtual   #167 <Method boolean View.hasFocusable()>
	//   52  105:ifeq            230
				j++;
	//   53  108:iload_2         
	//   54  109:iconst_1        
	//   55  110:iadd            
	//   56  111:istore_2        
				view = view3;
	//   57  112:aload           6
	//   58  114:astore          4
			} while(true);
	//   59  116:goto            21
		} else
		{
			j = mViews.size() - 1;
	//   60  119:aload_0         
	//   61  120:getfield        #27  <Field ArrayList mViews>
	//   62  123:invokevirtual   #56  <Method int ArrayList.size()>
	//   63  126:iconst_1        
	//   64  127:isub            
	//   65  128:istore_2        
			View view1 = view2;
	//   66  129:aload           5
	//   67  131:astore          4
			do
			{
				view2 = view1;
	//   68  133:aload           4
	//   69  135:astore          5
				if(j < 0)
					break;
	//   70  137:iload_2         
	//   71  138:iflt            230
				View view4 = (View)mViews.get(j);
	//   72  141:aload_0         
	//   73  142:getfield        #27  <Field ArrayList mViews>
	//   74  145:iload_2         
	//   75  146:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   76  149:checkcast       #100 <Class View>
	//   77  152:astore          6
				if(mReverseLayout)
	//*  78  154:aload_0         
	//*  79  155:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//*  80  158:getfield        #140 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
	//*  81  161:ifeq            181
				{
					view2 = view1;
	//   82  164:aload           4
	//   83  166:astore          5
					if(getPosition(view4) >= i)
						break;
	//   84  168:aload_0         
	//   85  169:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//   86  172:aload           6
	//   87  174:invokevirtual   #157 <Method int StaggeredGridLayoutManager.getPosition(View)>
	//   88  177:iload_1         
	//   89  178:icmpge          230
				}
				if(!mReverseLayout && getPosition(view4) <= i)
	//*  90  181:aload_0         
	//*  91  182:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//*  92  185:getfield        #140 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
	//*  93  188:ifne            207
	//*  94  191:aload_0         
	//*  95  192:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//*  96  195:aload           6
	//*  97  197:invokevirtual   #157 <Method int StaggeredGridLayoutManager.getPosition(View)>
	//*  98  200:iload_1         
	//*  99  201:icmpgt          207
					return view1;
	//  100  204:aload           4
	//  101  206:areturn         
				view2 = view1;
	//  102  207:aload           4
	//  103  209:astore          5
				if(!view4.hasFocusable())
					break;
	//  104  211:aload           6
	//  105  213:invokevirtual   #167 <Method boolean View.hasFocusable()>
	//  106  216:ifeq            230
				j--;
	//  107  219:iload_2         
	//  108  220:iconst_1        
	//  109  221:isub            
	//  110  222:istore_2        
				view1 = view4;
	//  111  223:aload           6
	//  112  225:astore          4
			} while(true);
	//  113  227:goto            133
		}
		return view2;
	//  114  230:aload           5
	//  115  232:areturn         
	}

	tParams getLayoutParams(View view)
	{
		return (tParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #170 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #44  <Class StaggeredGridLayoutManager$LayoutParams>
	//    3    7:areturn         
	}

	int getStartLine()
	{
		int i = mCachedStart;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int mCachedStart>
	//    2    4:istore_1        
		if(i != 0x80000000)
	//*   3    5:iload_1         
	//*   4    6:ldc1            #7   <Int 0x80000000>
	//*   5    8:icmpeq          13
		{
			return i;
	//    6   11:iload_1         
	//    7   12:ireturn         
		} else
		{
			calculateCachedStart();
	//    8   13:aload_0         
	//    9   14:invokevirtual   #172 <Method void calculateCachedStart()>
			return mCachedStart;
	//   10   17:aload_0         
	//   11   18:getfield        #29  <Field int mCachedStart>
	//   12   21:ireturn         
		}
	}

	int getStartLine(int i)
	{
		int j = mCachedStart;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int mCachedStart>
	//    2    4:istore_2        
		if(j != 0x80000000)
	//*   3    5:iload_2         
	//*   4    6:ldc1            #7   <Int 0x80000000>
	//*   5    8:icmpeq          13
			return j;
	//    6   11:iload_2         
	//    7   12:ireturn         
		if(mViews.size() == 0)
	//*   8   13:aload_0         
	//*   9   14:getfield        #27  <Field ArrayList mViews>
	//*  10   17:invokevirtual   #56  <Method int ArrayList.size()>
	//*  11   20:ifne            25
		{
			return i;
	//   12   23:iload_1         
	//   13   24:ireturn         
		} else
		{
			calculateCachedStart();
	//   14   25:aload_0         
	//   15   26:invokevirtual   #172 <Method void calculateCachedStart()>
			return mCachedStart;
	//   16   29:aload_0         
	//   17   30:getfield        #29  <Field int mCachedStart>
	//   18   33:ireturn         
		}
	}

	void invalidateCache()
	{
		mCachedStart = 0x80000000;
	//    0    0:aload_0         
	//    1    1:ldc1            #7   <Int 0x80000000>
	//    2    3:putfield        #29  <Field int mCachedStart>
		mCachedEnd = 0x80000000;
	//    3    6:aload_0         
	//    4    7:ldc1            #7   <Int 0x80000000>
	//    5    9:putfield        #31  <Field int mCachedEnd>
	//    6   12:return          
	}

	void onOffset(int i)
	{
		int j = mCachedStart;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int mCachedStart>
	//    2    4:istore_2        
		if(j != 0x80000000)
	//*   3    5:iload_2         
	//*   4    6:ldc1            #7   <Int 0x80000000>
	//*   5    8:icmpeq          18
			mCachedStart = j + i;
	//    6   11:aload_0         
	//    7   12:iload_2         
	//    8   13:iload_1         
	//    9   14:iadd            
	//   10   15:putfield        #29  <Field int mCachedStart>
		j = mCachedEnd;
	//   11   18:aload_0         
	//   12   19:getfield        #31  <Field int mCachedEnd>
	//   13   22:istore_2        
		if(j != 0x80000000)
	//*  14   23:iload_2         
	//*  15   24:ldc1            #7   <Int 0x80000000>
	//*  16   26:icmpeq          36
			mCachedEnd = j + i;
	//   17   29:aload_0         
	//   18   30:iload_2         
	//   19   31:iload_1         
	//   20   32:iadd            
	//   21   33:putfield        #31  <Field int mCachedEnd>
	//   22   36:return          
	}

	void popEnd()
	{
		int i = mViews.size();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ArrayList mViews>
	//    2    4:invokevirtual   #56  <Method int ArrayList.size()>
	//    3    7:istore_1        
		View view = (View)mViews.remove(i - 1);
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field ArrayList mViews>
	//    6   12:iload_1         
	//    7   13:iconst_1        
	//    8   14:isub            
	//    9   15:invokevirtual   #178 <Method Object ArrayList.remove(int)>
	//   10   18:checkcast       #100 <Class View>
	//   11   21:astore_2        
		tParams tparams = getLayoutParams(view);
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:invokevirtual   #42  <Method StaggeredGridLayoutManager$LayoutParams getLayoutParams(View)>
	//   15   27:astore_3        
		tparams.mSpan = null;
	//   16   28:aload_3         
	//   17   29:aconst_null     
	//   18   30:putfield        #48  <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
		if(tparams.isItemRemoved() || tparams.isItemChanged())
	//*  19   33:aload_3         
	//*  20   34:invokevirtual   #60  <Method boolean StaggeredGridLayoutManager$LayoutParams.isItemRemoved()>
	//*  21   37:ifne            47
	//*  22   40:aload_3         
	//*  23   41:invokevirtual   #63  <Method boolean StaggeredGridLayoutManager$LayoutParams.isItemChanged()>
	//*  24   44:ifeq            67
			mDeletedSize = mDeletedSize - mPrimaryOrientation.getDecoratedMeasurement(view);
	//   25   47:aload_0         
	//   26   48:aload_0         
	//   27   49:getfield        #33  <Field int mDeletedSize>
	//   28   52:aload_0         
	//   29   53:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//   30   56:getfield        #69  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//   31   59:aload_2         
	//   32   60:invokevirtual   #75  <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   33   63:isub            
	//   34   64:putfield        #33  <Field int mDeletedSize>
		if(i == 1)
	//*  35   67:iload_1         
	//*  36   68:iconst_1        
	//*  37   69:icmpne          78
			mCachedStart = 0x80000000;
	//   38   72:aload_0         
	//   39   73:ldc1            #7   <Int 0x80000000>
	//   40   75:putfield        #29  <Field int mCachedStart>
		mCachedEnd = 0x80000000;
	//   41   78:aload_0         
	//   42   79:ldc1            #7   <Int 0x80000000>
	//   43   81:putfield        #31  <Field int mCachedEnd>
	//   44   84:return          
	}

	void popStart()
	{
		View view = (View)mViews.remove(0);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ArrayList mViews>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #178 <Method Object ArrayList.remove(int)>
	//    4    8:checkcast       #100 <Class View>
	//    5   11:astore_1        
		tParams tparams = getLayoutParams(view);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #42  <Method StaggeredGridLayoutManager$LayoutParams getLayoutParams(View)>
	//    9   17:astore_2        
		tparams.mSpan = null;
	//   10   18:aload_2         
	//   11   19:aconst_null     
	//   12   20:putfield        #48  <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
		if(mViews.size() == 0)
	//*  13   23:aload_0         
	//*  14   24:getfield        #27  <Field ArrayList mViews>
	//*  15   27:invokevirtual   #56  <Method int ArrayList.size()>
	//*  16   30:ifne            39
			mCachedEnd = 0x80000000;
	//   17   33:aload_0         
	//   18   34:ldc1            #7   <Int 0x80000000>
	//   19   36:putfield        #31  <Field int mCachedEnd>
		if(tparams.isItemRemoved() || tparams.isItemChanged())
	//*  20   39:aload_2         
	//*  21   40:invokevirtual   #60  <Method boolean StaggeredGridLayoutManager$LayoutParams.isItemRemoved()>
	//*  22   43:ifne            53
	//*  23   46:aload_2         
	//*  24   47:invokevirtual   #63  <Method boolean StaggeredGridLayoutManager$LayoutParams.isItemChanged()>
	//*  25   50:ifeq            73
			mDeletedSize = mDeletedSize - mPrimaryOrientation.getDecoratedMeasurement(view);
	//   26   53:aload_0         
	//   27   54:aload_0         
	//   28   55:getfield        #33  <Field int mDeletedSize>
	//   29   58:aload_0         
	//   30   59:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//   31   62:getfield        #69  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//   32   65:aload_1         
	//   33   66:invokevirtual   #75  <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   34   69:isub            
	//   35   70:putfield        #33  <Field int mDeletedSize>
		mCachedStart = 0x80000000;
	//   36   73:aload_0         
	//   37   74:ldc1            #7   <Int 0x80000000>
	//   38   76:putfield        #29  <Field int mCachedStart>
	//   39   79:return          
	}

	void prependToSpan(View view)
	{
		tParams tparams = getLayoutParams(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #42  <Method StaggeredGridLayoutManager$LayoutParams getLayoutParams(View)>
	//    3    5:astore_2        
		tparams.mSpan = this;
	//    4    6:aload_2         
	//    5    7:aload_0         
	//    6    8:putfield        #48  <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
		mViews.add(0, ((Object) (view)));
	//    7   11:aload_0         
	//    8   12:getfield        #27  <Field ArrayList mViews>
	//    9   15:iconst_0        
	//   10   16:aload_1         
	//   11   17:invokevirtual   #183 <Method void ArrayList.add(int, Object)>
		mCachedStart = 0x80000000;
	//   12   20:aload_0         
	//   13   21:ldc1            #7   <Int 0x80000000>
	//   14   23:putfield        #29  <Field int mCachedStart>
		if(mViews.size() == 1)
	//*  15   26:aload_0         
	//*  16   27:getfield        #27  <Field ArrayList mViews>
	//*  17   30:invokevirtual   #56  <Method int ArrayList.size()>
	//*  18   33:iconst_1        
	//*  19   34:icmpne          43
			mCachedEnd = 0x80000000;
	//   20   37:aload_0         
	//   21   38:ldc1            #7   <Int 0x80000000>
	//   22   40:putfield        #31  <Field int mCachedEnd>
		if(tparams.isItemRemoved() || tparams.isItemChanged())
	//*  23   43:aload_2         
	//*  24   44:invokevirtual   #60  <Method boolean StaggeredGridLayoutManager$LayoutParams.isItemRemoved()>
	//*  25   47:ifne            57
	//*  26   50:aload_2         
	//*  27   51:invokevirtual   #63  <Method boolean StaggeredGridLayoutManager$LayoutParams.isItemChanged()>
	//*  28   54:ifeq            77
			mDeletedSize = mDeletedSize + mPrimaryOrientation.getDecoratedMeasurement(view);
	//   29   57:aload_0         
	//   30   58:aload_0         
	//   31   59:getfield        #33  <Field int mDeletedSize>
	//   32   62:aload_0         
	//   33   63:getfield        #19  <Field StaggeredGridLayoutManager this$0>
	//   34   66:getfield        #69  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//   35   69:aload_1         
	//   36   70:invokevirtual   #75  <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   37   73:iadd            
	//   38   74:putfield        #33  <Field int mDeletedSize>
	//   39   77:return          
	}

	void setLine(int i)
	{
		mCachedStart = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #29  <Field int mCachedStart>
		mCachedEnd = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #31  <Field int mCachedEnd>
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
	//    2    2:putfield        #19  <Field StaggeredGridLayoutManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
		mViews = new ArrayList();
	//    5    9:aload_0         
	//    6   10:new             #24  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #25  <Method void ArrayList()>
	//    9   17:putfield        #27  <Field ArrayList mViews>
		mCachedStart = 0x80000000;
	//   10   20:aload_0         
	//   11   21:ldc1            #7   <Int 0x80000000>
	//   12   23:putfield        #29  <Field int mCachedStart>
		mCachedEnd = 0x80000000;
	//   13   26:aload_0         
	//   14   27:ldc1            #7   <Int 0x80000000>
	//   15   29:putfield        #31  <Field int mCachedEnd>
		mDeletedSize = 0;
	//   16   32:aload_0         
	//   17   33:iconst_0        
	//   18   34:putfield        #33  <Field int mDeletedSize>
		mIndex = i;
	//   19   37:aload_0         
	//   20   38:iload_2         
	//   21   39:putfield        #35  <Field int mIndex>
	//   22   42:return          
	}
}
