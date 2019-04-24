// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzaap, zzaar, zzel

public abstract class zzaaq extends zzek
	implements zzaap
{

	public zzaaq()
	{
		super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.overlay.client.IAdOverlay">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	public static zzaap zzu(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.overlay.client.IAdOverlay">
	//    6    9:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof zzaap)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class zzaap>
	//*  10   19:ifeq            27
			return (zzaap)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class zzaap>
	//   13   26:areturn         
		else
			return ((zzaap) (new zzaar(ibinder)));
	//   14   27:new             #24  <Class zzaar>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void zzaar(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
label0:
		{
			switch(i)
	//*   0    0:iload_1         
			{
	//*   1    1:tableswitch     1 13: default 68
	//	               1 212
	//	               2 205
	//	               3 198
	//	               4 191
	//	               5 184
	//	               6 156
	//	               7 149
	//	               8 142
	//	               9 135
	//	               10 128
	//	               11 109
	//	               12 84
	//	               13 70
			default:
				return false;
	//    2   68:iconst_0        
	//    3   69:ireturn         

			case 13: // '\r'
				zzo(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//    4   70:aload_0         
	//    5   71:aload_2         
	//    6   72:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//    7   75:invokestatic    #43  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//    8   78:invokevirtual   #47  <Method void zzo(com.google.android.gms.dynamic.IObjectWrapper)>
				break;
	//    9   81:goto            226

			case 12: // '\f'
				onActivityResult(parcel.readInt(), parcel.readInt(), (Intent)zzel.zza(parcel, Intent.CREATOR));
	//   10   84:aload_0         
	//   11   85:aload_2         
	//   12   86:invokevirtual   #51  <Method int Parcel.readInt()>
	//   13   89:aload_2         
	//   14   90:invokevirtual   #51  <Method int Parcel.readInt()>
	//   15   93:aload_2         
	//   16   94:getstatic       #57  <Field android.os.Parcelable$Creator Intent.CREATOR>
	//   17   97:invokestatic    #63  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//   18  100:checkcast       #53  <Class Intent>
	//   19  103:invokevirtual   #67  <Method void onActivityResult(int, int, Intent)>
				break;
	//   20  106:goto            226

			case 11: // '\013'
				boolean flag = zznj();
	//   21  109:aload_0         
	//   22  110:invokevirtual   #71  <Method boolean zznj()>
	//   23  113:istore          5
				parcel1.writeNoException();
	//   24  115:aload_3         
	//   25  116:invokevirtual   #74  <Method void Parcel.writeNoException()>
				zzel.zza(parcel1, flag);
	//   26  119:aload_3         
	//   27  120:iload           5
	//   28  122:invokestatic    #77  <Method void zzel.zza(Parcel, boolean)>
				break label0;
	//   29  125:goto            230

			case 10: // '\n'
				onBackPressed();
	//   30  128:aload_0         
	//   31  129:invokevirtual   #80  <Method void onBackPressed()>
				break;
	//   32  132:goto            226

			case 9: // '\t'
				zzax();
	//   33  135:aload_0         
	//   34  136:invokevirtual   #83  <Method void zzax()>
				break;
	//   35  139:goto            226

			case 8: // '\b'
				onDestroy();
	//   36  142:aload_0         
	//   37  143:invokevirtual   #86  <Method void onDestroy()>
				break;
	//   38  146:goto            226

			case 7: // '\007'
				onStop();
	//   39  149:aload_0         
	//   40  150:invokevirtual   #89  <Method void onStop()>
				break;
	//   41  153:goto            226

			case 6: // '\006'
				parcel = ((Parcel) ((Bundle)zzel.zza(parcel, Bundle.CREATOR)));
	//   42  156:aload_2         
	//   43  157:getstatic       #92  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   44  160:invokestatic    #63  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//   45  163:checkcast       #91  <Class Bundle>
	//   46  166:astore_2        
				onSaveInstanceState(((Bundle) (parcel)));
	//   47  167:aload_0         
	//   48  168:aload_2         
	//   49  169:invokevirtual   #96  <Method void onSaveInstanceState(Bundle)>
				parcel1.writeNoException();
	//   50  172:aload_3         
	//   51  173:invokevirtual   #74  <Method void Parcel.writeNoException()>
				zzel.zzb(parcel1, ((android.os.Parcelable) (parcel)));
	//   52  176:aload_3         
	//   53  177:aload_2         
	//   54  178:invokestatic    #100 <Method void zzel.zzb(Parcel, android.os.Parcelable)>
				break label0;
	//   55  181:goto            230

			case 5: // '\005'
				onPause();
	//   56  184:aload_0         
	//   57  185:invokevirtual   #103 <Method void onPause()>
				break;
	//   58  188:goto            226

			case 4: // '\004'
				onResume();
	//   59  191:aload_0         
	//   60  192:invokevirtual   #106 <Method void onResume()>
				break;
	//   61  195:goto            226

			case 3: // '\003'
				onStart();
	//   62  198:aload_0         
	//   63  199:invokevirtual   #109 <Method void onStart()>
				break;
	//   64  202:goto            226

			case 2: // '\002'
				onRestart();
	//   65  205:aload_0         
	//   66  206:invokevirtual   #112 <Method void onRestart()>
				break;
	//   67  209:goto            226

			case 1: // '\001'
				onCreate((Bundle)zzel.zza(parcel, Bundle.CREATOR));
	//   68  212:aload_0         
	//   69  213:aload_2         
	//   70  214:getstatic       #92  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   71  217:invokestatic    #63  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//   72  220:checkcast       #91  <Class Bundle>
	//   73  223:invokevirtual   #115 <Method void onCreate(Bundle)>
				break;
			}
			parcel1.writeNoException();
	//   74  226:aload_3         
	//   75  227:invokevirtual   #74  <Method void Parcel.writeNoException()>
		}
		return true;
	//   76  230:iconst_1        
	//   77  231:ireturn         
	}
}
