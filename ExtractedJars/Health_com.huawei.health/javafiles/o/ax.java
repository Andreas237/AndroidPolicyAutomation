// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.view.View;

// Referenced classes of package o:
//			ba, az, ap, bb, 
//			aw

class ax
	implements ba
{

	ax()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public bb a(View view)
	{
		return ((bb) (new az(view.getWindowToken())));
	//    0    0:new             #19  <Class az>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #25  <Method android.os.IBinder View.getWindowToken()>
	//    4    8:invokespecial   #28  <Method void az(android.os.IBinder)>
	//    5   11:areturn         
	}

	public aw d(View view)
	{
		return ((aw) (ap.a(view)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #36  <Method ap ap.a(View)>
	//    2    4:areturn         
	}
}
