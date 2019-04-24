// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzaic, zzaie, zzel, 
//			zzaig

public abstract class zzaid extends zzek
	implements zzaic
{

	public zzaid()
	{
		super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	public static zzaic zzaa(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener">
	//    6    9:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof zzaic)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class zzaic>
	//*  10   19:ifeq            27
			return (zzaic)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class zzaic>
	//   13   26:areturn         
		else
			return ((zzaic) (new zzaie(ibinder)));
	//   14   27:new             #24  <Class zzaie>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void zzaie(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 12: default 64
	//	               1 241
	//	               2 223
	//	               3 209
	//	               4 195
	//	               5 181
	//	               6 167
	//	               7 143
	//	               8 129
	//	               9 111
	//	               10 97
	//	               11 83
	//	               12 66
		default:
			return false;
	//    2   64:iconst_0        
	//    3   65:ireturn         

		case 12: // '\f'
			zzc((Bundle)zzel.zza(parcel, Bundle.CREATOR));
	//    4   66:aload_0         
	//    5   67:aload_2         
	//    6   68:getstatic       #37  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//    7   71:invokestatic    #43  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//    8   74:checkcast       #33  <Class Bundle>
	//    9   77:invokevirtual   #47  <Method void zzc(Bundle)>
			break;

	//*  10   80:goto            252
		case 11: // '\013'
			zzx(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//   11   83:aload_0         
	//   12   84:aload_2         
	//   13   85:invokevirtual   #53  <Method IBinder Parcel.readStrongBinder()>
	//   14   88:invokestatic    #59  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   15   91:invokevirtual   #63  <Method void zzx(com.google.android.gms.dynamic.IObjectWrapper)>
			break;

	//*  16   94:goto            252
		case 10: // '\n'
			zzw(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//   17   97:aload_0         
	//   18   98:aload_2         
	//   19   99:invokevirtual   #53  <Method IBinder Parcel.readStrongBinder()>
	//   20  102:invokestatic    #59  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   21  105:invokevirtual   #66  <Method void zzw(com.google.android.gms.dynamic.IObjectWrapper)>
			break;

	//*  22  108:goto            252
		case 9: // '\t'
			zzd(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
	//   23  111:aload_0         
	//   24  112:aload_2         
	//   25  113:invokevirtual   #53  <Method IBinder Parcel.readStrongBinder()>
	//   26  116:invokestatic    #59  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   27  119:aload_2         
	//   28  120:invokevirtual   #70  <Method int Parcel.readInt()>
	//   29  123:invokevirtual   #74  <Method void zzd(com.google.android.gms.dynamic.IObjectWrapper, int)>
			break;

	//*  30  126:goto            252
		case 8: // '\b'
			zzv(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//   31  129:aload_0         
	//   32  130:aload_2         
	//   33  131:invokevirtual   #53  <Method IBinder Parcel.readStrongBinder()>
	//   34  134:invokestatic    #59  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   35  137:invokevirtual   #77  <Method void zzv(com.google.android.gms.dynamic.IObjectWrapper)>
			break;

	//*  36  140:goto            252
		case 7: // '\007'
			zza(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzaig)zzel.zza(parcel, zzaig.CREATOR));
	//   37  143:aload_0         
	//   38  144:aload_2         
	//   39  145:invokevirtual   #53  <Method IBinder Parcel.readStrongBinder()>
	//   40  148:invokestatic    #59  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   41  151:aload_2         
	//   42  152:getstatic       #80  <Field android.os.Parcelable$Creator zzaig.CREATOR>
	//   43  155:invokestatic    #43  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//   44  158:checkcast       #79  <Class zzaig>
	//   45  161:invokevirtual   #83  <Method void zza(com.google.android.gms.dynamic.IObjectWrapper, zzaig)>
			break;

	//*  46  164:goto            252
		case 6: // '\006'
			zzu(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//   47  167:aload_0         
	//   48  168:aload_2         
	//   49  169:invokevirtual   #53  <Method IBinder Parcel.readStrongBinder()>
	//   50  172:invokestatic    #59  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   51  175:invokevirtual   #86  <Method void zzu(com.google.android.gms.dynamic.IObjectWrapper)>
			break;

	//*  52  178:goto            252
		case 5: // '\005'
			zzt(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//   53  181:aload_0         
	//   54  182:aload_2         
	//   55  183:invokevirtual   #53  <Method IBinder Parcel.readStrongBinder()>
	//   56  186:invokestatic    #59  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   57  189:invokevirtual   #89  <Method void zzt(com.google.android.gms.dynamic.IObjectWrapper)>
			break;

	//*  58  192:goto            252
		case 4: // '\004'
			zzs(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//   59  195:aload_0         
	//   60  196:aload_2         
	//   61  197:invokevirtual   #53  <Method IBinder Parcel.readStrongBinder()>
	//   62  200:invokestatic    #59  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   63  203:invokevirtual   #92  <Method void zzs(com.google.android.gms.dynamic.IObjectWrapper)>
			break;

	//*  64  206:goto            252
		case 3: // '\003'
			zzr(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//   65  209:aload_0         
	//   66  210:aload_2         
	//   67  211:invokevirtual   #53  <Method IBinder Parcel.readStrongBinder()>
	//   68  214:invokestatic    #59  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   69  217:invokevirtual   #95  <Method void zzr(com.google.android.gms.dynamic.IObjectWrapper)>
			break;

	//*  70  220:goto            252
		case 2: // '\002'
			zzc(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
	//   71  223:aload_0         
	//   72  224:aload_2         
	//   73  225:invokevirtual   #53  <Method IBinder Parcel.readStrongBinder()>
	//   74  228:invokestatic    #59  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   75  231:aload_2         
	//   76  232:invokevirtual   #70  <Method int Parcel.readInt()>
	//   77  235:invokevirtual   #97  <Method void zzc(com.google.android.gms.dynamic.IObjectWrapper, int)>
			break;

	//*  78  238:goto            252
		case 1: // '\001'
			zzq(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//   79  241:aload_0         
	//   80  242:aload_2         
	//   81  243:invokevirtual   #53  <Method IBinder Parcel.readStrongBinder()>
	//   82  246:invokestatic    #59  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   83  249:invokevirtual   #100 <Method void zzq(com.google.android.gms.dynamic.IObjectWrapper)>
			break;
		}
		parcel1.writeNoException();
	//   84  252:aload_3         
	//   85  253:invokevirtual   #103 <Method void Parcel.writeNoException()>
		return true;
	//   86  256:iconst_1        
	//   87  257:ireturn         
	}
}
