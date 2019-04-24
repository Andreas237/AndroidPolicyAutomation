// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzjn

public final class zzms extends zzjn
{

	public zzms(zzjn zzjn1)
	{
		super(zzjn1.zzarb, zzjn1.height, zzjn1.heightPixels, zzjn1.zzarc, zzjn1.width, zzjn1.widthPixels, zzjn1.zzard, zzjn1.zzare, zzjn1.zzarf, zzjn1.zzarg);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #11  <Field String zzjn.zzarb>
	//    3    5:aload_1         
	//    4    6:getfield        #15  <Field int zzjn.height>
	//    5    9:aload_1         
	//    6   10:getfield        #18  <Field int zzjn.heightPixels>
	//    7   13:aload_1         
	//    8   14:getfield        #22  <Field boolean zzjn.zzarc>
	//    9   17:aload_1         
	//   10   18:getfield        #25  <Field int zzjn.width>
	//   11   21:aload_1         
	//   12   22:getfield        #28  <Field int zzjn.widthPixels>
	//   13   25:aload_1         
	//   14   26:getfield        #32  <Field zzjn[] zzjn.zzard>
	//   15   29:aload_1         
	//   16   30:getfield        #35  <Field boolean zzjn.zzare>
	//   17   33:aload_1         
	//   18   34:getfield        #38  <Field boolean zzjn.zzarf>
	//   19   37:aload_1         
	//   20   38:getfield        #41  <Field boolean zzjn.zzarg>
	//   21   41:invokespecial   #44  <Method void zzjn(String, int, int, boolean, int, int, zzjn[], boolean, boolean, boolean)>
	//   22   44:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #53  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeString(parcel, 2, zzarb, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #54  <Field String zzarb>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #58  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeInt(parcel, 3, height);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:getfield        #59  <Field int height>
	//   13   21:invokestatic    #63  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 6, width);
	//   14   24:aload_1         
	//   15   25:bipush          6
	//   16   27:aload_0         
	//   17   28:getfield        #64  <Field int width>
	//   18   31:invokestatic    #63  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   19   34:aload_1         
	//   20   35:iload_2         
	//   21   36:invokestatic    #67  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   22   39:return          
	}
}
