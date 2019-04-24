// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzf

public final class LatLng extends zza
	implements ReflectedParcelable
{

	public LatLng(double d, double d1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void zza()>
		if(-180D <= d1 && d1 < 180D)
	//*   2    4:ldc2w           #25  <Double -180D>
	//*   3    7:dload_3         
	//*   4    8:dcmpg           
	//*   5    9:ifgt            28
	//*   6   12:dload_3         
	//*   7   13:ldc2w           #27  <Double 180D>
	//*   8   16:dcmpg           
	//*   9   17:ifge            28
			longitude = d1;
	//   10   20:aload_0         
	//   11   21:dload_3         
	//   12   22:putfield        #30  <Field double longitude>
		else
	//*  13   25:goto            53
			longitude = ((d1 - 180D) % 360D + 360D) % 360D - 180D;
	//   14   28:aload_0         
	//   15   29:dload_3         
	//   16   30:ldc2w           #27  <Double 180D>
	//   17   33:dsub            
	//   18   34:ldc2w           #31  <Double 360D>
	//   19   37:drem            
	//   20   38:ldc2w           #31  <Double 360D>
	//   21   41:dadd            
	//   22   42:ldc2w           #31  <Double 360D>
	//   23   45:drem            
	//   24   46:ldc2w           #27  <Double 180D>
	//   25   49:dsub            
	//   26   50:putfield        #30  <Field double longitude>
		latitude = Math.max(-90D, Math.min(90D, d));
	//   27   53:aload_0         
	//   28   54:ldc2w           #33  <Double -90D>
	//   29   57:ldc2w           #35  <Double 90D>
	//   30   60:dload_1         
	//   31   61:invokestatic    #42  <Method double Math.min(double, double)>
	//   32   64:invokestatic    #45  <Method double Math.max(double, double)>
	//   33   67:putfield        #47  <Field double latitude>
	//   34   70:return          
	}

	public boolean equals(Object obj)
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
	//   14   22:getfield        #47  <Field double latitude>
	//   15   25:invokestatic    #55  <Method long Double.doubleToLongBits(double)>
	//   16   28:aload_1         
	//   17   29:getfield        #47  <Field double latitude>
	//   18   32:invokestatic    #55  <Method long Double.doubleToLongBits(double)>
	//   19   35:lcmp            
	//   20   36:ifne            59
	//   21   39:aload_0         
	//   22   40:getfield        #30  <Field double longitude>
	//   23   43:invokestatic    #55  <Method long Double.doubleToLongBits(double)>
	//   24   46:aload_1         
	//   25   47:getfield        #30  <Field double longitude>
	//   26   50:invokestatic    #55  <Method long Double.doubleToLongBits(double)>
	//   27   53:lcmp            
	//   28   54:ifne            59
	//   29   57:iconst_1        
	//   30   58:ireturn         
	//   31   59:iconst_0        
	//   32   60:ireturn         
	}

	public int hashCode()
	{
		long l = Double.doubleToLongBits(latitude);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field double latitude>
	//    2    4:invokestatic    #55  <Method long Double.doubleToLongBits(double)>
	//    3    7:lstore_2        
		int i = (int)(l >>> 32 ^ l);
	//    4    8:lload_2         
	//    5    9:bipush          32
	//    6   11:lushr           
	//    7   12:lload_2         
	//    8   13:lxor            
	//    9   14:l2i             
	//   10   15:istore_1        
		l = Double.doubleToLongBits(longitude);
	//   11   16:aload_0         
	//   12   17:getfield        #30  <Field double longitude>
	//   13   20:invokestatic    #55  <Method long Double.doubleToLongBits(double)>
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

	public String toString()
	{
		double d = latitude;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field double latitude>
	//    2    4:dstore_1        
		double d1 = longitude;
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field double longitude>
	//    5    9:dstore_3        
		return (new StringBuilder(60)).append("lat/lng: (").append(d).append(",").append(d1).append(")").toString();
	//    6   10:new             #61  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:bipush          60
	//    9   16:invokespecial   #64  <Method void StringBuilder(int)>
	//   10   19:ldc1            #66  <String "lat/lng: (">
	//   11   21:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   12   24:dload_1         
	//   13   25:invokevirtual   #73  <Method StringBuilder StringBuilder.append(double)>
	//   14   28:ldc1            #75  <String ",">
	//   15   30:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:dload_3         
	//   17   34:invokevirtual   #73  <Method StringBuilder StringBuilder.append(double)>
	//   18   37:ldc1            #77  <String ")">
	//   19   39:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   20   42:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   21   45:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.maps.model.zzf.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #85  <Method void com.google.android.gms.maps.model.zzf.zza(LatLng, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzf();
	public final double latitude;
	public final double longitude;

	static 
	{
	//    0    0:new             #16  <Class zzf>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void zzf()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
