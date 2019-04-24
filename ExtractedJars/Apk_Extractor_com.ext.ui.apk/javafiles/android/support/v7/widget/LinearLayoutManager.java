// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//			ScrollbarHelper, OrientationHelper, ViewBoundsCheck, LinearSmoothScroller, 
//			RecyclerView

public class LinearLayoutManager extends RecyclerView.LayoutManager
	implements RecyclerView.SmoothScroller.ScrollVectorProvider, android.support.v7.widget.helper.ItemTouchHelper.ViewDropHandler
{
	class AnchorInfo
	{

		void assignCoordinateFromPadding()
		{
			int i;
			if(mLayoutFromEnd)
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field boolean mLayoutFromEnd>
		//*   2    4:ifeq            24
				i = mOrientationHelper.getEndAfterPadding();
		//    3    7:aload_0         
		//    4    8:getfield        #19  <Field LinearLayoutManager this$0>
		//    5   11:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//    6   14:invokevirtual   #39  <Method int OrientationHelper.getEndAfterPadding()>
		//    7   17:istore_1        
			else
		//*   8   18:aload_0         
		//*   9   19:iload_1         
		//*  10   20:putfield        #41  <Field int mCoordinate>
		//*  11   23:return          
				i = mOrientationHelper.getStartAfterPadding();
		//   12   24:aload_0         
		//   13   25:getfield        #19  <Field LinearLayoutManager this$0>
		//   14   28:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//   15   31:invokevirtual   #44  <Method int OrientationHelper.getStartAfterPadding()>
		//   16   34:istore_1        
			mCoordinate = i;
		//*  17   35:goto            18
		}

		public void assignFromView(View view)
		{
			if(mLayoutFromEnd)
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field boolean mLayoutFromEnd>
		//*   2    4:ifeq            46
				mCoordinate = mOrientationHelper.getDecoratedEnd(view) + mOrientationHelper.getTotalSpaceChange();
		//    3    7:aload_0         
		//    4    8:aload_0         
		//    5    9:getfield        #19  <Field LinearLayoutManager this$0>
		//    6   12:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//    7   15:aload_1         
		//    8   16:invokevirtual   #50  <Method int OrientationHelper.getDecoratedEnd(View)>
		//    9   19:aload_0         
		//   10   20:getfield        #19  <Field LinearLayoutManager this$0>
		//   11   23:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//   12   26:invokevirtual   #53  <Method int OrientationHelper.getTotalSpaceChange()>
		//   13   29:iadd            
		//   14   30:putfield        #41  <Field int mCoordinate>
			else
		//*  15   33:aload_0         
		//*  16   34:aload_0         
		//*  17   35:getfield        #19  <Field LinearLayoutManager this$0>
		//*  18   38:aload_1         
		//*  19   39:invokevirtual   #56  <Method int LinearLayoutManager.getPosition(View)>
		//*  20   42:putfield        #58  <Field int mPosition>
		//*  21   45:return          
				mCoordinate = mOrientationHelper.getDecoratedStart(view);
		//   22   46:aload_0         
		//   23   47:aload_0         
		//   24   48:getfield        #19  <Field LinearLayoutManager this$0>
		//   25   51:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//   26   54:aload_1         
		//   27   55:invokevirtual   #61  <Method int OrientationHelper.getDecoratedStart(View)>
		//   28   58:putfield        #41  <Field int mCoordinate>
			mPosition = getPosition(view);
		//*  29   61:goto            33
		}

		public void assignFromViewAndKeepVisibleRect(View view)
		{
			int k = mOrientationHelper.getTotalSpaceChange();
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field LinearLayoutManager this$0>
		//    2    4:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//    3    7:invokevirtual   #53  <Method int OrientationHelper.getTotalSpaceChange()>
		//    4   10:istore_3        
			if(k < 0) goto _L2; else goto _L1
		//    5   11:iload_3         
		//    6   12:iflt            21
_L1:
			assignFromView(view);
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:invokevirtual   #64  <Method void assignFromView(View)>
_L4:
			return;
		//   10   20:return          
_L2:
			mPosition = getPosition(view);
		//   11   21:aload_0         
		//   12   22:aload_0         
		//   13   23:getfield        #19  <Field LinearLayoutManager this$0>
		//   14   26:aload_1         
		//   15   27:invokevirtual   #56  <Method int LinearLayoutManager.getPosition(View)>
		//   16   30:putfield        #58  <Field int mPosition>
			if(!mLayoutFromEnd)
				break; /* Loop/switch isn't completed */
		//   17   33:aload_0         
		//   18   34:getfield        #29  <Field boolean mLayoutFromEnd>
		//   19   37:ifeq            166
			int i = mOrientationHelper.getEndAfterPadding() - k - mOrientationHelper.getDecoratedEnd(view);
		//   20   40:aload_0         
		//   21   41:getfield        #19  <Field LinearLayoutManager this$0>
		//   22   44:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//   23   47:invokevirtual   #39  <Method int OrientationHelper.getEndAfterPadding()>
		//   24   50:iload_3         
		//   25   51:isub            
		//   26   52:aload_0         
		//   27   53:getfield        #19  <Field LinearLayoutManager this$0>
		//   28   56:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//   29   59:aload_1         
		//   30   60:invokevirtual   #50  <Method int OrientationHelper.getDecoratedEnd(View)>
		//   31   63:isub            
		//   32   64:istore_2        
			mCoordinate = mOrientationHelper.getEndAfterPadding() - i;
		//   33   65:aload_0         
		//   34   66:aload_0         
		//   35   67:getfield        #19  <Field LinearLayoutManager this$0>
		//   36   70:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//   37   73:invokevirtual   #39  <Method int OrientationHelper.getEndAfterPadding()>
		//   38   76:iload_2         
		//   39   77:isub            
		//   40   78:putfield        #41  <Field int mCoordinate>
			if(i > 0)
		//*  41   81:iload_2         
		//*  42   82:ifle            20
			{
				k = mOrientationHelper.getDecoratedMeasurement(view);
		//   43   85:aload_0         
		//   44   86:getfield        #19  <Field LinearLayoutManager this$0>
		//   45   89:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//   46   92:aload_1         
		//   47   93:invokevirtual   #67  <Method int OrientationHelper.getDecoratedMeasurement(View)>
		//   48   96:istore_3        
				int l = mCoordinate;
		//   49   97:aload_0         
		//   50   98:getfield        #41  <Field int mCoordinate>
		//   51  101:istore          4
				int k1 = mOrientationHelper.getStartAfterPadding();
		//   52  103:aload_0         
		//   53  104:getfield        #19  <Field LinearLayoutManager this$0>
		//   54  107:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//   55  110:invokevirtual   #44  <Method int OrientationHelper.getStartAfterPadding()>
		//   56  113:istore          5
				k = l - k - (k1 + Math.min(mOrientationHelper.getDecoratedStart(view) - k1, 0));
		//   57  115:iload           4
		//   58  117:iload_3         
		//   59  118:isub            
		//   60  119:iload           5
		//   61  121:aload_0         
		//   62  122:getfield        #19  <Field LinearLayoutManager this$0>
		//   63  125:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//   64  128:aload_1         
		//   65  129:invokevirtual   #61  <Method int OrientationHelper.getDecoratedStart(View)>
		//   66  132:iload           5
		//   67  134:isub            
		//   68  135:iconst_0        
		//   69  136:invokestatic    #73  <Method int Math.min(int, int)>
		//   70  139:iadd            
		//   71  140:isub            
		//   72  141:istore_3        
				if(k < 0)
		//*  73  142:iload_3         
		//*  74  143:ifge            20
				{
					int i1 = mCoordinate;
		//   75  146:aload_0         
		//   76  147:getfield        #41  <Field int mCoordinate>
		//   77  150:istore          4
					mCoordinate = Math.min(i, -k) + i1;
		//   78  152:aload_0         
		//   79  153:iload_2         
		//   80  154:iload_3         
		//   81  155:ineg            
		//   82  156:invokestatic    #73  <Method int Math.min(int, int)>
		//   83  159:iload           4
		//   84  161:iadd            
		//   85  162:putfield        #41  <Field int mCoordinate>
					return;
		//   86  165:return          
				}
			}
			if(true) goto _L4; else goto _L3
_L3:
			int j1 = mOrientationHelper.getDecoratedStart(view);
		//   87  166:aload_0         
		//   88  167:getfield        #19  <Field LinearLayoutManager this$0>
		//   89  170:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//   90  173:aload_1         
		//   91  174:invokevirtual   #61  <Method int OrientationHelper.getDecoratedStart(View)>
		//   92  177:istore          4
			int j = j1 - mOrientationHelper.getStartAfterPadding();
		//   93  179:iload           4
		//   94  181:aload_0         
		//   95  182:getfield        #19  <Field LinearLayoutManager this$0>
		//   96  185:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//   97  188:invokevirtual   #44  <Method int OrientationHelper.getStartAfterPadding()>
		//   98  191:isub            
		//   99  192:istore_2        
			mCoordinate = j1;
		//  100  193:aload_0         
		//  101  194:iload           4
		//  102  196:putfield        #41  <Field int mCoordinate>
			if(j > 0)
		//* 103  199:iload_2         
		//* 104  200:ifle            20
			{
				int l1 = mOrientationHelper.getDecoratedMeasurement(view);
		//  105  203:aload_0         
		//  106  204:getfield        #19  <Field LinearLayoutManager this$0>
		//  107  207:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//  108  210:aload_1         
		//  109  211:invokevirtual   #67  <Method int OrientationHelper.getDecoratedMeasurement(View)>
		//  110  214:istore          5
				int i2 = mOrientationHelper.getEndAfterPadding();
		//  111  216:aload_0         
		//  112  217:getfield        #19  <Field LinearLayoutManager this$0>
		//  113  220:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//  114  223:invokevirtual   #39  <Method int OrientationHelper.getEndAfterPadding()>
		//  115  226:istore          6
				int j2 = mOrientationHelper.getDecoratedEnd(view);
		//  116  228:aload_0         
		//  117  229:getfield        #19  <Field LinearLayoutManager this$0>
		//  118  232:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//  119  235:aload_1         
		//  120  236:invokevirtual   #50  <Method int OrientationHelper.getDecoratedEnd(View)>
		//  121  239:istore          7
				k = mOrientationHelper.getEndAfterPadding() - Math.min(0, i2 - k - j2) - (j1 + l1);
		//  122  241:aload_0         
		//  123  242:getfield        #19  <Field LinearLayoutManager this$0>
		//  124  245:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//  125  248:invokevirtual   #39  <Method int OrientationHelper.getEndAfterPadding()>
		//  126  251:iconst_0        
		//  127  252:iload           6
		//  128  254:iload_3         
		//  129  255:isub            
		//  130  256:iload           7
		//  131  258:isub            
		//  132  259:invokestatic    #73  <Method int Math.min(int, int)>
		//  133  262:isub            
		//  134  263:iload           4
		//  135  265:iload           5
		//  136  267:iadd            
		//  137  268:isub            
		//  138  269:istore_3        
				if(k < 0)
		//* 139  270:iload_3         
		//* 140  271:ifge            20
				{
					mCoordinate = mCoordinate - Math.min(j, -k);
		//  141  274:aload_0         
		//  142  275:aload_0         
		//  143  276:getfield        #41  <Field int mCoordinate>
		//  144  279:iload_2         
		//  145  280:iload_3         
		//  146  281:ineg            
		//  147  282:invokestatic    #73  <Method int Math.min(int, int)>
		//  148  285:isub            
		//  149  286:putfield        #41  <Field int mCoordinate>
					return;
		//  150  289:return          
				}
			}
			if(true) goto _L4; else goto _L5
_L5:
		}

		boolean isViewValidAsAnchor(View view, RecyclerView.State state)
		{
			view = ((View) ((RecyclerView.LayoutParams)view.getLayoutParams()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #81  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #83  <Class RecyclerView$LayoutParams>
		//    3    7:astore_1        
			return !((RecyclerView.LayoutParams) (view)).isItemRemoved() && ((RecyclerView.LayoutParams) (view)).getViewLayoutPosition() >= 0 && ((RecyclerView.LayoutParams) (view)).getViewLayoutPosition() < state.getItemCount();
		//    4    8:aload_1         
		//    5    9:invokevirtual   #87  <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
		//    6   12:ifne            35
		//    7   15:aload_1         
		//    8   16:invokevirtual   #90  <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
		//    9   19:iflt            35
		//   10   22:aload_1         
		//   11   23:invokevirtual   #90  <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
		//   12   26:aload_2         
		//   13   27:invokevirtual   #95  <Method int RecyclerView$State.getItemCount()>
		//   14   30:icmpge          35
		//   15   33:iconst_1        
		//   16   34:ireturn         
		//   17   35:iconst_0        
		//   18   36:ireturn         
		}

		void reset()
		{
			mPosition = -1;
		//    0    0:aload_0         
		//    1    1:iconst_m1       
		//    2    2:putfield        #58  <Field int mPosition>
			mCoordinate = 0x80000000;
		//    3    5:aload_0         
		//    4    6:ldc1            #96  <Int 0x80000000>
		//    5    8:putfield        #41  <Field int mCoordinate>
			mLayoutFromEnd = false;
		//    6   11:aload_0         
		//    7   12:iconst_0        
		//    8   13:putfield        #29  <Field boolean mLayoutFromEnd>
			mValid = false;
		//    9   16:aload_0         
		//   10   17:iconst_0        
		//   11   18:putfield        #98  <Field boolean mValid>
		//   12   21:return          
		}

		public String toString()
		{
			return (new StringBuilder()).append("AnchorInfo{mPosition=").append(mPosition).append(", mCoordinate=").append(mCoordinate).append(", mLayoutFromEnd=").append(mLayoutFromEnd).append(", mValid=").append(mValid).append('}').toString();
		//    0    0:new             #102 <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #103 <Method void StringBuilder()>
		//    3    7:ldc1            #105 <String "AnchorInfo{mPosition=">
		//    4    9:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
		//    5   12:aload_0         
		//    6   13:getfield        #58  <Field int mPosition>
		//    7   16:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
		//    8   19:ldc1            #114 <String ", mCoordinate=">
		//    9   21:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
		//   10   24:aload_0         
		//   11   25:getfield        #41  <Field int mCoordinate>
		//   12   28:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
		//   13   31:ldc1            #116 <String ", mLayoutFromEnd=">
		//   14   33:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
		//   15   36:aload_0         
		//   16   37:getfield        #29  <Field boolean mLayoutFromEnd>
		//   17   40:invokevirtual   #119 <Method StringBuilder StringBuilder.append(boolean)>
		//   18   43:ldc1            #121 <String ", mValid=">
		//   19   45:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
		//   20   48:aload_0         
		//   21   49:getfield        #98  <Field boolean mValid>
		//   22   52:invokevirtual   #119 <Method StringBuilder StringBuilder.append(boolean)>
		//   23   55:bipush          125
		//   24   57:invokevirtual   #124 <Method StringBuilder StringBuilder.append(char)>
		//   25   60:invokevirtual   #126 <Method String StringBuilder.toString()>
		//   26   63:areturn         
		}

		int mCoordinate;
		boolean mLayoutFromEnd;
		int mPosition;
		boolean mValid;
		final LinearLayoutManager this$0;

		AnchorInfo()
		{
			this$0 = LinearLayoutManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field LinearLayoutManager this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
			reset();
		//    5    9:aload_0         
		//    6   10:invokevirtual   #25  <Method void reset()>
		//    7   13:return          
		}
	}

	protected static class LayoutChunkResult
	{

		void resetInternal()
		{
			mConsumed = 0;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #21  <Field int mConsumed>
			mFinished = false;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #23  <Field boolean mFinished>
			mIgnoreConsumed = false;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #25  <Field boolean mIgnoreConsumed>
			mFocusable = false;
		//    9   15:aload_0         
		//   10   16:iconst_0        
		//   11   17:putfield        #27  <Field boolean mFocusable>
		//   12   20:return          
		}

		public int mConsumed;
		public boolean mFinished;
		public boolean mFocusable;
		public boolean mIgnoreConsumed;

		protected LayoutChunkResult()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:return          
		}
	}

	static class LayoutState
	{

		private View nextViewFromScrapList()
		{
			int i;
			int j;
			j = mScrapList.size();
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field List mScrapList>
		//    2    4:invokeinterface #57  <Method int List.size()>
		//    3    9:istore_2        
			i = 0;
		//    4   10:iconst_0        
		//    5   11:istore_1        
_L3:
			View view;
			RecyclerView.LayoutParams layoutparams;
			if(i >= j)
				break; /* Loop/switch isn't completed */
		//    6   12:iload_1         
		//    7   13:iload_2         
		//    8   14:icmpge          77
			view = ((RecyclerView.ViewHolder)mScrapList.get(i)).itemView;
		//    9   17:aload_0         
		//   10   18:getfield        #48  <Field List mScrapList>
		//   11   21:iload_1         
		//   12   22:invokeinterface #61  <Method Object List.get(int)>
		//   13   27:checkcast       #63  <Class RecyclerView$ViewHolder>
		//   14   30:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
		//   15   33:astore_3        
			layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
		//   16   34:aload_3         
		//   17   35:invokevirtual   #73  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   18   38:checkcast       #75  <Class RecyclerView$LayoutParams>
		//   19   41:astore          4
			  goto _L1
		//*  20   43:aload           4
		//*  21   45:invokevirtual   #79  <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
		//*  22   48:ifeq            58
_L5:
			i++;
		//   23   51:iload_1         
		//   24   52:iconst_1        
		//   25   53:iadd            
		//   26   54:istore_1        
			if(true) goto _L3; else goto _L2
		//   27   55:goto            12
_L1:
			if(layoutparams.isItemRemoved() || mCurrentPosition != layoutparams.getViewLayoutPosition()) goto _L5; else goto _L4
		//   28   58:aload_0         
		//   29   59:getfield        #81  <Field int mCurrentPosition>
		//   30   62:aload           4
		//   31   64:invokevirtual   #84  <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
		//   32   67:icmpne          51
_L4:
			assignPositionFromScrapList(view);
		//   33   70:aload_0         
		//   34   71:aload_3         
		//   35   72:invokevirtual   #88  <Method void assignPositionFromScrapList(View)>
			return view;
		//   36   75:aload_3         
		//   37   76:areturn         
_L2:
			return null;
		//   38   77:aconst_null     
		//   39   78:areturn         
		}

		public void assignPositionFromScrapList()
		{
			assignPositionFromScrapList(((View) (null)));
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokevirtual   #88  <Method void assignPositionFromScrapList(View)>
		//    3    5:return          
		}

		public void assignPositionFromScrapList(View view)
		{
			view = nextViewInLimitedList(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #92  <Method View nextViewInLimitedList(View)>
		//    3    5:astore_1        
			if(view == null)
		//*   4    6:aload_1         
		//*   5    7:ifnonnull       16
			{
				mCurrentPosition = -1;
		//    6   10:aload_0         
		//    7   11:iconst_m1       
		//    8   12:putfield        #81  <Field int mCurrentPosition>
				return;
		//    9   15:return          
			} else
			{
				mCurrentPosition = ((RecyclerView.LayoutParams)view.getLayoutParams()).getViewLayoutPosition();
		//   10   16:aload_0         
		//   11   17:aload_1         
		//   12   18:invokevirtual   #73  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   13   21:checkcast       #75  <Class RecyclerView$LayoutParams>
		//   14   24:invokevirtual   #84  <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
		//   15   27:putfield        #81  <Field int mCurrentPosition>
				return;
		//   16   30:return          
			}
		}

		boolean hasMore(RecyclerView.State state)
		{
			return mCurrentPosition >= 0 && mCurrentPosition < state.getItemCount();
		//    0    0:aload_0         
		//    1    1:getfield        #81  <Field int mCurrentPosition>
		//    2    4:iflt            20
		//    3    7:aload_0         
		//    4    8:getfield        #81  <Field int mCurrentPosition>
		//    5   11:aload_1         
		//    6   12:invokevirtual   #99  <Method int RecyclerView$State.getItemCount()>
		//    7   15:icmpge          20
		//    8   18:iconst_1        
		//    9   19:ireturn         
		//   10   20:iconst_0        
		//   11   21:ireturn         
		}

		void log()
		{
			Log.d("LLM#LayoutState", (new StringBuilder()).append("avail:").append(mAvailable).append(", ind:").append(mCurrentPosition).append(", dir:").append(mItemDirection).append(", offset:").append(mOffset).append(", layoutDir:").append(mLayoutDirection).toString());
		//    0    0:ldc1            #21  <String "LLM#LayoutState">
		//    1    2:new             #102 <Class StringBuilder>
		//    2    5:dup             
		//    3    6:invokespecial   #103 <Method void StringBuilder()>
		//    4    9:ldc1            #105 <String "avail:">
		//    5   11:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
		//    6   14:aload_0         
		//    7   15:getfield        #111 <Field int mAvailable>
		//    8   18:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
		//    9   21:ldc1            #116 <String ", ind:">
		//   10   23:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
		//   11   26:aload_0         
		//   12   27:getfield        #81  <Field int mCurrentPosition>
		//   13   30:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
		//   14   33:ldc1            #118 <String ", dir:">
		//   15   35:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
		//   16   38:aload_0         
		//   17   39:getfield        #120 <Field int mItemDirection>
		//   18   42:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
		//   19   45:ldc1            #122 <String ", offset:">
		//   20   47:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
		//   21   50:aload_0         
		//   22   51:getfield        #124 <Field int mOffset>
		//   23   54:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
		//   24   57:ldc1            #126 <String ", layoutDir:">
		//   25   59:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
		//   26   62:aload_0         
		//   27   63:getfield        #128 <Field int mLayoutDirection>
		//   28   66:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
		//   29   69:invokevirtual   #132 <Method String StringBuilder.toString()>
		//   30   72:invokestatic    #138 <Method int Log.d(String, String)>
		//   31   75:pop             
		//   32   76:return          
		}

		View next(RecyclerView.Recycler recycler)
		{
			if(mScrapList != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #48  <Field List mScrapList>
		//*   2    4:ifnull          12
			{
				return nextViewFromScrapList();
		//    3    7:aload_0         
		//    4    8:invokespecial   #142 <Method View nextViewFromScrapList()>
		//    5   11:areturn         
			} else
			{
				recycler = ((RecyclerView.Recycler) (recycler.getViewForPosition(mCurrentPosition)));
		//    6   12:aload_1         
		//    7   13:aload_0         
		//    8   14:getfield        #81  <Field int mCurrentPosition>
		//    9   17:invokevirtual   #148 <Method View RecyclerView$Recycler.getViewForPosition(int)>
		//   10   20:astore_1        
				mCurrentPosition = mCurrentPosition + mItemDirection;
		//   11   21:aload_0         
		//   12   22:aload_0         
		//   13   23:getfield        #81  <Field int mCurrentPosition>
		//   14   26:aload_0         
		//   15   27:getfield        #120 <Field int mItemDirection>
		//   16   30:iadd            
		//   17   31:putfield        #81  <Field int mCurrentPosition>
				return ((View) (recycler));
		//   18   34:aload_1         
		//   19   35:areturn         
			}
		}

		public View nextViewInLimitedList(View view)
		{
			int l = mScrapList.size();
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field List mScrapList>
		//    2    4:invokeinterface #57  <Method int List.size()>
		//    3    9:istore          5
			View view1 = null;
		//    4   11:aconst_null     
		//    5   12:astore          6
			int i = 0x7fffffff;
		//    6   14:ldc1            #149 <Int 0x7fffffff>
		//    7   16:istore_2        
			int j = 0;
		//    8   17:iconst_0        
		//    9   18:istore_3        
			while(j < l) 
		//*  10   19:iload_3         
		//*  11   20:iload           5
		//*  12   22:icmpge          126
			{
				View view2 = ((RecyclerView.ViewHolder)mScrapList.get(j)).itemView;
		//   13   25:aload_0         
		//   14   26:getfield        #48  <Field List mScrapList>
		//   15   29:iload_3         
		//   16   30:invokeinterface #61  <Method Object List.get(int)>
		//   17   35:checkcast       #63  <Class RecyclerView$ViewHolder>
		//   18   38:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
		//   19   41:astore          7
				RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view2.getLayoutParams();
		//   20   43:aload           7
		//   21   45:invokevirtual   #73  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   22   48:checkcast       #75  <Class RecyclerView$LayoutParams>
		//   23   51:astore          8
				if(view2 != view && !layoutparams.isItemRemoved())
		//*  24   53:aload           7
		//*  25   55:aload_1         
		//*  26   56:if_acmpeq       123
		//*  27   59:aload           8
		//*  28   61:invokevirtual   #79  <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
		//*  29   64:ifeq            74
		//*  30   67:iload_3         
		//*  31   68:iconst_1        
		//*  32   69:iadd            
		//*  33   70:istore_3        
		//*  34   71:goto            19
				{
					int k = (layoutparams.getViewLayoutPosition() - mCurrentPosition) * mItemDirection;
		//   35   74:aload           8
		//   36   76:invokevirtual   #84  <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
		//   37   79:aload_0         
		//   38   80:getfield        #81  <Field int mCurrentPosition>
		//   39   83:isub            
		//   40   84:aload_0         
		//   41   85:getfield        #120 <Field int mItemDirection>
		//   42   88:imul            
		//   43   89:istore          4
					if(k >= 0 && k < i)
		//*  44   91:iload           4
		//*  45   93:ifge            99
		//*  46   96:goto            67
		//*  47   99:iload           4
		//*  48  101:iload_2         
		//*  49  102:icmpge          123
					{
						if(k == 0)
		//*  50  105:iload           4
		//*  51  107:ifne            113
							return view2;
		//   52  110:aload           7
		//   53  112:areturn         
						view1 = view2;
		//   54  113:aload           7
		//   55  115:astore          6
						i = k;
		//   56  117:iload           4
		//   57  119:istore_2        
					}
				}
				j++;
			}
		//*  58  120:goto            67
		//*  59  123:goto            67
			return view1;
		//   60  126:aload           6
		//   61  128:areturn         
		}

		static final int INVALID_LAYOUT = 0x80000000;
		static final int ITEM_DIRECTION_HEAD = -1;
		static final int ITEM_DIRECTION_TAIL = 1;
		static final int LAYOUT_END = 1;
		static final int LAYOUT_START = -1;
		static final int SCROLLING_OFFSET_NaN = 0x80000000;
		static final String TAG = "LLM#LayoutState";
		int mAvailable;
		int mCurrentPosition;
		int mExtra;
		boolean mInfinite;
		boolean mIsPreLayout;
		int mItemDirection;
		int mLastScrollDelta;
		int mLayoutDirection;
		int mOffset;
		boolean mRecycle;
		List mScrapList;
		int mScrollingOffset;

		LayoutState()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #40  <Method void Object()>
			mRecycle = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #42  <Field boolean mRecycle>
			mExtra = 0;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #44  <Field int mExtra>
			mIsPreLayout = false;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #46  <Field boolean mIsPreLayout>
			mScrapList = null;
		//   11   19:aload_0         
		//   12   20:aconst_null     
		//   13   21:putfield        #48  <Field List mScrapList>
		//   14   24:return          
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

		boolean hasValidAnchor()
		{
			return mAnchorPosition >= 0;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field int mAnchorPosition>
		//    2    4:iflt            9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		void invalidateAnchor()
		{
			mAnchorPosition = -1;
		//    0    0:aload_0         
		//    1    1:iconst_m1       
		//    2    2:putfield        #41  <Field int mAnchorPosition>
		//    3    5:return          
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			parcel.writeInt(mAnchorPosition);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #41  <Field int mAnchorPosition>
		//    3    5:invokevirtual   #56  <Method void Parcel.writeInt(int)>
			parcel.writeInt(mAnchorOffset);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #43  <Field int mAnchorOffset>
		//    7   13:invokevirtual   #56  <Method void Parcel.writeInt(int)>
			if(mAnchorLayoutFromEnd)
		//*   8   16:aload_0         
		//*   9   17:getfield        #45  <Field boolean mAnchorLayoutFromEnd>
		//*  10   20:ifeq            31
				i = 1;
		//   11   23:iconst_1        
		//   12   24:istore_2        
			else
		//*  13   25:aload_1         
		//*  14   26:iload_2         
		//*  15   27:invokevirtual   #56  <Method void Parcel.writeInt(int)>
		//*  16   30:return          
				i = 0;
		//   17   31:iconst_0        
		//   18   32:istore_2        
			parcel.writeInt(i);
		//*  19   33:goto            25
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel);
			//    0    0:new             #9   <Class LinearLayoutManager$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void LinearLayoutManager$SavedState(Parcel)>
			//    4    8:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #25  <Method LinearLayoutManager$SavedState createFromParcel(Parcel)>
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
			//    2    2:invokevirtual   #30  <Method LinearLayoutManager$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		boolean mAnchorLayoutFromEnd;
		int mAnchorOffset;
		int mAnchorPosition;

		static 
		{
		//    0    0:new             #11  <Class LinearLayoutManager$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #28  <Method void LinearLayoutManager$SavedState$1()>
		//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #32  <Method void Object()>
		//    2    4:return          
		}

		SavedState(Parcel parcel)
		{
			boolean flag = true;
		//    0    0:iconst_1        
		//    1    1:istore_2        
			super();
		//    2    2:aload_0         
		//    3    3:invokespecial   #32  <Method void Object()>
			mAnchorPosition = parcel.readInt();
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #39  <Method int Parcel.readInt()>
		//    7   11:putfield        #41  <Field int mAnchorPosition>
			mAnchorOffset = parcel.readInt();
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:invokevirtual   #39  <Method int Parcel.readInt()>
		//   11   19:putfield        #43  <Field int mAnchorOffset>
			if(parcel.readInt() != 1)
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #39  <Method int Parcel.readInt()>
		//*  14   26:iconst_1        
		//*  15   27:icmpne          36
		//*  16   30:aload_0         
		//*  17   31:iload_2         
		//*  18   32:putfield        #45  <Field boolean mAnchorLayoutFromEnd>
		//*  19   35:return          
				flag = false;
		//   20   36:iconst_0        
		//   21   37:istore_2        
			mAnchorLayoutFromEnd = flag;
		//*  22   38:goto            30
		}

		public SavedState(SavedState savedstate)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #32  <Method void Object()>
			mAnchorPosition = savedstate.mAnchorPosition;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:getfield        #41  <Field int mAnchorPosition>
		//    5    9:putfield        #41  <Field int mAnchorPosition>
			mAnchorOffset = savedstate.mAnchorOffset;
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:getfield        #43  <Field int mAnchorOffset>
		//    9   17:putfield        #43  <Field int mAnchorOffset>
			mAnchorLayoutFromEnd = savedstate.mAnchorLayoutFromEnd;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:getfield        #45  <Field boolean mAnchorLayoutFromEnd>
		//   13   25:putfield        #45  <Field boolean mAnchorLayoutFromEnd>
		//   14   28:return          
		}
	}


	public LinearLayoutManager(Context context)
	{
		this(context, 1, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:iconst_0        
	//    4    4:invokespecial   #63  <Method void LinearLayoutManager(Context, int, boolean)>
	//    5    7:return          
	}

	public LinearLayoutManager(Context context, int i, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void RecyclerView$LayoutManager()>
		mReverseLayout = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #69  <Field boolean mReverseLayout>
		mShouldReverseLayout = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #71  <Field boolean mShouldReverseLayout>
		mStackFromEnd = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #73  <Field boolean mStackFromEnd>
		mSmoothScrollbarEnabled = true;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #75  <Field boolean mSmoothScrollbarEnabled>
		mPendingScrollPosition = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #77  <Field int mPendingScrollPosition>
		mPendingScrollPositionOffset = 0x80000000;
	//   17   29:aload_0         
	//   18   30:ldc1            #29  <Int 0x80000000>
	//   19   32:putfield        #79  <Field int mPendingScrollPositionOffset>
		mPendingSavedState = null;
	//   20   35:aload_0         
	//   21   36:aconst_null     
	//   22   37:putfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
		mAnchorInfo = new AnchorInfo();
	//   23   40:aload_0         
	//   24   41:new             #10  <Class LinearLayoutManager$AnchorInfo>
	//   25   44:dup             
	//   26   45:aload_0         
	//   27   46:invokespecial   #84  <Method void LinearLayoutManager$AnchorInfo(LinearLayoutManager)>
	//   28   49:putfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
		mLayoutChunkResult = new LayoutChunkResult();
	//   29   52:aload_0         
	//   30   53:new             #13  <Class LinearLayoutManager$LayoutChunkResult>
	//   31   56:dup             
	//   32   57:invokespecial   #87  <Method void LinearLayoutManager$LayoutChunkResult()>
	//   33   60:putfield        #89  <Field LinearLayoutManager$LayoutChunkResult mLayoutChunkResult>
		mInitialPrefetchItemCount = 2;
	//   34   63:aload_0         
	//   35   64:iconst_2        
	//   36   65:putfield        #91  <Field int mInitialPrefetchItemCount>
		setOrientation(i);
	//   37   68:aload_0         
	//   38   69:iload_2         
	//   39   70:invokevirtual   #95  <Method void setOrientation(int)>
		setReverseLayout(flag);
	//   40   73:aload_0         
	//   41   74:iload_3         
	//   42   75:invokevirtual   #99  <Method void setReverseLayout(boolean)>
		setAutoMeasureEnabled(true);
	//   43   78:aload_0         
	//   44   79:iconst_1        
	//   45   80:invokevirtual   #102 <Method void setAutoMeasureEnabled(boolean)>
	//   46   83:return          
	}

	public LinearLayoutManager(Context context, AttributeSet attributeset, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void RecyclerView$LayoutManager()>
		mReverseLayout = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #69  <Field boolean mReverseLayout>
		mShouldReverseLayout = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #71  <Field boolean mShouldReverseLayout>
		mStackFromEnd = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #73  <Field boolean mStackFromEnd>
		mSmoothScrollbarEnabled = true;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #75  <Field boolean mSmoothScrollbarEnabled>
		mPendingScrollPosition = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #77  <Field int mPendingScrollPosition>
		mPendingScrollPositionOffset = 0x80000000;
	//   17   29:aload_0         
	//   18   30:ldc1            #29  <Int 0x80000000>
	//   19   32:putfield        #79  <Field int mPendingScrollPositionOffset>
		mPendingSavedState = null;
	//   20   35:aload_0         
	//   21   36:aconst_null     
	//   22   37:putfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
		mAnchorInfo = new AnchorInfo();
	//   23   40:aload_0         
	//   24   41:new             #10  <Class LinearLayoutManager$AnchorInfo>
	//   25   44:dup             
	//   26   45:aload_0         
	//   27   46:invokespecial   #84  <Method void LinearLayoutManager$AnchorInfo(LinearLayoutManager)>
	//   28   49:putfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
		mLayoutChunkResult = new LayoutChunkResult();
	//   29   52:aload_0         
	//   30   53:new             #13  <Class LinearLayoutManager$LayoutChunkResult>
	//   31   56:dup             
	//   32   57:invokespecial   #87  <Method void LinearLayoutManager$LayoutChunkResult()>
	//   33   60:putfield        #89  <Field LinearLayoutManager$LayoutChunkResult mLayoutChunkResult>
		mInitialPrefetchItemCount = 2;
	//   34   63:aload_0         
	//   35   64:iconst_2        
	//   36   65:putfield        #91  <Field int mInitialPrefetchItemCount>
		context = ((Context) (getProperties(context, attributeset, i, j)));
	//   37   68:aload_1         
	//   38   69:aload_2         
	//   39   70:iload_3         
	//   40   71:iload           4
	//   41   73:invokestatic    #107 <Method RecyclerView$LayoutManager$Properties getProperties(Context, AttributeSet, int, int)>
	//   42   76:astore_1        
		setOrientation(((RecyclerView.LayoutManager.Properties) (context)).orientation);
	//   43   77:aload_0         
	//   44   78:aload_1         
	//   45   79:getfield        #112 <Field int RecyclerView$LayoutManager$Properties.orientation>
	//   46   82:invokevirtual   #95  <Method void setOrientation(int)>
		setReverseLayout(((RecyclerView.LayoutManager.Properties) (context)).reverseLayout);
	//   47   85:aload_0         
	//   48   86:aload_1         
	//   49   87:getfield        #115 <Field boolean RecyclerView$LayoutManager$Properties.reverseLayout>
	//   50   90:invokevirtual   #99  <Method void setReverseLayout(boolean)>
		setStackFromEnd(((RecyclerView.LayoutManager.Properties) (context)).stackFromEnd);
	//   51   93:aload_0         
	//   52   94:aload_1         
	//   53   95:getfield        #118 <Field boolean RecyclerView$LayoutManager$Properties.stackFromEnd>
	//   54   98:invokevirtual   #121 <Method void setStackFromEnd(boolean)>
		setAutoMeasureEnabled(true);
	//   55  101:aload_0         
	//   56  102:iconst_1        
	//   57  103:invokevirtual   #102 <Method void setAutoMeasureEnabled(boolean)>
	//   58  106:return          
	}

	private int computeScrollExtent(RecyclerView.State state)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(getChildCount() == 0)
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #127 <Method int getChildCount()>
	//*   4    6:ifne            11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		ensureLayoutState();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #130 <Method void ensureLayoutState()>
		OrientationHelper orientationhelper = mOrientationHelper;
	//    9   15:aload_0         
	//   10   16:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   11   19:astore          4
		boolean flag;
		View view;
		if(!mSmoothScrollbarEnabled)
	//*  12   21:aload_0         
	//*  13   22:getfield        #75  <Field boolean mSmoothScrollbarEnabled>
	//*  14   25:ifne            69
			flag = true;
	//   15   28:iconst_1        
	//   16   29:istore_2        
		else
	//*  17   30:aload_0         
	//*  18   31:iload_2         
	//*  19   32:iconst_1        
	//*  20   33:invokespecial   #136 <Method View findFirstVisibleChildClosestToStart(boolean, boolean)>
	//*  21   36:astore          5
	//*  22   38:iload_3         
	//*  23   39:istore_2        
	//*  24   40:aload_0         
	//*  25   41:getfield        #75  <Field boolean mSmoothScrollbarEnabled>
	//*  26   44:ifne            49
	//*  27   47:iconst_1        
	//*  28   48:istore_2        
	//*  29   49:aload_1         
	//*  30   50:aload           4
	//*  31   52:aload           5
	//*  32   54:aload_0         
	//*  33   55:iload_2         
	//*  34   56:iconst_1        
	//*  35   57:invokespecial   #139 <Method View findFirstVisibleChildClosestToEnd(boolean, boolean)>
	//*  36   60:aload_0         
	//*  37   61:aload_0         
	//*  38   62:getfield        #75  <Field boolean mSmoothScrollbarEnabled>
	//*  39   65:invokestatic    #144 <Method int ScrollbarHelper.computeScrollExtent(RecyclerView$State, OrientationHelper, View, View, RecyclerView$LayoutManager, boolean)>
	//*  40   68:ireturn         
			flag = false;
	//   41   69:iconst_0        
	//   42   70:istore_2        
		view = findFirstVisibleChildClosestToStart(flag, true);
		flag = flag1;
		if(!mSmoothScrollbarEnabled)
			flag = true;
		return ScrollbarHelper.computeScrollExtent(state, orientationhelper, view, findFirstVisibleChildClosestToEnd(flag, true), ((RecyclerView.LayoutManager) (this)), mSmoothScrollbarEnabled);
	//*  43   71:goto            30
	}

	private int computeScrollOffset(RecyclerView.State state)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(getChildCount() == 0)
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #127 <Method int getChildCount()>
	//*   4    6:ifne            11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		ensureLayoutState();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #130 <Method void ensureLayoutState()>
		OrientationHelper orientationhelper = mOrientationHelper;
	//    9   15:aload_0         
	//   10   16:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   11   19:astore          4
		boolean flag;
		View view;
		if(!mSmoothScrollbarEnabled)
	//*  12   21:aload_0         
	//*  13   22:getfield        #75  <Field boolean mSmoothScrollbarEnabled>
	//*  14   25:ifne            73
			flag = true;
	//   15   28:iconst_1        
	//   16   29:istore_2        
		else
	//*  17   30:aload_0         
	//*  18   31:iload_2         
	//*  19   32:iconst_1        
	//*  20   33:invokespecial   #136 <Method View findFirstVisibleChildClosestToStart(boolean, boolean)>
	//*  21   36:astore          5
	//*  22   38:iload_3         
	//*  23   39:istore_2        
	//*  24   40:aload_0         
	//*  25   41:getfield        #75  <Field boolean mSmoothScrollbarEnabled>
	//*  26   44:ifne            49
	//*  27   47:iconst_1        
	//*  28   48:istore_2        
	//*  29   49:aload_1         
	//*  30   50:aload           4
	//*  31   52:aload           5
	//*  32   54:aload_0         
	//*  33   55:iload_2         
	//*  34   56:iconst_1        
	//*  35   57:invokespecial   #139 <Method View findFirstVisibleChildClosestToEnd(boolean, boolean)>
	//*  36   60:aload_0         
	//*  37   61:aload_0         
	//*  38   62:getfield        #75  <Field boolean mSmoothScrollbarEnabled>
	//*  39   65:aload_0         
	//*  40   66:getfield        #71  <Field boolean mShouldReverseLayout>
	//*  41   69:invokestatic    #148 <Method int ScrollbarHelper.computeScrollOffset(RecyclerView$State, OrientationHelper, View, View, RecyclerView$LayoutManager, boolean, boolean)>
	//*  42   72:ireturn         
			flag = false;
	//   43   73:iconst_0        
	//   44   74:istore_2        
		view = findFirstVisibleChildClosestToStart(flag, true);
		flag = flag1;
		if(!mSmoothScrollbarEnabled)
			flag = true;
		return ScrollbarHelper.computeScrollOffset(state, orientationhelper, view, findFirstVisibleChildClosestToEnd(flag, true), ((RecyclerView.LayoutManager) (this)), mSmoothScrollbarEnabled, mShouldReverseLayout);
	//*  45   75:goto            30
	}

	private int computeScrollRange(RecyclerView.State state)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(getChildCount() == 0)
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #127 <Method int getChildCount()>
	//*   4    6:ifne            11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		ensureLayoutState();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #130 <Method void ensureLayoutState()>
		OrientationHelper orientationhelper = mOrientationHelper;
	//    9   15:aload_0         
	//   10   16:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   11   19:astore          4
		boolean flag;
		View view;
		if(!mSmoothScrollbarEnabled)
	//*  12   21:aload_0         
	//*  13   22:getfield        #75  <Field boolean mSmoothScrollbarEnabled>
	//*  14   25:ifne            69
			flag = true;
	//   15   28:iconst_1        
	//   16   29:istore_2        
		else
	//*  17   30:aload_0         
	//*  18   31:iload_2         
	//*  19   32:iconst_1        
	//*  20   33:invokespecial   #136 <Method View findFirstVisibleChildClosestToStart(boolean, boolean)>
	//*  21   36:astore          5
	//*  22   38:iload_3         
	//*  23   39:istore_2        
	//*  24   40:aload_0         
	//*  25   41:getfield        #75  <Field boolean mSmoothScrollbarEnabled>
	//*  26   44:ifne            49
	//*  27   47:iconst_1        
	//*  28   48:istore_2        
	//*  29   49:aload_1         
	//*  30   50:aload           4
	//*  31   52:aload           5
	//*  32   54:aload_0         
	//*  33   55:iload_2         
	//*  34   56:iconst_1        
	//*  35   57:invokespecial   #139 <Method View findFirstVisibleChildClosestToEnd(boolean, boolean)>
	//*  36   60:aload_0         
	//*  37   61:aload_0         
	//*  38   62:getfield        #75  <Field boolean mSmoothScrollbarEnabled>
	//*  39   65:invokestatic    #151 <Method int ScrollbarHelper.computeScrollRange(RecyclerView$State, OrientationHelper, View, View, RecyclerView$LayoutManager, boolean)>
	//*  40   68:ireturn         
			flag = false;
	//   41   69:iconst_0        
	//   42   70:istore_2        
		view = findFirstVisibleChildClosestToStart(flag, true);
		flag = flag1;
		if(!mSmoothScrollbarEnabled)
			flag = true;
		return ScrollbarHelper.computeScrollRange(state, orientationhelper, view, findFirstVisibleChildClosestToEnd(flag, true), ((RecyclerView.LayoutManager) (this)), mSmoothScrollbarEnabled);
	//*  43   71:goto            30
	}

	private View findFirstPartiallyOrCompletelyInvisibleChild(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #127 <Method int getChildCount()>
	//    4    6:invokevirtual   #157 <Method View findOnePartiallyOrCompletelyInvisibleChild(int, int)>
	//    5    9:areturn         
	}

	private View findFirstReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		return findReferenceChild(recycler, state, 0, getChildCount(), state.getItemCount());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:aload_0         
	//    5    5:invokevirtual   #127 <Method int getChildCount()>
	//    6    8:aload_2         
	//    7    9:invokevirtual   #163 <Method int RecyclerView$State.getItemCount()>
	//    8   12:invokevirtual   #167 <Method View findReferenceChild(RecyclerView$Recycler, RecyclerView$State, int, int, int)>
	//    9   15:areturn         
	}

	private View findFirstVisibleChildClosestToEnd(boolean flag, boolean flag1)
	{
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            19
			return findOneVisibleChild(0, getChildCount(), flag, flag1);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:aload_0         
	//    6   10:invokevirtual   #127 <Method int getChildCount()>
	//    7   13:iload_1         
	//    8   14:iload_2         
	//    9   15:invokevirtual   #171 <Method View findOneVisibleChild(int, int, boolean, boolean)>
	//   10   18:areturn         
		else
			return findOneVisibleChild(getChildCount() - 1, -1, flag, flag1);
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:invokevirtual   #127 <Method int getChildCount()>
	//   14   24:iconst_1        
	//   15   25:isub            
	//   16   26:iconst_m1       
	//   17   27:iload_1         
	//   18   28:iload_2         
	//   19   29:invokevirtual   #171 <Method View findOneVisibleChild(int, int, boolean, boolean)>
	//   20   32:areturn         
	}

	private View findFirstVisibleChildClosestToStart(boolean flag, boolean flag1)
	{
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            21
			return findOneVisibleChild(getChildCount() - 1, -1, flag, flag1);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #127 <Method int getChildCount()>
	//    6   12:iconst_1        
	//    7   13:isub            
	//    8   14:iconst_m1       
	//    9   15:iload_1         
	//   10   16:iload_2         
	//   11   17:invokevirtual   #171 <Method View findOneVisibleChild(int, int, boolean, boolean)>
	//   12   20:areturn         
		else
			return findOneVisibleChild(0, getChildCount(), flag, flag1);
	//   13   21:aload_0         
	//   14   22:iconst_0        
	//   15   23:aload_0         
	//   16   24:invokevirtual   #127 <Method int getChildCount()>
	//   17   27:iload_1         
	//   18   28:iload_2         
	//   19   29:invokevirtual   #171 <Method View findOneVisibleChild(int, int, boolean, boolean)>
	//   20   32:areturn         
	}

	private View findLastPartiallyOrCompletelyInvisibleChild(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #127 <Method int getChildCount()>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:iconst_m1       
	//    6    8:invokevirtual   #157 <Method View findOnePartiallyOrCompletelyInvisibleChild(int, int)>
	//    7   11:areturn         
	}

	private View findLastReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		return findReferenceChild(recycler, state, getChildCount() - 1, -1, state.getItemCount());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:invokevirtual   #127 <Method int getChildCount()>
	//    5    7:iconst_1        
	//    6    8:isub            
	//    7    9:iconst_m1       
	//    8   10:aload_2         
	//    9   11:invokevirtual   #163 <Method int RecyclerView$State.getItemCount()>
	//   10   14:invokevirtual   #167 <Method View findReferenceChild(RecyclerView$Recycler, RecyclerView$State, int, int, int)>
	//   11   17:areturn         
	}

	private View findPartiallyOrCompletelyInvisibleChildClosestToEnd(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            14
			return findFirstPartiallyOrCompletelyInvisibleChild(recycler, state);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #176 <Method View findFirstPartiallyOrCompletelyInvisibleChild(RecyclerView$Recycler, RecyclerView$State)>
	//    7   13:areturn         
		else
			return findLastPartiallyOrCompletelyInvisibleChild(recycler, state);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #178 <Method View findLastPartiallyOrCompletelyInvisibleChild(RecyclerView$Recycler, RecyclerView$State)>
	//   12   20:areturn         
	}

	private View findPartiallyOrCompletelyInvisibleChildClosestToStart(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            14
			return findLastPartiallyOrCompletelyInvisibleChild(recycler, state);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #178 <Method View findLastPartiallyOrCompletelyInvisibleChild(RecyclerView$Recycler, RecyclerView$State)>
	//    7   13:areturn         
		else
			return findFirstPartiallyOrCompletelyInvisibleChild(recycler, state);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #176 <Method View findFirstPartiallyOrCompletelyInvisibleChild(RecyclerView$Recycler, RecyclerView$State)>
	//   12   20:areturn         
	}

	private View findReferenceChildClosestToEnd(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            14
			return findFirstReferenceChild(recycler, state);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #182 <Method View findFirstReferenceChild(RecyclerView$Recycler, RecyclerView$State)>
	//    7   13:areturn         
		else
			return findLastReferenceChild(recycler, state);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #184 <Method View findLastReferenceChild(RecyclerView$Recycler, RecyclerView$State)>
	//   12   20:areturn         
	}

	private View findReferenceChildClosestToStart(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            14
			return findLastReferenceChild(recycler, state);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #184 <Method View findLastReferenceChild(RecyclerView$Recycler, RecyclerView$State)>
	//    7   13:areturn         
		else
			return findFirstReferenceChild(recycler, state);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #182 <Method View findFirstReferenceChild(RecyclerView$Recycler, RecyclerView$State)>
	//   12   20:areturn         
	}

	private int fixLayoutEndGap(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean flag)
	{
		int j = mOrientationHelper.getEndAfterPadding() - i;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//    2    4:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//    3    7:iload_1         
	//    4    8:isub            
	//    5    9:istore          5
		if(j > 0)
	//*   6   11:iload           5
	//*   7   13:ifle            75
		{
			int k = -scrollBy(-j, recycler, state);
	//    8   16:aload_0         
	//    9   17:iload           5
	//   10   19:ineg            
	//   11   20:aload_2         
	//   12   21:aload_3         
	//   13   22:invokevirtual   #196 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//   14   25:ineg            
	//   15   26:istore          6
			j = k;
	//   16   28:iload           6
	//   17   30:istore          5
			if(flag)
	//*  18   32:iload           4
	//*  19   34:ifeq            72
			{
				i = mOrientationHelper.getEndAfterPadding() - (i + k);
	//   20   37:aload_0         
	//   21   38:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   22   41:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//   23   44:iload_1         
	//   24   45:iload           6
	//   25   47:iadd            
	//   26   48:isub            
	//   27   49:istore_1        
				j = k;
	//   28   50:iload           6
	//   29   52:istore          5
				if(i > 0)
	//*  30   54:iload_1         
	//*  31   55:ifle            72
				{
					mOrientationHelper.offsetChildren(i);
	//   32   58:aload_0         
	//   33   59:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   34   62:iload_1         
	//   35   63:invokevirtual   #199 <Method void OrientationHelper.offsetChildren(int)>
					j = k + i;
	//   36   66:iload           6
	//   37   68:iload_1         
	//   38   69:iadd            
	//   39   70:istore          5
				}
			}
			return j;
	//   40   72:iload           5
	//   41   74:ireturn         
		} else
		{
			return 0;
	//   42   75:iconst_0        
	//   43   76:ireturn         
		}
	}

	private int fixLayoutStartGap(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean flag)
	{
		int j = i - mOrientationHelper.getStartAfterPadding();
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//    3    5:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//    4    8:isub            
	//    5    9:istore          5
		if(j > 0)
	//*   6   11:iload           5
	//*   7   13:ifle            75
		{
			int k = -scrollBy(j, recycler, state);
	//    8   16:aload_0         
	//    9   17:iload           5
	//   10   19:aload_2         
	//   11   20:aload_3         
	//   12   21:invokevirtual   #196 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//   13   24:ineg            
	//   14   25:istore          6
			j = k;
	//   15   27:iload           6
	//   16   29:istore          5
			if(flag)
	//*  17   31:iload           4
	//*  18   33:ifeq            72
			{
				i = (i + k) - mOrientationHelper.getStartAfterPadding();
	//   19   36:iload_1         
	//   20   37:iload           6
	//   21   39:iadd            
	//   22   40:aload_0         
	//   23   41:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   24   44:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//   25   47:isub            
	//   26   48:istore_1        
				j = k;
	//   27   49:iload           6
	//   28   51:istore          5
				if(i > 0)
	//*  29   53:iload_1         
	//*  30   54:ifle            72
				{
					mOrientationHelper.offsetChildren(-i);
	//   31   57:aload_0         
	//   32   58:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   33   61:iload_1         
	//   34   62:ineg            
	//   35   63:invokevirtual   #199 <Method void OrientationHelper.offsetChildren(int)>
					j = k - i;
	//   36   66:iload           6
	//   37   68:iload_1         
	//   38   69:isub            
	//   39   70:istore          5
				}
			}
			return j;
	//   40   72:iload           5
	//   41   74:ireturn         
		} else
		{
			return 0;
	//   42   75:iconst_0        
	//   43   76:ireturn         
		}
	}

	private View getChildClosestToEnd()
	{
		int i;
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            15
			i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
		else
	//*   5    9:aload_0         
	//*   6   10:iload_1         
	//*   7   11:invokevirtual   #209 <Method View getChildAt(int)>
	//*   8   14:areturn         
			i = getChildCount() - 1;
	//    9   15:aload_0         
	//   10   16:invokevirtual   #127 <Method int getChildCount()>
	//   11   19:iconst_1        
	//   12   20:isub            
	//   13   21:istore_1        
		return getChildAt(i);
	//*  14   22:goto            9
	}

	private View getChildClosestToStart()
	{
		int i;
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            20
			i = getChildCount() - 1;
	//    3    7:aload_0         
	//    4    8:invokevirtual   #127 <Method int getChildCount()>
	//    5   11:iconst_1        
	//    6   12:isub            
	//    7   13:istore_1        
		else
	//*   8   14:aload_0         
	//*   9   15:iload_1         
	//*  10   16:invokevirtual   #209 <Method View getChildAt(int)>
	//*  11   19:areturn         
			i = 0;
	//   12   20:iconst_0        
	//   13   21:istore_1        
		return getChildAt(i);
	//*  14   22:goto            14
	}

	private void layoutForPredictiveAnimations(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int j)
	{
		if(!state.willRunPredictiveAnimations() || getChildCount() == 0 || state.isPreLayout() || !supportsPredictiveItemAnimations())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #216 <Method boolean RecyclerView$State.willRunPredictiveAnimations()>
	//*   2    4:ifeq            28
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #127 <Method int getChildCount()>
	//*   5   11:ifeq            28
	//*   6   14:aload_2         
	//*   7   15:invokevirtual   #219 <Method boolean RecyclerView$State.isPreLayout()>
	//*   8   18:ifne            28
	//*   9   21:aload_0         
	//*  10   22:invokevirtual   #222 <Method boolean supportsPredictiveItemAnimations()>
	//*  11   25:ifne            29
			return;
	//   12   28:return          
		int k = 0;
	//   13   29:iconst_0        
	//   14   30:istore          5
		int l = 0;
	//   15   32:iconst_0        
	//   16   33:istore          6
		List list = recycler.getScrapList();
	//   17   35:aload_1         
	//   18   36:invokevirtual   #228 <Method List RecyclerView$Recycler.getScrapList()>
	//   19   39:astore          12
		int j2 = list.size();
	//   20   41:aload           12
	//   21   43:invokeinterface #233 <Method int List.size()>
	//   22   48:istore          9
		int k2 = getPosition(getChildAt(0));
	//   23   50:aload_0         
	//   24   51:aload_0         
	//   25   52:iconst_0        
	//   26   53:invokevirtual   #209 <Method View getChildAt(int)>
	//   27   56:invokevirtual   #237 <Method int getPosition(View)>
	//   28   59:istore          10
		int i1 = 0;
	//   29   61:iconst_0        
	//   30   62:istore          7
		while(i1 < j2) 
	//*  31   64:iload           7
	//*  32   66:iload           9
	//*  33   68:icmpge          229
		{
			RecyclerView.ViewHolder viewholder = (RecyclerView.ViewHolder)list.get(i1);
	//   34   71:aload           12
	//   35   73:iload           7
	//   36   75:invokeinterface #241 <Method Object List.get(int)>
	//   37   80:checkcast       #243 <Class RecyclerView$ViewHolder>
	//   38   83:astore          13
			int k1;
			if(viewholder.isRemoved())
	//*  39   85:aload           13
	//*  40   87:invokevirtual   #246 <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*  41   90:ifeq            130
			{
				int j1 = l;
	//   42   93:iload           6
	//   43   95:istore          8
				l = k;
	//   44   97:iload           5
	//   45   99:istore          6
				k = j1;
	//   46  101:iload           8
	//   47  103:istore          5
			} else
	//*  48  105:iload           7
	//*  49  107:iconst_1        
	//*  50  108:iadd            
	//*  51  109:istore          8
	//*  52  111:iload           6
	//*  53  113:istore          7
	//*  54  115:iload           5
	//*  55  117:istore          6
	//*  56  119:iload           7
	//*  57  121:istore          5
	//*  58  123:iload           8
	//*  59  125:istore          7
	//*  60  127:goto            64
			{
				int l1;
				boolean flag;
				if(viewholder.getLayoutPosition() < k2)
	//*  61  130:aload           13
	//*  62  132:invokevirtual   #249 <Method int RecyclerView$ViewHolder.getLayoutPosition()>
	//*  63  135:iload           10
	//*  64  137:icmpge          189
					flag = true;
	//   65  140:iconst_1        
	//   66  141:istore          11
				else
	//*  67  143:iload           11
	//*  68  145:aload_0         
	//*  69  146:getfield        #71  <Field boolean mShouldReverseLayout>
	//*  70  149:icmpeq          195
	//*  71  152:iconst_m1       
	//*  72  153:istore          8
	//*  73  155:iload           8
	//*  74  157:iconst_m1       
	//*  75  158:icmpne          201
	//*  76  161:aload_0         
	//*  77  162:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  78  165:aload           13
	//*  79  167:getfield        #253 <Field View RecyclerView$ViewHolder.itemView>
	//*  80  170:invokevirtual   #256 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//*  81  173:iload           5
	//*  82  175:iadd            
	//*  83  176:istore          8
	//*  84  178:iload           6
	//*  85  180:istore          5
	//*  86  182:iload           8
	//*  87  184:istore          6
	//*  88  186:goto            105
					flag = false;
	//   89  189:iconst_0        
	//   90  190:istore          11
				if(flag != mShouldReverseLayout)
					l1 = -1;
				else
	//*  91  192:goto            143
					l1 = 1;
	//   92  195:iconst_1        
	//   93  196:istore          8
				if(l1 == -1)
				{
					l1 = mOrientationHelper.getDecoratedMeasurement(viewholder.itemView) + k;
					k = l;
					l = l1;
				} else
	//*  94  198:goto            155
				{
					int i2 = mOrientationHelper.getDecoratedMeasurement(viewholder.itemView) + l;
	//   95  201:aload_0         
	//   96  202:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   97  205:aload           13
	//   98  207:getfield        #253 <Field View RecyclerView$ViewHolder.itemView>
	//   99  210:invokevirtual   #256 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//  100  213:iload           6
	//  101  215:iadd            
	//  102  216:istore          8
					l = k;
	//  103  218:iload           5
	//  104  220:istore          6
					k = i2;
	//  105  222:iload           8
	//  106  224:istore          5
				}
			}
			k1 = i1 + 1;
			i1 = l;
			l = k;
			k = i1;
			i1 = k1;
		}
	//* 107  226:goto            105
		mLayoutState.mScrapList = list;
	//  108  229:aload_0         
	//  109  230:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  110  233:aload           12
	//  111  235:putfield        #262 <Field List LinearLayoutManager$LayoutState.mScrapList>
		if(k > 0)
	//* 112  238:iload           5
	//* 113  240:ifle            292
		{
			updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i);
	//  114  243:aload_0         
	//  115  244:aload_0         
	//  116  245:aload_0         
	//  117  246:invokespecial   #264 <Method View getChildClosestToStart()>
	//  118  249:invokevirtual   #237 <Method int getPosition(View)>
	//  119  252:iload_3         
	//  120  253:invokespecial   #268 <Method void updateLayoutStateToFillStart(int, int)>
			mLayoutState.mExtra = k;
	//  121  256:aload_0         
	//  122  257:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  123  260:iload           5
	//  124  262:putfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
			mLayoutState.mAvailable = 0;
	//  125  265:aload_0         
	//  126  266:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  127  269:iconst_0        
	//  128  270:putfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
			mLayoutState.assignPositionFromScrapList();
	//  129  273:aload_0         
	//  130  274:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  131  277:invokevirtual   #277 <Method void LinearLayoutManager$LayoutState.assignPositionFromScrapList()>
			fill(recycler, mLayoutState, state, false);
	//  132  280:aload_0         
	//  133  281:aload_1         
	//  134  282:aload_0         
	//  135  283:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  136  286:aload_2         
	//  137  287:iconst_0        
	//  138  288:invokevirtual   #281 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//  139  291:pop             
		}
		if(l > 0)
	//* 140  292:iload           6
	//* 141  294:ifle            347
		{
			updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), j);
	//  142  297:aload_0         
	//  143  298:aload_0         
	//  144  299:aload_0         
	//  145  300:invokespecial   #283 <Method View getChildClosestToEnd()>
	//  146  303:invokevirtual   #237 <Method int getPosition(View)>
	//  147  306:iload           4
	//  148  308:invokespecial   #286 <Method void updateLayoutStateToFillEnd(int, int)>
			mLayoutState.mExtra = l;
	//  149  311:aload_0         
	//  150  312:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  151  315:iload           6
	//  152  317:putfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
			mLayoutState.mAvailable = 0;
	//  153  320:aload_0         
	//  154  321:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  155  324:iconst_0        
	//  156  325:putfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
			mLayoutState.assignPositionFromScrapList();
	//  157  328:aload_0         
	//  158  329:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  159  332:invokevirtual   #277 <Method void LinearLayoutManager$LayoutState.assignPositionFromScrapList()>
			fill(recycler, mLayoutState, state, false);
	//  160  335:aload_0         
	//  161  336:aload_1         
	//  162  337:aload_0         
	//  163  338:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  164  341:aload_2         
	//  165  342:iconst_0        
	//  166  343:invokevirtual   #281 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//  167  346:pop             
		}
		mLayoutState.mScrapList = null;
	//  168  347:aload_0         
	//  169  348:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  170  351:aconst_null     
	//  171  352:putfield        #262 <Field List LinearLayoutManager$LayoutState.mScrapList>
	//  172  355:return          
	}

	private void logChildren()
	{
		Log.d("LinearLayoutManager", "internal representation of views on the screen");
	//    0    0:ldc1            #36  <String "LinearLayoutManager">
	//    1    2:ldc2            #289 <String "internal representation of views on the screen">
	//    2    5:invokestatic    #295 <Method int Log.d(String, String)>
	//    3    8:pop             
		for(int i = 0; i < getChildCount(); i++)
	//*   4    9:iconst_0        
	//*   5   10:istore_1        
	//*   6   11:iload_1         
	//*   7   12:aload_0         
	//*   8   13:invokevirtual   #127 <Method int getChildCount()>
	//*   9   16:icmpge          79
		{
			View view = getChildAt(i);
	//   10   19:aload_0         
	//   11   20:iload_1         
	//   12   21:invokevirtual   #209 <Method View getChildAt(int)>
	//   13   24:astore_2        
			Log.d("LinearLayoutManager", (new StringBuilder()).append("item ").append(getPosition(view)).append(", coord:").append(mOrientationHelper.getDecoratedStart(view)).toString());
	//   14   25:ldc1            #36  <String "LinearLayoutManager">
	//   15   27:new             #297 <Class StringBuilder>
	//   16   30:dup             
	//   17   31:invokespecial   #298 <Method void StringBuilder()>
	//   18   34:ldc2            #300 <String "item ">
	//   19   37:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//   20   40:aload_0         
	//   21   41:aload_2         
	//   22   42:invokevirtual   #237 <Method int getPosition(View)>
	//   23   45:invokevirtual   #307 <Method StringBuilder StringBuilder.append(int)>
	//   24   48:ldc2            #309 <String ", coord:">
	//   25   51:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//   26   54:aload_0         
	//   27   55:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   28   58:aload_2         
	//   29   59:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//   30   62:invokevirtual   #307 <Method StringBuilder StringBuilder.append(int)>
	//   31   65:invokevirtual   #316 <Method String StringBuilder.toString()>
	//   32   68:invokestatic    #295 <Method int Log.d(String, String)>
	//   33   71:pop             
		}

	//   34   72:iload_1         
	//   35   73:iconst_1        
	//   36   74:iadd            
	//   37   75:istore_1        
	//*  38   76:goto            11
		Log.d("LinearLayoutManager", "==============");
	//   39   79:ldc1            #36  <String "LinearLayoutManager">
	//   40   81:ldc2            #318 <String "==============">
	//   41   84:invokestatic    #295 <Method int Log.d(String, String)>
	//   42   87:pop             
	//   43   88:return          
	}

	private void recycleByLayoutState(RecyclerView.Recycler recycler, LayoutState layoutstate)
	{
		if(!layoutstate.mRecycle || layoutstate.mInfinite)
	//*   0    0:aload_2         
	//*   1    1:getfield        #323 <Field boolean LinearLayoutManager$LayoutState.mRecycle>
	//*   2    4:ifeq            14
	//*   3    7:aload_2         
	//*   4    8:getfield        #326 <Field boolean LinearLayoutManager$LayoutState.mInfinite>
	//*   5   11:ifeq            15
			return;
	//    6   14:return          
		if(layoutstate.mLayoutDirection == -1)
	//*   7   15:aload_2         
	//*   8   16:getfield        #329 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//*   9   19:iconst_m1       
	//*  10   20:icmpne          33
		{
			recycleViewsFromEnd(recycler, layoutstate.mScrollingOffset);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:getfield        #332 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//   15   29:invokespecial   #336 <Method void recycleViewsFromEnd(RecyclerView$Recycler, int)>
			return;
	//   16   32:return          
		} else
		{
			recycleViewsFromStart(recycler, layoutstate.mScrollingOffset);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:getfield        #332 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//   21   39:invokespecial   #339 <Method void recycleViewsFromStart(RecyclerView$Recycler, int)>
			return;
	//   22   42:return          
		}
	}

	private void recycleChildren(RecyclerView.Recycler recycler, int i, int j)
	{
		if(i != j) goto _L2; else goto _L1
	//    0    0:iload_2         
	//    1    1:iload_3         
	//    2    2:icmpne          6
_L1:
		return;
	//    3    5:return          
_L2:
		int k;
		k = i;
	//    4    6:iload_2         
	//    5    7:istore          4
		if(j <= i)
			break; /* Loop/switch isn't completed */
	//    6    9:iload_3         
	//    7   10:iload_2         
	//    8   11:icmple          36
		j--;
	//    9   14:iload_3         
	//   10   15:iconst_1        
	//   11   16:isub            
	//   12   17:istore_3        
		while(j >= i) 
	//*  13   18:iload_3         
	//*  14   19:iload_2         
	//*  15   20:icmplt          5
		{
			removeAndRecycleViewAt(j, recycler);
	//   16   23:aload_0         
	//   17   24:iload_3         
	//   18   25:aload_1         
	//   19   26:invokevirtual   #345 <Method void removeAndRecycleViewAt(int, RecyclerView$Recycler)>
			j--;
	//   20   29:iload_3         
	//   21   30:iconst_1        
	//   22   31:isub            
	//   23   32:istore_3        
		}
		if(true) goto _L1; else goto _L3
	//   24   33:goto            18
_L3:
		while(k > j) 
	//*  25   36:iload           4
	//*  26   38:iload_3         
	//*  27   39:icmple          5
		{
			removeAndRecycleViewAt(k, recycler);
	//   28   42:aload_0         
	//   29   43:iload           4
	//   30   45:aload_1         
	//   31   46:invokevirtual   #345 <Method void removeAndRecycleViewAt(int, RecyclerView$Recycler)>
			k--;
	//   32   49:iload           4
	//   33   51:iconst_1        
	//   34   52:isub            
	//   35   53:istore          4
		}
		if(true) goto _L1; else goto _L4
	//   36   55:goto            36
_L4:
	}

	private void recycleViewsFromEnd(RecyclerView.Recycler recycler, int i)
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #127 <Method int getChildCount()>
	//    2    4:istore_3        
		if(i >= 0) goto _L2; else goto _L1
	//    3    5:iload_2         
	//    4    6:ifge            10
