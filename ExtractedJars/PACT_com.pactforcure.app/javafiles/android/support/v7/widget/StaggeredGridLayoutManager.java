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
		//*   2    4:ifeq            24
				i = mPrimaryOrientation.getEndAfterPadding();
		//    3    7:aload_0         
		//    4    8:getfield        #22  <Field StaggeredGridLayoutManager this$0>
		//    5   11:getfield        #36  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//    6   14:invokevirtual   #42  <Method int OrientationHelper.getEndAfterPadding()>
		//    7   17:istore_1        
			else
		//*   8   18:aload_0         
		//*   9   19:iload_1         
		//*  10   20:putfield        #44  <Field int mOffset>
		//*  11   23:return          
				i = mPrimaryOrientation.getStartAfterPadding();
		//   12   24:aload_0         
		//   13   25:getfield        #22  <Field StaggeredGridLayoutManager this$0>
		//   14   28:getfield        #36  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//   15   31:invokevirtual   #47  <Method int OrientationHelper.getStartAfterPadding()>
		//   16   34:istore_1        
			mOffset = i;
		//*  17   35:goto            18
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
		//   10   20:putfield        #44  <Field int mOffset>
				return;
		//   11   23:return          
			} else
			{
				mOffset = mPrimaryOrientation.getStartAfterPadding() + i;
		//   12   24:aload_0         
		//   13   25:aload_0         
		//   14   26:getfield        #22  <Field StaggeredGridLayoutManager this$0>
		//   15   29:getfield        #36  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//   16   32:invokevirtual   #47  <Method int OrientationHelper.getStartAfterPadding()>
		//   17   35:iload_1         
		//   18   36:iadd            
		//   19   37:putfield        #44  <Field int mOffset>
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
		//    5    8:putfield        #44  <Field int mOffset>
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
			if(mFullSpanItems != null) goto _L2; else goto _L1
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field List mFullSpanItems>
		//    2    4:ifnonnull       9
_L1:
			return -1;
		//    3    7:iconst_m1       
		//    4    8:ireturn         
_L2:
			int j;
			byte byte0;
			int l;
			FullSpanItem fullspanitem = getFullSpanItem(i);
		//    5    9:aload_0         
		//    6   10:iload_1         
		//    7   11:invokevirtual   #33  <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem getFullSpanItem(int)>
		//    8   14:astore          6
			if(fullspanitem != null)
		//*   9   16:aload           6
		//*  10   18:ifnull          33
				mFullSpanItems.remove(((Object) (fullspanitem)));
		//   11   21:aload_0         
		//   12   22:getfield        #29  <Field List mFullSpanItems>
		//   13   25:aload           6
		//   14   27:invokeinterface #39  <Method boolean List.remove(Object)>
		//   15   32:pop             
			byte0 = -1;
		//   16   33:iconst_m1       
		//   17   34:istore          4
			l = mFullSpanItems.size();
		//   18   36:aload_0         
		//   19   37:getfield        #29  <Field List mFullSpanItems>
		//   20   40:invokeinterface #43  <Method int List.size()>
		//   21   45:istore          5
			j = 0;
		//   22   47:iconst_0        
		//   23   48:istore_2        
_L4:
			int k;
			k = ((int) (byte0));
		//   24   49:iload           4
		//   25   51:istore_3        
			if(j >= l)
				continue; /* Loop/switch isn't completed */
		//   26   52:iload_2         
		//   27   53:iload           5
		//   28   55:icmpge          80
			if(((FullSpanItem)mFullSpanItems.get(j)).mPosition < i)
				break MISSING_BLOCK_LABEL_117;
		//   29   58:aload_0         
		//   30   59:getfield        #29  <Field List mFullSpanItems>
		//   31   62:iload_2         
		//   32   63:invokeinterface #47  <Method Object List.get(int)>
		//   33   68:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//   34   71:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//   35   74:iload_1         
		//   36   75:icmplt          117
			k = j;
		//   37   78:iload_2         
		//   38   79:istore_3        
			if(k == -1) goto _L1; else goto _L3
		//   39   80:iload_3         
		//   40   81:iconst_m1       
		//   41   82:icmpeq          7
_L3:
			FullSpanItem fullspanitem1 = (FullSpanItem)mFullSpanItems.get(k);
		//   42   85:aload_0         
		//   43   86:getfield        #29  <Field List mFullSpanItems>
		//   44   89:iload_3         
		//   45   90:invokeinterface #47  <Method Object List.get(int)>
		//   46   95:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//   47   98:astore          6
			mFullSpanItems.remove(k);
		//   48  100:aload_0         
		//   49  101:getfield        #29  <Field List mFullSpanItems>
		//   50  104:iload_3         
		//   51  105:invokeinterface #52  <Method Object List.remove(int)>
		//   52  110:pop             
			return fullspanitem1.mPosition;
		//   53  111:aload           6
		//   54  113:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//   55  116:ireturn         
			j++;
		//   56  117:iload_2         
		//   57  118:iconst_1        
		//   58  119:iadd            
		//   59  120:istore_2        
			  goto _L4
		//*  60  121:goto            49
		}

		private void offsetFullSpansForAddition(int i, int j)
		{
			if(mFullSpanItems != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field List mFullSpanItems>
		//*   2    4:ifnonnull       8
		//*   3    7:return          
			{
				int k = mFullSpanItems.size() - 1;
		//    4    8:aload_0         
		//    5    9:getfield        #29  <Field List mFullSpanItems>
		//    6   12:invokeinterface #43  <Method int List.size()>
		//    7   17:iconst_1        
		//    8   18:isub            
		//    9   19:istore_3        
				while(k >= 0) 
		//*  10   20:iload_3         
		//*  11   21:iflt            7
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
		//*  21   45:icmpge          55
		//*  22   48:iload_3         
		//*  23   49:iconst_1        
		//*  24   50:isub            
		//*  25   51:istore_3        
		//*  26   52:goto            20
						fullspanitem.mPosition = fullspanitem.mPosition + j;
		//   27   55:aload           4
		//   28   57:aload           4
		//   29   59:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//   30   62:iload_2         
		//   31   63:iadd            
		//   32   64:putfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
					k--;
				}
			}
		//*  33   67:goto            48
		}

		private void offsetFullSpansForRemoval(int i, int j)
		{
			if(mFullSpanItems != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field List mFullSpanItems>
		//*   2    4:ifnonnull       8
		//*   3    7:return          
			{
				int k = mFullSpanItems.size() - 1;
		//    4    8:aload_0         
		//    5    9:getfield        #29  <Field List mFullSpanItems>
		//    6   12:invokeinterface #43  <Method int List.size()>
		//    7   17:iconst_1        
		//    8   18:isub            
		//    9   19:istore_3        
				while(k >= 0) 
		//*  10   20:iload_3         
		//*  11   21:iflt            7
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
		//*  21   45:icmpge          55
		//*  22   48:iload_3         
		//*  23   49:iconst_1        
		//*  24   50:isub            
		//*  25   51:istore_3        
		//*  26   52:goto            20
						if(fullspanitem.mPosition < i + j)
		//*  27   55:aload           4
		//*  28   57:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//*  29   60:iload_1         
		//*  30   61:iload_2         
		//*  31   62:iadd            
		//*  32   63:icmpge          80
							mFullSpanItems.remove(k);
		//   33   66:aload_0         
		//   34   67:getfield        #29  <Field List mFullSpanItems>
		//   35   70:iload_3         
		//   36   71:invokeinterface #52  <Method Object List.remove(int)>
		//   37   76:pop             
						else
		//*  38   77:goto            48
							fullspanitem.mPosition = fullspanitem.mPosition - j;
		//   39   80:aload           4
		//   40   82:aload           4
		//   41   84:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//   42   87:iload_2         
		//   43   88:isub            
		//   44   89:putfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
					k--;
				}
			}
		//*  45   92:goto            48
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
			} else
		//*  15   29:return          
			if(i >= mData.length)
		//*  16   30:iload_1         
		//*  17   31:aload_0         
		//*  18   32:getfield        #69  <Field int[] mData>
		//*  19   35:arraylength     
		//*  20   36:icmplt          29
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
				return;
		//   47   82:return          
			}
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
			if(mFullSpanItems != null) goto _L2; else goto _L1
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field List mFullSpanItems>
		//    2    4:ifnonnull       13
_L1:
			FullSpanItem fullspanitem = null;
		//    3    7:aconst_null     
		//    4    8:astore          7
_L6:
			return fullspanitem;
		//    5   10:aload           7
		//    6   12:areturn         
_L2:
			int l;
			int i1;
			i1 = mFullSpanItems.size();
		//    7   13:aload_0         
		//    8   14:getfield        #29  <Field List mFullSpanItems>
		//    9   17:invokeinterface #43  <Method int List.size()>
		//   10   22:istore          6
			l = 0;
		//   11   24:iconst_0        
		//   12   25:istore          5
_L9:
			if(l >= i1) goto _L4; else goto _L3
		//   13   27:iload           5
		//   14   29:iload           6
		//   15   31:icmpge          117
_L3:
			FullSpanItem fullspanitem1;
			fullspanitem1 = (FullSpanItem)mFullSpanItems.get(l);
		//   16   34:aload_0         
		//   17   35:getfield        #29  <Field List mFullSpanItems>
		//   18   38:iload           5
		//   19   40:invokeinterface #47  <Method Object List.get(int)>
		//   20   45:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//   21   48:astore          8
			if(fullspanitem1.mPosition >= j)
		//*  22   50:aload           8
		//*  23   52:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//*  24   55:iload_2         
		//*  25   56:icmplt          61
				return null;
		//   26   59:aconst_null     
		//   27   60:areturn         
			if(fullspanitem1.mPosition < i)
				continue; /* Loop/switch isn't completed */
		//   28   61:aload           8
		//   29   63:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//   30   66:iload_1         
		//   31   67:icmplt          108
			fullspanitem = fullspanitem1;
		//   32   70:aload           8
		//   33   72:astore          7
			if(k == 0) goto _L6; else goto _L5
		//   34   74:iload_3         
		//   35   75:ifeq            10
_L5:
			fullspanitem = fullspanitem1;
		//   36   78:aload           8
		//   37   80:astore          7
			if(fullspanitem1.mGapDir == k) goto _L6; else goto _L7
		//   38   82:aload           8
		//   39   84:getfield        #104 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapDir>
		//   40   87:iload_3         
		//   41   88:icmpeq          10
_L7:
			if(!flag)
				continue; /* Loop/switch isn't completed */
		//   42   91:iload           4
		//   43   93:ifeq            108
			fullspanitem = fullspanitem1;
		//   44   96:aload           8
		//   45   98:astore          7
			if(fullspanitem1.mHasUnwantedGapAfter) goto _L6; else goto _L8
		//   46  100:aload           8
		//   47  102:getfield        #108 <Field boolean StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mHasUnwantedGapAfter>
		//   48  105:ifne            10
_L8:
			l++;
		//   49  108:iload           5
		//   50  110:iconst_1        
		//   51  111:iadd            
		//   52  112:istore          5
			  goto _L9
		//*  53  114:goto            27
_L4:
			return null;
		//   54  117:aconst_null     
		//   55  118:areturn         
		}

		public FullSpanItem getFullSpanItem(int i)
		{
			if(mFullSpanItems != null) goto _L2; else goto _L1
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field List mFullSpanItems>
		//    2    4:ifnonnull       11
_L1:
			FullSpanItem fullspanitem = null;
		//    3    7:aconst_null     
		//    4    8:astore_3        
_L4:
			return fullspanitem;
		//    5    9:aload_3         
		//    6   10:areturn         
_L2:
			int j = mFullSpanItems.size() - 1;
		//    7   11:aload_0         
		//    8   12:getfield        #29  <Field List mFullSpanItems>
		//    9   15:invokeinterface #43  <Method int List.size()>
		//   10   20:iconst_1        
		//   11   21:isub            
		//   12   22:istore_2        
label0:
			do
			{
label1:
				{
					if(j < 0)
						break label1;
		//   13   23:iload_2         
		//   14   24:iflt            61
					FullSpanItem fullspanitem1 = (FullSpanItem)mFullSpanItems.get(j);
		//   15   27:aload_0         
		//   16   28:getfield        #29  <Field List mFullSpanItems>
		//   17   31:iload_2         
		//   18   32:invokeinterface #47  <Method Object List.get(int)>
		//   19   37:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//   20   40:astore          4
					fullspanitem = fullspanitem1;
		//   21   42:aload           4
		//   22   44:astore_3        
					if(fullspanitem1.mPosition == i)
						break label0;
		//   23   45:aload           4
		//   24   47:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//   25   50:iload_1         
		//   26   51:icmpeq          9
					j--;
		//   27   54:iload_2         
		//   28   55:iconst_1        
		//   29   56:isub            
		//   30   57:istore_2        
				}
			} while(true);
		//   31   58:goto            23
			if(true) goto _L4; else goto _L3
_L3:
			return null;
		//   32   61:aconst_null     
		//   33   62:areturn         
		}

		int getSpan(int i)
		{
			if(mData == null || i >= mData.length)
		//*   0    0:aload_0         
		//*   1    1:getfield        #69  <Field int[] mData>
		//*   2    4:ifnull          16
		//*   3    7:iload_1         
		//*   4    8:aload_0         
		//*   5    9:getfield        #69  <Field int[] mData>
		//*   6   12:arraylength     
		//*   7   13:icmplt          18
				return -1;
		//    8   16:iconst_m1       
		//    9   17:ireturn         
			else
				return mData[i];
		//   10   18:aload_0         
		//   11   19:getfield        #69  <Field int[] mData>
		//   12   22:iload_1         
		//   13   23:iaload          
		//   14   24:ireturn         
		}

		int invalidateAfter(int i)
		{
			while(mData == null || i >= mData.length) 
		//*   0    0:aload_0         
		//*   1    1:getfield        #69  <Field int[] mData>
		//*   2    4:ifnonnull       9
				return -1;
		//    3    7:iconst_m1       
		//    4    8:ireturn         
		//    5    9:iload_1         
		//    6   10:aload_0         
		//    7   11:getfield        #69  <Field int[] mData>
		//    8   14:arraylength     
		//    9   15:icmpge          7
			int j = invalidateFullSpansAfter(i);
		//   10   18:aload_0         
		//   11   19:iload_1         
		//   12   20:invokespecial   #111 <Method int invalidateFullSpansAfter(int)>
		//   13   23:istore_2        
			if(j == -1)
		//*  14   24:iload_2         
		//*  15   25:iconst_m1       
		//*  16   26:icmpne          49
			{
				Arrays.fill(mData, i, mData.length, -1);
		//   17   29:aload_0         
		//   18   30:getfield        #69  <Field int[] mData>
		//   19   33:iload_1         
		//   20   34:aload_0         
		//   21   35:getfield        #69  <Field int[] mData>
		//   22   38:arraylength     
		//   23   39:iconst_m1       
		//   24   40:invokestatic    #95  <Method void Arrays.fill(int[], int, int, int)>
				return mData.length;
		//   25   43:aload_0         
		//   26   44:getfield        #69  <Field int[] mData>
		//   27   47:arraylength     
		//   28   48:ireturn         
			} else
			{
				Arrays.fill(mData, i, j + 1, -1);
		//   29   49:aload_0         
		//   30   50:getfield        #69  <Field int[] mData>
		//   31   53:iload_1         
		//   32   54:iload_2         
		//   33   55:iconst_1        
		//   34   56:iadd            
		//   35   57:iconst_m1       
		//   36   58:invokestatic    #95  <Method void Arrays.fill(int[], int, int, int)>
				return j + 1;
		//   37   61:iload_2         
		//   38   62:iconst_1        
		//   39   63:iadd            
		//   40   64:ireturn         
			}
		}

		void offsetForAddition(int i, int j)
		{
			if(mData == null || i >= mData.length)
		//*   0    0:aload_0         
		//*   1    1:getfield        #69  <Field int[] mData>
		//*   2    4:ifnull          16
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
				ensureSize(i + j);
		//    9   17:aload_0         
		//   10   18:iload_1         
		//   11   19:iload_2         
		//   12   20:iadd            
		//   13   21:invokevirtual   #114 <Method void ensureSize(int)>
				System.arraycopy(((Object) (mData)), i, ((Object) (mData)), i + j, mData.length - i - j);
		//   14   24:aload_0         
		//   15   25:getfield        #69  <Field int[] mData>
		//   16   28:iload_1         
		//   17   29:aload_0         
		//   18   30:getfield        #69  <Field int[] mData>
		//   19   33:iload_1         
		//   20   34:iload_2         
		//   21   35:iadd            
		//   22   36:aload_0         
		//   23   37:getfield        #69  <Field int[] mData>
		//   24   40:arraylength     
		//   25   41:iload_1         
		//   26   42:isub            
		//   27   43:iload_2         
		//   28   44:isub            
		//   29   45:invokestatic    #92  <Method void System.arraycopy(Object, int, Object, int, int)>
				Arrays.fill(mData, i, i + j, -1);
		//   30   48:aload_0         
		//   31   49:getfield        #69  <Field int[] mData>
		//   32   52:iload_1         
		//   33   53:iload_1         
		//   34   54:iload_2         
		//   35   55:iadd            
		//   36   56:iconst_m1       
		//   37   57:invokestatic    #95  <Method void Arrays.fill(int[], int, int, int)>
				offsetFullSpansForAddition(i, j);
		//   38   60:aload_0         
		//   39   61:iload_1         
		//   40   62:iload_2         
		//   41   63:invokespecial   #116 <Method void offsetFullSpansForAddition(int, int)>
				return;
		//   42   66:return          
			}
		}

		void offsetForRemoval(int i, int j)
		{
			if(mData == null || i >= mData.length)
		//*   0    0:aload_0         
		//*   1    1:getfield        #69  <Field int[] mData>
		//*   2    4:ifnull          16
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
				ensureSize(i + j);
		//    9   17:aload_0         
		//   10   18:iload_1         
		//   11   19:iload_2         
		//   12   20:iadd            
		//   13   21:invokevirtual   #114 <Method void ensureSize(int)>
				System.arraycopy(((Object) (mData)), i + j, ((Object) (mData)), i, mData.length - i - j);
		//   14   24:aload_0         
		//   15   25:getfield        #69  <Field int[] mData>
		//   16   28:iload_1         
		//   17   29:iload_2         
		//   18   30:iadd            
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
			return (new StringBuilder()).append("FullSpanItem{mPosition=").append(mPosition).append(", mGapDir=").append(mGapDir).append(", mHasUnwantedGapAfter=").append(mHasUnwantedGapAfter).append(", mGapPerSpan=").append(Arrays.toString(mGapPerSpan)).append('}').toString();
		//    0    0:new             #59  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #60  <Method void StringBuilder()>
		//    3    7:ldc1            #62  <String "FullSpanItem{mPosition=">
		//    4    9:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
		//    5   12:aload_0         
		//    6   13:getfield        #42  <Field int mPosition>
		//    7   16:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
		//    8   19:ldc1            #71  <String ", mGapDir=">
		//    9   21:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
		//   10   24:aload_0         
		//   11   25:getfield        #44  <Field int mGapDir>
		//   12   28:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
		//   13   31:ldc1            #73  <String ", mHasUnwantedGapAfter=">
		//   14   33:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
		//   15   36:aload_0         
		//   16   37:getfield        #46  <Field boolean mHasUnwantedGapAfter>
		//   17   40:invokevirtual   #76  <Method StringBuilder StringBuilder.append(boolean)>
		//   18   43:ldc1            #78  <String ", mGapPerSpan=">
		//   19   45:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
		//   20   48:aload_0         
		//   21   49:getfield        #48  <Field int[] mGapPerSpan>
		//   22   52:invokestatic    #83  <Method String Arrays.toString(int[])>
		//   23   55:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
		//   24   58:bipush          125
		//   25   60:invokevirtual   #86  <Method StringBuilder StringBuilder.append(char)>
		//   26   63:invokevirtual   #88  <Method String StringBuilder.toString()>
		//   27   66:areturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			parcel.writeInt(mPosition);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #42  <Field int mPosition>
		//    3    5:invokevirtual   #94  <Method void Parcel.writeInt(int)>
			parcel.writeInt(mGapDir);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #44  <Field int mGapDir>
		//    7   13:invokevirtual   #94  <Method void Parcel.writeInt(int)>
			if(mHasUnwantedGapAfter)
		//*   8   16:aload_0         
		//*   9   17:getfield        #46  <Field boolean mHasUnwantedGapAfter>
		//*  10   20:ifeq            63
				i = 1;
		//   11   23:iconst_1        
		//   12   24:istore_2        
			else
		//*  13   25:aload_1         
		//*  14   26:iload_2         
		//*  15   27:invokevirtual   #94  <Method void Parcel.writeInt(int)>
		//*  16   30:aload_0         
		//*  17   31:getfield        #48  <Field int[] mGapPerSpan>
		//*  18   34:ifnull          68
		//*  19   37:aload_0         
		//*  20   38:getfield        #48  <Field int[] mGapPerSpan>
		//*  21   41:arraylength     
		//*  22   42:ifle            68
		//*  23   45:aload_1         
		//*  24   46:aload_0         
		//*  25   47:getfield        #48  <Field int[] mGapPerSpan>
		//*  26   50:arraylength     
		//*  27   51:invokevirtual   #94  <Method void Parcel.writeInt(int)>
		//*  28   54:aload_1         
		//*  29   55:aload_0         
		//*  30   56:getfield        #48  <Field int[] mGapPerSpan>
		//*  31   59:invokevirtual   #97  <Method void Parcel.writeIntArray(int[])>
		//*  32   62:return          
				i = 0;
		//   33   63:iconst_0        
		//   34   64:istore_2        
			parcel.writeInt(i);
			if(mGapPerSpan != null && mGapPerSpan.length > 0)
			{
				parcel.writeInt(mGapPerSpan.length);
				parcel.writeIntArray(mGapPerSpan);
				return;
			} else
		//*  35   65:goto            25
			{
				parcel.writeInt(0);
		//   36   68:aload_1         
		//   37   69:iconst_0        
		//   38   70:invokevirtual   #94  <Method void Parcel.writeInt(int)>
				return;
		//   39   73:return          
			}
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
			boolean flag = true;
		//    0    0:iconst_1        
		//    1    1:istore_3        
			super();
		//    2    2:aload_0         
		//    3    3:invokespecial   #33  <Method void Object()>
			mPosition = parcel.readInt();
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #40  <Method int Parcel.readInt()>
		//    7   11:putfield        #42  <Field int mPosition>
			mGapDir = parcel.readInt();
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:invokevirtual   #40  <Method int Parcel.readInt()>
		//   11   19:putfield        #44  <Field int mGapDir>
			int i;
			if(parcel.readInt() != 1)
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #40  <Method int Parcel.readInt()>
		//*  14   26:iconst_1        
		//*  15   27:icmpne          60
		//*  16   30:aload_0         
		//*  17   31:iload_3         
		//*  18   32:putfield        #46  <Field boolean mHasUnwantedGapAfter>
		//*  19   35:aload_1         
		//*  20   36:invokevirtual   #40  <Method int Parcel.readInt()>
		//*  21   39:istore_2        
		//*  22   40:iload_2         
		//*  23   41:ifle            59
		//*  24   44:aload_0         
		//*  25   45:iload_2         
		//*  26   46:newarray        int[]
		//*  27   48:putfield        #48  <Field int[] mGapPerSpan>
		//*  28   51:aload_1         
		//*  29   52:aload_0         
		//*  30   53:getfield        #48  <Field int[] mGapPerSpan>
		//*  31   56:invokevirtual   #52  <Method void Parcel.readIntArray(int[])>
		//*  32   59:return          
				flag = false;
		//   33   60:iconst_0        
		//   34   61:istore_3        
			mHasUnwantedGapAfter = flag;
			i = parcel.readInt();
			if(i > 0)
			{
				mGapPerSpan = new int[i];
				parcel.readIntArray(mGapPerSpan);
			}
		//*  35   62:goto            30
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
			boolean flag = true;
		//    0    0:iconst_1        
		//    1    1:istore_3        
			parcel.writeInt(mAnchorPosition);
		//    2    2:aload_1         
		//    3    3:aload_0         
		//    4    4:getfield        #51  <Field int mAnchorPosition>
		//    5    7:invokevirtual   #95  <Method void Parcel.writeInt(int)>
			parcel.writeInt(mVisibleAnchorPosition);
		//    6   10:aload_1         
		//    7   11:aload_0         
		//    8   12:getfield        #53  <Field int mVisibleAnchorPosition>
		//    9   15:invokevirtual   #95  <Method void Parcel.writeInt(int)>
			parcel.writeInt(mSpanOffsetsSize);
		//   10   18:aload_1         
		//   11   19:aload_0         
		//   12   20:getfield        #55  <Field int mSpanOffsetsSize>
		//   13   23:invokevirtual   #95  <Method void Parcel.writeInt(int)>
			if(mSpanOffsetsSize > 0)
		//*  14   26:aload_0         
		//*  15   27:getfield        #55  <Field int mSpanOffsetsSize>
		//*  16   30:ifle            41
				parcel.writeIntArray(mSpanOffsets);
		//   17   33:aload_1         
		//   18   34:aload_0         
		//   19   35:getfield        #57  <Field int[] mSpanOffsets>
		//   20   38:invokevirtual   #98  <Method void Parcel.writeIntArray(int[])>
			parcel.writeInt(mSpanLookupSize);
		//   21   41:aload_1         
		//   22   42:aload_0         
		//   23   43:getfield        #63  <Field int mSpanLookupSize>
		//   24   46:invokevirtual   #95  <Method void Parcel.writeInt(int)>
			if(mSpanLookupSize > 0)
		//*  25   49:aload_0         
		//*  26   50:getfield        #63  <Field int mSpanLookupSize>
		//*  27   53:ifle            64
				parcel.writeIntArray(mSpanLookup);
		//   28   56:aload_1         
		//   29   57:aload_0         
		//   30   58:getfield        #65  <Field int[] mSpanLookup>
		//   31   61:invokevirtual   #98  <Method void Parcel.writeIntArray(int[])>
			if(mReverseLayout)
		//*  32   64:aload_0         
		//*  33   65:getfield        #67  <Field boolean mReverseLayout>
		//*  34   68:ifeq            115
				i = 1;
		//   35   71:iconst_1        
		//   36   72:istore_2        
			else
		//*  37   73:aload_1         
		//*  38   74:iload_2         
		//*  39   75:invokevirtual   #95  <Method void Parcel.writeInt(int)>
		//*  40   78:aload_0         
		//*  41   79:getfield        #69  <Field boolean mAnchorLayoutFromEnd>
		//*  42   82:ifeq            120
		//*  43   85:iconst_1        
		//*  44   86:istore_2        
		//*  45   87:aload_1         
		//*  46   88:iload_2         
		//*  47   89:invokevirtual   #95  <Method void Parcel.writeInt(int)>
		//*  48   92:aload_0         
		//*  49   93:getfield        #71  <Field boolean mLastLayoutRTL>
		//*  50   96:ifeq            125
		//*  51   99:iload_3         
		//*  52  100:istore_2        
		//*  53  101:aload_1         
		//*  54  102:iload_2         
		//*  55  103:invokevirtual   #95  <Method void Parcel.writeInt(int)>
		//*  56  106:aload_1         
		//*  57  107:aload_0         
		//*  58  108:getfield        #85  <Field List mFullSpanItems>
		//*  59  111:invokevirtual   #102 <Method void Parcel.writeList(List)>
		//*  60  114:return          
				i = 0;
		//   61  115:iconst_0        
		//   62  116:istore_2        
			parcel.writeInt(i);
			if(mAnchorLayoutFromEnd)
				i = 1;
			else
		//*  63  117:goto            73
				i = 0;
		//   64  120:iconst_0        
		//   65  121:istore_2        
			parcel.writeInt(i);
			if(mLastLayoutRTL)
				i = ((int) (flag));
			else
		//*  66  122:goto            87
				i = 0;
		//   67  125:iconst_0        
		//   68  126:istore_2        
			parcel.writeInt(i);
			parcel.writeList(mFullSpanItems);
		//*  69  127:goto            101
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
			boolean flag1 = true;
		//    0    0:iconst_1        
		//    1    1:istore_3        
			super();
		//    2    2:aload_0         
		//    3    3:invokespecial   #42  <Method void Object()>
			mAnchorPosition = parcel.readInt();
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #49  <Method int Parcel.readInt()>
		//    7   11:putfield        #51  <Field int mAnchorPosition>
			mVisibleAnchorPosition = parcel.readInt();
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:invokevirtual   #49  <Method int Parcel.readInt()>
		//   11   19:putfield        #53  <Field int mVisibleAnchorPosition>
			mSpanOffsetsSize = parcel.readInt();
		//   12   22:aload_0         
		//   13   23:aload_1         
		//   14   24:invokevirtual   #49  <Method int Parcel.readInt()>
		//   15   27:putfield        #55  <Field int mSpanOffsetsSize>
			if(mSpanOffsetsSize > 0)
		//*  16   30:aload_0         
		//*  17   31:getfield        #55  <Field int mSpanOffsetsSize>
		//*  18   34:ifle            55
			{
				mSpanOffsets = new int[mSpanOffsetsSize];
		//   19   37:aload_0         
		//   20   38:aload_0         
		//   21   39:getfield        #55  <Field int mSpanOffsetsSize>
		//   22   42:newarray        int[]
		//   23   44:putfield        #57  <Field int[] mSpanOffsets>
				parcel.readIntArray(mSpanOffsets);
		//   24   47:aload_1         
		//   25   48:aload_0         
		//   26   49:getfield        #57  <Field int[] mSpanOffsets>
		//   27   52:invokevirtual   #61  <Method void Parcel.readIntArray(int[])>
			}
			mSpanLookupSize = parcel.readInt();
		//   28   55:aload_0         
		//   29   56:aload_1         
		//   30   57:invokevirtual   #49  <Method int Parcel.readInt()>
		//   31   60:putfield        #63  <Field int mSpanLookupSize>
			if(mSpanLookupSize > 0)
		//*  32   63:aload_0         
		//*  33   64:getfield        #63  <Field int mSpanLookupSize>
		//*  34   67:ifle            88
			{
				mSpanLookup = new int[mSpanLookupSize];
		//   35   70:aload_0         
		//   36   71:aload_0         
		//   37   72:getfield        #63  <Field int mSpanLookupSize>
		//   38   75:newarray        int[]
		//   39   77:putfield        #65  <Field int[] mSpanLookup>
				parcel.readIntArray(mSpanLookup);
		//   40   80:aload_1         
		//   41   81:aload_0         
		//   42   82:getfield        #65  <Field int[] mSpanLookup>
		//   43   85:invokevirtual   #61  <Method void Parcel.readIntArray(int[])>
			}
			boolean flag;
			if(parcel.readInt() == 1)
		//*  44   88:aload_1         
		//*  45   89:invokevirtual   #49  <Method int Parcel.readInt()>
		//*  46   92:iconst_1        
		//*  47   93:icmpne          147
				flag = true;
		//   48   96:iconst_1        
		//   49   97:istore_2        
			else
		//*  50   98:aload_0         
		//*  51   99:iload_2         
		//*  52  100:putfield        #67  <Field boolean mReverseLayout>
		//*  53  103:aload_1         
		//*  54  104:invokevirtual   #49  <Method int Parcel.readInt()>
		//*  55  107:iconst_1        
		//*  56  108:icmpne          152
		//*  57  111:iconst_1        
		//*  58  112:istore_2        
		//*  59  113:aload_0         
		//*  60  114:iload_2         
		//*  61  115:putfield        #69  <Field boolean mAnchorLayoutFromEnd>
		//*  62  118:aload_1         
		//*  63  119:invokevirtual   #49  <Method int Parcel.readInt()>
		//*  64  122:iconst_1        
		//*  65  123:icmpne          157
		//*  66  126:iload_3         
		//*  67  127:istore_2        
		//*  68  128:aload_0         
		//*  69  129:iload_2         
		//*  70  130:putfield        #71  <Field boolean mLastLayoutRTL>
		//*  71  133:aload_0         
		//*  72  134:aload_1         
		//*  73  135:ldc1            #73  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//*  74  137:invokevirtual   #79  <Method ClassLoader Class.getClassLoader()>
		//*  75  140:invokevirtual   #83  <Method ArrayList Parcel.readArrayList(ClassLoader)>
		//*  76  143:putfield        #85  <Field List mFullSpanItems>
		//*  77  146:return          
				flag = false;
		//   78  147:iconst_0        
		//   79  148:istore_2        
			mReverseLayout = flag;
			if(parcel.readInt() == 1)
				flag = true;
			else
		//*  80  149:goto            98
				flag = false;
		//   81  152:iconst_0        
		//   82  153:istore_2        
			mAnchorLayoutFromEnd = flag;
			if(parcel.readInt() == 1)
				flag = flag1;
			else
		//*  83  154:goto            113
				flag = false;
		//   84  157:iconst_0        
		//   85  158:istore_2        
			mLastLayoutRTL = flag;
			mFullSpanItems = ((List) (parcel.readArrayList(((Class) (android/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)).getClassLoader())));
		//*  86  159:goto            128
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
				byte0 = 1;
		//   13   29:iconst_1        
		//   14   30:istore          7
			else
		//*  15   32:iload_1         
		//*  16   33:istore          8
		//*  17   35:iload           8
		//*  18   37:iload_2         
		//*  19   38:icmpeq          256
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
		//*  39   85:ifeq            165
		//*  40   88:iload           11
		//*  41   90:iload           10
		//*  42   92:icmpgt          160
		//*  43   95:iconst_1        
		//*  44   96:istore_1        
		//*  45   97:iload           5
		//*  46   99:ifeq            188
		//*  47  102:iload           12
		//*  48  104:iload           9
		//*  49  106:icmplt          182
		//*  50  109:iconst_1        
		//*  51  110:istore          6
		//*  52  112:iload_1         
		//*  53  113:ifeq            246
		//*  54  116:iload           6
		//*  55  118:ifeq            246
		//*  56  121:iload_3         
		//*  57  122:ifeq            207
		//*  58  125:iload           4
		//*  59  127:ifeq            207
		//*  60  130:iload           11
		//*  61  132:iload           9
		//*  62  134:icmplt          246
		//*  63  137:iload           12
		//*  64  139:iload           10
		//*  65  141:icmpgt          246
		//*  66  144:aload_0         
		//*  67  145:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//*  68  148:aload           13
		//*  69  150:invokevirtual   #159 <Method int StaggeredGridLayoutManager.getPosition(View)>
		//*  70  153:ireturn         
				byte0 = -1;
		//   71  154:iconst_m1       
		//   72  155:istore          7
			for(k = i; k != j; k += ((int) (byte0)))
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
		//*  73  157:goto            32
						i = 0;
		//   74  160:iconst_0        
		//   75  161:istore_1        
				} else
		//*  76  162:goto            97
				if(j1 < i1)
		//*  77  165:iload           11
		//*  78  167:iload           10
		//*  79  169:icmpge          177
					i = 1;
		//   80  172:iconst_1        
		//   81  173:istore_1        
				else
		//*  82  174:goto            97
					i = 0;
		//   83  177:iconst_0        
		//   84  178:istore_1        
				if(flag2)
				{
					if(k1 >= l)
						flag3 = true;
					else
		//*  85  179:goto            97
						flag3 = false;
		//   86  182:iconst_0        
		//   87  183:istore          6
				} else
		//*  88  185:goto            112
				if(k1 > l)
		//*  89  188:iload           12
		//*  90  190:iload           9
		//*  91  192:icmple          201
					flag3 = true;
		//   92  195:iconst_1        
		//   93  196:istore          6
				else
		//*  94  198:goto            112
					flag3 = false;
		//   95  201:iconst_0        
		//   96  202:istore          6
				if(i == 0 || !flag3)
					continue;
				if(flag && flag1)
				{
					if(j1 >= l && k1 <= i1)
						return getPosition(view);
					continue;
				}
		//*  97  204:goto            112
				if(flag1)
		//*  98  207:iload           4
		//*  99  209:ifeq            222
					return getPosition(view);
		//  100  212:aload_0         
		//  101  213:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//  102  216:aload           13
		//  103  218:invokevirtual   #159 <Method int StaggeredGridLayoutManager.getPosition(View)>
		//  104  221:ireturn         
				if(j1 < l || k1 > i1)
		//* 105  222:iload           11
		//* 106  224:iload           9
		//* 107  226:icmplt          236
		//* 108  229:iload           12
		//* 109  231:iload           10
		//* 110  233:icmple          246
					return getPosition(view);
		//  111  236:aload_0         
		//  112  237:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//  113  240:aload           13
		//  114  242:invokevirtual   #159 <Method int StaggeredGridLayoutManager.getPosition(View)>
		//  115  245:ireturn         
			}

		//  116  246:iload           8
		//  117  248:iload           7
		//  118  250:iadd            
		//  119  251:istore          8
		//* 120  253:goto            35
			return -1;
		//  121  256:iconst_m1       
		//  122  257:ireturn         
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
			View view;
			View view1;
			view1 = null;
		//    0    0:aconst_null     
		//    1    1:astore          5
			view = null;
		//    2    3:aconst_null     
		//    3    4:astore          4
			if(j != -1) goto _L2; else goto _L1
		//    4    6:iload_2         
		//    5    7:iconst_m1       
		//    6    8:icmpne          123
_L1:
			int k;
			k = mViews.size();
		//    7   11:aload_0         
		//    8   12:getfield        #31  <Field ArrayList mViews>
		//    9   15:invokevirtual   #60  <Method int ArrayList.size()>
		//   10   18:istore_3        
			j = 0;
		//   11   19:iconst_0        
		//   12   20:istore_2        
