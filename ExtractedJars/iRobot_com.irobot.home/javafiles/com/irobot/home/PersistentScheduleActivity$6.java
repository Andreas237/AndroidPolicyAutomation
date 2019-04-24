// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.ScheduleViewState;

// Referenced classes of package com.irobot.home:
//			PersistentScheduleActivity

static class PersistentScheduleActivity$6
{

	static final int a[];

	static 
	{
		a = new int[ScheduleViewState.values().length];
	//    0    0:invokestatic    #18  <Method ScheduleViewState[] ScheduleViewState.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] a>
		try
		{
			a[ScheduleViewState.MappingScheduleShowConflictDialog.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] a>
	//    5   12:getstatic       #24  <Field ScheduleViewState ScheduleViewState.MappingScheduleShowConflictDialog>
	//    6   15:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] a>
	//*  10   23:getstatic       #31  <Field ScheduleViewState ScheduleViewState.MappingScheduleShowProgressDialog>
	//*  11   26:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] a>
	//*  15   34:getstatic       #34  <Field ScheduleViewState ScheduleViewState.MappingScheduleShowTimeoutError>
	//*  16   37:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] a>
	//*  20   45:getstatic       #37  <Field ScheduleViewState ScheduleViewState.MappingScheduleRemoveScheduleItem>
	//*  21   48:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #20  <Field int[] a>
	//*  25   56:getstatic       #40  <Field ScheduleViewState ScheduleViewState.MappingScheduleShowCannotConnect>
	//*  26   59:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #20  <Field int[] a>
	//*  30   67:getstatic       #43  <Field ScheduleViewState ScheduleViewState.MappingScheduleShowConnectionErrorDialog>
	//*  31   70:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:getstatic       #20  <Field int[] a>
	//*  35   79:getstatic       #46  <Field ScheduleViewState ScheduleViewState.MappingScheduleEnableListSelection>
	//*  36   82:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
	//*  37   85:bipush          7
	//*  38   87:iastore         
	//*  39   88:getstatic       #20  <Field int[] a>
	//*  40   91:getstatic       #49  <Field ScheduleViewState ScheduleViewState.MappingScheduleDismissAllDialogs>
	//*  41   94:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
	//*  42   97:bipush          8
	//*  43   99:iastore         
	//*  44  100:getstatic       #20  <Field int[] a>
	//*  45  103:getstatic       #52  <Field ScheduleViewState ScheduleViewState.MappingScheduleDismissProgressDialog>
	//*  46  106:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
	//*  47  109:bipush          9
	//*  48  111:iastore         
	//*  49  112:getstatic       #20  <Field int[] a>
	//*  50  115:getstatic       #55  <Field ScheduleViewState ScheduleViewState.MappingSchedulePopulateSchedulesList>
	//*  51  118:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
	//*  52  121:bipush          10
	//*  53  123:iastore         
	//*  54  124:getstatic       #20  <Field int[] a>
	//*  55  127:getstatic       #58  <Field ScheduleViewState ScheduleViewState.MappingScheduleShowMaxCountDialog>
	//*  56  130:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
	//*  57  133:bipush          11
	//*  58  135:iastore         
	//*  59  136:getstatic       #20  <Field int[] a>
	//*  60  139:getstatic       #61  <Field ScheduleViewState ScheduleViewState.MappingScheduleShowScheduleCreateScreen>
	//*  61  142:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
	//*  62  145:bipush          12
	//*  63  147:iastore         
	//*  64  148:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   65  149:astore_0        
		try
		{
			a[ScheduleViewState.MappingScheduleShowProgressDialog.ordinal()] = 2;
		}
	//*  66  150:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   67  153:astore_0        
		try
		{
			a[ScheduleViewState.MappingScheduleShowTimeoutError.ordinal()] = 3;
		}
	//*  68  154:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   69  157:astore_0        
		try
		{
			a[ScheduleViewState.MappingScheduleRemoveScheduleItem.ordinal()] = 4;
		}
	//*  70  158:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   71  161:astore_0        
		try
		{
			a[ScheduleViewState.MappingScheduleShowCannotConnect.ordinal()] = 5;
		}
	//*  72  162:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   73  165:astore_0        
		try
		{
			a[ScheduleViewState.MappingScheduleShowConnectionErrorDialog.ordinal()] = 6;
		}
	//*  74  166:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   75  169:astore_0        
		try
		{
			a[ScheduleViewState.MappingScheduleEnableListSelection.ordinal()] = 7;
		}
	//*  76  170:goto            76
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   77  173:astore_0        
		try
		{
			a[ScheduleViewState.MappingScheduleDismissAllDialogs.ordinal()] = 8;
		}
	//*  78  174:goto            88
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   79  177:astore_0        
		try
		{
			a[ScheduleViewState.MappingScheduleDismissProgressDialog.ordinal()] = 9;
		}
	//*  80  178:goto            100
		catch(NoSuchFieldError nosuchfielderror8) { }
	//   81  181:astore_0        
		try
		{
			a[ScheduleViewState.MappingSchedulePopulateSchedulesList.ordinal()] = 10;
		}
	//*  82  182:goto            112
		catch(NoSuchFieldError nosuchfielderror9) { }
	//   83  185:astore_0        
		try
		{
			a[ScheduleViewState.MappingScheduleShowMaxCountDialog.ordinal()] = 11;
		}
	//*  84  186:goto            124
		catch(NoSuchFieldError nosuchfielderror10) { }
	//   85  189:astore_0        
		try
		{
			a[ScheduleViewState.MappingScheduleShowScheduleCreateScreen.ordinal()] = 12;
		}
	//*  86  190:goto            136
		catch(NoSuchFieldError nosuchfielderror11) { }
	//   87  193:astore_0        
	//*  88  194:return          
	}
}
