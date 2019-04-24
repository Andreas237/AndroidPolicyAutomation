// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaue, zzayq, zzayw, zzayn

public final class zzayo
	implements zzaue
{

	public zzayo(ECPrivateKey ecprivatekey, byte abyte0[], String s, zzayw zzayw, zzayn zzayn)
		throws GeneralSecurityException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		zzdnc = ecprivatekey;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field ECPrivateKey zzdnc>
		zzdnd = new zzayq(ecprivatekey);
	//    5    9:aload_0         
	//    6   10:new             #34  <Class zzayq>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #37  <Method void zzayq(ECPrivateKey)>
	//   10   18:putfield        #39  <Field zzayq zzdnd>
		zzdnf = abyte0;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #41  <Field byte[] zzdnf>
		zzdne = s;
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:putfield        #43  <Field String zzdne>
		zzdng = zzayw;
	//   17   31:aload_0         
	//   18   32:aload           4
	//   19   34:putfield        #45  <Field zzayw zzdng>
		zzdnh = zzayn;
	//   20   37:aload_0         
	//   21   38:aload           5
	//   22   40:putfield        #47  <Field zzayn zzdnh>
	//   23   43:return          
	}

	private static final byte zzdhv[] = new byte[0];
	private final ECPrivateKey zzdnc;
	private final zzayq zzdnd;
	private final String zzdne;
	private final byte zzdnf[];
	private final zzayw zzdng;
	private final zzayn zzdnh;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:newarray        byte[]
	//    2    3:putstatic       #23  <Field byte[] zzdhv>
	//*   3    6:return          
	}
}
