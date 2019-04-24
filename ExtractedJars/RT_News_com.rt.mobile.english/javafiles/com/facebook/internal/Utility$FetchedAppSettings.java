// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import java.util.Map;

// Referenced classes of package com.facebook.internal:
//			Utility, FacebookRequestErrorClassification

public static class Utility$FetchedAppSettings
{

	public Map getDialogConfigurations()
	{
		return dialogConfigMap;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Map dialogConfigMap>
	//    2    4:areturn         
	}

	public FacebookRequestErrorClassification getErrorClassification()
	{
		return errorClassification;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field FacebookRequestErrorClassification errorClassification>
	//    2    4:areturn         
	}

	public String getNuxContent()
	{
		return nuxContent;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String nuxContent>
	//    2    4:areturn         
	}

	public boolean getNuxEnabled()
	{
		return nuxEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field boolean nuxEnabled>
	//    2    4:ireturn         
	}

	public boolean supportsImplicitLogging()
	{
		return supportsImplicitLogging;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field boolean supportsImplicitLogging>
	//    2    4:ireturn         
	}

	private Map dialogConfigMap;
	private FacebookRequestErrorClassification errorClassification;
	private String nuxContent;
	private boolean nuxEnabled;
	private boolean supportsImplicitLogging;

	private Utility$FetchedAppSettings(boolean flag, String s, boolean flag1, Map map, FacebookRequestErrorClassification facebookrequesterrorclassification)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		supportsImplicitLogging = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #24  <Field boolean supportsImplicitLogging>
		nuxContent = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field String nuxContent>
		nuxEnabled = flag1;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #28  <Field boolean nuxEnabled>
		dialogConfigMap = map;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #30  <Field Map dialogConfigMap>
		errorClassification = facebookrequesterrorclassification;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #32  <Field FacebookRequestErrorClassification errorClassification>
	//   17   31:return          
	}

	Utility$FetchedAppSettings(boolean flag, String s, boolean flag1, Map map, FacebookRequestErrorClassification facebookrequesterrorclassification, Utility._cls1 _pcls1)
	{
		this(flag, s, flag1, map, facebookrequesterrorclassification);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #38  <Method void Utility$FetchedAppSettings(boolean, String, boolean, Map, FacebookRequestErrorClassification)>
	//    7   11:return          
	}
}
