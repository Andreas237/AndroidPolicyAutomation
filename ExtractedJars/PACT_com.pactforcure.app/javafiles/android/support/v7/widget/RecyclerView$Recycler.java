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
	//*   4    8:ifnonnull       44
			throw new IllegalArgumentException((new StringBuilder()).append("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter").append(exceptionLabel()).toString());
	//    5   11:new             #199 <Class IllegalArgumentException>
	//    6   14:dup             
	//    7   15:new             #201 <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #202 <Method void StringBuilder()>
	//   10   22:ldc1            #204 <String "The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter">
	//   11   24:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   12   27:aload_0         
	//   13   28:getfield        #30  <Field RecyclerView this$0>
	//   14   31:invokevirtual   #212 <Method String RecyclerView.exceptionLabel()>
	//   15   34:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   16   37:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   17   40:invokespecial   #218 <Method void IllegalArgumentException(String)>
	//   18   43:athrow          
		int j = mAdapterHelper.findPositionOffset(i);
	//   19   44:aload_0         
	//   20   45:getfield        #30  <Field RecyclerView this$0>
	//   21   48:getfield        #222 <Field AdapterHelper RecyclerView.mAdapterHelper>
	//   22   51:iload_2         
	//   23   52:invokevirtual   #228 <Method int AdapterHelper.findPositionOffset(int)>
	//   24   55:istore_3        
		if(j < 0 || j >= mAdapter.getItemCount())
	//*  25   56:iload_3         
	//*  26   57:iflt            74
	//*  27   60:iload_3         
	//*  28   61:aload_0         
	//*  29   62:getfield        #30  <Field RecyclerView this$0>
	//*  30   65:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  31   68:invokevirtual   #231 <Method int RecyclerView$Adapter.getItemCount()>
	//*  32   71:icmplt          143
			throw new IndexOutOfBoundsException((new StringBuilder()).append("Inconsistency detected. Invalid item position ").append(i).append("(offset:").append(j).append(").").append("state:").append(mState.getItemCount()).append(exceptionLabel()).toString());
	//   33   74:new             #233 <Class IndexOutOfBoundsException>
	//   34   77:dup             
	//   35   78:new             #201 <Class StringBuilder>
	//   36   81:dup             
	//   37   82:invokespecial   #202 <Method void StringBuilder()>
	//   38   85:ldc1            #235 <String "Inconsistency detected. Invalid item position ">
	//   39   87:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   40   90:iload_2         
	//   41   91:invokevirtual   #238 <Method StringBuilder StringBuilder.append(int)>
	//   42   94:ldc1            #240 <String "(offset:">
	//   43   96:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   44   99:iload_3         
	//   45  100:invokevirtual   #238 <Method StringBuilder StringBuilder.append(int)>
	//   46  103:ldc1            #242 <String ").">
	//   47  105:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   48  108:ldc1            #244 <String "state:">
	//   49  110:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   50  113:aload_0         
	//   51  114:getfield        #30  <Field RecyclerView this$0>
	//   52  117:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//   53  120:invokevirtual   #245 <Method int RecyclerView$State.getItemCount()>
	//   54  123:invokevirtual   #238 <Method StringBuilder StringBuilder.append(int)>
	//   55  126:aload_0         
	//   56  127:getfield        #30  <Field RecyclerView this$0>
	//   57  130:invokevirtual   #212 <Method String RecyclerView.exceptionLabel()>
	//   58  133:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   59  136:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   60  139:invokespecial   #246 <Method void IndexOutOfBoundsException(String)>
	//   61  142:athrow          
		tryBindViewHolderByDeadline(r, j, i, 0xffffffffL);
	//   62  143:aload_0         
	//   63  144:aload           5
	//   64  146:iload_3         
	//   65  147:iload_2         
	//   66  148:ldc2w           #132 <Long 0xffffffffL>
	//   67  151:invokespecial   #248 <Method boolean tryBindViewHolderByDeadline(RecyclerView$ViewHolder, int, int, long)>
	//   68  154:pop             
		view = ((View) (r.itemView.getLayoutParams()));
	//   69  155:aload           5
	//   70  157:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//   71  160:invokevirtual   #254 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   72  163:astore_1        
		boolean flag;
		if(view == null)
	//*  73  164:aload_1         
	//*  74  165:ifnonnull       220
		{
			view = ((View) ((ams)generateDefaultLayoutParams()));
	//   75  168:aload_0         
	//   76  169:getfield        #30  <Field RecyclerView this$0>
	//   77  172:invokevirtual   #257 <Method android.view.ViewGroup$LayoutParams RecyclerView.generateDefaultLayoutParams()>
	//   78  175:checkcast       #259 <Class RecyclerView$LayoutParams>
	//   79  178:astore_1        
			r.itemView.setLayoutParams(((android.view.) (view)));
	//   80  179:aload           5
	//   81  181:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//   82  184:aload_1         
	//   83  185:invokevirtual   #263 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		} else
	//*  84  188:aload_1         
	//*  85  189:iconst_1        
	//*  86  190:putfield        #267 <Field boolean RecyclerView$LayoutParams.mInsetsDirty>
	//*  87  193:aload_1         
	//*  88  194:aload           5
	//*  89  196:putfield        #271 <Field RecyclerView$ViewHolder RecyclerView$LayoutParams.mViewHolder>
	//*  90  199:aload           5
	//*  91  201:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//*  92  204:invokevirtual   #275 <Method android.view.ViewParent View.getParent()>
	//*  93  207:ifnonnull       263
	//*  94  210:iconst_1        
	//*  95  211:istore          4
	//*  96  213:aload_1         
	//*  97  214:iload           4
	//*  98  216:putfield        #278 <Field boolean RecyclerView$LayoutParams.mPendingInvalidate>
	//*  99  219:return          
		if(!checkLayoutParams(((android.view.) (view))))
	//* 100  220:aload_0         
	//* 101  221:getfield        #30  <Field RecyclerView this$0>
	//* 102  224:aload_1         
	//* 103  225:invokevirtual   #282 <Method boolean RecyclerView.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 104  228:ifne            255
		{
			view = ((View) ((ams)generateLayoutParams(((android.view.) (view)))));
	//  105  231:aload_0         
	//  106  232:getfield        #30  <Field RecyclerView this$0>
	//  107  235:aload_1         
	//  108  236:invokevirtual   #286 <Method android.view.ViewGroup$LayoutParams RecyclerView.generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//  109  239:checkcast       #259 <Class RecyclerView$LayoutParams>
	//  110  242:astore_1        
			r.itemView.setLayoutParams(((android.view.) (view)));
	//  111  243:aload           5
	//  112  245:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//  113  248:aload_1         
	//  114  249:invokevirtual   #263 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		} else
	//* 115  252:goto            188
		{
			view = ((View) ((ams)view));
	//  116  255:aload_1         
	//  117  256:checkcast       #259 <Class RecyclerView$LayoutParams>
	//  118  259:astore_1        
		}
		view.mInsetsDirty = true;
		view.mViewHolder = r;
		if(r.itemView.getParent() == null)
			flag = true;
		else
	//* 119  260:goto            188
			flag = false;
	//  120  263:iconst_0        
	//  121  264:istore          4
		view.mPendingInvalidate = flag;
	//* 122  266:goto            213
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
	//   12   20:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   14   26:invokevirtual   #303 <Method void RecyclerView$ViewHolder.clearOldPosition()>

	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_1        
	//*  19   33:goto            10
		l = mAttachedScrap.size();
	//   20   36:aload_0         
	//   21   37:getfield        #38  <Field ArrayList mAttachedScrap>
	//   22   40:invokevirtual   #296 <Method int ArrayList.size()>
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
	//   32   56:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   33   59:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   34   62:invokevirtual   #303 <Method void RecyclerView$ViewHolder.clearOldPosition()>

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
	//   45   83:invokevirtual   #296 <Method int ArrayList.size()>
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
	//   55   99:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   56  102:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   57  105:invokevirtual   #303 <Method void RecyclerView$ViewHolder.clearOldPosition()>

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
		if(i < 0 || i >= mState.getItemCount())
	//*   0    0:iload_1         
	//*   1    1:iflt            18
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #30  <Field RecyclerView this$0>
	//*   5    9:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//*   6   12:invokevirtual   #245 <Method int RecyclerView$State.getItemCount()>
	//*   7   15:icmplt          81
			throw new IndexOutOfBoundsException((new StringBuilder()).append("invalid position ").append(i).append(". State ").append("item count is ").append(mState.getItemCount()).append(exceptionLabel()).toString());
	//    8   18:new             #233 <Class IndexOutOfBoundsException>
	//    9   21:dup             
	//   10   22:new             #201 <Class StringBuilder>
	//   11   25:dup             
	//   12   26:invokespecial   #202 <Method void StringBuilder()>
	//   13   29:ldc2            #307 <String "invalid position ">
	//   14   32:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:iload_1         
	//   16   36:invokevirtual   #238 <Method StringBuilder StringBuilder.append(int)>
	//   17   39:ldc2            #309 <String ". State ">
	//   18   42:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   19   45:ldc2            #311 <String "item count is ">
	//   20   48:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   21   51:aload_0         
	//   22   52:getfield        #30  <Field RecyclerView this$0>
	//   23   55:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//   24   58:invokevirtual   #245 <Method int RecyclerView$State.getItemCount()>
	//   25   61:invokevirtual   #238 <Method StringBuilder StringBuilder.append(int)>
	//   26   64:aload_0         
	//   27   65:getfield        #30  <Field RecyclerView this$0>
	//   28   68:invokevirtual   #212 <Method String RecyclerView.exceptionLabel()>
	//   29   71:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   30   74:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   31   77:invokespecial   #246 <Method void IndexOutOfBoundsException(String)>
	//   32   80:athrow          
		if(!mState.isPreLayout())
	//*  33   81:aload_0         
	//*  34   82:getfield        #30  <Field RecyclerView this$0>
	//*  35   85:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//*  36   88:invokevirtual   #166 <Method boolean RecyclerView$State.isPreLayout()>
	//*  37   91:ifne            96
			return i;
	//   38   94:iload_1         
	//   39   95:ireturn         
		else
			return mAdapterHelper.findPositionOffset(i);
	//   40   96:aload_0         
	//   41   97:getfield        #30  <Field RecyclerView this$0>
	//   42  100:getfield        #222 <Field AdapterHelper RecyclerView.mAdapterHelper>
	//   43  103:iload_1         
	//   44  104:invokevirtual   #228 <Method int AdapterHelper.findPositionOffset(int)>
	//   45  107:ireturn         
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
	//    5   11:invokevirtual   #296 <Method int ArrayList.size()>
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
	//   19   33:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   20   36:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   21   39:astore          6
			if(!r.wasReturnedFromScrap() && r.getLayoutPosition() == i)
	//*  22   41:aload           6
	//*  23   43:invokevirtual   #335 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//*  24   46:ifne            68
	//*  25   49:aload           6
	//*  26   51:invokevirtual   #338 <Method int RecyclerView$ViewHolder.getLayoutPosition()>
	//*  27   54:iload_1         
	//*  28   55:icmpne          68
			{
				r.addFlags(32);
	//   29   58:aload           6
	//   30   60:bipush          32
	//   31   62:invokevirtual   #85  <Method void RecyclerView$ViewHolder.addFlags(int)>
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
	//*  41   79:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  42   82:invokevirtual   #341 <Method boolean RecyclerView$Adapter.hasStableIds()>
	//*  43   85:ifeq            187
		{
			i = mAdapterHelper.findPositionOffset(i);
	//   44   88:aload_0         
	//   45   89:getfield        #30  <Field RecyclerView this$0>
	//   46   92:getfield        #222 <Field AdapterHelper RecyclerView.mAdapterHelper>
	//   47   95:iload_1         
	//   48   96:invokevirtual   #228 <Method int AdapterHelper.findPositionOffset(int)>
	//   49   99:istore_1        
			if(i > 0 && i < mAdapter.getItemCount())
	//*  50  100:iload_1         
	//*  51  101:ifle            187
	//*  52  104:iload_1         
	//*  53  105:aload_0         
	//*  54  106:getfield        #30  <Field RecyclerView this$0>
	//*  55  109:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  56  112:invokevirtual   #231 <Method int RecyclerView$Adapter.getItemCount()>
	//*  57  115:icmpge          187
			{
				long l = mAdapter.getItemId(i);
	//   58  118:aload_0         
	//   59  119:getfield        #30  <Field RecyclerView this$0>
	//   60  122:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   61  125:iload_1         
	//   62  126:invokevirtual   #345 <Method long RecyclerView$Adapter.getItemId(int)>
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
	//   72  143:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   73  146:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   74  149:astore          6
					if(!r1.wasReturnedFromScrap() && r1.getItemId() == l)
	//*  75  151:aload           6
	//*  76  153:invokevirtual   #335 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//*  77  156:ifne            180
	//*  78  159:aload           6
	//*  79  161:invokevirtual   #347 <Method long RecyclerView$ViewHolder.getItemId()>
	//*  80  164:lload           4
	//*  81  166:lcmp            
	//*  82  167:ifne            180
					{
						r1.addFlags(32);
	//   83  170:aload           6
	//   84  172:bipush          32
	//   85  174:invokevirtual   #85  <Method void RecyclerView$ViewHolder.addFlags(int)>
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
		int j = mAttachedScrap.size() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ArrayList mAttachedScrap>
	//    2    4:invokevirtual   #296 <Method int ArrayList.size()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore          5
_L5:
		if(j < 0) goto _L2; else goto _L1
	//    6   11:iload           5
	//    7   13:iflt            154
_L1:
		r r1;
		r1 = (r)mAttachedScrap.get(j);
	//    8   16:aload_0         
	//    9   17:getfield        #38  <Field ArrayList mAttachedScrap>
	//   10   20:iload           5
	//   11   22:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   12   25:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   13   28:astore          7
		if(r1.getItemId() != l || r1.wasReturnedFromScrap())
			continue; /* Loop/switch isn't completed */
	//   14   30:aload           7
	//   15   32:invokevirtual   #347 <Method long RecyclerView$ViewHolder.getItemId()>
	//   16   35:lload_1         
	//   17   36:lcmp            
	//   18   37:ifne            145
	//   19   40:aload           7
	//   20   42:invokevirtual   #335 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//   21   45:ifne            145
		if(i != r1.getItemViewType()) goto _L4; else goto _L3
	//   22   48:iload_3         
	//   23   49:aload           7
	//   24   51:invokevirtual   #127 <Method int RecyclerView$ViewHolder.getItemViewType()>
	//   25   54:icmpne          108
_L3:
		r r;
		r1.addFlags(32);
	//   26   57:aload           7
	//   27   59:bipush          32
	//   28   61:invokevirtual   #85  <Method void RecyclerView$ViewHolder.addFlags(int)>
		r = r1;
	//   29   64:aload           7
	//   30   66:astore          6
		if(r1.isRemoved())
	//*  31   68:aload           7
	//*  32   70:invokevirtual   #358 <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*  33   73:ifeq            105
		{
			r = r1;
	//   34   76:aload           7
	//   35   78:astore          6
			if(!mState.isPreLayout())
	//*  36   80:aload_0         
	//*  37   81:getfield        #30  <Field RecyclerView this$0>
	//*  38   84:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//*  39   87:invokevirtual   #166 <Method boolean RecyclerView$State.isPreLayout()>
	//*  40   90:ifne            105
			{
				r1.setFlags(2, 14);
	//   41   93:aload           7
	//   42   95:iconst_2        
	//   43   96:bipush          14
	//   44   98:invokevirtual   #182 <Method void RecyclerView$ViewHolder.setFlags(int, int)>
				r = r1;
	//   45  101:aload           7
	//   46  103:astore          6
			}
		}
_L8:
		return r;
	//   47  105:aload           6
	//   48  107:areturn         
_L4:
		if(!flag)
	//*  49  108:iload           4
	//*  50  110:ifne            145
		{
			mAttachedScrap.remove(j);
	//   51  113:aload_0         
	//   52  114:getfield        #38  <Field ArrayList mAttachedScrap>
	//   53  117:iload           5
	//   54  119:invokevirtual   #361 <Method Object ArrayList.remove(int)>
	//   55  122:pop             
			removeDetachedView(r1.itemView, false);
	//   56  123:aload_0         
	//   57  124:getfield        #30  <Field RecyclerView this$0>
	//   58  127:aload           7
	//   59  129:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//   60  132:iconst_0        
	//   61  133:invokevirtual   #365 <Method void RecyclerView.removeDetachedView(View, boolean)>
			quickRecycleScrapView(r1.itemView);
	//   62  136:aload_0         
	//   63  137:aload           7
	//   64  139:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//   65  142:invokevirtual   #369 <Method void quickRecycleScrapView(View)>
		}
		j--;
	//   66  145:iload           5
	//   67  147:iconst_1        
	//   68  148:isub            
	//   69  149:istore          5
		  goto _L5
	//*  70  151:goto            11
_L2:
		j = mCachedViews.size() - 1;
	//   71  154:aload_0         
	//   72  155:getfield        #42  <Field ArrayList mCachedViews>
	//   73  158:invokevirtual   #296 <Method int ArrayList.size()>
	//   74  161:iconst_1        
	//   75  162:isub            
	//   76  163:istore          5
_L9:
		if(j < 0) goto _L7; else goto _L6
	//   77  165:iload           5
	//   78  167:iflt            247
_L6:
label0:
		{
			r r2 = (r)mCachedViews.get(j);
	//   79  170:aload_0         
	//   80  171:getfield        #42  <Field ArrayList mCachedViews>
	//   81  174:iload           5
	//   82  176:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   83  179:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   84  182:astore          7
			if(r2.getItemId() != l)
				continue; /* Loop/switch isn't completed */
	//   85  184:aload           7
	//   86  186:invokevirtual   #347 <Method long RecyclerView$ViewHolder.getItemId()>
	//   87  189:lload_1         
	//   88  190:lcmp            
	//   89  191:ifne            238
			if(i != r2.getItemViewType())
				break label0;
	//   90  194:iload_3         
	//   91  195:aload           7
	//   92  197:invokevirtual   #127 <Method int RecyclerView$ViewHolder.getItemViewType()>
	//   93  200:icmpne          225
			r = r2;
	//   94  203:aload           7
	//   95  205:astore          6
			if(!flag)
	//*  96  207:iload           4
	//*  97  209:ifne            105
			{
				mCachedViews.remove(j);
	//   98  212:aload_0         
	//   99  213:getfield        #42  <Field ArrayList mCachedViews>
	//  100  216:iload           5
	//  101  218:invokevirtual   #361 <Method Object ArrayList.remove(int)>
	//  102  221:pop             
				return r2;
	//  103  222:aload           7
	//  104  224:areturn         
			}
		}
		  goto _L8
		if(!flag)
	//* 105  225:iload           4
	//* 106  227:ifne            238
		{
			recycleCachedViewAt(j);
	//  107  230:aload_0         
	//  108  231:iload           5
	//  109  233:invokevirtual   #372 <Method void recycleCachedViewAt(int)>
			return null;
	//  110  236:aconst_null     
	//  111  237:areturn         
		}
		j--;
	//  112  238:iload           5
	//  113  240:iconst_1        
	//  114  241:isub            
	//  115  242:istore          5
		  goto _L9
	//* 116  244:goto            165
_L7:
		return null;
	//  117  247:aconst_null     
	//  118  248:areturn         
		  goto _L8
	}

	r getScrapOrHiddenOrCachedHolderForPosition(int i, boolean flag)
	{
		int j;
		int l;
		l = mAttachedScrap.size();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ArrayList mAttachedScrap>
	//    2    4:invokevirtual   #296 <Method int ArrayList.size()>
	//    3    7:istore          4
		j = 0;
	//    4    9:iconst_0        
	//    5   10:istore_3        
_L8:
		if(j >= l) goto _L2; else goto _L1
	//    6   11:iload_3         
	//    7   12:iload           4
	//    8   14:icmpge          93
_L1:
		Object obj = ((Object) ((r)mAttachedScrap.get(j)));
	//    9   17:aload_0         
	//   10   18:getfield        #38  <Field ArrayList mAttachedScrap>
	//   11   21:iload_3         
	//   12   22:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   13   25:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   14   28:astore          5
		if(((r) (obj)).wasReturnedFromScrap() || ((r) (obj)).getLayoutPosition() != i || ((r) (obj)).isInvalid() || !mState.mInPreLayout && ((r) (obj)).isRemoved()) goto _L4; else goto _L3
	//   15   30:aload           5
	//   16   32:invokevirtual   #335 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//   17   35:ifne            86
	//   18   38:aload           5
	//   19   40:invokevirtual   #338 <Method int RecyclerView$ViewHolder.getLayoutPosition()>
	//   20   43:iload_1         
	//   21   44:icmpne          86
	//   22   47:aload           5
	//   23   49:invokevirtual   #377 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//   24   52:ifne            86
	//   25   55:aload_0         
	//   26   56:getfield        #30  <Field RecyclerView this$0>
	//   27   59:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//   28   62:getfield        #380 <Field boolean RecyclerView$State.mInPreLayout>
	//   29   65:ifne            76
	//   30   68:aload           5
	//   31   70:invokevirtual   #358 <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//   32   73:ifne            86
_L3:
		((r) (obj)).addFlags(32);
	//   33   76:aload           5
	//   34   78:bipush          32
	//   35   80:invokevirtual   #85  <Method void RecyclerView$ViewHolder.addFlags(int)>
_L6:
		return ((r) (obj));
	//   36   83:aload           5
	//   37   85:areturn         
_L4:
		j++;
	//   38   86:iload_3         
	//   39   87:iconst_1        
	//   40   88:iadd            
	//   41   89:istore_3        
		continue; /* Loop/switch isn't completed */
	//   42   90:goto            11
_L2:
		if(!flag)
	//*  43   93:iload_2         
	//*  44   94:ifne            219
		{
			obj = ((Object) (mChildHelper.findHiddenNonRemovedView(i)));
	//   45   97:aload_0         
	//   46   98:getfield        #30  <Field RecyclerView this$0>
	//   47  101:getfield        #384 <Field ChildHelper RecyclerView.mChildHelper>
	//   48  104:iload_1         
	//   49  105:invokevirtual   #389 <Method View ChildHelper.findHiddenNonRemovedView(int)>
	//   50  108:astore          5
			if(obj != null)
	//*  51  110:aload           5
	//*  52  112:ifnull          219
			{
				r r = RecyclerView.getChildViewHolderInt(((View) (obj)));
	//   53  115:aload           5
	//   54  117:invokestatic    #197 <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//   55  120:astore          6
				mChildHelper.unhide(((View) (obj)));
	//   56  122:aload_0         
	//   57  123:getfield        #30  <Field RecyclerView this$0>
	//   58  126:getfield        #384 <Field ChildHelper RecyclerView.mChildHelper>
	//   59  129:aload           5
	//   60  131:invokevirtual   #392 <Method void ChildHelper.unhide(View)>
				i = mChildHelper.indexOfChild(((View) (obj)));
	//   61  134:aload_0         
	//   62  135:getfield        #30  <Field RecyclerView this$0>
	//   63  138:getfield        #384 <Field ChildHelper RecyclerView.mChildHelper>
	//   64  141:aload           5
	//   65  143:invokevirtual   #395 <Method int ChildHelper.indexOfChild(View)>
	//   66  146:istore_1        
				if(i == -1)
	//*  67  147:iload_1         
	//*  68  148:iconst_m1       
	//*  69  149:icmpne          191
				{
					throw new IllegalStateException((new StringBuilder()).append("layout index should not be -1 after unhiding a view:").append(((Object) (r))).append(exceptionLabel()).toString());
	//   70  152:new             #397 <Class IllegalStateException>
	//   71  155:dup             
	//   72  156:new             #201 <Class StringBuilder>
	//   73  159:dup             
	//   74  160:invokespecial   #202 <Method void StringBuilder()>
	//   75  163:ldc2            #399 <String "layout index should not be -1 after unhiding a view:">
	//   76  166:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   77  169:aload           6
	//   78  171:invokevirtual   #402 <Method StringBuilder StringBuilder.append(Object)>
	//   79  174:aload_0         
	//   80  175:getfield        #30  <Field RecyclerView this$0>
	//   81  178:invokevirtual   #212 <Method String RecyclerView.exceptionLabel()>
	//   82  181:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   83  184:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   84  187:invokespecial   #403 <Method void IllegalStateException(String)>
	//   85  190:athrow          
				} else
				{
					mChildHelper.detachViewFromParent(i);
	//   86  191:aload_0         
	//   87  192:getfield        #30  <Field RecyclerView this$0>
	//   88  195:getfield        #384 <Field ChildHelper RecyclerView.mChildHelper>
	//   89  198:iload_1         
	//   90  199:invokevirtual   #406 <Method void ChildHelper.detachViewFromParent(int)>
					scrapView(((View) (obj)));
	//   91  202:aload_0         
	//   92  203:aload           5
	//   93  205:invokevirtual   #409 <Method void scrapView(View)>
					r.addFlags(8224);
	//   94  208:aload           6
	//   95  210:sipush          8224
	//   96  213:invokevirtual   #85  <Method void RecyclerView$ViewHolder.addFlags(int)>
					return r;
	//   97  216:aload           6
	//   98  218:areturn         
				}
			}
		}
		int i1 = mCachedViews.size();
	//   99  219:aload_0         
	//  100  220:getfield        #42  <Field ArrayList mCachedViews>
	//  101  223:invokevirtual   #296 <Method int ArrayList.size()>
	//  102  226:istore          4
		int k = 0;
	//  103  228:iconst_0        
	//  104  229:istore_3        
label0:
		do
		{
label1:
			{
label2:
				{
					if(k >= i1)
						break label1;
	//  105  230:iload_3         
	//  106  231:iload           4
	//  107  233:icmpge          293
					r r1 = (r)mCachedViews.get(k);
	//  108  236:aload_0         
	//  109  237:getfield        #42  <Field ArrayList mCachedViews>
	//  110  240:iload_3         
	//  111  241:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//  112  244:checkcast       #63  <Class RecyclerView$ViewHolder>
	//  113  247:astore          6
					if(r1.isInvalid() || r1.getLayoutPosition() != i)
						break label2;
	//  114  249:aload           6
	//  115  251:invokevirtual   #377 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//  116  254:ifne            286
	//  117  257:aload           6
	//  118  259:invokevirtual   #338 <Method int RecyclerView$ViewHolder.getLayoutPosition()>
	//  119  262:iload_1         
	//  120  263:icmpne          286
					obj = ((Object) (r1));
	//  121  266:aload           6
	//  122  268:astore          5
					if(!flag)
	//* 123  270:iload_2         
	//* 124  271:ifne            83
					{
						mCachedViews.remove(k);
	//  125  274:aload_0         
	//  126  275:getfield        #42  <Field ArrayList mCachedViews>
	//  127  278:iload_3         
	//  128  279:invokevirtual   #361 <Method Object ArrayList.remove(int)>
	//  129  282:pop             
						return r1;
	//  130  283:aload           6
	//  131  285:areturn         
					}
				}
				if(true)
					break label0;
				k++;
	//  132  286:iload_3         
	//  133  287:iconst_1        
	//  134  288:iadd            
	//  135  289:istore_3        
			}
		} while(true);
	//  136  290:goto            230
		if(true) goto _L6; else goto _L5
_L5:
		return null;
	//  137  293:aconst_null     
	//  138  294:areturn         
		if(true) goto _L8; else goto _L7
_L7:
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
	//   15   29:invokevirtual   #254 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   16   32:checkcast       #259 <Class RecyclerView$LayoutParams>
	//   17   35:astore_3        
			if(ams != null)
	//*  18   36:aload_3         
	//*  19   37:ifnull          45
				ams.mInsetsDirty = true;
	//   20   40:aload_3         
	//   21   41:iconst_1        
	//   22   42:putfield        #267 <Field boolean RecyclerView$LayoutParams.mInsetsDirty>
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
	//*   2    4:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*   3    7:ifnull          72
	//*   4   10:aload_0         
	//*   5   11:getfield        #30  <Field RecyclerView this$0>
	//*   6   14:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*   7   17:invokevirtual   #341 <Method boolean RecyclerView$Adapter.hasStableIds()>
	//*   8   20:ifeq            72
		{
			int j = mCachedViews.size();
	//    9   23:aload_0         
	//   10   24:getfield        #42  <Field ArrayList mCachedViews>
	//   11   27:invokevirtual   #296 <Method int ArrayList.size()>
	//   12   30:istore_2        
			for(int i = 0; i < j; i++)
	//*  13   31:iconst_0        
	//*  14   32:istore_1        
	//*  15   33:iload_1         
	//*  16   34:iload_2         
	//*  17   35:icmpge          76
			{
				r r = (r)mCachedViews.get(i);
	//   18   38:aload_0         
	//   19   39:getfield        #42  <Field ArrayList mCachedViews>
	//   20   42:iload_1         
	//   21   43:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   22   46:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   23   49:astore_3        
				if(r != null)
	//*  24   50:aload_3         
	//*  25   51:ifnull          65
				{
					r.addFlags(6);
	//   26   54:aload_3         
	//   27   55:bipush          6
	//   28   57:invokevirtual   #85  <Method void RecyclerView$ViewHolder.addFlags(int)>
					r.addChangePayload(((Object) (null)));
	//   29   60:aload_3         
	//   30   61:aconst_null     
	//   31   62:invokevirtual   #424 <Method void RecyclerView$ViewHolder.addChangePayload(Object)>
				}
			}

	//   32   65:iload_1         
	//   33   66:iconst_1        
	//   34   67:iadd            
	//   35   68:istore_1        
		} else
	//*  36   69:goto            33
		{
			recycleAndClearCachedViews();
	//   37   72:aload_0         
	//   38   73:invokevirtual   #292 <Method void recycleAndClearCachedViews()>
		}
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
		byte byte0;
		int l;
		int i1;
		int j1;
		if(i < j)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmpge          79
		{
			l = i;
	//    3    5:iload_1         
	//    4    6:istore          5
			k = j;
	//    5    8:iload_2         
	//    6    9:istore_3        
			byte0 = -1;
	//    7   10:iconst_m1       
	//    8   11:istore          4
		} else
	//*   9   13:aload_0         
	//*  10   14:getfield        #42  <Field ArrayList mCachedViews>
	//*  11   17:invokevirtual   #296 <Method int ArrayList.size()>
	//*  12   20:istore          7
	//*  13   22:iconst_0        
	//*  14   23:istore          6
	//*  15   25:iload           6
	//*  16   27:iload           7
	//*  17   29:icmpge          122
	//*  18   32:aload_0         
	//*  19   33:getfield        #42  <Field ArrayList mCachedViews>
	//*  20   36:iload           6
	//*  21   38:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//*  22   41:checkcast       #63  <Class RecyclerView$ViewHolder>
	//*  23   44:astore          8
	//*  24   46:aload           8
	//*  25   48:ifnull          70
	//*  26   51:aload           8
	//*  27   53:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//*  28   56:iload           5
	//*  29   58:icmplt          70
	//*  30   61:aload           8
	//*  31   63:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//*  32   66:iload_3         
	//*  33   67:icmple          90
	//*  34   70:iload           6
	//*  35   72:iconst_1        
	//*  36   73:iadd            
	//*  37   74:istore          6
	//*  38   76:goto            25
		{
			l = j;
	//   39   79:iload_2         
	//   40   80:istore          5
			k = i;
	//   41   82:iload_1         
	//   42   83:istore_3        
			byte0 = 1;
	//   43   84:iconst_1        
	//   44   85:istore          4
		}
		j1 = mCachedViews.size();
		i1 = 0;
		while(i1 < j1) 
		{
			r r = (r)mCachedViews.get(i1);
			if(r != null && r.mPosition >= l && r.mPosition <= k)
	//*  45   87:goto            13
				if(r.mPosition == i)
	//*  46   90:aload           8
	//*  47   92:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//*  48   95:iload_1         
	//*  49   96:icmpne          111
					r.offsetPosition(j - i, false);
	//   50   99:aload           8
	//   51  101:iload_2         
	//   52  102:iload_1         
	//   53  103:isub            
	//   54  104:iconst_0        
	//   55  105:invokevirtual   #432 <Method void RecyclerView$ViewHolder.offsetPosition(int, boolean)>
				else
	//*  56  108:goto            70
					r.offsetPosition(((int) (byte0)), false);
	//   57  111:aload           8
	//   58  113:iload           4
	//   59  115:iconst_0        
	//   60  116:invokevirtual   #432 <Method void RecyclerView$ViewHolder.offsetPosition(int, boolean)>
			i1++;
		}
	//*  61  119:goto            70
	//   62  122:return          
	}

	void offsetPositionRecordsForRemove(int i, int j, boolean flag)
	{
		int k = mCachedViews.size() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field ArrayList mCachedViews>
	//    2    4:invokevirtual   #296 <Method int ArrayList.size()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore          4
		while(k >= 0) 
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
			if(r != null)
	//*  14   30:aload           5
	//*  15   32:ifnull          54
				if(r.mPosition >= i + j)
	//*  16   35:aload           5
	//*  17   37:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//*  18   40:iload_1         
	//*  19   41:iload_2         
	//*  20   42:iadd            
	//*  21   43:icmplt          63
					r.offsetPosition(-j, flag);
	//   22   46:aload           5
	//   23   48:iload_2         
	//   24   49:ineg            
	//   25   50:iload_3         
	//   26   51:invokevirtual   #432 <Method void RecyclerView$ViewHolder.offsetPosition(int, boolean)>
				else
	//*  27   54:iload           4
	//*  28   56:iconst_1        
	//*  29   57:isub            
	//*  30   58:istore          4
	//*  31   60:goto            11
				if(r.mPosition >= i)
	//*  32   63:aload           5
	//*  33   65:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//*  34   68:iload_1         
	//*  35   69:icmplt          54
				{
					r.addFlags(8);
	//   36   72:aload           5
	//   37   74:bipush          8
	//   38   76:invokevirtual   #85  <Method void RecyclerView$ViewHolder.addFlags(int)>
					recycleCachedViewAt(k);
	//   39   79:aload_0         
	//   40   80:iload           4
	//   41   82:invokevirtual   #372 <Method void recycleCachedViewAt(int)>
				}
			k--;
		}
	//*  42   85:goto            54
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
		r r;
		r = RecyclerView.getChildViewHolderInt(view);
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
		if(!r.isScrap()) goto _L2; else goto _L1
	//   11   21:aload_2         
	//   12   22:invokevirtual   #475 <Method boolean RecyclerView$ViewHolder.isScrap()>
	//   13   25:ifeq            38
_L1:
		r.unScrap();
	//   14   28:aload_2         
	//   15   29:invokevirtual   #478 <Method void RecyclerView$ViewHolder.unScrap()>
_L4:
		recycleViewHolderInternal(r);
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:invokevirtual   #454 <Method void recycleViewHolderInternal(RecyclerView$ViewHolder)>
		return;
	//   19   37:return          
_L2:
		if(r.wasReturnedFromScrap())
	//*  20   38:aload_2         
	//*  21   39:invokevirtual   #335 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//*  22   42:ifeq            32
			r.clearReturnedFromScrapFlag();
	//   23   45:aload_2         
	//   24   46:invokevirtual   #451 <Method void RecyclerView$ViewHolder.clearReturnedFromScrapFlag()>
		if(true) goto _L4; else goto _L3
	//   25   49:goto            32
_L3:
	}

	void recycleViewHolderInternal(r r)
	{
		int i;
		boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
		if(r.isScrap() || r.itemView.getParent() != null)
	//*   2    3:aload_1         
	//*   3    4:invokevirtual   #475 <Method boolean RecyclerView$ViewHolder.isScrap()>
	//*   4    7:ifne            20
	//*   5   10:aload_1         
	//*   6   11:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//*   7   14:invokevirtual   #275 <Method android.view.ViewParent View.getParent()>
	//*   8   17:ifnull          89
		{
			StringBuilder stringbuilder = (new StringBuilder()).append("Scrapped or attached views may not be recycled. isScrap:").append(r.isScrap()).append(" isAttached:");
	//    9   20:new             #201 <Class StringBuilder>
	//   10   23:dup             
	//   11   24:invokespecial   #202 <Method void StringBuilder()>
	//   12   27:ldc2            #480 <String "Scrapped or attached views may not be recycled. isScrap:">
	//   13   30:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   14   33:aload_1         
	//   15   34:invokevirtual   #475 <Method boolean RecyclerView$ViewHolder.isScrap()>
	//   16   37:invokevirtual   #483 <Method StringBuilder StringBuilder.append(boolean)>
	//   17   40:ldc2            #485 <String " isAttached:">
	//   18   43:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   19   46:astore          8
			if(r.itemView.getParent() != null)
	//*  20   48:aload_1         
	//*  21   49:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//*  22   52:invokevirtual   #275 <Method android.view.ViewParent View.getParent()>
	//*  23   55:ifnull          61
				flag2 = true;
	//   24   58:iconst_1        
	//   25   59:istore          7
			throw new IllegalArgumentException(stringbuilder.append(flag2).append(exceptionLabel()).toString());
	//   26   61:new             #199 <Class IllegalArgumentException>
	//   27   64:dup             
	//   28   65:aload           8
	//   29   67:iload           7
	//   30   69:invokevirtual   #483 <Method StringBuilder StringBuilder.append(boolean)>
	//   31   72:aload_0         
	//   32   73:getfield        #30  <Field RecyclerView this$0>
	//   33   76:invokevirtual   #212 <Method String RecyclerView.exceptionLabel()>
	//   34   79:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   35   82:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   36   85:invokespecial   #218 <Method void IllegalArgumentException(String)>
	//   37   88:athrow          
		}
		if(r.isTmpDetached())
	//*  38   89:aload_1         
	//*  39   90:invokevirtual   #472 <Method boolean RecyclerView$ViewHolder.isTmpDetached()>
	//*  40   93:ifeq            134
			throw new IllegalArgumentException((new StringBuilder()).append("Tmp detached view should be removed from RecyclerView before it can be recycled: ").append(((Object) (r))).append(exceptionLabel()).toString());
	//   41   96:new             #199 <Class IllegalArgumentException>
	//   42   99:dup             
	//   43  100:new             #201 <Class StringBuilder>
	//   44  103:dup             
	//   45  104:invokespecial   #202 <Method void StringBuilder()>
	//   46  107:ldc2            #487 <String "Tmp detached view should be removed from RecyclerView before it can be recycled: ">
	//   47  110:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   48  113:aload_1         
	//   49  114:invokevirtual   #402 <Method StringBuilder StringBuilder.append(Object)>
	//   50  117:aload_0         
	//   51  118:getfield        #30  <Field RecyclerView this$0>
	//   52  121:invokevirtual   #212 <Method String RecyclerView.exceptionLabel()>
	//   53  124:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   54  127:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   55  130:invokespecial   #218 <Method void IllegalArgumentException(String)>
	//   56  133:athrow          
		if(r.shouldIgnore())
	//*  57  134:aload_1         
	//*  58  135:invokevirtual   #490 <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//*  59  138:ifeq            175
			throw new IllegalArgumentException((new StringBuilder()).append("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.").append(exceptionLabel()).toString());
	//   60  141:new             #199 <Class IllegalArgumentException>
	//   61  144:dup             
	//   62  145:new             #201 <Class StringBuilder>
	//   63  148:dup             
	//   64  149:invokespecial   #202 <Method void StringBuilder()>
	//   65  152:ldc2            #492 <String "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.">
	//   66  155:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   67  158:aload_0         
	//   68  159:getfield        #30  <Field RecyclerView this$0>
	//   69  162:invokevirtual   #212 <Method String RecyclerView.exceptionLabel()>
	//   70  165:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   71  168:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   72  171:invokespecial   #218 <Method void IllegalArgumentException(String)>
	//   73  174:athrow          
		flag2 = r.access._mth900(r);
	//   74  175:aload_1         
	//   75  176:invokestatic    #496 <Method boolean RecyclerView$ViewHolder.access$900(RecyclerView$ViewHolder)>
	//   76  179:istore          7
		int j;
		int k;
		boolean flag;
		boolean flag1;
		if(mAdapter != null && flag2 && mAdapter.onFailedToRecycleView(r))
	//*  77  181:aload_0         
	//*  78  182:getfield        #30  <Field RecyclerView this$0>
	//*  79  185:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  80  188:ifnull          435
	//*  81  191:iload           7
	//*  82  193:ifeq            435
	//*  83  196:aload_0         
	//*  84  197:getfield        #30  <Field RecyclerView this$0>
	//*  85  200:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  86  203:aload_1         
	//*  87  204:invokevirtual   #499 <Method boolean RecyclerView$Adapter.onFailedToRecycleView(RecyclerView$ViewHolder)>
	//*  88  207:ifeq            435
			i = 1;
	//   89  210:iconst_1        
	//   90  211:istore_2        
		else
	//*  91  212:iconst_0        
	//*  92  213:istore_3        
	//*  93  214:iconst_0        
	//*  94  215:istore          6
	//*  95  217:iconst_0        
	//*  96  218:istore          5
	//*  97  220:iload_2         
	//*  98  221:ifne            235
	//*  99  224:iload           5
	//* 100  226:istore          4
	//* 101  228:aload_1         
	//* 102  229:invokevirtual   #502 <Method boolean RecyclerView$ViewHolder.isRecyclable()>
	//* 103  232:ifeq            404
	//* 104  235:iload           6
	//* 105  237:istore_2        
	//* 106  238:aload_0         
	//* 107  239:getfield        #54  <Field int mViewCacheMax>
	//* 108  242:ifle            383
	//* 109  245:iload           6
	//* 110  247:istore_2        
	//* 111  248:aload_1         
	//* 112  249:sipush          526
	//* 113  252:invokevirtual   #178 <Method boolean RecyclerView$ViewHolder.hasAnyOfTheFlags(int)>
	//* 114  255:ifne            383
	//* 115  258:aload_0         
	//* 116  259:getfield        #42  <Field ArrayList mCachedViews>
	//* 117  262:invokevirtual   #296 <Method int ArrayList.size()>
	//* 118  265:istore_3        
	//* 119  266:iload_3         
	//* 120  267:istore_2        
	//* 121  268:iload_3         
	//* 122  269:aload_0         
	//* 123  270:getfield        #54  <Field int mViewCacheMax>
	//* 124  273:icmplt          291
	//* 125  276:iload_3         
	//* 126  277:istore_2        
	//* 127  278:iload_3         
	//* 128  279:ifle            291
	//* 129  282:aload_0         
	//* 130  283:iconst_0        
	//* 131  284:invokevirtual   #372 <Method void recycleCachedViewAt(int)>
	//* 132  287:iload_3         
	//* 133  288:iconst_1        
	//* 134  289:isub            
	//* 135  290:istore_2        
	//* 136  291:iload_2         
	//* 137  292:istore_3        
	//* 138  293:iload_3         
	//* 139  294:istore          4
	//* 140  296:invokestatic    #457 <Method boolean RecyclerView.access$800()>
	//* 141  299:ifeq            371
	//* 142  302:iload_3         
	//* 143  303:istore          4
	//* 144  305:iload_2         
	//* 145  306:ifle            371
	//* 146  309:iload_3         
	//* 147  310:istore          4
	//* 148  312:aload_0         
	//* 149  313:getfield        #30  <Field RecyclerView this$0>
	//* 150  316:getfield        #461 <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//* 151  319:aload_1         
	//* 152  320:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//* 153  323:invokevirtual   #505 <Method boolean GapWorker$LayoutPrefetchRegistryImpl.lastPrefetchIncludedPosition(int)>
	//* 154  326:ifne            371
	//* 155  329:iload_2         
	//* 156  330:iconst_1        
	//* 157  331:isub            
	//* 158  332:istore_2        
	//* 159  333:iload_2         
	//* 160  334:iflt            366
	//* 161  337:aload_0         
	//* 162  338:getfield        #42  <Field ArrayList mCachedViews>
	//* 163  341:iload_2         
	//* 164  342:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//* 165  345:checkcast       #63  <Class RecyclerView$ViewHolder>
	//* 166  348:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//* 167  351:istore_3        
	//* 168  352:aload_0         
	//* 169  353:getfield        #30  <Field RecyclerView this$0>
	//* 170  356:getfield        #461 <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//* 171  359:iload_3         
	//* 172  360:invokevirtual   #505 <Method boolean GapWorker$LayoutPrefetchRegistryImpl.lastPrefetchIncludedPosition(int)>
	//* 173  363:ifne            440
	//* 174  366:iload_2         
	//* 175  367:iconst_1        
	//* 176  368:iadd            
	//* 177  369:istore          4
	//* 178  371:aload_0         
	//* 179  372:getfield        #42  <Field ArrayList mCachedViews>
	//* 180  375:iload           4
	//* 181  377:aload_1         
	//* 182  378:invokevirtual   #509 <Method void ArrayList.add(int, Object)>
	//* 183  381:iconst_1        
	//* 184  382:istore_2        
	//* 185  383:iload_2         
	//* 186  384:istore_3        
	//* 187  385:iload           5
	//* 188  387:istore          4
	//* 189  389:iload_2         
	//* 190  390:ifne            404
	//* 191  393:aload_0         
	//* 192  394:aload_1         
	//* 193  395:iconst_1        
	//* 194  396:invokevirtual   #468 <Method void addViewHolderToRecycledViewPool(RecyclerView$ViewHolder, boolean)>
	//* 195  399:iconst_1        
	//* 196  400:istore          4
	//* 197  402:iload_2         
	//* 198  403:istore_3        
	//* 199  404:aload_0         
	//* 200  405:getfield        #30  <Field RecyclerView this$0>
	//* 201  408:getfield        #325 <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//* 202  411:aload_1         
	//* 203  412:invokevirtual   #330 <Method void ViewInfoStore.removeViewHolder(RecyclerView$ViewHolder)>
	//* 204  415:iload_3         
	//* 205  416:ifne            434
	//* 206  419:iload           4
	//* 207  421:ifne            434
	//* 208  424:iload           7
	//* 209  426:ifeq            434
	//* 210  429:aload_1         
	//* 211  430:aconst_null     
	//* 212  431:putfield        #124 <Field RecyclerView RecyclerView$ViewHolder.mOwnerRecyclerView>
	//* 213  434:return          
			i = 0;
	//  214  435:iconst_0        
	//  215  436:istore_2        
		j = 0;
		flag1 = false;
		flag = false;
		if(i != 0) goto _L2; else goto _L1
_L1:
		k = ((int) (flag));
		if(!r.isRecyclable()) goto _L3; else goto _L2
_L2:
		i = ((int) (flag1));
		if(mViewCacheMax <= 0) goto _L5; else goto _L4
_L4:
		i = ((int) (flag1));
		if(r.hasAnyOfTheFlags(526)) goto _L5; else goto _L6
_L6:
		j = mCachedViews.size();
		i = j;
		if(j >= mViewCacheMax)
		{
			i = j;
			if(j > 0)
			{
				recycleCachedViewAt(0);
				i = j - 1;
			}
		}
		j = i;
		k = j;
		if(!RecyclerView.access$800()) goto _L8; else goto _L7
_L7:
		k = j;
		if(i <= 0) goto _L8; else goto _L9
_L9:
		k = j;
		if(mPrefetchRegistry.lastPrefetchIncludedPosition(r.mPosition)) goto _L8; else goto _L10
_L10:
		i--;
_L15:
		if(i < 0) goto _L12; else goto _L11
_L11:
		j = ((r)mCachedViews.get(i)).mPosition;
		if(mPrefetchRegistry.lastPrefetchIncludedPosition(j)) goto _L13; else goto _L12
_L12:
		k = i + 1;
_L8:
		mCachedViews.add(k, ((Object) (r)));
		i = 1;
_L5:
		j = i;
		k = ((int) (flag));
		if(i == 0)
		{
			addViewHolderToRecycledViewPool(r, true);
			k = 1;
			j = i;
		}
_L3:
		mViewInfoStore.removeViewHolder(r);
		if(j == 0 && k == 0 && flag2)
			r.mOwnerRecyclerView = null;
		return;
	//* 216  437:goto            212
_L13:
		i--;
	//  217  440:iload_2         
	//  218  441:iconst_1        
	//  219  442:isub            
	//  220  443:istore_2        
		if(true) goto _L15; else goto _L14
	//  221  444:goto            333
_L14:
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
		if(((r) (view)).hasAnyOfTheFlags(12) || !((r) (view)).isUpdated() || canReuseUpdatedViewHolder(((r) (view))))
	//*   3    5:aload_1         
	//*   4    6:bipush          12
	//*   5    8:invokevirtual   #178 <Method boolean RecyclerView$ViewHolder.hasAnyOfTheFlags(int)>
	//*   6   11:ifne            32
	//*   7   14:aload_1         
	//*   8   15:invokevirtual   #513 <Method boolean RecyclerView$ViewHolder.isUpdated()>
	//*   9   18:ifeq            32
	//*  10   21:aload_0         
	//*  11   22:getfield        #30  <Field RecyclerView this$0>
	//*  12   25:aload_1         
	//*  13   26:invokevirtual   #516 <Method boolean RecyclerView.canReuseUpdatedViewHolder(RecyclerView$ViewHolder)>
	//*  14   29:ifeq            109
			if(((r) (view)).isInvalid() && !((r) (view)).isRemoved() && !mAdapter.hasStableIds())
	//*  15   32:aload_1         
	//*  16   33:invokevirtual   #377 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//*  17   36:ifeq            93
	//*  18   39:aload_1         
	//*  19   40:invokevirtual   #358 <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*  20   43:ifne            93
	//*  21   46:aload_0         
	//*  22   47:getfield        #30  <Field RecyclerView this$0>
	//*  23   50:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  24   53:invokevirtual   #341 <Method boolean RecyclerView$Adapter.hasStableIds()>
	//*  25   56:ifne            93
			{
				throw new IllegalArgumentException((new StringBuilder()).append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.").append(exceptionLabel()).toString());
	//   26   59:new             #199 <Class IllegalArgumentException>
	//   27   62:dup             
	//   28   63:new             #201 <Class StringBuilder>
	//   29   66:dup             
	//   30   67:invokespecial   #202 <Method void StringBuilder()>
	//   31   70:ldc2            #518 <String "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.">
	//   32   73:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   33   76:aload_0         
	//   34   77:getfield        #30  <Field RecyclerView this$0>
	//   35   80:invokevirtual   #212 <Method String RecyclerView.exceptionLabel()>
	//   36   83:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   37   86:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   38   89:invokespecial   #218 <Method void IllegalArgumentException(String)>
	//   39   92:athrow          
			} else
			{
				((r) (view)).setScrapContainer(this, false);
	//   40   93:aload_1         
	//   41   94:aload_0         
	//   42   95:iconst_0        
	//   43   96:invokevirtual   #522 <Method void RecyclerView$ViewHolder.setScrapContainer(RecyclerView$Recycler, boolean)>
				mAttachedScrap.add(((Object) (view)));
	//   44   99:aload_0         
	//   45  100:getfield        #38  <Field ArrayList mAttachedScrap>
	//   46  103:aload_1         
	//   47  104:invokevirtual   #525 <Method boolean ArrayList.add(Object)>
	//   48  107:pop             
				return;
	//   49  108:return          
			}
		if(mChangedScrap == null)
	//*  50  109:aload_0         
	//*  51  110:getfield        #40  <Field ArrayList mChangedScrap>
	//*  52  113:ifnonnull       127
			mChangedScrap = new ArrayList();
	//   53  116:aload_0         
	//   54  117:new             #35  <Class ArrayList>
	//   55  120:dup             
	//   56  121:invokespecial   #36  <Method void ArrayList()>
	//   57  124:putfield        #40  <Field ArrayList mChangedScrap>
		((r) (view)).setScrapContainer(this, true);
	//   58  127:aload_1         
	//   59  128:aload_0         
	//   60  129:iconst_1        
	//   61  130:invokevirtual   #522 <Method void RecyclerView$ViewHolder.setScrapContainer(RecyclerView$Recycler, boolean)>
		mChangedScrap.add(((Object) (view)));
	//   62  133:aload_0         
	//   63  134:getfield        #40  <Field ArrayList mChangedScrap>
	//   64  137:aload_1         
	//   65  138:invokevirtual   #525 <Method boolean ArrayList.add(Object)>
	//   66  141:pop             
	//   67  142:return          
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
		if(i < 0 || i >= mState.getItemCount())
	//*   0    0:iload_1         
	//*   1    1:iflt            18
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #30  <Field RecyclerView this$0>
	//*   5    9:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//*   6   12:invokevirtual   #245 <Method int RecyclerView$State.getItemCount()>
	//*   7   15:icmplt          85
			throw new IndexOutOfBoundsException((new StringBuilder()).append("Invalid item position ").append(i).append("(").append(i).append("). Item count:").append(mState.getItemCount()).append(exceptionLabel()).toString());
	//    8   18:new             #233 <Class IndexOutOfBoundsException>
	//    9   21:dup             
	//   10   22:new             #201 <Class StringBuilder>
	//   11   25:dup             
	//   12   26:invokespecial   #202 <Method void StringBuilder()>
	//   13   29:ldc2            #549 <String "Invalid item position ">
	//   14   32:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:iload_1         
	//   16   36:invokevirtual   #238 <Method StringBuilder StringBuilder.append(int)>
	//   17   39:ldc2            #551 <String "(">
	//   18   42:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   19   45:iload_1         
	//   20   46:invokevirtual   #238 <Method StringBuilder StringBuilder.append(int)>
	//   21   49:ldc2            #553 <String "). Item count:">
	//   22   52:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   23   55:aload_0         
	//   24   56:getfield        #30  <Field RecyclerView this$0>
	//   25   59:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//   26   62:invokevirtual   #245 <Method int RecyclerView$State.getItemCount()>
	//   27   65:invokevirtual   #238 <Method StringBuilder StringBuilder.append(int)>
	//   28   68:aload_0         
	//   29   69:getfield        #30  <Field RecyclerView this$0>
	//   30   72:invokevirtual   #212 <Method String RecyclerView.exceptionLabel()>
	//   31   75:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   32   78:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   33   81:invokespecial   #246 <Method void IndexOutOfBoundsException(String)>
	//   34   84:athrow          
		boolean flag2 = false;
	//   35   85:iconst_0        
	//   36   86:istore          6
		r r = null;
	//   37   88:aconst_null     
	//   38   89:astore          14
		boolean flag1;
		Object obj;
		if(mState.isPreLayout())
	//*  39   91:aload_0         
	//*  40   92:getfield        #30  <Field RecyclerView this$0>
	//*  41   95:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//*  42   98:invokevirtual   #166 <Method boolean RecyclerView$State.isPreLayout()>
	//*  43  101:ifeq            119
		{
			r = getChangedScrapViewForPosition(i);
	//   44  104:aload_0         
	//   45  105:iload_1         
	//   46  106:invokevirtual   #555 <Method RecyclerView$ViewHolder getChangedScrapViewForPosition(int)>
	//   47  109:astore          14
			if(r != null)
	//*  48  111:aload           14
	//*  49  113:ifnull          327
				flag2 = true;
	//   50  116:iconst_1        
	//   51  117:istore          6
			else
	//*  52  119:aload           14
	//*  53  121:astore          13
	//*  54  123:iload           6
	//*  55  125:istore          5
	//*  56  127:aload           14
	//*  57  129:ifnonnull       211
	//*  58  132:aload_0         
	//*  59  133:iload_1         
	//*  60  134:iload_2         
	//*  61  135:invokevirtual   #557 <Method RecyclerView$ViewHolder getScrapOrHiddenOrCachedHolderForPosition(int, boolean)>
	//*  62  138:astore          14
	//*  63  140:aload           14
	//*  64  142:astore          13
	//*  65  144:iload           6
	//*  66  146:istore          5
	//*  67  148:aload           14
	//*  68  150:ifnull          211
	//*  69  153:aload_0         
	//*  70  154:aload           14
	//*  71  156:invokevirtual   #560 <Method boolean validateViewHolderForOffsetPosition(RecyclerView$ViewHolder)>
	//*  72  159:ifne            349
	//*  73  162:iload_2         
	//*  74  163:ifne            204
	//*  75  166:aload           14
	//*  76  168:iconst_4        
	//*  77  169:invokevirtual   #85  <Method void RecyclerView$ViewHolder.addFlags(int)>
	//*  78  172:aload           14
	//*  79  174:invokevirtual   #475 <Method boolean RecyclerView$ViewHolder.isScrap()>
	//*  80  177:ifeq            333
	//*  81  180:aload_0         
	//*  82  181:getfield        #30  <Field RecyclerView this$0>
	//*  83  184:aload           14
	//*  84  186:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//*  85  189:iconst_0        
	//*  86  190:invokevirtual   #365 <Method void RecyclerView.removeDetachedView(View, boolean)>
	//*  87  193:aload           14
	//*  88  195:invokevirtual   #478 <Method void RecyclerView$ViewHolder.unScrap()>
	//*  89  198:aload_0         
	//*  90  199:aload           14
	//*  91  201:invokevirtual   #454 <Method void recycleViewHolderInternal(RecyclerView$ViewHolder)>
	//*  92  204:aconst_null     
	//*  93  205:astore          13
	//*  94  207:iload           6
	//*  95  209:istore          5
	//*  96  211:aload           13
	//*  97  213:astore          14
	//*  98  215:iload           5
	//*  99  217:istore          6
	//* 100  219:aload           13
	//* 101  221:ifnonnull       749
	//* 102  224:aload_0         
	//* 103  225:getfield        #30  <Field RecyclerView this$0>
	//* 104  228:getfield        #222 <Field AdapterHelper RecyclerView.mAdapterHelper>
	//* 105  231:iload_1         
	//* 106  232:invokevirtual   #228 <Method int AdapterHelper.findPositionOffset(int)>
	//* 107  235:istore          8
	//* 108  237:iload           8
	//* 109  239:iflt            257
	//* 110  242:iload           8
	//* 111  244:aload_0         
	//* 112  245:getfield        #30  <Field RecyclerView this$0>
	//* 113  248:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//* 114  251:invokevirtual   #231 <Method int RecyclerView$Adapter.getItemCount()>
	//* 115  254:icmplt          359
	//* 116  257:new             #233 <Class IndexOutOfBoundsException>
	//* 117  260:dup             
	//* 118  261:new             #201 <Class StringBuilder>
	//* 119  264:dup             
	//* 120  265:invokespecial   #202 <Method void StringBuilder()>
	//* 121  268:ldc1            #235 <String "Inconsistency detected. Invalid item position ">
	//* 122  270:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//* 123  273:iload_1         
	//* 124  274:invokevirtual   #238 <Method StringBuilder StringBuilder.append(int)>
	//* 125  277:ldc1            #240 <String "(offset:">
	//* 126  279:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//* 127  282:iload           8
	//* 128  284:invokevirtual   #238 <Method StringBuilder StringBuilder.append(int)>
	//* 129  287:ldc1            #242 <String ").">
	//* 130  289:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//* 131  292:ldc1            #244 <String "state:">
	//* 132  294:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//* 133  297:aload_0         
	//* 134  298:getfield        #30  <Field RecyclerView this$0>
	//* 135  301:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//* 136  304:invokevirtual   #245 <Method int RecyclerView$State.getItemCount()>
	//* 137  307:invokevirtual   #238 <Method StringBuilder StringBuilder.append(int)>
	//* 138  310:aload_0         
	//* 139  311:getfield        #30  <Field RecyclerView this$0>
	//* 140  314:invokevirtual   #212 <Method String RecyclerView.exceptionLabel()>
	//* 141  317:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//* 142  320:invokevirtual   #215 <Method String StringBuilder.toString()>
	//* 143  323:invokespecial   #246 <Method void IndexOutOfBoundsException(String)>
	//* 144  326:athrow          
				flag2 = false;
	//  145  327:iconst_0        
	//  146  328:istore          6
		}
		obj = ((Object) (r));
		flag1 = flag2;
		if(r == null)
		{
			r = getScrapOrHiddenOrCachedHolderForPosition(i, flag);
			obj = ((Object) (r));
			flag1 = flag2;
			if(r != null)
				if(!validateViewHolderForOffsetPosition(r))
				{
					if(!flag)
					{
						r.addFlags(4);
						if(r.isScrap())
						{
							removeDetachedView(r.itemView, false);
							r.unScrap();
						} else
	//* 147  330:goto            119
						if(r.wasReturnedFromScrap())
	//* 148  333:aload           14
	//* 149  335:invokevirtual   #335 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//* 150  338:ifeq            198
							r.clearReturnedFromScrapFlag();
	//  151  341:aload           14
	//  152  343:invokevirtual   #451 <Method void RecyclerView$ViewHolder.clearReturnedFromScrapFlag()>
						recycleViewHolderInternal(r);
					}
					obj = null;
					flag1 = flag2;
				} else
	//* 153  346:goto            198
				{
					flag1 = true;
	//  154  349:iconst_1        
	//  155  350:istore          5
					obj = ((Object) (r));
	//  156  352:aload           14
	//  157  354:astore          13
				}
		}
		r = ((r) (obj));
		flag2 = flag1;
		if(obj == null)
		{
			int i1 = mAdapterHelper.findPositionOffset(i);
			if(i1 < 0 || i1 >= mAdapter.getItemCount())
				throw new IndexOutOfBoundsException((new StringBuilder()).append("Inconsistency detected. Invalid item position ").append(i).append("(offset:").append(i1).append(").").append("state:").append(mState.getItemCount()).append(exceptionLabel()).toString());
	//* 158  356:goto            211
			int k = mAdapter.getItemViewType(i1);
	//  159  359:aload_0         
	//  160  360:getfield        #30  <Field RecyclerView this$0>
	//  161  363:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//  162  366:iload           8
	//  163  368:invokevirtual   #562 <Method int RecyclerView$Adapter.getItemViewType(int)>
	//  164  371:istore          7
			r = ((r) (obj));
	//  165  373:aload           13
	//  166  375:astore          14
			flag2 = flag1;
	//  167  377:iload           5
	//  168  379:istore          6
			if(mAdapter.hasStableIds())
	//* 169  381:aload_0         
	//* 170  382:getfield        #30  <Field RecyclerView this$0>
	//* 171  385:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//* 172  388:invokevirtual   #341 <Method boolean RecyclerView$Adapter.hasStableIds()>
	//* 173  391:ifeq            442
			{
				obj = ((Object) (getScrapOrCachedViewForId(mAdapter.getItemId(i1), k, flag)));
	//  174  394:aload_0         
	//  175  395:aload_0         
	//  176  396:getfield        #30  <Field RecyclerView this$0>
	//  177  399:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//  178  402:iload           8
	//  179  404:invokevirtual   #345 <Method long RecyclerView$Adapter.getItemId(int)>
	//  180  407:iload           7
	//  181  409:iload_2         
	//  182  410:invokevirtual   #564 <Method RecyclerView$ViewHolder getScrapOrCachedViewForId(long, int, boolean)>
	//  183  413:astore          13
				r = ((r) (obj));
	//  184  415:aload           13
	//  185  417:astore          14
				flag2 = flag1;
	//  186  419:iload           5
	//  187  421:istore          6
				if(obj != null)
	//* 188  423:aload           13
	//* 189  425:ifnull          442
				{
					obj.mPosition = i1;
	//  190  428:aload           13
	//  191  430:iload           8
	//  192  432:putfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
					flag2 = true;
	//  193  435:iconst_1        
	//  194  436:istore          6
					r = ((r) (obj));
	//  195  438:aload           13
	//  196  440:astore          14
				}
			}
			obj = ((Object) (r));
	//  197  442:aload           14
	//  198  444:astore          13
			if(r == null)
	//* 199  446:aload           14
	//* 200  448:ifnonnull       580
			{
				obj = ((Object) (r));
	//  201  451:aload           14
	//  202  453:astore          13
				if(mViewCacheExtension != null)
	//* 203  455:aload_0         
	//* 204  456:getfield        #542 <Field RecyclerView$ViewCacheExtension mViewCacheExtension>
	//* 205  459:ifnull          580
				{
					View view = mViewCacheExtension.getViewForPositionAndType(this, i, k);
	//  206  462:aload_0         
	//  207  463:getfield        #542 <Field RecyclerView$ViewCacheExtension mViewCacheExtension>
	//  208  466:aload_0         
	//  209  467:iload_1         
	//  210  468:iload           7
	//  211  470:invokevirtual   #570 <Method View RecyclerView$ViewCacheExtension.getViewForPositionAndType(RecyclerView$Recycler, int, int)>
	//  212  473:astore          15
					obj = ((Object) (r));
	//  213  475:aload           14
	//  214  477:astore          13
					if(view != null)
	//* 215  479:aload           15
	//* 216  481:ifnull          580
					{
						r = getChildViewHolder(view);
	//  217  484:aload_0         
	//  218  485:getfield        #30  <Field RecyclerView this$0>
	//  219  488:aload           15
	//  220  490:invokevirtual   #573 <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolder(View)>
	//  221  493:astore          14
						if(r == null)
	//* 222  495:aload           14
	//* 223  497:ifnonnull       534
							throw new IllegalArgumentException((new StringBuilder()).append("getViewForPositionAndType returned a view which does not have a ViewHolder").append(exceptionLabel()).toString());
	//  224  500:new             #199 <Class IllegalArgumentException>
	//  225  503:dup             
	//  226  504:new             #201 <Class StringBuilder>
	//  227  507:dup             
	//  228  508:invokespecial   #202 <Method void StringBuilder()>
	//  229  511:ldc2            #575 <String "getViewForPositionAndType returned a view which does not have a ViewHolder">
	//  230  514:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//  231  517:aload_0         
	//  232  518:getfield        #30  <Field RecyclerView this$0>
	//  233  521:invokevirtual   #212 <Method String RecyclerView.exceptionLabel()>
	//  234  524:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//  235  527:invokevirtual   #215 <Method String StringBuilder.toString()>
	//  236  530:invokespecial   #218 <Method void IllegalArgumentException(String)>
	//  237  533:athrow          
						obj = ((Object) (r));
	//  238  534:aload           14
	//  239  536:astore          13
						if(r.shouldIgnore())
	//* 240  538:aload           14
	//* 241  540:invokevirtual   #490 <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//* 242  543:ifeq            580
							throw new IllegalArgumentException((new StringBuilder()).append("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.").append(exceptionLabel()).toString());
	//  243  546:new             #199 <Class IllegalArgumentException>
	//  244  549:dup             
	//  245  550:new             #201 <Class StringBuilder>
	//  246  553:dup             
	//  247  554:invokespecial   #202 <Method void StringBuilder()>
	//  248  557:ldc2            #577 <String "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.">
	//  249  560:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//  250  563:aload_0         
	//  251  564:getfield        #30  <Field RecyclerView this$0>
	//  252  567:invokevirtual   #212 <Method String RecyclerView.exceptionLabel()>
	//  253  570:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//  254  573:invokevirtual   #215 <Method String StringBuilder.toString()>
	//  255  576:invokespecial   #218 <Method void IllegalArgumentException(String)>
	//  256  579:athrow          
					}
				}
			}
			r = ((r) (obj));
	//  257  580:aload           13
	//  258  582:astore          14
			if(obj == null)
	//* 259  584:aload           13
	//* 260  586:ifnonnull       634
			{
				obj = ((Object) (getRecycledViewPool().getRecycledView(k)));
	//  261  589:aload_0         
	//  262  590:invokevirtual   #189 <Method RecyclerView$RecycledViewPool getRecycledViewPool()>
	//  263  593:iload           7
	//  264  595:invokevirtual   #580 <Method RecyclerView$ViewHolder RecyclerView$RecycledViewPool.getRecycledView(int)>
	//  265  598:astore          13
				r = ((r) (obj));
	//  266  600:aload           13
	//  267  602:astore          14
				if(obj != null)
	//* 268  604:aload           13
	//* 269  606:ifnull          634
				{
					((r) (obj)).resetInternal();
	//  270  609:aload           13
	//  271  611:invokevirtual   #583 <Method void RecyclerView$ViewHolder.resetInternal()>
					r = ((r) (obj));
	//  272  614:aload           13
	//  273  616:astore          14
					if(RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST)
	//* 274  618:getstatic       #586 <Field boolean RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST>
	//* 275  621:ifeq            634
					{
						invalidateDisplayListInt(((r) (obj)));
	//  276  624:aload_0         
	//  277  625:aload           13
	//  278  627:invokespecial   #588 <Method void invalidateDisplayListInt(RecyclerView$ViewHolder)>
						r = ((r) (obj));
	//  279  630:aload           13
	//  280  632:astore          14
					}
				}
			}
			if(r == null)
	//* 281  634:aload           14
	//* 282  636:ifnonnull       1044
			{
				long l1 = getNanoTime();
	//  283  639:aload_0         
	//  284  640:getfield        #30  <Field RecyclerView this$0>
	//  285  643:invokevirtual   #131 <Method long RecyclerView.getNanoTime()>
	//  286  646:lstore          9
				if(l != 0xffffffffL && !mRecyclerPool.willCreateInTime(k, l1, l))
	//* 287  648:lload_3         
	//* 288  649:ldc2w           #132 <Long 0xffffffffL>
	//* 289  652:lcmp            
	//* 290  653:ifeq            673
	//* 291  656:aload_0         
	//* 292  657:getfield        #135 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//* 293  660:iload           7
	//* 294  662:lload           9
	//* 295  664:lload_3         
	//* 296  665:invokevirtual   #591 <Method boolean RecyclerView$RecycledViewPool.willCreateInTime(int, long, long)>
	//* 297  668:ifne            673
					return null;
	//  298  671:aconst_null     
	//  299  672:areturn         
				r = mAdapter.createViewHolder(((ViewGroup) (RecyclerView.this)), k);
	//  300  673:aload_0         
	//  301  674:getfield        #30  <Field RecyclerView this$0>
	//  302  677:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//  303  680:aload_0         
	//  304  681:getfield        #30  <Field RecyclerView this$0>
	//  305  684:iload           7
	//  306  686:invokevirtual   #595 <Method RecyclerView$ViewHolder RecyclerView$Adapter.createViewHolder(ViewGroup, int)>
	//  307  689:astore          14
				if(RecyclerView.access$800())
	//* 308  691:invokestatic    #457 <Method boolean RecyclerView.access$800()>
	//* 309  694:ifeq            726
				{
					obj = ((Object) (RecyclerView.findNestedRecyclerView(r.itemView)));
	//  310  697:aload           14
	//  311  699:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//  312  702:invokestatic    #599 <Method RecyclerView RecyclerView.findNestedRecyclerView(View)>
	//  313  705:astore          13
					if(obj != null)
	//* 314  707:aload           13
	//* 315  709:ifnull          726
						r.mNestedRecyclerView = new WeakReference(obj);
	//  316  712:aload           14
	//  317  714:new             #601 <Class WeakReference>
	//  318  717:dup             
	//  319  718:aload           13
	//  320  720:invokespecial   #603 <Method void WeakReference(Object)>
	//  321  723:putfield        #607 <Field WeakReference RecyclerView$ViewHolder.mNestedRecyclerView>
				}
				long l2 = getNanoTime();
	//  322  726:aload_0         
	//  323  727:getfield        #30  <Field RecyclerView this$0>
	//  324  730:invokevirtual   #131 <Method long RecyclerView.getNanoTime()>
	//  325  733:lstore          11
				mRecyclerPool.factorInCreateTime(k, l2 - l1);
	//  326  735:aload_0         
	//  327  736:getfield        #135 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//  328  739:iload           7
	//  329  741:lload           11
	//  330  743:lload           9
	//  331  745:lsub            
	//  332  746:invokevirtual   #610 <Method void RecyclerView$RecycledViewPool.factorInCreateTime(int, long)>
			}
		}
		if(flag2 && !mState.isPreLayout() && r.hasAnyOfTheFlags(8192))
	//* 333  749:iload           6
	//* 334  751:ifeq            850
	//* 335  754:aload_0         
	//* 336  755:getfield        #30  <Field RecyclerView this$0>
	//* 337  758:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//* 338  761:invokevirtual   #166 <Method boolean RecyclerView$State.isPreLayout()>
	//* 339  764:ifne            850
	//* 340  767:aload           14
	//* 341  769:sipush          8192
	//* 342  772:invokevirtual   #178 <Method boolean RecyclerView$ViewHolder.hasAnyOfTheFlags(int)>
	//* 343  775:ifeq            850
		{
			r.setFlags(0, 8192);
	//  344  778:aload           14
	//  345  780:iconst_0        
	//  346  781:sipush          8192
	//  347  784:invokevirtual   #182 <Method void RecyclerView$ViewHolder.setFlags(int, int)>
			if(mState.mRunSimpleAnimations)
	//* 348  787:aload_0         
	//* 349  788:getfield        #30  <Field RecyclerView this$0>
	//* 350  791:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//* 351  794:getfield        #613 <Field boolean RecyclerView$State.mRunSimpleAnimations>
	//* 352  797:ifeq            850
			{
				int j = tor.buildAdapterChangeFlagsForAnimations(r);
	//  353  800:aload           14
	//  354  802:invokestatic    #619 <Method int RecyclerView$ItemAnimator.buildAdapterChangeFlagsForAnimations(RecyclerView$ViewHolder)>
	//  355  805:istore          5
				obj = ((Object) (mItemAnimator.recordPreLayoutInformation(mState, r, j | 0x1000, r.getUnmodifiedPayloads())));
	//  356  807:aload_0         
	//  357  808:getfield        #30  <Field RecyclerView this$0>
	//  358  811:getfield        #623 <Field RecyclerView$ItemAnimator RecyclerView.mItemAnimator>
	//  359  814:aload_0         
	//  360  815:getfield        #30  <Field RecyclerView this$0>
	//  361  818:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//  362  821:aload           14
	//  363  823:iload           5
	//  364  825:sipush          4096
	//  365  828:ior             
	//  366  829:aload           14
	//  367  831:invokevirtual   #626 <Method List RecyclerView$ViewHolder.getUnmodifiedPayloads()>
	//  368  834:invokevirtual   #630 <Method RecyclerView$ItemAnimator$ItemHolderInfo RecyclerView$ItemAnimator.recordPreLayoutInformation(RecyclerView$State, RecyclerView$ViewHolder, int, List)>
	//  369  837:astore          13
				recordAnimationInfoIfBouncedHiddenView(r, ((tor.ItemHolderInfo) (obj)));
	//  370  839:aload_0         
	//  371  840:getfield        #30  <Field RecyclerView this$0>
	//  372  843:aload           14
	//  373  845:aload           13
	//  374  847:invokevirtual   #634 <Method void RecyclerView.recordAnimationInfoIfBouncedHiddenView(RecyclerView$ViewHolder, RecyclerView$ItemAnimator$ItemHolderInfo)>
			}
		}
		flag = false;
	//  375  850:iconst_0        
	//  376  851:istore_2        
		if(mState.isPreLayout() && r.isBound())
	//* 377  852:aload_0         
	//* 378  853:getfield        #30  <Field RecyclerView this$0>
	//* 379  856:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//* 380  859:invokevirtual   #166 <Method boolean RecyclerView$State.isPreLayout()>
	//* 381  862:ifeq            943
	//* 382  865:aload           14
	//* 383  867:invokevirtual   #637 <Method boolean RecyclerView$ViewHolder.isBound()>
	//* 384  870:ifeq            943
			r.mPreLayoutPosition = i;
	//  385  873:aload           14
	//  386  875:iload_1         
	//  387  876:putfield        #169 <Field int RecyclerView$ViewHolder.mPreLayoutPosition>
		else
	//* 388  879:aload           14
	//* 389  881:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//* 390  884:invokevirtual   #254 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 391  887:astore          13
	//* 392  889:aload           13
	//* 393  891:ifnonnull       990
	//* 394  894:aload_0         
	//* 395  895:getfield        #30  <Field RecyclerView this$0>
	//* 396  898:invokevirtual   #257 <Method android.view.ViewGroup$LayoutParams RecyclerView.generateDefaultLayoutParams()>
	//* 397  901:checkcast       #259 <Class RecyclerView$LayoutParams>
	//* 398  904:astore          13
	//* 399  906:aload           14
	//* 400  908:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//* 401  911:aload           13
	//* 402  913:invokevirtual   #263 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 403  916:aload           13
	//* 404  918:aload           14
	//* 405  920:putfield        #271 <Field RecyclerView$ViewHolder RecyclerView$LayoutParams.mViewHolder>
	//* 406  923:iload           6
	//* 407  925:ifeq            1039
	//* 408  928:iload_2         
	//* 409  929:ifeq            1039
	//* 410  932:iconst_1        
	//* 411  933:istore_2        
	//* 412  934:aload           13
	//* 413  936:iload_2         
	//* 414  937:putfield        #278 <Field boolean RecyclerView$LayoutParams.mPendingInvalidate>
	//* 415  940:aload           14
	//* 416  942:areturn         
		if(!r.isBound() || r.needsUpdate() || r.isInvalid())
	//* 417  943:aload           14
	//* 418  945:invokevirtual   #637 <Method boolean RecyclerView$ViewHolder.isBound()>
	//* 419  948:ifeq            967
	//* 420  951:aload           14
	//* 421  953:invokevirtual   #640 <Method boolean RecyclerView$ViewHolder.needsUpdate()>
	//* 422  956:ifne            967
	//* 423  959:aload           14
	//* 424  961:invokevirtual   #377 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//* 425  964:ifeq            879
			flag = tryBindViewHolderByDeadline(r, mAdapterHelper.findPositionOffset(i), i, l);
	//  426  967:aload_0         
	//  427  968:aload           14
	//  428  970:aload_0         
	//  429  971:getfield        #30  <Field RecyclerView this$0>
	//  430  974:getfield        #222 <Field AdapterHelper RecyclerView.mAdapterHelper>
	//  431  977:iload_1         
	//  432  978:invokevirtual   #228 <Method int AdapterHelper.findPositionOffset(int)>
	//  433  981:iload_1         
	//  434  982:lload_3         
	//  435  983:invokespecial   #248 <Method boolean tryBindViewHolderByDeadline(RecyclerView$ViewHolder, int, int, long)>
	//  436  986:istore_2        
		obj = ((Object) (r.itemView.getLayoutParams()));
		if(obj == null)
		{
			obj = ((Object) ((ams)generateDefaultLayoutParams()));
			r.itemView.setLayoutParams(((android.view.) (obj)));
		} else
	//* 437  987:goto            879
		if(!checkLayoutParams(((android.view.) (obj))))
	//* 438  990:aload_0         
	//* 439  991:getfield        #30  <Field RecyclerView this$0>
	//* 440  994:aload           13
	//* 441  996:invokevirtual   #282 <Method boolean RecyclerView.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 442  999:ifne            1029
		{
			obj = ((Object) ((ams)generateLayoutParams(((android.view.) (obj)))));
	//  443 1002:aload_0         
	//  444 1003:getfield        #30  <Field RecyclerView this$0>
	//  445 1006:aload           13
	//  446 1008:invokevirtual   #286 <Method android.view.ViewGroup$LayoutParams RecyclerView.generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//  447 1011:checkcast       #259 <Class RecyclerView$LayoutParams>
	//  448 1014:astore          13
			r.itemView.setLayoutParams(((android.view.) (obj)));
	//  449 1016:aload           14
	//  450 1018:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//  451 1021:aload           13
	//  452 1023:invokevirtual   #263 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		} else
	//* 453 1026:goto            916
		{
			obj = ((Object) ((ams)obj));
	//  454 1029:aload           13
	//  455 1031:checkcast       #259 <Class RecyclerView$LayoutParams>
	//  456 1034:astore          13
		}
		obj.mViewHolder = r;
		if(flag2 && flag)
			flag = true;
		else
	//* 457 1036:goto            916
			flag = false;
	//  458 1039:iconst_0        
	//  459 1040:istore_2        
		obj.mPendingInvalidate = flag;
		return r;
	//* 460 1041:goto            934
	//* 461 1044:goto            749
	}

	void unscrapView(r r)
	{
		if(r.access._mth1100(r))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #645 <Method boolean RecyclerView$ViewHolder.access$1100(RecyclerView$ViewHolder)>
	//*   2    4:ifeq            33
			mChangedScrap.remove(((Object) (r)));
	//    3    7:aload_0         
	//    4    8:getfield        #40  <Field ArrayList mChangedScrap>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #647 <Method boolean ArrayList.remove(Object)>
	//    7   15:pop             
		else
	//*   8   16:aload_1         
	//*   9   17:aconst_null     
	//*  10   18:invokestatic    #444 <Method RecyclerView$Recycler RecyclerView$ViewHolder.access$1002(RecyclerView$ViewHolder, RecyclerView$Recycler)>
	//*  11   21:pop             
	//*  12   22:aload_1         
	//*  13   23:iconst_0        
	//*  14   24:invokestatic    #448 <Method boolean RecyclerView$ViewHolder.access$1102(RecyclerView$ViewHolder, boolean)>
	//*  15   27:pop             
	//*  16   28:aload_1         
	//*  17   29:invokevirtual   #451 <Method void RecyclerView$ViewHolder.clearReturnedFromScrapFlag()>
	//*  18   32:return          
			mAttachedScrap.remove(((Object) (r)));
	//   19   33:aload_0         
	//   20   34:getfield        #38  <Field ArrayList mAttachedScrap>
	//   21   37:aload_1         
	//   22   38:invokevirtual   #647 <Method boolean ArrayList.remove(Object)>
	//   23   41:pop             
		r.access._mth1002(r, ((RecyclerView$Recycler) (null)));
		r.access._mth1102(r, false);
		r.clearReturnedFromScrapFlag();
	//*  24   42:goto            16
	}

	void updateViewCacheSize()
	{
		int i;
		if(mLayout != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field RecyclerView this$0>
	//*   2    4:getfield        #651 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//*   3    7:ifnull          71
			i = mLayout.mPrefetchMaxCountObserved;
	//    4   10:aload_0         
	//    5   11:getfield        #30  <Field RecyclerView this$0>
	//    6   14:getfield        #651 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//    7   17:getfield        #656 <Field int RecyclerView$LayoutManager.mPrefetchMaxCountObserved>
	//    8   20:istore_1        
		else
	//*   9   21:aload_0         
	//*  10   22:aload_0         
	//*  11   23:getfield        #52  <Field int mRequestedCacheMax>
	//*  12   26:iload_1         
	//*  13   27:iadd            
	//*  14   28:putfield        #54  <Field int mViewCacheMax>
	//*  15   31:aload_0         
	//*  16   32:getfield        #42  <Field ArrayList mCachedViews>
	//*  17   35:invokevirtual   #296 <Method int ArrayList.size()>
	//*  18   38:iconst_1        
	//*  19   39:isub            
	//*  20   40:istore_1        
	//*  21   41:iload_1         
	//*  22   42:iflt            76
	//*  23   45:aload_0         
	//*  24   46:getfield        #42  <Field ArrayList mCachedViews>
	//*  25   49:invokevirtual   #296 <Method int ArrayList.size()>
	//*  26   52:aload_0         
	//*  27   53:getfield        #54  <Field int mViewCacheMax>
	//*  28   56:icmple          76
	//*  29   59:aload_0         
	//*  30   60:iload_1         
	//*  31   61:invokevirtual   #372 <Method void recycleCachedViewAt(int)>
	//*  32   64:iload_1         
	//*  33   65:iconst_1        
	//*  34   66:isub            
	//*  35   67:istore_1        
	//*  36   68:goto            41
			i = 0;
	//   37   71:iconst_0        
	//   38   72:istore_1        
		mViewCacheMax = mRequestedCacheMax + i;
		for(i = mCachedViews.size() - 1; i >= 0 && mCachedViews.size() > mViewCacheMax; i--)
			recycleCachedViewAt(i);

	//*  39   73:goto            21
	//   40   76:return          
	}

	boolean validateViewHolderForOffsetPosition(r r)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		boolean flag;
		if(r.isRemoved())
	//*   2    2:aload_1         
	//*   3    3:invokevirtual   #358 <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*   4    6:ifeq            22
		{
			flag = mState.isPreLayout();
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field RecyclerView this$0>
	//    7   13:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//    8   16:invokevirtual   #166 <Method boolean RecyclerView$State.isPreLayout()>
	//    9   19:istore_2        
		} else
	//*  10   20:iload_2         
	//*  11   21:ireturn         
		{
			if(r.mPosition < 0 || r.mPosition >= mAdapter.getItemCount())
	//*  12   22:aload_1         
	//*  13   23:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//*  14   26:iflt            46
	//*  15   29:aload_1         
	//*  16   30:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//*  17   33:aload_0         
	//*  18   34:getfield        #30  <Field RecyclerView this$0>
	//*  19   37:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  20   40:invokevirtual   #231 <Method int RecyclerView$Adapter.getItemCount()>
	//*  21   43:icmplt          84
				throw new IndexOutOfBoundsException((new StringBuilder()).append("Inconsistency detected. Invalid view holder adapter position").append(((Object) (r))).append(exceptionLabel()).toString());
	//   22   46:new             #233 <Class IndexOutOfBoundsException>
	//   23   49:dup             
	//   24   50:new             #201 <Class StringBuilder>
	//   25   53:dup             
	//   26   54:invokespecial   #202 <Method void StringBuilder()>
	//   27   57:ldc2            #658 <String "Inconsistency detected. Invalid view holder adapter position">
	//   28   60:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   29   63:aload_1         
	//   30   64:invokevirtual   #402 <Method StringBuilder StringBuilder.append(Object)>
	//   31   67:aload_0         
	//   32   68:getfield        #30  <Field RecyclerView this$0>
	//   33   71:invokevirtual   #212 <Method String RecyclerView.exceptionLabel()>
	//   34   74:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   35   77:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   36   80:invokespecial   #246 <Method void IndexOutOfBoundsException(String)>
	//   37   83:athrow          
			if(!mState.isPreLayout() && mAdapter.getItemViewType(r.mPosition) != r.getItemViewType())
	//*  38   84:aload_0         
	//*  39   85:getfield        #30  <Field RecyclerView this$0>
	//*  40   88:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//*  41   91:invokevirtual   #166 <Method boolean RecyclerView$State.isPreLayout()>
	//*  42   94:ifne            120
	//*  43   97:aload_0         
	//*  44   98:getfield        #30  <Field RecyclerView this$0>
	//*  45  101:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  46  104:aload_1         
	//*  47  105:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//*  48  108:invokevirtual   #562 <Method int RecyclerView$Adapter.getItemViewType(int)>
	//*  49  111:aload_1         
	//*  50  112:invokevirtual   #127 <Method int RecyclerView$ViewHolder.getItemViewType()>
	//*  51  115:icmpeq          120
				return false;
	//   52  118:iconst_0        
	//   53  119:ireturn         
			flag = flag1;
	//   54  120:iload_3         
	//   55  121:istore_2        
			if(mAdapter.hasStableIds())
	//*  56  122:aload_0         
	//*  57  123:getfield        #30  <Field RecyclerView this$0>
	//*  58  126:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  59  129:invokevirtual   #341 <Method boolean RecyclerView$Adapter.hasStableIds()>
	//*  60  132:ifeq            20
			{
				flag = flag1;
	//   61  135:iload_3         
	//   62  136:istore_2        
				if(r.getItemId() != mAdapter.getItemId(r.mPosition))
	//*  63  137:aload_1         
	//*  64  138:invokevirtual   #347 <Method long RecyclerView$ViewHolder.getItemId()>
	//*  65  141:aload_0         
	//*  66  142:getfield        #30  <Field RecyclerView this$0>
	//*  67  145:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  68  148:aload_1         
	//*  69  149:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//*  70  152:invokevirtual   #345 <Method long RecyclerView$Adapter.getItemId(int)>
	//*  71  155:lcmp            
	//*  72  156:ifeq            20
					return false;
	//   73  159:iconst_0        
	//   74  160:ireturn         
			}
		}
		return flag;
	}

	void viewRangeUpdate(int i, int j)
	{
		int k = mCachedViews.size() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field ArrayList mCachedViews>
	//    2    4:invokevirtual   #296 <Method int ArrayList.size()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_3        
		while(k >= 0) 
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
			if(r != null)
	//*  14   27:aload           5
	//*  15   29:ifnonnull       39
	//*  16   32:iload_3         
	//*  17   33:iconst_1        
	//*  18   34:isub            
	//*  19   35:istore_3        
	//*  20   36:goto            10
			{
				int l = r.mPosition;
	//   21   39:aload           5
	//   22   41:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//   23   44:istore          4
				if(l >= i && l < i + j)
	//*  24   46:iload           4
	//*  25   48:iload_1         
	//*  26   49:icmplt          32
	//*  27   52:iload           4
	//*  28   54:iload_1         
	//*  29   55:iload_2         
	//*  30   56:iadd            
	//*  31   57:icmpge          32
				{
					r.addFlags(2);
	//   32   60:aload           5
	//   33   62:iconst_2        
	//   34   63:invokevirtual   #85  <Method void RecyclerView$ViewHolder.addFlags(int)>
					recycleCachedViewAt(k);
	//   35   66:aload_0         
	//   36   67:iload_3         
	//   37   68:invokevirtual   #372 <Method void recycleCachedViewAt(int)>
				}
			}
			k--;
		}
	//*  38   71:goto            32
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
