// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.maps.internal.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

// Referenced classes of package com.google.android.gms.maps:
//			zzai

public final class StreetViewPanoramaOptions extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	public StreetViewPanoramaOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void AbstractSafeParcelable()>
		zzby = Boolean.valueOf(true);
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokestatic    #73  <Method Boolean Boolean.valueOf(boolean)>
	//    5    9:putfield        #75  <Field Boolean zzby>
		zzap = Boolean.valueOf(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokestatic    #73  <Method Boolean Boolean.valueOf(boolean)>
	//    9   17:putfield        #77  <Field Boolean zzap>
		zzbz = Boolean.valueOf(true);
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:invokestatic    #73  <Method Boolean Boolean.valueOf(boolean)>
	//   13   25:putfield        #79  <Field Boolean zzbz>
		zzca = Boolean.valueOf(true);
	//   14   28:aload_0         
	//   15   29:iconst_1        
	//   16   30:invokestatic    #73  <Method Boolean Boolean.valueOf(boolean)>
	//   17   33:putfield        #81  <Field Boolean zzca>
		zzcb = StreetViewSource.DEFAULT;
	//   18   36:aload_0         
	//   19   37:getstatic       #86  <Field StreetViewSource StreetViewSource.DEFAULT>
	//   20   40:putfield        #88  <Field StreetViewSource zzcb>
	//   21   43:return          
	}

	StreetViewPanoramaOptions(StreetViewPanoramaCamera streetviewpanoramacamera, String s, LatLng latlng, Integer integer, byte byte0, byte byte1, byte byte2, 
			byte byte3, byte byte4, StreetViewSource streetviewsource)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void AbstractSafeParcelable()>
		zzby = Boolean.valueOf(true);
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokestatic    #73  <Method Boolean Boolean.valueOf(boolean)>
	//    5    9:putfield        #75  <Field Boolean zzby>
		zzap = Boolean.valueOf(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokestatic    #73  <Method Boolean Boolean.valueOf(boolean)>
	//    9   17:putfield        #77  <Field Boolean zzap>
		zzbz = Boolean.valueOf(true);
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:invokestatic    #73  <Method Boolean Boolean.valueOf(boolean)>
	//   13   25:putfield        #79  <Field Boolean zzbz>
		zzca = Boolean.valueOf(true);
	//   14   28:aload_0         
	//   15   29:iconst_1        
	//   16   30:invokestatic    #73  <Method Boolean Boolean.valueOf(boolean)>
	//   17   33:putfield        #81  <Field Boolean zzca>
		zzcb = StreetViewSource.DEFAULT;
	//   18   36:aload_0         
	//   19   37:getstatic       #86  <Field StreetViewSource StreetViewSource.DEFAULT>
	//   20   40:putfield        #88  <Field StreetViewSource zzcb>
		zzbw = streetviewpanoramacamera;
	//   21   43:aload_0         
	//   22   44:aload_1         
	//   23   45:putfield        #93  <Field StreetViewPanoramaCamera zzbw>
		position = latlng;
	//   24   48:aload_0         
	//   25   49:aload_3         
	//   26   50:putfield        #95  <Field LatLng position>
		zzbx = integer;
	//   27   53:aload_0         
	//   28   54:aload           4
	//   29   56:putfield        #97  <Field Integer zzbx>
		panoId = s;
	//   30   59:aload_0         
	//   31   60:aload_2         
	//   32   61:putfield        #99  <Field String panoId>
		zzby = zza.zza(byte0);
	//   33   64:aload_0         
	//   34   65:iload           5
	//   35   67:invokestatic    #105 <Method Boolean zza.zza(byte)>
	//   36   70:putfield        #75  <Field Boolean zzby>
		zzap = zza.zza(byte1);
	//   37   73:aload_0         
	//   38   74:iload           6
	//   39   76:invokestatic    #105 <Method Boolean zza.zza(byte)>
	//   40   79:putfield        #77  <Field Boolean zzap>
		zzbz = zza.zza(byte2);
	//   41   82:aload_0         
	//   42   83:iload           7
	//   43   85:invokestatic    #105 <Method Boolean zza.zza(byte)>
	//   44   88:putfield        #79  <Field Boolean zzbz>
		zzca = zza.zza(byte3);
	//   45   91:aload_0         
	//   46   92:iload           8
	//   47   94:invokestatic    #105 <Method Boolean zza.zza(byte)>
	//   48   97:putfield        #81  <Field Boolean zzca>
		zzak = zza.zza(byte4);
	//   49  100:aload_0         
	//   50  101:iload           9
	//   51  103:invokestatic    #105 <Method Boolean zza.zza(byte)>
	//   52  106:putfield        #107 <Field Boolean zzak>
		zzcb = streetviewsource;
	//   53  109:aload_0         
	//   54  110:aload           10
	//   55  112:putfield        #88  <Field StreetViewSource zzcb>
	//   56  115:return          
	}

	public final Boolean getPanningGesturesEnabled()
	{
		return zzbz;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Boolean zzbz>
	//    2    4:areturn         
	}

	public final String getPanoramaId()
	{
		return panoId;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field String panoId>
	//    2    4:areturn         
	}

	public final LatLng getPosition()
	{
		return position;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field LatLng position>
	//    2    4:areturn         
	}

	public final Integer getRadius()
	{
		return zzbx;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field Integer zzbx>
	//    2    4:areturn         
	}

	public final StreetViewSource getSource()
	{
		return zzcb;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field StreetViewSource zzcb>
	//    2    4:areturn         
	}

	public final Boolean getStreetNamesEnabled()
	{
		return zzca;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Boolean zzca>
	//    2    4:areturn         
	}

	public final StreetViewPanoramaCamera getStreetViewPanoramaCamera()
	{
		return zzbw;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field StreetViewPanoramaCamera zzbw>
	//    2    4:areturn         
	}

	public final Boolean getUseViewLifecycleInFragment()
	{
		return zzak;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field Boolean zzak>
	//    2    4:areturn         
	}

	public final Boolean getUserNavigationEnabled()
	{
		return zzby;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field Boolean zzby>
	//    2    4:areturn         
	}

	public final Boolean getZoomGesturesEnabled()
	{
		return zzap;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field Boolean zzap>
	//    2    4:areturn         
	}

	public final StreetViewPanoramaOptions panningGesturesEnabled(boolean flag)
	{
		zzbz = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #73  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #79  <Field Boolean zzbz>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final StreetViewPanoramaOptions panoramaCamera(StreetViewPanoramaCamera streetviewpanoramacamera)
	{
		zzbw = streetviewpanoramacamera;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #93  <Field StreetViewPanoramaCamera zzbw>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final StreetViewPanoramaOptions panoramaId(String s)
	{
		panoId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #99  <Field String panoId>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final StreetViewPanoramaOptions position(LatLng latlng)
	{
		position = latlng;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #95  <Field LatLng position>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final StreetViewPanoramaOptions position(LatLng latlng, StreetViewSource streetviewsource)
	{
		position = latlng;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #95  <Field LatLng position>
		zzcb = streetviewsource;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #88  <Field StreetViewSource zzcb>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public final StreetViewPanoramaOptions position(LatLng latlng, Integer integer)
	{
		position = latlng;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #95  <Field LatLng position>
		zzbx = integer;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #97  <Field Integer zzbx>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public final StreetViewPanoramaOptions position(LatLng latlng, Integer integer, StreetViewSource streetviewsource)
	{
		position = latlng;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #95  <Field LatLng position>
		zzbx = integer;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #97  <Field Integer zzbx>
		zzcb = streetviewsource;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #88  <Field StreetViewSource zzcb>
		return this;
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public final StreetViewPanoramaOptions streetNamesEnabled(boolean flag)
	{
		zzca = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #73  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #81  <Field Boolean zzca>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final String toString()
	{
		return Objects.toStringHelper(((Object) (this))).add("PanoramaId", ((Object) (panoId))).add("Position", ((Object) (position))).add("Radius", ((Object) (zzbx))).add("Source", ((Object) (zzcb))).add("StreetViewPanoramaCamera", ((Object) (zzbw))).add("UserNavigationEnabled", ((Object) (zzby))).add("ZoomGesturesEnabled", ((Object) (zzap))).add("PanningGesturesEnabled", ((Object) (zzbz))).add("StreetNamesEnabled", ((Object) (zzca))).add("UseViewLifecycleInFragment", ((Object) (zzak))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #138 <Method com.google.android.gms.common.internal.Objects$ToStringHelper Objects.toStringHelper(Object)>
	//    2    4:ldc1            #140 <String "PanoramaId">
	//    3    6:aload_0         
	//    4    7:getfield        #99  <Field String panoId>
	//    5   10:invokevirtual   #146 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//    6   13:ldc1            #148 <String "Position">
	//    7   15:aload_0         
	//    8   16:getfield        #95  <Field LatLng position>
	//    9   19:invokevirtual   #146 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   10   22:ldc1            #150 <String "Radius">
	//   11   24:aload_0         
	//   12   25:getfield        #97  <Field Integer zzbx>
	//   13   28:invokevirtual   #146 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   14   31:ldc1            #152 <String "Source">
	//   15   33:aload_0         
	//   16   34:getfield        #88  <Field StreetViewSource zzcb>
	//   17   37:invokevirtual   #146 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   18   40:ldc1            #154 <String "StreetViewPanoramaCamera">
	//   19   42:aload_0         
	//   20   43:getfield        #93  <Field StreetViewPanoramaCamera zzbw>
	//   21   46:invokevirtual   #146 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   22   49:ldc1            #156 <String "UserNavigationEnabled">
	//   23   51:aload_0         
	//   24   52:getfield        #75  <Field Boolean zzby>
	//   25   55:invokevirtual   #146 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   26   58:ldc1            #158 <String "ZoomGesturesEnabled">
	//   27   60:aload_0         
	//   28   61:getfield        #77  <Field Boolean zzap>
	//   29   64:invokevirtual   #146 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   30   67:ldc1            #160 <String "PanningGesturesEnabled">
	//   31   69:aload_0         
	//   32   70:getfield        #79  <Field Boolean zzbz>
	//   33   73:invokevirtual   #146 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   34   76:ldc1            #162 <String "StreetNamesEnabled">
	//   35   78:aload_0         
	//   36   79:getfield        #81  <Field Boolean zzca>
	//   37   82:invokevirtual   #146 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   38   85:ldc1            #164 <String "UseViewLifecycleInFragment">
	//   39   87:aload_0         
	//   40   88:getfield        #107 <Field Boolean zzak>
	//   41   91:invokevirtual   #146 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   42   94:invokevirtual   #166 <Method String com.google.android.gms.common.internal.Objects$ToStringHelper.toString()>
	//   43   97:areturn         
	}

	public final StreetViewPanoramaOptions useViewLifecycleInFragment(boolean flag)
	{
		zzak = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #73  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #107 <Field Boolean zzak>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final StreetViewPanoramaOptions userNavigationEnabled(boolean flag)
	{
		zzby = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #73  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #75  <Field Boolean zzby>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #176 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeParcelable(parcel, 2, ((android.os.Parcelable) (getStreetViewPanoramaCamera())), i, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #178 <Method StreetViewPanoramaCamera getStreetViewPanoramaCamera()>
	//    7   11:iload_2         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #182 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeString(parcel, 3, getPanoramaId(), false);
	//   10   16:aload_1         
	//   11   17:iconst_3        
	//   12   18:aload_0         
	//   13   19:invokevirtual   #184 <Method String getPanoramaId()>
	//   14   22:iconst_0        
	//   15   23:invokestatic    #188 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 4, ((android.os.Parcelable) (getPosition())), i, false);
	//   16   26:aload_1         
	//   17   27:iconst_4        
	//   18   28:aload_0         
	//   19   29:invokevirtual   #190 <Method LatLng getPosition()>
	//   20   32:iload_2         
	//   21   33:iconst_0        
	//   22   34:invokestatic    #182 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeIntegerObject(parcel, 5, getRadius(), false);
	//   23   37:aload_1         
	//   24   38:iconst_5        
	//   25   39:aload_0         
	//   26   40:invokevirtual   #192 <Method Integer getRadius()>
	//   27   43:iconst_0        
	//   28   44:invokestatic    #196 <Method void SafeParcelWriter.writeIntegerObject(Parcel, int, Integer, boolean)>
		SafeParcelWriter.writeByte(parcel, 6, zza.zza(zzby));
	//   29   47:aload_1         
	//   30   48:bipush          6
	//   31   50:aload_0         
	//   32   51:getfield        #75  <Field Boolean zzby>
	//   33   54:invokestatic    #199 <Method byte zza.zza(Boolean)>
	//   34   57:invokestatic    #203 <Method void SafeParcelWriter.writeByte(Parcel, int, byte)>
		SafeParcelWriter.writeByte(parcel, 7, zza.zza(zzap));
	//   35   60:aload_1         
	//   36   61:bipush          7
	//   37   63:aload_0         
	//   38   64:getfield        #77  <Field Boolean zzap>
	//   39   67:invokestatic    #199 <Method byte zza.zza(Boolean)>
	//   40   70:invokestatic    #203 <Method void SafeParcelWriter.writeByte(Parcel, int, byte)>
		SafeParcelWriter.writeByte(parcel, 8, zza.zza(zzbz));
	//   41   73:aload_1         
	//   42   74:bipush          8
	//   43   76:aload_0         
	//   44   77:getfield        #79  <Field Boolean zzbz>
	//   45   80:invokestatic    #199 <Method byte zza.zza(Boolean)>
	//   46   83:invokestatic    #203 <Method void SafeParcelWriter.writeByte(Parcel, int, byte)>
		SafeParcelWriter.writeByte(parcel, 9, zza.zza(zzca));
	//   47   86:aload_1         
	//   48   87:bipush          9
	//   49   89:aload_0         
	//   50   90:getfield        #81  <Field Boolean zzca>
	//   51   93:invokestatic    #199 <Method byte zza.zza(Boolean)>
	//   52   96:invokestatic    #203 <Method void SafeParcelWriter.writeByte(Parcel, int, byte)>
		SafeParcelWriter.writeByte(parcel, 10, zza.zza(zzak));
	//   53   99:aload_1         
	//   54  100:bipush          10
	//   55  102:aload_0         
	//   56  103:getfield        #107 <Field Boolean zzak>
	//   57  106:invokestatic    #199 <Method byte zza.zza(Boolean)>
	//   58  109:invokestatic    #203 <Method void SafeParcelWriter.writeByte(Parcel, int, byte)>
		SafeParcelWriter.writeParcelable(parcel, 11, ((android.os.Parcelable) (getSource())), i, false);
	//   59  112:aload_1         
	//   60  113:bipush          11
	//   61  115:aload_0         
	//   62  116:invokevirtual   #205 <Method StreetViewSource getSource()>
	//   63  119:iload_2         
	//   64  120:iconst_0        
	//   65  121:invokestatic    #182 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   66  124:aload_1         
	//   67  125:iload_3         
	//   68  126:invokestatic    #208 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   69  129:return          
	}

	public final StreetViewPanoramaOptions zoomGesturesEnabled(boolean flag)
	{
		zzap = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #73  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #77  <Field Boolean zzap>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzai();
	private String panoId;
	private LatLng position;
	private Boolean zzak;
	private Boolean zzap;
	private StreetViewPanoramaCamera zzbw;
	private Integer zzbx;
	private Boolean zzby;
	private Boolean zzbz;
	private Boolean zzca;
	private StreetViewSource zzcb;

	static 
	{
	//    0    0:new             #60  <Class zzai>
	//    1    3:dup             
	//    2    4:invokespecial   #63  <Method void zzai()>
	//    3    7:putstatic       #65  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
