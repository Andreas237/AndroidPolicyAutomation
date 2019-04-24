// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.internal:
//			zzbar

public class zzbas
	implements android.os.Parcelable.Creator
{

	public zzbas()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzbar zzbar1, Parcel parcel, int i)
	{
		int j = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_3        
		zzc.zzc(parcel, 1, zzbar1.zzaiI);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int zzbar.zzaiI>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 2, ((android.os.Parcelable) (zzbar1.getAccount())), i, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #34  <Method Account zzbar.getAccount()>
	//   12   20:iload_2         
	//   13   21:iconst_0        
	//   14   22:invokestatic    #37  <Method void zzc.zza(Parcel, int, android.os.Parcelable, int, boolean)>
		zzc.zza(parcel, 3, ((android.os.Parcelable []) (zzbar1.zzPR())), i, false);
	//   15   25:aload_1         
	//   16   26:iconst_3        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #41  <Method Scope[] zzbar.zzPR()>
	//   19   31:iload_2         
	//   20   32:iconst_0        
	//   21   33:invokestatic    #44  <Method void zzc.zza(Parcel, int, android.os.Parcelable[], int, boolean)>
		zzc.zza(parcel, 4, zzbar1.getServerClientId(), false);
	//   22   36:aload_1         
	//   23   37:iconst_4        
	//   24   38:aload_0         
	//   25   39:invokevirtual   #48  <Method String zzbar.getServerClientId()>
	//   26   42:iconst_0        
	//   27   43:invokestatic    #51  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zzJ(parcel, j);
	//   28   46:aload_1         
	//   29   47:iload_3         
	//   30   48:invokestatic    #55  <Method void zzc.zzJ(Parcel, int)>
	//   31   51:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzjw(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #61  <Method zzbar zzjw(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zznw(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #67  <Method zzbar[] zznw(int)>
	//    3    5:areturn         
	}

	public zzbar zzjw(Parcel parcel)
	{
		int j = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #72  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		Account account = null;
	//    5    7:aconst_null     
	//    6    8:astore          7
		Scope ascope[] = null;
	//    7   10:aconst_null     
	//    8   11:astore          6
		String s = null;
	//    9   13:aconst_null     
	//   10   14:astore          5
		do
			if(parcel.dataPosition() < j)
	//*  11   16:aload_1         
	//*  12   17:invokevirtual   #78  <Method int Parcel.dataPosition()>
	//*  13   20:iload_3         
	//*  14   21:icmpge          131
			{
				int k = zzb.zzaX(parcel);
	//   15   24:aload_1         
	//   16   25:invokestatic    #81  <Method int zzb.zzaX(Parcel)>
	//   17   28:istore          4
				switch(zzb.zzdc(k))
	//*  18   30:iload           4
	//*  19   32:invokestatic    #85  <Method int zzb.zzdc(int)>
				{
	//*  20   35:tableswitch     1 4: default 64
	//	               1 67
	//	               2 77
	//	               3 94
	//	               4 111
	//*  21   64:goto            122
				case 1: // '\001'
					i = zzb.zzg(parcel, k);
	//   22   67:aload_1         
	//   23   68:iload           4
	//   24   70:invokestatic    #89  <Method int zzb.zzg(Parcel, int)>
	//   25   73:istore_2        
					break;

	//*  26   74:goto            128
				case 2: // '\002'
					account = (Account)zzb.zza(parcel, k, Account.CREATOR);
	//   27   77:aload_1         
	//   28   78:iload           4
	//   29   80:getstatic       #95  <Field android.os.Parcelable$Creator Account.CREATOR>
	//   30   83:invokestatic    #98  <Method android.os.Parcelable zzb.zza(Parcel, int, android.os.Parcelable$Creator)>
	//   31   86:checkcast       #91  <Class Account>
	//   32   89:astore          7
					break;

	//*  33   91:goto            128
				case 3: // '\003'
					ascope = (Scope[])zzb.zzb(parcel, k, Scope.CREATOR);
	//   34   94:aload_1         
	//   35   95:iload           4
	//   36   97:getstatic       #101 <Field android.os.Parcelable$Creator Scope.CREATOR>
	//   37  100:invokestatic    #105 <Method Object[] zzb.zzb(Parcel, int, android.os.Parcelable$Creator)>
	//   38  103:checkcast       #107 <Class Scope[]>
	//   39  106:astore          6
					break;

	//*  40  108:goto            128
				case 4: // '\004'
					s = zzb.zzq(parcel, k);
	//   41  111:aload_1         
	//   42  112:iload           4
	//   43  114:invokestatic    #111 <Method String zzb.zzq(Parcel, int)>
	//   44  117:astore          5
					break;

	//*  45  119:goto            128
				default:
					zzb.zzb(parcel, k);
	//   46  122:aload_1         
	//   47  123:iload           4
	//   48  125:invokestatic    #113 <Method void zzb.zzb(Parcel, int)>
					break;
				}
			} else
	//*  49  128:goto            16
			if(parcel.dataPosition() != j)
	//*  50  131:aload_1         
	//*  51  132:invokevirtual   #78  <Method int Parcel.dataPosition()>
	//*  52  135:iload_3         
	//*  53  136:icmpeq          169
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
	//   54  139:new             #115 <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   55  142:dup             
	//   56  143:new             #117 <Class StringBuilder>
	//   57  146:dup             
	//   58  147:bipush          37
	//   59  149:invokespecial   #120 <Method void StringBuilder(int)>
	//   60  152:ldc1            #122 <String "Overread allowed size end=">
	//   61  154:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   62  157:iload_3         
	//   63  158:invokevirtual   #129 <Method StringBuilder StringBuilder.append(int)>
	//   64  161:invokevirtual   #132 <Method String StringBuilder.toString()>
	//   65  164:aload_1         
	//   66  165:invokespecial   #135 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   67  168:athrow          
			else
				return new zzbar(i, account, ascope, s);
	//   68  169:new             #22  <Class zzbar>
	//   69  172:dup             
	//   70  173:iload_2         
	//   71  174:aload           7
	//   72  176:aload           6
	//   73  178:aload           5
	//   74  180:invokespecial   #138 <Method void zzbar(int, Account, Scope[], String)>
	//   75  183:areturn         
		while(true);
	}

	public zzbar[] zznw(int i)
	{
		return new zzbar[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzbar[]
	//    2    4:areturn         
	}
}
