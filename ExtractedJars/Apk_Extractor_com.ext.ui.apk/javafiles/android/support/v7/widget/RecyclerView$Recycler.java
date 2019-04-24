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
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int l = mCachedViews.size();
	//    2    2:aload_0         
	//    3    3:getfield        #42  <Field ArrayList mCachedViews>
	//    4    6:invokevirtual   #296 <Method int ArrayList.size()>
	//    5    9:istore_3        
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
		boolean flag;
		int k;
label0:
		{
			flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
			if(mChangedScrap != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #40  <Field ArrayList mChangedScrap>
	//*   4    6:ifnull          23
			{
				k = mChangedScrap.size();
	//    5    9:aload_0         
	//    6   10:getfield        #40  <Field ArrayList mChangedScrap>
	//    7   13:invokevirtual   #296 <Method int ArrayList.size()>
	//    8   16:istore          4
				if(k != 0)
					break label0;
	//    9   18:iload           4
	//   10   20:ifne            25
			}
			return null;
	//   11   23:aconst_null     
	//   12   24:areturn         
		}
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
		boolean flag1;
		int l;
		flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		l = mAttachedScrap.size();
	//    2    3:aload_0         
	//    3    4:getfield        #38  <Field ArrayList mAttachedScrap>
	//    4    7:invokevirtual   #296 <Method int ArrayList.size()>
	//    5   10:istore          5
		j = 0;
	//    6   12:iconst_0        
	//    7   13:istore_3        
_L8:
		if(j >= l) goto _L2; else goto _L1
	//    8   14:iload_3         
	//    9   15:iload           5
	//   10   17:icmpge          96
_L1:
		Object obj = ((Object) ((r)mAttachedScrap.get(j)));
	//   11   20:aload_0         
	//   12   21:getfield        #38  <Field ArrayList mAttachedScrap>
	//   13   24:iload_3         
	//   14   25:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//   15   28:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   16   31:astore          6
		if(((r) (obj)).wasReturnedFromScrap() || ((r) (obj)).getLayoutPosition() != i || ((r) (obj)).isInvalid() || !mState.mInPreLayout && ((r) (obj)).isRemoved()) goto _L4; else goto _L3
	//   17   33:aload           6
	//   18   35:invokevirtual   #335 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//   19   38:ifne            89
	//   20   41:aload           6
	//   21   43:invokevirtual   #338 <Method int RecyclerView$ViewHolder.getLayoutPosition()>
	//   22   46:iload_1         
	//   23   47:icmpne          89
	//   24   50:aload           6
	//   25   52:invokevirtual   #377 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//   26   55:ifne            89
	//   27   58:aload_0         
	//   28   59:getfield        #30  <Field RecyclerView this$0>
	//   29   62:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//   30   65:getfield        #380 <Field boolean RecyclerView$State.mInPreLayout>
	//   31   68:ifne            79
	//   32   71:aload           6
	//   33   73:invokevirtual   #358 <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//   34   76:ifne            89
_L3:
		((r) (obj)).addFlags(32);
	//   35   79:aload           6
	//   36   81:bipush          32
	//   37   83:invokevirtual   #85  <Method void RecyclerView$ViewHolder.addFlags(int)>
_L6:
		return ((r) (obj));
	//   38   86:aload           6
	//   39   88:areturn         
_L4:
		j++;
	//   40   89:iload_3         
	//   41   90:iconst_1        
	//   42   91:iadd            
	//   43   92:istore_3        
		continue; /* Loop/switch isn't completed */
	//   44   93:goto            14
_L2:
		if(!flag)
	//*  45   96:iload_2         
	//*  46   97:ifne            222
		{
			obj = ((Object) (mChildHelper.findHiddenNonRemovedView(i)));
	//   47  100:aload_0         
	//   48  101:getfield        #30  <Field RecyclerView this$0>
	//   49  104:getfield        #384 <Field ChildHelper RecyclerView.mChildHelper>
	//   50  107:iload_1         
	//   51  108:invokevirtual   #389 <Method View ChildHelper.findHiddenNonRemovedView(int)>
	//   52  111:astore          6
			if(obj != null)
	//*  53  113:aload           6
	//*  54  115:ifnull          222
			{
				r r = RecyclerView.getChildViewHolderInt(((View) (obj)));
	//   55  118:aload           6
	//   56  120:invokestatic    #197 <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//   57  123:astore          7
				mChildHelper.unhide(((View) (obj)));
	//   58  125:aload_0         
	//   59  126:getfield        #30  <Field RecyclerView this$0>
	//   60  129:getfield        #384 <Field ChildHelper RecyclerView.mChildHelper>
	//   61  132:aload           6
	//   62  134:invokevirtual   #392 <Method void ChildHelper.unhide(View)>
				i = mChildHelper.indexOfChild(((View) (obj)));
	//   63  137:aload_0         
	//   64  138:getfield        #30  <Field RecyclerView this$0>
	//   65  141:getfield        #384 <Field ChildHelper RecyclerView.mChildHelper>
	//   66  144:aload           6
	//   67  146:invokevirtual   #395 <Method int ChildHelper.indexOfChild(View)>
	//   68  149:istore_1        
				if(i == -1)
	//*  69  150:iload_1         
	//*  70  151:iconst_m1       
	//*  71  152:icmpne          194
				{
					throw new IllegalStateException((new StringBuilder()).append("layout index should not be -1 after unhiding a view:").append(((Object) (r))).append(exceptionLabel()).toString());
	//   72  155:new             #397 <Class IllegalStateException>
	//   73  158:dup             
	//   74  159:new             #201 <Class StringBuilder>
	//   75  162:dup             
	//   76  163:invokespecial   #202 <Method void StringBuilder()>
	//   77  166:ldc2            #399 <String "layout index should not be -1 after unhiding a view:">
	//   78  169:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   79  172:aload           7
	//   80  174:invokevirtual   #402 <Method StringBuilder StringBuilder.append(Object)>
	//   81  177:aload_0         
	//   82  178:getfield        #30  <Field RecyclerView this$0>
	//   83  181:invokevirtual   #212 <Method String RecyclerView.exceptionLabel()>
	//   84  184:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   85  187:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   86  190:invokespecial   #403 <Method void IllegalStateException(String)>
	//   87  193:athrow          
				} else
				{
					mChildHelper.detachViewFromParent(i);
	//   88  194:aload_0         
	//   89  195:getfield        #30  <Field RecyclerView this$0>
	//   90  198:getfield        #384 <Field ChildHelper RecyclerView.mChildHelper>
	//   91  201:iload_1         
	//   92  202:invokevirtual   #406 <Method void ChildHelper.detachViewFromParent(int)>
					scrapView(((View) (obj)));
	//   93  205:aload_0         
	//   94  206:aload           6
	//   95  208:invokevirtual   #409 <Method void scrapView(View)>
					r.addFlags(8224);
	//   96  211:aload           7
	//   97  213:sipush          8224
	//   98  216:invokevirtual   #85  <Method void RecyclerView$ViewHolder.addFlags(int)>
					return r;
	//   99  219:aload           7
	//  100  221:areturn         
				}
			}
		}
		int i1 = mCachedViews.size();
	//  101  222:aload_0         
	//  102  223:getfield        #42  <Field ArrayList mCachedViews>
	//  103  226:invokevirtual   #296 <Method int ArrayList.size()>
	//  104  229:istore          5
		int k = ((int) (flag1));
	//  105  231:iload           4
	//  106  233:istore_3        
label0:
		do
		{
label1:
			{
label2:
				{
					if(k >= i1)
						break label1;
	//  107  234:iload_3         
	//  108  235:iload           5
	//  109  237:icmpge          297
					r r1 = (r)mCachedViews.get(k);
	//  110  240:aload_0         
	//  111  241:getfield        #42  <Field ArrayList mCachedViews>
	//  112  244:iload_3         
	//  113  245:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//  114  248:checkcast       #63  <Class RecyclerView$ViewHolder>
	//  115  251:astore          7
					if(r1.isInvalid() || r1.getLayoutPosition() != i)
						break label2;
	//  116  253:aload           7
	//  117  255:invokevirtual   #377 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//  118  258:ifne            290
	//  119  261:aload           7
	//  120  263:invokevirtual   #338 <Method int RecyclerView$ViewHolder.getLayoutPosition()>
	//  121  266:iload_1         
	//  122  267:icmpne          290
					obj = ((Object) (r1));
	//  123  270:aload           7
	//  124  272:astore          6
					if(!flag)
	//* 125  274:iload_2         
	//* 126  275:ifne            86
					{
						mCachedViews.remove(k);
	//  127  278:aload_0         
	//  128  279:getfield        #42  <Field ArrayList mCachedViews>
	//  129  282:iload_3         
	//  130  283:invokevirtual   #361 <Method Object ArrayList.remove(int)>
	//  131  286:pop             
						return r1;
	//  132  287:aload           7
	//  133  289:areturn         
					}
				}
				if(true)
					break label0;
				k++;
	//  134  290:iload_3         
	//  135  291:iconst_1        
	//  136  292:iadd            
	//  137  293:istore_3        
			}
		} while(true);
	//  138  294:goto            234
		if(true) goto _L6; else goto _L5
_L5:
		return null;
	//  139  297:aconst_null     
	//  140  298:areturn         
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
		byte byte0;
		int k;
		int l;
		int i1;
		int j1;
		if(i < j)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmpge          80
		{
			byte0 = -1;
	//    3    5:iconst_m1       
	//    4    6:istore_3        
			k = j;
	//    5    7:iload_2         
	//    6    8:istore          4
			l = i;
	//    7   10:iload_1         
	//    8   11:istore          5
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
	//*  25   48:ifnull          71
	//*  26   51:aload           8
	//*  27   53:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//*  28   56:iload           5
	//*  29   58:icmplt          71
	//*  30   61:aload           8
	//*  31   63:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//*  32   66:iload           4
	//*  33   68:icmple          91
	//*  34   71:iload           6
	//*  35   73:iconst_1        
	//*  36   74:iadd            
	//*  37   75:istore          6
	//*  38   77:goto            25
		{
			byte0 = 1;
	//   39   80:iconst_1        
	//   40   81:istore_3        
			k = i;
	//   41   82:iload_1         
	//   42   83:istore          4
			l = j;
	//   43   85:iload_2         
	//   44   86:istore          5
		}
		j1 = mCachedViews.size();
		i1 = 0;
		while(i1 < j1) 
		{
			r r = (r)mCachedViews.get(i1);
			if(r != null && r.mPosition >= l && r.mPosition <= k)
	//*  45   88:goto            13
				if(r.mPosition == i)
	//*  46   91:aload           8
	//*  47   93:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//*  48   96:iload_1         
	//*  49   97:icmpne          112
					r.offsetPosition(j - i, false);
	//   50  100:aload           8
	//   51  102:iload_2         
	//   52  103:iload_1         
	//   53  104:isub            
	//   54  105:iconst_0        
	//   55  106:invokevirtual   #432 <Method void RecyclerView$ViewHolder.offsetPosition(int, boolean)>
				else
	//*  56  109:goto            71
					r.offsetPosition(((int) (byte0)), false);
	//   57  112:aload           8
	//   58  114:iload_3         
	//   59  115:iconst_0        
	//   60  116:invokevirtual   #432 <Method void RecyclerView$ViewHolder.offsetPosition(int, boolean)>
			i1++;
		}
	//*  61  119:goto            71
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
		int j;
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(r.isScrap() || r.itemView.getParent() != null)
	//*   2    3:aload_1         
	//*   3    4:invokevirtual   #475 <Method boolean RecyclerView$ViewHolder.isScrap()>
	//*   4    7:ifne            20
	//*   5   10:aload_1         
	//*   6   11:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//*   7   14:invokevirtual   #275 <Method android.view.ViewParent View.getParent()>
	//*   8   17:ifnull          95
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
	//   19   46:astore          6
			boolean flag1;
			if(r.itemView.getParent() != null)
	//*  20   48:aload_1         
	//*  21   49:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//*  22   52:invokevirtual   #275 <Method android.view.ViewParent View.getParent()>
	//*  23   55:ifnull          89
				flag1 = true;
	//   24   58:iconst_1        
	//   25   59:istore          5
			else
	//*  26   61:new             #199 <Class IllegalArgumentException>
	//*  27   64:dup             
	//*  28   65:aload           6
	//*  29   67:iload           5
	//*  30   69:invokevirtual   #483 <Method StringBuilder StringBuilder.append(boolean)>
	//*  31   72:aload_0         
	//*  32   73:getfield        #30  <Field RecyclerView this$0>
	//*  33   76:invokevirtual   #212 <Method String RecyclerView.exceptionLabel()>
	//*  34   79:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//*  35   82:invokevirtual   #215 <Method String StringBuilder.toString()>
	//*  36   85:invokespecial   #218 <Method void IllegalArgumentException(String)>
	//*  37   88:athrow          
				flag1 = false;
	//   38   89:iconst_0        
	//   39   90:istore          5
			throw new IllegalArgumentException(stringbuilder.append(flag1).append(exceptionLabel()).toString());
		}
	//*  40   92:goto            61
		if(r.isTmpDetached())
	//*  41   95:aload_1         
	//*  42   96:invokevirtual   #472 <Method boolean RecyclerView$ViewHolder.isTmpDetached()>
	//*  43   99:ifeq            140
			throw new IllegalArgumentException((new StringBuilder()).append("Tmp detached view should be removed from RecyclerView before it can be recycled: ").append(((Object) (r))).append(exceptionLabel()).toString());
	//   44  102:new             #199 <Class IllegalArgumentException>
	//   45  105:dup             
	//   46  106:new             #201 <Class StringBuilder>
	//   47  109:dup             
	//   48  110:invokespecial   #202 <Method void StringBuilder()>
	//   49  113:ldc2            #487 <String "Tmp detached view should be removed from RecyclerView before it can be recycled: ">
	//   50  116:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   51  119:aload_1         
	//   52  120:invokevirtual   #402 <Method StringBuilder StringBuilder.append(Object)>
	//   53  123:aload_0         
	//   54  124:getfield        #30  <Field RecyclerView this$0>
	//   55  127:invokevirtual   #212 <Method String RecyclerView.exceptionLabel()>
	//   56  130:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   57  133:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   58  136:invokespecial   #218 <Method void IllegalArgumentException(String)>
	//   59  139:athrow          
		if(r.shouldIgnore())
	//*  60  140:aload_1         
	//*  61  141:invokevirtual   #490 <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//*  62  144:ifeq            181
			throw new IllegalArgumentException((new StringBuilder()).append("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.").append(exceptionLabel()).toString());
	//   63  147:new             #199 <Class IllegalArgumentException>
	//   64  150:dup             
	//   65  151:new             #201 <Class StringBuilder>
	//   66  154:dup             
	//   67  155:invokespecial   #202 <Method void StringBuilder()>
	//   68  158:ldc2            #492 <String "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.">
	//   69  161:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   70  164:aload_0         
	//   71  165:getfield        #30  <Field RecyclerView this$0>
	//   72  168:invokevirtual   #212 <Method String RecyclerView.exceptionLabel()>
	//   73  171:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   74  174:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   75  177:invokespecial   #218 <Method void IllegalArgumentException(String)>
	//   76  180:athrow          
		boolean flag2 = r.access._mth900(r);
	//   77  181:aload_1         
	//   78  182:invokestatic    #496 <Method boolean RecyclerView$ViewHolder.access$900(RecyclerView$ViewHolder)>
	//   79  185:istore          5
		if(mAdapter != null && flag2 && mAdapter.onFailedToRecycleView(r))
	//*  80  187:aload_0         
	//*  81  188:getfield        #30  <Field RecyclerView this$0>
	//*  82  191:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  83  194:ifnull          412
	//*  84  197:iload           5
	//*  85  199:ifeq            412
	//*  86  202:aload_0         
	//*  87  203:getfield        #30  <Field RecyclerView this$0>
	//*  88  206:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  89  209:aload_1         
	//*  90  210:invokevirtual   #499 <Method boolean RecyclerView$Adapter.onFailedToRecycleView(RecyclerView$ViewHolder)>
	//*  91  213:ifeq            412
			i = 1;
	//   92  216:iconst_1        
	//   93  217:istore_2        
		else
	//*  94  218:iload_2         
	//*  95  219:ifne            229
	//*  96  222:aload_1         
	//*  97  223:invokevirtual   #502 <Method boolean RecyclerView$ViewHolder.isRecyclable()>
	//*  98  226:ifeq            429
	//*  99  229:aload_0         
	//* 100  230:getfield        #54  <Field int mViewCacheMax>
	//* 101  233:ifle            424
	//* 102  236:aload_1         
	//* 103  237:sipush          526
	//* 104  240:invokevirtual   #178 <Method boolean RecyclerView$ViewHolder.hasAnyOfTheFlags(int)>
	//* 105  243:ifne            424
	//* 106  246:aload_0         
	//* 107  247:getfield        #42  <Field ArrayList mCachedViews>
	//* 108  250:invokevirtual   #296 <Method int ArrayList.size()>
	//* 109  253:istore_3        
	//* 110  254:iload_3         
	//* 111  255:istore_2        
	//* 112  256:iload_3         
	//* 113  257:aload_0         
	//* 114  258:getfield        #54  <Field int mViewCacheMax>
	//* 115  261:icmplt          279
	//* 116  264:iload_3         
	//* 117  265:istore_2        
	//* 118  266:iload_3         
	//* 119  267:ifle            279
	//* 120  270:aload_0         
	//* 121  271:iconst_0        
	//* 122  272:invokevirtual   #372 <Method void recycleCachedViewAt(int)>
	//* 123  275:iload_3         
	//* 124  276:iconst_1        
	//* 125  277:isub            
	//* 126  278:istore_2        
	//* 127  279:iload_2         
	//* 128  280:istore_3        
	//* 129  281:invokestatic    #457 <Method boolean RecyclerView.access$800()>
	//* 130  284:ifeq            353
	//* 131  287:iload_2         
	//* 132  288:istore_3        
	//* 133  289:iload_2         
	//* 134  290:ifle            353
	//* 135  293:iload_2         
	//* 136  294:istore_3        
	//* 137  295:aload_0         
	//* 138  296:getfield        #30  <Field RecyclerView this$0>
	//* 139  299:getfield        #461 <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//* 140  302:aload_1         
	//* 141  303:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//* 142  306:invokevirtual   #505 <Method boolean GapWorker$LayoutPrefetchRegistryImpl.lastPrefetchIncludedPosition(int)>
	//* 143  309:ifne            353
	//* 144  312:iload_2         
	//* 145  313:iconst_1        
	//* 146  314:isub            
	//* 147  315:istore_2        
	//* 148  316:iload_2         
	//* 149  317:iflt            349
	//* 150  320:aload_0         
	//* 151  321:getfield        #42  <Field ArrayList mCachedViews>
	//* 152  324:iload_2         
	//* 153  325:invokevirtual   #300 <Method Object ArrayList.get(int)>
	//* 154  328:checkcast       #63  <Class RecyclerView$ViewHolder>
	//* 155  331:getfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//* 156  334:istore_3        
	//* 157  335:aload_0         
	//* 158  336:getfield        #30  <Field RecyclerView this$0>
	//* 159  339:getfield        #461 <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//* 160  342:iload_3         
	//* 161  343:invokevirtual   #505 <Method boolean GapWorker$LayoutPrefetchRegistryImpl.lastPrefetchIncludedPosition(int)>
	//* 162  346:ifne            417
	//* 163  349:iload_2         
	//* 164  350:iconst_1        
	//* 165  351:iadd            
	//* 166  352:istore_3        
	//* 167  353:aload_0         
	//* 168  354:getfield        #42  <Field ArrayList mCachedViews>
	//* 169  357:iload_3         
	//* 170  358:aload_1         
	//* 171  359:invokevirtual   #509 <Method void ArrayList.add(int, Object)>
	//* 172  362:iconst_1        
	//* 173  363:istore_2        
	//* 174  364:iload_2         
	//* 175  365:istore_3        
	//* 176  366:iload_2         
	//* 177  367:ifne            381
	//* 178  370:aload_0         
	//* 179  371:aload_1         
	//* 180  372:iconst_1        
	//* 181  373:invokevirtual   #468 <Method void addViewHolderToRecycledViewPool(RecyclerView$ViewHolder, boolean)>
	//* 182  376:iconst_1        
	//* 183  377:istore          4
	//* 184  379:iload_2         
	//* 185  380:istore_3        
	//* 186  381:aload_0         
	//* 187  382:getfield        #30  <Field RecyclerView this$0>
	//* 188  385:getfield        #325 <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//* 189  388:aload_1         
	//* 190  389:invokevirtual   #330 <Method void ViewInfoStore.removeViewHolder(RecyclerView$ViewHolder)>
	//* 191  392:iload_3         
	//* 192  393:ifne            411
	//* 193  396:iload           4
	//* 194  398:ifne            411
	//* 195  401:iload           5
	//* 196  403:ifeq            411
	//* 197  406:aload_1         
	//* 198  407:aconst_null     
	//* 199  408:putfield        #124 <Field RecyclerView RecyclerView$ViewHolder.mOwnerRecyclerView>
	//* 200  411:return          
			i = 0;
	//  201  412:iconst_0        
	//  202  413:istore_2        
		if(i == 0 && !r.isRecyclable())
			break MISSING_BLOCK_LABEL_429;
		if(mViewCacheMax <= 0 || r.hasAnyOfTheFlags(526)) goto _L2; else goto _L1
_L1:
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
		if(!RecyclerView.access$800()) goto _L4; else goto _L3
_L3:
		j = i;
		if(i <= 0) goto _L4; else goto _L5
_L5:
		j = i;
		if(mPrefetchRegistry.lastPrefetchIncludedPosition(r.mPosition)) goto _L4; else goto _L6
_L6:
		i--;
_L10:
		if(i < 0) goto _L8; else goto _L7
_L7:
		j = ((r)mCachedViews.get(i)).mPosition;
		if(mPrefetchRegistry.lastPrefetchIncludedPosition(j)) goto _L9; else goto _L8
_L8:
		j = i + 1;
_L4:
		mCachedViews.add(j, ((Object) (r)));
		i = 1;
_L11:
		j = i;
		if(i == 0)
		{
			addViewHolderToRecycledViewPool(r, true);
			flag = true;
			j = i;
		}
_L12:
		mViewInfoStore.removeViewHolder(r);
		if(j == 0 && !flag && flag2)
			r.mOwnerRecyclerView = null;
		return;
	//* 203  414:goto            218
_L9:
		i--;
	//  204  417:iload_2         
	//  205  418:iconst_1        
	//  206  419:isub            
	//  207  420:istore_2        
		  goto _L10
	//* 208  421:goto            316
_L2:
		i = 0;
	//  209  424:iconst_0        
	//  210  425:istore_2        
		  goto _L11
	//* 211  426:goto            364
		j = 0;
	//  212  429:iconst_0        
	//  213  430:istore_3        
		  goto _L12
	//* 214  431:goto            381
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
		boolean flag2 = true;
	//    0    0:iconst_1        
	//    1    1:istore          8
		if(i < 0 || i >= mState.getItemCount())
	//*   2    3:iload_1         
	//*   3    4:iflt            21
	//*   4    7:iload_1         
	//*   5    8:aload_0         
	//*   6    9:getfield        #30  <Field RecyclerView this$0>
	//*   7   12:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//*   8   15:invokevirtual   #245 <Method int RecyclerView$State.getItemCount()>
	//*   9   18:icmplt          88
			throw new IndexOutOfBoundsException((new StringBuilder()).append("Invalid item position ").append(i).append("(").append(i).append("). Item count:").append(mState.getItemCount()).append(exceptionLabel()).toString());
	//   10   21:new             #233 <Class IndexOutOfBoundsException>
	//   11   24:dup             
	//   12   25:new             #201 <Class StringBuilder>
	//   13   28:dup             
	//   14   29:invokespecial   #202 <Method void StringBuilder()>
	//   15   32:ldc2            #549 <String "Invalid item position ">
	//   16   35:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   17   38:iload_1         
	//   18   39:invokevirtual   #238 <Method StringBuilder StringBuilder.append(int)>
	//   19   42:ldc2            #551 <String "(">
	//   20   45:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   21   48:iload_1         
	//   22   49:invokevirtual   #238 <Method StringBuilder StringBuilder.append(int)>
	//   23   52:ldc2            #553 <String "). Item count:">
	//   24   55:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   25   58:aload_0         
	//   26   59:getfield        #30  <Field RecyclerView this$0>
	//   27   62:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//   28   65:invokevirtual   #245 <Method int RecyclerView$State.getItemCount()>
	//   29   68:invokevirtual   #238 <Method StringBuilder StringBuilder.append(int)>
	//   30   71:aload_0         
	//   31   72:getfield        #30  <Field RecyclerView this$0>
	//   32   75:invokevirtual   #212 <Method String RecyclerView.exceptionLabel()>
	//   33   78:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//   34   81:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   35   84:invokespecial   #246 <Method void IndexOutOfBoundsException(String)>
	//   36   87:athrow          
		boolean flag1;
		int j;
		int k;
		long l1;
		long l2;
		Object obj;
		Object obj1;
		View view;
		if(mState.isPreLayout())
	//*  37   88:aload_0         
	//*  38   89:getfield        #30  <Field RecyclerView this$0>
	//*  39   92:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//*  40   95:invokevirtual   #166 <Method boolean RecyclerView$State.isPreLayout()>
	//*  41   98:ifeq            1049
		{
			obj1 = ((Object) (getChangedScrapViewForPosition(i)));
	//   42  101:aload_0         
	//   43  102:iload_1         
	//   44  103:invokevirtual   #555 <Method RecyclerView$ViewHolder getChangedScrapViewForPosition(int)>
	//   45  106:astore          14
			if(obj1 != null)
	//*  46  108:aload           14
	//*  47  110:ifnull          320
				flag1 = true;
	//   48  113:iconst_1        
	//   49  114:istore          5
			else
	//*  50  116:iload           5
	//*  51  118:istore          6
	//*  52  120:aload           14
	//*  53  122:astore          13
	//*  54  124:iload           6
	//*  55  126:istore          5
	//*  56  128:aload           14
	//*  57  130:ifnonnull       212
	//*  58  133:aload_0         
	//*  59  134:iload_1         
	//*  60  135:iload_2         
	//*  61  136:invokevirtual   #557 <Method RecyclerView$ViewHolder getScrapOrHiddenOrCachedHolderForPosition(int, boolean)>
	//*  62  139:astore          14
	//*  63  141:aload           14
	//*  64  143:astore          13
	//*  65  145:iload           6
	//*  66  147:istore          5
	//*  67  149:aload           14
	//*  68  151:ifnull          212
	//*  69  154:aload_0         
	//*  70  155:aload           14
	//*  71  157:invokevirtual   #560 <Method boolean validateViewHolderForOffsetPosition(RecyclerView$ViewHolder)>
	//*  72  160:ifne            342
	//*  73  163:iload_2         
	//*  74  164:ifne            205
	//*  75  167:aload           14
	//*  76  169:iconst_4        
	//*  77  170:invokevirtual   #85  <Method void RecyclerView$ViewHolder.addFlags(int)>
	//*  78  173:aload           14
	//*  79  175:invokevirtual   #475 <Method boolean RecyclerView$ViewHolder.isScrap()>
	//*  80  178:ifeq            326
	//*  81  181:aload_0         
	//*  82  182:getfield        #30  <Field RecyclerView this$0>
	//*  83  185:aload           14
	//*  84  187:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//*  85  190:iconst_0        
	//*  86  191:invokevirtual   #365 <Method void RecyclerView.removeDetachedView(View, boolean)>
	//*  87  194:aload           14
	//*  88  196:invokevirtual   #478 <Method void RecyclerView$ViewHolder.unScrap()>
	//*  89  199:aload_0         
	//*  90  200:aload           14
	//*  91  202:invokevirtual   #454 <Method void recycleViewHolderInternal(RecyclerView$ViewHolder)>
	//*  92  205:aconst_null     
	//*  93  206:astore          13
	//*  94  208:iload           6
	//*  95  210:istore          5
	//*  96  212:aload           13
	//*  97  214:ifnonnull       1042
	//*  98  217:aload_0         
	//*  99  218:getfield        #30  <Field RecyclerView this$0>
	//* 100  221:getfield        #222 <Field AdapterHelper RecyclerView.mAdapterHelper>
	//* 101  224:iload_1         
	//* 102  225:invokevirtual   #228 <Method int AdapterHelper.findPositionOffset(int)>
	//* 103  228:istore          7
	//* 104  230:iload           7
	//* 105  232:iflt            250
	//* 106  235:iload           7
	//* 107  237:aload_0         
	//* 108  238:getfield        #30  <Field RecyclerView this$0>
	//* 109  241:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//* 110  244:invokevirtual   #231 <Method int RecyclerView$Adapter.getItemCount()>
	//* 111  247:icmplt          352
	//* 112  250:new             #233 <Class IndexOutOfBoundsException>
	//* 113  253:dup             
	//* 114  254:new             #201 <Class StringBuilder>
	//* 115  257:dup             
	//* 116  258:invokespecial   #202 <Method void StringBuilder()>
	//* 117  261:ldc1            #235 <String "Inconsistency detected. Invalid item position ">
	//* 118  263:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//* 119  266:iload_1         
	//* 120  267:invokevirtual   #238 <Method StringBuilder StringBuilder.append(int)>
	//* 121  270:ldc1            #240 <String "(offset:">
	//* 122  272:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//* 123  275:iload           7
	//* 124  277:invokevirtual   #238 <Method StringBuilder StringBuilder.append(int)>
	//* 125  280:ldc1            #242 <String ").">
	//* 126  282:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//* 127  285:ldc1            #244 <String "state:">
	//* 128  287:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//* 129  290:aload_0         
	//* 130  291:getfield        #30  <Field RecyclerView this$0>
	//* 131  294:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//* 132  297:invokevirtual   #245 <Method int RecyclerView$State.getItemCount()>
	//* 133  300:invokevirtual   #238 <Method StringBuilder StringBuilder.append(int)>
	//* 134  303:aload_0         
	//* 135  304:getfield        #30  <Field RecyclerView this$0>
	//* 136  307:invokevirtual   #212 <Method String RecyclerView.exceptionLabel()>
	//* 137  310:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//* 138  313:invokevirtual   #215 <Method String StringBuilder.toString()>
	//* 139  316:invokespecial   #246 <Method void IndexOutOfBoundsException(String)>
	//* 140  319:athrow          
				flag1 = false;
	//  141  320:iconst_0        
	//  142  321:istore          5
			j = ((int) (flag1));
		} else
	//* 143  323:goto            116
	//* 144  326:aload           14
	//* 145  328:invokevirtual   #335 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//* 146  331:ifeq            199
	//* 147  334:aload           14
	//* 148  336:invokevirtual   #451 <Method void RecyclerView$ViewHolder.clearReturnedFromScrapFlag()>
	//* 149  339:goto            199
	//* 150  342:iconst_1        
	//* 151  343:istore          5
	//* 152  345:aload           14
	//* 153  347:astore          13
	//* 154  349:goto            212
	//* 155  352:aload_0         
	//* 156  353:getfield        #30  <Field RecyclerView this$0>
	//* 157  356:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//* 158  359:iload           7
	//* 159  361:invokevirtual   #562 <Method int RecyclerView$Adapter.getItemViewType(int)>
	//* 160  364:istore          6
	//* 161  366:aload_0         
	//* 162  367:getfield        #30  <Field RecyclerView this$0>
	//* 163  370:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//* 164  373:invokevirtual   #341 <Method boolean RecyclerView$Adapter.hasStableIds()>
	//* 165  376:ifeq            1035
	//* 166  379:aload_0         
	//* 167  380:aload_0         
	//* 168  381:getfield        #30  <Field RecyclerView this$0>
	//* 169  384:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//* 170  387:iload           7
	//* 171  389:invokevirtual   #345 <Method long RecyclerView$Adapter.getItemId(int)>
	//* 172  392:iload           6
	//* 173  394:iload_2         
	//* 174  395:invokevirtual   #564 <Method RecyclerView$ViewHolder getScrapOrCachedViewForId(long, int, boolean)>
	//* 175  398:astore          14
	//* 176  400:aload           14
	//* 177  402:astore          13
	//* 178  404:aload           14
	//* 179  406:ifnull          1035
	//* 180  409:aload           14
	//* 181  411:iload           7
	//* 182  413:putfield        #428 <Field int RecyclerView$ViewHolder.mPosition>
	//* 183  416:iconst_1        
	//* 184  417:istore          5
	//* 185  419:aload           14
	//* 186  421:astore          13
	//* 187  423:aload           14
	//* 188  425:ifnonnull       557
	//* 189  428:aload           14
	//* 190  430:astore          13
	//* 191  432:aload_0         
	//* 192  433:getfield        #542 <Field RecyclerView$ViewCacheExtension mViewCacheExtension>
	//* 193  436:ifnull          557
	//* 194  439:aload_0         
	//* 195  440:getfield        #542 <Field RecyclerView$ViewCacheExtension mViewCacheExtension>
	//* 196  443:aload_0         
	//* 197  444:iload_1         
	//* 198  445:iload           6
	//* 199  447:invokevirtual   #570 <Method View RecyclerView$ViewCacheExtension.getViewForPositionAndType(RecyclerView$Recycler, int, int)>
	//* 200  450:astore          15
	//* 201  452:aload           14
	//* 202  454:astore          13
	//* 203  456:aload           15
	//* 204  458:ifnull          557
	//* 205  461:aload_0         
	//* 206  462:getfield        #30  <Field RecyclerView this$0>
	//* 207  465:aload           15
	//* 208  467:invokevirtual   #573 <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolder(View)>
	//* 209  470:astore          14
	//* 210  472:aload           14
	//* 211  474:ifnonnull       511
	//* 212  477:new             #199 <Class IllegalArgumentException>
	//* 213  480:dup             
	//* 214  481:new             #201 <Class StringBuilder>
	//* 215  484:dup             
	//* 216  485:invokespecial   #202 <Method void StringBuilder()>
	//* 217  488:ldc2            #575 <String "getViewForPositionAndType returned a view which does not have a ViewHolder">
	//* 218  491:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//* 219  494:aload_0         
	//* 220  495:getfield        #30  <Field RecyclerView this$0>
	//* 221  498:invokevirtual   #212 <Method String RecyclerView.exceptionLabel()>
	//* 222  501:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//* 223  504:invokevirtual   #215 <Method String StringBuilder.toString()>
	//* 224  507:invokespecial   #218 <Method void IllegalArgumentException(String)>
	//* 225  510:athrow          
	//* 226  511:aload           14
	//* 227  513:astore          13
	//* 228  515:aload           14
	//* 229  517:invokevirtual   #490 <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//* 230  520:ifeq            557
	//* 231  523:new             #199 <Class IllegalArgumentException>
	//* 232  526:dup             
	//* 233  527:new             #201 <Class StringBuilder>
	//* 234  530:dup             
	//* 235  531:invokespecial   #202 <Method void StringBuilder()>
	//* 236  534:ldc2            #577 <String "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.">
	//* 237  537:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//* 238  540:aload_0         
	//* 239  541:getfield        #30  <Field RecyclerView this$0>
	//* 240  544:invokevirtual   #212 <Method String RecyclerView.exceptionLabel()>
	//* 241  547:invokevirtual   #208 <Method StringBuilder StringBuilder.append(String)>
	//* 242  550:invokevirtual   #215 <Method String StringBuilder.toString()>
	//* 243  553:invokespecial   #218 <Method void IllegalArgumentException(String)>
	//* 244  556:athrow          
	//* 245  557:aload           13
	//* 246  559:astore          14
	//* 247  561:aload           13
	//* 248  563:ifnonnull       611
	//* 249  566:aload_0         
	//* 250  567:invokevirtual   #189 <Method RecyclerView$RecycledViewPool getRecycledViewPool()>
	//* 251  570:iload           6
	//* 252  572:invokevirtual   #580 <Method RecyclerView$ViewHolder RecyclerView$RecycledViewPool.getRecycledView(int)>
	//* 253  575:astore          13
	//* 254  577:aload           13
	//* 255  579:astore          14
	//* 256  581:aload           13
	//* 257  583:ifnull          611
	//* 258  586:aload           13
	//* 259  588:invokevirtual   #583 <Method void RecyclerView$ViewHolder.resetInternal()>
	//* 260  591:aload           13
	//* 261  593:astore          14
	//* 262  595:getstatic       #586 <Field boolean RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST>
	//* 263  598:ifeq            611
	//* 264  601:aload_0         
	//* 265  602:aload           13
	//* 266  604:invokespecial   #588 <Method void invalidateDisplayListInt(RecyclerView$ViewHolder)>
	//* 267  607:aload           13
	//* 268  609:astore          14
	//* 269  611:aload           14
	//* 270  613:astore          13
	//* 271  615:aload           14
	//* 272  617:ifnonnull       730
	//* 273  620:aload_0         
	//* 274  621:getfield        #30  <Field RecyclerView this$0>
	//* 275  624:invokevirtual   #131 <Method long RecyclerView.getNanoTime()>
	//* 276  627:lstore          9
	//* 277  629:lload_3         
	//* 278  630:ldc2w           #132 <Long 0xffffffffL>
	//* 279  633:lcmp            
	//* 280  634:ifeq            654
	//* 281  637:aload_0         
	//* 282  638:getfield        #135 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//* 283  641:iload           6
	//* 284  643:lload           9
	//* 285  645:lload_3         
	//* 286  646:invokevirtual   #591 <Method boolean RecyclerView$RecycledViewPool.willCreateInTime(int, long, long)>
	//* 287  649:ifne            654
	//* 288  652:aconst_null     
	//* 289  653:areturn         
	//* 290  654:aload_0         
	//* 291  655:getfield        #30  <Field RecyclerView this$0>
	//* 292  658:getfield        #145 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//* 293  661:aload_0         
	//* 294  662:getfield        #30  <Field RecyclerView this$0>
	//* 295  665:iload           6
	//* 296  667:invokevirtual   #595 <Method RecyclerView$ViewHolder RecyclerView$Adapter.createViewHolder(ViewGroup, int)>
	//* 297  670:astore          13
	//* 298  672:invokestatic    #457 <Method boolean RecyclerView.access$800()>
	//* 299  675:ifeq            707
	//* 300  678:aload           13
	//* 301  680:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//* 302  683:invokestatic    #599 <Method RecyclerView RecyclerView.findNestedRecyclerView(View)>
	//* 303  686:astore          14
	//* 304  688:aload           14
	//* 305  690:ifnull          707
	//* 306  693:aload           13
	//* 307  695:new             #601 <Class WeakReference>
	//* 308  698:dup             
	//* 309  699:aload           14
	//* 310  701:invokespecial   #603 <Method void WeakReference(Object)>
	//* 311  704:putfield        #607 <Field WeakReference RecyclerView$ViewHolder.mNestedRecyclerView>
	//* 312  707:aload_0         
	//* 313  708:getfield        #30  <Field RecyclerView this$0>
	//* 314  711:invokevirtual   #131 <Method long RecyclerView.getNanoTime()>
	//* 315  714:lstore          11
	//* 316  716:aload_0         
	//* 317  717:getfield        #135 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//* 318  720:iload           6
	//* 319  722:lload           11
	//* 320  724:lload           9
	//* 321  726:lsub            
	//* 322  727:invokevirtual   #610 <Method void RecyclerView$RecycledViewPool.factorInCreateTime(int, long)>
	//* 323  730:aload           13
	//* 324  732:astore          14
	//* 325  734:iload           5
	//* 326  736:ifeq            835
	//* 327  739:aload_0         
	//* 328  740:getfield        #30  <Field RecyclerView this$0>
	//* 329  743:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//* 330  746:invokevirtual   #166 <Method boolean RecyclerView$State.isPreLayout()>
	//* 331  749:ifne            835
	//* 332  752:aload           14
	//* 333  754:sipush          8192
	//* 334  757:invokevirtual   #178 <Method boolean RecyclerView$ViewHolder.hasAnyOfTheFlags(int)>
	//* 335  760:ifeq            835
	//* 336  763:aload           14
	//* 337  765:iconst_0        
	//* 338  766:sipush          8192
	//* 339  769:invokevirtual   #182 <Method void RecyclerView$ViewHolder.setFlags(int, int)>
	//* 340  772:aload_0         
	//* 341  773:getfield        #30  <Field RecyclerView this$0>
	//* 342  776:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//* 343  779:getfield        #613 <Field boolean RecyclerView$State.mRunSimpleAnimations>
	//* 344  782:ifeq            835
	//* 345  785:aload           14
	//* 346  787:invokestatic    #619 <Method int RecyclerView$ItemAnimator.buildAdapterChangeFlagsForAnimations(RecyclerView$ViewHolder)>
	//* 347  790:istore          6
	//* 348  792:aload_0         
	//* 349  793:getfield        #30  <Field RecyclerView this$0>
	//* 350  796:getfield        #623 <Field RecyclerView$ItemAnimator RecyclerView.mItemAnimator>
	//* 351  799:aload_0         
	//* 352  800:getfield        #30  <Field RecyclerView this$0>
	//* 353  803:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//* 354  806:aload           14
	//* 355  808:iload           6
	//* 356  810:sipush          4096
	//* 357  813:ior             
	//* 358  814:aload           14
	//* 359  816:invokevirtual   #626 <Method List RecyclerView$ViewHolder.getUnmodifiedPayloads()>
	//* 360  819:invokevirtual   #630 <Method RecyclerView$ItemAnimator$ItemHolderInfo RecyclerView$ItemAnimator.recordPreLayoutInformation(RecyclerView$State, RecyclerView$ViewHolder, int, List)>
	//* 361  822:astore          13
	//* 362  824:aload_0         
	//* 363  825:getfield        #30  <Field RecyclerView this$0>
	//* 364  828:aload           14
	//* 365  830:aload           13
	//* 366  832:invokevirtual   #634 <Method void RecyclerView.recordAnimationInfoIfBouncedHiddenView(RecyclerView$ViewHolder, RecyclerView$ItemAnimator$ItemHolderInfo)>
	//* 367  835:aload_0         
	//* 368  836:getfield        #30  <Field RecyclerView this$0>
	//* 369  839:getfield        #161 <Field RecyclerView$State RecyclerView.mState>
	//* 370  842:invokevirtual   #166 <Method boolean RecyclerView$State.isPreLayout()>
	//* 371  845:ifeq            929
	//* 372  848:aload           14
	//* 373  850:invokevirtual   #637 <Method boolean RecyclerView$ViewHolder.isBound()>
	//* 374  853:ifeq            929
	//* 375  856:aload           14
	//* 376  858:iload_1         
	//* 377  859:putfield        #169 <Field int RecyclerView$ViewHolder.mPreLayoutPosition>
	//* 378  862:iconst_0        
	//* 379  863:istore_2        
	//* 380  864:aload           14
	//* 381  866:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//* 382  869:invokevirtual   #254 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 383  872:astore          13
	//* 384  874:aload           13
	//* 385  876:ifnonnull       976
	//* 386  879:aload_0         
	//* 387  880:getfield        #30  <Field RecyclerView this$0>
	//* 388  883:invokevirtual   #257 <Method android.view.ViewGroup$LayoutParams RecyclerView.generateDefaultLayoutParams()>
	//* 389  886:checkcast       #259 <Class RecyclerView$LayoutParams>
	//* 390  889:astore          13
	//* 391  891:aload           14
	//* 392  893:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//* 393  896:aload           13
	//* 394  898:invokevirtual   #263 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 395  901:aload           13
	//* 396  903:aload           14
	//* 397  905:putfield        #271 <Field RecyclerView$ViewHolder RecyclerView$LayoutParams.mViewHolder>
	//* 398  908:iload           5
	//* 399  910:ifeq            1025
	//* 400  913:iload_2         
	//* 401  914:ifeq            1025
	//* 402  917:iload           8
	//* 403  919:istore_2        
	//* 404  920:aload           13
	//* 405  922:iload_2         
	//* 406  923:putfield        #278 <Field boolean RecyclerView$LayoutParams.mPendingInvalidate>
	//* 407  926:aload           14
	//* 408  928:areturn         
	//* 409  929:aload           14
	//* 410  931:invokevirtual   #637 <Method boolean RecyclerView$ViewHolder.isBound()>
	//* 411  934:ifeq            953
	//* 412  937:aload           14
	//* 413  939:invokevirtual   #640 <Method boolean RecyclerView$ViewHolder.needsUpdate()>
	//* 414  942:ifne            953
	//* 415  945:aload           14
	//* 416  947:invokevirtual   #377 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//* 417  950:ifeq            1030
	//* 418  953:aload_0         
	//* 419  954:aload           14
	//* 420  956:aload_0         
	//* 421  957:getfield        #30  <Field RecyclerView this$0>
	//* 422  960:getfield        #222 <Field AdapterHelper RecyclerView.mAdapterHelper>
	//* 423  963:iload_1         
	//* 424  964:invokevirtual   #228 <Method int AdapterHelper.findPositionOffset(int)>
	//* 425  967:iload_1         
	//* 426  968:lload_3         
	//* 427  969:invokespecial   #248 <Method boolean tryBindViewHolderByDeadline(RecyclerView$ViewHolder, int, int, long)>
	//* 428  972:istore_2        
	//* 429  973:goto            864
	//* 430  976:aload_0         
	//* 431  977:getfield        #30  <Field RecyclerView this$0>
	//* 432  980:aload           13
	//* 433  982:invokevirtual   #282 <Method boolean RecyclerView.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 434  985:ifne            1015
	//* 435  988:aload_0         
	//* 436  989:getfield        #30  <Field RecyclerView this$0>
	//* 437  992:aload           13
	//* 438  994:invokevirtual   #286 <Method android.view.ViewGroup$LayoutParams RecyclerView.generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 439  997:checkcast       #259 <Class RecyclerView$LayoutParams>
	//* 440 1000:astore          13
	//* 441 1002:aload           14
	//* 442 1004:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//* 443 1007:aload           13
	//* 444 1009:invokevirtual   #263 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 445 1012:goto            901
	//* 446 1015:aload           13
	//* 447 1017:checkcast       #259 <Class RecyclerView$LayoutParams>
	//* 448 1020:astore          13
	//* 449 1022:goto            901
	//* 450 1025:iconst_0        
	//* 451 1026:istore_2        
	//* 452 1027:goto            920
	//* 453 1030:iconst_0        
	//* 454 1031:istore_2        
	//* 455 1032:goto            864
	//* 456 1035:aload           13
	//* 457 1037:astore          14
	//* 458 1039:goto            419
	//* 459 1042:aload           13
	//* 460 1044:astore          14
	//* 461 1046:goto            734
		{
			obj1 = null;
	//  462 1049:aconst_null     
	//  463 1050:astore          14
			j = 0;
	//  464 1052:iconst_0        
	//  465 1053:istore          6
		}
		obj = obj1;
		flag1 = ((boolean) (j));
		if(obj1 == null)
		{
			obj1 = ((Object) (getScrapOrHiddenOrCachedHolderForPosition(i, flag)));
			obj = obj1;
			flag1 = ((boolean) (j));
			if(obj1 != null)
				if(!validateViewHolderForOffsetPosition(((r) (obj1))))
				{
					if(!flag)
					{
						((r) (obj1)).addFlags(4);
						if(((r) (obj1)).isScrap())
						{
							removeDetachedView(((r) (obj1)).itemView, false);
							((r) (obj1)).unScrap();
						} else
						if(((r) (obj1)).wasReturnedFromScrap())
							((r) (obj1)).clearReturnedFromScrapFlag();
						recycleViewHolderInternal(((r) (obj1)));
					}
					obj = null;
					flag1 = ((boolean) (j));
				} else
				{
					flag1 = true;
					obj = obj1;
				}
		}
		if(obj != null)
			break MISSING_BLOCK_LABEL_1042;
		k = mAdapterHelper.findPositionOffset(i);
		if(k < 0 || k >= mAdapter.getItemCount())
			throw new IndexOutOfBoundsException((new StringBuilder()).append("Inconsistency detected. Invalid item position ").append(i).append("(offset:").append(k).append(").").append("state:").append(mState.getItemCount()).append(exceptionLabel()).toString());
		j = mAdapter.getItemViewType(k);
		if(!mAdapter.hasStableIds()) goto _L2; else goto _L1
_L1:
		obj1 = ((Object) (getScrapOrCachedViewForId(mAdapter.getItemId(k), j, flag)));
		obj = obj1;
		if(obj1 == null) goto _L2; else goto _L3
_L3:
		obj1.mPosition = k;
		flag1 = true;
_L4:
		obj = obj1;
		if(obj1 == null)
		{
			obj = obj1;
			if(mViewCacheExtension != null)
			{
				view = mViewCacheExtension.getViewForPositionAndType(this, i, j);
				obj = obj1;
				if(view != null)
				{
					obj1 = ((Object) (getChildViewHolder(view)));
					if(obj1 == null)
						throw new IllegalArgumentException((new StringBuilder()).append("getViewForPositionAndType returned a view which does not have a ViewHolder").append(exceptionLabel()).toString());
					obj = obj1;
					if(((r) (obj1)).shouldIgnore())
						throw new IllegalArgumentException((new StringBuilder()).append("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.").append(exceptionLabel()).toString());
				}
			}
		}
		obj1 = obj;
		if(obj == null)
		{
			obj = ((Object) (getRecycledViewPool().getRecycledView(j)));
			obj1 = obj;
			if(obj != null)
			{
				((r) (obj)).resetInternal();
				obj1 = obj;
				if(RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST)
				{
					invalidateDisplayListInt(((r) (obj)));
					obj1 = obj;
				}
			}
		}
		obj = obj1;
		if(obj1 == null)
		{
			l1 = getNanoTime();
			if(l != 0xffffffffL && !mRecyclerPool.willCreateInTime(j, l1, l))
				return null;
			obj = ((Object) (mAdapter.createViewHolder(((ViewGroup) (RecyclerView.this)), j)));
			if(RecyclerView.access$800())
			{
				obj1 = ((Object) (RecyclerView.findNestedRecyclerView(((r) (obj)).itemView)));
				if(obj1 != null)
					obj.mNestedRecyclerView = new WeakReference(obj1);
			}
			l2 = getNanoTime();
			mRecyclerPool.factorInCreateTime(j, l2 - l1);
		}
		obj1 = obj;
_L5:
		if(flag1 && !mState.isPreLayout() && ((r) (obj1)).hasAnyOfTheFlags(8192))
		{
			((r) (obj1)).setFlags(0, 8192);
			if(mState.mRunSimpleAnimations)
			{
				j = tor.buildAdapterChangeFlagsForAnimations(((r) (obj1)));
				obj = ((Object) (mItemAnimator.recordPreLayoutInformation(mState, ((r) (obj1)), j | 0x1000, ((r) (obj1)).getUnmodifiedPayloads())));
				recordAnimationInfoIfBouncedHiddenView(((r) (obj1)), ((tor.ItemHolderInfo) (obj)));
			}
		}
		if(mState.isPreLayout() && ((r) (obj1)).isBound())
		{
			obj1.mPreLayoutPosition = i;
			flag = false;
		} else
		if(!((r) (obj1)).isBound() || ((r) (obj1)).needsUpdate() || ((r) (obj1)).isInvalid())
			flag = tryBindViewHolderByDeadline(((r) (obj1)), mAdapterHelper.findPositionOffset(i), i, l);
		else
			flag = false;
		obj = ((Object) (((r) (obj1)).itemView.getLayoutParams()));
		if(obj == null)
		{
			obj = ((Object) ((ams)generateDefaultLayoutParams()));
			((r) (obj1)).itemView.setLayoutParams(((android.view.) (obj)));
		} else
		if(!checkLayoutParams(((android.view.) (obj))))
		{
			obj = ((Object) ((ams)generateLayoutParams(((android.view.) (obj)))));
			((r) (obj1)).itemView.setLayoutParams(((android.view.) (obj)));
		} else
		{
			obj = ((Object) ((ams)obj));
		}
		obj.mViewHolder = ((r) (obj1));
		if(flag1 && flag)
			flag = flag2;
		else
			flag = false;
		obj.mPendingInvalidate = flag;
		return ((r) (obj1));
_L2:
		obj1 = obj;
		  goto _L4
		obj1 = obj;
		  goto _L5
	//* 466 1055:goto            120
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
	//*  10   22:iload_1         
	//*  11   23:aload_0         
	//*  12   24:getfield        #52  <Field int mRequestedCacheMax>
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
		mViewCacheMax = i + mRequestedCacheMax;
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
