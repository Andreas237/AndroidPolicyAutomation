// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzf

private abstract class zzf$zza extends zzf$zze
{

	protected void zzc(Boolean boolean1)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(boolean1 != null) goto _L2; else goto _L1
	//    2    2:aload_1         
	//    3    3:ifnonnull       16
_L1:
		zzf.zza(zzaDV, 1, ((android.os.IInterface) (null)));
	//    4    6:aload_0         
	//    5    7:getfield        #19  <Field zzf zzaDV>
	//    6   10:iconst_1        
	//    7   11:aconst_null     
	//    8   12:invokestatic    #39  <Method void zzf.zza(zzf, int, android.os.IInterface)>
_L4:
		return;
	//    9   15:return          
_L2:
		switch(statusCode)
	//*  10   16:aload_0         
	//*  11   17:getfield        #30  <Field int statusCode>
		{
	//*  12   20:lookupswitch    2: default 48
	//	               0: 96
	//	               10: 127
		default:
			zzf.zza(zzaDV, 1, ((android.os.IInterface) (null)));
	//   13   48:aload_0         
	//   14   49:getfield        #19  <Field zzf zzaDV>
	//   15   52:iconst_1        
	//   16   53:aconst_null     
	//   17   54:invokestatic    #39  <Method void zzf.zza(zzf, int, android.os.IInterface)>
			boolean1 = ((Boolean) (obj));
	//   18   57:aload_2         
	//   19   58:astore_1        
			if(zzaDU != null)
	//*  20   59:aload_0         
	//*  21   60:getfield        #32  <Field Bundle zzaDU>
	//*  22   63:ifnull          79
				boolean1 = ((Boolean) ((PendingIntent)zzaDU.getParcelable("pendingIntent")));
	//   23   66:aload_0         
	//   24   67:getfield        #32  <Field Bundle zzaDU>
	//   25   70:ldc1            #41  <String "pendingIntent">
	//   26   72:invokevirtual   #47  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   27   75:checkcast       #49  <Class PendingIntent>
	//   28   78:astore_1        
			zzn(new ConnectionResult(statusCode, ((PendingIntent) (boolean1))));
	//   29   79:aload_0         
	//   30   80:new             #51  <Class ConnectionResult>
	//   31   83:dup             
	//   32   84:aload_0         
	//   33   85:getfield        #30  <Field int statusCode>
	//   34   88:aload_1         
	//   35   89:invokespecial   #54  <Method void ConnectionResult(int, PendingIntent)>
	//   36   92:invokevirtual   #58  <Method void zzn(ConnectionResult)>
			return;
	//   37   95:return          

		case 0: // '\0'
			if(!zzwZ())
	//*  38   96:aload_0         
	//*  39   97:invokevirtual   #62  <Method boolean zzwZ()>
	//*  40  100:ifne            15
			{
				zzf.zza(zzaDV, 1, ((android.os.IInterface) (null)));
	//   41  103:aload_0         
	//   42  104:getfield        #19  <Field zzf zzaDV>
	//   43  107:iconst_1        
	//   44  108:aconst_null     
	//   45  109:invokestatic    #39  <Method void zzf.zza(zzf, int, android.os.IInterface)>
				zzn(new ConnectionResult(8, ((PendingIntent) (null))));
	//   46  112:aload_0         
	//   47  113:new             #51  <Class ConnectionResult>
	//   48  116:dup             
	//   49  117:bipush          8
	//   50  119:aconst_null     
	//   51  120:invokespecial   #54  <Method void ConnectionResult(int, PendingIntent)>
	//   52  123:invokevirtual   #58  <Method void zzn(ConnectionResult)>
				return;
	//   53  126:return          
			}
			break;

		case 10: // '\n'
			zzf.zza(zzaDV, 1, ((android.os.IInterface) (null)));
	//   54  127:aload_0         
	//   55  128:getfield        #19  <Field zzf zzaDV>
	//   56  131:iconst_1        
	//   57  132:aconst_null     
	//   58  133:invokestatic    #39  <Method void zzf.zza(zzf, int, android.os.IInterface)>
			throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
	//   59  136:new             #64  <Class IllegalStateException>
	//   60  139:dup             
	//   61  140:ldc1            #66  <String "A fatal developer error has occurred. Check the logs for further information.">
	//   62  142:invokespecial   #69  <Method void IllegalStateException(String)>
	//   63  145:athrow          
		}
		if(true) goto _L4; else goto _L3
_L3:
	}

	protected abstract void zzn(ConnectionResult connectionresult);

	protected void zzu(Object obj)
	{
		zzc((Boolean)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class Boolean>
	//    3    5:invokevirtual   #73  <Method void zzc(Boolean)>
	//    4    8:return          
	}

	protected abstract boolean zzwZ();

	public final int statusCode;
	public final Bundle zzaDU;
	final zzf zzaDV;

	protected zzf$zza(zzf zzf1, int i, Bundle bundle)
	{
		zzaDV = zzf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field zzf zzaDV>
		super(zzf1, ((Object) (Boolean.valueOf(true))));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iconst_1        
	//    6    8:invokestatic    #25  <Method Boolean Boolean.valueOf(boolean)>
	//    7   11:invokespecial   #28  <Method void zzf$zze(zzf, Object)>
		statusCode = i;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #30  <Field int statusCode>
		zzaDU = bundle;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #32  <Field Bundle zzaDU>
	//   14   24:return          
	}
}
