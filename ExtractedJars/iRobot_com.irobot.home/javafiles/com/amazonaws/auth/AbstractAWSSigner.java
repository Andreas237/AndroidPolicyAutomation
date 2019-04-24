// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amazonaws.auth;

import com.amazonaws.*;
import com.amazonaws.internal.SdkDigestInputStream;
import com.amazonaws.util.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.util.*;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.amazonaws.auth:
//			AWSCredentials, AWSSessionCredentials, BasicSessionCredentials, BasicAWSCredentials, 
//			SigningAlgorithm

public abstract class AbstractAWSSigner
{

	public AbstractAWSSigner()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	protected AWSCredentials a(AWSCredentials awscredentials)
	{
		awscredentials;
	//    0    0:aload_1         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		String s1;
		Object obj1;
		obj1 = ((Object) (awscredentials.a()));
	//    2    2:aload_1         
	//    3    3:invokeinterface #16  <Method String AWSCredentials.a()>
	//    4    8:astore          5
		s1 = awscredentials.b();
	//    5   10:aload_1         
	//    6   11:invokeinterface #19  <Method String AWSCredentials.b()>
	//    7   16:astore          4
		if(!(awscredentials instanceof AWSSessionCredentials)) goto _L2; else goto _L1
	//    8   18:aload_1         
	//    9   19:instanceof      #21  <Class AWSSessionCredentials>
	//   10   22:ifeq            119
_L1:
		Object obj = ((Object) (((AWSSessionCredentials)awscredentials).c()));
	//   11   25:aload_1         
	//   12   26:checkcast       #21  <Class AWSSessionCredentials>
	//   13   29:invokeinterface #24  <Method String AWSSessionCredentials.c()>
	//   14   34:astore_2        
	//*  15   35:goto            38
_L4:
		awscredentials;
	//   16   38:aload_1         
		JVM INSTR monitorexit ;
	//   17   39:monitorexit     
		String s = s1;
	//   18   40:aload           4
	//   19   42:astore_3        
		if(s1 != null)
	//*  20   43:aload           4
	//*  21   45:ifnull          54
			s = s1.trim();
	//   22   48:aload           4
	//   23   50:invokevirtual   #29  <Method String String.trim()>
	//   24   53:astore_3        
		s1 = ((String) (obj1));
	//   25   54:aload           5
	//   26   56:astore          4
		if(obj1 != null)
	//*  27   58:aload           5
	//*  28   60:ifnull          70
			s1 = ((String) (obj1)).trim();
	//   29   63:aload           5
	//   30   65:invokevirtual   #29  <Method String String.trim()>
	//   31   68:astore          4
		obj1 = obj;
	//   32   70:aload_2         
	//   33   71:astore          5
		if(obj != null)
	//*  34   73:aload_2         
	//*  35   74:ifnull          83
			obj1 = ((Object) (((String) (obj)).trim()));
	//   36   77:aload_2         
	//   37   78:invokevirtual   #29  <Method String String.trim()>
	//   38   81:astore          5
		if(awscredentials instanceof AWSSessionCredentials)
	//*  39   83:aload_1         
	//*  40   84:instanceof      #21  <Class AWSSessionCredentials>
	//*  41   87:ifeq            103
			return ((AWSCredentials) (new BasicSessionCredentials(s1, s, ((String) (obj1)))));
	//   42   90:new             #31  <Class BasicSessionCredentials>
	//   43   93:dup             
	//   44   94:aload           4
	//   45   96:aload_3         
	//   46   97:aload           5
	//   47   99:invokespecial   #34  <Method void BasicSessionCredentials(String, String, String)>
	//   48  102:areturn         
		else
			return ((AWSCredentials) (new BasicAWSCredentials(s1, s)));
	//   49  103:new             #36  <Class BasicAWSCredentials>
	//   50  106:dup             
	//   51  107:aload           4
	//   52  109:aload_3         
	//   53  110:invokespecial   #39  <Method void BasicAWSCredentials(String, String)>
	//   54  113:areturn         
		obj;
	//   55  114:astore_2        
		awscredentials;
	//   56  115:aload_1         
		JVM INSTR monitorexit ;
	//   57  116:monitorexit     
		throw obj;
	//   58  117:aload_2         
	//   59  118:athrow          
_L2:
		obj = null;
	//   60  119:aconst_null     
	//   61  120:astore_2        
		if(true) goto _L4; else goto _L3
	//   62  121:goto            38
_L3:
	}

