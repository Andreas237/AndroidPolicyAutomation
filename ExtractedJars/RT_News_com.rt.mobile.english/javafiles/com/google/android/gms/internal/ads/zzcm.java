// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.HashMap;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbh

public final class zzcm extends zzbh
{

	public zzcm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void zzbh()>
		zzri = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #13  <Long -1L>
	//    4    8:putfield        #16  <Field long zzri>
		zzrj = -1L;
	//    5   11:aload_0         
	//    6   12:ldc2w           #13  <Long -1L>
	//    7   15:putfield        #18  <Field long zzrj>
	//    8   18:return          
	}

	public zzcm(String s)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void zzcm()>
		((zzbh)this).zzj(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #24  <Method void zzbh.zzj(String)>
	//    5    9:return          
	}

	protected final void zzj(String s)
	{
		s = ((String) (zzk(s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #28  <Method HashMap zzk(String)>
	//    2    4:astore_1        
		if(s != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          45
		{
			zzri = ((Long)((HashMap) (s)).get(((Object) (Integer.valueOf(0))))).longValue();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//    9   15:invokevirtual   #40  <Method Object HashMap.get(Object)>
	//   10   18:checkcast       #42  <Class Long>
	//   11   21:invokevirtual   #46  <Method long Long.longValue()>
	//   12   24:putfield        #16  <Field long zzri>
			zzrj = ((Long)((HashMap) (s)).get(((Object) (Integer.valueOf(1))))).longValue();
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:iconst_1        
	//   16   30:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   17   33:invokevirtual   #40  <Method Object HashMap.get(Object)>
	//   18   36:checkcast       #42  <Class Long>
	//   19   39:invokevirtual   #46  <Method long Long.longValue()>
	//   20   42:putfield        #18  <Field long zzrj>
		}
	//   21   45:return          
	}

	protected final HashMap zzu()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #36  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #49  <Method void HashMap()>
	//    3    7:astore_1        
		hashmap.put(((Object) (Integer.valueOf(0))), ((Object) (Long.valueOf(zzri))));
	//    4    8:aload_1         
	//    5    9:iconst_0        
	//    6   10:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//    7   13:aload_0         
	//    8   14:getfield        #16  <Field long zzri>
	//    9   17:invokestatic    #52  <Method Long Long.valueOf(long)>
	//   10   20:invokevirtual   #56  <Method Object HashMap.put(Object, Object)>
	//   11   23:pop             
		hashmap.put(((Object) (Integer.valueOf(1))), ((Object) (Long.valueOf(zzrj))));
	//   12   24:aload_1         
	//   13   25:iconst_1        
	//   14   26:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   15   29:aload_0         
	//   16   30:getfield        #18  <Field long zzrj>
	//   17   33:invokestatic    #52  <Method Long Long.valueOf(long)>
	//   18   36:invokevirtual   #56  <Method Object HashMap.put(Object, Object)>
	//   19   39:pop             
		return hashmap;
	//   20   40:aload_1         
	//   21   41:areturn         
	}

	public long zzri;
	public long zzrj;
}
