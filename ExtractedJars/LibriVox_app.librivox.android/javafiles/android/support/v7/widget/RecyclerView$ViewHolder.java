// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.view.ac;
import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public abstract class RecyclerView$ViewHolder
{

	private void createPayloadsIfNeeded()
	{
		if(mPayloads == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field List mPayloads>
	//*   2    4:ifnonnull       29
		{
			mPayloads = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #119 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #120 <Method void ArrayList()>
	//    7   15:putfield        #95  <Field List mPayloads>
			mUnmodifiedPayloads = Collections.unmodifiableList(mPayloads);
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #95  <Field List mPayloads>
	//   11   23:invokestatic    #124 <Method List Collections.unmodifiableList(List)>
	//   12   26:putfield        #97  <Field List mUnmodifiedPayloads>
		}
	//   13   29:return          
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
	//    4    8:invokevirtual   #130 <Method void addFlags(int)>
			return;
	//    5   11:return          
		}
		if((0x400 & mFlags) == 0)
	//*   6   12:sipush          1024
	//*   7   15:aload_0         
	//*   8   16:getfield        #132 <Field int mFlags>
	//*   9   19:iand            
	//*  10   20:ifne            38
		{
			createPayloadsIfNeeded();
	//   11   23:aload_0         
	//   12   24:invokespecial   #134 <Method void createPayloadsIfNeeded()>
			mPayloads.add(obj);
	//   13   27:aload_0         
	//   14   28:getfield        #95  <Field List mPayloads>
	//   15   31:aload_1         
	//   16   32:invokeinterface #140 <Method boolean List.add(Object)>
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
	//    3    3:getfield        #132 <Field int mFlags>
	//    4    6:ior             
	//    5    7:putfield        #132 <Field int mFlags>
	//    6   10:return          
	}

	void clearOldPosition()
	{
		mOldPosition = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #81  <Field int mOldPosition>
		mPreLayoutPosition = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #89  <Field int mPreLayoutPosition>
	//    6   10:return          
	}

	void clearPayload()
	{
		List list = mPayloads;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field List mPayloads>
	//    2    4:astore_1        
		if(list != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			list.clear();
	//    5    9:aload_1         
	//    6   10:invokeinterface #145 <Method void List.clear()>
		mFlags = mFlags & 0xfffffbff;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #132 <Field int mFlags>
	//   10   20:sipush          -1025
	//   11   23:iand            
	//   12   24:putfield        #132 <Field int mFlags>
	//   13   27:return          
	}

	void clearReturnedFromScrapFlag()
	{
		mFlags = mFlags & 0xffffffdf;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #132 <Field int mFlags>
	//    3    5:bipush          -33
	//    4    7:iand            
	//    5    8:putfield        #132 <Field int mFlags>
	//    6   11:return          
	}

	void clearTmpDetachFlag()
	{
		mFlags = mFlags & 0xfffffeff;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #132 <Field int mFlags>
	//    3    5:sipush          -257
	//    4    8:iand            
	//    5    9:putfield        #132 <Field int mFlags>
	//    6   12:return          
	}

	boolean doesTransientStatePreventRecycling()
	{
		return (mFlags & 0x10) == 0 && ac.c(itemView);
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field int mFlags>
	//    2    4:bipush          16
	//    3    6:iand            
	//    4    7:ifne            22
	//    5   10:aload_0         
	//    6   11:getfield        #109 <Field View itemView>
	//    7   14:invokestatic    #155 <Method boolean ac.c(View)>
	//    8   17:ifeq            22
	//    9   20:iconst_1        
	//   10   21:ireturn         
	//   11   22:iconst_0        
	//   12   23:ireturn         
	}

	void flagRemovedAndOffsetPosition(int i, int j, boolean flag)
	{
		addFlags(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #130 <Method void addFlags(int)>
		offsetPosition(j, flag);
	//    3    6:aload_0         
	//    4    7:iload_2         
	//    5    8:iload_3         
	//    6    9:invokevirtual   #161 <Method void offsetPosition(int, boolean)>
		mPosition = i;
	//    7   12:aload_0         
	//    8   13:iload_1         
	//    9   14:putfield        #79  <Field int mPosition>
	//   10   17:return          
	}

	public final int getAdapterPosition()
	{
		RecyclerView recyclerview = mOwnerRecyclerView;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field RecyclerView mOwnerRecyclerView>
	//    2    4:astore_1        
		if(recyclerview == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return -1;
	//    5    9:iconst_m1       
	//    6   10:ireturn         
		else
			return recyclerview.getAdapterPositionFor(this);
	//    7   11:aload_1         
	//    8   12:aload_0         
	//    9   13:invokevirtual   #171 <Method int RecyclerView.getAdapterPositionFor(RecyclerView$ViewHolder)>
	//   10   16:ireturn         
	}

	public final long getItemId()
	{
		return mItemId;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field long mItemId>
	//    2    4:lreturn         
	}

	public final int getItemViewType()
	{
		return mItemViewType;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int mItemViewType>
	//    2    4:ireturn         
	}

	public final int getLayoutPosition()
	{
		int j = mPreLayoutPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field int mPreLayoutPosition>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j == -1)
	//*   5    7:iload_2         
	//*   6    8:iconst_m1       
	//*   7    9:icmpne          17
			i = mPosition;
	//    8   12:aload_0         
	//    9   13:getfield        #79  <Field int mPosition>
	//   10   16:istore_1        
		return i;
	//   11   17:iload_1         
	//   12   18:ireturn         
	}

	public final int getOldPosition()
	{
		return mOldPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field int mOldPosition>
	//    2    4:ireturn         
	}

	public final int getPosition()
	{
		int j = mPreLayoutPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field int mPreLayoutPosition>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j == -1)
	//*   5    7:iload_2         
	//*   6    8:iconst_m1       
	//*   7    9:icmpne          17
			i = mPosition;
	//    8   12:aload_0         
	//    9   13:getfield        #79  <Field int mPosition>
	//   10   16:istore_1        
		return i;
	//   11   17:iload_1         
	//   12   18:ireturn         
	}

	List getUnmodifiedPayloads()
	{
		if((mFlags & 0x400) == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #132 <Field int mFlags>
	//*   2    4:sipush          1024
	//*   3    7:iand            
	//*   4    8:ifne            41
		{
			List list = mPayloads;
	//    5   11:aload_0         
	//    6   12:getfield        #95  <Field List mPayloads>
	//    7   15:astore_1        
			if(list != null && list.size() != 0)
	//*   8   16:aload_1         
	//*   9   17:ifnull          37
	//*  10   20:aload_1         
	//*  11   21:invokeinterface #183 <Method int List.size()>
	//*  12   26:ifne            32
	//*  13   29:goto            37
				return mUnmodifiedPayloads;
	//   14   32:aload_0         
	//   15   33:getfield        #97  <Field List mUnmodifiedPayloads>
	//   16   36:areturn         
			else
				return FULLUPDATE_PAYLOADS;
	//   17   37:getstatic       #72  <Field List FULLUPDATE_PAYLOADS>
	//   18   40:areturn         
		} else
		{
			return FULLUPDATE_PAYLOADS;
	//   19   41:getstatic       #72  <Field List FULLUPDATE_PAYLOADS>
	//   20   44:areturn         
		}
	}

	boolean hasAnyOfTheFlags(int i)
	{
		return (i & mFlags) != 0;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #132 <Field int mFlags>
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
	//    1    1:getfield        #132 <Field int mFlags>
	//    2    4:sipush          512
	//    3    7:iand            
	//    4    8:ifne            23
	//    5   11:aload_0         
	//    6   12:invokevirtual   #189 <Method boolean isInvalid()>
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
	//    1    1:getfield        #132 <Field int mFlags>
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
	//    1    1:getfield        #132 <Field int mFlags>
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
		return (mFlags & 0x10) == 0 && !ac.c(itemView);
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field int mFlags>
	//    2    4:bipush          16
	//    3    6:iand            
	//    4    7:ifne            22
	//    5   10:aload_0         
	//    6   11:getfield        #109 <Field View itemView>
	//    7   14:invokestatic    #155 <Method boolean ac.c(View)>
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
	//    1    1:getfield        #132 <Field int mFlags>
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
	//    1    1:getfield        #101 <Field RecyclerView$Recycler mScrapContainer>
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
	//    1    1:getfield        #132 <Field int mFlags>
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
	//    1    1:getfield        #132 <Field int mFlags>
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
	//    1    1:getfield        #132 <Field int mFlags>
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
	//*   1    1:getfield        #81  <Field int mOldPosition>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          16
			mOldPosition = mPosition;
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #79  <Field int mPosition>
	//    7   13:putfield        #81  <Field int mOldPosition>
		if(mPreLayoutPosition == -1)
	//*   8   16:aload_0         
	//*   9   17:getfield        #89  <Field int mPreLayoutPosition>
	//*  10   20:iconst_m1       
	//*  11   21:icmpne          32
			mPreLayoutPosition = mPosition;
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #79  <Field int mPosition>
	//   15   29:putfield        #89  <Field int mPreLayoutPosition>
		if(flag)
	//*  16   32:iload_2         
	//*  17   33:ifeq            46
			mPreLayoutPosition = mPreLayoutPosition + i;
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:getfield        #89  <Field int mPreLayoutPosition>
	//   21   41:iload_1         
	//   22   42:iadd            
	//   23   43:putfield        #89  <Field int mPreLayoutPosition>
		mPosition = mPosition + i;
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #79  <Field int mPosition>
	//   27   51:iload_1         
	//   28   52:iadd            
	//   29   53:putfield        #79  <Field int mPosition>
		if(itemView.getLayoutParams() != null)
	//*  30   56:aload_0         
	//*  31   57:getfield        #109 <Field View itemView>
	//*  32   60:invokevirtual   #202 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  33   63:ifnull          80
			((s)itemView.getLayoutParams()).mInsetsDirty = true;
	//   34   66:aload_0         
	//   35   67:getfield        #109 <Field View itemView>
	//   36   70:invokevirtual   #202 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   37   73:checkcast       #204 <Class RecyclerView$LayoutParams>
	//   38   76:iconst_1        
	//   39   77:putfield        #207 <Field boolean RecyclerView$LayoutParams.mInsetsDirty>
	//   40   80:return          
	}

	void onEnteredHiddenState(RecyclerView recyclerview)
	{
		int i = mPendingAccessibilityState;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field int mPendingAccessibilityState>
	//    2    4:istore_2        
		if(i != -1)
	//*   3    5:iload_2         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          18
			mWasImportantForAccessibilityBeforeHidden = i;
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:putfield        #105 <Field int mWasImportantForAccessibilityBeforeHidden>
		else
	//*   9   15:goto            29
			mWasImportantForAccessibilityBeforeHidden = ac.e(itemView);
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #109 <Field View itemView>
	//   13   23:invokestatic    #213 <Method int ac.e(View)>
	//   14   26:putfield        #105 <Field int mWasImportantForAccessibilityBeforeHidden>
		recyclerview.setChildImportantForAccessibilityInternal(this, 4);
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:iconst_4        
	//   18   32:invokevirtual   #217 <Method boolean RecyclerView.setChildImportantForAccessibilityInternal(RecyclerView$ViewHolder, int)>
	//   19   35:pop             
	//   20   36:return          
	}

	void onLeftHiddenState(RecyclerView recyclerview)
	{
		recyclerview.setChildImportantForAccessibilityInternal(this, mWasImportantForAccessibilityBeforeHidden);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #105 <Field int mWasImportantForAccessibilityBeforeHidden>
	//    4    6:invokevirtual   #217 <Method boolean RecyclerView.setChildImportantForAccessibilityInternal(RecyclerView$ViewHolder, int)>
	//    5    9:pop             
		mWasImportantForAccessibilityBeforeHidden = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #105 <Field int mWasImportantForAccessibilityBeforeHidden>
	//    9   15:return          
	}

	void resetInternal()
	{
		mFlags = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #132 <Field int mFlags>
		mPosition = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #79  <Field int mPosition>
		mOldPosition = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #81  <Field int mOldPosition>
		mItemId = -1L;
	//    9   15:aload_0         
	//   10   16:ldc2w           #82  <Long -1L>
	//   11   19:putfield        #85  <Field long mItemId>
		mPreLayoutPosition = -1;
	//   12   22:aload_0         
	//   13   23:iconst_m1       
	//   14   24:putfield        #89  <Field int mPreLayoutPosition>
		mIsRecyclableCount = 0;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #99  <Field int mIsRecyclableCount>
		mShadowedHolder = null;
	//   18   32:aload_0         
	//   19   33:aconst_null     
	//   20   34:putfield        #91  <Field RecyclerView$ViewHolder mShadowedHolder>
		mShadowingHolder = null;
	//   21   37:aload_0         
	//   22   38:aconst_null     
	//   23   39:putfield        #93  <Field RecyclerView$ViewHolder mShadowingHolder>
		clearPayload();
	//   24   42:aload_0         
	//   25   43:invokevirtual   #221 <Method void clearPayload()>
		mWasImportantForAccessibilityBeforeHidden = 0;
	//   26   46:aload_0         
	//   27   47:iconst_0        
	//   28   48:putfield        #105 <Field int mWasImportantForAccessibilityBeforeHidden>
		mPendingAccessibilityState = -1;
	//   29   51:aload_0         
	//   30   52:iconst_m1       
	//   31   53:putfield        #107 <Field int mPendingAccessibilityState>
		RecyclerView.clearNestedRecyclerViewIfNotNested(this);
	//   32   56:aload_0         
	//   33   57:invokestatic    #225 <Method void RecyclerView.clearNestedRecyclerViewIfNotNested(RecyclerView$ViewHolder)>
	//   34   60:return          
	}

	void saveOldPosition()
	{
		if(mOldPosition == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field int mOldPosition>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          16
			mOldPosition = mPosition;
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #79  <Field int mPosition>
	//    7   13:putfield        #81  <Field int mOldPosition>
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
	//    5    5:getfield        #132 <Field int mFlags>
	//    6    8:iload_2         
	//    7    9:iconst_m1       
	//    8   10:ixor            
	//    9   11:iand            
	//   10   12:ior             
	//   11   13:putfield        #132 <Field int mFlags>
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
	//    3    5:getfield        #99  <Field int mIsRecyclableCount>
	//    4    8:iconst_1        
	//    5    9:isub            
	//    6   10:istore_2        
		else
	//*   7   11:goto            21
			i = mIsRecyclableCount + 1;
	//    8   14:aload_0         
	//    9   15:getfield        #99  <Field int mIsRecyclableCount>
	//   10   18:iconst_1        
	//   11   19:iadd            
	//   12   20:istore_2        
		mIsRecyclableCount = i;
	//   13   21:aload_0         
	//   14   22:iload_2         
	//   15   23:putfield        #99  <Field int mIsRecyclableCount>
		i = mIsRecyclableCount;
	//   16   26:aload_0         
	//   17   27:getfield        #99  <Field int mIsRecyclableCount>
	//   18   30:istore_2        
		if(i < 0)
	//*  19   31:iload_2         
	//*  20   32:ifge            72
		{
			mIsRecyclableCount = 0;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #99  <Field int mIsRecyclableCount>
			StringBuilder stringbuilder = new StringBuilder();
	//   24   40:new             #232 <Class StringBuilder>
	//   25   43:dup             
	//   26   44:invokespecial   #233 <Method void StringBuilder()>
	//   27   47:astore_3        
			stringbuilder.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
	//   28   48:aload_3         
	//   29   49:ldc1            #235 <String "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ">
	//   30   51:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   31   54:pop             
			stringbuilder.append(((Object) (this)));
	//   32   55:aload_3         
	//   33   56:aload_0         
	//   34   57:invokevirtual   #242 <Method StringBuilder StringBuilder.append(Object)>
	//   35   60:pop             
			Log.e("View", stringbuilder.toString());
	//   36   61:ldc1            #244 <String "View">
	//   37   63:aload_3         
	//   38   64:invokevirtual   #248 <Method String StringBuilder.toString()>
	//   39   67:invokestatic    #253 <Method int Log.e(String, String)>
	//   40   70:pop             
			return;
	//   41   71:return          
		}
		if(!flag && i == 1)
	//*  42   72:iload_1         
	//*  43   73:ifne            93
	//*  44   76:iload_2         
	//*  45   77:iconst_1        
	//*  46   78:icmpne          93
		{
			mFlags = mFlags | 0x10;
	//   47   81:aload_0         
	//   48   82:aload_0         
	//   49   83:getfield        #132 <Field int mFlags>
	//   50   86:bipush          16
	//   51   88:ior             
	//   52   89:putfield        #132 <Field int mFlags>
			return;
	//   53   92:return          
		}
		if(flag && mIsRecyclableCount == 0)
	//*  54   93:iload_1         
	//*  55   94:ifeq            115
	//*  56   97:aload_0         
	//*  57   98:getfield        #99  <Field int mIsRecyclableCount>
	//*  58  101:ifne            115
			mFlags = mFlags & 0xffffffef;
	//   59  104:aload_0         
	//   60  105:aload_0         
	//   61  106:getfield        #132 <Field int mFlags>
	//   62  109:bipush          -17
	//   63  111:iand            
	//   64  112:putfield        #132 <Field int mFlags>
	//   65  115:return          
	}

	void setScrapContainer(RecyclerView.Recycler recycler, boolean flag)
	{
		mScrapContainer = recycler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #101 <Field RecyclerView$Recycler mScrapContainer>
		mInChangeScrap = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #103 <Field boolean mInChangeScrap>
	//    6   10:return          
	}

	boolean shouldBeKeptAsChild()
	{
		return (mFlags & 0x10) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field int mFlags>
	//    2    4:bipush          16
	//    3    6:iand            
	//    4    7:ifeq            12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
	}

	boolean shouldIgnore()
	{
		return (mFlags & 0x80) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field int mFlags>
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
	//    2    2:getfield        #132 <Field int mFlags>
	//    3    5:sipush          -129
	//    4    8:iand            
	//    5    9:putfield        #132 <Field int mFlags>
	//    6   12:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #232 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #233 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("ViewHolder{");
	//    4    8:aload_1         
	//    5    9:ldc2            #260 <String "ViewHolder{">
	//    6   12:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(Integer.toHexString(((Object)this).hashCode()));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #263 <Method int Object.hashCode()>
	//   11   21:invokestatic    #269 <Method String Integer.toHexString(int)>
	//   12   24:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		stringbuilder.append(" position=");
	//   14   28:aload_1         
	//   15   29:ldc2            #271 <String " position=">
	//   16   32:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
		stringbuilder.append(mPosition);
	//   18   36:aload_1         
	//   19   37:aload_0         
	//   20   38:getfield        #79  <Field int mPosition>
	//   21   41:invokevirtual   #274 <Method StringBuilder StringBuilder.append(int)>
	//   22   44:pop             
		stringbuilder.append(" id=");
	//   23   45:aload_1         
	//   24   46:ldc2            #276 <String " id=">
	//   25   49:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
		stringbuilder.append(mItemId);
	//   27   53:aload_1         
	//   28   54:aload_0         
	//   29   55:getfield        #85  <Field long mItemId>
	//   30   58:invokevirtual   #279 <Method StringBuilder StringBuilder.append(long)>
	//   31   61:pop             
		stringbuilder.append(", oldPos=");
	//   32   62:aload_1         
	//   33   63:ldc2            #281 <String ", oldPos=">
	//   34   66:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   35   69:pop             
		stringbuilder.append(mOldPosition);
	//   36   70:aload_1         
	//   37   71:aload_0         
	//   38   72:getfield        #81  <Field int mOldPosition>
	//   39   75:invokevirtual   #274 <Method StringBuilder StringBuilder.append(int)>
	//   40   78:pop             
		stringbuilder.append(", pLpos:");
	//   41   79:aload_1         
	//   42   80:ldc2            #283 <String ", pLpos:">
	//   43   83:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   44   86:pop             
		stringbuilder.append(mPreLayoutPosition);
	//   45   87:aload_1         
	//   46   88:aload_0         
	//   47   89:getfield        #89  <Field int mPreLayoutPosition>
	//   48   92:invokevirtual   #274 <Method StringBuilder StringBuilder.append(int)>
	//   49   95:pop             
		StringBuilder stringbuilder2 = new StringBuilder(stringbuilder.toString());
	//   50   96:new             #232 <Class StringBuilder>
	//   51   99:dup             
	//   52  100:aload_1         
	//   53  101:invokevirtual   #248 <Method String StringBuilder.toString()>
	//   54  104:invokespecial   #284 <Method void StringBuilder(String)>
	//   55  107:astore_2        
		if(isScrap())
	//*  56  108:aload_0         
	//*  57  109:invokevirtual   #286 <Method boolean isScrap()>
	//*  58  112:ifeq            147
		{
			stringbuilder2.append(" scrap ");
	//   59  115:aload_2         
	//   60  116:ldc2            #288 <String " scrap ">
	//   61  119:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   62  122:pop             
			String s;
			if(mInChangeScrap)
	//*  63  123:aload_0         
	//*  64  124:getfield        #103 <Field boolean mInChangeScrap>
	//*  65  127:ifeq            137
				s = "[changeScrap]";
	//   66  130:ldc2            #290 <String "[changeScrap]">
	//   67  133:astore_1        
			else
	//*  68  134:goto            141
				s = "[attachedScrap]";
	//   69  137:ldc2            #292 <String "[attachedScrap]">
	//   70  140:astore_1        
			stringbuilder2.append(s);
	//   71  141:aload_2         
	//   72  142:aload_1         
	//   73  143:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   74  146:pop             
		}
		if(isInvalid())
	//*  75  147:aload_0         
	//*  76  148:invokevirtual   #189 <Method boolean isInvalid()>
	//*  77  151:ifeq            162
			stringbuilder2.append(" invalid");
	//   78  154:aload_2         
	//   79  155:ldc2            #294 <String " invalid">
	//   80  158:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   81  161:pop             
		if(!isBound())
	//*  82  162:aload_0         
	//*  83  163:invokevirtual   #296 <Method boolean isBound()>
	//*  84  166:ifne            177
			stringbuilder2.append(" unbound");
	//   85  169:aload_2         
	//   86  170:ldc2            #298 <String " unbound">
	//   87  173:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   88  176:pop             
		if(needsUpdate())
	//*  89  177:aload_0         
	//*  90  178:invokevirtual   #300 <Method boolean needsUpdate()>
	//*  91  181:ifeq            192
			stringbuilder2.append(" update");
	//   92  184:aload_2         
	//   93  185:ldc2            #302 <String " update">
	//   94  188:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   95  191:pop             
		if(isRemoved())
	//*  96  192:aload_0         
	//*  97  193:invokevirtual   #304 <Method boolean isRemoved()>
	//*  98  196:ifeq            207
			stringbuilder2.append(" removed");
	//   99  199:aload_2         
	//  100  200:ldc2            #306 <String " removed">
	//  101  203:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  102  206:pop             
		if(shouldIgnore())
	//* 103  207:aload_0         
	//* 104  208:invokevirtual   #308 <Method boolean shouldIgnore()>
	//* 105  211:ifeq            222
			stringbuilder2.append(" ignored");
	//  106  214:aload_2         
	//  107  215:ldc2            #310 <String " ignored">
	//  108  218:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  109  221:pop             
		if(isTmpDetached())
	//* 110  222:aload_0         
	//* 111  223:invokevirtual   #312 <Method boolean isTmpDetached()>
	//* 112  226:ifeq            237
			stringbuilder2.append(" tmpDetached");
	//  113  229:aload_2         
	//  114  230:ldc2            #314 <String " tmpDetached">
	//  115  233:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  116  236:pop             
		if(!isRecyclable())
	//* 117  237:aload_0         
	//* 118  238:invokevirtual   #316 <Method boolean isRecyclable()>
	//* 119  241:ifne            286
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//  120  244:new             #232 <Class StringBuilder>
	//  121  247:dup             
	//  122  248:invokespecial   #233 <Method void StringBuilder()>
	//  123  251:astore_1        
			stringbuilder1.append(" not recyclable(");
	//  124  252:aload_1         
	//  125  253:ldc2            #318 <String " not recyclable(">
	//  126  256:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  127  259:pop             
			stringbuilder1.append(mIsRecyclableCount);
	//  128  260:aload_1         
	//  129  261:aload_0         
	//  130  262:getfield        #99  <Field int mIsRecyclableCount>
	//  131  265:invokevirtual   #274 <Method StringBuilder StringBuilder.append(int)>
	//  132  268:pop             
			stringbuilder1.append(")");
	//  133  269:aload_1         
	//  134  270:ldc2            #320 <String ")">
	//  135  273:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  136  276:pop             
			stringbuilder2.append(stringbuilder1.toString());
	//  137  277:aload_2         
	//  138  278:aload_1         
	//  139  279:invokevirtual   #248 <Method String StringBuilder.toString()>
	//  140  282:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  141  285:pop             
		}
		if(isAdapterPositionUnknown())
	//* 142  286:aload_0         
	//* 143  287:invokevirtual   #322 <Method boolean isAdapterPositionUnknown()>
	//* 144  290:ifeq            301
			stringbuilder2.append(" undefined adapter position");
	//  145  293:aload_2         
	//  146  294:ldc2            #324 <String " undefined adapter position">
	//  147  297:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  148  300:pop             
		if(itemView.getParent() == null)
	//* 149  301:aload_0         
	//* 150  302:getfield        #109 <Field View itemView>
	//* 151  305:invokevirtual   #328 <Method android.view.ViewParent View.getParent()>
	//* 152  308:ifnonnull       319
			stringbuilder2.append(" no parent");
	//  153  311:aload_2         
	//  154  312:ldc2            #330 <String " no parent">
	//  155  315:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  156  318:pop             
		stringbuilder2.append("}");
	//  157  319:aload_2         
	//  158  320:ldc2            #332 <String "}">
	//  159  323:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  160  326:pop             
		return stringbuilder2.toString();
	//  161  327:aload_2         
	//  162  328:invokevirtual   #248 <Method String StringBuilder.toString()>
	//  163  331:areturn         
	}

	void unScrap()
	{
		mScrapContainer.unscrapView(this);
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field RecyclerView$Recycler mScrapContainer>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #338 <Method void RecyclerView$Recycler.unscrapView(RecyclerView$ViewHolder)>
	//    4    8:return          
	}

	boolean wasReturnedFromScrap()
	{
		return (mFlags & 0x20) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field int mFlags>
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
	private static final List FULLUPDATE_PAYLOADS = Collections.emptyList();
	static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
	public final View itemView;
	int mFlags;
	boolean mInChangeScrap;
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
	RecyclerView.Recycler mScrapContainer;
	RecyclerView$ViewHolder mShadowedHolder;
	RecyclerView$ViewHolder mShadowingHolder;
	List mUnmodifiedPayloads;
	private int mWasImportantForAccessibilityBeforeHidden;

	static 
	{
	//    0    0:invokestatic    #70  <Method List Collections.emptyList()>
	//    1    3:putstatic       #72  <Field List FULLUPDATE_PAYLOADS>
	//*   2    6:return          
	}

	public RecyclerView$ViewHolder(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void Object()>
		mPosition = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #79  <Field int mPosition>
		mOldPosition = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #81  <Field int mOldPosition>
		mItemId = -1L;
	//    8   14:aload_0         
	//    9   15:ldc2w           #82  <Long -1L>
	//   10   18:putfield        #85  <Field long mItemId>
		mItemViewType = -1;
	//   11   21:aload_0         
	//   12   22:iconst_m1       
	//   13   23:putfield        #87  <Field int mItemViewType>
		mPreLayoutPosition = -1;
	//   14   26:aload_0         
	//   15   27:iconst_m1       
	//   16   28:putfield        #89  <Field int mPreLayoutPosition>
		mShadowedHolder = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #91  <Field RecyclerView$ViewHolder mShadowedHolder>
		mShadowingHolder = null;
	//   20   36:aload_0         
	//   21   37:aconst_null     
	//   22   38:putfield        #93  <Field RecyclerView$ViewHolder mShadowingHolder>
		mPayloads = null;
	//   23   41:aload_0         
	//   24   42:aconst_null     
	//   25   43:putfield        #95  <Field List mPayloads>
		mUnmodifiedPayloads = null;
	//   26   46:aload_0         
	//   27   47:aconst_null     
	//   28   48:putfield        #97  <Field List mUnmodifiedPayloads>
		mIsRecyclableCount = 0;
	//   29   51:aload_0         
	//   30   52:iconst_0        
	//   31   53:putfield        #99  <Field int mIsRecyclableCount>
		mScrapContainer = null;
	//   32   56:aload_0         
	//   33   57:aconst_null     
	//   34   58:putfield        #101 <Field RecyclerView$Recycler mScrapContainer>
		mInChangeScrap = false;
	//   35   61:aload_0         
	//   36   62:iconst_0        
	//   37   63:putfield        #103 <Field boolean mInChangeScrap>
		mWasImportantForAccessibilityBeforeHidden = 0;
	//   38   66:aload_0         
	//   39   67:iconst_0        
	//   40   68:putfield        #105 <Field int mWasImportantForAccessibilityBeforeHidden>
		mPendingAccessibilityState = -1;
	//   41   71:aload_0         
	//   42   72:iconst_m1       
	//   43   73:putfield        #107 <Field int mPendingAccessibilityState>
		if(view != null)
	//*  44   76:aload_1         
	//*  45   77:ifnull          86
		{
			itemView = view;
	//   46   80:aload_0         
	//   47   81:aload_1         
	//   48   82:putfield        #109 <Field View itemView>
			return;
	//   49   85:return          
		} else
		{
			throw new IllegalArgumentException("itemView may not be null");
	//   50   86:new             #111 <Class IllegalArgumentException>
	//   51   89:dup             
	//   52   90:ldc1            #113 <String "itemView may not be null">
	//   53   92:invokespecial   #116 <Method void IllegalArgumentException(String)>
	//   54   95:athrow          
		}
	}
}
