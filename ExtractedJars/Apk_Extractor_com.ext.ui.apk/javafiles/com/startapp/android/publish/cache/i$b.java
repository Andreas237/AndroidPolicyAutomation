// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.cache;

import com.startapp.android.publish.common.model.AdPreferences;
import java.io.Serializable;

// Referenced classes of package com.startapp.android.publish.cache:
//			i

protected static class i$b
	implements Serializable
{

	protected com.startapp.android.publish.common.model.eferences.Placement a()
	{
		return placement;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field com.startapp.android.publish.common.model.AdPreferences$Placement placement>
	//    2    4:areturn         
	}

	protected void a(int j)
	{
		numberOfLoadedAd = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #34  <Field int numberOfLoadedAd>
	//    3    5:return          
	}

	protected AdPreferences b()
	{
		return adPreferences;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field AdPreferences adPreferences>
	//    2    4:areturn         
	}

	protected int c()
	{
		return numberOfLoadedAd;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int numberOfLoadedAd>
	//    2    4:ireturn         
	}

	private static final long serialVersionUID = 1L;
	protected AdPreferences adPreferences;
	private int numberOfLoadedAd;
	protected com.startapp.android.publish.common.model.eferences.Placement placement;

	protected i$b(com.startapp.android.publish.common.model.eferences.Placement placement1, AdPreferences adpreferences)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		placement = placement1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field com.startapp.android.publish.common.model.AdPreferences$Placement placement>
		adPreferences = adpreferences;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field AdPreferences adPreferences>
	//    8   14:return          
	}
}
