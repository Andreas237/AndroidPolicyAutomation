// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.settings;


public class FeaturesSettingsData
{

	public FeaturesSettingsData(boolean flag, boolean flag1, boolean flag2, boolean flag3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		promptEnabled = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #16  <Field boolean promptEnabled>
		collectLoggedException = flag1;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #18  <Field boolean collectLoggedException>
		collectReports = flag2;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #20  <Field boolean collectReports>
		collectAnalytics = flag3;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #22  <Field boolean collectAnalytics>
	//   14   25:return          
	}

	public final boolean collectAnalytics;
	public final boolean collectLoggedException;
	public final boolean collectReports;
	public final boolean promptEnabled;
}
