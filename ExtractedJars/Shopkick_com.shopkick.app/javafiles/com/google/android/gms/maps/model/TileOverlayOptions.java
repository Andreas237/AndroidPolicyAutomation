// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.maps.zzaf;
import com.google.android.gms.internal.maps.zzag;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzu, zzs, zzt, TileProvider

public final class TileOverlayOptions extends AbstractSafeParcelable
{

	public TileOverlayOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void AbstractSafeParcelable()>
		zzcs = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #53  <Field boolean zzcs>
		zzej = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #55  <Field boolean zzej>
		zzcz = 0.0F;
	//    8   14:aload_0         
	//    9   15:fconst_0        
	//   10   16:putfield        #57  <Field float zzcz>
	//   11   19:return          
	}

	TileOverlayOptions(IBinder ibinder, boolean flag, float f, boolean flag1, float f1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void AbstractSafeParcelable()>
		zzcs = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #53  <Field boolean zzcs>
		zzej = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #55  <Field boolean zzej>
		zzcz = 0.0F;
	//    8   14:aload_0         
	//    9   15:fconst_0        
	//   10   16:putfield        #57  <Field float zzcz>
		zzeh = zzag.zzk(ibinder);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokestatic    #66  <Method zzaf zzag.zzk(IBinder)>
	//   14   24:putfield        #68  <Field zzaf zzeh>
		if(zzeh == null)
	//*  15   27:aload_0         
	//*  16   28:getfield        #68  <Field zzaf zzeh>
	//*  17   31:ifnonnull       39
			ibinder = null;
	//   18   34:aconst_null     
	//   19   35:astore_1        
		else
	//*  20   36:goto            48
			ibinder = ((IBinder) (new zzs(this)));
	//   21   39:new             #70  <Class zzs>
	//   22   42:dup             
	//   23   43:aload_0         
	//   24   44:invokespecial   #73  <Method void zzs(TileOverlayOptions)>
	//   25   47:astore_1        
		zzei = ((TileProvider) (ibinder));
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:putfield        #75  <Field TileProvider zzei>
		zzcs = flag;
	//   29   53:aload_0         
	//   30   54:iload_2         
	//   31   55:putfield        #53  <Field boolean zzcs>
		zzcr = f;
	//   32   58:aload_0         
	//   33   59:fload_3         
	//   34   60:putfield        #77  <Field float zzcr>
		zzej = flag1;
	//   35   63:aload_0         
	//   36   64:iload           4
	//   37   66:putfield        #55  <Field boolean zzej>
		zzcz = f1;
	//   38   69:aload_0         
	//   39   70:fload           5
	//   40   72:putfield        #57  <Field float zzcz>
	//   41   75:return          
	}

	static zzaf zza(TileOverlayOptions tileoverlayoptions)
	{
		return tileoverlayoptions.zzeh;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field zzaf zzeh>
	//    2    4:areturn         
	}

	public final TileOverlayOptions fadeIn(boolean flag)
	{
		zzej = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #55  <Field boolean zzej>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final boolean getFadeIn()
	{
		return zzej;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field boolean zzej>
	//    2    4:ireturn         
	}

	public final TileProvider getTileProvider()
	{
		return zzei;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field TileProvider zzei>
	//    2    4:areturn         
	}

	public final float getTransparency()
	{
		return zzcz;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field float zzcz>
	//    2    4:freturn         
	}

	public final float getZIndex()
	{
		return zzcr;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field float zzcr>
	//    2    4:freturn         
	}

	public final boolean isVisible()
	{
		return zzcs;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field boolean zzcs>
	//    2    4:ireturn         
	}

	public final TileOverlayOptions tileProvider(TileProvider tileprovider)
	{
		zzei = tileprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #75  <Field TileProvider zzei>
		if(zzei == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #75  <Field TileProvider zzei>
	//*   5    9:ifnonnull       17
			tileprovider = null;
	//    6   12:aconst_null     
	//    7   13:astore_1        
		else
	//*   8   14:goto            27
			tileprovider = ((TileProvider) (new zzt(this, tileprovider)));
	//    9   17:new             #91  <Class zzt>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #94  <Method void zzt(TileOverlayOptions, TileProvider)>
	//   14   26:astore_1        
		zzeh = ((zzaf) (tileprovider));
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:putfield        #68  <Field zzaf zzeh>
		return this;
	//   18   32:aload_0         
	//   19   33:areturn         
	}

	public final TileOverlayOptions transparency(float f)
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
	//   14   20:ldc1            #98  <String "Transparency must be in the range [0..1]">
	//   15   22:invokestatic    #104 <Method void Preconditions.checkArgument(boolean, Object)>
		zzcz = f;
	//   16   25:aload_0         
	//   17   26:fload_1         
	//   18   27:putfield        #57  <Field float zzcz>
		return this;
	//   19   30:aload_0         
	//   20   31:areturn         
	}

	public final TileOverlayOptions visible(boolean flag)
	{
		zzcs = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #53  <Field boolean zzcs>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #113 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeIBinder(parcel, 2, zzeh.asBinder(), false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #68  <Field zzaf zzeh>
	//    7   11:invokeinterface #119 <Method IBinder zzaf.asBinder()>
	//    8   16:iconst_0        
	//    9   17:invokestatic    #123 <Method void SafeParcelWriter.writeIBinder(Parcel, int, IBinder, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 3, isVisible());
	//   10   20:aload_1         
	//   11   21:iconst_3        
	//   12   22:aload_0         
	//   13   23:invokevirtual   #125 <Method boolean isVisible()>
	//   14   26:invokestatic    #129 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeFloat(parcel, 4, getZIndex());
	//   15   29:aload_1         
	//   16   30:iconst_4        
	//   17   31:aload_0         
	//   18   32:invokevirtual   #131 <Method float getZIndex()>
	//   19   35:invokestatic    #135 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeBoolean(parcel, 5, getFadeIn());
	//   20   38:aload_1         
	//   21   39:iconst_5        
	//   22   40:aload_0         
	//   23   41:invokevirtual   #137 <Method boolean getFadeIn()>
	//   24   44:invokestatic    #129 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeFloat(parcel, 6, getTransparency());
	//   25   47:aload_1         
	//   26   48:bipush          6
	//   27   50:aload_0         
	//   28   51:invokevirtual   #139 <Method float getTransparency()>
	//   29   54:invokestatic    #135 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   30   57:aload_1         
	//   31   58:iload_2         
	//   32   59:invokestatic    #142 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   33   62:return          
	}

	public final TileOverlayOptions zIndex(float f)
	{
		zzcr = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #77  <Field float zzcr>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzu();
	private float zzcr;
	private boolean zzcs;
	private float zzcz;
	private zzaf zzeh;
	private TileProvider zzei;
	private boolean zzej;

	static 
	{
	//    0    0:new             #44  <Class zzu>
	//    1    3:dup             
	//    2    4:invokespecial   #47  <Method void zzu()>
	//    3    7:putstatic       #49  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
