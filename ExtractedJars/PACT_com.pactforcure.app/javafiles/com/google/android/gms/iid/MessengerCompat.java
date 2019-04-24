// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.iid;

import android.os.*;
import com.google.android.gms.common.internal.ReflectedParcelable;

// Referenced classes of package com.google.android.gms.iid:
//			zzb

public class MessengerCompat
	implements ReflectedParcelable
{
	private final class zza extends zzb.zza
	{

		public void send(Message message)
			throws RemoteException
		{
			message.arg2 = Binder.getCallingUid();
		//    0    0:aload_1         
		//    1    1:invokestatic    #27  <Method int Binder.getCallingUid()>
		//    2    4:putfield        #33  <Field int Message.arg2>
			handler.dispatchMessage(message);
		//    3    7:aload_0         
		//    4    8:getfield        #16  <Field Handler handler>
		//    5   11:aload_1         
		//    6   12:invokevirtual   #38  <Method void Handler.dispatchMessage(Message)>
		//    7   15:return          
		}

		Handler handler;

		zza(Handler handler1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void zzb$zza()>
			handler = handler1;
		//    2    4:aload_0         
		//    3    5:aload_2         
		//    4    6:putfield        #16  <Field Handler handler>
		//    5    9:return          
		}
	}


	public MessengerCompat(Handler handler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   2    4:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmplt          25
		{
			zzbho = new Messenger(handler);
	//    5   12:aload_0         
	//    6   13:new             #36  <Class Messenger>
	//    7   16:dup             
	//    8   17:aload_1         
	//    9   18:invokespecial   #38  <Method void Messenger(Handler)>
	//   10   21:putfield        #40  <Field Messenger zzbho>
			return;
	//   11   24:return          
		} else
		{
			zzbhp = ((zzb) (new zza(handler)));
	//   12   25:aload_0         
	//   13   26:new             #10  <Class MessengerCompat$zza>
	//   14   29:dup             
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:invokespecial   #43  <Method void MessengerCompat$zza(MessengerCompat, Handler)>
	//   18   35:putfield        #45  <Field zzb zzbhp>
			return;
	//   19   38:return          
		}
	}

	public MessengerCompat(IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   2    4:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmplt          25
		{
			zzbho = new Messenger(ibinder);
	//    5   12:aload_0         
	//    6   13:new             #36  <Class Messenger>
	//    7   16:dup             
	//    8   17:aload_1         
	//    9   18:invokespecial   #48  <Method void Messenger(IBinder)>
	//   10   21:putfield        #40  <Field Messenger zzbho>
			return;
	//   11   24:return          
		} else
		{
			zzbhp = zzb.zza.zzcZ(ibinder);
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:invokestatic    #54  <Method zzb zzb$zza.zzcZ(IBinder)>
	//   15   30:putfield        #45  <Field zzb zzbhp>
			return;
	//   16   33:return          
		}
	}

	public static int zzc(Message message)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return zzd(message);
	//    3    8:aload_0         
	//    4    9:invokestatic    #59  <Method int zzd(Message)>
	//    5   12:ireturn         
		else
			return message.arg2;
	//    6   13:aload_0         
	//    7   14:getfield        #64  <Field int Message.arg2>
	//    8   17:ireturn         
	}

	private static int zzd(Message message)
	{
		return message.sendingUid;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field int Message.sendingUid>
	//    2    4:ireturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		boolean flag;
		try
		{
			flag = ((Object) (getBinder())).equals(((Object) (((MessengerCompat)obj).getBinder())));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #81  <Method IBinder getBinder()>
	//    6   10:aload_1         
	//    7   11:checkcast       #2   <Class MessengerCompat>
	//    8   14:invokevirtual   #81  <Method IBinder getBinder()>
	//    9   17:invokevirtual   #83  <Method boolean Object.equals(Object)>
	//   10   20:istore_2        
		}
	//*  11   21:iload_2         
	//*  12   22:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  13   23:astore_1        
		{
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		}
		return flag;
	}

	public IBinder getBinder()
	{
		if(zzbho != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Messenger zzbho>
	//*   2    4:ifnull          15
			return zzbho.getBinder();
	//    3    7:aload_0         
	//    4    8:getfield        #40  <Field Messenger zzbho>
	//    5   11:invokevirtual   #84  <Method IBinder Messenger.getBinder()>
	//    6   14:areturn         
		else
			return zzbhp.asBinder();
	//    7   15:aload_0         
	//    8   16:getfield        #45  <Field zzb zzbhp>
	//    9   19:invokeinterface #89  <Method IBinder zzb.asBinder()>
	//   10   24:areturn         
	}

	public int hashCode()
	{
		return ((Object) (getBinder())).hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method IBinder getBinder()>
	//    2    4:invokevirtual   #92  <Method int Object.hashCode()>
	//    3    7:ireturn         
	}

	public void send(Message message)
		throws RemoteException
	{
		if(zzbho != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Messenger zzbho>
	//*   2    4:ifnull          16
		{
			zzbho.send(message);
	//    3    7:aload_0         
	//    4    8:getfield        #40  <Field Messenger zzbho>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #98  <Method void Messenger.send(Message)>
			return;
	//    7   15:return          
		} else
		{
			zzbhp.send(message);
	//    8   16:aload_0         
	//    9   17:getfield        #45  <Field zzb zzbhp>
	//   10   20:aload_1         
	//   11   21:invokeinterface #99  <Method void zzb.send(Message)>
			return;
	//   12   26:return          
		}
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		if(zzbho != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Messenger zzbho>
	//*   2    4:ifnull          19
		{
			parcel.writeStrongBinder(zzbho.getBinder());
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #40  <Field Messenger zzbho>
	//    6   12:invokevirtual   #84  <Method IBinder Messenger.getBinder()>
	//    7   15:invokevirtual   #107 <Method void Parcel.writeStrongBinder(IBinder)>
			return;
	//    8   18:return          
		} else
		{
			parcel.writeStrongBinder(zzbhp.asBinder());
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:getfield        #45  <Field zzb zzbhp>
	//   12   24:invokeinterface #89  <Method IBinder zzb.asBinder()>
	//   13   29:invokevirtual   #107 <Method void Parcel.writeStrongBinder(IBinder)>
			return;
	//   14   32:return          
		}
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (zzgn(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #20  <Method MessengerCompat zzgn(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (zzjB(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #26  <Method MessengerCompat[] zzjB(int)>
		//    3    5:areturn         
		}

		public MessengerCompat zzgn(Parcel parcel)
		{
			parcel = ((Parcel) (parcel.readStrongBinder()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #32  <Method IBinder Parcel.readStrongBinder()>
		//    2    4:astore_1        
			if(parcel != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          18
				return new MessengerCompat(((IBinder) (parcel)));
		//    5    9:new             #9   <Class MessengerCompat>
		//    6   12:dup             
		//    7   13:aload_1         
		//    8   14:invokespecial   #35  <Method void MessengerCompat(IBinder)>
		//    9   17:areturn         
			else
				return null;
		//   10   18:aconst_null     
		//   11   19:areturn         
		}

		public MessengerCompat[] zzjB(int i)
		{
			return new MessengerCompat[i];
		//    0    0:iload_1         
		//    1    1:anewarray       MessengerCompat[]
		//    2    4:areturn         
		}

	}
;
	Messenger zzbho;
	zzb zzbhp;

	static 
	{
	//    0    0:new             #8   <Class MessengerCompat$1>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void MessengerCompat$1()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
