// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.internal:
//			zzarz

public class zzasa
	implements android.os.Parcelable.Creator
{

	public zzasa()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzarz zzarz1, Parcel parcel, int i)
	{
		int j = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_3        
		zzc.zza(parcel, 1, ((android.os.Parcelable) (zzarz1.getStatus())), i, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #26  <Method Status zzarz.getStatus()>
	//    7   11:iload_2         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #29  <Method void zzc.zza(Parcel, int, android.os.Parcelable, int, boolean)>
		zzc.zzJ(parcel, j);
	//   10   16:aload_1         
	//   11   17:iload_3         
	//   12   18:invokestatic    #33  <Method void zzc.zzJ(Parcel, int)>
	//   13   21:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzgU(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #39  <Method zzarz zzgU(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzkw(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #45  <Method zzarz[] zzkw(int)>
	//    3    5:areturn         
	}

	public zzarz zzgU(Parcel parcel)
	{
		int i = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #50  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore_2        
		Status status = null;
	//    3    5:aconst_null     
	//    4    6:astore          4
		do
			if(parcel.dataPosition() < i)
	//*   5    8:aload_1         
	//*   6    9:invokevirtual   #56  <Method int Parcel.dataPosition()>
	//*   7   12:iload_2         
	//*   8   13:icmpge          71
			{
				int j = zzb.zzaX(parcel);
	//    9   16:aload_1         
	//   10   17:invokestatic    #59  <Method int zzb.zzaX(Parcel)>
	//   11   20:istore_3        
				switch(zzb.zzdc(j))
	//*  12   21:iload_3         
	//*  13   22:invokestatic    #63  <Method int zzb.zzdc(int)>
				{
	//*  14   25:lookupswitch    1: default 44
	//	               1: 47
	//*  15   44:goto            63
				case 1: // '\001'
					status = (Status)zzb.zza(parcel, j, Status.CREATOR);
	//   16   47:aload_1         
	//   17   48:iload_3         
	//   18   49:getstatic       #69  <Field android.os.Parcelable$Creator Status.CREATOR>
	//   19   52:invokestatic    #72  <Method android.os.Parcelable zzb.zza(Parcel, int, android.os.Parcelable$Creator)>
	//   20   55:checkcast       #65  <Class Status>
	//   21   58:astore          4
					break;

	//*  22   60:goto            68
				default:
					zzb.zzb(parcel, j);
	//   23   63:aload_1         
	//   24   64:iload_3         
	//   25   65:invokestatic    #75  <Method void zzb.zzb(Parcel, int)>
					break;
				}
			} else
	//*  26   68:goto            8
			if(parcel.dataPosition() != i)
	//*  27   71:aload_1         
	//*  28   72:invokevirtual   #56  <Method int Parcel.dataPosition()>
	//*  29   75:iload_2         
	//*  30   76:icmpeq          109
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(i).toString(), parcel);
	//   31   79:new             #77  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   32   82:dup             
	//   33   83:new             #79  <Class StringBuilder>
	//   34   86:dup             
	//   35   87:bipush          37
	//   36   89:invokespecial   #82  <Method void StringBuilder(int)>
	//   37   92:ldc1            #84  <String "Overread allowed size end=">
	//   38   94:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   39   97:iload_2         
	//   40   98:invokevirtual   #91  <Method StringBuilder StringBuilder.append(int)>
	//   41  101:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   42  104:aload_1         
	//   43  105:invokespecial   #98  <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   44  108:athrow          
			else
				return new zzarz(status);
	//   45  109:new             #22  <Class zzarz>
	//   46  112:dup             
	//   47  113:aload           4
	//   48  115:invokespecial   #101 <Method void zzarz(Status)>
	//   49  118:areturn         
		while(true);
	}

	public zzarz[] zzkw(int i)
	{
		return new zzarz[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzarz[]
	//    2    4:areturn         
	}
}
