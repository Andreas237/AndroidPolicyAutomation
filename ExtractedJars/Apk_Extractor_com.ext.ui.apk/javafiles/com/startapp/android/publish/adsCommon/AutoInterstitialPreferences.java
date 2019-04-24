// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import java.io.Serializable;

// Referenced classes of package com.startapp.android.publish.adsCommon:
//			b

public class AutoInterstitialPreferences
	implements Serializable
{

	public AutoInterstitialPreferences()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		setActivitiesBetweenAds(b.a().I());
	//    2    4:aload_0         
	//    3    5:invokestatic    #23  <Method b b.a()>
	//    4    8:invokevirtual   #26  <Method int b.I()>
	//    5   11:invokevirtual   #30  <Method AutoInterstitialPreferences setActivitiesBetweenAds(int)>
	//    6   14:pop             
		setSecondsBetweenAds(b.a().J());
	//    7   15:aload_0         
	//    8   16:invokestatic    #23  <Method b b.a()>
	//    9   19:invokevirtual   #32  <Method int b.J()>
	//   10   22:invokevirtual   #35  <Method AutoInterstitialPreferences setSecondsBetweenAds(int)>
	//   11   25:pop             
	//   12   26:return          
	}

	public int getActivitiesBetweenAds()
	{
		return activitiesBetweenAds;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int activitiesBetweenAds>
	//    2    4:ireturn         
	}

	public int getSecondsBetweenAds()
	{
		return secondsBetweenAds;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int secondsBetweenAds>
	//    2    4:ireturn         
	}

	public AutoInterstitialPreferences setActivitiesBetweenAds(int i)
	{
		if(i < 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmplt          12
	//*   3    5:aload_0         
	//*   4    6:iload_1         
	//*   5    7:putfield        #39  <Field int activitiesBetweenAds>
	//*   6   10:aload_0         
	//*   7   11:areturn         
			i = 1;
	//    8   12:iconst_1        
	//    9   13:istore_1        
		activitiesBetweenAds = i;
		return this;
	//*  10   14:goto            5
	}

	public AutoInterstitialPreferences setSecondsBetweenAds(int i)
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            11
	//*   2    4:aload_0         
	//*   3    5:iload_1         
	//*   4    6:putfield        #42  <Field int secondsBetweenAds>
	//*   5    9:aload_0         
	//*   6   10:areturn         
			i = 0;
	//    7   11:iconst_0        
	//    8   12:istore_1        
		secondsBetweenAds = i;
		return this;
	//*   9   13:goto            4
	}

	public String toString()
	{
		return (new StringBuilder()).append("AutoInterstitialPreferences [activitiesBetweenAds=").append(activitiesBetweenAds).append(", secondsBetweenAds=").append(secondsBetweenAds).append("]").toString();
	//    0    0:new             #46  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #47  <Method void StringBuilder()>
	//    3    7:ldc1            #49  <String "AutoInterstitialPreferences [activitiesBetweenAds=">
	//    4    9:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #39  <Field int activitiesBetweenAds>
	//    7   16:invokevirtual   #56  <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #58  <String ", secondsBetweenAds=">
	//    9   21:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #42  <Field int secondsBetweenAds>
	//   12   28:invokevirtual   #56  <Method StringBuilder StringBuilder.append(int)>
	//   13   31:ldc1            #60  <String "]">
	//   14   33:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   16   39:areturn         
	}

	private static final long serialVersionUID = 1L;
	private int activitiesBetweenAds;
	private int secondsBetweenAds;
}
