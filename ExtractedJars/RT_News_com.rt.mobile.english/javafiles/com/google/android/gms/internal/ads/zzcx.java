// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.HashMap;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbh

public final class zzcx extends zzbh
{

	public zzcx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void zzbh()>
	//    2    4:return          
	}

	public zzcx(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void zzbh()>
		((zzbh)this).zzj(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #19  <Method void zzbh.zzj(String)>
	//    5    9:return          
	}

	protected final void zzj(String s)
	{
		s = ((String) (zzk(s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method HashMap zzk(String)>
	//    2    4:astore_1        
		if(s != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          54
		{
			zzro = (Long)((HashMap) (s)).get(((Object) (Integer.valueOf(0))));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:invokestatic    #29  <Method Integer Integer.valueOf(int)>
	//    9   15:invokevirtual   #35  <Method Object HashMap.get(Object)>
	//   10   18:checkcast       #37  <Class Long>
	//   11   21:putfield        #39  <Field Long zzro>
			zzrp = (Boolean)((HashMap) (s)).get(((Object) (Integer.valueOf(1))));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:iconst_1        
	//   15   27:invokestatic    #29  <Method Integer Integer.valueOf(int)>
	//   16   30:invokevirtual   #35  <Method Object HashMap.get(Object)>
	//   17   33:checkcast       #41  <Class Boolean>
	//   18   36:putfield        #43  <Field Boolean zzrp>
			zzrq = (Boolean)((HashMap) (s)).get(((Object) (Integer.valueOf(2))));
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:iconst_2        
	//   22   42:invokestatic    #29  <Method Integer Integer.valueOf(int)>
	//   23   45:invokevirtual   #35  <Method Object HashMap.get(Object)>
	//   24   48:checkcast       #41  <Class Boolean>
	//   25   51:putfield        #45  <Field Boolean zzrq>
		}
	//   26   54:return          
	}

	protected final HashMap zzu()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #31  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void HashMap()>
	//    3    7:astore_1        
		hashmap.put(((Object) (Integer.valueOf(0))), ((Object) (zzro)));
	//    4    8:aload_1         
	//    5    9:iconst_0        
	//    6   10:invokestatic    #29  <Method Integer Integer.valueOf(int)>
	//    7   13:aload_0         
	//    8   14:getfield        #39  <Field Long zzro>
	//    9   17:invokevirtual   #52  <Method Object HashMap.put(Object, Object)>
	//   10   20:pop             
		hashmap.put(((Object) (Integer.valueOf(1))), ((Object) (zzrp)));
	//   11   21:aload_1         
	//   12   22:iconst_1        
	//   13   23:invokestatic    #29  <Method Integer Integer.valueOf(int)>
	//   14   26:aload_0         
	//   15   27:getfield        #43  <Field Boolean zzrp>
	//   16   30:invokevirtual   #52  <Method Object HashMap.put(Object, Object)>
	//   17   33:pop             
		hashmap.put(((Object) (Integer.valueOf(2))), ((Object) (zzrq)));
	//   18   34:aload_1         
	//   19   35:iconst_2        
	//   20   36:invokestatic    #29  <Method Integer Integer.valueOf(int)>
	//   21   39:aload_0         
	//   22   40:getfield        #45  <Field Boolean zzrq>
	//   23   43:invokevirtual   #52  <Method Object HashMap.put(Object, Object)>
	//   24   46:pop             
		return hashmap;
	//   25   47:aload_1         
	//   26   48:areturn         
	}

	public Long zzro;
	public Boolean zzrp;
	public Boolean zzrq;
}
