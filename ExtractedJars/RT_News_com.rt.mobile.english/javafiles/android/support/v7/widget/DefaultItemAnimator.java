// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.animation.*;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.*;

// Referenced classes of package android.support.v7.widget:
//			SimpleItemAnimator

public class DefaultItemAnimator extends SimpleItemAnimator
{
	private static class ChangeInfo
	{

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #40  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #41  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("ChangeInfo{oldHolder=");
		//    4    8:aload_1         
		//    5    9:ldc1            #43  <String "ChangeInfo{oldHolder=">
		//    6   11:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(((Object) (oldHolder)));
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #22  <Field RecyclerView$ViewHolder oldHolder>
		//   11   20:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
		//   12   23:pop             
			stringbuilder.append(", newHolder=");
		//   13   24:aload_1         
		//   14   25:ldc1            #52  <String ", newHolder=">
		//   15   27:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   16   30:pop             
			stringbuilder.append(((Object) (newHolder)));
		//   17   31:aload_1         
		//   18   32:aload_0         
		//   19   33:getfield        #24  <Field RecyclerView$ViewHolder newHolder>
		//   20   36:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
		//   21   39:pop             
			stringbuilder.append(", fromX=");
		//   22   40:aload_1         
		//   23   41:ldc1            #54  <String ", fromX=">
		//   24   43:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   25   46:pop             
			stringbuilder.append(fromX);
		//   26   47:aload_1         
		//   27   48:aload_0         
		//   28   49:getfield        #30  <Field int fromX>
		//   29   52:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
		//   30   55:pop             
			stringbuilder.append(", fromY=");
		//   31   56:aload_1         
		//   32   57:ldc1            #59  <String ", fromY=">
		//   33   59:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   34   62:pop             
			stringbuilder.append(fromY);
		//   35   63:aload_1         
		//   36   64:aload_0         
		//   37   65:getfield        #32  <Field int fromY>
		//   38   68:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
		//   39   71:pop             
			stringbuilder.append(", toX=");
		//   40   72:aload_1         
		//   41   73:ldc1            #61  <String ", toX=">
		//   42   75:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   43   78:pop             
			stringbuilder.append(toX);
		//   44   79:aload_1         
		//   45   80:aload_0         
		//   46   81:getfield        #34  <Field int toX>
		//   47   84:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
		//   48   87:pop             
			stringbuilder.append(", toY=");
		//   49   88:aload_1         
		//   50   89:ldc1            #63  <String ", toY=">
		//   51   91:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   52   94:pop             
			stringbuilder.append(toY);
		//   53   95:aload_1         
		//   54   96:aload_0         
		//   55   97:getfield        #36  <Field int toY>
		//   56  100:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
		//   57  103:pop             
			stringbuilder.append('}');
		//   58  104:aload_1         
		//   59  105:bipush          125
		//   60  107:invokevirtual   #66  <Method StringBuilder StringBuilder.append(char)>
		//   61  110:pop             
			return stringbuilder.toString();
		//   62  111:aload_1         
		//   63  112:invokevirtual   #68  <Method String StringBuilder.toString()>
		//   64  115:areturn         
		}

		public int fromX;
		public int fromY;
		public RecyclerView.ViewHolder newHolder;
		public RecyclerView.ViewHolder oldHolder;
		public int toX;
		public int toY;

		private ChangeInfo(RecyclerView.ViewHolder viewholder, RecyclerView.ViewHolder viewholder1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			oldHolder = viewholder;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field RecyclerView$ViewHolder oldHolder>
			newHolder = viewholder1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field RecyclerView$ViewHolder newHolder>
		//    8   14:return          
		}

		ChangeInfo(RecyclerView.ViewHolder viewholder, RecyclerView.ViewHolder viewholder1, int i, int j, int k, int l)
		{
			this(viewholder, viewholder1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #28  <Method void DefaultItemAnimator$ChangeInfo(RecyclerView$ViewHolder, RecyclerView$ViewHolder)>
			fromX = i;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #30  <Field int fromX>
			fromY = j;
		//    7   11:aload_0         
		//    8   12:iload           4
		//    9   14:putfield        #32  <Field int fromY>
			toX = k;
		//   10   17:aload_0         
		//   11   18:iload           5
		//   12   20:putfield        #34  <Field int toX>
			toY = l;
		//   13   23:aload_0         
		//   14   24:iload           6
		//   15   26:putfield        #36  <Field int toY>
		//   16   29:return          
		}
	}

	private static class MoveInfo
	{

		public int fromX;
		public int fromY;
		public RecyclerView.ViewHolder holder;
		public int toX;
		public int toY;

		MoveInfo(RecyclerView.ViewHolder viewholder, int i, int j, int k, int l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			holder = viewholder;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field RecyclerView$ViewHolder holder>
			fromX = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #23  <Field int fromX>
			fromY = j;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #25  <Field int fromY>
			toX = k;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #27  <Field int toX>
			toY = l;
		//   14   25:aload_0         
		//   15   26:iload           5
		//   16   28:putfield        #29  <Field int toY>
		//   17   31:return          
		}
	}


