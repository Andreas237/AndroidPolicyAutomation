// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;

// Referenced classes of package com.irobot.home:
//			RobotSoftwareUpdateActivity

static class RobotSoftwareUpdateActivity$1
{

	static final int a[];
	static final int b[];
	static final int c[];

	static 
	{
		c = new int[SoftwareUpdateStatus.values().length];
	//    0    0:invokestatic    #20  <Method SoftwareUpdateStatus[] SoftwareUpdateStatus.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #22  <Field int[] c>
		try
		{
			c[SoftwareUpdateStatus.InProgress.ordinal()] = 1;
	//    4    9:getstatic       #22  <Field int[] c>
	//    5   12:getstatic       #26  <Field SoftwareUpdateStatus SoftwareUpdateStatus.InProgress>
	//    6   15:invokevirtual   #30  <Method int SoftwareUpdateStatus.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #22  <Field int[] c>
	//*  10   23:getstatic       #33  <Field SoftwareUpdateStatus SoftwareUpdateStatus.AvailableAndReady>
	//*  11   26:invokevirtual   #30  <Method int SoftwareUpdateStatus.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #22  <Field int[] c>
	//*  15   34:getstatic       #36  <Field SoftwareUpdateStatus SoftwareUpdateStatus.UpToDate>
	//*  16   37:invokevirtual   #30  <Method int SoftwareUpdateStatus.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #22  <Field int[] c>
	//*  20   45:getstatic       #39  <Field SoftwareUpdateStatus SoftwareUpdateStatus.Unavailable>
	//*  21   48:invokevirtual   #30  <Method int SoftwareUpdateStatus.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:invokestatic    #44  <Method ExpeditedOtaStatus[] ExpeditedOtaStatus.values()>
	//*  25   56:arraylength     
	//*  26   57:newarray        int[]
	//*  27   59:putstatic       #46  <Field int[] b>
	//*  28   62:getstatic       #46  <Field int[] b>
	//*  29   65:getstatic       #50  <Field ExpeditedOtaStatus ExpeditedOtaStatus.Available>
	//*  30   68:invokevirtual   #51  <Method int ExpeditedOtaStatus.ordinal()>
	//*  31   71:iconst_1        
	//*  32   72:iastore         
	//*  33   73:getstatic       #46  <Field int[] b>
	//*  34   76:getstatic       #54  <Field ExpeditedOtaStatus ExpeditedOtaStatus.AvailableViewed>
	//*  35   79:invokevirtual   #51  <Method int ExpeditedOtaStatus.ordinal()>
	//*  36   82:iconst_2        
	//*  37   83:iastore         
	//*  38   84:getstatic       #46  <Field int[] b>
	//*  39   87:getstatic       #57  <Field ExpeditedOtaStatus ExpeditedOtaStatus.RequestStarted>
	//*  40   90:invokevirtual   #51  <Method int ExpeditedOtaStatus.ordinal()>
	//*  41   93:iconst_3        
	//*  42   94:iastore         
	//*  43   95:getstatic       #46  <Field int[] b>
	//*  44   98:getstatic       #60  <Field ExpeditedOtaStatus ExpeditedOtaStatus.RequestFailed>
	//*  45  101:invokevirtual   #51  <Method int ExpeditedOtaStatus.ordinal()>
	//*  46  104:iconst_4        
	//*  47  105:iastore         
	//*  48  106:getstatic       #46  <Field int[] b>
	//*  49  109:getstatic       #63  <Field ExpeditedOtaStatus ExpeditedOtaStatus.RequestSuccessful>
	//*  50  112:invokevirtual   #51  <Method int ExpeditedOtaStatus.ordinal()>
	//*  51  115:iconst_5        
	//*  52  116:iastore         
	//*  53  117:getstatic       #46  <Field int[] b>
	//*  54  120:getstatic       #66  <Field ExpeditedOtaStatus ExpeditedOtaStatus.RetryAvailable>
	//*  55  123:invokevirtual   #51  <Method int ExpeditedOtaStatus.ordinal()>
	//*  56  126:bipush          6
	//*  57  128:iastore         
	//*  58  129:getstatic       #46  <Field int[] b>
	//*  59  132:getstatic       #69  <Field ExpeditedOtaStatus ExpeditedOtaStatus.RetryUnavailable>
	//*  60  135:invokevirtual   #51  <Method int ExpeditedOtaStatus.ordinal()>
	//*  61  138:bipush          7
	//*  62  140:iastore         
	//*  63  141:getstatic       #46  <Field int[] b>
	//*  64  144:getstatic       #71  <Field ExpeditedOtaStatus ExpeditedOtaStatus.Unavailable>
	//*  65  147:invokevirtual   #51  <Method int ExpeditedOtaStatus.ordinal()>
	//*  66  150:bipush          8
	//*  67  152:iastore         
	//*  68  153:getstatic       #46  <Field int[] b>
	//*  69  156:getstatic       #74  <Field ExpeditedOtaStatus ExpeditedOtaStatus.Unknown>
	//*  70  159:invokevirtual   #51  <Method int ExpeditedOtaStatus.ordinal()>
	//*  71  162:bipush          9
	//*  72  164:iastore         
	//*  73  165:invokestatic    #79  <Method OTAUIServiceDataState[] OTAUIServiceDataState.values()>
	//*  74  168:arraylength     
	//*  75  169:newarray        int[]
	//*  76  171:putstatic       #81  <Field int[] a>
	//*  77  174:getstatic       #81  <Field int[] a>
	//*  78  177:getstatic       #85  <Field OTAUIServiceDataState OTAUIServiceDataState.ExpeditedOTAStatus>
	//*  79  180:invokevirtual   #86  <Method int OTAUIServiceDataState.ordinal()>
	//*  80  183:iconst_1        
	//*  81  184:iastore         
	//*  82  185:getstatic       #81  <Field int[] a>
	//*  83  188:getstatic       #89  <Field OTAUIServiceDataState OTAUIServiceDataState.SoftwareUpdateStatus>
	//*  84  191:invokevirtual   #86  <Method int OTAUIServiceDataState.ordinal()>
	//*  85  194:iconst_2        
	//*  86  195:iastore         
	//*  87  196:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   88  197:astore_0        
		try
		{
			c[SoftwareUpdateStatus.AvailableAndReady.ordinal()] = 2;
		}
	//*  89  198:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   90  201:astore_0        
		try
		{
			c[SoftwareUpdateStatus.UpToDate.ordinal()] = 3;
		}
	//*  91  202:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   92  205:astore_0        
		try
		{
			c[SoftwareUpdateStatus.Unavailable.ordinal()] = 4;
		}
	//*  93  206:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   94  209:astore_0        
		b = new int[ExpeditedOtaStatus.values().length];
		try
		{
			b[ExpeditedOtaStatus.Available.ordinal()] = 1;
		}
	//*  95  210:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   96  213:astore_0        
		try
		{
			b[ExpeditedOtaStatus.AvailableViewed.ordinal()] = 2;
		}
	//*  97  214:goto            73
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   98  217:astore_0        
		try
		{
			b[ExpeditedOtaStatus.RequestStarted.ordinal()] = 3;
		}
	//*  99  218:goto            84
		catch(NoSuchFieldError nosuchfielderror6) { }
	//  100  221:astore_0        
		try
		{
			b[ExpeditedOtaStatus.RequestFailed.ordinal()] = 4;
		}
	//* 101  222:goto            95
		catch(NoSuchFieldError nosuchfielderror7) { }
	//  102  225:astore_0        
		try
		{
			b[ExpeditedOtaStatus.RequestSuccessful.ordinal()] = 5;
		}
	//* 103  226:goto            106
		catch(NoSuchFieldError nosuchfielderror8) { }
	//  104  229:astore_0        
		try
		{
			b[ExpeditedOtaStatus.RetryAvailable.ordinal()] = 6;
		}
	//* 105  230:goto            117
		catch(NoSuchFieldError nosuchfielderror9) { }
	//  106  233:astore_0        
		try
		{
			b[ExpeditedOtaStatus.RetryUnavailable.ordinal()] = 7;
		}
	//* 107  234:goto            129
		catch(NoSuchFieldError nosuchfielderror10) { }
	//  108  237:astore_0        
		try
		{
			b[ExpeditedOtaStatus.Unavailable.ordinal()] = 8;
		}
	//* 109  238:goto            141
		catch(NoSuchFieldError nosuchfielderror11) { }
	//  110  241:astore_0        
		try
		{
			b[ExpeditedOtaStatus.Unknown.ordinal()] = 9;
		}
	//* 111  242:goto            153
		catch(NoSuchFieldError nosuchfielderror12) { }
	//  112  245:astore_0        
		a = new int[OTAUIServiceDataState.values().length];
		try
		{
			a[OTAUIServiceDataState.ExpeditedOTAStatus.ordinal()] = 1;
		}
	//* 113  246:goto            165
		catch(NoSuchFieldError nosuchfielderror13) { }
	//  114  249:astore_0        
		try
		{
			a[OTAUIServiceDataState.SoftwareUpdateStatus.ordinal()] = 2;
		}
	//* 115  250:goto            185
		catch(NoSuchFieldError nosuchfielderror14) { }
	//  116  253:astore_0        
	//* 117  254:return          
	}
}
