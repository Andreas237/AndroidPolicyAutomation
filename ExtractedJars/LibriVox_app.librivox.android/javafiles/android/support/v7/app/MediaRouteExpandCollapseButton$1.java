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
		MediaRouteExpandCollapseButton mediarouteexpandcollapsebutton = MediaRouteExpandCollapseButton.this;
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field MediaRouteExpandCollapseButton this$0>
	//    2    4:astore_2        
		mediarouteexpandcollapsebutton.mIsGroupExpanded = mediarouteexpandcollapsebutton.mIsGroupExpanded ^ true;
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:getfield        #24  <Field boolean MediaRouteExpandCollapseButton.mIsGroupExpanded>
	//    6   10:iconst_1        
	//    7   11:ixor            
	//    8   12:putfield        #24  <Field boolean MediaRouteExpandCollapseButton.mIsGroupExpanded>
		if(mIsGroupExpanded)
	//*   9   15:aload_0         
	//*  10   16:getfield        #12  <Field MediaRouteExpandCollapseButton this$0>
	//*  11   19:getfield        #24  <Field boolean MediaRouteExpandCollapseButton.mIsGroupExpanded>
	//*  12   22:ifeq            64
		{
			MediaRouteExpandCollapseButton mediarouteexpandcollapsebutton1 = MediaRouteExpandCollapseButton.this;
	//   13   25:aload_0         
	//   14   26:getfield        #12  <Field MediaRouteExpandCollapseButton this$0>
	//   15   29:astore_2        
			mediarouteexpandcollapsebutton1.setImageDrawable(((android.graphics.drawable.Drawable) (mediarouteexpandcollapsebutton1.mExpandAnimationDrawable)));
	//   16   30:aload_2         
	//   17   31:aload_2         
	//   18   32:getfield        #28  <Field AnimationDrawable MediaRouteExpandCollapseButton.mExpandAnimationDrawable>
	//   19   35:invokevirtual   #32  <Method void MediaRouteExpandCollapseButton.setImageDrawable(android.graphics.drawable.Drawable)>
			mExpandAnimationDrawable.start();
	//   20   38:aload_0         
	//   21   39:getfield        #12  <Field MediaRouteExpandCollapseButton this$0>
	//   22   42:getfield        #28  <Field AnimationDrawable MediaRouteExpandCollapseButton.mExpandAnimationDrawable>
	//   23   45:invokevirtual   #37  <Method void AnimationDrawable.start()>
			mediarouteexpandcollapsebutton1 = MediaRouteExpandCollapseButton.this;
	//   24   48:aload_0         
	//   25   49:getfield        #12  <Field MediaRouteExpandCollapseButton this$0>
	//   26   52:astore_2        
			mediarouteexpandcollapsebutton1.setContentDescription(((CharSequence) (mediarouteexpandcollapsebutton1.mCollapseGroupDescription)));
	//   27   53:aload_2         
	//   28   54:aload_2         
	//   29   55:getfield        #41  <Field String MediaRouteExpandCollapseButton.mCollapseGroupDescription>
	//   30   58:invokevirtual   #45  <Method void MediaRouteExpandCollapseButton.setContentDescription(CharSequence)>
		} else
	//*  31   61:goto            100
		{
			MediaRouteExpandCollapseButton mediarouteexpandcollapsebutton2 = MediaRouteExpandCollapseButton.this;
	//   32   64:aload_0         
	//   33   65:getfield        #12  <Field MediaRouteExpandCollapseButton this$0>
	//   34   68:astore_2        
			mediarouteexpandcollapsebutton2.setImageDrawable(((android.graphics.drawable.Drawable) (mediarouteexpandcollapsebutton2.mCollapseAnimationDrawable)));
	//   35   69:aload_2         
	//   36   70:aload_2         
	//   37   71:getfield        #48  <Field AnimationDrawable MediaRouteExpandCollapseButton.mCollapseAnimationDrawable>
	//   38   74:invokevirtual   #32  <Method void MediaRouteExpandCollapseButton.setImageDrawable(android.graphics.drawable.Drawable)>
			mCollapseAnimationDrawable.start();
	//   39   77:aload_0         
	//   40   78:getfield        #12  <Field MediaRouteExpandCollapseButton this$0>
	//   41   81:getfield        #48  <Field AnimationDrawable MediaRouteExpandCollapseButton.mCollapseAnimationDrawable>
	//   42   84:invokevirtual   #37  <Method void AnimationDrawable.start()>
			mediarouteexpandcollapsebutton2 = MediaRouteExpandCollapseButton.this;
	//   43   87:aload_0         
	//   44   88:getfield        #12  <Field MediaRouteExpandCollapseButton this$0>
	//   45   91:astore_2        
			mediarouteexpandcollapsebutton2.setContentDescription(((CharSequence) (mediarouteexpandcollapsebutton2.mExpandGroupDescription)));
	//   46   92:aload_2         
	//   47   93:aload_2         
	//   48   94:getfield        #51  <Field String MediaRouteExpandCollapseButton.mExpandGroupDescription>
	//   49   97:invokevirtual   #45  <Method void MediaRouteExpandCollapseButton.setContentDescription(CharSequence)>
		}
		if(mListener != null)
	//*  50  100:aload_0         
	//*  51  101:getfield        #12  <Field MediaRouteExpandCollapseButton this$0>
	//*  52  104:getfield        #55  <Field android.view.View$OnClickListener MediaRouteExpandCollapseButton.mListener>
	//*  53  107:ifnull          123
			mListener.onClick(view);
	//   54  110:aload_0         
	//   55  111:getfield        #12  <Field MediaRouteExpandCollapseButton this$0>
	//   56  114:getfield        #55  <Field android.view.View$OnClickListener MediaRouteExpandCollapseButton.mListener>
	//   57  117:aload_1         
	//   58  118:invokeinterface #57  <Method void android.view.View$OnClickListener.onClick(View)>
	//   59  123:return          
	}

	final MediaRouteExpandCollapseButton this$0;

	MediaRouteExpandCollapseButton$1()
	{
		this$0 = MediaRouteExpandCollapseButton.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field MediaRouteExpandCollapseButton this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
