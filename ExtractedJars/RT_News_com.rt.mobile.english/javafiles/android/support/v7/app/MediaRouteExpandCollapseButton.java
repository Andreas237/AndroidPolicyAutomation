// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;
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
	//    3    3:invokespecial   #21  <Method void MediaRouteExpandCollapseButton(Context, AttributeSet)>
	//    4    6:return          
	}

	public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #25  <Method void MediaRouteExpandCollapseButton(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #26  <Method void ImageButton(Context, AttributeSet, int)>
		mExpandAnimationDrawable = (AnimationDrawable)ContextCompat.getDrawable(context, android.support.v7.mediarouter.R.drawable.mr_group_expand);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:getstatic       #32  <Field int android.support.v7.mediarouter.R$drawable.mr_group_expand>
	//    8   12:invokestatic    #38  <Method android.graphics.drawable.Drawable ContextCompat.getDrawable(Context, int)>
	//    9   15:checkcast       #40  <Class AnimationDrawable>
	//   10   18:putfield        #42  <Field AnimationDrawable mExpandAnimationDrawable>
		mCollapseAnimationDrawable = (AnimationDrawable)ContextCompat.getDrawable(context, android.support.v7.mediarouter.R.drawable.mr_group_collapse);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:getstatic       #45  <Field int android.support.v7.mediarouter.R$drawable.mr_group_collapse>
	//   14   26:invokestatic    #38  <Method android.graphics.drawable.Drawable ContextCompat.getDrawable(Context, int)>
	//   15   29:checkcast       #40  <Class AnimationDrawable>
	//   16   32:putfield        #47  <Field AnimationDrawable mCollapseAnimationDrawable>
		attributeset = ((AttributeSet) (new PorterDuffColorFilter(MediaRouterThemeHelper.getControllerColor(context, i), android.graphics.PorterDuff.Mode.SRC_IN)));
	//   17   35:new             #49  <Class PorterDuffColorFilter>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:iload_3         
	//   21   41:invokestatic    #55  <Method int MediaRouterThemeHelper.getControllerColor(Context, int)>
	//   22   44:getstatic       #61  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   23   47:invokespecial   #64  <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   24   50:astore_2        
		mExpandAnimationDrawable.setColorFilter(((android.graphics.ColorFilter) (attributeset)));
	//   25   51:aload_0         
	//   26   52:getfield        #42  <Field AnimationDrawable mExpandAnimationDrawable>
	//   27   55:aload_2         
	//   28   56:invokevirtual   #68  <Method void AnimationDrawable.setColorFilter(android.graphics.ColorFilter)>
		mCollapseAnimationDrawable.setColorFilter(((android.graphics.ColorFilter) (attributeset)));
	//   29   59:aload_0         
	//   30   60:getfield        #47  <Field AnimationDrawable mCollapseAnimationDrawable>
	//   31   63:aload_2         
	//   32   64:invokevirtual   #68  <Method void AnimationDrawable.setColorFilter(android.graphics.ColorFilter)>
		mExpandGroupDescription = context.getString(android.support.v7.mediarouter.R.string.mr_controller_expand_group);
	//   33   67:aload_0         
	//   34   68:aload_1         
	//   35   69:getstatic       #73  <Field int android.support.v7.mediarouter.R$string.mr_controller_expand_group>
	//   36   72:invokevirtual   #79  <Method String Context.getString(int)>
	//   37   75:putfield        #81  <Field String mExpandGroupDescription>
		mCollapseGroupDescription = context.getString(android.support.v7.mediarouter.R.string.mr_controller_collapse_group);
	//   38   78:aload_0         
	//   39   79:aload_1         
	//   40   80:getstatic       #84  <Field int android.support.v7.mediarouter.R$string.mr_controller_collapse_group>
	//   41   83:invokevirtual   #79  <Method String Context.getString(int)>
	//   42   86:putfield        #86  <Field String mCollapseGroupDescription>
		setImageDrawable(mExpandAnimationDrawable.getFrame(0));
	//   43   89:aload_0         
	//   44   90:aload_0         
	//   45   91:getfield        #42  <Field AnimationDrawable mExpandAnimationDrawable>
	//   46   94:iconst_0        
	//   47   95:invokevirtual   #90  <Method android.graphics.drawable.Drawable AnimationDrawable.getFrame(int)>
	//   48   98:invokevirtual   #94  <Method void setImageDrawable(android.graphics.drawable.Drawable)>
		setContentDescription(((CharSequence) (mExpandGroupDescription)));
	//   49  101:aload_0         
	//   50  102:aload_0         
	//   51  103:getfield        #81  <Field String mExpandGroupDescription>
	//   52  106:invokevirtual   #98  <Method void setContentDescription(CharSequence)>
		super.setOnClickListener(new android.view.View.OnClickListener() {

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
);
	//   53  109:aload_0         
	//   54  110:new             #6   <Class MediaRouteExpandCollapseButton$1>
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
}
