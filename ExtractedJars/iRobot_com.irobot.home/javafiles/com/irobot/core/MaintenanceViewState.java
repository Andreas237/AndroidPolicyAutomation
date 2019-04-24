// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class MaintenanceViewState extends Enum
{

	private MaintenanceViewState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #74  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static MaintenanceViewState valueOf(String s)
	{
		return (MaintenanceViewState)Enum.valueOf(com/irobot/core/MaintenanceViewState, s);
	//    0    0:ldc1            #2   <Class MaintenanceViewState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #80  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class MaintenanceViewState>
	//    4    9:areturn         
	}

	public static MaintenanceViewState[] values()
	{
		return (MaintenanceViewState[])((MaintenanceViewState []) ($VALUES)).clone();
	//    0    0:getstatic       #72  <Field MaintenanceViewState[] $VALUES>
	//    1    3:invokevirtual   #87  <Method Object _5B_Lcom.irobot.core.MaintenanceViewState_3B_.clone()>
	//    2    6:checkcast       #83  <Class MaintenanceViewState[]>
	//    3    9:areturn         
	}

	private static final MaintenanceViewState $VALUES[];
	public static final MaintenanceViewState EnableCategoryStatusReset;
	public static final MaintenanceViewState HideCategoryListInProgress;
	public static final MaintenanceViewState ShowBuyParts;
	public static final MaintenanceViewState ShowCareDescription;
	public static final MaintenanceViewState ShowCategoriesDetailResources;
	public static final MaintenanceViewState ShowCategoriesListTitle;
	public static final MaintenanceViewState ShowCategoryListInProgress;
	public static final MaintenanceViewState ShowConnectionWarning;
	public static final MaintenanceViewState ShowResetCategoryFailed;
	public static final MaintenanceViewState ShowResetCategorySuccess;
	public static final MaintenanceViewState ShowResetInProgress;
	public static final MaintenanceViewState ShowUnableToLoadCategories;
	public static final MaintenanceViewState UpdatePartCategoriesList;
	public static final MaintenanceViewState UpdatePartsList;

	static 
	{
		ShowCareDescription = new MaintenanceViewState("ShowCareDescription", 0);
	//    0    0:new             #2   <Class MaintenanceViewState>
	//    1    3:dup             
	//    2    4:ldc1            #25  <String "ShowCareDescription">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #29  <Method void MaintenanceViewState(String, int)>
	//    5   10:putstatic       #31  <Field MaintenanceViewState ShowCareDescription>
		ShowBuyParts = new MaintenanceViewState("ShowBuyParts", 1);
	//    6   13:new             #2   <Class MaintenanceViewState>
	//    7   16:dup             
	//    8   17:ldc1            #32  <String "ShowBuyParts">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #29  <Method void MaintenanceViewState(String, int)>
	//   11   23:putstatic       #34  <Field MaintenanceViewState ShowBuyParts>
		ShowCategoryListInProgress = new MaintenanceViewState("ShowCategoryListInProgress", 2);
	//   12   26:new             #2   <Class MaintenanceViewState>
	//   13   29:dup             
	//   14   30:ldc1            #35  <String "ShowCategoryListInProgress">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #29  <Method void MaintenanceViewState(String, int)>
	//   17   36:putstatic       #37  <Field MaintenanceViewState ShowCategoryListInProgress>
		HideCategoryListInProgress = new MaintenanceViewState("HideCategoryListInProgress", 3);
	//   18   39:new             #2   <Class MaintenanceViewState>
	//   19   42:dup             
	//   20   43:ldc1            #38  <String "HideCategoryListInProgress">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #29  <Method void MaintenanceViewState(String, int)>
	//   23   49:putstatic       #40  <Field MaintenanceViewState HideCategoryListInProgress>
		UpdatePartCategoriesList = new MaintenanceViewState("UpdatePartCategoriesList", 4);
	//   24   52:new             #2   <Class MaintenanceViewState>
	//   25   55:dup             
	//   26   56:ldc1            #41  <String "UpdatePartCategoriesList">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #29  <Method void MaintenanceViewState(String, int)>
	//   29   62:putstatic       #43  <Field MaintenanceViewState UpdatePartCategoriesList>
		UpdatePartsList = new MaintenanceViewState("UpdatePartsList", 5);
	//   30   65:new             #2   <Class MaintenanceViewState>
	//   31   68:dup             
	//   32   69:ldc1            #44  <String "UpdatePartsList">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #29  <Method void MaintenanceViewState(String, int)>
	//   35   75:putstatic       #46  <Field MaintenanceViewState UpdatePartsList>
		ShowCategoriesListTitle = new MaintenanceViewState("ShowCategoriesListTitle", 6);
	//   36   78:new             #2   <Class MaintenanceViewState>
	//   37   81:dup             
	//   38   82:ldc1            #47  <String "ShowCategoriesListTitle">
	//   39   84:bipush          6
	//   40   86:invokespecial   #29  <Method void MaintenanceViewState(String, int)>
	//   41   89:putstatic       #49  <Field MaintenanceViewState ShowCategoriesListTitle>
		ShowCategoriesDetailResources = new MaintenanceViewState("ShowCategoriesDetailResources", 7);
	//   42   92:new             #2   <Class MaintenanceViewState>
	//   43   95:dup             
	//   44   96:ldc1            #50  <String "ShowCategoriesDetailResources">
	//   45   98:bipush          7
	//   46  100:invokespecial   #29  <Method void MaintenanceViewState(String, int)>
	//   47  103:putstatic       #52  <Field MaintenanceViewState ShowCategoriesDetailResources>
		ShowConnectionWarning = new MaintenanceViewState("ShowConnectionWarning", 8);
	//   48  106:new             #2   <Class MaintenanceViewState>
	//   49  109:dup             
	//   50  110:ldc1            #53  <String "ShowConnectionWarning">
	//   51  112:bipush          8
	//   52  114:invokespecial   #29  <Method void MaintenanceViewState(String, int)>
	//   53  117:putstatic       #55  <Field MaintenanceViewState ShowConnectionWarning>
		ShowUnableToLoadCategories = new MaintenanceViewState("ShowUnableToLoadCategories", 9);
	//   54  120:new             #2   <Class MaintenanceViewState>
	//   55  123:dup             
	//   56  124:ldc1            #56  <String "ShowUnableToLoadCategories">
	//   57  126:bipush          9
	//   58  128:invokespecial   #29  <Method void MaintenanceViewState(String, int)>
	//   59  131:putstatic       #58  <Field MaintenanceViewState ShowUnableToLoadCategories>
		EnableCategoryStatusReset = new MaintenanceViewState("EnableCategoryStatusReset", 10);
	//   60  134:new             #2   <Class MaintenanceViewState>
	//   61  137:dup             
	//   62  138:ldc1            #59  <String "EnableCategoryStatusReset">
	//   63  140:bipush          10
	//   64  142:invokespecial   #29  <Method void MaintenanceViewState(String, int)>
	//   65  145:putstatic       #61  <Field MaintenanceViewState EnableCategoryStatusReset>
		ShowResetInProgress = new MaintenanceViewState("ShowResetInProgress", 11);
	//   66  148:new             #2   <Class MaintenanceViewState>
	//   67  151:dup             
	//   68  152:ldc1            #62  <String "ShowResetInProgress">
	//   69  154:bipush          11
	//   70  156:invokespecial   #29  <Method void MaintenanceViewState(String, int)>
	//   71  159:putstatic       #64  <Field MaintenanceViewState ShowResetInProgress>
		ShowResetCategorySuccess = new MaintenanceViewState("ShowResetCategorySuccess", 12);
	//   72  162:new             #2   <Class MaintenanceViewState>
	//   73  165:dup             
	//   74  166:ldc1            #65  <String "ShowResetCategorySuccess">
	//   75  168:bipush          12
	//   76  170:invokespecial   #29  <Method void MaintenanceViewState(String, int)>
	//   77  173:putstatic       #67  <Field MaintenanceViewState ShowResetCategorySuccess>
		ShowResetCategoryFailed = new MaintenanceViewState("ShowResetCategoryFailed", 13);
	//   78  176:new             #2   <Class MaintenanceViewState>
	//   79  179:dup             
	//   80  180:ldc1            #68  <String "ShowResetCategoryFailed">
	//   81  182:bipush          13
	//   82  184:invokespecial   #29  <Method void MaintenanceViewState(String, int)>
	//   83  187:putstatic       #70  <Field MaintenanceViewState ShowResetCategoryFailed>
		$VALUES = (new MaintenanceViewState[] {
			ShowCareDescription, ShowBuyParts, ShowCategoryListInProgress, HideCategoryListInProgress, UpdatePartCategoriesList, UpdatePartsList, ShowCategoriesListTitle, ShowCategoriesDetailResources, ShowConnectionWarning, ShowUnableToLoadCategories, 
			EnableCategoryStatusReset, ShowResetInProgress, ShowResetCategorySuccess, ShowResetCategoryFailed
		});
	//   84  190:bipush          14
	//   85  192:anewarray       MaintenanceViewState[]
	//   86  195:dup             
	//   87  196:iconst_0        
	//   88  197:getstatic       #31  <Field MaintenanceViewState ShowCareDescription>
	//   89  200:aastore         
	//   90  201:dup             
	//   91  202:iconst_1        
	//   92  203:getstatic       #34  <Field MaintenanceViewState ShowBuyParts>
	//   93  206:aastore         
	//   94  207:dup             
	//   95  208:iconst_2        
	//   96  209:getstatic       #37  <Field MaintenanceViewState ShowCategoryListInProgress>
	//   97  212:aastore         
	//   98  213:dup             
	//   99  214:iconst_3        
	//  100  215:getstatic       #40  <Field MaintenanceViewState HideCategoryListInProgress>
	//  101  218:aastore         
	//  102  219:dup             
	//  103  220:iconst_4        
	//  104  221:getstatic       #43  <Field MaintenanceViewState UpdatePartCategoriesList>
	//  105  224:aastore         
	//  106  225:dup             
	//  107  226:iconst_5        
	//  108  227:getstatic       #46  <Field MaintenanceViewState UpdatePartsList>
	//  109  230:aastore         
	//  110  231:dup             
	//  111  232:bipush          6
	//  112  234:getstatic       #49  <Field MaintenanceViewState ShowCategoriesListTitle>
	//  113  237:aastore         
	//  114  238:dup             
	//  115  239:bipush          7
	//  116  241:getstatic       #52  <Field MaintenanceViewState ShowCategoriesDetailResources>
	//  117  244:aastore         
	//  118  245:dup             
	//  119  246:bipush          8
	//  120  248:getstatic       #55  <Field MaintenanceViewState ShowConnectionWarning>
	//  121  251:aastore         
	//  122  252:dup             
	//  123  253:bipush          9
	//  124  255:getstatic       #58  <Field MaintenanceViewState ShowUnableToLoadCategories>
	//  125  258:aastore         
	//  126  259:dup             
	//  127  260:bipush          10
	//  128  262:getstatic       #61  <Field MaintenanceViewState EnableCategoryStatusReset>
	//  129  265:aastore         
	//  130  266:dup             
	//  131  267:bipush          11
	//  132  269:getstatic       #64  <Field MaintenanceViewState ShowResetInProgress>
	//  133  272:aastore         
	//  134  273:dup             
	//  135  274:bipush          12
	//  136  276:getstatic       #67  <Field MaintenanceViewState ShowResetCategorySuccess>
	//  137  279:aastore         
	//  138  280:dup             
	//  139  281:bipush          13
	//  140  283:getstatic       #70  <Field MaintenanceViewState ShowResetCategoryFailed>
	//  141  286:aastore         
	//  142  287:putstatic       #72  <Field MaintenanceViewState[] $VALUES>
	//* 143  290:return          
	}
}
