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
	//*   1    1:getfield        #100 <Field List mPayloads>
	//*   2    4:ifnonnull       29
		{
			mPayloads = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #153 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #154 <Method void ArrayList()>
	//    7   15:putfield        #100 <Field List mPayloads>
			mUnmodifiedPayloads = Collections.unmodifiableList(mPayloads);
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #100 <Field List mPayloads>
	//   11   23:invokestatic    #158 <Method List Collections.unmodifiableList(List)>
	//   12   26:putfield        #102 <Field List mUnmodifiedPayloads>
		}
	//   13   29:return          
	}

	private boolean doesTransientStatePreventRecycling()
	{
		return (mFlags & 0x10) == 0 && ViewCompat.hasTransientState(itemView);
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field int mFlags>
	//    2    4:bipush          16
	//    3    6:iand            
	//    4    7:ifne            22
	//    5   10:aload_0         
	//    6   11:getfield        #121 <Field View itemView>
	//    7   14:invokestatic    #164 <Method boolean ViewCompat.hasTransientState(View)>
	//    8   17:ifeq            22
	//    9   20:iconst_1        
	//   10   21:ireturn         
	//   11   22:iconst_0        
	//   12   23:ireturn         
	}

	private void onEnteredHiddenState(RecyclerView recyclerview)
	{
		if(mPendingAccessibilityState != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field int mPendingAccessibilityState>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          19
			mWasImportantForAccessibilityBeforeHidden = mPendingAccessibilityState;
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #112 <Field int mPendingAccessibilityState>
	//    7   13:putfield        #110 <Field int mWasImportantForAccessibilityBeforeHidden>
		else
	//*   8   16:goto            30
			mWasImportantForAccessibilityBeforeHidden = ViewCompat.getImportantForAccessibility(itemView);
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #121 <Field View itemView>
	//   12   24:invokestatic    #168 <Method int ViewCompat.getImportantForAccessibility(View)>
	//   13   27:putfield        #110 <Field int mWasImportantForAccessibilityBeforeHidden>
		recyclerview.setChildImportantForAccessibilityInternal(this, 4);
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:iconst_4        
	//   17   33:invokevirtual   #172 <Method boolean RecyclerView.setChildImportantForAccessibilityInternal(RecyclerView$ViewHolder, int)>
	//   18   36:pop             
	//   19   37:return          
	}

	private void onLeftHiddenState(RecyclerView recyclerview)
	{
		recyclerview.setChildImportantForAccessibilityInternal(this, mWasImportantForAccessibilityBeforeHidden);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #110 <Field int mWasImportantForAccessibilityBeforeHidden>
	//    4    6:invokevirtual   #172 <Method boolean RecyclerView.setChildImportantForAccessibilityInternal(RecyclerView$ViewHolder, int)>
	//    5    9:pop             
		mWasImportantForAccessibilityBeforeHidden = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #110 <Field int mWasImportantForAccessibilityBeforeHidden>
	//    9   15:return          
	}

	private boolean shouldBeKeptAsChild()
	{
		return (mFlags & 0x10) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field int mFlags>
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
	//    4    8:invokevirtual   #178 <Method void addFlags(int)>
			return;
	//    5   11:return          
		}
		if((0x400 & mFlags) == 0)
	//*   6   12:sipush          1024
	//*   7   15:aload_0         
	//*   8   16:getfield        #136 <Field int mFlags>
	//*   9   19:iand            
	//*  10   20:ifne            38
		{
			createPayloadsIfNeeded();
	//   11   23:aload_0         
	//   12   24:invokespecial   #180 <Method void createPayloadsIfNeeded()>
			mPayloads.add(obj);
	//   13   27:aload_0         
	//   14   28:getfield        #100 <Field List mPayloads>
	//   15   31:aload_1         
	//   16   32:invokeinterface #186 <Method boolean List.add(Object)>
	//   17   37:pop             
		}
	//   18   38:return          
	}

	void addFlags(int i)
	{
		mFlags = i | mFlags;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #136 <Field int mFlags>
	//    4    6:ior             
	//    5    7:putfield        #136 <Field int mFlags>
	//    6   10:return          
	}

	void clearOldPosition()
	{
		mOldPosition = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #86  <Field int mOldPosition>
		mPreLayoutPosition = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #94  <Field int mPreLayoutPosition>
	//    6   10:return          
	}

	void clearPayload()
	{
		if(mPayloads != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #100 <Field List mPayloads>
	//*   2    4:ifnull          16
			mPayloads.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #100 <Field List mPayloads>
	//    5   11:invokeinterface #191 <Method void List.clear()>
		mFlags = mFlags & 0xfffffbff;
	//    6   16:aload_0         
	//    7   17:aload_0         
	//    8   18:getfield        #136 <Field int mFlags>
	//    9   21:sipush          -1025
	//   10   24:iand            
	//   11   25:putfield        #136 <Field int mFlags>
	//   12   28:return          
	}

	void clearReturnedFromScrapFlag()
	{
		mFlags = mFlags & 0xffffffdf;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #136 <Field int mFlags>
	//    3    5:bipush          -33
	//    4    7:iand            
	//    5    8:putfield        #136 <Field int mFlags>
	//    6   11:return          
	}

	void clearTmpDetachFlag()
	{
		mFlags = mFlags & 0xfffffeff;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #136 <Field int mFlags>
	//    3    5:sipush          -257
	//    4    8:iand            
	//    5    9:putfield        #136 <Field int mFlags>
	//    6   12:return          
	}

	void flagRemovedAndOffsetPosition(int i, int j, boolean flag)
	{
		addFlags(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #178 <Method void addFlags(int)>
		offsetPosition(j, flag);
	//    3    6:aload_0         
	//    4    7:iload_2         
	//    5    8:iload_3         
	//    6    9:invokevirtual   #199 <Method void offsetPosition(int, boolean)>
		mPosition = i;
	//    7   12:aload_0         
	//    8   13:iload_1         
	//    9   14:putfield        #84  <Field int mPosition>
	//   10   17:return          
	}

	public final int getAdapterPosition()
	{
		if(mOwnerRecyclerView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #203 <Field RecyclerView mOwnerRecyclerView>
	//*   2    4:ifnonnull       9
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
		else
			return mOwnerRecyclerView.getAdapterPositionFor(this);
	//    5    9:aload_0         
	//    6   10:getfield        #203 <Field RecyclerView mOwnerRecyclerView>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #206 <Method int RecyclerView.getAdapterPositionFor(RecyclerView$ViewHolder)>
	//    9   17:ireturn         
	}

	public final long getItemId()
	{
		return mItemId;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field long mItemId>
	//    2    4:lreturn         
	}

	public final int getItemViewType()
	{
		return mItemViewType;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field int mItemViewType>
	//    2    4:ireturn         
	}

	public final int getLayoutPosition()
	{
		if(mPreLayoutPosition == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field int mPreLayoutPosition>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          13
			return mPosition;
	//    4    8:aload_0         
	//    5    9:getfield        #84  <Field int mPosition>
	//    6   12:ireturn         
		else
			return mPreLayoutPosition;
	//    7   13:aload_0         
	//    8   14:getfield        #94  <Field int mPreLayoutPosition>
	//    9   17:ireturn         
	}

	public final int getOldPosition()
	{
		return mOldPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field int mOldPosition>
	//    2    4:ireturn         
	}

	public final int getPosition()
	{
		if(mPreLayoutPosition == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field int mPreLayoutPosition>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          13
			return mPosition;
	//    4    8:aload_0         
	//    5    9:getfield        #84  <Field int mPosition>
	//    6   12:ireturn         
		else
			return mPreLayoutPosition;
	//    7   13:aload_0         
	//    8   14:getfield        #94  <Field int mPreLayoutPosition>
	//    9   17:ireturn         
	}

	List getUnmodifiedPayloads()
	{
		if((mFlags & 0x400) == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #136 <Field int mFlags>
	//*   2    4:sipush          1024
	//*   3    7:iand            
	//*   4    8:ifne            42
		{
			if(mPayloads != null && mPayloads.size() != 0)
	//*   5   11:aload_0         
	//*   6   12:getfield        #100 <Field List mPayloads>
	//*   7   15:ifnull          38
	//*   8   18:aload_0         
	//*   9   19:getfield        #100 <Field List mPayloads>
	//*  10   22:invokeinterface #219 <Method int List.size()>
	//*  11   27:ifne            33
	//*  12   30:goto            38
				return mUnmodifiedPayloads;
	//   13   33:aload_0         
	//   14   34:getfield        #102 <Field List mUnmodifiedPayloads>
	//   15   37:areturn         
			else
				return FULLUPDATE_PAYLOADS;
	//   16   38:getstatic       #77  <Field List FULLUPDATE_PAYLOADS>
	//   17   41:areturn         
		} else
		{
			return FULLUPDATE_PAYLOADS;
	//   18   42:getstatic       #77  <Field List FULLUPDATE_PAYLOADS>
	//   19   45:areturn         
		}
	}

	boolean hasAnyOfTheFlags(int i)
	{
		return (i & mFlags) != 0;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #136 <Field int mFlags>
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
	//    1    1:getfield        #136 <Field int mFlags>
	//    2    4:sipush          512
	//    3    7:iand            
	//    4    8:ifne            23
	//    5   11:aload_0         
	//    6   12:invokevirtual   #227 <Method boolean isInvalid()>
	//    7   15:ifeq            21
	//    8   18:goto            23
	//    9   21:iconst_0        
	//   10   22:ireturn         
	//   11   23:iconst_1        
	//   12   24:ireturn         
	}

	boolean isBound()
	{
		return (mFlags & 1) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field int mFlags>
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
	//    1    1:getfield        #136 <Field int mFlags>
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
	//    1    1:getfield        #136 <Field int mFlags>
	//    2    4:bipush          16
	//    3    6:iand            
	//    4    7:ifne            22
	//    5   10:aload_0         
	//    6   11:getfield        #121 <Field View itemView>
	//    7   14:invokestatic    #164 <Method boolean ViewCompat.hasTransientState(View)>
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
	//    1    1:getfield        #136 <Field int mFlags>
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
	//    1    1:getfield        #106 <Field RecyclerView$Recycler mScrapContainer>
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
	//    1    1:getfield        #136 <Field int mFlags>
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
	//    1    1:getfield        #136 <Field int mFlags>
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
	//    1    1:getfield        #136 <Field int mFlags>
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
	//*   1    1:getfield        #86  <Field int mOldPosition>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          16
			mOldPosition = mPosition;
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #84  <Field int mPosition>
	//    7   13:putfield        #86  <Field int mOldPosition>
		if(mPreLayoutPosition == -1)
	//*   8   16:aload_0         
	//*   9   17:getfield        #94  <Field int mPreLayoutPosition>
	//*  10   20:iconst_m1       
	//*  11   21:icmpne          32
			mPreLayoutPosition = mPosition;
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #84  <Field int mPosition>
	//   15   29:putfield        #94  <Field int mPreLayoutPosition>
		if(flag)
	//*  16   32:iload_2         
	//*  17   33:ifeq            46
			mPreLayoutPosition = mPreLayoutPosition + i;
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:getfield        #94  <Field int mPreLayoutPosition>
	//   21   41:iload_1         
	//   22   42:iadd            
	//   23   43:putfield        #94  <Field int mPreLayoutPosition>
		mPosition = mPosition + i;
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #84  <Field int mPosition>
	//   27   51:iload_1         
	//   28   52:iadd            
	//   29   53:putfield        #84  <Field int mPosition>
		if(itemView.getLayoutParams() != null)
	//*  30   56:aload_0         
	//*  31   57:getfield        #121 <Field View itemView>
	//*  32   60:invokevirtual   #240 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  33   63:ifnull          80
			((s)itemView.getLayoutParams()).mInsetsDirty = true;
	//   34   66:aload_0         
	//   35   67:getfield        #121 <Field View itemView>
	//   36   70:invokevirtual   #240 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   37   73:checkcast       #242 <Class RecyclerView$LayoutParams>
	//   38   76:iconst_1        
	//   39   77:putfield        #245 <Field boolean RecyclerView$LayoutParams.mInsetsDirty>
	//   40   80:return          
	}

	void resetInternal()
	{
		mFlags = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #136 <Field int mFlags>
		mPosition = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #84  <Field int mPosition>
		mOldPosition = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #86  <Field int mOldPosition>
		mItemId = -1L;
	//    9   15:aload_0         
	//   10   16:ldc2w           #87  <Long -1L>
	//   11   19:putfield        #90  <Field long mItemId>
		mPreLayoutPosition = -1;
	//   12   22:aload_0         
	//   13   23:iconst_m1       
	//   14   24:putfield        #94  <Field int mPreLayoutPosition>
		mIsRecyclableCount = 0;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #104 <Field int mIsRecyclableCount>
		mShadowedHolder = null;
	//   18   32:aload_0         
	//   19   33:aconst_null     
	//   20   34:putfield        #96  <Field RecyclerView$ViewHolder mShadowedHolder>
		mShadowingHolder = null;
	//   21   37:aload_0         
	//   22   38:aconst_null     
	//   23   39:putfield        #98  <Field RecyclerView$ViewHolder mShadowingHolder>
		clearPayload();
	//   24   42:aload_0         
	//   25   43:invokevirtual   #248 <Method void clearPayload()>
		mWasImportantForAccessibilityBeforeHidden = 0;
	//   26   46:aload_0         
	//   27   47:iconst_0        
	//   28   48:putfield        #110 <Field int mWasImportantForAccessibilityBeforeHidden>
		mPendingAccessibilityState = -1;
	//   29   51:aload_0         
	//   30   52:iconst_m1       
	//   31   53:putfield        #112 <Field int mPendingAccessibilityState>
		RecyclerView.clearNestedRecyclerViewIfNotNested(this);
	//   32   56:aload_0         
	//   33   57:invokestatic    #252 <Method void RecyclerView.clearNestedRecyclerViewIfNotNested(RecyclerView$ViewHolder)>
	//   34   60:return          
	}

	void saveOldPosition()
	{
		if(mOldPosition == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field int mOldPosition>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          16
			mOldPosition = mPosition;
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #84  <Field int mPosition>
	//    7   13:putfield        #86  <Field int mOldPosition>
	//    8   16:return          
	}

	void setFlags(int i, int j)
	{
		mFlags = i & j | mFlags & ~j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iand            
	//    4    4:aload_0         
	//    5    5:getfield        #136 <Field int mFlags>
	//    6    8:iload_2         
	//    7    9:iconst_m1       
	//    8   10:ixor            
	//    9   11:iand            
	//   10   12:ior             
	//   11   13:putfield        #136 <Field int mFlags>
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
	//    3    5:getfield        #104 <Field int mIsRecyclableCount>
	//    4    8:iconst_1        
	//    5    9:isub            
	//    6   10:istore_2        
		else
	//*   7   11:goto            21
			i = mIsRecyclableCount + 1;
	//    8   14:aload_0         
	//    9   15:getfield        #104 <Field int mIsRecyclableCount>
	//   10   18:iconst_1        
	//   11   19:iadd            
	//   12   20:istore_2        
		mIsRecyclableCount = i;
	//   13   21:aload_0         
	//   14   22:iload_2         
	//   15   23:putfield        #104 <Field int mIsRecyclableCount>
		if(mIsRecyclableCount < 0)
	//*  16   26:aload_0         
	//*  17   27:getfield        #104 <Field int mIsRecyclableCount>
	//*  18   30:ifge            72
		{
			mIsRecyclableCount = 0;
	//   19   33:aload_0         
	//   20   34:iconst_0        
	//   21   35:putfield        #104 <Field int mIsRecyclableCount>
			StringBuilder stringbuilder = new StringBuilder();
	//   22   38:new             #259 <Class StringBuilder>
	//   23   41:dup             
	//   24   42:invokespecial   #260 <Method void StringBuilder()>
	//   25   45:astore_3        
			stringbuilder.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
	//   26   46:aload_3         
	//   27   47:ldc2            #262 <String "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ">
	//   28   50:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
			stringbuilder.append(((Object) (this)));
	//   30   54:aload_3         
	//   31   55:aload_0         
	//   32   56:invokevirtual   #269 <Method StringBuilder StringBuilder.append(Object)>
	//   33   59:pop             
			Log.e("View", stringbuilder.toString());
	//   34   60:ldc2            #271 <String "View">
	//   35   63:aload_3         
	//   36   64:invokevirtual   #275 <Method String StringBuilder.toString()>
	//   37   67:invokestatic    #281 <Method int Log.e(String, String)>
	//   38   70:pop             
			return;
	//   39   71:return          
		}
		if(!flag && mIsRecyclableCount == 1)
	//*  40   72:iload_1         
	//*  41   73:ifne            96
	//*  42   76:aload_0         
	//*  43   77:getfield        #104 <Field int mIsRecyclableCount>
	//*  44   80:iconst_1        
	//*  45   81:icmpne          96
		{
			mFlags = mFlags | 0x10;
	//   46   84:aload_0         
	//   47   85:aload_0         
	//   48   86:getfield        #136 <Field int mFlags>
	//   49   89:bipush          16
	//   50   91:ior             
	//   51   92:putfield        #136 <Field int mFlags>
			return;
	//   52   95:return          
		}
		if(flag && mIsRecyclableCount == 0)
	//*  53   96:iload_1         
	//*  54   97:ifeq            118
	//*  55  100:aload_0         
	//*  56  101:getfield        #104 <Field int mIsRecyclableCount>
	//*  57  104:ifne            118
			mFlags = mFlags & 0xffffffef;
	//   58  107:aload_0         
	//   59  108:aload_0         
	//   60  109:getfield        #136 <Field int mFlags>
	//   61  112:bipush          -17
	//   62  114:iand            
	//   63  115:putfield        #136 <Field int mFlags>
	//   64  118:return          
	}

	void setScrapContainer(RecyclerView.Recycler recycler, boolean flag)
	{
		mScrapContainer = recycler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #106 <Field RecyclerView$Recycler mScrapContainer>
		mInChangeScrap = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #108 <Field boolean mInChangeScrap>
	//    6   10:return          
	}

	boolean shouldIgnore()
	{
		return (mFlags & 0x80) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field int mFlags>
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
	//    2    2:getfield        #136 <Field int mFlags>
	//    3    5:sipush          -129
	//    4    8:iand            
	//    5    9:putfield        #136 <Field int mFlags>
	//    6   12:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #259 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #260 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("ViewHolder{");
	//    4    8:aload_1         
	//    5    9:ldc2            #287 <String "ViewHolder{">
	//    6   12:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(Integer.toHexString(((Object)this).hashCode()));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #290 <Method int Object.hashCode()>
	//   11   21:invokestatic    #296 <Method String Integer.toHexString(int)>
	//   12   24:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		stringbuilder.append(" position=");
	//   14   28:aload_1         
	//   15   29:ldc2            #298 <String " position=">
	//   16   32:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
		stringbuilder.append(mPosition);
	//   18   36:aload_1         
	//   19   37:aload_0         
	//   20   38:getfield        #84  <Field int mPosition>
	//   21   41:invokevirtual   #301 <Method StringBuilder StringBuilder.append(int)>
	//   22   44:pop             
		stringbuilder.append(" id=");
	//   23   45:aload_1         
	//   24   46:ldc2            #303 <String " id=">
	//   25   49:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
		stringbuilder.append(mItemId);
	//   27   53:aload_1         
	//   28   54:aload_0         
	//   29   55:getfield        #90  <Field long mItemId>
	//   30   58:invokevirtual   #306 <Method StringBuilder StringBuilder.append(long)>
	//   31   61:pop             
		stringbuilder.append(", oldPos=");
	//   32   62:aload_1         
	//   33   63:ldc2            #308 <String ", oldPos=">
	//   34   66:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   35   69:pop             
		stringbuilder.append(mOldPosition);
	//   36   70:aload_1         
	//   37   71:aload_0         
	//   38   72:getfield        #86  <Field int mOldPosition>
	//   39   75:invokevirtual   #301 <Method StringBuilder StringBuilder.append(int)>
	//   40   78:pop             
		stringbuilder.append(", pLpos:");
	//   41   79:aload_1         
	//   42   80:ldc2            #310 <String ", pLpos:">
	//   43   83:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   44   86:pop             
		stringbuilder.append(mPreLayoutPosition);
	//   45   87:aload_1         
	//   46   88:aload_0         
	//   47   89:getfield        #94  <Field int mPreLayoutPosition>
	//   48   92:invokevirtual   #301 <Method StringBuilder StringBuilder.append(int)>
	//   49   95:pop             
		StringBuilder stringbuilder2 = new StringBuilder(stringbuilder.toString());
	//   50   96:new             #259 <Class StringBuilder>
	//   51   99:dup             
	//   52  100:aload_1         
	//   53  101:invokevirtual   #275 <Method String StringBuilder.toString()>
	//   54  104:invokespecial   #311 <Method void StringBuilder(String)>
	//   55  107:astore_2        
		if(isScrap())
	//*  56  108:aload_0         
	//*  57  109:invokevirtual   #313 <Method boolean isScrap()>
	//*  58  112:ifeq            147
		{
			stringbuilder2.append(" scrap ");
	//   59  115:aload_2         
	//   60  116:ldc2            #315 <String " scrap ">
	//   61  119:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   62  122:pop             
			String s;
			if(mInChangeScrap)
	//*  63  123:aload_0         
	//*  64  124:getfield        #108 <Field boolean mInChangeScrap>
	//*  65  127:ifeq            137
				s = "[changeScrap]";
	//   66  130:ldc2            #317 <String "[changeScrap]">
	//   67  133:astore_1        
			else
	//*  68  134:goto            141
				s = "[attachedScrap]";
	//   69  137:ldc2            #319 <String "[attachedScrap]">
	//   70  140:astore_1        
			stringbuilder2.append(s);
	//   71  141:aload_2         
	//   72  142:aload_1         
	//   73  143:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   74  146:pop             
		}
		if(isInvalid())
	//*  75  147:aload_0         
	//*  76  148:invokevirtual   #227 <Method boolean isInvalid()>
	//*  77  151:ifeq            162
			stringbuilder2.append(" invalid");
	//   78  154:aload_2         
	//   79  155:ldc2            #321 <String " invalid">
	//   80  158:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   81  161:pop             
		if(!isBound())
	//*  82  162:aload_0         
	//*  83  163:invokevirtual   #323 <Method boolean isBound()>
	//*  84  166:ifne            177
			stringbuilder2.append(" unbound");
	//   85  169:aload_2         
	//   86  170:ldc2            #325 <String " unbound">
	//   87  173:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   88  176:pop             
		if(needsUpdate())
	//*  89  177:aload_0         
	//*  90  178:invokevirtual   #327 <Method boolean needsUpdate()>
	//*  91  181:ifeq            192
			stringbuilder2.append(" update");
	//   92  184:aload_2         
	//   93  185:ldc2            #329 <String " update">
	//   94  188:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//   95  191:pop             
		if(isRemoved())
	//*  96  192:aload_0         
	//*  97  193:invokevirtual   #331 <Method boolean isRemoved()>
	//*  98  196:ifeq            207
			stringbuilder2.append(" removed");
	//   99  199:aload_2         
	//  100  200:ldc2            #333 <String " removed">
	//  101  203:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//  102  206:pop             
		if(shouldIgnore())
	//* 103  207:aload_0         
	//* 104  208:invokevirtual   #335 <Method boolean shouldIgnore()>
	//* 105  211:ifeq            222
			stringbuilder2.append(" ignored");
	//  106  214:aload_2         
	//  107  215:ldc2            #337 <String " ignored">
	//  108  218:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//  109  221:pop             
		if(isTmpDetached())
	//* 110  222:aload_0         
	//* 111  223:invokevirtual   #339 <Method boolean isTmpDetached()>
	//* 112  226:ifeq            237
			stringbuilder2.append(" tmpDetached");
	//  113  229:aload_2         
	//  114  230:ldc2            #341 <String " tmpDetached">
	//  115  233:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//  116  236:pop             
		if(!isRecyclable())
	//* 117  237:aload_0         
	//* 118  238:invokevirtual   #343 <Method boolean isRecyclable()>
	//* 119  241:ifne            286
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//  120  244:new             #259 <Class StringBuilder>
	//  121  247:dup             
	//  122  248:invokespecial   #260 <Method void StringBuilder()>
	//  123  251:astore_1        
			stringbuilder1.append(" not recyclable(");
	//  124  252:aload_1         
	//  125  253:ldc2            #345 <String " not recyclable(">
	//  126  256:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//  127  259:pop             
			stringbuilder1.append(mIsRecyclableCount);
	//  128  260:aload_1         
	//  129  261:aload_0         
	//  130  262:getfield        #104 <Field int mIsRecyclableCount>
	//  131  265:invokevirtual   #301 <Method StringBuilder StringBuilder.append(int)>
	//  132  268:pop             
			stringbuilder1.append(")");
	//  133  269:aload_1         
	//  134  270:ldc2            #347 <String ")">
	//  135  273:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//  136  276:pop             
			stringbuilder2.append(stringbuilder1.toString());
	//  137  277:aload_2         
	//  138  278:aload_1         
	//  139  279:invokevirtual   #275 <Method String StringBuilder.toString()>
	//  140  282:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//  141  285:pop             
		}
		if(isAdapterPositionUnknown())
	//* 142  286:aload_0         
	//* 143  287:invokevirtual   #349 <Method boolean isAdapterPositionUnknown()>
	//* 144  290:ifeq            301
			stringbuilder2.append(" undefined adapter position");
	//  145  293:aload_2         
	//  146  294:ldc2            #351 <String " undefined adapter position">
	//  147  297:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//  148  300:pop             
		if(itemView.getParent() == null)
	//* 149  301:aload_0         
	//* 150  302:getfield        #121 <Field View itemView>
	//* 151  305:invokevirtual   #355 <Method android.view.ViewParent View.getParent()>
	//* 152  308:ifnonnull       319
			stringbuilder2.append(" no parent");
	//  153  311:aload_2         
	//  154  312:ldc2            #357 <String " no parent">
	//  155  315:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//  156  318:pop             
		stringbuilder2.append("}");
	//  157  319:aload_2         
	//  158  320:ldc2            #359 <String "}">
	//  159  323:invokevirtual   #266 <Method StringBuilder StringBuilder.append(String)>
	//  160  326:pop             
		return stringbuilder2.toString();
	//  161  327:aload_2         
	//  162  328:invokevirtual   #275 <Method String StringBuilder.toString()>
	//  163  331:areturn         
	}

	void unScrap()
	{
		mScrapContainer.unscrapView(this);
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field RecyclerView$Recycler mScrapContainer>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #365 <Method void RecyclerView$Recycler.unscrapView(RecyclerView$ViewHolder)>
	//    4    8:return          
	}

	boolean wasReturnedFromScrap()
	{
		return (mFlags & 0x20) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field int mFlags>
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
	static final int FLAG_SET_A11Y_ITEM_DELEGATE = 16384;
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
	//    0    0:getstatic       #75  <Field List Collections.EMPTY_LIST>
	//    1    3:putstatic       #77  <Field List FULLUPDATE_PAYLOADS>
	//*   2    6:return          
	}


/*
	static RecyclerView.Recycler access$1002(RecyclerView$ViewHolder recyclerview$viewholder, RecyclerView.Recycler recycler)
	{
		recyclerview$viewholder.mScrapContainer = recycler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #106 <Field RecyclerView$Recycler mScrapContainer>
		return recycler;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static boolean access$1100(RecyclerView$ViewHolder recyclerview$viewholder)
	{
		return recyclerview$viewholder.mInChangeScrap;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field boolean mInChangeScrap>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$1102(RecyclerView$ViewHolder recyclerview$viewholder, boolean flag)
	{
		recyclerview$viewholder.mInChangeScrap = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #108 <Field boolean mInChangeScrap>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static boolean access$1500(RecyclerView$ViewHolder recyclerview$viewholder)
	{
		return recyclerview$viewholder.shouldBeKeptAsChild();
	//    0    0:aload_0         
	//    1    1:invokespecial   #132 <Method boolean shouldBeKeptAsChild()>
	//    2    4:ireturn         
	}

*/


/*
	static int access$1600(RecyclerView$ViewHolder recyclerview$viewholder)
	{
		return recyclerview$viewholder.mFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field int mFlags>
	//    2    4:ireturn         
	}

*/


/*
	static void access$200(RecyclerView$ViewHolder recyclerview$viewholder, RecyclerView recyclerview)
	{
		recyclerview$viewholder.onEnteredHiddenState(recyclerview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #142 <Method void onEnteredHiddenState(RecyclerView)>
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
	//    2    2:invokespecial   #146 <Method void onLeftHiddenState(RecyclerView)>
		return;
	//    3    5:return          
	}

*/


/*
	static boolean access$900(RecyclerView$ViewHolder recyclerview$viewholder)
	{
		return recyclerview$viewholder.doesTransientStatePreventRecycling();
	//    0    0:aload_0         
	//    1    1:invokespecial   #150 <Method boolean doesTransientStatePreventRecycling()>
	//    2    4:ireturn         
	}

*/

	public RecyclerView$ViewHolder(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void Object()>
		mPosition = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #84  <Field int mPosition>
		mOldPosition = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #86  <Field int mOldPosition>
		mItemId = -1L;
	//    8   14:aload_0         
	//    9   15:ldc2w           #87  <Long -1L>
	//   10   18:putfield        #90  <Field long mItemId>
		mItemViewType = -1;
	//   11   21:aload_0         
	//   12   22:iconst_m1       
	//   13   23:putfield        #92  <Field int mItemViewType>
		mPreLayoutPosition = -1;
	//   14   26:aload_0         
	//   15   27:iconst_m1       
	//   16   28:putfield        #94  <Field int mPreLayoutPosition>
		mShadowedHolder = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #96  <Field RecyclerView$ViewHolder mShadowedHolder>
		mShadowingHolder = null;
	//   20   36:aload_0         
	//   21   37:aconst_null     
	//   22   38:putfield        #98  <Field RecyclerView$ViewHolder mShadowingHolder>
		mPayloads = null;
	//   23   41:aload_0         
	//   24   42:aconst_null     
	//   25   43:putfield        #100 <Field List mPayloads>
		mUnmodifiedPayloads = null;
	//   26   46:aload_0         
	//   27   47:aconst_null     
	//   28   48:putfield        #102 <Field List mUnmodifiedPayloads>
		mIsRecyclableCount = 0;
	//   29   51:aload_0         
	//   30   52:iconst_0        
	//   31   53:putfield        #104 <Field int mIsRecyclableCount>
		mScrapContainer = null;
	//   32   56:aload_0         
	//   33   57:aconst_null     
	//   34   58:putfield        #106 <Field RecyclerView$Recycler mScrapContainer>
		mInChangeScrap = false;
	//   35   61:aload_0         
	//   36   62:iconst_0        
	//   37   63:putfield        #108 <Field boolean mInChangeScrap>
		mWasImportantForAccessibilityBeforeHidden = 0;
	//   38   66:aload_0         
	//   39   67:iconst_0        
	//   40   68:putfield        #110 <Field int mWasImportantForAccessibilityBeforeHidden>
		mPendingAccessibilityState = -1;
	//   41   71:aload_0         
	//   42   72:iconst_m1       
	//   43   73:putfield        #112 <Field int mPendingAccessibilityState>
		if(view == null)
	//*  44   76:aload_1         
	//*  45   77:ifnonnull       90
		{
			throw new IllegalArgumentException("itemView may not be null");
	//   46   80:new             #114 <Class IllegalArgumentException>
	//   47   83:dup             
	//   48   84:ldc1            #116 <String "itemView may not be null">
	//   49   86:invokespecial   #119 <Method void IllegalArgumentException(String)>
	//   50   89:athrow          
		} else
		{
			itemView = view;
	//   51   90:aload_0         
	//   52   91:aload_1         
	//   53   92:putfield        #121 <Field View itemView>
			return;
	//   54   95:return          
		}
	}
}
