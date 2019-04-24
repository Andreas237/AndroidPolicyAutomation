// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.internal:
//			zzaqe, zzaqc, zzaqa

public class zzaqb
{

	public zzaqb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void ArrayList()>
	//    6   12:putfield        #19  <Field Collection zzAZ>
	//    7   15:aload_0         
	//    8   16:new             #16  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #17  <Method void ArrayList()>
	//   11   23:putfield        #21  <Field Collection zzBa>
	//   12   26:aload_0         
	//   13   27:new             #16  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #17  <Method void ArrayList()>
	//   16   34:putfield        #23  <Field Collection zzBb>
	//   17   37:return          
	}

	public static void initialize(Context context)
	{
		zzaqe.zzDF().initialize(context);
	//    0    0:invokestatic    #32  <Method zzaqc zzaqe.zzDF()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #36  <Method void zzaqc.initialize(Context)>
	//    3    7:return          
	}

	public void zza(zzaqa zzaqa)
	{
		zzAZ.add(((Object) (zzaqa)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Collection zzAZ>
	//    2    4:aload_1         
	//    3    5:invokeinterface #44  <Method boolean Collection.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	private final Collection zzAZ = new ArrayList();
	private final Collection zzBa = new ArrayList();
	private final Collection zzBb = new ArrayList();
}
