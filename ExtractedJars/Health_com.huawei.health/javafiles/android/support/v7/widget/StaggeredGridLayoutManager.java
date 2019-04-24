// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.accessibility.*;
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
			byte byte0 = -1;
		//   16   33:iconst_m1       
		//   17   34:istore          4
			int l = mFullSpanItems.size();
		//   18   36:aload_0         
		//   19   37:getfield        #29  <Field List mFullSpanItems>
		//   20   40:invokeinterface #43  <Method int List.size()>
		//   21   45:istore          5
			int j = 0;
		//   22   47:iconst_0        
		//   23   48:istore_2        
			int k;
			do
			{
				k = ((int) (byte0));
		//   24   49:iload           4
		//   25   51:istore_3        
				if(j >= l)
					break;
		//   26   52:iload_2         
		//   27   53:iload           5
		//   28   55:icmpge          90
				if(((FullSpanItem)mFullSpanItems.get(j)).mPosition >= i)
		//*  29   58:aload_0         
		//*  30   59:getfield        #29  <Field List mFullSpanItems>
		//*  31   62:iload_2         
		//*  32   63:invokeinterface #47  <Method Object List.get(int)>
		//*  33   68:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//*  34   71:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//*  35   74:iload_1         
		//*  36   75:icmplt          83
				{
					k = j;
		//   37   78:iload_2         
		//   38   79:istore_3        
					break;
		//   39   80:goto            90
				}
				j++;
		//   40   83:iload_2         
		//   41   84:iconst_1        
		//   42   85:iadd            
		//   43   86:istore_2        
			} while(true);
		//   44   87:goto            49
			if(k != -1)
		//*  45   90:iload_3         
		//*  46   91:iconst_m1       
		//*  47   92:icmpeq          127
			{
				FullSpanItem fullspanitem1 = (FullSpanItem)mFullSpanItems.get(k);
		//   48   95:aload_0         
		//   49   96:getfield        #29  <Field List mFullSpanItems>
		//   50   99:iload_3         
		//   51  100:invokeinterface #47  <Method Object List.get(int)>
		//   52  105:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//   53  108:astore          6
				mFullSpanItems.remove(k);
		//   54  110:aload_0         
		//   55  111:getfield        #29  <Field List mFullSpanItems>
		//   56  114:iload_3         
		//   57  115:invokeinterface #52  <Method Object List.remove(int)>
		//   58  120:pop             
				return fullspanitem1.mPosition;
		//   59  121:aload           6
		//   60  123:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//   61  126:ireturn         
			} else
			{
				return -1;
		//   62  127:iconst_m1       
		//   63  128:ireturn         
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
				Arrays.fill(mData, i, j + 1, -1);
		//   31   51:aload_0         
		//   32   52:getfield        #69  <Field int[] mData>
		//   33   55:iload_1         
		//   34   56:iload_2         
		//   35   57:iconst_1        
		//   36   58:iadd            
		//   37   59:iconst_m1       
		//   38   60:invokestatic    #95  <Method void Arrays.fill(int[], int, int, int)>
				return j + 1;
		//   39   63:iload_2         
		//   40   64:iconst_1        
		//   41   65:iadd            
		//   42   66:ireturn         
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
		//*  10   20:ifeq            28
				i = 1;
		//   11   23:iconst_1        
		//   12   24:istore_2        
			else
		//*  13   25:goto            30
				i = 0;
		//   14   28:iconst_0        
		//   15   29:istore_2        
			parcel.writeInt(i);
		//   16   30:aload_1         
		//   17   31:iload_2         
		//   18   32:invokevirtual   #94  <Method void Parcel.writeInt(int)>
			if(mGapPerSpan != null && mGapPerSpan.length > 0)
		//*  19   35:aload_0         
		//*  20   36:getfield        #48  <Field int[] mGapPerSpan>
		//*  21   39:ifnull          68
		//*  22   42:aload_0         
		//*  23   43:getfield        #48  <Field int[] mGapPerSpan>
		//*  24   46:arraylength     
		//*  25   47:ifle            68
			{
				parcel.writeInt(mGapPerSpan.length);
		//   26   50:aload_1         
		//   27   51:aload_0         
		//   28   52:getfield        #48  <Field int[] mGapPerSpan>
		//   29   55:arraylength     
		//   30   56:invokevirtual   #94  <Method void Parcel.writeInt(int)>
				parcel.writeIntArray(mGapPerSpan);
		//   31   59:aload_1         
		//   32   60:aload_0         
		//   33   61:getfield        #48  <Field int[] mGapPerSpan>
		//   34   64:invokevirtual   #97  <Method void Parcel.writeIntArray(int[])>
				return;
		//   35   67:return          
			} else
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
			boolean flag;
			if(parcel.readInt() == 1)
		//*  10   20:aload_1         
		//*  11   21:invokevirtual   #40  <Method int Parcel.readInt()>
		//*  12   24:iconst_1        
		//*  13   25:icmpne          33
				flag = true;
		//   14   28:iconst_1        
		//   15   29:istore_3        
			else
		//*  16   30:goto            35
				flag = false;
		//   17   33:iconst_0        
		//   18   34:istore_3        
			mHasUnwantedGapAfter = flag;
		//   19   35:aload_0         
		//   20   36:iload_3         
		//   21   37:putfield        #46  <Field boolean mHasUnwantedGapAfter>
			int i = parcel.readInt();
		//   22   40:aload_1         
		//   23   41:invokevirtual   #40  <Method int Parcel.readInt()>
		//   24   44:istore_2        
			if(i > 0)
		//*  25   45:iload_2         
		//*  26   46:ifle            64
			{
				mGapPerSpan = new int[i];
		//   27   49:aload_0         
		//   28   50:iload_2         
		//   29   51:newarray        int[]
		//   30   53:putfield        #48  <Field int[] mGapPerSpan>
				parcel.readIntArray(mGapPerSpan);
		//   31   56:aload_1         
		//   32   57:aload_0         
		//   33   58:getfield        #48  <Field int[] mGapPerSpan>
		//   34   61:invokevirtual   #52  <Method void Parcel.readIntArray(int[])>
			}
		//   35   64:return          
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
			parcel.writeInt(mAnchorPosition);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #51  <Field int mAnchorPosition>
		//    3    5:invokevirtual   #95  <Method void Parcel.writeInt(int)>
			parcel.writeInt(mVisibleAnchorPosition);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #53  <Field int mVisibleAnchorPosition>
		//    7   13:invokevirtual   #95  <Method void Parcel.writeInt(int)>
			parcel.writeInt(mSpanOffsetsSize);
		//    8   16:aload_1         
		//    9   17:aload_0         
		//   10   18:getfield        #55  <Field int mSpanOffsetsSize>
		//   11   21:invokevirtual   #95  <Method void Parcel.writeInt(int)>
			if(mSpanOffsetsSize > 0)
		//*  12   24:aload_0         
		//*  13   25:getfield        #55  <Field int mSpanOffsetsSize>
		//*  14   28:ifle            39
				parcel.writeIntArray(mSpanOffsets);
		//   15   31:aload_1         
		//   16   32:aload_0         
		//   17   33:getfield        #57  <Field int[] mSpanOffsets>
		//   18   36:invokevirtual   #98  <Method void Parcel.writeIntArray(int[])>
			parcel.writeInt(mSpanLookupSize);
		//   19   39:aload_1         
		//   20   40:aload_0         
		//   21   41:getfield        #63  <Field int mSpanLookupSize>
		//   22   44:invokevirtual   #95  <Method void Parcel.writeInt(int)>
			if(mSpanLookupSize > 0)
		//*  23   47:aload_0         
		//*  24   48:getfield        #63  <Field int mSpanLookupSize>
		//*  25   51:ifle            62
				parcel.writeIntArray(mSpanLookup);
		//   26   54:aload_1         
		//   27   55:aload_0         
		//   28   56:getfield        #65  <Field int[] mSpanLookup>
		//   29   59:invokevirtual   #98  <Method void Parcel.writeIntArray(int[])>
			if(mReverseLayout)
		//*  30   62:aload_0         
		//*  31   63:getfield        #67  <Field boolean mReverseLayout>
		//*  32   66:ifeq            74
				i = 1;
		//   33   69:iconst_1        
		//   34   70:istore_2        
			else
		//*  35   71:goto            76
				i = 0;
		//   36   74:iconst_0        
		//   37   75:istore_2        
			parcel.writeInt(i);
		//   38   76:aload_1         
		//   39   77:iload_2         
		//   40   78:invokevirtual   #95  <Method void Parcel.writeInt(int)>
			if(mAnchorLayoutFromEnd)
		//*  41   81:aload_0         
		//*  42   82:getfield        #69  <Field boolean mAnchorLayoutFromEnd>
		//*  43   85:ifeq            93
				i = 1;
		//   44   88:iconst_1        
		//   45   89:istore_2        
			else
		//*  46   90:goto            95
				i = 0;
		//   47   93:iconst_0        
		//   48   94:istore_2        
			parcel.writeInt(i);
		//   49   95:aload_1         
		//   50   96:iload_2         
		//   51   97:invokevirtual   #95  <Method void Parcel.writeInt(int)>
			if(mLastLayoutRTL)
		//*  52  100:aload_0         
		//*  53  101:getfield        #71  <Field boolean mLastLayoutRTL>
		//*  54  104:ifeq            112
				i = 1;
		//   55  107:iconst_1        
		//   56  108:istore_2        
			else
		//*  57  109:goto            114
				i = 0;
		//   58  112:iconst_0        
		//   59  113:istore_2        
			parcel.writeInt(i);
		//   60  114:aload_1         
		//   61  115:iload_2         
		//   62  116:invokevirtual   #95  <Method void Parcel.writeInt(int)>
			parcel.writeList(mFullSpanItems);
		//   63  119:aload_1         
		//   64  120:aload_0         
		//   65  121:getfield        #85  <Field List mFullSpanItems>
		//   66  124:invokevirtual   #102 <Method void Parcel.writeList(List)>
		//   67  127:return          
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
			boolean flag;
			if(parcel.readInt() == 1)
		//*  42   86:aload_1         
		//*  43   87:invokevirtual   #49  <Method int Parcel.readInt()>
		//*  44   90:iconst_1        
		//*  45   91:icmpne          99
				flag = true;
		//   46   94:iconst_1        
		//   47   95:istore_2        
			else
		//*  48   96:goto            101
				flag = false;
		//   49   99:iconst_0        
		//   50  100:istore_2        
			mReverseLayout = flag;
		//   51  101:aload_0         
		//   52  102:iload_2         
		//   53  103:putfield        #67  <Field boolean mReverseLayout>
			if(parcel.readInt() == 1)
		//*  54  106:aload_1         
		//*  55  107:invokevirtual   #49  <Method int Parcel.readInt()>
		//*  56  110:iconst_1        
		//*  57  111:icmpne          119
				flag = true;
		//   58  114:iconst_1        
		//   59  115:istore_2        
			else
		//*  60  116:goto            121
				flag = false;
		//   61  119:iconst_0        
		//   62  120:istore_2        
			mAnchorLayoutFromEnd = flag;
		//   63  121:aload_0         
		//   64  122:iload_2         
		//   65  123:putfield        #69  <Field boolean mAnchorLayoutFromEnd>
			if(parcel.readInt() == 1)
		//*  66  126:aload_1         
		//*  67  127:invokevirtual   #49  <Method int Parcel.readInt()>
		//*  68  130:iconst_1        
		//*  69  131:icmpne          139
				flag = true;
		//   70  134:iconst_1        
		//   71  135:istore_2        
			else
		//*  72  136:goto            141
				flag = false;
		//   73  139:iconst_0        
		//   74  140:istore_2        
			mLastLayoutRTL = flag;
		//   75  141:aload_0         
		//   76  142:iload_2         
		//   77  143:putfield        #71  <Field boolean mLastLayoutRTL>
			mFullSpanItems = ((List) (parcel.readArrayList(((Class) (android/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)).getClassLoader())));
		//   78  146:aload_0         
		//   79  147:aload_1         
		//   80  148:ldc1            #73  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//   81  150:invokevirtual   #79  <Method ClassLoader Class.getClassLoader()>
		//   82  153:invokevirtual   #83  <Method ArrayList Parcel.readArrayList(ClassLoader)>
		//   83  156:putfield        #85  <Field List mFullSpanItems>
		//   84  159:return          
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
			if(j > i)
		//*  10   24:iload_2         
		//*  11   25:iload_1         
		//*  12   26:icmple          35
				byte0 = 1;
		//   13   29:iconst_1        
		//   14   30:istore          7
			else
		//*  15   32:goto            38
				byte0 = -1;
		//   16   35:iconst_m1       
		//   17   36:istore          7
			for(int k = i; k != j; k += ((int) (byte0)))
		//*  18   38:iload_1         
		//*  19   39:istore          8
		//*  20   41:iload           8
		//*  21   43:iload_2         
		//*  22   44:icmpeq          256
			{
				View view = (View)mViews.get(k);
		//   23   47:aload_0         
		//   24   48:getfield        #31  <Field ArrayList mViews>
		//   25   51:iload           8
		//   26   53:invokevirtual   #100 <Method Object ArrayList.get(int)>
		//   27   56:checkcast       #102 <Class View>
		//   28   59:astore          13
				int j1 = mPrimaryOrientation.getDecoratedStart(view);
		//   29   61:aload_0         
		//   30   62:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//   31   65:getfield        #71  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//   32   68:aload           13
		//   33   70:invokevirtual   #134 <Method int OrientationHelper.getDecoratedStart(View)>
		//   34   73:istore          11
				int k1 = mPrimaryOrientation.getDecoratedEnd(view);
		//   35   75:aload_0         
		//   36   76:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//   37   79:getfield        #71  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//   38   82:aload           13
		//   39   84:invokevirtual   #105 <Method int OrientationHelper.getDecoratedEnd(View)>
		//   40   87:istore          12
				if(flag2)
		//*  41   89:iload           5
		//*  42   91:ifeq            111
				{
					if(j1 <= i1)
		//*  43   94:iload           11
		//*  44   96:iload           10
		//*  45   98:icmpgt          106
						i = 1;
		//   46  101:iconst_1        
		//   47  102:istore_1        
					else
		//*  48  103:goto            125
						i = 0;
		//   49  106:iconst_0        
		//   50  107:istore_1        
				} else
		//*  51  108:goto            125
				if(j1 < i1)
		//*  52  111:iload           11
		//*  53  113:iload           10
		//*  54  115:icmpge          123
					i = 1;
		//   55  118:iconst_1        
		//   56  119:istore_1        
				else
		//*  57  120:goto            125
					i = 0;
		//   58  123:iconst_0        
		//   59  124:istore_1        
				boolean flag3;
				if(flag2)
		//*  60  125:iload           5
		//*  61  127:ifeq            149
				{
					if(k1 >= l)
		//*  62  130:iload           12
		//*  63  132:iload           9
		//*  64  134:icmplt          143
						flag3 = true;
		//   65  137:iconst_1        
		//   66  138:istore          6
					else
		//*  67  140:goto            165
						flag3 = false;
		//   68  143:iconst_0        
		//   69  144:istore          6
				} else
		//*  70  146:goto            165
				if(k1 > l)
		//*  71  149:iload           12
		//*  72  151:iload           9
		//*  73  153:icmple          162
					flag3 = true;
		//   74  156:iconst_1        
		//   75  157:istore          6
				else
		//*  76  159:goto            165
					flag3 = false;
		//   77  162:iconst_0        
		//   78  163:istore          6
				if(i == 0 || !flag3)
					continue;
		//   79  165:iload_1         
		//   80  166:ifeq            246
		//   81  169:iload           6
		//   82  171:ifeq            246
				if(flag && flag1)
		//*  83  174:iload_3         
		//*  84  175:ifeq            207
		//*  85  178:iload           4
		//*  86  180:ifeq            207
				{
					if(j1 >= l && k1 <= i1)
		//*  87  183:iload           11
		//*  88  185:iload           9
		//*  89  187:icmplt          246
		//*  90  190:iload           12
		//*  91  192:iload           10
		//*  92  194:icmpgt          246
						return getPosition(view);
		//   93  197:aload_0         
		//   94  198:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//   95  201:aload           13
		//   96  203:invokevirtual   #159 <Method int StaggeredGridLayoutManager.getPosition(View)>
		//   97  206:ireturn         
					continue;
				}
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
		//* 120  253:goto            41
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
			View view1 = null;
		//    0    0:aconst_null     
		//    1    1:astore          5
			View view = null;
		//    2    3:aconst_null     
		//    3    4:astore          4
			if(j == -1)
		//*   4    6:iload_2         
		//*   5    7:iconst_m1       
		//*   6    8:icmpne          110
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
					if(j >= k)
						break;
		//   13   21:iload_2         
		//   14   22:iload_3         
		//   15   23:icmpge          107
					view1 = (View)mViews.get(j);
		//   16   26:aload_0         
		//   17   27:getfield        #31  <Field ArrayList mViews>
		//   18   30:iload_2         
		//   19   31:invokevirtual   #100 <Method Object ArrayList.get(int)>
		//   20   34:checkcast       #102 <Class View>
		//   21   37:astore          5
					if(mReverseLayout && getPosition(view1) <= i || !mReverseLayout && getPosition(view1) >= i || !view1.hasFocusable())
						break;
		//   22   39:aload_0         
		//   23   40:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//   24   43:getfield        #142 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
		//   25   46:ifeq            62
		//   26   49:aload_0         
		//   27   50:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//   28   53:aload           5
		//   29   55:invokevirtual   #159 <Method int StaggeredGridLayoutManager.getPosition(View)>
		//   30   58:iload_1         
		//   31   59:icmple          107
		//   32   62:aload_0         
		//   33   63:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//   34   66:getfield        #142 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
		//   35   69:ifne            88
		//   36   72:aload_0         
		//   37   73:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//   38   76:aload           5
		//   39   78:invokevirtual   #159 <Method int StaggeredGridLayoutManager.getPosition(View)>
		//   40   81:iload_1         
		//   41   82:icmplt          88
		//   42   85:goto            107
		//   43   88:aload           5
		//   44   90:invokevirtual   #169 <Method boolean View.hasFocusable()>
		//   45   93:ifeq            107
					view = view1;
		//   46   96:aload           5
		//   47   98:astore          4
					j++;
		//   48  100:iload_2         
		//   49  101:iconst_1        
		//   50  102:iadd            
		//   51  103:istore_2        
				} while(true);
		//   52  104:goto            21
				return view;
		//   53  107:aload           4
		//   54  109:areturn         
			}
			j = mViews.size() - 1;
		//   55  110:aload_0         
		//   56  111:getfield        #31  <Field ArrayList mViews>
		//   57  114:invokevirtual   #60  <Method int ArrayList.size()>
		//   58  117:iconst_1        
		//   59  118:isub            
		//   60  119:istore_2        
			view = view1;
		//   61  120:aload           5
		//   62  122:astore          4
			do
			{
				if(j < 0)
					break;
		//   63  124:iload_2         
		//   64  125:iflt            209
				View view2 = (View)mViews.get(j);
		//   65  128:aload_0         
		//   66  129:getfield        #31  <Field ArrayList mViews>
		//   67  132:iload_2         
		//   68  133:invokevirtual   #100 <Method Object ArrayList.get(int)>
		//   69  136:checkcast       #102 <Class View>
		//   70  139:astore          5
				if(mReverseLayout && getPosition(view2) >= i)
					break;
		//   71  141:aload_0         
		//   72  142:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//   73  145:getfield        #142 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
		//   74  148:ifeq            164
		//   75  151:aload_0         
		//   76  152:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//   77  155:aload           5
		//   78  157:invokevirtual   #159 <Method int StaggeredGridLayoutManager.getPosition(View)>
		//   79  160:iload_1         
		//   80  161:icmpge          209
				if(!mReverseLayout && getPosition(view2) <= i)
		//*  81  164:aload_0         
		//*  82  165:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//*  83  168:getfield        #142 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
		//*  84  171:ifne            190
		//*  85  174:aload_0         
		//*  86  175:getfield        #23  <Field StaggeredGridLayoutManager this$0>
		//*  87  178:aload           5
		//*  88  180:invokevirtual   #159 <Method int StaggeredGridLayoutManager.getPosition(View)>
		//*  89  183:iload_1         
		//*  90  184:icmpgt          190
					return view;
		//   91  187:aload           4
		//   92  189:areturn         
				if(!view2.hasFocusable())
					break;
		//   93  190:aload           5
		//   94  192:invokevirtual   #169 <Method boolean View.hasFocusable()>
		//   95  195:ifeq            209
				view = view2;
		//   96  198:aload           5
		//   97  200:astore          4
				j--;
		//   98  202:iload_2         
		//   99  203:iconst_1        
		//  100  204:isub            
		//  101  205:istore_2        
			} while(true);
		//  102  206:goto            124
			return view;
		//  103  209:aload           4
		//  104  211:areturn         
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
		boolean flag;
		if(mGapStrategy != 0)
	//*  54  101:aload_0         
	//*  55  102:getfield        #106 <Field int mGapStrategy>
	//*  56  105:ifeq            113
			flag = true;
	//   57  108:iconst_1        
	//   58  109:istore_3        
		else
	//*  59  110:goto            115
			flag = false;
	//   60  113:iconst_0        
	//   61  114:istore_3        
		setAutoMeasureEnabled(flag);
	//   62  115:aload_0         
	//   63  116:iload_3         
	//   64  117:invokevirtual   #133 <Method void setAutoMeasureEnabled(boolean)>
		mLayoutState = new LayoutState();
	//   65  120:aload_0         
	//   66  121:new             #135 <Class LayoutState>
	//   67  124:dup             
	//   68  125:invokespecial   #136 <Method void LayoutState()>
	//   69  128:putfield        #138 <Field LayoutState mLayoutState>
		createOrientationHelpers();
	//   70  131:aload_0         
	//   71  132:invokespecial   #141 <Method void createOrientationHelpers()>
	//   72  135:return          
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
	//   52   96:invokestatic    #147 <Method RecyclerView$LayoutManager$Properties getProperties(Context, AttributeSet, int, int)>
	//   53   99:astore_1        
		setOrientation(((RecyclerView.LayoutManager.Properties) (context)).orientation);
	//   54  100:aload_0         
	//   55  101:aload_1         
	//   56  102:getfield        #152 <Field int RecyclerView$LayoutManager$Properties.orientation>
	//   57  105:invokevirtual   #155 <Method void setOrientation(int)>
		setSpanCount(((RecyclerView.LayoutManager.Properties) (context)).spanCount);
	//   58  108:aload_0         
	//   59  109:aload_1         
	//   60  110:getfield        #158 <Field int RecyclerView$LayoutManager$Properties.spanCount>
	//   61  113:invokevirtual   #129 <Method void setSpanCount(int)>
		setReverseLayout(((RecyclerView.LayoutManager.Properties) (context)).reverseLayout);
	//   62  116:aload_0         
	//   63  117:aload_1         
	//   64  118:getfield        #161 <Field boolean RecyclerView$LayoutManager$Properties.reverseLayout>
	//   65  121:invokevirtual   #164 <Method void setReverseLayout(boolean)>
		boolean flag;
		if(mGapStrategy != 0)
	//*  66  124:aload_0         
	//*  67  125:getfield        #106 <Field int mGapStrategy>
	//*  68  128:ifeq            137
			flag = true;
	//   69  131:iconst_1        
	//   70  132:istore          5
		else
	//*  71  134:goto            140
			flag = false;
	//   72  137:iconst_0        
	//   73  138:istore          5
		setAutoMeasureEnabled(flag);
	//   74  140:aload_0         
	//   75  141:iload           5
	//   76  143:invokevirtual   #133 <Method void setAutoMeasureEnabled(boolean)>
		mLayoutState = new LayoutState();
	//   77  146:aload_0         
	//   78  147:new             #135 <Class LayoutState>
	//   79  150:dup             
	//   80  151:invokespecial   #136 <Method void LayoutState()>
	//   81  154:putfield        #138 <Field LayoutState mLayoutState>
		createOrientationHelpers();
	//   82  157:aload_0         
	//   83  158:invokespecial   #141 <Method void createOrientationHelpers()>
	//   84  161:return          
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
	//*   3    7:ifle            140
			if(mPendingSavedState.mSpanOffsetsSize == mSpanCount)
	//*   4   10:aload_0         
	//*   5   11:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*   6   14:getfield        #178 <Field int StaggeredGridLayoutManager$SavedState.mSpanOffsetsSize>
	//*   7   17:aload_0         
	//*   8   18:getfield        #93  <Field int mSpanCount>
	//*   9   21:icmpne          119
			{
				for(int j = 0; j < mSpanCount; j++)
	//*  10   24:iconst_0        
	//*  11   25:istore_3        
	//*  12   26:iload_3         
	//*  13   27:aload_0         
	//*  14   28:getfield        #93  <Field int mSpanCount>
	//*  15   31:icmpge          116
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
	//*  31   61:icmpeq          99
						if(mPendingSavedState.mAnchorLayoutFromEnd)
	//*  32   64:aload_0         
	//*  33   65:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  34   68:getfield        #187 <Field boolean StaggeredGridLayoutManager$SavedState.mAnchorLayoutFromEnd>
	//*  35   71:ifeq            88
							i = k + mPrimaryOrientation.getEndAfterPadding();
	//   36   74:iload           4
	//   37   76:aload_0         
	//   38   77:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   39   80:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//   40   83:iadd            
	//   41   84:istore_2        
						else
	//*  42   85:goto            99
							i = k + mPrimaryOrientation.getStartAfterPadding();
	//   43   88:iload           4
	//   44   90:aload_0         
	//   45   91:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   46   94:invokevirtual   #198 <Method int OrientationHelper.getStartAfterPadding()>
	//   47   97:iadd            
	//   48   98:istore_2        
					mSpans[j].setLine(i);
	//   49   99:aload_0         
	//   50  100:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   51  103:iload_3         
	//   52  104:aaload          
	//   53  105:iload_2         
	//   54  106:invokevirtual   #201 <Method void StaggeredGridLayoutManager$Span.setLine(int)>
				}

	//   55  109:iload_3         
	//   56  110:iconst_1        
	//   57  111:iadd            
	//   58  112:istore_3        
			} else
	//*  59  113:goto            26
	//*  60  116:goto            140
			{
				mPendingSavedState.invalidateSpanInfo();
	//   61  119:aload_0         
	//   62  120:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   63  123:invokevirtual   #204 <Method void StaggeredGridLayoutManager$SavedState.invalidateSpanInfo()>
				mPendingSavedState.mAnchorPosition = mPendingSavedState.mVisibleAnchorPosition;
	//   64  126:aload_0         
	//   65  127:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   66  130:aload_0         
	//   67  131:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   68  134:getfield        #207 <Field int StaggeredGridLayoutManager$SavedState.mVisibleAnchorPosition>
	//   69  137:putfield        #210 <Field int StaggeredGridLayoutManager$SavedState.mAnchorPosition>
			}
		mLastLayoutRTL = mPendingSavedState.mLastLayoutRTL;
	//   70  140:aload_0         
	//   71  141:aload_0         
	//   72  142:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   73  145:getfield        #212 <Field boolean StaggeredGridLayoutManager$SavedState.mLastLayoutRTL>
	//   74  148:putfield        #213 <Field boolean mLastLayoutRTL>
		setReverseLayout(mPendingSavedState.mReverseLayout);
	//   75  151:aload_0         
	//   76  152:aload_0         
	//   77  153:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   78  156:getfield        #214 <Field boolean StaggeredGridLayoutManager$SavedState.mReverseLayout>
	//   79  159:invokevirtual   #164 <Method void setReverseLayout(boolean)>
		resolveShouldLayoutReverse();
	//   80  162:aload_0         
	//   81  163:invokespecial   #217 <Method void resolveShouldLayoutReverse()>
		if(mPendingSavedState.mAnchorPosition != -1)
	//*  82  166:aload_0         
	//*  83  167:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  84  170:getfield        #210 <Field int StaggeredGridLayoutManager$SavedState.mAnchorPosition>
	//*  85  173:iconst_m1       
	//*  86  174:icmpeq          202
		{
			mPendingScrollPosition = mPendingSavedState.mAnchorPosition;
	//   87  177:aload_0         
	//   88  178:aload_0         
	//   89  179:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   90  182:getfield        #210 <Field int StaggeredGridLayoutManager$SavedState.mAnchorPosition>
	//   91  185:putfield        #99  <Field int mPendingScrollPosition>
			anchorinfo.mLayoutFromEnd = mPendingSavedState.mAnchorLayoutFromEnd;
	//   92  188:aload_1         
	//   93  189:aload_0         
	//   94  190:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   95  193:getfield        #187 <Field boolean StaggeredGridLayoutManager$SavedState.mAnchorLayoutFromEnd>
	//   96  196:putfield        #220 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
		} else
	//*  97  199:goto            210
		{
			anchorinfo.mLayoutFromEnd = mShouldReverseLayout;
	//   98  202:aload_1         
	//   99  203:aload_0         
	//  100  204:getfield        #97  <Field boolean mShouldReverseLayout>
	//  101  207:putfield        #220 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
		}
		if(mPendingSavedState.mSpanLookupSize > 1)
	//* 102  210:aload_0         
	//* 103  211:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//* 104  214:getfield        #223 <Field int StaggeredGridLayoutManager$SavedState.mSpanLookupSize>
	//* 105  217:iconst_1        
	//* 106  218:icmple          249
		{
			mLazySpanLookup.mData = mPendingSavedState.mSpanLookup;
	//  107  221:aload_0         
	//  108  222:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//  109  225:aload_0         
	//  110  226:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//  111  229:getfield        #226 <Field int[] StaggeredGridLayoutManager$SavedState.mSpanLookup>
	//  112  232:putfield        #229 <Field int[] StaggeredGridLayoutManager$LazySpanLookup.mData>
			mLazySpanLookup.mFullSpanItems = mPendingSavedState.mFullSpanItems;
	//  113  235:aload_0         
	//  114  236:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//  115  239:aload_0         
	//  116  240:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//  117  243:getfield        #233 <Field List StaggeredGridLayoutManager$SavedState.mFullSpanItems>
	//  118  246:putfield        #234 <Field List StaggeredGridLayoutManager$LazySpanLookup.mFullSpanItems>
		}
	//  119  249:return          
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
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #259 <Method int getChildCount()>
	//*   2    4:ifne            18
			return !mShouldReverseLayout ? -1 : 1;
	//    3    7:aload_0         
	//    4    8:getfield        #97  <Field boolean mShouldReverseLayout>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_m1       
	//    9   17:ireturn         
		boolean flag;
		if(i < getFirstChildPosition())
	//*  10   18:iload_1         
	//*  11   19:aload_0         
	//*  12   20:invokevirtual   #262 <Method int getFirstChildPosition()>
	//*  13   23:icmpge          31
			flag = true;
	//   14   26:iconst_1        
	//   15   27:istore_2        
		else
	//*  16   28:goto            33
			flag = false;
	//   17   31:iconst_0        
	//   18   32:istore_2        
		return flag == mShouldReverseLayout ? 1 : -1;
	//   19   33:iload_2         
	//   20   34:aload_0         
	//   21   35:getfield        #97  <Field boolean mShouldReverseLayout>
	//   22   38:icmpeq          43
	//   23   41:iconst_m1       
	//   24   42:ireturn         
	//   25   43:iconst_1        
	//   26   44:ireturn         
	}

	private boolean checkSpanForGap(Span span)
	{
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            54
		{
			if(span.getEndLine() < mPrimaryOrientation.getEndAfterPadding())
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #267 <Method int StaggeredGridLayoutManager$Span.getEndLine()>
	//*   5   11:aload_0         
	//*   6   12:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//*   7   15:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//*   8   18:icmpge          93
				return !span.getLayoutParams((View)span.mViews.get(span.mViews.size() - 1)).mFullSpan;
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
	//   22   50:iconst_1        
	//   23   51:ireturn         
	//   24   52:iconst_0        
	//   25   53:ireturn         
		} else
		if(span.getStartLine() > mPrimaryOrientation.getStartAfterPadding())
	//*  26   54:aload_1         
	//*  27   55:invokevirtual   #289 <Method int StaggeredGridLayoutManager$Span.getStartLine()>
	//*  28   58:aload_0         
	//*  29   59:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//*  30   62:invokevirtual   #198 <Method int OrientationHelper.getStartAfterPadding()>
	//*  31   65:icmple          93
			return !span.getLayoutParams((View)span.mViews.get(0)).mFullSpan;
	//   32   68:aload_1         
	//   33   69:aload_1         
	//   34   70:getfield        #271 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//   35   73:iconst_0        
	//   36   74:invokevirtual   #280 <Method Object ArrayList.get(int)>
	//   37   77:checkcast       #282 <Class View>
	//   38   80:invokevirtual   #286 <Method StaggeredGridLayoutManager$LayoutParams StaggeredGridLayoutManager$Span.getLayoutParams(View)>
	//   39   83:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//   40   86:ifne            91
	//   41   89:iconst_1        
	//   42   90:ireturn         
	//   43   91:iconst_0        
	//   44   92:ireturn         
		return false;
	//   45   93:iconst_0        
	//   46   94:ireturn         
	}

	private int computeScrollExtent(RecyclerView.State state)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #259 <Method int getChildCount()>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		OrientationHelper orientationhelper = mPrimaryOrientation;
	//    5    9:aload_0         
	//    6   10:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//    7   13:astore_3        
		boolean flag;
		if(!mSmoothScrollbarEnabled)
	//*   8   14:aload_0         
	//*   9   15:getfield        #120 <Field boolean mSmoothScrollbarEnabled>
	//*  10   18:ifne            26
			flag = true;
	//   11   21:iconst_1        
	//   12   22:istore_2        
		else
	//*  13   23:goto            28
			flag = false;
	//   14   26:iconst_0        
	//   15   27:istore_2        
		View view = findFirstVisibleItemClosestToStart(flag);
	//   16   28:aload_0         
	//   17   29:iload_2         
	//   18   30:invokevirtual   #295 <Method View findFirstVisibleItemClosestToStart(boolean)>
	//   19   33:astore          4
		if(!mSmoothScrollbarEnabled)
	//*  20   35:aload_0         
	//*  21   36:getfield        #120 <Field boolean mSmoothScrollbarEnabled>
	//*  22   39:ifne            47
			flag = true;
	//   23   42:iconst_1        
	//   24   43:istore_2        
		else
	//*  25   44:goto            49
			flag = false;
	//   26   47:iconst_0        
	//   27   48:istore_2        
		return ScrollbarHelper.computeScrollExtent(state, orientationhelper, view, findFirstVisibleItemClosestToEnd(flag), ((RecyclerView.LayoutManager) (this)), mSmoothScrollbarEnabled);
	//   28   49:aload_1         
	//   29   50:aload_3         
	//   30   51:aload           4
	//   31   53:aload_0         
	//   32   54:iload_2         
	//   33   55:invokevirtual   #298 <Method View findFirstVisibleItemClosestToEnd(boolean)>
	//   34   58:aload_0         
	//   35   59:aload_0         
	//   36   60:getfield        #120 <Field boolean mSmoothScrollbarEnabled>
	//   37   63:invokestatic    #303 <Method int ScrollbarHelper.computeScrollExtent(RecyclerView$State, OrientationHelper, View, View, RecyclerView$LayoutManager, boolean)>
	//   38   66:ireturn         
	}

	private int computeScrollOffset(RecyclerView.State state)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #259 <Method int getChildCount()>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		OrientationHelper orientationhelper = mPrimaryOrientation;
	//    5    9:aload_0         
	//    6   10:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//    7   13:astore_3        
		boolean flag;
		if(!mSmoothScrollbarEnabled)
	//*   8   14:aload_0         
	//*   9   15:getfield        #120 <Field boolean mSmoothScrollbarEnabled>
	//*  10   18:ifne            26
			flag = true;
	//   11   21:iconst_1        
	//   12   22:istore_2        
		else
	//*  13   23:goto            28
			flag = false;
	//   14   26:iconst_0        
	//   15   27:istore_2        
		View view = findFirstVisibleItemClosestToStart(flag);
	//   16   28:aload_0         
	//   17   29:iload_2         
	//   18   30:invokevirtual   #295 <Method View findFirstVisibleItemClosestToStart(boolean)>
	//   19   33:astore          4
		if(!mSmoothScrollbarEnabled)
	//*  20   35:aload_0         
	//*  21   36:getfield        #120 <Field boolean mSmoothScrollbarEnabled>
	//*  22   39:ifne            47
			flag = true;
	//   23   42:iconst_1        
	//   24   43:istore_2        
		else
	//*  25   44:goto            49
			flag = false;
	//   26   47:iconst_0        
	//   27   48:istore_2        
		return ScrollbarHelper.computeScrollOffset(state, orientationhelper, view, findFirstVisibleItemClosestToEnd(flag), ((RecyclerView.LayoutManager) (this)), mSmoothScrollbarEnabled, mShouldReverseLayout);
	//   28   49:aload_1         
	//   29   50:aload_3         
	//   30   51:aload           4
	//   31   53:aload_0         
	//   32   54:iload_2         
	//   33   55:invokevirtual   #298 <Method View findFirstVisibleItemClosestToEnd(boolean)>
	//   34   58:aload_0         
	//   35   59:aload_0         
	//   36   60:getfield        #120 <Field boolean mSmoothScrollbarEnabled>
	//   37   63:aload_0         
	//   38   64:getfield        #97  <Field boolean mShouldReverseLayout>
	//   39   67:invokestatic    #307 <Method int ScrollbarHelper.computeScrollOffset(RecyclerView$State, OrientationHelper, View, View, RecyclerView$LayoutManager, boolean, boolean)>
	//   40   70:ireturn         
	}

	private int computeScrollRange(RecyclerView.State state)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #259 <Method int getChildCount()>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		OrientationHelper orientationhelper = mPrimaryOrientation;
	//    5    9:aload_0         
	//    6   10:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//    7   13:astore_3        
		boolean flag;
		if(!mSmoothScrollbarEnabled)
	//*   8   14:aload_0         
	//*   9   15:getfield        #120 <Field boolean mSmoothScrollbarEnabled>
	//*  10   18:ifne            26
			flag = true;
	//   11   21:iconst_1        
	//   12   22:istore_2        
		else
	//*  13   23:goto            28
			flag = false;
	//   14   26:iconst_0        
	//   15   27:istore_2        
		View view = findFirstVisibleItemClosestToStart(flag);
	//   16   28:aload_0         
	//   17   29:iload_2         
	//   18   30:invokevirtual   #295 <Method View findFirstVisibleItemClosestToStart(boolean)>
	//   19   33:astore          4
		if(!mSmoothScrollbarEnabled)
	//*  20   35:aload_0         
	//*  21   36:getfield        #120 <Field boolean mSmoothScrollbarEnabled>
	//*  22   39:ifne            47
			flag = true;
	//   23   42:iconst_1        
	//   24   43:istore_2        
		else
	//*  25   44:goto            49
			flag = false;
	//   26   47:iconst_0        
	//   27   48:istore_2        
		return ScrollbarHelper.computeScrollRange(state, orientationhelper, view, findFirstVisibleItemClosestToEnd(flag), ((RecyclerView.LayoutManager) (this)), mSmoothScrollbarEnabled);
	//   28   49:aload_1         
	//   29   50:aload_3         
	//   30   51:aload           4
	//   31   53:aload_0         
	//   32   54:iload_2         
	//   33   55:invokevirtual   #298 <Method View findFirstVisibleItemClosestToEnd(boolean)>
	//   34   58:aload_0         
	//   35   59:aload_0         
	//   36   60:getfield        #120 <Field boolean mSmoothScrollbarEnabled>
	//   37   63:invokestatic    #310 <Method int ScrollbarHelper.computeScrollRange(RecyclerView$State, OrientationHelper, View, View, RecyclerView$LayoutManager, boolean)>
	//   38   66:ireturn         
	}

	private int convertFocusDirectionToLayoutDirection(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    6: default 60
	//	               1: 63
	//	               2: 84
	//	               17: 131
	//	               33: 105
	//	               66: 143
	//	               130: 118
	//*   2   60:goto            155
		case 1: // '\001'
			if(mOrientation == 1)
	//*   3   63:aload_0         
	//*   4   64:getfield        #125 <Field int mOrientation>
	//*   5   67:iconst_1        
	//*   6   68:icmpne          73
				return -1;
	//    7   71:iconst_m1       
	//    8   72:ireturn         
			return !isLayoutRTL() ? -1 : 1;
	//    9   73:aload_0         
	//   10   74:invokevirtual   #315 <Method boolean isLayoutRTL()>
	//   11   77:ifeq            82
	//   12   80:iconst_1        
	//   13   81:ireturn         
	//   14   82:iconst_m1       
	//   15   83:ireturn         

		case 2: // '\002'
			if(mOrientation == 1)
	//*  16   84:aload_0         
	//*  17   85:getfield        #125 <Field int mOrientation>
	//*  18   88:iconst_1        
	//*  19   89:icmpne          94
				return 1;
	//   20   92:iconst_1        
	//   21   93:ireturn         
			return !isLayoutRTL() ? 1 : -1;
	//   22   94:aload_0         
	//   23   95:invokevirtual   #315 <Method boolean isLayoutRTL()>
	//   24   98:ifeq            103
	//   25  101:iconst_m1       
	//   26  102:ireturn         
	//   27  103:iconst_1        
	//   28  104:ireturn         

		case 33: // '!'
			return mOrientation != 1 ? 0x80000000 : -1;
	//   29  105:aload_0         
	//   30  106:getfield        #125 <Field int mOrientation>
	//   31  109:iconst_1        
	//   32  110:icmpne          115
	//   33  113:iconst_m1       
	//   34  114:ireturn         
	//   35  115:ldc1            #43  <Int 0x80000000>
	//   36  117:ireturn         

		case 130: 
			return mOrientation != 1 ? 0x80000000 : 1;
	//   37  118:aload_0         
	//   38  119:getfield        #125 <Field int mOrientation>
	//   39  122:iconst_1        
	//   40  123:icmpne          128
	//   41  126:iconst_1        
	//   42  127:ireturn         
	//   43  128:ldc1            #43  <Int 0x80000000>
	//   44  130:ireturn         

		case 17: // '\021'
			return mOrientation != 0 ? 0x80000000 : -1;
	//   45  131:aload_0         
	//   46  132:getfield        #125 <Field int mOrientation>
	//   47  135:ifne            140
	//   48  138:iconst_m1       
	//   49  139:ireturn         
	//   50  140:ldc1            #43  <Int 0x80000000>
	//   51  142:ireturn         

		case 66: // 'B'
			return mOrientation != 0 ? 0x80000000 : 1;
	//   52  143:aload_0         
	//   53  144:getfield        #125 <Field int mOrientation>
	//   54  147:ifne            152
	//   55  150:iconst_1        
	//   56  151:ireturn         
	//   57  152:ldc1            #43  <Int 0x80000000>
	//   58  154:ireturn         
		}
		return 0x80000000;
	//   59  155:ldc1            #43  <Int 0x80000000>
	//   60  157:ireturn         
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
		if(mLayoutState.mInfinite)
	//*   7   13:aload_0         
	//*   8   14:getfield        #138 <Field LayoutState mLayoutState>
	//*   9   17:getfield        #345 <Field boolean LayoutState.mInfinite>
	//*  10   20:ifeq            46
		{
			if(layoutstate.mLayoutDirection == 1)
	//*  11   23:aload_2         
	//*  12   24:getfield        #239 <Field int LayoutState.mLayoutDirection>
	//*  13   27:iconst_1        
	//*  14   28:icmpne          39
				i = 0x7fffffff;
	//   15   31:ldc2            #346 <Int 0x7fffffff>
	//   16   34:istore          4
			else
	//*  17   36:goto            79
				i = 0x80000000;
	//   18   39:ldc1            #43  <Int 0x80000000>
	//   19   41:istore          4
		} else
	//*  20   43:goto            79
		if(layoutstate.mLayoutDirection == 1)
	//*  21   46:aload_2         
	//*  22   47:getfield        #239 <Field int LayoutState.mLayoutDirection>
	//*  23   50:iconst_1        
	//*  24   51:icmpne          68
			i = layoutstate.mEndLine + layoutstate.mAvailable;
	//   25   54:aload_2         
	//   26   55:getfield        #349 <Field int LayoutState.mEndLine>
	//   27   58:aload_2         
	//   28   59:getfield        #352 <Field int LayoutState.mAvailable>
	//   29   62:iadd            
	//   30   63:istore          4
		else
	//*  31   65:goto            79
			i = layoutstate.mStartLine - layoutstate.mAvailable;
	//   32   68:aload_2         
	//   33   69:getfield        #355 <Field int LayoutState.mStartLine>
	//   34   72:aload_2         
	//   35   73:getfield        #352 <Field int LayoutState.mAvailable>
	//   36   76:isub            
	//   37   77:istore          4
		updateAllRemainingSpans(layoutstate.mLayoutDirection, i);
	//   38   79:aload_0         
	//   39   80:aload_2         
	//   40   81:getfield        #239 <Field int LayoutState.mLayoutDirection>
	//   41   84:iload           4
	//   42   86:invokespecial   #358 <Method void updateAllRemainingSpans(int, int)>
		int k;
		if(mShouldReverseLayout)
	//*  43   89:aload_0         
	//*  44   90:getfield        #97  <Field boolean mShouldReverseLayout>
	//*  45   93:ifeq            108
			k = mPrimaryOrientation.getEndAfterPadding();
	//   46   96:aload_0         
	//   47   97:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   48  100:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//   49  103:istore          6
		else
	//*  50  105:goto            117
			k = mPrimaryOrientation.getStartAfterPadding();
	//   51  108:aload_0         
	//   52  109:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   53  112:invokevirtual   #198 <Method int OrientationHelper.getStartAfterPadding()>
	//   54  115:istore          6
		int j;
		for(j = 0; layoutstate.hasMore(state) && (mLayoutState.mInfinite || !mRemainingSpans.isEmpty()); j = 1)
	//*  55  117:iconst_0        
	//*  56  118:istore          5
	//*  57  120:aload_2         
	//*  58  121:aload_3         
	//*  59  122:invokevirtual   #362 <Method boolean LayoutState.hasMore(RecyclerView$State)>
	//*  60  125:ifeq            917
	//*  61  128:aload_0         
	//*  62  129:getfield        #138 <Field LayoutState mLayoutState>
	//*  63  132:getfield        #345 <Field boolean LayoutState.mInfinite>
	//*  64  135:ifne            148
	//*  65  138:aload_0         
	//*  66  139:getfield        #336 <Field BitSet mRemainingSpans>
	//*  67  142:invokevirtual   #365 <Method boolean BitSet.isEmpty()>
	//*  68  145:ifne            917
		{
			View view = layoutstate.next(recycler);
	//   69  148:aload_2         
	//   70  149:aload_1         
	//   71  150:invokevirtual   #369 <Method View LayoutState.next(RecyclerView$Recycler)>
	//   72  153:astore          13
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   73  155:aload           13
	//   74  157:invokevirtual   #372 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   75  160:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//   76  163:astore          14
			int j2 = layoutparams.getViewLayoutPosition();
	//   77  165:aload           14
	//   78  167:invokevirtual   #375 <Method int StaggeredGridLayoutManager$LayoutParams.getViewLayoutPosition()>
	//   79  170:istore          11
			j = mLazySpanLookup.getSpan(j2);
	//   80  172:aload_0         
	//   81  173:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   82  176:iload           11
	//   83  178:invokevirtual   #378 <Method int StaggeredGridLayoutManager$LazySpanLookup.getSpan(int)>
	//   84  181:istore          5
			boolean flag;
			if(j == -1)
	//*  85  183:iload           5
	//*  86  185:iconst_m1       
	//*  87  186:icmpne          195
				flag = true;
	//   88  189:iconst_1        
	//   89  190:istore          9
			else
	//*  90  192:goto            198
				flag = false;
	//   91  195:iconst_0        
	//   92  196:istore          9
			Span span;
			if(flag)
	//*  93  198:iload           9
	//*  94  200:ifeq            243
			{
				if(layoutparams.mFullSpan)
	//*  95  203:aload           14
	//*  96  205:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*  97  208:ifeq            222
					span = mSpans[0];
	//   98  211:aload_0         
	//   99  212:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  100  215:iconst_0        
	//  101  216:aaload          
	//  102  217:astore          12
				else
	//* 103  219:goto            229
					span = getNextSpan(layoutstate);
	//  104  222:aload_0         
	//  105  223:aload_2         
	//  106  224:invokespecial   #382 <Method StaggeredGridLayoutManager$Span getNextSpan(LayoutState)>
	//  107  227:astore          12
				mLazySpanLookup.setSpan(j2, span);
	//  108  229:aload_0         
	//  109  230:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//  110  233:iload           11
	//  111  235:aload           12
	//  112  237:invokevirtual   #386 <Method void StaggeredGridLayoutManager$LazySpanLookup.setSpan(int, StaggeredGridLayoutManager$Span)>
			} else
	//* 113  240:goto            252
			{
				span = mSpans[j];
	//  114  243:aload_0         
	//  115  244:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  116  247:iload           5
	//  117  249:aaload          
	//  118  250:astore          12
			}
			layoutparams.mSpan = span;
	//  119  252:aload           14
	//  120  254:aload           12
	//  121  256:putfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
			if(layoutstate.mLayoutDirection == 1)
	//* 122  259:aload_2         
	//* 123  260:getfield        #239 <Field int LayoutState.mLayoutDirection>
	//* 124  263:iconst_1        
	//* 125  264:icmpne          276
				addView(view);
	//  126  267:aload_0         
	//  127  268:aload           13
	//  128  270:invokevirtual   #389 <Method void addView(View)>
			else
	//* 129  273:goto            283
				addView(view, 0);
	//  130  276:aload_0         
	//  131  277:aload           13
	//  132  279:iconst_0        
	//  133  280:invokevirtual   #392 <Method void addView(View, int)>
			measureChildWithDecorationsAndMargin(view, layoutparams, false);
	//  134  283:aload_0         
	//  135  284:aload           13
	//  136  286:aload           14
	//  137  288:iconst_0        
	//  138  289:invokespecial   #396 <Method void measureChildWithDecorationsAndMargin(View, StaggeredGridLayoutManager$LayoutParams, boolean)>
			int l;
			int i1;
			if(layoutstate.mLayoutDirection == 1)
	//* 139  292:aload_2         
	//* 140  293:getfield        #239 <Field int LayoutState.mLayoutDirection>
	//* 141  296:iconst_1        
	//* 142  297:icmpne          412
			{
				if(layoutparams.mFullSpan)
	//* 143  300:aload           14
	//* 144  302:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 145  305:ifeq            319
					j = getMaxEnd(k);
	//  146  308:aload_0         
	//  147  309:iload           6
	//  148  311:invokespecial   #399 <Method int getMaxEnd(int)>
	//  149  314:istore          5
				else
	//* 150  316:goto            328
					j = span.getEndLine(k);
	//  151  319:aload           12
	//  152  321:iload           6
	//  153  323:invokevirtual   #323 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
	//  154  326:istore          5
				int k1 = j + mPrimaryOrientation.getDecoratedMeasurement(view);
	//  155  328:iload           5
	//  156  330:aload_0         
	//  157  331:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  158  334:aload           13
	//  159  336:invokevirtual   #403 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//  160  339:iadd            
	//  161  340:istore          10
				l = j;
	//  162  342:iload           5
	//  163  344:istore          7
				i1 = k1;
	//  164  346:iload           10
	//  165  348:istore          8
				if(flag)
	//* 166  350:iload           9
	//* 167  352:ifeq            521
				{
					l = j;
	//  168  355:iload           5
	//  169  357:istore          7
					i1 = k1;
	//  170  359:iload           10
	//  171  361:istore          8
					if(layoutparams.mFullSpan)
	//* 172  363:aload           14
	//* 173  365:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 174  368:ifeq            521
					{
						LazySpanLookup.FullSpanItem fullspanitem = createFullSpanItemFromEnd(j);
	//  175  371:aload_0         
	//  176  372:iload           5
	//  177  374:invokespecial   #405 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem createFullSpanItemFromEnd(int)>
	//  178  377:astore          15
						fullspanitem.mGapDir = -1;
	//  179  379:aload           15
	//  180  381:iconst_m1       
	//  181  382:putfield        #408 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapDir>
						fullspanitem.mPosition = j2;
	//  182  385:aload           15
	//  183  387:iload           11
	//  184  389:putfield        #411 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
						mLazySpanLookup.addFullSpanItem(fullspanitem);
	//  185  392:aload_0         
	//  186  393:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//  187  396:aload           15
	//  188  398:invokevirtual   #415 <Method void StaggeredGridLayoutManager$LazySpanLookup.addFullSpanItem(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)>
						l = j;
	//  189  401:iload           5
	//  190  403:istore          7
						i1 = k1;
	//  191  405:iload           10
	//  192  407:istore          8
					}
				}
			} else
	//* 193  409:goto            521
			{
				if(layoutparams.mFullSpan)
	//* 194  412:aload           14
	//* 195  414:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 196  417:ifeq            431
					j = getMinStart(k);
	//  197  420:aload_0         
	//  198  421:iload           6
	//  199  423:invokespecial   #418 <Method int getMinStart(int)>
	//  200  426:istore          5
				else
	//* 201  428:goto            440
					j = span.getStartLine(k);
	//  202  431:aload           12
	//  203  433:iload           6
	//  204  435:invokevirtual   #326 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
	//  205  438:istore          5
				int l1 = j - mPrimaryOrientation.getDecoratedMeasurement(view);
	//  206  440:iload           5
	//  207  442:aload_0         
	//  208  443:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  209  446:aload           13
	//  210  448:invokevirtual   #403 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//  211  451:isub            
	//  212  452:istore          10
				l = l1;
	//  213  454:iload           10
	//  214  456:istore          7
				i1 = j;
	//  215  458:iload           5
	//  216  460:istore          8
				if(flag)
	//* 217  462:iload           9
	//* 218  464:ifeq            521
				{
					l = l1;
	//  219  467:iload           10
	//  220  469:istore          7
					i1 = j;
	//  221  471:iload           5
	//  222  473:istore          8
					if(layoutparams.mFullSpan)
	//* 223  475:aload           14
	//* 224  477:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 225  480:ifeq            521
					{
						LazySpanLookup.FullSpanItem fullspanitem1 = createFullSpanItemFromStart(j);
	//  226  483:aload_0         
	//  227  484:iload           5
	//  228  486:invokespecial   #420 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem createFullSpanItemFromStart(int)>
	//  229  489:astore          15
						fullspanitem1.mGapDir = 1;
	//  230  491:aload           15
	//  231  493:iconst_1        
	//  232  494:putfield        #408 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapDir>
						fullspanitem1.mPosition = j2;
	//  233  497:aload           15
	//  234  499:iload           11
	//  235  501:putfield        #411 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
						mLazySpanLookup.addFullSpanItem(fullspanitem1);
	//  236  504:aload_0         
	//  237  505:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//  238  508:aload           15
	//  239  510:invokevirtual   #415 <Method void StaggeredGridLayoutManager$LazySpanLookup.addFullSpanItem(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)>
						i1 = j;
	//  240  513:iload           5
	//  241  515:istore          8
						l = l1;
	//  242  517:iload           10
	//  243  519:istore          7
					}
				}
			}
			if(layoutparams.mFullSpan && layoutstate.mItemDirection == -1)
	//* 244  521:aload           14
	//* 245  523:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 246  526:ifeq            625
	//* 247  529:aload_2         
	//* 248  530:getfield        #423 <Field int LayoutState.mItemDirection>
	//* 249  533:iconst_m1       
	//* 250  534:icmpne          625
				if(flag)
	//* 251  537:iload           9
	//* 252  539:ifeq            550
				{
					mLaidOutInvalidFullSpan = true;
	//  253  542:aload_0         
	//  254  543:iconst_1        
	//  255  544:putfield        #118 <Field boolean mLaidOutInvalidFullSpan>
				} else
	//* 256  547:goto            625
				{
					if(layoutstate.mLayoutDirection == 1)
	//* 257  550:aload_2         
	//* 258  551:getfield        #239 <Field int LayoutState.mLayoutDirection>
	//* 259  554:iconst_1        
	//* 260  555:icmpne          577
					{
						if(!areAllEndsEqual())
	//* 261  558:aload_0         
	//* 262  559:invokevirtual   #426 <Method boolean areAllEndsEqual()>
	//* 263  562:ifne            571
							j = 1;
	//  264  565:iconst_1        
	//  265  566:istore          5
						else
	//* 266  568:goto            574
							j = 0;
	//  267  571:iconst_0        
	//  268  572:istore          5
					} else
	//* 269  574:goto            593
					if(!areAllStartsEqual())
	//* 270  577:aload_0         
	//* 271  578:invokevirtual   #429 <Method boolean areAllStartsEqual()>
	//* 272  581:ifne            590
						j = 1;
	//  273  584:iconst_1        
	//  274  585:istore          5
					else
	//* 275  587:goto            593
						j = 0;
	//  276  590:iconst_0        
	//  277  591:istore          5
					if(j != 0)
	//* 278  593:iload           5
	//* 279  595:ifeq            625
					{
						LazySpanLookup.FullSpanItem fullspanitem2 = mLazySpanLookup.getFullSpanItem(j2);
	//  280  598:aload_0         
	//  281  599:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//  282  602:iload           11
	//  283  604:invokevirtual   #432 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem StaggeredGridLayoutManager$LazySpanLookup.getFullSpanItem(int)>
	//  284  607:astore          15
						if(fullspanitem2 != null)
	//* 285  609:aload           15
	//* 286  611:ifnull          620
							fullspanitem2.mHasUnwantedGapAfter = true;
	//  287  614:aload           15
	//  288  616:iconst_1        
	//  289  617:putfield        #435 <Field boolean StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mHasUnwantedGapAfter>
						mLaidOutInvalidFullSpan = true;
	//  290  620:aload_0         
	//  291  621:iconst_1        
	//  292  622:putfield        #118 <Field boolean mLaidOutInvalidFullSpan>
					}
				}
			attachViewToSpans(view, layoutparams, layoutstate);
	//  293  625:aload_0         
	//  294  626:aload           13
	//  295  628:aload           14
	//  296  630:aload_2         
	//  297  631:invokespecial   #437 <Method void attachViewToSpans(View, StaggeredGridLayoutManager$LayoutParams, LayoutState)>
			int j1;
			int i2;
			if(isLayoutRTL() && mOrientation == 1)
	//* 298  634:aload_0         
	//* 299  635:invokevirtual   #315 <Method boolean isLayoutRTL()>
	//* 300  638:ifeq            717
	//* 301  641:aload_0         
	//* 302  642:getfield        #125 <Field int mOrientation>
	//* 303  645:iconst_1        
	//* 304  646:icmpne          717
			{
				if(layoutparams.mFullSpan)
	//* 305  649:aload           14
	//* 306  651:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 307  654:ifeq            669
					j = mSecondaryOrientation.getEndAfterPadding();
	//  308  657:aload_0         
	//  309  658:getfield        #332 <Field OrientationHelper mSecondaryOrientation>
	//  310  661:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//  311  664:istore          5
				else
	//* 312  666:goto            696
					j = mSecondaryOrientation.getEndAfterPadding() - (mSpanCount - 1 - span.mIndex) * mSizePerSpan;
	//  313  669:aload_0         
	//  314  670:getfield        #332 <Field OrientationHelper mSecondaryOrientation>
	//  315  673:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//  316  676:aload_0         
	//  317  677:getfield        #93  <Field int mSpanCount>
	//  318  680:iconst_1        
	//  319  681:isub            
	//  320  682:aload           12
	//  321  684:getfield        #440 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//  322  687:isub            
	//  323  688:aload_0         
	//  324  689:getfield        #442 <Field int mSizePerSpan>
	//  325  692:imul            
	//  326  693:isub            
	//  327  694:istore          5
				j1 = j - mSecondaryOrientation.getDecoratedMeasurement(view);
	//  328  696:iload           5
	//  329  698:aload_0         
	//  330  699:getfield        #332 <Field OrientationHelper mSecondaryOrientation>
	//  331  702:aload           13
	//  332  704:invokevirtual   #403 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//  333  707:isub            
	//  334  708:istore          9
				i2 = j;
	//  335  710:iload           5
	//  336  712:istore          10
			} else
	//* 337  714:goto            775
			{
				if(layoutparams.mFullSpan)
	//* 338  717:aload           14
	//* 339  719:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 340  722:ifeq            737
					j = mSecondaryOrientation.getStartAfterPadding();
	//  341  725:aload_0         
	//  342  726:getfield        #332 <Field OrientationHelper mSecondaryOrientation>
	//  343  729:invokevirtual   #198 <Method int OrientationHelper.getStartAfterPadding()>
	//  344  732:istore          5
				else
	//* 345  734:goto            757
					j = span.mIndex * mSizePerSpan + mSecondaryOrientation.getStartAfterPadding();
	//  346  737:aload           12
	//  347  739:getfield        #440 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//  348  742:aload_0         
	//  349  743:getfield        #442 <Field int mSizePerSpan>
	//  350  746:imul            
	//  351  747:aload_0         
	//  352  748:getfield        #332 <Field OrientationHelper mSecondaryOrientation>
	//  353  751:invokevirtual   #198 <Method int OrientationHelper.getStartAfterPadding()>
	//  354  754:iadd            
	//  355  755:istore          5
				i2 = j + mSecondaryOrientation.getDecoratedMeasurement(view);
	//  356  757:iload           5
	//  357  759:aload_0         
	//  358  760:getfield        #332 <Field OrientationHelper mSecondaryOrientation>
	//  359  763:aload           13
	//  360  765:invokevirtual   #403 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//  361  768:iadd            
	//  362  769:istore          10
				j1 = j;
	//  363  771:iload           5
	//  364  773:istore          9
			}
			if(mOrientation == 1)
	//* 365  775:aload_0         
	//* 366  776:getfield        #125 <Field int mOrientation>
	//* 367  779:iconst_1        
	//* 368  780:icmpne          800
				layoutDecoratedWithMargins(view, j1, l, i2, i1);
	//  369  783:aload_0         
	//  370  784:aload           13
	//  371  786:iload           9
	//  372  788:iload           7
	//  373  790:iload           10
	//  374  792:iload           8
	//  375  794:invokevirtual   #446 <Method void layoutDecoratedWithMargins(View, int, int, int, int)>
			else
	//* 376  797:goto            814
				layoutDecoratedWithMargins(view, l, j1, i1, i2);
	//  377  800:aload_0         
	//  378  801:aload           13
	//  379  803:iload           7
	//  380  805:iload           9
	//  381  807:iload           8
	//  382  809:iload           10
	//  383  811:invokevirtual   #446 <Method void layoutDecoratedWithMargins(View, int, int, int, int)>
			if(layoutparams.mFullSpan)
	//* 384  814:aload           14
	//* 385  816:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 386  819:ifeq            838
				updateAllRemainingSpans(mLayoutState.mLayoutDirection, i);
	//  387  822:aload_0         
	//  388  823:aload_0         
	//  389  824:getfield        #138 <Field LayoutState mLayoutState>
	//  390  827:getfield        #239 <Field int LayoutState.mLayoutDirection>
	//  391  830:iload           4
	//  392  832:invokespecial   #358 <Method void updateAllRemainingSpans(int, int)>
			else
	//* 393  835:goto            853
				updateRemainingSpans(span, mLayoutState.mLayoutDirection, i);
	//  394  838:aload_0         
	//  395  839:aload           12
	//  396  841:aload_0         
	//  397  842:getfield        #138 <Field LayoutState mLayoutState>
	//  398  845:getfield        #239 <Field int LayoutState.mLayoutDirection>
	//  399  848:iload           4
	//  400  850:invokespecial   #450 <Method void updateRemainingSpans(StaggeredGridLayoutManager$Span, int, int)>
			recycle(recycler, mLayoutState);
	//  401  853:aload_0         
	//  402  854:aload_1         
	//  403  855:aload_0         
	//  404  856:getfield        #138 <Field LayoutState mLayoutState>
	//  405  859:invokespecial   #454 <Method void recycle(RecyclerView$Recycler, LayoutState)>
			if(!mLayoutState.mStopInFocusable || !view.hasFocusable())
				continue;
	//  406  862:aload_0         
	//  407  863:getfield        #138 <Field LayoutState mLayoutState>
	//  408  866:getfield        #457 <Field boolean LayoutState.mStopInFocusable>
	//  409  869:ifeq            911
	//  410  872:aload           13
	//  411  874:invokevirtual   #460 <Method boolean View.hasFocusable()>
	//  412  877:ifeq            911
			if(layoutparams.mFullSpan)
	//* 413  880:aload           14
	//* 414  882:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 415  885:ifeq            898
				mRemainingSpans.clear();
	//  416  888:aload_0         
	//  417  889:getfield        #336 <Field BitSet mRemainingSpans>
	//  418  892:invokevirtual   #461 <Method void BitSet.clear()>
			else
	//* 419  895:goto            911
				mRemainingSpans.set(span.mIndex, false);
	//  420  898:aload_0         
	//  421  899:getfield        #336 <Field BitSet mRemainingSpans>
	//  422  902:aload           12
	//  423  904:getfield        #440 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//  424  907:iconst_0        
	//  425  908:invokevirtual   #464 <Method void BitSet.set(int, boolean)>
		}

	//  426  911:iconst_1        
	//  427  912:istore          5
	//* 428  914:goto            120
		if(j == 0)
	//* 429  917:iload           5
	//* 430  919:ifne            931
			recycle(recycler, mLayoutState);
	//  431  922:aload_0         
	//  432  923:aload_1         
	//  433  924:aload_0         
	//  434  925:getfield        #138 <Field LayoutState mLayoutState>
	//  435  928:invokespecial   #454 <Method void recycle(RecyclerView$Recycler, LayoutState)>
		if(mLayoutState.mLayoutDirection == -1)
	//* 436  931:aload_0         
	//* 437  932:getfield        #138 <Field LayoutState mLayoutState>
	//* 438  935:getfield        #239 <Field int LayoutState.mLayoutDirection>
	//* 439  938:iconst_m1       
	//* 440  939:icmpne          970
		{
			i = getMinStart(mPrimaryOrientation.getStartAfterPadding());
	//  441  942:aload_0         
	//  442  943:aload_0         
	//  443  944:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  444  947:invokevirtual   #198 <Method int OrientationHelper.getStartAfterPadding()>
	//  445  950:invokespecial   #418 <Method int getMinStart(int)>
	//  446  953:istore          4
			i = mPrimaryOrientation.getStartAfterPadding() - i;
	//  447  955:aload_0         
	//  448  956:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  449  959:invokevirtual   #198 <Method int OrientationHelper.getStartAfterPadding()>
	//  450  962:iload           4
	//  451  964:isub            
	//  452  965:istore          4
		} else
	//* 453  967:goto            991
		{
			i = getMaxEnd(mPrimaryOrientation.getEndAfterPadding()) - mPrimaryOrientation.getEndAfterPadding();
	//  454  970:aload_0         
	//  455  971:aload_0         
	//  456  972:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  457  975:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//  458  978:invokespecial   #399 <Method int getMaxEnd(int)>
	//  459  981:aload_0         
	//  460  982:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  461  985:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//  462  988:isub            
	//  463  989:istore          4
		}
		if(i > 0)
	//* 464  991:iload           4
	//* 465  993:ifle            1006
			return Math.min(layoutstate.mAvailable, i);
	//  466  996:aload_2         
	//  467  997:getfield        #352 <Field int LayoutState.mAvailable>
	//  468 1000:iload           4
	//  469 1002:invokestatic    #470 <Method int Math.min(int, int)>
	//  470 1005:ireturn         
		else
			return 0;
	//  471 1006:iconst_0        
	//  472 1007:ireturn         
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
	//    2    3:invokespecial   #399 <Method int getMaxEnd(int)>
	//    3    6:istore          4
		if(i == 0x80000000)
	//*   4    8:iload           4
	//*   5   10:ldc1            #43  <Int 0x80000000>
	//*   6   12:icmpne          16
			return;
	//    7   15:return          
		i = mPrimaryOrientation.getEndAfterPadding() - i;
	//    8   16:aload_0         
	//    9   17:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   10   20:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//   11   23:iload           4
	//   12   25:isub            
	//   13   26:istore          4
		int j;
		if(i > 0)
	//*  14   28:iload           4
	//*  15   30:ifle            48
			j = -scrollBy(-i, recycler, state);
	//   16   33:aload_0         
	//   17   34:iload           4
	//   18   36:ineg            
	//   19   37:aload_1         
	//   20   38:aload_2         
	//   21   39:invokevirtual   #485 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//   22   42:ineg            
	//   23   43:istore          5
		else
	//*  24   45:goto            49
			return;
	//   25   48:return          
		i -= j;
	//   26   49:iload           4
	//   27   51:iload           5
	//   28   53:isub            
	//   29   54:istore          4
		if(flag && i > 0)
	//*  30   56:iload_3         
	//*  31   57:ifeq            74
	//*  32   60:iload           4
	//*  33   62:ifle            74
			mPrimaryOrientation.offsetChildren(i);
	//   34   65:aload_0         
	//   35   66:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   36   69:iload           4
	//   37   71:invokevirtual   #488 <Method void OrientationHelper.offsetChildren(int)>
	//   38   74:return          
	}

	private void fixStartGap(RecyclerView.Recycler recycler, RecyclerView.State state, boolean flag)
	{
		int i = getMinStart(0x7fffffff);
	//    0    0:aload_0         
	//    1    1:ldc2            #346 <Int 0x7fffffff>
	//    2    4:invokespecial   #418 <Method int getMinStart(int)>
	//    3    7:istore          4
		if(i == 0x7fffffff)
	//*   4    9:iload           4
	//*   5   11:ldc2            #346 <Int 0x7fffffff>
	//*   6   14:icmpne          18
			return;
	//    7   17:return          
		i -= mPrimaryOrientation.getStartAfterPadding();
	//    8   18:iload           4
	//    9   20:aload_0         
	//   10   21:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   11   24:invokevirtual   #198 <Method int OrientationHelper.getStartAfterPadding()>
	//   12   27:isub            
	//   13   28:istore          4
		int j;
		if(i > 0)
	//*  14   30:iload           4
	//*  15   32:ifle            48
			j = scrollBy(i, recycler, state);
	//   16   35:aload_0         
	//   17   36:iload           4
	//   18   38:aload_1         
	//   19   39:aload_2         
	//   20   40:invokevirtual   #485 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//   21   43:istore          5
		else
	//*  22   45:goto            49
			return;
	//   23   48:return          
		i -= j;
	//   24   49:iload           4
	//   25   51:iload           5
	//   26   53:isub            
	//   27   54:istore          4
		if(flag && i > 0)
	//*  28   56:iload_3         
	//*  29   57:ifeq            75
	//*  30   60:iload           4
	//*  31   62:ifle            75
			mPrimaryOrientation.offsetChildren(-i);
	//   32   65:aload_0         
	//   33   66:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   34   69:iload           4
	//   35   71:ineg            
	//   36   72:invokevirtual   #488 <Method void OrientationHelper.offsetChildren(int)>
	//   37   75:return          
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
		int j;
		byte byte0;
		if(preferLastSpan(layoutstate.mLayoutDirection))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:getfield        #239 <Field int LayoutState.mLayoutDirection>
	//*   3    5:invokespecial   #495 <Method boolean preferLastSpan(int)>
	//*   4    8:ifeq            26
		{
			i = mSpanCount - 1;
	//    5   11:aload_0         
	//    6   12:getfield        #93  <Field int mSpanCount>
	//    7   15:iconst_1        
	//    8   16:isub            
	//    9   17:istore_2        
			j = -1;
	//   10   18:iconst_m1       
	//   11   19:istore_3        
			byte0 = -1;
	//   12   20:iconst_m1       
	//   13   21:istore          4
		} else
	//*  14   23:goto            36
		{
			i = 0;
	//   15   26:iconst_0        
	//   16   27:istore_2        
			j = mSpanCount;
	//   17   28:aload_0         
	//   18   29:getfield        #93  <Field int mSpanCount>
	//   19   32:istore_3        
			byte0 = 1;
	//   20   33:iconst_1        
	//   21   34:istore          4
		}
		if(layoutstate.mLayoutDirection == 1)
	//*  22   36:aload_1         
	//*  23   37:getfield        #239 <Field int LayoutState.mLayoutDirection>
	//*  24   40:iconst_1        
	//*  25   41:icmpne          114
		{
			layoutstate = null;
	//   26   44:aconst_null     
	//   27   45:astore_1        
			int k = 0x7fffffff;
	//   28   46:ldc2            #346 <Int 0x7fffffff>
	//   29   49:istore          5
			int i2 = mPrimaryOrientation.getStartAfterPadding();
	//   30   51:aload_0         
	//   31   52:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   32   55:invokevirtual   #198 <Method int OrientationHelper.getStartAfterPadding()>
	//   33   58:istore          8
			while(i != j) 
	//*  34   60:iload_2         
	//*  35   61:iload_3         
	//*  36   62:icmpeq          112
			{
				Span span = mSpans[i];
	//   37   65:aload_0         
	//   38   66:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   39   69:iload_2         
	//   40   70:aaload          
	//   41   71:astore          9
				int k1 = span.getEndLine(i2);
	//   42   73:aload           9
	//   43   75:iload           8
	//   44   77:invokevirtual   #323 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
	//   45   80:istore          7
				int i1 = k;
	//   46   82:iload           5
	//   47   84:istore          6
				if(k1 < k)
	//*  48   86:iload           7
	//*  49   88:iload           5
	//*  50   90:icmpge          100
				{
					layoutstate = ((LayoutState) (span));
	//   51   93:aload           9
	//   52   95:astore_1        
					i1 = k1;
	//   53   96:iload           7
	//   54   98:istore          6
				}
				i += ((int) (byte0));
	//   55  100:iload_2         
	//   56  101:iload           4
	//   57  103:iadd            
	//   58  104:istore_2        
				k = i1;
	//   59  105:iload           6
	//   60  107:istore          5
			}
	//*  61  109:goto            60
			return ((Span) (layoutstate));
	//   62  112:aload_1         
	//   63  113:areturn         
		}
		layoutstate = null;
	//   64  114:aconst_null     
	//   65  115:astore_1        
		int l = 0x80000000;
	//   66  116:ldc1            #43  <Int 0x80000000>
	//   67  118:istore          5
		int j2 = mPrimaryOrientation.getEndAfterPadding();
	//   68  120:aload_0         
	//   69  121:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   70  124:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//   71  127:istore          8
		while(i != j) 
	//*  72  129:iload_2         
	//*  73  130:iload_3         
	//*  74  131:icmpeq          181
		{
			Span span1 = mSpans[i];
	//   75  134:aload_0         
	//   76  135:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   77  138:iload_2         
	//   78  139:aaload          
	//   79  140:astore          9
			int l1 = span1.getStartLine(j2);
	//   80  142:aload           9
	//   81  144:iload           8
	//   82  146:invokevirtual   #326 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
	//   83  149:istore          7
			int j1 = l;
	//   84  151:iload           5
	//   85  153:istore          6
			if(l1 > l)
	//*  86  155:iload           7
	//*  87  157:iload           5
	//*  88  159:icmple          169
			{
				layoutstate = ((LayoutState) (span1));
	//   89  162:aload           9
	//   90  164:astore_1        
				j1 = l1;
	//   91  165:iload           7
	//   92  167:istore          6
			}
			i += ((int) (byte0));
	//   93  169:iload_2         
	//   94  170:iload           4
	//   95  172:iadd            
	//   96  173:istore_2        
			l = j1;
	//   97  174:iload           6
	//   98  176:istore          5
		}
	//*  99  178:goto            129
		return ((Span) (layoutstate));
	//  100  181:aload_1         
	//  101  182:areturn         
	}

	private void handleUpdate(int i, int j, int k)
	{
		int j1;
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            16
			j1 = getLastChildPosition();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #500 <Method int getLastChildPosition()>
	//    5   11:istore          6
		else
	//*   6   13:goto            22
			j1 = getFirstChildPosition();
	//    7   16:aload_0         
	//    8   17:invokevirtual   #262 <Method int getFirstChildPosition()>
	//    9   20:istore          6
		int l;
		int i1;
		if(k == 8)
	//*  10   22:iload_3         
	//*  11   23:bipush          8
	//*  12   25:icmpne          55
		{
			if(i < j)
	//*  13   28:iload_1         
	//*  14   29:iload_2         
	//*  15   30:icmpge          44
			{
				i1 = j + 1;
	//   16   33:iload_2         
	//   17   34:iconst_1        
	//   18   35:iadd            
	//   19   36:istore          5
				l = i;
	//   20   38:iload_1         
	//   21   39:istore          4
			} else
	//*  22   41:goto            63
			{
				i1 = i + 1;
	//   23   44:iload_1         
	//   24   45:iconst_1        
	//   25   46:iadd            
	//   26   47:istore          5
				l = j;
	//   27   49:iload_2         
	//   28   50:istore          4
			}
		} else
	//*  29   52:goto            63
		{
			l = i;
	//   30   55:iload_1         
	//   31   56:istore          4
			i1 = i + j;
	//   32   58:iload_1         
	//   33   59:iload_2         
	//   34   60:iadd            
	//   35   61:istore          5
		}
		mLazySpanLookup.invalidateAfter(l);
	//   36   63:aload_0         
	//   37   64:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   38   67:iload           4
	//   39   69:invokevirtual   #503 <Method int StaggeredGridLayoutManager$LazySpanLookup.invalidateAfter(int)>
	//   40   72:pop             
		switch(k)
	//*  41   73:iload_3         
		{
	//*  42   74:lookupswitch    3: default 108
	//	               1: 111
	//	               2: 123
	//	               8: 135
	//*  43  108:goto            153
		case 1: // '\001'
			mLazySpanLookup.offsetForAddition(i, j);
	//   44  111:aload_0         
	//   45  112:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   46  115:iload_1         
	//   47  116:iload_2         
	//   48  117:invokevirtual   #506 <Method void StaggeredGridLayoutManager$LazySpanLookup.offsetForAddition(int, int)>
			break;

	//*  49  120:goto            153
		case 2: // '\002'
			mLazySpanLookup.offsetForRemoval(i, j);
	//   50  123:aload_0         
	//   51  124:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   52  127:iload_1         
	//   53  128:iload_2         
	//   54  129:invokevirtual   #509 <Method void StaggeredGridLayoutManager$LazySpanLookup.offsetForRemoval(int, int)>
			break;

	//*  55  132:goto            153
		case 8: // '\b'
			mLazySpanLookup.offsetForRemoval(i, 1);
	//   56  135:aload_0         
	//   57  136:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   58  139:iload_1         
	//   59  140:iconst_1        
	//   60  141:invokevirtual   #509 <Method void StaggeredGridLayoutManager$LazySpanLookup.offsetForRemoval(int, int)>
			mLazySpanLookup.offsetForAddition(j, 1);
	//   61  144:aload_0         
	//   62  145:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   63  148:iload_2         
	//   64  149:iconst_1        
	//   65  150:invokevirtual   #506 <Method void StaggeredGridLayoutManager$LazySpanLookup.offsetForAddition(int, int)>
			break;
		}
		if(i1 <= j1)
	//*  66  153:iload           5
	//*  67  155:iload           6
	//*  68  157:icmpgt          161
			return;
	//   69  160:return          
		if(mShouldReverseLayout)
	//*  70  161:aload_0         
	//*  71  162:getfield        #97  <Field boolean mShouldReverseLayout>
	//*  72  165:ifeq            176
			i = getFirstChildPosition();
	//   73  168:aload_0         
	//   74  169:invokevirtual   #262 <Method int getFirstChildPosition()>
	//   75  172:istore_1        
		else
	//*  76  173:goto            181
			i = getLastChildPosition();
	//   77  176:aload_0         
	//   78  177:invokevirtual   #500 <Method int getLastChildPosition()>
	//   79  180:istore_1        
		if(l <= i)
	//*  80  181:iload           4
	//*  81  183:iload_1         
	//*  82  184:icmpgt          191
			requestLayout();
	//   83  187:aload_0         
	//   84  188:invokevirtual   #512 <Method void requestLayout()>
	//   85  191:return          
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
	//    6   10:invokevirtual   #372 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
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
	//*  42   84:ifeq            101
			flag = shouldReMeasureChild(view, i, j, ((RecyclerView.LayoutParams) (layoutparams)));
	//   43   87:aload_0         
	//   44   88:aload_1         
	//   45   89:iload_2         
	//   46   90:iload_3         
	//   47   91:aload           5
	//   48   93:invokevirtual   #549 <Method boolean shouldReMeasureChild(View, int, int, RecyclerView$LayoutParams)>
	//   49   96:istore          4
		else
	//*  50   98:goto            112
			flag = shouldMeasureChild(view, i, j, ((RecyclerView.LayoutParams) (layoutparams)));
	//   51  101:aload_0         
	//   52  102:aload_1         
	//   53  103:iload_2         
	//   54  104:iload_3         
	//   55  105:aload           5
	//   56  107:invokevirtual   #552 <Method boolean shouldMeasureChild(View, int, int, RecyclerView$LayoutParams)>
	//   57  110:istore          4
		if(flag)
	//*  58  112:iload           4
	//*  59  114:ifeq            123
			view.measure(i, j);
	//   60  117:aload_1         
	//   61  118:iload_2         
	//   62  119:iload_3         
	//   63  120:invokevirtual   #555 <Method void View.measure(int, int)>
	//   64  123:return          
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
	//   46   82:getfield        #442 <Field int mSizePerSpan>
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
	//   78  140:getfield        #442 <Field int mSizePerSpan>
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
		AnchorInfo anchorinfo = mAnchorInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
	//    2    4:astore          7
		if((mPendingSavedState != null || mPendingScrollPosition != -1) && state.getItemCount() == 0)
	//*   3    6:aload_0         
	//*   4    7:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*   5   10:ifnonnull       21
	//*   6   13:aload_0         
	//*   7   14:getfield        #99  <Field int mPendingScrollPosition>
	//*   8   17:iconst_m1       
	//*   9   18:icmpeq          39
	//*  10   21:aload_2         
	//*  11   22:invokevirtual   #587 <Method int RecyclerView$State.getItemCount()>
	//*  12   25:ifne            39
		{
			removeAndRecycleAllViews(recycler);
	//   13   28:aload_0         
	//   14   29:aload_1         
	//   15   30:invokevirtual   #591 <Method void removeAndRecycleAllViews(RecyclerView$Recycler)>
			anchorinfo.reset();
	//   16   33:aload           7
	//   17   35:invokevirtual   #594 <Method void StaggeredGridLayoutManager$AnchorInfo.reset()>
			return;
	//   18   38:return          
		}
		int i;
		if(!anchorinfo.mValid || mPendingScrollPosition != -1 || mPendingSavedState != null)
	//*  19   39:aload           7
	//*  20   41:getfield        #597 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mValid>
	//*  21   44:ifeq            62
	//*  22   47:aload_0         
	//*  23   48:getfield        #99  <Field int mPendingScrollPosition>
	//*  24   51:iconst_m1       
	//*  25   52:icmpne          62
	//*  26   55:aload_0         
	//*  27   56:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  28   59:ifnull          68
			i = 1;
	//   29   62:iconst_1        
	//   30   63:istore          4
		else
	//*  31   65:goto            71
			i = 0;
	//   32   68:iconst_0        
	//   33   69:istore          4
		if(i != 0)
	//*  34   71:iload           4
	//*  35   73:ifeq            123
		{
			anchorinfo.reset();
	//   36   76:aload           7
	//   37   78:invokevirtual   #594 <Method void StaggeredGridLayoutManager$AnchorInfo.reset()>
			if(mPendingSavedState != null)
	//*  38   81:aload_0         
	//*  39   82:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  40   85:ifnull          97
			{
				applyPendingSavedState(anchorinfo);
	//   41   88:aload_0         
	//   42   89:aload           7
	//   43   91:invokespecial   #599 <Method void applyPendingSavedState(StaggeredGridLayoutManager$AnchorInfo)>
			} else
	//*  44   94:goto            110
			{
				resolveShouldLayoutReverse();
	//   45   97:aload_0         
	//   46   98:invokespecial   #217 <Method void resolveShouldLayoutReverse()>
				anchorinfo.mLayoutFromEnd = mShouldReverseLayout;
	//   47  101:aload           7
	//   48  103:aload_0         
	//   49  104:getfield        #97  <Field boolean mShouldReverseLayout>
	//   50  107:putfield        #220 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
			}
			updateAnchorInfoForLayout(state, anchorinfo);
	//   51  110:aload_0         
	//   52  111:aload_2         
	//   53  112:aload           7
	//   54  114:invokevirtual   #603 <Method void updateAnchorInfoForLayout(RecyclerView$State, StaggeredGridLayoutManager$AnchorInfo)>
			anchorinfo.mValid = true;
	//   55  117:aload           7
	//   56  119:iconst_1        
	//   57  120:putfield        #597 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mValid>
		}
		if(mPendingSavedState == null && mPendingScrollPosition == -1 && (anchorinfo.mLayoutFromEnd != mLastLayoutFromEnd || isLayoutRTL() != mLastLayoutRTL))
	//*  58  123:aload_0         
	//*  59  124:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  60  127:ifnonnull       174
	//*  61  130:aload_0         
	//*  62  131:getfield        #99  <Field int mPendingScrollPosition>
	//*  63  134:iconst_m1       
	//*  64  135:icmpne          174
	//*  65  138:aload           7
	//*  66  140:getfield        #220 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
	//*  67  143:aload_0         
	//*  68  144:getfield        #605 <Field boolean mLastLayoutFromEnd>
	//*  69  147:icmpne          161
	//*  70  150:aload_0         
	//*  71  151:invokevirtual   #315 <Method boolean isLayoutRTL()>
	//*  72  154:aload_0         
	//*  73  155:getfield        #213 <Field boolean mLastLayoutRTL>
	//*  74  158:icmpeq          174
		{
			mLazySpanLookup.clear();
	//   75  161:aload_0         
	//   76  162:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   77  165:invokevirtual   #606 <Method void StaggeredGridLayoutManager$LazySpanLookup.clear()>
			anchorinfo.mInvalidateOffsets = true;
	//   78  168:aload           7
	//   79  170:iconst_1        
	//   80  171:putfield        #609 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mInvalidateOffsets>
		}
		if(getChildCount() > 0 && (mPendingSavedState == null || mPendingSavedState.mSpanOffsetsSize < 1))
	//*  81  174:aload_0         
	//*  82  175:invokevirtual   #259 <Method int getChildCount()>
	//*  83  178:ifle            385
	//*  84  181:aload_0         
	//*  85  182:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  86  185:ifnull          199
	//*  87  188:aload_0         
	//*  88  189:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  89  192:getfield        #178 <Field int StaggeredGridLayoutManager$SavedState.mSpanOffsetsSize>
	//*  90  195:iconst_1        
	//*  91  196:icmpge          385
			if(anchorinfo.mInvalidateOffsets)
	//*  92  199:aload           7
	//*  93  201:getfield        #609 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mInvalidateOffsets>
	//*  94  204:ifeq            266
				for(i = 0; i < mSpanCount; i++)
	//*  95  207:iconst_0        
	//*  96  208:istore          4
	//*  97  210:iload           4
	//*  98  212:aload_0         
	//*  99  213:getfield        #93  <Field int mSpanCount>
	//* 100  216:icmpge          263
				{
					mSpans[i].clear();
	//  101  219:aload_0         
	//  102  220:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  103  223:iload           4
	//  104  225:aaload          
	//  105  226:invokevirtual   #181 <Method void StaggeredGridLayoutManager$Span.clear()>
					if(anchorinfo.mOffset != 0x80000000)
	//* 106  229:aload           7
	//* 107  231:getfield        #612 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
	//* 108  234:ldc1            #43  <Int 0x80000000>
	//* 109  236:icmpeq          254
						mSpans[i].setLine(anchorinfo.mOffset);
	//  110  239:aload_0         
	//  111  240:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  112  243:iload           4
	//  113  245:aaload          
	//  114  246:aload           7
	//  115  248:getfield        #612 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
	//  116  251:invokevirtual   #201 <Method void StaggeredGridLayoutManager$Span.setLine(int)>
				}

	//  117  254:iload           4
	//  118  256:iconst_1        
	//  119  257:iadd            
	//  120  258:istore          4
			else
	//* 121  260:goto            210
	//* 122  263:goto            385
			if(i != 0 || mAnchorInfo.mSpanReferenceLines == null)
	//* 123  266:iload           4
	//* 124  268:ifne            281
	//* 125  271:aload_0         
	//* 126  272:getfield        #116 <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
	//* 127  275:getfield        #615 <Field int[] StaggeredGridLayoutManager$AnchorInfo.mSpanReferenceLines>
	//* 128  278:ifnonnull       335
			{
				for(int j = 0; j < mSpanCount; j++)
	//* 129  281:iconst_0        
	//* 130  282:istore          4
	//* 131  284:iload           4
	//* 132  286:aload_0         
	//* 133  287:getfield        #93  <Field int mSpanCount>
	//* 134  290:icmpge          321
					mSpans[j].cacheReferenceLineAndClear(mShouldReverseLayout, anchorinfo.mOffset);
	//  135  293:aload_0         
	//  136  294:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  137  297:iload           4
	//  138  299:aaload          
	//  139  300:aload_0         
	//  140  301:getfield        #97  <Field boolean mShouldReverseLayout>
	//  141  304:aload           7
	//  142  306:getfield        #612 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
	//  143  309:invokevirtual   #619 <Method void StaggeredGridLayoutManager$Span.cacheReferenceLineAndClear(boolean, int)>

	//  144  312:iload           4
	//  145  314:iconst_1        
	//  146  315:iadd            
	//  147  316:istore          4
	//* 148  318:goto            284
				mAnchorInfo.saveSpanReferenceLines(mSpans);
	//  149  321:aload_0         
	//  150  322:getfield        #116 <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
	//  151  325:aload_0         
	//  152  326:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  153  329:invokevirtual   #623 <Method void StaggeredGridLayoutManager$AnchorInfo.saveSpanReferenceLines(StaggeredGridLayoutManager$Span[])>
			} else
	//* 154  332:goto            385
			{
				for(int k = 0; k < mSpanCount; k++)
	//* 155  335:iconst_0        
	//* 156  336:istore          4
	//* 157  338:iload           4
	//* 158  340:aload_0         
	//* 159  341:getfield        #93  <Field int mSpanCount>
	//* 160  344:icmpge          385
				{
					Span span = mSpans[k];
	//  161  347:aload_0         
	//  162  348:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  163  351:iload           4
	//  164  353:aaload          
	//  165  354:astore          8
					span.clear();
	//  166  356:aload           8
	//  167  358:invokevirtual   #181 <Method void StaggeredGridLayoutManager$Span.clear()>
					span.setLine(mAnchorInfo.mSpanReferenceLines[k]);
	//  168  361:aload           8
	//  169  363:aload_0         
	//  170  364:getfield        #116 <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
	//  171  367:getfield        #615 <Field int[] StaggeredGridLayoutManager$AnchorInfo.mSpanReferenceLines>
	//  172  370:iload           4
	//  173  372:iaload          
	//  174  373:invokevirtual   #201 <Method void StaggeredGridLayoutManager$Span.setLine(int)>
				}

	//  175  376:iload           4
	//  176  378:iconst_1        
	//  177  379:iadd            
	//  178  380:istore          4
			}
	//* 179  382:goto            338
		detachAndScrapAttachedViews(recycler);
	//  180  385:aload_0         
	//  181  386:aload_1         
	//  182  387:invokevirtual   #626 <Method void detachAndScrapAttachedViews(RecyclerView$Recycler)>
		mLayoutState.mRecycle = false;
	//  183  390:aload_0         
	//  184  391:getfield        #138 <Field LayoutState mLayoutState>
	//  185  394:iconst_0        
	//  186  395:putfield        #629 <Field boolean LayoutState.mRecycle>
		mLaidOutInvalidFullSpan = false;
	//  187  398:aload_0         
	//  188  399:iconst_0        
	//  189  400:putfield        #118 <Field boolean mLaidOutInvalidFullSpan>
		updateMeasureSpecs(mSecondaryOrientation.getTotalSpace());
	//  190  403:aload_0         
	//  191  404:aload_0         
	//  192  405:getfield        #332 <Field OrientationHelper mSecondaryOrientation>
	//  193  408:invokevirtual   #632 <Method int OrientationHelper.getTotalSpace()>
	//  194  411:invokevirtual   #635 <Method void updateMeasureSpecs(int)>
		updateLayoutState(anchorinfo.mPosition, state);
	//  195  414:aload_0         
	//  196  415:aload           7
	//  197  417:getfield        #636 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
	//  198  420:aload_2         
	//  199  421:invokespecial   #640 <Method void updateLayoutState(int, RecyclerView$State)>
		if(anchorinfo.mLayoutFromEnd)
	//* 200  424:aload           7
	//* 201  426:getfield        #220 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
	//* 202  429:ifeq            487
		{
			setLayoutStateDirection(-1);
	//  203  432:aload_0         
	//  204  433:iconst_m1       
	//  205  434:invokespecial   #643 <Method void setLayoutStateDirection(int)>
			fill(recycler, mLayoutState, state);
	//  206  437:aload_0         
	//  207  438:aload_1         
	//  208  439:aload_0         
	//  209  440:getfield        #138 <Field LayoutState mLayoutState>
	//  210  443:aload_2         
	//  211  444:invokespecial   #645 <Method int fill(RecyclerView$Recycler, LayoutState, RecyclerView$State)>
	//  212  447:pop             
			setLayoutStateDirection(1);
	//  213  448:aload_0         
	//  214  449:iconst_1        
	//  215  450:invokespecial   #643 <Method void setLayoutStateDirection(int)>
			mLayoutState.mCurrentPosition = anchorinfo.mPosition + mLayoutState.mItemDirection;
	//  216  453:aload_0         
	//  217  454:getfield        #138 <Field LayoutState mLayoutState>
	//  218  457:aload           7
	//  219  459:getfield        #636 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
	//  220  462:aload_0         
	//  221  463:getfield        #138 <Field LayoutState mLayoutState>
	//  222  466:getfield        #423 <Field int LayoutState.mItemDirection>
	//  223  469:iadd            
	//  224  470:putfield        #648 <Field int LayoutState.mCurrentPosition>
			fill(recycler, mLayoutState, state);
	//  225  473:aload_0         
	//  226  474:aload_1         
	//  227  475:aload_0         
	//  228  476:getfield        #138 <Field LayoutState mLayoutState>
	//  229  479:aload_2         
	//  230  480:invokespecial   #645 <Method int fill(RecyclerView$Recycler, LayoutState, RecyclerView$State)>
	//  231  483:pop             
		} else
	//* 232  484:goto            539
		{
			setLayoutStateDirection(1);
	//  233  487:aload_0         
	//  234  488:iconst_1        
	//  235  489:invokespecial   #643 <Method void setLayoutStateDirection(int)>
			fill(recycler, mLayoutState, state);
	//  236  492:aload_0         
	//  237  493:aload_1         
	//  238  494:aload_0         
	//  239  495:getfield        #138 <Field LayoutState mLayoutState>
	//  240  498:aload_2         
	//  241  499:invokespecial   #645 <Method int fill(RecyclerView$Recycler, LayoutState, RecyclerView$State)>
	//  242  502:pop             
			setLayoutStateDirection(-1);
	//  243  503:aload_0         
	//  244  504:iconst_m1       
	//  245  505:invokespecial   #643 <Method void setLayoutStateDirection(int)>
			mLayoutState.mCurrentPosition = anchorinfo.mPosition + mLayoutState.mItemDirection;
	//  246  508:aload_0         
	//  247  509:getfield        #138 <Field LayoutState mLayoutState>
	//  248  512:aload           7
	//  249  514:getfield        #636 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
	//  250  517:aload_0         
	//  251  518:getfield        #138 <Field LayoutState mLayoutState>
	//  252  521:getfield        #423 <Field int LayoutState.mItemDirection>
	//  253  524:iadd            
	//  254  525:putfield        #648 <Field int LayoutState.mCurrentPosition>
			fill(recycler, mLayoutState, state);
	//  255  528:aload_0         
	//  256  529:aload_1         
	//  257  530:aload_0         
	//  258  531:getfield        #138 <Field LayoutState mLayoutState>
	//  259  534:aload_2         
	//  260  535:invokespecial   #645 <Method int fill(RecyclerView$Recycler, LayoutState, RecyclerView$State)>
	//  261  538:pop             
		}
		repositionToWrapContentIfNecessary();
	//  262  539:aload_0         
	//  263  540:invokespecial   #651 <Method void repositionToWrapContentIfNecessary()>
		if(getChildCount() > 0)
	//* 264  543:aload_0         
	//* 265  544:invokevirtual   #259 <Method int getChildCount()>
	//* 266  547:ifle            588
			if(mShouldReverseLayout)
	//* 267  550:aload_0         
	//* 268  551:getfield        #97  <Field boolean mShouldReverseLayout>
	//* 269  554:ifeq            574
			{
				fixEndGap(recycler, state, true);
	//  270  557:aload_0         
	//  271  558:aload_1         
	//  272  559:aload_2         
	//  273  560:iconst_1        
	//  274  561:invokespecial   #653 <Method void fixEndGap(RecyclerView$Recycler, RecyclerView$State, boolean)>
				fixStartGap(recycler, state, false);
	//  275  564:aload_0         
	//  276  565:aload_1         
	//  277  566:aload_2         
	//  278  567:iconst_0        
	//  279  568:invokespecial   #655 <Method void fixStartGap(RecyclerView$Recycler, RecyclerView$State, boolean)>
			} else
	//* 280  571:goto            588
			{
				fixStartGap(recycler, state, true);
	//  281  574:aload_0         
	//  282  575:aload_1         
	//  283  576:aload_2         
	//  284  577:iconst_1        
	//  285  578:invokespecial   #655 <Method void fixStartGap(RecyclerView$Recycler, RecyclerView$State, boolean)>
				fixEndGap(recycler, state, false);
	//  286  581:aload_0         
	//  287  582:aload_1         
	//  288  583:aload_2         
	//  289  584:iconst_0        
	//  290  585:invokespecial   #653 <Method void fixEndGap(RecyclerView$Recycler, RecyclerView$State, boolean)>
			}
		boolean flag3 = false;
	//  291  588:iconst_0        
	//  292  589:istore          6
		boolean flag2 = flag3;
	//  293  591:iload           6
	//  294  593:istore          5
		if(flag)
	//* 295  595:iload_3         
	//* 296  596:ifeq            679
		{
			flag2 = flag3;
	//  297  599:iload           6
	//  298  601:istore          5
			if(!state.isPreLayout())
	//* 299  603:aload_2         
	//* 300  604:invokevirtual   #658 <Method boolean RecyclerView$State.isPreLayout()>
	//* 301  607:ifne            679
			{
				boolean flag1;
				if(mGapStrategy != 0 && getChildCount() > 0 && (mLaidOutInvalidFullSpan || hasGapsToFix() != null))
	//* 302  610:aload_0         
	//* 303  611:getfield        #106 <Field int mGapStrategy>
	//* 304  614:ifeq            644
	//* 305  617:aload_0         
	//* 306  618:invokevirtual   #259 <Method int getChildCount()>
	//* 307  621:ifle            644
	//* 308  624:aload_0         
	//* 309  625:getfield        #118 <Field boolean mLaidOutInvalidFullSpan>
	//* 310  628:ifne            638
	//* 311  631:aload_0         
	//* 312  632:invokevirtual   #662 <Method View hasGapsToFix()>
	//* 313  635:ifnull          644
					flag1 = true;
	//  314  638:iconst_1        
	//  315  639:istore          4
				else
	//* 316  641:goto            647
					flag1 = false;
	//  317  644:iconst_0        
	//  318  645:istore          4
				flag2 = flag3;
	//  319  647:iload           6
	//  320  649:istore          5
				if(flag1)
	//* 321  651:iload           4
	//* 322  653:ifeq            679
				{
					removeCallbacks(mCheckForGapsRunnable);
	//  323  656:aload_0         
	//  324  657:aload_0         
	//  325  658:getfield        #123 <Field Runnable mCheckForGapsRunnable>
	//  326  661:invokevirtual   #666 <Method boolean removeCallbacks(Runnable)>
	//  327  664:pop             
					flag2 = flag3;
	//  328  665:iload           6
	//  329  667:istore          5
					if(checkForGaps())
	//* 330  669:aload_0         
	//* 331  670:invokevirtual   #669 <Method boolean checkForGaps()>
	//* 332  673:ifeq            679
						flag2 = true;
	//  333  676:iconst_1        
	//  334  677:istore          5
				}
			}
		}
		if(state.isPreLayout())
	//* 335  679:aload_2         
	//* 336  680:invokevirtual   #658 <Method boolean RecyclerView$State.isPreLayout()>
	//* 337  683:ifeq            693
			mAnchorInfo.reset();
	//  338  686:aload_0         
	//  339  687:getfield        #116 <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
	//  340  690:invokevirtual   #594 <Method void StaggeredGridLayoutManager$AnchorInfo.reset()>
		mLastLayoutFromEnd = anchorinfo.mLayoutFromEnd;
	//  341  693:aload_0         
	//  342  694:aload           7
	//  343  696:getfield        #220 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
	//  344  699:putfield        #605 <Field boolean mLastLayoutFromEnd>
		mLastLayoutRTL = isLayoutRTL();
	//  345  702:aload_0         
	//  346  703:aload_0         
	//  347  704:invokevirtual   #315 <Method boolean isLayoutRTL()>
	//  348  707:putfield        #213 <Field boolean mLastLayoutRTL>
		if(flag2)
	//* 349  710:iload           5
	//* 350  712:ifeq            729
		{
			mAnchorInfo.reset();
	//  351  715:aload_0         
	//  352  716:getfield        #116 <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
	//  353  719:invokevirtual   #594 <Method void StaggeredGridLayoutManager$AnchorInfo.reset()>
			onLayoutChildren(recycler, state, false);
	//  354  722:aload_0         
	//  355  723:aload_1         
	//  356  724:aload_2         
	//  357  725:iconst_0        
	//  358  726:invokespecial   #671 <Method void onLayoutChildren(RecyclerView$Recycler, RecyclerView$State, boolean)>
		}
	//  359  729:return          
	}

	private boolean preferLastSpan(int i)
	{
		if(mOrientation == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field int mOrientation>
	//*   2    4:ifne            31
		{
			boolean flag;
			if(i == -1)
	//*   3    7:iload_1         
	//*   4    8:iconst_m1       
	//*   5    9:icmpne          17
				flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_2        
			else
	//*   8   14:goto            19
				flag = false;
	//    9   17:iconst_0        
	//   10   18:istore_2        
			return flag != mShouldReverseLayout;
	//   11   19:iload_2         
	//   12   20:aload_0         
	//   13   21:getfield        #97  <Field boolean mShouldReverseLayout>
	//   14   24:icmpeq          29
	//   15   27:iconst_1        
	//   16   28:ireturn         
	//   17   29:iconst_0        
	//   18   30:ireturn         
		}
		boolean flag1;
		if(i == -1)
	//*  19   31:iload_1         
	//*  20   32:iconst_m1       
	//*  21   33:icmpne          41
			flag1 = true;
	//   22   36:iconst_1        
	//   23   37:istore_2        
		else
	//*  24   38:goto            43
			flag1 = false;
	//   25   41:iconst_0        
	//   26   42:istore_2        
		if(flag1 == mShouldReverseLayout)
	//*  27   43:iload_2         
	//*  28   44:aload_0         
	//*  29   45:getfield        #97  <Field boolean mShouldReverseLayout>
	//*  30   48:icmpne          56
			flag1 = true;
	//   31   51:iconst_1        
	//   32   52:istore_2        
		else
	//*  33   53:goto            58
			flag1 = false;
	//   34   56:iconst_0        
	//   35   57:istore_2        
		return flag1 == isLayoutRTL();
	//   36   58:iload_2         
	//   37   59:aload_0         
	//   38   60:invokevirtual   #315 <Method boolean isLayoutRTL()>
	//   39   63:icmpne          68
	//   40   66:iconst_1        
	//   41   67:ireturn         
	//   42   68:iconst_0        
	//   43   69:ireturn         
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
	//*   8   16:getfield        #352 <Field int LayoutState.mAvailable>
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
	//   17   33:getfield        #349 <Field int LayoutState.mEndLine>
	//   18   36:invokespecial   #675 <Method void recycleFromEnd(RecyclerView$Recycler, int)>
				return;
	//   19   39:return          
			} else
			{
				recycleFromStart(recycler, layoutstate.mStartLine);
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:aload_2         
	//   23   43:getfield        #355 <Field int LayoutState.mStartLine>
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
	//   31   59:getfield        #355 <Field int LayoutState.mStartLine>
	//   32   62:aload_0         
	//   33   63:aload_2         
	//   34   64:getfield        #355 <Field int LayoutState.mStartLine>
	//   35   67:invokespecial   #680 <Method int getMaxStart(int)>
	//   36   70:isub            
	//   37   71:istore_3        
			if(i < 0)
	//*  38   72:iload_3         
	//*  39   73:ifge            84
				i = layoutstate.mEndLine;
	//   40   76:aload_2         
	//   41   77:getfield        #349 <Field int LayoutState.mEndLine>
	//   42   80:istore_3        
			else
	//*  43   81:goto            98
				i = layoutstate.mEndLine - Math.min(i, layoutstate.mAvailable);
	//   44   84:aload_2         
	//   45   85:getfield        #349 <Field int LayoutState.mEndLine>
	//   46   88:iload_3         
	//   47   89:aload_2         
	//   48   90:getfield        #352 <Field int LayoutState.mAvailable>
	//   49   93:invokestatic    #470 <Method int Math.min(int, int)>
	//   50   96:isub            
	//   51   97:istore_3        
			recycleFromEnd(recycler, i);
	//   52   98:aload_0         
	//   53   99:aload_1         
	//   54  100:iload_3         
	//   55  101:invokespecial   #675 <Method void recycleFromEnd(RecyclerView$Recycler, int)>
			return;
	//   56  104:return          
		}
		int j = getMinEnd(layoutstate.mEndLine) - layoutstate.mEndLine;
	//   57  105:aload_0         
	//   58  106:aload_2         
	//   59  107:getfield        #349 <Field int LayoutState.mEndLine>
	//   60  110:invokespecial   #682 <Method int getMinEnd(int)>
	//   61  113:aload_2         
	//   62  114:getfield        #349 <Field int LayoutState.mEndLine>
	//   63  117:isub            
	//   64  118:istore_3        
		if(j < 0)
	//*  65  119:iload_3         
	//*  66  120:ifge            131
			j = layoutstate.mStartLine;
	//   67  123:aload_2         
	//   68  124:getfield        #355 <Field int LayoutState.mStartLine>
	//   69  127:istore_3        
		else
	//*  70  128:goto            145
			j = layoutstate.mStartLine + Math.min(j, layoutstate.mAvailable);
	//   71  131:aload_2         
	//   72  132:getfield        #355 <Field int LayoutState.mStartLine>
	//   73  135:iload_3         
	//   74  136:aload_2         
	//   75  137:getfield        #352 <Field int LayoutState.mAvailable>
	//   76  140:invokestatic    #470 <Method int Math.min(int, int)>
	//   77  143:iadd            
	//   78  144:istore_3        
		recycleFromStart(recycler, j);
	//   79  145:aload_0         
	//   80  146:aload_1         
	//   81  147:iload_3         
	//   82  148:invokespecial   #678 <Method void recycleFromStart(RecyclerView$Recycler, int)>
	//   83  151:return          
	}

	private void recycleFromEnd(RecyclerView.Recycler recycler, int i)
	{
		for(int j = getChildCount() - 1; j >= 0; j--)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #259 <Method int getChildCount()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_3        
	//*   5    7:iload_3         
	//*   6    8:iflt            177
		{
			View view = getChildAt(j);
	//    7   11:aload_0         
	//    8   12:iload_3         
	//    9   13:invokevirtual   #475 <Method View getChildAt(int)>
	//   10   16:astore          5
			if(mPrimaryOrientation.getDecoratedStart(view) >= i && mPrimaryOrientation.getTransformedStartWithDecoration(view) >= i)
	//*  11   18:aload_0         
	//*  12   19:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//*  13   22:aload           5
	//*  14   24:invokevirtual   #685 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  15   27:iload_2         
	//*  16   28:icmplt          169
	//*  17   31:aload_0         
	//*  18   32:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//*  19   35:aload           5
	//*  20   37:invokevirtual   #688 <Method int OrientationHelper.getTransformedStartWithDecoration(View)>
	//*  21   40:iload_2         
	//*  22   41:icmplt          169
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   23   44:aload           5
	//   24   46:invokevirtual   #372 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   25   49:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//   26   52:astore          6
				if(layoutparams.mFullSpan)
	//*  27   54:aload           6
	//*  28   56:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*  29   59:ifeq            135
				{
					for(int k = 0; k < mSpanCount; k++)
	//*  30   62:iconst_0        
	//*  31   63:istore          4
	//*  32   65:iload           4
	//*  33   67:aload_0         
	//*  34   68:getfield        #93  <Field int mSpanCount>
	//*  35   71:icmpge          101
						if(mSpans[k].mViews.size() == 1)
	//*  36   74:aload_0         
	//*  37   75:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//*  38   78:iload           4
	//*  39   80:aaload          
	//*  40   81:getfield        #271 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//*  41   84:invokevirtual   #276 <Method int ArrayList.size()>
	//*  42   87:iconst_1        
	//*  43   88:icmpne          92
							return;
	//   44   91:return          

	//   45   92:iload           4
	//   46   94:iconst_1        
	//   47   95:iadd            
	//   48   96:istore          4
	//*  49   98:goto            65
					for(int l = 0; l < mSpanCount; l++)
	//*  50  101:iconst_0        
	//*  51  102:istore          4
	//*  52  104:iload           4
	//*  53  106:aload_0         
	//*  54  107:getfield        #93  <Field int mSpanCount>
	//*  55  110:icmpge          132
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
				} else
	//*  65  129:goto            104
	//*  66  132:goto            159
				{
					if(layoutparams.mSpan.mViews.size() == 1)
	//*  67  135:aload           6
	//*  68  137:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//*  69  140:getfield        #271 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//*  70  143:invokevirtual   #276 <Method int ArrayList.size()>
	//*  71  146:iconst_1        
	//*  72  147:icmpne          151
						return;
	//   73  150:return          
					layoutparams.mSpan.popEnd();
	//   74  151:aload           6
	//   75  153:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//   76  156:invokevirtual   #691 <Method void StaggeredGridLayoutManager$Span.popEnd()>
				}
				removeAndRecycleView(view, recycler);
	//   77  159:aload_0         
	//   78  160:aload           5
	//   79  162:aload_1         
	//   80  163:invokevirtual   #695 <Method void removeAndRecycleView(View, RecyclerView$Recycler)>
			} else
	//*  81  166:goto            170
			{
				return;
	//   82  169:return          
			}
		}

	//   83  170:iload_3         
	//   84  171:iconst_1        
	//   85  172:isub            
	//   86  173:istore_3        
	//*  87  174:goto            7
	//   88  177:return          
	}

	private void recycleFromStart(RecyclerView.Recycler recycler, int i)
	{
		while(getChildCount() > 0) 
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #259 <Method int getChildCount()>
	//*   2    4:ifle            159
		{
			View view = getChildAt(0);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #475 <Method View getChildAt(int)>
	//    6   12:astore          4
			if(mPrimaryOrientation.getDecoratedEnd(view) <= i && mPrimaryOrientation.getTransformedEndWithDecoration(view) <= i)
	//*   7   14:aload_0         
	//*   8   15:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//*   9   18:aload           4
	//*  10   20:invokevirtual   #698 <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  11   23:iload_2         
	//*  12   24:icmpgt          155
	//*  13   27:aload_0         
	//*  14   28:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//*  15   31:aload           4
	//*  16   33:invokevirtual   #701 <Method int OrientationHelper.getTransformedEndWithDecoration(View)>
	//*  17   36:iload_2         
	//*  18   37:icmpgt          155
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   19   40:aload           4
	//   20   42:invokevirtual   #372 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   21   45:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//   22   48:astore          5
				if(layoutparams.mFullSpan)
	//*  23   50:aload           5
	//*  24   52:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*  25   55:ifeq            121
				{
					for(int j = 0; j < mSpanCount; j++)
	//*  26   58:iconst_0        
	//*  27   59:istore_3        
	//*  28   60:iload_3         
	//*  29   61:aload_0         
	//*  30   62:getfield        #93  <Field int mSpanCount>
	//*  31   65:icmpge          92
						if(mSpans[j].mViews.size() == 1)
	//*  32   68:aload_0         
	//*  33   69:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//*  34   72:iload_3         
	//*  35   73:aaload          
	//*  36   74:getfield        #271 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//*  37   77:invokevirtual   #276 <Method int ArrayList.size()>
	//*  38   80:iconst_1        
	//*  39   81:icmpne          85
							return;
	//   40   84:return          

	//   41   85:iload_3         
	//   42   86:iconst_1        
	//   43   87:iadd            
	//   44   88:istore_3        
	//*  45   89:goto            60
					for(int k = 0; k < mSpanCount; k++)
	//*  46   92:iconst_0        
	//*  47   93:istore_3        
	//*  48   94:iload_3         
	//*  49   95:aload_0         
	//*  50   96:getfield        #93  <Field int mSpanCount>
	//*  51   99:icmpge          118
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
				} else
	//*  61  115:goto            94
	//*  62  118:goto            145
				{
					if(layoutparams.mSpan.mViews.size() == 1)
	//*  63  121:aload           5
	//*  64  123:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//*  65  126:getfield        #271 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//*  66  129:invokevirtual   #276 <Method int ArrayList.size()>
	//*  67  132:iconst_1        
	//*  68  133:icmpne          137
						return;
	//   69  136:return          
					layoutparams.mSpan.popStart();
	//   70  137:aload           5
	//   71  139:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//   72  142:invokevirtual   #704 <Method void StaggeredGridLayoutManager$Span.popStart()>
				}
				removeAndRecycleView(view, recycler);
	//   73  145:aload_0         
	//   74  146:aload           4
	//   75  148:aload_1         
	//   76  149:invokevirtual   #695 <Method void removeAndRecycleView(View, RecyclerView$Recycler)>
			} else
	//*  77  152:goto            156
			{
				return;
	//   78  155:return          
			}
		}
	//*  79  156:goto            0
	//   80  159:return          
	}

	private void repositionToWrapContentIfNecessary()
	{
		if(mSecondaryOrientation.getMode() == 0x40000000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field OrientationHelper mSecondaryOrientation>
	//*   2    4:invokevirtual   #707 <Method int OrientationHelper.getMode()>
	//*   3    7:ldc2            #708 <Int 0x40000000>
	//*   4   10:icmpne          14
			return;
	//    5   13:return          
		float f = 0.0F;
	//    6   14:fconst_0        
	//    7   15:fstore_1        
		int j1 = getChildCount();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #259 <Method int getChildCount()>
	//   10   20:istore          6
		for(int i = 0; i < j1; i++)
	//*  11   22:iconst_0        
	//*  12   23:istore          4
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
	//   23   46:invokevirtual   #403 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   24   49:i2f             
	//   25   50:fstore_3        
			if(f2 < f)
	//*  26   51:fload_3         
	//*  27   52:fload_1         
	//*  28   53:fcmpg           
	//*  29   54:ifge            60
				continue;
	//   30   57:goto            92
			float f1 = f2;
	//   31   60:fload_3         
	//   32   61:fstore_2        
			if(((LayoutParams)view.getLayoutParams()).isFullSpan())
	//*  33   62:aload           9
	//*  34   64:invokevirtual   #372 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  35   67:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//*  36   70:invokevirtual   #711 <Method boolean StaggeredGridLayoutManager$LayoutParams.isFullSpan()>
	//*  37   73:ifeq            86
				f1 = (1.0F * f2) / (float)mSpanCount;
	//   38   76:fconst_1        
	//   39   77:fload_3         
	//   40   78:fmul            
	//   41   79:aload_0         
	//   42   80:getfield        #93  <Field int mSpanCount>
	//   43   83:i2f             
	//   44   84:fdiv            
	//   45   85:fstore_2        
			f = Math.max(f, f1);
	//   46   86:fload_1         
	//   47   87:fload_2         
	//   48   88:invokestatic    #715 <Method float Math.max(float, float)>
	//   49   91:fstore_1        
		}

	//   50   92:iload           4
	//   51   94:iconst_1        
	//   52   95:iadd            
	//   53   96:istore          4
	//*  54   98:goto            25
		int k1 = mSizePerSpan;
	//   55  101:aload_0         
	//   56  102:getfield        #442 <Field int mSizePerSpan>
	//   57  105:istore          7
		int l = Math.round((float)mSpanCount * f);
	//   58  107:aload_0         
	//   59  108:getfield        #93  <Field int mSpanCount>
	//   60  111:i2f             
	//   61  112:fload_1         
	//   62  113:fmul            
	//   63  114:invokestatic    #719 <Method int Math.round(float)>
	//   64  117:istore          5
		int j = l;
	//   65  119:iload           5
	//   66  121:istore          4
		if(mSecondaryOrientation.getMode() == 0x80000000)
	//*  67  123:aload_0         
	//*  68  124:getfield        #332 <Field OrientationHelper mSecondaryOrientation>
	//*  69  127:invokevirtual   #707 <Method int OrientationHelper.getMode()>
	//*  70  130:ldc1            #43  <Int 0x80000000>
	//*  71  132:icmpne          149
			j = Math.min(l, mSecondaryOrientation.getTotalSpace());
	//   72  135:iload           5
	//   73  137:aload_0         
	//   74  138:getfield        #332 <Field OrientationHelper mSecondaryOrientation>
	//   75  141:invokevirtual   #632 <Method int OrientationHelper.getTotalSpace()>
	//   76  144:invokestatic    #470 <Method int Math.min(int, int)>
	//   77  147:istore          4
		updateMeasureSpecs(j);
	//   78  149:aload_0         
	//   79  150:iload           4
	//   80  152:invokevirtual   #635 <Method void updateMeasureSpecs(int)>
		if(mSizePerSpan == k1)
	//*  81  155:aload_0         
	//*  82  156:getfield        #442 <Field int mSizePerSpan>
	//*  83  159:iload           7
	//*  84  161:icmpne          165
			return;
	//   85  164:return          
		for(int k = 0; k < j1; k++)
	//*  86  165:iconst_0        
	//*  87  166:istore          4
	//*  88  168:iload           4
	//*  89  170:iload           6
	//*  90  172:icmpge          336
		{
			View view1 = getChildAt(k);
	//   91  175:aload_0         
	//   92  176:iload           4
	//   93  178:invokevirtual   #475 <Method View getChildAt(int)>
	//   94  181:astore          9
			LayoutParams layoutparams = (LayoutParams)view1.getLayoutParams();
	//   95  183:aload           9
	//   96  185:invokevirtual   #372 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   97  188:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//   98  191:astore          10
			if(layoutparams.mFullSpan)
	//*  99  193:aload           10
	//* 100  195:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 101  198:ifeq            204
				continue;
	//  102  201:goto            327
			if(isLayoutRTL() && mOrientation == 1)
	//* 103  204:aload_0         
	//* 104  205:invokevirtual   #315 <Method boolean isLayoutRTL()>
	//* 105  208:ifeq            268
	//* 106  211:aload_0         
	//* 107  212:getfield        #125 <Field int mOrientation>
	//* 108  215:iconst_1        
	//* 109  216:icmpne          268
			{
				view1.offsetLeftAndRight(-(mSpanCount - 1 - layoutparams.mSpan.mIndex) * mSizePerSpan - -(mSpanCount - 1 - layoutparams.mSpan.mIndex) * k1);
	//  110  219:aload           9
	//  111  221:aload_0         
	//  112  222:getfield        #93  <Field int mSpanCount>
	//  113  225:iconst_1        
	//  114  226:isub            
	//  115  227:aload           10
	//  116  229:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//  117  232:getfield        #440 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//  118  235:isub            
	//  119  236:ineg            
	//  120  237:aload_0         
	//  121  238:getfield        #442 <Field int mSizePerSpan>
	//  122  241:imul            
	//  123  242:aload_0         
	//  124  243:getfield        #93  <Field int mSpanCount>
	//  125  246:iconst_1        
	//  126  247:isub            
	//  127  248:aload           10
	//  128  250:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//  129  253:getfield        #440 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//  130  256:isub            
	//  131  257:ineg            
	//  132  258:iload           7
	//  133  260:imul            
	//  134  261:isub            
	//  135  262:invokevirtual   #722 <Method void View.offsetLeftAndRight(int)>
				continue;
	//  136  265:goto            327
			}
			int i1 = layoutparams.mSpan.mIndex * mSizePerSpan;
	//  137  268:aload           10
	//  138  270:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//  139  273:getfield        #440 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//  140  276:aload_0         
	//  141  277:getfield        #442 <Field int mSizePerSpan>
	//  142  280:imul            
	//  143  281:istore          5
			int l1 = layoutparams.mSpan.mIndex * k1;
	//  144  283:aload           10
	//  145  285:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//  146  288:getfield        #440 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//  147  291:iload           7
	//  148  293:imul            
	//  149  294:istore          8
			if(mOrientation == 1)
	//* 150  296:aload_0         
	//* 151  297:getfield        #125 <Field int mOrientation>
	//* 152  300:iconst_1        
	//* 153  301:icmpne          317
				view1.offsetLeftAndRight(i1 - l1);
	//  154  304:aload           9
	//  155  306:iload           5
	//  156  308:iload           8
	//  157  310:isub            
	//  158  311:invokevirtual   #722 <Method void View.offsetLeftAndRight(int)>
			else
	//* 159  314:goto            327
				view1.offsetTopAndBottom(i1 - l1);
	//  160  317:aload           9
	//  161  319:iload           5
	//  162  321:iload           8
	//  163  323:isub            
	//  164  324:invokevirtual   #725 <Method void View.offsetTopAndBottom(int)>
		}

	//  165  327:iload           4
	//  166  329:iconst_1        
	//  167  330:iadd            
	//  168  331:istore          4
	//* 169  333:goto            168
	//  170  336:return          
	}

	private void resolveShouldLayoutReverse()
	{
		if(mOrientation == 1 || !isLayoutRTL())
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field int mOrientation>
	//*   2    4:iconst_1        
	//*   3    5:icmpeq          15
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #315 <Method boolean isLayoutRTL()>
	//*   6   12:ifne            24
		{
			mShouldReverseLayout = mReverseLayout;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #95  <Field boolean mReverseLayout>
	//   10   20:putfield        #97  <Field boolean mShouldReverseLayout>
			return;
	//   11   23:return          
		}
		boolean flag;
		if(!mReverseLayout)
	//*  12   24:aload_0         
	//*  13   25:getfield        #95  <Field boolean mReverseLayout>
	//*  14   28:ifne            36
			flag = true;
	//   15   31:iconst_1        
	//   16   32:istore_1        
		else
	//*  17   33:goto            38
			flag = false;
	//   18   36:iconst_0        
	//   19   37:istore_1        
		mShouldReverseLayout = flag;
	//   20   38:aload_0         
	//   21   39:iload_1         
	//   22   40:putfield        #97  <Field boolean mShouldReverseLayout>
	//   23   43:return          
	}

	private void setLayoutStateDirection(int i)
	{
		mLayoutState.mLayoutDirection = i;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field LayoutState mLayoutState>
	//    2    4:iload_1         
	//    3    5:putfield        #239 <Field int LayoutState.mLayoutDirection>
		LayoutState layoutstate = mLayoutState;
	//    4    8:aload_0         
	//    5    9:getfield        #138 <Field LayoutState mLayoutState>
	//    6   12:astore          4
		boolean flag1 = mShouldReverseLayout;
	//    7   14:aload_0         
	//    8   15:getfield        #97  <Field boolean mShouldReverseLayout>
	//    9   18:istore_3        
		boolean flag;
		if(i == -1)
	//*  10   19:iload_1         
	//*  11   20:iconst_m1       
	//*  12   21:icmpne          29
			flag = true;
	//   13   24:iconst_1        
	//   14   25:istore_2        
		else
	//*  15   26:goto            31
			flag = false;
	//   16   29:iconst_0        
	//   17   30:istore_2        
		if(flag1 == flag)
	//*  18   31:iload_3         
	//*  19   32:iload_2         
	//*  20   33:icmpne          41
			i = 1;
	//   21   36:iconst_1        
	//   22   37:istore_1        
		else
	//*  23   38:goto            43
			i = -1;
	//   24   41:iconst_m1       
	//   25   42:istore_1        
		layoutstate.mItemDirection = i;
	//   26   43:aload           4
	//   27   45:iload_1         
	//   28   46:putfield        #423 <Field int LayoutState.mItemDirection>
	//   29   49:return          
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
	//*   7   11:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//*   8   14:iload_3         
	//*   9   15:aaload          
	//*  10   16:getfield        #271 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//*  11   19:invokevirtual   #726 <Method boolean ArrayList.isEmpty()>
	//*  12   22:ifeq            28
	//*  13   25:goto            40
				updateRemainingSpans(mSpans[k], i, j);
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   17   33:iload_3         
	//   18   34:aaload          
	//   19   35:iload_1         
	//   20   36:iload_2         
	//   21   37:invokespecial   #450 <Method void updateRemainingSpans(StaggeredGridLayoutManager$Span, int, int)>

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
	//*   1    1:getfield        #605 <Field boolean mLastLayoutFromEnd>
	//*   2    4:ifeq            19
			i = findLastReferenceChildPosition(state.getItemCount());
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #587 <Method int RecyclerView$State.getItemCount()>
	//    6   12:invokespecial   #730 <Method int findLastReferenceChildPosition(int)>
	//    7   15:istore_3        
		else
	//*   8   16:goto            28
			i = findFirstReferenceChildPosition(state.getItemCount());
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #587 <Method int RecyclerView$State.getItemCount()>
	//   12   24:invokespecial   #732 <Method int findFirstReferenceChildPosition(int)>
	//   13   27:istore_3        
		anchorinfo.mPosition = i;
	//   14   28:aload_2         
	//   15   29:iload_3         
	//   16   30:putfield        #636 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
		anchorinfo.mOffset = 0x80000000;
	//   17   33:aload_2         
	//   18   34:ldc1            #43  <Int 0x80000000>
	//   19   36:putfield        #612 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
		return true;
	//   20   39:iconst_1        
	//   21   40:ireturn         
	}

	private void updateLayoutState(int i, RecyclerView.State state)
	{
		mLayoutState.mAvailable = 0;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field LayoutState mLayoutState>
	//    2    4:iconst_0        
	//    3    5:putfield        #352 <Field int LayoutState.mAvailable>
		mLayoutState.mCurrentPosition = i;
	//    4    8:aload_0         
	//    5    9:getfield        #138 <Field LayoutState mLayoutState>
	//    6   12:iload_1         
	//    7   13:putfield        #648 <Field int LayoutState.mCurrentPosition>
		boolean flag = false;
	//    8   16:iconst_0        
	//    9   17:istore          5
		boolean flag1 = false;
	//   10   19:iconst_0        
	//   11   20:istore          6
		int j = ((int) (flag));
	//   12   22:iload           5
	//   13   24:istore_3        
		int k = ((int) (flag1));
	//   14   25:iload           6
	//   15   27:istore          4
		if(isSmoothScrolling())
	//*  16   29:aload_0         
	//*  17   30:invokevirtual   #735 <Method boolean isSmoothScrolling()>
	//*  18   33:ifeq            110
		{
			int l = state.getTargetScrollPosition();
	//   19   36:aload_2         
	//   20   37:invokevirtual   #738 <Method int RecyclerView$State.getTargetScrollPosition()>
	//   21   40:istore          7
			j = ((int) (flag));
	//   22   42:iload           5
	//   23   44:istore_3        
			k = ((int) (flag1));
	//   24   45:iload           6
	//   25   47:istore          4
			if(l != -1)
	//*  26   49:iload           7
	//*  27   51:iconst_m1       
	//*  28   52:icmpeq          110
			{
				boolean flag4 = mShouldReverseLayout;
	//   29   55:aload_0         
	//   30   56:getfield        #97  <Field boolean mShouldReverseLayout>
	//   31   59:istore          9
				boolean flag2;
				if(l < i)
	//*  32   61:iload           7
	//*  33   63:iload_1         
	//*  34   64:icmpge          73
					flag2 = true;
	//   35   67:iconst_1        
	//   36   68:istore          8
				else
	//*  37   70:goto            76
					flag2 = false;
	//   38   73:iconst_0        
	//   39   74:istore          8
				if(flag4 == flag2)
	//*  40   76:iload           9
	//*  41   78:iload           8
	//*  42   80:icmpne          98
				{
					k = mPrimaryOrientation.getTotalSpace();
	//   43   83:aload_0         
	//   44   84:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   45   87:invokevirtual   #632 <Method int OrientationHelper.getTotalSpace()>
	//   46   90:istore          4
					j = ((int) (flag));
	//   47   92:iload           5
	//   48   94:istore_3        
				} else
	//*  49   95:goto            110
				{
					j = mPrimaryOrientation.getTotalSpace();
	//   50   98:aload_0         
	//   51   99:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   52  102:invokevirtual   #632 <Method int OrientationHelper.getTotalSpace()>
	//   53  105:istore_3        
					k = ((int) (flag1));
	//   54  106:iload           6
	//   55  108:istore          4
				}
			}
		}
		if(getClipToPadding())
	//*  56  110:aload_0         
	//*  57  111:invokevirtual   #741 <Method boolean getClipToPadding()>
	//*  58  114:ifeq            153
		{
			mLayoutState.mStartLine = mPrimaryOrientation.getStartAfterPadding() - j;
	//   59  117:aload_0         
	//   60  118:getfield        #138 <Field LayoutState mLayoutState>
	//   61  121:aload_0         
	//   62  122:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   63  125:invokevirtual   #198 <Method int OrientationHelper.getStartAfterPadding()>
	//   64  128:iload_3         
	//   65  129:isub            
	//   66  130:putfield        #355 <Field int LayoutState.mStartLine>
			mLayoutState.mEndLine = mPrimaryOrientation.getEndAfterPadding() + k;
	//   67  133:aload_0         
	//   68  134:getfield        #138 <Field LayoutState mLayoutState>
	//   69  137:aload_0         
	//   70  138:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   71  141:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//   72  144:iload           4
	//   73  146:iadd            
	//   74  147:putfield        #349 <Field int LayoutState.mEndLine>
		} else
	//*  75  150:goto            179
		{
			mLayoutState.mEndLine = mPrimaryOrientation.getEnd() + k;
	//   76  153:aload_0         
	//   77  154:getfield        #138 <Field LayoutState mLayoutState>
	//   78  157:aload_0         
	//   79  158:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   80  161:invokevirtual   #744 <Method int OrientationHelper.getEnd()>
	//   81  164:iload           4
	//   82  166:iadd            
	//   83  167:putfield        #349 <Field int LayoutState.mEndLine>
			mLayoutState.mStartLine = -j;
	//   84  170:aload_0         
	//   85  171:getfield        #138 <Field LayoutState mLayoutState>
	//   86  174:iload_3         
	//   87  175:ineg            
	//   88  176:putfield        #355 <Field int LayoutState.mStartLine>
		}
		mLayoutState.mStopInFocusable = false;
	//   89  179:aload_0         
	//   90  180:getfield        #138 <Field LayoutState mLayoutState>
	//   91  183:iconst_0        
	//   92  184:putfield        #457 <Field boolean LayoutState.mStopInFocusable>
		mLayoutState.mRecycle = true;
	//   93  187:aload_0         
	//   94  188:getfield        #138 <Field LayoutState mLayoutState>
	//   95  191:iconst_1        
	//   96  192:putfield        #629 <Field boolean LayoutState.mRecycle>
		state = ((RecyclerView.State) (mLayoutState));
	//   97  195:aload_0         
	//   98  196:getfield        #138 <Field LayoutState mLayoutState>
	//   99  199:astore_2        
		boolean flag3;
		if(mPrimaryOrientation.getMode() == 0 && mPrimaryOrientation.getEnd() == 0)
	//* 100  200:aload_0         
	//* 101  201:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//* 102  204:invokevirtual   #707 <Method int OrientationHelper.getMode()>
	//* 103  207:ifne            226
	//* 104  210:aload_0         
	//* 105  211:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//* 106  214:invokevirtual   #744 <Method int OrientationHelper.getEnd()>
	//* 107  217:ifne            226
			flag3 = true;
	//  108  220:iconst_1        
	//  109  221:istore          8
		else
	//* 110  223:goto            229
			flag3 = false;
	//  111  226:iconst_0        
	//  112  227:istore          8
		state.mInfinite = flag3;
	//  113  229:aload_2         
	//  114  230:iload           8
	//  115  232:putfield        #345 <Field boolean LayoutState.mInfinite>
	//  116  235:return          
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
	//   15   27:getfield        #440 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//   16   30:iconst_0        
	//   17   31:invokevirtual   #464 <Method void BitSet.set(int, boolean)>
			return;
	//   18   34:return          
		}
		if(span.getEndLine() - k >= j)
	//*  19   35:aload_1         
	//*  20   36:invokevirtual   #267 <Method int StaggeredGridLayoutManager$Span.getEndLine()>
	//*  21   39:iload           4
	//*  22   41:isub            
	//*  23   42:iload_3         
	//*  24   43:icmplt          58
			mRemainingSpans.set(span.mIndex, false);
	//   25   46:aload_0         
	//   26   47:getfield        #336 <Field BitSet mRemainingSpans>
	//   27   50:aload_1         
	//   28   51:getfield        #440 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//   29   54:iconst_0        
	//   30   55:invokevirtual   #464 <Method void BitSet.set(int, boolean)>
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
	//    7   11:invokestatic    #751 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    8   14:istore          4
		if(l == 0x80000000 || l == 0x40000000)
	//*   9   16:iload           4
	//*  10   18:ldc1            #43  <Int 0x80000000>
	//*  11   20:icmpeq          31
	//*  12   23:iload           4
	//*  13   25:ldc2            #708 <Int 0x40000000>
	//*  14   28:icmpne          49
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
		else
			return i;
	//   26   49:iload_1         
	//   27   50:ireturn         
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
	//*  13   27:ifeq            43
		{
			i = getLastChildPosition();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #500 <Method int getLastChildPosition()>
	//   16   34:istore_1        
			j = getFirstChildPosition();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #262 <Method int getFirstChildPosition()>
	//   19   39:istore_2        
		} else
	//*  20   40:goto            53
		{
			i = getFirstChildPosition();
	//   21   43:aload_0         
	//   22   44:invokevirtual   #262 <Method int getFirstChildPosition()>
	//   23   47:istore_1        
			j = getLastChildPosition();
	//   24   48:aload_0         
	//   25   49:invokevirtual   #500 <Method int getLastChildPosition()>
	//   26   52:istore_2        
		}
		if(i == 0 && hasGapsToFix() != null)
	//*  27   53:iload_1         
	//*  28   54:ifne            81
	//*  29   57:aload_0         
	//*  30   58:invokevirtual   #662 <Method View hasGapsToFix()>
	//*  31   61:ifnull          81
		{
			mLazySpanLookup.clear();
	//   32   64:aload_0         
	//   33   65:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   34   68:invokevirtual   #606 <Method void StaggeredGridLayoutManager$LazySpanLookup.clear()>
			requestSimpleAnimationsInNextLayout();
	//   35   71:aload_0         
	//   36   72:invokevirtual   #771 <Method void requestSimpleAnimationsInNextLayout()>
			requestLayout();
	//   37   75:aload_0         
	//   38   76:invokevirtual   #512 <Method void requestLayout()>
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
		LazySpanLookup.FullSpanItem fullspanitem = mLazySpanLookup.getFirstFullSpanItemInRange(i, j + 1, ((int) (byte0)), true);
	//   54  104:aload_0         
	//   55  105:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   56  108:iload_1         
	//   57  109:iload_2         
	//   58  110:iconst_1        
	//   59  111:iadd            
	//   60  112:iload_3         
	//   61  113:iconst_1        
	//   62  114:invokevirtual   #775 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem StaggeredGridLayoutManager$LazySpanLookup.getFirstFullSpanItemInRange(int, int, int, boolean)>
	//   63  117:astore          4
		if(fullspanitem == null)
	//*  64  119:aload           4
	//*  65  121:ifnonnull       142
		{
			mLaidOutInvalidFullSpan = false;
	//   66  124:aload_0         
	//   67  125:iconst_0        
	//   68  126:putfield        #118 <Field boolean mLaidOutInvalidFullSpan>
			mLazySpanLookup.forceInvalidateAfter(j + 1);
	//   69  129:aload_0         
	//   70  130:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   71  133:iload_2         
	//   72  134:iconst_1        
	//   73  135:iadd            
	//   74  136:invokevirtual   #778 <Method int StaggeredGridLayoutManager$LazySpanLookup.forceInvalidateAfter(int)>
	//   75  139:pop             
			return false;
	//   76  140:iconst_0        
	//   77  141:ireturn         
		}
		LazySpanLookup.FullSpanItem fullspanitem1 = mLazySpanLookup.getFirstFullSpanItemInRange(i, fullspanitem.mPosition, byte0 * -1, true);
	//   78  142:aload_0         
	//   79  143:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   80  146:iload_1         
	//   81  147:aload           4
	//   82  149:getfield        #411 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//   83  152:iload_3         
	//   84  153:iconst_m1       
	//   85  154:imul            
	//   86  155:iconst_1        
	//   87  156:invokevirtual   #775 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem StaggeredGridLayoutManager$LazySpanLookup.getFirstFullSpanItemInRange(int, int, int, boolean)>
	//   88  159:astore          5
		if(fullspanitem1 == null)
	//*  89  161:aload           5
	//*  90  163:ifnonnull       182
			mLazySpanLookup.forceInvalidateAfter(fullspanitem.mPosition);
	//   91  166:aload_0         
	//   92  167:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   93  170:aload           4
	//   94  172:getfield        #411 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//   95  175:invokevirtual   #778 <Method int StaggeredGridLayoutManager$LazySpanLookup.forceInvalidateAfter(int)>
	//   96  178:pop             
		else
	//*  97  179:goto            197
			mLazySpanLookup.forceInvalidateAfter(fullspanitem1.mPosition + 1);
	//   98  182:aload_0         
	//   99  183:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//  100  186:aload           5
	//  101  188:getfield        #411 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//  102  191:iconst_1        
	//  103  192:iadd            
	//  104  193:invokevirtual   #778 <Method int StaggeredGridLayoutManager$LazySpanLookup.forceInvalidateAfter(int)>
	//  105  196:pop             
		requestSimpleAnimationsInNextLayout();
	//  106  197:aload_0         
	//  107  198:invokevirtual   #771 <Method void requestSimpleAnimationsInNextLayout()>
		requestLayout();
	//  108  201:aload_0         
	//  109  202:invokevirtual   #512 <Method void requestLayout()>
		return true;
	//  110  205:iconst_1        
	//  111  206:ireturn         
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
		if(getChildCount() == 0 || i == 0)
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #259 <Method int getChildCount()>
	//*   8   16:ifeq            23
	//*   9   19:iload_1         
	//*  10   20:ifne            24
			return;
	//   11   23:return          
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
		for(j = 0; j < mSpanCount;)
	//*  32   61:iconst_0        
	//*  33   62:istore_2        
	//*  34   63:iload_2         
	//*  35   64:aload_0         
	//*  36   65:getfield        #93  <Field int mSpanCount>
	//*  37   68:icmpge          168
		{
			int l;
			if(mLayoutState.mItemDirection == -1)
	//*  38   71:aload_0         
	//*  39   72:getfield        #138 <Field LayoutState mLayoutState>
	//*  40   75:getfield        #423 <Field int LayoutState.mItemDirection>
	//*  41   78:iconst_m1       
	//*  42   79:icmpne          111
				l = mLayoutState.mStartLine - mSpans[j].getStartLine(mLayoutState.mStartLine);
	//   43   82:aload_0         
	//   44   83:getfield        #138 <Field LayoutState mLayoutState>
	//   45   86:getfield        #355 <Field int LayoutState.mStartLine>
	//   46   89:aload_0         
	//   47   90:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   48   93:iload_2         
	//   49   94:aaload          
	//   50   95:aload_0         
	//   51   96:getfield        #138 <Field LayoutState mLayoutState>
	//   52   99:getfield        #355 <Field int LayoutState.mStartLine>
	//   53  102:invokevirtual   #326 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
	//   54  105:isub            
	//   55  106:istore          6
			else
	//*  56  108:goto            137
				l = mSpans[j].getEndLine(mLayoutState.mEndLine) - mLayoutState.mEndLine;
	//   57  111:aload_0         
	//   58  112:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   59  115:iload_2         
	//   60  116:aaload          
	//   61  117:aload_0         
	//   62  118:getfield        #138 <Field LayoutState mLayoutState>
	//   63  121:getfield        #349 <Field int LayoutState.mEndLine>
	//   64  124:invokevirtual   #323 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
	//   65  127:aload_0         
	//   66  128:getfield        #138 <Field LayoutState mLayoutState>
	//   67  131:getfield        #349 <Field int LayoutState.mEndLine>
	//   68  134:isub            
	//   69  135:istore          6
			int k = i;
	//   70  137:iload_1         
	//   71  138:istore          5
			if(l >= 0)
	//*  72  140:iload           6
	//*  73  142:iflt            158
			{
				mPrefetchDistances[i] = l;
	//   74  145:aload_0         
	//   75  146:getfield        #787 <Field int[] mPrefetchDistances>
	//   76  149:iload_1         
	//   77  150:iload           6
	//   78  152:iastore         
				k = i + 1;
	//   79  153:iload_1         
	//   80  154:iconst_1        
	//   81  155:iadd            
	//   82  156:istore          5
			}
			j++;
	//   83  158:iload_2         
	//   84  159:iconst_1        
	//   85  160:iadd            
	//   86  161:istore_2        
			i = k;
	//   87  162:iload           5
	//   88  164:istore_1        
		}

	//*  89  165:goto            63
		Arrays.sort(mPrefetchDistances, 0, i);
	//   90  168:aload_0         
	//   91  169:getfield        #787 <Field int[] mPrefetchDistances>
	//   92  172:iconst_0        
	//   93  173:iload_1         
	//   94  174:invokestatic    #793 <Method void Arrays.sort(int[], int, int)>
		for(j = 0; j < i && mLayoutState.hasMore(state); j++)
	//*  95  177:iconst_0        
	//*  96  178:istore_2        
	//*  97  179:iload_2         
	//*  98  180:iload_1         
	//*  99  181:icmpge          246
	//* 100  184:aload_0         
	//* 101  185:getfield        #138 <Field LayoutState mLayoutState>
	//* 102  188:aload_3         
	//* 103  189:invokevirtual   #362 <Method boolean LayoutState.hasMore(RecyclerView$State)>
	//* 104  192:ifeq            246
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
	//  122  232:getfield        #423 <Field int LayoutState.mItemDirection>
	//  123  235:iadd            
	//  124  236:putfield        #648 <Field int LayoutState.mCurrentPosition>
		}

	//  125  239:iload_2         
	//  126  240:iconst_1        
	//  127  241:iadd            
	//  128  242:istore_2        
	//* 129  243:goto            179
	//  130  246:return          
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
	//*   6   11:goto            67
		{
			ai1 = ai;
	//    7   14:aload_1         
	//    8   15:astore_3        
			if(ai.length < mSpanCount)
	//*   9   16:aload_1         
	//*  10   17:arraylength     
	//*  11   18:aload_0         
	//*  12   19:getfield        #93  <Field int mSpanCount>
	//*  13   22:icmpge          67
				throw new IllegalArgumentException((new StringBuilder()).append("Provided int[]'s size must be more than or equal to span count. Expected:").append(mSpanCount).append(", array size:").append(ai.length).toString());
	//   14   25:new             #827 <Class IllegalArgumentException>
	//   15   28:dup             
	//   16   29:new             #829 <Class StringBuilder>
	//   17   32:dup             
	//   18   33:invokespecial   #830 <Method void StringBuilder()>
	//   19   36:ldc2            #832 <String "Provided int[]'s size must be more than or equal to span count. Expected:">
	//   20   39:invokevirtual   #836 <Method StringBuilder StringBuilder.append(String)>
	//   21   42:aload_0         
	//   22   43:getfield        #93  <Field int mSpanCount>
	//   23   46:invokevirtual   #839 <Method StringBuilder StringBuilder.append(int)>
	//   24   49:ldc2            #841 <String ", array size:">
	//   25   52:invokevirtual   #836 <Method StringBuilder StringBuilder.append(String)>
	//   26   55:aload_1         
	//   27   56:arraylength     
	//   28   57:invokevirtual   #839 <Method StringBuilder StringBuilder.append(int)>
	//   29   60:invokevirtual   #845 <Method String StringBuilder.toString()>
	//   30   63:invokespecial   #847 <Method void IllegalArgumentException(String)>
	//   31   66:athrow          
		}
		for(int i = 0; i < mSpanCount; i++)
	//*  32   67:iconst_0        
	//*  33   68:istore_2        
	//*  34   69:iload_2         
	//*  35   70:aload_0         
	//*  36   71:getfield        #93  <Field int mSpanCount>
	//*  37   74:icmpge          96
			ai1[i] = mSpans[i].findFirstCompletelyVisibleItemPosition();
	//   38   77:aload_3         
	//   39   78:iload_2         
	//   40   79:aload_0         
	//   41   80:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   42   83:iload_2         
	//   43   84:aaload          
	//   44   85:invokevirtual   #850 <Method int StaggeredGridLayoutManager$Span.findFirstCompletelyVisibleItemPosition()>
	//   45   88:iastore         

	//   46   89:iload_2         
	//   47   90:iconst_1        
	//   48   91:iadd            
	//   49   92:istore_2        
	//*  50   93:goto            69
		return ai1;
	//   51   96:aload_3         
	//   52   97:areturn         
	}

	View findFirstVisibleItemClosestToEnd(boolean flag)
	{
		int j = mPrimaryOrientation.getStartAfterPadding();
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//    2    4:invokevirtual   #198 <Method int OrientationHelper.getStartAfterPadding()>
	//    3    7:istore_3        
		int k = mPrimaryOrientation.getEndAfterPadding();
	//    4    8:aload_0         
	//    5    9:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//    6   12:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//    7   15:istore          4
		View view = null;
	//    8   17:aconst_null     
	//    9   18:astore          7
		for(int i = getChildCount() - 1; i >= 0;)
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #259 <Method int getChildCount()>
	//*  12   24:iconst_1        
	//*  13   25:isub            
	//*  14   26:istore_2        
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
	//*  35   67:icmple          111
				if(l >= k)
	//*  36   70:iload           5
	//*  37   72:iload           4
	//*  38   74:icmplt          84
				{
					view1 = view;
	//   39   77:aload           7
	//   40   79:astore          8
				} else
	//*  41   81:goto            111
				{
					if(i1 <= k || !flag)
	//*  42   84:iload           6
	//*  43   86:iload           4
	//*  44   88:icmple          95
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
	//*  52  104:ifnonnull       111
						view1 = view2;
	//   53  107:aload           9
	//   54  109:astore          8
				}
			i--;
	//   55  111:iload_2         
	//   56  112:iconst_1        
	//   57  113:isub            
	//   58  114:istore_2        
			view = view1;
	//   59  115:aload           8
	//   60  117:astore          7
		}

	//*  61  119:goto            27
		return view;
	//   62  122:aload           7
	//   63  124:areturn         
	}

	View findFirstVisibleItemClosestToStart(boolean flag)
	{
		int j = mPrimaryOrientation.getStartAfterPadding();
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//    2    4:invokevirtual   #198 <Method int OrientationHelper.getStartAfterPadding()>
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
		for(int i = 0; i < l;)
	//*  13   26:iconst_0        
	//*  14   27:istore_2        
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
	//*  34   66:icmple          109
				if(i1 >= k)
	//*  35   69:iload           6
	//*  36   71:iload           4
	//*  37   73:icmplt          83
				{
					view1 = view;
	//   38   76:aload           7
	//   39   78:astore          8
				} else
	//*  40   80:goto            109
				{
					if(i1 >= j || !flag)
	//*  41   83:iload           6
	//*  42   85:iload_3         
	//*  43   86:icmpge          93
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
	//*  51  102:ifnonnull       109
						view1 = view2;
	//   52  105:aload           9
	//   53  107:astore          8
				}
			i++;
	//   54  109:iload_2         
	//   55  110:iconst_1        
	//   56  111:iadd            
	//   57  112:istore_2        
			view = view1;
	//   58  113:aload           8
	//   59  115:astore          7
		}

	//*  60  117:goto            28
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
	//*   2    4:ifeq            16
			view = findFirstVisibleItemClosestToEnd(true);
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:invokevirtual   #298 <Method View findFirstVisibleItemClosestToEnd(boolean)>
	//    6   12:astore_1        
		else
	//*   7   13:goto            22
			view = findFirstVisibleItemClosestToStart(true);
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #295 <Method View findFirstVisibleItemClosestToStart(boolean)>
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
	//   18   30:invokevirtual   #478 <Method int getPosition(View)>
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
	//*   6   11:goto            67
		{
			ai1 = ai;
	//    7   14:aload_1         
	//    8   15:astore_3        
			if(ai.length < mSpanCount)
	//*   9   16:aload_1         
	//*  10   17:arraylength     
	//*  11   18:aload_0         
	//*  12   19:getfield        #93  <Field int mSpanCount>
	//*  13   22:icmpge          67
				throw new IllegalArgumentException((new StringBuilder()).append("Provided int[]'s size must be more than or equal to span count. Expected:").append(mSpanCount).append(", array size:").append(ai.length).toString());
	//   14   25:new             #827 <Class IllegalArgumentException>
	//   15   28:dup             
	//   16   29:new             #829 <Class StringBuilder>
	//   17   32:dup             
	//   18   33:invokespecial   #830 <Method void StringBuilder()>
	//   19   36:ldc2            #832 <String "Provided int[]'s size must be more than or equal to span count. Expected:">
	//   20   39:invokevirtual   #836 <Method StringBuilder StringBuilder.append(String)>
	//   21   42:aload_0         
	//   22   43:getfield        #93  <Field int mSpanCount>
	//   23   46:invokevirtual   #839 <Method StringBuilder StringBuilder.append(int)>
	//   24   49:ldc2            #841 <String ", array size:">
	//   25   52:invokevirtual   #836 <Method StringBuilder StringBuilder.append(String)>
	//   26   55:aload_1         
	//   27   56:arraylength     
	//   28   57:invokevirtual   #839 <Method StringBuilder StringBuilder.append(int)>
	//   29   60:invokevirtual   #845 <Method String StringBuilder.toString()>
	//   30   63:invokespecial   #847 <Method void IllegalArgumentException(String)>
	//   31   66:athrow          
		}
		for(int i = 0; i < mSpanCount; i++)
	//*  32   67:iconst_0        
	//*  33   68:istore_2        
	//*  34   69:iload_2         
	//*  35   70:aload_0         
	//*  36   71:getfield        #93  <Field int mSpanCount>
	//*  37   74:icmpge          96
			ai1[i] = mSpans[i].findFirstVisibleItemPosition();
	//   38   77:aload_3         
	//   39   78:iload_2         
	//   40   79:aload_0         
	//   41   80:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   42   83:iload_2         
	//   43   84:aaload          
	//   44   85:invokevirtual   #855 <Method int StaggeredGridLayoutManager$Span.findFirstVisibleItemPosition()>
	//   45   88:iastore         

	//   46   89:iload_2         
	//   47   90:iconst_1        
	//   48   91:iadd            
	//   49   92:istore_2        
	//*  50   93:goto            69
		return ai1;
	//   51   96:aload_3         
	//   52   97:areturn         
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
	//*   6   11:goto            67
		{
			ai1 = ai;
	//    7   14:aload_1         
	//    8   15:astore_3        
			if(ai.length < mSpanCount)
	//*   9   16:aload_1         
	//*  10   17:arraylength     
	//*  11   18:aload_0         
	//*  12   19:getfield        #93  <Field int mSpanCount>
	//*  13   22:icmpge          67
				throw new IllegalArgumentException((new StringBuilder()).append("Provided int[]'s size must be more than or equal to span count. Expected:").append(mSpanCount).append(", array size:").append(ai.length).toString());
	//   14   25:new             #827 <Class IllegalArgumentException>
	//   15   28:dup             
	//   16   29:new             #829 <Class StringBuilder>
	//   17   32:dup             
	//   18   33:invokespecial   #830 <Method void StringBuilder()>
	//   19   36:ldc2            #832 <String "Provided int[]'s size must be more than or equal to span count. Expected:">
	//   20   39:invokevirtual   #836 <Method StringBuilder StringBuilder.append(String)>
	//   21   42:aload_0         
	//   22   43:getfield        #93  <Field int mSpanCount>
	//   23   46:invokevirtual   #839 <Method StringBuilder StringBuilder.append(int)>
	//   24   49:ldc2            #841 <String ", array size:">
	//   25   52:invokevirtual   #836 <Method StringBuilder StringBuilder.append(String)>
	//   26   55:aload_1         
	//   27   56:arraylength     
	//   28   57:invokevirtual   #839 <Method StringBuilder StringBuilder.append(int)>
	//   29   60:invokevirtual   #845 <Method String StringBuilder.toString()>
	//   30   63:invokespecial   #847 <Method void IllegalArgumentException(String)>
	//   31   66:athrow          
		}
		for(int i = 0; i < mSpanCount; i++)
	//*  32   67:iconst_0        
	//*  33   68:istore_2        
	//*  34   69:iload_2         
	//*  35   70:aload_0         
	//*  36   71:getfield        #93  <Field int mSpanCount>
	//*  37   74:icmpge          96
			ai1[i] = mSpans[i].findLastCompletelyVisibleItemPosition();
	//   38   77:aload_3         
	//   39   78:iload_2         
	//   40   79:aload_0         
	//   41   80:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   42   83:iload_2         
	//   43   84:aaload          
	//   44   85:invokevirtual   #859 <Method int StaggeredGridLayoutManager$Span.findLastCompletelyVisibleItemPosition()>
	//   45   88:iastore         

	//   46   89:iload_2         
	//   47   90:iconst_1        
	//   48   91:iadd            
	//   49   92:istore_2        
	//*  50   93:goto            69
		return ai1;
	//   51   96:aload_3         
	//   52   97:areturn         
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
	//*   6   11:goto            67
		{
			ai1 = ai;
	//    7   14:aload_1         
	//    8   15:astore_3        
			if(ai.length < mSpanCount)
	//*   9   16:aload_1         
	//*  10   17:arraylength     
	//*  11   18:aload_0         
	//*  12   19:getfield        #93  <Field int mSpanCount>
	//*  13   22:icmpge          67
				throw new IllegalArgumentException((new StringBuilder()).append("Provided int[]'s size must be more than or equal to span count. Expected:").append(mSpanCount).append(", array size:").append(ai.length).toString());
	//   14   25:new             #827 <Class IllegalArgumentException>
	//   15   28:dup             
	//   16   29:new             #829 <Class StringBuilder>
	//   17   32:dup             
	//   18   33:invokespecial   #830 <Method void StringBuilder()>
	//   19   36:ldc2            #832 <String "Provided int[]'s size must be more than or equal to span count. Expected:">
	//   20   39:invokevirtual   #836 <Method StringBuilder StringBuilder.append(String)>
	//   21   42:aload_0         
	//   22   43:getfield        #93  <Field int mSpanCount>
	//   23   46:invokevirtual   #839 <Method StringBuilder StringBuilder.append(int)>
	//   24   49:ldc2            #841 <String ", array size:">
	//   25   52:invokevirtual   #836 <Method StringBuilder StringBuilder.append(String)>
	//   26   55:aload_1         
	//   27   56:arraylength     
	//   28   57:invokevirtual   #839 <Method StringBuilder StringBuilder.append(int)>
	//   29   60:invokevirtual   #845 <Method String StringBuilder.toString()>
	//   30   63:invokespecial   #847 <Method void IllegalArgumentException(String)>
	//   31   66:athrow          
		}
		for(int i = 0; i < mSpanCount; i++)
	//*  32   67:iconst_0        
	//*  33   68:istore_2        
	//*  34   69:iload_2         
	//*  35   70:aload_0         
	//*  36   71:getfield        #93  <Field int mSpanCount>
	//*  37   74:icmpge          96
			ai1[i] = mSpans[i].findLastVisibleItemPosition();
	//   38   77:aload_3         
	//   39   78:iload_2         
	//   40   79:aload_0         
	//   41   80:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   42   83:iload_2         
	//   43   84:aaload          
	//   44   85:invokevirtual   #863 <Method int StaggeredGridLayoutManager$Span.findLastVisibleItemPosition()>
	//   45   88:iastore         

	//   46   89:iload_2         
	//   47   90:iconst_1        
	//   48   91:iadd            
	//   49   92:istore_2        
	//*  50   93:goto            69
		return ai1;
	//   51   96:aload_3         
	//   52   97:areturn         
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
		int i = getChildCount() - 1;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #259 <Method int getChildCount()>
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:istore_1        
		BitSet bitset = new BitSet(mSpanCount);
	//    5    7:new             #338 <Class BitSet>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:getfield        #93  <Field int mSpanCount>
	//    9   15:invokespecial   #894 <Method void BitSet(int)>
	//   10   18:astore          9
		bitset.set(0, mSpanCount, true);
	//   11   20:aload           9
	//   12   22:iconst_0        
	//   13   23:aload_0         
	//   14   24:getfield        #93  <Field int mSpanCount>
	//   15   27:iconst_1        
	//   16   28:invokevirtual   #342 <Method void BitSet.set(int, int, boolean)>
		byte byte0;
		if(mOrientation == 1 && isLayoutRTL())
	//*  17   31:aload_0         
	//*  18   32:getfield        #125 <Field int mOrientation>
	//*  19   35:iconst_1        
	//*  20   36:icmpne          51
	//*  21   39:aload_0         
	//*  22   40:invokevirtual   #315 <Method boolean isLayoutRTL()>
	//*  23   43:ifeq            51
			byte0 = 1;
	//   24   46:iconst_1        
	//   25   47:istore_2        
		else
	//*  26   48:goto            53
			byte0 = -1;
	//   27   51:iconst_m1       
	//   28   52:istore_2        
		int k;
		if(mShouldReverseLayout)
	//*  29   53:aload_0         
	//*  30   54:getfield        #97  <Field boolean mShouldReverseLayout>
	//*  31   57:ifeq            65
		{
			k = -1;
	//   32   60:iconst_m1       
	//   33   61:istore_3        
		} else
	//*  34   62:goto            75
		{
			boolean flag = false;
	//   35   65:iconst_0        
	//   36   66:istore          4
			k = i + 1;
	//   37   68:iload_1         
	//   38   69:iconst_1        
	//   39   70:iadd            
	//   40   71:istore_3        
			i = ((int) (flag));
	//   41   72:iload           4
	//   42   74:istore_1        
		}
		byte byte1;
		if(i < k)
	//*  43   75:iload_1         
	//*  44   76:iload_3         
	//*  45   77:icmpge          86
			byte1 = 1;
	//   46   80:iconst_1        
	//   47   81:istore          4
		else
	//*  48   83:goto            89
			byte1 = -1;
	//   49   86:iconst_m1       
	//   50   87:istore          4
		for(int l = i; l != k; l += ((int) (byte1)))
	//*  51   89:iload_1         
	//*  52   90:istore          5
	//*  53   92:iload           5
	//*  54   94:iload_3         
	//*  55   95:icmpeq          364
		{
			View view = getChildAt(l);
	//   56   98:aload_0         
	//   57   99:iload           5
	//   58  101:invokevirtual   #475 <Method View getChildAt(int)>
	//   59  104:astore          10
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   60  106:aload           10
	//   61  108:invokevirtual   #372 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   62  111:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//   63  114:astore          11
			if(bitset.get(layoutparams.mSpan.mIndex))
	//*  64  116:aload           9
	//*  65  118:aload           11
	//*  66  120:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//*  67  123:getfield        #440 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//*  68  126:invokevirtual   #896 <Method boolean BitSet.get(int)>
	//*  69  129:ifeq            160
			{
				if(checkSpanForGap(layoutparams.mSpan))
	//*  70  132:aload_0         
	//*  71  133:aload           11
	//*  72  135:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//*  73  138:invokespecial   #898 <Method boolean checkSpanForGap(StaggeredGridLayoutManager$Span)>
	//*  74  141:ifeq            147
					return view;
	//   75  144:aload           10
	//   76  146:areturn         
				bitset.clear(layoutparams.mSpan.mIndex);
	//   77  147:aload           9
	//   78  149:aload           11
	//   79  151:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//   80  154:getfield        #440 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//   81  157:invokevirtual   #900 <Method void BitSet.clear(int)>
			}
			if(layoutparams.mFullSpan || l + byte1 == k)
				continue;
	//   82  160:aload           11
	//   83  162:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//   84  165:ifeq            171
	//   85  168:goto            354
	//   86  171:iload           5
	//   87  173:iload           4
	//   88  175:iadd            
	//   89  176:iload_3         
	//   90  177:icmpeq          354
			Object obj = ((Object) (getChildAt(l + byte1)));
	//   91  180:aload_0         
	//   92  181:iload           5
	//   93  183:iload           4
	//   94  185:iadd            
	//   95  186:invokevirtual   #475 <Method View getChildAt(int)>
	//   96  189:astore          12
			int i1 = 0;
	//   97  191:iconst_0        
	//   98  192:istore          6
			int j = 0;
	//   99  194:iconst_0        
	//  100  195:istore_1        
			if(mShouldReverseLayout)
	//* 101  196:aload_0         
	//* 102  197:getfield        #97  <Field boolean mShouldReverseLayout>
	//* 103  200:ifeq            247
			{
				i1 = mPrimaryOrientation.getDecoratedEnd(view);
	//  104  203:aload_0         
	//  105  204:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  106  207:aload           10
	//  107  209:invokevirtual   #698 <Method int OrientationHelper.getDecoratedEnd(View)>
	//  108  212:istore          6
				int j1 = mPrimaryOrientation.getDecoratedEnd(((View) (obj)));
	//  109  214:aload_0         
	//  110  215:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  111  218:aload           12
	//  112  220:invokevirtual   #698 <Method int OrientationHelper.getDecoratedEnd(View)>
	//  113  223:istore          7
				if(i1 < j1)
	//* 114  225:iload           6
	//* 115  227:iload           7
	//* 116  229:icmpge          235
					return view;
	//  117  232:aload           10
	//  118  234:areturn         
				if(i1 == j1)
	//* 119  235:iload           6
	//* 120  237:iload           7
	//* 121  239:icmpne          244
					j = 1;
	//  122  242:iconst_1        
	//  123  243:istore_1        
			} else
	//* 124  244:goto            291
			{
				int k1 = mPrimaryOrientation.getDecoratedStart(view);
	//  125  247:aload_0         
	//  126  248:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  127  251:aload           10
	//  128  253:invokevirtual   #685 <Method int OrientationHelper.getDecoratedStart(View)>
	//  129  256:istore          7
				int l1 = mPrimaryOrientation.getDecoratedStart(((View) (obj)));
	//  130  258:aload_0         
	//  131  259:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  132  262:aload           12
	//  133  264:invokevirtual   #685 <Method int OrientationHelper.getDecoratedStart(View)>
	//  134  267:istore          8
				if(k1 > l1)
	//* 135  269:iload           7
	//* 136  271:iload           8
	//* 137  273:icmple          279
					return view;
	//  138  276:aload           10
	//  139  278:areturn         
				j = i1;
	//  140  279:iload           6
	//  141  281:istore_1        
				if(k1 == l1)
	//* 142  282:iload           7
	//* 143  284:iload           8
	//* 144  286:icmpne          291
					j = 1;
	//  145  289:iconst_1        
	//  146  290:istore_1        
			}
			if(j == 0)
				continue;
	//  147  291:iload_1         
	//  148  292:ifeq            354
			obj = ((Object) ((LayoutParams)((View) (obj)).getLayoutParams()));
	//  149  295:aload           12
	//  150  297:invokevirtual   #372 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  151  300:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//  152  303:astore          12
			if(layoutparams.mSpan.mIndex - ((LayoutParams) (obj)).mSpan.mIndex < 0)
	//* 153  305:aload           11
	//* 154  307:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//* 155  310:getfield        #440 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//* 156  313:aload           12
	//* 157  315:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//* 158  318:getfield        #440 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//* 159  321:isub            
	//* 160  322:ifge            330
				j = 1;
	//  161  325:iconst_1        
	//  162  326:istore_1        
			else
	//* 163  327:goto            332
				j = 0;
	//  164  330:iconst_0        
	//  165  331:istore_1        
			if(byte0 < 0)
	//* 166  332:iload_2         
	//* 167  333:ifge            342
				i1 = 1;
	//  168  336:iconst_1        
	//  169  337:istore          6
			else
	//* 170  339:goto            345
				i1 = 0;
	//  171  342:iconst_0        
	//  172  343:istore          6
			if(j != i1)
	//* 173  345:iload_1         
	//* 174  346:iload           6
	//* 175  348:icmpeq          354
				return view;
	//  176  351:aload           10
	//  177  353:areturn         
		}

	//  178  354:iload           5
	//  179  356:iload           4
	//  180  358:iadd            
	//  181  359:istore          5
	//* 182  361:goto            92
		return null;
	//  183  364:aconst_null     
	//  184  365:areturn         
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
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #259 <Method int getChildCount()>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		view = findContainingItemView(view);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #925 <Method View findContainingItemView(View)>
	//    8   14:astore_1        
		if(view == null)
	//*   9   15:aload_1         
	//*  10   16:ifnonnull       21
			return null;
	//   11   19:aconst_null     
	//   12   20:areturn         
		resolveShouldLayoutReverse();
	//   13   21:aload_0         
	//   14   22:invokespecial   #217 <Method void resolveShouldLayoutReverse()>
		int l1 = convertFocusDirectionToLayoutDirection(i);
	//   15   25:aload_0         
	//   16   26:iload_2         
	//   17   27:invokespecial   #927 <Method int convertFocusDirectionToLayoutDirection(int)>
	//   18   30:istore          6
		if(l1 == 0x80000000)
	//*  19   32:iload           6
	//*  20   34:ldc1            #43  <Int 0x80000000>
	//*  21   36:icmpne          41
			return null;
	//   22   39:aconst_null     
	//   23   40:areturn         
		Object obj = ((Object) ((LayoutParams)view.getLayoutParams()));
	//   24   41:aload_1         
	//   25   42:invokevirtual   #372 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   26   45:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//   27   48:astore          8
		boolean flag = ((LayoutParams) (obj)).mFullSpan;
	//   28   50:aload           8
	//   29   52:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//   30   55:istore          7
		obj = ((Object) (((LayoutParams) (obj)).mSpan));
	//   31   57:aload           8
	//   32   59:getfield        #248 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//   33   62:astore          8
		if(l1 == 1)
	//*  34   64:iload           6
	//*  35   66:iconst_1        
	//*  36   67:icmpne          78
			i = getLastChildPosition();
	//   37   70:aload_0         
	//   38   71:invokevirtual   #500 <Method int getLastChildPosition()>
	//   39   74:istore_2        
		else
	//*  40   75:goto            83
			i = getFirstChildPosition();
	//   41   78:aload_0         
	//   42   79:invokevirtual   #262 <Method int getFirstChildPosition()>
	//   43   82:istore_2        
		updateLayoutState(i, state);
	//   44   83:aload_0         
	//   45   84:iload_2         
	//   46   85:aload           4
	//   47   87:invokespecial   #640 <Method void updateLayoutState(int, RecyclerView$State)>
		setLayoutStateDirection(l1);
	//   48   90:aload_0         
	//   49   91:iload           6
	//   50   93:invokespecial   #643 <Method void setLayoutStateDirection(int)>
		mLayoutState.mCurrentPosition = mLayoutState.mItemDirection + i;
	//   51   96:aload_0         
	//   52   97:getfield        #138 <Field LayoutState mLayoutState>
	//   53  100:aload_0         
	//   54  101:getfield        #138 <Field LayoutState mLayoutState>
	//   55  104:getfield        #423 <Field int LayoutState.mItemDirection>
	//   56  107:iload_2         
	//   57  108:iadd            
	//   58  109:putfield        #648 <Field int LayoutState.mCurrentPosition>
		mLayoutState.mAvailable = (int)((float)mPrimaryOrientation.getTotalSpace() * 0.3333333F);
	//   59  112:aload_0         
	//   60  113:getfield        #138 <Field LayoutState mLayoutState>
	//   61  116:aload_0         
	//   62  117:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   63  120:invokevirtual   #632 <Method int OrientationHelper.getTotalSpace()>
	//   64  123:i2f             
	//   65  124:ldc1            #46  <Float 0.3333333F>
	//   66  126:fmul            
	//   67  127:f2i             
	//   68  128:putfield        #352 <Field int LayoutState.mAvailable>
		mLayoutState.mStopInFocusable = true;
	//   69  131:aload_0         
	//   70  132:getfield        #138 <Field LayoutState mLayoutState>
	//   71  135:iconst_1        
	//   72  136:putfield        #457 <Field boolean LayoutState.mStopInFocusable>
		mLayoutState.mRecycle = false;
	//   73  139:aload_0         
	//   74  140:getfield        #138 <Field LayoutState mLayoutState>
	//   75  143:iconst_0        
	//   76  144:putfield        #629 <Field boolean LayoutState.mRecycle>
		fill(recycler, mLayoutState, state);
	//   77  147:aload_0         
	//   78  148:aload_3         
	//   79  149:aload_0         
	//   80  150:getfield        #138 <Field LayoutState mLayoutState>
	//   81  153:aload           4
	//   82  155:invokespecial   #645 <Method int fill(RecyclerView$Recycler, LayoutState, RecyclerView$State)>
	//   83  158:pop             
		mLastLayoutFromEnd = mShouldReverseLayout;
	//   84  159:aload_0         
	//   85  160:aload_0         
	//   86  161:getfield        #97  <Field boolean mShouldReverseLayout>
	//   87  164:putfield        #605 <Field boolean mLastLayoutFromEnd>
		if(!flag)
	//*  88  167:iload           7
	//*  89  169:ifne            192
		{
			recycler = ((RecyclerView.Recycler) (((Span) (obj)).getFocusableViewAfter(i, l1)));
	//   90  172:aload           8
	//   91  174:iload_2         
	//   92  175:iload           6
	//   93  177:invokevirtual   #931 <Method View StaggeredGridLayoutManager$Span.getFocusableViewAfter(int, int)>
	//   94  180:astore_3        
			if(recycler != null && recycler != view)
	//*  95  181:aload_3         
	//*  96  182:ifnull          192
	//*  97  185:aload_3         
	//*  98  186:aload_1         
	//*  99  187:if_acmpeq       192
				return ((View) (recycler));
	//  100  190:aload_3         
	//  101  191:areturn         
		}
		if(preferLastSpan(l1))
	//* 102  192:aload_0         
	//* 103  193:iload           6
	//* 104  195:invokespecial   #495 <Method boolean preferLastSpan(int)>
	//* 105  198:ifeq            251
		{
			for(int j = mSpanCount - 1; j >= 0; j--)
	//* 106  201:aload_0         
	//* 107  202:getfield        #93  <Field int mSpanCount>
	//* 108  205:iconst_1        
	//* 109  206:isub            
	//* 110  207:istore          5
	//* 111  209:iload           5
	//* 112  211:iflt            248
			{
				recycler = ((RecyclerView.Recycler) (mSpans[j].getFocusableViewAfter(i, l1)));
	//  113  214:aload_0         
	//  114  215:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  115  218:iload           5
	//  116  220:aaload          
	//  117  221:iload_2         
	//  118  222:iload           6
	//  119  224:invokevirtual   #931 <Method View StaggeredGridLayoutManager$Span.getFocusableViewAfter(int, int)>
	//  120  227:astore_3        
				if(recycler != null && recycler != view)
	//* 121  228:aload_3         
	//* 122  229:ifnull          239
	//* 123  232:aload_3         
	//* 124  233:aload_1         
	//* 125  234:if_acmpeq       239
					return ((View) (recycler));
	//  126  237:aload_3         
	//  127  238:areturn         
			}

	//  128  239:iload           5
	//  129  241:iconst_1        
	//  130  242:isub            
	//  131  243:istore          5
		} else
	//* 132  245:goto            209
	//* 133  248:goto            297
		{
			for(int k = 0; k < mSpanCount; k++)
	//* 134  251:iconst_0        
	//* 135  252:istore          5
	//* 136  254:iload           5
	//* 137  256:aload_0         
	//* 138  257:getfield        #93  <Field int mSpanCount>
	//* 139  260:icmpge          297
			{
				recycler = ((RecyclerView.Recycler) (mSpans[k].getFocusableViewAfter(i, l1)));
	//  140  263:aload_0         
	//  141  264:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  142  267:iload           5
	//  143  269:aaload          
	//  144  270:iload_2         
	//  145  271:iload           6
	//  146  273:invokevirtual   #931 <Method View StaggeredGridLayoutManager$Span.getFocusableViewAfter(int, int)>
	//  147  276:astore_3        
				if(recycler != null && recycler != view)
	//* 148  277:aload_3         
	//* 149  278:ifnull          288
	//* 150  281:aload_3         
	//* 151  282:aload_1         
	//* 152  283:if_acmpeq       288
					return ((View) (recycler));
	//  153  286:aload_3         
	//  154  287:areturn         
			}

	//  155  288:iload           5
	//  156  290:iconst_1        
	//  157  291:iadd            
	//  158  292:istore          5
		}
	//* 159  294:goto            254
		if(!mReverseLayout)
	//* 160  297:aload_0         
	//* 161  298:getfield        #95  <Field boolean mReverseLayout>
	//* 162  301:ifne            309
			i = 1;
	//  163  304:iconst_1        
	//  164  305:istore_2        
		else
	//* 165  306:goto            311
			i = 0;
	//  166  309:iconst_0        
	//  167  310:istore_2        
		int l;
		if(l1 == -1)
	//* 168  311:iload           6
	//* 169  313:iconst_m1       
	//* 170  314:icmpne          323
			l = 1;
	//  171  317:iconst_1        
	//  172  318:istore          5
		else
	//* 173  320:goto            326
			l = 0;
	//  174  323:iconst_0        
	//  175  324:istore          5
		if(i == l)
	//* 176  326:iload_2         
	//* 177  327:iload           5
	//* 178  329:icmpne          337
			i = 1;
	//  179  332:iconst_1        
	//  180  333:istore_2        
		else
	//* 181  334:goto            339
			i = 0;
	//  182  337:iconst_0        
	//  183  338:istore_2        
		if(!flag)
	//* 184  339:iload           7
	//* 185  341:ifne            383
		{
			int i1;
			if(i != 0)
	//* 186  344:iload_2         
	//* 187  345:ifeq            358
				i1 = ((Span) (obj)).findFirstPartiallyVisibleItemPosition();
	//  188  348:aload           8
	//  189  350:invokevirtual   #934 <Method int StaggeredGridLayoutManager$Span.findFirstPartiallyVisibleItemPosition()>
	//  190  353:istore          5
			else
	//* 191  355:goto            365
				i1 = ((Span) (obj)).findLastPartiallyVisibleItemPosition();
	//  192  358:aload           8
	//  193  360:invokevirtual   #937 <Method int StaggeredGridLayoutManager$Span.findLastPartiallyVisibleItemPosition()>
	//  194  363:istore          5
			recycler = ((RecyclerView.Recycler) (findViewByPosition(i1)));
	//  195  365:aload_0         
	//  196  366:iload           5
	//  197  368:invokevirtual   #940 <Method View findViewByPosition(int)>
	//  198  371:astore_3        
			if(recycler != null && recycler != view)
	//* 199  372:aload_3         
	//* 200  373:ifnull          383
	//* 201  376:aload_3         
	//* 202  377:aload_1         
	//* 203  378:if_acmpeq       383
				return ((View) (recycler));
	//  204  381:aload_3         
	//  205  382:areturn         
		}
		if(preferLastSpan(l1))
	//* 206  383:aload_0         
	//* 207  384:iload           6
	//* 208  386:invokespecial   #495 <Method boolean preferLastSpan(int)>
	//* 209  389:ifeq            479
		{
			for(int j1 = mSpanCount - 1; j1 >= 0; j1--)
	//* 210  392:aload_0         
	//* 211  393:getfield        #93  <Field int mSpanCount>
	//* 212  396:iconst_1        
	//* 213  397:isub            
	//* 214  398:istore          5
	//* 215  400:iload           5
	//* 216  402:iflt            476
				if(j1 != ((Span) (obj)).mIndex)
	//* 217  405:iload           5
	//* 218  407:aload           8
	//* 219  409:getfield        #440 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//* 220  412:icmpne          418
	//* 221  415:goto            467
				{
					int i2;
					if(i != 0)
	//* 222  418:iload_2         
	//* 223  419:ifeq            437
						i2 = mSpans[j1].findFirstPartiallyVisibleItemPosition();
	//  224  422:aload_0         
	//  225  423:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  226  426:iload           5
	//  227  428:aaload          
	//  228  429:invokevirtual   #934 <Method int StaggeredGridLayoutManager$Span.findFirstPartiallyVisibleItemPosition()>
	//  229  432:istore          6
					else
	//* 230  434:goto            449
						i2 = mSpans[j1].findLastPartiallyVisibleItemPosition();
	//  231  437:aload_0         
	//  232  438:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  233  441:iload           5
	//  234  443:aaload          
	//  235  444:invokevirtual   #937 <Method int StaggeredGridLayoutManager$Span.findLastPartiallyVisibleItemPosition()>
	//  236  447:istore          6
					recycler = ((RecyclerView.Recycler) (findViewByPosition(i2)));
	//  237  449:aload_0         
	//  238  450:iload           6
	//  239  452:invokevirtual   #940 <Method View findViewByPosition(int)>
	//  240  455:astore_3        
					if(recycler != null && recycler != view)
	//* 241  456:aload_3         
	//* 242  457:ifnull          467
	//* 243  460:aload_3         
	//* 244  461:aload_1         
	//* 245  462:if_acmpeq       467
						return ((View) (recycler));
	//  246  465:aload_3         
	//  247  466:areturn         
				}

	//  248  467:iload           5
	//  249  469:iconst_1        
	//  250  470:isub            
	//  251  471:istore          5
		} else
	//* 252  473:goto            400
	//* 253  476:goto            549
		{
			for(int k1 = 0; k1 < mSpanCount; k1++)
	//* 254  479:iconst_0        
	//* 255  480:istore          5
	//* 256  482:iload           5
	//* 257  484:aload_0         
	//* 258  485:getfield        #93  <Field int mSpanCount>
	//* 259  488:icmpge          549
			{
				int j2;
				if(i != 0)
	//* 260  491:iload_2         
	//* 261  492:ifeq            510
					j2 = mSpans[k1].findFirstPartiallyVisibleItemPosition();
	//  262  495:aload_0         
	//  263  496:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  264  499:iload           5
	//  265  501:aaload          
	//  266  502:invokevirtual   #934 <Method int StaggeredGridLayoutManager$Span.findFirstPartiallyVisibleItemPosition()>
	//  267  505:istore          6
				else
	//* 268  507:goto            522
					j2 = mSpans[k1].findLastPartiallyVisibleItemPosition();
	//  269  510:aload_0         
	//  270  511:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  271  514:iload           5
	//  272  516:aaload          
	//  273  517:invokevirtual   #937 <Method int StaggeredGridLayoutManager$Span.findLastPartiallyVisibleItemPosition()>
	//  274  520:istore          6
				recycler = ((RecyclerView.Recycler) (findViewByPosition(j2)));
	//  275  522:aload_0         
	//  276  523:iload           6
	//  277  525:invokevirtual   #940 <Method View findViewByPosition(int)>
	//  278  528:astore_3        
				if(recycler != null && recycler != view)
	//* 279  529:aload_3         
	//* 280  530:ifnull          540
	//* 281  533:aload_3         
	//* 282  534:aload_1         
	//* 283  535:if_acmpeq       540
					return ((View) (recycler));
	//  284  538:aload_3         
	//  285  539:areturn         
			}

	//  286  540:iload           5
	//  287  542:iconst_1        
	//  288  543:iadd            
	//  289  544:istore          5
		}
	//* 290  546:goto            482
		return null;
	//  291  549:aconst_null     
	//  292  550:areturn         
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #945 <Method void RecyclerView$LayoutManager.onInitializeAccessibilityEvent(AccessibilityEvent)>
		if(getChildCount() > 0)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #259 <Method int getChildCount()>
	//*   5    9:ifle            82
		{
			accessibilityevent = ((AccessibilityEvent) (AccessibilityEventCompat.asRecord(accessibilityevent)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #951 <Method AccessibilityRecordCompat AccessibilityEventCompat.asRecord(AccessibilityEvent)>
	//    8   16:astore_1        
			View view = findFirstVisibleItemClosestToStart(false);
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #295 <Method View findFirstVisibleItemClosestToStart(boolean)>
	//   12   22:astore          4
			View view1 = findFirstVisibleItemClosestToEnd(false);
	//   13   24:aload_0         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #298 <Method View findFirstVisibleItemClosestToEnd(boolean)>
	//   16   29:astore          5
			if(view == null || view1 == null)
	//*  17   31:aload           4
	//*  18   33:ifnull          41
	//*  19   36:aload           5
	//*  20   38:ifnonnull       42
				return;
	//   21   41:return          
			int i = getPosition(view);
	//   22   42:aload_0         
	//   23   43:aload           4
	//   24   45:invokevirtual   #478 <Method int getPosition(View)>
	//   25   48:istore_2        
			int j = getPosition(view1);
	//   26   49:aload_0         
	//   27   50:aload           5
	//   28   52:invokevirtual   #478 <Method int getPosition(View)>
	//   29   55:istore_3        
			if(i < j)
	//*  30   56:iload_2         
	//*  31   57:iload_3         
	//*  32   58:icmpge          72
			{
				((AccessibilityRecordCompat) (accessibilityevent)).setFromIndex(i);
	//   33   61:aload_1         
	//   34   62:iload_2         
	//   35   63:invokevirtual   #956 <Method void AccessibilityRecordCompat.setFromIndex(int)>
				((AccessibilityRecordCompat) (accessibilityevent)).setToIndex(j);
	//   36   66:aload_1         
	//   37   67:iload_3         
	//   38   68:invokevirtual   #959 <Method void AccessibilityRecordCompat.setToIndex(int)>
				return;
	//   39   71:return          
			}
			((AccessibilityRecordCompat) (accessibilityevent)).setFromIndex(j);
	//   40   72:aload_1         
	//   41   73:iload_3         
	//   42   74:invokevirtual   #956 <Method void AccessibilityRecordCompat.setFromIndex(int)>
			((AccessibilityRecordCompat) (accessibilityevent)).setToIndex(i);
	//   43   77:aload_1         
	//   44   78:iload_2         
	//   45   79:invokevirtual   #959 <Method void AccessibilityRecordCompat.setToIndex(int)>
		}
	//   46   82:return          
	}

	public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		recycler = ((RecyclerView.Recycler) (view.getLayoutParams()));
	//    0    0:aload_3         
	//    1    1:invokevirtual   #372 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
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
	//    9   16:invokespecial   #964 <Method void RecyclerView$LayoutManager.onInitializeAccessibilityNodeInfoForItem(View, AccessibilityNodeInfoCompat)>
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
	//   18   33:invokevirtual   #967 <Method int StaggeredGridLayoutManager$LayoutParams.getSpanIndex()>
	//   19   36:istore          6
			int i;
			if(((LayoutParams) (recycler)).mFullSpan)
	//*  20   38:aload_1         
	//*  21   39:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*  22   42:ifeq            54
				i = mSpanCount;
	//   23   45:aload_0         
	//   24   46:getfield        #93  <Field int mSpanCount>
	//   25   49:istore          5
			else
	//*  26   51:goto            57
				i = 1;
	//   27   54:iconst_1        
	//   28   55:istore          5
			accessibilitynodeinfocompat.setCollectionItemInfo(((Object) (android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(k, i, -1, -1, ((LayoutParams) (recycler)).mFullSpan, false))));
	//   29   57:aload           4
	//   30   59:iload           6
	//   31   61:iload           5
	//   32   63:iconst_m1       
	//   33   64:iconst_m1       
	//   34   65:aload_1         
	//   35   66:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//   36   69:iconst_0        
	//   37   70:invokestatic    #973 <Method android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat.obtain(int, int, int, int, boolean, boolean)>
	//   38   73:invokevirtual   #979 <Method void AccessibilityNodeInfoCompat.setCollectionItemInfo(Object)>
			return;
	//   39   76:return          
		}
		int l = ((LayoutParams) (recycler)).getSpanIndex();
	//   40   77:aload_1         
	//   41   78:invokevirtual   #967 <Method int StaggeredGridLayoutManager$LayoutParams.getSpanIndex()>
	//   42   81:istore          6
		int j;
		if(((LayoutParams) (recycler)).mFullSpan)
	//*  43   83:aload_1         
	//*  44   84:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*  45   87:ifeq            99
			j = mSpanCount;
	//   46   90:aload_0         
	//   47   91:getfield        #93  <Field int mSpanCount>
	//   48   94:istore          5
		else
	//*  49   96:goto            102
			j = 1;
	//   50   99:iconst_1        
	//   51  100:istore          5
		accessibilitynodeinfocompat.setCollectionItemInfo(((Object) (android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(-1, -1, l, j, ((LayoutParams) (recycler)).mFullSpan, false))));
	//   52  102:aload           4
	//   53  104:iconst_m1       
	//   54  105:iconst_m1       
	//   55  106:iload           6
	//   56  108:iload           5
	//   57  110:aload_1         
	//   58  111:getfield        #242 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//   59  114:iconst_0        
	//   60  115:invokestatic    #973 <Method android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat.obtain(int, int, int, int, boolean, boolean)>
	//   61  118:invokevirtual   #979 <Method void AccessibilityNodeInfoCompat.setCollectionItemInfo(Object)>
	//   62  121:return          
	}

	public void onItemsAdded(RecyclerView recyclerview, int i, int j)
	{
		handleUpdate(i, j, 1);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #983 <Method void handleUpdate(int, int, int)>
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
	//    4    5:invokespecial   #983 <Method void handleUpdate(int, int, int)>
	//    5    8:return          
	}

	public void onItemsRemoved(RecyclerView recyclerview, int i, int j)
	{
		handleUpdate(i, j, 2);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iconst_2        
	//    4    4:invokespecial   #983 <Method void handleUpdate(int, int, int)>
	//    5    7:return          
	}

	public void onItemsUpdated(RecyclerView recyclerview, int i, int j, Object obj)
	{
		handleUpdate(i, j, 4);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iconst_4        
	//    4    4:invokespecial   #983 <Method void handleUpdate(int, int, int)>
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
	//    2    2:invokespecial   #995 <Method void RecyclerView$LayoutManager.onLayoutCompleted(RecyclerView$State)>
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
		if(mPendingSavedState != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*   2    4:ifnull          19
			return ((Parcelable) (new SavedState(mPendingSavedState)));
	//    3    7:new             #24  <Class StaggeredGridLayoutManager$SavedState>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//    7   15:invokespecial   #1002 <Method void StaggeredGridLayoutManager$SavedState(StaggeredGridLayoutManager$SavedState)>
	//    8   18:areturn         
		SavedState savedstate = new SavedState();
	//    9   19:new             #24  <Class StaggeredGridLayoutManager$SavedState>
	//   10   22:dup             
	//   11   23:invokespecial   #1003 <Method void StaggeredGridLayoutManager$SavedState()>
	//   12   26:astore          4
		savedstate.mReverseLayout = mReverseLayout;
	//   13   28:aload           4
	//   14   30:aload_0         
	//   15   31:getfield        #95  <Field boolean mReverseLayout>
	//   16   34:putfield        #214 <Field boolean StaggeredGridLayoutManager$SavedState.mReverseLayout>
		savedstate.mAnchorLayoutFromEnd = mLastLayoutFromEnd;
	//   17   37:aload           4
	//   18   39:aload_0         
	//   19   40:getfield        #605 <Field boolean mLastLayoutFromEnd>
	//   20   43:putfield        #187 <Field boolean StaggeredGridLayoutManager$SavedState.mAnchorLayoutFromEnd>
		savedstate.mLastLayoutRTL = mLastLayoutRTL;
	//   21   46:aload           4
	//   22   48:aload_0         
	//   23   49:getfield        #213 <Field boolean mLastLayoutRTL>
	//   24   52:putfield        #212 <Field boolean StaggeredGridLayoutManager$SavedState.mLastLayoutRTL>
		if(mLazySpanLookup != null && mLazySpanLookup.mData != null)
	//*  25   55:aload_0         
	//*  26   56:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//*  27   59:ifnull          110
	//*  28   62:aload_0         
	//*  29   63:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//*  30   66:getfield        #229 <Field int[] StaggeredGridLayoutManager$LazySpanLookup.mData>
	//*  31   69:ifnull          110
		{
			savedstate.mSpanLookup = mLazySpanLookup.mData;
	//   32   72:aload           4
	//   33   74:aload_0         
	//   34   75:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   35   78:getfield        #229 <Field int[] StaggeredGridLayoutManager$LazySpanLookup.mData>
	//   36   81:putfield        #226 <Field int[] StaggeredGridLayoutManager$SavedState.mSpanLookup>
			savedstate.mSpanLookupSize = savedstate.mSpanLookup.length;
	//   37   84:aload           4
	//   38   86:aload           4
	//   39   88:getfield        #226 <Field int[] StaggeredGridLayoutManager$SavedState.mSpanLookup>
	//   40   91:arraylength     
	//   41   92:putfield        #223 <Field int StaggeredGridLayoutManager$SavedState.mSpanLookupSize>
			savedstate.mFullSpanItems = mLazySpanLookup.mFullSpanItems;
	//   42   95:aload           4
	//   43   97:aload_0         
	//   44   98:getfield        #104 <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   45  101:getfield        #234 <Field List StaggeredGridLayoutManager$LazySpanLookup.mFullSpanItems>
	//   46  104:putfield        #233 <Field List StaggeredGridLayoutManager$SavedState.mFullSpanItems>
		} else
	//*  47  107:goto            116
		{
			savedstate.mSpanLookupSize = 0;
	//   48  110:aload           4
	//   49  112:iconst_0        
	//   50  113:putfield        #223 <Field int StaggeredGridLayoutManager$SavedState.mSpanLookupSize>
		}
		if(getChildCount() > 0)
	//*  51  116:aload_0         
	//*  52  117:invokevirtual   #259 <Method int getChildCount()>
	//*  53  120:ifle            276
		{
			int i;
			if(mLastLayoutFromEnd)
	//*  54  123:aload_0         
	//*  55  124:getfield        #605 <Field boolean mLastLayoutFromEnd>
	//*  56  127:ifeq            138
				i = getLastChildPosition();
	//   57  130:aload_0         
	//   58  131:invokevirtual   #500 <Method int getLastChildPosition()>
	//   59  134:istore_1        
			else
	//*  60  135:goto            143
				i = getFirstChildPosition();
	//   61  138:aload_0         
	//   62  139:invokevirtual   #262 <Method int getFirstChildPosition()>
	//   63  142:istore_1        
			savedstate.mAnchorPosition = i;
	//   64  143:aload           4
	//   65  145:iload_1         
	//   66  146:putfield        #210 <Field int StaggeredGridLayoutManager$SavedState.mAnchorPosition>
			savedstate.mVisibleAnchorPosition = findFirstVisibleItemPositionInt();
	//   67  149:aload           4
	//   68  151:aload_0         
	//   69  152:invokevirtual   #1005 <Method int findFirstVisibleItemPositionInt()>
	//   70  155:putfield        #207 <Field int StaggeredGridLayoutManager$SavedState.mVisibleAnchorPosition>
			savedstate.mSpanOffsetsSize = mSpanCount;
	//   71  158:aload           4
	//   72  160:aload_0         
	//   73  161:getfield        #93  <Field int mSpanCount>
	//   74  164:putfield        #178 <Field int StaggeredGridLayoutManager$SavedState.mSpanOffsetsSize>
			savedstate.mSpanOffsets = new int[mSpanCount];
	//   75  167:aload           4
	//   76  169:aload_0         
	//   77  170:getfield        #93  <Field int mSpanCount>
	//   78  173:newarray        int[]
	//   79  175:putfield        #184 <Field int[] StaggeredGridLayoutManager$SavedState.mSpanOffsets>
			for(int k = 0; k < mSpanCount; k++)
	//*  80  178:iconst_0        
	//*  81  179:istore_2        
	//*  82  180:iload_2         
	//*  83  181:aload_0         
	//*  84  182:getfield        #93  <Field int mSpanCount>
	//*  85  185:icmpge          273
			{
				int j;
				if(mLastLayoutFromEnd)
	//*  86  188:aload_0         
	//*  87  189:getfield        #605 <Field boolean mLastLayoutFromEnd>
	//*  88  192:ifeq            228
				{
					int l = mSpans[k].getEndLine(0x80000000);
	//   89  195:aload_0         
	//   90  196:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   91  199:iload_2         
	//   92  200:aaload          
	//   93  201:ldc1            #43  <Int 0x80000000>
	//   94  203:invokevirtual   #323 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
	//   95  206:istore_3        
					j = l;
	//   96  207:iload_3         
	//   97  208:istore_1        
					if(l != 0x80000000)
	//*  98  209:iload_3         
	//*  99  210:ldc1            #43  <Int 0x80000000>
	//* 100  212:icmpeq          258
						j = l - mPrimaryOrientation.getEndAfterPadding();
	//  101  215:iload_3         
	//  102  216:aload_0         
	//  103  217:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  104  220:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//  105  223:isub            
	//  106  224:istore_1        
				} else
	//* 107  225:goto            258
				{
					int i1 = mSpans[k].getStartLine(0x80000000);
	//  108  228:aload_0         
	//  109  229:getfield        #168 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  110  232:iload_2         
	//  111  233:aaload          
	//  112  234:ldc1            #43  <Int 0x80000000>
	//  113  236:invokevirtual   #326 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
	//  114  239:istore_3        
					j = i1;
	//  115  240:iload_3         
	//  116  241:istore_1        
					if(i1 != 0x80000000)
	//* 117  242:iload_3         
	//* 118  243:ldc1            #43  <Int 0x80000000>
	//* 119  245:icmpeq          258
						j = i1 - mPrimaryOrientation.getStartAfterPadding();
	//  120  248:iload_3         
	//  121  249:aload_0         
	//  122  250:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  123  253:invokevirtual   #198 <Method int OrientationHelper.getStartAfterPadding()>
	//  124  256:isub            
	//  125  257:istore_1        
				}
				savedstate.mSpanOffsets[k] = j;
	//  126  258:aload           4
	//  127  260:getfield        #184 <Field int[] StaggeredGridLayoutManager$SavedState.mSpanOffsets>
	//  128  263:iload_2         
	//  129  264:iload_1         
	//  130  265:iastore         
			}

	//  131  266:iload_2         
	//  132  267:iconst_1        
	//  133  268:iadd            
	//  134  269:istore_2        
	//* 135  270:goto            180
			return ((Parcelable) (savedstate));
	//  136  273:aload           4
	//  137  275:areturn         
		} else
		{
			savedstate.mAnchorPosition = -1;
	//  138  276:aload           4
	//  139  278:iconst_m1       
	//  140  279:putfield        #210 <Field int StaggeredGridLayoutManager$SavedState.mAnchorPosition>
			savedstate.mVisibleAnchorPosition = -1;
	//  141  282:aload           4
	//  142  284:iconst_m1       
	//  143  285:putfield        #207 <Field int StaggeredGridLayoutManager$SavedState.mVisibleAnchorPosition>
			savedstate.mSpanOffsetsSize = 0;
	//  144  288:aload           4
	//  145  290:iconst_0        
	//  146  291:putfield        #178 <Field int StaggeredGridLayoutManager$SavedState.mSpanOffsetsSize>
			return ((Parcelable) (savedstate));
	//  147  294:aload           4
	//  148  296:areturn         
		}
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
		byte byte0;
		if(i > 0)
	//*   0    0:iload_1         
	//*   1    1:ifle            15
		{
			byte0 = 1;
	//    2    4:iconst_1        
	//    3    5:istore          4
			j = getLastChildPosition();
	//    4    7:aload_0         
	//    5    8:invokevirtual   #500 <Method int getLastChildPosition()>
	//    6   11:istore_3        
		} else
	//*   7   12:goto            23
		{
			byte0 = -1;
	//    8   15:iconst_m1       
	//    9   16:istore          4
			j = getFirstChildPosition();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #262 <Method int getFirstChildPosition()>
	//   12   22:istore_3        
		}
		mLayoutState.mRecycle = true;
	//   13   23:aload_0         
	//   14   24:getfield        #138 <Field LayoutState mLayoutState>
	//   15   27:iconst_1        
	//   16   28:putfield        #629 <Field boolean LayoutState.mRecycle>
		updateLayoutState(j, state);
	//   17   31:aload_0         
	//   18   32:iload_3         
	//   19   33:aload_2         
	//   20   34:invokespecial   #640 <Method void updateLayoutState(int, RecyclerView$State)>
		setLayoutStateDirection(((int) (byte0)));
	//   21   37:aload_0         
	//   22   38:iload           4
	//   23   40:invokespecial   #643 <Method void setLayoutStateDirection(int)>
		mLayoutState.mCurrentPosition = mLayoutState.mItemDirection + j;
	//   24   43:aload_0         
	//   25   44:getfield        #138 <Field LayoutState mLayoutState>
	//   26   47:aload_0         
	//   27   48:getfield        #138 <Field LayoutState mLayoutState>
	//   28   51:getfield        #423 <Field int LayoutState.mItemDirection>
	//   29   54:iload_3         
	//   30   55:iadd            
	//   31   56:putfield        #648 <Field int LayoutState.mCurrentPosition>
		mLayoutState.mAvailable = Math.abs(i);
	//   32   59:aload_0         
	//   33   60:getfield        #138 <Field LayoutState mLayoutState>
	//   34   63:iload_1         
	//   35   64:invokestatic    #1009 <Method int Math.abs(int)>
	//   36   67:putfield        #352 <Field int LayoutState.mAvailable>
	//   37   70:return          
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
	//*  20   35:getfield        #352 <Field int LayoutState.mAvailable>
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
	//   33   61:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   34   64:iload_1         
	//   35   65:ineg            
	//   36   66:invokevirtual   #488 <Method void OrientationHelper.offsetChildren(int)>
		mLastLayoutFromEnd = mShouldReverseLayout;
	//   37   69:aload_0         
	//   38   70:aload_0         
	//   39   71:getfield        #97  <Field boolean mShouldReverseLayout>
	//   40   74:putfield        #605 <Field boolean mLastLayoutFromEnd>
		mLayoutState.mAvailable = 0;
	//   41   77:aload_0         
	//   42   78:getfield        #138 <Field LayoutState mLayoutState>
	//   43   81:iconst_0        
	//   44   82:putfield        #352 <Field int LayoutState.mAvailable>
		recycle(recycler, mLayoutState);
	//   45   85:aload_0         
	//   46   86:aload_2         
	//   47   87:aload_0         
	//   48   88:getfield        #138 <Field LayoutState mLayoutState>
	//   49   91:invokespecial   #454 <Method void recycle(RecyclerView$Recycler, LayoutState)>
		return i;
	//   50   94:iload_1         
	//   51   95:ireturn         
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
	//   10   22:invokevirtual   #1014 <Method void StaggeredGridLayoutManager$SavedState.invalidateAnchorPositionInfo()>
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
	//    5   11:invokevirtual   #1014 <Method void StaggeredGridLayoutManager$SavedState.invalidateAnchorPositionInfo()>
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
	//    2    2:invokevirtual   #1018 <Method void assertNotInLayoutOrScroll(String)>
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
	//   13   23:new             #827 <Class IllegalArgumentException>
	//   14   26:dup             
	//   15   27:ldc2            #1020 <String "invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS">
	//   16   30:invokespecial   #847 <Method void IllegalArgumentException(String)>
	//   17   33:athrow          
		mGapStrategy = i;
	//   18   34:aload_0         
	//   19   35:iload_1         
	//   20   36:putfield        #106 <Field int mGapStrategy>
		boolean flag;
		if(mGapStrategy != 0)
	//*  21   39:aload_0         
	//*  22   40:getfield        #106 <Field int mGapStrategy>
	//*  23   43:ifeq            51
			flag = true;
	//   24   46:iconst_1        
	//   25   47:istore_2        
		else
	//*  26   48:goto            53
			flag = false;
	//   27   51:iconst_0        
	//   28   52:istore_2        
		setAutoMeasureEnabled(flag);
	//   29   53:aload_0         
	//   30   54:iload_2         
	//   31   55:invokevirtual   #133 <Method void setAutoMeasureEnabled(boolean)>
		requestLayout();
	//   32   58:aload_0         
	//   33   59:invokevirtual   #512 <Method void requestLayout()>
	//   34   62:return          
	}

	public void setMeasuredDimension(Rect rect, int i, int j)
	{
		int k = getPaddingLeft() + getPaddingRight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1025 <Method int getPaddingLeft()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #1028 <Method int getPaddingRight()>
	//    4    8:iadd            
	//    5    9:istore          4
		int l = getPaddingTop() + getPaddingBottom();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #1031 <Method int getPaddingTop()>
	//    8   15:aload_0         
	//    9   16:invokevirtual   #1034 <Method int getPaddingBottom()>
	//   10   19:iadd            
	//   11   20:istore          5
		if(mOrientation == 1)
	//*  12   22:aload_0         
	//*  13   23:getfield        #125 <Field int mOrientation>
	//*  14   26:iconst_1        
	//*  15   27:icmpne          70
		{
			j = chooseSize(j, rect.height() + l, getMinimumHeight());
	//   16   30:iload_3         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #1036 <Method int Rect.height()>
	//   19   35:iload           5
	//   20   37:iadd            
	//   21   38:aload_0         
	//   22   39:invokevirtual   #1039 <Method int getMinimumHeight()>
	//   23   42:invokestatic    #1042 <Method int chooseSize(int, int, int)>
	//   24   45:istore_3        
			i = chooseSize(i, mSizePerSpan * mSpanCount + k, getMinimumWidth());
	//   25   46:iload_2         
	//   26   47:aload_0         
	//   27   48:getfield        #442 <Field int mSizePerSpan>
	//   28   51:aload_0         
	//   29   52:getfield        #93  <Field int mSpanCount>
	//   30   55:imul            
	//   31   56:iload           4
	//   32   58:iadd            
	//   33   59:aload_0         
	//   34   60:invokevirtual   #1045 <Method int getMinimumWidth()>
	//   35   63:invokestatic    #1042 <Method int chooseSize(int, int, int)>
	//   36   66:istore_2        
		} else
	//*  37   67:goto            107
		{
			i = chooseSize(i, rect.width() + k, getMinimumWidth());
	//   38   70:iload_2         
	//   39   71:aload_1         
	//   40   72:invokevirtual   #1047 <Method int Rect.width()>
	//   41   75:iload           4
	//   42   77:iadd            
	//   43   78:aload_0         
	//   44   79:invokevirtual   #1045 <Method int getMinimumWidth()>
	//   45   82:invokestatic    #1042 <Method int chooseSize(int, int, int)>
	//   46   85:istore_2        
			j = chooseSize(j, mSizePerSpan * mSpanCount + l, getMinimumHeight());
	//   47   86:iload_3         
	//   48   87:aload_0         
	//   49   88:getfield        #442 <Field int mSizePerSpan>
	//   50   91:aload_0         
	//   51   92:getfield        #93  <Field int mSpanCount>
	//   52   95:imul            
	//   53   96:iload           5
	//   54   98:iadd            
	//   55   99:aload_0         
	//   56  100:invokevirtual   #1039 <Method int getMinimumHeight()>
	//   57  103:invokestatic    #1042 <Method int chooseSize(int, int, int)>
	//   58  106:istore_3        
		}
		setMeasuredDimension(i, j);
	//   59  107:aload_0         
	//   60  108:iload_2         
	//   61  109:iload_3         
	//   62  110:invokevirtual   #1049 <Method void setMeasuredDimension(int, int)>
	//   63  113:return          
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
	//    5    9:new             #827 <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:ldc2            #1051 <String "invalid orientation.">
	//    8   16:invokespecial   #847 <Method void IllegalArgumentException(String)>
	//    9   19:athrow          
		assertNotInLayoutOrScroll(((String) (null)));
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:invokevirtual   #1018 <Method void assertNotInLayoutOrScroll(String)>
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
	//    2    2:invokevirtual   #1018 <Method void assertNotInLayoutOrScroll(String)>
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
	//    2    2:invokevirtual   #1018 <Method void assertNotInLayoutOrScroll(String)>
		if(i != mSpanCount)
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #93  <Field int mSpanCount>
	//*   6   10:icmpeq          84
		{
			invalidateSpanAssignments();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #1053 <Method void invalidateSpanAssignments()>
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
	//   37   69:invokespecial   #1056 <Method void StaggeredGridLayoutManager$Span(StaggeredGridLayoutManager, int)>
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
	//    0    0:new             #1060 <Class LinearSmoothScroller>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1064 <Method Context RecyclerView.getContext()>
	//    4    8:invokespecial   #1067 <Method void LinearSmoothScroller(Context)>
	//    5   11:astore_1        
		((LinearSmoothScroller) (recyclerview)).setTargetPosition(i);
	//    6   12:aload_1         
	//    7   13:iload_3         
	//    8   14:invokevirtual   #1070 <Method void LinearSmoothScroller.setTargetPosition(int)>
		startSmoothScroll(((RecyclerView.SmoothScroller) (recyclerview)));
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #1074 <Method void startSmoothScroll(RecyclerView$SmoothScroller)>
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
		if(state.isPreLayout() || mPendingScrollPosition == -1)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #658 <Method boolean RecyclerView$State.isPreLayout()>
	//*   2    4:ifne            15
	//*   3    7:aload_0         
	//*   4    8:getfield        #99  <Field int mPendingScrollPosition>
	//*   5   11:iconst_m1       
	//*   6   12:icmpne          17
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		if(mPendingScrollPosition < 0 || mPendingScrollPosition >= state.getItemCount())
	//*   9   17:aload_0         
	//*  10   18:getfield        #99  <Field int mPendingScrollPosition>
	//*  11   21:iflt            35
	//*  12   24:aload_0         
	//*  13   25:getfield        #99  <Field int mPendingScrollPosition>
	//*  14   28:aload_1         
	//*  15   29:invokevirtual   #587 <Method int RecyclerView$State.getItemCount()>
	//*  16   32:icmplt          48
		{
			mPendingScrollPosition = -1;
	//   17   35:aload_0         
	//   18   36:iconst_m1       
	//   19   37:putfield        #99  <Field int mPendingScrollPosition>
			mPendingScrollPositionOffset = 0x80000000;
	//   20   40:aload_0         
	//   21   41:ldc1            #43  <Int 0x80000000>
	//   22   43:putfield        #101 <Field int mPendingScrollPositionOffset>
			return false;
	//   23   46:iconst_0        
	//   24   47:ireturn         
		}
		if(mPendingSavedState == null || mPendingSavedState.mAnchorPosition == -1 || mPendingSavedState.mSpanOffsetsSize < 1)
	//*  25   48:aload_0         
	//*  26   49:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  27   52:ifnull          77
	//*  28   55:aload_0         
	//*  29   56:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  30   59:getfield        #210 <Field int StaggeredGridLayoutManager$SavedState.mAnchorPosition>
	//*  31   62:iconst_m1       
	//*  32   63:icmpeq          77
	//*  33   66:aload_0         
	//*  34   67:getfield        #175 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  35   70:getfield        #178 <Field int StaggeredGridLayoutManager$SavedState.mSpanOffsetsSize>
	//*  36   73:iconst_1        
	//*  37   74:icmpge          370
		{
			state = ((RecyclerView.State) (findViewByPosition(mPendingScrollPosition)));
	//   38   77:aload_0         
	//   39   78:aload_0         
	//   40   79:getfield        #99  <Field int mPendingScrollPosition>
	//   41   82:invokevirtual   #940 <Method View findViewByPosition(int)>
	//   42   85:astore_1        
			if(state != null)
	//*  43   86:aload_1         
	//*  44   87:ifnull          303
			{
				int i;
				if(mShouldReverseLayout)
	//*  45   90:aload_0         
	//*  46   91:getfield        #97  <Field boolean mShouldReverseLayout>
	//*  47   94:ifeq            105
					i = getLastChildPosition();
	//   48   97:aload_0         
	//   49   98:invokevirtual   #500 <Method int getLastChildPosition()>
	//   50  101:istore_3        
				else
	//*  51  102:goto            110
					i = getFirstChildPosition();
	//   52  105:aload_0         
	//   53  106:invokevirtual   #262 <Method int getFirstChildPosition()>
	//   54  109:istore_3        
				anchorinfo.mPosition = i;
	//   55  110:aload_2         
	//   56  111:iload_3         
	//   57  112:putfield        #636 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
				if(mPendingScrollPositionOffset != 0x80000000)
	//*  58  115:aload_0         
	//*  59  116:getfield        #101 <Field int mPendingScrollPositionOffset>
	//*  60  119:ldc1            #43  <Int 0x80000000>
	//*  61  121:icmpeq          186
				{
					if(anchorinfo.mLayoutFromEnd)
	//*  62  124:aload_2         
	//*  63  125:getfield        #220 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
	//*  64  128:ifeq            159
						anchorinfo.mOffset = mPrimaryOrientation.getEndAfterPadding() - mPendingScrollPositionOffset - mPrimaryOrientation.getDecoratedEnd(((View) (state)));
	//   65  131:aload_2         
	//   66  132:aload_0         
	//   67  133:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   68  136:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//   69  139:aload_0         
	//   70  140:getfield        #101 <Field int mPendingScrollPositionOffset>
	//   71  143:isub            
	//   72  144:aload_0         
	//   73  145:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   74  148:aload_1         
	//   75  149:invokevirtual   #698 <Method int OrientationHelper.getDecoratedEnd(View)>
	//   76  152:isub            
	//   77  153:putfield        #612 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
					else
	//*  78  156:goto            184
						anchorinfo.mOffset = (mPrimaryOrientation.getStartAfterPadding() + mPendingScrollPositionOffset) - mPrimaryOrientation.getDecoratedStart(((View) (state)));
	//   79  159:aload_2         
	//   80  160:aload_0         
	//   81  161:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   82  164:invokevirtual   #198 <Method int OrientationHelper.getStartAfterPadding()>
	//   83  167:aload_0         
	//   84  168:getfield        #101 <Field int mPendingScrollPositionOffset>
	//   85  171:iadd            
	//   86  172:aload_0         
	//   87  173:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//   88  176:aload_1         
	//   89  177:invokevirtual   #685 <Method int OrientationHelper.getDecoratedStart(View)>
	//   90  180:isub            
	//   91  181:putfield        #612 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
					return true;
	//   92  184:iconst_1        
	//   93  185:ireturn         
				}
				if(mPrimaryOrientation.getDecoratedMeasurement(((View) (state))) > mPrimaryOrientation.getTotalSpace())
	//*  94  186:aload_0         
	//*  95  187:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//*  96  190:aload_1         
	//*  97  191:invokevirtual   #403 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//*  98  194:aload_0         
	//*  99  195:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//* 100  198:invokevirtual   #632 <Method int OrientationHelper.getTotalSpace()>
	//* 101  201:icmple          237
				{
					if(anchorinfo.mLayoutFromEnd)
	//* 102  204:aload_2         
	//* 103  205:getfield        #220 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
	//* 104  208:ifeq            222
						i = mPrimaryOrientation.getEndAfterPadding();
	//  105  211:aload_0         
	//  106  212:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  107  215:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//  108  218:istore_3        
					else
	//* 109  219:goto            230
						i = mPrimaryOrientation.getStartAfterPadding();
	//  110  222:aload_0         
	//  111  223:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  112  226:invokevirtual   #198 <Method int OrientationHelper.getStartAfterPadding()>
	//  113  229:istore_3        
					anchorinfo.mOffset = i;
	//  114  230:aload_2         
	//  115  231:iload_3         
	//  116  232:putfield        #612 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
					return true;
	//  117  235:iconst_1        
	//  118  236:ireturn         
				}
				i = mPrimaryOrientation.getDecoratedStart(((View) (state))) - mPrimaryOrientation.getStartAfterPadding();
	//  119  237:aload_0         
	//  120  238:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  121  241:aload_1         
	//  122  242:invokevirtual   #685 <Method int OrientationHelper.getDecoratedStart(View)>
	//  123  245:aload_0         
	//  124  246:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  125  249:invokevirtual   #198 <Method int OrientationHelper.getStartAfterPadding()>
	//  126  252:isub            
	//  127  253:istore_3        
				if(i < 0)
	//* 128  254:iload_3         
	//* 129  255:ifge            266
				{
					anchorinfo.mOffset = -i;
	//  130  258:aload_2         
	//  131  259:iload_3         
	//  132  260:ineg            
	//  133  261:putfield        #612 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
					return true;
	//  134  264:iconst_1        
	//  135  265:ireturn         
				}
				i = mPrimaryOrientation.getEndAfterPadding() - mPrimaryOrientation.getDecoratedEnd(((View) (state)));
	//  136  266:aload_0         
	//  137  267:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  138  270:invokevirtual   #195 <Method int OrientationHelper.getEndAfterPadding()>
	//  139  273:aload_0         
	//  140  274:getfield        #189 <Field OrientationHelper mPrimaryOrientation>
	//  141  277:aload_1         
	//  142  278:invokevirtual   #698 <Method int OrientationHelper.getDecoratedEnd(View)>
	//  143  281:isub            
	//  144  282:istore_3        
				if(i < 0)
	//* 145  283:iload_3         
	//* 146  284:ifge            294
				{
					anchorinfo.mOffset = i;
	//  147  287:aload_2         
	//  148  288:iload_3         
	//  149  289:putfield        #612 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
					return true;
	//  150  292:iconst_1        
	//  151  293:ireturn         
				}
				anchorinfo.mOffset = 0x80000000;
	//  152  294:aload_2         
	//  153  295:ldc1            #43  <Int 0x80000000>
	//  154  297:putfield        #612 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
			} else
	//* 155  300:goto            367
			{
				anchorinfo.mPosition = mPendingScrollPosition;
	//  156  303:aload_2         
	//  157  304:aload_0         
	//  158  305:getfield        #99  <Field int mPendingScrollPosition>
	//  159  308:putfield        #636 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
				if(mPendingScrollPositionOffset == 0x80000000)
	//* 160  311:aload_0         
	//* 161  312:getfield        #101 <Field int mPendingScrollPositionOffset>
	//* 162  315:ldc1            #43  <Int 0x80000000>
	//* 163  317:icmpne          354
				{
					boolean flag;
					if(calculateScrollDirectionForPosition(anchorinfo.mPosition) == 1)
	//* 164  320:aload_0         
	//* 165  321:aload_2         
	//* 166  322:getfield        #636 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
	//* 167  325:invokespecial   #811 <Method int calculateScrollDirectionForPosition(int)>
	//* 168  328:iconst_1        
	//* 169  329:icmpne          338
						flag = true;
	//  170  332:iconst_1        
	//  171  333:istore          4
					else
	//* 172  335:goto            341
						flag = false;
	//  173  338:iconst_0        
	//  174  339:istore          4
					anchorinfo.mLayoutFromEnd = flag;
	//  175  341:aload_2         
	//  176  342:iload           4
	//  177  344:putfield        #220 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
					anchorinfo.assignCoordinateFromPadding();
	//  178  347:aload_2         
	//  179  348:invokevirtual   #1079 <Method void StaggeredGridLayoutManager$AnchorInfo.assignCoordinateFromPadding()>
				} else
	//* 180  351:goto            362
				{
					anchorinfo.assignCoordinateFromPadding(mPendingScrollPositionOffset);
	//  181  354:aload_2         
	//  182  355:aload_0         
	//  183  356:getfield        #101 <Field int mPendingScrollPositionOffset>
	//  184  359:invokevirtual   #1081 <Method void StaggeredGridLayoutManager$AnchorInfo.assignCoordinateFromPadding(int)>
				}
				anchorinfo.mInvalidateOffsets = true;
	//  185  362:aload_2         
	//  186  363:iconst_1        
	//  187  364:putfield        #609 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mInvalidateOffsets>
			}
		} else
	//* 188  367:goto            384
		{
			anchorinfo.mOffset = 0x80000000;
	//  189  370:aload_2         
	//  190  371:ldc1            #43  <Int 0x80000000>
	//  191  373:putfield        #612 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
			anchorinfo.mPosition = mPendingScrollPosition;
	//  192  376:aload_2         
	//  193  377:aload_0         
	//  194  378:getfield        #99  <Field int mPendingScrollPosition>
	//  195  381:putfield        #636 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
		}
		return true;
	//  196  384:iconst_1        
	//  197  385:ireturn         
	}

	void updateAnchorInfoForLayout(RecyclerView.State state, AnchorInfo anchorinfo)
	{
		if(updateAnchorFromPendingData(state, anchorinfo))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:aload_2         
	//*   3    3:invokevirtual   #1083 <Method boolean updateAnchorFromPendingData(RecyclerView$State, StaggeredGridLayoutManager$AnchorInfo)>
	//*   4    6:ifeq            10
			return;
	//    5    9:return          
		if(updateAnchorFromChildren(state, anchorinfo))
	//*   6   10:aload_0         
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:invokespecial   #1085 <Method boolean updateAnchorFromChildren(RecyclerView$State, StaggeredGridLayoutManager$AnchorInfo)>
	//*  10   16:ifeq            20
		{
			return;
	//   11   19:return          
		} else
		{
			anchorinfo.assignCoordinateFromPadding();
	//   12   20:aload_2         
	//   13   21:invokevirtual   #1079 <Method void StaggeredGridLayoutManager$AnchorInfo.assignCoordinateFromPadding()>
			anchorinfo.mPosition = 0;
	//   14   24:aload_2         
	//   15   25:iconst_0        
	//   16   26:putfield        #636 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
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
	//    5    7:putfield        #442 <Field int mSizePerSpan>
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
	private static final String TAG = "StaggeredGridLayoutManager";
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
