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
		//    1    1:getfield        #34  <Field View RecyclerView$ViewHolder.itemView>
		//    2    4:astore_1        
			left = ((View) (viewholder)).getLeft();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #40  <Method int View.getLeft()>
		//    6   10:putfield        #42  <Field int left>
			top = ((View) (viewholder)).getTop();
		//    7   13:aload_0         
		//    8   14:aload_1         
		//    9   15:invokevirtual   #45  <Method int View.getTop()>
		//   10   18:putfield        #47  <Field int top>
			right = ((View) (viewholder)).getRight();
		//   11   21:aload_0         
		//   12   22:aload_1         
		//   13   23:invokevirtual   #50  <Method int View.getRight()>
		//   14   26:putfield        #52  <Field int right>
			bottom = ((View) (viewholder)).getBottom();
		//   15   29:aload_0         
		//   16   30:aload_1         
		//   17   31:invokevirtual   #55  <Method int View.getBottom()>
		//   18   34:putfield        #57  <Field int bottom>
			return this;
		//   19   37:aload_0         
		//   20   38:areturn         
		}

		public int bottom;
		public int left;
		public int right;
		public int top;

		public ItemHolderInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}
	}


	static int buildAdapterChangeFlagsForAnimations(RecyclerView.ViewHolder viewholder)
	{
		int j = viewholder.mFlags & 0xe;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int RecyclerView$ViewHolder.mFlags>
	//    2    4:bipush          14
	//    3    6:iand            
	//    4    7:istore_2        
		if(viewholder.isInvalid())
	//*   5    8:aload_0         
	//*   6    9:invokevirtual   #65  <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//*   7   12:ifeq            17
			return 4;
	//    8   15:iconst_4        
	//    9   16:ireturn         
		int i = j;
	//   10   17:iload_2         
	//   11   18:istore_1        
		if((j & 4) == 0)
	//*  12   19:iload_2         
	//*  13   20:iconst_4        
	//*  14   21:iand            
	//*  15   22:ifne            65
		{
			int k = viewholder.getOldPosition();
	//   16   25:aload_0         
	//   17   26:invokevirtual   #69  <Method int RecyclerView$ViewHolder.getOldPosition()>
	//   18   29:istore_3        
			int l = viewholder.getAdapterPosition();
	//   19   30:aload_0         
	//   20   31:invokevirtual   #72  <Method int RecyclerView$ViewHolder.getAdapterPosition()>
	//   21   34:istore          4
			i = j;
	//   22   36:iload_2         
	//   23   37:istore_1        
			if(k != -1)
	//*  24   38:iload_3         
	//*  25   39:iconst_m1       
	//*  26   40:icmpeq          65
			{
				i = j;
	//   27   43:iload_2         
	//   28   44:istore_1        
				if(l != -1)
	//*  29   45:iload           4
	//*  30   47:iconst_m1       
	//*  31   48:icmpeq          65
				{
					i = j;
	//   32   51:iload_2         
	//   33   52:istore_1        
					if(k != l)
	//*  34   53:iload_3         
	//*  35   54:iload           4
	//*  36   56:icmpeq          65
						i = j | 0x800;
	//   37   59:iload_2         
	//   38   60:sipush          2048
	//   39   63:ior             
	//   40   64:istore_1        
				}
			}
		}
		return i;
	//   41   65:iload_1         
	//   42   66:ireturn         
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
	//    2    2:invokevirtual   #86  <Method boolean canReuseUpdatedViewHolder(RecyclerView$ViewHolder)>
	//    3    5:ireturn         
	}

	public final void dispatchAnimationFinished(RecyclerView.ViewHolder viewholder)
	{
		onAnimationFinished(viewholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #93  <Method void onAnimationFinished(RecyclerView$ViewHolder)>
		ItemAnimatorListener itemanimatorlistener = mListener;
	//    3    5:aload_0         
	//    4    6:getfield        #35  <Field RecyclerView$ItemAnimator$ItemAnimatorListener mListener>
	//    5    9:astore_2        
		if(itemanimatorlistener != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          21
			itemanimatorlistener.onAnimationFinished(viewholder);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:invokeinterface #94  <Method void RecyclerView$ItemAnimator$ItemAnimatorListener.onAnimationFinished(RecyclerView$ViewHolder)>
	//   11   21:return          
	}

	public final void dispatchAnimationsFinished()
	{
		int j = mFinishedListeners.size();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field ArrayList mFinishedListeners>
	//    2    4:invokevirtual   #98  <Method int ArrayList.size()>
	//    3    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          38
			((ItemAnimatorFinishedListener)mFinishedListeners.get(i)).onAnimationsFinished();
	//    9   15:aload_0         
	//   10   16:getfield        #40  <Field ArrayList mFinishedListeners>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #102 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #12  <Class RecyclerView$ItemAnimator$ItemAnimatorFinishedListener>
	//   14   26:invokeinterface #105 <Method void RecyclerView$ItemAnimator$ItemAnimatorFinishedListener.onAnimationsFinished()>

	//   15   31:iload_1         
	//   16   32:iconst_1        
	//   17   33:iadd            
	//   18   34:istore_1        
	//*  19   35:goto            10
		mFinishedListeners.clear();
	//   20   38:aload_0         
	//   21   39:getfield        #40  <Field ArrayList mFinishedListeners>
	//   22   42:invokevirtual   #108 <Method void ArrayList.clear()>
	//   23   45:return          
	}

	public abstract void endAnimation(RecyclerView.ViewHolder viewholder);

	public abstract void endAnimations();

	public long getAddDuration()
	{
		return mAddDuration;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field long mAddDuration>
	//    2    4:lreturn         
	}

	public long getChangeDuration()
	{
		return mChangeDuration;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field long mChangeDuration>
	//    2    4:lreturn         
	}

	public long getMoveDuration()
	{
		return mMoveDuration;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field long mMoveDuration>
	//    2    4:lreturn         
	}

	public long getRemoveDuration()
	{
		return mRemoveDuration;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field long mRemoveDuration>
	//    2    4:lreturn         
	}

	public abstract boolean isRunning();

	public final boolean isRunning(ItemAnimatorFinishedListener itemanimatorfinishedlistener)
	{
		boolean flag = isRunning();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #119 <Method boolean isRunning()>
	//    2    4:istore_2        
		if(itemanimatorfinishedlistener != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          30
		{
			if(!flag)
	//*   5    9:iload_2         
	//*   6   10:ifne            21
			{
				itemanimatorfinishedlistener.onAnimationsFinished();
	//    7   13:aload_1         
	//    8   14:invokeinterface #105 <Method void RecyclerView$ItemAnimator$ItemAnimatorFinishedListener.onAnimationsFinished()>
				return flag;
	//    9   19:iload_2         
	//   10   20:ireturn         
			}
			mFinishedListeners.add(((Object) (itemanimatorfinishedlistener)));
	//   11   21:aload_0         
	//   12   22:getfield        #40  <Field ArrayList mFinishedListeners>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #123 <Method boolean ArrayList.add(Object)>
	//   15   29:pop             
		}
		return flag;
	//   16   30:iload_2         
	//   17   31:ireturn         
	}

	public ItemHolderInfo obtainHolderInfo()
	{
		return new ItemHolderInfo();
	//    0    0:new             #18  <Class RecyclerView$ItemAnimator$ItemHolderInfo>
	//    1    3:dup             
	//    2    4:invokespecial   #126 <Method void RecyclerView$ItemAnimator$ItemHolderInfo()>
	//    3    7:areturn         
	}

	public void onAnimationFinished(RecyclerView.ViewHolder viewholder)
	{
	//    0    0:return          
	}

	public ItemHolderInfo recordPostLayoutInformation(RecyclerView.State state, RecyclerView.ViewHolder viewholder)
	{
		return obtainHolderInfo().setFrom(viewholder);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #131 <Method RecyclerView$ItemAnimator$ItemHolderInfo obtainHolderInfo()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #135 <Method RecyclerView$ItemAnimator$ItemHolderInfo RecyclerView$ItemAnimator$ItemHolderInfo.setFrom(RecyclerView$ViewHolder)>
	//    4    8:areturn         
	}

	public ItemHolderInfo recordPreLayoutInformation(RecyclerView.State state, RecyclerView.ViewHolder viewholder, int i, List list)
	{
		return obtainHolderInfo().setFrom(viewholder);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #131 <Method RecyclerView$ItemAnimator$ItemHolderInfo obtainHolderInfo()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #135 <Method RecyclerView$ItemAnimator$ItemHolderInfo RecyclerView$ItemAnimator$ItemHolderInfo.setFrom(RecyclerView$ViewHolder)>
	//    4    8:areturn         
	}

	public abstract void runPendingAnimations();

	void setListener(ItemAnimatorListener itemanimatorlistener)
	{
		mListener = itemanimatorlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field RecyclerView$ItemAnimator$ItemAnimatorListener mListener>
	//    3    5:return          
	}

	private long mAddDuration;
	private long mChangeDuration;
	private ArrayList mFinishedListeners;
	private ItemAnimatorListener mListener;
	private long mMoveDuration;
	private long mRemoveDuration;

	public RecyclerView$ItemAnimator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		mListener = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #35  <Field RecyclerView$ItemAnimator$ItemAnimatorListener mListener>
		mFinishedListeners = new ArrayList();
	//    5    9:aload_0         
	//    6   10:new             #37  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #38  <Method void ArrayList()>
	//    9   17:putfield        #40  <Field ArrayList mFinishedListeners>
		mAddDuration = 120L;
	//   10   20:aload_0         
	//   11   21:ldc2w           #41  <Long 120L>
	//   12   24:putfield        #44  <Field long mAddDuration>
		mRemoveDuration = 120L;
	//   13   27:aload_0         
	//   14   28:ldc2w           #41  <Long 120L>
	//   15   31:putfield        #46  <Field long mRemoveDuration>
		mMoveDuration = 250L;
	//   16   34:aload_0         
	//   17   35:ldc2w           #47  <Long 250L>
	//   18   38:putfield        #50  <Field long mMoveDuration>
		mChangeDuration = 250L;
	//   19   41:aload_0         
	//   20   42:ldc2w           #47  <Long 250L>
	//   21   45:putfield        #52  <Field long mChangeDuration>
	//   22   48:return          
	}
}
