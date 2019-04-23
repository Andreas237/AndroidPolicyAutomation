// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.internal.zzh;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//			zzc, GoogleSignInOptions, GoogleSignInResult

public class GoogleSignInClient extends GoogleApi
{
	private static final class zzc
		implements com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
	{

		public final Object convert(Result result)
		{
			return ((Object) (((GoogleSignInResult)result).getSignInAccount()));
		//    0    0:aload_1         
		//    1    1:checkcast       #21  <Class GoogleSignInResult>
		//    2    4:invokevirtual   #25  <Method GoogleSignInAccount GoogleSignInResult.getSignInAccount()>
		//    3    7:areturn         
		}

		private zzc()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}

		zzc(com.google.android.gms.auth.api.signin.zzc zzc1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void GoogleSignInClient$zzc()>
		//    2    4:return          
		}
	}

	static final class zzd
	{

		public static int[] values$50KLMJ33DTMIUPRFDTJMOP9FC5N68SJFD5I2UPRDECNM2TBKD0NM2S395TPMIPRED5N2UHRFDTJMOPAJD5JMSIBE8DM6IPBEEGI4IRBGDHIMQPBEEHGN8QBFDOTG____0()
		{
			return (int[])((int []) (zzay)).clone();
		//    0    0:getstatic       #32  <Field int[] zzay>
		//    1    3:invokevirtual   #40  <Method Object _5B_I.clone()>
		//    2    6:checkcast       #36  <Class int[]>
		//    3    9:areturn         
		}

		public static final int zzau = 1;
		public static final int zzav = 2;
		public static final int zzaw = 3;
		public static final int zzax = 4;
		private static final int zzay[] = {
			zzau, zzav, zzaw, zzax
		};

		static 
		{
		//    0    0:iconst_4        
		//    1    1:newarray        int[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:getstatic       #24  <Field int zzau>
		//    5    8:iastore         
		//    6    9:dup             
		//    7   10:iconst_1        
		//    8   11:getstatic       #26  <Field int zzav>
		//    9   14:iastore         
		//   10   15:dup             
		//   11   16:iconst_2        
		//   12   17:getstatic       #28  <Field int zzaw>
		//   13   20:iastore         
		//   14   21:dup             
		//   15   22:iconst_3        
		//   16   23:getstatic       #30  <Field int zzax>
		//   17   26:iastore         
		//   18   27:putstatic       #32  <Field int[] zzay>
		//*  19   30:return          
		}
	}


	GoogleSignInClient(Activity activity, GoogleSignInOptions googlesigninoptions)
	{
		super(activity, Auth.GOOGLE_SIGN_IN_API, ((com.google.android.gms.common.api.Api.ApiOptions) (googlesigninoptions)), ((com.google.android.gms.common.api.internal.StatusExceptionMapper) (new ApiExceptionMapper())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #38  <Field com.google.android.gms.common.api.Api Auth.GOOGLE_SIGN_IN_API>
	//    3    5:aload_2         
	//    4    6:new             #40  <Class ApiExceptionMapper>
	//    5    9:dup             
	//    6   10:invokespecial   #42  <Method void ApiExceptionMapper()>
	//    7   13:invokespecial   #45  <Method void GoogleApi(Activity, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper)>
	//    8   16:return          
	}

	GoogleSignInClient(Context context, GoogleSignInOptions googlesigninoptions)
	{
		super(context, Auth.GOOGLE_SIGN_IN_API, ((com.google.android.gms.common.api.Api.ApiOptions) (googlesigninoptions)), ((com.google.android.gms.common.api.internal.StatusExceptionMapper) (new ApiExceptionMapper())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #38  <Field com.google.android.gms.common.api.Api Auth.GOOGLE_SIGN_IN_API>
	//    3    5:aload_2         
	//    4    6:new             #40  <Class ApiExceptionMapper>
	//    5    9:dup             
	//    6   10:invokespecial   #42  <Method void ApiExceptionMapper()>
	//    7   13:invokespecial   #50  <Method void GoogleApi(Context, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper)>
	//    8   16:return          
	}

	private final int zze()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		Context context;
		GoogleApiAvailability googleapiavailability;
		if(zzas != zzd.zzau)
			break MISSING_BLOCK_LABEL_75;
	//    2    2:getstatic       #29  <Field int zzas>
	//    3    5:getstatic       #27  <Field int GoogleSignInClient$zzd.zzau>
	//    4    8:icmpne          75
		context = getApplicationContext();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #56  <Method Context getApplicationContext()>
	//    7   15:astore_2        
		googleapiavailability = GoogleApiAvailability.getInstance();
	//    8   16:invokestatic    #62  <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
	//    9   19:astore_3        
		i = googleapiavailability.isGooglePlayServicesAvailable(context, 0xbdfcb8);
	//   10   20:aload_3         
	//   11   21:aload_2         
	//   12   22:ldc1            #63  <Int 0xbdfcb8>
	//   13   24:invokevirtual   #67  <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(Context, int)>
	//   14   27:istore_1        
		if(i != 0)
			break MISSING_BLOCK_LABEL_41;
	//   15   28:iload_1         
	//   16   29:ifne            41
		zzas = zzd.zzax;
	//   17   32:getstatic       #70  <Field int GoogleSignInClient$zzd.zzax>
	//   18   35:putstatic       #29  <Field int zzas>
		break MISSING_BLOCK_LABEL_75;
	//   19   38:goto            75
		if(googleapiavailability.getErrorResolutionIntent(context, i, ((String) (null))) == null && DynamiteModule.getLocalVersion(context, "com.google.android.gms.auth.api.fallback") != 0)
	//*  20   41:aload_3         
	//*  21   42:aload_2         
	//*  22   43:iload_1         
	//*  23   44:aconst_null     
	//*  24   45:invokevirtual   #74  <Method Intent GoogleApiAvailability.getErrorResolutionIntent(Context, int, String)>
	//*  25   48:ifnonnull       69
	//*  26   51:aload_2         
	//*  27   52:ldc1            #76  <String "com.google.android.gms.auth.api.fallback">
	//*  28   54:invokestatic    #82  <Method int DynamiteModule.getLocalVersion(Context, String)>
	//*  29   57:ifeq            69
		{
			zzas = zzd.zzaw;
	//   30   60:getstatic       #85  <Field int GoogleSignInClient$zzd.zzaw>
	//   31   63:putstatic       #29  <Field int zzas>
			break MISSING_BLOCK_LABEL_75;
	//   32   66:goto            75
		}
		zzas = zzd.zzav;
	//   33   69:getstatic       #88  <Field int GoogleSignInClient$zzd.zzav>
	//   34   72:putstatic       #29  <Field int zzas>
		i = zzas;
	//   35   75:getstatic       #29  <Field int zzas>
	//   36   78:istore_1        
		this;
	//   37   79:aload_0         
		JVM INSTR monitorexit ;
	//   38   80:monitorexit     
		return i;
	//   39   81:iload_1         
	//   40   82:ireturn         
		Exception exception;
		exception;
	//   41   83:astore_2        
	//*  42   84:aload_0         
		throw exception;
	//   43   85:monitorexit     
	//   44   86:aload_2         
	//   45   87:athrow          
	}

	public Intent getSignInIntent()
	{
		Context context = getApplicationContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #56  <Method Context getApplicationContext()>
	//    2    4:astore_1        
		switch(com.google.android.gms.auth.api.signin.zzc.zzat[zze() - 1])
	//*   3    5:getstatic       #96  <Field int[] zzc.zzat>
	//*   4    8:aload_0         
	//*   5    9:invokespecial   #98  <Method int zze()>
	//*   6   12:iconst_1        
	//*   7   13:isub            
	//*   8   14:iaload          
		{
	//*   9   15:tableswitch     1 2: default 36
	//	               1 60
	//	               2 48
		default:
			return zzh.zze(context, (GoogleSignInOptions)getApiOptions());
	//   10   36:aload_1         
	//   11   37:aload_0         
	//   12   38:invokevirtual   #102 <Method com.google.android.gms.common.api.Api$ApiOptions getApiOptions()>
	//   13   41:checkcast       #104 <Class GoogleSignInOptions>
	//   14   44:invokestatic    #109 <Method Intent zzh.zze(Context, GoogleSignInOptions)>
	//   15   47:areturn         

		case 2: // '\002'
			return zzh.zzc(context, (GoogleSignInOptions)getApiOptions());
	//   16   48:aload_1         
	//   17   49:aload_0         
	//   18   50:invokevirtual   #102 <Method com.google.android.gms.common.api.Api$ApiOptions getApiOptions()>
	//   19   53:checkcast       #104 <Class GoogleSignInOptions>
	//   20   56:invokestatic    #111 <Method Intent zzh.zzc(Context, GoogleSignInOptions)>
	//   21   59:areturn         

		case 1: // '\001'
			return zzh.zzd(context, (GoogleSignInOptions)getApiOptions());
	//   22   60:aload_1         
	//   23   61:aload_0         
	//   24   62:invokevirtual   #102 <Method com.google.android.gms.common.api.Api$ApiOptions getApiOptions()>
	//   25   65:checkcast       #104 <Class GoogleSignInOptions>
	//   26   68:invokestatic    #113 <Method Intent zzh.zzd(Context, GoogleSignInOptions)>
	//   27   71:areturn         
		}
	}

	public Task revokeAccess()
	{
		com.google.android.gms.common.api.GoogleApiClient googleapiclient = asGoogleApiClient();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #120 <Method com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient()>
	//    2    4:astore_2        
		Context context = getApplicationContext();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #56  <Method Context getApplicationContext()>
	//    5    9:astore_3        
		boolean flag;
		if(zze() == zzd.zzaw)
	//*   6   10:aload_0         
	//*   7   11:invokespecial   #98  <Method int zze()>
	//*   8   14:getstatic       #85  <Field int GoogleSignInClient$zzd.zzaw>
	//*   9   17:icmpne          25
			flag = true;
	//   10   20:iconst_1        
	//   11   21:istore_1        
		else
	//*  12   22:goto            27
			flag = false;
	//   13   25:iconst_0        
	//   14   26:istore_1        
		return PendingResultUtil.toVoidTask(zzh.zzd(googleapiclient, context, flag));
	//   15   27:aload_2         
	//   16   28:aload_3         
	//   17   29:iload_1         
	//   18   30:invokestatic    #123 <Method com.google.android.gms.common.api.PendingResult zzh.zzd(com.google.android.gms.common.api.GoogleApiClient, Context, boolean)>
	//   19   33:invokestatic    #129 <Method Task PendingResultUtil.toVoidTask(com.google.android.gms.common.api.PendingResult)>
	//   20   36:areturn         
	}

	public Task signOut()
	{
		com.google.android.gms.common.api.GoogleApiClient googleapiclient = asGoogleApiClient();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #120 <Method com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient()>
	//    2    4:astore_2        
		Context context = getApplicationContext();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #56  <Method Context getApplicationContext()>
	//    5    9:astore_3        
		boolean flag;
		if(zze() == zzd.zzaw)
	//*   6   10:aload_0         
	//*   7   11:invokespecial   #98  <Method int zze()>
	//*   8   14:getstatic       #85  <Field int GoogleSignInClient$zzd.zzaw>
	//*   9   17:icmpne          25
			flag = true;
	//   10   20:iconst_1        
	//   11   21:istore_1        
		else
	//*  12   22:goto            27
			flag = false;
	//   13   25:iconst_0        
	//   14   26:istore_1        
		return PendingResultUtil.toVoidTask(zzh.zzc(googleapiclient, context, flag));
	//   15   27:aload_2         
	//   16   28:aload_3         
	//   17   29:iload_1         
	//   18   30:invokestatic    #134 <Method com.google.android.gms.common.api.PendingResult zzh.zzc(com.google.android.gms.common.api.GoogleApiClient, Context, boolean)>
	//   19   33:invokestatic    #129 <Method Task PendingResultUtil.toVoidTask(com.google.android.gms.common.api.PendingResult)>
	//   20   36:areturn         
	}

	public Task silentSignIn()
	{
		com.google.android.gms.common.api.GoogleApiClient googleapiclient = asGoogleApiClient();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #120 <Method com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient()>
	//    2    4:astore_2        
		Context context = getApplicationContext();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #56  <Method Context getApplicationContext()>
	//    5    9:astore_3        
		GoogleSignInOptions googlesigninoptions = (GoogleSignInOptions)getApiOptions();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #102 <Method com.google.android.gms.common.api.Api$ApiOptions getApiOptions()>
	//    8   14:checkcast       #104 <Class GoogleSignInOptions>
	//    9   17:astore          4
		boolean flag;
		if(zze() == zzd.zzaw)
	//*  10   19:aload_0         
	//*  11   20:invokespecial   #98  <Method int zze()>
	//*  12   23:getstatic       #85  <Field int GoogleSignInClient$zzd.zzaw>
	//*  13   26:icmpne          34
			flag = true;
	//   14   29:iconst_1        
	//   15   30:istore_1        
		else
	//*  16   31:goto            36
			flag = false;
	//   17   34:iconst_0        
	//   18   35:istore_1        
		return PendingResultUtil.toTask(((com.google.android.gms.common.api.PendingResult) (zzh.zzc(googleapiclient, context, googlesigninoptions, flag))), ((com.google.android.gms.common.internal.PendingResultUtil.ResultConverter) (zzar)));
	//   19   36:aload_2         
	//   20   37:aload_3         
	//   21   38:aload           4
	//   22   40:iload_1         
	//   23   41:invokestatic    #138 <Method com.google.android.gms.common.api.OptionalPendingResult zzh.zzc(com.google.android.gms.common.api.GoogleApiClient, Context, GoogleSignInOptions, boolean)>
	//   24   44:getstatic       #24  <Field GoogleSignInClient$zzc zzar>
	//   25   47:invokestatic    #142 <Method Task PendingResultUtil.toTask(com.google.android.gms.common.api.PendingResult, com.google.android.gms.common.internal.PendingResultUtil$ResultConverter)>
	//   26   50:areturn         
	}

	private static final zzc zzar = new zzc(((com.google.android.gms.auth.api.signin.zzc) (null)));
	private static int zzas;

	static 
	{
	//    0    0:new             #7   <Class GoogleSignInClient$zzc>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #22  <Method void GoogleSignInClient$zzc(zzc)>
	//    4    8:putstatic       #24  <Field GoogleSignInClient$zzc zzar>
		zzas = zzd.zzau;
	//    5   11:getstatic       #27  <Field int GoogleSignInClient$zzd.zzau>
	//    6   14:putstatic       #29  <Field int zzas>
	//*   7   17:return          
	}
}
