// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.metaData.d;
import com.startapp.android.publish.common.model.AdPreferences;

// Referenced classes of package com.startapp.android.publish.adsCommon:
//			Ad

class Ad$2
	implements d
{

	public void a()
	{
		MetaData.getInstance().removeMetaDataListener(((d) (this)));
	//    0    0:invokestatic    #35  <Method MetaData MetaData.getInstance()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #39  <Method void MetaData.removeMetaDataListener(d)>
		c.loadAds(a, b);
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field Ad c>
	//    5   11:aload_0         
	//    6   12:getfield        #23  <Field AdPreferences a>
	//    7   15:aload_0         
	//    8   16:getfield        #25  <Field AdEventListener b>
	//    9   19:invokevirtual   #43  <Method void Ad.loadAds(AdPreferences, AdEventListener)>
	//   10   22:return          
	}

	public void b()
	{
		MetaData.getInstance().removeMetaDataListener(((d) (this)));
	//    0    0:invokestatic    #35  <Method MetaData MetaData.getInstance()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #39  <Method void MetaData.removeMetaDataListener(d)>
		c.loadAds(a, b);
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field Ad c>
	//    5   11:aload_0         
	//    6   12:getfield        #23  <Field AdPreferences a>
	//    7   15:aload_0         
	//    8   16:getfield        #25  <Field AdEventListener b>
	//    9   19:invokevirtual   #43  <Method void Ad.loadAds(AdPreferences, AdEventListener)>
	//   10   22:return          
	}

	final AdPreferences a;
	final AdEventListener b;
	final Ad c;

	Ad$2(Ad ad, AdPreferences adpreferences, AdEventListener adeventlistener)
	{
		c = ad;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field Ad c>
		a = adpreferences;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field AdPreferences a>
		b = adeventlistener;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field AdEventListener b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
