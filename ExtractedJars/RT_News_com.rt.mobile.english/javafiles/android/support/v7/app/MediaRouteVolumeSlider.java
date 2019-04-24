// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;
import android.util.Log;

// Referenced classes of package android.support.v7.app:
//			MediaRouterThemeHelper

class MediaRouteVolumeSlider extends AppCompatSeekBar
{

	public MediaRouteVolumeSlider(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #21  <Method void MediaRouteVolumeSlider(Context, AttributeSet)>
	//    4    6:return          
	}

	public MediaRouteVolumeSlider(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.seekBarStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #27  <Field int android.support.v7.appcompat.R$attr.seekBarStyle>
	//    4    6:invokespecial   #30  <Method void MediaRouteVolumeSlider(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public MediaRouteVolumeSlider(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #31  <Method void AppCompatSeekBar(Context, AttributeSet, int)>
		mDisabledAlpha = MediaRouterThemeHelper.getDisabledAlpha(context);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokestatic    #37  <Method float MediaRouterThemeHelper.getDisabledAlpha(Context)>
	//    8   12:putfield        #39  <Field float mDisabledAlpha>
	//    9   15:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void AppCompatSeekBar.drawableStateChanged()>
		int i;
		if(isEnabled())
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #47  <Method boolean isEnabled()>
	//*   4    8:ifeq            18
			i = 255;
	//    5   11:sipush          255
	//    6   14:istore_1        
		else
	//*   7   15:goto            27
			i = (int)(255F * mDisabledAlpha);
	//    8   18:ldc1            #48  <Float 255F>
	//    9   20:aload_0         
	//   10   21:getfield        #39  <Field float mDisabledAlpha>
	//   11   24:fmul            
	//   12   25:f2i             
	//   13   26:istore_1        
		mThumb.setColorFilter(mColor, android.graphics.PorterDuff.Mode.SRC_IN);
	//   14   27:aload_0         
	//   15   28:getfield        #50  <Field Drawable mThumb>
	//   16   31:aload_0         
	//   17   32:getfield        #52  <Field int mColor>
	//   18   35:getstatic       #58  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   19   38:invokevirtual   #64  <Method void Drawable.setColorFilter(int, android.graphics.PorterDuff$Mode)>
		mThumb.setAlpha(i);
	//   20   41:aload_0         
	//   21   42:getfield        #50  <Field Drawable mThumb>
	//   22   45:iload_1         
	//   23   46:invokevirtual   #68  <Method void Drawable.setAlpha(int)>
		getProgressDrawable().setColorFilter(mColor, android.graphics.PorterDuff.Mode.SRC_IN);
	//   24   49:aload_0         
	//   25   50:invokevirtual   #72  <Method Drawable getProgressDrawable()>
	//   26   53:aload_0         
	//   27   54:getfield        #52  <Field int mColor>
	//   28   57:getstatic       #58  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   29   60:invokevirtual   #64  <Method void Drawable.setColorFilter(int, android.graphics.PorterDuff$Mode)>
		getProgressDrawable().setAlpha(i);
	//   30   63:aload_0         
	//   31   64:invokevirtual   #72  <Method Drawable getProgressDrawable()>
	//   32   67:iload_1         
	//   33   68:invokevirtual   #68  <Method void Drawable.setAlpha(int)>
	//   34   71:return          
	}

	public void setColor(int i)
	{
		if(mColor == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field int mColor>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		if(Color.alpha(i) != 255)
	//*   5    9:iload_1         
	//*   6   10:invokestatic    #79  <Method int Color.alpha(int)>
	//*   7   13:sipush          255
	//*   8   16:icmpeq          53
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   19:new             #81  <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #83  <Method void StringBuilder()>
	//   12   26:astore_2        
			stringbuilder.append("Volume slider color cannot be translucent: #");
	//   13   27:aload_2         
	//   14   28:ldc1            #85  <String "Volume slider color cannot be translucent: #">
	//   15   30:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
			stringbuilder.append(Integer.toHexString(i));
	//   17   34:aload_2         
	//   18   35:iload_1         
	//   19   36:invokestatic    #95  <Method String Integer.toHexString(int)>
	//   20   39:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   21   42:pop             
			Log.e("MediaRouteVolumeSlider", stringbuilder.toString());
	//   22   43:ldc1            #8   <String "MediaRouteVolumeSlider">
	//   23   45:aload_2         
	//   24   46:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   25   49:invokestatic    #105 <Method int Log.e(String, String)>
	//   26   52:pop             
		}
		mColor = i;
	//   27   53:aload_0         
	//   28   54:iload_1         
	//   29   55:putfield        #52  <Field int mColor>
	//   30   58:return          
	}

	public void setHideThumb(boolean flag)
	{
		if(mHideThumb == flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #109 <Field boolean mHideThumb>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		mHideThumb = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #109 <Field boolean mHideThumb>
		Drawable drawable;
		if(mHideThumb)
	//*   8   14:aload_0         
	//*   9   15:getfield        #109 <Field boolean mHideThumb>
	//*  10   18:ifeq            26
			drawable = null;
	//   11   21:aconst_null     
	//   12   22:astore_2        
		else
	//*  13   23:goto            31
			drawable = mThumb;
	//   14   26:aload_0         
	//   15   27:getfield        #50  <Field Drawable mThumb>
	//   16   30:astore_2        
		super.setThumb(drawable);
	//   17   31:aload_0         
	//   18   32:aload_2         
	//   19   33:invokespecial   #113 <Method void AppCompatSeekBar.setThumb(Drawable)>
	//   20   36:return          
	}

	public void setThumb(Drawable drawable)
	{
		mThumb = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #50  <Field Drawable mThumb>
		if(mHideThumb)
	//*   3    5:aload_0         
	//*   4    6:getfield        #109 <Field boolean mHideThumb>
	//*   5    9:ifeq            17
			drawable = null;
	//    6   12:aconst_null     
	//    7   13:astore_1        
		else
	//*   8   14:goto            22
			drawable = mThumb;
	//    9   17:aload_0         
	//   10   18:getfield        #50  <Field Drawable mThumb>
	//   11   21:astore_1        
		super.setThumb(drawable);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokespecial   #113 <Method void AppCompatSeekBar.setThumb(Drawable)>
	//   15   27:return          
	}

	private static final String TAG = "MediaRouteVolumeSlider";
	private int mColor;
	private final float mDisabledAlpha;
	private boolean mHideThumb;
	private Drawable mThumb;
}
