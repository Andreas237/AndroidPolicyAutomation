// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzmv

public final class zzmu extends AbstractSafeParcelable
{

	public zzmu(VideoOptions videooptions)
	{
		this(videooptions.getStartMuted(), videooptions.getCustomControlsRequested(), videooptions.getClickToExpandRequested());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #40  <Method boolean VideoOptions.getStartMuted()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #43  <Method boolean VideoOptions.getCustomControlsRequested()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #46  <Method boolean VideoOptions.getClickToExpandRequested()>
	//    7   13:invokespecial   #49  <Method void zzmu(boolean, boolean, boolean)>
	//    8   16:return          
	}

	public zzmu(boolean flag, boolean flag1, boolean flag2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void AbstractSafeParcelable()>
		zzato = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #54  <Field boolean zzato>
		zzatp = flag1;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #56  <Field boolean zzatp>
		zzatq = flag2;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #58  <Field boolean zzatq>
	//   11   19:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #68  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeBoolean(parcel, 2, zzato);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #54  <Field boolean zzato>
	//    7   11:invokestatic    #72  <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 3, zzatp);
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:getfield        #56  <Field boolean zzatp>
	//   12   20:invokestatic    #72  <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 4, zzatq);
	//   13   23:aload_1         
	//   14   24:iconst_4        
	//   15   25:aload_0         
	//   16   26:getfield        #58  <Field boolean zzatq>
	//   17   29:invokestatic    #72  <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   18   32:aload_1         
	//   19   33:iload_2         
	//   20   34:invokestatic    #75  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   21   37:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzmv();
	public final boolean zzato;
	public final boolean zzatp;
	public final boolean zzatq;

	static 
	{
	//    0    0:new             #27  <Class zzmv>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void zzmv()>
	//    3    7:putstatic       #32  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
