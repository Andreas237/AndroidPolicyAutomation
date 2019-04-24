// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.transition:
//			Slide

private static abstract class Slide$CalculateSlideVertical
	implements Slide.CalculateSlide
{

	public float getGoneX(ViewGroup viewgroup, View view)
	{
		return view.getTranslationX();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #24  <Method float View.getTranslationX()>
	//    2    4:freturn         
	}

	private Slide$CalculateSlideVertical()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	Slide$CalculateSlideVertical(Slide._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Slide$CalculateSlideVertical()>
	//    2    4:return          
	}
}
