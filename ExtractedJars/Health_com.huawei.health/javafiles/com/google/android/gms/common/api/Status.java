// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;

// Referenced classes of package com.google.android.gms.common.api:
//			Result, zzh, CommonStatusCodes

public final class Status extends zza
	implements Result, ReflectedParcelable
{

	public Status(int i)
	{
		this(i, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #56  <Method void Status(int, String)>
	//    4    6:return          
	}

	Status(int i, int j, String s, PendingIntent pendingintent)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #60  <Field int zzaiI>
		zzavD = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #62  <Field int zzavD>
		zzayk = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #64  <Field String zzayk>
		mPendingIntent = pendingintent;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #66  <Field PendingIntent mPendingIntent>
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
	//    5    5:invokespecial   #68  <Method void Status(int, int, String, PendingIntent)>
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
	//    5    5:invokespecial   #68  <Method void Status(int, int, String, PendingIntent)>
	//    6    8:return          
	}

	public boolean equals(Object obj)
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
		return zzaiI == ((Status) (obj)).zzaiI && zzavD == ((Status) (obj)).zzavD && zzaa.equal(((Object) (zzayk)), ((Object) (((Status) (obj)).zzayk))) && zzaa.equal(((Object) (mPendingIntent)), ((Object) (((Status) (obj)).mPendingIntent)));
	//    8   14:aload_0         
	//    9   15:getfield        #60  <Field int zzaiI>
	//   10   18:aload_1         
	//   11   19:getfield        #60  <Field int zzaiI>
	//   12   22:icmpne          66
	//   13   25:aload_0         
	//   14   26:getfield        #62  <Field int zzavD>
	//   15   29:aload_1         
	//   16   30:getfield        #62  <Field int zzavD>
	//   17   33:icmpne          66
	//   18   36:aload_0         
	//   19   37:getfield        #64  <Field String zzayk>
	//   20   40:aload_1         
	//   21   41:getfield        #64  <Field String zzayk>
	//   22   44:invokestatic    #77  <Method boolean zzaa.equal(Object, Object)>
	//   23   47:ifeq            66
	//   24   50:aload_0         
	//   25   51:getfield        #66  <Field PendingIntent mPendingIntent>
	//   26   54:aload_1         
	//   27   55:getfield        #66  <Field PendingIntent mPendingIntent>
	//   28   58:invokestatic    #77  <Method boolean zzaa.equal(Object, Object)>
	//   29   61:ifeq            66
	//   30   64:iconst_1        
	//   31   65:ireturn         
	//   32   66:iconst_0        
	//   33   67:ireturn         
	}

	public PendingIntent getResolution()
	{
		return mPendingIntent;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field PendingIntent mPendingIntent>
	//    2    4:areturn         
	}

	public Status getStatus()
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public int getStatusCode()
	{
		return zzavD;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int zzavD>
	//    2    4:ireturn         
	}

	public String getStatusMessage()
	{
		return zzayk;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field String zzayk>
	//    2    4:areturn         
	}

	public boolean hasResolution()
	{
		return mPendingIntent != null;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field PendingIntent mPendingIntent>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			Integer.valueOf(zzaiI), Integer.valueOf(zzavD), zzayk, mPendingIntent
		});
	//    0    0:iconst_4        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #60  <Field int zzaiI>
	//    6   10:invokestatic    #98  <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #62  <Field int zzavD>
	//   12   20:invokestatic    #98  <Method Integer Integer.valueOf(int)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:aload_0         
	//   17   27:getfield        #64  <Field String zzayk>
	//   18   30:aastore         
	//   19   31:dup             
	//   20   32:iconst_3        
	//   21   33:aload_0         
	//   22   34:getfield        #66  <Field PendingIntent mPendingIntent>
	//   23   37:aastore         
	//   24   38:invokestatic    #101 <Method int zzaa.hashCode(Object[])>
	//   25   41:ireturn         
	}

	public boolean isCanceled()
	{
		return zzavD == 16;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int zzavD>
	//    2    4:bipush          16
	//    3    6:icmpne          11
	//    4    9:iconst_1        
	//    5   10:ireturn         
	//    6   11:iconst_0        
	//    7   12:ireturn         
	}

	public boolean isInterrupted()
	{
		return zzavD == 14;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int zzavD>
	//    2    4:bipush          14
	//    3    6:icmpne          11
	//    4    9:iconst_1        
	//    5   10:ireturn         
	//    6   11:iconst_0        
	//    7   12:ireturn         
	}

	public boolean isSuccess()
	{
		return zzavD <= 0;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int zzavD>
	//    2    4:ifgt            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void startResolutionForResult(Activity activity, int i)
		throws android.content.IntentSender.SendIntentException
	{
		if(!hasResolution())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #110 <Method boolean hasResolution()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			activity.startIntentSenderForResult(mPendingIntent.getIntentSender(), i, ((android.content.Intent) (null)), 0, 0, 0);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #66  <Field PendingIntent mPendingIntent>
	//    7   13:invokevirtual   #116 <Method android.content.IntentSender PendingIntent.getIntentSender()>
	//    8   16:iload_2         
	//    9   17:aconst_null     
	//   10   18:iconst_0        
	//   11   19:iconst_0        
	//   12   20:iconst_0        
	//   13   21:invokevirtual   #122 <Method void Activity.startIntentSenderForResult(android.content.IntentSender, int, android.content.Intent, int, int, int)>
			return;
	//   14   24:return          
		}
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("statusCode", ((Object) (zzvv()))).zzg("resolution", ((Object) (mPendingIntent))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #128 <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #130 <String "statusCode">
	//    3    6:aload_0         
	//    4    7:invokevirtual   #133 <Method String zzvv()>
	//    5   10:invokevirtual   #139 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    6   13:ldc1            #141 <String "resolution">
	//    7   15:aload_0         
	//    8   16:getfield        #66  <Field PendingIntent mPendingIntent>
	//    9   19:invokevirtual   #139 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   10   22:invokevirtual   #143 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   11   25:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.common.api.zzh.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #149 <Method void com.google.android.gms.common.api.zzh.zza(Status, Parcel, int)>
	//    4    6:return          
	}

	PendingIntent zzvu()
	{
		return mPendingIntent;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field PendingIntent mPendingIntent>
	//    2    4:areturn         
	}

	public String zzvv()
	{
		if(zzayk != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field String zzayk>
	//*   2    4:ifnull          12
			return zzayk;
	//    3    7:aload_0         
	//    4    8:getfield        #64  <Field String zzayk>
	//    5   11:areturn         
		else
			return CommonStatusCodes.getStatusCodeString(zzavD);
	//    6   12:aload_0         
	//    7   13:getfield        #62  <Field int zzavD>
	//    8   16:invokestatic    #156 <Method String CommonStatusCodes.getStatusCodeString(int)>
	//    9   19:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzh();
	public static final Status zzazA = new Status(15);
	public static final Status zzazB = new Status(16);
	public static final Status zzazC = new Status(17);
	public static final Status zzazD = new Status(18);
	public static final Status zzazx = new Status(0);
	public static final Status zzazy = new Status(14);
	public static final Status zzazz = new Status(8);
	private final PendingIntent mPendingIntent;
	final int zzaiI;
	private final int zzavD;
	private final String zzayk;

	static 
	{
	//    0    0:new             #2   <Class Status>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #32  <Method void Status(int)>
	//    4    8:putstatic       #34  <Field Status zzazx>
	//    5   11:new             #2   <Class Status>
	//    6   14:dup             
	//    7   15:bipush          14
	//    8   17:invokespecial   #32  <Method void Status(int)>
	//    9   20:putstatic       #36  <Field Status zzazy>
	//   10   23:new             #2   <Class Status>
	//   11   26:dup             
	//   12   27:bipush          8
	//   13   29:invokespecial   #32  <Method void Status(int)>
	//   14   32:putstatic       #38  <Field Status zzazz>
	//   15   35:new             #2   <Class Status>
	//   16   38:dup             
	//   17   39:bipush          15
	//   18   41:invokespecial   #32  <Method void Status(int)>
	//   19   44:putstatic       #40  <Field Status zzazA>
	//   20   47:new             #2   <Class Status>
	//   21   50:dup             
	//   22   51:bipush          16
	//   23   53:invokespecial   #32  <Method void Status(int)>
	//   24   56:putstatic       #42  <Field Status zzazB>
	//   25   59:new             #2   <Class Status>
	//   26   62:dup             
	//   27   63:bipush          17
	//   28   65:invokespecial   #32  <Method void Status(int)>
	//   29   68:putstatic       #44  <Field Status zzazC>
	//   30   71:new             #2   <Class Status>
	//   31   74:dup             
	//   32   75:bipush          18
	//   33   77:invokespecial   #32  <Method void Status(int)>
	//   34   80:putstatic       #46  <Field Status zzazD>
	//   35   83:new             #48  <Class zzh>
	//   36   86:dup             
	//   37   87:invokespecial   #50  <Method void zzh()>
	//   38   90:putstatic       #52  <Field android.os.Parcelable$Creator CREATOR>
	//*  39   93:return          
	}
}
