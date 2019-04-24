// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.widget.TextView;
import com.irobot.core.*;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.util.*;

// Referenced classes of package com.irobot.home:
//			PrivacySettingsActivity

private class PrivacySettingsActivity$a extends AccountUIServiceDataCallback
{

	public void onAccountUIServiceDataChanged(AccountUIServiceData accountuiservicedata)
	{
		if(accountuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			o.e(PrivacySettingsActivity.m(), "null service data");
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
		o.b(s, stringbuilder.toString());
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
																String s1;
																Object aobj[];
																switch(PrivacySettingsActivity$1.a[((AccountViewState) (obj)).ordinal()])
	//*  38   85:getstatic       #78  <Field int[] PrivacySettingsActivity$1.a>
	//*  39   88:aload_2         
	//*  40   89:invokevirtual   #82  <Method int AccountViewState.ordinal()>
	//*  41   92:iaload          
																{
	//*  42   93:tableswitch     1 18: default 180
	//	               1 521
	//	               2 510
	//	               3 488
	//	               4 477
	//	               5 466
	//	               6 455
	//	               7 444
	//	               8 433
	//	               9 419
	//	               10 405
	//	               11 391
	//	               12 377
	//	               13 363
	//	               14 303
	//	               15 253
	//	               16 203
	//	               17 193
	//	               18 183
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
																	aobj[0] = ((Object) (j.a(accountuiservicedata.getPrivacyConsentDate(), "yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd", TimeZone.getTimeZone("UTC"), TimeZone.getDefault())));
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
																	aobj[0] = ((Object) (j.a(accountuiservicedata.getEULAConsentDate(), "yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd", TimeZone.getTimeZone("UTC"), TimeZone.getDefault())));
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
																	aobj[0] = ((Object) (j.a(accountuiservicedata.getTermsConsentDate(), "yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd", TimeZone.getTimeZone("UTC"), TimeZone.getDefault())));
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

	private PrivacySettingsActivity$a(PrivacySettingsActivity privacysettingsactivity)
	{
		a = privacysettingsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field PrivacySettingsActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void AccountUIServiceDataCallback()>
	//    5    9:return          
	}

	PrivacySettingsActivity$a(PrivacySettingsActivity privacysettingsactivity, PrivacySettingsActivity$1 privacysettingsactivity$1)
	{
		this(privacysettingsactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void PrivacySettingsActivity$a(PrivacySettingsActivity)>
	//    3    5:return          
	}
}
