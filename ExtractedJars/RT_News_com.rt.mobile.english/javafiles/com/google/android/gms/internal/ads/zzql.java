// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzqk, zzel

public abstract class zzql extends zzek
	implements zzqk
{

	public zzql()
	{
		super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd">
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
															switch(i)
	//*   0    0:iload_1         
															{
	//*   1    1:tableswitch     2 19: default 88
	//	               2 306
	//	               3 289
	//	               4 272
	//	               5 264
	//	               6 256
	//	               7 248
	//	               8 229
	//	               9 221
	//	               10 213
	//	               11 196
	//	               12 185
	//	               13 177
	//	               14 160
	//	               15 131
	//	               16 114
	//	               17 106
	//	               18 98
	//	               19 90
															default:
																return false;
	//    2   88:iconst_0        
	//    3   89:ireturn         

															case 2: // '\002'
																break label2;

															case 3: // '\003'
																break label4;

															case 4: // '\004'
																break label5;

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

															case 19: // '\023'
																parcel = ((Parcel) (getMediationAdapterClassName()));
	//    4   90:aload_0         
	//    5   91:invokevirtual   #22  <Method String getMediationAdapterClassName()>
	//    6   94:astore_2        
																break label3;
	//    7   95:goto            294

															case 18: // '\022'
																parcel = ((Parcel) (zzke()));
	//    8   98:aload_0         
	//    9   99:invokevirtual   #26  <Method com.google.android.gms.dynamic.IObjectWrapper zzke()>
	//   10  102:astore_2        
																break label1;
	//   11  103:goto            311

															case 17: // '\021'
																parcel = ((Parcel) (zzkf()));
	//   12  106:aload_0         
	//   13  107:invokevirtual   #30  <Method zzps zzkf()>
	//   14  110:astore_2        
																break label1;
	//   15  111:goto            311

															case 16: // '\020'
																reportTouchEvent((Bundle)zzel.zza(parcel, Bundle.CREATOR));
	//   16  114:aload_0         
	//   17  115:aload_2         
	//   18  116:getstatic       #36  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   19  119:invokestatic    #42  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//   20  122:checkcast       #32  <Class Bundle>
	//   21  125:invokevirtual   #46  <Method void reportTouchEvent(Bundle)>
																break;
	//   22  128:goto            189

															case 15: // '\017'
																boolean flag = recordImpression((Bundle)zzel.zza(parcel, Bundle.CREATOR));
	//   23  131:aload_0         
	//   24  132:aload_2         
	//   25  133:getstatic       #36  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   26  136:invokestatic    #42  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//   27  139:checkcast       #32  <Class Bundle>
	//   28  142:invokevirtual   #50  <Method boolean recordImpression(Bundle)>
	//   29  145:istore          7
																parcel1.writeNoException();
	//   30  147:aload_3         
	//   31  148:invokevirtual   #55  <Method void Parcel.writeNoException()>
																zzel.zza(parcel1, flag);
	//   32  151:aload_3         
	//   33  152:iload           7
	//   34  154:invokestatic    #58  <Method void zzel.zza(Parcel, boolean)>
																break label0;
	//   35  157:goto            320

															case 14: // '\016'
																performClick((Bundle)zzel.zza(parcel, Bundle.CREATOR));
	//   36  160:aload_0         
	//   37  161:aload_2         
	//   38  162:getstatic       #36  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   39  165:invokestatic    #42  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//   40  168:checkcast       #32  <Class Bundle>
	//   41  171:invokevirtual   #61  <Method void performClick(Bundle)>
																break;
	//   42  174:goto            189

															case 13: // '\r'
																parcel = ((Parcel) (getVideoController()));
	//   43  177:aload_0         
	//   44  178:invokevirtual   #65  <Method zzlo getVideoController()>
	//   45  181:astore_2        
																break label1;
	//   46  182:goto            311

															case 12: // '\f'
																destroy();
	//   47  185:aload_0         
	//   48  186:invokevirtual   #68  <Method void destroy()>
																break;
															}
															parcel1.writeNoException();
	//   49  189:aload_3         
	//   50  190:invokevirtual   #55  <Method void Parcel.writeNoException()>
															break label0;
	//   51  193:goto            320
														}
														parcel = ((Parcel) (getExtras()));
	//   52  196:aload_0         
	//   53  197:invokevirtual   #72  <Method Bundle getExtras()>
	//   54  200:astore_2        
														parcel1.writeNoException();
	//   55  201:aload_3         
	//   56  202:invokevirtual   #55  <Method void Parcel.writeNoException()>
														zzel.zzb(parcel1, ((android.os.Parcelable) (parcel)));
	//   57  205:aload_3         
	//   58  206:aload_2         
	//   59  207:invokestatic    #76  <Method void zzel.zzb(Parcel, android.os.Parcelable)>
														break label0;
	//   60  210:goto            320
													}
													parcel = ((Parcel) (getPrice()));
	//   61  213:aload_0         
	//   62  214:invokevirtual   #79  <Method String getPrice()>
	//   63  217:astore_2        
													break label3;
	//   64  218:goto            294
												}
												parcel = ((Parcel) (getStore()));
	//   65  221:aload_0         
	//   66  222:invokevirtual   #82  <Method String getStore()>
	//   67  225:astore_2        
												break label3;
	//   68  226:goto            294
											}
											double d = getStarRating();
	//   69  229:aload_0         
	//   70  230:invokevirtual   #86  <Method double getStarRating()>
	//   71  233:dstore          5
											parcel1.writeNoException();
	//   72  235:aload_3         
	//   73  236:invokevirtual   #55  <Method void Parcel.writeNoException()>
											parcel1.writeDouble(d);
	//   74  239:aload_3         
	//   75  240:dload           5
	//   76  242:invokevirtual   #90  <Method void Parcel.writeDouble(double)>
											break label0;
	//   77  245:goto            320
										}
										parcel = ((Parcel) (getCallToAction()));
	//   78  248:aload_0         
	//   79  249:invokevirtual   #93  <Method String getCallToAction()>
	//   80  252:astore_2        
										break label3;
	//   81  253:goto            294
									}
									parcel = ((Parcel) (zzjz()));
	//   82  256:aload_0         
	//   83  257:invokevirtual   #97  <Method zzpw zzjz()>
	//   84  260:astore_2        
									break label1;
	//   85  261:goto            311
								}
								parcel = ((Parcel) (getBody()));
	//   86  264:aload_0         
	//   87  265:invokevirtual   #100 <Method String getBody()>
	//   88  268:astore_2        
								break label3;
	//   89  269:goto            294
							}
							parcel = ((Parcel) (getImages()));
	//   90  272:aload_0         
	//   91  273:invokevirtual   #104 <Method java.util.List getImages()>
	//   92  276:astore_2        
							parcel1.writeNoException();
	//   93  277:aload_3         
	//   94  278:invokevirtual   #55  <Method void Parcel.writeNoException()>
							parcel1.writeList(((java.util.List) (parcel)));
	//   95  281:aload_3         
	//   96  282:aload_2         
	//   97  283:invokevirtual   #108 <Method void Parcel.writeList(java.util.List)>
							break label0;
	//   98  286:goto            320
						}
						parcel = ((Parcel) (getHeadline()));
	//   99  289:aload_0         
	//  100  290:invokevirtual   #111 <Method String getHeadline()>
	//  101  293:astore_2        
					}
					parcel1.writeNoException();
	//  102  294:aload_3         
	//  103  295:invokevirtual   #55  <Method void Parcel.writeNoException()>
					parcel1.writeString(((String) (parcel)));
	//  104  298:aload_3         
	//  105  299:aload_2         
	//  106  300:invokevirtual   #114 <Method void Parcel.writeString(String)>
					break label0;
	//  107  303:goto            320
				}
				parcel = ((Parcel) (zzka()));
	//  108  306:aload_0         
	//  109  307:invokevirtual   #117 <Method com.google.android.gms.dynamic.IObjectWrapper zzka()>
	//  110  310:astore_2        
			}
			parcel1.writeNoException();
	//  111  311:aload_3         
	//  112  312:invokevirtual   #55  <Method void Parcel.writeNoException()>
			zzel.zza(parcel1, ((android.os.IInterface) (parcel)));
	//  113  315:aload_3         
	//  114  316:aload_2         
	//  115  317:invokestatic    #120 <Method void zzel.zza(Parcel, android.os.IInterface)>
		}
		return true;
	//  116  320:iconst_1        
	//  117  321:ireturn         
	}
}
