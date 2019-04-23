// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzh, BitmapDescriptor, LatLng

public final class MarkerOptions extends AbstractSafeParcelable
{

	public MarkerOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void AbstractSafeParcelable()>
		zzda = 0.5F;
	//    2    4:aload_0         
	//    3    5:ldc1            #80  <Float 0.5F>
	//    4    7:putfield        #82  <Field float zzda>
		zzdb = 1.0F;
	//    5   10:aload_0         
	//    6   11:fconst_1        
	//    7   12:putfield        #84  <Field float zzdb>
		zzcs = true;
	//    8   15:aload_0         
	//    9   16:iconst_1        
	//   10   17:putfield        #86  <Field boolean zzcs>
		zzdq = false;
	//   11   20:aload_0         
	//   12   21:iconst_0        
	//   13   22:putfield        #88  <Field boolean zzdq>
		zzdr = 0.0F;
	//   14   25:aload_0         
	//   15   26:fconst_0        
	//   16   27:putfield        #90  <Field float zzdr>
		zzds = 0.5F;
	//   17   30:aload_0         
	//   18   31:ldc1            #80  <Float 0.5F>
	//   19   33:putfield        #92  <Field float zzds>
		zzdt = 0.0F;
	//   20   36:aload_0         
	//   21   37:fconst_0        
	//   22   38:putfield        #94  <Field float zzdt>
		alpha = 1.0F;
	//   23   41:aload_0         
	//   24   42:fconst_1        
	//   25   43:putfield        #96  <Field float alpha>
	//   26   46:return          
	}

	MarkerOptions(LatLng latlng, String s, String s1, IBinder ibinder, float f, float f1, boolean flag, 
			boolean flag1, boolean flag2, float f2, float f3, float f4, float f5, float f6)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void AbstractSafeParcelable()>
		zzda = 0.5F;
	//    2    4:aload_0         
	//    3    5:ldc1            #80  <Float 0.5F>
	//    4    7:putfield        #82  <Field float zzda>
		zzdb = 1.0F;
	//    5   10:aload_0         
	//    6   11:fconst_1        
	//    7   12:putfield        #84  <Field float zzdb>
		zzcs = true;
	//    8   15:aload_0         
	//    9   16:iconst_1        
	//   10   17:putfield        #86  <Field boolean zzcs>
		zzdq = false;
	//   11   20:aload_0         
	//   12   21:iconst_0        
	//   13   22:putfield        #88  <Field boolean zzdq>
		zzdr = 0.0F;
	//   14   25:aload_0         
	//   15   26:fconst_0        
	//   16   27:putfield        #90  <Field float zzdr>
		zzds = 0.5F;
	//   17   30:aload_0         
	//   18   31:ldc1            #80  <Float 0.5F>
	//   19   33:putfield        #92  <Field float zzds>
		zzdt = 0.0F;
	//   20   36:aload_0         
	//   21   37:fconst_0        
	//   22   38:putfield        #94  <Field float zzdt>
		alpha = 1.0F;
	//   23   41:aload_0         
	//   24   42:fconst_1        
	//   25   43:putfield        #96  <Field float alpha>
		position = latlng;
	//   26   46:aload_0         
	//   27   47:aload_1         
	//   28   48:putfield        #101 <Field LatLng position>
		zzdm = s;
	//   29   51:aload_0         
	//   30   52:aload_2         
	//   31   53:putfield        #103 <Field String zzdm>
		zzdn = s1;
	//   32   56:aload_0         
	//   33   57:aload_3         
	//   34   58:putfield        #105 <Field String zzdn>
		if(ibinder == null)
	//*  35   61:aload           4
	//*  36   63:ifnonnull       71
			latlng = null;
	//   37   66:aconst_null     
	//   38   67:astore_1        
		else
	//*  39   68:goto            84
			latlng = ((LatLng) (new BitmapDescriptor(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(ibinder))));
	//   40   71:new             #107 <Class BitmapDescriptor>
	//   41   74:dup             
	//   42   75:aload           4
	//   43   77:invokestatic    #113 <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   44   80:invokespecial   #116 <Method void BitmapDescriptor(IObjectWrapper)>
	//   45   83:astore_1        
		zzdo = ((BitmapDescriptor) (latlng));
	//   46   84:aload_0         
	//   47   85:aload_1         
	//   48   86:putfield        #118 <Field BitmapDescriptor zzdo>
		zzda = f;
	//   49   89:aload_0         
	//   50   90:fload           5
	//   51   92:putfield        #82  <Field float zzda>
		zzdb = f1;
	//   52   95:aload_0         
	//   53   96:fload           6
	//   54   98:putfield        #84  <Field float zzdb>
		zzdp = flag;
	//   55  101:aload_0         
	//   56  102:iload           7
	//   57  104:putfield        #120 <Field boolean zzdp>
		zzcs = flag1;
	//   58  107:aload_0         
	//   59  108:iload           8
	//   60  110:putfield        #86  <Field boolean zzcs>
		zzdq = flag2;
	//   61  113:aload_0         
	//   62  114:iload           9
	//   63  116:putfield        #88  <Field boolean zzdq>
		zzdr = f2;
	//   64  119:aload_0         
	//   65  120:fload           10
	//   66  122:putfield        #90  <Field float zzdr>
		zzds = f3;
	//   67  125:aload_0         
	//   68  126:fload           11
	//   69  128:putfield        #92  <Field float zzds>
		zzdt = f4;
	//   70  131:aload_0         
	//   71  132:fload           12
	//   72  134:putfield        #94  <Field float zzdt>
		alpha = f5;
	//   73  137:aload_0         
	//   74  138:fload           13
	//   75  140:putfield        #96  <Field float alpha>
		zzcr = f6;
	//   76  143:aload_0         
	//   77  144:fload           14
	//   78  146:putfield        #122 <Field float zzcr>
	//   79  149:return          
	}

	public final MarkerOptions alpha(float f)
	{
		alpha = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #96  <Field float alpha>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final MarkerOptions anchor(float f, float f1)
	{
		zzda = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #82  <Field float zzda>
		zzdb = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #84  <Field float zzdb>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public final MarkerOptions draggable(boolean flag)
	{
		zzdp = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #120 <Field boolean zzdp>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final MarkerOptions flat(boolean flag)
	{
		zzdq = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #88  <Field boolean zzdq>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final float getAlpha()
	{
		return alpha;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field float alpha>
	//    2    4:freturn         
	}

	public final float getAnchorU()
	{
		return zzda;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field float zzda>
	//    2    4:freturn         
	}

	public final float getAnchorV()
	{
		return zzdb;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field float zzdb>
	//    2    4:freturn         
	}

	public final BitmapDescriptor getIcon()
	{
		return zzdo;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field BitmapDescriptor zzdo>
	//    2    4:areturn         
	}

	public final float getInfoWindowAnchorU()
	{
		return zzds;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field float zzds>
	//    2    4:freturn         
	}

	public final float getInfoWindowAnchorV()
	{
		return zzdt;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field float zzdt>
	//    2    4:freturn         
	}

	public final LatLng getPosition()
	{
		return position;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field LatLng position>
	//    2    4:areturn         
	}

	public final float getRotation()
	{
		return zzdr;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field float zzdr>
	//    2    4:freturn         
	}

	public final String getSnippet()
	{
		return zzdn;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field String zzdn>
	//    2    4:areturn         
	}

	public final String getTitle()
	{
		return zzdm;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field String zzdm>
	//    2    4:areturn         
	}

	public final float getZIndex()
	{
		return zzcr;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field float zzcr>
	//    2    4:freturn         
	}

	public final MarkerOptions icon(BitmapDescriptor bitmapdescriptor)
	{
		zzdo = bitmapdescriptor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #118 <Field BitmapDescriptor zzdo>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final MarkerOptions infoWindowAnchor(float f, float f1)
	{
		zzds = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #92  <Field float zzds>
		zzdt = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #94  <Field float zzdt>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public final boolean isDraggable()
	{
		return zzdp;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field boolean zzdp>
	//    2    4:ireturn         
	}

	public final boolean isFlat()
	{
		return zzdq;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field boolean zzdq>
	//    2    4:ireturn         
	}

	public final boolean isVisible()
	{
		return zzcs;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field boolean zzcs>
	//    2    4:ireturn         
	}

	public final MarkerOptions position(LatLng latlng)
	{
		if(latlng != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
		{
			position = latlng;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #101 <Field LatLng position>
			return this;
	//    5    9:aload_0         
	//    6   10:areturn         
		} else
		{
			throw new IllegalArgumentException("latlng cannot be null - a position is required.");
	//    7   11:new             #144 <Class IllegalArgumentException>
	//    8   14:dup             
	//    9   15:ldc1            #146 <String "latlng cannot be null - a position is required.">
	//   10   17:invokespecial   #149 <Method void IllegalArgumentException(String)>
	//   11   20:athrow          
		}
	}

	public final MarkerOptions rotation(float f)
	{
		zzdr = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #90  <Field float zzdr>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final MarkerOptions snippet(String s)
	{
		zzdn = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #105 <Field String zzdn>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final MarkerOptions title(String s)
	{
		zzdm = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #103 <Field String zzdm>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final MarkerOptions visible(boolean flag)
	{
		zzcs = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #86  <Field boolean zzcs>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #162 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeParcelable(parcel, 2, ((android.os.Parcelable) (getPosition())), i, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #164 <Method LatLng getPosition()>
	//    7   11:iload_2         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #168 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeString(parcel, 3, getTitle(), false);
	//   10   16:aload_1         
	//   11   17:iconst_3        
	//   12   18:aload_0         
	//   13   19:invokevirtual   #170 <Method String getTitle()>
	//   14   22:iconst_0        
	//   15   23:invokestatic    #174 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 4, getSnippet(), false);
	//   16   26:aload_1         
	//   17   27:iconst_4        
	//   18   28:aload_0         
	//   19   29:invokevirtual   #176 <Method String getSnippet()>
	//   20   32:iconst_0        
	//   21   33:invokestatic    #174 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		Object obj = ((Object) (zzdo));
	//   22   36:aload_0         
	//   23   37:getfield        #118 <Field BitmapDescriptor zzdo>
	//   24   40:astore          4
		if(obj == null)
	//*  25   42:aload           4
	//*  26   44:ifnonnull       53
			obj = null;
	//   27   47:aconst_null     
	//   28   48:astore          4
		else
	//*  29   50:goto            65
			obj = ((Object) (((BitmapDescriptor) (obj)).zza().asBinder()));
	//   30   53:aload           4
	//   31   55:invokevirtual   #180 <Method IObjectWrapper BitmapDescriptor.zza()>
	//   32   58:invokeinterface #186 <Method IBinder IObjectWrapper.asBinder()>
	//   33   63:astore          4
		SafeParcelWriter.writeIBinder(parcel, 5, ((IBinder) (obj)), false);
	//   34   65:aload_1         
	//   35   66:iconst_5        
	//   36   67:aload           4
	//   37   69:iconst_0        
	//   38   70:invokestatic    #190 <Method void SafeParcelWriter.writeIBinder(Parcel, int, IBinder, boolean)>
		SafeParcelWriter.writeFloat(parcel, 6, getAnchorU());
	//   39   73:aload_1         
	//   40   74:bipush          6
	//   41   76:aload_0         
	//   42   77:invokevirtual   #192 <Method float getAnchorU()>
	//   43   80:invokestatic    #196 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeFloat(parcel, 7, getAnchorV());
	//   44   83:aload_1         
	//   45   84:bipush          7
	//   46   86:aload_0         
	//   47   87:invokevirtual   #198 <Method float getAnchorV()>
	//   48   90:invokestatic    #196 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeBoolean(parcel, 8, isDraggable());
	//   49   93:aload_1         
	//   50   94:bipush          8
	//   51   96:aload_0         
	//   52   97:invokevirtual   #200 <Method boolean isDraggable()>
	//   53  100:invokestatic    #204 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
	//   54  103:aload_1         
	//   55  104:bipush          9
	//   56  106:aload_0         
	//   57  107:invokevirtual   #206 <Method boolean isVisible()>
	//   58  110:invokestatic    #204 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 10, isFlat());
	//   59  113:aload_1         
	//   60  114:bipush          10
	//   61  116:aload_0         
	//   62  117:invokevirtual   #208 <Method boolean isFlat()>
	//   63  120:invokestatic    #204 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeFloat(parcel, 11, getRotation());
	//   64  123:aload_1         
	//   65  124:bipush          11
	//   66  126:aload_0         
	//   67  127:invokevirtual   #210 <Method float getRotation()>
	//   68  130:invokestatic    #196 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeFloat(parcel, 12, getInfoWindowAnchorU());
	//   69  133:aload_1         
	//   70  134:bipush          12
	//   71  136:aload_0         
	//   72  137:invokevirtual   #212 <Method float getInfoWindowAnchorU()>
	//   73  140:invokestatic    #196 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeFloat(parcel, 13, getInfoWindowAnchorV());
	//   74  143:aload_1         
	//   75  144:bipush          13
	//   76  146:aload_0         
	//   77  147:invokevirtual   #214 <Method float getInfoWindowAnchorV()>
	//   78  150:invokestatic    #196 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeFloat(parcel, 14, getAlpha());
	//   79  153:aload_1         
	//   80  154:bipush          14
	//   81  156:aload_0         
	//   82  157:invokevirtual   #216 <Method float getAlpha()>
	//   83  160:invokestatic    #196 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeFloat(parcel, 15, getZIndex());
	//   84  163:aload_1         
	//   85  164:bipush          15
	//   86  166:aload_0         
	//   87  167:invokevirtual   #218 <Method float getZIndex()>
	//   88  170:invokestatic    #196 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   89  173:aload_1         
	//   90  174:iload_3         
	//   91  175:invokestatic    #221 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   92  178:return          
	}

	public final MarkerOptions zIndex(float f)
	{
		zzcr = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #122 <Field float zzcr>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzh();
	private float alpha;
	private LatLng position;
	private float zzcr;
	private boolean zzcs;
	private float zzda;
	private float zzdb;
	private String zzdm;
	private String zzdn;
	private BitmapDescriptor zzdo;
	private boolean zzdp;
	private boolean zzdq;
	private float zzdr;
	private float zzds;
	private float zzdt;

	static 
	{
	//    0    0:new             #72  <Class zzh>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void zzh()>
	//    3    7:putstatic       #77  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
