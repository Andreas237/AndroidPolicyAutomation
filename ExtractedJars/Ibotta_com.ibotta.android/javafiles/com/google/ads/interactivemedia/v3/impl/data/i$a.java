// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl.data;

import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl.data:
//			i, TestingConfiguration

static final class i$a
	implements ingConfiguration.Builder
{

	public TestingConfiguration build()
	{
		String s1 = "";
	//    0    0:ldc1            #92  <String "">
	//    1    2:astore_2        
		if(disableExperiments == null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #44  <Field Boolean disableExperiments>
	//*   4    7:ifnonnull       21
			s1 = String.valueOf("").concat(" disableExperiments");
	//    5   10:ldc1            #92  <String "">
	//    6   12:invokestatic    #97  <Method String String.valueOf(Object)>
	//    7   15:ldc1            #99  <String " disableExperiments">
	//    8   17:invokevirtual   #103 <Method String String.concat(String)>
	//    9   20:astore_2        
		String s = s1;
	//   10   21:aload_2         
	//   11   22:astore_1        
		if(useVideoElementMock == null)
	//*  12   23:aload_0         
	//*  13   24:getfield        #48  <Field Boolean useVideoElementMock>
	//*  14   27:ifnonnull       40
			s = String.valueOf(((Object) (s1))).concat(" useVideoElementMock");
	//   15   30:aload_2         
	//   16   31:invokestatic    #97  <Method String String.valueOf(Object)>
	//   17   34:ldc1            #105 <String " useVideoElementMock">
	//   18   36:invokevirtual   #103 <Method String String.concat(String)>
	//   19   39:astore_1        
		s1 = s;
	//   20   40:aload_1         
	//   21   41:astore_2        
		if(videoElementMockDuration == null)
	//*  22   42:aload_0         
	//*  23   43:getfield        #58  <Field Float videoElementMockDuration>
	//*  24   46:ifnonnull       59
			s1 = String.valueOf(((Object) (s))).concat(" videoElementMockDuration");
	//   25   49:aload_1         
	//   26   50:invokestatic    #97  <Method String String.valueOf(Object)>
	//   27   53:ldc1            #107 <String " videoElementMockDuration">
	//   28   55:invokevirtual   #103 <Method String String.concat(String)>
	//   29   58:astore_2        
		s = s1;
	//   30   59:aload_2         
	//   31   60:astore_1        
		if(useQAStreamBaseUrl == null)
	//*  32   61:aload_0         
	//*  33   62:getfield        #62  <Field Boolean useQAStreamBaseUrl>
	//*  34   65:ifnonnull       78
			s = String.valueOf(((Object) (s1))).concat(" useQAStreamBaseUrl");
	//   35   68:aload_2         
	//   36   69:invokestatic    #97  <Method String String.valueOf(Object)>
	//   37   72:ldc1            #109 <String " useQAStreamBaseUrl">
	//   38   74:invokevirtual   #103 <Method String String.concat(String)>
	//   39   77:astore_1        
		s1 = s;
	//   40   78:aload_1         
	//   41   79:astore_2        
		if(useTestStreamManager == null)
	//*  42   80:aload_0         
	//*  43   81:getfield        #66  <Field Boolean useTestStreamManager>
	//*  44   84:ifnonnull       97
			s1 = String.valueOf(((Object) (s))).concat(" useTestStreamManager");
	//   45   87:aload_1         
	//   46   88:invokestatic    #97  <Method String String.valueOf(Object)>
	//   47   91:ldc1            #111 <String " useTestStreamManager">
	//   48   93:invokevirtual   #103 <Method String String.concat(String)>
	//   49   96:astore_2        
		s = s1;
	//   50   97:aload_2         
	//   51   98:astore_1        
		if(enableMonitorAppLifecycle == null)
	//*  52   99:aload_0         
	//*  53  100:getfield        #70  <Field Boolean enableMonitorAppLifecycle>
	//*  54  103:ifnonnull       116
			s = String.valueOf(((Object) (s1))).concat(" enableMonitorAppLifecycle");
	//   55  106:aload_2         
	//   56  107:invokestatic    #97  <Method String String.valueOf(Object)>
	//   57  110:ldc1            #113 <String " enableMonitorAppLifecycle">
	//   58  112:invokevirtual   #103 <Method String String.concat(String)>
	//   59  115:astore_1        
		s1 = s;
	//   60  116:aload_1         
	//   61  117:astore_2        
		if(forceTvMode == null)
	//*  62  118:aload_0         
	//*  63  119:getfield        #79  <Field Boolean forceTvMode>
	//*  64  122:ifnonnull       135
			s1 = String.valueOf(((Object) (s))).concat(" forceTvMode");
	//   65  125:aload_1         
	//   66  126:invokestatic    #97  <Method String String.valueOf(Object)>
	//   67  129:ldc1            #115 <String " forceTvMode">
	//   68  131:invokevirtual   #103 <Method String String.concat(String)>
	//   69  134:astore_2        
		s = s1;
	//   70  135:aload_2         
	//   71  136:astore_1        
		if(ignoreStrictModeFalsePositives == null)
	//*  72  137:aload_0         
	//*  73  138:getfield        #83  <Field Boolean ignoreStrictModeFalsePositives>
	//*  74  141:ifnonnull       154
			s = String.valueOf(((Object) (s1))).concat(" ignoreStrictModeFalsePositives");
	//   75  144:aload_2         
	//   76  145:invokestatic    #97  <Method String String.valueOf(Object)>
	//   77  148:ldc1            #117 <String " ignoreStrictModeFalsePositives">
	//   78  150:invokevirtual   #103 <Method String String.concat(String)>
	//   79  153:astore_1        
		if(!s.isEmpty())
	//*  80  154:aload_1         
	//*  81  155:invokevirtual   #120 <Method boolean String.isEmpty()>
	//*  82  158:ifne            202
		{
			s = String.valueOf(((Object) (s)));
	//   83  161:aload_1         
	//   84  162:invokestatic    #97  <Method String String.valueOf(Object)>
	//   85  165:astore_1        
			if(s.length() != 0)
	//*  86  166:aload_1         
	//*  87  167:invokevirtual   #124 <Method int String.length()>
	//*  88  170:ifeq            183
				s = "Missing required properties:".concat(s);
	//   89  173:ldc1            #126 <String "Missing required properties:">
	//   90  175:aload_1         
	//   91  176:invokevirtual   #103 <Method String String.concat(String)>
	//   92  179:astore_1        
			else
	//*  93  180:goto            193
				s = new String("Missing required properties:");
	//   94  183:new             #94  <Class String>
	//   95  186:dup             
	//   96  187:ldc1            #126 <String "Missing required properties:">
	//   97  189:invokespecial   #129 <Method void String(String)>
	//   98  192:astore_1        
			throw new IllegalStateException(s);
	//   99  193:new             #131 <Class IllegalStateException>
	//  100  196:dup             
	//  101  197:aload_1         
	//  102  198:invokespecial   #132 <Method void IllegalStateException(String)>
	//  103  201:athrow          
		} else
		{
			return ((TestingConfiguration) (new i(disableExperiments.booleanValue(), useVideoElementMock.booleanValue(), videoElementMockDuration.floatValue(), useQAStreamBaseUrl.booleanValue(), useTestStreamManager.booleanValue(), enableMonitorAppLifecycle.booleanValue(), forceExperimentIds, forceTvMode.booleanValue(), ignoreStrictModeFalsePositives.booleanValue(), extraParams, ((i$1) (null)))));
	//  104  202:new             #8   <Class i>
	//  105  205:dup             
	//  106  206:aload_0         
	//  107  207:getfield        #44  <Field Boolean disableExperiments>
	//  108  210:invokevirtual   #135 <Method boolean Boolean.booleanValue()>
	//  109  213:aload_0         
	//  110  214:getfield        #48  <Field Boolean useVideoElementMock>
	//  111  217:invokevirtual   #135 <Method boolean Boolean.booleanValue()>
	//  112  220:aload_0         
	//  113  221:getfield        #58  <Field Float videoElementMockDuration>
	//  114  224:invokevirtual   #138 <Method float Float.floatValue()>
	//  115  227:aload_0         
	//  116  228:getfield        #62  <Field Boolean useQAStreamBaseUrl>
	//  117  231:invokevirtual   #135 <Method boolean Boolean.booleanValue()>
	//  118  234:aload_0         
	//  119  235:getfield        #66  <Field Boolean useTestStreamManager>
	//  120  238:invokevirtual   #135 <Method boolean Boolean.booleanValue()>
	//  121  241:aload_0         
	//  122  242:getfield        #70  <Field Boolean enableMonitorAppLifecycle>
	//  123  245:invokevirtual   #135 <Method boolean Boolean.booleanValue()>
	//  124  248:aload_0         
	//  125  249:getfield        #75  <Field List forceExperimentIds>
	//  126  252:aload_0         
	//  127  253:getfield        #79  <Field Boolean forceTvMode>
	//  128  256:invokevirtual   #135 <Method boolean Boolean.booleanValue()>
	//  129  259:aload_0         
	//  130  260:getfield        #83  <Field Boolean ignoreStrictModeFalsePositives>
	//  131  263:invokevirtual   #135 <Method boolean Boolean.booleanValue()>
	//  132  266:aload_0         
	//  133  267:getfield        #88  <Field Map extraParams>
	//  134  270:aconst_null     
	//  135  271:invokespecial   #141 <Method void i(boolean, boolean, float, boolean, boolean, boolean, List, boolean, boolean, Map, i$1)>
	//  136  274:areturn         
		}
	}

	public ingConfiguration.Builder disableExperiments(boolean flag)
	{
		disableExperiments = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #42  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #44  <Field Boolean disableExperiments>
		return ((ingConfiguration.Builder) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public ingConfiguration.Builder enableMonitorAppLifecycle(boolean flag)
	{
		enableMonitorAppLifecycle = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #42  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #70  <Field Boolean enableMonitorAppLifecycle>
		return ((ingConfiguration.Builder) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public ingConfiguration.Builder extraParams(Map map)
	{
		extraParams = map;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #88  <Field Map extraParams>
		return ((ingConfiguration.Builder) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ingConfiguration.Builder forceExperimentIds(List list)
	{
		forceExperimentIds = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #75  <Field List forceExperimentIds>
		return ((ingConfiguration.Builder) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ingConfiguration.Builder forceTvMode(boolean flag)
	{
		forceTvMode = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #42  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #79  <Field Boolean forceTvMode>
		return ((ingConfiguration.Builder) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public ingConfiguration.Builder ignoreStrictModeFalsePositives(boolean flag)
	{
		ignoreStrictModeFalsePositives = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #42  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #83  <Field Boolean ignoreStrictModeFalsePositives>
		return ((ingConfiguration.Builder) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public ingConfiguration.Builder useQAStreamBaseUrl(boolean flag)
	{
		useQAStreamBaseUrl = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #42  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #62  <Field Boolean useQAStreamBaseUrl>
		return ((ingConfiguration.Builder) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public ingConfiguration.Builder useTestStreamManager(boolean flag)
	{
		useTestStreamManager = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #42  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #66  <Field Boolean useTestStreamManager>
		return ((ingConfiguration.Builder) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public ingConfiguration.Builder useVideoElementMock(boolean flag)
	{
		useVideoElementMock = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #42  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #48  <Field Boolean useVideoElementMock>
		return ((ingConfiguration.Builder) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public ingConfiguration.Builder videoElementMockDuration(float f)
	{
		videoElementMockDuration = Float.valueOf(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #56  <Method Float Float.valueOf(float)>
	//    3    5:putfield        #58  <Field Float videoElementMockDuration>
		return ((ingConfiguration.Builder) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	private Boolean disableExperiments;
	private Boolean enableMonitorAppLifecycle;
	private Map extraParams;
	private List forceExperimentIds;
	private Boolean forceTvMode;
	private Boolean ignoreStrictModeFalsePositives;
	private Boolean useQAStreamBaseUrl;
	private Boolean useTestStreamManager;
	private Boolean useVideoElementMock;
	private Float videoElementMockDuration;

	i$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:return          
	}

	private i$a(TestingConfiguration testingconfiguration)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		disableExperiments = Boolean.valueOf(testingconfiguration.disableExperiments());
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #36  <Method boolean TestingConfiguration.disableExperiments()>
	//    5    9:invokestatic    #42  <Method Boolean Boolean.valueOf(boolean)>
	//    6   12:putfield        #44  <Field Boolean disableExperiments>
		useVideoElementMock = Boolean.valueOf(testingconfiguration.useVideoElementMock());
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #46  <Method boolean TestingConfiguration.useVideoElementMock()>
	//   10   20:invokestatic    #42  <Method Boolean Boolean.valueOf(boolean)>
	//   11   23:putfield        #48  <Field Boolean useVideoElementMock>
		videoElementMockDuration = Float.valueOf(testingconfiguration.videoElementMockDuration());
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokevirtual   #51  <Method float TestingConfiguration.videoElementMockDuration()>
	//   15   31:invokestatic    #56  <Method Float Float.valueOf(float)>
	//   16   34:putfield        #58  <Field Float videoElementMockDuration>
		useQAStreamBaseUrl = Boolean.valueOf(testingconfiguration.useQAStreamBaseUrl());
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:invokevirtual   #60  <Method boolean TestingConfiguration.useQAStreamBaseUrl()>
	//   20   42:invokestatic    #42  <Method Boolean Boolean.valueOf(boolean)>
	//   21   45:putfield        #62  <Field Boolean useQAStreamBaseUrl>
		useTestStreamManager = Boolean.valueOf(testingconfiguration.useTestStreamManager());
	//   22   48:aload_0         
	//   23   49:aload_1         
	//   24   50:invokevirtual   #64  <Method boolean TestingConfiguration.useTestStreamManager()>
	//   25   53:invokestatic    #42  <Method Boolean Boolean.valueOf(boolean)>
	//   26   56:putfield        #66  <Field Boolean useTestStreamManager>
		enableMonitorAppLifecycle = Boolean.valueOf(testingconfiguration.enableMonitorAppLifecycle());
	//   27   59:aload_0         
	//   28   60:aload_1         
	//   29   61:invokevirtual   #68  <Method boolean TestingConfiguration.enableMonitorAppLifecycle()>
	//   30   64:invokestatic    #42  <Method Boolean Boolean.valueOf(boolean)>
	//   31   67:putfield        #70  <Field Boolean enableMonitorAppLifecycle>
		forceExperimentIds = testingconfiguration.forceExperimentIds();
	//   32   70:aload_0         
	//   33   71:aload_1         
	//   34   72:invokevirtual   #73  <Method List TestingConfiguration.forceExperimentIds()>
	//   35   75:putfield        #75  <Field List forceExperimentIds>
		forceTvMode = Boolean.valueOf(testingconfiguration.forceTvMode());
	//   36   78:aload_0         
	//   37   79:aload_1         
	//   38   80:invokevirtual   #77  <Method boolean TestingConfiguration.forceTvMode()>
	//   39   83:invokestatic    #42  <Method Boolean Boolean.valueOf(boolean)>
	//   40   86:putfield        #79  <Field Boolean forceTvMode>
		ignoreStrictModeFalsePositives = Boolean.valueOf(testingconfiguration.ignoreStrictModeFalsePositives());
	//   41   89:aload_0         
	//   42   90:aload_1         
	//   43   91:invokevirtual   #81  <Method boolean TestingConfiguration.ignoreStrictModeFalsePositives()>
	//   44   94:invokestatic    #42  <Method Boolean Boolean.valueOf(boolean)>
	//   45   97:putfield        #83  <Field Boolean ignoreStrictModeFalsePositives>
		extraParams = testingconfiguration.extraParams();
	//   46  100:aload_0         
	//   47  101:aload_1         
	//   48  102:invokevirtual   #86  <Method Map TestingConfiguration.extraParams()>
	//   49  105:putfield        #88  <Field Map extraParams>
	//   50  108:return          
	}
}
