// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.AccountViewState;
import com.irobot.core.FeatureType;

// Referenced classes of package com.irobot.home:
//			BetaFeaturesActivity

static class BetaFeaturesActivity$1
{

	static final int a[];
	static final int b[];

	static 
	{
		b = new int[FeatureType.values().length];
	//    0    0:invokestatic    #19  <Method FeatureType[] FeatureType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] b>
		try
		{
			b[FeatureType.WifiMaps.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] b>
	//    5   12:getstatic       #25  <Field FeatureType FeatureType.WifiMaps>
	//    6   15:invokevirtual   #29  <Method int FeatureType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:invokestatic    #34  <Method AccountViewState[] AccountViewState.values()>
	//*  10   23:arraylength     
	//*  11   24:newarray        int[]
	//*  12   26:putstatic       #36  <Field int[] a>
	//*  13   29:getstatic       #36  <Field int[] a>
	//*  14   32:getstatic       #40  <Field AccountViewState AccountViewState.ShowLoadingIndicator>
	//*  15   35:invokevirtual   #41  <Method int AccountViewState.ordinal()>
	//*  16   38:iconst_1        
	//*  17   39:iastore         
	//*  18   40:getstatic       #36  <Field int[] a>
	//*  19   43:getstatic       #44  <Field AccountViewState AccountViewState.HideLoadingIndicator>
	//*  20   46:invokevirtual   #41  <Method int AccountViewState.ordinal()>
	//*  21   49:iconst_2        
	//*  22   50:iastore         
	//*  23   51:getstatic       #36  <Field int[] a>
	//*  24   54:getstatic       #47  <Field AccountViewState AccountViewState.ShowBetaProgramTip>
	//*  25   57:invokevirtual   #41  <Method int AccountViewState.ordinal()>
	//*  26   60:iconst_3        
	//*  27   61:iastore         
	//*  28   62:getstatic       #36  <Field int[] a>
	//*  29   65:getstatic       #50  <Field AccountViewState AccountViewState.HideBetaProgramTip>
	//*  30   68:invokevirtual   #41  <Method int AccountViewState.ordinal()>
	//*  31   71:iconst_4        
	//*  32   72:iastore         
	//*  33   73:getstatic       #36  <Field int[] a>
	//*  34   76:getstatic       #53  <Field AccountViewState AccountViewState.ShowUpdatedBetaProgramFeatures>
	//*  35   79:invokevirtual   #41  <Method int AccountViewState.ordinal()>
	//*  36   82:iconst_5        
	//*  37   83:iastore         
	//*  38   84:getstatic       #36  <Field int[] a>
	//*  39   87:getstatic       #56  <Field AccountViewState AccountViewState.ShowOutputConfirmation>
	//*  40   90:invokevirtual   #41  <Method int AccountViewState.ordinal()>
	//*  41   93:bipush          6
	//*  42   95:iastore         
	//*  43   96:getstatic       #36  <Field int[] a>
	//*  44   99:getstatic       #59  <Field AccountViewState AccountViewState.NavigateToCleanScreen>
	//*  45  102:invokevirtual   #41  <Method int AccountViewState.ordinal()>
	//*  46  105:bipush          7
	//*  47  107:iastore         
	//*  48  108:getstatic       #36  <Field int[] a>
	//*  49  111:getstatic       #62  <Field AccountViewState AccountViewState.ShowRequestErrorMessage>
	//*  50  114:invokevirtual   #41  <Method int AccountViewState.ordinal()>
	//*  51  117:bipush          8
	//*  52  119:iastore         
	//*  53  120:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   54  121:astore_0        
		a = new int[AccountViewState.values().length];
		try
		{
			a[AccountViewState.ShowLoadingIndicator.ordinal()] = 1;
		}
	//*  55  122:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   56  125:astore_0        
		try
		{
			a[AccountViewState.HideLoadingIndicator.ordinal()] = 2;
		}
	//*  57  126:goto            40
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   58  129:astore_0        
		try
		{
			a[AccountViewState.ShowBetaProgramTip.ordinal()] = 3;
		}
	//*  59  130:goto            51
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   60  133:astore_0        
		try
		{
			a[AccountViewState.HideBetaProgramTip.ordinal()] = 4;
		}
	//*  61  134:goto            62
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   62  137:astore_0        
		try
		{
			a[AccountViewState.ShowUpdatedBetaProgramFeatures.ordinal()] = 5;
		}
	//*  63  138:goto            73
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   64  141:astore_0        
		try
		{
			a[AccountViewState.ShowOutputConfirmation.ordinal()] = 6;
		}
	//*  65  142:goto            84
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   66  145:astore_0        
		try
		{
			a[AccountViewState.NavigateToCleanScreen.ordinal()] = 7;
		}
	//*  67  146:goto            96
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   68  149:astore_0        
		try
		{
			a[AccountViewState.ShowRequestErrorMessage.ordinal()] = 8;
		}
	//*  69  150:goto            108
		catch(NoSuchFieldError nosuchfielderror8) { }
	//   70  153:astore_0        
	//*  71  154:return          
	}
}
