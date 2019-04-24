// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.*;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

// Referenced classes of package com.google.android.gms.dynamic:
//			IFragmentWrapper, IObjectWrapper

public static final class IFragmentWrapper$Stub$zza extends zza
	implements IFragmentWrapper
{

	public final Bundle getArguments()
	{
		Parcel parcel = ((zza)this).zza(3, ((zza)this).zza());
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #23  <Method Parcel zza.zza()>
	//    4    6:invokevirtual   #26  <Method Parcel zza.zza(int, Parcel)>
	//    5    9:astore_1        
		Bundle bundle = (Bundle)zzc.zza(parcel, Bundle.CREATOR);
	//    6   10:aload_1         
	//    7   11:getstatic       #32  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//    8   14:invokestatic    #37  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
	//    9   17:checkcast       #28  <Class Bundle>
	//   10   20:astore_2        
		parcel.recycle();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #43  <Method void Parcel.recycle()>
		return bundle;
	//   13   25:aload_2         
	//   14   26:areturn         
	}

	public final int getId()
	{
		Parcel parcel = ((zza)this).zza(4, ((zza)this).zza());
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #23  <Method Parcel zza.zza()>
	//    4    6:invokevirtual   #26  <Method Parcel zza.zza(int, Parcel)>
	//    5    9:astore_2        
		int i = parcel.readInt();
	//    6   10:aload_2         
	//    7   11:invokevirtual   #48  <Method int Parcel.readInt()>
	//    8   14:istore_1        
		parcel.recycle();
	//    9   15:aload_2         
	//   10   16:invokevirtual   #43  <Method void Parcel.recycle()>
		return i;
	//   11   19:iload_1         
	//   12   20:ireturn         
	}

	public final boolean getRetainInstance()
	{
		Parcel parcel = ((zza)this).zza(7, ((zza)this).zza());
	//    0    0:aload_0         
	//    1    1:bipush          7
	//    2    3:aload_0         
	//    3    4:invokevirtual   #23  <Method Parcel zza.zza()>
	//    4    7:invokevirtual   #26  <Method Parcel zza.zza(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzc.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #53  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #43  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final String getTag()
	{
		Parcel parcel = ((zza)this).zza(8, ((zza)this).zza());
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:aload_0         
	//    3    4:invokevirtual   #23  <Method Parcel zza.zza()>
	//    4    7:invokevirtual   #26  <Method Parcel zza.zza(int, Parcel)>
	//    5   10:astore_1        
		String s = parcel.readString();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #58  <Method String Parcel.readString()>
	//    8   15:astore_2        
		parcel.recycle();
	//    9   16:aload_1         
	//   10   17:invokevirtual   #43  <Method void Parcel.recycle()>
		return s;
	//   11   20:aload_2         
	//   12   21:areturn         
	}

	public final int getTargetRequestCode()
	{
		Parcel parcel = ((zza)this).zza(10, ((zza)this).zza());
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:aload_0         
	//    3    4:invokevirtual   #23  <Method Parcel zza.zza()>
	//    4    7:invokevirtual   #26  <Method Parcel zza.zza(int, Parcel)>
	//    5   10:astore_2        
		int i = parcel.readInt();
	//    6   11:aload_2         
	//    7   12:invokevirtual   #48  <Method int Parcel.readInt()>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #43  <Method void Parcel.recycle()>
		return i;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final boolean getUserVisibleHint()
	{
		Parcel parcel = ((zza)this).zza(11, ((zza)this).zza());
	//    0    0:aload_0         
	//    1    1:bipush          11
	//    2    3:aload_0         
	//    3    4:invokevirtual   #23  <Method Parcel zza.zza()>
	//    4    7:invokevirtual   #26  <Method Parcel zza.zza(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzc.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #53  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #43  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final boolean isAdded()
	{
		Parcel parcel = ((zza)this).zza(13, ((zza)this).zza());
	//    0    0:aload_0         
	//    1    1:bipush          13
	//    2    3:aload_0         
	//    3    4:invokevirtual   #23  <Method Parcel zza.zza()>
	//    4    7:invokevirtual   #26  <Method Parcel zza.zza(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzc.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #53  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #43  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final boolean isDetached()
	{
		Parcel parcel = ((zza)this).zza(14, ((zza)this).zza());
	//    0    0:aload_0         
	//    1    1:bipush          14
	//    2    3:aload_0         
	//    3    4:invokevirtual   #23  <Method Parcel zza.zza()>
	//    4    7:invokevirtual   #26  <Method Parcel zza.zza(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzc.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #53  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #43  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final boolean isHidden()
	{
		Parcel parcel = ((zza)this).zza(15, ((zza)this).zza());
	//    0    0:aload_0         
	//    1    1:bipush          15
	//    2    3:aload_0         
	//    3    4:invokevirtual   #23  <Method Parcel zza.zza()>
	//    4    7:invokevirtual   #26  <Method Parcel zza.zza(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzc.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #53  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #43  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final boolean isInLayout()
	{
		Parcel parcel = ((zza)this).zza(16, ((zza)this).zza());
	//    0    0:aload_0         
	//    1    1:bipush          16
	//    2    3:aload_0         
	//    3    4:invokevirtual   #23  <Method Parcel zza.zza()>
	//    4    7:invokevirtual   #26  <Method Parcel zza.zza(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzc.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #53  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #43  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final boolean isRemoving()
	{
		Parcel parcel = ((zza)this).zza(17, ((zza)this).zza());
	//    0    0:aload_0         
	//    1    1:bipush          17
	//    2    3:aload_0         
	//    3    4:invokevirtual   #23  <Method Parcel zza.zza()>
	//    4    7:invokevirtual   #26  <Method Parcel zza.zza(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzc.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #53  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #43  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final boolean isResumed()
	{
		Parcel parcel = ((zza)this).zza(18, ((zza)this).zza());
	//    0    0:aload_0         
	//    1    1:bipush          18
	//    2    3:aload_0         
	//    3    4:invokevirtual   #23  <Method Parcel zza.zza()>
	//    4    7:invokevirtual   #26  <Method Parcel zza.zza(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzc.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #53  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #43  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final boolean isVisible()
	{
		Parcel parcel = ((zza)this).zza(19, ((zza)this).zza());
	//    0    0:aload_0         
	//    1    1:bipush          19
	//    2    3:aload_0         
	//    3    4:invokevirtual   #23  <Method Parcel zza.zza()>
	//    4    7:invokevirtual   #26  <Method Parcel zza.zza(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzc.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #53  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #43  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final void setHasOptionsMenu(boolean flag)
	{
		Parcel parcel = ((zza)this).zza();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #23  <Method Parcel zza.zza()>
	//    2    4:astore_2        
		zzc.writeBoolean(parcel, flag);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokestatic    #73  <Method void zzc.writeBoolean(Parcel, boolean)>
		((zza)this).zzb(21, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          21
	//    8   13:aload_2         
	//    9   14:invokevirtual   #77  <Method void zza.zzb(int, Parcel)>
	//   10   17:return          
	}

	public final void setMenuVisibility(boolean flag)
	{
		Parcel parcel = ((zza)this).zza();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #23  <Method Parcel zza.zza()>
	//    2    4:astore_2        
		zzc.writeBoolean(parcel, flag);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokestatic    #73  <Method void zzc.writeBoolean(Parcel, boolean)>
		((zza)this).zzb(22, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          22
	//    8   13:aload_2         
	//    9   14:invokevirtual   #77  <Method void zza.zzb(int, Parcel)>
	//   10   17:return          
	}

	public final void setRetainInstance(boolean flag)
	{
		Parcel parcel = ((zza)this).zza();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #23  <Method Parcel zza.zza()>
	//    2    4:astore_2        
		zzc.writeBoolean(parcel, flag);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokestatic    #73  <Method void zzc.writeBoolean(Parcel, boolean)>
		((zza)this).zzb(23, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          23
	//    8   13:aload_2         
	//    9   14:invokevirtual   #77  <Method void zza.zzb(int, Parcel)>
	//   10   17:return          
	}

	public final void setUserVisibleHint(boolean flag)
	{
		Parcel parcel = ((zza)this).zza();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #23  <Method Parcel zza.zza()>
	//    2    4:astore_2        
		zzc.writeBoolean(parcel, flag);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokestatic    #73  <Method void zzc.writeBoolean(Parcel, boolean)>
		((zza)this).zzb(24, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          24
	//    8   13:aload_2         
	//    9   14:invokevirtual   #77  <Method void zza.zzb(int, Parcel)>
	//   10   17:return          
	}

	public final void startActivity(Intent intent)
	{
		Parcel parcel = ((zza)this).zza();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #23  <Method Parcel zza.zza()>
	//    2    4:astore_2        
		zzc.zza(parcel, ((android.os.Parcelable) (intent)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #85  <Method void zzc.zza(Parcel, android.os.Parcelable)>
		((zza)this).zzb(25, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          25
	//    8   13:aload_2         
	//    9   14:invokevirtual   #77  <Method void zza.zzb(int, Parcel)>
	//   10   17:return          
	}

	public final void startActivityForResult(Intent intent, int i)
	{
		Parcel parcel = ((zza)this).zza();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #23  <Method Parcel zza.zza()>
	//    2    4:astore_3        
		zzc.zza(parcel, ((android.os.Parcelable) (intent)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #85  <Method void zzc.zza(Parcel, android.os.Parcelable)>
		parcel.writeInt(i);
	//    6   10:aload_3         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #91  <Method void Parcel.writeInt(int)>
		((zza)this).zzb(26, parcel);
	//    9   15:aload_0         
	//   10   16:bipush          26
	//   11   18:aload_3         
	//   12   19:invokevirtual   #77  <Method void zza.zzb(int, Parcel)>
	//   13   22:return          
	}

	public final void zza(IObjectWrapper iobjectwrapper)
	{
		Parcel parcel = ((zza)this).zza();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #23  <Method Parcel zza.zza()>
	//    2    4:astore_2        
		zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #95  <Method void zzc.zza(Parcel, android.os.IInterface)>
		((zza)this).zzb(20, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          20
	//    8   13:aload_2         
	//    9   14:invokevirtual   #77  <Method void zza.zzb(int, Parcel)>
	//   10   17:return          
	}

	public final IObjectWrapper zzad()
	{
		Parcel parcel = ((zza)this).zza(2, ((zza)this).zza());
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #23  <Method Parcel zza.zza()>
	//    4    6:invokevirtual   #26  <Method Parcel zza.zza(int, Parcel)>
	//    5    9:astore_1        
		IObjectWrapper iobjectwrapper = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
	//    6   10:aload_1         
	//    7   11:invokevirtual   #101 <Method IBinder Parcel.readStrongBinder()>
	//    8   14:invokestatic    #107 <Method IObjectWrapper IObjectWrapper$Stub.asInterface(IBinder)>
	//    9   17:astore_2        
		parcel.recycle();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #43  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   12   22:aload_2         
	//   13   23:areturn         
	}

	public final IFragmentWrapper zzae()
	{
		Parcel parcel = ((zza)this).zza(5, ((zza)this).zza());
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #23  <Method Parcel zza.zza()>
	//    4    6:invokevirtual   #26  <Method Parcel zza.zza(int, Parcel)>
	//    5    9:astore_1        
		IFragmentWrapper ifragmentwrapper = IFragmentWrapper.Stub.asInterface(parcel.readStrongBinder());
	//    6   10:aload_1         
	//    7   11:invokevirtual   #101 <Method IBinder Parcel.readStrongBinder()>
	//    8   14:invokestatic    #112 <Method IFragmentWrapper IFragmentWrapper$Stub.asInterface(IBinder)>
	//    9   17:astore_2        
		parcel.recycle();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #43  <Method void Parcel.recycle()>
		return ifragmentwrapper;
	//   12   22:aload_2         
	//   13   23:areturn         
	}

	public final IObjectWrapper zzaf()
	{
		Parcel parcel = ((zza)this).zza(6, ((zza)this).zza());
	//    0    0:aload_0         
	//    1    1:bipush          6
	//    2    3:aload_0         
	//    3    4:invokevirtual   #23  <Method Parcel zza.zza()>
	//    4    7:invokevirtual   #26  <Method Parcel zza.zza(int, Parcel)>
	//    5   10:astore_1        
		IObjectWrapper iobjectwrapper = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
	//    6   11:aload_1         
	//    7   12:invokevirtual   #101 <Method IBinder Parcel.readStrongBinder()>
	//    8   15:invokestatic    #107 <Method IObjectWrapper IObjectWrapper$Stub.asInterface(IBinder)>
	//    9   18:astore_2        
		parcel.recycle();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #43  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   12   23:aload_2         
	//   13   24:areturn         
	}

	public final IFragmentWrapper zzag()
	{
		Parcel parcel = ((zza)this).zza(9, ((zza)this).zza());
	//    0    0:aload_0         
	//    1    1:bipush          9
	//    2    3:aload_0         
	//    3    4:invokevirtual   #23  <Method Parcel zza.zza()>
	//    4    7:invokevirtual   #26  <Method Parcel zza.zza(int, Parcel)>
	//    5   10:astore_1        
		IFragmentWrapper ifragmentwrapper = IFragmentWrapper.Stub.asInterface(parcel.readStrongBinder());
	//    6   11:aload_1         
	//    7   12:invokevirtual   #101 <Method IBinder Parcel.readStrongBinder()>
	//    8   15:invokestatic    #112 <Method IFragmentWrapper IFragmentWrapper$Stub.asInterface(IBinder)>
	//    9   18:astore_2        
		parcel.recycle();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #43  <Method void Parcel.recycle()>
		return ifragmentwrapper;
	//   12   23:aload_2         
	//   13   24:areturn         
	}

	public final IObjectWrapper zzah()
	{
		Parcel parcel = ((zza)this).zza(12, ((zza)this).zza());
	//    0    0:aload_0         
	//    1    1:bipush          12
	//    2    3:aload_0         
	//    3    4:invokevirtual   #23  <Method Parcel zza.zza()>
	//    4    7:invokevirtual   #26  <Method Parcel zza.zza(int, Parcel)>
	//    5   10:astore_1        
		IObjectWrapper iobjectwrapper = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
	//    6   11:aload_1         
	//    7   12:invokevirtual   #101 <Method IBinder Parcel.readStrongBinder()>
	//    8   15:invokestatic    #107 <Method IObjectWrapper IObjectWrapper$Stub.asInterface(IBinder)>
	//    9   18:astore_2        
		parcel.recycle();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #43  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   12   23:aload_2         
	//   13   24:areturn         
	}

	public final void zzb(IObjectWrapper iobjectwrapper)
	{
		Parcel parcel = ((zza)this).zza();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #23  <Method Parcel zza.zza()>
	//    2    4:astore_2        
		zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #95  <Method void zzc.zza(Parcel, android.os.IInterface)>
		((zza)this).zzb(27, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          27
	//    8   13:aload_2         
	//    9   14:invokevirtual   #77  <Method void zza.zzb(int, Parcel)>
	//   10   17:return          
	}

	IFragmentWrapper$Stub$zza(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.dynamic.IFragmentWrapper");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #14  <String "com.google.android.gms.dynamic.IFragmentWrapper">
	//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
	//    4    7:return          
	}
}