_L1:
		return;
	//    5    9:return          
_L2:
		int k;
		k = mOrientationHelper.getEnd() - i;
	//    6   10:aload_0         
	//    7   11:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//    8   14:invokevirtual   #348 <Method int OrientationHelper.getEnd()>
	//    9   17:iload_2         
	//   10   18:isub            
	//   11   19:istore          4
		if(!mShouldReverseLayout)
			break; /* Loop/switch isn't completed */
	//   12   21:aload_0         
	//   13   22:getfield        #71  <Field boolean mShouldReverseLayout>
	//   14   25:ifeq            85
		i = 0;
	//   15   28:iconst_0        
	//   16   29:istore_2        
		while(i < j) 
	//*  17   30:iload_2         
	//*  18   31:iload_3         
	//*  19   32:icmpge          9
		{
			View view = getChildAt(i);
	//   20   35:aload_0         
	//   21   36:iload_2         
	//   22   37:invokevirtual   #209 <Method View getChildAt(int)>
	//   23   40:astore          5
			if(mOrientationHelper.getDecoratedStart(view) < k || mOrientationHelper.getTransformedStartWithDecoration(view) < k)
	//*  24   42:aload_0         
	//*  25   43:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  26   46:aload           5
	//*  27   48:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  28   51:iload           4
	//*  29   53:icmplt          70
	//*  30   56:aload_0         
	//*  31   57:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  32   60:aload           5
	//*  33   62:invokevirtual   #351 <Method int OrientationHelper.getTransformedStartWithDecoration(View)>
	//*  34   65:iload           4
	//*  35   67:icmpge          78
			{
				recycleChildren(recycler, 0, i);
	//   36   70:aload_0         
	//   37   71:aload_1         
	//   38   72:iconst_0        
	//   39   73:iload_2         
	//   40   74:invokespecial   #353 <Method void recycleChildren(RecyclerView$Recycler, int, int)>
				return;
	//   41   77:return          
			}
			i++;
	//   42   78:iload_2         
	//   43   79:iconst_1        
	//   44   80:iadd            
	//   45   81:istore_2        
		}
		if(true) goto _L1; else goto _L3
	//   46   82:goto            30
