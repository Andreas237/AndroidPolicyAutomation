// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.*;
import com.irobot.core.*;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomTextView;
import java.util.*;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, WebViewActivity_

public class PrivacySettingsActivity extends BaseFragmentActivity
{
	private class a extends AccountUIServiceDataCallback
	{

		public void onAccountUIServiceDataChanged(AccountUIServiceData accountuiservicedata)
		{
			if(accountuiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       13
			{
				com.irobot.home.util.o.e(PrivacySettingsActivity.m(), "null service data");
		//    2    4:invokestatic    #25  <Method String PrivacySettingsActivity.m()>
		//    3    7:ldc1            #27  <String "null service data">
		//    4    9:invokestatic    #33  <Method void o.e(String, String)>
				return;
		//    5   12:return          
			}
			ArrayList arraylist = accountuiservicedata.getViewStates();
		//    6   13:aload_1         
		//    7   14:invokevirtual   #39  <Method ArrayList AccountUIServiceData.getViewStates()>
		//    8   17:astore_2        
			String s = PrivacySettingsActivity.m();
		//    9   18:invokestatic    #25  <Method String PrivacySettingsActivity.m()>
		//   10   21:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
		//   11   22:new             #41  <Class StringBuilder>
		//   12   25:dup             
		//   13   26:invokespecial   #42  <Method void StringBuilder()>
		//   14   29:astore          4
			stringbuilder.append("View change list: ");
		//   15   31:aload           4
		//   16   33:ldc1            #44  <String "View change list: ">
		//   17   35:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
		//   18   38:pop             
			stringbuilder.append(arraylist.toString());
		//   19   39:aload           4
		//   20   41:aload_2         
		//   21   42:invokevirtual   #53  <Method String ArrayList.toString()>
		//   22   45:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
		//   23   48:pop             
			com.irobot.home.util.o.b(s, stringbuilder.toString());
		//   24   49:aload_3         
		//   25   50:aload           4
		//   26   52:invokevirtual   #54  <Method String StringBuilder.toString()>
		//   27   55:invokestatic    #57  <Method void o.b(String, String)>
			Iterator iterator = arraylist.iterator();
		//   28   58:aload_2         
		//   29   59:invokevirtual   #61  <Method Iterator ArrayList.iterator()>
		//   30   62:astore          5
label0:
			do
			{
label1:
				{
label2:
					{
label3:
						{
label4:
							{
label5:
								{
label6:
									{
label7:
										{
label8:
											{
label9:
												{
label10:
													{
label11:
														{
label12:
															{
label13:
																{
																	if(!iterator.hasNext())
																		break label0;
		//   31   64:aload           5
		//   32   66:invokeinterface #67  <Method boolean Iterator.hasNext()>
		//   33   71:ifeq            532
																	Object obj = ((Object) ((AccountViewState)iterator.next()));
		//   34   74:aload           5
		//   35   76:invokeinterface #71  <Method Object Iterator.next()>
		//   36   81:checkcast       #73  <Class AccountViewState>
		//   37   84:astore_2        
																	static class _cls1
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

																	String s1;
																	Object aobj[];
																	switch(_cls1.a[((AccountViewState) (obj)).ordinal()])
		//*  38   85:getstatic       #78  <Field int[] PrivacySettingsActivity$1.a>
		//*  39   88:aload_2         
		//*  40   89:invokevirtual   #82  <Method int AccountViewState.ordinal()>
		//*  41   92:iaload          
																	{
		//*  42   93:tableswitch     1 18: default 180
		//		               1 521
		//		               2 510
		//		               3 488
		//		               4 477
		//		               5 466
		//		               6 455
		//		               7 444
		//		               8 433
		//		               9 419
		//		               10 405
		//		               11 391
		//		               12 377
		//		               13 363
		//		               14 303
		//		               15 253
		//		               16 203
		//		               17 193
		//		               18 183
																	default:
																		continue;
		//   43  180:goto            64

																	case 1: // '\001'
																		break label1;

																	case 2: // '\002'
																		break label2;

																	case 3: // '\003'
																		break label3;

																	case 4: // '\004'
																		break label4;

																	case 5: // '\005'
																		break label5;

																	case 6: // '\006'
																		break label6;

																	case 7: // '\007'
																		break label7;

																	case 8: // '\b'
																		break label8;

																	case 9: // '\t'
																		break label9;

																	case 10: // '\n'
																		break label10;

																	case 11: // '\013'
																		break label11;

																	case 12: // '\f'
																		break label12;

																	case 13: // '\r'
																		break label13;

																	case 18: // '\022'
																		a.l();
		//   44  183:aload_0         
		//   45  184:getfield        #12  <Field PrivacySettingsActivity a>
		//   46  187:invokevirtual   #85  <Method void PrivacySettingsActivity.l()>
																		continue;
		//   47  190:goto            64

																	case 17: // '\021'
																		a.k();
		//   48  193:aload_0         
		//   49  194:getfield        #12  <Field PrivacySettingsActivity a>
		//   50  197:invokevirtual   #88  <Method void PrivacySettingsActivity.k()>
																		continue;
		//   51  200:goto            64

																	case 16: // '\020'
																		obj = ((Object) (a.t));
		//   52  203:aload_0         
		//   53  204:getfield        #12  <Field PrivacySettingsActivity a>
		//   54  207:getfield        #92  <Field TextView PrivacySettingsActivity.t>
		//   55  210:astore_2        
																		s1 = a.getString(0x7f0f06ac);
		//   56  211:aload_0         
		//   57  212:getfield        #12  <Field PrivacySettingsActivity a>
		//   58  215:ldc1            #93  <Int 0x7f0f06ac>
		//   59  217:invokevirtual   #97  <Method String PrivacySettingsActivity.getString(int)>
		//   60  220:astore_3        
																		aobj = new Object[1];
		//   61  221:iconst_1        
		//   62  222:anewarray       Object[]
		//   63  225:astore          4
																		aobj[0] = ((Object) (com.irobot.home.util.j.a(accountuiservicedata.getPrivacyConsentDate(), "yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd", TimeZone.getTimeZone("UTC"), TimeZone.getDefault())));
		//   64  227:aload           4
		//   65  229:iconst_0        
		//   66  230:aload_1         
		//   67  231:invokevirtual   #102 <Method String AccountUIServiceData.getPrivacyConsentDate()>
		//   68  234:ldc1            #104 <String "yyyy-MM-dd'T'HH:mm:ss">
		//   69  236:ldc1            #106 <String "yyyy-MM-dd">
		//   70  238:ldc1            #108 <String "UTC">
		//   71  240:invokestatic    #114 <Method TimeZone TimeZone.getTimeZone(String)>
		//   72  243:invokestatic    #118 <Method TimeZone TimeZone.getDefault()>
		//   73  246:invokestatic    #123 <Method String j.a(String, String, String, TimeZone, TimeZone)>
		//   74  249:aastore         
																		break;
		//   75  250:goto            350

																	case 15: // '\017'
																		obj = ((Object) (a.n));
		//   76  253:aload_0         
		//   77  254:getfield        #12  <Field PrivacySettingsActivity a>
		//   78  257:getfield        #126 <Field TextView PrivacySettingsActivity.n>
		//   79  260:astore_2        
																		s1 = a.getString(0x7f0f06ab);
		//   80  261:aload_0         
		//   81  262:getfield        #12  <Field PrivacySettingsActivity a>
		//   82  265:ldc1            #127 <Int 0x7f0f06ab>
		//   83  267:invokevirtual   #97  <Method String PrivacySettingsActivity.getString(int)>
		//   84  270:astore_3        
																		aobj = new Object[1];
		//   85  271:iconst_1        
		//   86  272:anewarray       Object[]
		//   87  275:astore          4
																		aobj[0] = ((Object) (com.irobot.home.util.j.a(accountuiservicedata.getEULAConsentDate(), "yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd", TimeZone.getTimeZone("UTC"), TimeZone.getDefault())));
		//   88  277:aload           4
		//   89  279:iconst_0        
		//   90  280:aload_1         
		//   91  281:invokevirtual   #130 <Method String AccountUIServiceData.getEULAConsentDate()>
		//   92  284:ldc1            #104 <String "yyyy-MM-dd'T'HH:mm:ss">
		//   93  286:ldc1            #106 <String "yyyy-MM-dd">
		//   94  288:ldc1            #108 <String "UTC">
		//   95  290:invokestatic    #114 <Method TimeZone TimeZone.getTimeZone(String)>
		//   96  293:invokestatic    #118 <Method TimeZone TimeZone.getDefault()>
		//   97  296:invokestatic    #123 <Method String j.a(String, String, String, TimeZone, TimeZone)>
		//   98  299:aastore         
																		break;
		//   99  300:goto            350

																	case 14: // '\016'
																		obj = ((Object) (a.l));
		//  100  303:aload_0         
		//  101  304:getfield        #12  <Field PrivacySettingsActivity a>
		//  102  307:getfield        #132 <Field TextView PrivacySettingsActivity.l>
		//  103  310:astore_2        
																		s1 = a.getString(0x7f0f06ab);
		//  104  311:aload_0         
		//  105  312:getfield        #12  <Field PrivacySettingsActivity a>
		//  106  315:ldc1            #127 <Int 0x7f0f06ab>
		//  107  317:invokevirtual   #97  <Method String PrivacySettingsActivity.getString(int)>
		//  108  320:astore_3        
																		aobj = new Object[1];
		//  109  321:iconst_1        
		//  110  322:anewarray       Object[]
		//  111  325:astore          4
																		aobj[0] = ((Object) (com.irobot.home.util.j.a(accountuiservicedata.getTermsConsentDate(), "yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd", TimeZone.getTimeZone("UTC"), TimeZone.getDefault())));
		//  112  327:aload           4
		//  113  329:iconst_0        
		//  114  330:aload_1         
		//  115  331:invokevirtual   #135 <Method String AccountUIServiceData.getTermsConsentDate()>
		//  116  334:ldc1            #104 <String "yyyy-MM-dd'T'HH:mm:ss">
		//  117  336:ldc1            #106 <String "yyyy-MM-dd">
		//  118  338:ldc1            #108 <String "UTC">
		//  119  340:invokestatic    #114 <Method TimeZone TimeZone.getTimeZone(String)>
		//  120  343:invokestatic    #118 <Method TimeZone TimeZone.getDefault()>
		//  121  346:invokestatic    #123 <Method String j.a(String, String, String, TimeZone, TimeZone)>
		//  122  349:aastore         
																		break;
																	}
																	((TextView) (obj)).setText(((CharSequence) (String.format(s1, aobj))));
		//  123  350:aload_2         
		//  124  351:aload_3         
		//  125  352:aload           4
		//  126  354:invokestatic    #141 <Method String String.format(String, Object[])>
		//  127  357:invokevirtual   #147 <Method void TextView.setText(CharSequence)>
																	continue;
		//  128  360:goto            64
																}
																PrivacySettingsActivity.e(a, accountuiservicedata.getMappingRobotsUrl());
		//  129  363:aload_0         
		//  130  364:getfield        #12  <Field PrivacySettingsActivity a>
		//  131  367:aload_1         
		//  132  368:invokevirtual   #150 <Method String AccountUIServiceData.getMappingRobotsUrl()>
		//  133  371:invokestatic    #153 <Method void PrivacySettingsActivity.e(PrivacySettingsActivity, String)>
																continue;
		//  134  374:goto            64
															}
															PrivacySettingsActivity.d(a, accountuiservicedata.getDataSecurityUrl());
		//  135  377:aload_0         
		//  136  378:getfield        #12  <Field PrivacySettingsActivity a>
		//  137  381:aload_1         
		//  138  382:invokevirtual   #156 <Method String AccountUIServiceData.getDataSecurityUrl()>
		//  139  385:invokestatic    #159 <Method void PrivacySettingsActivity.d(PrivacySettingsActivity, String)>
															continue;
		//  140  388:goto            64
														}
														PrivacySettingsActivity.c(a, accountuiservicedata.getPrivacyPolicyUrl());
		//  141  391:aload_0         
		//  142  392:getfield        #12  <Field PrivacySettingsActivity a>
		//  143  395:aload_1         
		//  144  396:invokevirtual   #162 <Method String AccountUIServiceData.getPrivacyPolicyUrl()>
		//  145  399:invokestatic    #165 <Method void PrivacySettingsActivity.c(PrivacySettingsActivity, String)>
														continue;
		//  146  402:goto            64
													}
													PrivacySettingsActivity.b(a, accountuiservicedata.getEULAUrl());
		//  147  405:aload_0         
		//  148  406:getfield        #12  <Field PrivacySettingsActivity a>
		//  149  409:aload_1         
		//  150  410:invokevirtual   #168 <Method String AccountUIServiceData.getEULAUrl()>
		//  151  413:invokestatic    #170 <Method void PrivacySettingsActivity.b(PrivacySettingsActivity, String)>
													continue;
		//  152  416:goto            64
												}
												PrivacySettingsActivity.a(a, accountuiservicedata.getTermsAndConditionsUrl());
		//  153  419:aload_0         
		//  154  420:getfield        #12  <Field PrivacySettingsActivity a>
		//  155  423:aload_1         
		//  156  424:invokevirtual   #173 <Method String AccountUIServiceData.getTermsAndConditionsUrl()>
		//  157  427:invokestatic    #175 <Method void PrivacySettingsActivity.a(PrivacySettingsActivity, String)>
												continue;
		//  158  430:goto            64
											}
											PrivacySettingsActivity.b(a, false);
		//  159  433:aload_0         
		//  160  434:getfield        #12  <Field PrivacySettingsActivity a>
		//  161  437:iconst_0        
		//  162  438:invokestatic    #178 <Method void PrivacySettingsActivity.b(PrivacySettingsActivity, boolean)>
											continue;
		//  163  441:goto            64
										}
										PrivacySettingsActivity.b(a, true);
		//  164  444:aload_0         
		//  165  445:getfield        #12  <Field PrivacySettingsActivity a>
		//  166  448:iconst_1        
		//  167  449:invokestatic    #178 <Method void PrivacySettingsActivity.b(PrivacySettingsActivity, boolean)>
										continue;
		//  168  452:goto            64
									}
									PrivacySettingsActivity.a(a, false);
		//  169  455:aload_0         
		//  170  456:getfield        #12  <Field PrivacySettingsActivity a>
		//  171  459:iconst_0        
		//  172  460:invokestatic    #180 <Method void PrivacySettingsActivity.a(PrivacySettingsActivity, boolean)>
									continue;
		//  173  463:goto            64
								}
								PrivacySettingsActivity.a(a, true);
		//  174  466:aload_0         
		//  175  467:getfield        #12  <Field PrivacySettingsActivity a>
		//  176  470:iconst_1        
		//  177  471:invokestatic    #180 <Method void PrivacySettingsActivity.a(PrivacySettingsActivity, boolean)>
								continue;
		//  178  474:goto            64
							}
							a.a(false);
		//  179  477:aload_0         
		//  180  478:getfield        #12  <Field PrivacySettingsActivity a>
		//  181  481:iconst_0        
		//  182  482:invokevirtual   #183 <Method void PrivacySettingsActivity.a(boolean)>
							continue;
		//  183  485:goto            64
						}
						a.a(true);
		//  184  488:aload_0         
		//  185  489:getfield        #12  <Field PrivacySettingsActivity a>
		//  186  492:iconst_1        
		//  187  493:invokevirtual   #183 <Method void PrivacySettingsActivity.a(boolean)>
						a.b(accountuiservicedata.getCleanMapReportsAvailable());
		//  188  496:aload_0         
		//  189  497:getfield        #12  <Field PrivacySettingsActivity a>
		//  190  500:aload_1         
		//  191  501:invokevirtual   #186 <Method boolean AccountUIServiceData.getCleanMapReportsAvailable()>
		//  192  504:invokevirtual   #188 <Method void PrivacySettingsActivity.b(boolean)>
						continue;
		//  193  507:goto            64
					}
					a.c(false);
		//  194  510:aload_0         
		//  195  511:getfield        #12  <Field PrivacySettingsActivity a>
		//  196  514:iconst_0        
		//  197  515:invokevirtual   #190 <Method void PrivacySettingsActivity.c(boolean)>
					continue;
		//  198  518:goto            64
				}
				a.c(true);
		//  199  521:aload_0         
		//  200  522:getfield        #12  <Field PrivacySettingsActivity a>
		//  201  525:iconst_1        
		//  202  526:invokevirtual   #190 <Method void PrivacySettingsActivity.c(boolean)>
			} while(true);
		//  203  529:goto            64
		//  204  532:return          
		}

		final PrivacySettingsActivity a;

		private a()
		{
			a = PrivacySettingsActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field PrivacySettingsActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void AccountUIServiceDataCallback()>
		//    5    9:return          
		}

	}


