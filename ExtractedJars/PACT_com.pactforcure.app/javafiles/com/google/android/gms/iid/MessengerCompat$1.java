// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.iid;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.iid:
//			MessengerCompat

final class MessengerCompat$1
	implements android.os.
{

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzgn(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #20  <Method MessengerCompat zzgn(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzjB(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #26  <Method MessengerCompat[] zzjB(int)>
	//    3    5:areturn         
	}

	public MessengerCompat zzgn(Parcel parcel)
	{
		parcel = ((Parcel) (parcel.readStrongBinder()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #32  <Method android.os.IBinder Parcel.readStrongBinder()>
	//    2    4:astore_1        
		if(parcel != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
			return new MessengerCompat(((android.os.IBinder) (parcel)));
	//    5    9:new             #9   <Class MessengerCompat>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #35  <Method void MessengerCompat(android.os.IBinder)>
	//    9   17:areturn         
		else
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
	}

	public MessengerCompat[] zzjB(int i)
	{
		return new MessengerCompat[i];
	//    0    0:iload_1         
	//    1    1:anewarray       MessengerCompat[]
	//    2    4:areturn         
	}

	MessengerCompat$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