_L3:
		i = j - 1;
	//   47   85:iload_3         
	//   48   86:iconst_1        
	//   49   87:isub            
	//   50   88:istore_2        
		while(i >= 0) 
	//*  51   89:iload_2         
	//*  52   90:iflt            9
		{
			View view1 = getChildAt(i);
	//   53   93:aload_0         
	//   54   94:iload_2         
	//   55   95:invokevirtual   #209 <Method View getChildAt(int)>
	//   56   98:astore          5
			if(mOrientationHelper.getDecoratedStart(view1) < k || mOrientationHelper.getTransformedStartWithDecoration(view1) < k)
	//*  57  100:aload_0         
	//*  58  101:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  59  104:aload           5
	//*  60  106:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  61  109:iload           4
	//*  62  111:icmplt          128
	//*  63  114:aload_0         
	//*  64  115:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  65  118:aload           5
	//*  66  120:invokevirtual   #351 <Method int OrientationHelper.getTransformedStartWithDecoration(View)>
	//*  67  123:iload           4
	//*  68  125:icmpge          138
			{
				recycleChildren(recycler, j - 1, i);
	//   69  128:aload_0         
	//   70  129:aload_1         
	//   71  130:iload_3         
	//   72  131:iconst_1        
	//   73  132:isub            
	//   74  133:iload_2         
	//   75  134:invokespecial   #353 <Method void recycleChildren(RecyclerView$Recycler, int, int)>
				return;
	//   76  137:return          
			}
			i--;
	//   77  138:iload_2         
	//   78  139:iconst_1        
	//   79  140:isub            
	//   80  141:istore_2        
		}
		if(true) goto _L1; else goto _L4
	//   81  142:goto            89
