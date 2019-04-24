// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.Status;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//			RemoteMediaPlayer

private static final class RemoteMediaPlayer$zzc
	implements aChannelResult
{

	public final JSONObject getCustomData()
	{
		return zzp;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field JSONObject zzp>
	//    2    4:areturn         
	}

	public final Status getStatus()
	{
		return zzge;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Status zzge>
	//    2    4:areturn         
	}

	private final Status zzge;
	private final JSONObject zzp;

	RemoteMediaPlayer$zzc(Status status, JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zzge = status;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Status zzge>
		zzp = jsonobject;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field JSONObject zzp>
	//    8   14:return          
	}
}
