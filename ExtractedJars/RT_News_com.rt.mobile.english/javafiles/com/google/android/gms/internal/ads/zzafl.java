// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzagk, zzaef, zzaga

public final class zzafl
{

	public zzafl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		zzcgu = new JSONObject();
	//    2    4:aload_0         
	//    3    5:new             #36  <Class JSONObject>
	//    4    8:dup             
	//    5    9:invokespecial   #37  <Method void JSONObject()>
	//    6   12:putfield        #39  <Field JSONObject zzcgu>
		zzcdj = ((List) (new ArrayList()));
	//    7   15:aload_0         
	//    8   16:new             #41  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #42  <Method void ArrayList()>
	//   11   23:putfield        #44  <Field List zzcdj>
	//   12   26:return          
	}

	public Location zzaqe;
	public String zzccx;
	public Bundle zzcdc;
	public List zzcdj;
	public Bundle zzcgn;
	public zzagk zzcgo;
	public String zzcgp;
	public String zzcgq;
	public com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zzcgr;
	public zzaef zzcgs;
	public zzaga zzcgt;
	public JSONObject zzcgu;
	public boolean zzcgv;
}