	protected String a(String s, boolean flag)
	{
		if(s != null && s.length() != 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          44
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #44  <Method int String.length()>
	//*   4    8:ifne            14
	//*   5   11:goto            44
		{
			String s1 = s;
	//    6   14:aload_1         
	//    7   15:astore_3        
			if(flag)
	//*   8   16:iload_2         
	//*   9   17:ifeq            26
				s1 = HttpUtils.a(s, true);
	//   10   20:aload_1         
	//   11   21:iconst_1        
	//   12   22:invokestatic    #48  <Method String HttpUtils.a(String, boolean)>
	//   13   25:astore_3        
			if(s1.startsWith("/"))
	//*  14   26:aload_3         
	//*  15   27:ldc1            #50  <String "/">
	//*  16   29:invokevirtual   #54  <Method boolean String.startsWith(String)>
	//*  17   32:ifeq            37
				return s1;
	//   18   35:aload_3         
	//   19   36:areturn         
			else
				return "/".concat(s1);
	//   20   37:ldc1            #50  <String "/">
	//   21   39:aload_3         
	//   22   40:invokevirtual   #58  <Method String String.concat(String)>
	//   23   43:areturn         
		} else
		{
			return "/";
	//   24   44:ldc1            #50  <String "/">
	//   25   46:areturn         
		}
	}

	protected String a(Map map)
	{
		Object obj = ((Object) (new TreeMap()));
	//    0    0:new             #61  <Class TreeMap>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void TreeMap()>
	//    3    7:astore_2        
		String s;
		Object obj1;
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); ((SortedMap) (obj)).put(((Object) (HttpUtils.a(s, false))), ((Object) (HttpUtils.a(((String) (obj1)), false)))))
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #68  <Method Set Map.entrySet()>
	//*   6   14:invokeinterface #74  <Method Iterator Set.iterator()>
	//*   7   19:astore_1        
	//*   8   20:aload_1         
	//*   9   21:invokeinterface #80  <Method boolean Iterator.hasNext()>
	//*  10   26:ifeq            84
		{
			obj1 = ((Object) ((java.util.Map.Entry)((Iterator) (map)).next()));
	//   11   29:aload_1         
	//   12   30:invokeinterface #84  <Method Object Iterator.next()>
	//   13   35:checkcast       #86  <Class java.util.Map$Entry>
	//   14   38:astore          4
			s = (String)((java.util.Map.Entry) (obj1)).getKey();
	//   15   40:aload           4
	//   16   42:invokeinterface #89  <Method Object java.util.Map$Entry.getKey()>
	//   17   47:checkcast       #26  <Class String>
	//   18   50:astore_3        
			obj1 = ((Object) ((String)((java.util.Map.Entry) (obj1)).getValue()));
	//   19   51:aload           4
	//   20   53:invokeinterface #92  <Method Object java.util.Map$Entry.getValue()>
	//   21   58:checkcast       #26  <Class String>
	//   22   61:astore          4
		}

