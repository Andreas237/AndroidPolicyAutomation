// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

// Referenced classes of package com.google.android.gms.dynamic:
//			IFragmentWrapper, IObjectWrapper

public static abstract class IFragmentWrapper$Stub extends zzb
	implements IFragmentWrapper
{
	public static final class zza extends com.google.android.gms.internal.common.zza
		implements IFragmentWrapper
	{

		public final Bundle getArguments()
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(3, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:iconst_3        
		//    2    2:aload_0         
		//    3    3:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    6:invokevirtual   #26  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
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
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(4, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:iconst_4        
		//    2    2:aload_0         
		//    3    3:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    6:invokevirtual   #26  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
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
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(7, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          7
		//    2    3:aload_0         
		//    3    4:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #26  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
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
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(8, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          8
		//    2    3:aload_0         
		//    3    4:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #26  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
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
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(10, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          10
		//    2    3:aload_0         
		//    3    4:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #26  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
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
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(11, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          11
		//    2    3:aload_0         
		//    3    4:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #26  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
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
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(13, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          13
		//    2    3:aload_0         
		//    3    4:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #26  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
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
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(14, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          14
		//    2    3:aload_0         
		//    3    4:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #26  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
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
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(15, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          15
		//    2    3:aload_0         
		//    3    4:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #26  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
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
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(16, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          16
		//    2    3:aload_0         
		//    3    4:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #26  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
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
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(17, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          17
		//    2    3:aload_0         
		//    3    4:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #26  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
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
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(18, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          18
		//    2    3:aload_0         
		//    3    4:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #26  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
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
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(19, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          19
		//    2    3:aload_0         
		//    3    4:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #26  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
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
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    2    4:astore_2        
			zzc.writeBoolean(parcel, flag);
		//    3    5:aload_2         
		//    4    6:iload_1         
		//    5    7:invokestatic    #73  <Method void zzc.writeBoolean(Parcel, boolean)>
			((com.google.android.gms.internal.common.zza)this).zzb(21, parcel);
		//    6   10:aload_0         
		//    7   11:bipush          21
		//    8   13:aload_2         
		//    9   14:invokevirtual   #77  <Method void com.google.android.gms.internal.common.zza.zzb(int, Parcel)>
		//   10   17:return          
		}

		public final void setMenuVisibility(boolean flag)
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    2    4:astore_2        
			zzc.writeBoolean(parcel, flag);
		//    3    5:aload_2         
		//    4    6:iload_1         
		//    5    7:invokestatic    #73  <Method void zzc.writeBoolean(Parcel, boolean)>
			((com.google.android.gms.internal.common.zza)this).zzb(22, parcel);
		//    6   10:aload_0         
		//    7   11:bipush          22
		//    8   13:aload_2         
		//    9   14:invokevirtual   #77  <Method void com.google.android.gms.internal.common.zza.zzb(int, Parcel)>
		//   10   17:return          
		}

		public final void setRetainInstance(boolean flag)
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    2    4:astore_2        
			zzc.writeBoolean(parcel, flag);
		//    3    5:aload_2         
		//    4    6:iload_1         
		//    5    7:invokestatic    #73  <Method void zzc.writeBoolean(Parcel, boolean)>
			((com.google.android.gms.internal.common.zza)this).zzb(23, parcel);
		//    6   10:aload_0         
		//    7   11:bipush          23
		//    8   13:aload_2         
		//    9   14:invokevirtual   #77  <Method void com.google.android.gms.internal.common.zza.zzb(int, Parcel)>
		//   10   17:return          
		}

		public final void setUserVisibleHint(boolean flag)
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    2    4:astore_2        
			zzc.writeBoolean(parcel, flag);
		//    3    5:aload_2         
		//    4    6:iload_1         
		//    5    7:invokestatic    #73  <Method void zzc.writeBoolean(Parcel, boolean)>
			((com.google.android.gms.internal.common.zza)this).zzb(24, parcel);
		//    6   10:aload_0         
		//    7   11:bipush          24
		//    8   13:aload_2         
		//    9   14:invokevirtual   #77  <Method void com.google.android.gms.internal.common.zza.zzb(int, Parcel)>
		//   10   17:return          
		}

		public final void startActivity(Intent intent)
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    2    4:astore_2        
			zzc.zza(parcel, ((android.os.Parcelable) (intent)));
		//    3    5:aload_2         
		//    4    6:aload_1         
		//    5    7:invokestatic    #85  <Method void zzc.zza(Parcel, android.os.Parcelable)>
			((com.google.android.gms.internal.common.zza)this).zzb(25, parcel);
		//    6   10:aload_0         
		//    7   11:bipush          25
		//    8   13:aload_2         
		//    9   14:invokevirtual   #77  <Method void com.google.android.gms.internal.common.zza.zzb(int, Parcel)>
		//   10   17:return          
		}

		public final void startActivityForResult(Intent intent, int i)
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    2    4:astore_3        
			zzc.zza(parcel, ((android.os.Parcelable) (intent)));
		//    3    5:aload_3         
		//    4    6:aload_1         
		//    5    7:invokestatic    #85  <Method void zzc.zza(Parcel, android.os.Parcelable)>
			parcel.writeInt(i);
		//    6   10:aload_3         
		//    7   11:iload_2         
		//    8   12:invokevirtual   #91  <Method void Parcel.writeInt(int)>
			((com.google.android.gms.internal.common.zza)this).zzb(26, parcel);
		//    9   15:aload_0         
		//   10   16:bipush          26
		//   11   18:aload_3         
		//   12   19:invokevirtual   #77  <Method void com.google.android.gms.internal.common.zza.zzb(int, Parcel)>
		//   13   22:return          
		}

		public final void zza(IObjectWrapper iobjectwrapper)
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    2    4:astore_2        
			zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
		//    3    5:aload_2         
		//    4    6:aload_1         
		//    5    7:invokestatic    #95  <Method void zzc.zza(Parcel, android.os.IInterface)>
			((com.google.android.gms.internal.common.zza)this).zzb(20, parcel);
		//    6   10:aload_0         
		//    7   11:bipush          20
		//    8   13:aload_2         
		//    9   14:invokevirtual   #77  <Method void com.google.android.gms.internal.common.zza.zzb(int, Parcel)>
		//   10   17:return          
		}

		public final IObjectWrapper zzad()
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(2, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:iconst_2        
		//    2    2:aload_0         
		//    3    3:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    6:invokevirtual   #26  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
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
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(5, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:iconst_5        
		//    2    2:aload_0         
		//    3    3:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    6:invokevirtual   #26  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
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
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(6, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          6
		//    2    3:aload_0         
		//    3    4:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #26  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
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
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(9, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          9
		//    2    3:aload_0         
		//    3    4:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #26  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
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
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(12, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          12
		//    2    3:aload_0         
		//    3    4:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #26  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
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
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    2    4:astore_2        
			zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
		//    3    5:aload_2         
		//    4    6:aload_1         
		//    5    7:invokestatic    #95  <Method void zzc.zza(Parcel, android.os.IInterface)>
			((com.google.android.gms.internal.common.zza)this).zzb(27, parcel);
		//    6   10:aload_0         
		//    7   11:bipush          27
		//    8   13:aload_2         
		//    9   14:invokevirtual   #77  <Method void com.google.android.gms.internal.common.zza.zzb(int, Parcel)>
		//   10   17:return          
		}

		zza(IBinder ibinder)
		{
			super(ibinder, "com.google.android.gms.dynamic.IFragmentWrapper");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #14  <String "com.google.android.gms.dynamic.IFragmentWrapper">
		//    3    4:invokespecial   #17  <Method void com.google.android.gms.internal.common.zza(IBinder, String)>
		//    4    7:return          
		}
	}


	public static IFragmentWrapper asInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
	//    4    6:aload_0         
	//    5    7:ldc1            #14  <String "com.google.android.gms.dynamic.IFragmentWrapper">
	//    6    9:invokeinterface #26  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof IFragmentWrapper)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class IFragmentWrapper>
	//*  10   19:ifeq            27
			return (IFragmentWrapper)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class IFragmentWrapper>
	//   13   26:areturn         
		else
			return ((IFragmentWrapper) (new zza(ibinder)));
	//   14   27:new             #9   <Class IFragmentWrapper$Stub$zza>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #29  <Method void IFragmentWrapper$Stub$zza(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean zza(int i, Parcel parcel, Parcel parcel1, int j)
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
										boolean flag;
label8:
										{
label9:
											{
label10:
												{
label11:
													{
label12:
														{
label13:
															{
label14:
																{
label15:
																	{
label16:
																		{
label17:
																			{
label18:
																				{
label19:
																					{
label20:
																						{
label21:
																							{
																								switch(i)
	//*   0    0:iload_1         
																								{
	//*   1    1:tableswitch     2 27: default 120
	//	               2 418
	//	               3 401
	//	               4 384
	//	               5 376
	//	               6 368
	//	               7 349
	//	               8 332
	//	               9 324
	//	               10 316
	//	               11 307
	//	               12 299
	//	               13 290
	//	               14 281
	//	               15 272
	//	               16 263
	//	               17 254
	//	               18 245
	//	               19 236
	//	               20 218
	//	               21 207
	//	               22 196
	//	               23 185
	//	               24 174
	//	               25 157
	//	               26 136
	//	               27 122
																								default:
																									return false;
	//    2  120:iconst_0        
	//    3  121:ireturn         

																								case 2: // '\002'
																									break label2;

																								case 3: // '\003'
																									break label3;

																								case 4: // '\004'
																									break label5;

																								case 5: // '\005'
																									break label6;

																								case 6: // '\006'
																									break label7;

																								case 7: // '\007'
																									break label9;

																								case 8: // '\b'
																									break label10;

																								case 9: // '\t'
																									break label11;

																								case 10: // '\n'
																									break label12;

																								case 11: // '\013'
																									break label13;

																								case 12: // '\f'
																									break label14;

																								case 13: // '\r'
																									break label15;

																								case 14: // '\016'
																									break label16;

																								case 15: // '\017'
																									break label17;

																								case 16: // '\020'
																									break label18;

																								case 17: // '\021'
																									break label19;

																								case 18: // '\022'
																									break label20;

																								case 19: // '\023'
																									break label21;

																								case 27: // '\033'
																									zzb(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//    4  122:aload_0         
	//    5  123:aload_2         
	//    6  124:invokevirtual   #36  <Method IBinder Parcel.readStrongBinder()>
	//    7  127:invokestatic    #41  <Method IObjectWrapper IObjectWrapper$Stub.asInterface(IBinder)>
	//    8  130:invokevirtual   #45  <Method void zzb(IObjectWrapper)>
																									break;
	//    9  133:goto            229

																								case 26: // '\032'
																									startActivityForResult((Intent)zzc.zza(parcel, Intent.CREATOR), parcel.readInt());
	//   10  136:aload_0         
	//   11  137:aload_2         
	//   12  138:getstatic       #51  <Field android.os.Parcelable$Creator Intent.CREATOR>
	//   13  141:invokestatic    #56  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
	//   14  144:checkcast       #47  <Class Intent>
	//   15  147:aload_2         
	//   16  148:invokevirtual   #60  <Method int Parcel.readInt()>
	//   17  151:invokevirtual   #64  <Method void startActivityForResult(Intent, int)>
																									break;
	//   18  154:goto            229

																								case 25: // '\031'
																									startActivity((Intent)zzc.zza(parcel, Intent.CREATOR));
	//   19  157:aload_0         
	//   20  158:aload_2         
	//   21  159:getstatic       #51  <Field android.os.Parcelable$Creator Intent.CREATOR>
	//   22  162:invokestatic    #56  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
	//   23  165:checkcast       #47  <Class Intent>
	//   24  168:invokevirtual   #68  <Method void startActivity(Intent)>
																									break;
	//   25  171:goto            229

																								case 24: // '\030'
																									setUserVisibleHint(zzc.zza(parcel));
	//   26  174:aload_0         
	//   27  175:aload_2         
	//   28  176:invokestatic    #71  <Method boolean zzc.zza(Parcel)>
	//   29  179:invokevirtual   #75  <Method void setUserVisibleHint(boolean)>
																									break;
	//   30  182:goto            229

																								case 23: // '\027'
																									setRetainInstance(zzc.zza(parcel));
	//   31  185:aload_0         
	//   32  186:aload_2         
	//   33  187:invokestatic    #71  <Method boolean zzc.zza(Parcel)>
	//   34  190:invokevirtual   #78  <Method void setRetainInstance(boolean)>
																									break;
	//   35  193:goto            229

																								case 22: // '\026'
																									setMenuVisibility(zzc.zza(parcel));
	//   36  196:aload_0         
	//   37  197:aload_2         
	//   38  198:invokestatic    #71  <Method boolean zzc.zza(Parcel)>
	//   39  201:invokevirtual   #81  <Method void setMenuVisibility(boolean)>
																									break;
	//   40  204:goto            229

																								case 21: // '\025'
																									setHasOptionsMenu(zzc.zza(parcel));
	//   41  207:aload_0         
	//   42  208:aload_2         
	//   43  209:invokestatic    #71  <Method boolean zzc.zza(Parcel)>
	//   44  212:invokevirtual   #84  <Method void setHasOptionsMenu(boolean)>
																									break;
	//   45  215:goto            229

																								case 20: // '\024'
																									zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//   46  218:aload_0         
	//   47  219:aload_2         
	//   48  220:invokevirtual   #36  <Method IBinder Parcel.readStrongBinder()>
	//   49  223:invokestatic    #41  <Method IObjectWrapper IObjectWrapper$Stub.asInterface(IBinder)>
	//   50  226:invokevirtual   #86  <Method void zza(IObjectWrapper)>
																									break;
																								}
																								parcel1.writeNoException();
	//   51  229:aload_3         
	//   52  230:invokevirtual   #89  <Method void Parcel.writeNoException()>
																								break label0;
	//   53  233:goto            432
																							}
																							flag = isVisible();
	//   54  236:aload_0         
	//   55  237:invokevirtual   #93  <Method boolean isVisible()>
	//   56  240:istore          5
																							break label8;
	//   57  242:goto            355
																						}
																						flag = isResumed();
	//   58  245:aload_0         
	//   59  246:invokevirtual   #96  <Method boolean isResumed()>
	//   60  249:istore          5
																						break label8;
	//   61  251:goto            355
																					}
																					flag = isRemoving();
	//   62  254:aload_0         
	//   63  255:invokevirtual   #99  <Method boolean isRemoving()>
	//   64  258:istore          5
																					break label8;
	//   65  260:goto            355
																				}
																				flag = isInLayout();
	//   66  263:aload_0         
	//   67  264:invokevirtual   #102 <Method boolean isInLayout()>
	//   68  267:istore          5
																				break label8;
	//   69  269:goto            355
																			}
																			flag = isHidden();
	//   70  272:aload_0         
	//   71  273:invokevirtual   #105 <Method boolean isHidden()>
	//   72  276:istore          5
																			break label8;
	//   73  278:goto            355
																		}
																		flag = isDetached();
	//   74  281:aload_0         
	//   75  282:invokevirtual   #108 <Method boolean isDetached()>
	//   76  285:istore          5
																		break label8;
	//   77  287:goto            355
																	}
																	flag = isAdded();
	//   78  290:aload_0         
	//   79  291:invokevirtual   #111 <Method boolean isAdded()>
	//   80  294:istore          5
																	break label8;
	//   81  296:goto            355
																}
																parcel = ((Parcel) (zzah()));
	//   82  299:aload_0         
	//   83  300:invokevirtual   #115 <Method IObjectWrapper zzah()>
	//   84  303:astore_2        
																break label1;
	//   85  304:goto            423
															}
															flag = getUserVisibleHint();
	//   86  307:aload_0         
	//   87  308:invokevirtual   #118 <Method boolean getUserVisibleHint()>
	//   88  311:istore          5
															break label8;
	//   89  313:goto            355
														}
														i = getTargetRequestCode();
	//   90  316:aload_0         
	//   91  317:invokevirtual   #121 <Method int getTargetRequestCode()>
	//   92  320:istore_1        
														break label4;
	//   93  321:goto            389
													}
													parcel = ((Parcel) (zzag()));
	//   94  324:aload_0         
	//   95  325:invokevirtual   #125 <Method IFragmentWrapper zzag()>
	//   96  328:astore_2        
													break label1;
	//   97  329:goto            423
												}
												parcel = ((Parcel) (getTag()));
	//   98  332:aload_0         
	//   99  333:invokevirtual   #129 <Method String getTag()>
	//  100  336:astore_2        
												parcel1.writeNoException();
	//  101  337:aload_3         
	//  102  338:invokevirtual   #89  <Method void Parcel.writeNoException()>
												parcel1.writeString(((String) (parcel)));
	//  103  341:aload_3         
	//  104  342:aload_2         
	//  105  343:invokevirtual   #132 <Method void Parcel.writeString(String)>
												break label0;
	//  106  346:goto            432
											}
											flag = getRetainInstance();
	//  107  349:aload_0         
	//  108  350:invokevirtual   #135 <Method boolean getRetainInstance()>
	//  109  353:istore          5
										}
										parcel1.writeNoException();
	//  110  355:aload_3         
	//  111  356:invokevirtual   #89  <Method void Parcel.writeNoException()>
										zzc.writeBoolean(parcel1, flag);
	//  112  359:aload_3         
	//  113  360:iload           5
	//  114  362:invokestatic    #139 <Method void zzc.writeBoolean(Parcel, boolean)>
										break label0;
	//  115  365:goto            432
									}
									parcel = ((Parcel) (zzaf()));
	//  116  368:aload_0         
	//  117  369:invokevirtual   #142 <Method IObjectWrapper zzaf()>
	//  118  372:astore_2        
									break label1;
	//  119  373:goto            423
								}
								parcel = ((Parcel) (zzae()));
	//  120  376:aload_0         
	//  121  377:invokevirtual   #145 <Method IFragmentWrapper zzae()>
	//  122  380:astore_2        
								break label1;
	//  123  381:goto            423
							}
							i = getId();
	//  124  384:aload_0         
	//  125  385:invokevirtual   #148 <Method int getId()>
	//  126  388:istore_1        
						}
						parcel1.writeNoException();
	//  127  389:aload_3         
	//  128  390:invokevirtual   #89  <Method void Parcel.writeNoException()>
						parcel1.writeInt(i);
	//  129  393:aload_3         
	//  130  394:iload_1         
	//  131  395:invokevirtual   #152 <Method void Parcel.writeInt(int)>
						break label0;
	//  132  398:goto            432
					}
					parcel = ((Parcel) (getArguments()));
	//  133  401:aload_0         
	//  134  402:invokevirtual   #156 <Method Bundle getArguments()>
	//  135  405:astore_2        
					parcel1.writeNoException();
	//  136  406:aload_3         
	//  137  407:invokevirtual   #89  <Method void Parcel.writeNoException()>
					zzc.zzb(parcel1, ((android.os.Parcelable) (parcel)));
	//  138  410:aload_3         
	//  139  411:aload_2         
	//  140  412:invokestatic    #159 <Method void zzc.zzb(Parcel, android.os.Parcelable)>
					break label0;
	//  141  415:goto            432
				}
				parcel = ((Parcel) (zzad()));
	//  142  418:aload_0         
	//  143  419:invokevirtual   #162 <Method IObjectWrapper zzad()>
	//  144  422:astore_2        
			}
			parcel1.writeNoException();
	//  145  423:aload_3         
	//  146  424:invokevirtual   #89  <Method void Parcel.writeNoException()>
			zzc.zza(parcel1, ((android.os.IInterface) (parcel)));
	//  147  427:aload_3         
	//  148  428:aload_2         
	//  149  429:invokestatic    #165 <Method void zzc.zza(Parcel, android.os.IInterface)>
		}
		return true;
	//  150  432:iconst_1        
	//  151  433:ireturn         
	}

	public IFragmentWrapper$Stub()
	{
		super("com.google.android.gms.dynamic.IFragmentWrapper");
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <String "com.google.android.gms.dynamic.IFragmentWrapper">
	//    2    3:invokespecial   #17  <Method void zzb(String)>
	//    3    6:return          
	}
}
