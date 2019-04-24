// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.AccountViewState;

// Referenced classes of package com.irobot.home:
//			PrivacySettingsActivity

static class PrivacySettingsActivity$1
{

	static final int a[];

	static 
	{
		a = new int[AccountViewState.values().length];
	//    0    0:invokestatic    #18  <Method AccountViewState[] AccountViewState.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] a>
		try
		{
			a[AccountViewState.ShowPrivacySettingsLoadingIndicator.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] a>
	//    5   12:getstatic       #24  <Field AccountViewState AccountViewState.ShowPrivacySettingsLoadingIndicator>
	//    6   15:invokevirtual   #28  <Method int AccountViewState.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] a>
	//*  10   23:getstatic       #31  <Field AccountViewState AccountViewState.HidePrivacySettingsLoadingIndicator>
	//*  11   26:invokevirtual   #28  <Method int AccountViewState.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] a>
	//*  15   34:getstatic       #34  <Field AccountViewState AccountViewState.ShowCleanMapReports>
	//*  16   37:invokevirtual   #28  <Method int AccountViewState.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] a>
	//*  20   45:getstatic       #37  <Field AccountViewState AccountViewState.HideCleanMapReports>
	//*  21   48:invokevirtual   #28  <Method int AccountViewState.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #20  <Field int[] a>
	//*  25   56:getstatic       #40  <Field AccountViewState AccountViewState.ShowSmartMapReports>
	//*  26   59:invokevirtual   #28  <Method int AccountViewState.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #20  <Field int[] a>
	//*  30   67:getstatic       #43  <Field AccountViewState AccountViewState.HideSmartMapReports>
	//*  31   70:invokevirtual   #28  <Method int AccountViewState.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:getstatic       #20  <Field int[] a>
	//*  35   79:getstatic       #46  <Field AccountViewState AccountViewState.ShowRobotMapsInfo>
	//*  36   82:invokevirtual   #28  <Method int AccountViewState.ordinal()>
	//*  37   85:bipush          7
	//*  38   87:iastore         
	//*  39   88:getstatic       #20  <Field int[] a>
	//*  40   91:getstatic       #49  <Field AccountViewState AccountViewState.HideRobotMapsInfo>
	//*  41   94:invokevirtual   #28  <Method int AccountViewState.ordinal()>
	//*  42   97:bipush          8
	//*  43   99:iastore         
	//*  44  100:getstatic       #20  <Field int[] a>
	//*  45  103:getstatic       #52  <Field AccountViewState AccountViewState.ShowTermsAndConditionsUrl>
	//*  46  106:invokevirtual   #28  <Method int AccountViewState.ordinal()>
	//*  47  109:bipush          9
	//*  48  111:iastore         
	//*  49  112:getstatic       #20  <Field int[] a>
	//*  50  115:getstatic       #55  <Field AccountViewState AccountViewState.ShowEULAUrl>
	//*  51  118:invokevirtual   #28  <Method int AccountViewState.ordinal()>
	//*  52  121:bipush          10
	//*  53  123:iastore         
	//*  54  124:getstatic       #20  <Field int[] a>
	//*  55  127:getstatic       #58  <Field AccountViewState AccountViewState.ShowPrivacyPolicyUrl>
	//*  56  130:invokevirtual   #28  <Method int AccountViewState.ordinal()>
	//*  57  133:bipush          11
	//*  58  135:iastore         
	//*  59  136:getstatic       #20  <Field int[] a>
	//*  60  139:getstatic       #61  <Field AccountViewState AccountViewState.ShowDataSecurityUrl>
	//*  61  142:invokevirtual   #28  <Method int AccountViewState.ordinal()>
	//*  62  145:bipush          12
	//*  63  147:iastore         
	//*  64  148:getstatic       #20  <Field int[] a>
	//*  65  151:getstatic       #64  <Field AccountViewState AccountViewState.ShowMappingRobotsUrl>
	//*  66  154:invokevirtual   #28  <Method int AccountViewState.ordinal()>
	//*  67  157:bipush          13
	//*  68  159:iastore         
	//*  69  160:getstatic       #20  <Field int[] a>
	//*  70  163:getstatic       #67  <Field AccountViewState AccountViewState.ShowTermsConsentDate>
	//*  71  166:invokevirtual   #28  <Method int AccountViewState.ordinal()>
	//*  72  169:bipush          14
	//*  73  171:iastore         
	//*  74  172:getstatic       #20  <Field int[] a>
	//*  75  175:getstatic       #70  <Field AccountViewState AccountViewState.ShowPrivacyConsentDate>
	//*  76  178:invokevirtual   #28  <Method int AccountViewState.ordinal()>
	//*  77  181:bipush          15
	//*  78  183:iastore         
	//*  79  184:getstatic       #20  <Field int[] a>
	//*  80  187:getstatic       #73  <Field AccountViewState AccountViewState.ShowEULAConsentDate>
	//*  81  190:invokevirtual   #28  <Method int AccountViewState.ordinal()>
	//*  82  193:bipush          16
	//*  83  195:iastore         
	//*  84  196:getstatic       #20  <Field int[] a>
	//*  85  199:getstatic       #76  <Field AccountViewState AccountViewState.ShowCleanMapReportsSettingUnavailableError>
	//*  86  202:invokevirtual   #28  <Method int AccountViewState.ordinal()>
	//*  87  205:bipush          17
	//*  88  207:iastore         
	//*  89  208:getstatic       #20  <Field int[] a>
	//*  90  211:getstatic       #79  <Field AccountViewState AccountViewState.ShowWebcontentUnavailableError>
	//*  91  214:invokevirtual   #28  <Method int AccountViewState.ordinal()>
	//*  92  217:bipush          18
	//*  93  219:iastore         
	//*  94  220:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   95  221:astore_0        
		try
		{
			a[AccountViewState.HidePrivacySettingsLoadingIndicator.ordinal()] = 2;
		}
	//*  96  222:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   97  225:astore_0        
		try
		{
			a[AccountViewState.ShowCleanMapReports.ordinal()] = 3;
		}
	//*  98  226:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   99  229:astore_0        
		try
		{
			a[AccountViewState.HideCleanMapReports.ordinal()] = 4;
		}
	//* 100  230:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//  101  233:astore_0        
		try
		{
			a[AccountViewState.ShowSmartMapReports.ordinal()] = 5;
		}
	//* 102  234:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//  103  237:astore_0        
		try
		{
			a[AccountViewState.HideSmartMapReports.ordinal()] = 6;
		}
	//* 104  238:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//  105  241:astore_0        
		try
		{
			a[AccountViewState.ShowRobotMapsInfo.ordinal()] = 7;
		}
	//* 106  242:goto            76
		catch(NoSuchFieldError nosuchfielderror6) { }
	//  107  245:astore_0        
		try
		{
			a[AccountViewState.HideRobotMapsInfo.ordinal()] = 8;
		}
	//* 108  246:goto            88
		catch(NoSuchFieldError nosuchfielderror7) { }
	//  109  249:astore_0        
		try
		{
			a[AccountViewState.ShowTermsAndConditionsUrl.ordinal()] = 9;
		}
	//* 110  250:goto            100
		catch(NoSuchFieldError nosuchfielderror8) { }
	//  111  253:astore_0        
		try
		{
			a[AccountViewState.ShowEULAUrl.ordinal()] = 10;
		}
	//* 112  254:goto            112
		catch(NoSuchFieldError nosuchfielderror9) { }
	//  113  257:astore_0        
		try
		{
			a[AccountViewState.ShowPrivacyPolicyUrl.ordinal()] = 11;
		}
	//* 114  258:goto            124
		catch(NoSuchFieldError nosuchfielderror10) { }
	//  115  261:astore_0        
		try
		{
			a[AccountViewState.ShowDataSecurityUrl.ordinal()] = 12;
		}
	//* 116  262:goto            136
		catch(NoSuchFieldError nosuchfielderror11) { }
	//  117  265:astore_0        
		try
		{
			a[AccountViewState.ShowMappingRobotsUrl.ordinal()] = 13;
		}
	//* 118  266:goto            148
		catch(NoSuchFieldError nosuchfielderror12) { }
	//  119  269:astore_0        
		try
		{
			a[AccountViewState.ShowTermsConsentDate.ordinal()] = 14;
		}
	//* 120  270:goto            160
		catch(NoSuchFieldError nosuchfielderror13) { }
	//  121  273:astore_0        
		try
		{
			a[AccountViewState.ShowPrivacyConsentDate.ordinal()] = 15;
		}
	//* 122  274:goto            172
		catch(NoSuchFieldError nosuchfielderror14) { }
	//  123  277:astore_0        
		try
		{
			a[AccountViewState.ShowEULAConsentDate.ordinal()] = 16;
		}
	//* 124  278:goto            184
		catch(NoSuchFieldError nosuchfielderror15) { }
	//  125  281:astore_0        
		try
		{
			a[AccountViewState.ShowCleanMapReportsSettingUnavailableError.ordinal()] = 17;
		}
	//* 126  282:goto            196
		catch(NoSuchFieldError nosuchfielderror16) { }
	//  127  285:astore_0        
		try
		{
			a[AccountViewState.ShowWebcontentUnavailableError.ordinal()] = 18;
		}
	//* 128  286:goto            208
		catch(NoSuchFieldError nosuchfielderror17) { }
	//  129  289:astore_0        
	//* 130  290:return          
	}
}
