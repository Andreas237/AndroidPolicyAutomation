// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzao, zzy, zzai

public final class zzan extends AbstractSafeParcelable
{

	public zzan(zzai azzai[], zzy zzy, zzy zzy1, String s, float f, String s1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void AbstractSafeParcelable()>
		zzfm = azzai;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #50  <Field zzai[] zzfm>
		zzfd = zzy;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #52  <Field zzy zzfd>
		zzfe = zzy1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #54  <Field zzy zzfe>
		zzfg = s;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #56  <Field String zzfg>
		zzdo = f;
	//   14   25:aload_0         
	//   15   26:fload           5
	//   16   28:putfield        #58  <Field float zzdo>
		zzex = s1;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #60  <Field String zzex>
		zzfn = flag;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #62  <Field boolean zzfn>
	//   23   43:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #72  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeTypedArray(parcel, 2, ((android.os.Parcelable []) (zzfm)), i, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #50  <Field zzai[] zzfm>
	//    7   11:iload_2         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #76  <Method void SafeParcelWriter.writeTypedArray(Parcel, int, android.os.Parcelable[], int, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 3, ((android.os.Parcelable) (zzfd)), i, false);
	//   10   16:aload_1         
	//   11   17:iconst_3        
	//   12   18:aload_0         
	//   13   19:getfield        #52  <Field zzy zzfd>
	//   14   22:iload_2         
	//   15   23:iconst_0        
	//   16   24:invokestatic    #80  <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 4, ((android.os.Parcelable) (zzfe)), i, false);
	//   17   27:aload_1         
	//   18   28:iconst_4        
	//   19   29:aload_0         
	//   20   30:getfield        #54  <Field zzy zzfe>
	//   21   33:iload_2         
	//   22   34:iconst_0        
	//   23   35:invokestatic    #80  <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeString(parcel, 5, zzfg, false);
	//   24   38:aload_1         
	//   25   39:iconst_5        
	//   26   40:aload_0         
	//   27   41:getfield        #56  <Field String zzfg>
	//   28   44:iconst_0        
	//   29   45:invokestatic    #84  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeFloat(parcel, 6, zzdo);
	//   30   48:aload_1         
	//   31   49:bipush          6
	//   32   51:aload_0         
	//   33   52:getfield        #58  <Field float zzdo>
	//   34   55:invokestatic    #88  <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeString(parcel, 7, zzex, false);
	//   35   58:aload_1         
	//   36   59:bipush          7
	//   37   61:aload_0         
	//   38   62:getfield        #60  <Field String zzex>
	//   39   65:iconst_0        
	//   40   66:invokestatic    #84  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 8, zzfn);
	//   41   69:aload_1         
	//   42   70:bipush          8
	//   43   72:aload_0         
	//   44   73:getfield        #62  <Field boolean zzfn>
	//   45   76:invokestatic    #92  <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   46   79:aload_1         
	//   47   80:iload_3         
	//   48   81:invokestatic    #95  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   49   84:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzao();
	private final float zzdo;
	public final String zzex;
	public final zzy zzfd;
	private final zzy zzfe;
	public final String zzfg;
	private final zzai zzfm[];
	private final boolean zzfn;

	static 
	{
	//    0    0:new             #38  <Class zzao>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void zzao()>
	//    3    7:putstatic       #43  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
