// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public static abstract class RecyclerView$ViewHolder
{

	private void createPayloadsIfNeeded()
	{
		if(mPayloads == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field List mPayloads>
	//*   2    4:ifnonnull       29
		{
			mPayloads = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #151 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #152 <Method void ArrayList()>
	//    7   15:putfield        #98  <Field List mPayloads>
			mUnmodifiedPayloads = Collections.unmodifiableList(mPayloads);
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #98  <Field List mPayloads>
	//   11   23:invokestatic    #156 <Method List Collections.unmodifiableList(List)>
	//   12   26:putfield        #100 <Field List mUnmodifiedPayloads>
		}
	//   13   29:return          
	}

	private boolean doesTransientStatePreventRecycling()
	{
		return (mFlags & 0x10) == 0 && ViewCompat.hasTransientState(itemView);
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field int mFlags>
	//    2    4:bipush          16
	//    3    6:iand            
	//    4    7:ifne            22
	//    5   10:aload_0         
	//    6   11:getfield        #119 <Field View itemView>
	//    7   14:invokestatic    #162 <Method boolean ViewCompat.hasTransientState(View)>
	//    8   17:ifeq            22
	//    9   20:iconst_1        
	//   10   21:ireturn         
	//   11   22:iconst_0        
	//   12   23:ireturn         
	}

	private void onEnteredHiddenState(RecyclerView recyclerview)
	{
		mWasImportantForAccessibilityBeforeHidden = ViewCompat.getImportantForAccessibility(itemView);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #119 <Field View itemView>
	//    3    5:invokestatic    #166 <Method int ViewCompat.getImportantForAccessibility(View)>
	//    4    8:putfield        #108 <Field int mWasImportantForAccessibilityBeforeHidden>
		recyclerview.setChildImportantForAccessibilityInternal(this, 4);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:iconst_4        
	//    8   14:invokevirtual   #170 <Method boolean RecyclerView.setChildImportantForAccessibilityInternal(RecyclerView$ViewHolder, int)>
	//    9   17:pop             
	//   10   18:return          
	}

	private void onLeftHiddenState(RecyclerView recyclerview)
	{
		recyclerview.setChildImportantForAccessibilityInternal(this, mWasImportantForAccessibilityBeforeHidden);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #108 <Field int mWasImportantForAccessibilityBeforeHidden>
	//    4    6:invokevirtual   #170 <Method boolean RecyclerView.setChildImportantForAccessibilityInternal(RecyclerView$ViewHolder, int)>
	//    5    9:pop             
		mWasImportantForAccessibilityBeforeHidden = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #108 <Field int mWasImportantForAccessibilityBeforeHidden>
	//    9   15:return          
	}

	private boolean shouldBeKeptAsChild()
	{
		return (mFlags & 0x10) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field int mFlags>
	//    2    4:bipush          16
	//    3    6:iand            
	//    4    7:ifeq            12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
	}

	void addChangePayload(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			addFlags(1024);
	//    2    4:aload_0         
	//    3    5:sipush          1024
	//    4    8:invokevirtual   #176 <Method void addFlags(int)>
			return;
	//    5   11:return          
		}
		if((mFlags & 0x400) == 0)
	//*   6   12:aload_0         
	//*   7   13:getfield        #129 <Field int mFlags>
	//*   8   16:sipush          1024
	//*   9   19:iand            
	//*  10   20:ifne            38
		{
			createPayloadsIfNeeded();
	//   11   23:aload_0         
	//   12   24:invokespecial   #178 <Method void createPayloadsIfNeeded()>
			mPayloads.add(obj);
	//   13   27:aload_0         
	//   14   28:getfield        #98  <Field List mPayloads>
	//   15   31:aload_1         
	//   16   32:invokeinterface #184 <Method boolean List.add(Object)>
	//   17   37:pop             
		}
	//   18   38:return          
	}

	void addFlags(int i)
	{
		mFlags = mFlags | i;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #129 <Field int mFlags>
	//    3    5:iload_1         
	//    4    6:ior             
	//    5    7:putfield        #129 <Field int mFlags>
	//    6   10:return          
	}

	void clearOldPosition()
	{
		mOldPosition = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #84  <Field int mOldPosition>
		mPreLayoutPosition = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #92  <Field int mPreLayoutPosition>
	//    6   10:return          
	}

	void clearPayload()
	{
		if(mPayloads != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field List mPayloads>
	//*   2    4:ifnull          16
			mPayloads.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #98  <Field List mPayloads>
	//    5   11:invokeinterface #189 <Method void List.clear()>
		mFlags = mFlags & 0xfffffbff;
	//    6   16:aload_0         
	//    7   17:aload_0         
	//    8   18:getfield        #129 <Field int mFlags>
	//    9   21:sipush          -1025
	//   10   24:iand            
	//   11   25:putfield        #129 <Field int mFlags>
	//   12   28:return          
	}

	void clearReturnedFromScrapFlag()
	{
		mFlags = mFlags & 0xffffffdf;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #129 <Field int mFlags>
	//    3    5:bipush          -33
	//    4    7:iand            
	//    5    8:putfield        #129 <Field int mFlags>
	//    6   11:return          
	}

	void clearTmpDetachFlag()
	{
		mFlags = mFlags & 0xfffffeff;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #129 <Field int mFlags>
	//    3    5:sipush          -257
	//    4    8:iand            
	//    5    9:putfield        #129 <Field int mFlags>
	//    6   12:return          
	}

	void flagRemovedAndOffsetPosition(int i, int j, boolean flag)
	{
		addFlags(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #176 <Method void addFlags(int)>
		offsetPosition(j, flag);
	//    3    6:aload_0         
	//    4    7:iload_2         
	//    5    8:iload_3         
	//    6    9:invokevirtual   #197 <Method void offsetPosition(int, boolean)>
		mPosition = i;
	//    7   12:aload_0         
	//    8   13:iload_1         
	//    9   14:putfield        #82  <Field int mPosition>
	//   10   17:return          
	}

	public final int getAdapterPosition()
	{
		if(mOwnerRecyclerView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #201 <Field RecyclerView mOwnerRecyclerView>
	//*   2    4:ifnonnull       9
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
		else
			return mOwnerRecyclerView.getAdapterPositionFor(this);
	//    5    9:aload_0         
	//    6   10:getfield        #201 <Field RecyclerView mOwnerRecyclerView>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #204 <Method int RecyclerView.getAdapterPositionFor(RecyclerView$ViewHolder)>
	//    9   17:ireturn         
	}

	public final long getItemId()
	{
		return mItemId;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field long mItemId>
	//    2    4:lreturn         
	}

	public final int getItemViewType()
	{
		return mItemViewType;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field int mItemViewType>
	//    2    4:ireturn         
	}

	public final int getLayoutPosition()
	{
		if(mPreLayoutPosition == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #92  <Field int mPreLayoutPosition>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          13
			return mPosition;
	//    4    8:aload_0         
	//    5    9:getfield        #82  <Field int mPosition>
	//    6   12:ireturn         
		else
			return mPreLayoutPosition;
	//    7   13:aload_0         
	//    8   14:getfield        #92  <Field int mPreLayoutPosition>
	//    9   17:ireturn         
	}

	public final int getOldPosition()
	{
		return mOldPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field int mOldPosition>
	//    2    4:ireturn         
	}

	public final int getPosition()
	{
		if(mPreLayoutPosition == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #92  <Field int mPreLayoutPosition>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          13
			return mPosition;
	//    4    8:aload_0         
	//    5    9:getfield        #82  <Field int mPosition>
	//    6   12:ireturn         
		else
			return mPreLayoutPosition;
	//    7   13:aload_0         
	//    8   14:getfield        #92  <Field int mPreLayoutPosition>
	//    9   17:ireturn         
	}

	List getUnmodifiedPayloads()
	{
		if((mFlags & 0x400) == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field int mFlags>
	//*   2    4:sipush          1024
	//*   3    7:iand            
	//*   4    8:ifne            39
		{
			if(mPayloads == null || mPayloads.size() == 0)
	//*   5   11:aload_0         
	//*   6   12:getfield        #98  <Field List mPayloads>
	//*   7   15:ifnull          30
	//*   8   18:aload_0         
	//*   9   19:getfield        #98  <Field List mPayloads>
	//*  10   22:invokeinterface #217 <Method int List.size()>
	//*  11   27:ifne            34
				return FULLUPDATE_PAYLOADS;
	//   12   30:getstatic       #75  <Field List FULLUPDATE_PAYLOADS>
	//   13   33:areturn         
			else
				return mUnmodifiedPayloads;
	//   14   34:aload_0         
	//   15   35:getfield        #100 <Field List mUnmodifiedPayloads>
	//   16   38:areturn         
		} else
		{
			return FULLUPDATE_PAYLOADS;
	//   17   39:getstatic       #75  <Field List FULLUPDATE_PAYLOADS>
	//   18   42:areturn         
		}
	}

	boolean hasAnyOfTheFlags(int i)
	{
		return (mFlags & i) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field int mFlags>
	//    2    4:iload_1         
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	boolean isAdapterPositionUnknown()
	{
		return (mFlags & 0x200) != 0 || isInvalid();
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field int mFlags>
	//    2    4:sipush          512
	//    3    7:iand            
	//    4    8:ifne            18
	//    5   11:aload_0         
	//    6   12:invokevirtual   #225 <Method boolean isInvalid()>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	boolean isBound()
	{
		return (mFlags & 1) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field int mFlags>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	boolean isInvalid()
	{
		return (mFlags & 4) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field int mFlags>
	//    2    4:iconst_4        
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public final boolean isRecyclable()
	{
		return (mFlags & 0x10) == 0 && !ViewCompat.hasTransientState(itemView);
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field int mFlags>
	//    2    4:bipush          16
	//    3    6:iand            
	//    4    7:ifne            22
	//    5   10:aload_0         
	//    6   11:getfield        #119 <Field View itemView>
	//    7   14:invokestatic    #162 <Method boolean ViewCompat.hasTransientState(View)>
	//    8   17:ifne            22
	//    9   20:iconst_1        
	//   10   21:ireturn         
	//   11   22:iconst_0        
	//   12   23:ireturn         
	}

	boolean isRemoved()
	{
		return (mFlags & 8) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field int mFlags>
	//    2    4:bipush          8
	//    3    6:iand            
	//    4    7:ifeq            12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
	}

	boolean isScrap()
	{
		return mScrapContainer != null;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field RecyclerView$Recycler mScrapContainer>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	boolean isTmpDetached()
	{
		return (mFlags & 0x100) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field int mFlags>
	//    2    4:sipush          256
	//    3    7:iand            
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	boolean isUpdated()
	{
		return (mFlags & 2) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field int mFlags>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	boolean needsUpdate()
	{
		return (mFlags & 2) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field int mFlags>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	void offsetPosition(int i, boolean flag)
	{
		if(mOldPosition == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field int mOldPosition>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          16
			mOldPosition = mPosition;
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #82  <Field int mPosition>
	//    7   13:putfield        #84  <Field int mOldPosition>
		if(mPreLayoutPosition == -1)
	//*   8   16:aload_0         
	//*   9   17:getfield        #92  <Field int mPreLayoutPosition>
	//*  10   20:iconst_m1       
	//*  11   21:icmpne          32
			mPreLayoutPosition = mPosition;
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #82  <Field int mPosition>
	//   15   29:putfield        #92  <Field int mPreLayoutPosition>
		if(flag)
	//*  16   32:iload_2         
	//*  17   33:ifeq            46
			mPreLayoutPosition = mPreLayoutPosition + i;
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:getfield        #92  <Field int mPreLayoutPosition>
	//   21   41:iload_1         
	//   22   42:iadd            
	//   23   43:putfield        #92  <Field int mPreLayoutPosition>
		mPosition = mPosition + i;
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #82  <Field int mPosition>
	//   27   51:iload_1         
	//   28   52:iadd            
	//   29   53:putfield        #82  <Field int mPosition>
		if(itemView.getLayoutParams() != null)
	//*  30   56:aload_0         
	//*  31   57:getfield        #119 <Field View itemView>
	//*  32   60:invokevirtual   #238 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  33   63:ifnull          80
			((s)itemView.getLayoutParams()).mInsetsDirty = true;
	//   34   66:aload_0         
	//   35   67:getfield        #119 <Field View itemView>
	//   36   70:invokevirtual   #238 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   37   73:checkcast       #240 <Class RecyclerView$LayoutParams>
	//   38   76:iconst_1        
	//   39   77:putfield        #243 <Field boolean RecyclerView$LayoutParams.mInsetsDirty>
	//   40   80:return          
	}

	void resetInternal()
	{
		mFlags = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #129 <Field int mFlags>
		mPosition = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #82  <Field int mPosition>
		mOldPosition = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #84  <Field int mOldPosition>
		mItemId = -1L;
	//    9   15:aload_0         
	//   10   16:ldc2w           #85  <Long -1L>
	//   11   19:putfield        #88  <Field long mItemId>
		mPreLayoutPosition = -1;
	//   12   22:aload_0         
	//   13   23:iconst_m1       
	//   14   24:putfield        #92  <Field int mPreLayoutPosition>
		mIsRecyclableCount = 0;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #102 <Field int mIsRecyclableCount>
		mShadowedHolder = null;
	//   18   32:aload_0         
	//   19   33:aconst_null     
	//   20   34:putfield        #94  <Field RecyclerView$ViewHolder mShadowedHolder>
		mShadowingHolder = null;
	//   21   37:aload_0         
	//   22   38:aconst_null     
	//   23   39:putfield        #96  <Field RecyclerView$ViewHolder mShadowingHolder>
		clearPayload();
	//   24   42:aload_0         
	//   25   43:invokevirtual   #246 <Method void clearPayload()>
		mWasImportantForAccessibilityBeforeHidden = 0;
	//   26   46:aload_0         
	//   27   47:iconst_0        
	//   28   48:putfield        #108 <Field int mWasImportantForAccessibilityBeforeHidden>
		mPendingAccessibilityState = -1;
	//   29   51:aload_0         
	//   30   52:iconst_m1       
	//   31   53:putfield        #110 <Field int mPendingAccessibilityState>
		RecyclerView.clearNestedRecyclerViewIfNotNested(this);
	//   32   56:aload_0         
	//   33   57:invokestatic    #250 <Method void RecyclerView.clearNestedRecyclerViewIfNotNested(RecyclerView$ViewHolder)>
	//   34   60:return          
	}

	void saveOldPosition()
	{
		if(mOldPosition == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field int mOldPosition>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          16
			mOldPosition = mPosition;
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #82  <Field int mPosition>
	//    7   13:putfield        #84  <Field int mOldPosition>
	//    8   16:return          
	}

	void setFlags(int i, int j)
	{
		mFlags = mFlags & ~j | i & j;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #129 <Field int mFlags>
	//    3    5:iload_2         
	//    4    6:iconst_m1       
	//    5    7:ixor            
	//    6    8:iand            
	//    7    9:iload_1         
	//    8   10:iload_2         
	//    9   11:iand            
	//   10   12:ior             
	//   11   13:putfield        #129 <Field int mFlags>
	//   12   16:return          
	}

	public final void setIsRecyclable(boolean flag)
	{
		int i;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            14
			i = mIsRecyclableCount - 1;
	//    2    4:aload_0         
	//    3    5:getfield        #102 <Field int mIsRecyclableCount>
	//    4    8:iconst_1        
	//    5    9:isub            
	//    6   10:istore_2        
		else
	//*   7   11:goto            21
			i = mIsRecyclableCount + 1;
	//    8   14:aload_0         
	//    9   15:getfield        #102 <Field int mIsRecyclableCount>
	//   10   18:iconst_1        
	//   11   19:iadd            
	//   12   20:istore_2        
		mIsRecyclableCount = i;
	//   13   21:aload_0         
	//   14   22:iload_2         
	//   15   23:putfield        #102 <Field int mIsRecyclableCount>
		if(mIsRecyclableCount < 0)
	//*  16   26:aload_0         
	//*  17   27:getfield        #102 <Field int mIsRecyclableCount>
	//*  18   30:ifge            66
		{
			mIsRecyclableCount = 0;
	//   19   33:aload_0         
	//   20   34:iconst_0        
	//   21   35:putfield        #102 <Field int mIsRecyclableCount>
			Log.e("View", (new StringBuilder()).append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ").append(((Object) (this))).toString());
	//   22   38:ldc2            #257 <String "View">
	//   23   41:new             #259 <Class StringBuilder>
	//   24   44:dup             
	//   25   45:invokespecial   #260 <Method void StringBuilder()>
	//   26   48:ldc2            #262 <String "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ">
	//   27   51:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   28   54:aload_0         
	//   29   55:invokevirtual   #269 <Method StringBuilder StringBuilder.append(Object)>
	//   30   58:invokevirtual   #273 <Method String StringBuilder.toString()>
	//   31   61:invokestatic    #279 <Method int Log.e(String, String)>
	//   32   64:pop             
			return;
	//   33   65:return          
		}
		if(!flag && mIsRecyclableCount == 1)
	//*  34   66:iload_1         
	//*  35   67:ifne            90
	//*  36   70:aload_0         
	//*  37   71:getfield        #102 <Field int mIsRecyclableCount>
	//*  38   74:iconst_1        
	//*  39   75:icmpne          90
		{
			mFlags = mFlags | 0x10;
	//   40   78:aload_0         
	//   41   79:aload_0         
	//   42   80:getfield        #129 <Field int mFlags>
	//   43   83:bipush          16
	//   44   85:ior             
	//   45   86:putfield        #129 <Field int mFlags>
			return;
	//   46   89:return          
		}
		if(flag && mIsRecyclableCount == 0)
	//*  47   90:iload_1         
	//*  48   91:ifeq            112
	//*  49   94:aload_0         
	//*  50   95:getfield        #102 <Field int mIsRecyclableCount>
	//*  51   98:ifne            112
			mFlags = mFlags & 0xffffffef;
	//   52  101:aload_0         
	//   53  102:aload_0         
	//   54  103:getfield        #129 <Field int mFlags>
	//   55  106:bipush          -17
	//   56  108:iand            
	//   57  109:putfield        #129 <Field int mFlags>
	//   58  112:return          
	}

	void setScrapContainer(RecyclerView.Recycler recycler, boolean flag)
	{
		mScrapContainer = recycler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #104 <Field RecyclerView$Recycler mScrapContainer>
		mInChangeScrap = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #106 <Field boolean mInChangeScrap>
	//    6   10:return          
	}

	boolean shouldIgnore()
	{
		return (mFlags & 0x80) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field int mFlags>
	//    2    4:sipush          128
	//    3    7:iand            
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	void stopIgnoring()
	{
		mFlags = mFlags & 0xffffff7f;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #129 <Field int mFlags>
	//    3    5:sipush          -129
	//    4    8:iand            
	//    5    9:putfield        #129 <Field int mFlags>
	//    6   12:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder((new StringBuilder()).append("ViewHolder{").append(Integer.toHexString(((Object)this).hashCode())).append(" position=").append(mPosition).append(" id=").append(mItemId).append(", oldPos=").append(mOldPosition).append(", pLpos:").append(mPreLayoutPosition).toString());
	//    0    0:new             #259 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:new             #259 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #260 <Method void StringBuilder()>
	//    5   11:ldc2            #285 <String "ViewHolder{">
	//    6   14:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:aload_0         
	//    8   18:invokevirtual   #288 <Method int Object.hashCode()>
	//    9   21:invokestatic    #294 <Method String Integer.toHexString(int)>
	//   10   24:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   11   27:ldc2            #296 <String " position=">
	//   12   30:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   13   33:aload_0         
	//   14   34:getfield        #82  <Field int mPosition>
	//   15   37:invokevirtual   #299 <Method StringBuilder StringBuilder.append(int)>
	//   16   40:ldc2            #301 <String " id=">
	//   17   43:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   18   46:aload_0         
	//   19   47:getfield        #88  <Field long mItemId>
	//   20   50:invokevirtual   #304 <Method StringBuilder StringBuilder.append(long)>
	//   21   53:ldc2            #306 <String ", oldPos=">
	//   22   56:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   23   59:aload_0         
	//   24   60:getfield        #84  <Field int mOldPosition>
	//   25   63:invokevirtual   #299 <Method StringBuilder StringBuilder.append(int)>
	//   26   66:ldc2            #308 <String ", pLpos:">
	//   27   69:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   28   72:aload_0         
	//   29   73:getfield        #92  <Field int mPreLayoutPosition>
	//   30   76:invokevirtual   #299 <Method StringBuilder StringBuilder.append(int)>
	//   31   79:invokevirtual   #273 <Method String StringBuilder.toString()>
	//   32   82:invokespecial   #309 <Method void StringBuilder(String)>
	//   33   85:astore_2        
		if(isScrap())
	//*  34   86:aload_0         
	//*  35   87:invokevirtual   #311 <Method boolean isScrap()>
	//*  36   90:ifeq            125
		{
			StringBuilder stringbuilder1 = stringbuilder.append(" scrap ");
	//   37   93:aload_2         
	//   38   94:ldc2            #313 <String " scrap ">
	//   39   97:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   40  100:astore_3        
			String s;
			if(mInChangeScrap)
	//*  41  101:aload_0         
	//*  42  102:getfield        #106 <Field boolean mInChangeScrap>
	//*  43  105:ifeq            115
				s = "[changeScrap]";
	//   44  108:ldc2            #315 <String "[changeScrap]">
	//   45  111:astore_1        
			else
	//*  46  112:goto            119
				s = "[attachedScrap]";
	//   47  115:ldc2            #317 <String "[attachedScrap]">
	//   48  118:astore_1        
			stringbuilder1.append(s);
	//   49  119:aload_3         
	//   50  120:aload_1         
	//   51  121:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   52  124:pop             
		}
		if(isInvalid())
	//*  53  125:aload_0         
	//*  54  126:invokevirtual   #225 <Method boolean isInvalid()>
	//*  55  129:ifeq            140
			stringbuilder.append(" invalid");
	//   56  132:aload_2         
	//   57  133:ldc2            #319 <String " invalid">
	//   58  136:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   59  139:pop             
		if(!isBound())
	//*  60  140:aload_0         
	//*  61  141:invokevirtual   #321 <Method boolean isBound()>
	//*  62  144:ifne            155
			stringbuilder.append(" unbound");
	//   63  147:aload_2         
	//   64  148:ldc2            #323 <String " unbound">
	//   65  151:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   66  154:pop             
		if(needsUpdate())
	//*  67  155:aload_0         
	//*  68  156:invokevirtual   #325 <Method boolean needsUpdate()>
	//*  69  159:ifeq            170
			stringbuilder.append(" update");
	//   70  162:aload_2         
	//   71  163:ldc2            #327 <String " update">
	//   72  166:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   73  169:pop             
		if(isRemoved())
	//*  74  170:aload_0         
	//*  75  171:invokevirtual   #329 <Method boolean isRemoved()>
	//*  76  174:ifeq            185
			stringbuilder.append(" removed");
	//   77  177:aload_2         
	//   78  178:ldc2            #331 <String " removed">
	//   79  181:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   80  184:pop             
		if(shouldIgnore())
	//*  81  185:aload_0         
	//*  82  186:invokevirtual   #333 <Method boolean shouldIgnore()>
	//*  83  189:ifeq            200
			stringbuilder.append(" ignored");
	//   84  192:aload_2         
	//   85  193:ldc2            #335 <String " ignored">
	//   86  196:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   87  199:pop             
		if(isTmpDetached())
	//*  88  200:aload_0         
	//*  89  201:invokevirtual   #337 <Method boolean isTmpDetached()>
	//*  90  204:ifeq            215
			stringbuilder.append(" tmpDetached");
	//   91  207:aload_2         
	//   92  208:ldc2            #339 <String " tmpDetached">
	//   93  211:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   94  214:pop             
		if(!isRecyclable())
	//*  95  215:aload_0         
	//*  96  216:invokevirtual   #341 <Method boolean isRecyclable()>
	//*  97  219:ifne            256
			stringbuilder.append((new StringBuilder()).append(" not recyclable(").append(mIsRecyclableCount).append(")").toString());
	//   98  222:aload_2         
	//   99  223:new             #259 <Class StringBuilder>
	//  100  226:dup             
	//  101  227:invokespecial   #260 <Method void StringBuilder()>
	//  102  230:ldc2            #343 <String " not recyclable(">
	//  103  233:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//  104  236:aload_0         
	//  105  237:getfield        #102 <Field int mIsRecyclableCount>
	//  106  240:invokevirtual   #299 <Method StringBuilder StringBuilder.append(int)>
	//  107  243:ldc2            #345 <String ")">
	//  108  246:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//  109  249:invokevirtual   #273 <Method String StringBuilder.toString()>
	//  110  252:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//  111  255:pop             
		if(isAdapterPositionUnknown())
	//* 112  256:aload_0         
	//* 113  257:invokevirtual   #347 <Method boolean isAdapterPositionUnknown()>
	//* 114  260:ifeq            271
			stringbuilder.append(" undefined adapter position");
	//  115  263:aload_2         
	//  116  264:ldc2            #349 <String " undefined adapter position">
	//  117  267:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//  118  270:pop             
		if(itemView.getParent() == null)
	//* 119  271:aload_0         
	//* 120  272:getfield        #119 <Field View itemView>
	//* 121  275:invokevirtual   #353 <Method android.view.ViewParent View.getParent()>
	//* 122  278:ifnonnull       289
			stringbuilder.append(" no parent");
	//  123  281:aload_2         
	//  124  282:ldc2            #355 <String " no parent">
	//  125  285:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//  126  288:pop             
		stringbuilder.append("}");
	//  127  289:aload_2         
	//  128  290:ldc2            #357 <String "}">
	//  129  293:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//  130  296:pop             
		return stringbuilder.toString();
	//  131  297:aload_2         
	//  132  298:invokevirtual   #273 <Method String StringBuilder.toString()>
	//  133  301:areturn         
	}

	void unScrap()
	{
		mScrapContainer.unscrapView(this);
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field RecyclerView$Recycler mScrapContainer>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #363 <Method void RecyclerView$Recycler.unscrapView(RecyclerView$ViewHolder)>
	//    4    8:return          
	}

	boolean wasReturnedFromScrap()
	{
		return (mFlags & 0x20) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field int mFlags>
	//    2    4:bipush          32
	//    3    6:iand            
	//    4    7:ifeq            12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
	}

	static final int FLAG_ADAPTER_FULLUPDATE = 1024;
	static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
	static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
	static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
	static final int FLAG_BOUND = 1;
	static final int FLAG_IGNORE = 128;
	static final int FLAG_INVALID = 4;
	static final int FLAG_MOVED = 2048;
	static final int FLAG_NOT_RECYCLABLE = 16;
	static final int FLAG_REMOVED = 8;
	static final int FLAG_RETURNED_FROM_SCRAP = 32;
	static final int FLAG_TMP_DETACHED = 256;
	static final int FLAG_UPDATE = 2;
	private static final List FULLUPDATE_PAYLOADS;
	static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
	public final View itemView;
	private int mFlags;
	private boolean mInChangeScrap;
	private int mIsRecyclableCount;
	long mItemId;
	int mItemViewType;
	WeakReference mNestedRecyclerView;
	int mOldPosition;
	RecyclerView mOwnerRecyclerView;
	List mPayloads;
	int mPendingAccessibilityState;
	int mPosition;
	int mPreLayoutPosition;
	private RecyclerView.Recycler mScrapContainer;
	RecyclerView$ViewHolder mShadowedHolder;
	RecyclerView$ViewHolder mShadowingHolder;
	List mUnmodifiedPayloads;
	private int mWasImportantForAccessibilityBeforeHidden;

	static 
	{
		FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
	//    0    0:getstatic       #73  <Field List Collections.EMPTY_LIST>
	//    1    3:putstatic       #75  <Field List FULLUPDATE_PAYLOADS>
	//*   2    6:return          
	}


/*
	static boolean access$1300(RecyclerView$ViewHolder recyclerview$viewholder)
	{
		return recyclerview$viewholder.shouldBeKeptAsChild();
	//    0    0:aload_0         
	//    1    1:invokespecial   #125 <Method boolean shouldBeKeptAsChild()>
	//    2    4:ireturn         
	}

*/


/*
	static int access$1400(RecyclerView$ViewHolder recyclerview$viewholder)
	{
		return recyclerview$viewholder.mFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field int mFlags>
	//    2    4:ireturn         
	}

*/


/*
	static void access$200(RecyclerView$ViewHolder recyclerview$viewholder, RecyclerView recyclerview)
	{
		recyclerview$viewholder.onEnteredHiddenState(recyclerview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #135 <Method void onEnteredHiddenState(RecyclerView)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$300(RecyclerView$ViewHolder recyclerview$viewholder, RecyclerView recyclerview)
	{
		recyclerview$viewholder.onLeftHiddenState(recyclerview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #139 <Method void onLeftHiddenState(RecyclerView)>
		return;
	//    3    5:return          
	}

*/


/*
	static boolean access$700(RecyclerView$ViewHolder recyclerview$viewholder)
	{
		return recyclerview$viewholder.doesTransientStatePreventRecycling();
	//    0    0:aload_0         
	//    1    1:invokespecial   #143 <Method boolean doesTransientStatePreventRecycling()>
	//    2    4:ireturn         
	}

*/


/*
	static RecyclerView.Recycler access$802(RecyclerView$ViewHolder recyclerview$viewholder, RecyclerView.Recycler recycler)
	{
		recyclerview$viewholder.mScrapContainer = recycler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #104 <Field RecyclerView$Recycler mScrapContainer>
		return recycler;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static boolean access$900(RecyclerView$ViewHolder recyclerview$viewholder)
	{
		return recyclerview$viewholder.mInChangeScrap;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field boolean mInChangeScrap>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$902(RecyclerView$ViewHolder recyclerview$viewholder, boolean flag)
	{
		recyclerview$viewholder.mInChangeScrap = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #106 <Field boolean mInChangeScrap>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/

	public RecyclerView$ViewHolder(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method void Object()>
		mPosition = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #82  <Field int mPosition>
		mOldPosition = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #84  <Field int mOldPosition>
		mItemId = -1L;
	//    8   14:aload_0         
	//    9   15:ldc2w           #85  <Long -1L>
	//   10   18:putfield        #88  <Field long mItemId>
		mItemViewType = -1;
	//   11   21:aload_0         
	//   12   22:iconst_m1       
	//   13   23:putfield        #90  <Field int mItemViewType>
		mPreLayoutPosition = -1;
	//   14   26:aload_0         
	//   15   27:iconst_m1       
	//   16   28:putfield        #92  <Field int mPreLayoutPosition>
		mShadowedHolder = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #94  <Field RecyclerView$ViewHolder mShadowedHolder>
		mShadowingHolder = null;
	//   20   36:aload_0         
	//   21   37:aconst_null     
	//   22   38:putfield        #96  <Field RecyclerView$ViewHolder mShadowingHolder>
		mPayloads = null;
	//   23   41:aload_0         
	//   24   42:aconst_null     
	//   25   43:putfield        #98  <Field List mPayloads>
		mUnmodifiedPayloads = null;
	//   26   46:aload_0         
	//   27   47:aconst_null     
	//   28   48:putfield        #100 <Field List mUnmodifiedPayloads>
		mIsRecyclableCount = 0;
	//   29   51:aload_0         
	//   30   52:iconst_0        
	//   31   53:putfield        #102 <Field int mIsRecyclableCount>
		mScrapContainer = null;
	//   32   56:aload_0         
	//   33   57:aconst_null     
	//   34   58:putfield        #104 <Field RecyclerView$Recycler mScrapContainer>
		mInChangeScrap = false;
	//   35   61:aload_0         
	//   36   62:iconst_0        
	//   37   63:putfield        #106 <Field boolean mInChangeScrap>
		mWasImportantForAccessibilityBeforeHidden = 0;
	//   38   66:aload_0         
	//   39   67:iconst_0        
	//   40   68:putfield        #108 <Field int mWasImportantForAccessibilityBeforeHidden>
		mPendingAccessibilityState = -1;
	//   41   71:aload_0         
	//   42   72:iconst_m1       
	//   43   73:putfield        #110 <Field int mPendingAccessibilityState>
		if(view == null)
	//*  44   76:aload_1         
	//*  45   77:ifnonnull       90
		{
			throw new IllegalArgumentException("itemView may not be null");
	//   46   80:new             #112 <Class IllegalArgumentException>
	//   47   83:dup             
	//   48   84:ldc1            #114 <String "itemView may not be null">
	//   49   86:invokespecial   #117 <Method void IllegalArgumentException(String)>
	//   50   89:athrow          
		} else
		{
			itemView = view;
	//   51   90:aload_0         
	//   52   91:aload_1         
	//   53   92:putfield        #119 <Field View itemView>
			return;
	//   54   95:return          
		}
	}
}
