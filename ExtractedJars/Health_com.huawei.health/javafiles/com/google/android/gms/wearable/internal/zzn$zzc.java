// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.CapabilityInfo;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzn

public static class zzn$zzc
	implements CapabilityInfo
{

	public String getName()
	{
		return mName;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String mName>
	//    2    4:areturn         
	}

	public Set getNodes()
	{
		return zzbTN;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Set zzbTN>
	//    2    4:areturn         
	}

	private final String mName;
	private final Set zzbTN;

	public zzn$zzc(CapabilityInfo capabilityinfo)
	{
		this(capabilityinfo.getName(), capabilityinfo.getNodes());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #20  <Method String CapabilityInfo.getName()>
	//    3    7:aload_1         
	//    4    8:invokeinterface #24  <Method Set CapabilityInfo.getNodes()>
	//    5   13:invokespecial   #27  <Method void zzn$zzc(String, Set)>
	//    6   16:return          
	}

	public zzn$zzc(String s, Set set)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		mName = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field String mName>
		zzbTN = set;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #35  <Field Set zzbTN>
	//    8   14:return          
	}
}
