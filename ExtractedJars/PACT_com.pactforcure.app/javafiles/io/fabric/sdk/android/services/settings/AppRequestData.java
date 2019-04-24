// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.settings;

import java.util.Collection;

// Referenced classes of package io.fabric.sdk.android.services.settings:
//			IconRequest

public class AppRequestData
{

	public AppRequestData(String s, String s1, String s2, String s3, String s4, String s5, int i, 
			String s6, String s7, IconRequest iconrequest, Collection collection)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		apiKey = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field String apiKey>
		appId = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field String appId>
		displayVersion = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #31  <Field String displayVersion>
		buildVersion = s3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #33  <Field String buildVersion>
		instanceIdentifier = s4;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #35  <Field String instanceIdentifier>
		name = s5;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #37  <Field String name>
		source = i;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #39  <Field int source>
		minSdkVersion = s6;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #41  <Field String minSdkVersion>
		builtSdkVersion = s7;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #43  <Field String builtSdkVersion>
		icon = iconrequest;
	//   29   55:aload_0         
	//   30   56:aload           10
	//   31   58:putfield        #45  <Field IconRequest icon>
		sdkKits = collection;
	//   32   61:aload_0         
	//   33   62:aload           11
	//   34   64:putfield        #47  <Field Collection sdkKits>
	//   35   67:return          
	}

	public final String apiKey;
	public final String appId;
	public final String buildVersion;
	public final String builtSdkVersion;
	public final String displayVersion;
	public final IconRequest icon;
	public final String instanceIdentifier;
	public final String minSdkVersion;
	public final String name;
	public final Collection sdkKits;
	public final int source;
}
