// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.support.c.b;
import android.support.c.k;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aze

public final class azd extends k
{

	public azd(aze aze1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void k()>
		a = new WeakReference(((Object) (aze1)));
	//    2    4:aload_0         
	//    3    5:new             #13  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #16  <Method void WeakReference(Object)>
	//    7   13:putfield        #18  <Field WeakReference a>
	//    8   16:return          
	}

	public final void a(ComponentName componentname, b b)
	{
		componentname = ((ComponentName) ((aze)a.get()));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field WeakReference a>
	//    2    4:invokevirtual   #24  <Method Object WeakReference.get()>
	//    3    7:checkcast       #26  <Class aze>
	//    4   10:astore_1        
		if(componentname != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          22
			((aze) (componentname)).a(b);
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:invokeinterface #29  <Method void aze.a(b)>
	//   10   22:return          
	}

	public final void onServiceDisconnected(ComponentName componentname)
	{
		componentname = ((ComponentName) ((aze)a.get()));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field WeakReference a>
	//    2    4:invokevirtual   #24  <Method Object WeakReference.get()>
	//    3    7:checkcast       #26  <Class aze>
	//    4   10:astore_1        
		if(componentname != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          21
			((aze) (componentname)).a();
	//    7   15:aload_1         
	//    8   16:invokeinterface #33  <Method void aze.a()>
	//    9   21:return          
	}

	private WeakReference a;
}
