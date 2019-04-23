// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.flags:
//			Singletons, zzb, Flag

public class FlagRegistry
{

	public FlagRegistry()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void ArrayList()>
	//    6   12:putfield        #19  <Field Collection zzg>
	//    7   15:aload_0         
	//    8   16:new             #16  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #17  <Method void ArrayList()>
	//   11   23:putfield        #21  <Field Collection zzh>
	//   12   26:aload_0         
	//   13   27:new             #16  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #17  <Method void ArrayList()>
	//   16   34:putfield        #23  <Field Collection zzi>
	//   17   37:return          
	}

	public static void initialize(Context context)
	{
		Singletons.zzd().initialize(context);
	//    0    0:invokestatic    #33  <Method zzb Singletons.zzd()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #37  <Method void zzb.initialize(Context)>
	//    3    7:return          
	}

	public final void zza(Flag flag)
	{
		zzg.add(((Object) (flag)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Collection zzg>
	//    2    4:aload_1         
	//    3    5:invokeinterface #46  <Method boolean Collection.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	private final Collection zzg = new ArrayList();
	private final Collection zzh = new ArrayList();
	private final Collection zzi = new ArrayList();
}
