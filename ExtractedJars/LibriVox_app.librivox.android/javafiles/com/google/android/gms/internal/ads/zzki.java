// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bhz

public final class zzki
	implements Parcelable
{

	zzki(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		a = new zza[parcel.readInt()];
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #28  <Method int Parcel.readInt()>
	//    5    9:anewarray       zza[]
	//    6   12:putfield        #32  <Field zzki$zza[] a>
		int i = 0;
	//    7   15:iconst_0        
	//    8   16:istore_2        
		do
		{
			zza azza[] = a;
	//    9   17:aload_0         
	//   10   18:getfield        #32  <Field zzki$zza[] a>
	//   11   21:astore_3        
			if(i < azza.length)
	//*  12   22:iload_2         
	//*  13   23:aload_3         
	//*  14   24:arraylength     
	//*  15   25:icmpge          50
			{
				azza[i] = (zza)parcel.readParcelable(((Class) (com/google/android/gms/internal/ads/zzki$zza)).getClassLoader());
	//   16   28:aload_3         
	//   17   29:iload_2         
	//   18   30:aload_1         
	//   19   31:ldc1            #30  <Class zzki$zza>
	//   20   33:invokevirtual   #38  <Method ClassLoader Class.getClassLoader()>
	//   21   36:invokevirtual   #42  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   22   39:checkcast       #30  <Class zzki$zza>
	//   23   42:aastore         
				i++;
	//   24   43:iload_2         
	//   25   44:iconst_1        
	//   26   45:iadd            
	//   27   46:istore_2        
			} else
	//*  28   47:goto            17
			{
				return;
	//   29   50:return          
			}
		} while(true);
	}

	public zzki(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		a = new zza[list.size()];
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokeinterface #48  <Method int List.size()>
	//    5   11:anewarray       zza[]
	//    6   14:putfield        #32  <Field zzki$zza[] a>
		list.toArray(((Object []) (a)));
	//    7   17:aload_1         
	//    8   18:aload_0         
	//    9   19:getfield        #32  <Field zzki$zza[] a>
	//   10   22:invokeinterface #52  <Method Object[] List.toArray(Object[])>
	//   11   27:pop             
	//   12   28:return          
	}

	public final int a()
	{
		return a.length;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field zzki$zza[] a>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public final zza a(int i)
	{
		return a[i];
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field zzki$zza[] a>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	public final int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
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
		if(obj != null && ((Object)this).getClass() == obj.getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          42
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #60  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #60  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       25
	//*  12   22:goto            42
		{
			obj = ((Object) ((zzki)obj));
	//   13   25:aload_1         
	//   14   26:checkcast       #2   <Class zzki>
	//   15   29:astore_1        
			return Arrays.equals(((Object []) (a)), ((Object []) (((zzki) (obj)).a)));
	//   16   30:aload_0         
	//   17   31:getfield        #32  <Field zzki$zza[] a>
	//   18   34:aload_1         
	//   19   35:getfield        #32  <Field zzki$zza[] a>
	//   20   38:invokestatic    #65  <Method boolean Arrays.equals(Object[], Object[])>
	//   21   41:ireturn         
		} else
		{
			return false;
	//   22   42:iconst_0        
	//   23   43:ireturn         
		}
	}

	public final int hashCode()
	{
		return Arrays.hashCode(((Object []) (a)));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field zzki$zza[] a>
	//    2    4:invokestatic    #69  <Method int Arrays.hashCode(Object[])>
	//    3    7:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(a.length);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #32  <Field zzki$zza[] a>
	//    3    5:arraylength     
	//    4    6:invokevirtual   #75  <Method void Parcel.writeInt(int)>
		zza azza[] = a;
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field zzki$zza[] a>
	//    7   13:astore          4
		int j = azza.length;
	//    8   15:aload           4
	//    9   17:arraylength     
	//   10   18:istore_3        
		for(i = 0; i < j; i++)
	//*  11   19:iconst_0        
	//*  12   20:istore_2        
	//*  13   21:iload_2         
	//*  14   22:iload_3         
	//*  15   23:icmpge          42
			parcel.writeParcelable(((Parcelable) (azza[i])), 0);
	//   16   26:aload_1         
	//   17   27:aload           4
	//   18   29:iload_2         
	//   19   30:aaload          
	//   20   31:iconst_0        
	//   21   32:invokevirtual   #79  <Method void Parcel.writeParcelable(Parcelable, int)>

	//   22   35:iload_2         
	//   23   36:iconst_1        
	//   24   37:iadd            
	//   25   38:istore_2        
	//*  26   39:goto            21
	//   27   42:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new bhz();
	private final zza a[];

	static 
	{
	//    0    0:new             #14  <Class bhz>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void bhz()>
	//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	private class zza
		implements Parcelable
	{
	}

}
