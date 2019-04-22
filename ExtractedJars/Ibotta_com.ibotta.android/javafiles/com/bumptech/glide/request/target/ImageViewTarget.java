// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.request.transition.Transition;

// Referenced classes of package com.bumptech.glide.request.target:
//			ViewTarget

public abstract class ImageViewTarget extends ViewTarget
	implements com.bumptech.glide.request.transition.Transition.ViewAdapter
{

	public ImageViewTarget(ImageView imageview)
	{
		super(((android.view.View) (imageview)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void ViewTarget(android.view.View)>
	//    3    5:return          
	}

	private void maybeUpdateAnimatable(Object obj)
	{
		if(obj instanceof Animatable)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #20  <Class Animatable>
	//*   2    4:ifeq            25
		{
			animatable = (Animatable)obj;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #20  <Class Animatable>
	//    6   12:putfield        #22  <Field Animatable animatable>
			animatable.start();
	//    7   15:aload_0         
	//    8   16:getfield        #22  <Field Animatable animatable>
	//    9   19:invokeinterface #26  <Method void Animatable.start()>
			return;
	//   10   24:return          
		} else
		{
			animatable = null;
	//   11   25:aload_0         
	//   12   26:aconst_null     
	//   13   27:putfield        #22  <Field Animatable animatable>
			return;
	//   14   30:return          
		}
	}

	private void setResourceInternal(Object obj)
	{
		setResource(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #33  <Method void setResource(Object)>
		maybeUpdateAnimatable(obj);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #35  <Method void maybeUpdateAnimatable(Object)>
	//    6   10:return          
	}

	public Drawable getCurrentDrawable()
	{
		return ((ImageView)view).getDrawable();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field android.view.View view>
	//    2    4:checkcast       #43  <Class ImageView>
	//    3    7:invokevirtual   #46  <Method Drawable ImageView.getDrawable()>
	//    4   10:areturn         
	}

	public void onLoadCleared(Drawable drawable)
	{
		super.onLoadCleared(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #51  <Method void ViewTarget.onLoadCleared(Drawable)>
		Animatable animatable1 = animatable;
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field Animatable animatable>
	//    5    9:astore_2        
		if(animatable1 != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          20
			animatable1.stop();
	//    8   14:aload_2         
	//    9   15:invokeinterface #54  <Method void Animatable.stop()>
		setResourceInternal(((Object) (null)));
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:invokespecial   #56  <Method void setResourceInternal(Object)>
		setDrawable(drawable);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #59  <Method void setDrawable(Drawable)>
	//   16   30:return          
	}

	public void onLoadFailed(Drawable drawable)
	{
		super.onLoadFailed(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #62  <Method void ViewTarget.onLoadFailed(Drawable)>
		setResourceInternal(((Object) (null)));
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #56  <Method void setResourceInternal(Object)>
		setDrawable(drawable);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #59  <Method void setDrawable(Drawable)>
	//    9   15:return          
	}

	public void onLoadStarted(Drawable drawable)
	{
		super.onLoadStarted(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #65  <Method void ViewTarget.onLoadStarted(Drawable)>
		setResourceInternal(((Object) (null)));
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #56  <Method void setResourceInternal(Object)>
		setDrawable(drawable);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #59  <Method void setDrawable(Drawable)>
	//    9   15:return          
	}

	public void onResourceReady(Object obj, Transition transition)
	{
		if(transition != null && transition.transition(obj, ((com.bumptech.glide.request.transition.Transition.ViewAdapter) (this))))
	//*   0    0:aload_2         
	//*   1    1:ifnull          24
	//*   2    4:aload_2         
	//*   3    5:aload_1         
	//*   4    6:aload_0         
	//*   5    7:invokeinterface #74  <Method boolean Transition.transition(Object, com.bumptech.glide.request.transition.Transition$ViewAdapter)>
	//*   6   12:ifne            18
	//*   7   15:goto            24
		{
			maybeUpdateAnimatable(obj);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokespecial   #35  <Method void maybeUpdateAnimatable(Object)>
			return;
	//   11   23:return          
		} else
		{
			setResourceInternal(obj);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokespecial   #56  <Method void setResourceInternal(Object)>
			return;
	//   15   29:return          
		}
	}

	public void onStart()
	{
		Animatable animatable1 = animatable;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Animatable animatable>
	//    2    4:astore_1        
		if(animatable1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			animatable1.start();
	//    5    9:aload_1         
	//    6   10:invokeinterface #26  <Method void Animatable.start()>
	//    7   15:return          
	}

	public void onStop()
	{
		Animatable animatable1 = animatable;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Animatable animatable>
	//    2    4:astore_1        
		if(animatable1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			animatable1.stop();
	//    5    9:aload_1         
	//    6   10:invokeinterface #54  <Method void Animatable.stop()>
	//    7   15:return          
	}

	public void setDrawable(Drawable drawable)
	{
		((ImageView)view).setImageDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field android.view.View view>
	//    2    4:checkcast       #43  <Class ImageView>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #80  <Method void ImageView.setImageDrawable(Drawable)>
	//    5   11:return          
	}

	protected abstract void setResource(Object obj);

	private Animatable animatable;
}
