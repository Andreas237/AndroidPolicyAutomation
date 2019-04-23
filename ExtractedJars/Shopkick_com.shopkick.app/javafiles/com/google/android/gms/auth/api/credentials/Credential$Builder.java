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
		return new Credential(mId, mName, zzo, zzp, zzq, zzr, zzs, zzt);
	//    0    0:new             #6   <Class Credential>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field String mId>
	//    4    8:aload_0         
	//    5    9:getfield        #35  <Field String mName>
	//    6   12:aload_0         
	//    7   13:getfield        #41  <Field Uri zzo>
	//    8   16:aload_0         
	//    9   17:getfield        #47  <Field List zzp>
	//   10   20:aload_0         
	//   11   21:getfield        #52  <Field String zzq>
	//   12   24:aload_0         
	//   13   25:getfield        #57  <Field String zzr>
	//   14   28:aload_0         
	//   15   29:getfield        #62  <Field String zzs>
	//   16   32:aload_0         
	//   17   33:getfield        #67  <Field String zzt>
	//   18   36:invokespecial   #74  <Method void Credential(String, String, Uri, List, String, String, String, String)>
	//   19   39:areturn         
	}

	public Credential$Builder setAccountType(String s)
	{
		zzr = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field String zzr>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Credential$Builder setName(String s)
	{
		mName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field String mName>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Credential$Builder setPassword(String s)
	{
		zzq = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field String zzq>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Credential$Builder setProfilePictureUri(Uri uri)
	{
		zzo = uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field Uri zzo>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private final String mId;
	private String mName;
	private Uri zzo;
	private List zzp;
	private String zzq;
	private String zzr;
	private String zzs;
	private String zzt;

	public Credential$Builder(Credential credential)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		mId = Credential.zzc(credential);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #28  <Method String Credential.zzc(Credential)>
	//    5    9:putfield        #30  <Field String mId>
		mName = Credential.zzd(credential);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #33  <Method String Credential.zzd(Credential)>
	//    9   17:putfield        #35  <Field String mName>
		zzo = Credential.zze(credential);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #39  <Method Uri Credential.zze(Credential)>
	//   13   25:putfield        #41  <Field Uri zzo>
		zzp = Credential.zzf(credential);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #45  <Method List Credential.zzf(Credential)>
	//   17   33:putfield        #47  <Field List zzp>
		zzq = Credential.zzg(credential);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokestatic    #50  <Method String Credential.zzg(Credential)>
	//   21   41:putfield        #52  <Field String zzq>
		zzr = Credential.zzh(credential);
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokestatic    #55  <Method String Credential.zzh(Credential)>
	//   25   49:putfield        #57  <Field String zzr>
		zzs = Credential.zzi(credential);
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokestatic    #60  <Method String Credential.zzi(Credential)>
	//   29   57:putfield        #62  <Field String zzs>
		zzt = Credential.zzj(credential);
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:invokestatic    #65  <Method String Credential.zzj(Credential)>
	//   33   65:putfield        #67  <Field String zzt>
	//   34   68:return          
	}

	public Credential$Builder(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		mId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field String mId>
	//    5    9:return          
	}
}