_L10:
			view1 = view;
		//   13   21:aload           4
		//   14   23:astore          5
			if(j >= k) goto _L4; else goto _L3
		//   15   25:iload_2         
		//   16   26:iload_3         
		//   17   27:icmpge          97
_L3:
			View view2 = (View)mViews.get(j);
		//   18   30:aload_0         
		//   19   31:getfield        #31  <Field ArrayList mViews>
		//   20   34:iload_2         
		//   21   35:invokevirtual   #100 <Method Object ArrayList.get(int)>
		//   22   38:checkcast       #102 <Class View>
		//   23   41:astore          6
			if(!mReverseLayout) goto _L6; else goto _L5
		//   24   43:aload_0         
		//   25   44:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//   26   47:getfield        #142 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
		//   27   50:ifeq            70
_L5:
			view1 = view;
		//   28   53:aload           4
		//   29   55:astore          5
			if(getPosition(view2) <= i) goto _L4; else goto _L6
		//   30   57:aload_0         
		//   31   58:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//   32   61:aload           6
		//   33   63:invokevirtual   #159 <Method int StaggeredGridLayoutManager.getPosition(View)>
		//   34   66:iload_1         
		//   35   67:icmple          97
_L6:
			if(mReverseLayout || getPosition(view2) < i) goto _L8; else goto _L7
		//   36   70:aload_0         
		//   37   71:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//   38   74:getfield        #142 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
		//   39   77:ifne            100
		//   40   80:aload_0         
		//   41   81:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//   42   84:aload           6
		//   43   86:invokevirtual   #159 <Method int StaggeredGridLayoutManager.getPosition(View)>
		//   44   89:iload_1         
		//   45   90:icmplt          100
_L7:
			view1 = view;
		//   46   93:aload           4
		//   47   95:astore          5
_L4:
			return view1;
		//   48   97:aload           5
		//   49   99:areturn         
_L8:
			view1 = view;
		//   50  100:aload           4
		//   51  102:astore          5
			if(!view2.hasFocusable()) goto _L4; else goto _L9
		//   52  104:aload           6
		//   53  106:invokevirtual   #169 <Method boolean View.hasFocusable()>
		//   54  109:ifeq            97
_L9:
			view = view2;
		//   55  112:aload           6
		//   56  114:astore          4
			j++;
		//   57  116:iload_2         
		//   58  117:iconst_1        
		//   59  118:iadd            
		//   60  119:istore_2        
			  goto _L10
		//*  61  120:goto            21
_L2:
			j = mViews.size() - 1;
		//   62  123:aload_0         
		//   63  124:getfield        #31  <Field ArrayList mViews>
		//   64  127:invokevirtual   #60  <Method int ArrayList.size()>
		//   65  130:iconst_1        
		//   66  131:isub            
		//   67  132:istore_2        
			view = view1;
		//   68  133:aload           5
		//   69  135:astore          4
_L15:
			view1 = view;
		//   70  137:aload           4
		//   71  139:astore          5
			if(j < 0) goto _L4; else goto _L11
		//   72  141:iload_2         
		//   73  142:iflt            97
_L11:
			view2 = (View)mViews.get(j);
		//   74  145:aload_0         
		//   75  146:getfield        #31  <Field ArrayList mViews>
		//   76  149:iload_2         
		//   77  150:invokevirtual   #100 <Method Object ArrayList.get(int)>
		//   78  153:checkcast       #102 <Class View>
		//   79  156:astore          6
			if(!mReverseLayout)
				break; /* Loop/switch isn't completed */
		//   80  158:aload_0         
		//   81  159:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//   82  162:getfield        #142 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
		//   83  165:ifeq            185
			view1 = view;
		//   84  168:aload           4
		//   85  170:astore          5
			if(getPosition(view2) >= i) goto _L4; else goto _L12
		//   86  172:aload_0         
		//   87  173:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//   88  176:aload           6
		//   89  178:invokevirtual   #159 <Method int StaggeredGridLayoutManager.getPosition(View)>
		//   90  181:iload_1         
		//   91  182:icmpge          97
_L12:
			if(mReverseLayout)
				break; /* Loop/switch isn't completed */
		//   92  185:aload_0         
		//   93  186:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//   94  189:getfield        #142 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
		//   95  192:ifne            212
			view1 = view;
		//   96  195:aload           4
		//   97  197:astore          5
			if(getPosition(view2) <= i) goto _L4; else goto _L13
		//   98  199:aload_0         
		//   99  200:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//  100  203:aload           6
		//  101  205:invokevirtual   #159 <Method int StaggeredGridLayoutManager.getPosition(View)>
		//  102  208:iload_1         
		//  103  209:icmple          97
_L13:
			view1 = view;
		//  104  212:aload           4
		//  105  214:astore          5
			if(!view2.hasFocusable()) goto _L4; else goto _L14
		//  106  216:aload           6
		//  107  218:invokevirtual   #169 <Method boolean View.hasFocusable()>
		//  108  221:ifeq            97
