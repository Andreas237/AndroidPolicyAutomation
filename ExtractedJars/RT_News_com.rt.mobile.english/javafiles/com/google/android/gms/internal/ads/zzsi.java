// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzsj

public final class zzsi extends AbstractSafeParcelable
{

	zzsi(boolean flag, String s, int i, byte abyte0[], String as[], String as1[], boolean flag1, 
			long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void AbstractSafeParcelable()>
		zzbnj = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #51  <Field boolean zzbnj>
		zzbnk = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #53  <Field String zzbnk>
		statusCode = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #55  <Field int statusCode>
		data = abyte0;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #57  <Field byte[] data>
		zzbnh = as;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #59  <Field String[] zzbnh>
		zzbni = as1;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #61  <Field String[] zzbni>
		zzac = flag1;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #63  <Field boolean zzac>
		zzad = l;
	//   23   43:aload_0         
	//   24   44:lload           8
	//   25   46:putfield        #65  <Field long zzad>
	//   26   49:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #75  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeBoolean(parcel, 1, zzbnj);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #51  <Field boolean zzbnj>
	//    7   11:invokestatic    #79  <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeString(parcel, 2, zzbnk, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #53  <Field String zzbnk>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #83  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeInt(parcel, 3, statusCode);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #55  <Field int statusCode>
	//   18   30:invokestatic    #87  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeByteArray(parcel, 4, data, false);
	//   19   33:aload_1         
	//   20   34:iconst_4        
	//   21   35:aload_0         
	//   22   36:getfield        #57  <Field byte[] data>
	//   23   39:iconst_0        
	//   24   40:invokestatic    #91  <Method void SafeParcelWriter.writeByteArray(Parcel, int, byte[], boolean)>
		SafeParcelWriter.writeStringArray(parcel, 5, zzbnh, false);
	//   25   43:aload_1         
	//   26   44:iconst_5        
	//   27   45:aload_0         
	//   28   46:getfield        #59  <Field String[] zzbnh>
	//   29   49:iconst_0        
	//   30   50:invokestatic    #95  <Method void SafeParcelWriter.writeStringArray(Parcel, int, String[], boolean)>
		SafeParcelWriter.writeStringArray(parcel, 6, zzbni, false);
	//   31   53:aload_1         
	//   32   54:bipush          6
	//   33   56:aload_0         
	//   34   57:getfield        #61  <Field String[] zzbni>
	//   35   60:iconst_0        
	//   36   61:invokestatic    #95  <Method void SafeParcelWriter.writeStringArray(Parcel, int, String[], boolean)>
		SafeParcelWriter.writeBoolean(parcel, 7, zzac);
	//   37   64:aload_1         
	//   38   65:bipush          7
	//   39   67:aload_0         
	//   40   68:getfield        #63  <Field boolean zzac>
	//   41   71:invokestatic    #79  <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeLong(parcel, 8, zzad);
	//   42   74:aload_1         
	//   43   75:bipush          8
	//   44   77:aload_0         
	//   45   78:getfield        #65  <Field long zzad>
	//   46   81:invokestatic    #99  <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   47   84:aload_1         
	//   48   85:iload_2         
	//   49   86:invokestatic    #102 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   50   89:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzsj();
	public final byte data[];
	public final int statusCode;
	public final boolean zzac;
	public final long zzad;
	public final String zzbnh[];
	public final String zzbni[];
	public final boolean zzbnj;
	public final String zzbnk;

	static 
	{
	//    0    0:new             #39  <Class zzsj>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void zzsj()>
	//    3    7:putstatic       #44  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
