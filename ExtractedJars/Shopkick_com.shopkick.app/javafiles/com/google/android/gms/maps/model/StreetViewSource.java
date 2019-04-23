// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzq

public final class StreetViewSource extends AbstractSafeParcelable
{

	public StreetViewSource(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void AbstractSafeParcelable()>
		type = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #49  <Field int type>
	//    5    9:return          
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
		if(!(obj instanceof StreetViewSource))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class StreetViewSource>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((StreetViewSource)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class StreetViewSource>
	//   12   20:astore_1        
		return type == ((StreetViewSource) (obj)).type;
	//   13   21:aload_0         
	//   14   22:getfield        #49  <Field int type>
	//   15   25:aload_1         
	//   16   26:getfield        #49  <Field int type>
	//   17   29:icmpne          34
	//   18   32:iconst_1        
	//   19   33:ireturn         
	//   20   34:iconst_0        
	//   21   35:ireturn         
	}

	public final int hashCode()
	{
		return Objects.hashCode(new Object[] {
			Integer.valueOf(type)
		});
	//    0    0:iconst_1        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #49  <Field int type>
	//    6   10:invokestatic    #63  <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:invokestatic    #68  <Method int Objects.hashCode(Object[])>
	//    9   17:ireturn         
	}

	public final String toString()
	{
		int i = type;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int type>
	//    2    4:istore_1        
		String s;
		switch(i)
	//*   3    5:iload_1         
		{
	//*   4    6:tableswitch     0 1: default 28
	//	               0 54
	//	               1 48
		default:
			s = String.format("UNKNOWN(%s)", new Object[] {
				Integer.valueOf(i)
			});
	//    5   28:ldc1            #72  <String "UNKNOWN(%s)">
	//    6   30:iconst_1        
	//    7   31:anewarray       Object[]
	//    8   34:dup             
	//    9   35:iconst_0        
	//   10   36:iload_1         
	//   11   37:invokestatic    #63  <Method Integer Integer.valueOf(int)>
	//   12   40:aastore         
	//   13   41:invokestatic    #78  <Method String String.format(String, Object[])>
	//   14   44:astore_2        
			break;

	//*  15   45:goto            57
		case 1: // '\001'
			s = "OUTDOOR";
	//   16   48:ldc1            #79  <String "OUTDOOR">
	//   17   50:astore_2        
			break;

	//*  18   51:goto            57
		case 0: // '\0'
			s = "DEFAULT";
	//   19   54:ldc1            #80  <String "DEFAULT">
	//   20   56:astore_2        
			break;
		}
		return String.format("StreetViewSource:%s", new Object[] {
			s
		});
	//   21   57:ldc1            #82  <String "StreetViewSource:%s">
	//   22   59:iconst_1        
	//   23   60:anewarray       Object[]
	//   24   63:dup             
	//   25   64:iconst_0        
	//   26   65:aload_2         
	//   27   66:aastore         
	//   28   67:invokestatic    #78  <Method String String.format(String, Object[])>
	//   29   70:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #90  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 2, type);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #49  <Field int type>
	//    7   11:invokestatic    #94  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//    8   14:aload_1         
	//    9   15:iload_2         
	//   10   16:invokestatic    #97  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   11   19:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzq();
	public static final StreetViewSource DEFAULT = new StreetViewSource(0);
	public static final StreetViewSource OUTDOOR = new StreetViewSource(1);
	private static final String TAG = "StreetViewSource";
	private final int type;

	static 
	{
	//    0    0:new             #31  <Class zzq>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void zzq()>
	//    3    7:putstatic       #36  <Field android.os.Parcelable$Creator CREATOR>
	//    4   10:new             #2   <Class StreetViewSource>
	//    5   13:dup             
	//    6   14:iconst_0        
	//    7   15:invokespecial   #39  <Method void StreetViewSource(int)>
	//    8   18:putstatic       #41  <Field StreetViewSource DEFAULT>
	//    9   21:new             #2   <Class StreetViewSource>
	//   10   24:dup             
	//   11   25:iconst_1        
	//   12   26:invokespecial   #39  <Method void StreetViewSource(int)>
	//   13   29:putstatic       #43  <Field StreetViewSource OUTDOOR>
	//*  14   32:return          
	}
}
