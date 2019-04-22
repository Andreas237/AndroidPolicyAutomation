// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl.data;

import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl.data:
//			TestingConfiguration

public static interface TestingConfiguration$Builder
{

	public abstract TestingConfiguration build();

	public abstract TestingConfiguration$Builder disableExperiments(boolean flag);

	public abstract TestingConfiguration$Builder enableMonitorAppLifecycle(boolean flag);

	public abstract TestingConfiguration$Builder extraParams(Map map);

	public abstract TestingConfiguration$Builder forceExperimentIds(List list);

	public abstract TestingConfiguration$Builder forceTvMode(boolean flag);

	public abstract TestingConfiguration$Builder ignoreStrictModeFalsePositives(boolean flag);

	public abstract TestingConfiguration$Builder useQAStreamBaseUrl(boolean flag);

	public abstract TestingConfiguration$Builder useTestStreamManager(boolean flag);

	public abstract TestingConfiguration$Builder useVideoElementMock(boolean flag);

	public abstract TestingConfiguration$Builder videoElementMockDuration(float f);
}
