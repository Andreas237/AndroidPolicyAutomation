// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.*;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzb

public interface IGmsCallbacks
	extends IInterface
{
	public static abstract class zza extends zzb
		implements IGmsCallbacks
	{

		protected final boolean zza(int i, Parcel parcel, Parcel parcel1, int j)
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:tableswitch     1 3: default 28
		//		               1 76
		//		               2 55
		//		               3 30
			default:
				return false;
		//    2   28:iconst_0        
		//    3   29:ireturn         

			case 3: // '\003'
				zza(parcel.readInt(), parcel.readStrongBinder(), (com.google.android.gms.common.internal.zzb)zzc.zza(parcel, zzb.CREATOR));
		//    4   30:aload_0         
		//    5   31:aload_2         
		//    6   32:invokevirtual   #22  <Method int Parcel.readInt()>
		//    7   35:aload_2         
		//    8   36:invokevirtual   #26  <Method IBinder Parcel.readStrongBinder()>
		//    9   39:aload_2         
		//   10   40:getstatic       #32  <Field android.os.Parcelable$Creator zzb.CREATOR>
		//   11   43:invokestatic    #37  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
		//   12   46:checkcast       #28  <Class com.google.android.gms.common.internal.zzb>
		//   13   49:invokevirtual   #40  <Method void zza(int, IBinder, com.google.android.gms.common.internal.zzb)>
				break;

		//*  14   52:goto            98
			case 2: // '\002'
				zza(parcel.readInt(), (Bundle)zzc.zza(parcel, Bundle.CREATOR));
		//   15   55:aload_0         
		//   16   56:aload_2         
		//   17   57:invokevirtual   #22  <Method int Parcel.readInt()>
		//   18   60:aload_2         
		//   19   61:getstatic       #43  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//   20   64:invokestatic    #37  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
		//   21   67:checkcast       #42  <Class Bundle>
		//   22   70:invokevirtual   #46  <Method void zza(int, Bundle)>
				break;

		//*  23   73:goto            98
			case 1: // '\001'
				onPostInitComplete(parcel.readInt(), parcel.readStrongBinder(), (Bundle)zzc.zza(parcel, Bundle.CREATOR));
		//   24   76:aload_0         
		//   25   77:aload_2         
		//   26   78:invokevirtual   #22  <Method int Parcel.readInt()>
		//   27   81:aload_2         
		//   28   82:invokevirtual   #26  <Method IBinder Parcel.readStrongBinder()>
		//   29   85:aload_2         
		//   30   86:getstatic       #43  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//   31   89:invokestatic    #37  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
		//   32   92:checkcast       #42  <Class Bundle>
		//   33   95:invokevirtual   #50  <Method void onPostInitComplete(int, IBinder, Bundle)>
				break;
			}
			parcel1.writeNoException();
		//   34   98:aload_3         
		//   35   99:invokevirtual   #53  <Method void Parcel.writeNoException()>
			return true;
		//   36  102:iconst_1        
		//   37  103:ireturn         
		}

		public zza()
		{
			super("com.google.android.gms.common.internal.IGmsCallbacks");
		//    0    0:aload_0         
		//    1    1:ldc1            #11  <String "com.google.android.gms.common.internal.IGmsCallbacks">
		//    2    3:invokespecial   #14  <Method void zzb(String)>
		//    3    6:return          
		}
	}


	public abstract void onPostInitComplete(int i, IBinder ibinder, Bundle bundle);

	public abstract void zza(int i, Bundle bundle);

	public abstract void zza(int i, IBinder ibinder, com.google.android.gms.common.internal.zzb zzb);
}
