// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzs, zzu

public class zzt
	implements android.os.Parcelable.Creator
{

	public zzt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzs zzs1, Parcel parcel, int i)
	{
		int j = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_3        
		zzc.zza(parcel, 2, ((android.os.Parcelable) (zzs1.zzbTW)), i, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field zzu zzs.zzbTW>
	//    7   11:iload_2         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #29  <Method void zzc.zza(Parcel, int, android.os.Parcelable, int, boolean)>
		zzc.zzc(parcel, 3, zzs1.type);
	//   10   16:aload_1         
	//   11   17:iconst_3        
	//   12   18:aload_0         
	//   13   19:getfield        #33  <Field int zzs.type>
	//   14   22:invokestatic    #37  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzc(parcel, 4, zzs1.zzbTU);
	//   15   25:aload_1         
	//   16   26:iconst_4        
	//   17   27:aload_0         
	//   18   28:getfield        #40  <Field int zzs.zzbTU>
	//   19   31:invokestatic    #37  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzc(parcel, 5, zzs1.zzbTV);
	//   20   34:aload_1         
	//   21   35:iconst_5        
	//   22   36:aload_0         
	//   23   37:getfield        #43  <Field int zzs.zzbTV>
	//   24   40:invokestatic    #37  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzJ(parcel, j);
	//   25   43:aload_1         
	//   26   44:iload_3         
	//   27   45:invokestatic    #47  <Method void zzc.zzJ(Parcel, int)>
	//   28   48:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzkS(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #53  <Method zzs zzkS(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzpt(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #59  <Method zzs[] zzpt(int)>
	//    3    5:areturn         
	}

	public zzs zzkS(Parcel parcel)
	{
		int l = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #64  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore          5
		zzu zzu1 = null;
	//    3    6:aconst_null     
	//    4    7:astore          7
		int k = 0;
	//    5    9:iconst_0        
	//    6   10:istore          4
		int j = 0;
	//    7   12:iconst_0        
	//    8   13:istore_3        
		int i = 0;
	//    9   14:iconst_0        
	//   10   15:istore_2        
		do
			if(parcel.dataPosition() < l)
	//*  11   16:aload_1         
	//*  12   17:invokevirtual   #70  <Method int Parcel.dataPosition()>
	//*  13   20:iload           5
	//*  14   22:icmpge          128
			{
				int i1 = zzb.zzaX(parcel);
	//   15   25:aload_1         
	//   16   26:invokestatic    #73  <Method int zzb.zzaX(Parcel)>
	//   17   29:istore          6
				switch(zzb.zzdc(i1))
	//*  18   31:iload           6
	//*  19   33:invokestatic    #77  <Method int zzb.zzdc(int)>
				{
	//*  20   36:tableswitch     2 5: default 68
	//	               2 71
	//	               3 88
	//	               4 99
	//	               5 109
	//*  21   68:goto            119
				case 2: // '\002'
					zzu1 = (zzu)zzb.zza(parcel, i1, zzu.CREATOR);
	//   22   71:aload_1         
	//   23   72:iload           6
	//   24   74:getstatic       #83  <Field android.os.Parcelable$Creator zzu.CREATOR>
	//   25   77:invokestatic    #86  <Method android.os.Parcelable zzb.zza(Parcel, int, android.os.Parcelable$Creator)>
	//   26   80:checkcast       #79  <Class zzu>
	//   27   83:astore          7
					break;

	//*  28   85:goto            125
				case 3: // '\003'
					k = zzb.zzg(parcel, i1);
	//   29   88:aload_1         
	//   30   89:iload           6
	//   31   91:invokestatic    #90  <Method int zzb.zzg(Parcel, int)>
	//   32   94:istore          4
					break;

	//*  33   96:goto            125
				case 4: // '\004'
					j = zzb.zzg(parcel, i1);
	//   34   99:aload_1         
	//   35  100:iload           6
	//   36  102:invokestatic    #90  <Method int zzb.zzg(Parcel, int)>
	//   37  105:istore_3        
					break;

	//*  38  106:goto            125
				case 5: // '\005'
					i = zzb.zzg(parcel, i1);
	//   39  109:aload_1         
	//   40  110:iload           6
	//   41  112:invokestatic    #90  <Method int zzb.zzg(Parcel, int)>
	//   42  115:istore_2        
					break;

	//*  43  116:goto            125
				default:
					zzb.zzb(parcel, i1);
	//   44  119:aload_1         
	//   45  120:iload           6
	//   46  122:invokestatic    #93  <Method void zzb.zzb(Parcel, int)>
					break;
				}
			} else
	//*  47  125:goto            16
			if(parcel.dataPosition() != l)
	//*  48  128:aload_1         
	//*  49  129:invokevirtual   #70  <Method int Parcel.dataPosition()>
	//*  50  132:iload           5
	//*  51  134:icmpeq          168
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(l).toString(), parcel);
	//   52  137:new             #95  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   53  140:dup             
	//   54  141:new             #97  <Class StringBuilder>
	//   55  144:dup             
	//   56  145:bipush          37
	//   57  147:invokespecial   #100 <Method void StringBuilder(int)>
	//   58  150:ldc1            #102 <String "Overread allowed size end=">
	//   59  152:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   60  155:iload           5
	//   61  157:invokevirtual   #109 <Method StringBuilder StringBuilder.append(int)>
	//   62  160:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   63  163:aload_1         
	//   64  164:invokespecial   #116 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   65  167:athrow          
			else
				return new zzs(zzu1, k, j, i);
	//   66  168:new             #22  <Class zzs>
	//   67  171:dup             
	//   68  172:aload           7
	//   69  174:iload           4
	//   70  176:iload_3         
	//   71  177:iload_2         
	//   72  178:invokespecial   #119 <Method void zzs(zzu, int, int, int)>
	//   73  181:areturn         
		while(true);
	}

	public zzs[] zzpt(int i)
	{
		return new zzs[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzs[]
	//    2    4:areturn         
	}
}
