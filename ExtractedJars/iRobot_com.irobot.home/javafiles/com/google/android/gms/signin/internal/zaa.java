// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.signin.internal:
//			zab

public final class zaa extends AbstractSafeParcelable
	implements Result
{

	public zaa()
	{
		this(0, ((Intent) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aconst_null     
	//    3    3:invokespecial   #39  <Method void zaa(int, Intent)>
	//    4    6:return          
	}

	zaa(int i, int j, Intent intent)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void AbstractSafeParcelable()>
		zale = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #45  <Field int zale>
		zarw = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #47  <Field int zarw>
		zarx = intent;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #49  <Field Intent zarx>
	//   11   19:return          
	}

	private zaa(int i, Intent intent)
	{
		this(2, 0, ((Intent) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:iconst_0        
	//    3    3:aconst_null     
	//    4    4:invokespecial   #53  <Method void zaa(int, int, Intent)>
	//    5    7:return          
	}

	public final Status getStatus()
	{
		if(zarw == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field int zarw>
	//*   2    4:ifne            11
			return Status.RESULT_SUCCESS;
	//    3    7:getstatic       #61  <Field Status Status.RESULT_SUCCESS>
	//    4   10:areturn         
		else
			return Status.RESULT_CANCELED;
	//    5   11:getstatic       #64  <Field Status Status.RESULT_CANCELED>
	//    6   14:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #72  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, zale);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #45  <Field int zale>
	//    7   11:invokestatic    #76  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 2, zarw);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #47  <Field int zarw>
	//   12   20:invokestatic    #76  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeParcelable(parcel, 3, ((android.os.Parcelable) (zarx)), i, false);
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:getfield        #49  <Field Intent zarx>
	//   17   29:iload_2         
	//   18   30:iconst_0        
	//   19   31:invokestatic    #80  <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   20   34:aload_1         
	//   21   35:iload_3         
	//   22   36:invokestatic    #83  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   23   39:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zab();
	private final int zale;
	private int zarw;
	private Intent zarx;

	static 
	{
	//    0    0:new             #30  <Class zab>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void zab()>
	//    3    7:putstatic       #35  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
