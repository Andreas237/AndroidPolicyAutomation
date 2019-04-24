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
	implements android.support.v7.widget.helper.ItemTouchHelper.ViewDropHandler, RecyclerView.SmoothScroller.ScrollVectorProvider
{
	static class AnchorInfo
	{

		void assignCoordinateFromPadding()
		{
			int i;
			if(mLayoutFromEnd)
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field boolean mLayoutFromEnd>
		//*   2    4:ifeq            18
				i = mOrientationHelper.getEndAfterPadding();
		//    3    7:aload_0         
		//    4    8:getfield        #28  <Field OrientationHelper mOrientationHelper>
		//    5   11:invokevirtual   #34  <Method int OrientationHelper.getEndAfterPadding()>
		//    6   14:istore_1        
			else
		//*   7   15:goto            26
				i = mOrientationHelper.getStartAfterPadding();
		//    8   18:aload_0         
		//    9   19:getfield        #28  <Field OrientationHelper mOrientationHelper>
		//   10   22:invokevirtual   #37  <Method int OrientationHelper.getStartAfterPadding()>
		//   11   25:istore_1        
			mCoordinate = i;
		//   12   26:aload_0         
		//   13   27:iload_1         
		//   14   28:putfield        #39  <Field int mCoordinate>
		//   15   31:return          
		}

		public void assignFromView(View view, int i)
		{
			if(mLayoutFromEnd)
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field boolean mLayoutFromEnd>
		//*   2    4:ifeq            30
				mCoordinate = mOrientationHelper.getDecoratedEnd(view) + mOrientationHelper.getTotalSpaceChange();
		//    3    7:aload_0         
		//    4    8:aload_0         
		//    5    9:getfield        #28  <Field OrientationHelper mOrientationHelper>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #45  <Method int OrientationHelper.getDecoratedEnd(View)>
		//    8   16:aload_0         
		//    9   17:getfield        #28  <Field OrientationHelper mOrientationHelper>
		//   10   20:invokevirtual   #48  <Method int OrientationHelper.getTotalSpaceChange()>
		//   11   23:iadd            
		//   12   24:putfield        #39  <Field int mCoordinate>
			else
		//*  13   27:goto            42
				mCoordinate = mOrientationHelper.getDecoratedStart(view);
		//   14   30:aload_0         
		//   15   31:aload_0         
		//   16   32:getfield        #28  <Field OrientationHelper mOrientationHelper>
		//   17   35:aload_1         
		//   18   36:invokevirtual   #51  <Method int OrientationHelper.getDecoratedStart(View)>
		//   19   39:putfield        #39  <Field int mCoordinate>
			mPosition = i;
		//   20   42:aload_0         
		//   21   43:iload_2         
		//   22   44:putfield        #53  <Field int mPosition>
		//   23   47:return          
		}

		public void assignFromViewAndKeepVisibleRect(View view, int i)
		{
			int j = mOrientationHelper.getTotalSpaceChange();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field OrientationHelper mOrientationHelper>
		//    2    4:invokevirtual   #48  <Method int OrientationHelper.getTotalSpaceChange()>
		//    3    7:istore_3        
			if(j >= 0)
		//*   4    8:iload_3         
		//*   5    9:iflt            19
			{
				assignFromView(view, i);
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:iload_2         
		//    9   15:invokevirtual   #56  <Method void assignFromView(View, int)>
				return;
		//   10   18:return          
			}
			mPosition = i;
		//   11   19:aload_0         
		//   12   20:iload_2         
		//   13   21:putfield        #53  <Field int mPosition>
			if(mLayoutFromEnd)
		//*  14   24:aload_0         
		//*  15   25:getfield        #26  <Field boolean mLayoutFromEnd>
		//*  16   28:ifeq            135
			{
				i = mOrientationHelper.getEndAfterPadding() - j - mOrientationHelper.getDecoratedEnd(view);
		//   17   31:aload_0         
		//   18   32:getfield        #28  <Field OrientationHelper mOrientationHelper>
		//   19   35:invokevirtual   #34  <Method int OrientationHelper.getEndAfterPadding()>
		//   20   38:iload_3         
		//   21   39:isub            
		//   22   40:aload_0         
		//   23   41:getfield        #28  <Field OrientationHelper mOrientationHelper>
		//   24   44:aload_1         
		//   25   45:invokevirtual   #45  <Method int OrientationHelper.getDecoratedEnd(View)>
		//   26   48:isub            
		//   27   49:istore_2        
				mCoordinate = mOrientationHelper.getEndAfterPadding() - i;
		//   28   50:aload_0         
		//   29   51:aload_0         
		//   30   52:getfield        #28  <Field OrientationHelper mOrientationHelper>
		//   31   55:invokevirtual   #34  <Method int OrientationHelper.getEndAfterPadding()>
		//   32   58:iload_2         
		//   33   59:isub            
		//   34   60:putfield        #39  <Field int mCoordinate>
				if(i > 0)
		//*  35   63:iload_2         
		//*  36   64:ifle            240
				{
					j = mOrientationHelper.getDecoratedMeasurement(view);
		//   37   67:aload_0         
		//   38   68:getfield        #28  <Field OrientationHelper mOrientationHelper>
		//   39   71:aload_1         
		//   40   72:invokevirtual   #59  <Method int OrientationHelper.getDecoratedMeasurement(View)>
		//   41   75:istore_3        
					int k = mCoordinate;
		//   42   76:aload_0         
		//   43   77:getfield        #39  <Field int mCoordinate>
		//   44   80:istore          4
					int i1 = mOrientationHelper.getStartAfterPadding();
		//   45   82:aload_0         
		//   46   83:getfield        #28  <Field OrientationHelper mOrientationHelper>
		//   47   86:invokevirtual   #37  <Method int OrientationHelper.getStartAfterPadding()>
		//   48   89:istore          5
					j = k - j - (i1 + Math.min(mOrientationHelper.getDecoratedStart(view) - i1, 0));
		//   49   91:iload           4
		//   50   93:iload_3         
		//   51   94:isub            
		//   52   95:iload           5
		//   53   97:aload_0         
		//   54   98:getfield        #28  <Field OrientationHelper mOrientationHelper>
		//   55  101:aload_1         
		//   56  102:invokevirtual   #51  <Method int OrientationHelper.getDecoratedStart(View)>
		//   57  105:iload           5
		//   58  107:isub            
		//   59  108:iconst_0        
		//   60  109:invokestatic    #65  <Method int Math.min(int, int)>
		//   61  112:iadd            
		//   62  113:isub            
		//   63  114:istore_3        
					if(j < 0)
		//*  64  115:iload_3         
		//*  65  116:ifge            240
					{
						mCoordinate = mCoordinate + Math.min(i, -j);
		//   66  119:aload_0         
		//   67  120:aload_0         
		//   68  121:getfield        #39  <Field int mCoordinate>
		//   69  124:iload_2         
		//   70  125:iload_3         
		//   71  126:ineg            
		//   72  127:invokestatic    #65  <Method int Math.min(int, int)>
		//   73  130:iadd            
		//   74  131:putfield        #39  <Field int mCoordinate>
						return;
		//   75  134:return          
					}
				}
			} else
			{
				int l = mOrientationHelper.getDecoratedStart(view);
		//   76  135:aload_0         
		//   77  136:getfield        #28  <Field OrientationHelper mOrientationHelper>
		//   78  139:aload_1         
		//   79  140:invokevirtual   #51  <Method int OrientationHelper.getDecoratedStart(View)>
		//   80  143:istore          4
				i = l - mOrientationHelper.getStartAfterPadding();
		//   81  145:iload           4
		//   82  147:aload_0         
		//   83  148:getfield        #28  <Field OrientationHelper mOrientationHelper>
		//   84  151:invokevirtual   #37  <Method int OrientationHelper.getStartAfterPadding()>
		//   85  154:isub            
		//   86  155:istore_2        
				mCoordinate = l;
		//   87  156:aload_0         
		//   88  157:iload           4
		//   89  159:putfield        #39  <Field int mCoordinate>
				if(i > 0)
		//*  90  162:iload_2         
		//*  91  163:ifle            240
				{
					int j1 = mOrientationHelper.getDecoratedMeasurement(view);
		//   92  166:aload_0         
		//   93  167:getfield        #28  <Field OrientationHelper mOrientationHelper>
		//   94  170:aload_1         
		//   95  171:invokevirtual   #59  <Method int OrientationHelper.getDecoratedMeasurement(View)>
		//   96  174:istore          5
					int k1 = mOrientationHelper.getEndAfterPadding();
		//   97  176:aload_0         
		//   98  177:getfield        #28  <Field OrientationHelper mOrientationHelper>
		//   99  180:invokevirtual   #34  <Method int OrientationHelper.getEndAfterPadding()>
		//  100  183:istore          6
					int l1 = mOrientationHelper.getDecoratedEnd(view);
		//  101  185:aload_0         
		//  102  186:getfield        #28  <Field OrientationHelper mOrientationHelper>
		//  103  189:aload_1         
		//  104  190:invokevirtual   #45  <Method int OrientationHelper.getDecoratedEnd(View)>
		//  105  193:istore          7
					j = mOrientationHelper.getEndAfterPadding() - Math.min(0, k1 - j - l1) - (l + j1);
		//  106  195:aload_0         
		//  107  196:getfield        #28  <Field OrientationHelper mOrientationHelper>
		//  108  199:invokevirtual   #34  <Method int OrientationHelper.getEndAfterPadding()>
		//  109  202:iconst_0        
		//  110  203:iload           6
		//  111  205:iload_3         
		//  112  206:isub            
		//  113  207:iload           7
		//  114  209:isub            
		//  115  210:invokestatic    #65  <Method int Math.min(int, int)>
		//  116  213:isub            
		//  117  214:iload           4
		//  118  216:iload           5
		//  119  218:iadd            
		//  120  219:isub            
		//  121  220:istore_3        
					if(j < 0)
		//* 122  221:iload_3         
		//* 123  222:ifge            240
						mCoordinate = mCoordinate - Math.min(i, -j);
		//  124  225:aload_0         
		//  125  226:aload_0         
		//  126  227:getfield        #39  <Field int mCoordinate>
		//  127  230:iload_2         
		//  128  231:iload_3         
		//  129  232:ineg            
		//  130  233:invokestatic    #65  <Method int Math.min(int, int)>
		//  131  236:isub            
		//  132  237:putfield        #39  <Field int mCoordinate>
				}
			}
		//  133  240:return          
		}

		boolean isViewValidAsAnchor(View view, RecyclerView.State state)
		{
			view = ((View) ((RecyclerView.LayoutParams)view.getLayoutParams()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #73  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #75  <Class RecyclerView$LayoutParams>
		//    3    7:astore_1        
			return !((RecyclerView.LayoutParams) (view)).isItemRemoved() && ((RecyclerView.LayoutParams) (view)).getViewLayoutPosition() >= 0 && ((RecyclerView.LayoutParams) (view)).getViewLayoutPosition() < state.getItemCount();
		//    4    8:aload_1         
		//    5    9:invokevirtual   #79  <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
		//    6   12:ifne            35
		//    7   15:aload_1         
		//    8   16:invokevirtual   #82  <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
		//    9   19:iflt            35
		//   10   22:aload_1         
		//   11   23:invokevirtual   #82  <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
		//   12   26:aload_2         
		//   13   27:invokevirtual   #87  <Method int RecyclerView$State.getItemCount()>
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
		//    2    2:putfield        #53  <Field int mPosition>
			mCoordinate = 0x80000000;
		//    3    5:aload_0         
		//    4    6:ldc1            #88  <Int 0x80000000>
		//    5    8:putfield        #39  <Field int mCoordinate>
			mLayoutFromEnd = false;
		//    6   11:aload_0         
		//    7   12:iconst_0        
		//    8   13:putfield        #26  <Field boolean mLayoutFromEnd>
			mValid = false;
		//    9   16:aload_0         
		//   10   17:iconst_0        
		//   11   18:putfield        #90  <Field boolean mValid>
		//   12   21:return          
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #94  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #95  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("AnchorInfo{mPosition=");
		//    4    8:aload_1         
		//    5    9:ldc1            #97  <String "AnchorInfo{mPosition=">
		//    6   11:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(mPosition);
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #53  <Field int mPosition>
		//   11   20:invokevirtual   #104 <Method StringBuilder StringBuilder.append(int)>
		//   12   23:pop             
			stringbuilder.append(", mCoordinate=");
		//   13   24:aload_1         
		//   14   25:ldc1            #106 <String ", mCoordinate=">
		//   15   27:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
		//   16   30:pop             
			stringbuilder.append(mCoordinate);
		//   17   31:aload_1         
		//   18   32:aload_0         
		//   19   33:getfield        #39  <Field int mCoordinate>
		//   20   36:invokevirtual   #104 <Method StringBuilder StringBuilder.append(int)>
		//   21   39:pop             
			stringbuilder.append(", mLayoutFromEnd=");
		//   22   40:aload_1         
		//   23   41:ldc1            #108 <String ", mLayoutFromEnd=">
		//   24   43:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
		//   25   46:pop             
			stringbuilder.append(mLayoutFromEnd);
		//   26   47:aload_1         
		//   27   48:aload_0         
		//   28   49:getfield        #26  <Field boolean mLayoutFromEnd>
		//   29   52:invokevirtual   #111 <Method StringBuilder StringBuilder.append(boolean)>
		//   30   55:pop             
			stringbuilder.append(", mValid=");
		//   31   56:aload_1         
		//   32   57:ldc1            #113 <String ", mValid=">
		//   33   59:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
		//   34   62:pop             
			stringbuilder.append(mValid);
		//   35   63:aload_1         
		//   36   64:aload_0         
		//   37   65:getfield        #90  <Field boolean mValid>
		//   38   68:invokevirtual   #111 <Method StringBuilder StringBuilder.append(boolean)>
		//   39   71:pop             
			stringbuilder.append('}');
		//   40   72:aload_1         
		//   41   73:bipush          125
		//   42   75:invokevirtual   #116 <Method StringBuilder StringBuilder.append(char)>
		//   43   78:pop             
			return stringbuilder.toString();
		//   44   79:aload_1         
		//   45   80:invokevirtual   #118 <Method String StringBuilder.toString()>
		//   46   83:areturn         
		}

		int mCoordinate;
		boolean mLayoutFromEnd;
		OrientationHelper mOrientationHelper;
		int mPosition;
		boolean mValid;

		AnchorInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			reset();
		//    2    4:aload_0         
		//    3    5:invokevirtual   #22  <Method void reset()>
		//    4    8:return          
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
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #102 <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #103 <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("avail:");
		//    4    8:aload_1         
		//    5    9:ldc1            #105 <String "avail:">
		//    6   11:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(mAvailable);
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #111 <Field int mAvailable>
		//   11   20:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
		//   12   23:pop             
			stringbuilder.append(", ind:");
		//   13   24:aload_1         
		//   14   25:ldc1            #116 <String ", ind:">
		//   15   27:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
		//   16   30:pop             
			stringbuilder.append(mCurrentPosition);
		//   17   31:aload_1         
		//   18   32:aload_0         
		//   19   33:getfield        #81  <Field int mCurrentPosition>
		//   20   36:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
		//   21   39:pop             
			stringbuilder.append(", dir:");
		//   22   40:aload_1         
		//   23   41:ldc1            #118 <String ", dir:">
		//   24   43:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
		//   25   46:pop             
			stringbuilder.append(mItemDirection);
		//   26   47:aload_1         
		//   27   48:aload_0         
		//   28   49:getfield        #120 <Field int mItemDirection>
		//   29   52:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
		//   30   55:pop             
			stringbuilder.append(", offset:");
		//   31   56:aload_1         
		//   32   57:ldc1            #122 <String ", offset:">
		//   33   59:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
		//   34   62:pop             
			stringbuilder.append(mOffset);
		//   35   63:aload_1         
		//   36   64:aload_0         
		//   37   65:getfield        #124 <Field int mOffset>
		//   38   68:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
		//   39   71:pop             
			stringbuilder.append(", layoutDir:");
		//   40   72:aload_1         
		//   41   73:ldc1            #126 <String ", layoutDir:">
		//   42   75:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
		//   43   78:pop             
			stringbuilder.append(mLayoutDirection);
		//   44   79:aload_1         
		//   45   80:aload_0         
		//   46   81:getfield        #128 <Field int mLayoutDirection>
		//   47   84:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
		//   48   87:pop             
			Log.d("LLM#LayoutState", stringbuilder.toString());
		//   49   88:ldc1            #21  <String "LLM#LayoutState">
		//   50   90:aload_1         
		//   51   91:invokevirtual   #132 <Method String StringBuilder.toString()>
		//   52   94:invokestatic    #138 <Method int Log.d(String, String)>
		//   53   97:pop             
		//   54   98:return          
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
			View view1 = null;
		//    4   11:aconst_null     
		//    5   12:astore          7
			int j = 0x7fffffff;
		//    6   14:ldc1            #149 <Int 0x7fffffff>
		//    7   16:istore_3        
			for(int i = 0; i < i1;)
		//*   8   17:iconst_0        
		//*   9   18:istore_2        
		//*  10   19:iload_2         
		//*  11   20:iload           6
		//*  12   22:icmpge          159
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
				View view2 = view1;
		//   24   53:aload           7
		//   25   55:astore          8
				int k = j;
		//   26   57:iload_3         
		//   27   58:istore          4
				if(view3 != view)
		//*  28   60:aload           9
		//*  29   62:aload_1         
		//*  30   63:if_acmpeq       145
					if(layoutparams.isItemRemoved())
		//*  31   66:aload           10
		//*  32   68:invokevirtual   #79  <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
		//*  33   71:ifeq            84
					{
						view2 = view1;
		//   34   74:aload           7
		//   35   76:astore          8
						k = j;
		//   36   78:iload_3         
		//   37   79:istore          4
					} else
		//*  38   81:goto            145
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
							view2 = view1;
		//   50  106:aload           7
		//   51  108:astore          8
							k = j;
		//   52  110:iload_3         
		//   53  111:istore          4
						} else
		//*  54  113:goto            145
						{
							view2 = view1;
		//   55  116:aload           7
		//   56  118:astore          8
							k = j;
		//   57  120:iload_3         
		//   58  121:istore          4
							if(l < j)
		//*  59  123:iload           5
		//*  60  125:iload_3         
		//*  61  126:icmpge          145
							{
								if(l == 0)
		//*  62  129:iload           5
		//*  63  131:ifne            137
									return view3;
		//   64  134:aload           9
		//   65  136:areturn         
								view2 = view3;
		//   66  137:aload           9
		//   67  139:astore          8
								k = l;
		//   68  141:iload           5
		//   69  143:istore          4
							}
						}
					}
				i++;
		//   70  145:iload_2         
		//   71  146:iconst_1        
		//   72  147:iadd            
		//   73  148:istore_2        
				view1 = view2;
		//   74  149:aload           8
		//   75  151:astore          7
				j = k;
		//   76  153:iload           4
		//   77  155:istore_3        
			}

		//*  78  156:goto            19
			return view1;
		//   79  159:aload           7
		//   80  161:areturn         
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
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #54  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #56  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #61  <Method void Runtime(String)>
		//    4    9:athrow          
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
			int i = parcel.readInt();
		//   10   20:aload_1         
		//   11   21:invokevirtual   #39  <Method int Parcel.readInt()>
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
			mAnchorLayoutFromEnd = flag;
		//   21   37:aload_0         
		//   22   38:iload_3         
		//   23   39:putfield        #45  <Field boolean mAnchorLayoutFromEnd>
		//   24   42:return          
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
		mOrientation = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #69  <Field int mOrientation>
		mReverseLayout = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #71  <Field boolean mReverseLayout>
		mShouldReverseLayout = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #73  <Field boolean mShouldReverseLayout>
		mStackFromEnd = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #75  <Field boolean mStackFromEnd>
		mSmoothScrollbarEnabled = true;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #77  <Field boolean mSmoothScrollbarEnabled>
		mPendingScrollPosition = -1;
	//   17   29:aload_0         
	//   18   30:iconst_m1       
	//   19   31:putfield        #79  <Field int mPendingScrollPosition>
		mPendingScrollPositionOffset = 0x80000000;
	//   20   34:aload_0         
	//   21   35:ldc1            #29  <Int 0x80000000>
	//   22   37:putfield        #81  <Field int mPendingScrollPositionOffset>
		mPendingSavedState = null;
	//   23   40:aload_0         
	//   24   41:aconst_null     
	//   25   42:putfield        #83  <Field LinearLayoutManager$SavedState mPendingSavedState>
		mAnchorInfo = new AnchorInfo();
	//   26   45:aload_0         
	//   27   46:new             #10  <Class LinearLayoutManager$AnchorInfo>
	//   28   49:dup             
	//   29   50:invokespecial   #84  <Method void LinearLayoutManager$AnchorInfo()>
	//   30   53:putfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
		mLayoutChunkResult = new LayoutChunkResult();
	//   31   56:aload_0         
	//   32   57:new             #13  <Class LinearLayoutManager$LayoutChunkResult>
	//   33   60:dup             
	//   34   61:invokespecial   #87  <Method void LinearLayoutManager$LayoutChunkResult()>
	//   35   64:putfield        #89  <Field LinearLayoutManager$LayoutChunkResult mLayoutChunkResult>
		mInitialPrefetchItemCount = 2;
	//   36   67:aload_0         
	//   37   68:iconst_2        
	//   38   69:putfield        #91  <Field int mInitialPrefetchItemCount>
		setOrientation(i);
	//   39   72:aload_0         
	//   40   73:iload_2         
	//   41   74:invokevirtual   #95  <Method void setOrientation(int)>
		setReverseLayout(flag);
	//   42   77:aload_0         
	//   43   78:iload_3         
	//   44   79:invokevirtual   #99  <Method void setReverseLayout(boolean)>
	//   45   82:return          
	}

	public LinearLayoutManager(Context context, AttributeSet attributeset, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void RecyclerView$LayoutManager()>
		mOrientation = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #69  <Field int mOrientation>
		mReverseLayout = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #71  <Field boolean mReverseLayout>
		mShouldReverseLayout = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #73  <Field boolean mShouldReverseLayout>
		mStackFromEnd = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #75  <Field boolean mStackFromEnd>
		mSmoothScrollbarEnabled = true;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #77  <Field boolean mSmoothScrollbarEnabled>
		mPendingScrollPosition = -1;
	//   17   29:aload_0         
	//   18   30:iconst_m1       
	//   19   31:putfield        #79  <Field int mPendingScrollPosition>
		mPendingScrollPositionOffset = 0x80000000;
	//   20   34:aload_0         
	//   21   35:ldc1            #29  <Int 0x80000000>
	//   22   37:putfield        #81  <Field int mPendingScrollPositionOffset>
		mPendingSavedState = null;
	//   23   40:aload_0         
	//   24   41:aconst_null     
	//   25   42:putfield        #83  <Field LinearLayoutManager$SavedState mPendingSavedState>
		mAnchorInfo = new AnchorInfo();
	//   26   45:aload_0         
	//   27   46:new             #10  <Class LinearLayoutManager$AnchorInfo>
	//   28   49:dup             
	//   29   50:invokespecial   #84  <Method void LinearLayoutManager$AnchorInfo()>
	//   30   53:putfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
		mLayoutChunkResult = new LayoutChunkResult();
	//   31   56:aload_0         
	//   32   57:new             #13  <Class LinearLayoutManager$LayoutChunkResult>
	//   33   60:dup             
	//   34   61:invokespecial   #87  <Method void LinearLayoutManager$LayoutChunkResult()>
	//   35   64:putfield        #89  <Field LinearLayoutManager$LayoutChunkResult mLayoutChunkResult>
		mInitialPrefetchItemCount = 2;
	//   36   67:aload_0         
	//   37   68:iconst_2        
	//   38   69:putfield        #91  <Field int mInitialPrefetchItemCount>
		context = ((Context) (getProperties(context, attributeset, i, j)));
	//   39   72:aload_1         
	//   40   73:aload_2         
	//   41   74:iload_3         
	//   42   75:iload           4
	//   43   77:invokestatic    #104 <Method RecyclerView$LayoutManager$Properties getProperties(Context, AttributeSet, int, int)>
	//   44   80:astore_1        
		setOrientation(((RecyclerView.LayoutManager.Properties) (context)).orientation);
	//   45   81:aload_0         
	//   46   82:aload_1         
	//   47   83:getfield        #109 <Field int RecyclerView$LayoutManager$Properties.orientation>
	//   48   86:invokevirtual   #95  <Method void setOrientation(int)>
		setReverseLayout(((RecyclerView.LayoutManager.Properties) (context)).reverseLayout);
	//   49   89:aload_0         
	//   50   90:aload_1         
	//   51   91:getfield        #112 <Field boolean RecyclerView$LayoutManager$Properties.reverseLayout>
	//   52   94:invokevirtual   #99  <Method void setReverseLayout(boolean)>
		setStackFromEnd(((RecyclerView.LayoutManager.Properties) (context)).stackFromEnd);
	//   53   97:aload_0         
	//   54   98:aload_1         
	//   55   99:getfield        #115 <Field boolean RecyclerView$LayoutManager$Properties.stackFromEnd>
	//   56  102:invokevirtual   #118 <Method void setStackFromEnd(boolean)>
	//   57  105:return          
	}

	private int computeScrollExtent(RecyclerView.State state)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #124 <Method int getChildCount()>
	//*   2    4:ifne            9
		{
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			ensureLayoutState();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #127 <Method void ensureLayoutState()>
			return ScrollbarHelper.computeScrollExtent(state, mOrientationHelper, findFirstVisibleChildClosestToStart(mSmoothScrollbarEnabled ^ true, true), findFirstVisibleChildClosestToEnd(mSmoothScrollbarEnabled ^ true, true), ((RecyclerView.LayoutManager) (this)), mSmoothScrollbarEnabled);
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #77  <Field boolean mSmoothScrollbarEnabled>
	//   13   23:iconst_1        
	//   14   24:ixor            
	//   15   25:iconst_1        
	//   16   26:invokespecial   #133 <Method View findFirstVisibleChildClosestToStart(boolean, boolean)>
	//   17   29:aload_0         
	//   18   30:aload_0         
	//   19   31:getfield        #77  <Field boolean mSmoothScrollbarEnabled>
	//   20   34:iconst_1        
	//   21   35:ixor            
	//   22   36:iconst_1        
	//   23   37:invokespecial   #136 <Method View findFirstVisibleChildClosestToEnd(boolean, boolean)>
	//   24   40:aload_0         
	//   25   41:aload_0         
	//   26   42:getfield        #77  <Field boolean mSmoothScrollbarEnabled>
	//   27   45:invokestatic    #141 <Method int ScrollbarHelper.computeScrollExtent(RecyclerView$State, OrientationHelper, View, View, RecyclerView$LayoutManager, boolean)>
	//   28   48:ireturn         
		}
	}

	private int computeScrollOffset(RecyclerView.State state)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #124 <Method int getChildCount()>
	//*   2    4:ifne            9
		{
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			ensureLayoutState();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #127 <Method void ensureLayoutState()>
			return ScrollbarHelper.computeScrollOffset(state, mOrientationHelper, findFirstVisibleChildClosestToStart(mSmoothScrollbarEnabled ^ true, true), findFirstVisibleChildClosestToEnd(mSmoothScrollbarEnabled ^ true, true), ((RecyclerView.LayoutManager) (this)), mSmoothScrollbarEnabled, mShouldReverseLayout);
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #77  <Field boolean mSmoothScrollbarEnabled>
	//   13   23:iconst_1        
	//   14   24:ixor            
	//   15   25:iconst_1        
	//   16   26:invokespecial   #133 <Method View findFirstVisibleChildClosestToStart(boolean, boolean)>
	//   17   29:aload_0         
	//   18   30:aload_0         
	//   19   31:getfield        #77  <Field boolean mSmoothScrollbarEnabled>
	//   20   34:iconst_1        
	//   21   35:ixor            
	//   22   36:iconst_1        
	//   23   37:invokespecial   #136 <Method View findFirstVisibleChildClosestToEnd(boolean, boolean)>
	//   24   40:aload_0         
	//   25   41:aload_0         
	//   26   42:getfield        #77  <Field boolean mSmoothScrollbarEnabled>
	//   27   45:aload_0         
	//   28   46:getfield        #73  <Field boolean mShouldReverseLayout>
	//   29   49:invokestatic    #145 <Method int ScrollbarHelper.computeScrollOffset(RecyclerView$State, OrientationHelper, View, View, RecyclerView$LayoutManager, boolean, boolean)>
	//   30   52:ireturn         
		}
	}

	private int computeScrollRange(RecyclerView.State state)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #124 <Method int getChildCount()>
	//*   2    4:ifne            9
		{
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			ensureLayoutState();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #127 <Method void ensureLayoutState()>
			return ScrollbarHelper.computeScrollRange(state, mOrientationHelper, findFirstVisibleChildClosestToStart(mSmoothScrollbarEnabled ^ true, true), findFirstVisibleChildClosestToEnd(mSmoothScrollbarEnabled ^ true, true), ((RecyclerView.LayoutManager) (this)), mSmoothScrollbarEnabled);
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #77  <Field boolean mSmoothScrollbarEnabled>
	//   13   23:iconst_1        
	//   14   24:ixor            
	//   15   25:iconst_1        
	//   16   26:invokespecial   #133 <Method View findFirstVisibleChildClosestToStart(boolean, boolean)>
	//   17   29:aload_0         
	//   18   30:aload_0         
	//   19   31:getfield        #77  <Field boolean mSmoothScrollbarEnabled>
	//   20   34:iconst_1        
	//   21   35:ixor            
	//   22   36:iconst_1        
	//   23   37:invokespecial   #136 <Method View findFirstVisibleChildClosestToEnd(boolean, boolean)>
	//   24   40:aload_0         
	//   25   41:aload_0         
	//   26   42:getfield        #77  <Field boolean mSmoothScrollbarEnabled>
	//   27   45:invokestatic    #148 <Method int ScrollbarHelper.computeScrollRange(RecyclerView$State, OrientationHelper, View, View, RecyclerView$LayoutManager, boolean)>
	//   28   48:ireturn         
		}
	}

	private View findFirstPartiallyOrCompletelyInvisibleChild(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #124 <Method int getChildCount()>
	//    4    6:invokevirtual   #154 <Method View findOnePartiallyOrCompletelyInvisibleChild(int, int)>
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
	//    5    5:invokevirtual   #124 <Method int getChildCount()>
	//    6    8:aload_2         
	//    7    9:invokevirtual   #160 <Method int RecyclerView$State.getItemCount()>
	//    8   12:invokevirtual   #164 <Method View findReferenceChild(RecyclerView$Recycler, RecyclerView$State, int, int, int)>
	//    9   15:areturn         
	}

	private View findFirstVisibleChildClosestToEnd(boolean flag, boolean flag1)
	{
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            19
			return findOneVisibleChild(0, getChildCount(), flag, flag1);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:aload_0         
	//    6   10:invokevirtual   #124 <Method int getChildCount()>
	//    7   13:iload_1         
	//    8   14:iload_2         
	//    9   15:invokevirtual   #168 <Method View findOneVisibleChild(int, int, boolean, boolean)>
	//   10   18:areturn         
		else
			return findOneVisibleChild(getChildCount() - 1, -1, flag, flag1);
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:invokevirtual   #124 <Method int getChildCount()>
	//   14   24:iconst_1        
	//   15   25:isub            
	//   16   26:iconst_m1       
	//   17   27:iload_1         
	//   18   28:iload_2         
	//   19   29:invokevirtual   #168 <Method View findOneVisibleChild(int, int, boolean, boolean)>
	//   20   32:areturn         
	}

	private View findFirstVisibleChildClosestToStart(boolean flag, boolean flag1)
	{
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            21
			return findOneVisibleChild(getChildCount() - 1, -1, flag, flag1);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #124 <Method int getChildCount()>
	//    6   12:iconst_1        
	//    7   13:isub            
	//    8   14:iconst_m1       
	//    9   15:iload_1         
	//   10   16:iload_2         
	//   11   17:invokevirtual   #168 <Method View findOneVisibleChild(int, int, boolean, boolean)>
	//   12   20:areturn         
		else
			return findOneVisibleChild(0, getChildCount(), flag, flag1);
	//   13   21:aload_0         
	//   14   22:iconst_0        
	//   15   23:aload_0         
	//   16   24:invokevirtual   #124 <Method int getChildCount()>
	//   17   27:iload_1         
	//   18   28:iload_2         
	//   19   29:invokevirtual   #168 <Method View findOneVisibleChild(int, int, boolean, boolean)>
	//   20   32:areturn         
	}

	private View findLastPartiallyOrCompletelyInvisibleChild(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #124 <Method int getChildCount()>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:iconst_m1       
	//    6    8:invokevirtual   #154 <Method View findOnePartiallyOrCompletelyInvisibleChild(int, int)>
	//    7   11:areturn         
	}

	private View findLastReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		return findReferenceChild(recycler, state, getChildCount() - 1, -1, state.getItemCount());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:invokevirtual   #124 <Method int getChildCount()>
	//    5    7:iconst_1        
	//    6    8:isub            
	//    7    9:iconst_m1       
	//    8   10:aload_2         
	//    9   11:invokevirtual   #160 <Method int RecyclerView$State.getItemCount()>
	//   10   14:invokevirtual   #164 <Method View findReferenceChild(RecyclerView$Recycler, RecyclerView$State, int, int, int)>
	//   11   17:areturn         
	}

	private View findPartiallyOrCompletelyInvisibleChildClosestToEnd(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            14
			return findFirstPartiallyOrCompletelyInvisibleChild(recycler, state);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #173 <Method View findFirstPartiallyOrCompletelyInvisibleChild(RecyclerView$Recycler, RecyclerView$State)>
	//    7   13:areturn         
		else
			return findLastPartiallyOrCompletelyInvisibleChild(recycler, state);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #175 <Method View findLastPartiallyOrCompletelyInvisibleChild(RecyclerView$Recycler, RecyclerView$State)>
	//   12   20:areturn         
	}

	private View findPartiallyOrCompletelyInvisibleChildClosestToStart(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            14
			return findLastPartiallyOrCompletelyInvisibleChild(recycler, state);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #175 <Method View findLastPartiallyOrCompletelyInvisibleChild(RecyclerView$Recycler, RecyclerView$State)>
	//    7   13:areturn         
		else
			return findFirstPartiallyOrCompletelyInvisibleChild(recycler, state);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #173 <Method View findFirstPartiallyOrCompletelyInvisibleChild(RecyclerView$Recycler, RecyclerView$State)>
	//   12   20:areturn         
	}

	private View findReferenceChildClosestToEnd(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            14
			return findFirstReferenceChild(recycler, state);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #179 <Method View findFirstReferenceChild(RecyclerView$Recycler, RecyclerView$State)>
	//    7   13:areturn         
		else
			return findLastReferenceChild(recycler, state);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #181 <Method View findLastReferenceChild(RecyclerView$Recycler, RecyclerView$State)>
	//   12   20:areturn         
	}

	private View findReferenceChildClosestToStart(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            14
			return findLastReferenceChild(recycler, state);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #181 <Method View findLastReferenceChild(RecyclerView$Recycler, RecyclerView$State)>
	//    7   13:areturn         
		else
			return findFirstReferenceChild(recycler, state);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #179 <Method View findFirstReferenceChild(RecyclerView$Recycler, RecyclerView$State)>
	//   12   20:areturn         
	}

	private int fixLayoutEndGap(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean flag)
	{
		int j = mOrientationHelper.getEndAfterPadding() - i;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//    2    4:invokevirtual   #189 <Method int OrientationHelper.getEndAfterPadding()>
	//    3    7:iload_1         
	//    4    8:isub            
	//    5    9:istore          5
		if(j > 0)
	//*   6   11:iload           5
	//*   7   13:ifle            66
		{
			j = -scrollBy(-j, recycler, state);
	//    8   16:aload_0         
	//    9   17:iload           5
	//   10   19:ineg            
	//   11   20:aload_2         
	//   12   21:aload_3         
	//   13   22:invokevirtual   #193 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//   14   25:ineg            
	//   15   26:istore          5
			if(flag)
	//*  16   28:iload           4
	//*  17   30:ifeq            63
			{
				i = mOrientationHelper.getEndAfterPadding() - (i + j);
	//   18   33:aload_0         
	//   19   34:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   20   37:invokevirtual   #189 <Method int OrientationHelper.getEndAfterPadding()>
	//   21   40:iload_1         
	//   22   41:iload           5
	//   23   43:iadd            
	//   24   44:isub            
	//   25   45:istore_1        
				if(i > 0)
	//*  26   46:iload_1         
	//*  27   47:ifle            63
				{
					mOrientationHelper.offsetChildren(i);
	//   28   50:aload_0         
	//   29   51:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   30   54:iload_1         
	//   31   55:invokevirtual   #196 <Method void OrientationHelper.offsetChildren(int)>
					return i + j;
	//   32   58:iload_1         
	//   33   59:iload           5
	//   34   61:iadd            
	//   35   62:ireturn         
				}
			}
			return j;
	//   36   63:iload           5
	//   37   65:ireturn         
		} else
		{
			return 0;
	//   38   66:iconst_0        
	//   39   67:ireturn         
		}
	}

	private int fixLayoutStartGap(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean flag)
	{
		int j = i - mOrientationHelper.getStartAfterPadding();
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//    3    5:invokevirtual   #200 <Method int OrientationHelper.getStartAfterPadding()>
	//    4    8:isub            
	//    5    9:istore          5
		if(j > 0)
	//*   6   11:iload           5
	//*   7   13:ifle            66
		{
			j = -scrollBy(j, recycler, state);
	//    8   16:aload_0         
	//    9   17:iload           5
	//   10   19:aload_2         
	//   11   20:aload_3         
	//   12   21:invokevirtual   #193 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//   13   24:ineg            
	//   14   25:istore          5
			if(flag)
	//*  15   27:iload           4
	//*  16   29:ifeq            63
			{
				i = (i + j) - mOrientationHelper.getStartAfterPadding();
	//   17   32:iload_1         
	//   18   33:iload           5
	//   19   35:iadd            
	//   20   36:aload_0         
	//   21   37:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   22   40:invokevirtual   #200 <Method int OrientationHelper.getStartAfterPadding()>
	//   23   43:isub            
	//   24   44:istore_1        
				if(i > 0)
	//*  25   45:iload_1         
	//*  26   46:ifle            63
				{
					mOrientationHelper.offsetChildren(-i);
	//   27   49:aload_0         
	//   28   50:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   29   53:iload_1         
	//   30   54:ineg            
	//   31   55:invokevirtual   #196 <Method void OrientationHelper.offsetChildren(int)>
					return j - i;
	//   32   58:iload           5
	//   33   60:iload_1         
	//   34   61:isub            
	//   35   62:ireturn         
				}
			}
			return j;
	//   36   63:iload           5
	//   37   65:ireturn         
		} else
		{
			return 0;
	//   38   66:iconst_0        
	//   39   67:ireturn         
		}
	}

	private View getChildClosestToEnd()
	{
		int i;
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            12
			i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
		else
	//*   5    9:goto            19
			i = getChildCount() - 1;
	//    6   12:aload_0         
	//    7   13:invokevirtual   #124 <Method int getChildCount()>
	//    8   16:iconst_1        
	//    9   17:isub            
	//   10   18:istore_1        
		return getChildAt(i);
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #206 <Method View getChildAt(int)>
	//   14   24:areturn         
	}

	private View getChildClosestToStart()
	{
		int i;
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            17
			i = getChildCount() - 1;
	//    3    7:aload_0         
	//    4    8:invokevirtual   #124 <Method int getChildCount()>
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
	//   13   21:invokevirtual   #206 <Method View getChildAt(int)>
	//   14   24:areturn         
	}

	private void layoutForPredictiveAnimations(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int j)
	{
		if(state.willRunPredictiveAnimations() && getChildCount() != 0 && !state.isPreLayout())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #213 <Method boolean RecyclerView$State.willRunPredictiveAnimations()>
	//*   2    4:ifeq            323
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #124 <Method int getChildCount()>
	//*   5   11:ifeq            323
	//*   6   14:aload_2         
	//*   7   15:invokevirtual   #216 <Method boolean RecyclerView$State.isPreLayout()>
	//*   8   18:ifne            323
		{
			if(!supportsPredictiveItemAnimations())
	//*   9   21:aload_0         
	//*  10   22:invokevirtual   #219 <Method boolean supportsPredictiveItemAnimations()>
	//*  11   25:ifne            29
				return;
	//   12   28:return          
			List list = recycler.getScrapList();
	//   13   29:aload_1         
	//   14   30:invokevirtual   #225 <Method List RecyclerView$Recycler.getScrapList()>
	//   15   33:astore          13
			int j1 = list.size();
	//   16   35:aload           13
	//   17   37:invokeinterface #230 <Method int List.size()>
	//   18   42:istore          9
			int k1 = getPosition(getChildAt(0));
	//   19   44:aload_0         
	//   20   45:aload_0         
	//   21   46:iconst_0        
	//   22   47:invokevirtual   #206 <Method View getChildAt(int)>
	//   23   50:invokevirtual   #234 <Method int getPosition(View)>
	//   24   53:istore          10
			boolean flag1 = false;
	//   25   55:iconst_0        
	//   26   56:istore          8
			boolean flag = flag1;
	//   27   58:iload           8
	//   28   60:istore          5
			int l = ((int) (flag));
	//   29   62:iload           5
	//   30   64:istore          6
			int i1 = ((int) (flag));
	//   31   66:iload           5
	//   32   68:istore          7
			for(int k = ((int) (flag1)); k < j1; k++)
	//*  33   70:iload           8
	//*  34   72:istore          5
	//*  35   74:iload           5
	//*  36   76:iload           9
	//*  37   78:icmpge          196
			{
				RecyclerView.ViewHolder viewholder = (RecyclerView.ViewHolder)list.get(k);
	//   38   81:aload           13
	//   39   83:iload           5
	//   40   85:invokeinterface #238 <Method Object List.get(int)>
	//   41   90:checkcast       #240 <Class RecyclerView$ViewHolder>
	//   42   93:astore          14
				if(viewholder.isRemoved())
	//*  43   95:aload           14
	//*  44   97:invokevirtual   #243 <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*  45  100:ifeq            106
					continue;
	//   46  103:goto            187
				int l1 = viewholder.getLayoutPosition();
	//   47  106:aload           14
	//   48  108:invokevirtual   #246 <Method int RecyclerView$ViewHolder.getLayoutPosition()>
	//   49  111:istore          11
				byte byte0 = 1;
	//   50  113:iconst_1        
	//   51  114:istore          8
				boolean flag2;
				if(l1 < k1)
	//*  52  116:iload           11
	//*  53  118:iload           10
	//*  54  120:icmpge          129
					flag2 = true;
	//   55  123:iconst_1        
	//   56  124:istore          12
				else
	//*  57  126:goto            132
					flag2 = false;
	//   58  129:iconst_0        
	//   59  130:istore          12
				if(flag2 != mShouldReverseLayout)
	//*  60  132:iload           12
	//*  61  134:aload_0         
	//*  62  135:getfield        #73  <Field boolean mShouldReverseLayout>
	//*  63  138:icmpeq          144
					byte0 = -1;
	//   64  141:iconst_m1       
	//   65  142:istore          8
				if(byte0 == -1)
	//*  66  144:iload           8
	//*  67  146:iconst_m1       
	//*  68  147:icmpne          170
					i1 += mOrientationHelper.getDecoratedMeasurement(viewholder.itemView);
	//   69  150:iload           7
	//   70  152:aload_0         
	//   71  153:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   72  156:aload           14
	//   73  158:getfield        #250 <Field View RecyclerView$ViewHolder.itemView>
	//   74  161:invokevirtual   #253 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   75  164:iadd            
	//   76  165:istore          7
				else
	//*  77  167:goto            187
					l += mOrientationHelper.getDecoratedMeasurement(viewholder.itemView);
	//   78  170:iload           6
	//   79  172:aload_0         
	//   80  173:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   81  176:aload           14
	//   82  178:getfield        #250 <Field View RecyclerView$ViewHolder.itemView>
	//   83  181:invokevirtual   #253 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   84  184:iadd            
	//   85  185:istore          6
			}

	//   86  187:iload           5
	//   87  189:iconst_1        
	//   88  190:iadd            
	//   89  191:istore          5
	//*  90  193:goto            74
			mLayoutState.mScrapList = list;
	//   91  196:aload_0         
	//   92  197:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   93  200:aload           13
	//   94  202:putfield        #259 <Field List LinearLayoutManager$LayoutState.mScrapList>
			if(i1 > 0)
	//*  95  205:iload           7
	//*  96  207:ifle            259
			{
				updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i);
	//   97  210:aload_0         
	//   98  211:aload_0         
	//   99  212:aload_0         
	//  100  213:invokespecial   #261 <Method View getChildClosestToStart()>
	//  101  216:invokevirtual   #234 <Method int getPosition(View)>
	//  102  219:iload_3         
	//  103  220:invokespecial   #265 <Method void updateLayoutStateToFillStart(int, int)>
				mLayoutState.mExtra = i1;
	//  104  223:aload_0         
	//  105  224:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  106  227:iload           7
	//  107  229:putfield        #268 <Field int LinearLayoutManager$LayoutState.mExtra>
				mLayoutState.mAvailable = 0;
	//  108  232:aload_0         
	//  109  233:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  110  236:iconst_0        
	//  111  237:putfield        #271 <Field int LinearLayoutManager$LayoutState.mAvailable>
				mLayoutState.assignPositionFromScrapList();
	//  112  240:aload_0         
	//  113  241:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  114  244:invokevirtual   #274 <Method void LinearLayoutManager$LayoutState.assignPositionFromScrapList()>
				fill(recycler, mLayoutState, state, false);
	//  115  247:aload_0         
	//  116  248:aload_1         
	//  117  249:aload_0         
	//  118  250:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  119  253:aload_2         
	//  120  254:iconst_0        
	//  121  255:invokevirtual   #278 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//  122  258:pop             
			}
			if(l > 0)
	//* 123  259:iload           6
	//* 124  261:ifle            314
			{
				updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), j);
	//  125  264:aload_0         
	//  126  265:aload_0         
	//  127  266:aload_0         
	//  128  267:invokespecial   #280 <Method View getChildClosestToEnd()>
	//  129  270:invokevirtual   #234 <Method int getPosition(View)>
	//  130  273:iload           4
	//  131  275:invokespecial   #283 <Method void updateLayoutStateToFillEnd(int, int)>
				mLayoutState.mExtra = l;
	//  132  278:aload_0         
	//  133  279:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  134  282:iload           6
	//  135  284:putfield        #268 <Field int LinearLayoutManager$LayoutState.mExtra>
				mLayoutState.mAvailable = 0;
	//  136  287:aload_0         
	//  137  288:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  138  291:iconst_0        
	//  139  292:putfield        #271 <Field int LinearLayoutManager$LayoutState.mAvailable>
				mLayoutState.assignPositionFromScrapList();
	//  140  295:aload_0         
	//  141  296:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  142  299:invokevirtual   #274 <Method void LinearLayoutManager$LayoutState.assignPositionFromScrapList()>
				fill(recycler, mLayoutState, state, false);
	//  143  302:aload_0         
	//  144  303:aload_1         
	//  145  304:aload_0         
	//  146  305:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  147  308:aload_2         
	//  148  309:iconst_0        
	//  149  310:invokevirtual   #278 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//  150  313:pop             
			}
			mLayoutState.mScrapList = null;
	//  151  314:aload_0         
	//  152  315:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  153  318:aconst_null     
	//  154  319:putfield        #259 <Field List LinearLayoutManager$LayoutState.mScrapList>
			return;
	//  155  322:return          
		} else
		{
			return;
	//  156  323:return          
		}
	}

	private void logChildren()
	{
		Log.d("LinearLayoutManager", "internal representation of views on the screen");
	//    0    0:ldc1            #36  <String "LinearLayoutManager">
	//    1    2:ldc2            #286 <String "internal representation of views on the screen">
	//    2    5:invokestatic    #292 <Method int Log.d(String, String)>
	//    3    8:pop             
		for(int i = 0; i < getChildCount(); i++)
	//*   4    9:iconst_0        
	//*   5   10:istore_1        
	//*   6   11:iload_1         
	//*   7   12:aload_0         
	//*   8   13:invokevirtual   #124 <Method int getChildCount()>
	//*   9   16:icmpge          89
		{
			View view = getChildAt(i);
	//   10   19:aload_0         
	//   11   20:iload_1         
	//   12   21:invokevirtual   #206 <Method View getChildAt(int)>
	//   13   24:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   14   25:new             #294 <Class StringBuilder>
	//   15   28:dup             
	//   16   29:invokespecial   #295 <Method void StringBuilder()>
	//   17   32:astore_3        
			stringbuilder.append("item ");
	//   18   33:aload_3         
	//   19   34:ldc2            #297 <String "item ">
	//   20   37:invokevirtual   #301 <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
			stringbuilder.append(getPosition(view));
	//   22   41:aload_3         
	//   23   42:aload_0         
	//   24   43:aload_2         
	//   25   44:invokevirtual   #234 <Method int getPosition(View)>
	//   26   47:invokevirtual   #304 <Method StringBuilder StringBuilder.append(int)>
	//   27   50:pop             
			stringbuilder.append(", coord:");
	//   28   51:aload_3         
	//   29   52:ldc2            #306 <String ", coord:">
	//   30   55:invokevirtual   #301 <Method StringBuilder StringBuilder.append(String)>
	//   31   58:pop             
			stringbuilder.append(mOrientationHelper.getDecoratedStart(view));
	//   32   59:aload_3         
	//   33   60:aload_0         
	//   34   61:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   35   64:aload_2         
	//   36   65:invokevirtual   #309 <Method int OrientationHelper.getDecoratedStart(View)>
	//   37   68:invokevirtual   #304 <Method StringBuilder StringBuilder.append(int)>
	//   38   71:pop             
			Log.d("LinearLayoutManager", stringbuilder.toString());
	//   39   72:ldc1            #36  <String "LinearLayoutManager">
	//   40   74:aload_3         
	//   41   75:invokevirtual   #313 <Method String StringBuilder.toString()>
	//   42   78:invokestatic    #292 <Method int Log.d(String, String)>
	//   43   81:pop             
		}

	//   44   82:iload_1         
	//   45   83:iconst_1        
	//   46   84:iadd            
	//   47   85:istore_1        
	//*  48   86:goto            11
		Log.d("LinearLayoutManager", "==============");
	//   49   89:ldc1            #36  <String "LinearLayoutManager">
	//   50   91:ldc2            #315 <String "==============">
	//   51   94:invokestatic    #292 <Method int Log.d(String, String)>
	//   52   97:pop             
	//   53   98:return          
	}

	private void recycleByLayoutState(RecyclerView.Recycler recycler, LayoutState layoutstate)
	{
		if(layoutstate.mRecycle)
	//*   0    0:aload_2         
	//*   1    1:getfield        #320 <Field boolean LinearLayoutManager$LayoutState.mRecycle>
	//*   2    4:ifeq            43
		{
			if(layoutstate.mInfinite)
	//*   3    7:aload_2         
	//*   4    8:getfield        #323 <Field boolean LinearLayoutManager$LayoutState.mInfinite>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			if(layoutstate.mLayoutDirection == -1)
	//*   7   15:aload_2         
	//*   8   16:getfield        #326 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//*   9   19:iconst_m1       
	//*  10   20:icmpne          33
			{
				recycleViewsFromEnd(recycler, layoutstate.mScrollingOffset);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:getfield        #329 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//   15   29:invokespecial   #333 <Method void recycleViewsFromEnd(RecyclerView$Recycler, int)>
				return;
	//   16   32:return          
			} else
			{
				recycleViewsFromStart(recycler, layoutstate.mScrollingOffset);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:getfield        #329 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//   21   39:invokespecial   #336 <Method void recycleViewsFromStart(RecyclerView$Recycler, int)>
				return;
	//   22   42:return          
			}
		} else
		{
			return;
	//   23   43:return          
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
		int k = i;
	//    4    6:iload_2         
	//    5    7:istore          4
		if(j > i)
	//*   6    9:iload_3         
	//*   7   10:iload_2         
	//*   8   11:icmple          36
			for(j--; j >= i; j--)
	//*   9   14:iload_3         
	//*  10   15:iconst_1        
	//*  11   16:isub            
	//*  12   17:istore_3        
	//*  13   18:iload_3         
	//*  14   19:iload_2         
	//*  15   20:icmplt          58
				removeAndRecycleViewAt(j, recycler);
	//   16   23:aload_0         
	//   17   24:iload_3         
	//   18   25:aload_1         
	//   19   26:invokevirtual   #342 <Method void removeAndRecycleViewAt(int, RecyclerView$Recycler)>

	//   20   29:iload_3         
	//   21   30:iconst_1        
	//   22   31:isub            
	//   23   32:istore_3        
		else
	//*  24   33:goto            18
			for(; k > j; k--)
	//*  25   36:iload           4
	//*  26   38:iload_3         
	//*  27   39:icmple          58
				removeAndRecycleViewAt(k, recycler);
	//   28   42:aload_0         
	//   29   43:iload           4
	//   30   45:aload_1         
	//   31   46:invokevirtual   #342 <Method void removeAndRecycleViewAt(int, RecyclerView$Recycler)>

	//   32   49:iload           4
	//   33   51:iconst_1        
	//   34   52:isub            
	//   35   53:istore          4
	//*  36   55:goto            36
	//   37   58:return          
	}

	private void recycleViewsFromEnd(RecyclerView.Recycler recycler, int i)
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method int getChildCount()>
	//    2    4:istore_3        
		if(i < 0)
	//*   3    5:iload_2         
	//*   4    6:ifge            10
			return;
	//    5    9:return          
		int k = mOrientationHelper.getEnd() - i;
	//    6   10:aload_0         
	//    7   11:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//    8   14:invokevirtual   #345 <Method int OrientationHelper.getEnd()>
	//    9   17:iload_2         
	//   10   18:isub            
	//   11   19:istore          4
		if(mShouldReverseLayout)
	//*  12   21:aload_0         
	//*  13   22:getfield        #73  <Field boolean mShouldReverseLayout>
	//*  14   25:ifeq            88
		{
			for(i = 0; i < j;)
	//*  15   28:iconst_0        
	//*  16   29:istore_2        
	//*  17   30:iload_2         
	//*  18   31:iload_3         
	//*  19   32:icmpge          151
			{
				View view = getChildAt(i);
	//   20   35:aload_0         
	//   21   36:iload_2         
	//   22   37:invokevirtual   #206 <Method View getChildAt(int)>
	//   23   40:astore          5
				if(mOrientationHelper.getDecoratedStart(view) >= k && mOrientationHelper.getTransformedStartWithDecoration(view) >= k)
	//*  24   42:aload_0         
	//*  25   43:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//*  26   46:aload           5
	//*  27   48:invokevirtual   #309 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  28   51:iload           4
	//*  29   53:icmplt          80
	//*  30   56:aload_0         
	//*  31   57:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//*  32   60:aload           5
	//*  33   62:invokevirtual   #348 <Method int OrientationHelper.getTransformedStartWithDecoration(View)>
	//*  34   65:iload           4
	//*  35   67:icmpge          73
	//*  36   70:goto            80
				{
					i++;
	//   37   73:iload_2         
	//   38   74:iconst_1        
	//   39   75:iadd            
	//   40   76:istore_2        
				} else
	//*  41   77:goto            30
				{
					recycleChildren(recycler, 0, i);
	//   42   80:aload_0         
	//   43   81:aload_1         
	//   44   82:iconst_0        
	//   45   83:iload_2         
	//   46   84:invokespecial   #350 <Method void recycleChildren(RecyclerView$Recycler, int, int)>
					return;
	//   47   87:return          
				}
			}

		} else
		{
			j--;
	//   48   88:iload_3         
	//   49   89:iconst_1        
	//   50   90:isub            
	//   51   91:istore_3        
			for(i = j; i >= 0;)
	//*  52   92:iload_3         
	//*  53   93:istore_2        
	//*  54   94:iload_2         
	//*  55   95:iflt            151
			{
				View view1 = getChildAt(i);
	//   56   98:aload_0         
	//   57   99:iload_2         
	//   58  100:invokevirtual   #206 <Method View getChildAt(int)>
	//   59  103:astore          5
				if(mOrientationHelper.getDecoratedStart(view1) >= k && mOrientationHelper.getTransformedStartWithDecoration(view1) >= k)
	//*  60  105:aload_0         
	//*  61  106:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//*  62  109:aload           5
	//*  63  111:invokevirtual   #309 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  64  114:iload           4
	//*  65  116:icmplt          143
	//*  66  119:aload_0         
	//*  67  120:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//*  68  123:aload           5
	//*  69  125:invokevirtual   #348 <Method int OrientationHelper.getTransformedStartWithDecoration(View)>
	//*  70  128:iload           4
	//*  71  130:icmpge          136
	//*  72  133:goto            143
				{
					i--;
	//   73  136:iload_2         
	//   74  137:iconst_1        
	//   75  138:isub            
	//   76  139:istore_2        
				} else
	//*  77  140:goto            94
				{
					recycleChildren(recycler, j, i);
	//   78  143:aload_0         
	//   79  144:aload_1         
	//   80  145:iload_3         
	//   81  146:iload_2         
	//   82  147:invokespecial   #350 <Method void recycleChildren(RecyclerView$Recycler, int, int)>
					return;
	//   83  150:return          
				}
			}

		}
	//   84  151:return          
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
	//    4    6:invokevirtual   #124 <Method int getChildCount()>
	//    5    9:istore          4
		if(mShouldReverseLayout)
	//*   6   11:aload_0         
	//*   7   12:getfield        #73  <Field boolean mShouldReverseLayout>
	//*   8   15:ifeq            83
		{
			l--;
	//    9   18:iload           4
	//   10   20:iconst_1        
	//   11   21:isub            
	//   12   22:istore          4
			for(int j = l; j >= 0;)
	//*  13   24:iload           4
	//*  14   26:istore_3        
	//*  15   27:iload_3         
	//*  16   28:iflt            142
			{
				View view = getChildAt(j);
	//   17   31:aload_0         
	//   18   32:iload_3         
	//   19   33:invokevirtual   #206 <Method View getChildAt(int)>
	//   20   36:astore          5
				if(mOrientationHelper.getDecoratedEnd(view) <= i && mOrientationHelper.getTransformedEndWithDecoration(view) <= i)
	//*  21   38:aload_0         
	//*  22   39:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//*  23   42:aload           5
	//*  24   44:invokevirtual   #353 <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  25   47:iload_2         
	//*  26   48:icmpgt          74
	//*  27   51:aload_0         
	//*  28   52:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//*  29   55:aload           5
	//*  30   57:invokevirtual   #356 <Method int OrientationHelper.getTransformedEndWithDecoration(View)>
	//*  31   60:iload_2         
	//*  32   61:icmple          67
	//*  33   64:goto            74
				{
					j--;
	//   34   67:iload_3         
	//   35   68:iconst_1        
	//   36   69:isub            
	//   37   70:istore_3        
				} else
	//*  38   71:goto            27
				{
					recycleChildren(recycler, l, j);
	//   39   74:aload_0         
	//   40   75:aload_1         
	//   41   76:iload           4
	//   42   78:iload_3         
	//   43   79:invokespecial   #350 <Method void recycleChildren(RecyclerView$Recycler, int, int)>
					return;
	//   44   82:return          
				}
			}

		} else
		{
			for(int k = 0; k < l;)
	//*  45   83:iconst_0        
	//*  46   84:istore_3        
	//*  47   85:iload_3         
	//*  48   86:iload           4
	//*  49   88:icmpge          142
			{
				View view1 = getChildAt(k);
	//   50   91:aload_0         
	//   51   92:iload_3         
	//   52   93:invokevirtual   #206 <Method View getChildAt(int)>
	//   53   96:astore          5
				if(mOrientationHelper.getDecoratedEnd(view1) <= i && mOrientationHelper.getTransformedEndWithDecoration(view1) <= i)
	//*  54   98:aload_0         
	//*  55   99:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//*  56  102:aload           5
	//*  57  104:invokevirtual   #353 <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  58  107:iload_2         
	//*  59  108:icmpgt          134
	//*  60  111:aload_0         
	//*  61  112:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//*  62  115:aload           5
	//*  63  117:invokevirtual   #356 <Method int OrientationHelper.getTransformedEndWithDecoration(View)>
	//*  64  120:iload_2         
	//*  65  121:icmple          127
	//*  66  124:goto            134
				{
					k++;
	//   67  127:iload_3         
	//   68  128:iconst_1        
	//   69  129:iadd            
	//   70  130:istore_3        
				} else
	//*  71  131:goto            85
				{
					recycleChildren(recycler, 0, k);
	//   72  134:aload_0         
	//   73  135:aload_1         
	//   74  136:iconst_0        
	//   75  137:iload_3         
	//   76  138:invokespecial   #350 <Method void recycleChildren(RecyclerView$Recycler, int, int)>
					return;
	//   77  141:return          
				}
			}

		}
	//   78  142:return          
	}

	private void resolveShouldLayoutReverse()
	{
		if(mOrientation != 1 && isLayoutRTL())
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field int mOrientation>
	//*   2    4:iconst_1        
	//*   3    5:icmpeq          29
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #360 <Method boolean isLayoutRTL()>
	//*   6   12:ifne            18
	//*   7   15:goto            29
		{
			mShouldReverseLayout = mReverseLayout ^ true;
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #71  <Field boolean mReverseLayout>
	//   11   23:iconst_1        
	//   12   24:ixor            
	//   13   25:putfield        #73  <Field boolean mShouldReverseLayout>
			return;
	//   14   28:return          
		} else
		{
			mShouldReverseLayout = mReverseLayout;
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #71  <Field boolean mReverseLayout>
	//   18   34:putfield        #73  <Field boolean mShouldReverseLayout>
			return;
	//   19   37:return          
		}
	}

	private boolean updateAnchorFromChildren(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorinfo)
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method int getChildCount()>
	//    2    4:istore          5
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          4
		if(j == 0)
	//*   5    9:iload           5
	//*   6   11:ifne            16
			return false;
	//    7   14:iconst_0        
	//    8   15:ireturn         
		View view = getFocusedChild();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #365 <Method View getFocusedChild()>
	//   11   20:astore          6
		if(view != null && anchorinfo.isViewValidAsAnchor(view, state))
	//*  12   22:aload           6
	//*  13   24:ifnull          51
	//*  14   27:aload_3         
	//*  15   28:aload           6
	//*  16   30:aload_2         
	//*  17   31:invokevirtual   #369 <Method boolean LinearLayoutManager$AnchorInfo.isViewValidAsAnchor(View, RecyclerView$State)>
	//*  18   34:ifeq            51
		{
			anchorinfo.assignFromViewAndKeepVisibleRect(view, getPosition(view));
	//   19   37:aload_3         
	//   20   38:aload           6
	//   21   40:aload_0         
	//   22   41:aload           6
	//   23   43:invokevirtual   #234 <Method int getPosition(View)>
	//   24   46:invokevirtual   #373 <Method void LinearLayoutManager$AnchorInfo.assignFromViewAndKeepVisibleRect(View, int)>
			return true;
	//   25   49:iconst_1        
	//   26   50:ireturn         
		}
		if(mLastStackFromEnd != mStackFromEnd)
	//*  27   51:aload_0         
	//*  28   52:getfield        #375 <Field boolean mLastStackFromEnd>
	//*  29   55:aload_0         
	//*  30   56:getfield        #75  <Field boolean mStackFromEnd>
	//*  31   59:icmpeq          64
			return false;
	//   32   62:iconst_0        
	//   33   63:ireturn         
		if(anchorinfo.mLayoutFromEnd)
	//*  34   64:aload_3         
	//*  35   65:getfield        #378 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
	//*  36   68:ifeq            81
			recycler = ((RecyclerView.Recycler) (findReferenceChildClosestToEnd(recycler, state)));
	//   37   71:aload_0         
	//   38   72:aload_1         
	//   39   73:aload_2         
	//   40   74:invokespecial   #380 <Method View findReferenceChildClosestToEnd(RecyclerView$Recycler, RecyclerView$State)>
	//   41   77:astore_1        
		else
	//*  42   78:goto            88
			recycler = ((RecyclerView.Recycler) (findReferenceChildClosestToStart(recycler, state)));
	//   43   81:aload_0         
	//   44   82:aload_1         
	//   45   83:aload_2         
	//   46   84:invokespecial   #382 <Method View findReferenceChildClosestToStart(RecyclerView$Recycler, RecyclerView$State)>
	//   47   87:astore_1        
		if(recycler != null)
	//*  48   88:aload_1         
	//*  49   89:ifnull          196
		{
			anchorinfo.assignFromView(((View) (recycler)), getPosition(((View) (recycler))));
	//   50   92:aload_3         
	//   51   93:aload_1         
	//   52   94:aload_0         
	//   53   95:aload_1         
	//   54   96:invokevirtual   #234 <Method int getPosition(View)>
	//   55   99:invokevirtual   #385 <Method void LinearLayoutManager$AnchorInfo.assignFromView(View, int)>
			if(!state.isPreLayout() && supportsPredictiveItemAnimations())
	//*  56  102:aload_2         
	//*  57  103:invokevirtual   #216 <Method boolean RecyclerView$State.isPreLayout()>
	//*  58  106:ifne            194
	//*  59  109:aload_0         
	//*  60  110:invokevirtual   #219 <Method boolean supportsPredictiveItemAnimations()>
	//*  61  113:ifeq            194
			{
				if(mOrientationHelper.getDecoratedStart(((View) (recycler))) >= mOrientationHelper.getEndAfterPadding() || mOrientationHelper.getDecoratedEnd(((View) (recycler))) < mOrientationHelper.getStartAfterPadding())
	//*  62  116:aload_0         
	//*  63  117:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//*  64  120:aload_1         
	//*  65  121:invokevirtual   #309 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  66  124:aload_0         
	//*  67  125:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//*  68  128:invokevirtual   #189 <Method int OrientationHelper.getEndAfterPadding()>
	//*  69  131:icmpge          152
	//*  70  134:aload_0         
	//*  71  135:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//*  72  138:aload_1         
	//*  73  139:invokevirtual   #353 <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  74  142:aload_0         
	//*  75  143:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//*  76  146:invokevirtual   #200 <Method int OrientationHelper.getStartAfterPadding()>
	//*  77  149:icmpge          155
					flag = true;
	//   78  152:iconst_1        
	//   79  153:istore          4
				if(flag)
	//*  80  155:iload           4
	//*  81  157:ifeq            194
				{
					int i;
					if(anchorinfo.mLayoutFromEnd)
	//*  82  160:aload_3         
	//*  83  161:getfield        #378 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
	//*  84  164:ifeq            179
						i = mOrientationHelper.getEndAfterPadding();
	//   85  167:aload_0         
	//   86  168:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   87  171:invokevirtual   #189 <Method int OrientationHelper.getEndAfterPadding()>
	//   88  174:istore          4
					else
	//*  89  176:goto            188
						i = mOrientationHelper.getStartAfterPadding();
	//   90  179:aload_0         
	//   91  180:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   92  183:invokevirtual   #200 <Method int OrientationHelper.getStartAfterPadding()>
	//   93  186:istore          4
					anchorinfo.mCoordinate = i;
	//   94  188:aload_3         
	//   95  189:iload           4
	//   96  191:putfield        #388 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
				}
			}
			return true;
	//   97  194:iconst_1        
	//   98  195:ireturn         
		} else
		{
			return false;
	//   99  196:iconst_0        
	//  100  197:ireturn         
		}
	}

	private boolean updateAnchorFromPendingData(RecyclerView.State state, AnchorInfo anchorinfo)
	{
		boolean flag = state.isPreLayout();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #216 <Method boolean RecyclerView$State.isPreLayout()>
	//    2    4:istore          4
		boolean flag2 = false;
	//    3    6:iconst_0        
	//    4    7:istore          5
		if(!flag)
	//*   5    9:iload           4
	//*   6   11:ifne            415
		{
			if(mPendingScrollPosition == -1)
	//*   7   14:aload_0         
	//*   8   15:getfield        #79  <Field int mPendingScrollPosition>
	//*   9   18:iconst_m1       
	//*  10   19:icmpne          24
				return false;
	//   11   22:iconst_0        
	//   12   23:ireturn         
			if(mPendingScrollPosition >= 0 && mPendingScrollPosition < state.getItemCount())
	//*  13   24:aload_0         
	//*  14   25:getfield        #79  <Field int mPendingScrollPosition>
	//*  15   28:iflt            402
	//*  16   31:aload_0         
	//*  17   32:getfield        #79  <Field int mPendingScrollPosition>
	//*  18   35:aload_1         
	//*  19   36:invokevirtual   #160 <Method int RecyclerView$State.getItemCount()>
	//*  20   39:icmplt          45
	//*  21   42:goto            402
			{
				anchorinfo.mPosition = mPendingScrollPosition;
	//   22   45:aload_2         
	//   23   46:aload_0         
	//   24   47:getfield        #79  <Field int mPendingScrollPosition>
	//   25   50:putfield        #393 <Field int LinearLayoutManager$AnchorInfo.mPosition>
				if(mPendingSavedState != null && mPendingSavedState.hasValidAnchor())
	//*  26   53:aload_0         
	//*  27   54:getfield        #83  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*  28   57:ifnull          130
	//*  29   60:aload_0         
	//*  30   61:getfield        #83  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*  31   64:invokevirtual   #396 <Method boolean LinearLayoutManager$SavedState.hasValidAnchor()>
	//*  32   67:ifeq            130
				{
					anchorinfo.mLayoutFromEnd = mPendingSavedState.mAnchorLayoutFromEnd;
	//   33   70:aload_2         
	//   34   71:aload_0         
	//   35   72:getfield        #83  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   36   75:getfield        #399 <Field boolean LinearLayoutManager$SavedState.mAnchorLayoutFromEnd>
	//   37   78:putfield        #378 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
					if(anchorinfo.mLayoutFromEnd)
	//*  38   81:aload_2         
	//*  39   82:getfield        #378 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
	//*  40   85:ifeq            109
					{
						anchorinfo.mCoordinate = mOrientationHelper.getEndAfterPadding() - mPendingSavedState.mAnchorOffset;
	//   41   88:aload_2         
	//   42   89:aload_0         
	//   43   90:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   44   93:invokevirtual   #189 <Method int OrientationHelper.getEndAfterPadding()>
	//   45   96:aload_0         
	//   46   97:getfield        #83  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   47  100:getfield        #402 <Field int LinearLayoutManager$SavedState.mAnchorOffset>
	//   48  103:isub            
	//   49  104:putfield        #388 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
						return true;
	//   50  107:iconst_1        
	//   51  108:ireturn         
					} else
					{
						anchorinfo.mCoordinate = mOrientationHelper.getStartAfterPadding() + mPendingSavedState.mAnchorOffset;
	//   52  109:aload_2         
	//   53  110:aload_0         
	//   54  111:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   55  114:invokevirtual   #200 <Method int OrientationHelper.getStartAfterPadding()>
	//   56  117:aload_0         
	//   57  118:getfield        #83  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   58  121:getfield        #402 <Field int LinearLayoutManager$SavedState.mAnchorOffset>
	//   59  124:iadd            
	//   60  125:putfield        #388 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
						return true;
	//   61  128:iconst_1        
	//   62  129:ireturn         
					}
				}
				if(mPendingScrollPositionOffset == 0x80000000)
	//*  63  130:aload_0         
	//*  64  131:getfield        #81  <Field int mPendingScrollPositionOffset>
	//*  65  134:ldc1            #29  <Int 0x80000000>
	//*  66  136:icmpne          351
				{
					state = ((RecyclerView.State) (findViewByPosition(mPendingScrollPosition)));
	//   67  139:aload_0         
	//   68  140:aload_0         
	//   69  141:getfield        #79  <Field int mPendingScrollPosition>
	//   70  144:invokevirtual   #405 <Method View findViewByPosition(int)>
	//   71  147:astore_1        
					if(state != null)
	//*  72  148:aload_1         
	//*  73  149:ifnull          293
					{
						if(mOrientationHelper.getDecoratedMeasurement(((View) (state))) > mOrientationHelper.getTotalSpace())
	//*  74  152:aload_0         
	//*  75  153:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//*  76  156:aload_1         
	//*  77  157:invokevirtual   #253 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//*  78  160:aload_0         
	//*  79  161:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//*  80  164:invokevirtual   #408 <Method int OrientationHelper.getTotalSpace()>
	//*  81  167:icmple          176
						{
							anchorinfo.assignCoordinateFromPadding();
	//   82  170:aload_2         
	//   83  171:invokevirtual   #411 <Method void LinearLayoutManager$AnchorInfo.assignCoordinateFromPadding()>
							return true;
	//   84  174:iconst_1        
	//   85  175:ireturn         
						}
						if(mOrientationHelper.getDecoratedStart(((View) (state))) - mOrientationHelper.getStartAfterPadding() < 0)
	//*  86  176:aload_0         
	//*  87  177:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//*  88  180:aload_1         
	//*  89  181:invokevirtual   #309 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  90  184:aload_0         
	//*  91  185:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//*  92  188:invokevirtual   #200 <Method int OrientationHelper.getStartAfterPadding()>
	//*  93  191:isub            
	//*  94  192:ifge            213
						{
							anchorinfo.mCoordinate = mOrientationHelper.getStartAfterPadding();
	//   95  195:aload_2         
	//   96  196:aload_0         
	//   97  197:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   98  200:invokevirtual   #200 <Method int OrientationHelper.getStartAfterPadding()>
	//   99  203:putfield        #388 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
							anchorinfo.mLayoutFromEnd = false;
	//  100  206:aload_2         
	//  101  207:iconst_0        
	//  102  208:putfield        #378 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
							return true;
	//  103  211:iconst_1        
	//  104  212:ireturn         
						}
						if(mOrientationHelper.getEndAfterPadding() - mOrientationHelper.getDecoratedEnd(((View) (state))) < 0)
	//* 105  213:aload_0         
	//* 106  214:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//* 107  217:invokevirtual   #189 <Method int OrientationHelper.getEndAfterPadding()>
	//* 108  220:aload_0         
	//* 109  221:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//* 110  224:aload_1         
	//* 111  225:invokevirtual   #353 <Method int OrientationHelper.getDecoratedEnd(View)>
	//* 112  228:isub            
	//* 113  229:ifge            250
						{
							anchorinfo.mCoordinate = mOrientationHelper.getEndAfterPadding();
	//  114  232:aload_2         
	//  115  233:aload_0         
	//  116  234:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//  117  237:invokevirtual   #189 <Method int OrientationHelper.getEndAfterPadding()>
	//  118  240:putfield        #388 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
							anchorinfo.mLayoutFromEnd = true;
	//  119  243:aload_2         
	//  120  244:iconst_1        
	//  121  245:putfield        #378 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
							return true;
	//  122  248:iconst_1        
	//  123  249:ireturn         
						}
						int i;
						if(anchorinfo.mLayoutFromEnd)
	//* 124  250:aload_2         
	//* 125  251:getfield        #378 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
	//* 126  254:ifeq            277
							i = mOrientationHelper.getDecoratedEnd(((View) (state))) + mOrientationHelper.getTotalSpaceChange();
	//  127  257:aload_0         
	//  128  258:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//  129  261:aload_1         
	//  130  262:invokevirtual   #353 <Method int OrientationHelper.getDecoratedEnd(View)>
	//  131  265:aload_0         
	//  132  266:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//  133  269:invokevirtual   #414 <Method int OrientationHelper.getTotalSpaceChange()>
	//  134  272:iadd            
	//  135  273:istore_3        
						else
	//* 136  274:goto            286
							i = mOrientationHelper.getDecoratedStart(((View) (state)));
	//  137  277:aload_0         
	//  138  278:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//  139  281:aload_1         
	//  140  282:invokevirtual   #309 <Method int OrientationHelper.getDecoratedStart(View)>
	//  141  285:istore_3        
						anchorinfo.mCoordinate = i;
	//  142  286:aload_2         
	//  143  287:iload_3         
	//  144  288:putfield        #388 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
						return true;
	//  145  291:iconst_1        
	//  146  292:ireturn         
					}
					if(getChildCount() > 0)
	//* 147  293:aload_0         
	//* 148  294:invokevirtual   #124 <Method int getChildCount()>
	//* 149  297:ifle            345
					{
						int j = getPosition(getChildAt(0));
	//  150  300:aload_0         
	//  151  301:aload_0         
	//  152  302:iconst_0        
	//  153  303:invokevirtual   #206 <Method View getChildAt(int)>
	//  154  306:invokevirtual   #234 <Method int getPosition(View)>
	//  155  309:istore_3        
						boolean flag1;
						if(mPendingScrollPosition < j)
	//* 156  310:aload_0         
	//* 157  311:getfield        #79  <Field int mPendingScrollPosition>
	//* 158  314:iload_3         
	//* 159  315:icmpge          324
							flag1 = true;
	//  160  318:iconst_1        
	//  161  319:istore          4
						else
	//* 162  321:goto            327
							flag1 = false;
	//  163  324:iconst_0        
	//  164  325:istore          4
						if(flag1 == mShouldReverseLayout)
	//* 165  327:iload           4
	//* 166  329:aload_0         
	//* 167  330:getfield        #73  <Field boolean mShouldReverseLayout>
	//* 168  333:icmpne          339
							flag2 = true;
	//  169  336:iconst_1        
	//  170  337:istore          5
						anchorinfo.mLayoutFromEnd = flag2;
	//  171  339:aload_2         
	//  172  340:iload           5
	//  173  342:putfield        #378 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
					}
					anchorinfo.assignCoordinateFromPadding();
	//  174  345:aload_2         
	//  175  346:invokevirtual   #411 <Method void LinearLayoutManager$AnchorInfo.assignCoordinateFromPadding()>
					return true;
	//  176  349:iconst_1        
	//  177  350:ireturn         
				}
				anchorinfo.mLayoutFromEnd = mShouldReverseLayout;
	//  178  351:aload_2         
	//  179  352:aload_0         
	//  180  353:getfield        #73  <Field boolean mShouldReverseLayout>
	//  181  356:putfield        #378 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
				if(mShouldReverseLayout)
	//* 182  359:aload_0         
	//* 183  360:getfield        #73  <Field boolean mShouldReverseLayout>
	//* 184  363:ifeq            384
				{
					anchorinfo.mCoordinate = mOrientationHelper.getEndAfterPadding() - mPendingScrollPositionOffset;
	//  185  366:aload_2         
	//  186  367:aload_0         
	//  187  368:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//  188  371:invokevirtual   #189 <Method int OrientationHelper.getEndAfterPadding()>
	//  189  374:aload_0         
	//  190  375:getfield        #81  <Field int mPendingScrollPositionOffset>
	//  191  378:isub            
	//  192  379:putfield        #388 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
					return true;
	//  193  382:iconst_1        
	//  194  383:ireturn         
				} else
				{
					anchorinfo.mCoordinate = mOrientationHelper.getStartAfterPadding() + mPendingScrollPositionOffset;
	//  195  384:aload_2         
	//  196  385:aload_0         
	//  197  386:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//  198  389:invokevirtual   #200 <Method int OrientationHelper.getStartAfterPadding()>
	//  199  392:aload_0         
	//  200  393:getfield        #81  <Field int mPendingScrollPositionOffset>
	//  201  396:iadd            
	//  202  397:putfield        #388 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
					return true;
	//  203  400:iconst_1        
	//  204  401:ireturn         
				}
			} else
			{
				mPendingScrollPosition = -1;
	//  205  402:aload_0         
	//  206  403:iconst_m1       
	//  207  404:putfield        #79  <Field int mPendingScrollPosition>
				mPendingScrollPositionOffset = 0x80000000;
	//  208  407:aload_0         
	//  209  408:ldc1            #29  <Int 0x80000000>
	//  210  410:putfield        #81  <Field int mPendingScrollPositionOffset>
				return false;
	//  211  413:iconst_0        
	//  212  414:ireturn         
			}
		} else
		{
			return false;
	//  213  415:iconst_0        
	//  214  416:ireturn         
		}
	}

	private void updateAnchorInfoForLayout(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorinfo)
	{
		if(updateAnchorFromPendingData(state, anchorinfo))
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:aload_3         
	//*   3    3:invokespecial   #418 <Method boolean updateAnchorFromPendingData(RecyclerView$State, LinearLayoutManager$AnchorInfo)>
	//*   4    6:ifeq            10
			return;
	//    5    9:return          
		if(updateAnchorFromChildren(recycler, state, anchorinfo))
	//*   6   10:aload_0         
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:aload_3         
	//*  10   14:invokespecial   #420 <Method boolean updateAnchorFromChildren(RecyclerView$Recycler, RecyclerView$State, LinearLayoutManager$AnchorInfo)>
	//*  11   17:ifeq            21
			return;
	//   12   20:return          
		anchorinfo.assignCoordinateFromPadding();
	//   13   21:aload_3         
	//   14   22:invokevirtual   #411 <Method void LinearLayoutManager$AnchorInfo.assignCoordinateFromPadding()>
		int i;
		if(mStackFromEnd)
	//*  15   25:aload_0         
	//*  16   26:getfield        #75  <Field boolean mStackFromEnd>
	//*  17   29:ifeq            43
			i = state.getItemCount() - 1;
	//   18   32:aload_2         
	//   19   33:invokevirtual   #160 <Method int RecyclerView$State.getItemCount()>
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
	//   28   49:putfield        #393 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//   29   52:return          
	}

	private void updateLayoutState(int i, int j, boolean flag, RecyclerView.State state)
	{
		mLayoutState.mInfinite = resolveIsInfinite();
	//    0    0:aload_0         
	//    1    1:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #425 <Method boolean resolveIsInfinite()>
	//    4    8:putfield        #323 <Field boolean LinearLayoutManager$LayoutState.mInfinite>
		mLayoutState.mExtra = getExtraLayoutSpace(state);
	//    5   11:aload_0         
	//    6   12:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//    7   15:aload_0         
	//    8   16:aload           4
	//    9   18:invokevirtual   #428 <Method int getExtraLayoutSpace(RecyclerView$State)>
	//   10   21:putfield        #268 <Field int LinearLayoutManager$LayoutState.mExtra>
		mLayoutState.mLayoutDirection = i;
	//   11   24:aload_0         
	//   12   25:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   13   28:iload_1         
	//   14   29:putfield        #326 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
		int k = -1;
	//   15   32:iconst_m1       
	//   16   33:istore          5
		if(i == 1)
	//*  17   35:iload_1         
	//*  18   36:iconst_1        
	//*  19   37:icmpne          154
		{
			state = ((RecyclerView.State) (mLayoutState));
	//   20   40:aload_0         
	//   21   41:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   22   44:astore          4
			state.mExtra = ((LayoutState) (state)).mExtra + mOrientationHelper.getEndPadding();
	//   23   46:aload           4
	//   24   48:aload           4
	//   25   50:getfield        #268 <Field int LinearLayoutManager$LayoutState.mExtra>
	//   26   53:aload_0         
	//   27   54:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   28   57:invokevirtual   #431 <Method int OrientationHelper.getEndPadding()>
	//   29   60:iadd            
	//   30   61:putfield        #268 <Field int LinearLayoutManager$LayoutState.mExtra>
			state = ((RecyclerView.State) (getChildClosestToEnd()));
	//   31   64:aload_0         
	//   32   65:invokespecial   #280 <Method View getChildClosestToEnd()>
	//   33   68:astore          4
			LayoutState layoutstate = mLayoutState;
	//   34   70:aload_0         
	//   35   71:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   36   74:astore          6
			if(!mShouldReverseLayout)
	//*  37   76:aload_0         
	//*  38   77:getfield        #73  <Field boolean mShouldReverseLayout>
	//*  39   80:ifeq            86
	//*  40   83:goto            89
				k = 1;
	//   41   86:iconst_1        
	//   42   87:istore          5
			layoutstate.mItemDirection = k;
	//   43   89:aload           6
	//   44   91:iload           5
	//   45   93:putfield        #434 <Field int LinearLayoutManager$LayoutState.mItemDirection>
			mLayoutState.mCurrentPosition = getPosition(((View) (state))) + mLayoutState.mItemDirection;
	//   46   96:aload_0         
	//   47   97:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   48  100:aload_0         
	//   49  101:aload           4
	//   50  103:invokevirtual   #234 <Method int getPosition(View)>
	//   51  106:aload_0         
	//   52  107:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   53  110:getfield        #434 <Field int LinearLayoutManager$LayoutState.mItemDirection>
	//   54  113:iadd            
	//   55  114:putfield        #437 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
			mLayoutState.mOffset = mOrientationHelper.getDecoratedEnd(((View) (state)));
	//   56  117:aload_0         
	//   57  118:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   58  121:aload_0         
	//   59  122:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   60  125:aload           4
	//   61  127:invokevirtual   #353 <Method int OrientationHelper.getDecoratedEnd(View)>
	//   62  130:putfield        #440 <Field int LinearLayoutManager$LayoutState.mOffset>
			i = mOrientationHelper.getDecoratedEnd(((View) (state))) - mOrientationHelper.getEndAfterPadding();
	//   63  133:aload_0         
	//   64  134:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   65  137:aload           4
	//   66  139:invokevirtual   #353 <Method int OrientationHelper.getDecoratedEnd(View)>
	//   67  142:aload_0         
	//   68  143:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   69  146:invokevirtual   #189 <Method int OrientationHelper.getEndAfterPadding()>
	//   70  149:isub            
	//   71  150:istore_1        
		} else
	//*  72  151:goto            263
		{
			state = ((RecyclerView.State) (getChildClosestToStart()));
	//   73  154:aload_0         
	//   74  155:invokespecial   #261 <Method View getChildClosestToStart()>
	//   75  158:astore          4
			LayoutState layoutstate1 = mLayoutState;
	//   76  160:aload_0         
	//   77  161:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   78  164:astore          6
			layoutstate1.mExtra = layoutstate1.mExtra + mOrientationHelper.getStartAfterPadding();
	//   79  166:aload           6
	//   80  168:aload           6
	//   81  170:getfield        #268 <Field int LinearLayoutManager$LayoutState.mExtra>
	//   82  173:aload_0         
	//   83  174:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   84  177:invokevirtual   #200 <Method int OrientationHelper.getStartAfterPadding()>
	//   85  180:iadd            
	//   86  181:putfield        #268 <Field int LinearLayoutManager$LayoutState.mExtra>
			layoutstate1 = mLayoutState;
	//   87  184:aload_0         
	//   88  185:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   89  188:astore          6
			if(mShouldReverseLayout)
	//*  90  190:aload_0         
	//*  91  191:getfield        #73  <Field boolean mShouldReverseLayout>
	//*  92  194:ifeq            200
				k = 1;
	//   93  197:iconst_1        
	//   94  198:istore          5
			layoutstate1.mItemDirection = k;
	//   95  200:aload           6
	//   96  202:iload           5
	//   97  204:putfield        #434 <Field int LinearLayoutManager$LayoutState.mItemDirection>
			mLayoutState.mCurrentPosition = getPosition(((View) (state))) + mLayoutState.mItemDirection;
	//   98  207:aload_0         
	//   99  208:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  100  211:aload_0         
	//  101  212:aload           4
	//  102  214:invokevirtual   #234 <Method int getPosition(View)>
	//  103  217:aload_0         
	//  104  218:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  105  221:getfield        #434 <Field int LinearLayoutManager$LayoutState.mItemDirection>
	//  106  224:iadd            
	//  107  225:putfield        #437 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
			mLayoutState.mOffset = mOrientationHelper.getDecoratedStart(((View) (state)));
	//  108  228:aload_0         
	//  109  229:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  110  232:aload_0         
	//  111  233:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//  112  236:aload           4
	//  113  238:invokevirtual   #309 <Method int OrientationHelper.getDecoratedStart(View)>
	//  114  241:putfield        #440 <Field int LinearLayoutManager$LayoutState.mOffset>
			i = -mOrientationHelper.getDecoratedStart(((View) (state))) + mOrientationHelper.getStartAfterPadding();
	//  115  244:aload_0         
	//  116  245:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//  117  248:aload           4
	//  118  250:invokevirtual   #309 <Method int OrientationHelper.getDecoratedStart(View)>
	//  119  253:ineg            
	//  120  254:aload_0         
	//  121  255:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//  122  258:invokevirtual   #200 <Method int OrientationHelper.getStartAfterPadding()>
	//  123  261:iadd            
	//  124  262:istore_1        
		}
		mLayoutState.mAvailable = j;
	//  125  263:aload_0         
	//  126  264:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  127  267:iload_2         
	//  128  268:putfield        #271 <Field int LinearLayoutManager$LayoutState.mAvailable>
		if(flag)
	//* 129  271:iload_3         
	//* 130  272:ifeq            293
		{
			state = ((RecyclerView.State) (mLayoutState));
	//  131  275:aload_0         
	//  132  276:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  133  279:astore          4
			state.mAvailable = ((LayoutState) (state)).mAvailable - i;
	//  134  281:aload           4
	//  135  283:aload           4
	//  136  285:getfield        #271 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//  137  288:iload_1         
	//  138  289:isub            
	//  139  290:putfield        #271 <Field int LinearLayoutManager$LayoutState.mAvailable>
		}
		mLayoutState.mScrollingOffset = i;
	//  140  293:aload_0         
	//  141  294:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  142  297:iload_1         
	//  143  298:putfield        #329 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//  144  301:return          
	}

	private void updateLayoutStateToFillEnd(int i, int j)
	{
		mLayoutState.mAvailable = mOrientationHelper.getEndAfterPadding() - j;
	//    0    0:aload_0         
	//    1    1:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//    2    4:aload_0         
	//    3    5:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//    4    8:invokevirtual   #189 <Method int OrientationHelper.getEndAfterPadding()>
	//    5   11:iload_2         
	//    6   12:isub            
	//    7   13:putfield        #271 <Field int LinearLayoutManager$LayoutState.mAvailable>
		LayoutState layoutstate = mLayoutState;
	//    8   16:aload_0         
	//    9   17:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   10   20:astore          4
		int k;
		if(mShouldReverseLayout)
	//*  11   22:aload_0         
	//*  12   23:getfield        #73  <Field boolean mShouldReverseLayout>
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
	//   21   39:putfield        #434 <Field int LinearLayoutManager$LayoutState.mItemDirection>
		mLayoutState.mCurrentPosition = i;
	//   22   42:aload_0         
	//   23   43:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   24   46:iload_1         
	//   25   47:putfield        #437 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
		mLayoutState.mLayoutDirection = 1;
	//   26   50:aload_0         
	//   27   51:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   28   54:iconst_1        
	//   29   55:putfield        #326 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
		mLayoutState.mOffset = j;
	//   30   58:aload_0         
	//   31   59:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   32   62:iload_2         
	//   33   63:putfield        #440 <Field int LinearLayoutManager$LayoutState.mOffset>
		mLayoutState.mScrollingOffset = 0x80000000;
	//   34   66:aload_0         
	//   35   67:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   36   70:ldc1            #29  <Int 0x80000000>
	//   37   72:putfield        #329 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//   38   75:return          
	}

	private void updateLayoutStateToFillEnd(AnchorInfo anchorinfo)
	{
		updateLayoutStateToFillEnd(anchorinfo.mPosition, anchorinfo.mCoordinate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #393 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//    3    5:aload_1         
	//    4    6:getfield        #388 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
	//    5    9:invokespecial   #283 <Method void updateLayoutStateToFillEnd(int, int)>
	//    6   12:return          
	}

	private void updateLayoutStateToFillStart(int i, int j)
	{
		mLayoutState.mAvailable = j - mOrientationHelper.getStartAfterPadding();
	//    0    0:aload_0         
	//    1    1:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//    2    4:iload_2         
	//    3    5:aload_0         
	//    4    6:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//    5    9:invokevirtual   #200 <Method int OrientationHelper.getStartAfterPadding()>
	//    6   12:isub            
	//    7   13:putfield        #271 <Field int LinearLayoutManager$LayoutState.mAvailable>
		mLayoutState.mCurrentPosition = i;
	//    8   16:aload_0         
	//    9   17:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   10   20:iload_1         
	//   11   21:putfield        #437 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
		LayoutState layoutstate = mLayoutState;
	//   12   24:aload_0         
	//   13   25:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   14   28:astore_3        
		if(mShouldReverseLayout)
	//*  15   29:aload_0         
	//*  16   30:getfield        #73  <Field boolean mShouldReverseLayout>
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
	//   25   45:putfield        #434 <Field int LinearLayoutManager$LayoutState.mItemDirection>
		mLayoutState.mLayoutDirection = -1;
	//   26   48:aload_0         
	//   27   49:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   28   52:iconst_m1       
	//   29   53:putfield        #326 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
		mLayoutState.mOffset = j;
	//   30   56:aload_0         
	//   31   57:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   32   60:iload_2         
	//   33   61:putfield        #440 <Field int LinearLayoutManager$LayoutState.mOffset>
		mLayoutState.mScrollingOffset = 0x80000000;
	//   34   64:aload_0         
	//   35   65:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   36   68:ldc1            #29  <Int 0x80000000>
	//   37   70:putfield        #329 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//   38   73:return          
	}

	private void updateLayoutStateToFillStart(AnchorInfo anchorinfo)
	{
		updateLayoutStateToFillStart(anchorinfo.mPosition, anchorinfo.mCoordinate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #393 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//    3    5:aload_1         
	//    4    6:getfield        #388 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
	//    5    9:invokespecial   #265 <Method void updateLayoutStateToFillStart(int, int)>
	//    6   12:return          
	}

	public void assertNotInLayoutOrScroll(String s)
	{
		if(mPendingSavedState == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*   2    4:ifnonnull       12
			super.assertNotInLayoutOrScroll(s);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #445 <Method void RecyclerView$LayoutManager.assertNotInLayoutOrScroll(String)>
	//    6   12:return          
	}

	public boolean canScrollHorizontally()
	{
		return mOrientation == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int mOrientation>
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
	//    1    1:getfield        #69  <Field int mOrientation>
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
	//*   1    1:getfield        #69  <Field int mOrientation>
	//*   2    4:ifne            10
	//*   3    7:goto            12
			i = j;
	//    4   10:iload_2         
	//    5   11:istore_1        
		if(getChildCount() != 0)
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #124 <Method int getChildCount()>
	//*   8   16:ifeq            62
		{
			if(i == 0)
	//*   9   19:iload_1         
	//*  10   20:ifne            24
				return;
	//   11   23:return          
			ensureLayoutState();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #127 <Method void ensureLayoutState()>
			if(i > 0)
	//*  14   28:iload_1         
	//*  15   29:ifle            37
				j = 1;
	//   16   32:iconst_1        
	//   17   33:istore_2        
			else
	//*  18   34:goto            39
				j = -1;
	//   19   37:iconst_m1       
	//   20   38:istore_2        
			updateLayoutState(j, Math.abs(i), true, state);
	//   21   39:aload_0         
	//   22   40:iload_2         
	//   23   41:iload_1         
	//   24   42:invokestatic    #455 <Method int Math.abs(int)>
	//   25   45:iconst_1        
	//   26   46:aload_3         
	//   27   47:invokespecial   #457 <Method void updateLayoutState(int, int, boolean, RecyclerView$State)>
			collectPrefetchPositionsForLayoutState(state, mLayoutState, layoutprefetchregistry);
	//   28   50:aload_0         
	//   29   51:aload_3         
	//   30   52:aload_0         
	//   31   53:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   32   56:aload           4
	//   33   58:invokevirtual   #461 <Method void collectPrefetchPositionsForLayoutState(RecyclerView$State, LinearLayoutManager$LayoutState, RecyclerView$LayoutManager$LayoutPrefetchRegistry)>
			return;
	//   34   61:return          
		} else
		{
			return;
	//   35   62:return          
		}
	}

	public void collectInitialPrefetchPositions(int i, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutprefetchregistry)
	{
		SavedState savedstate = mPendingSavedState;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//    2    4:astore          8
		byte byte0 = -1;
	//    3    6:iconst_m1       
	//    4    7:istore          4
		int j;
		boolean flag1;
		if(savedstate != null && mPendingSavedState.hasValidAnchor())
	//*   5    9:aload           8
	//*   6   11:ifnull          44
	//*   7   14:aload_0         
	//*   8   15:getfield        #83  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*   9   18:invokevirtual   #396 <Method boolean LinearLayoutManager$SavedState.hasValidAnchor()>
	//*  10   21:ifeq            44
		{
			flag1 = mPendingSavedState.mAnchorLayoutFromEnd;
	//   11   24:aload_0         
	//   12   25:getfield        #83  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   13   28:getfield        #399 <Field boolean LinearLayoutManager$SavedState.mAnchorLayoutFromEnd>
	//   14   31:istore          7
			j = mPendingSavedState.mAnchorPosition;
	//   15   33:aload_0         
	//   16   34:getfield        #83  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   17   37:getfield        #466 <Field int LinearLayoutManager$SavedState.mAnchorPosition>
	//   18   40:istore_3        
		} else
	//*  19   41:goto            84
		{
			resolveShouldLayoutReverse();
	//   20   44:aload_0         
	//   21   45:invokespecial   #468 <Method void resolveShouldLayoutReverse()>
			flag1 = mShouldReverseLayout;
	//   22   48:aload_0         
	//   23   49:getfield        #73  <Field boolean mShouldReverseLayout>
	//   24   52:istore          7
			if(mPendingScrollPosition == -1)
	//*  25   54:aload_0         
	//*  26   55:getfield        #79  <Field int mPendingScrollPosition>
	//*  27   58:iconst_m1       
	//*  28   59:icmpne          79
			{
				if(flag1)
	//*  29   62:iload           7
	//*  30   64:ifeq            74
					j = i - 1;
	//   31   67:iload_1         
	//   32   68:iconst_1        
	//   33   69:isub            
	//   34   70:istore_3        
				else
	//*  35   71:goto            84
					j = 0;
	//   36   74:iconst_0        
	//   37   75:istore_3        
			} else
	//*  38   76:goto            84
			{
				j = mPendingScrollPosition;
	//   39   79:aload_0         
	//   40   80:getfield        #79  <Field int mPendingScrollPosition>
	//   41   83:istore_3        
			}
		}
		if(!flag1)
	//*  42   84:iload           7
	//*  43   86:ifeq            92
	//*  44   89:goto            95
			byte0 = 1;
	//   45   92:iconst_1        
	//   46   93:istore          4
		boolean flag = false;
	//   47   95:iconst_0        
	//   48   96:istore          6
		int l = j;
	//   49   98:iload_3         
	//   50   99:istore          5
		for(int k = ((int) (flag)); k < mInitialPrefetchItemCount && l >= 0 && l < i; k++)
	//*  51  101:iload           6
	//*  52  103:istore_3        
	//*  53  104:iload_3         
	//*  54  105:aload_0         
	//*  55  106:getfield        #91  <Field int mInitialPrefetchItemCount>
	//*  56  109:icmpge          146
	//*  57  112:iload           5
	//*  58  114:iflt            146
	//*  59  117:iload           5
	//*  60  119:iload_1         
	//*  61  120:icmpge          146
		{
			layoutprefetchregistry.addPosition(l, 0);
	//   62  123:aload_2         
	//   63  124:iload           5
	//   64  126:iconst_0        
	//   65  127:invokeinterface #473 <Method void RecyclerView$LayoutManager$LayoutPrefetchRegistry.addPosition(int, int)>
			l += ((int) (byte0));
	//   66  132:iload           5
	//   67  134:iload           4
	//   68  136:iadd            
	//   69  137:istore          5
		}

	//   70  139:iload_3         
	//   71  140:iconst_1        
	//   72  141:iadd            
	//   73  142:istore_3        
	//*  74  143:goto            104
	//   75  146:return          
	}

	void collectPrefetchPositionsForLayoutState(RecyclerView.State state, LayoutState layoutstate, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutprefetchregistry)
	{
		int i = layoutstate.mCurrentPosition;
	//    0    0:aload_2         
	//    1    1:getfield        #437 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//    2    4:istore          4
		if(i >= 0 && i < state.getItemCount())
	//*   3    6:iload           4
	//*   4    8:iflt            36
	//*   5   11:iload           4
	//*   6   13:aload_1         
	//*   7   14:invokevirtual   #160 <Method int RecyclerView$State.getItemCount()>
	//*   8   17:icmpge          36
			layoutprefetchregistry.addPosition(i, Math.max(0, layoutstate.mScrollingOffset));
	//    9   20:aload_3         
	//   10   21:iload           4
	//   11   23:iconst_0        
	//   12   24:aload_2         
	//   13   25:getfield        #329 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//   14   28:invokestatic    #477 <Method int Math.max(int, int)>
	//   15   31:invokeinterface #473 <Method void RecyclerView$LayoutManager$LayoutPrefetchRegistry.addPosition(int, int)>
	//   16   36:return          
	}

	public int computeHorizontalScrollExtent(RecyclerView.State state)
	{
		return computeScrollExtent(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #480 <Method int computeScrollExtent(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public int computeHorizontalScrollOffset(RecyclerView.State state)
	{
		return computeScrollOffset(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #483 <Method int computeScrollOffset(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public int computeHorizontalScrollRange(RecyclerView.State state)
	{
		return computeScrollRange(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #486 <Method int computeScrollRange(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public PointF computeScrollVectorForPosition(int i)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #124 <Method int getChildCount()>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		boolean flag1 = false;
	//    5    9:iconst_0        
	//    6   10:istore          4
		int j = getPosition(getChildAt(0));
	//    7   12:aload_0         
	//    8   13:aload_0         
	//    9   14:iconst_0        
	//   10   15:invokevirtual   #206 <Method View getChildAt(int)>
	//   11   18:invokevirtual   #234 <Method int getPosition(View)>
	//   12   21:istore_3        
		boolean flag = true;
	//   13   22:iconst_1        
	//   14   23:istore_2        
		if(i < j)
	//*  15   24:iload_1         
	//*  16   25:iload_3         
	//*  17   26:icmpge          32
			flag1 = true;
	//   18   29:iconst_1        
	//   19   30:istore          4
		i = ((int) (flag));
	//   20   32:iload_2         
	//   21   33:istore_1        
		if(flag1 != mShouldReverseLayout)
	//*  22   34:iload           4
	//*  23   36:aload_0         
	//*  24   37:getfield        #73  <Field boolean mShouldReverseLayout>
	//*  25   40:icmpeq          45
			i = -1;
	//   26   43:iconst_m1       
	//   27   44:istore_1        
		if(mOrientation == 0)
	//*  28   45:aload_0         
	//*  29   46:getfield        #69  <Field int mOrientation>
	//*  30   49:ifne            63
			return new PointF(i, 0.0F);
	//   31   52:new             #490 <Class PointF>
	//   32   55:dup             
	//   33   56:iload_1         
	//   34   57:i2f             
	//   35   58:fconst_0        
	//   36   59:invokespecial   #493 <Method void PointF(float, float)>
	//   37   62:areturn         
		else
			return new PointF(0.0F, i);
	//   38   63:new             #490 <Class PointF>
	//   39   66:dup             
	//   40   67:fconst_0        
	//   41   68:iload_1         
	//   42   69:i2f             
	//   43   70:invokespecial   #493 <Method void PointF(float, float)>
	//   44   73:areturn         
	}

	public int computeVerticalScrollExtent(RecyclerView.State state)
	{
		return computeScrollExtent(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #480 <Method int computeScrollExtent(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public int computeVerticalScrollOffset(RecyclerView.State state)
	{
		return computeScrollOffset(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #483 <Method int computeScrollOffset(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public int computeVerticalScrollRange(RecyclerView.State state)
	{
		return computeScrollRange(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #486 <Method int computeScrollRange(RecyclerView$State)>
	//    3    5:ireturn         
	}

	int convertFocusDirectionToLayoutDirection(int i)
	{
		int j = 0x80000000;
	//    0    0:ldc1            #29  <Int 0x80000000>
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
	//   16   52:ldc1            #29  <Int 0x80000000>
	//   17   54:ireturn         

						case 2: // '\002'
							if(mOrientation == 1)
	//*  18   55:aload_0         
	//*  19   56:getfield        #69  <Field int mOrientation>
	//*  20   59:iconst_1        
	//*  21   60:icmpne          65
								return 1;
	//   22   63:iconst_1        
	//   23   64:ireturn         
							return !isLayoutRTL() ? 1 : -1;
	//   24   65:aload_0         
	//   25   66:invokevirtual   #360 <Method boolean isLayoutRTL()>
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
	//*  32   77:getfield        #69  <Field int mOrientation>
	//*  33   80:iconst_1        
	//*  34   81:icmpne          86
							return -1;
	//   35   84:iconst_m1       
	//   36   85:ireturn         
						return !isLayoutRTL() ? -1 : 1;
	//   37   86:aload_0         
	//   38   87:invokevirtual   #360 <Method boolean isLayoutRTL()>
	//   39   90:ifeq            95
	//   40   93:iconst_1        
	//   41   94:ireturn         
	//   42   95:iconst_m1       
	//   43   96:ireturn         
					}
					if(mOrientation == 1)
	//*  44   97:aload_0         
	//*  45   98:getfield        #69  <Field int mOrientation>
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
	//*  53  110:getfield        #69  <Field int mOrientation>
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
	//   60  121:getfield        #69  <Field int mOrientation>
	//   61  124:iconst_1        
	//   62  125:icmpne          130
	//   63  128:iconst_m1       
	//   64  129:ireturn         
	//   65  130:ldc1            #29  <Int 0x80000000>
	//   66  132:ireturn         
		}
		return mOrientation != 0 ? 0x80000000 : -1;
	//   67  133:aload_0         
	//   68  134:getfield        #69  <Field int mOrientation>
	//   69  137:ifne            142
	//   70  140:iconst_m1       
	//   71  141:ireturn         
	//   72  142:ldc1            #29  <Int 0x80000000>
	//   73  144:ireturn         
	}

	LayoutState createLayoutState()
	{
		return new LayoutState();
	//    0    0:new             #16  <Class LinearLayoutManager$LayoutState>
	//    1    3:dup             
	//    2    4:invokespecial   #500 <Method void LinearLayoutManager$LayoutState()>
	//    3    7:areturn         
	}

	void ensureLayoutState()
	{
		if(mLayoutState == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//*   2    4:ifnonnull       15
			mLayoutState = createLayoutState();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #502 <Method LinearLayoutManager$LayoutState createLayoutState()>
	//    6   12:putfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//    7   15:return          
	}

	int fill(RecyclerView.Recycler recycler, LayoutState layoutstate, RecyclerView.State state, boolean flag)
	{
		int k = layoutstate.mAvailable;
	//    0    0:aload_2         
	//    1    1:getfield        #271 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//    2    4:istore          7
		if(layoutstate.mScrollingOffset != 0x80000000)
	//*   3    6:aload_2         
	//*   4    7:getfield        #329 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//*   5   10:ldc1            #29  <Int 0x80000000>
	//*   6   12:icmpeq          41
		{
			if(layoutstate.mAvailable < 0)
	//*   7   15:aload_2         
	//*   8   16:getfield        #271 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//*   9   19:ifge            35
				layoutstate.mScrollingOffset = layoutstate.mScrollingOffset + layoutstate.mAvailable;
	//   10   22:aload_2         
	//   11   23:aload_2         
	//   12   24:getfield        #329 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//   13   27:aload_2         
	//   14   28:getfield        #271 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//   15   31:iadd            
	//   16   32:putfield        #329 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
			recycleByLayoutState(recycler, layoutstate);
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:aload_2         
	//   20   38:invokespecial   #504 <Method void recycleByLayoutState(RecyclerView$Recycler, LinearLayoutManager$LayoutState)>
		}
		int i = layoutstate.mAvailable + layoutstate.mExtra;
	//   21   41:aload_2         
	//   22   42:getfield        #271 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//   23   45:aload_2         
	//   24   46:getfield        #268 <Field int LinearLayoutManager$LayoutState.mExtra>
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
	//   31   59:getfield        #323 <Field boolean LinearLayoutManager$LayoutState.mInfinite>
	//   32   62:ifne            70
	//   33   65:iload           5
	//   34   67:ifle            245
	//   35   70:aload_2         
	//   36   71:aload_3         
	//   37   72:invokevirtual   #508 <Method boolean LinearLayoutManager$LayoutState.hasMore(RecyclerView$State)>
	//   38   75:ifeq            245
					layoutchunkresult.resetInternal();
	//   39   78:aload           8
	//   40   80:invokevirtual   #511 <Method void LinearLayoutManager$LayoutChunkResult.resetInternal()>
					layoutChunk(recycler, state, layoutstate, layoutchunkresult);
	//   41   83:aload_0         
	//   42   84:aload_1         
	//   43   85:aload_3         
	//   44   86:aload_2         
	//   45   87:aload           8
	//   46   89:invokevirtual   #515 <Method void layoutChunk(RecyclerView$Recycler, RecyclerView$State, LinearLayoutManager$LayoutState, LinearLayoutManager$LayoutChunkResult)>
					if(layoutchunkresult.mFinished)
	//*  47   92:aload           8
	//*  48   94:getfield        #518 <Field boolean LinearLayoutManager$LayoutChunkResult.mFinished>
	//*  49   97:ifeq            103
						break label0;
	//   50  100:goto            245
					layoutstate.mOffset = layoutstate.mOffset + layoutchunkresult.mConsumed * layoutstate.mLayoutDirection;
	//   51  103:aload_2         
	//   52  104:aload_2         
	//   53  105:getfield        #440 <Field int LinearLayoutManager$LayoutState.mOffset>
	//   54  108:aload           8
	//   55  110:getfield        #521 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//   56  113:aload_2         
	//   57  114:getfield        #326 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//   58  117:imul            
	//   59  118:iadd            
	//   60  119:putfield        #440 <Field int LinearLayoutManager$LayoutState.mOffset>
					if(layoutchunkresult.mIgnoreConsumed && mLayoutState.mScrapList == null)
	//*  61  122:aload           8
	//*  62  124:getfield        #524 <Field boolean LinearLayoutManager$LayoutChunkResult.mIgnoreConsumed>
	//*  63  127:ifeq            151
	//*  64  130:aload_0         
	//*  65  131:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//*  66  134:getfield        #259 <Field List LinearLayoutManager$LayoutState.mScrapList>
	//*  67  137:ifnonnull       151
					{
						j = i;
	//   68  140:iload           5
	//   69  142:istore          6
						if(state.isPreLayout())
							break label1;
	//   70  144:aload_3         
	//   71  145:invokevirtual   #216 <Method boolean RecyclerView$State.isPreLayout()>
	//   72  148:ifne            175
					}
					layoutstate.mAvailable = layoutstate.mAvailable - layoutchunkresult.mConsumed;
	//   73  151:aload_2         
	//   74  152:aload_2         
	//   75  153:getfield        #271 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//   76  156:aload           8
	//   77  158:getfield        #521 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//   78  161:isub            
	//   79  162:putfield        #271 <Field int LinearLayoutManager$LayoutState.mAvailable>
					j = i - layoutchunkresult.mConsumed;
	//   80  165:iload           5
	//   81  167:aload           8
	//   82  169:getfield        #521 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//   83  172:isub            
	//   84  173:istore          6
				}
				if(layoutstate.mScrollingOffset != 0x80000000)
	//*  85  175:aload_2         
	//*  86  176:getfield        #329 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//*  87  179:ldc1            #29  <Int 0x80000000>
	//*  88  181:icmpeq          224
				{
					layoutstate.mScrollingOffset = layoutstate.mScrollingOffset + layoutchunkresult.mConsumed;
	//   89  184:aload_2         
	//   90  185:aload_2         
	//   91  186:getfield        #329 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//   92  189:aload           8
	//   93  191:getfield        #521 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//   94  194:iadd            
	//   95  195:putfield        #329 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
					if(layoutstate.mAvailable < 0)
	//*  96  198:aload_2         
	//*  97  199:getfield        #271 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//*  98  202:ifge            218
						layoutstate.mScrollingOffset = layoutstate.mScrollingOffset + layoutstate.mAvailable;
	//   99  205:aload_2         
	//  100  206:aload_2         
	//  101  207:getfield        #329 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//  102  210:aload_2         
	//  103  211:getfield        #271 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//  104  214:iadd            
	//  105  215:putfield        #329 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
					recycleByLayoutState(recycler, layoutstate);
	//  106  218:aload_0         
	//  107  219:aload_1         
	//  108  220:aload_2         
	//  109  221:invokespecial   #504 <Method void recycleByLayoutState(RecyclerView$Recycler, LinearLayoutManager$LayoutState)>
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
	//  117  239:getfield        #527 <Field boolean LinearLayoutManager$LayoutChunkResult.mFocusable>
	//  118  242:ifeq            58
		return k - layoutstate.mAvailable;
	//  119  245:iload           7
	//  120  247:aload_2         
	//  121  248:getfield        #271 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//  122  251:isub            
	//  123  252:ireturn         
	}

	public int findFirstCompletelyVisibleItemPosition()
	{
		View view = findOneVisibleChild(0, getChildCount(), true, false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #124 <Method int getChildCount()>
	//    4    6:iconst_1        
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #168 <Method View findOneVisibleChild(int, int, boolean, boolean)>
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
	//   14   20:invokevirtual   #234 <Method int getPosition(View)>
	//   15   23:ireturn         
	}

	public int findFirstVisibleItemPosition()
	{
		View view = findOneVisibleChild(0, getChildCount(), false, true);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #124 <Method int getChildCount()>
	//    4    6:iconst_0        
	//    5    7:iconst_1        
	//    6    8:invokevirtual   #168 <Method View findOneVisibleChild(int, int, boolean, boolean)>
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
	//   14   20:invokevirtual   #234 <Method int getPosition(View)>
	//   15   23:ireturn         
	}

	public int findLastCompletelyVisibleItemPosition()
	{
		View view = findOneVisibleChild(getChildCount() - 1, -1, true, false);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #124 <Method int getChildCount()>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:iconst_m1       
	//    6    8:iconst_1        
	//    7    9:iconst_0        
	//    8   10:invokevirtual   #168 <Method View findOneVisibleChild(int, int, boolean, boolean)>
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
	//   16   22:invokevirtual   #234 <Method int getPosition(View)>
	//   17   25:ireturn         
	}

	public int findLastVisibleItemPosition()
	{
		View view = findOneVisibleChild(getChildCount() - 1, -1, false, true);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #124 <Method int getChildCount()>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:iconst_m1       
	//    6    8:iconst_0        
	//    7    9:iconst_1        
	//    8   10:invokevirtual   #168 <Method View findOneVisibleChild(int, int, boolean, boolean)>
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
	//   16   22:invokevirtual   #234 <Method int getPosition(View)>
	//   17   25:ireturn         
	}

	View findOnePartiallyOrCompletelyInvisibleChild(int i, int j)
	{
		ensureLayoutState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #127 <Method void ensureLayoutState()>
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
	//   20   32:invokevirtual   #206 <Method View getChildAt(int)>
	//   21   35:areturn         
		char c1;
		if(mOrientationHelper.getDecoratedStart(getChildAt(i)) < mOrientationHelper.getStartAfterPadding())
	//*  22   36:aload_0         
	//*  23   37:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//*  24   40:aload_0         
	//*  25   41:iload_1         
	//*  26   42:invokevirtual   #206 <Method View getChildAt(int)>
	//*  27   45:invokevirtual   #309 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  28   48:aload_0         
	//*  29   49:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//*  30   52:invokevirtual   #200 <Method int OrientationHelper.getStartAfterPadding()>
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
	//*  42   80:getfield        #69  <Field int mOrientation>
	//*  43   83:ifne            99
			return mHorizontalBoundCheck.findOneViewWithinBoundFlags(i, j, ((int) (c)), ((int) (c1)));
	//   44   86:aload_0         
	//   45   87:getfield        #535 <Field ViewBoundsCheck mHorizontalBoundCheck>
	//   46   90:iload_1         
	//   47   91:iload_2         
	//   48   92:iload_3         
	//   49   93:iload           4
	//   50   95:invokevirtual   #541 <Method View ViewBoundsCheck.findOneViewWithinBoundFlags(int, int, int, int)>
	//   51   98:areturn         
		else
			return mVerticalBoundCheck.findOneViewWithinBoundFlags(i, j, ((int) (c)), ((int) (c1)));
	//   52   99:aload_0         
	//   53  100:getfield        #544 <Field ViewBoundsCheck mVerticalBoundCheck>
	//   54  103:iload_1         
	//   55  104:iload_2         
	//   56  105:iload_3         
	//   57  106:iload           4
	//   58  108:invokevirtual   #541 <Method View ViewBoundsCheck.findOneViewWithinBoundFlags(int, int, int, int)>
	//   59  111:areturn         
	}

	View findOneVisibleChild(int i, int j, boolean flag, boolean flag1)
	{
		ensureLayoutState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #127 <Method void ensureLayoutState()>
		char c1 = '\u0140';
	//    2    4:sipush          320
	//    3    7:istore          6
		char c;
		if(flag)
	//*   4    9:iload_3         
	//*   5   10:ifeq            21
			c = '\u6003';
	//    6   13:sipush          24579
	//    7   16:istore          5
		else
	//*   8   18:goto            26
			c = '\u0140';
	//    9   21:sipush          320
	//   10   24:istore          5
		if(!flag1)
	//*  11   26:iload           4
	//*  12   28:ifeq            34
	//*  13   31:goto            37
			c1 = '\0';
	//   14   34:iconst_0        
	//   15   35:istore          6
		if(mOrientation == 0)
	//*  16   37:aload_0         
	//*  17   38:getfield        #69  <Field int mOrientation>
	//*  18   41:ifne            58
			return mHorizontalBoundCheck.findOneViewWithinBoundFlags(i, j, ((int) (c)), ((int) (c1)));
	//   19   44:aload_0         
	//   20   45:getfield        #535 <Field ViewBoundsCheck mHorizontalBoundCheck>
	//   21   48:iload_1         
	//   22   49:iload_2         
	//   23   50:iload           5
	//   24   52:iload           6
	//   25   54:invokevirtual   #541 <Method View ViewBoundsCheck.findOneViewWithinBoundFlags(int, int, int, int)>
	//   26   57:areturn         
		else
			return mVerticalBoundCheck.findOneViewWithinBoundFlags(i, j, ((int) (c)), ((int) (c1)));
	//   27   58:aload_0         
	//   28   59:getfield        #544 <Field ViewBoundsCheck mVerticalBoundCheck>
	//   29   62:iload_1         
	//   30   63:iload_2         
	//   31   64:iload           5
	//   32   66:iload           6
	//   33   68:invokevirtual   #541 <Method View ViewBoundsCheck.findOneViewWithinBoundFlags(int, int, int, int)>
	//   34   71:areturn         
	}

	View findReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int j, int k)
	{
		ensureLayoutState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #127 <Method void ensureLayoutState()>
		int l = mOrientationHelper.getStartAfterPadding();
	//    2    4:aload_0         
	//    3    5:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//    4    8:invokevirtual   #200 <Method int OrientationHelper.getStartAfterPadding()>
	//    5   11:istore          7
		int i1 = mOrientationHelper.getEndAfterPadding();
	//    6   13:aload_0         
	//    7   14:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//    8   17:invokevirtual   #189 <Method int OrientationHelper.getEndAfterPadding()>
	//    9   20:istore          8
		byte byte0;
		if(j > i)
	//*  10   22:iload           4
	//*  11   24:iload_3         
	//*  12   25:icmple          34
			byte0 = 1;
	//   13   28:iconst_1        
	//   14   29:istore          6
		else
	//*  15   31:goto            37
			byte0 = -1;
	//   16   34:iconst_m1       
	//   17   35:istore          6
		state = null;
	//   18   37:aconst_null     
	//   19   38:astore_2        
		Object obj1;
		for(recycler = null; i != j; recycler = ((RecyclerView.Recycler) (obj1)))
	//*  20   39:aconst_null     
	//*  21   40:astore_1        
	//*  22   41:iload_3         
	//*  23   42:iload           4
	//*  24   44:icmpeq          185
		{
			View view = getChildAt(i);
	//   25   47:aload_0         
	//   26   48:iload_3         
	//   27   49:invokevirtual   #206 <Method View getChildAt(int)>
	//   28   52:astore          12
			int j1 = getPosition(view);
	//   29   54:aload_0         
	//   30   55:aload           12
	//   31   57:invokevirtual   #234 <Method int getPosition(View)>
	//   32   60:istore          9
			Object obj = ((Object) (state));
	//   33   62:aload_2         
	//   34   63:astore          10
			obj1 = ((Object) (recycler));
	//   35   65:aload_1         
	//   36   66:astore          11
			if(j1 >= 0)
	//*  37   68:iload           9
	//*  38   70:iflt            171
			{
				obj = ((Object) (state));
	//   39   73:aload_2         
	//   40   74:astore          10
				obj1 = ((Object) (recycler));
	//   41   76:aload_1         
	//   42   77:astore          11
				if(j1 < k)
	//*  43   79:iload           9
	//*  44   81:iload           5
	//*  45   83:icmpge          171
					if(((RecyclerView.LayoutParams)view.getLayoutParams()).isItemRemoved())
	//*  46   86:aload           12
	//*  47   88:invokevirtual   #550 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  48   91:checkcast       #552 <Class RecyclerView$LayoutParams>
	//*  49   94:invokevirtual   #555 <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
	//*  50   97:ifeq            120
					{
						obj = ((Object) (state));
	//   51  100:aload_2         
	//   52  101:astore          10
						obj1 = ((Object) (recycler));
	//   53  103:aload_1         
	//   54  104:astore          11
						if(recycler == null)
	//*  55  106:aload_1         
	//*  56  107:ifnonnull       171
						{
							obj1 = ((Object) (view));
	//   57  110:aload           12
	//   58  112:astore          11
							obj = ((Object) (state));
	//   59  114:aload_2         
	//   60  115:astore          10
						}
					} else
	//*  61  117:goto            171
					{
						if(mOrientationHelper.getDecoratedStart(view) < i1 && mOrientationHelper.getDecoratedEnd(view) >= l)
	//*  62  120:aload_0         
	//*  63  121:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//*  64  124:aload           12
	//*  65  126:invokevirtual   #309 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  66  129:iload           8
	//*  67  131:icmpge          154
	//*  68  134:aload_0         
	//*  69  135:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//*  70  138:aload           12
	//*  71  140:invokevirtual   #353 <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  72  143:iload           7
	//*  73  145:icmpge          151
	//*  74  148:goto            154
							return view;
	//   75  151:aload           12
	//   76  153:areturn         
						obj = ((Object) (state));
	//   77  154:aload_2         
	//   78  155:astore          10
						obj1 = ((Object) (recycler));
	//   79  157:aload_1         
	//   80  158:astore          11
						if(state == null)
	//*  81  160:aload_2         
	//*  82  161:ifnonnull       171
						{
							obj = ((Object) (view));
	//   83  164:aload           12
	//   84  166:astore          10
							obj1 = ((Object) (recycler));
	//   85  168:aload_1         
	//   86  169:astore          11
						}
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
		}

	//   93  179:aload           11
	//   94  181:astore_1        
	//*  95  182:goto            41
		if(state != null)
	//*  96  185:aload_2         
	//*  97  186:ifnull          191
			return ((View) (state));
	//   98  189:aload_2         
	//   99  190:areturn         
		else
			return ((View) (recycler));
	//  100  191:aload_1         
	//  101  192:areturn         
	}

	public View findViewByPosition(int i)
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method int getChildCount()>
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
	//   11   15:invokevirtual   #206 <Method View getChildAt(int)>
	//   12   18:invokevirtual   #234 <Method int getPosition(View)>
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
	//   22   34:invokevirtual   #206 <Method View getChildAt(int)>
	//   23   37:astore          4
			if(getPosition(view) == i)
	//*  24   39:aload_0         
	//*  25   40:aload           4
	//*  26   42:invokevirtual   #234 <Method int getPosition(View)>
	//*  27   45:iload_1         
	//*  28   46:icmpne          52
				return view;
	//   29   49:aload           4
	//   30   51:areturn         
		}
		return super.findViewByPosition(i);
	//   31   52:aload_0         
	//   32   53:iload_1         
	//   33   54:invokespecial   #556 <Method View RecyclerView$LayoutManager.findViewByPosition(int)>
	//   34   57:areturn         
	}

	public RecyclerView.LayoutParams generateDefaultLayoutParams()
	{
		return new RecyclerView.LayoutParams(-2, -2);
	//    0    0:new             #552 <Class RecyclerView$LayoutParams>
	//    1    3:dup             
	//    2    4:bipush          -2
	//    3    6:bipush          -2
	//    4    8:invokespecial   #560 <Method void RecyclerView$LayoutParams(int, int)>
	//    5   11:areturn         
	}

	protected int getExtraLayoutSpace(RecyclerView.State state)
	{
		if(state.hasTargetScrollPosition())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #563 <Method boolean RecyclerView$State.hasTargetScrollPosition()>
	//*   2    4:ifeq            15
			return mOrientationHelper.getTotalSpace();
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//    5   11:invokevirtual   #408 <Method int OrientationHelper.getTotalSpace()>
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
	//    1    1:getfield        #69  <Field int mOrientation>
	//    2    4:ireturn         
	}

	public boolean getRecycleChildrenOnDetach()
	{
		return mRecycleChildrenOnDetach;
	//    0    0:aload_0         
	//    1    1:getfield        #568 <Field boolean mRecycleChildrenOnDetach>
	//    2    4:ireturn         
	}

	public boolean getReverseLayout()
	{
		return mReverseLayout;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field boolean mReverseLayout>
	//    2    4:ireturn         
	}

	public boolean getStackFromEnd()
	{
		return mStackFromEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field boolean mStackFromEnd>
	//    2    4:ireturn         
	}

	public boolean isAutoMeasureEnabled()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	protected boolean isLayoutRTL()
	{
		return getLayoutDirection() == 1;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #574 <Method int getLayoutDirection()>
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
	//    1    1:getfield        #77  <Field boolean mSmoothScrollbarEnabled>
	//    2    4:ireturn         
	}

	void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutState layoutstate, LayoutChunkResult layoutchunkresult)
	{
		recycler = ((RecyclerView.Recycler) (layoutstate.next(recycler)));
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #579 <Method View LinearLayoutManager$LayoutState.next(RecyclerView$Recycler)>
	//    3    5:astore_1        
		if(recycler == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       17
		{
			layoutchunkresult.mFinished = true;
	//    6   10:aload           4
	//    7   12:iconst_1        
	//    8   13:putfield        #518 <Field boolean LinearLayoutManager$LayoutChunkResult.mFinished>
			return;
	//    9   16:return          
		}
		state = ((RecyclerView.State) ((RecyclerView.LayoutParams)((View) (recycler)).getLayoutParams()));
	//   10   17:aload_1         
	//   11   18:invokevirtual   #550 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   12   21:checkcast       #552 <Class RecyclerView$LayoutParams>
	//   13   24:astore_2        
		if(layoutstate.mScrapList == null)
	//*  14   25:aload_3         
	//*  15   26:getfield        #259 <Field List LinearLayoutManager$LayoutState.mScrapList>
	//*  16   29:ifnonnull       79
		{
			boolean flag2 = mShouldReverseLayout;
	//   17   32:aload_0         
	//   18   33:getfield        #73  <Field boolean mShouldReverseLayout>
	//   19   36:istore          12
			boolean flag;
			if(layoutstate.mLayoutDirection == -1)
	//*  20   38:aload_3         
	//*  21   39:getfield        #326 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//*  22   42:iconst_m1       
	//*  23   43:icmpne          52
				flag = true;
	//   24   46:iconst_1        
	//   25   47:istore          11
			else
	//*  26   49:goto            55
				flag = false;
	//   27   52:iconst_0        
	//   28   53:istore          11
			if(flag2 == flag)
	//*  29   55:iload           12
	//*  30   57:iload           11
	//*  31   59:icmpne          70
				addView(((View) (recycler)));
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:invokevirtual   #583 <Method void addView(View)>
			else
	//*  35   67:goto            123
				addView(((View) (recycler)), 0);
	//   36   70:aload_0         
	//   37   71:aload_1         
	//   38   72:iconst_0        
	//   39   73:invokevirtual   #585 <Method void addView(View, int)>
		} else
	//*  40   76:goto            123
		{
			boolean flag3 = mShouldReverseLayout;
	//   41   79:aload_0         
	//   42   80:getfield        #73  <Field boolean mShouldReverseLayout>
	//   43   83:istore          12
			boolean flag1;
			if(layoutstate.mLayoutDirection == -1)
	//*  44   85:aload_3         
	//*  45   86:getfield        #326 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//*  46   89:iconst_m1       
	//*  47   90:icmpne          99
				flag1 = true;
	//   48   93:iconst_1        
	//   49   94:istore          11
			else
	//*  50   96:goto            102
				flag1 = false;
	//   51   99:iconst_0        
	//   52  100:istore          11
			if(flag3 == flag1)
	//*  53  102:iload           12
	//*  54  104:iload           11
	//*  55  106:icmpne          117
				addDisappearingView(((View) (recycler)));
	//   56  109:aload_0         
	//   57  110:aload_1         
	//   58  111:invokevirtual   #588 <Method void addDisappearingView(View)>
			else
	//*  59  114:goto            123
				addDisappearingView(((View) (recycler)), 0);
	//   60  117:aload_0         
	//   61  118:aload_1         
	//   62  119:iconst_0        
	//   63  120:invokevirtual   #590 <Method void addDisappearingView(View, int)>
		}
		measureChildWithMargins(((View) (recycler)), 0, 0);
	//   64  123:aload_0         
	//   65  124:aload_1         
	//   66  125:iconst_0        
	//   67  126:iconst_0        
	//   68  127:invokevirtual   #594 <Method void measureChildWithMargins(View, int, int)>
		layoutchunkresult.mConsumed = mOrientationHelper.getDecoratedMeasurement(((View) (recycler)));
	//   69  130:aload           4
	//   70  132:aload_0         
	//   71  133:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   72  136:aload_1         
	//   73  137:invokevirtual   #253 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   74  140:putfield        #521 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
		int i;
		int j;
		int k;
		int l;
		if(mOrientation == 1)
	//*  75  143:aload_0         
	//*  76  144:getfield        #69  <Field int mOrientation>
	//*  77  147:iconst_1        
	//*  78  148:icmpne          270
		{
			if(isLayoutRTL())
	//*  79  151:aload_0         
	//*  80  152:invokevirtual   #360 <Method boolean isLayoutRTL()>
	//*  81  155:ifeq            185
			{
				i = getWidth() - getPaddingRight();
	//   82  158:aload_0         
	//   83  159:invokevirtual   #597 <Method int getWidth()>
	//   84  162:aload_0         
	//   85  163:invokevirtual   #600 <Method int getPaddingRight()>
	//   86  166:isub            
	//   87  167:istore          5
				l = i - mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler)));
	//   88  169:iload           5
	//   89  171:aload_0         
	//   90  172:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   91  175:aload_1         
	//   92  176:invokevirtual   #603 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//   93  179:isub            
	//   94  180:istore          8
			} else
	//*  95  182:goto            204
			{
				l = getPaddingLeft();
	//   96  185:aload_0         
	//   97  186:invokevirtual   #606 <Method int getPaddingLeft()>
	//   98  189:istore          8
				i = mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler))) + l;
	//   99  191:aload_0         
	//  100  192:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//  101  195:aload_1         
	//  102  196:invokevirtual   #603 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//  103  199:iload           8
	//  104  201:iadd            
	//  105  202:istore          5
			}
			if(layoutstate.mLayoutDirection == -1)
	//* 106  204:aload_3         
	//* 107  205:getfield        #326 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//* 108  208:iconst_m1       
	//* 109  209:icmpne          241
			{
				k = layoutstate.mOffset;
	//  110  212:aload_3         
	//  111  213:getfield        #440 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  112  216:istore          7
				int i1 = layoutstate.mOffset - layoutchunkresult.mConsumed;
	//  113  218:aload_3         
	//  114  219:getfield        #440 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  115  222:aload           4
	//  116  224:getfield        #521 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//  117  227:isub            
	//  118  228:istore          9
				j = i;
	//  119  230:iload           5
	//  120  232:istore          6
				i = i1;
	//  121  234:iload           9
	//  122  236:istore          5
			} else
	//* 123  238:goto            380
			{
				int j1 = layoutstate.mOffset;
	//  124  241:aload_3         
	//  125  242:getfield        #440 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  126  245:istore          9
				k = layoutstate.mOffset + layoutchunkresult.mConsumed;
	//  127  247:aload_3         
	//  128  248:getfield        #440 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  129  251:aload           4
	//  130  253:getfield        #521 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//  131  256:iadd            
	//  132  257:istore          7
				j = i;
	//  133  259:iload           5
	//  134  261:istore          6
				i = j1;
	//  135  263:iload           9
	//  136  265:istore          5
			}
		} else
	//* 137  267:goto            380
		{
			j = getPaddingTop();
	//  138  270:aload_0         
	//  139  271:invokevirtual   #609 <Method int getPaddingTop()>
	//  140  274:istore          6
			i = mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler))) + j;
	//  141  276:aload_0         
	//  142  277:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//  143  280:aload_1         
	//  144  281:invokevirtual   #603 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//  145  284:iload           6
	//  146  286:iadd            
	//  147  287:istore          5
			if(layoutstate.mLayoutDirection == -1)
	//* 148  289:aload_3         
	//* 149  290:getfield        #326 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//* 150  293:iconst_m1       
	//* 151  294:icmpne          342
			{
				k = layoutstate.mOffset;
	//  152  297:aload_3         
	//  153  298:getfield        #440 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  154  301:istore          7
				l = layoutstate.mOffset;
	//  155  303:aload_3         
	//  156  304:getfield        #440 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  157  307:istore          8
				int i2 = layoutchunkresult.mConsumed;
	//  158  309:aload           4
	//  159  311:getfield        #521 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//  160  314:istore          10
				int k1 = i;
	//  161  316:iload           5
	//  162  318:istore          9
				l -= i2;
	//  163  320:iload           8
	//  164  322:iload           10
	//  165  324:isub            
	//  166  325:istore          8
				i = j;
	//  167  327:iload           6
	//  168  329:istore          5
				j = k;
	//  169  331:iload           7
	//  170  333:istore          6
				k = k1;
	//  171  335:iload           9
	//  172  337:istore          7
			} else
	//* 173  339:goto            380
			{
				int l1 = layoutstate.mOffset;
	//  174  342:aload_3         
	//  175  343:getfield        #440 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  176  346:istore          9
				int j2 = layoutstate.mOffset + layoutchunkresult.mConsumed;
	//  177  348:aload_3         
	//  178  349:getfield        #440 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  179  352:aload           4
	//  180  354:getfield        #521 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//  181  357:iadd            
	//  182  358:istore          10
				l = j;
	//  183  360:iload           6
	//  184  362:istore          8
				k = i;
	//  185  364:iload           5
	//  186  366:istore          7
				j = j2;
	//  187  368:iload           10
	//  188  370:istore          6
				i = l;
	//  189  372:iload           8
	//  190  374:istore          5
				l = l1;
	//  191  376:iload           9
	//  192  378:istore          8
			}
		}
		layoutDecoratedWithMargins(((View) (recycler)), l, i, j, k);
	//  193  380:aload_0         
	//  194  381:aload_1         
	//  195  382:iload           8
	//  196  384:iload           5
	//  197  386:iload           6
	//  198  388:iload           7
	//  199  390:invokevirtual   #613 <Method void layoutDecoratedWithMargins(View, int, int, int, int)>
		if(((RecyclerView.LayoutParams) (state)).isItemRemoved() || ((RecyclerView.LayoutParams) (state)).isItemChanged())
	//* 200  393:aload_2         
	//* 201  394:invokevirtual   #555 <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
	//* 202  397:ifne            407
	//* 203  400:aload_2         
	//* 204  401:invokevirtual   #616 <Method boolean RecyclerView$LayoutParams.isItemChanged()>
	//* 205  404:ifeq            413
			layoutchunkresult.mIgnoreConsumed = true;
	//  206  407:aload           4
	//  207  409:iconst_1        
	//  208  410:putfield        #524 <Field boolean LinearLayoutManager$LayoutChunkResult.mIgnoreConsumed>
		layoutchunkresult.mFocusable = ((View) (recycler)).hasFocusable();
	//  209  413:aload           4
	//  210  415:aload_1         
	//  211  416:invokevirtual   #619 <Method boolean View.hasFocusable()>
	//  212  419:putfield        #527 <Field boolean LinearLayoutManager$LayoutChunkResult.mFocusable>
	//  213  422:return          
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
	//    3    3:invokespecial   #625 <Method void RecyclerView$LayoutManager.onDetachedFromWindow(RecyclerView, RecyclerView$Recycler)>
		if(mRecycleChildrenOnDetach)
	//*   4    6:aload_0         
	//*   5    7:getfield        #568 <Field boolean mRecycleChildrenOnDetach>
	//*   6   10:ifeq            22
		{
			removeAndRecycleAllViews(recycler);
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #629 <Method void removeAndRecycleAllViews(RecyclerView$Recycler)>
			recycler.clear();
	//   10   18:aload_2         
	//   11   19:invokevirtual   #632 <Method void RecyclerView$Recycler.clear()>
		}
	//   12   22:return          
	}

	public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		resolveShouldLayoutReverse();
	//    0    0:aload_0         
	//    1    1:invokespecial   #468 <Method void resolveShouldLayoutReverse()>
		if(getChildCount() == 0)
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #124 <Method int getChildCount()>
	//*   4    8:ifne            13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		i = convertFocusDirectionToLayoutDirection(i);
	//    7   13:aload_0         
	//    8   14:iload_2         
	//    9   15:invokevirtual   #636 <Method int convertFocusDirectionToLayoutDirection(int)>
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
	//   17   28:invokevirtual   #127 <Method void ensureLayoutState()>
		ensureLayoutState();
	//   18   31:aload_0         
	//   19   32:invokevirtual   #127 <Method void ensureLayoutState()>
		updateLayoutState(i, (int)(0.3333333F * (float)mOrientationHelper.getTotalSpace()), false, state);
	//   20   35:aload_0         
	//   21   36:iload_2         
	//   22   37:ldc1            #32  <Float 0.3333333F>
	//   23   39:aload_0         
	//   24   40:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   25   43:invokevirtual   #408 <Method int OrientationHelper.getTotalSpace()>
	//   26   46:i2f             
	//   27   47:fmul            
	//   28   48:f2i             
	//   29   49:iconst_0        
	//   30   50:aload           4
	//   31   52:invokespecial   #457 <Method void updateLayoutState(int, int, boolean, RecyclerView$State)>
		mLayoutState.mScrollingOffset = 0x80000000;
	//   32   55:aload_0         
	//   33   56:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   34   59:ldc1            #29  <Int 0x80000000>
	//   35   61:putfield        #329 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
		mLayoutState.mRecycle = false;
	//   36   64:aload_0         
	//   37   65:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   38   68:iconst_0        
	//   39   69:putfield        #320 <Field boolean LinearLayoutManager$LayoutState.mRecycle>
		fill(recycler, mLayoutState, state, true);
	//   40   72:aload_0         
	//   41   73:aload_3         
	//   42   74:aload_0         
	//   43   75:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   44   78:aload           4
	//   45   80:iconst_1        
	//   46   81:invokevirtual   #278 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//   47   84:pop             
		if(i == -1)
	//*  48   85:iload_2         
	//*  49   86:iconst_m1       
	//*  50   87:icmpne          101
			view = findPartiallyOrCompletelyInvisibleChildClosestToStart(recycler, state);
	//   51   90:aload_0         
	//   52   91:aload_3         
	//   53   92:aload           4
	//   54   94:invokespecial   #638 <Method View findPartiallyOrCompletelyInvisibleChildClosestToStart(RecyclerView$Recycler, RecyclerView$State)>
	//   55   97:astore_1        
		else
	//*  56   98:goto            109
			view = findPartiallyOrCompletelyInvisibleChildClosestToEnd(recycler, state);
	//   57  101:aload_0         
	//   58  102:aload_3         
	//   59  103:aload           4
	//   60  105:invokespecial   #640 <Method View findPartiallyOrCompletelyInvisibleChildClosestToEnd(RecyclerView$Recycler, RecyclerView$State)>
	//   61  108:astore_1        
		if(i == -1)
	//*  62  109:iload_2         
	//*  63  110:iconst_m1       
	//*  64  111:icmpne          122
			recycler = ((RecyclerView.Recycler) (getChildClosestToStart()));
	//   65  114:aload_0         
	//   66  115:invokespecial   #261 <Method View getChildClosestToStart()>
	//   67  118:astore_3        
		else
	//*  68  119:goto            127
			recycler = ((RecyclerView.Recycler) (getChildClosestToEnd()));
	//   69  122:aload_0         
	//   70  123:invokespecial   #280 <Method View getChildClosestToEnd()>
	//   71  126:astore_3        
		if(((View) (recycler)).hasFocusable())
	//*  72  127:aload_3         
	//*  73  128:invokevirtual   #619 <Method boolean View.hasFocusable()>
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
	//    2    2:invokespecial   #644 <Method void RecyclerView$LayoutManager.onInitializeAccessibilityEvent(AccessibilityEvent)>
		if(getChildCount() > 0)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #124 <Method int getChildCount()>
	//*   5    9:ifle            28
		{
			accessibilityevent.setFromIndex(findFirstVisibleItemPosition());
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #646 <Method int findFirstVisibleItemPosition()>
	//    9   17:invokevirtual   #651 <Method void AccessibilityEvent.setFromIndex(int)>
			accessibilityevent.setToIndex(findLastVisibleItemPosition());
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:invokevirtual   #653 <Method int findLastVisibleItemPosition()>
	//   13   25:invokevirtual   #656 <Method void AccessibilityEvent.setToIndex(int)>
		}
	//   14   28:return          
	}

	public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		Object obj = ((Object) (mPendingSavedState));
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//    2    4:astore          8
		int k = -1;
	//    3    6:iconst_m1       
	//    4    7:istore          5
		if((obj != null || mPendingScrollPosition != -1) && state.getItemCount() == 0)
	//*   5    9:aload           8
	//*   6   11:ifnonnull       22
	//*   7   14:aload_0         
	//*   8   15:getfield        #79  <Field int mPendingScrollPosition>
	//*   9   18:iconst_m1       
	//*  10   19:icmpeq          35
	//*  11   22:aload_2         
	//*  12   23:invokevirtual   #160 <Method int RecyclerView$State.getItemCount()>
	//*  13   26:ifne            35
		{
			removeAndRecycleAllViews(recycler);
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:invokevirtual   #629 <Method void removeAndRecycleAllViews(RecyclerView$Recycler)>
			return;
	//   17   34:return          
		}
		if(mPendingSavedState != null && mPendingSavedState.hasValidAnchor())
	//*  18   35:aload_0         
	//*  19   36:getfield        #83  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*  20   39:ifnull          63
	//*  21   42:aload_0         
	//*  22   43:getfield        #83  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*  23   46:invokevirtual   #396 <Method boolean LinearLayoutManager$SavedState.hasValidAnchor()>
	//*  24   49:ifeq            63
			mPendingScrollPosition = mPendingSavedState.mAnchorPosition;
	//   25   52:aload_0         
	//   26   53:aload_0         
	//   27   54:getfield        #83  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   28   57:getfield        #466 <Field int LinearLayoutManager$SavedState.mAnchorPosition>
	//   29   60:putfield        #79  <Field int mPendingScrollPosition>
		ensureLayoutState();
	//   30   63:aload_0         
	//   31   64:invokevirtual   #127 <Method void ensureLayoutState()>
		mLayoutState.mRecycle = false;
	//   32   67:aload_0         
	//   33   68:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   34   71:iconst_0        
	//   35   72:putfield        #320 <Field boolean LinearLayoutManager$LayoutState.mRecycle>
		resolveShouldLayoutReverse();
	//   36   75:aload_0         
	//   37   76:invokespecial   #468 <Method void resolveShouldLayoutReverse()>
		obj = ((Object) (getFocusedChild()));
	//   38   79:aload_0         
	//   39   80:invokevirtual   #365 <Method View getFocusedChild()>
	//   40   83:astore          8
		if(mAnchorInfo.mValid && mPendingScrollPosition == -1 && mPendingSavedState == null)
	//*  41   85:aload_0         
	//*  42   86:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//*  43   89:getfield        #661 <Field boolean LinearLayoutManager$AnchorInfo.mValid>
	//*  44   92:ifeq            174
	//*  45   95:aload_0         
	//*  46   96:getfield        #79  <Field int mPendingScrollPosition>
	//*  47   99:iconst_m1       
	//*  48  100:icmpne          174
	//*  49  103:aload_0         
	//*  50  104:getfield        #83  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*  51  107:ifnull          113
	//*  52  110:goto            174
		{
			if(obj != null && (mOrientationHelper.getDecoratedStart(((View) (obj))) >= mOrientationHelper.getEndAfterPadding() || mOrientationHelper.getDecoratedEnd(((View) (obj))) <= mOrientationHelper.getStartAfterPadding()))
	//*  53  113:aload           8
	//*  54  115:ifnull          215
	//*  55  118:aload_0         
	//*  56  119:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//*  57  122:aload           8
	//*  58  124:invokevirtual   #309 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  59  127:aload_0         
	//*  60  128:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//*  61  131:invokevirtual   #189 <Method int OrientationHelper.getEndAfterPadding()>
	//*  62  134:icmpge          156
	//*  63  137:aload_0         
	//*  64  138:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//*  65  141:aload           8
	//*  66  143:invokevirtual   #353 <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  67  146:aload_0         
	//*  68  147:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//*  69  150:invokevirtual   #200 <Method int OrientationHelper.getStartAfterPadding()>
	//*  70  153:icmpgt          215
				mAnchorInfo.assignFromViewAndKeepVisibleRect(((View) (obj)), getPosition(((View) (obj))));
	//   71  156:aload_0         
	//   72  157:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//   73  160:aload           8
	//   74  162:aload_0         
	//   75  163:aload           8
	//   76  165:invokevirtual   #234 <Method int getPosition(View)>
	//   77  168:invokevirtual   #373 <Method void LinearLayoutManager$AnchorInfo.assignFromViewAndKeepVisibleRect(View, int)>
		} else
	//*  78  171:goto            215
		{
			mAnchorInfo.reset();
	//   79  174:aload_0         
	//   80  175:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//   81  178:invokevirtual   #664 <Method void LinearLayoutManager$AnchorInfo.reset()>
			mAnchorInfo.mLayoutFromEnd = mShouldReverseLayout ^ mStackFromEnd;
	//   82  181:aload_0         
	//   83  182:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//   84  185:aload_0         
	//   85  186:getfield        #73  <Field boolean mShouldReverseLayout>
	//   86  189:aload_0         
	//   87  190:getfield        #75  <Field boolean mStackFromEnd>
	//   88  193:ixor            
	//   89  194:putfield        #378 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
			updateAnchorInfoForLayout(recycler, state, mAnchorInfo);
	//   90  197:aload_0         
	//   91  198:aload_1         
	//   92  199:aload_2         
	//   93  200:aload_0         
	//   94  201:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//   95  204:invokespecial   #666 <Method void updateAnchorInfoForLayout(RecyclerView$Recycler, RecyclerView$State, LinearLayoutManager$AnchorInfo)>
			mAnchorInfo.mValid = true;
	//   96  207:aload_0         
	//   97  208:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//   98  211:iconst_1        
	//   99  212:putfield        #661 <Field boolean LinearLayoutManager$AnchorInfo.mValid>
		}
		int j = getExtraLayoutSpace(state);
	//  100  215:aload_0         
	//  101  216:aload_2         
	//  102  217:invokevirtual   #428 <Method int getExtraLayoutSpace(RecyclerView$State)>
	//  103  220:istore          4
		int i;
		if(mLayoutState.mLastScrollDelta >= 0)
	//* 104  222:aload_0         
	//* 105  223:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 106  226:getfield        #669 <Field int LinearLayoutManager$LayoutState.mLastScrollDelta>
	//* 107  229:iflt            241
		{
			i = j;
	//  108  232:iload           4
	//  109  234:istore_3        
			j = 0;
	//  110  235:iconst_0        
	//  111  236:istore          4
		} else
	//* 112  238:goto            243
		{
			i = 0;
	//  113  241:iconst_0        
	//  114  242:istore_3        
		}
		int l = j + mOrientationHelper.getStartAfterPadding();
	//  115  243:iload           4
	//  116  245:aload_0         
	//  117  246:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//  118  249:invokevirtual   #200 <Method int OrientationHelper.getStartAfterPadding()>
	//  119  252:iadd            
	//  120  253:istore          6
		int i1 = i + mOrientationHelper.getEndPadding();
	//  121  255:iload_3         
	//  122  256:aload_0         
	//  123  257:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//  124  260:invokevirtual   #431 <Method int OrientationHelper.getEndPadding()>
	//  125  263:iadd            
	//  126  264:istore          7
		i = l;
	//  127  266:iload           6
	//  128  268:istore_3        
		j = i1;
	//  129  269:iload           7
	//  130  271:istore          4
		if(state.isPreLayout())
	//* 131  273:aload_2         
	//* 132  274:invokevirtual   #216 <Method boolean RecyclerView$State.isPreLayout()>
	//* 133  277:ifeq            420
		{
			i = l;
	//  134  280:iload           6
	//  135  282:istore_3        
			j = i1;
	//  136  283:iload           7
	//  137  285:istore          4
			if(mPendingScrollPosition != -1)
	//* 138  287:aload_0         
	//* 139  288:getfield        #79  <Field int mPendingScrollPosition>
	//* 140  291:iconst_m1       
	//* 141  292:icmpeq          420
			{
				i = l;
	//  142  295:iload           6
	//  143  297:istore_3        
				j = i1;
	//  144  298:iload           7
	//  145  300:istore          4
				if(mPendingScrollPositionOffset != 0x80000000)
	//* 146  302:aload_0         
	//* 147  303:getfield        #81  <Field int mPendingScrollPositionOffset>
	//* 148  306:ldc1            #29  <Int 0x80000000>
	//* 149  308:icmpeq          420
				{
					View view = findViewByPosition(mPendingScrollPosition);
	//  150  311:aload_0         
	//  151  312:aload_0         
	//  152  313:getfield        #79  <Field int mPendingScrollPosition>
	//  153  316:invokevirtual   #405 <Method View findViewByPosition(int)>
	//  154  319:astore          8
					i = l;
	//  155  321:iload           6
	//  156  323:istore_3        
					j = i1;
	//  157  324:iload           7
	//  158  326:istore          4
					if(view != null)
	//* 159  328:aload           8
	//* 160  330:ifnull          420
					{
						if(mShouldReverseLayout)
	//* 161  333:aload_0         
	//* 162  334:getfield        #73  <Field boolean mShouldReverseLayout>
	//* 163  337:ifeq            366
						{
							i = mOrientationHelper.getEndAfterPadding() - mOrientationHelper.getDecoratedEnd(view) - mPendingScrollPositionOffset;
	//  164  340:aload_0         
	//  165  341:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//  166  344:invokevirtual   #189 <Method int OrientationHelper.getEndAfterPadding()>
	//  167  347:aload_0         
	//  168  348:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//  169  351:aload           8
	//  170  353:invokevirtual   #353 <Method int OrientationHelper.getDecoratedEnd(View)>
	//  171  356:isub            
	//  172  357:aload_0         
	//  173  358:getfield        #81  <Field int mPendingScrollPositionOffset>
	//  174  361:isub            
	//  175  362:istore_3        
						} else
	//* 176  363:goto            395
						{
							i = mOrientationHelper.getDecoratedStart(view);
	//  177  366:aload_0         
	//  178  367:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//  179  370:aload           8
	//  180  372:invokevirtual   #309 <Method int OrientationHelper.getDecoratedStart(View)>
	//  181  375:istore_3        
							j = mOrientationHelper.getStartAfterPadding();
	//  182  376:aload_0         
	//  183  377:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//  184  380:invokevirtual   #200 <Method int OrientationHelper.getStartAfterPadding()>
	//  185  383:istore          4
							i = mPendingScrollPositionOffset - (i - j);
	//  186  385:aload_0         
	//  187  386:getfield        #81  <Field int mPendingScrollPositionOffset>
	//  188  389:iload_3         
	//  189  390:iload           4
	//  190  392:isub            
	//  191  393:isub            
	//  192  394:istore_3        
						}
						if(i > 0)
	//* 193  395:iload_3         
	//* 194  396:ifle            411
						{
							i = l + i;
	//  195  399:iload           6
	//  196  401:iload_3         
	//  197  402:iadd            
	//  198  403:istore_3        
							j = i1;
	//  199  404:iload           7
	//  200  406:istore          4
						} else
	//* 201  408:goto            420
						{
							j = i1 - i;
	//  202  411:iload           7
	//  203  413:iload_3         
	//  204  414:isub            
	//  205  415:istore          4
							i = l;
	//  206  417:iload           6
	//  207  419:istore_3        
						}
					}
				}
			}
		}
		if(mAnchorInfo.mLayoutFromEnd ? mShouldReverseLayout : !mShouldReverseLayout)
	//* 208  420:aload_0         
	//* 209  421:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//* 210  424:getfield        #378 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
	//* 211  427:ifeq            443
	//* 212  430:aload_0         
	//* 213  431:getfield        #73  <Field boolean mShouldReverseLayout>
	//* 214  434:ifeq            450
			k = 1;
	//  215  437:iconst_1        
	//  216  438:istore          5
	//  217  440:goto            450
	//  218  443:aload_0         
	//  219  444:getfield        #73  <Field boolean mShouldReverseLayout>
	//  220  447:ifeq            437
		onAnchorReady(recycler, state, mAnchorInfo, k);
	//  221  450:aload_0         
	//  222  451:aload_1         
	//  223  452:aload_2         
	//  224  453:aload_0         
	//  225  454:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//  226  457:iload           5
	//  227  459:invokevirtual   #671 <Method void onAnchorReady(RecyclerView$Recycler, RecyclerView$State, LinearLayoutManager$AnchorInfo, int)>
		detachAndScrapAttachedViews(recycler);
	//  228  462:aload_0         
	//  229  463:aload_1         
	//  230  464:invokevirtual   #674 <Method void detachAndScrapAttachedViews(RecyclerView$Recycler)>
		mLayoutState.mInfinite = resolveIsInfinite();
	//  231  467:aload_0         
	//  232  468:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  233  471:aload_0         
	//  234  472:invokevirtual   #425 <Method boolean resolveIsInfinite()>
	//  235  475:putfield        #323 <Field boolean LinearLayoutManager$LayoutState.mInfinite>
		mLayoutState.mIsPreLayout = state.isPreLayout();
	//  236  478:aload_0         
	//  237  479:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  238  482:aload_2         
	//  239  483:invokevirtual   #216 <Method boolean RecyclerView$State.isPreLayout()>
	//  240  486:putfield        #677 <Field boolean LinearLayoutManager$LayoutState.mIsPreLayout>
		if(mAnchorInfo.mLayoutFromEnd)
	//* 241  489:aload_0         
	//* 242  490:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//* 243  493:getfield        #378 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
	//* 244  496:ifeq            698
		{
			updateLayoutStateToFillStart(mAnchorInfo);
	//  245  499:aload_0         
	//  246  500:aload_0         
	//  247  501:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//  248  504:invokespecial   #679 <Method void updateLayoutStateToFillStart(LinearLayoutManager$AnchorInfo)>
			mLayoutState.mExtra = i;
	//  249  507:aload_0         
	//  250  508:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  251  511:iload_3         
	//  252  512:putfield        #268 <Field int LinearLayoutManager$LayoutState.mExtra>
			fill(recycler, mLayoutState, state, false);
	//  253  515:aload_0         
	//  254  516:aload_1         
	//  255  517:aload_0         
	//  256  518:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  257  521:aload_2         
	//  258  522:iconst_0        
	//  259  523:invokevirtual   #278 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//  260  526:pop             
			k = mLayoutState.mOffset;
	//  261  527:aload_0         
	//  262  528:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  263  531:getfield        #440 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  264  534:istore          5
			int j1 = mLayoutState.mCurrentPosition;
	//  265  536:aload_0         
	//  266  537:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  267  540:getfield        #437 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//  268  543:istore          7
			i = j;
	//  269  545:iload           4
	//  270  547:istore_3        
			if(mLayoutState.mAvailable > 0)
	//* 271  548:aload_0         
	//* 272  549:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 273  552:getfield        #271 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//* 274  555:ifle            569
				i = j + mLayoutState.mAvailable;
	//  275  558:iload           4
	//  276  560:aload_0         
	//  277  561:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  278  564:getfield        #271 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//  279  567:iadd            
	//  280  568:istore_3        
			updateLayoutStateToFillEnd(mAnchorInfo);
	//  281  569:aload_0         
	//  282  570:aload_0         
	//  283  571:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//  284  574:invokespecial   #681 <Method void updateLayoutStateToFillEnd(LinearLayoutManager$AnchorInfo)>
			mLayoutState.mExtra = i;
	//  285  577:aload_0         
	//  286  578:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  287  581:iload_3         
	//  288  582:putfield        #268 <Field int LinearLayoutManager$LayoutState.mExtra>
			LayoutState layoutstate = mLayoutState;
	//  289  585:aload_0         
	//  290  586:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  291  589:astore          8
			layoutstate.mCurrentPosition = layoutstate.mCurrentPosition + mLayoutState.mItemDirection;
	//  292  591:aload           8
	//  293  593:aload           8
	//  294  595:getfield        #437 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//  295  598:aload_0         
	//  296  599:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  297  602:getfield        #434 <Field int LinearLayoutManager$LayoutState.mItemDirection>
	//  298  605:iadd            
	//  299  606:putfield        #437 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
			fill(recycler, mLayoutState, state, false);
	//  300  609:aload_0         
	//  301  610:aload_1         
	//  302  611:aload_0         
	//  303  612:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  304  615:aload_2         
	//  305  616:iconst_0        
	//  306  617:invokevirtual   #278 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//  307  620:pop             
			l = mLayoutState.mOffset;
	//  308  621:aload_0         
	//  309  622:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  310  625:getfield        #440 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  311  628:istore          6
			j = k;
	//  312  630:iload           5
	//  313  632:istore          4
			i = l;
	//  314  634:iload           6
	//  315  636:istore_3        
			if(mLayoutState.mAvailable > 0)
	//* 316  637:aload_0         
	//* 317  638:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 318  641:getfield        #271 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//* 319  644:ifle            896
			{
				i = mLayoutState.mAvailable;
	//  320  647:aload_0         
	//  321  648:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  322  651:getfield        #271 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//  323  654:istore_3        
				updateLayoutStateToFillStart(j1, k);
	//  324  655:aload_0         
	//  325  656:iload           7
	//  326  658:iload           5
	//  327  660:invokespecial   #265 <Method void updateLayoutStateToFillStart(int, int)>
				mLayoutState.mExtra = i;
	//  328  663:aload_0         
	//  329  664:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  330  667:iload_3         
	//  331  668:putfield        #268 <Field int LinearLayoutManager$LayoutState.mExtra>
				fill(recycler, mLayoutState, state, false);
	//  332  671:aload_0         
	//  333  672:aload_1         
	//  334  673:aload_0         
	//  335  674:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  336  677:aload_2         
	//  337  678:iconst_0        
	//  338  679:invokevirtual   #278 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//  339  682:pop             
				j = mLayoutState.mOffset;
	//  340  683:aload_0         
	//  341  684:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  342  687:getfield        #440 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  343  690:istore          4
				i = l;
	//  344  692:iload           6
	//  345  694:istore_3        
			}
		} else
	//* 346  695:goto            896
		{
			updateLayoutStateToFillEnd(mAnchorInfo);
	//  347  698:aload_0         
	//  348  699:aload_0         
	//  349  700:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//  350  703:invokespecial   #681 <Method void updateLayoutStateToFillEnd(LinearLayoutManager$AnchorInfo)>
			mLayoutState.mExtra = j;
	//  351  706:aload_0         
	//  352  707:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  353  710:iload           4
	//  354  712:putfield        #268 <Field int LinearLayoutManager$LayoutState.mExtra>
			fill(recycler, mLayoutState, state, false);
	//  355  715:aload_0         
	//  356  716:aload_1         
	//  357  717:aload_0         
	//  358  718:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  359  721:aload_2         
	//  360  722:iconst_0        
	//  361  723:invokevirtual   #278 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//  362  726:pop             
			k = mLayoutState.mOffset;
	//  363  727:aload_0         
	//  364  728:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  365  731:getfield        #440 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  366  734:istore          5
			int k1 = mLayoutState.mCurrentPosition;
	//  367  736:aload_0         
	//  368  737:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  369  740:getfield        #437 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//  370  743:istore          7
			j = i;
	//  371  745:iload_3         
	//  372  746:istore          4
			if(mLayoutState.mAvailable > 0)
	//* 373  748:aload_0         
	//* 374  749:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 375  752:getfield        #271 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//* 376  755:ifle            769
				j = i + mLayoutState.mAvailable;
	//  377  758:iload_3         
	//  378  759:aload_0         
	//  379  760:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  380  763:getfield        #271 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//  381  766:iadd            
	//  382  767:istore          4
			updateLayoutStateToFillStart(mAnchorInfo);
	//  383  769:aload_0         
	//  384  770:aload_0         
	//  385  771:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//  386  774:invokespecial   #679 <Method void updateLayoutStateToFillStart(LinearLayoutManager$AnchorInfo)>
			mLayoutState.mExtra = j;
	//  387  777:aload_0         
	//  388  778:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  389  781:iload           4
	//  390  783:putfield        #268 <Field int LinearLayoutManager$LayoutState.mExtra>
			LayoutState layoutstate1 = mLayoutState;
	//  391  786:aload_0         
	//  392  787:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  393  790:astore          8
			layoutstate1.mCurrentPosition = layoutstate1.mCurrentPosition + mLayoutState.mItemDirection;
	//  394  792:aload           8
	//  395  794:aload           8
	//  396  796:getfield        #437 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//  397  799:aload_0         
	//  398  800:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  399  803:getfield        #434 <Field int LinearLayoutManager$LayoutState.mItemDirection>
	//  400  806:iadd            
	//  401  807:putfield        #437 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
			fill(recycler, mLayoutState, state, false);
	//  402  810:aload_0         
	//  403  811:aload_1         
	//  404  812:aload_0         
	//  405  813:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  406  816:aload_2         
	//  407  817:iconst_0        
	//  408  818:invokevirtual   #278 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//  409  821:pop             
			l = mLayoutState.mOffset;
	//  410  822:aload_0         
	//  411  823:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  412  826:getfield        #440 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  413  829:istore          6
			j = l;
	//  414  831:iload           6
	//  415  833:istore          4
			i = k;
	//  416  835:iload           5
	//  417  837:istore_3        
			if(mLayoutState.mAvailable > 0)
	//* 418  838:aload_0         
	//* 419  839:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 420  842:getfield        #271 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//* 421  845:ifle            896
			{
				i = mLayoutState.mAvailable;
	//  422  848:aload_0         
	//  423  849:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  424  852:getfield        #271 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//  425  855:istore_3        
				updateLayoutStateToFillEnd(k1, k);
	//  426  856:aload_0         
	//  427  857:iload           7
	//  428  859:iload           5
	//  429  861:invokespecial   #283 <Method void updateLayoutStateToFillEnd(int, int)>
				mLayoutState.mExtra = i;
	//  430  864:aload_0         
	//  431  865:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  432  868:iload_3         
	//  433  869:putfield        #268 <Field int LinearLayoutManager$LayoutState.mExtra>
				fill(recycler, mLayoutState, state, false);
	//  434  872:aload_0         
	//  435  873:aload_1         
	//  436  874:aload_0         
	//  437  875:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  438  878:aload_2         
	//  439  879:iconst_0        
	//  440  880:invokevirtual   #278 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//  441  883:pop             
				i = mLayoutState.mOffset;
	//  442  884:aload_0         
	//  443  885:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  444  888:getfield        #440 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  445  891:istore_3        
				j = l;
	//  446  892:iload           6
	//  447  894:istore          4
			}
		}
		k = j;
	//  448  896:iload           4
	//  449  898:istore          5
		l = i;
	//  450  900:iload_3         
	//  451  901:istore          6
		if(getChildCount() > 0)
	//* 452  903:aload_0         
	//* 453  904:invokevirtual   #124 <Method int getChildCount()>
	//* 454  907:ifle            1011
			if(mShouldReverseLayout ^ mStackFromEnd)
	//* 455  910:aload_0         
	//* 456  911:getfield        #73  <Field boolean mShouldReverseLayout>
	//* 457  914:aload_0         
	//* 458  915:getfield        #75  <Field boolean mStackFromEnd>
	//* 459  918:ixor            
	//* 460  919:ifeq            969
			{
				l = fixLayoutEndGap(i, recycler, state, true);
	//  461  922:aload_0         
	//  462  923:iload_3         
	//  463  924:aload_1         
	//  464  925:aload_2         
	//  465  926:iconst_1        
	//  466  927:invokespecial   #683 <Method int fixLayoutEndGap(int, RecyclerView$Recycler, RecyclerView$State, boolean)>
	//  467  930:istore          6
				k = j + l;
	//  468  932:iload           4
	//  469  934:iload           6
	//  470  936:iadd            
	//  471  937:istore          5
				j = fixLayoutStartGap(k, recycler, state, false);
	//  472  939:aload_0         
	//  473  940:iload           5
	//  474  942:aload_1         
	//  475  943:aload_2         
	//  476  944:iconst_0        
	//  477  945:invokespecial   #685 <Method int fixLayoutStartGap(int, RecyclerView$Recycler, RecyclerView$State, boolean)>
	//  478  948:istore          4
				k += j;
	//  479  950:iload           5
	//  480  952:iload           4
	//  481  954:iadd            
	//  482  955:istore          5
				l = i + l + j;
	//  483  957:iload_3         
	//  484  958:iload           6
	//  485  960:iadd            
	//  486  961:iload           4
	//  487  963:iadd            
	//  488  964:istore          6
			} else
	//* 489  966:goto            1011
			{
				k = fixLayoutStartGap(j, recycler, state, true);
	//  490  969:aload_0         
	//  491  970:iload           4
	//  492  972:aload_1         
	//  493  973:aload_2         
	//  494  974:iconst_1        
	//  495  975:invokespecial   #685 <Method int fixLayoutStartGap(int, RecyclerView$Recycler, RecyclerView$State, boolean)>
	//  496  978:istore          5
				i += k;
	//  497  980:iload_3         
	//  498  981:iload           5
	//  499  983:iadd            
	//  500  984:istore_3        
				l = fixLayoutEndGap(i, recycler, state, false);
	//  501  985:aload_0         
	//  502  986:iload_3         
	//  503  987:aload_1         
	//  504  988:aload_2         
	//  505  989:iconst_0        
	//  506  990:invokespecial   #683 <Method int fixLayoutEndGap(int, RecyclerView$Recycler, RecyclerView$State, boolean)>
	//  507  993:istore          6
				k = j + k + l;
	//  508  995:iload           4
	//  509  997:iload           5
	//  510  999:iadd            
	//  511 1000:iload           6
	//  512 1002:iadd            
	//  513 1003:istore          5
				l = i + l;
	//  514 1005:iload_3         
	//  515 1006:iload           6
	//  516 1008:iadd            
	//  517 1009:istore          6
			}
		layoutForPredictiveAnimations(recycler, state, k, l);
	//  518 1011:aload_0         
	//  519 1012:aload_1         
	//  520 1013:aload_2         
	//  521 1014:iload           5
	//  522 1016:iload           6
	//  523 1018:invokespecial   #687 <Method void layoutForPredictiveAnimations(RecyclerView$Recycler, RecyclerView$State, int, int)>
		if(!state.isPreLayout())
	//* 524 1021:aload_2         
	//* 525 1022:invokevirtual   #216 <Method boolean RecyclerView$State.isPreLayout()>
	//* 526 1025:ifne            1038
			mOrientationHelper.onLayoutComplete();
	//  527 1028:aload_0         
	//  528 1029:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//  529 1032:invokevirtual   #690 <Method void OrientationHelper.onLayoutComplete()>
		else
	//* 530 1035:goto            1045
			mAnchorInfo.reset();
	//  531 1038:aload_0         
	//  532 1039:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//  533 1042:invokevirtual   #664 <Method void LinearLayoutManager$AnchorInfo.reset()>
		mLastStackFromEnd = mStackFromEnd;
	//  534 1045:aload_0         
	//  535 1046:aload_0         
	//  536 1047:getfield        #75  <Field boolean mStackFromEnd>
	//  537 1050:putfield        #375 <Field boolean mLastStackFromEnd>
	//  538 1053:return          
	}

	public void onLayoutCompleted(RecyclerView.State state)
	{
		super.onLayoutCompleted(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #694 <Method void RecyclerView$LayoutManager.onLayoutCompleted(RecyclerView$State)>
		mPendingSavedState = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #83  <Field LinearLayoutManager$SavedState mPendingSavedState>
		mPendingScrollPosition = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #79  <Field int mPendingScrollPosition>
		mPendingScrollPositionOffset = 0x80000000;
	//    9   15:aload_0         
	//   10   16:ldc1            #29  <Int 0x80000000>
	//   11   18:putfield        #81  <Field int mPendingScrollPositionOffset>
		mAnchorInfo.reset();
	//   12   21:aload_0         
	//   13   22:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//   14   25:invokevirtual   #664 <Method void LinearLayoutManager$AnchorInfo.reset()>
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
	//    6   12:putfield        #83  <Field LinearLayoutManager$SavedState mPendingSavedState>
			requestLayout();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #699 <Method void requestLayout()>
		}
	//    9   19:return          
	}

	public Parcelable onSaveInstanceState()
	{
		if(mPendingSavedState != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*   2    4:ifnull          19
			return ((Parcelable) (new SavedState(mPendingSavedState)));
	//    3    7:new             #19  <Class LinearLayoutManager$SavedState>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #83  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//    7   15:invokespecial   #704 <Method void LinearLayoutManager$SavedState(LinearLayoutManager$SavedState)>
	//    8   18:areturn         
		SavedState savedstate = new SavedState();
	//    9   19:new             #19  <Class LinearLayoutManager$SavedState>
	//   10   22:dup             
	//   11   23:invokespecial   #705 <Method void LinearLayoutManager$SavedState()>
	//   12   26:astore_2        
		if(getChildCount() > 0)
	//*  13   27:aload_0         
	//*  14   28:invokevirtual   #124 <Method int getChildCount()>
	//*  15   31:ifle            129
		{
			ensureLayoutState();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #127 <Method void ensureLayoutState()>
			boolean flag = mLastStackFromEnd ^ mShouldReverseLayout;
	//   18   38:aload_0         
	//   19   39:getfield        #375 <Field boolean mLastStackFromEnd>
	//   20   42:aload_0         
	//   21   43:getfield        #73  <Field boolean mShouldReverseLayout>
	//   22   46:ixor            
	//   23   47:istore_1        
			savedstate.mAnchorLayoutFromEnd = flag;
	//   24   48:aload_2         
	//   25   49:iload_1         
	//   26   50:putfield        #399 <Field boolean LinearLayoutManager$SavedState.mAnchorLayoutFromEnd>
			if(flag)
	//*  27   53:iload_1         
	//*  28   54:ifeq            93
			{
				View view = getChildClosestToEnd();
	//   29   57:aload_0         
	//   30   58:invokespecial   #280 <Method View getChildClosestToEnd()>
	//   31   61:astore_3        
				savedstate.mAnchorOffset = mOrientationHelper.getEndAfterPadding() - mOrientationHelper.getDecoratedEnd(view);
	//   32   62:aload_2         
	//   33   63:aload_0         
	//   34   64:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   35   67:invokevirtual   #189 <Method int OrientationHelper.getEndAfterPadding()>
	//   36   70:aload_0         
	//   37   71:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   38   74:aload_3         
	//   39   75:invokevirtual   #353 <Method int OrientationHelper.getDecoratedEnd(View)>
	//   40   78:isub            
	//   41   79:putfield        #402 <Field int LinearLayoutManager$SavedState.mAnchorOffset>
				savedstate.mAnchorPosition = getPosition(view);
	//   42   82:aload_2         
	//   43   83:aload_0         
	//   44   84:aload_3         
	//   45   85:invokevirtual   #234 <Method int getPosition(View)>
	//   46   88:putfield        #466 <Field int LinearLayoutManager$SavedState.mAnchorPosition>
				return ((Parcelable) (savedstate));
	//   47   91:aload_2         
	//   48   92:areturn         
			} else
			{
				View view1 = getChildClosestToStart();
	//   49   93:aload_0         
	//   50   94:invokespecial   #261 <Method View getChildClosestToStart()>
	//   51   97:astore_3        
				savedstate.mAnchorPosition = getPosition(view1);
	//   52   98:aload_2         
	//   53   99:aload_0         
	//   54  100:aload_3         
	//   55  101:invokevirtual   #234 <Method int getPosition(View)>
	//   56  104:putfield        #466 <Field int LinearLayoutManager$SavedState.mAnchorPosition>
				savedstate.mAnchorOffset = mOrientationHelper.getDecoratedStart(view1) - mOrientationHelper.getStartAfterPadding();
	//   57  107:aload_2         
	//   58  108:aload_0         
	//   59  109:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   60  112:aload_3         
	//   61  113:invokevirtual   #309 <Method int OrientationHelper.getDecoratedStart(View)>
	//   62  116:aload_0         
	//   63  117:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   64  120:invokevirtual   #200 <Method int OrientationHelper.getStartAfterPadding()>
	//   65  123:isub            
	//   66  124:putfield        #402 <Field int LinearLayoutManager$SavedState.mAnchorOffset>
				return ((Parcelable) (savedstate));
	//   67  127:aload_2         
	//   68  128:areturn         
			}
		} else
		{
			savedstate.invalidateAnchor();
	//   69  129:aload_2         
	//   70  130:invokevirtual   #708 <Method void LinearLayoutManager$SavedState.invalidateAnchor()>
			return ((Parcelable) (savedstate));
	//   71  133:aload_2         
	//   72  134:areturn         
		}
	}

	public void prepareForDrop(View view, View view1, int i, int j)
	{
		assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
	//    0    0:aload_0         
	//    1    1:ldc2            #716 <String "Cannot drop a view during a scroll or layout calculation">
	//    2    4:invokevirtual   #717 <Method void assertNotInLayoutOrScroll(String)>
		ensureLayoutState();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #127 <Method void ensureLayoutState()>
		resolveShouldLayoutReverse();
	//    5   11:aload_0         
	//    6   12:invokespecial   #468 <Method void resolveShouldLayoutReverse()>
		i = getPosition(view);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #234 <Method int getPosition(View)>
	//   10   20:istore_3        
		j = getPosition(view1);
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #234 <Method int getPosition(View)>
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
	//*  24   42:getfield        #73  <Field boolean mShouldReverseLayout>
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
	//   32   57:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   33   60:invokevirtual   #189 <Method int OrientationHelper.getEndAfterPadding()>
	//   34   63:aload_0         
	//   35   64:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   36   67:aload_2         
	//   37   68:invokevirtual   #309 <Method int OrientationHelper.getDecoratedStart(View)>
	//   38   71:aload_0         
	//   39   72:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   40   75:aload_1         
	//   41   76:invokevirtual   #253 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   42   79:iadd            
	//   43   80:isub            
	//   44   81:invokevirtual   #720 <Method void scrollToPositionWithOffset(int, int)>
				return;
	//   45   84:return          
			} else
			{
				scrollToPositionWithOffset(j, mOrientationHelper.getEndAfterPadding() - mOrientationHelper.getDecoratedEnd(view1));
	//   46   85:aload_0         
	//   47   86:iload           4
	//   48   88:aload_0         
	//   49   89:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   50   92:invokevirtual   #189 <Method int OrientationHelper.getEndAfterPadding()>
	//   51   95:aload_0         
	//   52   96:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   53   99:aload_2         
	//   54  100:invokevirtual   #353 <Method int OrientationHelper.getDecoratedEnd(View)>
	//   55  103:isub            
	//   56  104:invokevirtual   #720 <Method void scrollToPositionWithOffset(int, int)>
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
	//   64  117:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   65  120:aload_2         
	//   66  121:invokevirtual   #309 <Method int OrientationHelper.getDecoratedStart(View)>
	//   67  124:invokevirtual   #720 <Method void scrollToPositionWithOffset(int, int)>
			return;
	//   68  127:return          
		} else
		{
			scrollToPositionWithOffset(j, mOrientationHelper.getDecoratedEnd(view1) - mOrientationHelper.getDecoratedMeasurement(view));
	//   69  128:aload_0         
	//   70  129:iload           4
	//   71  131:aload_0         
	//   72  132:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   73  135:aload_2         
	//   74  136:invokevirtual   #353 <Method int OrientationHelper.getDecoratedEnd(View)>
	//   75  139:aload_0         
	//   76  140:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   77  143:aload_1         
	//   78  144:invokevirtual   #253 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   79  147:isub            
	//   80  148:invokevirtual   #720 <Method void scrollToPositionWithOffset(int, int)>
			return;
	//   81  151:return          
		}
	}

	boolean resolveIsInfinite()
	{
		return mOrientationHelper.getMode() == 0 && mOrientationHelper.getEnd() == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//    2    4:invokevirtual   #724 <Method int OrientationHelper.getMode()>
	//    3    7:ifne            22
	//    4   10:aload_0         
	//    5   11:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//    6   14:invokevirtual   #345 <Method int OrientationHelper.getEnd()>
	//    7   17:ifne            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	int scrollBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(getChildCount() != 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #124 <Method int getChildCount()>
	//*   2    4:ifeq            114
		{
			if(i == 0)
	//*   3    7:iload_1         
	//*   4    8:ifne            13
				return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
			mLayoutState.mRecycle = true;
	//    7   13:aload_0         
	//    8   14:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//    9   17:iconst_1        
	//   10   18:putfield        #320 <Field boolean LinearLayoutManager$LayoutState.mRecycle>
			ensureLayoutState();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #127 <Method void ensureLayoutState()>
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
	//   21   39:invokestatic    #455 <Method int Math.abs(int)>
	//   22   42:istore          5
			updateLayoutState(((int) (byte0)), j, true, state);
	//   23   44:aload_0         
	//   24   45:iload           4
	//   25   47:iload           5
	//   26   49:iconst_1        
	//   27   50:aload_3         
	//   28   51:invokespecial   #457 <Method void updateLayoutState(int, int, boolean, RecyclerView$State)>
			int k = mLayoutState.mScrollingOffset + fill(recycler, mLayoutState, state, false);
	//   29   54:aload_0         
	//   30   55:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   31   58:getfield        #329 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//   32   61:aload_0         
	//   33   62:aload_2         
	//   34   63:aload_0         
	//   35   64:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   36   67:aload_3         
	//   37   68:iconst_0        
	//   38   69:invokevirtual   #278 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
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
	//*  47   86:icmple          95
				i = byte0 * k;
	//   48   89:iload           4
	//   49   91:iload           6
	//   50   93:imul            
	//   51   94:istore_1        
			mOrientationHelper.offsetChildren(-i);
	//   52   95:aload_0         
	//   53   96:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   54   99:iload_1         
	//   55  100:ineg            
	//   56  101:invokevirtual   #196 <Method void OrientationHelper.offsetChildren(int)>
			mLayoutState.mLastScrollDelta = i;
	//   57  104:aload_0         
	//   58  105:getfield        #255 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   59  108:iload_1         
	//   60  109:putfield        #669 <Field int LinearLayoutManager$LayoutState.mLastScrollDelta>
			return i;
	//   61  112:iload_1         
	//   62  113:ireturn         
		} else
		{
			return 0;
	//   63  114:iconst_0        
	//   64  115:ireturn         
		}
	}

	public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(mOrientation == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field int mOrientation>
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
	//   10   14:invokevirtual   #193 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//   11   17:ireturn         
	}

	public void scrollToPosition(int i)
	{
		mPendingScrollPosition = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #79  <Field int mPendingScrollPosition>
		mPendingScrollPositionOffset = 0x80000000;
	//    3    5:aload_0         
	//    4    6:ldc1            #29  <Int 0x80000000>
	//    5    8:putfield        #81  <Field int mPendingScrollPositionOffset>
		if(mPendingSavedState != null)
	//*   6   11:aload_0         
	//*   7   12:getfield        #83  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*   8   15:ifnull          25
			mPendingSavedState.invalidateAnchor();
	//    9   18:aload_0         
	//   10   19:getfield        #83  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   11   22:invokevirtual   #708 <Method void LinearLayoutManager$SavedState.invalidateAnchor()>
		requestLayout();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #699 <Method void requestLayout()>
	//   14   29:return          
	}

	public void scrollToPositionWithOffset(int i, int j)
	{
		mPendingScrollPosition = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #79  <Field int mPendingScrollPosition>
		mPendingScrollPositionOffset = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #81  <Field int mPendingScrollPositionOffset>
		if(mPendingSavedState != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #83  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*   8   14:ifnull          24
			mPendingSavedState.invalidateAnchor();
	//    9   17:aload_0         
	//   10   18:getfield        #83  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   11   21:invokevirtual   #708 <Method void LinearLayoutManager$SavedState.invalidateAnchor()>
		requestLayout();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #699 <Method void requestLayout()>
	//   14   28:return          
	}

	public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(mOrientation == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field int mOrientation>
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
	//    9   13:invokevirtual   #193 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
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
	//*   1    1:ifeq            43
	//*   2    4:iload_1         
	//*   3    5:iconst_1        
	//*   4    6:icmpeq          43
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #294 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #295 <Method void StringBuilder()>
	//    8   16:astore_2        
			stringbuilder.append("invalid orientation:");
	//    9   17:aload_2         
	//   10   18:ldc2            #730 <String "invalid orientation:">
	//   11   21:invokevirtual   #301 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
			stringbuilder.append(i);
	//   13   25:aload_2         
	//   14   26:iload_1         
	//   15   27:invokevirtual   #304 <Method StringBuilder StringBuilder.append(int)>
	//   16   30:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   17   31:new             #732 <Class IllegalArgumentException>
	//   18   34:dup             
	//   19   35:aload_2         
	//   20   36:invokevirtual   #313 <Method String StringBuilder.toString()>
	//   21   39:invokespecial   #734 <Method void IllegalArgumentException(String)>
	//   22   42:athrow          
		}
		assertNotInLayoutOrScroll(((String) (null)));
	//   23   43:aload_0         
	//   24   44:aconst_null     
	//   25   45:invokevirtual   #717 <Method void assertNotInLayoutOrScroll(String)>
		if(i != mOrientation || mOrientationHelper == null)
	//*  26   48:iload_1         
	//*  27   49:aload_0         
	//*  28   50:getfield        #69  <Field int mOrientation>
	//*  29   53:icmpne          63
	//*  30   56:aload_0         
	//*  31   57:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//*  32   60:ifnonnull       92
		{
			mOrientationHelper = OrientationHelper.createOrientationHelper(((RecyclerView.LayoutManager) (this)), i);
	//   33   63:aload_0         
	//   34   64:aload_0         
	//   35   65:iload_1         
	//   36   66:invokestatic    #738 <Method OrientationHelper OrientationHelper.createOrientationHelper(RecyclerView$LayoutManager, int)>
	//   37   69:putfield        #129 <Field OrientationHelper mOrientationHelper>
			mAnchorInfo.mOrientationHelper = mOrientationHelper;
	//   38   72:aload_0         
	//   39   73:getfield        #86  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//   40   76:aload_0         
	//   41   77:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   42   80:putfield        #739 <Field OrientationHelper LinearLayoutManager$AnchorInfo.mOrientationHelper>
			mOrientation = i;
	//   43   83:aload_0         
	//   44   84:iload_1         
	//   45   85:putfield        #69  <Field int mOrientation>
			requestLayout();
	//   46   88:aload_0         
	//   47   89:invokevirtual   #699 <Method void requestLayout()>
		}
	//   48   92:return          
	}

	public void setRecycleChildrenOnDetach(boolean flag)
	{
		mRecycleChildrenOnDetach = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #568 <Field boolean mRecycleChildrenOnDetach>
	//    3    5:return          
	}

	public void setReverseLayout(boolean flag)
	{
		assertNotInLayoutOrScroll(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #717 <Method void assertNotInLayoutOrScroll(String)>
		if(flag == mReverseLayout)
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #71  <Field boolean mReverseLayout>
	//*   6   10:icmpne          14
		{
			return;
	//    7   13:return          
		} else
		{
			mReverseLayout = flag;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:putfield        #71  <Field boolean mReverseLayout>
			requestLayout();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #699 <Method void requestLayout()>
			return;
	//   13   23:return          
		}
	}

	public void setSmoothScrollbarEnabled(boolean flag)
	{
		mSmoothScrollbarEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #77  <Field boolean mSmoothScrollbarEnabled>
	//    3    5:return          
	}

	public void setStackFromEnd(boolean flag)
	{
		assertNotInLayoutOrScroll(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #717 <Method void assertNotInLayoutOrScroll(String)>
		if(mStackFromEnd == flag)
	//*   3    5:aload_0         
	//*   4    6:getfield        #75  <Field boolean mStackFromEnd>
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
	//   10   16:putfield        #75  <Field boolean mStackFromEnd>
			requestLayout();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #699 <Method void requestLayout()>
			return;
	//   13   23:return          
		}
	}

	boolean shouldMeasureTwice()
	{
		return getHeightMode() != 0x40000000 && getWidthMode() != 0x40000000 && hasFlexibleChildInBothOrientations();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #745 <Method int getHeightMode()>
	//    2    4:ldc2            #746 <Int 0x40000000>
	//    3    7:icmpeq          29
	//    4   10:aload_0         
	//    5   11:invokevirtual   #749 <Method int getWidthMode()>
	//    6   14:ldc2            #746 <Int 0x40000000>
	//    7   17:icmpeq          29
	//    8   20:aload_0         
	//    9   21:invokevirtual   #752 <Method boolean hasFlexibleChildInBothOrientations()>
	//   10   24:ifeq            29
	//   11   27:iconst_1        
	//   12   28:ireturn         
	//   13   29:iconst_0        
	//   14   30:ireturn         
	}

	public void smoothScrollToPosition(RecyclerView recyclerview, RecyclerView.State state, int i)
	{
		recyclerview = ((RecyclerView) (new LinearSmoothScroller(recyclerview.getContext())));
	//    0    0:new             #756 <Class LinearSmoothScroller>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #762 <Method Context RecyclerView.getContext()>
	//    4    8:invokespecial   #764 <Method void LinearSmoothScroller(Context)>
	//    5   11:astore_1        
		((LinearSmoothScroller) (recyclerview)).setTargetPosition(i);
	//    6   12:aload_1         
	//    7   13:iload_3         
	//    8   14:invokevirtual   #767 <Method void LinearSmoothScroller.setTargetPosition(int)>
		startSmoothScroll(((RecyclerView.SmoothScroller) (recyclerview)));
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #771 <Method void startSmoothScroll(RecyclerView$SmoothScroller)>
	//   12   22:return          
	}

	public boolean supportsPredictiveItemAnimations()
	{
		return mPendingSavedState == null && mLastStackFromEnd == mStackFromEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//    2    4:ifnonnull       20
	//    3    7:aload_0         
	//    4    8:getfield        #375 <Field boolean mLastStackFromEnd>
	//    5   11:aload_0         
	//    6   12:getfield        #75  <Field boolean mStackFromEnd>
	//    7   15:icmpne          20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	void validateChildOrder()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #294 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #295 <Method void StringBuilder()>
	//    3    7:astore          8
		stringbuilder.append("validating child count ");
	//    4    9:aload           8
	//    5   11:ldc2            #774 <String "validating child count ">
	//    6   14:invokevirtual   #301 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:pop             
		stringbuilder.append(getChildCount());
	//    8   18:aload           8
	//    9   20:aload_0         
	//   10   21:invokevirtual   #124 <Method int getChildCount()>
	//   11   24:invokevirtual   #304 <Method StringBuilder StringBuilder.append(int)>
	//   12   27:pop             
		Log.d("LinearLayoutManager", stringbuilder.toString());
	//   13   28:ldc1            #36  <String "LinearLayoutManager">
	//   14   30:aload           8
	//   15   32:invokevirtual   #313 <Method String StringBuilder.toString()>
	//   16   35:invokestatic    #292 <Method int Log.d(String, String)>
	//   17   38:pop             
		if(getChildCount() < 1)
	//*  18   39:aload_0         
	//*  19   40:invokevirtual   #124 <Method int getChildCount()>
	//*  20   43:iconst_1        
	//*  21   44:icmpge          48
			return;
	//   22   47:return          
		boolean flag2 = false;
	//   23   48:iconst_0        
	//   24   49:istore          7
		boolean flag = false;
	//   25   51:iconst_0        
	//   26   52:istore          6
		int k = getPosition(getChildAt(0));
	//   27   54:aload_0         
	//   28   55:aload_0         
	//   29   56:iconst_0        
	//   30   57:invokevirtual   #206 <Method View getChildAt(int)>
	//   31   60:invokevirtual   #234 <Method int getPosition(View)>
	//   32   63:istore_2        
		int l = mOrientationHelper.getDecoratedStart(getChildAt(0));
	//   33   64:aload_0         
	//   34   65:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   35   68:aload_0         
	//   36   69:iconst_0        
	//   37   70:invokevirtual   #206 <Method View getChildAt(int)>
	//   38   73:invokevirtual   #309 <Method int OrientationHelper.getDecoratedStart(View)>
	//   39   76:istore_3        
		if(mShouldReverseLayout)
	//*  40   77:aload_0         
	//*  41   78:getfield        #73  <Field boolean mShouldReverseLayout>
	//*  42   81:ifeq            206
		{
			for(int i = 1; i < getChildCount(); i++)
	//*  43   84:iconst_1        
	//*  44   85:istore_1        
	//*  45   86:iload_1         
	//*  46   87:aload_0         
	//*  47   88:invokevirtual   #124 <Method int getChildCount()>
	//*  48   91:icmpge          332
			{
				View view = getChildAt(i);
	//   49   94:aload_0         
	//   50   95:iload_1         
	//   51   96:invokevirtual   #206 <Method View getChildAt(int)>
	//   52   99:astore          8
				int i1 = getPosition(view);
	//   53  101:aload_0         
	//   54  102:aload           8
	//   55  104:invokevirtual   #234 <Method int getPosition(View)>
	//   56  107:istore          4
				int k1 = mOrientationHelper.getDecoratedStart(view);
	//   57  109:aload_0         
	//   58  110:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//   59  113:aload           8
	//   60  115:invokevirtual   #309 <Method int OrientationHelper.getDecoratedStart(View)>
	//   61  118:istore          5
				if(i1 < k)
	//*  62  120:iload           4
	//*  63  122:iload_2         
	//*  64  123:icmpge          178
				{
					logChildren();
	//   65  126:aload_0         
	//   66  127:invokespecial   #776 <Method void logChildren()>
					StringBuilder stringbuilder1 = new StringBuilder();
	//   67  130:new             #294 <Class StringBuilder>
	//   68  133:dup             
	//   69  134:invokespecial   #295 <Method void StringBuilder()>
	//   70  137:astore          8
					stringbuilder1.append("detected invalid position. loc invalid? ");
	//   71  139:aload           8
	//   72  141:ldc2            #778 <String "detected invalid position. loc invalid? ">
	//   73  144:invokevirtual   #301 <Method StringBuilder StringBuilder.append(String)>
	//   74  147:pop             
					if(k1 < l)
	//*  75  148:iload           5
	//*  76  150:iload_3         
	//*  77  151:icmpge          157
						flag = true;
	//   78  154:iconst_1        
	//   79  155:istore          6
					stringbuilder1.append(flag);
	//   80  157:aload           8
	//   81  159:iload           6
	//   82  161:invokevirtual   #781 <Method StringBuilder StringBuilder.append(boolean)>
	//   83  164:pop             
					throw new RuntimeException(stringbuilder1.toString());
	//   84  165:new             #783 <Class RuntimeException>
	//   85  168:dup             
	//   86  169:aload           8
	//   87  171:invokevirtual   #313 <Method String StringBuilder.toString()>
	//   88  174:invokespecial   #784 <Method void RuntimeException(String)>
	//   89  177:athrow          
				}
				if(k1 > l)
	//*  90  178:iload           5
	//*  91  180:iload_3         
	//*  92  181:icmple          199
				{
					logChildren();
	//   93  184:aload_0         
	//   94  185:invokespecial   #776 <Method void logChildren()>
					throw new RuntimeException("detected invalid location");
	//   95  188:new             #783 <Class RuntimeException>
	//   96  191:dup             
	//   97  192:ldc2            #786 <String "detected invalid location">
	//   98  195:invokespecial   #784 <Method void RuntimeException(String)>
	//   99  198:athrow          
				}
			}

	//  100  199:iload_1         
	//  101  200:iconst_1        
	//  102  201:iadd            
	//  103  202:istore_1        
		} else
	//* 104  203:goto            86
		{
			for(int j = 1; j < getChildCount(); j++)
	//* 105  206:iconst_1        
	//* 106  207:istore_1        
	//* 107  208:iload_1         
	//* 108  209:aload_0         
	//* 109  210:invokevirtual   #124 <Method int getChildCount()>
	//* 110  213:icmpge          332
			{
				View view1 = getChildAt(j);
	//  111  216:aload_0         
	//  112  217:iload_1         
	//  113  218:invokevirtual   #206 <Method View getChildAt(int)>
	//  114  221:astore          8
				int j1 = getPosition(view1);
	//  115  223:aload_0         
	//  116  224:aload           8
	//  117  226:invokevirtual   #234 <Method int getPosition(View)>
	//  118  229:istore          4
				int l1 = mOrientationHelper.getDecoratedStart(view1);
	//  119  231:aload_0         
	//  120  232:getfield        #129 <Field OrientationHelper mOrientationHelper>
	//  121  235:aload           8
	//  122  237:invokevirtual   #309 <Method int OrientationHelper.getDecoratedStart(View)>
	//  123  240:istore          5
				if(j1 < k)
	//* 124  242:iload           4
	//* 125  244:iload_2         
	//* 126  245:icmpge          304
				{
					logChildren();
	//  127  248:aload_0         
	//  128  249:invokespecial   #776 <Method void logChildren()>
					StringBuilder stringbuilder2 = new StringBuilder();
	//  129  252:new             #294 <Class StringBuilder>
	//  130  255:dup             
	//  131  256:invokespecial   #295 <Method void StringBuilder()>
	//  132  259:astore          8
					stringbuilder2.append("detected invalid position. loc invalid? ");
	//  133  261:aload           8
	//  134  263:ldc2            #778 <String "detected invalid position. loc invalid? ">
	//  135  266:invokevirtual   #301 <Method StringBuilder StringBuilder.append(String)>
	//  136  269:pop             
					boolean flag1 = flag2;
	//  137  270:iload           7
	//  138  272:istore          6
					if(l1 < l)
	//* 139  274:iload           5
	//* 140  276:iload_3         
	//* 141  277:icmpge          283
						flag1 = true;
	//  142  280:iconst_1        
	//  143  281:istore          6
					stringbuilder2.append(flag1);
	//  144  283:aload           8
	//  145  285:iload           6
	//  146  287:invokevirtual   #781 <Method StringBuilder StringBuilder.append(boolean)>
	//  147  290:pop             
					throw new RuntimeException(stringbuilder2.toString());
	//  148  291:new             #783 <Class RuntimeException>
	//  149  294:dup             
	//  150  295:aload           8
	//  151  297:invokevirtual   #313 <Method String StringBuilder.toString()>
	//  152  300:invokespecial   #784 <Method void RuntimeException(String)>
	//  153  303:athrow          
				}
				if(l1 < l)
	//* 154  304:iload           5
	//* 155  306:iload_3         
	//* 156  307:icmpge          325
				{
					logChildren();
	//  157  310:aload_0         
	//  158  311:invokespecial   #776 <Method void logChildren()>
					throw new RuntimeException("detected invalid location");
	//  159  314:new             #783 <Class RuntimeException>
	//  160  317:dup             
	//  161  318:ldc2            #786 <String "detected invalid location">
	//  162  321:invokespecial   #784 <Method void RuntimeException(String)>
	//  163  324:athrow          
				}
			}

	//  164  325:iload_1         
	//  165  326:iconst_1        
	//  166  327:iadd            
	//  167  328:istore_1        
		}
	//* 168  329:goto            208
	//  169  332:return          
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
