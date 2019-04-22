// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.*;

// Referenced classes of package com.airbnb.lottie:
//			CompositionLayer, LottieComposition, ImageAssetBitmapManager, ImageAssetDelegate

public class LottieDrawable extends Drawable
	implements android.graphics.drawable.Drawable.Callback
{
	private static class ColorFilterData
	{

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(!(obj instanceof ColorFilterData))
		//*   5    7:aload_1         
		//*   6    8:instanceof      #2   <Class LottieDrawable$ColorFilterData>
		//*   7   11:ifne            16
				return false;
		//    8   14:iconst_0        
		//    9   15:ireturn         
			obj = ((Object) ((ColorFilterData)obj));
		//   10   16:aload_1         
		//   11   17:checkcast       #2   <Class LottieDrawable$ColorFilterData>
		//   12   20:astore_1        
			if(hashCode() != ((ColorFilterData) (obj)).hashCode())
		//*  13   21:aload_0         
		//*  14   22:invokevirtual   #19  <Method int hashCode()>
		//*  15   25:aload_1         
		//*  16   26:invokevirtual   #19  <Method int hashCode()>
		//*  17   29:icmpeq          34
				return false;
		//   18   32:iconst_0        
		//   19   33:ireturn         
			return colorFilter == ((ColorFilterData) (obj)).colorFilter;
		//   20   34:aload_0         
		//   21   35:getfield        #21  <Field ColorFilter colorFilter>
		//   22   38:aload_1         
		//   23   39:getfield        #21  <Field ColorFilter colorFilter>
		//   24   42:if_acmpeq       47
		//   25   45:iconst_0        
		//   26   46:ireturn         
		//   27   47:iconst_1        
		//   28   48:ireturn         
		}

		public int hashCode()
		{
			return 527 * layerName.hashCode() * 31 * contentName.hashCode();
		//    0    0:sipush          527
		//    1    3:aload_0         
		//    2    4:getfield        #24  <Field String layerName>
		//    3    7:invokevirtual   #27  <Method int String.hashCode()>
		//    4   10:imul            
		//    5   11:bipush          31
		//    6   13:imul            
		//    7   14:aload_0         
		//    8   15:getfield        #29  <Field String contentName>
		//    9   18:invokevirtual   #27  <Method int String.hashCode()>
		//   10   21:imul            
		//   11   22:ireturn         
		}

		final ColorFilter colorFilter;
		final String contentName;
		final String layerName;
	}


	public LottieDrawable()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Drawable()>
	//    2    4:aload_0         
	//    3    5:new             #51  <Class Matrix>
	//    4    8:dup             
	//    5    9:invokespecial   #52  <Method void Matrix()>
	//    6   12:putfield        #54  <Field Matrix matrix>
	//    7   15:aload_0         
	//    8   16:iconst_2        
	//    9   17:newarray        float[]
	//   10   19:dup             
	//   11   20:iconst_0        
	//   12   21:fconst_0        
	//   13   22:fastore         
	//   14   23:dup             
	//   15   24:iconst_1        
	//   16   25:fconst_1        
	//   17   26:fastore         
	//   18   27:invokestatic    #60  <Method ValueAnimator ValueAnimator.ofFloat(float[])>
	//   19   30:putfield        #62  <Field ValueAnimator animator>
		speed = 1.0F;
	//   20   33:aload_0         
	//   21   34:fconst_1        
	//   22   35:putfield        #64  <Field float speed>
		scale = 1.0F;
	//   23   38:aload_0         
	//   24   39:fconst_1        
	//   25   40:putfield        #66  <Field float scale>
		progress = 0.0F;
	//   26   43:aload_0         
	//   27   44:fconst_0        
	//   28   45:putfield        #68  <Field float progress>
	//   29   48:aload_0         
	//   30   49:new             #70  <Class HashSet>
	//   31   52:dup             
	//   32   53:invokespecial   #71  <Method void HashSet()>
	//   33   56:putfield        #73  <Field Set colorFilterData>
		alpha = 255;
	//   34   59:aload_0         
	//   35   60:sipush          255
	//   36   63:putfield        #75  <Field int alpha>
		animator.setRepeatCount(0);
	//   37   66:aload_0         
	//   38   67:getfield        #62  <Field ValueAnimator animator>
	//   39   70:iconst_0        
	//   40   71:invokevirtual   #79  <Method void ValueAnimator.setRepeatCount(int)>
		animator.setInterpolator(((android.animation.TimeInterpolator) (new LinearInterpolator())));
	//   41   74:aload_0         
	//   42   75:getfield        #62  <Field ValueAnimator animator>
	//   43   78:new             #81  <Class LinearInterpolator>
	//   44   81:dup             
	//   45   82:invokespecial   #82  <Method void LinearInterpolator()>
	//   46   85:invokevirtual   #86  <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
		animator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

			public void onAnimationUpdate(ValueAnimator valueanimator)
			{
				if(systemAnimationsAreDisabled)
			//*   0    0:aload_0         
			//*   1    1:getfield        #16  <Field LottieDrawable this$0>
			//*   2    4:invokestatic    #24  <Method boolean LottieDrawable.access$000(LottieDrawable)>
			//*   3    7:ifeq            29
				{
					animator.cancel();
			//    4   10:aload_0         
			//    5   11:getfield        #16  <Field LottieDrawable this$0>
			//    6   14:invokestatic    #28  <Method ValueAnimator LottieDrawable.access$100(LottieDrawable)>
			//    7   17:invokevirtual   #33  <Method void ValueAnimator.cancel()>
					setProgress(1.0F);
			//    8   20:aload_0         
			//    9   21:getfield        #16  <Field LottieDrawable this$0>
			//   10   24:fconst_1        
			//   11   25:invokevirtual   #37  <Method void LottieDrawable.setProgress(float)>
					return;
			//   12   28:return          
				} else
				{
					setProgress(((Float)valueanimator.getAnimatedValue()).floatValue());
			//   13   29:aload_0         
			//   14   30:getfield        #16  <Field LottieDrawable this$0>
			//   15   33:aload_1         
			//   16   34:invokevirtual   #41  <Method Object ValueAnimator.getAnimatedValue()>
			//   17   37:checkcast       #43  <Class Float>
			//   18   40:invokevirtual   #47  <Method float Float.floatValue()>
			//   19   43:invokevirtual   #37  <Method void LottieDrawable.setProgress(float)>
					return;
			//   20   46:return          
				}
			}

			final LottieDrawable this$0;

			
			{
				this$0 = LottieDrawable.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field LottieDrawable this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   47   88:aload_0         
	//   48   89:getfield        #62  <Field ValueAnimator animator>
	//   49   92:new             #8   <Class LottieDrawable$1>
	//   50   95:dup             
	//   51   96:aload_0         
	//   52   97:invokespecial   #89  <Method void LottieDrawable$1(LottieDrawable)>
	//   53  100:invokevirtual   #93  <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
	//   54  103:return          
	}

	private void applyColorFilters()
	{
		if(compositionLayer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field CompositionLayer compositionLayer>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		ColorFilterData colorfilterdata;
		for(Iterator iterator = colorFilterData.iterator(); iterator.hasNext(); compositionLayer.addColorFilter(colorfilterdata.layerName, colorfilterdata.contentName, colorfilterdata.colorFilter))
	//*   4    8:aload_0         
	//*   5    9:getfield        #73  <Field Set colorFilterData>
	//*   6   12:invokeinterface #108 <Method Iterator Set.iterator()>
	//*   7   17:astore_1        
	//*   8   18:aload_1         
	//*   9   19:invokeinterface #114 <Method boolean Iterator.hasNext()>
	//*  10   24:ifeq            59
			colorfilterdata = (ColorFilterData)iterator.next();
	//   11   27:aload_1         
	//   12   28:invokeinterface #118 <Method Object Iterator.next()>
	//   13   33:checkcast       #10  <Class LottieDrawable$ColorFilterData>
	//   14   36:astore_2        

	//   15   37:aload_0         
	//   16   38:getfield        #102 <Field CompositionLayer compositionLayer>
	//   17   41:aload_2         
	//   18   42:getfield        #121 <Field String LottieDrawable$ColorFilterData.layerName>
	//   19   45:aload_2         
	//   20   46:getfield        #124 <Field String LottieDrawable$ColorFilterData.contentName>
	//   21   49:aload_2         
	//   22   50:getfield        #128 <Field ColorFilter LottieDrawable$ColorFilterData.colorFilter>
	//   23   53:invokevirtual   #134 <Method void CompositionLayer.addColorFilter(String, String, ColorFilter)>
	//*  24   56:goto            18
	//   25   59:return          
	}

	private void buildCompositionLayer()
	{
		compositionLayer = new CompositionLayer(this, Layer.Factory.newInstance(composition), composition.getLayers(), composition);
	//    0    0:aload_0         
	//    1    1:new             #130 <Class CompositionLayer>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #137 <Field LottieComposition composition>
	//    6   10:invokestatic    #143 <Method Layer Layer$Factory.newInstance(LottieComposition)>
	//    7   13:aload_0         
	//    8   14:getfield        #137 <Field LottieComposition composition>
	//    9   17:invokevirtual   #149 <Method java.util.List LottieComposition.getLayers()>
	//   10   20:aload_0         
	//   11   21:getfield        #137 <Field LottieComposition composition>
	//   12   24:invokespecial   #152 <Method void CompositionLayer(LottieDrawable, Layer, java.util.List, LottieComposition)>
	//   13   27:putfield        #102 <Field CompositionLayer compositionLayer>
	//   14   30:return          
	}

	private void clearComposition()
	{
		recycleBitmaps();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #156 <Method void recycleBitmaps()>
		compositionLayer = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #102 <Field CompositionLayer compositionLayer>
		imageAssetBitmapManager = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #158 <Field ImageAssetBitmapManager imageAssetBitmapManager>
		invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #161 <Method void invalidateSelf()>
	//   10   18:return          
	}

	private Context getContext()
	{
		android.graphics.drawable.Drawable.Callback callback = getCallback();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #167 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//    2    4:astore_1        
		if(callback == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		if(callback instanceof View)
	//*   7   11:aload_1         
	//*   8   12:instanceof      #169 <Class View>
	//*   9   15:ifeq            26
			return ((View)callback).getContext();
	//   10   18:aload_1         
	//   11   19:checkcast       #169 <Class View>
	//   12   22:invokevirtual   #171 <Method Context View.getContext()>
	//   13   25:areturn         
		else
			return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
	}

	private ImageAssetBitmapManager getImageAssetBitmapManager()
	{
		ImageAssetBitmapManager imageassetbitmapmanager = imageAssetBitmapManager;
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field ImageAssetBitmapManager imageAssetBitmapManager>
	//    2    4:astore_1        
		if(imageassetbitmapmanager != null && !imageassetbitmapmanager.hasSameContext(getContext()))
	//*   3    5:aload_1         
	//*   4    6:ifnull          32
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:invokespecial   #175 <Method Context getContext()>
	//*   8   14:invokevirtual   #181 <Method boolean ImageAssetBitmapManager.hasSameContext(Context)>
	//*   9   17:ifne            32
		{
			imageAssetBitmapManager.recycleBitmaps();
	//   10   20:aload_0         
	//   11   21:getfield        #158 <Field ImageAssetBitmapManager imageAssetBitmapManager>
	//   12   24:invokevirtual   #182 <Method void ImageAssetBitmapManager.recycleBitmaps()>
			imageAssetBitmapManager = null;
	//   13   27:aload_0         
	//   14   28:aconst_null     
	//   15   29:putfield        #158 <Field ImageAssetBitmapManager imageAssetBitmapManager>
		}
		if(imageAssetBitmapManager == null)
	//*  16   32:aload_0         
	//*  17   33:getfield        #158 <Field ImageAssetBitmapManager imageAssetBitmapManager>
	//*  18   36:ifnonnull       69
			imageAssetBitmapManager = new ImageAssetBitmapManager(getCallback(), imageAssetsFolder, imageAssetDelegate, composition.getImages());
	//   19   39:aload_0         
	//   20   40:new             #177 <Class ImageAssetBitmapManager>
	//   21   43:dup             
	//   22   44:aload_0         
	//   23   45:invokevirtual   #167 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//   24   48:aload_0         
	//   25   49:getfield        #184 <Field String imageAssetsFolder>
	//   26   52:aload_0         
	//   27   53:getfield        #186 <Field ImageAssetDelegate imageAssetDelegate>
	//   28   56:aload_0         
	//   29   57:getfield        #137 <Field LottieComposition composition>
	//   30   60:invokevirtual   #190 <Method java.util.Map LottieComposition.getImages()>
	//   31   63:invokespecial   #193 <Method void ImageAssetBitmapManager(android.graphics.drawable.Drawable$Callback, String, ImageAssetDelegate, java.util.Map)>
	//   32   66:putfield        #158 <Field ImageAssetBitmapManager imageAssetBitmapManager>
		return imageAssetBitmapManager;
	//   33   69:aload_0         
	//   34   70:getfield        #158 <Field ImageAssetBitmapManager imageAssetBitmapManager>
	//   35   73:areturn         
	}

	private void playAnimation(boolean flag)
	{
		if(compositionLayer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field CompositionLayer compositionLayer>
	//*   2    4:ifnonnull       18
		{
			playAnimationWhenCompositionAdded = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #197 <Field boolean playAnimationWhenCompositionAdded>
			reverseAnimationWhenCompositionAdded = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #199 <Field boolean reverseAnimationWhenCompositionAdded>
			return;
	//    9   17:return          
		}
		if(flag)
	//*  10   18:iload_1         
	//*  11   19:ifeq            42
		{
			ValueAnimator valueanimator = animator;
	//   12   22:aload_0         
	//   13   23:getfield        #62  <Field ValueAnimator animator>
	//   14   26:astore_2        
			valueanimator.setCurrentPlayTime((long)(progress * (float)valueanimator.getDuration()));
	//   15   27:aload_2         
	//   16   28:aload_0         
	//   17   29:getfield        #68  <Field float progress>
	//   18   32:aload_2         
	//   19   33:invokevirtual   #203 <Method long ValueAnimator.getDuration()>
	//   20   36:l2f             
	//   21   37:fmul            
	//   22   38:f2l             
	//   23   39:invokevirtual   #207 <Method void ValueAnimator.setCurrentPlayTime(long)>
		}
		animator.start();
	//   24   42:aload_0         
	//   25   43:getfield        #62  <Field ValueAnimator animator>
	//   26   46:invokevirtual   #210 <Method void ValueAnimator.start()>
	//   27   49:return          
	}

	private void reverseAnimation(boolean flag)
	{
		if(compositionLayer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field CompositionLayer compositionLayer>
	//*   2    4:ifnonnull       18
		{
			playAnimationWhenCompositionAdded = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #197 <Field boolean playAnimationWhenCompositionAdded>
			reverseAnimationWhenCompositionAdded = true;
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:putfield        #199 <Field boolean reverseAnimationWhenCompositionAdded>
			return;
	//    9   17:return          
		}
		if(flag)
	//*  10   18:iload_1         
	//*  11   19:ifeq            42
		{
			ValueAnimator valueanimator = animator;
	//   12   22:aload_0         
	//   13   23:getfield        #62  <Field ValueAnimator animator>
	//   14   26:astore_2        
			valueanimator.setCurrentPlayTime((long)(progress * (float)valueanimator.getDuration()));
	//   15   27:aload_2         
	//   16   28:aload_0         
	//   17   29:getfield        #68  <Field float progress>
	//   18   32:aload_2         
	//   19   33:invokevirtual   #203 <Method long ValueAnimator.getDuration()>
	//   20   36:l2f             
	//   21   37:fmul            
	//   22   38:f2l             
	//   23   39:invokevirtual   #207 <Method void ValueAnimator.setCurrentPlayTime(long)>
		}
		animator.reverse();
	//   24   42:aload_0         
	//   25   43:getfield        #62  <Field ValueAnimator animator>
	//   26   46:invokevirtual   #214 <Method void ValueAnimator.reverse()>
	//   27   49:return          
	}

	private void updateBounds()
	{
		LottieComposition lottiecomposition = composition;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field LottieComposition composition>
	//    2    4:astore_1        
		if(lottiecomposition == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			setBounds(0, 0, (int)((float)lottiecomposition.getBounds().width() * scale), (int)((float)composition.getBounds().height() * scale));
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:iconst_0        
	//    9   13:aload_1         
	//   10   14:invokevirtual   #219 <Method Rect LottieComposition.getBounds()>
	//   11   17:invokevirtual   #225 <Method int Rect.width()>
	//   12   20:i2f             
	//   13   21:aload_0         
	//   14   22:getfield        #66  <Field float scale>
	//   15   25:fmul            
	//   16   26:f2i             
	//   17   27:aload_0         
	//   18   28:getfield        #137 <Field LottieComposition composition>
	//   19   31:invokevirtual   #219 <Method Rect LottieComposition.getBounds()>
	//   20   34:invokevirtual   #228 <Method int Rect.height()>
	//   21   37:i2f             
	//   22   38:aload_0         
	//   23   39:getfield        #66  <Field float scale>
	//   24   42:fmul            
	//   25   43:f2i             
	//   26   44:invokevirtual   #232 <Method void setBounds(int, int, int, int)>
			return;
	//   27   47:return          
		}
	}

	public void addAnimatorListener(android.animation.Animator.AnimatorListener animatorlistener)
	{
		animator.addListener(animatorlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field ValueAnimator animator>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #237 <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
	//    4    8:return          
	}

	public void cancelAnimation()
	{
		playAnimationWhenCompositionAdded = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #197 <Field boolean playAnimationWhenCompositionAdded>
		reverseAnimationWhenCompositionAdded = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #199 <Field boolean reverseAnimationWhenCompositionAdded>
		animator.cancel();
	//    6   10:aload_0         
	//    7   11:getfield        #62  <Field ValueAnimator animator>
	//    8   14:invokevirtual   #241 <Method void ValueAnimator.cancel()>
	//    9   17:return          
	}

	public void draw(Canvas canvas)
	{
		if(compositionLayer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field CompositionLayer compositionLayer>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			matrix.reset();
	//    4    8:aload_0         
	//    5    9:getfield        #54  <Field Matrix matrix>
	//    6   12:invokevirtual   #247 <Method void Matrix.reset()>
			Matrix matrix1 = matrix;
	//    7   15:aload_0         
	//    8   16:getfield        #54  <Field Matrix matrix>
	//    9   19:astore_3        
			float f = scale;
	//   10   20:aload_0         
	//   11   21:getfield        #66  <Field float scale>
	//   12   24:fstore_2        
			matrix1.preScale(f, f);
	//   13   25:aload_3         
	//   14   26:fload_2         
	//   15   27:fload_2         
	//   16   28:invokevirtual   #251 <Method boolean Matrix.preScale(float, float)>
	//   17   31:pop             
			compositionLayer.draw(canvas, matrix, alpha);
	//   18   32:aload_0         
	//   19   33:getfield        #102 <Field CompositionLayer compositionLayer>
	//   20   36:aload_1         
	//   21   37:aload_0         
	//   22   38:getfield        #54  <Field Matrix matrix>
	//   23   41:aload_0         
	//   24   42:getfield        #75  <Field int alpha>
	//   25   45:invokevirtual   #254 <Method void CompositionLayer.draw(Canvas, Matrix, int)>
			return;
	//   26   48:return          
		}
	}

	public void enableMergePathsForKitKatAndAbove(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT < 19)
	//*   0    0:getstatic       #261 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmpge          19
		{
			Log.w(TAG, "Merge paths are not supported pre-Kit Kat.");
	//    3    8:getstatic       #263 <Field String TAG>
	//    4   11:ldc2            #265 <String "Merge paths are not supported pre-Kit Kat.">
	//    5   14:invokestatic    #271 <Method int Log.w(String, String)>
	//    6   17:pop             
			return;
	//    7   18:return          
		}
		enableMergePaths = flag;
	//    8   19:aload_0         
	//    9   20:iload_1         
	//   10   21:putfield        #273 <Field boolean enableMergePaths>
		if(composition != null)
	//*  11   24:aload_0         
	//*  12   25:getfield        #137 <Field LottieComposition composition>
	//*  13   28:ifnull          35
			buildCompositionLayer();
	//   14   31:aload_0         
	//   15   32:invokespecial   #275 <Method void buildCompositionLayer()>
	//   16   35:return          
	}

	boolean enableMergePathsForKitKatAndAbove()
	{
		return enableMergePaths;
	//    0    0:aload_0         
	//    1    1:getfield        #273 <Field boolean enableMergePaths>
	//    2    4:ireturn         
	}

	public int getAlpha()
	{
		return alpha;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field int alpha>
	//    2    4:ireturn         
	}

	public LottieComposition getComposition()
	{
		return composition;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field LottieComposition composition>
	//    2    4:areturn         
	}

	Bitmap getImageAsset(String s)
	{
		return getImageAssetBitmapManager().bitmapForId(s);
	//    0    0:aload_0         
	//    1    1:invokespecial   #282 <Method ImageAssetBitmapManager getImageAssetBitmapManager()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #285 <Method Bitmap ImageAssetBitmapManager.bitmapForId(String)>
	//    4    8:areturn         
	}

	public int getIntrinsicHeight()
	{
		LottieComposition lottiecomposition = composition;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field LottieComposition composition>
	//    2    4:astore_1        
		if(lottiecomposition == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return -1;
	//    5    9:iconst_m1       
	//    6   10:ireturn         
		else
			return (int)((float)lottiecomposition.getBounds().height() * scale);
	//    7   11:aload_1         
	//    8   12:invokevirtual   #219 <Method Rect LottieComposition.getBounds()>
	//    9   15:invokevirtual   #228 <Method int Rect.height()>
	//   10   18:i2f             
	//   11   19:aload_0         
	//   12   20:getfield        #66  <Field float scale>
	//   13   23:fmul            
	//   14   24:f2i             
	//   15   25:ireturn         
	}

	public int getIntrinsicWidth()
	{
		LottieComposition lottiecomposition = composition;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field LottieComposition composition>
	//    2    4:astore_1        
		if(lottiecomposition == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return -1;
	//    5    9:iconst_m1       
	//    6   10:ireturn         
		else
			return (int)((float)lottiecomposition.getBounds().width() * scale);
	//    7   11:aload_1         
	//    8   12:invokevirtual   #219 <Method Rect LottieComposition.getBounds()>
	//    9   15:invokevirtual   #225 <Method int Rect.width()>
	//   10   18:i2f             
	//   11   19:aload_0         
	//   12   20:getfield        #66  <Field float scale>
	//   13   23:fmul            
	//   14   24:f2i             
	//   15   25:ireturn         
	}

	public int getOpacity()
	{
		return -3;
	//    0    0:bipush          -3
	//    1    2:ireturn         
	}

	public float getProgress()
	{
		return progress;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field float progress>
	//    2    4:freturn         
	}

	public float getScale()
	{
		return scale;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field float scale>
	//    2    4:freturn         
	}

	public void invalidateDrawable(Drawable drawable)
	{
		drawable = ((Drawable) (getCallback()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #167 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//    2    4:astore_1        
		if(drawable == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			((android.graphics.drawable.Drawable.Callback) (drawable)).invalidateDrawable(((Drawable) (this)));
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:invokeinterface #295 <Method void android.graphics.drawable.Drawable$Callback.invalidateDrawable(Drawable)>
			return;
	//    9   17:return          
		}
	}

	public void invalidateSelf()
	{
		android.graphics.drawable.Drawable.Callback callback = getCallback();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #167 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//    2    4:astore_1        
		if(callback != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			callback.invalidateDrawable(((Drawable) (this)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokeinterface #295 <Method void android.graphics.drawable.Drawable$Callback.invalidateDrawable(Drawable)>
	//    8   16:return          
	}

	public boolean isAnimating()
	{
		return animator.isRunning();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field ValueAnimator animator>
	//    2    4:invokevirtual   #299 <Method boolean ValueAnimator.isRunning()>
	//    3    7:ireturn         
	}

	public boolean isLooping()
	{
		return animator.getRepeatCount() == -1;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field ValueAnimator animator>
	//    2    4:invokevirtual   #303 <Method int ValueAnimator.getRepeatCount()>
	//    3    7:iconst_m1       
	//    4    8:icmpne          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public void loop(boolean flag)
	{
		ValueAnimator valueanimator = animator;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field ValueAnimator animator>
	//    2    4:astore_3        
		byte byte0;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            14
			byte0 = -1;
	//    5    9:iconst_m1       
	//    6   10:istore_2        
		else
	//*   7   11:goto            16
			byte0 = 0;
	//    8   14:iconst_0        
	//    9   15:istore_2        
		valueanimator.setRepeatCount(((int) (byte0)));
	//   10   16:aload_3         
	//   11   17:iload_2         
	//   12   18:invokevirtual   #79  <Method void ValueAnimator.setRepeatCount(int)>
	//   13   21:return          
	}

	public void playAnimation()
	{
		playAnimation(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #306 <Method void playAnimation(boolean)>
	//    3    5:return          
	}

	public void recycleBitmaps()
	{
		ImageAssetBitmapManager imageassetbitmapmanager = imageAssetBitmapManager;
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field ImageAssetBitmapManager imageAssetBitmapManager>
	//    2    4:astore_1        
		if(imageassetbitmapmanager != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			imageassetbitmapmanager.recycleBitmaps();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #182 <Method void ImageAssetBitmapManager.recycleBitmaps()>
	//    7   13:return          
	}

	public void removeAnimatorListener(android.animation.Animator.AnimatorListener animatorlistener)
	{
		animator.removeListener(animatorlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field ValueAnimator animator>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #310 <Method void ValueAnimator.removeListener(android.animation.Animator$AnimatorListener)>
	//    4    8:return          
	}

	public void reverseAnimation()
	{
		reverseAnimation(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #312 <Method void reverseAnimation(boolean)>
	//    3    5:return          
	}

	public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
	{
		drawable = ((Drawable) (getCallback()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #167 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//    2    4:astore_1        
		if(drawable == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			((android.graphics.drawable.Drawable.Callback) (drawable)).scheduleDrawable(((Drawable) (this)), runnable, l);
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:lload_3         
	//   10   14:invokeinterface #316 <Method void android.graphics.drawable.Drawable$Callback.scheduleDrawable(Drawable, Runnable, long)>
			return;
	//   11   19:return          
		}
	}

	public void setAlpha(int i)
	{
		alpha = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #75  <Field int alpha>
	//    3    5:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
	//    0    0:return          
	}

	public boolean setComposition(LottieComposition lottiecomposition)
	{
		if(getCallback() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #167 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//*   2    4:ifnull          93
		{
			if(composition == lottiecomposition)
	//*   3    7:aload_0         
	//*   4    8:getfield        #137 <Field LottieComposition composition>
	//*   5   11:aload_1         
	//*   6   12:if_acmpne       17
				return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
			clearComposition();
	//    9   17:aload_0         
	//   10   18:invokespecial   #330 <Method void clearComposition()>
			composition = lottiecomposition;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #137 <Field LottieComposition composition>
			setSpeed(speed);
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #64  <Field float speed>
	//   17   31:invokevirtual   #334 <Method void setSpeed(float)>
			setScale(1.0F);
	//   18   34:aload_0         
	//   19   35:fconst_1        
	//   20   36:invokevirtual   #337 <Method void setScale(float)>
			updateBounds();
	//   21   39:aload_0         
	//   22   40:invokespecial   #339 <Method void updateBounds()>
			buildCompositionLayer();
	//   23   43:aload_0         
	//   24   44:invokespecial   #275 <Method void buildCompositionLayer()>
			applyColorFilters();
	//   25   47:aload_0         
	//   26   48:invokespecial   #341 <Method void applyColorFilters()>
			setProgress(progress);
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:getfield        #68  <Field float progress>
	//   30   56:invokevirtual   #344 <Method void setProgress(float)>
			if(playAnimationWhenCompositionAdded)
	//*  31   59:aload_0         
	//*  32   60:getfield        #197 <Field boolean playAnimationWhenCompositionAdded>
	//*  33   63:ifeq            75
			{
				playAnimationWhenCompositionAdded = false;
	//   34   66:aload_0         
	//   35   67:iconst_0        
	//   36   68:putfield        #197 <Field boolean playAnimationWhenCompositionAdded>
				playAnimation();
	//   37   71:aload_0         
	//   38   72:invokevirtual   #346 <Method void playAnimation()>
			}
			if(reverseAnimationWhenCompositionAdded)
	//*  39   75:aload_0         
	//*  40   76:getfield        #199 <Field boolean reverseAnimationWhenCompositionAdded>
	//*  41   79:ifeq            91
			{
				reverseAnimationWhenCompositionAdded = false;
	//   42   82:aload_0         
	//   43   83:iconst_0        
	//   44   84:putfield        #199 <Field boolean reverseAnimationWhenCompositionAdded>
				reverseAnimation();
	//   45   87:aload_0         
	//   46   88:invokevirtual   #348 <Method void reverseAnimation()>
			}
			return true;
	//   47   91:iconst_1        
	//   48   92:ireturn         
		} else
		{
			throw new IllegalStateException("You or your view must set a Drawable.Callback before setting the composition. This gets done automatically when added to an ImageView. Either call ImageView.setImageDrawable() before setComposition() or call setCallback(yourView.getCallback()) first.");
	//   49   93:new             #350 <Class IllegalStateException>
	//   50   96:dup             
	//   51   97:ldc2            #352 <String "You or your view must set a Drawable.Callback before setting the composition. This gets done automatically when added to an ImageView. Either call ImageView.setImageDrawable() before setComposition() or call setCallback(yourView.getCallback()) first.">
	//   52  100:invokespecial   #355 <Method void IllegalStateException(String)>
	//   53  103:athrow          
		}
	}

	public void setImageAssetDelegate(ImageAssetDelegate imageassetdelegate)
	{
		imageAssetDelegate = imageassetdelegate;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #186 <Field ImageAssetDelegate imageAssetDelegate>
		ImageAssetBitmapManager imageassetbitmapmanager = imageAssetBitmapManager;
	//    3    5:aload_0         
	//    4    6:getfield        #158 <Field ImageAssetBitmapManager imageAssetBitmapManager>
	//    5    9:astore_2        
		if(imageassetbitmapmanager != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			imageassetbitmapmanager.setAssetDelegate(imageassetdelegate);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #360 <Method void ImageAssetBitmapManager.setAssetDelegate(ImageAssetDelegate)>
	//   11   19:return          
	}

	public void setImagesAssetsFolder(String s)
	{
		imageAssetsFolder = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #184 <Field String imageAssetsFolder>
	//    3    5:return          
	}

	public void setProgress(float f)
	{
		progress = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #68  <Field float progress>
		CompositionLayer compositionlayer = compositionLayer;
	//    3    5:aload_0         
	//    4    6:getfield        #102 <Field CompositionLayer compositionLayer>
	//    5    9:astore_2        
		if(compositionlayer != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			compositionlayer.setProgress(f);
	//    8   14:aload_2         
	//    9   15:fload_1         
	//   10   16:invokevirtual   #367 <Method void CompositionLayer.setProgress(float)>
	//   11   19:return          
	}

	public void setScale(float f)
	{
		scale = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #66  <Field float scale>
		updateBounds();
	//    3    5:aload_0         
	//    4    6:invokespecial   #339 <Method void updateBounds()>
	//    5    9:return          
	}

	public void setSpeed(float f)
	{
		speed = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #64  <Field float speed>
		if(f < 0.0F)
	//*   3    5:fload_1         
	//*   4    6:fconst_0        
	//*   5    7:fcmpg           
	//*   6    8:ifge            32
			animator.setFloatValues(new float[] {
				1.0F, 0.0F
			});
	//    7   11:aload_0         
	//    8   12:getfield        #62  <Field ValueAnimator animator>
	//    9   15:iconst_2        
	//   10   16:newarray        float[]
	//   11   18:dup             
	//   12   19:iconst_0        
	//   13   20:fconst_1        
	//   14   21:fastore         
	//   15   22:dup             
	//   16   23:iconst_1        
	//   17   24:fconst_0        
	//   18   25:fastore         
	//   19   26:invokevirtual   #371 <Method void ValueAnimator.setFloatValues(float[])>
		else
	//*  20   29:goto            50
			animator.setFloatValues(new float[] {
				0.0F, 1.0F
			});
	//   21   32:aload_0         
	//   22   33:getfield        #62  <Field ValueAnimator animator>
	//   23   36:iconst_2        
	//   24   37:newarray        float[]
	//   25   39:dup             
	//   26   40:iconst_0        
	//   27   41:fconst_0        
	//   28   42:fastore         
	//   29   43:dup             
	//   30   44:iconst_1        
	//   31   45:fconst_1        
	//   32   46:fastore         
	//   33   47:invokevirtual   #371 <Method void ValueAnimator.setFloatValues(float[])>
		LottieComposition lottiecomposition = composition;
	//   34   50:aload_0         
	//   35   51:getfield        #137 <Field LottieComposition composition>
	//   36   54:astore_2        
		if(lottiecomposition != null)
	//*  37   55:aload_2         
	//*  38   56:ifnull          78
			animator.setDuration((long)((float)lottiecomposition.getDuration() / Math.abs(f)));
	//   39   59:aload_0         
	//   40   60:getfield        #62  <Field ValueAnimator animator>
	//   41   63:aload_2         
	//   42   64:invokevirtual   #372 <Method long LottieComposition.getDuration()>
	//   43   67:l2f             
	//   44   68:fload_1         
	//   45   69:invokestatic    #378 <Method float Math.abs(float)>
	//   46   72:fdiv            
	//   47   73:f2l             
	//   48   74:invokevirtual   #382 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   49   77:pop             
	//   50   78:return          
	}

	void systemAnimationsAreDisabled()
	{
		systemAnimationsAreDisabled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #97  <Field boolean systemAnimationsAreDisabled>
	//    3    5:return          
	}

	public void unscheduleDrawable(Drawable drawable, Runnable runnable)
	{
		drawable = ((Drawable) (getCallback()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #167 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//    2    4:astore_1        
		if(drawable == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			((android.graphics.drawable.Drawable.Callback) (drawable)).unscheduleDrawable(((Drawable) (this)), runnable);
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:invokeinterface #386 <Method void android.graphics.drawable.Drawable$Callback.unscheduleDrawable(Drawable, Runnable)>
			return;
	//   10   18:return          
		}
	}

	private static final String TAG = "LottieDrawable";
	private int alpha;
	private final ValueAnimator animator = ValueAnimator.ofFloat(new float[] {
		0.0F, 1.0F
	});
	private final Set colorFilterData = new HashSet();
	private LottieComposition composition;
	private CompositionLayer compositionLayer;
	private boolean enableMergePaths;
	private ImageAssetBitmapManager imageAssetBitmapManager;
	private ImageAssetDelegate imageAssetDelegate;
	private String imageAssetsFolder;
	private final Matrix matrix = new Matrix();
	private boolean playAnimationWhenCompositionAdded;
	private float progress;
	private boolean reverseAnimationWhenCompositionAdded;
	private float scale;
	private float speed;
	private boolean systemAnimationsAreDisabled;

	static 
	{
	//    0    0:return          
	}


/*
	static boolean access$000(LottieDrawable lottiedrawable)
	{
		return lottiedrawable.systemAnimationsAreDisabled;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field boolean systemAnimationsAreDisabled>
	//    2    4:ireturn         
	}

*/


/*
	static ValueAnimator access$100(LottieDrawable lottiedrawable)
	{
		return lottiedrawable.animator;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field ValueAnimator animator>
	//    2    4:areturn         
	}

*/
}
