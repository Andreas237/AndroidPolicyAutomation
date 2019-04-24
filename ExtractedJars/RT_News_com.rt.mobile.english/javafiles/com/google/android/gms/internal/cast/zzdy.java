// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.view.Display;
import com.google.android.gms.common.api.Status;

final class zzdy
	implements com.google.android.gms.cast.CastRemoteDisplay.CastRemoteDisplaySessionResult
{

	public zzdy(Display display)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzge = Status.RESULT_SUCCESS;
	//    2    4:aload_0         
	//    3    5:getstatic       #20  <Field Status Status.RESULT_SUCCESS>
	//    4    8:putfield        #22  <Field Status zzge>
		zzbx = display;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #24  <Field Display zzbx>
	//    8   16:return          
	}

	public zzdy(Status status)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzge = status;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Status zzge>
		zzbx = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #24  <Field Display zzbx>
	//    8   14:return          
	}

	public final Display getPresentationDisplay()
	{
		return zzbx;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Display zzbx>
	//    2    4:areturn         
	}

	public final Status getStatus()
	{
		return zzge;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Status zzge>
	//    2    4:areturn         
	}

	private final Display zzbx;
	private final Status zzge;
}
