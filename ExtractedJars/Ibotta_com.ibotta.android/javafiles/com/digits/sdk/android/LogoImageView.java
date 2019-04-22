// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

// Referenced classes of package com.digits.sdk.android:
//			ThemeUtils

public class LogoImageView extends ImageView
{

	public LogoImageView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #9   <Method void LogoImageView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public LogoImageView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #11  <Method void ImageView(Context, AttributeSet, int)>
		initImageView(context);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokevirtual   #15  <Method void initImageView(Context)>
	//    8   12:return          
	}

	void initImageView(Context context)
	{
		context = ((Context) (ThemeUtils.getLogoDrawable(context.getTheme())));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #21  <Method android.content.res.Resources$Theme Context.getTheme()>
	//    2    4:invokestatic    #27  <Method Drawable ThemeUtils.getLogoDrawable(android.content.res.Resources$Theme)>
	//    3    7:astore_1        
		if(context != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          23
		{
			setVisibility(0);
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #31  <Method void setVisibility(int)>
			setImageDrawable(((Drawable) (context)));
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #35  <Method void setImageDrawable(Drawable)>
			return;
	//   12   22:return          
		} else
		{
			setVisibility(8);
	//   13   23:aload_0         
	//   14   24:bipush          8
	//   15   26:invokevirtual   #31  <Method void setVisibility(int)>
			return;
	//   16   29:return          
		}
	}

	protected void onMeasure(int i, int j)
	{
		i = android.view.View.MeasureSpec.getSize(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #43  <Method int android.view.View$MeasureSpec.getSize(int)>
	//    2    4:istore_1        
		setMeasuredDimension(i, (getDrawable().getIntrinsicHeight() * i) / getDrawable().getIntrinsicWidth());
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #47  <Method Drawable getDrawable()>
	//    7   11:invokevirtual   #53  <Method int Drawable.getIntrinsicHeight()>
	//    8   14:iload_1         
	//    9   15:imul            
	//   10   16:aload_0         
	//   11   17:invokevirtual   #47  <Method Drawable getDrawable()>
	//   12   20:invokevirtual   #56  <Method int Drawable.getIntrinsicWidth()>
	//   13   23:idiv            
	//   14   24:invokevirtual   #59  <Method void setMeasuredDimension(int, int)>
	//   15   27:return          
	}
}
