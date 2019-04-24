// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzmr

public final class zzmq extends AbstractSafeParcelable
{

	public zzmq(SearchAdRequest searchadrequest)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void AbstractSafeParcelable()>
		zzatn = searchadrequest.getQuery();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #50  <Method String SearchAdRequest.getQuery()>
	//    5    9:putfield        #52  <Field String zzatn>
	//    6   12:return          
	}

	zzmq(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void AbstractSafeParcelable()>
		zzatn = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #52  <Field String zzatn>
	//    5    9:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #65  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeString(parcel, 15, zzatn, false);
	//    3    5:aload_1         
	//    4    6:bipush          15
	//    5    8:aload_0         
	//    6    9:getfield        #52  <Field String zzatn>
	//    7   12:iconst_0        
	//    8   13:invokestatic    #69  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//    9   16:aload_1         
	//   10   17:iload_2         
	//   11   18:invokestatic    #72  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   12   21:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzmr();
	public final String zzatn;

	static 
	{
	//    0    0:new             #36  <Class zzmr>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void zzmr()>
	//    3    7:putstatic       #41  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
