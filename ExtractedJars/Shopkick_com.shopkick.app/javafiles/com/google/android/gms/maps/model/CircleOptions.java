// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzc, LatLng

public final class CircleOptions extends AbstractSafeParcelable
{

	public CircleOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void AbstractSafeParcelable()>
		zzco = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #64  <Field LatLng zzco>
		zzcp = 0.0D;
	//    5    9:aload_0         
	//    6   10:dconst_0        
	//    7   11:putfield        #66  <Field double zzcp>
		zzcq = 10F;
	//    8   14:aload_0         
	//    9   15:ldc1            #67  <Float 10F>
	//   10   17:putfield        #69  <Field float zzcq>
		strokeColor = 0xff000000;
	//   11   20:aload_0         
	//   12   21:ldc1            #70  <Int 0xff000000>
	//   13   23:putfield        #72  <Field int strokeColor>
		fillColor = 0;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #74  <Field int fillColor>
		zzcr = 0.0F;
	//   17   31:aload_0         
	//   18   32:fconst_0        
	//   19   33:putfield        #76  <Field float zzcr>
		zzcs = true;
	//   20   36:aload_0         
	//   21   37:iconst_1        
	//   22   38:putfield        #78  <Field boolean zzcs>
		zzct = false;
	//   23   41:aload_0         
	//   24   42:iconst_0        
	//   25   43:putfield        #80  <Field boolean zzct>
		zzcu = null;
	//   26   46:aload_0         
	//   27   47:aconst_null     
	//   28   48:putfield        #82  <Field List zzcu>
	//   29   51:return          
	}

	CircleOptions(LatLng latlng, double d, float f, int i, int j, float f1, 
			boolean flag, boolean flag1, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void AbstractSafeParcelable()>
		zzco = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #64  <Field LatLng zzco>
		zzcp = 0.0D;
	//    5    9:aload_0         
	//    6   10:dconst_0        
	//    7   11:putfield        #66  <Field double zzcp>
		zzcq = 10F;
	//    8   14:aload_0         
	//    9   15:ldc1            #67  <Float 10F>
	//   10   17:putfield        #69  <Field float zzcq>
		strokeColor = 0xff000000;
	//   11   20:aload_0         
	//   12   21:ldc1            #70  <Int 0xff000000>
	//   13   23:putfield        #72  <Field int strokeColor>
		fillColor = 0;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #74  <Field int fillColor>
		zzcr = 0.0F;
	//   17   31:aload_0         
	//   18   32:fconst_0        
	//   19   33:putfield        #76  <Field float zzcr>
		zzcs = true;
	//   20   36:aload_0         
	//   21   37:iconst_1        
	//   22   38:putfield        #78  <Field boolean zzcs>
		zzct = false;
	//   23   41:aload_0         
	//   24   42:iconst_0        
	//   25   43:putfield        #80  <Field boolean zzct>
		zzcu = null;
	//   26   46:aload_0         
	//   27   47:aconst_null     
	//   28   48:putfield        #82  <Field List zzcu>
		zzco = latlng;
	//   29   51:aload_0         
	//   30   52:aload_1         
	//   31   53:putfield        #64  <Field LatLng zzco>
		zzcp = d;
	//   32   56:aload_0         
	//   33   57:dload_2         
	//   34   58:putfield        #66  <Field double zzcp>
		zzcq = f;
	//   35   61:aload_0         
	//   36   62:fload           4
	//   37   64:putfield        #69  <Field float zzcq>
		strokeColor = i;
	//   38   67:aload_0         
	//   39   68:iload           5
	//   40   70:putfield        #72  <Field int strokeColor>
		fillColor = j;
	//   41   73:aload_0         
	//   42   74:iload           6
	//   43   76:putfield        #74  <Field int fillColor>
		zzcr = f1;
	//   44   79:aload_0         
	//   45   80:fload           7
	//   46   82:putfield        #76  <Field float zzcr>
		zzcs = flag;
	//   47   85:aload_0         
	//   48   86:iload           8
	//   49   88:putfield        #78  <Field boolean zzcs>
		zzct = flag1;
	//   50   91:aload_0         
	//   51   92:iload           9
	//   52   94:putfield        #80  <Field boolean zzct>
		zzcu = list;
	//   53   97:aload_0         
	//   54   98:aload           10
	//   55  100:putfield        #82  <Field List zzcu>
	//   56  103:return          
	}

	public final CircleOptions center(LatLng latlng)
	{
		zzco = latlng;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #64  <Field LatLng zzco>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final CircleOptions clickable(boolean flag)
	{
		zzct = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #80  <Field boolean zzct>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final CircleOptions fillColor(int i)
	{
		fillColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #74  <Field int fillColor>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final LatLng getCenter()
	{
		return zzco;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field LatLng zzco>
	//    2    4:areturn         
	}

	public final int getFillColor()
	{
		return fillColor;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field int fillColor>
	//    2    4:ireturn         
	}

	public final double getRadius()
	{
		return zzcp;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field double zzcp>
	//    2    4:dreturn         
	}

	public final int getStrokeColor()
	{
		return strokeColor;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field int strokeColor>
	//    2    4:ireturn         
	}

	public final List getStrokePattern()
	{
		return zzcu;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field List zzcu>
	//    2    4:areturn         
	}

	public final float getStrokeWidth()
	{
		return zzcq;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field float zzcq>
	//    2    4:freturn         
	}

	public final float getZIndex()
	{
		return zzcr;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field float zzcr>
	//    2    4:freturn         
	}

	public final boolean isClickable()
	{
		return zzct;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field boolean zzct>
	//    2    4:ireturn         
	}

	public final boolean isVisible()
	{
		return zzcs;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field boolean zzcs>
	//    2    4:ireturn         
	}

	public final CircleOptions radius(double d)
	{
		zzcp = d;
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:putfield        #66  <Field double zzcp>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final CircleOptions strokeColor(int i)
	{
		strokeColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #72  <Field int strokeColor>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final CircleOptions strokePattern(List list)
	{
		zzcu = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #82  <Field List zzcu>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final CircleOptions strokeWidth(float f)
	{
		zzcq = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #69  <Field float zzcq>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final CircleOptions visible(boolean flag)
	{
		zzcs = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #78  <Field boolean zzcs>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #117 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeParcelable(parcel, 2, ((android.os.Parcelable) (getCenter())), i, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #119 <Method LatLng getCenter()>
	//    7   11:iload_2         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #123 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeDouble(parcel, 3, getRadius());
	//   10   16:aload_1         
	//   11   17:iconst_3        
	//   12   18:aload_0         
	//   13   19:invokevirtual   #125 <Method double getRadius()>
	//   14   22:invokestatic    #129 <Method void SafeParcelWriter.writeDouble(Parcel, int, double)>
		SafeParcelWriter.writeFloat(parcel, 4, getStrokeWidth());
	//   15   25:aload_1         
	//   16   26:iconst_4        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #131 <Method float getStrokeWidth()>
	//   19   31:invokestatic    #135 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeInt(parcel, 5, getStrokeColor());
	//   20   34:aload_1         
	//   21   35:iconst_5        
	//   22   36:aload_0         
	//   23   37:invokevirtual   #137 <Method int getStrokeColor()>
	//   24   40:invokestatic    #141 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 6, getFillColor());
	//   25   43:aload_1         
	//   26   44:bipush          6
	//   27   46:aload_0         
	//   28   47:invokevirtual   #143 <Method int getFillColor()>
	//   29   50:invokestatic    #141 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeFloat(parcel, 7, getZIndex());
	//   30   53:aload_1         
	//   31   54:bipush          7
	//   32   56:aload_0         
	//   33   57:invokevirtual   #145 <Method float getZIndex()>
	//   34   60:invokestatic    #135 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeBoolean(parcel, 8, isVisible());
	//   35   63:aload_1         
	//   36   64:bipush          8
	//   37   66:aload_0         
	//   38   67:invokevirtual   #147 <Method boolean isVisible()>
	//   39   70:invokestatic    #151 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 9, isClickable());
	//   40   73:aload_1         
	//   41   74:bipush          9
	//   42   76:aload_0         
	//   43   77:invokevirtual   #153 <Method boolean isClickable()>
	//   44   80:invokestatic    #151 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeTypedList(parcel, 10, getStrokePattern(), false);
	//   45   83:aload_1         
	//   46   84:bipush          10
	//   47   86:aload_0         
	//   48   87:invokevirtual   #155 <Method List getStrokePattern()>
	//   49   90:iconst_0        
	//   50   91:invokestatic    #159 <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   51   94:aload_1         
	//   52   95:iload_3         
	//   53   96:invokestatic    #162 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   54   99:return          
	}

	public final CircleOptions zIndex(float f)
	{
		zzcr = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #76  <Field float zzcr>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzc();
	private int fillColor;
	private int strokeColor;
	private LatLng zzco;
	private double zzcp;
	private float zzcq;
	private float zzcr;
	private boolean zzcs;
	private boolean zzct;
	private List zzcu;

	static 
	{
	//    0    0:new             #55  <Class zzc>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void zzc()>
	//    3    7:putstatic       #60  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
