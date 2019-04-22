// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.graphics.drawable.Animatable2Compat;
import android.view.Gravity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.bumptech.glide.load.resource.gif:
//			GifFrameLoader

public class GifDrawable extends Drawable
	implements Animatable, Animatable2Compat, GifFrameLoader.FrameCallback
{
	static final class GifState extends android.graphics.drawable.Drawable.ConstantState
	{

		public int getChangingConfigurations()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public Drawable newDrawable()
		{
			return ((Drawable) (new GifDrawable(this)));
		//    0    0:new             #6   <Class GifDrawable>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #26  <Method void GifDrawable(GifDrawable$GifState)>
		//    4    8:areturn         
		}

		public Drawable newDrawable(Resources resources)
		{
			return newDrawable();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #30  <Method Drawable newDrawable()>
		//    2    4:areturn         
		}

		final GifFrameLoader frameLoader;

		GifState(GifFrameLoader gifframeloader)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void android.graphics.drawable.Drawable$ConstantState()>
			frameLoader = gifframeloader;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field GifFrameLoader frameLoader>
		//    5    9:return          
		}
	}


	public GifDrawable(Context context, GifDecoder gifdecoder, Transformation transformation, int i, int j, Bitmap bitmap)
	{
		this(new GifState(new GifFrameLoader(Glide.get(context), gifdecoder, i, j, transformation, bitmap)));
	//    0    0:aload_0         
	//    1    1:new             #12  <Class GifDrawable$GifState>
	//    2    4:dup             
	//    3    5:new             #35  <Class GifFrameLoader>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokestatic    #41  <Method Glide Glide.get(Context)>
	//    7   13:aload_2         
	//    8   14:iload           4
	//    9   16:iload           5
	//   10   18:aload_3         
	//   11   19:aload           6
	//   12   21:invokespecial   #44  <Method void GifFrameLoader(Glide, GifDecoder, int, int, Transformation, Bitmap)>
	//   13   24:invokespecial   #47  <Method void GifDrawable$GifState(GifFrameLoader)>
	//   14   27:invokespecial   #50  <Method void GifDrawable(GifDrawable$GifState)>
	//   15   30:return          
	}

	GifDrawable(GifState gifstate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Drawable()>
		isVisible = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #58  <Field boolean isVisible>
		maxLoopCount = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #60  <Field int maxLoopCount>
		state = (GifState)Preconditions.checkNotNull(((Object) (gifstate)));
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokestatic    #66  <Method Object Preconditions.checkNotNull(Object)>
	//   11   19:checkcast       #12  <Class GifDrawable$GifState>
	//   12   22:putfield        #68  <Field GifDrawable$GifState state>
	//   13   25:return          
	}

	private android.graphics.drawable.Drawable.Callback findCallback()
	{
		android.graphics.drawable.Drawable.Callback callback;
		for(callback = getCallback(); callback instanceof Drawable; callback = ((Drawable)callback).getCallback());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//    2    4:astore_1        
	//    3    5:aload_1         
	//    4    6:instanceof      #4   <Class Drawable>
	//    5    9:ifeq            23
	//    6   12:aload_1         
	//    7   13:checkcast       #4   <Class Drawable>
	//    8   16:invokevirtual   #74  <Method android.graphics.drawable.Drawable$Callback Drawable.getCallback()>
	//    9   19:astore_1        
	//*  10   20:goto            5
		return callback;
	//   11   23:aload_1         
	//   12   24:areturn         
	}

	private Rect getDestRect()
	{
		if(destRect == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field Rect destRect>
	//*   2    4:ifnonnull       18
			destRect = new Rect();
	//    3    7:aload_0         
	//    4    8:new             #80  <Class Rect>
	//    5   11:dup             
	//    6   12:invokespecial   #81  <Method void Rect()>
	//    7   15:putfield        #78  <Field Rect destRect>
		return destRect;
	//    8   18:aload_0         
	//    9   19:getfield        #78  <Field Rect destRect>
	//   10   22:areturn         
	}

	private Paint getPaint()
	{
		if(paint == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field Paint paint>
	//*   2    4:ifnonnull       19
			paint = new Paint(2);
	//    3    7:aload_0         
	//    4    8:new             #87  <Class Paint>
	//    5   11:dup             
	//    6   12:iconst_2        
	//    7   13:invokespecial   #90  <Method void Paint(int)>
	//    8   16:putfield        #85  <Field Paint paint>
		return paint;
	//    9   19:aload_0         
	//   10   20:getfield        #85  <Field Paint paint>
	//   11   23:areturn         
	}

	private void notifyAnimationEndToListeners()
	{
		List list = animationCallbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field List animationCallbacks>
	//    2    4:astore_3        
		if(list != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          47
		{
			int i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_1        
			for(int j = list.size(); i < j; i++)
	//*   7   11:aload_3         
	//*   8   12:invokeinterface #99  <Method int List.size()>
	//*   9   17:istore_2        
	//*  10   18:iload_1         
	//*  11   19:iload_2         
	//*  12   20:icmpge          47
				((android.support.graphics.drawable.Animatable2Compat.AnimationCallback)animationCallbacks.get(i)).onAnimationEnd(((Drawable) (this)));
	//   13   23:aload_0         
	//   14   24:getfield        #93  <Field List animationCallbacks>
	//   15   27:iload_1         
	//   16   28:invokeinterface #102 <Method Object List.get(int)>
	//   17   33:checkcast       #104 <Class android.support.graphics.drawable.Animatable2Compat$AnimationCallback>
	//   18   36:aload_0         
	//   19   37:invokevirtual   #108 <Method void android.support.graphics.drawable.Animatable2Compat$AnimationCallback.onAnimationEnd(Drawable)>

	//   20   40:iload_1         
	//   21   41:iconst_1        
	//   22   42:iadd            
	//   23   43:istore_1        
		}
	//*  24   44:goto            18
	//   25   47:return          
	}

	private void resetLoopCount()
	{
		loopCount = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #111 <Field int loopCount>
	//    3    5:return          
	}

	private void startRunning()
	{
		Preconditions.checkArgument(isRecycled ^ true, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field boolean isRecycled>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:ldc1            #116 <String "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.">
	//    5    8:invokestatic    #120 <Method void Preconditions.checkArgument(boolean, String)>
		if(state.frameLoader.getFrameCount() == 1)
	//*   6   11:aload_0         
	//*   7   12:getfield        #68  <Field GifDrawable$GifState state>
	//*   8   15:getfield        #124 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//*   9   18:invokevirtual   #127 <Method int GifFrameLoader.getFrameCount()>
	//*  10   21:iconst_1        
	//*  11   22:icmpne          30
		{
			invalidateSelf();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #130 <Method void invalidateSelf()>
			return;
	//   14   29:return          
		}
		if(!isRunning)
	//*  15   30:aload_0         
	//*  16   31:getfield        #132 <Field boolean isRunning>
	//*  17   34:ifne            57
		{
			isRunning = true;
	//   18   37:aload_0         
	//   19   38:iconst_1        
	//   20   39:putfield        #132 <Field boolean isRunning>
			state.frameLoader.subscribe(((GifFrameLoader.FrameCallback) (this)));
	//   21   42:aload_0         
	//   22   43:getfield        #68  <Field GifDrawable$GifState state>
	//   23   46:getfield        #124 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//   24   49:aload_0         
	//   25   50:invokevirtual   #136 <Method void GifFrameLoader.subscribe(GifFrameLoader$FrameCallback)>
			invalidateSelf();
	//   26   53:aload_0         
	//   27   54:invokevirtual   #130 <Method void invalidateSelf()>
		}
	//   28   57:return          
	}

	private void stopRunning()
	{
		isRunning = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #132 <Field boolean isRunning>
		state.frameLoader.unsubscribe(((GifFrameLoader.FrameCallback) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #68  <Field GifDrawable$GifState state>
	//    5    9:getfield        #124 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #140 <Method void GifFrameLoader.unsubscribe(GifFrameLoader$FrameCallback)>
	//    8   16:return          
	}

	public void clearAnimationCallbacks()
	{
		List list = animationCallbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field List animationCallbacks>
	//    2    4:astore_1        
		if(list != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			list.clear();
	//    5    9:aload_1         
	//    6   10:invokeinterface #144 <Method void List.clear()>
	//    7   15:return          
	}

	public void draw(Canvas canvas)
	{
		if(isRecycled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #114 <Field boolean isRecycled>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(applyGravity)
	//*   4    8:aload_0         
	//*   5    9:getfield        #149 <Field boolean applyGravity>
	//*   6   12:ifeq            41
		{
			Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), getDestRect());
	//    7   15:bipush          119
	//    8   17:aload_0         
	//    9   18:invokevirtual   #152 <Method int getIntrinsicWidth()>
	//   10   21:aload_0         
	//   11   22:invokevirtual   #155 <Method int getIntrinsicHeight()>
	//   12   25:aload_0         
	//   13   26:invokevirtual   #158 <Method Rect getBounds()>
	//   14   29:aload_0         
	//   15   30:invokespecial   #160 <Method Rect getDestRect()>
	//   16   33:invokestatic    #166 <Method void Gravity.apply(int, int, int, Rect, Rect)>
			applyGravity = false;
	//   17   36:aload_0         
	//   18   37:iconst_0        
	//   19   38:putfield        #149 <Field boolean applyGravity>
		}
		canvas.drawBitmap(state.frameLoader.getCurrentFrame(), ((Rect) (null)), getDestRect(), getPaint());
	//   20   41:aload_1         
	//   21   42:aload_0         
	//   22   43:getfield        #68  <Field GifDrawable$GifState state>
	//   23   46:getfield        #124 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//   24   49:invokevirtual   #170 <Method Bitmap GifFrameLoader.getCurrentFrame()>
	//   25   52:aconst_null     
	//   26   53:aload_0         
	//   27   54:invokespecial   #160 <Method Rect getDestRect()>
	//   28   57:aload_0         
	//   29   58:invokespecial   #172 <Method Paint getPaint()>
	//   30   61:invokevirtual   #178 <Method void Canvas.drawBitmap(Bitmap, Rect, Rect, Paint)>
	//   31   64:return          
	}

	public ByteBuffer getBuffer()
	{
		return state.frameLoader.getBuffer();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field GifDrawable$GifState state>
	//    2    4:getfield        #124 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//    3    7:invokevirtual   #183 <Method ByteBuffer GifFrameLoader.getBuffer()>
	//    4   10:areturn         
	}

	public android.graphics.drawable.Drawable.ConstantState getConstantState()
	{
		return ((android.graphics.drawable.Drawable.ConstantState) (state));
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field GifDrawable$GifState state>
	//    2    4:areturn         
	}

	public Bitmap getFirstFrame()
	{
		return state.frameLoader.getFirstFrame();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field GifDrawable$GifState state>
	//    2    4:getfield        #124 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//    3    7:invokevirtual   #188 <Method Bitmap GifFrameLoader.getFirstFrame()>
	//    4   10:areturn         
	}

	public int getFrameCount()
	{
		return state.frameLoader.getFrameCount();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field GifDrawable$GifState state>
	//    2    4:getfield        #124 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//    3    7:invokevirtual   #127 <Method int GifFrameLoader.getFrameCount()>
	//    4   10:ireturn         
	}

	public int getFrameIndex()
	{
		return state.frameLoader.getCurrentIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field GifDrawable$GifState state>
	//    2    4:getfield        #124 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//    3    7:invokevirtual   #192 <Method int GifFrameLoader.getCurrentIndex()>
	//    4   10:ireturn         
	}

	public int getIntrinsicHeight()
	{
		return state.frameLoader.getHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field GifDrawable$GifState state>
	//    2    4:getfield        #124 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//    3    7:invokevirtual   #195 <Method int GifFrameLoader.getHeight()>
	//    4   10:ireturn         
	}

	public int getIntrinsicWidth()
	{
		return state.frameLoader.getWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field GifDrawable$GifState state>
	//    2    4:getfield        #124 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//    3    7:invokevirtual   #198 <Method int GifFrameLoader.getWidth()>
	//    4   10:ireturn         
	}

	public int getOpacity()
	{
		return -2;
	//    0    0:bipush          -2
	//    1    2:ireturn         
	}

	public int getSize()
	{
		return state.frameLoader.getSize();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field GifDrawable$GifState state>
	//    2    4:getfield        #124 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//    3    7:invokevirtual   #202 <Method int GifFrameLoader.getSize()>
	//    4   10:ireturn         
	}

	public boolean isRunning()
	{
		return isRunning;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field boolean isRunning>
	//    2    4:ireturn         
	}

	protected void onBoundsChange(Rect rect)
	{
		super.onBoundsChange(rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #207 <Method void Drawable.onBoundsChange(Rect)>
		applyGravity = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #149 <Field boolean applyGravity>
	//    6   10:return          
	}

	public void onFrameReady()
	{
		if(findCallback() == null)
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #210 <Method android.graphics.drawable.Drawable$Callback findCallback()>
	//*   2    4:ifnonnull       16
		{
			stop();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #213 <Method void stop()>
			invalidateSelf();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #130 <Method void invalidateSelf()>
			return;
	//    7   15:return          
		}
		invalidateSelf();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #130 <Method void invalidateSelf()>
		if(getFrameIndex() == getFrameCount() - 1)
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #215 <Method int getFrameIndex()>
	//*  12   24:aload_0         
	//*  13   25:invokevirtual   #216 <Method int getFrameCount()>
	//*  14   28:iconst_1        
	//*  15   29:isub            
	//*  16   30:icmpne          43
			loopCount = loopCount + 1;
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #111 <Field int loopCount>
	//   20   38:iconst_1        
	//   21   39:iadd            
	//   22   40:putfield        #111 <Field int loopCount>
		int i = maxLoopCount;
	//   23   43:aload_0         
	//   24   44:getfield        #60  <Field int maxLoopCount>
	//   25   47:istore_1        
		if(i != -1 && loopCount >= i)
	//*  26   48:iload_1         
	//*  27   49:iconst_m1       
	//*  28   50:icmpeq          69
	//*  29   53:aload_0         
	//*  30   54:getfield        #111 <Field int loopCount>
	//*  31   57:iload_1         
	//*  32   58:icmplt          69
		{
			notifyAnimationEndToListeners();
	//   33   61:aload_0         
	//   34   62:invokespecial   #218 <Method void notifyAnimationEndToListeners()>
			stop();
	//   35   65:aload_0         
	//   36   66:invokevirtual   #213 <Method void stop()>
		}
	//   37   69:return          
	}

	public void recycle()
	{
		isRecycled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #114 <Field boolean isRecycled>
		state.frameLoader.clear();
	//    3    5:aload_0         
	//    4    6:getfield        #68  <Field GifDrawable$GifState state>
	//    5    9:getfield        #124 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//    6   12:invokevirtual   #220 <Method void GifFrameLoader.clear()>
	//    7   15:return          
	}

	public void registerAnimationCallback(android.support.graphics.drawable.Animatable2Compat.AnimationCallback animationcallback)
	{
		if(animationcallback == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(animationCallbacks == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #93  <Field List animationCallbacks>
	//*   5    9:ifnonnull       23
			animationCallbacks = ((List) (new ArrayList()));
	//    6   12:aload_0         
	//    7   13:new             #224 <Class ArrayList>
	//    8   16:dup             
	//    9   17:invokespecial   #225 <Method void ArrayList()>
	//   10   20:putfield        #93  <Field List animationCallbacks>
		animationCallbacks.add(((Object) (animationcallback)));
	//   11   23:aload_0         
	//   12   24:getfield        #93  <Field List animationCallbacks>
	//   13   27:aload_1         
	//   14   28:invokeinterface #229 <Method boolean List.add(Object)>
	//   15   33:pop             
	//   16   34:return          
	}

	public void setAlpha(int i)
	{
		getPaint().setAlpha(i);
	//    0    0:aload_0         
	//    1    1:invokespecial   #172 <Method Paint getPaint()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #232 <Method void Paint.setAlpha(int)>
	//    4    8:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		getPaint().setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:invokespecial   #172 <Method Paint getPaint()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #237 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setFrameTransformation(Transformation transformation, Bitmap bitmap)
	{
		state.frameLoader.setFrameTransformation(transformation, bitmap);
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field GifDrawable$GifState state>
	//    2    4:getfield        #124 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #241 <Method void GifFrameLoader.setFrameTransformation(Transformation, Bitmap)>
	//    6   12:return          
	}

	public boolean setVisible(boolean flag, boolean flag1)
	{
		Preconditions.checkArgument(isRecycled ^ true, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field boolean isRecycled>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:ldc1            #246 <String "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.">
	//    5    8:invokestatic    #120 <Method void Preconditions.checkArgument(boolean, String)>
		isVisible = flag;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:putfield        #58  <Field boolean isVisible>
		if(!flag)
	//*   9   16:iload_1         
	//*  10   17:ifne            27
			stopRunning();
	//   11   20:aload_0         
	//   12   21:invokespecial   #248 <Method void stopRunning()>
		else
	//*  13   24:goto            38
		if(isStarted)
	//*  14   27:aload_0         
	//*  15   28:getfield        #250 <Field boolean isStarted>
	//*  16   31:ifeq            38
			startRunning();
	//   17   34:aload_0         
	//   18   35:invokespecial   #252 <Method void startRunning()>
		return super.setVisible(flag, flag1);
	//   19   38:aload_0         
	//   20   39:iload_1         
	//   21   40:iload_2         
	//   22   41:invokespecial   #254 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   23   44:ireturn         
	}

	public void start()
	{
		isStarted = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #250 <Field boolean isStarted>
		resetLoopCount();
	//    3    5:aload_0         
	//    4    6:invokespecial   #257 <Method void resetLoopCount()>
		if(isVisible)
	//*   5    9:aload_0         
	//*   6   10:getfield        #58  <Field boolean isVisible>
	//*   7   13:ifeq            20
			startRunning();
	//    8   16:aload_0         
	//    9   17:invokespecial   #252 <Method void startRunning()>
	//   10   20:return          
	}

	public void stop()
	{
		isStarted = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #250 <Field boolean isStarted>
		stopRunning();
	//    3    5:aload_0         
	//    4    6:invokespecial   #248 <Method void stopRunning()>
	//    5    9:return          
	}

	public boolean unregisterAnimationCallback(android.support.graphics.drawable.Animatable2Compat.AnimationCallback animationcallback)
	{
		List list = animationCallbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field List animationCallbacks>
	//    2    4:astore_2        
		if(list != null && animationcallback != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          24
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       16
	//*   7   13:goto            24
			return list.remove(((Object) (animationcallback)));
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokeinterface #262 <Method boolean List.remove(Object)>
	//   11   23:ireturn         
		else
			return false;
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	private List animationCallbacks;
	private boolean applyGravity;
	private Rect destRect;
	private boolean isRecycled;
	private boolean isRunning;
	private boolean isStarted;
	private boolean isVisible;
	private int loopCount;
	private int maxLoopCount;
	private Paint paint;
	private final GifState state;
}
