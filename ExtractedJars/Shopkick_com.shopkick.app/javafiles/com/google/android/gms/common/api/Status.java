// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.api:
//			Result, zzb, CommonStatusCodes

public final class Status extends AbstractSafeParcelable
	implements Result, ReflectedParcelable
{

	public Status(int i)
	{
		this(i, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #73  <Method void Status(int, String)>
	//    4    6:return          
	}

	Status(int i, int j, String s, PendingIntent pendingintent)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #78  <Method void AbstractSafeParcelable()>
		zzg = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #80  <Field int zzg>
		zzh = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #82  <Field int zzh>
		zzj = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #84  <Field String zzj>
		zzi = pendingintent;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #86  <Field PendingIntent zzi>
	//   14   25:return          
	}

	public Status(int i, String s)
	{
		this(1, i, s, ((PendingIntent) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iload_1         
	//    3    3:aload_2         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #89  <Method void Status(int, int, String, PendingIntent)>
	//    6    8:return          
	}

	public Status(int i, String s, PendingIntent pendingintent)
	{
		this(1, i, s, pendingintent);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #89  <Method void Status(int, int, String, PendingIntent)>
	//    6    8:return          
	}

	public final boolean equals(Object obj)
	{
		if(!(obj instanceof Status))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class Status>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		obj = ((Object) ((Status)obj));
	//    5    9:aload_1         
	//    6   10:checkcast       #2   <Class Status>
	//    7   13:astore_1        
		return zzg == ((Status) (obj)).zzg && zzh == ((Status) (obj)).zzh && Objects.equal(((Object) (zzj)), ((Object) (((Status) (obj)).zzj))) && Objects.equal(((Object) (zzi)), ((Object) (((Status) (obj)).zzi)));
	//    8   14:aload_0         
	//    9   15:getfield        #80  <Field int zzg>
	//   10   18:aload_1         
	//   11   19:getfield        #80  <Field int zzg>
	//   12   22:icmpne          66
	//   13   25:aload_0         
	//   14   26:getfield        #82  <Field int zzh>
	//   15   29:aload_1         
	//   16   30:getfield        #82  <Field int zzh>
	//   17   33:icmpne          66
	//   18   36:aload_0         
	//   19   37:getfield        #84  <Field String zzj>
	//   20   40:aload_1         
	//   21   41:getfield        #84  <Field String zzj>
	//   22   44:invokestatic    #98  <Method boolean Objects.equal(Object, Object)>
	//   23   47:ifeq            66
	//   24   50:aload_0         
	//   25   51:getfield        #86  <Field PendingIntent zzi>
	//   26   54:aload_1         
	//   27   55:getfield        #86  <Field PendingIntent zzi>
	//   28   58:invokestatic    #98  <Method boolean Objects.equal(Object, Object)>
	//   29   61:ifeq            66
	//   30   64:iconst_1        
	//   31   65:ireturn         
	//   32   66:iconst_0        
	//   33   67:ireturn         
	}

	public final PendingIntent getResolution()
	{
		return zzi;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field PendingIntent zzi>
	//    2    4:areturn         
	}

	public final Status getStatus()
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public final int getStatusCode()
	{
		return zzh;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field int zzh>
	//    2    4:ireturn         
	}

	public final String getStatusMessage()
	{
		return zzj;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field String zzj>
	//    2    4:areturn         
	}

	public final boolean hasResolution()
	{
		return zzi != null;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field PendingIntent zzi>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final int hashCode()
	{
		return Objects.hashCode(new Object[] {
			Integer.valueOf(zzg), Integer.valueOf(zzh), zzj, zzi
		});
	//    0    0:iconst_4        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #80  <Field int zzg>
	//    6   10:invokestatic    #115 <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #82  <Field int zzh>
	//   12   20:invokestatic    #115 <Method Integer Integer.valueOf(int)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:aload_0         
	//   17   27:getfield        #84  <Field String zzj>
	//   18   30:aastore         
	//   19   31:dup             
	//   20   32:iconst_3        
	//   21   33:aload_0         
	//   22   34:getfield        #86  <Field PendingIntent zzi>
	//   23   37:aastore         
	//   24   38:invokestatic    #118 <Method int Objects.hashCode(Object[])>
	//   25   41:ireturn         
	}

	public final boolean isCanceled()
	{
		return zzh == 16;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field int zzh>
	//    2    4:bipush          16
	//    3    6:icmpne          11
	//    4    9:iconst_1        
	//    5   10:ireturn         
	//    6   11:iconst_0        
	//    7   12:ireturn         
	}

	public final boolean isInterrupted()
	{
		return zzh == 14;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field int zzh>
	//    2    4:bipush          14
	//    3    6:icmpne          11
	//    4    9:iconst_1        
	//    5   10:ireturn         
	//    6   11:iconst_0        
	//    7   12:ireturn         
	}

	public final boolean isSuccess()
	{
		return zzh <= 0;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field int zzh>
	//    2    4:ifgt            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final void startResolutionForResult(Activity activity, int i)
		throws android.content.IntentSender.SendIntentException
	{
		if(!hasResolution())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #127 <Method boolean hasResolution()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			activity.startIntentSenderForResult(zzi.getIntentSender(), i, ((android.content.Intent) (null)), 0, 0, 0);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #86  <Field PendingIntent zzi>
	//    7   13:invokevirtual   #133 <Method android.content.IntentSender PendingIntent.getIntentSender()>
	//    8   16:iload_2         
	//    9   17:aconst_null     
	//   10   18:iconst_0        
	//   11   19:iconst_0        
	//   12   20:iconst_0        
	//   13   21:invokevirtual   #139 <Method void Activity.startIntentSenderForResult(android.content.IntentSender, int, android.content.Intent, int, int, int)>
			return;
	//   14   24:return          
		}
	}

	public final String toString()
	{
		return Objects.toStringHelper(((Object) (this))).add("statusCode", ((Object) (zzg()))).add("resolution", ((Object) (zzi))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #145 <Method com.google.android.gms.common.internal.Objects$ToStringHelper Objects.toStringHelper(Object)>
	//    2    4:ldc1            #147 <String "statusCode">
	//    3    6:aload_0         
	//    4    7:invokevirtual   #149 <Method String zzg()>
	//    5   10:invokevirtual   #155 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//    6   13:ldc1            #157 <String "resolution">
	//    7   15:aload_0         
	//    8   16:getfield        #86  <Field PendingIntent zzi>
	//    9   19:invokevirtual   #155 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   10   22:invokevirtual   #159 <Method String com.google.android.gms.common.internal.Objects$ToStringHelper.toString()>
	//   11   25:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #167 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, getStatusCode());
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #169 <Method int getStatusCode()>
	//    7   11:invokestatic    #173 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 2, getStatusMessage(), false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #175 <Method String getStatusMessage()>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #179 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 3, ((android.os.Parcelable) (zzi)), i, false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #86  <Field PendingIntent zzi>
	//   18   30:iload_2         
	//   19   31:iconst_0        
	//   20   32:invokestatic    #183 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeInt(parcel, 1000, zzg);
	//   21   35:aload_1         
	//   22   36:sipush          1000
	//   23   39:aload_0         
	//   24   40:getfield        #80  <Field int zzg>
	//   25   43:invokestatic    #173 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   26   46:aload_1         
	//   27   47:iload_3         
	//   28   48:invokestatic    #186 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   29   51:return          
	}

	public final String zzg()
	{
		String s = zzj;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field String zzj>
	//    2    4:astore_1        
		if(s != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return s;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			return CommonStatusCodes.getStatusCodeString(zzh);
	//    7   11:aload_0         
	//    8   12:getfield        #82  <Field int zzh>
	//    9   15:invokestatic    #192 <Method String CommonStatusCodes.getStatusCodeString(int)>
	//   10   18:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzb();
	public static final Status RESULT_CANCELED = new Status(16);
	public static final Status RESULT_DEAD_CLIENT = new Status(18);
	public static final Status RESULT_INTERNAL_ERROR = new Status(8);
	public static final Status RESULT_INTERRUPTED = new Status(14);
	public static final Status RESULT_SUCCESS = new Status(0);
	public static final Status RESULT_TIMEOUT = new Status(15);
	private static final Status zzar = new Status(17);
	private final int zzg;
	private final int zzh;
	private final PendingIntent zzi;
	private final String zzj;

	static 
	{
	//    0    0:new             #2   <Class Status>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #49  <Method void Status(int)>
	//    4    8:putstatic       #51  <Field Status RESULT_SUCCESS>
	//    5   11:new             #2   <Class Status>
	//    6   14:dup             
	//    7   15:bipush          14
	//    8   17:invokespecial   #49  <Method void Status(int)>
	//    9   20:putstatic       #53  <Field Status RESULT_INTERRUPTED>
	//   10   23:new             #2   <Class Status>
	//   11   26:dup             
	//   12   27:bipush          8
	//   13   29:invokespecial   #49  <Method void Status(int)>
	//   14   32:putstatic       #55  <Field Status RESULT_INTERNAL_ERROR>
	//   15   35:new             #2   <Class Status>
	//   16   38:dup             
	//   17   39:bipush          15
	//   18   41:invokespecial   #49  <Method void Status(int)>
	//   19   44:putstatic       #57  <Field Status RESULT_TIMEOUT>
	//   20   47:new             #2   <Class Status>
	//   21   50:dup             
	//   22   51:bipush          16
	//   23   53:invokespecial   #49  <Method void Status(int)>
	//   24   56:putstatic       #59  <Field Status RESULT_CANCELED>
	//   25   59:new             #2   <Class Status>
	//   26   62:dup             
	//   27   63:bipush          17
	//   28   65:invokespecial   #49  <Method void Status(int)>
	//   29   68:putstatic       #61  <Field Status zzar>
	//   30   71:new             #2   <Class Status>
	//   31   74:dup             
	//   32   75:bipush          18
	//   33   77:invokespecial   #49  <Method void Status(int)>
	//   34   80:putstatic       #63  <Field Status RESULT_DEAD_CLIENT>
	//   35   83:new             #65  <Class zzb>
	//   36   86:dup             
	//   37   87:invokespecial   #67  <Method void zzb()>
	//   38   90:putstatic       #69  <Field android.os.Parcelable$Creator CREATOR>
	//*  39   93:return          
	}
}
