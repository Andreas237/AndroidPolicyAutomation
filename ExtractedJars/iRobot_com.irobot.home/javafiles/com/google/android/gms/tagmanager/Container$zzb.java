// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzan, Container, zzgj, zzu

final class Container$zzb
	implements zzan
{

	public final Object zza(String s, Map map)
	{
		tionCallTagCallback tioncalltagcallback = zzazx.zzdd(s);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Container zzazx>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #28  <Method Container$FunctionCallTagCallback Container.zzdd(String)>
	//    4    8:astore_3        
		if(tioncalltagcallback != null)
	//*   5    9:aload_3         
	//*   6   10:ifnull          21
			tioncalltagcallback.execute(s, map);
	//    7   13:aload_3         
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokeinterface #34  <Method void Container$FunctionCallTagCallback.execute(String, Map)>
		return ((Object) (zzgj.zzqp()));
	//   11   21:invokestatic    #40  <Method String zzgj.zzqp()>
	//   12   24:areturn         
	}

	private final Container zzazx;

	private Container$zzb(Container container)
	{
		zzazx = container;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field Container zzazx>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	Container$zzb(Container container, zzu zzu)
	{
		this(container);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void Container$zzb(Container)>
	//    3    5:return          
	}
}
