// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth:
//			zzf

public class AccountChangeEventsResponse extends AbstractSafeParcelable
{

	AccountChangeEventsResponse(int i, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void AbstractSafeParcelable()>
		zzh = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #36  <Field int zzh>
		zzo = (List)Preconditions.checkNotNull(((Object) (list)));
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #42  <Method Object Preconditions.checkNotNull(Object)>
	//    8   14:checkcast       #44  <Class List>
	//    9   17:putfield        #46  <Field List zzo>
	//   10   20:return          
	}

	public AccountChangeEventsResponse(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void AbstractSafeParcelable()>
		zzh = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #36  <Field int zzh>
		zzo = (List)Preconditions.checkNotNull(((Object) (list)));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokestatic    #42  <Method Object Preconditions.checkNotNull(Object)>
	//    8   14:checkcast       #44  <Class List>
	//    9   17:putfield        #46  <Field List zzo>
	//   10   20:return          
	}

	public List getEvents()
	{
		return zzo;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field List zzo>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #63  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 1, zzh);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #36  <Field int zzh>
	//    7   11:invokestatic    #67  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeTypedList(parcel, 2, zzo, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #46  <Field List zzo>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #71  <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   14   24:aload_1         
	//   15   25:iload_2         
	//   16   26:invokestatic    #74  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   17   29:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzf();
	private final int zzh;
	private final List zzo;

	static 
	{
	//    0    0:new             #24  <Class zzf>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void zzf()>
	//    3    7:putstatic       #29  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
