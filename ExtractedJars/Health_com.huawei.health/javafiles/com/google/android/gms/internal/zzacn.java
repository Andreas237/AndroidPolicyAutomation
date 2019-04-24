// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.internal:
//			zzaco, zzacp

public class zzacn extends zza
{

	zzacn(int i, zzacp zzacp1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #25  <Field int zzaiI>
		zzaGR = zzacp1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field zzacp zzaGR>
	//    8   14:return          
	}

	private zzacn(zzacp zzacp1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void zza()>
		zzaiI = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #25  <Field int zzaiI>
		zzaGR = zzacp1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #27  <Field zzacp zzaGR>
	//    8   14:return          
	}

	public static zzacn zza(zzacs.zzb zzb)
	{
		if(zzb instanceof zzacp)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #32  <Class zzacp>
	//*   2    4:ifeq            19
			return new zzacn((zzacp)zzb);
	//    3    7:new             #2   <Class zzacn>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:checkcast       #32  <Class zzacp>
	//    7   15:invokespecial   #34  <Method void zzacn(zzacp)>
	//    8   18:areturn         
		else
			throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
	//    9   19:new             #36  <Class IllegalArgumentException>
	//   10   22:dup             
	//   11   23:ldc1            #38  <String "Unsupported safe parcelable field converter class.">
	//   12   25:invokespecial   #41  <Method void IllegalArgumentException(String)>
	//   13   28:athrow          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.internal.zzaco.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #48  <Method void com.google.android.gms.internal.zzaco.zza(zzacn, Parcel, int)>
	//    4    6:return          
	}

	zzacp zzyo()
	{
		return zzaGR;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field zzacp zzaGR>
	//    2    4:areturn         
	}

	public zzacs.zzb zzyp()
	{
		if(zzaGR != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field zzacp zzaGR>
	//*   2    4:ifnull          12
			return ((zzacs.zzb) (zzaGR));
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field zzacp zzaGR>
	//    5   11:areturn         
		else
			throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
	//    6   12:new             #54  <Class IllegalStateException>
	//    7   15:dup             
	//    8   16:ldc1            #56  <String "There was no converter wrapped in this ConverterWrapper.">
	//    9   18:invokespecial   #57  <Method void IllegalStateException(String)>
	//   10   21:athrow          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzaco();
	private final zzacp zzaGR;
	final int zzaiI;

	static 
	{
	//    0    0:new             #15  <Class zzaco>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void zzaco()>
	//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
