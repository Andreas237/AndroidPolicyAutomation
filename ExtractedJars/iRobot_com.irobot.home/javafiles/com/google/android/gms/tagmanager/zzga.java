// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//			TagManager

final class zzga
	implements DataLayer.zzb
{

	zzga(TagManager tagmanager)
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

	public final void zzd(Map map)
	{
		map = ((Map) (map.get("event")));
	//    0    0:aload_1         
	//    1    1:ldc1            #20  <String "event">
	//    2    3:invokeinterface #26  <Method Object Map.get(Object)>
	//    3    8:astore_1        
		if(map != null)
	//*   4    9:aload_1         
	//*   5   10:ifnull          24
			TagManager.zza(zzbgt, ((Object) (map)).toString());
	//    6   13:aload_0         
	//    7   14:getfield        #12  <Field TagManager zzbgt>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #30  <Method String Object.toString()>
	//   10   21:invokestatic    #36  <Method void TagManager.zza(TagManager, String)>
	//   11   24:return          
	}

	private final TagManager zzbgt;
}
