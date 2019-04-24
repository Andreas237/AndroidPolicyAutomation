// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.fitness.data.DataSource;

// Referenced classes of package com.google.android.gms.internal:
//			zzapx

public class zzapy
	implements android.os.Parcelable.Creator
{

	public zzapy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzapx zzapx1, Parcel parcel, int i)
	{
		int j = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_3        
		zzc.zza(parcel, 1, ((android.os.Parcelable) (zzapx1.getDataSource())), i, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #26  <Method DataSource zzapx.getDataSource()>
	//    7   11:iload_2         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #29  <Method void zzc.zza(Parcel, int, android.os.Parcelable, int, boolean)>
		zzc.zzc(parcel, 1000, zzapx1.getVersionCode());
	//   10   16:aload_1         
	//   11   17:sipush          1000
	//   12   20:aload_0         
	//   13   21:invokevirtual   #33  <Method int zzapx.getVersionCode()>
	//   14   24:invokestatic    #37  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzJ(parcel, j);
	//   15   27:aload_1         
	//   16   28:iload_3         
	//   17   29:invokestatic    #41  <Method void zzc.zzJ(Parcel, int)>
	//   18   32:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzer(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #47  <Method zzapx zzer(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzhe(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #53  <Method zzapx[] zzhe(int)>
	//    3    5:areturn         
	}

	public zzapx zzer(Parcel parcel)
	{
		int j = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #58  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		DataSource datasource = null;
	//    5    7:aconst_null     
	//    6    8:astore          5
		do
			if(parcel.dataPosition() < j)
	//*   7   10:aload_1         
	//*   8   11:invokevirtual   #63  <Method int Parcel.dataPosition()>
	//*   9   14:iload_3         
	//*  10   15:icmpge          95
			{
				int k = zzb.zzaX(parcel);
	//   11   18:aload_1         
	//   12   19:invokestatic    #66  <Method int zzb.zzaX(Parcel)>
	//   13   22:istore          4
				switch(zzb.zzdc(k))
	//*  14   24:iload           4
	//*  15   26:invokestatic    #70  <Method int zzb.zzdc(int)>
				{
	//*  16   29:lookupswitch    2: default 56
	//	               1: 59
	//	               1000: 76
	//*  17   56:goto            86
				case 1: // '\001'
					datasource = (DataSource)zzb.zza(parcel, k, DataSource.CREATOR);
	//   18   59:aload_1         
	//   19   60:iload           4
	//   20   62:getstatic       #76  <Field android.os.Parcelable$Creator DataSource.CREATOR>
	//   21   65:invokestatic    #79  <Method android.os.Parcelable zzb.zza(Parcel, int, android.os.Parcelable$Creator)>
	//   22   68:checkcast       #72  <Class DataSource>
	//   23   71:astore          5
					break;

	//*  24   73:goto            92
				case 1000: 
					i = zzb.zzg(parcel, k);
	//   25   76:aload_1         
	//   26   77:iload           4
	//   27   79:invokestatic    #83  <Method int zzb.zzg(Parcel, int)>
	//   28   82:istore_2        
					break;

	//*  29   83:goto            92
				default:
					zzb.zzb(parcel, k);
	//   30   86:aload_1         
	//   31   87:iload           4
	//   32   89:invokestatic    #86  <Method void zzb.zzb(Parcel, int)>
					break;
				}
			} else
	//*  33   92:goto            10
			if(parcel.dataPosition() != j)
	//*  34   95:aload_1         
	//*  35   96:invokevirtual   #63  <Method int Parcel.dataPosition()>
	//*  36   99:iload_3         
	//*  37  100:icmpeq          133
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
	//   38  103:new             #88  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   39  106:dup             
	//   40  107:new             #90  <Class StringBuilder>
	//   41  110:dup             
	//   42  111:bipush          37
	//   43  113:invokespecial   #93  <Method void StringBuilder(int)>
	//   44  116:ldc1            #95  <String "Overread allowed size end=">
	//   45  118:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   46  121:iload_3         
	//   47  122:invokevirtual   #102 <Method StringBuilder StringBuilder.append(int)>
	//   48  125:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   49  128:aload_1         
	//   50  129:invokespecial   #109 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   51  132:athrow          
			else
				return new zzapx(i, datasource);
	//   52  133:new             #22  <Class zzapx>
	//   53  136:dup             
	//   54  137:iload_2         
	//   55  138:aload           5
	//   56  140:invokespecial   #112 <Method void zzapx(int, DataSource)>
	//   57  143:areturn         
		while(true);
	}

	public zzapx[] zzhe(int i)
	{
		return new zzapx[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzapx[]
	//    2    4:areturn         
	}
}