	public PrivacySettingsActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void BaseFragmentActivity()>
		w = new a(((_cls1) (null)));
	//    2    4:aload_0         
	//    3    5:new             #8   <Class PrivacySettingsActivity$a>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #48  <Method void PrivacySettingsActivity$a(PrivacySettingsActivity, PrivacySettingsActivity$1)>
	//    8   14:putfield        #50  <Field PrivacySettingsActivity$a w>
	//    9   17:return          
	}

	static void a(PrivacySettingsActivity privacysettingsactivity, String s)
	{
		privacysettingsactivity.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #54  <Method void a(String)>
	//    3    5:return          
	}

	static void a(PrivacySettingsActivity privacysettingsactivity, boolean flag)
	{
		privacysettingsactivity.d(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #58  <Method void d(boolean)>
	//    3    5:return          
	}

	private void a(String s)
	{
		boolean flag;
		if(com.irobot.home.util.j.i(s))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #63  <Method boolean j.i(String)>
	//*   2    4:ifeq            18
		{
			flag = false;
	//    3    7:iconst_0        
	//    4    8:istore_2        
		} else
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:iload_2         
	//*   8   12:ldc1            #64  <Int 0x7f0f08b3>
	//*   9   14:invokevirtual   #67  <Method void a(String, boolean, int)>
	//*  10   17:return          
		{
			s = "file:///android_asset/term/TermsAndConditions.htm";
	//   11   18:ldc1            #69  <String "file:///android_asset/term/TermsAndConditions.htm">
	//   12   20:astore_1        
			flag = true;
	//   13   21:iconst_1        
	//   14   22:istore_2        
		}
		a(s, flag, 0x7f0f08b3);
	//*  15   23:goto            9
	}

	static void b(PrivacySettingsActivity privacysettingsactivity, String s)
	{
		privacysettingsactivity.b(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #71  <Method void b(String)>
	//    3    5:return          
	}

	static void b(PrivacySettingsActivity privacysettingsactivity, boolean flag)
	{
		privacysettingsactivity.e(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #73  <Method void e(boolean)>
	//    3    5:return          
	}

	private void b(String s)
	{
		boolean flag;
		if(com.irobot.home.util.j.i(s))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #63  <Method boolean j.i(String)>
	//*   2    4:ifeq            18
		{
			flag = false;
	//    3    7:iconst_0        
	//    4    8:istore_2        
		} else
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:iload_2         
	//*   8   12:ldc1            #74  <Int 0x7f0f02cd>
	//*   9   14:invokevirtual   #67  <Method void a(String, boolean, int)>
	//*  10   17:return          
		{
			s = "file:///android_asset/eula/EULA-United_States.htm";
	//   11   18:ldc1            #76  <String "file:///android_asset/eula/EULA-United_States.htm">
	//   12   20:astore_1        
			flag = true;
	//   13   21:iconst_1        
	//   14   22:istore_2        
		}
		a(s, flag, 0x7f0f02cd);
	//*  15   23:goto            9
	}

	static void c(PrivacySettingsActivity privacysettingsactivity, String s)
	{
		privacysettingsactivity.c(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #78  <Method void c(String)>
	//    3    5:return          
	}

	private void c(String s)
	{
		boolean flag;
		if(com.irobot.home.util.j.i(s))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #63  <Method boolean j.i(String)>
	//*   2    4:ifeq            18
		{
			flag = false;
	//    3    7:iconst_0        
	//    4    8:istore_2        
		} else
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:iload_2         
	//*   8   12:ldc1            #79  <Int 0x7f0f06ad>
	//*   9   14:invokevirtual   #67  <Method void a(String, boolean, int)>
	//*  10   17:return          
		{
			s = "file:///android_asset/privacy/PrivacyPolicy.htm";
	//   11   18:ldc1            #81  <String "file:///android_asset/privacy/PrivacyPolicy.htm">
	//   12   20:astore_1        
			flag = true;
	//   13   21:iconst_1        
	//   14   22:istore_2        
		}
		a(s, flag, 0x7f0f06ad);
	//*  15   23:goto            9
	}

	static void d(PrivacySettingsActivity privacysettingsactivity, String s)
	{
		privacysettingsactivity.d(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #83  <Method void d(String)>
	//    3    5:return          
	}

	private void d(String s)
	{
		a(s, false, 0x7f0f0246);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:ldc1            #84  <Int 0x7f0f0246>
	//    4    5:invokevirtual   #67  <Method void a(String, boolean, int)>
	//    5    8:return          
	}

	private void d(boolean flag)
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #88  <Method boolean isFinishing()>
	//*   2    4:ifne            37
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #91  <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			RelativeLayout relativelayout = b;
	//    7   15:aload_0         
	//    8   16:getfield        #93  <Field RelativeLayout b>
	//    9   19:astore_3        
			byte byte0;
			if(flag)
	//*  10   20:iload_1         
	//*  11   21:ifeq            29
				byte0 = 0;
	//   12   24:iconst_0        
	//   13   25:istore_2        
			else
	//*  14   26:goto            32
				byte0 = 8;
	//   15   29:bipush          8
	//   16   31:istore_2        
			relativelayout.setVisibility(((int) (byte0)));
	//   17   32:aload_3         
	//   18   33:iload_2         
	//   19   34:invokevirtual   #99  <Method void RelativeLayout.setVisibility(int)>
		}
	//   20   37:return          
	}

	static void e(PrivacySettingsActivity privacysettingsactivity, String s)
	{
		privacysettingsactivity.f(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #101 <Method void f(String)>
	//    3    5:return          
	}

	private void e(boolean flag)
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #88  <Method boolean isFinishing()>
	//*   2    4:ifne            37
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #91  <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			RelativeLayout relativelayout = c;
	//    7   15:aload_0         
	//    8   16:getfield        #103 <Field RelativeLayout c>
	//    9   19:astore_3        
			byte byte0;
			if(flag)
	//*  10   20:iload_1         
	//*  11   21:ifeq            29
				byte0 = 0;
	//   12   24:iconst_0        
	//   13   25:istore_2        
			else
	//*  14   26:goto            32
				byte0 = 8;
	//   15   29:bipush          8
	//   16   31:istore_2        
			relativelayout.setVisibility(((int) (byte0)));
	//   17   32:aload_3         
	//   18   33:iload_2         
	//   19   34:invokevirtual   #99  <Method void RelativeLayout.setVisibility(int)>
		}
	//   20   37:return          
	}

	private void f(String s)
	{
		a(s, false, 0x7f0f0427);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:ldc1            #104 <Int 0x7f0f0427>
	//    4    5:invokevirtual   #67  <Method void a(String, boolean, int)>
	//    5    8:return          
	}

	static String m()
	{
		return v;
	//    0    0:getstatic       #107 <Field String v>
	//    1    3:areturn         
	}

	private AccountUIServiceData n()
	{
		AccountUIServiceData accountuiservicedata = AccountUIServiceData.create();
	//    0    0:invokestatic    #113 <Method AccountUIServiceData AccountUIServiceData.create()>
	//    1    3:astore_1        
		accountuiservicedata.setLanguageCode(com.irobot.home.util.j.f(((android.content.Context) (this))));
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokestatic    #116 <Method String j.f(android.content.Context)>
	//    5    9:invokevirtual   #119 <Method void AccountUIServiceData.setLanguageCode(String)>
		accountuiservicedata.setCountryCode(com.irobot.home.util.j.o());
	//    6   12:aload_1         
	//    7   13:invokestatic    #121 <Method String j.o()>
	//    8   16:invokevirtual   #124 <Method void AccountUIServiceData.setCountryCode(String)>
		return accountuiservicedata;
	//    9   19:aload_1         
	//   10   20:areturn         
	}

	void a(String s, boolean flag, int i1)
	{
		WebViewActivity_.a(((android.content.Context) (this))).a(s).a(flag).a(Integer.valueOf(i1)).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #129 <Method WebViewActivity_$a WebViewActivity_.a(android.content.Context)>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #134 <Method WebViewActivity_$a WebViewActivity_$a.a(String)>
	//    4    8:iload_2         
	//    5    9:invokevirtual   #137 <Method WebViewActivity_$a WebViewActivity_$a.a(boolean)>
	//    6   12:iload_3         
	//    7   13:invokestatic    #143 <Method Integer Integer.valueOf(int)>
	//    8   16:invokevirtual   #146 <Method WebViewActivity_$a WebViewActivity_$a.a(Integer)>
	//    9   19:invokevirtual   #149 <Method org.androidannotations.api.a.e WebViewActivity_$a.a()>
	//   10   22:pop             
	//   11   23:return          
	}

	protected void a(boolean flag)
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #88  <Method boolean isFinishing()>
	//*   2    4:ifne            37
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #91  <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			LinearLayout linearlayout = a;
	//    7   15:aload_0         
	//    8   16:getfield        #151 <Field LinearLayout a>
	//    9   19:astore_3        
			byte byte0;
			if(flag)
	//*  10   20:iload_1         
	//*  11   21:ifeq            29
				byte0 = 0;
	//   12   24:iconst_0        
	//   13   25:istore_2        
			else
	//*  14   26:goto            32
				byte0 = 8;
	//   15   29:bipush          8
	//   16   31:istore_2        
			linearlayout.setVisibility(((int) (byte0)));
	//   17   32:aload_3         
	//   18   33:iload_2         
	//   19   34:invokevirtual   #154 <Method void LinearLayout.setVisibility(int)>
		}
	//   20   37:return          
	}

