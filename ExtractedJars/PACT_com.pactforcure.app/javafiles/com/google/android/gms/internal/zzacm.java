// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.internal:
//			zzacf

public class zzacm
	implements android.os.Parcelable.Creator
{

	public zzacm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzack.zza zza1, Parcel parcel, int i)
	{
		int j = zzc.zzaV(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaV(Parcel)>
	//    2    4:istore_3        
		zzc.zzc(parcel, 1, zza1.getVersionCode());
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #26  <Method int zzack$zza.getVersionCode()>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzc(parcel, 2, zza1.zzxL());
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #33  <Method int zzack$zza.zzxL()>
	//   12   20:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 3, zza1.zzxM());
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:invokevirtual   #37  <Method boolean zzack$zza.zzxM()>
	//   17   29:invokestatic    #40  <Method void zzc.zza(Parcel, int, boolean)>
		zzc.zzc(parcel, 4, zza1.zzxN());
	//   18   32:aload_1         
	//   19   33:iconst_4        
	//   20   34:aload_0         
	//   21   35:invokevirtual   #43  <Method int zzack$zza.zzxN()>
	//   22   38:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 5, zza1.zzxO());
	//   23   41:aload_1         
	//   24   42:iconst_5        
	//   25   43:aload_0         
	//   26   44:invokevirtual   #46  <Method boolean zzack$zza.zzxO()>
	//   27   47:invokestatic    #40  <Method void zzc.zza(Parcel, int, boolean)>
		zzc.zza(parcel, 6, zza1.zzxP(), false);
	//   28   50:aload_1         
	//   29   51:bipush          6
	//   30   53:aload_0         
	//   31   54:invokevirtual   #50  <Method String zzack$zza.zzxP()>
	//   32   57:iconst_0        
	//   33   58:invokestatic    #53  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zzc(parcel, 7, zza1.zzxQ());
	//   34   61:aload_1         
	//   35   62:bipush          7
	//   36   64:aload_0         
	//   37   65:invokevirtual   #56  <Method int zzack$zza.zzxQ()>
	//   38   68:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 8, zza1.zzxS(), false);
	//   39   71:aload_1         
	//   40   72:bipush          8
	//   41   74:aload_0         
	//   42   75:invokevirtual   #59  <Method String zzack$zza.zzxS()>
	//   43   78:iconst_0        
	//   44   79:invokestatic    #53  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zza(parcel, 9, ((android.os.Parcelable) (zza1.zzxU())), i, false);
	//   45   82:aload_1         
	//   46   83:bipush          9
	//   47   85:aload_0         
	//   48   86:invokevirtual   #63  <Method zzacf zzack$zza.zzxU()>
	//   49   89:iload_2         
	//   50   90:iconst_0        
	//   51   91:invokestatic    #66  <Method void zzc.zza(Parcel, int, android.os.Parcelable, int, boolean)>
		zzc.zzJ(parcel, j);
	//   52   94:aload_1         
	//   53   95:iload_3         
	//   54   96:invokestatic    #70  <Method void zzc.zzJ(Parcel, int)>
	//   55   99:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzba(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #76  <Method zzack$zza zzba(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzdc(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #82  <Method zzack$zza[] zzdc(int)>
	//    3    5:areturn         
	}

	public zzack.zza zzba(Parcel parcel)
	{
		zzacf zzacf1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          10
		int i = 0;
	//    2    3:iconst_0        
	//    3    4:istore_2        
		int i1 = zzb.zzaU(parcel);
	//    4    5:aload_1         
	//    5    6:invokestatic    #87  <Method int zzb.zzaU(Parcel)>
	//    6    9:istore          6
		String s = null;
	//    7   11:aconst_null     
	//    8   12:astore          11
		String s1 = null;
	//    9   14:aconst_null     
	//   10   15:astore          12
		boolean flag = false;
	//   11   17:iconst_0        
	//   12   18:istore          8
		int j = 0;
	//   13   20:iconst_0        
	//   14   21:istore_3        
		boolean flag1 = false;
	//   15   22:iconst_0        
	//   16   23:istore          9
		int k = 0;
	//   17   25:iconst_0        
	//   18   26:istore          4
		int l = 0;
	//   19   28:iconst_0        
	//   20   29:istore          5
		do
			if(parcel.dataPosition() < i1)
	//*  21   31:aload_1         
	//*  22   32:invokevirtual   #92  <Method int Parcel.dataPosition()>
	//*  23   35:iload           6
	//*  24   37:icmpge          212
			{
				int j1 = zzb.zzaT(parcel);
	//   25   40:aload_1         
	//   26   41:invokestatic    #95  <Method int zzb.zzaT(Parcel)>
	//   27   44:istore          7
				switch(zzb.zzcW(j1))
	//*  28   46:iload           7
	//*  29   48:invokestatic    #99  <Method int zzb.zzcW(int)>
				{
	//*  30   51:tableswitch     1 9: default 100
	//	               1 109
	//	               2 120
	//	               3 131
	//	               4 142
	//	               5 152
	//	               6 163
	//	               7 174
	//	               8 184
	//	               9 195
				default:
					zzb.zzb(parcel, j1);
	//   31  100:aload_1         
	//   32  101:iload           7
	//   33  103:invokestatic    #102 <Method void zzb.zzb(Parcel, int)>
					break;

	//*  34  106:goto            31
				case 1: // '\001'
					l = zzb.zzg(parcel, j1);
	//   35  109:aload_1         
	//   36  110:iload           7
	//   37  112:invokestatic    #106 <Method int zzb.zzg(Parcel, int)>
	//   38  115:istore          5
					break;

	//*  39  117:goto            31
				case 2: // '\002'
					k = zzb.zzg(parcel, j1);
	//   40  120:aload_1         
	//   41  121:iload           7
	//   42  123:invokestatic    #106 <Method int zzb.zzg(Parcel, int)>
	//   43  126:istore          4
					break;

	//*  44  128:goto            31
				case 3: // '\003'
					flag1 = zzb.zzc(parcel, j1);
	//   45  131:aload_1         
	//   46  132:iload           7
	//   47  134:invokestatic    #109 <Method boolean zzb.zzc(Parcel, int)>
	//   48  137:istore          9
					break;

	//*  49  139:goto            31
				case 4: // '\004'
					j = zzb.zzg(parcel, j1);
	//   50  142:aload_1         
	//   51  143:iload           7
	//   52  145:invokestatic    #106 <Method int zzb.zzg(Parcel, int)>
	//   53  148:istore_3        
					break;

	//*  54  149:goto            31
				case 5: // '\005'
					flag = zzb.zzc(parcel, j1);
	//   55  152:aload_1         
	//   56  153:iload           7
	//   57  155:invokestatic    #109 <Method boolean zzb.zzc(Parcel, int)>
	//   58  158:istore          8
					break;

	//*  59  160:goto            31
				case 6: // '\006'
					s1 = zzb.zzq(parcel, j1);
	//   60  163:aload_1         
	//   61  164:iload           7
	//   62  166:invokestatic    #113 <Method String zzb.zzq(Parcel, int)>
	//   63  169:astore          12
					break;

	//*  64  171:goto            31
				case 7: // '\007'
					i = zzb.zzg(parcel, j1);
	//   65  174:aload_1         
	//   66  175:iload           7
	//   67  177:invokestatic    #106 <Method int zzb.zzg(Parcel, int)>
	//   68  180:istore_2        
					break;

	//*  69  181:goto            31
				case 8: // '\b'
					s = zzb.zzq(parcel, j1);
	//   70  184:aload_1         
	//   71  185:iload           7
	//   72  187:invokestatic    #113 <Method String zzb.zzq(Parcel, int)>
	//   73  190:astore          11
					break;

	//*  74  192:goto            31
				case 9: // '\t'
					zzacf1 = (zzacf)zzb.zza(parcel, j1, zzacf.CREATOR);
	//   75  195:aload_1         
	//   76  196:iload           7
	//   77  198:getstatic       #119 <Field android.os.Parcelable$Creator zzacf.CREATOR>
	//   78  201:invokestatic    #122 <Method android.os.Parcelable zzb.zza(Parcel, int, android.os.Parcelable$Creator)>
	//   79  204:checkcast       #115 <Class zzacf>
	//   80  207:astore          10
					break;
				}
			} else
	//*  81  209:goto            31
			if(parcel.dataPosition() != i1)
	//*  82  212:aload_1         
	//*  83  213:invokevirtual   #92  <Method int Parcel.dataPosition()>
	//*  84  216:iload           6
	//*  85  218:icmpeq          252
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(i1).toString(), parcel);
	//   86  221:new             #124 <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   87  224:dup             
	//   88  225:new             #126 <Class StringBuilder>
	//   89  228:dup             
	//   90  229:bipush          37
	//   91  231:invokespecial   #129 <Method void StringBuilder(int)>
	//   92  234:ldc1            #131 <String "Overread allowed size end=">
	//   93  236:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   94  239:iload           6
	//   95  241:invokevirtual   #138 <Method StringBuilder StringBuilder.append(int)>
	//   96  244:invokevirtual   #141 <Method String StringBuilder.toString()>
	//   97  247:aload_1         
	//   98  248:invokespecial   #144 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   99  251:athrow          
			else
				return new zzack.zza(l, k, flag1, j, flag, s1, i, s, zzacf1);
	//  100  252:new             #22  <Class zzack$zza>
	//  101  255:dup             
	//  102  256:iload           5
	//  103  258:iload           4
	//  104  260:iload           9
	//  105  262:iload_3         
	//  106  263:iload           8
	//  107  265:aload           12
	//  108  267:iload_2         
	//  109  268:aload           11
	//  110  270:aload           10
	//  111  272:invokespecial   #147 <Method void zzack$zza(int, int, boolean, int, boolean, String, int, String, zzacf)>
	//  112  275:areturn         
		while(true);
	}

	public zzack.zza[] zzdc(int i)
	{
		return new zzack.zza[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzack.zza[]
	//    2    4:areturn         
	}
}
