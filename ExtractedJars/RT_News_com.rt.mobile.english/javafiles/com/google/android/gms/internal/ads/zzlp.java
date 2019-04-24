// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzlo, zzlq, zzel, 
//			zzlr, zzlt

public abstract class zzlp extends zzek
	implements zzlo
{

	public zzlp()
	{
		super("com.google.android.gms.ads.internal.client.IVideoController");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IVideoController">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	public static zzlo zze(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IVideoController">
	//    6    9:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof zzlo)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class zzlo>
	//*  10   19:ifeq            27
			return (zzlo)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class zzlo>
	//   13   26:areturn         
		else
			return ((zzlo) (new zzlq(ibinder)));
	//   14   27:new             #24  <Class zzlq>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void zzlq(IBinder)>
	//   18   35:areturn         
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
							boolean flag;
label5:
							{
label6:
								{
label7:
									{
										float f;
										switch(i)
	//*   0    0:iload_1         
										{
	//*   1    1:tableswitch     1 12: default 64
	//	               1 250
	//	               2 243
	//	               3 232
	//	               4 213
	//	               5 196
	//	               6 177
	//	               7 168
	//	               8 110
	//	               9 101
	//	               10 92
	//	               11 75
	//	               12 66
										default:
											return false;
	//    2   64:iconst_0        
	//    3   65:ireturn         

										case 1: // '\001'
											break label2;

										case 2: // '\002'
											break label3;

										case 3: // '\003'
											break label4;

										case 4: // '\004'
											break label6;

										case 5: // '\005'
											break label7;

										case 12: // '\f'
											flag = isClickToExpandEnabled();
	//    4   66:aload_0         
	//    5   67:invokevirtual   #35  <Method boolean isClickToExpandEnabled()>
	//    6   70:istore          6
											break label5;
	//    7   72:goto            219

										case 11: // '\013'
											parcel = ((Parcel) (zzio()));
	//    8   75:aload_0         
	//    9   76:invokevirtual   #39  <Method zzlr zzio()>
	//   10   79:astore_2        
											parcel1.writeNoException();
	//   11   80:aload_3         
	//   12   81:invokevirtual   #44  <Method void Parcel.writeNoException()>
											zzel.zza(parcel1, ((android.os.IInterface) (parcel)));
	//   13   84:aload_3         
	//   14   85:aload_2         
	//   15   86:invokestatic    #50  <Method void zzel.zza(Parcel, android.os.IInterface)>
											break label0;
	//   16   89:goto            258

										case 10: // '\n'
											flag = isCustomControlsEnabled();
	//   17   92:aload_0         
	//   18   93:invokevirtual   #53  <Method boolean isCustomControlsEnabled()>
	//   19   96:istore          6
											break label5;
	//   20   98:goto            219

										case 9: // '\t'
											f = getAspectRatio();
	//   21  101:aload_0         
	//   22  102:invokevirtual   #57  <Method float getAspectRatio()>
	//   23  105:fstore          5
											break;
	//   24  107:goto            183

										case 8: // '\b'
											parcel = ((Parcel) (parcel.readStrongBinder()));
	//   25  110:aload_2         
	//   26  111:invokevirtual   #61  <Method IBinder Parcel.readStrongBinder()>
	//   27  114:astore_2        
											if(parcel == null)
	//*  28  115:aload_2         
	//*  29  116:ifnonnull       124
											{
												parcel = null;
	//   30  119:aconst_null     
	//   31  120:astore_2        
											} else
	//*  32  121:goto            160
											{
												android.os.IInterface iinterface = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
	//   33  124:aload_2         
	//   34  125:ldc1            #63  <String "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks">
	//   35  127:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   36  132:astore          7
												if(iinterface instanceof zzlr)
	//*  37  134:aload           7
	//*  38  136:instanceof      #65  <Class zzlr>
	//*  39  139:ifeq            151
													parcel = ((Parcel) ((zzlr)iinterface));
	//   40  142:aload           7
	//   41  144:checkcast       #65  <Class zzlr>
	//   42  147:astore_2        
												else
	//*  43  148:goto            160
													parcel = ((Parcel) (new zzlt(((IBinder) (parcel)))));
	//   44  151:new             #67  <Class zzlt>
	//   45  154:dup             
	//   46  155:aload_2         
	//   47  156:invokespecial   #68  <Method void zzlt(IBinder)>
	//   48  159:astore_2        
											}
											zza(((zzlr) (parcel)));
	//   49  160:aload_0         
	//   50  161:aload_2         
	//   51  162:invokevirtual   #71  <Method void zza(zzlr)>
											break label1;
	//   52  165:goto            254

										case 7: // '\007'
											f = zzin();
	//   53  168:aload_0         
	//   54  169:invokevirtual   #74  <Method float zzin()>
	//   55  172:fstore          5
											break;
	//   56  174:goto            183

										case 6: // '\006'
											f = zzim();
	//   57  177:aload_0         
	//   58  178:invokevirtual   #77  <Method float zzim()>
	//   59  181:fstore          5
											break;
										}
										parcel1.writeNoException();
	//   60  183:aload_3         
	//   61  184:invokevirtual   #44  <Method void Parcel.writeNoException()>
										parcel1.writeFloat(f);
	//   62  187:aload_3         
	//   63  188:fload           5
	//   64  190:invokevirtual   #81  <Method void Parcel.writeFloat(float)>
										break label0;
	//   65  193:goto            258
									}
									i = getPlaybackState();
	//   66  196:aload_0         
	//   67  197:invokevirtual   #85  <Method int getPlaybackState()>
	//   68  200:istore_1        
									parcel1.writeNoException();
	//   69  201:aload_3         
	//   70  202:invokevirtual   #44  <Method void Parcel.writeNoException()>
									parcel1.writeInt(i);
	//   71  205:aload_3         
	//   72  206:iload_1         
	//   73  207:invokevirtual   #89  <Method void Parcel.writeInt(int)>
									break label0;
	//   74  210:goto            258
								}
								flag = isMuted();
	//   75  213:aload_0         
	//   76  214:invokevirtual   #92  <Method boolean isMuted()>
	//   77  217:istore          6
							}
							parcel1.writeNoException();
	//   78  219:aload_3         
	//   79  220:invokevirtual   #44  <Method void Parcel.writeNoException()>
							zzel.zza(parcel1, flag);
	//   80  223:aload_3         
	//   81  224:iload           6
	//   82  226:invokestatic    #95  <Method void zzel.zza(Parcel, boolean)>
							break label0;
	//   83  229:goto            258
						}
						mute(zzel.zza(parcel));
	//   84  232:aload_0         
	//   85  233:aload_2         
	//   86  234:invokestatic    #98  <Method boolean zzel.zza(Parcel)>
	//   87  237:invokevirtual   #102 <Method void mute(boolean)>
						break label1;
	//   88  240:goto            254
					}
					pause();
	//   89  243:aload_0         
	//   90  244:invokevirtual   #105 <Method void pause()>
					break label1;
	//   91  247:goto            254
				}
				play();
	//   92  250:aload_0         
	//   93  251:invokevirtual   #108 <Method void play()>
			}
			parcel1.writeNoException();
	//   94  254:aload_3         
	//   95  255:invokevirtual   #44  <Method void Parcel.writeNoException()>
		}
		return true;
	//   96  258:iconst_1        
	//   97  259:ireturn         
	}
}
