// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.libs;

import cn.com.fmsh.nfcos.client.libs.core.NfcosClientManagerImpl;

// Referenced classes of package cn.com.fmsh.nfcos.client.libs:
//			NfcosClientManager

public class NfcosClientManagerFactory
{

	private NfcosClientManagerFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static NfcosClientManager getNfcosClientManager()
	{
		if(nfcosClientManager == null)
	//*   0    0:getstatic       #15  <Field NfcosClientManagerImpl nfcosClientManager>
	//*   1    3:ifnonnull       22
		{
			nfcosClientManager = new NfcosClientManagerImpl();
	//    2    6:new             #17  <Class NfcosClientManagerImpl>
	//    3    9:dup             
	//    4   10:invokespecial   #18  <Method void NfcosClientManagerImpl()>
	//    5   13:putstatic       #15  <Field NfcosClientManagerImpl nfcosClientManager>
			nfcosClientManager.init();
	//    6   16:getstatic       #15  <Field NfcosClientManagerImpl nfcosClientManager>
	//    7   19:invokevirtual   #21  <Method void NfcosClientManagerImpl.init()>
		}
		return ((NfcosClientManager) (nfcosClientManager));
	//    8   22:getstatic       #15  <Field NfcosClientManagerImpl nfcosClientManager>
	//    9   25:areturn         
	}

	private static NfcosClientManagerImpl nfcosClientManager;
}
