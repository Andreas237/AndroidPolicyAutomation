// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzqo, zzel

public abstract class zzqp extends zzek
	implements zzqo
{

	public zzqp()
	{
		super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.INativeContentAd">
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
													switch(i)
	//*   0    0:iload_1         
													{
	//*   1    1:tableswitch     2 17: default 80
	//	               2 271
	//	               3 254
	//	               4 237
	//	               5 229
	//	               6 221
	//	               7 213
	//	               8 205
	//	               9 188
	//	               10 177
	//	               11 169
	//	               12 152
	//	               13 123
	//	               14 106
	//	               15 98
	//	               16 90
	//	               17 82
													default:
														return false;
	//    2   80:iconst_0        
	//    3   81:ireturn         

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

													case 17: // '\021'
														parcel = ((Parcel) (getMediationAdapterClassName()));
	//    4   82:aload_0         
	//    5   83:invokevirtual   #22  <Method String getMediationAdapterClassName()>
	//    6   86:astore_2        
														break label3;
	//    7   87:goto            259

													case 16: // '\020'
														parcel = ((Parcel) (zzke()));
	//    8   90:aload_0         
	//    9   91:invokevirtual   #26  <Method com.google.android.gms.dynamic.IObjectWrapper zzke()>
	//   10   94:astore_2        
														break label1;
	//   11   95:goto            276

													case 15: // '\017'
														parcel = ((Parcel) (zzkf()));
	//   12   98:aload_0         
	//   13   99:invokevirtual   #30  <Method zzps zzkf()>
	//   14  102:astore_2        
														break label1;
	//   15  103:goto            276

													case 14: // '\016'
														reportTouchEvent((Bundle)zzel.zza(parcel, Bundle.CREATOR));
	//   16  106:aload_0         
	//   17  107:aload_2         
	//   18  108:getstatic       #36  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   19  111:invokestatic    #42  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//   20  114:checkcast       #32  <Class Bundle>
	//   21  117:invokevirtual   #46  <Method void reportTouchEvent(Bundle)>
														break;
	//   22  120:goto            181

													case 13: // '\r'
														boolean flag = recordImpression((Bundle)zzel.zza(parcel, Bundle.CREATOR));
	//   23  123:aload_0         
	//   24  124:aload_2         
	//   25  125:getstatic       #36  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   26  128:invokestatic    #42  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//   27  131:checkcast       #32  <Class Bundle>
	//   28  134:invokevirtual   #50  <Method boolean recordImpression(Bundle)>
	//   29  137:istore          5
														parcel1.writeNoException();
	//   30  139:aload_3         
	//   31  140:invokevirtual   #55  <Method void Parcel.writeNoException()>
														zzel.zza(parcel1, flag);
	//   32  143:aload_3         
	//   33  144:iload           5
	//   34  146:invokestatic    #58  <Method void zzel.zza(Parcel, boolean)>
														break label0;
	//   35  149:goto            285

													case 12: // '\f'
														performClick((Bundle)zzel.zza(parcel, Bundle.CREATOR));
	//   36  152:aload_0         
	//   37  153:aload_2         
	//   38  154:getstatic       #36  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   39  157:invokestatic    #42  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//   40  160:checkcast       #32  <Class Bundle>
	//   41  163:invokevirtual   #61  <Method void performClick(Bundle)>
														break;
	//   42  166:goto            181

													case 11: // '\013'
														parcel = ((Parcel) (getVideoController()));
	//   43  169:aload_0         
	//   44  170:invokevirtual   #65  <Method zzlo getVideoController()>
	//   45  173:astore_2        
														break label1;
	//   46  174:goto            276

													case 10: // '\n'
														destroy();
	//   47  177:aload_0         
	//   48  178:invokevirtual   #68  <Method void destroy()>
														break;
													}
													parcel1.writeNoException();
	//   49  181:aload_3         
	//   50  182:invokevirtual   #55  <Method void Parcel.writeNoException()>
													break label0;
	//   51  185:goto            285
												}
												parcel = ((Parcel) (getExtras()));
	//   52  188:aload_0         
	//   53  189:invokevirtual   #72  <Method Bundle getExtras()>
	//   54  192:astore_2        
												parcel1.writeNoException();
	//   55  193:aload_3         
	//   56  194:invokevirtual   #55  <Method void Parcel.writeNoException()>
												zzel.zzb(parcel1, ((android.os.Parcelable) (parcel)));
	//   57  197:aload_3         
	//   58  198:aload_2         
	//   59  199:invokestatic    #76  <Method void zzel.zzb(Parcel, android.os.Parcelable)>
												break label0;
	//   60  202:goto            285
											}
											parcel = ((Parcel) (getAdvertiser()));
	//   61  205:aload_0         
	//   62  206:invokevirtual   #79  <Method String getAdvertiser()>
	//   63  209:astore_2        
											break label3;
	//   64  210:goto            259
										}
										parcel = ((Parcel) (getCallToAction()));
	//   65  213:aload_0         
	//   66  214:invokevirtual   #82  <Method String getCallToAction()>
	//   67  217:astore_2        
										break label3;
	//   68  218:goto            259
									}
									parcel = ((Parcel) (zzkg()));
	//   69  221:aload_0         
	//   70  222:invokevirtual   #86  <Method zzpw zzkg()>
	//   71  225:astore_2        
									break label1;
	//   72  226:goto            276
								}
								parcel = ((Parcel) (getBody()));
	//   73  229:aload_0         
	//   74  230:invokevirtual   #89  <Method String getBody()>
	//   75  233:astore_2        
								break label3;
	//   76  234:goto            259
							}
							parcel = ((Parcel) (getImages()));
	//   77  237:aload_0         
	//   78  238:invokevirtual   #93  <Method java.util.List getImages()>
	//   79  241:astore_2        
							parcel1.writeNoException();
	//   80  242:aload_3         
	//   81  243:invokevirtual   #55  <Method void Parcel.writeNoException()>
							parcel1.writeList(((java.util.List) (parcel)));
	//   82  246:aload_3         
	//   83  247:aload_2         
	//   84  248:invokevirtual   #97  <Method void Parcel.writeList(java.util.List)>
							break label0;
	//   85  251:goto            285
						}
						parcel = ((Parcel) (getHeadline()));
	//   86  254:aload_0         
	//   87  255:invokevirtual   #100 <Method String getHeadline()>
	//   88  258:astore_2        
					}
					parcel1.writeNoException();
	//   89  259:aload_3         
	//   90  260:invokevirtual   #55  <Method void Parcel.writeNoException()>
					parcel1.writeString(((String) (parcel)));
	//   91  263:aload_3         
	//   92  264:aload_2         
	//   93  265:invokevirtual   #103 <Method void Parcel.writeString(String)>
					break label0;
	//   94  268:goto            285
				}
				parcel = ((Parcel) (zzka()));
	//   95  271:aload_0         
	//   96  272:invokevirtual   #106 <Method com.google.android.gms.dynamic.IObjectWrapper zzka()>
	//   97  275:astore_2        
			}
			parcel1.writeNoException();
	//   98  276:aload_3         
	//   99  277:invokevirtual   #55  <Method void Parcel.writeNoException()>
			zzel.zza(parcel1, ((android.os.IInterface) (parcel)));
	//  100  280:aload_3         
	//  101  281:aload_2         
	//  102  282:invokestatic    #109 <Method void zzel.zza(Parcel, android.os.IInterface)>
		}
		return true;
	//  103  285:iconst_1        
	//  104  286:ireturn         
	}
}
