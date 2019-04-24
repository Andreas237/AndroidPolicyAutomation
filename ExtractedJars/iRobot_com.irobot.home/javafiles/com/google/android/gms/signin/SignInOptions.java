// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.signin;


public final class SignInOptions
	implements com.google.android.gms.common.api.Api.ApiOptions.Optional
{
	public static final class zaa
	{

		public zaa()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	private SignInOptions(boolean flag, boolean flag1, String s, boolean flag2, String s1, boolean flag3, Long long1, 
			Long long2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #36  <Field boolean zars>
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #38  <Field boolean zay>
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #40  <Field String zaab>
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #42  <Field boolean zaaa>
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #44  <Field boolean zart>
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #46  <Field String zaac>
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #48  <Field Long zaru>
	//   23   39:aload_0         
	//   24   40:aconst_null     
	//   25   41:putfield        #50  <Field Long zarv>
	//   26   44:return          
	}

	public final Long getAuthApiSignInModuleVersion()
	{
		return zaru;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Long zaru>
	//    2    4:areturn         
	}

	public final String getHostedDomain()
	{
		return zaac;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String zaac>
	//    2    4:areturn         
	}

	public final Long getRealClientLibraryVersion()
	{
		return zarv;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Long zarv>
	//    2    4:areturn         
	}

	public final String getServerClientId()
	{
		return zaab;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String zaab>
	//    2    4:areturn         
	}

	public final boolean isForceCodeForRefreshToken()
	{
		return zaaa;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field boolean zaaa>
	//    2    4:ireturn         
	}

	public final boolean isIdTokenRequested()
	{
		return zay;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field boolean zay>
	//    2    4:ireturn         
	}

	public final boolean isOfflineAccessRequested()
	{
		return zars;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean zars>
	//    2    4:ireturn         
	}

	public final boolean waitForAccessTokenRefresh()
	{
		return zart;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field boolean zart>
	//    2    4:ireturn         
	}

	public static final SignInOptions DEFAULT = new SignInOptions(false, false, ((String) (null)), false, ((String) (null)), false, ((Long) (null)), ((Long) (null)));
	private final boolean zaaa = false;
	private final String zaab = null;
	private final String zaac = null;
	private final boolean zars = false;
	private final boolean zart = false;
	private final Long zaru = null;
	private final Long zarv = null;
	private final boolean zay = false;

	static 
	{
		new zaa();
	//    0    0:new             #8   <Class SignInOptions$zaa>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void SignInOptions$zaa()>
	//    3    7:pop             
	//    4    8:new             #2   <Class SignInOptions>
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:iconst_0        
	//    8   14:aconst_null     
	//    9   15:iconst_0        
	//   10   16:aconst_null     
	//   11   17:iconst_0        
	//   12   18:aconst_null     
	//   13   19:aconst_null     
	//   14   20:invokespecial   #30  <Method void SignInOptions(boolean, boolean, String, boolean, String, boolean, Long, Long)>
	//   15   23:putstatic       #32  <Field SignInOptions DEFAULT>
	//*  16   26:return          
	}
}
