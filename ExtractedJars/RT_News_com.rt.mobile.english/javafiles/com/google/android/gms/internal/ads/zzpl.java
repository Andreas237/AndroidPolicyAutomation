// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzpm, zzmu

public final class zzpl extends AbstractSafeParcelable
{

	public zzpl(int i, boolean flag, int j, boolean flag1, int k, zzmu zzmu1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void AbstractSafeParcelable()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #45  <Field int versionCode>
		zzbjn = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #47  <Field boolean zzbjn>
		zzbjo = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #49  <Field int zzbjo>
		zzbjp = flag1;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #51  <Field boolean zzbjp>
		zzbjq = k;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #53  <Field int zzbjq>
		zzbjr = zzmu1;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #55  <Field zzmu zzbjr>
	//   20   37:return          
	}

	public zzpl(NativeAdOptions nativeadoptions)
	{
		boolean flag = nativeadoptions.shouldReturnUrlsForImageAssets();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #64  <Method boolean NativeAdOptions.shouldReturnUrlsForImageAssets()>
	//    2    4:istore          4
		int i = nativeadoptions.getImageOrientation();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #68  <Method int NativeAdOptions.getImageOrientation()>
	//    5   10:istore_2        
		boolean flag1 = nativeadoptions.shouldRequestMultipleImages();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #71  <Method boolean NativeAdOptions.shouldRequestMultipleImages()>
	//    8   15:istore          5
		int j = nativeadoptions.getAdChoicesPlacement();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #74  <Method int NativeAdOptions.getAdChoicesPlacement()>
	//   11   21:istore_3        
		if(nativeadoptions.getVideoOptions() != null)
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #78  <Method com.google.android.gms.ads.VideoOptions NativeAdOptions.getVideoOptions()>
	//*  14   26:ifnull          44
			nativeadoptions = ((NativeAdOptions) (new zzmu(nativeadoptions.getVideoOptions())));
	//   15   29:new             #80  <Class zzmu>
	//   16   32:dup             
	//   17   33:aload_1         
	//   18   34:invokevirtual   #78  <Method com.google.android.gms.ads.VideoOptions NativeAdOptions.getVideoOptions()>
	//   19   37:invokespecial   #83  <Method void zzmu(com.google.android.gms.ads.VideoOptions)>
	//   20   40:astore_1        
		else
	//*  21   41:goto            46
			nativeadoptions = null;
	//   22   44:aconst_null     
	//   23   45:astore_1        
		this(3, flag, i, flag1, j, ((zzmu) (nativeadoptions)));
	//   24   46:aload_0         
	//   25   47:iconst_3        
	//   26   48:iload           4
	//   27   50:iload_2         
	//   28   51:iload           5
	//   29   53:iload_3         
	//   30   54:aload_1         
	//   31   55:invokespecial   #85  <Method void zzpl(int, boolean, int, boolean, int, zzmu)>
	//   32   58:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #93  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, versionCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #45  <Field int versionCode>
	//    7   11:invokestatic    #97  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeBoolean(parcel, 2, zzbjn);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #47  <Field boolean zzbjn>
	//   12   20:invokestatic    #101 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeInt(parcel, 3, zzbjo);
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:getfield        #49  <Field int zzbjo>
	//   17   29:invokestatic    #97  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeBoolean(parcel, 4, zzbjp);
	//   18   32:aload_1         
	//   19   33:iconst_4        
	//   20   34:aload_0         
	//   21   35:getfield        #51  <Field boolean zzbjp>
	//   22   38:invokestatic    #101 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeInt(parcel, 5, zzbjq);
	//   23   41:aload_1         
	//   24   42:iconst_5        
	//   25   43:aload_0         
	//   26   44:getfield        #53  <Field int zzbjq>
	//   27   47:invokestatic    #97  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeParcelable(parcel, 6, ((android.os.Parcelable) (zzbjr)), i, false);
	//   28   50:aload_1         
	//   29   51:bipush          6
	//   30   53:aload_0         
	//   31   54:getfield        #55  <Field zzmu zzbjr>
	//   32   57:iload_2         
	//   33   58:iconst_0        
	//   34   59:invokestatic    #105 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   35   62:aload_1         
	//   36   63:iload_3         
	//   37   64:invokestatic    #108 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   38   67:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzpm();
	public final int versionCode;
	public final boolean zzbjn;
	public final int zzbjo;
	public final boolean zzbjp;
	public final int zzbjq;
	public final zzmu zzbjr;

	static 
	{
	//    0    0:new             #33  <Class zzpm>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void zzpm()>
	//    3    7:putstatic       #38  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