	protected void b(boolean flag)
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #88  <Method boolean isFinishing()>
	//*   2    4:ifne            61
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #91  <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			int i1;
			SwitchCompat switchcompat;
			if(flag)
	//*   7   15:iload_1         
	//*   8   16:ifeq            41
			{
				i.setText(0x7f0f01a4);
	//    9   19:aload_0         
	//   10   20:getfield        #156 <Field CustomTextView i>
	//   11   23:ldc1            #157 <Int 0x7f0f01a4>
	//   12   25:invokevirtual   #162 <Method void CustomTextView.setText(int)>
				switchcompat = h;
	//   13   28:aload_0         
	//   14   29:getfield        #164 <Field SwitchCompat h>
	//   15   32:astore_3        
				i1 = 0;
	//   16   33:iconst_0        
	//   17   34:istore_2        
			} else
	//*  18   35:aload_3         
	//*  19   36:iload_2         
	//*  20   37:invokevirtual   #167 <Method void SwitchCompat.setVisibility(int)>
	//*  21   40:return          
			{
				i.setText(0x7f0f01a5);
	//   22   41:aload_0         
	//   23   42:getfield        #156 <Field CustomTextView i>
	//   24   45:ldc1            #168 <Int 0x7f0f01a5>
	//   25   47:invokevirtual   #162 <Method void CustomTextView.setText(int)>
				switchcompat = h;
	//   26   50:aload_0         
	//   27   51:getfield        #164 <Field SwitchCompat h>
	//   28   54:astore_3        
				i1 = 8;
	//   29   55:bipush          8
	//   30   57:istore_2        
			}
			switchcompat.setVisibility(i1);
			return;
		} else
	//*  31   58:goto            35
		{
			return;
	//   32   61:return          
		}
	}

	protected void c(boolean flag)
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #88  <Method boolean isFinishing()>
	//*   2    4:ifne            36
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #91  <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			ProgressBar progressbar = j;
	//    7   15:aload_0         
	//    8   16:getfield        #170 <Field ProgressBar j>
	//    9   19:astore_3        
			byte byte0;
			if(flag)
	//*  10   20:iload_1         
	//*  11   21:ifeq            29
				byte0 = 0;
	//   12   24:iconst_0        
	//   13   25:istore_2        
			else
	//*  14   26:goto            31
				byte0 = 4;
	//   15   29:iconst_4        
	//   16   30:istore_2        
			progressbar.setVisibility(((int) (byte0)));
	//   17   31:aload_3         
	//   18   32:iload_2         
	//   19   33:invokevirtual   #173 <Method void ProgressBar.setVisibility(int)>
		}
	//   20   36:return          
	}

	protected void e()
	{
		b(0x7f0f06a9);
	//    0    0:aload_0         
	//    1    1:ldc1            #174 <Int 0x7f0f06a9>
	//    2    3:invokevirtual   #176 <Method void b(int)>
		x = Assembler.getInstance().getAccountService();
	//    3    6:aload_0         
	//    4    7:invokestatic    #182 <Method Assembler Assembler.getInstance()>
	//    5   10:invokevirtual   #186 <Method AccountService Assembler.getAccountService()>
	//    6   13:putfield        #188 <Field AccountService x>
		k = (TextView)d.findViewById(0x7f0901ef);
	//    7   16:aload_0         
	//    8   17:aload_0         
	//    9   18:getfield        #190 <Field RelativeLayout d>
	//   10   21:ldc1            #191 <Int 0x7f0901ef>
	//   11   23:invokevirtual   #195 <Method View RelativeLayout.findViewById(int)>
	//   12   26:checkcast       #197 <Class TextView>
	//   13   29:putfield        #199 <Field TextView k>
		m = (TextView)e.findViewById(0x7f0901ef);
	//   14   32:aload_0         
	//   15   33:aload_0         
	//   16   34:getfield        #201 <Field RelativeLayout e>
	//   17   37:ldc1            #191 <Int 0x7f0901ef>
	//   18   39:invokevirtual   #195 <Method View RelativeLayout.findViewById(int)>
	//   19   42:checkcast       #197 <Class TextView>
	//   20   45:putfield        #203 <Field TextView m>
		o = (TextView)f.findViewById(0x7f0901ef);
	//   21   48:aload_0         
	//   22   49:aload_0         
	//   23   50:getfield        #205 <Field RelativeLayout f>
	//   24   53:ldc1            #191 <Int 0x7f0901ef>
	//   25   55:invokevirtual   #195 <Method View RelativeLayout.findViewById(int)>
	//   26   58:checkcast       #197 <Class TextView>
	//   27   61:putfield        #207 <Field TextView o>
		u = (TextView)g.findViewById(0x7f0901ef);
	//   28   64:aload_0         
	//   29   65:aload_0         
	//   30   66:getfield        #209 <Field RelativeLayout g>
	//   31   69:ldc1            #191 <Int 0x7f0901ef>
	//   32   71:invokevirtual   #195 <Method View RelativeLayout.findViewById(int)>
	//   33   74:checkcast       #197 <Class TextView>
	//   34   77:putfield        #211 <Field TextView u>
		g.findViewById(0x7f0901ee).setVisibility(8);
	//   35   80:aload_0         
	//   36   81:getfield        #209 <Field RelativeLayout g>
	//   37   84:ldc1            #212 <Int 0x7f0901ee>
	//   38   86:invokevirtual   #195 <Method View RelativeLayout.findViewById(int)>
	//   39   89:bipush          8
	//   40   91:invokevirtual   #215 <Method void View.setVisibility(int)>
		l = (TextView)d.findViewById(0x7f0901ee);
	//   41   94:aload_0         
	//   42   95:aload_0         
	//   43   96:getfield        #190 <Field RelativeLayout d>
	//   44   99:ldc1            #212 <Int 0x7f0901ee>
	//   45  101:invokevirtual   #195 <Method View RelativeLayout.findViewById(int)>
	//   46  104:checkcast       #197 <Class TextView>
	//   47  107:putfield        #217 <Field TextView l>
		n = (TextView)e.findViewById(0x7f0901ee);
	//   48  110:aload_0         
	//   49  111:aload_0         
	//   50  112:getfield        #201 <Field RelativeLayout e>
	//   51  115:ldc1            #212 <Int 0x7f0901ee>
	//   52  117:invokevirtual   #195 <Method View RelativeLayout.findViewById(int)>
	//   53  120:checkcast       #197 <Class TextView>
	//   54  123:putfield        #219 <Field TextView n>
		t = (TextView)f.findViewById(0x7f0901ee);
	//   55  126:aload_0         
	//   56  127:aload_0         
	//   57  128:getfield        #205 <Field RelativeLayout f>
	//   58  131:ldc1            #212 <Int 0x7f0901ee>
	//   59  133:invokevirtual   #195 <Method View RelativeLayout.findViewById(int)>
	//   60  136:checkcast       #197 <Class TextView>
	//   61  139:putfield        #221 <Field TextView t>
		k.setText(0x7f0f08b3);
	//   62  142:aload_0         
	//   63  143:getfield        #199 <Field TextView k>
	//   64  146:ldc1            #64  <Int 0x7f0f08b3>
	//   65  148:invokevirtual   #222 <Method void TextView.setText(int)>
		m.setText(0x7f0f02cd);
	//   66  151:aload_0         
	//   67  152:getfield        #203 <Field TextView m>
	//   68  155:ldc1            #74  <Int 0x7f0f02cd>
	//   69  157:invokevirtual   #222 <Method void TextView.setText(int)>
		o.setText(0x7f0f06ad);
	//   70  160:aload_0         
	//   71  161:getfield        #207 <Field TextView o>
	//   72  164:ldc1            #79  <Int 0x7f0f06ad>
	//   73  166:invokevirtual   #222 <Method void TextView.setText(int)>
		u.setText(0x7f0f0246);
	//   74  169:aload_0         
	//   75  170:getfield        #211 <Field TextView u>
	//   76  173:ldc1            #84  <Int 0x7f0f0246>
	//   77  175:invokevirtual   #222 <Method void TextView.setText(int)>
	//   78  178:return          
	}

	protected void f()
	{
		x.sendCommand(AccountUIServiceCommand.LearnMoreSelected, n());
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field AccountService x>
	//    2    4:getstatic       #228 <Field AccountUIServiceCommand AccountUIServiceCommand.LearnMoreSelected>
	//    3    7:aload_0         
	//    4    8:invokespecial   #230 <Method AccountUIServiceData n()>
	//    5   11:invokevirtual   #236 <Method void AccountService.sendCommand(AccountUIServiceCommand, AccountUIServiceData)>
	//    6   14:return          
	}

	protected void g()
	{
		x.sendCommand(AccountUIServiceCommand.DataSecuritySelected, n());
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field AccountService x>
	//    2    4:getstatic       #239 <Field AccountUIServiceCommand AccountUIServiceCommand.DataSecuritySelected>
	//    3    7:aload_0         
	//    4    8:invokespecial   #230 <Method AccountUIServiceData n()>
	//    5   11:invokevirtual   #236 <Method void AccountService.sendCommand(AccountUIServiceCommand, AccountUIServiceData)>
	//    6   14:return          
	}

	protected void h()
	{
		x.sendCommand(AccountUIServiceCommand.TermsAndConditionsSelected, n());
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field AccountService x>
	//    2    4:getstatic       #242 <Field AccountUIServiceCommand AccountUIServiceCommand.TermsAndConditionsSelected>
	//    3    7:aload_0         
	//    4    8:invokespecial   #230 <Method AccountUIServiceData n()>
	//    5   11:invokevirtual   #236 <Method void AccountService.sendCommand(AccountUIServiceCommand, AccountUIServiceData)>
	//    6   14:return          
	}

	protected void i()
	{
		x.sendCommand(AccountUIServiceCommand.EULASelected, n());
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field AccountService x>
	//    2    4:getstatic       #245 <Field AccountUIServiceCommand AccountUIServiceCommand.EULASelected>
	//    3    7:aload_0         
	//    4    8:invokespecial   #230 <Method AccountUIServiceData n()>
	//    5   11:invokevirtual   #236 <Method void AccountService.sendCommand(AccountUIServiceCommand, AccountUIServiceData)>
	//    6   14:return          
	}

	protected void j()
	{
		x.sendCommand(AccountUIServiceCommand.UserAgreementSelected, n());
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field AccountService x>
	//    2    4:getstatic       #248 <Field AccountUIServiceCommand AccountUIServiceCommand.UserAgreementSelected>
	//    3    7:aload_0         
	//    4    8:invokespecial   #230 <Method AccountUIServiceData n()>
	//    5   11:invokevirtual   #236 <Method void AccountService.sendCommand(AccountUIServiceCommand, AccountUIServiceData)>
	//    6   14:return          
	}

	protected void k()
	{
		(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage(0x7f0f06ae).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    0    0:new             #250 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #253 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    4    8:ldc1            #254 <Int 0x7f0f06ae>
	//    5   10:invokevirtual   #258 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//    6   13:ldc2            #259 <Int 0x7f0f05bb>
	//    7   16:aconst_null     
	//    8   17:invokevirtual   #263 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//    9   20:invokevirtual   #267 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   10   23:pop             
	//   11   24:return          
	}

	protected void l()
	{
		(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage(0x7f0f0960).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    0    0:new             #250 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #253 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    4    8:ldc2            #268 <Int 0x7f0f0960>
	//    5   11:invokevirtual   #258 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//    6   14:ldc2            #259 <Int 0x7f0f05bb>
	//    7   17:aconst_null     
	//    8   18:invokevirtual   #263 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//    9   21:invokevirtual   #267 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   10   24:pop             
	//   11   25:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #272 <Method void BaseFragmentActivity.onCreate(Bundle)>
		AnalyticsSubsystem.getInstance().trackView(ViewId.Privacy);
	//    3    5:invokestatic    #277 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    4    8:getstatic       #283 <Field ViewId ViewId.Privacy>
	//    5   11:invokevirtual   #287 <Method void AnalyticsSubsystem.trackView(ViewId)>
	//    6   14:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #290 <Method void BaseFragmentActivity.onResume()>
		x.sendCommand(AccountUIServiceCommand.QueryPrivacySettings, ((AccountUIServiceData) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #188 <Field AccountService x>
	//    4    8:getstatic       #293 <Field AccountUIServiceCommand AccountUIServiceCommand.QueryPrivacySettings>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #236 <Method void AccountService.sendCommand(AccountUIServiceCommand, AccountUIServiceData)>
	//    7   15:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #296 <Method void BaseFragmentActivity.onStart()>
		x.registerUISubscriber(((AccountUIServiceDataCallback) (w)));
	//    2    4:aload_0         
	//    3    5:getfield        #188 <Field AccountService x>
	//    4    8:aload_0         
	//    5    9:getfield        #50  <Field PrivacySettingsActivity$a w>
	//    6   12:invokevirtual   #300 <Method boolean AccountService.registerUISubscriber(AccountUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #303 <Method void BaseFragmentActivity.onStop()>
		x.unregisterSubscriber(((AccountUIServiceDataCallback) (w)));
	//    2    4:aload_0         
	//    3    5:getfield        #188 <Field AccountService x>
	//    4    8:aload_0         
	//    5    9:getfield        #50  <Field PrivacySettingsActivity$a w>
	//    6   12:invokevirtual   #306 <Method boolean AccountService.unregisterSubscriber(AccountUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	private static final String v = "PrivacySettingsActivity";
	LinearLayout a;
	RelativeLayout b;
	RelativeLayout c;
	RelativeLayout d;
	RelativeLayout e;
	RelativeLayout f;
	RelativeLayout g;
	SwitchCompat h;
	CustomTextView i;
	ProgressBar j;
	TextView k;
	TextView l;
	TextView m;
	TextView n;
	TextView o;
	TextView t;
	TextView u;
	private a w;
	private AccountService x;

	static 
	{
	//    0    0:return          
	}
}
