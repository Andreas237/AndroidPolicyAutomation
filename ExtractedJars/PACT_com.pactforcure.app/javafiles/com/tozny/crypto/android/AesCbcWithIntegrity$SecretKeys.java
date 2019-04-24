// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.tozny.crypto.android;

import android.util.Base64;
import javax.crypto.SecretKey;

// Referenced classes of package com.tozny.crypto.android:
//			AesCbcWithIntegrity

public static class AesCbcWithIntegrity$SecretKeys
{

	public boolean equals(Object obj)
	{
		if(this != obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
				return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
			if(((Object)this).getClass() != obj.getClass())
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #29  <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #29  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
				return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
			obj = ((Object) ((AesCbcWithIntegrity$SecretKeys)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class AesCbcWithIntegrity$SecretKeys>
	//   18   30:astore_1        
			if(!((Object) (integrityKey)).equals(((Object) (((AesCbcWithIntegrity$SecretKeys) (obj)).integrityKey))))
	//*  19   31:aload_0         
	//*  20   32:getfield        #31  <Field SecretKey integrityKey>
	//*  21   35:aload_1         
	//*  22   36:getfield        #31  <Field SecretKey integrityKey>
	//*  23   39:invokevirtual   #33  <Method boolean Object.equals(Object)>
	//*  24   42:ifne            47
				return false;
	//   25   45:iconst_0        
	//   26   46:ireturn         
			if(!((Object) (confidentialityKey)).equals(((Object) (((AesCbcWithIntegrity$SecretKeys) (obj)).confidentialityKey))))
	//*  27   47:aload_0         
	//*  28   48:getfield        #35  <Field SecretKey confidentialityKey>
	//*  29   51:aload_1         
	//*  30   52:getfield        #35  <Field SecretKey confidentialityKey>
	//*  31   55:invokevirtual   #33  <Method boolean Object.equals(Object)>
	//*  32   58:ifne            5
				return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
		}
		return true;
	}

	public SecretKey getConfidentialityKey()
	{
		return confidentialityKey;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field SecretKey confidentialityKey>
	//    2    4:areturn         
	}

	public SecretKey getIntegrityKey()
	{
		return integrityKey;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field SecretKey integrityKey>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return (((Object) (confidentialityKey)).hashCode() + 31) * 31 + ((Object) (integrityKey)).hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field SecretKey confidentialityKey>
	//    2    4:invokevirtual   #42  <Method int Object.hashCode()>
	//    3    7:bipush          31
	//    4    9:iadd            
	//    5   10:bipush          31
	//    6   12:imul            
	//    7   13:aload_0         
	//    8   14:getfield        #31  <Field SecretKey integrityKey>
	//    9   17:invokevirtual   #42  <Method int Object.hashCode()>
	//   10   20:iadd            
	//   11   21:ireturn         
	}

	public void setConfidentialityKey(SecretKey secretkey)
	{
		confidentialityKey = secretkey;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field SecretKey confidentialityKey>
	//    3    5:return          
	}

	public void setIntegrityKey(SecretKey secretkey)
	{
		integrityKey = secretkey;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field SecretKey integrityKey>
	//    3    5:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append(Base64.encodeToString(getConfidentialityKey().getEncoded(), 2)).append(":").append(Base64.encodeToString(getIntegrityKey().getEncoded(), 2)).toString();
	//    0    0:new             #46  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #47  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #49  <Method SecretKey getConfidentialityKey()>
	//    5   11:invokeinterface #55  <Method byte[] SecretKey.getEncoded()>
	//    6   16:iconst_2        
	//    7   17:invokestatic    #61  <Method String Base64.encodeToString(byte[], int)>
	//    8   20:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//    9   23:ldc1            #67  <String ":">
	//   10   25:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   11   28:aload_0         
	//   12   29:invokevirtual   #69  <Method SecretKey getIntegrityKey()>
	//   13   32:invokeinterface #55  <Method byte[] SecretKey.getEncoded()>
	//   14   37:iconst_2        
	//   15   38:invokestatic    #61  <Method String Base64.encodeToString(byte[], int)>
	//   16   41:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   17   44:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   18   47:areturn         
	}

	private SecretKey confidentialityKey;
	private SecretKey integrityKey;

	public AesCbcWithIntegrity$SecretKeys(SecretKey secretkey, SecretKey secretkey1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		setConfidentialityKey(secretkey);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #19  <Method void setConfidentialityKey(SecretKey)>
		setIntegrityKey(secretkey1);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #22  <Method void setIntegrityKey(SecretKey)>
	//    8   14:return          
	}
}
