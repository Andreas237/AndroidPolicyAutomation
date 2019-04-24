// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.internal:
//			zzask, zzasi

public class zzasl
	implements android.os.Parcelable.Creator
{

	public zzasl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzask zzask1, Parcel parcel, int i)
	{
		int j = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_3        
		zzc.zzc(parcel, 1, zzask1.zzbkP);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int zzask.zzbkP>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 2, ((android.os.Parcelable) (zzask1.zzbkQ)), i, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #34  <Field zzasi zzask.zzbkQ>
	//   12   20:iload_2         
	//   13   21:iconst_0        
	//   14   22:invokestatic    #37  <Method void zzc.zza(Parcel, int, android.os.Parcelable, int, boolean)>
		zzc.zza(parcel, 3, zzask1.zzIr(), false);
	//   15   25:aload_1         
	//   16   26:iconst_3        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #41  <Method android.os.IBinder zzask.zzIr()>
	//   19   31:iconst_0        
	//   20   32:invokestatic    #44  <Method void zzc.zza(Parcel, int, android.os.IBinder, boolean)>
		zzc.zza(parcel, 4, ((android.os.Parcelable) (zzask1.mPendingIntent)), i, false);
	//   21   35:aload_1         
	//   22   36:iconst_4        
	//   23   37:aload_0         
	//   24   38:getfield        #48  <Field PendingIntent zzask.mPendingIntent>
	//   25   41:iload_2         
	//   26   42:iconst_0        
	//   27   43:invokestatic    #37  <Method void zzc.zza(Parcel, int, android.os.Parcelable, int, boolean)>
		zzc.zza(parcel, 5, zzask1.zzIs(), false);
	//   28   46:aload_1         
	//   29   47:iconst_5        
	//   30   48:aload_0         
	//   31   49:invokevirtual   #51  <Method android.os.IBinder zzask.zzIs()>
	//   32   52:iconst_0        
	//   33   53:invokestatic    #44  <Method void zzc.zza(Parcel, int, android.os.IBinder, boolean)>
		zzc.zza(parcel, 6, zzask1.zzIt(), false);
	//   34   56:aload_1         
	//   35   57:bipush          6
	//   36   59:aload_0         
	//   37   60:invokevirtual   #54  <Method android.os.IBinder zzask.zzIt()>
	//   38   63:iconst_0        
	//   39   64:invokestatic    #44  <Method void zzc.zza(Parcel, int, android.os.IBinder, boolean)>
		zzc.zzJ(parcel, j);
	//   40   67:aload_1         
	//   41   68:iload_3         
	//   42   69:invokestatic    #58  <Method void zzc.zzJ(Parcel, int)>
	//   43   72:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzgW(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #64  <Method zzask zzgW(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzkz(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #70  <Method zzask[] zzkz(int)>
	//    3    5:areturn         
	}

	public zzask zzgW(Parcel parcel)
	{
		int j = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #75  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore_3        
		int i = 1;
	//    3    5:iconst_1        
	//    4    6:istore_2        
		zzasi zzasi1 = null;
	//    5    7:aconst_null     
	//    6    8:astore          9
		android.os.IBinder ibinder2 = null;
	//    7   10:aconst_null     
	//    8   11:astore          8
		PendingIntent pendingintent = null;
	//    9   13:aconst_null     
	//   10   14:astore          7
		android.os.IBinder ibinder1 = null;
	//   11   16:aconst_null     
	//   12   17:astore          6
		android.os.IBinder ibinder = null;
	//   13   19:aconst_null     
	//   14   20:astore          5
		do
			if(parcel.dataPosition() < j)
	//*  15   22:aload_1         
	//*  16   23:invokevirtual   #81  <Method int Parcel.dataPosition()>
	//*  17   26:iload_3         
	//*  18   27:icmpge          169
			{
				int k = zzb.zzaX(parcel);
	//   19   30:aload_1         
	//   20   31:invokestatic    #84  <Method int zzb.zzaX(Parcel)>
	//   21   34:istore          4
				switch(zzb.zzdc(k))
	//*  22   36:iload           4
	//*  23   38:invokestatic    #88  <Method int zzb.zzdc(int)>
				{
	//*  24   41:tableswitch     1 6: default 80
	//	               1 83
	//	               2 93
	//	               3 110
	//	               4 121
	//	               5 138
	//	               6 149
	//*  25   80:goto            160
				case 1: // '\001'
					i = zzb.zzg(parcel, k);
	//   26   83:aload_1         
	//   27   84:iload           4
	//   28   86:invokestatic    #92  <Method int zzb.zzg(Parcel, int)>
	//   29   89:istore_2        
					break;

	//*  30   90:goto            166
				case 2: // '\002'
					zzasi1 = (zzasi)zzb.zza(parcel, k, zzasi.CREATOR);
	//   31   93:aload_1         
	//   32   94:iload           4
	//   33   96:getstatic       #98  <Field android.os.Parcelable$Creator zzasi.CREATOR>
	//   34   99:invokestatic    #101 <Method android.os.Parcelable zzb.zza(Parcel, int, android.os.Parcelable$Creator)>
	//   35  102:checkcast       #94  <Class zzasi>
	//   36  105:astore          9
					break;

	//*  37  107:goto            166
				case 3: // '\003'
					ibinder2 = zzb.zzr(parcel, k);
	//   38  110:aload_1         
	//   39  111:iload           4
	//   40  113:invokestatic    #105 <Method android.os.IBinder zzb.zzr(Parcel, int)>
	//   41  116:astore          8
					break;

	//*  42  118:goto            166
				case 4: // '\004'
					pendingintent = (PendingIntent)zzb.zza(parcel, k, PendingIntent.CREATOR);
	//   43  121:aload_1         
	//   44  122:iload           4
	//   45  124:getstatic       #108 <Field android.os.Parcelable$Creator PendingIntent.CREATOR>
	//   46  127:invokestatic    #101 <Method android.os.Parcelable zzb.zza(Parcel, int, android.os.Parcelable$Creator)>
	//   47  130:checkcast       #107 <Class PendingIntent>
	//   48  133:astore          7
					break;

	//*  49  135:goto            166
				case 5: // '\005'
					ibinder1 = zzb.zzr(parcel, k);
	//   50  138:aload_1         
	//   51  139:iload           4
	//   52  141:invokestatic    #105 <Method android.os.IBinder zzb.zzr(Parcel, int)>
	//   53  144:astore          6
					break;

	//*  54  146:goto            166
				case 6: // '\006'
					ibinder = zzb.zzr(parcel, k);
	//   55  149:aload_1         
	//   56  150:iload           4
	//   57  152:invokestatic    #105 <Method android.os.IBinder zzb.zzr(Parcel, int)>
	//   58  155:astore          5
					break;

	//*  59  157:goto            166
				default:
					zzb.zzb(parcel, k);
	//   60  160:aload_1         
	//   61  161:iload           4
	//   62  163:invokestatic    #111 <Method void zzb.zzb(Parcel, int)>
					break;
				}
			} else
	//*  63  166:goto            22
			if(parcel.dataPosition() != j)
	//*  64  169:aload_1         
	//*  65  170:invokevirtual   #81  <Method int Parcel.dataPosition()>
	//*  66  173:iload_3         
	//*  67  174:icmpeq          207
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
	//   68  177:new             #113 <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   69  180:dup             
	//   70  181:new             #115 <Class StringBuilder>
	//   71  184:dup             
	//   72  185:bipush          37
	//   73  187:invokespecial   #118 <Method void StringBuilder(int)>
	//   74  190:ldc1            #120 <String "Overread allowed size end=">
	//   75  192:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   76  195:iload_3         
	//   77  196:invokevirtual   #127 <Method StringBuilder StringBuilder.append(int)>
	//   78  199:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   79  202:aload_1         
	//   80  203:invokespecial   #134 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   81  206:athrow          
			else
				return new zzask(i, zzasi1, ibinder2, pendingintent, ibinder1, ibinder);
	//   82  207:new             #22  <Class zzask>
	//   83  210:dup             
	//   84  211:iload_2         
	//   85  212:aload           9
	//   86  214:aload           8
	//   87  216:aload           7
	//   88  218:aload           6
	//   89  220:aload           5
	//   90  222:invokespecial   #137 <Method void zzask(int, zzasi, android.os.IBinder, PendingIntent, android.os.IBinder, android.os.IBinder)>
	//   91  225:areturn         
		while(true);
	}

	public zzask[] zzkz(int i)
	{
		return new zzask[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzask[]
	//    2    4:areturn         
	}
}
