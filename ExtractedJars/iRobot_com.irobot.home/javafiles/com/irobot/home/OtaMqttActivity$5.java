// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;

// Referenced classes of package com.irobot.home:
//			OtaMqttActivity

static class OtaMqttActivity$5
{

	static final int a[];
	static final int b[];
	static final int c[];

	static 
	{
		c = new int[LocalOtaError.values().length];
	//    0    0:invokestatic    #20  <Method LocalOtaError[] LocalOtaError.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #22  <Field int[] c>
		try
		{
			c[LocalOtaError.None.ordinal()] = 1;
	//    4    9:getstatic       #22  <Field int[] c>
	//    5   12:getstatic       #26  <Field LocalOtaError LocalOtaError.None>
	//    6   15:invokevirtual   #30  <Method int LocalOtaError.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #22  <Field int[] c>
	//*  10   23:getstatic       #33  <Field LocalOtaError LocalOtaError.NotLocallyConnected>
	//*  11   26:invokevirtual   #30  <Method int LocalOtaError.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #22  <Field int[] c>
	//*  15   34:getstatic       #36  <Field LocalOtaError LocalOtaError.NotARoomba>
	//*  16   37:invokevirtual   #30  <Method int LocalOtaError.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #22  <Field int[] c>
	//*  20   45:getstatic       #39  <Field LocalOtaError LocalOtaError.Not900Series>
	//*  21   48:invokevirtual   #30  <Method int LocalOtaError.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #22  <Field int[] c>
	//*  25   56:getstatic       #42  <Field LocalOtaError LocalOtaError.NotAWSEnabled>
	//*  26   59:invokevirtual   #30  <Method int LocalOtaError.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #22  <Field int[] c>
	//*  30   67:getstatic       #45  <Field LocalOtaError LocalOtaError.DownloadFailed>
	//*  31   70:invokevirtual   #30  <Method int LocalOtaError.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:getstatic       #22  <Field int[] c>
	//*  35   79:getstatic       #48  <Field LocalOtaError LocalOtaError.PreparationTimeOut>
	//*  36   82:invokevirtual   #30  <Method int LocalOtaError.ordinal()>
	//*  37   85:bipush          7
	//*  38   87:iastore         
	//*  39   88:getstatic       #22  <Field int[] c>
	//*  40   91:getstatic       #51  <Field LocalOtaError LocalOtaError.UpdateFailed>
	//*  41   94:invokevirtual   #30  <Method int LocalOtaError.ordinal()>
	//*  42   97:bipush          8
	//*  43   99:iastore         
	//*  44  100:invokestatic    #56  <Method LocalOtaStatus[] LocalOtaStatus.values()>
	//*  45  103:arraylength     
	//*  46  104:newarray        int[]
	//*  47  106:putstatic       #58  <Field int[] b>
	//*  48  109:getstatic       #58  <Field int[] b>
	//*  49  112:getstatic       #62  <Field LocalOtaStatus LocalOtaStatus.CheckingForUpdate>
	//*  50  115:invokevirtual   #63  <Method int LocalOtaStatus.ordinal()>
	//*  51  118:iconst_1        
	//*  52  119:iastore         
	//*  53  120:getstatic       #58  <Field int[] b>
	//*  54  123:getstatic       #66  <Field LocalOtaStatus LocalOtaStatus.UpdateUnavailable>
	//*  55  126:invokevirtual   #63  <Method int LocalOtaStatus.ordinal()>
	//*  56  129:iconst_2        
	//*  57  130:iastore         
	//*  58  131:getstatic       #58  <Field int[] b>
	//*  59  134:getstatic       #69  <Field LocalOtaStatus LocalOtaStatus.UpdateAvailable>
	//*  60  137:invokevirtual   #63  <Method int LocalOtaStatus.ordinal()>
	//*  61  140:iconst_3        
	//*  62  141:iastore         
	//*  63  142:getstatic       #58  <Field int[] b>
	//*  64  145:getstatic       #72  <Field LocalOtaStatus LocalOtaStatus.DownloadingUpdate>
	//*  65  148:invokevirtual   #63  <Method int LocalOtaStatus.ordinal()>
	//*  66  151:iconst_4        
	//*  67  152:iastore         
	//*  68  153:getstatic       #58  <Field int[] b>
	//*  69  156:getstatic       #75  <Field LocalOtaStatus LocalOtaStatus.PreparingForUpdate>
	//*  70  159:invokevirtual   #63  <Method int LocalOtaStatus.ordinal()>
	//*  71  162:iconst_5        
	//*  72  163:iastore         
	//*  73  164:getstatic       #58  <Field int[] b>
	//*  74  167:getstatic       #78  <Field LocalOtaStatus LocalOtaStatus.ReadyForUpdate>
	//*  75  170:invokevirtual   #63  <Method int LocalOtaStatus.ordinal()>
	//*  76  173:bipush          6
	//*  77  175:iastore         
	//*  78  176:getstatic       #58  <Field int[] b>
	//*  79  179:getstatic       #81  <Field LocalOtaStatus LocalOtaStatus.SendingUpdate>
	//*  80  182:invokevirtual   #63  <Method int LocalOtaStatus.ordinal()>
	//*  81  185:bipush          7
	//*  82  187:iastore         
	//*  83  188:getstatic       #58  <Field int[] b>
	//*  84  191:getstatic       #84  <Field LocalOtaStatus LocalOtaStatus.UpdateInstalling>
	//*  85  194:invokevirtual   #63  <Method int LocalOtaStatus.ordinal()>
	//*  86  197:bipush          8
	//*  87  199:iastore         
	//*  88  200:getstatic       #58  <Field int[] b>
	//*  89  203:getstatic       #87  <Field LocalOtaStatus LocalOtaStatus.Error>
	//*  90  206:invokevirtual   #63  <Method int LocalOtaStatus.ordinal()>
	//*  91  209:bipush          9
	//*  92  211:iastore         
	//*  93  212:invokestatic    #92  <Method OTAUIServiceDataState[] OTAUIServiceDataState.values()>
	//*  94  215:arraylength     
	//*  95  216:newarray        int[]
	//*  96  218:putstatic       #94  <Field int[] a>
	//*  97  221:getstatic       #94  <Field int[] a>
	//*  98  224:getstatic       #98  <Field OTAUIServiceDataState OTAUIServiceDataState.LocalOTAStatus>
	//*  99  227:invokevirtual   #99  <Method int OTAUIServiceDataState.ordinal()>
	//* 100  230:iconst_1        
	//* 101  231:iastore         
	//* 102  232:getstatic       #94  <Field int[] a>
	//* 103  235:getstatic       #102 <Field OTAUIServiceDataState OTAUIServiceDataState.LocalOTAError>
	//* 104  238:invokevirtual   #99  <Method int OTAUIServiceDataState.ordinal()>
	//* 105  241:iconst_2        
	//* 106  242:iastore         
	//* 107  243:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//  108  244:astore_0        
		try
		{
			c[LocalOtaError.NotLocallyConnected.ordinal()] = 2;
		}
	//* 109  245:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//  110  248:astore_0        
		try
		{
			c[LocalOtaError.NotARoomba.ordinal()] = 3;
		}
	//* 111  249:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//  112  252:astore_0        
		try
		{
			c[LocalOtaError.Not900Series.ordinal()] = 4;
		}
	//* 113  253:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//  114  256:astore_0        
		try
		{
			c[LocalOtaError.NotAWSEnabled.ordinal()] = 5;
		}
	//* 115  257:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//  116  260:astore_0        
		try
		{
			c[LocalOtaError.DownloadFailed.ordinal()] = 6;
		}
	//* 117  261:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//  118  264:astore_0        
		try
		{
			c[LocalOtaError.PreparationTimeOut.ordinal()] = 7;
		}
	//* 119  265:goto            76
		catch(NoSuchFieldError nosuchfielderror6) { }
	//  120  268:astore_0        
		try
		{
			c[LocalOtaError.UpdateFailed.ordinal()] = 8;
		}
	//* 121  269:goto            88
		catch(NoSuchFieldError nosuchfielderror7) { }
	//  122  272:astore_0        
		b = new int[LocalOtaStatus.values().length];
		try
		{
			b[LocalOtaStatus.CheckingForUpdate.ordinal()] = 1;
		}
	//* 123  273:goto            100
		catch(NoSuchFieldError nosuchfielderror8) { }
	//  124  276:astore_0        
		try
		{
			b[LocalOtaStatus.UpdateUnavailable.ordinal()] = 2;
		}
	//* 125  277:goto            120
		catch(NoSuchFieldError nosuchfielderror9) { }
	//  126  280:astore_0        
		try
		{
			b[LocalOtaStatus.UpdateAvailable.ordinal()] = 3;
		}
	//* 127  281:goto            131
		catch(NoSuchFieldError nosuchfielderror10) { }
	//  128  284:astore_0        
		try
		{
			b[LocalOtaStatus.DownloadingUpdate.ordinal()] = 4;
		}
	//* 129  285:goto            142
		catch(NoSuchFieldError nosuchfielderror11) { }
	//  130  288:astore_0        
		try
		{
			b[LocalOtaStatus.PreparingForUpdate.ordinal()] = 5;
		}
	//* 131  289:goto            153
		catch(NoSuchFieldError nosuchfielderror12) { }
	//  132  292:astore_0        
		try
		{
			b[LocalOtaStatus.ReadyForUpdate.ordinal()] = 6;
		}
	//* 133  293:goto            164
		catch(NoSuchFieldError nosuchfielderror13) { }
	//  134  296:astore_0        
		try
		{
			b[LocalOtaStatus.SendingUpdate.ordinal()] = 7;
		}
	//* 135  297:goto            176
		catch(NoSuchFieldError nosuchfielderror14) { }
	//  136  300:astore_0        
		try
		{
			b[LocalOtaStatus.UpdateInstalling.ordinal()] = 8;
		}
	//* 137  301:goto            188
		catch(NoSuchFieldError nosuchfielderror15) { }
	//  138  304:astore_0        
		try
		{
			b[LocalOtaStatus.Error.ordinal()] = 9;
		}
	//* 139  305:goto            200
		catch(NoSuchFieldError nosuchfielderror16) { }
	//  140  308:astore_0        
		a = new int[OTAUIServiceDataState.values().length];
		try
		{
			a[OTAUIServiceDataState.LocalOTAStatus.ordinal()] = 1;
		}
	//* 141  309:goto            212
		catch(NoSuchFieldError nosuchfielderror17) { }
	//  142  312:astore_0        
		try
		{
			a[OTAUIServiceDataState.LocalOTAError.ordinal()] = 2;
		}
	//* 143  313:goto            232
		catch(NoSuchFieldError nosuchfielderror18) { }
	//  144  316:astore_0        
	//* 145  317:return          
	}
}
