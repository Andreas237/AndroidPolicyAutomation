// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;

// Referenced classes of package com.google.android.gms.internal:
//			zzk, zzi, zzx, zzm

public class zzab extends zzk
{

	public zzab(int i, String s, zzm.zzb zzb, zzm.zza zza1)
	{
		super(i, s, zza1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload           4
	//    4    5:invokespecial   #13  <Method void zzk(int, String, zzm$zza)>
		zzaF = zzb;
	//    5    8:aload_0         
	//    6    9:aload_3         
	//    7   10:putfield        #15  <Field zzm$zzb zzaF>
	//    8   13:return          
	}

	protected zzm zza(zzi zzi1)
	{
		String s;
		try
		{
			s = new String(zzi1.data, zzx.zza(zzi1.zzy));
	//    0    0:new             #24  <Class String>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:getfield        #30  <Field byte[] zzi.data>
	//    4    8:aload_1         
	//    5    9:getfield        #34  <Field java.util.Map zzi.zzy>
	//    6   12:invokestatic    #39  <Method String zzx.zza(java.util.Map)>
	//    7   15:invokespecial   #42  <Method void String(byte[], String)>
	//    8   18:astore_2        
		}
	//*   9   19:aload_2         
	//*  10   20:aload_1         
	//*  11   21:invokestatic    #46  <Method zzb$zza zzx.zzb(zzi)>
	//*  12   24:invokestatic    #51  <Method zzm zzm.zza(Object, zzb$zza)>
	//*  13   27:areturn         
		catch(UnsupportedEncodingException unsupportedencodingexception)
	//*  14   28:astore_2        
		{
			unsupportedencodingexception = ((UnsupportedEncodingException) (new String(zzi1.data)));
	//   15   29:new             #24  <Class String>
	//   16   32:dup             
	//   17   33:aload_1         
	//   18   34:getfield        #30  <Field byte[] zzi.data>
	//   19   37:invokespecial   #54  <Method void String(byte[])>
	//   20   40:astore_2        
		}
		return zzm.zza(((Object) (s)), zzx.zzb(zzi1));
	//*  21   41:goto            19
	}

	protected void zza(Object obj)
	{
		zzi((String)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #24  <Class String>
	//    3    5:invokevirtual   #60  <Method void zzi(String)>
	//    4    8:return          
	}

	protected void zzi(String s)
	{
		zzaF.zzb(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzm$zzb zzaF>
	//    2    4:aload_1         
	//    3    5:invokeinterface #64  <Method void zzm$zzb.zzb(Object)>
	//    4   10:return          
	}

	private final zzm.zzb zzaF;
}
