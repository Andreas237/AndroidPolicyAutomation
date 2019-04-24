// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.cast:
//			MediaMetadata

private static final class MediaMetadata$zza
{

	public final MediaMetadata$zza zza(String s, String s1, int i)
	{
		zzdt.put(((Object) (s)), ((Object) (s1)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Map zzdt>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #34  <Method Object Map.put(Object, Object)>
	//    5   11:pop             
		zzdu.put(((Object) (s1)), ((Object) (s)));
	//    6   12:aload_0         
	//    7   13:getfield        #24  <Field Map zzdu>
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokeinterface #34  <Method Object Map.put(Object, Object)>
	//   11   23:pop             
		zzdv.put(((Object) (s)), ((Object) (Integer.valueOf(i))));
	//   12   24:aload_0         
	//   13   25:getfield        #26  <Field Map zzdv>
	//   14   28:aload_1         
	//   15   29:iload_3         
	//   16   30:invokestatic    #40  <Method Integer Integer.valueOf(int)>
	//   17   33:invokeinterface #34  <Method Object Map.put(Object, Object)>
	//   18   38:pop             
		return this;
	//   19   39:aload_0         
	//   20   40:areturn         
	}

	public final String zze(String s)
	{
		return (String)zzdt.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Map zzdt>
	//    2    4:aload_1         
	//    3    5:invokeinterface #46  <Method Object Map.get(Object)>
	//    4   10:checkcast       #48  <Class String>
	//    5   13:areturn         
	}

	public final String zzf(String s)
	{
		return (String)zzdu.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Map zzdu>
	//    2    4:aload_1         
	//    3    5:invokeinterface #46  <Method Object Map.get(Object)>
	//    4   10:checkcast       #48  <Class String>
	//    5   13:areturn         
	}

	public final int zzg(String s)
	{
		s = ((String) ((Integer)zzdv.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Map zzdv>
	//    2    4:aload_1         
	//    3    5:invokeinterface #46  <Method Object Map.get(Object)>
	//    4   10:checkcast       #36  <Class Integer>
	//    5   13:astore_1        
		if(s != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          23
			return ((Integer) (s)).intValue();
	//    8   18:aload_1         
	//    9   19:invokevirtual   #55  <Method int Integer.intValue()>
	//   10   22:ireturn         
		else
			return 0;
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	private final Map zzdt = new HashMap();
	private final Map zzdu = new HashMap();
	private final Map zzdv = new HashMap();

	public MediaMetadata$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void HashMap()>
	//    6   12:putfield        #22  <Field Map zzdt>
	//    7   15:aload_0         
	//    8   16:new             #19  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #20  <Method void HashMap()>
	//   11   23:putfield        #24  <Field Map zzdu>
	//   12   26:aload_0         
	//   13   27:new             #19  <Class HashMap>
	//   14   30:dup             
	//   15   31:invokespecial   #20  <Method void HashMap()>
	//   16   34:putfield        #26  <Field Map zzdv>
	//   17   37:return          
	}
}
