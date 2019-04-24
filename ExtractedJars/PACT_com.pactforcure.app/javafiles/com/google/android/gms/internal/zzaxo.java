// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;


public final class zzaxo
	implements com.google.android.gms.common.api.Api.ApiOptions.Optional
{
	public static final class zza
	{

		public zzaxo zzOj()
		{
			return new zzaxo(false, false, ((String) (null)), false, ((String) (null)), false, ((Long) (null)), ((Long) (null)));
		//    0    0:new             #6   <Class zzaxo>
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
		//   11   13:invokespecial   #17  <Method void zzaxo(boolean, boolean, String, boolean, String, boolean, Long, Long, zzaxo$1)>
		//   12   16:areturn         
		}

		public zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	private zzaxo(boolean flag, boolean flag1, String s, boolean flag2, String s1, boolean flag3, Long long1, 
			Long long2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		zzbCh = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #40  <Field boolean zzbCh>
		zzajh = flag1;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #42  <Field boolean zzajh>
		zzajk = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #44  <Field String zzajk>
		zzajj = flag2;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #46  <Field boolean zzajj>
		zzbCi = flag3;
	//   14   25:aload_0         
	//   15   26:iload           6
	//   16   28:putfield        #48  <Field boolean zzbCi>
		zzajl = s1;
	//   17   31:aload_0         
	//   18   32:aload           5
	//   19   34:putfield        #50  <Field String zzajl>
		zzbCj = long1;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #52  <Field Long zzbCj>
		zzbCk = long2;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #54  <Field Long zzbCk>
	//   26   49:return          
	}


	public boolean zzOf()
	{
		return zzbCh;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field boolean zzbCh>
	//    2    4:ireturn         
	}

	public boolean zzOg()
	{
		return zzbCi;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field boolean zzbCi>
	//    2    4:ireturn         
	}

	public Long zzOh()
	{
		return zzbCj;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Long zzbCj>
	//    2    4:areturn         
	}

	public Long zzOi()
	{
		return zzbCk;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Long zzbCk>
	//    2    4:areturn         
	}

	public boolean zzqK()
	{
		return zzajh;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field boolean zzajh>
	//    2    4:ireturn         
	}

	public boolean zzqM()
	{
		return zzajj;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field boolean zzajj>
	//    2    4:ireturn         
	}

	public String zzqN()
	{
		return zzajk;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String zzajk>
	//    2    4:areturn         
	}

	public String zzqO()
	{
		return zzajl;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String zzajl>
	//    2    4:areturn         
	}

	public static final zzaxo zzbCg = (new zza()).zzOj();
	private final boolean zzajh;
	private final boolean zzajj;
	private final String zzajk;
	private final String zzajl;
	private final boolean zzbCh;
	private final boolean zzbCi;
	private final Long zzbCj;
	private final Long zzbCk;

	static 
	{
	//    0    0:new             #10  <Class zzaxo$zza>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void zzaxo$zza()>
	//    3    7:invokevirtual   #33  <Method zzaxo zzaxo$zza.zzOj()>
	//    4   10:putstatic       #35  <Field zzaxo zzbCg>
	//*   5   13:return          
	}
}
