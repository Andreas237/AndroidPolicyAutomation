// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.games.GameManagerClient;
import com.google.android.gms.common.api.Status;

final class zzbw
	implements com.google.android.gms.cast.games.GameManagerClient.GameManagerInstanceResult
{

	zzbw(Status status, GameManagerClient gamemanagerclient)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzge = status;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Status zzge>
		zztq = gamemanagerclient;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field GameManagerClient zztq>
	//    8   14:return          
	}

	public final GameManagerClient getGameManagerClient()
	{
		return zztq;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field GameManagerClient zztq>
	//    2    4:areturn         
	}

	public final Status getStatus()
	{
		return zzge;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Status zzge>
	//    2    4:areturn         
	}

	private final Status zzge;
	private final GameManagerClient zztq;
}