	//   23   63:aload_2         
	//   24   64:aload_3         
	//   25   65:iconst_0        
	//   26   66:invokestatic    #48  <Method String HttpUtils.a(String, boolean)>
	//   27   69:aload           4
	//   28   71:iconst_0        
	//   29   72:invokestatic    #48  <Method String HttpUtils.a(String, boolean)>
	//   30   75:invokeinterface #98  <Method Object SortedMap.put(Object, Object)>
	//   31   80:pop             
	//*  32   81:goto            20
		map = ((Map) (new StringBuilder()));
	//   33   84:new             #100 <Class StringBuilder>
	//   34   87:dup             
	//   35   88:invokespecial   #101 <Method void StringBuilder()>
	//   36   91:astore_1        
		obj = ((Object) (((SortedMap) (obj)).entrySet().iterator()));
	//   37   92:aload_2         
	//   38   93:invokeinterface #102 <Method Set SortedMap.entrySet()>
	//   39   98:invokeinterface #74  <Method Iterator Set.iterator()>
	//   40  103:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   41  104:aload_2         
	//   42  105:invokeinterface #80  <Method boolean Iterator.hasNext()>
	//   43  110:ifeq            177
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//   44  113:aload_2         
	//   45  114:invokeinterface #84  <Method Object Iterator.next()>
	//   46  119:checkcast       #86  <Class java.util.Map$Entry>
	//   47  122:astore_3        
			((StringBuilder) (map)).append((String)entry.getKey());
	//   48  123:aload_1         
	//   49  124:aload_3         
	//   50  125:invokeinterface #89  <Method Object java.util.Map$Entry.getKey()>
	//   51  130:checkcast       #26  <Class String>
	//   52  133:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   53  136:pop             
			((StringBuilder) (map)).append("=");
	//   54  137:aload_1         
	//   55  138:ldc1            #108 <String "=">
	//   56  140:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   57  143:pop             
			((StringBuilder) (map)).append((String)entry.getValue());
	//   58  144:aload_1         
	//   59  145:aload_3         
	//   60  146:invokeinterface #92  <Method Object java.util.Map$Entry.getValue()>
	//   61  151:checkcast       #26  <Class String>
	//   62  154:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   63  157:pop             
			if(((Iterator) (obj)).hasNext())
	//*  64  158:aload_2         
	//*  65  159:invokeinterface #80  <Method boolean Iterator.hasNext()>
	//*  66  164:ifeq            104
				((StringBuilder) (map)).append("&");
	//   67  167:aload_1         
	//   68  168:ldc1            #110 <String "&">
	//   69  170:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   70  173:pop             
		} while(true);
	//   71  174:goto            104
		return ((StringBuilder) (map)).toString();
	//   72  177:aload_1         
	//   73  178:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   74  181:areturn         
	}

	protected Date a(int j)
	{
		Date date = new Date();
	//    0    0:new             #118 <Class Date>
	//    1    3:dup             
	//    2    4:invokespecial   #119 <Method void Date()>
	//    3    7:astore_2        
		if(j != 0)
	//*   4    8:iload_1         
	//*   5    9:ifeq            31
			return new Date(date.getTime() - (long)(j * 1000));
	//    6   12:new             #118 <Class Date>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokevirtual   #123 <Method long Date.getTime()>
	//   10   20:iload_1         
	//   11   21:sipush          1000
	//   12   24:imul            
	//   13   25:i2l             
	//   14   26:lsub            
	//   15   27:invokespecial   #126 <Method void Date(long)>
	//   16   30:areturn         
		else
			return date;
	//   17   31:aload_2         
	//   18   32:areturn         
	}

	protected abstract void a(Request request, AWSSessionCredentials awssessioncredentials);

	protected byte[] a(InputStream inputstream)
	{
		try
		{
			inputstream = ((InputStream) (new SdkDigestInputStream(inputstream, MessageDigest.getInstance("SHA-256"))));
	//    0    0:new             #132 <Class SdkDigestInputStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc1            #134 <String "SHA-256">
	//    4    7:invokestatic    #140 <Method MessageDigest MessageDigest.getInstance(String)>
	//    5   10:invokespecial   #143 <Method void SdkDigestInputStream(InputStream, MessageDigest)>
	//    6   13:astore_1        
			for(byte abyte0[] = new byte[1024]; ((DigestInputStream) (inputstream)).read(abyte0) > -1;);
	//    7   14:sipush          1024
	//    8   17:newarray        byte[]
	//    9   19:astore_2        
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #149 <Method int DigestInputStream.read(byte[])>
	//   13   25:iconst_m1       
	//   14   26:icmple          32
		}
	//*  15   29:goto            20
	//*  16   32:aload_1         
	//*  17   33:invokevirtual   #153 <Method MessageDigest DigestInputStream.getMessageDigest()>
	//*  18   36:invokevirtual   #157 <Method byte[] MessageDigest.digest()>
	//*  19   39:astore_1        
	//*  20   40:aload_1         
	//*  21   41:areturn         
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  22   42:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   23   43:new             #100 <Class StringBuilder>
	//   24   46:dup             
	//   25   47:invokespecial   #101 <Method void StringBuilder()>
	//   26   50:astore_2        
			stringbuilder.append("Unable to compute hash while signing request: ");
	//   27   51:aload_2         
	//   28   52:ldc1            #159 <String "Unable to compute hash while signing request: ">
	//   29   54:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   30   57:pop             
			stringbuilder.append(((Exception) (inputstream)).getMessage());
	//   31   58:aload_2         
	//   32   59:aload_1         
	//   33   60:invokevirtual   #162 <Method String Exception.getMessage()>
	//   34   63:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   35   66:pop             
			throw new AmazonClientException(stringbuilder.toString(), ((Throwable) (inputstream)));
	//   36   67:new             #164 <Class AmazonClientException>
	//   37   70:dup             
	//   38   71:aload_2         
	//   39   72:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   40   75:aload_1         
	//   41   76:invokespecial   #167 <Method void AmazonClientException(String, Throwable)>
	//   42   79:athrow          
		}
		inputstream = ((InputStream) (((DigestInputStream) (inputstream)).getMessageDigest().digest()));
		return ((byte []) (inputstream));
	}

	public byte[] a(String s, byte abyte0[], SigningAlgorithm signingalgorithm)
	{
		try
		{
			s = ((String) (a(s.getBytes(StringUtils.a), abyte0, signingalgorithm)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #173 <Field java.nio.charset.Charset StringUtils.a>
	//    3    5:invokevirtual   #177 <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:invokevirtual   #180 <Method byte[] a(byte[], byte[], SigningAlgorithm)>
	//    7   13:astore_1        
		}
	//*   8   14:aload_1         
	//*   9   15:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  10   16:astore_1        
		{
			abyte0 = ((byte []) (new StringBuilder()));
	//   11   17:new             #100 <Class StringBuilder>
	//   12   20:dup             
	//   13   21:invokespecial   #101 <Method void StringBuilder()>
	//   14   24:astore_2        
			((StringBuilder) (abyte0)).append("Unable to calculate a request signature: ");
	//   15   25:aload_2         
	//   16   26:ldc1            #182 <String "Unable to calculate a request signature: ">
	//   17   28:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   18   31:pop             
			((StringBuilder) (abyte0)).append(((Exception) (s)).getMessage());
	//   19   32:aload_2         
	//   20   33:aload_1         
	//   21   34:invokevirtual   #162 <Method String Exception.getMessage()>
	//   22   37:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   23   40:pop             
			throw new AmazonClientException(((StringBuilder) (abyte0)).toString(), ((Throwable) (s)));
	//   24   41:new             #164 <Class AmazonClientException>
	//   25   44:dup             
	//   26   45:aload_2         
	//   27   46:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   28   49:aload_1         
	//   29   50:invokespecial   #167 <Method void AmazonClientException(String, Throwable)>
	//   30   53:athrow          
		}
		return ((byte []) (s));
	}

	public byte[] a(byte abyte0[])
	{
		try
		{
			MessageDigest messagedigest = MessageDigest.getInstance("SHA-256");
	//    0    0:ldc1            #134 <String "SHA-256">
	//    1    2:invokestatic    #140 <Method MessageDigest MessageDigest.getInstance(String)>
	//    2    5:astore_2        
			messagedigest.update(abyte0);
	//    3    6:aload_2         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #187 <Method void MessageDigest.update(byte[])>
			abyte0 = messagedigest.digest();
	//    6   11:aload_2         
	//    7   12:invokevirtual   #157 <Method byte[] MessageDigest.digest()>
	//    8   15:astore_1        
		}
	//*   9   16:aload_1         
	//*  10   17:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  11   18:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   12   19:new             #100 <Class StringBuilder>
	//   13   22:dup             
	//   14   23:invokespecial   #101 <Method void StringBuilder()>
	//   15   26:astore_2        
			stringbuilder.append("Unable to compute hash while signing request: ");
	//   16   27:aload_2         
	//   17   28:ldc1            #159 <String "Unable to compute hash while signing request: ">
	//   18   30:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   19   33:pop             
			stringbuilder.append(((Exception) (abyte0)).getMessage());
	//   20   34:aload_2         
	//   21   35:aload_1         
	//   22   36:invokevirtual   #162 <Method String Exception.getMessage()>
	//   23   39:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   24   42:pop             
			throw new AmazonClientException(stringbuilder.toString(), ((Throwable) (abyte0)));
	//   25   43:new             #164 <Class AmazonClientException>
	//   26   46:dup             
	//   27   47:aload_2         
	//   28   48:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   29   51:aload_1         
	//   30   52:invokespecial   #167 <Method void AmazonClientException(String, Throwable)>
	//   31   55:athrow          
		}
		return abyte0;
	}

	protected byte[] a(byte abyte0[], byte abyte1[], SigningAlgorithm signingalgorithm)
	{
		try
		{
			Mac mac = Mac.getInstance(signingalgorithm.toString());
	//    0    0:aload_3         
	//    1    1:invokevirtual   #190 <Method String SigningAlgorithm.toString()>
	//    2    4:invokestatic    #195 <Method Mac Mac.getInstance(String)>
	//    3    7:astore          4
			mac.init(((java.security.Key) (new SecretKeySpec(abyte1, signingalgorithm.toString()))));
	//    4    9:aload           4
	//    5   11:new             #197 <Class SecretKeySpec>
	//    6   14:dup             
	//    7   15:aload_2         
	//    8   16:aload_3         
	//    9   17:invokevirtual   #190 <Method String SigningAlgorithm.toString()>
	//   10   20:invokespecial   #200 <Method void SecretKeySpec(byte[], String)>
	//   11   23:invokevirtual   #204 <Method void Mac.init(java.security.Key)>
			abyte0 = mac.doFinal(abyte0);
	//   12   26:aload           4
	//   13   28:aload_1         
	//   14   29:invokevirtual   #207 <Method byte[] Mac.doFinal(byte[])>
	//   15   32:astore_1        
		}
	//*  16   33:aload_1         
	//*  17   34:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  18   35:astore_1        
		{
			abyte1 = ((byte []) (new StringBuilder()));
	//   19   36:new             #100 <Class StringBuilder>
	//   20   39:dup             
	//   21   40:invokespecial   #101 <Method void StringBuilder()>
	//   22   43:astore_2        
			((StringBuilder) (abyte1)).append("Unable to calculate a request signature: ");
	//   23   44:aload_2         
	//   24   45:ldc1            #182 <String "Unable to calculate a request signature: ">
	//   25   47:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   26   50:pop             
			((StringBuilder) (abyte1)).append(((Exception) (abyte0)).getMessage());
	//   27   51:aload_2         
	//   28   52:aload_1         
	//   29   53:invokevirtual   #162 <Method String Exception.getMessage()>
	//   30   56:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   31   59:pop             
			throw new AmazonClientException(((StringBuilder) (abyte1)).toString(), ((Throwable) (abyte0)));
	//   32   60:new             #164 <Class AmazonClientException>
	//   33   63:dup             
	//   34   64:aload_2         
	//   35   65:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   36   68:aload_1         
	//   37   69:invokespecial   #167 <Method void AmazonClientException(String, Throwable)>
	//   38   72:athrow          
		}
		return abyte0;
	}

	public byte[] d(String s)
	{
		try
		{
			MessageDigest messagedigest = MessageDigest.getInstance("SHA-256");
	//    0    0:ldc1            #134 <String "SHA-256">
	//    1    2:invokestatic    #140 <Method MessageDigest MessageDigest.getInstance(String)>
	//    2    5:astore_2        
			messagedigest.update(s.getBytes(StringUtils.a));
	//    3    6:aload_2         
	//    4    7:aload_1         
	//    5    8:getstatic       #173 <Field java.nio.charset.Charset StringUtils.a>
	//    6   11:invokevirtual   #177 <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//    7   14:invokevirtual   #187 <Method void MessageDigest.update(byte[])>
			s = ((String) (messagedigest.digest()));
	//    8   17:aload_2         
	//    9   18:invokevirtual   #157 <Method byte[] MessageDigest.digest()>
	//   10   21:astore_1        
		}
	//*  11   22:aload_1         
	//*  12   23:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  13   24:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   14   25:new             #100 <Class StringBuilder>
	//   15   28:dup             
	//   16   29:invokespecial   #101 <Method void StringBuilder()>
	//   17   32:astore_2        
			stringbuilder.append("Unable to compute hash while signing request: ");
	//   18   33:aload_2         
	//   19   34:ldc1            #159 <String "Unable to compute hash while signing request: ">
	//   20   36:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
			stringbuilder.append(((Exception) (s)).getMessage());
	//   22   40:aload_2         
	//   23   41:aload_1         
	//   24   42:invokevirtual   #162 <Method String Exception.getMessage()>
	//   25   45:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
			throw new AmazonClientException(stringbuilder.toString(), ((Throwable) (s)));
	//   27   49:new             #164 <Class AmazonClientException>
	//   28   52:dup             
	//   29   53:aload_2         
	//   30   54:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   31   57:aload_1         
	//   32   58:invokespecial   #167 <Method void AmazonClientException(String, Throwable)>
	//   33   61:athrow          
		}
		return ((byte []) (s));
	}

	protected String f(Request request)
	{
		if(HttpUtils.a(request))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #214 <Method boolean HttpUtils.a(Request)>
	//*   2    4:ifeq            10
			return "";
	//    3    7:ldc1            #216 <String "">
	//    4    9:areturn         
		else
			return a(request.c());
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokeinterface #221 <Method Map Request.c()>
	//    8   17:invokevirtual   #223 <Method String a(Map)>
	//    9   20:areturn         
	}

	protected InputStream g(Request request)
	{
		if(HttpUtils.a(request))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #214 <Method boolean HttpUtils.a(Request)>
	//*   2    4:ifeq            42
		{
			request = ((Request) (HttpUtils.b(request)));
	//    3    7:aload_1         
	//    4    8:invokestatic    #228 <Method String HttpUtils.b(Request)>
	//    5   11:astore_1        
			if(request == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       27
				return ((InputStream) (new ByteArrayInputStream(new byte[0])));
	//    8   16:new             #230 <Class ByteArrayInputStream>
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:newarray        byte[]
	//   12   23:invokespecial   #232 <Method void ByteArrayInputStream(byte[])>
	//   13   26:areturn         
			else
				return ((InputStream) (new ByteArrayInputStream(((String) (request)).getBytes(StringUtils.a))));
	//   14   27:new             #230 <Class ByteArrayInputStream>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:getstatic       #173 <Field java.nio.charset.Charset StringUtils.a>
	//   18   35:invokevirtual   #177 <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//   19   38:invokespecial   #232 <Method void ByteArrayInputStream(byte[])>
	//   20   41:areturn         
		} else
		{
			return h(request);
	//   21   42:aload_0         
	//   22   43:aload_1         
	//   23   44:invokevirtual   #235 <Method InputStream h(Request)>
	//   24   47:areturn         
		}
	}

	protected InputStream h(Request request)
	{
		InputStream inputstream;
		try
		{
			inputstream = request.f();
	//    0    0:aload_1         
	//    1    1:invokeinterface #239 <Method InputStream Request.f()>
	//    2    6:astore_2        
		}
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       22
	//*   5   11:new             #230 <Class ByteArrayInputStream>
	//*   6   14:dup             
	//*   7   15:iconst_0        
	//*   8   16:newarray        byte[]
	//*   9   18:invokespecial   #232 <Method void ByteArrayInputStream(byte[])>
	//*  10   21:areturn         
	//*  11   22:aload_2         
	//*  12   23:instanceof      #241 <Class StringInputStream>
	//*  13   26:ifeq            31
	//*  14   29:aload_2         
	//*  15   30:areturn         
	//*  16   31:aload_2         
	//*  17   32:invokevirtual   #246 <Method boolean InputStream.markSupported()>
	//*  18   35:ifne            48
	//*  19   38:new             #164 <Class AmazonClientException>
	//*  20   41:dup             
	//*  21   42:ldc1            #248 <String "Unable to read request payload to sign request.">
	//*  22   44:invokespecial   #251 <Method void AmazonClientException(String)>
	//*  23   47:athrow          
	//*  24   48:aload_1         
	//*  25   49:invokeinterface #239 <Method InputStream Request.f()>
	//*  26   54:astore_1        
	//*  27   55:aload_1         
	//*  28   56:areturn         
		// Misplaced declaration of an exception variable
		catch(Request request)
	//*  29   57:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   30   58:new             #100 <Class StringBuilder>
	//   31   61:dup             
	//   32   62:invokespecial   #101 <Method void StringBuilder()>
	//   33   65:astore_2        
			stringbuilder.append("Unable to read request payload to sign request: ");
	//   34   66:aload_2         
	//   35   67:ldc1            #253 <String "Unable to read request payload to sign request: ">
	//   36   69:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   37   72:pop             
			stringbuilder.append(((Exception) (request)).getMessage());
	//   38   73:aload_2         
	//   39   74:aload_1         
	//   40   75:invokevirtual   #162 <Method String Exception.getMessage()>
	//   41   78:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   42   81:pop             
			throw new AmazonClientException(stringbuilder.toString(), ((Throwable) (request)));
	//   43   82:new             #164 <Class AmazonClientException>
	//   44   85:dup             
	//   45   86:aload_2         
	//   46   87:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   47   90:aload_1         
	//   48   91:invokespecial   #167 <Method void AmazonClientException(String, Throwable)>
	//   49   94:athrow          
		}
		if(inputstream != null)
			break MISSING_BLOCK_LABEL_22;
		return ((InputStream) (new ByteArrayInputStream(new byte[0])));
		if(inputstream instanceof StringInputStream)
			return inputstream;
		if(!inputstream.markSupported())
			throw new AmazonClientException("Unable to read request payload to sign request.");
		request = ((Request) (request.f()));
		return ((InputStream) (request));
	}

	protected int i(Request request)
	{
		int j = request.g();
	//    0    0:aload_1         
	//    1    1:invokeinterface #257 <Method int Request.g()>
	//    2    6:istore_2        
		if(SDKGlobalConfiguration.a() != 0)
	//*   3    7:invokestatic    #261 <Method int SDKGlobalConfiguration.a()>
	//*   4   10:ifeq            17
			j = SDKGlobalConfiguration.a();
	//    5   13:invokestatic    #261 <Method int SDKGlobalConfiguration.a()>
	//    6   16:istore_2        
		return j;
	//    7   17:iload_2         
	//    8   18:ireturn         
	}
}
