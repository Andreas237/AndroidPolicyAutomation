// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;

public class Converters
{

	public Converters()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static ColorStateList convertColorToColorStateList(int i)
	{
		return ColorStateList.valueOf(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #17  <Method ColorStateList ColorStateList.valueOf(int)>
	//    2    4:areturn         
	}

	public static ColorDrawable convertColorToDrawable(int i)
	{
		return new ColorDrawable(i);
	//    0    0:new             #22  <Class ColorDrawable>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:invokespecial   #25  <Method void ColorDrawable(int)>
	//    4    8:areturn         
	}
}
