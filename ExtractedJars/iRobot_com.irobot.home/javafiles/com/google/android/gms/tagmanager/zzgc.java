// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

// Referenced classes of package com.google.android.gms.tagmanager:
//			TagManager

final class zzgc
	implements ComponentCallbacks2
{

	zzgc(TagManager tagmanager)
	{
		zzbgt = tagmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field TagManager zzbgt>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void onConfigurationChanged(Configuration configuration)
	{
	//    0    0:return          
	}

	public final void onLowMemory()
	{
	//    0    0:return          
	}

	public final void onTrimMemory(int i)
	{
		if(i == 20)
	//*   0    0:iload_1         
	//*   1    1:bipush          20
	//*   2    3:icmpne          13
			zzbgt.dispatch();
	//    3    6:aload_0         
	//    4    7:getfield        #12  <Field TagManager zzbgt>
	//    5   10:invokevirtual   #26  <Method void TagManager.dispatch()>
	//    6   13:return          
	}

	private final TagManager zzbgt;
}
