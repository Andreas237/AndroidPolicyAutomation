// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import com.itextpdf.text.ExceptionConverter;
import java.io.File;
import java.io.FileInputStream;
import java.security.KeyStore;

public class KeyStoreUtil
{

	public KeyStoreUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static KeyStore loadCacertsKeyStore()
	{
		return loadCacertsKeyStore(((String) (null)));
	//    0    0:aconst_null     
	//    1    1:invokestatic    #14  <Method KeyStore loadCacertsKeyStore(String)>
	//    2    4:areturn         
	}

	public static KeyStore loadCacertsKeyStore(String s)
	{
		Exception exception;
		Object obj;
		Object obj1;
		obj = ((Object) (new File(new File(new File(System.getProperty("java.home"), "lib"), "security"), "cacerts")));
	//    0    0:new             #18  <Class File>
	//    1    3:dup             
	//    2    4:new             #18  <Class File>
	//    3    7:dup             
	//    4    8:new             #18  <Class File>
	//    5   11:dup             
	//    6   12:ldc1            #20  <String "java.home">
	//    7   14:invokestatic    #26  <Method String System.getProperty(String)>
	//    8   17:ldc1            #28  <String "lib">
	//    9   19:invokespecial   #31  <Method void File(String, String)>
	//   10   22:ldc1            #33  <String "security">
	//   11   24:invokespecial   #36  <Method void File(File, String)>
	//   12   27:ldc1            #38  <String "cacerts">
	//   13   29:invokespecial   #36  <Method void File(File, String)>
	//   14   32:astore_2        
		exception = null;
	//   15   33:aconst_null     
	//   16   34:astore_1        
		obj1 = null;
	//   17   35:aconst_null     
	//   18   36:astore_3        
		obj = ((Object) (new FileInputStream(((File) (obj)))));
	//   19   37:new             #40  <Class FileInputStream>
	//   20   40:dup             
	//   21   41:aload_2         
	//   22   42:invokespecial   #43  <Method void FileInputStream(File)>
	//   23   45:astore_2        
		if(s != null)
			break MISSING_BLOCK_LABEL_72;
	//   24   46:aload_0         
	//   25   47:ifnonnull       72
		s = ((String) (KeyStore.getInstance("JKS")));
	//   26   50:ldc1            #45  <String "JKS">
	//   27   52:invokestatic    #50  <Method KeyStore KeyStore.getInstance(String)>
	//   28   55:astore_0        
_L1:
		((KeyStore) (s)).load(((java.io.InputStream) (obj)), ((char []) (null)));
	//   29   56:aload_0         
	//   30   57:aload_2         
	//   31   58:aconst_null     
	//   32   59:invokevirtual   #54  <Method void KeyStore.load(java.io.InputStream, char[])>
		if(obj != null)
	//*  33   62:aload_2         
	//*  34   63:ifnull          70
			try
			{
				((FileInputStream) (obj)).close();
	//   35   66:aload_2         
	//   36   67:invokevirtual   #57  <Method void FileInputStream.close()>
			}
	//*  37   70:aload_0         
	//*  38   71:areturn         
	//*  39   72:ldc1            #45  <String "JKS">
	//*  40   74:aload_0         
	//*  41   75:invokestatic    #60  <Method KeyStore KeyStore.getInstance(String, String)>
	//*  42   78:astore_0        
	//*  43   79:goto            56
	//*  44   82:astore_0        
	//*  45   83:aload_3         
	//*  46   84:astore_1        
	//*  47   85:new             #62  <Class ExceptionConverter>
	//*  48   88:dup             
	//*  49   89:aload_0         
	//*  50   90:invokespecial   #65  <Method void ExceptionConverter(Exception)>
	//*  51   93:athrow          
	//*  52   94:astore_0        
	//*  53   95:aload_1         
	//*  54   96:ifnull          103
	//*  55   99:aload_1         
	//*  56  100:invokevirtual   #57  <Method void FileInputStream.close()>
	//*  57  103:aload_0         
	//*  58  104:athrow          
			// Misplaced declaration of an exception variable
			catch(Exception exception)
	//*  59  105:astore_1        
			{
				return ((KeyStore) (s));
	//   60  106:aload_0         
	//   61  107:areturn         
			}
		return ((KeyStore) (s));
		s = ((String) (KeyStore.getInstance("JKS", s)));
		  goto _L1
		s;
		exception = ((Exception) (obj1));
_L5:
		throw new ExceptionConverter(((Exception) (s)));
		s;
_L3:
		if(exception != null)
			try
			{
				((FileInputStream) (exception)).close();
			}
			// Misplaced declaration of an exception variable
			catch(Exception exception) { }
	//   62  108:astore_1        
		throw s;
	//*  63  109:goto            103
		s;
	//   64  112:astore_0        
		exception = ((Exception) (obj));
	//   65  113:aload_2         
	//   66  114:astore_1        
		if(true) goto _L3; else goto _L2
	//   67  115:goto            95
_L2:
		s;
	//   68  118:astore_0        
		exception = ((Exception) (obj));
	//   69  119:aload_2         
	//   70  120:astore_1        
		if(true) goto _L5; else goto _L4
	//   71  121:goto            85
_L4:
	}
}
