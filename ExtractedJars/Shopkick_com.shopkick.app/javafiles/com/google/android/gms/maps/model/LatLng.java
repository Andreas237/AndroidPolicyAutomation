// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzf

public final class LatLng extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	public LatLng(double d, double d1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void AbstractSafeParcelable()>
		if(-180D > d1 || d1 >= 180D)
	//*   2    4:ldc2w           #38  <Double -180D>
	//*   3    7:dload_3         
	//*   4    8:dcmpg           
	//*   5    9:ifgt            23
	//*   6   12:dload_3         
	//*   7   13:ldc2w           #40  <Double 180D>
	//*   8   16:dcmpg           
	//*   9   17:ifge            23
	//*  10   20:goto            45
			d1 = ((d1 - 180D) % 360D + 360D) % 360D - 180D;
	//   11   23:dload_3         
	//   12   24:ldc2w           #40  <Double 180D>
	//   13   27:dsub            
	//   14   28:ldc2w           #42  <Double 360D>
	//   15   31:drem            
	//   16   32:ldc2w           #42  <Double 360D>
	//   17   35:dadd            
	//   18   36:ldc2w           #42  <Double 360D>
	//   19   39:drem            
	//   20   40:ldc2w           #40  <Double 180D>
	//   21   43:dsub            
	//   22   44:dstore_3        
		longitude = d1;
	//   23   45:aload_0         
	//   24   46:dload_3         
	//   25   47:putfield        #45  <Field double longitude>
		latitude = Math.max(-90D, Math.min(90D, d));
	//   26   50:aload_0         
	//   27   51:ldc2w           #46  <Double -90D>
	//   28   54:ldc2w           #48  <Double 90D>
	//   29   57:dload_1         
	//   30   58:invokestatic    #55  <Method double Math.min(double, double)>
	//   31   61:invokestatic    #58  <Method double Math.max(double, double)>
	//   32   64:putfield        #60  <Field double latitude>
	//   33   67:return          
	}

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof LatLng))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class LatLng>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((LatLng)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class LatLng>
	//   12   20:astore_1        
		return Double.doubleToLongBits(latitude) == Double.doubleToLongBits(((LatLng) (obj)).latitude) && Double.doubleToLongBits(longitude) == Double.doubleToLongBits(((LatLng) (obj)).longitude);
	//   13   21:aload_0         
	//   14   22:getfield        #60  <Field double latitude>
	//   15   25:invokestatic    #70  <Method long Double.doubleToLongBits(double)>
	//   16   28:aload_1         
	//   17   29:getfield        #60  <Field double latitude>
	//   18   32:invokestatic    #70  <Method long Double.doubleToLongBits(double)>
	//   19   35:lcmp            
	//   20   36:ifne            59
	//   21   39:aload_0         
	//   22   40:getfield        #45  <Field double longitude>
	//   23   43:invokestatic    #70  <Method long Double.doubleToLongBits(double)>
	//   24   46:aload_1         
	//   25   47:getfield        #45  <Field double longitude>
	//   26   50:invokestatic    #70  <Method long Double.doubleToLongBits(double)>
	//   27   53:lcmp            
	//   28   54:ifne            59
	//   29   57:iconst_1        
	//   30   58:ireturn         
	//   31   59:iconst_0        
	//   32   60:ireturn         
	}

	public final int hashCode()
	{
		long l = Double.doubleToLongBits(latitude);
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field double latitude>
	//    2    4:invokestatic    #70  <Method long Double.doubleToLongBits(double)>
	//    3    7:lstore_2        
		int i = (int)(l ^ l >>> 32);
	//    4    8:lload_2         
	//    5    9:lload_2         
	//    6   10:bipush          32
	//    7   12:lushr           
	//    8   13:lxor            
	//    9   14:l2i             
	//   10   15:istore_1        
		l = Double.doubleToLongBits(longitude);
	//   11   16:aload_0         
	//   12   17:getfield        #45  <Field double longitude>
	//   13   20:invokestatic    #70  <Method long Double.doubleToLongBits(double)>
	//   14   23:lstore_2        
		return (i + 31) * 31 + (int)(l >>> 32 ^ l);
	//   15   24:iload_1         
	//   16   25:bipush          31
	//   17   27:iadd            
	//   18   28:bipush          31
	//   19   30:imul            
	//   20   31:lload_2         
	//   21   32:bipush          32
	//   22   34:lushr           
	//   23   35:lload_2         
	//   24   36:lxor            
	//   25   37:l2i             
	//   26   38:iadd            
	//   27   39:ireturn         
	}

	public final String toString()
	{
		double d = latitude;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field double latitude>
	//    2    4:dstore_1        
		double d1 = longitude;
	//    3    5:aload_0         
	//    4    6:getfield        #45  <Field double longitude>
	//    5    9:dstore_3        
		StringBuilder stringbuilder = new StringBuilder(60);
	//    6   10:new             #76  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:bipush          60
	//    9   16:invokespecial   #79  <Method void StringBuilder(int)>
	//   10   19:astore          5
		stringbuilder.append("lat/lng: (");
	//   11   21:aload           5
	//   12   23:ldc1            #81  <String "lat/lng: (">
	//   13   25:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
		stringbuilder.append(d);
	//   15   29:aload           5
	//   16   31:dload_1         
	//   17   32:invokevirtual   #88  <Method StringBuilder StringBuilder.append(double)>
	//   18   35:pop             
		stringbuilder.append(",");
	//   19   36:aload           5
	//   20   38:ldc1            #90  <String ",">
	//   21   40:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   22   43:pop             
		stringbuilder.append(d1);
	//   23   44:aload           5
	//   24   46:dload_3         
	//   25   47:invokevirtual   #88  <Method StringBuilder StringBuilder.append(double)>
	//   26   50:pop             
		stringbuilder.append(")");
	//   27   51:aload           5
	//   28   53:ldc1            #92  <String ")">
	//   29   55:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   30   58:pop             
		return stringbuilder.toString();
	//   31   59:aload           5
	//   32   61:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   33   64:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #102 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeDouble(parcel, 2, latitude);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #60  <Field double latitude>
	//    7   11:invokestatic    #106 <Method void SafeParcelWriter.writeDouble(Parcel, int, double)>
		SafeParcelWriter.writeDouble(parcel, 3, longitude);
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:getfield        #45  <Field double longitude>
	//   12   20:invokestatic    #106 <Method void SafeParcelWriter.writeDouble(Parcel, int, double)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   13   23:aload_1         
	//   14   24:iload_2         
	//   15   25:invokestatic    #109 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   16   28:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzf();
	public final double latitude;
	public final double longitude;

	static 
	{
	//    0    0:new             #27  <Class zzf>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void zzf()>
	//    3    7:putstatic       #32  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
