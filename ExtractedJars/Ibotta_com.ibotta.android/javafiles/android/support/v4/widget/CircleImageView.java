// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v4.view.ViewCompat;
import android.util.DisplayMetrics;
import android.widget.ImageView;

class CircleImageView extends ImageView
{
	private class OvalShadow extends OvalShape
	{

		private void updateRadialGradient(int i)
		{
			float f = i / 2;
		//    0    0:iload_1         
		//    1    1:iconst_2        
		//    2    2:idiv            
		//    3    3:i2f             
		//    4    4:fstore_2        
			float f1 = mShadowRadius;
		//    5    5:aload_0         
		//    6    6:getfield        #17  <Field CircleImageView this$0>
		//    7    9:getfield        #29  <Field int CircleImageView.mShadowRadius>
		//    8   12:i2f             
		//    9   13:fstore_3        
			android.graphics.Shader.TileMode tilemode = android.graphics.Shader.TileMode.CLAMP;
		//   10   14:getstatic       #50  <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
		//   11   17:astore          4
			mRadialGradient = new RadialGradient(f, f, f1, new int[] {
				0x3d000000, 0
			}, ((float []) (null)), tilemode);
		//   12   19:aload_0         
		//   13   20:new             #52  <Class RadialGradient>
		//   14   23:dup             
		//   15   24:fload_2         
		//   16   25:fload_2         
		//   17   26:fload_3         
		//   18   27:iconst_2        
		//   19   28:newarray        int[]
		//   20   30:dup             
		//   21   31:iconst_0        
		//   22   32:ldc1            #53  <Int 0x3d000000>
		//   23   34:iastore         
		//   24   35:dup             
		//   25   36:iconst_1        
		//   26   37:iconst_0        
		//   27   38:iastore         
		//   28   39:aconst_null     
		//   29   40:aload           4
		//   30   42:invokespecial   #56  <Method void RadialGradient(float, float, float, int[], float[], android.graphics.Shader$TileMode)>
		//   31   45:putfield        #58  <Field RadialGradient mRadialGradient>
			mShadowPaint.setShader(((android.graphics.Shader) (mRadialGradient)));
		//   32   48:aload_0         
		//   33   49:getfield        #25  <Field Paint mShadowPaint>
		//   34   52:aload_0         
		//   35   53:getfield        #58  <Field RadialGradient mRadialGradient>
		//   36   56:invokevirtual   #62  <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
		//   37   59:pop             
		//   38   60:return          
		}

		public void draw(Canvas canvas, Paint paint)
		{
			int j = getWidth();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field CircleImageView this$0>
		//    2    4:invokevirtual   #68  <Method int CircleImageView.getWidth()>
		//    3    7:istore          6
			int i = getHeight();
		//    4    9:aload_0         
		//    5   10:getfield        #17  <Field CircleImageView this$0>
		//    6   13:invokevirtual   #71  <Method int CircleImageView.getHeight()>
		//    7   16:istore          5
			j /= 2;
		//    8   18:iload           6
		//    9   20:iconst_2        
		//   10   21:idiv            
		//   11   22:istore          6
			float f = j;
		//   12   24:iload           6
		//   13   26:i2f             
		//   14   27:fstore_3        
			float f1 = i / 2;
		//   15   28:iload           5
		//   16   30:iconst_2        
		//   17   31:idiv            
		//   18   32:i2f             
		//   19   33:fstore          4
			canvas.drawCircle(f, f1, f, mShadowPaint);
		//   20   35:aload_1         
		//   21   36:fload_3         
		//   22   37:fload           4
		//   23   39:fload_3         
		//   24   40:aload_0         
		//   25   41:getfield        #25  <Field Paint mShadowPaint>
		//   26   44:invokevirtual   #77  <Method void Canvas.drawCircle(float, float, float, Paint)>
			canvas.drawCircle(f, f1, j - mShadowRadius, paint);
		//   27   47:aload_1         
		//   28   48:fload_3         
		//   29   49:fload           4
		//   30   51:iload           6
		//   31   53:aload_0         
		//   32   54:getfield        #17  <Field CircleImageView this$0>
		//   33   57:getfield        #29  <Field int CircleImageView.mShadowRadius>
		//   34   60:isub            
		//   35   61:i2f             
		//   36   62:aload_2         
		//   37   63:invokevirtual   #77  <Method void Canvas.drawCircle(float, float, float, Paint)>
		//   38   66:return          
		}

		protected void onResize(float f, float f1)
		{
			super.onResize(f, f1);
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:fload_2         
		//    3    3:invokespecial   #81  <Method void OvalShape.onResize(float, float)>
			updateRadialGradient((int)f);
		//    4    6:aload_0         
		//    5    7:fload_1         
		//    6    8:f2i             
		//    7    9:invokespecial   #43  <Method void updateRadialGradient(int)>
		//    8   12:return          
		}

		private RadialGradient mRadialGradient;
		private Paint mShadowPaint;
		final CircleImageView this$0;

