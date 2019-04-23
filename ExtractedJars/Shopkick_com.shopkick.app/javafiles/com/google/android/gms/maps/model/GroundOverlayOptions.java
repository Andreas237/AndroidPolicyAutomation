// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzd, BitmapDescriptor, LatLng, LatLngBounds

public final class GroundOverlayOptions extends AbstractSafeParcelable
{

	public GroundOverlayOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void AbstractSafeParcelable()>
		zzcs = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #75  <Field boolean zzcs>
		zzcz = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #77  <Field float zzcz>
		zzda = 0.5F;
	//    8   14:aload_0         
	//    9   15:ldc1            #78  <Float 0.5F>
	//   10   17:putfield        #80  <Field float zzda>
		zzdb = 0.5F;
	//   11   20:aload_0         
	//   12   21:ldc1            #78  <Float 0.5F>
	//   13   23:putfield        #82  <Field float zzdb>
		zzct = false;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #84  <Field boolean zzct>
	//   17   31:return          
	}

	GroundOverlayOptions(IBinder ibinder, LatLng latlng, float f, float f1, LatLngBounds latlngbounds, float f2, float f3, 
			boolean flag, float f4, float f5, float f6, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void AbstractSafeParcelable()>
		zzcs = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #75  <Field boolean zzcs>
		zzcz = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #77  <Field float zzcz>
		zzda = 0.5F;
	//    8   14:aload_0         
	//    9   15:ldc1            #78  <Float 0.5F>
	//   10   17:putfield        #80  <Field float zzda>
		zzdb = 0.5F;
	//   11   20:aload_0         
	//   12   21:ldc1            #78  <Float 0.5F>
	//   13   23:putfield        #82  <Field float zzdb>
		zzct = false;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #84  <Field boolean zzct>
		zzcw = new BitmapDescriptor(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(ibinder));
	//   17   31:aload_0         
	//   18   32:new             #89  <Class BitmapDescriptor>
	//   19   35:dup             
	//   20   36:aload_1         
	//   21   37:invokestatic    #95  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   22   40:invokespecial   #98  <Method void BitmapDescriptor(IObjectWrapper)>
	//   23   43:putfield        #100 <Field BitmapDescriptor zzcw>
		zzcx = latlng;
	//   24   46:aload_0         
	//   25   47:aload_2         
	//   26   48:putfield        #102 <Field LatLng zzcx>
		width = f;
	//   27   51:aload_0         
	//   28   52:fload_3         
	//   29   53:putfield        #104 <Field float width>
		height = f1;
	//   30   56:aload_0         
	//   31   57:fload           4
	//   32   59:putfield        #106 <Field float height>
		zzcy = latlngbounds;
	//   33   62:aload_0         
	//   34   63:aload           5
	//   35   65:putfield        #108 <Field LatLngBounds zzcy>
		bearing = f2;
	//   36   68:aload_0         
	//   37   69:fload           6
	//   38   71:putfield        #110 <Field float bearing>
		zzcr = f3;
	//   39   74:aload_0         
	//   40   75:fload           7
	//   41   77:putfield        #112 <Field float zzcr>
		zzcs = flag;
	//   42   80:aload_0         
	//   43   81:iload           8
	//   44   83:putfield        #75  <Field boolean zzcs>
		zzcz = f4;
	//   45   86:aload_0         
	//   46   87:fload           9
	//   47   89:putfield        #77  <Field float zzcz>
		zzda = f5;
	//   48   92:aload_0         
	//   49   93:fload           10
	//   50   95:putfield        #80  <Field float zzda>
		zzdb = f6;
	//   51   98:aload_0         
	//   52   99:fload           11
	//   53  101:putfield        #82  <Field float zzdb>
		zzct = flag1;
	//   54  104:aload_0         
	//   55  105:iload           12
	//   56  107:putfield        #84  <Field boolean zzct>
	//   57  110:return          
	}

	private final GroundOverlayOptions zza(LatLng latlng, float f, float f1)
	{
		zzcx = latlng;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #102 <Field LatLng zzcx>
		width = f;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #104 <Field float width>
		height = f1;
	//    6   10:aload_0         
	//    7   11:fload_3         
	//    8   12:putfield        #106 <Field float height>
		return this;
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public final GroundOverlayOptions anchor(float f, float f1)
	{
		zzda = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #80  <Field float zzda>
		zzdb = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #82  <Field float zzdb>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public final GroundOverlayOptions bearing(float f)
	{
		bearing = (f % 360F + 360F) % 360F;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:ldc1            #120 <Float 360F>
	//    3    4:frem            
	//    4    5:ldc1            #120 <Float 360F>
	//    5    7:fadd            
	//    6    8:ldc1            #120 <Float 360F>
	//    7   10:frem            
	//    8   11:putfield        #110 <Field float bearing>
		return this;
	//    9   14:aload_0         
	//   10   15:areturn         
	}

	public final GroundOverlayOptions clickable(boolean flag)
	{
		zzct = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #84  <Field boolean zzct>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final float getAnchorU()
	{
		return zzda;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field float zzda>
	//    2    4:freturn         
	}

	public final float getAnchorV()
	{
		return zzdb;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field float zzdb>
	//    2    4:freturn         
	}

	public final float getBearing()
	{
		return bearing;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field float bearing>
	//    2    4:freturn         
	}

	public final LatLngBounds getBounds()
	{
		return zzcy;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field LatLngBounds zzcy>
	//    2    4:areturn         
	}

	public final float getHeight()
	{
		return height;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field float height>
	//    2    4:freturn         
	}

	public final BitmapDescriptor getImage()
	{
		return zzcw;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field BitmapDescriptor zzcw>
	//    2    4:areturn         
	}

	public final LatLng getLocation()
	{
		return zzcx;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field LatLng zzcx>
	//    2    4:areturn         
	}

	public final float getTransparency()
	{
		return zzcz;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field float zzcz>
	//    2    4:freturn         
	}

	public final float getWidth()
	{
		return width;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field float width>
	//    2    4:freturn         
	}

	public final float getZIndex()
	{
		return zzcr;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field float zzcr>
	//    2    4:freturn         
	}

	public final GroundOverlayOptions image(BitmapDescriptor bitmapdescriptor)
	{
		Preconditions.checkNotNull(((Object) (bitmapdescriptor)), "imageDescriptor must not be null");
	//    0    0:aload_1         
	//    1    1:ldc1            #131 <String "imageDescriptor must not be null">
	//    2    3:invokestatic    #137 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		zzcw = bitmapdescriptor;
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:putfield        #100 <Field BitmapDescriptor zzcw>
		return this;
	//    7   12:aload_0         
	//    8   13:areturn         
	}

	public final boolean isClickable()
	{
		return zzct;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field boolean zzct>
	//    2    4:ireturn         
	}

	public final boolean isVisible()
	{
		return zzcs;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field boolean zzcs>
	//    2    4:ireturn         
	}

	public final GroundOverlayOptions position(LatLng latlng, float f)
	{
		LatLngBounds latlngbounds = zzcy;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field LatLngBounds zzcy>
	//    2    4:astore          5
		boolean flag1 = true;
	//    3    6:iconst_1        
	//    4    7:istore          4
		boolean flag;
		if(latlngbounds == null)
	//*   5    9:aload           5
	//*   6   11:ifnonnull       19
			flag = true;
	//    7   14:iconst_1        
	//    8   15:istore_3        
		else
	//*   9   16:goto            21
			flag = false;
	//   10   19:iconst_0        
	//   11   20:istore_3        
		Preconditions.checkState(flag, "Position has already been set using positionFromBounds");
	//   12   21:iload_3         
	//   13   22:ldc1            #142 <String "Position has already been set using positionFromBounds">
	//   14   24:invokestatic    #146 <Method void Preconditions.checkState(boolean, Object)>
		if(latlng != null)
	//*  15   27:aload_1         
	//*  16   28:ifnull          36
			flag = true;
	//   17   31:iconst_1        
	//   18   32:istore_3        
		else
	//*  19   33:goto            38
			flag = false;
	//   20   36:iconst_0        
	//   21   37:istore_3        
		Preconditions.checkArgument(flag, "Location must be specified");
	//   22   38:iload_3         
	//   23   39:ldc1            #148 <String "Location must be specified">
	//   24   41:invokestatic    #151 <Method void Preconditions.checkArgument(boolean, Object)>
		if(f >= 0.0F)
	//*  25   44:fload_2         
	//*  26   45:fconst_0        
	//*  27   46:fcmpl           
	//*  28   47:iflt            56
			flag = flag1;
	//   29   50:iload           4
	//   30   52:istore_3        
		else
	//*  31   53:goto            58
			flag = false;
	//   32   56:iconst_0        
	//   33   57:istore_3        
		Preconditions.checkArgument(flag, "Width must be non-negative");
	//   34   58:iload_3         
	//   35   59:ldc1            #153 <String "Width must be non-negative">
	//   36   61:invokestatic    #151 <Method void Preconditions.checkArgument(boolean, Object)>
		return zza(latlng, f, -1F);
	//   37   64:aload_0         
	//   38   65:aload_1         
	//   39   66:fload_2         
	//   40   67:ldc1            #16  <Float -1F>
	//   41   69:invokespecial   #155 <Method GroundOverlayOptions zza(LatLng, float, float)>
	//   42   72:areturn         
	}

	public final GroundOverlayOptions position(LatLng latlng, float f, float f1)
	{
		LatLngBounds latlngbounds = zzcy;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field LatLngBounds zzcy>
	//    2    4:astore          6
		boolean flag1 = true;
	//    3    6:iconst_1        
	//    4    7:istore          5
		boolean flag;
		if(latlngbounds == null)
	//*   5    9:aload           6
	//*   6   11:ifnonnull       20
			flag = true;
	//    7   14:iconst_1        
	//    8   15:istore          4
		else
	//*   9   17:goto            23
			flag = false;
	//   10   20:iconst_0        
	//   11   21:istore          4
		Preconditions.checkState(flag, "Position has already been set using positionFromBounds");
	//   12   23:iload           4
	//   13   25:ldc1            #142 <String "Position has already been set using positionFromBounds">
	//   14   27:invokestatic    #146 <Method void Preconditions.checkState(boolean, Object)>
		if(latlng != null)
	//*  15   30:aload_1         
	//*  16   31:ifnull          40
			flag = true;
	//   17   34:iconst_1        
	//   18   35:istore          4
		else
	//*  19   37:goto            43
			flag = false;
	//   20   40:iconst_0        
	//   21   41:istore          4
		Preconditions.checkArgument(flag, "Location must be specified");
	//   22   43:iload           4
	//   23   45:ldc1            #148 <String "Location must be specified">
	//   24   47:invokestatic    #151 <Method void Preconditions.checkArgument(boolean, Object)>
		if(f >= 0.0F)
	//*  25   50:fload_2         
	//*  26   51:fconst_0        
	//*  27   52:fcmpl           
	//*  28   53:iflt            62
			flag = true;
	//   29   56:iconst_1        
	//   30   57:istore          4
		else
	//*  31   59:goto            65
			flag = false;
	//   32   62:iconst_0        
	//   33   63:istore          4
		Preconditions.checkArgument(flag, "Width must be non-negative");
	//   34   65:iload           4
	//   35   67:ldc1            #153 <String "Width must be non-negative">
	//   36   69:invokestatic    #151 <Method void Preconditions.checkArgument(boolean, Object)>
		if(f1 >= 0.0F)
	//*  37   72:fload_3         
	//*  38   73:fconst_0        
	//*  39   74:fcmpl           
	//*  40   75:iflt            85
			flag = flag1;
	//   41   78:iload           5
	//   42   80:istore          4
		else
	//*  43   82:goto            88
			flag = false;
	//   44   85:iconst_0        
	//   45   86:istore          4
		Preconditions.checkArgument(flag, "Height must be non-negative");
	//   46   88:iload           4
	//   47   90:ldc1            #157 <String "Height must be non-negative">
	//   48   92:invokestatic    #151 <Method void Preconditions.checkArgument(boolean, Object)>
		return zza(latlng, f, f1);
	//   49   95:aload_0         
	//   50   96:aload_1         
	//   51   97:fload_2         
	//   52   98:fload_3         
	//   53   99:invokespecial   #155 <Method GroundOverlayOptions zza(LatLng, float, float)>
	//   54  102:areturn         
	}

	public final GroundOverlayOptions positionFromBounds(LatLngBounds latlngbounds)
	{
		boolean flag;
		if(zzcx == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field LatLng zzcx>
	//*   2    4:ifnonnull       12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		String s = String.valueOf(((Object) (zzcx)));
	//    8   14:aload_0         
	//    9   15:getfield        #102 <Field LatLng zzcx>
	//   10   18:invokestatic    #165 <Method String String.valueOf(Object)>
	//   11   21:astore_3        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 46);
	//   12   22:new             #167 <Class StringBuilder>
	//   13   25:dup             
	//   14   26:aload_3         
	//   15   27:invokestatic    #165 <Method String String.valueOf(Object)>
	//   16   30:invokevirtual   #171 <Method int String.length()>
	//   17   33:bipush          46
	//   18   35:iadd            
	//   19   36:invokespecial   #174 <Method void StringBuilder(int)>
	//   20   39:astore          4
		stringbuilder.append("Position has already been set using position: ");
	//   21   41:aload           4
	//   22   43:ldc1            #176 <String "Position has already been set using position: ">
	//   23   45:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   24   48:pop             
		stringbuilder.append(s);
	//   25   49:aload           4
	//   26   51:aload_3         
	//   27   52:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   28   55:pop             
		Preconditions.checkState(flag, ((Object) (stringbuilder.toString())));
	//   29   56:iload_2         
	//   30   57:aload           4
	//   31   59:invokevirtual   #184 <Method String StringBuilder.toString()>
	//   32   62:invokestatic    #146 <Method void Preconditions.checkState(boolean, Object)>
		zzcy = latlngbounds;
	//   33   65:aload_0         
	//   34   66:aload_1         
	//   35   67:putfield        #108 <Field LatLngBounds zzcy>
		return this;
	//   36   70:aload_0         
	//   37   71:areturn         
	}

	public final GroundOverlayOptions transparency(float f)
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
		Preconditions.checkArgument(flag, "Transparency must be in the range [0..1]");
	//   13   19:iload_2         
	//   14   20:ldc1            #187 <String "Transparency must be in the range [0..1]">
	//   15   22:invokestatic    #151 <Method void Preconditions.checkArgument(boolean, Object)>
		zzcz = f;
	//   16   25:aload_0         
	//   17   26:fload_1         
	//   18   27:putfield        #77  <Field float zzcz>
		return this;
	//   19   30:aload_0         
	//   20   31:areturn         
	}

	public final GroundOverlayOptions visible(boolean flag)
	{
		zzcs = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #75  <Field boolean zzcs>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #196 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeIBinder(parcel, 2, zzcw.zza().asBinder(), false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #100 <Field BitmapDescriptor zzcw>
	//    7   11:invokevirtual   #199 <Method IObjectWrapper BitmapDescriptor.zza()>
	//    8   14:invokeinterface #205 <Method IBinder IObjectWrapper.asBinder()>
	//    9   19:iconst_0        
	//   10   20:invokestatic    #209 <Method void SafeParcelWriter.writeIBinder(Parcel, int, IBinder, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 3, ((android.os.Parcelable) (getLocation())), i, false);
	//   11   23:aload_1         
	//   12   24:iconst_3        
	//   13   25:aload_0         
	//   14   26:invokevirtual   #211 <Method LatLng getLocation()>
	//   15   29:iload_2         
	//   16   30:iconst_0        
	//   17   31:invokestatic    #215 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeFloat(parcel, 4, getWidth());
	//   18   34:aload_1         
	//   19   35:iconst_4        
	//   20   36:aload_0         
	//   21   37:invokevirtual   #217 <Method float getWidth()>
	//   22   40:invokestatic    #221 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeFloat(parcel, 5, getHeight());
	//   23   43:aload_1         
	//   24   44:iconst_5        
	//   25   45:aload_0         
	//   26   46:invokevirtual   #223 <Method float getHeight()>
	//   27   49:invokestatic    #221 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeParcelable(parcel, 6, ((android.os.Parcelable) (getBounds())), i, false);
	//   28   52:aload_1         
	//   29   53:bipush          6
	//   30   55:aload_0         
	//   31   56:invokevirtual   #225 <Method LatLngBounds getBounds()>
	//   32   59:iload_2         
	//   33   60:iconst_0        
	//   34   61:invokestatic    #215 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeFloat(parcel, 7, getBearing());
	//   35   64:aload_1         
	//   36   65:bipush          7
	//   37   67:aload_0         
	//   38   68:invokevirtual   #227 <Method float getBearing()>
	//   39   71:invokestatic    #221 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeFloat(parcel, 8, getZIndex());
	//   40   74:aload_1         
	//   41   75:bipush          8
	//   42   77:aload_0         
	//   43   78:invokevirtual   #229 <Method float getZIndex()>
	//   44   81:invokestatic    #221 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
	//   45   84:aload_1         
	//   46   85:bipush          9
	//   47   87:aload_0         
	//   48   88:invokevirtual   #231 <Method boolean isVisible()>
	//   49   91:invokestatic    #235 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeFloat(parcel, 10, getTransparency());
	//   50   94:aload_1         
	//   51   95:bipush          10
	//   52   97:aload_0         
	//   53   98:invokevirtual   #237 <Method float getTransparency()>
	//   54  101:invokestatic    #221 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeFloat(parcel, 11, getAnchorU());
	//   55  104:aload_1         
	//   56  105:bipush          11
	//   57  107:aload_0         
	//   58  108:invokevirtual   #239 <Method float getAnchorU()>
	//   59  111:invokestatic    #221 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeFloat(parcel, 12, getAnchorV());
	//   60  114:aload_1         
	//   61  115:bipush          12
	//   62  117:aload_0         
	//   63  118:invokevirtual   #241 <Method float getAnchorV()>
	//   64  121:invokestatic    #221 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeBoolean(parcel, 13, isClickable());
	//   65  124:aload_1         
	//   66  125:bipush          13
	//   67  127:aload_0         
	//   68  128:invokevirtual   #243 <Method boolean isClickable()>
	//   69  131:invokestatic    #235 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   70  134:aload_1         
	//   71  135:iload_3         
	//   72  136:invokestatic    #246 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   73  139:return          
	}

	public final GroundOverlayOptions zIndex(float f)
	{
		zzcr = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #112 <Field float zzcr>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzd();
	public static final float NO_DIMENSION = -1F;
	private float bearing;
	private float height;
	private float width;
	private float zzcr;
	private boolean zzcs;
	private boolean zzct;
	private BitmapDescriptor zzcw;
	private LatLng zzcx;
	private LatLngBounds zzcy;
	private float zzcz;
	private float zzda;
	private float zzdb;

	static 
	{
	//    0    0:new             #66  <Class zzd>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void zzd()>
	//    3    7:putstatic       #71  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
