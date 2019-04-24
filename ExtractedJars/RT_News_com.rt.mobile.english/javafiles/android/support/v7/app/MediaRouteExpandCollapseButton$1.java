// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.graphics.drawable.AnimationDrawable;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//			MediaRouteExpandCollapseButton

class MediaRouteExpandCollapseButton$1
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		mIsGroupExpanded = mIsGroupExpanded ^ true;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MediaRouteExpandCollapseButton this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field MediaRouteExpandCollapseButton this$0>
	//    4    8:getfield        #26  <Field boolean MediaRouteExpandCollapseButton.mIsGroupExpanded>
	//    5   11:iconst_1        
	//    6   12:ixor            
	//    7   13:putfield        #26  <Field boolean MediaRouteExpandCollapseButton.mIsGroupExpanded>
		if(mIsGroupExpanded)
	//*   8   16:aload_0         
	//*   9   17:getfield        #16  <Field MediaRouteExpandCollapseButton this$0>
	//*  10   20:getfield        #26  <Field boolean MediaRouteExpandCollapseButton.mIsGroupExpanded>
	//*  11   23:ifeq            67
		{
			setImageDrawable(((android.graphics.drawable.Drawable) (mExpandAnimationDrawable)));
	//   12   26:aload_0         
	//   13   27:getfield        #16  <Field MediaRouteExpandCollapseButton this$0>
	//   14   30:aload_0         
	//   15   31:getfield        #16  <Field MediaRouteExpandCollapseButton this$0>
	//   16   34:getfield        #30  <Field AnimationDrawable MediaRouteExpandCollapseButton.mExpandAnimationDrawable>
	//   17   37:invokevirtual   #34  <Method void MediaRouteExpandCollapseButton.setImageDrawable(android.graphics.drawable.Drawable)>
			mExpandAnimationDrawable.start();
	//   18   40:aload_0         
	//   19   41:getfield        #16  <Field MediaRouteExpandCollapseButton this$0>
	//   20   44:getfield        #30  <Field AnimationDrawable MediaRouteExpandCollapseButton.mExpandAnimationDrawable>
	//   21   47:invokevirtual   #39  <Method void AnimationDrawable.start()>
			setContentDescription(((CharSequence) (mCollapseGroupDescription)));
	//   22   50:aload_0         
	//   23   51:getfield        #16  <Field MediaRouteExpandCollapseButton this$0>
	//   24   54:aload_0         
	//   25   55:getfield        #16  <Field MediaRouteExpandCollapseButton this$0>
	//   26   58:getfield        #43  <Field String MediaRouteExpandCollapseButton.mCollapseGroupDescription>
	//   27   61:invokevirtual   #47  <Method void MediaRouteExpandCollapseButton.setContentDescription(CharSequence)>
		} else
	//*  28   64:goto            105
		{
			setImageDrawable(((android.graphics.drawable.Drawable) (mCollapseAnimationDrawable)));
	//   29   67:aload_0         
	//   30   68:getfield        #16  <Field MediaRouteExpandCollapseButton this$0>
	//   31   71:aload_0         
	//   32   72:getfield        #16  <Field MediaRouteExpandCollapseButton this$0>
	//   33   75:getfield        #50  <Field AnimationDrawable MediaRouteExpandCollapseButton.mCollapseAnimationDrawable>
	//   34   78:invokevirtual   #34  <Method void MediaRouteExpandCollapseButton.setImageDrawable(android.graphics.drawable.Drawable)>
			mCollapseAnimationDrawable.start();
	//   35   81:aload_0         
	//   36   82:getfield        #16  <Field MediaRouteExpandCollapseButton this$0>
	//   37   85:getfield        #50  <Field AnimationDrawable MediaRouteExpandCollapseButton.mCollapseAnimationDrawable>
	//   38   88:invokevirtual   #39  <Method void AnimationDrawable.start()>
			setContentDescription(((CharSequence) (mExpandGroupDescription)));
	//   39   91:aload_0         
	//   40   92:getfield        #16  <Field MediaRouteExpandCollapseButton this$0>
	//   41   95:aload_0         
	//   42   96:getfield        #16  <Field MediaRouteExpandCollapseButton this$0>
	//   43   99:getfield        #53  <Field String MediaRouteExpandCollapseButton.mExpandGroupDescription>
	//   44  102:invokevirtual   #47  <Method void MediaRouteExpandCollapseButton.setContentDescription(CharSequence)>
		}
		if(mListener != null)
	//*  45  105:aload_0         
	//*  46  106:getfield        #16  <Field MediaRouteExpandCollapseButton this$0>
	//*  47  109:getfield        #57  <Field android.view.View$OnClickListener MediaRouteExpandCollapseButton.mListener>
	//*  48  112:ifnull          128
			mListener.onClick(view);
	//   49  115:aload_0         
	//   50  116:getfield        #16  <Field MediaRouteExpandCollapseButton this$0>
	//   51  119:getfield        #57  <Field android.view.View$OnClickListener MediaRouteExpandCollapseButton.mListener>
	//   52  122:aload_1         
	//   53  123:invokeinterface #59  <Method void android.view.View$OnClickListener.onClick(View)>
	//   54  128:return          
	}

	final MediaRouteExpandCollapseButton this$0;

	MediaRouteExpandCollapseButton$1()
	{
		this$0 = MediaRouteExpandCollapseButton.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field MediaRouteExpandCollapseButton this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
