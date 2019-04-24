// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.api.Status;

final class zzco
	implements com.google.android.gms.cast.Cast.ApplicationConnectionResult
{

	public zzco(Status status)
	{
		this(status, ((ApplicationMetadata) (null)), ((String) (null)), ((String) (null)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:iconst_0        
	//    6    6:invokespecial   #21  <Method void zzco(Status, ApplicationMetadata, String, String, boolean)>
	//    7    9:return          
	}

	public zzco(Status status, ApplicationMetadata applicationmetadata, String s, String s1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		zzge = status;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field Status zzge>
		zzvr = applicationmetadata;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field ApplicationMetadata zzvr>
		zzvs = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #31  <Field String zzvs>
		zzvt = s1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #33  <Field String zzvt>
		zzvu = flag;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #35  <Field boolean zzvu>
	//   17   31:return          
	}

	public final ApplicationMetadata getApplicationMetadata()
	{
		return zzvr;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ApplicationMetadata zzvr>
	//    2    4:areturn         
	}

	public final String getApplicationStatus()
	{
		return zzvs;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String zzvs>
	//    2    4:areturn         
	}

	public final String getSessionId()
	{
		return zzvt;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String zzvt>
	//    2    4:areturn         
	}

	public final Status getStatus()
	{
		return zzge;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Status zzge>
	//    2    4:areturn         
	}

	public final boolean getWasLaunched()
	{
		return zzvu;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field boolean zzvu>
	//    2    4:ireturn         
	}

	private final Status zzge;
	private final ApplicationMetadata zzvr;
	private final String zzvs;
	private final String zzvt;
	private final boolean zzvu;
}
