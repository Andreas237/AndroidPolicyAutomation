// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;


// Referenced classes of package com.google.android.gms.internal.vision:
//			zzfi, zzfy, zzjd, zzji, 
//			zzgc, zzhf

public static final class zzfy$zzf extends zzfi
{

	final Object zzg(Object obj)
	{
		if(zzww.zzwr.zzho() == zzji.zzacw)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field zzfy$zze zzww>
	//*   2    4:getfield        #28  <Field zzjd zzfy$zze.zzwr>
	//*   3    7:invokevirtual   #59  <Method zzji zzjd.zzho()>
	//*   4   10:getstatic       #65  <Field zzji zzji.zzacw>
	//*   5   13:if_acmpne       36
			return ((Object) (zzww.zzwq.zzf(((Integer)obj).intValue())));
	//    6   16:aload_0         
	//    7   17:getfield        #48  <Field zzfy$zze zzww>
	//    8   20:getfield        #69  <Field zzgc zzfy$zze.zzwq>
	//    9   23:aload_1         
	//   10   24:checkcast       #71  <Class Integer>
	//   11   27:invokevirtual   #75  <Method int Integer.intValue()>
	//   12   30:invokeinterface #80  <Method zzgb zzgc.zzf(int)>
	//   13   35:areturn         
		else
			return obj;
	//   14   36:aload_1         
	//   15   37:areturn         
	}

	final Object zzgq;
	final zzhf zzwu;
	final zzhf zzwv;
	final zzfy$zze zzww;

	zzfy$zzf(zzhf zzhf, Object obj, zzhf zzhf1, zzfy$zze zzfy$zze1, Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void zzfi()>
		if(zzhf != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          58
		{
			if(zzfy$zze1.zzwr == zzjd.zzace && zzhf1 == null)
	//*   4    8:aload           4
	//*   5   10:getfield        #28  <Field zzjd zzfy$zze.zzwr>
	//*   6   13:getstatic       #33  <Field zzjd zzjd.zzace>
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
				zzwu = zzhf;
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:putfield        #42  <Field zzhf zzwu>
				zzgq = obj;
	//   19   41:aload_0         
	//   20   42:aload_2         
	//   21   43:putfield        #44  <Field Object zzgq>
				zzwv = zzhf1;
	//   22   46:aload_0         
	//   23   47:aload_3         
	//   24   48:putfield        #46  <Field zzhf zzwv>
				zzww = zzfy$zze1;
	//   25   51:aload_0         
	//   26   52:aload           4
	//   27   54:putfield        #48  <Field zzfy$zze zzww>
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
