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
//			zzayb

public class zzayc
	implements android.os.Parcelable.Creator
{

	public zzayc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzayb zzayb1, Parcel parcel, int i)
	{
		int j = zzc.zzaV(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaV(Parcel)>
	//    2    4:istore_3        
		zzc.zzc(parcel, 1, zzayb1.mVersionCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int zzayb.mVersionCode>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 2, ((android.os.Parcelable) (zzayb1.zzxA())), i, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #34  <Method ConnectionResult zzayb.zzxA()>
	//   12   20:iload_2         
	//   13   21:iconst_0        
	//   14   22:invokestatic    #37  <Method void zzc.zza(Parcel, int, android.os.Parcelable, int, boolean)>
		zzc.zza(parcel, 3, ((android.os.Parcelable) (zzayb1.zzOp())), i, false);
	//   15   25:aload_1         
	//   16   26:iconst_3        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #41  <Method zzaf zzayb.zzOp()>
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
		return ((Object) (zziS(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #51  <Method zzayb zziS(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzmN(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #57  <Method zzayb[] zzmN(int)>
	//    3    5:areturn         
	}

	public zzayb zziS(Parcel parcel)
	{
		zzaf zzaf1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		int j = zzb.zzaU(parcel);
	//    2    3:aload_1         
	//    3    4:invokestatic    #62  <Method int zzb.zzaU(Parcel)>
	//    4    7:istore_3        
		int i = 0;
	//    5    8:iconst_0        
	//    6    9:istore_2        
		ConnectionResult connectionresult = null;
	//    7   10:aconst_null     
	//    8   11:astore          6
		do
			if(parcel.dataPosition() < j)
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #68  <Method int Parcel.dataPosition()>
	//*  11   17:iload_3         
	//*  12   18:icmpge          113
			{
				int k = zzb.zzaT(parcel);
	//   13   21:aload_1         
	//   14   22:invokestatic    #71  <Method int zzb.zzaT(Parcel)>
	//   15   25:istore          4
				switch(zzb.zzcW(k))
	//*  16   27:iload           4
	//*  17   29:invokestatic    #75  <Method int zzb.zzcW(int)>
				{
	//*  18   32:tableswitch     1 3: default 60
	//	               1 69
	//	               2 79
	//	               3 96
				default:
					zzb.zzb(parcel, k);
	//   19   60:aload_1         
	//   20   61:iload           4
	//   21   63:invokestatic    #78  <Method void zzb.zzb(Parcel, int)>
					break;

	//*  22   66:goto            13
				case 1: // '\001'
					i = zzb.zzg(parcel, k);
	//   23   69:aload_1         
	//   24   70:iload           4
	//   25   72:invokestatic    #82  <Method int zzb.zzg(Parcel, int)>
	//   26   75:istore_2        
					break;

	//*  27   76:goto            66
				case 2: // '\002'
					connectionresult = (ConnectionResult)zzb.zza(parcel, k, ConnectionResult.CREATOR);
	//   28   79:aload_1         
	//   29   80:iload           4
	//   30   82:getstatic       #88  <Field android.os.Parcelable$Creator ConnectionResult.CREATOR>
	//   31   85:invokestatic    #91  <Method android.os.Parcelable zzb.zza(Parcel, int, android.os.Parcelable$Creator)>
	//   32   88:checkcast       #84  <Class ConnectionResult>
	//   33   91:astore          6
					break;

	//*  34   93:goto            66
				case 3: // '\003'
					zzaf1 = (zzaf)zzb.zza(parcel, k, zzaf.CREATOR);
	//   35   96:aload_1         
	//   36   97:iload           4
	//   37   99:getstatic       #94  <Field android.os.Parcelable$Creator zzaf.CREATOR>
	//   38  102:invokestatic    #91  <Method android.os.Parcelable zzb.zza(Parcel, int, android.os.Parcelable$Creator)>
	//   39  105:checkcast       #93  <Class zzaf>
	//   40  108:astore          5
					break;
				}
			} else
	//*  41  110:goto            66
			if(parcel.dataPosition() != j)
	//*  42  113:aload_1         
	//*  43  114:invokevirtual   #68  <Method int Parcel.dataPosition()>
	//*  44  117:iload_3         
	//*  45  118:icmpeq          151
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
	//   46  121:new             #96  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   47  124:dup             
	//   48  125:new             #98  <Class StringBuilder>
	//   49  128:dup             
	//   50  129:bipush          37
	//   51  131:invokespecial   #101 <Method void StringBuilder(int)>
	//   52  134:ldc1            #103 <String "Overread allowed size end=">
	//   53  136:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   54  139:iload_3         
	//   55  140:invokevirtual   #110 <Method StringBuilder StringBuilder.append(int)>
	//   56  143:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   57  146:aload_1         
	//   58  147:invokespecial   #117 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   59  150:athrow          
			else
				return new zzayb(i, connectionresult, zzaf1);
	//   60  151:new             #22  <Class zzayb>
	//   61  154:dup             
	//   62  155:iload_2         
	//   63  156:aload           6
	//   64  158:aload           5
	//   65  160:invokespecial   #120 <Method void zzayb(int, ConnectionResult, zzaf)>
	//   66  163:areturn         
		while(true);
	}

	public zzayb[] zzmN(int i)
	{
		return new zzayb[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzayb[]
	//    2    4:areturn         
	}
}
