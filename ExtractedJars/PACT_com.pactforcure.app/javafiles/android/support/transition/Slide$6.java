// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.transition:
//			Slide

static final class Slide$6 extends lculateSlideVertical
{

	public float getGoneY(ViewGroup viewgroup, View view)
	{
		return view.getTranslationY() + (float)viewgroup.getHeight();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #20  <Method float View.getTranslationY()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #26  <Method int ViewGroup.getHeight()>
	//    4    8:i2f             
	//    5    9:fadd            
	//    6   10:freturn         
	}

	Slide$6()
	{
		super(((Slide$1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #11  <Method void Slide$CalculateSlideVertical(Slide$1)>
	//    3    5:return          
	}
}
