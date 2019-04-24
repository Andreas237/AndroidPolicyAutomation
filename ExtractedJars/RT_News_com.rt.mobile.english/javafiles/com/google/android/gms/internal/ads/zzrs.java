// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzrr, zzro, zzrq, 
//			zzel

public abstract class zzrs extends zzek
	implements zzrr
{

	public zzrs()
	{
		super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
label0:
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
																switch(i)
	//*   0    0:iload_1         
																{
	//*   1    1:tableswitch     2 22: default 100
	//	               2 391
	//	               3 374
	//	               4 366
	//	               5 349
	//	               6 341
	//	               7 333
	//	               8 314
	//	               9 306
	//	               10 298
	//	               11 290
	//	               12 282
	//	               13 271
	//	               14 263
	//	               15 246
	//	               16 217
	//	               17 200
	//	               18 192
	//	               19 184
	//	               20 167
	//	               21 109
	//	               22 102
																default:
																	return false;
	//    2  100:iconst_0        
	//    3  101:ireturn         

																case 2: // '\002'
																	break label2;

																case 3: // '\003'
																	break label3;

																case 4: // '\004'
																	break label4;

																case 5: // '\005'
																	break label6;

																case 6: // '\006'
																	break label7;

																case 7: // '\007'
																	break label8;

																case 8: // '\b'
																	break label9;

																case 9: // '\t'
																	break label10;

																case 10: // '\n'
																	break label11;

																case 11: // '\013'
																	break label12;

																case 12: // '\f'
																	break label13;

																case 22: // '\026'
																	cancelUnconfirmedClick();
	//    4  102:aload_0         
	//    5  103:invokevirtual   #21  <Method void cancelUnconfirmedClick()>
																	break;
	//    6  106:goto            275

																case 21: // '\025'
																	parcel = ((Parcel) (parcel.readStrongBinder()));
	//    7  109:aload_2         
	//    8  110:invokevirtual   #27  <Method IBinder Parcel.readStrongBinder()>
	//    9  113:astore_2        
																	if(parcel == null)
	//*  10  114:aload_2         
	//*  11  115:ifnonnull       123
																	{
																		parcel = null;
	//   12  118:aconst_null     
	//   13  119:astore_2        
																	} else
	//*  14  120:goto            159
																	{
																		android.os.IInterface iinterface = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
	//   15  123:aload_2         
	//   16  124:ldc1            #29  <String "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener">
	//   17  126:invokeinterface #35  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   18  131:astore          8
																		if(iinterface instanceof zzro)
	//*  19  133:aload           8
	//*  20  135:instanceof      #37  <Class zzro>
	//*  21  138:ifeq            150
																			parcel = ((Parcel) ((zzro)iinterface));
	//   22  141:aload           8
	//   23  143:checkcast       #37  <Class zzro>
	//   24  146:astore_2        
																		else
	//*  25  147:goto            159
																			parcel = ((Parcel) (new zzrq(((IBinder) (parcel)))));
	//   26  150:new             #39  <Class zzrq>
	//   27  153:dup             
	//   28  154:aload_2         
	//   29  155:invokespecial   #42  <Method void zzrq(IBinder)>
	//   30  158:astore_2        
																	}
																	zza(((zzro) (parcel)));
	//   31  159:aload_0         
	//   32  160:aload_2         
	//   33  161:invokevirtual   #46  <Method void zza(zzro)>
																	break;
	//   34  164:goto            275

																case 20: // '\024'
																	parcel = ((Parcel) (getExtras()));
	//   35  167:aload_0         
	//   36  168:invokevirtual   #50  <Method Bundle getExtras()>
	//   37  171:astore_2        
																	parcel1.writeNoException();
	//   38  172:aload_3         
	//   39  173:invokevirtual   #53  <Method void Parcel.writeNoException()>
																	zzel.zzb(parcel1, ((android.os.Parcelable) (parcel)));
	//   40  176:aload_3         
	//   41  177:aload_2         
	//   42  178:invokestatic    #59  <Method void zzel.zzb(Parcel, android.os.Parcelable)>
																	break label0;
	//   43  181:goto            405

																case 19: // '\023'
																	parcel = ((Parcel) (zzke()));
	//   44  184:aload_0         
	//   45  185:invokevirtual   #63  <Method com.google.android.gms.dynamic.IObjectWrapper zzke()>
	//   46  188:astore_2        
																	break label5;
	//   47  189:goto            354

																case 18: // '\022'
																	parcel = ((Parcel) (zzka()));
	//   48  192:aload_0         
	//   49  193:invokevirtual   #66  <Method com.google.android.gms.dynamic.IObjectWrapper zzka()>
	//   50  196:astore_2        
																	break label5;
	//   51  197:goto            354

																case 17: // '\021'
																	reportTouchEvent((Bundle)zzel.zza(parcel, Bundle.CREATOR));
	//   52  200:aload_0         
	//   53  201:aload_2         
	//   54  202:getstatic       #72  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   55  205:invokestatic    #75  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//   56  208:checkcast       #68  <Class Bundle>
	//   57  211:invokevirtual   #79  <Method void reportTouchEvent(Bundle)>
																	break;
	//   58  214:goto            275

																case 16: // '\020'
																	boolean flag = recordImpression((Bundle)zzel.zza(parcel, Bundle.CREATOR));
	//   59  217:aload_0         
	//   60  218:aload_2         
	//   61  219:getstatic       #72  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   62  222:invokestatic    #75  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//   63  225:checkcast       #68  <Class Bundle>
	//   64  228:invokevirtual   #83  <Method boolean recordImpression(Bundle)>
	//   65  231:istore          7
																	parcel1.writeNoException();
	//   66  233:aload_3         
	//   67  234:invokevirtual   #53  <Method void Parcel.writeNoException()>
																	zzel.zza(parcel1, flag);
	//   68  237:aload_3         
	//   69  238:iload           7
	//   70  240:invokestatic    #86  <Method void zzel.zza(Parcel, boolean)>
																	break label0;
	//   71  243:goto            405

																case 15: // '\017'
																	performClick((Bundle)zzel.zza(parcel, Bundle.CREATOR));
	//   72  246:aload_0         
	//   73  247:aload_2         
	//   74  248:getstatic       #72  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   75  251:invokestatic    #75  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//   76  254:checkcast       #68  <Class Bundle>
	//   77  257:invokevirtual   #89  <Method void performClick(Bundle)>
																	break;
	//   78  260:goto            275

																case 14: // '\016'
																	parcel = ((Parcel) (zzkf()));
	//   79  263:aload_0         
	//   80  264:invokevirtual   #93  <Method zzps zzkf()>
	//   81  267:astore_2        
																	break label5;
	//   82  268:goto            354

																case 13: // '\r'
																	destroy();
	//   83  271:aload_0         
	//   84  272:invokevirtual   #96  <Method void destroy()>
																	break;
																}
																parcel1.writeNoException();
	//   85  275:aload_3         
	//   86  276:invokevirtual   #53  <Method void Parcel.writeNoException()>
																break label0;
	//   87  279:goto            405
															}
															parcel = ((Parcel) (getMediationAdapterClassName()));
	//   88  282:aload_0         
	//   89  283:invokevirtual   #100 <Method String getMediationAdapterClassName()>
	//   90  286:astore_2        
															break label1;
	//   91  287:goto            396
														}
														parcel = ((Parcel) (getVideoController()));
	//   92  290:aload_0         
	//   93  291:invokevirtual   #104 <Method zzlo getVideoController()>
	//   94  294:astore_2        
														break label5;
	//   95  295:goto            354
													}
													parcel = ((Parcel) (getPrice()));
	//   96  298:aload_0         
	//   97  299:invokevirtual   #107 <Method String getPrice()>
	//   98  302:astore_2        
													break label1;
	//   99  303:goto            396
												}
												parcel = ((Parcel) (getStore()));
	//  100  306:aload_0         
	//  101  307:invokevirtual   #110 <Method String getStore()>
	//  102  310:astore_2        
												break label1;
	//  103  311:goto            396
											}
											double d = getStarRating();
	//  104  314:aload_0         
	//  105  315:invokevirtual   #114 <Method double getStarRating()>
	//  106  318:dstore          5
											parcel1.writeNoException();
	//  107  320:aload_3         
	//  108  321:invokevirtual   #53  <Method void Parcel.writeNoException()>
											parcel1.writeDouble(d);
	//  109  324:aload_3         
	//  110  325:dload           5
	//  111  327:invokevirtual   #118 <Method void Parcel.writeDouble(double)>
											break label0;
	//  112  330:goto            405
										}
										parcel = ((Parcel) (getAdvertiser()));
	//  113  333:aload_0         
	//  114  334:invokevirtual   #121 <Method String getAdvertiser()>
	//  115  337:astore_2        
										break label1;
	//  116  338:goto            396
									}
									parcel = ((Parcel) (getCallToAction()));
	//  117  341:aload_0         
	//  118  342:invokevirtual   #124 <Method String getCallToAction()>
	//  119  345:astore_2        
									break label1;
	//  120  346:goto            396
								}
								parcel = ((Parcel) (zzjz()));
	//  121  349:aload_0         
	//  122  350:invokevirtual   #128 <Method zzpw zzjz()>
	//  123  353:astore_2        
							}
							parcel1.writeNoException();
	//  124  354:aload_3         
	//  125  355:invokevirtual   #53  <Method void Parcel.writeNoException()>
							zzel.zza(parcel1, ((android.os.IInterface) (parcel)));
	//  126  358:aload_3         
	//  127  359:aload_2         
	//  128  360:invokestatic    #131 <Method void zzel.zza(Parcel, android.os.IInterface)>
							break label0;
	//  129  363:goto            405
						}
						parcel = ((Parcel) (getBody()));
	//  130  366:aload_0         
	//  131  367:invokevirtual   #134 <Method String getBody()>
	//  132  370:astore_2        
						break label1;
	//  133  371:goto            396
					}
					parcel = ((Parcel) (getImages()));
	//  134  374:aload_0         
	//  135  375:invokevirtual   #138 <Method java.util.List getImages()>
	//  136  378:astore_2        
					parcel1.writeNoException();
	//  137  379:aload_3         
	//  138  380:invokevirtual   #53  <Method void Parcel.writeNoException()>
					parcel1.writeList(((java.util.List) (parcel)));
	//  139  383:aload_3         
	//  140  384:aload_2         
	//  141  385:invokevirtual   #142 <Method void Parcel.writeList(java.util.List)>
					break label0;
	//  142  388:goto            405
				}
				parcel = ((Parcel) (getHeadline()));
	//  143  391:aload_0         
	//  144  392:invokevirtual   #145 <Method String getHeadline()>
	//  145  395:astore_2        
			}
			parcel1.writeNoException();
	//  146  396:aload_3         
	//  147  397:invokevirtual   #53  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//  148  400:aload_3         
	//  149  401:aload_2         
	//  150  402:invokevirtual   #148 <Method void Parcel.writeString(String)>
		}
		return true;
	//  151  405:iconst_1        
	//  152  406:ireturn         
	}
}
