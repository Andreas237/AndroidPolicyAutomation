// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.internal:
//			zzacn

public class zzacu
	implements android.os.Parcelable.Creator
{

	public zzacu()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzacs.zza zza1, Parcel parcel, int i)
	{
		int j = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_3        
		zzc.zzc(parcel, 1, zza1.getVersionCode());
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #26  <Method int zzacs$zza.getVersionCode()>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzc(parcel, 2, zza1.zzys());
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #33  <Method int zzacs$zza.zzys()>
	//   12   20:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 3, zza1.zzyt());
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:invokevirtual   #37  <Method boolean zzacs$zza.zzyt()>
	//   17   29:invokestatic    #40  <Method void zzc.zza(Parcel, int, boolean)>
		zzc.zzc(parcel, 4, zza1.zzyu());
	//   18   32:aload_1         
	//   19   33:iconst_4        
	//   20   34:aload_0         
	//   21   35:invokevirtual   #43  <Method int zzacs$zza.zzyu()>
	//   22   38:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 5, zza1.zzyv());
	//   23   41:aload_1         
	//   24   42:iconst_5        
	//   25   43:aload_0         
	//   26   44:invokevirtual   #46  <Method boolean zzacs$zza.zzyv()>
	//   27   47:invokestatic    #40  <Method void zzc.zza(Parcel, int, boolean)>
		zzc.zza(parcel, 6, zza1.zzyw(), false);
	//   28   50:aload_1         
	//   29   51:bipush          6
	//   30   53:aload_0         
	//   31   54:invokevirtual   #50  <Method String zzacs$zza.zzyw()>
	//   32   57:iconst_0        
	//   33   58:invokestatic    #53  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zzc(parcel, 7, zza1.zzyx());
	//   34   61:aload_1         
	//   35   62:bipush          7
	//   36   64:aload_0         
	//   37   65:invokevirtual   #56  <Method int zzacs$zza.zzyx()>
	//   38   68:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 8, zza1.zzyz(), false);
	//   39   71:aload_1         
	//   40   72:bipush          8
	//   41   74:aload_0         
	//   42   75:invokevirtual   #59  <Method String zzacs$zza.zzyz()>
	//   43   78:iconst_0        
	//   44   79:invokestatic    #53  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zza(parcel, 9, ((android.os.Parcelable) (zza1.zzyB())), i, false);
	//   45   82:aload_1         
	//   46   83:bipush          9
	//   47   85:aload_0         
	//   48   86:invokevirtual   #63  <Method zzacn zzacs$zza.zzyB()>
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
		return ((Object) (zzbe(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #76  <Method zzacs$zza zzbe(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzdi(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #82  <Method zzacs$zza[] zzdi(int)>
	//    3    5:areturn         
	}

	public zzacs.zza zzbe(Parcel parcel)
	{
		int i1 = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #87  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore          6
		int l = 0;
	//    3    6:iconst_0        
	//    4    7:istore          5
		int k = 0;
	//    5    9:iconst_0        
	//    6   10:istore          4
		boolean flag1 = false;
	//    7   12:iconst_0        
	//    8   13:istore          9
		int j = 0;
	//    9   15:iconst_0        
	//   10   16:istore_3        
		boolean flag = false;
	//   11   17:iconst_0        
	//   12   18:istore          8
		String s1 = null;
	//   13   20:aconst_null     
	//   14   21:astore          12
		int i = 0;
	//   15   23:iconst_0        
	//   16   24:istore_2        
		String s = null;
	//   17   25:aconst_null     
	//   18   26:astore          11
		zzacn zzacn1 = null;
	//   19   28:aconst_null     
	//   20   29:astore          10
		do
			if(parcel.dataPosition() < i1)
	//*  21   31:aload_1         
	//*  22   32:invokevirtual   #92  <Method int Parcel.dataPosition()>
	//*  23   35:iload           6
	//*  24   37:icmpge          215
			{
				int j1 = zzb.zzaX(parcel);
	//   25   40:aload_1         
	//   26   41:invokestatic    #95  <Method int zzb.zzaX(Parcel)>
	//   27   44:istore          7
				switch(zzb.zzdc(j1))
	//*  28   46:iload           7
	//*  29   48:invokestatic    #99  <Method int zzb.zzdc(int)>
				{
	//*  30   51:tableswitch     1 9: default 100
	//	               1 103
	//	               2 114
	//	               3 125
	//	               4 136
	//	               5 146
	//	               6 157
	//	               7 168
	//	               8 178
	//	               9 189
	//*  31  100:goto            206
				case 1: // '\001'
					l = zzb.zzg(parcel, j1);
	//   32  103:aload_1         
	//   33  104:iload           7
	//   34  106:invokestatic    #103 <Method int zzb.zzg(Parcel, int)>
	//   35  109:istore          5
					break;

	//*  36  111:goto            212
				case 2: // '\002'
					k = zzb.zzg(parcel, j1);
	//   37  114:aload_1         
	//   38  115:iload           7
	//   39  117:invokestatic    #103 <Method int zzb.zzg(Parcel, int)>
	//   40  120:istore          4
					break;

	//*  41  122:goto            212
				case 3: // '\003'
					flag1 = zzb.zzc(parcel, j1);
	//   42  125:aload_1         
	//   43  126:iload           7
	//   44  128:invokestatic    #106 <Method boolean zzb.zzc(Parcel, int)>
	//   45  131:istore          9
					break;

	//*  46  133:goto            212
				case 4: // '\004'
					j = zzb.zzg(parcel, j1);
	//   47  136:aload_1         
	//   48  137:iload           7
	//   49  139:invokestatic    #103 <Method int zzb.zzg(Parcel, int)>
	//   50  142:istore_3        
					break;

	//*  51  143:goto            212
				case 5: // '\005'
					flag = zzb.zzc(parcel, j1);
	//   52  146:aload_1         
	//   53  147:iload           7
	//   54  149:invokestatic    #106 <Method boolean zzb.zzc(Parcel, int)>
	//   55  152:istore          8
					break;

	//*  56  154:goto            212
				case 6: // '\006'
					s1 = zzb.zzq(parcel, j1);
	//   57  157:aload_1         
	//   58  158:iload           7
	//   59  160:invokestatic    #110 <Method String zzb.zzq(Parcel, int)>
	//   60  163:astore          12
					break;

	//*  61  165:goto            212
				case 7: // '\007'
					i = zzb.zzg(parcel, j1);
	//   62  168:aload_1         
	//   63  169:iload           7
	//   64  171:invokestatic    #103 <Method int zzb.zzg(Parcel, int)>
	//   65  174:istore_2        
					break;

	//*  66  175:goto            212
				case 8: // '\b'
					s = zzb.zzq(parcel, j1);
	//   67  178:aload_1         
	//   68  179:iload           7
	//   69  181:invokestatic    #110 <Method String zzb.zzq(Parcel, int)>
	//   70  184:astore          11
					break;

	//*  71  186:goto            212
				case 9: // '\t'
					zzacn1 = (zzacn)zzb.zza(parcel, j1, zzacn.CREATOR);
	//   72  189:aload_1         
	//   73  190:iload           7
	//   74  192:getstatic       #116 <Field android.os.Parcelable$Creator zzacn.CREATOR>
	//   75  195:invokestatic    #119 <Method android.os.Parcelable zzb.zza(Parcel, int, android.os.Parcelable$Creator)>
	//   76  198:checkcast       #112 <Class zzacn>
	//   77  201:astore          10
					break;

	//*  78  203:goto            212
				default:
					zzb.zzb(parcel, j1);
	//   79  206:aload_1         
	//   80  207:iload           7
	//   81  209:invokestatic    #122 <Method void zzb.zzb(Parcel, int)>
					break;
				}
			} else
	//*  82  212:goto            31
			if(parcel.dataPosition() != i1)
	//*  83  215:aload_1         
	//*  84  216:invokevirtual   #92  <Method int Parcel.dataPosition()>
	//*  85  219:iload           6
	//*  86  221:icmpeq          255
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(i1).toString(), parcel);
	//   87  224:new             #124 <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   88  227:dup             
	//   89  228:new             #126 <Class StringBuilder>
	//   90  231:dup             
	//   91  232:bipush          37
	//   92  234:invokespecial   #129 <Method void StringBuilder(int)>
	//   93  237:ldc1            #131 <String "Overread allowed size end=">
	//   94  239:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   95  242:iload           6
	//   96  244:invokevirtual   #138 <Method StringBuilder StringBuilder.append(int)>
	//   97  247:invokevirtual   #141 <Method String StringBuilder.toString()>
	//   98  250:aload_1         
	//   99  251:invokespecial   #144 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//  100  254:athrow          
			else
				return new zzacs.zza(l, k, flag1, j, flag, s1, i, s, zzacn1);
	//  101  255:new             #22  <Class zzacs$zza>
	//  102  258:dup             
	//  103  259:iload           5
	//  104  261:iload           4
	//  105  263:iload           9
	//  106  265:iload_3         
	//  107  266:iload           8
	//  108  268:aload           12
	//  109  270:iload_2         
	//  110  271:aload           11
	//  111  273:aload           10
	//  112  275:invokespecial   #147 <Method void zzacs$zza(int, int, boolean, int, boolean, String, int, String, zzacn)>
	//  113  278:areturn         
		while(true);
	}

	public zzacs.zza[] zzdi(int i)
	{
		return new zzacs.zza[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzacs.zza[]
	//    2    4:areturn         
	}
}
