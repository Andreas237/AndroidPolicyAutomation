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
	//*   1    1:getfield        #28  <Field RecyclerView this$0>
	//*   2    4:invokevirtual   #59  <Method boolean RecyclerView.isAccessibilityEnabled()>
	//*   3    7:ifeq            55
		{
			View view = r.itemView;
	//    4   10:aload_1         
	//    5   11:getfield        #65  <Field View RecyclerView$ViewHolder.itemView>
	//    6   14:astore_2        
			if(ViewCompat.getImportantForAccessibility(view) == 0)
	//*   7   15:aload_2         
	//*   8   16:invokestatic    #71  <Method int ViewCompat.getImportantForAccessibility(View)>
	//*   9   19:ifne            27
				ViewCompat.setImportantForAccessibility(view, 1);
	//   10   22:aload_2         
	//   11   23:iconst_1        
	//   12   24:invokestatic    #75  <Method void ViewCompat.setImportantForAccessibility(View, int)>
			if(!ViewCompat.hasAccessibilityDelegate(view))
	//*  13   27:aload_2         
	//*  14   28:invokestatic    #79  <Method boolean ViewCompat.hasAccessibilityDelegate(View)>
	//*  15   31:ifne            55
			{
				r.addFlags(16384);
	//   16   34:aload_1         
	//   17   35:sipush          16384
	//   18   38:invokevirtual   #83  <Method void RecyclerView$ViewHolder.addFlags(int)>
				ViewCompat.setAccessibilityDelegate(view, mAccessibilityDelegate.getItemDelegate());
	//   19   41:aload_2         
	//   20   42:aload_0         
	//   21   43:getfield        #28  <Field RecyclerView this$0>
	//   22   46:getfield        #87  <Field RecyclerViewAccessibilityDelegate RecyclerView.mAccessibilityDelegate>
	//   23   49:invokevirtual   #93  <Method android.support.v4.view.AccessibilityDelegateCompat RecyclerViewAccessibilityDelegate.getItemDelegate()>
	//   24   52:invokestatic    #97  <Method void ViewCompat.setAccessibilityDelegate(View, android.support.v4.view.AccessibilityDelegateCompat)>
			}
		}
	//   25   55:return          
	}

	private void invalidateDisplayListInt(r r)
	{
		if(r.itemView instanceof ViewGroup)
	//*   0    0:aload_1         
	//*   1    1:getfield        #65  <Field View RecyclerView$ViewHolder.itemView>
	//*   2    4:instanceof      #100 <Class ViewGroup>
	//*   3    7:ifeq            22
			invalidateDisplayListInt((ViewGroup)r.itemView, false);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:getfield        #65  <Field View RecyclerView$ViewHolder.itemView>
	//    7   15:checkcast       #100 <Class ViewGroup>
	//    8   18:iconst_0        
	//    9   19:invokespecial   #103 <Method void invalidateDisplayListInt(ViewGroup, boolean)>
	//   10   22:return          
	}

	private void invalidateDisplayListInt(ViewGroup viewgroup, boolean flag)
	{
		for(int i = viewgroup.getChildCount() - 1; i >= 0; i--)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #107 <Method int ViewGroup.getChildCount()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_3        
	//*   5    7:iload_3         
	//*   6    8:iflt            43
		{
			View view = viewgroup.getChildAt(i);
	//    7   11:aload_1         
	//    8   12:iload_3         
	//    9   13:invokevirtual   #111 <Method View ViewGroup.getChildAt(int)>
	//   10   16:astore          4
			if(view instanceof ViewGroup)
	//*  11   18:aload           4
	//*  12   20:instanceof      #100 <Class ViewGroup>
	//*  13   23:ifeq            36
				invalidateDisplayListInt((ViewGroup)view, true);
	//   14   26:aload_0         
	//   15   27:aload           4
	//   16   29:checkcast       #100 <Class ViewGroup>
	//   17   32:iconst_1        
	//   18   33:invokespecial   #103 <Method void invalidateDisplayListInt(ViewGroup, boolean)>
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
	//*  28   49:invokevirtual   #114 <Method int ViewGroup.getVisibility()>
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
	//   39   68:invokevirtual   #114 <Method int ViewGroup.getVisibility()>
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
	//    2    2:getfield        #28  <Field RecyclerView this$0>
	//    3    5:putfield        #123 <Field RecyclerView RecyclerView$ViewHolder.mOwnerRecyclerView>
		int k = r.getItemViewType();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #126 <Method int RecyclerView$ViewHolder.getItemViewType()>
	//    6   12:istore          6
		long l1 = getNanoTime();
	//    7   14:aload_0         
	//    8   15:getfield        #28  <Field RecyclerView this$0>
	//    9   18:invokevirtual   #130 <Method long RecyclerView.getNanoTime()>
	//   10   21:lstore          7
		if(l != 0xffffffffL && !mRecyclerPool.willBindInTime(k, l1, l))
	//*  11   23:lload           4
	//*  12   25:ldc2w           #131 <Long 0xffffffffL>
	//*  13   28:lcmp            
	//*  14   29:ifeq            50
	//*  15   32:aload_0         
	//*  16   33:getfield        #134 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//*  17   36:iload           6
	//*  18   38:lload           7
	//*  19   40:lload           4
	//*  20   42:invokevirtual   #140 <Method boolean RecyclerView$RecycledViewPool.willBindInTime(int, long, long)>
	//*  21   45:ifne            50
			return false;
	//   22   48:iconst_0        
	//   23   49:ireturn         
		mAdapter.bindViewHolder(r, i);
	//   24   50:aload_0         
	//   25   51:getfield        #28  <Field RecyclerView this$0>
	//   26   54:getfield        #144 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   27   57:aload_1         
	//   28   58:iload_2         
	//   29   59:invokevirtual   #150 <Method void RecyclerView$Adapter.bindViewHolder(RecyclerView$ViewHolder, int)>
		l = getNanoTime();
	//   30   62:aload_0         
	//   31   63:getfield        #28  <Field RecyclerView this$0>
	//   32   66:invokevirtual   #130 <Method long RecyclerView.getNanoTime()>
	//   33   69:lstore          4
		mRecyclerPool.factorInBindTime(r.getItemViewType(), l - l1);
	//   34   71:aload_0         
	//   35   72:getfield        #134 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//   36   75:aload_1         
	//   37   76:invokevirtual   #126 <Method int RecyclerView$ViewHolder.getItemViewType()>
	//   38   79:lload           4
	//   39   81:lload           7
	//   40   83:lsub            
	//   41   84:invokevirtual   #154 <Method void RecyclerView$RecycledViewPool.factorInBindTime(int, long)>
		attachAccessibilityDelegateOnBind(r);
	//   42   87:aload_0         
	//   43   88:aload_1         
	//   44   89:invokespecial   #156 <Method void attachAccessibilityDelegateOnBind(RecyclerView$ViewHolder)>
		if(mState.isPreLayout())
	//*  45   92:aload_0         
	//*  46   93:getfield        #28  <Field RecyclerView this$0>
	//*  47   96:getfield        #160 <Field RecyclerView$State RecyclerView.mState>
	//*  48   99:invokevirtual   #165 <Method boolean RecyclerView$State.isPreLayout()>
	//*  49  102:ifeq            110
			r.mPreLayoutPosition = j;
	//   50  105:aload_1         
	//   51  106:iload_3         
	//   52  107:putfield        #168 <Field int RecyclerView$ViewHolder.mPreLayoutPosition>
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
	//   11   23:getfield        #65  <Field View RecyclerView$ViewHolder.itemView>
	//   12   26:aconst_null     
	//   13   27:invokestatic    #97  <Method void ViewCompat.setAccessibilityDelegate(View, android.support.v4.view.AccessibilityDelegateCompat)>
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
	//   21   41:putfield        #123 <Field RecyclerView RecyclerView$ViewHolder.mOwnerRecyclerView>
		getRecycledViewPool().putRecycledView(r);
	//   22   44:aload_0         
	//   23   45:invokevirtual   #189 <Method RecyclerView$RecycledViewPool getRecycledViewPool()>
	//   24   48:aload_1         
	//   25   49:invokevirtual   #192 <Method void RecyclerView$RecycledViewPool.putRecycledView(RecyclerView$ViewHolder)>
	//   26   52:return          
	}

	public void clear()
	{
		mAttachedScrap.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ArrayList mAttachedScrap>
	//    2    4:invokevirtual   #195 <Method void ArrayList.clear()>
		recycleAndClearCachedViews();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #198 <Method void recycleAndClearCachedViews()>
	//    5   11:return          
	}

	void clearOldPositions()
	{
		int l = mCachedViews.size();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field ArrayList mCachedViews>
	//    2    4:invokevirtual   #202 <Method int ArrayList.size()>
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
	//   12   18:getfield        #40  <Field ArrayList mCachedViews>
	//   13   21:iload_1         
	//   14   22:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   15   25:checkcast       #61  <Class RecyclerView$ViewHolder>
	//   16   28:invokevirtual   #209 <Method void RecyclerView$ViewHolder.clearOldPosition()>

	//   17   31:iload_1         
	//   18   32:iconst_1        
	//   19   33:iadd            
	//   20   34:istore_1        
	//*  21   35:goto            12
		l = mAttachedScrap.size();
	//   22   38:aload_0         
	//   23   39:getfield        #36  <Field ArrayList mAttachedScrap>
	//   24   42:invokevirtual   #202 <Method int ArrayList.size()>
	//   25   45:istore_3        
		for(int j = 0; j < l; j++)
	//*  26   46:iconst_0        
	//*  27   47:istore_1        
	//*  28   48:iload_1         
	//*  29   49:iload_3         
	//*  30   50:icmpge          74
			((r)mAttachedScrap.get(j)).clearOldPosition();
	//   31   53:aload_0         
	//   32   54:getfield        #36  <Field ArrayList mAttachedScrap>
	//   33   57:iload_1         
	//   34   58:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   35   61:checkcast       #61  <Class RecyclerView$ViewHolder>
	//   36   64:invokevirtual   #209 <Method void RecyclerView$ViewHolder.clearOldPosition()>

	//   37   67:iload_1         
	//   38   68:iconst_1        
	//   39   69:iadd            
	//   40   70:istore_1        
	//*  41   71:goto            48
		ArrayList arraylist = mChangedScrap;
	//   42   74:aload_0         
	//   43   75:getfield        #38  <Field ArrayList mChangedScrap>
	//   44   78:astore          4
		if(arraylist != null)
	//*  45   80:aload           4
	//*  46   82:ifnull          119
		{
			int i1 = arraylist.size();
	//   47   85:aload           4
	//   48   87:invokevirtual   #202 <Method int ArrayList.size()>
	//   49   90:istore_3        
			for(int k = ((int) (flag)); k < i1; k++)
	//*  50   91:iload_2         
	//*  51   92:istore_1        
	//*  52   93:iload_1         
	//*  53   94:iload_3         
	//*  54   95:icmpge          119
				((r)mChangedScrap.get(k)).clearOldPosition();
	//   55   98:aload_0         
	//   56   99:getfield        #38  <Field ArrayList mChangedScrap>
	//   57  102:iload_1         
	//   58  103:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   59  106:checkcast       #61  <Class RecyclerView$ViewHolder>
	//   60  109:invokevirtual   #209 <Method void RecyclerView$ViewHolder.clearOldPosition()>

	//   61  112:iload_1         
	//   62  113:iconst_1        
	//   63  114:iadd            
	//   64  115:istore_1        
		}
	//*  65  116:goto            93
	//   66  119:return          
	}

	void clearScrap()
	{
		mAttachedScrap.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ArrayList mAttachedScrap>
	//    2    4:invokevirtual   #195 <Method void ArrayList.clear()>
		ArrayList arraylist = mChangedScrap;
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field ArrayList mChangedScrap>
	//    5   11:astore_1        
		if(arraylist != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          20
			arraylist.clear();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #195 <Method void ArrayList.clear()>
	//   10   20:return          
	}

	public int convertPreLayoutPositionToPostLayout(int i)
	{
		if(i >= 0 && i < mState.getItemCount())
	//*   0    0:iload_1         
	//*   1    1:iflt            45
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #28  <Field RecyclerView this$0>
	//*   5    9:getfield        #160 <Field RecyclerView$State RecyclerView.mState>
	//*   6   12:invokevirtual   #215 <Method int RecyclerView$State.getItemCount()>
	//*   7   15:icmpge          45
		{
			if(!mState.isPreLayout())
	//*   8   18:aload_0         
	//*   9   19:getfield        #28  <Field RecyclerView this$0>
	//*  10   22:getfield        #160 <Field RecyclerView$State RecyclerView.mState>
	//*  11   25:invokevirtual   #165 <Method boolean RecyclerView$State.isPreLayout()>
	//*  12   28:ifne            33
				return i;
	//   13   31:iload_1         
	//   14   32:ireturn         
			else
				return mAdapterHelper.findPositionOffset(i);
	//   15   33:aload_0         
	//   16   34:getfield        #28  <Field RecyclerView this$0>
	//   17   37:getfield        #219 <Field AdapterHelper RecyclerView.mAdapterHelper>
	//   18   40:iload_1         
	//   19   41:invokevirtual   #224 <Method int AdapterHelper.findPositionOffset(int)>
	//   20   44:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   21   45:new             #226 <Class StringBuilder>
	//   22   48:dup             
	//   23   49:invokespecial   #227 <Method void StringBuilder()>
	//   24   52:astore_2        
			stringbuilder.append("invalid position ");
	//   25   53:aload_2         
	//   26   54:ldc1            #229 <String "invalid position ">
	//   27   56:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//   28   59:pop             
			stringbuilder.append(i);
	//   29   60:aload_2         
	//   30   61:iload_1         
	//   31   62:invokevirtual   #236 <Method StringBuilder StringBuilder.append(int)>
	//   32   65:pop             
			stringbuilder.append(". State ");
	//   33   66:aload_2         
	//   34   67:ldc1            #238 <String ". State ">
	//   35   69:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//   36   72:pop             
			stringbuilder.append("item count is ");
	//   37   73:aload_2         
	//   38   74:ldc1            #240 <String "item count is ">
	//   39   76:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//   40   79:pop             
			stringbuilder.append(mState.getItemCount());
	//   41   80:aload_2         
	//   42   81:aload_0         
	//   43   82:getfield        #28  <Field RecyclerView this$0>
	//   44   85:getfield        #160 <Field RecyclerView$State RecyclerView.mState>
	//   45   88:invokevirtual   #215 <Method int RecyclerView$State.getItemCount()>
	//   46   91:invokevirtual   #236 <Method StringBuilder StringBuilder.append(int)>
	//   47   94:pop             
			stringbuilder.append(exceptionLabel());
	//   48   95:aload_2         
	//   49   96:aload_0         
	//   50   97:getfield        #28  <Field RecyclerView this$0>
	//   51  100:invokevirtual   #244 <Method String RecyclerView.exceptionLabel()>
	//   52  103:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//   53  106:pop             
			throw new IndexOutOfBoundsException(stringbuilder.toString());
	//   54  107:new             #246 <Class IndexOutOfBoundsException>
	//   55  110:dup             
	//   56  111:aload_2         
	//   57  112:invokevirtual   #249 <Method String StringBuilder.toString()>
	//   58  115:invokespecial   #252 <Method void IndexOutOfBoundsException(String)>
	//   59  118:athrow          
		}
	}

	void dispatchViewRecycled(r r)
	{
		if(mRecyclerListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field RecyclerView this$0>
	//*   2    4:getfield        #256 <Field RecyclerView$RecyclerListener RecyclerView.mRecyclerListener>
	//*   3    7:ifnull          23
			mRecyclerListener.onViewRecycled(r);
	//    4   10:aload_0         
	//    5   11:getfield        #28  <Field RecyclerView this$0>
	//    6   14:getfield        #256 <Field RecyclerView$RecyclerListener RecyclerView.mRecyclerListener>
	//    7   17:aload_1         
	//    8   18:invokeinterface #261 <Method void RecyclerView$RecyclerListener.onViewRecycled(RecyclerView$ViewHolder)>
		if(mAdapter != null)
	//*   9   23:aload_0         
	//*  10   24:getfield        #28  <Field RecyclerView this$0>
	//*  11   27:getfield        #144 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  12   30:ifnull          44
			mAdapter.onViewRecycled(r);
	//   13   33:aload_0         
	//   14   34:getfield        #28  <Field RecyclerView this$0>
	//   15   37:getfield        #144 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   16   40:aload_1         
	//   17   41:invokevirtual   #262 <Method void RecyclerView$Adapter.onViewRecycled(RecyclerView$ViewHolder)>
		if(mState != null)
	//*  18   44:aload_0         
	//*  19   45:getfield        #28  <Field RecyclerView this$0>
	//*  20   48:getfield        #160 <Field RecyclerView$State RecyclerView.mState>
	//*  21   51:ifnull          65
			mViewInfoStore.removeViewHolder(r);
	//   22   54:aload_0         
	//   23   55:getfield        #28  <Field RecyclerView this$0>
	//   24   58:getfield        #266 <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//   25   61:aload_1         
	//   26   62:invokevirtual   #271 <Method void ViewInfoStore.removeViewHolder(RecyclerView$ViewHolder)>
	//   27   65:return          
	}

	r getChangedScrapViewForPosition(int i)
	{
		ArrayList arraylist = mChangedScrap;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ArrayList mChangedScrap>
	//    2    4:astore          7
		if(arraylist != null)
	//*   3    6:aload           7
	//*   4    8:ifnull          197
		{
			int k = arraylist.size();
	//    5   11:aload           7
	//    6   13:invokevirtual   #202 <Method int ArrayList.size()>
	//    7   16:istore          4
			if(k == 0)
	//*   8   18:iload           4
	//*   9   20:ifne            25
				return null;
	//   10   23:aconst_null     
	//   11   24:areturn         
			boolean flag = false;
	//   12   25:iconst_0        
	//   13   26:istore_3        
			for(int j = 0; j < k; j++)
	//*  14   27:iconst_0        
	//*  15   28:istore_2        
	//*  16   29:iload_2         
	//*  17   30:iload           4
	//*  18   32:icmpge          82
			{
				r r = (r)mChangedScrap.get(j);
	//   19   35:aload_0         
	//   20   36:getfield        #38  <Field ArrayList mChangedScrap>
	//   21   39:iload_2         
	//   22   40:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   23   43:checkcast       #61  <Class RecyclerView$ViewHolder>
	//   24   46:astore          7
				if(!r.wasReturnedFromScrap() && r.getLayoutPosition() == i)
	//*  25   48:aload           7
	//*  26   50:invokevirtual   #276 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//*  27   53:ifne            75
	//*  28   56:aload           7
	//*  29   58:invokevirtual   #279 <Method int RecyclerView$ViewHolder.getLayoutPosition()>
	//*  30   61:iload_1         
	//*  31   62:icmpne          75
				{
					r.addFlags(32);
	//   32   65:aload           7
	//   33   67:bipush          32
	//   34   69:invokevirtual   #83  <Method void RecyclerView$ViewHolder.addFlags(int)>
					return r;
	//   35   72:aload           7
	//   36   74:areturn         
				}
			}

	//   37   75:iload_2         
	//   38   76:iconst_1        
	//   39   77:iadd            
	//   40   78:istore_2        
	//*  41   79:goto            29
			if(mAdapter.hasStableIds())
	//*  42   82:aload_0         
	//*  43   83:getfield        #28  <Field RecyclerView this$0>
	//*  44   86:getfield        #144 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  45   89:invokevirtual   #282 <Method boolean RecyclerView$Adapter.hasStableIds()>
	//*  46   92:ifeq            195
			{
				i = mAdapterHelper.findPositionOffset(i);
	//   47   95:aload_0         
	//   48   96:getfield        #28  <Field RecyclerView this$0>
	//   49   99:getfield        #219 <Field AdapterHelper RecyclerView.mAdapterHelper>
	//   50  102:iload_1         
	//   51  103:invokevirtual   #224 <Method int AdapterHelper.findPositionOffset(int)>
	//   52  106:istore_1        
				if(i > 0 && i < mAdapter.getItemCount())
	//*  53  107:iload_1         
	//*  54  108:ifle            195
	//*  55  111:iload_1         
	//*  56  112:aload_0         
	//*  57  113:getfield        #28  <Field RecyclerView this$0>
	//*  58  116:getfield        #144 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  59  119:invokevirtual   #283 <Method int RecyclerView$Adapter.getItemCount()>
	//*  60  122:icmpge          195
				{
					long l = mAdapter.getItemId(i);
	//   61  125:aload_0         
	//   62  126:getfield        #28  <Field RecyclerView this$0>
	//   63  129:getfield        #144 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   64  132:iload_1         
	//   65  133:invokevirtual   #287 <Method long RecyclerView$Adapter.getItemId(int)>
	//   66  136:lstore          5
					for(i = ((int) (flag)); i < k; i++)
	//*  67  138:iload_3         
	//*  68  139:istore_1        
	//*  69  140:iload_1         
	//*  70  141:iload           4
	//*  71  143:icmpge          195
					{
						r r1 = (r)mChangedScrap.get(i);
	//   72  146:aload_0         
	//   73  147:getfield        #38  <Field ArrayList mChangedScrap>
	//   74  150:iload_1         
	//   75  151:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   76  154:checkcast       #61  <Class RecyclerView$ViewHolder>
	//   77  157:astore          7
						if(!r1.wasReturnedFromScrap() && r1.getItemId() == l)
	//*  78  159:aload           7
	//*  79  161:invokevirtual   #276 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//*  80  164:ifne            188
	//*  81  167:aload           7
	//*  82  169:invokevirtual   #289 <Method long RecyclerView$ViewHolder.getItemId()>
	//*  83  172:lload           5
	//*  84  174:lcmp            
	//*  85  175:ifne            188
						{
							r1.addFlags(32);
	//   86  178:aload           7
	//   87  180:bipush          32
	//   88  182:invokevirtual   #83  <Method void RecyclerView$ViewHolder.addFlags(int)>
							return r1;
	//   89  185:aload           7
	//   90  187:areturn         
						}
					}

	//   91  188:iload_1         
	//   92  189:iconst_1        
	//   93  190:iadd            
	//   94  191:istore_1        
				}
			}
	//*  95  192:goto            140
			return null;
	//   96  195:aconst_null     
	//   97  196:areturn         
		} else
		{
			return null;
	//   98  197:aconst_null     
	//   99  198:areturn         
		}
	}

	iewPool getRecycledViewPool()
	{
		if(mRecyclerPool == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//*   2    4:ifnonnull       18
			mRecyclerPool = new iewPool();
	//    3    7:aload_0         
	//    4    8:new             #136 <Class RecyclerView$RecycledViewPool>
	//    5   11:dup             
	//    6   12:invokespecial   #290 <Method void RecyclerView$RecycledViewPool()>
	//    7   15:putfield        #134 <Field RecyclerView$RecycledViewPool mRecyclerPool>
		return mRecyclerPool;
	//    8   18:aload_0         
	//    9   19:getfield        #134 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//   10   22:areturn         
	}

	int getScrapCount()
	{
		return mAttachedScrap.size();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ArrayList mAttachedScrap>
	//    2    4:invokevirtual   #202 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public List getScrapList()
	{
		return mUnmodifiableAttachedScrap;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field List mUnmodifiableAttachedScrap>
	//    2    4:areturn         
	}

	r getScrapOrCachedViewForId(long l, int i, boolean flag)
	{
		for(int j = mAttachedScrap.size() - 1; j >= 0; j--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field ArrayList mAttachedScrap>
	//*   2    4:invokevirtual   #202 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore          5
	//*   6   11:iload           5
	//*   7   13:iflt            142
		{
			r r = (r)mAttachedScrap.get(j);
	//    8   16:aload_0         
	//    9   17:getfield        #36  <Field ArrayList mAttachedScrap>
	//   10   20:iload           5
	//   11   22:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   12   25:checkcast       #61  <Class RecyclerView$ViewHolder>
	//   13   28:astore          6
			if(r.getItemId() != l || r.wasReturnedFromScrap())
				continue;
	//   14   30:aload           6
	//   15   32:invokevirtual   #289 <Method long RecyclerView$ViewHolder.getItemId()>
	//   16   35:lload_1         
	//   17   36:lcmp            
	//   18   37:ifne            133
	//   19   40:aload           6
	//   20   42:invokevirtual   #276 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//   21   45:ifne            133
			if(i == r.getItemViewType())
	//*  22   48:iload_3         
	//*  23   49:aload           6
	//*  24   51:invokevirtual   #126 <Method int RecyclerView$ViewHolder.getItemViewType()>
	//*  25   54:icmpne          96
			{
				r.addFlags(32);
	//   26   57:aload           6
	//   27   59:bipush          32
	//   28   61:invokevirtual   #83  <Method void RecyclerView$ViewHolder.addFlags(int)>
				if(r.isRemoved() && !mState.isPreLayout())
	//*  29   64:aload           6
	//*  30   66:invokevirtual   #301 <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*  31   69:ifeq            93
	//*  32   72:aload_0         
	//*  33   73:getfield        #28  <Field RecyclerView this$0>
	//*  34   76:getfield        #160 <Field RecyclerView$State RecyclerView.mState>
	//*  35   79:invokevirtual   #165 <Method boolean RecyclerView$State.isPreLayout()>
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
	//   46  102:getfield        #36  <Field ArrayList mAttachedScrap>
	//   47  105:iload           5
	//   48  107:invokevirtual   #304 <Method Object ArrayList.remove(int)>
	//   49  110:pop             
				removeDetachedView(r.itemView, false);
	//   50  111:aload_0         
	//   51  112:getfield        #28  <Field RecyclerView this$0>
	//   52  115:aload           6
	//   53  117:getfield        #65  <Field View RecyclerView$ViewHolder.itemView>
	//   54  120:iconst_0        
	//   55  121:invokevirtual   #308 <Method void RecyclerView.removeDetachedView(View, boolean)>
				quickRecycleScrapView(r.itemView);
	//   56  124:aload_0         
	//   57  125:aload           6
	//   58  127:getfield        #65  <Field View RecyclerView$ViewHolder.itemView>
	//   59  130:invokevirtual   #312 <Method void quickRecycleScrapView(View)>
			}
		}

	//   60  133:iload           5
	//   61  135:iconst_1        
	//   62  136:isub            
	//   63  137:istore          5
	//*  64  139:goto            11
		for(int k = mCachedViews.size() - 1; k >= 0; k--)
	//*  65  142:aload_0         
	//*  66  143:getfield        #40  <Field ArrayList mCachedViews>
	//*  67  146:invokevirtual   #202 <Method int ArrayList.size()>
	//*  68  149:iconst_1        
	//*  69  150:isub            
	//*  70  151:istore          5
	//*  71  153:iload           5
	//*  72  155:iflt            231
		{
			r r1 = (r)mCachedViews.get(k);
	//   73  158:aload_0         
	//   74  159:getfield        #40  <Field ArrayList mCachedViews>
	//   75  162:iload           5
	//   76  164:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   77  167:checkcast       #61  <Class RecyclerView$ViewHolder>
	//   78  170:astore          6
			if(r1.getItemId() != l)
				continue;
	//   79  172:aload           6
	//   80  174:invokevirtual   #289 <Method long RecyclerView$ViewHolder.getItemId()>
	//   81  177:lload_1         
	//   82  178:lcmp            
	//   83  179:ifne            222
			if(i == r1.getItemViewType())
	//*  84  182:iload_3         
	//*  85  183:aload           6
	//*  86  185:invokevirtual   #126 <Method int RecyclerView$ViewHolder.getItemViewType()>
	//*  87  188:icmpne          209
			{
				if(!flag)
	//*  88  191:iload           4
	//*  89  193:ifne            206
					mCachedViews.remove(k);
	//   90  196:aload_0         
	//   91  197:getfield        #40  <Field ArrayList mCachedViews>
	//   92  200:iload           5
	//   93  202:invokevirtual   #304 <Method Object ArrayList.remove(int)>
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
	//  101  217:invokevirtual   #315 <Method void recycleCachedViewAt(int)>
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
	//    1    1:getfield        #36  <Field ArrayList mAttachedScrap>
	//    2    4:invokevirtual   #202 <Method int ArrayList.size()>
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
	//   12   21:getfield        #36  <Field ArrayList mAttachedScrap>
	//   13   24:iload_3         
	//   14   25:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   15   28:checkcast       #61  <Class RecyclerView$ViewHolder>
	//   16   31:astore          6
			if(!r.wasReturnedFromScrap() && r.getLayoutPosition() == i && !r.isInvalid() && (mState.mInPreLayout || !r.isRemoved()))
	//*  17   33:aload           6
	//*  18   35:invokevirtual   #276 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//*  19   38:ifne            89
	//*  20   41:aload           6
	//*  21   43:invokevirtual   #279 <Method int RecyclerView$ViewHolder.getLayoutPosition()>
	//*  22   46:iload_1         
	//*  23   47:icmpne          89
	//*  24   50:aload           6
	//*  25   52:invokevirtual   #320 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//*  26   55:ifne            89
	//*  27   58:aload_0         
	//*  28   59:getfield        #28  <Field RecyclerView this$0>
	//*  29   62:getfield        #160 <Field RecyclerView$State RecyclerView.mState>
	//*  30   65:getfield        #324 <Field boolean RecyclerView$State.mInPreLayout>
	//*  31   68:ifne            79
	//*  32   71:aload           6
	//*  33   73:invokevirtual   #301 <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*  34   76:ifne            89
			{
				r.addFlags(32);
	//   35   79:aload           6
	//   36   81:bipush          32
	//   37   83:invokevirtual   #83  <Method void RecyclerView$ViewHolder.addFlags(int)>
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
			View view = mChildHelper.findHiddenNonRemovedView(i);
	//   47  100:aload_0         
	//   48  101:getfield        #28  <Field RecyclerView this$0>
	//   49  104:getfield        #328 <Field ChildHelper RecyclerView.mChildHelper>
	//   50  107:iload_1         
	//   51  108:invokevirtual   #333 <Method View ChildHelper.findHiddenNonRemovedView(int)>
	//   52  111:astore          7
			if(view != null)
	//*  53  113:aload           7
	//*  54  115:ifnull          235
			{
				r r1 = RecyclerView.getChildViewHolderInt(view);
	//   55  118:aload           7
	//   56  120:invokestatic    #337 <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//   57  123:astore          6
				mChildHelper.unhide(view);
	//   58  125:aload_0         
	//   59  126:getfield        #28  <Field RecyclerView this$0>
	//   60  129:getfield        #328 <Field ChildHelper RecyclerView.mChildHelper>
	//   61  132:aload           7
	//   62  134:invokevirtual   #340 <Method void ChildHelper.unhide(View)>
				i = mChildHelper.indexOfChild(view);
	//   63  137:aload_0         
	//   64  138:getfield        #28  <Field RecyclerView this$0>
	//   65  141:getfield        #328 <Field ChildHelper RecyclerView.mChildHelper>
	//   66  144:aload           7
	//   67  146:invokevirtual   #343 <Method int ChildHelper.indexOfChild(View)>
	//   68  149:istore_1        
				if(i != -1)
	//*  69  150:iload_1         
	//*  70  151:iconst_m1       
	//*  71  152:icmpeq          183
				{
					mChildHelper.detachViewFromParent(i);
	//   72  155:aload_0         
	//   73  156:getfield        #28  <Field RecyclerView this$0>
	//   74  159:getfield        #328 <Field ChildHelper RecyclerView.mChildHelper>
	//   75  162:iload_1         
	//   76  163:invokevirtual   #346 <Method void ChildHelper.detachViewFromParent(int)>
					scrapView(view);
	//   77  166:aload_0         
	//   78  167:aload           7
	//   79  169:invokevirtual   #349 <Method void scrapView(View)>
					r1.addFlags(8224);
	//   80  172:aload           6
	//   81  174:sipush          8224
	//   82  177:invokevirtual   #83  <Method void RecyclerView$ViewHolder.addFlags(int)>
					return r1;
	//   83  180:aload           6
	//   84  182:areturn         
				} else
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   85  183:new             #226 <Class StringBuilder>
	//   86  186:dup             
	//   87  187:invokespecial   #227 <Method void StringBuilder()>
	//   88  190:astore          7
					stringbuilder.append("layout index should not be -1 after unhiding a view:");
	//   89  192:aload           7
	//   90  194:ldc2            #351 <String "layout index should not be -1 after unhiding a view:">
	//   91  197:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//   92  200:pop             
					stringbuilder.append(((Object) (r1)));
	//   93  201:aload           7
	//   94  203:aload           6
	//   95  205:invokevirtual   #354 <Method StringBuilder StringBuilder.append(Object)>
	//   96  208:pop             
					stringbuilder.append(exceptionLabel());
	//   97  209:aload           7
	//   98  211:aload_0         
	//   99  212:getfield        #28  <Field RecyclerView this$0>
	//  100  215:invokevirtual   #244 <Method String RecyclerView.exceptionLabel()>
	//  101  218:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//  102  221:pop             
					throw new IllegalStateException(stringbuilder.toString());
	//  103  222:new             #356 <Class IllegalStateException>
	//  104  225:dup             
	//  105  226:aload           7
	//  106  228:invokevirtual   #249 <Method String StringBuilder.toString()>
	//  107  231:invokespecial   #357 <Method void IllegalStateException(String)>
	//  108  234:athrow          
				}
			}
		}
		l = mCachedViews.size();
	//  109  235:aload_0         
	//  110  236:getfield        #40  <Field ArrayList mCachedViews>
	//  111  239:invokevirtual   #202 <Method int ArrayList.size()>
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
	//  119  254:getfield        #40  <Field ArrayList mCachedViews>
	//  120  257:iload_3         
	//  121  258:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//  122  261:checkcast       #61  <Class RecyclerView$ViewHolder>
	//  123  264:astore          6
			if(!r2.isInvalid() && r2.getLayoutPosition() == i)
	//* 124  266:aload           6
	//* 125  268:invokevirtual   #320 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//* 126  271:ifne            299
	//* 127  274:aload           6
	//* 128  276:invokevirtual   #279 <Method int RecyclerView$ViewHolder.getLayoutPosition()>
	//* 129  279:iload_1         
	//* 130  280:icmpne          299
			{
				if(!flag)
	//* 131  283:iload_2         
	//* 132  284:ifne            296
					mCachedViews.remove(k);
	//  133  287:aload_0         
	//  134  288:getfield        #40  <Field ArrayList mCachedViews>
	//  135  291:iload_3         
	//  136  292:invokevirtual   #304 <Method Object ArrayList.remove(int)>
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
	//    1    1:getfield        #36  <Field ArrayList mAttachedScrap>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #61  <Class RecyclerView$ViewHolder>
	//    5   11:getfield        #65  <Field View RecyclerView$ViewHolder.itemView>
	//    6   14:areturn         
	}

	public View getViewForPosition(int i)
	{
		return getViewForPosition(i, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #362 <Method View getViewForPosition(int, boolean)>
	//    4    6:areturn         
	}

	View getViewForPosition(int i, boolean flag)
	{
		return tryGetViewHolderForPositionByDeadline(i, flag, 0xffffffffL).itemView;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:ldc2w           #131 <Long 0xffffffffL>
	//    4    6:invokevirtual   #366 <Method RecyclerView$ViewHolder tryGetViewHolderForPositionByDeadline(int, boolean, long)>
	//    5    9:getfield        #65  <Field View RecyclerView$ViewHolder.itemView>
	//    6   12:areturn         
	}

	void markItemDecorInsetsDirty()
	{
		int j = mCachedViews.size();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field ArrayList mCachedViews>
	//    2    4:invokevirtual   #202 <Method int ArrayList.size()>
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
	//   10   16:getfield        #40  <Field ArrayList mCachedViews>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #61  <Class RecyclerView$ViewHolder>
	//   14   26:getfield        #65  <Field View RecyclerView$ViewHolder.itemView>
	//   15   29:invokevirtual   #373 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   16   32:checkcast       #375 <Class RecyclerView$LayoutParams>
	//   17   35:astore_3        
			if(ams != null)
	//*  18   36:aload_3         
	//*  19   37:ifnull          45
				ams.mInsetsDirty = true;
	//   20   40:aload_3         
	//   21   41:iconst_1        
	//   22   42:putfield        #378 <Field boolean RecyclerView$LayoutParams.mInsetsDirty>
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
	//    1    1:getfield        #40  <Field ArrayList mCachedViews>
	//    2    4:invokevirtual   #202 <Method int ArrayList.size()>
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
	//   10   16:getfield        #40  <Field ArrayList mCachedViews>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #61  <Class RecyclerView$ViewHolder>
	//   14   26:astore_3        
			if(r != null)
	//*  15   27:aload_3         
	//*  16   28:ifnull          42
			{
				r.addFlags(6);
	//   17   31:aload_3         
	//   18   32:bipush          6
	//   19   34:invokevirtual   #83  <Method void RecyclerView$ViewHolder.addFlags(int)>
				r.addChangePayload(((Object) (null)));
	//   20   37:aload_3         
	//   21   38:aconst_null     
	//   22   39:invokevirtual   #383 <Method void RecyclerView$ViewHolder.addChangePayload(Object)>
			}
		}

	//   23   42:iload_1         
	//   24   43:iconst_1        
	//   25   44:iadd            
	//   26   45:istore_1        
	//*  27   46:goto            10
		if(mAdapter == null || !mAdapter.hasStableIds())
	//*  28   49:aload_0         
	//*  29   50:getfield        #28  <Field RecyclerView this$0>
	//*  30   53:getfield        #144 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  31   56:ifnull          72
	//*  32   59:aload_0         
	//*  33   60:getfield        #28  <Field RecyclerView this$0>
	//*  34   63:getfield        #144 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  35   66:invokevirtual   #282 <Method boolean RecyclerView$Adapter.hasStableIds()>
	//*  36   69:ifne            76
			recycleAndClearCachedViews();
	//   37   72:aload_0         
	//   38   73:invokevirtual   #198 <Method void recycleAndClearCachedViews()>
	//   39   76:return          
	}

	void offsetPositionRecordsForInsert(int i, int j)
	{
		int l = mCachedViews.size();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field ArrayList mCachedViews>
	//    2    4:invokevirtual   #202 <Method int ArrayList.size()>
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
	//   10   18:getfield        #40  <Field ArrayList mCachedViews>
	//   11   21:iload_3         
	//   12   22:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   13   25:checkcast       #61  <Class RecyclerView$ViewHolder>
	//   14   28:astore          5
			if(r != null && r.mPosition >= i)
	//*  15   30:aload           5
	//*  16   32:ifnull          51
	//*  17   35:aload           5
	//*  18   37:getfield        #387 <Field int RecyclerView$ViewHolder.mPosition>
	//*  19   40:iload_1         
	//*  20   41:icmplt          51
				r.offsetPosition(j, true);
	//   21   44:aload           5
	//   22   46:iload_2         
	//   23   47:iconst_1        
	//   24   48:invokevirtual   #391 <Method void RecyclerView$ViewHolder.offsetPosition(int, boolean)>
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
			l = i;
	//   10   16:iload_1         
	//   11   17:istore          4
			k = j;
	//   12   19:iload_2         
	//   13   20:istore_3        
			byte0 = 1;
	//   14   21:iconst_1        
	//   15   22:istore          5
		}
		int j1 = mCachedViews.size();
	//   16   24:aload_0         
	//   17   25:getfield        #40  <Field ArrayList mCachedViews>
	//   18   28:invokevirtual   #202 <Method int ArrayList.size()>
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
	//   26   44:getfield        #40  <Field ArrayList mCachedViews>
	//   27   47:iload           6
	//   28   49:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   29   52:checkcast       #61  <Class RecyclerView$ViewHolder>
	//   30   55:astore          8
			if(r == null || r.mPosition < k || r.mPosition > l)
	//*  31   57:aload           8
	//*  32   59:ifnull          113
	//*  33   62:aload           8
	//*  34   64:getfield        #387 <Field int RecyclerView$ViewHolder.mPosition>
	//*  35   67:iload_3         
	//*  36   68:icmplt          113
	//*  37   71:aload           8
	//*  38   73:getfield        #387 <Field int RecyclerView$ViewHolder.mPosition>
	//*  39   76:iload           4
	//*  40   78:icmple          84
				continue;
	//   41   81:goto            113
			if(r.mPosition == i)
	//*  42   84:aload           8
	//*  43   86:getfield        #387 <Field int RecyclerView$ViewHolder.mPosition>
	//*  44   89:iload_1         
	//*  45   90:icmpne          105
				r.offsetPosition(j - i, false);
	//   46   93:aload           8
	//   47   95:iload_2         
	//   48   96:iload_1         
	//   49   97:isub            
	//   50   98:iconst_0        
	//   51   99:invokevirtual   #391 <Method void RecyclerView$ViewHolder.offsetPosition(int, boolean)>
			else
	//*  52  102:goto            113
				r.offsetPosition(((int) (byte0)), false);
	//   53  105:aload           8
	//   54  107:iload           5
	//   55  109:iconst_0        
	//   56  110:invokevirtual   #391 <Method void RecyclerView$ViewHolder.offsetPosition(int, boolean)>
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
	//*   1    1:getfield        #40  <Field ArrayList mCachedViews>
	//*   2    4:invokevirtual   #202 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore          4
	//*   6   11:iload           4
	//*   7   13:iflt            88
		{
			r r = (r)mCachedViews.get(k);
	//    8   16:aload_0         
	//    9   17:getfield        #40  <Field ArrayList mCachedViews>
	//   10   20:iload           4
	//   11   22:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   12   25:checkcast       #61  <Class RecyclerView$ViewHolder>
	//   13   28:astore          5
			if(r == null)
				continue;
	//   14   30:aload           5
	//   15   32:ifnull          79
			if(r.mPosition >= i + j)
	//*  16   35:aload           5
	//*  17   37:getfield        #387 <Field int RecyclerView$ViewHolder.mPosition>
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
	//   26   51:invokevirtual   #391 <Method void RecyclerView$ViewHolder.offsetPosition(int, boolean)>
				continue;
	//   27   54:goto            79
			}
			if(r.mPosition >= i)
	//*  28   57:aload           5
	//*  29   59:getfield        #387 <Field int RecyclerView$ViewHolder.mPosition>
	//*  30   62:iload_1         
	//*  31   63:icmplt          79
			{
				r.addFlags(8);
	//   32   66:aload           5
	//   33   68:bipush          8
	//   34   70:invokevirtual   #83  <Method void RecyclerView$ViewHolder.addFlags(int)>
				recycleCachedViewAt(k);
	//   35   73:aload_0         
	//   36   74:iload           4
	//   37   76:invokevirtual   #315 <Method void recycleCachedViewAt(int)>
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
	//    1    1:invokevirtual   #397 <Method void clear()>
		getRecycledViewPool().onAdapterChanged(adapter, adapter1, flag);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #189 <Method RecyclerView$RecycledViewPool getRecycledViewPool()>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:iload_3         
	//    7   11:invokevirtual   #399 <Method void RecyclerView$RecycledViewPool.onAdapterChanged(RecyclerView$Adapter, RecyclerView$Adapter, boolean)>
	//    8   14:return          
	}

	void quickRecycleScrapView(View view)
	{
		view = ((View) (RecyclerView.getChildViewHolderInt(view)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #337 <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:astore_1        
		view.mScrapContainer = null;
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:putfield        #403 <Field RecyclerView$Recycler RecyclerView$ViewHolder.mScrapContainer>
		view.mInChangeScrap = false;
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:putfield        #406 <Field boolean RecyclerView$ViewHolder.mInChangeScrap>
		((r) (view)).clearReturnedFromScrapFlag();
	//    9   15:aload_1         
	//   10   16:invokevirtual   #409 <Method void RecyclerView$ViewHolder.clearReturnedFromScrapFlag()>
		recycleViewHolderInternal(((r) (view)));
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #412 <Method void recycleViewHolderInternal(RecyclerView$ViewHolder)>
	//   14   24:return          
	}

	void recycleAndClearCachedViews()
	{
		for(int i = mCachedViews.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field ArrayList mCachedViews>
	//*   2    4:invokevirtual   #202 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iflt            26
			recycleCachedViewAt(i);
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:invokevirtual   #315 <Method void recycleCachedViewAt(int)>

	//   11   19:iload_1         
	//   12   20:iconst_1        
	//   13   21:isub            
	//   14   22:istore_1        
	//*  15   23:goto            10
		mCachedViews.clear();
	//   16   26:aload_0         
	//   17   27:getfield        #40  <Field ArrayList mCachedViews>
	//   18   30:invokevirtual   #195 <Method void ArrayList.clear()>
		if(RecyclerView.ALLOW_THREAD_GAP_WORK)
	//*  19   33:getstatic       #415 <Field boolean RecyclerView.ALLOW_THREAD_GAP_WORK>
	//*  20   36:ifeq            49
			mPrefetchRegistry.clearPrefetchPositions();
	//   21   39:aload_0         
	//   22   40:getfield        #28  <Field RecyclerView this$0>
	//   23   43:getfield        #419 <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//   24   46:invokevirtual   #424 <Method void GapWorker$LayoutPrefetchRegistryImpl.clearPrefetchPositions()>
	//   25   49:return          
	}

	void recycleCachedViewAt(int i)
	{
		addViewHolderToRecycledViewPool((r)mCachedViews.get(i), true);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field ArrayList mCachedViews>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//    5    9:checkcast       #61  <Class RecyclerView$ViewHolder>
	//    6   12:iconst_1        
	//    7   13:invokevirtual   #426 <Method void addViewHolderToRecycledViewPool(RecyclerView$ViewHolder, boolean)>
		mCachedViews.remove(i);
	//    8   16:aload_0         
	//    9   17:getfield        #40  <Field ArrayList mCachedViews>
	//   10   20:iload_1         
	//   11   21:invokevirtual   #304 <Method Object ArrayList.remove(int)>
	//   12   24:pop             
	//   13   25:return          
	}

	public void recycleView(View view)
	{
		r r = RecyclerView.getChildViewHolderInt(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #337 <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:astore_2        
		if(r.isTmpDetached())
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #430 <Method boolean RecyclerView$ViewHolder.isTmpDetached()>
	//*   5    9:ifeq            21
			removeDetachedView(view, false);
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field RecyclerView this$0>
	//    8   16:aload_1         
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #308 <Method void RecyclerView.removeDetachedView(View, boolean)>
		if(r.isScrap())
	//*  11   21:aload_2         
	//*  12   22:invokevirtual   #433 <Method boolean RecyclerView$ViewHolder.isScrap()>
	//*  13   25:ifeq            35
			r.unScrap();
	//   14   28:aload_2         
	//   15   29:invokevirtual   #436 <Method void RecyclerView$ViewHolder.unScrap()>
		else
	//*  16   32:goto            46
		if(r.wasReturnedFromScrap())
	//*  17   35:aload_2         
	//*  18   36:invokevirtual   #276 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//*  19   39:ifeq            46
			r.clearReturnedFromScrapFlag();
	//   20   42:aload_2         
	//   21   43:invokevirtual   #409 <Method void RecyclerView$ViewHolder.clearReturnedFromScrapFlag()>
		recycleViewHolderInternal(r);
	//   22   46:aload_0         
	//   23   47:aload_2         
	//   24   48:invokevirtual   #412 <Method void recycleViewHolderInternal(RecyclerView$ViewHolder)>
	//   25   51:return          
	}

	void recycleViewHolderInternal(r r)
	{
		boolean flag5 = r.isScrap();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #433 <Method boolean RecyclerView$ViewHolder.isScrap()>
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
	//*  10   18:getfield        #65  <Field View RecyclerView$ViewHolder.itemView>
	//*  11   21:invokevirtual   #440 <Method android.view.ViewParent View.getParent()>
	//*  12   24:ifnull          30
	//*  13   27:goto            404
			if(!r.isTmpDetached())
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #430 <Method boolean RecyclerView$ViewHolder.isTmpDetached()>
	//*  16   34:ifne            353
			{
				if(!r.shouldIgnore())
	//*  17   37:aload_1         
	//*  18   38:invokevirtual   #443 <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//*  19   41:ifne            313
				{
					flag4 = r.doesTransientStatePreventRecycling();
	//   20   44:aload_1         
	//   21   45:invokevirtual   #446 <Method boolean RecyclerView$ViewHolder.doesTransientStatePreventRecycling()>
	//   22   48:istore          5
					boolean flag;
					if(mAdapter != null && flag4 && mAdapter.onFailedToRecycleView(r))
	//*  23   50:aload_0         
	//*  24   51:getfield        #28  <Field RecyclerView this$0>
	//*  25   54:getfield        #144 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  26   57:ifnull          84
	//*  27   60:iload           5
	//*  28   62:ifeq            84
	//*  29   65:aload_0         
	//*  30   66:getfield        #28  <Field RecyclerView this$0>
	//*  31   69:getfield        #144 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  32   72:aload_1         
	//*  33   73:invokevirtual   #450 <Method boolean RecyclerView$Adapter.onFailedToRecycleView(RecyclerView$ViewHolder)>
	//*  34   76:ifeq            84
						flag = true;
	//   35   79:iconst_1        
	//   36   80:istore_2        
					else
	//*  37   81:goto            86
						flag = false;
	//   38   84:iconst_0        
	//   39   85:istore_2        
					int j;
					if(!flag && !r.isRecyclable())
	//*  40   86:iload_2         
	//*  41   87:ifne            111
	//*  42   90:aload_1         
	//*  43   91:invokevirtual   #453 <Method boolean RecyclerView$ViewHolder.isRecyclable()>
	//*  44   94:ifeq            100
	//*  45   97:goto            111
					{
						boolean flag1 = false;
	//   46  100:iconst_0        
	//   47  101:istore_2        
						j = ((int) (flag3));
	//   48  102:iload           4
	//   49  104:istore_3        
						flag3 = flag1;
	//   50  105:iload_2         
	//   51  106:istore          4
					} else
	//*  52  108:goto            282
					{
						boolean flag2;
						if(mViewCacheMax > 0 && !r.hasAnyOfTheFlags(526))
	//*  53  111:aload_0         
	//*  54  112:getfield        #52  <Field int mViewCacheMax>
	//*  55  115:ifle            259
	//*  56  118:aload_1         
	//*  57  119:sipush          526
	//*  58  122:invokevirtual   #178 <Method boolean RecyclerView$ViewHolder.hasAnyOfTheFlags(int)>
	//*  59  125:ifne            259
						{
							j = mCachedViews.size();
	//   60  128:aload_0         
	//   61  129:getfield        #40  <Field ArrayList mCachedViews>
	//   62  132:invokevirtual   #202 <Method int ArrayList.size()>
	//   63  135:istore_3        
							int i = j;
	//   64  136:iload_3         
	//   65  137:istore_2        
							if(j >= mViewCacheMax)
	//*  66  138:iload_3         
	//*  67  139:aload_0         
	//*  68  140:getfield        #52  <Field int mViewCacheMax>
	//*  69  143:icmplt          161
							{
								i = j;
	//   70  146:iload_3         
	//   71  147:istore_2        
								if(j > 0)
	//*  72  148:iload_3         
	//*  73  149:ifle            161
								{
									recycleCachedViewAt(0);
	//   74  152:aload_0         
	//   75  153:iconst_0        
	//   76  154:invokevirtual   #315 <Method void recycleCachedViewAt(int)>
									i = j - 1;
	//   77  157:iload_3         
	//   78  158:iconst_1        
	//   79  159:isub            
	//   80  160:istore_2        
								}
							}
							j = i;
	//   81  161:iload_2         
	//   82  162:istore_3        
							if(RecyclerView.ALLOW_THREAD_GAP_WORK)
	//*  83  163:getstatic       #415 <Field boolean RecyclerView.ALLOW_THREAD_GAP_WORK>
	//*  84  166:ifeq            245
							{
								j = i;
	//   85  169:iload_2         
	//   86  170:istore_3        
								if(i > 0)
	//*  87  171:iload_2         
	//*  88  172:ifle            245
								{
									j = i;
	//   89  175:iload_2         
	//   90  176:istore_3        
									if(!mPrefetchRegistry.lastPrefetchIncludedPosition(r.mPosition))
	//*  91  177:aload_0         
	//*  92  178:getfield        #28  <Field RecyclerView this$0>
	//*  93  181:getfield        #419 <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//*  94  184:aload_1         
	//*  95  185:getfield        #387 <Field int RecyclerView$ViewHolder.mPosition>
	//*  96  188:invokevirtual   #456 <Method boolean GapWorker$LayoutPrefetchRegistryImpl.lastPrefetchIncludedPosition(int)>
	//*  97  191:ifne            245
									{
										i--;
	//   98  194:iload_2         
	//   99  195:iconst_1        
	//  100  196:isub            
	//  101  197:istore_2        
										do
										{
											if(i < 0)
												break;
	//  102  198:iload_2         
	//  103  199:iflt            241
											j = ((r)mCachedViews.get(i)).mPosition;
	//  104  202:aload_0         
	//  105  203:getfield        #40  <Field ArrayList mCachedViews>
	//  106  206:iload_2         
	//  107  207:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//  108  210:checkcast       #61  <Class RecyclerView$ViewHolder>
	//  109  213:getfield        #387 <Field int RecyclerView$ViewHolder.mPosition>
	//  110  216:istore_3        
											if(!mPrefetchRegistry.lastPrefetchIncludedPosition(j))
	//* 111  217:aload_0         
	//* 112  218:getfield        #28  <Field RecyclerView this$0>
	//* 113  221:getfield        #419 <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//* 114  224:iload_3         
	//* 115  225:invokevirtual   #456 <Method boolean GapWorker$LayoutPrefetchRegistryImpl.lastPrefetchIncludedPosition(int)>
	//* 116  228:ifne            234
												break;
	//  117  231:goto            241
											i--;
	//  118  234:iload_2         
	//  119  235:iconst_1        
	//  120  236:isub            
	//  121  237:istore_2        
										} while(true);
	//  122  238:goto            198
										j = i + 1;
	//  123  241:iload_2         
	//  124  242:iconst_1        
	//  125  243:iadd            
	//  126  244:istore_3        
									}
								}
							}
							mCachedViews.add(j, ((Object) (r)));
	//  127  245:aload_0         
	//  128  246:getfield        #40  <Field ArrayList mCachedViews>
	//  129  249:iload_3         
	//  130  250:aload_1         
	//  131  251:invokevirtual   #460 <Method void ArrayList.add(int, Object)>
							flag2 = true;
	//  132  254:iconst_1        
	//  133  255:istore_2        
						} else
	//* 134  256:goto            261
						{
							flag2 = false;
	//  135  259:iconst_0        
	//  136  260:istore_2        
						}
						j = ((int) (flag3));
	//  137  261:iload           4
	//  138  263:istore_3        
						flag3 = flag2;
	//  139  264:iload_2         
	//  140  265:istore          4
						if(!flag2)
	//* 141  267:iload_2         
	//* 142  268:ifne            282
						{
							addViewHolderToRecycledViewPool(r, true);
	//  143  271:aload_0         
	//  144  272:aload_1         
	//  145  273:iconst_1        
	//  146  274:invokevirtual   #426 <Method void addViewHolderToRecycledViewPool(RecyclerView$ViewHolder, boolean)>
							j = 1;
	//  147  277:iconst_1        
	//  148  278:istore_3        
							flag3 = flag2;
	//  149  279:iload_2         
	//  150  280:istore          4
						}
					}
					mViewInfoStore.removeViewHolder(r);
	//  151  282:aload_0         
	//  152  283:getfield        #28  <Field RecyclerView this$0>
	//  153  286:getfield        #266 <Field ViewInfoStore RecyclerView.mViewInfoStore>
	//  154  289:aload_1         
	//  155  290:invokevirtual   #271 <Method void ViewInfoStore.removeViewHolder(RecyclerView$ViewHolder)>
					if(!flag3 && j == 0 && flag4)
	//* 156  293:iload           4
	//* 157  295:ifne            312
	//* 158  298:iload_3         
	//* 159  299:ifne            312
	//* 160  302:iload           5
	//* 161  304:ifeq            312
						r.mOwnerRecyclerView = null;
	//  162  307:aload_1         
	//  163  308:aconst_null     
	//  164  309:putfield        #123 <Field RecyclerView RecyclerView$ViewHolder.mOwnerRecyclerView>
					return;
	//  165  312:return          
				} else
				{
					r = ((r) (new StringBuilder()));
	//  166  313:new             #226 <Class StringBuilder>
	//  167  316:dup             
	//  168  317:invokespecial   #227 <Method void StringBuilder()>
	//  169  320:astore_1        
					((StringBuilder) (r)).append("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
	//  170  321:aload_1         
	//  171  322:ldc2            #462 <String "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.">
	//  172  325:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//  173  328:pop             
					((StringBuilder) (r)).append(exceptionLabel());
	//  174  329:aload_1         
	//  175  330:aload_0         
	//  176  331:getfield        #28  <Field RecyclerView this$0>
	//  177  334:invokevirtual   #244 <Method String RecyclerView.exceptionLabel()>
	//  178  337:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//  179  340:pop             
					throw new IllegalArgumentException(((StringBuilder) (r)).toString());
	//  180  341:new             #464 <Class IllegalArgumentException>
	//  181  344:dup             
	//  182  345:aload_1         
	//  183  346:invokevirtual   #249 <Method String StringBuilder.toString()>
	//  184  349:invokespecial   #465 <Method void IllegalArgumentException(String)>
	//  185  352:athrow          
				}
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//  186  353:new             #226 <Class StringBuilder>
	//  187  356:dup             
	//  188  357:invokespecial   #227 <Method void StringBuilder()>
	//  189  360:astore          7
				stringbuilder.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
	//  190  362:aload           7
	//  191  364:ldc2            #467 <String "Tmp detached view should be removed from RecyclerView before it can be recycled: ">
	//  192  367:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//  193  370:pop             
				stringbuilder.append(((Object) (r)));
	//  194  371:aload           7
	//  195  373:aload_1         
	//  196  374:invokevirtual   #354 <Method StringBuilder StringBuilder.append(Object)>
	//  197  377:pop             
				stringbuilder.append(exceptionLabel());
	//  198  378:aload           7
	//  199  380:aload_0         
	//  200  381:getfield        #28  <Field RecyclerView this$0>
	//  201  384:invokevirtual   #244 <Method String RecyclerView.exceptionLabel()>
	//  202  387:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//  203  390:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//  204  391:new             #464 <Class IllegalArgumentException>
	//  205  394:dup             
	//  206  395:aload           7
	//  207  397:invokevirtual   #249 <Method String StringBuilder.toString()>
	//  208  400:invokespecial   #465 <Method void IllegalArgumentException(String)>
	//  209  403:athrow          
			}
		StringBuilder stringbuilder1 = new StringBuilder();
	//  210  404:new             #226 <Class StringBuilder>
	//  211  407:dup             
	//  212  408:invokespecial   #227 <Method void StringBuilder()>
	//  213  411:astore          7
		stringbuilder1.append("Scrapped or attached views may not be recycled. isScrap:");
	//  214  413:aload           7
	//  215  415:ldc2            #469 <String "Scrapped or attached views may not be recycled. isScrap:">
	//  216  418:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//  217  421:pop             
		stringbuilder1.append(r.isScrap());
	//  218  422:aload           7
	//  219  424:aload_1         
	//  220  425:invokevirtual   #433 <Method boolean RecyclerView$ViewHolder.isScrap()>
	//  221  428:invokevirtual   #472 <Method StringBuilder StringBuilder.append(boolean)>
	//  222  431:pop             
		stringbuilder1.append(" isAttached:");
	//  223  432:aload           7
	//  224  434:ldc2            #474 <String " isAttached:">
	//  225  437:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//  226  440:pop             
		if(r.itemView.getParent() != null)
	//* 227  441:aload_1         
	//* 228  442:getfield        #65  <Field View RecyclerView$ViewHolder.itemView>
	//* 229  445:invokevirtual   #440 <Method android.view.ViewParent View.getParent()>
	//* 230  448:ifnull          454
			flag4 = true;
	//  231  451:iconst_1        
	//  232  452:istore          5
		stringbuilder1.append(flag4);
	//  233  454:aload           7
	//  234  456:iload           5
	//  235  458:invokevirtual   #472 <Method StringBuilder StringBuilder.append(boolean)>
	//  236  461:pop             
		stringbuilder1.append(exceptionLabel());
	//  237  462:aload           7
	//  238  464:aload_0         
	//  239  465:getfield        #28  <Field RecyclerView this$0>
	//  240  468:invokevirtual   #244 <Method String RecyclerView.exceptionLabel()>
	//  241  471:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//  242  474:pop             
		throw new IllegalArgumentException(stringbuilder1.toString());
	//  243  475:new             #464 <Class IllegalArgumentException>
	//  244  478:dup             
	//  245  479:aload           7
	//  246  481:invokevirtual   #249 <Method String StringBuilder.toString()>
	//  247  484:invokespecial   #465 <Method void IllegalArgumentException(String)>
	//  248  487:athrow          
	}

	void scrapView(View view)
	{
		view = ((View) (RecyclerView.getChildViewHolderInt(view)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #337 <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:astore_1        
		if(!((r) (view)).hasAnyOfTheFlags(12) && ((r) (view)).isUpdated() && !canReuseUpdatedViewHolder(((r) (view))))
	//*   3    5:aload_1         
	//*   4    6:bipush          12
	//*   5    8:invokevirtual   #178 <Method boolean RecyclerView$ViewHolder.hasAnyOfTheFlags(int)>
	//*   6   11:ifne            69
	//*   7   14:aload_1         
	//*   8   15:invokevirtual   #477 <Method boolean RecyclerView$ViewHolder.isUpdated()>
	//*   9   18:ifeq            69
	//*  10   21:aload_0         
	//*  11   22:getfield        #28  <Field RecyclerView this$0>
	//*  12   25:aload_1         
	//*  13   26:invokevirtual   #480 <Method boolean RecyclerView.canReuseUpdatedViewHolder(RecyclerView$ViewHolder)>
	//*  14   29:ifeq            35
	//*  15   32:goto            69
		{
			if(mChangedScrap == null)
	//*  16   35:aload_0         
	//*  17   36:getfield        #38  <Field ArrayList mChangedScrap>
	//*  18   39:ifnonnull       53
				mChangedScrap = new ArrayList();
	//   19   42:aload_0         
	//   20   43:new             #33  <Class ArrayList>
	//   21   46:dup             
	//   22   47:invokespecial   #34  <Method void ArrayList()>
	//   23   50:putfield        #38  <Field ArrayList mChangedScrap>
			((r) (view)).setScrapContainer(this, true);
	//   24   53:aload_1         
	//   25   54:aload_0         
	//   26   55:iconst_1        
	//   27   56:invokevirtual   #484 <Method void RecyclerView$ViewHolder.setScrapContainer(RecyclerView$Recycler, boolean)>
			mChangedScrap.add(((Object) (view)));
	//   28   59:aload_0         
	//   29   60:getfield        #38  <Field ArrayList mChangedScrap>
	//   30   63:aload_1         
	//   31   64:invokevirtual   #487 <Method boolean ArrayList.add(Object)>
	//   32   67:pop             
			return;
	//   33   68:return          
		}
		if(((r) (view)).isInvalid() && !((r) (view)).isRemoved() && !mAdapter.hasStableIds())
	//*  34   69:aload_1         
	//*  35   70:invokevirtual   #320 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//*  36   73:ifeq            139
	//*  37   76:aload_1         
	//*  38   77:invokevirtual   #301 <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*  39   80:ifne            139
	//*  40   83:aload_0         
	//*  41   84:getfield        #28  <Field RecyclerView this$0>
	//*  42   87:getfield        #144 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  43   90:invokevirtual   #282 <Method boolean RecyclerView$Adapter.hasStableIds()>
	//*  44   93:ifeq            99
	//*  45   96:goto            139
		{
			view = ((View) (new StringBuilder()));
	//   46   99:new             #226 <Class StringBuilder>
	//   47  102:dup             
	//   48  103:invokespecial   #227 <Method void StringBuilder()>
	//   49  106:astore_1        
			((StringBuilder) (view)).append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
	//   50  107:aload_1         
	//   51  108:ldc2            #489 <String "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.">
	//   52  111:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//   53  114:pop             
			((StringBuilder) (view)).append(exceptionLabel());
	//   54  115:aload_1         
	//   55  116:aload_0         
	//   56  117:getfield        #28  <Field RecyclerView this$0>
	//   57  120:invokevirtual   #244 <Method String RecyclerView.exceptionLabel()>
	//   58  123:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//   59  126:pop             
			throw new IllegalArgumentException(((StringBuilder) (view)).toString());
	//   60  127:new             #464 <Class IllegalArgumentException>
	//   61  130:dup             
	//   62  131:aload_1         
	//   63  132:invokevirtual   #249 <Method String StringBuilder.toString()>
	//   64  135:invokespecial   #465 <Method void IllegalArgumentException(String)>
	//   65  138:athrow          
		} else
		{
			((r) (view)).setScrapContainer(this, false);
	//   66  139:aload_1         
	//   67  140:aload_0         
	//   68  141:iconst_0        
	//   69  142:invokevirtual   #484 <Method void RecyclerView$ViewHolder.setScrapContainer(RecyclerView$Recycler, boolean)>
			mAttachedScrap.add(((Object) (view)));
	//   70  145:aload_0         
	//   71  146:getfield        #36  <Field ArrayList mAttachedScrap>
	//   72  149:aload_1         
	//   73  150:invokevirtual   #487 <Method boolean ArrayList.add(Object)>
	//   74  153:pop             
			return;
	//   75  154:return          
		}
	}

	void setRecycledViewPool(iewPool iewpool)
	{
		iewPool iewpool1 = mRecyclerPool;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//    2    4:astore_2        
		if(iewpool1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          13
			iewpool1.detach();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #494 <Method void RecyclerView$RecycledViewPool.detach()>
		mRecyclerPool = iewpool;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:putfield        #134 <Field RecyclerView$RecycledViewPool mRecyclerPool>
		if(mRecyclerPool != null && getAdapter() != null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #134 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//*  12   22:ifnull          42
	//*  13   25:aload_0         
	//*  14   26:getfield        #28  <Field RecyclerView this$0>
	//*  15   29:invokevirtual   #498 <Method RecyclerView$Adapter RecyclerView.getAdapter()>
	//*  16   32:ifnull          42
			mRecyclerPool.attach();
	//   17   35:aload_0         
	//   18   36:getfield        #134 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//   19   39:invokevirtual   #501 <Method void RecyclerView$RecycledViewPool.attach()>
	//   20   42:return          
	}

	void setViewCacheExtension(Extension extension)
	{
		mViewCacheExtension = extension;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #505 <Field RecyclerView$ViewCacheExtension mViewCacheExtension>
	//    3    5:return          
	}

	public void setViewCacheSize(int i)
	{
		mRequestedCacheMax = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #50  <Field int mRequestedCacheMax>
		updateViewCacheSize();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #509 <Method void updateViewCacheSize()>
	//    5    9:return          
	}

	r tryGetViewHolderForPositionByDeadline(int i, boolean flag, long l)
	{
label0:
		{
			boolean flag1;
			boolean flag4;
			Object obj;
label1:
			{
label2:
				{
					if(i < 0 || i >= mState.getItemCount())
						break label0;
	//    0    0:iload_1         
	//    1    1:iflt            1049
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field RecyclerView this$0>
	//    5    9:getfield        #160 <Field RecyclerView$State RecyclerView.mState>
	//    6   12:invokevirtual   #215 <Method int RecyclerView$State.getItemCount()>
	//    7   15:icmpge          1049
					boolean flag5 = mState.isPreLayout();
	//    8   18:aload_0         
	//    9   19:getfield        #28  <Field RecyclerView this$0>
	//   10   22:getfield        #160 <Field RecyclerView$State RecyclerView.mState>
	//   11   25:invokevirtual   #165 <Method boolean RecyclerView$State.isPreLayout()>
	//   12   28:istore          10
					flag4 = true;
	//   13   30:iconst_1        
	//   14   31:istore          9
					boolean flag2;
					r r;
					if(flag5)
	//*  15   33:iload           10
	//*  16   35:ifeq            62
					{
						r = getChangedScrapViewForPosition(i);
	//   17   38:aload_0         
	//   18   39:iload_1         
	//   19   40:invokevirtual   #512 <Method RecyclerView$ViewHolder getChangedScrapViewForPosition(int)>
	//   20   43:astore          16
						if(r != null)
	//*  21   45:aload           16
	//*  22   47:ifnull          56
							flag2 = true;
	//   23   50:iconst_1        
	//   24   51:istore          6
						else
	//*  25   53:goto            68
							flag2 = false;
	//   26   56:iconst_0        
	//   27   57:istore          6
					} else
	//*  28   59:goto            68
					{
						r = null;
	//   29   62:aconst_null     
	//   30   63:astore          16
						flag2 = false;
	//   31   65:iconst_0        
	//   32   66:istore          6
					}
					obj = ((Object) (r));
	//   33   68:aload           16
	//   34   70:astore          15
					flag1 = flag2;
	//   35   72:iload           6
	//   36   74:istore          5
					if(r == null)
	//*  37   76:aload           16
	//*  38   78:ifnonnull       186
					{
						r r1 = getScrapOrHiddenOrCachedHolderForPosition(i, flag);
	//   39   81:aload_0         
	//   40   82:iload_1         
	//   41   83:iload_2         
	//   42   84:invokevirtual   #514 <Method RecyclerView$ViewHolder getScrapOrHiddenOrCachedHolderForPosition(int, boolean)>
	//   43   87:astore          16
						obj = ((Object) (r1));
	//   44   89:aload           16
	//   45   91:astore          15
						flag1 = flag2;
	//   46   93:iload           6
	//   47   95:istore          5
						if(r1 != null)
	//*  48   97:aload           16
	//*  49   99:ifnull          186
							if(!validateViewHolderForOffsetPosition(r1))
	//*  50  102:aload_0         
	//*  51  103:aload           16
	//*  52  105:invokevirtual   #517 <Method boolean validateViewHolderForOffsetPosition(RecyclerView$ViewHolder)>
	//*  53  108:ifne            179
							{
								if(!flag)
	//*  54  111:iload_2         
	//*  55  112:ifne            169
								{
									r1.addFlags(4);
	//   56  115:aload           16
	//   57  117:iconst_4        
	//   58  118:invokevirtual   #83  <Method void RecyclerView$ViewHolder.addFlags(int)>
									if(r1.isScrap())
	//*  59  121:aload           16
	//*  60  123:invokevirtual   #433 <Method boolean RecyclerView$ViewHolder.isScrap()>
	//*  61  126:ifeq            150
									{
										removeDetachedView(r1.itemView, false);
	//   62  129:aload_0         
	//   63  130:getfield        #28  <Field RecyclerView this$0>
	//   64  133:aload           16
	//   65  135:getfield        #65  <Field View RecyclerView$ViewHolder.itemView>
	//   66  138:iconst_0        
	//   67  139:invokevirtual   #308 <Method void RecyclerView.removeDetachedView(View, boolean)>
										r1.unScrap();
	//   68  142:aload           16
	//   69  144:invokevirtual   #436 <Method void RecyclerView$ViewHolder.unScrap()>
									} else
	//*  70  147:goto            163
									if(r1.wasReturnedFromScrap())
	//*  71  150:aload           16
	//*  72  152:invokevirtual   #276 <Method boolean RecyclerView$ViewHolder.wasReturnedFromScrap()>
	//*  73  155:ifeq            163
										r1.clearReturnedFromScrapFlag();
	//   74  158:aload           16
	//   75  160:invokevirtual   #409 <Method void RecyclerView$ViewHolder.clearReturnedFromScrapFlag()>
									recycleViewHolderInternal(r1);
	//   76  163:aload_0         
	//   77  164:aload           16
	//   78  166:invokevirtual   #412 <Method void recycleViewHolderInternal(RecyclerView$ViewHolder)>
								}
								obj = null;
	//   79  169:aconst_null     
	//   80  170:astore          15
								flag1 = flag2;
	//   81  172:iload           6
	//   82  174:istore          5
							} else
	//*  83  176:goto            186
							{
								flag1 = true;
	//   84  179:iconst_1        
	//   85  180:istore          5
								obj = ((Object) (r1));
	//   86  182:aload           16
	//   87  184:astore          15
							}
					}
					if(obj == null)
	//*  88  186:aload           15
	//*  89  188:ifnonnull       747
					{
						int i1 = mAdapterHelper.findPositionOffset(i);
	//   90  191:aload_0         
	//   91  192:getfield        #28  <Field RecyclerView this$0>
	//   92  195:getfield        #219 <Field AdapterHelper RecyclerView.mAdapterHelper>
	//   93  198:iload_1         
	//   94  199:invokevirtual   #224 <Method int AdapterHelper.findPositionOffset(int)>
	//   95  202:istore          8
						if(i1 >= 0 && i1 < mAdapter.getItemCount())
	//*  96  204:iload           8
	//*  97  206:iflt            645
	//*  98  209:iload           8
	//*  99  211:aload_0         
	//* 100  212:getfield        #28  <Field RecyclerView this$0>
	//* 101  215:getfield        #144 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//* 102  218:invokevirtual   #283 <Method int RecyclerView$Adapter.getItemCount()>
	//* 103  221:icmpge          645
						{
							int k = mAdapter.getItemViewType(i1);
	//  104  224:aload_0         
	//  105  225:getfield        #28  <Field RecyclerView this$0>
	//  106  228:getfield        #144 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//  107  231:iload           8
	//  108  233:invokevirtual   #519 <Method int RecyclerView$Adapter.getItemViewType(int)>
	//  109  236:istore          7
							boolean flag3 = flag1;
	//  110  238:iload           5
	//  111  240:istore          6
							if(mAdapter.hasStableIds())
	//* 112  242:aload_0         
	//* 113  243:getfield        #28  <Field RecyclerView this$0>
	//* 114  246:getfield        #144 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//* 115  249:invokevirtual   #282 <Method boolean RecyclerView$Adapter.hasStableIds()>
	//* 116  252:ifeq            303
							{
								r r2 = getScrapOrCachedViewForId(mAdapter.getItemId(i1), k, flag);
	//  117  255:aload_0         
	//  118  256:aload_0         
	//  119  257:getfield        #28  <Field RecyclerView this$0>
	//  120  260:getfield        #144 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//  121  263:iload           8
	//  122  265:invokevirtual   #287 <Method long RecyclerView$Adapter.getItemId(int)>
	//  123  268:iload           7
	//  124  270:iload_2         
	//  125  271:invokevirtual   #521 <Method RecyclerView$ViewHolder getScrapOrCachedViewForId(long, int, boolean)>
	//  126  274:astore          16
								obj = ((Object) (r2));
	//  127  276:aload           16
	//  128  278:astore          15
								flag3 = flag1;
	//  129  280:iload           5
	//  130  282:istore          6
								if(r2 != null)
	//* 131  284:aload           16
	//* 132  286:ifnull          303
								{
									r2.mPosition = i1;
	//  133  289:aload           16
	//  134  291:iload           8
	//  135  293:putfield        #387 <Field int RecyclerView$ViewHolder.mPosition>
									flag3 = true;
	//  136  296:iconst_1        
	//  137  297:istore          6
									obj = ((Object) (r2));
	//  138  299:aload           16
	//  139  301:astore          15
								}
							}
							Object obj1 = obj;
	//  140  303:aload           15
	//  141  305:astore          16
							if(obj == null)
	//* 142  307:aload           15
	//* 143  309:ifnonnull       462
							{
								Object obj3 = ((Object) (mViewCacheExtension));
	//  144  312:aload_0         
	//  145  313:getfield        #505 <Field RecyclerView$ViewCacheExtension mViewCacheExtension>
	//  146  316:astore          17
								obj1 = obj;
	//  147  318:aload           15
	//  148  320:astore          16
								if(obj3 != null)
	//* 149  322:aload           17
	//* 150  324:ifnull          462
								{
									obj3 = ((Object) (((Extension) (obj3)).getViewForPositionAndType(this, i, k)));
	//  151  327:aload           17
	//  152  329:aload_0         
	//  153  330:iload_1         
	//  154  331:iload           7
	//  155  333:invokevirtual   #527 <Method View RecyclerView$ViewCacheExtension.getViewForPositionAndType(RecyclerView$Recycler, int, int)>
	//  156  336:astore          17
									obj1 = obj;
	//  157  338:aload           15
	//  158  340:astore          16
									if(obj3 != null)
	//* 159  342:aload           17
	//* 160  344:ifnull          462
									{
										obj1 = ((Object) (getChildViewHolder(((View) (obj3)))));
	//  161  347:aload_0         
	//  162  348:getfield        #28  <Field RecyclerView this$0>
	//  163  351:aload           17
	//  164  353:invokevirtual   #530 <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolder(View)>
	//  165  356:astore          16
										if(obj1 != null)
	//* 166  358:aload           16
	//* 167  360:ifnull          418
										{
											if(((r) (obj1)).shouldIgnore())
	//* 168  363:aload           16
	//* 169  365:invokevirtual   #443 <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//* 170  368:ifne            374
	//* 171  371:goto            462
											{
												obj = ((Object) (new StringBuilder()));
	//  172  374:new             #226 <Class StringBuilder>
	//  173  377:dup             
	//  174  378:invokespecial   #227 <Method void StringBuilder()>
	//  175  381:astore          15
												((StringBuilder) (obj)).append("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
	//  176  383:aload           15
	//  177  385:ldc2            #532 <String "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.">
	//  178  388:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//  179  391:pop             
												((StringBuilder) (obj)).append(exceptionLabel());
	//  180  392:aload           15
	//  181  394:aload_0         
	//  182  395:getfield        #28  <Field RecyclerView this$0>
	//  183  398:invokevirtual   #244 <Method String RecyclerView.exceptionLabel()>
	//  184  401:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//  185  404:pop             
												throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  186  405:new             #464 <Class IllegalArgumentException>
	//  187  408:dup             
	//  188  409:aload           15
	//  189  411:invokevirtual   #249 <Method String StringBuilder.toString()>
	//  190  414:invokespecial   #465 <Method void IllegalArgumentException(String)>
	//  191  417:athrow          
											}
										} else
										{
											obj = ((Object) (new StringBuilder()));
	//  192  418:new             #226 <Class StringBuilder>
	//  193  421:dup             
	//  194  422:invokespecial   #227 <Method void StringBuilder()>
	//  195  425:astore          15
											((StringBuilder) (obj)).append("getViewForPositionAndType returned a view which does not have a ViewHolder");
	//  196  427:aload           15
	//  197  429:ldc2            #534 <String "getViewForPositionAndType returned a view which does not have a ViewHolder">
	//  198  432:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//  199  435:pop             
											((StringBuilder) (obj)).append(exceptionLabel());
	//  200  436:aload           15
	//  201  438:aload_0         
	//  202  439:getfield        #28  <Field RecyclerView this$0>
	//  203  442:invokevirtual   #244 <Method String RecyclerView.exceptionLabel()>
	//  204  445:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//  205  448:pop             
											throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  206  449:new             #464 <Class IllegalArgumentException>
	//  207  452:dup             
	//  208  453:aload           15
	//  209  455:invokevirtual   #249 <Method String StringBuilder.toString()>
	//  210  458:invokespecial   #465 <Method void IllegalArgumentException(String)>
	//  211  461:athrow          
										}
									}
								}
							}
							obj = obj1;
	//  212  462:aload           16
	//  213  464:astore          15
							if(obj1 == null)
	//* 214  466:aload           16
	//* 215  468:ifnonnull       516
							{
								r r3 = getRecycledViewPool().getRecycledView(k);
	//  216  471:aload_0         
	//  217  472:invokevirtual   #189 <Method RecyclerView$RecycledViewPool getRecycledViewPool()>
	//  218  475:iload           7
	//  219  477:invokevirtual   #537 <Method RecyclerView$ViewHolder RecyclerView$RecycledViewPool.getRecycledView(int)>
	//  220  480:astore          16
								obj = ((Object) (r3));
	//  221  482:aload           16
	//  222  484:astore          15
								if(r3 != null)
	//* 223  486:aload           16
	//* 224  488:ifnull          516
								{
									r3.resetInternal();
	//  225  491:aload           16
	//  226  493:invokevirtual   #540 <Method void RecyclerView$ViewHolder.resetInternal()>
									obj = ((Object) (r3));
	//  227  496:aload           16
	//  228  498:astore          15
									if(RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST)
	//* 229  500:getstatic       #543 <Field boolean RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST>
	//* 230  503:ifeq            516
									{
										invalidateDisplayListInt(r3);
	//  231  506:aload_0         
	//  232  507:aload           16
	//  233  509:invokespecial   #545 <Method void invalidateDisplayListInt(RecyclerView$ViewHolder)>
										obj = ((Object) (r3));
	//  234  512:aload           16
	//  235  514:astore          15
									}
								}
							}
							if(obj == null)
	//* 236  516:aload           15
	//* 237  518:ifnonnull       638
							{
								long l1 = getNanoTime();
	//  238  521:aload_0         
	//  239  522:getfield        #28  <Field RecyclerView this$0>
	//  240  525:invokevirtual   #130 <Method long RecyclerView.getNanoTime()>
	//  241  528:lstore          11
								if(l != 0xffffffffL && !mRecyclerPool.willCreateInTime(k, l1, l))
	//* 242  530:lload_3         
	//* 243  531:ldc2w           #131 <Long 0xffffffffL>
	//* 244  534:lcmp            
	//* 245  535:ifeq            555
	//* 246  538:aload_0         
	//* 247  539:getfield        #134 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//* 248  542:iload           7
	//* 249  544:lload           11
	//* 250  546:lload_3         
	//* 251  547:invokevirtual   #548 <Method boolean RecyclerView$RecycledViewPool.willCreateInTime(int, long, long)>
	//* 252  550:ifne            555
									return null;
	//  253  553:aconst_null     
	//  254  554:areturn         
								obj = ((Object) (mAdapter.createViewHolder(((ViewGroup) (RecyclerView.this)), k)));
	//  255  555:aload_0         
	//  256  556:getfield        #28  <Field RecyclerView this$0>
	//  257  559:getfield        #144 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//  258  562:aload_0         
	//  259  563:getfield        #28  <Field RecyclerView this$0>
	//  260  566:iload           7
	//  261  568:invokevirtual   #552 <Method RecyclerView$ViewHolder RecyclerView$Adapter.createViewHolder(ViewGroup, int)>
	//  262  571:astore          15
								if(RecyclerView.ALLOW_THREAD_GAP_WORK)
	//* 263  573:getstatic       #415 <Field boolean RecyclerView.ALLOW_THREAD_GAP_WORK>
	//* 264  576:ifeq            608
								{
									RecyclerView recyclerview = RecyclerView.findNestedRecyclerView(((r) (obj)).itemView);
	//  265  579:aload           15
	//  266  581:getfield        #65  <Field View RecyclerView$ViewHolder.itemView>
	//  267  584:invokestatic    #556 <Method RecyclerView RecyclerView.findNestedRecyclerView(View)>
	//  268  587:astore          16
									if(recyclerview != null)
	//* 269  589:aload           16
	//* 270  591:ifnull          608
										obj.mNestedRecyclerView = new WeakReference(((Object) (recyclerview)));
	//  271  594:aload           15
	//  272  596:new             #558 <Class WeakReference>
	//  273  599:dup             
	//  274  600:aload           16
	//  275  602:invokespecial   #560 <Method void WeakReference(Object)>
	//  276  605:putfield        #564 <Field WeakReference RecyclerView$ViewHolder.mNestedRecyclerView>
								}
								long l2 = getNanoTime();
	//  277  608:aload_0         
	//  278  609:getfield        #28  <Field RecyclerView this$0>
	//  279  612:invokevirtual   #130 <Method long RecyclerView.getNanoTime()>
	//  280  615:lstore          13
								mRecyclerPool.factorInCreateTime(k, l2 - l1);
	//  281  617:aload_0         
	//  282  618:getfield        #134 <Field RecyclerView$RecycledViewPool mRecyclerPool>
	//  283  621:iload           7
	//  284  623:lload           13
	//  285  625:lload           11
	//  286  627:lsub            
	//  287  628:invokevirtual   #567 <Method void RecyclerView$RecycledViewPool.factorInCreateTime(int, long)>
								flag1 = flag3;
	//  288  631:iload           6
	//  289  633:istore          5
							} else
	//* 290  635:goto            747
							{
								flag1 = flag3;
	//  291  638:iload           6
	//  292  640:istore          5
							}
						} else
	//* 293  642:goto            747
						{
							obj = ((Object) (new StringBuilder()));
	//  294  645:new             #226 <Class StringBuilder>
	//  295  648:dup             
	//  296  649:invokespecial   #227 <Method void StringBuilder()>
	//  297  652:astore          15
							((StringBuilder) (obj)).append("Inconsistency detected. Invalid item position ");
	//  298  654:aload           15
	//  299  656:ldc2            #569 <String "Inconsistency detected. Invalid item position ">
	//  300  659:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//  301  662:pop             
							((StringBuilder) (obj)).append(i);
	//  302  663:aload           15
	//  303  665:iload_1         
	//  304  666:invokevirtual   #236 <Method StringBuilder StringBuilder.append(int)>
	//  305  669:pop             
							((StringBuilder) (obj)).append("(offset:");
	//  306  670:aload           15
	//  307  672:ldc2            #571 <String "(offset:">
	//  308  675:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//  309  678:pop             
							((StringBuilder) (obj)).append(i1);
	//  310  679:aload           15
	//  311  681:iload           8
	//  312  683:invokevirtual   #236 <Method StringBuilder StringBuilder.append(int)>
	//  313  686:pop             
							((StringBuilder) (obj)).append(").");
	//  314  687:aload           15
	//  315  689:ldc2            #573 <String ").">
	//  316  692:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//  317  695:pop             
							((StringBuilder) (obj)).append("state:");
	//  318  696:aload           15
	//  319  698:ldc2            #575 <String "state:">
	//  320  701:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//  321  704:pop             
							((StringBuilder) (obj)).append(mState.getItemCount());
	//  322  705:aload           15
	//  323  707:aload_0         
	//  324  708:getfield        #28  <Field RecyclerView this$0>
	//  325  711:getfield        #160 <Field RecyclerView$State RecyclerView.mState>
	//  326  714:invokevirtual   #215 <Method int RecyclerView$State.getItemCount()>
	//  327  717:invokevirtual   #236 <Method StringBuilder StringBuilder.append(int)>
	//  328  720:pop             
							((StringBuilder) (obj)).append(exceptionLabel());
	//  329  721:aload           15
	//  330  723:aload_0         
	//  331  724:getfield        #28  <Field RecyclerView this$0>
	//  332  727:invokevirtual   #244 <Method String RecyclerView.exceptionLabel()>
	//  333  730:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//  334  733:pop             
							throw new IndexOutOfBoundsException(((StringBuilder) (obj)).toString());
	//  335  734:new             #246 <Class IndexOutOfBoundsException>
	//  336  737:dup             
	//  337  738:aload           15
	//  338  740:invokevirtual   #249 <Method String StringBuilder.toString()>
	//  339  743:invokespecial   #252 <Method void IndexOutOfBoundsException(String)>
	//  340  746:athrow          
						}
					}
					if(flag1 && !mState.isPreLayout() && ((r) (obj)).hasAnyOfTheFlags(8192))
	//* 341  747:iload           5
	//* 342  749:ifeq            848
	//* 343  752:aload_0         
	//* 344  753:getfield        #28  <Field RecyclerView this$0>
	//* 345  756:getfield        #160 <Field RecyclerView$State RecyclerView.mState>
	//* 346  759:invokevirtual   #165 <Method boolean RecyclerView$State.isPreLayout()>
	//* 347  762:ifne            848
	//* 348  765:aload           15
	//* 349  767:sipush          8192
	//* 350  770:invokevirtual   #178 <Method boolean RecyclerView$ViewHolder.hasAnyOfTheFlags(int)>
	//* 351  773:ifeq            848
					{
						((r) (obj)).setFlags(0, 8192);
	//  352  776:aload           15
	//  353  778:iconst_0        
	//  354  779:sipush          8192
	//  355  782:invokevirtual   #182 <Method void RecyclerView$ViewHolder.setFlags(int, int)>
						if(mState.mRunSimpleAnimations)
	//* 356  785:aload_0         
	//* 357  786:getfield        #28  <Field RecyclerView this$0>
	//* 358  789:getfield        #160 <Field RecyclerView$State RecyclerView.mState>
	//* 359  792:getfield        #578 <Field boolean RecyclerView$State.mRunSimpleAnimations>
	//* 360  795:ifeq            848
						{
							int j = tor.buildAdapterChangeFlagsForAnimations(((r) (obj)));
	//  361  798:aload           15
	//  362  800:invokestatic    #584 <Method int RecyclerView$ItemAnimator.buildAdapterChangeFlagsForAnimations(RecyclerView$ViewHolder)>
	//  363  803:istore          6
							tor.ItemHolderInfo itemholderinfo = mItemAnimator.recordPreLayoutInformation(mState, ((r) (obj)), j | 0x1000, ((r) (obj)).getUnmodifiedPayloads());
	//  364  805:aload_0         
	//  365  806:getfield        #28  <Field RecyclerView this$0>
	//  366  809:getfield        #588 <Field RecyclerView$ItemAnimator RecyclerView.mItemAnimator>
	//  367  812:aload_0         
	//  368  813:getfield        #28  <Field RecyclerView this$0>
	//  369  816:getfield        #160 <Field RecyclerView$State RecyclerView.mState>
	//  370  819:aload           15
	//  371  821:iload           6
	//  372  823:sipush          4096
	//  373  826:ior             
	//  374  827:aload           15
	//  375  829:invokevirtual   #591 <Method List RecyclerView$ViewHolder.getUnmodifiedPayloads()>
	//  376  832:invokevirtual   #595 <Method RecyclerView$ItemAnimator$ItemHolderInfo RecyclerView$ItemAnimator.recordPreLayoutInformation(RecyclerView$State, RecyclerView$ViewHolder, int, List)>
	//  377  835:astore          16
							recordAnimationInfoIfBouncedHiddenView(((r) (obj)), itemholderinfo);
	//  378  837:aload_0         
	//  379  838:getfield        #28  <Field RecyclerView this$0>
	//  380  841:aload           15
	//  381  843:aload           16
	//  382  845:invokevirtual   #599 <Method void RecyclerView.recordAnimationInfoIfBouncedHiddenView(RecyclerView$ViewHolder, RecyclerView$ItemAnimator$ItemHolderInfo)>
						}
					}
					if(mState.isPreLayout() && ((r) (obj)).isBound())
	//* 383  848:aload_0         
	//* 384  849:getfield        #28  <Field RecyclerView this$0>
	//* 385  852:getfield        #160 <Field RecyclerView$State RecyclerView.mState>
	//* 386  855:invokevirtual   #165 <Method boolean RecyclerView$State.isPreLayout()>
	//* 387  858:ifeq            878
	//* 388  861:aload           15
	//* 389  863:invokevirtual   #602 <Method boolean RecyclerView$ViewHolder.isBound()>
	//* 390  866:ifeq            878
						obj.mPreLayoutPosition = i;
	//  391  869:aload           15
	//  392  871:iload_1         
	//  393  872:putfield        #168 <Field int RecyclerView$ViewHolder.mPreLayoutPosition>
					else
	//* 394  875:goto            905
					if(!((r) (obj)).isBound() || ((r) (obj)).needsUpdate() || ((r) (obj)).isInvalid())
	//* 395  878:aload           15
	//* 396  880:invokevirtual   #602 <Method boolean RecyclerView$ViewHolder.isBound()>
	//* 397  883:ifeq            910
	//* 398  886:aload           15
	//* 399  888:invokevirtual   #605 <Method boolean RecyclerView$ViewHolder.needsUpdate()>
	//* 400  891:ifne            910
	//* 401  894:aload           15
	//* 402  896:invokevirtual   #320 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//* 403  899:ifeq            905
						break label2;
	//  404  902:goto            910
					flag = false;
	//  405  905:iconst_0        
	//  406  906:istore_2        
					break label1;
	//  407  907:goto            930
				}
				flag = tryBindViewHolderByDeadline(((r) (obj)), mAdapterHelper.findPositionOffset(i), i, l);
	//  408  910:aload_0         
	//  409  911:aload           15
	//  410  913:aload_0         
	//  411  914:getfield        #28  <Field RecyclerView this$0>
	//  412  917:getfield        #219 <Field AdapterHelper RecyclerView.mAdapterHelper>
	//  413  920:iload_1         
	//  414  921:invokevirtual   #224 <Method int AdapterHelper.findPositionOffset(int)>
	//  415  924:iload_1         
	//  416  925:lload_3         
	//  417  926:invokespecial   #607 <Method boolean tryBindViewHolderByDeadline(RecyclerView$ViewHolder, int, int, long)>
	//  418  929:istore_2        
			}
			Object obj2 = ((Object) (((r) (obj)).itemView.getLayoutParams()));
	//  419  930:aload           15
	//  420  932:getfield        #65  <Field View RecyclerView$ViewHolder.itemView>
	//  421  935:invokevirtual   #373 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  422  938:astore          16
			if(obj2 == null)
	//* 423  940:aload           16
	//* 424  942:ifnonnull       970
			{
				obj2 = ((Object) ((ams)generateDefaultLayoutParams()));
	//  425  945:aload_0         
	//  426  946:getfield        #28  <Field RecyclerView this$0>
	//  427  949:invokevirtual   #610 <Method android.view.ViewGroup$LayoutParams RecyclerView.generateDefaultLayoutParams()>
	//  428  952:checkcast       #375 <Class RecyclerView$LayoutParams>
	//  429  955:astore          16
				((r) (obj)).itemView.setLayoutParams(((android.view.) (obj2)));
	//  430  957:aload           15
	//  431  959:getfield        #65  <Field View RecyclerView$ViewHolder.itemView>
	//  432  962:aload           16
	//  433  964:invokevirtual   #614 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			} else
	//* 434  967:goto            1016
			if(!checkLayoutParams(((android.view.) (obj2))))
	//* 435  970:aload_0         
	//* 436  971:getfield        #28  <Field RecyclerView this$0>
	//* 437  974:aload           16
	//* 438  976:invokevirtual   #618 <Method boolean RecyclerView.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 439  979:ifne            1009
			{
				obj2 = ((Object) ((ams)generateLayoutParams(((android.view.) (obj2)))));
	//  440  982:aload_0         
	//  441  983:getfield        #28  <Field RecyclerView this$0>
	//  442  986:aload           16
	//  443  988:invokevirtual   #622 <Method android.view.ViewGroup$LayoutParams RecyclerView.generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//  444  991:checkcast       #375 <Class RecyclerView$LayoutParams>
	//  445  994:astore          16
				((r) (obj)).itemView.setLayoutParams(((android.view.) (obj2)));
	//  446  996:aload           15
	//  447  998:getfield        #65  <Field View RecyclerView$ViewHolder.itemView>
	//  448 1001:aload           16
	//  449 1003:invokevirtual   #614 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			} else
	//* 450 1006:goto            1016
			{
				obj2 = ((Object) ((ams)obj2));
	//  451 1009:aload           16
	//  452 1011:checkcast       #375 <Class RecyclerView$LayoutParams>
	//  453 1014:astore          16
			}
			obj2.mViewHolder = ((r) (obj));
	//  454 1016:aload           16
	//  455 1018:aload           15
	//  456 1020:putfield        #626 <Field RecyclerView$ViewHolder RecyclerView$LayoutParams.mViewHolder>
			if(flag1 && flag)
	//* 457 1023:iload           5
	//* 458 1025:ifeq            1038
	//* 459 1028:iload_2         
	//* 460 1029:ifeq            1038
				flag = flag4;
	//  461 1032:iload           9
	//  462 1034:istore_2        
			else
	//* 463 1035:goto            1040
				flag = false;
	//  464 1038:iconst_0        
	//  465 1039:istore_2        
			obj2.mPendingInvalidate = flag;
	//  466 1040:aload           16
	//  467 1042:iload_2         
	//  468 1043:putfield        #629 <Field boolean RecyclerView$LayoutParams.mPendingInvalidate>
			return ((r) (obj));
	//  469 1046:aload           15
	//  470 1048:areturn         
		}
		StringBuilder stringbuilder = new StringBuilder();
	//  471 1049:new             #226 <Class StringBuilder>
	//  472 1052:dup             
	//  473 1053:invokespecial   #227 <Method void StringBuilder()>
	//  474 1056:astore          15
		stringbuilder.append("Invalid item position ");
	//  475 1058:aload           15
	//  476 1060:ldc2            #631 <String "Invalid item position ">
	//  477 1063:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//  478 1066:pop             
		stringbuilder.append(i);
	//  479 1067:aload           15
	//  480 1069:iload_1         
	//  481 1070:invokevirtual   #236 <Method StringBuilder StringBuilder.append(int)>
	//  482 1073:pop             
		stringbuilder.append("(");
	//  483 1074:aload           15
	//  484 1076:ldc2            #633 <String "(">
	//  485 1079:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//  486 1082:pop             
		stringbuilder.append(i);
	//  487 1083:aload           15
	//  488 1085:iload_1         
	//  489 1086:invokevirtual   #236 <Method StringBuilder StringBuilder.append(int)>
	//  490 1089:pop             
		stringbuilder.append("). Item count:");
	//  491 1090:aload           15
	//  492 1092:ldc2            #635 <String "). Item count:">
	//  493 1095:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//  494 1098:pop             
		stringbuilder.append(mState.getItemCount());
	//  495 1099:aload           15
	//  496 1101:aload_0         
	//  497 1102:getfield        #28  <Field RecyclerView this$0>
	//  498 1105:getfield        #160 <Field RecyclerView$State RecyclerView.mState>
	//  499 1108:invokevirtual   #215 <Method int RecyclerView$State.getItemCount()>
	//  500 1111:invokevirtual   #236 <Method StringBuilder StringBuilder.append(int)>
	//  501 1114:pop             
		stringbuilder.append(exceptionLabel());
	//  502 1115:aload           15
	//  503 1117:aload_0         
	//  504 1118:getfield        #28  <Field RecyclerView this$0>
	//  505 1121:invokevirtual   #244 <Method String RecyclerView.exceptionLabel()>
	//  506 1124:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//  507 1127:pop             
		throw new IndexOutOfBoundsException(stringbuilder.toString());
	//  508 1128:new             #246 <Class IndexOutOfBoundsException>
	//  509 1131:dup             
	//  510 1132:aload           15
	//  511 1134:invokevirtual   #249 <Method String StringBuilder.toString()>
	//  512 1137:invokespecial   #252 <Method void IndexOutOfBoundsException(String)>
	//  513 1140:athrow          
	}

	void unscrapView(r r)
	{
		if(r.mInChangeScrap)
	//*   0    0:aload_1         
	//*   1    1:getfield        #406 <Field boolean RecyclerView$ViewHolder.mInChangeScrap>
	//*   2    4:ifeq            19
			mChangedScrap.remove(((Object) (r)));
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field ArrayList mChangedScrap>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #638 <Method boolean ArrayList.remove(Object)>
	//    7   15:pop             
		else
	//*   8   16:goto            28
			mAttachedScrap.remove(((Object) (r)));
	//    9   19:aload_0         
	//   10   20:getfield        #36  <Field ArrayList mAttachedScrap>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #638 <Method boolean ArrayList.remove(Object)>
	//   13   27:pop             
		r.mScrapContainer = null;
	//   14   28:aload_1         
	//   15   29:aconst_null     
	//   16   30:putfield        #403 <Field RecyclerView$Recycler RecyclerView$ViewHolder.mScrapContainer>
		r.mInChangeScrap = false;
	//   17   33:aload_1         
	//   18   34:iconst_0        
	//   19   35:putfield        #406 <Field boolean RecyclerView$ViewHolder.mInChangeScrap>
		r.clearReturnedFromScrapFlag();
	//   20   38:aload_1         
	//   21   39:invokevirtual   #409 <Method void RecyclerView$ViewHolder.clearReturnedFromScrapFlag()>
	//   22   42:return          
	}

	void updateViewCacheSize()
	{
		int i;
		if(mLayout != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field RecyclerView this$0>
	//*   2    4:getfield        #642 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//*   3    7:ifnull          24
			i = mLayout.mPrefetchMaxCountObserved;
	//    4   10:aload_0         
	//    5   11:getfield        #28  <Field RecyclerView this$0>
	//    6   14:getfield        #642 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//    7   17:getfield        #647 <Field int RecyclerView$LayoutManager.mPrefetchMaxCountObserved>
	//    8   20:istore_1        
		else
	//*   9   21:goto            26
			i = 0;
	//   10   24:iconst_0        
	//   11   25:istore_1        
		mViewCacheMax = mRequestedCacheMax + i;
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getfield        #50  <Field int mRequestedCacheMax>
	//   15   31:iload_1         
	//   16   32:iadd            
	//   17   33:putfield        #52  <Field int mViewCacheMax>
		for(int j = mCachedViews.size() - 1; j >= 0 && mCachedViews.size() > mViewCacheMax; j--)
	//*  18   36:aload_0         
	//*  19   37:getfield        #40  <Field ArrayList mCachedViews>
	//*  20   40:invokevirtual   #202 <Method int ArrayList.size()>
	//*  21   43:iconst_1        
	//*  22   44:isub            
	//*  23   45:istore_1        
	//*  24   46:iload_1         
	//*  25   47:iflt            76
	//*  26   50:aload_0         
	//*  27   51:getfield        #40  <Field ArrayList mCachedViews>
	//*  28   54:invokevirtual   #202 <Method int ArrayList.size()>
	//*  29   57:aload_0         
	//*  30   58:getfield        #52  <Field int mViewCacheMax>
	//*  31   61:icmple          76
			recycleCachedViewAt(j);
	//   32   64:aload_0         
	//   33   65:iload_1         
	//   34   66:invokevirtual   #315 <Method void recycleCachedViewAt(int)>

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
	//*   1    1:invokevirtual   #301 <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*   2    4:ifeq            18
			return mState.isPreLayout();
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field RecyclerView this$0>
	//    5   11:getfield        #160 <Field RecyclerView$State RecyclerView.mState>
	//    6   14:invokevirtual   #165 <Method boolean RecyclerView$State.isPreLayout()>
	//    7   17:ireturn         
		if(r.mPosition >= 0 && r.mPosition < mAdapter.getItemCount())
	//*   8   18:aload_1         
	//*   9   19:getfield        #387 <Field int RecyclerView$ViewHolder.mPosition>
	//*  10   22:iflt            123
	//*  11   25:aload_1         
	//*  12   26:getfield        #387 <Field int RecyclerView$ViewHolder.mPosition>
	//*  13   29:aload_0         
	//*  14   30:getfield        #28  <Field RecyclerView this$0>
	//*  15   33:getfield        #144 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  16   36:invokevirtual   #283 <Method int RecyclerView$Adapter.getItemCount()>
	//*  17   39:icmpge          123
		{
			boolean flag1 = mState.isPreLayout();
	//   18   42:aload_0         
	//   19   43:getfield        #28  <Field RecyclerView this$0>
	//   20   46:getfield        #160 <Field RecyclerView$State RecyclerView.mState>
	//   21   49:invokevirtual   #165 <Method boolean RecyclerView$State.isPreLayout()>
	//   22   52:istore_3        
			boolean flag = false;
	//   23   53:iconst_0        
	//   24   54:istore_2        
			if(!flag1 && mAdapter.getItemViewType(r.mPosition) != r.getItemViewType())
	//*  25   55:iload_3         
	//*  26   56:ifne            82
	//*  27   59:aload_0         
	//*  28   60:getfield        #28  <Field RecyclerView this$0>
	//*  29   63:getfield        #144 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  30   66:aload_1         
	//*  31   67:getfield        #387 <Field int RecyclerView$ViewHolder.mPosition>
	//*  32   70:invokevirtual   #519 <Method int RecyclerView$Adapter.getItemViewType(int)>
	//*  33   73:aload_1         
	//*  34   74:invokevirtual   #126 <Method int RecyclerView$ViewHolder.getItemViewType()>
	//*  35   77:icmpeq          82
				return false;
	//   36   80:iconst_0        
	//   37   81:ireturn         
			if(mAdapter.hasStableIds())
	//*  38   82:aload_0         
	//*  39   83:getfield        #28  <Field RecyclerView this$0>
	//*  40   86:getfield        #144 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  41   89:invokevirtual   #282 <Method boolean RecyclerView$Adapter.hasStableIds()>
	//*  42   92:ifeq            121
			{
				if(r.getItemId() == mAdapter.getItemId(r.mPosition))
	//*  43   95:aload_1         
	//*  44   96:invokevirtual   #289 <Method long RecyclerView$ViewHolder.getItemId()>
	//*  45   99:aload_0         
	//*  46  100:getfield        #28  <Field RecyclerView this$0>
	//*  47  103:getfield        #144 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  48  106:aload_1         
	//*  49  107:getfield        #387 <Field int RecyclerView$ViewHolder.mPosition>
	//*  50  110:invokevirtual   #287 <Method long RecyclerView$Adapter.getItemId(int)>
	//*  51  113:lcmp            
	//*  52  114:ifne            119
					flag = true;
	//   53  117:iconst_1        
	//   54  118:istore_2        
				return flag;
	//   55  119:iload_2         
	//   56  120:ireturn         
			} else
			{
				return true;
	//   57  121:iconst_1        
	//   58  122:ireturn         
			}
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   59  123:new             #226 <Class StringBuilder>
	//   60  126:dup             
	//   61  127:invokespecial   #227 <Method void StringBuilder()>
	//   62  130:astore          4
			stringbuilder.append("Inconsistency detected. Invalid view holder adapter position");
	//   63  132:aload           4
	//   64  134:ldc2            #649 <String "Inconsistency detected. Invalid view holder adapter position">
	//   65  137:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//   66  140:pop             
			stringbuilder.append(((Object) (r)));
	//   67  141:aload           4
	//   68  143:aload_1         
	//   69  144:invokevirtual   #354 <Method StringBuilder StringBuilder.append(Object)>
	//   70  147:pop             
			stringbuilder.append(exceptionLabel());
	//   71  148:aload           4
	//   72  150:aload_0         
	//   73  151:getfield        #28  <Field RecyclerView this$0>
	//   74  154:invokevirtual   #244 <Method String RecyclerView.exceptionLabel()>
	//   75  157:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//   76  160:pop             
			throw new IndexOutOfBoundsException(stringbuilder.toString());
	//   77  161:new             #246 <Class IndexOutOfBoundsException>
	//   78  164:dup             
	//   79  165:aload           4
	//   80  167:invokevirtual   #249 <Method String StringBuilder.toString()>
	//   81  170:invokespecial   #252 <Method void IndexOutOfBoundsException(String)>
	//   82  173:athrow          
		}
	}

	void viewRangeUpdate(int i, int j)
	{
		for(int k = mCachedViews.size() - 1; k >= 0; k--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field ArrayList mCachedViews>
	//*   2    4:invokevirtual   #202 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_3        
	//*   6   10:iload_3         
	//*   7   11:iflt            74
		{
			r r = (r)mCachedViews.get(k);
	//    8   14:aload_0         
	//    9   15:getfield        #40  <Field ArrayList mCachedViews>
	//   10   18:iload_3         
	//   11   19:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #61  <Class RecyclerView$ViewHolder>
	//   13   25:astore          5
			if(r == null)
	//*  14   27:aload           5
	//*  15   29:ifnonnull       35
				continue;
	//   16   32:goto            67
			int l = r.mPosition;
	//   17   35:aload           5
	//   18   37:getfield        #387 <Field int RecyclerView$ViewHolder.mPosition>
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
	//   30   59:invokevirtual   #83  <Method void RecyclerView$ViewHolder.addFlags(int)>
				recycleCachedViewAt(k);
	//   31   62:aload_0         
	//   32   63:iload_3         
	//   33   64:invokevirtual   #315 <Method void recycleCachedViewAt(int)>
			}
		}

	//   34   67:iload_3         
	//   35   68:iconst_1        
	//   36   69:isub            
	//   37   70:istore_3        
	//*  38   71:goto            10
	//   39   74:return          
	}

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
	//    2    2:putfield        #28  <Field RecyclerView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #31  <Method void Object()>
	//    5    9:aload_0         
	//    6   10:new             #33  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #34  <Method void ArrayList()>
	//    9   17:putfield        #36  <Field ArrayList mAttachedScrap>
		mChangedScrap = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #38  <Field ArrayList mChangedScrap>
	//   13   25:aload_0         
	//   14   26:new             #33  <Class ArrayList>
	//   15   29:dup             
	//   16   30:invokespecial   #34  <Method void ArrayList()>
	//   17   33:putfield        #40  <Field ArrayList mCachedViews>
		mUnmodifiableAttachedScrap = Collections.unmodifiableList(((List) (mAttachedScrap)));
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:getfield        #36  <Field ArrayList mAttachedScrap>
	//   21   41:invokestatic    #46  <Method List Collections.unmodifiableList(List)>
	//   22   44:putfield        #48  <Field List mUnmodifiableAttachedScrap>
		mRequestedCacheMax = 2;
	//   23   47:aload_0         
	//   24   48:iconst_2        
	//   25   49:putfield        #50  <Field int mRequestedCacheMax>
		mViewCacheMax = 2;
	//   26   52:aload_0         
	//   27   53:iconst_2        
	//   28   54:putfield        #52  <Field int mViewCacheMax>
	//   29   57:return          
	}
}
