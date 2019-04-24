// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzxt, zzxv, zzqt, 
//			zzxw, zzxy

public abstract class zzxu extends zzek
	implements zzxt
{

	public zzxu()
	{
		super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	public static zzxt zzs(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener">
	//    6    9:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof zzxt)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class zzxt>
	//*  10   19:ifeq            27
			return (zzxt)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class zzxt>
	//   13   26:areturn         
		else
			return ((zzxt) (new zzxv(ibinder)));
	//   14   27:new             #24  <Class zzxv>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void zzxv(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 12: default 64
	//	               1 221
	//	               2 214
	//	               3 203
	//	               4 196
	//	               5 189
	//	               6 182
	//	               7 124
	//	               8 117
	//	               9 102
	//	               10 84
	//	               11 77
	//	               12 66
		default:
			return false;
	//    2   64:iconst_0        
	//    3   65:ireturn         

		case 12: // '\f'
			zzbj(parcel.readString());
	//    4   66:aload_0         
	//    5   67:aload_2         
	//    6   68:invokevirtual   #37  <Method String Parcel.readString()>
	//    7   71:invokevirtual   #40  <Method void zzbj(String)>
			break;
	//    8   74:goto            225

		case 11: // '\013'
			onVideoEnd();
	//    9   77:aload_0         
	//   10   78:invokevirtual   #43  <Method void onVideoEnd()>
			break;
	//   11   81:goto            225

		case 10: // '\n'
			zzb(zzqt.zzk(parcel.readStrongBinder()), parcel.readString());
	//   12   84:aload_0         
	//   13   85:aload_2         
	//   14   86:invokevirtual   #47  <Method IBinder Parcel.readStrongBinder()>
	//   15   89:invokestatic    #53  <Method zzqs zzqt.zzk(IBinder)>
	//   16   92:aload_2         
	//   17   93:invokevirtual   #37  <Method String Parcel.readString()>
	//   18   96:invokevirtual   #57  <Method void zzb(zzqs, String)>
			break;
	//   19   99:goto            225

		case 9: // '\t'
			onAppEvent(parcel.readString(), parcel.readString());
	//   20  102:aload_0         
	//   21  103:aload_2         
	//   22  104:invokevirtual   #37  <Method String Parcel.readString()>
	//   23  107:aload_2         
	//   24  108:invokevirtual   #37  <Method String Parcel.readString()>
	//   25  111:invokevirtual   #61  <Method void onAppEvent(String, String)>
			break;
	//   26  114:goto            225

		case 8: // '\b'
			onAdImpression();
	//   27  117:aload_0         
	//   28  118:invokevirtual   #64  <Method void onAdImpression()>
			break;
	//   29  121:goto            225

		case 7: // '\007'
			parcel = ((Parcel) (parcel.readStrongBinder()));
	//   30  124:aload_2         
	//   31  125:invokevirtual   #47  <Method IBinder Parcel.readStrongBinder()>
	//   32  128:astore_2        
			if(parcel == null)
	//*  33  129:aload_2         
	//*  34  130:ifnonnull       138
			{
				parcel = null;
	//   35  133:aconst_null     
	//   36  134:astore_2        
			} else
	//*  37  135:goto            174
			{
				android.os.IInterface iinterface = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
	//   38  138:aload_2         
	//   39  139:ldc1            #66  <String "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata">
	//   40  141:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   41  146:astore          5
				if(iinterface instanceof zzxw)
	//*  42  148:aload           5
	//*  43  150:instanceof      #68  <Class zzxw>
	//*  44  153:ifeq            165
					parcel = ((Parcel) ((zzxw)iinterface));
	//   45  156:aload           5
	//   46  158:checkcast       #68  <Class zzxw>
	//   47  161:astore_2        
				else
	//*  48  162:goto            174
					parcel = ((Parcel) (new zzxy(((IBinder) (parcel)))));
	//   49  165:new             #70  <Class zzxy>
	//   50  168:dup             
	//   51  169:aload_2         
	//   52  170:invokespecial   #71  <Method void zzxy(IBinder)>
	//   53  173:astore_2        
			}
			zza(((zzxw) (parcel)));
	//   54  174:aload_0         
	//   55  175:aload_2         
	//   56  176:invokevirtual   #75  <Method void zza(zzxw)>
			break;

	//*  57  179:goto            225
		case 6: // '\006'
			onAdLoaded();
	//   58  182:aload_0         
	//   59  183:invokevirtual   #78  <Method void onAdLoaded()>
			break;

	//*  60  186:goto            225
		case 5: // '\005'
			onAdOpened();
	//   61  189:aload_0         
	//   62  190:invokevirtual   #81  <Method void onAdOpened()>
			break;

	//*  63  193:goto            225
		case 4: // '\004'
			onAdLeftApplication();
	//   64  196:aload_0         
	//   65  197:invokevirtual   #84  <Method void onAdLeftApplication()>
			break;

	//*  66  200:goto            225
		case 3: // '\003'
			onAdFailedToLoad(parcel.readInt());
	//   67  203:aload_0         
	//   68  204:aload_2         
	//   69  205:invokevirtual   #88  <Method int Parcel.readInt()>
	//   70  208:invokevirtual   #92  <Method void onAdFailedToLoad(int)>
			break;

	//*  71  211:goto            225
		case 2: // '\002'
			onAdClosed();
	//   72  214:aload_0         
	//   73  215:invokevirtual   #95  <Method void onAdClosed()>
			break;

	//*  74  218:goto            225
		case 1: // '\001'
			onAdClicked();
	//   75  221:aload_0         
	//   76  222:invokevirtual   #98  <Method void onAdClicked()>
			break;
		}
		parcel1.writeNoException();
	//   77  225:aload_3         
	//   78  226:invokevirtual   #101 <Method void Parcel.writeNoException()>
		return true;
	//   79  229:iconst_1        
	//   80  230:ireturn         
	}
}
