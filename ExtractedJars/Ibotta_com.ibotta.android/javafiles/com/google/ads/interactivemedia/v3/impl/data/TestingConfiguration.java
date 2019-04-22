// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl.data;

import java.util.List;
import java.util.Map;

public abstract class TestingConfiguration
{
	public static interface Builder
	{

		public abstract TestingConfiguration build();

		public abstract Builder disableExperiments(boolean flag);

		public abstract Builder enableMonitorAppLifecycle(boolean flag);

		public abstract Builder extraParams(Map map);

		public abstract Builder forceExperimentIds(List list);

		public abstract Builder forceTvMode(boolean flag);

		public abstract Builder ignoreStrictModeFalsePositives(boolean flag);

		public abstract Builder useQAStreamBaseUrl(boolean flag);

		public abstract Builder useTestStreamManager(boolean flag);

		public abstract Builder useVideoElementMock(boolean flag);

		public abstract Builder videoElementMockDuration(float f);
	}


	TestingConfiguration()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public static Builder builder()
	{
		return (new i.a()).disableExperiments(false).useVideoElementMock(false).videoElementMockDuration(30F).useTestStreamManager(false).ignoreStrictModeFalsePositives(false).forceTvMode(false).enableMonitorAppLifecycle(true).useQAStreamBaseUrl(false);
	//    0    0:new             #27  <Class i$a>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void i$a()>
	//    3    7:iconst_0        
	//    4    8:invokevirtual   #32  <Method TestingConfiguration$Builder i$a.disableExperiments(boolean)>
	//    5   11:iconst_0        
	//    6   12:invokeinterface #35  <Method TestingConfiguration$Builder TestingConfiguration$Builder.useVideoElementMock(boolean)>
	//    7   17:ldc1            #36  <Float 30F>
	//    8   19:invokeinterface #40  <Method TestingConfiguration$Builder TestingConfiguration$Builder.videoElementMockDuration(float)>
	//    9   24:iconst_0        
	//   10   25:invokeinterface #43  <Method TestingConfiguration$Builder TestingConfiguration$Builder.useTestStreamManager(boolean)>
	//   11   30:iconst_0        
	//   12   31:invokeinterface #45  <Method TestingConfiguration$Builder TestingConfiguration$Builder.ignoreStrictModeFalsePositives(boolean)>
	//   13   36:iconst_0        
	//   14   37:invokeinterface #48  <Method TestingConfiguration$Builder TestingConfiguration$Builder.forceTvMode(boolean)>
	//   15   42:iconst_1        
	//   16   43:invokeinterface #51  <Method TestingConfiguration$Builder TestingConfiguration$Builder.enableMonitorAppLifecycle(boolean)>
	//   17   48:iconst_0        
	//   18   49:invokeinterface #54  <Method TestingConfiguration$Builder TestingConfiguration$Builder.useQAStreamBaseUrl(boolean)>
	//   19   54:areturn         
	}

	public Builder copy()
	{
		return (new i.a()).disableExperiments(disableExperiments()).useVideoElementMock(useVideoElementMock()).videoElementMockDuration(videoElementMockDuration()).useQAStreamBaseUrl(useQAStreamBaseUrl()).useTestStreamManager(useTestStreamManager()).enableMonitorAppLifecycle(enableMonitorAppLifecycle()).forceTvMode(forceTvMode()).ignoreStrictModeFalsePositives(ignoreStrictModeFalsePositives()).extraParams(extraParams());
	//    0    0:new             #27  <Class i$a>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void i$a()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #58  <Method boolean disableExperiments()>
	//    5   11:invokevirtual   #32  <Method TestingConfiguration$Builder i$a.disableExperiments(boolean)>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #60  <Method boolean useVideoElementMock()>
	//    8   18:invokeinterface #35  <Method TestingConfiguration$Builder TestingConfiguration$Builder.useVideoElementMock(boolean)>
	//    9   23:aload_0         
	//   10   24:invokevirtual   #63  <Method float videoElementMockDuration()>
	//   11   27:invokeinterface #40  <Method TestingConfiguration$Builder TestingConfiguration$Builder.videoElementMockDuration(float)>
	//   12   32:aload_0         
	//   13   33:invokevirtual   #65  <Method boolean useQAStreamBaseUrl()>
	//   14   36:invokeinterface #54  <Method TestingConfiguration$Builder TestingConfiguration$Builder.useQAStreamBaseUrl(boolean)>
	//   15   41:aload_0         
	//   16   42:invokevirtual   #67  <Method boolean useTestStreamManager()>
	//   17   45:invokeinterface #43  <Method TestingConfiguration$Builder TestingConfiguration$Builder.useTestStreamManager(boolean)>
	//   18   50:aload_0         
	//   19   51:invokevirtual   #69  <Method boolean enableMonitorAppLifecycle()>
	//   20   54:invokeinterface #51  <Method TestingConfiguration$Builder TestingConfiguration$Builder.enableMonitorAppLifecycle(boolean)>
	//   21   59:aload_0         
	//   22   60:invokevirtual   #71  <Method boolean forceTvMode()>
	//   23   63:invokeinterface #48  <Method TestingConfiguration$Builder TestingConfiguration$Builder.forceTvMode(boolean)>
	//   24   68:aload_0         
	//   25   69:invokevirtual   #73  <Method boolean ignoreStrictModeFalsePositives()>
	//   26   72:invokeinterface #45  <Method TestingConfiguration$Builder TestingConfiguration$Builder.ignoreStrictModeFalsePositives(boolean)>
	//   27   77:aload_0         
	//   28   78:invokevirtual   #76  <Method Map extraParams()>
	//   29   81:invokeinterface #79  <Method TestingConfiguration$Builder TestingConfiguration$Builder.extraParams(Map)>
	//   30   86:areturn         
	}

	public abstract boolean disableExperiments();

	public abstract boolean enableMonitorAppLifecycle();

	public abstract Map extraParams();

	public abstract List forceExperimentIds();

	public abstract boolean forceTvMode();

	public abstract boolean ignoreStrictModeFalsePositives();

	public abstract boolean useQAStreamBaseUrl();

	public abstract boolean useTestStreamManager();

	public abstract boolean useVideoElementMock();

	public abstract float videoElementMockDuration();

	public static final String PARAMETER_KEY = "tcnfp";
}
