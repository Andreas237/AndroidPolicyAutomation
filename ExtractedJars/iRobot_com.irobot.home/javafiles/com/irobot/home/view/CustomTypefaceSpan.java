// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

public class CustomTypefaceSpan extends TypefaceSpan
{

	public CustomTypefaceSpan(String s, Typeface typeface)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void TypefaceSpan(String)>
		a = typeface;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #13  <Field Typeface a>
	//    6   10:return          
	}

	private static void a(Paint paint, Typeface typeface)
	{
		Typeface typeface1 = paint.getTypeface();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #21  <Method Typeface Paint.getTypeface()>
	//    2    4:astore_3        
		int i;
		if(typeface1 == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       14
			i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		else
	//*   7   11:goto            19
			i = typeface1.getStyle();
	//    8   14:aload_3         
	//    9   15:invokevirtual   #27  <Method int Typeface.getStyle()>
	//   10   18:istore_2        
		i &= typeface.getStyle();
	//   11   19:iload_2         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #27  <Method int Typeface.getStyle()>
	//   14   24:iand            
	//   15   25:istore_2        
		if((i & 1) != 0)
	//*  16   26:iload_2         
	//*  17   27:iconst_1        
	//*  18   28:iand            
	//*  19   29:ifeq            37
			paint.setFakeBoldText(true);
	//   20   32:aload_0         
	//   21   33:iconst_1        
	//   22   34:invokevirtual   #31  <Method void Paint.setFakeBoldText(boolean)>
		if((i & 2) != 0)
	//*  23   37:iload_2         
	//*  24   38:iconst_2        
	//*  25   39:iand            
	//*  26   40:ifeq            49
			paint.setTextSkewX(-0.25F);
	//   27   43:aload_0         
	//   28   44:ldc1            #32  <Float -0.25F>
	//   29   46:invokevirtual   #36  <Method void Paint.setTextSkewX(float)>
		paint.setTypeface(typeface);
	//   30   49:aload_0         
	//   31   50:aload_1         
	//   32   51:invokevirtual   #40  <Method Typeface Paint.setTypeface(Typeface)>
	//   33   54:pop             
	//   34   55:return          
	}

	public void updateDrawState(TextPaint textpaint)
	{
		a(((Paint) (textpaint)), a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #13  <Field Typeface a>
	//    3    5:invokestatic    #44  <Method void a(Paint, Typeface)>
	//    4    8:return          
	}

	public void updateMeasureState(TextPaint textpaint)
	{
		a(((Paint) (textpaint)), a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #13  <Field Typeface a>
	//    3    5:invokestatic    #44  <Method void a(Paint, Typeface)>
	//    4    8:return          
	}

	private final Typeface a;
}
