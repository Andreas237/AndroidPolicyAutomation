// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.MaintenanceViewState;

// Referenced classes of package com.irobot.home:
//			PartsDetailListActivity

static class PartsDetailListActivity$3
{

	static final int a[];

	static 
	{
		a = new int[MaintenanceViewState.values().length];
	//    0    0:invokestatic    #18  <Method MaintenanceViewState[] MaintenanceViewState.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] a>
		try
		{
			a[MaintenanceViewState.ShowCareDescription.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] a>
	//    5   12:getstatic       #24  <Field MaintenanceViewState MaintenanceViewState.ShowCareDescription>
	//    6   15:invokevirtual   #28  <Method int MaintenanceViewState.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] a>
	//*  10   23:getstatic       #31  <Field MaintenanceViewState MaintenanceViewState.ShowBuyParts>
	//*  11   26:invokevirtual   #28  <Method int MaintenanceViewState.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] a>
	//*  15   34:getstatic       #34  <Field MaintenanceViewState MaintenanceViewState.ShowCategoryListInProgress>
	//*  16   37:invokevirtual   #28  <Method int MaintenanceViewState.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] a>
	//*  20   45:getstatic       #37  <Field MaintenanceViewState MaintenanceViewState.HideCategoryListInProgress>
	//*  21   48:invokevirtual   #28  <Method int MaintenanceViewState.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #20  <Field int[] a>
	//*  25   56:getstatic       #40  <Field MaintenanceViewState MaintenanceViewState.UpdatePartCategoriesList>
	//*  26   59:invokevirtual   #28  <Method int MaintenanceViewState.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #20  <Field int[] a>
	//*  30   67:getstatic       #43  <Field MaintenanceViewState MaintenanceViewState.ShowCategoriesListTitle>
	//*  31   70:invokevirtual   #28  <Method int MaintenanceViewState.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:getstatic       #20  <Field int[] a>
	//*  35   79:getstatic       #46  <Field MaintenanceViewState MaintenanceViewState.ShowConnectionWarning>
	//*  36   82:invokevirtual   #28  <Method int MaintenanceViewState.ordinal()>
	//*  37   85:bipush          7
	//*  38   87:iastore         
	//*  39   88:getstatic       #20  <Field int[] a>
	//*  40   91:getstatic       #49  <Field MaintenanceViewState MaintenanceViewState.ShowUnableToLoadCategories>
	//*  41   94:invokevirtual   #28  <Method int MaintenanceViewState.ordinal()>
	//*  42   97:bipush          8
	//*  43   99:iastore         
	//*  44  100:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   45  101:astore_0        
		try
		{
			a[MaintenanceViewState.ShowBuyParts.ordinal()] = 2;
		}
	//*  46  102:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   47  105:astore_0        
		try
		{
			a[MaintenanceViewState.ShowCategoryListInProgress.ordinal()] = 3;
		}
	//*  48  106:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   49  109:astore_0        
		try
		{
			a[MaintenanceViewState.HideCategoryListInProgress.ordinal()] = 4;
		}
	//*  50  110:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   51  113:astore_0        
		try
		{
			a[MaintenanceViewState.UpdatePartCategoriesList.ordinal()] = 5;
		}
	//*  52  114:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   53  117:astore_0        
		try
		{
			a[MaintenanceViewState.ShowCategoriesListTitle.ordinal()] = 6;
		}
	//*  54  118:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   55  121:astore_0        
		try
		{
			a[MaintenanceViewState.ShowConnectionWarning.ordinal()] = 7;
		}
	//*  56  122:goto            76
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   57  125:astore_0        
		try
		{
			a[MaintenanceViewState.ShowUnableToLoadCategories.ordinal()] = 8;
		}
	//*  58  126:goto            88
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   59  129:astore_0        
	//*  60  130:return          
	}
}
