// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.settings;


public class BetaSettingsData
{

	public BetaSettingsData(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		updateUrl = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field String updateUrl>
		updateSuspendDurationSeconds = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #17  <Field int updateSuspendDurationSeconds>
	//    8   14:return          
	}

	public final int updateSuspendDurationSeconds;
	public final String updateUrl;
}
