// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.internal.zzi;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//			zzd, GoogleSignInOptions, GoogleSignInResult

public class GoogleSignInClient extends GoogleApi
{
	private static final class zzd
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

		private zzd()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}

		zzd(com.google.android.gms.auth.api.signin.zzd zzd1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void GoogleSignInClient$zzd()>
		//    2    4:return          
		}
	}

	static final class zze
	{

		public static int[] values$50KLMJ33DTMIUPRFDTJMOP9FC5N68SJFD5I2UPRDECNM2TBKD0NM2S395TPMIPRED5N2UHRFDTJMOPAJD5JMSIBE8DM6IPBEEGI4IRBGDHIMQPBEEHGN8QBFDOTG____0()
		{
			return (int[])((int []) (zzem)).clone();
		//    0    0:getstatic       #32  <Field int[] zzem>
		//    1    3:invokevirtual   #40  <Method Object _5B_I.clone()>
		//    2    6:checkcast       #36  <Class int[]>
		//    3    9:areturn         
		}

		public static final int zzei = 1;
		public static final int zzej = 2;
		public static final int zzek = 3;
		public static final int zzel = 4;
		private static final int zzem[] = {
			zzei, zzej, zzek, zzel
		};

		static 
		{
		//    0    0:iconst_4        
		//    1    1:newarray        int[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:getstatic       #24  <Field int zzei>
		//    5    8:iastore         
		//    6    9:dup             
		//    7   10:iconst_1        
		//    8   11:getstatic       #26  <Field int zzej>
		//    9   14:iastore         
		//   10   15:dup             
		//   11   16:iconst_2        
		//   12   17:getstatic       #28  <Field int zzek>
		//   13   20:iastore         
		//   14   21:dup             
		//   15   22:iconst_3        
		//   16   23:getstatic       #30  <Field int zzel>
		//   17   26:iastore         
		//   18   27:putstatic       #32  <Field int[] zzem>
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

	private final int zzl()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		Context context;
		GoogleApiAvailability googleapiavailability;
		if(zzeg != zze.zzei)
			break MISSING_BLOCK_LABEL_76;
	//    2    2:getstatic       #29  <Field int zzeg>
	//    3    5:getstatic       #27  <Field int GoogleSignInClient$zze.zzei>
	//    4    8:icmpne          76
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
		if(i != 0) goto _L2; else goto _L1
	//   15   28:iload_1         
	//   16   29:ifne            43
_L1:
		i = zze.zzel;
	//   17   32:getstatic       #70  <Field int GoogleSignInClient$zze.zzel>
	//   18   35:istore_1        
_L3:
		zzeg = i;
	//   19   36:iload_1         
	//   20   37:putstatic       #29  <Field int zzeg>
		break MISSING_BLOCK_LABEL_76;
	//   21   40:goto            76
_L2:
label0:
		{
			if(googleapiavailability.getErrorResolutionIntent(context, i, ((String) (null))) != null || DynamiteModule.getLocalVersion(context, "com.google.android.gms.auth.api.fallback") == 0)
				break label0;
	//   22   43:aload_3         
	//   23   44:aload_2         
	//   24   45:iload_1         
	//   25   46:aconst_null     
	//   26   47:invokevirtual   #74  <Method Intent GoogleApiAvailability.getErrorResolutionIntent(Context, int, String)>
	//   27   50:ifnonnull       69
	//   28   53:aload_2         
	//   29   54:ldc1            #76  <String "com.google.android.gms.auth.api.fallback">
	//   30   56:invokestatic    #82  <Method int DynamiteModule.getLocalVersion(Context, String)>
	//   31   59:ifeq            69
			i = zze.zzek;
	//   32   62:getstatic       #85  <Field int GoogleSignInClient$zze.zzek>
	//   33   65:istore_1        
		}
		  goto _L3
	//*  34   66:goto            36
		i = zze.zzej;
	//   35   69:getstatic       #88  <Field int GoogleSignInClient$zze.zzej>
	//   36   72:istore_1        
		  goto _L3
	//*  37   73:goto            36
		i = zzeg;
	//   38   76:getstatic       #29  <Field int zzeg>
	//   39   79:istore_1        
		this;
	//   40   80:aload_0         
		JVM INSTR monitorexit ;
	//   41   81:monitorexit     
		return i;
	//   42   82:iload_1         
	//   43   83:ireturn         
		Exception exception;
		exception;
	//   44   84:astore_2        
	//*  45   85:aload_0         
		throw exception;
	//   46   86:monitorexit     
	//   47   87:aload_2         
	//   48   88:athrow          
	}

	public Intent getSignInIntent()
	{
		Context context = getApplicationContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #56  <Method Context getApplicationContext()>
	//    2    4:astore_1        
		switch(com.google.android.gms.auth.api.signin.zzd.zzeh[zzl() - 1])
	//*   3    5:getstatic       #96  <Field int[] zzd.zzeh>
	//*   4    8:aload_0         
	//*   5    9:invokespecial   #98  <Method int zzl()>
	//*   6   12:iconst_1        
	//*   7   13:isub            
	//*   8   14:iaload          
		{
	//*   9   15:tableswitch     1 2: default 36
	//	               1 60
	//	               2 48
		default:
			return zzi.zzf(context, (GoogleSignInOptions)getApiOptions());
	//   10   36:aload_1         
	//   11   37:aload_0         
	//   12   38:invokevirtual   #102 <Method com.google.android.gms.common.api.Api$ApiOptions getApiOptions()>
	//   13   41:checkcast       #104 <Class GoogleSignInOptions>
	//   14   44:invokestatic    #110 <Method Intent zzi.zzf(Context, GoogleSignInOptions)>
	//   15   47:areturn         

		case 2: // '\002'
			return zzi.zzd(context, (GoogleSignInOptions)getApiOptions());
	//   16   48:aload_1         
	//   17   49:aload_0         
	//   18   50:invokevirtual   #102 <Method com.google.android.gms.common.api.Api$ApiOptions getApiOptions()>
	//   19   53:checkcast       #104 <Class GoogleSignInOptions>
	//   20   56:invokestatic    #112 <Method Intent zzi.zzd(Context, GoogleSignInOptions)>
	//   21   59:areturn         

		case 1: // '\001'
			return zzi.zze(context, (GoogleSignInOptions)getApiOptions());
	//   22   60:aload_1         
	//   23   61:aload_0         
	//   24   62:invokevirtual   #102 <Method com.google.android.gms.common.api.Api$ApiOptions getApiOptions()>
	//   25   65:checkcast       #104 <Class GoogleSignInOptions>
	//   26   68:invokestatic    #114 <Method Intent zzi.zze(Context, GoogleSignInOptions)>
	//   27   71:areturn         
		}
	}

	public Task revokeAccess()
	{
		com.google.android.gms.common.api.GoogleApiClient googleapiclient = asGoogleApiClient();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #121 <Method com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient()>
	//    2    4:astore_2        
		Context context = getApplicationContext();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #56  <Method Context getApplicationContext()>
	//    5    9:astore_3        
		boolean flag;
		if(zzl() == zze.zzek)
	//*   6   10:aload_0         
	//*   7   11:invokespecial   #98  <Method int zzl()>
	//*   8   14:getstatic       #85  <Field int GoogleSignInClient$zze.zzek>
	//*   9   17:icmpne          25
			flag = true;
	//   10   20:iconst_1        
	//   11   21:istore_1        
		else
	//*  12   22:goto            27
			flag = false;
	//   13   25:iconst_0        
	//   14   26:istore_1        
		return PendingResultUtil.toVoidTask(zzi.zze(googleapiclient, context, flag));
	//   15   27:aload_2         
	//   16   28:aload_3         
	//   17   29:iload_1         
	//   18   30:invokestatic    #124 <Method com.google.android.gms.common.api.PendingResult zzi.zze(com.google.android.gms.common.api.GoogleApiClient, Context, boolean)>
	//   19   33:invokestatic    #130 <Method Task PendingResultUtil.toVoidTask(com.google.android.gms.common.api.PendingResult)>
	//   20   36:areturn         
	}

	public Task signOut()
	{
		com.google.android.gms.common.api.GoogleApiClient googleapiclient = asGoogleApiClient();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #121 <Method com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient()>
	//    2    4:astore_2        
		Context context = getApplicationContext();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #56  <Method Context getApplicationContext()>
	//    5    9:astore_3        
		boolean flag;
		if(zzl() == zze.zzek)
	//*   6   10:aload_0         
	//*   7   11:invokespecial   #98  <Method int zzl()>
	//*   8   14:getstatic       #85  <Field int GoogleSignInClient$zze.zzek>
	//*   9   17:icmpne          25
			flag = true;
	//   10   20:iconst_1        
	//   11   21:istore_1        
		else
	//*  12   22:goto            27
			flag = false;
	//   13   25:iconst_0        
	//   14   26:istore_1        
		return PendingResultUtil.toVoidTask(zzi.zzd(googleapiclient, context, flag));
	//   15   27:aload_2         
	//   16   28:aload_3         
	//   17   29:iload_1         
	//   18   30:invokestatic    #135 <Method com.google.android.gms.common.api.PendingResult zzi.zzd(com.google.android.gms.common.api.GoogleApiClient, Context, boolean)>
	//   19   33:invokestatic    #130 <Method Task PendingResultUtil.toVoidTask(com.google.android.gms.common.api.PendingResult)>
	//   20   36:areturn         
	}

	public Task silentSignIn()
	{
		com.google.android.gms.common.api.GoogleApiClient googleapiclient = asGoogleApiClient();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #121 <Method com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient()>
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
		if(zzl() == zze.zzek)
	//*  10   19:aload_0         
	//*  11   20:invokespecial   #98  <Method int zzl()>
	//*  12   23:getstatic       #85  <Field int GoogleSignInClient$zze.zzek>
	//*  13   26:icmpne          34
			flag = true;
	//   14   29:iconst_1        
	//   15   30:istore_1        
		else
	//*  16   31:goto            36
			flag = false;
	//   17   34:iconst_0        
	//   18   35:istore_1        
		return PendingResultUtil.toTask(((com.google.android.gms.common.api.PendingResult) (zzi.zzd(googleapiclient, context, googlesigninoptions, flag))), ((com.google.android.gms.common.internal.PendingResultUtil.ResultConverter) (zzef)));
	//   19   36:aload_2         
	//   20   37:aload_3         
	//   21   38:aload           4
	//   22   40:iload_1         
	//   23   41:invokestatic    #139 <Method com.google.android.gms.common.api.OptionalPendingResult zzi.zzd(com.google.android.gms.common.api.GoogleApiClient, Context, GoogleSignInOptions, boolean)>
	//   24   44:getstatic       #24  <Field GoogleSignInClient$zzd zzef>
	//   25   47:invokestatic    #143 <Method Task PendingResultUtil.toTask(com.google.android.gms.common.api.PendingResult, com.google.android.gms.common.internal.PendingResultUtil$ResultConverter)>
	//   26   50:areturn         
	}

	private static final zzd zzef = new zzd(((com.google.android.gms.auth.api.signin.zzd) (null)));
	private static int zzeg;

	static 
	{
	//    0    0:new             #7   <Class GoogleSignInClient$zzd>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #22  <Method void GoogleSignInClient$zzd(zzd)>
	//    4    8:putstatic       #24  <Field GoogleSignInClient$zzd zzef>
		zzeg = zze.zzei;
	//    5   11:getstatic       #27  <Field int GoogleSignInClient$zze.zzei>
	//    6   14:putstatic       #29  <Field int zzeg>
	//*   7   17:return          
	}
}