_L14:
			view = view2;
		//  109  224:aload           6
		//  110  226:astore          4
			j--;
		//  111  228:iload_2         
		//  112  229:iconst_1        
		//  113  230:isub            
		//  114  231:istore_2        
			  goto _L15
		//* 115  232:goto            137
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
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		super();
	//    2    2:aload_0         
	//    3    3:invokespecial   #91  <Method void RecyclerView$LayoutManager()>
		mSpanCount = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #93  <Field int mSpanCount>
		mReverseLayout = false;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #95  <Field boolean mReverseLayout>
		mShouldReverseLayout = false;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #97  <Field boolean mShouldReverseLayout>
		mPendingScrollPosition = -1;
	//   13   21:aload_0         
	//   14   22:iconst_m1       
	//   15   23:putfield        #99  <Field int mPendingScrollPosition>
		mPendingScrollPositionOffset = 0x80000000;
	//   16   26:aload_0         
	//   17   27:ldc1            #43  <Int 0x80000000>
	//   18   29:putfield        #101 <Field int mPendingScrollPositionOffset>
		mLazySpanLookup = new LazySpanLookup();
	//   19   32:aload_0         
	//   20   33:new             #16  <Class StaggeredGridLayoutManager$LazySpanLookup>
	//   21   36:dup             
	//   22   37:invokespecial   #102 <Method void StaggeredGridLayoutManager$LazySpanLookup()>
	//   23   40:putfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
		mGapStrategy = 2;
	//   24   43:aload_0         
	//   25   44:iconst_2        
	//   26   45:putfield        #106 <Field int mGapStrategy>
		mTmpRect = new Rect();
	//   27   48:aload_0         
	//   28   49:new             #108 <Class Rect>
	//   29   52:dup             
	//   30   53:invokespecial   #109 <Method void Rect()>
	//   31   56:putfield        #111 <Field Rect mTmpRect>
		mAnchorInfo = new AnchorInfo();
	//   32   59:aload_0         
	//   33   60:new             #10  <Class StaggeredGridLayoutManager$AnchorInfo>
	//   34   63:dup             
	//   35   64:aload_0         
	//   36   65:invokespecial   #114 <Method void StaggeredGridLayoutManager$AnchorInfo(StaggeredGridLayoutManager)>
	//   37   68:putfield        #116 <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
		mLaidOutInvalidFullSpan = false;
	//   38   71:aload_0         
	//   39   72:iconst_0        
	//   40   73:putfield        #118 <Field boolean mLaidOutInvalidFullSpan>
		mSmoothScrollbarEnabled = true;
	//   41   76:aload_0         
	//   42   77:iconst_1        
	//   43   78:putfield        #120 <Field boolean mSmoothScrollbarEnabled>
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
	//   44   81:aload_0         
	//   45   82:new             #8   <Class StaggeredGridLayoutManager$1>
	//   46   85:dup             
	//   47   86:aload_0         
	//   48   87:invokespecial   #121 <Method void StaggeredGridLayoutManager$1(StaggeredGridLayoutManager)>
	//   49   90:putfield        #123 <Field Runnable mCheckForGapsRunnable>
		mOrientation = j;
	//   50   93:aload_0         
	//   51   94:iload_2         
	//   52   95:putfield        #125 <Field int mOrientation>
		setSpanCount(i);
	//   53   98:aload_0         
	//   54   99:iload_1         
	//   55  100:invokevirtual   #129 <Method void setSpanCount(int)>
		if(mGapStrategy == 0)
	//*  56  103:aload_0         
	//*  57  104:getfield        #106 <Field int mGapStrategy>
	//*  58  107:ifeq            131
	//*  59  110:aload_0         
	//*  60  111:iload_3         
	//*  61  112:invokevirtual   #133 <Method void setAutoMeasureEnabled(boolean)>
	//*  62  115:aload_0         
	//*  63  116:new             #135 <Class LayoutState>
	//*  64  119:dup             
	//*  65  120:invokespecial   #136 <Method void LayoutState()>
	//*  66  123:putfield        #138 <Field LayoutState mLayoutState>
	//*  67  126:aload_0         
	//*  68  127:invokespecial   #141 <Method void createOrientationHelpers()>
	//*  69  130:return          
			flag = false;
	//   70  131:iconst_0        
	//   71  132:istore_3        
		setAutoMeasureEnabled(flag);
		mLayoutState = new LayoutState();
		createOrientationHelpers();
	//*  72  133:goto            110
	}

	public StaggeredGridLayoutManager(Context context, AttributeSet attributeset, int i, int j)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		super();
	//    2    3:aload_0         
	//    3    4:invokespecial   #91  <Method void RecyclerView$LayoutManager()>
		mSpanCount = -1;
	//    4    7:aload_0         
	//    5    8:iconst_m1       
	//    6    9:putfield        #93  <Field int mSpanCount>
		mReverseLayout = false;
	//    7   12:aload_0         
	//    8   13:iconst_0        
	//    9   14:putfield        #95  <Field boolean mReverseLayout>
		mShouldReverseLayout = false;
	//   10   17:aload_0         
	//   11   18:iconst_0        
	//   12   19:putfield        #97  <Field boolean mShouldReverseLayout>
		mPendingScrollPosition = -1;
	//   13   22:aload_0         
	//   14   23:iconst_m1       
	//   15   24:putfield        #99  <Field int mPendingScrollPosition>
		mPendingScrollPositionOffset = 0x80000000;
	//   16   27:aload_0         
	//   17   28:ldc1            #43  <Int 0x80000000>
	//   18   30:putfield        #101 <Field int mPendingScrollPositionOffset>
		mLazySpanLookup = new LazySpanLookup();
	//   19   33:aload_0         
	//   20   34:new             #16  <Class StaggeredGridLayoutManager$LazySpanLookup>
	//   21   37:dup             
	//   22   38:invokespecial   #102 <Method void StaggeredGridLayoutManager$LazySpanLookup()>
	//   23   41:putfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
		mGapStrategy = 2;
	//   24   44:aload_0         
	//   25   45:iconst_2        
	//   26   46:putfield        #106 <Field int mGapStrategy>
		mTmpRect = new Rect();
	//   27   49:aload_0         
	//   28   50:new             #108 <Class Rect>
	//   29   53:dup             
	//   30   54:invokespecial   #109 <Method void Rect()>
	//   31   57:putfield        #111 <Field Rect mTmpRect>
		mAnchorInfo = new AnchorInfo();
	//   32   60:aload_0         
	//   33   61:new             #10  <Class StaggeredGridLayoutManager$AnchorInfo>
	//   34   64:dup             
	//   35   65:aload_0         
	//   36   66:invokespecial   #114 <Method void StaggeredGridLayoutManager$AnchorInfo(StaggeredGridLayoutManager)>
	//   37   69:putfield        #116 <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
		mLaidOutInvalidFullSpan = false;
	//   38   72:aload_0         
	//   39   73:iconst_0        
	//   40   74:putfield        #118 <Field boolean mLaidOutInvalidFullSpan>
		mSmoothScrollbarEnabled = true;
	//   41   77:aload_0         
	//   42   78:iconst_1        
	//   43   79:putfield        #120 <Field boolean mSmoothScrollbarEnabled>
		mCheckForGapsRunnable = new _cls1();
	//   44   82:aload_0         
	//   45   83:new             #8   <Class StaggeredGridLayoutManager$1>
	//   46   86:dup             
	//   47   87:aload_0         
	//   48   88:invokespecial   #121 <Method void StaggeredGridLayoutManager$1(StaggeredGridLayoutManager)>
	//   49   91:putfield        #123 <Field Runnable mCheckForGapsRunnable>
		context = ((Context) (getProperties(context, attributeset, i, j)));
	//   50   94:aload_1         
	//   51   95:aload_2         
	//   52   96:iload_3         
	//   53   97:iload           4
	//   54   99:invokestatic    #147 <Method RecyclerView$LayoutManager$Properties getProperties(Context, AttributeSet, int, int)>
	//   55  102:astore_1        
		setOrientation(((RecyclerView.LayoutManager.Properties) (context)).orientation);
	//   56  103:aload_0         
	//   57  104:aload_1         
	//   58  105:getfield        #152 <Field int RecyclerView$LayoutManager$Properties.orientation>
	//   59  108:invokevirtual   #155 <Method void setOrientation(int)>
		setSpanCount(((RecyclerView.LayoutManager.Properties) (context)).spanCount);
	//   60  111:aload_0         
	//   61  112:aload_1         
	//   62  113:getfield        #158 <Field int RecyclerView$LayoutManager$Properties.spanCount>
	//   63  116:invokevirtual   #129 <Method void setSpanCount(int)>
		setReverseLayout(((RecyclerView.LayoutManager.Properties) (context)).reverseLayout);
	//   64  119:aload_0         
	//   65  120:aload_1         
	//   66  121:getfield        #161 <Field boolean RecyclerView$LayoutManager$Properties.reverseLayout>
	//   67  124:invokevirtual   #164 <Method void setReverseLayout(boolean)>
		if(mGapStrategy == 0)
	//*  68  127:aload_0         
	//*  69  128:getfield        #106 <Field int mGapStrategy>
	//*  70  131:ifeq            156
	//*  71  134:aload_0         
	//*  72  135:iload           5
	//*  73  137:invokevirtual   #133 <Method void setAutoMeasureEnabled(boolean)>
	//*  74  140:aload_0         
	//*  75  141:new             #135 <Class LayoutState>
	//*  76  144:dup             
	//*  77  145:invokespecial   #136 <Method void LayoutState()>
	//*  78  148:putfield        #138 <Field LayoutState mLayoutState>
	//*  79  151:aload_0         
	//*  80  152:invokespecial   #141 <Method void createOrientationHelpers()>
	//*  81  155:return          
			flag = false;
	//   82  156:iconst_0        
	//   83  157:istore          5
		setAutoMeasureEnabled(flag);
		mLayoutState = new LayoutState();
		createOrientationHelpers();
	//*  84  159:goto            134
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
	//    8   12:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//    9   15:iload_2         
	//   10   16:aaload          
	//   11   17:aload_1         
	//   12   18:invokevirtual   #171 <Method void StaggeredGridLayoutManager$Span.appendToSpan(View)>

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
	//*   1    1:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*   2    4:getfield        #178 <Field int StaggeredGridLayoutManager$SavedState.mSpanOffsetsSize>
	//*   3    7:ifle            137
			if(mPendingSavedState.mSpanOffsetsSize == mSpanCount)
	//*   4   10:aload_0         
	//*   5   11:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*   6   14:getfield        #178 <Field int StaggeredGridLayoutManager$SavedState.mSpanOffsetsSize>
	//*   7   17:aload_0         
	//*   8   18:getfield        #93  <Field int mSpanCount>
	//*   9   21:icmpne          116
			{
				int j = 0;
	//   10   24:iconst_0        
	//   11   25:istore_3        
				while(j < mSpanCount) 
	//*  12   26:iload_3         
	//*  13   27:aload_0         
	//*  14   28:getfield        #93  <Field int mSpanCount>
	//*  15   31:icmpge          137
				{
					mSpans[j].clear();
	//   16   34:aload_0         
	//   17   35:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   18   38:iload_3         
	//   19   39:aaload          
	//   20   40:invokevirtual   #181 <Method void StaggeredGridLayoutManager$Span.clear()>
					int k = mPendingSavedState.mSpanOffsets[j];
	//   21   43:aload_0         
	//   22   44:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   23   47:getfield        #184 <Field int[] StaggeredGridLayoutManager$SavedState.mSpanOffsets>
	//   24   50:iload_3         
	//   25   51:iaload          
	//   26   52:istore          4
					int i = k;
	//   27   54:iload           4
	//   28   56:istore_2        
					if(k != 0x80000000)
	//*  29   57:iload           4
	//*  30   59:ldc1            #43  <Int 0x80000000>
	//*  31   61:icmpeq          85
						if(mPendingSavedState.mAnchorLayoutFromEnd)
	//*  32   64:aload_0         
	//*  33   65:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  34   68:getfield        #187 <Field boolean StaggeredGridLayoutManager$SavedState.mAnchorLayoutFromEnd>
	//*  35   71:ifeq            102
							i = k + mPrimaryOrientation.getEndAfterPadding();
	//   36   74:iload           4
	//   37   76:aload_0         
	//   38   77:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   39   80:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//   40   83:iadd            
	//   41   84:istore_2        
						else
	//*  42   85:aload_0         
	//*  43   86:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//*  44   89:iload_3         
	//*  45   90:aaload          
	//*  46   91:iload_2         
	//*  47   92:invokevirtual   #198 <Method void StaggeredGridLayoutManager$Span.setLine(int)>
	//*  48   95:iload_3         
	//*  49   96:iconst_1        
	//*  50   97:iadd            
	//*  51   98:istore_3        
	//*  52   99:goto            26
							i = k + mPrimaryOrientation.getStartAfterPadding();
	//   53  102:iload           4
	//   54  104:aload_0         
	//   55  105:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   56  108:invokevirtual   #201 <Method int OrientationHelper.getStartAfterPadding()>
	//   57  111:iadd            
	//   58  112:istore_2        
					mSpans[j].setLine(i);
					j++;
				}
			} else
	//*  59  113:goto            85
			{
				mPendingSavedState.invalidateSpanInfo();
	//   60  116:aload_0         
	//   61  117:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   62  120:invokevirtual   #204 <Method void StaggeredGridLayoutManager$SavedState.invalidateSpanInfo()>
				mPendingSavedState.mAnchorPosition = mPendingSavedState.mVisibleAnchorPosition;
	//   63  123:aload_0         
	//   64  124:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   65  127:aload_0         
	//   66  128:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   67  131:getfield        #207 <Field int StaggeredGridLayoutManager$SavedState.mVisibleAnchorPosition>
	//   68  134:putfield        #210 <Field int StaggeredGridLayoutManager$SavedState.mAnchorPosition>
			}
		mLastLayoutRTL = mPendingSavedState.mLastLayoutRTL;
	//   69  137:aload_0         
	//   70  138:aload_0         
	//   71  139:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   72  142:getfield        #212 <Field boolean StaggeredGridLayoutManager$SavedState.mLastLayoutRTL>
	//   73  145:putfield        #213 <Field boolean mLastLayoutRTL>
		setReverseLayout(mPendingSavedState.mReverseLayout);
	//   74  148:aload_0         
	//   75  149:aload_0         
	//   76  150:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   77  153:getfield        #214 <Field boolean StaggeredGridLayoutManager$SavedState.mReverseLayout>
	//   78  156:invokevirtual   #164 <Method void setReverseLayout(boolean)>
		resolveShouldLayoutReverse();
	//   79  159:aload_0         
	//   80  160:invokespecial   #217 <Method void resolveShouldLayoutReverse()>
		if(mPendingSavedState.mAnchorPosition != -1)
	//*  81  163:aload_0         
	//*  82  164:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  83  167:getfield        #210 <Field int StaggeredGridLayoutManager$SavedState.mAnchorPosition>
	//*  84  170:iconst_m1       
	//*  85  171:icmpeq          236
		{
			mPendingScrollPosition = mPendingSavedState.mAnchorPosition;
	//   86  174:aload_0         
	//   87  175:aload_0         
	//   88  176:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   89  179:getfield        #210 <Field int StaggeredGridLayoutManager$SavedState.mAnchorPosition>
	//   90  182:putfield        #99  <Field int mPendingScrollPosition>
			anchorinfo.mLayoutFromEnd = mPendingSavedState.mAnchorLayoutFromEnd;
	//   91  185:aload_1         
	//   92  186:aload_0         
	//   93  187:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   94  190:getfield        #187 <Field boolean StaggeredGridLayoutManager$SavedState.mAnchorLayoutFromEnd>
	//   95  193:putfield        #220 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
		} else
	//*  96  196:aload_0         
	//*  97  197:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  98  200:getfield        #223 <Field int StaggeredGridLayoutManager$SavedState.mSpanLookupSize>
	//*  99  203:iconst_1        
	//* 100  204:icmple          235
	//* 101  207:aload_0         
	//* 102  208:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//* 103  211:aload_0         
	//* 104  212:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//* 105  215:getfield        #226 <Field int[] StaggeredGridLayoutManager$SavedState.mSpanLookup>
	//* 106  218:putfield        #229 <Field int[] StaggeredGridLayoutManager$LazySpanLookup.mData>
	//* 107  221:aload_0         
	//* 108  222:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//* 109  225:aload_0         
	//* 110  226:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//* 111  229:getfield        #233 <Field List StaggeredGridLayoutManager$SavedState.mFullSpanItems>
	//* 112  232:putfield        #234 <Field List StaggeredGridLayoutManager$LazySpanLookup.mFullSpanItems>
	//* 113  235:return          
		{
			anchorinfo.mLayoutFromEnd = mShouldReverseLayout;
	//  114  236:aload_1         
	//  115  237:aload_0         
	//  116  238:getfield        #97  <Field boolean mShouldReverseLayout>
	//  117  241:putfield        #220 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
		}
		if(mPendingSavedState.mSpanLookupSize > 1)
		{
			mLazySpanLookup.mData = mPendingSavedState.mSpanLookup;
			mLazySpanLookup.mFullSpanItems = mPendingSavedState.mFullSpanItems;
		}
	//* 118  244:goto            196
	}

	private void attachViewToSpans(View view, LayoutParams layoutparams, LayoutState layoutstate)
	{
		if(layoutstate.mLayoutDirection == 1)
	//*   0    0:aload_3         
	//*   1    1:getfield        #239 <Field int LayoutState.mLayoutDirection>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          30
			if(layoutparams.mFullSpan)
	//*   4    8:aload_2         
	//*   5    9:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*   6   12:ifeq            21
			{
				appendViewToAllSpans(view);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #244 <Method void appendViewToAllSpans(View)>
				return;
	//   10   20:return          
			} else
			{
				layoutparams.mSpan.appendToSpan(view);
	//   11   21:aload_2         
	//   12   22:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #171 <Method void StaggeredGridLayoutManager$Span.appendToSpan(View)>
				return;
	//   15   29:return          
			}
		if(layoutparams.mFullSpan)
	//*  16   30:aload_2         
	//*  17   31:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*  18   34:ifeq            43
		{
			prependViewToAllSpans(view);
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:invokespecial   #251 <Method void prependViewToAllSpans(View)>
			return;
	//   22   42:return          
		} else
		{
			layoutparams.mSpan.prependToSpan(view);
	//   23   43:aload_2         
	//   24   44:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//   25   47:aload_1         
	//   26   48:invokevirtual   #254 <Method void StaggeredGridLayoutManager$Span.prependToSpan(View)>
			return;
	//   27   51:return          
		}
	}

	private int calculateScrollDirectionForPosition(int i)
	{
		byte byte0 = -1;
	//    0    0:iconst_m1       
	//    1    1:istore_2        
		if(getChildCount() == 0)
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #259 <Method int getChildCount()>
	//*   4    6:ifne            20
			return !mShouldReverseLayout ? -1 : 1;
	//    5    9:aload_0         
	//    6   10:getfield        #97  <Field boolean mShouldReverseLayout>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_m1       
	//   11   19:ireturn         
		boolean flag;
		if(i < getFirstChildPosition())
	//*  12   20:iload_1         
	//*  13   21:aload_0         
	//*  14   22:invokevirtual   #262 <Method int getFirstChildPosition()>
	//*  15   25:icmpge          42
			flag = true;
	//   16   28:iconst_1        
	//   17   29:istore_3        
		else
	//*  18   30:iload_3         
	//*  19   31:aload_0         
	//*  20   32:getfield        #97  <Field boolean mShouldReverseLayout>
	//*  21   35:icmpeq          47
	//*  22   38:iload_2         
	//*  23   39:istore_1        
	//*  24   40:iload_1         
	//*  25   41:ireturn         
			flag = false;
	//   26   42:iconst_0        
	//   27   43:istore_3        
		if(flag != mShouldReverseLayout)
			i = ((int) (byte0));
		else
	//*  28   44:goto            30
			i = 1;
	//   29   47:iconst_1        
	//   30   48:istore_1        
		return i;
	//*  31   49:goto            40
	}

	private boolean checkSpanForGap(Span span)
	{
		if(!mShouldReverseLayout) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field boolean mShouldReverseLayout>
	//    2    4:ifeq            54
_L1:
		if(span.getEndLine() >= mPrimaryOrientation.getEndAfterPadding())
			break MISSING_BLOCK_LABEL_91;
	//    3    7:aload_1         
	//    4    8:invokevirtual   #267 <Method int StaggeredGridLayoutManager$Span.getEndLine()>
	//    5   11:aload_0         
	//    6   12:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//    7   15:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//    8   18:icmpge          91
		if(span.getLayoutParams((View)span.mViews.get(span.mViews.size() - 1)).mFullSpan) goto _L4; else goto _L3
	//    9   21:aload_1         
	//   10   22:aload_1         
	//   11   23:getfield        #271 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//   12   26:aload_1         
	//   13   27:getfield        #271 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//   14   30:invokevirtual   #276 <Method int ArrayList.size()>
	//   15   33:iconst_1        
	//   16   34:isub            
	//   17   35:invokevirtual   #280 <Method Object ArrayList.get(int)>
	//   18   38:checkcast       #282 <Class View>
	//   19   41:invokevirtual   #286 <Method StaggeredGridLayoutManager$LayoutParams StaggeredGridLayoutManager$Span.getLayoutParams(View)>
	//   20   44:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//   21   47:ifne            52
_L3:
		return true;
	//   22   50:iconst_1        
	//   23   51:ireturn         
_L4:
		return false;
	//   24   52:iconst_0        
	//   25   53:ireturn         
_L2:
		if(span.getStartLine() <= mPrimaryOrientation.getStartAfterPadding())
			break MISSING_BLOCK_LABEL_91;
	//   26   54:aload_1         
	//   27   55:invokevirtual   #289 <Method int StaggeredGridLayoutManager$Span.getStartLine()>
	//   28   58:aload_0         
	//   29   59:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   30   62:invokevirtual   #201 <Method int OrientationHelper.getStartAfterPadding()>
	//   31   65:icmple          91
		if(!span.getLayoutParams((View)span.mViews.get(0)).mFullSpan) goto _L3; else goto _L5
	//   32   68:aload_1         
	//   33   69:aload_1         
	//   34   70:getfield        #271 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//   35   73:iconst_0        
	//   36   74:invokevirtual   #280 <Method Object ArrayList.get(int)>
	//   37   77:checkcast       #282 <Class View>
	//   38   80:invokevirtual   #286 <Method StaggeredGridLayoutManager$LayoutParams StaggeredGridLayoutManager$Span.getLayoutParams(View)>
	//   39   83:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//   40   86:ifeq            50
_L5:
		return false;
	//   41   89:iconst_0        
	//   42   90:ireturn         
		return false;
	//   43   91:iconst_0        
	//   44   92:ireturn         
	}

	private int computeScrollExtent(RecyclerView.State state)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		if(getChildCount() == 0)
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #259 <Method int getChildCount()>
	//*   4    6:ifne            11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		OrientationHelper orientationhelper = mPrimaryOrientation;
	//    7   11:aload_0         
	//    8   12:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//    9   15:astore          4
		boolean flag;
		View view;
		if(!mSmoothScrollbarEnabled)
	//*  10   17:aload_0         
	//*  11   18:getfield        #120 <Field boolean mSmoothScrollbarEnabled>
	//*  12   21:ifne            61
			flag = true;
	//   13   24:iconst_1        
	//   14   25:istore_2        
		else
	//*  15   26:aload_0         
	//*  16   27:iload_2         
	//*  17   28:invokevirtual   #295 <Method View findFirstVisibleItemClosestToStart(boolean)>
	//*  18   31:astore          5
	//*  19   33:aload_0         
	//*  20   34:getfield        #120 <Field boolean mSmoothScrollbarEnabled>
	//*  21   37:ifne            66
	//*  22   40:iload_3         
	//*  23   41:istore_2        
	//*  24   42:aload_1         
	//*  25   43:aload           4
	//*  26   45:aload           5
	//*  27   47:aload_0         
	//*  28   48:iload_2         
	//*  29   49:invokevirtual   #298 <Method View findFirstVisibleItemClosestToEnd(boolean)>
	//*  30   52:aload_0         
	//*  31   53:aload_0         
	//*  32   54:getfield        #120 <Field boolean mSmoothScrollbarEnabled>
	//*  33   57:invokestatic    #303 <Method int ScrollbarHelper.computeScrollExtent(RecyclerView$State, OrientationHelper, View, View, RecyclerView$LayoutManager, boolean)>
	//*  34   60:ireturn         
			flag = false;
	//   35   61:iconst_0        
	//   36   62:istore_2        
		view = findFirstVisibleItemClosestToStart(flag);
		if(!mSmoothScrollbarEnabled)
			flag = flag1;
		else
	//*  37   63:goto            26
			flag = false;
	//   38   66:iconst_0        
	//   39   67:istore_2        
		return ScrollbarHelper.computeScrollExtent(state, orientationhelper, view, findFirstVisibleItemClosestToEnd(flag), ((RecyclerView.LayoutManager) (this)), mSmoothScrollbarEnabled);
	//*  40   68:goto            42
	}

	private int computeScrollOffset(RecyclerView.State state)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		if(getChildCount() == 0)
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #259 <Method int getChildCount()>
	//*   4    6:ifne            11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		OrientationHelper orientationhelper = mPrimaryOrientation;
	//    7   11:aload_0         
	//    8   12:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//    9   15:astore          4
		boolean flag;
		View view;
		if(!mSmoothScrollbarEnabled)
	//*  10   17:aload_0         
	//*  11   18:getfield        #120 <Field boolean mSmoothScrollbarEnabled>
	//*  12   21:ifne            65
			flag = true;
	//   13   24:iconst_1        
	//   14   25:istore_2        
		else
	//*  15   26:aload_0         
	//*  16   27:iload_2         
	//*  17   28:invokevirtual   #295 <Method View findFirstVisibleItemClosestToStart(boolean)>
	//*  18   31:astore          5
	//*  19   33:aload_0         
	//*  20   34:getfield        #120 <Field boolean mSmoothScrollbarEnabled>
	//*  21   37:ifne            70
	//*  22   40:iload_3         
	//*  23   41:istore_2        
	//*  24   42:aload_1         
	//*  25   43:aload           4
	//*  26   45:aload           5
	//*  27   47:aload_0         
	//*  28   48:iload_2         
	//*  29   49:invokevirtual   #298 <Method View findFirstVisibleItemClosestToEnd(boolean)>
	//*  30   52:aload_0         
	//*  31   53:aload_0         
	//*  32   54:getfield        #120 <Field boolean mSmoothScrollbarEnabled>
	//*  33   57:aload_0         
	//*  34   58:getfield        #97  <Field boolean mShouldReverseLayout>
	//*  35   61:invokestatic    #307 <Method int ScrollbarHelper.computeScrollOffset(RecyclerView$State, OrientationHelper, View, View, RecyclerView$LayoutManager, boolean, boolean)>
	//*  36   64:ireturn         
			flag = false;
	//   37   65:iconst_0        
	//   38   66:istore_2        
		view = findFirstVisibleItemClosestToStart(flag);
		if(!mSmoothScrollbarEnabled)
			flag = flag1;
		else
	//*  39   67:goto            26
			flag = false;
	//   40   70:iconst_0        
	//   41   71:istore_2        
		return ScrollbarHelper.computeScrollOffset(state, orientationhelper, view, findFirstVisibleItemClosestToEnd(flag), ((RecyclerView.LayoutManager) (this)), mSmoothScrollbarEnabled, mShouldReverseLayout);
	//*  42   72:goto            42
	}

	private int computeScrollRange(RecyclerView.State state)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		if(getChildCount() == 0)
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #259 <Method int getChildCount()>
	//*   4    6:ifne            11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		OrientationHelper orientationhelper = mPrimaryOrientation;
	//    7   11:aload_0         
	//    8   12:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//    9   15:astore          4
		boolean flag;
		View view;
		if(!mSmoothScrollbarEnabled)
	//*  10   17:aload_0         
	//*  11   18:getfield        #120 <Field boolean mSmoothScrollbarEnabled>
	//*  12   21:ifne            61
			flag = true;
	//   13   24:iconst_1        
	//   14   25:istore_2        
		else
	//*  15   26:aload_0         
	//*  16   27:iload_2         
	//*  17   28:invokevirtual   #295 <Method View findFirstVisibleItemClosestToStart(boolean)>
	//*  18   31:astore          5
	//*  19   33:aload_0         
	//*  20   34:getfield        #120 <Field boolean mSmoothScrollbarEnabled>
	//*  21   37:ifne            66
	//*  22   40:iload_3         
	//*  23   41:istore_2        
	//*  24   42:aload_1         
	//*  25   43:aload           4
	//*  26   45:aload           5
	//*  27   47:aload_0         
	//*  28   48:iload_2         
	//*  29   49:invokevirtual   #298 <Method View findFirstVisibleItemClosestToEnd(boolean)>
	//*  30   52:aload_0         
	//*  31   53:aload_0         
	//*  32   54:getfield        #120 <Field boolean mSmoothScrollbarEnabled>
	//*  33   57:invokestatic    #310 <Method int ScrollbarHelper.computeScrollRange(RecyclerView$State, OrientationHelper, View, View, RecyclerView$LayoutManager, boolean)>
	//*  34   60:ireturn         
			flag = false;
	//   35   61:iconst_0        
	//   36   62:istore_2        
		view = findFirstVisibleItemClosestToStart(flag);
		if(!mSmoothScrollbarEnabled)
			flag = flag1;
		else
	//*  37   63:goto            26
			flag = false;
	//   38   66:iconst_0        
	//   39   67:istore_2        
		return ScrollbarHelper.computeScrollRange(state, orientationhelper, view, findFirstVisibleItemClosestToEnd(flag), ((RecyclerView.LayoutManager) (this)), mSmoothScrollbarEnabled);
	//*  40   68:goto            42
	}

	private int convertFocusDirectionToLayoutDirection(int i)
	{
		byte byte0;
		int j;
		boolean flag;
		byte0 = -1;
	//    0    0:iconst_m1       
	//    1    1:istore_2        
		j = 0x80000000;
	//    2    2:ldc1            #43  <Int 0x80000000>
	//    3    4:istore_3        
		flag = true;
	//    4    5:iconst_1        
	//    5    6:istore          4
		i;
	//    6    8:iload_1         
		JVM INSTR lookupswitch 6: default 68
	//	               1: 73
	//	               2: 94
	//	               17: 142
	//	               33: 115
	//	               66: 154
	//	               130: 128;
	//    7    9:lookupswitch    6: default 68
	//	               1: 73
	//	               2: 94
	//	               17: 142
	//	               33: 115
	//	               66: 154
	//	               130: 128
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
		i = 0x80000000;
	//    8   68:ldc1            #43  <Int 0x80000000>
	//    9   70:istore_1        
_L9:
		return i;
	//   10   71:iload_1         
	//   11   72:ireturn         
_L2:
		i = ((int) (byte0));
	//   12   73:iload_2         
	//   13   74:istore_1        
		if(mOrientation == 1) goto _L9; else goto _L8
	//   14   75:aload_0         
	//   15   76:getfield        #125 <Field int mOrientation>
	//   16   79:iconst_1        
	//   17   80:icmpeq          71
_L8:
		i = ((int) (byte0));
	//   18   83:iload_2         
	//   19   84:istore_1        
		if(!isLayoutRTL()) goto _L9; else goto _L10
	//   20   85:aload_0         
	//   21   86:invokevirtual   #315 <Method boolean isLayoutRTL()>
	//   22   89:ifeq            71
_L10:
		return 1;
	//   23   92:iconst_1        
	//   24   93:ireturn         
_L3:
		if(mOrientation == 1)
	//*  25   94:aload_0         
	//*  26   95:getfield        #125 <Field int mOrientation>
	//*  27   98:iconst_1        
	//*  28   99:icmpne          104
			return 1;
	//   29  102:iconst_1        
	//   30  103:ireturn         
		i = ((int) (byte0));
	//   31  104:iload_2         
	//   32  105:istore_1        
		if(isLayoutRTL()) goto _L9; else goto _L11
	//   33  106:aload_0         
	//   34  107:invokevirtual   #315 <Method boolean isLayoutRTL()>
	//   35  110:ifne            71
_L11:
		return 1;
	//   36  113:iconst_1        
	//   37  114:ireturn         
_L5:
		i = ((int) (byte0));
	//   38  115:iload_2         
	//   39  116:istore_1        
		if(mOrientation == 1) goto _L9; else goto _L12
	//   40  117:aload_0         
	//   41  118:getfield        #125 <Field int mOrientation>
	//   42  121:iconst_1        
	//   43  122:icmpeq          71
_L12:
		return 0x80000000;
	//   44  125:ldc1            #43  <Int 0x80000000>
	//   45  127:ireturn         
_L7:
		i = j;
	//   46  128:iload_3         
	//   47  129:istore_1        
		if(mOrientation == 1)
	//*  48  130:aload_0         
	//*  49  131:getfield        #125 <Field int mOrientation>
	//*  50  134:iconst_1        
	//*  51  135:icmpne          140
			i = 1;
	//   52  138:iconst_1        
	//   53  139:istore_1        
		return i;
	//   54  140:iload_1         
	//   55  141:ireturn         
_L4:
		i = ((int) (byte0));
	//   56  142:iload_2         
	//   57  143:istore_1        
		if(mOrientation == 0) goto _L9; else goto _L13
	//   58  144:aload_0         
	//   59  145:getfield        #125 <Field int mOrientation>
	//   60  148:ifeq            71
_L13:
		return 0x80000000;
	//   61  151:ldc1            #43  <Int 0x80000000>
	//   62  153:ireturn         
_L6:
		if(mOrientation == 0)
	//*  63  154:aload_0         
	//*  64  155:getfield        #125 <Field int mOrientation>
	//*  65  158:ifne            166
			i = ((int) (flag));
	//   66  161:iload           4
	//   67  163:istore_1        
		else
	//*  68  164:iload_1         
	//*  69  165:ireturn         
			i = 0x80000000;
	//   70  166:ldc1            #43  <Int 0x80000000>
	//   71  168:istore_1        
		return i;
	//*  72  169:goto            164
	}

	private LazySpanLookup.FullSpanItem createFullSpanItemFromEnd(int i)
	{
		LazySpanLookup.FullSpanItem fullspanitem = new LazySpanLookup.FullSpanItem();
	//    0    0:new             #19  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//    1    3:dup             
	//    2    4:invokespecial   #318 <Method void StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem()>
	//    3    7:astore_3        
		fullspanitem.mGapPerSpan = new int[mSpanCount];
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #93  <Field int mSpanCount>
	//    7   13:newarray        int[]
	//    8   15:putfield        #321 <Field int[] StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapPerSpan>
		for(int j = 0; j < mSpanCount; j++)
	//*   9   18:iconst_0        
	//*  10   19:istore_2        
	//*  11   20:iload_2         
	//*  12   21:aload_0         
	//*  13   22:getfield        #93  <Field int mSpanCount>
	//*  14   25:icmpge          53
			fullspanitem.mGapPerSpan[j] = i - mSpans[j].getEndLine(i);
	//   15   28:aload_3         
	//   16   29:getfield        #321 <Field int[] StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapPerSpan>
	//   17   32:iload_2         
	//   18   33:iload_1         
	//   19   34:aload_0         
	//   20   35:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   21   38:iload_2         
	//   22   39:aaload          
	//   23   40:iload_1         
	//   24   41:invokevirtual   #323 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
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
	//    2    4:invokespecial   #318 <Method void StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem()>
	//    3    7:astore_3        
		fullspanitem.mGapPerSpan = new int[mSpanCount];
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #93  <Field int mSpanCount>
	//    7   13:newarray        int[]
	//    8   15:putfield        #321 <Field int[] StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapPerSpan>
		for(int j = 0; j < mSpanCount; j++)
	//*   9   18:iconst_0        
	//*  10   19:istore_2        
	//*  11   20:iload_2         
	//*  12   21:aload_0         
	//*  13   22:getfield        #93  <Field int mSpanCount>
	//*  14   25:icmpge          53
			fullspanitem.mGapPerSpan[j] = mSpans[j].getStartLine(i) - i;
	//   15   28:aload_3         
	//   16   29:getfield        #321 <Field int[] StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapPerSpan>
	//   17   32:iload_2         
	//   18   33:aload_0         
	//   19   34:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   20   37:iload_2         
	//   21   38:aaload          
	//   22   39:iload_1         
	//   23   40:invokevirtual   #326 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
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
	//    4    6:invokestatic    #330 <Method OrientationHelper OrientationHelper.createOrientationHelper(RecyclerView$LayoutManager, int)>
	//    5    9:putfield        #189 <Field OrientationHelper mPrimaryOrientation>
		mSecondaryOrientation = OrientationHelper.createOrientationHelper(((RecyclerView.LayoutManager) (this)), 1 - mOrientation);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:aload_0         
	//   10   16:getfield        #125 <Field int mOrientation>
	//   11   19:isub            
	//   12   20:invokestatic    #330 <Method OrientationHelper OrientationHelper.createOrientationHelper(RecyclerView$LayoutManager, int)>
	//   13   23:putfield        #332 <Field OrientationHelper mSecondaryOrientation>
	//   14   26:return          
	}

	private int fill(RecyclerView.Recycler recycler, LayoutState layoutstate, RecyclerView.State state)
	{
		mRemainingSpans.set(0, mSpanCount, true);
	//    0    0:aload_0         
	//    1    1:getfield        #336 <Field BitSet mRemainingSpans>
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:getfield        #93  <Field int mSpanCount>
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #342 <Method void BitSet.set(int, int, boolean)>
		int i;
		int j;
		int k;
		if(mLayoutState.mInfinite)
	//*   7   13:aload_0         
	//*   8   14:getfield        #138 <Field LayoutState mLayoutState>
	//*   9   17:getfield        #345 <Field boolean LayoutState.mInfinite>
	//*  10   20:ifeq            491
		{
			if(layoutstate.mLayoutDirection == 1)
	//*  11   23:aload_2         
	//*  12   24:getfield        #239 <Field int LayoutState.mLayoutDirection>
	//*  13   27:iconst_1        
	//*  14   28:icmpne          484
				i = 0x7fffffff;
	//   15   31:ldc2            #346 <Int 0x7fffffff>
	//   16   34:istore          4
			else
	//*  17   36:aload_0         
	//*  18   37:aload_2         
	//*  19   38:getfield        #239 <Field int LayoutState.mLayoutDirection>
	//*  20   41:iload           4
	//*  21   43:invokespecial   #349 <Method void updateAllRemainingSpans(int, int)>
	//*  22   46:aload_0         
	//*  23   47:getfield        #97  <Field boolean mShouldReverseLayout>
	//*  24   50:ifeq            527
	//*  25   53:aload_0         
	//*  26   54:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//*  27   57:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//*  28   60:istore          6
	//*  29   62:iconst_0        
	//*  30   63:istore          5
	//*  31   65:aload_2         
	//*  32   66:aload_3         
	//*  33   67:invokevirtual   #353 <Method boolean LayoutState.hasMore(RecyclerView$State)>
	//*  34   70:ifeq            917
	//*  35   73:aload_0         
	//*  36   74:getfield        #138 <Field LayoutState mLayoutState>
	//*  37   77:getfield        #345 <Field boolean LayoutState.mInfinite>
	//*  38   80:ifne            93
	//*  39   83:aload_0         
	//*  40   84:getfield        #336 <Field BitSet mRemainingSpans>
	//*  41   87:invokevirtual   #356 <Method boolean BitSet.isEmpty()>
	//*  42   90:ifne            917
	//*  43   93:aload_2         
	//*  44   94:aload_1         
	//*  45   95:invokevirtual   #360 <Method View LayoutState.next(RecyclerView$Recycler)>
	//*  46   98:astore          13
	//*  47  100:aload           13
	//*  48  102:invokevirtual   #363 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  49  105:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//*  50  108:astore          14
	//*  51  110:aload           14
	//*  52  112:invokevirtual   #366 <Method int StaggeredGridLayoutManager$LayoutParams.getViewLayoutPosition()>
	//*  53  115:istore          11
	//*  54  117:aload_0         
	//*  55  118:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//*  56  121:iload           11
	//*  57  123:invokevirtual   #369 <Method int StaggeredGridLayoutManager$LazySpanLookup.getSpan(int)>
	//*  58  126:istore          5
	//*  59  128:iload           5
	//*  60  130:iconst_m1       
	//*  61  131:icmpne          539
	//*  62  134:iconst_1        
	//*  63  135:istore          9
	//*  64  137:iload           9
	//*  65  139:ifeq            555
	//*  66  142:aload           14
	//*  67  144:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*  68  147:ifeq            545
	//*  69  150:aload_0         
	//*  70  151:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//*  71  154:iconst_0        
	//*  72  155:aaload          
	//*  73  156:astore          12
	//*  74  158:aload_0         
	//*  75  159:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//*  76  162:iload           11
	//*  77  164:aload           12
	//*  78  166:invokevirtual   #373 <Method void StaggeredGridLayoutManager$LazySpanLookup.setSpan(int, StaggeredGridLayoutManager$Span)>
	//*  79  169:aload           14
	//*  80  171:aload           12
	//*  81  173:putfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//*  82  176:aload_2         
	//*  83  177:getfield        #239 <Field int LayoutState.mLayoutDirection>
	//*  84  180:iconst_1        
	//*  85  181:icmpne          567
	//*  86  184:aload_0         
	//*  87  185:aload           13
	//*  88  187:invokevirtual   #376 <Method void addView(View)>
	//*  89  190:aload_0         
	//*  90  191:aload           13
	//*  91  193:aload           14
	//*  92  195:iconst_0        
	//*  93  196:invokespecial   #380 <Method void measureChildWithDecorationsAndMargin(View, StaggeredGridLayoutManager$LayoutParams, boolean)>
	//*  94  199:aload_2         
	//*  95  200:getfield        #239 <Field int LayoutState.mLayoutDirection>
	//*  96  203:iconst_1        
	//*  97  204:icmpne          589
	//*  98  207:aload           14
	//*  99  209:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 100  212:ifeq            577
	//* 101  215:aload_0         
	//* 102  216:iload           6
	//* 103  218:invokespecial   #383 <Method int getMaxEnd(int)>
	//* 104  221:istore          5
	//* 105  223:iload           5
	//* 106  225:aload_0         
	//* 107  226:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//* 108  229:aload           13
	//* 109  231:invokevirtual   #387 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//* 110  234:iadd            
	//* 111  235:istore          10
	//* 112  237:iload           5
	//* 113  239:istore          7
	//* 114  241:iload           10
	//* 115  243:istore          8
	//* 116  245:iload           9
	//* 117  247:ifeq            304
	//* 118  250:iload           5
	//* 119  252:istore          7
	//* 120  254:iload           10
	//* 121  256:istore          8
	//* 122  258:aload           14
	//* 123  260:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 124  263:ifeq            304
	//* 125  266:aload_0         
	//* 126  267:iload           5
	//* 127  269:invokespecial   #389 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem createFullSpanItemFromEnd(int)>
	//* 128  272:astore          15
	//* 129  274:aload           15
	//* 130  276:iconst_m1       
	//* 131  277:putfield        #392 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapDir>
	//* 132  280:aload           15
	//* 133  282:iload           11
	//* 134  284:putfield        #395 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//* 135  287:aload_0         
	//* 136  288:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//* 137  291:aload           15
	//* 138  293:invokevirtual   #399 <Method void StaggeredGridLayoutManager$LazySpanLookup.addFullSpanItem(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)>
	//* 139  296:iload           10
	//* 140  298:istore          8
	//* 141  300:iload           5
	//* 142  302:istore          7
	//* 143  304:aload           14
	//* 144  306:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 145  309:ifeq            330
	//* 146  312:aload_2         
	//* 147  313:getfield        #402 <Field int LayoutState.mItemDirection>
	//* 148  316:iconst_m1       
	//* 149  317:icmpne          330
	//* 150  320:iload           9
	//* 151  322:ifeq            701
	//* 152  325:aload_0         
	//* 153  326:iconst_1        
	//* 154  327:putfield        #118 <Field boolean mLaidOutInvalidFullSpan>
	//* 155  330:aload_0         
	//* 156  331:aload           13
	//* 157  333:aload           14
	//* 158  335:aload_2         
	//* 159  336:invokespecial   #404 <Method void attachViewToSpans(View, StaggeredGridLayoutManager$LayoutParams, LayoutState)>
	//* 160  339:aload_0         
	//* 161  340:invokevirtual   #315 <Method boolean isLayoutRTL()>
	//* 162  343:ifeq            809
	//* 163  346:aload_0         
	//* 164  347:getfield        #125 <Field int mOrientation>
	//* 165  350:iconst_1        
	//* 166  351:icmpne          809
	//* 167  354:aload           14
	//* 168  356:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 169  359:ifeq            779
	//* 170  362:aload_0         
	//* 171  363:getfield        #332 <Field OrientationHelper mSecondaryOrientation>
	//* 172  366:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//* 173  369:istore          5
	//* 174  371:iload           5
	//* 175  373:aload_0         
	//* 176  374:getfield        #332 <Field OrientationHelper mSecondaryOrientation>
	//* 177  377:aload           13
	//* 178  379:invokevirtual   #387 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//* 179  382:isub            
	//* 180  383:istore          10
	//* 181  385:iload           5
	//* 182  387:istore          9
	//* 183  389:iload           10
	//* 184  391:istore          5
	//* 185  393:aload_0         
	//* 186  394:getfield        #125 <Field int mOrientation>
	//* 187  397:iconst_1        
	//* 188  398:icmpne          866
	//* 189  401:aload_0         
	//* 190  402:aload           13
	//* 191  404:iload           5
	//* 192  406:iload           7
	//* 193  408:iload           9
	//* 194  410:iload           8
	//* 195  412:invokevirtual   #408 <Method void layoutDecoratedWithMargins(View, int, int, int, int)>
	//* 196  415:aload           14
	//* 197  417:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 198  420:ifeq            883
	//* 199  423:aload_0         
	//* 200  424:aload_0         
	//* 201  425:getfield        #138 <Field LayoutState mLayoutState>
	//* 202  428:getfield        #239 <Field int LayoutState.mLayoutDirection>
	//* 203  431:iload           4
	//* 204  433:invokespecial   #349 <Method void updateAllRemainingSpans(int, int)>
	//* 205  436:aload_0         
	//* 206  437:aload_1         
	//* 207  438:aload_0         
	//* 208  439:getfield        #138 <Field LayoutState mLayoutState>
	//* 209  442:invokespecial   #412 <Method void recycle(RecyclerView$Recycler, LayoutState)>
	//* 210  445:aload_0         
	//* 211  446:getfield        #138 <Field LayoutState mLayoutState>
	//* 212  449:getfield        #415 <Field boolean LayoutState.mStopInFocusable>
	//* 213  452:ifeq            478
	//* 214  455:aload           13
	//* 215  457:invokevirtual   #418 <Method boolean View.hasFocusable()>
	//* 216  460:ifeq            478
	//* 217  463:aload           14
	//* 218  465:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 219  468:ifeq            901
	//* 220  471:aload_0         
	//* 221  472:getfield        #336 <Field BitSet mRemainingSpans>
	//* 222  475:invokevirtual   #419 <Method void BitSet.clear()>
	//* 223  478:iconst_1        
	//* 224  479:istore          5
	//* 225  481:goto            65
				i = 0x80000000;
	//  226  484:ldc1            #43  <Int 0x80000000>
	//  227  486:istore          4
		} else
	//* 228  488:goto            36
		if(layoutstate.mLayoutDirection == 1)
	//* 229  491:aload_2         
	//* 230  492:getfield        #239 <Field int LayoutState.mLayoutDirection>
	//* 231  495:iconst_1        
	//* 232  496:icmpne          513
			i = layoutstate.mEndLine + layoutstate.mAvailable;
	//  233  499:aload_2         
	//  234  500:getfield        #422 <Field int LayoutState.mEndLine>
	//  235  503:aload_2         
	//  236  504:getfield        #425 <Field int LayoutState.mAvailable>
	//  237  507:iadd            
	//  238  508:istore          4
		else
	//* 239  510:goto            36
			i = layoutstate.mStartLine - layoutstate.mAvailable;
	//  240  513:aload_2         
	//  241  514:getfield        #428 <Field int LayoutState.mStartLine>
	//  242  517:aload_2         
	//  243  518:getfield        #425 <Field int LayoutState.mAvailable>
	//  244  521:isub            
	//  245  522:istore          4
		updateAllRemainingSpans(layoutstate.mLayoutDirection, i);
		if(mShouldReverseLayout)
			k = mPrimaryOrientation.getEndAfterPadding();
		else
	//* 246  524:goto            36
			k = mPrimaryOrientation.getStartAfterPadding();
	//  247  527:aload_0         
	//  248  528:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  249  531:invokevirtual   #201 <Method int OrientationHelper.getStartAfterPadding()>
	//  250  534:istore          6
		j = 0;
		do
		{
			if(layoutstate.hasMore(state) && (mLayoutState.mInfinite || !mRemainingSpans.isEmpty()))
			{
				View view = layoutstate.next(recycler);
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
				int i2 = layoutparams.getViewLayoutPosition();
				j = mLazySpanLookup.getSpan(i2);
				int l;
				int i1;
				int j1;
				Span span;
				if(j == -1)
					j1 = 1;
				else
	//* 251  536:goto            62
					j1 = 0;
	//  252  539:iconst_0        
	//  253  540:istore          9
				if(j1 != 0)
				{
					int k1;
					LazySpanLookup.FullSpanItem fullspanitem;
					if(layoutparams.mFullSpan)
						span = mSpans[0];
					else
	//* 254  542:goto            137
						span = getNextSpan(layoutstate);
	//  255  545:aload_0         
	//  256  546:aload_2         
	//  257  547:invokespecial   #432 <Method StaggeredGridLayoutManager$Span getNextSpan(LayoutState)>
	//  258  550:astore          12
					mLazySpanLookup.setSpan(i2, span);
				} else
	//* 259  552:goto            158
				{
					span = mSpans[j];
	//  260  555:aload_0         
	//  261  556:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  262  559:iload           5
	//  263  561:aaload          
	//  264  562:astore          12
				}
				layoutparams.mSpan = span;
				if(layoutstate.mLayoutDirection == 1)
					addView(view);
				else
	//* 265  564:goto            169
					addView(view, 0);
	//  266  567:aload_0         
	//  267  568:aload           13
	//  268  570:iconst_0        
	//  269  571:invokevirtual   #435 <Method void addView(View, int)>
				measureChildWithDecorationsAndMargin(view, layoutparams, false);
				if(layoutstate.mLayoutDirection == 1)
				{
					if(layoutparams.mFullSpan)
						j = getMaxEnd(k);
					else
	//* 270  574:goto            190
						j = span.getEndLine(k);
	//  271  577:aload           12
	//  272  579:iload           6
	//  273  581:invokevirtual   #323 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
	//  274  584:istore          5
					k1 = j + mPrimaryOrientation.getDecoratedMeasurement(view);
					l = j;
					i1 = k1;
					if(j1 != 0)
					{
						l = j;
						i1 = k1;
						if(layoutparams.mFullSpan)
						{
							fullspanitem = createFullSpanItemFromEnd(j);
							fullspanitem.mGapDir = -1;
							fullspanitem.mPosition = i2;
							mLazySpanLookup.addFullSpanItem(fullspanitem);
							i1 = k1;
							l = j;
						}
					}
				} else
	//* 275  586:goto            223
				{
					int l1;
					if(layoutparams.mFullSpan)
	//* 276  589:aload           14
	//* 277  591:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 278  594:ifeq            689
						j = getMinStart(k);
	//  279  597:aload_0         
	//  280  598:iload           6
	//  281  600:invokespecial   #438 <Method int getMinStart(int)>
	//  282  603:istore          5
					else
	//* 283  605:iload           5
	//* 284  607:aload_0         
	//* 285  608:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//* 286  611:aload           13
	//* 287  613:invokevirtual   #387 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//* 288  616:isub            
	//* 289  617:istore          10
	//* 290  619:iload           10
	//* 291  621:istore          7
	//* 292  623:iload           5
	//* 293  625:istore          8
	//* 294  627:iload           9
	//* 295  629:ifeq            304
	//* 296  632:iload           10
	//* 297  634:istore          7
	//* 298  636:iload           5
	//* 299  638:istore          8
	//* 300  640:aload           14
	//* 301  642:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 302  645:ifeq            304
	//* 303  648:aload_0         
	//* 304  649:iload           5
	//* 305  651:invokespecial   #440 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem createFullSpanItemFromStart(int)>
	//* 306  654:astore          15
	//* 307  656:aload           15
	//* 308  658:iconst_1        
	//* 309  659:putfield        #392 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapDir>
	//* 310  662:aload           15
	//* 311  664:iload           11
	//* 312  666:putfield        #395 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//* 313  669:aload_0         
	//* 314  670:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//* 315  673:aload           15
	//* 316  675:invokevirtual   #399 <Method void StaggeredGridLayoutManager$LazySpanLookup.addFullSpanItem(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)>
	//* 317  678:iload           10
	//* 318  680:istore          7
	//* 319  682:iload           5
	//* 320  684:istore          8
	//* 321  686:goto            304
						j = span.getStartLine(k);
	//  322  689:aload           12
	//  323  691:iload           6
	//  324  693:invokevirtual   #326 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
	//  325  696:istore          5
					l1 = j - mPrimaryOrientation.getDecoratedMeasurement(view);
					l = l1;
					i1 = j;
					if(j1 != 0)
					{
						l = l1;
						i1 = j;
						if(layoutparams.mFullSpan)
						{
							LazySpanLookup.FullSpanItem fullspanitem1 = createFullSpanItemFromStart(j);
							fullspanitem1.mGapDir = 1;
							fullspanitem1.mPosition = i2;
							mLazySpanLookup.addFullSpanItem(fullspanitem1);
							l = l1;
							i1 = j;
						}
					}
				}
				if(layoutparams.mFullSpan && layoutstate.mItemDirection == -1)
					if(j1 != 0)
					{
						mLaidOutInvalidFullSpan = true;
					} else
	//* 326  698:goto            605
					{
						if(layoutstate.mLayoutDirection == 1)
	//* 327  701:aload_2         
	//* 328  702:getfield        #239 <Field int LayoutState.mLayoutDirection>
	//* 329  705:iconst_1        
	//* 330  706:icmpne          760
						{
							if(!areAllEndsEqual())
	//* 331  709:aload_0         
	//* 332  710:invokevirtual   #443 <Method boolean areAllEndsEqual()>
	//* 333  713:ifne            754
								j = 1;
	//  334  716:iconst_1        
	//  335  717:istore          5
							else
	//* 336  719:iload           5
	//* 337  721:ifeq            330
	//* 338  724:aload_0         
	//* 339  725:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//* 340  728:iload           11
	//* 341  730:invokevirtual   #446 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem StaggeredGridLayoutManager$LazySpanLookup.getFullSpanItem(int)>
	//* 342  733:astore          15
	//* 343  735:aload           15
	//* 344  737:ifnull          746
	//* 345  740:aload           15
	//* 346  742:iconst_1        
	//* 347  743:putfield        #449 <Field boolean StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mHasUnwantedGapAfter>
	//* 348  746:aload_0         
	//* 349  747:iconst_1        
	//* 350  748:putfield        #118 <Field boolean mLaidOutInvalidFullSpan>
	//* 351  751:goto            330
								j = 0;
	//  352  754:iconst_0        
	//  353  755:istore          5
						} else
	//* 354  757:goto            719
						if(!areAllStartsEqual())
	//* 355  760:aload_0         
	//* 356  761:invokevirtual   #452 <Method boolean areAllStartsEqual()>
	//* 357  764:ifne            773
							j = 1;
	//  358  767:iconst_1        
	//  359  768:istore          5
						else
	//* 360  770:goto            719
							j = 0;
	//  361  773:iconst_0        
	//  362  774:istore          5
						if(j != 0)
						{
							LazySpanLookup.FullSpanItem fullspanitem2 = mLazySpanLookup.getFullSpanItem(i2);
							if(fullspanitem2 != null)
								fullspanitem2.mHasUnwantedGapAfter = true;
							mLaidOutInvalidFullSpan = true;
						}
					}
				attachViewToSpans(view, layoutparams, layoutstate);
				if(isLayoutRTL() && mOrientation == 1)
				{
					if(layoutparams.mFullSpan)
						j = mSecondaryOrientation.getEndAfterPadding();
					else
	//* 363  776:goto            770
						j = mSecondaryOrientation.getEndAfterPadding() - (mSpanCount - 1 - span.mIndex) * mSizePerSpan;
	//  364  779:aload_0         
	//  365  780:getfield        #332 <Field OrientationHelper mSecondaryOrientation>
	//  366  783:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//  367  786:aload_0         
	//  368  787:getfield        #93  <Field int mSpanCount>
	//  369  790:iconst_1        
	//  370  791:isub            
	//  371  792:aload           12
	//  372  794:getfield        #455 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//  373  797:isub            
	//  374  798:aload_0         
	//  375  799:getfield        #457 <Field int mSizePerSpan>
	//  376  802:imul            
	//  377  803:isub            
	//  378  804:istore          5
					k1 = j - mSecondaryOrientation.getDecoratedMeasurement(view);
					j1 = j;
					j = k1;
				} else
	//* 379  806:goto            371
				{
					if(layoutparams.mFullSpan)
	//* 380  809:aload           14
	//* 381  811:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 382  814:ifeq            843
						j = mSecondaryOrientation.getStartAfterPadding();
	//  383  817:aload_0         
	//  384  818:getfield        #332 <Field OrientationHelper mSecondaryOrientation>
	//  385  821:invokevirtual   #201 <Method int OrientationHelper.getStartAfterPadding()>
	//  386  824:istore          5
					else
	//* 387  826:iload           5
	//* 388  828:aload_0         
	//* 389  829:getfield        #332 <Field OrientationHelper mSecondaryOrientation>
	//* 390  832:aload           13
	//* 391  834:invokevirtual   #387 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//* 392  837:iadd            
	//* 393  838:istore          9
	//* 394  840:goto            393
						j = span.mIndex * mSizePerSpan + mSecondaryOrientation.getStartAfterPadding();
	//  395  843:aload           12
	//  396  845:getfield        #455 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//  397  848:aload_0         
	//  398  849:getfield        #457 <Field int mSizePerSpan>
	//  399  852:imul            
	//  400  853:aload_0         
	//  401  854:getfield        #332 <Field OrientationHelper mSecondaryOrientation>
	//  402  857:invokevirtual   #201 <Method int OrientationHelper.getStartAfterPadding()>
	//  403  860:iadd            
	//  404  861:istore          5
					j1 = j + mSecondaryOrientation.getDecoratedMeasurement(view);
				}
				if(mOrientation == 1)
					layoutDecoratedWithMargins(view, j, l, j1, i1);
				else
	//* 405  863:goto            826
					layoutDecoratedWithMargins(view, l, j, i1, j1);
	//  406  866:aload_0         
	//  407  867:aload           13
	//  408  869:iload           7
	//  409  871:iload           5
	//  410  873:iload           8
	//  411  875:iload           9
	//  412  877:invokevirtual   #408 <Method void layoutDecoratedWithMargins(View, int, int, int, int)>
				if(layoutparams.mFullSpan)
					updateAllRemainingSpans(mLayoutState.mLayoutDirection, i);
				else
	//* 413  880:goto            415
					updateRemainingSpans(span, mLayoutState.mLayoutDirection, i);
	//  414  883:aload_0         
	//  415  884:aload           12
	//  416  886:aload_0         
	//  417  887:getfield        #138 <Field LayoutState mLayoutState>
	//  418  890:getfield        #239 <Field int LayoutState.mLayoutDirection>
	//  419  893:iload           4
	//  420  895:invokespecial   #461 <Method void updateRemainingSpans(StaggeredGridLayoutManager$Span, int, int)>
				recycle(recycler, mLayoutState);
				if(mLayoutState.mStopInFocusable && view.hasFocusable())
					if(layoutparams.mFullSpan)
						mRemainingSpans.clear();
					else
	//* 421  898:goto            436
						mRemainingSpans.set(span.mIndex, false);
	//  422  901:aload_0         
	//  423  902:getfield        #336 <Field BitSet mRemainingSpans>
	//  424  905:aload           12
	//  425  907:getfield        #455 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//  426  910:iconst_0        
	//  427  911:invokevirtual   #464 <Method void BitSet.set(int, boolean)>
				j = 1;
				continue;
	//  428  914:goto            478
			}
			if(j == 0)
	//* 429  917:iload           5
	//* 430  919:ifne            931
				recycle(recycler, mLayoutState);
	//  431  922:aload_0         
	//  432  923:aload_1         
	//  433  924:aload_0         
	//  434  925:getfield        #138 <Field LayoutState mLayoutState>
	//  435  928:invokespecial   #412 <Method void recycle(RecyclerView$Recycler, LayoutState)>
			if(mLayoutState.mLayoutDirection == -1)
	//* 436  931:aload_0         
	//* 437  932:getfield        #138 <Field LayoutState mLayoutState>
	//* 438  935:getfield        #239 <Field int LayoutState.mLayoutDirection>
	//* 439  938:iconst_m1       
	//* 440  939:icmpne          982
			{
				i = getMinStart(mPrimaryOrientation.getStartAfterPadding());
	//  441  942:aload_0         
	//  442  943:aload_0         
	//  443  944:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  444  947:invokevirtual   #201 <Method int OrientationHelper.getStartAfterPadding()>
	//  445  950:invokespecial   #438 <Method int getMinStart(int)>
	//  446  953:istore          4
				i = mPrimaryOrientation.getStartAfterPadding() - i;
	//  447  955:aload_0         
	//  448  956:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  449  959:invokevirtual   #201 <Method int OrientationHelper.getStartAfterPadding()>
	//  450  962:iload           4
	//  451  964:isub            
	//  452  965:istore          4
			} else
	//* 453  967:iload           4
	//* 454  969:ifle            1006
	//* 455  972:aload_2         
	//* 456  973:getfield        #425 <Field int LayoutState.mAvailable>
	//* 457  976:iload           4
	//* 458  978:invokestatic    #470 <Method int Math.min(int, int)>
	//* 459  981:ireturn         
			{
				i = getMaxEnd(mPrimaryOrientation.getEndAfterPadding()) - mPrimaryOrientation.getEndAfterPadding();
	//  460  982:aload_0         
	//  461  983:aload_0         
	//  462  984:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  463  987:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//  464  990:invokespecial   #383 <Method int getMaxEnd(int)>
	//  465  993:aload_0         
	//  466  994:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  467  997:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//  468 1000:isub            
	//  469 1001:istore          4
			}
			if(i > 0)
				return Math.min(layoutstate.mAvailable, i);
	//* 470 1003:goto            967
			return 0;
	//  471 1006:iconst_0        
	//  472 1007:ireturn         
		} while(true);
	}

	private int findFirstReferenceChildPosition(int i)
	{
		int k = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #259 <Method int getChildCount()>
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
	//   11   15:invokevirtual   #475 <Method View getChildAt(int)>
	//   12   18:invokevirtual   #478 <Method int getPosition(View)>
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
	//*   1    1:invokevirtual   #259 <Method int getChildCount()>
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
	//   10   14:invokevirtual   #475 <Method View getChildAt(int)>
	//   11   17:invokevirtual   #478 <Method int getPosition(View)>
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
	//    2    3:invokespecial   #383 <Method int getMaxEnd(int)>
	//    3    6:istore          4
		if(i != 0x80000000)
	//*   4    8:iload           4
	//*   5   10:ldc1            #43  <Int 0x80000000>
	//*   6   12:icmpne          16
	//*   7   15:return          
	//*   8   16:aload_0         
	//*   9   17:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//*  10   20:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//*  11   23:iload           4
	//*  12   25:isub            
	//*  13   26:istore          4
			if((i = mPrimaryOrientation.getEndAfterPadding() - i) > 0)
	//*  14   28:iload           4
	//*  15   30:ifle            15
			{
				i -= -scrollBy(-i, recycler, state);
	//   16   33:iload           4
	//   17   35:aload_0         
	//   18   36:iload           4
	//   19   38:ineg            
	//   20   39:aload_1         
	//   21   40:aload_2         
	//   22   41:invokevirtual   #485 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//   23   44:ineg            
	//   24   45:isub            
	//   25   46:istore          4
				if(flag && i > 0)
	//*  26   48:iload_3         
	//*  27   49:ifeq            15
	//*  28   52:iload           4
	//*  29   54:ifle            15
				{
					mPrimaryOrientation.offsetChildren(i);
	//   30   57:aload_0         
	//   31   58:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   32   61:iload           4
	//   33   63:invokevirtual   #488 <Method void OrientationHelper.offsetChildren(int)>
					return;
	//   34   66:return          
				}
			}
	}

	private void fixStartGap(RecyclerView.Recycler recycler, RecyclerView.State state, boolean flag)
	{
		int i = getMinStart(0x7fffffff);
	//    0    0:aload_0         
	//    1    1:ldc2            #346 <Int 0x7fffffff>
	//    2    4:invokespecial   #438 <Method int getMinStart(int)>
	//    3    7:istore          4
		if(i != 0x7fffffff)
	//*   4    9:iload           4
	//*   5   11:ldc2            #346 <Int 0x7fffffff>
	//*   6   14:icmpne          18
	//*   7   17:return          
	//*   8   18:iload           4
	//*   9   20:aload_0         
	//*  10   21:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//*  11   24:invokevirtual   #201 <Method int OrientationHelper.getStartAfterPadding()>
	//*  12   27:isub            
	//*  13   28:istore          4
			if((i -= mPrimaryOrientation.getStartAfterPadding()) > 0)
	//*  14   30:iload           4
	//*  15   32:ifle            17
			{
				i -= scrollBy(i, recycler, state);
	//   16   35:iload           4
	//   17   37:aload_0         
	//   18   38:iload           4
	//   19   40:aload_1         
	//   20   41:aload_2         
	//   21   42:invokevirtual   #485 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//   22   45:isub            
	//   23   46:istore          4
				if(flag && i > 0)
	//*  24   48:iload_3         
	//*  25   49:ifeq            17
	//*  26   52:iload           4
	//*  27   54:ifle            17
				{
					mPrimaryOrientation.offsetChildren(-i);
	//   28   57:aload_0         
	//   29   58:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   30   61:iload           4
	//   31   63:ineg            
	//   32   64:invokevirtual   #488 <Method void OrientationHelper.offsetChildren(int)>
					return;
	//   33   67:return          
				}
			}
	}

	private int getMaxEnd(int i)
	{
		int k = mSpans[0].getEndLine(i);
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:iload_1         
	//    5    7:invokevirtual   #323 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
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
	//   14   22:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   15   25:iload_2         
	//   16   26:aaload          
	//   17   27:iload_1         
	//   18   28:invokevirtual   #323 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
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
	//    1    1:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:iload_1         
	//    5    7:invokevirtual   #326 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
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
	//   14   22:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   15   25:iload_2         
	//   16   26:aaload          
	//   17   27:iload_1         
	//   18   28:invokevirtual   #326 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
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
	//    1    1:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:iload_1         
	//    5    7:invokevirtual   #323 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
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
	//   14   22:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   15   25:iload_2         
	//   16   26:aaload          
	//   17   27:iload_1         
	//   18   28:invokevirtual   #323 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
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
	//    1    1:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:iload_1         
	//    5    7:invokevirtual   #326 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
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
	//   14   22:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   15   25:iload_2         
	//   16   26:aaload          
	//   17   27:iload_1         
	//   18   28:invokevirtual   #326 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
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
		int i;
		byte byte0;
		int j;
		Object obj;
		if(preferLastSpan(layoutstate.mLayoutDirection))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:getfield        #239 <Field int LayoutState.mLayoutDirection>
	//*   3    5:invokespecial   #495 <Method boolean preferLastSpan(int)>
	//*   4    8:ifeq            102
		{
			i = mSpanCount - 1;
	//    5   11:aload_0         
	//    6   12:getfield        #93  <Field int mSpanCount>
	//    7   15:iconst_1        
	//    8   16:isub            
	//    9   17:istore_2        
			j = -1;
	//   10   18:iconst_m1       
	//   11   19:istore          4
			byte0 = -1;
	//   12   21:iconst_m1       
	//   13   22:istore_3        
		} else
	//*  14   23:aload_1         
	//*  15   24:getfield        #239 <Field int LayoutState.mLayoutDirection>
	//*  16   27:iconst_1        
	//*  17   28:icmpne          115
	//*  18   31:aconst_null     
	//*  19   32:astore_1        
	//*  20   33:ldc2            #346 <Int 0x7fffffff>
	//*  21   36:istore          5
	//*  22   38:aload_0         
	//*  23   39:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//*  24   42:invokevirtual   #201 <Method int OrientationHelper.getStartAfterPadding()>
	//*  25   45:istore          8
	//*  26   47:aload_1         
	//*  27   48:astore          9
	//*  28   50:iload_2         
	//*  29   51:iload           4
	//*  30   53:icmpeq          185
	//*  31   56:aload_0         
	//*  32   57:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//*  33   60:iload_2         
	//*  34   61:aaload          
	//*  35   62:astore          9
	//*  36   64:aload           9
	//*  37   66:iload           8
	//*  38   68:invokevirtual   #323 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
	//*  39   71:istore          7
	//*  40   73:iload           5
	//*  41   75:istore          6
	//*  42   77:iload           7
	//*  43   79:iload           5
	//*  44   81:icmpge          91
	//*  45   84:aload           9
	//*  46   86:astore_1        
	//*  47   87:iload           7
	//*  48   89:istore          6
	//*  49   91:iload_2         
	//*  50   92:iload_3         
	//*  51   93:iadd            
	//*  52   94:istore_2        
	//*  53   95:iload           6
	//*  54   97:istore          5
	//*  55   99:goto            47
		{
			i = 0;
	//   56  102:iconst_0        
	//   57  103:istore_2        
			j = mSpanCount;
	//   58  104:aload_0         
	//   59  105:getfield        #93  <Field int mSpanCount>
	//   60  108:istore          4
			byte0 = 1;
	//   61  110:iconst_1        
	//   62  111:istore_3        
		}
		if(layoutstate.mLayoutDirection == 1)
		{
			layoutstate = null;
			int k = 0x7fffffff;
			int i2 = mPrimaryOrientation.getStartAfterPadding();
			do
			{
				obj = ((Object) (layoutstate));
				if(i == j)
					break;
				obj = ((Object) (mSpans[i]));
				int k1 = ((Span) (obj)).getEndLine(i2);
				int i1 = k;
				if(k1 < k)
				{
					layoutstate = ((LayoutState) (obj));
					i1 = k1;
				}
				i += ((int) (byte0));
				k = i1;
			} while(true);
		} else
	//*  63  112:goto            23
		{
			layoutstate = null;
	//   64  115:aconst_null     
	//   65  116:astore_1        
			int l = 0x80000000;
	//   66  117:ldc1            #43  <Int 0x80000000>
	//   67  119:istore          5
			int j2 = mPrimaryOrientation.getEndAfterPadding();
	//   68  121:aload_0         
	//   69  122:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   70  125:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//   71  128:istore          8
			while(i != j) 
	//*  72  130:iload_2         
	//*  73  131:iload           4
	//*  74  133:icmpeq          182
			{
				obj = ((Object) (mSpans[i]));
	//   75  136:aload_0         
	//   76  137:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   77  140:iload_2         
	//   78  141:aaload          
	//   79  142:astore          9
				int l1 = ((Span) (obj)).getStartLine(j2);
	//   80  144:aload           9
	//   81  146:iload           8
	//   82  148:invokevirtual   #326 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
	//   83  151:istore          7
				int j1 = l;
	//   84  153:iload           5
	//   85  155:istore          6
				if(l1 > l)
	//*  86  157:iload           7
	//*  87  159:iload           5
	//*  88  161:icmple          171
				{
					layoutstate = ((LayoutState) (obj));
	//   89  164:aload           9
	//   90  166:astore_1        
					j1 = l1;
	//   91  167:iload           7
	//   92  169:istore          6
				}
				i += ((int) (byte0));
	//   93  171:iload_2         
	//   94  172:iload_3         
	//   95  173:iadd            
	//   96  174:istore_2        
				l = j1;
	//   97  175:iload           6
	//   98  177:istore          5
			}
	//*  99  179:goto            130
			obj = ((Object) (layoutstate));
	//  100  182:aload_1         
	//  101  183:astore          9
		}
		return ((Span) (obj));
	//  102  185:aload           9
	//  103  187:areturn         
	}

	private void handleUpdate(int i, int j, int k)
	{
		int l;
		int i1;
		int j1;
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            84
			j1 = getLastChildPosition();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #500 <Method int getLastChildPosition()>
	//    5   11:istore          6
		else
	//*   6   13:iload_3         
	//*   7   14:bipush          8
	//*   8   16:icmpne          104
	//*   9   19:iload_1         
	//*  10   20:iload_2         
	//*  11   21:icmpge          93
	//*  12   24:iload_2         
	//*  13   25:iconst_1        
	//*  14   26:iadd            
	//*  15   27:istore          5
	//*  16   29:iload_1         
	//*  17   30:istore          4
	//*  18   32:aload_0         
	//*  19   33:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//*  20   36:iload           4
	//*  21   38:invokevirtual   #503 <Method int StaggeredGridLayoutManager$LazySpanLookup.invalidateAfter(int)>
	//*  22   41:pop             
	//*  23   42:iload_3         
	//*  24   43:lookupswitch    3: default 76
	//	               1: 115
	//	               2: 127
	//	               8: 139
	//*  25   76:iload           5
	//*  26   78:iload           6
	//*  27   80:icmpgt          160
	//*  28   83:return          
			j1 = getFirstChildPosition();
	//   29   84:aload_0         
	//   30   85:invokevirtual   #262 <Method int getFirstChildPosition()>
	//   31   88:istore          6
		if(k == 8)
		{
			if(i < j)
			{
				i1 = j + 1;
				l = i;
			} else
	//*  32   90:goto            13
			{
				i1 = i + 1;
	//   33   93:iload_1         
	//   34   94:iconst_1        
	//   35   95:iadd            
	//   36   96:istore          5
				l = j;
	//   37   98:iload_2         
	//   38   99:istore          4
			}
		} else
	//*  39  101:goto            32
		{
			l = i;
	//   40  104:iload_1         
	//   41  105:istore          4
			i1 = i + j;
	//   42  107:iload_1         
	//   43  108:iload_2         
	//   44  109:iadd            
	//   45  110:istore          5
		}
		mLazySpanLookup.invalidateAfter(l);
		k;
		JVM INSTR lookupswitch 3: default 76
	//	               1: 115
	//	               2: 127
	//	               8: 139;
		   goto _L1 _L2 _L3 _L4
_L1:
		if(i1 > j1) goto _L6; else goto _L5
_L5:
		return;
	//*  46  112:goto            32
_L2:
		mLazySpanLookup.offsetForAddition(i, j);
	//   47  115:aload_0         
	//   48  116:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   49  119:iload_1         
	//   50  120:iload_2         
	//   51  121:invokevirtual   #506 <Method void StaggeredGridLayoutManager$LazySpanLookup.offsetForAddition(int, int)>
		continue; /* Loop/switch isn't completed */
	//   52  124:goto            76
_L3:
		mLazySpanLookup.offsetForRemoval(i, j);
	//   53  127:aload_0         
	//   54  128:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   55  131:iload_1         
	//   56  132:iload_2         
	//   57  133:invokevirtual   #509 <Method void StaggeredGridLayoutManager$LazySpanLookup.offsetForRemoval(int, int)>
		continue; /* Loop/switch isn't completed */
	//   58  136:goto            76
_L4:
		mLazySpanLookup.offsetForRemoval(i, 1);
	//   59  139:aload_0         
	//   60  140:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   61  143:iload_1         
	//   62  144:iconst_1        
	//   63  145:invokevirtual   #509 <Method void StaggeredGridLayoutManager$LazySpanLookup.offsetForRemoval(int, int)>
		mLazySpanLookup.offsetForAddition(j, 1);
	//   64  148:aload_0         
	//   65  149:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   66  152:iload_2         
	//   67  153:iconst_1        
	//   68  154:invokevirtual   #506 <Method void StaggeredGridLayoutManager$LazySpanLookup.offsetForAddition(int, int)>
		continue; /* Loop/switch isn't completed */
	//   69  157:goto            76
_L6:
		if(mShouldReverseLayout)
	//*  70  160:aload_0         
	//*  71  161:getfield        #97  <Field boolean mShouldReverseLayout>
	//*  72  164:ifeq            183
			i = getFirstChildPosition();
	//   73  167:aload_0         
	//   74  168:invokevirtual   #262 <Method int getFirstChildPosition()>
	//   75  171:istore_1        
		else
	//*  76  172:iload           4
	//*  77  174:iload_1         
	//*  78  175:icmpgt          83
	//*  79  178:aload_0         
	//*  80  179:invokevirtual   #512 <Method void requestLayout()>
	//*  81  182:return          
			i = getLastChildPosition();
	//   82  183:aload_0         
	//   83  184:invokevirtual   #500 <Method int getLastChildPosition()>
	//   84  187:istore_1        
		if(l > i) goto _L5; else goto _L7
_L7:
		requestLayout();
		return;
		if(true) goto _L1; else goto _L8
_L8:
	//*  85  188:goto            172
	}

	private void measureChildWithDecorationsAndMargin(View view, int i, int j, boolean flag)
	{
		calculateItemDecorationsForChild(view, mTmpRect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #111 <Field Rect mTmpRect>
	//    4    6:invokevirtual   #517 <Method void calculateItemDecorationsForChild(View, Rect)>
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #363 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    7   13:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//    8   16:astore          5
		i = updateSpecWithExtra(i, layoutparams.leftMargin + mTmpRect.left, layoutparams.rightMargin + mTmpRect.right);
	//    9   18:aload_0         
	//   10   19:iload_2         
	//   11   20:aload           5
	//   12   22:getfield        #520 <Field int StaggeredGridLayoutManager$LayoutParams.leftMargin>
	//   13   25:aload_0         
	//   14   26:getfield        #111 <Field Rect mTmpRect>
	//   15   29:getfield        #523 <Field int Rect.left>
	//   16   32:iadd            
	//   17   33:aload           5
	//   18   35:getfield        #526 <Field int StaggeredGridLayoutManager$LayoutParams.rightMargin>
	//   19   38:aload_0         
	//   20   39:getfield        #111 <Field Rect mTmpRect>
	//   21   42:getfield        #529 <Field int Rect.right>
	//   22   45:iadd            
	//   23   46:invokespecial   #533 <Method int updateSpecWithExtra(int, int, int)>
	//   24   49:istore_2        
		j = updateSpecWithExtra(j, layoutparams.topMargin + mTmpRect.top, layoutparams.bottomMargin + mTmpRect.bottom);
	//   25   50:aload_0         
	//   26   51:iload_3         
	//   27   52:aload           5
	//   28   54:getfield        #536 <Field int StaggeredGridLayoutManager$LayoutParams.topMargin>
	//   29   57:aload_0         
	//   30   58:getfield        #111 <Field Rect mTmpRect>
	//   31   61:getfield        #539 <Field int Rect.top>
	//   32   64:iadd            
	//   33   65:aload           5
	//   34   67:getfield        #542 <Field int StaggeredGridLayoutManager$LayoutParams.bottomMargin>
	//   35   70:aload_0         
	//   36   71:getfield        #111 <Field Rect mTmpRect>
	//   37   74:getfield        #545 <Field int Rect.bottom>
	//   38   77:iadd            
	//   39   78:invokespecial   #533 <Method int updateSpecWithExtra(int, int, int)>
	//   40   81:istore_3        
		if(flag)
	//*  41   82:iload           4
	//*  42   84:ifeq            110
			flag = shouldReMeasureChild(view, i, j, ((RecyclerView.LayoutParams) (layoutparams)));
	//   43   87:aload_0         
	//   44   88:aload_1         
	//   45   89:iload_2         
	//   46   90:iload_3         
	//   47   91:aload           5
	//   48   93:invokevirtual   #549 <Method boolean shouldReMeasureChild(View, int, int, RecyclerView$LayoutParams)>
	//   49   96:istore          4
		else
	//*  50   98:iload           4
	//*  51  100:ifeq            109
	//*  52  103:aload_1         
	//*  53  104:iload_2         
	//*  54  105:iload_3         
	//*  55  106:invokevirtual   #552 <Method void View.measure(int, int)>
	//*  56  109:return          
			flag = shouldMeasureChild(view, i, j, ((RecyclerView.LayoutParams) (layoutparams)));
	//   57  110:aload_0         
	//   58  111:aload_1         
	//   59  112:iload_2         
	//   60  113:iload_3         
	//   61  114:aload           5
	//   62  116:invokevirtual   #555 <Method boolean shouldMeasureChild(View, int, int, RecyclerView$LayoutParams)>
	//   63  119:istore          4
		if(flag)
			view.measure(i, j);
	//*  64  121:goto            98
	}

	private void measureChildWithDecorationsAndMargin(View view, LayoutParams layoutparams, boolean flag)
	{
		if(layoutparams.mFullSpan)
	//*   0    0:aload_2         
	//*   1    1:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*   2    4:ifeq            71
			if(mOrientation == 1)
	//*   3    7:aload_0         
	//*   4    8:getfield        #125 <Field int mOrientation>
	//*   5   11:iconst_1        
	//*   6   12:icmpne          43
			{
				measureChildWithDecorationsAndMargin(view, mFullSizeSpec, getChildMeasureSpec(getHeight(), getHeightMode(), 0, layoutparams.height, true), flag);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #557 <Field int mFullSizeSpec>
	//   11   21:aload_0         
	//   12   22:invokevirtual   #560 <Method int getHeight()>
	//   13   25:aload_0         
	//   14   26:invokevirtual   #563 <Method int getHeightMode()>
	//   15   29:iconst_0        
	//   16   30:aload_2         
	//   17   31:getfield        #566 <Field int StaggeredGridLayoutManager$LayoutParams.height>
	//   18   34:iconst_1        
	//   19   35:invokestatic    #570 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   20   38:iload_3         
	//   21   39:invokespecial   #572 <Method void measureChildWithDecorationsAndMargin(View, int, int, boolean)>
				return;
	//   22   42:return          
			} else
			{
				measureChildWithDecorationsAndMargin(view, getChildMeasureSpec(getWidth(), getWidthMode(), 0, layoutparams.width, true), mFullSizeSpec, flag);
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:aload_0         
	//   26   46:invokevirtual   #575 <Method int getWidth()>
	//   27   49:aload_0         
	//   28   50:invokevirtual   #578 <Method int getWidthMode()>
	//   29   53:iconst_0        
	//   30   54:aload_2         
	//   31   55:getfield        #581 <Field int StaggeredGridLayoutManager$LayoutParams.width>
	//   32   58:iconst_1        
	//   33   59:invokestatic    #570 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   34   62:aload_0         
	//   35   63:getfield        #557 <Field int mFullSizeSpec>
	//   36   66:iload_3         
	//   37   67:invokespecial   #572 <Method void measureChildWithDecorationsAndMargin(View, int, int, boolean)>
				return;
	//   38   70:return          
			}
		if(mOrientation == 1)
	//*  39   71:aload_0         
	//*  40   72:getfield        #125 <Field int mOrientation>
	//*  41   75:iconst_1        
	//*  42   76:icmpne          120
		{
			measureChildWithDecorationsAndMargin(view, getChildMeasureSpec(mSizePerSpan, getWidthMode(), 0, layoutparams.width, false), getChildMeasureSpec(getHeight(), getHeightMode(), 0, layoutparams.height, true), flag);
	//   43   79:aload_0         
	//   44   80:aload_1         
	//   45   81:aload_0         
	//   46   82:getfield        #457 <Field int mSizePerSpan>
	//   47   85:aload_0         
	//   48   86:invokevirtual   #578 <Method int getWidthMode()>
	//   49   89:iconst_0        
	//   50   90:aload_2         
	//   51   91:getfield        #581 <Field int StaggeredGridLayoutManager$LayoutParams.width>
	//   52   94:iconst_0        
	//   53   95:invokestatic    #570 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   54   98:aload_0         
	//   55   99:invokevirtual   #560 <Method int getHeight()>
	//   56  102:aload_0         
	//   57  103:invokevirtual   #563 <Method int getHeightMode()>
	//   58  106:iconst_0        
	//   59  107:aload_2         
	//   60  108:getfield        #566 <Field int StaggeredGridLayoutManager$LayoutParams.height>
	//   61  111:iconst_1        
	//   62  112:invokestatic    #570 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   63  115:iload_3         
	//   64  116:invokespecial   #572 <Method void measureChildWithDecorationsAndMargin(View, int, int, boolean)>
			return;
	//   65  119:return          
		} else
		{
			measureChildWithDecorationsAndMargin(view, getChildMeasureSpec(getWidth(), getWidthMode(), 0, layoutparams.width, true), getChildMeasureSpec(mSizePerSpan, getHeightMode(), 0, layoutparams.height, false), flag);
	//   66  120:aload_0         
	//   67  121:aload_1         
	//   68  122:aload_0         
	//   69  123:invokevirtual   #575 <Method int getWidth()>
	//   70  126:aload_0         
	//   71  127:invokevirtual   #578 <Method int getWidthMode()>
	//   72  130:iconst_0        
	//   73  131:aload_2         
	//   74  132:getfield        #581 <Field int StaggeredGridLayoutManager$LayoutParams.width>
	//   75  135:iconst_1        
	//   76  136:invokestatic    #570 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   77  139:aload_0         
	//   78  140:getfield        #457 <Field int mSizePerSpan>
	//   79  143:aload_0         
	//   80  144:invokevirtual   #563 <Method int getHeightMode()>
	//   81  147:iconst_0        
	//   82  148:aload_2         
	//   83  149:getfield        #566 <Field int StaggeredGridLayoutManager$LayoutParams.height>
	//   84  152:iconst_0        
	//   85  153:invokestatic    #570 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   86  156:iload_3         
	//   87  157:invokespecial   #572 <Method void measureChildWithDecorationsAndMargin(View, int, int, boolean)>
			return;
	//   88  160:return          
		}
	}

	private void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state, boolean flag)
	{
		boolean flag2;
		AnchorInfo anchorinfo;
		flag2 = true;
	//    0    0:iconst_1        
	//    1    1:istore          6
		anchorinfo = mAnchorInfo;
	//    2    3:aload_0         
	//    3    4:getfield        #116 <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
	//    4    7:astore          8
		if(mPendingSavedState == null && mPendingScrollPosition == -1 || state.getItemCount() != 0) goto _L2; else goto _L1
	//    5    9:aload_0         
	//    6   10:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//    7   13:ifnonnull       24
	//    8   16:aload_0         
	//    9   17:getfield        #99  <Field int mPendingScrollPosition>
	//   10   20:iconst_m1       
	//   11   21:icmpeq          42
	//   12   24:aload_2         
	//   13   25:invokevirtual   #587 <Method int RecyclerView$State.getItemCount()>
	//   14   28:ifne            42
_L1:
		removeAndRecycleAllViews(recycler);
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokevirtual   #591 <Method void removeAndRecycleAllViews(RecyclerView$Recycler)>
		anchorinfo.reset();
	//   18   36:aload           8
	//   19   38:invokevirtual   #594 <Method void StaggeredGridLayoutManager$AnchorInfo.reset()>
_L6:
		return;
	//   20   41:return          
_L2:
		int i;
		if(!anchorinfo.mValid || mPendingScrollPosition != -1 || mPendingSavedState != null)
	//*  21   42:aload           8
	//*  22   44:getfield        #597 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mValid>
	//*  23   47:ifeq            65
	//*  24   50:aload_0         
	//*  25   51:getfield        #99  <Field int mPendingScrollPosition>
	//*  26   54:iconst_m1       
	//*  27   55:icmpne          65
	//*  28   58:aload_0         
	//*  29   59:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  30   62:ifnull          244
			i = 1;
	//   31   65:iconst_1        
	//   32   66:istore          4
		else
	//*  33   68:iload           4
	//*  34   70:ifeq            104
	//*  35   73:aload           8
	//*  36   75:invokevirtual   #594 <Method void StaggeredGridLayoutManager$AnchorInfo.reset()>
	//*  37   78:aload_0         
	//*  38   79:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  39   82:ifnull          250
	//*  40   85:aload_0         
	//*  41   86:aload           8
	//*  42   88:invokespecial   #599 <Method void applyPendingSavedState(StaggeredGridLayoutManager$AnchorInfo)>
	//*  43   91:aload_0         
	//*  44   92:aload_2         
	//*  45   93:aload           8
	//*  46   95:invokevirtual   #603 <Method void updateAnchorInfoForLayout(RecyclerView$State, StaggeredGridLayoutManager$AnchorInfo)>
	//*  47   98:aload           8
	//*  48  100:iconst_1        
	//*  49  101:putfield        #597 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mValid>
	//*  50  104:aload_0         
	//*  51  105:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  52  108:ifnonnull       155
	//*  53  111:aload_0         
	//*  54  112:getfield        #99  <Field int mPendingScrollPosition>
	//*  55  115:iconst_m1       
	//*  56  116:icmpne          155
	//*  57  119:aload           8
	//*  58  121:getfield        #220 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
	//*  59  124:aload_0         
	//*  60  125:getfield        #605 <Field boolean mLastLayoutFromEnd>
	//*  61  128:icmpne          142
	//*  62  131:aload_0         
	//*  63  132:invokevirtual   #315 <Method boolean isLayoutRTL()>
	//*  64  135:aload_0         
	//*  65  136:getfield        #213 <Field boolean mLastLayoutRTL>
	//*  66  139:icmpeq          155
	//*  67  142:aload_0         
	//*  68  143:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//*  69  146:invokevirtual   #606 <Method void StaggeredGridLayoutManager$LazySpanLookup.clear()>
	//*  70  149:aload           8
	//*  71  151:iconst_1        
	//*  72  152:putfield        #609 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mInvalidateOffsets>
	//*  73  155:aload_0         
	//*  74  156:invokevirtual   #259 <Method int getChildCount()>
	//*  75  159:ifle            332
	//*  76  162:aload_0         
	//*  77  163:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  78  166:ifnull          180
	//*  79  169:aload_0         
	//*  80  170:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  81  173:getfield        #178 <Field int StaggeredGridLayoutManager$SavedState.mSpanOffsetsSize>
	//*  82  176:iconst_1        
	//*  83  177:icmpge          332
	//*  84  180:aload           8
	//*  85  182:getfield        #609 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mInvalidateOffsets>
	//*  86  185:ifeq            266
	//*  87  188:iconst_0        
	//*  88  189:istore          4
	//*  89  191:iload           4
	//*  90  193:aload_0         
	//*  91  194:getfield        #93  <Field int mSpanCount>
	//*  92  197:icmpge          332
	//*  93  200:aload_0         
	//*  94  201:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//*  95  204:iload           4
	//*  96  206:aaload          
	//*  97  207:invokevirtual   #181 <Method void StaggeredGridLayoutManager$Span.clear()>
	//*  98  210:aload           8
	//*  99  212:getfield        #612 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
	//* 100  215:ldc1            #43  <Int 0x80000000>
	//* 101  217:icmpeq          235
	//* 102  220:aload_0         
	//* 103  221:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//* 104  224:iload           4
	//* 105  226:aaload          
	//* 106  227:aload           8
	//* 107  229:getfield        #612 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
	//* 108  232:invokevirtual   #198 <Method void StaggeredGridLayoutManager$Span.setLine(int)>
	//* 109  235:iload           4
	//* 110  237:iconst_1        
	//* 111  238:iadd            
	//* 112  239:istore          4
	//* 113  241:goto            191
			i = 0;
	//  114  244:iconst_0        
	//  115  245:istore          4
		if(i != 0)
		{
			anchorinfo.reset();
			if(mPendingSavedState != null)
			{
				applyPendingSavedState(anchorinfo);
			} else
	//* 116  247:goto            68
			{
				resolveShouldLayoutReverse();
	//  117  250:aload_0         
	//  118  251:invokespecial   #217 <Method void resolveShouldLayoutReverse()>
				anchorinfo.mLayoutFromEnd = mShouldReverseLayout;
	//  119  254:aload           8
	//  120  256:aload_0         
	//  121  257:getfield        #97  <Field boolean mShouldReverseLayout>
	//  122  260:putfield        #220 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
			}
			updateAnchorInfoForLayout(state, anchorinfo);
			anchorinfo.mValid = true;
		}
		if(mPendingSavedState == null && mPendingScrollPosition == -1 && (anchorinfo.mLayoutFromEnd != mLastLayoutFromEnd || isLayoutRTL() != mLastLayoutRTL))
		{
			mLazySpanLookup.clear();
			anchorinfo.mInvalidateOffsets = true;
		}
		boolean flag1;
		boolean flag3;
		if(getChildCount() > 0 && (mPendingSavedState == null || mPendingSavedState.mSpanOffsetsSize < 1))
			if(anchorinfo.mInvalidateOffsets)
				for(i = 0; i < mSpanCount; i++)
				{
					mSpans[i].clear();
					if(anchorinfo.mOffset != 0x80000000)
						mSpans[i].setLine(anchorinfo.mOffset);
				}

			else
	//* 123  263:goto            91
			if(i != 0 || mAnchorInfo.mSpanReferenceLines == null)
	//* 124  266:iload           4
	//* 125  268:ifne            281
	//* 126  271:aload_0         
	//* 127  272:getfield        #116 <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
	//* 128  275:getfield        #615 <Field int[] StaggeredGridLayoutManager$AnchorInfo.mSpanReferenceLines>
	//* 129  278:ifnonnull       604
			{
				for(i = 0; i < mSpanCount; i++)
	//* 130  281:iconst_0        
	//* 131  282:istore          4
	//* 132  284:iload           4
	//* 133  286:aload_0         
	//* 134  287:getfield        #93  <Field int mSpanCount>
	//* 135  290:icmpge          321
					mSpans[i].cacheReferenceLineAndClear(mShouldReverseLayout, anchorinfo.mOffset);
	//  136  293:aload_0         
	//  137  294:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  138  297:iload           4
	//  139  299:aaload          
	//  140  300:aload_0         
	//  141  301:getfield        #97  <Field boolean mShouldReverseLayout>
	//  142  304:aload           8
	//  143  306:getfield        #612 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
	//  144  309:invokevirtual   #619 <Method void StaggeredGridLayoutManager$Span.cacheReferenceLineAndClear(boolean, int)>

	//  145  312:iload           4
	//  146  314:iconst_1        
	//  147  315:iadd            
	//  148  316:istore          4
	//* 149  318:goto            284
				mAnchorInfo.saveSpanReferenceLines(mSpans);
	//  150  321:aload_0         
	//  151  322:getfield        #116 <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
	//  152  325:aload_0         
	//  153  326:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  154  329:invokevirtual   #623 <Method void StaggeredGridLayoutManager$AnchorInfo.saveSpanReferenceLines(StaggeredGridLayoutManager$Span[])>
			} else
	//* 155  332:aload_0         
	//* 156  333:aload_1         
	//* 157  334:invokevirtual   #626 <Method void detachAndScrapAttachedViews(RecyclerView$Recycler)>
	//* 158  337:aload_0         
	//* 159  338:getfield        #138 <Field LayoutState mLayoutState>
	//* 160  341:iconst_0        
	//* 161  342:putfield        #629 <Field boolean LayoutState.mRecycle>
	//* 162  345:aload_0         
	//* 163  346:iconst_0        
	//* 164  347:putfield        #118 <Field boolean mLaidOutInvalidFullSpan>
	//* 165  350:aload_0         
	//* 166  351:aload_0         
	//* 167  352:getfield        #332 <Field OrientationHelper mSecondaryOrientation>
	//* 168  355:invokevirtual   #632 <Method int OrientationHelper.getTotalSpace()>
	//* 169  358:invokevirtual   #635 <Method void updateMeasureSpecs(int)>
	//* 170  361:aload_0         
	//* 171  362:aload           8
	//* 172  364:getfield        #636 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
	//* 173  367:aload_2         
	//* 174  368:invokespecial   #640 <Method void updateLayoutState(int, RecyclerView$State)>
	//* 175  371:aload           8
	//* 176  373:getfield        #220 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
	//* 177  376:ifeq            654
	//* 178  379:aload_0         
	//* 179  380:iconst_m1       
	//* 180  381:invokespecial   #643 <Method void setLayoutStateDirection(int)>
	//* 181  384:aload_0         
	//* 182  385:aload_1         
	//* 183  386:aload_0         
	//* 184  387:getfield        #138 <Field LayoutState mLayoutState>
	//* 185  390:aload_2         
	//* 186  391:invokespecial   #645 <Method int fill(RecyclerView$Recycler, LayoutState, RecyclerView$State)>
	//* 187  394:pop             
	//* 188  395:aload_0         
	//* 189  396:iconst_1        
	//* 190  397:invokespecial   #643 <Method void setLayoutStateDirection(int)>
	//* 191  400:aload_0         
	//* 192  401:getfield        #138 <Field LayoutState mLayoutState>
	//* 193  404:aload           8
	//* 194  406:getfield        #636 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
	//* 195  409:aload_0         
	//* 196  410:getfield        #138 <Field LayoutState mLayoutState>
	//* 197  413:getfield        #402 <Field int LayoutState.mItemDirection>
	//* 198  416:iadd            
	//* 199  417:putfield        #648 <Field int LayoutState.mCurrentPosition>
	//* 200  420:aload_0         
	//* 201  421:aload_1         
	//* 202  422:aload_0         
	//* 203  423:getfield        #138 <Field LayoutState mLayoutState>
	//* 204  426:aload_2         
	//* 205  427:invokespecial   #645 <Method int fill(RecyclerView$Recycler, LayoutState, RecyclerView$State)>
	//* 206  430:pop             
	//* 207  431:aload_0         
	//* 208  432:invokespecial   #651 <Method void repositionToWrapContentIfNecessary()>
	//* 209  435:aload_0         
	//* 210  436:invokevirtual   #259 <Method int getChildCount()>
	//* 211  439:ifle            463
	//* 212  442:aload_0         
	//* 213  443:getfield        #97  <Field boolean mShouldReverseLayout>
	//* 214  446:ifeq            709
	//* 215  449:aload_0         
	//* 216  450:aload_1         
	//* 217  451:aload_2         
	//* 218  452:iconst_1        
	//* 219  453:invokespecial   #653 <Method void fixEndGap(RecyclerView$Recycler, RecyclerView$State, boolean)>
	//* 220  456:aload_0         
	//* 221  457:aload_1         
	//* 222  458:aload_2         
	//* 223  459:iconst_0        
	//* 224  460:invokespecial   #655 <Method void fixStartGap(RecyclerView$Recycler, RecyclerView$State, boolean)>
	//* 225  463:iconst_0        
	//* 226  464:istore          7
	//* 227  466:iload           7
	//* 228  468:istore          5
	//* 229  470:iload_3         
	//* 230  471:ifeq            553
	//* 231  474:iload           7
	//* 232  476:istore          5
	//* 233  478:aload_2         
	//* 234  479:invokevirtual   #658 <Method boolean RecyclerView$State.isPreLayout()>
	//* 235  482:ifne            553
	//* 236  485:aload_0         
	//* 237  486:getfield        #106 <Field int mGapStrategy>
	//* 238  489:ifeq            726
	//* 239  492:aload_0         
	//* 240  493:invokevirtual   #259 <Method int getChildCount()>
	//* 241  496:ifle            726
	//* 242  499:iload           6
	//* 243  501:istore          4
	//* 244  503:aload_0         
	//* 245  504:getfield        #118 <Field boolean mLaidOutInvalidFullSpan>
	//* 246  507:ifne            521
	//* 247  510:aload_0         
	//* 248  511:invokevirtual   #662 <Method View hasGapsToFix()>
	//* 249  514:ifnull          726
	//* 250  517:iload           6
	//* 251  519:istore          4
	//* 252  521:iload           7
	//* 253  523:istore          5
	//* 254  525:iload           4
	//* 255  527:ifeq            553
	//* 256  530:aload_0         
	//* 257  531:aload_0         
	//* 258  532:getfield        #123 <Field Runnable mCheckForGapsRunnable>
	//* 259  535:invokevirtual   #666 <Method boolean removeCallbacks(Runnable)>
	//* 260  538:pop             
	//* 261  539:iload           7
	//* 262  541:istore          5
	//* 263  543:aload_0         
	//* 264  544:invokevirtual   #669 <Method boolean checkForGaps()>
	//* 265  547:ifeq            553
	//* 266  550:iconst_1        
	//* 267  551:istore          5
	//* 268  553:aload_2         
	//* 269  554:invokevirtual   #658 <Method boolean RecyclerView$State.isPreLayout()>
	//* 270  557:ifeq            567
	//* 271  560:aload_0         
	//* 272  561:getfield        #116 <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
	//* 273  564:invokevirtual   #594 <Method void StaggeredGridLayoutManager$AnchorInfo.reset()>
	//* 274  567:aload_0         
	//* 275  568:aload           8
	//* 276  570:getfield        #220 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
	//* 277  573:putfield        #605 <Field boolean mLastLayoutFromEnd>
	//* 278  576:aload_0         
	//* 279  577:aload_0         
	//* 280  578:invokevirtual   #315 <Method boolean isLayoutRTL()>
	//* 281  581:putfield        #213 <Field boolean mLastLayoutRTL>
	//* 282  584:iload           5
	//* 283  586:ifeq            41
	//* 284  589:aload_0         
	//* 285  590:getfield        #116 <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
	//* 286  593:invokevirtual   #594 <Method void StaggeredGridLayoutManager$AnchorInfo.reset()>
	//* 287  596:aload_0         
	//* 288  597:aload_1         
	//* 289  598:aload_2         
	//* 290  599:iconst_0        
	//* 291  600:invokespecial   #671 <Method void onLayoutChildren(RecyclerView$Recycler, RecyclerView$State, boolean)>
	//* 292  603:return          
			{
				i = 0;
	//  293  604:iconst_0        
	//  294  605:istore          4
				while(i < mSpanCount) 
	//* 295  607:iload           4
	//* 296  609:aload_0         
	//* 297  610:getfield        #93  <Field int mSpanCount>
	//* 298  613:icmpge          332
				{
					Span span = mSpans[i];
	//  299  616:aload_0         
	//  300  617:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  301  620:iload           4
	//  302  622:aaload          
	//  303  623:astore          9
					span.clear();
	//  304  625:aload           9
	//  305  627:invokevirtual   #181 <Method void StaggeredGridLayoutManager$Span.clear()>
					span.setLine(mAnchorInfo.mSpanReferenceLines[i]);
	//  306  630:aload           9
	//  307  632:aload_0         
	//  308  633:getfield        #116 <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
	//  309  636:getfield        #615 <Field int[] StaggeredGridLayoutManager$AnchorInfo.mSpanReferenceLines>
	//  310  639:iload           4
	//  311  641:iaload          
	//  312  642:invokevirtual   #198 <Method void StaggeredGridLayoutManager$Span.setLine(int)>
					i++;
	//  313  645:iload           4
	//  314  647:iconst_1        
	//  315  648:iadd            
	//  316  649:istore          4
				}
			}
		detachAndScrapAttachedViews(recycler);
		mLayoutState.mRecycle = false;
		mLaidOutInvalidFullSpan = false;
		updateMeasureSpecs(mSecondaryOrientation.getTotalSpace());
		updateLayoutState(anchorinfo.mPosition, state);
		if(anchorinfo.mLayoutFromEnd)
		{
			setLayoutStateDirection(-1);
			fill(recycler, mLayoutState, state);
			setLayoutStateDirection(1);
			mLayoutState.mCurrentPosition = anchorinfo.mPosition + mLayoutState.mItemDirection;
			fill(recycler, mLayoutState, state);
		} else
	//* 317  651:goto            607
		{
			setLayoutStateDirection(1);
	//  318  654:aload_0         
	//  319  655:iconst_1        
	//  320  656:invokespecial   #643 <Method void setLayoutStateDirection(int)>
			fill(recycler, mLayoutState, state);
	//  321  659:aload_0         
	//  322  660:aload_1         
	//  323  661:aload_0         
	//  324  662:getfield        #138 <Field LayoutState mLayoutState>
	//  325  665:aload_2         
	//  326  666:invokespecial   #645 <Method int fill(RecyclerView$Recycler, LayoutState, RecyclerView$State)>
	//  327  669:pop             
			setLayoutStateDirection(-1);
	//  328  670:aload_0         
	//  329  671:iconst_m1       
	//  330  672:invokespecial   #643 <Method void setLayoutStateDirection(int)>
			mLayoutState.mCurrentPosition = anchorinfo.mPosition + mLayoutState.mItemDirection;
	//  331  675:aload_0         
	//  332  676:getfield        #138 <Field LayoutState mLayoutState>
	//  333  679:aload           8
	//  334  681:getfield        #636 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
	//  335  684:aload_0         
	//  336  685:getfield        #138 <Field LayoutState mLayoutState>
	//  337  688:getfield        #402 <Field int LayoutState.mItemDirection>
	//  338  691:iadd            
	//  339  692:putfield        #648 <Field int LayoutState.mCurrentPosition>
			fill(recycler, mLayoutState, state);
	//  340  695:aload_0         
	//  341  696:aload_1         
	//  342  697:aload_0         
	//  343  698:getfield        #138 <Field LayoutState mLayoutState>
	//  344  701:aload_2         
	//  345  702:invokespecial   #645 <Method int fill(RecyclerView$Recycler, LayoutState, RecyclerView$State)>
	//  346  705:pop             
		}
		repositionToWrapContentIfNecessary();
		if(getChildCount() > 0)
			if(mShouldReverseLayout)
			{
				fixEndGap(recycler, state, true);
				fixStartGap(recycler, state, false);
			} else
	//* 347  706:goto            431
			{
				fixStartGap(recycler, state, true);
	//  348  709:aload_0         
	//  349  710:aload_1         
	//  350  711:aload_2         
	//  351  712:iconst_1        
	//  352  713:invokespecial   #655 <Method void fixStartGap(RecyclerView$Recycler, RecyclerView$State, boolean)>
				fixEndGap(recycler, state, false);
	//  353  716:aload_0         
	//  354  717:aload_1         
	//  355  718:aload_2         
	//  356  719:iconst_0        
	//  357  720:invokespecial   #653 <Method void fixEndGap(RecyclerView$Recycler, RecyclerView$State, boolean)>
			}
		flag3 = false;
		flag1 = flag3;
		if(!flag) goto _L4; else goto _L3
_L3:
		flag1 = flag3;
		if(state.isPreLayout()) goto _L4; else goto _L5
_L5:
		if(mGapStrategy == 0 || getChildCount() <= 0)
			break MISSING_BLOCK_LABEL_726;
		i = ((int) (flag2));
		if(!mLaidOutInvalidFullSpan)
		{
			if(hasGapsToFix() == null)
				break MISSING_BLOCK_LABEL_726;
			i = ((int) (flag2));
		}
_L7:
		flag1 = flag3;
		if(i != 0)
		{
			removeCallbacks(mCheckForGapsRunnable);
			flag1 = flag3;
			if(checkForGaps())
				flag1 = true;
		}
_L4:
		if(state.isPreLayout())
			mAnchorInfo.reset();
		mLastLayoutFromEnd = anchorinfo.mLayoutFromEnd;
		mLastLayoutRTL = isLayoutRTL();
		if(flag1)
		{
			mAnchorInfo.reset();
			onLayoutChildren(recycler, state, false);
			return;
		}
		  goto _L6
	//* 358  723:goto            463
		i = 0;
	//  359  726:iconst_0        
	//  360  727:istore          4
		  goto _L7
	//* 361  729:goto            521
	}

	private boolean preferLastSpan(int i)
	{
		if(mOrientation != 0) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field int mOrientation>
	//    2    4:ifne            31
_L1:
		boolean flag;
		if(i == -1)
	//*   3    7:iload_1         
	//*   4    8:iconst_m1       
	//*   5    9:icmpne          24
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_2        
		else
	//*   8   14:iload_2         
	//*   9   15:aload_0         
	//*  10   16:getfield        #97  <Field boolean mShouldReverseLayout>
	//*  11   19:icmpeq          29
	//*  12   22:iconst_1        
	//*  13   23:ireturn         
			flag = false;
	//   14   24:iconst_0        
	//   15   25:istore_2        
		if(flag == mShouldReverseLayout) goto _L4; else goto _L3
_L3:
		return true;
	//*  16   26:goto            14
_L4:
		return false;
	//   17   29:iconst_0        
	//   18   30:ireturn         
_L2:
		boolean flag1;
		if(i == -1)
	//*  19   31:iload_1         
	//*  20   32:iconst_m1       
	//*  21   33:icmpne          58
			flag1 = true;
	//   22   36:iconst_1        
	//   23   37:istore_2        
		else
	//*  24   38:iload_2         
	//*  25   39:aload_0         
	//*  26   40:getfield        #97  <Field boolean mShouldReverseLayout>
	//*  27   43:icmpne          63
	//*  28   46:iconst_1        
	//*  29   47:istore_2        
	//*  30   48:iload_2         
	//*  31   49:aload_0         
	//*  32   50:invokevirtual   #315 <Method boolean isLayoutRTL()>
	//*  33   53:icmpeq          22
	//*  34   56:iconst_0        
	//*  35   57:ireturn         
			flag1 = false;
	//   36   58:iconst_0        
	//   37   59:istore_2        
		if(flag1 == mShouldReverseLayout)
			flag1 = true;
		else
	//*  38   60:goto            38
			flag1 = false;
	//   39   63:iconst_0        
	//   40   64:istore_2        
		if(flag1 != isLayoutRTL())
			return false;
		if(true) goto _L3; else goto _L5
	//   41   65:goto            48
_L5:
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
	//    8   12:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//    9   15:iload_2         
	//   10   16:aaload          
	//   11   17:aload_1         
	//   12   18:invokevirtual   #254 <Method void StaggeredGridLayoutManager$Span.prependToSpan(View)>

	//   13   21:iload_2         
	//   14   22:iconst_1        
	//   15   23:isub            
	//   16   24:istore_2        
	//*  17   25:goto            7
	//   18   28:return          
	}

	private void recycle(RecyclerView.Recycler recycler, LayoutState layoutstate)
	{
		if(!layoutstate.mRecycle || layoutstate.mInfinite)
	//*   0    0:aload_2         
	//*   1    1:getfield        #629 <Field boolean LayoutState.mRecycle>
	//*   2    4:ifeq            14
	//*   3    7:aload_2         
	//*   4    8:getfield        #345 <Field boolean LayoutState.mInfinite>
	//*   5   11:ifeq            15
			return;
	//    6   14:return          
		if(layoutstate.mAvailable == 0)
	//*   7   15:aload_2         
	//*   8   16:getfield        #425 <Field int LayoutState.mAvailable>
	//*   9   19:ifne            50
			if(layoutstate.mLayoutDirection == -1)
	//*  10   22:aload_2         
	//*  11   23:getfield        #239 <Field int LayoutState.mLayoutDirection>
	//*  12   26:iconst_m1       
	//*  13   27:icmpne          40
			{
				recycleFromEnd(recycler, layoutstate.mEndLine);
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:aload_2         
	//   17   33:getfield        #422 <Field int LayoutState.mEndLine>
	//   18   36:invokespecial   #675 <Method void recycleFromEnd(RecyclerView$Recycler, int)>
				return;
	//   19   39:return          
			} else
			{
				recycleFromStart(recycler, layoutstate.mStartLine);
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:aload_2         
	//   23   43:getfield        #428 <Field int LayoutState.mStartLine>
	//   24   46:invokespecial   #678 <Method void recycleFromStart(RecyclerView$Recycler, int)>
				return;
	//   25   49:return          
			}
		if(layoutstate.mLayoutDirection == -1)
	//*  26   50:aload_2         
	//*  27   51:getfield        #239 <Field int LayoutState.mLayoutDirection>
	//*  28   54:iconst_m1       
	//*  29   55:icmpne          105
		{
			int i = layoutstate.mStartLine - getMaxStart(layoutstate.mStartLine);
	//   30   58:aload_2         
	//   31   59:getfield        #428 <Field int LayoutState.mStartLine>
	//   32   62:aload_0         
	//   33   63:aload_2         
	//   34   64:getfield        #428 <Field int LayoutState.mStartLine>
	//   35   67:invokespecial   #680 <Method int getMaxStart(int)>
	//   36   70:isub            
	//   37   71:istore_3        
			if(i < 0)
	//*  38   72:iload_3         
	//*  39   73:ifge            88
				i = layoutstate.mEndLine;
	//   40   76:aload_2         
	//   41   77:getfield        #422 <Field int LayoutState.mEndLine>
	//   42   80:istore_3        
			else
	//*  43   81:aload_0         
	//*  44   82:aload_1         
	//*  45   83:iload_3         
	//*  46   84:invokespecial   #675 <Method void recycleFromEnd(RecyclerView$Recycler, int)>
	//*  47   87:return          
				i = layoutstate.mEndLine - Math.min(i, layoutstate.mAvailable);
	//   48   88:aload_2         
	//   49   89:getfield        #422 <Field int LayoutState.mEndLine>
	//   50   92:iload_3         
	//   51   93:aload_2         
	//   52   94:getfield        #425 <Field int LayoutState.mAvailable>
	//   53   97:invokestatic    #470 <Method int Math.min(int, int)>
	//   54  100:isub            
	//   55  101:istore_3        
			recycleFromEnd(recycler, i);
			return;
		}
	//*  56  102:goto            81
		int j = getMinEnd(layoutstate.mEndLine) - layoutstate.mEndLine;
	//   57  105:aload_0         
	//   58  106:aload_2         
	//   59  107:getfield        #422 <Field int LayoutState.mEndLine>
	//   60  110:invokespecial   #682 <Method int getMinEnd(int)>
	//   61  113:aload_2         
	//   62  114:getfield        #422 <Field int LayoutState.mEndLine>
	//   63  117:isub            
	//   64  118:istore_3        
		if(j < 0)
	//*  65  119:iload_3         
	//*  66  120:ifge            135
			j = layoutstate.mStartLine;
	//   67  123:aload_2         
	//   68  124:getfield        #428 <Field int LayoutState.mStartLine>
	//   69  127:istore_3        
		else
	//*  70  128:aload_0         
	//*  71  129:aload_1         
	//*  72  130:iload_3         
	//*  73  131:invokespecial   #678 <Method void recycleFromStart(RecyclerView$Recycler, int)>
	//*  74  134:return          
			j = layoutstate.mStartLine + Math.min(j, layoutstate.mAvailable);
	//   75  135:aload_2         
	//   76  136:getfield        #428 <Field int LayoutState.mStartLine>
	//   77  139:iload_3         
	//   78  140:aload_2         
	//   79  141:getfield        #425 <Field int LayoutState.mAvailable>
	//   80  144:invokestatic    #470 <Method int Math.min(int, int)>
	//   81  147:iadd            
	//   82  148:istore_3        
		recycleFromStart(recycler, j);
	//*  83  149:goto            128
	}

	private void recycleFromEnd(RecyclerView.Recycler recycler, int i)
	{
		int j = getChildCount() - 1;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #259 <Method int getChildCount()>
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:istore_3        
_L12:
		if(j < 0) goto _L2; else goto _L1
	//    5    7:iload_3         
	//    6    8:iflt            91
_L1:
		View view = getChildAt(j);
	//    7   11:aload_0         
	//    8   12:iload_3         
	//    9   13:invokevirtual   #475 <Method View getChildAt(int)>
	//   10   16:astore          5
		if(mPrimaryOrientation.getDecoratedStart(view) < i || mPrimaryOrientation.getTransformedStartWithDecoration(view) < i) goto _L2; else goto _L3
	//   11   18:aload_0         
	//   12   19:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   13   22:aload           5
	//   14   24:invokevirtual   #685 <Method int OrientationHelper.getDecoratedStart(View)>
	//   15   27:iload_2         
	//   16   28:icmplt          91
	//   17   31:aload_0         
	//   18   32:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   19   35:aload           5
	//   20   37:invokevirtual   #688 <Method int OrientationHelper.getTransformedStartWithDecoration(View)>
	//   21   40:iload_2         
	//   22   41:icmplt          91
_L3:
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   23   44:aload           5
	//   24   46:invokevirtual   #363 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   25   49:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//   26   52:astore          6
		if(!layoutparams.mFullSpan) goto _L5; else goto _L4
	//   27   54:aload           6
	//   28   56:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//   29   59:ifeq            132
_L4:
		int k = 0;
	//   30   62:iconst_0        
	//   31   63:istore          4
_L9:
		if(k >= mSpanCount) goto _L7; else goto _L6
	//   32   65:iload           4
	//   33   67:aload_0         
	//   34   68:getfield        #93  <Field int mSpanCount>
	//   35   71:icmpge          101
_L6:
		if(mSpans[k].mViews.size() != 1) goto _L8; else goto _L2
	//   36   74:aload_0         
	//   37   75:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   38   78:iload           4
	//   39   80:aaload          
	//   40   81:getfield        #271 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//   41   84:invokevirtual   #276 <Method int ArrayList.size()>
	//   42   87:iconst_1        
	//   43   88:icmpne          92
_L2:
		return;
	//   44   91:return          
_L8:
		k++;
	//   45   92:iload           4
	//   46   94:iconst_1        
	//   47   95:iadd            
	//   48   96:istore          4
		  goto _L9
	//*  49   98:goto            65
_L7:
		for(int l = 0; l < mSpanCount; l++)
	//*  50  101:iconst_0        
	//*  51  102:istore          4
	//*  52  104:iload           4
	//*  53  106:aload_0         
	//*  54  107:getfield        #93  <Field int mSpanCount>
	//*  55  110:icmpge          155
			mSpans[l].popEnd();
	//   56  113:aload_0         
	//   57  114:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   58  117:iload           4
	//   59  119:aaload          
	//   60  120:invokevirtual   #691 <Method void StaggeredGridLayoutManager$Span.popEnd()>

	//   61  123:iload           4
	//   62  125:iconst_1        
	//   63  126:iadd            
	//   64  127:istore          4
		break; /* Loop/switch isn't completed */
	//   65  129:goto            104
_L5:
		if(layoutparams.mSpan.mViews.size() == 1)
			continue; /* Loop/switch isn't completed */
	//   66  132:aload           6
	//   67  134:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//   68  137:getfield        #271 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//   69  140:invokevirtual   #276 <Method int ArrayList.size()>
	//   70  143:iconst_1        
	//   71  144:icmpeq          91
		layoutparams.mSpan.popEnd();
	//   72  147:aload           6
	//   73  149:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//   74  152:invokevirtual   #691 <Method void StaggeredGridLayoutManager$Span.popEnd()>
		break; /* Loop/switch isn't completed */
		if(true) goto _L2; else goto _L10
_L10:
		removeAndRecycleView(view, recycler);
	//   75  155:aload_0         
	//   76  156:aload           5
	//   77  158:aload_1         
	//   78  159:invokevirtual   #695 <Method void removeAndRecycleView(View, RecyclerView$Recycler)>
		j--;
	//   79  162:iload_3         
	//   80  163:iconst_1        
	//   81  164:isub            
	//   82  165:istore_3        
		if(true) goto _L12; else goto _L11
	//   83  166:goto            7
_L11:
	}

	private void recycleFromStart(RecyclerView.Recycler recycler, int i)
	{
_L12:
		if(getChildCount() <= 0) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:invokevirtual   #259 <Method int getChildCount()>
	//    2    4:ifle            84
_L1:
		View view = getChildAt(0);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #475 <Method View getChildAt(int)>
	//    6   12:astore          4
		if(mPrimaryOrientation.getDecoratedEnd(view) > i || mPrimaryOrientation.getTransformedEndWithDecoration(view) > i) goto _L2; else goto _L3
	//    7   14:aload_0         
	//    8   15:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//    9   18:aload           4
	//   10   20:invokevirtual   #698 <Method int OrientationHelper.getDecoratedEnd(View)>
	//   11   23:iload_2         
	//   12   24:icmpgt          84
	//   13   27:aload_0         
	//   14   28:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   15   31:aload           4
	//   16   33:invokevirtual   #701 <Method int OrientationHelper.getTransformedEndWithDecoration(View)>
	//   17   36:iload_2         
	//   18   37:icmpgt          84
_L3:
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   19   40:aload           4
	//   20   42:invokevirtual   #363 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   21   45:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//   22   48:astore          5
		if(!layoutparams.mFullSpan) goto _L5; else goto _L4
	//   23   50:aload           5
	//   24   52:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//   25   55:ifeq            118
_L4:
		int j = 0;
	//   26   58:iconst_0        
	//   27   59:istore_3        
_L9:
		if(j >= mSpanCount) goto _L7; else goto _L6
	//   28   60:iload_3         
	//   29   61:aload_0         
	//   30   62:getfield        #93  <Field int mSpanCount>
	//   31   65:icmpge          92
_L6:
		if(mSpans[j].mViews.size() != 1) goto _L8; else goto _L2
	//   32   68:aload_0         
	//   33   69:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   34   72:iload_3         
	//   35   73:aaload          
	//   36   74:getfield        #271 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//   37   77:invokevirtual   #276 <Method int ArrayList.size()>
	//   38   80:iconst_1        
	//   39   81:icmpne          85
_L2:
		return;
	//   40   84:return          
_L8:
		j++;
	//   41   85:iload_3         
	//   42   86:iconst_1        
	//   43   87:iadd            
	//   44   88:istore_3        
		  goto _L9
	//*  45   89:goto            60
_L7:
		for(int k = 0; k < mSpanCount; k++)
	//*  46   92:iconst_0        
	//*  47   93:istore_3        
	//*  48   94:iload_3         
	//*  49   95:aload_0         
	//*  50   96:getfield        #93  <Field int mSpanCount>
	//*  51   99:icmpge          141
			mSpans[k].popStart();
	//   52  102:aload_0         
	//   53  103:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   54  106:iload_3         
	//   55  107:aaload          
	//   56  108:invokevirtual   #704 <Method void StaggeredGridLayoutManager$Span.popStart()>

	//   57  111:iload_3         
	//   58  112:iconst_1        
	//   59  113:iadd            
	//   60  114:istore_3        
		break; /* Loop/switch isn't completed */
	//   61  115:goto            94
_L5:
		if(layoutparams.mSpan.mViews.size() == 1)
			continue; /* Loop/switch isn't completed */
	//   62  118:aload           5
	//   63  120:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//   64  123:getfield        #271 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//   65  126:invokevirtual   #276 <Method int ArrayList.size()>
	//   66  129:iconst_1        
	//   67  130:icmpeq          84
		layoutparams.mSpan.popStart();
	//   68  133:aload           5
	//   69  135:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//   70  138:invokevirtual   #704 <Method void StaggeredGridLayoutManager$Span.popStart()>
		break; /* Loop/switch isn't completed */
		if(true) goto _L2; else goto _L10
_L10:
		removeAndRecycleView(view, recycler);
	//   71  141:aload_0         
	//   72  142:aload           4
	//   73  144:aload_1         
	//   74  145:invokevirtual   #695 <Method void removeAndRecycleView(View, RecyclerView$Recycler)>
		if(true) goto _L12; else goto _L11
	//   75  148:goto            0
_L11:
	}

	private void repositionToWrapContentIfNecessary()
	{
		if(mSecondaryOrientation.getMode() != 0x40000000) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #332 <Field OrientationHelper mSecondaryOrientation>
	//    2    4:invokevirtual   #707 <Method int OrientationHelper.getMode()>
	//    3    7:ldc2            #708 <Int 0x40000000>
	//    4   10:icmpne          14
_L1:
		return;
	//    5   13:return          
_L2:
		float f = 0.0F;
	//    6   14:fconst_0        
	//    7   15:fstore_1        
		int i1 = getChildCount();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #259 <Method int getChildCount()>
	//   10   20:istore          6
		int i = 0;
	//   11   22:iconst_0        
	//   12   23:istore          4
		while(i < i1) 
	//*  13   25:iload           4
	//*  14   27:iload           6
	//*  15   29:icmpge          101
		{
			View view = getChildAt(i);
	//   16   32:aload_0         
	//   17   33:iload           4
	//   18   35:invokevirtual   #475 <Method View getChildAt(int)>
	//   19   38:astore          9
			float f2 = mSecondaryOrientation.getDecoratedMeasurement(view);
	//   20   40:aload_0         
	//   21   41:getfield        #332 <Field OrientationHelper mSecondaryOrientation>
	//   22   44:aload           9
	//   23   46:invokevirtual   #387 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   24   49:i2f             
	//   25   50:fstore_3        
			if(f2 >= f)
	//*  26   51:fload_3         
	//*  27   52:fload_1         
	//*  28   53:fcmpg           
	//*  29   54:ifge            66
	//*  30   57:iload           4
	//*  31   59:iconst_1        
	//*  32   60:iadd            
	//*  33   61:istore          4
	//*  34   63:goto            25
			{
				float f1 = f2;
	//   35   66:fload_3         
	//   36   67:fstore_2        
				if(((LayoutParams)view.getLayoutParams()).isFullSpan())
	//*  37   68:aload           9
	//*  38   70:invokevirtual   #363 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  39   73:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//*  40   76:invokevirtual   #711 <Method boolean StaggeredGridLayoutManager$LayoutParams.isFullSpan()>
	//*  41   79:ifeq            92
					f1 = (1.0F * f2) / (float)mSpanCount;
	//   42   82:fconst_1        
	//   43   83:fload_3         
	//   44   84:fmul            
	//   45   85:aload_0         
	//   46   86:getfield        #93  <Field int mSpanCount>
	//   47   89:i2f             
	//   48   90:fdiv            
	//   49   91:fstore_2        
				f = Math.max(f, f1);
	//   50   92:fload_1         
	//   51   93:fload_2         
	//   52   94:invokestatic    #715 <Method float Math.max(float, float)>
	//   53   97:fstore_1        
			}
			i++;
		}
	//*  54   98:goto            57
		int j1 = mSizePerSpan;
	//   55  101:aload_0         
	//   56  102:getfield        #457 <Field int mSizePerSpan>
	//   57  105:istore          7
		int k = Math.round((float)mSpanCount * f);
	//   58  107:aload_0         
	//   59  108:getfield        #93  <Field int mSpanCount>
	//   60  111:i2f             
	//   61  112:fload_1         
	//   62  113:fmul            
	//   63  114:invokestatic    #719 <Method int Math.round(float)>
	//   64  117:istore          5
		i = k;
	//   65  119:iload           5
	//   66  121:istore          4
		if(mSecondaryOrientation.getMode() == 0x80000000)
	//*  67  123:aload_0         
	//*  68  124:getfield        #332 <Field OrientationHelper mSecondaryOrientation>
	//*  69  127:invokevirtual   #707 <Method int OrientationHelper.getMode()>
	//*  70  130:ldc1            #43  <Int 0x80000000>
	//*  71  132:icmpne          149
			i = Math.min(k, mSecondaryOrientation.getTotalSpace());
	//   72  135:iload           5
	//   73  137:aload_0         
	//   74  138:getfield        #332 <Field OrientationHelper mSecondaryOrientation>
	//   75  141:invokevirtual   #632 <Method int OrientationHelper.getTotalSpace()>
	//   76  144:invokestatic    #470 <Method int Math.min(int, int)>
	//   77  147:istore          4
		updateMeasureSpecs(i);
	//   78  149:aload_0         
	//   79  150:iload           4
	//   80  152:invokevirtual   #635 <Method void updateMeasureSpecs(int)>
		if(mSizePerSpan != j1)
	//*  81  155:aload_0         
	//*  82  156:getfield        #457 <Field int mSizePerSpan>
	//*  83  159:iload           7
	//*  84  161:icmpeq          13
		{
			int j = 0;
	//   85  164:iconst_0        
	//   86  165:istore          4
			while(j < i1) 
	//*  87  167:iload           4
	//*  88  169:iload           6
	//*  89  171:icmpge          13
			{
				View view1 = getChildAt(j);
	//   90  174:aload_0         
	//   91  175:iload           4
	//   92  177:invokevirtual   #475 <Method View getChildAt(int)>
	//   93  180:astore          9
				LayoutParams layoutparams = (LayoutParams)view1.getLayoutParams();
	//   94  182:aload           9
	//   95  184:invokevirtual   #363 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   96  187:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//   97  190:astore          10
				if(!layoutparams.mFullSpan)
	//*  98  192:aload           10
	//*  99  194:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 100  197:ifeq            209
	//* 101  200:iload           4
	//* 102  202:iconst_1        
	//* 103  203:iadd            
	//* 104  204:istore          4
	//* 105  206:goto            167
					if(isLayoutRTL() && mOrientation == 1)
	//* 106  209:aload_0         
	//* 107  210:invokevirtual   #315 <Method boolean isLayoutRTL()>
	//* 108  213:ifeq            273
	//* 109  216:aload_0         
	//* 110  217:getfield        #125 <Field int mOrientation>
	//* 111  220:iconst_1        
	//* 112  221:icmpne          273
					{
						view1.offsetLeftAndRight(-(mSpanCount - 1 - layoutparams.mSpan.mIndex) * mSizePerSpan - -(mSpanCount - 1 - layoutparams.mSpan.mIndex) * j1);
	//  113  224:aload           9
	//  114  226:aload_0         
	//  115  227:getfield        #93  <Field int mSpanCount>
	//  116  230:iconst_1        
	//  117  231:isub            
	//  118  232:aload           10
	//  119  234:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//  120  237:getfield        #455 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//  121  240:isub            
	//  122  241:ineg            
	//  123  242:aload_0         
	//  124  243:getfield        #457 <Field int mSizePerSpan>
	//  125  246:imul            
	//  126  247:aload_0         
	//  127  248:getfield        #93  <Field int mSpanCount>
	//  128  251:iconst_1        
	//  129  252:isub            
	//  130  253:aload           10
	//  131  255:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//  132  258:getfield        #455 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//  133  261:isub            
	//  134  262:ineg            
	//  135  263:iload           7
	//  136  265:imul            
	//  137  266:isub            
	//  138  267:invokevirtual   #722 <Method void View.offsetLeftAndRight(int)>
					} else
	//* 139  270:goto            200
					{
						int l = layoutparams.mSpan.mIndex * mSizePerSpan;
	//  140  273:aload           10
	//  141  275:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//  142  278:getfield        #455 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//  143  281:aload_0         
	//  144  282:getfield        #457 <Field int mSizePerSpan>
	//  145  285:imul            
	//  146  286:istore          5
						int k1 = layoutparams.mSpan.mIndex * j1;
	//  147  288:aload           10
	//  148  290:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//  149  293:getfield        #455 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//  150  296:iload           7
	//  151  298:imul            
	//  152  299:istore          8
						if(mOrientation == 1)
	//* 153  301:aload_0         
	//* 154  302:getfield        #125 <Field int mOrientation>
	//* 155  305:iconst_1        
	//* 156  306:icmpne          322
							view1.offsetLeftAndRight(l - k1);
	//  157  309:aload           9
	//  158  311:iload           5
	//  159  313:iload           8
	//  160  315:isub            
	//  161  316:invokevirtual   #722 <Method void View.offsetLeftAndRight(int)>
						else
	//* 162  319:goto            200
							view1.offsetTopAndBottom(l - k1);
	//  163  322:aload           9
	//  164  324:iload           5
	//  165  326:iload           8
	//  166  328:isub            
	//  167  329:invokevirtual   #725 <Method void View.offsetTopAndBottom(int)>
					}
				j++;
			}
		}
		if(true) goto _L1; else goto _L3
	//  168  332:goto            200
_L3:
	}

	private void resolveShouldLayoutReverse()
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_1        
		if(mOrientation == 1 || !isLayoutRTL())
	//*   2    2:aload_0         
	//*   3    3:getfield        #125 <Field int mOrientation>
	//*   4    6:iconst_1        
	//*   5    7:icmpeq          17
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #315 <Method boolean isLayoutRTL()>
	//*   8   14:ifne            26
		{
			mShouldReverseLayout = mReverseLayout;
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #95  <Field boolean mReverseLayout>
	//   12   22:putfield        #97  <Field boolean mShouldReverseLayout>
			return;
	//   13   25:return          
		}
		if(mReverseLayout)
	//*  14   26:aload_0         
	//*  15   27:getfield        #95  <Field boolean mReverseLayout>
	//*  16   30:ifne            39
	//*  17   33:aload_0         
	//*  18   34:iload_1         
	//*  19   35:putfield        #97  <Field boolean mShouldReverseLayout>
	//*  20   38:return          
			flag = false;
	//   21   39:iconst_0        
	//   22   40:istore_1        
		mShouldReverseLayout = flag;
	//*  23   41:goto            33
	}

	private void setLayoutStateDirection(int i)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		mLayoutState.mLayoutDirection = i;
	//    2    2:aload_0         
	//    3    3:getfield        #138 <Field LayoutState mLayoutState>
	//    4    6:iload_1         
	//    5    7:putfield        #239 <Field int LayoutState.mLayoutDirection>
		LayoutState layoutstate = mLayoutState;
	//    6   10:aload_0         
	//    7   11:getfield        #138 <Field LayoutState mLayoutState>
	//    8   14:astore          5
		boolean flag2 = mShouldReverseLayout;
	//    9   16:aload_0         
	//   10   17:getfield        #97  <Field boolean mShouldReverseLayout>
	//   11   20:istore          4
		boolean flag1;
		if(i == -1)
	//*  12   22:iload_1         
	//*  13   23:iconst_m1       
	//*  14   24:icmpne          44
			flag1 = true;
	//   15   27:iconst_1        
	//   16   28:istore_3        
		else
	//*  17   29:iload           4
	//*  18   31:iload_3         
	//*  19   32:icmpne          49
	//*  20   35:iload_2         
	//*  21   36:istore_1        
	//*  22   37:aload           5
	//*  23   39:iload_1         
	//*  24   40:putfield        #402 <Field int LayoutState.mItemDirection>
	//*  25   43:return          
			flag1 = false;
	//   26   44:iconst_0        
	//   27   45:istore_3        
		if(flag2 == flag1)
			i = ((int) (flag));
		else
	//*  28   46:goto            29
			i = -1;
	//   29   49:iconst_m1       
	//   30   50:istore_1        
		layoutstate.mItemDirection = i;
	//*  31   51:goto            37
	}

	private void updateAllRemainingSpans(int i, int j)
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		while(k < mSpanCount) 
	//*   2    2:iload_3         
	//*   3    3:aload_0         
	//*   4    4:getfield        #93  <Field int mSpanCount>
	//*   5    7:icmpge          47
		{
			if(!mSpans[k].mViews.isEmpty())
	//*   6   10:aload_0         
	//*   7   11:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//*   8   14:iload_3         
	//*   9   15:aaload          
	//*  10   16:getfield        #271 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//*  11   19:invokevirtual   #726 <Method boolean ArrayList.isEmpty()>
	//*  12   22:ifeq            32
	//*  13   25:iload_3         
	//*  14   26:iconst_1        
	//*  15   27:iadd            
	//*  16   28:istore_3        
	//*  17   29:goto            2
				updateRemainingSpans(mSpans[k], i, j);
	//   18   32:aload_0         
	//   19   33:aload_0         
	//   20   34:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   21   37:iload_3         
	//   22   38:aaload          
	//   23   39:iload_1         
	//   24   40:iload_2         
	//   25   41:invokespecial   #461 <Method void updateRemainingSpans(StaggeredGridLayoutManager$Span, int, int)>
			k++;
		}
	//*  26   44:goto            25
	//   27   47:return          
	}

	private boolean updateAnchorFromChildren(RecyclerView.State state, AnchorInfo anchorinfo)
	{
		int i;
		if(mLastLayoutFromEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #605 <Field boolean mLastLayoutFromEnd>
	//*   2    4:ifeq            29
			i = findLastReferenceChildPosition(state.getItemCount());
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #587 <Method int RecyclerView$State.getItemCount()>
	//    6   12:invokespecial   #730 <Method int findLastReferenceChildPosition(int)>
	//    7   15:istore_3        
		else
	//*   8   16:aload_2         
	//*   9   17:iload_3         
	//*  10   18:putfield        #636 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
	//*  11   21:aload_2         
	//*  12   22:ldc1            #43  <Int 0x80000000>
	//*  13   24:putfield        #612 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
	//*  14   27:iconst_1        
	//*  15   28:ireturn         
			i = findFirstReferenceChildPosition(state.getItemCount());
	//   16   29:aload_0         
	//   17   30:aload_1         
	//   18   31:invokevirtual   #587 <Method int RecyclerView$State.getItemCount()>
	//   19   34:invokespecial   #732 <Method int findFirstReferenceChildPosition(int)>
	//   20   37:istore_3        
		anchorinfo.mPosition = i;
		anchorinfo.mOffset = 0x80000000;
		return true;
	//*  21   38:goto            16
	}

	private void updateLayoutState(int i, RecyclerView.State state)
	{
		boolean flag3 = true;
	//    0    0:iconst_1        
	//    1    1:istore          9
		mLayoutState.mAvailable = 0;
	//    2    3:aload_0         
	//    3    4:getfield        #138 <Field LayoutState mLayoutState>
	//    4    7:iconst_0        
	//    5    8:putfield        #425 <Field int LayoutState.mAvailable>
		mLayoutState.mCurrentPosition = i;
	//    6   11:aload_0         
	//    7   12:getfield        #138 <Field LayoutState mLayoutState>
	//    8   15:iload_1         
	//    9   16:putfield        #648 <Field int LayoutState.mCurrentPosition>
		boolean flag = false;
	//   10   19:iconst_0        
	//   11   20:istore          5
		boolean flag1 = false;
	//   12   22:iconst_0        
	//   13   23:istore          6
		int j = ((int) (flag1));
	//   14   25:iload           6
	//   15   27:istore_3        
		int k = ((int) (flag));
	//   16   28:iload           5
	//   17   30:istore          4
		boolean flag2;
		if(isSmoothScrolling())
	//*  18   32:aload_0         
	//*  19   33:invokevirtual   #735 <Method boolean isSmoothScrolling()>
	//*  20   36:ifeq            92
		{
			int l = state.getTargetScrollPosition();
	//   21   39:aload_2         
	//   22   40:invokevirtual   #738 <Method int RecyclerView$State.getTargetScrollPosition()>
	//   23   43:istore          7
			j = ((int) (flag1));
	//   24   45:iload           6
	//   25   47:istore_3        
			k = ((int) (flag));
	//   26   48:iload           5
	//   27   50:istore          4
			if(l != -1)
	//*  28   52:iload           7
	//*  29   54:iconst_m1       
	//*  30   55:icmpeq          92
			{
				boolean flag4 = mShouldReverseLayout;
	//   31   58:aload_0         
	//   32   59:getfield        #97  <Field boolean mShouldReverseLayout>
	//   33   62:istore          10
				if(l < i)
	//*  34   64:iload           7
	//*  35   66:iload_1         
	//*  36   67:icmpge          184
					flag2 = true;
	//   37   70:iconst_1        
	//   38   71:istore          8
				else
	//*  39   73:iload           10
	//*  40   75:iload           8
	//*  41   77:icmpne          190
	//*  42   80:aload_0         
	//*  43   81:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//*  44   84:invokevirtual   #632 <Method int OrientationHelper.getTotalSpace()>
	//*  45   87:istore_3        
	//*  46   88:iload           5
	//*  47   90:istore          4
	//*  48   92:aload_0         
	//*  49   93:invokevirtual   #741 <Method boolean getClipToPadding()>
	//*  50   96:ifeq            205
	//*  51   99:aload_0         
	//*  52  100:getfield        #138 <Field LayoutState mLayoutState>
	//*  53  103:aload_0         
	//*  54  104:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//*  55  107:invokevirtual   #201 <Method int OrientationHelper.getStartAfterPadding()>
	//*  56  110:iload           4
	//*  57  112:isub            
	//*  58  113:putfield        #428 <Field int LayoutState.mStartLine>
	//*  59  116:aload_0         
	//*  60  117:getfield        #138 <Field LayoutState mLayoutState>
	//*  61  120:aload_0         
	//*  62  121:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//*  63  124:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//*  64  127:iload_3         
	//*  65  128:iadd            
	//*  66  129:putfield        #422 <Field int LayoutState.mEndLine>
	//*  67  132:aload_0         
	//*  68  133:getfield        #138 <Field LayoutState mLayoutState>
	//*  69  136:iconst_0        
	//*  70  137:putfield        #415 <Field boolean LayoutState.mStopInFocusable>
	//*  71  140:aload_0         
	//*  72  141:getfield        #138 <Field LayoutState mLayoutState>
	//*  73  144:iconst_1        
	//*  74  145:putfield        #629 <Field boolean LayoutState.mRecycle>
	//*  75  148:aload_0         
	//*  76  149:getfield        #138 <Field LayoutState mLayoutState>
	//*  77  152:astore_2        
	//*  78  153:aload_0         
	//*  79  154:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//*  80  157:invokevirtual   #707 <Method int OrientationHelper.getMode()>
	//*  81  160:ifne            234
	//*  82  163:aload_0         
	//*  83  164:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//*  84  167:invokevirtual   #744 <Method int OrientationHelper.getEnd()>
	//*  85  170:ifne            234
	//*  86  173:iload           9
	//*  87  175:istore          8
	//*  88  177:aload_2         
	//*  89  178:iload           8
	//*  90  180:putfield        #345 <Field boolean LayoutState.mInfinite>
	//*  91  183:return          
					flag2 = false;
	//   92  184:iconst_0        
	//   93  185:istore          8
				if(flag4 == flag2)
				{
					j = mPrimaryOrientation.getTotalSpace();
					k = ((int) (flag));
				} else
	//*  94  187:goto            73
				{
					k = mPrimaryOrientation.getTotalSpace();
	//   95  190:aload_0         
	//   96  191:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   97  194:invokevirtual   #632 <Method int OrientationHelper.getTotalSpace()>
	//   98  197:istore          4
					j = ((int) (flag1));
	//   99  199:iload           6
	//  100  201:istore_3        
				}
			}
		}
		if(getClipToPadding())
		{
			mLayoutState.mStartLine = mPrimaryOrientation.getStartAfterPadding() - k;
			mLayoutState.mEndLine = mPrimaryOrientation.getEndAfterPadding() + j;
		} else
	//* 101  202:goto            92
		{
			mLayoutState.mEndLine = mPrimaryOrientation.getEnd() + j;
	//  102  205:aload_0         
	//  103  206:getfield        #138 <Field LayoutState mLayoutState>
	//  104  209:aload_0         
	//  105  210:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  106  213:invokevirtual   #744 <Method int OrientationHelper.getEnd()>
	//  107  216:iload_3         
	//  108  217:iadd            
	//  109  218:putfield        #422 <Field int LayoutState.mEndLine>
			mLayoutState.mStartLine = -k;
	//  110  221:aload_0         
	//  111  222:getfield        #138 <Field LayoutState mLayoutState>
	//  112  225:iload           4
	//  113  227:ineg            
	//  114  228:putfield        #428 <Field int LayoutState.mStartLine>
		}
		mLayoutState.mStopInFocusable = false;
		mLayoutState.mRecycle = true;
		state = ((RecyclerView.State) (mLayoutState));
		if(mPrimaryOrientation.getMode() == 0 && mPrimaryOrientation.getEnd() == 0)
			flag2 = flag3;
		else
	//* 115  231:goto            132
			flag2 = false;
	//  116  234:iconst_0        
	//  117  235:istore          8
		state.mInfinite = flag2;
	//* 118  237:goto            177
	}

	private void updateRemainingSpans(Span span, int i, int j)
	{
		int k = span.getDeletedSize();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #747 <Method int StaggeredGridLayoutManager$Span.getDeletedSize()>
	//    2    4:istore          4
		if(i == -1)
	//*   3    6:iload_2         
	//*   4    7:iconst_m1       
	//*   5    8:icmpne          35
		{
			if(span.getStartLine() + k <= j)
	//*   6   11:aload_1         
	//*   7   12:invokevirtual   #289 <Method int StaggeredGridLayoutManager$Span.getStartLine()>
	//*   8   15:iload           4
	//*   9   17:iadd            
	//*  10   18:iload_3         
	//*  11   19:icmpgt          34
				mRemainingSpans.set(span.mIndex, false);
	//   12   22:aload_0         
	//   13   23:getfield        #336 <Field BitSet mRemainingSpans>
	//   14   26:aload_1         
	//   15   27:getfield        #455 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//   16   30:iconst_0        
	//   17   31:invokevirtual   #464 <Method void BitSet.set(int, boolean)>
		} else
	//*  18   34:return          
		if(span.getEndLine() - k >= j)
	//*  19   35:aload_1         
	//*  20   36:invokevirtual   #267 <Method int StaggeredGridLayoutManager$Span.getEndLine()>
	//*  21   39:iload           4
	//*  22   41:isub            
	//*  23   42:iload_3         
	//*  24   43:icmplt          34
		{
			mRemainingSpans.set(span.mIndex, false);
	//   25   46:aload_0         
	//   26   47:getfield        #336 <Field BitSet mRemainingSpans>
	//   27   50:aload_1         
	//   28   51:getfield        #455 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//   29   54:iconst_0        
	//   30   55:invokevirtual   #464 <Method void BitSet.set(int, boolean)>
			return;
	//   31   58:return          
		}
	}

	private int updateSpecWithExtra(int i, int j, int k)
	{
		int l;
		if(j != 0 || k != 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            10
	//*   2    4:iload_3         
	//*   3    5:ifne            10
	//*   4    8:iload_1         
	//*   5    9:ireturn         
	//*   6   10:iload_1         
	//*   7   11:invokestatic    #751 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*   8   14:istore          4
			if((l = android.view.View.MeasureSpec.getMode(i)) == 0x80000000 || l == 0x40000000)
	//*   9   16:iload           4
	//*  10   18:ldc1            #43  <Int 0x80000000>
	//*  11   20:icmpeq          31
	//*  12   23:iload           4
	//*  13   25:ldc2            #708 <Int 0x40000000>
	//*  14   28:icmpne          8
				return android.view.View.MeasureSpec.makeMeasureSpec(Math.max(0, android.view.View.MeasureSpec.getSize(i) - j - k), l);
	//   15   31:iconst_0        
	//   16   32:iload_1         
	//   17   33:invokestatic    #754 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   18   36:iload_2         
	//   19   37:isub            
	//   20   38:iload_3         
	//   21   39:isub            
	//   22   40:invokestatic    #756 <Method int Math.max(int, int)>
	//   23   43:iload           4
	//   24   45:invokestatic    #759 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   25   48:ireturn         
		return i;
	}

	boolean areAllEndsEqual()
	{
		int j = mSpans[0].getEndLine(0x80000000);
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:ldc1            #43  <Int 0x80000000>
	//    5    8:invokevirtual   #323 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
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
	//*  14   23:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//*  15   26:iload_1         
	//*  16   27:aaload          
	//*  17   28:ldc1            #43  <Int 0x80000000>
	//*  18   30:invokevirtual   #323 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
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
	//    1    1:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:ldc1            #43  <Int 0x80000000>
	//    5    8:invokevirtual   #326 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
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
	//*  14   23:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//*  15   26:iload_1         
	//*  16   27:aaload          
	//*  17   28:ldc1            #43  <Int 0x80000000>
	//*  18   30:invokevirtual   #326 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
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
	//*   1    1:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*   2    4:ifnonnull       12
			super.assertNotInLayoutOrScroll(s);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #763 <Method void RecyclerView$LayoutManager.assertNotInLayoutOrScroll(String)>
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
		if(getChildCount() == 0 || mGapStrategy == 0 || !isAttachedToWindow())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #259 <Method int getChildCount()>
	//*   2    4:ifeq            21
	//*   3    7:aload_0         
	//*   4    8:getfield        #106 <Field int mGapStrategy>
	//*   5   11:ifeq            21
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #768 <Method boolean isAttachedToWindow()>
	//*   8   18:ifne            23
			return false;
	//    9   21:iconst_0        
	//   10   22:ireturn         
		int i;
		int j;
		if(mShouldReverseLayout)
	//*  11   23:aload_0         
	//*  12   24:getfield        #97  <Field boolean mShouldReverseLayout>
	//*  13   27:ifeq            68
		{
			j = getLastChildPosition();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #500 <Method int getLastChildPosition()>
	//   16   34:istore_2        
			i = getFirstChildPosition();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #262 <Method int getFirstChildPosition()>
	//   19   39:istore_1        
		} else
	//*  20   40:iload_2         
	//*  21   41:ifne            81
	//*  22   44:aload_0         
	//*  23   45:invokevirtual   #662 <Method View hasGapsToFix()>
	//*  24   48:ifnull          81
	//*  25   51:aload_0         
	//*  26   52:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//*  27   55:invokevirtual   #606 <Method void StaggeredGridLayoutManager$LazySpanLookup.clear()>
	//*  28   58:aload_0         
	//*  29   59:invokevirtual   #771 <Method void requestSimpleAnimationsInNextLayout()>
	//*  30   62:aload_0         
	//*  31   63:invokevirtual   #512 <Method void requestLayout()>
	//*  32   66:iconst_1        
	//*  33   67:ireturn         
		{
			j = getFirstChildPosition();
	//   34   68:aload_0         
	//   35   69:invokevirtual   #262 <Method int getFirstChildPosition()>
	//   36   72:istore_2        
			i = getLastChildPosition();
	//   37   73:aload_0         
	//   38   74:invokevirtual   #500 <Method int getLastChildPosition()>
	//   39   77:istore_1        
		}
		if(j == 0 && hasGapsToFix() != null)
		{
			mLazySpanLookup.clear();
			requestSimpleAnimationsInNextLayout();
			requestLayout();
			return true;
		}
	//*  40   78:goto            40
		if(!mLaidOutInvalidFullSpan)
	//*  41   81:aload_0         
	//*  42   82:getfield        #118 <Field boolean mLaidOutInvalidFullSpan>
	//*  43   85:ifne            90
			return false;
	//   44   88:iconst_0        
	//   45   89:ireturn         
		byte byte0;
		LazySpanLookup.FullSpanItem fullspanitem;
		if(mShouldReverseLayout)
	//*  46   90:aload_0         
	//*  47   91:getfield        #97  <Field boolean mShouldReverseLayout>
	//*  48   94:ifeq            137
			byte0 = -1;
	//   49   97:iconst_m1       
	//   50   98:istore_3        
		else
	//*  51   99:aload_0         
	//*  52  100:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//*  53  103:iload_2         
	//*  54  104:iload_1         
	//*  55  105:iconst_1        
	//*  56  106:iadd            
	//*  57  107:iload_3         
	//*  58  108:iconst_1        
	//*  59  109:invokevirtual   #775 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem StaggeredGridLayoutManager$LazySpanLookup.getFirstFullSpanItemInRange(int, int, int, boolean)>
	//*  60  112:astore          4
	//*  61  114:aload           4
	//*  62  116:ifnonnull       142
	//*  63  119:aload_0         
	//*  64  120:iconst_0        
	//*  65  121:putfield        #118 <Field boolean mLaidOutInvalidFullSpan>
	//*  66  124:aload_0         
	//*  67  125:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//*  68  128:iload_1         
	//*  69  129:iconst_1        
	//*  70  130:iadd            
	//*  71  131:invokevirtual   #778 <Method int StaggeredGridLayoutManager$LazySpanLookup.forceInvalidateAfter(int)>
	//*  72  134:pop             
	//*  73  135:iconst_0        
	//*  74  136:ireturn         
			byte0 = 1;
	//   75  137:iconst_1        
	//   76  138:istore_3        
		fullspanitem = mLazySpanLookup.getFirstFullSpanItemInRange(j, i + 1, ((int) (byte0)), true);
		if(fullspanitem == null)
		{
			mLaidOutInvalidFullSpan = false;
			mLazySpanLookup.forceInvalidateAfter(i + 1);
			return false;
		}
	//*  77  139:goto            99
		LazySpanLookup.FullSpanItem fullspanitem1 = mLazySpanLookup.getFirstFullSpanItemInRange(j, fullspanitem.mPosition, byte0 * -1, true);
	//   78  142:aload_0         
	//   79  143:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   80  146:iload_2         
	//   81  147:aload           4
	//   82  149:getfield        #395 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//   83  152:iload_3         
	//   84  153:iconst_m1       
	//   85  154:imul            
	//   86  155:iconst_1        
	//   87  156:invokevirtual   #775 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem StaggeredGridLayoutManager$LazySpanLookup.getFirstFullSpanItemInRange(int, int, int, boolean)>
	//   88  159:astore          5
		if(fullspanitem1 == null)
	//*  89  161:aload           5
	//*  90  163:ifnonnull       189
			mLazySpanLookup.forceInvalidateAfter(fullspanitem.mPosition);
	//   91  166:aload_0         
	//   92  167:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   93  170:aload           4
	//   94  172:getfield        #395 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//   95  175:invokevirtual   #778 <Method int StaggeredGridLayoutManager$LazySpanLookup.forceInvalidateAfter(int)>
	//   96  178:pop             
		else
	//*  97  179:aload_0         
	//*  98  180:invokevirtual   #771 <Method void requestSimpleAnimationsInNextLayout()>
	//*  99  183:aload_0         
	//* 100  184:invokevirtual   #512 <Method void requestLayout()>
	//* 101  187:iconst_1        
	//* 102  188:ireturn         
			mLazySpanLookup.forceInvalidateAfter(fullspanitem1.mPosition + 1);
	//  103  189:aload_0         
	//  104  190:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//  105  193:aload           5
	//  106  195:getfield        #395 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//  107  198:iconst_1        
	//  108  199:iadd            
	//  109  200:invokevirtual   #778 <Method int StaggeredGridLayoutManager$LazySpanLookup.forceInvalidateAfter(int)>
	//  110  203:pop             
		requestSimpleAnimationsInNextLayout();
		requestLayout();
		return true;
	//* 111  204:goto            179
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
	//*   2    4:ifne            19
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #259 <Method int getChildCount()>
	//*   5   11:ifeq            18
	//*   6   14:iload_1         
	//*   7   15:ifne            24
	//*   8   18:return          
			i = j;
	//    9   19:iload_2         
	//   10   20:istore_1        
		if(getChildCount() != 0 && i != 0)
	//*  11   21:goto            7
		{
			prepareLayoutStateForDelta(i, state);
	//   12   24:aload_0         
	//   13   25:iload_1         
	//   14   26:aload_3         
	//   15   27:invokevirtual   #785 <Method void prepareLayoutStateForDelta(int, RecyclerView$State)>
			if(mPrefetchDistances == null || mPrefetchDistances.length < mSpanCount)
	//*  16   30:aload_0         
	//*  17   31:getfield        #787 <Field int[] mPrefetchDistances>
	//*  18   34:ifnull          49
	//*  19   37:aload_0         
	//*  20   38:getfield        #787 <Field int[] mPrefetchDistances>
	//*  21   41:arraylength     
	//*  22   42:aload_0         
	//*  23   43:getfield        #93  <Field int mSpanCount>
	//*  24   46:icmpge          59
				mPrefetchDistances = new int[mSpanCount];
	//   25   49:aload_0         
	//   26   50:aload_0         
	//   27   51:getfield        #93  <Field int mSpanCount>
	//   28   54:newarray        int[]
	//   29   56:putfield        #787 <Field int[] mPrefetchDistances>
			i = 0;
	//   30   59:iconst_0        
	//   31   60:istore_1        
			j = 0;
	//   32   61:iconst_0        
	//   33   62:istore_2        
			while(j < mSpanCount) 
	//*  34   63:iload_2         
	//*  35   64:aload_0         
	//*  36   65:getfield        #93  <Field int mSpanCount>
	//*  37   68:icmpge          168
			{
				int k;
				int l;
				if(mLayoutState.mItemDirection == -1)
	//*  38   71:aload_0         
	//*  39   72:getfield        #138 <Field LayoutState mLayoutState>
	//*  40   75:getfield        #402 <Field int LayoutState.mItemDirection>
	//*  41   78:iconst_m1       
	//*  42   79:icmpne          139
					l = mLayoutState.mStartLine - mSpans[j].getStartLine(mLayoutState.mStartLine);
	//   43   82:aload_0         
	//   44   83:getfield        #138 <Field LayoutState mLayoutState>
	//   45   86:getfield        #428 <Field int LayoutState.mStartLine>
	//   46   89:aload_0         
	//   47   90:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   48   93:iload_2         
	//   49   94:aaload          
	//   50   95:aload_0         
	//   51   96:getfield        #138 <Field LayoutState mLayoutState>
	//   52   99:getfield        #428 <Field int LayoutState.mStartLine>
	//   53  102:invokevirtual   #326 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
	//   54  105:isub            
	//   55  106:istore          6
				else
	//*  56  108:iload_1         
	//*  57  109:istore          5
	//*  58  111:iload           6
	//*  59  113:iflt            129
	//*  60  116:aload_0         
	//*  61  117:getfield        #787 <Field int[] mPrefetchDistances>
	//*  62  120:iload_1         
	//*  63  121:iload           6
	//*  64  123:iastore         
	//*  65  124:iload_1         
	//*  66  125:iconst_1        
	//*  67  126:iadd            
	//*  68  127:istore          5
	//*  69  129:iload_2         
	//*  70  130:iconst_1        
	//*  71  131:iadd            
	//*  72  132:istore_2        
	//*  73  133:iload           5
	//*  74  135:istore_1        
	//*  75  136:goto            63
					l = mSpans[j].getEndLine(mLayoutState.mEndLine) - mLayoutState.mEndLine;
	//   76  139:aload_0         
	//   77  140:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   78  143:iload_2         
	//   79  144:aaload          
	//   80  145:aload_0         
	//   81  146:getfield        #138 <Field LayoutState mLayoutState>
	//   82  149:getfield        #422 <Field int LayoutState.mEndLine>
	//   83  152:invokevirtual   #323 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
	//   84  155:aload_0         
	//   85  156:getfield        #138 <Field LayoutState mLayoutState>
	//   86  159:getfield        #422 <Field int LayoutState.mEndLine>
	//   87  162:isub            
	//   88  163:istore          6
				k = i;
				if(l >= 0)
				{
					mPrefetchDistances[i] = l;
					k = i + 1;
				}
				j++;
				i = k;
			}
	//*  89  165:goto            108
			Arrays.sort(mPrefetchDistances, 0, i);
	//   90  168:aload_0         
	//   91  169:getfield        #787 <Field int[] mPrefetchDistances>
	//   92  172:iconst_0        
	//   93  173:iload_1         
	//   94  174:invokestatic    #793 <Method void Arrays.sort(int[], int, int)>
			j = 0;
	//   95  177:iconst_0        
	//   96  178:istore_2        
			while(j < i && mLayoutState.hasMore(state)) 
	//*  97  179:iload_2         
	//*  98  180:iload_1         
	//*  99  181:icmpge          18
	//* 100  184:aload_0         
	//* 101  185:getfield        #138 <Field LayoutState mLayoutState>
	//* 102  188:aload_3         
	//* 103  189:invokevirtual   #353 <Method boolean LayoutState.hasMore(RecyclerView$State)>
	//* 104  192:ifeq            18
			{
				layoutprefetchregistry.addPosition(mLayoutState.mCurrentPosition, mPrefetchDistances[j]);
	//  105  195:aload           4
	//  106  197:aload_0         
	//  107  198:getfield        #138 <Field LayoutState mLayoutState>
	//  108  201:getfield        #648 <Field int LayoutState.mCurrentPosition>
	//  109  204:aload_0         
	//  110  205:getfield        #787 <Field int[] mPrefetchDistances>
	//  111  208:iload_2         
	//  112  209:iaload          
	//  113  210:invokeinterface #798 <Method void RecyclerView$LayoutManager$LayoutPrefetchRegistry.addPosition(int, int)>
				LayoutState layoutstate = mLayoutState;
	//  114  215:aload_0         
	//  115  216:getfield        #138 <Field LayoutState mLayoutState>
	//  116  219:astore          7
				layoutstate.mCurrentPosition = layoutstate.mCurrentPosition + mLayoutState.mItemDirection;
	//  117  221:aload           7
	//  118  223:aload           7
	//  119  225:getfield        #648 <Field int LayoutState.mCurrentPosition>
	//  120  228:aload_0         
	//  121  229:getfield        #138 <Field LayoutState mLayoutState>
	//  122  232:getfield        #402 <Field int LayoutState.mItemDirection>
	//  123  235:iadd            
	//  124  236:putfield        #648 <Field int LayoutState.mCurrentPosition>
				j++;
	//  125  239:iload_2         
	//  126  240:iconst_1        
	//  127  241:iadd            
	//  128  242:istore_2        
			}
		}
	//* 129  243:goto            179
	}

	public int computeHorizontalScrollExtent(RecyclerView.State state)
	{
		return computeScrollExtent(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #801 <Method int computeScrollExtent(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public int computeHorizontalScrollOffset(RecyclerView.State state)
	{
		return computeScrollOffset(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #804 <Method int computeScrollOffset(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public int computeHorizontalScrollRange(RecyclerView.State state)
	{
		return computeScrollRange(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #807 <Method int computeScrollRange(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public PointF computeScrollVectorForPosition(int i)
	{
		i = calculateScrollDirectionForPosition(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #811 <Method int calculateScrollDirectionForPosition(int)>
	//    3    5:istore_1        
		PointF pointf = new PointF();
	//    4    6:new             #813 <Class PointF>
	//    5    9:dup             
	//    6   10:invokespecial   #814 <Method void PointF()>
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
	//   18   30:putfield        #817 <Field float PointF.x>
			pointf.y = 0.0F;
	//   19   33:aload_2         
	//   20   34:fconst_0        
	//   21   35:putfield        #820 <Field float PointF.y>
			return pointf;
	//   22   38:aload_2         
	//   23   39:areturn         
		} else
		{
			pointf.x = 0.0F;
	//   24   40:aload_2         
	//   25   41:fconst_0        
	//   26   42:putfield        #817 <Field float PointF.x>
			pointf.y = i;
	//   27   45:aload_2         
	//   28   46:iload_1         
	//   29   47:i2f             
	//   30   48:putfield        #820 <Field float PointF.y>
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
	//    2    2:invokespecial   #801 <Method int computeScrollExtent(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public int computeVerticalScrollOffset(RecyclerView.State state)
	{
		return computeScrollOffset(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #804 <Method int computeScrollOffset(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public int computeVerticalScrollRange(RecyclerView.State state)
	{
		return computeScrollRange(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #807 <Method int computeScrollRange(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public int[] findFirstCompletelyVisibleItemPositions(int ai[])
	{
		int i;
		int ai1[];
		if(ai == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       40
		{
			ai1 = new int[mSpanCount];
	//    2    4:aload_0         
	//    3    5:getfield        #93  <Field int mSpanCount>
	//    4    8:newarray        int[]
	//    5   10:astore_3        
		} else
	//*   6   11:iconst_0        
	//*   7   12:istore_2        
	//*   8   13:iload_2         
	//*   9   14:aload_0         
	//*  10   15:getfield        #93  <Field int mSpanCount>
	//*  11   18:icmpge          93
	//*  12   21:aload_3         
	//*  13   22:iload_2         
	//*  14   23:aload_0         
	//*  15   24:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//*  16   27:iload_2         
	//*  17   28:aaload          
	//*  18   29:invokevirtual   #828 <Method int StaggeredGridLayoutManager$Span.findFirstCompletelyVisibleItemPosition()>
	//*  19   32:iastore         
	//*  20   33:iload_2         
	//*  21   34:iconst_1        
	//*  22   35:iadd            
	//*  23   36:istore_2        
	//*  24   37:goto            13
		{
			ai1 = ai;
	//   25   40:aload_1         
	//   26   41:astore_3        
			if(ai.length < mSpanCount)
	//*  27   42:aload_1         
	//*  28   43:arraylength     
	//*  29   44:aload_0         
	//*  30   45:getfield        #93  <Field int mSpanCount>
	//*  31   48:icmpge          11
				throw new IllegalArgumentException((new StringBuilder()).append("Provided int[]'s size must be more than or equal to span count. Expected:").append(mSpanCount).append(", array size:").append(ai.length).toString());
	//   32   51:new             #830 <Class IllegalArgumentException>
	//   33   54:dup             
	//   34   55:new             #832 <Class StringBuilder>
	//   35   58:dup             
	//   36   59:invokespecial   #833 <Method void StringBuilder()>
	//   37   62:ldc2            #835 <String "Provided int[]'s size must be more than or equal to span count. Expected:">
	//   38   65:invokevirtual   #839 <Method StringBuilder StringBuilder.append(String)>
	//   39   68:aload_0         
	//   40   69:getfield        #93  <Field int mSpanCount>
	//   41   72:invokevirtual   #842 <Method StringBuilder StringBuilder.append(int)>
	//   42   75:ldc2            #844 <String ", array size:">
	//   43   78:invokevirtual   #839 <Method StringBuilder StringBuilder.append(String)>
	//   44   81:aload_1         
	//   45   82:arraylength     
	//   46   83:invokevirtual   #842 <Method StringBuilder StringBuilder.append(int)>
	//   47   86:invokevirtual   #848 <Method String StringBuilder.toString()>
	//   48   89:invokespecial   #850 <Method void IllegalArgumentException(String)>
	//   49   92:athrow          
		}
		for(i = 0; i < mSpanCount; i++)
			ai1[i] = mSpans[i].findFirstCompletelyVisibleItemPosition();

		return ai1;
	//   50   93:aload_3         
	//   51   94:areturn         
	}

	View findFirstVisibleItemClosestToEnd(boolean flag)
	{
		int j = mPrimaryOrientation.getStartAfterPadding();
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//    2    4:invokevirtual   #201 <Method int OrientationHelper.getStartAfterPadding()>
	//    3    7:istore_3        
		int k = mPrimaryOrientation.getEndAfterPadding();
	//    4    8:aload_0         
	//    5    9:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//    6   12:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//    7   15:istore          4
		View view = null;
	//    8   17:aconst_null     
	//    9   18:astore          7
		int i = getChildCount() - 1;
	//   10   20:aload_0         
	//   11   21:invokevirtual   #259 <Method int getChildCount()>
	//   12   24:iconst_1        
	//   13   25:isub            
	//   14   26:istore_2        
		while(i >= 0) 
	//*  15   27:iload_2         
	//*  16   28:iflt            122
		{
			View view2 = getChildAt(i);
	//   17   31:aload_0         
	//   18   32:iload_2         
	//   19   33:invokevirtual   #475 <Method View getChildAt(int)>
	//   20   36:astore          9
			int l = mPrimaryOrientation.getDecoratedStart(view2);
	//   21   38:aload_0         
	//   22   39:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   23   42:aload           9
	//   24   44:invokevirtual   #685 <Method int OrientationHelper.getDecoratedStart(View)>
	//   25   47:istore          5
			int i1 = mPrimaryOrientation.getDecoratedEnd(view2);
	//   26   49:aload_0         
	//   27   50:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   28   53:aload           9
	//   29   55:invokevirtual   #698 <Method int OrientationHelper.getDecoratedEnd(View)>
	//   30   58:istore          6
			View view1 = view;
	//   31   60:aload           7
	//   32   62:astore          8
			if(i1 > j)
	//*  33   64:iload           6
	//*  34   66:iload_3         
	//*  35   67:icmple          81
				if(l >= k)
	//*  36   70:iload           5
	//*  37   72:iload           4
	//*  38   74:icmplt          92
				{
					view1 = view;
	//   39   77:aload           7
	//   40   79:astore          8
				} else
	//*  41   81:iload_2         
	//*  42   82:iconst_1        
	//*  43   83:isub            
	//*  44   84:istore_2        
	//*  45   85:aload           8
	//*  46   87:astore          7
	//*  47   89:goto            27
				{
					if(i1 <= k || !flag)
	//*  48   92:iload           6
	//*  49   94:iload           4
	//*  50   96:icmple          103
	//*  51   99:iload_1         
	//*  52  100:ifne            106
						return view2;
	//   53  103:aload           9
	//   54  105:areturn         
					view1 = view;
	//   55  106:aload           7
	//   56  108:astore          8
					if(view == null)
	//*  57  110:aload           7
	//*  58  112:ifnonnull       81
						view1 = view2;
	//   59  115:aload           9
	//   60  117:astore          8
				}
			i--;
			view = view1;
		}
	//*  61  119:goto            81
		return view;
	//   62  122:aload           7
	//   63  124:areturn         
	}

	View findFirstVisibleItemClosestToStart(boolean flag)
	{
		int j = mPrimaryOrientation.getStartAfterPadding();
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//    2    4:invokevirtual   #201 <Method int OrientationHelper.getStartAfterPadding()>
	//    3    7:istore_3        
		int k = mPrimaryOrientation.getEndAfterPadding();
	//    4    8:aload_0         
	//    5    9:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//    6   12:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//    7   15:istore          4
		int l = getChildCount();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #259 <Method int getChildCount()>
	//   10   21:istore          5
		View view = null;
	//   11   23:aconst_null     
	//   12   24:astore          7
		int i = 0;
	//   13   26:iconst_0        
	//   14   27:istore_2        
		while(i < l) 
	//*  15   28:iload_2         
	//*  16   29:iload           5
	//*  17   31:icmpge          120
		{
			View view2 = getChildAt(i);
	//   18   34:aload_0         
	//   19   35:iload_2         
	//   20   36:invokevirtual   #475 <Method View getChildAt(int)>
	//   21   39:astore          9
			int i1 = mPrimaryOrientation.getDecoratedStart(view2);
	//   22   41:aload_0         
	//   23   42:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   24   45:aload           9
	//   25   47:invokevirtual   #685 <Method int OrientationHelper.getDecoratedStart(View)>
	//   26   50:istore          6
			View view1 = view;
	//   27   52:aload           7
	//   28   54:astore          8
			if(mPrimaryOrientation.getDecoratedEnd(view2) > j)
	//*  29   56:aload_0         
	//*  30   57:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//*  31   60:aload           9
	//*  32   62:invokevirtual   #698 <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  33   65:iload_3         
	//*  34   66:icmple          80
				if(i1 >= k)
	//*  35   69:iload           6
	//*  36   71:iload           4
	//*  37   73:icmplt          91
				{
					view1 = view;
	//   38   76:aload           7
	//   39   78:astore          8
				} else
	//*  40   80:iload_2         
	//*  41   81:iconst_1        
	//*  42   82:iadd            
	//*  43   83:istore_2        
	//*  44   84:aload           8
	//*  45   86:astore          7
	//*  46   88:goto            28
				{
					if(i1 >= j || !flag)
	//*  47   91:iload           6
	//*  48   93:iload_3         
	//*  49   94:icmpge          101
	//*  50   97:iload_1         
	//*  51   98:ifne            104
						return view2;
	//   52  101:aload           9
	//   53  103:areturn         
					view1 = view;
	//   54  104:aload           7
	//   55  106:astore          8
					if(view == null)
	//*  56  108:aload           7
	//*  57  110:ifnonnull       80
						view1 = view2;
	//   58  113:aload           9
	//   59  115:astore          8
				}
			i++;
			view = view1;
		}
	//*  60  117:goto            80
		return view;
	//   61  120:aload           7
	//   62  122:areturn         
	}

	int findFirstVisibleItemPositionInt()
	{
		View view;
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            19
			view = findFirstVisibleItemClosestToEnd(true);
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:invokevirtual   #298 <Method View findFirstVisibleItemClosestToEnd(boolean)>
	//    6   12:astore_1        
		else
	//*   7   13:aload_1         
	//*   8   14:ifnonnull       28
	//*   9   17:iconst_m1       
	//*  10   18:ireturn         
			view = findFirstVisibleItemClosestToStart(true);
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:invokevirtual   #295 <Method View findFirstVisibleItemClosestToStart(boolean)>
	//   14   24:astore_1        
		if(view == null)
			return -1;
		else
	//*  15   25:goto            13
			return getPosition(view);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #478 <Method int getPosition(View)>
	//   19   33:ireturn         
	}

	public int[] findFirstVisibleItemPositions(int ai[])
	{
		int i;
		int ai1[];
		if(ai == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       40
		{
			ai1 = new int[mSpanCount];
	//    2    4:aload_0         
	//    3    5:getfield        #93  <Field int mSpanCount>
	//    4    8:newarray        int[]
	//    5   10:astore_3        
		} else
	//*   6   11:iconst_0        
	//*   7   12:istore_2        
	//*   8   13:iload_2         
	//*   9   14:aload_0         
	//*  10   15:getfield        #93  <Field int mSpanCount>
	//*  11   18:icmpge          93
	//*  12   21:aload_3         
	//*  13   22:iload_2         
	//*  14   23:aload_0         
	//*  15   24:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//*  16   27:iload_2         
	//*  17   28:aaload          
	//*  18   29:invokevirtual   #855 <Method int StaggeredGridLayoutManager$Span.findFirstVisibleItemPosition()>
	//*  19   32:iastore         
	//*  20   33:iload_2         
	//*  21   34:iconst_1        
	//*  22   35:iadd            
	//*  23   36:istore_2        
	//*  24   37:goto            13
		{
			ai1 = ai;
	//   25   40:aload_1         
	//   26   41:astore_3        
			if(ai.length < mSpanCount)
	//*  27   42:aload_1         
	//*  28   43:arraylength     
	//*  29   44:aload_0         
	//*  30   45:getfield        #93  <Field int mSpanCount>
	//*  31   48:icmpge          11
				throw new IllegalArgumentException((new StringBuilder()).append("Provided int[]'s size must be more than or equal to span count. Expected:").append(mSpanCount).append(", array size:").append(ai.length).toString());
	//   32   51:new             #830 <Class IllegalArgumentException>
	//   33   54:dup             
	//   34   55:new             #832 <Class StringBuilder>
	//   35   58:dup             
	//   36   59:invokespecial   #833 <Method void StringBuilder()>
	//   37   62:ldc2            #835 <String "Provided int[]'s size must be more than or equal to span count. Expected:">
	//   38   65:invokevirtual   #839 <Method StringBuilder StringBuilder.append(String)>
	//   39   68:aload_0         
	//   40   69:getfield        #93  <Field int mSpanCount>
	//   41   72:invokevirtual   #842 <Method StringBuilder StringBuilder.append(int)>
	//   42   75:ldc2            #844 <String ", array size:">
	//   43   78:invokevirtual   #839 <Method StringBuilder StringBuilder.append(String)>
	//   44   81:aload_1         
	//   45   82:arraylength     
	//   46   83:invokevirtual   #842 <Method StringBuilder StringBuilder.append(int)>
	//   47   86:invokevirtual   #848 <Method String StringBuilder.toString()>
	//   48   89:invokespecial   #850 <Method void IllegalArgumentException(String)>
	//   49   92:athrow          
		}
		for(i = 0; i < mSpanCount; i++)
			ai1[i] = mSpans[i].findFirstVisibleItemPosition();

		return ai1;
	//   50   93:aload_3         
	//   51   94:areturn         
	}

	public int[] findLastCompletelyVisibleItemPositions(int ai[])
	{
		int i;
		int ai1[];
		if(ai == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       40
		{
			ai1 = new int[mSpanCount];
	//    2    4:aload_0         
	//    3    5:getfield        #93  <Field int mSpanCount>
	//    4    8:newarray        int[]
	//    5   10:astore_3        
		} else
	//*   6   11:iconst_0        
	//*   7   12:istore_2        
	//*   8   13:iload_2         
	//*   9   14:aload_0         
	//*  10   15:getfield        #93  <Field int mSpanCount>
	//*  11   18:icmpge          93
	//*  12   21:aload_3         
	//*  13   22:iload_2         
	//*  14   23:aload_0         
	//*  15   24:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//*  16   27:iload_2         
	//*  17   28:aaload          
	//*  18   29:invokevirtual   #859 <Method int StaggeredGridLayoutManager$Span.findLastCompletelyVisibleItemPosition()>
	//*  19   32:iastore         
	//*  20   33:iload_2         
	//*  21   34:iconst_1        
	//*  22   35:iadd            
	//*  23   36:istore_2        
	//*  24   37:goto            13
		{
			ai1 = ai;
	//   25   40:aload_1         
	//   26   41:astore_3        
			if(ai.length < mSpanCount)
	//*  27   42:aload_1         
	//*  28   43:arraylength     
	//*  29   44:aload_0         
	//*  30   45:getfield        #93  <Field int mSpanCount>
	//*  31   48:icmpge          11
				throw new IllegalArgumentException((new StringBuilder()).append("Provided int[]'s size must be more than or equal to span count. Expected:").append(mSpanCount).append(", array size:").append(ai.length).toString());
	//   32   51:new             #830 <Class IllegalArgumentException>
	//   33   54:dup             
	//   34   55:new             #832 <Class StringBuilder>
	//   35   58:dup             
	//   36   59:invokespecial   #833 <Method void StringBuilder()>
	//   37   62:ldc2            #835 <String "Provided int[]'s size must be more than or equal to span count. Expected:">
	//   38   65:invokevirtual   #839 <Method StringBuilder StringBuilder.append(String)>
	//   39   68:aload_0         
	//   40   69:getfield        #93  <Field int mSpanCount>
	//   41   72:invokevirtual   #842 <Method StringBuilder StringBuilder.append(int)>
	//   42   75:ldc2            #844 <String ", array size:">
	//   43   78:invokevirtual   #839 <Method StringBuilder StringBuilder.append(String)>
	//   44   81:aload_1         
	//   45   82:arraylength     
	//   46   83:invokevirtual   #842 <Method StringBuilder StringBuilder.append(int)>
	//   47   86:invokevirtual   #848 <Method String StringBuilder.toString()>
	//   48   89:invokespecial   #850 <Method void IllegalArgumentException(String)>
	//   49   92:athrow          
		}
		for(i = 0; i < mSpanCount; i++)
			ai1[i] = mSpans[i].findLastCompletelyVisibleItemPosition();

		return ai1;
	//   50   93:aload_3         
	//   51   94:areturn         
	}

	public int[] findLastVisibleItemPositions(int ai[])
	{
		int i;
		int ai1[];
		if(ai == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       40
		{
			ai1 = new int[mSpanCount];
	//    2    4:aload_0         
	//    3    5:getfield        #93  <Field int mSpanCount>
	//    4    8:newarray        int[]
	//    5   10:astore_3        
		} else
	//*   6   11:iconst_0        
	//*   7   12:istore_2        
	//*   8   13:iload_2         
	//*   9   14:aload_0         
	//*  10   15:getfield        #93  <Field int mSpanCount>
	//*  11   18:icmpge          93
	//*  12   21:aload_3         
	//*  13   22:iload_2         
	//*  14   23:aload_0         
	//*  15   24:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//*  16   27:iload_2         
	//*  17   28:aaload          
	//*  18   29:invokevirtual   #863 <Method int StaggeredGridLayoutManager$Span.findLastVisibleItemPosition()>
	//*  19   32:iastore         
	//*  20   33:iload_2         
	//*  21   34:iconst_1        
	//*  22   35:iadd            
	//*  23   36:istore_2        
	//*  24   37:goto            13
		{
			ai1 = ai;
	//   25   40:aload_1         
	//   26   41:astore_3        
			if(ai.length < mSpanCount)
	//*  27   42:aload_1         
	//*  28   43:arraylength     
	//*  29   44:aload_0         
	//*  30   45:getfield        #93  <Field int mSpanCount>
	//*  31   48:icmpge          11
				throw new IllegalArgumentException((new StringBuilder()).append("Provided int[]'s size must be more than or equal to span count. Expected:").append(mSpanCount).append(", array size:").append(ai.length).toString());
	//   32   51:new             #830 <Class IllegalArgumentException>
	//   33   54:dup             
	//   34   55:new             #832 <Class StringBuilder>
	//   35   58:dup             
	//   36   59:invokespecial   #833 <Method void StringBuilder()>
	//   37   62:ldc2            #835 <String "Provided int[]'s size must be more than or equal to span count. Expected:">
	//   38   65:invokevirtual   #839 <Method StringBuilder StringBuilder.append(String)>
	//   39   68:aload_0         
	//   40   69:getfield        #93  <Field int mSpanCount>
	//   41   72:invokevirtual   #842 <Method StringBuilder StringBuilder.append(int)>
	//   42   75:ldc2            #844 <String ", array size:">
	//   43   78:invokevirtual   #839 <Method StringBuilder StringBuilder.append(String)>
	//   44   81:aload_1         
	//   45   82:arraylength     
	//   46   83:invokevirtual   #842 <Method StringBuilder StringBuilder.append(int)>
	//   47   86:invokevirtual   #848 <Method String StringBuilder.toString()>
	//   48   89:invokespecial   #850 <Method void IllegalArgumentException(String)>
	//   49   92:athrow          
		}
		for(i = 0; i < mSpanCount; i++)
			ai1[i] = mSpans[i].findLastVisibleItemPosition();

		return ai1;
	//   50   93:aload_3         
	//   51   94:areturn         
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
	//    7   14:invokespecial   #867 <Method void StaggeredGridLayoutManager$LayoutParams(int, int)>
	//    8   17:areturn         
		else
			return ((RecyclerView.LayoutParams) (new LayoutParams(-1, -2)));
	//    9   18:new             #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//   10   21:dup             
	//   11   22:iconst_m1       
	//   12   23:bipush          -2
	//   13   25:invokespecial   #867 <Method void StaggeredGridLayoutManager$LayoutParams(int, int)>
	//   14   28:areturn         
	}

	public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeset)
	{
		return ((RecyclerView.LayoutParams) (new LayoutParams(context, attributeset)));
	//    0    0:new             #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #872 <Method void StaggeredGridLayoutManager$LayoutParams(Context, AttributeSet)>
	//    5    9:areturn         
	}

	public RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #875 <Class android.view.ViewGroup$MarginLayoutParams>
	//*   2    4:ifeq            19
			return ((RecyclerView.LayoutParams) (new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams)));
	//    3    7:new             #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #875 <Class android.view.ViewGroup$MarginLayoutParams>
	//    7   15:invokespecial   #878 <Method void StaggeredGridLayoutManager$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//    8   18:areturn         
		else
			return ((RecyclerView.LayoutParams) (new LayoutParams(layoutparams)));
	//    9   19:new             #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//   10   22:dup             
	//   11   23:aload_1         
	//   12   24:invokespecial   #881 <Method void StaggeredGridLayoutManager$LayoutParams(android.view.ViewGroup$LayoutParams)>
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
	//   10   16:invokespecial   #885 <Method int RecyclerView$LayoutManager.getColumnCountForAccessibility(RecyclerView$Recycler, RecyclerView$State)>
	//   11   19:ireturn         
	}

	int getFirstChildPosition()
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #259 <Method int getChildCount()>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return getPosition(getChildAt(0));
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #475 <Method View getChildAt(int)>
	//    9   15:invokevirtual   #478 <Method int getPosition(View)>
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
	//    1    1:invokevirtual   #259 <Method int getChildCount()>
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
	//   12   16:invokevirtual   #475 <Method View getChildAt(int)>
	//   13   19:invokevirtual   #478 <Method int getPosition(View)>
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
	//    9   15:invokespecial   #891 <Method int RecyclerView$LayoutManager.getRowCountForAccessibility(RecyclerView$Recycler, RecyclerView$State)>
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
		byte byte0;
		int j;
		byte byte1;
		int k;
		BitSet bitset;
		View view;
		LayoutParams layoutparams;
		int i = getChildCount() - 1;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #259 <Method int getChildCount()>
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:istore_1        
		bitset = new BitSet(mSpanCount);
	//    5    7:new             #338 <Class BitSet>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:getfield        #93  <Field int mSpanCount>
	//    9   15:invokespecial   #894 <Method void BitSet(int)>
	//   10   18:astore          8
		bitset.set(0, mSpanCount, true);
	//   11   20:aload           8
	//   12   22:iconst_0        
	//   13   23:aload_0         
	//   14   24:getfield        #93  <Field int mSpanCount>
	//   15   27:iconst_1        
	//   16   28:invokevirtual   #342 <Method void BitSet.set(int, int, boolean)>
		if(mOrientation == 1 && isLayoutRTL())
	//*  17   31:aload_0         
	//*  18   32:getfield        #125 <Field int mOrientation>
	//*  19   35:iconst_1        
	//*  20   36:icmpne          125
	//*  21   39:aload_0         
	//*  22   40:invokevirtual   #315 <Method boolean isLayoutRTL()>
	//*  23   43:ifeq            125
			byte0 = 1;
	//   24   46:iconst_1        
	//   25   47:istore_2        
		else
	//*  26   48:aload_0         
	//*  27   49:getfield        #97  <Field boolean mShouldReverseLayout>
	//*  28   52:ifeq            130
	//*  29   55:iconst_0        
	//*  30   56:iconst_1        
	//*  31   57:isub            
	//*  32   58:istore_3        
	//*  33   59:iload_1         
	//*  34   60:iload_3         
	//*  35   61:icmpge          143
	//*  36   64:iconst_1        
	//*  37   65:istore          4
	//*  38   67:iload_1         
	//*  39   68:istore          5
	//*  40   70:iload           5
	//*  41   72:iload_3         
	//*  42   73:icmpeq          351
	//*  43   76:aload_0         
	//*  44   77:iload           5
	//*  45   79:invokevirtual   #475 <Method View getChildAt(int)>
	//*  46   82:astore          9
	//*  47   84:aload           9
	//*  48   86:invokevirtual   #363 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  49   89:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//*  50   92:astore          10
	//*  51   94:aload           8
	//*  52   96:aload           10
	//*  53   98:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//*  54  101:getfield        #455 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//*  55  104:invokevirtual   #896 <Method boolean BitSet.get(int)>
	//*  56  107:ifeq            162
	//*  57  110:aload_0         
	//*  58  111:aload           10
	//*  59  113:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//*  60  116:invokespecial   #898 <Method boolean checkSpanForGap(StaggeredGridLayoutManager$Span)>
	//*  61  119:ifeq            149
	//*  62  122:aload           9
	//*  63  124:areturn         
			byte0 = -1;
	//   64  125:iconst_m1       
	//   65  126:istore_2        
		if(mShouldReverseLayout)
		{
			j = 0 - 1;
		} else
	//*  66  127:goto            48
		{
			byte1 = 0;
	//   67  130:iconst_0        
	//   68  131:istore          4
			j = i + 1;
	//   69  133:iload_1         
	//   70  134:iconst_1        
	//   71  135:iadd            
	//   72  136:istore_3        
			i = ((int) (byte1));
	//   73  137:iload           4
	//   74  139:istore_1        
		}
		if(i < j)
			byte1 = 1;
		else
	//*  75  140:goto            59
			byte1 = -1;
	//   76  143:iconst_m1       
	//   77  144:istore          4
		k = i;
_L13:
		if(k == j)
			break MISSING_BLOCK_LABEL_351;
		view = getChildAt(k);
		layoutparams = (LayoutParams)view.getLayoutParams();
		if(!bitset.get(layoutparams.mSpan.mIndex)) goto _L2; else goto _L1
_L1:
		if(!checkSpanForGap(layoutparams.mSpan)) goto _L4; else goto _L3
_L3:
		return view;
	//*  78  146:goto            67
_L4:
		bitset.clear(layoutparams.mSpan.mIndex);
	//   79  149:aload           8
	//   80  151:aload           10
	//   81  153:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//   82  156:getfield        #455 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//   83  159:invokevirtual   #900 <Method void BitSet.clear(int)>
		  goto _L2
	//*  84  162:aload           10
	//*  85  164:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*  86  167:ifeq            180
_L6:
		k += ((int) (byte1));
	//   87  170:iload           5
	//   88  172:iload           4
	//   89  174:iadd            
	//   90  175:istore          5
		continue; /* Loop/switch isn't completed */
	//   91  177:goto            70
_L2:
		if(layoutparams.mFullSpan || k + byte1 == j) goto _L6; else goto _L5
	//   92  180:iload           5
	//   93  182:iload           4
	//   94  184:iadd            
	//   95  185:iload_3         
	//   96  186:icmpeq          170
_L5:
		boolean flag;
		Object obj;
		obj = ((Object) (getChildAt(k + byte1)));
	//   97  189:aload_0         
	//   98  190:iload           5
	//   99  192:iload           4
	//  100  194:iadd            
	//  101  195:invokevirtual   #475 <Method View getChildAt(int)>
	//  102  198:astore          11
		flag = false;
	//  103  200:iconst_0        
	//  104  201:istore_1        
		if(!mShouldReverseLayout) goto _L8; else goto _L7
	//  105  202:aload_0         
	//  106  203:getfield        #97  <Field boolean mShouldReverseLayout>
	//  107  206:ifeq            299
_L7:
		int l;
		int j1;
		l = mPrimaryOrientation.getDecoratedEnd(view);
	//  108  209:aload_0         
	//  109  210:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  110  213:aload           9
	//  111  215:invokevirtual   #698 <Method int OrientationHelper.getDecoratedEnd(View)>
	//  112  218:istore          6
		j1 = mPrimaryOrientation.getDecoratedEnd(((View) (obj)));
	//  113  220:aload_0         
	//  114  221:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  115  224:aload           11
	//  116  226:invokevirtual   #698 <Method int OrientationHelper.getDecoratedEnd(View)>
	//  117  229:istore          7
		if(l < j1) goto _L3; else goto _L9
	//  118  231:iload           6
	//  119  233:iload           7
	//  120  235:icmplt          122
_L9:
		if(l == j1)
	//* 121  238:iload           6
	//* 122  240:iload           7
	//* 123  242:icmpne          247
			flag = true;
	//  124  245:iconst_1        
	//  125  246:istore_1        
_L11:
		if(flag)
	//* 126  247:iload_1         
	//* 127  248:ifeq            170
		{
			obj = ((Object) ((LayoutParams)((View) (obj)).getLayoutParams()));
	//  128  251:aload           11
	//  129  253:invokevirtual   #363 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  130  256:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//  131  259:astore          11
			int i1;
			int k1;
			if(layoutparams.mSpan.mIndex - ((LayoutParams) (obj)).mSpan.mIndex < 0)
	//* 132  261:aload           10
	//* 133  263:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//* 134  266:getfield        #455 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//* 135  269:aload           11
	//* 136  271:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//* 137  274:getfield        #455 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//* 138  277:isub            
	//* 139  278:ifge            340
				flag = true;
	//  140  281:iconst_1        
	//  141  282:istore_1        
			else
	//* 142  283:iload_2         
	//* 143  284:ifge            345
	//* 144  287:iconst_1        
	//* 145  288:istore          6
	//* 146  290:iload_1         
	//* 147  291:iload           6
	//* 148  293:icmpeq          170
	//* 149  296:aload           9
	//* 150  298:areturn         
	//* 151  299:aload_0         
	//* 152  300:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//* 153  303:aload           9
	//* 154  305:invokevirtual   #685 <Method int OrientationHelper.getDecoratedStart(View)>
	//* 155  308:istore          6
	//* 156  310:aload_0         
	//* 157  311:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//* 158  314:aload           11
	//* 159  316:invokevirtual   #685 <Method int OrientationHelper.getDecoratedStart(View)>
	//* 160  319:istore          7
	//* 161  321:iload           6
	//* 162  323:iload           7
	//* 163  325:icmpgt          122
	//* 164  328:iload           6
	//* 165  330:iload           7
	//* 166  332:icmpne          247
	//* 167  335:iconst_1        
	//* 168  336:istore_1        
	//* 169  337:goto            247
				flag = false;
	//  170  340:iconst_0        
	//  171  341:istore_1        
			if(byte0 < 0)
				i1 = 1;
			else
	//* 172  342:goto            283
				i1 = 0;
	//  173  345:iconst_0        
	//  174  346:istore          6
			if(flag != i1)
				return view;
		}
		  goto _L6
_L8:
		i1 = mPrimaryOrientation.getDecoratedStart(view);
		k1 = mPrimaryOrientation.getDecoratedStart(((View) (obj)));
		if(i1 > k1) goto _L3; else goto _L10
_L10:
		if(i1 == k1)
			flag = true;
		  goto _L11
	//* 175  348:goto            290
		return null;
	//  176  351:aconst_null     
	//  177  352:areturn         
		if(true) goto _L13; else goto _L12
_L12:
	}

	public void invalidateSpanAssignments()
	{
		mLazySpanLookup.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//    2    4:invokevirtual   #606 <Method void StaggeredGridLayoutManager$LazySpanLookup.clear()>
		requestLayout();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #512 <Method void requestLayout()>
	//    5   11:return          
	}

	boolean isLayoutRTL()
	{
		return getLayoutDirection() == 1;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #904 <Method int getLayoutDirection()>
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
	//    2    2:invokespecial   #907 <Method void RecyclerView$LayoutManager.offsetChildrenHorizontal(int)>
		for(int j = 0; j < mSpanCount; j++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:aload_0         
	//*   7    9:getfield        #93  <Field int mSpanCount>
	//*   8   12:icmpge          32
			mSpans[j].onOffset(i);
	//    9   15:aload_0         
	//   10   16:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   11   19:iload_2         
	//   12   20:aaload          
	//   13   21:iload_1         
	//   14   22:invokevirtual   #910 <Method void StaggeredGridLayoutManager$Span.onOffset(int)>

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
	//    2    2:invokespecial   #913 <Method void RecyclerView$LayoutManager.offsetChildrenVertical(int)>
		for(int j = 0; j < mSpanCount; j++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:aload_0         
	//*   7    9:getfield        #93  <Field int mSpanCount>
	//*   8   12:icmpge          32
			mSpans[j].onOffset(i);
	//    9   15:aload_0         
	//   10   16:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   11   19:iload_2         
	//   12   20:aaload          
	//   13   21:iload_1         
	//   14   22:invokevirtual   #910 <Method void StaggeredGridLayoutManager$Span.onOffset(int)>

	//   15   25:iload_2         
	//   16   26:iconst_1        
	//   17   27:iadd            
	//   18   28:istore_2        
	//*  19   29:goto            7
	//   20   32:return          
	}

	public void onDetachedFromWindow(RecyclerView recyclerview, RecyclerView.Recycler recycler)
	{
		removeCallbacks(mCheckForGapsRunnable);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #123 <Field Runnable mCheckForGapsRunnable>
	//    3    5:invokevirtual   #666 <Method boolean removeCallbacks(Runnable)>
	//    4    8:pop             
		for(int i = 0; i < mSpanCount; i++)
	//*   5    9:iconst_0        
	//*   6   10:istore_3        
	//*   7   11:iload_3         
	//*   8   12:aload_0         
	//*   9   13:getfield        #93  <Field int mSpanCount>
	//*  10   16:icmpge          35
			mSpans[i].clear();
	//   11   19:aload_0         
	//   12   20:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   13   23:iload_3         
	//   14   24:aaload          
	//   15   25:invokevirtual   #181 <Method void StaggeredGridLayoutManager$Span.clear()>

	//   16   28:iload_3         
	//   17   29:iconst_1        
	//   18   30:iadd            
	//   19   31:istore_3        
	//*  20   32:goto            11
		recyclerview.requestLayout();
	//   21   35:aload_1         
	//   22   36:invokevirtual   #918 <Method void RecyclerView.requestLayout()>
	//   23   39:return          
	}

	public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(getChildCount() != 0) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:invokevirtual   #259 <Method int getChildCount()>
	//    2    4:ifne            11
_L1:
		view = null;
	//    3    7:aconst_null     
	//    4    8:astore_1        
_L4:
		return view;
	//    5    9:aload_1         
	//    6   10:areturn         
_L2:
		int i1;
		boolean flag;
		View view1;
		Span span;
		view1 = findContainingItemView(view);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #925 <Method View findContainingItemView(View)>
	//   10   16:astore          8
		if(view1 == null)
	//*  11   18:aload           8
	//*  12   20:ifnonnull       25
			return null;
	//   13   23:aconst_null     
	//   14   24:areturn         
		resolveShouldLayoutReverse();
	//   15   25:aload_0         
	//   16   26:invokespecial   #217 <Method void resolveShouldLayoutReverse()>
		i1 = convertFocusDirectionToLayoutDirection(i);
	//   17   29:aload_0         
	//   18   30:iload_2         
	//   19   31:invokespecial   #927 <Method int convertFocusDirectionToLayoutDirection(int)>
	//   20   34:istore          6
		if(i1 == 0x80000000)
	//*  21   36:iload           6
	//*  22   38:ldc1            #43  <Int 0x80000000>
	//*  23   40:icmpne          45
			return null;
	//   24   43:aconst_null     
	//   25   44:areturn         
		view = ((View) ((LayoutParams)view1.getLayoutParams()));
	//   26   45:aload           8
	//   27   47:invokevirtual   #363 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   28   50:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//   29   53:astore_1        
		flag = ((LayoutParams) (view)).mFullSpan;
	//   30   54:aload_1         
	//   31   55:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//   32   58:istore          7
		span = ((LayoutParams) (view)).mSpan;
	//   33   60:aload_1         
	//   34   61:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//   35   64:astore          9
		int j;
		if(i1 == 1)
	//*  36   66:iload           6
	//*  37   68:iconst_1        
	//*  38   69:icmpne          244
			i = getLastChildPosition();
	//   39   72:aload_0         
	//   40   73:invokevirtual   #500 <Method int getLastChildPosition()>
	//   41   76:istore_2        
		else
	//*  42   77:aload_0         
	//*  43   78:iload_2         
	//*  44   79:aload           4
	//*  45   81:invokespecial   #640 <Method void updateLayoutState(int, RecyclerView$State)>
	//*  46   84:aload_0         
	//*  47   85:iload           6
	//*  48   87:invokespecial   #643 <Method void setLayoutStateDirection(int)>
	//*  49   90:aload_0         
	//*  50   91:getfield        #138 <Field LayoutState mLayoutState>
	//*  51   94:aload_0         
	//*  52   95:getfield        #138 <Field LayoutState mLayoutState>
	//*  53   98:getfield        #402 <Field int LayoutState.mItemDirection>
	//*  54  101:iload_2         
	//*  55  102:iadd            
	//*  56  103:putfield        #648 <Field int LayoutState.mCurrentPosition>
	//*  57  106:aload_0         
	//*  58  107:getfield        #138 <Field LayoutState mLayoutState>
	//*  59  110:ldc1            #46  <Float 0.3333333F>
	//*  60  112:aload_0         
	//*  61  113:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//*  62  116:invokevirtual   #632 <Method int OrientationHelper.getTotalSpace()>
	//*  63  119:i2f             
	//*  64  120:fmul            
	//*  65  121:f2i             
	//*  66  122:putfield        #425 <Field int LayoutState.mAvailable>
	//*  67  125:aload_0         
	//*  68  126:getfield        #138 <Field LayoutState mLayoutState>
	//*  69  129:iconst_1        
	//*  70  130:putfield        #415 <Field boolean LayoutState.mStopInFocusable>
	//*  71  133:aload_0         
	//*  72  134:getfield        #138 <Field LayoutState mLayoutState>
	//*  73  137:iconst_0        
	//*  74  138:putfield        #629 <Field boolean LayoutState.mRecycle>
	//*  75  141:aload_0         
	//*  76  142:aload_3         
	//*  77  143:aload_0         
	//*  78  144:getfield        #138 <Field LayoutState mLayoutState>
	//*  79  147:aload           4
	//*  80  149:invokespecial   #645 <Method int fill(RecyclerView$Recycler, LayoutState, RecyclerView$State)>
	//*  81  152:pop             
	//*  82  153:aload_0         
	//*  83  154:aload_0         
	//*  84  155:getfield        #97  <Field boolean mShouldReverseLayout>
	//*  85  158:putfield        #605 <Field boolean mLastLayoutFromEnd>
	//*  86  161:iload           7
	//*  87  163:ifne            187
	//*  88  166:aload           9
	//*  89  168:iload_2         
	//*  90  169:iload           6
	//*  91  171:invokevirtual   #931 <Method View StaggeredGridLayoutManager$Span.getFocusableViewAfter(int, int)>
	//*  92  174:astore_3        
	//*  93  175:aload_3         
	//*  94  176:ifnull          187
	//*  95  179:aload_3         
	//*  96  180:astore_1        
	//*  97  181:aload_3         
	//*  98  182:aload           8
	//*  99  184:if_acmpne       9
	//* 100  187:aload_0         
	//* 101  188:iload           6
	//* 102  190:invokespecial   #495 <Method boolean preferLastSpan(int)>
	//* 103  193:ifeq            252
	//* 104  196:aload_0         
	//* 105  197:getfield        #93  <Field int mSpanCount>
	//* 106  200:iconst_1        
	//* 107  201:isub            
	//* 108  202:istore          5
	//* 109  204:iload           5
	//* 110  206:iflt            299
	//* 111  209:aload_0         
	//* 112  210:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//* 113  213:iload           5
	//* 114  215:aaload          
	//* 115  216:iload_2         
	//* 116  217:iload           6
	//* 117  219:invokevirtual   #931 <Method View StaggeredGridLayoutManager$Span.getFocusableViewAfter(int, int)>
	//* 118  222:astore_3        
	//* 119  223:aload_3         
	//* 120  224:ifnull          235
	//* 121  227:aload_3         
	//* 122  228:astore_1        
	//* 123  229:aload_3         
	//* 124  230:aload           8
	//* 125  232:if_acmpne       9
	//* 126  235:iload           5
	//* 127  237:iconst_1        
	//* 128  238:isub            
	//* 129  239:istore          5
	//* 130  241:goto            204
			i = getFirstChildPosition();
	//  131  244:aload_0         
	//  132  245:invokevirtual   #262 <Method int getFirstChildPosition()>
	//  133  248:istore_2        
		updateLayoutState(i, state);
		setLayoutStateDirection(i1);
		mLayoutState.mCurrentPosition = mLayoutState.mItemDirection + i;
		mLayoutState.mAvailable = (int)(0.3333333F * (float)mPrimaryOrientation.getTotalSpace());
		mLayoutState.mStopInFocusable = true;
		mLayoutState.mRecycle = false;
		fill(recycler, mLayoutState, state);
		mLastLayoutFromEnd = mShouldReverseLayout;
		if(flag)
			break; /* Loop/switch isn't completed */
		recycler = ((RecyclerView.Recycler) (span.getFocusableViewAfter(i, i1)));
		if(recycler == null)
			break; /* Loop/switch isn't completed */
		view = ((View) (recycler));
		if(recycler != view1) goto _L4; else goto _L3
_L3:
		if(!preferLastSpan(i1))
			break MISSING_BLOCK_LABEL_252;
		j = mSpanCount - 1;
_L6:
		if(j < 0)
			break MISSING_BLOCK_LABEL_299;
		recycler = ((RecyclerView.Recycler) (mSpans[j].getFocusableViewAfter(i, i1)));
		if(recycler == null)
			break; /* Loop/switch isn't completed */
		view = ((View) (recycler));
		if(recycler != view1) goto _L4; else goto _L5
_L5:
		j--;
		  goto _L6
	//* 134  249:goto            77
		int k = 0;
	//  135  252:iconst_0        
	//  136  253:istore          5
_L10:
		if(k >= mSpanCount) goto _L8; else goto _L7
	//  137  255:iload           5
	//  138  257:aload_0         
	//  139  258:getfield        #93  <Field int mSpanCount>
	//  140  261:icmpge          299
_L7:
		recycler = ((RecyclerView.Recycler) (mSpans[k].getFocusableViewAfter(i, i1)));
	//  141  264:aload_0         
	//  142  265:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  143  268:iload           5
	//  144  270:aaload          
	//  145  271:iload_2         
	//  146  272:iload           6
	//  147  274:invokevirtual   #931 <Method View StaggeredGridLayoutManager$Span.getFocusableViewAfter(int, int)>
	//  148  277:astore_3        
		if(recycler == null)
			continue; /* Loop/switch isn't completed */
	//  149  278:aload_3         
	//  150  279:ifnull          290
		view = ((View) (recycler));
	//  151  282:aload_3         
	//  152  283:astore_1        
		if(recycler != view1) goto _L4; else goto _L9
	//  153  284:aload_3         
	//  154  285:aload           8
	//  155  287:if_acmpne       9
_L9:
		k++;
	//  156  290:iload           5
	//  157  292:iconst_1        
	//  158  293:iadd            
	//  159  294:istore          5
		  goto _L10
	//* 160  296:goto            255
_L8:
		if(!mReverseLayout)
	//* 161  299:aload_0         
	//* 162  300:getfield        #95  <Field boolean mReverseLayout>
	//* 163  303:ifne            360
			i = 1;
	//  164  306:iconst_1        
	//  165  307:istore_2        
		else
	//* 166  308:iload           6
	//* 167  310:iconst_m1       
	//* 168  311:icmpne          365
	//* 169  314:iconst_1        
	//* 170  315:istore          5
	//* 171  317:iload_2         
	//* 172  318:iload           5
	//* 173  320:icmpne          371
	//* 174  323:iconst_1        
	//* 175  324:istore_2        
	//* 176  325:iload           7
	//* 177  327:ifne            386
	//* 178  330:iload_2         
	//* 179  331:ifeq            376
	//* 180  334:aload           9
	//* 181  336:invokevirtual   #934 <Method int StaggeredGridLayoutManager$Span.findFirstPartiallyVisibleItemPosition()>
	//* 182  339:istore          5
	//* 183  341:aload_0         
	//* 184  342:iload           5
	//* 185  344:invokevirtual   #937 <Method View findViewByPosition(int)>
	//* 186  347:astore_1        
	//* 187  348:aload_1         
	//* 188  349:ifnull          386
	//* 189  352:aload_1         
	//* 190  353:aload           8
	//* 191  355:if_acmpeq       386
	//* 192  358:aload_1         
	//* 193  359:areturn         
			i = 0;
	//  194  360:iconst_0        
	//  195  361:istore_2        
		if(i1 == -1)
			k = 1;
		else
	//* 196  362:goto            308
			k = 0;
	//  197  365:iconst_0        
	//  198  366:istore          5
		if(i == k)
			i = 1;
		else
	//* 199  368:goto            317
			i = 0;
	//  200  371:iconst_0        
	//  201  372:istore_2        
		if(!flag)
		{
			if(i != 0)
				k = span.findFirstPartiallyVisibleItemPosition();
			else
	//* 202  373:goto            325
				k = span.findLastPartiallyVisibleItemPosition();
	//  203  376:aload           9
	//  204  378:invokevirtual   #940 <Method int StaggeredGridLayoutManager$Span.findLastPartiallyVisibleItemPosition()>
	//  205  381:istore          5
			view = findViewByPosition(k);
			if(view != null && view != view1)
				return view;
		}
	//* 206  383:goto            341
		if(!preferLastSpan(i1))
			break MISSING_BLOCK_LABEL_477;
	//  207  386:aload_0         
	//  208  387:iload           6
	//  209  389:invokespecial   #495 <Method boolean preferLastSpan(int)>
	//  210  392:ifeq            477
		k = mSpanCount - 1;
	//  211  395:aload_0         
	//  212  396:getfield        #93  <Field int mSpanCount>
	//  213  399:iconst_1        
	//  214  400:isub            
	//  215  401:istore          5
_L12:
		if(k < 0)
			break MISSING_BLOCK_LABEL_548;
	//  216  403:iload           5
	//  217  405:iflt            548
		if(k != span.mIndex)
			break; /* Loop/switch isn't completed */
	//  218  408:iload           5
	//  219  410:aload           9
	//  220  412:getfield        #455 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//  221  415:icmpne          427
_L14:
		k--;
	//  222  418:iload           5
	//  223  420:iconst_1        
	//  224  421:isub            
	//  225  422:istore          5
		if(true) goto _L12; else goto _L11
	//  226  424:goto            403
_L11:
		int j1;
		if(i != 0)
	//* 227  427:iload_2         
	//* 228  428:ifeq            462
			j1 = mSpans[k].findFirstPartiallyVisibleItemPosition();
	//  229  431:aload_0         
	//  230  432:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  231  435:iload           5
	//  232  437:aaload          
	//  233  438:invokevirtual   #934 <Method int StaggeredGridLayoutManager$Span.findFirstPartiallyVisibleItemPosition()>
	//  234  441:istore          6
		else
	//* 235  443:aload_0         
	//* 236  444:iload           6
	//* 237  446:invokevirtual   #937 <Method View findViewByPosition(int)>
	//* 238  449:astore_1        
	//* 239  450:aload_1         
	//* 240  451:ifnull          418
	//* 241  454:aload_1         
	//* 242  455:aload           8
	//* 243  457:if_acmpeq       418
	//* 244  460:aload_1         
	//* 245  461:areturn         
			j1 = mSpans[k].findLastPartiallyVisibleItemPosition();
	//  246  462:aload_0         
	//  247  463:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  248  466:iload           5
	//  249  468:aaload          
	//  250  469:invokevirtual   #940 <Method int StaggeredGridLayoutManager$Span.findLastPartiallyVisibleItemPosition()>
	//  251  472:istore          6
		view = findViewByPosition(j1);
		if(view == null || view == view1) goto _L14; else goto _L13
_L13:
		return view;
	//* 252  474:goto            443
		int k1;
		for(int l = 0; l < mSpanCount; l++)
	//* 253  477:iconst_0        
	//* 254  478:istore          5
	//* 255  480:iload           5
	//* 256  482:aload_0         
	//* 257  483:getfield        #93  <Field int mSpanCount>
	//* 258  486:icmpge          548
		{
			if(i != 0)
	//* 259  489:iload_2         
	//* 260  490:ifeq            524
				k1 = mSpans[l].findFirstPartiallyVisibleItemPosition();
	//  261  493:aload_0         
	//  262  494:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  263  497:iload           5
	//  264  499:aaload          
	//  265  500:invokevirtual   #934 <Method int StaggeredGridLayoutManager$Span.findFirstPartiallyVisibleItemPosition()>
	//  266  503:istore          6
			else
	//* 267  505:aload_0         
	//* 268  506:iload           6
	//* 269  508:invokevirtual   #937 <Method View findViewByPosition(int)>
	//* 270  511:astore_1        
	//* 271  512:aload_1         
	//* 272  513:ifnull          539
	//* 273  516:aload_1         
	//* 274  517:aload           8
	//* 275  519:if_acmpeq       539
	//* 276  522:aload_1         
	//* 277  523:areturn         
				k1 = mSpans[l].findLastPartiallyVisibleItemPosition();
	//  278  524:aload_0         
	//  279  525:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  280  528:iload           5
	//  281  530:aaload          
	//  282  531:invokevirtual   #940 <Method int StaggeredGridLayoutManager$Span.findLastPartiallyVisibleItemPosition()>
	//  283  534:istore          6
			view = findViewByPosition(k1);
			if(view != null && view != view1)
				return view;
		}

	//  284  536:goto            505
	//  285  539:iload           5
	//  286  541:iconst_1        
	//  287  542:iadd            
	//  288  543:istore          5
	//* 289  545:goto            480
		return null;
	//  290  548:aconst_null     
	//  291  549:areturn         
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		View view;
		View view1;
label0:
		{
			super.onInitializeAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #945 <Method void RecyclerView$LayoutManager.onInitializeAccessibilityEvent(AccessibilityEvent)>
			if(getChildCount() > 0)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #259 <Method int getChildCount()>
	//*   5    9:ifle            36
			{
				view = findFirstVisibleItemClosestToStart(false);
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #295 <Method View findFirstVisibleItemClosestToStart(boolean)>
	//    9   17:astore          4
				view1 = findFirstVisibleItemClosestToEnd(false);
	//   10   19:aload_0         
	//   11   20:iconst_0        
	//   12   21:invokevirtual   #298 <Method View findFirstVisibleItemClosestToEnd(boolean)>
	//   13   24:astore          5
				if(view != null && view1 != null)
					break label0;
	//   14   26:aload           4
	//   15   28:ifnull          36
	//   16   31:aload           5
	//   17   33:ifnonnull       37
			}
			return;
	//   18   36:return          
		}
		int i = getPosition(view);
	//   19   37:aload_0         
	//   20   38:aload           4
	//   21   40:invokevirtual   #478 <Method int getPosition(View)>
	//   22   43:istore_2        
		int j = getPosition(view1);
	//   23   44:aload_0         
	//   24   45:aload           5
	//   25   47:invokevirtual   #478 <Method int getPosition(View)>
	//   26   50:istore_3        
		if(i < j)
	//*  27   51:iload_2         
	//*  28   52:iload_3         
	//*  29   53:icmpge          67
		{
			accessibilityevent.setFromIndex(i);
	//   30   56:aload_1         
	//   31   57:iload_2         
	//   32   58:invokevirtual   #950 <Method void AccessibilityEvent.setFromIndex(int)>
			accessibilityevent.setToIndex(j);
	//   33   61:aload_1         
	//   34   62:iload_3         
	//   35   63:invokevirtual   #953 <Method void AccessibilityEvent.setToIndex(int)>
			return;
	//   36   66:return          
		} else
		{
			accessibilityevent.setFromIndex(j);
	//   37   67:aload_1         
	//   38   68:iload_3         
	//   39   69:invokevirtual   #950 <Method void AccessibilityEvent.setFromIndex(int)>
			accessibilityevent.setToIndex(i);
	//   40   72:aload_1         
	//   41   73:iload_2         
	//   42   74:invokevirtual   #953 <Method void AccessibilityEvent.setToIndex(int)>
			return;
	//   43   77:return          
		}
	}

	public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		recycler = ((RecyclerView.Recycler) (view.getLayoutParams()));
	//    0    0:aload_3         
	//    1    1:invokevirtual   #363 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
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
	//    9   16:invokespecial   #958 <Method void RecyclerView$LayoutManager.onInitializeAccessibilityNodeInfoForItem(View, AccessibilityNodeInfoCompat)>
			return;
	//   10   19:return          
		}
		recycler = ((RecyclerView.Recycler) ((LayoutParams)recycler));
	//   11   20:aload_1         
	//   12   21:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//   13   24:astore_1        
		if(mOrientation == 0)
	//*  14   25:aload_0         
	//*  15   26:getfield        #125 <Field int mOrientation>
	//*  16   29:ifne            77
		{
			int k = ((LayoutParams) (recycler)).getSpanIndex();
	//   17   32:aload_1         
	//   18   33:invokevirtual   #961 <Method int StaggeredGridLayoutManager$LayoutParams.getSpanIndex()>
	//   19   36:istore          6
			int i;
			if(((LayoutParams) (recycler)).mFullSpan)
	//*  20   38:aload_1         
	//*  21   39:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*  22   42:ifeq            71
				i = mSpanCount;
	//   23   45:aload_0         
	//   24   46:getfield        #93  <Field int mSpanCount>
	//   25   49:istore          5
			else
	//*  26   51:aload           4
	//*  27   53:iload           6
	//*  28   55:iload           5
	//*  29   57:iconst_m1       
	//*  30   58:iconst_m1       
	//*  31   59:aload_1         
	//*  32   60:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*  33   63:iconst_0        
	//*  34   64:invokestatic    #967 <Method android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat.obtain(int, int, int, int, boolean, boolean)>
	//*  35   67:invokevirtual   #973 <Method void AccessibilityNodeInfoCompat.setCollectionItemInfo(Object)>
	//*  36   70:return          
				i = 1;
	//   37   71:iconst_1        
	//   38   72:istore          5
			accessibilitynodeinfocompat.setCollectionItemInfo(((Object) (android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(k, i, -1, -1, ((LayoutParams) (recycler)).mFullSpan, false))));
			return;
		}
	//*  39   74:goto            51
		int l = ((LayoutParams) (recycler)).getSpanIndex();
	//   40   77:aload_1         
	//   41   78:invokevirtual   #961 <Method int StaggeredGridLayoutManager$LayoutParams.getSpanIndex()>
	//   42   81:istore          6
		int j;
		if(((LayoutParams) (recycler)).mFullSpan)
	//*  43   83:aload_1         
	//*  44   84:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*  45   87:ifeq            116
			j = mSpanCount;
	//   46   90:aload_0         
	//   47   91:getfield        #93  <Field int mSpanCount>
	//   48   94:istore          5
		else
	//*  49   96:aload           4
	//*  50   98:iconst_m1       
	//*  51   99:iconst_m1       
	//*  52  100:iload           6
	//*  53  102:iload           5
	//*  54  104:aload_1         
	//*  55  105:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*  56  108:iconst_0        
	//*  57  109:invokestatic    #967 <Method android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat.obtain(int, int, int, int, boolean, boolean)>
	//*  58  112:invokevirtual   #973 <Method void AccessibilityNodeInfoCompat.setCollectionItemInfo(Object)>
	//*  59  115:return          
			j = 1;
	//   60  116:iconst_1        
	//   61  117:istore          5
		accessibilitynodeinfocompat.setCollectionItemInfo(((Object) (android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(-1, -1, l, j, ((LayoutParams) (recycler)).mFullSpan, false))));
	//*  62  119:goto            96
	}

	public void onItemsAdded(RecyclerView recyclerview, int i, int j)
	{
		handleUpdate(i, j, 1);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #977 <Method void handleUpdate(int, int, int)>
	//    5    7:return          
	}

	public void onItemsChanged(RecyclerView recyclerview)
	{
		mLazySpanLookup.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//    2    4:invokevirtual   #606 <Method void StaggeredGridLayoutManager$LazySpanLookup.clear()>
		requestLayout();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #512 <Method void requestLayout()>
	//    5   11:return          
	}

	public void onItemsMoved(RecyclerView recyclerview, int i, int j, int k)
	{
		handleUpdate(i, j, 8);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:bipush          8
	//    4    5:invokespecial   #977 <Method void handleUpdate(int, int, int)>
	//    5    8:return          
	}

	public void onItemsRemoved(RecyclerView recyclerview, int i, int j)
	{
		handleUpdate(i, j, 2);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iconst_2        
	//    4    4:invokespecial   #977 <Method void handleUpdate(int, int, int)>
	//    5    7:return          
	}

	public void onItemsUpdated(RecyclerView recyclerview, int i, int j, Object obj)
	{
		handleUpdate(i, j, 4);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iconst_4        
	//    4    4:invokespecial   #977 <Method void handleUpdate(int, int, int)>
	//    5    7:return          
	}

	public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		onLayoutChildren(recycler, state, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #671 <Method void onLayoutChildren(RecyclerView$Recycler, RecyclerView$State, boolean)>
	//    5    7:return          
	}

	public void onLayoutCompleted(RecyclerView.State state)
	{
		super.onLayoutCompleted(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #989 <Method void RecyclerView$LayoutManager.onLayoutCompleted(RecyclerView$State)>
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
	//   11   18:putfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
		mAnchorInfo.reset();
	//   12   21:aload_0         
	//   13   22:getfield        #116 <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
	//   14   25:invokevirtual   #594 <Method void StaggeredGridLayoutManager$AnchorInfo.reset()>
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
	//    6   12:putfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
			requestLayout();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #512 <Method void requestLayout()>
		}
	//    9   19:return          
	}

	public Parcelable onSaveInstanceState()
	{
		if(mPendingSavedState == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//    2    4:ifnull          23
_L1:
		SavedState savedstate = new SavedState(mPendingSavedState);
	//    3    7:new             #24  <Class StaggeredGridLayoutManager$SavedState>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//    7   15:invokespecial   #996 <Method void StaggeredGridLayoutManager$SavedState(StaggeredGridLayoutManager$SavedState)>
	//    8   18:astore          4
_L4:
		return ((Parcelable) (savedstate));
	//    9   20:aload           4
	//   10   22:areturn         
_L2:
		SavedState savedstate1;
label0:
		{
			savedstate1 = new SavedState();
	//   11   23:new             #24  <Class StaggeredGridLayoutManager$SavedState>
	//   12   26:dup             
	//   13   27:invokespecial   #997 <Method void StaggeredGridLayoutManager$SavedState()>
	//   14   30:astore          5
			savedstate1.mReverseLayout = mReverseLayout;
	//   15   32:aload           5
	//   16   34:aload_0         
	//   17   35:getfield        #95  <Field boolean mReverseLayout>
	//   18   38:putfield        #214 <Field boolean StaggeredGridLayoutManager$SavedState.mReverseLayout>
			savedstate1.mAnchorLayoutFromEnd = mLastLayoutFromEnd;
	//   19   41:aload           5
	//   20   43:aload_0         
	//   21   44:getfield        #605 <Field boolean mLastLayoutFromEnd>
	//   22   47:putfield        #187 <Field boolean StaggeredGridLayoutManager$SavedState.mAnchorLayoutFromEnd>
			savedstate1.mLastLayoutRTL = mLastLayoutRTL;
	//   23   50:aload           5
	//   24   52:aload_0         
	//   25   53:getfield        #213 <Field boolean mLastLayoutRTL>
	//   26   56:putfield        #212 <Field boolean StaggeredGridLayoutManager$SavedState.mLastLayoutRTL>
			int i;
			int j;
			if(mLazySpanLookup != null && mLazySpanLookup.mData != null)
	//*  27   59:aload_0         
	//*  28   60:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//*  29   63:ifnull          231
	//*  30   66:aload_0         
	//*  31   67:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//*  32   70:getfield        #229 <Field int[] StaggeredGridLayoutManager$LazySpanLookup.mData>
	//*  33   73:ifnull          231
			{
				savedstate1.mSpanLookup = mLazySpanLookup.mData;
	//   34   76:aload           5
	//   35   78:aload_0         
	//   36   79:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   37   82:getfield        #229 <Field int[] StaggeredGridLayoutManager$LazySpanLookup.mData>
	//   38   85:putfield        #226 <Field int[] StaggeredGridLayoutManager$SavedState.mSpanLookup>
				savedstate1.mSpanLookupSize = savedstate1.mSpanLookup.length;
	//   39   88:aload           5
	//   40   90:aload           5
	//   41   92:getfield        #226 <Field int[] StaggeredGridLayoutManager$SavedState.mSpanLookup>
	//   42   95:arraylength     
	//   43   96:putfield        #223 <Field int StaggeredGridLayoutManager$SavedState.mSpanLookupSize>
				savedstate1.mFullSpanItems = mLazySpanLookup.mFullSpanItems;
	//   44   99:aload           5
	//   45  101:aload_0         
	//   46  102:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   47  105:getfield        #234 <Field List StaggeredGridLayoutManager$LazySpanLookup.mFullSpanItems>
	//   48  108:putfield        #233 <Field List StaggeredGridLayoutManager$SavedState.mFullSpanItems>
			} else
	//*  49  111:aload_0         
	//*  50  112:invokevirtual   #259 <Method int getChildCount()>
	//*  51  115:ifle            281
	//*  52  118:aload_0         
	//*  53  119:getfield        #605 <Field boolean mLastLayoutFromEnd>
	//*  54  122:ifeq            240
	//*  55  125:aload_0         
	//*  56  126:invokevirtual   #500 <Method int getLastChildPosition()>
	//*  57  129:istore_1        
	//*  58  130:aload           5
	//*  59  132:iload_1         
	//*  60  133:putfield        #210 <Field int StaggeredGridLayoutManager$SavedState.mAnchorPosition>
	//*  61  136:aload           5
	//*  62  138:aload_0         
	//*  63  139:invokevirtual   #999 <Method int findFirstVisibleItemPositionInt()>
	//*  64  142:putfield        #207 <Field int StaggeredGridLayoutManager$SavedState.mVisibleAnchorPosition>
	//*  65  145:aload           5
	//*  66  147:aload_0         
	//*  67  148:getfield        #93  <Field int mSpanCount>
	//*  68  151:putfield        #178 <Field int StaggeredGridLayoutManager$SavedState.mSpanOffsetsSize>
	//*  69  154:aload           5
	//*  70  156:aload_0         
	//*  71  157:getfield        #93  <Field int mSpanCount>
	//*  72  160:newarray        int[]
	//*  73  162:putfield        #184 <Field int[] StaggeredGridLayoutManager$SavedState.mSpanOffsets>
	//*  74  165:iconst_0        
	//*  75  166:istore_2        
	//*  76  167:aload           5
	//*  77  169:astore          4
	//*  78  171:iload_2         
	//*  79  172:aload_0         
	//*  80  173:getfield        #93  <Field int mSpanCount>
	//*  81  176:icmpge          20
	//*  82  179:aload_0         
	//*  83  180:getfield        #605 <Field boolean mLastLayoutFromEnd>
	//*  84  183:ifeq            248
	//*  85  186:aload_0         
	//*  86  187:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//*  87  190:iload_2         
	//*  88  191:aaload          
	//*  89  192:ldc1            #43  <Int 0x80000000>
	//*  90  194:invokevirtual   #323 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
	//*  91  197:istore_3        
	//*  92  198:iload_3         
	//*  93  199:istore_1        
	//*  94  200:iload_3         
	//*  95  201:ldc1            #43  <Int 0x80000000>
	//*  96  203:icmpeq          216
	//*  97  206:iload_3         
	//*  98  207:aload_0         
	//*  99  208:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//* 100  211:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//* 101  214:isub            
	//* 102  215:istore_1        
	//* 103  216:aload           5
	//* 104  218:getfield        #184 <Field int[] StaggeredGridLayoutManager$SavedState.mSpanOffsets>
	//* 105  221:iload_2         
	//* 106  222:iload_1         
	//* 107  223:iastore         
	//* 108  224:iload_2         
	//* 109  225:iconst_1        
	//* 110  226:iadd            
	//* 111  227:istore_2        
	//* 112  228:goto            167
			{
				savedstate1.mSpanLookupSize = 0;
	//  113  231:aload           5
	//  114  233:iconst_0        
	//  115  234:putfield        #223 <Field int StaggeredGridLayoutManager$SavedState.mSpanLookupSize>
			}
			if(getChildCount() <= 0)
				break label0;
			if(mLastLayoutFromEnd)
				i = getLastChildPosition();
			else
	//* 116  237:goto            111
				i = getFirstChildPosition();
	//  117  240:aload_0         
	//  118  241:invokevirtual   #262 <Method int getFirstChildPosition()>
	//  119  244:istore_1        
			savedstate1.mAnchorPosition = i;
			savedstate1.mVisibleAnchorPosition = findFirstVisibleItemPositionInt();
			savedstate1.mSpanOffsetsSize = mSpanCount;
			savedstate1.mSpanOffsets = new int[mSpanCount];
			j = 0;
			do
			{
				savedstate = savedstate1;
				if(j >= mSpanCount)
					break;
				if(mLastLayoutFromEnd)
				{
					int k = mSpans[j].getEndLine(0x80000000);
					i = k;
					if(k != 0x80000000)
						i = k - mPrimaryOrientation.getEndAfterPadding();
				} else
	//* 120  245:goto            130
				{
					int l = mSpans[j].getStartLine(0x80000000);
	//  121  248:aload_0         
	//  122  249:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  123  252:iload_2         
	//  124  253:aaload          
	//  125  254:ldc1            #43  <Int 0x80000000>
	//  126  256:invokevirtual   #326 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
	//  127  259:istore_3        
					i = l;
	//  128  260:iload_3         
	//  129  261:istore_1        
					if(l != 0x80000000)
	//* 130  262:iload_3         
	//* 131  263:ldc1            #43  <Int 0x80000000>
	//* 132  265:icmpeq          216
						i = l - mPrimaryOrientation.getStartAfterPadding();
	//  133  268:iload_3         
	//  134  269:aload_0         
	//  135  270:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  136  273:invokevirtual   #201 <Method int OrientationHelper.getStartAfterPadding()>
	//  137  276:isub            
	//  138  277:istore_1        
				}
				savedstate1.mSpanOffsets[j] = i;
				j++;
			} while(true);
	//  139  278:goto            216
		}
		if(true) goto _L4; else goto _L3
_L3:
		savedstate1.mAnchorPosition = -1;
	//  140  281:aload           5
	//  141  283:iconst_m1       
	//  142  284:putfield        #210 <Field int StaggeredGridLayoutManager$SavedState.mAnchorPosition>
		savedstate1.mVisibleAnchorPosition = -1;
	//  143  287:aload           5
	//  144  289:iconst_m1       
	//  145  290:putfield        #207 <Field int StaggeredGridLayoutManager$SavedState.mVisibleAnchorPosition>
		savedstate1.mSpanOffsetsSize = 0;
	//  146  293:aload           5
	//  147  295:iconst_0        
	//  148  296:putfield        #178 <Field int StaggeredGridLayoutManager$SavedState.mSpanOffsetsSize>
		return ((Parcelable) (savedstate1));
	//  149  299:aload           5
	//  150  301:areturn         
	}

	public void onScrollStateChanged(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            9
			checkForGaps();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #669 <Method boolean checkForGaps()>
	//    4    8:pop             
	//    5    9:return          
	}

	void prepareLayoutStateForDelta(int i, RecyclerView.State state)
	{
		int j;
		int k;
		if(i > 0)
	//*   0    0:iload_1         
	//*   1    1:ifle            61
		{
			j = 1;
	//    2    4:iconst_1        
	//    3    5:istore_3        
			k = getLastChildPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #500 <Method int getLastChildPosition()>
	//    6   10:istore          4
		} else
	//*   7   12:aload_0         
	//*   8   13:getfield        #138 <Field LayoutState mLayoutState>
	//*   9   16:iconst_1        
	//*  10   17:putfield        #629 <Field boolean LayoutState.mRecycle>
	//*  11   20:aload_0         
	//*  12   21:iload           4
	//*  13   23:aload_2         
	//*  14   24:invokespecial   #640 <Method void updateLayoutState(int, RecyclerView$State)>
	//*  15   27:aload_0         
	//*  16   28:iload_3         
	//*  17   29:invokespecial   #643 <Method void setLayoutStateDirection(int)>
	//*  18   32:aload_0         
	//*  19   33:getfield        #138 <Field LayoutState mLayoutState>
	//*  20   36:aload_0         
	//*  21   37:getfield        #138 <Field LayoutState mLayoutState>
	//*  22   40:getfield        #402 <Field int LayoutState.mItemDirection>
	//*  23   43:iload           4
	//*  24   45:iadd            
	//*  25   46:putfield        #648 <Field int LayoutState.mCurrentPosition>
	//*  26   49:aload_0         
	//*  27   50:getfield        #138 <Field LayoutState mLayoutState>
	//*  28   53:iload_1         
	//*  29   54:invokestatic    #1003 <Method int Math.abs(int)>
	//*  30   57:putfield        #425 <Field int LayoutState.mAvailable>
	//*  31   60:return          
		{
			j = -1;
	//   32   61:iconst_m1       
	//   33   62:istore_3        
			k = getFirstChildPosition();
	//   34   63:aload_0         
	//   35   64:invokevirtual   #262 <Method int getFirstChildPosition()>
	//   36   67:istore          4
		}
		mLayoutState.mRecycle = true;
		updateLayoutState(k, state);
		setLayoutStateDirection(j);
		mLayoutState.mCurrentPosition = mLayoutState.mItemDirection + k;
		mLayoutState.mAvailable = Math.abs(i);
	//*  37   69:goto            12
	}

	int scrollBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(getChildCount() == 0 || i == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #259 <Method int getChildCount()>
	//*   2    4:ifeq            11
	//*   3    7:iload_1         
	//*   4    8:ifne            13
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		prepareLayoutStateForDelta(i, state);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:aload_3         
	//   10   16:invokevirtual   #785 <Method void prepareLayoutStateForDelta(int, RecyclerView$State)>
		int j = fill(recycler, mLayoutState, state);
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:aload_0         
	//   14   22:getfield        #138 <Field LayoutState mLayoutState>
	//   15   25:aload_3         
	//   16   26:invokespecial   #645 <Method int fill(RecyclerView$Recycler, LayoutState, RecyclerView$State)>
	//   17   29:istore          4
		if(mLayoutState.mAvailable >= j)
	//*  18   31:aload_0         
	//*  19   32:getfield        #138 <Field LayoutState mLayoutState>
	//*  20   35:getfield        #425 <Field int LayoutState.mAvailable>
	//*  21   38:iload           4
	//*  22   40:icmpge          79
	//*  23   43:aload_0         
	//*  24   44:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//*  25   47:iload_1         
	//*  26   48:ineg            
	//*  27   49:invokevirtual   #488 <Method void OrientationHelper.offsetChildren(int)>
	//*  28   52:aload_0         
	//*  29   53:aload_0         
	//*  30   54:getfield        #97  <Field boolean mShouldReverseLayout>
	//*  31   57:putfield        #605 <Field boolean mLastLayoutFromEnd>
	//*  32   60:aload_0         
	//*  33   61:getfield        #138 <Field LayoutState mLayoutState>
	//*  34   64:iconst_0        
	//*  35   65:putfield        #425 <Field int LayoutState.mAvailable>
	//*  36   68:aload_0         
	//*  37   69:aload_2         
	//*  38   70:aload_0         
	//*  39   71:getfield        #138 <Field LayoutState mLayoutState>
	//*  40   74:invokespecial   #412 <Method void recycle(RecyclerView$Recycler, LayoutState)>
	//*  41   77:iload_1         
	//*  42   78:ireturn         
			if(i < 0)
	//*  43   79:iload_1         
	//*  44   80:ifge            90
				i = -j;
	//   45   83:iload           4
	//   46   85:ineg            
	//   47   86:istore_1        
			else
	//*  48   87:goto            43
				i = j;
	//   49   90:iload           4
	//   50   92:istore_1        
		mPrimaryOrientation.offsetChildren(-i);
		mLastLayoutFromEnd = mShouldReverseLayout;
		mLayoutState.mAvailable = 0;
		recycle(recycler, mLayoutState);
		return i;
	//*  51   93:goto            43
	}

	public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		return scrollBy(i, recycler, state);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #485 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//    5    7:ireturn         
	}

	public void scrollToPosition(int i)
	{
		if(mPendingSavedState != null && mPendingSavedState.mAnchorPosition != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*   2    4:ifnull          25
	//*   3    7:aload_0         
	//*   4    8:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*   5   11:getfield        #210 <Field int StaggeredGridLayoutManager$SavedState.mAnchorPosition>
	//*   6   14:iload_1         
	//*   7   15:icmpeq          25
			mPendingSavedState.invalidateAnchorPositionInfo();
	//    8   18:aload_0         
	//    9   19:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   10   22:invokevirtual   #1008 <Method void StaggeredGridLayoutManager$SavedState.invalidateAnchorPositionInfo()>
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
	//   18   37:invokevirtual   #512 <Method void requestLayout()>
	//   19   40:return          
	}

	public void scrollToPositionWithOffset(int i, int j)
	{
		if(mPendingSavedState != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*   2    4:ifnull          14
			mPendingSavedState.invalidateAnchorPositionInfo();
	//    3    7:aload_0         
	//    4    8:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//    5   11:invokevirtual   #1008 <Method void StaggeredGridLayoutManager$SavedState.invalidateAnchorPositionInfo()>
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
	//   13   25:invokevirtual   #512 <Method void requestLayout()>
	//   14   28:return          
	}

	public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		return scrollBy(i, recycler, state);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #485 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//    5    7:ireturn         
	}

	public void setGapStrategy(int i)
	{
		assertNotInLayoutOrScroll(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #1012 <Method void assertNotInLayoutOrScroll(String)>
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
			throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
	//   13   23:new             #830 <Class IllegalArgumentException>
	//   14   26:dup             
	//   15   27:ldc2            #1014 <String "invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS">
	//   16   30:invokespecial   #850 <Method void IllegalArgumentException(String)>
	//   17   33:athrow          
		mGapStrategy = i;
	//   18   34:aload_0         
	//   19   35:iload_1         
	//   20   36:putfield        #106 <Field int mGapStrategy>
		boolean flag;
		if(mGapStrategy != 0)
	//*  21   39:aload_0         
	//*  22   40:getfield        #106 <Field int mGapStrategy>
	//*  23   43:ifeq            58
			flag = true;
	//   24   46:iconst_1        
	//   25   47:istore_2        
		else
	//*  26   48:aload_0         
	//*  27   49:iload_2         
	//*  28   50:invokevirtual   #133 <Method void setAutoMeasureEnabled(boolean)>
	//*  29   53:aload_0         
	//*  30   54:invokevirtual   #512 <Method void requestLayout()>
	//*  31   57:return          
			flag = false;
	//   32   58:iconst_0        
	//   33   59:istore_2        
		setAutoMeasureEnabled(flag);
		requestLayout();
	//*  34   60:goto            48
	}

	public void setMeasuredDimension(Rect rect, int i, int j)
	{
		int i1 = getPaddingLeft() + getPaddingRight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1019 <Method int getPaddingLeft()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #1022 <Method int getPaddingRight()>
	//    4    8:iadd            
	//    5    9:istore          5
		int j1 = getPaddingTop() + getPaddingBottom();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #1025 <Method int getPaddingTop()>
	//    8   15:aload_0         
	//    9   16:invokevirtual   #1028 <Method int getPaddingBottom()>
	//   10   19:iadd            
	//   11   20:istore          6
		if(mOrientation == 1)
	//*  12   22:aload_0         
	//*  13   23:getfield        #125 <Field int mOrientation>
	//*  14   26:iconst_1        
	//*  15   27:icmpne          78
		{
			int k = chooseSize(j, rect.height() + j1, getMinimumHeight());
	//   16   30:iload_3         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #1030 <Method int Rect.height()>
	//   19   35:iload           6
	//   20   37:iadd            
	//   21   38:aload_0         
	//   22   39:invokevirtual   #1033 <Method int getMinimumHeight()>
	//   23   42:invokestatic    #1036 <Method int chooseSize(int, int, int)>
	//   24   45:istore          4
			j = chooseSize(i, mSizePerSpan * mSpanCount + i1, getMinimumWidth());
	//   25   47:iload_2         
	//   26   48:aload_0         
	//   27   49:getfield        #457 <Field int mSizePerSpan>
	//   28   52:aload_0         
	//   29   53:getfield        #93  <Field int mSpanCount>
	//   30   56:imul            
	//   31   57:iload           5
	//   32   59:iadd            
	//   33   60:aload_0         
	//   34   61:invokevirtual   #1039 <Method int getMinimumWidth()>
	//   35   64:invokestatic    #1036 <Method int chooseSize(int, int, int)>
	//   36   67:istore_3        
			i = k;
	//   37   68:iload           4
	//   38   70:istore_2        
		} else
	//*  39   71:aload_0         
	//*  40   72:iload_3         
	//*  41   73:iload_2         
	//*  42   74:invokevirtual   #1041 <Method void setMeasuredDimension(int, int)>
	//*  43   77:return          
		{
			int l = chooseSize(i, rect.width() + i1, getMinimumWidth());
	//   44   78:iload_2         
	//   45   79:aload_1         
	//   46   80:invokevirtual   #1043 <Method int Rect.width()>
	//   47   83:iload           5
	//   48   85:iadd            
	//   49   86:aload_0         
	//   50   87:invokevirtual   #1039 <Method int getMinimumWidth()>
	//   51   90:invokestatic    #1036 <Method int chooseSize(int, int, int)>
	//   52   93:istore          4
			i = chooseSize(j, mSizePerSpan * mSpanCount + j1, getMinimumHeight());
	//   53   95:iload_3         
	//   54   96:aload_0         
	//   55   97:getfield        #457 <Field int mSizePerSpan>
	//   56  100:aload_0         
	//   57  101:getfield        #93  <Field int mSpanCount>
	//   58  104:imul            
	//   59  105:iload           6
	//   60  107:iadd            
	//   61  108:aload_0         
	//   62  109:invokevirtual   #1033 <Method int getMinimumHeight()>
	//   63  112:invokestatic    #1036 <Method int chooseSize(int, int, int)>
	//   64  115:istore_2        
			j = l;
	//   65  116:iload           4
	//   66  118:istore_3        
		}
		setMeasuredDimension(j, i);
	//*  67  119:goto            71
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
	//    5    9:new             #830 <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:ldc2            #1045 <String "invalid orientation.">
	//    8   16:invokespecial   #850 <Method void IllegalArgumentException(String)>
	//    9   19:athrow          
		assertNotInLayoutOrScroll(((String) (null)));
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:invokevirtual   #1012 <Method void assertNotInLayoutOrScroll(String)>
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
	//   22   40:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   23   43:astore_2        
			mPrimaryOrientation = mSecondaryOrientation;
	//   24   44:aload_0         
	//   25   45:aload_0         
	//   26   46:getfield        #332 <Field OrientationHelper mSecondaryOrientation>
	//   27   49:putfield        #189 <Field OrientationHelper mPrimaryOrientation>
			mSecondaryOrientation = orientationhelper;
	//   28   52:aload_0         
	//   29   53:aload_2         
	//   30   54:putfield        #332 <Field OrientationHelper mSecondaryOrientation>
			requestLayout();
	//   31   57:aload_0         
	//   32   58:invokevirtual   #512 <Method void requestLayout()>
			return;
	//   33   61:return          
		}
	}

	public void setReverseLayout(boolean flag)
	{
		assertNotInLayoutOrScroll(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #1012 <Method void assertNotInLayoutOrScroll(String)>
		if(mPendingSavedState != null && mPendingSavedState.mReverseLayout != flag)
	//*   3    5:aload_0         
	//*   4    6:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*   5    9:ifnull          31
	//*   6   12:aload_0         
	//*   7   13:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*   8   16:getfield        #214 <Field boolean StaggeredGridLayoutManager$SavedState.mReverseLayout>
	//*   9   19:iload_1         
	//*  10   20:icmpeq          31
			mPendingSavedState.mReverseLayout = flag;
	//   11   23:aload_0         
	//   12   24:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   13   27:iload_1         
	//   14   28:putfield        #214 <Field boolean StaggeredGridLayoutManager$SavedState.mReverseLayout>
		mReverseLayout = flag;
	//   15   31:aload_0         
	//   16   32:iload_1         
	//   17   33:putfield        #95  <Field boolean mReverseLayout>
		requestLayout();
	//   18   36:aload_0         
	//   19   37:invokevirtual   #512 <Method void requestLayout()>
	//   20   40:return          
	}

	public void setSpanCount(int i)
	{
		assertNotInLayoutOrScroll(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #1012 <Method void assertNotInLayoutOrScroll(String)>
		if(i != mSpanCount)
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #93  <Field int mSpanCount>
	//*   6   10:icmpeq          84
		{
			invalidateSpanAssignments();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #1047 <Method void invalidateSpanAssignments()>
			mSpanCount = i;
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:putfield        #93  <Field int mSpanCount>
			mRemainingSpans = new BitSet(mSpanCount);
	//   12   22:aload_0         
	//   13   23:new             #338 <Class BitSet>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:getfield        #93  <Field int mSpanCount>
	//   17   31:invokespecial   #894 <Method void BitSet(int)>
	//   18   34:putfield        #336 <Field BitSet mRemainingSpans>
			mSpans = new Span[mSpanCount];
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:getfield        #93  <Field int mSpanCount>
	//   22   42:anewarray       Span[]
	//   23   45:putfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
			for(i = 0; i < mSpanCount; i++)
	//*  24   48:iconst_0        
	//*  25   49:istore_1        
	//*  26   50:iload_1         
	//*  27   51:aload_0         
	//*  28   52:getfield        #93  <Field int mSpanCount>
	//*  29   55:icmpge          80
				mSpans[i] = new Span(i);
	//   30   58:aload_0         
	//   31   59:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   32   62:iload_1         
	//   33   63:new             #29  <Class StaggeredGridLayoutManager$Span>
	//   34   66:dup             
	//   35   67:aload_0         
	//   36   68:iload_1         
	//   37   69:invokespecial   #1050 <Method void StaggeredGridLayoutManager$Span(StaggeredGridLayoutManager, int)>
	//   38   72:aastore         

	//   39   73:iload_1         
	//   40   74:iconst_1        
	//   41   75:iadd            
	//   42   76:istore_1        
	//*  43   77:goto            50
			requestLayout();
	//   44   80:aload_0         
	//   45   81:invokevirtual   #512 <Method void requestLayout()>
		}
	//   46   84:return          
	}

	public void smoothScrollToPosition(RecyclerView recyclerview, RecyclerView.State state, int i)
	{
		recyclerview = ((RecyclerView) (new LinearSmoothScroller(recyclerview.getContext())));
	//    0    0:new             #1054 <Class LinearSmoothScroller>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1058 <Method Context RecyclerView.getContext()>
	//    4    8:invokespecial   #1061 <Method void LinearSmoothScroller(Context)>
	//    5   11:astore_1        
		((LinearSmoothScroller) (recyclerview)).setTargetPosition(i);
	//    6   12:aload_1         
	//    7   13:iload_3         
	//    8   14:invokevirtual   #1064 <Method void LinearSmoothScroller.setTargetPosition(int)>
		startSmoothScroll(((RecyclerView.SmoothScroller) (recyclerview)));
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #1068 <Method void startSmoothScroll(RecyclerView$SmoothScroller)>
	//   12   22:return          
	}

	public boolean supportsPredictiveItemAnimations()
	{
		return mPendingSavedState == null;
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//    2    4:ifnonnull       9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	boolean updateAnchorFromPendingData(RecyclerView.State state, AnchorInfo anchorinfo)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(state.isPreLayout() || mPendingScrollPosition == -1)
	//*   2    3:aload_1         
	//*   3    4:invokevirtual   #658 <Method boolean RecyclerView$State.isPreLayout()>
	//*   4    7:ifne            18
	//*   5   10:aload_0         
	//*   6   11:getfield        #99  <Field int mPendingScrollPosition>
	//*   7   14:iconst_m1       
	//*   8   15:icmpne          20
			return false;
	//    9   18:iconst_0        
	//   10   19:ireturn         
		if(mPendingScrollPosition < 0 || mPendingScrollPosition >= state.getItemCount())
	//*  11   20:aload_0         
	//*  12   21:getfield        #99  <Field int mPendingScrollPosition>
	//*  13   24:iflt            38
	//*  14   27:aload_0         
	//*  15   28:getfield        #99  <Field int mPendingScrollPosition>
	//*  16   31:aload_1         
	//*  17   32:invokevirtual   #587 <Method int RecyclerView$State.getItemCount()>
	//*  18   35:icmplt          51
		{
			mPendingScrollPosition = -1;
	//   19   38:aload_0         
	//   20   39:iconst_m1       
	//   21   40:putfield        #99  <Field int mPendingScrollPosition>
			mPendingScrollPositionOffset = 0x80000000;
	//   22   43:aload_0         
	//   23   44:ldc1            #43  <Int 0x80000000>
	//   24   46:putfield        #101 <Field int mPendingScrollPositionOffset>
			return false;
	//   25   49:iconst_0        
	//   26   50:ireturn         
		}
		if(mPendingSavedState == null || mPendingSavedState.mAnchorPosition == -1 || mPendingSavedState.mSpanOffsetsSize < 1)
	//*  27   51:aload_0         
	//*  28   52:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  29   55:ifnull          80
	//*  30   58:aload_0         
	//*  31   59:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  32   62:getfield        #210 <Field int StaggeredGridLayoutManager$SavedState.mAnchorPosition>
	//*  33   65:iconst_m1       
	//*  34   66:icmpeq          80
	//*  35   69:aload_0         
	//*  36   70:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  37   73:getfield        #178 <Field int StaggeredGridLayoutManager$SavedState.mSpanOffsetsSize>
	//*  38   76:iconst_1        
	//*  39   77:icmpge          364
		{
			state = ((RecyclerView.State) (findViewByPosition(mPendingScrollPosition)));
	//   40   80:aload_0         
	//   41   81:aload_0         
	//   42   82:getfield        #99  <Field int mPendingScrollPosition>
	//   43   85:invokevirtual   #937 <Method View findViewByPosition(int)>
	//   44   88:astore_1        
			if(state != null)
	//*  45   89:aload_1         
	//*  46   90:ifnull          304
			{
				int i;
				if(mShouldReverseLayout)
	//*  47   93:aload_0         
	//*  48   94:getfield        #97  <Field boolean mShouldReverseLayout>
	//*  49   97:ifeq            153
					i = getLastChildPosition();
	//   50  100:aload_0         
	//   51  101:invokevirtual   #500 <Method int getLastChildPosition()>
	//   52  104:istore_3        
				else
	//*  53  105:aload_2         
	//*  54  106:iload_3         
	//*  55  107:putfield        #636 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
	//*  56  110:aload_0         
	//*  57  111:getfield        #101 <Field int mPendingScrollPositionOffset>
	//*  58  114:ldc1            #43  <Int 0x80000000>
	//*  59  116:icmpeq          188
	//*  60  119:aload_2         
	//*  61  120:getfield        #220 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
	//*  62  123:ifeq            161
	//*  63  126:aload_2         
	//*  64  127:aload_0         
	//*  65  128:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//*  66  131:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//*  67  134:aload_0         
	//*  68  135:getfield        #101 <Field int mPendingScrollPositionOffset>
	//*  69  138:isub            
	//*  70  139:aload_0         
	//*  71  140:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//*  72  143:aload_1         
	//*  73  144:invokevirtual   #698 <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  74  147:isub            
	//*  75  148:putfield        #612 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
	//*  76  151:iconst_1        
	//*  77  152:ireturn         
					i = getFirstChildPosition();
	//   78  153:aload_0         
	//   79  154:invokevirtual   #262 <Method int getFirstChildPosition()>
	//   80  157:istore_3        
				anchorinfo.mPosition = i;
				if(mPendingScrollPositionOffset != 0x80000000)
					if(anchorinfo.mLayoutFromEnd)
					{
						anchorinfo.mOffset = mPrimaryOrientation.getEndAfterPadding() - mPendingScrollPositionOffset - mPrimaryOrientation.getDecoratedEnd(((View) (state)));
						return true;
					} else
	//*  81  158:goto            105
					{
						anchorinfo.mOffset = (mPrimaryOrientation.getStartAfterPadding() + mPendingScrollPositionOffset) - mPrimaryOrientation.getDecoratedStart(((View) (state)));
	//   82  161:aload_2         
	//   83  162:aload_0         
	//   84  163:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   85  166:invokevirtual   #201 <Method int OrientationHelper.getStartAfterPadding()>
	//   86  169:aload_0         
	//   87  170:getfield        #101 <Field int mPendingScrollPositionOffset>
	//   88  173:iadd            
	//   89  174:aload_0         
	//   90  175:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   91  178:aload_1         
	//   92  179:invokevirtual   #685 <Method int OrientationHelper.getDecoratedStart(View)>
	//   93  182:isub            
	//   94  183:putfield        #612 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
						return true;
	//   95  186:iconst_1        
	//   96  187:ireturn         
					}
				if(mPrimaryOrientation.getDecoratedMeasurement(((View) (state))) > mPrimaryOrientation.getTotalSpace())
	//*  97  188:aload_0         
	//*  98  189:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//*  99  192:aload_1         
	//* 100  193:invokevirtual   #387 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//* 101  196:aload_0         
	//* 102  197:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//* 103  200:invokevirtual   #632 <Method int OrientationHelper.getTotalSpace()>
	//* 104  203:icmple          239
				{
					if(anchorinfo.mLayoutFromEnd)
	//* 105  206:aload_2         
	//* 106  207:getfield        #220 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
	//* 107  210:ifeq            228
						i = mPrimaryOrientation.getEndAfterPadding();
	//  108  213:aload_0         
	//  109  214:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  110  217:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//  111  220:istore_3        
					else
	//* 112  221:aload_2         
	//* 113  222:iload_3         
	//* 114  223:putfield        #612 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
	//* 115  226:iconst_1        
	//* 116  227:ireturn         
						i = mPrimaryOrientation.getStartAfterPadding();
	//  117  228:aload_0         
	//  118  229:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  119  232:invokevirtual   #201 <Method int OrientationHelper.getStartAfterPadding()>
	//  120  235:istore_3        
					anchorinfo.mOffset = i;
					return true;
				}
	//* 121  236:goto            221
				i = mPrimaryOrientation.getDecoratedStart(((View) (state))) - mPrimaryOrientation.getStartAfterPadding();
	//  122  239:aload_0         
	//  123  240:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  124  243:aload_1         
	//  125  244:invokevirtual   #685 <Method int OrientationHelper.getDecoratedStart(View)>
	//  126  247:aload_0         
	//  127  248:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  128  251:invokevirtual   #201 <Method int OrientationHelper.getStartAfterPadding()>
	//  129  254:isub            
	//  130  255:istore_3        
				if(i < 0)
	//* 131  256:iload_3         
	//* 132  257:ifge            268
				{
					anchorinfo.mOffset = -i;
	//  133  260:aload_2         
	//  134  261:iload_3         
	//  135  262:ineg            
	//  136  263:putfield        #612 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
					return true;
	//  137  266:iconst_1        
	//  138  267:ireturn         
				}
				i = mPrimaryOrientation.getEndAfterPadding() - mPrimaryOrientation.getDecoratedEnd(((View) (state)));
	//  139  268:aload_0         
	//  140  269:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  141  272:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//  142  275:aload_0         
	//  143  276:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  144  279:aload_1         
	//  145  280:invokevirtual   #698 <Method int OrientationHelper.getDecoratedEnd(View)>
	//  146  283:isub            
	//  147  284:istore_3        
				if(i < 0)
	//* 148  285:iload_3         
	//* 149  286:ifge            296
				{
					anchorinfo.mOffset = i;
	//  150  289:aload_2         
	//  151  290:iload_3         
	//  152  291:putfield        #612 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
					return true;
	//  153  294:iconst_1        
	//  154  295:ireturn         
				} else
				{
					anchorinfo.mOffset = 0x80000000;
	//  155  296:aload_2         
	//  156  297:ldc1            #43  <Int 0x80000000>
	//  157  299:putfield        #612 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
					return true;
	//  158  302:iconst_1        
	//  159  303:ireturn         
				}
			}
			anchorinfo.mPosition = mPendingScrollPosition;
	//  160  304:aload_2         
	//  161  305:aload_0         
	//  162  306:getfield        #99  <Field int mPendingScrollPosition>
	//  163  309:putfield        #636 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
			if(mPendingScrollPositionOffset == 0x80000000)
	//* 164  312:aload_0         
	//* 165  313:getfield        #101 <Field int mPendingScrollPositionOffset>
	//* 166  316:ldc1            #43  <Int 0x80000000>
	//* 167  318:icmpne          353
			{
				if(calculateScrollDirectionForPosition(anchorinfo.mPosition) == 1)
	//* 168  321:aload_0         
	//* 169  322:aload_2         
	//* 170  323:getfield        #636 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
	//* 171  326:invokespecial   #811 <Method int calculateScrollDirectionForPosition(int)>
	//* 172  329:iconst_1        
	//* 173  330:icmpne          336
					flag = true;
	//  174  333:iconst_1        
	//  175  334:istore          4
				anchorinfo.mLayoutFromEnd = flag;
	//  176  336:aload_2         
	//  177  337:iload           4
	//  178  339:putfield        #220 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
				anchorinfo.assignCoordinateFromPadding();
	//  179  342:aload_2         
	//  180  343:invokevirtual   #1073 <Method void StaggeredGridLayoutManager$AnchorInfo.assignCoordinateFromPadding()>
			} else
	//* 181  346:aload_2         
	//* 182  347:iconst_1        
	//* 183  348:putfield        #609 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mInvalidateOffsets>
	//* 184  351:iconst_1        
	//* 185  352:ireturn         
			{
				anchorinfo.assignCoordinateFromPadding(mPendingScrollPositionOffset);
	//  186  353:aload_2         
	//  187  354:aload_0         
	//  188  355:getfield        #101 <Field int mPendingScrollPositionOffset>
	//  189  358:invokevirtual   #1075 <Method void StaggeredGridLayoutManager$AnchorInfo.assignCoordinateFromPadding(int)>
			}
			anchorinfo.mInvalidateOffsets = true;
			return true;
		} else
	//* 190  361:goto            346
		{
			anchorinfo.mOffset = 0x80000000;
	//  191  364:aload_2         
	//  192  365:ldc1            #43  <Int 0x80000000>
	//  193  367:putfield        #612 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
			anchorinfo.mPosition = mPendingScrollPosition;
	//  194  370:aload_2         
	//  195  371:aload_0         
	//  196  372:getfield        #99  <Field int mPendingScrollPosition>
	//  197  375:putfield        #636 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
			return true;
	//  198  378:iconst_1        
	//  199  379:ireturn         
		}
	}

	void updateAnchorInfoForLayout(RecyclerView.State state, AnchorInfo anchorinfo)
	{
		while(updateAnchorFromPendingData(state, anchorinfo) || updateAnchorFromChildren(state, anchorinfo)) 
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:aload_2         
	//*   3    3:invokevirtual   #1077 <Method boolean updateAnchorFromPendingData(RecyclerView$State, StaggeredGridLayoutManager$AnchorInfo)>
	//*   4    6:ifeq            10
			return;
	//    5    9:return          
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:invokespecial   #1079 <Method boolean updateAnchorFromChildren(RecyclerView$State, StaggeredGridLayoutManager$AnchorInfo)>
	//   10   16:ifne            9
		anchorinfo.assignCoordinateFromPadding();
	//   11   19:aload_2         
	//   12   20:invokevirtual   #1073 <Method void StaggeredGridLayoutManager$AnchorInfo.assignCoordinateFromPadding()>
		anchorinfo.mPosition = 0;
	//   13   23:aload_2         
	//   14   24:iconst_0        
	//   15   25:putfield        #636 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
	//   16   28:return          
	}

	void updateMeasureSpecs(int i)
	{
		mSizePerSpan = i / mSpanCount;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #93  <Field int mSpanCount>
	//    4    6:idiv            
	//    5    7:putfield        #457 <Field int mSizePerSpan>
		mFullSizeSpec = android.view.View.MeasureSpec.makeMeasureSpec(i, mSecondaryOrientation.getMode());
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_0         
	//    9   13:getfield        #332 <Field OrientationHelper mSecondaryOrientation>
	//   10   16:invokevirtual   #707 <Method int OrientationHelper.getMode()>
	//   11   19:invokestatic    #759 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   12   22:putfield        #557 <Field int mFullSizeSpec>
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
