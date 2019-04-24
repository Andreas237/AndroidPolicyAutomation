// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import com.google.android.gms.common.api.Status;
import org.json.JSONObject;

final class zzbx
	implements com.google.android.gms.cast.games.GameManagerClient.GameManagerResult
{

	zzbx(Status status, String s, long l, JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzge = status;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Status zzge>
		zzts = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field String zzts>
		zztt = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #25  <Field long zztt>
		zztu = jsonobject;
	//   11   19:aload_0         
	//   12   20:aload           5
	//   13   22:putfield        #27  <Field JSONObject zztu>
	//   14   25:return          
	}

	public final JSONObject getExtraMessageData()
	{
		return zztu;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field JSONObject zztu>
	//    2    4:areturn         
	}

	public final String getPlayerId()
	{
		return zzts;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String zzts>
	//    2    4:areturn         
	}

	public final long getRequestId()
	{
		return zztt;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field long zztt>
	//    2    4:lreturn         
	}

	public final Status getStatus()
	{
		return zzge;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Status zzge>
	//    2    4:areturn         
	}

	private final Status zzge;
	private final String zzts;
	private final long zztt;
	private final JSONObject zztu;
}
