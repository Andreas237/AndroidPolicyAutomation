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

	private void attachAccessibilityDelegateOnBind(r r)
	{
		if(isAccessibilityEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field RecyclerView this$0>
	//*   2    4:invokevirtual   #61  <Method boolean RecyclerView.isAccessibilityEnabled()>
	//*   3    7:ifeq            55
		{
			View view = r.itemView;
	//    4   10:aload_1         
	//    5   11:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//    6   14:astore_2        
			if(ViewCompat.getImportantForAccessibility(view) == 0)
	//*   7   15:aload_2         
	//*   8   16:invokestatic    #73  <Method int ViewCompat.getImportantForAccessibility(View)>
	//*   9   19:ifne            27
				ViewCompat.setImportantForAccessibility(view, 1);
	//   10   22:aload_2         
	//   11   23:iconst_1        
	//   12   24:invokestatic    #77  <Method void ViewCompat.setImportantForAccessibility(View, int)>
			if(!ViewCompat.hasAccessibilityDelegate(view))
	//*  13   27:aload_2         
	//*  14   28:invokestatic    #81  <Method boolean ViewCompat.hasAccessibilityDelegate(View)>
	//*  15   31:ifne            55
			{
				r.addFlags(16384);
	//   16   34:aload_1         
	//   17   35:sipush          16384
	//   18   38:invokevirtual   #85  <Method void RecyclerView$ViewHolder.addFlags(int)>
				ViewCompat.setAccessibilityDelegate(view, mAccessibilityDelegate.getItemDelegate());
	//   19   41:aload_2         
	//   20   42:aload_0         
	//   21   43:getfield        #30  <Field RecyclerView this$0>
	//   22   46:getfield        #89  <Field RecyclerViewAccessibilityDelegate RecyclerView.mAccessibilityDelegate>
	//   23   49:invokevirtual   #95  <Method android.support.v4.view.AccessibilityDelegateCompat RecyclerViewAccessibilityDelegate.getItemDelegate()>
	//   24   52:invokestatic    #99  <Method void ViewCompat.setAccessibilityDelegate(View, android.support.v4.view.AccessibilityDelegateCompat)>
			}
		}
	//   25   55:return          
	}

	private void invalidateDisplayListInt(r r)
	{
		if(r.itemView instanceof ViewGroup)
	//*   0    0:aload_1         
	//*   1    1:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//*   2    4:instanceof      #102 <Class ViewGroup>
	//*   3    7:ifeq            22
			invalidateDisplayListInt((ViewGroup)r.itemView, false);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//    7   15:checkcast       #102 <Class ViewGroup>
	//    8   18:iconst_0        
	//    9   19:invokespecial   #105 <Method void invalidateDisplayListInt(ViewGroup, boolean)>
	//   10   22:return          
	}

	private void invalidateDisplayListInt(ViewGroup viewgroup, boolean flag)
	{
		for(int i = viewgroup.getChildCount() - 1; i >= 0; i--)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #109 <Method int ViewGroup.getChildCount()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_3        
	//*   5    7:iload_3         
	//*   6    8:iflt            43
		{
			View view = viewgroup.getChildAt(i);
	//    7   11:aload_1         
	//    8   12:iload_3         
	//    9   13:invokevirtual   #113 <Method View ViewGroup.getChildAt(int)>
	//   10   16:astore          4
			if(view instanceof ViewGroup)
	//*  11   18:aload           4
	//*  12   20:instanceof      #102 <Class ViewGroup>
	//*  13   23:ifeq            36
				invalidateDisplayListInt((ViewGroup)view, true);
	//   14   26:aload_0         
	//   15   27:aload           4
	//   16   29:checkcast       #102 <Class ViewGroup>
	//   17   32:iconst_1        
	//   18   33:invokespecial   #105 <Method void invalidateDisplayListInt(ViewGroup, boolean)>
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
	//*  28   49:invokevirtual   #116 <Method int ViewGroup.getVisibility()>
	//*  29   52:iconst_4        
	//*  30   53:icmpne          67
		{
			viewgroup.setVisibility(0);
	//   31   56:aload_1         
	//   32   57:iconst_0        
	//   33   58:invokevirtual   #119 <Method void ViewGroup.setVisibility(int)>
			viewgroup.setVisibility(4);
	//   34   61:aload_1         
	//   35   62:iconst_4        
	//   36   63:invokevirtual   #119 <Method void ViewGroup.setVisibility(int)>
			return;
	//   37   66:return          
		} else
		{
			int j = viewgroup.getVisibility();
	//   38   67:aload_1         
	//   39   68:invokevirtual   #116 <Method int ViewGroup.getVisibility()>
	//   40   71:istore_3        
			viewgroup.setVisibility(4);
	//   41   72:aload_1         
	//   42   73:iconst_4        
	//   43   74:invokevirtual   #119 <Method void ViewGroup.setVisibility(int)>
			viewgroup.setVisibility(j);
	//   44   77:aload_1         
	//   45   78:iload_3         
	//   46   79:invokevirtual   #119 <Method void ViewGroup.setVisibility(int)>
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
	//    3    5:putfield        #124 <Field RecyclerView RecyclerView$ViewHolder.mOwnerRecyclerView>
		int k = r.getItemViewType();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #127 <Method int RecyclerView$ViewHolder.getItemViewType()>
	//    6   12:istore          6
		long l1 = getNanoTime();
	//    7   14:aload_0         
	//    8   15:getfield        #30  <Field RecyclerView this$0>
	//    9   18:invokevirtual   #131 <Method long RecyclerView.getNanoTime()>
	//   10   21:lstore          7
		if(l != 0xffffffffL && !mRecyclerPool.willBindInTime(k, l1, l))
	//*  11   23:lload           4
	//*  12   25:ldc2w           #132 <Long 0xffffffffL>
	//*  13   28:lcmp            
	//*  14   29:ifeq            50
	//*  15   32:aload_0         
	//*  16   33:getfield        #135 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//*  17   36:iload           6
	//*  18   38:lload           7
	//*  19   40:lload           4
	//*  20   42:invokevirtual   #141 <Method boolean RecyclerView$RecycledViewPool.willBindInTime(int, long, long)>
	//*  21   45:ifne            50
			return false;
	//   22   48:iconst_0        
	//   23   49:ireturn         
		mAdapter.bindViewHolder(r, i);
	//   24   50:aload_0         
	//   25   51:getfield        #30  <Field RecyclerView this$0>
	//   26   54:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   27   57:aload_1         
	//   28   58:iload_2         
	//   29   59:invokevirtual   #151 <Method void RecyclerView$Adapter.bindViewHolder(RecyclerView$ViewHolder, int)>
		l = getNanoTime();
	//   30   62:aload_0         
	//   31   63:getfield        #30  <Field RecyclerView this$0>
	//   32   66:invokevirtual   #131 <Method long RecyclerView.getNanoTime()>
	//   33   69:lstore          4
		mRecyclerPool.factorInBindTime(r.getItemViewType(), l - l1);
	//   34   71:aload_0         
	//   35   72:getfield        #135 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//   36   75:aload_1         
	//   37   76:invokevirtual   #127 <Method int RecyclerView$ViewHolder.getItemViewType()>
	//   38   79:lload           4
	//   39   81:lload           7
	//   40   83:lsub            
	//   41   84:invokevirtual   #155 <Method void RecyclerView$RecycledViewPool.factorInBindTime(int, long)>
		attachAccessibilityDelegateOnBind(r);
	//   42   87:aload_0         
	//   43   88:aload_1         
	//   44   89:invokespecial   #157 <Method void attachAccessibilityDelegateOnBind(RecyclerView$ViewHolder)>
		if(mState.isPreLayout())
	//*  45   92:aload_0         
	//*  46   93:getfield        #30  <Field RecyclerView this$0>
	//*  47   96:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//*  48   99:invokevirtual   #166 <Method boolean RecyclerView$State.isPreLayout()>
	//*  49  102:ifeq            110
			r.mPreLayoutPosition = j;
	//   50  105:aload_1         
	//   51  106:iload_3         
	//   52  107:putfield        #169 <Field int RecyclerView$ViewHolder.mPreLayoutPosition>
		return true;
	//   53  110:iconst_1        
	//   54  111:ireturn         
	}

	void addViewHolderToRecycledViewPool(r r, boolean flag)
	{
		RecyclerView.clearNestedRecyclerViewIfNotNested(r);
	//    0    0:aload_1         
	//    1    1:invokestatic    #174 <Method void RecyclerView.clearNestedRecyclerViewIfNotNested(RecyclerView$ViewHolder)>
		if(r.hasAnyOfTheFlags(16384))
	//*   2    4:aload_1         
	//*   3    5:sipush          16384
	//*   4    8:invokevirtual   #178 <Method boolean RecyclerView$ViewHolder.hasAnyOfTheFlags(int)>
	//*   5   11:ifeq            30
		{
			r.setFlags(0, 16384);
	//    6   14:aload_1         
	//    7   15:iconst_0        
	//    8   16:sipush          16384
	//    9   19:invokevirtual   #182 <Method void RecyclerView$ViewHolder.setFlags(int, int)>
			ViewCompat.setAccessibilityDelegate(r.itemView, ((android.support.v4.view.AccessibilityDelegateCompat) (null)));
	//   10   22:aload_1         
	//   11   23:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//   12   26:aconst_null     
	//   13   27:invokestatic    #99  <Method void ViewCompat.setAccessibilityDelegate(View, android.support.v4.view.AccessibilityDelegateCompat)>
		}
		if(flag)
	//*  14   30:iload_2         
	//*  15   31:ifeq            39
			dispatchViewRecycled(r);
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokevirtual   #185 <Method void dispatchViewRecycled(RecyclerView$ViewHolder)>
		r.mOwnerRecyclerView = null;
	//   19   39:aload_1         
	//   20   40:aconst_null     
	//   21   41:putfield        #124 <Field RecyclerView RecyclerView$ViewHolder.mOwnerRecyclerView>
		getRecycledViewPool().putRecycledView(r);
	//   22   44:aload_0         
	//   23   45:invokevirtual   #189 <Method RecyclerView$RecycledViewPool getRecycledViewPool()>
	//   24   48:aload_1         
	//   25   49:invokevirtual   #192 <Method void RecyclerView$RecycledViewPool.putRecycledView(RecyclerView$ViewHolder)>
	//   26   52:return          
	}

	public void bindViewToPosition(View view, int i)
	{
		r r = RecyclerView.getChildViewHolderInt(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #197 <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:astore          5
		if(r == null)
	//*   3    6:aload           5
	//*   4    8:ifnonnull       50
		{
			view = ((View) (new StringBuilder()));
	//    5   11:new             #199 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #200 <Method void StringBuilder()>
	//    8   18:astore_1        
			((StringBuilder) (view)).append("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter");
	//    9   19:aload_1         
	//   10   20:ldc1            #202 <String "The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter">
	//   11   22:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			((StringBuilder) (view)).append(exceptionLabel());
	//   13   26:aload_1         
	//   14   27:aload_0         
	//   15   28:getfield        #30  <Field RecyclerView this$0>
	//   16   31:invokevirtual   #210 <Method String RecyclerView.exceptionLabel()>
	//   17   34:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   18   37:pop             
			throw new IllegalArgumentException(((StringBuilder) (view)).toString());
	//   19   38:new             #212 <Class IllegalArgumentException>
	//   20   41:dup             
	//   21   42:aload_1         
	//   22   43:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   23   46:invokespecial   #218 <Method void IllegalArgumentException(String)>
	//   24   49:athrow          
		}
		int j = mAdapterHelper.findPositionOffset(i);
	//   25   50:aload_0         
	//   26   51:getfield        #30  <Field RecyclerView this$0>
	//   27   54:getfield        #222 <Field AdapterHelper RecyclerView.mAdapterHelper>
	//   28   57:iload_2         
	//   29   58:invokevirtual   #228 <Method int AdapterHelper.findPositionOffset(int)>
	//   30   61:istore_3        
		if(j >= 0 && j < mAdapter.getItemCount())
	//*  31   62:iload_3         
	//*  32   63:iflt            209
	//*  33   66:iload_3         
	//*  34   67:aload_0         
	//*  35   68:getfield        #30  <Field RecyclerView this$0>
	//*  36   71:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  37   74:invokevirtual   #231 <Method int RecyclerView$Adapter.getItemCount()>
	//*  38   77:icmplt          83
	//*  39   80:goto            209
		{
			tryBindViewHolderByDeadline(r, j, i, 0xffffffffL);
	//   40   83:aload_0         
	//   41   84:aload           5
	//   42   86:iload_3         
	//   43   87:iload_2         
	//   44   88:ldc2w           #132 <Long 0xffffffffL>
	//   45   91:invokespecial   #233 <Method boolean tryBindViewHolderByDeadline(RecyclerView$ViewHolder, int, int, long)>
	//   46   94:pop             
			view = ((View) (r.itemView.getLayoutParams()));
	//   47   95:aload           5
	//   48   97:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//   49  100:invokevirtual   #239 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   50  103:astore_1        
			if(view == null)
	//*  51  104:aload_1         
	//*  52  105:ifnonnull       131
			{
				view = ((View) ((ams)generateDefaultLayoutParams()));
	//   53  108:aload_0         
	//   54  109:getfield        #30  <Field RecyclerView this$0>
	//   55  112:invokevirtual   #242 <Method android.view.ViewGroup$LayoutParams RecyclerView.generateDefaultLayoutParams()>
	//   56  115:checkcast       #244 <Class RecyclerView$LayoutParams>
	//   57  118:astore_1        
				r.itemView.setLayoutParams(((android.view.) (view)));
	//   58  119:aload           5
	//   59  121:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//   60  124:aload_1         
	//   61  125:invokevirtual   #248 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			} else
	//*  62  128:goto            171
			if(!checkLayoutParams(((android.view.) (view))))
	//*  63  131:aload_0         
	//*  64  132:getfield        #30  <Field RecyclerView this$0>
	//*  65  135:aload_1         
	//*  66  136:invokevirtual   #252 <Method boolean RecyclerView.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//*  67  139:ifne            166
			{
				view = ((View) ((ams)generateLayoutParams(((android.view.) (view)))));
	//   68  142:aload_0         
	//   69  143:getfield        #30  <Field RecyclerView this$0>
	//   70  146:aload_1         
	//   71  147:invokevirtual   #256 <Method android.view.ViewGroup$LayoutParams RecyclerView.generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   72  150:checkcast       #244 <Class RecyclerView$LayoutParams>
	//   73  153:astore_1        
				r.itemView.setLayoutParams(((android.view.) (view)));
	//   74  154:aload           5
	//   75  156:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//   76  159:aload_1         
	//   77  160:invokevirtual   #248 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			} else
	//*  78  163:goto            171
			{
				view = ((View) ((ams)view));
	//   79  166:aload_1         
	//   80  167:checkcast       #244 <Class RecyclerView$LayoutParams>
	//   81  170:astore_1        
			}
			boolean flag = true;
	//   82  171:iconst_1        
	//   83  172:istore          4
			view.mInsetsDirty = true;
	//   84  174:aload_1         
	//   85  175:iconst_1        
	//   86  176:putfield        #260 <Field boolean RecyclerView$LayoutParams.mInsetsDirty>
			view.mViewHolder = r;
	//   87  179:aload_1         
	//   88  180:aload           5
	//   89  182:putfield        #264 <Field RecyclerView$ViewHolder RecyclerView$LayoutParams.mViewHolder>
			if(r.itemView.getParent() != null)
	//*  90  185:aload           5
	//*  91  187:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//*  92  190:invokevirtual   #268 <Method android.view.ViewParent View.getParent()>
	//*  93  193:ifnonnull       199
	//*  94  196:goto            202
				flag = false;
	//   95  199:iconst_0        
	//   96  200:istore          4
			view.mPendingInvalidate = flag;
	//   97  202:aload_1         
	//   98  203:iload           4
	//   99  205:putfield        #271 <Field boolean RecyclerView$LayoutParams.mPendingInvalidate>
			return;
	//  100  208:return          
		} else
		{
			view = ((View) (new StringBuilder()));
	//  101  209:new             #199 <Class StringBuilder>
	//  102  212:dup             
	//  103  213:invokespecial   #200 <Method void StringBuilder()>
	//  104  216:astore_1        
			((StringBuilder) (view)).append("Inconsistency detected. Invalid item position ");
	//  105  217:aload_1         
	//  106  218:ldc2            #273 <String "Inconsistency detected. Invalid item position ">
	//  107  221:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  108  224:pop             
			((StringBuilder) (view)).append(i);
	//  109  225:aload_1         
	//  110  226:iload_2         
	//  111  227:invokevirtual   #276 <Method StringBuilder StringBuilder.append(int)>
	//  112  230:pop             
			((StringBuilder) (view)).append("(offset:");
	//  113  231:aload_1         
	//  114  232:ldc2            #278 <String "(offset:">
	//  115  235:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  116  238:pop             
			((StringBuilder) (view)).append(j);
	//  117  239:aload_1         
	//  118  240:iload_3         
	//  119  241:invokevirtual   #276 <Method StringBuilder StringBuilder.append(int)>
	//  120  244:pop             
			((StringBuilder) (view)).append(").");
	//  121  245:aload_1         
	//  122  246:ldc2            #280 <String ").">
	//  123  249:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  124  252:pop             
			((StringBuilder) (view)).append("state:");
	//  125  253:aload_1         
	//  126  254:ldc2            #282 <String "state:">
	//  127  257:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  128  260:pop             
			((StringBuilder) (view)).append(mState.getItemCount());
	//  129  261:aload_1         
	//  130  262:aload_0         
	//  131  263:getfield        #30  <Field RecyclerView this$0>
	//  132  266:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//  133  269:invokevirtual   #283 <Method int RecyclerView$State.getItemCount()>
	//  134  272:invokevirtual   #276 <Method StringBuilder StringBuilder.append(int)>
	//  135  275:pop             
			((StringBuilder) (view)).append(exceptionLabel());
	//  136  276:aload_1         
	//  137  277:aload_0         
	//  138  278:getfield        #30  <Field RecyclerView this$0>
	//  139  281:invokevirtual   #210 <Method String RecyclerView.exceptionLabel()>
	//  140  284:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  141  287:pop             
			throw new IndexOutOfBoundsException(((StringBuilder) (view)).toString());
	//  142  288:new             #285 <Class IndexOutOfBoundsException>
	//  143  291:dup             
	//  144  292:aload_1         
	//  145  293:invokevirtual   #215 <Method String StringBuilder.toString()>
	//  146  296:invokespecial   #286 <Method void IndexOutOfBoundsException(String)>
	//  147  299:athrow          
		}
	}

	public void clear()
	{
		mAttachedScrap.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ArrayList mAttachedScrap>
	//    2    4:invokevirtual   #289 <Method void ArrayList.clear()>
		recycleAndClearCachedViews();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #292 <Method void recycleAndClearCachedViews()>
	//    5   11:return          
	}

	void clearOldPositions()
	{
		int l = mCachedViews.size();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field ArrayList mCachedViews>
	//    2    4:invokevirtual   #296 <Method int ArrayList.size()>
	//    3    7:istore_3        
		boolean flag = false;
	//    4    8:iconst_0        
	//    5    9:istore_2        
		for(int i = 0; i < l; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_1        
	//*   8   12:iload_1         
	//*   9   13:iload_3         
	//*  10   14:icmpge          38
			((r)mCachedViews.get(i)).clearOldPosition();
	//   11   17:aload_0         
	//   12   18:getfield        #42  <Field ArrayList mCachedViews>
	//   13   21:iload_1         
	//   14   22:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   15   25:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   16   28:invokevirtual   #303 <Method void RecyclerView$ViewHolder.clearOldPosition()>

	//   17   31:iload_1         
	//   18   32:iconst_1        
	//   19   33:iadd            
	//   20   34:istore_1        
	//*  21   35:goto            12
		l = mAttachedScrap.size();
	//   22   38:aload_0         
	//   23   39:getfield        #38  <Field ArrayList mAttachedScrap>
	//   24   42:invokevirtual   #296 <Method int ArrayList.size()>
	//   25   45:istore_3        
		for(int j = 0; j < l; j++)
	//*  26   46:iconst_0        
	//*  27   47:istore_1        
	//*  28   48:iload_1         
	//*  29   49:iload_3         
	//*  30   50:icmpge          74
			((r)mAttachedScrap.get(j)).clearOldPosition();
	//   31   53:aload_0         
	//   32   54:getfield        #38  <Field ArrayList mAttachedScrap>
	//   33   57:iload_1         
	//   34   58:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   35   61:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   36   64:invokevirtual   #303 <Method void RecyclerView$ViewHolder.clearOldPosition()>

	//   37   67:iload_1         
	//   38   68:iconst_1        
	//   39   69:iadd            
	//   40   70:istore_1        
	//*  41   71:goto            48
		if(mChangedScrap != null)
	//*  42   74:aload_0         
	//*  43   75:getfield        #40  <Field ArrayList mChangedScrap>
	//*  44   78:ifnull          117
		{
			int i1 = mChangedScrap.size();
	//   45   81:aload_0         
	//   46   82:getfield        #40  <Field ArrayList mChangedScrap>
	//   47   85:invokevirtual   #296 <Method int ArrayList.size()>
	//   48   88:istore_3        
			for(int k = ((int) (flag)); k < i1; k++)
	//*  49   89:iload_2         
	//*  50   90:istore_1        
	//*  51   91:iload_1         
	//*  52   92:iload_3         
	//*  53   93:icmpge          117
				((r)mChangedScrap.get(k)).clearOldPosition();
	//   54   96:aload_0         
	//   55   97:getfield        #40  <Field ArrayList mChangedScrap>
	//   56  100:iload_1         
	//   57  101:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   58  104:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   59  107:invokevirtual   #303 <Method void RecyclerView$ViewHolder.clearOldPosition()>

	//   60  110:iload_1         
	//   61  111:iconst_1        
	//   62  112:iadd            
	//   63  113:istore_1        
		}
	//*  64  114:goto            91
	//   65  117:return          
	}

	void clearScrap()
	{
		mAttachedScrap.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ArrayList mAttachedScrap>
	//    2    4:invokevirtual   #289 <Method void ArrayList.clear()>
		if(mChangedScrap != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #40  <Field ArrayList mChangedScrap>
	//*   5   11:ifnull          21
			mChangedScrap.clear();
	//    6   14:aload_0         
	//    7   15:getfield        #40  <Field ArrayList mChangedScrap>
	//    8   18:invokevirtual   #289 <Method void ArrayList.clear()>
	//    9   21:return          
	}

	public int convertPreLayoutPositionToPostLayout(int i)
	{
		if(i >= 0 && i < mState.getItemCount())
	//*   0    0:iload_1         
	//*   1    1:iflt            48
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #30  <Field RecyclerView this$0>
	//*   5    9:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//*   6   12:invokevirtual   #283 <Method int RecyclerView$State.getItemCount()>
	//*   7   15:icmplt          21
	//*   8   18:goto            48
		{
			if(!mState.isPreLayout())
	//*   9   21:aload_0         
	//*  10   22:getfield        #30  <Field RecyclerView this$0>
	//*  11   25:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//*  12   28:invokevirtual   #166 <Method boolean RecyclerView$State.isPreLayout()>
	//*  13   31:ifne            36
				return i;
	//   14   34:iload_1         
	//   15   35:ireturn         
			else
				return mAdapterHelper.findPositionOffset(i);
	//   16   36:aload_0         
	//   17   37:getfield        #30  <Field RecyclerView this$0>
	//   18   40:getfield        #222 <Field AdapterHelper RecyclerView.mAdapterHelper>
	//   19   43:iload_1         
	//   20   44:invokevirtual   #228 <Method int AdapterHelper.findPositionOffset(int)>
	//   21   47:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   22   48:new             #199 <Class StringBuilder>
	//   23   51:dup             
	//   24   52:invokespecial   #200 <Method void StringBuilder()>
	//   25   55:astore_2        
			stringbuilder.append("invalid position ");
	//   26   56:aload_2         
	//   27   57:ldc2            #307 <String "invalid position ">
	//   28   60:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   29   63:pop             
			stringbuilder.append(i);
	//   30   64:aload_2         
	//   31   65:iload_1         
	//   32   66:invokevirtual   #276 <Method StringBuilder StringBuilder.append(int)>
	//   33   69:pop             
			stringbuilder.append(". State ");
	//   34   70:aload_2         
	//   35   71:ldc2            #309 <String ". State ">
	//   36   74:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   37   77:pop             
			stringbuilder.append("item count is ");
	//   38   78:aload_2         
	//   39   79:ldc2            #311 <String "item count is ">
	//   40   82:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   41   85:pop             
			stringbuilder.append(mState.getItemCount());
	//   42   86:aload_2         
	//   43   87:aload_0         
	//   44   88:getfield        #30  <Field RecyclerView this$0>
	//   45   91:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//   46   94:invokevirtual   #283 <Method int RecyclerView$State.getItemCount()>
	//   47   97:invokevirtual   #276 <Method StringBuilder StringBuilder.append(int)>
	//   48  100:pop             
			stringbuilder.append(exceptionLabel());
	//   49  101:aload_2         
	//   50  102:aload_0         
	//   51  103:getfield        #30  <Field RecyclerView this$0>
	//   52  106:invokevirtual   #210 <Method String RecyclerView.exceptionLabel()>
	//   53  109:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   54  112:pop             
			throw new IndexOutOfBoundsException(stringbuilder.toString());
	//   55  113:new             #285 <Class IndexOutOfBoundsException>
	//   56  116:dup             
	//   57  117:aload_2         
	//   58  118:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   59  121:invokespecial   #286 <Method void IndexOutOfBoundsException(String)>
	//   60  124:athrow          
		}
	}

	void dispatchViewRecycled(r r)
	{
		if(mRecyclerListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field RecyclerView this$0>
	//*   2    4:getfield        #315 <Field RecyclerView$RecyclerListener RecyclerView.mRecyclerListener>
	//*   3    7:ifnull          23
			mRecyclerListener.onViewRecycled(r);
	//    4   10:aload_0         
	//    5   11:getfield        #30  <Field RecyclerView this$0>
	//    6   14:getfield        #315 <Field RecyclerView$RecyclerListener RecyclerView.mRecyclerListener>
	//    7   17:aload_1         
	//    8   18:invokeinterface #320 <Method void RecyclerView$RecyclerListener.onViewRecycled(RecyclerView$ViewHolder)>
		if(mAdapter != null)
	//*   9   23:aload_0         
	//*  10   24:getfield        #30  <Field RecyclerView this$0>
	//*  11   27:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  12   30:ifnull          44
			mAdapter.onViewRecycled(r);
	//   13   33:aload_0         
	//   14   34:getfield        #30  <Field RecyclerView this$0>
	//   15   37:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   16   40:aload_1         
	//   17   41:invokevirtual   #321 <Method void RecyclerView$Adapter.onViewRecycled(RecyclerView$ViewHolder)>
		if(mState != null)
	//*  18   44:aload_0         
	//*  19   45:getfield        #30  <Field RecyclerView this$0>
	//*  20   48:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//*  21   51:ifnull          65
			mViewInfoStore.removeViewHolder(r);
	//   22   54:aload_0         
	//   23   55:getfield        #30  <Field RecyclerView this$0>
	//   24   58:getfield        #325 <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//   25   61:aload_1         
	//   26   62:invokevirtual   #330 <Method void ViewInfoStore.removeViewHolder(RecyclerView$ViewHolder)>
	//   27   65:return          
	}

	r getChangedScrapViewForPosition(int i)
	{
		if(mChangedScrap != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field ArrayList mChangedScrap>
	//*   2    4:ifnull          195
		{
			int k = mChangedScrap.size();
	//    3    7:aload_0         
	//    4    8:getfield        #40  <Field ArrayList mChangedScrap>
	//    5   11:invokevirtual   #296 <Method int ArrayList.size()>
	//    6   14:istore          4
			if(k == 0)
	//*   7   16:iload           4
	//*   8   18:ifne            23
				return null;
	//    9   21:aconst_null     
	//   10   22:areturn         
			boolean flag = false;
	//   11   23:iconst_0        
	//   12   24:istore_3        
			for(int j = 0; j < k; j++)
	//*  13   25:iconst_0        
	//*  14   26:istore_2        
	//*  15   27:iload_2         
	//*  16   28:iload           4
	//*  17   30:icmpge          80
			{
				r r = (r)mChangedScrap.get(j);
	//   18   33:aload_0         
	//   19   34:getfield        #40  <Field ArrayList mChangedScrap>
	//   20   37:iload_2         
	//   21   38:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   22   41:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   23   44:astore          7
				if(!r.wasReturnedFromScrap() && r.getLayoutPosition() == i)
	//*  24   46:aload           7
	//*  25   48:invokevirtual   #335 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//*  26   51:ifne            73
	//*  27   54:aload           7
	//*  28   56:invokevirtual   #338 <Method int RecyclerView$ViewHolder.getLayoutPosition()>
	//*  29   59:iload_1         
	//*  30   60:icmpne          73
				{
					r.addFlags(32);
	//   31   63:aload           7
	//   32   65:bipush          32
	//   33   67:invokevirtual   #85  <Method void RecyclerView$ViewHolder.addFlags(int)>
					return r;
	//   34   70:aload           7
	//   35   72:areturn         
				}
			}

	//   36   73:iload_2         
	//   37   74:iconst_1        
	//   38   75:iadd            
	//   39   76:istore_2        
	//*  40   77:goto            27
			if(mAdapter.hasStableIds())
	//*  41   80:aload_0         
	//*  42   81:getfield        #30  <Field RecyclerView this$0>
	//*  43   84:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  44   87:invokevirtual   #341 <Method boolean RecyclerView$Adapter.hasStableIds()>
	//*  45   90:ifeq            193
			{
				i = mAdapterHelper.findPositionOffset(i);
	//   46   93:aload_0         
	//   47   94:getfield        #30  <Field RecyclerView this$0>
	//   48   97:getfield        #222 <Field AdapterHelper RecyclerView.mAdapterHelper>
	//   49  100:iload_1         
	//   50  101:invokevirtual   #228 <Method int AdapterHelper.findPositionOffset(int)>
	//   51  104:istore_1        
				if(i > 0 && i < mAdapter.getItemCount())
	//*  52  105:iload_1         
	//*  53  106:ifle            193
	//*  54  109:iload_1         
	//*  55  110:aload_0         
	//*  56  111:getfield        #30  <Field RecyclerView this$0>
	//*  57  114:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  58  117:invokevirtual   #231 <Method int RecyclerView$Adapter.getItemCount()>
	//*  59  120:icmpge          193
				{
					long l = mAdapter.getItemId(i);
	//   60  123:aload_0         
	//   61  124:getfield        #30  <Field RecyclerView this$0>
	//   62  127:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   63  130:iload_1         
	//   64  131:invokevirtual   #345 <Method long RecyclerView$Adapter.getItemId(int)>
	//   65  134:lstore          5
					for(i = ((int) (flag)); i < k; i++)
	//*  66  136:iload_3         
	//*  67  137:istore_1        
	//*  68  138:iload_1         
	//*  69  139:iload           4
	//*  70  141:icmpge          193
					{
						r r1 = (r)mChangedScrap.get(i);
	//   71  144:aload_0         
	//   72  145:getfield        #40  <Field ArrayList mChangedScrap>
	//   73  148:iload_1         
	//   74  149:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   75  152:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   76  155:astore          7
						if(!r1.wasReturnedFromScrap() && r1.getItemId() == l)
	//*  77  157:aload           7
	//*  78  159:invokevirtual   #335 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//*  79  162:ifne            186
	//*  80  165:aload           7
	//*  81  167:invokevirtual   #347 <Method long RecyclerView$ViewHolder.getItemId()>
	//*  82  170:lload           5
	//*  83  172:lcmp            
	//*  84  173:ifne            186
						{
							r1.addFlags(32);
	//   85  176:aload           7
	//   86  178:bipush          32
	//   87  180:invokevirtual   #85  <Method void RecyclerView$ViewHolder.addFlags(int)>
							return r1;
	//   88  183:aload           7
	//   89  185:areturn         
						}
					}

	//   90  186:iload_1         
	//   91  187:iconst_1        
	//   92  188:iadd            
	//   93  189:istore_1        
				}
			}
	//*  94  190:goto            138
			return null;
	//   95  193:aconst_null     
	//   96  194:areturn         
		} else
		{
			return null;
	//   97  195:aconst_null     
	//   98  196:areturn         
		}
	}

	iewPool getRecycledViewPool()
	{
		if(mRecyclerPool == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #135 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//*   2    4:ifnonnull       18
			mRecyclerPool = new iewPool();
	//    3    7:aload_0         
	//    4    8:new             #137 <Class RecyclerView$RecycledViewPool>
	//    5   11:dup             
	//    6   12:invokespecial   #348 <Method void RecyclerView$RecycledViewPool()>
	//    7   15:putfield        #135 <Field RecyclerView$RecycledViewPool mRecyclerPool>
		return mRecyclerPool;
	//    8   18:aload_0         
	//    9   19:getfield        #135 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//   10   22:areturn         
	}

	int getScrapCount()
	{
		return mAttachedScrap.size();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ArrayList mAttachedScrap>
	//    2    4:invokevirtual   #296 <Method int ArrayList.size()>
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
	//*   2    4:invokevirtual   #296 <Method int ArrayList.size()>
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
	//   11   22:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   12   25:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   13   28:astore          6
			if(r.getItemId() != l || r.wasReturnedFromScrap())
				continue;
	//   14   30:aload           6
	//   15   32:invokevirtual   #347 <Method long RecyclerView$ViewHolder.getItemId()>
	//   16   35:lload_1         
	//   17   36:lcmp            
	//   18   37:ifne            133
	//   19   40:aload           6
	//   20   42:invokevirtual   #335 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//   21   45:ifne            133
			if(i == r.getItemViewType())
	//*  22   48:iload_3         
	//*  23   49:aload           6
	//*  24   51:invokevirtual   #127 <Method int RecyclerView$ViewHolder.getItemViewType()>
	//*  25   54:icmpne          96
			{
				r.addFlags(32);
	//   26   57:aload           6
	//   27   59:bipush          32
	//   28   61:invokevirtual   #85  <Method void RecyclerView$ViewHolder.addFlags(int)>
				if(r.isRemoved() && !mState.isPreLayout())
	//*  29   64:aload           6
	//*  30   66:invokevirtual   #358 <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*  31   69:ifeq            93
	//*  32   72:aload_0         
	//*  33   73:getfield        #30  <Field RecyclerView this$0>
	//*  34   76:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//*  35   79:invokevirtual   #166 <Method boolean RecyclerView$State.isPreLayout()>
	//*  36   82:ifne            93
					r.setFlags(2, 14);
	//   37   85:aload           6
	//   38   87:iconst_2        
	//   39   88:bipush          14
	//   40   90:invokevirtual   #182 <Method void RecyclerView$ViewHolder.setFlags(int, int)>
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
	//   48  107:invokevirtual   #361 <Method Object ArrayList.remove(int)>
	//   49  110:pop             
				removeDetachedView(r.itemView, false);
	//   50  111:aload_0         
	//   51  112:getfield        #30  <Field RecyclerView this$0>
	//   52  115:aload           6
	//   53  117:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//   54  120:iconst_0        
	//   55  121:invokevirtual   #365 <Method void RecyclerView.removeDetachedView(View, boolean)>
				quickRecycleScrapView(r.itemView);
	//   56  124:aload_0         
	//   57  125:aload           6
	//   58  127:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//   59  130:invokevirtual   #369 <Method void quickRecycleScrapView(View)>
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
	//*  67  146:invokevirtual   #296 <Method int ArrayList.size()>
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
	//   76  164:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   77  167:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   78  170:astore          6
			if(r1.getItemId() != l)
				continue;
	//   79  172:aload           6
	//   80  174:invokevirtual   #347 <Method long RecyclerView$ViewHolder.getItemId()>
	//   81  177:lload_1         
	//   82  178:lcmp            
	//   83  179:ifne            222
			if(i == r1.getItemViewType())
	//*  84  182:iload_3         
	//*  85  183:aload           6
	//*  86  185:invokevirtual   #127 <Method int RecyclerView$ViewHolder.getItemViewType()>
	//*  87  188:icmpne          209
			{
				if(!flag)
	//*  88  191:iload           4
	//*  89  193:ifne            206
					mCachedViews.remove(k);
	//   90  196:aload_0         
	//   91  197:getfield        #42  <Field ArrayList mCachedViews>
	//   92  200:iload           5
	//   93  202:invokevirtual   #361 <Method Object ArrayList.remove(int)>
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
	//  101  217:invokevirtual   #372 <Method void recycleCachedViewAt(int)>
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
	//    2    4:invokevirtual   #296 <Method int ArrayList.size()>
	//    3    7:istore          5
		boolean flag1 = false;
	//    4    9:iconst_0        
	//    5   10:istore          4
		for(int j = 0; j < l; j++)
	//*   6   12:iconst_0        
	//*   7   13:istore_3        
	//*   8   14:iload_3         
	//*   9   15:iload           5
	//*  10   17:icmpge          96
		{
			r r = (r)mAttachedScrap.get(j);
	//   11   20:aload_0         
	//   12   21:getfield        #38  <Field ArrayList mAttachedScrap>
	//   13   24:iload_3         
	//   14   25:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   15   28:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   16   31:astore          6
			if(!r.wasReturnedFromScrap() && r.getLayoutPosition() == i && !r.isInvalid() && (mState.mInPreLayout || !r.isRemoved()))
	//*  17   33:aload           6
	//*  18   35:invokevirtual   #335 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//*  19   38:ifne            89
	//*  20   41:aload           6
	//*  21   43:invokevirtual   #338 <Method int RecyclerView$ViewHolder.getLayoutPosition()>
	//*  22   46:iload_1         
	//*  23   47:icmpne          89
	//*  24   50:aload           6
	//*  25   52:invokevirtual   #377 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//*  26   55:ifne            89
	//*  27   58:aload_0         
	//*  28   59:getfield        #30  <Field RecyclerView this$0>
	//*  29   62:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//*  30   65:getfield        #380 <Field boolean RecyclerView$State.mInPreLayout>
	//*  31   68:ifne            79
	//*  32   71:aload           6
	//*  33   73:invokevirtual   #358 <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*  34   76:ifne            89
			{
				r.addFlags(32);
	//   35   79:aload           6
	//   36   81:bipush          32
	//   37   83:invokevirtual   #85  <Method void RecyclerView$ViewHolder.addFlags(int)>
				return r;
	//   38   86:aload           6
	//   39   88:areturn         
			}
		}

	//   40   89:iload_3         
	//   41   90:iconst_1        
	//   42   91:iadd            
	//   43   92:istore_3        
	//*  44   93:goto            14
		if(!flag)
	//*  45   96:iload_2         
	//*  46   97:ifne            235
		{
			Object obj = ((Object) (mChildHelper.findHiddenNonRemovedView(i)));
	//   47  100:aload_0         
	//   48  101:getfield        #30  <Field RecyclerView this$0>
	//   49  104:getfield        #384 <Field ChildHelper RecyclerView.mChildHelper>
	//   50  107:iload_1         
	//   51  108:invokevirtual   #389 <Method View ChildHelper.findHiddenNonRemovedView(int)>
	//   52  111:astore          7
			if(obj != null)
	//*  53  113:aload           7
	//*  54  115:ifnull          235
			{
				r r1 = RecyclerView.getChildViewHolderInt(((View) (obj)));
	//   55  118:aload           7
	//   56  120:invokestatic    #197 <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//   57  123:astore          6
				mChildHelper.unhide(((View) (obj)));
	//   58  125:aload_0         
	//   59  126:getfield        #30  <Field RecyclerView this$0>
	//   60  129:getfield        #384 <Field ChildHelper RecyclerView.mChildHelper>
	//   61  132:aload           7
	//   62  134:invokevirtual   #392 <Method void ChildHelper.unhide(View)>
				i = mChildHelper.indexOfChild(((View) (obj)));
	//   63  137:aload_0         
	//   64  138:getfield        #30  <Field RecyclerView this$0>
	//   65  141:getfield        #384 <Field ChildHelper RecyclerView.mChildHelper>
	//   66  144:aload           7
	//   67  146:invokevirtual   #395 <Method int ChildHelper.indexOfChild(View)>
	//   68  149:istore_1        
				if(i == -1)
	//*  69  150:iload_1         
	//*  70  151:iconst_m1       
	//*  71  152:icmpne          207
				{
					obj = ((Object) (new StringBuilder()));
	//   72  155:new             #199 <Class StringBuilder>
	//   73  158:dup             
	//   74  159:invokespecial   #200 <Method void StringBuilder()>
	//   75  162:astore          7
					((StringBuilder) (obj)).append("layout index should not be -1 after unhiding a view:");
	//   76  164:aload           7
	//   77  166:ldc2            #397 <String "layout index should not be -1 after unhiding a view:">
	//   78  169:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   79  172:pop             
					((StringBuilder) (obj)).append(((Object) (r1)));
	//   80  173:aload           7
	//   81  175:aload           6
	//   82  177:invokevirtual   #400 <Method StringBuilder StringBuilder.append(Object)>
	//   83  180:pop             
					((StringBuilder) (obj)).append(exceptionLabel());
	//   84  181:aload           7
	//   85  183:aload_0         
	//   86  184:getfield        #30  <Field RecyclerView this$0>
	//   87  187:invokevirtual   #210 <Method String RecyclerView.exceptionLabel()>
	//   88  190:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   89  193:pop             
					throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//   90  194:new             #402 <Class IllegalStateException>
	//   91  197:dup             
	//   92  198:aload           7
	//   93  200:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   94  203:invokespecial   #403 <Method void IllegalStateException(String)>
	//   95  206:athrow          
				} else
				{
					mChildHelper.detachViewFromParent(i);
	//   96  207:aload_0         
	//   97  208:getfield        #30  <Field RecyclerView this$0>
	//   98  211:getfield        #384 <Field ChildHelper RecyclerView.mChildHelper>
	//   99  214:iload_1         
	//  100  215:invokevirtual   #406 <Method void ChildHelper.detachViewFromParent(int)>
					scrapView(((View) (obj)));
	//  101  218:aload_0         
	//  102  219:aload           7
	//  103  221:invokevirtual   #409 <Method void scrapView(View)>
					r1.addFlags(8224);
	//  104  224:aload           6
	//  105  226:sipush          8224
	//  106  229:invokevirtual   #85  <Method void RecyclerView$ViewHolder.addFlags(int)>
					return r1;
	//  107  232:aload           6
	//  108  234:areturn         
				}
			}
		}
		l = mCachedViews.size();
	//  109  235:aload_0         
	//  110  236:getfield        #42  <Field ArrayList mCachedViews>
	//  111  239:invokevirtual   #296 <Method int ArrayList.size()>
	//  112  242:istore          5
		for(int k = ((int) (flag1)); k < l; k++)
	//* 113  244:iload           4
	//* 114  246:istore_3        
	//* 115  247:iload_3         
	//* 116  248:iload           5
	//* 117  250:icmpge          306
		{
			r r2 = (r)mCachedViews.get(k);
	//  118  253:aload_0         
	//  119  254:getfield        #42  <Field ArrayList mCachedViews>
	//  120  257:iload_3         
	//  121  258:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//  122  261:checkcast       #63  <Class RecyclerView$ViewHolder>
	//  123  264:astore          6
			if(!r2.isInvalid() && r2.getLayoutPosition() == i)
	//* 124  266:aload           6
	//* 125  268:invokevirtual   #377 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//* 126  271:ifne            299
	//* 127  274:aload           6
	//* 128  276:invokevirtual   #338 <Method int RecyclerView$ViewHolder.getLayoutPosition()>
	//* 129  279:iload_1         
	//* 130  280:icmpne          299
			{
				if(!flag)
	//* 131  283:iload_2         
	//* 132  284:ifne            296
					mCachedViews.remove(k);
	//  133  287:aload_0         
	//  134  288:getfield        #42  <Field ArrayList mCachedViews>
	//  135  291:iload_3         
	//  136  292:invokevirtual   #361 <Method Object ArrayList.remove(int)>
	//  137  295:pop             
				return r2;
	//  138  296:aload           6
	//  139  298:areturn         
			}
		}

	//  140  299:iload_3         
	//  141  300:iconst_1        
	//  142  301:iadd            
	//  143  302:istore_3        
	//* 144  303:goto            247
		return null;
	//  145  306:aconst_null     
	//  146  307:areturn         
	}

	View getScrapViewAt(int i)
	{
		return ((r)mAttachedScrap.get(i)).itemView;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ArrayList mAttachedScrap>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #63  <Class RecyclerView$ViewHolder>
	//    5   11:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//    6   14:areturn         
	}

	public View getViewForPosition(int i)
	{
		return getViewForPosition(i, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #414 <Method View getViewForPosition(int, boolean)>
	//    4    6:areturn         
	}

	View getViewForPosition(int i, boolean flag)
	{
		return tryGetViewHolderForPositionByDeadline(i, flag, 0xffffffffL).itemView;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:ldc2w           #132 <Long 0xffffffffL>
	//    4    6:invokevirtual   #418 <Method RecyclerView$ViewHolder tryGetViewHolderForPositionByDeadline(int, boolean, long)>
	//    5    9:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//    6   12:areturn         
	}

	void markItemDecorInsetsDirty()
	{
		int j = mCachedViews.size();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field ArrayList mCachedViews>
	//    2    4:invokevirtual   #296 <Method int ArrayList.size()>
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
	//   12   20:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   14   26:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//   15   29:invokevirtual   #239 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   16   32:checkcast       #244 <Class RecyclerView$LayoutParams>
	//   17   35:astore_3        
			if(ams != null)
	//*  18   36:aload_3         
	//*  19   37:ifnull          45
				ams.mInsetsDirty = true;
	//   20   40:aload_3         
	//   21   41:iconst_1        
	//   22   42:putfield        #260 <Field boolean RecyclerView$LayoutParams.mInsetsDirty>
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
		int j = mCachedViews.size();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field ArrayList mCachedViews>
	//    2    4:invokevirtual   #296 <Method int ArrayList.size()>
	//    3    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          49
		{
			r r = (r)mCachedViews.get(i);
	//    9   15:aload_0         
	//   10   16:getfield        #42  <Field ArrayList mCachedViews>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   14   26:astore_3        
			if(r != null)
	//*  15   27:aload_3         
	//*  16   28:ifnull          42
			{
				r.addFlags(6);
	//   17   31:aload_3         
	//   18   32:bipush          6
	//   19   34:invokevirtual   #85  <Method void RecyclerView$ViewHolder.addFlags(int)>
				r.addChangePayload(((Object) (null)));
	//   20   37:aload_3         
	//   21   38:aconst_null     
	//   22   39:invokevirtual   #424 <Method void RecyclerView$ViewHolder.addChangePayload(Object)>
			}
		}

	//   23   42:iload_1         
	//   24   43:iconst_1        
	//   25   44:iadd            
	//   26   45:istore_1        
	//*  27   46:goto            10
		if(mAdapter == null || !mAdapter.hasStableIds())
	//*  28   49:aload_0         
	//*  29   50:getfield        #30  <Field RecyclerView this$0>
	//*  30   53:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  31   56:ifnull          72
	//*  32   59:aload_0         
	//*  33   60:getfield        #30  <Field RecyclerView this$0>
	//*  34   63:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  35   66:invokevirtual   #341 <Method boolean RecyclerView$Adapter.hasStableIds()>
	//*  36   69:ifne            76
			recycleAndClearCachedViews();
	//   37   72:aload_0         
	//   38   73:invokevirtual   #292 <Method void recycleAndClearCachedViews()>
	//   39   76:return          
	}

	void offsetPositionRecordsForInsert(int i, int j)
	{
		int l = mCachedViews.size();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field ArrayList mCachedViews>
	//    2    4:invokevirtual   #296 <Method int ArrayList.size()>
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
	//   12   22:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   13   25:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   14   28:astore          5
			if(r != null && r.mPosition >= i)
	//*  15   30:aload           5
	//*  16   32:ifnull          51
	//*  17   35:aload           5
	//*  18   37:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//*  19   40:iload_1         
	//*  20   41:icmplt          51
				r.offsetPosition(j, true);
	//   21   44:aload           5
	//   22   46:iload_2         
	//   23   47:iconst_1        
	//   24   48:invokevirtual   #432 <Method void RecyclerView$ViewHolder.offsetPosition(int, boolean)>
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
			l = j;
	//    3    5:iload_2         
	//    4    6:istore          4
			byte0 = -1;
	//    5    8:iconst_m1       
	//    6    9:istore          5
			k = i;
	//    7   11:iload_1         
	//    8   12:istore_3        
		} else
	//*   9   13:goto            24
		{
			l = i;
	//   10   16:iload_1         
	//   11   17:istore          4
			byte0 = 1;
	//   12   19:iconst_1        
	//   13   20:istore          5
			k = j;
	//   14   22:iload_2         
	//   15   23:istore_3        
		}
		int j1 = mCachedViews.size();
	//   16   24:aload_0         
	//   17   25:getfield        #42  <Field ArrayList mCachedViews>
	//   18   28:invokevirtual   #296 <Method int ArrayList.size()>
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
	//   28   49:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   29   52:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   30   55:astore          8
			if(r == null || r.mPosition < k || r.mPosition > l)
	//*  31   57:aload           8
	//*  32   59:ifnull          113
	//*  33   62:aload           8
	//*  34   64:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//*  35   67:iload_3         
	//*  36   68:icmplt          113
	//*  37   71:aload           8
	//*  38   73:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//*  39   76:iload           4
	//*  40   78:icmple          84
				continue;
	//   41   81:goto            113
			if(r.mPosition == i)
	//*  42   84:aload           8
	//*  43   86:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//*  44   89:iload_1         
	//*  45   90:icmpne          105
				r.offsetPosition(j - i, false);
	//   46   93:aload           8
	//   47   95:iload_2         
	//   48   96:iload_1         
	//   49   97:isub            
	//   50   98:iconst_0        
	//   51   99:invokevirtual   #432 <Method void RecyclerView$ViewHolder.offsetPosition(int, boolean)>
			else
	//*  52  102:goto            113
				r.offsetPosition(((int) (byte0)), false);
	//   53  105:aload           8
	//   54  107:iload           5
	//   55  109:iconst_0        
	//   56  110:invokevirtual   #432 <Method void RecyclerView$ViewHolder.offsetPosition(int, boolean)>
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
	//*   2    4:invokevirtual   #296 <Method int ArrayList.size()>
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
	//   11   22:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   12   25:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   13   28:astore          5
			if(r == null)
				continue;
	//   14   30:aload           5
	//   15   32:ifnull          79
			if(r.mPosition >= i + j)
	//*  16   35:aload           5
	//*  17   37:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
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
	//   26   51:invokevirtual   #432 <Method void RecyclerView$ViewHolder.offsetPosition(int, boolean)>
				continue;
	//   27   54:goto            79
			}
			if(r.mPosition >= i)
	//*  28   57:aload           5
	//*  29   59:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//*  30   62:iload_1         
	//*  31   63:icmplt          79
			{
				r.addFlags(8);
	//   32   66:aload           5
	//   33   68:bipush          8
	//   34   70:invokevirtual   #85  <Method void RecyclerView$ViewHolder.addFlags(int)>
				recycleCachedViewAt(k);
	//   35   73:aload_0         
	//   36   74:iload           4
	//   37   76:invokevirtual   #372 <Method void recycleCachedViewAt(int)>
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
	//    1    1:invokevirtual   #438 <Method void clear()>
		getRecycledViewPool().onAdapterChanged(adapter, adapter1, flag);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #189 <Method RecyclerView$RecycledViewPool getRecycledViewPool()>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:iload_3         
	//    7   11:invokevirtual   #440 <Method void RecyclerView$RecycledViewPool.onAdapterChanged(RecyclerView$Adapter, RecyclerView$Adapter, boolean)>
	//    8   14:return          
	}

	void quickRecycleScrapView(View view)
	{
		view = ((View) (RecyclerView.getChildViewHolderInt(view)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #197 <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:astore_1        
		r.access._mth1002(((r) (view)), ((RecyclerView$Recycler) (null)));
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:invokestatic    #444 <Method RecyclerView$Recycler RecyclerView$ViewHolder.access$1002(RecyclerView$ViewHolder, RecyclerView$Recycler)>
	//    6   10:pop             
		r.access._mth1102(((r) (view)), false);
	//    7   11:aload_1         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #448 <Method boolean RecyclerView$ViewHolder.access$1102(RecyclerView$ViewHolder, boolean)>
	//   10   16:pop             
		((r) (view)).clearReturnedFromScrapFlag();
	//   11   17:aload_1         
	//   12   18:invokevirtual   #451 <Method void RecyclerView$ViewHolder.clearReturnedFromScrapFlag()>
		recycleViewHolderInternal(((r) (view)));
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:invokevirtual   #454 <Method void recycleViewHolderInternal(RecyclerView$ViewHolder)>
	//   16   26:return          
	}

	void recycleAndClearCachedViews()
	{
		for(int i = mCachedViews.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field ArrayList mCachedViews>
	//*   2    4:invokevirtual   #296 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iflt            26
			recycleCachedViewAt(i);
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:invokevirtual   #372 <Method void recycleCachedViewAt(int)>

	//   11   19:iload_1         
	//   12   20:iconst_1        
	//   13   21:isub            
	//   14   22:istore_1        
	//*  15   23:goto            10
		mCachedViews.clear();
	//   16   26:aload_0         
	//   17   27:getfield        #42  <Field ArrayList mCachedViews>
	//   18   30:invokevirtual   #289 <Method void ArrayList.clear()>
		if(RecyclerView.access$800())
	//*  19   33:invokestatic    #457 <Method boolean RecyclerView.access$800()>
	//*  20   36:ifeq            49
			mPrefetchRegistry.clearPrefetchPositions();
	//   21   39:aload_0         
	//   22   40:getfield        #30  <Field RecyclerView this$0>
	//   23   43:getfield        #461 <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//   24   46:invokevirtual   #466 <Method void GapWorker$LayoutPrefetchRegistryImpl.clearPrefetchPositions()>
	//   25   49:return          
	}

	void recycleCachedViewAt(int i)
	{
		addViewHolderToRecycledViewPool((r)mCachedViews.get(i), true);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #42  <Field ArrayList mCachedViews>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//    5    9:checkcast       #63  <Class RecyclerView$ViewHolder>
	//    6   12:iconst_1        
	//    7   13:invokevirtual   #468 <Method void addViewHolderToRecycledViewPool(RecyclerView$ViewHolder, boolean)>
		mCachedViews.remove(i);
	//    8   16:aload_0         
	//    9   17:getfield        #42  <Field ArrayList mCachedViews>
	//   10   20:iload_1         
	//   11   21:invokevirtual   #361 <Method Object ArrayList.remove(int)>
	//   12   24:pop             
	//   13   25:return          
	}

	public void recycleView(View view)
	{
		r r = RecyclerView.getChildViewHolderInt(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #197 <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:astore_2        
		if(r.isTmpDetached())
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #472 <Method boolean RecyclerView$ViewHolder.isTmpDetached()>
	//*   5    9:ifeq            21
			removeDetachedView(view, false);
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field RecyclerView this$0>
	//    8   16:aload_1         
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #365 <Method void RecyclerView.removeDetachedView(View, boolean)>
		if(r.isScrap())
	//*  11   21:aload_2         
	//*  12   22:invokevirtual   #475 <Method boolean RecyclerView$ViewHolder.isScrap()>
	//*  13   25:ifeq            35
			r.unScrap();
	//   14   28:aload_2         
	//   15   29:invokevirtual   #478 <Method void RecyclerView$ViewHolder.unScrap()>
		else
	//*  16   32:goto            46
		if(r.wasReturnedFromScrap())
	//*  17   35:aload_2         
	//*  18   36:invokevirtual   #335 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//*  19   39:ifeq            46
			r.clearReturnedFromScrapFlag();
	//   20   42:aload_2         
	//   21   43:invokevirtual   #451 <Method void RecyclerView$ViewHolder.clearReturnedFromScrapFlag()>
		recycleViewHolderInternal(r);
	//   22   46:aload_0         
	//   23   47:aload_2         
	//   24   48:invokevirtual   #454 <Method void recycleViewHolderInternal(RecyclerView$ViewHolder)>
	//   25   51:return          
	}

	void recycleViewHolderInternal(r r)
	{
		boolean flag5 = r.isScrap();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #475 <Method boolean RecyclerView$ViewHolder.isScrap()>
	//    2    4:istore          6
		boolean flag4 = false;
	//    3    6:iconst_0        
	//    4    7:istore          5
		boolean flag3 = false;
	//    5    9:iconst_0        
	//    6   10:istore          4
		if(!flag5 && r.itemView.getParent() == null)
	//*   7   12:iload           6
	//*   8   14:ifne            404
	//*   9   17:aload_1         
	//*  10   18:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//*  11   21:invokevirtual   #268 <Method android.view.ViewParent View.getParent()>
	//*  12   24:ifnull          30
	//*  13   27:goto            404
		{
			if(r.isTmpDetached())
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #472 <Method boolean RecyclerView$ViewHolder.isTmpDetached()>
	//*  16   34:ifeq            88
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   17   37:new             #199 <Class StringBuilder>
	//   18   40:dup             
	//   19   41:invokespecial   #200 <Method void StringBuilder()>
	//   20   44:astore          7
				stringbuilder.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
	//   21   46:aload           7
	//   22   48:ldc2            #480 <String "Tmp detached view should be removed from RecyclerView before it can be recycled: ">
	//   23   51:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   24   54:pop             
				stringbuilder.append(((Object) (r)));
	//   25   55:aload           7
	//   26   57:aload_1         
	//   27   58:invokevirtual   #400 <Method StringBuilder StringBuilder.append(Object)>
	//   28   61:pop             
				stringbuilder.append(exceptionLabel());
	//   29   62:aload           7
	//   30   64:aload_0         
	//   31   65:getfield        #30  <Field RecyclerView this$0>
	//   32   68:invokevirtual   #210 <Method String RecyclerView.exceptionLabel()>
	//   33   71:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   34   74:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   35   75:new             #212 <Class IllegalArgumentException>
	//   36   78:dup             
	//   37   79:aload           7
	//   38   81:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   39   84:invokespecial   #218 <Method void IllegalArgumentException(String)>
	//   40   87:athrow          
			}
			if(r.shouldIgnore())
	//*  41   88:aload_1         
	//*  42   89:invokevirtual   #483 <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//*  43   92:ifeq            135
			{
				r = ((r) (new StringBuilder()));
	//   44   95:new             #199 <Class StringBuilder>
	//   45   98:dup             
	//   46   99:invokespecial   #200 <Method void StringBuilder()>
	//   47  102:astore_1        
				((StringBuilder) (r)).append("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
	//   48  103:aload_1         
	//   49  104:ldc2            #485 <String "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.">
	//   50  107:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   51  110:pop             
				((StringBuilder) (r)).append(exceptionLabel());
	//   52  111:aload_1         
	//   53  112:aload_0         
	//   54  113:getfield        #30  <Field RecyclerView this$0>
	//   55  116:invokevirtual   #210 <Method String RecyclerView.exceptionLabel()>
	//   56  119:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   57  122:pop             
				throw new IllegalArgumentException(((StringBuilder) (r)).toString());
	//   58  123:new             #212 <Class IllegalArgumentException>
	//   59  126:dup             
	//   60  127:aload_1         
	//   61  128:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   62  131:invokespecial   #218 <Method void IllegalArgumentException(String)>
	//   63  134:athrow          
			}
			flag4 = r.access._mth900(r);
	//   64  135:aload_1         
	//   65  136:invokestatic    #489 <Method boolean RecyclerView$ViewHolder.access$900(RecyclerView$ViewHolder)>
	//   66  139:istore          5
			boolean flag;
			if(mAdapter != null && flag4 && mAdapter.onFailedToRecycleView(r))
	//*  67  141:aload_0         
	//*  68  142:getfield        #30  <Field RecyclerView this$0>
	//*  69  145:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  70  148:ifnull          175
	//*  71  151:iload           5
	//*  72  153:ifeq            175
	//*  73  156:aload_0         
	//*  74  157:getfield        #30  <Field RecyclerView this$0>
	//*  75  160:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  76  163:aload_1         
	//*  77  164:invokevirtual   #492 <Method boolean RecyclerView$Adapter.onFailedToRecycleView(RecyclerView$ViewHolder)>
	//*  78  167:ifeq            175
				flag = true;
	//   79  170:iconst_1        
	//   80  171:istore_2        
			else
	//*  81  172:goto            177
				flag = false;
	//   82  175:iconst_0        
	//   83  176:istore_2        
			int j;
			if(!flag && !r.isRecyclable())
	//*  84  177:iload_2         
	//*  85  178:ifne            202
	//*  86  181:aload_1         
	//*  87  182:invokevirtual   #495 <Method boolean RecyclerView$ViewHolder.isRecyclable()>
	//*  88  185:ifeq            191
	//*  89  188:goto            202
			{
				boolean flag1 = false;
	//   90  191:iconst_0        
	//   91  192:istore_2        
				j = ((int) (flag3));
	//   92  193:iload           4
	//   93  195:istore_3        
				flag3 = flag1;
	//   94  196:iload_2         
	//   95  197:istore          4
			} else
	//*  96  199:goto            373
			{
				boolean flag2;
				if(mViewCacheMax > 0 && !r.hasAnyOfTheFlags(526))
	//*  97  202:aload_0         
	//*  98  203:getfield        #54  <Field int mViewCacheMax>
	//*  99  206:ifle            350
	//* 100  209:aload_1         
	//* 101  210:sipush          526
	//* 102  213:invokevirtual   #178 <Method boolean RecyclerView$ViewHolder.hasAnyOfTheFlags(int)>
	//* 103  216:ifne            350
				{
					j = mCachedViews.size();
	//  104  219:aload_0         
	//  105  220:getfield        #42  <Field ArrayList mCachedViews>
	//  106  223:invokevirtual   #296 <Method int ArrayList.size()>
	//  107  226:istore_3        
					int i = j;
	//  108  227:iload_3         
	//  109  228:istore_2        
					if(j >= mViewCacheMax)
	//* 110  229:iload_3         
	//* 111  230:aload_0         
	//* 112  231:getfield        #54  <Field int mViewCacheMax>
	//* 113  234:icmplt          252
					{
						i = j;
	//  114  237:iload_3         
	//  115  238:istore_2        
						if(j > 0)
	//* 116  239:iload_3         
	//* 117  240:ifle            252
						{
							recycleCachedViewAt(0);
	//  118  243:aload_0         
	//  119  244:iconst_0        
	//  120  245:invokevirtual   #372 <Method void recycleCachedViewAt(int)>
							i = j - 1;
	//  121  248:iload_3         
	//  122  249:iconst_1        
	//  123  250:isub            
	//  124  251:istore_2        
						}
					}
					j = i;
	//  125  252:iload_2         
	//  126  253:istore_3        
					if(RecyclerView.access$800())
	//* 127  254:invokestatic    #457 <Method boolean RecyclerView.access$800()>
	//* 128  257:ifeq            336
					{
						j = i;
	//  129  260:iload_2         
	//  130  261:istore_3        
						if(i > 0)
	//* 131  262:iload_2         
	//* 132  263:ifle            336
						{
							j = i;
	//  133  266:iload_2         
	//  134  267:istore_3        
							if(!mPrefetchRegistry.lastPrefetchIncludedPosition(r.mPosition))
	//* 135  268:aload_0         
	//* 136  269:getfield        #30  <Field RecyclerView this$0>
	//* 137  272:getfield        #461 <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//* 138  275:aload_1         
	//* 139  276:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//* 140  279:invokevirtual   #498 <Method boolean GapWorker$LayoutPrefetchRegistryImpl.lastPrefetchIncludedPosition(int)>
	//* 141  282:ifne            336
							{
								i--;
	//  142  285:iload_2         
	//  143  286:iconst_1        
	//  144  287:isub            
	//  145  288:istore_2        
								do
								{
									if(i < 0)
										break;
	//  146  289:iload_2         
	//  147  290:iflt            332
									j = ((r)mCachedViews.get(i)).mPosition;
	//  148  293:aload_0         
	//  149  294:getfield        #42  <Field ArrayList mCachedViews>
	//  150  297:iload_2         
	//  151  298:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//  152  301:checkcast       #63  <Class RecyclerView$ViewHolder>
	//  153  304:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//  154  307:istore_3        
									if(!mPrefetchRegistry.lastPrefetchIncludedPosition(j))
	//* 155  308:aload_0         
	//* 156  309:getfield        #30  <Field RecyclerView this$0>
	//* 157  312:getfield        #461 <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//* 158  315:iload_3         
	//* 159  316:invokevirtual   #498 <Method boolean GapWorker$LayoutPrefetchRegistryImpl.lastPrefetchIncludedPosition(int)>
	//* 160  319:ifne            325
										break;
	//  161  322:goto            332
									i--;
	//  162  325:iload_2         
	//  163  326:iconst_1        
	//  164  327:isub            
	//  165  328:istore_2        
								} while(true);
	//  166  329:goto            289
								j = i + 1;
	//  167  332:iload_2         
	//  168  333:iconst_1        
	//  169  334:iadd            
	//  170  335:istore_3        
							}
						}
					}
					mCachedViews.add(j, ((Object) (r)));
	//  171  336:aload_0         
	//  172  337:getfield        #42  <Field ArrayList mCachedViews>
	//  173  340:iload_3         
	//  174  341:aload_1         
	//  175  342:invokevirtual   #502 <Method void ArrayList.add(int, Object)>
					flag2 = true;
	//  176  345:iconst_1        
	//  177  346:istore_2        
				} else
	//* 178  347:goto            352
				{
					flag2 = false;
	//  179  350:iconst_0        
	//  180  351:istore_2        
				}
				j = ((int) (flag3));
	//  181  352:iload           4
	//  182  354:istore_3        
				flag3 = flag2;
	//  183  355:iload_2         
	//  184  356:istore          4
				if(!flag2)
	//* 185  358:iload_2         
	//* 186  359:ifne            373
				{
					addViewHolderToRecycledViewPool(r, true);
	//  187  362:aload_0         
	//  188  363:aload_1         
	//  189  364:iconst_1        
	//  190  365:invokevirtual   #468 <Method void addViewHolderToRecycledViewPool(RecyclerView$ViewHolder, boolean)>
					j = 1;
	//  191  368:iconst_1        
	//  192  369:istore_3        
					flag3 = flag2;
	//  193  370:iload_2         
	//  194  371:istore          4
				}
			}
			mViewInfoStore.removeViewHolder(r);
	//  195  373:aload_0         
	//  196  374:getfield        #30  <Field RecyclerView this$0>
	//  197  377:getfield        #325 <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//  198  380:aload_1         
	//  199  381:invokevirtual   #330 <Method void ViewInfoStore.removeViewHolder(RecyclerView$ViewHolder)>
			if(!flag3 && j == 0 && flag4)
	//* 200  384:iload           4
	//* 201  386:ifne            403
	//* 202  389:iload_3         
	//* 203  390:ifne            403
	//* 204  393:iload           5
	//* 205  395:ifeq            403
				r.mOwnerRecyclerView = null;
	//  206  398:aload_1         
	//  207  399:aconst_null     
	//  208  400:putfield        #124 <Field RecyclerView RecyclerView$ViewHolder.mOwnerRecyclerView>
			return;
	//  209  403:return          
		}
		StringBuilder stringbuilder1 = new StringBuilder();
	//  210  404:new             #199 <Class StringBuilder>
	//  211  407:dup             
	//  212  408:invokespecial   #200 <Method void StringBuilder()>
	//  213  411:astore          7
		stringbuilder1.append("Scrapped or attached views may not be recycled. isScrap:");
	//  214  413:aload           7
	//  215  415:ldc2            #504 <String "Scrapped or attached views may not be recycled. isScrap:">
	//  216  418:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  217  421:pop             
		stringbuilder1.append(r.isScrap());
	//  218  422:aload           7
	//  219  424:aload_1         
	//  220  425:invokevirtual   #475 <Method boolean RecyclerView$ViewHolder.isScrap()>
	//  221  428:invokevirtual   #507 <Method StringBuilder StringBuilder.append(boolean)>
	//  222  431:pop             
		stringbuilder1.append(" isAttached:");
	//  223  432:aload           7
	//  224  434:ldc2            #509 <String " isAttached:">
	//  225  437:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  226  440:pop             
		if(r.itemView.getParent() != null)
	//* 227  441:aload_1         
	//* 228  442:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//* 229  445:invokevirtual   #268 <Method android.view.ViewParent View.getParent()>
	//* 230  448:ifnull          454
			flag4 = true;
	//  231  451:iconst_1        
	//  232  452:istore          5
		stringbuilder1.append(flag4);
	//  233  454:aload           7
	//  234  456:iload           5
	//  235  458:invokevirtual   #507 <Method StringBuilder StringBuilder.append(boolean)>
	//  236  461:pop             
		stringbuilder1.append(exceptionLabel());
	//  237  462:aload           7
	//  238  464:aload_0         
	//  239  465:getfield        #30  <Field RecyclerView this$0>
	//  240  468:invokevirtual   #210 <Method String RecyclerView.exceptionLabel()>
	//  241  471:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  242  474:pop             
		throw new IllegalArgumentException(stringbuilder1.toString());
	//  243  475:new             #212 <Class IllegalArgumentException>
	//  244  478:dup             
	//  245  479:aload           7
	//  246  481:invokevirtual   #215 <Method String StringBuilder.toString()>
	//  247  484:invokespecial   #218 <Method void IllegalArgumentException(String)>
	//  248  487:athrow          
	}

	void recycleViewInternal(View view)
	{
		recycleViewHolderInternal(RecyclerView.getChildViewHolderInt(view));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #197 <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    3    5:invokevirtual   #454 <Method void recycleViewHolderInternal(RecyclerView$ViewHolder)>
	//    4    8:return          
	}

	void scrapView(View view)
	{
		view = ((View) (RecyclerView.getChildViewHolderInt(view)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #197 <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:astore_1        
		if(!((r) (view)).hasAnyOfTheFlags(12) && ((r) (view)).isUpdated() && !canReuseUpdatedViewHolder(((r) (view))))
	//*   3    5:aload_1         
	//*   4    6:bipush          12
	//*   5    8:invokevirtual   #178 <Method boolean RecyclerView$ViewHolder.hasAnyOfTheFlags(int)>
	//*   6   11:ifne            69
	//*   7   14:aload_1         
	//*   8   15:invokevirtual   #513 <Method boolean RecyclerView$ViewHolder.isUpdated()>
	//*   9   18:ifeq            69
	//*  10   21:aload_0         
	//*  11   22:getfield        #30  <Field RecyclerView this$0>
	//*  12   25:aload_1         
	//*  13   26:invokevirtual   #516 <Method boolean RecyclerView.canReuseUpdatedViewHolder(RecyclerView$ViewHolder)>
	//*  14   29:ifeq            35
	//*  15   32:goto            69
		{
			if(mChangedScrap == null)
	//*  16   35:aload_0         
	//*  17   36:getfield        #40  <Field ArrayList mChangedScrap>
	//*  18   39:ifnonnull       53
				mChangedScrap = new ArrayList();
	//   19   42:aload_0         
	//   20   43:new             #35  <Class ArrayList>
	//   21   46:dup             
	//   22   47:invokespecial   #36  <Method void ArrayList()>
	//   23   50:putfield        #40  <Field ArrayList mChangedScrap>
			((r) (view)).setScrapContainer(this, true);
	//   24   53:aload_1         
	//   25   54:aload_0         
	//   26   55:iconst_1        
	//   27   56:invokevirtual   #520 <Method void RecyclerView$ViewHolder.setScrapContainer(RecyclerView$Recycler, boolean)>
			mChangedScrap.add(((Object) (view)));
	//   28   59:aload_0         
	//   29   60:getfield        #40  <Field ArrayList mChangedScrap>
	//   30   63:aload_1         
	//   31   64:invokevirtual   #523 <Method boolean ArrayList.add(Object)>
	//   32   67:pop             
			return;
	//   33   68:return          
		}
		if(((r) (view)).isInvalid() && !((r) (view)).isRemoved() && !mAdapter.hasStableIds())
	//*  34   69:aload_1         
	//*  35   70:invokevirtual   #377 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//*  36   73:ifeq            136
	//*  37   76:aload_1         
	//*  38   77:invokevirtual   #358 <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*  39   80:ifne            136
	//*  40   83:aload_0         
	//*  41   84:getfield        #30  <Field RecyclerView this$0>
	//*  42   87:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  43   90:invokevirtual   #341 <Method boolean RecyclerView$Adapter.hasStableIds()>
	//*  44   93:ifne            136
		{
			view = ((View) (new StringBuilder()));
	//   45   96:new             #199 <Class StringBuilder>
	//   46   99:dup             
	//   47  100:invokespecial   #200 <Method void StringBuilder()>
	//   48  103:astore_1        
			((StringBuilder) (view)).append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
	//   49  104:aload_1         
	//   50  105:ldc2            #525 <String "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.">
	//   51  108:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   52  111:pop             
			((StringBuilder) (view)).append(exceptionLabel());
	//   53  112:aload_1         
	//   54  113:aload_0         
	//   55  114:getfield        #30  <Field RecyclerView this$0>
	//   56  117:invokevirtual   #210 <Method String RecyclerView.exceptionLabel()>
	//   57  120:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   58  123:pop             
			throw new IllegalArgumentException(((StringBuilder) (view)).toString());
	//   59  124:new             #212 <Class IllegalArgumentException>
	//   60  127:dup             
	//   61  128:aload_1         
	//   62  129:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   63  132:invokespecial   #218 <Method void IllegalArgumentException(String)>
	//   64  135:athrow          
		} else
		{
			((r) (view)).setScrapContainer(this, false);
	//   65  136:aload_1         
	//   66  137:aload_0         
	//   67  138:iconst_0        
	//   68  139:invokevirtual   #520 <Method void RecyclerView$ViewHolder.setScrapContainer(RecyclerView$Recycler, boolean)>
			mAttachedScrap.add(((Object) (view)));
	//   69  142:aload_0         
	//   70  143:getfield        #38  <Field ArrayList mAttachedScrap>
	//   71  146:aload_1         
	//   72  147:invokevirtual   #523 <Method boolean ArrayList.add(Object)>
	//   73  150:pop             
			return;
	//   74  151:return          
		}
	}

	void setRecycledViewPool(iewPool iewpool)
	{
		if(mRecyclerPool != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #135 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//*   2    4:ifnull          14
			mRecyclerPool.detach();
	//    3    7:aload_0         
	//    4    8:getfield        #135 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//    5   11:invokevirtual   #530 <Method void RecyclerView$RecycledViewPool.detach()>
		mRecyclerPool = iewpool;
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:putfield        #135 <Field RecyclerView$RecycledViewPool mRecyclerPool>
		if(iewpool != null)
	//*   9   19:aload_1         
	//*  10   20:ifnull          37
			mRecyclerPool.attach(getAdapter());
	//   11   23:aload_0         
	//   12   24:getfield        #135 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//   13   27:aload_0         
	//   14   28:getfield        #30  <Field RecyclerView this$0>
	//   15   31:invokevirtual   #534 <Method RecyclerView$Adapter RecyclerView.getAdapter()>
	//   16   34:invokevirtual   #538 <Method void RecyclerView$RecycledViewPool.attach(RecyclerView$Adapter)>
	//   17   37:return          
	}

	void setViewCacheExtension(Extension extension)
	{
		mViewCacheExtension = extension;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #542 <Field RecyclerView$ViewCacheExtension mViewCacheExtension>
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
	//    4    6:invokevirtual   #546 <Method void updateViewCacheSize()>
	//    5    9:return          
	}

	r tryGetViewHolderForPositionByDeadline(int i, boolean flag, long l)
	{
label0:
		{
			int k;
			boolean flag2;
			Object obj2;
label1:
			{
				if(i < 0 || i >= mState.getItemCount())
	//*   0    0:iload_1         
	//*   1    1:iflt            1073
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #30  <Field RecyclerView this$0>
	//*   5    9:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//*   6   12:invokevirtual   #283 <Method int RecyclerView$State.getItemCount()>
	//*   7   15:icmplt          21
					break label0;
	//    8   18:goto            1073
				boolean flag3 = mState.isPreLayout();
	//    9   21:aload_0         
	//   10   22:getfield        #30  <Field RecyclerView this$0>
	//   11   25:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//   12   28:invokevirtual   #166 <Method boolean RecyclerView$State.isPreLayout()>
	//   13   31:istore          10
				flag2 = true;
	//   14   33:iconst_1        
	//   15   34:istore          9
				r r;
				if(flag3)
	//*  16   36:iload           10
	//*  17   38:ifeq            63
				{
					obj2 = ((Object) (getChangedScrapViewForPosition(i)));
	//   18   41:aload_0         
	//   19   42:iload_1         
	//   20   43:invokevirtual   #549 <Method RecyclerView$ViewHolder getChangedScrapViewForPosition(int)>
	//   21   46:astore          16
					r = ((r) (obj2));
	//   22   48:aload           16
	//   23   50:astore          15
					if(obj2 != null)
	//*  24   52:aload           16
	//*  25   54:ifnull          66
					{
						k = 1;
	//   26   57:iconst_1        
	//   27   58:istore          6
						break label1;
	//   28   60:goto            73
					}
				} else
				{
					r = null;
	//   29   63:aconst_null     
	//   30   64:astore          15
				}
				k = 0;
	//   31   66:iconst_0        
	//   32   67:istore          6
				obj2 = ((Object) (r));
	//   33   69:aload           15
	//   34   71:astore          16
			}
label2:
			{
				Object obj = obj2;
	//   35   73:aload           16
	//   36   75:astore          15
				boolean flag1 = ((boolean) (k));
	//   37   77:iload           6
	//   38   79:istore          5
				if(obj2 == null)
	//*  39   81:aload           16
	//*  40   83:ifnonnull       191
				{
					obj2 = ((Object) (getScrapOrHiddenOrCachedHolderForPosition(i, flag)));
	//   41   86:aload_0         
	//   42   87:iload_1         
	//   43   88:iload_2         
	//   44   89:invokevirtual   #551 <Method RecyclerView$ViewHolder getScrapOrHiddenOrCachedHolderForPosition(int, boolean)>
	//   45   92:astore          16
					obj = obj2;
	//   46   94:aload           16
	//   47   96:astore          15
					flag1 = ((boolean) (k));
	//   48   98:iload           6
	//   49  100:istore          5
					if(obj2 != null)
	//*  50  102:aload           16
	//*  51  104:ifnull          191
						if(!validateViewHolderForOffsetPosition(((r) (obj2))))
	//*  52  107:aload_0         
	//*  53  108:aload           16
	//*  54  110:invokevirtual   #554 <Method boolean validateViewHolderForOffsetPosition(RecyclerView$ViewHolder)>
	//*  55  113:ifne            184
						{
							if(!flag)
	//*  56  116:iload_2         
	//*  57  117:ifne            174
							{
								((r) (obj2)).addFlags(4);
	//   58  120:aload           16
	//   59  122:iconst_4        
	//   60  123:invokevirtual   #85  <Method void RecyclerView$ViewHolder.addFlags(int)>
								if(((r) (obj2)).isScrap())
	//*  61  126:aload           16
	//*  62  128:invokevirtual   #475 <Method boolean RecyclerView$ViewHolder.isScrap()>
	//*  63  131:ifeq            155
								{
									removeDetachedView(((r) (obj2)).itemView, false);
	//   64  134:aload_0         
	//   65  135:getfield        #30  <Field RecyclerView this$0>
	//   66  138:aload           16
	//   67  140:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//   68  143:iconst_0        
	//   69  144:invokevirtual   #365 <Method void RecyclerView.removeDetachedView(View, boolean)>
									((r) (obj2)).unScrap();
	//   70  147:aload           16
	//   71  149:invokevirtual   #478 <Method void RecyclerView$ViewHolder.unScrap()>
								} else
	//*  72  152:goto            168
								if(((r) (obj2)).wasReturnedFromScrap())
	//*  73  155:aload           16
	//*  74  157:invokevirtual   #335 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//*  75  160:ifeq            168
									((r) (obj2)).clearReturnedFromScrapFlag();
	//   76  163:aload           16
	//   77  165:invokevirtual   #451 <Method void RecyclerView$ViewHolder.clearReturnedFromScrapFlag()>
								recycleViewHolderInternal(((r) (obj2)));
	//   78  168:aload_0         
	//   79  169:aload           16
	//   80  171:invokevirtual   #454 <Method void recycleViewHolderInternal(RecyclerView$ViewHolder)>
							}
							obj = null;
	//   81  174:aconst_null     
	//   82  175:astore          15
							flag1 = ((boolean) (k));
	//   83  177:iload           6
	//   84  179:istore          5
						} else
	//*  85  181:goto            191
						{
							flag1 = true;
	//   86  184:iconst_1        
	//   87  185:istore          5
							obj = obj2;
	//   88  187:aload           16
	//   89  189:astore          15
						}
				}
				Object obj3 = obj;
	//   90  191:aload           15
	//   91  193:astore          17
				int i1 = ((int) (flag1));
	//   92  195:iload           5
	//   93  197:istore          7
				if(obj == null)
	//*  94  199:aload           15
	//*  95  201:ifnonnull       763
				{
					i1 = mAdapterHelper.findPositionOffset(i);
	//   96  204:aload_0         
	//   97  205:getfield        #30  <Field RecyclerView this$0>
	//   98  208:getfield        #222 <Field AdapterHelper RecyclerView.mAdapterHelper>
	//   99  211:iload_1         
	//  100  212:invokevirtual   #228 <Method int AdapterHelper.findPositionOffset(int)>
	//  101  215:istore          7
					if(i1 >= 0 && i1 < mAdapter.getItemCount())
	//* 102  217:iload           7
	//* 103  219:iflt            661
	//* 104  222:iload           7
	//* 105  224:aload_0         
	//* 106  225:getfield        #30  <Field RecyclerView this$0>
	//* 107  228:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//* 108  231:invokevirtual   #231 <Method int RecyclerView$Adapter.getItemCount()>
	//* 109  234:icmplt          240
	//* 110  237:goto            661
					{
						int j1 = mAdapter.getItemViewType(i1);
	//  111  240:aload_0         
	//  112  241:getfield        #30  <Field RecyclerView this$0>
	//  113  244:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//  114  247:iload           7
	//  115  249:invokevirtual   #556 <Method int RecyclerView$Adapter.getItemViewType(int)>
	//  116  252:istore          8
						obj2 = obj;
	//  117  254:aload           15
	//  118  256:astore          16
						k = ((int) (flag1));
	//  119  258:iload           5
	//  120  260:istore          6
						if(mAdapter.hasStableIds())
	//* 121  262:aload_0         
	//* 122  263:getfield        #30  <Field RecyclerView this$0>
	//* 123  266:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//* 124  269:invokevirtual   #341 <Method boolean RecyclerView$Adapter.hasStableIds()>
	//* 125  272:ifeq            323
						{
							obj = ((Object) (getScrapOrCachedViewForId(mAdapter.getItemId(i1), j1, flag)));
	//  126  275:aload_0         
	//  127  276:aload_0         
	//  128  277:getfield        #30  <Field RecyclerView this$0>
	//  129  280:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//  130  283:iload           7
	//  131  285:invokevirtual   #345 <Method long RecyclerView$Adapter.getItemId(int)>
	//  132  288:iload           8
	//  133  290:iload_2         
	//  134  291:invokevirtual   #558 <Method RecyclerView$ViewHolder getScrapOrCachedViewForId(long, int, boolean)>
	//  135  294:astore          15
							obj2 = obj;
	//  136  296:aload           15
	//  137  298:astore          16
							k = ((int) (flag1));
	//  138  300:iload           5
	//  139  302:istore          6
							if(obj != null)
	//* 140  304:aload           15
	//* 141  306:ifnull          323
							{
								obj.mPosition = i1;
	//  142  309:aload           15
	//  143  311:iload           7
	//  144  313:putfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
								k = 1;
	//  145  316:iconst_1        
	//  146  317:istore          6
								obj2 = obj;
	//  147  319:aload           15
	//  148  321:astore          16
							}
						}
						obj = obj2;
	//  149  323:aload           16
	//  150  325:astore          15
						if(obj2 == null)
	//* 151  327:aload           16
	//* 152  329:ifnonnull       481
						{
							obj = obj2;
	//  153  332:aload           16
	//  154  334:astore          15
							if(mViewCacheExtension != null)
	//* 155  336:aload_0         
	//* 156  337:getfield        #542 <Field RecyclerView$ViewCacheExtension mViewCacheExtension>
	//* 157  340:ifnull          481
							{
								obj3 = ((Object) (mViewCacheExtension.getViewForPositionAndType(this, i, j1)));
	//  158  343:aload_0         
	//  159  344:getfield        #542 <Field RecyclerView$ViewCacheExtension mViewCacheExtension>
	//  160  347:aload_0         
	//  161  348:iload_1         
	//  162  349:iload           8
	//  163  351:invokevirtual   #564 <Method View RecyclerView$ViewCacheExtension.getViewForPositionAndType(RecyclerView$Recycler, int, int)>
	//  164  354:astore          17
								obj = obj2;
	//  165  356:aload           16
	//  166  358:astore          15
								if(obj3 != null)
	//* 167  360:aload           17
	//* 168  362:ifnull          481
								{
									obj2 = ((Object) (getChildViewHolder(((View) (obj3)))));
	//  169  365:aload_0         
	//  170  366:getfield        #30  <Field RecyclerView this$0>
	//  171  369:aload           17
	//  172  371:invokevirtual   #567 <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolder(View)>
	//  173  374:astore          16
									if(obj2 == null)
	//* 174  376:aload           16
	//* 175  378:ifnonnull       425
									{
										obj = ((Object) (new StringBuilder()));
	//  176  381:new             #199 <Class StringBuilder>
	//  177  384:dup             
	//  178  385:invokespecial   #200 <Method void StringBuilder()>
	//  179  388:astore          15
										((StringBuilder) (obj)).append("getViewForPositionAndType returned a view which does not have a ViewHolder");
	//  180  390:aload           15
	//  181  392:ldc2            #569 <String "getViewForPositionAndType returned a view which does not have a ViewHolder">
	//  182  395:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  183  398:pop             
										((StringBuilder) (obj)).append(exceptionLabel());
	//  184  399:aload           15
	//  185  401:aload_0         
	//  186  402:getfield        #30  <Field RecyclerView this$0>
	//  187  405:invokevirtual   #210 <Method String RecyclerView.exceptionLabel()>
	//  188  408:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  189  411:pop             
										throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  190  412:new             #212 <Class IllegalArgumentException>
	//  191  415:dup             
	//  192  416:aload           15
	//  193  418:invokevirtual   #215 <Method String StringBuilder.toString()>
	//  194  421:invokespecial   #218 <Method void IllegalArgumentException(String)>
	//  195  424:athrow          
									}
									obj = obj2;
	//  196  425:aload           16
	//  197  427:astore          15
									if(((r) (obj2)).shouldIgnore())
	//* 198  429:aload           16
	//* 199  431:invokevirtual   #483 <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//* 200  434:ifeq            481
									{
										obj = ((Object) (new StringBuilder()));
	//  201  437:new             #199 <Class StringBuilder>
	//  202  440:dup             
	//  203  441:invokespecial   #200 <Method void StringBuilder()>
	//  204  444:astore          15
										((StringBuilder) (obj)).append("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
	//  205  446:aload           15
	//  206  448:ldc2            #571 <String "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.">
	//  207  451:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  208  454:pop             
										((StringBuilder) (obj)).append(exceptionLabel());
	//  209  455:aload           15
	//  210  457:aload_0         
	//  211  458:getfield        #30  <Field RecyclerView this$0>
	//  212  461:invokevirtual   #210 <Method String RecyclerView.exceptionLabel()>
	//  213  464:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  214  467:pop             
										throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  215  468:new             #212 <Class IllegalArgumentException>
	//  216  471:dup             
	//  217  472:aload           15
	//  218  474:invokevirtual   #215 <Method String StringBuilder.toString()>
	//  219  477:invokespecial   #218 <Method void IllegalArgumentException(String)>
	//  220  480:athrow          
									}
								}
							}
						}
						obj2 = obj;
	//  221  481:aload           15
	//  222  483:astore          16
						if(obj == null)
	//* 223  485:aload           15
	//* 224  487:ifnonnull       535
						{
							r r1 = getRecycledViewPool().getRecycledView(j1);
	//  225  490:aload_0         
	//  226  491:invokevirtual   #189 <Method RecyclerView$RecycledViewPool getRecycledViewPool()>
	//  227  494:iload           8
	//  228  496:invokevirtual   #574 <Method RecyclerView$ViewHolder RecyclerView$RecycledViewPool.getRecycledView(int)>
	//  229  499:astore          15
							obj2 = ((Object) (r1));
	//  230  501:aload           15
	//  231  503:astore          16
							if(r1 != null)
	//* 232  505:aload           15
	//* 233  507:ifnull          535
							{
								r1.resetInternal();
	//  234  510:aload           15
	//  235  512:invokevirtual   #577 <Method void RecyclerView$ViewHolder.resetInternal()>
								obj2 = ((Object) (r1));
	//  236  515:aload           15
	//  237  517:astore          16
								if(RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST)
	//* 238  519:getstatic       #580 <Field boolean RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST>
	//* 239  522:ifeq            535
								{
									invalidateDisplayListInt(r1);
	//  240  525:aload_0         
	//  241  526:aload           15
	//  242  528:invokespecial   #582 <Method void invalidateDisplayListInt(RecyclerView$ViewHolder)>
									obj2 = ((Object) (r1));
	//  243  531:aload           15
	//  244  533:astore          16
								}
							}
						}
						obj3 = obj2;
	//  245  535:aload           16
	//  246  537:astore          17
						i1 = k;
	//  247  539:iload           6
	//  248  541:istore          7
						if(obj2 == null)
	//* 249  543:aload           16
	//* 250  545:ifnonnull       763
						{
							long l1 = getNanoTime();
	//  251  548:aload_0         
	//  252  549:getfield        #30  <Field RecyclerView this$0>
	//  253  552:invokevirtual   #131 <Method long RecyclerView.getNanoTime()>
	//  254  555:lstore          11
							if(l != 0xffffffffL && !mRecyclerPool.willCreateInTime(j1, l1, l))
	//* 255  557:lload_3         
	//* 256  558:ldc2w           #132 <Long 0xffffffffL>
	//* 257  561:lcmp            
	//* 258  562:ifeq            582
	//* 259  565:aload_0         
	//* 260  566:getfield        #135 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//* 261  569:iload           8
	//* 262  571:lload           11
	//* 263  573:lload_3         
	//* 264  574:invokevirtual   #585 <Method boolean RecyclerView$RecycledViewPool.willCreateInTime(int, long, long)>
	//* 265  577:ifne            582
								return null;
	//  266  580:aconst_null     
	//  267  581:areturn         
							obj2 = ((Object) (mAdapter.createViewHolder(((ViewGroup) (RecyclerView.this)), j1)));
	//  268  582:aload_0         
	//  269  583:getfield        #30  <Field RecyclerView this$0>
	//  270  586:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//  271  589:aload_0         
	//  272  590:getfield        #30  <Field RecyclerView this$0>
	//  273  593:iload           8
	//  274  595:invokevirtual   #589 <Method RecyclerView$ViewHolder RecyclerView$Adapter.createViewHolder(ViewGroup, int)>
	//  275  598:astore          16
							if(RecyclerView.access$800())
	//* 276  600:invokestatic    #457 <Method boolean RecyclerView.access$800()>
	//* 277  603:ifeq            635
							{
								RecyclerView recyclerview = RecyclerView.findNestedRecyclerView(((r) (obj2)).itemView);
	//  278  606:aload           16
	//  279  608:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//  280  611:invokestatic    #593 <Method RecyclerView RecyclerView.findNestedRecyclerView(View)>
	//  281  614:astore          15
								if(recyclerview != null)
	//* 282  616:aload           15
	//* 283  618:ifnull          635
									obj2.mNestedRecyclerView = new WeakReference(((Object) (recyclerview)));
	//  284  621:aload           16
	//  285  623:new             #595 <Class WeakReference>
	//  286  626:dup             
	//  287  627:aload           15
	//  288  629:invokespecial   #597 <Method void WeakReference(Object)>
	//  289  632:putfield        #601 <Field WeakReference RecyclerView$ViewHolder.mNestedRecyclerView>
							}
							long l2 = getNanoTime();
	//  290  635:aload_0         
	//  291  636:getfield        #30  <Field RecyclerView this$0>
	//  292  639:invokevirtual   #131 <Method long RecyclerView.getNanoTime()>
	//  293  642:lstore          13
							mRecyclerPool.factorInCreateTime(j1, l2 - l1);
	//  294  644:aload_0         
	//  295  645:getfield        #135 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//  296  648:iload           8
	//  297  650:lload           13
	//  298  652:lload           11
	//  299  654:lsub            
	//  300  655:invokevirtual   #604 <Method void RecyclerView$RecycledViewPool.factorInCreateTime(int, long)>
							break label2;
	//  301  658:goto            771
						}
					} else
					{
						StringBuilder stringbuilder = new StringBuilder();
	//  302  661:new             #199 <Class StringBuilder>
	//  303  664:dup             
	//  304  665:invokespecial   #200 <Method void StringBuilder()>
	//  305  668:astore          15
						stringbuilder.append("Inconsistency detected. Invalid item position ");
	//  306  670:aload           15
	//  307  672:ldc2            #273 <String "Inconsistency detected. Invalid item position ">
	//  308  675:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  309  678:pop             
						stringbuilder.append(i);
	//  310  679:aload           15
	//  311  681:iload_1         
	//  312  682:invokevirtual   #276 <Method StringBuilder StringBuilder.append(int)>
	//  313  685:pop             
						stringbuilder.append("(offset:");
	//  314  686:aload           15
	//  315  688:ldc2            #278 <String "(offset:">
	//  316  691:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  317  694:pop             
						stringbuilder.append(i1);
	//  318  695:aload           15
	//  319  697:iload           7
	//  320  699:invokevirtual   #276 <Method StringBuilder StringBuilder.append(int)>
	//  321  702:pop             
						stringbuilder.append(").");
	//  322  703:aload           15
	//  323  705:ldc2            #280 <String ").">
	//  324  708:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  325  711:pop             
						stringbuilder.append("state:");
	//  326  712:aload           15
	//  327  714:ldc2            #282 <String "state:">
	//  328  717:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  329  720:pop             
						stringbuilder.append(mState.getItemCount());
	//  330  721:aload           15
	//  331  723:aload_0         
	//  332  724:getfield        #30  <Field RecyclerView this$0>
	//  333  727:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//  334  730:invokevirtual   #283 <Method int RecyclerView$State.getItemCount()>
	//  335  733:invokevirtual   #276 <Method StringBuilder StringBuilder.append(int)>
	//  336  736:pop             
						stringbuilder.append(exceptionLabel());
	//  337  737:aload           15
	//  338  739:aload_0         
	//  339  740:getfield        #30  <Field RecyclerView this$0>
	//  340  743:invokevirtual   #210 <Method String RecyclerView.exceptionLabel()>
	//  341  746:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  342  749:pop             
						throw new IndexOutOfBoundsException(stringbuilder.toString());
	//  343  750:new             #285 <Class IndexOutOfBoundsException>
	//  344  753:dup             
	//  345  754:aload           15
	//  346  756:invokevirtual   #215 <Method String StringBuilder.toString()>
	//  347  759:invokespecial   #286 <Method void IndexOutOfBoundsException(String)>
	//  348  762:athrow          
					}
				}
				obj2 = obj3;
	//  349  763:aload           17
	//  350  765:astore          16
				k = i1;
	//  351  767:iload           7
	//  352  769:istore          6
			}
label3:
			{
label4:
				{
					if(k != 0 && !mState.isPreLayout() && ((r) (obj2)).hasAnyOfTheFlags(8192))
	//* 353  771:iload           6
	//* 354  773:ifeq            872
	//* 355  776:aload_0         
	//* 356  777:getfield        #30  <Field RecyclerView this$0>
	//* 357  780:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//* 358  783:invokevirtual   #166 <Method boolean RecyclerView$State.isPreLayout()>
	//* 359  786:ifne            872
	//* 360  789:aload           16
	//* 361  791:sipush          8192
	//* 362  794:invokevirtual   #178 <Method boolean RecyclerView$ViewHolder.hasAnyOfTheFlags(int)>
	//* 363  797:ifeq            872
					{
						((r) (obj2)).setFlags(0, 8192);
	//  364  800:aload           16
	//  365  802:iconst_0        
	//  366  803:sipush          8192
	//  367  806:invokevirtual   #182 <Method void RecyclerView$ViewHolder.setFlags(int, int)>
						if(mState.mRunSimpleAnimations)
	//* 368  809:aload_0         
	//* 369  810:getfield        #30  <Field RecyclerView this$0>
	//* 370  813:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//* 371  816:getfield        #607 <Field boolean RecyclerView$State.mRunSimpleAnimations>
	//* 372  819:ifeq            872
						{
							int j = tor.buildAdapterChangeFlagsForAnimations(((r) (obj2)));
	//  373  822:aload           16
	//  374  824:invokestatic    #613 <Method int RecyclerView$ItemAnimator.buildAdapterChangeFlagsForAnimations(RecyclerView$ViewHolder)>
	//  375  827:istore          5
							tor.ItemHolderInfo itemholderinfo = mItemAnimator.recordPreLayoutInformation(mState, ((r) (obj2)), j | 0x1000, ((r) (obj2)).getUnmodifiedPayloads());
	//  376  829:aload_0         
	//  377  830:getfield        #30  <Field RecyclerView this$0>
	//  378  833:getfield        #617 <Field RecyclerView$ItemAnimator RecyclerView.mItemAnimator>
	//  379  836:aload_0         
	//  380  837:getfield        #30  <Field RecyclerView this$0>
	//  381  840:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//  382  843:aload           16
	//  383  845:iload           5
	//  384  847:sipush          4096
	//  385  850:ior             
	//  386  851:aload           16
	//  387  853:invokevirtual   #620 <Method List RecyclerView$ViewHolder.getUnmodifiedPayloads()>
	//  388  856:invokevirtual   #624 <Method RecyclerView$ItemAnimator$ItemHolderInfo RecyclerView$ItemAnimator.recordPreLayoutInformation(RecyclerView$State, RecyclerView$ViewHolder, int, List)>
	//  389  859:astore          15
							recordAnimationInfoIfBouncedHiddenView(((r) (obj2)), itemholderinfo);
	//  390  861:aload_0         
	//  391  862:getfield        #30  <Field RecyclerView this$0>
	//  392  865:aload           16
	//  393  867:aload           15
	//  394  869:invokevirtual   #628 <Method void RecyclerView.recordAnimationInfoIfBouncedHiddenView(RecyclerView$ViewHolder, RecyclerView$ItemAnimator$ItemHolderInfo)>
						}
					}
					if(mState.isPreLayout() && ((r) (obj2)).isBound())
	//* 395  872:aload_0         
	//* 396  873:getfield        #30  <Field RecyclerView this$0>
	//* 397  876:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//* 398  879:invokevirtual   #166 <Method boolean RecyclerView$State.isPreLayout()>
	//* 399  882:ifeq            902
	//* 400  885:aload           16
	//* 401  887:invokevirtual   #631 <Method boolean RecyclerView$ViewHolder.isBound()>
	//* 402  890:ifeq            902
						obj2.mPreLayoutPosition = i;
	//  403  893:aload           16
	//  404  895:iload_1         
	//  405  896:putfield        #169 <Field int RecyclerView$ViewHolder.mPreLayoutPosition>
					else
	//* 406  899:goto            929
					if(!((r) (obj2)).isBound() || ((r) (obj2)).needsUpdate() || ((r) (obj2)).isInvalid())
	//* 407  902:aload           16
	//* 408  904:invokevirtual   #631 <Method boolean RecyclerView$ViewHolder.isBound()>
	//* 409  907:ifeq            934
	//* 410  910:aload           16
	//* 411  912:invokevirtual   #634 <Method boolean RecyclerView$ViewHolder.needsUpdate()>
	//* 412  915:ifne            934
	//* 413  918:aload           16
	//* 414  920:invokevirtual   #377 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//* 415  923:ifeq            929
						break label4;
	//  416  926:goto            934
					flag = false;
	//  417  929:iconst_0        
	//  418  930:istore_2        
					break label3;
	//  419  931:goto            954
				}
				flag = tryBindViewHolderByDeadline(((r) (obj2)), mAdapterHelper.findPositionOffset(i), i, l);
	//  420  934:aload_0         
	//  421  935:aload           16
	//  422  937:aload_0         
	//  423  938:getfield        #30  <Field RecyclerView this$0>
	//  424  941:getfield        #222 <Field AdapterHelper RecyclerView.mAdapterHelper>
	//  425  944:iload_1         
	//  426  945:invokevirtual   #228 <Method int AdapterHelper.findPositionOffset(int)>
	//  427  948:iload_1         
	//  428  949:lload_3         
	//  429  950:invokespecial   #233 <Method boolean tryBindViewHolderByDeadline(RecyclerView$ViewHolder, int, int, long)>
	//  430  953:istore_2        
			}
			Object obj1 = ((Object) (((r) (obj2)).itemView.getLayoutParams()));
	//  431  954:aload           16
	//  432  956:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//  433  959:invokevirtual   #239 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  434  962:astore          15
			if(obj1 == null)
	//* 435  964:aload           15
	//* 436  966:ifnonnull       994
			{
				obj1 = ((Object) ((ams)generateDefaultLayoutParams()));
	//  437  969:aload_0         
	//  438  970:getfield        #30  <Field RecyclerView this$0>
	//  439  973:invokevirtual   #242 <Method android.view.ViewGroup$LayoutParams RecyclerView.generateDefaultLayoutParams()>
	//  440  976:checkcast       #244 <Class RecyclerView$LayoutParams>
	//  441  979:astore          15
				((r) (obj2)).itemView.setLayoutParams(((android.view.) (obj1)));
	//  442  981:aload           16
	//  443  983:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//  444  986:aload           15
	//  445  988:invokevirtual   #248 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			} else
	//* 446  991:goto            1040
			if(!checkLayoutParams(((android.view.) (obj1))))
	//* 447  994:aload_0         
	//* 448  995:getfield        #30  <Field RecyclerView this$0>
	//* 449  998:aload           15
	//* 450 1000:invokevirtual   #252 <Method boolean RecyclerView.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 451 1003:ifne            1033
			{
				obj1 = ((Object) ((ams)generateLayoutParams(((android.view.) (obj1)))));
	//  452 1006:aload_0         
	//  453 1007:getfield        #30  <Field RecyclerView this$0>
	//  454 1010:aload           15
	//  455 1012:invokevirtual   #256 <Method android.view.ViewGroup$LayoutParams RecyclerView.generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//  456 1015:checkcast       #244 <Class RecyclerView$LayoutParams>
	//  457 1018:astore          15
				((r) (obj2)).itemView.setLayoutParams(((android.view.) (obj1)));
	//  458 1020:aload           16
	//  459 1022:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//  460 1025:aload           15
	//  461 1027:invokevirtual   #248 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			} else
	//* 462 1030:goto            1040
			{
				obj1 = ((Object) ((ams)obj1));
	//  463 1033:aload           15
	//  464 1035:checkcast       #244 <Class RecyclerView$LayoutParams>
	//  465 1038:astore          15
			}
			obj1.mViewHolder = ((r) (obj2));
	//  466 1040:aload           15
	//  467 1042:aload           16
	//  468 1044:putfield        #264 <Field RecyclerView$ViewHolder RecyclerView$LayoutParams.mViewHolder>
			if(k != 0 && flag)
	//* 469 1047:iload           6
	//* 470 1049:ifeq            1062
	//* 471 1052:iload_2         
	//* 472 1053:ifeq            1062
				flag = flag2;
	//  473 1056:iload           9
	//  474 1058:istore_2        
			else
	//* 475 1059:goto            1064
				flag = false;
	//  476 1062:iconst_0        
	//  477 1063:istore_2        
			obj1.mPendingInvalidate = flag;
	//  478 1064:aload           15
	//  479 1066:iload_2         
	//  480 1067:putfield        #271 <Field boolean RecyclerView$LayoutParams.mPendingInvalidate>
			return ((r) (obj2));
	//  481 1070:aload           16
	//  482 1072:areturn         
		}
		StringBuilder stringbuilder1 = new StringBuilder();
	//  483 1073:new             #199 <Class StringBuilder>
	//  484 1076:dup             
	//  485 1077:invokespecial   #200 <Method void StringBuilder()>
	//  486 1080:astore          15
		stringbuilder1.append("Invalid item position ");
	//  487 1082:aload           15
	//  488 1084:ldc2            #636 <String "Invalid item position ">
	//  489 1087:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  490 1090:pop             
		stringbuilder1.append(i);
	//  491 1091:aload           15
	//  492 1093:iload_1         
	//  493 1094:invokevirtual   #276 <Method StringBuilder StringBuilder.append(int)>
	//  494 1097:pop             
		stringbuilder1.append("(");
	//  495 1098:aload           15
	//  496 1100:ldc2            #638 <String "(">
	//  497 1103:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  498 1106:pop             
		stringbuilder1.append(i);
	//  499 1107:aload           15
	//  500 1109:iload_1         
	//  501 1110:invokevirtual   #276 <Method StringBuilder StringBuilder.append(int)>
	//  502 1113:pop             
		stringbuilder1.append("). Item count:");
	//  503 1114:aload           15
	//  504 1116:ldc2            #640 <String "). Item count:">
	//  505 1119:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  506 1122:pop             
		stringbuilder1.append(mState.getItemCount());
	//  507 1123:aload           15
	//  508 1125:aload_0         
	//  509 1126:getfield        #30  <Field RecyclerView this$0>
	//  510 1129:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//  511 1132:invokevirtual   #283 <Method int RecyclerView$State.getItemCount()>
	//  512 1135:invokevirtual   #276 <Method StringBuilder StringBuilder.append(int)>
	//  513 1138:pop             
		stringbuilder1.append(exceptionLabel());
	//  514 1139:aload           15
	//  515 1141:aload_0         
	//  516 1142:getfield        #30  <Field RecyclerView this$0>
	//  517 1145:invokevirtual   #210 <Method String RecyclerView.exceptionLabel()>
	//  518 1148:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  519 1151:pop             
		throw new IndexOutOfBoundsException(stringbuilder1.toString());
	//  520 1152:new             #285 <Class IndexOutOfBoundsException>
	//  521 1155:dup             
	//  522 1156:aload           15
	//  523 1158:invokevirtual   #215 <Method String StringBuilder.toString()>
	//  524 1161:invokespecial   #286 <Method void IndexOutOfBoundsException(String)>
	//  525 1164:athrow          
	}

	void unscrapView(r r)
	{
		if(r.access._mth1100(r))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #645 <Method boolean RecyclerView$ViewHolder.access$1100(RecyclerView$ViewHolder)>
	//*   2    4:ifeq            19
			mChangedScrap.remove(((Object) (r)));
	//    3    7:aload_0         
	//    4    8:getfield        #40  <Field ArrayList mChangedScrap>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #647 <Method boolean ArrayList.remove(Object)>
	//    7   15:pop             
		else
	//*   8   16:goto            28
			mAttachedScrap.remove(((Object) (r)));
	//    9   19:aload_0         
	//   10   20:getfield        #38  <Field ArrayList mAttachedScrap>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #647 <Method boolean ArrayList.remove(Object)>
	//   13   27:pop             
		r.access._mth1002(r, ((RecyclerView$Recycler) (null)));
	//   14   28:aload_1         
	//   15   29:aconst_null     
	//   16   30:invokestatic    #444 <Method RecyclerView$Recycler RecyclerView$ViewHolder.access$1002(RecyclerView$ViewHolder, RecyclerView$Recycler)>
	//   17   33:pop             
		r.access._mth1102(r, false);
	//   18   34:aload_1         
	//   19   35:iconst_0        
	//   20   36:invokestatic    #448 <Method boolean RecyclerView$ViewHolder.access$1102(RecyclerView$ViewHolder, boolean)>
	//   21   39:pop             
		r.clearReturnedFromScrapFlag();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #451 <Method void RecyclerView$ViewHolder.clearReturnedFromScrapFlag()>
	//   24   44:return          
	}

	void updateViewCacheSize()
	{
		int i;
		if(mLayout != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field RecyclerView this$0>
	//*   2    4:getfield        #651 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//*   3    7:ifnull          24
			i = mLayout.mPrefetchMaxCountObserved;
	//    4   10:aload_0         
	//    5   11:getfield        #30  <Field RecyclerView this$0>
	//    6   14:getfield        #651 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//    7   17:getfield        #656 <Field int RecyclerView$LayoutManager.mPrefetchMaxCountObserved>
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
	//*  20   40:invokevirtual   #296 <Method int ArrayList.size()>
	//*  21   43:iconst_1        
	//*  22   44:isub            
	//*  23   45:istore_1        
	//*  24   46:iload_1         
	//*  25   47:iflt            76
	//*  26   50:aload_0         
	//*  27   51:getfield        #42  <Field ArrayList mCachedViews>
	//*  28   54:invokevirtual   #296 <Method int ArrayList.size()>
	//*  29   57:aload_0         
	//*  30   58:getfield        #54  <Field int mViewCacheMax>
	//*  31   61:icmple          76
			recycleCachedViewAt(j);
	//   32   64:aload_0         
	//   33   65:iload_1         
	//   34   66:invokevirtual   #372 <Method void recycleCachedViewAt(int)>

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
	//*   1    1:invokevirtual   #358 <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*   2    4:ifeq            18
			return mState.isPreLayout();
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field RecyclerView this$0>
	//    5   11:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//    6   14:invokevirtual   #166 <Method boolean RecyclerView$State.isPreLayout()>
	//    7   17:ireturn         
		if(r.mPosition >= 0 && r.mPosition < mAdapter.getItemCount())
	//*   8   18:aload_1         
	//*   9   19:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//*  10   22:iflt            126
	//*  11   25:aload_1         
	//*  12   26:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//*  13   29:aload_0         
	//*  14   30:getfield        #30  <Field RecyclerView this$0>
	//*  15   33:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  16   36:invokevirtual   #231 <Method int RecyclerView$Adapter.getItemCount()>
	//*  17   39:icmplt          45
	//*  18   42:goto            126
		{
			boolean flag1 = mState.isPreLayout();
	//   19   45:aload_0         
	//   20   46:getfield        #30  <Field RecyclerView this$0>
	//   21   49:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//   22   52:invokevirtual   #166 <Method boolean RecyclerView$State.isPreLayout()>
	//   23   55:istore_3        
			boolean flag = false;
	//   24   56:iconst_0        
	//   25   57:istore_2        
			if(!flag1 && mAdapter.getItemViewType(r.mPosition) != r.getItemViewType())
	//*  26   58:iload_3         
	//*  27   59:ifne            85
	//*  28   62:aload_0         
	//*  29   63:getfield        #30  <Field RecyclerView this$0>
	//*  30   66:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  31   69:aload_1         
	//*  32   70:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//*  33   73:invokevirtual   #556 <Method int RecyclerView$Adapter.getItemViewType(int)>
	//*  34   76:aload_1         
	//*  35   77:invokevirtual   #127 <Method int RecyclerView$ViewHolder.getItemViewType()>
	//*  36   80:icmpeq          85
				return false;
	//   37   83:iconst_0        
	//   38   84:ireturn         
			if(mAdapter.hasStableIds())
	//*  39   85:aload_0         
	//*  40   86:getfield        #30  <Field RecyclerView this$0>
	//*  41   89:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  42   92:invokevirtual   #341 <Method boolean RecyclerView$Adapter.hasStableIds()>
	//*  43   95:ifeq            124
			{
				if(r.getItemId() == mAdapter.getItemId(r.mPosition))
	//*  44   98:aload_1         
	//*  45   99:invokevirtual   #347 <Method long RecyclerView$ViewHolder.getItemId()>
	//*  46  102:aload_0         
	//*  47  103:getfield        #30  <Field RecyclerView this$0>
	//*  48  106:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  49  109:aload_1         
	//*  50  110:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//*  51  113:invokevirtual   #345 <Method long RecyclerView$Adapter.getItemId(int)>
	//*  52  116:lcmp            
	//*  53  117:ifne            122
					flag = true;
	//   54  120:iconst_1        
	//   55  121:istore_2        
				return flag;
	//   56  122:iload_2         
	//   57  123:ireturn         
			} else
			{
				return true;
	//   58  124:iconst_1        
	//   59  125:ireturn         
			}
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   60  126:new             #199 <Class StringBuilder>
	//   61  129:dup             
	//   62  130:invokespecial   #200 <Method void StringBuilder()>
	//   63  133:astore          4
			stringbuilder.append("Inconsistency detected. Invalid view holder adapter position");
	//   64  135:aload           4
	//   65  137:ldc2            #658 <String "Inconsistency detected. Invalid view holder adapter position">
	//   66  140:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   67  143:pop             
			stringbuilder.append(((Object) (r)));
	//   68  144:aload           4
	//   69  146:aload_1         
	//   70  147:invokevirtual   #400 <Method StringBuilder StringBuilder.append(Object)>
	//   71  150:pop             
			stringbuilder.append(exceptionLabel());
	//   72  151:aload           4
	//   73  153:aload_0         
	//   74  154:getfield        #30  <Field RecyclerView this$0>
	//   75  157:invokevirtual   #210 <Method String RecyclerView.exceptionLabel()>
	//   76  160:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   77  163:pop             
			throw new IndexOutOfBoundsException(stringbuilder.toString());
	//   78  164:new             #285 <Class IndexOutOfBoundsException>
	//   79  167:dup             
	//   80  168:aload           4
	//   81  170:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   82  173:invokespecial   #286 <Method void IndexOutOfBoundsException(String)>
	//   83  176:athrow          
		}
	}

	void viewRangeUpdate(int i, int j)
	{
		for(int k = mCachedViews.size() - 1; k >= 0; k--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field ArrayList mCachedViews>
	//*   2    4:invokevirtual   #296 <Method int ArrayList.size()>
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
	//   11   19:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   13   25:astore          5
			if(r == null)
	//*  14   27:aload           5
	//*  15   29:ifnonnull       35
				continue;
	//   16   32:goto            67
			int l = r.mPosition;
	//   17   35:aload           5
	//   18   37:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//   19   40:istore          4
			if(l >= i && l < j + i)
	//*  20   42:iload           4
	//*  21   44:iload_1         
	//*  22   45:icmplt          67
	//*  23   48:iload           4
	//*  24   50:iload_2         
	//*  25   51:iload_1         
	//*  26   52:iadd            
	//*  27   53:icmpge          67
			{
				r.addFlags(2);
	//   28   56:aload           5
	//   29   58:iconst_2        
	//   30   59:invokevirtual   #85  <Method void RecyclerView$ViewHolder.addFlags(int)>
				recycleCachedViewAt(k);
	//   31   62:aload_0         
	//   32   63:iload_3         
	//   33   64:invokevirtual   #372 <Method void recycleCachedViewAt(int)>
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
