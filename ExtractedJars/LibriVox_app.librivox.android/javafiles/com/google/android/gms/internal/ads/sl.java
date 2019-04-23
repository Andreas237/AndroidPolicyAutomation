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
//			zzasi, sw

public final class sl
{

	public sl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		k = new JSONObject();
	//    2    4:aload_0         
	//    3    5:new             #32  <Class JSONObject>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void JSONObject()>
	//    6   12:putfield        #35  <Field JSONObject k>
		c = ((List) (new ArrayList()));
	//    7   15:aload_0         
	//    8   16:new             #37  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #38  <Method void ArrayList()>
	//   11   23:putfield        #40  <Field List c>
	//   12   26:return          
	}

	public Bundle a;
	public Bundle b;
	public List c;
	public Location d;
	public String e;
	public String f;
	public String g;
	public com.google.android.gms.ads.identifier.AdvertisingIdClient.Info h;
	public zzasi i;
	public sw j;
	public JSONObject k;
	public boolean l;
}
