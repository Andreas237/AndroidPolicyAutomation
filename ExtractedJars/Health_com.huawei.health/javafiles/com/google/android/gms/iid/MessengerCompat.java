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

	public MessengerCompat(IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   2    4:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmplt          25
		{
			zzbhO = new Messenger(ibinder);
	//    5   12:aload_0         
	//    6   13:new             #33  <Class Messenger>
	//    7   16:dup             
	//    8   17:aload_1         
	//    9   18:invokespecial   #35  <Method void Messenger(IBinder)>
	//   10   21:putfield        #37  <Field Messenger zzbhO>
			return;
	//   11   24:return          
		} else
		{
			zzbhP = zzb.zza.zzcZ(ibinder);
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:invokestatic    #43  <Method zzb zzb$zza.zzcZ(IBinder)>
	//   15   30:putfield        #45  <Field zzb zzbhP>
			return;
	//   16   33:return          
		}
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
	//    5    7:invokevirtual   #55  <Method IBinder getBinder()>
	//    6   10:aload_1         
	//    7   11:checkcast       #2   <Class MessengerCompat>
	//    8   14:invokevirtual   #55  <Method IBinder getBinder()>
	//    9   17:invokevirtual   #57  <Method boolean Object.equals(Object)>
	//   10   20:istore_2        
		}
	//*  11   21:iload_2         
	//*  12   22:ireturn         
	//*  13   23:iconst_0        
	//*  14   24:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			return false;
		}
		return flag;
	//*  15   25:astore_1        
	//*  16   26:goto            23
	}

	public IBinder getBinder()
	{
		if(zzbhO != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Messenger zzbhO>
	//*   2    4:ifnull          15
			return zzbhO.getBinder();
	//    3    7:aload_0         
	//    4    8:getfield        #37  <Field Messenger zzbhO>
	//    5   11:invokevirtual   #58  <Method IBinder Messenger.getBinder()>
	//    6   14:areturn         
		else
			return zzbhP.asBinder();
	//    7   15:aload_0         
	//    8   16:getfield        #45  <Field zzb zzbhP>
	//    9   19:invokeinterface #63  <Method IBinder zzb.asBinder()>
	//   10   24:areturn         
	}

	public int hashCode()
	{
		return ((Object) (getBinder())).hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #55  <Method IBinder getBinder()>
	//    2    4:invokevirtual   #66  <Method int Object.hashCode()>
	//    3    7:ireturn         
	}

	public void send(Message message)
		throws RemoteException
	{
		if(zzbhO != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Messenger zzbhO>
	//*   2    4:ifnull          16
		{
			zzbhO.send(message);
	//    3    7:aload_0         
	//    4    8:getfield        #37  <Field Messenger zzbhO>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #72  <Method void Messenger.send(Message)>
			return;
	//    7   15:return          
		} else
		{
			zzbhP.send(message);
	//    8   16:aload_0         
	//    9   17:getfield        #45  <Field zzb zzbhP>
	//   10   20:aload_1         
	//   11   21:invokeinterface #73  <Method void zzb.send(Message)>
			return;
	//   12   26:return          
		}
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		if(zzbhO != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Messenger zzbhO>
	//*   2    4:ifnull          19
		{
			parcel.writeStrongBinder(zzbhO.getBinder());
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #37  <Field Messenger zzbhO>
	//    6   12:invokevirtual   #58  <Method IBinder Messenger.getBinder()>
	//    7   15:invokevirtual   #81  <Method void Parcel.writeStrongBinder(IBinder)>
			return;
	//    8   18:return          
		} else
		{
			parcel.writeStrongBinder(zzbhP.asBinder());
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:getfield        #45  <Field zzb zzbhP>
	//   12   24:invokeinterface #63  <Method IBinder zzb.asBinder()>
	//   13   29:invokevirtual   #81  <Method void Parcel.writeStrongBinder(IBinder)>
			return;
	//   14   32:return          
		}
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (zzgs(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #20  <Method MessengerCompat zzgs(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (zzjK(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #26  <Method MessengerCompat[] zzjK(int)>
		//    3    5:areturn         
		}

		public MessengerCompat zzgs(Parcel parcel)
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

		public MessengerCompat[] zzjK(int i)
		{
			return new MessengerCompat[i];
		//    0    0:iload_1         
		//    1    1:anewarray       MessengerCompat[]
		//    2    4:areturn         
		}

	}
;
	Messenger zzbhO;
	zzb zzbhP;

	static 
	{
	//    0    0:new             #8   <Class MessengerCompat$1>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void MessengerCompat$1()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
