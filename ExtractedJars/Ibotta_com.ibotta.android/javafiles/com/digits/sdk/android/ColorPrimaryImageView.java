// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ColorPrimaryImageView extends ImageView
{

	public ColorPrimaryImageView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #9   <Method void ColorPrimaryImageView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public ColorPrimaryImageView(Context context, AttributeSet attributeset, int i)
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

	private int getTextColorPrimary(Context context)
	{
		context = ((Context) (context.getTheme().obtainStyledAttributes(new int[] {
			0x1010036
		})));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #23  <Method android.content.res.Resources$Theme Context.getTheme()>
	//    2    4:iconst_1        
	//    3    5:newarray        int[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:ldc1            #24  <Int 0x1010036>
	//    7   11:iastore         
	//    8   12:invokevirtual   #30  <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(int[])>
	//    9   15:astore_1        
		int i = ((TypedArray) (context)).getColor(0, getResources().getColor(R.color.dgts__default_logo_name));
	//   10   16:aload_1         
	//   11   17:iconst_0        
	//   12   18:aload_0         
	//   13   19:invokevirtual   #34  <Method Resources getResources()>
	//   14   22:getstatic       #40  <Field int R$color.dgts__default_logo_name>
	//   15   25:invokevirtual   #46  <Method int Resources.getColor(int)>
	//   16   28:invokevirtual   #51  <Method int TypedArray.getColor(int, int)>
	//   17   31:istore_2        
		((TypedArray) (context)).recycle();
	//   18   32:aload_1         
	//   19   33:invokevirtual   #55  <Method void TypedArray.recycle()>
		return i;
	//   20   36:iload_2         
	//   21   37:ireturn         
	}

	private void init(Context context)
	{
		setColorFilter(getTextColorPrimary(context), android.graphics.PorterDuff.Mode.SRC_IN);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokespecial   #57  <Method int getTextColorPrimary(Context)>
	//    4    6:getstatic       #63  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//    5    9:invokevirtual   #67  <Method void setColorFilter(int, android.graphics.PorterDuff$Mode)>
	//    6   12:return          
	}
}
