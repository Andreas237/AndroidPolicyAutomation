// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public static abstract class RecyclerView$ItemAnimator
{
	public static interface AdapterChanges
		extends Annotation
	{
	}

	public static interface ItemAnimatorFinishedListener
	{

		public abstract void onAnimationsFinished();
	}

	static interface ItemAnimatorListener
	{

		public abstract void onAnimationFinished(RecyclerView.ViewHolder viewholder);
	}

	public static class ItemHolderInfo
	{

		public ItemHolderInfo setFrom(RecyclerView.ViewHolder viewholder)
		{
			return setFrom(viewholder, 0);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #26  <Method RecyclerView$ItemAnimator$ItemHolderInfo setFrom(RecyclerView$ViewHolder, int)>
		//    4    6:areturn         
		}

		public ItemHolderInfo setFrom(RecyclerView.ViewHolder viewholder, int i)
		{
			viewholder = ((RecyclerView.ViewHolder) (viewholder.itemView));
		//    0    0:aload_1         
		//    1    1:getfield        #32  <Field View RecyclerView$ViewHolder.itemView>
		//    2    4:astore_1        
			left = ((View) (viewholder)).getLeft();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #38  <Method int View.getLeft()>
		//    6   10:putfield        #40  <Field int left>
			top = ((View) (viewholder)).getTop();
		//    7   13:aload_0         
		//    8   14:aload_1         
		//    9   15:invokevirtual   #43  <Method int View.getTop()>
		//   10   18:putfield        #45  <Field int top>
			right = ((View) (viewholder)).getRight();
		//   11   21:aload_0         
		//   12   22:aload_1         
		//   13   23:invokevirtual   #48  <Method int View.getRight()>
		//   14   26:putfield        #50  <Field int right>
			bottom = ((View) (viewholder)).getBottom();
		//   15   29:aload_0         
		//   16   30:aload_1         
		//   17   31:invokevirtual   #53  <Method int View.getBottom()>
		//   18   34:putfield        #55  <Field int bottom>
			return this;
		//   19   37:aload_0         
		//   20   38:areturn         
		}

		public int bottom;
		public int changeFlags;
		public int left;
		public int right;
		public int top;

		public ItemHolderInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}
	}


	static int buildAdapterChangeFlagsForAnimations(RecyclerView.ViewHolder viewholder)
	{
		int j = RecyclerView.ViewHolder.access$1600(viewholder) & 0xe;
	//    0    0:aload_0         
	//    1    1:invokestatic    #71  <Method int RecyclerView$ViewHolder.access$1600(RecyclerView$ViewHolder)>
	//    2    4:bipush          14
	//    3    6:iand            
	//    4    7:istore_2        
		int i;
		if(viewholder.isInvalid())
	//*   5    8:aload_0         
	//*   6    9:invokevirtual   #75  <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//*   7   12:ifeq            19
		{
			i = 4;
	//    8   15:iconst_4        
	//    9   16:istore_1        
		} else
	//*  10   17:iload_1         
	//*  11   18:ireturn         
		{
			i = j;
	//   12   19:iload_2         
	//   13   20:istore_1        
			if((j & 4) == 0)
	//*  14   21:iload_2         
	//*  15   22:iconst_4        
	//*  16   23:iand            
	//*  17   24:ifne            17
			{
				int k = viewholder.getOldPosition();
	//   18   27:aload_0         
	//   19   28:invokevirtual   #79  <Method int RecyclerView$ViewHolder.getOldPosition()>
	//   20   31:istore_3        
				int l = viewholder.getAdapterPosition();
	//   21   32:aload_0         
	//   22   33:invokevirtual   #82  <Method int RecyclerView$ViewHolder.getAdapterPosition()>
	//   23   36:istore          4
				i = j;
	//   24   38:iload_2         
	//   25   39:istore_1        
				if(k != -1)
	//*  26   40:iload_3         
	//*  27   41:iconst_m1       
	//*  28   42:icmpeq          17
				{
					i = j;
	//   29   45:iload_2         
	//   30   46:istore_1        
					if(l != -1)
	//*  31   47:iload           4
	//*  32   49:iconst_m1       
	//*  33   50:icmpeq          17
					{
						i = j;
	//   34   53:iload_2         
	//   35   54:istore_1        
						if(k != l)
	//*  36   55:iload_3         
	//*  37   56:iload           4
	//*  38   58:icmpeq          17
							return j | 0x800;
	//   39   61:iload_2         
	//   40   62:sipush          2048
	//   41   65:ior             
	//   42   66:ireturn         
					}
				}
			}
		}
		return i;
	}

	public abstract boolean animateAppearance(RecyclerView.ViewHolder viewholder, ItemHolderInfo itemholderinfo, ItemHolderInfo itemholderinfo1);

	public abstract boolean animateChange(RecyclerView.ViewHolder viewholder, RecyclerView.ViewHolder viewholder1, ItemHolderInfo itemholderinfo, ItemHolderInfo itemholderinfo1);

	public abstract boolean animateDisappearance(RecyclerView.ViewHolder viewholder, ItemHolderInfo itemholderinfo, ItemHolderInfo itemholderinfo1);

	public abstract boolean animatePersistence(RecyclerView.ViewHolder viewholder, ItemHolderInfo itemholderinfo, ItemHolderInfo itemholderinfo1);

	public boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewholder)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewholder, List list)
	{
		return canReuseUpdatedViewHolder(viewholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #96  <Method boolean canReuseUpdatedViewHolder(RecyclerView$ViewHolder)>
	//    3    5:ireturn         
	}

	public final void dispatchAnimationFinished(RecyclerView.ViewHolder viewholder)
	{
		onAnimationFinished(viewholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #103 <Method void onAnimationFinished(RecyclerView$ViewHolder)>
		if(mListener != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #46  <Field RecyclerView$ItemAnimator$ItemAnimatorListener mListener>
	//*   5    9:ifnull          22
			mListener.onAnimationFinished(viewholder);
	//    6   12:aload_0         
	//    7   13:getfield        #46  <Field RecyclerView$ItemAnimator$ItemAnimatorListener mListener>
	//    8   16:aload_1         
	//    9   17:invokeinterface #104 <Method void RecyclerView$ItemAnimator$ItemAnimatorListener.onAnimationFinished(RecyclerView$ViewHolder)>
	//   10   22:return          
	}

	public final void dispatchAnimationStarted(RecyclerView.ViewHolder viewholder)
	{
		onAnimationStarted(viewholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #108 <Method void onAnimationStarted(RecyclerView$ViewHolder)>
	//    3    5:return          
	}

	public final void dispatchAnimationsFinished()
	{
		int j = mFinishedListeners.size();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ArrayList mFinishedListeners>
	//    2    4:invokevirtual   #112 <Method int ArrayList.size()>
	//    3    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          38
			((ItemAnimatorFinishedListener)mFinishedListeners.get(i)).onAnimationsFinished();
	//    9   15:aload_0         
	//   10   16:getfield        #51  <Field ArrayList mFinishedListeners>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #116 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #12  <Class RecyclerView$ItemAnimator$ItemAnimatorFinishedListener>
	//   14   26:invokeinterface #119 <Method void RecyclerView$ItemAnimator$ItemAnimatorFinishedListener.onAnimationsFinished()>

	//   15   31:iload_1         
	//   16   32:iconst_1        
	//   17   33:iadd            
	//   18   34:istore_1        
	//*  19   35:goto            10
		mFinishedListeners.clear();
	//   20   38:aload_0         
	//   21   39:getfield        #51  <Field ArrayList mFinishedListeners>
	//   22   42:invokevirtual   #122 <Method void ArrayList.clear()>
	//   23   45:return          
	}

	public abstract void endAnimation(RecyclerView.ViewHolder viewholder);

	public abstract void endAnimations();

	public long getAddDuration()
	{
		return mAddDuration;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field long mAddDuration>
	//    2    4:lreturn         
	}

	public long getChangeDuration()
	{
		return mChangeDuration;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field long mChangeDuration>
	//    2    4:lreturn         
	}

	public long getMoveDuration()
	{
		return mMoveDuration;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field long mMoveDuration>
	//    2    4:lreturn         
	}

	public long getRemoveDuration()
	{
		return mRemoveDuration;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field long mRemoveDuration>
	//    2    4:lreturn         
	}

	public abstract boolean isRunning();

	public final boolean isRunning(ItemAnimatorFinishedListener itemanimatorfinishedlistener)
	{
		boolean flag;
label0:
		{
			flag = isRunning();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #133 <Method boolean isRunning()>
	//    2    4:istore_2        
			if(itemanimatorfinishedlistener != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          19
			{
				if(flag)
					break label0;
	//    5    9:iload_2         
	//    6   10:ifne            21
				itemanimatorfinishedlistener.onAnimationsFinished();
	//    7   13:aload_1         
	//    8   14:invokeinterface #119 <Method void RecyclerView$ItemAnimator$ItemAnimatorFinishedListener.onAnimationsFinished()>
			}
			return flag;
	//    9   19:iload_2         
	//   10   20:ireturn         
		}
		mFinishedListeners.add(((Object) (itemanimatorfinishedlistener)));
	//   11   21:aload_0         
	//   12   22:getfield        #51  <Field ArrayList mFinishedListeners>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #137 <Method boolean ArrayList.add(Object)>
	//   15   29:pop             
		return flag;
	//   16   30:iload_2         
	//   17   31:ireturn         
	}

	public ItemHolderInfo obtainHolderInfo()
	{
		return new ItemHolderInfo();
	//    0    0:new             #18  <Class RecyclerView$ItemAnimator$ItemHolderInfo>
	//    1    3:dup             
	//    2    4:invokespecial   #140 <Method void RecyclerView$ItemAnimator$ItemHolderInfo()>
	//    3    7:areturn         
	}

	public void onAnimationFinished(RecyclerView.ViewHolder viewholder)
	{
	//    0    0:return          
	}

	public void onAnimationStarted(RecyclerView.ViewHolder viewholder)
	{
	//    0    0:return          
	}

	public ItemHolderInfo recordPostLayoutInformation(RecyclerView.State state, RecyclerView.ViewHolder viewholder)
	{
		return obtainHolderInfo().setFrom(viewholder);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #144 <Method RecyclerView$ItemAnimator$ItemHolderInfo obtainHolderInfo()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #148 <Method RecyclerView$ItemAnimator$ItemHolderInfo RecyclerView$ItemAnimator$ItemHolderInfo.setFrom(RecyclerView$ViewHolder)>
	//    4    8:areturn         
	}

	public ItemHolderInfo recordPreLayoutInformation(RecyclerView.State state, RecyclerView.ViewHolder viewholder, int i, List list)
	{
		return obtainHolderInfo().setFrom(viewholder);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #144 <Method RecyclerView$ItemAnimator$ItemHolderInfo obtainHolderInfo()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #148 <Method RecyclerView$ItemAnimator$ItemHolderInfo RecyclerView$ItemAnimator$ItemHolderInfo.setFrom(RecyclerView$ViewHolder)>
	//    4    8:areturn         
	}

	public abstract void runPendingAnimations();

	public void setAddDuration(long l)
	{
		mAddDuration = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #55  <Field long mAddDuration>
	//    3    5:return          
	}

	public void setChangeDuration(long l)
	{
		mChangeDuration = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #63  <Field long mChangeDuration>
	//    3    5:return          
	}

	void setListener(ItemAnimatorListener itemanimatorlistener)
	{
		mListener = itemanimatorlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field RecyclerView$ItemAnimator$ItemAnimatorListener mListener>
	//    3    5:return          
	}

	public void setMoveDuration(long l)
	{
		mMoveDuration = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #61  <Field long mMoveDuration>
	//    3    5:return          
	}

	public void setRemoveDuration(long l)
	{
		mRemoveDuration = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #57  <Field long mRemoveDuration>
	//    3    5:return          
	}

	public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
	public static final int FLAG_CHANGED = 2;
	public static final int FLAG_INVALIDATED = 4;
	public static final int FLAG_MOVED = 2048;
	public static final int FLAG_REMOVED = 8;
	private long mAddDuration;
	private long mChangeDuration;
	private ArrayList mFinishedListeners;
	private ItemAnimatorListener mListener;
	private long mMoveDuration;
	private long mRemoveDuration;

	public RecyclerView$ItemAnimator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		mListener = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #46  <Field RecyclerView$ItemAnimator$ItemAnimatorListener mListener>
		mFinishedListeners = new ArrayList();
	//    5    9:aload_0         
	//    6   10:new             #48  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #49  <Method void ArrayList()>
	//    9   17:putfield        #51  <Field ArrayList mFinishedListeners>
		mAddDuration = 120L;
	//   10   20:aload_0         
	//   11   21:ldc2w           #52  <Long 120L>
	//   12   24:putfield        #55  <Field long mAddDuration>
		mRemoveDuration = 120L;
	//   13   27:aload_0         
	//   14   28:ldc2w           #52  <Long 120L>
	//   15   31:putfield        #57  <Field long mRemoveDuration>
		mMoveDuration = 250L;
	//   16   34:aload_0         
	//   17   35:ldc2w           #58  <Long 250L>
	//   18   38:putfield        #61  <Field long mMoveDuration>
		mChangeDuration = 250L;
	//   19   41:aload_0         
	//   20   42:ldc2w           #58  <Long 250L>
	//   21   45:putfield        #63  <Field long mChangeDuration>
	//   22   48:return          
	}
}
