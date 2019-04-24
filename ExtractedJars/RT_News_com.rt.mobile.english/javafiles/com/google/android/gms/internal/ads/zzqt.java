// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzqs, zzqu, zzel

public abstract class zzqt extends zzek
	implements zzqs
{

	public zzqt()
	{
		super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	public static zzqs zzk(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd">
	//    6    9:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof zzqs)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class zzqs>
	//*  10   19:ifeq            27
			return (zzqs)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class zzqs>
	//   13   26:areturn         
		else
			return ((zzqs) (new zzqu(ibinder)));
	//   14   27:new             #24  <Class zzqu>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void zzqu(IBinder)>
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
label5:
							{
label6:
								{
									switch(i)
	//*   0    0:iload_1         
									{
	//*   1    1:tableswitch     1 11: default 60
	//	               1 187
	//	               2 166
	//	               3 149
	//	               4 141
	//	               5 126
	//	               6 119
	//	               7 111
	//	               8 104
	//	               9 96
	//	               10 70
	//	               11 62
									default:
										return false;
	//    2   60:iconst_0        
	//    3   61:ireturn         

									case 1: // '\001'
										break label2;

									case 2: // '\002'
										break label4;

									case 3: // '\003'
										break label5;

									case 4: // '\004'
										break label6;

									case 11: // '\013'
										parcel = ((Parcel) (zzka()));
	//    4   62:aload_0         
	//    5   63:invokevirtual   #35  <Method com.google.android.gms.dynamic.IObjectWrapper zzka()>
	//    6   66:astore_2        
										break label3;
	//    7   67:goto            175

									case 10: // '\n'
										boolean flag = zzh(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//    8   70:aload_0         
	//    9   71:aload_2         
	//   10   72:invokevirtual   #41  <Method IBinder Parcel.readStrongBinder()>
	//   11   75:invokestatic    #47  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   12   78:invokevirtual   #51  <Method boolean zzh(com.google.android.gms.dynamic.IObjectWrapper)>
	//   13   81:istore          5
										parcel1.writeNoException();
	//   14   83:aload_3         
	//   15   84:invokevirtual   #54  <Method void Parcel.writeNoException()>
										zzel.zza(parcel1, flag);
	//   16   87:aload_3         
	//   17   88:iload           5
	//   18   90:invokestatic    #60  <Method void zzel.zza(Parcel, boolean)>
										break label0;
	//   19   93:goto            205

									case 9: // '\t'
										parcel = ((Parcel) (zzkh()));
	//   20   96:aload_0         
	//   21   97:invokevirtual   #63  <Method com.google.android.gms.dynamic.IObjectWrapper zzkh()>
	//   22  100:astore_2        
										break label3;
	//   23  101:goto            175

									case 8: // '\b'
										destroy();
	//   24  104:aload_0         
	//   25  105:invokevirtual   #66  <Method void destroy()>
										break;
	//   26  108:goto            134

									case 7: // '\007'
										parcel = ((Parcel) (getVideoController()));
	//   27  111:aload_0         
	//   28  112:invokevirtual   #70  <Method zzlo getVideoController()>
	//   29  115:astore_2        
										break label3;
	//   30  116:goto            175

									case 6: // '\006'
										recordImpression();
	//   31  119:aload_0         
	//   32  120:invokevirtual   #73  <Method void recordImpression()>
										break;
	//   33  123:goto            134

									case 5: // '\005'
										performClick(parcel.readString());
	//   34  126:aload_0         
	//   35  127:aload_2         
	//   36  128:invokevirtual   #77  <Method String Parcel.readString()>
	//   37  131:invokevirtual   #80  <Method void performClick(String)>
										break;
									}
									parcel1.writeNoException();
	//   38  134:aload_3         
	//   39  135:invokevirtual   #54  <Method void Parcel.writeNoException()>
									break label0;
	//   40  138:goto            205
								}
								parcel = ((Parcel) (getCustomTemplateId()));
	//   41  141:aload_0         
	//   42  142:invokevirtual   #83  <Method String getCustomTemplateId()>
	//   43  145:astore_2        
								break label1;
	//   44  146:goto            196
							}
							parcel = ((Parcel) (getAvailableAssetNames()));
	//   45  149:aload_0         
	//   46  150:invokevirtual   #87  <Method java.util.List getAvailableAssetNames()>
	//   47  153:astore_2        
							parcel1.writeNoException();
	//   48  154:aload_3         
	//   49  155:invokevirtual   #54  <Method void Parcel.writeNoException()>
							parcel1.writeStringList(((java.util.List) (parcel)));
	//   50  158:aload_3         
	//   51  159:aload_2         
	//   52  160:invokevirtual   #91  <Method void Parcel.writeStringList(java.util.List)>
							break label0;
	//   53  163:goto            205
						}
						parcel = ((Parcel) (zzap(parcel.readString())));
	//   54  166:aload_0         
	//   55  167:aload_2         
	//   56  168:invokevirtual   #77  <Method String Parcel.readString()>
	//   57  171:invokevirtual   #95  <Method zzpw zzap(String)>
	//   58  174:astore_2        
					}
					parcel1.writeNoException();
	//   59  175:aload_3         
	//   60  176:invokevirtual   #54  <Method void Parcel.writeNoException()>
					zzel.zza(parcel1, ((android.os.IInterface) (parcel)));
	//   61  179:aload_3         
	//   62  180:aload_2         
	//   63  181:invokestatic    #98  <Method void zzel.zza(Parcel, android.os.IInterface)>
					break label0;
	//   64  184:goto            205
				}
				parcel = ((Parcel) (zzao(parcel.readString())));
	//   65  187:aload_0         
	//   66  188:aload_2         
	//   67  189:invokevirtual   #77  <Method String Parcel.readString()>
	//   68  192:invokevirtual   #102 <Method String zzao(String)>
	//   69  195:astore_2        
			}
			parcel1.writeNoException();
	//   70  196:aload_3         
	//   71  197:invokevirtual   #54  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//   72  200:aload_3         
	//   73  201:aload_2         
	//   74  202:invokevirtual   #105 <Method void Parcel.writeString(String)>
		}
		return true;
	//   75  205:iconst_1        
	//   76  206:ireturn         
	}
}
