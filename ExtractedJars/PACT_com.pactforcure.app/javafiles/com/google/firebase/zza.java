// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzabk;

// Referenced classes of package com.google.firebase:
//			FirebaseException, FirebaseApiNotAvailableException

public class zza
	implements zzabk
{

	public zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public Exception zzz(Status status)
	{
		if(status.getStatusCode() == 8)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #19  <Method int Status.getStatusCode()>
	//*   2    4:bipush          8
	//*   3    6:icmpne          21
			return ((Exception) (new FirebaseException(status.zzuU())));
	//    4    9:new             #21  <Class FirebaseException>
	//    5   12:dup             
	//    6   13:aload_1         
	//    7   14:invokevirtual   #25  <Method String Status.zzuU()>
	//    8   17:invokespecial   #28  <Method void FirebaseException(String)>
	//    9   20:areturn         
		else
			return ((Exception) (new FirebaseApiNotAvailableException(status.zzuU())));
	//   10   21:new             #30  <Class FirebaseApiNotAvailableException>
	//   11   24:dup             
	//   12   25:aload_1         
	//   13   26:invokevirtual   #25  <Method String Status.zzuU()>
	//   14   29:invokespecial   #31  <Method void FirebaseApiNotAvailableException(String)>
	//   15   32:areturn         
	}
}
