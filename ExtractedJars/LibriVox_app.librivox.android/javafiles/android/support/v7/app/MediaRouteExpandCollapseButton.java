// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.support.v4.a.c;
import android.util.AttributeSet;
import android.widget.ImageButton;

// Referenced classes of package android.support.v7.app:
//			MediaRouterThemeHelper

class MediaRouteExpandCollapseButton extends ImageButton
{

	public MediaRouteExpandCollapseButton(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #19  <Method void MediaRouteExpandCollapseButton(Context, AttributeSet)>
	//    4    6:return          
	}

	public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #23  <Method void MediaRouteExpandCollapseButton(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #24  <Method void ImageButton(Context, AttributeSet, int)>
		mExpandAnimationDrawable = (AnimationDrawable)c.a(context, android.support.v7.mediarouter.R.drawable.mr_group_expand);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:getstatic       #30  <Field int android.support.v7.mediarouter.R$drawable.mr_group_expand>
	//    8   12:invokestatic    #36  <Method android.graphics.drawable.Drawable c.a(Context, int)>
	//    9   15:checkcast       #38  <Class AnimationDrawable>
	//   10   18:putfield        #40  <Field AnimationDrawable mExpandAnimationDrawable>
		mCollapseAnimationDrawable = (AnimationDrawable)c.a(context, android.support.v7.mediarouter.R.drawable.mr_group_collapse);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:getstatic       #43  <Field int android.support.v7.mediarouter.R$drawable.mr_group_collapse>
	//   14   26:invokestatic    #36  <Method android.graphics.drawable.Drawable c.a(Context, int)>
	//   15   29:checkcast       #38  <Class AnimationDrawable>
	//   16   32:putfield        #45  <Field AnimationDrawable mCollapseAnimationDrawable>
		attributeset = ((AttributeSet) (new PorterDuffColorFilter(MediaRouterThemeHelper.getControllerColor(context, i), android.graphics.PorterDuff.Mode.SRC_IN)));
	//   17   35:new             #47  <Class PorterDuffColorFilter>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:iload_3         
	//   21   41:invokestatic    #53  <Method int MediaRouterThemeHelper.getControllerColor(Context, int)>
	//   22   44:getstatic       #59  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   23   47:invokespecial   #62  <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   24   50:astore_2        
		mExpandAnimationDrawable.setColorFilter(((android.graphics.ColorFilter) (attributeset)));
	//   25   51:aload_0         
	//   26   52:getfield        #40  <Field AnimationDrawable mExpandAnimationDrawable>
	//   27   55:aload_2         
	//   28   56:invokevirtual   #66  <Method void AnimationDrawable.setColorFilter(android.graphics.ColorFilter)>
		mCollapseAnimationDrawable.setColorFilter(((android.graphics.ColorFilter) (attributeset)));
	//   29   59:aload_0         
	//   30   60:getfield        #45  <Field AnimationDrawable mCollapseAnimationDrawable>
	//   31   63:aload_2         
	//   32   64:invokevirtual   #66  <Method void AnimationDrawable.setColorFilter(android.graphics.ColorFilter)>
		mExpandGroupDescription = context.getString(android.support.v7.mediarouter.R.string.mr_controller_expand_group);
	//   33   67:aload_0         
	//   34   68:aload_1         
	//   35   69:getstatic       #71  <Field int android.support.v7.mediarouter.R$string.mr_controller_expand_group>
	//   36   72:invokevirtual   #77  <Method String Context.getString(int)>
	//   37   75:putfield        #79  <Field String mExpandGroupDescription>
		mCollapseGroupDescription = context.getString(android.support.v7.mediarouter.R.string.mr_controller_collapse_group);
	//   38   78:aload_0         
	//   39   79:aload_1         
	//   40   80:getstatic       #82  <Field int android.support.v7.mediarouter.R$string.mr_controller_collapse_group>
	//   41   83:invokevirtual   #77  <Method String Context.getString(int)>
	//   42   86:putfield        #84  <Field String mCollapseGroupDescription>
		setImageDrawable(mExpandAnimationDrawable.getFrame(0));
	//   43   89:aload_0         
	//   44   90:aload_0         
	//   45   91:getfield        #40  <Field AnimationDrawable mExpandAnimationDrawable>
	//   46   94:iconst_0        
	//   47   95:invokevirtual   #88  <Method android.graphics.drawable.Drawable AnimationDrawable.getFrame(int)>
	//   48   98:invokevirtual   #92  <Method void setImageDrawable(android.graphics.drawable.Drawable)>
		setContentDescription(((CharSequence) (mExpandGroupDescription)));
	//   49  101:aload_0         
	//   50  102:aload_0         
	//   51  103:getfield        #79  <Field String mExpandGroupDescription>
	//   52  106:invokevirtual   #96  <Method void setContentDescription(CharSequence)>
		super.setOnClickListener(((android.view.View.OnClickListener) (new _cls1())));
	//   53  109:aload_0         
	//   54  110:new             #98  <Class MediaRouteExpandCollapseButton$1>
	//   55  113:dup             
	//   56  114:aload_0         
	//   57  115:invokespecial   #101 <Method void MediaRouteExpandCollapseButton$1(MediaRouteExpandCollapseButton)>
	//   58  118:invokespecial   #105 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
	//   59  121:return          
	}

	public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
	{
		mListener = onclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #107 <Field android.view.View$OnClickListener mListener>
	//    3    5:return          
	}

	final AnimationDrawable mCollapseAnimationDrawable;
	final String mCollapseGroupDescription;
	final AnimationDrawable mExpandAnimationDrawable;
	final String mExpandGroupDescription;
	boolean mIsGroupExpanded;
	android.view.View.OnClickListener mListener;

	private class _cls1
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

		_cls1()
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

}