	public DefaultItemAnimator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void SimpleItemAnimator()>
		mPendingRemovals = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #55  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #56  <Method void ArrayList()>
	//    6   12:putfield        #58  <Field ArrayList mPendingRemovals>
		mPendingAdditions = new ArrayList();
	//    7   15:aload_0         
	//    8   16:new             #55  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #56  <Method void ArrayList()>
	//   11   23:putfield        #60  <Field ArrayList mPendingAdditions>
		mPendingMoves = new ArrayList();
	//   12   26:aload_0         
	//   13   27:new             #55  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #56  <Method void ArrayList()>
	//   16   34:putfield        #62  <Field ArrayList mPendingMoves>
		mPendingChanges = new ArrayList();
	//   17   37:aload_0         
	//   18   38:new             #55  <Class ArrayList>
	//   19   41:dup             
	//   20   42:invokespecial   #56  <Method void ArrayList()>
	//   21   45:putfield        #64  <Field ArrayList mPendingChanges>
		mAdditionsList = new ArrayList();
	//   22   48:aload_0         
	//   23   49:new             #55  <Class ArrayList>
	//   24   52:dup             
	//   25   53:invokespecial   #56  <Method void ArrayList()>
	//   26   56:putfield        #66  <Field ArrayList mAdditionsList>
		mMovesList = new ArrayList();
	//   27   59:aload_0         
	//   28   60:new             #55  <Class ArrayList>
	//   29   63:dup             
	//   30   64:invokespecial   #56  <Method void ArrayList()>
	//   31   67:putfield        #68  <Field ArrayList mMovesList>
		mChangesList = new ArrayList();
	//   32   70:aload_0         
	//   33   71:new             #55  <Class ArrayList>
	//   34   74:dup             
	//   35   75:invokespecial   #56  <Method void ArrayList()>
	//   36   78:putfield        #70  <Field ArrayList mChangesList>
		mAddAnimations = new ArrayList();
	//   37   81:aload_0         
	//   38   82:new             #55  <Class ArrayList>
	//   39   85:dup             
	//   40   86:invokespecial   #56  <Method void ArrayList()>
	//   41   89:putfield        #72  <Field ArrayList mAddAnimations>
		mMoveAnimations = new ArrayList();
	//   42   92:aload_0         
	//   43   93:new             #55  <Class ArrayList>
	//   44   96:dup             
	//   45   97:invokespecial   #56  <Method void ArrayList()>
	//   46  100:putfield        #74  <Field ArrayList mMoveAnimations>
		mRemoveAnimations = new ArrayList();
	//   47  103:aload_0         
	//   48  104:new             #55  <Class ArrayList>
	//   49  107:dup             
	//   50  108:invokespecial   #56  <Method void ArrayList()>
	//   51  111:putfield        #76  <Field ArrayList mRemoveAnimations>
		mChangeAnimations = new ArrayList();
	//   52  114:aload_0         
	//   53  115:new             #55  <Class ArrayList>
	//   54  118:dup             
	//   55  119:invokespecial   #56  <Method void ArrayList()>
	//   56  122:putfield        #78  <Field ArrayList mChangeAnimations>
	//   57  125:return          
	}

	private void animateRemoveImpl(final RecyclerView.ViewHolder holder)
	{
		final View view = holder.itemView;
	//    0    0:aload_1         
	//    1    1:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//    2    4:astore_2        
		final ViewPropertyAnimator animation = view.animate();
	//    3    5:aload_2         
	//    4    6:invokevirtual   #93  <Method ViewPropertyAnimator View.animate()>
	//    5    9:astore_3        
		mRemoveAnimations.add(((Object) (holder)));
	//    6   10:aload_0         
	//    7   11:getfield        #76  <Field ArrayList mRemoveAnimations>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #97  <Method boolean ArrayList.add(Object)>
	//   10   18:pop             
		animation.setDuration(getRemoveDuration()).alpha(0.0F).setListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

			public void onAnimationEnd(Animator animator)
			{
				animation.setListener(((android.animation.Animator.AnimatorListener) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #25  <Field ViewPropertyAnimator val$animation>
			//    2    4:aconst_null     
			//    3    5:invokevirtual   #39  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
			//    4    8:pop             
				view.setAlpha(1.0F);
			//    5    9:aload_0         
			//    6   10:getfield        #27  <Field View val$view>
			//    7   13:fconst_1        
			//    8   14:invokevirtual   #45  <Method void View.setAlpha(float)>
				dispatchRemoveFinished(holder);
			//    9   17:aload_0         
			//   10   18:getfield        #21  <Field DefaultItemAnimator this$0>
			//   11   21:aload_0         
			//   12   22:getfield        #23  <Field RecyclerView$ViewHolder val$holder>
			//   13   25:invokevirtual   #48  <Method void DefaultItemAnimator.dispatchRemoveFinished(RecyclerView$ViewHolder)>
				mRemoveAnimations.remove(((Object) (holder)));
			//   14   28:aload_0         
			//   15   29:getfield        #21  <Field DefaultItemAnimator this$0>
			//   16   32:getfield        #52  <Field ArrayList DefaultItemAnimator.mRemoveAnimations>
			//   17   35:aload_0         
			//   18   36:getfield        #23  <Field RecyclerView$ViewHolder val$holder>
			//   19   39:invokevirtual   #58  <Method boolean ArrayList.remove(Object)>
			//   20   42:pop             
				dispatchFinishedWhenDone();
			//   21   43:aload_0         
			//   22   44:getfield        #21  <Field DefaultItemAnimator this$0>
			//   23   47:invokevirtual   #61  <Method void DefaultItemAnimator.dispatchFinishedWhenDone()>
			//   24   50:return          
			}

			public void onAnimationStart(Animator animator)
			{
				dispatchRemoveStarting(holder);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field DefaultItemAnimator this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #23  <Field RecyclerView$ViewHolder val$holder>
			//    4    8:invokevirtual   #65  <Method void DefaultItemAnimator.dispatchRemoveStarting(RecyclerView$ViewHolder)>
			//    5   11:return          
			}

			final DefaultItemAnimator this$0;
			final ViewPropertyAnimator val$animation;
			final RecyclerView.ViewHolder val$holder;
			final View val$view;

			
			{
				this$0 = DefaultItemAnimator.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field DefaultItemAnimator this$0>
				holder = viewholder;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field RecyclerView$ViewHolder val$holder>
				animation = viewpropertyanimator;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field ViewPropertyAnimator val$animation>
				view = view1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #27  <Field View val$view>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #30  <Method void AnimatorListenerAdapter()>
			//   14   25:return          
			}
		}
))).start();
	//   11   19:aload_3         
	//   12   20:aload_0         
	//   13   21:invokevirtual   #101 <Method long getRemoveDuration()>
	//   14   24:invokevirtual   #107 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   15   27:fconst_0        
	//   16   28:invokevirtual   #111 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   17   31:new             #12  <Class DefaultItemAnimator$4>
	//   18   34:dup             
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:aload_3         
	//   22   38:aload_2         
	//   23   39:invokespecial   #114 <Method void DefaultItemAnimator$4(DefaultItemAnimator, RecyclerView$ViewHolder, ViewPropertyAnimator, View)>
	//   24   42:invokevirtual   #118 <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   25   45:invokevirtual   #121 <Method void ViewPropertyAnimator.start()>
	//   26   48:return          
	}

	private void endChangeAnimation(List list, RecyclerView.ViewHolder viewholder)
	{
		for(int i = list.size() - 1; i >= 0; i--)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #129 <Method int List.size()>
	//*   2    6:iconst_1        
	//*   3    7:isub            
	//*   4    8:istore_3        
	//*   5    9:iload_3         
	//*   6   10:iflt            67
		{
			ChangeInfo changeinfo = (ChangeInfo)list.get(i);
	//    7   13:aload_1         
	//    8   14:iload_3         
	//    9   15:invokeinterface #133 <Method Object List.get(int)>
	//   10   20:checkcast       #22  <Class DefaultItemAnimator$ChangeInfo>
	//   11   23:astore          4
			if(endChangeAnimationIfNecessary(changeinfo, viewholder) && changeinfo.oldHolder == null && changeinfo.newHolder == null)
	//*  12   25:aload_0         
	//*  13   26:aload           4
	//*  14   28:aload_2         
	//*  15   29:invokespecial   #137 <Method boolean endChangeAnimationIfNecessary(DefaultItemAnimator$ChangeInfo, RecyclerView$ViewHolder)>
	//*  16   32:ifeq            60
	//*  17   35:aload           4
	//*  18   37:getfield        #141 <Field RecyclerView$ViewHolder DefaultItemAnimator$ChangeInfo.oldHolder>
	//*  19   40:ifnonnull       60
	//*  20   43:aload           4
	//*  21   45:getfield        #144 <Field RecyclerView$ViewHolder DefaultItemAnimator$ChangeInfo.newHolder>
	//*  22   48:ifnonnull       60
				list.remove(((Object) (changeinfo)));
	//   23   51:aload_1         
	//   24   52:aload           4
	//   25   54:invokeinterface #147 <Method boolean List.remove(Object)>
	//   26   59:pop             
		}

	//   27   60:iload_3         
	//   28   61:iconst_1        
	//   29   62:isub            
	//   30   63:istore_3        
	//*  31   64:goto            9
	//   32   67:return          
	}

	private void endChangeAnimationIfNecessary(ChangeInfo changeinfo)
	{
		if(changeinfo.oldHolder != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #141 <Field RecyclerView$ViewHolder DefaultItemAnimator$ChangeInfo.oldHolder>
	//*   2    4:ifnull          17
			endChangeAnimationIfNecessary(changeinfo, changeinfo.oldHolder);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_1         
	//    6   10:getfield        #141 <Field RecyclerView$ViewHolder DefaultItemAnimator$ChangeInfo.oldHolder>
	//    7   13:invokespecial   #137 <Method boolean endChangeAnimationIfNecessary(DefaultItemAnimator$ChangeInfo, RecyclerView$ViewHolder)>
	//    8   16:pop             
		if(changeinfo.newHolder != null)
	//*   9   17:aload_1         
	//*  10   18:getfield        #144 <Field RecyclerView$ViewHolder DefaultItemAnimator$ChangeInfo.newHolder>
	//*  11   21:ifnull          34
			endChangeAnimationIfNecessary(changeinfo, changeinfo.newHolder);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:aload_1         
	//   15   27:getfield        #144 <Field RecyclerView$ViewHolder DefaultItemAnimator$ChangeInfo.newHolder>
	//   16   30:invokespecial   #137 <Method boolean endChangeAnimationIfNecessary(DefaultItemAnimator$ChangeInfo, RecyclerView$ViewHolder)>
	//   17   33:pop             
	//   18   34:return          
	}

	private boolean endChangeAnimationIfNecessary(ChangeInfo changeinfo, RecyclerView.ViewHolder viewholder)
	{
label0:
		{
			RecyclerView.ViewHolder viewholder1 = changeinfo.newHolder;
	//    0    0:aload_1         
	//    1    1:getfield        #144 <Field RecyclerView$ViewHolder DefaultItemAnimator$ChangeInfo.newHolder>
	//    2    4:astore          4
			boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
			if(viewholder1 == viewholder)
	//*   5    8:aload           4
	//*   6   10:aload_2         
	//*   7   11:if_acmpne       22
			{
				changeinfo.newHolder = null;
	//    8   14:aload_1         
	//    9   15:aconst_null     
	//   10   16:putfield        #144 <Field RecyclerView$ViewHolder DefaultItemAnimator$ChangeInfo.newHolder>
			} else
	//*  11   19:goto            37
			{
				if(changeinfo.oldHolder != viewholder)
					break label0;
	//   12   22:aload_1         
	//   13   23:getfield        #141 <Field RecyclerView$ViewHolder DefaultItemAnimator$ChangeInfo.oldHolder>
	//   14   26:aload_2         
	//   15   27:if_acmpne       69
				changeinfo.oldHolder = null;
	//   16   30:aload_1         
	//   17   31:aconst_null     
	//   18   32:putfield        #141 <Field RecyclerView$ViewHolder DefaultItemAnimator$ChangeInfo.oldHolder>
				flag = true;
	//   19   35:iconst_1        
	//   20   36:istore_3        
			}
			viewholder.itemView.setAlpha(1.0F);
	//   21   37:aload_2         
	//   22   38:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//   23   41:fconst_1        
	//   24   42:invokevirtual   #154 <Method void View.setAlpha(float)>
			viewholder.itemView.setTranslationX(0.0F);
	//   25   45:aload_2         
	//   26   46:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//   27   49:fconst_0        
	//   28   50:invokevirtual   #157 <Method void View.setTranslationX(float)>
			viewholder.itemView.setTranslationY(0.0F);
	//   29   53:aload_2         
	//   30   54:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//   31   57:fconst_0        
	//   32   58:invokevirtual   #160 <Method void View.setTranslationY(float)>
			dispatchChangeFinished(viewholder, flag);
	//   33   61:aload_0         
	//   34   62:aload_2         
	//   35   63:iload_3         
	//   36   64:invokevirtual   #164 <Method void dispatchChangeFinished(RecyclerView$ViewHolder, boolean)>
			return true;
	//   37   67:iconst_1        
	//   38   68:ireturn         
		}
		return false;
	//   39   69:iconst_0        
	//   40   70:ireturn         
	}

	private void resetAnimation(RecyclerView.ViewHolder viewholder)
	{
		if(sDefaultInterpolator == null)
	//*   0    0:getstatic       #167 <Field TimeInterpolator sDefaultInterpolator>
	//*   1    3:ifnonnull       19
			sDefaultInterpolator = (new ValueAnimator()).getInterpolator();
	//    2    6:new             #169 <Class ValueAnimator>
	//    3    9:dup             
	//    4   10:invokespecial   #170 <Method void ValueAnimator()>
	//    5   13:invokevirtual   #174 <Method TimeInterpolator ValueAnimator.getInterpolator()>
	//    6   16:putstatic       #167 <Field TimeInterpolator sDefaultInterpolator>
		viewholder.itemView.animate().setInterpolator(sDefaultInterpolator);
	//    7   19:aload_1         
	//    8   20:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//    9   23:invokevirtual   #93  <Method ViewPropertyAnimator View.animate()>
	//   10   26:getstatic       #167 <Field TimeInterpolator sDefaultInterpolator>
	//   11   29:invokevirtual   #178 <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(TimeInterpolator)>
	//   12   32:pop             
		endAnimation(viewholder);
	//   13   33:aload_0         
	//   14   34:aload_1         
	//   15   35:invokevirtual   #181 <Method void endAnimation(RecyclerView$ViewHolder)>
	//   16   38:return          
	}

	public boolean animateAdd(RecyclerView.ViewHolder viewholder)
	{
		resetAnimation(viewholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #185 <Method void resetAnimation(RecyclerView$ViewHolder)>
		viewholder.itemView.setAlpha(0.0F);
	//    3    5:aload_1         
	//    4    6:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//    5    9:fconst_0        
	//    6   10:invokevirtual   #154 <Method void View.setAlpha(float)>
		mPendingAdditions.add(((Object) (viewholder)));
	//    7   13:aload_0         
	//    8   14:getfield        #60  <Field ArrayList mPendingAdditions>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #97  <Method boolean ArrayList.add(Object)>
	//   11   21:pop             
		return true;
	//   12   22:iconst_1        
	//   13   23:ireturn         
	}

	void animateAddImpl(final RecyclerView.ViewHolder holder)
	{
		final View view = holder.itemView;
	//    0    0:aload_1         
	//    1    1:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//    2    4:astore_2        
		final ViewPropertyAnimator animation = view.animate();
	//    3    5:aload_2         
	//    4    6:invokevirtual   #93  <Method ViewPropertyAnimator View.animate()>
	//    5    9:astore_3        
		mAddAnimations.add(((Object) (holder)));
	//    6   10:aload_0         
	//    7   11:getfield        #72  <Field ArrayList mAddAnimations>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #97  <Method boolean ArrayList.add(Object)>
	//   10   18:pop             
		animation.alpha(1.0F).setDuration(getAddDuration()).setListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

			public void onAnimationCancel(Animator animator)
			{
				view.setAlpha(1.0F);
			//    0    0:aload_0         
			//    1    1:getfield        #25  <Field View val$view>
			//    2    4:fconst_1        
			//    3    5:invokevirtual   #39  <Method void View.setAlpha(float)>
			//    4    8:return          
			}

			public void onAnimationEnd(Animator animator)
			{
				animation.setListener(((android.animation.Animator.AnimatorListener) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #27  <Field ViewPropertyAnimator val$animation>
			//    2    4:aconst_null     
			//    3    5:invokevirtual   #46  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
			//    4    8:pop             
				dispatchAddFinished(holder);
			//    5    9:aload_0         
			//    6   10:getfield        #21  <Field DefaultItemAnimator this$0>
			//    7   13:aload_0         
			//    8   14:getfield        #23  <Field RecyclerView$ViewHolder val$holder>
			//    9   17:invokevirtual   #49  <Method void DefaultItemAnimator.dispatchAddFinished(RecyclerView$ViewHolder)>
				mAddAnimations.remove(((Object) (holder)));
			//   10   20:aload_0         
			//   11   21:getfield        #21  <Field DefaultItemAnimator this$0>
			//   12   24:getfield        #53  <Field ArrayList DefaultItemAnimator.mAddAnimations>
			//   13   27:aload_0         
			//   14   28:getfield        #23  <Field RecyclerView$ViewHolder val$holder>
			//   15   31:invokevirtual   #59  <Method boolean ArrayList.remove(Object)>
			//   16   34:pop             
				dispatchFinishedWhenDone();
			//   17   35:aload_0         
			//   18   36:getfield        #21  <Field DefaultItemAnimator this$0>
			//   19   39:invokevirtual   #62  <Method void DefaultItemAnimator.dispatchFinishedWhenDone()>
			//   20   42:return          
			}

			public void onAnimationStart(Animator animator)
			{
				dispatchAddStarting(holder);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field DefaultItemAnimator this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #23  <Field RecyclerView$ViewHolder val$holder>
			//    4    8:invokevirtual   #66  <Method void DefaultItemAnimator.dispatchAddStarting(RecyclerView$ViewHolder)>
			//    5   11:return          
			}

			final DefaultItemAnimator this$0;
			final ViewPropertyAnimator val$animation;
			final RecyclerView.ViewHolder val$holder;
			final View val$view;

			
			{
				this$0 = DefaultItemAnimator.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field DefaultItemAnimator this$0>
				holder = viewholder;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field RecyclerView$ViewHolder val$holder>
				view = view1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field View val$view>
				animation = viewpropertyanimator;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #27  <Field ViewPropertyAnimator val$animation>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #30  <Method void AnimatorListenerAdapter()>
			//   14   25:return          
			}
		}
))).start();
	//   11   19:aload_3         
	//   12   20:fconst_1        
	//   13   21:invokevirtual   #111 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   14   24:aload_0         
	//   15   25:invokevirtual   #189 <Method long getAddDuration()>
	//   16   28:invokevirtual   #107 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   17   31:new             #14  <Class DefaultItemAnimator$5>
	//   18   34:dup             
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:aload_2         
	//   22   38:aload_3         
	//   23   39:invokespecial   #192 <Method void DefaultItemAnimator$5(DefaultItemAnimator, RecyclerView$ViewHolder, View, ViewPropertyAnimator)>
	//   24   42:invokevirtual   #118 <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   25   45:invokevirtual   #121 <Method void ViewPropertyAnimator.start()>
	//   26   48:return          
	}

	public boolean animateChange(RecyclerView.ViewHolder viewholder, RecyclerView.ViewHolder viewholder1, int i, int j, int k, int l)
	{
		if(viewholder == viewholder1)
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:if_acmpne       18
			return animateMove(viewholder, i, j, k, l);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_3         
	//    6    8:iload           4
	//    7   10:iload           5
	//    8   12:iload           6
	//    9   14:invokevirtual   #198 <Method boolean animateMove(RecyclerView$ViewHolder, int, int, int, int)>
	//   10   17:ireturn         
		float f = viewholder.itemView.getTranslationX();
	//   11   18:aload_1         
	//   12   19:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//   13   22:invokevirtual   #202 <Method float View.getTranslationX()>
	//   14   25:fstore          7
		float f1 = viewholder.itemView.getTranslationY();
	//   15   27:aload_1         
	//   16   28:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//   17   31:invokevirtual   #205 <Method float View.getTranslationY()>
	//   18   34:fstore          8
		float f2 = viewholder.itemView.getAlpha();
	//   19   36:aload_1         
	//   20   37:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//   21   40:invokevirtual   #208 <Method float View.getAlpha()>
	//   22   43:fstore          9
		resetAnimation(viewholder);
	//   23   45:aload_0         
	//   24   46:aload_1         
	//   25   47:invokespecial   #185 <Method void resetAnimation(RecyclerView$ViewHolder)>
		int i1 = (int)((float)(k - i) - f);
	//   26   50:iload           5
	//   27   52:iload_3         
	//   28   53:isub            
	//   29   54:i2f             
	//   30   55:fload           7
	//   31   57:fsub            
	//   32   58:f2i             
	//   33   59:istore          10
		int j1 = (int)((float)(l - j) - f1);
	//   34   61:iload           6
	//   35   63:iload           4
	//   36   65:isub            
	//   37   66:i2f             
	//   38   67:fload           8
	//   39   69:fsub            
	//   40   70:f2i             
	//   41   71:istore          11
		viewholder.itemView.setTranslationX(f);
	//   42   73:aload_1         
	//   43   74:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//   44   77:fload           7
	//   45   79:invokevirtual   #157 <Method void View.setTranslationX(float)>
		viewholder.itemView.setTranslationY(f1);
	//   46   82:aload_1         
	//   47   83:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//   48   86:fload           8
	//   49   88:invokevirtual   #160 <Method void View.setTranslationY(float)>
		viewholder.itemView.setAlpha(f2);
	//   50   91:aload_1         
	//   51   92:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//   52   95:fload           9
	//   53   97:invokevirtual   #154 <Method void View.setAlpha(float)>
		if(viewholder1 != null)
	//*  54  100:aload_2         
	//*  55  101:ifnull          139
		{
			resetAnimation(viewholder1);
	//   56  104:aload_0         
	//   57  105:aload_2         
	//   58  106:invokespecial   #185 <Method void resetAnimation(RecyclerView$ViewHolder)>
			viewholder1.itemView.setTranslationX(-i1);
	//   59  109:aload_2         
	//   60  110:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//   61  113:iload           10
	//   62  115:ineg            
	//   63  116:i2f             
	//   64  117:invokevirtual   #157 <Method void View.setTranslationX(float)>
			viewholder1.itemView.setTranslationY(-j1);
	//   65  120:aload_2         
	//   66  121:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//   67  124:iload           11
	//   68  126:ineg            
	//   69  127:i2f             
	//   70  128:invokevirtual   #160 <Method void View.setTranslationY(float)>
			viewholder1.itemView.setAlpha(0.0F);
	//   71  131:aload_2         
	//   72  132:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//   73  135:fconst_0        
	//   74  136:invokevirtual   #154 <Method void View.setAlpha(float)>
		}
		mPendingChanges.add(((Object) (new ChangeInfo(viewholder, viewholder1, i, j, k, l))));
	//   75  139:aload_0         
	//   76  140:getfield        #64  <Field ArrayList mPendingChanges>
	//   77  143:new             #22  <Class DefaultItemAnimator$ChangeInfo>
	//   78  146:dup             
	//   79  147:aload_1         
	//   80  148:aload_2         
	//   81  149:iload_3         
	//   82  150:iload           4
	//   83  152:iload           5
	//   84  154:iload           6
	//   85  156:invokespecial   #211 <Method void DefaultItemAnimator$ChangeInfo(RecyclerView$ViewHolder, RecyclerView$ViewHolder, int, int, int, int)>
	//   86  159:invokevirtual   #97  <Method boolean ArrayList.add(Object)>
	//   87  162:pop             
		return true;
	//   88  163:iconst_1        
	//   89  164:ireturn         
	}

	void animateChangeImpl(final ChangeInfo changeInfo)
	{
		final Object view = ((Object) (changeInfo.oldHolder));
	//    0    0:aload_1         
	//    1    1:getfield        #141 <Field RecyclerView$ViewHolder DefaultItemAnimator$ChangeInfo.oldHolder>
	//    2    4:astore_2        
		final View newView = null;
	//    3    5:aconst_null     
	//    4    6:astore_3        
		if(view == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       16
			view = null;
	//    7   11:aconst_null     
	//    8   12:astore_2        
		else
	//*   9   13:goto            21
			view = ((Object) (((RecyclerView.ViewHolder) (view)).itemView));
	//   10   16:aload_2         
	//   11   17:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//   12   20:astore_2        
		RecyclerView.ViewHolder viewholder = changeInfo.newHolder;
	//   13   21:aload_1         
	//   14   22:getfield        #144 <Field RecyclerView$ViewHolder DefaultItemAnimator$ChangeInfo.newHolder>
	//   15   25:astore          4
		if(viewholder != null)
	//*  16   27:aload           4
	//*  17   29:ifnull          38
			newView = viewholder.itemView;
	//   18   32:aload           4
	//   19   34:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//   20   37:astore_3        
		if(view != null)
	//*  21   38:aload_2         
	//*  22   39:ifnull          123
		{
			final ViewPropertyAnimator oldViewAnim = ((View) (view)).animate().setDuration(getChangeDuration());
	//   23   42:aload_2         
	//   24   43:invokevirtual   #93  <Method ViewPropertyAnimator View.animate()>
	//   25   46:aload_0         
	//   26   47:invokevirtual   #215 <Method long getChangeDuration()>
	//   27   50:invokevirtual   #107 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   28   53:astore          4
			mChangeAnimations.add(((Object) (changeInfo.oldHolder)));
	//   29   55:aload_0         
	//   30   56:getfield        #78  <Field ArrayList mChangeAnimations>
	//   31   59:aload_1         
	//   32   60:getfield        #141 <Field RecyclerView$ViewHolder DefaultItemAnimator$ChangeInfo.oldHolder>
	//   33   63:invokevirtual   #97  <Method boolean ArrayList.add(Object)>
	//   34   66:pop             
			oldViewAnim.translationX(changeInfo.toX - changeInfo.fromX);
	//   35   67:aload           4
	//   36   69:aload_1         
	//   37   70:getfield        #219 <Field int DefaultItemAnimator$ChangeInfo.toX>
	//   38   73:aload_1         
	//   39   74:getfield        #222 <Field int DefaultItemAnimator$ChangeInfo.fromX>
	//   40   77:isub            
	//   41   78:i2f             
	//   42   79:invokevirtual   #225 <Method ViewPropertyAnimator ViewPropertyAnimator.translationX(float)>
	//   43   82:pop             
			oldViewAnim.translationY(changeInfo.toY - changeInfo.fromY);
	//   44   83:aload           4
	//   45   85:aload_1         
	//   46   86:getfield        #228 <Field int DefaultItemAnimator$ChangeInfo.toY>
	//   47   89:aload_1         
	//   48   90:getfield        #231 <Field int DefaultItemAnimator$ChangeInfo.fromY>
	//   49   93:isub            
	//   50   94:i2f             
	//   51   95:invokevirtual   #234 <Method ViewPropertyAnimator ViewPropertyAnimator.translationY(float)>
	//   52   98:pop             
			oldViewAnim.alpha(0.0F).setListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

				public void onAnimationEnd(Animator animator)
				{
					oldViewAnim.setListener(((android.animation.Animator.AnimatorListener) (null)));
				//    0    0:aload_0         
				//    1    1:getfield        #25  <Field ViewPropertyAnimator val$oldViewAnim>
				//    2    4:aconst_null     
				//    3    5:invokevirtual   #39  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
				//    4    8:pop             
					view.setAlpha(1.0F);
				//    5    9:aload_0         
				//    6   10:getfield        #27  <Field View val$view>
				//    7   13:fconst_1        
				//    8   14:invokevirtual   #45  <Method void View.setAlpha(float)>
					view.setTranslationX(0.0F);
				//    9   17:aload_0         
				//   10   18:getfield        #27  <Field View val$view>
				//   11   21:fconst_0        
				//   12   22:invokevirtual   #48  <Method void View.setTranslationX(float)>
					view.setTranslationY(0.0F);
				//   13   25:aload_0         
				//   14   26:getfield        #27  <Field View val$view>
				//   15   29:fconst_0        
				//   16   30:invokevirtual   #51  <Method void View.setTranslationY(float)>
					dispatchChangeFinished(changeInfo.oldHolder, true);
				//   17   33:aload_0         
				//   18   34:getfield        #21  <Field DefaultItemAnimator this$0>
				//   19   37:aload_0         
				//   20   38:getfield        #23  <Field DefaultItemAnimator$ChangeInfo val$changeInfo>
				//   21   41:getfield        #57  <Field RecyclerView$ViewHolder DefaultItemAnimator$ChangeInfo.oldHolder>
				//   22   44:iconst_1        
				//   23   45:invokevirtual   #61  <Method void DefaultItemAnimator.dispatchChangeFinished(RecyclerView$ViewHolder, boolean)>
					mChangeAnimations.remove(((Object) (changeInfo.oldHolder)));
				//   24   48:aload_0         
				//   25   49:getfield        #21  <Field DefaultItemAnimator this$0>
				//   26   52:getfield        #65  <Field ArrayList DefaultItemAnimator.mChangeAnimations>
				//   27   55:aload_0         
				//   28   56:getfield        #23  <Field DefaultItemAnimator$ChangeInfo val$changeInfo>
				//   29   59:getfield        #57  <Field RecyclerView$ViewHolder DefaultItemAnimator$ChangeInfo.oldHolder>
				//   30   62:invokevirtual   #71  <Method boolean ArrayList.remove(Object)>
				//   31   65:pop             
					dispatchFinishedWhenDone();
				//   32   66:aload_0         
				//   33   67:getfield        #21  <Field DefaultItemAnimator this$0>
				//   34   70:invokevirtual   #74  <Method void DefaultItemAnimator.dispatchFinishedWhenDone()>
				//   35   73:return          
				}

				public void onAnimationStart(Animator animator)
				{
					dispatchChangeStarting(changeInfo.oldHolder, true);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field DefaultItemAnimator this$0>
				//    2    4:aload_0         
				//    3    5:getfield        #23  <Field DefaultItemAnimator$ChangeInfo val$changeInfo>
				//    4    8:getfield        #57  <Field RecyclerView$ViewHolder DefaultItemAnimator$ChangeInfo.oldHolder>
				//    5   11:iconst_1        
				//    6   12:invokevirtual   #78  <Method void DefaultItemAnimator.dispatchChangeStarting(RecyclerView$ViewHolder, boolean)>
				//    7   15:return          
				}

				final DefaultItemAnimator this$0;
				final ChangeInfo val$changeInfo;
				final ViewPropertyAnimator val$oldViewAnim;
				final View val$view;

			
			{
				this$0 = DefaultItemAnimator.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field DefaultItemAnimator this$0>
				changeInfo = changeinfo;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field DefaultItemAnimator$ChangeInfo val$changeInfo>
				oldViewAnim = viewpropertyanimator;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field ViewPropertyAnimator val$oldViewAnim>
				view = view1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #27  <Field View val$view>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #30  <Method void AnimatorListenerAdapter()>
			//   14   25:return          
			}
			}
))).start();
	//   53   99:aload           4
	//   54  101:fconst_0        
	//   55  102:invokevirtual   #111 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   56  105:new             #18  <Class DefaultItemAnimator$7>
	//   57  108:dup             
	//   58  109:aload_0         
	//   59  110:aload_1         
	//   60  111:aload           4
	//   61  113:aload_2         
	//   62  114:invokespecial   #237 <Method void DefaultItemAnimator$7(DefaultItemAnimator, DefaultItemAnimator$ChangeInfo, ViewPropertyAnimator, View)>
	//   63  117:invokevirtual   #118 <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   64  120:invokevirtual   #121 <Method void ViewPropertyAnimator.start()>
		}
		if(newView != null)
	//*  65  123:aload_3         
	//*  66  124:ifnull          181
		{
			final ViewPropertyAnimator newViewAnimation = newView.animate();
	//   67  127:aload_3         
	//   68  128:invokevirtual   #93  <Method ViewPropertyAnimator View.animate()>
	//   69  131:astore_2        
			mChangeAnimations.add(((Object) (changeInfo.newHolder)));
	//   70  132:aload_0         
	//   71  133:getfield        #78  <Field ArrayList mChangeAnimations>
	//   72  136:aload_1         
	//   73  137:getfield        #144 <Field RecyclerView$ViewHolder DefaultItemAnimator$ChangeInfo.newHolder>
	//   74  140:invokevirtual   #97  <Method boolean ArrayList.add(Object)>
	//   75  143:pop             
			newViewAnimation.translationX(0.0F).translationY(0.0F).setDuration(getChangeDuration()).alpha(1.0F).setListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

				public void onAnimationEnd(Animator animator)
				{
					newViewAnimation.setListener(((android.animation.Animator.AnimatorListener) (null)));
				//    0    0:aload_0         
				//    1    1:getfield        #25  <Field ViewPropertyAnimator val$newViewAnimation>
				//    2    4:aconst_null     
				//    3    5:invokevirtual   #39  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
				//    4    8:pop             
					newView.setAlpha(1.0F);
				//    5    9:aload_0         
				//    6   10:getfield        #27  <Field View val$newView>
				//    7   13:fconst_1        
				//    8   14:invokevirtual   #45  <Method void View.setAlpha(float)>
					newView.setTranslationX(0.0F);
				//    9   17:aload_0         
				//   10   18:getfield        #27  <Field View val$newView>
				//   11   21:fconst_0        
				//   12   22:invokevirtual   #48  <Method void View.setTranslationX(float)>
					newView.setTranslationY(0.0F);
				//   13   25:aload_0         
				//   14   26:getfield        #27  <Field View val$newView>
				//   15   29:fconst_0        
				//   16   30:invokevirtual   #51  <Method void View.setTranslationY(float)>
					dispatchChangeFinished(changeInfo.newHolder, false);
				//   17   33:aload_0         
				//   18   34:getfield        #21  <Field DefaultItemAnimator this$0>
				//   19   37:aload_0         
				//   20   38:getfield        #23  <Field DefaultItemAnimator$ChangeInfo val$changeInfo>
				//   21   41:getfield        #57  <Field RecyclerView$ViewHolder DefaultItemAnimator$ChangeInfo.newHolder>
				//   22   44:iconst_0        
				//   23   45:invokevirtual   #61  <Method void DefaultItemAnimator.dispatchChangeFinished(RecyclerView$ViewHolder, boolean)>
					mChangeAnimations.remove(((Object) (changeInfo.newHolder)));
				//   24   48:aload_0         
				//   25   49:getfield        #21  <Field DefaultItemAnimator this$0>
				//   26   52:getfield        #65  <Field ArrayList DefaultItemAnimator.mChangeAnimations>
				//   27   55:aload_0         
				//   28   56:getfield        #23  <Field DefaultItemAnimator$ChangeInfo val$changeInfo>
				//   29   59:getfield        #57  <Field RecyclerView$ViewHolder DefaultItemAnimator$ChangeInfo.newHolder>
				//   30   62:invokevirtual   #71  <Method boolean ArrayList.remove(Object)>
				//   31   65:pop             
					dispatchFinishedWhenDone();
				//   32   66:aload_0         
				//   33   67:getfield        #21  <Field DefaultItemAnimator this$0>
				//   34   70:invokevirtual   #74  <Method void DefaultItemAnimator.dispatchFinishedWhenDone()>
				//   35   73:return          
				}

				public void onAnimationStart(Animator animator)
				{
					dispatchChangeStarting(changeInfo.newHolder, false);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field DefaultItemAnimator this$0>
				//    2    4:aload_0         
				//    3    5:getfield        #23  <Field DefaultItemAnimator$ChangeInfo val$changeInfo>
				//    4    8:getfield        #57  <Field RecyclerView$ViewHolder DefaultItemAnimator$ChangeInfo.newHolder>
				//    5   11:iconst_0        
				//    6   12:invokevirtual   #78  <Method void DefaultItemAnimator.dispatchChangeStarting(RecyclerView$ViewHolder, boolean)>
				//    7   15:return          
				}

				final DefaultItemAnimator this$0;
				final ChangeInfo val$changeInfo;
				final View val$newView;
				final ViewPropertyAnimator val$newViewAnimation;

			
			{
				this$0 = DefaultItemAnimator.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field DefaultItemAnimator this$0>
				changeInfo = changeinfo;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field DefaultItemAnimator$ChangeInfo val$changeInfo>
				newViewAnimation = viewpropertyanimator;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field ViewPropertyAnimator val$newViewAnimation>
				newView = view;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #27  <Field View val$newView>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #30  <Method void AnimatorListenerAdapter()>
			//   14   25:return          
			}
			}
))).start();
	//   76  144:aload_2         
	//   77  145:fconst_0        
	//   78  146:invokevirtual   #225 <Method ViewPropertyAnimator ViewPropertyAnimator.translationX(float)>
	//   79  149:fconst_0        
	//   80  150:invokevirtual   #234 <Method ViewPropertyAnimator ViewPropertyAnimator.translationY(float)>
	//   81  153:aload_0         
	//   82  154:invokevirtual   #215 <Method long getChangeDuration()>
	//   83  157:invokevirtual   #107 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   84  160:fconst_1        
	//   85  161:invokevirtual   #111 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   86  164:new             #20  <Class DefaultItemAnimator$8>
	//   87  167:dup             
	//   88  168:aload_0         
	//   89  169:aload_1         
	//   90  170:aload_2         
	//   91  171:aload_3         
	//   92  172:invokespecial   #238 <Method void DefaultItemAnimator$8(DefaultItemAnimator, DefaultItemAnimator$ChangeInfo, ViewPropertyAnimator, View)>
	//   93  175:invokevirtual   #118 <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   94  178:invokevirtual   #121 <Method void ViewPropertyAnimator.start()>
		}
	//   95  181:return          
	}

	public boolean animateMove(RecyclerView.ViewHolder viewholder, int i, int j, int k, int l)
	{
		View view = viewholder.itemView;
	//    0    0:aload_1         
	//    1    1:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//    2    4:astore          8
		i += (int)viewholder.itemView.getTranslationX();
	//    3    6:iload_2         
	//    4    7:aload_1         
	//    5    8:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//    6   11:invokevirtual   #202 <Method float View.getTranslationX()>
	//    7   14:f2i             
	//    8   15:iadd            
	//    9   16:istore_2        
		j += (int)viewholder.itemView.getTranslationY();
	//   10   17:iload_3         
	//   11   18:aload_1         
	//   12   19:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//   13   22:invokevirtual   #205 <Method float View.getTranslationY()>
	//   14   25:f2i             
	//   15   26:iadd            
	//   16   27:istore_3        
		resetAnimation(viewholder);
	//   17   28:aload_0         
	//   18   29:aload_1         
	//   19   30:invokespecial   #185 <Method void resetAnimation(RecyclerView$ViewHolder)>
		int i1 = k - i;
	//   20   33:iload           4
	//   21   35:iload_2         
	//   22   36:isub            
	//   23   37:istore          6
		int j1 = l - j;
	//   24   39:iload           5
	//   25   41:iload_3         
	//   26   42:isub            
	//   27   43:istore          7
		if(i1 == 0 && j1 == 0)
	//*  28   45:iload           6
	//*  29   47:ifne            62
	//*  30   50:iload           7
	//*  31   52:ifne            62
		{
			dispatchMoveFinished(viewholder);
	//   32   55:aload_0         
	//   33   56:aload_1         
	//   34   57:invokevirtual   #241 <Method void dispatchMoveFinished(RecyclerView$ViewHolder)>
			return false;
	//   35   60:iconst_0        
	//   36   61:ireturn         
		}
		if(i1 != 0)
	//*  37   62:iload           6
	//*  38   64:ifeq            76
			view.setTranslationX(-i1);
	//   39   67:aload           8
	//   40   69:iload           6
	//   41   71:ineg            
	//   42   72:i2f             
	//   43   73:invokevirtual   #157 <Method void View.setTranslationX(float)>
		if(j1 != 0)
	//*  44   76:iload           7
	//*  45   78:ifeq            90
			view.setTranslationY(-j1);
	//   46   81:aload           8
	//   47   83:iload           7
	//   48   85:ineg            
	//   49   86:i2f             
	//   50   87:invokevirtual   #160 <Method void View.setTranslationY(float)>
		mPendingMoves.add(((Object) (new MoveInfo(viewholder, i, j, k, l))));
	//   51   90:aload_0         
	//   52   91:getfield        #62  <Field ArrayList mPendingMoves>
	//   53   94:new             #25  <Class DefaultItemAnimator$MoveInfo>
	//   54   97:dup             
	//   55   98:aload_1         
	//   56   99:iload_2         
	//   57  100:iload_3         
	//   58  101:iload           4
	//   59  103:iload           5
	//   60  105:invokespecial   #244 <Method void DefaultItemAnimator$MoveInfo(RecyclerView$ViewHolder, int, int, int, int)>
	//   61  108:invokevirtual   #97  <Method boolean ArrayList.add(Object)>
	//   62  111:pop             
		return true;
	//   63  112:iconst_1        
	//   64  113:ireturn         
	}

	void animateMoveImpl(final RecyclerView.ViewHolder holder, final int deltaX, final int deltaY, int i, int j)
	{
		final View view = holder.itemView;
	//    0    0:aload_1         
	//    1    1:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//    2    4:astore          6
		deltaX = i - deltaX;
	//    3    6:iload           4
	//    4    8:iload_2         
	//    5    9:isub            
	//    6   10:istore_2        
		deltaY = j - deltaY;
	//    7   11:iload           5
	//    8   13:iload_3         
	//    9   14:isub            
	//   10   15:istore_3        
		if(deltaX != 0)
	//*  11   16:iload_2         
	//*  12   17:ifeq            30
			view.animate().translationX(0.0F);
	//   13   20:aload           6
	//   14   22:invokevirtual   #93  <Method ViewPropertyAnimator View.animate()>
	//   15   25:fconst_0        
	//   16   26:invokevirtual   #225 <Method ViewPropertyAnimator ViewPropertyAnimator.translationX(float)>
	//   17   29:pop             
		if(deltaY != 0)
	//*  18   30:iload_3         
	//*  19   31:ifeq            44
			view.animate().translationY(0.0F);
	//   20   34:aload           6
	//   21   36:invokevirtual   #93  <Method ViewPropertyAnimator View.animate()>
	//   22   39:fconst_0        
	//   23   40:invokevirtual   #234 <Method ViewPropertyAnimator ViewPropertyAnimator.translationY(float)>
	//   24   43:pop             
		final ViewPropertyAnimator animation = view.animate();
	//   25   44:aload           6
	//   26   46:invokevirtual   #93  <Method ViewPropertyAnimator View.animate()>
	//   27   49:astore          7
		mMoveAnimations.add(((Object) (holder)));
	//   28   51:aload_0         
	//   29   52:getfield        #74  <Field ArrayList mMoveAnimations>
	//   30   55:aload_1         
	//   31   56:invokevirtual   #97  <Method boolean ArrayList.add(Object)>
	//   32   59:pop             
		animation.setDuration(getMoveDuration()).setListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

			public void onAnimationCancel(Animator animator)
			{
				if(deltaX != 0)
			//*   0    0:aload_0         
			//*   1    1:getfield        #28  <Field int val$deltaX>
			//*   2    4:ifeq            15
					view.setTranslationX(0.0F);
			//    3    7:aload_0         
			//    4    8:getfield        #30  <Field View val$view>
			//    5   11:fconst_0        
			//    6   12:invokevirtual   #46  <Method void View.setTranslationX(float)>
				if(deltaY != 0)
			//*   7   15:aload_0         
			//*   8   16:getfield        #32  <Field int val$deltaY>
			//*   9   19:ifeq            30
					view.setTranslationY(0.0F);
			//   10   22:aload_0         
			//   11   23:getfield        #30  <Field View val$view>
			//   12   26:fconst_0        
			//   13   27:invokevirtual   #49  <Method void View.setTranslationY(float)>
			//   14   30:return          
			}

			public void onAnimationEnd(Animator animator)
			{
				animation.setListener(((android.animation.Animator.AnimatorListener) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #34  <Field ViewPropertyAnimator val$animation>
			//    2    4:aconst_null     
			//    3    5:invokevirtual   #56  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
			//    4    8:pop             
				dispatchMoveFinished(holder);
			//    5    9:aload_0         
			//    6   10:getfield        #24  <Field DefaultItemAnimator this$0>
			//    7   13:aload_0         
			//    8   14:getfield        #26  <Field RecyclerView$ViewHolder val$holder>
			//    9   17:invokevirtual   #60  <Method void DefaultItemAnimator.dispatchMoveFinished(RecyclerView$ViewHolder)>
				mMoveAnimations.remove(((Object) (holder)));
			//   10   20:aload_0         
			//   11   21:getfield        #24  <Field DefaultItemAnimator this$0>
			//   12   24:getfield        #64  <Field ArrayList DefaultItemAnimator.mMoveAnimations>
			//   13   27:aload_0         
			//   14   28:getfield        #26  <Field RecyclerView$ViewHolder val$holder>
			//   15   31:invokevirtual   #70  <Method boolean ArrayList.remove(Object)>
			//   16   34:pop             
				dispatchFinishedWhenDone();
			//   17   35:aload_0         
			//   18   36:getfield        #24  <Field DefaultItemAnimator this$0>
			//   19   39:invokevirtual   #73  <Method void DefaultItemAnimator.dispatchFinishedWhenDone()>
			//   20   42:return          
			}

			public void onAnimationStart(Animator animator)
			{
				dispatchMoveStarting(holder);
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field DefaultItemAnimator this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #26  <Field RecyclerView$ViewHolder val$holder>
			//    4    8:invokevirtual   #77  <Method void DefaultItemAnimator.dispatchMoveStarting(RecyclerView$ViewHolder)>
			//    5   11:return          
			}

			final DefaultItemAnimator this$0;
			final ViewPropertyAnimator val$animation;
			final int val$deltaX;
			final int val$deltaY;
			final RecyclerView.ViewHolder val$holder;
			final View val$view;

			
			{
				this$0 = DefaultItemAnimator.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field DefaultItemAnimator this$0>
				holder = viewholder;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field RecyclerView$ViewHolder val$holder>
				deltaX = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #28  <Field int val$deltaX>
				view = view1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #30  <Field View val$view>
				deltaY = j;
			//   12   21:aload_0         
			//   13   22:iload           5
			//   14   24:putfield        #32  <Field int val$deltaY>
				animation = viewpropertyanimator;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #34  <Field ViewPropertyAnimator val$animation>
				super();
			//   18   33:aload_0         
			//   19   34:invokespecial   #37  <Method void AnimatorListenerAdapter()>
			//   20   37:return          
			}
		}
))).start();
	//   33   60:aload           7
	//   34   62:aload_0         
	//   35   63:invokevirtual   #248 <Method long getMoveDuration()>
	//   36   66:invokevirtual   #107 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   37   69:new             #16  <Class DefaultItemAnimator$6>
	//   38   72:dup             
	//   39   73:aload_0         
	//   40   74:aload_1         
	//   41   75:iload_2         
	//   42   76:aload           6
	//   43   78:iload_3         
	//   44   79:aload           7
	//   45   81:invokespecial   #251 <Method void DefaultItemAnimator$6(DefaultItemAnimator, RecyclerView$ViewHolder, int, View, int, ViewPropertyAnimator)>
	//   46   84:invokevirtual   #118 <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   47   87:invokevirtual   #121 <Method void ViewPropertyAnimator.start()>
	//   48   90:return          
	}

	public boolean animateRemove(RecyclerView.ViewHolder viewholder)
	{
		resetAnimation(viewholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #185 <Method void resetAnimation(RecyclerView$ViewHolder)>
		mPendingRemovals.add(((Object) (viewholder)));
	//    3    5:aload_0         
	//    4    6:getfield        #58  <Field ArrayList mPendingRemovals>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #97  <Method boolean ArrayList.add(Object)>
	//    7   13:pop             
		return true;
	//    8   14:iconst_1        
	//    9   15:ireturn         
	}

	public boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewholder, List list)
	{
		return !list.isEmpty() || super.canReuseUpdatedViewHolder(viewholder, list);
	//    0    0:aload_2         
	//    1    1:invokeinterface #259 <Method boolean List.isEmpty()>
	//    2    6:ifeq            23
	//    3    9:aload_0         
	//    4   10:aload_1         
	//    5   11:aload_2         
	//    6   12:invokespecial   #261 <Method boolean SimpleItemAnimator.canReuseUpdatedViewHolder(RecyclerView$ViewHolder, List)>
	//    7   15:ifeq            21
	//    8   18:goto            23
	//    9   21:iconst_0        
	//   10   22:ireturn         
	//   11   23:iconst_1        
	//   12   24:ireturn         
	}

	void cancelAll(List list)
	{
		for(int i = list.size() - 1; i >= 0; i--)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #129 <Method int List.size()>
	//*   2    6:iconst_1        
	//*   3    7:isub            
	//*   4    8:istore_2        
	//*   5    9:iload_2         
	//*   6   10:iflt            39
			((RecyclerView.ViewHolder)list.get(i)).itemView.animate().cancel();
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:invokeinterface #133 <Method Object List.get(int)>
	//   10   20:checkcast       #83  <Class RecyclerView$ViewHolder>
	//   11   23:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//   12   26:invokevirtual   #93  <Method ViewPropertyAnimator View.animate()>
	//   13   29:invokevirtual   #268 <Method void ViewPropertyAnimator.cancel()>

	//   14   32:iload_2         
	//   15   33:iconst_1        
	//   16   34:isub            
	//   17   35:istore_2        
	//*  18   36:goto            9
	//   19   39:return          
	}

	void dispatchFinishedWhenDone()
	{
		if(!isRunning())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #273 <Method boolean isRunning()>
	//*   2    4:ifne            11
			dispatchAnimationsFinished();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #276 <Method void dispatchAnimationsFinished()>
	//    5   11:return          
	}

	public void endAnimation(RecyclerView.ViewHolder viewholder)
	{
		View view = viewholder.itemView;
	//    0    0:aload_1         
	//    1    1:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//    2    4:astore          4
		view.animate().cancel();
	//    3    6:aload           4
	//    4    8:invokevirtual   #93  <Method ViewPropertyAnimator View.animate()>
	//    5   11:invokevirtual   #268 <Method void ViewPropertyAnimator.cancel()>
		for(int i = mPendingMoves.size() - 1; i >= 0; i--)
	//*   6   14:aload_0         
	//*   7   15:getfield        #62  <Field ArrayList mPendingMoves>
	//*   8   18:invokevirtual   #277 <Method int ArrayList.size()>
	//*   9   21:iconst_1        
	//*  10   22:isub            
	//*  11   23:istore_2        
	//*  12   24:iload_2         
	//*  13   25:iflt            79
			if(((MoveInfo)mPendingMoves.get(i)).holder == viewholder)
	//*  14   28:aload_0         
	//*  15   29:getfield        #62  <Field ArrayList mPendingMoves>
	//*  16   32:iload_2         
	//*  17   33:invokevirtual   #278 <Method Object ArrayList.get(int)>
	//*  18   36:checkcast       #25  <Class DefaultItemAnimator$MoveInfo>
	//*  19   39:getfield        #281 <Field RecyclerView$ViewHolder DefaultItemAnimator$MoveInfo.holder>
	//*  20   42:aload_1         
	//*  21   43:if_acmpne       72
			{
				view.setTranslationY(0.0F);
	//   22   46:aload           4
	//   23   48:fconst_0        
	//   24   49:invokevirtual   #160 <Method void View.setTranslationY(float)>
				view.setTranslationX(0.0F);
	//   25   52:aload           4
	//   26   54:fconst_0        
	//   27   55:invokevirtual   #157 <Method void View.setTranslationX(float)>
				dispatchMoveFinished(viewholder);
	//   28   58:aload_0         
	//   29   59:aload_1         
	//   30   60:invokevirtual   #241 <Method void dispatchMoveFinished(RecyclerView$ViewHolder)>
				mPendingMoves.remove(i);
	//   31   63:aload_0         
	//   32   64:getfield        #62  <Field ArrayList mPendingMoves>
	//   33   67:iload_2         
	//   34   68:invokevirtual   #283 <Method Object ArrayList.remove(int)>
	//   35   71:pop             
			}

	//   36   72:iload_2         
	//   37   73:iconst_1        
	//   38   74:isub            
	//   39   75:istore_2        
	//*  40   76:goto            24
		endChangeAnimation(((List) (mPendingChanges)), viewholder);
	//   41   79:aload_0         
	//   42   80:aload_0         
	//   43   81:getfield        #64  <Field ArrayList mPendingChanges>
	//   44   84:aload_1         
	//   45   85:invokespecial   #285 <Method void endChangeAnimation(List, RecyclerView$ViewHolder)>
		if(mPendingRemovals.remove(((Object) (viewholder))))
	//*  46   88:aload_0         
	//*  47   89:getfield        #58  <Field ArrayList mPendingRemovals>
	//*  48   92:aload_1         
	//*  49   93:invokevirtual   #286 <Method boolean ArrayList.remove(Object)>
	//*  50   96:ifeq            110
		{
			view.setAlpha(1.0F);
	//   51   99:aload           4
	//   52  101:fconst_1        
	//   53  102:invokevirtual   #154 <Method void View.setAlpha(float)>
			dispatchRemoveFinished(viewholder);
	//   54  105:aload_0         
	//   55  106:aload_1         
	//   56  107:invokevirtual   #289 <Method void dispatchRemoveFinished(RecyclerView$ViewHolder)>
		}
		if(mPendingAdditions.remove(((Object) (viewholder))))
	//*  57  110:aload_0         
	//*  58  111:getfield        #60  <Field ArrayList mPendingAdditions>
	//*  59  114:aload_1         
	//*  60  115:invokevirtual   #286 <Method boolean ArrayList.remove(Object)>
	//*  61  118:ifeq            132
		{
			view.setAlpha(1.0F);
	//   62  121:aload           4
	//   63  123:fconst_1        
	//   64  124:invokevirtual   #154 <Method void View.setAlpha(float)>
			dispatchAddFinished(viewholder);
	//   65  127:aload_0         
	//   66  128:aload_1         
	//   67  129:invokevirtual   #292 <Method void dispatchAddFinished(RecyclerView$ViewHolder)>
		}
		for(int j = mChangesList.size() - 1; j >= 0; j--)
	//*  68  132:aload_0         
	//*  69  133:getfield        #70  <Field ArrayList mChangesList>
	//*  70  136:invokevirtual   #277 <Method int ArrayList.size()>
	//*  71  139:iconst_1        
	//*  72  140:isub            
	//*  73  141:istore_2        
	//*  74  142:iload_2         
	//*  75  143:iflt            190
		{
			ArrayList arraylist = (ArrayList)mChangesList.get(j);
	//   76  146:aload_0         
	//   77  147:getfield        #70  <Field ArrayList mChangesList>
	//   78  150:iload_2         
	//   79  151:invokevirtual   #278 <Method Object ArrayList.get(int)>
	//   80  154:checkcast       #55  <Class ArrayList>
	//   81  157:astore          5
			endChangeAnimation(((List) (arraylist)), viewholder);
	//   82  159:aload_0         
	//   83  160:aload           5
	//   84  162:aload_1         
	//   85  163:invokespecial   #285 <Method void endChangeAnimation(List, RecyclerView$ViewHolder)>
			if(arraylist.isEmpty())
	//*  86  166:aload           5
	//*  87  168:invokevirtual   #293 <Method boolean ArrayList.isEmpty()>
	//*  88  171:ifeq            183
				mChangesList.remove(j);
	//   89  174:aload_0         
	//   90  175:getfield        #70  <Field ArrayList mChangesList>
	//   91  178:iload_2         
	//   92  179:invokevirtual   #283 <Method Object ArrayList.remove(int)>
	//   93  182:pop             
		}

	//   94  183:iload_2         
	//   95  184:iconst_1        
	//   96  185:isub            
	//   97  186:istore_2        
	//*  98  187:goto            142
label0:
		for(int k = mMovesList.size() - 1; k >= 0; k--)
	//*  99  190:aload_0         
	//* 100  191:getfield        #68  <Field ArrayList mMovesList>
	//* 101  194:invokevirtual   #277 <Method int ArrayList.size()>
	//* 102  197:iconst_1        
	//* 103  198:isub            
	//* 104  199:istore_2        
	//* 105  200:iload_2         
	//* 106  201:iflt            303
		{
			ArrayList arraylist1 = (ArrayList)mMovesList.get(k);
	//  107  204:aload_0         
	//  108  205:getfield        #68  <Field ArrayList mMovesList>
	//  109  208:iload_2         
	//  110  209:invokevirtual   #278 <Method Object ArrayList.get(int)>
	//  111  212:checkcast       #55  <Class ArrayList>
	//  112  215:astore          5
			int i1 = arraylist1.size() - 1;
	//  113  217:aload           5
	//  114  219:invokevirtual   #277 <Method int ArrayList.size()>
	//  115  222:iconst_1        
	//  116  223:isub            
	//  117  224:istore_3        
			do
			{
				if(i1 < 0)
					continue label0;
	//  118  225:iload_3         
	//  119  226:iflt            296
				if(((MoveInfo)arraylist1.get(i1)).holder == viewholder)
	//* 120  229:aload           5
	//* 121  231:iload_3         
	//* 122  232:invokevirtual   #278 <Method Object ArrayList.get(int)>
	//* 123  235:checkcast       #25  <Class DefaultItemAnimator$MoveInfo>
	//* 124  238:getfield        #281 <Field RecyclerView$ViewHolder DefaultItemAnimator$MoveInfo.holder>
	//* 125  241:aload_1         
	//* 126  242:if_acmpne       289
				{
					view.setTranslationY(0.0F);
	//  127  245:aload           4
	//  128  247:fconst_0        
	//  129  248:invokevirtual   #160 <Method void View.setTranslationY(float)>
					view.setTranslationX(0.0F);
	//  130  251:aload           4
	//  131  253:fconst_0        
	//  132  254:invokevirtual   #157 <Method void View.setTranslationX(float)>
					dispatchMoveFinished(viewholder);
	//  133  257:aload_0         
	//  134  258:aload_1         
	//  135  259:invokevirtual   #241 <Method void dispatchMoveFinished(RecyclerView$ViewHolder)>
					arraylist1.remove(i1);
	//  136  262:aload           5
	//  137  264:iload_3         
	//  138  265:invokevirtual   #283 <Method Object ArrayList.remove(int)>
	//  139  268:pop             
					if(arraylist1.isEmpty())
	//* 140  269:aload           5
	//* 141  271:invokevirtual   #293 <Method boolean ArrayList.isEmpty()>
	//* 142  274:ifeq            296
						mMovesList.remove(k);
	//  143  277:aload_0         
	//  144  278:getfield        #68  <Field ArrayList mMovesList>
	//  145  281:iload_2         
	//  146  282:invokevirtual   #283 <Method Object ArrayList.remove(int)>
	//  147  285:pop             
					continue label0;
	//  148  286:goto            296
				}
				i1--;
	//  149  289:iload_3         
	//  150  290:iconst_1        
	//  151  291:isub            
	//  152  292:istore_3        
			} while(true);
	//  153  293:goto            225
		}

	//  154  296:iload_2         
	//  155  297:iconst_1        
	//  156  298:isub            
	//  157  299:istore_2        
	//* 158  300:goto            200
		for(int l = mAdditionsList.size() - 1; l >= 0; l--)
	//* 159  303:aload_0         
	//* 160  304:getfield        #66  <Field ArrayList mAdditionsList>
	//* 161  307:invokevirtual   #277 <Method int ArrayList.size()>
	//* 162  310:iconst_1        
	//* 163  311:isub            
	//* 164  312:istore_2        
	//* 165  313:iload_2         
	//* 166  314:iflt            374
		{
			ArrayList arraylist2 = (ArrayList)mAdditionsList.get(l);
	//  167  317:aload_0         
	//  168  318:getfield        #66  <Field ArrayList mAdditionsList>
	//  169  321:iload_2         
	//  170  322:invokevirtual   #278 <Method Object ArrayList.get(int)>
	//  171  325:checkcast       #55  <Class ArrayList>
	//  172  328:astore          5
			if(!arraylist2.remove(((Object) (viewholder))))
				continue;
	//  173  330:aload           5
	//  174  332:aload_1         
	//  175  333:invokevirtual   #286 <Method boolean ArrayList.remove(Object)>
	//  176  336:ifeq            367
			view.setAlpha(1.0F);
	//  177  339:aload           4
	//  178  341:fconst_1        
	//  179  342:invokevirtual   #154 <Method void View.setAlpha(float)>
			dispatchAddFinished(viewholder);
	//  180  345:aload_0         
	//  181  346:aload_1         
	//  182  347:invokevirtual   #292 <Method void dispatchAddFinished(RecyclerView$ViewHolder)>
			if(arraylist2.isEmpty())
	//* 183  350:aload           5
	//* 184  352:invokevirtual   #293 <Method boolean ArrayList.isEmpty()>
	//* 185  355:ifeq            367
				mAdditionsList.remove(l);
	//  186  358:aload_0         
	//  187  359:getfield        #66  <Field ArrayList mAdditionsList>
	//  188  362:iload_2         
	//  189  363:invokevirtual   #283 <Method Object ArrayList.remove(int)>
	//  190  366:pop             
		}

	//  191  367:iload_2         
	//  192  368:iconst_1        
	//  193  369:isub            
	//  194  370:istore_2        
	//* 195  371:goto            313
		mRemoveAnimations.remove(((Object) (viewholder)));
	//  196  374:aload_0         
	//  197  375:getfield        #76  <Field ArrayList mRemoveAnimations>
	//  198  378:aload_1         
	//  199  379:invokevirtual   #286 <Method boolean ArrayList.remove(Object)>
	//  200  382:pop             
		mAddAnimations.remove(((Object) (viewholder)));
	//  201  383:aload_0         
	//  202  384:getfield        #72  <Field ArrayList mAddAnimations>
	//  203  387:aload_1         
	//  204  388:invokevirtual   #286 <Method boolean ArrayList.remove(Object)>
	//  205  391:pop             
		mChangeAnimations.remove(((Object) (viewholder)));
	//  206  392:aload_0         
	//  207  393:getfield        #78  <Field ArrayList mChangeAnimations>
	//  208  396:aload_1         
	//  209  397:invokevirtual   #286 <Method boolean ArrayList.remove(Object)>
	//  210  400:pop             
		mMoveAnimations.remove(((Object) (viewholder)));
	//  211  401:aload_0         
	//  212  402:getfield        #74  <Field ArrayList mMoveAnimations>
	//  213  405:aload_1         
	//  214  406:invokevirtual   #286 <Method boolean ArrayList.remove(Object)>
	//  215  409:pop             
		dispatchFinishedWhenDone();
	//  216  410:aload_0         
	//  217  411:invokevirtual   #295 <Method void dispatchFinishedWhenDone()>
	//  218  414:return          
	}

	public void endAnimations()
	{
		for(int i = mPendingMoves.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field ArrayList mPendingMoves>
	//*   2    4:invokevirtual   #277 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iflt            71
		{
			MoveInfo moveinfo = (MoveInfo)mPendingMoves.get(i);
	//    8   14:aload_0         
	//    9   15:getfield        #62  <Field ArrayList mPendingMoves>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #278 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #25  <Class DefaultItemAnimator$MoveInfo>
	//   13   25:astore_3        
			View view = moveinfo.holder.itemView;
	//   14   26:aload_3         
	//   15   27:getfield        #281 <Field RecyclerView$ViewHolder DefaultItemAnimator$MoveInfo.holder>
	//   16   30:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//   17   33:astore          4
			view.setTranslationY(0.0F);
	//   18   35:aload           4
	//   19   37:fconst_0        
	//   20   38:invokevirtual   #160 <Method void View.setTranslationY(float)>
			view.setTranslationX(0.0F);
	//   21   41:aload           4
	//   22   43:fconst_0        
	//   23   44:invokevirtual   #157 <Method void View.setTranslationX(float)>
			dispatchMoveFinished(moveinfo.holder);
	//   24   47:aload_0         
	//   25   48:aload_3         
	//   26   49:getfield        #281 <Field RecyclerView$ViewHolder DefaultItemAnimator$MoveInfo.holder>
	//   27   52:invokevirtual   #241 <Method void dispatchMoveFinished(RecyclerView$ViewHolder)>
			mPendingMoves.remove(i);
	//   28   55:aload_0         
	//   29   56:getfield        #62  <Field ArrayList mPendingMoves>
	//   30   59:iload_1         
	//   31   60:invokevirtual   #283 <Method Object ArrayList.remove(int)>
	//   32   63:pop             
		}

	//   33   64:iload_1         
	//   34   65:iconst_1        
	//   35   66:isub            
	//   36   67:istore_1        
	//*  37   68:goto            10
		for(int j = mPendingRemovals.size() - 1; j >= 0; j--)
	//*  38   71:aload_0         
	//*  39   72:getfield        #58  <Field ArrayList mPendingRemovals>
	//*  40   75:invokevirtual   #277 <Method int ArrayList.size()>
	//*  41   78:iconst_1        
	//*  42   79:isub            
	//*  43   80:istore_1        
	//*  44   81:iload_1         
	//*  45   82:iflt            116
		{
			dispatchRemoveFinished((RecyclerView.ViewHolder)mPendingRemovals.get(j));
	//   46   85:aload_0         
	//   47   86:aload_0         
	//   48   87:getfield        #58  <Field ArrayList mPendingRemovals>
	//   49   90:iload_1         
	//   50   91:invokevirtual   #278 <Method Object ArrayList.get(int)>
	//   51   94:checkcast       #83  <Class RecyclerView$ViewHolder>
	//   52   97:invokevirtual   #289 <Method void dispatchRemoveFinished(RecyclerView$ViewHolder)>
			mPendingRemovals.remove(j);
	//   53  100:aload_0         
	//   54  101:getfield        #58  <Field ArrayList mPendingRemovals>
	//   55  104:iload_1         
	//   56  105:invokevirtual   #283 <Method Object ArrayList.remove(int)>
	//   57  108:pop             
		}

	//   58  109:iload_1         
	//   59  110:iconst_1        
	//   60  111:isub            
	//   61  112:istore_1        
	//*  62  113:goto            81
		for(int k = mPendingAdditions.size() - 1; k >= 0; k--)
	//*  63  116:aload_0         
	//*  64  117:getfield        #60  <Field ArrayList mPendingAdditions>
	//*  65  120:invokevirtual   #277 <Method int ArrayList.size()>
	//*  66  123:iconst_1        
	//*  67  124:isub            
	//*  68  125:istore_1        
	//*  69  126:iload_1         
	//*  70  127:iflt            171
		{
			RecyclerView.ViewHolder viewholder = (RecyclerView.ViewHolder)mPendingAdditions.get(k);
	//   71  130:aload_0         
	//   72  131:getfield        #60  <Field ArrayList mPendingAdditions>
	//   73  134:iload_1         
	//   74  135:invokevirtual   #278 <Method Object ArrayList.get(int)>
	//   75  138:checkcast       #83  <Class RecyclerView$ViewHolder>
	//   76  141:astore_3        
			viewholder.itemView.setAlpha(1.0F);
	//   77  142:aload_3         
	//   78  143:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//   79  146:fconst_1        
	//   80  147:invokevirtual   #154 <Method void View.setAlpha(float)>
			dispatchAddFinished(viewholder);
	//   81  150:aload_0         
	//   82  151:aload_3         
	//   83  152:invokevirtual   #292 <Method void dispatchAddFinished(RecyclerView$ViewHolder)>
			mPendingAdditions.remove(k);
	//   84  155:aload_0         
	//   85  156:getfield        #60  <Field ArrayList mPendingAdditions>
	//   86  159:iload_1         
	//   87  160:invokevirtual   #283 <Method Object ArrayList.remove(int)>
	//   88  163:pop             
		}

	//   89  164:iload_1         
	//   90  165:iconst_1        
	//   91  166:isub            
	//   92  167:istore_1        
	//*  93  168:goto            126
		for(int l = mPendingChanges.size() - 1; l >= 0; l--)
	//*  94  171:aload_0         
	//*  95  172:getfield        #64  <Field ArrayList mPendingChanges>
	//*  96  175:invokevirtual   #277 <Method int ArrayList.size()>
	//*  97  178:iconst_1        
	//*  98  179:isub            
	//*  99  180:istore_1        
	//* 100  181:iload_1         
	//* 101  182:iflt            207
			endChangeAnimationIfNecessary((ChangeInfo)mPendingChanges.get(l));
	//  102  185:aload_0         
	//  103  186:aload_0         
	//  104  187:getfield        #64  <Field ArrayList mPendingChanges>
	//  105  190:iload_1         
	//  106  191:invokevirtual   #278 <Method Object ArrayList.get(int)>
	//  107  194:checkcast       #22  <Class DefaultItemAnimator$ChangeInfo>
	//  108  197:invokespecial   #298 <Method void endChangeAnimationIfNecessary(DefaultItemAnimator$ChangeInfo)>

	//  109  200:iload_1         
	//  110  201:iconst_1        
	//  111  202:isub            
	//  112  203:istore_1        
	//* 113  204:goto            181
		mPendingChanges.clear();
	//  114  207:aload_0         
	//  115  208:getfield        #64  <Field ArrayList mPendingChanges>
	//  116  211:invokevirtual   #301 <Method void ArrayList.clear()>
		if(!isRunning())
	//* 117  214:aload_0         
	//* 118  215:invokevirtual   #273 <Method boolean isRunning()>
	//* 119  218:ifne            222
			return;
	//  120  221:return          
		for(int i1 = mMovesList.size() - 1; i1 >= 0; i1--)
	//* 121  222:aload_0         
	//* 122  223:getfield        #68  <Field ArrayList mMovesList>
	//* 123  226:invokevirtual   #277 <Method int ArrayList.size()>
	//* 124  229:iconst_1        
	//* 125  230:isub            
	//* 126  231:istore_1        
	//* 127  232:iload_1         
	//* 128  233:iflt            336
		{
			ArrayList arraylist = (ArrayList)mMovesList.get(i1);
	//  129  236:aload_0         
	//  130  237:getfield        #68  <Field ArrayList mMovesList>
	//  131  240:iload_1         
	//  132  241:invokevirtual   #278 <Method Object ArrayList.get(int)>
	//  133  244:checkcast       #55  <Class ArrayList>
	//  134  247:astore_3        
			for(int l1 = arraylist.size() - 1; l1 >= 0; l1--)
	//* 135  248:aload_3         
	//* 136  249:invokevirtual   #277 <Method int ArrayList.size()>
	//* 137  252:iconst_1        
	//* 138  253:isub            
	//* 139  254:istore_2        
	//* 140  255:iload_2         
	//* 141  256:iflt            329
			{
				MoveInfo moveinfo1 = (MoveInfo)arraylist.get(l1);
	//  142  259:aload_3         
	//  143  260:iload_2         
	//  144  261:invokevirtual   #278 <Method Object ArrayList.get(int)>
	//  145  264:checkcast       #25  <Class DefaultItemAnimator$MoveInfo>
	//  146  267:astore          4
				View view1 = moveinfo1.holder.itemView;
	//  147  269:aload           4
	//  148  271:getfield        #281 <Field RecyclerView$ViewHolder DefaultItemAnimator$MoveInfo.holder>
	//  149  274:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//  150  277:astore          5
				view1.setTranslationY(0.0F);
	//  151  279:aload           5
	//  152  281:fconst_0        
	//  153  282:invokevirtual   #160 <Method void View.setTranslationY(float)>
				view1.setTranslationX(0.0F);
	//  154  285:aload           5
	//  155  287:fconst_0        
	//  156  288:invokevirtual   #157 <Method void View.setTranslationX(float)>
				dispatchMoveFinished(moveinfo1.holder);
	//  157  291:aload_0         
	//  158  292:aload           4
	//  159  294:getfield        #281 <Field RecyclerView$ViewHolder DefaultItemAnimator$MoveInfo.holder>
	//  160  297:invokevirtual   #241 <Method void dispatchMoveFinished(RecyclerView$ViewHolder)>
				arraylist.remove(l1);
	//  161  300:aload_3         
	//  162  301:iload_2         
	//  163  302:invokevirtual   #283 <Method Object ArrayList.remove(int)>
	//  164  305:pop             
				if(arraylist.isEmpty())
	//* 165  306:aload_3         
	//* 166  307:invokevirtual   #293 <Method boolean ArrayList.isEmpty()>
	//* 167  310:ifeq            322
					mMovesList.remove(((Object) (arraylist)));
	//  168  313:aload_0         
	//  169  314:getfield        #68  <Field ArrayList mMovesList>
	//  170  317:aload_3         
	//  171  318:invokevirtual   #286 <Method boolean ArrayList.remove(Object)>
	//  172  321:pop             
			}

	//  173  322:iload_2         
	//  174  323:iconst_1        
	//  175  324:isub            
	//  176  325:istore_2        
		}

	//  177  326:goto            255
	//  178  329:iload_1         
	//  179  330:iconst_1        
	//  180  331:isub            
	//  181  332:istore_1        
	//* 182  333:goto            232
		for(int j1 = mAdditionsList.size() - 1; j1 >= 0; j1--)
	//* 183  336:aload_0         
	//* 184  337:getfield        #66  <Field ArrayList mAdditionsList>
	//* 185  340:invokevirtual   #277 <Method int ArrayList.size()>
	//* 186  343:iconst_1        
	//* 187  344:isub            
	//* 188  345:istore_1        
	//* 189  346:iload_1         
	//* 190  347:iflt            434
		{
			ArrayList arraylist1 = (ArrayList)mAdditionsList.get(j1);
	//  191  350:aload_0         
	//  192  351:getfield        #66  <Field ArrayList mAdditionsList>
	//  193  354:iload_1         
	//  194  355:invokevirtual   #278 <Method Object ArrayList.get(int)>
	//  195  358:checkcast       #55  <Class ArrayList>
	//  196  361:astore_3        
			for(int i2 = arraylist1.size() - 1; i2 >= 0; i2--)
	//* 197  362:aload_3         
	//* 198  363:invokevirtual   #277 <Method int ArrayList.size()>
	//* 199  366:iconst_1        
	//* 200  367:isub            
	//* 201  368:istore_2        
	//* 202  369:iload_2         
	//* 203  370:iflt            427
			{
				RecyclerView.ViewHolder viewholder1 = (RecyclerView.ViewHolder)arraylist1.get(i2);
	//  204  373:aload_3         
	//  205  374:iload_2         
	//  206  375:invokevirtual   #278 <Method Object ArrayList.get(int)>
	//  207  378:checkcast       #83  <Class RecyclerView$ViewHolder>
	//  208  381:astore          4
				viewholder1.itemView.setAlpha(1.0F);
	//  209  383:aload           4
	//  210  385:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//  211  388:fconst_1        
	//  212  389:invokevirtual   #154 <Method void View.setAlpha(float)>
				dispatchAddFinished(viewholder1);
	//  213  392:aload_0         
	//  214  393:aload           4
	//  215  395:invokevirtual   #292 <Method void dispatchAddFinished(RecyclerView$ViewHolder)>
				arraylist1.remove(i2);
	//  216  398:aload_3         
	//  217  399:iload_2         
	//  218  400:invokevirtual   #283 <Method Object ArrayList.remove(int)>
	//  219  403:pop             
				if(arraylist1.isEmpty())
	//* 220  404:aload_3         
	//* 221  405:invokevirtual   #293 <Method boolean ArrayList.isEmpty()>
	//* 222  408:ifeq            420
					mAdditionsList.remove(((Object) (arraylist1)));
	//  223  411:aload_0         
	//  224  412:getfield        #66  <Field ArrayList mAdditionsList>
	//  225  415:aload_3         
	//  226  416:invokevirtual   #286 <Method boolean ArrayList.remove(Object)>
	//  227  419:pop             
			}

	//  228  420:iload_2         
	//  229  421:iconst_1        
	//  230  422:isub            
	//  231  423:istore_2        
		}

	//  232  424:goto            369
	//  233  427:iload_1         
	//  234  428:iconst_1        
	//  235  429:isub            
	//  236  430:istore_1        
	//* 237  431:goto            346
		for(int k1 = mChangesList.size() - 1; k1 >= 0; k1--)
	//* 238  434:aload_0         
	//* 239  435:getfield        #70  <Field ArrayList mChangesList>
	//* 240  438:invokevirtual   #277 <Method int ArrayList.size()>
	//* 241  441:iconst_1        
	//* 242  442:isub            
	//* 243  443:istore_1        
	//* 244  444:iload_1         
	//* 245  445:iflt            513
		{
			ArrayList arraylist2 = (ArrayList)mChangesList.get(k1);
	//  246  448:aload_0         
	//  247  449:getfield        #70  <Field ArrayList mChangesList>
	//  248  452:iload_1         
	//  249  453:invokevirtual   #278 <Method Object ArrayList.get(int)>
	//  250  456:checkcast       #55  <Class ArrayList>
	//  251  459:astore_3        
			for(int j2 = arraylist2.size() - 1; j2 >= 0; j2--)
	//* 252  460:aload_3         
	//* 253  461:invokevirtual   #277 <Method int ArrayList.size()>
	//* 254  464:iconst_1        
	//* 255  465:isub            
	//* 256  466:istore_2        
	//* 257  467:iload_2         
	//* 258  468:iflt            506
			{
				endChangeAnimationIfNecessary((ChangeInfo)arraylist2.get(j2));
	//  259  471:aload_0         
	//  260  472:aload_3         
	//  261  473:iload_2         
	//  262  474:invokevirtual   #278 <Method Object ArrayList.get(int)>
	//  263  477:checkcast       #22  <Class DefaultItemAnimator$ChangeInfo>
	//  264  480:invokespecial   #298 <Method void endChangeAnimationIfNecessary(DefaultItemAnimator$ChangeInfo)>
				if(arraylist2.isEmpty())
	//* 265  483:aload_3         
	//* 266  484:invokevirtual   #293 <Method boolean ArrayList.isEmpty()>
	//* 267  487:ifeq            499
					mChangesList.remove(((Object) (arraylist2)));
	//  268  490:aload_0         
	//  269  491:getfield        #70  <Field ArrayList mChangesList>
	//  270  494:aload_3         
	//  271  495:invokevirtual   #286 <Method boolean ArrayList.remove(Object)>
	//  272  498:pop             
			}

	//  273  499:iload_2         
	//  274  500:iconst_1        
	//  275  501:isub            
	//  276  502:istore_2        
		}

	//  277  503:goto            467
	//  278  506:iload_1         
	//  279  507:iconst_1        
	//  280  508:isub            
	//  281  509:istore_1        
	//* 282  510:goto            444
		cancelAll(((List) (mRemoveAnimations)));
	//  283  513:aload_0         
	//  284  514:aload_0         
	//  285  515:getfield        #76  <Field ArrayList mRemoveAnimations>
	//  286  518:invokevirtual   #303 <Method void cancelAll(List)>
		cancelAll(((List) (mMoveAnimations)));
	//  287  521:aload_0         
	//  288  522:aload_0         
	//  289  523:getfield        #74  <Field ArrayList mMoveAnimations>
	//  290  526:invokevirtual   #303 <Method void cancelAll(List)>
		cancelAll(((List) (mAddAnimations)));
	//  291  529:aload_0         
	//  292  530:aload_0         
	//  293  531:getfield        #72  <Field ArrayList mAddAnimations>
	//  294  534:invokevirtual   #303 <Method void cancelAll(List)>
		cancelAll(((List) (mChangeAnimations)));
	//  295  537:aload_0         
	//  296  538:aload_0         
	//  297  539:getfield        #78  <Field ArrayList mChangeAnimations>
	//  298  542:invokevirtual   #303 <Method void cancelAll(List)>
		dispatchAnimationsFinished();
	//  299  545:aload_0         
	//  300  546:invokevirtual   #276 <Method void dispatchAnimationsFinished()>
	//  301  549:return          
	}

	public boolean isRunning()
	{
		return !mPendingAdditions.isEmpty() || !mPendingChanges.isEmpty() || !mPendingMoves.isEmpty() || !mPendingRemovals.isEmpty() || !mMoveAnimations.isEmpty() || !mRemoveAnimations.isEmpty() || !mAddAnimations.isEmpty() || !mChangeAnimations.isEmpty() || !mMovesList.isEmpty() || !mAdditionsList.isEmpty() || !mChangesList.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field ArrayList mPendingAdditions>
	//    2    4:invokevirtual   #293 <Method boolean ArrayList.isEmpty()>
	//    3    7:ifeq            115
	//    4   10:aload_0         
	//    5   11:getfield        #64  <Field ArrayList mPendingChanges>
	//    6   14:invokevirtual   #293 <Method boolean ArrayList.isEmpty()>
	//    7   17:ifeq            115
	//    8   20:aload_0         
	//    9   21:getfield        #62  <Field ArrayList mPendingMoves>
	//   10   24:invokevirtual   #293 <Method boolean ArrayList.isEmpty()>
	//   11   27:ifeq            115
	//   12   30:aload_0         
	//   13   31:getfield        #58  <Field ArrayList mPendingRemovals>
	//   14   34:invokevirtual   #293 <Method boolean ArrayList.isEmpty()>
	//   15   37:ifeq            115
	//   16   40:aload_0         
	//   17   41:getfield        #74  <Field ArrayList mMoveAnimations>
	//   18   44:invokevirtual   #293 <Method boolean ArrayList.isEmpty()>
	//   19   47:ifeq            115
	//   20   50:aload_0         
	//   21   51:getfield        #76  <Field ArrayList mRemoveAnimations>
	//   22   54:invokevirtual   #293 <Method boolean ArrayList.isEmpty()>
	//   23   57:ifeq            115
	//   24   60:aload_0         
	//   25   61:getfield        #72  <Field ArrayList mAddAnimations>
	//   26   64:invokevirtual   #293 <Method boolean ArrayList.isEmpty()>
	//   27   67:ifeq            115
	//   28   70:aload_0         
	//   29   71:getfield        #78  <Field ArrayList mChangeAnimations>
	//   30   74:invokevirtual   #293 <Method boolean ArrayList.isEmpty()>
	//   31   77:ifeq            115
	//   32   80:aload_0         
	//   33   81:getfield        #68  <Field ArrayList mMovesList>
	//   34   84:invokevirtual   #293 <Method boolean ArrayList.isEmpty()>
	//   35   87:ifeq            115
	//   36   90:aload_0         
	//   37   91:getfield        #66  <Field ArrayList mAdditionsList>
	//   38   94:invokevirtual   #293 <Method boolean ArrayList.isEmpty()>
	//   39   97:ifeq            115
	//   40  100:aload_0         
	//   41  101:getfield        #70  <Field ArrayList mChangesList>
	//   42  104:invokevirtual   #293 <Method boolean ArrayList.isEmpty()>
	//   43  107:ifne            113
	//   44  110:goto            115
	//   45  113:iconst_0        
	//   46  114:ireturn         
	//   47  115:iconst_1        
	//   48  116:ireturn         
	}

	public void runPendingAnimations()
	{
		boolean flag = mPendingRemovals.isEmpty() ^ true;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field ArrayList mPendingRemovals>
	//    2    4:invokevirtual   #293 <Method boolean ArrayList.isEmpty()>
	//    3    7:iconst_1        
	//    4    8:ixor            
	//    5    9:istore_1        
		boolean flag1 = mPendingMoves.isEmpty() ^ true;
	//    6   10:aload_0         
	//    7   11:getfield        #62  <Field ArrayList mPendingMoves>
	//    8   14:invokevirtual   #293 <Method boolean ArrayList.isEmpty()>
	//    9   17:iconst_1        
	//   10   18:ixor            
	//   11   19:istore_2        
		boolean flag2 = mPendingChanges.isEmpty() ^ true;
	//   12   20:aload_0         
	//   13   21:getfield        #64  <Field ArrayList mPendingChanges>
	//   14   24:invokevirtual   #293 <Method boolean ArrayList.isEmpty()>
	//   15   27:iconst_1        
	//   16   28:ixor            
	//   17   29:istore_3        
		boolean flag3 = mPendingAdditions.isEmpty() ^ true;
	//   18   30:aload_0         
	//   19   31:getfield        #60  <Field ArrayList mPendingAdditions>
	//   20   34:invokevirtual   #293 <Method boolean ArrayList.isEmpty()>
	//   21   37:iconst_1        
	//   22   38:ixor            
	//   23   39:istore          4
		if(!flag && !flag1 && !flag3 && !flag2)
	//*  24   41:iload_1         
	//*  25   42:ifne            59
	//*  26   45:iload_2         
	//*  27   46:ifne            59
	//*  28   49:iload           4
	//*  29   51:ifne            59
	//*  30   54:iload_3         
	//*  31   55:ifne            59
			return;
	//   32   58:return          
		for(Iterator iterator = mPendingRemovals.iterator(); iterator.hasNext(); animateRemoveImpl((RecyclerView.ViewHolder)iterator.next()));
	//   33   59:aload_0         
	//   34   60:getfield        #58  <Field ArrayList mPendingRemovals>
	//   35   63:invokevirtual   #308 <Method Iterator ArrayList.iterator()>
	//   36   66:astore          11
	//   37   68:aload           11
	//   38   70:invokeinterface #313 <Method boolean Iterator.hasNext()>
	//   39   75:ifeq            95
	//   40   78:aload_0         
	//   41   79:aload           11
	//   42   81:invokeinterface #317 <Method Object Iterator.next()>
	//   43   86:checkcast       #83  <Class RecyclerView$ViewHolder>
	//   44   89:invokespecial   #319 <Method void animateRemoveImpl(RecyclerView$ViewHolder)>
	//*  45   92:goto            68
		mPendingRemovals.clear();
	//   46   95:aload_0         
	//   47   96:getfield        #58  <Field ArrayList mPendingRemovals>
	//   48   99:invokevirtual   #301 <Method void ArrayList.clear()>
		if(flag1)
	//*  49  102:iload_2         
	//*  50  103:ifeq            192
		{
			final ArrayList moves = new ArrayList();
	//   51  106:new             #55  <Class ArrayList>
	//   52  109:dup             
	//   53  110:invokespecial   #56  <Method void ArrayList()>
	//   54  113:astore          11
			moves.addAll(((java.util.Collection) (mPendingMoves)));
	//   55  115:aload           11
	//   56  117:aload_0         
	//   57  118:getfield        #62  <Field ArrayList mPendingMoves>
	//   58  121:invokevirtual   #323 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   59  124:pop             
			mMovesList.add(((Object) (moves)));
	//   60  125:aload_0         
	//   61  126:getfield        #68  <Field ArrayList mMovesList>
	//   62  129:aload           11
	//   63  131:invokevirtual   #97  <Method boolean ArrayList.add(Object)>
	//   64  134:pop             
			mPendingMoves.clear();
	//   65  135:aload_0         
	//   66  136:getfield        #62  <Field ArrayList mPendingMoves>
	//   67  139:invokevirtual   #301 <Method void ArrayList.clear()>
			Runnable runnable = new Runnable() {

				public void run()
				{
					MoveInfo moveinfo;
					for(Iterator iterator1 = moves.iterator(); iterator1.hasNext(); animateMoveImpl(moveinfo.holder, moveinfo.fromX, moveinfo.fromY, moveinfo.toX, moveinfo.toY))
				//*   0    0:aload_0         
				//*   1    1:getfield        #21  <Field ArrayList val$moves>
				//*   2    4:invokevirtual   #31  <Method Iterator ArrayList.iterator()>
				//*   3    7:astore_1        
				//*   4    8:aload_1         
				//*   5    9:invokeinterface #37  <Method boolean Iterator.hasNext()>
				//*   6   14:ifeq            57
						moveinfo = (MoveInfo)iterator1.next();
				//    7   17:aload_1         
				//    8   18:invokeinterface #41  <Method Object Iterator.next()>
				//    9   23:checkcast       #43  <Class DefaultItemAnimator$MoveInfo>
				//   10   26:astore_2        

				//   11   27:aload_0         
				//   12   28:getfield        #19  <Field DefaultItemAnimator this$0>
				//   13   31:aload_2         
				//   14   32:getfield        #47  <Field RecyclerView$ViewHolder DefaultItemAnimator$MoveInfo.holder>
				//   15   35:aload_2         
				//   16   36:getfield        #51  <Field int DefaultItemAnimator$MoveInfo.fromX>
				//   17   39:aload_2         
				//   18   40:getfield        #54  <Field int DefaultItemAnimator$MoveInfo.fromY>
				//   19   43:aload_2         
				//   20   44:getfield        #57  <Field int DefaultItemAnimator$MoveInfo.toX>
				//   21   47:aload_2         
				//   22   48:getfield        #60  <Field int DefaultItemAnimator$MoveInfo.toY>
				//   23   51:invokevirtual   #64  <Method void DefaultItemAnimator.animateMoveImpl(RecyclerView$ViewHolder, int, int, int, int)>
				//*  24   54:goto            8
					moves.clear();
				//   25   57:aload_0         
				//   26   58:getfield        #21  <Field ArrayList val$moves>
				//   27   61:invokevirtual   #67  <Method void ArrayList.clear()>
					mMovesList.remove(((Object) (moves)));
				//   28   64:aload_0         
				//   29   65:getfield        #19  <Field DefaultItemAnimator this$0>
				//   30   68:getfield        #70  <Field ArrayList DefaultItemAnimator.mMovesList>
				//   31   71:aload_0         
				//   32   72:getfield        #21  <Field ArrayList val$moves>
				//   33   75:invokevirtual   #74  <Method boolean ArrayList.remove(Object)>
				//   34   78:pop             
				//   35   79:return          
				}

				final DefaultItemAnimator this$0;
				final ArrayList val$moves;

			
			{
				this$0 = DefaultItemAnimator.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field DefaultItemAnimator this$0>
				moves = arraylist;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ArrayList val$moves>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
;
	//   68  142:new             #6   <Class DefaultItemAnimator$1>
	//   69  145:dup             
	//   70  146:aload_0         
	//   71  147:aload           11
	//   72  149:invokespecial   #326 <Method void DefaultItemAnimator$1(DefaultItemAnimator, ArrayList)>
	//   73  152:astore          12
			if(flag)
	//*  74  154:iload_1         
	//*  75  155:ifeq            185
				ViewCompat.postOnAnimationDelayed(((MoveInfo)moves.get(0)).holder.itemView, runnable, getRemoveDuration());
	//   76  158:aload           11
	//   77  160:iconst_0        
	//   78  161:invokevirtual   #278 <Method Object ArrayList.get(int)>
	//   79  164:checkcast       #25  <Class DefaultItemAnimator$MoveInfo>
	//   80  167:getfield        #281 <Field RecyclerView$ViewHolder DefaultItemAnimator$MoveInfo.holder>
	//   81  170:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//   82  173:aload           12
	//   83  175:aload_0         
	//   84  176:invokevirtual   #101 <Method long getRemoveDuration()>
	//   85  179:invokestatic    #332 <Method void ViewCompat.postOnAnimationDelayed(View, Runnable, long)>
			else
	//*  86  182:goto            192
				runnable.run();
	//   87  185:aload           12
	//   88  187:invokeinterface #337 <Method void Runnable.run()>
		}
		if(flag2)
	//*  89  192:iload_3         
	//*  90  193:ifeq            282
		{
			final ArrayList changes = new ArrayList();
	//   91  196:new             #55  <Class ArrayList>
	//   92  199:dup             
	//   93  200:invokespecial   #56  <Method void ArrayList()>
	//   94  203:astore          11
			changes.addAll(((java.util.Collection) (mPendingChanges)));
	//   95  205:aload           11
	//   96  207:aload_0         
	//   97  208:getfield        #64  <Field ArrayList mPendingChanges>
	//   98  211:invokevirtual   #323 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   99  214:pop             
			mChangesList.add(((Object) (changes)));
	//  100  215:aload_0         
	//  101  216:getfield        #70  <Field ArrayList mChangesList>
	//  102  219:aload           11
	//  103  221:invokevirtual   #97  <Method boolean ArrayList.add(Object)>
	//  104  224:pop             
			mPendingChanges.clear();
	//  105  225:aload_0         
	//  106  226:getfield        #64  <Field ArrayList mPendingChanges>
	//  107  229:invokevirtual   #301 <Method void ArrayList.clear()>
			Runnable runnable1 = new Runnable() {

				public void run()
				{
					ChangeInfo changeinfo;
					for(Iterator iterator1 = changes.iterator(); iterator1.hasNext(); animateChangeImpl(changeinfo))
				//*   0    0:aload_0         
				//*   1    1:getfield        #21  <Field ArrayList val$changes>
				//*   2    4:invokevirtual   #31  <Method Iterator ArrayList.iterator()>
				//*   3    7:astore_1        
				//*   4    8:aload_1         
				//*   5    9:invokeinterface #37  <Method boolean Iterator.hasNext()>
				//*   6   14:ifeq            38
						changeinfo = (ChangeInfo)iterator1.next();
				//    7   17:aload_1         
				//    8   18:invokeinterface #41  <Method Object Iterator.next()>
				//    9   23:checkcast       #43  <Class DefaultItemAnimator$ChangeInfo>
				//   10   26:astore_2        

				//   11   27:aload_0         
				//   12   28:getfield        #19  <Field DefaultItemAnimator this$0>
				//   13   31:aload_2         
				//   14   32:invokevirtual   #47  <Method void DefaultItemAnimator.animateChangeImpl(DefaultItemAnimator$ChangeInfo)>
				//*  15   35:goto            8
					changes.clear();
				//   16   38:aload_0         
				//   17   39:getfield        #21  <Field ArrayList val$changes>
				//   18   42:invokevirtual   #50  <Method void ArrayList.clear()>
					mChangesList.remove(((Object) (changes)));
				//   19   45:aload_0         
				//   20   46:getfield        #19  <Field DefaultItemAnimator this$0>
				//   21   49:getfield        #53  <Field ArrayList DefaultItemAnimator.mChangesList>
				//   22   52:aload_0         
				//   23   53:getfield        #21  <Field ArrayList val$changes>
				//   24   56:invokevirtual   #57  <Method boolean ArrayList.remove(Object)>
				//   25   59:pop             
				//   26   60:return          
				}

				final DefaultItemAnimator this$0;
				final ArrayList val$changes;

			
			{
				this$0 = DefaultItemAnimator.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field DefaultItemAnimator this$0>
				changes = arraylist;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ArrayList val$changes>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
;
	//  108  232:new             #8   <Class DefaultItemAnimator$2>
	//  109  235:dup             
	//  110  236:aload_0         
	//  111  237:aload           11
	//  112  239:invokespecial   #338 <Method void DefaultItemAnimator$2(DefaultItemAnimator, ArrayList)>
	//  113  242:astore          12
			if(flag)
	//* 114  244:iload_1         
	//* 115  245:ifeq            275
				ViewCompat.postOnAnimationDelayed(((ChangeInfo)changes.get(0)).oldHolder.itemView, runnable1, getRemoveDuration());
	//  116  248:aload           11
	//  117  250:iconst_0        
	//  118  251:invokevirtual   #278 <Method Object ArrayList.get(int)>
	//  119  254:checkcast       #22  <Class DefaultItemAnimator$ChangeInfo>
	//  120  257:getfield        #141 <Field RecyclerView$ViewHolder DefaultItemAnimator$ChangeInfo.oldHolder>
	//  121  260:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//  122  263:aload           12
	//  123  265:aload_0         
	//  124  266:invokevirtual   #101 <Method long getRemoveDuration()>
	//  125  269:invokestatic    #332 <Method void ViewCompat.postOnAnimationDelayed(View, Runnable, long)>
			else
	//* 126  272:goto            282
				runnable1.run();
	//  127  275:aload           12
	//  128  277:invokeinterface #337 <Method void Runnable.run()>
		}
		if(flag3)
	//* 129  282:iload           4
	//* 130  284:ifeq            434
		{
			final ArrayList additions = new ArrayList();
	//  131  287:new             #55  <Class ArrayList>
	//  132  290:dup             
	//  133  291:invokespecial   #56  <Method void ArrayList()>
	//  134  294:astore          11
			additions.addAll(((java.util.Collection) (mPendingAdditions)));
	//  135  296:aload           11
	//  136  298:aload_0         
	//  137  299:getfield        #60  <Field ArrayList mPendingAdditions>
	//  138  302:invokevirtual   #323 <Method boolean ArrayList.addAll(java.util.Collection)>
	//  139  305:pop             
			mAdditionsList.add(((Object) (additions)));
	//  140  306:aload_0         
	//  141  307:getfield        #66  <Field ArrayList mAdditionsList>
	//  142  310:aload           11
	//  143  312:invokevirtual   #97  <Method boolean ArrayList.add(Object)>
	//  144  315:pop             
			mPendingAdditions.clear();
	//  145  316:aload_0         
	//  146  317:getfield        #60  <Field ArrayList mPendingAdditions>
	//  147  320:invokevirtual   #301 <Method void ArrayList.clear()>
			Runnable runnable2 = new Runnable() {

				public void run()
				{
					RecyclerView.ViewHolder viewholder;
					for(Iterator iterator1 = additions.iterator(); iterator1.hasNext(); animateAddImpl(viewholder))
				//*   0    0:aload_0         
				//*   1    1:getfield        #21  <Field ArrayList val$additions>
				//*   2    4:invokevirtual   #31  <Method Iterator ArrayList.iterator()>
				//*   3    7:astore_1        
				//*   4    8:aload_1         
				//*   5    9:invokeinterface #37  <Method boolean Iterator.hasNext()>
				//*   6   14:ifeq            38
						viewholder = (RecyclerView.ViewHolder)iterator1.next();
				//    7   17:aload_1         
				//    8   18:invokeinterface #41  <Method Object Iterator.next()>
				//    9   23:checkcast       #43  <Class RecyclerView$ViewHolder>
				//   10   26:astore_2        

				//   11   27:aload_0         
				//   12   28:getfield        #19  <Field DefaultItemAnimator this$0>
				//   13   31:aload_2         
				//   14   32:invokevirtual   #47  <Method void DefaultItemAnimator.animateAddImpl(RecyclerView$ViewHolder)>
				//*  15   35:goto            8
					additions.clear();
				//   16   38:aload_0         
				//   17   39:getfield        #21  <Field ArrayList val$additions>
				//   18   42:invokevirtual   #50  <Method void ArrayList.clear()>
					mAdditionsList.remove(((Object) (additions)));
				//   19   45:aload_0         
				//   20   46:getfield        #19  <Field DefaultItemAnimator this$0>
				//   21   49:getfield        #53  <Field ArrayList DefaultItemAnimator.mAdditionsList>
				//   22   52:aload_0         
				//   23   53:getfield        #21  <Field ArrayList val$additions>
				//   24   56:invokevirtual   #57  <Method boolean ArrayList.remove(Object)>
				//   25   59:pop             
				//   26   60:return          
				}

				final DefaultItemAnimator this$0;
				final ArrayList val$additions;

			
			{
				this$0 = DefaultItemAnimator.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field DefaultItemAnimator this$0>
				additions = arraylist;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ArrayList val$additions>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
;
	//  148  323:new             #10  <Class DefaultItemAnimator$3>
	//  149  326:dup             
	//  150  327:aload_0         
	//  151  328:aload           11
	//  152  330:invokespecial   #339 <Method void DefaultItemAnimator$3(DefaultItemAnimator, ArrayList)>
	//  153  333:astore          12
			if(!flag && !flag1 && !flag2)
	//* 154  335:iload_1         
	//* 155  336:ifne            358
	//* 156  339:iload_2         
	//* 157  340:ifne            358
	//* 158  343:iload_3         
	//* 159  344:ifeq            350
	//* 160  347:goto            358
			{
				runnable2.run();
	//  161  350:aload           12
	//  162  352:invokeinterface #337 <Method void Runnable.run()>
				return;
	//  163  357:return          
			}
			long l2 = 0L;
	//  164  358:lconst_0        
	//  165  359:lstore          9
			long l;
			if(flag)
	//* 166  361:iload_1         
	//* 167  362:ifeq            374
				l = getRemoveDuration();
	//  168  365:aload_0         
	//  169  366:invokevirtual   #101 <Method long getRemoveDuration()>
	//  170  369:lstore          5
			else
	//* 171  371:goto            377
				l = 0L;
	//  172  374:lconst_0        
	//  173  375:lstore          5
			long l1;
			if(flag1)
	//* 174  377:iload_2         
	//* 175  378:ifeq            390
				l1 = getMoveDuration();
	//  176  381:aload_0         
	//  177  382:invokevirtual   #248 <Method long getMoveDuration()>
	//  178  385:lstore          7
			else
	//* 179  387:goto            393
				l1 = 0L;
	//  180  390:lconst_0        
	//  181  391:lstore          7
			if(flag2)
	//* 182  393:iload_3         
	//* 183  394:ifeq            403
				l2 = getChangeDuration();
	//  184  397:aload_0         
	//  185  398:invokevirtual   #215 <Method long getChangeDuration()>
	//  186  401:lstore          9
			l1 = Math.max(l1, l2);
	//  187  403:lload           7
	//  188  405:lload           9
	//  189  407:invokestatic    #345 <Method long Math.max(long, long)>
	//  190  410:lstore          7
			ViewCompat.postOnAnimationDelayed(((RecyclerView.ViewHolder)additions.get(0)).itemView, runnable2, l + l1);
	//  191  412:aload           11
	//  192  414:iconst_0        
	//  193  415:invokevirtual   #278 <Method Object ArrayList.get(int)>
	//  194  418:checkcast       #83  <Class RecyclerView$ViewHolder>
	//  195  421:getfield        #87  <Field View RecyclerView$ViewHolder.itemView>
	//  196  424:aload           12
	//  197  426:lload           5
	//  198  428:lload           7
	//  199  430:ladd            
	//  200  431:invokestatic    #332 <Method void ViewCompat.postOnAnimationDelayed(View, Runnable, long)>
		}
	//  201  434:return          
	}

	private static final boolean DEBUG = false;
	private static TimeInterpolator sDefaultInterpolator;
	ArrayList mAddAnimations;
	ArrayList mAdditionsList;
	ArrayList mChangeAnimations;
	ArrayList mChangesList;
	ArrayList mMoveAnimations;
	ArrayList mMovesList;
	private ArrayList mPendingAdditions;
	private ArrayList mPendingChanges;
	private ArrayList mPendingMoves;
	private ArrayList mPendingRemovals;
	ArrayList mRemoveAnimations;
}
