// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

// Referenced classes of package com.google.android.gms.maps:
//			zzb

public final class StreetViewPanoramaOptions extends zza
	implements ReflectedParcelable
{

	public StreetViewPanoramaOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void zza()>
		zzboN = Boolean.valueOf(true);
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokestatic    #40  <Method Boolean Boolean.valueOf(boolean)>
	//    5    9:putfield        #42  <Field Boolean zzboN>
		zzbof = Boolean.valueOf(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokestatic    #40  <Method Boolean Boolean.valueOf(boolean)>
	//    9   17:putfield        #44  <Field Boolean zzbof>
		zzboO = Boolean.valueOf(true);
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:invokestatic    #40  <Method Boolean Boolean.valueOf(boolean)>
	//   13   25:putfield        #46  <Field Boolean zzboO>
		zzboP = Boolean.valueOf(true);
	//   14   28:aload_0         
	//   15   29:iconst_1        
	//   16   30:invokestatic    #40  <Method Boolean Boolean.valueOf(boolean)>
	//   17   33:putfield        #48  <Field Boolean zzboP>
	//   18   36:return          
	}

	StreetViewPanoramaOptions(StreetViewPanoramaCamera streetviewpanoramacamera, String s, LatLng latlng, Integer integer, byte byte0, byte byte1, byte byte2, 
			byte byte3, byte byte4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void zza()>
		zzboN = Boolean.valueOf(true);
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokestatic    #40  <Method Boolean Boolean.valueOf(boolean)>
	//    5    9:putfield        #42  <Field Boolean zzboN>
		zzbof = Boolean.valueOf(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokestatic    #40  <Method Boolean Boolean.valueOf(boolean)>
	//    9   17:putfield        #44  <Field Boolean zzbof>
		zzboO = Boolean.valueOf(true);
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:invokestatic    #40  <Method Boolean Boolean.valueOf(boolean)>
	//   13   25:putfield        #46  <Field Boolean zzboO>
		zzboP = Boolean.valueOf(true);
	//   14   28:aload_0         
	//   15   29:iconst_1        
	//   16   30:invokestatic    #40  <Method Boolean Boolean.valueOf(boolean)>
	//   17   33:putfield        #48  <Field Boolean zzboP>
		zzboJ = streetviewpanoramacamera;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:putfield        #51  <Field StreetViewPanoramaCamera zzboJ>
		zzboL = latlng;
	//   21   41:aload_0         
	//   22   42:aload_3         
	//   23   43:putfield        #53  <Field LatLng zzboL>
		zzboM = integer;
	//   24   46:aload_0         
	//   25   47:aload           4
	//   26   49:putfield        #55  <Field Integer zzboM>
		zzboK = s;
	//   27   52:aload_0         
	//   28   53:aload_2         
	//   29   54:putfield        #57  <Field String zzboK>
		zzboN = com.google.android.gms.maps.internal.zza.zza(byte0);
	//   30   57:aload_0         
	//   31   58:iload           5
	//   32   60:invokestatic    #63  <Method Boolean com.google.android.gms.maps.internal.zza.zza(byte)>
	//   33   63:putfield        #42  <Field Boolean zzboN>
		zzbof = com.google.android.gms.maps.internal.zza.zza(byte1);
	//   34   66:aload_0         
	//   35   67:iload           6
	//   36   69:invokestatic    #63  <Method Boolean com.google.android.gms.maps.internal.zza.zza(byte)>
	//   37   72:putfield        #44  <Field Boolean zzbof>
		zzboO = com.google.android.gms.maps.internal.zza.zza(byte2);
	//   38   75:aload_0         
	//   39   76:iload           7
	//   40   78:invokestatic    #63  <Method Boolean com.google.android.gms.maps.internal.zza.zza(byte)>
	//   41   81:putfield        #46  <Field Boolean zzboO>
		zzboP = com.google.android.gms.maps.internal.zza.zza(byte3);
	//   42   84:aload_0         
	//   43   85:iload           8
	//   44   87:invokestatic    #63  <Method Boolean com.google.android.gms.maps.internal.zza.zza(byte)>
	//   45   90:putfield        #48  <Field Boolean zzboP>
		zzbnZ = com.google.android.gms.maps.internal.zza.zza(byte4);
	//   46   93:aload_0         
	//   47   94:iload           9
	//   48   96:invokestatic    #63  <Method Boolean com.google.android.gms.maps.internal.zza.zza(byte)>
	//   49   99:putfield        #65  <Field Boolean zzbnZ>
	//   50  102:return          
	}

	public Boolean getPanningGesturesEnabled()
	{
		return zzboO;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Boolean zzboO>
	//    2    4:areturn         
	}

	public String getPanoramaId()
	{
		return zzboK;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String zzboK>
	//    2    4:areturn         
	}

	public LatLng getPosition()
	{
		return zzboL;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field LatLng zzboL>
	//    2    4:areturn         
	}

	public Integer getRadius()
	{
		return zzboM;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Integer zzboM>
	//    2    4:areturn         
	}

	public Boolean getStreetNamesEnabled()
	{
		return zzboP;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Boolean zzboP>
	//    2    4:areturn         
	}

	public StreetViewPanoramaCamera getStreetViewPanoramaCamera()
	{
		return zzboJ;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field StreetViewPanoramaCamera zzboJ>
	//    2    4:areturn         
	}

	public Boolean getUseViewLifecycleInFragment()
	{
		return zzbnZ;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Boolean zzbnZ>
	//    2    4:areturn         
	}

	public Boolean getUserNavigationEnabled()
	{
		return zzboN;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Boolean zzboN>
	//    2    4:areturn         
	}

	public Boolean getZoomGesturesEnabled()
	{
		return zzbof;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Boolean zzbof>
	//    2    4:areturn         
	}

	public StreetViewPanoramaOptions panningGesturesEnabled(boolean flag)
	{
		zzboO = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #40  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #46  <Field Boolean zzboO>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public StreetViewPanoramaOptions panoramaCamera(StreetViewPanoramaCamera streetviewpanoramacamera)
	{
		zzboJ = streetviewpanoramacamera;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field StreetViewPanoramaCamera zzboJ>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public StreetViewPanoramaOptions panoramaId(String s)
	{
		zzboK = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field String zzboK>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public StreetViewPanoramaOptions position(LatLng latlng)
	{
		zzboL = latlng;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #53  <Field LatLng zzboL>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public StreetViewPanoramaOptions position(LatLng latlng, Integer integer)
	{
		zzboL = latlng;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #53  <Field LatLng zzboL>
		zzboM = integer;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #55  <Field Integer zzboM>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public StreetViewPanoramaOptions streetNamesEnabled(boolean flag)
	{
		zzboP = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #40  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #48  <Field Boolean zzboP>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public StreetViewPanoramaOptions useViewLifecycleInFragment(boolean flag)
	{
		zzbnZ = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #40  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #65  <Field Boolean zzbnZ>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public StreetViewPanoramaOptions userNavigationEnabled(boolean flag)
	{
		zzboN = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #40  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #42  <Field Boolean zzboN>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.maps.zzb.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #96  <Method void com.google.android.gms.maps.zzb.zza(StreetViewPanoramaOptions, Parcel, int)>
	//    4    6:return          
	}

	public StreetViewPanoramaOptions zoomGesturesEnabled(boolean flag)
	{
		zzbof = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #40  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #44  <Field Boolean zzbof>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	byte zzJB()
	{
		return com.google.android.gms.maps.internal.zza.zzd(zzboN);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Boolean zzboN>
	//    2    4:invokestatic    #103 <Method byte com.google.android.gms.maps.internal.zza.zzd(Boolean)>
	//    3    7:ireturn         
	}

	byte zzJC()
	{
		return com.google.android.gms.maps.internal.zza.zzd(zzboO);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Boolean zzboO>
	//    2    4:invokestatic    #103 <Method byte com.google.android.gms.maps.internal.zza.zzd(Boolean)>
	//    3    7:ireturn         
	}

	byte zzJD()
	{
		return com.google.android.gms.maps.internal.zza.zzd(zzboP);
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Boolean zzboP>
	//    2    4:invokestatic    #103 <Method byte com.google.android.gms.maps.internal.zza.zzd(Boolean)>
	//    3    7:ireturn         
	}

	byte zzJp()
	{
		return com.google.android.gms.maps.internal.zza.zzd(zzbnZ);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Boolean zzbnZ>
	//    2    4:invokestatic    #103 <Method byte com.google.android.gms.maps.internal.zza.zzd(Boolean)>
	//    3    7:ireturn         
	}

	byte zzJt()
	{
		return com.google.android.gms.maps.internal.zza.zzd(zzbof);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Boolean zzbof>
	//    2    4:invokestatic    #103 <Method byte com.google.android.gms.maps.internal.zza.zzd(Boolean)>
	//    3    7:ireturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzb();
	private Boolean zzbnZ;
	private StreetViewPanoramaCamera zzboJ;
	private String zzboK;
	private LatLng zzboL;
	private Integer zzboM;
	private Boolean zzboN;
	private Boolean zzboO;
	private Boolean zzboP;
	private Boolean zzbof;

	static 
	{
	//    0    0:new             #27  <Class zzb>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void zzb()>
	//    3    7:putstatic       #32  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
