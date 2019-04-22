// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

// Referenced classes of package com.digits.sdk.android:
//			ThemeUtils

public class AccentImageView extends ImageView
{

	public AccentImageView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #9   <Method void AccentImageView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public AccentImageView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #11  <Method void ImageView(Context, AttributeSet, int)>
		init(context);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokespecial   #15  <Method void init(Context)>
	//    8   12:return          
	}

	private void init(Context context)
	{
		setColorFilter(ThemeUtils.getAccentColor(getResources(), context.getTheme()), android.graphics.PorterDuff.Mode.SRC_IN);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #19  <Method android.content.res.Resources getResources()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #25  <Method android.content.res.Resources$Theme Context.getTheme()>
	//    5    9:invokestatic    #31  <Method int ThemeUtils.getAccentColor(android.content.res.Resources, android.content.res.Resources$Theme)>
	//    6   12:getstatic       #37  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//    7   15:invokevirtual   #41  <Method void setColorFilter(int, android.graphics.PorterDuff$Mode)>
	//    8   18:return          
	}
}
