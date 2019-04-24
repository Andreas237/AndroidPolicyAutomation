// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import java.nio.ByteBuffer;

// Referenced classes of package com.bumptech.glide.load.resource.gif:
//			GifFrameLoader

public class GifDrawable extends Drawable
	implements GifFrameLoader.FrameCallback, Animatable
{
	static class GifState extends android.graphics.drawable.Drawable.ConstantState
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
		//    3    5:invokespecial   #31  <Method void GifDrawable(GifDrawable$GifState)>
		//    4    8:areturn         
		}

		public Drawable newDrawable(Resources resources)
		{
			return newDrawable();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #34  <Method Drawable newDrawable()>
		//    2    4:areturn         
		}

		static final int GRAVITY = 119;
		final BitmapPool bitmapPool;
		final GifFrameLoader frameLoader;

		public GifState(BitmapPool bitmappool, GifFrameLoader gifframeloader)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void android.graphics.drawable.Drawable$ConstantState()>
			bitmapPool = bitmappool;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field BitmapPool bitmapPool>
			frameLoader = gifframeloader;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field GifFrameLoader frameLoader>
		//    8   14:return          
		}
	}


	public GifDrawable(Context context, GifDecoder gifdecoder, BitmapPool bitmappool, Transformation transformation, int i, int j, Bitmap bitmap)
	{
		this(new GifState(bitmappool, new GifFrameLoader(Glide.get(context), gifdecoder, i, j, transformation, bitmap)));
	//    0    0:aload_0         
	//    1    1:new             #10  <Class GifDrawable$GifState>
	//    2    4:dup             
	//    3    5:aload_3         
	//    4    6:new             #34  <Class GifFrameLoader>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokestatic    #40  <Method Glide Glide.get(Context)>
	//    8   14:aload_2         
	//    9   15:iload           5
	//   10   17:iload           6
	//   11   19:aload           4
	//   12   21:aload           7
	//   13   23:invokespecial   #43  <Method void GifFrameLoader(Glide, GifDecoder, int, int, Transformation, Bitmap)>
	//   14   26:invokespecial   #46  <Method void GifDrawable$GifState(BitmapPool, GifFrameLoader)>
	//   15   29:invokespecial   #49  <Method void GifDrawable(GifDrawable$GifState)>
	//   16   32:return          
	}

	GifDrawable(GifState gifstate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void Drawable()>
		isVisible = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #57  <Field boolean isVisible>
		maxLoopCount = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #59  <Field int maxLoopCount>
		state = (GifState)Preconditions.checkNotNull(((Object) (gifstate)));
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokestatic    #65  <Method Object Preconditions.checkNotNull(Object)>
	//   11   19:checkcast       #10  <Class GifDrawable$GifState>
	//   12   22:putfield        #67  <Field GifDrawable$GifState state>
	//   13   25:return          
	}

	GifDrawable(GifFrameLoader gifframeloader, BitmapPool bitmappool, Paint paint1)
	{
		this(new GifState(bitmappool, gifframeloader));
	//    0    0:aload_0         
	//    1    1:new             #10  <Class GifDrawable$GifState>
	//    2    4:dup             
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokespecial   #46  <Method void GifDrawable$GifState(BitmapPool, GifFrameLoader)>
	//    6   10:invokespecial   #49  <Method void GifDrawable(GifDrawable$GifState)>
		paint = paint1;
	//    7   13:aload_0         
	//    8   14:aload_3         
	//    9   15:putfield        #71  <Field Paint paint>
	//   10   18:return          
	}

	private Rect getDestRect()
	{
		if(destRect == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field Rect destRect>
	//*   2    4:ifnonnull       18
			destRect = new Rect();
	//    3    7:aload_0         
	//    4    8:new             #78  <Class Rect>
	//    5   11:dup             
	//    6   12:invokespecial   #79  <Method void Rect()>
	//    7   15:putfield        #76  <Field Rect destRect>
		return destRect;
	//    8   18:aload_0         
	//    9   19:getfield        #76  <Field Rect destRect>
	//   10   22:areturn         
	}

	private Paint getPaint()
	{
		if(paint == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field Paint paint>
	//*   2    4:ifnonnull       19
			paint = new Paint(2);
	//    3    7:aload_0         
	//    4    8:new             #83  <Class Paint>
	//    5   11:dup             
	//    6   12:iconst_2        
	//    7   13:invokespecial   #86  <Method void Paint(int)>
	//    8   16:putfield        #71  <Field Paint paint>
		return paint;
	//    9   19:aload_0         
	//   10   20:getfield        #71  <Field Paint paint>
	//   11   23:areturn         
	}

	private void resetLoopCount()
	{
		loopCount = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #89  <Field int loopCount>
	//    3    5:return          
	}

	private void startRunning()
	{
		boolean flag;
		if(!isRecycled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #92  <Field boolean isRecycled>
	//*   2    4:ifne            12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_1        
		Preconditions.checkArgument(flag, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
	//    8   14:iload_1         
	//    9   15:ldc1            #94  <String "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.">
	//   10   17:invokestatic    #98  <Method void Preconditions.checkArgument(boolean, String)>
		if(state.frameLoader.getFrameCount() == 1)
	//*  11   20:aload_0         
	//*  12   21:getfield        #67  <Field GifDrawable$GifState state>
	//*  13   24:getfield        #102 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//*  14   27:invokevirtual   #106 <Method int GifFrameLoader.getFrameCount()>
	//*  15   30:iconst_1        
	//*  16   31:icmpne          39
		{
			invalidateSelf();
	//   17   34:aload_0         
	//   18   35:invokevirtual   #109 <Method void invalidateSelf()>
			return;
	//   19   38:return          
		}
		if(!isRunning)
	//*  20   39:aload_0         
	//*  21   40:getfield        #111 <Field boolean isRunning>
	//*  22   43:ifne            66
		{
			isRunning = true;
	//   23   46:aload_0         
	//   24   47:iconst_1        
	//   25   48:putfield        #111 <Field boolean isRunning>
			state.frameLoader.subscribe(((GifFrameLoader.FrameCallback) (this)));
	//   26   51:aload_0         
	//   27   52:getfield        #67  <Field GifDrawable$GifState state>
	//   28   55:getfield        #102 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//   29   58:aload_0         
	//   30   59:invokevirtual   #115 <Method void GifFrameLoader.subscribe(GifFrameLoader$FrameCallback)>
			invalidateSelf();
	//   31   62:aload_0         
	//   32   63:invokevirtual   #109 <Method void invalidateSelf()>
		}
	//   33   66:return          
	}

	private void stopRunning()
	{
		isRunning = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #111 <Field boolean isRunning>
		state.frameLoader.unsubscribe(((GifFrameLoader.FrameCallback) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #67  <Field GifDrawable$GifState state>
	//    5    9:getfield        #102 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #119 <Method void GifFrameLoader.unsubscribe(GifFrameLoader$FrameCallback)>
	//    8   16:return          
	}

	public void draw(Canvas canvas)
	{
		if(isRecycled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #92  <Field boolean isRecycled>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(applyGravity)
	//*   4    8:aload_0         
	//*   5    9:getfield        #123 <Field boolean applyGravity>
	//*   6   12:ifeq            41
		{
			Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), getDestRect());
	//    7   15:bipush          119
	//    8   17:aload_0         
	//    9   18:invokevirtual   #126 <Method int getIntrinsicWidth()>
	//   10   21:aload_0         
	//   11   22:invokevirtual   #129 <Method int getIntrinsicHeight()>
	//   12   25:aload_0         
	//   13   26:invokevirtual   #132 <Method Rect getBounds()>
	//   14   29:aload_0         
	//   15   30:invokespecial   #134 <Method Rect getDestRect()>
	//   16   33:invokestatic    #140 <Method void Gravity.apply(int, int, int, Rect, Rect)>
			applyGravity = false;
	//   17   36:aload_0         
	//   18   37:iconst_0        
	//   19   38:putfield        #123 <Field boolean applyGravity>
		}
		canvas.drawBitmap(state.frameLoader.getCurrentFrame(), ((Rect) (null)), getDestRect(), getPaint());
	//   20   41:aload_1         
	//   21   42:aload_0         
	//   22   43:getfield        #67  <Field GifDrawable$GifState state>
	//   23   46:getfield        #102 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//   24   49:invokevirtual   #144 <Method Bitmap GifFrameLoader.getCurrentFrame()>
	//   25   52:aconst_null     
	//   26   53:aload_0         
	//   27   54:invokespecial   #134 <Method Rect getDestRect()>
	//   28   57:aload_0         
	//   29   58:invokespecial   #146 <Method Paint getPaint()>
	//   30   61:invokevirtual   #152 <Method void Canvas.drawBitmap(Bitmap, Rect, Rect, Paint)>
	//   31   64:return          
	}

	public ByteBuffer getBuffer()
	{
		return state.frameLoader.getBuffer();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field GifDrawable$GifState state>
	//    2    4:getfield        #102 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//    3    7:invokevirtual   #156 <Method ByteBuffer GifFrameLoader.getBuffer()>
	//    4   10:areturn         
	}

	public android.graphics.drawable.Drawable.ConstantState getConstantState()
	{
		return ((android.graphics.drawable.Drawable.ConstantState) (state));
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field GifDrawable$GifState state>
	//    2    4:areturn         
	}

	public Bitmap getFirstFrame()
	{
		return state.frameLoader.getFirstFrame();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field GifDrawable$GifState state>
	//    2    4:getfield        #102 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//    3    7:invokevirtual   #161 <Method Bitmap GifFrameLoader.getFirstFrame()>
	//    4   10:areturn         
	}

	public int getFrameCount()
	{
		return state.frameLoader.getFrameCount();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field GifDrawable$GifState state>
	//    2    4:getfield        #102 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//    3    7:invokevirtual   #106 <Method int GifFrameLoader.getFrameCount()>
	//    4   10:ireturn         
	}

	public int getFrameIndex()
	{
		return state.frameLoader.getCurrentIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field GifDrawable$GifState state>
	//    2    4:getfield        #102 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//    3    7:invokevirtual   #165 <Method int GifFrameLoader.getCurrentIndex()>
	//    4   10:ireturn         
	}

	public Transformation getFrameTransformation()
	{
		return state.frameLoader.getFrameTransformation();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field GifDrawable$GifState state>
	//    2    4:getfield        #102 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//    3    7:invokevirtual   #169 <Method Transformation GifFrameLoader.getFrameTransformation()>
	//    4   10:areturn         
	}

	public int getIntrinsicHeight()
	{
		return state.frameLoader.getHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field GifDrawable$GifState state>
	//    2    4:getfield        #102 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//    3    7:invokevirtual   #173 <Method int GifFrameLoader.getHeight()>
	//    4   10:ireturn         
	}

	public int getIntrinsicWidth()
	{
		return state.frameLoader.getWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field GifDrawable$GifState state>
	//    2    4:getfield        #102 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//    3    7:invokevirtual   #176 <Method int GifFrameLoader.getWidth()>
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
	//    1    1:getfield        #67  <Field GifDrawable$GifState state>
	//    2    4:getfield        #102 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//    3    7:invokevirtual   #180 <Method int GifFrameLoader.getSize()>
	//    4   10:ireturn         
	}

	boolean isRecycled()
	{
		return isRecycled;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field boolean isRecycled>
	//    2    4:ireturn         
	}

	public boolean isRunning()
	{
		return isRunning;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field boolean isRunning>
	//    2    4:ireturn         
	}

	protected void onBoundsChange(Rect rect)
	{
		super.onBoundsChange(rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #185 <Method void Drawable.onBoundsChange(Rect)>
		applyGravity = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #123 <Field boolean applyGravity>
	//    6   10:return          
	}

	public void onFrameReady()
	{
		if(getCallback() == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #190 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//*   2    4:ifnonnull       16
		{
			stop();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #193 <Method void stop()>
			invalidateSelf();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #109 <Method void invalidateSelf()>
			return;
	//    7   15:return          
		}
		invalidateSelf();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #109 <Method void invalidateSelf()>
		if(getFrameIndex() == getFrameCount() - 1)
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #195 <Method int getFrameIndex()>
	//*  12   24:aload_0         
	//*  13   25:invokevirtual   #196 <Method int getFrameCount()>
	//*  14   28:iconst_1        
	//*  15   29:isub            
	//*  16   30:icmpne          43
			loopCount = loopCount + 1;
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #89  <Field int loopCount>
	//   20   38:iconst_1        
	//   21   39:iadd            
	//   22   40:putfield        #89  <Field int loopCount>
		if(maxLoopCount != -1 && loopCount >= maxLoopCount)
	//*  23   43:aload_0         
	//*  24   44:getfield        #59  <Field int maxLoopCount>
	//*  25   47:iconst_m1       
	//*  26   48:icmpeq          66
	//*  27   51:aload_0         
	//*  28   52:getfield        #89  <Field int loopCount>
	//*  29   55:aload_0         
	//*  30   56:getfield        #59  <Field int maxLoopCount>
	//*  31   59:icmplt          66
			stop();
	//   32   62:aload_0         
	//   33   63:invokevirtual   #193 <Method void stop()>
	//   34   66:return          
	}

	public void recycle()
	{
		isRecycled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #92  <Field boolean isRecycled>
		state.frameLoader.clear();
	//    3    5:aload_0         
	//    4    6:getfield        #67  <Field GifDrawable$GifState state>
	//    5    9:getfield        #102 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//    6   12:invokevirtual   #200 <Method void GifFrameLoader.clear()>
	//    7   15:return          
	}

	public void setAlpha(int i)
	{
		getPaint().setAlpha(i);
	//    0    0:aload_0         
	//    1    1:invokespecial   #146 <Method Paint getPaint()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #203 <Method void Paint.setAlpha(int)>
	//    4    8:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		getPaint().setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:invokespecial   #146 <Method Paint getPaint()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #208 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setFrameTransformation(Transformation transformation, Bitmap bitmap)
	{
		state.frameLoader.setFrameTransformation(transformation, bitmap);
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field GifDrawable$GifState state>
	//    2    4:getfield        #102 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #212 <Method void GifFrameLoader.setFrameTransformation(Transformation, Bitmap)>
	//    6   12:return          
	}

	void setIsRunning(boolean flag)
	{
		isRunning = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #111 <Field boolean isRunning>
	//    3    5:return          
	}

	public void setLoopCount(int i)
	{
		if(i <= 0 && i != -1 && i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifgt            23
	//*   2    4:iload_1         
	//*   3    5:iconst_m1       
	//*   4    6:icmpeq          23
	//*   5    9:iload_1         
	//*   6   10:ifeq            23
			throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
	//    7   13:new             #218 <Class IllegalArgumentException>
	//    8   16:dup             
	//    9   17:ldc1            #220 <String "Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC">
	//   10   19:invokespecial   #223 <Method void IllegalArgumentException(String)>
	//   11   22:athrow          
		if(i == 0)
	//*  12   23:iload_1         
	//*  13   24:ifne            53
		{
			i = state.frameLoader.getLoopCount();
	//   14   27:aload_0         
	//   15   28:getfield        #67  <Field GifDrawable$GifState state>
	//   16   31:getfield        #102 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//   17   34:invokevirtual   #226 <Method int GifFrameLoader.getLoopCount()>
	//   18   37:istore_1        
			if(i == 0)
	//*  19   38:iload_1         
	//*  20   39:ifne            47
				i = -1;
	//   21   42:iconst_m1       
	//   22   43:istore_1        
	//*  23   44:goto            47
			maxLoopCount = i;
	//   24   47:aload_0         
	//   25   48:iload_1         
	//   26   49:putfield        #59  <Field int maxLoopCount>
			return;
	//   27   52:return          
		} else
		{
			maxLoopCount = i;
	//   28   53:aload_0         
	//   29   54:iload_1         
	//   30   55:putfield        #59  <Field int maxLoopCount>
			return;
	//   31   58:return          
		}
	}

	public boolean setVisible(boolean flag, boolean flag1)
	{
		boolean flag2;
		if(!isRecycled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #92  <Field boolean isRecycled>
	//*   2    4:ifne            12
			flag2 = true;
	//    3    7:iconst_1        
	//    4    8:istore_3        
		else
	//*   5    9:goto            14
			flag2 = false;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		Preconditions.checkArgument(flag2, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
	//    8   14:iload_3         
	//    9   15:ldc1            #230 <String "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.">
	//   10   17:invokestatic    #98  <Method void Preconditions.checkArgument(boolean, String)>
		isVisible = flag;
	//   11   20:aload_0         
	//   12   21:iload_1         
	//   13   22:putfield        #57  <Field boolean isVisible>
		if(!flag)
	//*  14   25:iload_1         
	//*  15   26:ifne            36
			stopRunning();
	//   16   29:aload_0         
	//   17   30:invokespecial   #232 <Method void stopRunning()>
		else
	//*  18   33:goto            47
		if(isStarted)
	//*  19   36:aload_0         
	//*  20   37:getfield        #234 <Field boolean isStarted>
	//*  21   40:ifeq            47
			startRunning();
	//   22   43:aload_0         
	//   23   44:invokespecial   #236 <Method void startRunning()>
		return super.setVisible(flag, flag1);
	//   24   47:aload_0         
	//   25   48:iload_1         
	//   26   49:iload_2         
	//   27   50:invokespecial   #238 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   28   53:ireturn         
	}

	public void start()
	{
		isStarted = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #234 <Field boolean isStarted>
		resetLoopCount();
	//    3    5:aload_0         
	//    4    6:invokespecial   #241 <Method void resetLoopCount()>
		if(isVisible)
	//*   5    9:aload_0         
	//*   6   10:getfield        #57  <Field boolean isVisible>
	//*   7   13:ifeq            20
			startRunning();
	//    8   16:aload_0         
	//    9   17:invokespecial   #236 <Method void startRunning()>
	//   10   20:return          
	}

	public void startFromFirstFrame()
	{
		boolean flag;
		if(!isRunning)
	//*   0    0:aload_0         
	//*   1    1:getfield        #111 <Field boolean isRunning>
	//*   2    4:ifne            12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_1        
		Preconditions.checkArgument(flag, "You cannot restart a currently running animation.");
	//    8   14:iload_1         
	//    9   15:ldc1            #244 <String "You cannot restart a currently running animation.">
	//   10   17:invokestatic    #98  <Method void Preconditions.checkArgument(boolean, String)>
		state.frameLoader.setNextStartFromFirstFrame();
	//   11   20:aload_0         
	//   12   21:getfield        #67  <Field GifDrawable$GifState state>
	//   13   24:getfield        #102 <Field GifFrameLoader GifDrawable$GifState.frameLoader>
	//   14   27:invokevirtual   #247 <Method void GifFrameLoader.setNextStartFromFirstFrame()>
		start();
	//   15   30:aload_0         
	//   16   31:invokevirtual   #249 <Method void start()>
	//   17   34:return          
	}

	public void stop()
	{
		isStarted = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #234 <Field boolean isStarted>
		stopRunning();
	//    3    5:aload_0         
	//    4    6:invokespecial   #232 <Method void stopRunning()>
	//    5    9:return          
	}

	public static final int LOOP_FOREVER = -1;
	public static final int LOOP_INTRINSIC = 0;
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
