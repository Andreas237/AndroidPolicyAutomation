// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcj, rs, zzasm, bck

public abstract class rt extends bcj
	implements rs
{

	public rt()
	{
		super("com.google.android.gms.ads.internal.request.IAdResponseListener");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.request.IAdResponseListener">
	//    2    3:invokespecial   #13  <Method void bcj(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          25
		{
			a((zzasm)bck.a(parcel, zzasm.CREATOR));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:getstatic       #22  <Field android.os.Parcelable$Creator zzasm.CREATOR>
	//    6   10:invokestatic    #28  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//    7   13:checkcast       #18  <Class zzasm>
	//    8   16:invokevirtual   #31  <Method void a(zzasm)>
			parcel1.writeNoException();
	//    9   19:aload_3         
	//   10   20:invokevirtual   #36  <Method void Parcel.writeNoException()>
			return true;
	//   11   23:iconst_1        
	//   12   24:ireturn         
		} else
		{
			return false;
	//   13   25:iconst_0        
	//   14   26:ireturn         
		}
	}
}
