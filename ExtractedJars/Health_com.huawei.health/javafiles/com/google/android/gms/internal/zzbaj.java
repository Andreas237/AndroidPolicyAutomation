// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;


public final class zzbaj
	implements com.google.android.gms.common.api.Api.ApiOptions.Optional
{
	public static final class zza
	{

		public zzbaj zzPO()
		{
			return new zzbaj(false, false, ((String) (null)), false, ((String) (null)), false, ((Long) (null)), ((Long) (null)));
		//    0    0:new             #6   <Class zzbaj>
		//    1    3:dup             
		//    2    4:iconst_0        
		//    3    5:iconst_0        
		//    4    6:aconst_null     
		//    5    7:iconst_0        
		//    6    8:aconst_null     
		//    7    9:iconst_0        
		//    8   10:aconst_null     
		//    9   11:aconst_null     
		//   10   12:aconst_null     
		//   11   13:invokespecial   #17  <Method void zzbaj(boolean, boolean, String, boolean, String, boolean, Long, Long, zzbaj$1)>
		//   12   16:areturn         
		}

		public zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	private zzbaj(boolean flag, boolean flag1, String s, boolean flag2, String s1, boolean flag3, Long long1, 
			Long long2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		zzbEj = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #40  <Field boolean zzbEj>
		zzajv = flag1;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #42  <Field boolean zzajv>
		zzajw = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #44  <Field String zzajw>
		zzakm = flag2;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #46  <Field boolean zzakm>
		zzbEk = flag3;
	//   14   25:aload_0         
	//   15   26:iload           6
	//   16   28:putfield        #48  <Field boolean zzbEk>
		zzakn = s1;
	//   17   31:aload_0         
	//   18   32:aload           5
	//   19   34:putfield        #50  <Field String zzakn>
		zzbEl = long1;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #52  <Field Long zzbEl>
		zzbEm = long2;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #54  <Field Long zzbEm>
	//   26   49:return          
	}


	public String getServerClientId()
	{
		return zzajw;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String zzajw>
	//    2    4:areturn         
	}

	public boolean isIdTokenRequested()
	{
		return zzajv;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field boolean zzajv>
	//    2    4:ireturn         
	}

	public boolean zzPK()
	{
		return zzbEj;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field boolean zzbEj>
	//    2    4:ireturn         
	}

	public boolean zzPL()
	{
		return zzbEk;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field boolean zzbEk>
	//    2    4:ireturn         
	}

	public Long zzPM()
	{
		return zzbEl;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Long zzbEl>
	//    2    4:areturn         
	}

	public Long zzPN()
	{
		return zzbEm;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Long zzbEm>
	//    2    4:areturn         
	}

	public boolean zzrl()
	{
		return zzakm;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field boolean zzakm>
	//    2    4:ireturn         
	}

	public String zzrm()
	{
		return zzakn;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String zzakn>
	//    2    4:areturn         
	}

	public static final zzbaj zzbEi = (new zza()).zzPO();
	private final boolean zzajv;
	private final String zzajw;
	private final boolean zzakm;
	private final String zzakn;
	private final boolean zzbEj;
	private final boolean zzbEk;
	private final Long zzbEl;
	private final Long zzbEm;

	static 
	{
	//    0    0:new             #10  <Class zzbaj$zza>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void zzbaj$zza()>
	//    3    7:invokevirtual   #33  <Method zzbaj zzbaj$zza.zzPO()>
	//    4   10:putstatic       #35  <Field zzbaj zzbEi>
	//*   5   13:return          
	}
}
