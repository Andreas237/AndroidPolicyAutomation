// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.server:
//			zaa

public class FavaDiagnosticsEntity extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	public FavaDiagnosticsEntity(int i, String s, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void AbstractSafeParcelable()>
		zale = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #40  <Field int zale>
		zapi = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #42  <Field String zapi>
		zapj = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #44  <Field int zapj>
	//   11   19:return          
	}

	public FavaDiagnosticsEntity(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void AbstractSafeParcelable()>
		zale = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #40  <Field int zale>
		zapi = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #42  <Field String zapi>
		zapj = i;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #44  <Field int zapj>
	//   11   19:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #55  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 1, zale);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #40  <Field int zale>
	//    7   11:invokestatic    #59  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 2, zapi, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #42  <Field String zapi>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #63  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeInt(parcel, 3, zapj);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #44  <Field int zapj>
	//   18   30:invokestatic    #59  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   19   33:aload_1         
	//   20   34:iload_2         
	//   21   35:invokestatic    #66  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   22   38:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zaa();
	private final int zale;
	private final String zapi;
	private final int zapj;

	static 
	{
	//    0    0:new             #28  <Class zaa>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void zaa()>
	//    3    7:putstatic       #33  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
