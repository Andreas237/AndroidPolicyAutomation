// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			RecyclerView

class RecyclerView$ItemAnimatorRestoreListener
	implements tener
{

	public void onAnimationFinished(RecyclerView.ViewHolder viewholder)
	{
		viewholder.setIsRecyclable(true);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #24  <Method void RecyclerView$ViewHolder.setIsRecyclable(boolean)>
		if(viewholder.mShadowedHolder != null && viewholder.mShadowingHolder == null)
	//*   3    5:aload_1         
	//*   4    6:getfield        #28  <Field RecyclerView$ViewHolder RecyclerView$ViewHolder.mShadowedHolder>
	//*   5    9:ifnull          24
	//*   6   12:aload_1         
	//*   7   13:getfield        #31  <Field RecyclerView$ViewHolder RecyclerView$ViewHolder.mShadowingHolder>
	//*   8   16:ifnonnull       24
			viewholder.mShadowedHolder = null;
	//    9   19:aload_1         
	//   10   20:aconst_null     
	//   11   21:putfield        #28  <Field RecyclerView$ViewHolder RecyclerView$ViewHolder.mShadowedHolder>
		viewholder.mShadowingHolder = null;
	//   12   24:aload_1         
	//   13   25:aconst_null     
	//   14   26:putfield        #31  <Field RecyclerView$ViewHolder RecyclerView$ViewHolder.mShadowingHolder>
		if(!viewholder.shouldBeKeptAsChild() && !removeAnimatingView(viewholder.itemView) && viewholder.isTmpDetached())
	//*  15   29:aload_1         
	//*  16   30:invokevirtual   #35  <Method boolean RecyclerView$ViewHolder.shouldBeKeptAsChild()>
	//*  17   33:ifne            69
	//*  18   36:aload_0         
	//*  19   37:getfield        #12  <Field RecyclerView this$0>
	//*  20   40:aload_1         
	//*  21   41:getfield        #39  <Field android.view.View RecyclerView$ViewHolder.itemView>
	//*  22   44:invokevirtual   #45  <Method boolean RecyclerView.removeAnimatingView(android.view.View)>
	//*  23   47:ifne            69
	//*  24   50:aload_1         
	//*  25   51:invokevirtual   #48  <Method boolean RecyclerView$ViewHolder.isTmpDetached()>
	//*  26   54:ifeq            69
			removeDetachedView(viewholder.itemView, false);
	//   27   57:aload_0         
	//   28   58:getfield        #12  <Field RecyclerView this$0>
	//   29   61:aload_1         
	//   30   62:getfield        #39  <Field android.view.View RecyclerView$ViewHolder.itemView>
	//   31   65:iconst_0        
	//   32   66:invokevirtual   #52  <Method void RecyclerView.removeDetachedView(android.view.View, boolean)>
	//   33   69:return          
	}

	final RecyclerView this$0;

	RecyclerView$ItemAnimatorRestoreListener()
	{
		this$0 = RecyclerView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field RecyclerView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
