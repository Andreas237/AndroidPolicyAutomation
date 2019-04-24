// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzd, BitmapDescriptor, LatLngBounds, LatLng

public final class GroundOverlayOptions extends zza
{

	public GroundOverlayOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void zza()>
		zzbpj = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #40  <Field boolean zzbpj>
		zzbpr = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #42  <Field float zzbpr>
		zzbps = 0.5F;
	//    8   14:aload_0         
	//    9   15:ldc1            #43  <Float 0.5F>
	//   10   17:putfield        #45  <Field float zzbps>
		zzbpt = 0.5F;
	//   11   20:aload_0         
	//   12   21:ldc1            #43  <Float 0.5F>
	//   13   23:putfield        #47  <Field float zzbpt>
		zzbpk = false;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #49  <Field boolean zzbpk>
	//   17   31:return          
	}

	GroundOverlayOptions(IBinder ibinder, LatLng latlng, float f, float f1, LatLngBounds latlngbounds, float f2, float f3, 
			boolean flag, float f4, float f5, float f6, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void zza()>
		zzbpj = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #40  <Field boolean zzbpj>
		zzbpr = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #42  <Field float zzbpr>
		zzbps = 0.5F;
	//    8   14:aload_0         
	//    9   15:ldc1            #43  <Float 0.5F>
	//   10   17:putfield        #45  <Field float zzbps>
		zzbpt = 0.5F;
	//   11   20:aload_0         
	//   12   21:ldc1            #43  <Float 0.5F>
	//   13   23:putfield        #47  <Field float zzbpt>
		zzbpk = false;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #49  <Field boolean zzbpk>
		zzbpn = new BitmapDescriptor(com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(ibinder));
	//   17   31:aload_0         
	//   18   32:new             #52  <Class BitmapDescriptor>
	//   19   35:dup             
	//   20   36:aload_1         
	//   21   37:invokestatic    #58  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   22   40:invokespecial   #61  <Method void BitmapDescriptor(IObjectWrapper)>
	//   23   43:putfield        #63  <Field BitmapDescriptor zzbpn>
		zzbpo = latlng;
	//   24   46:aload_0         
	//   25   47:aload_2         
	//   26   48:putfield        #65  <Field LatLng zzbpo>
		zzbpp = f;
	//   27   51:aload_0         
	//   28   52:fload_3         
	//   29   53:putfield        #67  <Field float zzbpp>
		zzbpq = f1;
	//   30   56:aload_0         
	//   31   57:fload           4
	//   32   59:putfield        #69  <Field float zzbpq>
		zzbnp = latlngbounds;
	//   33   62:aload_0         
	//   34   63:aload           5
	//   35   65:putfield        #71  <Field LatLngBounds zzbnp>
		zzbpd = f2;
	//   36   68:aload_0         
	//   37   69:fload           6
	//   38   71:putfield        #73  <Field float zzbpd>
		zzbpi = f3;
	//   39   74:aload_0         
	//   40   75:fload           7
	//   41   77:putfield        #75  <Field float zzbpi>
		zzbpj = flag;
	//   42   80:aload_0         
	//   43   81:iload           8
	//   44   83:putfield        #40  <Field boolean zzbpj>
		zzbpr = f4;
	//   45   86:aload_0         
	//   46   87:fload           9
	//   47   89:putfield        #42  <Field float zzbpr>
		zzbps = f5;
	//   48   92:aload_0         
	//   49   93:fload           10
	//   50   95:putfield        #45  <Field float zzbps>
		zzbpt = f6;
	//   51   98:aload_0         
	//   52   99:fload           11
	//   53  101:putfield        #47  <Field float zzbpt>
		zzbpk = flag1;
	//   54  104:aload_0         
	//   55  105:iload           12
	//   56  107:putfield        #49  <Field boolean zzbpk>
	//   57  110:return          
	}

	private GroundOverlayOptions zza(LatLng latlng, float f, float f1)
	{
		zzbpo = latlng;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #65  <Field LatLng zzbpo>
		zzbpp = f;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #67  <Field float zzbpp>
		zzbpq = f1;
	//    6   10:aload_0         
	//    7   11:fload_3         
	//    8   12:putfield        #69  <Field float zzbpq>
		return this;
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public GroundOverlayOptions anchor(float f, float f1)
	{
		zzbps = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #45  <Field float zzbps>
		zzbpt = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #47  <Field float zzbpt>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public GroundOverlayOptions bearing(float f)
	{
		zzbpd = (f % 360F + 360F) % 360F;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:ldc1            #82  <Float 360F>
	//    3    4:frem            
	//    4    5:ldc1            #82  <Float 360F>
	//    5    7:fadd            
	//    6    8:ldc1            #82  <Float 360F>
	//    7   10:frem            
	//    8   11:putfield        #73  <Field float zzbpd>
		return this;
	//    9   14:aload_0         
	//   10   15:areturn         
	}

	public GroundOverlayOptions clickable(boolean flag)
	{
		zzbpk = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #49  <Field boolean zzbpk>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public float getAnchorU()
	{
		return zzbps;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field float zzbps>
	//    2    4:freturn         
	}

	public float getAnchorV()
	{
		return zzbpt;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field float zzbpt>
	//    2    4:freturn         
	}

	public float getBearing()
	{
		return zzbpd;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field float zzbpd>
	//    2    4:freturn         
	}

	public LatLngBounds getBounds()
	{
		return zzbnp;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field LatLngBounds zzbnp>
	//    2    4:areturn         
	}

	public float getHeight()
	{
		return zzbpq;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field float zzbpq>
	//    2    4:freturn         
	}

	public BitmapDescriptor getImage()
	{
		return zzbpn;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field BitmapDescriptor zzbpn>
	//    2    4:areturn         
	}

	public LatLng getLocation()
	{
		return zzbpo;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field LatLng zzbpo>
	//    2    4:areturn         
	}

	public float getTransparency()
	{
		return zzbpr;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field float zzbpr>
	//    2    4:freturn         
	}

	public float getWidth()
	{
		return zzbpp;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field float zzbpp>
	//    2    4:freturn         
	}

	public float getZIndex()
	{
		return zzbpi;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field float zzbpi>
	//    2    4:freturn         
	}

	public GroundOverlayOptions image(BitmapDescriptor bitmapdescriptor)
	{
		zzac.zzb(((Object) (bitmapdescriptor)), "imageDescriptor must not be null");
	//    0    0:aload_1         
	//    1    1:ldc1            #102 <String "imageDescriptor must not be null">
	//    2    3:invokestatic    #108 <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		zzbpn = bitmapdescriptor;
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:putfield        #63  <Field BitmapDescriptor zzbpn>
		return this;
	//    7   12:aload_0         
	//    8   13:areturn         
	}

	public boolean isClickable()
	{
		return zzbpk;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field boolean zzbpk>
	//    2    4:ireturn         
	}

	public boolean isVisible()
	{
		return zzbpj;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field boolean zzbpj>
	//    2    4:ireturn         
	}

	public GroundOverlayOptions position(LatLng latlng, float f)
	{
		boolean flag;
		if(zzbnp == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field LatLngBounds zzbnp>
	//*   2    4:ifnonnull       12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_3        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		zzac.zza(flag, "Position has already been set using positionFromBounds");
	//    8   14:iload_3         
	//    9   15:ldc1            #116 <String "Position has already been set using positionFromBounds">
	//   10   17:invokestatic    #119 <Method void zzac.zza(boolean, Object)>
		if(latlng != null)
	//*  11   20:aload_1         
	//*  12   21:ifnull          29
			flag = true;
	//   13   24:iconst_1        
	//   14   25:istore_3        
		else
	//*  15   26:goto            31
			flag = false;
	//   16   29:iconst_0        
	//   17   30:istore_3        
		zzac.zzb(flag, "Location must be specified");
	//   18   31:iload_3         
	//   19   32:ldc1            #121 <String "Location must be specified">
	//   20   34:invokestatic    #123 <Method void zzac.zzb(boolean, Object)>
		if(f >= 0.0F)
	//*  21   37:fload_2         
	//*  22   38:fconst_0        
	//*  23   39:fcmpl           
	//*  24   40:iflt            48
			flag = true;
	//   25   43:iconst_1        
	//   26   44:istore_3        
		else
	//*  27   45:goto            50
			flag = false;
	//   28   48:iconst_0        
	//   29   49:istore_3        
		zzac.zzb(flag, "Width must be non-negative");
	//   30   50:iload_3         
	//   31   51:ldc1            #125 <String "Width must be non-negative">
	//   32   53:invokestatic    #123 <Method void zzac.zzb(boolean, Object)>
		return zza(latlng, f, -1F);
	//   33   56:aload_0         
	//   34   57:aload_1         
	//   35   58:fload_2         
	//   36   59:ldc1            #10  <Float -1F>
	//   37   61:invokespecial   #127 <Method GroundOverlayOptions zza(LatLng, float, float)>
	//   38   64:areturn         
	}

	public GroundOverlayOptions position(LatLng latlng, float f, float f1)
	{
		boolean flag;
		if(zzbnp == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field LatLngBounds zzbnp>
	//*   2    4:ifnonnull       13
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore          4
		else
	//*   5   10:goto            16
			flag = false;
	//    6   13:iconst_0        
	//    7   14:istore          4
		zzac.zza(flag, "Position has already been set using positionFromBounds");
	//    8   16:iload           4
	//    9   18:ldc1            #116 <String "Position has already been set using positionFromBounds">
	//   10   20:invokestatic    #119 <Method void zzac.zza(boolean, Object)>
		if(latlng != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          33
			flag = true;
	//   13   27:iconst_1        
	//   14   28:istore          4
		else
	//*  15   30:goto            36
			flag = false;
	//   16   33:iconst_0        
	//   17   34:istore          4
		zzac.zzb(flag, "Location must be specified");
	//   18   36:iload           4
	//   19   38:ldc1            #121 <String "Location must be specified">
	//   20   40:invokestatic    #123 <Method void zzac.zzb(boolean, Object)>
		if(f >= 0.0F)
	//*  21   43:fload_2         
	//*  22   44:fconst_0        
	//*  23   45:fcmpl           
	//*  24   46:iflt            55
			flag = true;
	//   25   49:iconst_1        
	//   26   50:istore          4
		else
	//*  27   52:goto            58
			flag = false;
	//   28   55:iconst_0        
	//   29   56:istore          4
		zzac.zzb(flag, "Width must be non-negative");
	//   30   58:iload           4
	//   31   60:ldc1            #125 <String "Width must be non-negative">
	//   32   62:invokestatic    #123 <Method void zzac.zzb(boolean, Object)>
		if(f1 >= 0.0F)
	//*  33   65:fload_3         
	//*  34   66:fconst_0        
	//*  35   67:fcmpl           
	//*  36   68:iflt            77
			flag = true;
	//   37   71:iconst_1        
	//   38   72:istore          4
		else
	//*  39   74:goto            80
			flag = false;
	//   40   77:iconst_0        
	//   41   78:istore          4
		zzac.zzb(flag, "Height must be non-negative");
	//   42   80:iload           4
	//   43   82:ldc1            #129 <String "Height must be non-negative">
	//   44   84:invokestatic    #123 <Method void zzac.zzb(boolean, Object)>
		return zza(latlng, f, f1);
	//   45   87:aload_0         
	//   46   88:aload_1         
	//   47   89:fload_2         
	//   48   90:fload_3         
	//   49   91:invokespecial   #127 <Method GroundOverlayOptions zza(LatLng, float, float)>
	//   50   94:areturn         
	}

	public GroundOverlayOptions positionFromBounds(LatLngBounds latlngbounds)
	{
		boolean flag;
		if(zzbpo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field LatLng zzbpo>
	//*   2    4:ifnonnull       12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		String s = String.valueOf(((Object) (zzbpo)));
	//    8   14:aload_0         
	//    9   15:getfield        #65  <Field LatLng zzbpo>
	//   10   18:invokestatic    #137 <Method String String.valueOf(Object)>
	//   11   21:astore_3        
		zzac.zza(flag, ((Object) ((new StringBuilder(String.valueOf(((Object) (s))).length() + 46)).append("Position has already been set using position: ").append(s).toString())));
	//   12   22:iload_2         
	//   13   23:new             #139 <Class StringBuilder>
	//   14   26:dup             
	//   15   27:aload_3         
	//   16   28:invokestatic    #137 <Method String String.valueOf(Object)>
	//   17   31:invokevirtual   #143 <Method int String.length()>
	//   18   34:bipush          46
	//   19   36:iadd            
	//   20   37:invokespecial   #146 <Method void StringBuilder(int)>
	//   21   40:ldc1            #148 <String "Position has already been set using position: ">
	//   22   42:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   23   45:aload_3         
	//   24   46:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   25   49:invokevirtual   #156 <Method String StringBuilder.toString()>
	//   26   52:invokestatic    #119 <Method void zzac.zza(boolean, Object)>
		zzbnp = latlngbounds;
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:putfield        #71  <Field LatLngBounds zzbnp>
		return this;
	//   30   60:aload_0         
	//   31   61:areturn         
	}

	public GroundOverlayOptions transparency(float f)
	{
		boolean flag;
		if(f >= 0.0F && f <= 1.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpl           
	//*   3    3:iflt            17
	//*   4    6:fload_1         
	//*   5    7:fconst_1        
	//*   6    8:fcmpg           
	//*   7    9:ifgt            17
			flag = true;
	//    8   12:iconst_1        
	//    9   13:istore_2        
		else
	//*  10   14:goto            19
			flag = false;
	//   11   17:iconst_0        
	//   12   18:istore_2        
		zzac.zzb(flag, "Transparency must be in the range [0..1]");
	//   13   19:iload_2         
	//   14   20:ldc1            #159 <String "Transparency must be in the range [0..1]">
	//   15   22:invokestatic    #123 <Method void zzac.zzb(boolean, Object)>
		zzbpr = f;
	//   16   25:aload_0         
	//   17   26:fload_1         
	//   18   27:putfield        #42  <Field float zzbpr>
		return this;
	//   19   30:aload_0         
	//   20   31:areturn         
	}

	public GroundOverlayOptions visible(boolean flag)
	{
		zzbpj = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #40  <Field boolean zzbpj>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.maps.model.zzd.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #165 <Method void com.google.android.gms.maps.model.zzd.zza(GroundOverlayOptions, Parcel, int)>
	//    4    6:return          
	}

	public GroundOverlayOptions zIndex(float f)
	{
		zzbpi = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #75  <Field float zzbpi>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	IBinder zzJK()
	{
		return zzbpn.zzJm().asBinder();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field BitmapDescriptor zzbpn>
	//    2    4:invokevirtual   #172 <Method IObjectWrapper BitmapDescriptor.zzJm()>
	//    3    7:invokeinterface #177 <Method IBinder IObjectWrapper.asBinder()>
	//    4   12:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzd();
	public static final float NO_DIMENSION = -1F;
	private LatLngBounds zzbnp;
	private float zzbpd;
	private float zzbpi;
	private boolean zzbpj;
	private boolean zzbpk;
	private BitmapDescriptor zzbpn;
	private LatLng zzbpo;
	private float zzbpp;
	private float zzbpq;
	private float zzbpr;
	private float zzbps;
	private float zzbpt;

	static 
	{
	//    0    0:new             #31  <Class zzd>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void zzd()>
	//    3    7:putstatic       #36  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
