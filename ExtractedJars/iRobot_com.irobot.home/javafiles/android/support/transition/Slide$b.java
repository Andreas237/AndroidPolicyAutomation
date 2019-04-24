// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.transition:
//			Slide

private static abstract class Slide$b
	implements Slide$a
{

	public float b(ViewGroup viewgroup, View view)
	{
		return view.getTranslationY();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #23  <Method float View.getTranslationY()>
	//    2    4:freturn         
	}

	private Slide$b()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	Slide$b(Slide$1 slide$1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Slide$b()>
	//    2    4:return          
	}
}
