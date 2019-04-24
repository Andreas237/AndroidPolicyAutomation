// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.settings;


// Referenced classes of package io.fabric.sdk.android.services.settings:
//			AppIconSettingsData

public class AppSettingsData
{

	public AppSettingsData(String s, String s1, String s2, String s3, boolean flag, AppIconSettingsData appiconsettingsdata)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		identifier = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field String identifier>
		status = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field String status>
		url = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #33  <Field String url>
		reportsUrl = s3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #35  <Field String reportsUrl>
		updateRequired = flag;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #37  <Field boolean updateRequired>
		icon = appiconsettingsdata;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #39  <Field AppIconSettingsData icon>
	//   20   37:return          
	}

	public static final String STATUS_ACTIVATED = "activated";
	public static final String STATUS_CONFIGURED = "configured";
	public static final String STATUS_NEW = "new";
	public final AppIconSettingsData icon;
	public final String identifier;
	public final String reportsUrl;
	public final String status;
	public final boolean updateRequired;
	public final String url;
}
