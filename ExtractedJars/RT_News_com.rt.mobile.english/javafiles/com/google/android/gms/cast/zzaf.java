// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.cast:
//			zzag

public final class zzaf extends AbstractSafeParcelable
{

	public zzaf()
	{
		this(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #33  <Method void zzaf(int)>
	//    3    5:return          
	}

	zzaf(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void AbstractSafeParcelable()>
		zzcw = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #38  <Field int zzcw>
	//    5    9:return          
	}

	public final boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof zzaf))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzaf>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzaf)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzaf>
	//   12   20:astore_1        
		return zzcw == ((zzaf) (obj)).zzcw;
	//   13   21:aload_0         
	//   14   22:getfield        #38  <Field int zzcw>
	//   15   25:aload_1         
	//   16   26:getfield        #38  <Field int zzcw>
	//   17   29:icmpne          34
	//   18   32:iconst_1        
	//   19   33:ireturn         
	//   20   34:iconst_0        
	//   21   35:ireturn         
	}

	public final int hashCode()
	{
		return Objects.hashCode(new Object[] {
			Integer.valueOf(zzcw)
		});
	//    0    0:iconst_1        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #38  <Field int zzcw>
	//    6   10:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:invokestatic    #57  <Method int Objects.hashCode(Object[])>
	//    9   17:ireturn         
	}

	public final String toString()
	{
		int i = zzcw;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int zzcw>
	//    2    4:istore_1        
		String s;
		if(i != 0)
	//*   3    5:iload_1         
	//*   4    6:ifeq            26
		{
			if(i != 2)
	//*   5    9:iload_1         
	//*   6   10:iconst_2        
	//*   7   11:icmpeq          20
				s = "UNKNOWN";
	//    8   14:ldc1            #61  <String "UNKNOWN">
	//    9   16:astore_2        
			else
	//*  10   17:goto            29
				s = "INVISIBLE";
	//   11   20:ldc1            #63  <String "INVISIBLE">
	//   12   22:astore_2        
		} else
	//*  13   23:goto            29
		{
			s = "STRONG";
	//   14   26:ldc1            #65  <String "STRONG">
	//   15   28:astore_2        
		}
		return String.format("joinOptions(connectionType=%s)", new Object[] {
			s
		});
	//   16   29:ldc1            #67  <String "joinOptions(connectionType=%s)">
	//   17   31:iconst_1        
	//   18   32:anewarray       Object[]
	//   19   35:dup             
	//   20   36:iconst_0        
	//   21   37:aload_2         
	//   22   38:aastore         
	//   23   39:invokestatic    #73  <Method String String.format(String, Object[])>
	//   24   42:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #81  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 2, zzcw);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #38  <Field int zzcw>
	//    7   11:invokestatic    #85  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//    8   14:aload_1         
	//    9   15:iload_2         
	//   10   16:invokestatic    #88  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   11   19:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzag();
	private int zzcw;

	static 
	{
	//    0    0:new             #24  <Class zzag>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void zzag()>
	//    3    7:putstatic       #29  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
