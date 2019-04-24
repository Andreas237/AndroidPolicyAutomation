// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//			ScrollbarHelper, OrientationHelper, ViewBoundsCheck, LinearSmoothScroller, 
//			RecyclerView

public class LinearLayoutManager extends RecyclerView.LayoutManager
	implements android.support.v7.widget.helper.ItemTouchHelper.ViewDropHandler, RecyclerView.SmoothScroller.ScrollVectorProvider
{
	class AnchorInfo
	{

		void assignCoordinateFromPadding()
		{
			int i;
			if(mLayoutFromEnd)
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field boolean mLayoutFromEnd>
		//*   2    4:ifeq            21
				i = mOrientationHelper.getEndAfterPadding();
		//    3    7:aload_0         
		//    4    8:getfield        #19  <Field LinearLayoutManager this$0>
		//    5   11:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//    6   14:invokevirtual   #39  <Method int OrientationHelper.getEndAfterPadding()>
		//    7   17:istore_1        
			else
		//*   8   18:goto            32
				i = mOrientationHelper.getStartAfterPadding();
		//    9   21:aload_0         
		//   10   22:getfield        #19  <Field LinearLayoutManager this$0>
		//   11   25:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//   12   28:invokevirtual   #42  <Method int OrientationHelper.getStartAfterPadding()>
		//   13   31:istore_1        
			mCoordinate = i;
		//   14   32:aload_0         
		//   15   33:iload_1         
		//   16   34:putfield        #44  <Field int mCoordinate>
		//   17   37:return          
		}

		public void assignFromView(View view)
		{
			if(mLayoutFromEnd)
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field boolean mLayoutFromEnd>
		//*   2    4:ifeq            36
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
		//   14   30:putfield        #44  <Field int mCoordinate>
			else
		//*  15   33:goto            51
				mCoordinate = mOrientationHelper.getDecoratedStart(view);
		//   16   36:aload_0         
		//   17   37:aload_0         
		//   18   38:getfield        #19  <Field LinearLayoutManager this$0>
		//   19   41:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//   20   44:aload_1         
		//   21   45:invokevirtual   #56  <Method int OrientationHelper.getDecoratedStart(View)>
		//   22   48:putfield        #44  <Field int mCoordinate>
			mPosition = getPosition(view);
		//   23   51:aload_0         
		//   24   52:aload_0         
		//   25   53:getfield        #19  <Field LinearLayoutManager this$0>
		//   26   56:aload_1         
		//   27   57:invokevirtual   #59  <Method int LinearLayoutManager.getPosition(View)>
		//   28   60:putfield        #61  <Field int mPosition>
		//   29   63:return          
		}

		public void assignFromViewAndKeepVisibleRect(View view)
		{
			int k = mOrientationHelper.getTotalSpaceChange();
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field LinearLayoutManager this$0>
		//    2    4:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//    3    7:invokevirtual   #53  <Method int OrientationHelper.getTotalSpaceChange()>
		//    4   10:istore_3        
			if(k >= 0)
		//*   5   11:iload_3         
		//*   6   12:iflt            21
			{
				assignFromView(view);
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:invokevirtual   #64  <Method void assignFromView(View)>
				return;
		//   10   20:return          
			}
			mPosition = getPosition(view);
		//   11   21:aload_0         
		//   12   22:aload_0         
		//   13   23:getfield        #19  <Field LinearLayoutManager this$0>
		//   14   26:aload_1         
		//   15   27:invokevirtual   #59  <Method int LinearLayoutManager.getPosition(View)>
		//   16   30:putfield        #61  <Field int mPosition>
			if(mLayoutFromEnd)
		//*  17   33:aload_0         
		//*  18   34:getfield        #29  <Field boolean mLayoutFromEnd>
		//*  19   37:ifeq            162
			{
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
		//   40   78:putfield        #44  <Field int mCoordinate>
				if(i > 0)
		//*  41   81:iload_2         
		//*  42   82:ifle            161
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
		//   50   98:getfield        #44  <Field int mCoordinate>
		//   51  101:istore          4
					int j1 = mOrientationHelper.getStartAfterPadding();
		//   52  103:aload_0         
		//   53  104:getfield        #19  <Field LinearLayoutManager this$0>
		//   54  107:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//   55  110:invokevirtual   #42  <Method int OrientationHelper.getStartAfterPadding()>
		//   56  113:istore          5
					k = l - k - (j1 + Math.min(mOrientationHelper.getDecoratedStart(view) - j1, 0));
		//   57  115:iload           4
		//   58  117:iload_3         
		//   59  118:isub            
		//   60  119:iload           5
		//   61  121:aload_0         
		//   62  122:getfield        #19  <Field LinearLayoutManager this$0>
		//   63  125:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//   64  128:aload_1         
		//   65  129:invokevirtual   #56  <Method int OrientationHelper.getDecoratedStart(View)>
		//   66  132:iload           5
		//   67  134:isub            
		//   68  135:iconst_0        
		//   69  136:invokestatic    #73  <Method int Math.min(int, int)>
		//   70  139:iadd            
		//   71  140:isub            
		//   72  141:istore_3        
					if(k < 0)
		//*  73  142:iload_3         
		//*  74  143:ifge            161
						mCoordinate = mCoordinate + Math.min(i, -k);
		//   75  146:aload_0         
		//   76  147:aload_0         
		//   77  148:getfield        #44  <Field int mCoordinate>
		//   78  151:iload_2         
		//   79  152:iload_3         
		//   80  153:ineg            
		//   81  154:invokestatic    #73  <Method int Math.min(int, int)>
		//   82  157:iadd            
		//   83  158:putfield        #44  <Field int mCoordinate>
				}
				return;
		//   84  161:return          
			}
			int i1 = mOrientationHelper.getDecoratedStart(view);
		//   85  162:aload_0         
		//   86  163:getfield        #19  <Field LinearLayoutManager this$0>
		//   87  166:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//   88  169:aload_1         
		//   89  170:invokevirtual   #56  <Method int OrientationHelper.getDecoratedStart(View)>
		//   90  173:istore          4
			int j = i1 - mOrientationHelper.getStartAfterPadding();
		//   91  175:iload           4
		//   92  177:aload_0         
		//   93  178:getfield        #19  <Field LinearLayoutManager this$0>
		//   94  181:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//   95  184:invokevirtual   #42  <Method int OrientationHelper.getStartAfterPadding()>
		//   96  187:isub            
		//   97  188:istore_2        
			mCoordinate = i1;
		//   98  189:aload_0         
		//   99  190:iload           4
		//  100  192:putfield        #44  <Field int mCoordinate>
			if(j > 0)
		//* 101  195:iload_2         
		//* 102  196:ifle            285
			{
				int k1 = mOrientationHelper.getDecoratedMeasurement(view);
		//  103  199:aload_0         
		//  104  200:getfield        #19  <Field LinearLayoutManager this$0>
		//  105  203:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//  106  206:aload_1         
		//  107  207:invokevirtual   #67  <Method int OrientationHelper.getDecoratedMeasurement(View)>
		//  108  210:istore          5
				int l1 = mOrientationHelper.getEndAfterPadding();
		//  109  212:aload_0         
		//  110  213:getfield        #19  <Field LinearLayoutManager this$0>
		//  111  216:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//  112  219:invokevirtual   #39  <Method int OrientationHelper.getEndAfterPadding()>
		//  113  222:istore          6
				int i2 = mOrientationHelper.getDecoratedEnd(view);
		//  114  224:aload_0         
		//  115  225:getfield        #19  <Field LinearLayoutManager this$0>
		//  116  228:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//  117  231:aload_1         
		//  118  232:invokevirtual   #50  <Method int OrientationHelper.getDecoratedEnd(View)>
		//  119  235:istore          7
				k = mOrientationHelper.getEndAfterPadding() - Math.min(0, l1 - k - i2) - (i1 + k1);
		//  120  237:aload_0         
		//  121  238:getfield        #19  <Field LinearLayoutManager this$0>
		//  122  241:getfield        #33  <Field OrientationHelper LinearLayoutManager.mOrientationHelper>
		//  123  244:invokevirtual   #39  <Method int OrientationHelper.getEndAfterPadding()>
		//  124  247:iconst_0        
		//  125  248:iload           6
		//  126  250:iload_3         
		//  127  251:isub            
		//  128  252:iload           7
		//  129  254:isub            
		//  130  255:invokestatic    #73  <Method int Math.min(int, int)>
		//  131  258:isub            
		//  132  259:iload           4
		//  133  261:iload           5
		//  134  263:iadd            
		//  135  264:isub            
		//  136  265:istore_3        
				if(k < 0)
		//* 137  266:iload_3         
		//* 138  267:ifge            285
					mCoordinate = mCoordinate - Math.min(j, -k);
		//  139  270:aload_0         
		//  140  271:aload_0         
		//  141  272:getfield        #44  <Field int mCoordinate>
		//  142  275:iload_2         
		//  143  276:iload_3         
		//  144  277:ineg            
		//  145  278:invokestatic    #73  <Method int Math.min(int, int)>
		//  146  281:isub            
		//  147  282:putfield        #44  <Field int mCoordinate>
			}
		//  148  285:return          
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
		//    2    2:putfield        #61  <Field int mPosition>
			mCoordinate = 0x80000000;
		//    3    5:aload_0         
		//    4    6:ldc1            #96  <Int 0x80000000>
		//    5    8:putfield        #44  <Field int mCoordinate>
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
		//    6   13:getfield        #61  <Field int mPosition>
		//    7   16:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
		//    8   19:ldc1            #114 <String ", mCoordinate=">
		//    9   21:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
		//   10   24:aload_0         
		//   11   25:getfield        #44  <Field int mCoordinate>
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
			int j = mScrapList.size();
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field List mScrapList>
		//    2    4:invokeinterface #57  <Method int List.size()>
		//    3    9:istore_2        
			for(int i = 0; i < j; i++)
		//*   4   10:iconst_0        
		//*   5   11:istore_1        
		//*   6   12:iload_1         
		//*   7   13:iload_2         
		//*   8   14:icmpge          80
			{
				View view = ((RecyclerView.ViewHolder)mScrapList.get(i)).itemView;
		//    9   17:aload_0         
		//   10   18:getfield        #48  <Field List mScrapList>
		//   11   21:iload_1         
		//   12   22:invokeinterface #61  <Method Object List.get(int)>
		//   13   27:checkcast       #63  <Class RecyclerView$ViewHolder>
		//   14   30:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
		//   15   33:astore_3        
				RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
		//   16   34:aload_3         
		//   17   35:invokevirtual   #73  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   18   38:checkcast       #75  <Class RecyclerView$LayoutParams>
		//   19   41:astore          4
				if(!layoutparams.isItemRemoved() && mCurrentPosition == layoutparams.getViewLayoutPosition())
		//*  20   43:aload           4
		//*  21   45:invokevirtual   #79  <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
		//*  22   48:ifeq            54
		//*  23   51:goto            73
		//*  24   54:aload_0         
		//*  25   55:getfield        #81  <Field int mCurrentPosition>
		//*  26   58:aload           4
		//*  27   60:invokevirtual   #84  <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
		//*  28   63:icmpne          73
				{
					assignPositionFromScrapList(view);
		//   29   66:aload_0         
		//   30   67:aload_3         
		//   31   68:invokevirtual   #88  <Method void assignPositionFromScrapList(View)>
					return view;
		//   32   71:aload_3         
		//   33   72:areturn         
				}
			}

		//   34   73:iload_1         
		//   35   74:iconst_1        
		//   36   75:iadd            
		//   37   76:istore_1        
		//*  38   77:goto            12
			return null;
		//   39   80:aconst_null     
		//   40   81:areturn         
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
			int i1 = mScrapList.size();
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field List mScrapList>
		//    2    4:invokeinterface #57  <Method int List.size()>
		//    3    9:istore          6
			View view2 = null;
		//    4   11:aconst_null     
		//    5   12:astore          8
			int j = 0x7fffffff;
		//    6   14:ldc1            #149 <Int 0x7fffffff>
		//    7   16:istore_3        
			for(int i = 0; i < i1;)
		//*   8   17:iconst_0        
		//*   9   18:istore_2        
		//*  10   19:iload_2         
		//*  11   20:iload           6
		//*  12   22:icmpge          163
			{
				View view3 = ((RecyclerView.ViewHolder)mScrapList.get(i)).itemView;
		//   13   25:aload_0         
		//   14   26:getfield        #48  <Field List mScrapList>
		//   15   29:iload_2         
		//   16   30:invokeinterface #61  <Method Object List.get(int)>
		//   17   35:checkcast       #63  <Class RecyclerView$ViewHolder>
		//   18   38:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
		//   19   41:astore          9
				RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view3.getLayoutParams();
		//   20   43:aload           9
		//   21   45:invokevirtual   #73  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   22   48:checkcast       #75  <Class RecyclerView$LayoutParams>
		//   23   51:astore          10
				View view1 = view2;
		//   24   53:aload           8
		//   25   55:astore          7
				int k = j;
		//   26   57:iload_3         
		//   27   58:istore          4
				if(view3 != view)
		//*  28   60:aload           9
		//*  29   62:aload_1         
		//*  30   63:if_acmpeq       149
					if(layoutparams.isItemRemoved())
		//*  31   66:aload           10
		//*  32   68:invokevirtual   #79  <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
		//*  33   71:ifeq            84
					{
						view1 = view2;
		//   34   74:aload           8
		//   35   76:astore          7
						k = j;
		//   36   78:iload_3         
		//   37   79:istore          4
					} else
		//*  38   81:goto            149
					{
						int l = (layoutparams.getViewLayoutPosition() - mCurrentPosition) * mItemDirection;
		//   39   84:aload           10
		//   40   86:invokevirtual   #84  <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
		//   41   89:aload_0         
		//   42   90:getfield        #81  <Field int mCurrentPosition>
		//   43   93:isub            
		//   44   94:aload_0         
		//   45   95:getfield        #120 <Field int mItemDirection>
		//   46   98:imul            
		//   47   99:istore          5
						if(l < 0)
		//*  48  101:iload           5
		//*  49  103:ifge            116
						{
							view1 = view2;
		//   50  106:aload           8
		//   51  108:astore          7
							k = j;
		//   52  110:iload_3         
		//   53  111:istore          4
						} else
		//*  54  113:goto            149
						{
							view1 = view2;
		//   55  116:aload           8
		//   56  118:astore          7
							k = j;
		//   57  120:iload_3         
		//   58  121:istore          4
							if(l < j)
		//*  59  123:iload           5
		//*  60  125:iload_3         
		//*  61  126:icmpge          149
							{
								view2 = view3;
		//   62  129:aload           9
		//   63  131:astore          8
								k = l;
		//   64  133:iload           5
		//   65  135:istore          4
								view1 = view2;
		//   66  137:aload           8
		//   67  139:astore          7
								if(l == 0)
		//*  68  141:iload           5
		//*  69  143:ifne            149
									return view2;
		//   70  146:aload           8
		//   71  148:areturn         
							}
						}
					}
				i++;
		//   72  149:iload_2         
		//   73  150:iconst_1        
		//   74  151:iadd            
		//   75  152:istore_2        
				view2 = view1;
		//   76  153:aload           7
		//   77  155:astore          8
				j = k;
		//   78  157:iload           4
		//   79  159:istore_3        
			}

		//*  80  160:goto            19
			return view2;
		//   81  163:aload           8
		//   82  165:areturn         
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
		//   18   32:invokevirtual   #56  <Method void Parcel.writeInt(int)>
		//   19   35:return          
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
		//    0    0:aload_0         
		//    1    1:invokespecial   #32  <Method void Object()>
			mAnchorPosition = parcel.readInt();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #39  <Method int Parcel.readInt()>
		//    5    9:putfield        #41  <Field int mAnchorPosition>
			mAnchorOffset = parcel.readInt();
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokevirtual   #39  <Method int Parcel.readInt()>
		//    9   17:putfield        #43  <Field int mAnchorOffset>
			boolean flag;
			if(parcel.readInt() == 1)
		//*  10   20:aload_1         
		//*  11   21:invokevirtual   #39  <Method int Parcel.readInt()>
		//*  12   24:iconst_1        
		//*  13   25:icmpne          33
				flag = true;
		//   14   28:iconst_1        
		//   15   29:istore_2        
			else
		//*  16   30:goto            35
				flag = false;
		//   17   33:iconst_0        
		//   18   34:istore_2        
			mAnchorLayoutFromEnd = flag;
		//   19   35:aload_0         
		//   20   36:iload_2         
		//   21   37:putfield        #45  <Field boolean mAnchorLayoutFromEnd>
		//   22   40:return          
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
		mInitialItemPrefetchCount = 2;
	//   34   63:aload_0         
	//   35   64:iconst_2        
	//   36   65:putfield        #91  <Field int mInitialItemPrefetchCount>
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
		mInitialItemPrefetchCount = 2;
	//   34   63:aload_0         
	//   35   64:iconst_2        
	//   36   65:putfield        #91  <Field int mInitialItemPrefetchCount>
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
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #127 <Method int getChildCount()>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		ensureLayoutState();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #130 <Method void ensureLayoutState()>
		OrientationHelper orientationhelper = mOrientationHelper;
	//    7   13:aload_0         
	//    8   14:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//    9   17:astore_3        
		boolean flag;
		if(!mSmoothScrollbarEnabled)
	//*  10   18:aload_0         
	//*  11   19:getfield        #75  <Field boolean mSmoothScrollbarEnabled>
	//*  12   22:ifne            30
			flag = true;
	//   13   25:iconst_1        
	//   14   26:istore_2        
		else
	//*  15   27:goto            32
			flag = false;
	//   16   30:iconst_0        
	//   17   31:istore_2        
		View view = findFirstVisibleChildClosestToStart(flag, true);
	//   18   32:aload_0         
	//   19   33:iload_2         
	//   20   34:iconst_1        
	//   21   35:invokespecial   #136 <Method View findFirstVisibleChildClosestToStart(boolean, boolean)>
	//   22   38:astore          4
		if(!mSmoothScrollbarEnabled)
	//*  23   40:aload_0         
	//*  24   41:getfield        #75  <Field boolean mSmoothScrollbarEnabled>
	//*  25   44:ifne            52
			flag = true;
	//   26   47:iconst_1        
	//   27   48:istore_2        
		else
	//*  28   49:goto            54
			flag = false;
	//   29   52:iconst_0        
	//   30   53:istore_2        
		return ScrollbarHelper.computeScrollExtent(state, orientationhelper, view, findFirstVisibleChildClosestToEnd(flag, true), ((RecyclerView.LayoutManager) (this)), mSmoothScrollbarEnabled);
	//   31   54:aload_1         
	//   32   55:aload_3         
	//   33   56:aload           4
	//   34   58:aload_0         
	//   35   59:iload_2         
	//   36   60:iconst_1        
	//   37   61:invokespecial   #139 <Method View findFirstVisibleChildClosestToEnd(boolean, boolean)>
	//   38   64:aload_0         
	//   39   65:aload_0         
	//   40   66:getfield        #75  <Field boolean mSmoothScrollbarEnabled>
	//   41   69:invokestatic    #144 <Method int ScrollbarHelper.computeScrollExtent(RecyclerView$State, OrientationHelper, View, View, RecyclerView$LayoutManager, boolean)>
	//   42   72:ireturn         
	}

	private int computeScrollOffset(RecyclerView.State state)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #127 <Method int getChildCount()>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		ensureLayoutState();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #130 <Method void ensureLayoutState()>
		OrientationHelper orientationhelper = mOrientationHelper;
	//    7   13:aload_0         
	//    8   14:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//    9   17:astore_3        
		boolean flag;
		if(!mSmoothScrollbarEnabled)
	//*  10   18:aload_0         
	//*  11   19:getfield        #75  <Field boolean mSmoothScrollbarEnabled>
	//*  12   22:ifne            30
			flag = true;
	//   13   25:iconst_1        
	//   14   26:istore_2        
		else
	//*  15   27:goto            32
			flag = false;
	//   16   30:iconst_0        
	//   17   31:istore_2        
		View view = findFirstVisibleChildClosestToStart(flag, true);
	//   18   32:aload_0         
	//   19   33:iload_2         
	//   20   34:iconst_1        
	//   21   35:invokespecial   #136 <Method View findFirstVisibleChildClosestToStart(boolean, boolean)>
	//   22   38:astore          4
		if(!mSmoothScrollbarEnabled)
	//*  23   40:aload_0         
	//*  24   41:getfield        #75  <Field boolean mSmoothScrollbarEnabled>
	//*  25   44:ifne            52
			flag = true;
	//   26   47:iconst_1        
	//   27   48:istore_2        
		else
	//*  28   49:goto            54
			flag = false;
	//   29   52:iconst_0        
	//   30   53:istore_2        
		return ScrollbarHelper.computeScrollOffset(state, orientationhelper, view, findFirstVisibleChildClosestToEnd(flag, true), ((RecyclerView.LayoutManager) (this)), mSmoothScrollbarEnabled, mShouldReverseLayout);
	//   31   54:aload_1         
	//   32   55:aload_3         
	//   33   56:aload           4
	//   34   58:aload_0         
	//   35   59:iload_2         
	//   36   60:iconst_1        
	//   37   61:invokespecial   #139 <Method View findFirstVisibleChildClosestToEnd(boolean, boolean)>
	//   38   64:aload_0         
	//   39   65:aload_0         
	//   40   66:getfield        #75  <Field boolean mSmoothScrollbarEnabled>
	//   41   69:aload_0         
	//   42   70:getfield        #71  <Field boolean mShouldReverseLayout>
	//   43   73:invokestatic    #148 <Method int ScrollbarHelper.computeScrollOffset(RecyclerView$State, OrientationHelper, View, View, RecyclerView$LayoutManager, boolean, boolean)>
	//   44   76:ireturn         
	}

	private int computeScrollRange(RecyclerView.State state)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #127 <Method int getChildCount()>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		ensureLayoutState();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #130 <Method void ensureLayoutState()>
		OrientationHelper orientationhelper = mOrientationHelper;
	//    7   13:aload_0         
	//    8   14:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//    9   17:astore_3        
		boolean flag;
		if(!mSmoothScrollbarEnabled)
	//*  10   18:aload_0         
	//*  11   19:getfield        #75  <Field boolean mSmoothScrollbarEnabled>
	//*  12   22:ifne            30
			flag = true;
	//   13   25:iconst_1        
	//   14   26:istore_2        
		else
	//*  15   27:goto            32
			flag = false;
	//   16   30:iconst_0        
	//   17   31:istore_2        
		View view = findFirstVisibleChildClosestToStart(flag, true);
	//   18   32:aload_0         
	//   19   33:iload_2         
	//   20   34:iconst_1        
	//   21   35:invokespecial   #136 <Method View findFirstVisibleChildClosestToStart(boolean, boolean)>
	//   22   38:astore          4
		if(!mSmoothScrollbarEnabled)
	//*  23   40:aload_0         
	//*  24   41:getfield        #75  <Field boolean mSmoothScrollbarEnabled>
	//*  25   44:ifne            52
			flag = true;
	//   26   47:iconst_1        
	//   27   48:istore_2        
		else
	//*  28   49:goto            54
			flag = false;
	//   29   52:iconst_0        
	//   30   53:istore_2        
		return ScrollbarHelper.computeScrollRange(state, orientationhelper, view, findFirstVisibleChildClosestToEnd(flag, true), ((RecyclerView.LayoutManager) (this)), mSmoothScrollbarEnabled);
	//   31   54:aload_1         
	//   32   55:aload_3         
	//   33   56:aload           4
	//   34   58:aload_0         
	//   35   59:iload_2         
	//   36   60:iconst_1        
	//   37   61:invokespecial   #139 <Method View findFirstVisibleChildClosestToEnd(boolean, boolean)>
	//   38   64:aload_0         
	//   39   65:aload_0         
	//   40   66:getfield        #75  <Field boolean mSmoothScrollbarEnabled>
	//   41   69:invokestatic    #151 <Method int ScrollbarHelper.computeScrollRange(RecyclerView$State, OrientationHelper, View, View, RecyclerView$LayoutManager, boolean)>
	//   42   72:ireturn         
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
	//*   7   13:ifle            31
			j = -scrollBy(-j, recycler, state);
	//    8   16:aload_0         
	//    9   17:iload           5
	//   10   19:ineg            
	//   11   20:aload_2         
	//   12   21:aload_3         
	//   13   22:invokevirtual   #196 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//   14   25:ineg            
	//   15   26:istore          5
		else
	//*  16   28:goto            33
			return 0;
	//   17   31:iconst_0        
	//   18   32:ireturn         
		if(flag)
	//*  19   33:iload           4
	//*  20   35:ifeq            68
		{
			i = mOrientationHelper.getEndAfterPadding() - (i + j);
	//   21   38:aload_0         
	//   22   39:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   23   42:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//   24   45:iload_1         
	//   25   46:iload           5
	//   26   48:iadd            
	//   27   49:isub            
	//   28   50:istore_1        
			if(i > 0)
	//*  29   51:iload_1         
	//*  30   52:ifle            68
			{
				mOrientationHelper.offsetChildren(i);
	//   31   55:aload_0         
	//   32   56:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   33   59:iload_1         
	//   34   60:invokevirtual   #199 <Method void OrientationHelper.offsetChildren(int)>
				return i + j;
	//   35   63:iload_1         
	//   36   64:iload           5
	//   37   66:iadd            
	//   38   67:ireturn         
			}
		}
		return j;
	//   39   68:iload           5
	//   40   70:ireturn         
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
	//*   7   13:ifle            30
			j = -scrollBy(j, recycler, state);
	//    8   16:aload_0         
	//    9   17:iload           5
	//   10   19:aload_2         
	//   11   20:aload_3         
	//   12   21:invokevirtual   #196 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//   13   24:ineg            
	//   14   25:istore          5
		else
	//*  15   27:goto            32
			return 0;
	//   16   30:iconst_0        
	//   17   31:ireturn         
		if(flag)
	//*  18   32:iload           4
	//*  19   34:ifeq            68
		{
			i = (i + j) - mOrientationHelper.getStartAfterPadding();
	//   20   37:iload_1         
	//   21   38:iload           5
	//   22   40:iadd            
	//   23   41:aload_0         
	//   24   42:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   25   45:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//   26   48:isub            
	//   27   49:istore_1        
			if(i > 0)
	//*  28   50:iload_1         
	//*  29   51:ifle            68
			{
				mOrientationHelper.offsetChildren(-i);
	//   30   54:aload_0         
	//   31   55:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   32   58:iload_1         
	//   33   59:ineg            
	//   34   60:invokevirtual   #199 <Method void OrientationHelper.offsetChildren(int)>
				return j - i;
	//   35   63:iload           5
	//   36   65:iload_1         
	//   37   66:isub            
	//   38   67:ireturn         
			}
		}
		return j;
	//   39   68:iload           5
	//   40   70:ireturn         
	}

	private View getChildClosestToEnd()
	{
		int i;
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            12
			i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
		else
	//*   5    9:goto            19
			i = getChildCount() - 1;
	//    6   12:aload_0         
	//    7   13:invokevirtual   #127 <Method int getChildCount()>
	//    8   16:iconst_1        
	//    9   17:isub            
	//   10   18:istore_1        
		return getChildAt(i);
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #209 <Method View getChildAt(int)>
	//   14   24:areturn         
	}

	private View getChildClosestToStart()
	{
		int i;
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            17
			i = getChildCount() - 1;
	//    3    7:aload_0         
	//    4    8:invokevirtual   #127 <Method int getChildCount()>
	//    5   11:iconst_1        
	//    6   12:isub            
	//    7   13:istore_1        
		else
	//*   8   14:goto            19
			i = 0;
	//    9   17:iconst_0        
	//   10   18:istore_1        
		return getChildAt(i);
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #209 <Method View getChildAt(int)>
	//   14   24:areturn         
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
		int i1 = 0;
	//   13   29:iconst_0        
	//   14   30:istore          7
		int l = 0;
	//   15   32:iconst_0        
	//   16   33:istore          6
		List list = recycler.getScrapList();
	//   17   35:aload_1         
	//   18   36:invokevirtual   #228 <Method List RecyclerView$Recycler.getScrapList()>
	//   19   39:astore          12
		int j1 = list.size();
	//   20   41:aload           12
	//   21   43:invokeinterface #233 <Method int List.size()>
	//   22   48:istore          9
		int k1 = getPosition(getChildAt(0));
	//   23   50:aload_0         
	//   24   51:aload_0         
	//   25   52:iconst_0        
	//   26   53:invokevirtual   #209 <Method View getChildAt(int)>
	//   27   56:invokevirtual   #237 <Method int getPosition(View)>
	//   28   59:istore          10
		for(int k = 0; k < j1; k++)
	//*  29   61:iconst_0        
	//*  30   62:istore          5
	//*  31   64:iload           5
	//*  32   66:iload           9
	//*  33   68:icmpge          185
		{
			RecyclerView.ViewHolder viewholder = (RecyclerView.ViewHolder)list.get(k);
	//   34   71:aload           12
	//   35   73:iload           5
	//   36   75:invokeinterface #241 <Method Object List.get(int)>
	//   37   80:checkcast       #243 <Class RecyclerView$ViewHolder>
	//   38   83:astore          13
			if(viewholder.isRemoved())
	//*  39   85:aload           13
	//*  40   87:invokevirtual   #246 <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*  41   90:ifeq            96
				continue;
	//   42   93:goto            176
			boolean flag;
			if(viewholder.getLayoutPosition() < k1)
	//*  43   96:aload           13
	//*  44   98:invokevirtual   #249 <Method int RecyclerView$ViewHolder.getLayoutPosition()>
	//*  45  101:iload           10
	//*  46  103:icmpge          112
				flag = true;
	//   47  106:iconst_1        
	//   48  107:istore          11
			else
	//*  49  109:goto            115
				flag = false;
	//   50  112:iconst_0        
	//   51  113:istore          11
			byte byte0;
			if(flag != mShouldReverseLayout)
	//*  52  115:iload           11
	//*  53  117:aload_0         
	//*  54  118:getfield        #71  <Field boolean mShouldReverseLayout>
	//*  55  121:icmpeq          130
				byte0 = -1;
	//   56  124:iconst_m1       
	//   57  125:istore          8
			else
	//*  58  127:goto            133
				byte0 = 1;
	//   59  130:iconst_1        
	//   60  131:istore          8
			if(byte0 == -1)
	//*  61  133:iload           8
	//*  62  135:iconst_m1       
	//*  63  136:icmpne          159
				i1 += mOrientationHelper.getDecoratedMeasurement(viewholder.itemView);
	//   64  139:iload           7
	//   65  141:aload_0         
	//   66  142:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   67  145:aload           13
	//   68  147:getfield        #253 <Field View RecyclerView$ViewHolder.itemView>
	//   69  150:invokevirtual   #256 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   70  153:iadd            
	//   71  154:istore          7
			else
	//*  72  156:goto            176
				l += mOrientationHelper.getDecoratedMeasurement(viewholder.itemView);
	//   73  159:iload           6
	//   74  161:aload_0         
	//   75  162:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   76  165:aload           13
	//   77  167:getfield        #253 <Field View RecyclerView$ViewHolder.itemView>
	//   78  170:invokevirtual   #256 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   79  173:iadd            
	//   80  174:istore          6
		}

	//   81  176:iload           5
	//   82  178:iconst_1        
	//   83  179:iadd            
	//   84  180:istore          5
	//*  85  182:goto            64
		mLayoutState.mScrapList = list;
	//   86  185:aload_0         
	//   87  186:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   88  189:aload           12
	//   89  191:putfield        #262 <Field List LinearLayoutManager$LayoutState.mScrapList>
		if(i1 > 0)
	//*  90  194:iload           7
	//*  91  196:ifle            248
		{
			updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i);
	//   92  199:aload_0         
	//   93  200:aload_0         
	//   94  201:aload_0         
	//   95  202:invokespecial   #264 <Method View getChildClosestToStart()>
	//   96  205:invokevirtual   #237 <Method int getPosition(View)>
	//   97  208:iload_3         
	//   98  209:invokespecial   #268 <Method void updateLayoutStateToFillStart(int, int)>
			mLayoutState.mExtra = i1;
	//   99  212:aload_0         
	//  100  213:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  101  216:iload           7
	//  102  218:putfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
			mLayoutState.mAvailable = 0;
	//  103  221:aload_0         
	//  104  222:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  105  225:iconst_0        
	//  106  226:putfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
			mLayoutState.assignPositionFromScrapList();
	//  107  229:aload_0         
	//  108  230:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  109  233:invokevirtual   #277 <Method void LinearLayoutManager$LayoutState.assignPositionFromScrapList()>
			fill(recycler, mLayoutState, state, false);
	//  110  236:aload_0         
	//  111  237:aload_1         
	//  112  238:aload_0         
	//  113  239:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  114  242:aload_2         
	//  115  243:iconst_0        
	//  116  244:invokevirtual   #281 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//  117  247:pop             
		}
		if(l > 0)
	//* 118  248:iload           6
	//* 119  250:ifle            303
		{
			updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), j);
	//  120  253:aload_0         
	//  121  254:aload_0         
	//  122  255:aload_0         
	//  123  256:invokespecial   #283 <Method View getChildClosestToEnd()>
	//  124  259:invokevirtual   #237 <Method int getPosition(View)>
	//  125  262:iload           4
	//  126  264:invokespecial   #286 <Method void updateLayoutStateToFillEnd(int, int)>
			mLayoutState.mExtra = l;
	//  127  267:aload_0         
	//  128  268:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  129  271:iload           6
	//  130  273:putfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
			mLayoutState.mAvailable = 0;
	//  131  276:aload_0         
	//  132  277:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  133  280:iconst_0        
	//  134  281:putfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
			mLayoutState.assignPositionFromScrapList();
	//  135  284:aload_0         
	//  136  285:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  137  288:invokevirtual   #277 <Method void LinearLayoutManager$LayoutState.assignPositionFromScrapList()>
			fill(recycler, mLayoutState, state, false);
	//  138  291:aload_0         
	//  139  292:aload_1         
	//  140  293:aload_0         
	//  141  294:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  142  297:aload_2         
	//  143  298:iconst_0        
	//  144  299:invokevirtual   #281 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//  145  302:pop             
		}
		mLayoutState.mScrapList = null;
	//  146  303:aload_0         
	//  147  304:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  148  307:aconst_null     
	//  149  308:putfield        #262 <Field List LinearLayoutManager$LayoutState.mScrapList>
	//  150  311:return          
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
		if(i == j)
	//*   0    0:iload_2         
	//*   1    1:iload_3         
	//*   2    2:icmpne          6
			return;
	//    3    5:return          
		if(j > i)
	//*   4    6:iload_3         
	//*   5    7:iload_2         
	//*   6    8:icmple          34
		{
			for(j--; j >= i; j--)
	//*   7   11:iload_3         
	//*   8   12:iconst_1        
	//*   9   13:isub            
	//*  10   14:istore_3        
	//*  11   15:iload_3         
	//*  12   16:iload_2         
	//*  13   17:icmplt          33
				removeAndRecycleViewAt(j, recycler);
	//   14   20:aload_0         
	//   15   21:iload_3         
	//   16   22:aload_1         
	//   17   23:invokevirtual   #345 <Method void removeAndRecycleViewAt(int, RecyclerView$Recycler)>

	//   18   26:iload_3         
	//   19   27:iconst_1        
	//   20   28:isub            
	//   21   29:istore_3        
	//*  22   30:goto            15
			return;
	//   23   33:return          
		}
		for(; i > j; i--)
	//*  24   34:iload_2         
	//*  25   35:iload_3         
	//*  26   36:icmple          52
			removeAndRecycleViewAt(i, recycler);
	//   27   39:aload_0         
	//   28   40:iload_2         
	//   29   41:aload_1         
	//   30   42:invokevirtual   #345 <Method void removeAndRecycleViewAt(int, RecyclerView$Recycler)>

	//   31   45:iload_2         
	//   32   46:iconst_1        
	//   33   47:isub            
	//   34   48:istore_2        
	//*  35   49:goto            34
	//   36   52:return          
	}

	private void recycleViewsFromEnd(RecyclerView.Recycler recycler, int i)
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #127 <Method int getChildCount()>
	//    2    4:istore_3        
		if(i < 0)
	//*   3    5:iload_2         
	//*   4    6:ifge            10
			return;
	//    5    9:return          
		int k = mOrientationHelper.getEnd() - i;
	//    6   10:aload_0         
	//    7   11:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//    8   14:invokevirtual   #348 <Method int OrientationHelper.getEnd()>
	//    9   17:iload_2         
	//   10   18:isub            
	//   11   19:istore          4
		if(mShouldReverseLayout)
	//*  12   21:aload_0         
	//*  13   22:getfield        #71  <Field boolean mShouldReverseLayout>
	//*  14   25:ifeq            86
		{
			for(i = 0; i < j; i++)
	//*  15   28:iconst_0        
	//*  16   29:istore_2        
	//*  17   30:iload_2         
	//*  18   31:iload_3         
	//*  19   32:icmpge          85
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
			}

	//   42   78:iload_2         
	//   43   79:iconst_1        
	//   44   80:iadd            
	//   45   81:istore_2        
	//*  46   82:goto            30
			return;
	//   47   85:return          
		}
		for(i = j - 1; i >= 0; i--)
	//*  48   86:iload_3         
	//*  49   87:iconst_1        
	//*  50   88:isub            
	//*  51   89:istore_2        
	//*  52   90:iload_2         
	//*  53   91:iflt            146
		{
			View view1 = getChildAt(i);
	//   54   94:aload_0         
	//   55   95:iload_2         
	//   56   96:invokevirtual   #209 <Method View getChildAt(int)>
	//   57   99:astore          5
			if(mOrientationHelper.getDecoratedStart(view1) < k || mOrientationHelper.getTransformedStartWithDecoration(view1) < k)
	//*  58  101:aload_0         
	//*  59  102:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  60  105:aload           5
	//*  61  107:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  62  110:iload           4
	//*  63  112:icmplt          129
	//*  64  115:aload_0         
	//*  65  116:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  66  119:aload           5
	//*  67  121:invokevirtual   #351 <Method int OrientationHelper.getTransformedStartWithDecoration(View)>
	//*  68  124:iload           4
	//*  69  126:icmpge          139
			{
				recycleChildren(recycler, j - 1, i);
	//   70  129:aload_0         
	//   71  130:aload_1         
	//   72  131:iload_3         
	//   73  132:iconst_1        
	//   74  133:isub            
	//   75  134:iload_2         
	//   76  135:invokespecial   #353 <Method void recycleChildren(RecyclerView$Recycler, int, int)>
				return;
	//   77  138:return          
			}
		}

	//   78  139:iload_2         
	//   79  140:iconst_1        
	//   80  141:isub            
	//   81  142:istore_2        
	//*  82  143:goto            90
	//   83  146:return          
	}

	private void recycleViewsFromStart(RecyclerView.Recycler recycler, int i)
	{
		if(i < 0)
	//*   0    0:iload_2         
	//*   1    1:ifge            5
			return;
	//    2    4:return          
		int l = getChildCount();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #127 <Method int getChildCount()>
	//    5    9:istore          4
		if(mShouldReverseLayout)
	//*   6   11:aload_0         
	//*   7   12:getfield        #71  <Field boolean mShouldReverseLayout>
	//*   8   15:ifeq            79
		{
			for(int j = l - 1; j >= 0; j--)
	//*   9   18:iload           4
	//*  10   20:iconst_1        
	//*  11   21:isub            
	//*  12   22:istore_3        
	//*  13   23:iload_3         
	//*  14   24:iflt            78
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
			}

	//   39   71:iload_3         
	//   40   72:iconst_1        
	//   41   73:isub            
	//   42   74:istore_3        
	//*  43   75:goto            23
			return;
	//   44   78:return          
		}
		for(int k = 0; k < l; k++)
	//*  45   79:iconst_0        
	//*  46   80:istore_3        
	//*  47   81:iload_3         
	//*  48   82:iload           4
	//*  49   84:icmpge          135
		{
			View view1 = getChildAt(k);
	//   50   87:aload_0         
	//   51   88:iload_3         
	//   52   89:invokevirtual   #209 <Method View getChildAt(int)>
	//   53   92:astore          5
			if(mOrientationHelper.getDecoratedEnd(view1) > i || mOrientationHelper.getTransformedEndWithDecoration(view1) > i)
	//*  54   94:aload_0         
	//*  55   95:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  56   98:aload           5
	//*  57  100:invokevirtual   #356 <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  58  103:iload_2         
	//*  59  104:icmpgt          120
	//*  60  107:aload_0         
	//*  61  108:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  62  111:aload           5
	//*  63  113:invokevirtual   #359 <Method int OrientationHelper.getTransformedEndWithDecoration(View)>
	//*  64  116:iload_2         
	//*  65  117:icmple          128
			{
				recycleChildren(recycler, 0, k);
	//   66  120:aload_0         
	//   67  121:aload_1         
	//   68  122:iconst_0        
	//   69  123:iload_3         
	//   70  124:invokespecial   #353 <Method void recycleChildren(RecyclerView$Recycler, int, int)>
				return;
	//   71  127:return          
			}
		}

	//   72  128:iload_3         
	//   73  129:iconst_1        
	//   74  130:iadd            
	//   75  131:istore_3        
	//*  76  132:goto            81
	//   77  135:return          
	}

	private void resolveShouldLayoutReverse()
	{
		if(mOrientation == 1 || !isLayoutRTL())
	//*   0    0:aload_0         
	//*   1    1:getfield        #362 <Field int mOrientation>
	//*   2    4:iconst_1        
	//*   3    5:icmpeq          15
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #365 <Method boolean isLayoutRTL()>
	//*   6   12:ifne            24
		{
			mShouldReverseLayout = mReverseLayout;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #69  <Field boolean mReverseLayout>
	//   10   20:putfield        #71  <Field boolean mShouldReverseLayout>
			return;
	//   11   23:return          
		}
		boolean flag;
		if(!mReverseLayout)
	//*  12   24:aload_0         
	//*  13   25:getfield        #69  <Field boolean mReverseLayout>
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
	//   22   40:putfield        #71  <Field boolean mShouldReverseLayout>
	//   23   43:return          
	}

	private boolean updateAnchorFromChildren(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorinfo)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #127 <Method int getChildCount()>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		View view = getFocusedChild();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #370 <Method View getFocusedChild()>
	//    7   13:astore          5
		if(view != null && anchorinfo.isViewValidAsAnchor(view, state))
	//*   8   15:aload           5
	//*   9   17:ifnull          38
	//*  10   20:aload_3         
	//*  11   21:aload           5
	//*  12   23:aload_2         
	//*  13   24:invokevirtual   #374 <Method boolean LinearLayoutManager$AnchorInfo.isViewValidAsAnchor(View, RecyclerView$State)>
	//*  14   27:ifeq            38
		{
			anchorinfo.assignFromViewAndKeepVisibleRect(view);
	//   15   30:aload_3         
	//   16   31:aload           5
	//   17   33:invokevirtual   #378 <Method void LinearLayoutManager$AnchorInfo.assignFromViewAndKeepVisibleRect(View)>
			return true;
	//   18   36:iconst_1        
	//   19   37:ireturn         
		}
		if(mLastStackFromEnd != mStackFromEnd)
	//*  20   38:aload_0         
	//*  21   39:getfield        #380 <Field boolean mLastStackFromEnd>
	//*  22   42:aload_0         
	//*  23   43:getfield        #73  <Field boolean mStackFromEnd>
	//*  24   46:icmpeq          51
			return false;
	//   25   49:iconst_0        
	//   26   50:ireturn         
		if(anchorinfo.mLayoutFromEnd)
	//*  27   51:aload_3         
	//*  28   52:getfield        #383 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
	//*  29   55:ifeq            68
			recycler = ((RecyclerView.Recycler) (findReferenceChildClosestToEnd(recycler, state)));
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:aload_2         
	//   33   61:invokespecial   #385 <Method View findReferenceChildClosestToEnd(RecyclerView$Recycler, RecyclerView$State)>
	//   34   64:astore_1        
		else
	//*  35   65:goto            75
			recycler = ((RecyclerView.Recycler) (findReferenceChildClosestToStart(recycler, state)));
	//   36   68:aload_0         
	//   37   69:aload_1         
	//   38   70:aload_2         
	//   39   71:invokespecial   #387 <Method View findReferenceChildClosestToStart(RecyclerView$Recycler, RecyclerView$State)>
	//   40   74:astore_1        
		if(recycler != null)
	//*  41   75:aload_1         
	//*  42   76:ifnull          184
		{
			anchorinfo.assignFromView(((View) (recycler)));
	//   43   79:aload_3         
	//   44   80:aload_1         
	//   45   81:invokevirtual   #390 <Method void LinearLayoutManager$AnchorInfo.assignFromView(View)>
			if(!state.isPreLayout() && supportsPredictiveItemAnimations())
	//*  46   84:aload_2         
	//*  47   85:invokevirtual   #219 <Method boolean RecyclerView$State.isPreLayout()>
	//*  48   88:ifne            182
	//*  49   91:aload_0         
	//*  50   92:invokevirtual   #222 <Method boolean supportsPredictiveItemAnimations()>
	//*  51   95:ifeq            182
			{
				boolean flag;
				if(mOrientationHelper.getDecoratedStart(((View) (recycler))) >= mOrientationHelper.getEndAfterPadding() || mOrientationHelper.getDecoratedEnd(((View) (recycler))) < mOrientationHelper.getStartAfterPadding())
	//*  52   98:aload_0         
	//*  53   99:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  54  102:aload_1         
	//*  55  103:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  56  106:aload_0         
	//*  57  107:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  58  110:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//*  59  113:icmpge          134
	//*  60  116:aload_0         
	//*  61  117:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  62  120:aload_1         
	//*  63  121:invokevirtual   #356 <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  64  124:aload_0         
	//*  65  125:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  66  128:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//*  67  131:icmpge          140
					flag = true;
	//   68  134:iconst_1        
	//   69  135:istore          4
				else
	//*  70  137:goto            143
					flag = false;
	//   71  140:iconst_0        
	//   72  141:istore          4
				if(flag)
	//*  73  143:iload           4
	//*  74  145:ifeq            182
				{
					int i;
					if(anchorinfo.mLayoutFromEnd)
	//*  75  148:aload_3         
	//*  76  149:getfield        #383 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
	//*  77  152:ifeq            167
						i = mOrientationHelper.getEndAfterPadding();
	//   78  155:aload_0         
	//   79  156:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   80  159:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//   81  162:istore          4
					else
	//*  82  164:goto            176
						i = mOrientationHelper.getStartAfterPadding();
	//   83  167:aload_0         
	//   84  168:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   85  171:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//   86  174:istore          4
					anchorinfo.mCoordinate = i;
	//   87  176:aload_3         
	//   88  177:iload           4
	//   89  179:putfield        #393 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
				}
			}
			return true;
	//   90  182:iconst_1        
	//   91  183:ireturn         
		} else
		{
			return false;
	//   92  184:iconst_0        
	//   93  185:ireturn         
		}
	}

	private boolean updateAnchorFromPendingData(RecyclerView.State state, AnchorInfo anchorinfo)
	{
		if(state.isPreLayout() || mPendingScrollPosition == -1)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #219 <Method boolean RecyclerView$State.isPreLayout()>
	//*   2    4:ifne            15
	//*   3    7:aload_0         
	//*   4    8:getfield        #77  <Field int mPendingScrollPosition>
	//*   5   11:iconst_m1       
	//*   6   12:icmpne          17
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		if(mPendingScrollPosition < 0 || mPendingScrollPosition >= state.getItemCount())
	//*   9   17:aload_0         
	//*  10   18:getfield        #77  <Field int mPendingScrollPosition>
	//*  11   21:iflt            35
	//*  12   24:aload_0         
	//*  13   25:getfield        #77  <Field int mPendingScrollPosition>
	//*  14   28:aload_1         
	//*  15   29:invokevirtual   #163 <Method int RecyclerView$State.getItemCount()>
	//*  16   32:icmplt          48
		{
			mPendingScrollPosition = -1;
	//   17   35:aload_0         
	//   18   36:iconst_m1       
	//   19   37:putfield        #77  <Field int mPendingScrollPosition>
			mPendingScrollPositionOffset = 0x80000000;
	//   20   40:aload_0         
	//   21   41:ldc1            #29  <Int 0x80000000>
	//   22   43:putfield        #79  <Field int mPendingScrollPositionOffset>
			return false;
	//   23   46:iconst_0        
	//   24   47:ireturn         
		}
		anchorinfo.mPosition = mPendingScrollPosition;
	//   25   48:aload_2         
	//   26   49:aload_0         
	//   27   50:getfield        #77  <Field int mPendingScrollPosition>
	//   28   53:putfield        #398 <Field int LinearLayoutManager$AnchorInfo.mPosition>
		if(mPendingSavedState != null && mPendingSavedState.hasValidAnchor())
	//*  29   56:aload_0         
	//*  30   57:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*  31   60:ifnull          134
	//*  32   63:aload_0         
	//*  33   64:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*  34   67:invokevirtual   #401 <Method boolean LinearLayoutManager$SavedState.hasValidAnchor()>
	//*  35   70:ifeq            134
		{
			anchorinfo.mLayoutFromEnd = mPendingSavedState.mAnchorLayoutFromEnd;
	//   36   73:aload_2         
	//   37   74:aload_0         
	//   38   75:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   39   78:getfield        #404 <Field boolean LinearLayoutManager$SavedState.mAnchorLayoutFromEnd>
	//   40   81:putfield        #383 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
			if(anchorinfo.mLayoutFromEnd)
	//*  41   84:aload_2         
	//*  42   85:getfield        #383 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
	//*  43   88:ifeq            113
				anchorinfo.mCoordinate = mOrientationHelper.getEndAfterPadding() - mPendingSavedState.mAnchorOffset;
	//   44   91:aload_2         
	//   45   92:aload_0         
	//   46   93:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   47   96:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//   48   99:aload_0         
	//   49  100:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   50  103:getfield        #407 <Field int LinearLayoutManager$SavedState.mAnchorOffset>
	//   51  106:isub            
	//   52  107:putfield        #393 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
			else
	//*  53  110:goto            132
				anchorinfo.mCoordinate = mOrientationHelper.getStartAfterPadding() + mPendingSavedState.mAnchorOffset;
	//   54  113:aload_2         
	//   55  114:aload_0         
	//   56  115:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   57  118:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//   58  121:aload_0         
	//   59  122:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   60  125:getfield        #407 <Field int LinearLayoutManager$SavedState.mAnchorOffset>
	//   61  128:iadd            
	//   62  129:putfield        #393 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
			return true;
	//   63  132:iconst_1        
	//   64  133:ireturn         
		}
		if(mPendingScrollPositionOffset == 0x80000000)
	//*  65  134:aload_0         
	//*  66  135:getfield        #79  <Field int mPendingScrollPositionOffset>
	//*  67  138:ldc1            #29  <Int 0x80000000>
	//*  68  140:icmpne          362
		{
			state = ((RecyclerView.State) (findViewByPosition(mPendingScrollPosition)));
	//   69  143:aload_0         
	//   70  144:aload_0         
	//   71  145:getfield        #77  <Field int mPendingScrollPosition>
	//   72  148:invokevirtual   #410 <Method View findViewByPosition(int)>
	//   73  151:astore_1        
			if(state != null)
	//*  74  152:aload_1         
	//*  75  153:ifnull          298
			{
				if(mOrientationHelper.getDecoratedMeasurement(((View) (state))) > mOrientationHelper.getTotalSpace())
	//*  76  156:aload_0         
	//*  77  157:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  78  160:aload_1         
	//*  79  161:invokevirtual   #256 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//*  80  164:aload_0         
	//*  81  165:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  82  168:invokevirtual   #413 <Method int OrientationHelper.getTotalSpace()>
	//*  83  171:icmple          180
				{
					anchorinfo.assignCoordinateFromPadding();
	//   84  174:aload_2         
	//   85  175:invokevirtual   #416 <Method void LinearLayoutManager$AnchorInfo.assignCoordinateFromPadding()>
					return true;
	//   86  178:iconst_1        
	//   87  179:ireturn         
				}
				if(mOrientationHelper.getDecoratedStart(((View) (state))) - mOrientationHelper.getStartAfterPadding() < 0)
	//*  88  180:aload_0         
	//*  89  181:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  90  184:aload_1         
	//*  91  185:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  92  188:aload_0         
	//*  93  189:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  94  192:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//*  95  195:isub            
	//*  96  196:ifge            217
				{
					anchorinfo.mCoordinate = mOrientationHelper.getStartAfterPadding();
	//   97  199:aload_2         
	//   98  200:aload_0         
	//   99  201:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  100  204:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//  101  207:putfield        #393 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
					anchorinfo.mLayoutFromEnd = false;
	//  102  210:aload_2         
	//  103  211:iconst_0        
	//  104  212:putfield        #383 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
					return true;
	//  105  215:iconst_1        
	//  106  216:ireturn         
				}
				if(mOrientationHelper.getEndAfterPadding() - mOrientationHelper.getDecoratedEnd(((View) (state))) < 0)
	//* 107  217:aload_0         
	//* 108  218:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//* 109  221:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//* 110  224:aload_0         
	//* 111  225:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//* 112  228:aload_1         
	//* 113  229:invokevirtual   #356 <Method int OrientationHelper.getDecoratedEnd(View)>
	//* 114  232:isub            
	//* 115  233:ifge            254
				{
					anchorinfo.mCoordinate = mOrientationHelper.getEndAfterPadding();
	//  116  236:aload_2         
	//  117  237:aload_0         
	//  118  238:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  119  241:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//  120  244:putfield        #393 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
					anchorinfo.mLayoutFromEnd = true;
	//  121  247:aload_2         
	//  122  248:iconst_1        
	//  123  249:putfield        #383 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
					return true;
	//  124  252:iconst_1        
	//  125  253:ireturn         
				}
				int i;
				if(anchorinfo.mLayoutFromEnd)
	//* 126  254:aload_2         
	//* 127  255:getfield        #383 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
	//* 128  258:ifeq            281
					i = mOrientationHelper.getDecoratedEnd(((View) (state))) + mOrientationHelper.getTotalSpaceChange();
	//  129  261:aload_0         
	//  130  262:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  131  265:aload_1         
	//  132  266:invokevirtual   #356 <Method int OrientationHelper.getDecoratedEnd(View)>
	//  133  269:aload_0         
	//  134  270:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  135  273:invokevirtual   #419 <Method int OrientationHelper.getTotalSpaceChange()>
	//  136  276:iadd            
	//  137  277:istore_3        
				else
	//* 138  278:goto            290
					i = mOrientationHelper.getDecoratedStart(((View) (state)));
	//  139  281:aload_0         
	//  140  282:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  141  285:aload_1         
	//  142  286:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//  143  289:istore_3        
				anchorinfo.mCoordinate = i;
	//  144  290:aload_2         
	//  145  291:iload_3         
	//  146  292:putfield        #393 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
			} else
	//* 147  295:goto            360
			{
				if(getChildCount() > 0)
	//* 148  298:aload_0         
	//* 149  299:invokevirtual   #127 <Method int getChildCount()>
	//* 150  302:ifle            356
				{
					int j = getPosition(getChildAt(0));
	//  151  305:aload_0         
	//  152  306:aload_0         
	//  153  307:iconst_0        
	//  154  308:invokevirtual   #209 <Method View getChildAt(int)>
	//  155  311:invokevirtual   #237 <Method int getPosition(View)>
	//  156  314:istore_3        
					boolean flag;
					if(mPendingScrollPosition < j)
	//* 157  315:aload_0         
	//* 158  316:getfield        #77  <Field int mPendingScrollPosition>
	//* 159  319:iload_3         
	//* 160  320:icmpge          329
						flag = true;
	//  161  323:iconst_1        
	//  162  324:istore          4
					else
	//* 163  326:goto            332
						flag = false;
	//  164  329:iconst_0        
	//  165  330:istore          4
					if(flag == mShouldReverseLayout)
	//* 166  332:iload           4
	//* 167  334:aload_0         
	//* 168  335:getfield        #71  <Field boolean mShouldReverseLayout>
	//* 169  338:icmpne          347
						flag = true;
	//  170  341:iconst_1        
	//  171  342:istore          4
					else
	//* 172  344:goto            350
						flag = false;
	//  173  347:iconst_0        
	//  174  348:istore          4
					anchorinfo.mLayoutFromEnd = flag;
	//  175  350:aload_2         
	//  176  351:iload           4
	//  177  353:putfield        #383 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
				}
				anchorinfo.assignCoordinateFromPadding();
	//  178  356:aload_2         
	//  179  357:invokevirtual   #416 <Method void LinearLayoutManager$AnchorInfo.assignCoordinateFromPadding()>
			}
			return true;
	//  180  360:iconst_1        
	//  181  361:ireturn         
		}
		anchorinfo.mLayoutFromEnd = mShouldReverseLayout;
	//  182  362:aload_2         
	//  183  363:aload_0         
	//  184  364:getfield        #71  <Field boolean mShouldReverseLayout>
	//  185  367:putfield        #383 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
		if(mShouldReverseLayout)
	//* 186  370:aload_0         
	//* 187  371:getfield        #71  <Field boolean mShouldReverseLayout>
	//* 188  374:ifeq            396
			anchorinfo.mCoordinate = mOrientationHelper.getEndAfterPadding() - mPendingScrollPositionOffset;
	//  189  377:aload_2         
	//  190  378:aload_0         
	//  191  379:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  192  382:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//  193  385:aload_0         
	//  194  386:getfield        #79  <Field int mPendingScrollPositionOffset>
	//  195  389:isub            
	//  196  390:putfield        #393 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
		else
	//* 197  393:goto            412
			anchorinfo.mCoordinate = mOrientationHelper.getStartAfterPadding() + mPendingScrollPositionOffset;
	//  198  396:aload_2         
	//  199  397:aload_0         
	//  200  398:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  201  401:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//  202  404:aload_0         
	//  203  405:getfield        #79  <Field int mPendingScrollPositionOffset>
	//  204  408:iadd            
	//  205  409:putfield        #393 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
		return true;
	//  206  412:iconst_1        
	//  207  413:ireturn         
	}

	private void updateAnchorInfoForLayout(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorinfo)
	{
		if(updateAnchorFromPendingData(state, anchorinfo))
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:aload_3         
	//*   3    3:invokespecial   #423 <Method boolean updateAnchorFromPendingData(RecyclerView$State, LinearLayoutManager$AnchorInfo)>
	//*   4    6:ifeq            10
			return;
	//    5    9:return          
		if(updateAnchorFromChildren(recycler, state, anchorinfo))
	//*   6   10:aload_0         
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:aload_3         
	//*  10   14:invokespecial   #425 <Method boolean updateAnchorFromChildren(RecyclerView$Recycler, RecyclerView$State, LinearLayoutManager$AnchorInfo)>
	//*  11   17:ifeq            21
			return;
	//   12   20:return          
		anchorinfo.assignCoordinateFromPadding();
	//   13   21:aload_3         
	//   14   22:invokevirtual   #416 <Method void LinearLayoutManager$AnchorInfo.assignCoordinateFromPadding()>
		int i;
		if(mStackFromEnd)
	//*  15   25:aload_0         
	//*  16   26:getfield        #73  <Field boolean mStackFromEnd>
	//*  17   29:ifeq            43
			i = state.getItemCount() - 1;
	//   18   32:aload_2         
	//   19   33:invokevirtual   #163 <Method int RecyclerView$State.getItemCount()>
	//   20   36:iconst_1        
	//   21   37:isub            
	//   22   38:istore          4
		else
	//*  23   40:goto            46
			i = 0;
	//   24   43:iconst_0        
	//   25   44:istore          4
		anchorinfo.mPosition = i;
	//   26   46:aload_3         
	//   27   47:iload           4
	//   28   49:putfield        #398 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//   29   52:return          
	}

	private void updateLayoutState(int i, int j, boolean flag, RecyclerView.State state)
	{
		mLayoutState.mInfinite = resolveIsInfinite();
	//    0    0:aload_0         
	//    1    1:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #430 <Method boolean resolveIsInfinite()>
	//    4    8:putfield        #326 <Field boolean LinearLayoutManager$LayoutState.mInfinite>
		mLayoutState.mExtra = getExtraLayoutSpace(state);
	//    5   11:aload_0         
	//    6   12:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//    7   15:aload_0         
	//    8   16:aload           4
	//    9   18:invokevirtual   #433 <Method int getExtraLayoutSpace(RecyclerView$State)>
	//   10   21:putfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
		mLayoutState.mLayoutDirection = i;
	//   11   24:aload_0         
	//   12   25:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   13   28:iload_1         
	//   14   29:putfield        #329 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
		if(i == 1)
	//*  15   32:iload_1         
	//*  16   33:iconst_1        
	//*  17   34:icmpne          151
		{
			state = ((RecyclerView.State) (mLayoutState));
	//   18   37:aload_0         
	//   19   38:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   20   41:astore          4
			state.mExtra = ((LayoutState) (state)).mExtra + mOrientationHelper.getEndPadding();
	//   21   43:aload           4
	//   22   45:aload           4
	//   23   47:getfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
	//   24   50:aload_0         
	//   25   51:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   26   54:invokevirtual   #436 <Method int OrientationHelper.getEndPadding()>
	//   27   57:iadd            
	//   28   58:putfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
			state = ((RecyclerView.State) (getChildClosestToEnd()));
	//   29   61:aload_0         
	//   30   62:invokespecial   #283 <Method View getChildClosestToEnd()>
	//   31   65:astore          4
			LayoutState layoutstate = mLayoutState;
	//   32   67:aload_0         
	//   33   68:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   34   71:astore          5
			if(mShouldReverseLayout)
	//*  35   73:aload_0         
	//*  36   74:getfield        #71  <Field boolean mShouldReverseLayout>
	//*  37   77:ifeq            85
				i = -1;
	//   38   80:iconst_m1       
	//   39   81:istore_1        
			else
	//*  40   82:goto            87
				i = 1;
	//   41   85:iconst_1        
	//   42   86:istore_1        
			layoutstate.mItemDirection = i;
	//   43   87:aload           5
	//   44   89:iload_1         
	//   45   90:putfield        #439 <Field int LinearLayoutManager$LayoutState.mItemDirection>
			mLayoutState.mCurrentPosition = getPosition(((View) (state))) + mLayoutState.mItemDirection;
	//   46   93:aload_0         
	//   47   94:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   48   97:aload_0         
	//   49   98:aload           4
	//   50  100:invokevirtual   #237 <Method int getPosition(View)>
	//   51  103:aload_0         
	//   52  104:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   53  107:getfield        #439 <Field int LinearLayoutManager$LayoutState.mItemDirection>
	//   54  110:iadd            
	//   55  111:putfield        #442 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
			mLayoutState.mOffset = mOrientationHelper.getDecoratedEnd(((View) (state)));
	//   56  114:aload_0         
	//   57  115:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   58  118:aload_0         
	//   59  119:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   60  122:aload           4
	//   61  124:invokevirtual   #356 <Method int OrientationHelper.getDecoratedEnd(View)>
	//   62  127:putfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
			i = mOrientationHelper.getDecoratedEnd(((View) (state))) - mOrientationHelper.getEndAfterPadding();
	//   63  130:aload_0         
	//   64  131:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   65  134:aload           4
	//   66  136:invokevirtual   #356 <Method int OrientationHelper.getDecoratedEnd(View)>
	//   67  139:aload_0         
	//   68  140:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   69  143:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//   70  146:isub            
	//   71  147:istore_1        
		} else
	//*  72  148:goto            263
		{
			state = ((RecyclerView.State) (getChildClosestToStart()));
	//   73  151:aload_0         
	//   74  152:invokespecial   #264 <Method View getChildClosestToStart()>
	//   75  155:astore          4
			LayoutState layoutstate1 = mLayoutState;
	//   76  157:aload_0         
	//   77  158:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   78  161:astore          5
			layoutstate1.mExtra = layoutstate1.mExtra + mOrientationHelper.getStartAfterPadding();
	//   79  163:aload           5
	//   80  165:aload           5
	//   81  167:getfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
	//   82  170:aload_0         
	//   83  171:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   84  174:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//   85  177:iadd            
	//   86  178:putfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
			layoutstate1 = mLayoutState;
	//   87  181:aload_0         
	//   88  182:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   89  185:astore          5
			if(mShouldReverseLayout)
	//*  90  187:aload_0         
	//*  91  188:getfield        #71  <Field boolean mShouldReverseLayout>
	//*  92  191:ifeq            199
				i = 1;
	//   93  194:iconst_1        
	//   94  195:istore_1        
			else
	//*  95  196:goto            201
				i = -1;
	//   96  199:iconst_m1       
	//   97  200:istore_1        
			layoutstate1.mItemDirection = i;
	//   98  201:aload           5
	//   99  203:iload_1         
	//  100  204:putfield        #439 <Field int LinearLayoutManager$LayoutState.mItemDirection>
			mLayoutState.mCurrentPosition = getPosition(((View) (state))) + mLayoutState.mItemDirection;
	//  101  207:aload_0         
	//  102  208:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  103  211:aload_0         
	//  104  212:aload           4
	//  105  214:invokevirtual   #237 <Method int getPosition(View)>
	//  106  217:aload_0         
	//  107  218:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  108  221:getfield        #439 <Field int LinearLayoutManager$LayoutState.mItemDirection>
	//  109  224:iadd            
	//  110  225:putfield        #442 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
			mLayoutState.mOffset = mOrientationHelper.getDecoratedStart(((View) (state)));
	//  111  228:aload_0         
	//  112  229:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  113  232:aload_0         
	//  114  233:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  115  236:aload           4
	//  116  238:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//  117  241:putfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
			i = -mOrientationHelper.getDecoratedStart(((View) (state))) + mOrientationHelper.getStartAfterPadding();
	//  118  244:aload_0         
	//  119  245:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  120  248:aload           4
	//  121  250:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//  122  253:ineg            
	//  123  254:aload_0         
	//  124  255:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  125  258:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//  126  261:iadd            
	//  127  262:istore_1        
		}
		mLayoutState.mAvailable = j;
	//  128  263:aload_0         
	//  129  264:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  130  267:iload_2         
	//  131  268:putfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
		if(flag)
	//* 132  271:iload_3         
	//* 133  272:ifeq            293
		{
			state = ((RecyclerView.State) (mLayoutState));
	//  134  275:aload_0         
	//  135  276:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  136  279:astore          4
			state.mAvailable = ((LayoutState) (state)).mAvailable - i;
	//  137  281:aload           4
	//  138  283:aload           4
	//  139  285:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//  140  288:iload_1         
	//  141  289:isub            
	//  142  290:putfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
		}
		mLayoutState.mScrollingOffset = i;
	//  143  293:aload_0         
	//  144  294:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  145  297:iload_1         
	//  146  298:putfield        #332 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//  147  301:return          
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
	//*  13   26:ifeq            34
			k = -1;
	//   14   29:iconst_m1       
	//   15   30:istore_3        
		else
	//*  16   31:goto            36
			k = 1;
	//   17   34:iconst_1        
	//   18   35:istore_3        
		layoutstate.mItemDirection = k;
	//   19   36:aload           4
	//   20   38:iload_3         
	//   21   39:putfield        #439 <Field int LinearLayoutManager$LayoutState.mItemDirection>
		mLayoutState.mCurrentPosition = i;
	//   22   42:aload_0         
	//   23   43:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   24   46:iload_1         
	//   25   47:putfield        #442 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
		mLayoutState.mLayoutDirection = 1;
	//   26   50:aload_0         
	//   27   51:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   28   54:iconst_1        
	//   29   55:putfield        #329 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
		mLayoutState.mOffset = j;
	//   30   58:aload_0         
	//   31   59:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   32   62:iload_2         
	//   33   63:putfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
		mLayoutState.mScrollingOffset = 0x80000000;
	//   34   66:aload_0         
	//   35   67:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   36   70:ldc1            #29  <Int 0x80000000>
	//   37   72:putfield        #332 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//   38   75:return          
	}

	private void updateLayoutStateToFillEnd(AnchorInfo anchorinfo)
	{
		updateLayoutStateToFillEnd(anchorinfo.mPosition, anchorinfo.mCoordinate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #398 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//    3    5:aload_1         
	//    4    6:getfield        #393 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
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
	//*  17   33:ifeq            41
			i = 1;
	//   18   36:iconst_1        
	//   19   37:istore_1        
		else
	//*  20   38:goto            43
			i = -1;
	//   21   41:iconst_m1       
	//   22   42:istore_1        
		layoutstate.mItemDirection = i;
	//   23   43:aload_3         
	//   24   44:iload_1         
	//   25   45:putfield        #439 <Field int LinearLayoutManager$LayoutState.mItemDirection>
		mLayoutState.mLayoutDirection = -1;
	//   26   48:aload_0         
	//   27   49:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   28   52:iconst_m1       
	//   29   53:putfield        #329 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
		mLayoutState.mOffset = j;
	//   30   56:aload_0         
	//   31   57:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   32   60:iload_2         
	//   33   61:putfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
		mLayoutState.mScrollingOffset = 0x80000000;
	//   34   64:aload_0         
	//   35   65:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   36   68:ldc1            #29  <Int 0x80000000>
	//   37   70:putfield        #332 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//   38   73:return          
	}

	private void updateLayoutStateToFillStart(AnchorInfo anchorinfo)
	{
		updateLayoutStateToFillStart(anchorinfo.mPosition, anchorinfo.mCoordinate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #398 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//    3    5:aload_1         
	//    4    6:getfield        #393 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
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
	//*   2    4:ifne            10
	//*   3    7:goto            12
			i = j;
	//    4   10:iload_2         
	//    5   11:istore_1        
		if(getChildCount() == 0 || i == 0)
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #127 <Method int getChildCount()>
	//*   8   16:ifeq            23
	//*   9   19:iload_1         
	//*  10   20:ifne            24
			return;
	//   11   23:return          
		if(i > 0)
	//*  12   24:iload_1         
	//*  13   25:ifle            33
			j = 1;
	//   14   28:iconst_1        
	//   15   29:istore_2        
		else
	//*  16   30:goto            35
			j = -1;
	//   17   33:iconst_m1       
	//   18   34:istore_2        
		updateLayoutState(j, Math.abs(i), true, state);
	//   19   35:aload_0         
	//   20   36:iload_2         
	//   21   37:iload_1         
	//   22   38:invokestatic    #460 <Method int Math.abs(int)>
	//   23   41:iconst_1        
	//   24   42:aload_3         
	//   25   43:invokespecial   #462 <Method void updateLayoutState(int, int, boolean, RecyclerView$State)>
		collectPrefetchPositionsForLayoutState(state, mLayoutState, layoutprefetchregistry);
	//   26   46:aload_0         
	//   27   47:aload_3         
	//   28   48:aload_0         
	//   29   49:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   30   52:aload           4
	//   31   54:invokevirtual   #466 <Method void collectPrefetchPositionsForLayoutState(RecyclerView$State, LinearLayoutManager$LayoutState, RecyclerView$LayoutManager$LayoutPrefetchRegistry)>
	//   32   57:return          
	}

	public void collectInitialPrefetchPositions(int i, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutprefetchregistry)
	{
		int j;
		boolean flag;
		if(mPendingSavedState != null && mPendingSavedState.hasValidAnchor())
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*   2    4:ifnull          37
	//*   3    7:aload_0         
	//*   4    8:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*   5   11:invokevirtual   #401 <Method boolean LinearLayoutManager$SavedState.hasValidAnchor()>
	//*   6   14:ifeq            37
		{
			flag = mPendingSavedState.mAnchorLayoutFromEnd;
	//    7   17:aload_0         
	//    8   18:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//    9   21:getfield        #404 <Field boolean LinearLayoutManager$SavedState.mAnchorLayoutFromEnd>
	//   10   24:istore          6
			j = mPendingSavedState.mAnchorPosition;
	//   11   26:aload_0         
	//   12   27:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   13   30:getfield        #471 <Field int LinearLayoutManager$SavedState.mAnchorPosition>
	//   14   33:istore_3        
		} else
	//*  15   34:goto            77
		{
			resolveShouldLayoutReverse();
	//   16   37:aload_0         
	//   17   38:invokespecial   #473 <Method void resolveShouldLayoutReverse()>
			flag = mShouldReverseLayout;
	//   18   41:aload_0         
	//   19   42:getfield        #71  <Field boolean mShouldReverseLayout>
	//   20   45:istore          6
			if(mPendingScrollPosition == -1)
	//*  21   47:aload_0         
	//*  22   48:getfield        #77  <Field int mPendingScrollPosition>
	//*  23   51:iconst_m1       
	//*  24   52:icmpne          72
			{
				if(flag)
	//*  25   55:iload           6
	//*  26   57:ifeq            67
					j = i - 1;
	//   27   60:iload_1         
	//   28   61:iconst_1        
	//   29   62:isub            
	//   30   63:istore_3        
				else
	//*  31   64:goto            69
					j = 0;
	//   32   67:iconst_0        
	//   33   68:istore_3        
			} else
	//*  34   69:goto            77
			{
				j = mPendingScrollPosition;
	//   35   72:aload_0         
	//   36   73:getfield        #77  <Field int mPendingScrollPosition>
	//   37   76:istore_3        
			}
		}
		byte byte0;
		if(flag)
	//*  38   77:iload           6
	//*  39   79:ifeq            88
			byte0 = -1;
	//   40   82:iconst_m1       
	//   41   83:istore          4
		else
	//*  42   85:goto            91
			byte0 = 1;
	//   43   88:iconst_1        
	//   44   89:istore          4
		int l = j;
	//   45   91:iload_3         
	//   46   92:istore          5
		for(int k = 0; k < mInitialItemPrefetchCount && l >= 0 && l < i; k++)
	//*  47   94:iconst_0        
	//*  48   95:istore_3        
	//*  49   96:iload_3         
	//*  50   97:aload_0         
	//*  51   98:getfield        #91  <Field int mInitialItemPrefetchCount>
	//*  52  101:icmpge          138
	//*  53  104:iload           5
	//*  54  106:iflt            138
	//*  55  109:iload           5
	//*  56  111:iload_1         
	//*  57  112:icmpge          138
		{
			layoutprefetchregistry.addPosition(l, 0);
	//   58  115:aload_2         
	//   59  116:iload           5
	//   60  118:iconst_0        
	//   61  119:invokeinterface #478 <Method void RecyclerView$LayoutManager$LayoutPrefetchRegistry.addPosition(int, int)>
			l += ((int) (byte0));
	//   62  124:iload           5
	//   63  126:iload           4
	//   64  128:iadd            
	//   65  129:istore          5
		}

	//   66  131:iload_3         
	//   67  132:iconst_1        
	//   68  133:iadd            
	//   69  134:istore_3        
	//*  70  135:goto            96
	//   71  138:return          
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
	//   15   31:invokeinterface #478 <Method void RecyclerView$LayoutManager$LayoutPrefetchRegistry.addPosition(int, int)>
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
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #127 <Method int getChildCount()>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		boolean flag;
		if(i < getPosition(getChildAt(0)))
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:aload_0         
	//*   8   12:iconst_0        
	//*   9   13:invokevirtual   #209 <Method View getChildAt(int)>
	//*  10   16:invokevirtual   #237 <Method int getPosition(View)>
	//*  11   19:icmpge          27
			flag = true;
	//   12   22:iconst_1        
	//   13   23:istore_2        
		else
	//*  14   24:goto            29
			flag = false;
	//   15   27:iconst_0        
	//   16   28:istore_2        
		if(flag != mShouldReverseLayout)
	//*  17   29:iload_2         
	//*  18   30:aload_0         
	//*  19   31:getfield        #71  <Field boolean mShouldReverseLayout>
	//*  20   34:icmpeq          42
			i = -1;
	//   21   37:iconst_m1       
	//   22   38:istore_1        
		else
	//*  23   39:goto            44
			i = 1;
	//   24   42:iconst_1        
	//   25   43:istore_1        
		if(mOrientation == 0)
	//*  26   44:aload_0         
	//*  27   45:getfield        #362 <Field int mOrientation>
	//*  28   48:ifne            62
			return new PointF(i, 0.0F);
	//   29   51:new             #495 <Class PointF>
	//   30   54:dup             
	//   31   55:iload_1         
	//   32   56:i2f             
	//   33   57:fconst_0        
	//   34   58:invokespecial   #498 <Method void PointF(float, float)>
	//   35   61:areturn         
		else
			return new PointF(0.0F, i);
	//   36   62:new             #495 <Class PointF>
	//   37   65:dup             
	//   38   66:fconst_0        
	//   39   67:iload_1         
	//   40   68:i2f             
	//   41   69:invokespecial   #498 <Method void PointF(float, float)>
	//   42   72:areturn         
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
	//*   4   64:getfield        #362 <Field int mOrientation>
	//*   5   67:iconst_1        
	//*   6   68:icmpne          73
				return -1;
	//    7   71:iconst_m1       
	//    8   72:ireturn         
			return !isLayoutRTL() ? -1 : 1;
	//    9   73:aload_0         
	//   10   74:invokevirtual   #365 <Method boolean isLayoutRTL()>
	//   11   77:ifeq            82
	//   12   80:iconst_1        
	//   13   81:ireturn         
	//   14   82:iconst_m1       
	//   15   83:ireturn         

		case 2: // '\002'
			if(mOrientation == 1)
	//*  16   84:aload_0         
	//*  17   85:getfield        #362 <Field int mOrientation>
	//*  18   88:iconst_1        
	//*  19   89:icmpne          94
				return 1;
	//   20   92:iconst_1        
	//   21   93:ireturn         
			return !isLayoutRTL() ? 1 : -1;
	//   22   94:aload_0         
	//   23   95:invokevirtual   #365 <Method boolean isLayoutRTL()>
	//   24   98:ifeq            103
	//   25  101:iconst_m1       
	//   26  102:ireturn         
	//   27  103:iconst_1        
	//   28  104:ireturn         

		case 33: // '!'
			return mOrientation != 1 ? 0x80000000 : -1;
	//   29  105:aload_0         
	//   30  106:getfield        #362 <Field int mOrientation>
	//   31  109:iconst_1        
	//   32  110:icmpne          115
	//   33  113:iconst_m1       
	//   34  114:ireturn         
	//   35  115:ldc1            #29  <Int 0x80000000>
	//   36  117:ireturn         

		case 130: 
			return mOrientation != 1 ? 0x80000000 : 1;
	//   37  118:aload_0         
	//   38  119:getfield        #362 <Field int mOrientation>
	//   39  122:iconst_1        
	//   40  123:icmpne          128
	//   41  126:iconst_1        
	//   42  127:ireturn         
	//   43  128:ldc1            #29  <Int 0x80000000>
	//   44  130:ireturn         

		case 17: // '\021'
			return mOrientation != 0 ? 0x80000000 : -1;
	//   45  131:aload_0         
	//   46  132:getfield        #362 <Field int mOrientation>
	//   47  135:ifne            140
	//   48  138:iconst_m1       
	//   49  139:ireturn         
	//   50  140:ldc1            #29  <Int 0x80000000>
	//   51  142:ireturn         

		case 66: // 'B'
			return mOrientation != 0 ? 0x80000000 : 1;
	//   52  143:aload_0         
	//   53  144:getfield        #362 <Field int mOrientation>
	//   54  147:ifne            152
	//   55  150:iconst_1        
	//   56  151:ireturn         
	//   57  152:ldc1            #29  <Int 0x80000000>
	//   58  154:ireturn         
		}
		return 0x80000000;
	//   59  155:ldc1            #29  <Int 0x80000000>
	//   60  157:ireturn         
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
		int k = layoutstate.mAvailable;
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
		int i = layoutstate.mAvailable + layoutstate.mExtra;
	//   21   41:aload_2         
	//   22   42:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//   23   45:aload_2         
	//   24   46:getfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
	//   25   49:iadd            
	//   26   50:istore          5
		LayoutChunkResult layoutchunkresult = mLayoutChunkResult;
	//   27   52:aload_0         
	//   28   53:getfield        #89  <Field LinearLayoutManager$LayoutChunkResult mLayoutChunkResult>
	//   29   56:astore          8
label0:
		do
		{
			int j;
			do
			{
label1:
				{
					if(!layoutstate.mInfinite && i <= 0 || !layoutstate.hasMore(state))
						break label0;
	//   30   58:aload_2         
	//   31   59:getfield        #326 <Field boolean LinearLayoutManager$LayoutState.mInfinite>
	//   32   62:ifne            70
	//   33   65:iload           5
	//   34   67:ifle            245
	//   35   70:aload_2         
	//   36   71:aload_3         
	//   37   72:invokevirtual   #517 <Method boolean LinearLayoutManager$LayoutState.hasMore(RecyclerView$State)>
	//   38   75:ifeq            245
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
					if(layoutchunkresult.mFinished)
	//*  47   92:aload           8
	//*  48   94:getfield        #527 <Field boolean LinearLayoutManager$LayoutChunkResult.mFinished>
	//*  49   97:ifeq            103
						break label0;
	//   50  100:goto            245
					layoutstate.mOffset = layoutstate.mOffset + layoutchunkresult.mConsumed * layoutstate.mLayoutDirection;
	//   51  103:aload_2         
	//   52  104:aload_2         
	//   53  105:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//   54  108:aload           8
	//   55  110:getfield        #530 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//   56  113:aload_2         
	//   57  114:getfield        #329 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//   58  117:imul            
	//   59  118:iadd            
	//   60  119:putfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
					if(layoutchunkresult.mIgnoreConsumed && mLayoutState.mScrapList == null)
	//*  61  122:aload           8
	//*  62  124:getfield        #533 <Field boolean LinearLayoutManager$LayoutChunkResult.mIgnoreConsumed>
	//*  63  127:ifeq            151
	//*  64  130:aload_0         
	//*  65  131:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//*  66  134:getfield        #262 <Field List LinearLayoutManager$LayoutState.mScrapList>
	//*  67  137:ifnonnull       151
					{
						j = i;
	//   68  140:iload           5
	//   69  142:istore          6
						if(state.isPreLayout())
							break label1;
	//   70  144:aload_3         
	//   71  145:invokevirtual   #219 <Method boolean RecyclerView$State.isPreLayout()>
	//   72  148:ifne            175
					}
					layoutstate.mAvailable = layoutstate.mAvailable - layoutchunkresult.mConsumed;
	//   73  151:aload_2         
	//   74  152:aload_2         
	//   75  153:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//   76  156:aload           8
	//   77  158:getfield        #530 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//   78  161:isub            
	//   79  162:putfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
					j = i - layoutchunkresult.mConsumed;
	//   80  165:iload           5
	//   81  167:aload           8
	//   82  169:getfield        #530 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//   83  172:isub            
	//   84  173:istore          6
				}
				if(layoutstate.mScrollingOffset != 0x80000000)
	//*  85  175:aload_2         
	//*  86  176:getfield        #332 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//*  87  179:ldc1            #29  <Int 0x80000000>
	//*  88  181:icmpeq          224
				{
					layoutstate.mScrollingOffset = layoutstate.mScrollingOffset + layoutchunkresult.mConsumed;
	//   89  184:aload_2         
	//   90  185:aload_2         
	//   91  186:getfield        #332 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//   92  189:aload           8
	//   93  191:getfield        #530 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//   94  194:iadd            
	//   95  195:putfield        #332 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
					if(layoutstate.mAvailable < 0)
	//*  96  198:aload_2         
	//*  97  199:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//*  98  202:ifge            218
						layoutstate.mScrollingOffset = layoutstate.mScrollingOffset + layoutstate.mAvailable;
	//   99  205:aload_2         
	//  100  206:aload_2         
	//  101  207:getfield        #332 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//  102  210:aload_2         
	//  103  211:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//  104  214:iadd            
	//  105  215:putfield        #332 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
					recycleByLayoutState(recycler, layoutstate);
	//  106  218:aload_0         
	//  107  219:aload_1         
	//  108  220:aload_2         
	//  109  221:invokespecial   #513 <Method void recycleByLayoutState(RecyclerView$Recycler, LinearLayoutManager$LayoutState)>
				}
				i = j;
	//  110  224:iload           6
	//  111  226:istore          5
			} while(!flag);
	//  112  228:iload           4
	//  113  230:ifeq            58
			i = j;
	//  114  233:iload           6
	//  115  235:istore          5
		} while(!layoutchunkresult.mFocusable);
	//  116  237:aload           8
	//  117  239:getfield        #536 <Field boolean LinearLayoutManager$LayoutChunkResult.mFocusable>
	//  118  242:ifeq            58
		return k - layoutstate.mAvailable;
	//  119  245:iload           7
	//  120  247:aload_2         
	//  121  248:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//  122  251:isub            
	//  123  252:ireturn         
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
	//*   4    6:icmple          14
			c = '\001';
	//    5    9:iconst_1        
	//    6   10:istore_3        
		else
	//*   7   11:goto            26
		if(j < i)
	//*   8   14:iload_2         
	//*   9   15:iload_1         
	//*  10   16:icmpge          24
			c = '\uFFFF';
	//   11   19:iconst_m1       
	//   12   20:istore_3        
		else
	//*  13   21:goto            26
			c = '\0';
	//   14   24:iconst_0        
	//   15   25:istore_3        
		if(c == 0)
	//*  16   26:iload_3         
	//*  17   27:ifne            36
			return getChildAt(i);
	//   18   30:aload_0         
	//   19   31:iload_1         
	//   20   32:invokevirtual   #209 <Method View getChildAt(int)>
	//   21   35:areturn         
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
	//*  31   55:icmpge          70
		{
			c = '\u4104';
	//   32   58:sipush          16644
	//   33   61:istore_3        
			c1 = '\u4004';
	//   34   62:sipush          16388
	//   35   65:istore          4
		} else
	//*  36   67:goto            79
		{
			c = '\u1041';
	//   37   70:sipush          4161
	//   38   73:istore_3        
			c1 = '\u1001';
	//   39   74:sipush          4097
	//   40   77:istore          4
		}
		if(mOrientation == 0)
	//*  41   79:aload_0         
	//*  42   80:getfield        #362 <Field int mOrientation>
	//*  43   83:ifne            99
			return mHorizontalBoundCheck.findOneViewWithinBoundFlags(i, j, ((int) (c)), ((int) (c1)));
	//   44   86:aload_0         
	//   45   87:getfield        #544 <Field ViewBoundsCheck mHorizontalBoundCheck>
	//   46   90:iload_1         
	//   47   91:iload_2         
	//   48   92:iload_3         
	//   49   93:iload           4
	//   50   95:invokevirtual   #550 <Method View ViewBoundsCheck.findOneViewWithinBoundFlags(int, int, int, int)>
	//   51   98:areturn         
		else
			return mVerticalBoundCheck.findOneViewWithinBoundFlags(i, j, ((int) (c)), ((int) (c1)));
	//   52   99:aload_0         
	//   53  100:getfield        #553 <Field ViewBoundsCheck mVerticalBoundCheck>
	//   54  103:iload_1         
	//   55  104:iload_2         
	//   56  105:iload_3         
	//   57  106:iload           4
	//   58  108:invokevirtual   #550 <Method View ViewBoundsCheck.findOneViewWithinBoundFlags(int, int, int, int)>
	//   59  111:areturn         
	}

	View findOneVisibleChild(int i, int j, boolean flag, boolean flag1)
	{
		ensureLayoutState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #130 <Method void ensureLayoutState()>
		char c1 = '\0';
	//    2    4:iconst_0        
	//    3    5:istore          6
		char c;
		if(flag)
	//*   4    7:iload_3         
	//*   5    8:ifeq            19
			c = '\u6003';
	//    6   11:sipush          24579
	//    7   14:istore          5
		else
	//*   8   16:goto            24
			c = '\u0140';
	//    9   19:sipush          320
	//   10   22:istore          5
		if(flag1)
	//*  11   24:iload           4
	//*  12   26:ifeq            34
			c1 = '\u0140';
	//   13   29:sipush          320
	//   14   32:istore          6
		if(mOrientation == 0)
	//*  15   34:aload_0         
	//*  16   35:getfield        #362 <Field int mOrientation>
	//*  17   38:ifne            55
			return mHorizontalBoundCheck.findOneViewWithinBoundFlags(i, j, ((int) (c)), ((int) (c1)));
	//   18   41:aload_0         
	//   19   42:getfield        #544 <Field ViewBoundsCheck mHorizontalBoundCheck>
	//   20   45:iload_1         
	//   21   46:iload_2         
	//   22   47:iload           5
	//   23   49:iload           6
	//   24   51:invokevirtual   #550 <Method View ViewBoundsCheck.findOneViewWithinBoundFlags(int, int, int, int)>
	//   25   54:areturn         
		else
			return mVerticalBoundCheck.findOneViewWithinBoundFlags(i, j, ((int) (c)), ((int) (c1)));
	//   26   55:aload_0         
	//   27   56:getfield        #553 <Field ViewBoundsCheck mVerticalBoundCheck>
	//   28   59:iload_1         
	//   29   60:iload_2         
	//   30   61:iload           5
	//   31   63:iload           6
	//   32   65:invokevirtual   #550 <Method View ViewBoundsCheck.findOneViewWithinBoundFlags(int, int, int, int)>
	//   33   68:areturn         
	}

	View findReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int j, int k)
	{
		ensureLayoutState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #130 <Method void ensureLayoutState()>
		state = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		recycler = null;
	//    4    6:aconst_null     
	//    5    7:astore_1        
		int l = mOrientationHelper.getStartAfterPadding();
	//    6    8:aload_0         
	//    7    9:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//    8   12:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//    9   15:istore          7
		int i1 = mOrientationHelper.getEndAfterPadding();
	//   10   17:aload_0         
	//   11   18:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   12   21:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//   13   24:istore          8
		byte byte0;
		if(j > i)
	//*  14   26:iload           4
	//*  15   28:iload_3         
	//*  16   29:icmple          38
			byte0 = 1;
	//   17   32:iconst_1        
	//   18   33:istore          6
		else
	//*  19   35:goto            41
			byte0 = -1;
	//   20   38:iconst_m1       
	//   21   39:istore          6
		while(i != j) 
	//*  22   41:iload_3         
	//*  23   42:iload           4
	//*  24   44:icmpeq          185
		{
			View view = getChildAt(i);
	//   25   47:aload_0         
	//   26   48:iload_3         
	//   27   49:invokevirtual   #209 <Method View getChildAt(int)>
	//   28   52:astore          11
			int j1 = getPosition(view);
	//   29   54:aload_0         
	//   30   55:aload           11
	//   31   57:invokevirtual   #237 <Method int getPosition(View)>
	//   32   60:istore          9
			Object obj = ((Object) (state));
	//   33   62:aload_2         
	//   34   63:astore          10
			Object obj1 = ((Object) (recycler));
	//   35   65:aload_1         
	//   36   66:astore          12
			if(j1 >= 0)
	//*  37   68:iload           9
	//*  38   70:iflt            171
			{
				obj = ((Object) (state));
	//   39   73:aload_2         
	//   40   74:astore          10
				obj1 = ((Object) (recycler));
	//   41   76:aload_1         
	//   42   77:astore          12
				if(j1 < k)
	//*  43   79:iload           9
	//*  44   81:iload           5
	//*  45   83:icmpge          171
					if(((RecyclerView.LayoutParams)view.getLayoutParams()).isItemRemoved())
	//*  46   86:aload           11
	//*  47   88:invokevirtual   #559 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  48   91:checkcast       #561 <Class RecyclerView$LayoutParams>
	//*  49   94:invokevirtual   #564 <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
	//*  50   97:ifeq            120
					{
						obj = ((Object) (state));
	//   51  100:aload_2         
	//   52  101:astore          10
						obj1 = ((Object) (recycler));
	//   53  103:aload_1         
	//   54  104:astore          12
						if(state == null)
	//*  55  106:aload_2         
	//*  56  107:ifnonnull       171
						{
							obj = ((Object) (view));
	//   57  110:aload           11
	//   58  112:astore          10
							obj1 = ((Object) (recycler));
	//   59  114:aload_1         
	//   60  115:astore          12
						}
					} else
	//*  61  117:goto            171
					if(mOrientationHelper.getDecoratedStart(view) >= i1 || mOrientationHelper.getDecoratedEnd(view) < l)
	//*  62  120:aload_0         
	//*  63  121:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  64  124:aload           11
	//*  65  126:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  66  129:iload           8
	//*  67  131:icmpge          148
	//*  68  134:aload_0         
	//*  69  135:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//*  70  138:aload           11
	//*  71  140:invokevirtual   #356 <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  72  143:iload           7
	//*  73  145:icmpge          168
					{
						obj = ((Object) (state));
	//   74  148:aload_2         
	//   75  149:astore          10
						obj1 = ((Object) (recycler));
	//   76  151:aload_1         
	//   77  152:astore          12
						if(recycler == null)
	//*  78  154:aload_1         
	//*  79  155:ifnonnull       171
						{
							obj = ((Object) (state));
	//   80  158:aload_2         
	//   81  159:astore          10
							obj1 = ((Object) (view));
	//   82  161:aload           11
	//   83  163:astore          12
						}
					} else
	//*  84  165:goto            171
					{
						return view;
	//   85  168:aload           11
	//   86  170:areturn         
					}
			}
			i += ((int) (byte0));
	//   87  171:iload_3         
	//   88  172:iload           6
	//   89  174:iadd            
	//   90  175:istore_3        
			state = ((RecyclerView.State) (obj));
	//   91  176:aload           10
	//   92  178:astore_2        
			recycler = ((RecyclerView.Recycler) (obj1));
	//   93  179:aload           12
	//   94  181:astore_1        
		}
	//*  95  182:goto            41
		if(recycler != null)
	//*  96  185:aload_1         
	//*  97  186:ifnull          191
			return ((View) (recycler));
	//   98  189:aload_1         
	//   99  190:areturn         
		else
			return ((View) (state));
	//  100  191:aload_2         
	//  101  192:areturn         
	}

	public View findViewByPosition(int i)
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #127 <Method int getChildCount()>
	//    2    4:istore_2        
		if(j == 0)
	//*   3    5:iload_2         
	//*   4    6:ifne            11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		int k = i - getPosition(getChildAt(0));
	//    7   11:iload_1         
	//    8   12:aload_0         
	//    9   13:aload_0         
	//   10   14:iconst_0        
	//   11   15:invokevirtual   #209 <Method View getChildAt(int)>
	//   12   18:invokevirtual   #237 <Method int getPosition(View)>
	//   13   21:isub            
	//   14   22:istore_3        
		if(k >= 0 && k < j)
	//*  15   23:iload_3         
	//*  16   24:iflt            52
	//*  17   27:iload_3         
	//*  18   28:iload_2         
	//*  19   29:icmpge          52
		{
			View view = getChildAt(k);
	//   20   32:aload_0         
	//   21   33:iload_3         
	//   22   34:invokevirtual   #209 <Method View getChildAt(int)>
	//   23   37:astore          4
			if(getPosition(view) == i)
	//*  24   39:aload_0         
	//*  25   40:aload           4
	//*  26   42:invokevirtual   #237 <Method int getPosition(View)>
	//*  27   45:iload_1         
	//*  28   46:icmpne          52
				return view;
	//   29   49:aload           4
	//   30   51:areturn         
		}
		return super.findViewByPosition(i);
	//   31   52:aload_0         
	//   32   53:iload_1         
	//   33   54:invokespecial   #565 <Method View RecyclerView$LayoutManager.findViewByPosition(int)>
	//   34   57:areturn         
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

	public int getInitialItemPrefetchCount()
	{
		return mInitialItemPrefetchCount;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field int mInitialItemPrefetchCount>
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
		if(layoutstate.mScrapList == null)
	//*  14   25:aload_3         
	//*  15   26:getfield        #262 <Field List LinearLayoutManager$LayoutState.mScrapList>
	//*  16   29:ifnonnull       79
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
	//*  23   43:icmpne          52
				flag = true;
	//   24   46:iconst_1        
	//   25   47:istore          9
			else
	//*  26   49:goto            55
				flag = false;
	//   27   52:iconst_0        
	//   28   53:istore          9
			if(flag2 == flag)
	//*  29   55:iload           10
	//*  30   57:iload           9
	//*  31   59:icmpne          70
				addView(((View) (recycler)));
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:invokevirtual   #590 <Method void addView(View)>
			else
	//*  35   67:goto            123
				addView(((View) (recycler)), 0);
	//   36   70:aload_0         
	//   37   71:aload_1         
	//   38   72:iconst_0        
	//   39   73:invokevirtual   #593 <Method void addView(View, int)>
		} else
	//*  40   76:goto            123
		{
			boolean flag3 = mShouldReverseLayout;
	//   41   79:aload_0         
	//   42   80:getfield        #71  <Field boolean mShouldReverseLayout>
	//   43   83:istore          10
			boolean flag1;
			if(layoutstate.mLayoutDirection == -1)
	//*  44   85:aload_3         
	//*  45   86:getfield        #329 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//*  46   89:iconst_m1       
	//*  47   90:icmpne          99
				flag1 = true;
	//   48   93:iconst_1        
	//   49   94:istore          9
			else
	//*  50   96:goto            102
				flag1 = false;
	//   51   99:iconst_0        
	//   52  100:istore          9
			if(flag3 == flag1)
	//*  53  102:iload           10
	//*  54  104:iload           9
	//*  55  106:icmpne          117
				addDisappearingView(((View) (recycler)));
	//   56  109:aload_0         
	//   57  110:aload_1         
	//   58  111:invokevirtual   #596 <Method void addDisappearingView(View)>
			else
	//*  59  114:goto            123
				addDisappearingView(((View) (recycler)), 0);
	//   60  117:aload_0         
	//   61  118:aload_1         
	//   62  119:iconst_0        
	//   63  120:invokevirtual   #598 <Method void addDisappearingView(View, int)>
		}
		measureChildWithMargins(((View) (recycler)), 0, 0);
	//   64  123:aload_0         
	//   65  124:aload_1         
	//   66  125:iconst_0        
	//   67  126:iconst_0        
	//   68  127:invokevirtual   #602 <Method void measureChildWithMargins(View, int, int)>
		layoutchunkresult.mConsumed = mOrientationHelper.getDecoratedMeasurement(((View) (recycler)));
	//   69  130:aload           4
	//   70  132:aload_0         
	//   71  133:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   72  136:aload_1         
	//   73  137:invokevirtual   #256 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   74  140:putfield        #530 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
		int i;
		int j;
		int k;
		int l;
		if(mOrientation == 1)
	//*  75  143:aload_0         
	//*  76  144:getfield        #362 <Field int mOrientation>
	//*  77  147:iconst_1        
	//*  78  148:icmpne          254
		{
			if(isLayoutRTL())
	//*  79  151:aload_0         
	//*  80  152:invokevirtual   #365 <Method boolean isLayoutRTL()>
	//*  81  155:ifeq            185
			{
				k = getWidth() - getPaddingRight();
	//   82  158:aload_0         
	//   83  159:invokevirtual   #605 <Method int getWidth()>
	//   84  162:aload_0         
	//   85  163:invokevirtual   #608 <Method int getPaddingRight()>
	//   86  166:isub            
	//   87  167:istore          7
				i = k - mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler)));
	//   88  169:iload           7
	//   89  171:aload_0         
	//   90  172:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   91  175:aload_1         
	//   92  176:invokevirtual   #611 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//   93  179:isub            
	//   94  180:istore          5
			} else
	//*  95  182:goto            204
			{
				i = getPaddingLeft();
	//   96  185:aload_0         
	//   97  186:invokevirtual   #614 <Method int getPaddingLeft()>
	//   98  189:istore          5
				k = i + mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler)));
	//   99  191:iload           5
	//  100  193:aload_0         
	//  101  194:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  102  197:aload_1         
	//  103  198:invokevirtual   #611 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//  104  201:iadd            
	//  105  202:istore          7
			}
			if(layoutstate.mLayoutDirection == -1)
	//* 106  204:aload_3         
	//* 107  205:getfield        #329 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//* 108  208:iconst_m1       
	//* 109  209:icmpne          233
			{
				l = layoutstate.mOffset;
	//  110  212:aload_3         
	//  111  213:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  112  216:istore          8
				j = layoutstate.mOffset - layoutchunkresult.mConsumed;
	//  113  218:aload_3         
	//  114  219:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  115  222:aload           4
	//  116  224:getfield        #530 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//  117  227:isub            
	//  118  228:istore          6
			} else
	//* 119  230:goto            320
			{
				j = layoutstate.mOffset;
	//  120  233:aload_3         
	//  121  234:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  122  237:istore          6
				l = layoutstate.mOffset + layoutchunkresult.mConsumed;
	//  123  239:aload_3         
	//  124  240:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  125  243:aload           4
	//  126  245:getfield        #530 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//  127  248:iadd            
	//  128  249:istore          8
			}
		} else
	//* 129  251:goto            320
		{
			j = getPaddingTop();
	//  130  254:aload_0         
	//  131  255:invokevirtual   #617 <Method int getPaddingTop()>
	//  132  258:istore          6
			l = j + mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler)));
	//  133  260:iload           6
	//  134  262:aload_0         
	//  135  263:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  136  266:aload_1         
	//  137  267:invokevirtual   #611 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//  138  270:iadd            
	//  139  271:istore          8
			if(layoutstate.mLayoutDirection == -1)
	//* 140  273:aload_3         
	//* 141  274:getfield        #329 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//* 142  277:iconst_m1       
	//* 143  278:icmpne          302
			{
				k = layoutstate.mOffset;
	//  144  281:aload_3         
	//  145  282:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  146  285:istore          7
				i = layoutstate.mOffset - layoutchunkresult.mConsumed;
	//  147  287:aload_3         
	//  148  288:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  149  291:aload           4
	//  150  293:getfield        #530 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//  151  296:isub            
	//  152  297:istore          5
			} else
	//* 153  299:goto            320
			{
				i = layoutstate.mOffset;
	//  154  302:aload_3         
	//  155  303:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  156  306:istore          5
				k = layoutstate.mOffset + layoutchunkresult.mConsumed;
	//  157  308:aload_3         
	//  158  309:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  159  312:aload           4
	//  160  314:getfield        #530 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//  161  317:iadd            
	//  162  318:istore          7
			}
		}
		layoutDecoratedWithMargins(((View) (recycler)), i, j, k, l);
	//  163  320:aload_0         
	//  164  321:aload_1         
	//  165  322:iload           5
	//  166  324:iload           6
	//  167  326:iload           7
	//  168  328:iload           8
	//  169  330:invokevirtual   #621 <Method void layoutDecoratedWithMargins(View, int, int, int, int)>
		if(((RecyclerView.LayoutParams) (state)).isItemRemoved() || ((RecyclerView.LayoutParams) (state)).isItemChanged())
	//* 170  333:aload_2         
	//* 171  334:invokevirtual   #564 <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
	//* 172  337:ifne            347
	//* 173  340:aload_2         
	//* 174  341:invokevirtual   #624 <Method boolean RecyclerView$LayoutParams.isItemChanged()>
	//* 175  344:ifeq            353
			layoutchunkresult.mIgnoreConsumed = true;
	//  176  347:aload           4
	//  177  349:iconst_1        
	//  178  350:putfield        #533 <Field boolean LinearLayoutManager$LayoutChunkResult.mIgnoreConsumed>
		layoutchunkresult.mFocusable = ((View) (recycler)).hasFocusable();
	//  179  353:aload           4
	//  180  355:aload_1         
	//  181  356:invokevirtual   #627 <Method boolean View.hasFocusable()>
	//  182  359:putfield        #536 <Field boolean LinearLayoutManager$LayoutChunkResult.mFocusable>
	//  183  362:return          
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
	//    1    1:invokespecial   #473 <Method void resolveShouldLayoutReverse()>
		if(getChildCount() == 0)
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #127 <Method int getChildCount()>
	//*   4    8:ifne            13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		i = convertFocusDirectionToLayoutDirection(i);
	//    7   13:aload_0         
	//    8   14:iload_2         
	//    9   15:invokevirtual   #644 <Method int convertFocusDirectionToLayoutDirection(int)>
	//   10   18:istore_2        
		if(i == 0x80000000)
	//*  11   19:iload_2         
	//*  12   20:ldc1            #29  <Int 0x80000000>
	//*  13   22:icmpne          27
			return null;
	//   14   25:aconst_null     
	//   15   26:areturn         
		ensureLayoutState();
	//   16   27:aload_0         
	//   17   28:invokevirtual   #130 <Method void ensureLayoutState()>
		ensureLayoutState();
	//   18   31:aload_0         
	//   19   32:invokevirtual   #130 <Method void ensureLayoutState()>
		updateLayoutState(i, (int)((float)mOrientationHelper.getTotalSpace() * 0.3333333F), false, state);
	//   20   35:aload_0         
	//   21   36:iload_2         
	//   22   37:aload_0         
	//   23   38:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   24   41:invokevirtual   #413 <Method int OrientationHelper.getTotalSpace()>
	//   25   44:i2f             
	//   26   45:ldc1            #32  <Float 0.3333333F>
	//   27   47:fmul            
	//   28   48:f2i             
	//   29   49:iconst_0        
	//   30   50:aload           4
	//   31   52:invokespecial   #462 <Method void updateLayoutState(int, int, boolean, RecyclerView$State)>
		mLayoutState.mScrollingOffset = 0x80000000;
	//   32   55:aload_0         
	//   33   56:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   34   59:ldc1            #29  <Int 0x80000000>
	//   35   61:putfield        #332 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
		mLayoutState.mRecycle = false;
	//   36   64:aload_0         
	//   37   65:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   38   68:iconst_0        
	//   39   69:putfield        #323 <Field boolean LinearLayoutManager$LayoutState.mRecycle>
		fill(recycler, mLayoutState, state, true);
	//   40   72:aload_0         
	//   41   73:aload_3         
	//   42   74:aload_0         
	//   43   75:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   44   78:aload           4
	//   45   80:iconst_1        
	//   46   81:invokevirtual   #281 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//   47   84:pop             
		if(i == -1)
	//*  48   85:iload_2         
	//*  49   86:iconst_m1       
	//*  50   87:icmpne          101
			view = findPartiallyOrCompletelyInvisibleChildClosestToStart(recycler, state);
	//   51   90:aload_0         
	//   52   91:aload_3         
	//   53   92:aload           4
	//   54   94:invokespecial   #646 <Method View findPartiallyOrCompletelyInvisibleChildClosestToStart(RecyclerView$Recycler, RecyclerView$State)>
	//   55   97:astore_1        
		else
	//*  56   98:goto            109
			view = findPartiallyOrCompletelyInvisibleChildClosestToEnd(recycler, state);
	//   57  101:aload_0         
	//   58  102:aload_3         
	//   59  103:aload           4
	//   60  105:invokespecial   #648 <Method View findPartiallyOrCompletelyInvisibleChildClosestToEnd(RecyclerView$Recycler, RecyclerView$State)>
	//   61  108:astore_1        
		if(i == -1)
	//*  62  109:iload_2         
	//*  63  110:iconst_m1       
	//*  64  111:icmpne          122
			recycler = ((RecyclerView.Recycler) (getChildClosestToStart()));
	//   65  114:aload_0         
	//   66  115:invokespecial   #264 <Method View getChildClosestToStart()>
	//   67  118:astore_3        
		else
	//*  68  119:goto            127
			recycler = ((RecyclerView.Recycler) (getChildClosestToEnd()));
	//   69  122:aload_0         
	//   70  123:invokespecial   #283 <Method View getChildClosestToEnd()>
	//   71  126:astore_3        
		if(((View) (recycler)).hasFocusable())
	//*  72  127:aload_3         
	//*  73  128:invokevirtual   #627 <Method boolean View.hasFocusable()>
	//*  74  131:ifeq            142
		{
			if(view == null)
	//*  75  134:aload_1         
	//*  76  135:ifnonnull       140
				return null;
	//   77  138:aconst_null     
	//   78  139:areturn         
			else
				return ((View) (recycler));
	//   79  140:aload_3         
	//   80  141:areturn         
		} else
		{
			return view;
	//   81  142:aload_1         
	//   82  143:areturn         
		}
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
	//*   5    9:ifle            33
		{
			accessibilityevent = ((AccessibilityEvent) (AccessibilityEventCompat.asRecord(accessibilityevent)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #658 <Method AccessibilityRecordCompat AccessibilityEventCompat.asRecord(AccessibilityEvent)>
	//    8   16:astore_1        
			((AccessibilityRecordCompat) (accessibilityevent)).setFromIndex(findFirstVisibleItemPosition());
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #660 <Method int findFirstVisibleItemPosition()>
	//   12   22:invokevirtual   #665 <Method void AccessibilityRecordCompat.setFromIndex(int)>
			((AccessibilityRecordCompat) (accessibilityevent)).setToIndex(findLastVisibleItemPosition());
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:invokevirtual   #667 <Method int findLastVisibleItemPosition()>
	//   16   30:invokevirtual   #670 <Method void AccessibilityRecordCompat.setToIndex(int)>
		}
	//   17   33:return          
	}

	public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if((mPendingSavedState != null || mPendingScrollPosition != -1) && state.getItemCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*   2    4:ifnonnull       15
	//*   3    7:aload_0         
	//*   4    8:getfield        #77  <Field int mPendingScrollPosition>
	//*   5   11:iconst_m1       
	//*   6   12:icmpeq          28
	//*   7   15:aload_2         
	//*   8   16:invokevirtual   #163 <Method int RecyclerView$State.getItemCount()>
	//*   9   19:ifne            28
		{
			removeAndRecycleAllViews(recycler);
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #637 <Method void removeAndRecycleAllViews(RecyclerView$Recycler)>
			return;
	//   13   27:return          
		}
		if(mPendingSavedState != null && mPendingSavedState.hasValidAnchor())
	//*  14   28:aload_0         
	//*  15   29:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*  16   32:ifnull          56
	//*  17   35:aload_0         
	//*  18   36:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*  19   39:invokevirtual   #401 <Method boolean LinearLayoutManager$SavedState.hasValidAnchor()>
	//*  20   42:ifeq            56
			mPendingScrollPosition = mPendingSavedState.mAnchorPosition;
	//   21   45:aload_0         
	//   22   46:aload_0         
	//   23   47:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   24   50:getfield        #471 <Field int LinearLayoutManager$SavedState.mAnchorPosition>
	//   25   53:putfield        #77  <Field int mPendingScrollPosition>
		ensureLayoutState();
	//   26   56:aload_0         
	//   27   57:invokevirtual   #130 <Method void ensureLayoutState()>
		mLayoutState.mRecycle = false;
	//   28   60:aload_0         
	//   29   61:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   30   64:iconst_0        
	//   31   65:putfield        #323 <Field boolean LinearLayoutManager$LayoutState.mRecycle>
		resolveShouldLayoutReverse();
	//   32   68:aload_0         
	//   33   69:invokespecial   #473 <Method void resolveShouldLayoutReverse()>
		if(!mAnchorInfo.mValid || mPendingScrollPosition != -1 || mPendingSavedState != null)
	//*  34   72:aload_0         
	//*  35   73:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//*  36   76:getfield        #675 <Field boolean LinearLayoutManager$AnchorInfo.mValid>
	//*  37   79:ifeq            97
	//*  38   82:aload_0         
	//*  39   83:getfield        #77  <Field int mPendingScrollPosition>
	//*  40   86:iconst_m1       
	//*  41   87:icmpne          97
	//*  42   90:aload_0         
	//*  43   91:getfield        #81  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*  44   94:ifnull          138
		{
			mAnchorInfo.reset();
	//   45   97:aload_0         
	//   46   98:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//   47  101:invokevirtual   #678 <Method void LinearLayoutManager$AnchorInfo.reset()>
			mAnchorInfo.mLayoutFromEnd = mShouldReverseLayout ^ mStackFromEnd;
	//   48  104:aload_0         
	//   49  105:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//   50  108:aload_0         
	//   51  109:getfield        #71  <Field boolean mShouldReverseLayout>
	//   52  112:aload_0         
	//   53  113:getfield        #73  <Field boolean mStackFromEnd>
	//   54  116:ixor            
	//   55  117:putfield        #383 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
			updateAnchorInfoForLayout(recycler, state, mAnchorInfo);
	//   56  120:aload_0         
	//   57  121:aload_1         
	//   58  122:aload_2         
	//   59  123:aload_0         
	//   60  124:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//   61  127:invokespecial   #680 <Method void updateAnchorInfoForLayout(RecyclerView$Recycler, RecyclerView$State, LinearLayoutManager$AnchorInfo)>
			mAnchorInfo.mValid = true;
	//   62  130:aload_0         
	//   63  131:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//   64  134:iconst_1        
	//   65  135:putfield        #675 <Field boolean LinearLayoutManager$AnchorInfo.mValid>
		}
		int i = getExtraLayoutSpace(state);
	//   66  138:aload_0         
	//   67  139:aload_2         
	//   68  140:invokevirtual   #433 <Method int getExtraLayoutSpace(RecyclerView$State)>
	//   69  143:istore_3        
		int j;
		if(mLayoutState.mLastScrollDelta >= 0)
	//*  70  144:aload_0         
	//*  71  145:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//*  72  148:getfield        #683 <Field int LinearLayoutManager$LayoutState.mLastScrollDelta>
	//*  73  151:iflt            160
		{
			j = 0;
	//   74  154:iconst_0        
	//   75  155:istore          4
		} else
	//*  76  157:goto            165
		{
			j = i;
	//   77  160:iload_3         
	//   78  161:istore          4
			i = 0;
	//   79  163:iconst_0        
	//   80  164:istore_3        
		}
		int k = j + mOrientationHelper.getStartAfterPadding();
	//   81  165:iload           4
	//   82  167:aload_0         
	//   83  168:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   84  171:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//   85  174:iadd            
	//   86  175:istore          5
		int l = i + mOrientationHelper.getEndPadding();
	//   87  177:iload_3         
	//   88  178:aload_0         
	//   89  179:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   90  182:invokevirtual   #436 <Method int OrientationHelper.getEndPadding()>
	//   91  185:iadd            
	//   92  186:istore          6
		i = k;
	//   93  188:iload           5
	//   94  190:istore_3        
		j = l;
	//   95  191:iload           6
	//   96  193:istore          4
		if(state.isPreLayout())
	//*  97  195:aload_2         
	//*  98  196:invokevirtual   #219 <Method boolean RecyclerView$State.isPreLayout()>
	//*  99  199:ifeq            342
		{
			i = k;
	//  100  202:iload           5
	//  101  204:istore_3        
			j = l;
	//  102  205:iload           6
	//  103  207:istore          4
			if(mPendingScrollPosition != -1)
	//* 104  209:aload_0         
	//* 105  210:getfield        #77  <Field int mPendingScrollPosition>
	//* 106  213:iconst_m1       
	//* 107  214:icmpeq          342
			{
				i = k;
	//  108  217:iload           5
	//  109  219:istore_3        
				j = l;
	//  110  220:iload           6
	//  111  222:istore          4
				if(mPendingScrollPositionOffset != 0x80000000)
	//* 112  224:aload_0         
	//* 113  225:getfield        #79  <Field int mPendingScrollPositionOffset>
	//* 114  228:ldc1            #29  <Int 0x80000000>
	//* 115  230:icmpeq          342
				{
					View view = findViewByPosition(mPendingScrollPosition);
	//  116  233:aload_0         
	//  117  234:aload_0         
	//  118  235:getfield        #77  <Field int mPendingScrollPosition>
	//  119  238:invokevirtual   #410 <Method View findViewByPosition(int)>
	//  120  241:astore          8
					i = k;
	//  121  243:iload           5
	//  122  245:istore_3        
					j = l;
	//  123  246:iload           6
	//  124  248:istore          4
					if(view != null)
	//* 125  250:aload           8
	//* 126  252:ifnull          342
					{
						if(mShouldReverseLayout)
	//* 127  255:aload_0         
	//* 128  256:getfield        #71  <Field boolean mShouldReverseLayout>
	//* 129  259:ifeq            288
						{
							i = mOrientationHelper.getEndAfterPadding() - mOrientationHelper.getDecoratedEnd(view) - mPendingScrollPositionOffset;
	//  130  262:aload_0         
	//  131  263:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  132  266:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//  133  269:aload_0         
	//  134  270:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  135  273:aload           8
	//  136  275:invokevirtual   #356 <Method int OrientationHelper.getDecoratedEnd(View)>
	//  137  278:isub            
	//  138  279:aload_0         
	//  139  280:getfield        #79  <Field int mPendingScrollPositionOffset>
	//  140  283:isub            
	//  141  284:istore_3        
						} else
	//* 142  285:goto            317
						{
							i = mOrientationHelper.getDecoratedStart(view);
	//  143  288:aload_0         
	//  144  289:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  145  292:aload           8
	//  146  294:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//  147  297:istore_3        
							j = mOrientationHelper.getStartAfterPadding();
	//  148  298:aload_0         
	//  149  299:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  150  302:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//  151  305:istore          4
							i = mPendingScrollPositionOffset - (i - j);
	//  152  307:aload_0         
	//  153  308:getfield        #79  <Field int mPendingScrollPositionOffset>
	//  154  311:iload_3         
	//  155  312:iload           4
	//  156  314:isub            
	//  157  315:isub            
	//  158  316:istore_3        
						}
						if(i > 0)
	//* 159  317:iload_3         
	//* 160  318:ifle            333
						{
							i = k + i;
	//  161  321:iload           5
	//  162  323:iload_3         
	//  163  324:iadd            
	//  164  325:istore_3        
							j = l;
	//  165  326:iload           6
	//  166  328:istore          4
						} else
	//* 167  330:goto            342
						{
							j = l - i;
	//  168  333:iload           6
	//  169  335:iload_3         
	//  170  336:isub            
	//  171  337:istore          4
							i = k;
	//  172  339:iload           5
	//  173  341:istore_3        
						}
					}
				}
			}
		}
		if(mAnchorInfo.mLayoutFromEnd)
	//* 174  342:aload_0         
	//* 175  343:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//* 176  346:getfield        #383 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
	//* 177  349:ifeq            371
		{
			if(mShouldReverseLayout)
	//* 178  352:aload_0         
	//* 179  353:getfield        #71  <Field boolean mShouldReverseLayout>
	//* 180  356:ifeq            365
				k = 1;
	//  181  359:iconst_1        
	//  182  360:istore          5
			else
	//* 183  362:goto            368
				k = -1;
	//  184  365:iconst_m1       
	//  185  366:istore          5
		} else
	//* 186  368:goto            387
		if(mShouldReverseLayout)
	//* 187  371:aload_0         
	//* 188  372:getfield        #71  <Field boolean mShouldReverseLayout>
	//* 189  375:ifeq            384
			k = -1;
	//  190  378:iconst_m1       
	//  191  379:istore          5
		else
	//* 192  381:goto            387
			k = 1;
	//  193  384:iconst_1        
	//  194  385:istore          5
		onAnchorReady(recycler, state, mAnchorInfo, k);
	//  195  387:aload_0         
	//  196  388:aload_1         
	//  197  389:aload_2         
	//  198  390:aload_0         
	//  199  391:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//  200  394:iload           5
	//  201  396:invokevirtual   #685 <Method void onAnchorReady(RecyclerView$Recycler, RecyclerView$State, LinearLayoutManager$AnchorInfo, int)>
		detachAndScrapAttachedViews(recycler);
	//  202  399:aload_0         
	//  203  400:aload_1         
	//  204  401:invokevirtual   #688 <Method void detachAndScrapAttachedViews(RecyclerView$Recycler)>
		mLayoutState.mInfinite = resolveIsInfinite();
	//  205  404:aload_0         
	//  206  405:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  207  408:aload_0         
	//  208  409:invokevirtual   #430 <Method boolean resolveIsInfinite()>
	//  209  412:putfield        #326 <Field boolean LinearLayoutManager$LayoutState.mInfinite>
		mLayoutState.mIsPreLayout = state.isPreLayout();
	//  210  415:aload_0         
	//  211  416:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  212  419:aload_2         
	//  213  420:invokevirtual   #219 <Method boolean RecyclerView$State.isPreLayout()>
	//  214  423:putfield        #691 <Field boolean LinearLayoutManager$LayoutState.mIsPreLayout>
		if(mAnchorInfo.mLayoutFromEnd)
	//* 215  426:aload_0         
	//* 216  427:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//* 217  430:getfield        #383 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
	//* 218  433:ifeq            630
		{
			updateLayoutStateToFillStart(mAnchorInfo);
	//  219  436:aload_0         
	//  220  437:aload_0         
	//  221  438:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//  222  441:invokespecial   #693 <Method void updateLayoutStateToFillStart(LinearLayoutManager$AnchorInfo)>
			mLayoutState.mExtra = i;
	//  223  444:aload_0         
	//  224  445:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  225  448:iload_3         
	//  226  449:putfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
			fill(recycler, mLayoutState, state, false);
	//  227  452:aload_0         
	//  228  453:aload_1         
	//  229  454:aload_0         
	//  230  455:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  231  458:aload_2         
	//  232  459:iconst_0        
	//  233  460:invokevirtual   #281 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//  234  463:pop             
			k = mLayoutState.mOffset;
	//  235  464:aload_0         
	//  236  465:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  237  468:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  238  471:istore          5
			l = mLayoutState.mCurrentPosition;
	//  239  473:aload_0         
	//  240  474:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  241  477:getfield        #442 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//  242  480:istore          6
			i = j;
	//  243  482:iload           4
	//  244  484:istore_3        
			if(mLayoutState.mAvailable > 0)
	//* 245  485:aload_0         
	//* 246  486:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 247  489:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//* 248  492:ifle            506
				i = j + mLayoutState.mAvailable;
	//  249  495:iload           4
	//  250  497:aload_0         
	//  251  498:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  252  501:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//  253  504:iadd            
	//  254  505:istore_3        
			updateLayoutStateToFillEnd(mAnchorInfo);
	//  255  506:aload_0         
	//  256  507:aload_0         
	//  257  508:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//  258  511:invokespecial   #695 <Method void updateLayoutStateToFillEnd(LinearLayoutManager$AnchorInfo)>
			mLayoutState.mExtra = i;
	//  259  514:aload_0         
	//  260  515:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  261  518:iload_3         
	//  262  519:putfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
			LayoutState layoutstate = mLayoutState;
	//  263  522:aload_0         
	//  264  523:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  265  526:astore          8
			layoutstate.mCurrentPosition = layoutstate.mCurrentPosition + mLayoutState.mItemDirection;
	//  266  528:aload           8
	//  267  530:aload           8
	//  268  532:getfield        #442 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//  269  535:aload_0         
	//  270  536:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  271  539:getfield        #439 <Field int LinearLayoutManager$LayoutState.mItemDirection>
	//  272  542:iadd            
	//  273  543:putfield        #442 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
			fill(recycler, mLayoutState, state, false);
	//  274  546:aload_0         
	//  275  547:aload_1         
	//  276  548:aload_0         
	//  277  549:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  278  552:aload_2         
	//  279  553:iconst_0        
	//  280  554:invokevirtual   #281 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//  281  557:pop             
			i = mLayoutState.mOffset;
	//  282  558:aload_0         
	//  283  559:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  284  562:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  285  565:istore_3        
			j = k;
	//  286  566:iload           5
	//  287  568:istore          4
			if(mLayoutState.mAvailable > 0)
	//* 288  570:aload_0         
	//* 289  571:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 290  574:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//* 291  577:ifle            627
			{
				j = mLayoutState.mAvailable;
	//  292  580:aload_0         
	//  293  581:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  294  584:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//  295  587:istore          4
				updateLayoutStateToFillStart(l, k);
	//  296  589:aload_0         
	//  297  590:iload           6
	//  298  592:iload           5
	//  299  594:invokespecial   #268 <Method void updateLayoutStateToFillStart(int, int)>
				mLayoutState.mExtra = j;
	//  300  597:aload_0         
	//  301  598:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  302  601:iload           4
	//  303  603:putfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
				fill(recycler, mLayoutState, state, false);
	//  304  606:aload_0         
	//  305  607:aload_1         
	//  306  608:aload_0         
	//  307  609:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  308  612:aload_2         
	//  309  613:iconst_0        
	//  310  614:invokevirtual   #281 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//  311  617:pop             
				j = mLayoutState.mOffset;
	//  312  618:aload_0         
	//  313  619:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  314  622:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  315  625:istore          4
			}
		} else
	//* 316  627:goto            828
		{
			updateLayoutStateToFillEnd(mAnchorInfo);
	//  317  630:aload_0         
	//  318  631:aload_0         
	//  319  632:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//  320  635:invokespecial   #695 <Method void updateLayoutStateToFillEnd(LinearLayoutManager$AnchorInfo)>
			mLayoutState.mExtra = j;
	//  321  638:aload_0         
	//  322  639:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  323  642:iload           4
	//  324  644:putfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
			fill(recycler, mLayoutState, state, false);
	//  325  647:aload_0         
	//  326  648:aload_1         
	//  327  649:aload_0         
	//  328  650:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  329  653:aload_2         
	//  330  654:iconst_0        
	//  331  655:invokevirtual   #281 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//  332  658:pop             
			k = mLayoutState.mOffset;
	//  333  659:aload_0         
	//  334  660:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  335  663:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  336  666:istore          5
			int i1 = mLayoutState.mCurrentPosition;
	//  337  668:aload_0         
	//  338  669:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  339  672:getfield        #442 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//  340  675:istore          7
			j = i;
	//  341  677:iload_3         
	//  342  678:istore          4
			if(mLayoutState.mAvailable > 0)
	//* 343  680:aload_0         
	//* 344  681:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 345  684:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//* 346  687:ifle            701
				j = i + mLayoutState.mAvailable;
	//  347  690:iload_3         
	//  348  691:aload_0         
	//  349  692:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  350  695:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//  351  698:iadd            
	//  352  699:istore          4
			updateLayoutStateToFillStart(mAnchorInfo);
	//  353  701:aload_0         
	//  354  702:aload_0         
	//  355  703:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//  356  706:invokespecial   #693 <Method void updateLayoutStateToFillStart(LinearLayoutManager$AnchorInfo)>
			mLayoutState.mExtra = j;
	//  357  709:aload_0         
	//  358  710:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  359  713:iload           4
	//  360  715:putfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
			LayoutState layoutstate1 = mLayoutState;
	//  361  718:aload_0         
	//  362  719:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  363  722:astore          8
			layoutstate1.mCurrentPosition = layoutstate1.mCurrentPosition + mLayoutState.mItemDirection;
	//  364  724:aload           8
	//  365  726:aload           8
	//  366  728:getfield        #442 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//  367  731:aload_0         
	//  368  732:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  369  735:getfield        #439 <Field int LinearLayoutManager$LayoutState.mItemDirection>
	//  370  738:iadd            
	//  371  739:putfield        #442 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
			fill(recycler, mLayoutState, state, false);
	//  372  742:aload_0         
	//  373  743:aload_1         
	//  374  744:aload_0         
	//  375  745:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  376  748:aload_2         
	//  377  749:iconst_0        
	//  378  750:invokevirtual   #281 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//  379  753:pop             
			l = mLayoutState.mOffset;
	//  380  754:aload_0         
	//  381  755:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  382  758:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  383  761:istore          6
			j = l;
	//  384  763:iload           6
	//  385  765:istore          4
			i = k;
	//  386  767:iload           5
	//  387  769:istore_3        
			if(mLayoutState.mAvailable > 0)
	//* 388  770:aload_0         
	//* 389  771:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 390  774:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//* 391  777:ifle            828
			{
				i = mLayoutState.mAvailable;
	//  392  780:aload_0         
	//  393  781:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  394  784:getfield        #274 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//  395  787:istore_3        
				updateLayoutStateToFillEnd(i1, k);
	//  396  788:aload_0         
	//  397  789:iload           7
	//  398  791:iload           5
	//  399  793:invokespecial   #286 <Method void updateLayoutStateToFillEnd(int, int)>
				mLayoutState.mExtra = i;
	//  400  796:aload_0         
	//  401  797:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  402  800:iload_3         
	//  403  801:putfield        #271 <Field int LinearLayoutManager$LayoutState.mExtra>
				fill(recycler, mLayoutState, state, false);
	//  404  804:aload_0         
	//  405  805:aload_1         
	//  406  806:aload_0         
	//  407  807:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  408  810:aload_2         
	//  409  811:iconst_0        
	//  410  812:invokevirtual   #281 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//  411  815:pop             
				i = mLayoutState.mOffset;
	//  412  816:aload_0         
	//  413  817:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  414  820:getfield        #445 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  415  823:istore_3        
				j = l;
	//  416  824:iload           6
	//  417  826:istore          4
			}
		}
		k = j;
	//  418  828:iload           4
	//  419  830:istore          5
		l = i;
	//  420  832:iload_3         
	//  421  833:istore          6
		if(getChildCount() > 0)
	//* 422  835:aload_0         
	//* 423  836:invokevirtual   #127 <Method int getChildCount()>
	//* 424  839:ifle            943
			if(mShouldReverseLayout ^ mStackFromEnd)
	//* 425  842:aload_0         
	//* 426  843:getfield        #71  <Field boolean mShouldReverseLayout>
	//* 427  846:aload_0         
	//* 428  847:getfield        #73  <Field boolean mStackFromEnd>
	//* 429  850:ixor            
	//* 430  851:ifeq            901
			{
				l = fixLayoutEndGap(i, recycler, state, true);
	//  431  854:aload_0         
	//  432  855:iload_3         
	//  433  856:aload_1         
	//  434  857:aload_2         
	//  435  858:iconst_1        
	//  436  859:invokespecial   #697 <Method int fixLayoutEndGap(int, RecyclerView$Recycler, RecyclerView$State, boolean)>
	//  437  862:istore          6
				k = j + l;
	//  438  864:iload           4
	//  439  866:iload           6
	//  440  868:iadd            
	//  441  869:istore          5
				j = fixLayoutStartGap(k, recycler, state, false);
	//  442  871:aload_0         
	//  443  872:iload           5
	//  444  874:aload_1         
	//  445  875:aload_2         
	//  446  876:iconst_0        
	//  447  877:invokespecial   #699 <Method int fixLayoutStartGap(int, RecyclerView$Recycler, RecyclerView$State, boolean)>
	//  448  880:istore          4
				k += j;
	//  449  882:iload           5
	//  450  884:iload           4
	//  451  886:iadd            
	//  452  887:istore          5
				l = i + l + j;
	//  453  889:iload_3         
	//  454  890:iload           6
	//  455  892:iadd            
	//  456  893:iload           4
	//  457  895:iadd            
	//  458  896:istore          6
			} else
	//* 459  898:goto            943
			{
				k = fixLayoutStartGap(j, recycler, state, true);
	//  460  901:aload_0         
	//  461  902:iload           4
	//  462  904:aload_1         
	//  463  905:aload_2         
	//  464  906:iconst_1        
	//  465  907:invokespecial   #699 <Method int fixLayoutStartGap(int, RecyclerView$Recycler, RecyclerView$State, boolean)>
	//  466  910:istore          5
				i += k;
	//  467  912:iload_3         
	//  468  913:iload           5
	//  469  915:iadd            
	//  470  916:istore_3        
				l = fixLayoutEndGap(i, recycler, state, false);
	//  471  917:aload_0         
	//  472  918:iload_3         
	//  473  919:aload_1         
	//  474  920:aload_2         
	//  475  921:iconst_0        
	//  476  922:invokespecial   #697 <Method int fixLayoutEndGap(int, RecyclerView$Recycler, RecyclerView$State, boolean)>
	//  477  925:istore          6
				k = j + k + l;
	//  478  927:iload           4
	//  479  929:iload           5
	//  480  931:iadd            
	//  481  932:iload           6
	//  482  934:iadd            
	//  483  935:istore          5
				l = i + l;
	//  484  937:iload_3         
	//  485  938:iload           6
	//  486  940:iadd            
	//  487  941:istore          6
			}
		layoutForPredictiveAnimations(recycler, state, k, l);
	//  488  943:aload_0         
	//  489  944:aload_1         
	//  490  945:aload_2         
	//  491  946:iload           5
	//  492  948:iload           6
	//  493  950:invokespecial   #701 <Method void layoutForPredictiveAnimations(RecyclerView$Recycler, RecyclerView$State, int, int)>
		if(!state.isPreLayout())
	//* 494  953:aload_2         
	//* 495  954:invokevirtual   #219 <Method boolean RecyclerView$State.isPreLayout()>
	//* 496  957:ifne            970
			mOrientationHelper.onLayoutComplete();
	//  497  960:aload_0         
	//  498  961:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  499  964:invokevirtual   #704 <Method void OrientationHelper.onLayoutComplete()>
		else
	//* 500  967:goto            977
			mAnchorInfo.reset();
	//  501  970:aload_0         
	//  502  971:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//  503  974:invokevirtual   #678 <Method void LinearLayoutManager$AnchorInfo.reset()>
		mLastStackFromEnd = mStackFromEnd;
	//  504  977:aload_0         
	//  505  978:aload_0         
	//  506  979:getfield        #73  <Field boolean mStackFromEnd>
	//  507  982:putfield        #380 <Field boolean mLastStackFromEnd>
	//  508  985:return          
	}

	public void onLayoutCompleted(RecyclerView.State state)
	{
		super.onLayoutCompleted(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #708 <Method void RecyclerView$LayoutManager.onLayoutCompleted(RecyclerView$State)>
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
	//   14   25:invokevirtual   #678 <Method void LinearLayoutManager$AnchorInfo.reset()>
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
	//    8   16:invokevirtual   #713 <Method void requestLayout()>
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
	//    7   15:invokespecial   #718 <Method void LinearLayoutManager$SavedState(LinearLayoutManager$SavedState)>
	//    8   18:areturn         
		SavedState savedstate = new SavedState();
	//    9   19:new             #19  <Class LinearLayoutManager$SavedState>
	//   10   22:dup             
	//   11   23:invokespecial   #719 <Method void LinearLayoutManager$SavedState()>
	//   12   26:astore_2        
		if(getChildCount() > 0)
	//*  13   27:aload_0         
	//*  14   28:invokevirtual   #127 <Method int getChildCount()>
	//*  15   31:ifle            130
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
	//*  28   54:ifeq            94
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
			} else
	//*  47   91:goto            128
			{
				View view1 = getChildClosestToStart();
	//   48   94:aload_0         
	//   49   95:invokespecial   #264 <Method View getChildClosestToStart()>
	//   50   98:astore_3        
				savedstate.mAnchorPosition = getPosition(view1);
	//   51   99:aload_2         
	//   52  100:aload_0         
	//   53  101:aload_3         
	//   54  102:invokevirtual   #237 <Method int getPosition(View)>
	//   55  105:putfield        #471 <Field int LinearLayoutManager$SavedState.mAnchorPosition>
				savedstate.mAnchorOffset = mOrientationHelper.getDecoratedStart(view1) - mOrientationHelper.getStartAfterPadding();
	//   56  108:aload_2         
	//   57  109:aload_0         
	//   58  110:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   59  113:aload_3         
	//   60  114:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//   61  117:aload_0         
	//   62  118:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   63  121:invokevirtual   #203 <Method int OrientationHelper.getStartAfterPadding()>
	//   64  124:isub            
	//   65  125:putfield        #407 <Field int LinearLayoutManager$SavedState.mAnchorOffset>
			}
			return ((Parcelable) (savedstate));
	//   66  128:aload_2         
	//   67  129:areturn         
		} else
		{
			savedstate.invalidateAnchor();
	//   68  130:aload_2         
	//   69  131:invokevirtual   #722 <Method void LinearLayoutManager$SavedState.invalidateAnchor()>
			return ((Parcelable) (savedstate));
	//   70  134:aload_2         
	//   71  135:areturn         
		}
	}

	public void prepareForDrop(View view, View view1, int i, int j)
	{
		assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
	//    0    0:aload_0         
	//    1    1:ldc2            #730 <String "Cannot drop a view during a scroll or layout calculation">
	//    2    4:invokevirtual   #731 <Method void assertNotInLayoutOrScroll(String)>
		ensureLayoutState();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #130 <Method void ensureLayoutState()>
		resolveShouldLayoutReverse();
	//    5   11:aload_0         
	//    6   12:invokespecial   #473 <Method void resolveShouldLayoutReverse()>
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
	//*  17   31:icmpge          39
			i = 1;
	//   18   34:iconst_1        
	//   19   35:istore_3        
		else
	//*  20   36:goto            41
			i = -1;
	//   21   39:iconst_m1       
	//   22   40:istore_3        
		if(mShouldReverseLayout)
	//*  23   41:aload_0         
	//*  24   42:getfield        #71  <Field boolean mShouldReverseLayout>
	//*  25   45:ifeq            108
			if(i == 1)
	//*  26   48:iload_3         
	//*  27   49:iconst_1        
	//*  28   50:icmpne          85
			{
				scrollToPositionWithOffset(j, mOrientationHelper.getEndAfterPadding() - (mOrientationHelper.getDecoratedStart(view1) + mOrientationHelper.getDecoratedMeasurement(view)));
	//   29   53:aload_0         
	//   30   54:iload           4
	//   31   56:aload_0         
	//   32   57:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   33   60:invokevirtual   #192 <Method int OrientationHelper.getEndAfterPadding()>
	//   34   63:aload_0         
	//   35   64:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   36   67:aload_2         
	//   37   68:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//   38   71:aload_0         
	//   39   72:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   40   75:aload_1         
	//   41   76:invokevirtual   #256 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   42   79:iadd            
	//   43   80:isub            
	//   44   81:invokevirtual   #734 <Method void scrollToPositionWithOffset(int, int)>
				return;
	//   45   84:return          
			} else
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
	//   56  104:invokevirtual   #734 <Method void scrollToPositionWithOffset(int, int)>
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
	//   67  124:invokevirtual   #734 <Method void scrollToPositionWithOffset(int, int)>
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
	//   80  148:invokevirtual   #734 <Method void scrollToPositionWithOffset(int, int)>
			return;
	//   81  151:return          
		}
	}

	boolean resolveIsInfinite()
	{
		return mOrientationHelper.getMode() == 0 && mOrientationHelper.getEnd() == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//    2    4:invokevirtual   #738 <Method int OrientationHelper.getMode()>
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
		byte byte0;
		if(i > 0)
	//*  13   25:iload_1         
	//*  14   26:ifle            35
			byte0 = 1;
	//   15   29:iconst_1        
	//   16   30:istore          4
		else
	//*  17   32:goto            38
			byte0 = -1;
	//   18   35:iconst_m1       
	//   19   36:istore          4
		int j = Math.abs(i);
	//   20   38:iload_1         
	//   21   39:invokestatic    #460 <Method int Math.abs(int)>
	//   22   42:istore          5
		updateLayoutState(((int) (byte0)), j, true, state);
	//   23   44:aload_0         
	//   24   45:iload           4
	//   25   47:iload           5
	//   26   49:iconst_1        
	//   27   50:aload_3         
	//   28   51:invokespecial   #462 <Method void updateLayoutState(int, int, boolean, RecyclerView$State)>
		int k = mLayoutState.mScrollingOffset + fill(recycler, mLayoutState, state, false);
	//   29   54:aload_0         
	//   30   55:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   31   58:getfield        #332 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//   32   61:aload_0         
	//   33   62:aload_2         
	//   34   63:aload_0         
	//   35   64:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   36   67:aload_3         
	//   37   68:iconst_0        
	//   38   69:invokevirtual   #281 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//   39   72:iadd            
	//   40   73:istore          6
		if(k < 0)
	//*  41   75:iload           6
	//*  42   77:ifge            82
			return 0;
	//   43   80:iconst_0        
	//   44   81:ireturn         
		if(j > k)
	//*  45   82:iload           5
	//*  46   84:iload           6
	//*  47   86:icmple          98
			i = byte0 * k;
	//   48   89:iload           4
	//   49   91:iload           6
	//   50   93:imul            
	//   51   94:istore_1        
	//*  52   95:goto            98
		mOrientationHelper.offsetChildren(-i);
	//   53   98:aload_0         
	//   54   99:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   55  102:iload_1         
	//   56  103:ineg            
	//   57  104:invokevirtual   #199 <Method void OrientationHelper.offsetChildren(int)>
		mLayoutState.mLastScrollDelta = i;
	//   58  107:aload_0         
	//   59  108:getfield        #258 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   60  111:iload_1         
	//   61  112:putfield        #683 <Field int LinearLayoutManager$LayoutState.mLastScrollDelta>
		return i;
	//   62  115:iload_1         
	//   63  116:ireturn         
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
	//   11   22:invokevirtual   #722 <Method void LinearLayoutManager$SavedState.invalidateAnchor()>
		requestLayout();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #713 <Method void requestLayout()>
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
	//   11   21:invokevirtual   #722 <Method void LinearLayoutManager$SavedState.invalidateAnchor()>
		requestLayout();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #713 <Method void requestLayout()>
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
		mInitialItemPrefetchCount = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #91  <Field int mInitialItemPrefetchCount>
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
	//    5    9:new             #744 <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:new             #297 <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #298 <Method void StringBuilder()>
	//   10   20:ldc2            #746 <String "invalid orientation:">
	//   11   23:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//   12   26:iload_1         
	//   13   27:invokevirtual   #307 <Method StringBuilder StringBuilder.append(int)>
	//   14   30:invokevirtual   #316 <Method String StringBuilder.toString()>
	//   15   33:invokespecial   #748 <Method void IllegalArgumentException(String)>
	//   16   36:athrow          
		assertNotInLayoutOrScroll(((String) (null)));
	//   17   37:aload_0         
	//   18   38:aconst_null     
	//   19   39:invokevirtual   #731 <Method void assertNotInLayoutOrScroll(String)>
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
	//   32   62:invokevirtual   #713 <Method void requestLayout()>
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
	//    2    2:invokevirtual   #731 <Method void assertNotInLayoutOrScroll(String)>
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
	//   12   20:invokevirtual   #713 <Method void requestLayout()>
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
	//    2    2:invokevirtual   #731 <Method void assertNotInLayoutOrScroll(String)>
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
	//   12   20:invokevirtual   #713 <Method void requestLayout()>
			return;
	//   13   23:return          
		}
	}

	boolean shouldMeasureTwice()
	{
		return getHeightMode() != 0x40000000 && getWidthMode() != 0x40000000 && hasFlexibleChildInBothOrientations();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #754 <Method int getHeightMode()>
	//    2    4:ldc2            #755 <Int 0x40000000>
	//    3    7:icmpeq          29
	//    4   10:aload_0         
	//    5   11:invokevirtual   #758 <Method int getWidthMode()>
	//    6   14:ldc2            #755 <Int 0x40000000>
	//    7   17:icmpeq          29
	//    8   20:aload_0         
	//    9   21:invokevirtual   #761 <Method boolean hasFlexibleChildInBothOrientations()>
	//   10   24:ifeq            29
	//   11   27:iconst_1        
	//   12   28:ireturn         
	//   13   29:iconst_0        
	//   14   30:ireturn         
	}

	public void smoothScrollToPosition(RecyclerView recyclerview, RecyclerView.State state, int i)
	{
		recyclerview = ((RecyclerView) (new LinearSmoothScroller(recyclerview.getContext())));
	//    0    0:new             #765 <Class LinearSmoothScroller>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #771 <Method Context RecyclerView.getContext()>
	//    4    8:invokespecial   #773 <Method void LinearSmoothScroller(Context)>
	//    5   11:astore_1        
		((LinearSmoothScroller) (recyclerview)).setTargetPosition(i);
	//    6   12:aload_1         
	//    7   13:iload_3         
	//    8   14:invokevirtual   #776 <Method void LinearSmoothScroller.setTargetPosition(int)>
		startSmoothScroll(((RecyclerView.SmoothScroller) (recyclerview)));
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #780 <Method void startSmoothScroll(RecyclerView$SmoothScroller)>
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
		Log.d("LinearLayoutManager", (new StringBuilder()).append("validating child count ").append(getChildCount()).toString());
	//    0    0:ldc1            #36  <String "LinearLayoutManager">
	//    1    2:new             #297 <Class StringBuilder>
	//    2    5:dup             
	//    3    6:invokespecial   #298 <Method void StringBuilder()>
	//    4    9:ldc2            #783 <String "validating child count ">
	//    5   12:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload_0         
	//    7   16:invokevirtual   #127 <Method int getChildCount()>
	//    8   19:invokevirtual   #307 <Method StringBuilder StringBuilder.append(int)>
	//    9   22:invokevirtual   #316 <Method String StringBuilder.toString()>
	//   10   25:invokestatic    #295 <Method int Log.d(String, String)>
	//   11   28:pop             
		if(getChildCount() < 1)
	//*  12   29:aload_0         
	//*  13   30:invokevirtual   #127 <Method int getChildCount()>
	//*  14   33:iconst_1        
	//*  15   34:icmpge          38
			return;
	//   16   37:return          
		int k = getPosition(getChildAt(0));
	//   17   38:aload_0         
	//   18   39:aload_0         
	//   19   40:iconst_0        
	//   20   41:invokevirtual   #209 <Method View getChildAt(int)>
	//   21   44:invokevirtual   #237 <Method int getPosition(View)>
	//   22   47:istore_2        
		int l = mOrientationHelper.getDecoratedStart(getChildAt(0));
	//   23   48:aload_0         
	//   24   49:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   25   52:aload_0         
	//   26   53:iconst_0        
	//   27   54:invokevirtual   #209 <Method View getChildAt(int)>
	//   28   57:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//   29   60:istore_3        
		if(mShouldReverseLayout)
	//*  30   61:aload_0         
	//*  31   62:getfield        #71  <Field boolean mShouldReverseLayout>
	//*  32   65:ifeq            191
		{
			for(int i = 1; i < getChildCount(); i++)
	//*  33   68:iconst_1        
	//*  34   69:istore_1        
	//*  35   70:iload_1         
	//*  36   71:aload_0         
	//*  37   72:invokevirtual   #127 <Method int getChildCount()>
	//*  38   75:icmpge          190
			{
				View view = getChildAt(i);
	//   39   78:aload_0         
	//   40   79:iload_1         
	//   41   80:invokevirtual   #209 <Method View getChildAt(int)>
	//   42   83:astore          7
				int i1 = getPosition(view);
	//   43   85:aload_0         
	//   44   86:aload           7
	//   45   88:invokevirtual   #237 <Method int getPosition(View)>
	//   46   91:istore          4
				int k1 = mOrientationHelper.getDecoratedStart(view);
	//   47   93:aload_0         
	//   48   94:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//   49   97:aload           7
	//   50   99:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//   51  102:istore          5
				if(i1 < k)
	//*  52  104:iload           4
	//*  53  106:iload_2         
	//*  54  107:icmpge          162
				{
					logChildren();
	//   55  110:aload_0         
	//   56  111:invokespecial   #785 <Method void logChildren()>
					StringBuilder stringbuilder = (new StringBuilder()).append("detected invalid position. loc invalid? ");
	//   57  114:new             #297 <Class StringBuilder>
	//   58  117:dup             
	//   59  118:invokespecial   #298 <Method void StringBuilder()>
	//   60  121:ldc2            #787 <String "detected invalid position. loc invalid? ">
	//   61  124:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//   62  127:astore          7
					boolean flag;
					if(k1 < l)
	//*  63  129:iload           5
	//*  64  131:iload_3         
	//*  65  132:icmpge          141
						flag = true;
	//   66  135:iconst_1        
	//   67  136:istore          6
					else
	//*  68  138:goto            144
						flag = false;
	//   69  141:iconst_0        
	//   70  142:istore          6
					throw new RuntimeException(stringbuilder.append(flag).toString());
	//   71  144:new             #789 <Class RuntimeException>
	//   72  147:dup             
	//   73  148:aload           7
	//   74  150:iload           6
	//   75  152:invokevirtual   #792 <Method StringBuilder StringBuilder.append(boolean)>
	//   76  155:invokevirtual   #316 <Method String StringBuilder.toString()>
	//   77  158:invokespecial   #793 <Method void RuntimeException(String)>
	//   78  161:athrow          
				}
				if(k1 > l)
	//*  79  162:iload           5
	//*  80  164:iload_3         
	//*  81  165:icmple          183
				{
					logChildren();
	//   82  168:aload_0         
	//   83  169:invokespecial   #785 <Method void logChildren()>
					throw new RuntimeException("detected invalid location");
	//   84  172:new             #789 <Class RuntimeException>
	//   85  175:dup             
	//   86  176:ldc2            #795 <String "detected invalid location">
	//   87  179:invokespecial   #793 <Method void RuntimeException(String)>
	//   88  182:athrow          
				}
			}

	//   89  183:iload_1         
	//   90  184:iconst_1        
	//   91  185:iadd            
	//   92  186:istore_1        
	//*  93  187:goto            70
			return;
	//   94  190:return          
		}
		for(int j = 1; j < getChildCount(); j++)
	//*  95  191:iconst_1        
	//*  96  192:istore_1        
	//*  97  193:iload_1         
	//*  98  194:aload_0         
	//*  99  195:invokevirtual   #127 <Method int getChildCount()>
	//* 100  198:icmpge          313
		{
			View view1 = getChildAt(j);
	//  101  201:aload_0         
	//  102  202:iload_1         
	//  103  203:invokevirtual   #209 <Method View getChildAt(int)>
	//  104  206:astore          7
			int j1 = getPosition(view1);
	//  105  208:aload_0         
	//  106  209:aload           7
	//  107  211:invokevirtual   #237 <Method int getPosition(View)>
	//  108  214:istore          4
			int l1 = mOrientationHelper.getDecoratedStart(view1);
	//  109  216:aload_0         
	//  110  217:getfield        #132 <Field OrientationHelper mOrientationHelper>
	//  111  220:aload           7
	//  112  222:invokevirtual   #312 <Method int OrientationHelper.getDecoratedStart(View)>
	//  113  225:istore          5
			if(j1 < k)
	//* 114  227:iload           4
	//* 115  229:iload_2         
	//* 116  230:icmpge          285
			{
				logChildren();
	//  117  233:aload_0         
	//  118  234:invokespecial   #785 <Method void logChildren()>
				StringBuilder stringbuilder1 = (new StringBuilder()).append("detected invalid position. loc invalid? ");
	//  119  237:new             #297 <Class StringBuilder>
	//  120  240:dup             
	//  121  241:invokespecial   #298 <Method void StringBuilder()>
	//  122  244:ldc2            #787 <String "detected invalid position. loc invalid? ">
	//  123  247:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//  124  250:astore          7
				boolean flag1;
				if(l1 < l)
	//* 125  252:iload           5
	//* 126  254:iload_3         
	//* 127  255:icmpge          264
					flag1 = true;
	//  128  258:iconst_1        
	//  129  259:istore          6
				else
	//* 130  261:goto            267
					flag1 = false;
	//  131  264:iconst_0        
	//  132  265:istore          6
				throw new RuntimeException(stringbuilder1.append(flag1).toString());
	//  133  267:new             #789 <Class RuntimeException>
	//  134  270:dup             
	//  135  271:aload           7
	//  136  273:iload           6
	//  137  275:invokevirtual   #792 <Method StringBuilder StringBuilder.append(boolean)>
	//  138  278:invokevirtual   #316 <Method String StringBuilder.toString()>
	//  139  281:invokespecial   #793 <Method void RuntimeException(String)>
	//  140  284:athrow          
			}
			if(l1 < l)
	//* 141  285:iload           5
	//* 142  287:iload_3         
	//* 143  288:icmpge          306
			{
				logChildren();
	//  144  291:aload_0         
	//  145  292:invokespecial   #785 <Method void logChildren()>
				throw new RuntimeException("detected invalid location");
	//  146  295:new             #789 <Class RuntimeException>
	//  147  298:dup             
	//  148  299:ldc2            #795 <String "detected invalid location">
	//  149  302:invokespecial   #793 <Method void RuntimeException(String)>
	//  150  305:athrow          
			}
		}

	//  151  306:iload_1         
	//  152  307:iconst_1        
	//  153  308:iadd            
	//  154  309:istore_1        
	//* 155  310:goto            193
	//  156  313:return          
	}

	static final boolean DEBUG = false;
	public static final int HORIZONTAL = 0;
	public static final int INVALID_OFFSET = 0x80000000;
	private static final float MAX_SCROLL_FACTOR = 0.3333333F;
	private static final String TAG = "LinearLayoutManager";
	public static final int VERTICAL = 1;
	final AnchorInfo mAnchorInfo;
	private int mInitialItemPrefetchCount;
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