		OvalShadow(int i)
		{
			this$0 = CircleImageView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field CircleImageView this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void OvalShape()>
			mShadowPaint = new Paint();
		//    5    9:aload_0         
		//    6   10:new             #22  <Class Paint>
		//    7   13:dup             
		//    8   14:invokespecial   #23  <Method void Paint()>
		//    9   17:putfield        #25  <Field Paint mShadowPaint>
			mShadowRadius = i;
		//   10   20:aload_1         
		//   11   21:iload_2         
		//   12   22:putfield        #29  <Field int CircleImageView.mShadowRadius>
			updateRadialGradient((int)rect().width());
		//   13   25:aload_0         
		//   14   26:aload_0         
		//   15   27:invokevirtual   #33  <Method RectF rect()>
		//   16   30:invokevirtual   #39  <Method float RectF.width()>
		//   17   33:f2i             
		//   18   34:invokespecial   #43  <Method void updateRadialGradient(int)>
		//   19   37:return          
		}
	}


	CircleImageView(Context context, int i)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void ImageView(Context)>
		float f = getContext().getResources().getDisplayMetrics().density;
	//    3    5:aload_0         
	//    4    6:invokevirtual   #20  <Method Context getContext()>
	//    5    9:invokevirtual   #26  <Method Resources Context.getResources()>
	//    6   12:invokevirtual   #32  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    7   15:getfield        #38  <Field float DisplayMetrics.density>
	//    8   18:fstore_3        
		int j = (int)(1.75F * f);
	//    9   19:ldc1            #39  <Float 1.75F>
	//   10   21:fload_3         
	//   11   22:fmul            
	//   12   23:f2i             
	//   13   24:istore          4
		int k = (int)(0.0F * f);
	//   14   26:fconst_0        
	//   15   27:fload_3         
	//   16   28:fmul            
	//   17   29:f2i             
	//   18   30:istore          5
		mShadowRadius = (int)(3.5F * f);
	//   19   32:aload_0         
	//   20   33:ldc1            #40  <Float 3.5F>
	//   21   35:fload_3         
	//   22   36:fmul            
	//   23   37:f2i             
	//   24   38:putfield        #42  <Field int mShadowRadius>
		if(elevationSupported())
	//*  25   41:aload_0         
	//*  26   42:invokespecial   #46  <Method boolean elevationSupported()>
	//*  27   45:ifeq            74
		{
			context = ((Context) (new ShapeDrawable(((android.graphics.drawable.shapes.Shape) (new OvalShape())))));
	//   28   48:new             #48  <Class ShapeDrawable>
	//   29   51:dup             
	//   30   52:new             #50  <Class OvalShape>
	//   31   55:dup             
	//   32   56:invokespecial   #53  <Method void OvalShape()>
	//   33   59:invokespecial   #56  <Method void ShapeDrawable(android.graphics.drawable.shapes.Shape)>
	//   34   62:astore_1        
			ViewCompat.setElevation(((android.view.View) (this)), f * 4F);
	//   35   63:aload_0         
	//   36   64:fload_3         
	//   37   65:ldc1            #57  <Float 4F>
	//   38   67:fmul            
	//   39   68:invokestatic    #63  <Method void ViewCompat.setElevation(android.view.View, float)>
		} else
	//*  40   71:goto            141
		{
			context = ((Context) (new ShapeDrawable(((android.graphics.drawable.shapes.Shape) (new OvalShadow(mShadowRadius))))));
	//   41   74:new             #48  <Class ShapeDrawable>
	//   42   77:dup             
	//   43   78:new             #6   <Class CircleImageView$OvalShadow>
	//   44   81:dup             
	//   45   82:aload_0         
	//   46   83:aload_0         
	//   47   84:getfield        #42  <Field int mShadowRadius>
	//   48   87:invokespecial   #66  <Method void CircleImageView$OvalShadow(CircleImageView, int)>
	//   49   90:invokespecial   #56  <Method void ShapeDrawable(android.graphics.drawable.shapes.Shape)>
	//   50   93:astore_1        
			setLayerType(1, ((ShapeDrawable) (context)).getPaint());
	//   51   94:aload_0         
	//   52   95:iconst_1        
	//   53   96:aload_1         
	//   54   97:invokevirtual   #70  <Method Paint ShapeDrawable.getPaint()>
	//   55  100:invokevirtual   #74  <Method void setLayerType(int, Paint)>
			((ShapeDrawable) (context)).getPaint().setShadowLayer(mShadowRadius, k, j, 0x1e000000);
	//   56  103:aload_1         
	//   57  104:invokevirtual   #70  <Method Paint ShapeDrawable.getPaint()>
	//   58  107:aload_0         
	//   59  108:getfield        #42  <Field int mShadowRadius>
	//   60  111:i2f             
	//   61  112:iload           5
	//   62  114:i2f             
	//   63  115:iload           4
	//   64  117:i2f             
	//   65  118:ldc1            #75  <Int 0x1e000000>
	//   66  120:invokevirtual   #81  <Method void Paint.setShadowLayer(float, float, float, int)>
			j = mShadowRadius;
	//   67  123:aload_0         
	//   68  124:getfield        #42  <Field int mShadowRadius>
	//   69  127:istore          4
			setPadding(j, j, j, j);
	//   70  129:aload_0         
	//   71  130:iload           4
	//   72  132:iload           4
	//   73  134:iload           4
	//   74  136:iload           4
	//   75  138:invokevirtual   #85  <Method void setPadding(int, int, int, int)>
		}
		((ShapeDrawable) (context)).getPaint().setColor(i);
	//   76  141:aload_1         
	//   77  142:invokevirtual   #70  <Method Paint ShapeDrawable.getPaint()>
	//   78  145:iload_2         
	//   79  146:invokevirtual   #89  <Method void Paint.setColor(int)>
		ViewCompat.setBackground(((android.view.View) (this)), ((android.graphics.drawable.Drawable) (context)));
	//   80  149:aload_0         
	//   81  150:aload_1         
	//   82  151:invokestatic    #93  <Method void ViewCompat.setBackground(android.view.View, android.graphics.drawable.Drawable)>
	//   83  154:return          
	}

	private boolean elevationSupported()
	{
		return android.os.Build.VERSION.SDK_INT >= 21;
	//    0    0:getstatic       #99  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          21
	//    2    5:icmplt          10
	//    3    8:iconst_1        
	//    4    9:ireturn         
	//    5   10:iconst_0        
	//    6   11:ireturn         
	}

	public void onAnimationEnd()
	{
		super.onAnimationEnd();
	//    0    0:aload_0         
	//    1    1:invokespecial   #102 <Method void ImageView.onAnimationEnd()>
		android.view.animation.Animation.AnimationListener animationlistener = mListener;
	//    2    4:aload_0         
	//    3    5:getfield        #104 <Field android.view.animation.Animation$AnimationListener mListener>
	//    4    8:astore_1        
		if(animationlistener != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          23
			animationlistener.onAnimationEnd(getAnimation());
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #108 <Method android.view.animation.Animation getAnimation()>
	//   10   18:invokeinterface #113 <Method void android.view.animation.Animation$AnimationListener.onAnimationEnd(android.view.animation.Animation)>
	//   11   23:return          
	}

	public void onAnimationStart()
	{
		super.onAnimationStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #116 <Method void ImageView.onAnimationStart()>
		android.view.animation.Animation.AnimationListener animationlistener = mListener;
	//    2    4:aload_0         
	//    3    5:getfield        #104 <Field android.view.animation.Animation$AnimationListener mListener>
	//    4    8:astore_1        
		if(animationlistener != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          23
			animationlistener.onAnimationStart(getAnimation());
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #108 <Method android.view.animation.Animation getAnimation()>
	//   10   18:invokeinterface #118 <Method void android.view.animation.Animation$AnimationListener.onAnimationStart(android.view.animation.Animation)>
	//   11   23:return          
	}

	protected void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #122 <Method void ImageView.onMeasure(int, int)>
		if(!elevationSupported())
	//*   4    6:aload_0         
	//*   5    7:invokespecial   #46  <Method boolean elevationSupported()>
	//*   6   10:ifne            39
			setMeasuredDimension(getMeasuredWidth() + mShadowRadius * 2, getMeasuredHeight() + mShadowRadius * 2);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #126 <Method int getMeasuredWidth()>
	//   10   18:aload_0         
	//   11   19:getfield        #42  <Field int mShadowRadius>
	//   12   22:iconst_2        
	//   13   23:imul            
	//   14   24:iadd            
	//   15   25:aload_0         
	//   16   26:invokevirtual   #129 <Method int getMeasuredHeight()>
	//   17   29:aload_0         
	//   18   30:getfield        #42  <Field int mShadowRadius>
	//   19   33:iconst_2        
	//   20   34:imul            
	//   21   35:iadd            
	//   22   36:invokevirtual   #132 <Method void setMeasuredDimension(int, int)>
	//   23   39:return          
	}

	public void setAnimationListener(android.view.animation.Animation.AnimationListener animationlistener)
	{
		mListener = animationlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #104 <Field android.view.animation.Animation$AnimationListener mListener>
	//    3    5:return          
	}

	public void setBackgroundColor(int i)
	{
		if(getBackground() instanceof ShapeDrawable)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #139 <Method android.graphics.drawable.Drawable getBackground()>
	//*   2    4:instanceof      #48  <Class ShapeDrawable>
	//*   3    7:ifeq            24
			((ShapeDrawable)getBackground()).getPaint().setColor(i);
	//    4   10:aload_0         
	//    5   11:invokevirtual   #139 <Method android.graphics.drawable.Drawable getBackground()>
	//    6   14:checkcast       #48  <Class ShapeDrawable>
	//    7   17:invokevirtual   #70  <Method Paint ShapeDrawable.getPaint()>
	//    8   20:iload_1         
	//    9   21:invokevirtual   #89  <Method void Paint.setColor(int)>
	//   10   24:return          
	}

	private android.view.animation.Animation.AnimationListener mListener;
	int mShadowRadius;
}
