// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzzu, zzatk

public final class zzzt extends AbstractSafeParcelable
{

	zzzt(int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void AbstractSafeParcelable()>
		major = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #37  <Field int major>
		minor = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #39  <Field int minor>
		zzbvo = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #41  <Field int zzbvo>
	//   11   19:return          
	}

	public static zzzt zza(zzatk zzatk1)
	{
		return new zzzt(zzatk1.zzdgt, zzatk1.zzdgu, zzatk1.zzdgv);
	//    0    0:new             #2   <Class zzzt>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #50  <Field int zzatk.zzdgt>
	//    4    8:aload_0         
	//    5    9:getfield        #53  <Field int zzatk.zzdgu>
	//    6   12:aload_0         
	//    7   13:getfield        #56  <Field int zzatk.zzdgv>
	//    8   16:invokespecial   #58  <Method void zzzt(int, int, int)>
	//    9   19:areturn         
	}

	public final String toString()
	{
		int i = major;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int major>
	//    2    4:istore_1        
		int j = minor;
	//    3    5:aload_0         
	//    4    6:getfield        #39  <Field int minor>
	//    5    9:istore_2        
		int k = zzbvo;
	//    6   10:aload_0         
	//    7   11:getfield        #41  <Field int zzbvo>
	//    8   14:istore_3        
		StringBuilder stringbuilder = new StringBuilder(35);
	//    9   15:new             #62  <Class StringBuilder>
	//   10   18:dup             
	//   11   19:bipush          35
	//   12   21:invokespecial   #65  <Method void StringBuilder(int)>
	//   13   24:astore          4
		stringbuilder.append(i);
	//   14   26:aload           4
	//   15   28:iload_1         
	//   16   29:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   17   32:pop             
		stringbuilder.append(".");
	//   18   33:aload           4
	//   19   35:ldc1            #71  <String ".">
	//   20   37:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
		stringbuilder.append(j);
	//   22   41:aload           4
	//   23   43:iload_2         
	//   24   44:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   25   47:pop             
		stringbuilder.append(".");
	//   26   48:aload           4
	//   27   50:ldc1            #71  <String ".">
	//   28   52:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   29   55:pop             
		stringbuilder.append(k);
	//   30   56:aload           4
	//   31   58:iload_3         
	//   32   59:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   33   62:pop             
		return stringbuilder.toString();
	//   34   63:aload           4
	//   35   65:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   36   68:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #84  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 1, major);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #37  <Field int major>
	//    7   11:invokestatic    #88  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 2, minor);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #39  <Field int minor>
	//   12   20:invokestatic    #88  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 3, zzbvo);
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:getfield        #41  <Field int zzbvo>
	//   17   29:invokestatic    #88  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   18   32:aload_1         
	//   19   33:iload_2         
	//   20   34:invokestatic    #91  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   21   37:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzzu();
	private final int major;
	private final int minor;
	private final int zzbvo;

	static 
	{
	//    0    0:new             #25  <Class zzzu>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void zzzu()>
	//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
