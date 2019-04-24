// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.*;

// Referenced classes of package android.support.v7.widget:
//			LayoutState, OrientationHelper, ScrollbarHelper, RecyclerView, 
//			LinearSmoothScroller

public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager
	implements RecyclerView.SmoothScroller.ScrollVectorProvider
{
	class AnchorInfo
	{

		void assignCoordinateFromPadding()
		{
			int i;
			if(mLayoutFromEnd)
		//*   0    0:aload_0         
		//*   1    1:getfield        #32  <Field boolean mLayoutFromEnd>
		//*   2    4:ifeq            21
				i = mPrimaryOrientation.getEndAfterPadding();
		//    3    7:aload_0         
		//    4    8:getfield        #22  <Field StaggeredGridLayoutManager this$0>
		//    5   11:getfield        #36  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//    6   14:invokevirtual   #42  <Method int OrientationHelper.getEndAfterPadding()>
		//    7   17:istore_1        
			else
		//*   8   18:goto            32
				i = mPrimaryOrientation.getStartAfterPadding();
		//    9   21:aload_0         
		//   10   22:getfield        #22  <Field StaggeredGridLayoutManager this$0>
		//   11   25:getfield        #36  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//   12   28:invokevirtual   #45  <Method int OrientationHelper.getStartAfterPadding()>
		//   13   31:istore_1        
			mOffset = i;
		//   14   32:aload_0         
		//   15   33:iload_1         
		//   16   34:putfield        #47  <Field int mOffset>
		//   17   37:return          
		}

		void assignCoordinateFromPadding(int i)
		{
			if(mLayoutFromEnd)
		//*   0    0:aload_0         
		//*   1    1:getfield        #32  <Field boolean mLayoutFromEnd>
		//*   2    4:ifeq            24
			{
				mOffset = mPrimaryOrientation.getEndAfterPadding() - i;
		//    3    7:aload_0         
		//    4    8:aload_0         
		//    5    9:getfield        #22  <Field StaggeredGridLayoutManager this$0>
		//    6   12:getfield        #36  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//    7   15:invokevirtual   #42  <Method int OrientationHelper.getEndAfterPadding()>
		//    8   18:iload_1         
		//    9   19:isub            
		//   10   20:putfield        #47  <Field int mOffset>
				return;
		//   11   23:return          
			} else
			{
				mOffset = mPrimaryOrientation.getStartAfterPadding() + i;
		//   12   24:aload_0         
		//   13   25:aload_0         
		//   14   26:getfield        #22  <Field StaggeredGridLayoutManager this$0>
		//   15   29:getfield        #36  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//   16   32:invokevirtual   #45  <Method int OrientationHelper.getStartAfterPadding()>
		//   17   35:iload_1         
		//   18   36:iadd            
		//   19   37:putfield        #47  <Field int mOffset>
				return;
		//   20   40:return          
			}
		}

		void reset()
		{
			mPosition = -1;
		//    0    0:aload_0         
		//    1    1:iconst_m1       
		//    2    2:putfield        #50  <Field int mPosition>
			mOffset = 0x80000000;
		//    3    5:aload_0         
		//    4    6:ldc1            #51  <Int 0x80000000>
		//    5    8:putfield        #47  <Field int mOffset>
			mLayoutFromEnd = false;
		//    6   11:aload_0         
		//    7   12:iconst_0        
		//    8   13:putfield        #32  <Field boolean mLayoutFromEnd>
			mInvalidateOffsets = false;
		//    9   16:aload_0         
		//   10   17:iconst_0        
		//   11   18:putfield        #53  <Field boolean mInvalidateOffsets>
			mValid = false;
		//   12   21:aload_0         
		//   13   22:iconst_0        
		//   14   23:putfield        #55  <Field boolean mValid>
			if(mSpanReferenceLines != null)
		//*  15   26:aload_0         
		//*  16   27:getfield        #57  <Field int[] mSpanReferenceLines>
		//*  17   30:ifnull          41
				Arrays.fill(mSpanReferenceLines, -1);
		//   18   33:aload_0         
		//   19   34:getfield        #57  <Field int[] mSpanReferenceLines>
		//   20   37:iconst_m1       
		//   21   38:invokestatic    #63  <Method void Arrays.fill(int[], int)>
		//   22   41:return          
		}

		void saveSpanReferenceLines(Span aspan[])
		{
			int j = aspan.length;
		//    0    0:aload_1         
		//    1    1:arraylength     
		//    2    2:istore_3        
			if(mSpanReferenceLines == null || mSpanReferenceLines.length < j)
		//*   3    3:aload_0         
		//*   4    4:getfield        #57  <Field int[] mSpanReferenceLines>
		//*   5    7:ifnull          19
		//*   6   10:aload_0         
		//*   7   11:getfield        #57  <Field int[] mSpanReferenceLines>
		//*   8   14:arraylength     
		//*   9   15:iload_3         
		//*  10   16:icmpge          33
				mSpanReferenceLines = new int[mSpans.length];
		//   11   19:aload_0         
		//   12   20:aload_0         
		//   13   21:getfield        #22  <Field StaggeredGridLayoutManager this$0>
		//   14   24:getfield        #69  <Field StaggeredGridLayoutManager$Span[] StaggeredGridLayoutManager.mSpans>
		//   15   27:arraylength     
		//   16   28:newarray        int[]
		//   17   30:putfield        #57  <Field int[] mSpanReferenceLines>
			for(int i = 0; i < j; i++)
		//*  18   33:iconst_0        
		//*  19   34:istore_2        
		//*  20   35:iload_2         
		//*  21   36:iload_3         
		//*  22   37:icmpge          61
				mSpanReferenceLines[i] = aspan[i].getStartLine(0x80000000);
		//   23   40:aload_0         
		//   24   41:getfield        #57  <Field int[] mSpanReferenceLines>
		//   25   44:iload_2         
		//   26   45:aload_1         
		//   27   46:iload_2         
		//   28   47:aaload          
		//   29   48:ldc1            #51  <Int 0x80000000>
		//   30   50:invokevirtual   #75  <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
		//   31   53:iastore         

		//   32   54:iload_2         
		//   33   55:iconst_1        
		//   34   56:iadd            
		//   35   57:istore_2        
		//*  36   58:goto            35
		//   37   61:return          
		}

		boolean mInvalidateOffsets;
		boolean mLayoutFromEnd;
		int mOffset;
		int mPosition;
		int mSpanReferenceLines[];
		boolean mValid;
		final StaggeredGridLayoutManager this$0;

		AnchorInfo()
		{
			this$0 = StaggeredGridLayoutManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #22  <Field StaggeredGridLayoutManager this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #25  <Method void Object()>
			reset();
		//    5    9:aload_0         
		//    6   10:invokevirtual   #28  <Method void reset()>
		//    7   13:return          
		}
	}

	public static class LayoutParams extends RecyclerView.LayoutParams
	{

		public final int getSpanIndex()
		{
			if(mSpan == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #35  <Field StaggeredGridLayoutManager$Span mSpan>
		//*   2    4:ifnonnull       9
				return -1;
		//    3    7:iconst_m1       
		//    4    8:ireturn         
			else
				return mSpan.mIndex;
		//    5    9:aload_0         
		//    6   10:getfield        #35  <Field StaggeredGridLayoutManager$Span mSpan>
		//    7   13:getfield        #40  <Field int StaggeredGridLayoutManager$Span.mIndex>
		//    8   16:ireturn         
		}

		public boolean isFullSpan()
		{
			return mFullSpan;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field boolean mFullSpan>
		//    2    4:ireturn         
		}

		public void setFullSpan(boolean flag)
		{
			mFullSpan = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #44  <Field boolean mFullSpan>
		//    3    5:return          
		}

		public static final int INVALID_SPAN_ID = -1;
		boolean mFullSpan;
		Span mSpan;

		public LayoutParams(int i, int j)
		{
			super(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #18  <Method void RecyclerView$LayoutParams(int, int)>
		//    4    6:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #22  <Method void RecyclerView$LayoutParams(Context, AttributeSet)>
		//    4    6:return          
		}

		public LayoutParams(RecyclerView.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #25  <Method void RecyclerView$LayoutParams(RecyclerView$LayoutParams)>
		//    3    5:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #28  <Method void RecyclerView$LayoutParams(android.view.ViewGroup$LayoutParams)>
		//    3    5:return          
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			super(marginlayoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #31  <Method void RecyclerView$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
		//    3    5:return          
		}
	}

	static class LazySpanLookup
	{

		private int invalidateFullSpansAfter(int i)
		{
			int j;
label0:
			{
				if(mFullSpanItems == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field List mFullSpanItems>
		//*   2    4:ifnonnull       9
					return -1;
		//    3    7:iconst_m1       
		//    4    8:ireturn         
				FullSpanItem fullspanitem = getFullSpanItem(i);
		//    5    9:aload_0         
		//    6   10:iload_1         
		//    7   11:invokevirtual   #33  <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem getFullSpanItem(int)>
		//    8   14:astore          4
				if(fullspanitem != null)
		//*   9   16:aload           4
		//*  10   18:ifnull          33
					mFullSpanItems.remove(((Object) (fullspanitem)));
		//   11   21:aload_0         
		//   12   22:getfield        #29  <Field List mFullSpanItems>
		//   13   25:aload           4
		//   14   27:invokeinterface #39  <Method boolean List.remove(Object)>
		//   15   32:pop             
				int k = mFullSpanItems.size();
		//   16   33:aload_0         
		//   17   34:getfield        #29  <Field List mFullSpanItems>
		//   18   37:invokeinterface #43  <Method int List.size()>
		//   19   42:istore_3        
				for(j = 0; j < k; j++)
		//*  20   43:iconst_0        
		//*  21   44:istore_2        
		//*  22   45:iload_2         
		//*  23   46:iload_3         
		//*  24   47:icmpge          80
					if(((FullSpanItem)mFullSpanItems.get(j)).mPosition >= i)
		//*  25   50:aload_0         
		//*  26   51:getfield        #29  <Field List mFullSpanItems>
		//*  27   54:iload_2         
		//*  28   55:invokeinterface #47  <Method Object List.get(int)>
		//*  29   60:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//*  30   63:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//*  31   66:iload_1         
		//*  32   67:icmplt          73
						break label0;
		//   33   70:goto            82

		//   34   73:iload_2         
		//   35   74:iconst_1        
		//   36   75:iadd            
		//   37   76:istore_2        
		//*  38   77:goto            45
				j = -1;
		//   39   80:iconst_m1       
		//   40   81:istore_2        
			}
			if(j != -1)
		//*  41   82:iload_2         
		//*  42   83:iconst_m1       
		//*  43   84:icmpeq          119
			{
				FullSpanItem fullspanitem1 = (FullSpanItem)mFullSpanItems.get(j);
		//   44   87:aload_0         
		//   45   88:getfield        #29  <Field List mFullSpanItems>
		//   46   91:iload_2         
		//   47   92:invokeinterface #47  <Method Object List.get(int)>
		//   48   97:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//   49  100:astore          4
				mFullSpanItems.remove(j);
		//   50  102:aload_0         
		//   51  103:getfield        #29  <Field List mFullSpanItems>
		//   52  106:iload_2         
		//   53  107:invokeinterface #52  <Method Object List.remove(int)>
		//   54  112:pop             
				return fullspanitem1.mPosition;
		//   55  113:aload           4
		//   56  115:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//   57  118:ireturn         
			} else
			{
				return -1;
		//   58  119:iconst_m1       
		//   59  120:ireturn         
			}
		}

		private void offsetFullSpansForAddition(int i, int j)
		{
			if(mFullSpanItems == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field List mFullSpanItems>
		//*   2    4:ifnonnull       8
				return;
		//    3    7:return          
			for(int k = mFullSpanItems.size() - 1; k >= 0; k--)
		//*   4    8:aload_0         
		//*   5    9:getfield        #29  <Field List mFullSpanItems>
		//*   6   12:invokeinterface #43  <Method int List.size()>
		//*   7   17:iconst_1        
		//*   8   18:isub            
		//*   9   19:istore_3        
		//*  10   20:iload_3         
		//*  11   21:iflt            70
			{
				FullSpanItem fullspanitem = (FullSpanItem)mFullSpanItems.get(k);
		//   12   24:aload_0         
		//   13   25:getfield        #29  <Field List mFullSpanItems>
		//   14   28:iload_3         
		//   15   29:invokeinterface #47  <Method Object List.get(int)>
		//   16   34:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//   17   37:astore          4
				if(fullspanitem.mPosition >= i)
		//*  18   39:aload           4
		//*  19   41:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//*  20   44:iload_1         
		//*  21   45:icmpge          51
		//*  22   48:goto            63
					fullspanitem.mPosition = fullspanitem.mPosition + j;
		//   23   51:aload           4
		//   24   53:aload           4
		//   25   55:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//   26   58:iload_2         
		//   27   59:iadd            
		//   28   60:putfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
			}

		//   29   63:iload_3         
		//   30   64:iconst_1        
		//   31   65:isub            
		//   32   66:istore_3        
		//*  33   67:goto            20
		//   34   70:return          
		}

		private void offsetFullSpansForRemoval(int i, int j)
		{
			if(mFullSpanItems == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field List mFullSpanItems>
		//*   2    4:ifnonnull       8
				return;
		//    3    7:return          
			for(int k = mFullSpanItems.size() - 1; k >= 0; k--)
		//*   4    8:aload_0         
		//*   5    9:getfield        #29  <Field List mFullSpanItems>
		//*   6   12:invokeinterface #43  <Method int List.size()>
		//*   7   17:iconst_1        
		//*   8   18:isub            
		//*   9   19:istore_3        
		//*  10   20:iload_3         
		//*  11   21:iflt            95
			{
				FullSpanItem fullspanitem = (FullSpanItem)mFullSpanItems.get(k);
		//   12   24:aload_0         
		//   13   25:getfield        #29  <Field List mFullSpanItems>
		//   14   28:iload_3         
		//   15   29:invokeinterface #47  <Method Object List.get(int)>
		//   16   34:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//   17   37:astore          4
				if(fullspanitem.mPosition < i)
		//*  18   39:aload           4
		//*  19   41:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//*  20   44:iload_1         
		//*  21   45:icmpge          51
					continue;
		//   22   48:goto            88
				if(fullspanitem.mPosition < i + j)
		//*  23   51:aload           4
		//*  24   53:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//*  25   56:iload_1         
		//*  26   57:iload_2         
		//*  27   58:iadd            
		//*  28   59:icmpge          76
					mFullSpanItems.remove(k);
		//   29   62:aload_0         
		//   30   63:getfield        #29  <Field List mFullSpanItems>
		//   31   66:iload_3         
		//   32   67:invokeinterface #52  <Method Object List.remove(int)>
		//   33   72:pop             
				else
		//*  34   73:goto            88
					fullspanitem.mPosition = fullspanitem.mPosition - j;
		//   35   76:aload           4
		//   36   78:aload           4
		//   37   80:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//   38   83:iload_2         
		//   39   84:isub            
		//   40   85:putfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
			}

		//   41   88:iload_3         
		//   42   89:iconst_1        
		//   43   90:isub            
		//   44   91:istore_3        
		//*  45   92:goto            20
		//   46   95:return          
		}

		public void addFullSpanItem(FullSpanItem fullspanitem)
		{
			if(mFullSpanItems == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field List mFullSpanItems>
		//*   2    4:ifnonnull       18
				mFullSpanItems = ((List) (new ArrayList()));
		//    3    7:aload_0         
		//    4    8:new             #59  <Class ArrayList>
		//    5   11:dup             
		//    6   12:invokespecial   #60  <Method void ArrayList()>
		//    7   15:putfield        #29  <Field List mFullSpanItems>
			int j = mFullSpanItems.size();
		//    8   18:aload_0         
		//    9   19:getfield        #29  <Field List mFullSpanItems>
		//   10   22:invokeinterface #43  <Method int List.size()>
		//   11   27:istore_3        
			for(int i = 0; i < j; i++)
		//*  12   28:iconst_0        
		//*  13   29:istore_2        
		//*  14   30:iload_2         
		//*  15   31:iload_3         
		//*  16   32:icmpge          104
			{
				FullSpanItem fullspanitem1 = (FullSpanItem)mFullSpanItems.get(i);
		//   17   35:aload_0         
		//   18   36:getfield        #29  <Field List mFullSpanItems>
		//   19   39:iload_2         
		//   20   40:invokeinterface #47  <Method Object List.get(int)>
		//   21   45:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//   22   48:astore          4
				if(fullspanitem1.mPosition == fullspanitem.mPosition)
		//*  23   50:aload           4
		//*  24   52:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//*  25   55:aload_1         
		//*  26   56:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//*  27   59:icmpne          73
					mFullSpanItems.remove(i);
		//   28   62:aload_0         
		//   29   63:getfield        #29  <Field List mFullSpanItems>
		//   30   66:iload_2         
		//   31   67:invokeinterface #52  <Method Object List.remove(int)>
		//   32   72:pop             
				if(fullspanitem1.mPosition >= fullspanitem.mPosition)
		//*  33   73:aload           4
		//*  34   75:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//*  35   78:aload_1         
		//*  36   79:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//*  37   82:icmplt          97
				{
					mFullSpanItems.add(i, ((Object) (fullspanitem)));
		//   38   85:aload_0         
		//   39   86:getfield        #29  <Field List mFullSpanItems>
		//   40   89:iload_2         
		//   41   90:aload_1         
		//   42   91:invokeinterface #64  <Method void List.add(int, Object)>
					return;
		//   43   96:return          
				}
			}

		//   44   97:iload_2         
		//   45   98:iconst_1        
		//   46   99:iadd            
		//   47  100:istore_2        
		//*  48  101:goto            30
			mFullSpanItems.add(((Object) (fullspanitem)));
		//   49  104:aload_0         
		//   50  105:getfield        #29  <Field List mFullSpanItems>
		//   51  108:aload_1         
		//   52  109:invokeinterface #66  <Method boolean List.add(Object)>
		//   53  114:pop             
		//   54  115:return          
		}

		void clear()
		{
			if(mData != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #69  <Field int[] mData>
		//*   2    4:ifnull          15
				Arrays.fill(mData, -1);
		//    3    7:aload_0         
		//    4    8:getfield        #69  <Field int[] mData>
		//    5   11:iconst_m1       
		//    6   12:invokestatic    #75  <Method void Arrays.fill(int[], int)>
			mFullSpanItems = null;
		//    7   15:aload_0         
		//    8   16:aconst_null     
		//    9   17:putfield        #29  <Field List mFullSpanItems>
		//   10   20:return          
		}

		void ensureSize(int i)
		{
			if(mData == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #69  <Field int[] mData>
		//*   2    4:ifnonnull       30
			{
				mData = new int[Math.max(i, 10) + 1];
		//    3    7:aload_0         
		//    4    8:iload_1         
		//    5    9:bipush          10
		//    6   11:invokestatic    #83  <Method int Math.max(int, int)>
		//    7   14:iconst_1        
		//    8   15:iadd            
		//    9   16:newarray        int[]
		//   10   18:putfield        #69  <Field int[] mData>
				Arrays.fill(mData, -1);
		//   11   21:aload_0         
		//   12   22:getfield        #69  <Field int[] mData>
		//   13   25:iconst_m1       
		//   14   26:invokestatic    #75  <Method void Arrays.fill(int[], int)>
				return;
		//   15   29:return          
			}
			if(i >= mData.length)
		//*  16   30:iload_1         
		//*  17   31:aload_0         
		//*  18   32:getfield        #69  <Field int[] mData>
		//*  19   35:arraylength     
		//*  20   36:icmplt          82
			{
				int ai[] = mData;
		//   21   39:aload_0         
		//   22   40:getfield        #69  <Field int[] mData>
		//   23   43:astore_2        
				mData = new int[sizeForPosition(i)];
		//   24   44:aload_0         
		//   25   45:aload_0         
		//   26   46:iload_1         
		//   27   47:invokevirtual   #86  <Method int sizeForPosition(int)>
		//   28   50:newarray        int[]
		//   29   52:putfield        #69  <Field int[] mData>
				System.arraycopy(((Object) (ai)), 0, ((Object) (mData)), 0, ai.length);
		//   30   55:aload_2         
		//   31   56:iconst_0        
		//   32   57:aload_0         
		//   33   58:getfield        #69  <Field int[] mData>
		//   34   61:iconst_0        
		//   35   62:aload_2         
		//   36   63:arraylength     
		//   37   64:invokestatic    #92  <Method void System.arraycopy(Object, int, Object, int, int)>
				Arrays.fill(mData, ai.length, mData.length, -1);
		//   38   67:aload_0         
		//   39   68:getfield        #69  <Field int[] mData>
		//   40   71:aload_2         
		//   41   72:arraylength     
		//   42   73:aload_0         
		//   43   74:getfield        #69  <Field int[] mData>
		//   44   77:arraylength     
		//   45   78:iconst_m1       
		//   46   79:invokestatic    #95  <Method void Arrays.fill(int[], int, int, int)>
			}
		//   47   82:return          
		}

		int forceInvalidateAfter(int i)
		{
			if(mFullSpanItems != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field List mFullSpanItems>
		//*   2    4:ifnull          61
			{
				for(int j = mFullSpanItems.size() - 1; j >= 0; j--)
		//*   3    7:aload_0         
		//*   4    8:getfield        #29  <Field List mFullSpanItems>
		//*   5   11:invokeinterface #43  <Method int List.size()>
		//*   6   16:iconst_1        
		//*   7   17:isub            
		//*   8   18:istore_2        
		//*   9   19:iload_2         
		//*  10   20:iflt            61
					if(((FullSpanItem)mFullSpanItems.get(j)).mPosition >= i)
		//*  11   23:aload_0         
		//*  12   24:getfield        #29  <Field List mFullSpanItems>
		//*  13   27:iload_2         
		//*  14   28:invokeinterface #47  <Method Object List.get(int)>
		//*  15   33:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//*  16   36:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//*  17   39:iload_1         
		//*  18   40:icmplt          54
						mFullSpanItems.remove(j);
		//   19   43:aload_0         
		//   20   44:getfield        #29  <Field List mFullSpanItems>
		//   21   47:iload_2         
		//   22   48:invokeinterface #52  <Method Object List.remove(int)>
		//   23   53:pop             

		//   24   54:iload_2         
		//   25   55:iconst_1        
		//   26   56:isub            
		//   27   57:istore_2        
			}
		//*  28   58:goto            19
			return invalidateAfter(i);
		//   29   61:aload_0         
		//   30   62:iload_1         
		//   31   63:invokevirtual   #99  <Method int invalidateAfter(int)>
		//   32   66:ireturn         
		}

		public FullSpanItem getFirstFullSpanItemInRange(int i, int j, int k, boolean flag)
		{
			if(mFullSpanItems == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field List mFullSpanItems>
		//*   2    4:ifnonnull       9
				return null;
		//    3    7:aconst_null     
		//    4    8:areturn         
			int i1 = mFullSpanItems.size();
		//    5    9:aload_0         
		//    6   10:getfield        #29  <Field List mFullSpanItems>
		//    7   13:invokeinterface #43  <Method int List.size()>
		//    8   18:istore          6
			for(int l = 0; l < i1; l++)
		//*   9   20:iconst_0        
		//*  10   21:istore          5
		//*  11   23:iload           5
		//*  12   25:iload           6
		//*  13   27:icmpge          104
			{
				FullSpanItem fullspanitem = (FullSpanItem)mFullSpanItems.get(l);
		//   14   30:aload_0         
		//   15   31:getfield        #29  <Field List mFullSpanItems>
		//   16   34:iload           5
		//   17   36:invokeinterface #47  <Method Object List.get(int)>
		//   18   41:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//   19   44:astore          7
				if(fullspanitem.mPosition >= j)
		//*  20   46:aload           7
		//*  21   48:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//*  22   51:iload_2         
		//*  23   52:icmplt          57
					return null;
		//   24   55:aconst_null     
		//   25   56:areturn         
				if(fullspanitem.mPosition >= i && (k == 0 || fullspanitem.mGapDir == k || flag && fullspanitem.mHasUnwantedGapAfter))
		//*  26   57:aload           7
		//*  27   59:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//*  28   62:iload_1         
		//*  29   63:icmplt          95
		//*  30   66:iload_3         
		//*  31   67:ifeq            92
		//*  32   70:aload           7
		//*  33   72:getfield        #104 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapDir>
		//*  34   75:iload_3         
		//*  35   76:icmpeq          92
		//*  36   79:iload           4
		//*  37   81:ifeq            95
		//*  38   84:aload           7
		//*  39   86:getfield        #108 <Field boolean StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mHasUnwantedGapAfter>
		//*  40   89:ifeq            95
					return fullspanitem;
		//   41   92:aload           7
		//   42   94:areturn         
			}

		//   43   95:iload           5
		//   44   97:iconst_1        
		//   45   98:iadd            
		//   46   99:istore          5
		//*  47  101:goto            23
			return null;
		//   48  104:aconst_null     
		//   49  105:areturn         
		}

		public FullSpanItem getFullSpanItem(int i)
		{
			if(mFullSpanItems == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field List mFullSpanItems>
		//*   2    4:ifnonnull       9
				return null;
		//    3    7:aconst_null     
		//    4    8:areturn         
			for(int j = mFullSpanItems.size() - 1; j >= 0; j--)
		//*   5    9:aload_0         
		//*   6   10:getfield        #29  <Field List mFullSpanItems>
		//*   7   13:invokeinterface #43  <Method int List.size()>
		//*   8   18:iconst_1        
		//*   9   19:isub            
		//*  10   20:istore_2        
		//*  11   21:iload_2         
		//*  12   22:iflt            56
			{
				FullSpanItem fullspanitem = (FullSpanItem)mFullSpanItems.get(j);
		//   13   25:aload_0         
		//   14   26:getfield        #29  <Field List mFullSpanItems>
		//   15   29:iload_2         
		//   16   30:invokeinterface #47  <Method Object List.get(int)>
		//   17   35:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//   18   38:astore_3        
				if(fullspanitem.mPosition == i)
		//*  19   39:aload_3         
		//*  20   40:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//*  21   43:iload_1         
		//*  22   44:icmpne          49
					return fullspanitem;
		//   23   47:aload_3         
		//   24   48:areturn         
			}

		//   25   49:iload_2         
		//   26   50:iconst_1        
		//   27   51:isub            
		//   28   52:istore_2        
		//*  29   53:goto            21
			return null;
		//   30   56:aconst_null     
		//   31   57:areturn         
		}

		int getSpan(int i)
		{
			if(mData != null && i < mData.length)
		//*   0    0:aload_0         
		//*   1    1:getfield        #69  <Field int[] mData>
		//*   2    4:ifnull          26
		//*   3    7:iload_1         
		//*   4    8:aload_0         
		//*   5    9:getfield        #69  <Field int[] mData>
		//*   6   12:arraylength     
		//*   7   13:icmplt          19
		//*   8   16:goto            26
				return mData[i];
		//    9   19:aload_0         
		//   10   20:getfield        #69  <Field int[] mData>
		//   11   23:iload_1         
		//   12   24:iaload          
		//   13   25:ireturn         
			else
				return -1;
		//   14   26:iconst_m1       
		//   15   27:ireturn         
		}

		int invalidateAfter(int i)
		{
			if(mData == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #69  <Field int[] mData>
		//*   2    4:ifnonnull       9
				return -1;
		//    3    7:iconst_m1       
		//    4    8:ireturn         
			if(i >= mData.length)
		//*   5    9:iload_1         
		//*   6   10:aload_0         
		//*   7   11:getfield        #69  <Field int[] mData>
		//*   8   14:arraylength     
		//*   9   15:icmplt          20
				return -1;
		//   10   18:iconst_m1       
		//   11   19:ireturn         
			int j = invalidateFullSpansAfter(i);
		//   12   20:aload_0         
		//   13   21:iload_1         
		//   14   22:invokespecial   #111 <Method int invalidateFullSpansAfter(int)>
		//   15   25:istore_2        
			if(j == -1)
		//*  16   26:iload_2         
		//*  17   27:iconst_m1       
		//*  18   28:icmpne          51
			{
				Arrays.fill(mData, i, mData.length, -1);
		//   19   31:aload_0         
		//   20   32:getfield        #69  <Field int[] mData>
		//   21   35:iload_1         
		//   22   36:aload_0         
		//   23   37:getfield        #69  <Field int[] mData>
		//   24   40:arraylength     
		//   25   41:iconst_m1       
		//   26   42:invokestatic    #95  <Method void Arrays.fill(int[], int, int, int)>
				return mData.length;
		//   27   45:aload_0         
		//   28   46:getfield        #69  <Field int[] mData>
		//   29   49:arraylength     
		//   30   50:ireturn         
			} else
			{
				int ai[] = mData;
		//   31   51:aload_0         
		//   32   52:getfield        #69  <Field int[] mData>
		//   33   55:astore_3        
				j++;
		//   34   56:iload_2         
		//   35   57:iconst_1        
		//   36   58:iadd            
		//   37   59:istore_2        
				Arrays.fill(ai, i, j, -1);
		//   38   60:aload_3         
		//   39   61:iload_1         
		//   40   62:iload_2         
		//   41   63:iconst_m1       
		//   42   64:invokestatic    #95  <Method void Arrays.fill(int[], int, int, int)>
				return j;
		//   43   67:iload_2         
		//   44   68:ireturn         
			}
		}

		void offsetForAddition(int i, int j)
		{
			if(mData != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #69  <Field int[] mData>
		//*   2    4:ifnull          65
			{
				if(i >= mData.length)
		//*   3    7:iload_1         
		//*   4    8:aload_0         
		//*   5    9:getfield        #69  <Field int[] mData>
		//*   6   12:arraylength     
		//*   7   13:icmplt          17
				{
					return;
		//    8   16:return          
				} else
				{
					int k = i + j;
		//    9   17:iload_1         
		//   10   18:iload_2         
		//   11   19:iadd            
		//   12   20:istore_3        
					ensureSize(k);
		//   13   21:aload_0         
		//   14   22:iload_3         
		//   15   23:invokevirtual   #114 <Method void ensureSize(int)>
					System.arraycopy(((Object) (mData)), i, ((Object) (mData)), k, mData.length - i - j);
		//   16   26:aload_0         
		//   17   27:getfield        #69  <Field int[] mData>
		//   18   30:iload_1         
		//   19   31:aload_0         
		//   20   32:getfield        #69  <Field int[] mData>
		//   21   35:iload_3         
		//   22   36:aload_0         
		//   23   37:getfield        #69  <Field int[] mData>
		//   24   40:arraylength     
		//   25   41:iload_1         
		//   26   42:isub            
		//   27   43:iload_2         
		//   28   44:isub            
		//   29   45:invokestatic    #92  <Method void System.arraycopy(Object, int, Object, int, int)>
					Arrays.fill(mData, i, k, -1);
		//   30   48:aload_0         
		//   31   49:getfield        #69  <Field int[] mData>
		//   32   52:iload_1         
		//   33   53:iload_3         
		//   34   54:iconst_m1       
		//   35   55:invokestatic    #95  <Method void Arrays.fill(int[], int, int, int)>
					offsetFullSpansForAddition(i, j);
		//   36   58:aload_0         
		//   37   59:iload_1         
		//   38   60:iload_2         
		//   39   61:invokespecial   #116 <Method void offsetFullSpansForAddition(int, int)>
					return;
		//   40   64:return          
				}
			} else
			{
				return;
		//   41   65:return          
			}
		}

		void offsetForRemoval(int i, int j)
		{
			if(mData != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #69  <Field int[] mData>
		//*   2    4:ifnull          75
			{
				if(i >= mData.length)
		//*   3    7:iload_1         
		//*   4    8:aload_0         
		//*   5    9:getfield        #69  <Field int[] mData>
		//*   6   12:arraylength     
		//*   7   13:icmplt          17
				{
					return;
		//    8   16:return          
				} else
				{
					int k = i + j;
		//    9   17:iload_1         
		//   10   18:iload_2         
		//   11   19:iadd            
		//   12   20:istore_3        
					ensureSize(k);
		//   13   21:aload_0         
		//   14   22:iload_3         
		//   15   23:invokevirtual   #114 <Method void ensureSize(int)>
					System.arraycopy(((Object) (mData)), k, ((Object) (mData)), i, mData.length - i - j);
		//   16   26:aload_0         
		//   17   27:getfield        #69  <Field int[] mData>
		//   18   30:iload_3         
		//   19   31:aload_0         
		//   20   32:getfield        #69  <Field int[] mData>
		//   21   35:iload_1         
		//   22   36:aload_0         
		//   23   37:getfield        #69  <Field int[] mData>
		//   24   40:arraylength     
		//   25   41:iload_1         
		//   26   42:isub            
		//   27   43:iload_2         
		//   28   44:isub            
		//   29   45:invokestatic    #92  <Method void System.arraycopy(Object, int, Object, int, int)>
					Arrays.fill(mData, mData.length - j, mData.length, -1);
		//   30   48:aload_0         
		//   31   49:getfield        #69  <Field int[] mData>
		//   32   52:aload_0         
		//   33   53:getfield        #69  <Field int[] mData>
		//   34   56:arraylength     
		//   35   57:iload_2         
		//   36   58:isub            
		//   37   59:aload_0         
		//   38   60:getfield        #69  <Field int[] mData>
		//   39   63:arraylength     
		//   40   64:iconst_m1       
		//   41   65:invokestatic    #95  <Method void Arrays.fill(int[], int, int, int)>
					offsetFullSpansForRemoval(i, j);
		//   42   68:aload_0         
		//   43   69:iload_1         
		//   44   70:iload_2         
		//   45   71:invokespecial   #119 <Method void offsetFullSpansForRemoval(int, int)>
					return;
		//   46   74:return          
				}
			} else
			{
				return;
		//   47   75:return          
			}
		}

		void setSpan(int i, Span span)
		{
			ensureSize(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #114 <Method void ensureSize(int)>
			mData[i] = span.mIndex;
		//    3    5:aload_0         
		//    4    6:getfield        #69  <Field int[] mData>
		//    5    9:iload_1         
		//    6   10:aload_2         
		//    7   11:getfield        #126 <Field int StaggeredGridLayoutManager$Span.mIndex>
		//    8   14:iastore         
		//    9   15:return          
		}

		int sizeForPosition(int i)
		{
			int j;
			for(j = mData.length; j <= i; j *= 2);
		//    0    0:aload_0         
		//    1    1:getfield        #69  <Field int[] mData>
		//    2    4:arraylength     
		//    3    5:istore_2        
		//    4    6:iload_2         
		//    5    7:iload_1         
		//    6    8:icmpgt          18
		//    7   11:iload_2         
		//    8   12:iconst_2        
		//    9   13:imul            
		//   10   14:istore_2        
		//*  11   15:goto            6
			return j;
		//   12   18:iload_2         
		//   13   19:ireturn         
		}

		private static final int MIN_SIZE = 10;
		int mData[];
		List mFullSpanItems;

		LazySpanLookup()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
		//    2    4:return          
		}
	}

	static class LazySpanLookup.FullSpanItem
		implements Parcelable
	{

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		int getGapForSpan(int i)
		{
			if(mGapPerSpan == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #48  <Field int[] mGapPerSpan>
		//*   2    4:ifnonnull       9
				return 0;
		//    3    7:iconst_0        
		//    4    8:ireturn         
			else
				return mGapPerSpan[i];
		//    5    9:aload_0         
		//    6   10:getfield        #48  <Field int[] mGapPerSpan>
		//    7   13:iload_1         
		//    8   14:iaload          
		//    9   15:ireturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #59  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #60  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("FullSpanItem{mPosition=");
		//    4    8:aload_1         
		//    5    9:ldc1            #62  <String "FullSpanItem{mPosition=">
		//    6   11:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(mPosition);
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #42  <Field int mPosition>
		//   11   20:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
		//   12   23:pop             
			stringbuilder.append(", mGapDir=");
		//   13   24:aload_1         
		//   14   25:ldc1            #71  <String ", mGapDir=">
		//   15   27:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
		//   16   30:pop             
			stringbuilder.append(mGapDir);
		//   17   31:aload_1         
		//   18   32:aload_0         
		//   19   33:getfield        #44  <Field int mGapDir>
		//   20   36:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
		//   21   39:pop             
			stringbuilder.append(", mHasUnwantedGapAfter=");
		//   22   40:aload_1         
		//   23   41:ldc1            #73  <String ", mHasUnwantedGapAfter=">
		//   24   43:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
		//   25   46:pop             
			stringbuilder.append(mHasUnwantedGapAfter);
		//   26   47:aload_1         
		//   27   48:aload_0         
		//   28   49:getfield        #46  <Field boolean mHasUnwantedGapAfter>
		//   29   52:invokevirtual   #76  <Method StringBuilder StringBuilder.append(boolean)>
		//   30   55:pop             
			stringbuilder.append(", mGapPerSpan=");
		//   31   56:aload_1         
		//   32   57:ldc1            #78  <String ", mGapPerSpan=">
		//   33   59:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
		//   34   62:pop             
			stringbuilder.append(Arrays.toString(mGapPerSpan));
		//   35   63:aload_1         
		//   36   64:aload_0         
		//   37   65:getfield        #48  <Field int[] mGapPerSpan>
		//   38   68:invokestatic    #83  <Method String Arrays.toString(int[])>
		//   39   71:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
		//   40   74:pop             
			stringbuilder.append('}');
		//   41   75:aload_1         
		//   42   76:bipush          125
		//   43   78:invokevirtual   #86  <Method StringBuilder StringBuilder.append(char)>
		//   44   81:pop             
			return stringbuilder.toString();
		//   45   82:aload_1         
		//   46   83:invokevirtual   #88  <Method String StringBuilder.toString()>
		//   47   86:areturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #92  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #94  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #99  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public LazySpanLookup.FullSpanItem createFromParcel(Parcel parcel)
			{
				return new LazySpanLookup.FullSpanItem(parcel);
			//    0    0:new             #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #25  <Method void StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(Parcel)>
			//    4    8:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #28  <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public LazySpanLookup.FullSpanItem[] newArray(int i)
			{
				return new LazySpanLookup.FullSpanItem[i];
			//    0    0:iload_1         
			//    1    1:anewarray       LazySpanLookup.FullSpanItem[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #33  <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		int mGapDir;
		int mGapPerSpan[];
		boolean mHasUnwantedGapAfter;
		int mPosition;

		static 
		{
		//    0    0:new             #14  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1>
		//    1    3:dup             
		//    2    4:invokespecial   #29  <Method void StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1()>
		//    3    7:putstatic       #31  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		LazySpanLookup.FullSpanItem()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #33  <Method void Object()>
		//    2    4:return          
		}

		LazySpanLookup.FullSpanItem(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #33  <Method void Object()>
			mPosition = parcel.readInt();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #40  <Method int Parcel.readInt()>
		//    5    9:putfield        #42  <Field int mPosition>
			mGapDir = parcel.readInt();
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokevirtual   #40  <Method int Parcel.readInt()>
		//    9   17:putfield        #44  <Field int mGapDir>
			int i = parcel.readInt();
		//   10   20:aload_1         
		//   11   21:invokevirtual   #40  <Method int Parcel.readInt()>
		//   12   24:istore_2        
			boolean flag = true;
		//   13   25:iconst_1        
		//   14   26:istore_3        
			if(i != 1)
		//*  15   27:iload_2         
		//*  16   28:iconst_1        
		//*  17   29:icmpne          35
		//*  18   32:goto            37
				flag = false;
		//   19   35:iconst_0        
		//   20   36:istore_3        
			mHasUnwantedGapAfter = flag;
		//   21   37:aload_0         
		//   22   38:iload_3         
		//   23   39:putfield        #46  <Field boolean mHasUnwantedGapAfter>
			i = parcel.readInt();
		//   24   42:aload_1         
		//   25   43:invokevirtual   #40  <Method int Parcel.readInt()>
		//   26   46:istore_2        
			if(i > 0)
		//*  27   47:iload_2         
		//*  28   48:ifle            66
			{
				mGapPerSpan = new int[i];
		//   29   51:aload_0         
		//   30   52:iload_2         
		//   31   53:newarray        int[]
		//   32   55:putfield        #48  <Field int[] mGapPerSpan>
				parcel.readIntArray(mGapPerSpan);
		//   33   58:aload_1         
		//   34   59:aload_0         
		//   35   60:getfield        #48  <Field int[] mGapPerSpan>
		//   36   63:invokevirtual   #52  <Method void Parcel.readIntArray(int[])>
			}
		//   37   66:return          
		}
	}

	public static class SavedState
		implements Parcelable
	{

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		void invalidateAnchorPositionInfo()
		{
			mSpanOffsets = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #57  <Field int[] mSpanOffsets>
			mSpanOffsetsSize = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #55  <Field int mSpanOffsetsSize>
			mAnchorPosition = -1;
		//    6   10:aload_0         
		//    7   11:iconst_m1       
		//    8   12:putfield        #51  <Field int mAnchorPosition>
			mVisibleAnchorPosition = -1;
		//    9   15:aload_0         
		//   10   16:iconst_m1       
		//   11   17:putfield        #53  <Field int mVisibleAnchorPosition>
		//   12   20:return          
		}

		void invalidateSpanInfo()
		{
			mSpanOffsets = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #57  <Field int[] mSpanOffsets>
			mSpanOffsetsSize = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #55  <Field int mSpanOffsetsSize>
			mSpanLookupSize = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #63  <Field int mSpanLookupSize>
			mSpanLookup = null;
		//    9   15:aload_0         
		//   10   16:aconst_null     
		//   11   17:putfield        #65  <Field int[] mSpanLookup>
			mFullSpanItems = null;
		//   12   20:aload_0         
		//   13   21:aconst_null     
		//   14   22:putfield        #85  <Field List mFullSpanItems>
		//   15   25:return          
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #93  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #95  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #100 <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel);
			//    0    0:new             #9   <Class StaggeredGridLayoutManager$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void StaggeredGridLayoutManager$SavedState(Parcel)>
			//    4    8:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #25  <Method StaggeredGridLayoutManager$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public SavedState[] newArray(int i)
			{
				return new SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #30  <Method StaggeredGridLayoutManager$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		boolean mAnchorLayoutFromEnd;
		int mAnchorPosition;
		List mFullSpanItems;
		boolean mLastLayoutRTL;
		boolean mReverseLayout;
		int mSpanLookup[];
		int mSpanLookupSize;
		int mSpanOffsets[];
		int mSpanOffsetsSize;
		int mVisibleAnchorPosition;

		static 
		{
		//    0    0:new             #11  <Class StaggeredGridLayoutManager$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #38  <Method void StaggeredGridLayoutManager$SavedState$1()>
		//    3    7:putstatic       #40  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #42  <Method void Object()>
		//    2    4:return          
		}

		SavedState(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #42  <Method void Object()>
			mAnchorPosition = parcel.readInt();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #49  <Method int Parcel.readInt()>
		//    5    9:putfield        #51  <Field int mAnchorPosition>
			mVisibleAnchorPosition = parcel.readInt();
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokevirtual   #49  <Method int Parcel.readInt()>
		//    9   17:putfield        #53  <Field int mVisibleAnchorPosition>
			mSpanOffsetsSize = parcel.readInt();
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:invokevirtual   #49  <Method int Parcel.readInt()>
		//   13   25:putfield        #55  <Field int mSpanOffsetsSize>
			if(mSpanOffsetsSize > 0)
		//*  14   28:aload_0         
		//*  15   29:getfield        #55  <Field int mSpanOffsetsSize>
		//*  16   32:ifle            53
			{
				mSpanOffsets = new int[mSpanOffsetsSize];
		//   17   35:aload_0         
		//   18   36:aload_0         
		//   19   37:getfield        #55  <Field int mSpanOffsetsSize>
		//   20   40:newarray        int[]
		//   21   42:putfield        #57  <Field int[] mSpanOffsets>
				parcel.readIntArray(mSpanOffsets);
		//   22   45:aload_1         
		//   23   46:aload_0         
		//   24   47:getfield        #57  <Field int[] mSpanOffsets>
		//   25   50:invokevirtual   #61  <Method void Parcel.readIntArray(int[])>
			}
			mSpanLookupSize = parcel.readInt();
		//   26   53:aload_0         
		//   27   54:aload_1         
		//   28   55:invokevirtual   #49  <Method int Parcel.readInt()>
		//   29   58:putfield        #63  <Field int mSpanLookupSize>
			if(mSpanLookupSize > 0)
		//*  30   61:aload_0         
		//*  31   62:getfield        #63  <Field int mSpanLookupSize>
		//*  32   65:ifle            86
			{
				mSpanLookup = new int[mSpanLookupSize];
		//   33   68:aload_0         
		//   34   69:aload_0         
		//   35   70:getfield        #63  <Field int mSpanLookupSize>
		//   36   73:newarray        int[]
		//   37   75:putfield        #65  <Field int[] mSpanLookup>
				parcel.readIntArray(mSpanLookup);
		//   38   78:aload_1         
		//   39   79:aload_0         
		//   40   80:getfield        #65  <Field int[] mSpanLookup>
		//   41   83:invokevirtual   #61  <Method void Parcel.readIntArray(int[])>
			}
			int i = parcel.readInt();
		//   42   86:aload_1         
		//   43   87:invokevirtual   #49  <Method int Parcel.readInt()>
		//   44   90:istore_2        
			boolean flag1 = false;
		//   45   91:iconst_0        
		//   46   92:istore          4
			boolean flag;
			if(i == 1)
		//*  47   94:iload_2         
		//*  48   95:iconst_1        
		//*  49   96:icmpne          104
				flag = true;
		//   50   99:iconst_1        
		//   51  100:istore_3        
			else
		//*  52  101:goto            106
				flag = false;
		//   53  104:iconst_0        
		//   54  105:istore_3        
			mReverseLayout = flag;
		//   55  106:aload_0         
		//   56  107:iload_3         
		//   57  108:putfield        #67  <Field boolean mReverseLayout>
			if(parcel.readInt() == 1)
		//*  58  111:aload_1         
		//*  59  112:invokevirtual   #49  <Method int Parcel.readInt()>
		//*  60  115:iconst_1        
		//*  61  116:icmpne          124
				flag = true;
		//   62  119:iconst_1        
		//   63  120:istore_3        
			else
		//*  64  121:goto            126
				flag = false;
		//   65  124:iconst_0        
		//   66  125:istore_3        
			mAnchorLayoutFromEnd = flag;
		//   67  126:aload_0         
		//   68  127:iload_3         
		//   69  128:putfield        #69  <Field boolean mAnchorLayoutFromEnd>
			flag = flag1;
		//   70  131:iload           4
		//   71  133:istore_3        
			if(parcel.readInt() == 1)
		//*  72  134:aload_1         
		//*  73  135:invokevirtual   #49  <Method int Parcel.readInt()>
		//*  74  138:iconst_1        
		//*  75  139:icmpne          144
				flag = true;
		//   76  142:iconst_1        
		//   77  143:istore_3        
			mLastLayoutRTL = flag;
		//   78  144:aload_0         
		//   79  145:iload_3         
		//   80  146:putfield        #71  <Field boolean mLastLayoutRTL>
			mFullSpanItems = ((List) (parcel.readArrayList(((Class) (android/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)).getClassLoader())));
		//   81  149:aload_0         
		//   82  150:aload_1         
		//   83  151:ldc1            #73  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//   84  153:invokevirtual   #79  <Method ClassLoader Class.getClassLoader()>
		//   85  156:invokevirtual   #83  <Method ArrayList Parcel.readArrayList(ClassLoader)>
		//   86  159:putfield        #85  <Field List mFullSpanItems>
		//   87  162:return          
		}

		public SavedState(SavedState savedstate)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #42  <Method void Object()>
			mSpanOffsetsSize = savedstate.mSpanOffsetsSize;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:getfield        #55  <Field int mSpanOffsetsSize>
		//    5    9:putfield        #55  <Field int mSpanOffsetsSize>
			mAnchorPosition = savedstate.mAnchorPosition;
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:getfield        #51  <Field int mAnchorPosition>
		//    9   17:putfield        #51  <Field int mAnchorPosition>
			mVisibleAnchorPosition = savedstate.mVisibleAnchorPosition;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:getfield        #53  <Field int mVisibleAnchorPosition>
		//   13   25:putfield        #53  <Field int mVisibleAnchorPosition>
			mSpanOffsets = savedstate.mSpanOffsets;
		//   14   28:aload_0         
		//   15   29:aload_1         
		//   16   30:getfield        #57  <Field int[] mSpanOffsets>
		//   17   33:putfield        #57  <Field int[] mSpanOffsets>
			mSpanLookupSize = savedstate.mSpanLookupSize;
		//   18   36:aload_0         
		//   19   37:aload_1         
		//   20   38:getfield        #63  <Field int mSpanLookupSize>
		//   21   41:putfield        #63  <Field int mSpanLookupSize>
			mSpanLookup = savedstate.mSpanLookup;
		//   22   44:aload_0         
		//   23   45:aload_1         
		//   24   46:getfield        #65  <Field int[] mSpanLookup>
		//   25   49:putfield        #65  <Field int[] mSpanLookup>
			mReverseLayout = savedstate.mReverseLayout;
		//   26   52:aload_0         
		//   27   53:aload_1         
		//   28   54:getfield        #67  <Field boolean mReverseLayout>
		//   29   57:putfield        #67  <Field boolean mReverseLayout>
			mAnchorLayoutFromEnd = savedstate.mAnchorLayoutFromEnd;
		//   30   60:aload_0         
		//   31   61:aload_1         
		//   32   62:getfield        #69  <Field boolean mAnchorLayoutFromEnd>
		//   33   65:putfield        #69  <Field boolean mAnchorLayoutFromEnd>
			mLastLayoutRTL = savedstate.mLastLayoutRTL;
		//   34   68:aload_0         
		//   35   69:aload_1         
		//   36   70:getfield        #71  <Field boolean mLastLayoutRTL>
		//   37   73:putfield        #71  <Field boolean mLastLayoutRTL>
			mFullSpanItems = savedstate.mFullSpanItems;
		//   38   76:aload_0         
		//   39   77:aload_1         
		//   40   78:getfield        #85  <Field List mFullSpanItems>
		//   41   81:putfield        #85  <Field List mFullSpanItems>
		//   42   84:return          
		}
	}

	class Span
	{

		void appendToSpan(View view)
		{
			LayoutParams layoutparams = getLayoutParams(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #46  <Method StaggeredGridLayoutManager$LayoutParams getLayoutParams(View)>
		//    3    5:astore_2        
			layoutparams.mSpan = this;
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
			if(layoutparams.isItemRemoved() || layoutparams.isItemChanged())
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
		//*   1    1:ifeq            14
				j = getEndLine(0x80000000);
		//    2    4:aload_0         
		//    3    5:ldc1            #10  <Int 0x80000000>
		//    4    7:invokevirtual   #83  <Method int getEndLine(int)>
		//    5   10:istore_3        
			else
		//*   6   11:goto            21
				j = getStartLine(0x80000000);
		//    7   14:aload_0         
		//    8   15:ldc1            #10  <Int 0x80000000>
		//    9   17:invokevirtual   #86  <Method int getStartLine(int)>
		//   10   20:istore_3        
			clear();
		//   11   21:aload_0         
		//   12   22:invokevirtual   #89  <Method void clear()>
			if(j == 0x80000000)
		//*  13   25:iload_3         
		//*  14   26:ldc1            #10  <Int 0x80000000>
		//*  15   28:icmpne          32
				return;
		//   16   31:return          
			if(flag && j < mPrimaryOrientation.getEndAfterPadding() || !flag && j > mPrimaryOrientation.getStartAfterPadding())
		//*  17   32:iload_1         
		//*  18   33:ifeq            50
		//*  19   36:iload_3         
		//*  20   37:aload_0         
		//*  21   38:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//*  22   41:getfield        #71  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//*  23   44:invokevirtual   #92  <Method int OrientationHelper.getEndAfterPadding()>
		//*  24   47:icmplt          68
		//*  25   50:iload_1         
		//*  26   51:ifne            69
		//*  27   54:iload_3         
		//*  28   55:aload_0         
		//*  29   56:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//*  30   59:getfield        #71  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//*  31   62:invokevirtual   #95  <Method int OrientationHelper.getStartAfterPadding()>
		//*  32   65:icmple          69
				return;
		//   33   68:return          
			int k = j;
		//   34   69:iload_3         
		//   35   70:istore          4
			if(i != 0x80000000)
		//*  36   72:iload_2         
		//*  37   73:ldc1            #10  <Int 0x80000000>
		//*  38   75:icmpeq          83
				k = j + i;
		//   39   78:iload_3         
		//   40   79:iload_2         
		//   41   80:iadd            
		//   42   81:istore          4
			mCachedEnd = k;
		//   43   83:aload_0         
		//   44   84:iload           4
		//   45   86:putfield        #35  <Field int mCachedEnd>
			mCachedStart = k;
		//   46   89:aload_0         
		//   47   90:iload           4
		//   48   92:putfield        #33  <Field int mCachedStart>
		//   49   95:return          
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
		//    9   19:astore_1        
			LayoutParams layoutparams = getLayoutParams(view);
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:invokevirtual   #46  <Method StaggeredGridLayoutManager$LayoutParams getLayoutParams(View)>
		//   13   25:astore_2        
			mCachedEnd = mPrimaryOrientation.getDecoratedEnd(view);
		//   14   26:aload_0         
		//   15   27:aload_0         
		//   16   28:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//   17   31:getfield        #71  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//   18   34:aload_1         
		//   19   35:invokevirtual   #105 <Method int OrientationHelper.getDecoratedEnd(View)>
		//   20   38:putfield        #35  <Field int mCachedEnd>
			if(layoutparams.mFullSpan)
		//*  21   41:aload_2         
		//*  22   42:getfield        #109 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
		//*  23   45:ifeq            92
			{
				LazySpanLookup.FullSpanItem fullspanitem = mLazySpanLookup.getFullSpanItem(layoutparams.getViewLayoutPosition());
		//   24   48:aload_0         
		//   25   49:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//   26   52:getfield        #113 <Field StaggeredGridLayoutManager$LazySpanLookup StaggeredGridLayoutManager.mLazySpanLookup>
		//   27   55:aload_2         
		//   28   56:invokevirtual   #116 <Method int StaggeredGridLayoutManager$LayoutParams.getViewLayoutPosition()>
		//   29   59:invokevirtual   #122 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem StaggeredGridLayoutManager$LazySpanLookup.getFullSpanItem(int)>
		//   30   62:astore_1        
				if(fullspanitem != null && fullspanitem.mGapDir == 1)
		//*  31   63:aload_1         
		//*  32   64:ifnull          92
		//*  33   67:aload_1         
		//*  34   68:getfield        #127 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapDir>
		//*  35   71:iconst_1        
		//*  36   72:icmpne          92
					mCachedEnd = mCachedEnd + fullspanitem.getGapForSpan(mIndex);
		//   37   75:aload_0         
		//   38   76:aload_0         
		//   39   77:getfield        #35  <Field int mCachedEnd>
		//   40   80:aload_1         
		//   41   81:aload_0         
		//   42   82:getfield        #39  <Field int mIndex>
		//   43   85:invokevirtual   #130 <Method int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.getGapForSpan(int)>
		//   44   88:iadd            
		//   45   89:putfield        #35  <Field int mCachedEnd>
			}
		//   46   92:return          
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
			LayoutParams layoutparams = getLayoutParams(view);
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
			if(layoutparams.mFullSpan)
		//*  17   33:aload_2         
		//*  18   34:getfield        #109 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
		//*  19   37:ifeq            84
			{
				LazySpanLookup.FullSpanItem fullspanitem = mLazySpanLookup.getFullSpanItem(layoutparams.getViewLayoutPosition());
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
			int k = mPrimaryOrientation.getStartAfterPadding();
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//    2    4:getfield        #71  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//    3    7:invokevirtual   #95  <Method int OrientationHelper.getStartAfterPadding()>
		//    4   10:istore          9
			int l = mPrimaryOrientation.getEndAfterPadding();
		//    5   12:aload_0         
		//    6   13:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//    7   16:getfield        #71  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//    8   19:invokevirtual   #92  <Method int OrientationHelper.getEndAfterPadding()>
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
		//*  20   40:icmpeq          239
			{
				View view = (View)mViews.get(i);
		//   21   43:aload_0         
		//   22   44:getfield        #31  <Field ArrayList mViews>
		//   23   47:iload_1         
		//   24   48:invokevirtual   #100 <Method Object ArrayList.get(int)>
		//   25   51:checkcast       #102 <Class View>
		//   26   54:astore          13
				int i1 = mPrimaryOrientation.getDecoratedStart(view);
		//   27   56:aload_0         
		//   28   57:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//   29   60:getfield        #71  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//   30   63:aload           13
		//   31   65:invokevirtual   #134 <Method int OrientationHelper.getDecoratedStart(View)>
		//   32   68:istore          11
				int j1 = mPrimaryOrientation.getDecoratedEnd(view);
		//   33   70:aload_0         
		//   34   71:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//   35   74:getfield        #71  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//   36   77:aload           13
		//   37   79:invokevirtual   #105 <Method int OrientationHelper.getDecoratedEnd(View)>
		//   38   82:istore          12
				boolean flag4 = false;
		//   39   84:iconst_0        
		//   40   85:istore          8
				boolean flag3;
				if(flag2 ? i1 <= l : i1 < l)
		//*  41   87:iload           5
		//*  42   89:ifeq            111
		//*  43   92:iload           11
		//*  44   94:iload           10
		//*  45   96:icmpgt          105
					flag3 = true;
		//   46   99:iconst_1        
		//   47  100:istore          7
				else
		//*  48  102:goto            121
					flag3 = false;
		//   49  105:iconst_0        
		//   50  106:istore          7
		//   51  108:goto            121
		//   52  111:iload           11
		//   53  113:iload           10
		//   54  115:icmpge          105
		//*  55  118:goto            99
				if(flag2 ? j1 >= k : j1 > k)
		//*  56  121:iload           5
		//*  57  123:ifeq            139
		//*  58  126:iload           12
		//*  59  128:iload           9
		//*  60  130:icmplt          149
					flag4 = true;
		//   61  133:iconst_1        
		//   62  134:istore          8
		//   63  136:goto            149
		//   64  139:iload           12
		//   65  141:iload           9
		//   66  143:icmple          149
		//*  67  146:goto            133
				if(!flag3 || !flag4)
					continue;
		//   68  149:iload           7
		//   69  151:ifeq            231
		//   70  154:iload           8
		//   71  156:ifeq            231
				if(flag && flag1)
		//*  72  159:iload_3         
		//*  73  160:ifeq            192
		//*  74  163:iload           4
		//*  75  165:ifeq            192
				{
					if(i1 >= k && j1 <= l)
		//*  76  168:iload           11
		//*  77  170:iload           9
		//*  78  172:icmplt          231
		//*  79  175:iload           12
		//*  80  177:iload           10
		//*  81  179:icmpgt          231
						return getPosition(view);
		//   82  182:aload_0         
		//   83  183:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//   84  186:aload           13
		//   85  188:invokevirtual   #159 <Method int StaggeredGridLayoutManager.getPosition(View)>
		//   86  191:ireturn         
					continue;
				}
				if(flag1)
		//*  87  192:iload           4
		//*  88  194:ifeq            207
					return getPosition(view);
		//   89  197:aload_0         
		//   90  198:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//   91  201:aload           13
		//   92  203:invokevirtual   #159 <Method int StaggeredGridLayoutManager.getPosition(View)>
		//   93  206:ireturn         
				if(i1 < k || j1 > l)
		//*  94  207:iload           11
		//*  95  209:iload           9
		//*  96  211:icmplt          221
		//*  97  214:iload           12
		//*  98  216:iload           10
		//*  99  218:icmple          231
					return getPosition(view);
		//  100  221:aload_0         
		//  101  222:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//  102  225:aload           13
		//  103  227:invokevirtual   #159 <Method int StaggeredGridLayoutManager.getPosition(View)>
		//  104  230:ireturn         
			}

		//  105  231:iload_1         
		//  106  232:iload           6
		//  107  234:iadd            
		//  108  235:istore_1        
		//* 109  236:goto            38
			return -1;
		//  110  239:iconst_m1       
		//  111  240:ireturn         
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
		//*   3    6:icmpeq          14
				return mCachedEnd;
		//    4    9:aload_0         
		//    5   10:getfield        #35  <Field int mCachedEnd>
		//    6   13:ireturn         
			if(mViews.size() == 0)
		//*   7   14:aload_0         
		//*   8   15:getfield        #31  <Field ArrayList mViews>
		//*   9   18:invokevirtual   #60  <Method int ArrayList.size()>
		//*  10   21:ifne            26
			{
				return i;
		//   11   24:iload_1         
		//   12   25:ireturn         
			} else
			{
				calculateCachedEnd();
		//   13   26:aload_0         
		//   14   27:invokevirtual   #164 <Method void calculateCachedEnd()>
				return mCachedEnd;
		//   15   30:aload_0         
		//   16   31:getfield        #35  <Field int mCachedEnd>
		//   17   34:ireturn         
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
		//    8   12:getfield        #31  <Field ArrayList mViews>
		//    9   15:invokevirtual   #60  <Method int ArrayList.size()>
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
		//   19   31:getfield        #31  <Field ArrayList mViews>
		//   20   34:iload_2         
		//   21   35:invokevirtual   #100 <Method Object ArrayList.get(int)>
		//   22   38:checkcast       #102 <Class View>
		//   23   41:astore          6
					if(mReverseLayout)
		//*  24   43:aload_0         
		//*  25   44:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//*  26   47:getfield        #142 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
		//*  27   50:ifeq            70
					{
						view2 = view;
		//   28   53:aload           4
		//   29   55:astore          5
						if(getPosition(view3) <= i)
							break;
		//   30   57:aload_0         
		//   31   58:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//   32   61:aload           6
		//   33   63:invokevirtual   #159 <Method int StaggeredGridLayoutManager.getPosition(View)>
		//   34   66:iload_1         
		//   35   67:icmple          230
					}
					if(!mReverseLayout && getPosition(view3) >= i)
		//*  36   70:aload_0         
		//*  37   71:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//*  38   74:getfield        #142 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
		//*  39   77:ifne            96
		//*  40   80:aload_0         
		//*  41   81:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//*  42   84:aload           6
		//*  43   86:invokevirtual   #159 <Method int StaggeredGridLayoutManager.getPosition(View)>
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
		//   51  102:invokevirtual   #169 <Method boolean View.hasFocusable()>
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
		//   61  120:getfield        #31  <Field ArrayList mViews>
		//   62  123:invokevirtual   #60  <Method int ArrayList.size()>
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
		//   73  142:getfield        #31  <Field ArrayList mViews>
		//   74  145:iload_2         
		//   75  146:invokevirtual   #100 <Method Object ArrayList.get(int)>
		//   76  149:checkcast       #102 <Class View>
		//   77  152:astore          6
					if(mReverseLayout)
		//*  78  154:aload_0         
		//*  79  155:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//*  80  158:getfield        #142 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
		//*  81  161:ifeq            181
					{
						view2 = view1;
		//   82  164:aload           4
		//   83  166:astore          5
						if(getPosition(view4) >= i)
							break;
		//   84  168:aload_0         
		//   85  169:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//   86  172:aload           6
		//   87  174:invokevirtual   #159 <Method int StaggeredGridLayoutManager.getPosition(View)>
		//   88  177:iload_1         
		//   89  178:icmpge          230
					}
					if(!mReverseLayout && getPosition(view4) <= i)
		//*  90  181:aload_0         
		//*  91  182:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//*  92  185:getfield        #142 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
		//*  93  188:ifne            207
		//*  94  191:aload_0         
		//*  95  192:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//*  96  195:aload           6
		//*  97  197:invokevirtual   #159 <Method int StaggeredGridLayoutManager.getPosition(View)>
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
		//  105  213:invokevirtual   #169 <Method boolean View.hasFocusable()>
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

		LayoutParams getLayoutParams(View view)
		{
			return (LayoutParams)view.getLayoutParams();
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
		//*   3    6:icmpeq          14
				return mCachedStart;
		//    4    9:aload_0         
		//    5   10:getfield        #33  <Field int mCachedStart>
		//    6   13:ireturn         
			if(mViews.size() == 0)
		//*   7   14:aload_0         
		//*   8   15:getfield        #31  <Field ArrayList mViews>
		//*   9   18:invokevirtual   #60  <Method int ArrayList.size()>
		//*  10   21:ifne            26
			{
				return i;
		//   11   24:iload_1         
		//   12   25:ireturn         
			} else
			{
				calculateCachedStart();
		//   13   26:aload_0         
		//   14   27:invokevirtual   #174 <Method void calculateCachedStart()>
				return mCachedStart;
		//   15   30:aload_0         
		//   16   31:getfield        #33  <Field int mCachedStart>
		//   17   34:ireturn         
			}
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
			LayoutParams layoutparams = getLayoutParams(view);
		//   12   22:aload_0         
		//   13   23:aload_2         
		//   14   24:invokevirtual   #46  <Method StaggeredGridLayoutManager$LayoutParams getLayoutParams(View)>
		//   15   27:astore_3        
			layoutparams.mSpan = null;
		//   16   28:aload_3         
		//   17   29:aconst_null     
		//   18   30:putfield        #52  <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
			if(layoutparams.isItemRemoved() || layoutparams.isItemChanged())
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
			LayoutParams layoutparams = getLayoutParams(view);
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokevirtual   #46  <Method StaggeredGridLayoutManager$LayoutParams getLayoutParams(View)>
		//    9   17:astore_2        
			layoutparams.mSpan = null;
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
			if(layoutparams.isItemRemoved() || layoutparams.isItemChanged())
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
			LayoutParams layoutparams = getLayoutParams(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #46  <Method StaggeredGridLayoutManager$LayoutParams getLayoutParams(View)>
		//    3    5:astore_2        
			layoutparams.mSpan = this;
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
			if(layoutparams.isItemRemoved() || layoutparams.isItemChanged())
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

		Span(int i)
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


	public StaggeredGridLayoutManager(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #91  <Method void RecyclerView$LayoutManager()>
		mSpanCount = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #93  <Field int mSpanCount>
		mReverseLayout = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #95  <Field boolean mReverseLayout>
		mShouldReverseLayout = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #97  <Field boolean mShouldReverseLayout>
		mPendingScrollPosition = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #99  <Field int mPendingScrollPosition>
		mPendingScrollPositionOffset = 0x80000000;
	//   14   24:aload_0         
	//   15   25:ldc1            #43  <Int 0x80000000>
	//   16   27:putfield        #101 <Field int mPendingScrollPositionOffset>
		mLazySpanLookup = new LazySpanLookup();
	//   17   30:aload_0         
	//   18   31:new             #16  <Class StaggeredGridLayoutManager$LazySpanLookup>
	//   19   34:dup             
	//   20   35:invokespecial   #102 <Method void StaggeredGridLayoutManager$LazySpanLookup()>
	//   21   38:putfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
		mGapStrategy = 2;
	//   22   41:aload_0         
	//   23   42:iconst_2        
	//   24   43:putfield        #106 <Field int mGapStrategy>
		mTmpRect = new Rect();
	//   25   46:aload_0         
	//   26   47:new             #108 <Class Rect>
	//   27   50:dup             
	//   28   51:invokespecial   #109 <Method void Rect()>
	//   29   54:putfield        #111 <Field Rect mTmpRect>
		mAnchorInfo = new AnchorInfo();
	//   30   57:aload_0         
	//   31   58:new             #10  <Class StaggeredGridLayoutManager$AnchorInfo>
	//   32   61:dup             
	//   33   62:aload_0         
	//   34   63:invokespecial   #114 <Method void StaggeredGridLayoutManager$AnchorInfo(StaggeredGridLayoutManager)>
	//   35   66:putfield        #116 <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
		mLaidOutInvalidFullSpan = false;
	//   36   69:aload_0         
	//   37   70:iconst_0        
	//   38   71:putfield        #118 <Field boolean mLaidOutInvalidFullSpan>
		mSmoothScrollbarEnabled = true;
	//   39   74:aload_0         
	//   40   75:iconst_1        
	//   41   76:putfield        #120 <Field boolean mSmoothScrollbarEnabled>
		mCheckForGapsRunnable = new Runnable() {

			public void run()
			{
				checkForGaps();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field StaggeredGridLayoutManager this$0>
			//    2    4:invokevirtual   #23  <Method boolean StaggeredGridLayoutManager.checkForGaps()>
			//    3    7:pop             
			//    4    8:return          
			}

			final StaggeredGridLayoutManager this$0;

			
			{
				this$0 = StaggeredGridLayoutManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field StaggeredGridLayoutManager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   42   79:aload_0         
	//   43   80:new             #8   <Class StaggeredGridLayoutManager$1>
	//   44   83:dup             
	//   45   84:aload_0         
	//   46   85:invokespecial   #121 <Method void StaggeredGridLayoutManager$1(StaggeredGridLayoutManager)>
	//   47   88:putfield        #123 <Field Runnable mCheckForGapsRunnable>
		mOrientation = j;
	//   48   91:aload_0         
	//   49   92:iload_2         
	//   50   93:putfield        #125 <Field int mOrientation>
		setSpanCount(i);
	//   51   96:aload_0         
	//   52   97:iload_1         
	//   53   98:invokevirtual   #129 <Method void setSpanCount(int)>
		mLayoutState = new LayoutState();
	//   54  101:aload_0         
	//   55  102:new             #131 <Class LayoutState>
	//   56  105:dup             
	//   57  106:invokespecial   #132 <Method void LayoutState()>
	//   58  109:putfield        #134 <Field LayoutState mLayoutState>
		createOrientationHelpers();
	//   59  112:aload_0         
	//   60  113:invokespecial   #137 <Method void createOrientationHelpers()>
	//   61  116:return          
	}

	public StaggeredGridLayoutManager(Context context, AttributeSet attributeset, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #91  <Method void RecyclerView$LayoutManager()>
		mSpanCount = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #93  <Field int mSpanCount>
		mReverseLayout = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #95  <Field boolean mReverseLayout>
		mShouldReverseLayout = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #97  <Field boolean mShouldReverseLayout>
		mPendingScrollPosition = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #99  <Field int mPendingScrollPosition>
		mPendingScrollPositionOffset = 0x80000000;
	//   14   24:aload_0         
	//   15   25:ldc1            #43  <Int 0x80000000>
	//   16   27:putfield        #101 <Field int mPendingScrollPositionOffset>
		mLazySpanLookup = new LazySpanLookup();
	//   17   30:aload_0         
	//   18   31:new             #16  <Class StaggeredGridLayoutManager$LazySpanLookup>
	//   19   34:dup             
	//   20   35:invokespecial   #102 <Method void StaggeredGridLayoutManager$LazySpanLookup()>
	//   21   38:putfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
		mGapStrategy = 2;
	//   22   41:aload_0         
	//   23   42:iconst_2        
	//   24   43:putfield        #106 <Field int mGapStrategy>
		mTmpRect = new Rect();
	//   25   46:aload_0         
	//   26   47:new             #108 <Class Rect>
	//   27   50:dup             
	//   28   51:invokespecial   #109 <Method void Rect()>
	//   29   54:putfield        #111 <Field Rect mTmpRect>
		mAnchorInfo = new AnchorInfo();
	//   30   57:aload_0         
	//   31   58:new             #10  <Class StaggeredGridLayoutManager$AnchorInfo>
	//   32   61:dup             
	//   33   62:aload_0         
	//   34   63:invokespecial   #114 <Method void StaggeredGridLayoutManager$AnchorInfo(StaggeredGridLayoutManager)>
	//   35   66:putfield        #116 <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
		mLaidOutInvalidFullSpan = false;
	//   36   69:aload_0         
	//   37   70:iconst_0        
	//   38   71:putfield        #118 <Field boolean mLaidOutInvalidFullSpan>
		mSmoothScrollbarEnabled = true;
	//   39   74:aload_0         
	//   40   75:iconst_1        
	//   41   76:putfield        #120 <Field boolean mSmoothScrollbarEnabled>
		mCheckForGapsRunnable = new _cls1();
	//   42   79:aload_0         
	//   43   80:new             #8   <Class StaggeredGridLayoutManager$1>
	//   44   83:dup             
	//   45   84:aload_0         
	//   46   85:invokespecial   #121 <Method void StaggeredGridLayoutManager$1(StaggeredGridLayoutManager)>
	//   47   88:putfield        #123 <Field Runnable mCheckForGapsRunnable>
		context = ((Context) (getProperties(context, attributeset, i, j)));
	//   48   91:aload_1         
	//   49   92:aload_2         
	//   50   93:iload_3         
	//   51   94:iload           4
	//   52   96:invokestatic    #143 <Method RecyclerView$LayoutManager$Properties getProperties(Context, AttributeSet, int, int)>
	//   53   99:astore_1        
		setOrientation(((RecyclerView.LayoutManager.Properties) (context)).orientation);
	//   54  100:aload_0         
	//   55  101:aload_1         
	//   56  102:getfield        #148 <Field int RecyclerView$LayoutManager$Properties.orientation>
	//   57  105:invokevirtual   #151 <Method void setOrientation(int)>
		setSpanCount(((RecyclerView.LayoutManager.Properties) (context)).spanCount);
	//   58  108:aload_0         
	//   59  109:aload_1         
	//   60  110:getfield        #154 <Field int RecyclerView$LayoutManager$Properties.spanCount>
	//   61  113:invokevirtual   #129 <Method void setSpanCount(int)>
		setReverseLayout(((RecyclerView.LayoutManager.Properties) (context)).reverseLayout);
	//   62  116:aload_0         
	//   63  117:aload_1         
	//   64  118:getfield        #157 <Field boolean RecyclerView$LayoutManager$Properties.reverseLayout>
	//   65  121:invokevirtual   #161 <Method void setReverseLayout(boolean)>
		mLayoutState = new LayoutState();
	//   66  124:aload_0         
	//   67  125:new             #131 <Class LayoutState>
	//   68  128:dup             
	//   69  129:invokespecial   #132 <Method void LayoutState()>
	//   70  132:putfield        #134 <Field LayoutState mLayoutState>
		createOrientationHelpers();
	//   71  135:aload_0         
	//   72  136:invokespecial   #137 <Method void createOrientationHelpers()>
	//   73  139:return          
	}

	private void appendViewToAllSpans(View view)
	{
		for(int i = mSpanCount - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #93  <Field int mSpanCount>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iflt            28
			mSpans[i].appendToSpan(view);
	//    7   11:aload_0         
	//    8   12:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//    9   15:iload_2         
	//   10   16:aaload          
	//   11   17:aload_1         
	//   12   18:invokevirtual   #168 <Method void StaggeredGridLayoutManager$Span.appendToSpan(View)>

	//   13   21:iload_2         
	//   14   22:iconst_1        
	//   15   23:isub            
	//   16   24:istore_2        
	//*  17   25:goto            7
	//   18   28:return          
	}

	private void applyPendingSavedState(AnchorInfo anchorinfo)
	{
		if(mPendingSavedState.mSpanOffsetsSize > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*   2    4:getfield        #175 <Field int StaggeredGridLayoutManager$SavedState.mSpanOffsetsSize>
	//*   3    7:ifle            137
			if(mPendingSavedState.mSpanOffsetsSize == mSpanCount)
	//*   4   10:aload_0         
	//*   5   11:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*   6   14:getfield        #175 <Field int StaggeredGridLayoutManager$SavedState.mSpanOffsetsSize>
	//*   7   17:aload_0         
	//*   8   18:getfield        #93  <Field int mSpanCount>
	//*   9   21:icmpne          116
			{
				for(int j = 0; j < mSpanCount; j++)
	//*  10   24:iconst_0        
	//*  11   25:istore_3        
	//*  12   26:iload_3         
	//*  13   27:aload_0         
	//*  14   28:getfield        #93  <Field int mSpanCount>
	//*  15   31:icmpge          137
				{
					mSpans[j].clear();
	//   16   34:aload_0         
	//   17   35:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   18   38:iload_3         
	//   19   39:aaload          
	//   20   40:invokevirtual   #178 <Method void StaggeredGridLayoutManager$Span.clear()>
					int k = mPendingSavedState.mSpanOffsets[j];
	//   21   43:aload_0         
	//   22   44:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   23   47:getfield        #181 <Field int[] StaggeredGridLayoutManager$SavedState.mSpanOffsets>
	//   24   50:iload_3         
	//   25   51:iaload          
	//   26   52:istore          4
					int i = k;
	//   27   54:iload           4
	//   28   56:istore_2        
					if(k != 0x80000000)
	//*  29   57:iload           4
	//*  30   59:ldc1            #43  <Int 0x80000000>
	//*  31   61:icmpeq          99
						if(mPendingSavedState.mAnchorLayoutFromEnd)
	//*  32   64:aload_0         
	//*  33   65:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  34   68:getfield        #184 <Field boolean StaggeredGridLayoutManager$SavedState.mAnchorLayoutFromEnd>
	//*  35   71:ifeq            88
							i = k + mPrimaryOrientation.getEndAfterPadding();
	//   36   74:iload           4
	//   37   76:aload_0         
	//   38   77:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//   39   80:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//   40   83:iadd            
	//   41   84:istore_2        
						else
	//*  42   85:goto            99
							i = k + mPrimaryOrientation.getStartAfterPadding();
	//   43   88:iload           4
	//   44   90:aload_0         
	//   45   91:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//   46   94:invokevirtual   #195 <Method int OrientationHelper.getStartAfterPadding()>
	//   47   97:iadd            
	//   48   98:istore_2        
					mSpans[j].setLine(i);
	//   49   99:aload_0         
	//   50  100:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   51  103:iload_3         
	//   52  104:aaload          
	//   53  105:iload_2         
	//   54  106:invokevirtual   #198 <Method void StaggeredGridLayoutManager$Span.setLine(int)>
				}

	//   55  109:iload_3         
	//   56  110:iconst_1        
	//   57  111:iadd            
	//   58  112:istore_3        
			} else
	//*  59  113:goto            26
			{
				mPendingSavedState.invalidateSpanInfo();
	//   60  116:aload_0         
	//   61  117:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   62  120:invokevirtual   #201 <Method void StaggeredGridLayoutManager$SavedState.invalidateSpanInfo()>
				mPendingSavedState.mAnchorPosition = mPendingSavedState.mVisibleAnchorPosition;
	//   63  123:aload_0         
	//   64  124:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   65  127:aload_0         
	//   66  128:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   67  131:getfield        #204 <Field int StaggeredGridLayoutManager$SavedState.mVisibleAnchorPosition>
	//   68  134:putfield        #207 <Field int StaggeredGridLayoutManager$SavedState.mAnchorPosition>
			}
		mLastLayoutRTL = mPendingSavedState.mLastLayoutRTL;
	//   69  137:aload_0         
	//   70  138:aload_0         
	//   71  139:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   72  142:getfield        #209 <Field boolean StaggeredGridLayoutManager$SavedState.mLastLayoutRTL>
	//   73  145:putfield        #210 <Field boolean mLastLayoutRTL>
		setReverseLayout(mPendingSavedState.mReverseLayout);
	//   74  148:aload_0         
	//   75  149:aload_0         
	//   76  150:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   77  153:getfield        #211 <Field boolean StaggeredGridLayoutManager$SavedState.mReverseLayout>
	//   78  156:invokevirtual   #161 <Method void setReverseLayout(boolean)>
		resolveShouldLayoutReverse();
	//   79  159:aload_0         
	//   80  160:invokespecial   #214 <Method void resolveShouldLayoutReverse()>
		if(mPendingSavedState.mAnchorPosition != -1)
	//*  81  163:aload_0         
	//*  82  164:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  83  167:getfield        #207 <Field int StaggeredGridLayoutManager$SavedState.mAnchorPosition>
	//*  84  170:iconst_m1       
	//*  85  171:icmpeq          199
		{
			mPendingScrollPosition = mPendingSavedState.mAnchorPosition;
	//   86  174:aload_0         
	//   87  175:aload_0         
	//   88  176:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   89  179:getfield        #207 <Field int StaggeredGridLayoutManager$SavedState.mAnchorPosition>
	//   90  182:putfield        #99  <Field int mPendingScrollPosition>
			anchorinfo.mLayoutFromEnd = mPendingSavedState.mAnchorLayoutFromEnd;
	//   91  185:aload_1         
	//   92  186:aload_0         
	//   93  187:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   94  190:getfield        #184 <Field boolean StaggeredGridLayoutManager$SavedState.mAnchorLayoutFromEnd>
	//   95  193:putfield        #217 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
		} else
	//*  96  196:goto            207
		{
			anchorinfo.mLayoutFromEnd = mShouldReverseLayout;
	//   97  199:aload_1         
	//   98  200:aload_0         
	//   99  201:getfield        #97  <Field boolean mShouldReverseLayout>
	//  100  204:putfield        #217 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
		}
		if(mPendingSavedState.mSpanLookupSize > 1)
	//* 101  207:aload_0         
	//* 102  208:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//* 103  211:getfield        #220 <Field int StaggeredGridLayoutManager$SavedState.mSpanLookupSize>
	//* 104  214:iconst_1        
	//* 105  215:icmple          246
		{
			mLazySpanLookup.mData = mPendingSavedState.mSpanLookup;
	//  106  218:aload_0         
	//  107  219:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//  108  222:aload_0         
	//  109  223:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//  110  226:getfield        #223 <Field int[] StaggeredGridLayoutManager$SavedState.mSpanLookup>
	//  111  229:putfield        #226 <Field int[] StaggeredGridLayoutManager$LazySpanLookup.mData>
			mLazySpanLookup.mFullSpanItems = mPendingSavedState.mFullSpanItems;
	//  112  232:aload_0         
	//  113  233:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//  114  236:aload_0         
	//  115  237:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//  116  240:getfield        #230 <Field List StaggeredGridLayoutManager$SavedState.mFullSpanItems>
	//  117  243:putfield        #231 <Field List StaggeredGridLayoutManager$LazySpanLookup.mFullSpanItems>
		}
	//  118  246:return          
	}

	private void attachViewToSpans(View view, LayoutParams layoutparams, LayoutState layoutstate)
	{
		if(layoutstate.mLayoutDirection == 1)
	//*   0    0:aload_3         
	//*   1    1:getfield        #236 <Field int LayoutState.mLayoutDirection>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          30
			if(layoutparams.mFullSpan)
	//*   4    8:aload_2         
	//*   5    9:getfield        #239 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*   6   12:ifeq            21
			{
				appendViewToAllSpans(view);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #241 <Method void appendViewToAllSpans(View)>
				return;
	//   10   20:return          
			} else
			{
				layoutparams.mSpan.appendToSpan(view);
	//   11   21:aload_2         
	//   12   22:getfield        #245 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #168 <Method void StaggeredGridLayoutManager$Span.appendToSpan(View)>
				return;
	//   15   29:return          
			}
		if(layoutparams.mFullSpan)
	//*  16   30:aload_2         
	//*  17   31:getfield        #239 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*  18   34:ifeq            43
		{
			prependViewToAllSpans(view);
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:invokespecial   #248 <Method void prependViewToAllSpans(View)>
			return;
	//   22   42:return          
		} else
		{
			layoutparams.mSpan.prependToSpan(view);
	//   23   43:aload_2         
	//   24   44:getfield        #245 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//   25   47:aload_1         
	//   26   48:invokevirtual   #251 <Method void StaggeredGridLayoutManager$Span.prependToSpan(View)>
			return;
	//   27   51:return          
		}
	}

	private int calculateScrollDirectionForPosition(int i)
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #256 <Method int getChildCount()>
	//    2    4:istore_3        
		byte byte0 = -1;
	//    3    5:iconst_m1       
	//    4    6:istore_2        
		if(j == 0)
	//*   5    7:iload_3         
	//*   6    8:ifne            24
		{
			i = ((int) (byte0));
	//    7   11:iload_2         
	//    8   12:istore_1        
			if(mShouldReverseLayout)
	//*   9   13:aload_0         
	//*  10   14:getfield        #97  <Field boolean mShouldReverseLayout>
	//*  11   17:ifeq            22
				i = 1;
	//   12   20:iconst_1        
	//   13   21:istore_1        
			return i;
	//   14   22:iload_1         
	//   15   23:ireturn         
		}
		boolean flag;
		if(i < getFirstChildPosition())
	//*  16   24:iload_1         
	//*  17   25:aload_0         
	//*  18   26:invokevirtual   #259 <Method int getFirstChildPosition()>
	//*  19   29:icmpge          38
			flag = true;
	//   20   32:iconst_1        
	//   21   33:istore          4
		else
	//*  22   35:goto            41
			flag = false;
	//   23   38:iconst_0        
	//   24   39:istore          4
		return flag == mShouldReverseLayout ? 1 : -1;
	//   25   41:iload           4
	//   26   43:aload_0         
	//   27   44:getfield        #97  <Field boolean mShouldReverseLayout>
	//   28   47:icmpeq          52
	//   29   50:iconst_m1       
	//   30   51:ireturn         
	//   31   52:iconst_1        
	//   32   53:ireturn         
	}

	private boolean checkSpanForGap(Span span)
	{
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            50
		{
			if(span.getEndLine() < mPrimaryOrientation.getEndAfterPadding())
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #264 <Method int StaggeredGridLayoutManager$Span.getEndLine()>
	//*   5   11:aload_0         
	//*   6   12:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//*   7   15:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//*   8   18:icmpge          85
				return span.getLayoutParams((View)span.mViews.get(span.mViews.size() - 1)).mFullSpan ^ true;
	//    9   21:aload_1         
	//   10   22:aload_1         
	//   11   23:getfield        #268 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//   12   26:aload_1         
	//   13   27:getfield        #268 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//   14   30:invokevirtual   #273 <Method int ArrayList.size()>
	//   15   33:iconst_1        
	//   16   34:isub            
	//   17   35:invokevirtual   #277 <Method Object ArrayList.get(int)>
	//   18   38:checkcast       #279 <Class View>
	//   19   41:invokevirtual   #283 <Method StaggeredGridLayoutManager$LayoutParams StaggeredGridLayoutManager$Span.getLayoutParams(View)>
	//   20   44:getfield        #239 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//   21   47:iconst_1        
	//   22   48:ixor            
	//   23   49:ireturn         
		} else
		if(span.getStartLine() > mPrimaryOrientation.getStartAfterPadding())
	//*  24   50:aload_1         
	//*  25   51:invokevirtual   #286 <Method int StaggeredGridLayoutManager$Span.getStartLine()>
	//*  26   54:aload_0         
	//*  27   55:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//*  28   58:invokevirtual   #195 <Method int OrientationHelper.getStartAfterPadding()>
	//*  29   61:icmple          85
			return span.getLayoutParams((View)span.mViews.get(0)).mFullSpan ^ true;
	//   30   64:aload_1         
	//   31   65:aload_1         
	//   32   66:getfield        #268 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//   33   69:iconst_0        
	//   34   70:invokevirtual   #277 <Method Object ArrayList.get(int)>
	//   35   73:checkcast       #279 <Class View>
	//   36   76:invokevirtual   #283 <Method StaggeredGridLayoutManager$LayoutParams StaggeredGridLayoutManager$Span.getLayoutParams(View)>
	//   37   79:getfield        #239 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//   38   82:iconst_1        
	//   39   83:ixor            
	//   40   84:ireturn         
		return false;
	//   41   85:iconst_0        
	//   42   86:ireturn         
	}

	private int computeScrollExtent(RecyclerView.State state)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #256 <Method int getChildCount()>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return ScrollbarHelper.computeScrollExtent(state, mPrimaryOrientation, findFirstVisibleItemClosestToStart(mSmoothScrollbarEnabled ^ true), findFirstVisibleItemClosestToEnd(mSmoothScrollbarEnabled ^ true), ((RecyclerView.LayoutManager) (this)), mSmoothScrollbarEnabled);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #120 <Field boolean mSmoothScrollbarEnabled>
	//   11   19:iconst_1        
	//   12   20:ixor            
	//   13   21:invokevirtual   #292 <Method View findFirstVisibleItemClosestToStart(boolean)>
	//   14   24:aload_0         
	//   15   25:aload_0         
	//   16   26:getfield        #120 <Field boolean mSmoothScrollbarEnabled>
	//   17   29:iconst_1        
	//   18   30:ixor            
	//   19   31:invokevirtual   #295 <Method View findFirstVisibleItemClosestToEnd(boolean)>
	//   20   34:aload_0         
	//   21   35:aload_0         
	//   22   36:getfield        #120 <Field boolean mSmoothScrollbarEnabled>
	//   23   39:invokestatic    #300 <Method int ScrollbarHelper.computeScrollExtent(RecyclerView$State, OrientationHelper, View, View, RecyclerView$LayoutManager, boolean)>
	//   24   42:ireturn         
	}

	private int computeScrollOffset(RecyclerView.State state)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #256 <Method int getChildCount()>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return ScrollbarHelper.computeScrollOffset(state, mPrimaryOrientation, findFirstVisibleItemClosestToStart(mSmoothScrollbarEnabled ^ true), findFirstVisibleItemClosestToEnd(mSmoothScrollbarEnabled ^ true), ((RecyclerView.LayoutManager) (this)), mSmoothScrollbarEnabled, mShouldReverseLayout);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #120 <Field boolean mSmoothScrollbarEnabled>
	//   11   19:iconst_1        
	//   12   20:ixor            
	//   13   21:invokevirtual   #292 <Method View findFirstVisibleItemClosestToStart(boolean)>
	//   14   24:aload_0         
	//   15   25:aload_0         
	//   16   26:getfield        #120 <Field boolean mSmoothScrollbarEnabled>
	//   17   29:iconst_1        
	//   18   30:ixor            
	//   19   31:invokevirtual   #295 <Method View findFirstVisibleItemClosestToEnd(boolean)>
	//   20   34:aload_0         
	//   21   35:aload_0         
	//   22   36:getfield        #120 <Field boolean mSmoothScrollbarEnabled>
	//   23   39:aload_0         
	//   24   40:getfield        #97  <Field boolean mShouldReverseLayout>
	//   25   43:invokestatic    #304 <Method int ScrollbarHelper.computeScrollOffset(RecyclerView$State, OrientationHelper, View, View, RecyclerView$LayoutManager, boolean, boolean)>
	//   26   46:ireturn         
	}

	private int computeScrollRange(RecyclerView.State state)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #256 <Method int getChildCount()>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return ScrollbarHelper.computeScrollRange(state, mPrimaryOrientation, findFirstVisibleItemClosestToStart(mSmoothScrollbarEnabled ^ true), findFirstVisibleItemClosestToEnd(mSmoothScrollbarEnabled ^ true), ((RecyclerView.LayoutManager) (this)), mSmoothScrollbarEnabled);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #120 <Field boolean mSmoothScrollbarEnabled>
	//   11   19:iconst_1        
	//   12   20:ixor            
	//   13   21:invokevirtual   #292 <Method View findFirstVisibleItemClosestToStart(boolean)>
	//   14   24:aload_0         
	//   15   25:aload_0         
	//   16   26:getfield        #120 <Field boolean mSmoothScrollbarEnabled>
	//   17   29:iconst_1        
	//   18   30:ixor            
	//   19   31:invokevirtual   #295 <Method View findFirstVisibleItemClosestToEnd(boolean)>
	//   20   34:aload_0         
	//   21   35:aload_0         
	//   22   36:getfield        #120 <Field boolean mSmoothScrollbarEnabled>
	//   23   39:invokestatic    #307 <Method int ScrollbarHelper.computeScrollRange(RecyclerView$State, OrientationHelper, View, View, RecyclerView$LayoutManager, boolean)>
	//   24   42:ireturn         
	}

	private int convertFocusDirectionToLayoutDirection(int i)
	{
		int j = 0x80000000;
	//    0    0:ldc1            #43  <Int 0x80000000>
	//    1    2:istore_2        
		if(i != 17)
	//*   2    3:iload_1         
	//*   3    4:bipush          17
	//*   4    6:icmpeq          133
		{
			if(i != 33)
	//*   5    9:iload_1         
	//*   6   10:bipush          33
	//*   7   12:icmpeq          120
			{
				if(i != 66)
	//*   8   15:iload_1         
	//*   9   16:bipush          66
	//*  10   18:icmpeq          109
				{
					if(i != 130)
	//*  11   21:iload_1         
	//*  12   22:sipush          130
	//*  13   25:icmpeq          97
					{
						switch(i)
	//*  14   28:iload_1         
						{
	//*  15   29:tableswitch     1 2: default 52
	//	               1 76
	//	               2 55
						default:
							return 0x80000000;
	//   16   52:ldc1            #43  <Int 0x80000000>
	//   17   54:ireturn         

						case 2: // '\002'
							if(mOrientation == 1)
	//*  18   55:aload_0         
	//*  19   56:getfield        #125 <Field int mOrientation>
	//*  20   59:iconst_1        
	//*  21   60:icmpne          65
								return 1;
	//   22   63:iconst_1        
	//   23   64:ireturn         
							return !isLayoutRTL() ? 1 : -1;
	//   24   65:aload_0         
	//   25   66:invokevirtual   #312 <Method boolean isLayoutRTL()>
	//   26   69:ifeq            74
	//   27   72:iconst_m1       
	//   28   73:ireturn         
	//   29   74:iconst_1        
	//   30   75:ireturn         

						case 1: // '\001'
							break;
						}
						if(mOrientation == 1)
	//*  31   76:aload_0         
	//*  32   77:getfield        #125 <Field int mOrientation>
	//*  33   80:iconst_1        
	//*  34   81:icmpne          86
							return -1;
	//   35   84:iconst_m1       
	//   36   85:ireturn         
						return !isLayoutRTL() ? -1 : 1;
	//   37   86:aload_0         
	//   38   87:invokevirtual   #312 <Method boolean isLayoutRTL()>
	//   39   90:ifeq            95
	//   40   93:iconst_1        
	//   41   94:ireturn         
	//   42   95:iconst_m1       
	//   43   96:ireturn         
					}
					if(mOrientation == 1)
	//*  44   97:aload_0         
	//*  45   98:getfield        #125 <Field int mOrientation>
	//*  46  101:iconst_1        
	//*  47  102:icmpne          107
						j = 1;
	//   48  105:iconst_1        
	//   49  106:istore_2        
					return j;
	//   50  107:iload_2         
	//   51  108:ireturn         
				}
				if(mOrientation == 0)
	//*  52  109:aload_0         
	//*  53  110:getfield        #125 <Field int mOrientation>
	//*  54  113:ifne            118
					j = 1;
	//   55  116:iconst_1        
	//   56  117:istore_2        
				return j;
	//   57  118:iload_2         
	//   58  119:ireturn         
			}
			return mOrientation != 1 ? 0x80000000 : -1;
	//   59  120:aload_0         
	//   60  121:getfield        #125 <Field int mOrientation>
	//   61  124:iconst_1        
	//   62  125:icmpne          130
	//   63  128:iconst_m1       
	//   64  129:ireturn         
	//   65  130:ldc1            #43  <Int 0x80000000>
	//   66  132:ireturn         
		}
		return mOrientation != 0 ? 0x80000000 : -1;
	//   67  133:aload_0         
	//   68  134:getfield        #125 <Field int mOrientation>
	//   69  137:ifne            142
	//   70  140:iconst_m1       
	//   71  141:ireturn         
	//   72  142:ldc1            #43  <Int 0x80000000>
	//   73  144:ireturn         
	}

	private LazySpanLookup.FullSpanItem createFullSpanItemFromEnd(int i)
	{
		LazySpanLookup.FullSpanItem fullspanitem = new LazySpanLookup.FullSpanItem();
	//    0    0:new             #19  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//    1    3:dup             
	//    2    4:invokespecial   #315 <Method void StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem()>
	//    3    7:astore_3        
		fullspanitem.mGapPerSpan = new int[mSpanCount];
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #93  <Field int mSpanCount>
	//    7   13:newarray        int[]
	//    8   15:putfield        #318 <Field int[] StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapPerSpan>
		for(int j = 0; j < mSpanCount; j++)
	//*   9   18:iconst_0        
	//*  10   19:istore_2        
	//*  11   20:iload_2         
	//*  12   21:aload_0         
	//*  13   22:getfield        #93  <Field int mSpanCount>
	//*  14   25:icmpge          53
			fullspanitem.mGapPerSpan[j] = i - mSpans[j].getEndLine(i);
	//   15   28:aload_3         
	//   16   29:getfield        #318 <Field int[] StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapPerSpan>
	//   17   32:iload_2         
	//   18   33:iload_1         
	//   19   34:aload_0         
	//   20   35:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   21   38:iload_2         
	//   22   39:aaload          
	//   23   40:iload_1         
	//   24   41:invokevirtual   #320 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
	//   25   44:isub            
	//   26   45:iastore         

	//   27   46:iload_2         
	//   28   47:iconst_1        
	//   29   48:iadd            
	//   30   49:istore_2        
	//*  31   50:goto            20
		return fullspanitem;
	//   32   53:aload_3         
	//   33   54:areturn         
	}

	private LazySpanLookup.FullSpanItem createFullSpanItemFromStart(int i)
	{
		LazySpanLookup.FullSpanItem fullspanitem = new LazySpanLookup.FullSpanItem();
	//    0    0:new             #19  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//    1    3:dup             
	//    2    4:invokespecial   #315 <Method void StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem()>
	//    3    7:astore_3        
		fullspanitem.mGapPerSpan = new int[mSpanCount];
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #93  <Field int mSpanCount>
	//    7   13:newarray        int[]
	//    8   15:putfield        #318 <Field int[] StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapPerSpan>
		for(int j = 0; j < mSpanCount; j++)
	//*   9   18:iconst_0        
	//*  10   19:istore_2        
	//*  11   20:iload_2         
	//*  12   21:aload_0         
	//*  13   22:getfield        #93  <Field int mSpanCount>
	//*  14   25:icmpge          53
			fullspanitem.mGapPerSpan[j] = mSpans[j].getStartLine(i) - i;
	//   15   28:aload_3         
	//   16   29:getfield        #318 <Field int[] StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapPerSpan>
	//   17   32:iload_2         
	//   18   33:aload_0         
	//   19   34:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   20   37:iload_2         
	//   21   38:aaload          
	//   22   39:iload_1         
	//   23   40:invokevirtual   #323 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
	//   24   43:iload_1         
	//   25   44:isub            
	//   26   45:iastore         

	//   27   46:iload_2         
	//   28   47:iconst_1        
	//   29   48:iadd            
	//   30   49:istore_2        
	//*  31   50:goto            20
		return fullspanitem;
	//   32   53:aload_3         
	//   33   54:areturn         
	}

	private void createOrientationHelpers()
	{
		mPrimaryOrientation = OrientationHelper.createOrientationHelper(((RecyclerView.LayoutManager) (this)), mOrientation);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #125 <Field int mOrientation>
	//    4    6:invokestatic    #327 <Method OrientationHelper OrientationHelper.createOrientationHelper(RecyclerView$LayoutManager, int)>
	//    5    9:putfield        #186 <Field OrientationHelper mPrimaryOrientation>
		mSecondaryOrientation = OrientationHelper.createOrientationHelper(((RecyclerView.LayoutManager) (this)), 1 - mOrientation);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:aload_0         
	//   10   16:getfield        #125 <Field int mOrientation>
	//   11   19:isub            
	//   12   20:invokestatic    #327 <Method OrientationHelper OrientationHelper.createOrientationHelper(RecyclerView$LayoutManager, int)>
	//   13   23:putfield        #329 <Field OrientationHelper mSecondaryOrientation>
	//   14   26:return          
	}

	private int fill(RecyclerView.Recycler recycler, LayoutState layoutstate, RecyclerView.State state)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.useAs(TypeTransformer.java:868)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:668)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #333 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #335 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.useAs(TypeTransformer.java:868)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:668)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #340 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	private int findFirstReferenceChildPosition(int i)
	{
		int k = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #256 <Method int getChildCount()>
	//    2    4:istore_3        
		for(int j = 0; j < k; j++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          44
		{
			int l = getPosition(getChildAt(j));
	//    8   12:aload_0         
	//    9   13:aload_0         
	//   10   14:iload_2         
	//   11   15:invokevirtual   #345 <Method View getChildAt(int)>
	//   12   18:invokevirtual   #349 <Method int getPosition(View)>
	//   13   21:istore          4
			if(l >= 0 && l < i)
	//*  14   23:iload           4
	//*  15   25:iflt            37
	//*  16   28:iload           4
	//*  17   30:iload_1         
	//*  18   31:icmpge          37
				return l;
	//   19   34:iload           4
	//   20   36:ireturn         
		}

	//   21   37:iload_2         
	//   22   38:iconst_1        
	//   23   39:iadd            
	//   24   40:istore_2        
	//*  25   41:goto            7
		return 0;
	//   26   44:iconst_0        
	//   27   45:ireturn         
	}

	private int findLastReferenceChildPosition(int i)
	{
		for(int j = getChildCount() - 1; j >= 0; j--)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #256 <Method int getChildCount()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iflt            39
		{
			int k = getPosition(getChildAt(j));
	//    7   11:aload_0         
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:invokevirtual   #345 <Method View getChildAt(int)>
	//   11   17:invokevirtual   #349 <Method int getPosition(View)>
	//   12   20:istore_3        
			if(k >= 0 && k < i)
	//*  13   21:iload_3         
	//*  14   22:iflt            32
	//*  15   25:iload_3         
	//*  16   26:iload_1         
	//*  17   27:icmpge          32
				return k;
	//   18   30:iload_3         
	//   19   31:ireturn         
		}

	//   20   32:iload_2         
	//   21   33:iconst_1        
	//   22   34:isub            
	//   23   35:istore_2        
	//*  24   36:goto            7
		return 0;
	//   25   39:iconst_0        
	//   26   40:ireturn         
	}

	private void fixEndGap(RecyclerView.Recycler recycler, RecyclerView.State state, boolean flag)
	{
		int i = getMaxEnd(0x80000000);
	//    0    0:aload_0         
	//    1    1:ldc1            #43  <Int 0x80000000>
	//    2    3:invokespecial   #355 <Method int getMaxEnd(int)>
	//    3    6:istore          4
		if(i == 0x80000000)
	//*   4    8:iload           4
	//*   5   10:ldc1            #43  <Int 0x80000000>
	//*   6   12:icmpne          16
			return;
	//    7   15:return          
		i = mPrimaryOrientation.getEndAfterPadding() - i;
	//    8   16:aload_0         
	//    9   17:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//   10   20:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//   11   23:iload           4
	//   12   25:isub            
	//   13   26:istore          4
		if(i > 0)
	//*  14   28:iload           4
	//*  15   30:ifle            67
		{
			i -= -scrollBy(-i, recycler, state);
	//   16   33:iload           4
	//   17   35:aload_0         
	//   18   36:iload           4
	//   19   38:ineg            
	//   20   39:aload_1         
	//   21   40:aload_2         
	//   22   41:invokevirtual   #359 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//   23   44:ineg            
	//   24   45:isub            
	//   25   46:istore          4
			if(flag && i > 0)
	//*  26   48:iload_3         
	//*  27   49:ifeq            66
	//*  28   52:iload           4
	//*  29   54:ifle            66
				mPrimaryOrientation.offsetChildren(i);
	//   30   57:aload_0         
	//   31   58:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//   32   61:iload           4
	//   33   63:invokevirtual   #362 <Method void OrientationHelper.offsetChildren(int)>
			return;
	//   34   66:return          
		} else
		{
			return;
	//   35   67:return          
		}
	}

	private void fixStartGap(RecyclerView.Recycler recycler, RecyclerView.State state, boolean flag)
	{
		int i = getMinStart(0x7fffffff);
	//    0    0:aload_0         
	//    1    1:ldc2            #364 <Int 0x7fffffff>
	//    2    4:invokespecial   #367 <Method int getMinStart(int)>
	//    3    7:istore          4
		if(i == 0x7fffffff)
	//*   4    9:iload           4
	//*   5   11:ldc2            #364 <Int 0x7fffffff>
	//*   6   14:icmpne          18
			return;
	//    7   17:return          
		i -= mPrimaryOrientation.getStartAfterPadding();
	//    8   18:iload           4
	//    9   20:aload_0         
	//   10   21:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//   11   24:invokevirtual   #195 <Method int OrientationHelper.getStartAfterPadding()>
	//   12   27:isub            
	//   13   28:istore          4
		if(i > 0)
	//*  14   30:iload           4
	//*  15   32:ifle            68
		{
			i -= scrollBy(i, recycler, state);
	//   16   35:iload           4
	//   17   37:aload_0         
	//   18   38:iload           4
	//   19   40:aload_1         
	//   20   41:aload_2         
	//   21   42:invokevirtual   #359 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//   22   45:isub            
	//   23   46:istore          4
			if(flag && i > 0)
	//*  24   48:iload_3         
	//*  25   49:ifeq            67
	//*  26   52:iload           4
	//*  27   54:ifle            67
				mPrimaryOrientation.offsetChildren(-i);
	//   28   57:aload_0         
	//   29   58:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//   30   61:iload           4
	//   31   63:ineg            
	//   32   64:invokevirtual   #362 <Method void OrientationHelper.offsetChildren(int)>
			return;
	//   33   67:return          
		} else
		{
			return;
	//   34   68:return          
		}
	}

	private int getMaxEnd(int i)
	{
		int k = mSpans[0].getEndLine(i);
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:iload_1         
	//    5    7:invokevirtual   #320 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
	//    6   10:istore_3        
		for(int j = 1; j < mSpanCount;)
	//*   7   11:iconst_1        
	//*   8   12:istore_2        
	//*   9   13:iload_2         
	//*  10   14:aload_0         
	//*  11   15:getfield        #93  <Field int mSpanCount>
	//*  12   18:icmpge          56
		{
			int i1 = mSpans[j].getEndLine(i);
	//   13   21:aload_0         
	//   14   22:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   15   25:iload_2         
	//   16   26:aaload          
	//   17   27:iload_1         
	//   18   28:invokevirtual   #320 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
	//   19   31:istore          5
			int l = k;
	//   20   33:iload_3         
	//   21   34:istore          4
			if(i1 > k)
	//*  22   36:iload           5
	//*  23   38:iload_3         
	//*  24   39:icmple          46
				l = i1;
	//   25   42:iload           5
	//   26   44:istore          4
			j++;
	//   27   46:iload_2         
	//   28   47:iconst_1        
	//   29   48:iadd            
	//   30   49:istore_2        
			k = l;
	//   31   50:iload           4
	//   32   52:istore_3        
		}

	//*  33   53:goto            13
		return k;
	//   34   56:iload_3         
	//   35   57:ireturn         
	}

	private int getMaxStart(int i)
	{
		int k = mSpans[0].getStartLine(i);
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:iload_1         
	//    5    7:invokevirtual   #323 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
	//    6   10:istore_3        
		for(int j = 1; j < mSpanCount;)
	//*   7   11:iconst_1        
	//*   8   12:istore_2        
	//*   9   13:iload_2         
	//*  10   14:aload_0         
	//*  11   15:getfield        #93  <Field int mSpanCount>
	//*  12   18:icmpge          56
		{
			int i1 = mSpans[j].getStartLine(i);
	//   13   21:aload_0         
	//   14   22:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   15   25:iload_2         
	//   16   26:aaload          
	//   17   27:iload_1         
	//   18   28:invokevirtual   #323 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
	//   19   31:istore          5
			int l = k;
	//   20   33:iload_3         
	//   21   34:istore          4
			if(i1 > k)
	//*  22   36:iload           5
	//*  23   38:iload_3         
	//*  24   39:icmple          46
				l = i1;
	//   25   42:iload           5
	//   26   44:istore          4
			j++;
	//   27   46:iload_2         
	//   28   47:iconst_1        
	//   29   48:iadd            
	//   30   49:istore_2        
			k = l;
	//   31   50:iload           4
	//   32   52:istore_3        
		}

	//*  33   53:goto            13
		return k;
	//   34   56:iload_3         
	//   35   57:ireturn         
	}

	private int getMinEnd(int i)
	{
		int k = mSpans[0].getEndLine(i);
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:iload_1         
	//    5    7:invokevirtual   #320 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
	//    6   10:istore_3        
		for(int j = 1; j < mSpanCount;)
	//*   7   11:iconst_1        
	//*   8   12:istore_2        
	//*   9   13:iload_2         
	//*  10   14:aload_0         
	//*  11   15:getfield        #93  <Field int mSpanCount>
	//*  12   18:icmpge          56
		{
			int i1 = mSpans[j].getEndLine(i);
	//   13   21:aload_0         
	//   14   22:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   15   25:iload_2         
	//   16   26:aaload          
	//   17   27:iload_1         
	//   18   28:invokevirtual   #320 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
	//   19   31:istore          5
			int l = k;
	//   20   33:iload_3         
	//   21   34:istore          4
			if(i1 < k)
	//*  22   36:iload           5
	//*  23   38:iload_3         
	//*  24   39:icmpge          46
				l = i1;
	//   25   42:iload           5
	//   26   44:istore          4
			j++;
	//   27   46:iload_2         
	//   28   47:iconst_1        
	//   29   48:iadd            
	//   30   49:istore_2        
			k = l;
	//   31   50:iload           4
	//   32   52:istore_3        
		}

	//*  33   53:goto            13
		return k;
	//   34   56:iload_3         
	//   35   57:ireturn         
	}

	private int getMinStart(int i)
	{
		int k = mSpans[0].getStartLine(i);
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:iload_1         
	//    5    7:invokevirtual   #323 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
	//    6   10:istore_3        
		for(int j = 1; j < mSpanCount;)
	//*   7   11:iconst_1        
	//*   8   12:istore_2        
	//*   9   13:iload_2         
	//*  10   14:aload_0         
	//*  11   15:getfield        #93  <Field int mSpanCount>
	//*  12   18:icmpge          56
		{
			int i1 = mSpans[j].getStartLine(i);
	//   13   21:aload_0         
	//   14   22:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   15   25:iload_2         
	//   16   26:aaload          
	//   17   27:iload_1         
	//   18   28:invokevirtual   #323 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
	//   19   31:istore          5
			int l = k;
	//   20   33:iload_3         
	//   21   34:istore          4
			if(i1 < k)
	//*  22   36:iload           5
	//*  23   38:iload_3         
	//*  24   39:icmpge          46
				l = i1;
	//   25   42:iload           5
	//   26   44:istore          4
			j++;
	//   27   46:iload_2         
	//   28   47:iconst_1        
	//   29   48:iadd            
	//   30   49:istore_2        
			k = l;
	//   31   50:iload           4
	//   32   52:istore_3        
		}

	//*  33   53:goto            13
		return k;
	//   34   56:iload_3         
	//   35   57:ireturn         
	}

	private Span getNextSpan(LayoutState layoutstate)
	{
		boolean flag = preferLastSpan(layoutstate.mLayoutDirection);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #236 <Field int LayoutState.mLayoutDirection>
	//    3    5:invokespecial   #375 <Method boolean preferLastSpan(int)>
	//    4    8:istore          9
		int j = -1;
	//    5   10:iconst_m1       
	//    6   11:istore_3        
		int i;
		byte byte0;
		if(flag)
	//*   7   12:iload           9
	//*   8   14:ifeq            30
		{
			i = mSpanCount - 1;
	//    9   17:aload_0         
	//   10   18:getfield        #93  <Field int mSpanCount>
	//   11   21:iconst_1        
	//   12   22:isub            
	//   13   23:istore_2        
			byte0 = -1;
	//   14   24:iconst_m1       
	//   15   25:istore          4
		} else
	//*  16   27:goto            40
		{
			i = 0;
	//   17   30:iconst_0        
	//   18   31:istore_2        
			j = mSpanCount;
	//   19   32:aload_0         
	//   20   33:getfield        #93  <Field int mSpanCount>
	//   21   36:istore_3        
			byte0 = 1;
	//   22   37:iconst_1        
	//   23   38:istore          4
		}
		int k = layoutstate.mLayoutDirection;
	//   24   40:aload_1         
	//   25   41:getfield        #236 <Field int LayoutState.mLayoutDirection>
	//   26   44:istore          5
		Span span = null;
	//   27   46:aconst_null     
	//   28   47:astore          10
		layoutstate = null;
	//   29   49:aconst_null     
	//   30   50:astore_1        
		if(k == 1)
	//*  31   51:iload           5
	//*  32   53:iconst_1        
	//*  33   54:icmpne          125
		{
			k = 0x7fffffff;
	//   34   57:ldc2            #364 <Int 0x7fffffff>
	//   35   60:istore          5
			int l1 = mPrimaryOrientation.getStartAfterPadding();
	//   36   62:aload_0         
	//   37   63:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//   38   66:invokevirtual   #195 <Method int OrientationHelper.getStartAfterPadding()>
	//   39   69:istore          8
			while(i != j) 
	//*  40   71:iload_2         
	//*  41   72:iload_3         
	//*  42   73:icmpeq          123
			{
				span = mSpans[i];
	//   43   76:aload_0         
	//   44   77:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   45   80:iload_2         
	//   46   81:aaload          
	//   47   82:astore          10
				int j1 = span.getEndLine(l1);
	//   48   84:aload           10
	//   49   86:iload           8
	//   50   88:invokevirtual   #320 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
	//   51   91:istore          7
				int l = k;
	//   52   93:iload           5
	//   53   95:istore          6
				if(j1 < k)
	//*  54   97:iload           7
	//*  55   99:iload           5
	//*  56  101:icmpge          111
				{
					layoutstate = ((LayoutState) (span));
	//   57  104:aload           10
	//   58  106:astore_1        
					l = j1;
	//   59  107:iload           7
	//   60  109:istore          6
				}
				i += ((int) (byte0));
	//   61  111:iload_2         
	//   62  112:iload           4
	//   63  114:iadd            
	//   64  115:istore_2        
				k = l;
	//   65  116:iload           6
	//   66  118:istore          5
			}
	//*  67  120:goto            71
			return ((Span) (layoutstate));
	//   68  123:aload_1         
	//   69  124:areturn         
		}
		k = 0x80000000;
	//   70  125:ldc1            #43  <Int 0x80000000>
	//   71  127:istore          5
		int i2 = mPrimaryOrientation.getEndAfterPadding();
	//   72  129:aload_0         
	//   73  130:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//   74  133:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//   75  136:istore          8
		layoutstate = ((LayoutState) (span));
	//   76  138:aload           10
	//   77  140:astore_1        
		while(i != j) 
	//*  78  141:iload_2         
	//*  79  142:iload_3         
	//*  80  143:icmpeq          193
		{
			Span span1 = mSpans[i];
	//   81  146:aload_0         
	//   82  147:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   83  150:iload_2         
	//   84  151:aaload          
	//   85  152:astore          10
			int k1 = span1.getStartLine(i2);
	//   86  154:aload           10
	//   87  156:iload           8
	//   88  158:invokevirtual   #323 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
	//   89  161:istore          7
			int i1 = k;
	//   90  163:iload           5
	//   91  165:istore          6
			if(k1 > k)
	//*  92  167:iload           7
	//*  93  169:iload           5
	//*  94  171:icmple          181
			{
				layoutstate = ((LayoutState) (span1));
	//   95  174:aload           10
	//   96  176:astore_1        
				i1 = k1;
	//   97  177:iload           7
	//   98  179:istore          6
			}
			i += ((int) (byte0));
	//   99  181:iload_2         
	//  100  182:iload           4
	//  101  184:iadd            
	//  102  185:istore_2        
			k = i1;
	//  103  186:iload           6
	//  104  188:istore          5
		}
	//* 105  190:goto            141
		return ((Span) (layoutstate));
	//  106  193:aload_1         
	//  107  194:areturn         
	}

	private void handleUpdate(int i, int j, int k)
	{
		int l;
		int i1;
		int j1;
label0:
		{
			if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            16
				i1 = getLastChildPosition();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #380 <Method int getLastChildPosition()>
	//    5   11:istore          5
			else
	//*   6   13:goto            22
				i1 = getFirstChildPosition();
	//    7   16:aload_0         
	//    8   17:invokevirtual   #259 <Method int getFirstChildPosition()>
	//    9   20:istore          5
			if(k == 8)
	//*  10   22:iload_3         
	//*  11   23:bipush          8
	//*  12   25:icmpne          52
			{
				if(i < j)
	//*  13   28:iload_1         
	//*  14   29:iload_2         
	//*  15   30:icmpge          41
				{
					l = j + 1;
	//   16   33:iload_2         
	//   17   34:iconst_1        
	//   18   35:iadd            
	//   19   36:istore          4
				} else
	//*  20   38:goto            57
				{
					j1 = i + 1;
	//   21   41:iload_1         
	//   22   42:iconst_1        
	//   23   43:iadd            
	//   24   44:istore          6
					l = j;
	//   25   46:iload_2         
	//   26   47:istore          4
					break label0;
	//   27   49:goto            64
				}
			} else
			{
				l = i + j;
	//   28   52:iload_1         
	//   29   53:iload_2         
	//   30   54:iadd            
	//   31   55:istore          4
			}
			j1 = l;
	//   32   57:iload           4
	//   33   59:istore          6
			l = i;
	//   34   61:iload_1         
	//   35   62:istore          4
		}
		mLazySpanLookup.invalidateAfter(l);
	//   36   64:aload_0         
	//   37   65:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   38   68:iload           4
	//   39   70:invokevirtual   #383 <Method int StaggeredGridLayoutManager$LazySpanLookup.invalidateAfter(int)>
	//   40   73:pop             
		if(k != 8)
	//*  41   74:iload_3         
	//*  42   75:bipush          8
	//*  43   77:icmpeq          131
		{
			switch(k)
	//*  44   80:iload_3         
			{
	//*  45   81:tableswitch     1 2: default 104
	//	               1 119
	//	               2 107
	//*  46  104:goto            149
			case 2: // '\002'
				mLazySpanLookup.offsetForRemoval(i, j);
	//   47  107:aload_0         
	//   48  108:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   49  111:iload_1         
	//   50  112:iload_2         
	//   51  113:invokevirtual   #386 <Method void StaggeredGridLayoutManager$LazySpanLookup.offsetForRemoval(int, int)>
				break;

	//*  52  116:goto            149
			case 1: // '\001'
				mLazySpanLookup.offsetForAddition(i, j);
	//   53  119:aload_0         
	//   54  120:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   55  123:iload_1         
	//   56  124:iload_2         
	//   57  125:invokevirtual   #389 <Method void StaggeredGridLayoutManager$LazySpanLookup.offsetForAddition(int, int)>
				break;
			}
		} else
	//*  58  128:goto            149
		{
			mLazySpanLookup.offsetForRemoval(i, 1);
	//   59  131:aload_0         
	//   60  132:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   61  135:iload_1         
	//   62  136:iconst_1        
	//   63  137:invokevirtual   #386 <Method void StaggeredGridLayoutManager$LazySpanLookup.offsetForRemoval(int, int)>
			mLazySpanLookup.offsetForAddition(j, 1);
	//   64  140:aload_0         
	//   65  141:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   66  144:iload_2         
	//   67  145:iconst_1        
	//   68  146:invokevirtual   #389 <Method void StaggeredGridLayoutManager$LazySpanLookup.offsetForAddition(int, int)>
		}
		if(j1 <= i1)
	//*  69  149:iload           6
	//*  70  151:iload           5
	//*  71  153:icmpgt          157
			return;
	//   72  156:return          
		if(mShouldReverseLayout)
	//*  73  157:aload_0         
	//*  74  158:getfield        #97  <Field boolean mShouldReverseLayout>
	//*  75  161:ifeq            172
			i = getFirstChildPosition();
	//   76  164:aload_0         
	//   77  165:invokevirtual   #259 <Method int getFirstChildPosition()>
	//   78  168:istore_1        
		else
	//*  79  169:goto            177
			i = getLastChildPosition();
	//   80  172:aload_0         
	//   81  173:invokevirtual   #380 <Method int getLastChildPosition()>
	//   82  176:istore_1        
		if(l <= i)
	//*  83  177:iload           4
	//*  84  179:iload_1         
	//*  85  180:icmpgt          187
			requestLayout();
	//   86  183:aload_0         
	//   87  184:invokevirtual   #392 <Method void requestLayout()>
	//   88  187:return          
	}

	private void measureChildWithDecorationsAndMargin(View view, int i, int j, boolean flag)
	{
		calculateItemDecorationsForChild(view, mTmpRect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #111 <Field Rect mTmpRect>
	//    4    6:invokevirtual   #398 <Method void calculateItemDecorationsForChild(View, Rect)>
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #401 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    7   13:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//    8   16:astore          5
		i = updateSpecWithExtra(i, layoutparams.leftMargin + mTmpRect.left, layoutparams.rightMargin + mTmpRect.right);
	//    9   18:aload_0         
	//   10   19:iload_2         
	//   11   20:aload           5
	//   12   22:getfield        #404 <Field int StaggeredGridLayoutManager$LayoutParams.leftMargin>
	//   13   25:aload_0         
	//   14   26:getfield        #111 <Field Rect mTmpRect>
	//   15   29:getfield        #407 <Field int Rect.left>
	//   16   32:iadd            
	//   17   33:aload           5
	//   18   35:getfield        #410 <Field int StaggeredGridLayoutManager$LayoutParams.rightMargin>
	//   19   38:aload_0         
	//   20   39:getfield        #111 <Field Rect mTmpRect>
	//   21   42:getfield        #413 <Field int Rect.right>
	//   22   45:iadd            
	//   23   46:invokespecial   #417 <Method int updateSpecWithExtra(int, int, int)>
	//   24   49:istore_2        
		j = updateSpecWithExtra(j, layoutparams.topMargin + mTmpRect.top, layoutparams.bottomMargin + mTmpRect.bottom);
	//   25   50:aload_0         
	//   26   51:iload_3         
	//   27   52:aload           5
	//   28   54:getfield        #420 <Field int StaggeredGridLayoutManager$LayoutParams.topMargin>
	//   29   57:aload_0         
	//   30   58:getfield        #111 <Field Rect mTmpRect>
	//   31   61:getfield        #423 <Field int Rect.top>
	//   32   64:iadd            
	//   33   65:aload           5
	//   34   67:getfield        #426 <Field int StaggeredGridLayoutManager$LayoutParams.bottomMargin>
	//   35   70:aload_0         
	//   36   71:getfield        #111 <Field Rect mTmpRect>
	//   37   74:getfield        #429 <Field int Rect.bottom>
	//   38   77:iadd            
	//   39   78:invokespecial   #417 <Method int updateSpecWithExtra(int, int, int)>
	//   40   81:istore_3        
		if(flag)
	//*  41   82:iload           4
	//*  42   84:ifeq            101
			flag = shouldReMeasureChild(view, i, j, ((RecyclerView.LayoutParams) (layoutparams)));
	//   43   87:aload_0         
	//   44   88:aload_1         
	//   45   89:iload_2         
	//   46   90:iload_3         
	//   47   91:aload           5
	//   48   93:invokevirtual   #433 <Method boolean shouldReMeasureChild(View, int, int, RecyclerView$LayoutParams)>
	//   49   96:istore          4
		else
	//*  50   98:goto            112
			flag = shouldMeasureChild(view, i, j, ((RecyclerView.LayoutParams) (layoutparams)));
	//   51  101:aload_0         
	//   52  102:aload_1         
	//   53  103:iload_2         
	//   54  104:iload_3         
	//   55  105:aload           5
	//   56  107:invokevirtual   #436 <Method boolean shouldMeasureChild(View, int, int, RecyclerView$LayoutParams)>
	//   57  110:istore          4
		if(flag)
	//*  58  112:iload           4
	//*  59  114:ifeq            123
			view.measure(i, j);
	//   60  117:aload_1         
	//   61  118:iload_2         
	//   62  119:iload_3         
	//   63  120:invokevirtual   #439 <Method void View.measure(int, int)>
	//   64  123:return          
	}

	private void measureChildWithDecorationsAndMargin(View view, LayoutParams layoutparams, boolean flag)
	{
		if(layoutparams.mFullSpan)
	//*   0    0:aload_2         
	//*   1    1:getfield        #239 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*   2    4:ifeq            87
			if(mOrientation == 1)
	//*   3    7:aload_0         
	//*   4    8:getfield        #125 <Field int mOrientation>
	//*   5   11:iconst_1        
	//*   6   12:icmpne          51
			{
				measureChildWithDecorationsAndMargin(view, mFullSizeSpec, getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), layoutparams.height, true), flag);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #442 <Field int mFullSizeSpec>
	//   11   21:aload_0         
	//   12   22:invokevirtual   #445 <Method int getHeight()>
	//   13   25:aload_0         
	//   14   26:invokevirtual   #448 <Method int getHeightMode()>
	//   15   29:aload_0         
	//   16   30:invokevirtual   #451 <Method int getPaddingTop()>
	//   17   33:aload_0         
	//   18   34:invokevirtual   #454 <Method int getPaddingBottom()>
	//   19   37:iadd            
	//   20   38:aload_2         
	//   21   39:getfield        #457 <Field int StaggeredGridLayoutManager$LayoutParams.height>
	//   22   42:iconst_1        
	//   23   43:invokestatic    #461 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   24   46:iload_3         
	//   25   47:invokespecial   #463 <Method void measureChildWithDecorationsAndMargin(View, int, int, boolean)>
				return;
	//   26   50:return          
			} else
			{
				measureChildWithDecorationsAndMargin(view, getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), layoutparams.width, true), mFullSizeSpec, flag);
	//   27   51:aload_0         
	//   28   52:aload_1         
	//   29   53:aload_0         
	//   30   54:invokevirtual   #466 <Method int getWidth()>
	//   31   57:aload_0         
	//   32   58:invokevirtual   #469 <Method int getWidthMode()>
	//   33   61:aload_0         
	//   34   62:invokevirtual   #472 <Method int getPaddingLeft()>
	//   35   65:aload_0         
	//   36   66:invokevirtual   #475 <Method int getPaddingRight()>
	//   37   69:iadd            
	//   38   70:aload_2         
	//   39   71:getfield        #478 <Field int StaggeredGridLayoutManager$LayoutParams.width>
	//   40   74:iconst_1        
	//   41   75:invokestatic    #461 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   42   78:aload_0         
	//   43   79:getfield        #442 <Field int mFullSizeSpec>
	//   44   82:iload_3         
	//   45   83:invokespecial   #463 <Method void measureChildWithDecorationsAndMargin(View, int, int, boolean)>
				return;
	//   46   86:return          
			}
		if(mOrientation == 1)
	//*  47   87:aload_0         
	//*  48   88:getfield        #125 <Field int mOrientation>
	//*  49   91:iconst_1        
	//*  50   92:icmpne          144
		{
			measureChildWithDecorationsAndMargin(view, getChildMeasureSpec(mSizePerSpan, getWidthMode(), 0, layoutparams.width, false), getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), layoutparams.height, true), flag);
	//   51   95:aload_0         
	//   52   96:aload_1         
	//   53   97:aload_0         
	//   54   98:getfield        #480 <Field int mSizePerSpan>
	//   55  101:aload_0         
	//   56  102:invokevirtual   #469 <Method int getWidthMode()>
	//   57  105:iconst_0        
	//   58  106:aload_2         
	//   59  107:getfield        #478 <Field int StaggeredGridLayoutManager$LayoutParams.width>
	//   60  110:iconst_0        
	//   61  111:invokestatic    #461 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   62  114:aload_0         
	//   63  115:invokevirtual   #445 <Method int getHeight()>
	//   64  118:aload_0         
	//   65  119:invokevirtual   #448 <Method int getHeightMode()>
	//   66  122:aload_0         
	//   67  123:invokevirtual   #451 <Method int getPaddingTop()>
	//   68  126:aload_0         
	//   69  127:invokevirtual   #454 <Method int getPaddingBottom()>
	//   70  130:iadd            
	//   71  131:aload_2         
	//   72  132:getfield        #457 <Field int StaggeredGridLayoutManager$LayoutParams.height>
	//   73  135:iconst_1        
	//   74  136:invokestatic    #461 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   75  139:iload_3         
	//   76  140:invokespecial   #463 <Method void measureChildWithDecorationsAndMargin(View, int, int, boolean)>
			return;
	//   77  143:return          
		} else
		{
			measureChildWithDecorationsAndMargin(view, getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), layoutparams.width, true), getChildMeasureSpec(mSizePerSpan, getHeightMode(), 0, layoutparams.height, false), flag);
	//   78  144:aload_0         
	//   79  145:aload_1         
	//   80  146:aload_0         
	//   81  147:invokevirtual   #466 <Method int getWidth()>
	//   82  150:aload_0         
	//   83  151:invokevirtual   #469 <Method int getWidthMode()>
	//   84  154:aload_0         
	//   85  155:invokevirtual   #472 <Method int getPaddingLeft()>
	//   86  158:aload_0         
	//   87  159:invokevirtual   #475 <Method int getPaddingRight()>
	//   88  162:iadd            
	//   89  163:aload_2         
	//   90  164:getfield        #478 <Field int StaggeredGridLayoutManager$LayoutParams.width>
	//   91  167:iconst_1        
	//   92  168:invokestatic    #461 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   93  171:aload_0         
	//   94  172:getfield        #480 <Field int mSizePerSpan>
	//   95  175:aload_0         
	//   96  176:invokevirtual   #448 <Method int getHeightMode()>
	//   97  179:iconst_0        
	//   98  180:aload_2         
	//   99  181:getfield        #457 <Field int StaggeredGridLayoutManager$LayoutParams.height>
	//  100  184:iconst_0        
	//  101  185:invokestatic    #461 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//  102  188:iload_3         
	//  103  189:invokespecial   #463 <Method void measureChildWithDecorationsAndMargin(View, int, int, boolean)>
			return;
	//  104  192:return          
		}
	}

	private void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state, boolean flag)
	{
		boolean flag1;
		AnchorInfo anchorinfo;
label0:
		{
			anchorinfo = mAnchorInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
	//    2    4:astore          7
			if((mPendingSavedState != null || mPendingScrollPosition != -1) && state.getItemCount() == 0)
	//*   3    6:aload_0         
	//*   4    7:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*   5   10:ifnonnull       21
	//*   6   13:aload_0         
	//*   7   14:getfield        #99  <Field int mPendingScrollPosition>
	//*   8   17:iconst_m1       
	//*   9   18:icmpeq          39
	//*  10   21:aload_2         
	//*  11   22:invokevirtual   #486 <Method int RecyclerView$State.getItemCount()>
	//*  12   25:ifne            39
			{
				removeAndRecycleAllViews(recycler);
	//   13   28:aload_0         
	//   14   29:aload_1         
	//   15   30:invokevirtual   #490 <Method void removeAndRecycleAllViews(RecyclerView$Recycler)>
				anchorinfo.reset();
	//   16   33:aload           7
	//   17   35:invokevirtual   #493 <Method void StaggeredGridLayoutManager$AnchorInfo.reset()>
				return;
	//   18   38:return          
			}
			boolean flag3 = anchorinfo.mValid;
	//   19   39:aload           7
	//   20   41:getfield        #496 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mValid>
	//   21   44:istore          6
			boolean flag2 = true;
	//   22   46:iconst_1        
	//   23   47:istore          5
			int i;
			if(flag3 && mPendingScrollPosition == -1 && mPendingSavedState == null)
	//*  24   49:iload           6
	//*  25   51:ifeq            78
	//*  26   54:aload_0         
	//*  27   55:getfield        #99  <Field int mPendingScrollPosition>
	//*  28   58:iconst_m1       
	//*  29   59:icmpne          78
	//*  30   62:aload_0         
	//*  31   63:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  32   66:ifnull          72
	//*  33   69:goto            78
				i = 0;
	//   34   72:iconst_0        
	//   35   73:istore          4
			else
	//*  36   75:goto            81
				i = 1;
	//   37   78:iconst_1        
	//   38   79:istore          4
			if(i != 0)
	//*  39   81:iload           4
	//*  40   83:ifeq            133
			{
				anchorinfo.reset();
	//   41   86:aload           7
	//   42   88:invokevirtual   #493 <Method void StaggeredGridLayoutManager$AnchorInfo.reset()>
				if(mPendingSavedState != null)
	//*  43   91:aload_0         
	//*  44   92:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  45   95:ifnull          107
				{
					applyPendingSavedState(anchorinfo);
	//   46   98:aload_0         
	//   47   99:aload           7
	//   48  101:invokespecial   #498 <Method void applyPendingSavedState(StaggeredGridLayoutManager$AnchorInfo)>
				} else
	//*  49  104:goto            120
				{
					resolveShouldLayoutReverse();
	//   50  107:aload_0         
	//   51  108:invokespecial   #214 <Method void resolveShouldLayoutReverse()>
					anchorinfo.mLayoutFromEnd = mShouldReverseLayout;
	//   52  111:aload           7
	//   53  113:aload_0         
	//   54  114:getfield        #97  <Field boolean mShouldReverseLayout>
	//   55  117:putfield        #217 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
				}
				updateAnchorInfoForLayout(state, anchorinfo);
	//   56  120:aload_0         
	//   57  121:aload_2         
	//   58  122:aload           7
	//   59  124:invokevirtual   #502 <Method void updateAnchorInfoForLayout(RecyclerView$State, StaggeredGridLayoutManager$AnchorInfo)>
				anchorinfo.mValid = true;
	//   60  127:aload           7
	//   61  129:iconst_1        
	//   62  130:putfield        #496 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mValid>
			}
			if(mPendingSavedState == null && mPendingScrollPosition == -1 && (anchorinfo.mLayoutFromEnd != mLastLayoutFromEnd || isLayoutRTL() != mLastLayoutRTL))
	//*  63  133:aload_0         
	//*  64  134:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  65  137:ifnonnull       184
	//*  66  140:aload_0         
	//*  67  141:getfield        #99  <Field int mPendingScrollPosition>
	//*  68  144:iconst_m1       
	//*  69  145:icmpne          184
	//*  70  148:aload           7
	//*  71  150:getfield        #217 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
	//*  72  153:aload_0         
	//*  73  154:getfield        #504 <Field boolean mLastLayoutFromEnd>
	//*  74  157:icmpne          171
	//*  75  160:aload_0         
	//*  76  161:invokevirtual   #312 <Method boolean isLayoutRTL()>
	//*  77  164:aload_0         
	//*  78  165:getfield        #210 <Field boolean mLastLayoutRTL>
	//*  79  168:icmpeq          184
			{
				mLazySpanLookup.clear();
	//   80  171:aload_0         
	//   81  172:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   82  175:invokevirtual   #505 <Method void StaggeredGridLayoutManager$LazySpanLookup.clear()>
				anchorinfo.mInvalidateOffsets = true;
	//   83  178:aload           7
	//   84  180:iconst_1        
	//   85  181:putfield        #508 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mInvalidateOffsets>
			}
			if(getChildCount() > 0 && (mPendingSavedState == null || mPendingSavedState.mSpanOffsetsSize < 1))
	//*  86  184:aload_0         
	//*  87  185:invokevirtual   #256 <Method int getChildCount()>
	//*  88  188:ifle            392
	//*  89  191:aload_0         
	//*  90  192:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  91  195:ifnull          209
	//*  92  198:aload_0         
	//*  93  199:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  94  202:getfield        #175 <Field int StaggeredGridLayoutManager$SavedState.mSpanOffsetsSize>
	//*  95  205:iconst_1        
	//*  96  206:icmpge          392
				if(anchorinfo.mInvalidateOffsets)
	//*  97  209:aload           7
	//*  98  211:getfield        #508 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mInvalidateOffsets>
	//*  99  214:ifeq            273
					for(i = 0; i < mSpanCount; i++)
	//* 100  217:iconst_0        
	//* 101  218:istore          4
	//* 102  220:iload           4
	//* 103  222:aload_0         
	//* 104  223:getfield        #93  <Field int mSpanCount>
	//* 105  226:icmpge          392
					{
						mSpans[i].clear();
	//  106  229:aload_0         
	//  107  230:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  108  233:iload           4
	//  109  235:aaload          
	//  110  236:invokevirtual   #178 <Method void StaggeredGridLayoutManager$Span.clear()>
						if(anchorinfo.mOffset != 0x80000000)
	//* 111  239:aload           7
	//* 112  241:getfield        #511 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
	//* 113  244:ldc1            #43  <Int 0x80000000>
	//* 114  246:icmpeq          264
							mSpans[i].setLine(anchorinfo.mOffset);
	//  115  249:aload_0         
	//  116  250:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  117  253:iload           4
	//  118  255:aaload          
	//  119  256:aload           7
	//  120  258:getfield        #511 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
	//  121  261:invokevirtual   #198 <Method void StaggeredGridLayoutManager$Span.setLine(int)>
					}

	//  122  264:iload           4
	//  123  266:iconst_1        
	//  124  267:iadd            
	//  125  268:istore          4
				else
	//* 126  270:goto            220
				if(i == 0 && mAnchorInfo.mSpanReferenceLines != null)
	//* 127  273:iload           4
	//* 128  275:ifne            341
	//* 129  278:aload_0         
	//* 130  279:getfield        #116 <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
	//* 131  282:getfield        #514 <Field int[] StaggeredGridLayoutManager$AnchorInfo.mSpanReferenceLines>
	//* 132  285:ifnonnull       291
	//* 133  288:goto            341
				{
					for(int j = 0; j < mSpanCount; j++)
	//* 134  291:iconst_0        
	//* 135  292:istore          4
	//* 136  294:iload           4
	//* 137  296:aload_0         
	//* 138  297:getfield        #93  <Field int mSpanCount>
	//* 139  300:icmpge          392
					{
						Span span = mSpans[j];
	//  140  303:aload_0         
	//  141  304:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  142  307:iload           4
	//  143  309:aaload          
	//  144  310:astore          8
						span.clear();
	//  145  312:aload           8
	//  146  314:invokevirtual   #178 <Method void StaggeredGridLayoutManager$Span.clear()>
						span.setLine(mAnchorInfo.mSpanReferenceLines[j]);
	//  147  317:aload           8
	//  148  319:aload_0         
	//  149  320:getfield        #116 <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
	//  150  323:getfield        #514 <Field int[] StaggeredGridLayoutManager$AnchorInfo.mSpanReferenceLines>
	//  151  326:iload           4
	//  152  328:iaload          
	//  153  329:invokevirtual   #198 <Method void StaggeredGridLayoutManager$Span.setLine(int)>
					}

	//  154  332:iload           4
	//  155  334:iconst_1        
	//  156  335:iadd            
	//  157  336:istore          4
				} else
	//* 158  338:goto            294
				{
					for(int k = 0; k < mSpanCount; k++)
	//* 159  341:iconst_0        
	//* 160  342:istore          4
	//* 161  344:iload           4
	//* 162  346:aload_0         
	//* 163  347:getfield        #93  <Field int mSpanCount>
	//* 164  350:icmpge          381
						mSpans[k].cacheReferenceLineAndClear(mShouldReverseLayout, anchorinfo.mOffset);
	//  165  353:aload_0         
	//  166  354:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  167  357:iload           4
	//  168  359:aaload          
	//  169  360:aload_0         
	//  170  361:getfield        #97  <Field boolean mShouldReverseLayout>
	//  171  364:aload           7
	//  172  366:getfield        #511 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
	//  173  369:invokevirtual   #518 <Method void StaggeredGridLayoutManager$Span.cacheReferenceLineAndClear(boolean, int)>

	//  174  372:iload           4
	//  175  374:iconst_1        
	//  176  375:iadd            
	//  177  376:istore          4
	//* 178  378:goto            344
					mAnchorInfo.saveSpanReferenceLines(mSpans);
	//  179  381:aload_0         
	//  180  382:getfield        #116 <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
	//  181  385:aload_0         
	//  182  386:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  183  389:invokevirtual   #522 <Method void StaggeredGridLayoutManager$AnchorInfo.saveSpanReferenceLines(StaggeredGridLayoutManager$Span[])>
				}
			detachAndScrapAttachedViews(recycler);
	//  184  392:aload_0         
	//  185  393:aload_1         
	//  186  394:invokevirtual   #525 <Method void detachAndScrapAttachedViews(RecyclerView$Recycler)>
			mLayoutState.mRecycle = false;
	//  187  397:aload_0         
	//  188  398:getfield        #134 <Field LayoutState mLayoutState>
	//  189  401:iconst_0        
	//  190  402:putfield        #528 <Field boolean LayoutState.mRecycle>
			mLaidOutInvalidFullSpan = false;
	//  191  405:aload_0         
	//  192  406:iconst_0        
	//  193  407:putfield        #118 <Field boolean mLaidOutInvalidFullSpan>
			updateMeasureSpecs(mSecondaryOrientation.getTotalSpace());
	//  194  410:aload_0         
	//  195  411:aload_0         
	//  196  412:getfield        #329 <Field OrientationHelper mSecondaryOrientation>
	//  197  415:invokevirtual   #531 <Method int OrientationHelper.getTotalSpace()>
	//  198  418:invokevirtual   #534 <Method void updateMeasureSpecs(int)>
			updateLayoutState(anchorinfo.mPosition, state);
	//  199  421:aload_0         
	//  200  422:aload           7
	//  201  424:getfield        #537 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
	//  202  427:aload_2         
	//  203  428:invokespecial   #541 <Method void updateLayoutState(int, RecyclerView$State)>
			if(anchorinfo.mLayoutFromEnd)
	//* 204  431:aload           7
	//* 205  433:getfield        #217 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
	//* 206  436:ifeq            494
			{
				setLayoutStateDirection(-1);
	//  207  439:aload_0         
	//  208  440:iconst_m1       
	//  209  441:invokespecial   #544 <Method void setLayoutStateDirection(int)>
				fill(recycler, mLayoutState, state);
	//  210  444:aload_0         
	//  211  445:aload_1         
	//  212  446:aload_0         
	//  213  447:getfield        #134 <Field LayoutState mLayoutState>
	//  214  450:aload_2         
	//  215  451:invokespecial   #546 <Method int fill(RecyclerView$Recycler, LayoutState, RecyclerView$State)>
	//  216  454:pop             
				setLayoutStateDirection(1);
	//  217  455:aload_0         
	//  218  456:iconst_1        
	//  219  457:invokespecial   #544 <Method void setLayoutStateDirection(int)>
				mLayoutState.mCurrentPosition = anchorinfo.mPosition + mLayoutState.mItemDirection;
	//  220  460:aload_0         
	//  221  461:getfield        #134 <Field LayoutState mLayoutState>
	//  222  464:aload           7
	//  223  466:getfield        #537 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
	//  224  469:aload_0         
	//  225  470:getfield        #134 <Field LayoutState mLayoutState>
	//  226  473:getfield        #549 <Field int LayoutState.mItemDirection>
	//  227  476:iadd            
	//  228  477:putfield        #552 <Field int LayoutState.mCurrentPosition>
				fill(recycler, mLayoutState, state);
	//  229  480:aload_0         
	//  230  481:aload_1         
	//  231  482:aload_0         
	//  232  483:getfield        #134 <Field LayoutState mLayoutState>
	//  233  486:aload_2         
	//  234  487:invokespecial   #546 <Method int fill(RecyclerView$Recycler, LayoutState, RecyclerView$State)>
	//  235  490:pop             
			} else
	//* 236  491:goto            546
			{
				setLayoutStateDirection(1);
	//  237  494:aload_0         
	//  238  495:iconst_1        
	//  239  496:invokespecial   #544 <Method void setLayoutStateDirection(int)>
				fill(recycler, mLayoutState, state);
	//  240  499:aload_0         
	//  241  500:aload_1         
	//  242  501:aload_0         
	//  243  502:getfield        #134 <Field LayoutState mLayoutState>
	//  244  505:aload_2         
	//  245  506:invokespecial   #546 <Method int fill(RecyclerView$Recycler, LayoutState, RecyclerView$State)>
	//  246  509:pop             
				setLayoutStateDirection(-1);
	//  247  510:aload_0         
	//  248  511:iconst_m1       
	//  249  512:invokespecial   #544 <Method void setLayoutStateDirection(int)>
				mLayoutState.mCurrentPosition = anchorinfo.mPosition + mLayoutState.mItemDirection;
	//  250  515:aload_0         
	//  251  516:getfield        #134 <Field LayoutState mLayoutState>
	//  252  519:aload           7
	//  253  521:getfield        #537 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
	//  254  524:aload_0         
	//  255  525:getfield        #134 <Field LayoutState mLayoutState>
	//  256  528:getfield        #549 <Field int LayoutState.mItemDirection>
	//  257  531:iadd            
	//  258  532:putfield        #552 <Field int LayoutState.mCurrentPosition>
				fill(recycler, mLayoutState, state);
	//  259  535:aload_0         
	//  260  536:aload_1         
	//  261  537:aload_0         
	//  262  538:getfield        #134 <Field LayoutState mLayoutState>
	//  263  541:aload_2         
	//  264  542:invokespecial   #546 <Method int fill(RecyclerView$Recycler, LayoutState, RecyclerView$State)>
	//  265  545:pop             
			}
			repositionToWrapContentIfNecessary();
	//  266  546:aload_0         
	//  267  547:invokespecial   #555 <Method void repositionToWrapContentIfNecessary()>
			if(getChildCount() > 0)
	//* 268  550:aload_0         
	//* 269  551:invokevirtual   #256 <Method int getChildCount()>
	//* 270  554:ifle            595
				if(mShouldReverseLayout)
	//* 271  557:aload_0         
	//* 272  558:getfield        #97  <Field boolean mShouldReverseLayout>
	//* 273  561:ifeq            581
				{
					fixEndGap(recycler, state, true);
	//  274  564:aload_0         
	//  275  565:aload_1         
	//  276  566:aload_2         
	//  277  567:iconst_1        
	//  278  568:invokespecial   #557 <Method void fixEndGap(RecyclerView$Recycler, RecyclerView$State, boolean)>
					fixStartGap(recycler, state, false);
	//  279  571:aload_0         
	//  280  572:aload_1         
	//  281  573:aload_2         
	//  282  574:iconst_0        
	//  283  575:invokespecial   #559 <Method void fixStartGap(RecyclerView$Recycler, RecyclerView$State, boolean)>
				} else
	//* 284  578:goto            595
				{
					fixStartGap(recycler, state, true);
	//  285  581:aload_0         
	//  286  582:aload_1         
	//  287  583:aload_2         
	//  288  584:iconst_1        
	//  289  585:invokespecial   #559 <Method void fixStartGap(RecyclerView$Recycler, RecyclerView$State, boolean)>
					fixEndGap(recycler, state, false);
	//  290  588:aload_0         
	//  291  589:aload_1         
	//  292  590:aload_2         
	//  293  591:iconst_0        
	//  294  592:invokespecial   #557 <Method void fixEndGap(RecyclerView$Recycler, RecyclerView$State, boolean)>
				}
			if(flag && !state.isPreLayout())
	//* 295  595:iload_3         
	//* 296  596:ifeq            671
	//* 297  599:aload_2         
	//* 298  600:invokevirtual   #562 <Method boolean RecyclerView$State.isPreLayout()>
	//* 299  603:ifne            671
			{
				if(mGapStrategy != 0 && getChildCount() > 0 && (mLaidOutInvalidFullSpan || hasGapsToFix() != null))
	//* 300  606:aload_0         
	//* 301  607:getfield        #106 <Field int mGapStrategy>
	//* 302  610:ifeq            640
	//* 303  613:aload_0         
	//* 304  614:invokevirtual   #256 <Method int getChildCount()>
	//* 305  617:ifle            640
	//* 306  620:aload_0         
	//* 307  621:getfield        #118 <Field boolean mLaidOutInvalidFullSpan>
	//* 308  624:ifne            634
	//* 309  627:aload_0         
	//* 310  628:invokevirtual   #566 <Method View hasGapsToFix()>
	//* 311  631:ifnull          640
					flag1 = true;
	//  312  634:iconst_1        
	//  313  635:istore          4
				else
	//* 314  637:goto            643
					flag1 = false;
	//  315  640:iconst_0        
	//  316  641:istore          4
				if(flag1)
	//* 317  643:iload           4
	//* 318  645:ifeq            671
				{
					removeCallbacks(mCheckForGapsRunnable);
	//  319  648:aload_0         
	//  320  649:aload_0         
	//  321  650:getfield        #123 <Field Runnable mCheckForGapsRunnable>
	//  322  653:invokevirtual   #570 <Method boolean removeCallbacks(Runnable)>
	//  323  656:pop             
					if(checkForGaps())
	//* 324  657:aload_0         
	//* 325  658:invokevirtual   #573 <Method boolean checkForGaps()>
	//* 326  661:ifeq            671
					{
						flag1 = flag2;
	//  327  664:iload           5
	//  328  666:istore          4
						break label0;
	//  329  668:goto            674
					}
				}
			}
			flag1 = false;
	//  330  671:iconst_0        
	//  331  672:istore          4
		}
		if(state.isPreLayout())
	//* 332  674:aload_2         
	//* 333  675:invokevirtual   #562 <Method boolean RecyclerView$State.isPreLayout()>
	//* 334  678:ifeq            688
			mAnchorInfo.reset();
	//  335  681:aload_0         
	//  336  682:getfield        #116 <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
	//  337  685:invokevirtual   #493 <Method void StaggeredGridLayoutManager$AnchorInfo.reset()>
		mLastLayoutFromEnd = anchorinfo.mLayoutFromEnd;
	//  338  688:aload_0         
	//  339  689:aload           7
	//  340  691:getfield        #217 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
	//  341  694:putfield        #504 <Field boolean mLastLayoutFromEnd>
		mLastLayoutRTL = isLayoutRTL();
	//  342  697:aload_0         
	//  343  698:aload_0         
	//  344  699:invokevirtual   #312 <Method boolean isLayoutRTL()>
	//  345  702:putfield        #210 <Field boolean mLastLayoutRTL>
		if(flag1)
	//* 346  705:iload           4
	//* 347  707:ifeq            724
		{
			mAnchorInfo.reset();
	//  348  710:aload_0         
	//  349  711:getfield        #116 <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
	//  350  714:invokevirtual   #493 <Method void StaggeredGridLayoutManager$AnchorInfo.reset()>
			onLayoutChildren(recycler, state, false);
	//  351  717:aload_0         
	//  352  718:aload_1         
	//  353  719:aload_2         
	//  354  720:iconst_0        
	//  355  721:invokespecial   #575 <Method void onLayoutChildren(RecyclerView$Recycler, RecyclerView$State, boolean)>
		}
	//  356  724:return          
	}

	private boolean preferLastSpan(int i)
	{
		int j = mOrientation;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field int mOrientation>
	//    2    4:istore_2        
		boolean flag2 = false;
	//    3    5:iconst_0        
	//    4    6:istore          4
		boolean flag3 = false;
	//    5    8:iconst_0        
	//    6    9:istore          5
		if(j == 0)
	//*   7   11:iload_2         
	//*   8   12:ifne            45
		{
			boolean flag;
			if(i == -1)
	//*   9   15:iload_1         
	//*  10   16:iconst_m1       
	//*  11   17:icmpne          25
				flag = true;
	//   12   20:iconst_1        
	//   13   21:istore_3        
			else
	//*  14   22:goto            27
				flag = false;
	//   15   25:iconst_0        
	//   16   26:istore_3        
			flag2 = flag3;
	//   17   27:iload           5
	//   18   29:istore          4
			if(flag != mShouldReverseLayout)
	//*  19   31:iload_3         
	//*  20   32:aload_0         
	//*  21   33:getfield        #97  <Field boolean mShouldReverseLayout>
	//*  22   36:icmpeq          42
				flag2 = true;
	//   23   39:iconst_1        
	//   24   40:istore          4
			return flag2;
	//   25   42:iload           4
	//   26   44:ireturn         
		}
		boolean flag1;
		if(i == -1)
	//*  27   45:iload_1         
	//*  28   46:iconst_m1       
	//*  29   47:icmpne          55
			flag1 = true;
	//   30   50:iconst_1        
	//   31   51:istore_3        
		else
	//*  32   52:goto            57
			flag1 = false;
	//   33   55:iconst_0        
	//   34   56:istore_3        
		if(flag1 == mShouldReverseLayout)
	//*  35   57:iload_3         
	//*  36   58:aload_0         
	//*  37   59:getfield        #97  <Field boolean mShouldReverseLayout>
	//*  38   62:icmpne          70
			flag1 = true;
	//   39   65:iconst_1        
	//   40   66:istore_3        
		else
	//*  41   67:goto            72
			flag1 = false;
	//   42   70:iconst_0        
	//   43   71:istore_3        
		if(flag1 == isLayoutRTL())
	//*  44   72:iload_3         
	//*  45   73:aload_0         
	//*  46   74:invokevirtual   #312 <Method boolean isLayoutRTL()>
	//*  47   77:icmpne          83
			flag2 = true;
	//   48   80:iconst_1        
	//   49   81:istore          4
		return flag2;
	//   50   83:iload           4
	//   51   85:ireturn         
	}

	private void prependViewToAllSpans(View view)
	{
		for(int i = mSpanCount - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #93  <Field int mSpanCount>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iflt            28
			mSpans[i].prependToSpan(view);
	//    7   11:aload_0         
	//    8   12:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//    9   15:iload_2         
	//   10   16:aaload          
	//   11   17:aload_1         
	//   12   18:invokevirtual   #251 <Method void StaggeredGridLayoutManager$Span.prependToSpan(View)>

	//   13   21:iload_2         
	//   14   22:iconst_1        
	//   15   23:isub            
	//   16   24:istore_2        
	//*  17   25:goto            7
	//   18   28:return          
	}

	private void recycle(RecyclerView.Recycler recycler, LayoutState layoutstate)
	{
		if(layoutstate.mRecycle)
	//*   0    0:aload_2         
	//*   1    1:getfield        #528 <Field boolean LayoutState.mRecycle>
	//*   2    4:ifeq            156
		{
			if(layoutstate.mInfinite)
	//*   3    7:aload_2         
	//*   4    8:getfield        #580 <Field boolean LayoutState.mInfinite>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			if(layoutstate.mAvailable == 0)
	//*   7   15:aload_2         
	//*   8   16:getfield        #583 <Field int LayoutState.mAvailable>
	//*   9   19:ifne            50
				if(layoutstate.mLayoutDirection == -1)
	//*  10   22:aload_2         
	//*  11   23:getfield        #236 <Field int LayoutState.mLayoutDirection>
	//*  12   26:iconst_m1       
	//*  13   27:icmpne          40
				{
					recycleFromEnd(recycler, layoutstate.mEndLine);
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:aload_2         
	//   17   33:getfield        #586 <Field int LayoutState.mEndLine>
	//   18   36:invokespecial   #590 <Method void recycleFromEnd(RecyclerView$Recycler, int)>
					return;
	//   19   39:return          
				} else
				{
					recycleFromStart(recycler, layoutstate.mStartLine);
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:aload_2         
	//   23   43:getfield        #593 <Field int LayoutState.mStartLine>
	//   24   46:invokespecial   #596 <Method void recycleFromStart(RecyclerView$Recycler, int)>
					return;
	//   25   49:return          
				}
			if(layoutstate.mLayoutDirection == -1)
	//*  26   50:aload_2         
	//*  27   51:getfield        #236 <Field int LayoutState.mLayoutDirection>
	//*  28   54:iconst_m1       
	//*  29   55:icmpne          105
			{
				int i = layoutstate.mStartLine - getMaxStart(layoutstate.mStartLine);
	//   30   58:aload_2         
	//   31   59:getfield        #593 <Field int LayoutState.mStartLine>
	//   32   62:aload_0         
	//   33   63:aload_2         
	//   34   64:getfield        #593 <Field int LayoutState.mStartLine>
	//   35   67:invokespecial   #598 <Method int getMaxStart(int)>
	//   36   70:isub            
	//   37   71:istore_3        
				if(i < 0)
	//*  38   72:iload_3         
	//*  39   73:ifge            84
					i = layoutstate.mEndLine;
	//   40   76:aload_2         
	//   41   77:getfield        #586 <Field int LayoutState.mEndLine>
	//   42   80:istore_3        
				else
	//*  43   81:goto            98
					i = layoutstate.mEndLine - Math.min(i, layoutstate.mAvailable);
	//   44   84:aload_2         
	//   45   85:getfield        #586 <Field int LayoutState.mEndLine>
	//   46   88:iload_3         
	//   47   89:aload_2         
	//   48   90:getfield        #583 <Field int LayoutState.mAvailable>
	//   49   93:invokestatic    #604 <Method int Math.min(int, int)>
	//   50   96:isub            
	//   51   97:istore_3        
				recycleFromEnd(recycler, i);
	//   52   98:aload_0         
	//   53   99:aload_1         
	//   54  100:iload_3         
	//   55  101:invokespecial   #590 <Method void recycleFromEnd(RecyclerView$Recycler, int)>
				return;
	//   56  104:return          
			}
			int j = getMinEnd(layoutstate.mEndLine) - layoutstate.mEndLine;
	//   57  105:aload_0         
	//   58  106:aload_2         
	//   59  107:getfield        #586 <Field int LayoutState.mEndLine>
	//   60  110:invokespecial   #606 <Method int getMinEnd(int)>
	//   61  113:aload_2         
	//   62  114:getfield        #586 <Field int LayoutState.mEndLine>
	//   63  117:isub            
	//   64  118:istore_3        
			if(j < 0)
	//*  65  119:iload_3         
	//*  66  120:ifge            131
			{
				j = layoutstate.mStartLine;
	//   67  123:aload_2         
	//   68  124:getfield        #593 <Field int LayoutState.mStartLine>
	//   69  127:istore_3        
			} else
	//*  70  128:goto            149
			{
				int k = layoutstate.mStartLine;
	//   71  131:aload_2         
	//   72  132:getfield        #593 <Field int LayoutState.mStartLine>
	//   73  135:istore          4
				j = Math.min(j, layoutstate.mAvailable) + k;
	//   74  137:iload_3         
	//   75  138:aload_2         
	//   76  139:getfield        #583 <Field int LayoutState.mAvailable>
	//   77  142:invokestatic    #604 <Method int Math.min(int, int)>
	//   78  145:iload           4
	//   79  147:iadd            
	//   80  148:istore_3        
			}
			recycleFromStart(recycler, j);
	//   81  149:aload_0         
	//   82  150:aload_1         
	//   83  151:iload_3         
	//   84  152:invokespecial   #596 <Method void recycleFromStart(RecyclerView$Recycler, int)>
			return;
	//   85  155:return          
		} else
		{
			return;
	//   86  156:return          
		}
	}

	private void recycleFromEnd(RecyclerView.Recycler recycler, int i)
	{
		for(int j = getChildCount() - 1; j >= 0;)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #256 <Method int getChildCount()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_3        
	//*   5    7:iload_3         
	//*   6    8:iflt            175
		{
			View view = getChildAt(j);
	//    7   11:aload_0         
	//    8   12:iload_3         
	//    9   13:invokevirtual   #345 <Method View getChildAt(int)>
	//   10   16:astore          7
			if(mPrimaryOrientation.getDecoratedStart(view) >= i && mPrimaryOrientation.getTransformedStartWithDecoration(view) >= i)
	//*  11   18:aload_0         
	//*  12   19:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//*  13   22:aload           7
	//*  14   24:invokevirtual   #609 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  15   27:iload_2         
	//*  16   28:icmplt          174
	//*  17   31:aload_0         
	//*  18   32:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//*  19   35:aload           7
	//*  20   37:invokevirtual   #612 <Method int OrientationHelper.getTransformedStartWithDecoration(View)>
	//*  21   40:iload_2         
	//*  22   41:icmplt          174
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   23   44:aload           7
	//   24   46:invokevirtual   #401 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   25   49:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//   26   52:astore          8
				if(layoutparams.mFullSpan)
	//*  27   54:aload           8
	//*  28   56:getfield        #239 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*  29   59:ifeq            136
				{
					boolean flag = false;
	//   30   62:iconst_0        
	//   31   63:istore          6
					int k = 0;
	//   32   65:iconst_0        
	//   33   66:istore          4
					int l;
					do
					{
						l = ((int) (flag));
	//   34   68:iload           6
	//   35   70:istore          5
						if(k >= mSpanCount)
							break;
	//   36   72:iload           4
	//   37   74:aload_0         
	//   38   75:getfield        #93  <Field int mSpanCount>
	//   39   78:icmpge          108
						if(mSpans[k].mViews.size() == 1)
	//*  40   81:aload_0         
	//*  41   82:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//*  42   85:iload           4
	//*  43   87:aaload          
	//*  44   88:getfield        #268 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//*  45   91:invokevirtual   #273 <Method int ArrayList.size()>
	//*  46   94:iconst_1        
	//*  47   95:icmpne          99
							return;
	//   48   98:return          
						k++;
	//   49   99:iload           4
	//   50  101:iconst_1        
	//   51  102:iadd            
	//   52  103:istore          4
					} while(true);
	//   53  105:goto            68
					for(; l < mSpanCount; l++)
	//*  54  108:iload           5
	//*  55  110:aload_0         
	//*  56  111:getfield        #93  <Field int mSpanCount>
	//*  57  114:icmpge          160
						mSpans[l].popEnd();
	//   58  117:aload_0         
	//   59  118:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   60  121:iload           5
	//   61  123:aaload          
	//   62  124:invokevirtual   #615 <Method void StaggeredGridLayoutManager$Span.popEnd()>

	//   63  127:iload           5
	//   64  129:iconst_1        
	//   65  130:iadd            
	//   66  131:istore          5
				} else
	//*  67  133:goto            108
				{
					if(layoutparams.mSpan.mViews.size() == 1)
	//*  68  136:aload           8
	//*  69  138:getfield        #245 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//*  70  141:getfield        #268 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//*  71  144:invokevirtual   #273 <Method int ArrayList.size()>
	//*  72  147:iconst_1        
	//*  73  148:icmpne          152
						return;
	//   74  151:return          
					layoutparams.mSpan.popEnd();
	//   75  152:aload           8
	//   76  154:getfield        #245 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//   77  157:invokevirtual   #615 <Method void StaggeredGridLayoutManager$Span.popEnd()>
				}
				removeAndRecycleView(view, recycler);
	//   78  160:aload_0         
	//   79  161:aload           7
	//   80  163:aload_1         
	//   81  164:invokevirtual   #619 <Method void removeAndRecycleView(View, RecyclerView$Recycler)>
				j--;
	//   82  167:iload_3         
	//   83  168:iconst_1        
	//   84  169:isub            
	//   85  170:istore_3        
			} else
	//*  86  171:goto            7
			{
				return;
	//   87  174:return          
			}
		}

	//   88  175:return          
	}

	private void recycleFromStart(RecyclerView.Recycler recycler, int i)
	{
		while(getChildCount() > 0) 
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #256 <Method int getChildCount()>
	//*   2    4:ifle            162
		{
			boolean flag = false;
	//    3    7:iconst_0        
	//    4    8:istore          5
			View view = getChildAt(0);
	//    5   10:aload_0         
	//    6   11:iconst_0        
	//    7   12:invokevirtual   #345 <Method View getChildAt(int)>
	//    8   15:astore          6
			if(mPrimaryOrientation.getDecoratedEnd(view) <= i && mPrimaryOrientation.getTransformedEndWithDecoration(view) <= i)
	//*   9   17:aload_0         
	//*  10   18:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//*  11   21:aload           6
	//*  12   23:invokevirtual   #622 <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  13   26:iload_2         
	//*  14   27:icmpgt          161
	//*  15   30:aload_0         
	//*  16   31:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//*  17   34:aload           6
	//*  18   36:invokevirtual   #625 <Method int OrientationHelper.getTransformedEndWithDecoration(View)>
	//*  19   39:iload_2         
	//*  20   40:icmpgt          161
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   21   43:aload           6
	//   22   45:invokevirtual   #401 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   23   48:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//   24   51:astore          7
				if(layoutparams.mFullSpan)
	//*  25   53:aload           7
	//*  26   55:getfield        #239 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*  27   58:ifeq            127
				{
					int j = 0;
	//   28   61:iconst_0        
	//   29   62:istore_3        
					int k;
					do
					{
						k = ((int) (flag));
	//   30   63:iload           5
	//   31   65:istore          4
						if(j >= mSpanCount)
							break;
	//   32   67:iload_3         
	//   33   68:aload_0         
	//   34   69:getfield        #93  <Field int mSpanCount>
	//   35   72:icmpge          99
						if(mSpans[j].mViews.size() == 1)
	//*  36   75:aload_0         
	//*  37   76:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//*  38   79:iload_3         
	//*  39   80:aaload          
	//*  40   81:getfield        #268 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//*  41   84:invokevirtual   #273 <Method int ArrayList.size()>
	//*  42   87:iconst_1        
	//*  43   88:icmpne          92
							return;
	//   44   91:return          
						j++;
	//   45   92:iload_3         
	//   46   93:iconst_1        
	//   47   94:iadd            
	//   48   95:istore_3        
					} while(true);
	//   49   96:goto            63
					for(; k < mSpanCount; k++)
	//*  50   99:iload           4
	//*  51  101:aload_0         
	//*  52  102:getfield        #93  <Field int mSpanCount>
	//*  53  105:icmpge          151
						mSpans[k].popStart();
	//   54  108:aload_0         
	//   55  109:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   56  112:iload           4
	//   57  114:aaload          
	//   58  115:invokevirtual   #628 <Method void StaggeredGridLayoutManager$Span.popStart()>

	//   59  118:iload           4
	//   60  120:iconst_1        
	//   61  121:iadd            
	//   62  122:istore          4
				} else
	//*  63  124:goto            99
				{
					if(layoutparams.mSpan.mViews.size() == 1)
	//*  64  127:aload           7
	//*  65  129:getfield        #245 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//*  66  132:getfield        #268 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//*  67  135:invokevirtual   #273 <Method int ArrayList.size()>
	//*  68  138:iconst_1        
	//*  69  139:icmpne          143
						return;
	//   70  142:return          
					layoutparams.mSpan.popStart();
	//   71  143:aload           7
	//   72  145:getfield        #245 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//   73  148:invokevirtual   #628 <Method void StaggeredGridLayoutManager$Span.popStart()>
				}
				removeAndRecycleView(view, recycler);
	//   74  151:aload_0         
	//   75  152:aload           6
	//   76  154:aload_1         
	//   77  155:invokevirtual   #619 <Method void removeAndRecycleView(View, RecyclerView$Recycler)>
			} else
	//*  78  158:goto            0
			{
				return;
	//   79  161:return          
			}
		}
	//   80  162:return          
	}

	private void repositionToWrapContentIfNecessary()
	{
		if(mSecondaryOrientation.getMode() == 0x40000000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #329 <Field OrientationHelper mSecondaryOrientation>
	//*   2    4:invokevirtual   #631 <Method int OrientationHelper.getMode()>
	//*   3    7:ldc2            #632 <Int 0x40000000>
	//*   4   10:icmpne          14
			return;
	//    5   13:return          
		int j1 = getChildCount();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #256 <Method int getChildCount()>
	//    8   18:istore          7
		boolean flag = false;
	//    9   20:iconst_0        
	//   10   21:istore          5
		float f = 0.0F;
	//   11   23:fconst_0        
	//   12   24:fstore_1        
		for(int i = 0; i < j1; i++)
	//*  13   25:iconst_0        
	//*  14   26:istore          4
	//*  15   28:iload           4
	//*  16   30:iload           7
	//*  17   32:icmpge          104
		{
			View view = getChildAt(i);
	//   18   35:aload_0         
	//   19   36:iload           4
	//   20   38:invokevirtual   #345 <Method View getChildAt(int)>
	//   21   41:astore          9
			float f2 = mSecondaryOrientation.getDecoratedMeasurement(view);
	//   22   43:aload_0         
	//   23   44:getfield        #329 <Field OrientationHelper mSecondaryOrientation>
	//   24   47:aload           9
	//   25   49:invokevirtual   #635 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   26   52:i2f             
	//   27   53:fstore_3        
			if(f2 < f)
	//*  28   54:fload_3         
	//*  29   55:fload_1         
	//*  30   56:fcmpg           
	//*  31   57:ifge            63
				continue;
	//   32   60:goto            95
			float f1 = f2;
	//   33   63:fload_3         
	//   34   64:fstore_2        
			if(((LayoutParams)view.getLayoutParams()).isFullSpan())
	//*  35   65:aload           9
	//*  36   67:invokevirtual   #401 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  37   70:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//*  38   73:invokevirtual   #638 <Method boolean StaggeredGridLayoutManager$LayoutParams.isFullSpan()>
	//*  39   76:ifeq            89
				f1 = (1.0F * f2) / (float)mSpanCount;
	//   40   79:fconst_1        
	//   41   80:fload_3         
	//   42   81:fmul            
	//   43   82:aload_0         
	//   44   83:getfield        #93  <Field int mSpanCount>
	//   45   86:i2f             
	//   46   87:fdiv            
	//   47   88:fstore_2        
			f = Math.max(f, f1);
	//   48   89:fload_1         
	//   49   90:fload_2         
	//   50   91:invokestatic    #642 <Method float Math.max(float, float)>
	//   51   94:fstore_1        
		}

	//   52   95:iload           4
	//   53   97:iconst_1        
	//   54   98:iadd            
	//   55   99:istore          4
	//*  56  101:goto            28
		int k1 = mSizePerSpan;
	//   57  104:aload_0         
	//   58  105:getfield        #480 <Field int mSizePerSpan>
	//   59  108:istore          8
		int l = Math.round(f * (float)mSpanCount);
	//   60  110:fload_1         
	//   61  111:aload_0         
	//   62  112:getfield        #93  <Field int mSpanCount>
	//   63  115:i2f             
	//   64  116:fmul            
	//   65  117:invokestatic    #646 <Method int Math.round(float)>
	//   66  120:istore          6
		int j = l;
	//   67  122:iload           6
	//   68  124:istore          4
		if(mSecondaryOrientation.getMode() == 0x80000000)
	//*  69  126:aload_0         
	//*  70  127:getfield        #329 <Field OrientationHelper mSecondaryOrientation>
	//*  71  130:invokevirtual   #631 <Method int OrientationHelper.getMode()>
	//*  72  133:ldc1            #43  <Int 0x80000000>
	//*  73  135:icmpne          152
			j = Math.min(l, mSecondaryOrientation.getTotalSpace());
	//   74  138:iload           6
	//   75  140:aload_0         
	//   76  141:getfield        #329 <Field OrientationHelper mSecondaryOrientation>
	//   77  144:invokevirtual   #531 <Method int OrientationHelper.getTotalSpace()>
	//   78  147:invokestatic    #604 <Method int Math.min(int, int)>
	//   79  150:istore          4
		updateMeasureSpecs(j);
	//   80  152:aload_0         
	//   81  153:iload           4
	//   82  155:invokevirtual   #534 <Method void updateMeasureSpecs(int)>
		j = ((int) (flag));
	//   83  158:iload           5
	//   84  160:istore          4
		if(mSizePerSpan == k1)
	//*  85  162:aload_0         
	//*  86  163:getfield        #480 <Field int mSizePerSpan>
	//*  87  166:iload           8
	//*  88  168:icmpne          172
			return;
	//   89  171:return          
		for(; j < j1; j++)
	//*  90  172:iload           4
	//*  91  174:iload           7
	//*  92  176:icmpge          340
		{
			View view1 = getChildAt(j);
	//   93  179:aload_0         
	//   94  180:iload           4
	//   95  182:invokevirtual   #345 <Method View getChildAt(int)>
	//   96  185:astore          9
			LayoutParams layoutparams = (LayoutParams)view1.getLayoutParams();
	//   97  187:aload           9
	//   98  189:invokevirtual   #401 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   99  192:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//  100  195:astore          10
			if(layoutparams.mFullSpan)
	//* 101  197:aload           10
	//* 102  199:getfield        #239 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 103  202:ifeq            208
				continue;
	//  104  205:goto            331
			if(isLayoutRTL() && mOrientation == 1)
	//* 105  208:aload_0         
	//* 106  209:invokevirtual   #312 <Method boolean isLayoutRTL()>
	//* 107  212:ifeq            272
	//* 108  215:aload_0         
	//* 109  216:getfield        #125 <Field int mOrientation>
	//* 110  219:iconst_1        
	//* 111  220:icmpne          272
			{
				view1.offsetLeftAndRight(-(mSpanCount - 1 - layoutparams.mSpan.mIndex) * mSizePerSpan - -(mSpanCount - 1 - layoutparams.mSpan.mIndex) * k1);
	//  112  223:aload           9
	//  113  225:aload_0         
	//  114  226:getfield        #93  <Field int mSpanCount>
	//  115  229:iconst_1        
	//  116  230:isub            
	//  117  231:aload           10
	//  118  233:getfield        #245 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//  119  236:getfield        #649 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//  120  239:isub            
	//  121  240:ineg            
	//  122  241:aload_0         
	//  123  242:getfield        #480 <Field int mSizePerSpan>
	//  124  245:imul            
	//  125  246:aload_0         
	//  126  247:getfield        #93  <Field int mSpanCount>
	//  127  250:iconst_1        
	//  128  251:isub            
	//  129  252:aload           10
	//  130  254:getfield        #245 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//  131  257:getfield        #649 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//  132  260:isub            
	//  133  261:ineg            
	//  134  262:iload           8
	//  135  264:imul            
	//  136  265:isub            
	//  137  266:invokevirtual   #652 <Method void View.offsetLeftAndRight(int)>
				continue;
	//  138  269:goto            331
			}
			int k = layoutparams.mSpan.mIndex * mSizePerSpan;
	//  139  272:aload           10
	//  140  274:getfield        #245 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//  141  277:getfield        #649 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//  142  280:aload_0         
	//  143  281:getfield        #480 <Field int mSizePerSpan>
	//  144  284:imul            
	//  145  285:istore          5
			int i1 = layoutparams.mSpan.mIndex * k1;
	//  146  287:aload           10
	//  147  289:getfield        #245 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//  148  292:getfield        #649 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//  149  295:iload           8
	//  150  297:imul            
	//  151  298:istore          6
			if(mOrientation == 1)
	//* 152  300:aload_0         
	//* 153  301:getfield        #125 <Field int mOrientation>
	//* 154  304:iconst_1        
	//* 155  305:icmpne          321
				view1.offsetLeftAndRight(k - i1);
	//  156  308:aload           9
	//  157  310:iload           5
	//  158  312:iload           6
	//  159  314:isub            
	//  160  315:invokevirtual   #652 <Method void View.offsetLeftAndRight(int)>
			else
	//* 161  318:goto            331
				view1.offsetTopAndBottom(k - i1);
	//  162  321:aload           9
	//  163  323:iload           5
	//  164  325:iload           6
	//  165  327:isub            
	//  166  328:invokevirtual   #655 <Method void View.offsetTopAndBottom(int)>
		}

	//  167  331:iload           4
	//  168  333:iconst_1        
	//  169  334:iadd            
	//  170  335:istore          4
	//* 171  337:goto            172
	//  172  340:return          
	}

	private void resolveShouldLayoutReverse()
	{
		if(mOrientation != 1 && isLayoutRTL())
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field int mOrientation>
	//*   2    4:iconst_1        
	//*   3    5:icmpeq          29
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #312 <Method boolean isLayoutRTL()>
	//*   6   12:ifne            18
	//*   7   15:goto            29
		{
			mShouldReverseLayout = mReverseLayout ^ true;
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #95  <Field boolean mReverseLayout>
	//   11   23:iconst_1        
	//   12   24:ixor            
	//   13   25:putfield        #97  <Field boolean mShouldReverseLayout>
			return;
	//   14   28:return          
		} else
		{
			mShouldReverseLayout = mReverseLayout;
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #95  <Field boolean mReverseLayout>
	//   18   34:putfield        #97  <Field boolean mShouldReverseLayout>
			return;
	//   19   37:return          
		}
	}

	private void setLayoutStateDirection(int i)
	{
		mLayoutState.mLayoutDirection = i;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field LayoutState mLayoutState>
	//    2    4:iload_1         
	//    3    5:putfield        #236 <Field int LayoutState.mLayoutDirection>
		LayoutState layoutstate = mLayoutState;
	//    4    8:aload_0         
	//    5    9:getfield        #134 <Field LayoutState mLayoutState>
	//    6   12:astore          5
		boolean flag2 = mShouldReverseLayout;
	//    7   14:aload_0         
	//    8   15:getfield        #97  <Field boolean mShouldReverseLayout>
	//    9   18:istore          4
		boolean flag = true;
	//   10   20:iconst_1        
	//   11   21:istore_2        
		boolean flag1;
		if(i == -1)
	//*  12   22:iload_1         
	//*  13   23:iconst_m1       
	//*  14   24:icmpne          32
			flag1 = true;
	//   15   27:iconst_1        
	//   16   28:istore_3        
		else
	//*  17   29:goto            34
			flag1 = false;
	//   18   32:iconst_0        
	//   19   33:istore_3        
		if(flag2 == flag1)
	//*  20   34:iload           4
	//*  21   36:iload_3         
	//*  22   37:icmpne          45
			i = ((int) (flag));
	//   23   40:iload_2         
	//   24   41:istore_1        
		else
	//*  25   42:goto            47
			i = -1;
	//   26   45:iconst_m1       
	//   27   46:istore_1        
		layoutstate.mItemDirection = i;
	//   28   47:aload           5
	//   29   49:iload_1         
	//   30   50:putfield        #549 <Field int LayoutState.mItemDirection>
	//   31   53:return          
	}

	private void updateAllRemainingSpans(int i, int j)
	{
		for(int k = 0; k < mSpanCount; k++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_0         
	//*   4    4:getfield        #93  <Field int mSpanCount>
	//*   5    7:icmpge          47
			if(!mSpans[k].mViews.isEmpty())
	//*   6   10:aload_0         
	//*   7   11:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//*   8   14:iload_3         
	//*   9   15:aaload          
	//*  10   16:getfield        #268 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//*  11   19:invokevirtual   #659 <Method boolean ArrayList.isEmpty()>
	//*  12   22:ifeq            28
	//*  13   25:goto            40
				updateRemainingSpans(mSpans[k], i, j);
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   17   33:iload_3         
	//   18   34:aaload          
	//   19   35:iload_1         
	//   20   36:iload_2         
	//   21   37:invokespecial   #663 <Method void updateRemainingSpans(StaggeredGridLayoutManager$Span, int, int)>

	//   22   40:iload_3         
	//   23   41:iconst_1        
	//   24   42:iadd            
	//   25   43:istore_3        
	//*  26   44:goto            2
	//   27   47:return          
	}

	private boolean updateAnchorFromChildren(RecyclerView.State state, AnchorInfo anchorinfo)
	{
		int i;
		if(mLastLayoutFromEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #504 <Field boolean mLastLayoutFromEnd>
	//*   2    4:ifeq            19
			i = findLastReferenceChildPosition(state.getItemCount());
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #486 <Method int RecyclerView$State.getItemCount()>
	//    6   12:invokespecial   #667 <Method int findLastReferenceChildPosition(int)>
	//    7   15:istore_3        
		else
	//*   8   16:goto            28
			i = findFirstReferenceChildPosition(state.getItemCount());
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #486 <Method int RecyclerView$State.getItemCount()>
	//   12   24:invokespecial   #669 <Method int findFirstReferenceChildPosition(int)>
	//   13   27:istore_3        
		anchorinfo.mPosition = i;
	//   14   28:aload_2         
	//   15   29:iload_3         
	//   16   30:putfield        #537 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
		anchorinfo.mOffset = 0x80000000;
	//   17   33:aload_2         
	//   18   34:ldc1            #43  <Int 0x80000000>
	//   19   36:putfield        #511 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
		return true;
	//   20   39:iconst_1        
	//   21   40:ireturn         
	}

	private void updateLayoutState(int i, RecyclerView.State state)
	{
		int j;
		boolean flag2;
label0:
		{
			LayoutState layoutstate = mLayoutState;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field LayoutState mLayoutState>
	//    2    4:astore          7
			flag2 = false;
	//    3    6:iconst_0        
	//    4    7:istore          5
			layoutstate.mAvailable = 0;
	//    5    9:aload           7
	//    6   11:iconst_0        
	//    7   12:putfield        #583 <Field int LayoutState.mAvailable>
			mLayoutState.mCurrentPosition = i;
	//    8   15:aload_0         
	//    9   16:getfield        #134 <Field LayoutState mLayoutState>
	//   10   19:iload_1         
	//   11   20:putfield        #552 <Field int LayoutState.mCurrentPosition>
			if(isSmoothScrolling())
	//*  12   23:aload_0         
	//*  13   24:invokevirtual   #672 <Method boolean isSmoothScrolling()>
	//*  14   27:ifeq            93
			{
				j = state.getTargetScrollPosition();
	//   15   30:aload_2         
	//   16   31:invokevirtual   #675 <Method int RecyclerView$State.getTargetScrollPosition()>
	//   17   34:istore_3        
				if(j != -1)
	//*  18   35:iload_3         
	//*  19   36:iconst_m1       
	//*  20   37:icmpeq          93
				{
					boolean flag3 = mShouldReverseLayout;
	//   21   40:aload_0         
	//   22   41:getfield        #97  <Field boolean mShouldReverseLayout>
	//   23   44:istore          6
					boolean flag;
					if(j < i)
	//*  24   46:iload_3         
	//*  25   47:iload_1         
	//*  26   48:icmpge          57
						flag = true;
	//   27   51:iconst_1        
	//   28   52:istore          4
					else
	//*  29   54:goto            60
						flag = false;
	//   30   57:iconst_0        
	//   31   58:istore          4
					if(flag3 == flag)
	//*  32   60:iload           6
	//*  33   62:iload           4
	//*  34   64:icmpne          80
					{
						j = mPrimaryOrientation.getTotalSpace();
	//   35   67:aload_0         
	//   36   68:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//   37   71:invokevirtual   #531 <Method int OrientationHelper.getTotalSpace()>
	//   38   74:istore_3        
						i = 0;
	//   39   75:iconst_0        
	//   40   76:istore_1        
					} else
	//*  41   77:goto            97
					{
						i = mPrimaryOrientation.getTotalSpace();
	//   42   80:aload_0         
	//   43   81:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//   44   84:invokevirtual   #531 <Method int OrientationHelper.getTotalSpace()>
	//   45   87:istore_1        
						j = 0;
	//   46   88:iconst_0        
	//   47   89:istore_3        
					}
					break label0;
	//   48   90:goto            97
				}
			}
			i = 0;
	//   49   93:iconst_0        
	//   50   94:istore_1        
			j = i;
	//   51   95:iload_1         
	//   52   96:istore_3        
		}
		if(getClipToPadding())
	//*  53   97:aload_0         
	//*  54   98:invokevirtual   #678 <Method boolean getClipToPadding()>
	//*  55  101:ifeq            139
		{
			mLayoutState.mStartLine = mPrimaryOrientation.getStartAfterPadding() - i;
	//   56  104:aload_0         
	//   57  105:getfield        #134 <Field LayoutState mLayoutState>
	//   58  108:aload_0         
	//   59  109:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//   60  112:invokevirtual   #195 <Method int OrientationHelper.getStartAfterPadding()>
	//   61  115:iload_1         
	//   62  116:isub            
	//   63  117:putfield        #593 <Field int LayoutState.mStartLine>
			mLayoutState.mEndLine = mPrimaryOrientation.getEndAfterPadding() + j;
	//   64  120:aload_0         
	//   65  121:getfield        #134 <Field LayoutState mLayoutState>
	//   66  124:aload_0         
	//   67  125:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//   68  128:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//   69  131:iload_3         
	//   70  132:iadd            
	//   71  133:putfield        #586 <Field int LayoutState.mEndLine>
		} else
	//*  72  136:goto            164
		{
			mLayoutState.mEndLine = mPrimaryOrientation.getEnd() + j;
	//   73  139:aload_0         
	//   74  140:getfield        #134 <Field LayoutState mLayoutState>
	//   75  143:aload_0         
	//   76  144:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//   77  147:invokevirtual   #681 <Method int OrientationHelper.getEnd()>
	//   78  150:iload_3         
	//   79  151:iadd            
	//   80  152:putfield        #586 <Field int LayoutState.mEndLine>
			mLayoutState.mStartLine = -i;
	//   81  155:aload_0         
	//   82  156:getfield        #134 <Field LayoutState mLayoutState>
	//   83  159:iload_1         
	//   84  160:ineg            
	//   85  161:putfield        #593 <Field int LayoutState.mStartLine>
		}
		mLayoutState.mStopInFocusable = false;
	//   86  164:aload_0         
	//   87  165:getfield        #134 <Field LayoutState mLayoutState>
	//   88  168:iconst_0        
	//   89  169:putfield        #684 <Field boolean LayoutState.mStopInFocusable>
		mLayoutState.mRecycle = true;
	//   90  172:aload_0         
	//   91  173:getfield        #134 <Field LayoutState mLayoutState>
	//   92  176:iconst_1        
	//   93  177:putfield        #528 <Field boolean LayoutState.mRecycle>
		state = ((RecyclerView.State) (mLayoutState));
	//   94  180:aload_0         
	//   95  181:getfield        #134 <Field LayoutState mLayoutState>
	//   96  184:astore_2        
		boolean flag1 = flag2;
	//   97  185:iload           5
	//   98  187:istore          4
		if(mPrimaryOrientation.getMode() == 0)
	//*  99  189:aload_0         
	//* 100  190:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//* 101  193:invokevirtual   #631 <Method int OrientationHelper.getMode()>
	//* 102  196:ifne            216
		{
			flag1 = flag2;
	//  103  199:iload           5
	//  104  201:istore          4
			if(mPrimaryOrientation.getEnd() == 0)
	//* 105  203:aload_0         
	//* 106  204:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//* 107  207:invokevirtual   #681 <Method int OrientationHelper.getEnd()>
	//* 108  210:ifne            216
				flag1 = true;
	//  109  213:iconst_1        
	//  110  214:istore          4
		}
		state.mInfinite = flag1;
	//  111  216:aload_2         
	//  112  217:iload           4
	//  113  219:putfield        #580 <Field boolean LayoutState.mInfinite>
	//  114  222:return          
	}

	private void updateRemainingSpans(Span span, int i, int j)
	{
		int k = span.getDeletedSize();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #687 <Method int StaggeredGridLayoutManager$Span.getDeletedSize()>
	//    2    4:istore          4
		if(i == -1)
	//*   3    6:iload_2         
	//*   4    7:iconst_m1       
	//*   5    8:icmpne          35
		{
			if(span.getStartLine() + k <= j)
	//*   6   11:aload_1         
	//*   7   12:invokevirtual   #286 <Method int StaggeredGridLayoutManager$Span.getStartLine()>
	//*   8   15:iload           4
	//*   9   17:iadd            
	//*  10   18:iload_3         
	//*  11   19:icmpgt          58
			{
				mRemainingSpans.set(span.mIndex, false);
	//   12   22:aload_0         
	//   13   23:getfield        #689 <Field BitSet mRemainingSpans>
	//   14   26:aload_1         
	//   15   27:getfield        #649 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//   16   30:iconst_0        
	//   17   31:invokevirtual   #695 <Method void BitSet.set(int, boolean)>
				return;
	//   18   34:return          
			}
		} else
		if(span.getEndLine() - k >= j)
	//*  19   35:aload_1         
	//*  20   36:invokevirtual   #264 <Method int StaggeredGridLayoutManager$Span.getEndLine()>
	//*  21   39:iload           4
	//*  22   41:isub            
	//*  23   42:iload_3         
	//*  24   43:icmplt          58
			mRemainingSpans.set(span.mIndex, false);
	//   25   46:aload_0         
	//   26   47:getfield        #689 <Field BitSet mRemainingSpans>
	//   27   50:aload_1         
	//   28   51:getfield        #649 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//   29   54:iconst_0        
	//   30   55:invokevirtual   #695 <Method void BitSet.set(int, boolean)>
	//   31   58:return          
	}

	private int updateSpecWithExtra(int i, int j, int k)
	{
		if(j == 0 && k == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            10
	//*   2    4:iload_3         
	//*   3    5:ifne            10
			return i;
	//    4    8:iload_1         
	//    5    9:ireturn         
		int l = android.view.View.MeasureSpec.getMode(i);
	//    6   10:iload_1         
	//    7   11:invokestatic    #699 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    8   14:istore          4
		if(l != 0x80000000 && l != 0x40000000)
	//*   9   16:iload           4
	//*  10   18:ldc1            #43  <Int 0x80000000>
	//*  11   20:icmpeq          36
	//*  12   23:iload           4
	//*  13   25:ldc2            #632 <Int 0x40000000>
	//*  14   28:icmpne          34
	//*  15   31:goto            36
			return i;
	//   16   34:iload_1         
	//   17   35:ireturn         
		else
			return android.view.View.MeasureSpec.makeMeasureSpec(Math.max(0, android.view.View.MeasureSpec.getSize(i) - j - k), l);
	//   18   36:iconst_0        
	//   19   37:iload_1         
	//   20   38:invokestatic    #702 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   21   41:iload_2         
	//   22   42:isub            
	//   23   43:iload_3         
	//   24   44:isub            
	//   25   45:invokestatic    #704 <Method int Math.max(int, int)>
	//   26   48:iload           4
	//   27   50:invokestatic    #707 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   28   53:ireturn         
	}

	boolean areAllEndsEqual()
	{
		int j = mSpans[0].getEndLine(0x80000000);
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:ldc1            #43  <Int 0x80000000>
	//    5    8:invokevirtual   #320 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
	//    6   11:istore_2        
		for(int i = 1; i < mSpanCount; i++)
	//*   7   12:iconst_1        
	//*   8   13:istore_1        
	//*   9   14:iload_1         
	//*  10   15:aload_0         
	//*  11   16:getfield        #93  <Field int mSpanCount>
	//*  12   19:icmpge          46
			if(mSpans[i].getEndLine(0x80000000) != j)
	//*  13   22:aload_0         
	//*  14   23:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//*  15   26:iload_1         
	//*  16   27:aaload          
	//*  17   28:ldc1            #43  <Int 0x80000000>
	//*  18   30:invokevirtual   #320 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
	//*  19   33:iload_2         
	//*  20   34:icmpeq          39
				return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         

	//   23   39:iload_1         
	//   24   40:iconst_1        
	//   25   41:iadd            
	//   26   42:istore_1        
	//*  27   43:goto            14
		return true;
	//   28   46:iconst_1        
	//   29   47:ireturn         
	}

	boolean areAllStartsEqual()
	{
		int j = mSpans[0].getStartLine(0x80000000);
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:ldc1            #43  <Int 0x80000000>
	//    5    8:invokevirtual   #323 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
	//    6   11:istore_2        
		for(int i = 1; i < mSpanCount; i++)
	//*   7   12:iconst_1        
	//*   8   13:istore_1        
	//*   9   14:iload_1         
	//*  10   15:aload_0         
	//*  11   16:getfield        #93  <Field int mSpanCount>
	//*  12   19:icmpge          46
			if(mSpans[i].getStartLine(0x80000000) != j)
	//*  13   22:aload_0         
	//*  14   23:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//*  15   26:iload_1         
	//*  16   27:aaload          
	//*  17   28:ldc1            #43  <Int 0x80000000>
	//*  18   30:invokevirtual   #323 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
	//*  19   33:iload_2         
	//*  20   34:icmpeq          39
				return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         

	//   23   39:iload_1         
	//   24   40:iconst_1        
	//   25   41:iadd            
	//   26   42:istore_1        
	//*  27   43:goto            14
		return true;
	//   28   46:iconst_1        
	//   29   47:ireturn         
	}

	public void assertNotInLayoutOrScroll(String s)
	{
		if(mPendingSavedState == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*   2    4:ifnonnull       12
			super.assertNotInLayoutOrScroll(s);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #712 <Method void RecyclerView$LayoutManager.assertNotInLayoutOrScroll(String)>
	//    6   12:return          
	}

	public boolean canScrollHorizontally()
	{
		return mOrientation == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field int mOrientation>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean canScrollVertically()
	{
		return mOrientation == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field int mOrientation>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	boolean checkForGaps()
	{
		if(getChildCount() != 0 && mGapStrategy != 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #256 <Method int getChildCount()>
	//*   2    4:ifeq            211
	//*   3    7:aload_0         
	//*   4    8:getfield        #106 <Field int mGapStrategy>
	//*   5   11:ifeq            211
		{
			if(!isAttachedToWindow())
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #717 <Method boolean isAttachedToWindow()>
	//*   8   18:ifne            23
				return false;
	//    9   21:iconst_0        
	//   10   22:ireturn         
			int i;
			int j;
			if(mShouldReverseLayout)
	//*  11   23:aload_0         
	//*  12   24:getfield        #97  <Field boolean mShouldReverseLayout>
	//*  13   27:ifeq            43
			{
				i = getLastChildPosition();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #380 <Method int getLastChildPosition()>
	//   16   34:istore_1        
				j = getFirstChildPosition();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #259 <Method int getFirstChildPosition()>
	//   19   39:istore_2        
			} else
	//*  20   40:goto            53
			{
				i = getFirstChildPosition();
	//   21   43:aload_0         
	//   22   44:invokevirtual   #259 <Method int getFirstChildPosition()>
	//   23   47:istore_1        
				j = getLastChildPosition();
	//   24   48:aload_0         
	//   25   49:invokevirtual   #380 <Method int getLastChildPosition()>
	//   26   52:istore_2        
			}
			if(i == 0 && hasGapsToFix() != null)
	//*  27   53:iload_1         
	//*  28   54:ifne            81
	//*  29   57:aload_0         
	//*  30   58:invokevirtual   #566 <Method View hasGapsToFix()>
	//*  31   61:ifnull          81
			{
				mLazySpanLookup.clear();
	//   32   64:aload_0         
	//   33   65:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   34   68:invokevirtual   #505 <Method void StaggeredGridLayoutManager$LazySpanLookup.clear()>
				requestSimpleAnimationsInNextLayout();
	//   35   71:aload_0         
	//   36   72:invokevirtual   #720 <Method void requestSimpleAnimationsInNextLayout()>
				requestLayout();
	//   37   75:aload_0         
	//   38   76:invokevirtual   #392 <Method void requestLayout()>
				return true;
	//   39   79:iconst_1        
	//   40   80:ireturn         
			}
			if(!mLaidOutInvalidFullSpan)
	//*  41   81:aload_0         
	//*  42   82:getfield        #118 <Field boolean mLaidOutInvalidFullSpan>
	//*  43   85:ifne            90
				return false;
	//   44   88:iconst_0        
	//   45   89:ireturn         
			byte byte0;
			if(mShouldReverseLayout)
	//*  46   90:aload_0         
	//*  47   91:getfield        #97  <Field boolean mShouldReverseLayout>
	//*  48   94:ifeq            102
				byte0 = -1;
	//   49   97:iconst_m1       
	//   50   98:istore_3        
			else
	//*  51   99:goto            104
				byte0 = 1;
	//   52  102:iconst_1        
	//   53  103:istore_3        
			Object obj = ((Object) (mLazySpanLookup));
	//   54  104:aload_0         
	//   55  105:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   56  108:astore          4
			j++;
	//   57  110:iload_2         
	//   58  111:iconst_1        
	//   59  112:iadd            
	//   60  113:istore_2        
			obj = ((Object) (((LazySpanLookup) (obj)).getFirstFullSpanItemInRange(i, j, ((int) (byte0)), true)));
	//   61  114:aload           4
	//   62  116:iload_1         
	//   63  117:iload_2         
	//   64  118:iload_3         
	//   65  119:iconst_1        
	//   66  120:invokevirtual   #724 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem StaggeredGridLayoutManager$LazySpanLookup.getFirstFullSpanItemInRange(int, int, int, boolean)>
	//   67  123:astore          4
			if(obj == null)
	//*  68  125:aload           4
	//*  69  127:ifnonnull       146
			{
				mLaidOutInvalidFullSpan = false;
	//   70  130:aload_0         
	//   71  131:iconst_0        
	//   72  132:putfield        #118 <Field boolean mLaidOutInvalidFullSpan>
				mLazySpanLookup.forceInvalidateAfter(j);
	//   73  135:aload_0         
	//   74  136:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   75  139:iload_2         
	//   76  140:invokevirtual   #727 <Method int StaggeredGridLayoutManager$LazySpanLookup.forceInvalidateAfter(int)>
	//   77  143:pop             
				return false;
	//   78  144:iconst_0        
	//   79  145:ireturn         
			}
			LazySpanLookup.FullSpanItem fullspanitem = mLazySpanLookup.getFirstFullSpanItemInRange(i, ((LazySpanLookup.FullSpanItem) (obj)).mPosition, byte0 * -1, true);
	//   80  146:aload_0         
	//   81  147:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   82  150:iload_1         
	//   83  151:aload           4
	//   84  153:getfield        #728 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//   85  156:iload_3         
	//   86  157:iconst_m1       
	//   87  158:imul            
	//   88  159:iconst_1        
	//   89  160:invokevirtual   #724 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem StaggeredGridLayoutManager$LazySpanLookup.getFirstFullSpanItemInRange(int, int, int, boolean)>
	//   90  163:astore          5
			if(fullspanitem == null)
	//*  91  165:aload           5
	//*  92  167:ifnonnull       186
				mLazySpanLookup.forceInvalidateAfter(((LazySpanLookup.FullSpanItem) (obj)).mPosition);
	//   93  170:aload_0         
	//   94  171:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   95  174:aload           4
	//   96  176:getfield        #728 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//   97  179:invokevirtual   #727 <Method int StaggeredGridLayoutManager$LazySpanLookup.forceInvalidateAfter(int)>
	//   98  182:pop             
			else
	//*  99  183:goto            201
				mLazySpanLookup.forceInvalidateAfter(fullspanitem.mPosition + 1);
	//  100  186:aload_0         
	//  101  187:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//  102  190:aload           5
	//  103  192:getfield        #728 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//  104  195:iconst_1        
	//  105  196:iadd            
	//  106  197:invokevirtual   #727 <Method int StaggeredGridLayoutManager$LazySpanLookup.forceInvalidateAfter(int)>
	//  107  200:pop             
			requestSimpleAnimationsInNextLayout();
	//  108  201:aload_0         
	//  109  202:invokevirtual   #720 <Method void requestSimpleAnimationsInNextLayout()>
			requestLayout();
	//  110  205:aload_0         
	//  111  206:invokevirtual   #392 <Method void requestLayout()>
			return true;
	//  112  209:iconst_1        
	//  113  210:ireturn         
		} else
		{
			return false;
	//  114  211:iconst_0        
	//  115  212:ireturn         
		}
	}

	public boolean checkLayoutParams(RecyclerView.LayoutParams layoutparams)
	{
		return layoutparams instanceof LayoutParams;
	//    0    0:aload_1         
	//    1    1:instanceof      #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//    2    4:ireturn         
	}

	public void collectAdjacentPrefetchPositions(int i, int j, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutprefetchregistry)
	{
		if(mOrientation != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field int mOrientation>
	//*   2    4:ifne            10
	//*   3    7:goto            12
			i = j;
	//    4   10:iload_2         
	//    5   11:istore_1        
		if(getChildCount() != 0)
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #256 <Method int getChildCount()>
	//*   8   16:ifeq            251
		{
			if(i == 0)
	//*   9   19:iload_1         
	//*  10   20:ifne            24
				return;
	//   11   23:return          
			prepareLayoutStateForDelta(i, state);
	//   12   24:aload_0         
	//   13   25:iload_1         
	//   14   26:aload_3         
	//   15   27:invokevirtual   #739 <Method void prepareLayoutStateForDelta(int, RecyclerView$State)>
			if(mPrefetchDistances == null || mPrefetchDistances.length < mSpanCount)
	//*  16   30:aload_0         
	//*  17   31:getfield        #741 <Field int[] mPrefetchDistances>
	//*  18   34:ifnull          49
	//*  19   37:aload_0         
	//*  20   38:getfield        #741 <Field int[] mPrefetchDistances>
	//*  21   41:arraylength     
	//*  22   42:aload_0         
	//*  23   43:getfield        #93  <Field int mSpanCount>
	//*  24   46:icmpge          59
				mPrefetchDistances = new int[mSpanCount];
	//   25   49:aload_0         
	//   26   50:aload_0         
	//   27   51:getfield        #93  <Field int mSpanCount>
	//   28   54:newarray        int[]
	//   29   56:putfield        #741 <Field int[] mPrefetchDistances>
			boolean flag = false;
	//   30   59:iconst_0        
	//   31   60:istore          7
			j = 0;
	//   32   62:iconst_0        
	//   33   63:istore_2        
			int k;
			for(i = j; j < mSpanCount; i = k)
	//*  34   64:iload_2         
	//*  35   65:istore_1        
	//*  36   66:iload_2         
	//*  37   67:aload_0         
	//*  38   68:getfield        #93  <Field int mSpanCount>
	//*  39   71:icmpge          171
			{
				int l;
				if(mLayoutState.mItemDirection == -1)
	//*  40   74:aload_0         
	//*  41   75:getfield        #134 <Field LayoutState mLayoutState>
	//*  42   78:getfield        #549 <Field int LayoutState.mItemDirection>
	//*  43   81:iconst_m1       
	//*  44   82:icmpne          114
					l = mLayoutState.mStartLine - mSpans[j].getStartLine(mLayoutState.mStartLine);
	//   45   85:aload_0         
	//   46   86:getfield        #134 <Field LayoutState mLayoutState>
	//   47   89:getfield        #593 <Field int LayoutState.mStartLine>
	//   48   92:aload_0         
	//   49   93:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   50   96:iload_2         
	//   51   97:aaload          
	//   52   98:aload_0         
	//   53   99:getfield        #134 <Field LayoutState mLayoutState>
	//   54  102:getfield        #593 <Field int LayoutState.mStartLine>
	//   55  105:invokevirtual   #323 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
	//   56  108:isub            
	//   57  109:istore          6
				else
	//*  58  111:goto            140
					l = mSpans[j].getEndLine(mLayoutState.mEndLine) - mLayoutState.mEndLine;
	//   59  114:aload_0         
	//   60  115:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   61  118:iload_2         
	//   62  119:aaload          
	//   63  120:aload_0         
	//   64  121:getfield        #134 <Field LayoutState mLayoutState>
	//   65  124:getfield        #586 <Field int LayoutState.mEndLine>
	//   66  127:invokevirtual   #320 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
	//   67  130:aload_0         
	//   68  131:getfield        #134 <Field LayoutState mLayoutState>
	//   69  134:getfield        #586 <Field int LayoutState.mEndLine>
	//   70  137:isub            
	//   71  138:istore          6
				k = i;
	//   72  140:iload_1         
	//   73  141:istore          5
				if(l >= 0)
	//*  74  143:iload           6
	//*  75  145:iflt            161
				{
					mPrefetchDistances[i] = l;
	//   76  148:aload_0         
	//   77  149:getfield        #741 <Field int[] mPrefetchDistances>
	//   78  152:iload_1         
	//   79  153:iload           6
	//   80  155:iastore         
					k = i + 1;
	//   81  156:iload_1         
	//   82  157:iconst_1        
	//   83  158:iadd            
	//   84  159:istore          5
				}
				j++;
	//   85  161:iload_2         
	//   86  162:iconst_1        
	//   87  163:iadd            
	//   88  164:istore_2        
			}

	//   89  165:iload           5
	//   90  167:istore_1        
	//*  91  168:goto            66
			Arrays.sort(mPrefetchDistances, 0, i);
	//   92  171:aload_0         
	//   93  172:getfield        #741 <Field int[] mPrefetchDistances>
	//   94  175:iconst_0        
	//   95  176:iload_1         
	//   96  177:invokestatic    #747 <Method void Arrays.sort(int[], int, int)>
			for(j = ((int) (flag)); j < i && mLayoutState.hasMore(state); j++)
	//*  97  180:iload           7
	//*  98  182:istore_2        
	//*  99  183:iload_2         
	//* 100  184:iload_1         
	//* 101  185:icmpge          250
	//* 102  188:aload_0         
	//* 103  189:getfield        #134 <Field LayoutState mLayoutState>
	//* 104  192:aload_3         
	//* 105  193:invokevirtual   #751 <Method boolean LayoutState.hasMore(RecyclerView$State)>
	//* 106  196:ifeq            250
			{
				layoutprefetchregistry.addPosition(mLayoutState.mCurrentPosition, mPrefetchDistances[j]);
	//  107  199:aload           4
	//  108  201:aload_0         
	//  109  202:getfield        #134 <Field LayoutState mLayoutState>
	//  110  205:getfield        #552 <Field int LayoutState.mCurrentPosition>
	//  111  208:aload_0         
	//  112  209:getfield        #741 <Field int[] mPrefetchDistances>
	//  113  212:iload_2         
	//  114  213:iaload          
	//  115  214:invokeinterface #756 <Method void RecyclerView$LayoutManager$LayoutPrefetchRegistry.addPosition(int, int)>
				LayoutState layoutstate = mLayoutState;
	//  116  219:aload_0         
	//  117  220:getfield        #134 <Field LayoutState mLayoutState>
	//  118  223:astore          8
				layoutstate.mCurrentPosition = layoutstate.mCurrentPosition + mLayoutState.mItemDirection;
	//  119  225:aload           8
	//  120  227:aload           8
	//  121  229:getfield        #552 <Field int LayoutState.mCurrentPosition>
	//  122  232:aload_0         
	//  123  233:getfield        #134 <Field LayoutState mLayoutState>
	//  124  236:getfield        #549 <Field int LayoutState.mItemDirection>
	//  125  239:iadd            
	//  126  240:putfield        #552 <Field int LayoutState.mCurrentPosition>
			}

	//  127  243:iload_2         
	//  128  244:iconst_1        
	//  129  245:iadd            
	//  130  246:istore_2        
	//* 131  247:goto            183
			return;
	//  132  250:return          
		} else
		{
			return;
	//  133  251:return          
		}
	}

	public int computeHorizontalScrollExtent(RecyclerView.State state)
	{
		return computeScrollExtent(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #760 <Method int computeScrollExtent(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public int computeHorizontalScrollOffset(RecyclerView.State state)
	{
		return computeScrollOffset(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #763 <Method int computeScrollOffset(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public int computeHorizontalScrollRange(RecyclerView.State state)
	{
		return computeScrollRange(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #766 <Method int computeScrollRange(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public PointF computeScrollVectorForPosition(int i)
	{
		i = calculateScrollDirectionForPosition(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #770 <Method int calculateScrollDirectionForPosition(int)>
	//    3    5:istore_1        
		PointF pointf = new PointF();
	//    4    6:new             #772 <Class PointF>
	//    5    9:dup             
	//    6   10:invokespecial   #773 <Method void PointF()>
	//    7   13:astore_2        
		if(i == 0)
	//*   8   14:iload_1         
	//*   9   15:ifne            20
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		if(mOrientation == 0)
	//*  12   20:aload_0         
	//*  13   21:getfield        #125 <Field int mOrientation>
	//*  14   24:ifne            40
		{
			pointf.x = i;
	//   15   27:aload_2         
	//   16   28:iload_1         
	//   17   29:i2f             
	//   18   30:putfield        #776 <Field float PointF.x>
			pointf.y = 0.0F;
	//   19   33:aload_2         
	//   20   34:fconst_0        
	//   21   35:putfield        #779 <Field float PointF.y>
			return pointf;
	//   22   38:aload_2         
	//   23   39:areturn         
		} else
		{
			pointf.x = 0.0F;
	//   24   40:aload_2         
	//   25   41:fconst_0        
	//   26   42:putfield        #776 <Field float PointF.x>
			pointf.y = i;
	//   27   45:aload_2         
	//   28   46:iload_1         
	//   29   47:i2f             
	//   30   48:putfield        #779 <Field float PointF.y>
			return pointf;
	//   31   51:aload_2         
	//   32   52:areturn         
		}
	}

	public int computeVerticalScrollExtent(RecyclerView.State state)
	{
		return computeScrollExtent(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #760 <Method int computeScrollExtent(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public int computeVerticalScrollOffset(RecyclerView.State state)
	{
		return computeScrollOffset(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #763 <Method int computeScrollOffset(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public int computeVerticalScrollRange(RecyclerView.State state)
	{
		return computeScrollRange(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #766 <Method int computeScrollRange(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public int[] findFirstCompletelyVisibleItemPositions(int ai[])
	{
		int ai1[];
		if(ai == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			ai1 = new int[mSpanCount];
	//    2    4:aload_0         
	//    3    5:getfield        #93  <Field int mSpanCount>
	//    4    8:newarray        int[]
	//    5   10:astore_3        
		} else
	//*   6   11:goto            77
		{
			ai1 = ai;
	//    7   14:aload_1         
	//    8   15:astore_3        
			if(ai.length < mSpanCount)
	//*   9   16:aload_1         
	//*  10   17:arraylength     
	//*  11   18:aload_0         
	//*  12   19:getfield        #93  <Field int mSpanCount>
	//*  13   22:icmpge          77
			{
				ai1 = ((int []) (new StringBuilder()));
	//   14   25:new             #786 <Class StringBuilder>
	//   15   28:dup             
	//   16   29:invokespecial   #787 <Method void StringBuilder()>
	//   17   32:astore_3        
				((StringBuilder) (ai1)).append("Provided int[]'s size must be more than or equal to span count. Expected:");
	//   18   33:aload_3         
	//   19   34:ldc2            #789 <String "Provided int[]'s size must be more than or equal to span count. Expected:">
	//   20   37:invokevirtual   #793 <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
				((StringBuilder) (ai1)).append(mSpanCount);
	//   22   41:aload_3         
	//   23   42:aload_0         
	//   24   43:getfield        #93  <Field int mSpanCount>
	//   25   46:invokevirtual   #796 <Method StringBuilder StringBuilder.append(int)>
	//   26   49:pop             
				((StringBuilder) (ai1)).append(", array size:");
	//   27   50:aload_3         
	//   28   51:ldc2            #798 <String ", array size:">
	//   29   54:invokevirtual   #793 <Method StringBuilder StringBuilder.append(String)>
	//   30   57:pop             
				((StringBuilder) (ai1)).append(ai.length);
	//   31   58:aload_3         
	//   32   59:aload_1         
	//   33   60:arraylength     
	//   34   61:invokevirtual   #796 <Method StringBuilder StringBuilder.append(int)>
	//   35   64:pop             
				throw new IllegalArgumentException(((StringBuilder) (ai1)).toString());
	//   36   65:new             #800 <Class IllegalArgumentException>
	//   37   68:dup             
	//   38   69:aload_3         
	//   39   70:invokevirtual   #804 <Method String StringBuilder.toString()>
	//   40   73:invokespecial   #805 <Method void IllegalArgumentException(String)>
	//   41   76:athrow          
			}
		}
		for(int i = 0; i < mSpanCount; i++)
	//*  42   77:iconst_0        
	//*  43   78:istore_2        
	//*  44   79:iload_2         
	//*  45   80:aload_0         
	//*  46   81:getfield        #93  <Field int mSpanCount>
	//*  47   84:icmpge          106
			ai1[i] = mSpans[i].findFirstCompletelyVisibleItemPosition();
	//   48   87:aload_3         
	//   49   88:iload_2         
	//   50   89:aload_0         
	//   51   90:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   52   93:iload_2         
	//   53   94:aaload          
	//   54   95:invokevirtual   #808 <Method int StaggeredGridLayoutManager$Span.findFirstCompletelyVisibleItemPosition()>
	//   55   98:iastore         

	//   56   99:iload_2         
	//   57  100:iconst_1        
	//   58  101:iadd            
	//   59  102:istore_2        
	//*  60  103:goto            79
		return ai1;
	//   61  106:aload_3         
	//   62  107:areturn         
	}

	View findFirstVisibleItemClosestToEnd(boolean flag)
	{
		int j = mPrimaryOrientation.getStartAfterPadding();
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//    2    4:invokevirtual   #195 <Method int OrientationHelper.getStartAfterPadding()>
	//    3    7:istore_3        
		int k = mPrimaryOrientation.getEndAfterPadding();
	//    4    8:aload_0         
	//    5    9:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//    6   12:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//    7   15:istore          4
		int i = getChildCount() - 1;
	//    8   17:aload_0         
	//    9   18:invokevirtual   #256 <Method int getChildCount()>
	//   10   21:iconst_1        
	//   11   22:isub            
	//   12   23:istore_2        
		View view;
		View view1;
		for(view = null; i >= 0; view = view1)
	//*  13   24:aconst_null     
	//*  14   25:astore          7
	//*  15   27:iload_2         
	//*  16   28:iflt            128
		{
			View view2 = getChildAt(i);
	//   17   31:aload_0         
	//   18   32:iload_2         
	//   19   33:invokevirtual   #345 <Method View getChildAt(int)>
	//   20   36:astore          9
			int l = mPrimaryOrientation.getDecoratedStart(view2);
	//   21   38:aload_0         
	//   22   39:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//   23   42:aload           9
	//   24   44:invokevirtual   #609 <Method int OrientationHelper.getDecoratedStart(View)>
	//   25   47:istore          5
			int i1 = mPrimaryOrientation.getDecoratedEnd(view2);
	//   26   49:aload_0         
	//   27   50:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//   28   53:aload           9
	//   29   55:invokevirtual   #622 <Method int OrientationHelper.getDecoratedEnd(View)>
	//   30   58:istore          6
			view1 = view;
	//   31   60:aload           7
	//   32   62:astore          8
			if(i1 > j)
	//*  33   64:iload           6
	//*  34   66:iload_3         
	//*  35   67:icmple          117
				if(l >= k)
	//*  36   70:iload           5
	//*  37   72:iload           4
	//*  38   74:icmplt          84
					view1 = view;
	//   39   77:aload           7
	//   40   79:astore          8
				else
	//*  41   81:goto            117
				if(i1 > k)
	//*  42   84:iload           6
	//*  43   86:iload           4
	//*  44   88:icmple          114
				{
					if(!flag)
	//*  45   91:iload_1         
	//*  46   92:ifne            98
						return view2;
	//   47   95:aload           9
	//   48   97:areturn         
					view1 = view;
	//   49   98:aload           7
	//   50  100:astore          8
					if(view == null)
	//*  51  102:aload           7
	//*  52  104:ifnonnull       117
						view1 = view2;
	//   53  107:aload           9
	//   54  109:astore          8
				} else
	//*  55  111:goto            117
				{
					return view2;
	//   56  114:aload           9
	//   57  116:areturn         
				}
			i--;
	//   58  117:iload_2         
	//   59  118:iconst_1        
	//   60  119:isub            
	//   61  120:istore_2        
		}

	//   62  121:aload           8
	//   63  123:astore          7
	//*  64  125:goto            27
		return view;
	//   65  128:aload           7
	//   66  130:areturn         
	}

	View findFirstVisibleItemClosestToStart(boolean flag)
	{
		int j = mPrimaryOrientation.getStartAfterPadding();
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//    2    4:invokevirtual   #195 <Method int OrientationHelper.getStartAfterPadding()>
	//    3    7:istore_3        
		int k = mPrimaryOrientation.getEndAfterPadding();
	//    4    8:aload_0         
	//    5    9:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//    6   12:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//    7   15:istore          4
		int l = getChildCount();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #256 <Method int getChildCount()>
	//   10   21:istore          5
		View view = null;
	//   11   23:aconst_null     
	//   12   24:astore          7
		for(int i = 0; i < l;)
	//*  13   26:iconst_0        
	//*  14   27:istore_2        
	//*  15   28:iload_2         
	//*  16   29:iload           5
	//*  17   31:icmpge          126
		{
			View view2 = getChildAt(i);
	//   18   34:aload_0         
	//   19   35:iload_2         
	//   20   36:invokevirtual   #345 <Method View getChildAt(int)>
	//   21   39:astore          9
			int i1 = mPrimaryOrientation.getDecoratedStart(view2);
	//   22   41:aload_0         
	//   23   42:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//   24   45:aload           9
	//   25   47:invokevirtual   #609 <Method int OrientationHelper.getDecoratedStart(View)>
	//   26   50:istore          6
			View view1 = view;
	//   27   52:aload           7
	//   28   54:astore          8
			if(mPrimaryOrientation.getDecoratedEnd(view2) > j)
	//*  29   56:aload_0         
	//*  30   57:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//*  31   60:aload           9
	//*  32   62:invokevirtual   #622 <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  33   65:iload_3         
	//*  34   66:icmple          115
				if(i1 >= k)
	//*  35   69:iload           6
	//*  36   71:iload           4
	//*  37   73:icmplt          83
					view1 = view;
	//   38   76:aload           7
	//   39   78:astore          8
				else
	//*  40   80:goto            115
				if(i1 < j)
	//*  41   83:iload           6
	//*  42   85:iload_3         
	//*  43   86:icmpge          112
				{
					if(!flag)
	//*  44   89:iload_1         
	//*  45   90:ifne            96
						return view2;
	//   46   93:aload           9
	//   47   95:areturn         
					view1 = view;
	//   48   96:aload           7
	//   49   98:astore          8
					if(view == null)
	//*  50  100:aload           7
	//*  51  102:ifnonnull       115
						view1 = view2;
	//   52  105:aload           9
	//   53  107:astore          8
				} else
	//*  54  109:goto            115
				{
					return view2;
	//   55  112:aload           9
	//   56  114:areturn         
				}
			i++;
	//   57  115:iload_2         
	//   58  116:iconst_1        
	//   59  117:iadd            
	//   60  118:istore_2        
			view = view1;
	//   61  119:aload           8
	//   62  121:astore          7
		}

	//*  63  123:goto            28
		return view;
	//   64  126:aload           7
	//   65  128:areturn         
	}

	int findFirstVisibleItemPositionInt()
	{
		View view;
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            16
			view = findFirstVisibleItemClosestToEnd(true);
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:invokevirtual   #295 <Method View findFirstVisibleItemClosestToEnd(boolean)>
	//    6   12:astore_1        
		else
	//*   7   13:goto            22
			view = findFirstVisibleItemClosestToStart(true);
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #292 <Method View findFirstVisibleItemClosestToStart(boolean)>
	//   11   21:astore_1        
		if(view == null)
	//*  12   22:aload_1         
	//*  13   23:ifnonnull       28
			return -1;
	//   14   26:iconst_m1       
	//   15   27:ireturn         
		else
			return getPosition(view);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #349 <Method int getPosition(View)>
	//   19   33:ireturn         
	}

	public int[] findFirstVisibleItemPositions(int ai[])
	{
		int ai1[];
		if(ai == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			ai1 = new int[mSpanCount];
	//    2    4:aload_0         
	//    3    5:getfield        #93  <Field int mSpanCount>
	//    4    8:newarray        int[]
	//    5   10:astore_3        
		} else
	//*   6   11:goto            77
		{
			ai1 = ai;
	//    7   14:aload_1         
	//    8   15:astore_3        
			if(ai.length < mSpanCount)
	//*   9   16:aload_1         
	//*  10   17:arraylength     
	//*  11   18:aload_0         
	//*  12   19:getfield        #93  <Field int mSpanCount>
	//*  13   22:icmpge          77
			{
				ai1 = ((int []) (new StringBuilder()));
	//   14   25:new             #786 <Class StringBuilder>
	//   15   28:dup             
	//   16   29:invokespecial   #787 <Method void StringBuilder()>
	//   17   32:astore_3        
				((StringBuilder) (ai1)).append("Provided int[]'s size must be more than or equal to span count. Expected:");
	//   18   33:aload_3         
	//   19   34:ldc2            #789 <String "Provided int[]'s size must be more than or equal to span count. Expected:">
	//   20   37:invokevirtual   #793 <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
				((StringBuilder) (ai1)).append(mSpanCount);
	//   22   41:aload_3         
	//   23   42:aload_0         
	//   24   43:getfield        #93  <Field int mSpanCount>
	//   25   46:invokevirtual   #796 <Method StringBuilder StringBuilder.append(int)>
	//   26   49:pop             
				((StringBuilder) (ai1)).append(", array size:");
	//   27   50:aload_3         
	//   28   51:ldc2            #798 <String ", array size:">
	//   29   54:invokevirtual   #793 <Method StringBuilder StringBuilder.append(String)>
	//   30   57:pop             
				((StringBuilder) (ai1)).append(ai.length);
	//   31   58:aload_3         
	//   32   59:aload_1         
	//   33   60:arraylength     
	//   34   61:invokevirtual   #796 <Method StringBuilder StringBuilder.append(int)>
	//   35   64:pop             
				throw new IllegalArgumentException(((StringBuilder) (ai1)).toString());
	//   36   65:new             #800 <Class IllegalArgumentException>
	//   37   68:dup             
	//   38   69:aload_3         
	//   39   70:invokevirtual   #804 <Method String StringBuilder.toString()>
	//   40   73:invokespecial   #805 <Method void IllegalArgumentException(String)>
	//   41   76:athrow          
			}
		}
		for(int i = 0; i < mSpanCount; i++)
	//*  42   77:iconst_0        
	//*  43   78:istore_2        
	//*  44   79:iload_2         
	//*  45   80:aload_0         
	//*  46   81:getfield        #93  <Field int mSpanCount>
	//*  47   84:icmpge          106
			ai1[i] = mSpans[i].findFirstVisibleItemPosition();
	//   48   87:aload_3         
	//   49   88:iload_2         
	//   50   89:aload_0         
	//   51   90:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   52   93:iload_2         
	//   53   94:aaload          
	//   54   95:invokevirtual   #813 <Method int StaggeredGridLayoutManager$Span.findFirstVisibleItemPosition()>
	//   55   98:iastore         

	//   56   99:iload_2         
	//   57  100:iconst_1        
	//   58  101:iadd            
	//   59  102:istore_2        
	//*  60  103:goto            79
		return ai1;
	//   61  106:aload_3         
	//   62  107:areturn         
	}

	public int[] findLastCompletelyVisibleItemPositions(int ai[])
	{
		int ai1[];
		if(ai == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			ai1 = new int[mSpanCount];
	//    2    4:aload_0         
	//    3    5:getfield        #93  <Field int mSpanCount>
	//    4    8:newarray        int[]
	//    5   10:astore_3        
		} else
	//*   6   11:goto            77
		{
			ai1 = ai;
	//    7   14:aload_1         
	//    8   15:astore_3        
			if(ai.length < mSpanCount)
	//*   9   16:aload_1         
	//*  10   17:arraylength     
	//*  11   18:aload_0         
	//*  12   19:getfield        #93  <Field int mSpanCount>
	//*  13   22:icmpge          77
			{
				ai1 = ((int []) (new StringBuilder()));
	//   14   25:new             #786 <Class StringBuilder>
	//   15   28:dup             
	//   16   29:invokespecial   #787 <Method void StringBuilder()>
	//   17   32:astore_3        
				((StringBuilder) (ai1)).append("Provided int[]'s size must be more than or equal to span count. Expected:");
	//   18   33:aload_3         
	//   19   34:ldc2            #789 <String "Provided int[]'s size must be more than or equal to span count. Expected:">
	//   20   37:invokevirtual   #793 <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
				((StringBuilder) (ai1)).append(mSpanCount);
	//   22   41:aload_3         
	//   23   42:aload_0         
	//   24   43:getfield        #93  <Field int mSpanCount>
	//   25   46:invokevirtual   #796 <Method StringBuilder StringBuilder.append(int)>
	//   26   49:pop             
				((StringBuilder) (ai1)).append(", array size:");
	//   27   50:aload_3         
	//   28   51:ldc2            #798 <String ", array size:">
	//   29   54:invokevirtual   #793 <Method StringBuilder StringBuilder.append(String)>
	//   30   57:pop             
				((StringBuilder) (ai1)).append(ai.length);
	//   31   58:aload_3         
	//   32   59:aload_1         
	//   33   60:arraylength     
	//   34   61:invokevirtual   #796 <Method StringBuilder StringBuilder.append(int)>
	//   35   64:pop             
				throw new IllegalArgumentException(((StringBuilder) (ai1)).toString());
	//   36   65:new             #800 <Class IllegalArgumentException>
	//   37   68:dup             
	//   38   69:aload_3         
	//   39   70:invokevirtual   #804 <Method String StringBuilder.toString()>
	//   40   73:invokespecial   #805 <Method void IllegalArgumentException(String)>
	//   41   76:athrow          
			}
		}
		for(int i = 0; i < mSpanCount; i++)
	//*  42   77:iconst_0        
	//*  43   78:istore_2        
	//*  44   79:iload_2         
	//*  45   80:aload_0         
	//*  46   81:getfield        #93  <Field int mSpanCount>
	//*  47   84:icmpge          106
			ai1[i] = mSpans[i].findLastCompletelyVisibleItemPosition();
	//   48   87:aload_3         
	//   49   88:iload_2         
	//   50   89:aload_0         
	//   51   90:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   52   93:iload_2         
	//   53   94:aaload          
	//   54   95:invokevirtual   #817 <Method int StaggeredGridLayoutManager$Span.findLastCompletelyVisibleItemPosition()>
	//   55   98:iastore         

	//   56   99:iload_2         
	//   57  100:iconst_1        
	//   58  101:iadd            
	//   59  102:istore_2        
	//*  60  103:goto            79
		return ai1;
	//   61  106:aload_3         
	//   62  107:areturn         
	}

	public int[] findLastVisibleItemPositions(int ai[])
	{
		int ai1[];
		if(ai == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			ai1 = new int[mSpanCount];
	//    2    4:aload_0         
	//    3    5:getfield        #93  <Field int mSpanCount>
	//    4    8:newarray        int[]
	//    5   10:astore_3        
		} else
	//*   6   11:goto            77
		{
			ai1 = ai;
	//    7   14:aload_1         
	//    8   15:astore_3        
			if(ai.length < mSpanCount)
	//*   9   16:aload_1         
	//*  10   17:arraylength     
	//*  11   18:aload_0         
	//*  12   19:getfield        #93  <Field int mSpanCount>
	//*  13   22:icmpge          77
			{
				ai1 = ((int []) (new StringBuilder()));
	//   14   25:new             #786 <Class StringBuilder>
	//   15   28:dup             
	//   16   29:invokespecial   #787 <Method void StringBuilder()>
	//   17   32:astore_3        
				((StringBuilder) (ai1)).append("Provided int[]'s size must be more than or equal to span count. Expected:");
	//   18   33:aload_3         
	//   19   34:ldc2            #789 <String "Provided int[]'s size must be more than or equal to span count. Expected:">
	//   20   37:invokevirtual   #793 <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
				((StringBuilder) (ai1)).append(mSpanCount);
	//   22   41:aload_3         
	//   23   42:aload_0         
	//   24   43:getfield        #93  <Field int mSpanCount>
	//   25   46:invokevirtual   #796 <Method StringBuilder StringBuilder.append(int)>
	//   26   49:pop             
				((StringBuilder) (ai1)).append(", array size:");
	//   27   50:aload_3         
	//   28   51:ldc2            #798 <String ", array size:">
	//   29   54:invokevirtual   #793 <Method StringBuilder StringBuilder.append(String)>
	//   30   57:pop             
				((StringBuilder) (ai1)).append(ai.length);
	//   31   58:aload_3         
	//   32   59:aload_1         
	//   33   60:arraylength     
	//   34   61:invokevirtual   #796 <Method StringBuilder StringBuilder.append(int)>
	//   35   64:pop             
				throw new IllegalArgumentException(((StringBuilder) (ai1)).toString());
	//   36   65:new             #800 <Class IllegalArgumentException>
	//   37   68:dup             
	//   38   69:aload_3         
	//   39   70:invokevirtual   #804 <Method String StringBuilder.toString()>
	//   40   73:invokespecial   #805 <Method void IllegalArgumentException(String)>
	//   41   76:athrow          
			}
		}
		for(int i = 0; i < mSpanCount; i++)
	//*  42   77:iconst_0        
	//*  43   78:istore_2        
	//*  44   79:iload_2         
	//*  45   80:aload_0         
	//*  46   81:getfield        #93  <Field int mSpanCount>
	//*  47   84:icmpge          106
			ai1[i] = mSpans[i].findLastVisibleItemPosition();
	//   48   87:aload_3         
	//   49   88:iload_2         
	//   50   89:aload_0         
	//   51   90:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   52   93:iload_2         
	//   53   94:aaload          
	//   54   95:invokevirtual   #821 <Method int StaggeredGridLayoutManager$Span.findLastVisibleItemPosition()>
	//   55   98:iastore         

	//   56   99:iload_2         
	//   57  100:iconst_1        
	//   58  101:iadd            
	//   59  102:istore_2        
	//*  60  103:goto            79
		return ai1;
	//   61  106:aload_3         
	//   62  107:areturn         
	}

	public RecyclerView.LayoutParams generateDefaultLayoutParams()
	{
		if(mOrientation == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field int mOrientation>
	//*   2    4:ifne            18
			return ((RecyclerView.LayoutParams) (new LayoutParams(-2, -1)));
	//    3    7:new             #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//    4   10:dup             
	//    5   11:bipush          -2
	//    6   13:iconst_m1       
	//    7   14:invokespecial   #825 <Method void StaggeredGridLayoutManager$LayoutParams(int, int)>
	//    8   17:areturn         
		else
			return ((RecyclerView.LayoutParams) (new LayoutParams(-1, -2)));
	//    9   18:new             #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//   10   21:dup             
	//   11   22:iconst_m1       
	//   12   23:bipush          -2
	//   13   25:invokespecial   #825 <Method void StaggeredGridLayoutManager$LayoutParams(int, int)>
	//   14   28:areturn         
	}

	public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeset)
	{
		return ((RecyclerView.LayoutParams) (new LayoutParams(context, attributeset)));
	//    0    0:new             #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #830 <Method void StaggeredGridLayoutManager$LayoutParams(Context, AttributeSet)>
	//    5    9:areturn         
	}

	public RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #833 <Class android.view.ViewGroup$MarginLayoutParams>
	//*   2    4:ifeq            19
			return ((RecyclerView.LayoutParams) (new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams)));
	//    3    7:new             #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #833 <Class android.view.ViewGroup$MarginLayoutParams>
	//    7   15:invokespecial   #836 <Method void StaggeredGridLayoutManager$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//    8   18:areturn         
		else
			return ((RecyclerView.LayoutParams) (new LayoutParams(layoutparams)));
	//    9   19:new             #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//   10   22:dup             
	//   11   23:aload_1         
	//   12   24:invokespecial   #839 <Method void StaggeredGridLayoutManager$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   13   27:areturn         
	}

	public int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(mOrientation == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field int mOrientation>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			return mSpanCount;
	//    4    8:aload_0         
	//    5    9:getfield        #93  <Field int mSpanCount>
	//    6   12:ireturn         
		else
			return super.getColumnCountForAccessibility(recycler, state);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokespecial   #843 <Method int RecyclerView$LayoutManager.getColumnCountForAccessibility(RecyclerView$Recycler, RecyclerView$State)>
	//   11   19:ireturn         
	}

	int getFirstChildPosition()
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #256 <Method int getChildCount()>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return getPosition(getChildAt(0));
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #345 <Method View getChildAt(int)>
	//    9   15:invokevirtual   #349 <Method int getPosition(View)>
	//   10   18:ireturn         
	}

	public int getGapStrategy()
	{
		return mGapStrategy;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field int mGapStrategy>
	//    2    4:ireturn         
	}

	int getLastChildPosition()
	{
		int i = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #256 <Method int getChildCount()>
	//    2    4:istore_1        
		if(i == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return getPosition(getChildAt(i - 1));
	//    7   11:aload_0         
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:iconst_1        
	//   11   15:isub            
	//   12   16:invokevirtual   #345 <Method View getChildAt(int)>
	//   13   19:invokevirtual   #349 <Method int getPosition(View)>
	//   14   22:ireturn         
	}

	public int getOrientation()
	{
		return mOrientation;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field int mOrientation>
	//    2    4:ireturn         
	}

	public boolean getReverseLayout()
	{
		return mReverseLayout;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field boolean mReverseLayout>
	//    2    4:ireturn         
	}

	public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(mOrientation == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field int mOrientation>
	//*   2    4:ifne            12
			return mSpanCount;
	//    3    7:aload_0         
	//    4    8:getfield        #93  <Field int mSpanCount>
	//    5   11:ireturn         
		else
			return super.getRowCountForAccessibility(recycler, state);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokespecial   #849 <Method int RecyclerView$LayoutManager.getRowCountForAccessibility(RecyclerView$Recycler, RecyclerView$State)>
	//   10   18:ireturn         
	}

	public int getSpanCount()
	{
		return mSpanCount;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field int mSpanCount>
	//    2    4:ireturn         
	}

	View hasGapsToFix()
	{
		int i = getChildCount() - 1;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #256 <Method int getChildCount()>
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:istore_1        
		BitSet bitset = new BitSet(mSpanCount);
	//    5    7:new             #691 <Class BitSet>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:getfield        #93  <Field int mSpanCount>
	//    9   15:invokespecial   #852 <Method void BitSet(int)>
	//   10   18:astore          7
		bitset.set(0, mSpanCount, true);
	//   11   20:aload           7
	//   12   22:iconst_0        
	//   13   23:aload_0         
	//   14   24:getfield        #93  <Field int mSpanCount>
	//   15   27:iconst_1        
	//   16   28:invokevirtual   #855 <Method void BitSet.set(int, int, boolean)>
		int k = mOrientation;
	//   17   31:aload_0         
	//   18   32:getfield        #125 <Field int mOrientation>
	//   19   35:istore_2        
		byte byte0 = -1;
	//   20   36:iconst_m1       
	//   21   37:istore          5
		if(k == 1 && isLayoutRTL())
	//*  22   39:iload_2         
	//*  23   40:iconst_1        
	//*  24   41:icmpne          56
	//*  25   44:aload_0         
	//*  26   45:invokevirtual   #312 <Method boolean isLayoutRTL()>
	//*  27   48:ifeq            56
			k = 1;
	//   28   51:iconst_1        
	//   29   52:istore_2        
		else
	//*  30   53:goto            58
			k = -1;
	//   31   56:iconst_m1       
	//   32   57:istore_2        
		int l;
		if(mShouldReverseLayout)
	//*  33   58:aload_0         
	//*  34   59:getfield        #97  <Field boolean mShouldReverseLayout>
	//*  35   62:ifeq            70
		{
			l = -1;
	//   36   65:iconst_m1       
	//   37   66:istore_3        
		} else
	//*  38   67:goto            76
		{
			l = i + 1;
	//   39   70:iload_1         
	//   40   71:iconst_1        
	//   41   72:iadd            
	//   42   73:istore_3        
			i = 0;
	//   43   74:iconst_0        
	//   44   75:istore_1        
		}
		int i1 = i;
	//   45   76:iload_1         
	//   46   77:istore          4
		if(i < l)
	//*  47   79:iload_1         
	//*  48   80:iload_3         
	//*  49   81:icmpge          90
		{
			byte0 = 1;
	//   50   84:iconst_1        
	//   51   85:istore          5
			i1 = i;
	//   52   87:iload_1         
	//   53   88:istore          4
		}
		for(; i1 != l; i1 += ((int) (byte0)))
	//*  54   90:iload           4
	//*  55   92:iload_3         
	//*  56   93:icmpeq          349
		{
			int j;
			View view;
			LayoutParams layoutparams;
			Object obj;
label0:
			{
label1:
				{
					view = getChildAt(i1);
	//   57   96:aload_0         
	//   58   97:iload           4
	//   59   99:invokevirtual   #345 <Method View getChildAt(int)>
	//   60  102:astore          8
					layoutparams = (LayoutParams)view.getLayoutParams();
	//   61  104:aload           8
	//   62  106:invokevirtual   #401 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   63  109:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//   64  112:astore          9
					if(bitset.get(layoutparams.mSpan.mIndex))
	//*  65  114:aload           7
	//*  66  116:aload           9
	//*  67  118:getfield        #245 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//*  68  121:getfield        #649 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//*  69  124:invokevirtual   #857 <Method boolean BitSet.get(int)>
	//*  70  127:ifeq            158
					{
						if(checkSpanForGap(layoutparams.mSpan))
	//*  71  130:aload_0         
	//*  72  131:aload           9
	//*  73  133:getfield        #245 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//*  74  136:invokespecial   #859 <Method boolean checkSpanForGap(StaggeredGridLayoutManager$Span)>
	//*  75  139:ifeq            145
							return view;
	//   76  142:aload           8
	//   77  144:areturn         
						bitset.clear(layoutparams.mSpan.mIndex);
	//   78  145:aload           7
	//   79  147:aload           9
	//   80  149:getfield        #245 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//   81  152:getfield        #649 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//   82  155:invokevirtual   #861 <Method void BitSet.clear(int)>
					}
					if(layoutparams.mFullSpan)
	//*  83  158:aload           9
	//*  84  160:getfield        #239 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*  85  163:ifeq            169
						continue;
	//   86  166:goto            339
					j = i1 + byte0;
	//   87  169:iload           4
	//   88  171:iload           5
	//   89  173:iadd            
	//   90  174:istore_1        
					if(j == l)
						continue;
	//   91  175:iload_1         
	//   92  176:iload_3         
	//   93  177:icmpeq          339
					obj = ((Object) (getChildAt(j)));
	//   94  180:aload_0         
	//   95  181:iload_1         
	//   96  182:invokevirtual   #345 <Method View getChildAt(int)>
	//   97  185:astore          10
					if(mShouldReverseLayout)
	//*  98  187:aload_0         
	//*  99  188:getfield        #97  <Field boolean mShouldReverseLayout>
	//* 100  191:ifeq            233
					{
						j = mPrimaryOrientation.getDecoratedEnd(view);
	//  101  194:aload_0         
	//  102  195:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//  103  198:aload           8
	//  104  200:invokevirtual   #622 <Method int OrientationHelper.getDecoratedEnd(View)>
	//  105  203:istore_1        
						int j1 = mPrimaryOrientation.getDecoratedEnd(((View) (obj)));
	//  106  204:aload_0         
	//  107  205:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//  108  208:aload           10
	//  109  210:invokevirtual   #622 <Method int OrientationHelper.getDecoratedEnd(View)>
	//  110  213:istore          6
						if(j < j1)
	//* 111  215:iload_1         
	//* 112  216:iload           6
	//* 113  218:icmpge          224
							return view;
	//  114  221:aload           8
	//  115  223:areturn         
						if(j != j1)
	//* 116  224:iload_1         
	//* 117  225:iload           6
	//* 118  227:icmpne          274
							break label1;
	//  119  230:goto            269
					} else
					{
						j = mPrimaryOrientation.getDecoratedStart(view);
	//  120  233:aload_0         
	//  121  234:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//  122  237:aload           8
	//  123  239:invokevirtual   #609 <Method int OrientationHelper.getDecoratedStart(View)>
	//  124  242:istore_1        
						int k1 = mPrimaryOrientation.getDecoratedStart(((View) (obj)));
	//  125  243:aload_0         
	//  126  244:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//  127  247:aload           10
	//  128  249:invokevirtual   #609 <Method int OrientationHelper.getDecoratedStart(View)>
	//  129  252:istore          6
						if(j > k1)
	//* 130  254:iload_1         
	//* 131  255:iload           6
	//* 132  257:icmple          263
							return view;
	//  133  260:aload           8
	//  134  262:areturn         
						if(j != k1)
							break label1;
	//  135  263:iload_1         
	//  136  264:iload           6
	//  137  266:icmpne          274
					}
					j = 1;
	//  138  269:iconst_1        
	//  139  270:istore_1        
					break label0;
	//  140  271:goto            276
				}
				j = 0;
	//  141  274:iconst_0        
	//  142  275:istore_1        
			}
			if(!j)
				continue;
	//  143  276:iload_1         
	//  144  277:ifeq            339
			obj = ((Object) ((LayoutParams)((View) (obj)).getLayoutParams()));
	//  145  280:aload           10
	//  146  282:invokevirtual   #401 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  147  285:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//  148  288:astore          10
			if(layoutparams.mSpan.mIndex - ((LayoutParams) (obj)).mSpan.mIndex < 0)
	//* 149  290:aload           9
	//* 150  292:getfield        #245 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//* 151  295:getfield        #649 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//* 152  298:aload           10
	//* 153  300:getfield        #245 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//* 154  303:getfield        #649 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//* 155  306:isub            
	//* 156  307:ifge            315
				j = 1;
	//  157  310:iconst_1        
	//  158  311:istore_1        
			else
	//* 159  312:goto            317
				j = 0;
	//  160  315:iconst_0        
	//  161  316:istore_1        
			boolean flag;
			if(k < 0)
	//* 162  317:iload_2         
	//* 163  318:ifge            327
				flag = true;
	//  164  321:iconst_1        
	//  165  322:istore          6
			else
	//* 166  324:goto            330
				flag = false;
	//  167  327:iconst_0        
	//  168  328:istore          6
			if(j != flag)
	//* 169  330:iload_1         
	//* 170  331:iload           6
	//* 171  333:icmpeq          339
				return view;
	//  172  336:aload           8
	//  173  338:areturn         
		}

	//  174  339:iload           4
	//  175  341:iload           5
	//  176  343:iadd            
	//  177  344:istore          4
	//* 178  346:goto            90
		return null;
	//  179  349:aconst_null     
	//  180  350:areturn         
	}

	public void invalidateSpanAssignments()
	{
		mLazySpanLookup.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//    2    4:invokevirtual   #505 <Method void StaggeredGridLayoutManager$LazySpanLookup.clear()>
		requestLayout();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #392 <Method void requestLayout()>
	//    5   11:return          
	}

	public boolean isAutoMeasureEnabled()
	{
		return mGapStrategy != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field int mGapStrategy>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	boolean isLayoutRTL()
	{
		return getLayoutDirection() == 1;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #866 <Method int getLayoutDirection()>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public void offsetChildrenHorizontal(int i)
	{
		super.offsetChildrenHorizontal(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #869 <Method void RecyclerView$LayoutManager.offsetChildrenHorizontal(int)>
		for(int j = 0; j < mSpanCount; j++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:aload_0         
	//*   7    9:getfield        #93  <Field int mSpanCount>
	//*   8   12:icmpge          32
			mSpans[j].onOffset(i);
	//    9   15:aload_0         
	//   10   16:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   11   19:iload_2         
	//   12   20:aaload          
	//   13   21:iload_1         
	//   14   22:invokevirtual   #872 <Method void StaggeredGridLayoutManager$Span.onOffset(int)>

	//   15   25:iload_2         
	//   16   26:iconst_1        
	//   17   27:iadd            
	//   18   28:istore_2        
	//*  19   29:goto            7
	//   20   32:return          
	}

	public void offsetChildrenVertical(int i)
	{
		super.offsetChildrenVertical(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #875 <Method void RecyclerView$LayoutManager.offsetChildrenVertical(int)>
		for(int j = 0; j < mSpanCount; j++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:aload_0         
	//*   7    9:getfield        #93  <Field int mSpanCount>
	//*   8   12:icmpge          32
			mSpans[j].onOffset(i);
	//    9   15:aload_0         
	//   10   16:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   11   19:iload_2         
	//   12   20:aaload          
	//   13   21:iload_1         
	//   14   22:invokevirtual   #872 <Method void StaggeredGridLayoutManager$Span.onOffset(int)>

	//   15   25:iload_2         
	//   16   26:iconst_1        
	//   17   27:iadd            
	//   18   28:istore_2        
	//*  19   29:goto            7
	//   20   32:return          
	}

	public void onDetachedFromWindow(RecyclerView recyclerview, RecyclerView.Recycler recycler)
	{
		super.onDetachedFromWindow(recyclerview, recycler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #879 <Method void RecyclerView$LayoutManager.onDetachedFromWindow(RecyclerView, RecyclerView$Recycler)>
		removeCallbacks(mCheckForGapsRunnable);
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:getfield        #123 <Field Runnable mCheckForGapsRunnable>
	//    7   11:invokevirtual   #570 <Method boolean removeCallbacks(Runnable)>
	//    8   14:pop             
		for(int i = 0; i < mSpanCount; i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_3        
	//*  11   17:iload_3         
	//*  12   18:aload_0         
	//*  13   19:getfield        #93  <Field int mSpanCount>
	//*  14   22:icmpge          41
			mSpans[i].clear();
	//   15   25:aload_0         
	//   16   26:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   17   29:iload_3         
	//   18   30:aaload          
	//   19   31:invokevirtual   #178 <Method void StaggeredGridLayoutManager$Span.clear()>

	//   20   34:iload_3         
	//   21   35:iconst_1        
	//   22   36:iadd            
	//   23   37:istore_3        
	//*  24   38:goto            17
		recyclerview.requestLayout();
	//   25   41:aload_1         
	//   26   42:invokevirtual   #882 <Method void RecyclerView.requestLayout()>
	//   27   45:return          
	}

	public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #256 <Method int getChildCount()>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		view = findContainingItemView(view);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #889 <Method View findContainingItemView(View)>
	//    8   14:astore_1        
		if(view == null)
	//*   9   15:aload_1         
	//*  10   16:ifnonnull       21
			return null;
	//   11   19:aconst_null     
	//   12   20:areturn         
		resolveShouldLayoutReverse();
	//   13   21:aload_0         
	//   14   22:invokespecial   #214 <Method void resolveShouldLayoutReverse()>
		int l1 = convertFocusDirectionToLayoutDirection(i);
	//   15   25:aload_0         
	//   16   26:iload_2         
	//   17   27:invokespecial   #891 <Method int convertFocusDirectionToLayoutDirection(int)>
	//   18   30:istore          7
		if(l1 == 0x80000000)
	//*  19   32:iload           7
	//*  20   34:ldc1            #43  <Int 0x80000000>
	//*  21   36:icmpne          41
			return null;
	//   22   39:aconst_null     
	//   23   40:areturn         
		Object obj = ((Object) ((LayoutParams)view.getLayoutParams()));
	//   24   41:aload_1         
	//   25   42:invokevirtual   #401 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   26   45:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//   27   48:astore          10
		boolean flag1 = ((LayoutParams) (obj)).mFullSpan;
	//   28   50:aload           10
	//   29   52:getfield        #239 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//   30   55:istore          8
		obj = ((Object) (((LayoutParams) (obj)).mSpan));
	//   31   57:aload           10
	//   32   59:getfield        #245 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//   33   62:astore          10
		if(l1 == 1)
	//*  34   64:iload           7
	//*  35   66:iconst_1        
	//*  36   67:icmpne          78
			i = getLastChildPosition();
	//   37   70:aload_0         
	//   38   71:invokevirtual   #380 <Method int getLastChildPosition()>
	//   39   74:istore_2        
		else
	//*  40   75:goto            83
			i = getFirstChildPosition();
	//   41   78:aload_0         
	//   42   79:invokevirtual   #259 <Method int getFirstChildPosition()>
	//   43   82:istore_2        
		updateLayoutState(i, state);
	//   44   83:aload_0         
	//   45   84:iload_2         
	//   46   85:aload           4
	//   47   87:invokespecial   #541 <Method void updateLayoutState(int, RecyclerView$State)>
		setLayoutStateDirection(l1);
	//   48   90:aload_0         
	//   49   91:iload           7
	//   50   93:invokespecial   #544 <Method void setLayoutStateDirection(int)>
		mLayoutState.mCurrentPosition = mLayoutState.mItemDirection + i;
	//   51   96:aload_0         
	//   52   97:getfield        #134 <Field LayoutState mLayoutState>
	//   53  100:aload_0         
	//   54  101:getfield        #134 <Field LayoutState mLayoutState>
	//   55  104:getfield        #549 <Field int LayoutState.mItemDirection>
	//   56  107:iload_2         
	//   57  108:iadd            
	//   58  109:putfield        #552 <Field int LayoutState.mCurrentPosition>
		mLayoutState.mAvailable = (int)(0.3333333F * (float)mPrimaryOrientation.getTotalSpace());
	//   59  112:aload_0         
	//   60  113:getfield        #134 <Field LayoutState mLayoutState>
	//   61  116:ldc1            #46  <Float 0.3333333F>
	//   62  118:aload_0         
	//   63  119:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//   64  122:invokevirtual   #531 <Method int OrientationHelper.getTotalSpace()>
	//   65  125:i2f             
	//   66  126:fmul            
	//   67  127:f2i             
	//   68  128:putfield        #583 <Field int LayoutState.mAvailable>
		mLayoutState.mStopInFocusable = true;
	//   69  131:aload_0         
	//   70  132:getfield        #134 <Field LayoutState mLayoutState>
	//   71  135:iconst_1        
	//   72  136:putfield        #684 <Field boolean LayoutState.mStopInFocusable>
		LayoutState layoutstate = mLayoutState;
	//   73  139:aload_0         
	//   74  140:getfield        #134 <Field LayoutState mLayoutState>
	//   75  143:astore          11
		boolean flag = false;
	//   76  145:iconst_0        
	//   77  146:istore          6
		layoutstate.mRecycle = false;
	//   78  148:aload           11
	//   79  150:iconst_0        
	//   80  151:putfield        #528 <Field boolean LayoutState.mRecycle>
		fill(recycler, mLayoutState, state);
	//   81  154:aload_0         
	//   82  155:aload_3         
	//   83  156:aload_0         
	//   84  157:getfield        #134 <Field LayoutState mLayoutState>
	//   85  160:aload           4
	//   86  162:invokespecial   #546 <Method int fill(RecyclerView$Recycler, LayoutState, RecyclerView$State)>
	//   87  165:pop             
		mLastLayoutFromEnd = mShouldReverseLayout;
	//   88  166:aload_0         
	//   89  167:aload_0         
	//   90  168:getfield        #97  <Field boolean mShouldReverseLayout>
	//   91  171:putfield        #504 <Field boolean mLastLayoutFromEnd>
		if(!flag1)
	//*  92  174:iload           8
	//*  93  176:ifne            199
		{
			recycler = ((RecyclerView.Recycler) (((Span) (obj)).getFocusableViewAfter(i, l1)));
	//   94  179:aload           10
	//   95  181:iload_2         
	//   96  182:iload           7
	//   97  184:invokevirtual   #895 <Method View StaggeredGridLayoutManager$Span.getFocusableViewAfter(int, int)>
	//   98  187:astore_3        
			if(recycler != null && recycler != view)
	//*  99  188:aload_3         
	//* 100  189:ifnull          199
	//* 101  192:aload_3         
	//* 102  193:aload_1         
	//* 103  194:if_acmpeq       199
				return ((View) (recycler));
	//  104  197:aload_3         
	//  105  198:areturn         
		}
		if(preferLastSpan(l1))
	//* 106  199:aload_0         
	//* 107  200:iload           7
	//* 108  202:invokespecial   #375 <Method boolean preferLastSpan(int)>
	//* 109  205:ifeq            255
		{
			for(int j = mSpanCount - 1; j >= 0; j--)
	//* 110  208:aload_0         
	//* 111  209:getfield        #93  <Field int mSpanCount>
	//* 112  212:iconst_1        
	//* 113  213:isub            
	//* 114  214:istore          5
	//* 115  216:iload           5
	//* 116  218:iflt            301
			{
				recycler = ((RecyclerView.Recycler) (mSpans[j].getFocusableViewAfter(i, l1)));
	//  117  221:aload_0         
	//  118  222:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  119  225:iload           5
	//  120  227:aaload          
	//  121  228:iload_2         
	//  122  229:iload           7
	//  123  231:invokevirtual   #895 <Method View StaggeredGridLayoutManager$Span.getFocusableViewAfter(int, int)>
	//  124  234:astore_3        
				if(recycler != null && recycler != view)
	//* 125  235:aload_3         
	//* 126  236:ifnull          246
	//* 127  239:aload_3         
	//* 128  240:aload_1         
	//* 129  241:if_acmpeq       246
					return ((View) (recycler));
	//  130  244:aload_3         
	//  131  245:areturn         
			}

	//  132  246:iload           5
	//  133  248:iconst_1        
	//  134  249:isub            
	//  135  250:istore          5
		} else
	//* 136  252:goto            216
		{
			for(int k = 0; k < mSpanCount; k++)
	//* 137  255:iconst_0        
	//* 138  256:istore          5
	//* 139  258:iload           5
	//* 140  260:aload_0         
	//* 141  261:getfield        #93  <Field int mSpanCount>
	//* 142  264:icmpge          301
			{
				recycler = ((RecyclerView.Recycler) (mSpans[k].getFocusableViewAfter(i, l1)));
	//  143  267:aload_0         
	//  144  268:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  145  271:iload           5
	//  146  273:aaload          
	//  147  274:iload_2         
	//  148  275:iload           7
	//  149  277:invokevirtual   #895 <Method View StaggeredGridLayoutManager$Span.getFocusableViewAfter(int, int)>
	//  150  280:astore_3        
				if(recycler != null && recycler != view)
	//* 151  281:aload_3         
	//* 152  282:ifnull          292
	//* 153  285:aload_3         
	//* 154  286:aload_1         
	//* 155  287:if_acmpeq       292
					return ((View) (recycler));
	//  156  290:aload_3         
	//  157  291:areturn         
			}

	//  158  292:iload           5
	//  159  294:iconst_1        
	//  160  295:iadd            
	//  161  296:istore          5
		}
	//* 162  298:goto            258
		boolean flag2 = mReverseLayout;
	//  163  301:aload_0         
	//  164  302:getfield        #95  <Field boolean mReverseLayout>
	//  165  305:istore          9
		if(l1 == -1)
	//* 166  307:iload           7
	//* 167  309:iconst_m1       
	//* 168  310:icmpne          318
			i = 1;
	//  169  313:iconst_1        
	//  170  314:istore_2        
		else
	//* 171  315:goto            320
			i = 0;
	//  172  318:iconst_0        
	//  173  319:istore_2        
		if((flag2 ^ true) == i)
	//* 174  320:iload           9
	//* 175  322:iconst_1        
	//* 176  323:ixor            
	//* 177  324:iload_2         
	//* 178  325:icmpne          333
			i = 1;
	//  179  328:iconst_1        
	//  180  329:istore_2        
		else
	//* 181  330:goto            335
			i = 0;
	//  182  333:iconst_0        
	//  183  334:istore_2        
		if(!flag1)
	//* 184  335:iload           8
	//* 185  337:ifne            379
		{
			int l;
			if(i != 0)
	//* 186  340:iload_2         
	//* 187  341:ifeq            354
				l = ((Span) (obj)).findFirstPartiallyVisibleItemPosition();
	//  188  344:aload           10
	//  189  346:invokevirtual   #898 <Method int StaggeredGridLayoutManager$Span.findFirstPartiallyVisibleItemPosition()>
	//  190  349:istore          5
			else
	//* 191  351:goto            361
				l = ((Span) (obj)).findLastPartiallyVisibleItemPosition();
	//  192  354:aload           10
	//  193  356:invokevirtual   #901 <Method int StaggeredGridLayoutManager$Span.findLastPartiallyVisibleItemPosition()>
	//  194  359:istore          5
			recycler = ((RecyclerView.Recycler) (findViewByPosition(l)));
	//  195  361:aload_0         
	//  196  362:iload           5
	//  197  364:invokevirtual   #904 <Method View findViewByPosition(int)>
	//  198  367:astore_3        
			if(recycler != null && recycler != view)
	//* 199  368:aload_3         
	//* 200  369:ifnull          379
	//* 201  372:aload_3         
	//* 202  373:aload_1         
	//* 203  374:if_acmpeq       379
				return ((View) (recycler));
	//  204  377:aload_3         
	//  205  378:areturn         
		}
		int i1 = ((int) (flag));
	//  206  379:iload           6
	//  207  381:istore          5
		if(preferLastSpan(l1))
	//* 208  383:aload_0         
	//* 209  384:iload           7
	//* 210  386:invokespecial   #375 <Method boolean preferLastSpan(int)>
	//* 211  389:ifeq            476
			for(i1 = mSpanCount - 1; i1 >= 0; i1--)
	//* 212  392:aload_0         
	//* 213  393:getfield        #93  <Field int mSpanCount>
	//* 214  396:iconst_1        
	//* 215  397:isub            
	//* 216  398:istore          5
	//* 217  400:iload           5
	//* 218  402:iflt            543
				if(i1 != ((Span) (obj)).mIndex)
	//* 219  405:iload           5
	//* 220  407:aload           10
	//* 221  409:getfield        #649 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//* 222  412:icmpne          418
	//* 223  415:goto            467
				{
					int j1;
					if(i != 0)
	//* 224  418:iload_2         
	//* 225  419:ifeq            437
						j1 = mSpans[i1].findFirstPartiallyVisibleItemPosition();
	//  226  422:aload_0         
	//  227  423:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  228  426:iload           5
	//  229  428:aaload          
	//  230  429:invokevirtual   #898 <Method int StaggeredGridLayoutManager$Span.findFirstPartiallyVisibleItemPosition()>
	//  231  432:istore          6
					else
	//* 232  434:goto            449
						j1 = mSpans[i1].findLastPartiallyVisibleItemPosition();
	//  233  437:aload_0         
	//  234  438:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  235  441:iload           5
	//  236  443:aaload          
	//  237  444:invokevirtual   #901 <Method int StaggeredGridLayoutManager$Span.findLastPartiallyVisibleItemPosition()>
	//  238  447:istore          6
					recycler = ((RecyclerView.Recycler) (findViewByPosition(j1)));
	//  239  449:aload_0         
	//  240  450:iload           6
	//  241  452:invokevirtual   #904 <Method View findViewByPosition(int)>
	//  242  455:astore_3        
					if(recycler != null && recycler != view)
	//* 243  456:aload_3         
	//* 244  457:ifnull          467
	//* 245  460:aload_3         
	//* 246  461:aload_1         
	//* 247  462:if_acmpeq       467
						return ((View) (recycler));
	//  248  465:aload_3         
	//  249  466:areturn         
				}

	//  250  467:iload           5
	//  251  469:iconst_1        
	//  252  470:isub            
	//  253  471:istore          5
		else
	//* 254  473:goto            400
			for(; i1 < mSpanCount; i1++)
	//* 255  476:iload           5
	//* 256  478:aload_0         
	//* 257  479:getfield        #93  <Field int mSpanCount>
	//* 258  482:icmpge          543
			{
				int k1;
				if(i != 0)
	//* 259  485:iload_2         
	//* 260  486:ifeq            504
					k1 = mSpans[i1].findFirstPartiallyVisibleItemPosition();
	//  261  489:aload_0         
	//  262  490:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  263  493:iload           5
	//  264  495:aaload          
	//  265  496:invokevirtual   #898 <Method int StaggeredGridLayoutManager$Span.findFirstPartiallyVisibleItemPosition()>
	//  266  499:istore          6
				else
	//* 267  501:goto            516
					k1 = mSpans[i1].findLastPartiallyVisibleItemPosition();
	//  268  504:aload_0         
	//  269  505:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  270  508:iload           5
	//  271  510:aaload          
	//  272  511:invokevirtual   #901 <Method int StaggeredGridLayoutManager$Span.findLastPartiallyVisibleItemPosition()>
	//  273  514:istore          6
				recycler = ((RecyclerView.Recycler) (findViewByPosition(k1)));
	//  274  516:aload_0         
	//  275  517:iload           6
	//  276  519:invokevirtual   #904 <Method View findViewByPosition(int)>
	//  277  522:astore_3        
				if(recycler != null && recycler != view)
	//* 278  523:aload_3         
	//* 279  524:ifnull          534
	//* 280  527:aload_3         
	//* 281  528:aload_1         
	//* 282  529:if_acmpeq       534
					return ((View) (recycler));
	//  283  532:aload_3         
	//  284  533:areturn         
			}

	//  285  534:iload           5
	//  286  536:iconst_1        
	//  287  537:iadd            
	//  288  538:istore          5
	//* 289  540:goto            476
		return null;
	//  290  543:aconst_null     
	//  291  544:areturn         
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #908 <Method void RecyclerView$LayoutManager.onInitializeAccessibilityEvent(AccessibilityEvent)>
		if(getChildCount() > 0)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #256 <Method int getChildCount()>
	//*   5    9:ifle            79
		{
			View view = findFirstVisibleItemClosestToStart(false);
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #292 <Method View findFirstVisibleItemClosestToStart(boolean)>
	//    9   17:astore          4
			View view1 = findFirstVisibleItemClosestToEnd(false);
	//   10   19:aload_0         
	//   11   20:iconst_0        
	//   12   21:invokevirtual   #295 <Method View findFirstVisibleItemClosestToEnd(boolean)>
	//   13   24:astore          5
			if(view != null)
	//*  14   26:aload           4
	//*  15   28:ifnull          78
			{
				if(view1 == null)
	//*  16   31:aload           5
	//*  17   33:ifnonnull       37
					return;
	//   18   36:return          
				int i = getPosition(view);
	//   19   37:aload_0         
	//   20   38:aload           4
	//   21   40:invokevirtual   #349 <Method int getPosition(View)>
	//   22   43:istore_2        
				int j = getPosition(view1);
	//   23   44:aload_0         
	//   24   45:aload           5
	//   25   47:invokevirtual   #349 <Method int getPosition(View)>
	//   26   50:istore_3        
				if(i < j)
	//*  27   51:iload_2         
	//*  28   52:iload_3         
	//*  29   53:icmpge          67
				{
					accessibilityevent.setFromIndex(i);
	//   30   56:aload_1         
	//   31   57:iload_2         
	//   32   58:invokevirtual   #913 <Method void AccessibilityEvent.setFromIndex(int)>
					accessibilityevent.setToIndex(j);
	//   33   61:aload_1         
	//   34   62:iload_3         
	//   35   63:invokevirtual   #916 <Method void AccessibilityEvent.setToIndex(int)>
					return;
	//   36   66:return          
				} else
				{
					accessibilityevent.setFromIndex(j);
	//   37   67:aload_1         
	//   38   68:iload_3         
	//   39   69:invokevirtual   #913 <Method void AccessibilityEvent.setFromIndex(int)>
					accessibilityevent.setToIndex(i);
	//   40   72:aload_1         
	//   41   73:iload_2         
	//   42   74:invokevirtual   #916 <Method void AccessibilityEvent.setToIndex(int)>
					return;
	//   43   77:return          
				}
			} else
			{
				return;
	//   44   78:return          
			}
		} else
		{
			return;
	//   45   79:return          
		}
	}

	public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		recycler = ((RecyclerView.Recycler) (view.getLayoutParams()));
	//    0    0:aload_3         
	//    1    1:invokevirtual   #401 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore_1        
		if(!(recycler instanceof LayoutParams))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//*   5    9:ifne            20
		{
			super.onInitializeAccessibilityNodeInfoForItem(view, accessibilitynodeinfocompat);
	//    6   12:aload_0         
	//    7   13:aload_3         
	//    8   14:aload           4
	//    9   16:invokespecial   #921 <Method void RecyclerView$LayoutManager.onInitializeAccessibilityNodeInfoForItem(View, AccessibilityNodeInfoCompat)>
			return;
	//   10   19:return          
		}
		recycler = ((RecyclerView.Recycler) ((LayoutParams)recycler));
	//   11   20:aload_1         
	//   12   21:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//   13   24:astore_1        
		int k = mOrientation;
	//   14   25:aload_0         
	//   15   26:getfield        #125 <Field int mOrientation>
	//   16   29:istore          7
		int j = 1;
	//   17   31:iconst_1        
	//   18   32:istore          6
		int i = 1;
	//   19   34:iconst_1        
	//   20   35:istore          5
		if(k == 0)
	//*  21   37:iload           7
	//*  22   39:ifne            81
		{
			j = ((LayoutParams) (recycler)).getSpanIndex();
	//   23   42:aload_1         
	//   24   43:invokevirtual   #924 <Method int StaggeredGridLayoutManager$LayoutParams.getSpanIndex()>
	//   25   46:istore          6
			if(((LayoutParams) (recycler)).mFullSpan)
	//*  26   48:aload_1         
	//*  27   49:getfield        #239 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*  28   52:ifeq            61
				i = mSpanCount;
	//   29   55:aload_0         
	//   30   56:getfield        #93  <Field int mSpanCount>
	//   31   59:istore          5
			accessibilitynodeinfocompat.setCollectionItemInfo(((Object) (android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(j, i, -1, -1, ((LayoutParams) (recycler)).mFullSpan, false))));
	//   32   61:aload           4
	//   33   63:iload           6
	//   34   65:iload           5
	//   35   67:iconst_m1       
	//   36   68:iconst_m1       
	//   37   69:aload_1         
	//   38   70:getfield        #239 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//   39   73:iconst_0        
	//   40   74:invokestatic    #930 <Method android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat.obtain(int, int, int, int, boolean, boolean)>
	//   41   77:invokevirtual   #936 <Method void AccessibilityNodeInfoCompat.setCollectionItemInfo(Object)>
			return;
	//   42   80:return          
		}
		k = ((LayoutParams) (recycler)).getSpanIndex();
	//   43   81:aload_1         
	//   44   82:invokevirtual   #924 <Method int StaggeredGridLayoutManager$LayoutParams.getSpanIndex()>
	//   45   85:istore          7
		i = j;
	//   46   87:iload           6
	//   47   89:istore          5
		if(((LayoutParams) (recycler)).mFullSpan)
	//*  48   91:aload_1         
	//*  49   92:getfield        #239 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*  50   95:ifeq            104
			i = mSpanCount;
	//   51   98:aload_0         
	//   52   99:getfield        #93  <Field int mSpanCount>
	//   53  102:istore          5
		accessibilitynodeinfocompat.setCollectionItemInfo(((Object) (android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(-1, -1, k, i, ((LayoutParams) (recycler)).mFullSpan, false))));
	//   54  104:aload           4
	//   55  106:iconst_m1       
	//   56  107:iconst_m1       
	//   57  108:iload           7
	//   58  110:iload           5
	//   59  112:aload_1         
	//   60  113:getfield        #239 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//   61  116:iconst_0        
	//   62  117:invokestatic    #930 <Method android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat.obtain(int, int, int, int, boolean, boolean)>
	//   63  120:invokevirtual   #936 <Method void AccessibilityNodeInfoCompat.setCollectionItemInfo(Object)>
	//   64  123:return          
	}

	public void onItemsAdded(RecyclerView recyclerview, int i, int j)
	{
		handleUpdate(i, j, 1);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #940 <Method void handleUpdate(int, int, int)>
	//    5    7:return          
	}

	public void onItemsChanged(RecyclerView recyclerview)
	{
		mLazySpanLookup.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//    2    4:invokevirtual   #505 <Method void StaggeredGridLayoutManager$LazySpanLookup.clear()>
		requestLayout();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #392 <Method void requestLayout()>
	//    5   11:return          
	}

	public void onItemsMoved(RecyclerView recyclerview, int i, int j, int k)
	{
		handleUpdate(i, j, 8);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:bipush          8
	//    4    5:invokespecial   #940 <Method void handleUpdate(int, int, int)>
	//    5    8:return          
	}

	public void onItemsRemoved(RecyclerView recyclerview, int i, int j)
	{
		handleUpdate(i, j, 2);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iconst_2        
	//    4    4:invokespecial   #940 <Method void handleUpdate(int, int, int)>
	//    5    7:return          
	}

	public void onItemsUpdated(RecyclerView recyclerview, int i, int j, Object obj)
	{
		handleUpdate(i, j, 4);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iconst_4        
	//    4    4:invokespecial   #940 <Method void handleUpdate(int, int, int)>
	//    5    7:return          
	}

	public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		onLayoutChildren(recycler, state, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #575 <Method void onLayoutChildren(RecyclerView$Recycler, RecyclerView$State, boolean)>
	//    5    7:return          
	}

	public void onLayoutCompleted(RecyclerView.State state)
	{
		super.onLayoutCompleted(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #952 <Method void RecyclerView$LayoutManager.onLayoutCompleted(RecyclerView$State)>
		mPendingScrollPosition = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #99  <Field int mPendingScrollPosition>
		mPendingScrollPositionOffset = 0x80000000;
	//    6   10:aload_0         
	//    7   11:ldc1            #43  <Int 0x80000000>
	//    8   13:putfield        #101 <Field int mPendingScrollPositionOffset>
		mPendingSavedState = null;
	//    9   16:aload_0         
	//   10   17:aconst_null     
	//   11   18:putfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
		mAnchorInfo.reset();
	//   12   21:aload_0         
	//   13   22:getfield        #116 <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
	//   14   25:invokevirtual   #493 <Method void StaggeredGridLayoutManager$AnchorInfo.reset()>
	//   15   28:return          
	}

	public void onRestoreInstanceState(Parcelable parcelable)
	{
		if(parcelable instanceof SavedState)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #24  <Class StaggeredGridLayoutManager$SavedState>
	//*   2    4:ifeq            19
		{
			mPendingSavedState = (SavedState)parcelable;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #24  <Class StaggeredGridLayoutManager$SavedState>
	//    6   12:putfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
			requestLayout();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #392 <Method void requestLayout()>
		}
	//    9   19:return          
	}

	public Parcelable onSaveInstanceState()
	{
		if(mPendingSavedState != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*   2    4:ifnull          19
			return ((Parcelable) (new SavedState(mPendingSavedState)));
	//    3    7:new             #24  <Class StaggeredGridLayoutManager$SavedState>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//    7   15:invokespecial   #959 <Method void StaggeredGridLayoutManager$SavedState(StaggeredGridLayoutManager$SavedState)>
	//    8   18:areturn         
		SavedState savedstate = new SavedState();
	//    9   19:new             #24  <Class StaggeredGridLayoutManager$SavedState>
	//   10   22:dup             
	//   11   23:invokespecial   #960 <Method void StaggeredGridLayoutManager$SavedState()>
	//   12   26:astore          4
		savedstate.mReverseLayout = mReverseLayout;
	//   13   28:aload           4
	//   14   30:aload_0         
	//   15   31:getfield        #95  <Field boolean mReverseLayout>
	//   16   34:putfield        #211 <Field boolean StaggeredGridLayoutManager$SavedState.mReverseLayout>
		savedstate.mAnchorLayoutFromEnd = mLastLayoutFromEnd;
	//   17   37:aload           4
	//   18   39:aload_0         
	//   19   40:getfield        #504 <Field boolean mLastLayoutFromEnd>
	//   20   43:putfield        #184 <Field boolean StaggeredGridLayoutManager$SavedState.mAnchorLayoutFromEnd>
		savedstate.mLastLayoutRTL = mLastLayoutRTL;
	//   21   46:aload           4
	//   22   48:aload_0         
	//   23   49:getfield        #210 <Field boolean mLastLayoutRTL>
	//   24   52:putfield        #209 <Field boolean StaggeredGridLayoutManager$SavedState.mLastLayoutRTL>
		LazySpanLookup lazyspanlookup = mLazySpanLookup;
	//   25   55:aload_0         
	//   26   56:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   27   59:astore          5
		int k = 0;
	//   28   61:iconst_0        
	//   29   62:istore_2        
		if(lazyspanlookup != null && mLazySpanLookup.mData != null)
	//*  30   63:aload           5
	//*  31   65:ifnull          116
	//*  32   68:aload_0         
	//*  33   69:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//*  34   72:getfield        #226 <Field int[] StaggeredGridLayoutManager$LazySpanLookup.mData>
	//*  35   75:ifnull          116
		{
			savedstate.mSpanLookup = mLazySpanLookup.mData;
	//   36   78:aload           4
	//   37   80:aload_0         
	//   38   81:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   39   84:getfield        #226 <Field int[] StaggeredGridLayoutManager$LazySpanLookup.mData>
	//   40   87:putfield        #223 <Field int[] StaggeredGridLayoutManager$SavedState.mSpanLookup>
			savedstate.mSpanLookupSize = savedstate.mSpanLookup.length;
	//   41   90:aload           4
	//   42   92:aload           4
	//   43   94:getfield        #223 <Field int[] StaggeredGridLayoutManager$SavedState.mSpanLookup>
	//   44   97:arraylength     
	//   45   98:putfield        #220 <Field int StaggeredGridLayoutManager$SavedState.mSpanLookupSize>
			savedstate.mFullSpanItems = mLazySpanLookup.mFullSpanItems;
	//   46  101:aload           4
	//   47  103:aload_0         
	//   48  104:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   49  107:getfield        #231 <Field List StaggeredGridLayoutManager$LazySpanLookup.mFullSpanItems>
	//   50  110:putfield        #230 <Field List StaggeredGridLayoutManager$SavedState.mFullSpanItems>
		} else
	//*  51  113:goto            122
		{
			savedstate.mSpanLookupSize = 0;
	//   52  116:aload           4
	//   53  118:iconst_0        
	//   54  119:putfield        #220 <Field int StaggeredGridLayoutManager$SavedState.mSpanLookupSize>
		}
		if(getChildCount() > 0)
	//*  55  122:aload_0         
	//*  56  123:invokevirtual   #256 <Method int getChildCount()>
	//*  57  126:ifle            277
		{
			int i;
			if(mLastLayoutFromEnd)
	//*  58  129:aload_0         
	//*  59  130:getfield        #504 <Field boolean mLastLayoutFromEnd>
	//*  60  133:ifeq            144
				i = getLastChildPosition();
	//   61  136:aload_0         
	//   62  137:invokevirtual   #380 <Method int getLastChildPosition()>
	//   63  140:istore_1        
			else
	//*  64  141:goto            149
				i = getFirstChildPosition();
	//   65  144:aload_0         
	//   66  145:invokevirtual   #259 <Method int getFirstChildPosition()>
	//   67  148:istore_1        
			savedstate.mAnchorPosition = i;
	//   68  149:aload           4
	//   69  151:iload_1         
	//   70  152:putfield        #207 <Field int StaggeredGridLayoutManager$SavedState.mAnchorPosition>
			savedstate.mVisibleAnchorPosition = findFirstVisibleItemPositionInt();
	//   71  155:aload           4
	//   72  157:aload_0         
	//   73  158:invokevirtual   #962 <Method int findFirstVisibleItemPositionInt()>
	//   74  161:putfield        #204 <Field int StaggeredGridLayoutManager$SavedState.mVisibleAnchorPosition>
			savedstate.mSpanOffsetsSize = mSpanCount;
	//   75  164:aload           4
	//   76  166:aload_0         
	//   77  167:getfield        #93  <Field int mSpanCount>
	//   78  170:putfield        #175 <Field int StaggeredGridLayoutManager$SavedState.mSpanOffsetsSize>
			savedstate.mSpanOffsets = new int[mSpanCount];
	//   79  173:aload           4
	//   80  175:aload_0         
	//   81  176:getfield        #93  <Field int mSpanCount>
	//   82  179:newarray        int[]
	//   83  181:putfield        #181 <Field int[] StaggeredGridLayoutManager$SavedState.mSpanOffsets>
			for(; k < mSpanCount; k++)
	//*  84  184:iload_2         
	//*  85  185:aload_0         
	//*  86  186:getfield        #93  <Field int mSpanCount>
	//*  87  189:icmpge          295
			{
				int j;
				if(mLastLayoutFromEnd)
	//*  88  192:aload_0         
	//*  89  193:getfield        #504 <Field boolean mLastLayoutFromEnd>
	//*  90  196:ifeq            232
				{
					int l = mSpans[k].getEndLine(0x80000000);
	//   91  199:aload_0         
	//   92  200:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   93  203:iload_2         
	//   94  204:aaload          
	//   95  205:ldc1            #43  <Int 0x80000000>
	//   96  207:invokevirtual   #320 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
	//   97  210:istore_3        
					j = l;
	//   98  211:iload_3         
	//   99  212:istore_1        
					if(l != 0x80000000)
	//* 100  213:iload_3         
	//* 101  214:ldc1            #43  <Int 0x80000000>
	//* 102  216:icmpeq          262
						j = l - mPrimaryOrientation.getEndAfterPadding();
	//  103  219:iload_3         
	//  104  220:aload_0         
	//  105  221:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//  106  224:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//  107  227:isub            
	//  108  228:istore_1        
				} else
	//* 109  229:goto            262
				{
					int i1 = mSpans[k].getStartLine(0x80000000);
	//  110  232:aload_0         
	//  111  233:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  112  236:iload_2         
	//  113  237:aaload          
	//  114  238:ldc1            #43  <Int 0x80000000>
	//  115  240:invokevirtual   #323 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
	//  116  243:istore_3        
					j = i1;
	//  117  244:iload_3         
	//  118  245:istore_1        
					if(i1 != 0x80000000)
	//* 119  246:iload_3         
	//* 120  247:ldc1            #43  <Int 0x80000000>
	//* 121  249:icmpeq          262
						j = i1 - mPrimaryOrientation.getStartAfterPadding();
	//  122  252:iload_3         
	//  123  253:aload_0         
	//  124  254:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//  125  257:invokevirtual   #195 <Method int OrientationHelper.getStartAfterPadding()>
	//  126  260:isub            
	//  127  261:istore_1        
				}
				savedstate.mSpanOffsets[k] = j;
	//  128  262:aload           4
	//  129  264:getfield        #181 <Field int[] StaggeredGridLayoutManager$SavedState.mSpanOffsets>
	//  130  267:iload_2         
	//  131  268:iload_1         
	//  132  269:iastore         
			}

	//  133  270:iload_2         
	//  134  271:iconst_1        
	//  135  272:iadd            
	//  136  273:istore_2        
		} else
	//* 137  274:goto            184
		{
			savedstate.mAnchorPosition = -1;
	//  138  277:aload           4
	//  139  279:iconst_m1       
	//  140  280:putfield        #207 <Field int StaggeredGridLayoutManager$SavedState.mAnchorPosition>
			savedstate.mVisibleAnchorPosition = -1;
	//  141  283:aload           4
	//  142  285:iconst_m1       
	//  143  286:putfield        #204 <Field int StaggeredGridLayoutManager$SavedState.mVisibleAnchorPosition>
			savedstate.mSpanOffsetsSize = 0;
	//  144  289:aload           4
	//  145  291:iconst_0        
	//  146  292:putfield        #175 <Field int StaggeredGridLayoutManager$SavedState.mSpanOffsetsSize>
		}
		return ((Parcelable) (savedstate));
	//  147  295:aload           4
	//  148  297:areturn         
	}

	public void onScrollStateChanged(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            9
			checkForGaps();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #573 <Method boolean checkForGaps()>
	//    4    8:pop             
	//    5    9:return          
	}

	void prepareLayoutStateForDelta(int i, RecyclerView.State state)
	{
		int j;
		byte byte0;
		if(i > 0)
	//*   0    0:iload_1         
	//*   1    1:ifle            15
		{
			j = getLastChildPosition();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #380 <Method int getLastChildPosition()>
	//    4    8:istore_3        
			byte0 = 1;
	//    5    9:iconst_1        
	//    6   10:istore          4
		} else
	//*   7   12:goto            23
		{
			j = getFirstChildPosition();
	//    8   15:aload_0         
	//    9   16:invokevirtual   #259 <Method int getFirstChildPosition()>
	//   10   19:istore_3        
			byte0 = -1;
	//   11   20:iconst_m1       
	//   12   21:istore          4
		}
		mLayoutState.mRecycle = true;
	//   13   23:aload_0         
	//   14   24:getfield        #134 <Field LayoutState mLayoutState>
	//   15   27:iconst_1        
	//   16   28:putfield        #528 <Field boolean LayoutState.mRecycle>
		updateLayoutState(j, state);
	//   17   31:aload_0         
	//   18   32:iload_3         
	//   19   33:aload_2         
	//   20   34:invokespecial   #541 <Method void updateLayoutState(int, RecyclerView$State)>
		setLayoutStateDirection(((int) (byte0)));
	//   21   37:aload_0         
	//   22   38:iload           4
	//   23   40:invokespecial   #544 <Method void setLayoutStateDirection(int)>
		mLayoutState.mCurrentPosition = j + mLayoutState.mItemDirection;
	//   24   43:aload_0         
	//   25   44:getfield        #134 <Field LayoutState mLayoutState>
	//   26   47:iload_3         
	//   27   48:aload_0         
	//   28   49:getfield        #134 <Field LayoutState mLayoutState>
	//   29   52:getfield        #549 <Field int LayoutState.mItemDirection>
	//   30   55:iadd            
	//   31   56:putfield        #552 <Field int LayoutState.mCurrentPosition>
		mLayoutState.mAvailable = Math.abs(i);
	//   32   59:aload_0         
	//   33   60:getfield        #134 <Field LayoutState mLayoutState>
	//   34   63:iload_1         
	//   35   64:invokestatic    #966 <Method int Math.abs(int)>
	//   36   67:putfield        #583 <Field int LayoutState.mAvailable>
	//   37   70:return          
	}

	int scrollBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(getChildCount() != 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #256 <Method int getChildCount()>
	//*   2    4:ifeq            96
		{
			if(i == 0)
	//*   3    7:iload_1         
	//*   4    8:ifne            13
				return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
			prepareLayoutStateForDelta(i, state);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:aload_3         
	//   10   16:invokevirtual   #739 <Method void prepareLayoutStateForDelta(int, RecyclerView$State)>
			int j = fill(recycler, mLayoutState, state);
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:aload_0         
	//   14   22:getfield        #134 <Field LayoutState mLayoutState>
	//   15   25:aload_3         
	//   16   26:invokespecial   #546 <Method int fill(RecyclerView$Recycler, LayoutState, RecyclerView$State)>
	//   17   29:istore          4
			if(mLayoutState.mAvailable >= j)
	//*  18   31:aload_0         
	//*  19   32:getfield        #134 <Field LayoutState mLayoutState>
	//*  20   35:getfield        #583 <Field int LayoutState.mAvailable>
	//*  21   38:iload           4
	//*  22   40:icmpge          46
	//*  23   43:goto            60
				if(i < 0)
	//*  24   46:iload_1         
	//*  25   47:ifge            57
					i = -j;
	//   26   50:iload           4
	//   27   52:ineg            
	//   28   53:istore_1        
				else
	//*  29   54:goto            60
					i = j;
	//   30   57:iload           4
	//   31   59:istore_1        
			mPrimaryOrientation.offsetChildren(-i);
	//   32   60:aload_0         
	//   33   61:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//   34   64:iload_1         
	//   35   65:ineg            
	//   36   66:invokevirtual   #362 <Method void OrientationHelper.offsetChildren(int)>
			mLastLayoutFromEnd = mShouldReverseLayout;
	//   37   69:aload_0         
	//   38   70:aload_0         
	//   39   71:getfield        #97  <Field boolean mShouldReverseLayout>
	//   40   74:putfield        #504 <Field boolean mLastLayoutFromEnd>
			mLayoutState.mAvailable = 0;
	//   41   77:aload_0         
	//   42   78:getfield        #134 <Field LayoutState mLayoutState>
	//   43   81:iconst_0        
	//   44   82:putfield        #583 <Field int LayoutState.mAvailable>
			recycle(recycler, mLayoutState);
	//   45   85:aload_0         
	//   46   86:aload_2         
	//   47   87:aload_0         
	//   48   88:getfield        #134 <Field LayoutState mLayoutState>
	//   49   91:invokespecial   #968 <Method void recycle(RecyclerView$Recycler, LayoutState)>
			return i;
	//   50   94:iload_1         
	//   51   95:ireturn         
		} else
		{
			return 0;
	//   52   96:iconst_0        
	//   53   97:ireturn         
		}
	}

	public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		return scrollBy(i, recycler, state);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #359 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//    5    7:ireturn         
	}

	public void scrollToPosition(int i)
	{
		if(mPendingSavedState != null && mPendingSavedState.mAnchorPosition != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*   2    4:ifnull          25
	//*   3    7:aload_0         
	//*   4    8:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*   5   11:getfield        #207 <Field int StaggeredGridLayoutManager$SavedState.mAnchorPosition>
	//*   6   14:iload_1         
	//*   7   15:icmpeq          25
			mPendingSavedState.invalidateAnchorPositionInfo();
	//    8   18:aload_0         
	//    9   19:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   10   22:invokevirtual   #973 <Method void StaggeredGridLayoutManager$SavedState.invalidateAnchorPositionInfo()>
		mPendingScrollPosition = i;
	//   11   25:aload_0         
	//   12   26:iload_1         
	//   13   27:putfield        #99  <Field int mPendingScrollPosition>
		mPendingScrollPositionOffset = 0x80000000;
	//   14   30:aload_0         
	//   15   31:ldc1            #43  <Int 0x80000000>
	//   16   33:putfield        #101 <Field int mPendingScrollPositionOffset>
		requestLayout();
	//   17   36:aload_0         
	//   18   37:invokevirtual   #392 <Method void requestLayout()>
	//   19   40:return          
	}

	public void scrollToPositionWithOffset(int i, int j)
	{
		if(mPendingSavedState != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*   2    4:ifnull          14
			mPendingSavedState.invalidateAnchorPositionInfo();
	//    3    7:aload_0         
	//    4    8:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//    5   11:invokevirtual   #973 <Method void StaggeredGridLayoutManager$SavedState.invalidateAnchorPositionInfo()>
		mPendingScrollPosition = i;
	//    6   14:aload_0         
	//    7   15:iload_1         
	//    8   16:putfield        #99  <Field int mPendingScrollPosition>
		mPendingScrollPositionOffset = j;
	//    9   19:aload_0         
	//   10   20:iload_2         
	//   11   21:putfield        #101 <Field int mPendingScrollPositionOffset>
		requestLayout();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #392 <Method void requestLayout()>
	//   14   28:return          
	}

	public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		return scrollBy(i, recycler, state);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #359 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//    5    7:ireturn         
	}

	public void setGapStrategy(int i)
	{
		assertNotInLayoutOrScroll(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #977 <Method void assertNotInLayoutOrScroll(String)>
		if(i == mGapStrategy)
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #106 <Field int mGapStrategy>
	//*   6   10:icmpne          14
			return;
	//    7   13:return          
		if(i != 0 && i != 2)
	//*   8   14:iload_1         
	//*   9   15:ifeq            34
	//*  10   18:iload_1         
	//*  11   19:iconst_2        
	//*  12   20:icmpeq          34
		{
			throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
	//   13   23:new             #800 <Class IllegalArgumentException>
	//   14   26:dup             
	//   15   27:ldc2            #979 <String "invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS">
	//   16   30:invokespecial   #805 <Method void IllegalArgumentException(String)>
	//   17   33:athrow          
		} else
		{
			mGapStrategy = i;
	//   18   34:aload_0         
	//   19   35:iload_1         
	//   20   36:putfield        #106 <Field int mGapStrategy>
			requestLayout();
	//   21   39:aload_0         
	//   22   40:invokevirtual   #392 <Method void requestLayout()>
			return;
	//   23   43:return          
		}
	}

	public void setMeasuredDimension(Rect rect, int i, int j)
	{
		int k = getPaddingLeft() + getPaddingRight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #472 <Method int getPaddingLeft()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #475 <Method int getPaddingRight()>
	//    4    8:iadd            
	//    5    9:istore          4
		int l = getPaddingTop() + getPaddingBottom();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #451 <Method int getPaddingTop()>
	//    8   15:aload_0         
	//    9   16:invokevirtual   #454 <Method int getPaddingBottom()>
	//   10   19:iadd            
	//   11   20:istore          5
		if(mOrientation == 1)
	//*  12   22:aload_0         
	//*  13   23:getfield        #125 <Field int mOrientation>
	//*  14   26:iconst_1        
	//*  15   27:icmpne          76
		{
			j = chooseSize(j, rect.height() + l, getMinimumHeight());
	//   16   30:iload_3         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #983 <Method int Rect.height()>
	//   19   35:iload           5
	//   20   37:iadd            
	//   21   38:aload_0         
	//   22   39:invokevirtual   #986 <Method int getMinimumHeight()>
	//   23   42:invokestatic    #989 <Method int chooseSize(int, int, int)>
	//   24   45:istore_3        
			k = chooseSize(i, mSizePerSpan * mSpanCount + k, getMinimumWidth());
	//   25   46:iload_2         
	//   26   47:aload_0         
	//   27   48:getfield        #480 <Field int mSizePerSpan>
	//   28   51:aload_0         
	//   29   52:getfield        #93  <Field int mSpanCount>
	//   30   55:imul            
	//   31   56:iload           4
	//   32   58:iadd            
	//   33   59:aload_0         
	//   34   60:invokevirtual   #992 <Method int getMinimumWidth()>
	//   35   63:invokestatic    #989 <Method int chooseSize(int, int, int)>
	//   36   66:istore          4
			i = j;
	//   37   68:iload_3         
	//   38   69:istore_2        
			j = k;
	//   39   70:iload           4
	//   40   72:istore_3        
		} else
	//*  41   73:goto            119
		{
			i = chooseSize(i, rect.width() + k, getMinimumWidth());
	//   42   76:iload_2         
	//   43   77:aload_1         
	//   44   78:invokevirtual   #994 <Method int Rect.width()>
	//   45   81:iload           4
	//   46   83:iadd            
	//   47   84:aload_0         
	//   48   85:invokevirtual   #992 <Method int getMinimumWidth()>
	//   49   88:invokestatic    #989 <Method int chooseSize(int, int, int)>
	//   50   91:istore_2        
			k = chooseSize(j, mSizePerSpan * mSpanCount + l, getMinimumHeight());
	//   51   92:iload_3         
	//   52   93:aload_0         
	//   53   94:getfield        #480 <Field int mSizePerSpan>
	//   54   97:aload_0         
	//   55   98:getfield        #93  <Field int mSpanCount>
	//   56  101:imul            
	//   57  102:iload           5
	//   58  104:iadd            
	//   59  105:aload_0         
	//   60  106:invokevirtual   #986 <Method int getMinimumHeight()>
	//   61  109:invokestatic    #989 <Method int chooseSize(int, int, int)>
	//   62  112:istore          4
			j = i;
	//   63  114:iload_2         
	//   64  115:istore_3        
			i = k;
	//   65  116:iload           4
	//   66  118:istore_2        
		}
		setMeasuredDimension(j, i);
	//   67  119:aload_0         
	//   68  120:iload_3         
	//   69  121:iload_2         
	//   70  122:invokevirtual   #996 <Method void setMeasuredDimension(int, int)>
	//   71  125:return          
	}

	public void setOrientation(int i)
	{
		if(i != 0 && i != 1)
	//*   0    0:iload_1         
	//*   1    1:ifeq            20
	//*   2    4:iload_1         
	//*   3    5:iconst_1        
	//*   4    6:icmpeq          20
			throw new IllegalArgumentException("invalid orientation.");
	//    5    9:new             #800 <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:ldc2            #998 <String "invalid orientation.">
	//    8   16:invokespecial   #805 <Method void IllegalArgumentException(String)>
	//    9   19:athrow          
		assertNotInLayoutOrScroll(((String) (null)));
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:invokevirtual   #977 <Method void assertNotInLayoutOrScroll(String)>
		if(i == mOrientation)
	//*  13   25:iload_1         
	//*  14   26:aload_0         
	//*  15   27:getfield        #125 <Field int mOrientation>
	//*  16   30:icmpne          34
		{
			return;
	//   17   33:return          
		} else
		{
			mOrientation = i;
	//   18   34:aload_0         
	//   19   35:iload_1         
	//   20   36:putfield        #125 <Field int mOrientation>
			OrientationHelper orientationhelper = mPrimaryOrientation;
	//   21   39:aload_0         
	//   22   40:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//   23   43:astore_2        
			mPrimaryOrientation = mSecondaryOrientation;
	//   24   44:aload_0         
	//   25   45:aload_0         
	//   26   46:getfield        #329 <Field OrientationHelper mSecondaryOrientation>
	//   27   49:putfield        #186 <Field OrientationHelper mPrimaryOrientation>
			mSecondaryOrientation = orientationhelper;
	//   28   52:aload_0         
	//   29   53:aload_2         
	//   30   54:putfield        #329 <Field OrientationHelper mSecondaryOrientation>
			requestLayout();
	//   31   57:aload_0         
	//   32   58:invokevirtual   #392 <Method void requestLayout()>
			return;
	//   33   61:return          
		}
	}

	public void setReverseLayout(boolean flag)
	{
		assertNotInLayoutOrScroll(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #977 <Method void assertNotInLayoutOrScroll(String)>
		if(mPendingSavedState != null && mPendingSavedState.mReverseLayout != flag)
	//*   3    5:aload_0         
	//*   4    6:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*   5    9:ifnull          31
	//*   6   12:aload_0         
	//*   7   13:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*   8   16:getfield        #211 <Field boolean StaggeredGridLayoutManager$SavedState.mReverseLayout>
	//*   9   19:iload_1         
	//*  10   20:icmpeq          31
			mPendingSavedState.mReverseLayout = flag;
	//   11   23:aload_0         
	//   12   24:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   13   27:iload_1         
	//   14   28:putfield        #211 <Field boolean StaggeredGridLayoutManager$SavedState.mReverseLayout>
		mReverseLayout = flag;
	//   15   31:aload_0         
	//   16   32:iload_1         
	//   17   33:putfield        #95  <Field boolean mReverseLayout>
		requestLayout();
	//   18   36:aload_0         
	//   19   37:invokevirtual   #392 <Method void requestLayout()>
	//   20   40:return          
	}

	public void setSpanCount(int i)
	{
		assertNotInLayoutOrScroll(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #977 <Method void assertNotInLayoutOrScroll(String)>
		if(i != mSpanCount)
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #93  <Field int mSpanCount>
	//*   6   10:icmpeq          84
		{
			invalidateSpanAssignments();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #1000 <Method void invalidateSpanAssignments()>
			mSpanCount = i;
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:putfield        #93  <Field int mSpanCount>
			mRemainingSpans = new BitSet(mSpanCount);
	//   12   22:aload_0         
	//   13   23:new             #691 <Class BitSet>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:getfield        #93  <Field int mSpanCount>
	//   17   31:invokespecial   #852 <Method void BitSet(int)>
	//   18   34:putfield        #689 <Field BitSet mRemainingSpans>
			mSpans = new Span[mSpanCount];
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:getfield        #93  <Field int mSpanCount>
	//   22   42:anewarray       Span[]
	//   23   45:putfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
			for(i = 0; i < mSpanCount; i++)
	//*  24   48:iconst_0        
	//*  25   49:istore_1        
	//*  26   50:iload_1         
	//*  27   51:aload_0         
	//*  28   52:getfield        #93  <Field int mSpanCount>
	//*  29   55:icmpge          80
				mSpans[i] = new Span(i);
	//   30   58:aload_0         
	//   31   59:getfield        #165 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   32   62:iload_1         
	//   33   63:new             #29  <Class StaggeredGridLayoutManager$Span>
	//   34   66:dup             
	//   35   67:aload_0         
	//   36   68:iload_1         
	//   37   69:invokespecial   #1003 <Method void StaggeredGridLayoutManager$Span(StaggeredGridLayoutManager, int)>
	//   38   72:aastore         

	//   39   73:iload_1         
	//   40   74:iconst_1        
	//   41   75:iadd            
	//   42   76:istore_1        
	//*  43   77:goto            50
			requestLayout();
	//   44   80:aload_0         
	//   45   81:invokevirtual   #392 <Method void requestLayout()>
		}
	//   46   84:return          
	}

	public void smoothScrollToPosition(RecyclerView recyclerview, RecyclerView.State state, int i)
	{
		recyclerview = ((RecyclerView) (new LinearSmoothScroller(recyclerview.getContext())));
	//    0    0:new             #1007 <Class LinearSmoothScroller>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1011 <Method Context RecyclerView.getContext()>
	//    4    8:invokespecial   #1014 <Method void LinearSmoothScroller(Context)>
	//    5   11:astore_1        
		((LinearSmoothScroller) (recyclerview)).setTargetPosition(i);
	//    6   12:aload_1         
	//    7   13:iload_3         
	//    8   14:invokevirtual   #1017 <Method void LinearSmoothScroller.setTargetPosition(int)>
		startSmoothScroll(((RecyclerView.SmoothScroller) (recyclerview)));
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #1021 <Method void startSmoothScroll(RecyclerView$SmoothScroller)>
	//   12   22:return          
	}

	public boolean supportsPredictiveItemAnimations()
	{
		return mPendingSavedState == null;
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//    2    4:ifnonnull       9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	boolean updateAnchorFromPendingData(RecyclerView.State state, AnchorInfo anchorinfo)
	{
		boolean flag1 = state.isPreLayout();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #562 <Method boolean RecyclerView$State.isPreLayout()>
	//    2    4:istore          5
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          4
		if(!flag1)
	//*   5    9:iload           5
	//*   6   11:ifne            390
		{
			if(mPendingScrollPosition == -1)
	//*   7   14:aload_0         
	//*   8   15:getfield        #99  <Field int mPendingScrollPosition>
	//*   9   18:iconst_m1       
	//*  10   19:icmpne          24
				return false;
	//   11   22:iconst_0        
	//   12   23:ireturn         
			if(mPendingScrollPosition >= 0 && mPendingScrollPosition < state.getItemCount())
	//*  13   24:aload_0         
	//*  14   25:getfield        #99  <Field int mPendingScrollPosition>
	//*  15   28:iflt            377
	//*  16   31:aload_0         
	//*  17   32:getfield        #99  <Field int mPendingScrollPosition>
	//*  18   35:aload_1         
	//*  19   36:invokevirtual   #486 <Method int RecyclerView$State.getItemCount()>
	//*  20   39:icmplt          45
	//*  21   42:goto            377
			{
				if(mPendingSavedState != null && mPendingSavedState.mAnchorPosition != -1 && mPendingSavedState.mSpanOffsetsSize >= 1)
	//*  22   45:aload_0         
	//*  23   46:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  24   49:ifnull          93
	//*  25   52:aload_0         
	//*  26   53:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  27   56:getfield        #207 <Field int StaggeredGridLayoutManager$SavedState.mAnchorPosition>
	//*  28   59:iconst_m1       
	//*  29   60:icmpeq          93
	//*  30   63:aload_0         
	//*  31   64:getfield        #172 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  32   67:getfield        #175 <Field int StaggeredGridLayoutManager$SavedState.mSpanOffsetsSize>
	//*  33   70:iconst_1        
	//*  34   71:icmpge          77
	//*  35   74:goto            93
				{
					anchorinfo.mOffset = 0x80000000;
	//   36   77:aload_2         
	//   37   78:ldc1            #43  <Int 0x80000000>
	//   38   80:putfield        #511 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
					anchorinfo.mPosition = mPendingScrollPosition;
	//   39   83:aload_2         
	//   40   84:aload_0         
	//   41   85:getfield        #99  <Field int mPendingScrollPosition>
	//   42   88:putfield        #537 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
					return true;
	//   43   91:iconst_1        
	//   44   92:ireturn         
				}
				state = ((RecyclerView.State) (findViewByPosition(mPendingScrollPosition)));
	//   45   93:aload_0         
	//   46   94:aload_0         
	//   47   95:getfield        #99  <Field int mPendingScrollPosition>
	//   48   98:invokevirtual   #904 <Method View findViewByPosition(int)>
	//   49  101:astore_1        
				if(state != null)
	//*  50  102:aload_1         
	//*  51  103:ifnull          317
				{
					int i;
					if(mShouldReverseLayout)
	//*  52  106:aload_0         
	//*  53  107:getfield        #97  <Field boolean mShouldReverseLayout>
	//*  54  110:ifeq            121
						i = getLastChildPosition();
	//   55  113:aload_0         
	//   56  114:invokevirtual   #380 <Method int getLastChildPosition()>
	//   57  117:istore_3        
					else
	//*  58  118:goto            126
						i = getFirstChildPosition();
	//   59  121:aload_0         
	//   60  122:invokevirtual   #259 <Method int getFirstChildPosition()>
	//   61  125:istore_3        
					anchorinfo.mPosition = i;
	//   62  126:aload_2         
	//   63  127:iload_3         
	//   64  128:putfield        #537 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
					if(mPendingScrollPositionOffset != 0x80000000)
	//*  65  131:aload_0         
	//*  66  132:getfield        #101 <Field int mPendingScrollPositionOffset>
	//*  67  135:ldc1            #43  <Int 0x80000000>
	//*  68  137:icmpeq          201
						if(anchorinfo.mLayoutFromEnd)
	//*  69  140:aload_2         
	//*  70  141:getfield        #217 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
	//*  71  144:ifeq            174
						{
							anchorinfo.mOffset = mPrimaryOrientation.getEndAfterPadding() - mPendingScrollPositionOffset - mPrimaryOrientation.getDecoratedEnd(((View) (state)));
	//   72  147:aload_2         
	//   73  148:aload_0         
	//   74  149:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//   75  152:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//   76  155:aload_0         
	//   77  156:getfield        #101 <Field int mPendingScrollPositionOffset>
	//   78  159:isub            
	//   79  160:aload_0         
	//   80  161:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//   81  164:aload_1         
	//   82  165:invokevirtual   #622 <Method int OrientationHelper.getDecoratedEnd(View)>
	//   83  168:isub            
	//   84  169:putfield        #511 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
							return true;
	//   85  172:iconst_1        
	//   86  173:ireturn         
						} else
						{
							anchorinfo.mOffset = (mPrimaryOrientation.getStartAfterPadding() + mPendingScrollPositionOffset) - mPrimaryOrientation.getDecoratedStart(((View) (state)));
	//   87  174:aload_2         
	//   88  175:aload_0         
	//   89  176:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//   90  179:invokevirtual   #195 <Method int OrientationHelper.getStartAfterPadding()>
	//   91  182:aload_0         
	//   92  183:getfield        #101 <Field int mPendingScrollPositionOffset>
	//   93  186:iadd            
	//   94  187:aload_0         
	//   95  188:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//   96  191:aload_1         
	//   97  192:invokevirtual   #609 <Method int OrientationHelper.getDecoratedStart(View)>
	//   98  195:isub            
	//   99  196:putfield        #511 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
							return true;
	//  100  199:iconst_1        
	//  101  200:ireturn         
						}
					if(mPrimaryOrientation.getDecoratedMeasurement(((View) (state))) > mPrimaryOrientation.getTotalSpace())
	//* 102  201:aload_0         
	//* 103  202:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//* 104  205:aload_1         
	//* 105  206:invokevirtual   #635 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//* 106  209:aload_0         
	//* 107  210:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//* 108  213:invokevirtual   #531 <Method int OrientationHelper.getTotalSpace()>
	//* 109  216:icmple          252
					{
						if(anchorinfo.mLayoutFromEnd)
	//* 110  219:aload_2         
	//* 111  220:getfield        #217 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
	//* 112  223:ifeq            237
							i = mPrimaryOrientation.getEndAfterPadding();
	//  113  226:aload_0         
	//  114  227:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//  115  230:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//  116  233:istore_3        
						else
	//* 117  234:goto            245
							i = mPrimaryOrientation.getStartAfterPadding();
	//  118  237:aload_0         
	//  119  238:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//  120  241:invokevirtual   #195 <Method int OrientationHelper.getStartAfterPadding()>
	//  121  244:istore_3        
						anchorinfo.mOffset = i;
	//  122  245:aload_2         
	//  123  246:iload_3         
	//  124  247:putfield        #511 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
						return true;
	//  125  250:iconst_1        
	//  126  251:ireturn         
					}
					i = mPrimaryOrientation.getDecoratedStart(((View) (state))) - mPrimaryOrientation.getStartAfterPadding();
	//  127  252:aload_0         
	//  128  253:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//  129  256:aload_1         
	//  130  257:invokevirtual   #609 <Method int OrientationHelper.getDecoratedStart(View)>
	//  131  260:aload_0         
	//  132  261:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//  133  264:invokevirtual   #195 <Method int OrientationHelper.getStartAfterPadding()>
	//  134  267:isub            
	//  135  268:istore_3        
					if(i < 0)
	//* 136  269:iload_3         
	//* 137  270:ifge            281
					{
						anchorinfo.mOffset = -i;
	//  138  273:aload_2         
	//  139  274:iload_3         
	//  140  275:ineg            
	//  141  276:putfield        #511 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
						return true;
	//  142  279:iconst_1        
	//  143  280:ireturn         
					}
					i = mPrimaryOrientation.getEndAfterPadding() - mPrimaryOrientation.getDecoratedEnd(((View) (state)));
	//  144  281:aload_0         
	//  145  282:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//  146  285:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//  147  288:aload_0         
	//  148  289:getfield        #186 <Field OrientationHelper mPrimaryOrientation>
	//  149  292:aload_1         
	//  150  293:invokevirtual   #622 <Method int OrientationHelper.getDecoratedEnd(View)>
	//  151  296:isub            
	//  152  297:istore_3        
					if(i < 0)
	//* 153  298:iload_3         
	//* 154  299:ifge            309
					{
						anchorinfo.mOffset = i;
	//  155  302:aload_2         
	//  156  303:iload_3         
	//  157  304:putfield        #511 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
						return true;
	//  158  307:iconst_1        
	//  159  308:ireturn         
					} else
					{
						anchorinfo.mOffset = 0x80000000;
	//  160  309:aload_2         
	//  161  310:ldc1            #43  <Int 0x80000000>
	//  162  312:putfield        #511 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
						return true;
	//  163  315:iconst_1        
	//  164  316:ireturn         
					}
				}
				anchorinfo.mPosition = mPendingScrollPosition;
	//  165  317:aload_2         
	//  166  318:aload_0         
	//  167  319:getfield        #99  <Field int mPendingScrollPosition>
	//  168  322:putfield        #537 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
				if(mPendingScrollPositionOffset == 0x80000000)
	//* 169  325:aload_0         
	//* 170  326:getfield        #101 <Field int mPendingScrollPositionOffset>
	//* 171  329:ldc1            #43  <Int 0x80000000>
	//* 172  331:icmpne          362
				{
					if(calculateScrollDirectionForPosition(anchorinfo.mPosition) == 1)
	//* 173  334:aload_0         
	//* 174  335:aload_2         
	//* 175  336:getfield        #537 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
	//* 176  339:invokespecial   #770 <Method int calculateScrollDirectionForPosition(int)>
	//* 177  342:iconst_1        
	//* 178  343:icmpne          349
						flag = true;
	//  179  346:iconst_1        
	//  180  347:istore          4
					anchorinfo.mLayoutFromEnd = flag;
	//  181  349:aload_2         
	//  182  350:iload           4
	//  183  352:putfield        #217 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
					anchorinfo.assignCoordinateFromPadding();
	//  184  355:aload_2         
	//  185  356:invokevirtual   #1026 <Method void StaggeredGridLayoutManager$AnchorInfo.assignCoordinateFromPadding()>
				} else
	//* 186  359:goto            370
				{
					anchorinfo.assignCoordinateFromPadding(mPendingScrollPositionOffset);
	//  187  362:aload_2         
	//  188  363:aload_0         
	//  189  364:getfield        #101 <Field int mPendingScrollPositionOffset>
	//  190  367:invokevirtual   #1028 <Method void StaggeredGridLayoutManager$AnchorInfo.assignCoordinateFromPadding(int)>
				}
				anchorinfo.mInvalidateOffsets = true;
	//  191  370:aload_2         
	//  192  371:iconst_1        
	//  193  372:putfield        #508 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mInvalidateOffsets>
				return true;
	//  194  375:iconst_1        
	//  195  376:ireturn         
			} else
			{
				mPendingScrollPosition = -1;
	//  196  377:aload_0         
	//  197  378:iconst_m1       
	//  198  379:putfield        #99  <Field int mPendingScrollPosition>
				mPendingScrollPositionOffset = 0x80000000;
	//  199  382:aload_0         
	//  200  383:ldc1            #43  <Int 0x80000000>
	//  201  385:putfield        #101 <Field int mPendingScrollPositionOffset>
				return false;
	//  202  388:iconst_0        
	//  203  389:ireturn         
			}
		} else
		{
			return false;
	//  204  390:iconst_0        
	//  205  391:ireturn         
		}
	}

	void updateAnchorInfoForLayout(RecyclerView.State state, AnchorInfo anchorinfo)
	{
		if(updateAnchorFromPendingData(state, anchorinfo))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:aload_2         
	//*   3    3:invokevirtual   #1030 <Method boolean updateAnchorFromPendingData(RecyclerView$State, StaggeredGridLayoutManager$AnchorInfo)>
	//*   4    6:ifeq            10
			return;
	//    5    9:return          
		if(updateAnchorFromChildren(state, anchorinfo))
	//*   6   10:aload_0         
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:invokespecial   #1032 <Method boolean updateAnchorFromChildren(RecyclerView$State, StaggeredGridLayoutManager$AnchorInfo)>
	//*  10   16:ifeq            20
		{
			return;
	//   11   19:return          
		} else
		{
			anchorinfo.assignCoordinateFromPadding();
	//   12   20:aload_2         
	//   13   21:invokevirtual   #1026 <Method void StaggeredGridLayoutManager$AnchorInfo.assignCoordinateFromPadding()>
			anchorinfo.mPosition = 0;
	//   14   24:aload_2         
	//   15   25:iconst_0        
	//   16   26:putfield        #537 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
			return;
	//   17   29:return          
		}
	}

	void updateMeasureSpecs(int i)
	{
		mSizePerSpan = i / mSpanCount;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #93  <Field int mSpanCount>
	//    4    6:idiv            
	//    5    7:putfield        #480 <Field int mSizePerSpan>
		mFullSizeSpec = android.view.View.MeasureSpec.makeMeasureSpec(i, mSecondaryOrientation.getMode());
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_0         
	//    9   13:getfield        #329 <Field OrientationHelper mSecondaryOrientation>
	//   10   16:invokevirtual   #631 <Method int OrientationHelper.getMode()>
	//   11   19:invokestatic    #707 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   12   22:putfield        #442 <Field int mFullSizeSpec>
	//   13   25:return          
	}

	static final boolean DEBUG = false;
	public static final int GAP_HANDLING_LAZY = 1;
	public static final int GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS = 2;
	public static final int GAP_HANDLING_NONE = 0;
	public static final int HORIZONTAL = 0;
	static final int INVALID_OFFSET = 0x80000000;
	private static final float MAX_SCROLL_FACTOR = 0.3333333F;
	private static final String TAG = "StaggeredGridLManager";
	public static final int VERTICAL = 1;
	private final AnchorInfo mAnchorInfo;
	private final Runnable mCheckForGapsRunnable;
	private int mFullSizeSpec;
	private int mGapStrategy;
	private boolean mLaidOutInvalidFullSpan;
	private boolean mLastLayoutFromEnd;
	private boolean mLastLayoutRTL;
	private final LayoutState mLayoutState;
	LazySpanLookup mLazySpanLookup;
	private int mOrientation;
	private SavedState mPendingSavedState;
	int mPendingScrollPosition;
	int mPendingScrollPositionOffset;
	private int mPrefetchDistances[];
	OrientationHelper mPrimaryOrientation;
	private BitSet mRemainingSpans;
	boolean mReverseLayout;
	OrientationHelper mSecondaryOrientation;
	boolean mShouldReverseLayout;
	private int mSizePerSpan;
	private boolean mSmoothScrollbarEnabled;
	private int mSpanCount;
	Span mSpans[];
	private final Rect mTmpRect;
}
