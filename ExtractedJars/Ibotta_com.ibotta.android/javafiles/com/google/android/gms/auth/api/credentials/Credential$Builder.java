// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//			Credential

public static class Credential$Builder
{

	public Credential build()
	{
		return new Credential(zzci, mName, zzcj, zzck, zzcl, zzbx, zzcm, zzcn, zzco, zzcp);
	//    0    0:new             #6   <Class Credential>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field String zzci>
	//    4    8:aload_0         
	//    5    9:getfield        #37  <Field String mName>
	//    6   12:aload_0         
	//    7   13:getfield        #43  <Field Uri zzcj>
	//    8   16:aload_0         
	//    9   17:getfield        #49  <Field List zzck>
	//   10   20:aload_0         
	//   11   21:getfield        #54  <Field String zzcl>
	//   12   24:aload_0         
	//   13   25:getfield        #59  <Field String zzbx>
	//   14   28:aload_0         
	//   15   29:getfield        #64  <Field String zzcm>
	//   16   32:aload_0         
	//   17   33:getfield        #69  <Field String zzcn>
	//   18   36:aload_0         
	//   19   37:getfield        #74  <Field String zzco>
	//   20   40:aload_0         
	//   21   41:getfield        #79  <Field String zzcp>
	//   22   44:invokespecial   #86  <Method void Credential(String, String, Uri, List, String, String, String, String, String, String)>
	//   23   47:areturn         
	}

	public Credential$Builder setAccountType(String s)
	{
		zzbx = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #59  <Field String zzbx>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Credential$Builder setName(String s)
	{
		mName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field String mName>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Credential$Builder setPassword(String s)
	{
		zzcl = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field String zzcl>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Credential$Builder setProfilePictureUri(Uri uri)
	{
		zzcj = uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field Uri zzcj>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private String mName;
	private String zzbx;
	private final String zzci;
	private Uri zzcj;
	private List zzck;
	private String zzcl;
	private String zzcm;
	private String zzcn;
	private String zzco;
	private String zzcp;

	public Credential$Builder(Credential credential)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		zzci = Credential.zzd(credential);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #30  <Method String Credential.zzd(Credential)>
	//    5    9:putfield        #32  <Field String zzci>
		mName = Credential.zze(credential);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #35  <Method String Credential.zze(Credential)>
	//    9   17:putfield        #37  <Field String mName>
		zzcj = Credential.zzf(credential);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #41  <Method Uri Credential.zzf(Credential)>
	//   13   25:putfield        #43  <Field Uri zzcj>
		zzck = Credential.zzg(credential);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #47  <Method List Credential.zzg(Credential)>
	//   17   33:putfield        #49  <Field List zzck>
		zzcl = Credential.zzh(credential);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokestatic    #52  <Method String Credential.zzh(Credential)>
	//   21   41:putfield        #54  <Field String zzcl>
		zzbx = Credential.zzi(credential);
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokestatic    #57  <Method String Credential.zzi(Credential)>
	//   25   49:putfield        #59  <Field String zzbx>
		zzcm = Credential.zzj(credential);
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokestatic    #62  <Method String Credential.zzj(Credential)>
	//   29   57:putfield        #64  <Field String zzcm>
		zzcn = Credential.zzk(credential);
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:invokestatic    #67  <Method String Credential.zzk(Credential)>
	//   33   65:putfield        #69  <Field String zzcn>
		zzco = Credential.zzl(credential);
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:invokestatic    #72  <Method String Credential.zzl(Credential)>
	//   37   73:putfield        #74  <Field String zzco>
		zzcp = Credential.zzm(credential);
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:invokestatic    #77  <Method String Credential.zzm(Credential)>
	//   41   81:putfield        #79  <Field String zzcp>
	//   42   84:return          
	}

	public Credential$Builder(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		zzci = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field String zzci>
	//    5    9:return          
	}
}
