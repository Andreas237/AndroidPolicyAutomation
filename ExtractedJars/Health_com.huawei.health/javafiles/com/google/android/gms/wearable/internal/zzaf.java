// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzae

public class zzaf
	implements android.os.Parcelable.Creator
{

	public zzaf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzae zzae1, Parcel parcel, int i)
	{
		i = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_2        
		zzc.zzc(parcel, 2, zzae1.statusCode);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int zzae.statusCode>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzJ(parcel, i);
	//    8   14:aload_1         
	//    9   15:iload_2         
	//   10   16:invokestatic    #34  <Method void zzc.zzJ(Parcel, int)>
	//   11   19:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzkW(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #40  <Method zzae zzkW(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzpy(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #46  <Method zzae[] zzpy(int)>
	//    3    5:areturn         
	}

	public zzae zzkW(Parcel parcel)
	{
		int j = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #51  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		do
			if(parcel.dataPosition() < j)
	//*   5    7:aload_1         
	//*   6    8:invokevirtual   #57  <Method int Parcel.dataPosition()>
	//*   7   11:iload_3         
	//*   8   12:icmpge          66
			{
				int k = zzb.zzaX(parcel);
	//    9   15:aload_1         
	//   10   16:invokestatic    #60  <Method int zzb.zzaX(Parcel)>
	//   11   19:istore          4
				switch(zzb.zzdc(k))
	//*  12   21:iload           4
	//*  13   23:invokestatic    #64  <Method int zzb.zzdc(int)>
				{
	//*  14   26:lookupswitch    1: default 44
	//	               2: 47
	//*  15   44:goto            57
				case 2: // '\002'
					i = zzb.zzg(parcel, k);
	//   16   47:aload_1         
	//   17   48:iload           4
	//   18   50:invokestatic    #68  <Method int zzb.zzg(Parcel, int)>
	//   19   53:istore_2        
					break;

	//*  20   54:goto            63
				default:
					zzb.zzb(parcel, k);
	//   21   57:aload_1         
	//   22   58:iload           4
	//   23   60:invokestatic    #71  <Method void zzb.zzb(Parcel, int)>
					break;
				}
			} else
	//*  24   63:goto            7
			if(parcel.dataPosition() != j)
	//*  25   66:aload_1         
	//*  26   67:invokevirtual   #57  <Method int Parcel.dataPosition()>
	//*  27   70:iload_3         
	//*  28   71:icmpeq          104
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
	//   29   74:new             #73  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   30   77:dup             
	//   31   78:new             #75  <Class StringBuilder>
	//   32   81:dup             
	//   33   82:bipush          37
	//   34   84:invokespecial   #78  <Method void StringBuilder(int)>
	//   35   87:ldc1            #80  <String "Overread allowed size end=">
	//   36   89:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   37   92:iload_3         
	//   38   93:invokevirtual   #87  <Method StringBuilder StringBuilder.append(int)>
	//   39   96:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   40   99:aload_1         
	//   41  100:invokespecial   #94  <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   42  103:athrow          
			else
				return new zzae(i);
	//   43  104:new             #22  <Class zzae>
	//   44  107:dup             
	//   45  108:iload_2         
	//   46  109:invokespecial   #95  <Method void zzae(int)>
	//   47  112:areturn         
		while(true);
	}

	public zzae[] zzpy(int i)
	{
		return new zzae[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzae[]
	//    2    4:areturn         
	}
}
