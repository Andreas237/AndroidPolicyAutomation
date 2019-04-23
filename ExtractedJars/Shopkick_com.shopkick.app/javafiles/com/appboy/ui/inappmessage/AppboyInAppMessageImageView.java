// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage;

import android.content.Context;
import android.graphics.*;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.appboy.enums.inappmessage.CropType;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy.ui.inappmessage:
//			IInAppMessageImageView

public class AppboyInAppMessageImageView extends ImageView
	implements IInAppMessageImageView
{

	public AppboyInAppMessageImageView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #32  <Method void ImageView(Context, AttributeSet)>
		mClipPath = new Path();
	//    4    6:aload_0         
	//    5    7:new             #34  <Class Path>
	//    6   10:dup             
	//    7   11:invokespecial   #36  <Method void Path()>
	//    8   14:putfield        #38  <Field Path mClipPath>
		mRect = new RectF();
	//    9   17:aload_0         
	//   10   18:new             #40  <Class RectF>
	//   11   21:dup             
	//   12   22:invokespecial   #41  <Method void RectF()>
	//   13   25:putfield        #43  <Field RectF mRect>
	//   14   28:return          
	}

	boolean clipCanvasToPath(Canvas canvas, int i, int j)
	{
		if(mInAppRadii != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field float[] mInAppRadii>
	//*   2    4:ifnull          69
		{
			try
			{
				mClipPath.reset();
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field Path mClipPath>
	//    5   11:invokevirtual   #52  <Method void Path.reset()>
				mRect.set(0.0F, 0.0F, i, j);
	//    6   14:aload_0         
	//    7   15:getfield        #43  <Field RectF mRect>
	//    8   18:fconst_0        
	//    9   19:fconst_0        
	//   10   20:iload_2         
	//   11   21:i2f             
	//   12   22:iload_3         
	//   13   23:i2f             
	//   14   24:invokevirtual   #56  <Method void RectF.set(float, float, float, float)>
				mClipPath.addRoundRect(mRect, mInAppRadii, android.graphics.Path.Direction.CW);
	//   15   27:aload_0         
	//   16   28:getfield        #38  <Field Path mClipPath>
	//   17   31:aload_0         
	//   18   32:getfield        #43  <Field RectF mRect>
	//   19   35:aload_0         
	//   20   36:getfield        #49  <Field float[] mInAppRadii>
	//   21   39:getstatic       #62  <Field android.graphics.Path$Direction android.graphics.Path$Direction.CW>
	//   22   42:invokevirtual   #66  <Method void Path.addRoundRect(RectF, float[], android.graphics.Path$Direction)>
				canvas.clipPath(mClipPath);
	//   23   45:aload_1         
	//   24   46:aload_0         
	//   25   47:getfield        #38  <Field Path mClipPath>
	//   26   50:invokevirtual   #72  <Method boolean Canvas.clipPath(Path)>
	//   27   53:pop             
			}
	//*  28   54:iconst_1        
	//*  29   55:ireturn         
			// Misplaced declaration of an exception variable
			catch(Canvas canvas)
	//*  30   56:astore_1        
			{
				AppboyLogger.e(TAG, "Encountered exception while trying to clip in-app message image", ((Throwable) (canvas)));
	//   31   57:getstatic       #27  <Field String TAG>
	//   32   60:ldc1            #74  <String "Encountered exception while trying to clip in-app message image">
	//   33   62:aload_1         
	//   34   63:invokestatic    #78  <Method int AppboyLogger.e(String, String, Throwable)>
	//   35   66:pop             
				return false;
	//   36   67:iconst_0        
	//   37   68:ireturn         
			}
			return true;
		} else
		{
			return false;
	//   38   69:iconst_0        
	//   39   70:ireturn         
		}
	}

	Path getClipPath()
	{
		return mClipPath;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Path mClipPath>
	//    2    4:areturn         
	}

	float[] getInAppRadii()
	{
		return mInAppRadii;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field float[] mInAppRadii>
	//    2    4:areturn         
	}

	RectF getRectf()
	{
		return mRect;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field RectF mRect>
	//    2    4:areturn         
	}

	protected void onDraw(Canvas canvas)
	{
		clipCanvasToPath(canvas, getWidth(), getHeight());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #90  <Method int getWidth()>
	//    4    6:aload_0         
	//    5    7:invokevirtual   #93  <Method int getHeight()>
	//    6   10:invokevirtual   #95  <Method boolean clipCanvasToPath(Canvas, int, int)>
	//    7   13:pop             
		super.onDraw(canvas);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #97  <Method void ImageView.onDraw(Canvas)>
	//   11   19:return          
	}

	void setClipPath(Path path)
	{
		mClipPath = path;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field Path mClipPath>
	//    3    5:return          
	}

	public void setCornersRadiiPx(float f, float f1, float f2, float f3)
	{
		mInAppRadii = (new float[] {
			f, f, f1, f1, f2, f2, f3, f3
		});
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:newarray        float[]
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:fload_1         
	//    6    8:fastore         
	//    7    9:dup             
	//    8   10:iconst_1        
	//    9   11:fload_1         
	//   10   12:fastore         
	//   11   13:dup             
	//   12   14:iconst_2        
	//   13   15:fload_2         
	//   14   16:fastore         
	//   15   17:dup             
	//   16   18:iconst_3        
	//   17   19:fload_2         
	//   18   20:fastore         
	//   19   21:dup             
	//   20   22:iconst_4        
	//   21   23:fload_3         
	//   22   24:fastore         
	//   23   25:dup             
	//   24   26:iconst_5        
	//   25   27:fload_3         
	//   26   28:fastore         
	//   27   29:dup             
	//   28   30:bipush          6
	//   29   32:fload           4
	//   30   34:fastore         
	//   31   35:dup             
	//   32   36:bipush          7
	//   33   38:fload           4
	//   34   40:fastore         
	//   35   41:putfield        #49  <Field float[] mInAppRadii>
	//   36   44:return          
	}

	public void setCornersRadiusPx(float f)
	{
		setCornersRadiiPx(f, f, f, f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_1         
	//    3    3:fload_1         
	//    4    4:fload_1         
	//    5    5:invokevirtual   #104 <Method void setCornersRadiiPx(float, float, float, float)>
	//    6    8:return          
	}

	public void setInAppMessageImageCropType(CropType croptype)
	{
		if(croptype.equals(((Object) (CropType.FIT_CENTER))))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #112 <Field CropType CropType.FIT_CENTER>
	//*   2    4:invokevirtual   #116 <Method boolean CropType.equals(Object)>
	//*   3    7:ifeq            18
		{
			setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
	//    4   10:aload_0         
	//    5   11:getstatic       #121 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_CENTER>
	//    6   14:invokevirtual   #125 <Method void setScaleType(android.widget.ImageView$ScaleType)>
			return;
	//    7   17:return          
		}
		if(croptype.equals(((Object) (CropType.CENTER_CROP))))
	//*   8   18:aload_1         
	//*   9   19:getstatic       #128 <Field CropType CropType.CENTER_CROP>
	//*  10   22:invokevirtual   #116 <Method boolean CropType.equals(Object)>
	//*  11   25:ifeq            35
			setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
	//   12   28:aload_0         
	//   13   29:getstatic       #130 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_CROP>
	//   14   32:invokevirtual   #125 <Method void setScaleType(android.widget.ImageView$ScaleType)>
	//   15   35:return          
	}

	void setRectf(RectF rectf)
	{
		mRect = rectf;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field RectF mRect>
	//    3    5:return          
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/inappmessage/AppboyInAppMessageImageView);
	private Path mClipPath;
	private float mInAppRadii[];
	private RectF mRect;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyInAppMessageImageView>
	//    1    2:invokestatic    #25  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #27  <Field String TAG>
	//*   3    8:return          
	}
}
