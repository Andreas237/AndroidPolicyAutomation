// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzaf;

// Referenced classes of package com.google.android.gms.internal:
//			zzbaw

public class zzbax
	implements android.os.Parcelable.Creator
{

	public zzbax()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzbaw zzbaw1, Parcel parcel, int i)
	{
		int j = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_3        
		zzc.zzc(parcel, 1, zzbaw1.zzaiI);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int zzbaw.zzaiI>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 2, ((android.os.Parcelable) (zzbaw1.zzyh())), i, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #34  <Method ConnectionResult zzbaw.zzyh()>
	//   12   20:iload_2         
	//   13   21:iconst_0        
	//   14   22:invokestatic    #37  <Method void zzc.zza(Parcel, int, android.os.Parcelable, int, boolean)>
		zzc.zza(parcel, 3, ((android.os.Parcelable) (zzbaw1.zzPU())), i, false);
	//   15   25:aload_1         
	//   16   26:iconst_3        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #41  <Method zzaf zzbaw.zzPU()>
	//   19   31:iload_2         
	//   20   32:iconst_0        
	//   21   33:invokestatic    #37  <Method void zzc.zza(Parcel, int, android.os.Parcelable, int, boolean)>
		zzc.zzJ(parcel, j);
	//   22   36:aload_1         
	//   23   37:iload_3         
	//   24   38:invokestatic    #45  <Method void zzc.zzJ(Parcel, int)>
	//   25   41:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzjy(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #51  <Method zzbaw zzjy(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzny(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #57  <Method zzbaw[] zzny(int)>
	//    3    5:areturn         
	}

	public zzbaw zzjy(Parcel parcel)
	{
		int j = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #62  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		ConnectionResult connectionresult = null;
	//    5    7:aconst_null     
	//    6    8:astore          6
		zzaf zzaf1 = null;
	//    7   10:aconst_null     
	//    8   11:astore          5
		do
			if(parcel.dataPosition() < j)
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #68  <Method int Parcel.dataPosition()>
	//*  11   17:iload_3         
	//*  12   18:icmpge          116
			{
				int k = zzb.zzaX(parcel);
	//   13   21:aload_1         
	//   14   22:invokestatic    #71  <Method int zzb.zzaX(Parcel)>
	//   15   25:istore          4
				switch(zzb.zzdc(k))
	//*  16   27:iload           4
	//*  17   29:invokestatic    #75  <Method int zzb.zzdc(int)>
				{
	//*  18   32:tableswitch     1 3: default 60
	//	               1 63
	//	               2 73
	//	               3 90
	//*  19   60:goto            107
				case 1: // '\001'
					i = zzb.zzg(parcel, k);
	//   20   63:aload_1         
	//   21   64:iload           4
	//   22   66:invokestatic    #79  <Method int zzb.zzg(Parcel, int)>
	//   23   69:istore_2        
					break;

	//*  24   70:goto            113
				case 2: // '\002'
					connectionresult = (ConnectionResult)zzb.zza(parcel, k, ConnectionResult.CREATOR);
	//   25   73:aload_1         
	//   26   74:iload           4
	//   27   76:getstatic       #85  <Field android.os.Parcelable$Creator ConnectionResult.CREATOR>
	//   28   79:invokestatic    #88  <Method android.os.Parcelable zzb.zza(Parcel, int, android.os.Parcelable$Creator)>
	//   29   82:checkcast       #81  <Class ConnectionResult>
	//   30   85:astore          6
					break;

	//*  31   87:goto            113
				case 3: // '\003'
					zzaf1 = (zzaf)zzb.zza(parcel, k, zzaf.CREATOR);
	//   32   90:aload_1         
	//   33   91:iload           4
	//   34   93:getstatic       #91  <Field android.os.Parcelable$Creator zzaf.CREATOR>
	//   35   96:invokestatic    #88  <Method android.os.Parcelable zzb.zza(Parcel, int, android.os.Parcelable$Creator)>
	//   36   99:checkcast       #90  <Class zzaf>
	//   37  102:astore          5
					break;

	//*  38  104:goto            113
				default:
					zzb.zzb(parcel, k);
	//   39  107:aload_1         
	//   40  108:iload           4
	//   41  110:invokestatic    #94  <Method void zzb.zzb(Parcel, int)>
					break;
				}
			} else
	//*  42  113:goto            13
			if(parcel.dataPosition() != j)
	//*  43  116:aload_1         
	//*  44  117:invokevirtual   #68  <Method int Parcel.dataPosition()>
	//*  45  120:iload_3         
	//*  46  121:icmpeq          154
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
	//   47  124:new             #96  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   48  127:dup             
	//   49  128:new             #98  <Class StringBuilder>
	//   50  131:dup             
	//   51  132:bipush          37
	//   52  134:invokespecial   #101 <Method void StringBuilder(int)>
	//   53  137:ldc1            #103 <String "Overread allowed size end=">
	//   54  139:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   55  142:iload_3         
	//   56  143:invokevirtual   #110 <Method StringBuilder StringBuilder.append(int)>
	//   57  146:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   58  149:aload_1         
	//   59  150:invokespecial   #117 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   60  153:athrow          
			else
				return new zzbaw(i, connectionresult, zzaf1);
	//   61  154:new             #22  <Class zzbaw>
	//   62  157:dup             
	//   63  158:iload_2         
	//   64  159:aload           6
	//   65  161:aload           5
	//   66  163:invokespecial   #120 <Method void zzbaw(int, ConnectionResult, zzaf)>
	//   67  166:areturn         
		while(true);
	}

	public zzbaw[] zzny(int i)
	{
		return new zzbaw[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzbaw[]
	//    2    4:areturn         
	}
}
