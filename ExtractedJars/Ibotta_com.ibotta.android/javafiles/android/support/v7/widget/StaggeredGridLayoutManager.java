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
			int ai[] = mSpanReferenceLines;
		//   15   26:aload_0         
		//   16   27:getfield        #57  <Field int[] mSpanReferenceLines>
		//   17   30:astore_1        
			if(ai != null)
		//*  18   31:aload_1         
		//*  19   32:ifnull          40
				Arrays.fill(ai, -1);
		//   20   35:aload_1         
		//   21   36:iconst_m1       
		//   22   37:invokestatic    #63  <Method void Arrays.fill(int[], int)>
		//   23   40:return          
		}

		void saveSpanReferenceLines(Span aspan[])
		{
			int j = aspan.length;
		//    0    0:aload_1         
		//    1    1:arraylength     
		//    2    2:istore_3        
			int ai[] = mSpanReferenceLines;
		//    3    3:aload_0         
		//    4    4:getfield        #57  <Field int[] mSpanReferenceLines>
		//    5    7:astore          4
			if(ai == null || ai.length < j)
		//*   6    9:aload           4
		//*   7   11:ifnull          21
		//*   8   14:aload           4
		//*   9   16:arraylength     
		//*  10   17:iload_3         
		//*  11   18:icmpge          35
				mSpanReferenceLines = new int[mSpans.length];
		//   12   21:aload_0         
		//   13   22:aload_0         
		//   14   23:getfield        #22  <Field StaggeredGridLayoutManager this$0>
		//   15   26:getfield        #69  <Field StaggeredGridLayoutManager$Span[] StaggeredGridLayoutManager.mSpans>
		//   16   29:arraylength     
		//   17   30:newarray        int[]
		//   18   32:putfield        #57  <Field int[] mSpanReferenceLines>
			for(int i = 0; i < j; i++)
		//*  19   35:iconst_0        
		//*  20   36:istore_2        
		//*  21   37:iload_2         
		//*  22   38:iload_3         
		//*  23   39:icmpge          63
				mSpanReferenceLines[i] = aspan[i].getStartLine(0x80000000);
		//   24   42:aload_0         
		//   25   43:getfield        #57  <Field int[] mSpanReferenceLines>
		//   26   46:iload_2         
		//   27   47:aload_1         
		//   28   48:iload_2         
		//   29   49:aaload          
		//   30   50:ldc1            #51  <Int 0x80000000>
		//   31   52:invokevirtual   #75  <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
		//   32   55:iastore         

		//   33   56:iload_2         
		//   34   57:iconst_1        
		//   35   58:iadd            
		//   36   59:istore_2        
		//*  37   60:goto            37
		//   38   63:return          
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
			Span span = mSpan;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field StaggeredGridLayoutManager$Span mSpan>
		//    2    4:astore_1        
			if(span == null)
		//*   3    5:aload_1         
		//*   4    6:ifnonnull       11
				return -1;
		//    5    9:iconst_m1       
		//    6   10:ireturn         
			else
				return span.mIndex;
		//    7   11:aload_1         
		//    8   12:getfield        #35  <Field int StaggeredGridLayoutManager$Span.mIndex>
		//    9   15:ireturn         
		}

		public boolean isFullSpan()
		{
			return mFullSpan;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field boolean mFullSpan>
		//    2    4:ireturn         
		}

		boolean mFullSpan;
		Span mSpan;

		public LayoutParams(int i, int j)
		{
			super(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #15  <Method void RecyclerView$LayoutParams(int, int)>
		//    4    6:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #19  <Method void RecyclerView$LayoutParams(Context, AttributeSet)>
		//    4    6:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #22  <Method void RecyclerView$LayoutParams(android.view.ViewGroup$LayoutParams)>
		//    3    5:return          
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			super(marginlayoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #25  <Method void RecyclerView$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
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
		//*   1    1:getfield        #26  <Field List mFullSpanItems>
		//*   2    4:ifnonnull       9
					return -1;
		//    3    7:iconst_m1       
		//    4    8:ireturn         
				FullSpanItem fullspanitem = getFullSpanItem(i);
		//    5    9:aload_0         
		//    6   10:iload_1         
		//    7   11:invokevirtual   #30  <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem getFullSpanItem(int)>
		//    8   14:astore          4
				if(fullspanitem != null)
		//*   9   16:aload           4
		//*  10   18:ifnull          33
					mFullSpanItems.remove(((Object) (fullspanitem)));
		//   11   21:aload_0         
		//   12   22:getfield        #26  <Field List mFullSpanItems>
		//   13   25:aload           4
		//   14   27:invokeinterface #36  <Method boolean List.remove(Object)>
		//   15   32:pop             
				int k = mFullSpanItems.size();
		//   16   33:aload_0         
		//   17   34:getfield        #26  <Field List mFullSpanItems>
		//   18   37:invokeinterface #40  <Method int List.size()>
		//   19   42:istore_3        
				for(j = 0; j < k; j++)
		//*  20   43:iconst_0        
		//*  21   44:istore_2        
		//*  22   45:iload_2         
		//*  23   46:iload_3         
		//*  24   47:icmpge          80
					if(((FullSpanItem)mFullSpanItems.get(j)).mPosition >= i)
		//*  25   50:aload_0         
		//*  26   51:getfield        #26  <Field List mFullSpanItems>
		//*  27   54:iload_2         
		//*  28   55:invokeinterface #44  <Method Object List.get(int)>
		//*  29   60:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//*  30   63:getfield        #48  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
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
		//   45   88:getfield        #26  <Field List mFullSpanItems>
		//   46   91:iload_2         
		//   47   92:invokeinterface #44  <Method Object List.get(int)>
		//   48   97:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//   49  100:astore          4
				mFullSpanItems.remove(j);
		//   50  102:aload_0         
		//   51  103:getfield        #26  <Field List mFullSpanItems>
		//   52  106:iload_2         
		//   53  107:invokeinterface #50  <Method Object List.remove(int)>
		//   54  112:pop             
				return fullspanitem1.mPosition;
		//   55  113:aload           4
		//   56  115:getfield        #48  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
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
			List list = mFullSpanItems;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field List mFullSpanItems>
		//    2    4:astore          4
			if(list == null)
		//*   3    6:aload           4
		//*   4    8:ifnonnull       12
				return;
		//    5   11:return          
			for(int k = list.size() - 1; k >= 0; k--)
		//*   6   12:aload           4
		//*   7   14:invokeinterface #40  <Method int List.size()>
		//*   8   19:iconst_1        
		//*   9   20:isub            
		//*  10   21:istore_3        
		//*  11   22:iload_3         
		//*  12   23:iflt            72
			{
				FullSpanItem fullspanitem = (FullSpanItem)mFullSpanItems.get(k);
		//   13   26:aload_0         
		//   14   27:getfield        #26  <Field List mFullSpanItems>
		//   15   30:iload_3         
		//   16   31:invokeinterface #44  <Method Object List.get(int)>
		//   17   36:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//   18   39:astore          4
				if(fullspanitem.mPosition >= i)
		//*  19   41:aload           4
		//*  20   43:getfield        #48  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//*  21   46:iload_1         
		//*  22   47:icmpge          53
		//*  23   50:goto            65
					fullspanitem.mPosition = fullspanitem.mPosition + j;
		//   24   53:aload           4
		//   25   55:aload           4
		//   26   57:getfield        #48  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//   27   60:iload_2         
		//   28   61:iadd            
		//   29   62:putfield        #48  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
			}

		//   30   65:iload_3         
		//   31   66:iconst_1        
		//   32   67:isub            
		//   33   68:istore_3        
		//*  34   69:goto            22
		//   35   72:return          
		}

		private void offsetFullSpansForRemoval(int i, int j)
		{
			List list = mFullSpanItems;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field List mFullSpanItems>
		//    2    4:astore          4
			if(list == null)
		//*   3    6:aload           4
		//*   4    8:ifnonnull       12
				return;
		//    5   11:return          
			for(int k = list.size() - 1; k >= 0; k--)
		//*   6   12:aload           4
		//*   7   14:invokeinterface #40  <Method int List.size()>
		//*   8   19:iconst_1        
		//*   9   20:isub            
		//*  10   21:istore_3        
		//*  11   22:iload_3         
		//*  12   23:iflt            97
			{
				FullSpanItem fullspanitem = (FullSpanItem)mFullSpanItems.get(k);
		//   13   26:aload_0         
		//   14   27:getfield        #26  <Field List mFullSpanItems>
		//   15   30:iload_3         
		//   16   31:invokeinterface #44  <Method Object List.get(int)>
		//   17   36:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//   18   39:astore          4
				if(fullspanitem.mPosition < i)
		//*  19   41:aload           4
		//*  20   43:getfield        #48  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//*  21   46:iload_1         
		//*  22   47:icmpge          53
					continue;
		//   23   50:goto            90
				if(fullspanitem.mPosition < i + j)
		//*  24   53:aload           4
		//*  25   55:getfield        #48  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//*  26   58:iload_1         
		//*  27   59:iload_2         
		//*  28   60:iadd            
		//*  29   61:icmpge          78
					mFullSpanItems.remove(k);
		//   30   64:aload_0         
		//   31   65:getfield        #26  <Field List mFullSpanItems>
		//   32   68:iload_3         
		//   33   69:invokeinterface #50  <Method Object List.remove(int)>
		//   34   74:pop             
				else
		//*  35   75:goto            90
					fullspanitem.mPosition = fullspanitem.mPosition - j;
		//   36   78:aload           4
		//   37   80:aload           4
		//   38   82:getfield        #48  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//   39   85:iload_2         
		//   40   86:isub            
		//   41   87:putfield        #48  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
			}

		//   42   90:iload_3         
		//   43   91:iconst_1        
		//   44   92:isub            
		//   45   93:istore_3        
		//*  46   94:goto            22
		//   47   97:return          
		}

		public void addFullSpanItem(FullSpanItem fullspanitem)
		{
			if(mFullSpanItems == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field List mFullSpanItems>
		//*   2    4:ifnonnull       18
				mFullSpanItems = ((List) (new ArrayList()));
		//    3    7:aload_0         
		//    4    8:new             #57  <Class ArrayList>
		//    5   11:dup             
		//    6   12:invokespecial   #58  <Method void ArrayList()>
		//    7   15:putfield        #26  <Field List mFullSpanItems>
			int j = mFullSpanItems.size();
		//    8   18:aload_0         
		//    9   19:getfield        #26  <Field List mFullSpanItems>
		//   10   22:invokeinterface #40  <Method int List.size()>
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
		//   18   36:getfield        #26  <Field List mFullSpanItems>
		//   19   39:iload_2         
		//   20   40:invokeinterface #44  <Method Object List.get(int)>
		//   21   45:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//   22   48:astore          4
				if(fullspanitem1.mPosition == fullspanitem.mPosition)
		//*  23   50:aload           4
		//*  24   52:getfield        #48  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//*  25   55:aload_1         
		//*  26   56:getfield        #48  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//*  27   59:icmpne          73
					mFullSpanItems.remove(i);
		//   28   62:aload_0         
		//   29   63:getfield        #26  <Field List mFullSpanItems>
		//   30   66:iload_2         
		//   31   67:invokeinterface #50  <Method Object List.remove(int)>
		//   32   72:pop             
				if(fullspanitem1.mPosition >= fullspanitem.mPosition)
		//*  33   73:aload           4
		//*  34   75:getfield        #48  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//*  35   78:aload_1         
		//*  36   79:getfield        #48  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//*  37   82:icmplt          97
				{
					mFullSpanItems.add(i, ((Object) (fullspanitem)));
		//   38   85:aload_0         
		//   39   86:getfield        #26  <Field List mFullSpanItems>
		//   40   89:iload_2         
		//   41   90:aload_1         
		//   42   91:invokeinterface #62  <Method void List.add(int, Object)>
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
		//   50  105:getfield        #26  <Field List mFullSpanItems>
		//   51  108:aload_1         
		//   52  109:invokeinterface #64  <Method boolean List.add(Object)>
		//   53  114:pop             
		//   54  115:return          
		}

		void clear()
		{
			int ai[] = mData;
		//    0    0:aload_0         
		//    1    1:getfield        #67  <Field int[] mData>
		//    2    4:astore_1        
			if(ai != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          14
				Arrays.fill(ai, -1);
		//    5    9:aload_1         
		//    6   10:iconst_m1       
		//    7   11:invokestatic    #73  <Method void Arrays.fill(int[], int)>
			mFullSpanItems = null;
		//    8   14:aload_0         
		//    9   15:aconst_null     
		//   10   16:putfield        #26  <Field List mFullSpanItems>
		//   11   19:return          
		}

		void ensureSize(int i)
		{
			int ai[] = mData;
		//    0    0:aload_0         
		//    1    1:getfield        #67  <Field int[] mData>
		//    2    4:astore_2        
			if(ai == null)
		//*   3    5:aload_2         
		//*   4    6:ifnonnull       32
			{
				mData = new int[Math.max(i, 10) + 1];
		//    5    9:aload_0         
		//    6   10:iload_1         
		//    7   11:bipush          10
		//    8   13:invokestatic    #81  <Method int Math.max(int, int)>
		//    9   16:iconst_1        
		//   10   17:iadd            
		//   11   18:newarray        int[]
		//   12   20:putfield        #67  <Field int[] mData>
				Arrays.fill(mData, -1);
		//   13   23:aload_0         
		//   14   24:getfield        #67  <Field int[] mData>
		//   15   27:iconst_m1       
		//   16   28:invokestatic    #73  <Method void Arrays.fill(int[], int)>
				return;
		//   17   31:return          
			}
			if(i >= ai.length)
		//*  18   32:iload_1         
		//*  19   33:aload_2         
		//*  20   34:arraylength     
		//*  21   35:icmplt          75
			{
				mData = new int[sizeForPosition(i)];
		//   22   38:aload_0         
		//   23   39:aload_0         
		//   24   40:iload_1         
		//   25   41:invokevirtual   #84  <Method int sizeForPosition(int)>
		//   26   44:newarray        int[]
		//   27   46:putfield        #67  <Field int[] mData>
				System.arraycopy(((Object) (ai)), 0, ((Object) (mData)), 0, ai.length);
		//   28   49:aload_2         
		//   29   50:iconst_0        
		//   30   51:aload_0         
		//   31   52:getfield        #67  <Field int[] mData>
		//   32   55:iconst_0        
		//   33   56:aload_2         
		//   34   57:arraylength     
		//   35   58:invokestatic    #90  <Method void System.arraycopy(Object, int, Object, int, int)>
				int ai1[] = mData;
		//   36   61:aload_0         
		//   37   62:getfield        #67  <Field int[] mData>
		//   38   65:astore_3        
				Arrays.fill(ai1, ai.length, ai1.length, -1);
		//   39   66:aload_3         
		//   40   67:aload_2         
		//   41   68:arraylength     
		//   42   69:aload_3         
		//   43   70:arraylength     
		//   44   71:iconst_m1       
		//   45   72:invokestatic    #93  <Method void Arrays.fill(int[], int, int, int)>
			}
		//   46   75:return          
		}

		int forceInvalidateAfter(int i)
		{
			List list = mFullSpanItems;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field List mFullSpanItems>
		//    2    4:astore_3        
			if(list != null)
		//*   3    5:aload_3         
		//*   4    6:ifnull          60
			{
				for(int j = list.size() - 1; j >= 0; j--)
		//*   5    9:aload_3         
		//*   6   10:invokeinterface #40  <Method int List.size()>
		//*   7   15:iconst_1        
		//*   8   16:isub            
		//*   9   17:istore_2        
		//*  10   18:iload_2         
		//*  11   19:iflt            60
					if(((FullSpanItem)mFullSpanItems.get(j)).mPosition >= i)
		//*  12   22:aload_0         
		//*  13   23:getfield        #26  <Field List mFullSpanItems>
		//*  14   26:iload_2         
		//*  15   27:invokeinterface #44  <Method Object List.get(int)>
		//*  16   32:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//*  17   35:getfield        #48  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//*  18   38:iload_1         
		//*  19   39:icmplt          53
						mFullSpanItems.remove(j);
		//   20   42:aload_0         
		//   21   43:getfield        #26  <Field List mFullSpanItems>
		//   22   46:iload_2         
		//   23   47:invokeinterface #50  <Method Object List.remove(int)>
		//   24   52:pop             

		//   25   53:iload_2         
		//   26   54:iconst_1        
		//   27   55:isub            
		//   28   56:istore_2        
			}
		//*  29   57:goto            18
			return invalidateAfter(i);
		//   30   60:aload_0         
		//   31   61:iload_1         
		//   32   62:invokevirtual   #97  <Method int invalidateAfter(int)>
		//   33   65:ireturn         
		}

		public FullSpanItem getFirstFullSpanItemInRange(int i, int j, int k, boolean flag)
		{
			List list = mFullSpanItems;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field List mFullSpanItems>
		//    2    4:astore          7
			if(list == null)
		//*   3    6:aload           7
		//*   4    8:ifnonnull       13
				return null;
		//    5   11:aconst_null     
		//    6   12:areturn         
			int i1 = list.size();
		//    7   13:aload           7
		//    8   15:invokeinterface #40  <Method int List.size()>
		//    9   20:istore          6
			for(int l = 0; l < i1; l++)
		//*  10   22:iconst_0        
		//*  11   23:istore          5
		//*  12   25:iload           5
		//*  13   27:iload           6
		//*  14   29:icmpge          106
			{
				FullSpanItem fullspanitem = (FullSpanItem)mFullSpanItems.get(l);
		//   15   32:aload_0         
		//   16   33:getfield        #26  <Field List mFullSpanItems>
		//   17   36:iload           5
		//   18   38:invokeinterface #44  <Method Object List.get(int)>
		//   19   43:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//   20   46:astore          7
				if(fullspanitem.mPosition >= j)
		//*  21   48:aload           7
		//*  22   50:getfield        #48  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//*  23   53:iload_2         
		//*  24   54:icmplt          59
					return null;
		//   25   57:aconst_null     
		//   26   58:areturn         
				if(fullspanitem.mPosition >= i && (k == 0 || fullspanitem.mGapDir == k || flag && fullspanitem.mHasUnwantedGapAfter))
		//*  27   59:aload           7
		//*  28   61:getfield        #48  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//*  29   64:iload_1         
		//*  30   65:icmplt          97
		//*  31   68:iload_3         
		//*  32   69:ifeq            94
		//*  33   72:aload           7
		//*  34   74:getfield        #102 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapDir>
		//*  35   77:iload_3         
		//*  36   78:icmpeq          94
		//*  37   81:iload           4
		//*  38   83:ifeq            97
		//*  39   86:aload           7
		//*  40   88:getfield        #106 <Field boolean StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mHasUnwantedGapAfter>
		//*  41   91:ifeq            97
					return fullspanitem;
		//   42   94:aload           7
		//   43   96:areturn         
			}

		//   44   97:iload           5
		//   45   99:iconst_1        
		//   46  100:iadd            
		//   47  101:istore          5
		//*  48  103:goto            25
			return null;
		//   49  106:aconst_null     
		//   50  107:areturn         
		}

		public FullSpanItem getFullSpanItem(int i)
		{
			List list = mFullSpanItems;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field List mFullSpanItems>
		//    2    4:astore_3        
			if(list == null)
		//*   3    5:aload_3         
		//*   4    6:ifnonnull       11
				return null;
		//    5    9:aconst_null     
		//    6   10:areturn         
			for(int j = list.size() - 1; j >= 0; j--)
		//*   7   11:aload_3         
		//*   8   12:invokeinterface #40  <Method int List.size()>
		//*   9   17:iconst_1        
		//*  10   18:isub            
		//*  11   19:istore_2        
		//*  12   20:iload_2         
		//*  13   21:iflt            55
			{
				FullSpanItem fullspanitem = (FullSpanItem)mFullSpanItems.get(j);
		//   14   24:aload_0         
		//   15   25:getfield        #26  <Field List mFullSpanItems>
		//   16   28:iload_2         
		//   17   29:invokeinterface #44  <Method Object List.get(int)>
		//   18   34:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//   19   37:astore_3        
				if(fullspanitem.mPosition == i)
		//*  20   38:aload_3         
		//*  21   39:getfield        #48  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		//*  22   42:iload_1         
		//*  23   43:icmpne          48
					return fullspanitem;
		//   24   46:aload_3         
		//   25   47:areturn         
			}

		//   26   48:iload_2         
		//   27   49:iconst_1        
		//   28   50:isub            
		//   29   51:istore_2        
		//*  30   52:goto            20
			return null;
		//   31   55:aconst_null     
		//   32   56:areturn         
		}

		int getSpan(int i)
		{
			int ai[] = mData;
		//    0    0:aload_0         
		//    1    1:getfield        #67  <Field int[] mData>
		//    2    4:astore_2        
			if(ai != null && i < ai.length)
		//*   3    5:aload_2         
		//*   4    6:ifnull          22
		//*   5    9:iload_1         
		//*   6   10:aload_2         
		//*   7   11:arraylength     
		//*   8   12:icmplt          18
		//*   9   15:goto            22
				return ai[i];
		//   10   18:aload_2         
		//   11   19:iload_1         
		//   12   20:iaload          
		//   13   21:ireturn         
			else
				return -1;
		//   14   22:iconst_m1       
		//   15   23:ireturn         
		}

		int invalidateAfter(int i)
		{
			int ai[] = mData;
		//    0    0:aload_0         
		//    1    1:getfield        #67  <Field int[] mData>
		//    2    4:astore_3        
			if(ai == null)
		//*   3    5:aload_3         
		//*   4    6:ifnonnull       11
				return -1;
		//    5    9:iconst_m1       
		//    6   10:ireturn         
			if(i >= ai.length)
		//*   7   11:iload_1         
		//*   8   12:aload_3         
		//*   9   13:arraylength     
		//*  10   14:icmplt          19
				return -1;
		//   11   17:iconst_m1       
		//   12   18:ireturn         
			int j = invalidateFullSpansAfter(i);
		//   13   19:aload_0         
		//   14   20:iload_1         
		//   15   21:invokespecial   #109 <Method int invalidateFullSpansAfter(int)>
		//   16   24:istore_2        
			if(j == -1)
		//*  17   25:iload_2         
		//*  18   26:iconst_m1       
		//*  19   27:icmpne          49
			{
				int ai1[] = mData;
		//   20   30:aload_0         
		//   21   31:getfield        #67  <Field int[] mData>
		//   22   34:astore_3        
				Arrays.fill(ai1, i, ai1.length, -1);
		//   23   35:aload_3         
		//   24   36:iload_1         
		//   25   37:aload_3         
		//   26   38:arraylength     
		//   27   39:iconst_m1       
		//   28   40:invokestatic    #93  <Method void Arrays.fill(int[], int, int, int)>
				return mData.length;
		//   29   43:aload_0         
		//   30   44:getfield        #67  <Field int[] mData>
		//   31   47:arraylength     
		//   32   48:ireturn         
			} else
			{
				int ai2[] = mData;
		//   33   49:aload_0         
		//   34   50:getfield        #67  <Field int[] mData>
		//   35   53:astore_3        
				j++;
		//   36   54:iload_2         
		//   37   55:iconst_1        
		//   38   56:iadd            
		//   39   57:istore_2        
				Arrays.fill(ai2, i, j, -1);
		//   40   58:aload_3         
		//   41   59:iload_1         
		//   42   60:iload_2         
		//   43   61:iconst_m1       
		//   44   62:invokestatic    #93  <Method void Arrays.fill(int[], int, int, int)>
				return j;
		//   45   65:iload_2         
		//   46   66:ireturn         
			}
		}

		void offsetForAddition(int i, int j)
		{
			int ai[] = mData;
		//    0    0:aload_0         
		//    1    1:getfield        #67  <Field int[] mData>
		//    2    4:astore          4
			if(ai != null)
		//*   3    6:aload           4
		//*   4    8:ifnull          67
			{
				if(i >= ai.length)
		//*   5   11:iload_1         
		//*   6   12:aload           4
		//*   7   14:arraylength     
		//*   8   15:icmplt          19
				{
					return;
		//    9   18:return          
				} else
				{
					int k = i + j;
		//   10   19:iload_1         
		//   11   20:iload_2         
		//   12   21:iadd            
		//   13   22:istore_3        
					ensureSize(k);
		//   14   23:aload_0         
		//   15   24:iload_3         
		//   16   25:invokevirtual   #112 <Method void ensureSize(int)>
					int ai1[] = mData;
		//   17   28:aload_0         
		//   18   29:getfield        #67  <Field int[] mData>
		//   19   32:astore          4
					System.arraycopy(((Object) (ai1)), i, ((Object) (ai1)), k, ai1.length - i - j);
		//   20   34:aload           4
		//   21   36:iload_1         
		//   22   37:aload           4
		//   23   39:iload_3         
		//   24   40:aload           4
		//   25   42:arraylength     
		//   26   43:iload_1         
		//   27   44:isub            
		//   28   45:iload_2         
		//   29   46:isub            
		//   30   47:invokestatic    #90  <Method void System.arraycopy(Object, int, Object, int, int)>
					Arrays.fill(mData, i, k, -1);
		//   31   50:aload_0         
		//   32   51:getfield        #67  <Field int[] mData>
		//   33   54:iload_1         
		//   34   55:iload_3         
		//   35   56:iconst_m1       
		//   36   57:invokestatic    #93  <Method void Arrays.fill(int[], int, int, int)>
					offsetFullSpansForAddition(i, j);
		//   37   60:aload_0         
		//   38   61:iload_1         
		//   39   62:iload_2         
		//   40   63:invokespecial   #114 <Method void offsetFullSpansForAddition(int, int)>
					return;
		//   41   66:return          
				}
			} else
			{
				return;
		//   42   67:return          
			}
		}

		void offsetForRemoval(int i, int j)
		{
			int ai[] = mData;
		//    0    0:aload_0         
		//    1    1:getfield        #67  <Field int[] mData>
		//    2    4:astore          4
			if(ai != null)
		//*   3    6:aload           4
		//*   4    8:ifnull          77
			{
				if(i >= ai.length)
		//*   5   11:iload_1         
		//*   6   12:aload           4
		//*   7   14:arraylength     
		//*   8   15:icmplt          19
				{
					return;
		//    9   18:return          
				} else
				{
					int k = i + j;
		//   10   19:iload_1         
		//   11   20:iload_2         
		//   12   21:iadd            
		//   13   22:istore_3        
					ensureSize(k);
		//   14   23:aload_0         
		//   15   24:iload_3         
		//   16   25:invokevirtual   #112 <Method void ensureSize(int)>
					int ai1[] = mData;
		//   17   28:aload_0         
		//   18   29:getfield        #67  <Field int[] mData>
		//   19   32:astore          4
					System.arraycopy(((Object) (ai1)), k, ((Object) (ai1)), i, ai1.length - i - j);
		//   20   34:aload           4
		//   21   36:iload_3         
		//   22   37:aload           4
		//   23   39:iload_1         
		//   24   40:aload           4
		//   25   42:arraylength     
		//   26   43:iload_1         
		//   27   44:isub            
		//   28   45:iload_2         
		//   29   46:isub            
		//   30   47:invokestatic    #90  <Method void System.arraycopy(Object, int, Object, int, int)>
					ai1 = mData;
		//   31   50:aload_0         
		//   32   51:getfield        #67  <Field int[] mData>
		//   33   54:astore          4
					Arrays.fill(ai1, ai1.length - j, ai1.length, -1);
		//   34   56:aload           4
		//   35   58:aload           4
		//   36   60:arraylength     
		//   37   61:iload_2         
		//   38   62:isub            
		//   39   63:aload           4
		//   40   65:arraylength     
		//   41   66:iconst_m1       
		//   42   67:invokestatic    #93  <Method void Arrays.fill(int[], int, int, int)>
					offsetFullSpansForRemoval(i, j);
		//   43   70:aload_0         
		//   44   71:iload_1         
		//   45   72:iload_2         
		//   46   73:invokespecial   #117 <Method void offsetFullSpansForRemoval(int, int)>
					return;
		//   47   76:return          
				}
			} else
			{
				return;
		//   48   77:return          
			}
		}

		void setSpan(int i, Span span)
		{
			ensureSize(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #112 <Method void ensureSize(int)>
			mData[i] = span.mIndex;
		//    3    5:aload_0         
		//    4    6:getfield        #67  <Field int[] mData>
		//    5    9:iload_1         
		//    6   10:aload_2         
		//    7   11:getfield        #124 <Field int StaggeredGridLayoutManager$Span.mIndex>
		//    8   14:iastore         
		//    9   15:return          
		}

		int sizeForPosition(int i)
		{
			int j;
			for(j = mData.length; j <= i; j *= 2);
		//    0    0:aload_0         
		//    1    1:getfield        #67  <Field int[] mData>
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

		int mData[];
		List mFullSpanItems;

		LazySpanLookup()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
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
			int ai[] = mGapPerSpan;
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field int[] mGapPerSpan>
		//    2    4:astore_2        
			if(ai == null)
		//*   3    5:aload_2         
		//*   4    6:ifnonnull       11
				return 0;
		//    5    9:iconst_0        
		//    6   10:ireturn         
			else
				return ai[i];
		//    7   11:aload_2         
		//    8   12:iload_1         
		//    9   13:iaload          
		//   10   14:ireturn         
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
			int i = mSpanOffsetsSize;
		//   14   28:aload_0         
		//   15   29:getfield        #55  <Field int mSpanOffsetsSize>
		//   16   32:istore_2        
			if(i > 0)
		//*  17   33:iload_2         
		//*  18   34:ifle            52
			{
				mSpanOffsets = new int[i];
		//   19   37:aload_0         
		//   20   38:iload_2         
		//   21   39:newarray        int[]
		//   22   41:putfield        #57  <Field int[] mSpanOffsets>
				parcel.readIntArray(mSpanOffsets);
		//   23   44:aload_1         
		//   24   45:aload_0         
		//   25   46:getfield        #57  <Field int[] mSpanOffsets>
		//   26   49:invokevirtual   #61  <Method void Parcel.readIntArray(int[])>
			}
			mSpanLookupSize = parcel.readInt();
		//   27   52:aload_0         
		//   28   53:aload_1         
		//   29   54:invokevirtual   #49  <Method int Parcel.readInt()>
		//   30   57:putfield        #63  <Field int mSpanLookupSize>
			i = mSpanLookupSize;
		//   31   60:aload_0         
		//   32   61:getfield        #63  <Field int mSpanLookupSize>
		//   33   64:istore_2        
			if(i > 0)
		//*  34   65:iload_2         
		//*  35   66:ifle            84
			{
				mSpanLookup = new int[i];
		//   36   69:aload_0         
		//   37   70:iload_2         
		//   38   71:newarray        int[]
		//   39   73:putfield        #65  <Field int[] mSpanLookup>
				parcel.readIntArray(mSpanLookup);
		//   40   76:aload_1         
		//   41   77:aload_0         
		//   42   78:getfield        #65  <Field int[] mSpanLookup>
		//   43   81:invokevirtual   #61  <Method void Parcel.readIntArray(int[])>
			}
			i = parcel.readInt();
		//   44   84:aload_1         
		//   45   85:invokevirtual   #49  <Method int Parcel.readInt()>
		//   46   88:istore_2        
			boolean flag1 = false;
		//   47   89:iconst_0        
		//   48   90:istore          4
			boolean flag;
			if(i == 1)
		//*  49   92:iload_2         
		//*  50   93:iconst_1        
		//*  51   94:icmpne          102
				flag = true;
		//   52   97:iconst_1        
		//   53   98:istore_3        
			else
		//*  54   99:goto            104
				flag = false;
		//   55  102:iconst_0        
		//   56  103:istore_3        
			mReverseLayout = flag;
		//   57  104:aload_0         
		//   58  105:iload_3         
		//   59  106:putfield        #67  <Field boolean mReverseLayout>
			if(parcel.readInt() == 1)
		//*  60  109:aload_1         
		//*  61  110:invokevirtual   #49  <Method int Parcel.readInt()>
		//*  62  113:iconst_1        
		//*  63  114:icmpne          122
				flag = true;
		//   64  117:iconst_1        
		//   65  118:istore_3        
			else
		//*  66  119:goto            124
				flag = false;
		//   67  122:iconst_0        
		//   68  123:istore_3        
			mAnchorLayoutFromEnd = flag;
		//   69  124:aload_0         
		//   70  125:iload_3         
		//   71  126:putfield        #69  <Field boolean mAnchorLayoutFromEnd>
			flag = flag1;
		//   72  129:iload           4
		//   73  131:istore_3        
			if(parcel.readInt() == 1)
		//*  74  132:aload_1         
		//*  75  133:invokevirtual   #49  <Method int Parcel.readInt()>
		//*  76  136:iconst_1        
		//*  77  137:icmpne          142
				flag = true;
		//   78  140:iconst_1        
		//   79  141:istore_3        
			mLastLayoutRTL = flag;
		//   80  142:aload_0         
		//   81  143:iload_3         
		//   82  144:putfield        #71  <Field boolean mLastLayoutRTL>
			mFullSpanItems = ((List) (parcel.readArrayList(((Class) (android/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)).getClassLoader())));
		//   83  147:aload_0         
		//   84  148:aload_1         
		//   85  149:ldc1            #73  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//   86  151:invokevirtual   #79  <Method ClassLoader Class.getClassLoader()>
		//   87  154:invokevirtual   #83  <Method ArrayList Parcel.readArrayList(ClassLoader)>
		//   88  157:putfield        #85  <Field List mFullSpanItems>
		//   89  160:return          
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
		//    2    2:invokevirtual   #45  <Method StaggeredGridLayoutManager$LayoutParams getLayoutParams(View)>
		//    3    5:astore_2        
			layoutparams.mSpan = this;
		//    4    6:aload_2         
		//    5    7:aload_0         
		//    6    8:putfield        #51  <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
			mViews.add(((Object) (view)));
		//    7   11:aload_0         
		//    8   12:getfield        #29  <Field ArrayList mViews>
		//    9   15:aload_1         
		//   10   16:invokevirtual   #55  <Method boolean ArrayList.add(Object)>
		//   11   19:pop             
			mCachedEnd = 0x80000000;
		//   12   20:aload_0         
		//   13   21:ldc1            #30  <Int 0x80000000>
		//   14   23:putfield        #34  <Field int mCachedEnd>
			if(mViews.size() == 1)
		//*  15   26:aload_0         
		//*  16   27:getfield        #29  <Field ArrayList mViews>
		//*  17   30:invokevirtual   #59  <Method int ArrayList.size()>
		//*  18   33:iconst_1        
		//*  19   34:icmpne          43
				mCachedStart = 0x80000000;
		//   20   37:aload_0         
		//   21   38:ldc1            #30  <Int 0x80000000>
		//   22   40:putfield        #32  <Field int mCachedStart>
			if(layoutparams.isItemRemoved() || layoutparams.isItemChanged())
		//*  23   43:aload_2         
		//*  24   44:invokevirtual   #63  <Method boolean StaggeredGridLayoutManager$LayoutParams.isItemRemoved()>
		//*  25   47:ifne            57
		//*  26   50:aload_2         
		//*  27   51:invokevirtual   #66  <Method boolean StaggeredGridLayoutManager$LayoutParams.isItemChanged()>
		//*  28   54:ifeq            77
				mDeletedSize = mDeletedSize + mPrimaryOrientation.getDecoratedMeasurement(view);
		//   29   57:aload_0         
		//   30   58:aload_0         
		//   31   59:getfield        #36  <Field int mDeletedSize>
		//   32   62:aload_0         
		//   33   63:getfield        #21  <Field StaggeredGridLayoutManager this$0>
		//   34   66:getfield        #70  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//   35   69:aload_1         
		//   36   70:invokevirtual   #76  <Method int OrientationHelper.getDecoratedMeasurement(View)>
		//   37   73:iadd            
		//   38   74:putfield        #36  <Field int mDeletedSize>
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
		//    3    5:ldc1            #30  <Int 0x80000000>
		//    4    7:invokevirtual   #82  <Method int getEndLine(int)>
		//    5   10:istore_3        
			else
		//*   6   11:goto            21
				j = getStartLine(0x80000000);
		//    7   14:aload_0         
		//    8   15:ldc1            #30  <Int 0x80000000>
		//    9   17:invokevirtual   #85  <Method int getStartLine(int)>
		//   10   20:istore_3        
			clear();
		//   11   21:aload_0         
		//   12   22:invokevirtual   #88  <Method void clear()>
			if(j == 0x80000000)
		//*  13   25:iload_3         
		//*  14   26:ldc1            #30  <Int 0x80000000>
		//*  15   28:icmpne          32
				return;
		//   16   31:return          
			if(flag && j < mPrimaryOrientation.getEndAfterPadding() || !flag && j > mPrimaryOrientation.getStartAfterPadding())
		//*  17   32:iload_1         
		//*  18   33:ifeq            50
		//*  19   36:iload_3         
		//*  20   37:aload_0         
		//*  21   38:getfield        #21  <Field StaggeredGridLayoutManager this$0>
		//*  22   41:getfield        #70  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//*  23   44:invokevirtual   #91  <Method int OrientationHelper.getEndAfterPadding()>
		//*  24   47:icmplt          68
		//*  25   50:iload_1         
		//*  26   51:ifne            69
		//*  27   54:iload_3         
		//*  28   55:aload_0         
		//*  29   56:getfield        #21  <Field StaggeredGridLayoutManager this$0>
		//*  30   59:getfield        #70  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//*  31   62:invokevirtual   #94  <Method int OrientationHelper.getStartAfterPadding()>
		//*  32   65:icmple          69
				return;
		//   33   68:return          
			int k = j;
		//   34   69:iload_3         
		//   35   70:istore          4
			if(i != 0x80000000)
		//*  36   72:iload_2         
		//*  37   73:ldc1            #30  <Int 0x80000000>
		//*  38   75:icmpeq          83
				k = j + i;
		//   39   78:iload_3         
		//   40   79:iload_2         
		//   41   80:iadd            
		//   42   81:istore          4
			mCachedEnd = k;
		//   43   83:aload_0         
		//   44   84:iload           4
		//   45   86:putfield        #34  <Field int mCachedEnd>
			mCachedStart = k;
		//   46   89:aload_0         
		//   47   90:iload           4
		//   48   92:putfield        #32  <Field int mCachedStart>
		//   49   95:return          
		}

		void calculateCachedEnd()
		{
			Object obj = ((Object) (mViews));
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field ArrayList mViews>
		//    2    4:astore_1        
			obj = ((Object) ((View)((ArrayList) (obj)).get(((ArrayList) (obj)).size() - 1)));
		//    3    5:aload_1         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #59  <Method int ArrayList.size()>
		//    6   10:iconst_1        
		//    7   11:isub            
		//    8   12:invokevirtual   #99  <Method Object ArrayList.get(int)>
		//    9   15:checkcast       #101 <Class View>
		//   10   18:astore_1        
			LayoutParams layoutparams = getLayoutParams(((View) (obj)));
		//   11   19:aload_0         
		//   12   20:aload_1         
		//   13   21:invokevirtual   #45  <Method StaggeredGridLayoutManager$LayoutParams getLayoutParams(View)>
		//   14   24:astore_2        
			mCachedEnd = mPrimaryOrientation.getDecoratedEnd(((View) (obj)));
		//   15   25:aload_0         
		//   16   26:aload_0         
		//   17   27:getfield        #21  <Field StaggeredGridLayoutManager this$0>
		//   18   30:getfield        #70  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//   19   33:aload_1         
		//   20   34:invokevirtual   #104 <Method int OrientationHelper.getDecoratedEnd(View)>
		//   21   37:putfield        #34  <Field int mCachedEnd>
			if(layoutparams.mFullSpan)
		//*  22   40:aload_2         
		//*  23   41:getfield        #108 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
		//*  24   44:ifeq            91
			{
				LazySpanLookup.FullSpanItem fullspanitem = mLazySpanLookup.getFullSpanItem(layoutparams.getViewLayoutPosition());
		//   25   47:aload_0         
		//   26   48:getfield        #21  <Field StaggeredGridLayoutManager this$0>
		//   27   51:getfield        #112 <Field StaggeredGridLayoutManager$LazySpanLookup StaggeredGridLayoutManager.mLazySpanLookup>
		//   28   54:aload_2         
		//   29   55:invokevirtual   #115 <Method int StaggeredGridLayoutManager$LayoutParams.getViewLayoutPosition()>
		//   30   58:invokevirtual   #121 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem StaggeredGridLayoutManager$LazySpanLookup.getFullSpanItem(int)>
		//   31   61:astore_1        
				if(fullspanitem != null && fullspanitem.mGapDir == 1)
		//*  32   62:aload_1         
		//*  33   63:ifnull          91
		//*  34   66:aload_1         
		//*  35   67:getfield        #126 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapDir>
		//*  36   70:iconst_1        
		//*  37   71:icmpne          91
					mCachedEnd = mCachedEnd + fullspanitem.getGapForSpan(mIndex);
		//   38   74:aload_0         
		//   39   75:aload_0         
		//   40   76:getfield        #34  <Field int mCachedEnd>
		//   41   79:aload_1         
		//   42   80:aload_0         
		//   43   81:getfield        #38  <Field int mIndex>
		//   44   84:invokevirtual   #129 <Method int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.getGapForSpan(int)>
		//   45   87:iadd            
		//   46   88:putfield        #34  <Field int mCachedEnd>
			}
		//   47   91:return          
		}

		void calculateCachedStart()
		{
			View view = (View)mViews.get(0);
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field ArrayList mViews>
		//    2    4:iconst_0        
		//    3    5:invokevirtual   #99  <Method Object ArrayList.get(int)>
		//    4    8:checkcast       #101 <Class View>
		//    5   11:astore_1        
			LayoutParams layoutparams = getLayoutParams(view);
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokevirtual   #45  <Method StaggeredGridLayoutManager$LayoutParams getLayoutParams(View)>
		//    9   17:astore_2        
			mCachedStart = mPrimaryOrientation.getDecoratedStart(view);
		//   10   18:aload_0         
		//   11   19:aload_0         
		//   12   20:getfield        #21  <Field StaggeredGridLayoutManager this$0>
		//   13   23:getfield        #70  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//   14   26:aload_1         
		//   15   27:invokevirtual   #133 <Method int OrientationHelper.getDecoratedStart(View)>
		//   16   30:putfield        #32  <Field int mCachedStart>
			if(layoutparams.mFullSpan)
		//*  17   33:aload_2         
		//*  18   34:getfield        #108 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
		//*  19   37:ifeq            84
			{
				LazySpanLookup.FullSpanItem fullspanitem = mLazySpanLookup.getFullSpanItem(layoutparams.getViewLayoutPosition());
		//   20   40:aload_0         
		//   21   41:getfield        #21  <Field StaggeredGridLayoutManager this$0>
		//   22   44:getfield        #112 <Field StaggeredGridLayoutManager$LazySpanLookup StaggeredGridLayoutManager.mLazySpanLookup>
		//   23   47:aload_2         
		//   24   48:invokevirtual   #115 <Method int StaggeredGridLayoutManager$LayoutParams.getViewLayoutPosition()>
		//   25   51:invokevirtual   #121 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem StaggeredGridLayoutManager$LazySpanLookup.getFullSpanItem(int)>
		//   26   54:astore_1        
				if(fullspanitem != null && fullspanitem.mGapDir == -1)
		//*  27   55:aload_1         
		//*  28   56:ifnull          84
		//*  29   59:aload_1         
		//*  30   60:getfield        #126 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapDir>
		//*  31   63:iconst_m1       
		//*  32   64:icmpne          84
					mCachedStart = mCachedStart - fullspanitem.getGapForSpan(mIndex);
		//   33   67:aload_0         
		//   34   68:aload_0         
		//   35   69:getfield        #32  <Field int mCachedStart>
		//   36   72:aload_1         
		//   37   73:aload_0         
		//   38   74:getfield        #38  <Field int mIndex>
		//   39   77:invokevirtual   #129 <Method int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.getGapForSpan(int)>
		//   40   80:isub            
		//   41   81:putfield        #32  <Field int mCachedStart>
			}
		//   42   84:return          
		}

		void clear()
		{
			mViews.clear();
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field ArrayList mViews>
		//    2    4:invokevirtual   #134 <Method void ArrayList.clear()>
			invalidateCache();
		//    3    7:aload_0         
		//    4    8:invokevirtual   #137 <Method void invalidateCache()>
			mDeletedSize = 0;
		//    5   11:aload_0         
		//    6   12:iconst_0        
		//    7   13:putfield        #36  <Field int mDeletedSize>
		//    8   16:return          
		}

		public int findFirstPartiallyVisibleItemPosition()
		{
			if(mReverseLayout)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field StaggeredGridLayoutManager this$0>
		//*   2    4:getfield        #141 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
		//*   3    7:ifeq            26
				return findOnePartiallyVisibleChild(mViews.size() - 1, -1, true);
		//    4   10:aload_0         
		//    5   11:aload_0         
		//    6   12:getfield        #29  <Field ArrayList mViews>
		//    7   15:invokevirtual   #59  <Method int ArrayList.size()>
		//    8   18:iconst_1        
		//    9   19:isub            
		//   10   20:iconst_m1       
		//   11   21:iconst_1        
		//   12   22:invokevirtual   #145 <Method int findOnePartiallyVisibleChild(int, int, boolean)>
		//   13   25:ireturn         
			else
				return findOnePartiallyVisibleChild(0, mViews.size(), true);
		//   14   26:aload_0         
		//   15   27:iconst_0        
		//   16   28:aload_0         
		//   17   29:getfield        #29  <Field ArrayList mViews>
		//   18   32:invokevirtual   #59  <Method int ArrayList.size()>
		//   19   35:iconst_1        
		//   20   36:invokevirtual   #145 <Method int findOnePartiallyVisibleChild(int, int, boolean)>
		//   21   39:ireturn         
		}

		public int findLastPartiallyVisibleItemPosition()
		{
			if(mReverseLayout)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field StaggeredGridLayoutManager this$0>
		//*   2    4:getfield        #141 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
		//*   3    7:ifeq            24
				return findOnePartiallyVisibleChild(0, mViews.size(), true);
		//    4   10:aload_0         
		//    5   11:iconst_0        
		//    6   12:aload_0         
		//    7   13:getfield        #29  <Field ArrayList mViews>
		//    8   16:invokevirtual   #59  <Method int ArrayList.size()>
		//    9   19:iconst_1        
		//   10   20:invokevirtual   #145 <Method int findOnePartiallyVisibleChild(int, int, boolean)>
		//   11   23:ireturn         
			else
				return findOnePartiallyVisibleChild(mViews.size() - 1, -1, true);
		//   12   24:aload_0         
		//   13   25:aload_0         
		//   14   26:getfield        #29  <Field ArrayList mViews>
		//   15   29:invokevirtual   #59  <Method int ArrayList.size()>
		//   16   32:iconst_1        
		//   17   33:isub            
		//   18   34:iconst_m1       
		//   19   35:iconst_1        
		//   20   36:invokevirtual   #145 <Method int findOnePartiallyVisibleChild(int, int, boolean)>
		//   21   39:ireturn         
		}

		int findOnePartiallyOrCompletelyVisibleChild(int i, int j, boolean flag, boolean flag1, boolean flag2)
		{
			int k = mPrimaryOrientation.getStartAfterPadding();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field StaggeredGridLayoutManager this$0>
		//    2    4:getfield        #70  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//    3    7:invokevirtual   #94  <Method int OrientationHelper.getStartAfterPadding()>
		//    4   10:istore          9
			int l = mPrimaryOrientation.getEndAfterPadding();
		//    5   12:aload_0         
		//    6   13:getfield        #21  <Field StaggeredGridLayoutManager this$0>
		//    7   16:getfield        #70  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//    8   19:invokevirtual   #91  <Method int OrientationHelper.getEndAfterPadding()>
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
		//   22   44:getfield        #29  <Field ArrayList mViews>
		//   23   47:iload_1         
		//   24   48:invokevirtual   #99  <Method Object ArrayList.get(int)>
		//   25   51:checkcast       #101 <Class View>
		//   26   54:astore          13
				int i1 = mPrimaryOrientation.getDecoratedStart(view);
		//   27   56:aload_0         
		//   28   57:getfield        #21  <Field StaggeredGridLayoutManager this$0>
		//   29   60:getfield        #70  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//   30   63:aload           13
		//   31   65:invokevirtual   #133 <Method int OrientationHelper.getDecoratedStart(View)>
		//   32   68:istore          11
				int j1 = mPrimaryOrientation.getDecoratedEnd(view);
		//   33   70:aload_0         
		//   34   71:getfield        #21  <Field StaggeredGridLayoutManager this$0>
		//   35   74:getfield        #70  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//   36   77:aload           13
		//   37   79:invokevirtual   #104 <Method int OrientationHelper.getDecoratedEnd(View)>
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
		//   81  177:getfield        #21  <Field StaggeredGridLayoutManager this$0>
		//   82  180:aload           13
		//   83  182:invokevirtual   #151 <Method int StaggeredGridLayoutManager.getPosition(View)>
		//   84  185:ireturn         
					continue;
				}
				if(flag1)
		//*  85  186:iload           4
		//*  86  188:ifeq            201
					return getPosition(view);
		//   87  191:aload_0         
		//   88  192:getfield        #21  <Field StaggeredGridLayoutManager this$0>
		//   89  195:aload           13
		//   90  197:invokevirtual   #151 <Method int StaggeredGridLayoutManager.getPosition(View)>
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
		//   99  216:getfield        #21  <Field StaggeredGridLayoutManager this$0>
		//  100  219:aload           13
		//  101  221:invokevirtual   #151 <Method int StaggeredGridLayoutManager.getPosition(View)>
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
		//    6    6:invokevirtual   #153 <Method int findOnePartiallyOrCompletelyVisibleChild(int, int, boolean, boolean, boolean)>
		//    7    9:ireturn         
		}

		public int getDeletedSize()
		{
			return mDeletedSize;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field int mDeletedSize>
		//    2    4:ireturn         
		}

		int getEndLine()
		{
			int i = mCachedEnd;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field int mCachedEnd>
		//    2    4:istore_1        
			if(i != 0x80000000)
		//*   3    5:iload_1         
		//*   4    6:ldc1            #30  <Int 0x80000000>
		//*   5    8:icmpeq          13
			{
				return i;
		//    6   11:iload_1         
		//    7   12:ireturn         
			} else
			{
				calculateCachedEnd();
		//    8   13:aload_0         
		//    9   14:invokevirtual   #156 <Method void calculateCachedEnd()>
				return mCachedEnd;
		//   10   17:aload_0         
		//   11   18:getfield        #34  <Field int mCachedEnd>
		//   12   21:ireturn         
			}
		}

		int getEndLine(int i)
		{
			int j = mCachedEnd;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field int mCachedEnd>
		//    2    4:istore_2        
			if(j != 0x80000000)
		//*   3    5:iload_2         
		//*   4    6:ldc1            #30  <Int 0x80000000>
		//*   5    8:icmpeq          13
				return j;
		//    6   11:iload_2         
		//    7   12:ireturn         
			if(mViews.size() == 0)
		//*   8   13:aload_0         
		//*   9   14:getfield        #29  <Field ArrayList mViews>
		//*  10   17:invokevirtual   #59  <Method int ArrayList.size()>
		//*  11   20:ifne            25
			{
				return i;
		//   12   23:iload_1         
		//   13   24:ireturn         
			} else
			{
				calculateCachedEnd();
		//   14   25:aload_0         
		//   15   26:invokevirtual   #156 <Method void calculateCachedEnd()>
				return mCachedEnd;
		//   16   29:aload_0         
		//   17   30:getfield        #34  <Field int mCachedEnd>
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
		//    8   12:getfield        #29  <Field ArrayList mViews>
		//    9   15:invokevirtual   #59  <Method int ArrayList.size()>
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
		//   19   31:getfield        #29  <Field ArrayList mViews>
		//   20   34:iload_2         
		//   21   35:invokevirtual   #99  <Method Object ArrayList.get(int)>
		//   22   38:checkcast       #101 <Class View>
		//   23   41:astore          6
					if(mReverseLayout)
		//*  24   43:aload_0         
		//*  25   44:getfield        #21  <Field StaggeredGridLayoutManager this$0>
		//*  26   47:getfield        #141 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
		//*  27   50:ifeq            70
					{
						view2 = view;
		//   28   53:aload           4
		//   29   55:astore          5
						if(getPosition(view3) <= i)
							break;
		//   30   57:aload_0         
		//   31   58:getfield        #21  <Field StaggeredGridLayoutManager this$0>
		//   32   61:aload           6
		//   33   63:invokevirtual   #151 <Method int StaggeredGridLayoutManager.getPosition(View)>
		//   34   66:iload_1         
		//   35   67:icmple          230
					}
					if(!mReverseLayout && getPosition(view3) >= i)
		//*  36   70:aload_0         
		//*  37   71:getfield        #21  <Field StaggeredGridLayoutManager this$0>
		//*  38   74:getfield        #141 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
		//*  39   77:ifne            96
		//*  40   80:aload_0         
		//*  41   81:getfield        #21  <Field StaggeredGridLayoutManager this$0>
		//*  42   84:aload           6
		//*  43   86:invokevirtual   #151 <Method int StaggeredGridLayoutManager.getPosition(View)>
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
		//   51  102:invokevirtual   #161 <Method boolean View.hasFocusable()>
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
		//   61  120:getfield        #29  <Field ArrayList mViews>
		//   62  123:invokevirtual   #59  <Method int ArrayList.size()>
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
		//   73  142:getfield        #29  <Field ArrayList mViews>
		//   74  145:iload_2         
		//   75  146:invokevirtual   #99  <Method Object ArrayList.get(int)>
		//   76  149:checkcast       #101 <Class View>
		//   77  152:astore          6
					if(mReverseLayout)
		//*  78  154:aload_0         
		//*  79  155:getfield        #21  <Field StaggeredGridLayoutManager this$0>
		//*  80  158:getfield        #141 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
		//*  81  161:ifeq            181
					{
						view2 = view1;
		//   82  164:aload           4
		//   83  166:astore          5
						if(getPosition(view4) >= i)
							break;
		//   84  168:aload_0         
		//   85  169:getfield        #21  <Field StaggeredGridLayoutManager this$0>
		//   86  172:aload           6
		//   87  174:invokevirtual   #151 <Method int StaggeredGridLayoutManager.getPosition(View)>
		//   88  177:iload_1         
		//   89  178:icmpge          230
					}
					if(!mReverseLayout && getPosition(view4) <= i)
		//*  90  181:aload_0         
		//*  91  182:getfield        #21  <Field StaggeredGridLayoutManager this$0>
		//*  92  185:getfield        #141 <Field boolean StaggeredGridLayoutManager.mReverseLayout>
		//*  93  188:ifne            207
		//*  94  191:aload_0         
		//*  95  192:getfield        #21  <Field StaggeredGridLayoutManager this$0>
		//*  96  195:aload           6
		//*  97  197:invokevirtual   #151 <Method int StaggeredGridLayoutManager.getPosition(View)>
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
		//  105  213:invokevirtual   #161 <Method boolean View.hasFocusable()>
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
		//    1    1:invokevirtual   #164 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #47  <Class StaggeredGridLayoutManager$LayoutParams>
		//    3    7:areturn         
		}

		int getStartLine()
		{
			int i = mCachedStart;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field int mCachedStart>
		//    2    4:istore_1        
			if(i != 0x80000000)
		//*   3    5:iload_1         
		//*   4    6:ldc1            #30  <Int 0x80000000>
		//*   5    8:icmpeq          13
			{
				return i;
		//    6   11:iload_1         
		//    7   12:ireturn         
			} else
			{
				calculateCachedStart();
		//    8   13:aload_0         
		//    9   14:invokevirtual   #166 <Method void calculateCachedStart()>
				return mCachedStart;
		//   10   17:aload_0         
		//   11   18:getfield        #32  <Field int mCachedStart>
		//   12   21:ireturn         
			}
		}

		int getStartLine(int i)
		{
			int j = mCachedStart;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field int mCachedStart>
		//    2    4:istore_2        
			if(j != 0x80000000)
		//*   3    5:iload_2         
		//*   4    6:ldc1            #30  <Int 0x80000000>
		//*   5    8:icmpeq          13
				return j;
		//    6   11:iload_2         
		//    7   12:ireturn         
			if(mViews.size() == 0)
		//*   8   13:aload_0         
		//*   9   14:getfield        #29  <Field ArrayList mViews>
		//*  10   17:invokevirtual   #59  <Method int ArrayList.size()>
		//*  11   20:ifne            25
			{
				return i;
		//   12   23:iload_1         
		//   13   24:ireturn         
			} else
			{
				calculateCachedStart();
		//   14   25:aload_0         
		//   15   26:invokevirtual   #166 <Method void calculateCachedStart()>
				return mCachedStart;
		//   16   29:aload_0         
		//   17   30:getfield        #32  <Field int mCachedStart>
		//   18   33:ireturn         
			}
		}

		void invalidateCache()
		{
			mCachedStart = 0x80000000;
		//    0    0:aload_0         
		//    1    1:ldc1            #30  <Int 0x80000000>
		//    2    3:putfield        #32  <Field int mCachedStart>
			mCachedEnd = 0x80000000;
		//    3    6:aload_0         
		//    4    7:ldc1            #30  <Int 0x80000000>
		//    5    9:putfield        #34  <Field int mCachedEnd>
		//    6   12:return          
		}

		void onOffset(int i)
		{
			int j = mCachedStart;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field int mCachedStart>
		//    2    4:istore_2        
			if(j != 0x80000000)
		//*   3    5:iload_2         
		//*   4    6:ldc1            #30  <Int 0x80000000>
		//*   5    8:icmpeq          18
				mCachedStart = j + i;
		//    6   11:aload_0         
		//    7   12:iload_2         
		//    8   13:iload_1         
		//    9   14:iadd            
		//   10   15:putfield        #32  <Field int mCachedStart>
			j = mCachedEnd;
		//   11   18:aload_0         
		//   12   19:getfield        #34  <Field int mCachedEnd>
		//   13   22:istore_2        
			if(j != 0x80000000)
		//*  14   23:iload_2         
		//*  15   24:ldc1            #30  <Int 0x80000000>
		//*  16   26:icmpeq          36
				mCachedEnd = j + i;
		//   17   29:aload_0         
		//   18   30:iload_2         
		//   19   31:iload_1         
		//   20   32:iadd            
		//   21   33:putfield        #34  <Field int mCachedEnd>
		//   22   36:return          
		}

		void popEnd()
		{
			int i = mViews.size();
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field ArrayList mViews>
		//    2    4:invokevirtual   #59  <Method int ArrayList.size()>
		//    3    7:istore_1        
			View view = (View)mViews.remove(i - 1);
		//    4    8:aload_0         
		//    5    9:getfield        #29  <Field ArrayList mViews>
		//    6   12:iload_1         
		//    7   13:iconst_1        
		//    8   14:isub            
		//    9   15:invokevirtual   #172 <Method Object ArrayList.remove(int)>
		//   10   18:checkcast       #101 <Class View>
		//   11   21:astore_2        
			LayoutParams layoutparams = getLayoutParams(view);
		//   12   22:aload_0         
		//   13   23:aload_2         
		//   14   24:invokevirtual   #45  <Method StaggeredGridLayoutManager$LayoutParams getLayoutParams(View)>
		//   15   27:astore_3        
			layoutparams.mSpan = null;
		//   16   28:aload_3         
		//   17   29:aconst_null     
		//   18   30:putfield        #51  <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
			if(layoutparams.isItemRemoved() || layoutparams.isItemChanged())
		//*  19   33:aload_3         
		//*  20   34:invokevirtual   #63  <Method boolean StaggeredGridLayoutManager$LayoutParams.isItemRemoved()>
		//*  21   37:ifne            47
		//*  22   40:aload_3         
		//*  23   41:invokevirtual   #66  <Method boolean StaggeredGridLayoutManager$LayoutParams.isItemChanged()>
		//*  24   44:ifeq            67
				mDeletedSize = mDeletedSize - mPrimaryOrientation.getDecoratedMeasurement(view);
		//   25   47:aload_0         
		//   26   48:aload_0         
		//   27   49:getfield        #36  <Field int mDeletedSize>
		//   28   52:aload_0         
		//   29   53:getfield        #21  <Field StaggeredGridLayoutManager this$0>
		//   30   56:getfield        #70  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//   31   59:aload_2         
		//   32   60:invokevirtual   #76  <Method int OrientationHelper.getDecoratedMeasurement(View)>
		//   33   63:isub            
		//   34   64:putfield        #36  <Field int mDeletedSize>
			if(i == 1)
		//*  35   67:iload_1         
		//*  36   68:iconst_1        
		//*  37   69:icmpne          78
				mCachedStart = 0x80000000;
		//   38   72:aload_0         
		//   39   73:ldc1            #30  <Int 0x80000000>
		//   40   75:putfield        #32  <Field int mCachedStart>
			mCachedEnd = 0x80000000;
		//   41   78:aload_0         
		//   42   79:ldc1            #30  <Int 0x80000000>
		//   43   81:putfield        #34  <Field int mCachedEnd>
		//   44   84:return          
		}

		void popStart()
		{
			View view = (View)mViews.remove(0);
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field ArrayList mViews>
		//    2    4:iconst_0        
		//    3    5:invokevirtual   #172 <Method Object ArrayList.remove(int)>
		//    4    8:checkcast       #101 <Class View>
		//    5   11:astore_1        
			LayoutParams layoutparams = getLayoutParams(view);
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokevirtual   #45  <Method StaggeredGridLayoutManager$LayoutParams getLayoutParams(View)>
		//    9   17:astore_2        
			layoutparams.mSpan = null;
		//   10   18:aload_2         
		//   11   19:aconst_null     
		//   12   20:putfield        #51  <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
			if(mViews.size() == 0)
		//*  13   23:aload_0         
		//*  14   24:getfield        #29  <Field ArrayList mViews>
		//*  15   27:invokevirtual   #59  <Method int ArrayList.size()>
		//*  16   30:ifne            39
				mCachedEnd = 0x80000000;
		//   17   33:aload_0         
		//   18   34:ldc1            #30  <Int 0x80000000>
		//   19   36:putfield        #34  <Field int mCachedEnd>
			if(layoutparams.isItemRemoved() || layoutparams.isItemChanged())
		//*  20   39:aload_2         
		//*  21   40:invokevirtual   #63  <Method boolean StaggeredGridLayoutManager$LayoutParams.isItemRemoved()>
		//*  22   43:ifne            53
		//*  23   46:aload_2         
		//*  24   47:invokevirtual   #66  <Method boolean StaggeredGridLayoutManager$LayoutParams.isItemChanged()>
		//*  25   50:ifeq            73
				mDeletedSize = mDeletedSize - mPrimaryOrientation.getDecoratedMeasurement(view);
		//   26   53:aload_0         
		//   27   54:aload_0         
		//   28   55:getfield        #36  <Field int mDeletedSize>
		//   29   58:aload_0         
		//   30   59:getfield        #21  <Field StaggeredGridLayoutManager this$0>
		//   31   62:getfield        #70  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//   32   65:aload_1         
		//   33   66:invokevirtual   #76  <Method int OrientationHelper.getDecoratedMeasurement(View)>
		//   34   69:isub            
		//   35   70:putfield        #36  <Field int mDeletedSize>
			mCachedStart = 0x80000000;
		//   36   73:aload_0         
		//   37   74:ldc1            #30  <Int 0x80000000>
		//   38   76:putfield        #32  <Field int mCachedStart>
		//   39   79:return          
		}

		void prependToSpan(View view)
		{
			LayoutParams layoutparams = getLayoutParams(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #45  <Method StaggeredGridLayoutManager$LayoutParams getLayoutParams(View)>
		//    3    5:astore_2        
			layoutparams.mSpan = this;
		//    4    6:aload_2         
		//    5    7:aload_0         
		//    6    8:putfield        #51  <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
			mViews.add(0, ((Object) (view)));
		//    7   11:aload_0         
		//    8   12:getfield        #29  <Field ArrayList mViews>
		//    9   15:iconst_0        
		//   10   16:aload_1         
		//   11   17:invokevirtual   #177 <Method void ArrayList.add(int, Object)>
			mCachedStart = 0x80000000;
		//   12   20:aload_0         
		//   13   21:ldc1            #30  <Int 0x80000000>
		//   14   23:putfield        #32  <Field int mCachedStart>
			if(mViews.size() == 1)
		//*  15   26:aload_0         
		//*  16   27:getfield        #29  <Field ArrayList mViews>
		//*  17   30:invokevirtual   #59  <Method int ArrayList.size()>
		//*  18   33:iconst_1        
		//*  19   34:icmpne          43
				mCachedEnd = 0x80000000;
		//   20   37:aload_0         
		//   21   38:ldc1            #30  <Int 0x80000000>
		//   22   40:putfield        #34  <Field int mCachedEnd>
			if(layoutparams.isItemRemoved() || layoutparams.isItemChanged())
		//*  23   43:aload_2         
		//*  24   44:invokevirtual   #63  <Method boolean StaggeredGridLayoutManager$LayoutParams.isItemRemoved()>
		//*  25   47:ifne            57
		//*  26   50:aload_2         
		//*  27   51:invokevirtual   #66  <Method boolean StaggeredGridLayoutManager$LayoutParams.isItemChanged()>
		//*  28   54:ifeq            77
				mDeletedSize = mDeletedSize + mPrimaryOrientation.getDecoratedMeasurement(view);
		//   29   57:aload_0         
		//   30   58:aload_0         
		//   31   59:getfield        #36  <Field int mDeletedSize>
		//   32   62:aload_0         
		//   33   63:getfield        #21  <Field StaggeredGridLayoutManager this$0>
		//   34   66:getfield        #70  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
		//   35   69:aload_1         
		//   36   70:invokevirtual   #76  <Method int OrientationHelper.getDecoratedMeasurement(View)>
		//   37   73:iadd            
		//   38   74:putfield        #36  <Field int mDeletedSize>
		//   39   77:return          
		}

		void setLine(int i)
		{
			mCachedStart = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #32  <Field int mCachedStart>
			mCachedEnd = i;
		//    3    5:aload_0         
		//    4    6:iload_1         
		//    5    7:putfield        #34  <Field int mCachedEnd>
		//    6   10:return          
		}

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
		//    2    2:putfield        #21  <Field StaggeredGridLayoutManager this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void Object()>
			mViews = new ArrayList();
		//    5    9:aload_0         
		//    6   10:new             #26  <Class ArrayList>
		//    7   13:dup             
		//    8   14:invokespecial   #27  <Method void ArrayList()>
		//    9   17:putfield        #29  <Field ArrayList mViews>
			mCachedStart = 0x80000000;
		//   10   20:aload_0         
		//   11   21:ldc1            #30  <Int 0x80000000>
		//   12   23:putfield        #32  <Field int mCachedStart>
			mCachedEnd = 0x80000000;
		//   13   26:aload_0         
		//   14   27:ldc1            #30  <Int 0x80000000>
		//   15   29:putfield        #34  <Field int mCachedEnd>
			mDeletedSize = 0;
		//   16   32:aload_0         
		//   17   33:iconst_0        
		//   18   34:putfield        #36  <Field int mDeletedSize>
			mIndex = i;
		//   19   37:aload_0         
		//   20   38:iload_2         
		//   21   39:putfield        #38  <Field int mIndex>
		//   22   42:return          
		}
	}


	public StaggeredGridLayoutManager(Context context, AttributeSet attributeset, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void RecyclerView$LayoutManager()>
		mSpanCount = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #74  <Field int mSpanCount>
		mReverseLayout = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #76  <Field boolean mReverseLayout>
		mShouldReverseLayout = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #78  <Field boolean mShouldReverseLayout>
		mPendingScrollPosition = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #80  <Field int mPendingScrollPosition>
		mPendingScrollPositionOffset = 0x80000000;
	//   14   24:aload_0         
	//   15   25:ldc1            #81  <Int 0x80000000>
	//   16   27:putfield        #83  <Field int mPendingScrollPositionOffset>
		mLazySpanLookup = new LazySpanLookup();
	//   17   30:aload_0         
	//   18   31:new             #16  <Class StaggeredGridLayoutManager$LazySpanLookup>
	//   19   34:dup             
	//   20   35:invokespecial   #84  <Method void StaggeredGridLayoutManager$LazySpanLookup()>
	//   21   38:putfield        #86  <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
		mGapStrategy = 2;
	//   22   41:aload_0         
	//   23   42:iconst_2        
	//   24   43:putfield        #88  <Field int mGapStrategy>
	//   25   46:aload_0         
	//   26   47:new             #90  <Class Rect>
	//   27   50:dup             
	//   28   51:invokespecial   #91  <Method void Rect()>
	//   29   54:putfield        #93  <Field Rect mTmpRect>
	//   30   57:aload_0         
	//   31   58:new             #10  <Class StaggeredGridLayoutManager$AnchorInfo>
	//   32   61:dup             
	//   33   62:aload_0         
	//   34   63:invokespecial   #96  <Method void StaggeredGridLayoutManager$AnchorInfo(StaggeredGridLayoutManager)>
	//   35   66:putfield        #98  <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
		mLaidOutInvalidFullSpan = false;
	//   36   69:aload_0         
	//   37   70:iconst_0        
	//   38   71:putfield        #100 <Field boolean mLaidOutInvalidFullSpan>
		mSmoothScrollbarEnabled = true;
	//   39   74:aload_0         
	//   40   75:iconst_1        
	//   41   76:putfield        #102 <Field boolean mSmoothScrollbarEnabled>
	//   42   79:aload_0         
	//   43   80:new             #8   <Class StaggeredGridLayoutManager$1>
	//   44   83:dup             
	//   45   84:aload_0         
	//   46   85:invokespecial   #103 <Method void StaggeredGridLayoutManager$1(StaggeredGridLayoutManager)>
	//   47   88:putfield        #105 <Field Runnable mCheckForGapsRunnable>
		context = ((Context) (getProperties(context, attributeset, i, j)));
	//   48   91:aload_1         
	//   49   92:aload_2         
	//   50   93:iload_3         
	//   51   94:iload           4
	//   52   96:invokestatic    #109 <Method RecyclerView$LayoutManager$Properties getProperties(Context, AttributeSet, int, int)>
	//   53   99:astore_1        
		setOrientation(((RecyclerView.LayoutManager.Properties) (context)).orientation);
	//   54  100:aload_0         
	//   55  101:aload_1         
	//   56  102:getfield        #114 <Field int RecyclerView$LayoutManager$Properties.orientation>
	//   57  105:invokevirtual   #118 <Method void setOrientation(int)>
		setSpanCount(((RecyclerView.LayoutManager.Properties) (context)).spanCount);
	//   58  108:aload_0         
	//   59  109:aload_1         
	//   60  110:getfield        #121 <Field int RecyclerView$LayoutManager$Properties.spanCount>
	//   61  113:invokevirtual   #124 <Method void setSpanCount(int)>
		setReverseLayout(((RecyclerView.LayoutManager.Properties) (context)).reverseLayout);
	//   62  116:aload_0         
	//   63  117:aload_1         
	//   64  118:getfield        #127 <Field boolean RecyclerView$LayoutManager$Properties.reverseLayout>
	//   65  121:invokevirtual   #131 <Method void setReverseLayout(boolean)>
	//   66  124:aload_0         
	//   67  125:new             #133 <Class LayoutState>
	//   68  128:dup             
	//   69  129:invokespecial   #134 <Method void LayoutState()>
	//   70  132:putfield        #136 <Field LayoutState mLayoutState>
		createOrientationHelpers();
	//   71  135:aload_0         
	//   72  136:invokespecial   #139 <Method void createOrientationHelpers()>
	//   73  139:return          
	}

	private void appendViewToAllSpans(View view)
	{
		for(int i = mSpanCount - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field int mSpanCount>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iflt            28
			mSpans[i].appendToSpan(view);
	//    7   11:aload_0         
	//    8   12:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//    9   15:iload_2         
	//   10   16:aaload          
	//   11   17:aload_1         
	//   12   18:invokevirtual   #147 <Method void StaggeredGridLayoutManager$Span.appendToSpan(View)>

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
	//*   1    1:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*   2    4:getfield        #154 <Field int StaggeredGridLayoutManager$SavedState.mSpanOffsetsSize>
	//*   3    7:ifle            139
			if(mPendingSavedState.mSpanOffsetsSize == mSpanCount)
	//*   4   10:aload_0         
	//*   5   11:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*   6   14:getfield        #154 <Field int StaggeredGridLayoutManager$SavedState.mSpanOffsetsSize>
	//*   7   17:aload_0         
	//*   8   18:getfield        #74  <Field int mSpanCount>
	//*   9   21:icmpne          116
			{
				for(int j = 0; j < mSpanCount; j++)
	//*  10   24:iconst_0        
	//*  11   25:istore_3        
	//*  12   26:iload_3         
	//*  13   27:aload_0         
	//*  14   28:getfield        #74  <Field int mSpanCount>
	//*  15   31:icmpge          139
				{
					mSpans[j].clear();
	//   16   34:aload_0         
	//   17   35:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   18   38:iload_3         
	//   19   39:aaload          
	//   20   40:invokevirtual   #157 <Method void StaggeredGridLayoutManager$Span.clear()>
					int k = mPendingSavedState.mSpanOffsets[j];
	//   21   43:aload_0         
	//   22   44:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   23   47:getfield        #160 <Field int[] StaggeredGridLayoutManager$SavedState.mSpanOffsets>
	//   24   50:iload_3         
	//   25   51:iaload          
	//   26   52:istore          4
					int i = k;
	//   27   54:iload           4
	//   28   56:istore_2        
					if(k != 0x80000000)
	//*  29   57:iload           4
	//*  30   59:ldc1            #81  <Int 0x80000000>
	//*  31   61:icmpeq          99
						if(mPendingSavedState.mAnchorLayoutFromEnd)
	//*  32   64:aload_0         
	//*  33   65:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  34   68:getfield        #163 <Field boolean StaggeredGridLayoutManager$SavedState.mAnchorLayoutFromEnd>
	//*  35   71:ifeq            88
							i = k + mPrimaryOrientation.getEndAfterPadding();
	//   36   74:iload           4
	//   37   76:aload_0         
	//   38   77:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//   39   80:invokevirtual   #171 <Method int OrientationHelper.getEndAfterPadding()>
	//   40   83:iadd            
	//   41   84:istore_2        
						else
	//*  42   85:goto            99
							i = k + mPrimaryOrientation.getStartAfterPadding();
	//   43   88:iload           4
	//   44   90:aload_0         
	//   45   91:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//   46   94:invokevirtual   #174 <Method int OrientationHelper.getStartAfterPadding()>
	//   47   97:iadd            
	//   48   98:istore_2        
					mSpans[j].setLine(i);
	//   49   99:aload_0         
	//   50  100:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   51  103:iload_3         
	//   52  104:aaload          
	//   53  105:iload_2         
	//   54  106:invokevirtual   #177 <Method void StaggeredGridLayoutManager$Span.setLine(int)>
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
	//   61  117:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   62  120:invokevirtual   #180 <Method void StaggeredGridLayoutManager$SavedState.invalidateSpanInfo()>
				SavedState savedstate = mPendingSavedState;
	//   63  123:aload_0         
	//   64  124:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   65  127:astore          5
				savedstate.mAnchorPosition = savedstate.mVisibleAnchorPosition;
	//   66  129:aload           5
	//   67  131:aload           5
	//   68  133:getfield        #183 <Field int StaggeredGridLayoutManager$SavedState.mVisibleAnchorPosition>
	//   69  136:putfield        #186 <Field int StaggeredGridLayoutManager$SavedState.mAnchorPosition>
			}
		mLastLayoutRTL = mPendingSavedState.mLastLayoutRTL;
	//   70  139:aload_0         
	//   71  140:aload_0         
	//   72  141:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   73  144:getfield        #188 <Field boolean StaggeredGridLayoutManager$SavedState.mLastLayoutRTL>
	//   74  147:putfield        #189 <Field boolean mLastLayoutRTL>
		setReverseLayout(mPendingSavedState.mReverseLayout);
	//   75  150:aload_0         
	//   76  151:aload_0         
	//   77  152:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   78  155:getfield        #190 <Field boolean StaggeredGridLayoutManager$SavedState.mReverseLayout>
	//   79  158:invokevirtual   #131 <Method void setReverseLayout(boolean)>
		resolveShouldLayoutReverse();
	//   80  161:aload_0         
	//   81  162:invokespecial   #193 <Method void resolveShouldLayoutReverse()>
		if(mPendingSavedState.mAnchorPosition != -1)
	//*  82  165:aload_0         
	//*  83  166:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  84  169:getfield        #186 <Field int StaggeredGridLayoutManager$SavedState.mAnchorPosition>
	//*  85  172:iconst_m1       
	//*  86  173:icmpeq          201
		{
			mPendingScrollPosition = mPendingSavedState.mAnchorPosition;
	//   87  176:aload_0         
	//   88  177:aload_0         
	//   89  178:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   90  181:getfield        #186 <Field int StaggeredGridLayoutManager$SavedState.mAnchorPosition>
	//   91  184:putfield        #80  <Field int mPendingScrollPosition>
			anchorinfo.mLayoutFromEnd = mPendingSavedState.mAnchorLayoutFromEnd;
	//   92  187:aload_1         
	//   93  188:aload_0         
	//   94  189:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   95  192:getfield        #163 <Field boolean StaggeredGridLayoutManager$SavedState.mAnchorLayoutFromEnd>
	//   96  195:putfield        #196 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
		} else
	//*  97  198:goto            209
		{
			anchorinfo.mLayoutFromEnd = mShouldReverseLayout;
	//   98  201:aload_1         
	//   99  202:aload_0         
	//  100  203:getfield        #78  <Field boolean mShouldReverseLayout>
	//  101  206:putfield        #196 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
		}
		if(mPendingSavedState.mSpanLookupSize > 1)
	//* 102  209:aload_0         
	//* 103  210:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//* 104  213:getfield        #199 <Field int StaggeredGridLayoutManager$SavedState.mSpanLookupSize>
	//* 105  216:iconst_1        
	//* 106  217:icmple          248
		{
			mLazySpanLookup.mData = mPendingSavedState.mSpanLookup;
	//  107  220:aload_0         
	//  108  221:getfield        #86  <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//  109  224:aload_0         
	//  110  225:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//  111  228:getfield        #202 <Field int[] StaggeredGridLayoutManager$SavedState.mSpanLookup>
	//  112  231:putfield        #205 <Field int[] StaggeredGridLayoutManager$LazySpanLookup.mData>
			mLazySpanLookup.mFullSpanItems = mPendingSavedState.mFullSpanItems;
	//  113  234:aload_0         
	//  114  235:getfield        #86  <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//  115  238:aload_0         
	//  116  239:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//  117  242:getfield        #209 <Field List StaggeredGridLayoutManager$SavedState.mFullSpanItems>
	//  118  245:putfield        #210 <Field List StaggeredGridLayoutManager$LazySpanLookup.mFullSpanItems>
		}
	//  119  248:return          
	}

	private void attachViewToSpans(View view, LayoutParams layoutparams, LayoutState layoutstate)
	{
		if(layoutstate.mLayoutDirection == 1)
	//*   0    0:aload_3         
	//*   1    1:getfield        #215 <Field int LayoutState.mLayoutDirection>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          30
			if(layoutparams.mFullSpan)
	//*   4    8:aload_2         
	//*   5    9:getfield        #218 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*   6   12:ifeq            21
			{
				appendViewToAllSpans(view);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #220 <Method void appendViewToAllSpans(View)>
				return;
	//   10   20:return          
			} else
			{
				layoutparams.mSpan.appendToSpan(view);
	//   11   21:aload_2         
	//   12   22:getfield        #224 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #147 <Method void StaggeredGridLayoutManager$Span.appendToSpan(View)>
				return;
	//   15   29:return          
			}
		if(layoutparams.mFullSpan)
	//*  16   30:aload_2         
	//*  17   31:getfield        #218 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*  18   34:ifeq            43
		{
			prependViewToAllSpans(view);
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:invokespecial   #227 <Method void prependViewToAllSpans(View)>
			return;
	//   22   42:return          
		} else
		{
			layoutparams.mSpan.prependToSpan(view);
	//   23   43:aload_2         
	//   24   44:getfield        #224 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//   25   47:aload_1         
	//   26   48:invokevirtual   #230 <Method void StaggeredGridLayoutManager$Span.prependToSpan(View)>
			return;
	//   27   51:return          
		}
	}

	private int calculateScrollDirectionForPosition(int i)
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #235 <Method int getChildCount()>
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
	//*  10   14:getfield        #78  <Field boolean mShouldReverseLayout>
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
	//*  18   26:invokevirtual   #238 <Method int getFirstChildPosition()>
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
	//   27   44:getfield        #78  <Field boolean mShouldReverseLayout>
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
	//*   1    1:getfield        #78  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            50
		{
			if(span.getEndLine() < mPrimaryOrientation.getEndAfterPadding())
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #243 <Method int StaggeredGridLayoutManager$Span.getEndLine()>
	//*   5   11:aload_0         
	//*   6   12:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//*   7   15:invokevirtual   #171 <Method int OrientationHelper.getEndAfterPadding()>
	//*   8   18:icmpge          85
				return span.getLayoutParams((View)span.mViews.get(span.mViews.size() - 1)).mFullSpan ^ true;
	//    9   21:aload_1         
	//   10   22:aload_1         
	//   11   23:getfield        #247 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//   12   26:aload_1         
	//   13   27:getfield        #247 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//   14   30:invokevirtual   #252 <Method int ArrayList.size()>
	//   15   33:iconst_1        
	//   16   34:isub            
	//   17   35:invokevirtual   #256 <Method Object ArrayList.get(int)>
	//   18   38:checkcast       #258 <Class View>
	//   19   41:invokevirtual   #262 <Method StaggeredGridLayoutManager$LayoutParams StaggeredGridLayoutManager$Span.getLayoutParams(View)>
	//   20   44:getfield        #218 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//   21   47:iconst_1        
	//   22   48:ixor            
	//   23   49:ireturn         
		} else
		if(span.getStartLine() > mPrimaryOrientation.getStartAfterPadding())
	//*  24   50:aload_1         
	//*  25   51:invokevirtual   #265 <Method int StaggeredGridLayoutManager$Span.getStartLine()>
	//*  26   54:aload_0         
	//*  27   55:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//*  28   58:invokevirtual   #174 <Method int OrientationHelper.getStartAfterPadding()>
	//*  29   61:icmple          85
			return span.getLayoutParams((View)span.mViews.get(0)).mFullSpan ^ true;
	//   30   64:aload_1         
	//   31   65:aload_1         
	//   32   66:getfield        #247 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//   33   69:iconst_0        
	//   34   70:invokevirtual   #256 <Method Object ArrayList.get(int)>
	//   35   73:checkcast       #258 <Class View>
	//   36   76:invokevirtual   #262 <Method StaggeredGridLayoutManager$LayoutParams StaggeredGridLayoutManager$Span.getLayoutParams(View)>
	//   37   79:getfield        #218 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
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
	//*   1    1:invokevirtual   #235 <Method int getChildCount()>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return ScrollbarHelper.computeScrollExtent(state, mPrimaryOrientation, findFirstVisibleItemClosestToStart(mSmoothScrollbarEnabled ^ true), findFirstVisibleItemClosestToEnd(mSmoothScrollbarEnabled ^ true), ((RecyclerView.LayoutManager) (this)), mSmoothScrollbarEnabled);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #102 <Field boolean mSmoothScrollbarEnabled>
	//   11   19:iconst_1        
	//   12   20:ixor            
	//   13   21:invokevirtual   #271 <Method View findFirstVisibleItemClosestToStart(boolean)>
	//   14   24:aload_0         
	//   15   25:aload_0         
	//   16   26:getfield        #102 <Field boolean mSmoothScrollbarEnabled>
	//   17   29:iconst_1        
	//   18   30:ixor            
	//   19   31:invokevirtual   #274 <Method View findFirstVisibleItemClosestToEnd(boolean)>
	//   20   34:aload_0         
	//   21   35:aload_0         
	//   22   36:getfield        #102 <Field boolean mSmoothScrollbarEnabled>
	//   23   39:invokestatic    #279 <Method int ScrollbarHelper.computeScrollExtent(RecyclerView$State, OrientationHelper, View, View, RecyclerView$LayoutManager, boolean)>
	//   24   42:ireturn         
	}

	private int computeScrollOffset(RecyclerView.State state)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #235 <Method int getChildCount()>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return ScrollbarHelper.computeScrollOffset(state, mPrimaryOrientation, findFirstVisibleItemClosestToStart(mSmoothScrollbarEnabled ^ true), findFirstVisibleItemClosestToEnd(mSmoothScrollbarEnabled ^ true), ((RecyclerView.LayoutManager) (this)), mSmoothScrollbarEnabled, mShouldReverseLayout);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #102 <Field boolean mSmoothScrollbarEnabled>
	//   11   19:iconst_1        
	//   12   20:ixor            
	//   13   21:invokevirtual   #271 <Method View findFirstVisibleItemClosestToStart(boolean)>
	//   14   24:aload_0         
	//   15   25:aload_0         
	//   16   26:getfield        #102 <Field boolean mSmoothScrollbarEnabled>
	//   17   29:iconst_1        
	//   18   30:ixor            
	//   19   31:invokevirtual   #274 <Method View findFirstVisibleItemClosestToEnd(boolean)>
	//   20   34:aload_0         
	//   21   35:aload_0         
	//   22   36:getfield        #102 <Field boolean mSmoothScrollbarEnabled>
	//   23   39:aload_0         
	//   24   40:getfield        #78  <Field boolean mShouldReverseLayout>
	//   25   43:invokestatic    #283 <Method int ScrollbarHelper.computeScrollOffset(RecyclerView$State, OrientationHelper, View, View, RecyclerView$LayoutManager, boolean, boolean)>
	//   26   46:ireturn         
	}

	private int computeScrollRange(RecyclerView.State state)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #235 <Method int getChildCount()>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return ScrollbarHelper.computeScrollRange(state, mPrimaryOrientation, findFirstVisibleItemClosestToStart(mSmoothScrollbarEnabled ^ true), findFirstVisibleItemClosestToEnd(mSmoothScrollbarEnabled ^ true), ((RecyclerView.LayoutManager) (this)), mSmoothScrollbarEnabled);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #102 <Field boolean mSmoothScrollbarEnabled>
	//   11   19:iconst_1        
	//   12   20:ixor            
	//   13   21:invokevirtual   #271 <Method View findFirstVisibleItemClosestToStart(boolean)>
	//   14   24:aload_0         
	//   15   25:aload_0         
	//   16   26:getfield        #102 <Field boolean mSmoothScrollbarEnabled>
	//   17   29:iconst_1        
	//   18   30:ixor            
	//   19   31:invokevirtual   #274 <Method View findFirstVisibleItemClosestToEnd(boolean)>
	//   20   34:aload_0         
	//   21   35:aload_0         
	//   22   36:getfield        #102 <Field boolean mSmoothScrollbarEnabled>
	//   23   39:invokestatic    #286 <Method int ScrollbarHelper.computeScrollRange(RecyclerView$State, OrientationHelper, View, View, RecyclerView$LayoutManager, boolean)>
	//   24   42:ireturn         
	}

	private int convertFocusDirectionToLayoutDirection(int i)
	{
		int j = 0x80000000;
	//    0    0:ldc1            #81  <Int 0x80000000>
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
	//   16   52:ldc1            #81  <Int 0x80000000>
	//   17   54:ireturn         

						case 2: // '\002'
							if(mOrientation == 1)
	//*  18   55:aload_0         
	//*  19   56:getfield        #289 <Field int mOrientation>
	//*  20   59:iconst_1        
	//*  21   60:icmpne          65
								return 1;
	//   22   63:iconst_1        
	//   23   64:ireturn         
							return !isLayoutRTL() ? 1 : -1;
	//   24   65:aload_0         
	//   25   66:invokevirtual   #293 <Method boolean isLayoutRTL()>
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
	//*  32   77:getfield        #289 <Field int mOrientation>
	//*  33   80:iconst_1        
	//*  34   81:icmpne          86
							return -1;
	//   35   84:iconst_m1       
	//   36   85:ireturn         
						return !isLayoutRTL() ? -1 : 1;
	//   37   86:aload_0         
	//   38   87:invokevirtual   #293 <Method boolean isLayoutRTL()>
	//   39   90:ifeq            95
	//   40   93:iconst_1        
	//   41   94:ireturn         
	//   42   95:iconst_m1       
	//   43   96:ireturn         
					}
					if(mOrientation == 1)
	//*  44   97:aload_0         
	//*  45   98:getfield        #289 <Field int mOrientation>
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
	//*  53  110:getfield        #289 <Field int mOrientation>
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
	//   60  121:getfield        #289 <Field int mOrientation>
	//   61  124:iconst_1        
	//   62  125:icmpne          130
	//   63  128:iconst_m1       
	//   64  129:ireturn         
	//   65  130:ldc1            #81  <Int 0x80000000>
	//   66  132:ireturn         
		}
		return mOrientation != 0 ? 0x80000000 : -1;
	//   67  133:aload_0         
	//   68  134:getfield        #289 <Field int mOrientation>
	//   69  137:ifne            142
	//   70  140:iconst_m1       
	//   71  141:ireturn         
	//   72  142:ldc1            #81  <Int 0x80000000>
	//   73  144:ireturn         
	}

	private LazySpanLookup.FullSpanItem createFullSpanItemFromEnd(int i)
	{
		LazySpanLookup.FullSpanItem fullspanitem = new LazySpanLookup.FullSpanItem();
	//    0    0:new             #19  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//    1    3:dup             
	//    2    4:invokespecial   #296 <Method void StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem()>
	//    3    7:astore_3        
		fullspanitem.mGapPerSpan = new int[mSpanCount];
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #74  <Field int mSpanCount>
	//    7   13:newarray        int[]
	//    8   15:putfield        #299 <Field int[] StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapPerSpan>
		for(int j = 0; j < mSpanCount; j++)
	//*   9   18:iconst_0        
	//*  10   19:istore_2        
	//*  11   20:iload_2         
	//*  12   21:aload_0         
	//*  13   22:getfield        #74  <Field int mSpanCount>
	//*  14   25:icmpge          53
			fullspanitem.mGapPerSpan[j] = i - mSpans[j].getEndLine(i);
	//   15   28:aload_3         
	//   16   29:getfield        #299 <Field int[] StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapPerSpan>
	//   17   32:iload_2         
	//   18   33:iload_1         
	//   19   34:aload_0         
	//   20   35:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   21   38:iload_2         
	//   22   39:aaload          
	//   23   40:iload_1         
	//   24   41:invokevirtual   #301 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
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
	//    2    4:invokespecial   #296 <Method void StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem()>
	//    3    7:astore_3        
		fullspanitem.mGapPerSpan = new int[mSpanCount];
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #74  <Field int mSpanCount>
	//    7   13:newarray        int[]
	//    8   15:putfield        #299 <Field int[] StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapPerSpan>
		for(int j = 0; j < mSpanCount; j++)
	//*   9   18:iconst_0        
	//*  10   19:istore_2        
	//*  11   20:iload_2         
	//*  12   21:aload_0         
	//*  13   22:getfield        #74  <Field int mSpanCount>
	//*  14   25:icmpge          53
			fullspanitem.mGapPerSpan[j] = mSpans[j].getStartLine(i) - i;
	//   15   28:aload_3         
	//   16   29:getfield        #299 <Field int[] StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapPerSpan>
	//   17   32:iload_2         
	//   18   33:aload_0         
	//   19   34:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   20   37:iload_2         
	//   21   38:aaload          
	//   22   39:iload_1         
	//   23   40:invokevirtual   #304 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
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
	//    3    3:getfield        #289 <Field int mOrientation>
	//    4    6:invokestatic    #308 <Method OrientationHelper OrientationHelper.createOrientationHelper(RecyclerView$LayoutManager, int)>
	//    5    9:putfield        #165 <Field OrientationHelper mPrimaryOrientation>
		mSecondaryOrientation = OrientationHelper.createOrientationHelper(((RecyclerView.LayoutManager) (this)), 1 - mOrientation);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:aload_0         
	//   10   16:getfield        #289 <Field int mOrientation>
	//   11   19:isub            
	//   12   20:invokestatic    #308 <Method OrientationHelper OrientationHelper.createOrientationHelper(RecyclerView$LayoutManager, int)>
	//   13   23:putfield        #310 <Field OrientationHelper mSecondaryOrientation>
	//   14   26:return          
	}

	private int fill(RecyclerView.Recycler recycler, LayoutState layoutstate, RecyclerView.State state)
	{
		mRemainingSpans.set(0, mSpanCount, true);
	//    0    0:aload_0         
	//    1    1:getfield        #314 <Field BitSet mRemainingSpans>
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:getfield        #74  <Field int mSpanCount>
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #320 <Method void BitSet.set(int, int, boolean)>
		int i;
		if(mLayoutState.mInfinite)
	//*   7   13:aload_0         
	//*   8   14:getfield        #136 <Field LayoutState mLayoutState>
	//*   9   17:getfield        #323 <Field boolean LayoutState.mInfinite>
	//*  10   20:ifeq            46
		{
			if(layoutstate.mLayoutDirection == 1)
	//*  11   23:aload_2         
	//*  12   24:getfield        #215 <Field int LayoutState.mLayoutDirection>
	//*  13   27:iconst_1        
	//*  14   28:icmpne          39
				i = 0x7fffffff;
	//   15   31:ldc2            #324 <Int 0x7fffffff>
	//   16   34:istore          4
			else
	//*  17   36:goto            79
				i = 0x80000000;
	//   18   39:ldc1            #81  <Int 0x80000000>
	//   19   41:istore          4
		} else
	//*  20   43:goto            79
		if(layoutstate.mLayoutDirection == 1)
	//*  21   46:aload_2         
	//*  22   47:getfield        #215 <Field int LayoutState.mLayoutDirection>
	//*  23   50:iconst_1        
	//*  24   51:icmpne          68
			i = layoutstate.mEndLine + layoutstate.mAvailable;
	//   25   54:aload_2         
	//   26   55:getfield        #327 <Field int LayoutState.mEndLine>
	//   27   58:aload_2         
	//   28   59:getfield        #330 <Field int LayoutState.mAvailable>
	//   29   62:iadd            
	//   30   63:istore          4
		else
	//*  31   65:goto            79
			i = layoutstate.mStartLine - layoutstate.mAvailable;
	//   32   68:aload_2         
	//   33   69:getfield        #333 <Field int LayoutState.mStartLine>
	//   34   72:aload_2         
	//   35   73:getfield        #330 <Field int LayoutState.mAvailable>
	//   36   76:isub            
	//   37   77:istore          4
		updateAllRemainingSpans(layoutstate.mLayoutDirection, i);
	//   38   79:aload_0         
	//   39   80:aload_2         
	//   40   81:getfield        #215 <Field int LayoutState.mLayoutDirection>
	//   41   84:iload           4
	//   42   86:invokespecial   #337 <Method void updateAllRemainingSpans(int, int)>
		int k;
		if(mShouldReverseLayout)
	//*  43   89:aload_0         
	//*  44   90:getfield        #78  <Field boolean mShouldReverseLayout>
	//*  45   93:ifeq            108
			k = mPrimaryOrientation.getEndAfterPadding();
	//   46   96:aload_0         
	//   47   97:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//   48  100:invokevirtual   #171 <Method int OrientationHelper.getEndAfterPadding()>
	//   49  103:istore          6
		else
	//*  50  105:goto            117
			k = mPrimaryOrientation.getStartAfterPadding();
	//   51  108:aload_0         
	//   52  109:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//   53  112:invokevirtual   #174 <Method int OrientationHelper.getStartAfterPadding()>
	//   54  115:istore          6
		int j;
		for(j = 0; layoutstate.hasMore(state) && (mLayoutState.mInfinite || !mRemainingSpans.isEmpty()); j = 1)
	//*  55  117:iconst_0        
	//*  56  118:istore          5
	//*  57  120:aload_2         
	//*  58  121:aload_3         
	//*  59  122:invokevirtual   #341 <Method boolean LayoutState.hasMore(RecyclerView$State)>
	//*  60  125:ifeq            890
	//*  61  128:aload_0         
	//*  62  129:getfield        #136 <Field LayoutState mLayoutState>
	//*  63  132:getfield        #323 <Field boolean LayoutState.mInfinite>
	//*  64  135:ifne            154
	//*  65  138:aload_0         
	//*  66  139:getfield        #314 <Field BitSet mRemainingSpans>
	//*  67  142:invokevirtual   #344 <Method boolean BitSet.isEmpty()>
	//*  68  145:ifne            151
	//*  69  148:goto            154
	//*  70  151:goto            890
		{
			View view = layoutstate.next(recycler);
	//   71  154:aload_2         
	//   72  155:aload_1         
	//   73  156:invokevirtual   #348 <Method View LayoutState.next(RecyclerView$Recycler)>
	//   74  159:astore          12
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   75  161:aload           12
	//   76  163:invokevirtual   #351 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   77  166:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//   78  169:astore          13
			int l1 = layoutparams.getViewLayoutPosition();
	//   79  171:aload           13
	//   80  173:invokevirtual   #354 <Method int StaggeredGridLayoutManager$LayoutParams.getViewLayoutPosition()>
	//   81  176:istore          10
			j = mLazySpanLookup.getSpan(l1);
	//   82  178:aload_0         
	//   83  179:getfield        #86  <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   84  182:iload           10
	//   85  184:invokevirtual   #357 <Method int StaggeredGridLayoutManager$LazySpanLookup.getSpan(int)>
	//   86  187:istore          5
			boolean flag;
			if(j == -1)
	//*  87  189:iload           5
	//*  88  191:iconst_m1       
	//*  89  192:icmpne          201
				flag = true;
	//   90  195:iconst_1        
	//   91  196:istore          9
			else
	//*  92  198:goto            204
				flag = false;
	//   93  201:iconst_0        
	//   94  202:istore          9
			Span span;
			if(flag)
	//*  95  204:iload           9
	//*  96  206:ifeq            249
			{
				if(layoutparams.mFullSpan)
	//*  97  209:aload           13
	//*  98  211:getfield        #218 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*  99  214:ifeq            228
					span = mSpans[0];
	//  100  217:aload_0         
	//  101  218:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  102  221:iconst_0        
	//  103  222:aaload          
	//  104  223:astore          11
				else
	//* 105  225:goto            235
					span = getNextSpan(layoutstate);
	//  106  228:aload_0         
	//  107  229:aload_2         
	//  108  230:invokespecial   #361 <Method StaggeredGridLayoutManager$Span getNextSpan(LayoutState)>
	//  109  233:astore          11
				mLazySpanLookup.setSpan(l1, span);
	//  110  235:aload_0         
	//  111  236:getfield        #86  <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//  112  239:iload           10
	//  113  241:aload           11
	//  114  243:invokevirtual   #365 <Method void StaggeredGridLayoutManager$LazySpanLookup.setSpan(int, StaggeredGridLayoutManager$Span)>
			} else
	//* 115  246:goto            258
			{
				span = mSpans[j];
	//  116  249:aload_0         
	//  117  250:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  118  253:iload           5
	//  119  255:aaload          
	//  120  256:astore          11
			}
			layoutparams.mSpan = span;
	//  121  258:aload           13
	//  122  260:aload           11
	//  123  262:putfield        #224 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
			if(layoutstate.mLayoutDirection == 1)
	//* 124  265:aload_2         
	//* 125  266:getfield        #215 <Field int LayoutState.mLayoutDirection>
	//* 126  269:iconst_1        
	//* 127  270:icmpne          282
				addView(view);
	//  128  273:aload_0         
	//  129  274:aload           12
	//  130  276:invokevirtual   #368 <Method void addView(View)>
			else
	//* 131  279:goto            289
				addView(view, 0);
	//  132  282:aload_0         
	//  133  283:aload           12
	//  134  285:iconst_0        
	//  135  286:invokevirtual   #371 <Method void addView(View, int)>
			measureChildWithDecorationsAndMargin(view, layoutparams, false);
	//  136  289:aload_0         
	//  137  290:aload           12
	//  138  292:aload           13
	//  139  294:iconst_0        
	//  140  295:invokespecial   #375 <Method void measureChildWithDecorationsAndMargin(View, StaggeredGridLayoutManager$LayoutParams, boolean)>
			int l;
			int i1;
			if(layoutstate.mLayoutDirection == 1)
	//* 141  298:aload_2         
	//* 142  299:getfield        #215 <Field int LayoutState.mLayoutDirection>
	//* 143  302:iconst_1        
	//* 144  303:icmpne          402
			{
				if(layoutparams.mFullSpan)
	//* 145  306:aload           13
	//* 146  308:getfield        #218 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 147  311:ifeq            325
					j = getMaxEnd(k);
	//  148  314:aload_0         
	//  149  315:iload           6
	//  150  317:invokespecial   #378 <Method int getMaxEnd(int)>
	//  151  320:istore          5
				else
	//* 152  322:goto            334
					j = span.getEndLine(k);
	//  153  325:aload           11
	//  154  327:iload           6
	//  155  329:invokevirtual   #301 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
	//  156  332:istore          5
				l = mPrimaryOrientation.getDecoratedMeasurement(view);
	//  157  334:aload_0         
	//  158  335:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//  159  338:aload           12
	//  160  340:invokevirtual   #382 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//  161  343:istore          7
				if(flag && layoutparams.mFullSpan)
	//* 162  345:iload           9
	//* 163  347:ifeq            388
	//* 164  350:aload           13
	//* 165  352:getfield        #218 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 166  355:ifeq            388
				{
					LazySpanLookup.FullSpanItem fullspanitem = createFullSpanItemFromEnd(j);
	//  167  358:aload_0         
	//  168  359:iload           5
	//  169  361:invokespecial   #384 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem createFullSpanItemFromEnd(int)>
	//  170  364:astore          14
					fullspanitem.mGapDir = -1;
	//  171  366:aload           14
	//  172  368:iconst_m1       
	//  173  369:putfield        #387 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapDir>
					fullspanitem.mPosition = l1;
	//  174  372:aload           14
	//  175  374:iload           10
	//  176  376:putfield        #390 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
					mLazySpanLookup.addFullSpanItem(fullspanitem);
	//  177  379:aload_0         
	//  178  380:getfield        #86  <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//  179  383:aload           14
	//  180  385:invokevirtual   #394 <Method void StaggeredGridLayoutManager$LazySpanLookup.addFullSpanItem(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)>
				}
				i1 = l + j;
	//  181  388:iload           7
	//  182  390:iload           5
	//  183  392:iadd            
	//  184  393:istore          8
				l = j;
	//  185  395:iload           5
	//  186  397:istore          7
			} else
	//* 187  399:goto            491
			{
				if(layoutparams.mFullSpan)
	//* 188  402:aload           13
	//* 189  404:getfield        #218 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 190  407:ifeq            421
					j = getMinStart(k);
	//  191  410:aload_0         
	//  192  411:iload           6
	//  193  413:invokespecial   #397 <Method int getMinStart(int)>
	//  194  416:istore          5
				else
	//* 195  418:goto            430
					j = span.getStartLine(k);
	//  196  421:aload           11
	//  197  423:iload           6
	//  198  425:invokevirtual   #304 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
	//  199  428:istore          5
				l = j - mPrimaryOrientation.getDecoratedMeasurement(view);
	//  200  430:iload           5
	//  201  432:aload_0         
	//  202  433:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//  203  436:aload           12
	//  204  438:invokevirtual   #382 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//  205  441:isub            
	//  206  442:istore          7
				if(flag && layoutparams.mFullSpan)
	//* 207  444:iload           9
	//* 208  446:ifeq            487
	//* 209  449:aload           13
	//* 210  451:getfield        #218 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 211  454:ifeq            487
				{
					LazySpanLookup.FullSpanItem fullspanitem1 = createFullSpanItemFromStart(j);
	//  212  457:aload_0         
	//  213  458:iload           5
	//  214  460:invokespecial   #399 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem createFullSpanItemFromStart(int)>
	//  215  463:astore          14
					fullspanitem1.mGapDir = 1;
	//  216  465:aload           14
	//  217  467:iconst_1        
	//  218  468:putfield        #387 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapDir>
					fullspanitem1.mPosition = l1;
	//  219  471:aload           14
	//  220  473:iload           10
	//  221  475:putfield        #390 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
					mLazySpanLookup.addFullSpanItem(fullspanitem1);
	//  222  478:aload_0         
	//  223  479:getfield        #86  <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//  224  482:aload           14
	//  225  484:invokevirtual   #394 <Method void StaggeredGridLayoutManager$LazySpanLookup.addFullSpanItem(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)>
				}
				i1 = j;
	//  226  487:iload           5
	//  227  489:istore          8
			}
			if(layoutparams.mFullSpan && layoutstate.mItemDirection == -1)
	//* 228  491:aload           13
	//* 229  493:getfield        #218 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 230  496:ifeq            579
	//* 231  499:aload_2         
	//* 232  500:getfield        #402 <Field int LayoutState.mItemDirection>
	//* 233  503:iconst_m1       
	//* 234  504:icmpne          579
				if(flag)
	//* 235  507:iload           9
	//* 236  509:ifeq            520
				{
					mLaidOutInvalidFullSpan = true;
	//  237  512:aload_0         
	//  238  513:iconst_1        
	//  239  514:putfield        #100 <Field boolean mLaidOutInvalidFullSpan>
				} else
	//* 240  517:goto            579
				{
					if(layoutstate.mLayoutDirection == 1)
	//* 241  520:aload_2         
	//* 242  521:getfield        #215 <Field int LayoutState.mLayoutDirection>
	//* 243  524:iconst_1        
	//* 244  525:icmpne          539
						j = ((int) (areAllEndsEqual() ^ true));
	//  245  528:aload_0         
	//  246  529:invokevirtual   #405 <Method boolean areAllEndsEqual()>
	//  247  532:iconst_1        
	//  248  533:ixor            
	//  249  534:istore          5
					else
	//* 250  536:goto            547
						j = ((int) (areAllStartsEqual() ^ true));
	//  251  539:aload_0         
	//  252  540:invokevirtual   #408 <Method boolean areAllStartsEqual()>
	//  253  543:iconst_1        
	//  254  544:ixor            
	//  255  545:istore          5
					if(j != 0)
	//* 256  547:iload           5
	//* 257  549:ifeq            579
					{
						LazySpanLookup.FullSpanItem fullspanitem2 = mLazySpanLookup.getFullSpanItem(l1);
	//  258  552:aload_0         
	//  259  553:getfield        #86  <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//  260  556:iload           10
	//  261  558:invokevirtual   #411 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem StaggeredGridLayoutManager$LazySpanLookup.getFullSpanItem(int)>
	//  262  561:astore          14
						if(fullspanitem2 != null)
	//* 263  563:aload           14
	//* 264  565:ifnull          574
							fullspanitem2.mHasUnwantedGapAfter = true;
	//  265  568:aload           14
	//  266  570:iconst_1        
	//  267  571:putfield        #414 <Field boolean StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mHasUnwantedGapAfter>
						mLaidOutInvalidFullSpan = true;
	//  268  574:aload_0         
	//  269  575:iconst_1        
	//  270  576:putfield        #100 <Field boolean mLaidOutInvalidFullSpan>
					}
				}
			attachViewToSpans(view, layoutparams, layoutstate);
	//  271  579:aload_0         
	//  272  580:aload           12
	//  273  582:aload           13
	//  274  584:aload_2         
	//  275  585:invokespecial   #416 <Method void attachViewToSpans(View, StaggeredGridLayoutManager$LayoutParams, LayoutState)>
			if(isLayoutRTL() && mOrientation == 1)
	//* 276  588:aload_0         
	//* 277  589:invokevirtual   #293 <Method boolean isLayoutRTL()>
	//* 278  592:ifeq            679
	//* 279  595:aload_0         
	//* 280  596:getfield        #289 <Field int mOrientation>
	//* 281  599:iconst_1        
	//* 282  600:icmpne          679
			{
				if(layoutparams.mFullSpan)
	//* 283  603:aload           13
	//* 284  605:getfield        #218 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 285  608:ifeq            623
					j = mSecondaryOrientation.getEndAfterPadding();
	//  286  611:aload_0         
	//  287  612:getfield        #310 <Field OrientationHelper mSecondaryOrientation>
	//  288  615:invokevirtual   #171 <Method int OrientationHelper.getEndAfterPadding()>
	//  289  618:istore          5
				else
	//* 290  620:goto            650
					j = mSecondaryOrientation.getEndAfterPadding() - (mSpanCount - 1 - span.mIndex) * mSizePerSpan;
	//  291  623:aload_0         
	//  292  624:getfield        #310 <Field OrientationHelper mSecondaryOrientation>
	//  293  627:invokevirtual   #171 <Method int OrientationHelper.getEndAfterPadding()>
	//  294  630:aload_0         
	//  295  631:getfield        #74  <Field int mSpanCount>
	//  296  634:iconst_1        
	//  297  635:isub            
	//  298  636:aload           11
	//  299  638:getfield        #419 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//  300  641:isub            
	//  301  642:aload_0         
	//  302  643:getfield        #421 <Field int mSizePerSpan>
	//  303  646:imul            
	//  304  647:isub            
	//  305  648:istore          5
				l1 = mSecondaryOrientation.getDecoratedMeasurement(view);
	//  306  650:aload_0         
	//  307  651:getfield        #310 <Field OrientationHelper mSecondaryOrientation>
	//  308  654:aload           12
	//  309  656:invokevirtual   #382 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//  310  659:istore          10
				int j1 = j;
	//  311  661:iload           5
	//  312  663:istore          9
				j -= l1;
	//  313  665:iload           5
	//  314  667:iload           10
	//  315  669:isub            
	//  316  670:istore          5
				l1 = j1;
	//  317  672:iload           9
	//  318  674:istore          10
			} else
	//* 319  676:goto            745
			{
				if(layoutparams.mFullSpan)
	//* 320  679:aload           13
	//* 321  681:getfield        #218 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 322  684:ifeq            699
					j = mSecondaryOrientation.getStartAfterPadding();
	//  323  687:aload_0         
	//  324  688:getfield        #310 <Field OrientationHelper mSecondaryOrientation>
	//  325  691:invokevirtual   #174 <Method int OrientationHelper.getStartAfterPadding()>
	//  326  694:istore          5
				else
	//* 327  696:goto            719
					j = span.mIndex * mSizePerSpan + mSecondaryOrientation.getStartAfterPadding();
	//  328  699:aload           11
	//  329  701:getfield        #419 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//  330  704:aload_0         
	//  331  705:getfield        #421 <Field int mSizePerSpan>
	//  332  708:imul            
	//  333  709:aload_0         
	//  334  710:getfield        #310 <Field OrientationHelper mSecondaryOrientation>
	//  335  713:invokevirtual   #174 <Method int OrientationHelper.getStartAfterPadding()>
	//  336  716:iadd            
	//  337  717:istore          5
				l1 = mSecondaryOrientation.getDecoratedMeasurement(view);
	//  338  719:aload_0         
	//  339  720:getfield        #310 <Field OrientationHelper mSecondaryOrientation>
	//  340  723:aload           12
	//  341  725:invokevirtual   #382 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//  342  728:istore          10
				int k1 = j;
	//  343  730:iload           5
	//  344  732:istore          9
				l1 += j;
	//  345  734:iload           10
	//  346  736:iload           5
	//  347  738:iadd            
	//  348  739:istore          10
				j = k1;
	//  349  741:iload           9
	//  350  743:istore          5
			}
			if(mOrientation == 1)
	//* 351  745:aload_0         
	//* 352  746:getfield        #289 <Field int mOrientation>
	//* 353  749:iconst_1        
	//* 354  750:icmpne          770
				layoutDecoratedWithMargins(view, j, l, l1, i1);
	//  355  753:aload_0         
	//  356  754:aload           12
	//  357  756:iload           5
	//  358  758:iload           7
	//  359  760:iload           10
	//  360  762:iload           8
	//  361  764:invokevirtual   #425 <Method void layoutDecoratedWithMargins(View, int, int, int, int)>
			else
	//* 362  767:goto            784
				layoutDecoratedWithMargins(view, l, j, i1, l1);
	//  363  770:aload_0         
	//  364  771:aload           12
	//  365  773:iload           7
	//  366  775:iload           5
	//  367  777:iload           8
	//  368  779:iload           10
	//  369  781:invokevirtual   #425 <Method void layoutDecoratedWithMargins(View, int, int, int, int)>
			if(layoutparams.mFullSpan)
	//* 370  784:aload           13
	//* 371  786:getfield        #218 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 372  789:ifeq            808
				updateAllRemainingSpans(mLayoutState.mLayoutDirection, i);
	//  373  792:aload_0         
	//  374  793:aload_0         
	//  375  794:getfield        #136 <Field LayoutState mLayoutState>
	//  376  797:getfield        #215 <Field int LayoutState.mLayoutDirection>
	//  377  800:iload           4
	//  378  802:invokespecial   #337 <Method void updateAllRemainingSpans(int, int)>
			else
	//* 379  805:goto            823
				updateRemainingSpans(span, mLayoutState.mLayoutDirection, i);
	//  380  808:aload_0         
	//  381  809:aload           11
	//  382  811:aload_0         
	//  383  812:getfield        #136 <Field LayoutState mLayoutState>
	//  384  815:getfield        #215 <Field int LayoutState.mLayoutDirection>
	//  385  818:iload           4
	//  386  820:invokespecial   #429 <Method void updateRemainingSpans(StaggeredGridLayoutManager$Span, int, int)>
			recycle(recycler, mLayoutState);
	//  387  823:aload_0         
	//  388  824:aload_1         
	//  389  825:aload_0         
	//  390  826:getfield        #136 <Field LayoutState mLayoutState>
	//  391  829:invokespecial   #433 <Method void recycle(RecyclerView$Recycler, LayoutState)>
			if(!mLayoutState.mStopInFocusable || !view.hasFocusable())
				continue;
	//  392  832:aload_0         
	//  393  833:getfield        #136 <Field LayoutState mLayoutState>
	//  394  836:getfield        #436 <Field boolean LayoutState.mStopInFocusable>
	//  395  839:ifeq            884
	//  396  842:aload           12
	//  397  844:invokevirtual   #439 <Method boolean View.hasFocusable()>
	//  398  847:ifeq            884
			if(layoutparams.mFullSpan)
	//* 399  850:aload           13
	//* 400  852:getfield        #218 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 401  855:ifeq            868
				mRemainingSpans.clear();
	//  402  858:aload_0         
	//  403  859:getfield        #314 <Field BitSet mRemainingSpans>
	//  404  862:invokevirtual   #440 <Method void BitSet.clear()>
			else
	//* 405  865:goto            884
				mRemainingSpans.set(span.mIndex, false);
	//  406  868:aload_0         
	//  407  869:getfield        #314 <Field BitSet mRemainingSpans>
	//  408  872:aload           11
	//  409  874:getfield        #419 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//  410  877:iconst_0        
	//  411  878:invokevirtual   #443 <Method void BitSet.set(int, boolean)>
		}

	//  412  881:goto            884
	//  413  884:iconst_1        
	//  414  885:istore          5
	//* 415  887:goto            120
		k = 0;
	//  416  890:iconst_0        
	//  417  891:istore          6
		if(j == 0)
	//* 418  893:iload           5
	//* 419  895:ifne            907
			recycle(recycler, mLayoutState);
	//  420  898:aload_0         
	//  421  899:aload_1         
	//  422  900:aload_0         
	//  423  901:getfield        #136 <Field LayoutState mLayoutState>
	//  424  904:invokespecial   #433 <Method void recycle(RecyclerView$Recycler, LayoutState)>
		if(mLayoutState.mLayoutDirection == -1)
	//* 425  907:aload_0         
	//* 426  908:getfield        #136 <Field LayoutState mLayoutState>
	//* 427  911:getfield        #215 <Field int LayoutState.mLayoutDirection>
	//* 428  914:iconst_m1       
	//* 429  915:icmpne          946
		{
			i = getMinStart(mPrimaryOrientation.getStartAfterPadding());
	//  430  918:aload_0         
	//  431  919:aload_0         
	//  432  920:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//  433  923:invokevirtual   #174 <Method int OrientationHelper.getStartAfterPadding()>
	//  434  926:invokespecial   #397 <Method int getMinStart(int)>
	//  435  929:istore          4
			i = mPrimaryOrientation.getStartAfterPadding() - i;
	//  436  931:aload_0         
	//  437  932:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//  438  935:invokevirtual   #174 <Method int OrientationHelper.getStartAfterPadding()>
	//  439  938:iload           4
	//  440  940:isub            
	//  441  941:istore          4
		} else
	//* 442  943:goto            967
		{
			i = getMaxEnd(mPrimaryOrientation.getEndAfterPadding()) - mPrimaryOrientation.getEndAfterPadding();
	//  443  946:aload_0         
	//  444  947:aload_0         
	//  445  948:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//  446  951:invokevirtual   #171 <Method int OrientationHelper.getEndAfterPadding()>
	//  447  954:invokespecial   #378 <Method int getMaxEnd(int)>
	//  448  957:aload_0         
	//  449  958:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//  450  961:invokevirtual   #171 <Method int OrientationHelper.getEndAfterPadding()>
	//  451  964:isub            
	//  452  965:istore          4
		}
		j = k;
	//  453  967:iload           6
	//  454  969:istore          5
		if(i > 0)
	//* 455  971:iload           4
	//* 456  973:ifle            987
			j = Math.min(layoutstate.mAvailable, i);
	//  457  976:aload_2         
	//  458  977:getfield        #330 <Field int LayoutState.mAvailable>
	//  459  980:iload           4
	//  460  982:invokestatic    #449 <Method int Math.min(int, int)>
	//  461  985:istore          5
		return j;
	//  462  987:iload           5
	//  463  989:ireturn         
	}

	private int findFirstReferenceChildPosition(int i)
	{
		int k = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #235 <Method int getChildCount()>
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
	//   11   15:invokevirtual   #454 <Method View getChildAt(int)>
	//   12   18:invokevirtual   #457 <Method int getPosition(View)>
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
	//*   1    1:invokevirtual   #235 <Method int getChildCount()>
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
	//   10   14:invokevirtual   #454 <Method View getChildAt(int)>
	//   11   17:invokevirtual   #457 <Method int getPosition(View)>
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
	//    1    1:ldc1            #81  <Int 0x80000000>
	//    2    3:invokespecial   #378 <Method int getMaxEnd(int)>
	//    3    6:istore          4
		if(i == 0x80000000)
	//*   4    8:iload           4
	//*   5   10:ldc1            #81  <Int 0x80000000>
	//*   6   12:icmpne          16
			return;
	//    7   15:return          
		i = mPrimaryOrientation.getEndAfterPadding() - i;
	//    8   16:aload_0         
	//    9   17:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//   10   20:invokevirtual   #171 <Method int OrientationHelper.getEndAfterPadding()>
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
	//   22   41:invokevirtual   #464 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
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
	//   31   58:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//   32   61:iload           4
	//   33   63:invokevirtual   #467 <Method void OrientationHelper.offsetChildren(int)>
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
	//    1    1:ldc2            #324 <Int 0x7fffffff>
	//    2    4:invokespecial   #397 <Method int getMinStart(int)>
	//    3    7:istore          4
		if(i == 0x7fffffff)
	//*   4    9:iload           4
	//*   5   11:ldc2            #324 <Int 0x7fffffff>
	//*   6   14:icmpne          18
			return;
	//    7   17:return          
		i -= mPrimaryOrientation.getStartAfterPadding();
	//    8   18:iload           4
	//    9   20:aload_0         
	//   10   21:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//   11   24:invokevirtual   #174 <Method int OrientationHelper.getStartAfterPadding()>
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
	//   21   42:invokevirtual   #464 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//   22   45:isub            
	//   23   46:istore          4
			if(flag && i > 0)
	//*  24   48:iload_3         
	//*  25   49:ifeq            67
	//*  26   52:iload           4
	//*  27   54:ifle            67
				mPrimaryOrientation.offsetChildren(-i);
	//   28   57:aload_0         
	//   29   58:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//   30   61:iload           4
	//   31   63:ineg            
	//   32   64:invokevirtual   #467 <Method void OrientationHelper.offsetChildren(int)>
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
	//    1    1:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:iload_1         
	//    5    7:invokevirtual   #301 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
	//    6   10:istore_3        
		for(int j = 1; j < mSpanCount;)
	//*   7   11:iconst_1        
	//*   8   12:istore_2        
	//*   9   13:iload_2         
	//*  10   14:aload_0         
	//*  11   15:getfield        #74  <Field int mSpanCount>
	//*  12   18:icmpge          56
		{
			int i1 = mSpans[j].getEndLine(i);
	//   13   21:aload_0         
	//   14   22:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   15   25:iload_2         
	//   16   26:aaload          
	//   17   27:iload_1         
	//   18   28:invokevirtual   #301 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
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
	//    1    1:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:iload_1         
	//    5    7:invokevirtual   #304 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
	//    6   10:istore_3        
		for(int j = 1; j < mSpanCount;)
	//*   7   11:iconst_1        
	//*   8   12:istore_2        
	//*   9   13:iload_2         
	//*  10   14:aload_0         
	//*  11   15:getfield        #74  <Field int mSpanCount>
	//*  12   18:icmpge          56
		{
			int i1 = mSpans[j].getStartLine(i);
	//   13   21:aload_0         
	//   14   22:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   15   25:iload_2         
	//   16   26:aaload          
	//   17   27:iload_1         
	//   18   28:invokevirtual   #304 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
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
	//    1    1:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:iload_1         
	//    5    7:invokevirtual   #301 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
	//    6   10:istore_3        
		for(int j = 1; j < mSpanCount;)
	//*   7   11:iconst_1        
	//*   8   12:istore_2        
	//*   9   13:iload_2         
	//*  10   14:aload_0         
	//*  11   15:getfield        #74  <Field int mSpanCount>
	//*  12   18:icmpge          56
		{
			int i1 = mSpans[j].getEndLine(i);
	//   13   21:aload_0         
	//   14   22:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   15   25:iload_2         
	//   16   26:aaload          
	//   17   27:iload_1         
	//   18   28:invokevirtual   #301 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
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
	//    1    1:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:iload_1         
	//    5    7:invokevirtual   #304 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
	//    6   10:istore_3        
		for(int j = 1; j < mSpanCount;)
	//*   7   11:iconst_1        
	//*   8   12:istore_2        
	//*   9   13:iload_2         
	//*  10   14:aload_0         
	//*  11   15:getfield        #74  <Field int mSpanCount>
	//*  12   18:icmpge          56
		{
			int i1 = mSpans[j].getStartLine(i);
	//   13   21:aload_0         
	//   14   22:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   15   25:iload_2         
	//   16   26:aaload          
	//   17   27:iload_1         
	//   18   28:invokevirtual   #304 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
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
	//    2    2:getfield        #215 <Field int LayoutState.mLayoutDirection>
	//    3    5:invokespecial   #474 <Method boolean preferLastSpan(int)>
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
	//   10   18:getfield        #74  <Field int mSpanCount>
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
	//   20   33:getfield        #74  <Field int mSpanCount>
	//   21   36:istore_3        
			byte0 = 1;
	//   22   37:iconst_1        
	//   23   38:istore          4
		}
		int k = layoutstate.mLayoutDirection;
	//   24   40:aload_1         
	//   25   41:getfield        #215 <Field int LayoutState.mLayoutDirection>
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
	//   34   57:ldc2            #324 <Int 0x7fffffff>
	//   35   60:istore          5
			int l1 = mPrimaryOrientation.getStartAfterPadding();
	//   36   62:aload_0         
	//   37   63:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//   38   66:invokevirtual   #174 <Method int OrientationHelper.getStartAfterPadding()>
	//   39   69:istore          8
			while(i != j) 
	//*  40   71:iload_2         
	//*  41   72:iload_3         
	//*  42   73:icmpeq          123
			{
				span = mSpans[i];
	//   43   76:aload_0         
	//   44   77:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   45   80:iload_2         
	//   46   81:aaload          
	//   47   82:astore          10
				int j1 = span.getEndLine(l1);
	//   48   84:aload           10
	//   49   86:iload           8
	//   50   88:invokevirtual   #301 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
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
	//   70  125:ldc1            #81  <Int 0x80000000>
	//   71  127:istore          5
		int i2 = mPrimaryOrientation.getEndAfterPadding();
	//   72  129:aload_0         
	//   73  130:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//   74  133:invokevirtual   #171 <Method int OrientationHelper.getEndAfterPadding()>
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
	//   82  147:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   83  150:iload_2         
	//   84  151:aaload          
	//   85  152:astore          10
			int k1 = span1.getStartLine(i2);
	//   86  154:aload           10
	//   87  156:iload           8
	//   88  158:invokevirtual   #304 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
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
		int j1;
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            16
			j1 = getLastChildPosition();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #479 <Method int getLastChildPosition()>
	//    5   11:istore          6
		else
	//*   6   13:goto            22
			j1 = getFirstChildPosition();
	//    7   16:aload_0         
	//    8   17:invokevirtual   #238 <Method int getFirstChildPosition()>
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
			i1 = i + j;
	//   30   55:iload_1         
	//   31   56:iload_2         
	//   32   57:iadd            
	//   33   58:istore          5
			l = i;
	//   34   60:iload_1         
	//   35   61:istore          4
		}
		mLazySpanLookup.invalidateAfter(l);
	//   36   63:aload_0         
	//   37   64:getfield        #86  <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   38   67:iload           4
	//   39   69:invokevirtual   #482 <Method int StaggeredGridLayoutManager$LazySpanLookup.invalidateAfter(int)>
	//   40   72:pop             
		if(k != 8)
	//*  41   73:iload_3         
	//*  42   74:bipush          8
	//*  43   76:icmpeq          131
		{
			switch(k)
	//*  44   79:iload_3         
			{
	//*  45   80:tableswitch     1 2: default 104
	//	               1 119
	//	               2 107
	//*  46  104:goto            149
			case 2: // '\002'
				mLazySpanLookup.offsetForRemoval(i, j);
	//   47  107:aload_0         
	//   48  108:getfield        #86  <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   49  111:iload_1         
	//   50  112:iload_2         
	//   51  113:invokevirtual   #485 <Method void StaggeredGridLayoutManager$LazySpanLookup.offsetForRemoval(int, int)>
				break;

	//*  52  116:goto            149
			case 1: // '\001'
				mLazySpanLookup.offsetForAddition(i, j);
	//   53  119:aload_0         
	//   54  120:getfield        #86  <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   55  123:iload_1         
	//   56  124:iload_2         
	//   57  125:invokevirtual   #488 <Method void StaggeredGridLayoutManager$LazySpanLookup.offsetForAddition(int, int)>
				break;
			}
		} else
	//*  58  128:goto            149
		{
			mLazySpanLookup.offsetForRemoval(i, 1);
	//   59  131:aload_0         
	//   60  132:getfield        #86  <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   61  135:iload_1         
	//   62  136:iconst_1        
	//   63  137:invokevirtual   #485 <Method void StaggeredGridLayoutManager$LazySpanLookup.offsetForRemoval(int, int)>
			mLazySpanLookup.offsetForAddition(j, 1);
	//   64  140:aload_0         
	//   65  141:getfield        #86  <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   66  144:iload_2         
	//   67  145:iconst_1        
	//   68  146:invokevirtual   #488 <Method void StaggeredGridLayoutManager$LazySpanLookup.offsetForAddition(int, int)>
		}
		if(i1 <= j1)
	//*  69  149:iload           5
	//*  70  151:iload           6
	//*  71  153:icmpgt          157
			return;
	//   72  156:return          
		if(mShouldReverseLayout)
	//*  73  157:aload_0         
	//*  74  158:getfield        #78  <Field boolean mShouldReverseLayout>
	//*  75  161:ifeq            172
			i = getFirstChildPosition();
	//   76  164:aload_0         
	//   77  165:invokevirtual   #238 <Method int getFirstChildPosition()>
	//   78  168:istore_1        
		else
	//*  79  169:goto            177
			i = getLastChildPosition();
	//   80  172:aload_0         
	//   81  173:invokevirtual   #479 <Method int getLastChildPosition()>
	//   82  176:istore_1        
		if(l <= i)
	//*  83  177:iload           4
	//*  84  179:iload_1         
	//*  85  180:icmpgt          187
			requestLayout();
	//   86  183:aload_0         
	//   87  184:invokevirtual   #491 <Method void requestLayout()>
	//   88  187:return          
	}

	private void measureChildWithDecorationsAndMargin(View view, int i, int j, boolean flag)
	{
		calculateItemDecorationsForChild(view, mTmpRect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #93  <Field Rect mTmpRect>
	//    4    6:invokevirtual   #496 <Method void calculateItemDecorationsForChild(View, Rect)>
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #351 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    7   13:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//    8   16:astore          5
		i = updateSpecWithExtra(i, layoutparams.leftMargin + mTmpRect.left, layoutparams.rightMargin + mTmpRect.right);
	//    9   18:aload_0         
	//   10   19:iload_2         
	//   11   20:aload           5
	//   12   22:getfield        #499 <Field int StaggeredGridLayoutManager$LayoutParams.leftMargin>
	//   13   25:aload_0         
	//   14   26:getfield        #93  <Field Rect mTmpRect>
	//   15   29:getfield        #502 <Field int Rect.left>
	//   16   32:iadd            
	//   17   33:aload           5
	//   18   35:getfield        #505 <Field int StaggeredGridLayoutManager$LayoutParams.rightMargin>
	//   19   38:aload_0         
	//   20   39:getfield        #93  <Field Rect mTmpRect>
	//   21   42:getfield        #508 <Field int Rect.right>
	//   22   45:iadd            
	//   23   46:invokespecial   #512 <Method int updateSpecWithExtra(int, int, int)>
	//   24   49:istore_2        
		j = updateSpecWithExtra(j, layoutparams.topMargin + mTmpRect.top, layoutparams.bottomMargin + mTmpRect.bottom);
	//   25   50:aload_0         
	//   26   51:iload_3         
	//   27   52:aload           5
	//   28   54:getfield        #515 <Field int StaggeredGridLayoutManager$LayoutParams.topMargin>
	//   29   57:aload_0         
	//   30   58:getfield        #93  <Field Rect mTmpRect>
	//   31   61:getfield        #518 <Field int Rect.top>
	//   32   64:iadd            
	//   33   65:aload           5
	//   34   67:getfield        #521 <Field int StaggeredGridLayoutManager$LayoutParams.bottomMargin>
	//   35   70:aload_0         
	//   36   71:getfield        #93  <Field Rect mTmpRect>
	//   37   74:getfield        #524 <Field int Rect.bottom>
	//   38   77:iadd            
	//   39   78:invokespecial   #512 <Method int updateSpecWithExtra(int, int, int)>
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
	//   48   93:invokevirtual   #528 <Method boolean shouldReMeasureChild(View, int, int, RecyclerView$LayoutParams)>
	//   49   96:istore          4
		else
	//*  50   98:goto            112
			flag = shouldMeasureChild(view, i, j, ((RecyclerView.LayoutParams) (layoutparams)));
	//   51  101:aload_0         
	//   52  102:aload_1         
	//   53  103:iload_2         
	//   54  104:iload_3         
	//   55  105:aload           5
	//   56  107:invokevirtual   #531 <Method boolean shouldMeasureChild(View, int, int, RecyclerView$LayoutParams)>
	//   57  110:istore          4
		if(flag)
	//*  58  112:iload           4
	//*  59  114:ifeq            123
			view.measure(i, j);
	//   60  117:aload_1         
	//   61  118:iload_2         
	//   62  119:iload_3         
	//   63  120:invokevirtual   #534 <Method void View.measure(int, int)>
	//   64  123:return          
	}

	private void measureChildWithDecorationsAndMargin(View view, LayoutParams layoutparams, boolean flag)
	{
		if(layoutparams.mFullSpan)
	//*   0    0:aload_2         
	//*   1    1:getfield        #218 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*   2    4:ifeq            87
			if(mOrientation == 1)
	//*   3    7:aload_0         
	//*   4    8:getfield        #289 <Field int mOrientation>
	//*   5   11:iconst_1        
	//*   6   12:icmpne          51
			{
				measureChildWithDecorationsAndMargin(view, mFullSizeSpec, getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), layoutparams.height, true), flag);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #536 <Field int mFullSizeSpec>
	//   11   21:aload_0         
	//   12   22:invokevirtual   #539 <Method int getHeight()>
	//   13   25:aload_0         
	//   14   26:invokevirtual   #542 <Method int getHeightMode()>
	//   15   29:aload_0         
	//   16   30:invokevirtual   #545 <Method int getPaddingTop()>
	//   17   33:aload_0         
	//   18   34:invokevirtual   #548 <Method int getPaddingBottom()>
	//   19   37:iadd            
	//   20   38:aload_2         
	//   21   39:getfield        #551 <Field int StaggeredGridLayoutManager$LayoutParams.height>
	//   22   42:iconst_1        
	//   23   43:invokestatic    #555 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   24   46:iload_3         
	//   25   47:invokespecial   #557 <Method void measureChildWithDecorationsAndMargin(View, int, int, boolean)>
				return;
	//   26   50:return          
			} else
			{
				measureChildWithDecorationsAndMargin(view, getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), layoutparams.width, true), mFullSizeSpec, flag);
	//   27   51:aload_0         
	//   28   52:aload_1         
	//   29   53:aload_0         
	//   30   54:invokevirtual   #560 <Method int getWidth()>
	//   31   57:aload_0         
	//   32   58:invokevirtual   #563 <Method int getWidthMode()>
	//   33   61:aload_0         
	//   34   62:invokevirtual   #566 <Method int getPaddingLeft()>
	//   35   65:aload_0         
	//   36   66:invokevirtual   #569 <Method int getPaddingRight()>
	//   37   69:iadd            
	//   38   70:aload_2         
	//   39   71:getfield        #572 <Field int StaggeredGridLayoutManager$LayoutParams.width>
	//   40   74:iconst_1        
	//   41   75:invokestatic    #555 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   42   78:aload_0         
	//   43   79:getfield        #536 <Field int mFullSizeSpec>
	//   44   82:iload_3         
	//   45   83:invokespecial   #557 <Method void measureChildWithDecorationsAndMargin(View, int, int, boolean)>
				return;
	//   46   86:return          
			}
		if(mOrientation == 1)
	//*  47   87:aload_0         
	//*  48   88:getfield        #289 <Field int mOrientation>
	//*  49   91:iconst_1        
	//*  50   92:icmpne          144
		{
			measureChildWithDecorationsAndMargin(view, getChildMeasureSpec(mSizePerSpan, getWidthMode(), 0, layoutparams.width, false), getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), layoutparams.height, true), flag);
	//   51   95:aload_0         
	//   52   96:aload_1         
	//   53   97:aload_0         
	//   54   98:getfield        #421 <Field int mSizePerSpan>
	//   55  101:aload_0         
	//   56  102:invokevirtual   #563 <Method int getWidthMode()>
	//   57  105:iconst_0        
	//   58  106:aload_2         
	//   59  107:getfield        #572 <Field int StaggeredGridLayoutManager$LayoutParams.width>
	//   60  110:iconst_0        
	//   61  111:invokestatic    #555 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   62  114:aload_0         
	//   63  115:invokevirtual   #539 <Method int getHeight()>
	//   64  118:aload_0         
	//   65  119:invokevirtual   #542 <Method int getHeightMode()>
	//   66  122:aload_0         
	//   67  123:invokevirtual   #545 <Method int getPaddingTop()>
	//   68  126:aload_0         
	//   69  127:invokevirtual   #548 <Method int getPaddingBottom()>
	//   70  130:iadd            
	//   71  131:aload_2         
	//   72  132:getfield        #551 <Field int StaggeredGridLayoutManager$LayoutParams.height>
	//   73  135:iconst_1        
	//   74  136:invokestatic    #555 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   75  139:iload_3         
	//   76  140:invokespecial   #557 <Method void measureChildWithDecorationsAndMargin(View, int, int, boolean)>
			return;
	//   77  143:return          
		} else
		{
			measureChildWithDecorationsAndMargin(view, getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), layoutparams.width, true), getChildMeasureSpec(mSizePerSpan, getHeightMode(), 0, layoutparams.height, false), flag);
	//   78  144:aload_0         
	//   79  145:aload_1         
	//   80  146:aload_0         
	//   81  147:invokevirtual   #560 <Method int getWidth()>
	//   82  150:aload_0         
	//   83  151:invokevirtual   #563 <Method int getWidthMode()>
	//   84  154:aload_0         
	//   85  155:invokevirtual   #566 <Method int getPaddingLeft()>
	//   86  158:aload_0         
	//   87  159:invokevirtual   #569 <Method int getPaddingRight()>
	//   88  162:iadd            
	//   89  163:aload_2         
	//   90  164:getfield        #572 <Field int StaggeredGridLayoutManager$LayoutParams.width>
	//   91  167:iconst_1        
	//   92  168:invokestatic    #555 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//   93  171:aload_0         
	//   94  172:getfield        #421 <Field int mSizePerSpan>
	//   95  175:aload_0         
	//   96  176:invokevirtual   #542 <Method int getHeightMode()>
	//   97  179:iconst_0        
	//   98  180:aload_2         
	//   99  181:getfield        #551 <Field int StaggeredGridLayoutManager$LayoutParams.height>
	//  100  184:iconst_0        
	//  101  185:invokestatic    #555 <Method int getChildMeasureSpec(int, int, int, int, boolean)>
	//  102  188:iload_3         
	//  103  189:invokespecial   #557 <Method void measureChildWithDecorationsAndMargin(View, int, int, boolean)>
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
	//    1    1:getfield        #98  <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
	//    2    4:astore          7
			if((mPendingSavedState != null || mPendingScrollPosition != -1) && state.getItemCount() == 0)
	//*   3    6:aload_0         
	//*   4    7:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*   5   10:ifnonnull       21
	//*   6   13:aload_0         
	//*   7   14:getfield        #80  <Field int mPendingScrollPosition>
	//*   8   17:iconst_m1       
	//*   9   18:icmpeq          39
	//*  10   21:aload_2         
	//*  11   22:invokevirtual   #578 <Method int RecyclerView$State.getItemCount()>
	//*  12   25:ifne            39
			{
				removeAndRecycleAllViews(recycler);
	//   13   28:aload_0         
	//   14   29:aload_1         
	//   15   30:invokevirtual   #582 <Method void removeAndRecycleAllViews(RecyclerView$Recycler)>
				anchorinfo.reset();
	//   16   33:aload           7
	//   17   35:invokevirtual   #585 <Method void StaggeredGridLayoutManager$AnchorInfo.reset()>
				return;
	//   18   38:return          
			}
			boolean flag3 = anchorinfo.mValid;
	//   19   39:aload           7
	//   20   41:getfield        #588 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mValid>
	//   21   44:istore          6
			boolean flag2 = true;
	//   22   46:iconst_1        
	//   23   47:istore          5
			int i;
			if(flag3 && mPendingScrollPosition == -1 && mPendingSavedState == null)
	//*  24   49:iload           6
	//*  25   51:ifeq            78
	//*  26   54:aload_0         
	//*  27   55:getfield        #80  <Field int mPendingScrollPosition>
	//*  28   58:iconst_m1       
	//*  29   59:icmpne          78
	//*  30   62:aload_0         
	//*  31   63:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
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
	//   42   88:invokevirtual   #585 <Method void StaggeredGridLayoutManager$AnchorInfo.reset()>
				if(mPendingSavedState != null)
	//*  43   91:aload_0         
	//*  44   92:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  45   95:ifnull          107
				{
					applyPendingSavedState(anchorinfo);
	//   46   98:aload_0         
	//   47   99:aload           7
	//   48  101:invokespecial   #590 <Method void applyPendingSavedState(StaggeredGridLayoutManager$AnchorInfo)>
				} else
	//*  49  104:goto            120
				{
					resolveShouldLayoutReverse();
	//   50  107:aload_0         
	//   51  108:invokespecial   #193 <Method void resolveShouldLayoutReverse()>
					anchorinfo.mLayoutFromEnd = mShouldReverseLayout;
	//   52  111:aload           7
	//   53  113:aload_0         
	//   54  114:getfield        #78  <Field boolean mShouldReverseLayout>
	//   55  117:putfield        #196 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
				}
				updateAnchorInfoForLayout(state, anchorinfo);
	//   56  120:aload_0         
	//   57  121:aload_2         
	//   58  122:aload           7
	//   59  124:invokevirtual   #594 <Method void updateAnchorInfoForLayout(RecyclerView$State, StaggeredGridLayoutManager$AnchorInfo)>
				anchorinfo.mValid = true;
	//   60  127:aload           7
	//   61  129:iconst_1        
	//   62  130:putfield        #588 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mValid>
			}
			if(mPendingSavedState == null && mPendingScrollPosition == -1 && (anchorinfo.mLayoutFromEnd != mLastLayoutFromEnd || isLayoutRTL() != mLastLayoutRTL))
	//*  63  133:aload_0         
	//*  64  134:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  65  137:ifnonnull       184
	//*  66  140:aload_0         
	//*  67  141:getfield        #80  <Field int mPendingScrollPosition>
	//*  68  144:iconst_m1       
	//*  69  145:icmpne          184
	//*  70  148:aload           7
	//*  71  150:getfield        #196 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
	//*  72  153:aload_0         
	//*  73  154:getfield        #596 <Field boolean mLastLayoutFromEnd>
	//*  74  157:icmpne          171
	//*  75  160:aload_0         
	//*  76  161:invokevirtual   #293 <Method boolean isLayoutRTL()>
	//*  77  164:aload_0         
	//*  78  165:getfield        #189 <Field boolean mLastLayoutRTL>
	//*  79  168:icmpeq          184
			{
				mLazySpanLookup.clear();
	//   80  171:aload_0         
	//   81  172:getfield        #86  <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   82  175:invokevirtual   #597 <Method void StaggeredGridLayoutManager$LazySpanLookup.clear()>
				anchorinfo.mInvalidateOffsets = true;
	//   83  178:aload           7
	//   84  180:iconst_1        
	//   85  181:putfield        #600 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mInvalidateOffsets>
			}
			if(getChildCount() > 0)
	//*  86  184:aload_0         
	//*  87  185:invokevirtual   #235 <Method int getChildCount()>
	//*  88  188:ifle            394
			{
				SavedState savedstate = mPendingSavedState;
	//   89  191:aload_0         
	//   90  192:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   91  195:astore          8
				if(savedstate == null || savedstate.mSpanOffsetsSize < 1)
	//*  92  197:aload           8
	//*  93  199:ifnull          211
	//*  94  202:aload           8
	//*  95  204:getfield        #154 <Field int StaggeredGridLayoutManager$SavedState.mSpanOffsetsSize>
	//*  96  207:iconst_1        
	//*  97  208:icmpge          394
					if(anchorinfo.mInvalidateOffsets)
	//*  98  211:aload           7
	//*  99  213:getfield        #600 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mInvalidateOffsets>
	//* 100  216:ifeq            275
						for(i = 0; i < mSpanCount; i++)
	//* 101  219:iconst_0        
	//* 102  220:istore          4
	//* 103  222:iload           4
	//* 104  224:aload_0         
	//* 105  225:getfield        #74  <Field int mSpanCount>
	//* 106  228:icmpge          394
						{
							mSpans[i].clear();
	//  107  231:aload_0         
	//  108  232:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  109  235:iload           4
	//  110  237:aaload          
	//  111  238:invokevirtual   #157 <Method void StaggeredGridLayoutManager$Span.clear()>
							if(anchorinfo.mOffset != 0x80000000)
	//* 112  241:aload           7
	//* 113  243:getfield        #603 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
	//* 114  246:ldc1            #81  <Int 0x80000000>
	//* 115  248:icmpeq          266
								mSpans[i].setLine(anchorinfo.mOffset);
	//  116  251:aload_0         
	//  117  252:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  118  255:iload           4
	//  119  257:aaload          
	//  120  258:aload           7
	//  121  260:getfield        #603 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
	//  122  263:invokevirtual   #177 <Method void StaggeredGridLayoutManager$Span.setLine(int)>
						}

	//  123  266:iload           4
	//  124  268:iconst_1        
	//  125  269:iadd            
	//  126  270:istore          4
					else
	//* 127  272:goto            222
					if(i == 0 && mAnchorInfo.mSpanReferenceLines != null)
	//* 128  275:iload           4
	//* 129  277:ifne            343
	//* 130  280:aload_0         
	//* 131  281:getfield        #98  <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
	//* 132  284:getfield        #606 <Field int[] StaggeredGridLayoutManager$AnchorInfo.mSpanReferenceLines>
	//* 133  287:ifnonnull       293
	//* 134  290:goto            343
					{
						for(int j = 0; j < mSpanCount; j++)
	//* 135  293:iconst_0        
	//* 136  294:istore          4
	//* 137  296:iload           4
	//* 138  298:aload_0         
	//* 139  299:getfield        #74  <Field int mSpanCount>
	//* 140  302:icmpge          394
						{
							Span span = mSpans[j];
	//  141  305:aload_0         
	//  142  306:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  143  309:iload           4
	//  144  311:aaload          
	//  145  312:astore          8
							span.clear();
	//  146  314:aload           8
	//  147  316:invokevirtual   #157 <Method void StaggeredGridLayoutManager$Span.clear()>
							span.setLine(mAnchorInfo.mSpanReferenceLines[j]);
	//  148  319:aload           8
	//  149  321:aload_0         
	//  150  322:getfield        #98  <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
	//  151  325:getfield        #606 <Field int[] StaggeredGridLayoutManager$AnchorInfo.mSpanReferenceLines>
	//  152  328:iload           4
	//  153  330:iaload          
	//  154  331:invokevirtual   #177 <Method void StaggeredGridLayoutManager$Span.setLine(int)>
						}

	//  155  334:iload           4
	//  156  336:iconst_1        
	//  157  337:iadd            
	//  158  338:istore          4
					} else
	//* 159  340:goto            296
					{
						for(int k = 0; k < mSpanCount; k++)
	//* 160  343:iconst_0        
	//* 161  344:istore          4
	//* 162  346:iload           4
	//* 163  348:aload_0         
	//* 164  349:getfield        #74  <Field int mSpanCount>
	//* 165  352:icmpge          383
							mSpans[k].cacheReferenceLineAndClear(mShouldReverseLayout, anchorinfo.mOffset);
	//  166  355:aload_0         
	//  167  356:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  168  359:iload           4
	//  169  361:aaload          
	//  170  362:aload_0         
	//  171  363:getfield        #78  <Field boolean mShouldReverseLayout>
	//  172  366:aload           7
	//  173  368:getfield        #603 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
	//  174  371:invokevirtual   #610 <Method void StaggeredGridLayoutManager$Span.cacheReferenceLineAndClear(boolean, int)>

	//  175  374:iload           4
	//  176  376:iconst_1        
	//  177  377:iadd            
	//  178  378:istore          4
	//* 179  380:goto            346
						mAnchorInfo.saveSpanReferenceLines(mSpans);
	//  180  383:aload_0         
	//  181  384:getfield        #98  <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
	//  182  387:aload_0         
	//  183  388:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  184  391:invokevirtual   #614 <Method void StaggeredGridLayoutManager$AnchorInfo.saveSpanReferenceLines(StaggeredGridLayoutManager$Span[])>
					}
			}
			detachAndScrapAttachedViews(recycler);
	//  185  394:aload_0         
	//  186  395:aload_1         
	//  187  396:invokevirtual   #617 <Method void detachAndScrapAttachedViews(RecyclerView$Recycler)>
			mLayoutState.mRecycle = false;
	//  188  399:aload_0         
	//  189  400:getfield        #136 <Field LayoutState mLayoutState>
	//  190  403:iconst_0        
	//  191  404:putfield        #620 <Field boolean LayoutState.mRecycle>
			mLaidOutInvalidFullSpan = false;
	//  192  407:aload_0         
	//  193  408:iconst_0        
	//  194  409:putfield        #100 <Field boolean mLaidOutInvalidFullSpan>
			updateMeasureSpecs(mSecondaryOrientation.getTotalSpace());
	//  195  412:aload_0         
	//  196  413:aload_0         
	//  197  414:getfield        #310 <Field OrientationHelper mSecondaryOrientation>
	//  198  417:invokevirtual   #623 <Method int OrientationHelper.getTotalSpace()>
	//  199  420:invokevirtual   #626 <Method void updateMeasureSpecs(int)>
			updateLayoutState(anchorinfo.mPosition, state);
	//  200  423:aload_0         
	//  201  424:aload           7
	//  202  426:getfield        #627 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
	//  203  429:aload_2         
	//  204  430:invokespecial   #631 <Method void updateLayoutState(int, RecyclerView$State)>
			if(anchorinfo.mLayoutFromEnd)
	//* 205  433:aload           7
	//* 206  435:getfield        #196 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
	//* 207  438:ifeq            496
			{
				setLayoutStateDirection(-1);
	//  208  441:aload_0         
	//  209  442:iconst_m1       
	//  210  443:invokespecial   #634 <Method void setLayoutStateDirection(int)>
				fill(recycler, mLayoutState, state);
	//  211  446:aload_0         
	//  212  447:aload_1         
	//  213  448:aload_0         
	//  214  449:getfield        #136 <Field LayoutState mLayoutState>
	//  215  452:aload_2         
	//  216  453:invokespecial   #636 <Method int fill(RecyclerView$Recycler, LayoutState, RecyclerView$State)>
	//  217  456:pop             
				setLayoutStateDirection(1);
	//  218  457:aload_0         
	//  219  458:iconst_1        
	//  220  459:invokespecial   #634 <Method void setLayoutStateDirection(int)>
				mLayoutState.mCurrentPosition = anchorinfo.mPosition + mLayoutState.mItemDirection;
	//  221  462:aload_0         
	//  222  463:getfield        #136 <Field LayoutState mLayoutState>
	//  223  466:aload           7
	//  224  468:getfield        #627 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
	//  225  471:aload_0         
	//  226  472:getfield        #136 <Field LayoutState mLayoutState>
	//  227  475:getfield        #402 <Field int LayoutState.mItemDirection>
	//  228  478:iadd            
	//  229  479:putfield        #639 <Field int LayoutState.mCurrentPosition>
				fill(recycler, mLayoutState, state);
	//  230  482:aload_0         
	//  231  483:aload_1         
	//  232  484:aload_0         
	//  233  485:getfield        #136 <Field LayoutState mLayoutState>
	//  234  488:aload_2         
	//  235  489:invokespecial   #636 <Method int fill(RecyclerView$Recycler, LayoutState, RecyclerView$State)>
	//  236  492:pop             
			} else
	//* 237  493:goto            548
			{
				setLayoutStateDirection(1);
	//  238  496:aload_0         
	//  239  497:iconst_1        
	//  240  498:invokespecial   #634 <Method void setLayoutStateDirection(int)>
				fill(recycler, mLayoutState, state);
	//  241  501:aload_0         
	//  242  502:aload_1         
	//  243  503:aload_0         
	//  244  504:getfield        #136 <Field LayoutState mLayoutState>
	//  245  507:aload_2         
	//  246  508:invokespecial   #636 <Method int fill(RecyclerView$Recycler, LayoutState, RecyclerView$State)>
	//  247  511:pop             
				setLayoutStateDirection(-1);
	//  248  512:aload_0         
	//  249  513:iconst_m1       
	//  250  514:invokespecial   #634 <Method void setLayoutStateDirection(int)>
				mLayoutState.mCurrentPosition = anchorinfo.mPosition + mLayoutState.mItemDirection;
	//  251  517:aload_0         
	//  252  518:getfield        #136 <Field LayoutState mLayoutState>
	//  253  521:aload           7
	//  254  523:getfield        #627 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
	//  255  526:aload_0         
	//  256  527:getfield        #136 <Field LayoutState mLayoutState>
	//  257  530:getfield        #402 <Field int LayoutState.mItemDirection>
	//  258  533:iadd            
	//  259  534:putfield        #639 <Field int LayoutState.mCurrentPosition>
				fill(recycler, mLayoutState, state);
	//  260  537:aload_0         
	//  261  538:aload_1         
	//  262  539:aload_0         
	//  263  540:getfield        #136 <Field LayoutState mLayoutState>
	//  264  543:aload_2         
	//  265  544:invokespecial   #636 <Method int fill(RecyclerView$Recycler, LayoutState, RecyclerView$State)>
	//  266  547:pop             
			}
			repositionToWrapContentIfNecessary();
	//  267  548:aload_0         
	//  268  549:invokespecial   #642 <Method void repositionToWrapContentIfNecessary()>
			if(getChildCount() > 0)
	//* 269  552:aload_0         
	//* 270  553:invokevirtual   #235 <Method int getChildCount()>
	//* 271  556:ifle            597
				if(mShouldReverseLayout)
	//* 272  559:aload_0         
	//* 273  560:getfield        #78  <Field boolean mShouldReverseLayout>
	//* 274  563:ifeq            583
				{
					fixEndGap(recycler, state, true);
	//  275  566:aload_0         
	//  276  567:aload_1         
	//  277  568:aload_2         
	//  278  569:iconst_1        
	//  279  570:invokespecial   #644 <Method void fixEndGap(RecyclerView$Recycler, RecyclerView$State, boolean)>
					fixStartGap(recycler, state, false);
	//  280  573:aload_0         
	//  281  574:aload_1         
	//  282  575:aload_2         
	//  283  576:iconst_0        
	//  284  577:invokespecial   #646 <Method void fixStartGap(RecyclerView$Recycler, RecyclerView$State, boolean)>
				} else
	//* 285  580:goto            597
				{
					fixStartGap(recycler, state, true);
	//  286  583:aload_0         
	//  287  584:aload_1         
	//  288  585:aload_2         
	//  289  586:iconst_1        
	//  290  587:invokespecial   #646 <Method void fixStartGap(RecyclerView$Recycler, RecyclerView$State, boolean)>
					fixEndGap(recycler, state, false);
	//  291  590:aload_0         
	//  292  591:aload_1         
	//  293  592:aload_2         
	//  294  593:iconst_0        
	//  295  594:invokespecial   #644 <Method void fixEndGap(RecyclerView$Recycler, RecyclerView$State, boolean)>
				}
			if(flag && !state.isPreLayout())
	//* 296  597:iload_3         
	//* 297  598:ifeq            673
	//* 298  601:aload_2         
	//* 299  602:invokevirtual   #649 <Method boolean RecyclerView$State.isPreLayout()>
	//* 300  605:ifne            673
			{
				if(mGapStrategy != 0 && getChildCount() > 0 && (mLaidOutInvalidFullSpan || hasGapsToFix() != null))
	//* 301  608:aload_0         
	//* 302  609:getfield        #88  <Field int mGapStrategy>
	//* 303  612:ifeq            642
	//* 304  615:aload_0         
	//* 305  616:invokevirtual   #235 <Method int getChildCount()>
	//* 306  619:ifle            642
	//* 307  622:aload_0         
	//* 308  623:getfield        #100 <Field boolean mLaidOutInvalidFullSpan>
	//* 309  626:ifne            636
	//* 310  629:aload_0         
	//* 311  630:invokevirtual   #653 <Method View hasGapsToFix()>
	//* 312  633:ifnull          642
					flag1 = true;
	//  313  636:iconst_1        
	//  314  637:istore          4
				else
	//* 315  639:goto            645
					flag1 = false;
	//  316  642:iconst_0        
	//  317  643:istore          4
				if(flag1)
	//* 318  645:iload           4
	//* 319  647:ifeq            673
				{
					removeCallbacks(mCheckForGapsRunnable);
	//  320  650:aload_0         
	//  321  651:aload_0         
	//  322  652:getfield        #105 <Field Runnable mCheckForGapsRunnable>
	//  323  655:invokevirtual   #657 <Method boolean removeCallbacks(Runnable)>
	//  324  658:pop             
					if(checkForGaps())
	//* 325  659:aload_0         
	//* 326  660:invokevirtual   #660 <Method boolean checkForGaps()>
	//* 327  663:ifeq            673
					{
						flag1 = flag2;
	//  328  666:iload           5
	//  329  668:istore          4
						break label0;
	//  330  670:goto            676
					}
				}
			}
			flag1 = false;
	//  331  673:iconst_0        
	//  332  674:istore          4
		}
		if(state.isPreLayout())
	//* 333  676:aload_2         
	//* 334  677:invokevirtual   #649 <Method boolean RecyclerView$State.isPreLayout()>
	//* 335  680:ifeq            690
			mAnchorInfo.reset();
	//  336  683:aload_0         
	//  337  684:getfield        #98  <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
	//  338  687:invokevirtual   #585 <Method void StaggeredGridLayoutManager$AnchorInfo.reset()>
		mLastLayoutFromEnd = anchorinfo.mLayoutFromEnd;
	//  339  690:aload_0         
	//  340  691:aload           7
	//  341  693:getfield        #196 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
	//  342  696:putfield        #596 <Field boolean mLastLayoutFromEnd>
		mLastLayoutRTL = isLayoutRTL();
	//  343  699:aload_0         
	//  344  700:aload_0         
	//  345  701:invokevirtual   #293 <Method boolean isLayoutRTL()>
	//  346  704:putfield        #189 <Field boolean mLastLayoutRTL>
		if(flag1)
	//* 347  707:iload           4
	//* 348  709:ifeq            726
		{
			mAnchorInfo.reset();
	//  349  712:aload_0         
	//  350  713:getfield        #98  <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
	//  351  716:invokevirtual   #585 <Method void StaggeredGridLayoutManager$AnchorInfo.reset()>
			onLayoutChildren(recycler, state, false);
	//  352  719:aload_0         
	//  353  720:aload_1         
	//  354  721:aload_2         
	//  355  722:iconst_0        
	//  356  723:invokespecial   #662 <Method void onLayoutChildren(RecyclerView$Recycler, RecyclerView$State, boolean)>
		}
	//  357  726:return          
	}

	private boolean preferLastSpan(int i)
	{
		if(mOrientation == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #289 <Field int mOrientation>
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
	//   13   21:getfield        #78  <Field boolean mShouldReverseLayout>
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
	//*  29   45:getfield        #78  <Field boolean mShouldReverseLayout>
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
	//   38   60:invokevirtual   #293 <Method boolean isLayoutRTL()>
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
	//*   1    1:getfield        #74  <Field int mSpanCount>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iflt            28
			mSpans[i].prependToSpan(view);
	//    7   11:aload_0         
	//    8   12:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//    9   15:iload_2         
	//   10   16:aaload          
	//   11   17:aload_1         
	//   12   18:invokevirtual   #230 <Method void StaggeredGridLayoutManager$Span.prependToSpan(View)>

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
	//*   1    1:getfield        #620 <Field boolean LayoutState.mRecycle>
	//*   2    4:ifeq            156
		{
			if(layoutstate.mInfinite)
	//*   3    7:aload_2         
	//*   4    8:getfield        #323 <Field boolean LayoutState.mInfinite>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			if(layoutstate.mAvailable == 0)
	//*   7   15:aload_2         
	//*   8   16:getfield        #330 <Field int LayoutState.mAvailable>
	//*   9   19:ifne            50
				if(layoutstate.mLayoutDirection == -1)
	//*  10   22:aload_2         
	//*  11   23:getfield        #215 <Field int LayoutState.mLayoutDirection>
	//*  12   26:iconst_m1       
	//*  13   27:icmpne          40
				{
					recycleFromEnd(recycler, layoutstate.mEndLine);
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:aload_2         
	//   17   33:getfield        #327 <Field int LayoutState.mEndLine>
	//   18   36:invokespecial   #666 <Method void recycleFromEnd(RecyclerView$Recycler, int)>
					return;
	//   19   39:return          
				} else
				{
					recycleFromStart(recycler, layoutstate.mStartLine);
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:aload_2         
	//   23   43:getfield        #333 <Field int LayoutState.mStartLine>
	//   24   46:invokespecial   #669 <Method void recycleFromStart(RecyclerView$Recycler, int)>
					return;
	//   25   49:return          
				}
			if(layoutstate.mLayoutDirection == -1)
	//*  26   50:aload_2         
	//*  27   51:getfield        #215 <Field int LayoutState.mLayoutDirection>
	//*  28   54:iconst_m1       
	//*  29   55:icmpne          105
			{
				int i = layoutstate.mStartLine - getMaxStart(layoutstate.mStartLine);
	//   30   58:aload_2         
	//   31   59:getfield        #333 <Field int LayoutState.mStartLine>
	//   32   62:aload_0         
	//   33   63:aload_2         
	//   34   64:getfield        #333 <Field int LayoutState.mStartLine>
	//   35   67:invokespecial   #671 <Method int getMaxStart(int)>
	//   36   70:isub            
	//   37   71:istore_3        
				if(i < 0)
	//*  38   72:iload_3         
	//*  39   73:ifge            84
					i = layoutstate.mEndLine;
	//   40   76:aload_2         
	//   41   77:getfield        #327 <Field int LayoutState.mEndLine>
	//   42   80:istore_3        
				else
	//*  43   81:goto            98
					i = layoutstate.mEndLine - Math.min(i, layoutstate.mAvailable);
	//   44   84:aload_2         
	//   45   85:getfield        #327 <Field int LayoutState.mEndLine>
	//   46   88:iload_3         
	//   47   89:aload_2         
	//   48   90:getfield        #330 <Field int LayoutState.mAvailable>
	//   49   93:invokestatic    #449 <Method int Math.min(int, int)>
	//   50   96:isub            
	//   51   97:istore_3        
				recycleFromEnd(recycler, i);
	//   52   98:aload_0         
	//   53   99:aload_1         
	//   54  100:iload_3         
	//   55  101:invokespecial   #666 <Method void recycleFromEnd(RecyclerView$Recycler, int)>
				return;
	//   56  104:return          
			}
			int j = getMinEnd(layoutstate.mEndLine) - layoutstate.mEndLine;
	//   57  105:aload_0         
	//   58  106:aload_2         
	//   59  107:getfield        #327 <Field int LayoutState.mEndLine>
	//   60  110:invokespecial   #673 <Method int getMinEnd(int)>
	//   61  113:aload_2         
	//   62  114:getfield        #327 <Field int LayoutState.mEndLine>
	//   63  117:isub            
	//   64  118:istore_3        
			if(j < 0)
	//*  65  119:iload_3         
	//*  66  120:ifge            131
			{
				j = layoutstate.mStartLine;
	//   67  123:aload_2         
	//   68  124:getfield        #333 <Field int LayoutState.mStartLine>
	//   69  127:istore_3        
			} else
	//*  70  128:goto            149
			{
				int k = layoutstate.mStartLine;
	//   71  131:aload_2         
	//   72  132:getfield        #333 <Field int LayoutState.mStartLine>
	//   73  135:istore          4
				j = Math.min(j, layoutstate.mAvailable) + k;
	//   74  137:iload_3         
	//   75  138:aload_2         
	//   76  139:getfield        #330 <Field int LayoutState.mAvailable>
	//   77  142:invokestatic    #449 <Method int Math.min(int, int)>
	//   78  145:iload           4
	//   79  147:iadd            
	//   80  148:istore_3        
			}
			recycleFromStart(recycler, j);
	//   81  149:aload_0         
	//   82  150:aload_1         
	//   83  151:iload_3         
	//   84  152:invokespecial   #669 <Method void recycleFromStart(RecyclerView$Recycler, int)>
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
	//*   1    1:invokevirtual   #235 <Method int getChildCount()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_3        
	//*   5    7:iload_3         
	//*   6    8:iflt            175
		{
			View view = getChildAt(j);
	//    7   11:aload_0         
	//    8   12:iload_3         
	//    9   13:invokevirtual   #454 <Method View getChildAt(int)>
	//   10   16:astore          7
			if(mPrimaryOrientation.getDecoratedStart(view) >= i && mPrimaryOrientation.getTransformedStartWithDecoration(view) >= i)
	//*  11   18:aload_0         
	//*  12   19:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//*  13   22:aload           7
	//*  14   24:invokevirtual   #676 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  15   27:iload_2         
	//*  16   28:icmplt          174
	//*  17   31:aload_0         
	//*  18   32:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//*  19   35:aload           7
	//*  20   37:invokevirtual   #679 <Method int OrientationHelper.getTransformedStartWithDecoration(View)>
	//*  21   40:iload_2         
	//*  22   41:icmplt          174
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   23   44:aload           7
	//   24   46:invokevirtual   #351 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   25   49:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//   26   52:astore          8
				if(layoutparams.mFullSpan)
	//*  27   54:aload           8
	//*  28   56:getfield        #218 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
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
	//   38   75:getfield        #74  <Field int mSpanCount>
	//   39   78:icmpge          108
						if(mSpans[k].mViews.size() == 1)
	//*  40   81:aload_0         
	//*  41   82:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//*  42   85:iload           4
	//*  43   87:aaload          
	//*  44   88:getfield        #247 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//*  45   91:invokevirtual   #252 <Method int ArrayList.size()>
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
	//*  56  111:getfield        #74  <Field int mSpanCount>
	//*  57  114:icmpge          160
						mSpans[l].popEnd();
	//   58  117:aload_0         
	//   59  118:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   60  121:iload           5
	//   61  123:aaload          
	//   62  124:invokevirtual   #682 <Method void StaggeredGridLayoutManager$Span.popEnd()>

	//   63  127:iload           5
	//   64  129:iconst_1        
	//   65  130:iadd            
	//   66  131:istore          5
				} else
	//*  67  133:goto            108
				{
					if(layoutparams.mSpan.mViews.size() == 1)
	//*  68  136:aload           8
	//*  69  138:getfield        #224 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//*  70  141:getfield        #247 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//*  71  144:invokevirtual   #252 <Method int ArrayList.size()>
	//*  72  147:iconst_1        
	//*  73  148:icmpne          152
						return;
	//   74  151:return          
					layoutparams.mSpan.popEnd();
	//   75  152:aload           8
	//   76  154:getfield        #224 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//   77  157:invokevirtual   #682 <Method void StaggeredGridLayoutManager$Span.popEnd()>
				}
				removeAndRecycleView(view, recycler);
	//   78  160:aload_0         
	//   79  161:aload           7
	//   80  163:aload_1         
	//   81  164:invokevirtual   #686 <Method void removeAndRecycleView(View, RecyclerView$Recycler)>
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
	//*   1    1:invokevirtual   #235 <Method int getChildCount()>
	//*   2    4:ifle            162
		{
			boolean flag = false;
	//    3    7:iconst_0        
	//    4    8:istore          5
			View view = getChildAt(0);
	//    5   10:aload_0         
	//    6   11:iconst_0        
	//    7   12:invokevirtual   #454 <Method View getChildAt(int)>
	//    8   15:astore          6
			if(mPrimaryOrientation.getDecoratedEnd(view) <= i && mPrimaryOrientation.getTransformedEndWithDecoration(view) <= i)
	//*   9   17:aload_0         
	//*  10   18:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//*  11   21:aload           6
	//*  12   23:invokevirtual   #689 <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  13   26:iload_2         
	//*  14   27:icmpgt          161
	//*  15   30:aload_0         
	//*  16   31:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//*  17   34:aload           6
	//*  18   36:invokevirtual   #692 <Method int OrientationHelper.getTransformedEndWithDecoration(View)>
	//*  19   39:iload_2         
	//*  20   40:icmpgt          161
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   21   43:aload           6
	//   22   45:invokevirtual   #351 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   23   48:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//   24   51:astore          7
				if(layoutparams.mFullSpan)
	//*  25   53:aload           7
	//*  26   55:getfield        #218 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
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
	//   34   69:getfield        #74  <Field int mSpanCount>
	//   35   72:icmpge          99
						if(mSpans[j].mViews.size() == 1)
	//*  36   75:aload_0         
	//*  37   76:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//*  38   79:iload_3         
	//*  39   80:aaload          
	//*  40   81:getfield        #247 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//*  41   84:invokevirtual   #252 <Method int ArrayList.size()>
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
	//*  52  102:getfield        #74  <Field int mSpanCount>
	//*  53  105:icmpge          151
						mSpans[k].popStart();
	//   54  108:aload_0         
	//   55  109:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   56  112:iload           4
	//   57  114:aaload          
	//   58  115:invokevirtual   #695 <Method void StaggeredGridLayoutManager$Span.popStart()>

	//   59  118:iload           4
	//   60  120:iconst_1        
	//   61  121:iadd            
	//   62  122:istore          4
				} else
	//*  63  124:goto            99
				{
					if(layoutparams.mSpan.mViews.size() == 1)
	//*  64  127:aload           7
	//*  65  129:getfield        #224 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//*  66  132:getfield        #247 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//*  67  135:invokevirtual   #252 <Method int ArrayList.size()>
	//*  68  138:iconst_1        
	//*  69  139:icmpne          143
						return;
	//   70  142:return          
					layoutparams.mSpan.popStart();
	//   71  143:aload           7
	//   72  145:getfield        #224 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//   73  148:invokevirtual   #695 <Method void StaggeredGridLayoutManager$Span.popStart()>
				}
				removeAndRecycleView(view, recycler);
	//   74  151:aload_0         
	//   75  152:aload           6
	//   76  154:aload_1         
	//   77  155:invokevirtual   #686 <Method void removeAndRecycleView(View, RecyclerView$Recycler)>
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
	//*   1    1:getfield        #310 <Field OrientationHelper mSecondaryOrientation>
	//*   2    4:invokevirtual   #698 <Method int OrientationHelper.getMode()>
	//*   3    7:ldc2            #699 <Int 0x40000000>
	//*   4   10:icmpne          14
			return;
	//    5   13:return          
		int i1 = getChildCount();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #235 <Method int getChildCount()>
	//    8   18:istore          7
		boolean flag = false;
	//    9   20:iconst_0        
	//   10   21:istore          5
		int i = 0;
	//   11   23:iconst_0        
	//   12   24:istore          4
		float f = 0.0F;
	//   13   26:fconst_0        
	//   14   27:fstore_1        
		for(; i < i1; i++)
	//*  15   28:iload           4
	//*  16   30:iload           7
	//*  17   32:icmpge          104
		{
			View view = getChildAt(i);
	//   18   35:aload_0         
	//   19   36:iload           4
	//   20   38:invokevirtual   #454 <Method View getChildAt(int)>
	//   21   41:astore          9
			float f2 = mSecondaryOrientation.getDecoratedMeasurement(view);
	//   22   43:aload_0         
	//   23   44:getfield        #310 <Field OrientationHelper mSecondaryOrientation>
	//   24   47:aload           9
	//   25   49:invokevirtual   #382 <Method int OrientationHelper.getDecoratedMeasurement(View)>
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
	//*  36   67:invokevirtual   #351 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  37   70:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//*  38   73:invokevirtual   #702 <Method boolean StaggeredGridLayoutManager$LayoutParams.isFullSpan()>
	//*  39   76:ifeq            89
				f1 = (f2 * 1.0F) / (float)mSpanCount;
	//   40   79:fload_3         
	//   41   80:fconst_1        
	//   42   81:fmul            
	//   43   82:aload_0         
	//   44   83:getfield        #74  <Field int mSpanCount>
	//   45   86:i2f             
	//   46   87:fdiv            
	//   47   88:fstore_2        
			f = Math.max(f, f1);
	//   48   89:fload_1         
	//   49   90:fload_2         
	//   50   91:invokestatic    #706 <Method float Math.max(float, float)>
	//   51   94:fstore_1        
		}

	//   52   95:iload           4
	//   53   97:iconst_1        
	//   54   98:iadd            
	//   55   99:istore          4
	//*  56  101:goto            28
		int j1 = mSizePerSpan;
	//   57  104:aload_0         
	//   58  105:getfield        #421 <Field int mSizePerSpan>
	//   59  108:istore          8
		int k = Math.round(f * (float)mSpanCount);
	//   60  110:fload_1         
	//   61  111:aload_0         
	//   62  112:getfield        #74  <Field int mSpanCount>
	//   63  115:i2f             
	//   64  116:fmul            
	//   65  117:invokestatic    #710 <Method int Math.round(float)>
	//   66  120:istore          6
		i = k;
	//   67  122:iload           6
	//   68  124:istore          4
		if(mSecondaryOrientation.getMode() == 0x80000000)
	//*  69  126:aload_0         
	//*  70  127:getfield        #310 <Field OrientationHelper mSecondaryOrientation>
	//*  71  130:invokevirtual   #698 <Method int OrientationHelper.getMode()>
	//*  72  133:ldc1            #81  <Int 0x80000000>
	//*  73  135:icmpne          152
			i = Math.min(k, mSecondaryOrientation.getTotalSpace());
	//   74  138:iload           6
	//   75  140:aload_0         
	//   76  141:getfield        #310 <Field OrientationHelper mSecondaryOrientation>
	//   77  144:invokevirtual   #623 <Method int OrientationHelper.getTotalSpace()>
	//   78  147:invokestatic    #449 <Method int Math.min(int, int)>
	//   79  150:istore          4
		updateMeasureSpecs(i);
	//   80  152:aload_0         
	//   81  153:iload           4
	//   82  155:invokevirtual   #626 <Method void updateMeasureSpecs(int)>
		i = ((int) (flag));
	//   83  158:iload           5
	//   84  160:istore          4
		if(mSizePerSpan == j1)
	//*  85  162:aload_0         
	//*  86  163:getfield        #421 <Field int mSizePerSpan>
	//*  87  166:iload           8
	//*  88  168:icmpne          172
			return;
	//   89  171:return          
		for(; i < i1; i++)
	//*  90  172:iload           4
	//*  91  174:iload           7
	//*  92  176:icmpge          340
		{
			View view1 = getChildAt(i);
	//   93  179:aload_0         
	//   94  180:iload           4
	//   95  182:invokevirtual   #454 <Method View getChildAt(int)>
	//   96  185:astore          9
			LayoutParams layoutparams = (LayoutParams)view1.getLayoutParams();
	//   97  187:aload           9
	//   98  189:invokevirtual   #351 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   99  192:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//  100  195:astore          10
			if(layoutparams.mFullSpan)
	//* 101  197:aload           10
	//* 102  199:getfield        #218 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//* 103  202:ifeq            208
				continue;
	//  104  205:goto            331
			if(isLayoutRTL() && mOrientation == 1)
	//* 105  208:aload_0         
	//* 106  209:invokevirtual   #293 <Method boolean isLayoutRTL()>
	//* 107  212:ifeq            272
	//* 108  215:aload_0         
	//* 109  216:getfield        #289 <Field int mOrientation>
	//* 110  219:iconst_1        
	//* 111  220:icmpne          272
			{
				view1.offsetLeftAndRight(-(mSpanCount - 1 - layoutparams.mSpan.mIndex) * mSizePerSpan - -(mSpanCount - 1 - layoutparams.mSpan.mIndex) * j1);
	//  112  223:aload           9
	//  113  225:aload_0         
	//  114  226:getfield        #74  <Field int mSpanCount>
	//  115  229:iconst_1        
	//  116  230:isub            
	//  117  231:aload           10
	//  118  233:getfield        #224 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//  119  236:getfield        #419 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//  120  239:isub            
	//  121  240:ineg            
	//  122  241:aload_0         
	//  123  242:getfield        #421 <Field int mSizePerSpan>
	//  124  245:imul            
	//  125  246:aload_0         
	//  126  247:getfield        #74  <Field int mSpanCount>
	//  127  250:iconst_1        
	//  128  251:isub            
	//  129  252:aload           10
	//  130  254:getfield        #224 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//  131  257:getfield        #419 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//  132  260:isub            
	//  133  261:ineg            
	//  134  262:iload           8
	//  135  264:imul            
	//  136  265:isub            
	//  137  266:invokevirtual   #713 <Method void View.offsetLeftAndRight(int)>
				continue;
	//  138  269:goto            331
			}
			int j = layoutparams.mSpan.mIndex * mSizePerSpan;
	//  139  272:aload           10
	//  140  274:getfield        #224 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//  141  277:getfield        #419 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//  142  280:aload_0         
	//  143  281:getfield        #421 <Field int mSizePerSpan>
	//  144  284:imul            
	//  145  285:istore          5
			int l = layoutparams.mSpan.mIndex * j1;
	//  146  287:aload           10
	//  147  289:getfield        #224 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//  148  292:getfield        #419 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//  149  295:iload           8
	//  150  297:imul            
	//  151  298:istore          6
			if(mOrientation == 1)
	//* 152  300:aload_0         
	//* 153  301:getfield        #289 <Field int mOrientation>
	//* 154  304:iconst_1        
	//* 155  305:icmpne          321
				view1.offsetLeftAndRight(j - l);
	//  156  308:aload           9
	//  157  310:iload           5
	//  158  312:iload           6
	//  159  314:isub            
	//  160  315:invokevirtual   #713 <Method void View.offsetLeftAndRight(int)>
			else
	//* 161  318:goto            331
				view1.offsetTopAndBottom(j - l);
	//  162  321:aload           9
	//  163  323:iload           5
	//  164  325:iload           6
	//  165  327:isub            
	//  166  328:invokevirtual   #716 <Method void View.offsetTopAndBottom(int)>
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
	//*   1    1:getfield        #289 <Field int mOrientation>
	//*   2    4:iconst_1        
	//*   3    5:icmpeq          29
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #293 <Method boolean isLayoutRTL()>
	//*   6   12:ifne            18
	//*   7   15:goto            29
		{
			mShouldReverseLayout = mReverseLayout ^ true;
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #76  <Field boolean mReverseLayout>
	//   11   23:iconst_1        
	//   12   24:ixor            
	//   13   25:putfield        #78  <Field boolean mShouldReverseLayout>
			return;
	//   14   28:return          
		} else
		{
			mShouldReverseLayout = mReverseLayout;
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #76  <Field boolean mReverseLayout>
	//   18   34:putfield        #78  <Field boolean mShouldReverseLayout>
			return;
	//   19   37:return          
		}
	}

	private void setLayoutStateDirection(int i)
	{
		LayoutState layoutstate = mLayoutState;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field LayoutState mLayoutState>
	//    2    4:astore          5
		layoutstate.mLayoutDirection = i;
	//    3    6:aload           5
	//    4    8:iload_1         
	//    5    9:putfield        #215 <Field int LayoutState.mLayoutDirection>
		boolean flag2 = mShouldReverseLayout;
	//    6   12:aload_0         
	//    7   13:getfield        #78  <Field boolean mShouldReverseLayout>
	//    8   16:istore          4
		boolean flag = true;
	//    9   18:iconst_1        
	//   10   19:istore_2        
		boolean flag1;
		if(i == -1)
	//*  11   20:iload_1         
	//*  12   21:iconst_m1       
	//*  13   22:icmpne          30
			flag1 = true;
	//   14   25:iconst_1        
	//   15   26:istore_3        
		else
	//*  16   27:goto            32
			flag1 = false;
	//   17   30:iconst_0        
	//   18   31:istore_3        
		if(flag2 == flag1)
	//*  19   32:iload           4
	//*  20   34:iload_3         
	//*  21   35:icmpne          43
			i = ((int) (flag));
	//   22   38:iload_2         
	//   23   39:istore_1        
		else
	//*  24   40:goto            45
			i = -1;
	//   25   43:iconst_m1       
	//   26   44:istore_1        
		layoutstate.mItemDirection = i;
	//   27   45:aload           5
	//   28   47:iload_1         
	//   29   48:putfield        #402 <Field int LayoutState.mItemDirection>
	//   30   51:return          
	}

	private void updateAllRemainingSpans(int i, int j)
	{
		for(int k = 0; k < mSpanCount; k++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_0         
	//*   4    4:getfield        #74  <Field int mSpanCount>
	//*   5    7:icmpge          47
			if(!mSpans[k].mViews.isEmpty())
	//*   6   10:aload_0         
	//*   7   11:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//*   8   14:iload_3         
	//*   9   15:aaload          
	//*  10   16:getfield        #247 <Field ArrayList StaggeredGridLayoutManager$Span.mViews>
	//*  11   19:invokevirtual   #717 <Method boolean ArrayList.isEmpty()>
	//*  12   22:ifeq            28
	//*  13   25:goto            40
				updateRemainingSpans(mSpans[k], i, j);
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   17   33:iload_3         
	//   18   34:aaload          
	//   19   35:iload_1         
	//   20   36:iload_2         
	//   21   37:invokespecial   #429 <Method void updateRemainingSpans(StaggeredGridLayoutManager$Span, int, int)>

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
	//*   1    1:getfield        #596 <Field boolean mLastLayoutFromEnd>
	//*   2    4:ifeq            19
			i = findLastReferenceChildPosition(state.getItemCount());
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #578 <Method int RecyclerView$State.getItemCount()>
	//    6   12:invokespecial   #721 <Method int findLastReferenceChildPosition(int)>
	//    7   15:istore_3        
		else
	//*   8   16:goto            28
			i = findFirstReferenceChildPosition(state.getItemCount());
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #578 <Method int RecyclerView$State.getItemCount()>
	//   12   24:invokespecial   #723 <Method int findFirstReferenceChildPosition(int)>
	//   13   27:istore_3        
		anchorinfo.mPosition = i;
	//   14   28:aload_2         
	//   15   29:iload_3         
	//   16   30:putfield        #627 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
		anchorinfo.mOffset = 0x80000000;
	//   17   33:aload_2         
	//   18   34:ldc1            #81  <Int 0x80000000>
	//   19   36:putfield        #603 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
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
	//    1    1:getfield        #136 <Field LayoutState mLayoutState>
	//    2    4:astore          7
			flag2 = false;
	//    3    6:iconst_0        
	//    4    7:istore          5
			layoutstate.mAvailable = 0;
	//    5    9:aload           7
	//    6   11:iconst_0        
	//    7   12:putfield        #330 <Field int LayoutState.mAvailable>
			layoutstate.mCurrentPosition = i;
	//    8   15:aload           7
	//    9   17:iload_1         
	//   10   18:putfield        #639 <Field int LayoutState.mCurrentPosition>
			if(isSmoothScrolling())
	//*  11   21:aload_0         
	//*  12   22:invokevirtual   #726 <Method boolean isSmoothScrolling()>
	//*  13   25:ifeq            91
			{
				j = state.getTargetScrollPosition();
	//   14   28:aload_2         
	//   15   29:invokevirtual   #729 <Method int RecyclerView$State.getTargetScrollPosition()>
	//   16   32:istore_3        
				if(j != -1)
	//*  17   33:iload_3         
	//*  18   34:iconst_m1       
	//*  19   35:icmpeq          91
				{
					boolean flag3 = mShouldReverseLayout;
	//   20   38:aload_0         
	//   21   39:getfield        #78  <Field boolean mShouldReverseLayout>
	//   22   42:istore          6
					boolean flag;
					if(j < i)
	//*  23   44:iload_3         
	//*  24   45:iload_1         
	//*  25   46:icmpge          55
						flag = true;
	//   26   49:iconst_1        
	//   27   50:istore          4
					else
	//*  28   52:goto            58
						flag = false;
	//   29   55:iconst_0        
	//   30   56:istore          4
					if(flag3 == flag)
	//*  31   58:iload           6
	//*  32   60:iload           4
	//*  33   62:icmpne          78
					{
						i = mPrimaryOrientation.getTotalSpace();
	//   34   65:aload_0         
	//   35   66:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//   36   69:invokevirtual   #623 <Method int OrientationHelper.getTotalSpace()>
	//   37   72:istore_1        
						j = 0;
	//   38   73:iconst_0        
	//   39   74:istore_3        
					} else
	//*  40   75:goto            95
					{
						j = mPrimaryOrientation.getTotalSpace();
	//   41   78:aload_0         
	//   42   79:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//   43   82:invokevirtual   #623 <Method int OrientationHelper.getTotalSpace()>
	//   44   85:istore_3        
						i = 0;
	//   45   86:iconst_0        
	//   46   87:istore_1        
					}
					break label0;
	//   47   88:goto            95
				}
			}
			i = 0;
	//   48   91:iconst_0        
	//   49   92:istore_1        
			j = 0;
	//   50   93:iconst_0        
	//   51   94:istore_3        
		}
		if(getClipToPadding())
	//*  52   95:aload_0         
	//*  53   96:invokevirtual   #732 <Method boolean getClipToPadding()>
	//*  54   99:ifeq            137
		{
			mLayoutState.mStartLine = mPrimaryOrientation.getStartAfterPadding() - j;
	//   55  102:aload_0         
	//   56  103:getfield        #136 <Field LayoutState mLayoutState>
	//   57  106:aload_0         
	//   58  107:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//   59  110:invokevirtual   #174 <Method int OrientationHelper.getStartAfterPadding()>
	//   60  113:iload_3         
	//   61  114:isub            
	//   62  115:putfield        #333 <Field int LayoutState.mStartLine>
			mLayoutState.mEndLine = mPrimaryOrientation.getEndAfterPadding() + i;
	//   63  118:aload_0         
	//   64  119:getfield        #136 <Field LayoutState mLayoutState>
	//   65  122:aload_0         
	//   66  123:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//   67  126:invokevirtual   #171 <Method int OrientationHelper.getEndAfterPadding()>
	//   68  129:iload_1         
	//   69  130:iadd            
	//   70  131:putfield        #327 <Field int LayoutState.mEndLine>
		} else
	//*  71  134:goto            162
		{
			mLayoutState.mEndLine = mPrimaryOrientation.getEnd() + i;
	//   72  137:aload_0         
	//   73  138:getfield        #136 <Field LayoutState mLayoutState>
	//   74  141:aload_0         
	//   75  142:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//   76  145:invokevirtual   #735 <Method int OrientationHelper.getEnd()>
	//   77  148:iload_1         
	//   78  149:iadd            
	//   79  150:putfield        #327 <Field int LayoutState.mEndLine>
			mLayoutState.mStartLine = -j;
	//   80  153:aload_0         
	//   81  154:getfield        #136 <Field LayoutState mLayoutState>
	//   82  157:iload_3         
	//   83  158:ineg            
	//   84  159:putfield        #333 <Field int LayoutState.mStartLine>
		}
		state = ((RecyclerView.State) (mLayoutState));
	//   85  162:aload_0         
	//   86  163:getfield        #136 <Field LayoutState mLayoutState>
	//   87  166:astore_2        
		state.mStopInFocusable = false;
	//   88  167:aload_2         
	//   89  168:iconst_0        
	//   90  169:putfield        #436 <Field boolean LayoutState.mStopInFocusable>
		state.mRecycle = true;
	//   91  172:aload_2         
	//   92  173:iconst_1        
	//   93  174:putfield        #620 <Field boolean LayoutState.mRecycle>
		boolean flag1 = flag2;
	//   94  177:iload           5
	//   95  179:istore          4
		if(mPrimaryOrientation.getMode() == 0)
	//*  96  181:aload_0         
	//*  97  182:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//*  98  185:invokevirtual   #698 <Method int OrientationHelper.getMode()>
	//*  99  188:ifne            208
		{
			flag1 = flag2;
	//  100  191:iload           5
	//  101  193:istore          4
			if(mPrimaryOrientation.getEnd() == 0)
	//* 102  195:aload_0         
	//* 103  196:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//* 104  199:invokevirtual   #735 <Method int OrientationHelper.getEnd()>
	//* 105  202:ifne            208
				flag1 = true;
	//  106  205:iconst_1        
	//  107  206:istore          4
		}
		state.mInfinite = flag1;
	//  108  208:aload_2         
	//  109  209:iload           4
	//  110  211:putfield        #323 <Field boolean LayoutState.mInfinite>
	//  111  214:return          
	}

	private void updateRemainingSpans(Span span, int i, int j)
	{
		int k = span.getDeletedSize();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #738 <Method int StaggeredGridLayoutManager$Span.getDeletedSize()>
	//    2    4:istore          4
		if(i == -1)
	//*   3    6:iload_2         
	//*   4    7:iconst_m1       
	//*   5    8:icmpne          35
		{
			if(span.getStartLine() + k <= j)
	//*   6   11:aload_1         
	//*   7   12:invokevirtual   #265 <Method int StaggeredGridLayoutManager$Span.getStartLine()>
	//*   8   15:iload           4
	//*   9   17:iadd            
	//*  10   18:iload_3         
	//*  11   19:icmpgt          58
			{
				mRemainingSpans.set(span.mIndex, false);
	//   12   22:aload_0         
	//   13   23:getfield        #314 <Field BitSet mRemainingSpans>
	//   14   26:aload_1         
	//   15   27:getfield        #419 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//   16   30:iconst_0        
	//   17   31:invokevirtual   #443 <Method void BitSet.set(int, boolean)>
				return;
	//   18   34:return          
			}
		} else
		if(span.getEndLine() - k >= j)
	//*  19   35:aload_1         
	//*  20   36:invokevirtual   #243 <Method int StaggeredGridLayoutManager$Span.getEndLine()>
	//*  21   39:iload           4
	//*  22   41:isub            
	//*  23   42:iload_3         
	//*  24   43:icmplt          58
			mRemainingSpans.set(span.mIndex, false);
	//   25   46:aload_0         
	//   26   47:getfield        #314 <Field BitSet mRemainingSpans>
	//   27   50:aload_1         
	//   28   51:getfield        #419 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//   29   54:iconst_0        
	//   30   55:invokevirtual   #443 <Method void BitSet.set(int, boolean)>
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
	//    7   11:invokestatic    #742 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    8   14:istore          4
		if(l != 0x80000000 && l != 0x40000000)
	//*   9   16:iload           4
	//*  10   18:ldc1            #81  <Int 0x80000000>
	//*  11   20:icmpeq          36
	//*  12   23:iload           4
	//*  13   25:ldc2            #699 <Int 0x40000000>
	//*  14   28:icmpne          34
	//*  15   31:goto            36
			return i;
	//   16   34:iload_1         
	//   17   35:ireturn         
		else
			return android.view.View.MeasureSpec.makeMeasureSpec(Math.max(0, android.view.View.MeasureSpec.getSize(i) - j - k), l);
	//   18   36:iconst_0        
	//   19   37:iload_1         
	//   20   38:invokestatic    #745 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   21   41:iload_2         
	//   22   42:isub            
	//   23   43:iload_3         
	//   24   44:isub            
	//   25   45:invokestatic    #747 <Method int Math.max(int, int)>
	//   26   48:iload           4
	//   27   50:invokestatic    #750 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   28   53:ireturn         
	}

	boolean areAllEndsEqual()
	{
		int j = mSpans[0].getEndLine(0x80000000);
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:ldc1            #81  <Int 0x80000000>
	//    5    8:invokevirtual   #301 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
	//    6   11:istore_2        
		for(int i = 1; i < mSpanCount; i++)
	//*   7   12:iconst_1        
	//*   8   13:istore_1        
	//*   9   14:iload_1         
	//*  10   15:aload_0         
	//*  11   16:getfield        #74  <Field int mSpanCount>
	//*  12   19:icmpge          46
			if(mSpans[i].getEndLine(0x80000000) != j)
	//*  13   22:aload_0         
	//*  14   23:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//*  15   26:iload_1         
	//*  16   27:aaload          
	//*  17   28:ldc1            #81  <Int 0x80000000>
	//*  18   30:invokevirtual   #301 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
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
	//    1    1:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:ldc1            #81  <Int 0x80000000>
	//    5    8:invokevirtual   #304 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
	//    6   11:istore_2        
		for(int i = 1; i < mSpanCount; i++)
	//*   7   12:iconst_1        
	//*   8   13:istore_1        
	//*   9   14:iload_1         
	//*  10   15:aload_0         
	//*  11   16:getfield        #74  <Field int mSpanCount>
	//*  12   19:icmpge          46
			if(mSpans[i].getStartLine(0x80000000) != j)
	//*  13   22:aload_0         
	//*  14   23:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//*  15   26:iload_1         
	//*  16   27:aaload          
	//*  17   28:ldc1            #81  <Int 0x80000000>
	//*  18   30:invokevirtual   #304 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
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
	//*   1    1:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*   2    4:ifnonnull       12
			super.assertNotInLayoutOrScroll(s);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #754 <Method void RecyclerView$LayoutManager.assertNotInLayoutOrScroll(String)>
	//    6   12:return          
	}

	public boolean canScrollHorizontally()
	{
		return mOrientation == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #289 <Field int mOrientation>
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
	//    1    1:getfield        #289 <Field int mOrientation>
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
	//*   1    1:invokevirtual   #235 <Method int getChildCount()>
	//*   2    4:ifeq            211
	//*   3    7:aload_0         
	//*   4    8:getfield        #88  <Field int mGapStrategy>
	//*   5   11:ifeq            211
		{
			if(!isAttachedToWindow())
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #759 <Method boolean isAttachedToWindow()>
	//*   8   18:ifne            23
				return false;
	//    9   21:iconst_0        
	//   10   22:ireturn         
			int i;
			int j;
			if(mShouldReverseLayout)
	//*  11   23:aload_0         
	//*  12   24:getfield        #78  <Field boolean mShouldReverseLayout>
	//*  13   27:ifeq            43
			{
				i = getLastChildPosition();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #479 <Method int getLastChildPosition()>
	//   16   34:istore_1        
				j = getFirstChildPosition();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #238 <Method int getFirstChildPosition()>
	//   19   39:istore_2        
			} else
	//*  20   40:goto            53
			{
				i = getFirstChildPosition();
	//   21   43:aload_0         
	//   22   44:invokevirtual   #238 <Method int getFirstChildPosition()>
	//   23   47:istore_1        
				j = getLastChildPosition();
	//   24   48:aload_0         
	//   25   49:invokevirtual   #479 <Method int getLastChildPosition()>
	//   26   52:istore_2        
			}
			if(i == 0 && hasGapsToFix() != null)
	//*  27   53:iload_1         
	//*  28   54:ifne            81
	//*  29   57:aload_0         
	//*  30   58:invokevirtual   #653 <Method View hasGapsToFix()>
	//*  31   61:ifnull          81
			{
				mLazySpanLookup.clear();
	//   32   64:aload_0         
	//   33   65:getfield        #86  <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   34   68:invokevirtual   #597 <Method void StaggeredGridLayoutManager$LazySpanLookup.clear()>
				requestSimpleAnimationsInNextLayout();
	//   35   71:aload_0         
	//   36   72:invokevirtual   #762 <Method void requestSimpleAnimationsInNextLayout()>
				requestLayout();
	//   37   75:aload_0         
	//   38   76:invokevirtual   #491 <Method void requestLayout()>
				return true;
	//   39   79:iconst_1        
	//   40   80:ireturn         
			}
			if(!mLaidOutInvalidFullSpan)
	//*  41   81:aload_0         
	//*  42   82:getfield        #100 <Field boolean mLaidOutInvalidFullSpan>
	//*  43   85:ifne            90
				return false;
	//   44   88:iconst_0        
	//   45   89:ireturn         
			byte byte0;
			if(mShouldReverseLayout)
	//*  46   90:aload_0         
	//*  47   91:getfield        #78  <Field boolean mShouldReverseLayout>
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
	//   55  105:getfield        #86  <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
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
	//   66  120:invokevirtual   #766 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem StaggeredGridLayoutManager$LazySpanLookup.getFirstFullSpanItemInRange(int, int, int, boolean)>
	//   67  123:astore          4
			if(obj == null)
	//*  68  125:aload           4
	//*  69  127:ifnonnull       146
			{
				mLaidOutInvalidFullSpan = false;
	//   70  130:aload_0         
	//   71  131:iconst_0        
	//   72  132:putfield        #100 <Field boolean mLaidOutInvalidFullSpan>
				mLazySpanLookup.forceInvalidateAfter(j);
	//   73  135:aload_0         
	//   74  136:getfield        #86  <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   75  139:iload_2         
	//   76  140:invokevirtual   #769 <Method int StaggeredGridLayoutManager$LazySpanLookup.forceInvalidateAfter(int)>
	//   77  143:pop             
				return false;
	//   78  144:iconst_0        
	//   79  145:ireturn         
			}
			LazySpanLookup.FullSpanItem fullspanitem = mLazySpanLookup.getFirstFullSpanItemInRange(i, ((LazySpanLookup.FullSpanItem) (obj)).mPosition, byte0 * -1, true);
	//   80  146:aload_0         
	//   81  147:getfield        #86  <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   82  150:iload_1         
	//   83  151:aload           4
	//   84  153:getfield        #390 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//   85  156:iload_3         
	//   86  157:iconst_m1       
	//   87  158:imul            
	//   88  159:iconst_1        
	//   89  160:invokevirtual   #766 <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem StaggeredGridLayoutManager$LazySpanLookup.getFirstFullSpanItemInRange(int, int, int, boolean)>
	//   90  163:astore          5
			if(fullspanitem == null)
	//*  91  165:aload           5
	//*  92  167:ifnonnull       186
				mLazySpanLookup.forceInvalidateAfter(((LazySpanLookup.FullSpanItem) (obj)).mPosition);
	//   93  170:aload_0         
	//   94  171:getfield        #86  <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   95  174:aload           4
	//   96  176:getfield        #390 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//   97  179:invokevirtual   #769 <Method int StaggeredGridLayoutManager$LazySpanLookup.forceInvalidateAfter(int)>
	//   98  182:pop             
			else
	//*  99  183:goto            201
				mLazySpanLookup.forceInvalidateAfter(fullspanitem.mPosition + 1);
	//  100  186:aload_0         
	//  101  187:getfield        #86  <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//  102  190:aload           5
	//  103  192:getfield        #390 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//  104  195:iconst_1        
	//  105  196:iadd            
	//  106  197:invokevirtual   #769 <Method int StaggeredGridLayoutManager$LazySpanLookup.forceInvalidateAfter(int)>
	//  107  200:pop             
			requestSimpleAnimationsInNextLayout();
	//  108  201:aload_0         
	//  109  202:invokevirtual   #762 <Method void requestSimpleAnimationsInNextLayout()>
			requestLayout();
	//  110  205:aload_0         
	//  111  206:invokevirtual   #491 <Method void requestLayout()>
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
	//*   1    1:getfield        #289 <Field int mOrientation>
	//*   2    4:ifne            10
	//*   3    7:goto            12
			i = j;
	//    4   10:iload_2         
	//    5   11:istore_1        
		if(getChildCount() != 0)
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #235 <Method int getChildCount()>
	//*   8   16:ifeq            253
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
	//   15   27:invokevirtual   #780 <Method void prepareLayoutStateForDelta(int, RecyclerView$State)>
			int ai[] = mPrefetchDistances;
	//   16   30:aload_0         
	//   17   31:getfield        #782 <Field int[] mPrefetchDistances>
	//   18   34:astore          8
			if(ai == null || ai.length < mSpanCount)
	//*  19   36:aload           8
	//*  20   38:ifnull          51
	//*  21   41:aload           8
	//*  22   43:arraylength     
	//*  23   44:aload_0         
	//*  24   45:getfield        #74  <Field int mSpanCount>
	//*  25   48:icmpge          61
				mPrefetchDistances = new int[mSpanCount];
	//   26   51:aload_0         
	//   27   52:aload_0         
	//   28   53:getfield        #74  <Field int mSpanCount>
	//   29   56:newarray        int[]
	//   30   58:putfield        #782 <Field int[] mPrefetchDistances>
			boolean flag = false;
	//   31   61:iconst_0        
	//   32   62:istore          7
			j = 0;
	//   33   64:iconst_0        
	//   34   65:istore_2        
			int k;
			for(i = 0; j < mSpanCount; i = k)
	//*  35   66:iconst_0        
	//*  36   67:istore_1        
	//*  37   68:iload_2         
	//*  38   69:aload_0         
	//*  39   70:getfield        #74  <Field int mSpanCount>
	//*  40   73:icmpge          173
			{
				int l;
				if(mLayoutState.mItemDirection == -1)
	//*  41   76:aload_0         
	//*  42   77:getfield        #136 <Field LayoutState mLayoutState>
	//*  43   80:getfield        #402 <Field int LayoutState.mItemDirection>
	//*  44   83:iconst_m1       
	//*  45   84:icmpne          116
					l = mLayoutState.mStartLine - mSpans[j].getStartLine(mLayoutState.mStartLine);
	//   46   87:aload_0         
	//   47   88:getfield        #136 <Field LayoutState mLayoutState>
	//   48   91:getfield        #333 <Field int LayoutState.mStartLine>
	//   49   94:aload_0         
	//   50   95:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   51   98:iload_2         
	//   52   99:aaload          
	//   53  100:aload_0         
	//   54  101:getfield        #136 <Field LayoutState mLayoutState>
	//   55  104:getfield        #333 <Field int LayoutState.mStartLine>
	//   56  107:invokevirtual   #304 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
	//   57  110:isub            
	//   58  111:istore          6
				else
	//*  59  113:goto            142
					l = mSpans[j].getEndLine(mLayoutState.mEndLine) - mLayoutState.mEndLine;
	//   60  116:aload_0         
	//   61  117:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   62  120:iload_2         
	//   63  121:aaload          
	//   64  122:aload_0         
	//   65  123:getfield        #136 <Field LayoutState mLayoutState>
	//   66  126:getfield        #327 <Field int LayoutState.mEndLine>
	//   67  129:invokevirtual   #301 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
	//   68  132:aload_0         
	//   69  133:getfield        #136 <Field LayoutState mLayoutState>
	//   70  136:getfield        #327 <Field int LayoutState.mEndLine>
	//   71  139:isub            
	//   72  140:istore          6
				k = i;
	//   73  142:iload_1         
	//   74  143:istore          5
				if(l >= 0)
	//*  75  145:iload           6
	//*  76  147:iflt            163
				{
					mPrefetchDistances[i] = l;
	//   77  150:aload_0         
	//   78  151:getfield        #782 <Field int[] mPrefetchDistances>
	//   79  154:iload_1         
	//   80  155:iload           6
	//   81  157:iastore         
					k = i + 1;
	//   82  158:iload_1         
	//   83  159:iconst_1        
	//   84  160:iadd            
	//   85  161:istore          5
				}
				j++;
	//   86  163:iload_2         
	//   87  164:iconst_1        
	//   88  165:iadd            
	//   89  166:istore_2        
			}

	//   90  167:iload           5
	//   91  169:istore_1        
	//*  92  170:goto            68
			Arrays.sort(mPrefetchDistances, 0, i);
	//   93  173:aload_0         
	//   94  174:getfield        #782 <Field int[] mPrefetchDistances>
	//   95  177:iconst_0        
	//   96  178:iload_1         
	//   97  179:invokestatic    #788 <Method void Arrays.sort(int[], int, int)>
			for(j = ((int) (flag)); j < i && mLayoutState.hasMore(state); j++)
	//*  98  182:iload           7
	//*  99  184:istore_2        
	//* 100  185:iload_2         
	//* 101  186:iload_1         
	//* 102  187:icmpge          252
	//* 103  190:aload_0         
	//* 104  191:getfield        #136 <Field LayoutState mLayoutState>
	//* 105  194:aload_3         
	//* 106  195:invokevirtual   #341 <Method boolean LayoutState.hasMore(RecyclerView$State)>
	//* 107  198:ifeq            252
			{
				layoutprefetchregistry.addPosition(mLayoutState.mCurrentPosition, mPrefetchDistances[j]);
	//  108  201:aload           4
	//  109  203:aload_0         
	//  110  204:getfield        #136 <Field LayoutState mLayoutState>
	//  111  207:getfield        #639 <Field int LayoutState.mCurrentPosition>
	//  112  210:aload_0         
	//  113  211:getfield        #782 <Field int[] mPrefetchDistances>
	//  114  214:iload_2         
	//  115  215:iaload          
	//  116  216:invokeinterface #793 <Method void RecyclerView$LayoutManager$LayoutPrefetchRegistry.addPosition(int, int)>
				LayoutState layoutstate = mLayoutState;
	//  117  221:aload_0         
	//  118  222:getfield        #136 <Field LayoutState mLayoutState>
	//  119  225:astore          8
				layoutstate.mCurrentPosition = layoutstate.mCurrentPosition + mLayoutState.mItemDirection;
	//  120  227:aload           8
	//  121  229:aload           8
	//  122  231:getfield        #639 <Field int LayoutState.mCurrentPosition>
	//  123  234:aload_0         
	//  124  235:getfield        #136 <Field LayoutState mLayoutState>
	//  125  238:getfield        #402 <Field int LayoutState.mItemDirection>
	//  126  241:iadd            
	//  127  242:putfield        #639 <Field int LayoutState.mCurrentPosition>
			}

	//  128  245:iload_2         
	//  129  246:iconst_1        
	//  130  247:iadd            
	//  131  248:istore_2        
	//* 132  249:goto            185
			return;
	//  133  252:return          
		} else
		{
			return;
	//  134  253:return          
		}
	}

	public int computeHorizontalScrollExtent(RecyclerView.State state)
	{
		return computeScrollExtent(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #797 <Method int computeScrollExtent(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public int computeHorizontalScrollOffset(RecyclerView.State state)
	{
		return computeScrollOffset(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #800 <Method int computeScrollOffset(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public int computeHorizontalScrollRange(RecyclerView.State state)
	{
		return computeScrollRange(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #803 <Method int computeScrollRange(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public PointF computeScrollVectorForPosition(int i)
	{
		i = calculateScrollDirectionForPosition(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #807 <Method int calculateScrollDirectionForPosition(int)>
	//    3    5:istore_1        
		PointF pointf = new PointF();
	//    4    6:new             #809 <Class PointF>
	//    5    9:dup             
	//    6   10:invokespecial   #810 <Method void PointF()>
	//    7   13:astore_2        
		if(i == 0)
	//*   8   14:iload_1         
	//*   9   15:ifne            20
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		if(mOrientation == 0)
	//*  12   20:aload_0         
	//*  13   21:getfield        #289 <Field int mOrientation>
	//*  14   24:ifne            40
		{
			pointf.x = i;
	//   15   27:aload_2         
	//   16   28:iload_1         
	//   17   29:i2f             
	//   18   30:putfield        #814 <Field float PointF.x>
			pointf.y = 0.0F;
	//   19   33:aload_2         
	//   20   34:fconst_0        
	//   21   35:putfield        #817 <Field float PointF.y>
			return pointf;
	//   22   38:aload_2         
	//   23   39:areturn         
		} else
		{
			pointf.x = 0.0F;
	//   24   40:aload_2         
	//   25   41:fconst_0        
	//   26   42:putfield        #814 <Field float PointF.x>
			pointf.y = i;
	//   27   45:aload_2         
	//   28   46:iload_1         
	//   29   47:i2f             
	//   30   48:putfield        #817 <Field float PointF.y>
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
	//    2    2:invokespecial   #797 <Method int computeScrollExtent(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public int computeVerticalScrollOffset(RecyclerView.State state)
	{
		return computeScrollOffset(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #800 <Method int computeScrollOffset(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public int computeVerticalScrollRange(RecyclerView.State state)
	{
		return computeScrollRange(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #803 <Method int computeScrollRange(RecyclerView$State)>
	//    3    5:ireturn         
	}

	View findFirstVisibleItemClosestToEnd(boolean flag)
	{
		int j = mPrimaryOrientation.getStartAfterPadding();
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//    2    4:invokevirtual   #174 <Method int OrientationHelper.getStartAfterPadding()>
	//    3    7:istore_3        
		int k = mPrimaryOrientation.getEndAfterPadding();
	//    4    8:aload_0         
	//    5    9:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//    6   12:invokevirtual   #171 <Method int OrientationHelper.getEndAfterPadding()>
	//    7   15:istore          4
		int i = getChildCount() - 1;
	//    8   17:aload_0         
	//    9   18:invokevirtual   #235 <Method int getChildCount()>
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
	//   19   33:invokevirtual   #454 <Method View getChildAt(int)>
	//   20   36:astore          9
			int l = mPrimaryOrientation.getDecoratedStart(view2);
	//   21   38:aload_0         
	//   22   39:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//   23   42:aload           9
	//   24   44:invokevirtual   #676 <Method int OrientationHelper.getDecoratedStart(View)>
	//   25   47:istore          5
			int i1 = mPrimaryOrientation.getDecoratedEnd(view2);
	//   26   49:aload_0         
	//   27   50:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//   28   53:aload           9
	//   29   55:invokevirtual   #689 <Method int OrientationHelper.getDecoratedEnd(View)>
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
	//    1    1:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//    2    4:invokevirtual   #174 <Method int OrientationHelper.getStartAfterPadding()>
	//    3    7:istore_3        
		int k = mPrimaryOrientation.getEndAfterPadding();
	//    4    8:aload_0         
	//    5    9:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//    6   12:invokevirtual   #171 <Method int OrientationHelper.getEndAfterPadding()>
	//    7   15:istore          4
		int l = getChildCount();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #235 <Method int getChildCount()>
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
	//   20   36:invokevirtual   #454 <Method View getChildAt(int)>
	//   21   39:astore          9
			int i1 = mPrimaryOrientation.getDecoratedStart(view2);
	//   22   41:aload_0         
	//   23   42:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//   24   45:aload           9
	//   25   47:invokevirtual   #676 <Method int OrientationHelper.getDecoratedStart(View)>
	//   26   50:istore          6
			View view1 = view;
	//   27   52:aload           7
	//   28   54:astore          8
			if(mPrimaryOrientation.getDecoratedEnd(view2) > j)
	//*  29   56:aload_0         
	//*  30   57:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//*  31   60:aload           9
	//*  32   62:invokevirtual   #689 <Method int OrientationHelper.getDecoratedEnd(View)>
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
	//*   1    1:getfield        #78  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            16
			view = findFirstVisibleItemClosestToEnd(true);
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:invokevirtual   #274 <Method View findFirstVisibleItemClosestToEnd(boolean)>
	//    6   12:astore_1        
		else
	//*   7   13:goto            22
			view = findFirstVisibleItemClosestToStart(true);
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #271 <Method View findFirstVisibleItemClosestToStart(boolean)>
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
	//   18   30:invokevirtual   #457 <Method int getPosition(View)>
	//   19   33:ireturn         
	}

	public RecyclerView.LayoutParams generateDefaultLayoutParams()
	{
		if(mOrientation == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #289 <Field int mOrientation>
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
	//*   1    1:getfield        #289 <Field int mOrientation>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			return mSpanCount;
	//    4    8:aload_0         
	//    5    9:getfield        #74  <Field int mSpanCount>
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
	//*   1    1:invokevirtual   #235 <Method int getChildCount()>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return getPosition(getChildAt(0));
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #454 <Method View getChildAt(int)>
	//    9   15:invokevirtual   #457 <Method int getPosition(View)>
	//   10   18:ireturn         
	}

	int getLastChildPosition()
	{
		int i = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #235 <Method int getChildCount()>
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
	//   12   16:invokevirtual   #454 <Method View getChildAt(int)>
	//   13   19:invokevirtual   #457 <Method int getPosition(View)>
	//   14   22:ireturn         
	}

	public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(mOrientation == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #289 <Field int mOrientation>
	//*   2    4:ifne            12
			return mSpanCount;
	//    3    7:aload_0         
	//    4    8:getfield        #74  <Field int mSpanCount>
	//    5   11:ireturn         
		else
			return super.getRowCountForAccessibility(recycler, state);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokespecial   #846 <Method int RecyclerView$LayoutManager.getRowCountForAccessibility(RecyclerView$Recycler, RecyclerView$State)>
	//   10   18:ireturn         
	}

	View hasGapsToFix()
	{
		int i = getChildCount() - 1;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #235 <Method int getChildCount()>
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:istore_1        
		BitSet bitset = new BitSet(mSpanCount);
	//    5    7:new             #316 <Class BitSet>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:getfield        #74  <Field int mSpanCount>
	//    9   15:invokespecial   #848 <Method void BitSet(int)>
	//   10   18:astore          7
		bitset.set(0, mSpanCount, true);
	//   11   20:aload           7
	//   12   22:iconst_0        
	//   13   23:aload_0         
	//   14   24:getfield        #74  <Field int mSpanCount>
	//   15   27:iconst_1        
	//   16   28:invokevirtual   #320 <Method void BitSet.set(int, int, boolean)>
		int k = mOrientation;
	//   17   31:aload_0         
	//   18   32:getfield        #289 <Field int mOrientation>
	//   19   35:istore_2        
		byte byte0 = -1;
	//   20   36:iconst_m1       
	//   21   37:istore          5
		if(k == 1 && isLayoutRTL())
	//*  22   39:iload_2         
	//*  23   40:iconst_1        
	//*  24   41:icmpne          56
	//*  25   44:aload_0         
	//*  26   45:invokevirtual   #293 <Method boolean isLayoutRTL()>
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
	//*  34   59:getfield        #78  <Field boolean mShouldReverseLayout>
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
	//*  56   93:icmpeq          356
		{
			View view = getChildAt(i1);
	//   57   96:aload_0         
	//   58   97:iload           4
	//   59   99:invokevirtual   #454 <Method View getChildAt(int)>
	//   60  102:astore          8
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   61  104:aload           8
	//   62  106:invokevirtual   #351 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   63  109:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//   64  112:astore          9
			if(bitset.get(layoutparams.mSpan.mIndex))
	//*  65  114:aload           7
	//*  66  116:aload           9
	//*  67  118:getfield        #224 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//*  68  121:getfield        #419 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//*  69  124:invokevirtual   #850 <Method boolean BitSet.get(int)>
	//*  70  127:ifeq            158
			{
				if(checkSpanForGap(layoutparams.mSpan))
	//*  71  130:aload_0         
	//*  72  131:aload           9
	//*  73  133:getfield        #224 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//*  74  136:invokespecial   #852 <Method boolean checkSpanForGap(StaggeredGridLayoutManager$Span)>
	//*  75  139:ifeq            145
					return view;
	//   76  142:aload           8
	//   77  144:areturn         
				bitset.clear(layoutparams.mSpan.mIndex);
	//   78  145:aload           7
	//   79  147:aload           9
	//   80  149:getfield        #224 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//   81  152:getfield        #419 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//   82  155:invokevirtual   #854 <Method void BitSet.clear(int)>
			}
			if(layoutparams.mFullSpan)
	//*  83  158:aload           9
	//*  84  160:getfield        #218 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*  85  163:ifeq            169
				continue;
	//   86  166:goto            346
			int j = i1 + byte0;
	//   87  169:iload           4
	//   88  171:iload           5
	//   89  173:iadd            
	//   90  174:istore_1        
			if(j == l)
				continue;
	//   91  175:iload_1         
	//   92  176:iload_3         
	//   93  177:icmpeq          346
			Object obj = ((Object) (getChildAt(j)));
	//   94  180:aload_0         
	//   95  181:iload_1         
	//   96  182:invokevirtual   #454 <Method View getChildAt(int)>
	//   97  185:astore          10
			if(mShouldReverseLayout)
	//*  98  187:aload_0         
	//*  99  188:getfield        #78  <Field boolean mShouldReverseLayout>
	//* 100  191:ifeq            240
			{
				j = mPrimaryOrientation.getDecoratedEnd(view);
	//  101  194:aload_0         
	//  102  195:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//  103  198:aload           8
	//  104  200:invokevirtual   #689 <Method int OrientationHelper.getDecoratedEnd(View)>
	//  105  203:istore_1        
				int j1 = mPrimaryOrientation.getDecoratedEnd(((View) (obj)));
	//  106  204:aload_0         
	//  107  205:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//  108  208:aload           10
	//  109  210:invokevirtual   #689 <Method int OrientationHelper.getDecoratedEnd(View)>
	//  110  213:istore          6
				if(j < j1)
	//* 111  215:iload_1         
	//* 112  216:iload           6
	//* 113  218:icmpge          224
					return view;
	//  114  221:aload           8
	//  115  223:areturn         
				if(j == j1)
	//* 116  224:iload_1         
	//* 117  225:iload           6
	//* 118  227:icmpne          235
					j = 1;
	//  119  230:iconst_1        
	//  120  231:istore_1        
				else
	//* 121  232:goto            283
					j = 0;
	//  122  235:iconst_0        
	//  123  236:istore_1        
			} else
	//* 124  237:goto            283
			{
				j = mPrimaryOrientation.getDecoratedStart(view);
	//  125  240:aload_0         
	//  126  241:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//  127  244:aload           8
	//  128  246:invokevirtual   #676 <Method int OrientationHelper.getDecoratedStart(View)>
	//  129  249:istore_1        
				int k1 = mPrimaryOrientation.getDecoratedStart(((View) (obj)));
	//  130  250:aload_0         
	//  131  251:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//  132  254:aload           10
	//  133  256:invokevirtual   #676 <Method int OrientationHelper.getDecoratedStart(View)>
	//  134  259:istore          6
				if(j > k1)
	//* 135  261:iload_1         
	//* 136  262:iload           6
	//* 137  264:icmple          270
					return view;
	//  138  267:aload           8
	//  139  269:areturn         
				if(j == k1)
	//* 140  270:iload_1         
	//* 141  271:iload           6
	//* 142  273:icmpne          281
					j = 1;
	//  143  276:iconst_1        
	//  144  277:istore_1        
				else
	//* 145  278:goto            283
					j = 0;
	//  146  281:iconst_0        
	//  147  282:istore_1        
			}
			if(j == 0)
				continue;
	//  148  283:iload_1         
	//  149  284:ifeq            346
			obj = ((Object) ((LayoutParams)((View) (obj)).getLayoutParams()));
	//  150  287:aload           10
	//  151  289:invokevirtual   #351 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  152  292:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//  153  295:astore          10
			if(layoutparams.mSpan.mIndex - ((LayoutParams) (obj)).mSpan.mIndex < 0)
	//* 154  297:aload           9
	//* 155  299:getfield        #224 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//* 156  302:getfield        #419 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//* 157  305:aload           10
	//* 158  307:getfield        #224 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//* 159  310:getfield        #419 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//* 160  313:isub            
	//* 161  314:ifge            322
				j = 1;
	//  162  317:iconst_1        
	//  163  318:istore_1        
			else
	//* 164  319:goto            324
				j = 0;
	//  165  322:iconst_0        
	//  166  323:istore_1        
			boolean flag;
			if(k < 0)
	//* 167  324:iload_2         
	//* 168  325:ifge            334
				flag = true;
	//  169  328:iconst_1        
	//  170  329:istore          6
			else
	//* 171  331:goto            337
				flag = false;
	//  172  334:iconst_0        
	//  173  335:istore          6
			if(j != flag)
	//* 174  337:iload_1         
	//* 175  338:iload           6
	//* 176  340:icmpeq          346
				return view;
	//  177  343:aload           8
	//  178  345:areturn         
		}

	//  179  346:iload           4
	//  180  348:iload           5
	//  181  350:iadd            
	//  182  351:istore          4
	//* 183  353:goto            90
		return null;
	//  184  356:aconst_null     
	//  185  357:areturn         
	}

	public void invalidateSpanAssignments()
	{
		mLazySpanLookup.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//    2    4:invokevirtual   #597 <Method void StaggeredGridLayoutManager$LazySpanLookup.clear()>
		requestLayout();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #491 <Method void requestLayout()>
	//    5   11:return          
	}

	public boolean isAutoMeasureEnabled()
	{
		return mGapStrategy != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field int mGapStrategy>
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
	//    1    1:invokevirtual   #859 <Method int getLayoutDirection()>
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
	//    2    2:invokespecial   #862 <Method void RecyclerView$LayoutManager.offsetChildrenHorizontal(int)>
		for(int j = 0; j < mSpanCount; j++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:aload_0         
	//*   7    9:getfield        #74  <Field int mSpanCount>
	//*   8   12:icmpge          32
			mSpans[j].onOffset(i);
	//    9   15:aload_0         
	//   10   16:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   11   19:iload_2         
	//   12   20:aaload          
	//   13   21:iload_1         
	//   14   22:invokevirtual   #865 <Method void StaggeredGridLayoutManager$Span.onOffset(int)>

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
	//    2    2:invokespecial   #868 <Method void RecyclerView$LayoutManager.offsetChildrenVertical(int)>
		for(int j = 0; j < mSpanCount; j++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:aload_0         
	//*   7    9:getfield        #74  <Field int mSpanCount>
	//*   8   12:icmpge          32
			mSpans[j].onOffset(i);
	//    9   15:aload_0         
	//   10   16:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   11   19:iload_2         
	//   12   20:aaload          
	//   13   21:iload_1         
	//   14   22:invokevirtual   #865 <Method void StaggeredGridLayoutManager$Span.onOffset(int)>

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
	//    3    3:invokespecial   #872 <Method void RecyclerView$LayoutManager.onDetachedFromWindow(RecyclerView, RecyclerView$Recycler)>
		removeCallbacks(mCheckForGapsRunnable);
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:getfield        #105 <Field Runnable mCheckForGapsRunnable>
	//    7   11:invokevirtual   #657 <Method boolean removeCallbacks(Runnable)>
	//    8   14:pop             
		for(int i = 0; i < mSpanCount; i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_3        
	//*  11   17:iload_3         
	//*  12   18:aload_0         
	//*  13   19:getfield        #74  <Field int mSpanCount>
	//*  14   22:icmpge          41
			mSpans[i].clear();
	//   15   25:aload_0         
	//   16   26:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   17   29:iload_3         
	//   18   30:aaload          
	//   19   31:invokevirtual   #157 <Method void StaggeredGridLayoutManager$Span.clear()>

	//   20   34:iload_3         
	//   21   35:iconst_1        
	//   22   36:iadd            
	//   23   37:istore_3        
	//*  24   38:goto            17
		recyclerview.requestLayout();
	//   25   41:aload_1         
	//   26   42:invokevirtual   #875 <Method void RecyclerView.requestLayout()>
	//   27   45:return          
	}

	public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #235 <Method int getChildCount()>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		view = findContainingItemView(view);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #882 <Method View findContainingItemView(View)>
	//    8   14:astore_1        
		if(view == null)
	//*   9   15:aload_1         
	//*  10   16:ifnonnull       21
			return null;
	//   11   19:aconst_null     
	//   12   20:areturn         
		resolveShouldLayoutReverse();
	//   13   21:aload_0         
	//   14   22:invokespecial   #193 <Method void resolveShouldLayoutReverse()>
		int l1 = convertFocusDirectionToLayoutDirection(i);
	//   15   25:aload_0         
	//   16   26:iload_2         
	//   17   27:invokespecial   #884 <Method int convertFocusDirectionToLayoutDirection(int)>
	//   18   30:istore          7
		if(l1 == 0x80000000)
	//*  19   32:iload           7
	//*  20   34:ldc1            #81  <Int 0x80000000>
	//*  21   36:icmpne          41
			return null;
	//   22   39:aconst_null     
	//   23   40:areturn         
		Object obj = ((Object) ((LayoutParams)view.getLayoutParams()));
	//   24   41:aload_1         
	//   25   42:invokevirtual   #351 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   26   45:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//   27   48:astore          10
		boolean flag1 = ((LayoutParams) (obj)).mFullSpan;
	//   28   50:aload           10
	//   29   52:getfield        #218 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//   30   55:istore          8
		obj = ((Object) (((LayoutParams) (obj)).mSpan));
	//   31   57:aload           10
	//   32   59:getfield        #224 <Field StaggeredGridLayoutManager$Span StaggeredGridLayoutManager$LayoutParams.mSpan>
	//   33   62:astore          10
		if(l1 == 1)
	//*  34   64:iload           7
	//*  35   66:iconst_1        
	//*  36   67:icmpne          78
			i = getLastChildPosition();
	//   37   70:aload_0         
	//   38   71:invokevirtual   #479 <Method int getLastChildPosition()>
	//   39   74:istore_2        
		else
	//*  40   75:goto            83
			i = getFirstChildPosition();
	//   41   78:aload_0         
	//   42   79:invokevirtual   #238 <Method int getFirstChildPosition()>
	//   43   82:istore_2        
		updateLayoutState(i, state);
	//   44   83:aload_0         
	//   45   84:iload_2         
	//   46   85:aload           4
	//   47   87:invokespecial   #631 <Method void updateLayoutState(int, RecyclerView$State)>
		setLayoutStateDirection(l1);
	//   48   90:aload_0         
	//   49   91:iload           7
	//   50   93:invokespecial   #634 <Method void setLayoutStateDirection(int)>
		LayoutState layoutstate = mLayoutState;
	//   51   96:aload_0         
	//   52   97:getfield        #136 <Field LayoutState mLayoutState>
	//   53  100:astore          11
		layoutstate.mCurrentPosition = layoutstate.mItemDirection + i;
	//   54  102:aload           11
	//   55  104:aload           11
	//   56  106:getfield        #402 <Field int LayoutState.mItemDirection>
	//   57  109:iload_2         
	//   58  110:iadd            
	//   59  111:putfield        #639 <Field int LayoutState.mCurrentPosition>
		mLayoutState.mAvailable = (int)((float)mPrimaryOrientation.getTotalSpace() * 0.3333333F);
	//   60  114:aload_0         
	//   61  115:getfield        #136 <Field LayoutState mLayoutState>
	//   62  118:aload_0         
	//   63  119:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//   64  122:invokevirtual   #623 <Method int OrientationHelper.getTotalSpace()>
	//   65  125:i2f             
	//   66  126:ldc2            #885 <Float 0.3333333F>
	//   67  129:fmul            
	//   68  130:f2i             
	//   69  131:putfield        #330 <Field int LayoutState.mAvailable>
		layoutstate = mLayoutState;
	//   70  134:aload_0         
	//   71  135:getfield        #136 <Field LayoutState mLayoutState>
	//   72  138:astore          11
		layoutstate.mStopInFocusable = true;
	//   73  140:aload           11
	//   74  142:iconst_1        
	//   75  143:putfield        #436 <Field boolean LayoutState.mStopInFocusable>
		boolean flag = false;
	//   76  146:iconst_0        
	//   77  147:istore          6
		layoutstate.mRecycle = false;
	//   78  149:aload           11
	//   79  151:iconst_0        
	//   80  152:putfield        #620 <Field boolean LayoutState.mRecycle>
		fill(recycler, layoutstate, state);
	//   81  155:aload_0         
	//   82  156:aload_3         
	//   83  157:aload           11
	//   84  159:aload           4
	//   85  161:invokespecial   #636 <Method int fill(RecyclerView$Recycler, LayoutState, RecyclerView$State)>
	//   86  164:pop             
		mLastLayoutFromEnd = mShouldReverseLayout;
	//   87  165:aload_0         
	//   88  166:aload_0         
	//   89  167:getfield        #78  <Field boolean mShouldReverseLayout>
	//   90  170:putfield        #596 <Field boolean mLastLayoutFromEnd>
		if(!flag1)
	//*  91  173:iload           8
	//*  92  175:ifne            198
		{
			recycler = ((RecyclerView.Recycler) (((Span) (obj)).getFocusableViewAfter(i, l1)));
	//   93  178:aload           10
	//   94  180:iload_2         
	//   95  181:iload           7
	//   96  183:invokevirtual   #889 <Method View StaggeredGridLayoutManager$Span.getFocusableViewAfter(int, int)>
	//   97  186:astore_3        
			if(recycler != null && recycler != view)
	//*  98  187:aload_3         
	//*  99  188:ifnull          198
	//* 100  191:aload_3         
	//* 101  192:aload_1         
	//* 102  193:if_acmpeq       198
				return ((View) (recycler));
	//  103  196:aload_3         
	//  104  197:areturn         
		}
		if(preferLastSpan(l1))
	//* 105  198:aload_0         
	//* 106  199:iload           7
	//* 107  201:invokespecial   #474 <Method boolean preferLastSpan(int)>
	//* 108  204:ifeq            254
		{
			for(int j = mSpanCount - 1; j >= 0; j--)
	//* 109  207:aload_0         
	//* 110  208:getfield        #74  <Field int mSpanCount>
	//* 111  211:iconst_1        
	//* 112  212:isub            
	//* 113  213:istore          5
	//* 114  215:iload           5
	//* 115  217:iflt            300
			{
				recycler = ((RecyclerView.Recycler) (mSpans[j].getFocusableViewAfter(i, l1)));
	//  116  220:aload_0         
	//  117  221:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  118  224:iload           5
	//  119  226:aaload          
	//  120  227:iload_2         
	//  121  228:iload           7
	//  122  230:invokevirtual   #889 <Method View StaggeredGridLayoutManager$Span.getFocusableViewAfter(int, int)>
	//  123  233:astore_3        
				if(recycler != null && recycler != view)
	//* 124  234:aload_3         
	//* 125  235:ifnull          245
	//* 126  238:aload_3         
	//* 127  239:aload_1         
	//* 128  240:if_acmpeq       245
					return ((View) (recycler));
	//  129  243:aload_3         
	//  130  244:areturn         
			}

	//  131  245:iload           5
	//  132  247:iconst_1        
	//  133  248:isub            
	//  134  249:istore          5
		} else
	//* 135  251:goto            215
		{
			for(int k = 0; k < mSpanCount; k++)
	//* 136  254:iconst_0        
	//* 137  255:istore          5
	//* 138  257:iload           5
	//* 139  259:aload_0         
	//* 140  260:getfield        #74  <Field int mSpanCount>
	//* 141  263:icmpge          300
			{
				recycler = ((RecyclerView.Recycler) (mSpans[k].getFocusableViewAfter(i, l1)));
	//  142  266:aload_0         
	//  143  267:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  144  270:iload           5
	//  145  272:aaload          
	//  146  273:iload_2         
	//  147  274:iload           7
	//  148  276:invokevirtual   #889 <Method View StaggeredGridLayoutManager$Span.getFocusableViewAfter(int, int)>
	//  149  279:astore_3        
				if(recycler != null && recycler != view)
	//* 150  280:aload_3         
	//* 151  281:ifnull          291
	//* 152  284:aload_3         
	//* 153  285:aload_1         
	//* 154  286:if_acmpeq       291
					return ((View) (recycler));
	//  155  289:aload_3         
	//  156  290:areturn         
			}

	//  157  291:iload           5
	//  158  293:iconst_1        
	//  159  294:iadd            
	//  160  295:istore          5
		}
	//* 161  297:goto            257
		boolean flag2 = mReverseLayout;
	//  162  300:aload_0         
	//  163  301:getfield        #76  <Field boolean mReverseLayout>
	//  164  304:istore          9
		if(l1 == -1)
	//* 165  306:iload           7
	//* 166  308:iconst_m1       
	//* 167  309:icmpne          317
			i = 1;
	//  168  312:iconst_1        
	//  169  313:istore_2        
		else
	//* 170  314:goto            319
			i = 0;
	//  171  317:iconst_0        
	//  172  318:istore_2        
		if((flag2 ^ true) == i)
	//* 173  319:iload           9
	//* 174  321:iconst_1        
	//* 175  322:ixor            
	//* 176  323:iload_2         
	//* 177  324:icmpne          332
			i = 1;
	//  178  327:iconst_1        
	//  179  328:istore_2        
		else
	//* 180  329:goto            334
			i = 0;
	//  181  332:iconst_0        
	//  182  333:istore_2        
		if(!flag1)
	//* 183  334:iload           8
	//* 184  336:ifne            378
		{
			int l;
			if(i != 0)
	//* 185  339:iload_2         
	//* 186  340:ifeq            353
				l = ((Span) (obj)).findFirstPartiallyVisibleItemPosition();
	//  187  343:aload           10
	//  188  345:invokevirtual   #892 <Method int StaggeredGridLayoutManager$Span.findFirstPartiallyVisibleItemPosition()>
	//  189  348:istore          5
			else
	//* 190  350:goto            360
				l = ((Span) (obj)).findLastPartiallyVisibleItemPosition();
	//  191  353:aload           10
	//  192  355:invokevirtual   #895 <Method int StaggeredGridLayoutManager$Span.findLastPartiallyVisibleItemPosition()>
	//  193  358:istore          5
			recycler = ((RecyclerView.Recycler) (findViewByPosition(l)));
	//  194  360:aload_0         
	//  195  361:iload           5
	//  196  363:invokevirtual   #898 <Method View findViewByPosition(int)>
	//  197  366:astore_3        
			if(recycler != null && recycler != view)
	//* 198  367:aload_3         
	//* 199  368:ifnull          378
	//* 200  371:aload_3         
	//* 201  372:aload_1         
	//* 202  373:if_acmpeq       378
				return ((View) (recycler));
	//  203  376:aload_3         
	//  204  377:areturn         
		}
		int i1 = ((int) (flag));
	//  205  378:iload           6
	//  206  380:istore          5
		if(preferLastSpan(l1))
	//* 207  382:aload_0         
	//* 208  383:iload           7
	//* 209  385:invokespecial   #474 <Method boolean preferLastSpan(int)>
	//* 210  388:ifeq            475
			for(i1 = mSpanCount - 1; i1 >= 0; i1--)
	//* 211  391:aload_0         
	//* 212  392:getfield        #74  <Field int mSpanCount>
	//* 213  395:iconst_1        
	//* 214  396:isub            
	//* 215  397:istore          5
	//* 216  399:iload           5
	//* 217  401:iflt            542
				if(i1 != ((Span) (obj)).mIndex)
	//* 218  404:iload           5
	//* 219  406:aload           10
	//* 220  408:getfield        #419 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//* 221  411:icmpne          417
	//* 222  414:goto            466
				{
					int j1;
					if(i != 0)
	//* 223  417:iload_2         
	//* 224  418:ifeq            436
						j1 = mSpans[i1].findFirstPartiallyVisibleItemPosition();
	//  225  421:aload_0         
	//  226  422:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  227  425:iload           5
	//  228  427:aaload          
	//  229  428:invokevirtual   #892 <Method int StaggeredGridLayoutManager$Span.findFirstPartiallyVisibleItemPosition()>
	//  230  431:istore          6
					else
	//* 231  433:goto            448
						j1 = mSpans[i1].findLastPartiallyVisibleItemPosition();
	//  232  436:aload_0         
	//  233  437:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  234  440:iload           5
	//  235  442:aaload          
	//  236  443:invokevirtual   #895 <Method int StaggeredGridLayoutManager$Span.findLastPartiallyVisibleItemPosition()>
	//  237  446:istore          6
					recycler = ((RecyclerView.Recycler) (findViewByPosition(j1)));
	//  238  448:aload_0         
	//  239  449:iload           6
	//  240  451:invokevirtual   #898 <Method View findViewByPosition(int)>
	//  241  454:astore_3        
					if(recycler != null && recycler != view)
	//* 242  455:aload_3         
	//* 243  456:ifnull          466
	//* 244  459:aload_3         
	//* 245  460:aload_1         
	//* 246  461:if_acmpeq       466
						return ((View) (recycler));
	//  247  464:aload_3         
	//  248  465:areturn         
				}

	//  249  466:iload           5
	//  250  468:iconst_1        
	//  251  469:isub            
	//  252  470:istore          5
		else
	//* 253  472:goto            399
			for(; i1 < mSpanCount; i1++)
	//* 254  475:iload           5
	//* 255  477:aload_0         
	//* 256  478:getfield        #74  <Field int mSpanCount>
	//* 257  481:icmpge          542
			{
				int k1;
				if(i != 0)
	//* 258  484:iload_2         
	//* 259  485:ifeq            503
					k1 = mSpans[i1].findFirstPartiallyVisibleItemPosition();
	//  260  488:aload_0         
	//  261  489:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  262  492:iload           5
	//  263  494:aaload          
	//  264  495:invokevirtual   #892 <Method int StaggeredGridLayoutManager$Span.findFirstPartiallyVisibleItemPosition()>
	//  265  498:istore          6
				else
	//* 266  500:goto            515
					k1 = mSpans[i1].findLastPartiallyVisibleItemPosition();
	//  267  503:aload_0         
	//  268  504:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  269  507:iload           5
	//  270  509:aaload          
	//  271  510:invokevirtual   #895 <Method int StaggeredGridLayoutManager$Span.findLastPartiallyVisibleItemPosition()>
	//  272  513:istore          6
				recycler = ((RecyclerView.Recycler) (findViewByPosition(k1)));
	//  273  515:aload_0         
	//  274  516:iload           6
	//  275  518:invokevirtual   #898 <Method View findViewByPosition(int)>
	//  276  521:astore_3        
				if(recycler != null && recycler != view)
	//* 277  522:aload_3         
	//* 278  523:ifnull          533
	//* 279  526:aload_3         
	//* 280  527:aload_1         
	//* 281  528:if_acmpeq       533
					return ((View) (recycler));
	//  282  531:aload_3         
	//  283  532:areturn         
			}

	//  284  533:iload           5
	//  285  535:iconst_1        
	//  286  536:iadd            
	//  287  537:istore          5
	//* 288  539:goto            475
		return null;
	//  289  542:aconst_null     
	//  290  543:areturn         
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #902 <Method void RecyclerView$LayoutManager.onInitializeAccessibilityEvent(AccessibilityEvent)>
		if(getChildCount() > 0)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #235 <Method int getChildCount()>
	//*   5    9:ifle            79
		{
			View view = findFirstVisibleItemClosestToStart(false);
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #271 <Method View findFirstVisibleItemClosestToStart(boolean)>
	//    9   17:astore          4
			View view1 = findFirstVisibleItemClosestToEnd(false);
	//   10   19:aload_0         
	//   11   20:iconst_0        
	//   12   21:invokevirtual   #274 <Method View findFirstVisibleItemClosestToEnd(boolean)>
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
	//   21   40:invokevirtual   #457 <Method int getPosition(View)>
	//   22   43:istore_2        
				int j = getPosition(view1);
	//   23   44:aload_0         
	//   24   45:aload           5
	//   25   47:invokevirtual   #457 <Method int getPosition(View)>
	//   26   50:istore_3        
				if(i < j)
	//*  27   51:iload_2         
	//*  28   52:iload_3         
	//*  29   53:icmpge          67
				{
					accessibilityevent.setFromIndex(i);
	//   30   56:aload_1         
	//   31   57:iload_2         
	//   32   58:invokevirtual   #907 <Method void AccessibilityEvent.setFromIndex(int)>
					accessibilityevent.setToIndex(j);
	//   33   61:aload_1         
	//   34   62:iload_3         
	//   35   63:invokevirtual   #910 <Method void AccessibilityEvent.setToIndex(int)>
					return;
	//   36   66:return          
				} else
				{
					accessibilityevent.setFromIndex(j);
	//   37   67:aload_1         
	//   38   68:iload_3         
	//   39   69:invokevirtual   #907 <Method void AccessibilityEvent.setFromIndex(int)>
					accessibilityevent.setToIndex(i);
	//   40   72:aload_1         
	//   41   73:iload_2         
	//   42   74:invokevirtual   #910 <Method void AccessibilityEvent.setToIndex(int)>
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
	//    1    1:invokevirtual   #351 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
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
	//    9   16:invokespecial   #915 <Method void RecyclerView$LayoutManager.onInitializeAccessibilityNodeInfoForItem(View, AccessibilityNodeInfoCompat)>
			return;
	//   10   19:return          
		}
		recycler = ((RecyclerView.Recycler) ((LayoutParams)recycler));
	//   11   20:aload_1         
	//   12   21:checkcast       #13  <Class StaggeredGridLayoutManager$LayoutParams>
	//   13   24:astore_1        
		if(mOrientation == 0)
	//*  14   25:aload_0         
	//*  15   26:getfield        #289 <Field int mOrientation>
	//*  16   29:ifne            77
		{
			int k = ((LayoutParams) (recycler)).getSpanIndex();
	//   17   32:aload_1         
	//   18   33:invokevirtual   #918 <Method int StaggeredGridLayoutManager$LayoutParams.getSpanIndex()>
	//   19   36:istore          6
			int i;
			if(((LayoutParams) (recycler)).mFullSpan)
	//*  20   38:aload_1         
	//*  21   39:getfield        #218 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*  22   42:ifeq            54
				i = mSpanCount;
	//   23   45:aload_0         
	//   24   46:getfield        #74  <Field int mSpanCount>
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
	//   35   66:getfield        #218 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//   36   69:iconst_0        
	//   37   70:invokestatic    #924 <Method android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat.obtain(int, int, int, int, boolean, boolean)>
	//   38   73:invokevirtual   #930 <Method void AccessibilityNodeInfoCompat.setCollectionItemInfo(Object)>
			return;
	//   39   76:return          
		}
		int l = ((LayoutParams) (recycler)).getSpanIndex();
	//   40   77:aload_1         
	//   41   78:invokevirtual   #918 <Method int StaggeredGridLayoutManager$LayoutParams.getSpanIndex()>
	//   42   81:istore          6
		int j;
		if(((LayoutParams) (recycler)).mFullSpan)
	//*  43   83:aload_1         
	//*  44   84:getfield        #218 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//*  45   87:ifeq            99
			j = mSpanCount;
	//   46   90:aload_0         
	//   47   91:getfield        #74  <Field int mSpanCount>
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
	//   58  111:getfield        #218 <Field boolean StaggeredGridLayoutManager$LayoutParams.mFullSpan>
	//   59  114:iconst_0        
	//   60  115:invokestatic    #924 <Method android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat.obtain(int, int, int, int, boolean, boolean)>
	//   61  118:invokevirtual   #930 <Method void AccessibilityNodeInfoCompat.setCollectionItemInfo(Object)>
	//   62  121:return          
	}

	public void onItemsAdded(RecyclerView recyclerview, int i, int j)
	{
		handleUpdate(i, j, 1);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #934 <Method void handleUpdate(int, int, int)>
	//    5    7:return          
	}

	public void onItemsChanged(RecyclerView recyclerview)
	{
		mLazySpanLookup.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//    2    4:invokevirtual   #597 <Method void StaggeredGridLayoutManager$LazySpanLookup.clear()>
		requestLayout();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #491 <Method void requestLayout()>
	//    5   11:return          
	}

	public void onItemsMoved(RecyclerView recyclerview, int i, int j, int k)
	{
		handleUpdate(i, j, 8);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:bipush          8
	//    4    5:invokespecial   #934 <Method void handleUpdate(int, int, int)>
	//    5    8:return          
	}

	public void onItemsRemoved(RecyclerView recyclerview, int i, int j)
	{
		handleUpdate(i, j, 2);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iconst_2        
	//    4    4:invokespecial   #934 <Method void handleUpdate(int, int, int)>
	//    5    7:return          
	}

	public void onItemsUpdated(RecyclerView recyclerview, int i, int j, Object obj)
	{
		handleUpdate(i, j, 4);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iconst_4        
	//    4    4:invokespecial   #934 <Method void handleUpdate(int, int, int)>
	//    5    7:return          
	}

	public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		onLayoutChildren(recycler, state, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #662 <Method void onLayoutChildren(RecyclerView$Recycler, RecyclerView$State, boolean)>
	//    5    7:return          
	}

	public void onLayoutCompleted(RecyclerView.State state)
	{
		super.onLayoutCompleted(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #946 <Method void RecyclerView$LayoutManager.onLayoutCompleted(RecyclerView$State)>
		mPendingScrollPosition = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #80  <Field int mPendingScrollPosition>
		mPendingScrollPositionOffset = 0x80000000;
	//    6   10:aload_0         
	//    7   11:ldc1            #81  <Int 0x80000000>
	//    8   13:putfield        #83  <Field int mPendingScrollPositionOffset>
		mPendingSavedState = null;
	//    9   16:aload_0         
	//   10   17:aconst_null     
	//   11   18:putfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
		mAnchorInfo.reset();
	//   12   21:aload_0         
	//   13   22:getfield        #98  <Field StaggeredGridLayoutManager$AnchorInfo mAnchorInfo>
	//   14   25:invokevirtual   #585 <Method void StaggeredGridLayoutManager$AnchorInfo.reset()>
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
	//    6   12:putfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
			requestLayout();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #491 <Method void requestLayout()>
		}
	//    9   19:return          
	}

	public Parcelable onSaveInstanceState()
	{
		SavedState savedstate = mPendingSavedState;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//    2    4:astore          4
		if(savedstate != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          21
			return ((Parcelable) (new SavedState(savedstate)));
	//    5   11:new             #24  <Class StaggeredGridLayoutManager$SavedState>
	//    6   14:dup             
	//    7   15:aload           4
	//    8   17:invokespecial   #953 <Method void StaggeredGridLayoutManager$SavedState(StaggeredGridLayoutManager$SavedState)>
	//    9   20:areturn         
		savedstate = new SavedState();
	//   10   21:new             #24  <Class StaggeredGridLayoutManager$SavedState>
	//   11   24:dup             
	//   12   25:invokespecial   #954 <Method void StaggeredGridLayoutManager$SavedState()>
	//   13   28:astore          4
		savedstate.mReverseLayout = mReverseLayout;
	//   14   30:aload           4
	//   15   32:aload_0         
	//   16   33:getfield        #76  <Field boolean mReverseLayout>
	//   17   36:putfield        #190 <Field boolean StaggeredGridLayoutManager$SavedState.mReverseLayout>
		savedstate.mAnchorLayoutFromEnd = mLastLayoutFromEnd;
	//   18   39:aload           4
	//   19   41:aload_0         
	//   20   42:getfield        #596 <Field boolean mLastLayoutFromEnd>
	//   21   45:putfield        #163 <Field boolean StaggeredGridLayoutManager$SavedState.mAnchorLayoutFromEnd>
		savedstate.mLastLayoutRTL = mLastLayoutRTL;
	//   22   48:aload           4
	//   23   50:aload_0         
	//   24   51:getfield        #189 <Field boolean mLastLayoutRTL>
	//   25   54:putfield        #188 <Field boolean StaggeredGridLayoutManager$SavedState.mLastLayoutRTL>
		LazySpanLookup lazyspanlookup = mLazySpanLookup;
	//   26   57:aload_0         
	//   27   58:getfield        #86  <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   28   61:astore          5
		int k = 0;
	//   29   63:iconst_0        
	//   30   64:istore_2        
		if(lazyspanlookup != null && lazyspanlookup.mData != null)
	//*  31   65:aload           5
	//*  32   67:ifnull          116
	//*  33   70:aload           5
	//*  34   72:getfield        #205 <Field int[] StaggeredGridLayoutManager$LazySpanLookup.mData>
	//*  35   75:ifnull          116
		{
			savedstate.mSpanLookup = mLazySpanLookup.mData;
	//   36   78:aload           4
	//   37   80:aload_0         
	//   38   81:getfield        #86  <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   39   84:getfield        #205 <Field int[] StaggeredGridLayoutManager$LazySpanLookup.mData>
	//   40   87:putfield        #202 <Field int[] StaggeredGridLayoutManager$SavedState.mSpanLookup>
			savedstate.mSpanLookupSize = savedstate.mSpanLookup.length;
	//   41   90:aload           4
	//   42   92:aload           4
	//   43   94:getfield        #202 <Field int[] StaggeredGridLayoutManager$SavedState.mSpanLookup>
	//   44   97:arraylength     
	//   45   98:putfield        #199 <Field int StaggeredGridLayoutManager$SavedState.mSpanLookupSize>
			savedstate.mFullSpanItems = mLazySpanLookup.mFullSpanItems;
	//   46  101:aload           4
	//   47  103:aload_0         
	//   48  104:getfield        #86  <Field StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup>
	//   49  107:getfield        #210 <Field List StaggeredGridLayoutManager$LazySpanLookup.mFullSpanItems>
	//   50  110:putfield        #209 <Field List StaggeredGridLayoutManager$SavedState.mFullSpanItems>
		} else
	//*  51  113:goto            122
		{
			savedstate.mSpanLookupSize = 0;
	//   52  116:aload           4
	//   53  118:iconst_0        
	//   54  119:putfield        #199 <Field int StaggeredGridLayoutManager$SavedState.mSpanLookupSize>
		}
		if(getChildCount() > 0)
	//*  55  122:aload_0         
	//*  56  123:invokevirtual   #235 <Method int getChildCount()>
	//*  57  126:ifle            276
		{
			int i;
			if(mLastLayoutFromEnd)
	//*  58  129:aload_0         
	//*  59  130:getfield        #596 <Field boolean mLastLayoutFromEnd>
	//*  60  133:ifeq            144
				i = getLastChildPosition();
	//   61  136:aload_0         
	//   62  137:invokevirtual   #479 <Method int getLastChildPosition()>
	//   63  140:istore_1        
			else
	//*  64  141:goto            149
				i = getFirstChildPosition();
	//   65  144:aload_0         
	//   66  145:invokevirtual   #238 <Method int getFirstChildPosition()>
	//   67  148:istore_1        
			savedstate.mAnchorPosition = i;
	//   68  149:aload           4
	//   69  151:iload_1         
	//   70  152:putfield        #186 <Field int StaggeredGridLayoutManager$SavedState.mAnchorPosition>
			savedstate.mVisibleAnchorPosition = findFirstVisibleItemPositionInt();
	//   71  155:aload           4
	//   72  157:aload_0         
	//   73  158:invokevirtual   #956 <Method int findFirstVisibleItemPositionInt()>
	//   74  161:putfield        #183 <Field int StaggeredGridLayoutManager$SavedState.mVisibleAnchorPosition>
			i = mSpanCount;
	//   75  164:aload_0         
	//   76  165:getfield        #74  <Field int mSpanCount>
	//   77  168:istore_1        
			savedstate.mSpanOffsetsSize = i;
	//   78  169:aload           4
	//   79  171:iload_1         
	//   80  172:putfield        #154 <Field int StaggeredGridLayoutManager$SavedState.mSpanOffsetsSize>
			savedstate.mSpanOffsets = new int[i];
	//   81  175:aload           4
	//   82  177:iload_1         
	//   83  178:newarray        int[]
	//   84  180:putfield        #160 <Field int[] StaggeredGridLayoutManager$SavedState.mSpanOffsets>
			for(; k < mSpanCount; k++)
	//*  85  183:iload_2         
	//*  86  184:aload_0         
	//*  87  185:getfield        #74  <Field int mSpanCount>
	//*  88  188:icmpge          294
			{
				int j;
				if(mLastLayoutFromEnd)
	//*  89  191:aload_0         
	//*  90  192:getfield        #596 <Field boolean mLastLayoutFromEnd>
	//*  91  195:ifeq            231
				{
					int l = mSpans[k].getEndLine(0x80000000);
	//   92  198:aload_0         
	//   93  199:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   94  202:iload_2         
	//   95  203:aaload          
	//   96  204:ldc1            #81  <Int 0x80000000>
	//   97  206:invokevirtual   #301 <Method int StaggeredGridLayoutManager$Span.getEndLine(int)>
	//   98  209:istore_3        
					j = l;
	//   99  210:iload_3         
	//  100  211:istore_1        
					if(l != 0x80000000)
	//* 101  212:iload_3         
	//* 102  213:ldc1            #81  <Int 0x80000000>
	//* 103  215:icmpeq          261
						j = l - mPrimaryOrientation.getEndAfterPadding();
	//  104  218:iload_3         
	//  105  219:aload_0         
	//  106  220:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//  107  223:invokevirtual   #171 <Method int OrientationHelper.getEndAfterPadding()>
	//  108  226:isub            
	//  109  227:istore_1        
				} else
	//* 110  228:goto            261
				{
					int i1 = mSpans[k].getStartLine(0x80000000);
	//  111  231:aload_0         
	//  112  232:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//  113  235:iload_2         
	//  114  236:aaload          
	//  115  237:ldc1            #81  <Int 0x80000000>
	//  116  239:invokevirtual   #304 <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
	//  117  242:istore_3        
					j = i1;
	//  118  243:iload_3         
	//  119  244:istore_1        
					if(i1 != 0x80000000)
	//* 120  245:iload_3         
	//* 121  246:ldc1            #81  <Int 0x80000000>
	//* 122  248:icmpeq          261
						j = i1 - mPrimaryOrientation.getStartAfterPadding();
	//  123  251:iload_3         
	//  124  252:aload_0         
	//  125  253:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//  126  256:invokevirtual   #174 <Method int OrientationHelper.getStartAfterPadding()>
	//  127  259:isub            
	//  128  260:istore_1        
				}
				savedstate.mSpanOffsets[k] = j;
	//  129  261:aload           4
	//  130  263:getfield        #160 <Field int[] StaggeredGridLayoutManager$SavedState.mSpanOffsets>
	//  131  266:iload_2         
	//  132  267:iload_1         
	//  133  268:iastore         
			}

	//  134  269:iload_2         
	//  135  270:iconst_1        
	//  136  271:iadd            
	//  137  272:istore_2        
		} else
	//* 138  273:goto            183
		{
			savedstate.mAnchorPosition = -1;
	//  139  276:aload           4
	//  140  278:iconst_m1       
	//  141  279:putfield        #186 <Field int StaggeredGridLayoutManager$SavedState.mAnchorPosition>
			savedstate.mVisibleAnchorPosition = -1;
	//  142  282:aload           4
	//  143  284:iconst_m1       
	//  144  285:putfield        #183 <Field int StaggeredGridLayoutManager$SavedState.mVisibleAnchorPosition>
			savedstate.mSpanOffsetsSize = 0;
	//  145  288:aload           4
	//  146  290:iconst_0        
	//  147  291:putfield        #154 <Field int StaggeredGridLayoutManager$SavedState.mSpanOffsetsSize>
		}
		return ((Parcelable) (savedstate));
	//  148  294:aload           4
	//  149  296:areturn         
	}

	public void onScrollStateChanged(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            9
			checkForGaps();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #660 <Method boolean checkForGaps()>
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
	//    3    5:invokevirtual   #479 <Method int getLastChildPosition()>
	//    4    8:istore_3        
			byte0 = 1;
	//    5    9:iconst_1        
	//    6   10:istore          4
		} else
	//*   7   12:goto            23
		{
			j = getFirstChildPosition();
	//    8   15:aload_0         
	//    9   16:invokevirtual   #238 <Method int getFirstChildPosition()>
	//   10   19:istore_3        
			byte0 = -1;
	//   11   20:iconst_m1       
	//   12   21:istore          4
		}
		mLayoutState.mRecycle = true;
	//   13   23:aload_0         
	//   14   24:getfield        #136 <Field LayoutState mLayoutState>
	//   15   27:iconst_1        
	//   16   28:putfield        #620 <Field boolean LayoutState.mRecycle>
		updateLayoutState(j, state);
	//   17   31:aload_0         
	//   18   32:iload_3         
	//   19   33:aload_2         
	//   20   34:invokespecial   #631 <Method void updateLayoutState(int, RecyclerView$State)>
		setLayoutStateDirection(((int) (byte0)));
	//   21   37:aload_0         
	//   22   38:iload           4
	//   23   40:invokespecial   #634 <Method void setLayoutStateDirection(int)>
		state = ((RecyclerView.State) (mLayoutState));
	//   24   43:aload_0         
	//   25   44:getfield        #136 <Field LayoutState mLayoutState>
	//   26   47:astore_2        
		state.mCurrentPosition = j + ((LayoutState) (state)).mItemDirection;
	//   27   48:aload_2         
	//   28   49:iload_3         
	//   29   50:aload_2         
	//   30   51:getfield        #402 <Field int LayoutState.mItemDirection>
	//   31   54:iadd            
	//   32   55:putfield        #639 <Field int LayoutState.mCurrentPosition>
		mLayoutState.mAvailable = Math.abs(i);
	//   33   58:aload_0         
	//   34   59:getfield        #136 <Field LayoutState mLayoutState>
	//   35   62:iload_1         
	//   36   63:invokestatic    #960 <Method int Math.abs(int)>
	//   37   66:putfield        #330 <Field int LayoutState.mAvailable>
	//   38   69:return          
	}

	int scrollBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(getChildCount() != 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #235 <Method int getChildCount()>
	//*   2    4:ifeq            95
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
	//   10   16:invokevirtual   #780 <Method void prepareLayoutStateForDelta(int, RecyclerView$State)>
			int j = fill(recycler, mLayoutState, state);
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:aload_0         
	//   14   22:getfield        #136 <Field LayoutState mLayoutState>
	//   15   25:aload_3         
	//   16   26:invokespecial   #636 <Method int fill(RecyclerView$Recycler, LayoutState, RecyclerView$State)>
	//   17   29:istore          4
			if(mLayoutState.mAvailable >= j)
	//*  18   31:aload_0         
	//*  19   32:getfield        #136 <Field LayoutState mLayoutState>
	//*  20   35:getfield        #330 <Field int LayoutState.mAvailable>
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
	//   33   61:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//   34   64:iload_1         
	//   35   65:ineg            
	//   36   66:invokevirtual   #467 <Method void OrientationHelper.offsetChildren(int)>
			mLastLayoutFromEnd = mShouldReverseLayout;
	//   37   69:aload_0         
	//   38   70:aload_0         
	//   39   71:getfield        #78  <Field boolean mShouldReverseLayout>
	//   40   74:putfield        #596 <Field boolean mLastLayoutFromEnd>
			state = ((RecyclerView.State) (mLayoutState));
	//   41   77:aload_0         
	//   42   78:getfield        #136 <Field LayoutState mLayoutState>
	//   43   81:astore_3        
			state.mAvailable = 0;
	//   44   82:aload_3         
	//   45   83:iconst_0        
	//   46   84:putfield        #330 <Field int LayoutState.mAvailable>
			recycle(recycler, ((LayoutState) (state)));
	//   47   87:aload_0         
	//   48   88:aload_2         
	//   49   89:aload_3         
	//   50   90:invokespecial   #433 <Method void recycle(RecyclerView$Recycler, LayoutState)>
			return i;
	//   51   93:iload_1         
	//   52   94:ireturn         
		} else
		{
			return 0;
	//   53   95:iconst_0        
	//   54   96:ireturn         
		}
	}

	public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		return scrollBy(i, recycler, state);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #464 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//    5    7:ireturn         
	}

	public void scrollToPosition(int i)
	{
		SavedState savedstate = mPendingSavedState;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//    2    4:astore_2        
		if(savedstate != null && savedstate.mAnchorPosition != i)
	//*   3    5:aload_2         
	//*   4    6:ifnull          24
	//*   5    9:aload_2         
	//*   6   10:getfield        #186 <Field int StaggeredGridLayoutManager$SavedState.mAnchorPosition>
	//*   7   13:iload_1         
	//*   8   14:icmpeq          24
			mPendingSavedState.invalidateAnchorPositionInfo();
	//    9   17:aload_0         
	//   10   18:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   11   21:invokevirtual   #965 <Method void StaggeredGridLayoutManager$SavedState.invalidateAnchorPositionInfo()>
		mPendingScrollPosition = i;
	//   12   24:aload_0         
	//   13   25:iload_1         
	//   14   26:putfield        #80  <Field int mPendingScrollPosition>
		mPendingScrollPositionOffset = 0x80000000;
	//   15   29:aload_0         
	//   16   30:ldc1            #81  <Int 0x80000000>
	//   17   32:putfield        #83  <Field int mPendingScrollPositionOffset>
		requestLayout();
	//   18   35:aload_0         
	//   19   36:invokevirtual   #491 <Method void requestLayout()>
	//   20   39:return          
	}

	public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		return scrollBy(i, recycler, state);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #464 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//    5    7:ireturn         
	}

	public void setMeasuredDimension(Rect rect, int i, int j)
	{
		int k = getPaddingLeft() + getPaddingRight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #566 <Method int getPaddingLeft()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #569 <Method int getPaddingRight()>
	//    4    8:iadd            
	//    5    9:istore          4
		int l = getPaddingTop() + getPaddingBottom();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #545 <Method int getPaddingTop()>
	//    8   15:aload_0         
	//    9   16:invokevirtual   #548 <Method int getPaddingBottom()>
	//   10   19:iadd            
	//   11   20:istore          5
		if(mOrientation == 1)
	//*  12   22:aload_0         
	//*  13   23:getfield        #289 <Field int mOrientation>
	//*  14   26:iconst_1        
	//*  15   27:icmpne          76
		{
			j = chooseSize(j, rect.height() + l, getMinimumHeight());
	//   16   30:iload_3         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #970 <Method int Rect.height()>
	//   19   35:iload           5
	//   20   37:iadd            
	//   21   38:aload_0         
	//   22   39:invokevirtual   #973 <Method int getMinimumHeight()>
	//   23   42:invokestatic    #976 <Method int chooseSize(int, int, int)>
	//   24   45:istore_3        
			k = chooseSize(i, mSizePerSpan * mSpanCount + k, getMinimumWidth());
	//   25   46:iload_2         
	//   26   47:aload_0         
	//   27   48:getfield        #421 <Field int mSizePerSpan>
	//   28   51:aload_0         
	//   29   52:getfield        #74  <Field int mSpanCount>
	//   30   55:imul            
	//   31   56:iload           4
	//   32   58:iadd            
	//   33   59:aload_0         
	//   34   60:invokevirtual   #979 <Method int getMinimumWidth()>
	//   35   63:invokestatic    #976 <Method int chooseSize(int, int, int)>
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
	//   44   78:invokevirtual   #981 <Method int Rect.width()>
	//   45   81:iload           4
	//   46   83:iadd            
	//   47   84:aload_0         
	//   48   85:invokevirtual   #979 <Method int getMinimumWidth()>
	//   49   88:invokestatic    #976 <Method int chooseSize(int, int, int)>
	//   50   91:istore_2        
			k = chooseSize(j, mSizePerSpan * mSpanCount + l, getMinimumHeight());
	//   51   92:iload_3         
	//   52   93:aload_0         
	//   53   94:getfield        #421 <Field int mSizePerSpan>
	//   54   97:aload_0         
	//   55   98:getfield        #74  <Field int mSpanCount>
	//   56  101:imul            
	//   57  102:iload           5
	//   58  104:iadd            
	//   59  105:aload_0         
	//   60  106:invokevirtual   #973 <Method int getMinimumHeight()>
	//   61  109:invokestatic    #976 <Method int chooseSize(int, int, int)>
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
	//   70  122:invokevirtual   #983 <Method void setMeasuredDimension(int, int)>
	//   71  125:return          
	}

	public void setOrientation(int i)
	{
		if(i != 0 && i != 1)
	//*   0    0:iload_1         
	//*   1    1:ifeq            23
	//*   2    4:iload_1         
	//*   3    5:iconst_1        
	//*   4    6:icmpne          12
	//*   5    9:goto            23
			throw new IllegalArgumentException("invalid orientation.");
	//    6   12:new             #985 <Class IllegalArgumentException>
	//    7   15:dup             
	//    8   16:ldc2            #987 <String "invalid orientation.">
	//    9   19:invokespecial   #989 <Method void IllegalArgumentException(String)>
	//   10   22:athrow          
		assertNotInLayoutOrScroll(((String) (null)));
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:invokevirtual   #990 <Method void assertNotInLayoutOrScroll(String)>
		if(i == mOrientation)
	//*  14   28:iload_1         
	//*  15   29:aload_0         
	//*  16   30:getfield        #289 <Field int mOrientation>
	//*  17   33:icmpne          37
		{
			return;
	//   18   36:return          
		} else
		{
			mOrientation = i;
	//   19   37:aload_0         
	//   20   38:iload_1         
	//   21   39:putfield        #289 <Field int mOrientation>
			OrientationHelper orientationhelper = mPrimaryOrientation;
	//   22   42:aload_0         
	//   23   43:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//   24   46:astore_2        
			mPrimaryOrientation = mSecondaryOrientation;
	//   25   47:aload_0         
	//   26   48:aload_0         
	//   27   49:getfield        #310 <Field OrientationHelper mSecondaryOrientation>
	//   28   52:putfield        #165 <Field OrientationHelper mPrimaryOrientation>
			mSecondaryOrientation = orientationhelper;
	//   29   55:aload_0         
	//   30   56:aload_2         
	//   31   57:putfield        #310 <Field OrientationHelper mSecondaryOrientation>
			requestLayout();
	//   32   60:aload_0         
	//   33   61:invokevirtual   #491 <Method void requestLayout()>
			return;
	//   34   64:return          
		}
	}

	public void setReverseLayout(boolean flag)
	{
		assertNotInLayoutOrScroll(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #990 <Method void assertNotInLayoutOrScroll(String)>
		SavedState savedstate = mPendingSavedState;
	//    3    5:aload_0         
	//    4    6:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//    5    9:astore_2        
		if(savedstate != null && savedstate.mReverseLayout != flag)
	//*   6   10:aload_2         
	//*   7   11:ifnull          30
	//*   8   14:aload_2         
	//*   9   15:getfield        #190 <Field boolean StaggeredGridLayoutManager$SavedState.mReverseLayout>
	//*  10   18:iload_1         
	//*  11   19:icmpeq          30
			mPendingSavedState.mReverseLayout = flag;
	//   12   22:aload_0         
	//   13   23:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   14   26:iload_1         
	//   15   27:putfield        #190 <Field boolean StaggeredGridLayoutManager$SavedState.mReverseLayout>
		mReverseLayout = flag;
	//   16   30:aload_0         
	//   17   31:iload_1         
	//   18   32:putfield        #76  <Field boolean mReverseLayout>
		requestLayout();
	//   19   35:aload_0         
	//   20   36:invokevirtual   #491 <Method void requestLayout()>
	//   21   39:return          
	}

	public void setSpanCount(int i)
	{
		assertNotInLayoutOrScroll(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #990 <Method void assertNotInLayoutOrScroll(String)>
		if(i != mSpanCount)
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #74  <Field int mSpanCount>
	//*   6   10:icmpeq          84
		{
			invalidateSpanAssignments();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #992 <Method void invalidateSpanAssignments()>
			mSpanCount = i;
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:putfield        #74  <Field int mSpanCount>
			mRemainingSpans = new BitSet(mSpanCount);
	//   12   22:aload_0         
	//   13   23:new             #316 <Class BitSet>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:getfield        #74  <Field int mSpanCount>
	//   17   31:invokespecial   #848 <Method void BitSet(int)>
	//   18   34:putfield        #314 <Field BitSet mRemainingSpans>
			mSpans = new Span[mSpanCount];
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:getfield        #74  <Field int mSpanCount>
	//   22   42:anewarray       Span[]
	//   23   45:putfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
			for(i = 0; i < mSpanCount; i++)
	//*  24   48:iconst_0        
	//*  25   49:istore_1        
	//*  26   50:iload_1         
	//*  27   51:aload_0         
	//*  28   52:getfield        #74  <Field int mSpanCount>
	//*  29   55:icmpge          80
				mSpans[i] = new Span(i);
	//   30   58:aload_0         
	//   31   59:getfield        #144 <Field StaggeredGridLayoutManager$Span[] mSpans>
	//   32   62:iload_1         
	//   33   63:new             #29  <Class StaggeredGridLayoutManager$Span>
	//   34   66:dup             
	//   35   67:aload_0         
	//   36   68:iload_1         
	//   37   69:invokespecial   #995 <Method void StaggeredGridLayoutManager$Span(StaggeredGridLayoutManager, int)>
	//   38   72:aastore         

	//   39   73:iload_1         
	//   40   74:iconst_1        
	//   41   75:iadd            
	//   42   76:istore_1        
	//*  43   77:goto            50
			requestLayout();
	//   44   80:aload_0         
	//   45   81:invokevirtual   #491 <Method void requestLayout()>
		}
	//   46   84:return          
	}

	public void smoothScrollToPosition(RecyclerView recyclerview, RecyclerView.State state, int i)
	{
		recyclerview = ((RecyclerView) (new LinearSmoothScroller(recyclerview.getContext())));
	//    0    0:new             #999 <Class LinearSmoothScroller>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1003 <Method Context RecyclerView.getContext()>
	//    4    8:invokespecial   #1006 <Method void LinearSmoothScroller(Context)>
	//    5   11:astore_1        
		((LinearSmoothScroller) (recyclerview)).setTargetPosition(i);
	//    6   12:aload_1         
	//    7   13:iload_3         
	//    8   14:invokevirtual   #1009 <Method void LinearSmoothScroller.setTargetPosition(int)>
		startSmoothScroll(((RecyclerView.SmoothScroller) (recyclerview)));
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #1013 <Method void startSmoothScroll(RecyclerView$SmoothScroller)>
	//   12   22:return          
	}

	public boolean supportsPredictiveItemAnimations()
	{
		return mPendingSavedState == null;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
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
	//    1    1:invokevirtual   #649 <Method boolean RecyclerView$State.isPreLayout()>
	//    2    4:istore          5
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          4
		if(!flag1)
	//*   5    9:iload           5
	//*   6   11:ifne            384
		{
			int i = mPendingScrollPosition;
	//    7   14:aload_0         
	//    8   15:getfield        #80  <Field int mPendingScrollPosition>
	//    9   18:istore_3        
			if(i == -1)
	//*  10   19:iload_3         
	//*  11   20:iconst_m1       
	//*  12   21:icmpne          26
				return false;
	//   13   24:iconst_0        
	//   14   25:ireturn         
			if(i >= 0 && i < state.getItemCount())
	//*  15   26:iload_3         
	//*  16   27:iflt            371
	//*  17   30:iload_3         
	//*  18   31:aload_1         
	//*  19   32:invokevirtual   #578 <Method int RecyclerView$State.getItemCount()>
	//*  20   35:icmplt          41
	//*  21   38:goto            371
			{
				state = ((RecyclerView.State) (mPendingSavedState));
	//   22   41:aload_0         
	//   23   42:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//   24   45:astore_1        
				if(state != null && ((SavedState) (state)).mAnchorPosition != -1 && mPendingSavedState.mSpanOffsetsSize >= 1)
	//*  25   46:aload_1         
	//*  26   47:ifnull          88
	//*  27   50:aload_1         
	//*  28   51:getfield        #186 <Field int StaggeredGridLayoutManager$SavedState.mAnchorPosition>
	//*  29   54:iconst_m1       
	//*  30   55:icmpeq          88
	//*  31   58:aload_0         
	//*  32   59:getfield        #151 <Field StaggeredGridLayoutManager$SavedState mPendingSavedState>
	//*  33   62:getfield        #154 <Field int StaggeredGridLayoutManager$SavedState.mSpanOffsetsSize>
	//*  34   65:iconst_1        
	//*  35   66:icmpge          72
	//*  36   69:goto            88
				{
					anchorinfo.mOffset = 0x80000000;
	//   37   72:aload_2         
	//   38   73:ldc1            #81  <Int 0x80000000>
	//   39   75:putfield        #603 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
					anchorinfo.mPosition = mPendingScrollPosition;
	//   40   78:aload_2         
	//   41   79:aload_0         
	//   42   80:getfield        #80  <Field int mPendingScrollPosition>
	//   43   83:putfield        #627 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
					return true;
	//   44   86:iconst_1        
	//   45   87:ireturn         
				}
				state = ((RecyclerView.State) (findViewByPosition(mPendingScrollPosition)));
	//   46   88:aload_0         
	//   47   89:aload_0         
	//   48   90:getfield        #80  <Field int mPendingScrollPosition>
	//   49   93:invokevirtual   #898 <Method View findViewByPosition(int)>
	//   50   96:astore_1        
				if(state != null)
	//*  51   97:aload_1         
	//*  52   98:ifnull          312
				{
					int j;
					if(mShouldReverseLayout)
	//*  53  101:aload_0         
	//*  54  102:getfield        #78  <Field boolean mShouldReverseLayout>
	//*  55  105:ifeq            116
						j = getLastChildPosition();
	//   56  108:aload_0         
	//   57  109:invokevirtual   #479 <Method int getLastChildPosition()>
	//   58  112:istore_3        
					else
	//*  59  113:goto            121
						j = getFirstChildPosition();
	//   60  116:aload_0         
	//   61  117:invokevirtual   #238 <Method int getFirstChildPosition()>
	//   62  120:istore_3        
					anchorinfo.mPosition = j;
	//   63  121:aload_2         
	//   64  122:iload_3         
	//   65  123:putfield        #627 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
					if(mPendingScrollPositionOffset != 0x80000000)
	//*  66  126:aload_0         
	//*  67  127:getfield        #83  <Field int mPendingScrollPositionOffset>
	//*  68  130:ldc1            #81  <Int 0x80000000>
	//*  69  132:icmpeq          196
						if(anchorinfo.mLayoutFromEnd)
	//*  70  135:aload_2         
	//*  71  136:getfield        #196 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
	//*  72  139:ifeq            169
						{
							anchorinfo.mOffset = mPrimaryOrientation.getEndAfterPadding() - mPendingScrollPositionOffset - mPrimaryOrientation.getDecoratedEnd(((View) (state)));
	//   73  142:aload_2         
	//   74  143:aload_0         
	//   75  144:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//   76  147:invokevirtual   #171 <Method int OrientationHelper.getEndAfterPadding()>
	//   77  150:aload_0         
	//   78  151:getfield        #83  <Field int mPendingScrollPositionOffset>
	//   79  154:isub            
	//   80  155:aload_0         
	//   81  156:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//   82  159:aload_1         
	//   83  160:invokevirtual   #689 <Method int OrientationHelper.getDecoratedEnd(View)>
	//   84  163:isub            
	//   85  164:putfield        #603 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
							return true;
	//   86  167:iconst_1        
	//   87  168:ireturn         
						} else
						{
							anchorinfo.mOffset = (mPrimaryOrientation.getStartAfterPadding() + mPendingScrollPositionOffset) - mPrimaryOrientation.getDecoratedStart(((View) (state)));
	//   88  169:aload_2         
	//   89  170:aload_0         
	//   90  171:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//   91  174:invokevirtual   #174 <Method int OrientationHelper.getStartAfterPadding()>
	//   92  177:aload_0         
	//   93  178:getfield        #83  <Field int mPendingScrollPositionOffset>
	//   94  181:iadd            
	//   95  182:aload_0         
	//   96  183:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//   97  186:aload_1         
	//   98  187:invokevirtual   #676 <Method int OrientationHelper.getDecoratedStart(View)>
	//   99  190:isub            
	//  100  191:putfield        #603 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
							return true;
	//  101  194:iconst_1        
	//  102  195:ireturn         
						}
					if(mPrimaryOrientation.getDecoratedMeasurement(((View) (state))) > mPrimaryOrientation.getTotalSpace())
	//* 103  196:aload_0         
	//* 104  197:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//* 105  200:aload_1         
	//* 106  201:invokevirtual   #382 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//* 107  204:aload_0         
	//* 108  205:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//* 109  208:invokevirtual   #623 <Method int OrientationHelper.getTotalSpace()>
	//* 110  211:icmple          247
					{
						if(anchorinfo.mLayoutFromEnd)
	//* 111  214:aload_2         
	//* 112  215:getfield        #196 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
	//* 113  218:ifeq            232
							j = mPrimaryOrientation.getEndAfterPadding();
	//  114  221:aload_0         
	//  115  222:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//  116  225:invokevirtual   #171 <Method int OrientationHelper.getEndAfterPadding()>
	//  117  228:istore_3        
						else
	//* 118  229:goto            240
							j = mPrimaryOrientation.getStartAfterPadding();
	//  119  232:aload_0         
	//  120  233:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//  121  236:invokevirtual   #174 <Method int OrientationHelper.getStartAfterPadding()>
	//  122  239:istore_3        
						anchorinfo.mOffset = j;
	//  123  240:aload_2         
	//  124  241:iload_3         
	//  125  242:putfield        #603 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
						return true;
	//  126  245:iconst_1        
	//  127  246:ireturn         
					}
					j = mPrimaryOrientation.getDecoratedStart(((View) (state))) - mPrimaryOrientation.getStartAfterPadding();
	//  128  247:aload_0         
	//  129  248:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//  130  251:aload_1         
	//  131  252:invokevirtual   #676 <Method int OrientationHelper.getDecoratedStart(View)>
	//  132  255:aload_0         
	//  133  256:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//  134  259:invokevirtual   #174 <Method int OrientationHelper.getStartAfterPadding()>
	//  135  262:isub            
	//  136  263:istore_3        
					if(j < 0)
	//* 137  264:iload_3         
	//* 138  265:ifge            276
					{
						anchorinfo.mOffset = -j;
	//  139  268:aload_2         
	//  140  269:iload_3         
	//  141  270:ineg            
	//  142  271:putfield        #603 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
						return true;
	//  143  274:iconst_1        
	//  144  275:ireturn         
					}
					j = mPrimaryOrientation.getEndAfterPadding() - mPrimaryOrientation.getDecoratedEnd(((View) (state)));
	//  145  276:aload_0         
	//  146  277:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//  147  280:invokevirtual   #171 <Method int OrientationHelper.getEndAfterPadding()>
	//  148  283:aload_0         
	//  149  284:getfield        #165 <Field OrientationHelper mPrimaryOrientation>
	//  150  287:aload_1         
	//  151  288:invokevirtual   #689 <Method int OrientationHelper.getDecoratedEnd(View)>
	//  152  291:isub            
	//  153  292:istore_3        
					if(j < 0)
	//* 154  293:iload_3         
	//* 155  294:ifge            304
					{
						anchorinfo.mOffset = j;
	//  156  297:aload_2         
	//  157  298:iload_3         
	//  158  299:putfield        #603 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
						return true;
	//  159  302:iconst_1        
	//  160  303:ireturn         
					} else
					{
						anchorinfo.mOffset = 0x80000000;
	//  161  304:aload_2         
	//  162  305:ldc1            #81  <Int 0x80000000>
	//  163  307:putfield        #603 <Field int StaggeredGridLayoutManager$AnchorInfo.mOffset>
						return true;
	//  164  310:iconst_1        
	//  165  311:ireturn         
					}
				}
				anchorinfo.mPosition = mPendingScrollPosition;
	//  166  312:aload_2         
	//  167  313:aload_0         
	//  168  314:getfield        #80  <Field int mPendingScrollPosition>
	//  169  317:putfield        #627 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
				int k = mPendingScrollPositionOffset;
	//  170  320:aload_0         
	//  171  321:getfield        #83  <Field int mPendingScrollPositionOffset>
	//  172  324:istore_3        
				if(k == 0x80000000)
	//* 173  325:iload_3         
	//* 174  326:ldc1            #81  <Int 0x80000000>
	//* 175  328:icmpne          359
				{
					if(calculateScrollDirectionForPosition(anchorinfo.mPosition) == 1)
	//* 176  331:aload_0         
	//* 177  332:aload_2         
	//* 178  333:getfield        #627 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
	//* 179  336:invokespecial   #807 <Method int calculateScrollDirectionForPosition(int)>
	//* 180  339:iconst_1        
	//* 181  340:icmpne          346
						flag = true;
	//  182  343:iconst_1        
	//  183  344:istore          4
					anchorinfo.mLayoutFromEnd = flag;
	//  184  346:aload_2         
	//  185  347:iload           4
	//  186  349:putfield        #196 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd>
					anchorinfo.assignCoordinateFromPadding();
	//  187  352:aload_2         
	//  188  353:invokevirtual   #1018 <Method void StaggeredGridLayoutManager$AnchorInfo.assignCoordinateFromPadding()>
				} else
	//* 189  356:goto            364
				{
					anchorinfo.assignCoordinateFromPadding(k);
	//  190  359:aload_2         
	//  191  360:iload_3         
	//  192  361:invokevirtual   #1020 <Method void StaggeredGridLayoutManager$AnchorInfo.assignCoordinateFromPadding(int)>
				}
				anchorinfo.mInvalidateOffsets = true;
	//  193  364:aload_2         
	//  194  365:iconst_1        
	//  195  366:putfield        #600 <Field boolean StaggeredGridLayoutManager$AnchorInfo.mInvalidateOffsets>
				return true;
	//  196  369:iconst_1        
	//  197  370:ireturn         
			} else
			{
				mPendingScrollPosition = -1;
	//  198  371:aload_0         
	//  199  372:iconst_m1       
	//  200  373:putfield        #80  <Field int mPendingScrollPosition>
				mPendingScrollPositionOffset = 0x80000000;
	//  201  376:aload_0         
	//  202  377:ldc1            #81  <Int 0x80000000>
	//  203  379:putfield        #83  <Field int mPendingScrollPositionOffset>
				return false;
	//  204  382:iconst_0        
	//  205  383:ireturn         
			}
		} else
		{
			return false;
	//  206  384:iconst_0        
	//  207  385:ireturn         
		}
	}

	void updateAnchorInfoForLayout(RecyclerView.State state, AnchorInfo anchorinfo)
	{
		if(updateAnchorFromPendingData(state, anchorinfo))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:aload_2         
	//*   3    3:invokevirtual   #1022 <Method boolean updateAnchorFromPendingData(RecyclerView$State, StaggeredGridLayoutManager$AnchorInfo)>
	//*   4    6:ifeq            10
			return;
	//    5    9:return          
		if(updateAnchorFromChildren(state, anchorinfo))
	//*   6   10:aload_0         
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:invokespecial   #1024 <Method boolean updateAnchorFromChildren(RecyclerView$State, StaggeredGridLayoutManager$AnchorInfo)>
	//*  10   16:ifeq            20
		{
			return;
	//   11   19:return          
		} else
		{
			anchorinfo.assignCoordinateFromPadding();
	//   12   20:aload_2         
	//   13   21:invokevirtual   #1018 <Method void StaggeredGridLayoutManager$AnchorInfo.assignCoordinateFromPadding()>
			anchorinfo.mPosition = 0;
	//   14   24:aload_2         
	//   15   25:iconst_0        
	//   16   26:putfield        #627 <Field int StaggeredGridLayoutManager$AnchorInfo.mPosition>
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
	//    3    3:getfield        #74  <Field int mSpanCount>
	//    4    6:idiv            
	//    5    7:putfield        #421 <Field int mSizePerSpan>
		mFullSizeSpec = android.view.View.MeasureSpec.makeMeasureSpec(i, mSecondaryOrientation.getMode());
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_0         
	//    9   13:getfield        #310 <Field OrientationHelper mSecondaryOrientation>
	//   10   16:invokevirtual   #698 <Method int OrientationHelper.getMode()>
	//   11   19:invokestatic    #750 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   12   22:putfield        #536 <Field int mFullSizeSpec>
	//   13   25:return          
	}

	private final AnchorInfo mAnchorInfo = new AnchorInfo();
	private final Runnable mCheckForGapsRunnable = new Runnable() {

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
	private int mFullSizeSpec;
	private int mGapStrategy;
	private boolean mLaidOutInvalidFullSpan;
	private boolean mLastLayoutFromEnd;
	private boolean mLastLayoutRTL;
	private final LayoutState mLayoutState = new LayoutState();
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
	private final Rect mTmpRect = new Rect();
}
