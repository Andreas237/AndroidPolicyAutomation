// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.internal:
//			zzayz

public class zzaza
	implements android.os.Parcelable.Creator
{

	public zzaza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzayz zzayz1, Parcel parcel, int i)
	{
		i = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_2        
		zzc.zza(parcel, 2, zzayz1.name, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field String zzayz.name>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #29  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zza(parcel, 3, zzayz1.zzbBC);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:getfield        #33  <Field long zzayz.zzbBC>
	//   13   21:invokestatic    #36  <Method void zzc.zza(Parcel, int, long)>
		zzc.zza(parcel, 4, zzayz1.zzbhn);
	//   14   24:aload_1         
	//   15   25:iconst_4        
	//   16   26:aload_0         
	//   17   27:getfield        #40  <Field boolean zzayz.zzbhn>
	//   18   30:invokestatic    #43  <Method void zzc.zza(Parcel, int, boolean)>
		zzc.zza(parcel, 5, zzayz1.zzbhp);
	//   19   33:aload_1         
	//   20   34:iconst_5        
	//   21   35:aload_0         
	//   22   36:getfield        #47  <Field double zzayz.zzbhp>
	//   23   39:invokestatic    #50  <Method void zzc.zza(Parcel, int, double)>
		zzc.zza(parcel, 6, zzayz1.zzaGV, false);
	//   24   42:aload_1         
	//   25   43:bipush          6
	//   26   45:aload_0         
	//   27   46:getfield        #53  <Field String zzayz.zzaGV>
	//   28   49:iconst_0        
	//   29   50:invokestatic    #29  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zza(parcel, 7, zzayz1.zzbBD, false);
	//   30   53:aload_1         
	//   31   54:bipush          7
	//   32   56:aload_0         
	//   33   57:getfield        #57  <Field byte[] zzayz.zzbBD>
	//   34   60:iconst_0        
	//   35   61:invokestatic    #60  <Method void zzc.zza(Parcel, int, byte[], boolean)>
		zzc.zzc(parcel, 8, zzayz1.zzbBE);
	//   36   64:aload_1         
	//   37   65:bipush          8
	//   38   67:aload_0         
	//   39   68:getfield        #64  <Field int zzayz.zzbBE>
	//   40   71:invokestatic    #68  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzc(parcel, 9, zzayz1.zzbBF);
	//   41   74:aload_1         
	//   42   75:bipush          9
	//   43   77:aload_0         
	//   44   78:getfield        #71  <Field int zzayz.zzbBF>
	//   45   81:invokestatic    #68  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzJ(parcel, i);
	//   46   84:aload_1         
	//   47   85:iload_2         
	//   48   86:invokestatic    #75  <Method void zzc.zzJ(Parcel, int)>
	//   49   89:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzjb(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #81  <Method zzayz zzjb(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzmY(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #87  <Method zzayz[] zzmY(int)>
	//    3    5:areturn         
	}

	public zzayz zzjb(Parcel parcel)
	{
		int k = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #92  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore          6
		String s1 = null;
	//    3    6:aconst_null     
	//    4    7:astore          13
		long l1 = 0L;
	//    5    9:lconst_0        
	//    6   10:lstore          8
		boolean flag = false;
	//    7   12:iconst_0        
	//    8   13:istore          10
		double d = 0.0D;
	//    9   15:dconst_0        
	//   10   16:dstore_2        
		String s = null;
	//   11   17:aconst_null     
	//   12   18:astore          12
		byte abyte0[] = null;
	//   13   20:aconst_null     
	//   14   21:astore          11
		int j = 0;
	//   15   23:iconst_0        
	//   16   24:istore          5
		int i = 0;
	//   17   26:iconst_0        
	//   18   27:istore          4
		do
			if(parcel.dataPosition() < k)
	//*  19   29:aload_1         
	//*  20   30:invokevirtual   #98  <Method int Parcel.dataPosition()>
	//*  21   33:iload           6
	//*  22   35:icmpge          195
			{
				int l = zzb.zzaX(parcel);
	//   23   38:aload_1         
	//   24   39:invokestatic    #101 <Method int zzb.zzaX(Parcel)>
	//   25   42:istore          7
				switch(zzb.zzdc(l))
	//*  26   44:iload           7
	//*  27   46:invokestatic    #105 <Method int zzb.zzdc(int)>
				{
	//*  28   49:tableswitch     2 9: default 96
	//	               2 99
	//	               3 110
	//	               4 121
	//	               5 132
	//	               6 142
	//	               7 153
	//	               8 164
	//	               9 175
	//*  29   96:goto            186
				case 2: // '\002'
					s1 = zzb.zzq(parcel, l);
	//   30   99:aload_1         
	//   31  100:iload           7
	//   32  102:invokestatic    #109 <Method String zzb.zzq(Parcel, int)>
	//   33  105:astore          13
					break;

	//*  34  107:goto            192
				case 3: // '\003'
					l1 = zzb.zzi(parcel, l);
	//   35  110:aload_1         
	//   36  111:iload           7
	//   37  113:invokestatic    #113 <Method long zzb.zzi(Parcel, int)>
	//   38  116:lstore          8
					break;

	//*  39  118:goto            192
				case 4: // '\004'
					flag = zzb.zzc(parcel, l);
	//   40  121:aload_1         
	//   41  122:iload           7
	//   42  124:invokestatic    #116 <Method boolean zzb.zzc(Parcel, int)>
	//   43  127:istore          10
					break;

	//*  44  129:goto            192
				case 5: // '\005'
					d = zzb.zzn(parcel, l);
	//   45  132:aload_1         
	//   46  133:iload           7
	//   47  135:invokestatic    #120 <Method double zzb.zzn(Parcel, int)>
	//   48  138:dstore_2        
					break;

	//*  49  139:goto            192
				case 6: // '\006'
					s = zzb.zzq(parcel, l);
	//   50  142:aload_1         
	//   51  143:iload           7
	//   52  145:invokestatic    #109 <Method String zzb.zzq(Parcel, int)>
	//   53  148:astore          12
					break;

	//*  54  150:goto            192
				case 7: // '\007'
					abyte0 = zzb.zzt(parcel, l);
	//   55  153:aload_1         
	//   56  154:iload           7
	//   57  156:invokestatic    #124 <Method byte[] zzb.zzt(Parcel, int)>
	//   58  159:astore          11
					break;

	//*  59  161:goto            192
				case 8: // '\b'
					j = zzb.zzg(parcel, l);
	//   60  164:aload_1         
	//   61  165:iload           7
	//   62  167:invokestatic    #128 <Method int zzb.zzg(Parcel, int)>
	//   63  170:istore          5
					break;

	//*  64  172:goto            192
				case 9: // '\t'
					i = zzb.zzg(parcel, l);
	//   65  175:aload_1         
	//   66  176:iload           7
	//   67  178:invokestatic    #128 <Method int zzb.zzg(Parcel, int)>
	//   68  181:istore          4
					break;

	//*  69  183:goto            192
				default:
					zzb.zzb(parcel, l);
	//   70  186:aload_1         
	//   71  187:iload           7
	//   72  189:invokestatic    #131 <Method void zzb.zzb(Parcel, int)>
					break;
				}
			} else
	//*  73  192:goto            29
			if(parcel.dataPosition() != k)
	//*  74  195:aload_1         
	//*  75  196:invokevirtual   #98  <Method int Parcel.dataPosition()>
	//*  76  199:iload           6
	//*  77  201:icmpeq          235
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(k).toString(), parcel);
	//   78  204:new             #133 <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   79  207:dup             
	//   80  208:new             #135 <Class StringBuilder>
	//   81  211:dup             
	//   82  212:bipush          37
	//   83  214:invokespecial   #138 <Method void StringBuilder(int)>
	//   84  217:ldc1            #140 <String "Overread allowed size end=">
	//   85  219:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   86  222:iload           6
	//   87  224:invokevirtual   #147 <Method StringBuilder StringBuilder.append(int)>
	//   88  227:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   89  230:aload_1         
	//   90  231:invokespecial   #154 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   91  234:athrow          
			else
				return new zzayz(s1, l1, flag, d, s, abyte0, j, i);
	//   92  235:new             #22  <Class zzayz>
	//   93  238:dup             
	//   94  239:aload           13
	//   95  241:lload           8
	//   96  243:iload           10
	//   97  245:dload_2         
	//   98  246:aload           12
	//   99  248:aload           11
	//  100  250:iload           5
	//  101  252:iload           4
	//  102  254:invokespecial   #157 <Method void zzayz(String, long, boolean, double, String, byte[], int, int)>
	//  103  257:areturn         
		while(true);
	}

	public zzayz[] zzmY(int i)
	{
		return new zzayz[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzayz[]
	//    2    4:areturn         
	}
}
