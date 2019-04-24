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
//			zzaxw

public class zzaxx
	implements android.os.Parcelable.Creator
{

	public zzaxx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzaxw zzaxw1, Parcel parcel, int i)
	{
		int j = zzc.zzaV(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaV(Parcel)>
	//    2    4:istore_3        
		zzc.zzc(parcel, 1, zzaxw1.mVersionCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int zzaxw.mVersionCode>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 2, ((android.os.Parcelable) (zzaxw1.getAccount())), i, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #34  <Method Account zzaxw.getAccount()>
	//   12   20:iload_2         
	//   13   21:iconst_0        
	//   14   22:invokestatic    #37  <Method void zzc.zza(Parcel, int, android.os.Parcelable, int, boolean)>
		zzc.zza(parcel, 3, ((android.os.Parcelable []) (zzaxw1.zzOm())), i, false);
	//   15   25:aload_1         
	//   16   26:iconst_3        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #41  <Method Scope[] zzaxw.zzOm()>
	//   19   31:iload_2         
	//   20   32:iconst_0        
	//   21   33:invokestatic    #44  <Method void zzc.zza(Parcel, int, android.os.Parcelable[], int, boolean)>
		zzc.zza(parcel, 4, zzaxw1.zzqN(), false);
	//   22   36:aload_1         
	//   23   37:iconst_4        
	//   24   38:aload_0         
	//   25   39:invokevirtual   #48  <Method String zzaxw.zzqN()>
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
		return ((Object) (zziQ(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #61  <Method zzaxw zziQ(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzmL(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #67  <Method zzaxw[] zzmL(int)>
	//    3    5:areturn         
	}

	public zzaxw zziQ(Parcel parcel)
	{
		int i;
		int j;
		String s;
		Object obj;
		Scope ascope[];
		s = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		j = zzb.zzaU(parcel);
	//    2    3:aload_1         
	//    3    4:invokestatic    #72  <Method int zzb.zzaU(Parcel)>
	//    4    7:istore_3        
		i = 0;
	//    5    8:iconst_0        
	//    6    9:istore_2        
		ascope = null;
	//    7   10:aconst_null     
	//    8   11:astore          7
		obj = null;
	//    9   13:aconst_null     
	//   10   14:astore          6
_L7:
		int k;
		if(parcel.dataPosition() >= j)
			break MISSING_BLOCK_LABEL_192;
	//   11   16:aload_1         
	//   12   17:invokevirtual   #78  <Method int Parcel.dataPosition()>
	//   13   20:iload_3         
	//   14   21:icmpge          192
		k = zzb.zzaT(parcel);
	//   15   24:aload_1         
	//   16   25:invokestatic    #81  <Method int zzb.zzaT(Parcel)>
	//   17   28:istore          4
		zzb.zzcW(k);
	//   18   30:iload           4
	//   19   32:invokestatic    #85  <Method int zzb.zzcW(int)>
		JVM INSTR tableswitch 1 4: default 64
	//	               1 97
	//	               2 119
	//	               3 144
	//	               4 169;
	//   20   35:tableswitch     1 4: default 64
	//	               1 97
	//	               2 119
	//	               3 144
	//	               4 169
		   goto _L1 _L2 _L3 _L4 _L5
_L5:
		break MISSING_BLOCK_LABEL_169;
_L2:
		break; /* Loop/switch isn't completed */
_L1:
		zzb.zzb(parcel, k);
	//   21   64:aload_1         
	//   22   65:iload           4
	//   23   67:invokestatic    #88  <Method void zzb.zzb(Parcel, int)>
		Scope ascope1[] = ascope;
	//   24   70:aload           7
	//   25   72:astore          8
		ascope = ((Scope []) (obj));
	//   26   74:aload           6
	//   27   76:astore          7
		obj = ((Object) (ascope1));
	//   28   78:aload           8
	//   29   80:astore          6
_L8:
		Scope ascope2[] = ascope;
	//   30   82:aload           7
	//   31   84:astore          8
		ascope = ((Scope []) (obj));
	//   32   86:aload           6
	//   33   88:astore          7
		obj = ((Object) (ascope2));
	//   34   90:aload           8
	//   35   92:astore          6
		if(true) goto _L7; else goto _L6
	//   36   94:goto            16
_L6:
		i = zzb.zzg(parcel, k);
	//   37   97:aload_1         
	//   38   98:iload           4
	//   39  100:invokestatic    #92  <Method int zzb.zzg(Parcel, int)>
	//   40  103:istore_2        
		Object obj1 = obj;
	//   41  104:aload           6
	//   42  106:astore          8
		obj = ((Object) (ascope));
	//   43  108:aload           7
	//   44  110:astore          6
		ascope = ((Scope []) (obj1));
	//   45  112:aload           8
	//   46  114:astore          7
		  goto _L8
	//*  47  116:goto            82
_L3:
		Account account = (Account)zzb.zza(parcel, k, Account.CREATOR);
	//   48  119:aload_1         
	//   49  120:iload           4
	//   50  122:getstatic       #98  <Field android.os.Parcelable$Creator Account.CREATOR>
	//   51  125:invokestatic    #101 <Method android.os.Parcelable zzb.zza(Parcel, int, android.os.Parcelable$Creator)>
	//   52  128:checkcast       #94  <Class Account>
	//   53  131:astore          8
		obj = ((Object) (ascope));
	//   54  133:aload           7
	//   55  135:astore          6
		ascope = ((Scope []) (account));
	//   56  137:aload           8
	//   57  139:astore          7
		  goto _L8
	//*  58  141:goto            82
_L4:
		Scope ascope3[] = (Scope[])zzb.zzb(parcel, k, Scope.CREATOR);
	//   59  144:aload_1         
	//   60  145:iload           4
	//   61  147:getstatic       #104 <Field android.os.Parcelable$Creator Scope.CREATOR>
	//   62  150:invokestatic    #107 <Method Object[] zzb.zzb(Parcel, int, android.os.Parcelable$Creator)>
	//   63  153:checkcast       #109 <Class Scope[]>
	//   64  156:astore          8
		ascope = ((Scope []) (obj));
	//   65  158:aload           6
	//   66  160:astore          7
		obj = ((Object) (ascope3));
	//   67  162:aload           8
	//   68  164:astore          6
		  goto _L8
	//*  69  166:goto            82
		s = zzb.zzq(parcel, k);
	//   70  169:aload_1         
	//   71  170:iload           4
	//   72  172:invokestatic    #113 <Method String zzb.zzq(Parcel, int)>
	//   73  175:astore          5
		Scope ascope4[] = ((Scope []) (obj));
	//   74  177:aload           6
	//   75  179:astore          8
		obj = ((Object) (ascope));
	//   76  181:aload           7
	//   77  183:astore          6
		ascope = ascope4;
	//   78  185:aload           8
	//   79  187:astore          7
		  goto _L8
	//*  80  189:goto            82
		if(parcel.dataPosition() != j)
	//*  81  192:aload_1         
	//*  82  193:invokevirtual   #78  <Method int Parcel.dataPosition()>
	//*  83  196:iload_3         
	//*  84  197:icmpeq          230
			throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
	//   85  200:new             #115 <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   86  203:dup             
	//   87  204:new             #117 <Class StringBuilder>
	//   88  207:dup             
	//   89  208:bipush          37
	//   90  210:invokespecial   #120 <Method void StringBuilder(int)>
	//   91  213:ldc1            #122 <String "Overread allowed size end=">
	//   92  215:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   93  218:iload_3         
	//   94  219:invokevirtual   #129 <Method StringBuilder StringBuilder.append(int)>
	//   95  222:invokevirtual   #132 <Method String StringBuilder.toString()>
	//   96  225:aload_1         
	//   97  226:invokespecial   #135 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   98  229:athrow          
		else
			return new zzaxw(i, ((Account) (obj)), ascope, s);
	//   99  230:new             #22  <Class zzaxw>
	//  100  233:dup             
	//  101  234:iload_2         
	//  102  235:aload           6
	//  103  237:aload           7
	//  104  239:aload           5
	//  105  241:invokespecial   #138 <Method void zzaxw(int, Account, Scope[], String)>
	//  106  244:areturn         
	}

	public zzaxw[] zzmL(int i)
	{
		return new zzaxw[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzaxw[]
	//    2    4:areturn         
	}
}
