// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.search;

import com.ibotta.android.views.base.info.MisspellingConfidenceLevel;

// Referenced classes of package com.ibotta.android.mvp.base.search:
//			AbstractSearchMvpPresenter

static class AbstractSearchMvpPresenter$2
{

	static final int $SwitchMap$com$ibotta$android$mvp$base$search$AbstractSearchMvpPresenter$SearchState[];
	static final int $SwitchMap$com$ibotta$android$views$base$info$MisspellingConfidenceLevel[];

	static 
	{
		$SwitchMap$com$ibotta$android$views$base$info$MisspellingConfidenceLevel = new int[MisspellingConfidenceLevel.values().length];
	//    0    0:invokestatic    #19  <Method MisspellingConfidenceLevel[] MisspellingConfidenceLevel.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$ibotta$android$views$base$info$MisspellingConfidenceLevel>
		try
		{
			$SwitchMap$com$ibotta$android$views$base$info$MisspellingConfidenceLevel[MisspellingConfidenceLevel.STRONG.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$ibotta$android$views$base$info$MisspellingConfidenceLevel>
	//    5   12:getstatic       #25  <Field MisspellingConfidenceLevel MisspellingConfidenceLevel.STRONG>
	//    6   15:invokevirtual   #29  <Method int MisspellingConfidenceLevel.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$ibotta$android$views$base$info$MisspellingConfidenceLevel>
	//*  10   23:getstatic       #32  <Field MisspellingConfidenceLevel MisspellingConfidenceLevel.MEDIUM>
	//*  11   26:invokevirtual   #29  <Method int MisspellingConfidenceLevel.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #21  <Field int[] $SwitchMap$com$ibotta$android$views$base$info$MisspellingConfidenceLevel>
	//*  15   34:getstatic       #35  <Field MisspellingConfidenceLevel MisspellingConfidenceLevel.WEAK>
	//*  16   37:invokevirtual   #29  <Method int MisspellingConfidenceLevel.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:invokestatic    #40  <Method AbstractSearchMvpPresenter$SearchState[] AbstractSearchMvpPresenter$SearchState.values()>
	//*  20   45:arraylength     
	//*  21   46:newarray        int[]
	//*  22   48:putstatic       #42  <Field int[] $SwitchMap$com$ibotta$android$mvp$base$search$AbstractSearchMvpPresenter$SearchState>
	//*  23   51:getstatic       #42  <Field int[] $SwitchMap$com$ibotta$android$mvp$base$search$AbstractSearchMvpPresenter$SearchState>
	//*  24   54:getstatic       #46  <Field AbstractSearchMvpPresenter$SearchState AbstractSearchMvpPresenter$SearchState.NOT_SEARCHING>
	//*  25   57:invokevirtual   #47  <Method int AbstractSearchMvpPresenter$SearchState.ordinal()>
	//*  26   60:iconst_1        
	//*  27   61:iastore         
	//*  28   62:getstatic       #42  <Field int[] $SwitchMap$com$ibotta$android$mvp$base$search$AbstractSearchMvpPresenter$SearchState>
	//*  29   65:getstatic       #50  <Field AbstractSearchMvpPresenter$SearchState AbstractSearchMvpPresenter$SearchState.VIEWING_RESULTS>
	//*  30   68:invokevirtual   #47  <Method int AbstractSearchMvpPresenter$SearchState.ordinal()>
	//*  31   71:iconst_2        
	//*  32   72:iastore         
	//*  33   73:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   34   74:astore_0        
		try
		{
			$SwitchMap$com$ibotta$android$views$base$info$MisspellingConfidenceLevel[MisspellingConfidenceLevel.MEDIUM.ordinal()] = 2;
		}
	//*  35   75:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   36   78:astore_0        
		try
		{
			$SwitchMap$com$ibotta$android$views$base$info$MisspellingConfidenceLevel[MisspellingConfidenceLevel.WEAK.ordinal()] = 3;
		}
	//*  37   79:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   38   82:astore_0        
		$SwitchMap$com$ibotta$android$mvp$base$search$AbstractSearchMvpPresenter$SearchState = new int[archState.values().length];
		try
		{
			$SwitchMap$com$ibotta$android$mvp$base$search$AbstractSearchMvpPresenter$SearchState[archState.NOT_SEARCHING.ordinal()] = 1;
		}
	//*  39   83:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   40   86:astore_0        
		try
		{
			$SwitchMap$com$ibotta$android$mvp$base$search$AbstractSearchMvpPresenter$SearchState[archState.VIEWING_RESULTS.ordinal()] = 2;
		}
	//*  41   87:goto            62
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   42   90:astore_0        
	//*  43   91:return          
	}
}
