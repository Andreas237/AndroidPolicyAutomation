// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.*;

// Referenced classes of package com.google.android.gms.ads.formats:
//			zzc, zzb

public final class PublisherAdViewOptions extends AbstractSafeParcelable
{
	public static final class Builder
	{

		static boolean zza(Builder builder)
		{
			return builder.zzvm;
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field boolean zzvm>
		//    2    4:ireturn         
		}

		static AppEventListener zzb(Builder builder)
		{
			return builder.zzvo;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field AppEventListener zzvo>
		//    2    4:areturn         
		}

		public final PublisherAdViewOptions build()
		{
			return new PublisherAdViewOptions(this, ((zzb) (null)));
		//    0    0:new             #6   <Class PublisherAdViewOptions>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #29  <Method void PublisherAdViewOptions(PublisherAdViewOptions$Builder, zzb)>
		//    5    9:areturn         
		}

		public final Builder setAppEventListener(AppEventListener appeventlistener)
		{
			zzvo = appeventlistener;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #24  <Field AppEventListener zzvo>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setManualImpressionsEnabled(boolean flag)
		{
			zzvm = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #17  <Field boolean zzvm>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private boolean zzvm;
		private AppEventListener zzvo;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			zzvm = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #17  <Field boolean zzvm>
		//    5    9:return          
		}
	}


	private PublisherAdViewOptions(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void AbstractSafeParcelable()>
		zzvm = Builder.zza(builder);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #46  <Method boolean PublisherAdViewOptions$Builder.zza(PublisherAdViewOptions$Builder)>
	//    5    9:putfield        #48  <Field boolean zzvm>
		zzvo = Builder.zzb(builder);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #52  <Method AppEventListener PublisherAdViewOptions$Builder.zzb(PublisherAdViewOptions$Builder)>
	//    9   17:putfield        #54  <Field AppEventListener zzvo>
		if(zzvo != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #54  <Field AppEventListener zzvo>
	//*  12   24:ifnull          42
			builder = ((Builder) (new zzjp(zzvo)));
	//   13   27:new             #56  <Class zzjp>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:getfield        #54  <Field AppEventListener zzvo>
	//   17   35:invokespecial   #59  <Method void zzjp(AppEventListener)>
	//   18   38:astore_1        
		else
	//*  19   39:goto            44
			builder = null;
	//   20   42:aconst_null     
	//   21   43:astore_1        
		zzvn = ((zzla) (builder));
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:putfield        #61  <Field zzla zzvn>
	//   25   49:return          
	}

	PublisherAdViewOptions(Builder builder, zzb zzb)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #64  <Method void PublisherAdViewOptions(PublisherAdViewOptions$Builder)>
	//    3    5:return          
	}

	PublisherAdViewOptions(boolean flag, IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void AbstractSafeParcelable()>
		zzvm = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #48  <Field boolean zzvm>
		if(ibinder != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          21
			ibinder = ((IBinder) (zzlb.zzd(ibinder)));
	//    7   13:aload_2         
	//    8   14:invokestatic    #73  <Method zzla zzlb.zzd(IBinder)>
	//    9   17:astore_2        
		else
	//*  10   18:goto            23
			ibinder = null;
	//   11   21:aconst_null     
	//   12   22:astore_2        
		zzvn = ((zzla) (ibinder));
	//   13   23:aload_0         
	//   14   24:aload_2         
	//   15   25:putfield        #61  <Field zzla zzvn>
	//   16   28:return          
	}

	public final AppEventListener getAppEventListener()
	{
		return zzvo;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field AppEventListener zzvo>
	//    2    4:areturn         
	}

	public final boolean getManualImpressionsEnabled()
	{
		return zzvm;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field boolean zzvm>
	//    2    4:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #86  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeBoolean(parcel, 1, getManualImpressionsEnabled());
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #88  <Method boolean getManualImpressionsEnabled()>
	//    7   11:invokestatic    #92  <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		IBinder ibinder;
		if(zzvn == null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #61  <Field zzla zzvn>
	//*  10   18:ifnonnull       26
			ibinder = null;
	//   11   21:aconst_null     
	//   12   22:astore_3        
		else
	//*  13   23:goto            36
			ibinder = zzvn.asBinder();
	//   14   26:aload_0         
	//   15   27:getfield        #61  <Field zzla zzvn>
	//   16   30:invokeinterface #98  <Method IBinder zzla.asBinder()>
	//   17   35:astore_3        
		SafeParcelWriter.writeIBinder(parcel, 2, ibinder, false);
	//   18   36:aload_1         
	//   19   37:iconst_2        
	//   20   38:aload_3         
	//   21   39:iconst_0        
	//   22   40:invokestatic    #102 <Method void SafeParcelWriter.writeIBinder(Parcel, int, IBinder, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   23   43:aload_1         
	//   24   44:iload_2         
	//   25   45:invokestatic    #105 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   26   48:return          
	}

	public final zzla zzbg()
	{
		return zzvn;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field zzla zzvn>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzc();
	private final boolean zzvm;
	private final zzla zzvn;
	private AppEventListener zzvo;

	static 
	{
	//    0    0:new             #34  <Class zzc>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void zzc()>
	//    3    7:putstatic       #39  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
