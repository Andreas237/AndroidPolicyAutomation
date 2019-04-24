// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v4.content.ContextCompat;
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
			float f1 = i / 2;
		//    5    5:iload_1         
		//    6    6:iconst_2        
		//    7    7:idiv            
		//    8    8:i2f             
		//    9    9:fstore_3        
			float f2 = mShadowRadius;
		//   10   10:aload_0         
		//   11   11:getfield        #17  <Field CircleImageView this$0>
		//   12   14:getfield        #29  <Field int CircleImageView.mShadowRadius>
		//   13   17:i2f             
		//   14   18:fstore          4
			android.graphics.Shader.TileMode tilemode = android.graphics.Shader.TileMode.CLAMP;
		//   15   20:getstatic       #50  <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
		//   16   23:astore          5
			mRadialGradient = new RadialGradient(f, f1, f2, new int[] {
				0x3d000000, 0
			}, ((float []) (null)), tilemode);
		//   17   25:aload_0         
		//   18   26:new             #52  <Class RadialGradient>
		//   19   29:dup             
		//   20   30:fload_2         
		//   21   31:fload_3         
		//   22   32:fload           4
		//   23   34:iconst_2        
		//   24   35:newarray        int[]
		//   25   37:dup             
		//   26   38:iconst_0        
		//   27   39:ldc1            #53  <Int 0x3d000000>
		//   28   41:iastore         
		//   29   42:dup             
		//   30   43:iconst_1        
		//   31   44:iconst_0        
		//   32   45:iastore         
		//   33   46:aconst_null     
		//   34   47:aload           5
		//   35   49:invokespecial   #56  <Method void RadialGradient(float, float, float, int[], float[], android.graphics.Shader$TileMode)>
		//   36   52:putfield        #58  <Field RadialGradient mRadialGradient>
			mShadowPaint.setShader(((android.graphics.Shader) (mRadialGradient)));
		//   37   55:aload_0         
		//   38   56:getfield        #25  <Field Paint mShadowPaint>
		//   39   59:aload_0         
		//   40   60:getfield        #58  <Field RadialGradient mRadialGradient>
		//   41   63:invokevirtual   #62  <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
		//   42   66:pop             
		//   43   67:return          
		}

		public void draw(Canvas canvas, Paint paint)
		{
			int i = getWidth();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field CircleImageView this$0>
		//    2    4:invokevirtual   #68  <Method int CircleImageView.getWidth()>
		//    3    7:istore_3        
			int j = getHeight();
		//    4    8:aload_0         
		//    5    9:getfield        #17  <Field CircleImageView this$0>
		//    6   12:invokevirtual   #71  <Method int CircleImageView.getHeight()>
		//    7   15:istore          4
			canvas.drawCircle(i / 2, j / 2, i / 2, mShadowPaint);
		//    8   17:aload_1         
		//    9   18:iload_3         
		//   10   19:iconst_2        
		//   11   20:idiv            
		//   12   21:i2f             
		//   13   22:iload           4
		//   14   24:iconst_2        
		//   15   25:idiv            
		//   16   26:i2f             
		//   17   27:iload_3         
		//   18   28:iconst_2        
		//   19   29:idiv            
		//   20   30:i2f             
		//   21   31:aload_0         
		//   22   32:getfield        #25  <Field Paint mShadowPaint>
		//   23   35:invokevirtual   #77  <Method void Canvas.drawCircle(float, float, float, Paint)>
			canvas.drawCircle(i / 2, j / 2, i / 2 - mShadowRadius, paint);
		//   24   38:aload_1         
		//   25   39:iload_3         
		//   26   40:iconst_2        
		//   27   41:idiv            
		//   28   42:i2f             
		//   29   43:iload           4
		//   30   45:iconst_2        
		//   31   46:idiv            
		//   32   47:i2f             
		//   33   48:iload_3         
		//   34   49:iconst_2        
		//   35   50:idiv            
		//   36   51:aload_0         
		//   37   52:getfield        #17  <Field CircleImageView this$0>
		//   38   55:getfield        #29  <Field int CircleImageView.mShadowRadius>
		//   39   58:isub            
		//   40   59:i2f             
		//   41   60:aload_2         
		//   42   61:invokevirtual   #77  <Method void Canvas.drawCircle(float, float, float, Paint)>
		//   43   64:return          
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
	//    2    2:invokespecial   #29  <Method void ImageView(Context)>
		float f = getContext().getResources().getDisplayMetrics().density;
	//    3    5:aload_0         
	//    4    6:invokevirtual   #33  <Method Context getContext()>
	//    5    9:invokevirtual   #39  <Method Resources Context.getResources()>
	//    6   12:invokevirtual   #45  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    7   15:getfield        #50  <Field float DisplayMetrics.density>
	//    8   18:fstore_3        
		int j = (int)(1.75F * f);
	//    9   19:ldc1            #21  <Float 1.75F>
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
	//   20   33:ldc1            #17  <Float 3.5F>
	//   21   35:fload_3         
	//   22   36:fmul            
	//   23   37:f2i             
	//   24   38:putfield        #52  <Field int mShadowRadius>
		if(elevationSupported())
	//*  25   41:aload_0         
	//*  26   42:invokespecial   #56  <Method boolean elevationSupported()>
	//*  27   45:ifeq            85
		{
			context = ((Context) (new ShapeDrawable(((android.graphics.drawable.shapes.Shape) (new OvalShape())))));
	//   28   48:new             #58  <Class ShapeDrawable>
	//   29   51:dup             
	//   30   52:new             #60  <Class OvalShape>
	//   31   55:dup             
	//   32   56:invokespecial   #63  <Method void OvalShape()>
	//   33   59:invokespecial   #66  <Method void ShapeDrawable(android.graphics.drawable.shapes.Shape)>
	//   34   62:astore_1        
			ViewCompat.setElevation(((android.view.View) (this)), f * 4F);
	//   35   63:aload_0         
	//   36   64:fload_3         
	//   37   65:ldc1            #67  <Float 4F>
	//   38   67:fmul            
	//   39   68:invokestatic    #73  <Method void ViewCompat.setElevation(android.view.View, float)>
		} else
	//*  40   71:aload_1         
	//*  41   72:invokevirtual   #77  <Method Paint ShapeDrawable.getPaint()>
	//*  42   75:iload_2         
	//*  43   76:invokevirtual   #83  <Method void Paint.setColor(int)>
	//*  44   79:aload_0         
	//*  45   80:aload_1         
	//*  46   81:invokestatic    #87  <Method void ViewCompat.setBackground(android.view.View, android.graphics.drawable.Drawable)>
	//*  47   84:return          
		{
			context = ((Context) (new ShapeDrawable(((android.graphics.drawable.shapes.Shape) (new OvalShadow(mShadowRadius))))));
	//   48   85:new             #58  <Class ShapeDrawable>
	//   49   88:dup             
	//   50   89:new             #6   <Class CircleImageView$OvalShadow>
	//   51   92:dup             
	//   52   93:aload_0         
	//   53   94:aload_0         
	//   54   95:getfield        #52  <Field int mShadowRadius>
	//   55   98:invokespecial   #90  <Method void CircleImageView$OvalShadow(CircleImageView, int)>
	//   56  101:invokespecial   #66  <Method void ShapeDrawable(android.graphics.drawable.shapes.Shape)>
	//   57  104:astore_1        
			setLayerType(1, ((ShapeDrawable) (context)).getPaint());
	//   58  105:aload_0         
	//   59  106:iconst_1        
	//   60  107:aload_1         
	//   61  108:invokevirtual   #77  <Method Paint ShapeDrawable.getPaint()>
	//   62  111:invokevirtual   #94  <Method void setLayerType(int, Paint)>
			((ShapeDrawable) (context)).getPaint().setShadowLayer(mShadowRadius, k, j, 0x1e000000);
	//   63  114:aload_1         
	//   64  115:invokevirtual   #77  <Method Paint ShapeDrawable.getPaint()>
	//   65  118:aload_0         
	//   66  119:getfield        #52  <Field int mShadowRadius>
	//   67  122:i2f             
	//   68  123:iload           5
	//   69  125:i2f             
	//   70  126:iload           4
	//   71  128:i2f             
	//   72  129:ldc1            #12  <Int 0x1e000000>
	//   73  131:invokevirtual   #98  <Method void Paint.setShadowLayer(float, float, float, int)>
			j = mShadowRadius;
	//   74  134:aload_0         
	//   75  135:getfield        #52  <Field int mShadowRadius>
	//   76  138:istore          4
			setPadding(j, j, j, j);
	//   77  140:aload_0         
	//   78  141:iload           4
	//   79  143:iload           4
	//   80  145:iload           4
	//   81  147:iload           4
	//   82  149:invokevirtual   #102 <Method void setPadding(int, int, int, int)>
		}
		((ShapeDrawable) (context)).getPaint().setColor(i);
		ViewCompat.setBackground(((android.view.View) (this)), ((android.graphics.drawable.Drawable) (context)));
	//*  83  152:goto            71
	}

	private boolean elevationSupported()
	{
		return android.os.Build.VERSION.SDK_INT >= 21;
	//    0    0:getstatic       #108 <Field int android.os.Build$VERSION.SDK_INT>
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
	//    1    1:invokespecial   #111 <Method void ImageView.onAnimationEnd()>
		if(mListener != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #113 <Field android.view.animation.Animation$AnimationListener mListener>
	//*   4    8:ifnull          24
			mListener.onAnimationEnd(getAnimation());
	//    5   11:aload_0         
	//    6   12:getfield        #113 <Field android.view.animation.Animation$AnimationListener mListener>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #117 <Method android.view.animation.Animation getAnimation()>
	//    9   19:invokeinterface #122 <Method void android.view.animation.Animation$AnimationListener.onAnimationEnd(android.view.animation.Animation)>
	//   10   24:return          
	}

	public void onAnimationStart()
	{
		super.onAnimationStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #125 <Method void ImageView.onAnimationStart()>
		if(mListener != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #113 <Field android.view.animation.Animation$AnimationListener mListener>
	//*   4    8:ifnull          24
			mListener.onAnimationStart(getAnimation());
	//    5   11:aload_0         
	//    6   12:getfield        #113 <Field android.view.animation.Animation$AnimationListener mListener>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #117 <Method android.view.animation.Animation getAnimation()>
	//    9   19:invokeinterface #127 <Method void android.view.animation.Animation$AnimationListener.onAnimationStart(android.view.animation.Animation)>
	//   10   24:return          
	}

	protected void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #131 <Method void ImageView.onMeasure(int, int)>
		if(!elevationSupported())
	//*   4    6:aload_0         
	//*   5    7:invokespecial   #56  <Method boolean elevationSupported()>
	//*   6   10:ifne            39
			setMeasuredDimension(getMeasuredWidth() + mShadowRadius * 2, getMeasuredHeight() + mShadowRadius * 2);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #135 <Method int getMeasuredWidth()>
	//   10   18:aload_0         
	//   11   19:getfield        #52  <Field int mShadowRadius>
	//   12   22:iconst_2        
	//   13   23:imul            
	//   14   24:iadd            
	//   15   25:aload_0         
	//   16   26:invokevirtual   #138 <Method int getMeasuredHeight()>
	//   17   29:aload_0         
	//   18   30:getfield        #52  <Field int mShadowRadius>
	//   19   33:iconst_2        
	//   20   34:imul            
	//   21   35:iadd            
	//   22   36:invokevirtual   #141 <Method void setMeasuredDimension(int, int)>
	//   23   39:return          
	}

	public void setAnimationListener(android.view.animation.Animation.AnimationListener animationlistener)
	{
		mListener = animationlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #113 <Field android.view.animation.Animation$AnimationListener mListener>
	//    3    5:return          
	}

	public void setBackgroundColor(int i)
	{
		if(getBackground() instanceof ShapeDrawable)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #148 <Method android.graphics.drawable.Drawable getBackground()>
	//*   2    4:instanceof      #58  <Class ShapeDrawable>
	//*   3    7:ifeq            24
			((ShapeDrawable)getBackground()).getPaint().setColor(i);
	//    4   10:aload_0         
	//    5   11:invokevirtual   #148 <Method android.graphics.drawable.Drawable getBackground()>
	//    6   14:checkcast       #58  <Class ShapeDrawable>
	//    7   17:invokevirtual   #77  <Method Paint ShapeDrawable.getPaint()>
	//    8   20:iload_1         
	//    9   21:invokevirtual   #83  <Method void Paint.setColor(int)>
	//   10   24:return          
	}

	public void setBackgroundColorRes(int i)
	{
		setBackgroundColor(ContextCompat.getColor(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #33  <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #155 <Method int ContextCompat.getColor(Context, int)>
	//    5    9:invokevirtual   #157 <Method void setBackgroundColor(int)>
	//    6   12:return          
	}

	private static final int FILL_SHADOW_COLOR = 0x3d000000;
	private static final int KEY_SHADOW_COLOR = 0x1e000000;
	private static final int SHADOW_ELEVATION = 4;
	private static final float SHADOW_RADIUS = 3.5F;
	private static final float X_OFFSET = 0F;
	private static final float Y_OFFSET = 1.75F;
	private android.view.animation.Animation.AnimationListener mListener;
	int mShadowRadius;
}
