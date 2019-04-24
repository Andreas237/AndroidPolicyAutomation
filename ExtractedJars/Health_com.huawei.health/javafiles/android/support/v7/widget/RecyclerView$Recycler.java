// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView, RecyclerViewAccessibilityDelegate, AdapterHelper, ViewInfoStore, 
//			ChildHelper

public final class RecyclerView$Recycler
{

	private void attachAccessibilityDelegate(View view)
	{
		if(isAccessibilityEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field RecyclerView this$0>
	//*   2    4:invokevirtual   #61  <Method boolean RecyclerView.isAccessibilityEnabled()>
	//*   3    7:ifeq            43
		{
			if(ViewCompat.getImportantForAccessibility(view) == 0)
	//*   4   10:aload_1         
	//*   5   11:invokestatic    #67  <Method int ViewCompat.getImportantForAccessibility(View)>
	//*   6   14:ifne            22
				ViewCompat.setImportantForAccessibility(view, 1);
	//    7   17:aload_1         
	//    8   18:iconst_1        
	//    9   19:invokestatic    #71  <Method void ViewCompat.setImportantForAccessibility(View, int)>
			if(!ViewCompat.hasAccessibilityDelegate(view))
	//*  10   22:aload_1         
	//*  11   23:invokestatic    #75  <Method boolean ViewCompat.hasAccessibilityDelegate(View)>
	//*  12   26:ifne            43
				ViewCompat.setAccessibilityDelegate(view, mAccessibilityDelegate.getItemDelegate());
	//   13   29:aload_1         
	//   14   30:aload_0         
	//   15   31:getfield        #30  <Field RecyclerView this$0>
	//   16   34:getfield        #79  <Field RecyclerViewAccessibilityDelegate RecyclerView.mAccessibilityDelegate>
	//   17   37:invokevirtual   #85  <Method android.support.v4.view.AccessibilityDelegateCompat RecyclerViewAccessibilityDelegate.getItemDelegate()>
	//   18   40:invokestatic    #89  <Method void ViewCompat.setAccessibilityDelegate(View, android.support.v4.view.AccessibilityDelegateCompat)>
		}
	//   19   43:return          
	}

	private void invalidateDisplayListInt(r r)
	{
		if(r.itemView instanceof ViewGroup)
	//*   0    0:aload_1         
	//*   1    1:getfield        #97  <Field View RecyclerView$ViewHolder.itemView>
	//*   2    4:instanceof      #99  <Class ViewGroup>
	//*   3    7:ifeq            22
			invalidateDisplayListInt((ViewGroup)r.itemView, false);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:getfield        #97  <Field View RecyclerView$ViewHolder.itemView>
	//    7   15:checkcast       #99  <Class ViewGroup>
	//    8   18:iconst_0        
	//    9   19:invokespecial   #102 <Method void invalidateDisplayListInt(ViewGroup, boolean)>
	//   10   22:return          
	}

	private void invalidateDisplayListInt(ViewGroup viewgroup, boolean flag)
	{
		for(int i = viewgroup.getChildCount() - 1; i >= 0; i--)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #106 <Method int ViewGroup.getChildCount()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_3        
	//*   5    7:iload_3         
	//*   6    8:iflt            43
		{
			View view = viewgroup.getChildAt(i);
	//    7   11:aload_1         
	//    8   12:iload_3         
	//    9   13:invokevirtual   #110 <Method View ViewGroup.getChildAt(int)>
	//   10   16:astore          4
			if(view instanceof ViewGroup)
	//*  11   18:aload           4
	//*  12   20:instanceof      #99  <Class ViewGroup>
	//*  13   23:ifeq            36
				invalidateDisplayListInt((ViewGroup)view, true);
	//   14   26:aload_0         
	//   15   27:aload           4
	//   16   29:checkcast       #99  <Class ViewGroup>
	//   17   32:iconst_1        
	//   18   33:invokespecial   #102 <Method void invalidateDisplayListInt(ViewGroup, boolean)>
		}

	//   19   36:iload_3         
	//   20   37:iconst_1        
	//   21   38:isub            
	//   22   39:istore_3        
	//*  23   40:goto            7
		if(!flag)
	//*  24   43:iload_2         
	//*  25   44:ifne            48
			return;
	//   26   47:return          
		if(viewgroup.getVisibility() == 4)
	//*  27   48:aload_1         
	//*  28   49:invokevirtual   #113 <Method int ViewGroup.getVisibility()>
	//*  29   52:iconst_4        
	//*  30   53:icmpne          67
		{
			viewgroup.setVisibility(0);
	//   31   56:aload_1         
	//   32   57:iconst_0        
	//   33   58:invokevirtual   #117 <Method void ViewGroup.setVisibility(int)>
			viewgroup.setVisibility(4);
	//   34   61:aload_1         
	//   35   62:iconst_4        
	//   36   63:invokevirtual   #117 <Method void ViewGroup.setVisibility(int)>
			return;
	//   37   66:return          
		} else
		{
			int j = viewgroup.getVisibility();
	//   38   67:aload_1         
	//   39   68:invokevirtual   #113 <Method int ViewGroup.getVisibility()>
	//   40   71:istore_3        
			viewgroup.setVisibility(4);
	//   41   72:aload_1         
	//   42   73:iconst_4        
	//   43   74:invokevirtual   #117 <Method void ViewGroup.setVisibility(int)>
			viewgroup.setVisibility(j);
	//   44   77:aload_1         
	//   45   78:iload_3         
	//   46   79:invokevirtual   #117 <Method void ViewGroup.setVisibility(int)>
			return;
	//   47   82:return          
		}
	}

	private boolean tryBindViewHolderByDeadline(r r, int i, int j, long l)
	{
		r.mOwnerRecyclerView = RecyclerView.this;
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #30  <Field RecyclerView this$0>
	//    3    5:putfield        #122 <Field RecyclerView RecyclerView$ViewHolder.mOwnerRecyclerView>
		int k = r.getItemViewType();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #125 <Method int RecyclerView$ViewHolder.getItemViewType()>
	//    6   12:istore          6
		long l1 = getNanoTime();
	//    7   14:aload_0         
	//    8   15:getfield        #30  <Field RecyclerView this$0>
	//    9   18:invokevirtual   #129 <Method long RecyclerView.getNanoTime()>
	//   10   21:lstore          7
		if(l != 0xffffffffL && !mRecyclerPool.willBindInTime(k, l1, l))
	//*  11   23:lload           4
	//*  12   25:ldc2w           #130 <Long 0xffffffffL>
	//*  13   28:lcmp            
	//*  14   29:ifeq            50
	//*  15   32:aload_0         
	//*  16   33:getfield        #133 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//*  17   36:iload           6
	//*  18   38:lload           7
	//*  19   40:lload           4
	//*  20   42:invokevirtual   #139 <Method boolean RecyclerView$RecycledViewPool.willBindInTime(int, long, long)>
	//*  21   45:ifne            50
			return false;
	//   22   48:iconst_0        
	//   23   49:ireturn         
		mAdapter.bindViewHolder(r, i);
	//   24   50:aload_0         
	//   25   51:getfield        #30  <Field RecyclerView this$0>
	//   26   54:getfield        #143 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   27   57:aload_1         
	//   28   58:iload_2         
	//   29   59:invokevirtual   #149 <Method void RecyclerView$Adapter.bindViewHolder(RecyclerView$ViewHolder, int)>
		l = getNanoTime();
	//   30   62:aload_0         
	//   31   63:getfield        #30  <Field RecyclerView this$0>
	//   32   66:invokevirtual   #129 <Method long RecyclerView.getNanoTime()>
	//   33   69:lstore          4
		mRecyclerPool.factorInBindTime(r.getItemViewType(), l - l1);
	//   34   71:aload_0         
	//   35   72:getfield        #133 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//   36   75:aload_1         
	//   37   76:invokevirtual   #125 <Method int RecyclerView$ViewHolder.getItemViewType()>
	//   38   79:lload           4
	//   39   81:lload           7
	//   40   83:lsub            
	//   41   84:invokevirtual   #153 <Method void RecyclerView$RecycledViewPool.factorInBindTime(int, long)>
		attachAccessibilityDelegate(r.itemView);
	//   42   87:aload_0         
	//   43   88:aload_1         
	//   44   89:getfield        #97  <Field View RecyclerView$ViewHolder.itemView>
	//   45   92:invokespecial   #155 <Method void attachAccessibilityDelegate(View)>
		if(mState.isPreLayout())
	//*  46   95:aload_0         
	//*  47   96:getfield        #30  <Field RecyclerView this$0>
	//*  48   99:getfield        #159 <Field RecyclerView$State RecyclerView.mState>
	//*  49  102:invokevirtual   #164 <Method boolean RecyclerView$State.isPreLayout()>
	//*  50  105:ifeq            113
			r.mPreLayoutPosition = j;
	//   51  108:aload_1         
	//   52  109:iload_3         
	//   53  110:putfield        #167 <Field int RecyclerView$ViewHolder.mPreLayoutPosition>
		return true;
	//   54  113:iconst_1        
	//   55  114:ireturn         
	}

	void addViewHolderToRecycledViewPool(r r, boolean flag)
	{
		RecyclerView.clearNestedRecyclerViewIfNotNested(r);
	//    0    0:aload_1         
	//    1    1:invokestatic    #172 <Method void RecyclerView.clearNestedRecyclerViewIfNotNested(RecyclerView$ViewHolder)>
		ViewCompat.setAccessibilityDelegate(r.itemView, ((android.support.v4.view.AccessibilityDelegateCompat) (null)));
	//    2    4:aload_1         
	//    3    5:getfield        #97  <Field View RecyclerView$ViewHolder.itemView>
	//    4    8:aconst_null     
	//    5    9:invokestatic    #89  <Method void ViewCompat.setAccessibilityDelegate(View, android.support.v4.view.AccessibilityDelegateCompat)>
		if(flag)
	//*   6   12:iload_2         
	//*   7   13:ifeq            21
			dispatchViewRecycled(r);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #175 <Method void dispatchViewRecycled(RecyclerView$ViewHolder)>
		r.mOwnerRecyclerView = null;
	//   11   21:aload_1         
	//   12   22:aconst_null     
	//   13   23:putfield        #122 <Field RecyclerView RecyclerView$ViewHolder.mOwnerRecyclerView>
		getRecycledViewPool().putRecycledView(r);
	//   14   26:aload_0         
	//   15   27:invokevirtual   #179 <Method RecyclerView$RecycledViewPool getRecycledViewPool()>
	//   16   30:aload_1         
	//   17   31:invokevirtual   #182 <Method void RecyclerView$RecycledViewPool.putRecycledView(RecyclerView$ViewHolder)>
	//   18   34:return          
	}

	public void bindViewToPosition(View view, int i)
	{
		r r = RecyclerView.getChildViewHolderInt(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #187 <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:astore          5
		if(r == null)
	//*   3    6:aload           5
	//*   4    8:ifnonnull       21
			throw new IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter");
	//    5   11:new             #189 <Class IllegalArgumentException>
	//    6   14:dup             
	//    7   15:ldc1            #191 <String "The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter">
	//    8   17:invokespecial   #194 <Method void IllegalArgumentException(String)>
	//    9   20:athrow          
		int j = mAdapterHelper.findPositionOffset(i);
	//   10   21:aload_0         
	//   11   22:getfield        #30  <Field RecyclerView this$0>
	//   12   25:getfield        #198 <Field AdapterHelper RecyclerView.mAdapterHelper>
	//   13   28:iload_2         
	//   14   29:invokevirtual   #204 <Method int AdapterHelper.findPositionOffset(int)>
	//   15   32:istore_3        
		if(j < 0 || j >= mAdapter.getItemCount())
	//*  16   33:iload_3         
	//*  17   34:iflt            51
	//*  18   37:iload_3         
	//*  19   38:aload_0         
	//*  20   39:getfield        #30  <Field RecyclerView this$0>
	//*  21   42:getfield        #143 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  22   45:invokevirtual   #207 <Method int RecyclerView$Adapter.getItemCount()>
	//*  23   48:icmplt          110
			throw new IndexOutOfBoundsException((new StringBuilder()).append("Inconsistency detected. Invalid item position ").append(i).append("(offset:").append(j).append(").").append("state:").append(mState.getItemCount()).toString());
	//   24   51:new             #209 <Class IndexOutOfBoundsException>
	//   25   54:dup             
	//   26   55:new             #211 <Class StringBuilder>
	//   27   58:dup             
	//   28   59:invokespecial   #212 <Method void StringBuilder()>
	//   29   62:ldc1            #214 <String "Inconsistency detected. Invalid item position ">
	//   30   64:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   31   67:iload_2         
	//   32   68:invokevirtual   #221 <Method StringBuilder StringBuilder.append(int)>
	//   33   71:ldc1            #223 <String "(offset:">
	//   34   73:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   35   76:iload_3         
	//   36   77:invokevirtual   #221 <Method StringBuilder StringBuilder.append(int)>
	//   37   80:ldc1            #225 <String ").">
	//   38   82:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   39   85:ldc1            #227 <String "state:">
	//   40   87:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   41   90:aload_0         
	//   42   91:getfield        #30  <Field RecyclerView this$0>
	//   43   94:getfield        #159 <Field RecyclerView$State RecyclerView.mState>
	//   44   97:invokevirtual   #228 <Method int RecyclerView$State.getItemCount()>
	//   45  100:invokevirtual   #221 <Method StringBuilder StringBuilder.append(int)>
	//   46  103:invokevirtual   #232 <Method String StringBuilder.toString()>
	//   47  106:invokespecial   #233 <Method void IndexOutOfBoundsException(String)>
	//   48  109:athrow          
		tryBindViewHolderByDeadline(r, j, i, 0xffffffffL);
	//   49  110:aload_0         
	//   50  111:aload           5
	//   51  113:iload_3         
	//   52  114:iload_2         
	//   53  115:ldc2w           #130 <Long 0xffffffffL>
	//   54  118:invokespecial   #235 <Method boolean tryBindViewHolderByDeadline(RecyclerView$ViewHolder, int, int, long)>
	//   55  121:pop             
		view = ((View) (r.itemView.getLayoutParams()));
	//   56  122:aload           5
	//   57  124:getfield        #97  <Field View RecyclerView$ViewHolder.itemView>
	//   58  127:invokevirtual   #241 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   59  130:astore_1        
		if(view == null)
	//*  60  131:aload_1         
	//*  61  132:ifnonnull       158
		{
			view = ((View) ((ams)generateDefaultLayoutParams()));
	//   62  135:aload_0         
	//   63  136:getfield        #30  <Field RecyclerView this$0>
	//   64  139:invokevirtual   #244 <Method android.view.ViewGroup$LayoutParams RecyclerView.generateDefaultLayoutParams()>
	//   65  142:checkcast       #246 <Class RecyclerView$LayoutParams>
	//   66  145:astore_1        
			r.itemView.setLayoutParams(((android.view.) (view)));
	//   67  146:aload           5
	//   68  148:getfield        #97  <Field View RecyclerView$ViewHolder.itemView>
	//   69  151:aload_1         
	//   70  152:invokevirtual   #250 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		} else
	//*  71  155:goto            198
		if(!checkLayoutParams(((android.view.) (view))))
	//*  72  158:aload_0         
	//*  73  159:getfield        #30  <Field RecyclerView this$0>
	//*  74  162:aload_1         
	//*  75  163:invokevirtual   #254 <Method boolean RecyclerView.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//*  76  166:ifne            193
		{
			view = ((View) ((ams)generateLayoutParams(((android.view.) (view)))));
	//   77  169:aload_0         
	//   78  170:getfield        #30  <Field RecyclerView this$0>
	//   79  173:aload_1         
	//   80  174:invokevirtual   #258 <Method android.view.ViewGroup$LayoutParams RecyclerView.generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   81  177:checkcast       #246 <Class RecyclerView$LayoutParams>
	//   82  180:astore_1        
			r.itemView.setLayoutParams(((android.view.) (view)));
	//   83  181:aload           5
	//   84  183:getfield        #97  <Field View RecyclerView$ViewHolder.itemView>
	//   85  186:aload_1         
	//   86  187:invokevirtual   #250 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		} else
	//*  87  190:goto            198
		{
			view = ((View) ((ams)view));
	//   88  193:aload_1         
	//   89  194:checkcast       #246 <Class RecyclerView$LayoutParams>
	//   90  197:astore_1        
		}
		view.mInsetsDirty = true;
	//   91  198:aload_1         
	//   92  199:iconst_1        
	//   93  200:putfield        #262 <Field boolean RecyclerView$LayoutParams.mInsetsDirty>
		view.mViewHolder = r;
	//   94  203:aload_1         
	//   95  204:aload           5
	//   96  206:putfield        #266 <Field RecyclerView$ViewHolder RecyclerView$LayoutParams.mViewHolder>
		boolean flag;
		if(r.itemView.getParent() == null)
	//*  97  209:aload           5
	//*  98  211:getfield        #97  <Field View RecyclerView$ViewHolder.itemView>
	//*  99  214:invokevirtual   #270 <Method android.view.ViewParent View.getParent()>
	//* 100  217:ifnonnull       226
			flag = true;
	//  101  220:iconst_1        
	//  102  221:istore          4
		else
	//* 103  223:goto            229
			flag = false;
	//  104  226:iconst_0        
	//  105  227:istore          4
		view.mPendingInvalidate = flag;
	//  106  229:aload_1         
	//  107  230:iload           4
	//  108  232:putfield        #273 <Field boolean RecyclerView$LayoutParams.mPendingInvalidate>
	//  109  235:return          
	}

	public void clear()
	{
		mAttachedScrap.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ArrayList mAttachedScrap>
	//    2    4:invokevirtual   #276 <Method void ArrayList.clear()>
		recycleAndClearCachedViews();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #279 <Method void recycleAndClearCachedViews()>
	//    5   11:return          
	}

	void clearOldPositions()
	{
		int l = mCachedViews.size();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field ArrayList mCachedViews>
	//    2    4:invokevirtual   #283 <Method int ArrayList.size()>
	//    3    7:istore_2        
		for(int i = 0; i < l; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          36
			((r)mCachedViews.get(i)).clearOldPosition();
	//    9   15:aload_0         
	//   10   16:getfield        #42  <Field ArrayList mCachedViews>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #287 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #93  <Class RecyclerView$ViewHolder>
	//   14   26:invokevirtual   #290 <Method void RecyclerView$ViewHolder.clearOldPosition()>

	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_1        
	//*  19   33:goto            10
		l = mAttachedScrap.size();
	//   20   36:aload_0         
	//   21   37:getfield        #38  <Field ArrayList mAttachedScrap>
	//   22   40:invokevirtual   #283 <Method int ArrayList.size()>
	//   23   43:istore_2        
		for(int j = 0; j < l; j++)
	//*  24   44:iconst_0        
	//*  25   45:istore_1        
	//*  26   46:iload_1         
	//*  27   47:iload_2         
	//*  28   48:icmpge          72
			((r)mAttachedScrap.get(j)).clearOldPosition();
	//   29   51:aload_0         
	//   30   52:getfield        #38  <Field ArrayList mAttachedScrap>
	//   31   55:iload_1         
	//   32   56:invokevirtual   #287 <Method Object ArrayList.get(int)>
	//   33   59:checkcast       #93  <Class RecyclerView$ViewHolder>
	//   34   62:invokevirtual   #290 <Method void RecyclerView$ViewHolder.clearOldPosition()>

	//   35   65:iload_1         
	//   36   66:iconst_1        
	//   37   67:iadd            
	//   38   68:istore_1        
	//*  39   69:goto            46
		if(mChangedScrap != null)
	//*  40   72:aload_0         
	//*  41   73:getfield        #40  <Field ArrayList mChangedScrap>
	//*  42   76:ifnull          115
		{
			int i1 = mChangedScrap.size();
	//   43   79:aload_0         
	//   44   80:getfield        #40  <Field ArrayList mChangedScrap>
	//   45   83:invokevirtual   #283 <Method int ArrayList.size()>
	//   46   86:istore_2        
			for(int k = 0; k < i1; k++)
	//*  47   87:iconst_0        
	//*  48   88:istore_1        
	//*  49   89:iload_1         
	//*  50   90:iload_2         
	//*  51   91:icmpge          115
				((r)mChangedScrap.get(k)).clearOldPosition();
	//   52   94:aload_0         
	//   53   95:getfield        #40  <Field ArrayList mChangedScrap>
	//   54   98:iload_1         
	//   55   99:invokevirtual   #287 <Method Object ArrayList.get(int)>
	//   56  102:checkcast       #93  <Class RecyclerView$ViewHolder>
	//   57  105:invokevirtual   #290 <Method void RecyclerView$ViewHolder.clearOldPosition()>

	//   58  108:iload_1         
	//   59  109:iconst_1        
	//   60  110:iadd            
	//   61  111:istore_1        
		}
	//*  62  112:goto            89
	//   63  115:return          
	}

	void clearScrap()
	{
		mAttachedScrap.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ArrayList mAttachedScrap>
	//    2    4:invokevirtual   #276 <Method void ArrayList.clear()>
		if(mChangedScrap != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #40  <Field ArrayList mChangedScrap>
	//*   5   11:ifnull          21
			mChangedScrap.clear();
	//    6   14:aload_0         
	//    7   15:getfield        #40  <Field ArrayList mChangedScrap>
	//    8   18:invokevirtual   #276 <Method void ArrayList.clear()>
	//    9   21:return          
	}

	public int convertPreLayoutPositionToPostLayout(int i)
	{
		if(i < 0 || i >= mState.getItemCount())
	//*   0    0:iload_1         
	//*   1    1:iflt            18
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #30  <Field RecyclerView this$0>
	//*   5    9:getfield        #159 <Field RecyclerView$State RecyclerView.mState>
	//*   6   12:invokevirtual   #228 <Method int RecyclerView$State.getItemCount()>
	//*   7   15:icmplt          71
			throw new IndexOutOfBoundsException((new StringBuilder()).append("invalid position ").append(i).append(". State ").append("item count is ").append(mState.getItemCount()).toString());
	//    8   18:new             #209 <Class IndexOutOfBoundsException>
	//    9   21:dup             
	//   10   22:new             #211 <Class StringBuilder>
	//   11   25:dup             
	//   12   26:invokespecial   #212 <Method void StringBuilder()>
	//   13   29:ldc2            #294 <String "invalid position ">
	//   14   32:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:iload_1         
	//   16   36:invokevirtual   #221 <Method StringBuilder StringBuilder.append(int)>
	//   17   39:ldc2            #296 <String ". State ">
	//   18   42:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   19   45:ldc2            #298 <String "item count is ">
	//   20   48:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   21   51:aload_0         
	//   22   52:getfield        #30  <Field RecyclerView this$0>
	//   23   55:getfield        #159 <Field RecyclerView$State RecyclerView.mState>
	//   24   58:invokevirtual   #228 <Method int RecyclerView$State.getItemCount()>
	//   25   61:invokevirtual   #221 <Method StringBuilder StringBuilder.append(int)>
	//   26   64:invokevirtual   #232 <Method String StringBuilder.toString()>
	//   27   67:invokespecial   #233 <Method void IndexOutOfBoundsException(String)>
	//   28   70:athrow          
		if(!mState.isPreLayout())
	//*  29   71:aload_0         
	//*  30   72:getfield        #30  <Field RecyclerView this$0>
	//*  31   75:getfield        #159 <Field RecyclerView$State RecyclerView.mState>
	//*  32   78:invokevirtual   #164 <Method boolean RecyclerView$State.isPreLayout()>
	//*  33   81:ifne            86
			return i;
	//   34   84:iload_1         
	//   35   85:ireturn         
		else
			return mAdapterHelper.findPositionOffset(i);
	//   36   86:aload_0         
	//   37   87:getfield        #30  <Field RecyclerView this$0>
	//   38   90:getfield        #198 <Field AdapterHelper RecyclerView.mAdapterHelper>
	//   39   93:iload_1         
	//   40   94:invokevirtual   #204 <Method int AdapterHelper.findPositionOffset(int)>
	//   41   97:ireturn         
	}

	void dispatchViewRecycled(r r)
	{
		if(mRecyclerListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field RecyclerView this$0>
	//*   2    4:getfield        #302 <Field RecyclerView$RecyclerListener RecyclerView.mRecyclerListener>
	//*   3    7:ifnull          23
			mRecyclerListener.onViewRecycled(r);
	//    4   10:aload_0         
	//    5   11:getfield        #30  <Field RecyclerView this$0>
	//    6   14:getfield        #302 <Field RecyclerView$RecyclerListener RecyclerView.mRecyclerListener>
	//    7   17:aload_1         
	//    8   18:invokeinterface #307 <Method void RecyclerView$RecyclerListener.onViewRecycled(RecyclerView$ViewHolder)>
		if(mAdapter != null)
	//*   9   23:aload_0         
	//*  10   24:getfield        #30  <Field RecyclerView this$0>
	//*  11   27:getfield        #143 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  12   30:ifnull          44
			mAdapter.onViewRecycled(r);
	//   13   33:aload_0         
	//   14   34:getfield        #30  <Field RecyclerView this$0>
	//   15   37:getfield        #143 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   16   40:aload_1         
	//   17   41:invokevirtual   #308 <Method void RecyclerView$Adapter.onViewRecycled(RecyclerView$ViewHolder)>
		if(mState != null)
	//*  18   44:aload_0         
	//*  19   45:getfield        #30  <Field RecyclerView this$0>
	//*  20   48:getfield        #159 <Field RecyclerView$State RecyclerView.mState>
	//*  21   51:ifnull          65
			mViewInfoStore.removeViewHolder(r);
	//   22   54:aload_0         
	//   23   55:getfield        #30  <Field RecyclerView this$0>
	//   24   58:getfield        #312 <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//   25   61:aload_1         
	//   26   62:invokevirtual   #317 <Method void ViewInfoStore.removeViewHolder(RecyclerView$ViewHolder)>
	//   27   65:return          
	}

	r getChangedScrapViewForPosition(int i)
	{
		int k;
label0:
		{
			if(mChangedScrap != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field ArrayList mChangedScrap>
	//*   2    4:ifnull          19
			{
				k = mChangedScrap.size();
	//    3    7:aload_0         
	//    4    8:getfield        #40  <Field ArrayList mChangedScrap>
	//    5   11:invokevirtual   #283 <Method int ArrayList.size()>
	//    6   14:istore_3        
				if(k != 0)
					break label0;
	//    7   15:iload_3         
	//    8   16:ifne            21
			}
			return null;
	//    9   19:aconst_null     
	//   10   20:areturn         
		}
		for(int j = 0; j < k; j++)
	//*  11   21:iconst_0        
	//*  12   22:istore_2        
	//*  13   23:iload_2         
	//*  14   24:iload_3         
	//*  15   25:icmpge          75
		{
			r r = (r)mChangedScrap.get(j);
	//   16   28:aload_0         
	//   17   29:getfield        #40  <Field ArrayList mChangedScrap>
	//   18   32:iload_2         
	//   19   33:invokevirtual   #287 <Method Object ArrayList.get(int)>
	//   20   36:checkcast       #93  <Class RecyclerView$ViewHolder>
	//   21   39:astore          6
			if(!r.wasReturnedFromScrap() && r.getLayoutPosition() == i)
	//*  22   41:aload           6
	//*  23   43:invokevirtual   #322 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//*  24   46:ifne            68
	//*  25   49:aload           6
	//*  26   51:invokevirtual   #325 <Method int RecyclerView$ViewHolder.getLayoutPosition()>
	//*  27   54:iload_1         
	//*  28   55:icmpne          68
			{
				r.addFlags(32);
	//   29   58:aload           6
	//   30   60:bipush          32
	//   31   62:invokevirtual   #328 <Method void RecyclerView$ViewHolder.addFlags(int)>
				return r;
	//   32   65:aload           6
	//   33   67:areturn         
			}
		}

	//   34   68:iload_2         
	//   35   69:iconst_1        
	//   36   70:iadd            
	//   37   71:istore_2        
	//*  38   72:goto            23
		if(mAdapter.hasStableIds())
	//*  39   75:aload_0         
	//*  40   76:getfield        #30  <Field RecyclerView this$0>
	//*  41   79:getfield        #143 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  42   82:invokevirtual   #331 <Method boolean RecyclerView$Adapter.hasStableIds()>
	//*  43   85:ifeq            187
		{
			i = mAdapterHelper.findPositionOffset(i);
	//   44   88:aload_0         
	//   45   89:getfield        #30  <Field RecyclerView this$0>
	//   46   92:getfield        #198 <Field AdapterHelper RecyclerView.mAdapterHelper>
	//   47   95:iload_1         
	//   48   96:invokevirtual   #204 <Method int AdapterHelper.findPositionOffset(int)>
	//   49   99:istore_1        
			if(i > 0 && i < mAdapter.getItemCount())
	//*  50  100:iload_1         
	//*  51  101:ifle            187
	//*  52  104:iload_1         
	//*  53  105:aload_0         
	//*  54  106:getfield        #30  <Field RecyclerView this$0>
	//*  55  109:getfield        #143 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  56  112:invokevirtual   #207 <Method int RecyclerView$Adapter.getItemCount()>
	//*  57  115:icmpge          187
			{
				long l = mAdapter.getItemId(i);
	//   58  118:aload_0         
	//   59  119:getfield        #30  <Field RecyclerView this$0>
	//   60  122:getfield        #143 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   61  125:iload_1         
	//   62  126:invokevirtual   #335 <Method long RecyclerView$Adapter.getItemId(int)>
	//   63  129:lstore          4
				for(i = 0; i < k; i++)
	//*  64  131:iconst_0        
	//*  65  132:istore_1        
	//*  66  133:iload_1         
	//*  67  134:iload_3         
	//*  68  135:icmpge          187
				{
					r r1 = (r)mChangedScrap.get(i);
	//   69  138:aload_0         
	//   70  139:getfield        #40  <Field ArrayList mChangedScrap>
	//   71  142:iload_1         
	//   72  143:invokevirtual   #287 <Method Object ArrayList.get(int)>
	//   73  146:checkcast       #93  <Class RecyclerView$ViewHolder>
	//   74  149:astore          6
					if(!r1.wasReturnedFromScrap() && r1.getItemId() == l)
	//*  75  151:aload           6
	//*  76  153:invokevirtual   #322 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//*  77  156:ifne            180
	//*  78  159:aload           6
	//*  79  161:invokevirtual   #337 <Method long RecyclerView$ViewHolder.getItemId()>
	//*  80  164:lload           4
	//*  81  166:lcmp            
	//*  82  167:ifne            180
					{
						r1.addFlags(32);
	//   83  170:aload           6
	//   84  172:bipush          32
	//   85  174:invokevirtual   #328 <Method void RecyclerView$ViewHolder.addFlags(int)>
						return r1;
	//   86  177:aload           6
	//   87  179:areturn         
					}
				}

	//   88  180:iload_1         
	//   89  181:iconst_1        
	//   90  182:iadd            
	//   91  183:istore_1        
			}
		}
	//*  92  184:goto            133
		return null;
	//   93  187:aconst_null     
	//   94  188:areturn         
	}

	iewPool getRecycledViewPool()
	{
		if(mRecyclerPool == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #133 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//*   2    4:ifnonnull       18
			mRecyclerPool = new iewPool();
	//    3    7:aload_0         
	//    4    8:new             #135 <Class RecyclerView$RecycledViewPool>
	//    5   11:dup             
	//    6   12:invokespecial   #338 <Method void RecyclerView$RecycledViewPool()>
	//    7   15:putfield        #133 <Field RecyclerView$RecycledViewPool mRecyclerPool>
		return mRecyclerPool;
	//    8   18:aload_0         
	//    9   19:getfield        #133 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//   10   22:areturn         
	}

	int getScrapCount()
	{
		return mAttachedScrap.size();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ArrayList mAttachedScrap>
	//    2    4:invokevirtual   #283 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public List getScrapList()
	{
		return mUnmodifiableAttachedScrap;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field List mUnmodifiableAttachedScrap>
	//    2    4:areturn         
	}

	r getScrapOrCachedViewForId(long l, int i, boolean flag)
	{
		for(int j = mAttachedScrap.size() - 1; j >= 0; j--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field ArrayList mAttachedScrap>
	//*   2    4:invokevirtual   #283 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore          5
	//*   6   11:iload           5
	//*   7   13:iflt            142
		{
			r r = (r)mAttachedScrap.get(j);
	//    8   16:aload_0         
	//    9   17:getfield        #38  <Field ArrayList mAttachedScrap>
	//   10   20:iload           5
	//   11   22:invokevirtual   #287 <Method Object ArrayList.get(int)>
	//   12   25:checkcast       #93  <Class RecyclerView$ViewHolder>
	//   13   28:astore          6
			if(r.getItemId() != l || r.wasReturnedFromScrap())
				continue;
	//   14   30:aload           6
	//   15   32:invokevirtual   #337 <Method long RecyclerView$ViewHolder.getItemId()>
	//   16   35:lload_1         
	//   17   36:lcmp            
	//   18   37:ifne            133
	//   19   40:aload           6
	//   20   42:invokevirtual   #322 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//   21   45:ifne            133
			if(i == r.getItemViewType())
	//*  22   48:iload_3         
	//*  23   49:aload           6
	//*  24   51:invokevirtual   #125 <Method int RecyclerView$ViewHolder.getItemViewType()>
	//*  25   54:icmpne          96
			{
				r.addFlags(32);
	//   26   57:aload           6
	//   27   59:bipush          32
	//   28   61:invokevirtual   #328 <Method void RecyclerView$ViewHolder.addFlags(int)>
				if(r.isRemoved() && !mState.isPreLayout())
	//*  29   64:aload           6
	//*  30   66:invokevirtual   #348 <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*  31   69:ifeq            93
	//*  32   72:aload_0         
	//*  33   73:getfield        #30  <Field RecyclerView this$0>
	//*  34   76:getfield        #159 <Field RecyclerView$State RecyclerView.mState>
	//*  35   79:invokevirtual   #164 <Method boolean RecyclerView$State.isPreLayout()>
	//*  36   82:ifne            93
					r.setFlags(2, 14);
	//   37   85:aload           6
	//   38   87:iconst_2        
	//   39   88:bipush          14
	//   40   90:invokevirtual   #352 <Method void RecyclerView$ViewHolder.setFlags(int, int)>
				return r;
	//   41   93:aload           6
	//   42   95:areturn         
			}
			if(!flag)
	//*  43   96:iload           4
	//*  44   98:ifne            133
			{
				mAttachedScrap.remove(j);
	//   45  101:aload_0         
	//   46  102:getfield        #38  <Field ArrayList mAttachedScrap>
	//   47  105:iload           5
	//   48  107:invokevirtual   #355 <Method Object ArrayList.remove(int)>
	//   49  110:pop             
				removeDetachedView(r.itemView, false);
	//   50  111:aload_0         
	//   51  112:getfield        #30  <Field RecyclerView this$0>
	//   52  115:aload           6
	//   53  117:getfield        #97  <Field View RecyclerView$ViewHolder.itemView>
	//   54  120:iconst_0        
	//   55  121:invokevirtual   #359 <Method void RecyclerView.removeDetachedView(View, boolean)>
				quickRecycleScrapView(r.itemView);
	//   56  124:aload_0         
	//   57  125:aload           6
	//   58  127:getfield        #97  <Field View RecyclerView$ViewHolder.itemView>
	//   59  130:invokevirtual   #362 <Method void quickRecycleScrapView(View)>
			}
		}

	//   60  133:iload           5
	//   61  135:iconst_1        
	//   62  136:isub            
	//   63  137:istore          5
	//*  64  139:goto            11
		for(int k = mCachedViews.size() - 1; k >= 0; k--)
	//*  65  142:aload_0         
	//*  66  143:getfield        #42  <Field ArrayList mCachedViews>
	//*  67  146:invokevirtual   #283 <Method int ArrayList.size()>
	//*  68  149:iconst_1        
	//*  69  150:isub            
	//*  70  151:istore          5
	//*  71  153:iload           5
	//*  72  155:iflt            231
		{
			r r1 = (r)mCachedViews.get(k);
	//   73  158:aload_0         
	//   74  159:getfield        #42  <Field ArrayList mCachedViews>
	//   75  162:iload           5
	//   76  164:invokevirtual   #287 <Method Object ArrayList.get(int)>
	//   77  167:checkcast       #93  <Class RecyclerView$ViewHolder>
	//   78  170:astore          6
			if(r1.getItemId() != l)
				continue;
	//   79  172:aload           6
	//   80  174:invokevirtual   #337 <Method long RecyclerView$ViewHolder.getItemId()>
	//   81  177:lload_1         
	//   82  178:lcmp            
	//   83  179:ifne            222
			if(i == r1.getItemViewType())
	//*  84  182:iload_3         
	//*  85  183:aload           6
	//*  86  185:invokevirtual   #125 <Method int RecyclerView$ViewHolder.getItemViewType()>
	//*  87  188:icmpne          209
			{
				if(!flag)
	//*  88  191:iload           4
	//*  89  193:ifne            206
					mCachedViews.remove(k);
	//   90  196:aload_0         
	//   91  197:getfield        #42  <Field ArrayList mCachedViews>
	//   92  200:iload           5
	//   93  202:invokevirtual   #355 <Method Object ArrayList.remove(int)>
	//   94  205:pop             
				return r1;
	//   95  206:aload           6
	//   96  208:areturn         
			}
			if(!flag)
	//*  97  209:iload           4
	//*  98  211:ifne            222
			{
				recycleCachedViewAt(k);
	//   99  214:aload_0         
	//  100  215:iload           5
	//  101  217:invokevirtual   #365 <Method void recycleCachedViewAt(int)>
				return null;
	//  102  220:aconst_null     
	//  103  221:areturn         
			}
		}

	//  104  222:iload           5
	//  105  224:iconst_1        
	//  106  225:isub            
	//  107  226:istore          5
	//* 108  228:goto            153
		return null;
	//  109  231:aconst_null     
	//  110  232:areturn         
	}

	r getScrapOrHiddenOrCachedHolderForPosition(int i, boolean flag)
	{
		int l = mAttachedScrap.size();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ArrayList mAttachedScrap>
	//    2    4:invokevirtual   #283 <Method int ArrayList.size()>
	//    3    7:istore          4
		for(int j = 0; j < l; j++)
	//*   4    9:iconst_0        
	//*   5   10:istore_3        
	//*   6   11:iload_3         
	//*   7   12:iload           4
	//*   8   14:icmpge          93
		{
			r r = (r)mAttachedScrap.get(j);
	//    9   17:aload_0         
	//   10   18:getfield        #38  <Field ArrayList mAttachedScrap>
	//   11   21:iload_3         
	//   12   22:invokevirtual   #287 <Method Object ArrayList.get(int)>
	//   13   25:checkcast       #93  <Class RecyclerView$ViewHolder>
	//   14   28:astore          5
			if(!r.wasReturnedFromScrap() && r.getLayoutPosition() == i && !r.isInvalid() && (mState.mInPreLayout || !r.isRemoved()))
	//*  15   30:aload           5
	//*  16   32:invokevirtual   #322 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//*  17   35:ifne            86
	//*  18   38:aload           5
	//*  19   40:invokevirtual   #325 <Method int RecyclerView$ViewHolder.getLayoutPosition()>
	//*  20   43:iload_1         
	//*  21   44:icmpne          86
	//*  22   47:aload           5
	//*  23   49:invokevirtual   #370 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//*  24   52:ifne            86
	//*  25   55:aload_0         
	//*  26   56:getfield        #30  <Field RecyclerView this$0>
	//*  27   59:getfield        #159 <Field RecyclerView$State RecyclerView.mState>
	//*  28   62:getfield        #373 <Field boolean RecyclerView$State.mInPreLayout>
	//*  29   65:ifne            76
	//*  30   68:aload           5
	//*  31   70:invokevirtual   #348 <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*  32   73:ifne            86
			{
				r.addFlags(32);
	//   33   76:aload           5
	//   34   78:bipush          32
	//   35   80:invokevirtual   #328 <Method void RecyclerView$ViewHolder.addFlags(int)>
				return r;
	//   36   83:aload           5
	//   37   85:areturn         
			}
		}

	//   38   86:iload_3         
	//   39   87:iconst_1        
	//   40   88:iadd            
	//   41   89:istore_3        
	//*  42   90:goto            11
		if(!flag)
	//*  43   93:iload_2         
	//*  44   94:ifne            209
		{
			View view = mChildHelper.findHiddenNonRemovedView(i);
	//   45   97:aload_0         
	//   46   98:getfield        #30  <Field RecyclerView this$0>
	//   47  101:getfield        #377 <Field ChildHelper RecyclerView.mChildHelper>
	//   48  104:iload_1         
	//   49  105:invokevirtual   #382 <Method View ChildHelper.findHiddenNonRemovedView(int)>
	//   50  108:astore          5
			if(view != null)
	//*  51  110:aload           5
	//*  52  112:ifnull          209
			{
				r r2 = RecyclerView.getChildViewHolderInt(view);
	//   53  115:aload           5
	//   54  117:invokestatic    #187 <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//   55  120:astore          6
				mChildHelper.unhide(view);
	//   56  122:aload_0         
	//   57  123:getfield        #30  <Field RecyclerView this$0>
	//   58  126:getfield        #377 <Field ChildHelper RecyclerView.mChildHelper>
	//   59  129:aload           5
	//   60  131:invokevirtual   #385 <Method void ChildHelper.unhide(View)>
				i = mChildHelper.indexOfChild(view);
	//   61  134:aload_0         
	//   62  135:getfield        #30  <Field RecyclerView this$0>
	//   63  138:getfield        #377 <Field ChildHelper RecyclerView.mChildHelper>
	//   64  141:aload           5
	//   65  143:invokevirtual   #388 <Method int ChildHelper.indexOfChild(View)>
	//   66  146:istore_1        
				if(i == -1)
	//*  67  147:iload_1         
	//*  68  148:iconst_m1       
	//*  69  149:icmpne          181
				{
					throw new IllegalStateException((new StringBuilder()).append("layout index should not be -1 after unhiding a view:").append(((Object) (r2))).toString());
	//   70  152:new             #390 <Class IllegalStateException>
	//   71  155:dup             
	//   72  156:new             #211 <Class StringBuilder>
	//   73  159:dup             
	//   74  160:invokespecial   #212 <Method void StringBuilder()>
	//   75  163:ldc2            #392 <String "layout index should not be -1 after unhiding a view:">
	//   76  166:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   77  169:aload           6
	//   78  171:invokevirtual   #395 <Method StringBuilder StringBuilder.append(Object)>
	//   79  174:invokevirtual   #232 <Method String StringBuilder.toString()>
	//   80  177:invokespecial   #396 <Method void IllegalStateException(String)>
	//   81  180:athrow          
				} else
				{
					mChildHelper.detachViewFromParent(i);
	//   82  181:aload_0         
	//   83  182:getfield        #30  <Field RecyclerView this$0>
	//   84  185:getfield        #377 <Field ChildHelper RecyclerView.mChildHelper>
	//   85  188:iload_1         
	//   86  189:invokevirtual   #399 <Method void ChildHelper.detachViewFromParent(int)>
					scrapView(view);
	//   87  192:aload_0         
	//   88  193:aload           5
	//   89  195:invokevirtual   #402 <Method void scrapView(View)>
					r2.addFlags(8224);
	//   90  198:aload           6
	//   91  200:sipush          8224
	//   92  203:invokevirtual   #328 <Method void RecyclerView$ViewHolder.addFlags(int)>
					return r2;
	//   93  206:aload           6
	//   94  208:areturn         
				}
			}
		}
		l = mCachedViews.size();
	//   95  209:aload_0         
	//   96  210:getfield        #42  <Field ArrayList mCachedViews>
	//   97  213:invokevirtual   #283 <Method int ArrayList.size()>
	//   98  216:istore          4
		for(int k = 0; k < l; k++)
	//*  99  218:iconst_0        
	//* 100  219:istore_3        
	//* 101  220:iload_3         
	//* 102  221:iload           4
	//* 103  223:icmpge          279
		{
			r r1 = (r)mCachedViews.get(k);
	//  104  226:aload_0         
	//  105  227:getfield        #42  <Field ArrayList mCachedViews>
	//  106  230:iload_3         
	//  107  231:invokevirtual   #287 <Method Object ArrayList.get(int)>
	//  108  234:checkcast       #93  <Class RecyclerView$ViewHolder>
	//  109  237:astore          5
			if(!r1.isInvalid() && r1.getLayoutPosition() == i)
	//* 110  239:aload           5
	//* 111  241:invokevirtual   #370 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//* 112  244:ifne            272
	//* 113  247:aload           5
	//* 114  249:invokevirtual   #325 <Method int RecyclerView$ViewHolder.getLayoutPosition()>
	//* 115  252:iload_1         
	//* 116  253:icmpne          272
			{
				if(!flag)
	//* 117  256:iload_2         
	//* 118  257:ifne            269
					mCachedViews.remove(k);
	//  119  260:aload_0         
	//  120  261:getfield        #42  <Field ArrayList mCachedViews>
	//  121  264:iload_3         
	//  122  265:invokevirtual   #355 <Method Object ArrayList.remove(int)>
	//  123  268:pop             
				return r1;
	//  124  269:aload           5
	//  125  271:areturn         
			}
		}

	//  126  272:iload_3         
	//  127  273:iconst_1        
	//  128  274:iadd            
	//  129  275:istore_3        
	//* 130  276:goto            220
		return null;
	//  131  279:aconst_null     
	//  132  280:areturn         
	}

	View getScrapViewAt(int i)
	{
		return ((r)mAttachedScrap.get(i)).itemView;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ArrayList mAttachedScrap>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #287 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #93  <Class RecyclerView$ViewHolder>
	//    5   11:getfield        #97  <Field View RecyclerView$ViewHolder.itemView>
	//    6   14:areturn         
	}

	public View getViewForPosition(int i)
	{
		return getViewForPosition(i, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #407 <Method View getViewForPosition(int, boolean)>
	//    4    6:areturn         
	}

	View getViewForPosition(int i, boolean flag)
	{
		return tryGetViewHolderForPositionByDeadline(i, flag, 0xffffffffL).itemView;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:ldc2w           #130 <Long 0xffffffffL>
	//    4    6:invokevirtual   #411 <Method RecyclerView$ViewHolder tryGetViewHolderForPositionByDeadline(int, boolean, long)>
	//    5    9:getfield        #97  <Field View RecyclerView$ViewHolder.itemView>
	//    6   12:areturn         
	}

	void markItemDecorInsetsDirty()
	{
		int j = mCachedViews.size();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field ArrayList mCachedViews>
	//    2    4:invokevirtual   #283 <Method int ArrayList.size()>
	//    3    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          52
		{
			ams ams = (ams)((r)mCachedViews.get(i)).itemView.getLayoutParams();
	//    9   15:aload_0         
	//   10   16:getfield        #42  <Field ArrayList mCachedViews>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #287 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #93  <Class RecyclerView$ViewHolder>
	//   14   26:getfield        #97  <Field View RecyclerView$ViewHolder.itemView>
	//   15   29:invokevirtual   #241 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   16   32:checkcast       #246 <Class RecyclerView$LayoutParams>
	//   17   35:astore_3        
			if(ams != null)
	//*  18   36:aload_3         
	//*  19   37:ifnull          45
				ams.mInsetsDirty = true;
	//   20   40:aload_3         
	//   21   41:iconst_1        
	//   22   42:putfield        #262 <Field boolean RecyclerView$LayoutParams.mInsetsDirty>
		}

	//   23   45:iload_1         
	//   24   46:iconst_1        
	//   25   47:iadd            
	//   26   48:istore_1        
	//*  27   49:goto            10
	//   28   52:return          
	}

	void markKnownViewsInvalid()
	{
		if(mAdapter != null && mAdapter.hasStableIds())
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field RecyclerView this$0>
	//*   2    4:getfield        #143 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*   3    7:ifnull          73
	//*   4   10:aload_0         
	//*   5   11:getfield        #30  <Field RecyclerView this$0>
	//*   6   14:getfield        #143 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*   7   17:invokevirtual   #331 <Method boolean RecyclerView$Adapter.hasStableIds()>
	//*   8   20:ifeq            73
		{
			int j = mCachedViews.size();
	//    9   23:aload_0         
	//   10   24:getfield        #42  <Field ArrayList mCachedViews>
	//   11   27:invokevirtual   #283 <Method int ArrayList.size()>
	//   12   30:istore_2        
			for(int i = 0; i < j; i++)
	//*  13   31:iconst_0        
	//*  14   32:istore_1        
	//*  15   33:iload_1         
	//*  16   34:iload_2         
	//*  17   35:icmpge          72
			{
				r r = (r)mCachedViews.get(i);
	//   18   38:aload_0         
	//   19   39:getfield        #42  <Field ArrayList mCachedViews>
	//   20   42:iload_1         
	//   21   43:invokevirtual   #287 <Method Object ArrayList.get(int)>
	//   22   46:checkcast       #93  <Class RecyclerView$ViewHolder>
	//   23   49:astore_3        
				if(r != null)
	//*  24   50:aload_3         
	//*  25   51:ifnull          65
				{
					r.addFlags(6);
	//   26   54:aload_3         
	//   27   55:bipush          6
	//   28   57:invokevirtual   #328 <Method void RecyclerView$ViewHolder.addFlags(int)>
					r.addChangePayload(((Object) (null)));
	//   29   60:aload_3         
	//   30   61:aconst_null     
	//   31   62:invokevirtual   #417 <Method void RecyclerView$ViewHolder.addChangePayload(Object)>
				}
			}

	//   32   65:iload_1         
	//   33   66:iconst_1        
	//   34   67:iadd            
	//   35   68:istore_1        
	//*  36   69:goto            33
			return;
	//   37   72:return          
		} else
		{
			recycleAndClearCachedViews();
	//   38   73:aload_0         
	//   39   74:invokevirtual   #279 <Method void recycleAndClearCachedViews()>
			return;
	//   40   77:return          
		}
	}

	void offsetPositionRecordsForInsert(int i, int j)
	{
		int l = mCachedViews.size();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field ArrayList mCachedViews>
	//    2    4:invokevirtual   #283 <Method int ArrayList.size()>
	//    3    7:istore          4
		for(int k = 0; k < l; k++)
	//*   4    9:iconst_0        
	//*   5   10:istore_3        
	//*   6   11:iload_3         
	//*   7   12:iload           4
	//*   8   14:icmpge          58
		{
			r r = (r)mCachedViews.get(k);
	//    9   17:aload_0         
	//   10   18:getfield        #42  <Field ArrayList mCachedViews>
	//   11   21:iload_3         
	//   12   22:invokevirtual   #287 <Method Object ArrayList.get(int)>
	//   13   25:checkcast       #93  <Class RecyclerView$ViewHolder>
	//   14   28:astore          5
			if(r != null && r.mPosition >= i)
	//*  15   30:aload           5
	//*  16   32:ifnull          51
	//*  17   35:aload           5
	//*  18   37:getfield        #421 <Field int RecyclerView$ViewHolder.mPosition>
	//*  19   40:iload_1         
	//*  20   41:icmplt          51
				r.offsetPosition(j, true);
	//   21   44:aload           5
	//   22   46:iload_2         
	//   23   47:iconst_1        
	//   24   48:invokevirtual   #425 <Method void RecyclerView$ViewHolder.offsetPosition(int, boolean)>
		}

	//   25   51:iload_3         
	//   26   52:iconst_1        
	//   27   53:iadd            
	//   28   54:istore_3        
	//*  29   55:goto            11
	//   30   58:return          
	}

	void offsetPositionRecordsForMove(int i, int j)
	{
		int k;
		int l;
		byte byte0;
		if(i < j)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmpge          16
		{
			k = i;
	//    3    5:iload_1         
	//    4    6:istore_3        
			l = j;
	//    5    7:iload_2         
	//    6    8:istore          4
			byte0 = -1;
	//    7   10:iconst_m1       
	//    8   11:istore          5
		} else
	//*   9   13:goto            24
		{
			k = j;
	//   10   16:iload_2         
	//   11   17:istore_3        
			l = i;
	//   12   18:iload_1         
	//   13   19:istore          4
			byte0 = 1;
	//   14   21:iconst_1        
	//   15   22:istore          5
		}
		int j1 = mCachedViews.size();
	//   16   24:aload_0         
	//   17   25:getfield        #42  <Field ArrayList mCachedViews>
	//   18   28:invokevirtual   #283 <Method int ArrayList.size()>
	//   19   31:istore          7
		for(int i1 = 0; i1 < j1; i1++)
	//*  20   33:iconst_0        
	//*  21   34:istore          6
	//*  22   36:iload           6
	//*  23   38:iload           7
	//*  24   40:icmpge          122
		{
			r r = (r)mCachedViews.get(i1);
	//   25   43:aload_0         
	//   26   44:getfield        #42  <Field ArrayList mCachedViews>
	//   27   47:iload           6
	//   28   49:invokevirtual   #287 <Method Object ArrayList.get(int)>
	//   29   52:checkcast       #93  <Class RecyclerView$ViewHolder>
	//   30   55:astore          8
			if(r == null || r.mPosition < k || r.mPosition > l)
	//*  31   57:aload           8
	//*  32   59:ifnull          113
	//*  33   62:aload           8
	//*  34   64:getfield        #421 <Field int RecyclerView$ViewHolder.mPosition>
	//*  35   67:iload_3         
	//*  36   68:icmplt          113
	//*  37   71:aload           8
	//*  38   73:getfield        #421 <Field int RecyclerView$ViewHolder.mPosition>
	//*  39   76:iload           4
	//*  40   78:icmple          84
				continue;
	//   41   81:goto            113
			if(r.mPosition == i)
	//*  42   84:aload           8
	//*  43   86:getfield        #421 <Field int RecyclerView$ViewHolder.mPosition>
	//*  44   89:iload_1         
	//*  45   90:icmpne          105
				r.offsetPosition(j - i, false);
	//   46   93:aload           8
	//   47   95:iload_2         
	//   48   96:iload_1         
	//   49   97:isub            
	//   50   98:iconst_0        
	//   51   99:invokevirtual   #425 <Method void RecyclerView$ViewHolder.offsetPosition(int, boolean)>
			else
	//*  52  102:goto            113
				r.offsetPosition(((int) (byte0)), false);
	//   53  105:aload           8
	//   54  107:iload           5
	//   55  109:iconst_0        
	//   56  110:invokevirtual   #425 <Method void RecyclerView$ViewHolder.offsetPosition(int, boolean)>
		}

	//   57  113:iload           6
	//   58  115:iconst_1        
	//   59  116:iadd            
	//   60  117:istore          6
	//*  61  119:goto            36
	//   62  122:return          
	}

	void offsetPositionRecordsForRemove(int i, int j, boolean flag)
	{
		for(int k = mCachedViews.size() - 1; k >= 0; k--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field ArrayList mCachedViews>
	//*   2    4:invokevirtual   #283 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore          4
	//*   6   11:iload           4
	//*   7   13:iflt            88
		{
			r r = (r)mCachedViews.get(k);
	//    8   16:aload_0         
	//    9   17:getfield        #42  <Field ArrayList mCachedViews>
	//   10   20:iload           4
	//   11   22:invokevirtual   #287 <Method Object ArrayList.get(int)>
	//   12   25:checkcast       #93  <Class RecyclerView$ViewHolder>
	//   13   28:astore          5
			if(r == null)
				continue;
	//   14   30:aload           5
	//   15   32:ifnull          79
			if(r.mPosition >= i + j)
	//*  16   35:aload           5
	//*  17   37:getfield        #421 <Field int RecyclerView$ViewHolder.mPosition>
	//*  18   40:iload_1         
	//*  19   41:iload_2         
	//*  20   42:iadd            
	//*  21   43:icmplt          57
			{
				r.offsetPosition(-j, flag);
	//   22   46:aload           5
	//   23   48:iload_2         
	//   24   49:ineg            
	//   25   50:iload_3         
	//   26   51:invokevirtual   #425 <Method void RecyclerView$ViewHolder.offsetPosition(int, boolean)>
				continue;
	//   27   54:goto            79
			}
			if(r.mPosition >= i)
	//*  28   57:aload           5
	//*  29   59:getfield        #421 <Field int RecyclerView$ViewHolder.mPosition>
	//*  30   62:iload_1         
	//*  31   63:icmplt          79
			{
				r.addFlags(8);
	//   32   66:aload           5
	//   33   68:bipush          8
	//   34   70:invokevirtual   #328 <Method void RecyclerView$ViewHolder.addFlags(int)>
				recycleCachedViewAt(k);
	//   35   73:aload_0         
	//   36   74:iload           4
	//   37   76:invokevirtual   #365 <Method void recycleCachedViewAt(int)>
			}
		}

	//   38   79:iload           4
	//   39   81:iconst_1        
	//   40   82:isub            
	//   41   83:istore          4
	//*  42   85:goto            11
	//   43   88:return          
	}

	void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter1, boolean flag)
	{
		clear();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #431 <Method void clear()>
		getRecycledViewPool().onAdapterChanged(adapter, adapter1, flag);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #179 <Method RecyclerView$RecycledViewPool getRecycledViewPool()>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:iload_3         
	//    7   11:invokevirtual   #433 <Method void RecyclerView$RecycledViewPool.onAdapterChanged(RecyclerView$Adapter, RecyclerView$Adapter, boolean)>
	//    8   14:return          
	}

	void quickRecycleScrapView(View view)
	{
		view = ((View) (RecyclerView.getChildViewHolderInt(view)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #187 <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:astore_1        
		r.access._mth802(((r) (view)), ((RecyclerView$Recycler) (null)));
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:invokestatic    #437 <Method RecyclerView$Recycler RecyclerView$ViewHolder.access$802(RecyclerView$ViewHolder, RecyclerView$Recycler)>
	//    6   10:pop             
		r.access._mth902(((r) (view)), false);
	//    7   11:aload_1         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #441 <Method boolean RecyclerView$ViewHolder.access$902(RecyclerView$ViewHolder, boolean)>
	//   10   16:pop             
		((r) (view)).clearReturnedFromScrapFlag();
	//   11   17:aload_1         
	//   12   18:invokevirtual   #444 <Method void RecyclerView$ViewHolder.clearReturnedFromScrapFlag()>
		recycleViewHolderInternal(((r) (view)));
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:invokevirtual   #447 <Method void recycleViewHolderInternal(RecyclerView$ViewHolder)>
	//   16   26:return          
	}

	void recycleAndClearCachedViews()
	{
		for(int i = mCachedViews.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field ArrayList mCachedViews>
	//*   2    4:invokevirtual   #283 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iflt            26
			recycleCachedViewAt(i);
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:invokevirtual   #365 <Method void recycleCachedViewAt(int)>

	//   11   19:iload_1         
	//   12   20:iconst_1        
	//   13   21:isub            
	//   14   22:istore_1        
	//*  15   23:goto            10
		mCachedViews.clear();
	//   16   26:aload_0         
	//   17   27:getfield        #42  <Field ArrayList mCachedViews>
	//   18   30:invokevirtual   #276 <Method void ArrayList.clear()>
		if(RecyclerView.access$600())
	//*  19   33:invokestatic    #450 <Method boolean RecyclerView.access$600()>
	//*  20   36:ifeq            49
			mPrefetchRegistry.clearPrefetchPositions();
	//   21   39:aload_0         
	//   22   40:getfield        #30  <Field RecyclerView this$0>
	//   23   43:getfield        #454 <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//   24   46:invokevirtual   #459 <Method void GapWorker$LayoutPrefetchRegistryImpl.clearPrefetchPositions()>
	//   25   49:return          
	}

	void recycleCachedViewAt(int i)
	{
		addViewHolderToRecycledViewPool((r)mCachedViews.get(i), true);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #42  <Field ArrayList mCachedViews>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #287 <Method Object ArrayList.get(int)>
	//    5    9:checkcast       #93  <Class RecyclerView$ViewHolder>
	//    6   12:iconst_1        
	//    7   13:invokevirtual   #461 <Method void addViewHolderToRecycledViewPool(RecyclerView$ViewHolder, boolean)>
		mCachedViews.remove(i);
	//    8   16:aload_0         
	//    9   17:getfield        #42  <Field ArrayList mCachedViews>
	//   10   20:iload_1         
	//   11   21:invokevirtual   #355 <Method Object ArrayList.remove(int)>
	//   12   24:pop             
	//   13   25:return          
	}

	public void recycleView(View view)
	{
		r r = RecyclerView.getChildViewHolderInt(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #187 <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:astore_2        
		if(r.isTmpDetached())
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #465 <Method boolean RecyclerView$ViewHolder.isTmpDetached()>
	//*   5    9:ifeq            21
			removeDetachedView(view, false);
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field RecyclerView this$0>
	//    8   16:aload_1         
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #359 <Method void RecyclerView.removeDetachedView(View, boolean)>
		if(r.isScrap())
	//*  11   21:aload_2         
	//*  12   22:invokevirtual   #468 <Method boolean RecyclerView$ViewHolder.isScrap()>
	//*  13   25:ifeq            35
			r.unScrap();
	//   14   28:aload_2         
	//   15   29:invokevirtual   #471 <Method void RecyclerView$ViewHolder.unScrap()>
		else
	//*  16   32:goto            46
		if(r.wasReturnedFromScrap())
	//*  17   35:aload_2         
	//*  18   36:invokevirtual   #322 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//*  19   39:ifeq            46
			r.clearReturnedFromScrapFlag();
	//   20   42:aload_2         
	//   21   43:invokevirtual   #444 <Method void RecyclerView$ViewHolder.clearReturnedFromScrapFlag()>
		recycleViewHolderInternal(r);
	//   22   46:aload_0         
	//   23   47:aload_2         
	//   24   48:invokevirtual   #447 <Method void recycleViewHolderInternal(RecyclerView$ViewHolder)>
	//   25   51:return          
	}

	void recycleViewHolderInternal(r r)
	{
		int j;
		int k;
		boolean flag4;
label0:
		{
			if(r.isScrap() || r.itemView.getParent() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #468 <Method boolean RecyclerView$ViewHolder.isScrap()>
	//*   2    4:ifne            17
	//*   3    7:aload_1         
	//*   4    8:getfield        #97  <Field View RecyclerView$ViewHolder.itemView>
	//*   5   11:invokevirtual   #270 <Method android.view.ViewParent View.getParent()>
	//*   6   14:ifnull          82
			{
				StringBuilder stringbuilder = (new StringBuilder()).append("Scrapped or attached views may not be recycled. isScrap:").append(r.isScrap()).append(" isAttached:");
	//    7   17:new             #211 <Class StringBuilder>
	//    8   20:dup             
	//    9   21:invokespecial   #212 <Method void StringBuilder()>
	//   10   24:ldc2            #473 <String "Scrapped or attached views may not be recycled. isScrap:">
	//   11   27:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   12   30:aload_1         
	//   13   31:invokevirtual   #468 <Method boolean RecyclerView$ViewHolder.isScrap()>
	//   14   34:invokevirtual   #476 <Method StringBuilder StringBuilder.append(boolean)>
	//   15   37:ldc2            #478 <String " isAttached:">
	//   16   40:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   17   43:astore          8
				boolean flag3;
				if(r.itemView.getParent() != null)
	//*  18   45:aload_1         
	//*  19   46:getfield        #97  <Field View RecyclerView$ViewHolder.itemView>
	//*  20   49:invokevirtual   #270 <Method android.view.ViewParent View.getParent()>
	//*  21   52:ifnull          61
					flag3 = true;
	//   22   55:iconst_1        
	//   23   56:istore          7
				else
	//*  24   58:goto            64
					flag3 = false;
	//   25   61:iconst_0        
	//   26   62:istore          7
				throw new IllegalArgumentException(stringbuilder.append(flag3).toString());
	//   27   64:new             #189 <Class IllegalArgumentException>
	//   28   67:dup             
	//   29   68:aload           8
	//   30   70:iload           7
	//   31   72:invokevirtual   #476 <Method StringBuilder StringBuilder.append(boolean)>
	//   32   75:invokevirtual   #232 <Method String StringBuilder.toString()>
	//   33   78:invokespecial   #194 <Method void IllegalArgumentException(String)>
	//   34   81:athrow          
			}
			if(r.isTmpDetached())
	//*  35   82:aload_1         
	//*  36   83:invokevirtual   #465 <Method boolean RecyclerView$ViewHolder.isTmpDetached()>
	//*  37   86:ifeq            117
				throw new IllegalArgumentException((new StringBuilder()).append("Tmp detached view should be removed from RecyclerView before it can be recycled: ").append(((Object) (r))).toString());
	//   38   89:new             #189 <Class IllegalArgumentException>
	//   39   92:dup             
	//   40   93:new             #211 <Class StringBuilder>
	//   41   96:dup             
	//   42   97:invokespecial   #212 <Method void StringBuilder()>
	//   43  100:ldc2            #480 <String "Tmp detached view should be removed from RecyclerView before it can be recycled: ">
	//   44  103:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   45  106:aload_1         
	//   46  107:invokevirtual   #395 <Method StringBuilder StringBuilder.append(Object)>
	//   47  110:invokevirtual   #232 <Method String StringBuilder.toString()>
	//   48  113:invokespecial   #194 <Method void IllegalArgumentException(String)>
	//   49  116:athrow          
			if(r.shouldIgnore())
	//*  50  117:aload_1         
	//*  51  118:invokevirtual   #483 <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//*  52  121:ifeq            135
				throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
	//   53  124:new             #189 <Class IllegalArgumentException>
	//   54  127:dup             
	//   55  128:ldc2            #485 <String "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.">
	//   56  131:invokespecial   #194 <Method void IllegalArgumentException(String)>
	//   57  134:athrow          
			flag4 = r.access._mth700(r);
	//   58  135:aload_1         
	//   59  136:invokestatic    #489 <Method boolean RecyclerView$ViewHolder.access$700(RecyclerView$ViewHolder)>
	//   60  139:istore          7
			boolean flag;
			if(mAdapter != null && flag4 && mAdapter.onFailedToRecycleView(r))
	//*  61  141:aload_0         
	//*  62  142:getfield        #30  <Field RecyclerView this$0>
	//*  63  145:getfield        #143 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  64  148:ifnull          175
	//*  65  151:iload           7
	//*  66  153:ifeq            175
	//*  67  156:aload_0         
	//*  68  157:getfield        #30  <Field RecyclerView this$0>
	//*  69  160:getfield        #143 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  70  163:aload_1         
	//*  71  164:invokevirtual   #492 <Method boolean RecyclerView$Adapter.onFailedToRecycleView(RecyclerView$ViewHolder)>
	//*  72  167:ifeq            175
				flag = true;
	//   73  170:iconst_1        
	//   74  171:istore_2        
			else
	//*  75  172:goto            177
				flag = false;
	//   76  175:iconst_0        
	//   77  176:istore_2        
			j = 0;
	//   78  177:iconst_0        
	//   79  178:istore_3        
			boolean flag2 = false;
	//   80  179:iconst_0        
	//   81  180:istore          6
			boolean flag1 = false;
	//   82  182:iconst_0        
	//   83  183:istore          5
			if(!flag)
	//*  84  185:iload_2         
	//*  85  186:ifne            200
			{
				k = ((int) (flag1));
	//   86  189:iload           5
	//   87  191:istore          4
				if(!r.isRecyclable())
					break label0;
	//   88  193:aload_1         
	//   89  194:invokevirtual   #495 <Method boolean RecyclerView$ViewHolder.isRecyclable()>
	//   90  197:ifeq            379
			}
			int i = ((int) (flag2));
	//   91  200:iload           6
	//   92  202:istore_2        
			if(mViewCacheMax > 0)
	//*  93  203:aload_0         
	//*  94  204:getfield        #54  <Field int mViewCacheMax>
	//*  95  207:ifle            358
			{
				i = ((int) (flag2));
	//   96  210:iload           6
	//   97  212:istore_2        
				if(!r.hasAnyOfTheFlags(526))
	//*  98  213:aload_1         
	//*  99  214:sipush          526
	//* 100  217:invokevirtual   #499 <Method boolean RecyclerView$ViewHolder.hasAnyOfTheFlags(int)>
	//* 101  220:ifne            358
				{
					j = mCachedViews.size();
	//  102  223:aload_0         
	//  103  224:getfield        #42  <Field ArrayList mCachedViews>
	//  104  227:invokevirtual   #283 <Method int ArrayList.size()>
	//  105  230:istore_3        
					i = j;
	//  106  231:iload_3         
	//  107  232:istore_2        
					if(j >= mViewCacheMax)
	//* 108  233:iload_3         
	//* 109  234:aload_0         
	//* 110  235:getfield        #54  <Field int mViewCacheMax>
	//* 111  238:icmplt          256
					{
						i = j;
	//  112  241:iload_3         
	//  113  242:istore_2        
						if(j > 0)
	//* 114  243:iload_3         
	//* 115  244:ifle            256
						{
							recycleCachedViewAt(0);
	//  116  247:aload_0         
	//  117  248:iconst_0        
	//  118  249:invokevirtual   #365 <Method void recycleCachedViewAt(int)>
							i = j - 1;
	//  119  252:iload_3         
	//  120  253:iconst_1        
	//  121  254:isub            
	//  122  255:istore_2        
						}
					}
					j = i;
	//  123  256:iload_2         
	//  124  257:istore_3        
					k = j;
	//  125  258:iload_3         
	//  126  259:istore          4
					if(RecyclerView.access$600())
	//* 127  261:invokestatic    #450 <Method boolean RecyclerView.access$600()>
	//* 128  264:ifeq            346
					{
						k = j;
	//  129  267:iload_3         
	//  130  268:istore          4
						if(i > 0)
	//* 131  270:iload_2         
	//* 132  271:ifle            346
						{
							k = j;
	//  133  274:iload_3         
	//  134  275:istore          4
							if(!mPrefetchRegistry.lastPrefetchIncludedPosition(r.mPosition))
	//* 135  277:aload_0         
	//* 136  278:getfield        #30  <Field RecyclerView this$0>
	//* 137  281:getfield        #454 <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//* 138  284:aload_1         
	//* 139  285:getfield        #421 <Field int RecyclerView$ViewHolder.mPosition>
	//* 140  288:invokevirtual   #502 <Method boolean GapWorker$LayoutPrefetchRegistryImpl.lastPrefetchIncludedPosition(int)>
	//* 141  291:ifne            346
							{
								i--;
	//  142  294:iload_2         
	//  143  295:iconst_1        
	//  144  296:isub            
	//  145  297:istore_2        
								do
								{
									if(i < 0)
										break;
	//  146  298:iload_2         
	//  147  299:iflt            341
									j = ((r)mCachedViews.get(i)).mPosition;
	//  148  302:aload_0         
	//  149  303:getfield        #42  <Field ArrayList mCachedViews>
	//  150  306:iload_2         
	//  151  307:invokevirtual   #287 <Method Object ArrayList.get(int)>
	//  152  310:checkcast       #93  <Class RecyclerView$ViewHolder>
	//  153  313:getfield        #421 <Field int RecyclerView$ViewHolder.mPosition>
	//  154  316:istore_3        
									if(!mPrefetchRegistry.lastPrefetchIncludedPosition(j))
	//* 155  317:aload_0         
	//* 156  318:getfield        #30  <Field RecyclerView this$0>
	//* 157  321:getfield        #454 <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//* 158  324:iload_3         
	//* 159  325:invokevirtual   #502 <Method boolean GapWorker$LayoutPrefetchRegistryImpl.lastPrefetchIncludedPosition(int)>
	//* 160  328:ifne            334
										break;
	//  161  331:goto            341
									i--;
	//  162  334:iload_2         
	//  163  335:iconst_1        
	//  164  336:isub            
	//  165  337:istore_2        
								} while(true);
	//  166  338:goto            298
								k = i + 1;
	//  167  341:iload_2         
	//  168  342:iconst_1        
	//  169  343:iadd            
	//  170  344:istore          4
							}
						}
					}
					mCachedViews.add(k, ((Object) (r)));
	//  171  346:aload_0         
	//  172  347:getfield        #42  <Field ArrayList mCachedViews>
	//  173  350:iload           4
	//  174  352:aload_1         
	//  175  353:invokevirtual   #506 <Method void ArrayList.add(int, Object)>
					i = 1;
	//  176  356:iconst_1        
	//  177  357:istore_2        
				}
			}
			j = i;
	//  178  358:iload_2         
	//  179  359:istore_3        
			k = ((int) (flag1));
	//  180  360:iload           5
	//  181  362:istore          4
			if(i == 0)
	//* 182  364:iload_2         
	//* 183  365:ifne            379
			{
				addViewHolderToRecycledViewPool(r, true);
	//  184  368:aload_0         
	//  185  369:aload_1         
	//  186  370:iconst_1        
	//  187  371:invokevirtual   #461 <Method void addViewHolderToRecycledViewPool(RecyclerView$ViewHolder, boolean)>
				k = 1;
	//  188  374:iconst_1        
	//  189  375:istore          4
				j = i;
	//  190  377:iload_2         
	//  191  378:istore_3        
			}
		}
		mViewInfoStore.removeViewHolder(r);
	//  192  379:aload_0         
	//  193  380:getfield        #30  <Field RecyclerView this$0>
	//  194  383:getfield        #312 <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//  195  386:aload_1         
	//  196  387:invokevirtual   #317 <Method void ViewInfoStore.removeViewHolder(RecyclerView$ViewHolder)>
		if(j == 0 && k == 0 && flag4)
	//* 197  390:iload_3         
	//* 198  391:ifne            409
	//* 199  394:iload           4
	//* 200  396:ifne            409
	//* 201  399:iload           7
	//* 202  401:ifeq            409
			r.mOwnerRecyclerView = null;
	//  203  404:aload_1         
	//  204  405:aconst_null     
	//  205  406:putfield        #122 <Field RecyclerView RecyclerView$ViewHolder.mOwnerRecyclerView>
	//  206  409:return          
	}

	void recycleViewInternal(View view)
	{
		recycleViewHolderInternal(RecyclerView.getChildViewHolderInt(view));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #187 <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    3    5:invokevirtual   #447 <Method void recycleViewHolderInternal(RecyclerView$ViewHolder)>
	//    4    8:return          
	}

	void scrapView(View view)
	{
		view = ((View) (RecyclerView.getChildViewHolderInt(view)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #187 <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:astore_1        
		if(((r) (view)).hasAnyOfTheFlags(12) || !((r) (view)).isUpdated() || canReuseUpdatedViewHolder(((r) (view))))
	//*   3    5:aload_1         
	//*   4    6:bipush          12
	//*   5    8:invokevirtual   #499 <Method boolean RecyclerView$ViewHolder.hasAnyOfTheFlags(int)>
	//*   6   11:ifne            32
	//*   7   14:aload_1         
	//*   8   15:invokevirtual   #510 <Method boolean RecyclerView$ViewHolder.isUpdated()>
	//*   9   18:ifeq            32
	//*  10   21:aload_0         
	//*  11   22:getfield        #30  <Field RecyclerView this$0>
	//*  12   25:aload_1         
	//*  13   26:invokevirtual   #513 <Method boolean RecyclerView.canReuseUpdatedViewHolder(RecyclerView$ViewHolder)>
	//*  14   29:ifeq            86
			if(((r) (view)).isInvalid() && !((r) (view)).isRemoved() && !mAdapter.hasStableIds())
	//*  15   32:aload_1         
	//*  16   33:invokevirtual   #370 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//*  17   36:ifeq            70
	//*  18   39:aload_1         
	//*  19   40:invokevirtual   #348 <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*  20   43:ifne            70
	//*  21   46:aload_0         
	//*  22   47:getfield        #30  <Field RecyclerView this$0>
	//*  23   50:getfield        #143 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  24   53:invokevirtual   #331 <Method boolean RecyclerView$Adapter.hasStableIds()>
	//*  25   56:ifne            70
			{
				throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
	//   26   59:new             #189 <Class IllegalArgumentException>
	//   27   62:dup             
	//   28   63:ldc2            #515 <String "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.">
	//   29   66:invokespecial   #194 <Method void IllegalArgumentException(String)>
	//   30   69:athrow          
			} else
			{
				((r) (view)).setScrapContainer(this, false);
	//   31   70:aload_1         
	//   32   71:aload_0         
	//   33   72:iconst_0        
	//   34   73:invokevirtual   #519 <Method void RecyclerView$ViewHolder.setScrapContainer(RecyclerView$Recycler, boolean)>
				mAttachedScrap.add(((Object) (view)));
	//   35   76:aload_0         
	//   36   77:getfield        #38  <Field ArrayList mAttachedScrap>
	//   37   80:aload_1         
	//   38   81:invokevirtual   #522 <Method boolean ArrayList.add(Object)>
	//   39   84:pop             
				return;
	//   40   85:return          
			}
		if(mChangedScrap == null)
	//*  41   86:aload_0         
	//*  42   87:getfield        #40  <Field ArrayList mChangedScrap>
	//*  43   90:ifnonnull       104
			mChangedScrap = new ArrayList();
	//   44   93:aload_0         
	//   45   94:new             #35  <Class ArrayList>
	//   46   97:dup             
	//   47   98:invokespecial   #36  <Method void ArrayList()>
	//   48  101:putfield        #40  <Field ArrayList mChangedScrap>
		((r) (view)).setScrapContainer(this, true);
	//   49  104:aload_1         
	//   50  105:aload_0         
	//   51  106:iconst_1        
	//   52  107:invokevirtual   #519 <Method void RecyclerView$ViewHolder.setScrapContainer(RecyclerView$Recycler, boolean)>
		mChangedScrap.add(((Object) (view)));
	//   53  110:aload_0         
	//   54  111:getfield        #40  <Field ArrayList mChangedScrap>
	//   55  114:aload_1         
	//   56  115:invokevirtual   #522 <Method boolean ArrayList.add(Object)>
	//   57  118:pop             
	//   58  119:return          
	}

	void setAdapterPositionsAsUnknown()
	{
		int j = mCachedViews.size();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field ArrayList mCachedViews>
	//    2    4:invokevirtual   #283 <Method int ArrayList.size()>
	//    3    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          45
		{
			r r = (r)mCachedViews.get(i);
	//    9   15:aload_0         
	//   10   16:getfield        #42  <Field ArrayList mCachedViews>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #287 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #93  <Class RecyclerView$ViewHolder>
	//   14   26:astore_3        
			if(r != null)
	//*  15   27:aload_3         
	//*  16   28:ifnull          38
				r.addFlags(512);
	//   17   31:aload_3         
	//   18   32:sipush          512
	//   19   35:invokevirtual   #328 <Method void RecyclerView$ViewHolder.addFlags(int)>
		}

	//   20   38:iload_1         
	//   21   39:iconst_1        
	//   22   40:iadd            
	//   23   41:istore_1        
	//*  24   42:goto            10
	//   25   45:return          
	}

	void setRecycledViewPool(iewPool iewpool)
	{
		if(mRecyclerPool != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #133 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//*   2    4:ifnull          14
			mRecyclerPool.detach();
	//    3    7:aload_0         
	//    4    8:getfield        #133 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//    5   11:invokevirtual   #528 <Method void RecyclerView$RecycledViewPool.detach()>
		mRecyclerPool = iewpool;
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:putfield        #133 <Field RecyclerView$RecycledViewPool mRecyclerPool>
		if(iewpool != null)
	//*   9   19:aload_1         
	//*  10   20:ifnull          37
			mRecyclerPool.attach(getAdapter());
	//   11   23:aload_0         
	//   12   24:getfield        #133 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//   13   27:aload_0         
	//   14   28:getfield        #30  <Field RecyclerView this$0>
	//   15   31:invokevirtual   #532 <Method RecyclerView$Adapter RecyclerView.getAdapter()>
	//   16   34:invokevirtual   #536 <Method void RecyclerView$RecycledViewPool.attach(RecyclerView$Adapter)>
	//   17   37:return          
	}

	void setViewCacheExtension(Extension extension)
	{
		mViewCacheExtension = extension;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #540 <Field RecyclerView$ViewCacheExtension mViewCacheExtension>
	//    3    5:return          
	}

	public void setViewCacheSize(int i)
	{
		mRequestedCacheMax = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #52  <Field int mRequestedCacheMax>
		updateViewCacheSize();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #544 <Method void updateViewCacheSize()>
	//    5    9:return          
	}

	r tryGetViewHolderForPositionByDeadline(int i, boolean flag, long l)
	{
		if(i < 0 || i >= mState.getItemCount())
	//*   0    0:iload_1         
	//*   1    1:iflt            18
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #30  <Field RecyclerView this$0>
	//*   5    9:getfield        #159 <Field RecyclerView$State RecyclerView.mState>
	//*   6   12:invokevirtual   #228 <Method int RecyclerView$State.getItemCount()>
	//*   7   15:icmplt          75
			throw new IndexOutOfBoundsException((new StringBuilder()).append("Invalid item position ").append(i).append("(").append(i).append("). Item count:").append(mState.getItemCount()).toString());
	//    8   18:new             #209 <Class IndexOutOfBoundsException>
	//    9   21:dup             
	//   10   22:new             #211 <Class StringBuilder>
	//   11   25:dup             
	//   12   26:invokespecial   #212 <Method void StringBuilder()>
	//   13   29:ldc2            #547 <String "Invalid item position ">
	//   14   32:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:iload_1         
	//   16   36:invokevirtual   #221 <Method StringBuilder StringBuilder.append(int)>
	//   17   39:ldc2            #549 <String "(">
	//   18   42:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   19   45:iload_1         
	//   20   46:invokevirtual   #221 <Method StringBuilder StringBuilder.append(int)>
	//   21   49:ldc2            #551 <String "). Item count:">
	//   22   52:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   23   55:aload_0         
	//   24   56:getfield        #30  <Field RecyclerView this$0>
	//   25   59:getfield        #159 <Field RecyclerView$State RecyclerView.mState>
	//   26   62:invokevirtual   #228 <Method int RecyclerView$State.getItemCount()>
	//   27   65:invokevirtual   #221 <Method StringBuilder StringBuilder.append(int)>
	//   28   68:invokevirtual   #232 <Method String StringBuilder.toString()>
	//   29   71:invokespecial   #233 <Method void IndexOutOfBoundsException(String)>
	//   30   74:athrow          
		boolean flag2 = false;
	//   31   75:iconst_0        
	//   32   76:istore          6
		r r = null;
	//   33   78:aconst_null     
	//   34   79:astore          14
		if(mState.isPreLayout())
	//*  35   81:aload_0         
	//*  36   82:getfield        #30  <Field RecyclerView this$0>
	//*  37   85:getfield        #159 <Field RecyclerView$State RecyclerView.mState>
	//*  38   88:invokevirtual   #164 <Method boolean RecyclerView$State.isPreLayout()>
	//*  39   91:ifeq            115
		{
			r = getChangedScrapViewForPosition(i);
	//   40   94:aload_0         
	//   41   95:iload_1         
	//   42   96:invokevirtual   #553 <Method RecyclerView$ViewHolder getChangedScrapViewForPosition(int)>
	//   43   99:astore          14
			if(r != null)
	//*  44  101:aload           14
	//*  45  103:ifnull          112
				flag2 = true;
	//   46  106:iconst_1        
	//   47  107:istore          6
			else
	//*  48  109:goto            115
				flag2 = false;
	//   49  112:iconst_0        
	//   50  113:istore          6
		}
		boolean flag1 = flag2;
	//   51  115:iload           6
	//   52  117:istore          5
		Object obj = ((Object) (r));
	//   53  119:aload           14
	//   54  121:astore          13
		if(r == null)
	//*  55  123:aload           14
	//*  56  125:ifnonnull       233
		{
			r = getScrapOrHiddenOrCachedHolderForPosition(i, flag);
	//   57  128:aload_0         
	//   58  129:iload_1         
	//   59  130:iload_2         
	//   60  131:invokevirtual   #555 <Method RecyclerView$ViewHolder getScrapOrHiddenOrCachedHolderForPosition(int, boolean)>
	//   61  134:astore          14
			flag1 = flag2;
	//   62  136:iload           6
	//   63  138:istore          5
			obj = ((Object) (r));
	//   64  140:aload           14
	//   65  142:astore          13
			if(r != null)
	//*  66  144:aload           14
	//*  67  146:ifnull          233
				if(!validateViewHolderForOffsetPosition(r))
	//*  68  149:aload_0         
	//*  69  150:aload           14
	//*  70  152:invokevirtual   #558 <Method boolean validateViewHolderForOffsetPosition(RecyclerView$ViewHolder)>
	//*  71  155:ifne            226
				{
					if(!flag)
	//*  72  158:iload_2         
	//*  73  159:ifne            216
					{
						r.addFlags(4);
	//   74  162:aload           14
	//   75  164:iconst_4        
	//   76  165:invokevirtual   #328 <Method void RecyclerView$ViewHolder.addFlags(int)>
						if(r.isScrap())
	//*  77  168:aload           14
	//*  78  170:invokevirtual   #468 <Method boolean RecyclerView$ViewHolder.isScrap()>
	//*  79  173:ifeq            197
						{
							removeDetachedView(r.itemView, false);
	//   80  176:aload_0         
	//   81  177:getfield        #30  <Field RecyclerView this$0>
	//   82  180:aload           14
	//   83  182:getfield        #97  <Field View RecyclerView$ViewHolder.itemView>
	//   84  185:iconst_0        
	//   85  186:invokevirtual   #359 <Method void RecyclerView.removeDetachedView(View, boolean)>
							r.unScrap();
	//   86  189:aload           14
	//   87  191:invokevirtual   #471 <Method void RecyclerView$ViewHolder.unScrap()>
						} else
	//*  88  194:goto            210
						if(r.wasReturnedFromScrap())
	//*  89  197:aload           14
	//*  90  199:invokevirtual   #322 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//*  91  202:ifeq            210
							r.clearReturnedFromScrapFlag();
	//   92  205:aload           14
	//   93  207:invokevirtual   #444 <Method void RecyclerView$ViewHolder.clearReturnedFromScrapFlag()>
						recycleViewHolderInternal(r);
	//   94  210:aload_0         
	//   95  211:aload           14
	//   96  213:invokevirtual   #447 <Method void recycleViewHolderInternal(RecyclerView$ViewHolder)>
					}
					obj = null;
	//   97  216:aconst_null     
	//   98  217:astore          13
					flag1 = flag2;
	//   99  219:iload           6
	//  100  221:istore          5
				} else
	//* 101  223:goto            233
				{
					flag1 = true;
	//  102  226:iconst_1        
	//  103  227:istore          5
					obj = ((Object) (r));
	//  104  229:aload           14
	//  105  231:astore          13
				}
		}
		int k = ((int) (flag1));
	//  106  233:iload           5
	//  107  235:istore          7
		r = ((r) (obj));
	//  108  237:aload           13
	//  109  239:astore          14
		if(obj == null)
	//* 110  241:aload           13
	//* 111  243:ifnonnull       695
		{
			k = mAdapterHelper.findPositionOffset(i);
	//  112  246:aload_0         
	//  113  247:getfield        #30  <Field RecyclerView this$0>
	//  114  250:getfield        #198 <Field AdapterHelper RecyclerView.mAdapterHelper>
	//  115  253:iload_1         
	//  116  254:invokevirtual   #204 <Method int AdapterHelper.findPositionOffset(int)>
	//  117  257:istore          7
			if(k < 0 || k >= mAdapter.getItemCount())
	//* 118  259:iload           7
	//* 119  261:iflt            279
	//* 120  264:iload           7
	//* 121  266:aload_0         
	//* 122  267:getfield        #30  <Field RecyclerView this$0>
	//* 123  270:getfield        #143 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//* 124  273:invokevirtual   #207 <Method int RecyclerView$Adapter.getItemCount()>
	//* 125  276:icmplt          339
				throw new IndexOutOfBoundsException((new StringBuilder()).append("Inconsistency detected. Invalid item position ").append(i).append("(offset:").append(k).append(").").append("state:").append(mState.getItemCount()).toString());
	//  126  279:new             #209 <Class IndexOutOfBoundsException>
	//  127  282:dup             
	//  128  283:new             #211 <Class StringBuilder>
	//  129  286:dup             
	//  130  287:invokespecial   #212 <Method void StringBuilder()>
	//  131  290:ldc1            #214 <String "Inconsistency detected. Invalid item position ">
	//  132  292:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//  133  295:iload_1         
	//  134  296:invokevirtual   #221 <Method StringBuilder StringBuilder.append(int)>
	//  135  299:ldc1            #223 <String "(offset:">
	//  136  301:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//  137  304:iload           7
	//  138  306:invokevirtual   #221 <Method StringBuilder StringBuilder.append(int)>
	//  139  309:ldc1            #225 <String ").">
	//  140  311:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//  141  314:ldc1            #227 <String "state:">
	//  142  316:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//  143  319:aload_0         
	//  144  320:getfield        #30  <Field RecyclerView this$0>
	//  145  323:getfield        #159 <Field RecyclerView$State RecyclerView.mState>
	//  146  326:invokevirtual   #228 <Method int RecyclerView$State.getItemCount()>
	//  147  329:invokevirtual   #221 <Method StringBuilder StringBuilder.append(int)>
	//  148  332:invokevirtual   #232 <Method String StringBuilder.toString()>
	//  149  335:invokespecial   #233 <Method void IndexOutOfBoundsException(String)>
	//  150  338:athrow          
			int i1 = mAdapter.getItemViewType(k);
	//  151  339:aload_0         
	//  152  340:getfield        #30  <Field RecyclerView this$0>
	//  153  343:getfield        #143 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//  154  346:iload           7
	//  155  348:invokevirtual   #560 <Method int RecyclerView$Adapter.getItemViewType(int)>
	//  156  351:istore          8
			boolean flag3 = flag1;
	//  157  353:iload           5
	//  158  355:istore          6
			r = ((r) (obj));
	//  159  357:aload           13
	//  160  359:astore          14
			if(mAdapter.hasStableIds())
	//* 161  361:aload_0         
	//* 162  362:getfield        #30  <Field RecyclerView this$0>
	//* 163  365:getfield        #143 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//* 164  368:invokevirtual   #331 <Method boolean RecyclerView$Adapter.hasStableIds()>
	//* 165  371:ifeq            422
			{
				obj = ((Object) (getScrapOrCachedViewForId(mAdapter.getItemId(k), i1, flag)));
	//  166  374:aload_0         
	//  167  375:aload_0         
	//  168  376:getfield        #30  <Field RecyclerView this$0>
	//  169  379:getfield        #143 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//  170  382:iload           7
	//  171  384:invokevirtual   #335 <Method long RecyclerView$Adapter.getItemId(int)>
	//  172  387:iload           8
	//  173  389:iload_2         
	//  174  390:invokevirtual   #562 <Method RecyclerView$ViewHolder getScrapOrCachedViewForId(long, int, boolean)>
	//  175  393:astore          13
				flag3 = flag1;
	//  176  395:iload           5
	//  177  397:istore          6
				r = ((r) (obj));
	//  178  399:aload           13
	//  179  401:astore          14
				if(obj != null)
	//* 180  403:aload           13
	//* 181  405:ifnull          422
				{
					obj.mPosition = k;
	//  182  408:aload           13
	//  183  410:iload           7
	//  184  412:putfield        #421 <Field int RecyclerView$ViewHolder.mPosition>
					flag3 = true;
	//  185  415:iconst_1        
	//  186  416:istore          6
					r = ((r) (obj));
	//  187  418:aload           13
	//  188  420:astore          14
				}
			}
			obj = ((Object) (r));
	//  189  422:aload           14
	//  190  424:astore          13
			if(r == null)
	//* 191  426:aload           14
	//* 192  428:ifnonnull       514
			{
				obj = ((Object) (r));
	//  193  431:aload           14
	//  194  433:astore          13
				if(mViewCacheExtension != null)
	//* 195  435:aload_0         
	//* 196  436:getfield        #540 <Field RecyclerView$ViewCacheExtension mViewCacheExtension>
	//* 197  439:ifnull          514
				{
					View view = mViewCacheExtension.getViewForPositionAndType(this, i, i1);
	//  198  442:aload_0         
	//  199  443:getfield        #540 <Field RecyclerView$ViewCacheExtension mViewCacheExtension>
	//  200  446:aload_0         
	//  201  447:iload_1         
	//  202  448:iload           8
	//  203  450:invokevirtual   #568 <Method View RecyclerView$ViewCacheExtension.getViewForPositionAndType(RecyclerView$Recycler, int, int)>
	//  204  453:astore          15
					obj = ((Object) (r));
	//  205  455:aload           14
	//  206  457:astore          13
					if(view != null)
	//* 207  459:aload           15
	//* 208  461:ifnull          514
					{
						r = getChildViewHolder(view);
	//  209  464:aload_0         
	//  210  465:getfield        #30  <Field RecyclerView this$0>
	//  211  468:aload           15
	//  212  470:invokevirtual   #571 <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolder(View)>
	//  213  473:astore          14
						if(r == null)
	//* 214  475:aload           14
	//* 215  477:ifnonnull       491
							throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder");
	//  216  480:new             #189 <Class IllegalArgumentException>
	//  217  483:dup             
	//  218  484:ldc2            #573 <String "getViewForPositionAndType returned a view which does not have a ViewHolder">
	//  219  487:invokespecial   #194 <Method void IllegalArgumentException(String)>
	//  220  490:athrow          
						obj = ((Object) (r));
	//  221  491:aload           14
	//  222  493:astore          13
						if(r.shouldIgnore())
	//* 223  495:aload           14
	//* 224  497:invokevirtual   #483 <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//* 225  500:ifeq            514
							throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
	//  226  503:new             #189 <Class IllegalArgumentException>
	//  227  506:dup             
	//  228  507:ldc2            #575 <String "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.">
	//  229  510:invokespecial   #194 <Method void IllegalArgumentException(String)>
	//  230  513:athrow          
					}
				}
			}
			r r1 = ((r) (obj));
	//  231  514:aload           13
	//  232  516:astore          15
			if(obj == null)
	//* 233  518:aload           13
	//* 234  520:ifnonnull       568
			{
				obj = ((Object) (getRecycledViewPool().getRecycledView(i1)));
	//  235  523:aload_0         
	//  236  524:invokevirtual   #179 <Method RecyclerView$RecycledViewPool getRecycledViewPool()>
	//  237  527:iload           8
	//  238  529:invokevirtual   #578 <Method RecyclerView$ViewHolder RecyclerView$RecycledViewPool.getRecycledView(int)>
	//  239  532:astore          13
				r1 = ((r) (obj));
	//  240  534:aload           13
	//  241  536:astore          15
				if(obj != null)
	//* 242  538:aload           13
	//* 243  540:ifnull          568
				{
					((r) (obj)).resetInternal();
	//  244  543:aload           13
	//  245  545:invokevirtual   #581 <Method void RecyclerView$ViewHolder.resetInternal()>
					r1 = ((r) (obj));
	//  246  548:aload           13
	//  247  550:astore          15
					if(RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST)
	//* 248  552:getstatic       #584 <Field boolean RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST>
	//* 249  555:ifeq            568
					{
						invalidateDisplayListInt(((r) (obj)));
	//  250  558:aload_0         
	//  251  559:aload           13
	//  252  561:invokespecial   #586 <Method void invalidateDisplayListInt(RecyclerView$ViewHolder)>
						r1 = ((r) (obj));
	//  253  564:aload           13
	//  254  566:astore          15
					}
				}
			}
			k = ((int) (flag3));
	//  255  568:iload           6
	//  256  570:istore          7
			r = r1;
	//  257  572:aload           15
	//  258  574:astore          14
			if(r1 == null)
	//* 259  576:aload           15
	//* 260  578:ifnonnull       695
			{
				long l1 = getNanoTime();
	//  261  581:aload_0         
	//  262  582:getfield        #30  <Field RecyclerView this$0>
	//  263  585:invokevirtual   #129 <Method long RecyclerView.getNanoTime()>
	//  264  588:lstore          9
				if(l != 0xffffffffL && !mRecyclerPool.willCreateInTime(i1, l1, l))
	//* 265  590:lload_3         
	//* 266  591:ldc2w           #130 <Long 0xffffffffL>
	//* 267  594:lcmp            
	//* 268  595:ifeq            615
	//* 269  598:aload_0         
	//* 270  599:getfield        #133 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//* 271  602:iload           8
	//* 272  604:lload           9
	//* 273  606:lload_3         
	//* 274  607:invokevirtual   #589 <Method boolean RecyclerView$RecycledViewPool.willCreateInTime(int, long, long)>
	//* 275  610:ifne            615
					return null;
	//  276  613:aconst_null     
	//  277  614:areturn         
				r = mAdapter.createViewHolder(((ViewGroup) (RecyclerView.this)), i1);
	//  278  615:aload_0         
	//  279  616:getfield        #30  <Field RecyclerView this$0>
	//  280  619:getfield        #143 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//  281  622:aload_0         
	//  282  623:getfield        #30  <Field RecyclerView this$0>
	//  283  626:iload           8
	//  284  628:invokevirtual   #593 <Method RecyclerView$ViewHolder RecyclerView$Adapter.createViewHolder(ViewGroup, int)>
	//  285  631:astore          14
				if(RecyclerView.access$600())
	//* 286  633:invokestatic    #450 <Method boolean RecyclerView.access$600()>
	//* 287  636:ifeq            668
				{
					obj = ((Object) (RecyclerView.findNestedRecyclerView(r.itemView)));
	//  288  639:aload           14
	//  289  641:getfield        #97  <Field View RecyclerView$ViewHolder.itemView>
	//  290  644:invokestatic    #597 <Method RecyclerView RecyclerView.findNestedRecyclerView(View)>
	//  291  647:astore          13
					if(obj != null)
	//* 292  649:aload           13
	//* 293  651:ifnull          668
						r.mNestedRecyclerView = new WeakReference(obj);
	//  294  654:aload           14
	//  295  656:new             #599 <Class WeakReference>
	//  296  659:dup             
	//  297  660:aload           13
	//  298  662:invokespecial   #601 <Method void WeakReference(Object)>
	//  299  665:putfield        #605 <Field WeakReference RecyclerView$ViewHolder.mNestedRecyclerView>
				}
				long l2 = getNanoTime();
	//  300  668:aload_0         
	//  301  669:getfield        #30  <Field RecyclerView this$0>
	//  302  672:invokevirtual   #129 <Method long RecyclerView.getNanoTime()>
	//  303  675:lstore          11
				mRecyclerPool.factorInCreateTime(i1, l2 - l1);
	//  304  677:aload_0         
	//  305  678:getfield        #133 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//  306  681:iload           8
	//  307  683:lload           11
	//  308  685:lload           9
	//  309  687:lsub            
	//  310  688:invokevirtual   #608 <Method void RecyclerView$RecycledViewPool.factorInCreateTime(int, long)>
				k = ((int) (flag3));
	//  311  691:iload           6
	//  312  693:istore          7
			}
		}
		if(k != 0 && !mState.isPreLayout() && r.hasAnyOfTheFlags(8192))
	//* 313  695:iload           7
	//* 314  697:ifeq            796
	//* 315  700:aload_0         
	//* 316  701:getfield        #30  <Field RecyclerView this$0>
	//* 317  704:getfield        #159 <Field RecyclerView$State RecyclerView.mState>
	//* 318  707:invokevirtual   #164 <Method boolean RecyclerView$State.isPreLayout()>
	//* 319  710:ifne            796
	//* 320  713:aload           14
	//* 321  715:sipush          8192
	//* 322  718:invokevirtual   #499 <Method boolean RecyclerView$ViewHolder.hasAnyOfTheFlags(int)>
	//* 323  721:ifeq            796
		{
			r.setFlags(0, 8192);
	//  324  724:aload           14
	//  325  726:iconst_0        
	//  326  727:sipush          8192
	//  327  730:invokevirtual   #352 <Method void RecyclerView$ViewHolder.setFlags(int, int)>
			if(mState.mRunSimpleAnimations)
	//* 328  733:aload_0         
	//* 329  734:getfield        #30  <Field RecyclerView this$0>
	//* 330  737:getfield        #159 <Field RecyclerView$State RecyclerView.mState>
	//* 331  740:getfield        #611 <Field boolean RecyclerView$State.mRunSimpleAnimations>
	//* 332  743:ifeq            796
			{
				int j = tor.buildAdapterChangeFlagsForAnimations(r);
	//  333  746:aload           14
	//  334  748:invokestatic    #617 <Method int RecyclerView$ItemAnimator.buildAdapterChangeFlagsForAnimations(RecyclerView$ViewHolder)>
	//  335  751:istore          5
				obj = ((Object) (mItemAnimator.recordPreLayoutInformation(mState, r, j | 0x1000, r.getUnmodifiedPayloads())));
	//  336  753:aload_0         
	//  337  754:getfield        #30  <Field RecyclerView this$0>
	//  338  757:getfield        #621 <Field RecyclerView$ItemAnimator RecyclerView.mItemAnimator>
	//  339  760:aload_0         
	//  340  761:getfield        #30  <Field RecyclerView this$0>
	//  341  764:getfield        #159 <Field RecyclerView$State RecyclerView.mState>
	//  342  767:aload           14
	//  343  769:iload           5
	//  344  771:sipush          4096
	//  345  774:ior             
	//  346  775:aload           14
	//  347  777:invokevirtual   #624 <Method List RecyclerView$ViewHolder.getUnmodifiedPayloads()>
	//  348  780:invokevirtual   #628 <Method RecyclerView$ItemAnimator$ItemHolderInfo RecyclerView$ItemAnimator.recordPreLayoutInformation(RecyclerView$State, RecyclerView$ViewHolder, int, List)>
	//  349  783:astore          13
				recordAnimationInfoIfBouncedHiddenView(r, ((tor.ItemHolderInfo) (obj)));
	//  350  785:aload_0         
	//  351  786:getfield        #30  <Field RecyclerView this$0>
	//  352  789:aload           14
	//  353  791:aload           13
	//  354  793:invokevirtual   #632 <Method void RecyclerView.recordAnimationInfoIfBouncedHiddenView(RecyclerView$ViewHolder, RecyclerView$ItemAnimator$ItemHolderInfo)>
			}
		}
		flag = false;
	//  355  796:iconst_0        
	//  356  797:istore_2        
		if(mState.isPreLayout() && r.isBound())
	//* 357  798:aload_0         
	//* 358  799:getfield        #30  <Field RecyclerView this$0>
	//* 359  802:getfield        #159 <Field RecyclerView$State RecyclerView.mState>
	//* 360  805:invokevirtual   #164 <Method boolean RecyclerView$State.isPreLayout()>
	//* 361  808:ifeq            828
	//* 362  811:aload           14
	//* 363  813:invokevirtual   #635 <Method boolean RecyclerView$ViewHolder.isBound()>
	//* 364  816:ifeq            828
			r.mPreLayoutPosition = i;
	//  365  819:aload           14
	//  366  821:iload_1         
	//  367  822:putfield        #167 <Field int RecyclerView$ViewHolder.mPreLayoutPosition>
		else
	//* 368  825:goto            872
		if(!r.isBound() || r.needsUpdate() || r.isInvalid())
	//* 369  828:aload           14
	//* 370  830:invokevirtual   #635 <Method boolean RecyclerView$ViewHolder.isBound()>
	//* 371  833:ifeq            852
	//* 372  836:aload           14
	//* 373  838:invokevirtual   #638 <Method boolean RecyclerView$ViewHolder.needsUpdate()>
	//* 374  841:ifne            852
	//* 375  844:aload           14
	//* 376  846:invokevirtual   #370 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//* 377  849:ifeq            872
			flag = tryBindViewHolderByDeadline(r, mAdapterHelper.findPositionOffset(i), i, l);
	//  378  852:aload_0         
	//  379  853:aload           14
	//  380  855:aload_0         
	//  381  856:getfield        #30  <Field RecyclerView this$0>
	//  382  859:getfield        #198 <Field AdapterHelper RecyclerView.mAdapterHelper>
	//  383  862:iload_1         
	//  384  863:invokevirtual   #204 <Method int AdapterHelper.findPositionOffset(int)>
	//  385  866:iload_1         
	//  386  867:lload_3         
	//  387  868:invokespecial   #235 <Method boolean tryBindViewHolderByDeadline(RecyclerView$ViewHolder, int, int, long)>
	//  388  871:istore_2        
		obj = ((Object) (r.itemView.getLayoutParams()));
	//  389  872:aload           14
	//  390  874:getfield        #97  <Field View RecyclerView$ViewHolder.itemView>
	//  391  877:invokevirtual   #241 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  392  880:astore          13
		if(obj == null)
	//* 393  882:aload           13
	//* 394  884:ifnonnull       912
		{
			obj = ((Object) ((ams)generateDefaultLayoutParams()));
	//  395  887:aload_0         
	//  396  888:getfield        #30  <Field RecyclerView this$0>
	//  397  891:invokevirtual   #244 <Method android.view.ViewGroup$LayoutParams RecyclerView.generateDefaultLayoutParams()>
	//  398  894:checkcast       #246 <Class RecyclerView$LayoutParams>
	//  399  897:astore          13
			r.itemView.setLayoutParams(((android.view.) (obj)));
	//  400  899:aload           14
	//  401  901:getfield        #97  <Field View RecyclerView$ViewHolder.itemView>
	//  402  904:aload           13
	//  403  906:invokevirtual   #250 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		} else
	//* 404  909:goto            958
		if(!checkLayoutParams(((android.view.) (obj))))
	//* 405  912:aload_0         
	//* 406  913:getfield        #30  <Field RecyclerView this$0>
	//* 407  916:aload           13
	//* 408  918:invokevirtual   #254 <Method boolean RecyclerView.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 409  921:ifne            951
		{
			obj = ((Object) ((ams)generateLayoutParams(((android.view.) (obj)))));
	//  410  924:aload_0         
	//  411  925:getfield        #30  <Field RecyclerView this$0>
	//  412  928:aload           13
	//  413  930:invokevirtual   #258 <Method android.view.ViewGroup$LayoutParams RecyclerView.generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//  414  933:checkcast       #246 <Class RecyclerView$LayoutParams>
	//  415  936:astore          13
			r.itemView.setLayoutParams(((android.view.) (obj)));
	//  416  938:aload           14
	//  417  940:getfield        #97  <Field View RecyclerView$ViewHolder.itemView>
	//  418  943:aload           13
	//  419  945:invokevirtual   #250 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		} else
	//* 420  948:goto            958
		{
			obj = ((Object) ((ams)obj));
	//  421  951:aload           13
	//  422  953:checkcast       #246 <Class RecyclerView$LayoutParams>
	//  423  956:astore          13
		}
		obj.mViewHolder = r;
	//  424  958:aload           13
	//  425  960:aload           14
	//  426  962:putfield        #266 <Field RecyclerView$ViewHolder RecyclerView$LayoutParams.mViewHolder>
		if(k != 0 && flag)
	//* 427  965:iload           7
	//* 428  967:ifeq            979
	//* 429  970:iload_2         
	//* 430  971:ifeq            979
			flag = true;
	//  431  974:iconst_1        
	//  432  975:istore_2        
		else
	//* 433  976:goto            981
			flag = false;
	//  434  979:iconst_0        
	//  435  980:istore_2        
		obj.mPendingInvalidate = flag;
	//  436  981:aload           13
	//  437  983:iload_2         
	//  438  984:putfield        #273 <Field boolean RecyclerView$LayoutParams.mPendingInvalidate>
		return r;
	//  439  987:aload           14
	//  440  989:areturn         
	}

	void unscrapView(r r)
	{
		if(r.access._mth900(r))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #643 <Method boolean RecyclerView$ViewHolder.access$900(RecyclerView$ViewHolder)>
	//*   2    4:ifeq            19
			mChangedScrap.remove(((Object) (r)));
	//    3    7:aload_0         
	//    4    8:getfield        #40  <Field ArrayList mChangedScrap>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #645 <Method boolean ArrayList.remove(Object)>
	//    7   15:pop             
		else
	//*   8   16:goto            28
			mAttachedScrap.remove(((Object) (r)));
	//    9   19:aload_0         
	//   10   20:getfield        #38  <Field ArrayList mAttachedScrap>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #645 <Method boolean ArrayList.remove(Object)>
	//   13   27:pop             
		r.access._mth802(r, ((RecyclerView$Recycler) (null)));
	//   14   28:aload_1         
	//   15   29:aconst_null     
	//   16   30:invokestatic    #437 <Method RecyclerView$Recycler RecyclerView$ViewHolder.access$802(RecyclerView$ViewHolder, RecyclerView$Recycler)>
	//   17   33:pop             
		r.access._mth902(r, false);
	//   18   34:aload_1         
	//   19   35:iconst_0        
	//   20   36:invokestatic    #441 <Method boolean RecyclerView$ViewHolder.access$902(RecyclerView$ViewHolder, boolean)>
	//   21   39:pop             
		r.clearReturnedFromScrapFlag();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #444 <Method void RecyclerView$ViewHolder.clearReturnedFromScrapFlag()>
	//   24   44:return          
	}

	void updateViewCacheSize()
	{
		int i;
		if(mLayout != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field RecyclerView this$0>
	//*   2    4:getfield        #649 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//*   3    7:ifnull          24
			i = mLayout.mPrefetchMaxCountObserved;
	//    4   10:aload_0         
	//    5   11:getfield        #30  <Field RecyclerView this$0>
	//    6   14:getfield        #649 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//    7   17:getfield        #654 <Field int RecyclerView$LayoutManager.mPrefetchMaxCountObserved>
	//    8   20:istore_1        
		else
	//*   9   21:goto            26
			i = 0;
	//   10   24:iconst_0        
	//   11   25:istore_1        
		mViewCacheMax = mRequestedCacheMax + i;
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getfield        #52  <Field int mRequestedCacheMax>
	//   15   31:iload_1         
	//   16   32:iadd            
	//   17   33:putfield        #54  <Field int mViewCacheMax>
		for(int j = mCachedViews.size() - 1; j >= 0 && mCachedViews.size() > mViewCacheMax; j--)
	//*  18   36:aload_0         
	//*  19   37:getfield        #42  <Field ArrayList mCachedViews>
	//*  20   40:invokevirtual   #283 <Method int ArrayList.size()>
	//*  21   43:iconst_1        
	//*  22   44:isub            
	//*  23   45:istore_1        
	//*  24   46:iload_1         
	//*  25   47:iflt            76
	//*  26   50:aload_0         
	//*  27   51:getfield        #42  <Field ArrayList mCachedViews>
	//*  28   54:invokevirtual   #283 <Method int ArrayList.size()>
	//*  29   57:aload_0         
	//*  30   58:getfield        #54  <Field int mViewCacheMax>
	//*  31   61:icmple          76
			recycleCachedViewAt(j);
	//   32   64:aload_0         
	//   33   65:iload_1         
	//   34   66:invokevirtual   #365 <Method void recycleCachedViewAt(int)>

	//   35   69:iload_1         
	//   36   70:iconst_1        
	//   37   71:isub            
	//   38   72:istore_1        
	//*  39   73:goto            46
	//   40   76:return          
	}

	boolean validateViewHolderForOffsetPosition(r r)
	{
		if(r.isRemoved())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #348 <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*   2    4:ifeq            18
			return mState.isPreLayout();
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field RecyclerView this$0>
	//    5   11:getfield        #159 <Field RecyclerView$State RecyclerView.mState>
	//    6   14:invokevirtual   #164 <Method boolean RecyclerView$State.isPreLayout()>
	//    7   17:ireturn         
		if(r.mPosition < 0 || r.mPosition >= mAdapter.getItemCount())
	//*   8   18:aload_1         
	//*   9   19:getfield        #421 <Field int RecyclerView$ViewHolder.mPosition>
	//*  10   22:iflt            42
	//*  11   25:aload_1         
	//*  12   26:getfield        #421 <Field int RecyclerView$ViewHolder.mPosition>
	//*  13   29:aload_0         
	//*  14   30:getfield        #30  <Field RecyclerView this$0>
	//*  15   33:getfield        #143 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  16   36:invokevirtual   #207 <Method int RecyclerView$Adapter.getItemCount()>
	//*  17   39:icmplt          70
			throw new IndexOutOfBoundsException((new StringBuilder()).append("Inconsistency detected. Invalid view holder adapter position").append(((Object) (r))).toString());
	//   18   42:new             #209 <Class IndexOutOfBoundsException>
	//   19   45:dup             
	//   20   46:new             #211 <Class StringBuilder>
	//   21   49:dup             
	//   22   50:invokespecial   #212 <Method void StringBuilder()>
	//   23   53:ldc2            #656 <String "Inconsistency detected. Invalid view holder adapter position">
	//   24   56:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   25   59:aload_1         
	//   26   60:invokevirtual   #395 <Method StringBuilder StringBuilder.append(Object)>
	//   27   63:invokevirtual   #232 <Method String StringBuilder.toString()>
	//   28   66:invokespecial   #233 <Method void IndexOutOfBoundsException(String)>
	//   29   69:athrow          
		if(!mState.isPreLayout() && mAdapter.getItemViewType(r.mPosition) != r.getItemViewType())
	//*  30   70:aload_0         
	//*  31   71:getfield        #30  <Field RecyclerView this$0>
	//*  32   74:getfield        #159 <Field RecyclerView$State RecyclerView.mState>
	//*  33   77:invokevirtual   #164 <Method boolean RecyclerView$State.isPreLayout()>
	//*  34   80:ifne            106
	//*  35   83:aload_0         
	//*  36   84:getfield        #30  <Field RecyclerView this$0>
	//*  37   87:getfield        #143 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  38   90:aload_1         
	//*  39   91:getfield        #421 <Field int RecyclerView$ViewHolder.mPosition>
	//*  40   94:invokevirtual   #560 <Method int RecyclerView$Adapter.getItemViewType(int)>
	//*  41   97:aload_1         
	//*  42   98:invokevirtual   #125 <Method int RecyclerView$ViewHolder.getItemViewType()>
	//*  43  101:icmpeq          106
			return false;
	//   44  104:iconst_0        
	//   45  105:ireturn         
		if(mAdapter.hasStableIds())
	//*  46  106:aload_0         
	//*  47  107:getfield        #30  <Field RecyclerView this$0>
	//*  48  110:getfield        #143 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  49  113:invokevirtual   #331 <Method boolean RecyclerView$Adapter.hasStableIds()>
	//*  50  116:ifeq            145
			return r.getItemId() == mAdapter.getItemId(r.mPosition);
	//   51  119:aload_1         
	//   52  120:invokevirtual   #337 <Method long RecyclerView$ViewHolder.getItemId()>
	//   53  123:aload_0         
	//   54  124:getfield        #30  <Field RecyclerView this$0>
	//   55  127:getfield        #143 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   56  130:aload_1         
	//   57  131:getfield        #421 <Field int RecyclerView$ViewHolder.mPosition>
	//   58  134:invokevirtual   #335 <Method long RecyclerView$Adapter.getItemId(int)>
	//   59  137:lcmp            
	//   60  138:ifne            143
	//   61  141:iconst_1        
	//   62  142:ireturn         
	//   63  143:iconst_0        
	//   64  144:ireturn         
		else
			return true;
	//   65  145:iconst_1        
	//   66  146:ireturn         
	}

	void viewRangeUpdate(int i, int j)
	{
		for(int k = mCachedViews.size() - 1; k >= 0; k--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field ArrayList mCachedViews>
	//*   2    4:invokevirtual   #283 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_3        
	//*   6   10:iload_3         
	//*   7   11:iflt            74
		{
			r r = (r)mCachedViews.get(k);
	//    8   14:aload_0         
	//    9   15:getfield        #42  <Field ArrayList mCachedViews>
	//   10   18:iload_3         
	//   11   19:invokevirtual   #287 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #93  <Class RecyclerView$ViewHolder>
	//   13   25:astore          5
			if(r == null)
	//*  14   27:aload           5
	//*  15   29:ifnonnull       35
				continue;
	//   16   32:goto            67
			int l = r.getLayoutPosition();
	//   17   35:aload           5
	//   18   37:invokevirtual   #325 <Method int RecyclerView$ViewHolder.getLayoutPosition()>
	//   19   40:istore          4
			if(l >= i && l < i + j)
	//*  20   42:iload           4
	//*  21   44:iload_1         
	//*  22   45:icmplt          67
	//*  23   48:iload           4
	//*  24   50:iload_1         
	//*  25   51:iload_2         
	//*  26   52:iadd            
	//*  27   53:icmpge          67
			{
				r.addFlags(2);
	//   28   56:aload           5
	//   29   58:iconst_2        
	//   30   59:invokevirtual   #328 <Method void RecyclerView$ViewHolder.addFlags(int)>
				recycleCachedViewAt(k);
	//   31   62:aload_0         
	//   32   63:iload_3         
	//   33   64:invokevirtual   #365 <Method void recycleCachedViewAt(int)>
			}
		}

	//   34   67:iload_3         
	//   35   68:iconst_1        
	//   36   69:isub            
	//   37   70:istore_3        
	//*  38   71:goto            10
	//   39   74:return          
	}

	static final int DEFAULT_CACHE_SIZE = 2;
	final ArrayList mAttachedScrap = new ArrayList();
	final ArrayList mCachedViews = new ArrayList();
	ArrayList mChangedScrap;
	iewPool mRecyclerPool;
	private int mRequestedCacheMax;
	private final List mUnmodifiableAttachedScrap;
	private Extension mViewCacheExtension;
	int mViewCacheMax;
	final RecyclerView this$0;

	public RecyclerView$Recycler()
	{
		this$0 = RecyclerView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field RecyclerView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #33  <Method void Object()>
	//    5    9:aload_0         
	//    6   10:new             #35  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #36  <Method void ArrayList()>
	//    9   17:putfield        #38  <Field ArrayList mAttachedScrap>
		mChangedScrap = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #40  <Field ArrayList mChangedScrap>
	//   13   25:aload_0         
	//   14   26:new             #35  <Class ArrayList>
	//   15   29:dup             
	//   16   30:invokespecial   #36  <Method void ArrayList()>
	//   17   33:putfield        #42  <Field ArrayList mCachedViews>
		mUnmodifiableAttachedScrap = Collections.unmodifiableList(((List) (mAttachedScrap)));
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:getfield        #38  <Field ArrayList mAttachedScrap>
	//   21   41:invokestatic    #48  <Method List Collections.unmodifiableList(List)>
	//   22   44:putfield        #50  <Field List mUnmodifiableAttachedScrap>
		mRequestedCacheMax = 2;
	//   23   47:aload_0         
	//   24   48:iconst_2        
	//   25   49:putfield        #52  <Field int mRequestedCacheMax>
		mViewCacheMax = 2;
	//   26   52:aload_0         
	//   27   53:iconst_2        
	//   28   54:putfield        #54  <Field int mViewCacheMax>
	//   29   57:return          
	}
}