_L4:
	}

	private void recycleViewsFromStart(RecyclerView.Recycler recycler, int i)
	{
		if(i >= 0) goto _L2; else goto _L1
	//    0    0:iload_2         
	//    1    1:ifge            5
_L1:
		return;
	//    2    4:return          
_L2:
		int l;
		l = getChildCount();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #127 <Method int getChildCount()>
	//    5    9:istore          4
		if(!mShouldReverseLayout)
			break; /* Loop/switch isn't completed */
	//    6   11:aload_0         
	//    7   12:getfield        #71  <Field boolean mShouldReverseLayout>
	//    8   15:ifeq            78
		int j = l - 1;
	//    9   18:iload           4
	//   10   20:iconst_1        
	//   11   21:isub            
	//   12   22:istore_3        
		while(j >= 0) 
	//*  13   23:iload_3         
	//*  14   24:iflt            4
		{
			View view = getChildAt(j);
	//   15   27:aload_0         
	//   16   28:iload_3         
	//   17   29:invokevirtual   #209 <Method View getChildAt(int)>
	//   18   32:astore          5
			if(mOrientationHelper.getDecoratedEnd(view) > i || mOrientationHelper.getTransformedEndWithDecoration(view) > i)
	//*  19   34:aload_0         
	//*  20   35:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  21   38:aload           5
	//*  22   40:invokevirtual   #356 <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  23   43:iload_2         
	//*  24   44:icmpgt          60
	//*  25   47:aload_0         
	//*  26   48:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  27   51:aload           5
	//*  28   53:invokevirtual   #359 <Method int OrientationHelper.getTransformedEndWithDecoration(View)>
	//*  29   56:iload_2         
	//*  30   57:icmple          71
			{
				recycleChildren(recycler, l - 1, j);
	//   31   60:aload_0         
	//   32   61:aload_1         
	//   33   62:iload           4
	//   34   64:iconst_1        
	//   35   65:isub            
	//   36   66:iload_3         
	//   37   67:invokespecial   #353 <Method void recycleChildren(RecyclerView$Recycler, int, int)>
				return;
	//   38   70:return          
			}
			j--;
	//   39   71:iload_3         
	//   40   72:iconst_1        
	//   41   73:isub            
	//   42   74:istore_3        
		}
		if(true) goto _L1; else goto _L3
	//   43   75:goto            23
_L3:
		int k = 0;
	//   44   78:iconst_0        
	//   45   79:istore_3        
		while(k < l) 
	//*  46   80:iload_3         
	//*  47   81:iload           4
	//*  48   83:icmpge          4
		{
			View view1 = getChildAt(k);
	//   49   86:aload_0         
	//   50   87:iload_3         
	//   51   88:invokevirtual   #209 <Method View getChildAt(int)>
	//   52   91:astore          5
			if(mOrientationHelper.getDecoratedEnd(view1) > i || mOrientationHelper.getTransformedEndWithDecoration(view1) > i)
	//*  53   93:aload_0         
	//*  54   94:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  55   97:aload           5
	//*  56   99:invokevirtual   #356 <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  57  102:iload_2         
	//*  58  103:icmpgt          119
	//*  59  106:aload_0         
	//*  60  107:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  61  110:aload           5
	//*  62  112:invokevirtual   #359 <Method int OrientationHelper.getTransformedEndWithDecoration(View)>
	//*  63  115:iload_2         
	//*  64  116:icmple          127
			{
				recycleChildren(recycler, 0, k);
	//   65  119:aload_0         
	//   66  120:aload_1         
	//   67  121:iconst_0        
	//   68  122:iload_3         
	//   69  123:invokespecial   #353 <Method void recycleChildren(RecyclerView$Recycler, int, int)>
				return;
	//   70  126:return          
			}
			k++;
	//   71  127:iload_3         
	//   72  128:iconst_1        
	//   73  129:iadd            
	//   74  130:istore_3        
		}
		if(true) goto _L1; else goto _L4
	//   75  131:goto            80
_L4:
	}

	private void resolveShouldLayoutReverse()
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_1        
		if(mOrientation == 1 || !isLayoutRTL())
	//*   2    2:aload_0         
	//*   3    3:getfield        #362 <Field int mOrientation>
	//*   4    6:iconst_1        
	//*   5    7:icmpeq          17
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #365 <Method boolean isLayoutRTL()>
	//*   8   14:ifne            26
		{
			mShouldReverseLayout = mReverseLayout;
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #69  <Field boolean mReverseLayout>
	//   12   22:putfield        #71  <Field boolean mShouldReverseLayout>
			return;
	//   13   25:return          
		}
		if(mReverseLayout)
	//*  14   26:aload_0         
	//*  15   27:getfield        #69  <Field boolean mReverseLayout>
	//*  16   30:ifne            39
	//*  17   33:aload_0         
	//*  18   34:iload_1         
	//*  19   35:putfield        #71  <Field boolean mShouldReverseLayout>
	//*  20   38:return          
			flag = false;
	//   21   39:iconst_0        
	//   22   40:istore_1        
		mShouldReverseLayout = flag;
	//*  23   41:goto            33
	}

	private boolean updateAnchorFromChildren(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorinfo)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(getChildCount() != 0)
	//*   2    3:aload_0         
	//*   3    4:invokevirtual   #127 <Method int getChildCount()>
	//*   4    7:ifne            12
	//*   5   10:iconst_0        
	//*   6   11:ireturn         
		{
			View view = getFocusedChild();
	//    7   12:aload_0         
	//    8   13:invokevirtual   #370 <Method View getFocusedChild()>
	//    9   16:astore          5
			if(view != null && anchorinfo.isViewValidAsAnchor(view, state))
	//*  10   18:aload           5
	//*  11   20:ifnull          41
	//*  12   23:aload_3         
	//*  13   24:aload           5
	//*  14   26:aload_2         
	//*  15   27:invokevirtual   #374 <Method boolean LinearLayoutManager$AnchorInfo.isViewValidAsAnchor(View, RecyclerView$State)>
	//*  16   30:ifeq            41
			{
				anchorinfo.assignFromViewAndKeepVisibleRect(view);
	//   17   33:aload_3         
	//   18   34:aload           5
	//   19   36:invokevirtual   #378 <Method void LinearLayoutManager$AnchorInfo.assignFromViewAndKeepVisibleRect(View)>
				return true;
	//   20   39:iconst_1        
	//   21   40:ireturn         
			}
			if(mLastStackFromEnd == mStackFromEnd)
	//*  22   41:aload_0         
	//*  23   42:getfield        #380 <Field boolean mLastStackFromEnd>
	//*  24   45:aload_0         
	//*  25   46:getfield        #73  <Field boolean mStackFromEnd>
	//*  26   49:icmpne          10
			{
				if(anchorinfo.mLayoutFromEnd)
	//*  27   52:aload_3         
	//*  28   53:getfield        #383 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
	//*  29   56:ifeq            157
					recycler = ((RecyclerView.Recycler) (findReferenceChildClosestToEnd(recycler, state)));
	//   30   59:aload_0         
	//   31   60:aload_1         
	//   32   61:aload_2         
	//   33   62:invokespecial   #385 <Method View findReferenceChildClosestToEnd(RecyclerView$Recycler, RecyclerView$State)>
	//   34   65:astore_1        
				else
	//*  35   66:aload_1         
	//*  36   67:ifnull          10
	//*  37   70:aload_3         
	//*  38   71:aload_1         
	//*  39   72:invokevirtual   #388 <Method void LinearLayoutManager$AnchorInfo.assignFromView(View)>
	//*  40   75:aload_2         
	//*  41   76:invokevirtual   #219 <Method boolean RecyclerView$State.isPreLayout()>
	//*  42   79:ifne            155
	//*  43   82:aload_0         
	//*  44   83:invokevirtual   #222 <Method boolean supportsPredictiveItemAnimations()>
	//*  45   86:ifeq            155
	//*  46   89:aload_0         
	//*  47   90:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  48   93:aload_1         
	//*  49   94:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  50   97:aload_0         
	//*  51   98:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  52  101:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//*  53  104:icmpge          125
	//*  54  107:aload_0         
	//*  55  108:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  56  111:aload_1         
	//*  57  112:invokevirtual   #356 <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  58  115:aload_0         
	//*  59  116:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  60  119:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//*  61  122:icmpge          128
	//*  62  125:iconst_1        
	//*  63  126:istore          4
	//*  64  128:iload           4
	//*  65  130:ifeq            155
	//*  66  133:aload_3         
	//*  67  134:getfield        #383 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
	//*  68  137:ifeq            167
	//*  69  140:aload_0         
	//*  70  141:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  71  144:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//*  72  147:istore          4
	//*  73  149:aload_3         
	//*  74  150:iload           4
	//*  75  152:putfield        #391 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
	//*  76  155:iconst_1        
	//*  77  156:ireturn         
					recycler = ((RecyclerView.Recycler) (findReferenceChildClosestToStart(recycler, state)));
	//   78  157:aload_0         
	//   79  158:aload_1         
	//   80  159:aload_2         
	//   81  160:invokespecial   #393 <Method View findReferenceChildClosestToStart(RecyclerView$Recycler, RecyclerView$State)>
	//   82  163:astore_1        
				if(recycler != null)
				{
					anchorinfo.assignFromView(((View) (recycler)));
					if(!state.isPreLayout() && supportsPredictiveItemAnimations())
					{
						if(mOrientationHelper.getDecoratedStart(((View) (recycler))) >= mOrientationHelper.getEndAfterPadding() || mOrientationHelper.getDecoratedEnd(((View) (recycler))) < mOrientationHelper.getStartAfterPadding())
							flag = true;
						if(flag)
						{
							int i;
							if(anchorinfo.mLayoutFromEnd)
								i = mOrientationHelper.getEndAfterPadding();
							else
	//*  83  164:goto            66
								i = mOrientationHelper.getStartAfterPadding();
	//   84  167:aload_0         
	//   85  168:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   86  171:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//   87  174:istore          4
							anchorinfo.mCoordinate = i;
						}
					}
					return true;
				}
			}
		}
		return false;
	//*  88  176:goto            149
	}

	private boolean updateAnchorFromPendingData(RecyclerView.State state, AnchorInfo anchorinfo)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		if(state.isPreLayout() || mPendingScrollPosition == -1)
	//*   2    3:aload_1         
	//*   3    4:invokevirtual   #219 <Method boolean RecyclerView$State.isPreLayout()>
	//*   4    7:ifne            18
	//*   5   10:aload_0         
	//*   6   11:getfield        #77  <Field int mPendingScrollPosition>
	//*   7   14:iconst_m1       
	//*   8   15:icmpne          20
			return false;
	//    9   18:iconst_0        
	//   10   19:ireturn         
		if(mPendingScrollPosition < 0 || mPendingScrollPosition >= state.getItemCount())
	//*  11   20:aload_0         
	//*  12   21:getfield        #77  <Field int mPendingScrollPosition>
	//*  13   24:iflt            38
	//*  14   27:aload_0         
	//*  15   28:getfield        #77  <Field int mPendingScrollPosition>
	//*  16   31:aload_1         
	//*  17   32:invokevirtual   #163 <Method int RecyclerView$State.getItemCount()>
	//*  18   35:icmplt          51
		{
			mPendingScrollPosition = -1;
	//   19   38:aload_0         
	//   20   39:iconst_m1       
	//   21   40:putfield        #77  <Field int mPendingScrollPosition>
			mPendingScrollPositionOffset = 0x80000000;
	//   22   43:aload_0         
	//   23   44:ldc1            #29  <Int 0x80000000>
	//   24   46:putfield        #79  <Field int mPendingScrollPositionOffset>
			return false;
	//   25   49:iconst_0        
	//   26   50:ireturn         
		}
		anchorinfo.mPosition = mPendingScrollPosition;
	//   27   51:aload_2         
	//   28   52:aload_0         
	//   29   53:getfield        #77  <Field int mPendingScrollPosition>
	//   30   56:putfield        #398 <Field int LinearLayoutManager$AnchorInfo.mPosition>
		if(mPendingSavedState != null && mPendingSavedState.hasValidAnchor())
	//*  31   59:aload_0         
	//*  32   60:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*  33   63:ifnull          136
	//*  34   66:aload_0         
	//*  35   67:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*  36   70:invokevirtual   #401 <Method boolean LinearLayoutManager$SavedState.hasValidAnchor()>
	//*  37   73:ifeq            136
		{
			anchorinfo.mLayoutFromEnd = mPendingSavedState.mAnchorLayoutFromEnd;
	//   38   76:aload_2         
	//   39   77:aload_0         
	//   40   78:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   41   81:getfield        #404 <Field boolean LinearLayoutManager$SavedState.mAnchorLayoutFromEnd>
	//   42   84:putfield        #383 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
			if(anchorinfo.mLayoutFromEnd)
	//*  43   87:aload_2         
	//*  44   88:getfield        #383 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
	//*  45   91:ifeq            115
			{
				anchorinfo.mCoordinate = mOrientationHelper.getEndAfterPadding() - mPendingSavedState.mAnchorOffset;
	//   46   94:aload_2         
	//   47   95:aload_0         
	//   48   96:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   49   99:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//   50  102:aload_0         
	//   51  103:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   52  106:getfield        #407 <Field int LinearLayoutManager$SavedState.mAnchorOffset>
	//   53  109:isub            
	//   54  110:putfield        #391 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
				return true;
	//   55  113:iconst_1        
	//   56  114:ireturn         
			} else
			{
				anchorinfo.mCoordinate = mOrientationHelper.getStartAfterPadding() + mPendingSavedState.mAnchorOffset;
	//   57  115:aload_2         
	//   58  116:aload_0         
	//   59  117:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   60  120:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//   61  123:aload_0         
	//   62  124:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   63  127:getfield        #407 <Field int LinearLayoutManager$SavedState.mAnchorOffset>
	//   64  130:iadd            
	//   65  131:putfield        #391 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
				return true;
	//   66  134:iconst_1        
	//   67  135:ireturn         
			}
		}
		if(mPendingScrollPositionOffset == 0x80000000)
	//*  68  136:aload_0         
	//*  69  137:getfield        #79  <Field int mPendingScrollPositionOffset>
	//*  70  140:ldc1            #29  <Int 0x80000000>
	//*  71  142:icmpne          357
		{
			state = ((RecyclerView.State) (findViewByPosition(mPendingScrollPosition)));
	//   72  145:aload_0         
	//   73  146:aload_0         
	//   74  147:getfield        #77  <Field int mPendingScrollPosition>
	//   75  150:invokevirtual   #410 <Method View findViewByPosition(int)>
	//   76  153:astore_1        
			if(state != null)
	//*  77  154:aload_1         
	//*  78  155:ifnull          299
			{
				if(mOrientationHelper.getDecoratedMeasurement(((View) (state))) > mOrientationHelper.getTotalSpace())
	//*  79  158:aload_0         
	//*  80  159:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  81  162:aload_1         
	//*  82  163:invokevirtual   #256 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//*  83  166:aload_0         
	//*  84  167:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  85  170:invokevirtual   #413 <Method int OrientationHelper.getTotalSpace()>
	//*  86  173:icmple          182
				{
					anchorinfo.assignCoordinateFromPadding();
	//   87  176:aload_2         
	//   88  177:invokevirtual   #416 <Method void LinearLayoutManager$AnchorInfo.assignCoordinateFromPadding()>
					return true;
	//   89  180:iconst_1        
	//   90  181:ireturn         
				}
				if(mOrientationHelper.getDecoratedStart(((View) (state))) - mOrientationHelper.getStartAfterPadding() < 0)
	//*  91  182:aload_0         
	//*  92  183:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  93  186:aload_1         
	//*  94  187:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  95  190:aload_0         
	//*  96  191:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  97  194:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//*  98  197:isub            
	//*  99  198:ifge            219
				{
					anchorinfo.mCoordinate = mOrientationHelper.getStartAfterPadding();
	//  100  201:aload_2         
	//  101  202:aload_0         
	//  102  203:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  103  206:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//  104  209:putfield        #391 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
					anchorinfo.mLayoutFromEnd = false;
	//  105  212:aload_2         
	//  106  213:iconst_0        
	//  107  214:putfield        #383 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
					return true;
	//  108  217:iconst_1        
	//  109  218:ireturn         
				}
				if(mOrientationHelper.getEndAfterPadding() - mOrientationHelper.getDecoratedEnd(((View) (state))) < 0)
	//* 110  219:aload_0         
	//* 111  220:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//* 112  223:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//* 113  226:aload_0         
	//* 114  227:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//* 115  230:aload_1         
	//* 116  231:invokevirtual   #356 <Method int OrientationHelper.getDecoratedEnd(View)>
	//* 117  234:isub            
	//* 118  235:ifge            256
				{
					anchorinfo.mCoordinate = mOrientationHelper.getEndAfterPadding();
	//  119  238:aload_2         
	//  120  239:aload_0         
	//  121  240:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  122  243:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//  123  246:putfield        #391 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
					anchorinfo.mLayoutFromEnd = true;
	//  124  249:aload_2         
	//  125  250:iconst_1        
	//  126  251:putfield        #383 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
					return true;
	//  127  254:iconst_1        
	//  128  255:ireturn         
				}
				int i;
				if(anchorinfo.mLayoutFromEnd)
	//* 129  256:aload_2         
	//* 130  257:getfield        #383 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
	//* 131  260:ifeq            287
					i = mOrientationHelper.getDecoratedEnd(((View) (state))) + mOrientationHelper.getTotalSpaceChange();
	//  132  263:aload_0         
	//  133  264:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  134  267:aload_1         
	//  135  268:invokevirtual   #356 <Method int OrientationHelper.getDecoratedEnd(View)>
	//  136  271:aload_0         
	//  137  272:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  138  275:invokevirtual   #419 <Method int OrientationHelper.getTotalSpaceChange()>
	//  139  278:iadd            
	//  140  279:istore_3        
				else
	//* 141  280:aload_2         
	//* 142  281:iload_3         
	//* 143  282:putfield        #391 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
	//* 144  285:iconst_1        
	//* 145  286:ireturn         
					i = mOrientationHelper.getDecoratedStart(((View) (state)));
	//  146  287:aload_0         
	//  147  288:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  148  291:aload_1         
	//  149  292:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//  150  295:istore_3        
				anchorinfo.mCoordinate = i;
				return true;
			}
	//* 151  296:goto            280
			if(getChildCount() > 0)
	//* 152  299:aload_0         
	//* 153  300:invokevirtual   #127 <Method int getChildCount()>
	//* 154  303:ifle            345
			{
				int j = getPosition(getChildAt(0));
	//  155  306:aload_0         
	//  156  307:aload_0         
	//  157  308:iconst_0        
	//  158  309:invokevirtual   #209 <Method View getChildAt(int)>
	//  159  312:invokevirtual   #237 <Method int getPosition(View)>
	//  160  315:istore_3        
				boolean flag;
				if(mPendingScrollPosition < j)
	//* 161  316:aload_0         
	//* 162  317:getfield        #77  <Field int mPendingScrollPosition>
	//* 163  320:iload_3         
	//* 164  321:icmpge          351
					flag = true;
	//  165  324:iconst_1        
	//  166  325:istore          4
				else
	//* 167  327:iload           4
	//* 168  329:aload_0         
	//* 169  330:getfield        #71  <Field boolean mShouldReverseLayout>
	//* 170  333:icmpne          339
	//* 171  336:iconst_1        
	//* 172  337:istore          5
	//* 173  339:aload_2         
	//* 174  340:iload           5
	//* 175  342:putfield        #383 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
	//* 176  345:aload_2         
	//* 177  346:invokevirtual   #416 <Method void LinearLayoutManager$AnchorInfo.assignCoordinateFromPadding()>
	//* 178  349:iconst_1        
	//* 179  350:ireturn         
					flag = false;
	//  180  351:iconst_0        
	//  181  352:istore          4
				if(flag == mShouldReverseLayout)
					flag1 = true;
				anchorinfo.mLayoutFromEnd = flag1;
			}
			anchorinfo.assignCoordinateFromPadding();
			return true;
		}
	//* 182  354:goto            327
		anchorinfo.mLayoutFromEnd = mShouldReverseLayout;
	//  183  357:aload_2         
	//  184  358:aload_0         
	//  185  359:getfield        #71  <Field boolean mShouldReverseLayout>
	//  186  362:putfield        #383 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
		if(mShouldReverseLayout)
	//* 187  365:aload_0         
	//* 188  366:getfield        #71  <Field boolean mShouldReverseLayout>
	//* 189  369:ifeq            390
		{
			anchorinfo.mCoordinate = mOrientationHelper.getEndAfterPadding() - mPendingScrollPositionOffset;
	//  190  372:aload_2         
	//  191  373:aload_0         
	//  192  374:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  193  377:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//  194  380:aload_0         
	//  195  381:getfield        #79  <Field int mPendingScrollPositionOffset>
	//  196  384:isub            
	//  197  385:putfield        #391 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
			return true;
	//  198  388:iconst_1        
	//  199  389:ireturn         
		} else
		{
			anchorinfo.mCoordinate = mOrientationHelper.getStartAfterPadding() + mPendingScrollPositionOffset;
	//  200  390:aload_2         
	//  201  391:aload_0         
	//  202  392:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  203  395:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//  204  398:aload_0         
	//  205  399:getfield        #79  <Field int mPendingScrollPositionOffset>
	//  206  402:iadd            
	//  207  403:putfield        #391 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
			return true;
	//  208  406:iconst_1        
	//  209  407:ireturn         
		}
	}

	private void updateAnchorInfoForLayout(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorinfo)
	{
		while(updateAnchorFromPendingData(state, anchorinfo) || updateAnchorFromChildren(recycler, state, anchorinfo)) 
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:aload_3         
	//*   3    3:invokespecial   #423 <Method boolean updateAnchorFromPendingData(RecyclerView$State, LinearLayoutManager$AnchorInfo)>
	//*   4    6:ifeq            10
			return;
	//    5    9:return          
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:aload_3         
	//   10   14:invokespecial   #425 <Method boolean updateAnchorFromChildren(RecyclerView$Recycler, RecyclerView$State, LinearLayoutManager$AnchorInfo)>
	//   11   17:ifne            9
		anchorinfo.assignCoordinateFromPadding();
	//   12   20:aload_3         
	//   13   21:invokevirtual   #416 <Method void LinearLayoutManager$AnchorInfo.assignCoordinateFromPadding()>
		int i;
		if(mStackFromEnd)
	//*  14   24:aload_0         
	//*  15   25:getfield        #73  <Field boolean mStackFromEnd>
	//*  16   28:ifeq            46
			i = state.getItemCount() - 1;
	//   17   31:aload_2         
	//   18   32:invokevirtual   #163 <Method int RecyclerView$State.getItemCount()>
	//   19   35:iconst_1        
	//   20   36:isub            
	//   21   37:istore          4
		else
	//*  22   39:aload_3         
	//*  23   40:iload           4
	//*  24   42:putfield        #398 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//*  25   45:return          
			i = 0;
	//   26   46:iconst_0        
	//   27   47:istore          4
		anchorinfo.mPosition = i;
	//*  28   49:goto            39
	}

	private void updateLayoutState(int i, int j, boolean flag, RecyclerView.State state)
	{
		byte byte0 = -1;
	//    0    0:iconst_m1       
	//    1    1:istore          5
		boolean flag1 = true;
	//    2    3:iconst_1        
	//    3    4:istore          6
		mLayoutState.mInfinite = resolveIsInfinite();
	//    4    6:aload_0         
	//    5    7:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #430 <Method boolean resolveIsInfinite()>
	//    8   14:putfield        #326 <Field boolean LinearLayoutManager$LayoutState.mInfinite>
		mLayoutState.mExtra = getExtraLayoutSpace(state);
	//    9   17:aload_0         
	//   10   18:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   11   21:aload_0         
	//   12   22:aload           4
	//   13   24:invokevirtual   #433 <Method int getExtraLayoutSpace(RecyclerView$State)>
	//   14   27:putfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
		mLayoutState.mLayoutDirection = i;
	//   15   30:aload_0         
	//   16   31:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   17   34:iload_1         
	//   18   35:putfield        #329 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
		if(i == 1)
	//*  19   38:iload_1         
	//*  20   39:iconst_1        
	//*  21   40:icmpne          194
		{
			state = ((RecyclerView.State) (mLayoutState));
	//   22   43:aload_0         
	//   23   44:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   24   47:astore          4
			state.mExtra = ((LayoutState) (state)).mExtra + mOrientationHelper.getEndPadding();
	//   25   49:aload           4
	//   26   51:aload           4
	//   27   53:getfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
	//   28   56:aload_0         
	//   29   57:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   30   60:invokevirtual   #436 <Method int OrientationHelper.getEndPadding()>
	//   31   63:iadd            
	//   32   64:putfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
			state = ((RecyclerView.State) (getChildClosestToEnd()));
	//   33   67:aload_0         
	//   34   68:invokespecial   #283 <Method View getChildClosestToEnd()>
	//   35   71:astore          4
			LayoutState layoutstate = mLayoutState;
	//   36   73:aload_0         
	//   37   74:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   38   77:astore          7
			if(mShouldReverseLayout)
	//*  39   79:aload_0         
	//*  40   80:getfield        #71  <Field boolean mShouldReverseLayout>
	//*  41   83:ifeq            189
				i = ((int) (byte0));
	//   42   86:iload           5
	//   43   88:istore_1        
			else
	//*  44   89:aload           7
	//*  45   91:iload_1         
	//*  46   92:putfield        #439 <Field int LinearLayoutManager$LayoutState.mItemDirection>
	//*  47   95:aload_0         
	//*  48   96:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//*  49   99:aload_0         
	//*  50  100:aload           4
	//*  51  102:invokevirtual   #237 <Method int getPosition(View)>
	//*  52  105:aload_0         
	//*  53  106:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//*  54  109:getfield        #439 <Field int LinearLayoutManager$LayoutState.mItemDirection>
	//*  55  112:iadd            
	//*  56  113:putfield        #442 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//*  57  116:aload_0         
	//*  58  117:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//*  59  120:aload_0         
	//*  60  121:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  61  124:aload           4
	//*  62  126:invokevirtual   #356 <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  63  129:putfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//*  64  132:aload_0         
	//*  65  133:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  66  136:aload           4
	//*  67  138:invokevirtual   #356 <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  68  141:aload_0         
	//*  69  142:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  70  145:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//*  71  148:isub            
	//*  72  149:istore_1        
	//*  73  150:aload_0         
	//*  74  151:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//*  75  154:iload_2         
	//*  76  155:putfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//*  77  158:iload_3         
	//*  78  159:ifeq            180
	//*  79  162:aload_0         
	//*  80  163:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//*  81  166:astore          4
	//*  82  168:aload           4
	//*  83  170:aload           4
	//*  84  172:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//*  85  175:iload_1         
	//*  86  176:isub            
	//*  87  177:putfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//*  88  180:aload_0         
	//*  89  181:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//*  90  184:iload_1         
	//*  91  185:putfield        #332 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//*  92  188:return          
				i = 1;
	//   93  189:iconst_1        
	//   94  190:istore_1        
			layoutstate.mItemDirection = i;
			mLayoutState.mCurrentPosition = getPosition(((View) (state))) + mLayoutState.mItemDirection;
			mLayoutState.mOffset = mOrientationHelper.getDecoratedEnd(((View) (state)));
			i = mOrientationHelper.getDecoratedEnd(((View) (state))) - mOrientationHelper.getEndAfterPadding();
		} else
	//*  95  191:goto            89
		{
			state = ((RecyclerView.State) (getChildClosestToStart()));
	//   96  194:aload_0         
	//   97  195:invokespecial   #264 <Method View getChildClosestToStart()>
	//   98  198:astore          4
			LayoutState layoutstate1 = mLayoutState;
	//   99  200:aload_0         
	//  100  201:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  101  204:astore          7
			layoutstate1.mExtra = layoutstate1.mExtra + mOrientationHelper.getStartAfterPadding();
	//  102  206:aload           7
	//  103  208:aload           7
	//  104  210:getfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
	//  105  213:aload_0         
	//  106  214:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  107  217:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//  108  220:iadd            
	//  109  221:putfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
			layoutstate1 = mLayoutState;
	//  110  224:aload_0         
	//  111  225:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  112  228:astore          7
			if(mShouldReverseLayout)
	//* 113  230:aload_0         
	//* 114  231:getfield        #71  <Field boolean mShouldReverseLayout>
	//* 115  234:ifeq            305
				i = ((int) (flag1));
	//  116  237:iload           6
	//  117  239:istore_1        
			else
	//* 118  240:aload           7
	//* 119  242:iload_1         
	//* 120  243:putfield        #439 <Field int LinearLayoutManager$LayoutState.mItemDirection>
	//* 121  246:aload_0         
	//* 122  247:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 123  250:aload_0         
	//* 124  251:aload           4
	//* 125  253:invokevirtual   #237 <Method int getPosition(View)>
	//* 126  256:aload_0         
	//* 127  257:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 128  260:getfield        #439 <Field int LinearLayoutManager$LayoutState.mItemDirection>
	//* 129  263:iadd            
	//* 130  264:putfield        #442 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//* 131  267:aload_0         
	//* 132  268:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 133  271:aload_0         
	//* 134  272:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//* 135  275:aload           4
	//* 136  277:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//* 137  280:putfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//* 138  283:aload_0         
	//* 139  284:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//* 140  287:aload           4
	//* 141  289:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//* 142  292:ineg            
	//* 143  293:aload_0         
	//* 144  294:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//* 145  297:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//* 146  300:iadd            
	//* 147  301:istore_1        
	//* 148  302:goto            150
				i = -1;
	//  149  305:iconst_m1       
	//  150  306:istore_1        
			layoutstate1.mItemDirection = i;
			mLayoutState.mCurrentPosition = getPosition(((View) (state))) + mLayoutState.mItemDirection;
			mLayoutState.mOffset = mOrientationHelper.getDecoratedStart(((View) (state)));
			i = -mOrientationHelper.getDecoratedStart(((View) (state))) + mOrientationHelper.getStartAfterPadding();
		}
		mLayoutState.mAvailable = j;
		if(flag)
		{
			state = ((RecyclerView.State) (mLayoutState));
			state.mAvailable = ((LayoutState) (state)).mAvailable - i;
		}
		mLayoutState.mScrollingOffset = i;
	//* 151  307:goto            240
	}

	private void updateLayoutStateToFillEnd(int i, int j)
	{
		mLayoutState.mAvailable = mOrientationHelper.getEndAfterPadding() - j;
	//    0    0:aload_0         
	//    1    1:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//    2    4:aload_0         
	//    3    5:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//    4    8:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//    5   11:iload_2         
	//    6   12:isub            
	//    7   13:putfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
		LayoutState layoutstate = mLayoutState;
	//    8   16:aload_0         
	//    9   17:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   10   20:astore          4
		int k;
		if(mShouldReverseLayout)
	//*  11   22:aload_0         
	//*  12   23:getfield        #71  <Field boolean mShouldReverseLayout>
	//*  13   26:ifeq            71
			k = -1;
	//   14   29:iconst_m1       
	//   15   30:istore_3        
		else
	//*  16   31:aload           4
	//*  17   33:iload_3         
	//*  18   34:putfield        #439 <Field int LinearLayoutManager$LayoutState.mItemDirection>
	//*  19   37:aload_0         
	//*  20   38:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//*  21   41:iload_1         
	//*  22   42:putfield        #442 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//*  23   45:aload_0         
	//*  24   46:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//*  25   49:iconst_1        
	//*  26   50:putfield        #329 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//*  27   53:aload_0         
	//*  28   54:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//*  29   57:iload_2         
	//*  30   58:putfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//*  31   61:aload_0         
	//*  32   62:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//*  33   65:ldc1            #29  <Int 0x80000000>
	//*  34   67:putfield        #332 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//*  35   70:return          
			k = 1;
	//   36   71:iconst_1        
	//   37   72:istore_3        
		layoutstate.mItemDirection = k;
		mLayoutState.mCurrentPosition = i;
		mLayoutState.mLayoutDirection = 1;
		mLayoutState.mOffset = j;
		mLayoutState.mScrollingOffset = 0x80000000;
	//*  38   73:goto            31
	}

	private void updateLayoutStateToFillEnd(AnchorInfo anchorinfo)
	{
		updateLayoutStateToFillEnd(anchorinfo.mPosition, anchorinfo.mCoordinate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #398 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//    3    5:aload_1         
	//    4    6:getfield        #391 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
	//    5    9:invokespecial   #286 <Method void updateLayoutStateToFillEnd(int, int)>
	//    6   12:return          
	}

	private void updateLayoutStateToFillStart(int i, int j)
	{
		mLayoutState.mAvailable = j - mOrientationHelper.getStartAfterPadding();
	//    0    0:aload_0         
	//    1    1:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//    2    4:iload_2         
	//    3    5:aload_0         
	//    4    6:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//    5    9:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//    6   12:isub            
	//    7   13:putfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
		mLayoutState.mCurrentPosition = i;
	//    8   16:aload_0         
	//    9   17:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   10   20:iload_1         
	//   11   21:putfield        #442 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
		LayoutState layoutstate = mLayoutState;
	//   12   24:aload_0         
	//   13   25:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   14   28:astore_3        
		if(mShouldReverseLayout)
	//*  15   29:aload_0         
	//*  16   30:getfield        #71  <Field boolean mShouldReverseLayout>
	//*  17   33:ifeq            69
			i = 1;
	//   18   36:iconst_1        
	//   19   37:istore_1        
		else
	//*  20   38:aload_3         
	//*  21   39:iload_1         
	//*  22   40:putfield        #439 <Field int LinearLayoutManager$LayoutState.mItemDirection>
	//*  23   43:aload_0         
	//*  24   44:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//*  25   47:iconst_m1       
	//*  26   48:putfield        #329 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//*  27   51:aload_0         
	//*  28   52:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//*  29   55:iload_2         
	//*  30   56:putfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//*  31   59:aload_0         
	//*  32   60:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//*  33   63:ldc1            #29  <Int 0x80000000>
	//*  34   65:putfield        #332 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//*  35   68:return          
			i = -1;
	//   36   69:iconst_m1       
	//   37   70:istore_1        
		layoutstate.mItemDirection = i;
		mLayoutState.mLayoutDirection = -1;
		mLayoutState.mOffset = j;
		mLayoutState.mScrollingOffset = 0x80000000;
	//*  38   71:goto            38
	}

	private void updateLayoutStateToFillStart(AnchorInfo anchorinfo)
	{
		updateLayoutStateToFillStart(anchorinfo.mPosition, anchorinfo.mCoordinate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #398 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//    3    5:aload_1         
	//    4    6:getfield        #391 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
	//    5    9:invokespecial   #268 <Method void updateLayoutStateToFillStart(int, int)>
	//    6   12:return          
	}

	public void assertNotInLayoutOrScroll(String s)
	{
		if(mPendingSavedState == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*   2    4:ifnonnull       12
			super.assertNotInLayoutOrScroll(s);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #450 <Method void RecyclerView$LayoutManager.assertNotInLayoutOrScroll(String)>
	//    6   12:return          
	}

	public boolean canScrollHorizontally()
	{
		return mOrientation == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #362 <Field int mOrientation>
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
	//    1    1:getfield        #362 <Field int mOrientation>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public void collectAdjacentPrefetchPositions(int i, int j, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutprefetchregistry)
	{
		if(mOrientation != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #362 <Field int mOrientation>
	//*   2    4:ifne            19
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #127 <Method int getChildCount()>
	//*   5   11:ifeq            18
	//*   6   14:iload_1         
	//*   7   15:ifne            24
	//*   8   18:return          
			i = j;
	//    9   19:iload_2         
	//   10   20:istore_1        
		if(getChildCount() == 0 || i == 0)
			return;
	//*  11   21:goto            7
		ensureLayoutState();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #130 <Method void ensureLayoutState()>
		if(i > 0)
	//*  14   28:iload_1         
	//*  15   29:ifle            57
			j = 1;
	//   16   32:iconst_1        
	//   17   33:istore_2        
		else
	//*  18   34:aload_0         
	//*  19   35:iload_2         
	//*  20   36:iload_1         
	//*  21   37:invokestatic    #460 <Method int Math.abs(int)>
	//*  22   40:iconst_1        
	//*  23   41:aload_3         
	//*  24   42:invokespecial   #462 <Method void updateLayoutState(int, int, boolean, RecyclerView$State)>
	//*  25   45:aload_0         
	//*  26   46:aload_3         
	//*  27   47:aload_0         
	//*  28   48:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//*  29   51:aload           4
	//*  30   53:invokevirtual   #466 <Method void collectPrefetchPositionsForLayoutState(RecyclerView$State, LinearLayoutManager$LayoutState, RecyclerView$LayoutManager$LayoutPrefetchRegistry)>
	//*  31   56:return          
			j = -1;
	//   32   57:iconst_m1       
	//   33   58:istore_2        
		updateLayoutState(j, Math.abs(i), true, state);
		collectPrefetchPositionsForLayoutState(state, mLayoutState, layoutprefetchregistry);
	//*  34   59:goto            34
	}

	public void collectInitialPrefetchPositions(int i, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutprefetchregistry)
	{
		int j;
		byte byte0;
		int k;
		boolean flag;
		boolean flag1;
		if(mPendingSavedState != null && mPendingSavedState.hasValidAnchor())
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*   2    4:ifnull          93
	//*   3    7:aload_0         
	//*   4    8:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*   5   11:invokevirtual   #401 <Method boolean LinearLayoutManager$SavedState.hasValidAnchor()>
	//*   6   14:ifeq            93
		{
			flag1 = mPendingSavedState.mAnchorLayoutFromEnd;
	//    7   17:aload_0         
	//    8   18:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//    9   21:getfield        #404 <Field boolean LinearLayoutManager$SavedState.mAnchorLayoutFromEnd>
	//   10   24:istore          7
			j = mPendingSavedState.mAnchorPosition;
	//   11   26:aload_0         
	//   12   27:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   13   30:getfield        #471 <Field int LinearLayoutManager$SavedState.mAnchorPosition>
	//   14   33:istore_3        
		} else
	//*  15   34:iload           7
	//*  16   36:ifeq            136
	//*  17   39:iconst_m1       
	//*  18   40:istore          4
	//*  19   42:iconst_0        
	//*  20   43:istore          6
	//*  21   45:iload_3         
	//*  22   46:istore          5
	//*  23   48:iload           6
	//*  24   50:istore_3        
	//*  25   51:iload_3         
	//*  26   52:aload_0         
	//*  27   53:getfield        #91  <Field int mInitialPrefetchItemCount>
	//*  28   56:icmpge          142
	//*  29   59:iload           5
	//*  30   61:iflt            142
	//*  31   64:iload           5
	//*  32   66:iload_1         
	//*  33   67:icmpge          142
	//*  34   70:aload_2         
	//*  35   71:iload           5
	//*  36   73:iconst_0        
	//*  37   74:invokeinterface #476 <Method void RecyclerView$LayoutManager$LayoutPrefetchRegistry.addPosition(int, int)>
	//*  38   79:iload           5
	//*  39   81:iload           4
	//*  40   83:iadd            
	//*  41   84:istore          5
	//*  42   86:iload_3         
	//*  43   87:iconst_1        
	//*  44   88:iadd            
	//*  45   89:istore_3        
	//*  46   90:goto            51
		{
			resolveShouldLayoutReverse();
	//   47   93:aload_0         
	//   48   94:invokespecial   #478 <Method void resolveShouldLayoutReverse()>
			flag1 = mShouldReverseLayout;
	//   49   97:aload_0         
	//   50   98:getfield        #71  <Field boolean mShouldReverseLayout>
	//   51  101:istore          7
			if(mPendingScrollPosition == -1)
	//*  52  103:aload_0         
	//*  53  104:getfield        #77  <Field int mPendingScrollPosition>
	//*  54  107:iconst_m1       
	//*  55  108:icmpne          128
			{
				if(flag1)
	//*  56  111:iload           7
	//*  57  113:ifeq            123
					j = i - 1;
	//   58  116:iload_1         
	//   59  117:iconst_1        
	//   60  118:isub            
	//   61  119:istore_3        
				else
	//*  62  120:goto            34
					j = 0;
	//   63  123:iconst_0        
	//   64  124:istore_3        
			} else
	//*  65  125:goto            120
			{
				j = mPendingScrollPosition;
	//   66  128:aload_0         
	//   67  129:getfield        #77  <Field int mPendingScrollPosition>
	//   68  132:istore_3        
			}
		}
		if(flag1)
			byte0 = -1;
		else
	//*  69  133:goto            34
			byte0 = 1;
	//   70  136:iconst_1        
	//   71  137:istore          4
		flag = false;
		k = j;
		for(j = ((int) (flag)); j < mInitialPrefetchItemCount && k >= 0 && k < i; j++)
		{
			layoutprefetchregistry.addPosition(k, 0);
			k += ((int) (byte0));
		}

	//*  72  139:goto            42
	//   73  142:return          
	}

	void collectPrefetchPositionsForLayoutState(RecyclerView.State state, LayoutState layoutstate, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutprefetchregistry)
	{
		int i = layoutstate.mCurrentPosition;
	//    0    0:aload_2         
	//    1    1:getfield        #442 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//    2    4:istore          4
		if(i >= 0 && i < state.getItemCount())
	//*   3    6:iload           4
	//*   4    8:iflt            36
	//*   5   11:iload           4
	//*   6   13:aload_1         
	//*   7   14:invokevirtual   #163 <Method int RecyclerView$State.getItemCount()>
	//*   8   17:icmpge          36
			layoutprefetchregistry.addPosition(i, Math.max(0, layoutstate.mScrollingOffset));
	//    9   20:aload_3         
	//   10   21:iload           4
	//   11   23:iconst_0        
	//   12   24:aload_2         
	//   13   25:getfield        #332 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//   14   28:invokestatic    #482 <Method int Math.max(int, int)>
	//   15   31:invokeinterface #476 <Method void RecyclerView$LayoutManager$LayoutPrefetchRegistry.addPosition(int, int)>
	//   16   36:return          
	}

	public int computeHorizontalScrollExtent(RecyclerView.State state)
	{
		return computeScrollExtent(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #485 <Method int computeScrollExtent(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public int computeHorizontalScrollOffset(RecyclerView.State state)
	{
		return computeScrollOffset(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #488 <Method int computeScrollOffset(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public int computeHorizontalScrollRange(RecyclerView.State state)
	{
		return computeScrollRange(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #491 <Method int computeScrollRange(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public PointF computeScrollVectorForPosition(int i)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		boolean flag1 = false;
	//    2    2:iconst_0        
	//    3    3:istore_3        
		if(getChildCount() == 0)
	//*   4    4:aload_0         
	//*   5    5:invokevirtual   #127 <Method int getChildCount()>
	//*   6    8:ifne            13
			return null;
	//    7   11:aconst_null     
	//    8   12:areturn         
		if(i < getPosition(getChildAt(0)))
	//*   9   13:iload_1         
	//*  10   14:aload_0         
	//*  11   15:aload_0         
	//*  12   16:iconst_0        
	//*  13   17:invokevirtual   #209 <Method View getChildAt(int)>
	//*  14   20:invokevirtual   #237 <Method int getPosition(View)>
	//*  15   23:icmpge          28
			flag1 = true;
	//   16   26:iconst_1        
	//   17   27:istore_3        
		i = ((int) (flag));
	//   18   28:iload_2         
	//   19   29:istore_1        
		if(flag1 != mShouldReverseLayout)
	//*  20   30:iload_3         
	//*  21   31:aload_0         
	//*  22   32:getfield        #71  <Field boolean mShouldReverseLayout>
	//*  23   35:icmpeq          40
			i = -1;
	//   24   38:iconst_m1       
	//   25   39:istore_1        
		if(mOrientation == 0)
	//*  26   40:aload_0         
	//*  27   41:getfield        #362 <Field int mOrientation>
	//*  28   44:ifne            58
			return new PointF(i, 0.0F);
	//   29   47:new             #495 <Class PointF>
	//   30   50:dup             
	//   31   51:iload_1         
	//   32   52:i2f             
	//   33   53:fconst_0        
	//   34   54:invokespecial   #498 <Method void PointF(float, float)>
	//   35   57:areturn         
		else
			return new PointF(0.0F, i);
	//   36   58:new             #495 <Class PointF>
	//   37   61:dup             
	//   38   62:fconst_0        
	//   39   63:iload_1         
	//   40   64:i2f             
	//   41   65:invokespecial   #498 <Method void PointF(float, float)>
	//   42   68:areturn         
	}

	public int computeVerticalScrollExtent(RecyclerView.State state)
	{
		return computeScrollExtent(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #485 <Method int computeScrollExtent(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public int computeVerticalScrollOffset(RecyclerView.State state)
	{
		return computeScrollOffset(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #488 <Method int computeScrollOffset(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public int computeVerticalScrollRange(RecyclerView.State state)
	{
		return computeScrollRange(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #491 <Method int computeScrollRange(RecyclerView$State)>
	//    3    5:ireturn         
	}

	int convertFocusDirectionToLayoutDirection(int i)
	{
		byte byte0;
		int j;
		boolean flag;
		byte0 = -1;
	//    0    0:iconst_m1       
	//    1    1:istore_2        
		j = 0x80000000;
	//    2    2:ldc1            #29  <Int 0x80000000>
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
	//    8   68:ldc1            #29  <Int 0x80000000>
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
	//   15   76:getfield        #362 <Field int mOrientation>
	//   16   79:iconst_1        
	//   17   80:icmpeq          71
_L8:
		i = ((int) (byte0));
	//   18   83:iload_2         
	//   19   84:istore_1        
		if(!isLayoutRTL()) goto _L9; else goto _L10
	//   20   85:aload_0         
	//   21   86:invokevirtual   #365 <Method boolean isLayoutRTL()>
	//   22   89:ifeq            71
_L10:
		return 1;
	//   23   92:iconst_1        
	//   24   93:ireturn         
_L3:
		if(mOrientation == 1)
	//*  25   94:aload_0         
	//*  26   95:getfield        #362 <Field int mOrientation>
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
	//   34  107:invokevirtual   #365 <Method boolean isLayoutRTL()>
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
	//   41  118:getfield        #362 <Field int mOrientation>
	//   42  121:iconst_1        
	//   43  122:icmpeq          71
_L12:
		return 0x80000000;
	//   44  125:ldc1            #29  <Int 0x80000000>
	//   45  127:ireturn         
_L7:
		i = j;
	//   46  128:iload_3         
	//   47  129:istore_1        
		if(mOrientation == 1)
	//*  48  130:aload_0         
	//*  49  131:getfield        #362 <Field int mOrientation>
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
	//   59  145:getfield        #362 <Field int mOrientation>
	//   60  148:ifeq            71
_L13:
		return 0x80000000;
	//   61  151:ldc1            #29  <Int 0x80000000>
	//   62  153:ireturn         
_L6:
		if(mOrientation == 0)
	//*  63  154:aload_0         
	//*  64  155:getfield        #362 <Field int mOrientation>
	//*  65  158:ifne            166
			i = ((int) (flag));
	//   66  161:iload           4
	//   67  163:istore_1        
		else
	//*  68  164:iload_1         
	//*  69  165:ireturn         
			i = 0x80000000;
	//   70  166:ldc1            #29  <Int 0x80000000>
	//   71  168:istore_1        
		return i;
	//*  72  169:goto            164
	}

	LayoutState createLayoutState()
	{
		return new LayoutState();
	//    0    0:new             #16  <Class LinearLayoutManager$LayoutState>
	//    1    3:dup             
	//    2    4:invokespecial   #505 <Method void LinearLayoutManager$LayoutState()>
	//    3    7:areturn         
	}

	void ensureLayoutState()
	{
		if(mLayoutState == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//*   2    4:ifnonnull       15
			mLayoutState = createLayoutState();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #507 <Method LinearLayoutManager$LayoutState createLayoutState()>
	//    6   12:putfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
		if(mOrientationHelper == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*   9   19:ifnonnull       34
			mOrientationHelper = OrientationHelper.createOrientationHelper(((RecyclerView.LayoutManager) (this)), mOrientation);
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #362 <Field int mOrientation>
	//   14   28:invokestatic    #511 <Method OrientationHelper OrientationHelper.createOrientationHelper(RecyclerView$LayoutManager, int)>
	//   15   31:putfield        #132 <Field OrientationHelper mOrientationHelper>
	//   16   34:return          
	}

	int fill(RecyclerView.Recycler recycler, LayoutState layoutstate, RecyclerView.State state, boolean flag)
	{
		int i;
		int k;
		LayoutChunkResult layoutchunkresult;
		k = layoutstate.mAvailable;
	//    0    0:aload_2         
	//    1    1:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//    2    4:istore          7
		if(layoutstate.mScrollingOffset != 0x80000000)
	//*   3    6:aload_2         
	//*   4    7:getfield        #332 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//*   5   10:ldc1            #29  <Int 0x80000000>
	//*   6   12:icmpeq          41
		{
			if(layoutstate.mAvailable < 0)
	//*   7   15:aload_2         
	//*   8   16:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//*   9   19:ifge            35
				layoutstate.mScrollingOffset = layoutstate.mScrollingOffset + layoutstate.mAvailable;
	//   10   22:aload_2         
	//   11   23:aload_2         
	//   12   24:getfield        #332 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//   13   27:aload_2         
	//   14   28:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//   15   31:iadd            
	//   16   32:putfield        #332 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
			recycleByLayoutState(recycler, layoutstate);
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:aload_2         
	//   20   38:invokespecial   #513 <Method void recycleByLayoutState(RecyclerView$Recycler, LinearLayoutManager$LayoutState)>
		}
		i = layoutstate.mAvailable + layoutstate.mExtra;
	//   21   41:aload_2         
	//   22   42:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//   23   45:aload_2         
	//   24   46:getfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
	//   25   49:iadd            
	//   26   50:istore          5
		layoutchunkresult = mLayoutChunkResult;
	//   27   52:aload_0         
	//   28   53:getfield        #89  <Field LinearLayoutManager$LayoutChunkResult mLayoutChunkResult>
	//   29   56:astore          8
_L4:
		if(!layoutstate.mInfinite && i <= 0 || !layoutstate.hasMore(state)) goto _L2; else goto _L1
	//   30   58:aload_2         
	//   31   59:getfield        #326 <Field boolean LinearLayoutManager$LayoutState.mInfinite>
	//   32   62:ifne            70
	//   33   65:iload           5
	//   34   67:ifle            100
	//   35   70:aload_2         
	//   36   71:aload_3         
	//   37   72:invokevirtual   #517 <Method boolean LinearLayoutManager$LayoutState.hasMore(RecyclerView$State)>
	//   38   75:ifeq            100
_L1:
		layoutchunkresult.resetInternal();
	//   39   78:aload           8
	//   40   80:invokevirtual   #520 <Method void LinearLayoutManager$LayoutChunkResult.resetInternal()>
		layoutChunk(recycler, state, layoutstate, layoutchunkresult);
	//   41   83:aload_0         
	//   42   84:aload_1         
	//   43   85:aload_3         
	//   44   86:aload_2         
	//   45   87:aload           8
	//   46   89:invokevirtual   #524 <Method void layoutChunk(RecyclerView$Recycler, RecyclerView$State, LinearLayoutManager$LayoutState, LinearLayoutManager$LayoutChunkResult)>
		if(!layoutchunkresult.mFinished) goto _L3; else goto _L2
	//   47   92:aload           8
	//   48   94:getfield        #527 <Field boolean LinearLayoutManager$LayoutChunkResult.mFinished>
	//   49   97:ifeq            108
_L2:
		return k - layoutstate.mAvailable;
	//   50  100:iload           7
	//   51  102:aload_2         
	//   52  103:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//   53  106:isub            
	//   54  107:ireturn         
_L3:
		int j;
label0:
		{
			layoutstate.mOffset = layoutstate.mOffset + layoutchunkresult.mConsumed * layoutstate.mLayoutDirection;
	//   55  108:aload_2         
	//   56  109:aload_2         
	//   57  110:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//   58  113:aload           8
	//   59  115:getfield        #530 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//   60  118:aload_2         
	//   61  119:getfield        #329 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//   62  122:imul            
	//   63  123:iadd            
	//   64  124:putfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
			if(layoutchunkresult.mIgnoreConsumed && mLayoutState.mScrapList == null)
	//*  65  127:aload           8
	//*  66  129:getfield        #533 <Field boolean LinearLayoutManager$LayoutChunkResult.mIgnoreConsumed>
	//*  67  132:ifeq            156
	//*  68  135:aload_0         
	//*  69  136:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//*  70  139:getfield        #262 <Field List LinearLayoutManager$LayoutState.mScrapList>
	//*  71  142:ifnonnull       156
			{
				j = i;
	//   72  145:iload           5
	//   73  147:istore          6
				if(state.isPreLayout())
					break label0;
	//   74  149:aload_3         
	//   75  150:invokevirtual   #219 <Method boolean RecyclerView$State.isPreLayout()>
	//   76  153:ifne            180
			}
			layoutstate.mAvailable = layoutstate.mAvailable - layoutchunkresult.mConsumed;
	//   77  156:aload_2         
	//   78  157:aload_2         
	//   79  158:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//   80  161:aload           8
	//   81  163:getfield        #530 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//   82  166:isub            
	//   83  167:putfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
			j = i - layoutchunkresult.mConsumed;
	//   84  170:iload           5
	//   85  172:aload           8
	//   86  174:getfield        #530 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//   87  177:isub            
	//   88  178:istore          6
		}
		if(layoutstate.mScrollingOffset != 0x80000000)
	//*  89  180:aload_2         
	//*  90  181:getfield        #332 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//*  91  184:ldc1            #29  <Int 0x80000000>
	//*  92  186:icmpeq          229
		{
			layoutstate.mScrollingOffset = layoutstate.mScrollingOffset + layoutchunkresult.mConsumed;
	//   93  189:aload_2         
	//   94  190:aload_2         
	//   95  191:getfield        #332 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//   96  194:aload           8
	//   97  196:getfield        #530 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//   98  199:iadd            
	//   99  200:putfield        #332 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
			if(layoutstate.mAvailable < 0)
	//* 100  203:aload_2         
	//* 101  204:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//* 102  207:ifge            223
				layoutstate.mScrollingOffset = layoutstate.mScrollingOffset + layoutstate.mAvailable;
	//  103  210:aload_2         
	//  104  211:aload_2         
	//  105  212:getfield        #332 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//  106  215:aload_2         
	//  107  216:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//  108  219:iadd            
	//  109  220:putfield        #332 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
			recycleByLayoutState(recycler, layoutstate);
	//  110  223:aload_0         
	//  111  224:aload_1         
	//  112  225:aload_2         
	//  113  226:invokespecial   #513 <Method void recycleByLayoutState(RecyclerView$Recycler, LinearLayoutManager$LayoutState)>
		}
		i = j;
	//  114  229:iload           6
	//  115  231:istore          5
		if(!flag)
			break; /* Loop/switch isn't completed */
	//  116  233:iload           4
	//  117  235:ifeq            58
		i = j;
	//  118  238:iload           6
	//  119  240:istore          5
		if(!layoutchunkresult.mFocusable) goto _L4; else goto _L2
	//  120  242:aload           8
	//  121  244:getfield        #536 <Field boolean LinearLayoutManager$LayoutChunkResult.mFocusable>
	//  122  247:ifeq            58
	//* 123  250:goto            100
	}

	public int findFirstCompletelyVisibleItemPosition()
	{
		View view = findOneVisibleChild(0, getChildCount(), true, false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #127 <Method int getChildCount()>
	//    4    6:iconst_1        
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #171 <Method View findOneVisibleChild(int, int, boolean, boolean)>
	//    7   11:astore_1        
		if(view == null)
	//*   8   12:aload_1         
	//*   9   13:ifnonnull       18
			return -1;
	//   10   16:iconst_m1       
	//   11   17:ireturn         
		else
			return getPosition(view);
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:invokevirtual   #237 <Method int getPosition(View)>
	//   15   23:ireturn         
	}

	public int findFirstVisibleItemPosition()
	{
		View view = findOneVisibleChild(0, getChildCount(), false, true);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #127 <Method int getChildCount()>
	//    4    6:iconst_0        
	//    5    7:iconst_1        
	//    6    8:invokevirtual   #171 <Method View findOneVisibleChild(int, int, boolean, boolean)>
	//    7   11:astore_1        
		if(view == null)
	//*   8   12:aload_1         
	//*   9   13:ifnonnull       18
			return -1;
	//   10   16:iconst_m1       
	//   11   17:ireturn         
		else
			return getPosition(view);
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:invokevirtual   #237 <Method int getPosition(View)>
	//   15   23:ireturn         
	}

	public int findLastCompletelyVisibleItemPosition()
	{
		View view = findOneVisibleChild(getChildCount() - 1, -1, true, false);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #127 <Method int getChildCount()>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:iconst_m1       
	//    6    8:iconst_1        
	//    7    9:iconst_0        
	//    8   10:invokevirtual   #171 <Method View findOneVisibleChild(int, int, boolean, boolean)>
	//    9   13:astore_1        
		if(view == null)
	//*  10   14:aload_1         
	//*  11   15:ifnonnull       20
			return -1;
	//   12   18:iconst_m1       
	//   13   19:ireturn         
		else
			return getPosition(view);
	//   14   20:aload_0         
	//   15   21:aload_1         
	//   16   22:invokevirtual   #237 <Method int getPosition(View)>
	//   17   25:ireturn         
	}

	public int findLastVisibleItemPosition()
	{
		View view = findOneVisibleChild(getChildCount() - 1, -1, false, true);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #127 <Method int getChildCount()>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:iconst_m1       
	//    6    8:iconst_0        
	//    7    9:iconst_1        
	//    8   10:invokevirtual   #171 <Method View findOneVisibleChild(int, int, boolean, boolean)>
	//    9   13:astore_1        
		if(view == null)
	//*  10   14:aload_1         
	//*  11   15:ifnonnull       20
			return -1;
	//   12   18:iconst_m1       
	//   13   19:ireturn         
		else
			return getPosition(view);
	//   14   20:aload_0         
	//   15   21:aload_1         
	//   16   22:invokevirtual   #237 <Method int getPosition(View)>
	//   17   25:ireturn         
	}

	View findOnePartiallyOrCompletelyInvisibleChild(int i, int j)
	{
		ensureLayoutState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #130 <Method void ensureLayoutState()>
		char c;
		if(j > i)
	//*   2    4:iload_2         
	//*   3    5:iload_1         
	//*   4    6:icmple          21
			c = '\001';
	//    5    9:iconst_1        
	//    6   10:istore_3        
		else
	//*   7   11:iload_3         
	//*   8   12:ifne            36
	//*   9   15:aload_0         
	//*  10   16:iload_1         
	//*  11   17:invokevirtual   #209 <Method View getChildAt(int)>
	//*  12   20:areturn         
		if(j < i)
	//*  13   21:iload_2         
	//*  14   22:iload_1         
	//*  15   23:icmpge          31
			c = '\uFFFF';
	//   16   26:iconst_m1       
	//   17   27:istore_3        
		else
	//*  18   28:goto            11
			c = '\0';
	//   19   31:iconst_0        
	//   20   32:istore_3        
		if(c == 0)
			return getChildAt(i);
	//*  21   33:goto            11
		char c1;
		if(mOrientationHelper.getDecoratedStart(getChildAt(i)) < mOrientationHelper.getStartAfterPadding())
	//*  22   36:aload_0         
	//*  23   37:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  24   40:aload_0         
	//*  25   41:iload_1         
	//*  26   42:invokevirtual   #209 <Method View getChildAt(int)>
	//*  27   45:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  28   48:aload_0         
	//*  29   49:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  30   52:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//*  31   55:icmpge          87
		{
			c1 = '\u4104';
	//   32   58:sipush          16644
	//   33   61:istore          4
			c = '\u4004';
	//   34   63:sipush          16388
	//   35   66:istore_3        
		} else
	//*  36   67:aload_0         
	//*  37   68:getfield        #362 <Field int mOrientation>
	//*  38   71:ifne            99
	//*  39   74:aload_0         
	//*  40   75:getfield        #544 <Field ViewBoundsCheck mHorizontalBoundCheck>
	//*  41   78:iload_1         
	//*  42   79:iload_2         
	//*  43   80:iload           4
	//*  44   82:iload_3         
	//*  45   83:invokevirtual   #550 <Method View ViewBoundsCheck.findOneViewWithinBoundFlags(int, int, int, int)>
	//*  46   86:areturn         
		{
			c1 = '\u1041';
	//   47   87:sipush          4161
	//   48   90:istore          4
			c = '\u1001';
	//   49   92:sipush          4097
	//   50   95:istore_3        
		}
		if(mOrientation == 0)
			return mHorizontalBoundCheck.findOneViewWithinBoundFlags(i, j, ((int) (c1)), ((int) (c)));
		else
	//*  51   96:goto            67
			return mVerticalBoundCheck.findOneViewWithinBoundFlags(i, j, ((int) (c1)), ((int) (c)));
	//   52   99:aload_0         
	//   53  100:getfield        #553 <Field ViewBoundsCheck mVerticalBoundCheck>
	//   54  103:iload_1         
	//   55  104:iload_2         
	//   56  105:iload           4
	//   57  107:iload_3         
	//   58  108:invokevirtual   #550 <Method View ViewBoundsCheck.findOneViewWithinBoundFlags(int, int, int, int)>
	//   59  111:areturn         
	}

	View findOneVisibleChild(int i, int j, boolean flag, boolean flag1)
	{
		char c1 = '\u0140';
	//    0    0:sipush          320
	//    1    3:istore          6
		ensureLayoutState();
	//    2    5:aload_0         
	//    3    6:invokevirtual   #130 <Method void ensureLayoutState()>
		char c;
		if(flag)
	//*   4    9:iload_3         
	//*   5   10:ifeq            44
			c = '\u6003';
	//    6   13:sipush          24579
	//    7   16:istore          5
		else
	//*   8   18:iload           4
	//*   9   20:ifeq            66
	//*  10   23:aload_0         
	//*  11   24:getfield        #362 <Field int mOrientation>
	//*  12   27:ifne            52
	//*  13   30:aload_0         
	//*  14   31:getfield        #544 <Field ViewBoundsCheck mHorizontalBoundCheck>
	//*  15   34:iload_1         
	//*  16   35:iload_2         
	//*  17   36:iload           5
	//*  18   38:iload           6
	//*  19   40:invokevirtual   #550 <Method View ViewBoundsCheck.findOneViewWithinBoundFlags(int, int, int, int)>
	//*  20   43:areturn         
			c = '\u0140';
	//   21   44:sipush          320
	//   22   47:istore          5
		if(!flag1)
	//*  23   49:goto            18
	//*  24   52:aload_0         
	//*  25   53:getfield        #553 <Field ViewBoundsCheck mVerticalBoundCheck>
	//*  26   56:iload_1         
	//*  27   57:iload_2         
	//*  28   58:iload           5
	//*  29   60:iload           6
	//*  30   62:invokevirtual   #550 <Method View ViewBoundsCheck.findOneViewWithinBoundFlags(int, int, int, int)>
	//*  31   65:areturn         
			c1 = '\0';
	//   32   66:iconst_0        
	//   33   67:istore          6
		if(mOrientation == 0)
			return mHorizontalBoundCheck.findOneViewWithinBoundFlags(i, j, ((int) (c)), ((int) (c1)));
		else
			return mVerticalBoundCheck.findOneViewWithinBoundFlags(i, j, ((int) (c)), ((int) (c1)));
	//*  34   69:goto            23
	}

	View findReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int j, int k)
	{
		int i1;
		int j1;
		Object obj;
		state = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		ensureLayoutState();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #130 <Method void ensureLayoutState()>
		i1 = mOrientationHelper.getStartAfterPadding();
	//    4    6:aload_0         
	//    5    7:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//    6   10:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//    7   13:istore          7
		j1 = mOrientationHelper.getEndAfterPadding();
	//    8   15:aload_0         
	//    9   16:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   10   19:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//   11   22:istore          8
		int l;
		int k1;
		if(j > i)
	//*  12   24:iload           4
	//*  13   26:iload_3         
	//*  14   27:icmple          107
			l = 1;
	//   15   30:iconst_1        
	//   16   31:istore          6
		else
	//*  17   33:aconst_null     
	//*  18   34:astore_1        
	//*  19   35:iload_3         
	//*  20   36:iload           4
	//*  21   38:icmpeq          157
	//*  22   41:aload_0         
	//*  23   42:iload_3         
	//*  24   43:invokevirtual   #209 <Method View getChildAt(int)>
	//*  25   46:astore          10
	//*  26   48:aload_0         
	//*  27   49:aload           10
	//*  28   51:invokevirtual   #237 <Method int getPosition(View)>
	//*  29   54:istore          9
	//*  30   56:iload           9
	//*  31   58:iflt            172
	//*  32   61:iload           9
	//*  33   63:iload           5
	//*  34   65:icmpge          172
	//*  35   68:aload           10
	//*  36   70:invokevirtual   #559 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  37   73:checkcast       #561 <Class RecyclerView$LayoutParams>
	//*  38   76:invokevirtual   #564 <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
	//*  39   79:ifeq            113
	//*  40   82:aload_1         
	//*  41   83:ifnonnull       172
	//*  42   86:aload_2         
	//*  43   87:astore_1        
	//*  44   88:aload           10
	//*  45   90:astore_2        
	//*  46   91:iload_3         
	//*  47   92:iload           6
	//*  48   94:iadd            
	//*  49   95:istore_3        
	//*  50   96:aload_2         
	//*  51   97:astore          10
	//*  52   99:aload_1         
	//*  53  100:astore_2        
	//*  54  101:aload           10
	//*  55  103:astore_1        
	//*  56  104:goto            35
			l = -1;
	//   57  107:iconst_m1       
	//   58  108:istore          6
		recycler = null;
		if(i == j) goto _L2; else goto _L1
_L1:
		obj = ((Object) (getChildAt(i)));
		k1 = getPosition(((View) (obj)));
		if(k1 < 0 || k1 >= k)
			break MISSING_BLOCK_LABEL_172;
		if(!((RecyclerView.LayoutParams)((View) (obj)).getLayoutParams()).isItemRemoved()) goto _L4; else goto _L3
_L3:
		if(recycler != null)
			break MISSING_BLOCK_LABEL_172;
		recycler = ((RecyclerView.Recycler) (state));
		state = ((RecyclerView.State) (obj));
_L9:
		i += l;
		obj = ((Object) (state));
		state = ((RecyclerView.State) (recycler));
		recycler = ((RecyclerView.Recycler) (obj));
		break MISSING_BLOCK_LABEL_35;
	//*  59  110:goto            33
_L4:
		if(mOrientationHelper.getDecoratedStart(((View) (obj))) >= j1) goto _L6; else goto _L5
	//   60  113:aload_0         
	//   61  114:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   62  117:aload           10
	//   63  119:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//   64  122:iload           8
	//   65  124:icmpge          145
_L5:
		Object obj1 = obj;
	//   66  127:aload           10
	//   67  129:astore          11
		if(mOrientationHelper.getDecoratedEnd(((View) (obj))) >= i1) goto _L7; else goto _L6
	//   68  131:aload_0         
	//   69  132:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   70  135:aload           10
	//   71  137:invokevirtual   #356 <Method int OrientationHelper.getDecoratedEnd(View)>
	//   72  140:iload           7
	//   73  142:icmpge          164
_L6:
		if(state != null)
			break MISSING_BLOCK_LABEL_172;
	//   74  145:aload_2         
	//   75  146:ifnonnull       172
		state = ((RecyclerView.State) (recycler));
	//   76  149:aload_1         
	//   77  150:astore_2        
		recycler = ((RecyclerView.Recycler) (obj));
	//   78  151:aload           10
	//   79  153:astore_1        
		continue; /* Loop/switch isn't completed */
	//   80  154:goto            91
_L2:
		if(state == null)
	//*  81  157:aload_2         
	//*  82  158:ifnull          167
	//*  83  161:aload_2         
	//*  84  162:astore          11
	//*  85  164:aload           11
	//*  86  166:areturn         
			state = ((RecyclerView.State) (recycler));
	//   87  167:aload_1         
	//   88  168:astore_2        
		obj1 = ((Object) (state));
_L7:
		return ((View) (obj1));
	//*  89  169:goto            161
		RecyclerView.Recycler recycler1 = recycler;
	//   90  172:aload_1         
	//   91  173:astore          10
		recycler = ((RecyclerView.Recycler) (state));
	//   92  175:aload_2         
	//   93  176:astore_1        
		state = ((RecyclerView.State) (recycler1));
	//   94  177:aload           10
	//   95  179:astore_2        
		if(true) goto _L9; else goto _L8
	//   96  180:goto            91
_L8:
	}

	public View findViewByPosition(int i)
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #127 <Method int getChildCount()>
	//    2    4:istore_2        
		if(j != 0) goto _L2; else goto _L1
	//    3    5:iload_2         
	//    4    6:ifne            15
_L1:
		View view = null;
	//    5    9:aconst_null     
	//    6   10:astore          4
_L4:
		return view;
	//    7   12:aload           4
	//    8   14:areturn         
_L2:
		View view1;
		int k = i - getPosition(getChildAt(0));
	//    9   15:iload_1         
	//   10   16:aload_0         
	//   11   17:aload_0         
	//   12   18:iconst_0        
	//   13   19:invokevirtual   #209 <Method View getChildAt(int)>
	//   14   22:invokevirtual   #237 <Method int getPosition(View)>
	//   15   25:isub            
	//   16   26:istore_3        
		if(k < 0 || k >= j)
			break; /* Loop/switch isn't completed */
	//   17   27:iload_3         
	//   18   28:iflt            57
	//   19   31:iload_3         
	//   20   32:iload_2         
	//   21   33:icmpge          57
		view1 = getChildAt(k);
	//   22   36:aload_0         
	//   23   37:iload_3         
	//   24   38:invokevirtual   #209 <Method View getChildAt(int)>
	//   25   41:astore          5
		view = view1;
	//   26   43:aload           5
	//   27   45:astore          4
		if(getPosition(view1) == i) goto _L4; else goto _L3
	//   28   47:aload_0         
	//   29   48:aload           5
	//   30   50:invokevirtual   #237 <Method int getPosition(View)>
	//   31   53:iload_1         
	//   32   54:icmpeq          12
_L3:
		return super.findViewByPosition(i);
	//   33   57:aload_0         
	//   34   58:iload_1         
	//   35   59:invokespecial   #565 <Method View RecyclerView$LayoutManager.findViewByPosition(int)>
	//   36   62:areturn         
	}

	public RecyclerView.LayoutParams generateDefaultLayoutParams()
	{
		return new RecyclerView.LayoutParams(-2, -2);
	//    0    0:new             #561 <Class RecyclerView$LayoutParams>
	//    1    3:dup             
	//    2    4:bipush          -2
	//    3    6:bipush          -2
	//    4    8:invokespecial   #569 <Method void RecyclerView$LayoutParams(int, int)>
	//    5   11:areturn         
	}

	protected int getExtraLayoutSpace(RecyclerView.State state)
	{
		if(state.hasTargetScrollPosition())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #572 <Method boolean RecyclerView$State.hasTargetScrollPosition()>
	//*   2    4:ifeq            15
			return mOrientationHelper.getTotalSpace();
	//    3    7:aload_0         
	//    4    8:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//    5   11:invokevirtual   #413 <Method int OrientationHelper.getTotalSpace()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public int getInitialPrefetchItemCount()
	{
		return mInitialPrefetchItemCount;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field int mInitialPrefetchItemCount>
	//    2    4:ireturn         
	}

	public int getOrientation()
	{
		return mOrientation;
	//    0    0:aload_0         
	//    1    1:getfield        #362 <Field int mOrientation>
	//    2    4:ireturn         
	}

	public boolean getRecycleChildrenOnDetach()
	{
		return mRecycleChildrenOnDetach;
	//    0    0:aload_0         
	//    1    1:getfield        #577 <Field boolean mRecycleChildrenOnDetach>
	//    2    4:ireturn         
	}

	public boolean getReverseLayout()
	{
		return mReverseLayout;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field boolean mReverseLayout>
	//    2    4:ireturn         
	}

	public boolean getStackFromEnd()
	{
		return mStackFromEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field boolean mStackFromEnd>
	//    2    4:ireturn         
	}

	protected boolean isLayoutRTL()
	{
		return getLayoutDirection() == 1;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #582 <Method int getLayoutDirection()>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean isSmoothScrollbarEnabled()
	{
		return mSmoothScrollbarEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field boolean mSmoothScrollbarEnabled>
	//    2    4:ireturn         
	}

	void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutState layoutstate, LayoutChunkResult layoutchunkresult)
	{
		recycler = ((RecyclerView.Recycler) (layoutstate.next(recycler)));
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #587 <Method View LinearLayoutManager$LayoutState.next(RecyclerView$Recycler)>
	//    3    5:astore_1        
		if(recycler == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       17
		{
			layoutchunkresult.mFinished = true;
	//    6   10:aload           4
	//    7   12:iconst_1        
	//    8   13:putfield        #527 <Field boolean LinearLayoutManager$LayoutChunkResult.mFinished>
			return;
	//    9   16:return          
		}
		state = ((RecyclerView.State) ((RecyclerView.LayoutParams)((View) (recycler)).getLayoutParams()));
	//   10   17:aload_1         
	//   11   18:invokevirtual   #559 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   12   21:checkcast       #561 <Class RecyclerView$LayoutParams>
	//   13   24:astore_2        
		int i;
		int j;
		int k;
		int l;
		if(layoutstate.mScrapList == null)
	//*  14   25:aload_3         
	//*  15   26:getfield        #262 <Field List LinearLayoutManager$LayoutState.mScrapList>
	//*  16   29:ifnonnull       204
		{
			boolean flag2 = mShouldReverseLayout;
	//   17   32:aload_0         
	//   18   33:getfield        #71  <Field boolean mShouldReverseLayout>
	//   19   36:istore          10
			boolean flag;
			if(layoutstate.mLayoutDirection == -1)
	//*  20   38:aload_3         
	//*  21   39:getfield        #329 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//*  22   42:iconst_m1       
	//*  23   43:icmpne          189
				flag = true;
	//   24   46:iconst_1        
	//   25   47:istore          9
			else
	//*  26   49:iload           10
	//*  27   51:iload           9
	//*  28   53:icmpne          195
	//*  29   56:aload_0         
	//*  30   57:aload_1         
	//*  31   58:invokevirtual   #590 <Method void addView(View)>
	//*  32   61:aload_0         
	//*  33   62:aload_1         
	//*  34   63:iconst_0        
	//*  35   64:iconst_0        
	//*  36   65:invokevirtual   #594 <Method void measureChildWithMargins(View, int, int)>
	//*  37   68:aload           4
	//*  38   70:aload_0         
	//*  39   71:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  40   74:aload_1         
	//*  41   75:invokevirtual   #256 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//*  42   78:putfield        #530 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//*  43   81:aload_0         
	//*  44   82:getfield        #362 <Field int mOrientation>
	//*  45   85:iconst_1        
	//*  46   86:icmpne          298
	//*  47   89:aload_0         
	//*  48   90:invokevirtual   #365 <Method boolean isLayoutRTL()>
	//*  49   93:ifeq            251
	//*  50   96:aload_0         
	//*  51   97:invokevirtual   #597 <Method int getWidth()>
	//*  52  100:aload_0         
	//*  53  101:invokevirtual   #600 <Method int getPaddingRight()>
	//*  54  104:isub            
	//*  55  105:istore          5
	//*  56  107:iload           5
	//*  57  109:aload_0         
	//*  58  110:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  59  113:aload_1         
	//*  60  114:invokevirtual   #603 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//*  61  117:isub            
	//*  62  118:istore          6
	//*  63  120:aload_3         
	//*  64  121:getfield        #329 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//*  65  124:iconst_m1       
	//*  66  125:icmpne          273
	//*  67  128:aload_3         
	//*  68  129:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//*  69  132:istore          8
	//*  70  134:aload_3         
	//*  71  135:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//*  72  138:aload           4
	//*  73  140:getfield        #530 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//*  74  143:isub            
	//*  75  144:istore          7
	//*  76  146:aload_0         
	//*  77  147:aload_1         
	//*  78  148:iload           6
	//*  79  150:iload           7
	//*  80  152:iload           5
	//*  81  154:iload           8
	//*  82  156:invokevirtual   #607 <Method void layoutDecoratedWithMargins(View, int, int, int, int)>
	//*  83  159:aload_2         
	//*  84  160:invokevirtual   #564 <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
	//*  85  163:ifne            173
	//*  86  166:aload_2         
	//*  87  167:invokevirtual   #610 <Method boolean RecyclerView$LayoutParams.isItemChanged()>
	//*  88  170:ifeq            179
	//*  89  173:aload           4
	//*  90  175:iconst_1        
	//*  91  176:putfield        #533 <Field boolean LinearLayoutManager$LayoutChunkResult.mIgnoreConsumed>
	//*  92  179:aload           4
	//*  93  181:aload_1         
	//*  94  182:invokevirtual   #613 <Method boolean View.hasFocusable()>
	//*  95  185:putfield        #536 <Field boolean LinearLayoutManager$LayoutChunkResult.mFocusable>
	//*  96  188:return          
				flag = false;
	//   97  189:iconst_0        
	//   98  190:istore          9
			if(flag2 == flag)
				addView(((View) (recycler)));
			else
	//*  99  192:goto            49
				addView(((View) (recycler)), 0);
	//  100  195:aload_0         
	//  101  196:aload_1         
	//  102  197:iconst_0        
	//  103  198:invokevirtual   #616 <Method void addView(View, int)>
		} else
	//* 104  201:goto            61
		{
			boolean flag3 = mShouldReverseLayout;
	//  105  204:aload_0         
	//  106  205:getfield        #71  <Field boolean mShouldReverseLayout>
	//  107  208:istore          10
			boolean flag1;
			if(layoutstate.mLayoutDirection == -1)
	//* 108  210:aload_3         
	//* 109  211:getfield        #329 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//* 110  214:iconst_m1       
	//* 111  215:icmpne          236
				flag1 = true;
	//  112  218:iconst_1        
	//  113  219:istore          9
			else
	//* 114  221:iload           10
	//* 115  223:iload           9
	//* 116  225:icmpne          242
	//* 117  228:aload_0         
	//* 118  229:aload_1         
	//* 119  230:invokevirtual   #619 <Method void addDisappearingView(View)>
	//* 120  233:goto            61
				flag1 = false;
	//  121  236:iconst_0        
	//  122  237:istore          9
			if(flag3 == flag1)
				addDisappearingView(((View) (recycler)));
			else
	//* 123  239:goto            221
				addDisappearingView(((View) (recycler)), 0);
	//  124  242:aload_0         
	//  125  243:aload_1         
	//  126  244:iconst_0        
	//  127  245:invokevirtual   #621 <Method void addDisappearingView(View, int)>
		}
		measureChildWithMargins(((View) (recycler)), 0, 0);
		layoutchunkresult.mConsumed = mOrientationHelper.getDecoratedMeasurement(((View) (recycler)));
		if(mOrientation == 1)
		{
			if(isLayoutRTL())
			{
				i = getWidth() - getPaddingRight();
				j = i - mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler)));
			} else
	//* 128  248:goto            61
			{
				j = getPaddingLeft();
	//  129  251:aload_0         
	//  130  252:invokevirtual   #624 <Method int getPaddingLeft()>
	//  131  255:istore          6
				i = mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler))) + j;
	//  132  257:aload_0         
	//  133  258:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  134  261:aload_1         
	//  135  262:invokevirtual   #603 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//  136  265:iload           6
	//  137  267:iadd            
	//  138  268:istore          5
			}
			if(layoutstate.mLayoutDirection == -1)
			{
				l = layoutstate.mOffset;
				k = layoutstate.mOffset - layoutchunkresult.mConsumed;
			} else
	//* 139  270:goto            120
			{
				k = layoutstate.mOffset;
	//  140  273:aload_3         
	//  141  274:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  142  277:istore          7
				l = layoutstate.mOffset;
	//  143  279:aload_3         
	//  144  280:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  145  283:istore          8
				l = layoutchunkresult.mConsumed + l;
	//  146  285:aload           4
	//  147  287:getfield        #530 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//  148  290:iload           8
	//  149  292:iadd            
	//  150  293:istore          8
			}
		} else
	//* 151  295:goto            146
		{
			k = getPaddingTop();
	//  152  298:aload_0         
	//  153  299:invokevirtual   #627 <Method int getPaddingTop()>
	//  154  302:istore          7
			l = k + mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler)));
	//  155  304:iload           7
	//  156  306:aload_0         
	//  157  307:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  158  310:aload_1         
	//  159  311:invokevirtual   #603 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//  160  314:iadd            
	//  161  315:istore          8
			if(layoutstate.mLayoutDirection == -1)
	//* 162  317:aload_3         
	//* 163  318:getfield        #329 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//* 164  321:iconst_m1       
	//* 165  322:icmpne          346
			{
				i = layoutstate.mOffset;
	//  166  325:aload_3         
	//  167  326:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  168  329:istore          5
				j = layoutstate.mOffset - layoutchunkresult.mConsumed;
	//  169  331:aload_3         
	//  170  332:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  171  335:aload           4
	//  172  337:getfield        #530 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//  173  340:isub            
	//  174  341:istore          6
			} else
	//* 175  343:goto            146
			{
				j = layoutstate.mOffset;
	//  176  346:aload_3         
	//  177  347:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  178  350:istore          6
				i = layoutstate.mOffset + layoutchunkresult.mConsumed;
	//  179  352:aload_3         
	//  180  353:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  181  356:aload           4
	//  182  358:getfield        #530 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//  183  361:iadd            
	//  184  362:istore          5
			}
		}
		layoutDecoratedWithMargins(((View) (recycler)), j, k, i, l);
		if(((RecyclerView.LayoutParams) (state)).isItemRemoved() || ((RecyclerView.LayoutParams) (state)).isItemChanged())
			layoutchunkresult.mIgnoreConsumed = true;
		layoutchunkresult.mFocusable = ((View) (recycler)).hasFocusable();
	//* 185  364:goto            146
	}

	void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorinfo, int i)
	{
	//    0    0:return          
	}

	public void onDetachedFromWindow(RecyclerView recyclerview, RecyclerView.Recycler recycler)
	{
		super.onDetachedFromWindow(recyclerview, recycler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #633 <Method void RecyclerView$LayoutManager.onDetachedFromWindow(RecyclerView, RecyclerView$Recycler)>
		if(mRecycleChildrenOnDetach)
	//*   4    6:aload_0         
	//*   5    7:getfield        #577 <Field boolean mRecycleChildrenOnDetach>
	//*   6   10:ifeq            22
		{
			removeAndRecycleAllViews(recycler);
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #637 <Method void removeAndRecycleAllViews(RecyclerView$Recycler)>
			recycler.clear();
	//   10   18:aload_2         
	//   11   19:invokevirtual   #640 <Method void RecyclerView$Recycler.clear()>
		}
	//   12   22:return          
	}

	public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		resolveShouldLayoutReverse();
	//    0    0:aload_0         
	//    1    1:invokespecial   #478 <Method void resolveShouldLayoutReverse()>
		if(getChildCount() == 0)
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #127 <Method int getChildCount()>
	//*   4    8:ifne            15
		{
			view = null;
	//    5   11:aconst_null     
	//    6   12:astore_1        
		} else
	//*   7   13:aload_1         
	//*   8   14:areturn         
		{
			i = convertFocusDirectionToLayoutDirection(i);
	//    9   15:aload_0         
	//   10   16:iload_2         
	//   11   17:invokevirtual   #644 <Method int convertFocusDirectionToLayoutDirection(int)>
	//   12   20:istore_2        
			if(i == 0x80000000)
	//*  13   21:iload_2         
	//*  14   22:ldc1            #29  <Int 0x80000000>
	//*  15   24:icmpne          29
				return null;
	//   16   27:aconst_null     
	//   17   28:areturn         
			ensureLayoutState();
	//   18   29:aload_0         
	//   19   30:invokevirtual   #130 <Method void ensureLayoutState()>
			ensureLayoutState();
	//   20   33:aload_0         
	//   21   34:invokevirtual   #130 <Method void ensureLayoutState()>
			updateLayoutState(i, (int)(0.3333333F * (float)mOrientationHelper.getTotalSpace()), false, state);
	//   22   37:aload_0         
	//   23   38:iload_2         
	//   24   39:ldc1            #32  <Float 0.3333333F>
	//   25   41:aload_0         
	//   26   42:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   27   45:invokevirtual   #413 <Method int OrientationHelper.getTotalSpace()>
	//   28   48:i2f             
	//   29   49:fmul            
	//   30   50:f2i             
	//   31   51:iconst_0        
	//   32   52:aload           4
	//   33   54:invokespecial   #462 <Method void updateLayoutState(int, int, boolean, RecyclerView$State)>
			mLayoutState.mScrollingOffset = 0x80000000;
	//   34   57:aload_0         
	//   35   58:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   36   61:ldc1            #29  <Int 0x80000000>
	//   37   63:putfield        #332 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
			mLayoutState.mRecycle = false;
	//   38   66:aload_0         
	//   39   67:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   40   70:iconst_0        
	//   41   71:putfield        #323 <Field boolean LinearLayoutManager$LayoutState.mRecycle>
			fill(recycler, mLayoutState, state, true);
	//   42   74:aload_0         
	//   43   75:aload_3         
	//   44   76:aload_0         
	//   45   77:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   46   80:aload           4
	//   47   82:iconst_1        
	//   48   83:invokevirtual   #281 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//   49   86:pop             
			if(i == -1)
	//*  50   87:iload_2         
	//*  51   88:iconst_m1       
	//*  52   89:icmpne          123
				recycler = ((RecyclerView.Recycler) (findPartiallyOrCompletelyInvisibleChildClosestToStart(recycler, state)));
	//   53   92:aload_0         
	//   54   93:aload_3         
	//   55   94:aload           4
	//   56   96:invokespecial   #646 <Method View findPartiallyOrCompletelyInvisibleChildClosestToStart(RecyclerView$Recycler, RecyclerView$State)>
	//   57   99:astore_3        
			else
	//*  58  100:iload_2         
	//*  59  101:iconst_m1       
	//*  60  102:icmpne          134
	//*  61  105:aload_0         
	//*  62  106:invokespecial   #264 <Method View getChildClosestToStart()>
	//*  63  109:astore_1        
	//*  64  110:aload_1         
	//*  65  111:invokevirtual   #613 <Method boolean View.hasFocusable()>
	//*  66  114:ifeq            142
	//*  67  117:aload_3         
	//*  68  118:ifnonnull       13
	//*  69  121:aconst_null     
	//*  70  122:areturn         
				recycler = ((RecyclerView.Recycler) (findPartiallyOrCompletelyInvisibleChildClosestToEnd(recycler, state)));
	//   71  123:aload_0         
	//   72  124:aload_3         
	//   73  125:aload           4
	//   74  127:invokespecial   #648 <Method View findPartiallyOrCompletelyInvisibleChildClosestToEnd(RecyclerView$Recycler, RecyclerView$State)>
	//   75  130:astore_3        
			if(i == -1)
				view = getChildClosestToStart();
			else
	//*  76  131:goto            100
				view = getChildClosestToEnd();
	//   77  134:aload_0         
	//   78  135:invokespecial   #283 <Method View getChildClosestToEnd()>
	//   79  138:astore_1        
			if(view.hasFocusable())
			{
				if(recycler == null)
					return null;
			} else
	//*  80  139:goto            110
			{
				return ((View) (recycler));
	//   81  142:aload_3         
	//   82  143:areturn         
			}
		}
		return view;
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #652 <Method void RecyclerView$LayoutManager.onInitializeAccessibilityEvent(AccessibilityEvent)>
		if(getChildCount() > 0)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #127 <Method int getChildCount()>
	//*   5    9:ifle            28
		{
			accessibilityevent.setFromIndex(findFirstVisibleItemPosition());
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #654 <Method int findFirstVisibleItemPosition()>
	//    9   17:invokevirtual   #659 <Method void AccessibilityEvent.setFromIndex(int)>
			accessibilityevent.setToIndex(findLastVisibleItemPosition());
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:invokevirtual   #661 <Method int findLastVisibleItemPosition()>
	//   13   25:invokevirtual   #664 <Method void AccessibilityEvent.setToIndex(int)>
		}
	//   14   28:return          
	}

	public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		int k = -1;
	//    0    0:iconst_m1       
	//    1    1:istore          5
		if((mPendingSavedState != null || mPendingScrollPosition != -1) && state.getItemCount() == 0)
	//*   2    3:aload_0         
	//*   3    4:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*   4    7:ifnonnull       18
	//*   5   10:aload_0         
	//*   6   11:getfield        #77  <Field int mPendingScrollPosition>
	//*   7   14:iconst_m1       
	//*   8   15:icmpeq          31
	//*   9   18:aload_2         
	//*  10   19:invokevirtual   #163 <Method int RecyclerView$State.getItemCount()>
	//*  11   22:ifne            31
		{
			removeAndRecycleAllViews(recycler);
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:invokevirtual   #637 <Method void removeAndRecycleAllViews(RecyclerView$Recycler)>
			return;
	//   15   30:return          
		}
		if(mPendingSavedState != null && mPendingSavedState.hasValidAnchor())
	//*  16   31:aload_0         
	//*  17   32:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*  18   35:ifnull          59
	//*  19   38:aload_0         
	//*  20   39:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*  21   42:invokevirtual   #401 <Method boolean LinearLayoutManager$SavedState.hasValidAnchor()>
	//*  22   45:ifeq            59
			mPendingScrollPosition = mPendingSavedState.mAnchorPosition;
	//   23   48:aload_0         
	//   24   49:aload_0         
	//   25   50:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   26   53:getfield        #471 <Field int LinearLayoutManager$SavedState.mAnchorPosition>
	//   27   56:putfield        #77  <Field int mPendingScrollPosition>
		ensureLayoutState();
	//   28   59:aload_0         
	//   29   60:invokevirtual   #130 <Method void ensureLayoutState()>
		mLayoutState.mRecycle = false;
	//   30   63:aload_0         
	//   31   64:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   32   67:iconst_0        
	//   33   68:putfield        #323 <Field boolean LinearLayoutManager$LayoutState.mRecycle>
		resolveShouldLayoutReverse();
	//   34   71:aload_0         
	//   35   72:invokespecial   #478 <Method void resolveShouldLayoutReverse()>
		Object obj = ((Object) (getFocusedChild()));
	//   36   75:aload_0         
	//   37   76:invokevirtual   #370 <Method View getFocusedChild()>
	//   38   79:astore          8
		int i;
		int j;
		int l;
		int i1;
		if(!mAnchorInfo.mValid || mPendingScrollPosition != -1 || mPendingSavedState != null)
	//*  39   81:aload_0         
	//*  40   82:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//*  41   85:getfield        #669 <Field boolean LinearLayoutManager$AnchorInfo.mValid>
	//*  42   88:ifeq            106
	//*  43   91:aload_0         
	//*  44   92:getfield        #77  <Field int mPendingScrollPosition>
	//*  45   95:iconst_m1       
	//*  46   96:icmpne          106
	//*  47   99:aload_0         
	//*  48  100:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*  49  103:ifnull          664
		{
			mAnchorInfo.reset();
	//   50  106:aload_0         
	//   51  107:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//   52  110:invokevirtual   #672 <Method void LinearLayoutManager$AnchorInfo.reset()>
			mAnchorInfo.mLayoutFromEnd = mShouldReverseLayout ^ mStackFromEnd;
	//   53  113:aload_0         
	//   54  114:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//   55  117:aload_0         
	//   56  118:getfield        #71  <Field boolean mShouldReverseLayout>
	//   57  121:aload_0         
	//   58  122:getfield        #73  <Field boolean mStackFromEnd>
	//   59  125:ixor            
	//   60  126:putfield        #383 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
			updateAnchorInfoForLayout(recycler, state, mAnchorInfo);
	//   61  129:aload_0         
	//   62  130:aload_1         
	//   63  131:aload_2         
	//   64  132:aload_0         
	//   65  133:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//   66  136:invokespecial   #674 <Method void updateAnchorInfoForLayout(RecyclerView$Recycler, RecyclerView$State, LinearLayoutManager$AnchorInfo)>
			mAnchorInfo.mValid = true;
	//   67  139:aload_0         
	//   68  140:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//   69  143:iconst_1        
	//   70  144:putfield        #669 <Field boolean LinearLayoutManager$AnchorInfo.mValid>
		} else
	//*  71  147:aload_0         
	//*  72  148:aload_2         
	//*  73  149:invokevirtual   #433 <Method int getExtraLayoutSpace(RecyclerView$State)>
	//*  74  152:istore_3        
	//*  75  153:aload_0         
	//*  76  154:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//*  77  157:getfield        #677 <Field int LinearLayoutManager$LayoutState.mLastScrollDelta>
	//*  78  160:iflt            719
	//*  79  163:iconst_0        
	//*  80  164:istore          4
	//*  81  166:iload           4
	//*  82  168:aload_0         
	//*  83  169:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  84  172:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//*  85  175:iadd            
	//*  86  176:istore          6
	//*  87  178:iload_3         
	//*  88  179:aload_0         
	//*  89  180:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  90  183:invokevirtual   #436 <Method int OrientationHelper.getEndPadding()>
	//*  91  186:iadd            
	//*  92  187:istore          7
	//*  93  189:iload           7
	//*  94  191:istore_3        
	//*  95  192:iload           6
	//*  96  194:istore          4
	//*  97  196:aload_2         
	//*  98  197:invokevirtual   #219 <Method boolean RecyclerView$State.isPreLayout()>
	//*  99  200:ifeq            299
	//* 100  203:iload           7
	//* 101  205:istore_3        
	//* 102  206:iload           6
	//* 103  208:istore          4
	//* 104  210:aload_0         
	//* 105  211:getfield        #77  <Field int mPendingScrollPosition>
	//* 106  214:iconst_m1       
	//* 107  215:icmpeq          299
	//* 108  218:iload           7
	//* 109  220:istore_3        
	//* 110  221:iload           6
	//* 111  223:istore          4
	//* 112  225:aload_0         
	//* 113  226:getfield        #79  <Field int mPendingScrollPositionOffset>
	//* 114  229:ldc1            #29  <Int 0x80000000>
	//* 115  231:icmpeq          299
	//* 116  234:aload_0         
	//* 117  235:aload_0         
	//* 118  236:getfield        #77  <Field int mPendingScrollPosition>
	//* 119  239:invokevirtual   #410 <Method View findViewByPosition(int)>
	//* 120  242:astore          8
	//* 121  244:iload           7
	//* 122  246:istore_3        
	//* 123  247:iload           6
	//* 124  249:istore          4
	//* 125  251:aload           8
	//* 126  253:ifnull          299
	//* 127  256:aload_0         
	//* 128  257:getfield        #71  <Field boolean mShouldReverseLayout>
	//* 129  260:ifeq            727
	//* 130  263:aload_0         
	//* 131  264:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//* 132  267:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//* 133  270:aload_0         
	//* 134  271:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//* 135  274:aload           8
	//* 136  276:invokevirtual   #356 <Method int OrientationHelper.getDecoratedEnd(View)>
	//* 137  279:isub            
	//* 138  280:aload_0         
	//* 139  281:getfield        #79  <Field int mPendingScrollPositionOffset>
	//* 140  284:isub            
	//* 141  285:istore_3        
	//* 142  286:iload_3         
	//* 143  287:ifle            759
	//* 144  290:iload           6
	//* 145  292:iload_3         
	//* 146  293:iadd            
	//* 147  294:istore          4
	//* 148  296:iload           7
	//* 149  298:istore_3        
	//* 150  299:aload_0         
	//* 151  300:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//* 152  303:getfield        #383 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
	//* 153  306:ifeq            771
	//* 154  309:aload_0         
	//* 155  310:getfield        #71  <Field boolean mShouldReverseLayout>
	//* 156  313:ifeq            319
	//* 157  316:iconst_1        
	//* 158  317:istore          5
	//* 159  319:aload_0         
	//* 160  320:aload_1         
	//* 161  321:aload_2         
	//* 162  322:aload_0         
	//* 163  323:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//* 164  326:iload           5
	//* 165  328:invokevirtual   #679 <Method void onAnchorReady(RecyclerView$Recycler, RecyclerView$State, LinearLayoutManager$AnchorInfo, int)>
	//* 166  331:aload_0         
	//* 167  332:aload_1         
	//* 168  333:invokevirtual   #682 <Method void detachAndScrapAttachedViews(RecyclerView$Recycler)>
	//* 169  336:aload_0         
	//* 170  337:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 171  340:aload_0         
	//* 172  341:invokevirtual   #430 <Method boolean resolveIsInfinite()>
	//* 173  344:putfield        #326 <Field boolean LinearLayoutManager$LayoutState.mInfinite>
	//* 174  347:aload_0         
	//* 175  348:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 176  351:aload_2         
	//* 177  352:invokevirtual   #219 <Method boolean RecyclerView$State.isPreLayout()>
	//* 178  355:putfield        #685 <Field boolean LinearLayoutManager$LayoutState.mIsPreLayout>
	//* 179  358:aload_0         
	//* 180  359:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//* 181  362:getfield        #383 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
	//* 182  365:ifeq            784
	//* 183  368:aload_0         
	//* 184  369:aload_0         
	//* 185  370:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//* 186  373:invokespecial   #687 <Method void updateLayoutStateToFillStart(LinearLayoutManager$AnchorInfo)>
	//* 187  376:aload_0         
	//* 188  377:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 189  380:iload           4
	//* 190  382:putfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
	//* 191  385:aload_0         
	//* 192  386:aload_1         
	//* 193  387:aload_0         
	//* 194  388:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 195  391:aload_2         
	//* 196  392:iconst_0        
	//* 197  393:invokevirtual   #281 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//* 198  396:pop             
	//* 199  397:aload_0         
	//* 200  398:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 201  401:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//* 202  404:istore          6
	//* 203  406:aload_0         
	//* 204  407:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 205  410:getfield        #442 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//* 206  413:istore          7
	//* 207  415:iload_3         
	//* 208  416:istore          4
	//* 209  418:aload_0         
	//* 210  419:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 211  422:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//* 212  425:ifle            439
	//* 213  428:iload_3         
	//* 214  429:aload_0         
	//* 215  430:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 216  433:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//* 217  436:iadd            
	//* 218  437:istore          4
	//* 219  439:aload_0         
	//* 220  440:aload_0         
	//* 221  441:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//* 222  444:invokespecial   #689 <Method void updateLayoutStateToFillEnd(LinearLayoutManager$AnchorInfo)>
	//* 223  447:aload_0         
	//* 224  448:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 225  451:iload           4
	//* 226  453:putfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
	//* 227  456:aload_0         
	//* 228  457:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 229  460:astore          8
	//* 230  462:aload           8
	//* 231  464:aload           8
	//* 232  466:getfield        #442 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//* 233  469:aload_0         
	//* 234  470:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 235  473:getfield        #439 <Field int LinearLayoutManager$LayoutState.mItemDirection>
	//* 236  476:iadd            
	//* 237  477:putfield        #442 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//* 238  480:aload_0         
	//* 239  481:aload_1         
	//* 240  482:aload_0         
	//* 241  483:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 242  486:aload_2         
	//* 243  487:iconst_0        
	//* 244  488:invokevirtual   #281 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//* 245  491:pop             
	//* 246  492:aload_0         
	//* 247  493:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 248  496:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//* 249  499:istore          5
	//* 250  501:aload_0         
	//* 251  502:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 252  505:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//* 253  508:ifle            1038
	//* 254  511:aload_0         
	//* 255  512:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 256  515:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//* 257  518:istore_3        
	//* 258  519:aload_0         
	//* 259  520:iload           7
	//* 260  522:iload           6
	//* 261  524:invokespecial   #268 <Method void updateLayoutStateToFillStart(int, int)>
	//* 262  527:aload_0         
	//* 263  528:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 264  531:iload_3         
	//* 265  532:putfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
	//* 266  535:aload_0         
	//* 267  536:aload_1         
	//* 268  537:aload_0         
	//* 269  538:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 270  541:aload_2         
	//* 271  542:iconst_0        
	//* 272  543:invokevirtual   #281 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//* 273  546:pop             
	//* 274  547:aload_0         
	//* 275  548:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 276  551:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//* 277  554:istore_3        
	//* 278  555:iload_3         
	//* 279  556:istore          4
	//* 280  558:iload           5
	//* 281  560:istore_3        
	//* 282  561:iload_3         
	//* 283  562:istore          5
	//* 284  564:iload           4
	//* 285  566:istore          6
	//* 286  568:aload_0         
	//* 287  569:invokevirtual   #127 <Method int getChildCount()>
	//* 288  572:ifle            631
	//* 289  575:aload_0         
	//* 290  576:getfield        #71  <Field boolean mShouldReverseLayout>
	//* 291  579:aload_0         
	//* 292  580:getfield        #73  <Field boolean mStackFromEnd>
	//* 293  583:ixor            
	//* 294  584:ifeq            983
	//* 295  587:aload_0         
	//* 296  588:iload_3         
	//* 297  589:aload_1         
	//* 298  590:aload_2         
	//* 299  591:iconst_1        
	//* 300  592:invokespecial   #691 <Method int fixLayoutEndGap(int, RecyclerView$Recycler, RecyclerView$State, boolean)>
	//* 301  595:istore          5
	//* 302  597:iload           4
	//* 303  599:iload           5
	//* 304  601:iadd            
	//* 305  602:istore          6
	//* 306  604:aload_0         
	//* 307  605:iload           6
	//* 308  607:aload_1         
	//* 309  608:aload_2         
	//* 310  609:iconst_0        
	//* 311  610:invokespecial   #693 <Method int fixLayoutStartGap(int, RecyclerView$Recycler, RecyclerView$State, boolean)>
	//* 312  613:istore          4
	//* 313  615:iload           6
	//* 314  617:iload           4
	//* 315  619:iadd            
	//* 316  620:istore          6
	//* 317  622:iload_3         
	//* 318  623:iload           5
	//* 319  625:iadd            
	//* 320  626:iload           4
	//* 321  628:iadd            
	//* 322  629:istore          5
	//* 323  631:aload_0         
	//* 324  632:aload_1         
	//* 325  633:aload_2         
	//* 326  634:iload           6
	//* 327  636:iload           5
	//* 328  638:invokespecial   #695 <Method void layoutForPredictiveAnimations(RecyclerView$Recycler, RecyclerView$State, int, int)>
	//* 329  641:aload_2         
	//* 330  642:invokevirtual   #219 <Method boolean RecyclerView$State.isPreLayout()>
	//* 331  645:ifne            1028
	//* 332  648:aload_0         
	//* 333  649:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//* 334  652:invokevirtual   #698 <Method void OrientationHelper.onLayoutComplete()>
	//* 335  655:aload_0         
	//* 336  656:aload_0         
	//* 337  657:getfield        #73  <Field boolean mStackFromEnd>
	//* 338  660:putfield        #380 <Field boolean mLastStackFromEnd>
	//* 339  663:return          
		if(obj != null && (mOrientationHelper.getDecoratedStart(((View) (obj))) >= mOrientationHelper.getEndAfterPadding() || mOrientationHelper.getDecoratedEnd(((View) (obj))) <= mOrientationHelper.getStartAfterPadding()))
	//* 340  664:aload           8
	//* 341  666:ifnull          147
	//* 342  669:aload_0         
	//* 343  670:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//* 344  673:aload           8
	//* 345  675:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//* 346  678:aload_0         
	//* 347  679:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//* 348  682:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//* 349  685:icmpge          707
	//* 350  688:aload_0         
	//* 351  689:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//* 352  692:aload           8
	//* 353  694:invokevirtual   #356 <Method int OrientationHelper.getDecoratedEnd(View)>
	//* 354  697:aload_0         
	//* 355  698:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//* 356  701:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//* 357  704:icmpgt          147
			mAnchorInfo.assignFromViewAndKeepVisibleRect(((View) (obj)));
	//  358  707:aload_0         
	//  359  708:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//  360  711:aload           8
	//  361  713:invokevirtual   #378 <Method void LinearLayoutManager$AnchorInfo.assignFromViewAndKeepVisibleRect(View)>
		i = getExtraLayoutSpace(state);
		if(mLayoutState.mLastScrollDelta >= 0)
		{
			j = 0;
		} else
	//* 362  716:goto            147
		{
			j = i;
	//  363  719:iload_3         
	//  364  720:istore          4
			i = 0;
	//  365  722:iconst_0        
	//  366  723:istore_3        
		}
		l = j + mOrientationHelper.getStartAfterPadding();
		i1 = i + mOrientationHelper.getEndPadding();
		i = i1;
		j = l;
		if(state.isPreLayout())
		{
			i = i1;
			j = l;
			if(mPendingScrollPosition != -1)
			{
				i = i1;
				j = l;
				if(mPendingScrollPositionOffset != 0x80000000)
				{
					obj = ((Object) (findViewByPosition(mPendingScrollPosition)));
					i = i1;
					j = l;
					if(obj != null)
					{
						if(mShouldReverseLayout)
						{
							i = mOrientationHelper.getEndAfterPadding() - mOrientationHelper.getDecoratedEnd(((View) (obj))) - mPendingScrollPositionOffset;
						} else
	//* 367  724:goto            166
						{
							i = mOrientationHelper.getDecoratedStart(((View) (obj)));
	//  368  727:aload_0         
	//  369  728:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  370  731:aload           8
	//  371  733:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//  372  736:istore_3        
							j = mOrientationHelper.getStartAfterPadding();
	//  373  737:aload_0         
	//  374  738:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  375  741:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//  376  744:istore          4
							i = mPendingScrollPositionOffset - (i - j);
	//  377  746:aload_0         
	//  378  747:getfield        #79  <Field int mPendingScrollPositionOffset>
	//  379  750:iload_3         
	//  380  751:iload           4
	//  381  753:isub            
	//  382  754:isub            
	//  383  755:istore_3        
						}
						if(i > 0)
						{
							j = l + i;
							i = i1;
						} else
	//* 384  756:goto            286
						{
							i = i1 - i;
	//  385  759:iload           7
	//  386  761:iload_3         
	//  387  762:isub            
	//  388  763:istore_3        
							j = l;
	//  389  764:iload           6
	//  390  766:istore          4
						}
					}
				}
			}
		}
		if(mAnchorInfo.mLayoutFromEnd)
		{
			if(mShouldReverseLayout)
				k = 1;
		} else
	//* 391  768:goto            299
		if(!mShouldReverseLayout)
	//* 392  771:aload_0         
	//* 393  772:getfield        #71  <Field boolean mShouldReverseLayout>
	//* 394  775:ifne            319
			k = 1;
	//  395  778:iconst_1        
	//  396  779:istore          5
		onAnchorReady(recycler, state, mAnchorInfo, k);
		detachAndScrapAttachedViews(recycler);
		mLayoutState.mInfinite = resolveIsInfinite();
		mLayoutState.mIsPreLayout = state.isPreLayout();
		if(mAnchorInfo.mLayoutFromEnd)
		{
			updateLayoutStateToFillStart(mAnchorInfo);
			mLayoutState.mExtra = j;
			fill(recycler, mLayoutState, state, false);
			l = mLayoutState.mOffset;
			i1 = mLayoutState.mCurrentPosition;
			j = i;
			if(mLayoutState.mAvailable > 0)
				j = i + mLayoutState.mAvailable;
			updateLayoutStateToFillEnd(mAnchorInfo);
			mLayoutState.mExtra = j;
			obj = ((Object) (mLayoutState));
			obj.mCurrentPosition = ((LayoutState) (obj)).mCurrentPosition + mLayoutState.mItemDirection;
			fill(recycler, mLayoutState, state, false);
			k = mLayoutState.mOffset;
			if(mLayoutState.mAvailable > 0)
			{
				i = mLayoutState.mAvailable;
				updateLayoutStateToFillStart(i1, l);
				mLayoutState.mExtra = i;
				fill(recycler, mLayoutState, state, false);
				i = mLayoutState.mOffset;
			} else
	//* 397  781:goto            319
	//* 398  784:aload_0         
	//* 399  785:aload_0         
	//* 400  786:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//* 401  789:invokespecial   #689 <Method void updateLayoutStateToFillEnd(LinearLayoutManager$AnchorInfo)>
	//* 402  792:aload_0         
	//* 403  793:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 404  796:iload_3         
	//* 405  797:putfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
	//* 406  800:aload_0         
	//* 407  801:aload_1         
	//* 408  802:aload_0         
	//* 409  803:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 410  806:aload_2         
	//* 411  807:iconst_0        
	//* 412  808:invokevirtual   #281 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//* 413  811:pop             
	//* 414  812:aload_0         
	//* 415  813:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 416  816:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//* 417  819:istore          5
	//* 418  821:aload_0         
	//* 419  822:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 420  825:getfield        #442 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//* 421  828:istore          7
	//* 422  830:iload           4
	//* 423  832:istore_3        
	//* 424  833:aload_0         
	//* 425  834:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 426  837:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//* 427  840:ifle            854
	//* 428  843:iload           4
	//* 429  845:aload_0         
	//* 430  846:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 431  849:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//* 432  852:iadd            
	//* 433  853:istore_3        
	//* 434  854:aload_0         
	//* 435  855:aload_0         
	//* 436  856:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//* 437  859:invokespecial   #687 <Method void updateLayoutStateToFillStart(LinearLayoutManager$AnchorInfo)>
	//* 438  862:aload_0         
	//* 439  863:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 440  866:iload_3         
	//* 441  867:putfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
	//* 442  870:aload_0         
	//* 443  871:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 444  874:astore          8
	//* 445  876:aload           8
	//* 446  878:aload           8
	//* 447  880:getfield        #442 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//* 448  883:aload_0         
	//* 449  884:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 450  887:getfield        #439 <Field int LinearLayoutManager$LayoutState.mItemDirection>
	//* 451  890:iadd            
	//* 452  891:putfield        #442 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//* 453  894:aload_0         
	//* 454  895:aload_1         
	//* 455  896:aload_0         
	//* 456  897:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 457  900:aload_2         
	//* 458  901:iconst_0        
	//* 459  902:invokevirtual   #281 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//* 460  905:pop             
	//* 461  906:aload_0         
	//* 462  907:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 463  910:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//* 464  913:istore          6
	//* 465  915:iload           5
	//* 466  917:istore_3        
	//* 467  918:iload           6
	//* 468  920:istore          4
	//* 469  922:aload_0         
	//* 470  923:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 471  926:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//* 472  929:ifle            561
	//* 473  932:aload_0         
	//* 474  933:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 475  936:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//* 476  939:istore_3        
	//* 477  940:aload_0         
	//* 478  941:iload           7
	//* 479  943:iload           5
	//* 480  945:invokespecial   #286 <Method void updateLayoutStateToFillEnd(int, int)>
	//* 481  948:aload_0         
	//* 482  949:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 483  952:iload_3         
	//* 484  953:putfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
	//* 485  956:aload_0         
	//* 486  957:aload_1         
	//* 487  958:aload_0         
	//* 488  959:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 489  962:aload_2         
	//* 490  963:iconst_0        
	//* 491  964:invokevirtual   #281 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//* 492  967:pop             
	//* 493  968:aload_0         
	//* 494  969:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 495  972:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//* 496  975:istore_3        
	//* 497  976:iload           6
	//* 498  978:istore          4
	//* 499  980:goto            561
	//* 500  983:aload_0         
	//* 501  984:iload           4
	//* 502  986:aload_1         
	//* 503  987:aload_2         
	//* 504  988:iconst_1        
	//* 505  989:invokespecial   #693 <Method int fixLayoutStartGap(int, RecyclerView$Recycler, RecyclerView$State, boolean)>
	//* 506  992:istore          5
	//* 507  994:iload_3         
	//* 508  995:iload           5
	//* 509  997:iadd            
	//* 510  998:istore_3        
	//* 511  999:aload_0         
	//* 512 1000:iload_3         
	//* 513 1001:aload_1         
	//* 514 1002:aload_2         
	//* 515 1003:iconst_0        
	//* 516 1004:invokespecial   #691 <Method int fixLayoutEndGap(int, RecyclerView$Recycler, RecyclerView$State, boolean)>
	//* 517 1007:istore          7
	//* 518 1009:iload           4
	//* 519 1011:iload           5
	//* 520 1013:iadd            
	//* 521 1014:iload           7
	//* 522 1016:iadd            
	//* 523 1017:istore          6
	//* 524 1019:iload_3         
	//* 525 1020:iload           7
	//* 526 1022:iadd            
	//* 527 1023:istore          5
	//* 528 1025:goto            631
	//* 529 1028:aload_0         
	//* 530 1029:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//* 531 1032:invokevirtual   #672 <Method void LinearLayoutManager$AnchorInfo.reset()>
	//* 532 1035:goto            655
			{
				i = l;
	//  533 1038:iload           6
	//  534 1040:istore_3        
			}
			j = i;
			i = k;
		} else
		{
			updateLayoutStateToFillEnd(mAnchorInfo);
			mLayoutState.mExtra = i;
			fill(recycler, mLayoutState, state, false);
			k = mLayoutState.mOffset;
			i1 = mLayoutState.mCurrentPosition;
			i = j;
			if(mLayoutState.mAvailable > 0)
				i = j + mLayoutState.mAvailable;
			updateLayoutStateToFillStart(mAnchorInfo);
			mLayoutState.mExtra = i;
			obj = ((Object) (mLayoutState));
			obj.mCurrentPosition = ((LayoutState) (obj)).mCurrentPosition + mLayoutState.mItemDirection;
			fill(recycler, mLayoutState, state, false);
			l = mLayoutState.mOffset;
			i = k;
			j = l;
			if(mLayoutState.mAvailable > 0)
			{
				i = mLayoutState.mAvailable;
				updateLayoutStateToFillEnd(i1, k);
				mLayoutState.mExtra = i;
				fill(recycler, mLayoutState, state, false);
				i = mLayoutState.mOffset;
				j = l;
			}
		}
		k = i;
		l = j;
		if(getChildCount() > 0)
			if(mShouldReverseLayout ^ mStackFromEnd)
			{
				k = fixLayoutEndGap(i, recycler, state, true);
				l = j + k;
				j = fixLayoutStartGap(l, recycler, state, false);
				l += j;
				k = i + k + j;
			} else
			{
				k = fixLayoutStartGap(j, recycler, state, true);
				i += k;
				i1 = fixLayoutEndGap(i, recycler, state, false);
				l = j + k + i1;
				k = i + i1;
			}
		layoutForPredictiveAnimations(recycler, state, l, k);
		if(!state.isPreLayout())
			mOrientationHelper.onLayoutComplete();
		else
			mAnchorInfo.reset();
		mLastStackFromEnd = mStackFromEnd;
	//* 535 1041:goto            555
	}

	public void onLayoutCompleted(RecyclerView.State state)
	{
		super.onLayoutCompleted(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #702 <Method void RecyclerView$LayoutManager.onLayoutCompleted(RecyclerView$State)>
		mPendingSavedState = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
		mPendingScrollPosition = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #77  <Field int mPendingScrollPosition>
		mPendingScrollPositionOffset = 0x80000000;
	//    9   15:aload_0         
	//   10   16:ldc1            #29  <Int 0x80000000>
	//   11   18:putfield        #79  <Field int mPendingScrollPositionOffset>
		mAnchorInfo.reset();
	//   12   21:aload_0         
	//   13   22:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//   14   25:invokevirtual   #672 <Method void LinearLayoutManager$AnchorInfo.reset()>
	//   15   28:return          
	}

	public void onRestoreInstanceState(Parcelable parcelable)
	{
		if(parcelable instanceof SavedState)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #19  <Class LinearLayoutManager$SavedState>
	//*   2    4:ifeq            19
		{
			mPendingSavedState = (SavedState)parcelable;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #19  <Class LinearLayoutManager$SavedState>
	//    6   12:putfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
			requestLayout();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #707 <Method void requestLayout()>
		}
	//    9   19:return          
	}

	public Parcelable onSaveInstanceState()
	{
		if(mPendingSavedState != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*   2    4:ifnull          19
			return ((Parcelable) (new SavedState(mPendingSavedState)));
	//    3    7:new             #19  <Class LinearLayoutManager$SavedState>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//    7   15:invokespecial   #712 <Method void LinearLayoutManager$SavedState(LinearLayoutManager$SavedState)>
	//    8   18:areturn         
		SavedState savedstate = new SavedState();
	//    9   19:new             #19  <Class LinearLayoutManager$SavedState>
	//   10   22:dup             
	//   11   23:invokespecial   #713 <Method void LinearLayoutManager$SavedState()>
	//   12   26:astore_2        
		if(getChildCount() > 0)
	//*  13   27:aload_0         
	//*  14   28:invokevirtual   #127 <Method int getChildCount()>
	//*  15   31:ifle            129
		{
			ensureLayoutState();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #130 <Method void ensureLayoutState()>
			boolean flag = mLastStackFromEnd ^ mShouldReverseLayout;
	//   18   38:aload_0         
	//   19   39:getfield        #380 <Field boolean mLastStackFromEnd>
	//   20   42:aload_0         
	//   21   43:getfield        #71  <Field boolean mShouldReverseLayout>
	//   22   46:ixor            
	//   23   47:istore_1        
			savedstate.mAnchorLayoutFromEnd = flag;
	//   24   48:aload_2         
	//   25   49:iload_1         
	//   26   50:putfield        #404 <Field boolean LinearLayoutManager$SavedState.mAnchorLayoutFromEnd>
			if(flag)
	//*  27   53:iload_1         
	//*  28   54:ifeq            93
			{
				View view = getChildClosestToEnd();
	//   29   57:aload_0         
	//   30   58:invokespecial   #283 <Method View getChildClosestToEnd()>
	//   31   61:astore_3        
				savedstate.mAnchorOffset = mOrientationHelper.getEndAfterPadding() - mOrientationHelper.getDecoratedEnd(view);
	//   32   62:aload_2         
	//   33   63:aload_0         
	//   34   64:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   35   67:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//   36   70:aload_0         
	//   37   71:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   38   74:aload_3         
	//   39   75:invokevirtual   #356 <Method int OrientationHelper.getDecoratedEnd(View)>
	//   40   78:isub            
	//   41   79:putfield        #407 <Field int LinearLayoutManager$SavedState.mAnchorOffset>
				savedstate.mAnchorPosition = getPosition(view);
	//   42   82:aload_2         
	//   43   83:aload_0         
	//   44   84:aload_3         
	//   45   85:invokevirtual   #237 <Method int getPosition(View)>
	//   46   88:putfield        #471 <Field int LinearLayoutManager$SavedState.mAnchorPosition>
				return ((Parcelable) (savedstate));
	//   47   91:aload_2         
	//   48   92:areturn         
			} else
			{
				View view1 = getChildClosestToStart();
	//   49   93:aload_0         
	//   50   94:invokespecial   #264 <Method View getChildClosestToStart()>
	//   51   97:astore_3        
				savedstate.mAnchorPosition = getPosition(view1);
	//   52   98:aload_2         
	//   53   99:aload_0         
	//   54  100:aload_3         
	//   55  101:invokevirtual   #237 <Method int getPosition(View)>
	//   56  104:putfield        #471 <Field int LinearLayoutManager$SavedState.mAnchorPosition>
				savedstate.mAnchorOffset = mOrientationHelper.getDecoratedStart(view1) - mOrientationHelper.getStartAfterPadding();
	//   57  107:aload_2         
	//   58  108:aload_0         
	//   59  109:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   60  112:aload_3         
	//   61  113:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//   62  116:aload_0         
	//   63  117:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   64  120:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//   65  123:isub            
	//   66  124:putfield        #407 <Field int LinearLayoutManager$SavedState.mAnchorOffset>
				return ((Parcelable) (savedstate));
	//   67  127:aload_2         
	//   68  128:areturn         
			}
		} else
		{
			savedstate.invalidateAnchor();
	//   69  129:aload_2         
	//   70  130:invokevirtual   #716 <Method void LinearLayoutManager$SavedState.invalidateAnchor()>
			return ((Parcelable) (savedstate));
	//   71  133:aload_2         
	//   72  134:areturn         
		}
	}

	public void prepareForDrop(View view, View view1, int i, int j)
	{
		assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
	//    0    0:aload_0         
	//    1    1:ldc2            #724 <String "Cannot drop a view during a scroll or layout calculation">
	//    2    4:invokevirtual   #725 <Method void assertNotInLayoutOrScroll(String)>
		ensureLayoutState();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #130 <Method void ensureLayoutState()>
		resolveShouldLayoutReverse();
	//    5   11:aload_0         
	//    6   12:invokespecial   #478 <Method void resolveShouldLayoutReverse()>
		i = getPosition(view);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #237 <Method int getPosition(View)>
	//   10   20:istore_3        
		j = getPosition(view1);
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #237 <Method int getPosition(View)>
	//   14   26:istore          4
		if(i < j)
	//*  15   28:iload_3         
	//*  16   29:iload           4
	//*  17   31:icmpge          80
			i = 1;
	//   18   34:iconst_1        
	//   19   35:istore_3        
		else
	//*  20   36:aload_0         
	//*  21   37:getfield        #71  <Field boolean mShouldReverseLayout>
	//*  22   40:ifeq            108
	//*  23   43:iload_3         
	//*  24   44:iconst_1        
	//*  25   45:icmpne          85
	//*  26   48:aload_0         
	//*  27   49:iload           4
	//*  28   51:aload_0         
	//*  29   52:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  30   55:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//*  31   58:aload_0         
	//*  32   59:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  33   62:aload_2         
	//*  34   63:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  35   66:aload_0         
	//*  36   67:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  37   70:aload_1         
	//*  38   71:invokevirtual   #256 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//*  39   74:iadd            
	//*  40   75:isub            
	//*  41   76:invokevirtual   #728 <Method void scrollToPositionWithOffset(int, int)>
	//*  42   79:return          
			i = -1;
	//   43   80:iconst_m1       
	//   44   81:istore_3        
		if(mShouldReverseLayout)
			if(i == 1)
			{
				scrollToPositionWithOffset(j, mOrientationHelper.getEndAfterPadding() - (mOrientationHelper.getDecoratedStart(view1) + mOrientationHelper.getDecoratedMeasurement(view)));
				return;
			} else
	//*  45   82:goto            36
			{
				scrollToPositionWithOffset(j, mOrientationHelper.getEndAfterPadding() - mOrientationHelper.getDecoratedEnd(view1));
	//   46   85:aload_0         
	//   47   86:iload           4
	//   48   88:aload_0         
	//   49   89:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   50   92:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//   51   95:aload_0         
	//   52   96:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   53   99:aload_2         
	//   54  100:invokevirtual   #356 <Method int OrientationHelper.getDecoratedEnd(View)>
	//   55  103:isub            
	//   56  104:invokevirtual   #728 <Method void scrollToPositionWithOffset(int, int)>
				return;
	//   57  107:return          
			}
		if(i == -1)
	//*  58  108:iload_3         
	//*  59  109:iconst_m1       
	//*  60  110:icmpne          128
		{
			scrollToPositionWithOffset(j, mOrientationHelper.getDecoratedStart(view1));
	//   61  113:aload_0         
	//   62  114:iload           4
	//   63  116:aload_0         
	//   64  117:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   65  120:aload_2         
	//   66  121:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//   67  124:invokevirtual   #728 <Method void scrollToPositionWithOffset(int, int)>
			return;
	//   68  127:return          
		} else
		{
			scrollToPositionWithOffset(j, mOrientationHelper.getDecoratedEnd(view1) - mOrientationHelper.getDecoratedMeasurement(view));
	//   69  128:aload_0         
	//   70  129:iload           4
	//   71  131:aload_0         
	//   72  132:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   73  135:aload_2         
	//   74  136:invokevirtual   #356 <Method int OrientationHelper.getDecoratedEnd(View)>
	//   75  139:aload_0         
	//   76  140:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   77  143:aload_1         
	//   78  144:invokevirtual   #256 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   79  147:isub            
	//   80  148:invokevirtual   #728 <Method void scrollToPositionWithOffset(int, int)>
			return;
	//   81  151:return          
		}
	}

	boolean resolveIsInfinite()
	{
		return mOrientationHelper.getMode() == 0 && mOrientationHelper.getEnd() == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//    2    4:invokevirtual   #732 <Method int OrientationHelper.getMode()>
	//    3    7:ifne            22
	//    4   10:aload_0         
	//    5   11:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//    6   14:invokevirtual   #348 <Method int OrientationHelper.getEnd()>
	//    7   17:ifne            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	int scrollBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(getChildCount() == 0 || i == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #127 <Method int getChildCount()>
	//*   2    4:ifeq            11
	//*   3    7:iload_1         
	//*   4    8:ifne            13
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		mLayoutState.mRecycle = true;
	//    7   13:aload_0         
	//    8   14:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//    9   17:iconst_1        
	//   10   18:putfield        #323 <Field boolean LinearLayoutManager$LayoutState.mRecycle>
		ensureLayoutState();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #130 <Method void ensureLayoutState()>
		int j;
		int k;
		int l;
		if(i > 0)
	//*  13   25:iload_1         
	//*  14   26:ifle            76
			j = 1;
	//   15   29:iconst_1        
	//   16   30:istore          4
		else
	//*  17   32:iload_1         
	//*  18   33:invokestatic    #460 <Method int Math.abs(int)>
	//*  19   36:istore          5
	//*  20   38:aload_0         
	//*  21   39:iload           4
	//*  22   41:iload           5
	//*  23   43:iconst_1        
	//*  24   44:aload_3         
	//*  25   45:invokespecial   #462 <Method void updateLayoutState(int, int, boolean, RecyclerView$State)>
	//*  26   48:aload_0         
	//*  27   49:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//*  28   52:getfield        #332 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//*  29   55:aload_0         
	//*  30   56:aload_2         
	//*  31   57:aload_0         
	//*  32   58:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//*  33   61:aload_3         
	//*  34   62:iconst_0        
	//*  35   63:invokevirtual   #281 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//*  36   66:iadd            
	//*  37   67:istore          6
	//*  38   69:iload           6
	//*  39   71:ifge            82
	//*  40   74:iconst_0        
	//*  41   75:ireturn         
			j = -1;
	//   42   76:iconst_m1       
	//   43   77:istore          4
		k = Math.abs(i);
		updateLayoutState(j, k, true, state);
		l = mLayoutState.mScrollingOffset + fill(recycler, mLayoutState, state, false);
		if(l < 0)
			return 0;
	//*  44   79:goto            32
		if(k > l)
	//*  45   82:iload           5
	//*  46   84:iload           6
	//*  47   86:icmple          95
			i = j * l;
	//   48   89:iload           4
	//   49   91:iload           6
	//   50   93:imul            
	//   51   94:istore_1        
		mOrientationHelper.offsetChildren(-i);
	//   52   95:aload_0         
	//   53   96:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   54   99:iload_1         
	//   55  100:ineg            
	//   56  101:invokevirtual   #199 <Method void OrientationHelper.offsetChildren(int)>
		mLayoutState.mLastScrollDelta = i;
	//   57  104:aload_0         
	//   58  105:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   59  108:iload_1         
	//   60  109:putfield        #677 <Field int LinearLayoutManager$LayoutState.mLastScrollDelta>
		return i;
	//   61  112:iload_1         
	//   62  113:ireturn         
	}

	public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(mOrientation == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #362 <Field int mOrientation>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          10
			return 0;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		else
			return scrollBy(i, recycler, state);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_2         
	//    9   13:aload_3         
	//   10   14:invokevirtual   #196 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//   11   17:ireturn         
	}

	public void scrollToPosition(int i)
	{
		mPendingScrollPosition = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #77  <Field int mPendingScrollPosition>
		mPendingScrollPositionOffset = 0x80000000;
	//    3    5:aload_0         
	//    4    6:ldc1            #29  <Int 0x80000000>
	//    5    8:putfield        #79  <Field int mPendingScrollPositionOffset>
		if(mPendingSavedState != null)
	//*   6   11:aload_0         
	//*   7   12:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*   8   15:ifnull          25
			mPendingSavedState.invalidateAnchor();
	//    9   18:aload_0         
	//   10   19:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   11   22:invokevirtual   #716 <Method void LinearLayoutManager$SavedState.invalidateAnchor()>
		requestLayout();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #707 <Method void requestLayout()>
	//   14   29:return          
	}

	public void scrollToPositionWithOffset(int i, int j)
	{
		mPendingScrollPosition = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #77  <Field int mPendingScrollPosition>
		mPendingScrollPositionOffset = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #79  <Field int mPendingScrollPositionOffset>
		if(mPendingSavedState != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*   8   14:ifnull          24
			mPendingSavedState.invalidateAnchor();
	//    9   17:aload_0         
	//   10   18:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   11   21:invokevirtual   #716 <Method void LinearLayoutManager$SavedState.invalidateAnchor()>
		requestLayout();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #707 <Method void requestLayout()>
	//   14   28:return          
	}

	public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(mOrientation == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #362 <Field int mOrientation>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return scrollBy(i, recycler, state);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokevirtual   #196 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//   10   16:ireturn         
	}

	public void setInitialPrefetchItemCount(int i)
	{
		mInitialPrefetchItemCount = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #91  <Field int mInitialPrefetchItemCount>
	//    3    5:return          
	}

	public void setOrientation(int i)
	{
		if(i != 0 && i != 1)
	//*   0    0:iload_1         
	//*   1    1:ifeq            37
	//*   2    4:iload_1         
	//*   3    5:iconst_1        
	//*   4    6:icmpeq          37
			throw new IllegalArgumentException((new StringBuilder()).append("invalid orientation:").append(i).toString());
	//    5    9:new             #738 <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:new             #297 <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #298 <Method void StringBuilder()>
	//   10   20:ldc2            #740 <String "invalid orientation:">
	//   11   23:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//   12   26:iload_1         
	//   13   27:invokevirtual   #307 <Method StringBuilder StringBuilder.append(int)>
	//   14   30:invokevirtual   #316 <Method String StringBuilder.toString()>
	//   15   33:invokespecial   #742 <Method void IllegalArgumentException(String)>
	//   16   36:athrow          
		assertNotInLayoutOrScroll(((String) (null)));
	//   17   37:aload_0         
	//   18   38:aconst_null     
	//   19   39:invokevirtual   #725 <Method void assertNotInLayoutOrScroll(String)>
		if(i == mOrientation)
	//*  20   42:iload_1         
	//*  21   43:aload_0         
	//*  22   44:getfield        #362 <Field int mOrientation>
	//*  23   47:icmpne          51
		{
			return;
	//   24   50:return          
		} else
		{
			mOrientation = i;
	//   25   51:aload_0         
	//   26   52:iload_1         
	//   27   53:putfield        #362 <Field int mOrientation>
			mOrientationHelper = null;
	//   28   56:aload_0         
	//   29   57:aconst_null     
	//   30   58:putfield        #132 <Field OrientationHelper mOrientationHelper>
			requestLayout();
	//   31   61:aload_0         
	//   32   62:invokevirtual   #707 <Method void requestLayout()>
			return;
	//   33   65:return          
		}
	}

	public void setRecycleChildrenOnDetach(boolean flag)
	{
		mRecycleChildrenOnDetach = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #577 <Field boolean mRecycleChildrenOnDetach>
	//    3    5:return          
	}

	public void setReverseLayout(boolean flag)
	{
		assertNotInLayoutOrScroll(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #725 <Method void assertNotInLayoutOrScroll(String)>
		if(flag == mReverseLayout)
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #69  <Field boolean mReverseLayout>
	//*   6   10:icmpne          14
		{
			return;
	//    7   13:return          
		} else
		{
			mReverseLayout = flag;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:putfield        #69  <Field boolean mReverseLayout>
			requestLayout();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #707 <Method void requestLayout()>
			return;
	//   13   23:return          
		}
	}

	public void setSmoothScrollbarEnabled(boolean flag)
	{
		mSmoothScrollbarEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #75  <Field boolean mSmoothScrollbarEnabled>
	//    3    5:return          
	}

	public void setStackFromEnd(boolean flag)
	{
		assertNotInLayoutOrScroll(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #725 <Method void assertNotInLayoutOrScroll(String)>
		if(mStackFromEnd == flag)
	//*   3    5:aload_0         
	//*   4    6:getfield        #73  <Field boolean mStackFromEnd>
	//*   5    9:iload_1         
	//*   6   10:icmpne          14
		{
			return;
	//    7   13:return          
		} else
		{
			mStackFromEnd = flag;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:putfield        #73  <Field boolean mStackFromEnd>
			requestLayout();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #707 <Method void requestLayout()>
			return;
	//   13   23:return          
		}
	}

	boolean shouldMeasureTwice()
	{
		return getHeightMode() != 0x40000000 && getWidthMode() != 0x40000000 && hasFlexibleChildInBothOrientations();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #748 <Method int getHeightMode()>
	//    2    4:ldc2            #749 <Int 0x40000000>
	//    3    7:icmpeq          29
	//    4   10:aload_0         
	//    5   11:invokevirtual   #752 <Method int getWidthMode()>
	//    6   14:ldc2            #749 <Int 0x40000000>
	//    7   17:icmpeq          29
	//    8   20:aload_0         
	//    9   21:invokevirtual   #755 <Method boolean hasFlexibleChildInBothOrientations()>
	//   10   24:ifeq            29
	//   11   27:iconst_1        
	//   12   28:ireturn         
	//   13   29:iconst_0        
	//   14   30:ireturn         
	}

	public void smoothScrollToPosition(RecyclerView recyclerview, RecyclerView.State state, int i)
	{
		recyclerview = ((RecyclerView) (new LinearSmoothScroller(recyclerview.getContext())));
	//    0    0:new             #759 <Class LinearSmoothScroller>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #765 <Method Context RecyclerView.getContext()>
	//    4    8:invokespecial   #767 <Method void LinearSmoothScroller(Context)>
	//    5   11:astore_1        
		((LinearSmoothScroller) (recyclerview)).setTargetPosition(i);
	//    6   12:aload_1         
	//    7   13:iload_3         
	//    8   14:invokevirtual   #770 <Method void LinearSmoothScroller.setTargetPosition(int)>
		startSmoothScroll(((RecyclerView.SmoothScroller) (recyclerview)));
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #774 <Method void startSmoothScroll(RecyclerView$SmoothScroller)>
	//   12   22:return          
	}

	public boolean supportsPredictiveItemAnimations()
	{
		return mPendingSavedState == null && mLastStackFromEnd == mStackFromEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//    2    4:ifnonnull       20
	//    3    7:aload_0         
	//    4    8:getfield        #380 <Field boolean mLastStackFromEnd>
	//    5   11:aload_0         
	//    6   12:getfield        #73  <Field boolean mStackFromEnd>
	//    7   15:icmpne          20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	void validateChildOrder()
	{
		boolean flag;
		boolean flag2;
		flag2 = true;
	//    0    0:iconst_1        
	//    1    1:istore          7
		flag = true;
	//    2    3:iconst_1        
	//    3    4:istore          6
		Log.d("LinearLayoutManager", (new StringBuilder()).append("validating child count ").append(getChildCount()).toString());
	//    4    6:ldc1            #36  <String "LinearLayoutManager">
	//    5    8:new             #297 <Class StringBuilder>
	//    6   11:dup             
	//    7   12:invokespecial   #298 <Method void StringBuilder()>
	//    8   15:ldc2            #777 <String "validating child count ">
	//    9   18:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//   10   21:aload_0         
	//   11   22:invokevirtual   #127 <Method int getChildCount()>
	//   12   25:invokevirtual   #307 <Method StringBuilder StringBuilder.append(int)>
	//   13   28:invokevirtual   #316 <Method String StringBuilder.toString()>
	//   14   31:invokestatic    #295 <Method int Log.d(String, String)>
	//   15   34:pop             
		if(getChildCount() >= 1) goto _L2; else goto _L1
	//   16   35:aload_0         
	//   17   36:invokevirtual   #127 <Method int getChildCount()>
	//   18   39:iconst_1        
	//   19   40:icmpge          44
_L1:
		return;
	//   20   43:return          
_L2:
		int k;
		int l;
		k = getPosition(getChildAt(0));
	//   21   44:aload_0         
	//   22   45:aload_0         
	//   23   46:iconst_0        
	//   24   47:invokevirtual   #209 <Method View getChildAt(int)>
	//   25   50:invokevirtual   #237 <Method int getPosition(View)>
	//   26   53:istore_2        
		l = mOrientationHelper.getDecoratedStart(getChildAt(0));
	//   27   54:aload_0         
	//   28   55:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   29   58:aload_0         
	//   30   59:iconst_0        
	//   31   60:invokevirtual   #209 <Method View getChildAt(int)>
	//   32   63:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//   33   66:istore_3        
		if(!mShouldReverseLayout)
			break; /* Loop/switch isn't completed */
	//   34   67:aload_0         
	//   35   68:getfield        #71  <Field boolean mShouldReverseLayout>
	//   36   71:ifeq            193
		int i = 1;
	//   37   74:iconst_1        
	//   38   75:istore_1        
		while(i < getChildCount()) 
	//*  39   76:iload_1         
	//*  40   77:aload_0         
	//*  41   78:invokevirtual   #127 <Method int getChildCount()>
	//*  42   81:icmpge          43
		{
			View view = getChildAt(i);
	//   43   84:aload_0         
	//   44   85:iload_1         
	//   45   86:invokevirtual   #209 <Method View getChildAt(int)>
	//   46   89:astore          8
			int i1 = getPosition(view);
	//   47   91:aload_0         
	//   48   92:aload           8
	//   49   94:invokevirtual   #237 <Method int getPosition(View)>
	//   50   97:istore          4
			int k1 = mOrientationHelper.getDecoratedStart(view);
	//   51   99:aload_0         
	//   52  100:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   53  103:aload           8
	//   54  105:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//   55  108:istore          5
			if(i1 < k)
	//*  56  110:iload           4
	//*  57  112:iload_2         
	//*  58  113:icmpge          165
			{
				logChildren();
	//   59  116:aload_0         
	//   60  117:invokespecial   #779 <Method void logChildren()>
				StringBuilder stringbuilder = (new StringBuilder()).append("detected invalid position. loc invalid? ");
	//   61  120:new             #297 <Class StringBuilder>
	//   62  123:dup             
	//   63  124:invokespecial   #298 <Method void StringBuilder()>
	//   64  127:ldc2            #781 <String "detected invalid position. loc invalid? ">
	//   65  130:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//   66  133:astore          8
				if(k1 >= l)
	//*  67  135:iload           5
	//*  68  137:iload_3         
	//*  69  138:icmpge          159
	//*  70  141:new             #783 <Class RuntimeException>
	//*  71  144:dup             
	//*  72  145:aload           8
	//*  73  147:iload           6
	//*  74  149:invokevirtual   #786 <Method StringBuilder StringBuilder.append(boolean)>
	//*  75  152:invokevirtual   #316 <Method String StringBuilder.toString()>
	//*  76  155:invokespecial   #787 <Method void RuntimeException(String)>
	//*  77  158:athrow          
					flag = false;
	//   78  159:iconst_0        
	//   79  160:istore          6
				throw new RuntimeException(stringbuilder.append(flag).toString());
			}
	//*  80  162:goto            141
			if(k1 > l)
	//*  81  165:iload           5
	//*  82  167:iload_3         
	//*  83  168:icmple          186
			{
				logChildren();
	//   84  171:aload_0         
	//   85  172:invokespecial   #779 <Method void logChildren()>
				throw new RuntimeException("detected invalid location");
	//   86  175:new             #783 <Class RuntimeException>
	//   87  178:dup             
	//   88  179:ldc2            #789 <String "detected invalid location">
	//   89  182:invokespecial   #787 <Method void RuntimeException(String)>
	//   90  185:athrow          
			}
			i++;
	//   91  186:iload_1         
	//   92  187:iconst_1        
	//   93  188:iadd            
	//   94  189:istore_1        
		}
		if(true) goto _L1; else goto _L3
	//   95  190:goto            76
_L3:
		int j = 1;
	//   96  193:iconst_1        
	//   97  194:istore_1        
		while(j < getChildCount()) 
	//*  98  195:iload_1         
	//*  99  196:aload_0         
	//* 100  197:invokevirtual   #127 <Method int getChildCount()>
	//* 101  200:icmpge          43
		{
			View view1 = getChildAt(j);
	//  102  203:aload_0         
	//  103  204:iload_1         
	//  104  205:invokevirtual   #209 <Method View getChildAt(int)>
	//  105  208:astore          8
			int j1 = getPosition(view1);
	//  106  210:aload_0         
	//  107  211:aload           8
	//  108  213:invokevirtual   #237 <Method int getPosition(View)>
	//  109  216:istore          4
			int l1 = mOrientationHelper.getDecoratedStart(view1);
	//  110  218:aload_0         
	//  111  219:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  112  222:aload           8
	//  113  224:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//  114  227:istore          5
			if(j1 < k)
	//* 115  229:iload           4
	//* 116  231:iload_2         
	//* 117  232:icmpge          288
			{
				logChildren();
	//  118  235:aload_0         
	//  119  236:invokespecial   #779 <Method void logChildren()>
				StringBuilder stringbuilder1 = (new StringBuilder()).append("detected invalid position. loc invalid? ");
	//  120  239:new             #297 <Class StringBuilder>
	//  121  242:dup             
	//  122  243:invokespecial   #298 <Method void StringBuilder()>
	//  123  246:ldc2            #781 <String "detected invalid position. loc invalid? ">
	//  124  249:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//  125  252:astore          8
				boolean flag1;
				if(l1 < l)
	//* 126  254:iload           5
	//* 127  256:iload_3         
	//* 128  257:icmpge          282
					flag1 = flag2;
	//  129  260:iload           7
	//  130  262:istore          6
				else
	//* 131  264:new             #783 <Class RuntimeException>
	//* 132  267:dup             
	//* 133  268:aload           8
	//* 134  270:iload           6
	//* 135  272:invokevirtual   #786 <Method StringBuilder StringBuilder.append(boolean)>
	//* 136  275:invokevirtual   #316 <Method String StringBuilder.toString()>
	//* 137  278:invokespecial   #787 <Method void RuntimeException(String)>
	//* 138  281:athrow          
					flag1 = false;
	//  139  282:iconst_0        
	//  140  283:istore          6
				throw new RuntimeException(stringbuilder1.append(flag1).toString());
			}
	//* 141  285:goto            264
			if(l1 < l)
	//* 142  288:iload           5
	//* 143  290:iload_3         
	//* 144  291:icmpge          309
			{
				logChildren();
	//  145  294:aload_0         
	//  146  295:invokespecial   #779 <Method void logChildren()>
				throw new RuntimeException("detected invalid location");
	//  147  298:new             #783 <Class RuntimeException>
	//  148  301:dup             
	//  149  302:ldc2            #789 <String "detected invalid location">
	//  150  305:invokespecial   #787 <Method void RuntimeException(String)>
	//  151  308:athrow          
			}
			j++;
	//  152  309:iload_1         
	//  153  310:iconst_1        
	//  154  311:iadd            
	//  155  312:istore_1        
		}
		if(true) goto _L1; else goto _L4
	//  156  313:goto            195
_L4:
	}

	static final boolean DEBUG = false;
	public static final int HORIZONTAL = 0;
	public static final int INVALID_OFFSET = 0x80000000;
	private static final float MAX_SCROLL_FACTOR = 0.3333333F;
	private static final String TAG = "LinearLayoutManager";
	public static final int VERTICAL = 1;
	final AnchorInfo mAnchorInfo;
	private int mInitialPrefetchItemCount;
	private boolean mLastStackFromEnd;
	private final LayoutChunkResult mLayoutChunkResult;
	private LayoutState mLayoutState;
	int mOrientation;
	OrientationHelper mOrientationHelper;
	SavedState mPendingSavedState;
	int mPendingScrollPosition;
	int mPendingScrollPositionOffset;
	private boolean mRecycleChildrenOnDetach;
	private boolean mReverseLayout;
	boolean mShouldReverseLayout;
	private boolean mSmoothScrollbarEnabled;
	private boolean mStackFromEnd;
}
