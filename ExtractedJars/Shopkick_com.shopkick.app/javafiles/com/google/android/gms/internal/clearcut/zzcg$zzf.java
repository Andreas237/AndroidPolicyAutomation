// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzbr, zzcg, zzfl, zzdo

public static final class zzcg$zzf extends zzbr
{

	private final Object zzdu;
	private final zzdo zzka;
	private final zzdo zzkb;
	private final zzcg$zze zzkc;

	zzcg$zzf(zzdo zzdo, Object obj, zzdo zzdo1, zzcg$zze zzcg$zze1, Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void zzbr()>
		if(zzdo != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          58
		{
			if(zzcg$zze1.zzjx == zzfl.zzqm && zzdo1 == null)
	//*   4    8:aload           4
	//*   5   10:getfield        #28  <Field zzfl zzcg$zze.zzjx>
	//*   6   13:getstatic       #33  <Field zzfl zzfl.zzqm>
	//*   7   16:if_acmpne       36
	//*   8   19:aload_3         
	//*   9   20:ifnull          26
	//*  10   23:goto            36
			{
				throw new IllegalArgumentException("Null messageDefaultInstance");
	//   11   26:new             #35  <Class IllegalArgumentException>
	//   12   29:dup             
	//   13   30:ldc1            #37  <String "Null messageDefaultInstance">
	//   14   32:invokespecial   #40  <Method void IllegalArgumentException(String)>
	//   15   35:athrow          
			} else
			{
				zzka = zzdo;
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:putfield        #42  <Field zzdo zzka>
				zzdu = obj;
	//   19   41:aload_0         
	//   20   42:aload_2         
	//   21   43:putfield        #44  <Field Object zzdu>
				zzkb = zzdo1;
	//   22   46:aload_0         
	//   23   47:aload_3         
	//   24   48:putfield        #46  <Field zzdo zzkb>
				zzkc = zzcg$zze1;
	//   25   51:aload_0         
	//   26   52:aload           4
	//   27   54:putfield        #48  <Field zzcg$zze zzkc>
				return;
	//   28   57:return          
			}
		} else
		{
			throw new IllegalArgumentException("Null containingTypeDefaultInstance");
	//   29   58:new             #35  <Class IllegalArgumentException>
	//   30   61:dup             
	//   31   62:ldc1            #50  <String "Null containingTypeDefaultInstance">
	//   32   64:invokespecial   #40  <Method void IllegalArgumentException(String)>
	//   33   67:athrow          
		}
	}
}
