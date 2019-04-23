// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzr

public final class Tile extends AbstractSafeParcelable
{

	public Tile(int i, int j, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void AbstractSafeParcelable()>
		width = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #39  <Field int width>
		height = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #41  <Field int height>
		data = abyte0;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #43  <Field byte[] data>
	//   11   19:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #53  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 2, width);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #39  <Field int width>
	//    7   11:invokestatic    #57  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 3, height);
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:getfield        #41  <Field int height>
	//   12   20:invokestatic    #57  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeByteArray(parcel, 4, data, false);
	//   13   23:aload_1         
	//   14   24:iconst_4        
	//   15   25:aload_0         
	//   16   26:getfield        #43  <Field byte[] data>
	//   17   29:iconst_0        
	//   18   30:invokestatic    #61  <Method void SafeParcelWriter.writeByteArray(Parcel, int, byte[], boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   19   33:aload_1         
	//   20   34:iload_2         
	//   21   35:invokestatic    #64  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   22   38:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzr();
	public final byte data[];
	public final int height;
	public final int width;

	static 
	{
	//    0    0:new             #27  <Class zzr>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void zzr()>
	//    3    7:putstatic       #32  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
