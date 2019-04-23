// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.support;

import android.graphics.drawable.Animatable;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.image.ImageInfo;

// Referenced classes of package com.appboy.ui.support:
//			FrescoLibraryUtils

static final class FrescoLibraryUtils$1 extends BaseControllerListener
{

	public void onFinalImageSet(String s, ImageInfo imageinfo, Animatable animatable)
	{
		if(imageinfo == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		final float imageAspectRatio;
		if(val$respectAspectRatio)
	//*   3    5:aload_0         
	//*   4    6:getfield        #22  <Field boolean val$respectAspectRatio>
	//*   5    9:ifeq            21
			imageAspectRatio = val$aspectRatio;
	//    6   12:aload_0         
	//    7   13:getfield        #24  <Field float val$aspectRatio>
	//    8   16:fstore          4
		else
	//*   9   18:goto            37
			imageAspectRatio = imageinfo.getWidth() / imageinfo.getHeight();
	//   10   21:aload_2         
	//   11   22:invokeinterface #38  <Method int ImageInfo.getWidth()>
	//   12   27:aload_2         
	//   13   28:invokeinterface #41  <Method int ImageInfo.getHeight()>
	//   14   33:idiv            
	//   15   34:i2f             
	//   16   35:fstore          4
		val$simpleDraweeView.post(new Runnable() {

			public void run()
			{
				simpleDraweeView.setAspectRatio(imageAspectRatio);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field FrescoLibraryUtils$1 this$0>
			//    2    4:getfield        #30  <Field SimpleDraweeView FrescoLibraryUtils$1.val$simpleDraweeView>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field float val$imageAspectRatio>
			//    5   11:invokevirtual   #36  <Method void SimpleDraweeView.setAspectRatio(float)>
			//    6   14:return          
			}

			final FrescoLibraryUtils._cls1 this$0;
			final float val$imageAspectRatio;

			
			{
				this$0 = FrescoLibraryUtils._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field FrescoLibraryUtils$1 this$0>
				imageAspectRatio = f;
			//    3    5:aload_0         
			//    4    6:fload_2         
			//    5    7:putfield        #21  <Field float val$imageAspectRatio>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   17   37:aload_0         
	//   18   38:getfield        #26  <Field SimpleDraweeView val$simpleDraweeView>
	//   19   41:new             #12  <Class FrescoLibraryUtils$1$1>
	//   20   44:dup             
	//   21   45:aload_0         
	//   22   46:fload           4
	//   23   48:invokespecial   #44  <Method void FrescoLibraryUtils$1$1(FrescoLibraryUtils$1, float)>
	//   24   51:invokevirtual   #50  <Method boolean SimpleDraweeView.post(Runnable)>
	//   25   54:pop             
	//   26   55:return          
	}

	public volatile void onFinalImageSet(String s, Object obj, Animatable animatable)
	{
		onFinalImageSet(s, (ImageInfo)obj, animatable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #34  <Class ImageInfo>
	//    4    6:aload_3         
	//    5    7:invokevirtual   #53  <Method void onFinalImageSet(String, ImageInfo, Animatable)>
	//    6   10:return          
	}

	final float val$aspectRatio;
	final boolean val$respectAspectRatio;
	final SimpleDraweeView val$simpleDraweeView;

	FrescoLibraryUtils$1(boolean flag, float f, SimpleDraweeView simpledraweeview)
	{
		val$respectAspectRatio = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #22  <Field boolean val$respectAspectRatio>
		val$aspectRatio = f;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #24  <Field float val$aspectRatio>
		val$simpleDraweeView = simpledraweeview;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field SimpleDraweeView val$simpleDraweeView>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #29  <Method void BaseControllerListener()>
	//   11   19:return          
	}
}
