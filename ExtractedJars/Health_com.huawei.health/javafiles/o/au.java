// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.view.View;

// Referenced classes of package o:
//			ax, ay, at, bb, 
//			aw

class au extends ax
{

	au()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void ax()>
	//    2    4:return          
	}

	public bb a(View view)
	{
		return ((bb) (new ay(view)));
	//    0    0:new             #17  <Class ay>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #20  <Method void ay(View)>
	//    4    8:areturn         
	}

	public aw d(View view)
	{
		return ((aw) (new at(view)));
	//    0    0:new             #25  <Class at>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #26  <Method void at(View)>
	//    4    8:areturn         
	}
}
