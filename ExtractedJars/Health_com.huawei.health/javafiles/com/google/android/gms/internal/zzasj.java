// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.location.LocationRequest;

// Referenced classes of package com.google.android.gms.internal:
//			zzasi, zzarw

public class zzasj
	implements android.os.Parcelable.Creator
{

	public zzasj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzasi zzasi1, Parcel parcel, int i)
	{
		int j = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_3        
		zzc.zza(parcel, 1, ((android.os.Parcelable) (zzasi1.zzaWw)), i, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field LocationRequest zzasi.zzaWw>
	//    7   11:iload_2         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #29  <Method void zzc.zza(Parcel, int, android.os.Parcelable, int, boolean)>
		zzc.zzc(parcel, 5, zzasi1.zzbjx, false);
	//   10   16:aload_1         
	//   11   17:iconst_5        
	//   12   18:aload_0         
	//   13   19:getfield        #33  <Field java.util.List zzasi.zzbjx>
	//   14   22:iconst_0        
	//   15   23:invokestatic    #37  <Method void zzc.zzc(Parcel, int, java.util.List, boolean)>
		zzc.zza(parcel, 6, zzasi1.mTag, false);
	//   16   26:aload_1         
	//   17   27:bipush          6
	//   18   29:aload_0         
	//   19   30:getfield        #41  <Field String zzasi.mTag>
	//   20   33:iconst_0        
	//   21   34:invokestatic    #44  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zza(parcel, 7, zzasi1.zzbkN);
	//   22   37:aload_1         
	//   23   38:bipush          7
	//   24   40:aload_0         
	//   25   41:getfield        #48  <Field boolean zzasi.zzbkN>
	//   26   44:invokestatic    #51  <Method void zzc.zza(Parcel, int, boolean)>
		zzc.zza(parcel, 8, zzasi1.zzbkO);
	//   27   47:aload_1         
	//   28   48:bipush          8
	//   29   50:aload_0         
	//   30   51:getfield        #54  <Field boolean zzasi.zzbkO>
	//   31   54:invokestatic    #51  <Method void zzc.zza(Parcel, int, boolean)>
		zzc.zzJ(parcel, j);
	//   32   57:aload_1         
	//   33   58:iload_3         
	//   34   59:invokestatic    #58  <Method void zzc.zzJ(Parcel, int)>
	//   35   62:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzgV(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #64  <Method zzasi zzgV(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzky(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #70  <Method zzasi[] zzky(int)>
	//    3    5:areturn         
	}

	public zzasi zzgV(Parcel parcel)
	{
		int i = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #75  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore_2        
		LocationRequest locationrequest = null;
	//    3    5:aconst_null     
	//    4    6:astore          8
		Object obj = ((Object) (zzasi.zzbkM));
	//    5    8:getstatic       #78  <Field java.util.List zzasi.zzbkM>
	//    6   11:astore          7
		String s = null;
	//    7   13:aconst_null     
	//    8   14:astore          6
		boolean flag1 = false;
	//    9   16:iconst_0        
	//   10   17:istore          5
		boolean flag = false;
	//   11   19:iconst_0        
	//   12   20:istore          4
		do
		{
			if(parcel.dataPosition() >= i)
				break;
	//   13   22:aload_1         
	//   14   23:invokevirtual   #84  <Method int Parcel.dataPosition()>
	//   15   26:iload_2         
	//   16   27:icmpge          154
			int j = zzb.zzaX(parcel);
	//   17   30:aload_1         
	//   18   31:invokestatic    #87  <Method int zzb.zzaX(Parcel)>
	//   19   34:istore_3        
			switch(zzb.zzdc(j))
	//*  20   35:iload_3         
	//*  21   36:invokestatic    #91  <Method int zzb.zzdc(int)>
			{
	//*  22   39:tableswitch     1 8: default 84
	//	               1 87
	//	               2 146
	//	               3 146
	//	               4 146
	//	               5 103
	//	               6 116
	//	               7 126
	//	               8 136
	//*  23   84:goto            146
			case 1: // '\001'
				locationrequest = (LocationRequest)zzb.zza(parcel, j, LocationRequest.CREATOR);
	//   24   87:aload_1         
	//   25   88:iload_3         
	//   26   89:getstatic       #97  <Field android.os.Parcelable$Creator LocationRequest.CREATOR>
	//   27   92:invokestatic    #100 <Method android.os.Parcelable zzb.zza(Parcel, int, android.os.Parcelable$Creator)>
	//   28   95:checkcast       #93  <Class LocationRequest>
	//   29   98:astore          8
				break;

	//*  30  100:goto            151
			case 5: // '\005'
				obj = ((Object) (zzb.zzc(parcel, j, zzarw.CREATOR)));
	//   31  103:aload_1         
	//   32  104:iload_3         
	//   33  105:getstatic       #103 <Field android.os.Parcelable$Creator zzarw.CREATOR>
	//   34  108:invokestatic    #106 <Method java.util.ArrayList zzb.zzc(Parcel, int, android.os.Parcelable$Creator)>
	//   35  111:astore          7
				break;

	//*  36  113:goto            151
			case 6: // '\006'
				s = zzb.zzq(parcel, j);
	//   37  116:aload_1         
	//   38  117:iload_3         
	//   39  118:invokestatic    #110 <Method String zzb.zzq(Parcel, int)>
	//   40  121:astore          6
				break;

	//*  41  123:goto            151
			case 7: // '\007'
				flag1 = zzb.zzc(parcel, j);
	//   42  126:aload_1         
	//   43  127:iload_3         
	//   44  128:invokestatic    #113 <Method boolean zzb.zzc(Parcel, int)>
	//   45  131:istore          5
				break;

	//*  46  133:goto            151
			case 8: // '\b'
				flag = zzb.zzc(parcel, j);
	//   47  136:aload_1         
	//   48  137:iload_3         
	//   49  138:invokestatic    #113 <Method boolean zzb.zzc(Parcel, int)>
	//   50  141:istore          4
				break;

	//*  51  143:goto            151
			case 2: // '\002'
			case 3: // '\003'
			case 4: // '\004'
			default:
				zzb.zzb(parcel, j);
	//   52  146:aload_1         
	//   53  147:iload_3         
	//   54  148:invokestatic    #116 <Method void zzb.zzb(Parcel, int)>
				break;
			}
		} while(true);
	//*  55  151:goto            22
		if(parcel.dataPosition() != i)
	//*  56  154:aload_1         
	//*  57  155:invokevirtual   #84  <Method int Parcel.dataPosition()>
	//*  58  158:iload_2         
	//*  59  159:icmpeq          192
			throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(i).toString(), parcel);
	//   60  162:new             #118 <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   61  165:dup             
	//   62  166:new             #120 <Class StringBuilder>
	//   63  169:dup             
	//   64  170:bipush          37
	//   65  172:invokespecial   #123 <Method void StringBuilder(int)>
	//   66  175:ldc1            #125 <String "Overread allowed size end=">
	//   67  177:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   68  180:iload_2         
	//   69  181:invokevirtual   #132 <Method StringBuilder StringBuilder.append(int)>
	//   70  184:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   71  187:aload_1         
	//   72  188:invokespecial   #139 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   73  191:athrow          
		else
			return new zzasi(locationrequest, ((java.util.List) (obj)), s, flag1, flag);
	//   74  192:new             #22  <Class zzasi>
	//   75  195:dup             
	//   76  196:aload           8
	//   77  198:aload           7
	//   78  200:aload           6
	//   79  202:iload           5
	//   80  204:iload           4
	//   81  206:invokespecial   #142 <Method void zzasi(LocationRequest, java.util.List, String, boolean, boolean)>
	//   82  209:areturn         
	}

	public zzasi[] zzky(int i)
	{
		return new zzasi[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzasi[]
	//    2    4:areturn         
	}
}
