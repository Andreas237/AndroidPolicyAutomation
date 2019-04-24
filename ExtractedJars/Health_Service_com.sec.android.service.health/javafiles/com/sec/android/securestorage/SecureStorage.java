// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.securestorage;

import java.math.BigInteger;
import java.nio.*;

// Referenced classes of package com.sec.android.securestorage:
//			SecureStorageJNI

public class SecureStorage
{
	public static class SecureStorageException extends Exception
	{

		public static final String ERROR_INPUT_DATA_NAME = "Error input data name";
		public static final String ERROR_NULL_DATA_BLOCK = "Error: data block is null";
		public static final String ERROR_NULL_PASSWORD = "Error: password is null!";
		public static final String ERROR_PUT_DATA = "Error saving data";
		public static final String SECURE_STORAGE_ERROR_ENCRYPTION = "Encryption error";
		public static final String SECURE_STORAGE_ERROR_INPUT_DATA = "Error: input data are incorrect";
		private static final long serialVersionUID = 1L;

		public SecureStorageException()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #34  <Method void Exception()>
		//    2    4:return          
		}

		public SecureStorageException(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #38  <Method void Exception(String)>
		//    3    5:return          
		}
	}


	public SecureStorage()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:return          
	}

	public static int initialize()
	{
		return secureStorageJNI.initialize();
	//    0    0:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//    1    3:invokevirtual   #32  <Method int SecureStorageJNI.initialize()>
	//    2    6:ireturn         
	}

	public static boolean isSupported()
	{
		return secureStorageJNI.isSupported();
	//    0    0:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//    1    3:invokevirtual   #36  <Method boolean SecureStorageJNI.isSupported()>
	//    2    6:ireturn         
	}

	private void throwException(String s)
		throws SecureStorageException
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new SecureStorageException("Error input data name");
	//    2    4:new             #6   <Class SecureStorage$SecureStorageException>
	//    3    7:dup             
	//    4    8:ldc1            #40  <String "Error input data name">
	//    5   10:invokespecial   #42  <Method void SecureStorage$SecureStorageException(String)>
	//    6   13:athrow          
		else
			return;
	//    7   14:return          
	}

	private void throwException(boolean flag, String s)
		throws SecureStorageException
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            13
			throw new SecureStorageException(s);
	//    2    4:new             #6   <Class SecureStorage$SecureStorageException>
	//    3    7:dup             
	//    4    8:aload_2         
	//    5    9:invokespecial   #42  <Method void SecureStorage$SecureStorageException(String)>
	//    6   12:athrow          
		else
			return;
	//    7   13:return          
	}

	public static int version()
	{
		return secureStorageJNI.getVersion();
	//    0    0:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//    1    3:invokevirtual   #48  <Method int SecureStorageJNI.getVersion()>
	//    2    6:ireturn         
	}

	public byte[] decrypt(byte abyte0[])
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		boolean flag;
		if(abyte0 == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       38
			flag = true;
	//    4    6:iconst_1        
	//    5    7:istore_2        
		else
	//*   6    8:aload_0         
	//*   7    9:iload_2         
	//*   8   10:ldc1            #52  <String "Error: data block is null">
	//*   9   12:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  10   15:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  11   18:aload_1         
	//*  12   19:invokevirtual   #56  <Method byte[] SecureStorageJNI.decrypt(byte[])>
	//*  13   22:astore_1        
	//*  14   23:aload_1         
	//*  15   24:ifnonnull       43
	//*  16   27:iload_3         
	//*  17   28:istore_2        
	//*  18   29:aload_0         
	//*  19   30:iload_2         
	//*  20   31:ldc1            #58  <String "Error: input data are incorrect">
	//*  21   33:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  22   36:aload_1         
	//*  23   37:areturn         
			flag = false;
	//   24   38:iconst_0        
	//   25   39:istore_2        
		throwException(flag, "Error: data block is null");
		abyte0 = secureStorageJNI.decrypt(abyte0);
		if(abyte0 == null)
			flag = flag1;
		else
	//*  26   40:goto            8
			flag = false;
	//   27   43:iconst_0        
	//   28   44:istore_2        
		throwException(flag, "Error: input data are incorrect");
		return abyte0;
	//*  29   45:goto            29
	}

	public byte[] decrypt(byte abyte0[], String s)
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		boolean flag;
		if(abyte0 == null)
	//*   2    3:aload_1         
	//*   3    4:ifnonnull       54
			flag = true;
	//    4    7:iconst_1        
	//    5    8:istore_3        
		else
	//*   6    9:aload_0         
	//*   7   10:iload_3         
	//*   8   11:ldc1            #52  <String "Error: data block is null">
	//*   9   13:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  10   16:aload_2         
	//*  11   17:ifnonnull       59
	//*  12   20:iconst_1        
	//*  13   21:istore_3        
	//*  14   22:aload_0         
	//*  15   23:iload_3         
	//*  16   24:ldc1            #61  <String "Error: password is null!">
	//*  17   26:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  18   29:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  19   32:aload_1         
	//*  20   33:aload_2         
	//*  21   34:invokevirtual   #63  <Method byte[] SecureStorageJNI.decrypt(byte[], String)>
	//*  22   37:astore_1        
	//*  23   38:aload_1         
	//*  24   39:ifnonnull       64
	//*  25   42:iload           4
	//*  26   44:istore_3        
	//*  27   45:aload_0         
	//*  28   46:iload_3         
	//*  29   47:ldc1            #58  <String "Error: input data are incorrect">
	//*  30   49:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  31   52:aload_1         
	//*  32   53:areturn         
			flag = false;
	//   33   54:iconst_0        
	//   34   55:istore_3        
		throwException(flag, "Error: data block is null");
		if(s == null)
			flag = true;
		else
	//*  35   56:goto            9
			flag = false;
	//   36   59:iconst_0        
	//   37   60:istore_3        
		throwException(flag, "Error: password is null!");
		abyte0 = secureStorageJNI.decrypt(abyte0, s);
		if(abyte0 == null)
			flag = flag1;
		else
	//*  38   61:goto            22
			flag = false;
	//   39   64:iconst_0        
	//   40   65:istore_3        
		throwException(flag, "Error: input data are incorrect");
		return abyte0;
	//*  41   66:goto            45
	}

	public boolean delete(String s)
		throws SecureStorageException
	{
		throwException(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void throwException(String)>
		boolean flag1 = secureStorageJNI.delete(s);
	//    3    5:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #69  <Method boolean SecureStorageJNI.delete(String)>
	//    6   12:istore_3        
		boolean flag;
		if(!flag1)
	//*   7   13:iload_3         
	//*   8   14:ifne            28
			flag = true;
	//    9   17:iconst_1        
	//   10   18:istore_2        
		else
	//*  11   19:aload_0         
	//*  12   20:iload_2         
	//*  13   21:ldc1            #40  <String "Error input data name">
	//*  14   23:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  15   26:iload_3         
	//*  16   27:ireturn         
			flag = false;
	//   17   28:iconst_0        
	//   18   29:istore_2        
		throwException(flag, "Error input data name");
		return flag1;
	//*  19   30:goto            19
	}

	public byte[] encrypt(byte abyte0[])
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		boolean flag;
		if(abyte0 == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       38
			flag = true;
	//    4    6:iconst_1        
	//    5    7:istore_2        
		else
	//*   6    8:aload_0         
	//*   7    9:iload_2         
	//*   8   10:ldc1            #52  <String "Error: data block is null">
	//*   9   12:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  10   15:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  11   18:aload_1         
	//*  12   19:invokevirtual   #72  <Method byte[] SecureStorageJNI.encrypt(byte[])>
	//*  13   22:astore_1        
	//*  14   23:aload_1         
	//*  15   24:ifnonnull       43
	//*  16   27:iload_3         
	//*  17   28:istore_2        
	//*  18   29:aload_0         
	//*  19   30:iload_2         
	//*  20   31:ldc1            #74  <String "Encryption error">
	//*  21   33:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  22   36:aload_1         
	//*  23   37:areturn         
			flag = false;
	//   24   38:iconst_0        
	//   25   39:istore_2        
		throwException(flag, "Error: data block is null");
		abyte0 = secureStorageJNI.encrypt(abyte0);
		if(abyte0 == null)
			flag = flag1;
		else
	//*  26   40:goto            8
			flag = false;
	//   27   43:iconst_0        
	//   28   44:istore_2        
		throwException(flag, "Encryption error");
		return abyte0;
	//*  29   45:goto            29
	}

	public byte[] encrypt(byte abyte0[], String s)
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		boolean flag;
		if(abyte0 == null)
	//*   2    3:aload_1         
	//*   3    4:ifnonnull       54
			flag = true;
	//    4    7:iconst_1        
	//    5    8:istore_3        
		else
	//*   6    9:aload_0         
	//*   7   10:iload_3         
	//*   8   11:ldc1            #52  <String "Error: data block is null">
	//*   9   13:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  10   16:aload_2         
	//*  11   17:ifnonnull       59
	//*  12   20:iconst_1        
	//*  13   21:istore_3        
	//*  14   22:aload_0         
	//*  15   23:iload_3         
	//*  16   24:ldc1            #61  <String "Error: password is null!">
	//*  17   26:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  18   29:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  19   32:aload_1         
	//*  20   33:aload_2         
	//*  21   34:invokevirtual   #76  <Method byte[] SecureStorageJNI.encrypt(byte[], String)>
	//*  22   37:astore_1        
	//*  23   38:aload_1         
	//*  24   39:ifnonnull       64
	//*  25   42:iload           4
	//*  26   44:istore_3        
	//*  27   45:aload_0         
	//*  28   46:iload_3         
	//*  29   47:ldc1            #74  <String "Encryption error">
	//*  30   49:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  31   52:aload_1         
	//*  32   53:areturn         
			flag = false;
	//   33   54:iconst_0        
	//   34   55:istore_3        
		throwException(flag, "Error: data block is null");
		if(s == null)
			flag = true;
		else
	//*  35   56:goto            9
			flag = false;
	//   36   59:iconst_0        
	//   37   60:istore_3        
		throwException(flag, "Error: password is null!");
		abyte0 = secureStorageJNI.encrypt(abyte0, s);
		if(abyte0 == null)
			flag = flag1;
		else
	//*  38   61:goto            22
			flag = false;
	//   39   64:iconst_0        
	//   40   65:istore_3        
		throwException(flag, "Encryption error");
		return abyte0;
	//*  41   66:goto            45
	}

	public boolean getBoolean(String s)
		throws SecureStorageException
	{
		throwException(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void throwException(String)>
		s = ((String) (secureStorageJNI.get(s)));
	//    3    5:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #81  <Method byte[] SecureStorageJNI.get(String)>
	//    6   12:astore_1        
		boolean flag;
		if(s == null)
	//*   7   13:aload_1         
	//*   8   14:ifnonnull       38
			flag = true;
	//    9   17:iconst_1        
	//   10   18:istore_2        
		else
	//*  11   19:aload_0         
	//*  12   20:iload_2         
	//*  13   21:ldc1            #58  <String "Error: input data are incorrect">
	//*  14   23:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  15   26:new             #83  <Class String>
	//*  16   29:dup             
	//*  17   30:aload_1         
	//*  18   31:invokespecial   #86  <Method void String(byte[])>
	//*  19   34:invokestatic    #91  <Method boolean Boolean.parseBoolean(String)>
	//*  20   37:ireturn         
			flag = false;
	//   21   38:iconst_0        
	//   22   39:istore_2        
		throwException(flag, "Error: input data are incorrect");
		return Boolean.parseBoolean(new String(((byte []) (s))));
	//*  23   40:goto            19
	}

	public boolean getBoolean(String s, String s1)
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		if(s1 == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       56
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore_3        
		else
	//*   9   14:aload_0         
	//*  10   15:iload_3         
	//*  11   16:ldc1            #61  <String "Error: password is null!">
	//*  12   18:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   21:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  14   24:aload_1         
	//*  15   25:aload_2         
	//*  16   26:invokevirtual   #95  <Method byte[] SecureStorageJNI.get(String, String)>
	//*  17   29:astore_1        
	//*  18   30:aload_1         
	//*  19   31:ifnonnull       61
	//*  20   34:iload           4
	//*  21   36:istore_3        
	//*  22   37:aload_0         
	//*  23   38:iload_3         
	//*  24   39:ldc1            #58  <String "Error: input data are incorrect">
	//*  25   41:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  26   44:new             #83  <Class String>
	//*  27   47:dup             
	//*  28   48:aload_1         
	//*  29   49:invokespecial   #86  <Method void String(byte[])>
	//*  30   52:invokestatic    #91  <Method boolean Boolean.parseBoolean(String)>
	//*  31   55:ireturn         
			flag = false;
	//   32   56:iconst_0        
	//   33   57:istore_3        
		throwException(flag, "Error: password is null!");
		s = ((String) (secureStorageJNI.get(s, s1)));
		if(s == null)
			flag = flag1;
		else
	//*  34   58:goto            14
			flag = false;
	//   35   61:iconst_0        
	//   36   62:istore_3        
		throwException(flag, "Error: input data are incorrect");
		return Boolean.parseBoolean(new String(((byte []) (s))));
	//*  37   63:goto            37
	}

	public boolean[] getBooleanArray(String s)
		throws SecureStorageException
	{
		throwException(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void throwException(String)>
		s = ((String) (secureStorageJNI.get(s)));
	//    3    5:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #81  <Method byte[] SecureStorageJNI.get(String)>
	//    6   12:astore_1        
		int i;
		boolean flag;
		boolean aflag[];
		if(s == null)
	//*   7   13:aload_1         
	//*   8   14:ifnonnull       60
			flag = true;
	//    9   17:iconst_1        
	//   10   18:istore_3        
		else
	//*  11   19:aload_0         
	//*  12   20:iload_3         
	//*  13   21:ldc1            #58  <String "Error: input data are incorrect">
	//*  14   23:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  15   26:aload_1         
	//*  16   27:arraylength     
	//*  17   28:newarray        boolean[]
	//*  18   30:astore          4
	//*  19   32:iconst_0        
	//*  20   33:istore_2        
	//*  21   34:iload_2         
	//*  22   35:aload           4
	//*  23   37:arraylength     
	//*  24   38:icmpge          73
	//*  25   41:aload_1         
	//*  26   42:iload_2         
	//*  27   43:baload          
	//*  28   44:iconst_1        
	//*  29   45:icmpne          65
	//*  30   48:aload           4
	//*  31   50:iload_2         
	//*  32   51:iconst_1        
	//*  33   52:bastore         
	//*  34   53:iload_2         
	//*  35   54:iconst_1        
	//*  36   55:iadd            
	//*  37   56:istore_2        
	//*  38   57:goto            34
			flag = false;
	//   39   60:iconst_0        
	//   40   61:istore_3        
		throwException(flag, "Error: input data are incorrect");
		aflag = new boolean[s.length];
		i = 0;
		while(i < aflag.length) 
		{
			if(s[i] == 1)
				aflag[i] = true;
			else
	//*  41   62:goto            19
				aflag[i] = false;
	//   42   65:aload           4
	//   43   67:iload_2         
	//   44   68:iconst_0        
	//   45   69:bastore         
			i++;
		}
	//*  46   70:goto            53
		return aflag;
	//   47   73:aload           4
	//   48   75:areturn         
	}

	public boolean[] getBooleanArray(String s, String s1)
		throws SecureStorageException
	{
		throwException(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void throwException(String)>
		int i;
		boolean flag;
		if(s1 == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       75
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore          4
		else
	//*   7   12:aload_0         
	//*   8   13:iload           4
	//*   9   15:ldc1            #61  <String "Error: password is null!">
	//*  10   17:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  11   20:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  12   23:aload_1         
	//*  13   24:aload_2         
	//*  14   25:invokevirtual   #95  <Method byte[] SecureStorageJNI.get(String, String)>
	//*  15   28:astore_1        
	//*  16   29:aload_1         
	//*  17   30:ifnonnull       81
	//*  18   33:iconst_1        
	//*  19   34:istore          4
	//*  20   36:aload_0         
	//*  21   37:iload           4
	//*  22   39:ldc1            #58  <String "Error: input data are incorrect">
	//*  23   41:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  24   44:aload_1         
	//*  25   45:arraylength     
	//*  26   46:newarray        boolean[]
	//*  27   48:astore_2        
	//*  28   49:iconst_0        
	//*  29   50:istore_3        
	//*  30   51:iload_3         
	//*  31   52:aload_2         
	//*  32   53:arraylength     
	//*  33   54:icmpge          94
	//*  34   57:aload_1         
	//*  35   58:iload_3         
	//*  36   59:baload          
	//*  37   60:iconst_1        
	//*  38   61:icmpne          87
	//*  39   64:aload_2         
	//*  40   65:iload_3         
	//*  41   66:iconst_1        
	//*  42   67:bastore         
	//*  43   68:iload_3         
	//*  44   69:iconst_1        
	//*  45   70:iadd            
	//*  46   71:istore_3        
	//*  47   72:goto            51
			flag = false;
	//   48   75:iconst_0        
	//   49   76:istore          4
		throwException(flag, "Error: password is null!");
		s = ((String) (secureStorageJNI.get(s, s1)));
		if(s == null)
			flag = true;
		else
	//*  50   78:goto            12
			flag = false;
	//   51   81:iconst_0        
	//   52   82:istore          4
		throwException(flag, "Error: input data are incorrect");
		s1 = ((String) (new boolean[s.length]));
		i = 0;
		while(i < s1.length) 
		{
			if(s[i] == 1)
				s1[i] = 1;
			else
	//*  53   84:goto            36
				s1[i] = 0;
	//   54   87:aload_2         
	//   55   88:iload_3         
	//   56   89:iconst_0        
	//   57   90:bastore         
			i++;
		}
	//*  58   91:goto            68
		return ((boolean []) (s1));
	//   59   94:aload_2         
	//   60   95:areturn         
	}

	public byte getByte(String s)
		throws SecureStorageException
	{
		throwException(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void throwException(String)>
		s = ((String) (secureStorageJNI.get(s)));
	//    3    5:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #81  <Method byte[] SecureStorageJNI.get(String)>
	//    6   12:astore_1        
		boolean flag;
		if(s == null)
	//*   7   13:aload_1         
	//*   8   14:ifnonnull       30
			flag = true;
	//    9   17:iconst_1        
	//   10   18:istore_2        
		else
	//*  11   19:aload_0         
	//*  12   20:iload_2         
	//*  13   21:ldc1            #58  <String "Error: input data are incorrect">
	//*  14   23:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  15   26:aload_1         
	//*  16   27:iconst_0        
	//*  17   28:baload          
	//*  18   29:ireturn         
			flag = false;
	//   19   30:iconst_0        
	//   20   31:istore_2        
		throwException(flag, "Error: input data are incorrect");
		return s[0];
	//*  21   32:goto            19
	}

	public byte getByte(String s, String s1)
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		if(s1 == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       48
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore_3        
		else
	//*   9   14:aload_0         
	//*  10   15:iload_3         
	//*  11   16:ldc1            #61  <String "Error: password is null!">
	//*  12   18:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   21:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  14   24:aload_1         
	//*  15   25:aload_2         
	//*  16   26:invokevirtual   #95  <Method byte[] SecureStorageJNI.get(String, String)>
	//*  17   29:astore_1        
	//*  18   30:aload_1         
	//*  19   31:ifnonnull       53
	//*  20   34:iload           4
	//*  21   36:istore_3        
	//*  22   37:aload_0         
	//*  23   38:iload_3         
	//*  24   39:ldc1            #58  <String "Error: input data are incorrect">
	//*  25   41:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  26   44:aload_1         
	//*  27   45:iconst_0        
	//*  28   46:baload          
	//*  29   47:ireturn         
			flag = false;
	//   30   48:iconst_0        
	//   31   49:istore_3        
		throwException(flag, "Error: password is null!");
		s = ((String) (secureStorageJNI.get(s, s1)));
		if(s == null)
			flag = flag1;
		else
	//*  32   50:goto            14
			flag = false;
	//   33   53:iconst_0        
	//   34   54:istore_3        
		throwException(flag, "Error: input data are incorrect");
		return s[0];
	//*  35   55:goto            37
	}

	public byte[] getByteArray(String s)
		throws SecureStorageException
	{
		throwException(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void throwException(String)>
		s = ((String) (secureStorageJNI.get(s)));
	//    3    5:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #81  <Method byte[] SecureStorageJNI.get(String)>
	//    6   12:astore_1        
		boolean flag;
		if(s == null)
	//*   7   13:aload_1         
	//*   8   14:ifnonnull       28
			flag = true;
	//    9   17:iconst_1        
	//   10   18:istore_2        
		else
	//*  11   19:aload_0         
	//*  12   20:iload_2         
	//*  13   21:ldc1            #58  <String "Error: input data are incorrect">
	//*  14   23:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  15   26:aload_1         
	//*  16   27:areturn         
			flag = false;
	//   17   28:iconst_0        
	//   18   29:istore_2        
		throwException(flag, "Error: input data are incorrect");
		return ((byte []) (s));
	//*  19   30:goto            19
	}

	public byte[] getByteArray(String s, String s1)
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		if(s1 == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       46
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore_3        
		else
	//*   9   14:aload_0         
	//*  10   15:iload_3         
	//*  11   16:ldc1            #61  <String "Error: password is null!">
	//*  12   18:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   21:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  14   24:aload_1         
	//*  15   25:aload_2         
	//*  16   26:invokevirtual   #95  <Method byte[] SecureStorageJNI.get(String, String)>
	//*  17   29:astore_1        
	//*  18   30:aload_1         
	//*  19   31:ifnonnull       51
	//*  20   34:iload           4
	//*  21   36:istore_3        
	//*  22   37:aload_0         
	//*  23   38:iload_3         
	//*  24   39:ldc1            #58  <String "Error: input data are incorrect">
	//*  25   41:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  26   44:aload_1         
	//*  27   45:areturn         
			flag = false;
	//   28   46:iconst_0        
	//   29   47:istore_3        
		throwException(flag, "Error: password is null!");
		s = ((String) (secureStorageJNI.get(s, s1)));
		if(s == null)
			flag = flag1;
		else
	//*  30   48:goto            14
			flag = false;
	//   31   51:iconst_0        
	//   32   52:istore_3        
		throwException(flag, "Error: input data are incorrect");
		return ((byte []) (s));
	//*  33   53:goto            37
	}

	public char getChar(String s)
		throws SecureStorageException
	{
		throwException(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void throwException(String)>
		s = ((String) (secureStorageJNI.get(s)));
	//    3    5:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #81  <Method byte[] SecureStorageJNI.get(String)>
	//    6   12:astore_1        
		boolean flag;
		if(s == null)
	//*   7   13:aload_1         
	//*   8   14:ifnonnull       39
			flag = true;
	//    9   17:iconst_1        
	//   10   18:istore_2        
		else
	//*  11   19:aload_0         
	//*  12   20:iload_2         
	//*  13   21:ldc1            #58  <String "Error: input data are incorrect">
	//*  14   23:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  15   26:new             #106 <Class BigInteger>
	//*  16   29:dup             
	//*  17   30:aload_1         
	//*  18   31:invokespecial   #107 <Method void BigInteger(byte[])>
	//*  19   34:invokevirtual   #110 <Method int BigInteger.intValue()>
	//*  20   37:int2char        
	//*  21   38:ireturn         
			flag = false;
	//   22   39:iconst_0        
	//   23   40:istore_2        
		throwException(flag, "Error: input data are incorrect");
		return (char)(new BigInteger(((byte []) (s)))).intValue();
	//*  24   41:goto            19
	}

	public char getChar(String s, String s1)
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		if(s1 == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       57
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore_3        
		else
	//*   9   14:aload_0         
	//*  10   15:iload_3         
	//*  11   16:ldc1            #61  <String "Error: password is null!">
	//*  12   18:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   21:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  14   24:aload_1         
	//*  15   25:aload_2         
	//*  16   26:invokevirtual   #95  <Method byte[] SecureStorageJNI.get(String, String)>
	//*  17   29:astore_1        
	//*  18   30:aload_1         
	//*  19   31:ifnonnull       62
	//*  20   34:iload           4
	//*  21   36:istore_3        
	//*  22   37:aload_0         
	//*  23   38:iload_3         
	//*  24   39:ldc1            #58  <String "Error: input data are incorrect">
	//*  25   41:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  26   44:new             #106 <Class BigInteger>
	//*  27   47:dup             
	//*  28   48:aload_1         
	//*  29   49:invokespecial   #107 <Method void BigInteger(byte[])>
	//*  30   52:invokevirtual   #110 <Method int BigInteger.intValue()>
	//*  31   55:int2char        
	//*  32   56:ireturn         
			flag = false;
	//   33   57:iconst_0        
	//   34   58:istore_3        
		throwException(flag, "Error: password is null!");
		s = ((String) (secureStorageJNI.get(s, s1)));
		if(s == null)
			flag = flag1;
		else
	//*  35   59:goto            14
			flag = false;
	//   36   62:iconst_0        
	//   37   63:istore_3        
		throwException(flag, "Error: input data are incorrect");
		return (char)(new BigInteger(((byte []) (s)))).intValue();
	//*  38   64:goto            37
	}

	public char[] getCharArray(String s)
		throws SecureStorageException
	{
		throwException(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void throwException(String)>
		byte abyte0[] = secureStorageJNI.get(s);
	//    3    5:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #81  <Method byte[] SecureStorageJNI.get(String)>
	//    6   12:astore          4
		boolean flag;
		ByteBuffer bytebuffer;
		if(abyte0 == null)
	//*   7   14:aload           4
	//*   8   16:ifnonnull       74
			flag = true;
	//    9   19:iconst_1        
	//   10   20:istore_3        
		else
	//*  11   21:aload_0         
	//*  12   22:iload_3         
	//*  13   23:ldc1            #58  <String "Error: input data are incorrect">
	//*  14   25:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  15   28:aload           4
	//*  16   30:arraylength     
	//*  17   31:iconst_2        
	//*  18   32:idiv            
	//*  19   33:newarray        char[]
	//*  20   35:astore_1        
	//*  21   36:aload           4
	//*  22   38:invokestatic    #119 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//*  23   41:astore          4
	//*  24   43:aload           4
	//*  25   45:invokevirtual   #123 <Method java.nio.Buffer ByteBuffer.rewind()>
	//*  26   48:pop             
	//*  27   49:iconst_0        
	//*  28   50:istore_2        
	//*  29   51:aload           4
	//*  30   53:invokevirtual   #126 <Method boolean ByteBuffer.hasRemaining()>
	//*  31   56:ifeq            79
	//*  32   59:aload_1         
	//*  33   60:iload_2         
	//*  34   61:aload           4
	//*  35   63:invokevirtual   #129 <Method char ByteBuffer.getChar()>
	//*  36   66:castore         
	//*  37   67:iload_2         
	//*  38   68:iconst_1        
	//*  39   69:iadd            
	//*  40   70:istore_2        
	//*  41   71:goto            51
			flag = false;
	//   42   74:iconst_0        
	//   43   75:istore_3        
		throwException(flag, "Error: input data are incorrect");
		s = ((String) (new char[abyte0.length / 2]));
		bytebuffer = ByteBuffer.wrap(abyte0);
		bytebuffer.rewind();
		for(int i = 0; bytebuffer.hasRemaining(); i++)
			s[i] = bytebuffer.getChar();

	//*  44   76:goto            21
		return ((char []) (s));
	//   45   79:aload_1         
	//   46   80:areturn         
	}

	public char[] getCharArray(String s, String s1)
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		if(s1 == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       88
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore          4
		else
	//*   9   15:aload_0         
	//*  10   16:iload           4
	//*  11   18:ldc1            #61  <String "Error: password is null!">
	//*  12   20:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   23:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  14   26:aload_1         
	//*  15   27:aload_2         
	//*  16   28:invokevirtual   #95  <Method byte[] SecureStorageJNI.get(String, String)>
	//*  17   31:astore_2        
	//*  18   32:aload_2         
	//*  19   33:ifnonnull       94
	//*  20   36:iload           5
	//*  21   38:istore          4
	//*  22   40:aload_0         
	//*  23   41:iload           4
	//*  24   43:ldc1            #58  <String "Error: input data are incorrect">
	//*  25   45:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  26   48:aload_2         
	//*  27   49:arraylength     
	//*  28   50:iconst_2        
	//*  29   51:idiv            
	//*  30   52:newarray        char[]
	//*  31   54:astore_1        
	//*  32   55:aload_2         
	//*  33   56:invokestatic    #119 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//*  34   59:astore_2        
	//*  35   60:aload_2         
	//*  36   61:invokevirtual   #123 <Method java.nio.Buffer ByteBuffer.rewind()>
	//*  37   64:pop             
	//*  38   65:iconst_0        
	//*  39   66:istore_3        
	//*  40   67:aload_2         
	//*  41   68:invokevirtual   #126 <Method boolean ByteBuffer.hasRemaining()>
	//*  42   71:ifeq            100
	//*  43   74:aload_1         
	//*  44   75:iload_3         
	//*  45   76:aload_2         
	//*  46   77:invokevirtual   #129 <Method char ByteBuffer.getChar()>
	//*  47   80:castore         
	//*  48   81:iload_3         
	//*  49   82:iconst_1        
	//*  50   83:iadd            
	//*  51   84:istore_3        
	//*  52   85:goto            67
			flag = false;
	//   53   88:iconst_0        
	//   54   89:istore          4
		throwException(flag, "Error: password is null!");
		s1 = ((String) (secureStorageJNI.get(s, s1)));
		if(s1 == null)
			flag = flag1;
		else
	//*  55   91:goto            15
			flag = false;
	//   56   94:iconst_0        
	//   57   95:istore          4
		throwException(flag, "Error: input data are incorrect");
		s = ((String) (new char[s1.length / 2]));
		s1 = ((String) (ByteBuffer.wrap(((byte []) (s1)))));
		((ByteBuffer) (s1)).rewind();
		for(int i = 0; ((ByteBuffer) (s1)).hasRemaining(); i++)
			s[i] = ((ByteBuffer) (s1)).getChar();

	//*  58   97:goto            40
		return ((char []) (s));
	//   59  100:aload_1         
	//   60  101:areturn         
	}

	public double getDouble(String s)
		throws SecureStorageException
	{
		throwException(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void throwException(String)>
		s = ((String) (secureStorageJNI.get(s)));
	//    3    5:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #81  <Method byte[] SecureStorageJNI.get(String)>
	//    6   12:astore_1        
		boolean flag;
		if(s == null)
	//*   7   13:aload_1         
	//*   8   14:ifnonnull       38
			flag = true;
	//    9   17:iconst_1        
	//   10   18:istore_2        
		else
	//*  11   19:aload_0         
	//*  12   20:iload_2         
	//*  13   21:ldc1            #58  <String "Error: input data are incorrect">
	//*  14   23:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  15   26:new             #83  <Class String>
	//*  16   29:dup             
	//*  17   30:aload_1         
	//*  18   31:invokespecial   #86  <Method void String(byte[])>
	//*  19   34:invokestatic    #137 <Method double Double.parseDouble(String)>
	//*  20   37:dreturn         
			flag = false;
	//   21   38:iconst_0        
	//   22   39:istore_2        
		throwException(flag, "Error: input data are incorrect");
		return Double.parseDouble(new String(((byte []) (s))));
	//*  23   40:goto            19
	}

	public double getDouble(String s, String s1)
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		if(s1 == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       56
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore_3        
		else
	//*   9   14:aload_0         
	//*  10   15:iload_3         
	//*  11   16:ldc1            #61  <String "Error: password is null!">
	//*  12   18:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   21:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  14   24:aload_1         
	//*  15   25:aload_2         
	//*  16   26:invokevirtual   #95  <Method byte[] SecureStorageJNI.get(String, String)>
	//*  17   29:astore_1        
	//*  18   30:aload_1         
	//*  19   31:ifnonnull       61
	//*  20   34:iload           4
	//*  21   36:istore_3        
	//*  22   37:aload_0         
	//*  23   38:iload_3         
	//*  24   39:ldc1            #58  <String "Error: input data are incorrect">
	//*  25   41:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  26   44:new             #83  <Class String>
	//*  27   47:dup             
	//*  28   48:aload_1         
	//*  29   49:invokespecial   #86  <Method void String(byte[])>
	//*  30   52:invokestatic    #137 <Method double Double.parseDouble(String)>
	//*  31   55:dreturn         
			flag = false;
	//   32   56:iconst_0        
	//   33   57:istore_3        
		throwException(flag, "Error: password is null!");
		s = ((String) (secureStorageJNI.get(s, s1)));
		if(s == null)
			flag = flag1;
		else
	//*  34   58:goto            14
			flag = false;
	//   35   61:iconst_0        
	//   36   62:istore_3        
		throwException(flag, "Error: input data are incorrect");
		return Double.parseDouble(new String(((byte []) (s))));
	//*  37   63:goto            37
	}

	public double[] getDoubleArray(String s)
		throws SecureStorageException
	{
		throwException(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void throwException(String)>
		byte abyte0[] = secureStorageJNI.get(s);
	//    3    5:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #81  <Method byte[] SecureStorageJNI.get(String)>
	//    6   12:astore          4
		boolean flag;
		ByteBuffer bytebuffer;
		if(abyte0 == null)
	//*   7   14:aload           4
	//*   8   16:ifnonnull       75
			flag = true;
	//    9   19:iconst_1        
	//   10   20:istore_3        
		else
	//*  11   21:aload_0         
	//*  12   22:iload_3         
	//*  13   23:ldc1            #58  <String "Error: input data are incorrect">
	//*  14   25:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  15   28:aload           4
	//*  16   30:arraylength     
	//*  17   31:bipush          8
	//*  18   33:idiv            
	//*  19   34:newarray        double[]
	//*  20   36:astore_1        
	//*  21   37:aload           4
	//*  22   39:invokestatic    #119 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//*  23   42:astore          4
	//*  24   44:aload           4
	//*  25   46:invokevirtual   #123 <Method java.nio.Buffer ByteBuffer.rewind()>
	//*  26   49:pop             
	//*  27   50:iconst_0        
	//*  28   51:istore_2        
	//*  29   52:aload           4
	//*  30   54:invokevirtual   #126 <Method boolean ByteBuffer.hasRemaining()>
	//*  31   57:ifeq            80
	//*  32   60:aload_1         
	//*  33   61:iload_2         
	//*  34   62:aload           4
	//*  35   64:invokevirtual   #143 <Method double ByteBuffer.getDouble()>
	//*  36   67:dastore         
	//*  37   68:iload_2         
	//*  38   69:iconst_1        
	//*  39   70:iadd            
	//*  40   71:istore_2        
	//*  41   72:goto            52
			flag = false;
	//   42   75:iconst_0        
	//   43   76:istore_3        
		throwException(flag, "Error: input data are incorrect");
		s = ((String) (new double[abyte0.length / 8]));
		bytebuffer = ByteBuffer.wrap(abyte0);
		bytebuffer.rewind();
		for(int i = 0; bytebuffer.hasRemaining(); i++)
			s[i] = bytebuffer.getDouble();

	//*  44   77:goto            21
		return ((double []) (s));
	//   45   80:aload_1         
	//   46   81:areturn         
	}

	public double[] getDoubleArray(String s, String s1)
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		if(s1 == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       89
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore          4
		else
	//*   9   15:aload_0         
	//*  10   16:iload           4
	//*  11   18:ldc1            #61  <String "Error: password is null!">
	//*  12   20:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   23:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  14   26:aload_1         
	//*  15   27:aload_2         
	//*  16   28:invokevirtual   #95  <Method byte[] SecureStorageJNI.get(String, String)>
	//*  17   31:astore_2        
	//*  18   32:aload_2         
	//*  19   33:ifnonnull       95
	//*  20   36:iload           5
	//*  21   38:istore          4
	//*  22   40:aload_0         
	//*  23   41:iload           4
	//*  24   43:ldc1            #58  <String "Error: input data are incorrect">
	//*  25   45:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  26   48:aload_2         
	//*  27   49:arraylength     
	//*  28   50:bipush          8
	//*  29   52:idiv            
	//*  30   53:newarray        double[]
	//*  31   55:astore_1        
	//*  32   56:aload_2         
	//*  33   57:invokestatic    #119 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//*  34   60:astore_2        
	//*  35   61:aload_2         
	//*  36   62:invokevirtual   #123 <Method java.nio.Buffer ByteBuffer.rewind()>
	//*  37   65:pop             
	//*  38   66:iconst_0        
	//*  39   67:istore_3        
	//*  40   68:aload_2         
	//*  41   69:invokevirtual   #126 <Method boolean ByteBuffer.hasRemaining()>
	//*  42   72:ifeq            101
	//*  43   75:aload_1         
	//*  44   76:iload_3         
	//*  45   77:aload_2         
	//*  46   78:invokevirtual   #143 <Method double ByteBuffer.getDouble()>
	//*  47   81:dastore         
	//*  48   82:iload_3         
	//*  49   83:iconst_1        
	//*  50   84:iadd            
	//*  51   85:istore_3        
	//*  52   86:goto            68
			flag = false;
	//   53   89:iconst_0        
	//   54   90:istore          4
		throwException(flag, "Error: password is null!");
		s1 = ((String) (secureStorageJNI.get(s, s1)));
		if(s1 == null)
			flag = flag1;
		else
	//*  55   92:goto            15
			flag = false;
	//   56   95:iconst_0        
	//   57   96:istore          4
		throwException(flag, "Error: input data are incorrect");
		s = ((String) (new double[s1.length / 8]));
		s1 = ((String) (ByteBuffer.wrap(((byte []) (s1)))));
		((ByteBuffer) (s1)).rewind();
		for(int i = 0; ((ByteBuffer) (s1)).hasRemaining(); i++)
			s[i] = ((ByteBuffer) (s1)).getDouble();

	//*  58   98:goto            40
		return ((double []) (s));
	//   59  101:aload_1         
	//   60  102:areturn         
	}

	public int getInt(String s)
		throws SecureStorageException
	{
		throwException(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void throwException(String)>
		s = ((String) (secureStorageJNI.get(s)));
	//    3    5:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #81  <Method byte[] SecureStorageJNI.get(String)>
	//    6   12:astore_1        
		boolean flag;
		if(s == null)
	//*   7   13:aload_1         
	//*   8   14:ifnonnull       38
			flag = true;
	//    9   17:iconst_1        
	//   10   18:istore_2        
		else
	//*  11   19:aload_0         
	//*  12   20:iload_2         
	//*  13   21:ldc1            #58  <String "Error: input data are incorrect">
	//*  14   23:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  15   26:new             #106 <Class BigInteger>
	//*  16   29:dup             
	//*  17   30:aload_1         
	//*  18   31:invokespecial   #107 <Method void BigInteger(byte[])>
	//*  19   34:invokevirtual   #110 <Method int BigInteger.intValue()>
	//*  20   37:ireturn         
			flag = false;
	//   21   38:iconst_0        
	//   22   39:istore_2        
		throwException(flag, "Error: input data are incorrect");
		return (new BigInteger(((byte []) (s)))).intValue();
	//*  23   40:goto            19
	}

	public int getInt(String s, String s1)
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		if(s1 == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       56
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore_3        
		else
	//*   9   14:aload_0         
	//*  10   15:iload_3         
	//*  11   16:ldc1            #61  <String "Error: password is null!">
	//*  12   18:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   21:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  14   24:aload_1         
	//*  15   25:aload_2         
	//*  16   26:invokevirtual   #95  <Method byte[] SecureStorageJNI.get(String, String)>
	//*  17   29:astore_1        
	//*  18   30:aload_1         
	//*  19   31:ifnonnull       61
	//*  20   34:iload           4
	//*  21   36:istore_3        
	//*  22   37:aload_0         
	//*  23   38:iload_3         
	//*  24   39:ldc1            #58  <String "Error: input data are incorrect">
	//*  25   41:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  26   44:new             #106 <Class BigInteger>
	//*  27   47:dup             
	//*  28   48:aload_1         
	//*  29   49:invokespecial   #107 <Method void BigInteger(byte[])>
	//*  30   52:invokevirtual   #110 <Method int BigInteger.intValue()>
	//*  31   55:ireturn         
			flag = false;
	//   32   56:iconst_0        
	//   33   57:istore_3        
		throwException(flag, "Error: password is null!");
		s = ((String) (secureStorageJNI.get(s, s1)));
		if(s == null)
			flag = flag1;
		else
	//*  34   58:goto            14
			flag = false;
	//   35   61:iconst_0        
	//   36   62:istore_3        
		throwException(flag, "Error: input data are incorrect");
		return (new BigInteger(((byte []) (s)))).intValue();
	//*  37   63:goto            37
	}

	public int[] getIntArray(String s)
		throws SecureStorageException
	{
		throwException(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void throwException(String)>
		byte abyte0[] = secureStorageJNI.get(s);
	//    3    5:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #81  <Method byte[] SecureStorageJNI.get(String)>
	//    6   12:astore          4
		boolean flag;
		ByteBuffer bytebuffer;
		if(abyte0 == null)
	//*   7   14:aload           4
	//*   8   16:ifnonnull       74
			flag = true;
	//    9   19:iconst_1        
	//   10   20:istore_3        
		else
	//*  11   21:aload_0         
	//*  12   22:iload_3         
	//*  13   23:ldc1            #58  <String "Error: input data are incorrect">
	//*  14   25:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  15   28:aload           4
	//*  16   30:arraylength     
	//*  17   31:iconst_4        
	//*  18   32:idiv            
	//*  19   33:newarray        int[]
	//*  20   35:astore_1        
	//*  21   36:aload           4
	//*  22   38:invokestatic    #119 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//*  23   41:astore          4
	//*  24   43:aload           4
	//*  25   45:invokevirtual   #123 <Method java.nio.Buffer ByteBuffer.rewind()>
	//*  26   48:pop             
	//*  27   49:iconst_0        
	//*  28   50:istore_2        
	//*  29   51:aload           4
	//*  30   53:invokevirtual   #126 <Method boolean ByteBuffer.hasRemaining()>
	//*  31   56:ifeq            79
	//*  32   59:aload_1         
	//*  33   60:iload_2         
	//*  34   61:aload           4
	//*  35   63:invokevirtual   #151 <Method int ByteBuffer.getInt()>
	//*  36   66:iastore         
	//*  37   67:iload_2         
	//*  38   68:iconst_1        
	//*  39   69:iadd            
	//*  40   70:istore_2        
	//*  41   71:goto            51
			flag = false;
	//   42   74:iconst_0        
	//   43   75:istore_3        
		throwException(flag, "Error: input data are incorrect");
		s = ((String) (new int[abyte0.length / 4]));
		bytebuffer = ByteBuffer.wrap(abyte0);
		bytebuffer.rewind();
		for(int i = 0; bytebuffer.hasRemaining(); i++)
			s[i] = bytebuffer.getInt();

	//*  44   76:goto            21
		return ((int []) (s));
	//   45   79:aload_1         
	//   46   80:areturn         
	}

	public int[] getIntArray(String s, String s1)
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		if(s1 == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       88
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore          4
		else
	//*   9   15:aload_0         
	//*  10   16:iload           4
	//*  11   18:ldc1            #61  <String "Error: password is null!">
	//*  12   20:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   23:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  14   26:aload_1         
	//*  15   27:aload_2         
	//*  16   28:invokevirtual   #95  <Method byte[] SecureStorageJNI.get(String, String)>
	//*  17   31:astore_2        
	//*  18   32:aload_2         
	//*  19   33:ifnonnull       94
	//*  20   36:iload           5
	//*  21   38:istore          4
	//*  22   40:aload_0         
	//*  23   41:iload           4
	//*  24   43:ldc1            #58  <String "Error: input data are incorrect">
	//*  25   45:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  26   48:aload_2         
	//*  27   49:arraylength     
	//*  28   50:iconst_4        
	//*  29   51:idiv            
	//*  30   52:newarray        int[]
	//*  31   54:astore_1        
	//*  32   55:aload_2         
	//*  33   56:invokestatic    #119 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//*  34   59:astore_2        
	//*  35   60:aload_2         
	//*  36   61:invokevirtual   #123 <Method java.nio.Buffer ByteBuffer.rewind()>
	//*  37   64:pop             
	//*  38   65:iconst_0        
	//*  39   66:istore_3        
	//*  40   67:aload_2         
	//*  41   68:invokevirtual   #126 <Method boolean ByteBuffer.hasRemaining()>
	//*  42   71:ifeq            100
	//*  43   74:aload_1         
	//*  44   75:iload_3         
	//*  45   76:aload_2         
	//*  46   77:invokevirtual   #151 <Method int ByteBuffer.getInt()>
	//*  47   80:iastore         
	//*  48   81:iload_3         
	//*  49   82:iconst_1        
	//*  50   83:iadd            
	//*  51   84:istore_3        
	//*  52   85:goto            67
			flag = false;
	//   53   88:iconst_0        
	//   54   89:istore          4
		throwException(flag, "Error: password is null!");
		s1 = ((String) (secureStorageJNI.get(s, s1)));
		if(s1 == null)
			flag = flag1;
		else
	//*  55   91:goto            15
			flag = false;
	//   56   94:iconst_0        
	//   57   95:istore          4
		throwException(flag, "Error: input data are incorrect");
		s = ((String) (new int[s1.length / 4]));
		s1 = ((String) (ByteBuffer.wrap(((byte []) (s1)))));
		((ByteBuffer) (s1)).rewind();
		for(int i = 0; ((ByteBuffer) (s1)).hasRemaining(); i++)
			s[i] = ((ByteBuffer) (s1)).getInt();

	//*  58   97:goto            40
		return ((int []) (s));
	//   59  100:aload_1         
	//   60  101:areturn         
	}

	public long getLong(String s)
		throws SecureStorageException
	{
		throwException(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void throwException(String)>
		s = ((String) (secureStorageJNI.get(s)));
	//    3    5:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #81  <Method byte[] SecureStorageJNI.get(String)>
	//    6   12:astore_1        
		boolean flag;
		if(s == null)
	//*   7   13:aload_1         
	//*   8   14:ifnonnull       38
			flag = true;
	//    9   17:iconst_1        
	//   10   18:istore_2        
		else
	//*  11   19:aload_0         
	//*  12   20:iload_2         
	//*  13   21:ldc1            #58  <String "Error: input data are incorrect">
	//*  14   23:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  15   26:new             #106 <Class BigInteger>
	//*  16   29:dup             
	//*  17   30:aload_1         
	//*  18   31:invokespecial   #107 <Method void BigInteger(byte[])>
	//*  19   34:invokevirtual   #158 <Method long BigInteger.longValue()>
	//*  20   37:lreturn         
			flag = false;
	//   21   38:iconst_0        
	//   22   39:istore_2        
		throwException(flag, "Error: input data are incorrect");
		return (new BigInteger(((byte []) (s)))).longValue();
	//*  23   40:goto            19
	}

	public long getLong(String s, String s1)
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		if(s1 == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       56
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore_3        
		else
	//*   9   14:aload_0         
	//*  10   15:iload_3         
	//*  11   16:ldc1            #61  <String "Error: password is null!">
	//*  12   18:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   21:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  14   24:aload_1         
	//*  15   25:aload_2         
	//*  16   26:invokevirtual   #95  <Method byte[] SecureStorageJNI.get(String, String)>
	//*  17   29:astore_1        
	//*  18   30:aload_1         
	//*  19   31:ifnonnull       61
	//*  20   34:iload           4
	//*  21   36:istore_3        
	//*  22   37:aload_0         
	//*  23   38:iload_3         
	//*  24   39:ldc1            #58  <String "Error: input data are incorrect">
	//*  25   41:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  26   44:new             #106 <Class BigInteger>
	//*  27   47:dup             
	//*  28   48:aload_1         
	//*  29   49:invokespecial   #107 <Method void BigInteger(byte[])>
	//*  30   52:invokevirtual   #158 <Method long BigInteger.longValue()>
	//*  31   55:lreturn         
			flag = false;
	//   32   56:iconst_0        
	//   33   57:istore_3        
		throwException(flag, "Error: password is null!");
		s = ((String) (secureStorageJNI.get(s, s1)));
		if(s == null)
			flag = flag1;
		else
	//*  34   58:goto            14
			flag = false;
	//   35   61:iconst_0        
	//   36   62:istore_3        
		throwException(flag, "Error: input data are incorrect");
		return (new BigInteger(((byte []) (s)))).longValue();
	//*  37   63:goto            37
	}

	public long[] getLongArray(String s)
		throws SecureStorageException
	{
		throwException(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void throwException(String)>
		byte abyte0[] = secureStorageJNI.get(s);
	//    3    5:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #81  <Method byte[] SecureStorageJNI.get(String)>
	//    6   12:astore          4
		boolean flag;
		ByteBuffer bytebuffer;
		if(abyte0 == null)
	//*   7   14:aload           4
	//*   8   16:ifnonnull       75
			flag = true;
	//    9   19:iconst_1        
	//   10   20:istore_3        
		else
	//*  11   21:aload_0         
	//*  12   22:iload_3         
	//*  13   23:ldc1            #58  <String "Error: input data are incorrect">
	//*  14   25:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  15   28:aload           4
	//*  16   30:arraylength     
	//*  17   31:bipush          8
	//*  18   33:idiv            
	//*  19   34:newarray        long[]
	//*  20   36:astore_1        
	//*  21   37:aload           4
	//*  22   39:invokestatic    #119 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//*  23   42:astore          4
	//*  24   44:aload           4
	//*  25   46:invokevirtual   #123 <Method java.nio.Buffer ByteBuffer.rewind()>
	//*  26   49:pop             
	//*  27   50:iconst_0        
	//*  28   51:istore_2        
	//*  29   52:aload           4
	//*  30   54:invokevirtual   #126 <Method boolean ByteBuffer.hasRemaining()>
	//*  31   57:ifeq            80
	//*  32   60:aload_1         
	//*  33   61:iload_2         
	//*  34   62:aload           4
	//*  35   64:invokevirtual   #163 <Method long ByteBuffer.getLong()>
	//*  36   67:lastore         
	//*  37   68:iload_2         
	//*  38   69:iconst_1        
	//*  39   70:iadd            
	//*  40   71:istore_2        
	//*  41   72:goto            52
			flag = false;
	//   42   75:iconst_0        
	//   43   76:istore_3        
		throwException(flag, "Error: input data are incorrect");
		s = ((String) (new long[abyte0.length / 8]));
		bytebuffer = ByteBuffer.wrap(abyte0);
		bytebuffer.rewind();
		for(int i = 0; bytebuffer.hasRemaining(); i++)
			s[i] = bytebuffer.getLong();

	//*  44   77:goto            21
		return ((long []) (s));
	//   45   80:aload_1         
	//   46   81:areturn         
	}

	public long[] getLongArray(String s, String s1)
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		if(s1 == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       89
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore          4
		else
	//*   9   15:aload_0         
	//*  10   16:iload           4
	//*  11   18:ldc1            #61  <String "Error: password is null!">
	//*  12   20:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   23:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  14   26:aload_1         
	//*  15   27:aload_2         
	//*  16   28:invokevirtual   #95  <Method byte[] SecureStorageJNI.get(String, String)>
	//*  17   31:astore_2        
	//*  18   32:aload_2         
	//*  19   33:ifnonnull       95
	//*  20   36:iload           5
	//*  21   38:istore          4
	//*  22   40:aload_0         
	//*  23   41:iload           4
	//*  24   43:ldc1            #58  <String "Error: input data are incorrect">
	//*  25   45:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  26   48:aload_2         
	//*  27   49:arraylength     
	//*  28   50:bipush          8
	//*  29   52:idiv            
	//*  30   53:newarray        long[]
	//*  31   55:astore_1        
	//*  32   56:aload_2         
	//*  33   57:invokestatic    #119 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//*  34   60:astore_2        
	//*  35   61:aload_2         
	//*  36   62:invokevirtual   #123 <Method java.nio.Buffer ByteBuffer.rewind()>
	//*  37   65:pop             
	//*  38   66:iconst_0        
	//*  39   67:istore_3        
	//*  40   68:aload_2         
	//*  41   69:invokevirtual   #126 <Method boolean ByteBuffer.hasRemaining()>
	//*  42   72:ifeq            101
	//*  43   75:aload_1         
	//*  44   76:iload_3         
	//*  45   77:aload_2         
	//*  46   78:invokevirtual   #163 <Method long ByteBuffer.getLong()>
	//*  47   81:lastore         
	//*  48   82:iload_3         
	//*  49   83:iconst_1        
	//*  50   84:iadd            
	//*  51   85:istore_3        
	//*  52   86:goto            68
			flag = false;
	//   53   89:iconst_0        
	//   54   90:istore          4
		throwException(flag, "Error: password is null!");
		s1 = ((String) (secureStorageJNI.get(s, s1)));
		if(s1 == null)
			flag = flag1;
		else
	//*  55   92:goto            15
			flag = false;
	//   56   95:iconst_0        
	//   57   96:istore          4
		throwException(flag, "Error: input data are incorrect");
		s = ((String) (new long[s1.length / 8]));
		s1 = ((String) (ByteBuffer.wrap(((byte []) (s1)))));
		((ByteBuffer) (s1)).rewind();
		for(int i = 0; ((ByteBuffer) (s1)).hasRemaining(); i++)
			s[i] = ((ByteBuffer) (s1)).getLong();

	//*  58   98:goto            40
		return ((long []) (s));
	//   59  101:aload_1         
	//   60  102:areturn         
	}

	public String getString(String s)
		throws SecureStorageException
	{
		throwException(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void throwException(String)>
		s = ((String) (secureStorageJNI.get(s)));
	//    3    5:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #81  <Method byte[] SecureStorageJNI.get(String)>
	//    6   12:astore_1        
		boolean flag;
		if(s == null)
	//*   7   13:aload_1         
	//*   8   14:ifnonnull       35
			flag = true;
	//    9   17:iconst_1        
	//   10   18:istore_2        
		else
	//*  11   19:aload_0         
	//*  12   20:iload_2         
	//*  13   21:ldc1            #58  <String "Error: input data are incorrect">
	//*  14   23:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  15   26:new             #83  <Class String>
	//*  16   29:dup             
	//*  17   30:aload_1         
	//*  18   31:invokespecial   #86  <Method void String(byte[])>
	//*  19   34:areturn         
			flag = false;
	//   20   35:iconst_0        
	//   21   36:istore_2        
		throwException(flag, "Error: input data are incorrect");
		return new String(((byte []) (s)));
	//*  22   37:goto            19
	}

	public String getString(String s, String s1)
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		if(s1 == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       53
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore_3        
		else
	//*   9   14:aload_0         
	//*  10   15:iload_3         
	//*  11   16:ldc1            #61  <String "Error: password is null!">
	//*  12   18:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   21:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  14   24:aload_1         
	//*  15   25:aload_2         
	//*  16   26:invokevirtual   #95  <Method byte[] SecureStorageJNI.get(String, String)>
	//*  17   29:astore_1        
	//*  18   30:aload_1         
	//*  19   31:ifnonnull       58
	//*  20   34:iload           4
	//*  21   36:istore_3        
	//*  22   37:aload_0         
	//*  23   38:iload_3         
	//*  24   39:ldc1            #58  <String "Error: input data are incorrect">
	//*  25   41:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  26   44:new             #83  <Class String>
	//*  27   47:dup             
	//*  28   48:aload_1         
	//*  29   49:invokespecial   #86  <Method void String(byte[])>
	//*  30   52:areturn         
			flag = false;
	//   31   53:iconst_0        
	//   32   54:istore_3        
		throwException(flag, "Error: password is null!");
		s = ((String) (secureStorageJNI.get(s, s1)));
		if(s == null)
			flag = flag1;
		else
	//*  33   55:goto            14
			flag = false;
	//   34   58:iconst_0        
	//   35   59:istore_3        
		throwException(flag, "Error: input data are incorrect");
		return new String(((byte []) (s)));
	//*  36   60:goto            37
	}

	public boolean put(String s, byte byte0)
		throws SecureStorageException
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		throwException(s);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokespecial   #67  <Method void throwException(String)>
		boolean flag1 = secureStorageJNI.put(s, new byte[] {
			byte0
		});
	//    5    7:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//    6   10:aload_1         
	//    7   11:iconst_1        
	//    8   12:newarray        byte[]
	//    9   14:dup             
	//   10   15:iconst_0        
	//   11   16:iload_2         
	//   12   17:bastore         
	//   13   18:invokevirtual   #172 <Method boolean SecureStorageJNI.put(String, byte[])>
	//   14   21:istore          4
		if(flag1)
	//*  15   23:iload           4
	//*  16   25:ifne            38
	//*  17   28:aload_0         
	//*  18   29:iload_3         
	//*  19   30:ldc1            #174 <String "Error saving data">
	//*  20   32:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  21   35:iload           4
	//*  22   37:ireturn         
			flag = false;
	//   23   38:iconst_0        
	//   24   39:istore_3        
		throwException(flag, "Error saving data");
		return flag1;
	//*  25   40:goto            28
	}

	public boolean put(String s, byte byte0, String s1)
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		boolean flag2;
		if(s1 == null)
	//*   5    8:aload_3         
	//*   6    9:ifnonnull       60
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore          4
		else
	//*   9   15:aload_0         
	//*  10   16:iload           4
	//*  11   18:ldc1            #61  <String "Error: password is null!">
	//*  12   20:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   23:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  14   26:aload_1         
	//*  15   27:iconst_1        
	//*  16   28:newarray        byte[]
	//*  17   30:dup             
	//*  18   31:iconst_0        
	//*  19   32:iload_2         
	//*  20   33:bastore         
	//*  21   34:aload_3         
	//*  22   35:invokevirtual   #178 <Method boolean SecureStorageJNI.put(String, byte[], String)>
	//*  23   38:istore          6
	//*  24   40:iload           6
	//*  25   42:ifne            66
	//*  26   45:iload           5
	//*  27   47:istore          4
	//*  28   49:aload_0         
	//*  29   50:iload           4
	//*  30   52:ldc1            #174 <String "Error saving data">
	//*  31   54:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  32   57:iload           6
	//*  33   59:ireturn         
			flag = false;
	//   34   60:iconst_0        
	//   35   61:istore          4
		throwException(flag, "Error: password is null!");
		flag2 = secureStorageJNI.put(s, new byte[] {
			byte0
		}, s1);
		if(!flag2)
			flag = flag1;
		else
	//*  36   63:goto            15
			flag = false;
	//   37   66:iconst_0        
	//   38   67:istore          4
		throwException(flag, "Error saving data");
		return flag2;
	//*  39   69:goto            49
	}

	public boolean put(String s, char c)
		throws SecureStorageException
	{
		throwException(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void throwException(String)>
		boolean flag1 = secureStorageJNI.put(s, BigInteger.valueOf(c).toByteArray());
	//    3    5:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:i2l             
	//    7   11:invokestatic    #183 <Method BigInteger BigInteger.valueOf(long)>
	//    8   14:invokevirtual   #187 <Method byte[] BigInteger.toByteArray()>
	//    9   17:invokevirtual   #172 <Method boolean SecureStorageJNI.put(String, byte[])>
	//   10   20:istore          4
		boolean flag;
		if(!flag1)
	//*  11   22:iload           4
	//*  12   24:ifne            39
			flag = true;
	//   13   27:iconst_1        
	//   14   28:istore_3        
		else
	//*  15   29:aload_0         
	//*  16   30:iload_3         
	//*  17   31:ldc1            #174 <String "Error saving data">
	//*  18   33:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  19   36:iload           4
	//*  20   38:ireturn         
			flag = false;
	//   21   39:iconst_0        
	//   22   40:istore_3        
		throwException(flag, "Error saving data");
		return flag1;
	//*  23   41:goto            29
	}

	public boolean put(String s, char c, String s1)
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		boolean flag2;
		if(s1 == null)
	//*   5    8:aload_3         
	//*   6    9:ifnonnull       61
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore          4
		else
	//*   9   15:aload_0         
	//*  10   16:iload           4
	//*  11   18:ldc1            #61  <String "Error: password is null!">
	//*  12   20:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   23:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  14   26:aload_1         
	//*  15   27:iload_2         
	//*  16   28:i2l             
	//*  17   29:invokestatic    #183 <Method BigInteger BigInteger.valueOf(long)>
	//*  18   32:invokevirtual   #187 <Method byte[] BigInteger.toByteArray()>
	//*  19   35:aload_3         
	//*  20   36:invokevirtual   #178 <Method boolean SecureStorageJNI.put(String, byte[], String)>
	//*  21   39:istore          6
	//*  22   41:iload           6
	//*  23   43:ifne            67
	//*  24   46:iload           5
	//*  25   48:istore          4
	//*  26   50:aload_0         
	//*  27   51:iload           4
	//*  28   53:ldc1            #174 <String "Error saving data">
	//*  29   55:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  30   58:iload           6
	//*  31   60:ireturn         
			flag = false;
	//   32   61:iconst_0        
	//   33   62:istore          4
		throwException(flag, "Error: password is null!");
		flag2 = secureStorageJNI.put(s, BigInteger.valueOf(c).toByteArray(), s1);
		if(!flag2)
			flag = flag1;
		else
	//*  34   64:goto            15
			flag = false;
	//   35   67:iconst_0        
	//   36   68:istore          4
		throwException(flag, "Error saving data");
		return flag2;
	//*  37   70:goto            50
	}

	public boolean put(String s, double d)
		throws SecureStorageException
	{
		throwException(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void throwException(String)>
		String s1 = (new StringBuilder()).append(d).append("").toString();
	//    3    5:new             #191 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #192 <Method void StringBuilder()>
	//    6   12:dload_2         
	//    7   13:invokevirtual   #196 <Method StringBuilder StringBuilder.append(double)>
	//    8   16:ldc1            #198 <String "">
	//    9   18:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//   10   21:invokevirtual   #205 <Method String StringBuilder.toString()>
	//   11   24:astore          6
		boolean flag1 = secureStorageJNI.put(s, s1.getBytes());
	//   12   26:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//   13   29:aload_1         
	//   14   30:aload           6
	//   15   32:invokevirtual   #208 <Method byte[] String.getBytes()>
	//   16   35:invokevirtual   #172 <Method boolean SecureStorageJNI.put(String, byte[])>
	//   17   38:istore          5
		boolean flag;
		if(!flag1)
	//*  18   40:iload           5
	//*  19   42:ifne            59
			flag = true;
	//   20   45:iconst_1        
	//   21   46:istore          4
		else
	//*  22   48:aload_0         
	//*  23   49:iload           4
	//*  24   51:ldc1            #174 <String "Error saving data">
	//*  25   53:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  26   56:iload           5
	//*  27   58:ireturn         
			flag = false;
	//   28   59:iconst_0        
	//   29   60:istore          4
		throwException(flag, "Error saving data");
		return flag1;
	//*  30   62:goto            48
	}

	public boolean put(String s, double d, String s1)
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          6
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		boolean flag2;
		String s2;
		if(s1 == null)
	//*   5    8:aload           4
	//*   6   10:ifnonnull       81
			flag = true;
	//    7   13:iconst_1        
	//    8   14:istore          5
		else
	//*   9   16:aload_0         
	//*  10   17:iload           5
	//*  11   19:ldc1            #61  <String "Error: password is null!">
	//*  12   21:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   24:new             #191 <Class StringBuilder>
	//*  14   27:dup             
	//*  15   28:invokespecial   #192 <Method void StringBuilder()>
	//*  16   31:dload_2         
	//*  17   32:invokevirtual   #196 <Method StringBuilder StringBuilder.append(double)>
	//*  18   35:ldc1            #198 <String "">
	//*  19   37:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//*  20   40:invokevirtual   #205 <Method String StringBuilder.toString()>
	//*  21   43:astore          8
	//*  22   45:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  23   48:aload_1         
	//*  24   49:aload           8
	//*  25   51:invokevirtual   #208 <Method byte[] String.getBytes()>
	//*  26   54:aload           4
	//*  27   56:invokevirtual   #178 <Method boolean SecureStorageJNI.put(String, byte[], String)>
	//*  28   59:istore          7
	//*  29   61:iload           7
	//*  30   63:ifne            87
	//*  31   66:iload           6
	//*  32   68:istore          5
	//*  33   70:aload_0         
	//*  34   71:iload           5
	//*  35   73:ldc1            #174 <String "Error saving data">
	//*  36   75:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  37   78:iload           7
	//*  38   80:ireturn         
			flag = false;
	//   39   81:iconst_0        
	//   40   82:istore          5
		throwException(flag, "Error: password is null!");
		s2 = (new StringBuilder()).append(d).append("").toString();
		flag2 = secureStorageJNI.put(s, s2.getBytes(), s1);
		if(!flag2)
			flag = flag1;
		else
	//*  41   84:goto            16
			flag = false;
	//   42   87:iconst_0        
	//   43   88:istore          5
		throwException(flag, "Error saving data");
		return flag2;
	//*  44   90:goto            70
	}

	public boolean put(String s, int i)
		throws SecureStorageException
	{
		throwException(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void throwException(String)>
		boolean flag1 = secureStorageJNI.put(s, BigInteger.valueOf(i).toByteArray());
	//    3    5:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:i2l             
	//    7   11:invokestatic    #183 <Method BigInteger BigInteger.valueOf(long)>
	//    8   14:invokevirtual   #187 <Method byte[] BigInteger.toByteArray()>
	//    9   17:invokevirtual   #172 <Method boolean SecureStorageJNI.put(String, byte[])>
	//   10   20:istore          4
		boolean flag;
		if(!flag1)
	//*  11   22:iload           4
	//*  12   24:ifne            39
			flag = true;
	//   13   27:iconst_1        
	//   14   28:istore_3        
		else
	//*  15   29:aload_0         
	//*  16   30:iload_3         
	//*  17   31:ldc1            #174 <String "Error saving data">
	//*  18   33:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  19   36:iload           4
	//*  20   38:ireturn         
			flag = false;
	//   21   39:iconst_0        
	//   22   40:istore_3        
		throwException(flag, "Error saving data");
		return flag1;
	//*  23   41:goto            29
	}

	public boolean put(String s, int i, String s1)
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		boolean flag2;
		if(s1 == null)
	//*   5    8:aload_3         
	//*   6    9:ifnonnull       61
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore          4
		else
	//*   9   15:aload_0         
	//*  10   16:iload           4
	//*  11   18:ldc1            #61  <String "Error: password is null!">
	//*  12   20:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   23:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  14   26:aload_1         
	//*  15   27:iload_2         
	//*  16   28:i2l             
	//*  17   29:invokestatic    #183 <Method BigInteger BigInteger.valueOf(long)>
	//*  18   32:invokevirtual   #187 <Method byte[] BigInteger.toByteArray()>
	//*  19   35:aload_3         
	//*  20   36:invokevirtual   #178 <Method boolean SecureStorageJNI.put(String, byte[], String)>
	//*  21   39:istore          6
	//*  22   41:iload           6
	//*  23   43:ifne            67
	//*  24   46:iload           5
	//*  25   48:istore          4
	//*  26   50:aload_0         
	//*  27   51:iload           4
	//*  28   53:ldc1            #174 <String "Error saving data">
	//*  29   55:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  30   58:iload           6
	//*  31   60:ireturn         
			flag = false;
	//   32   61:iconst_0        
	//   33   62:istore          4
		throwException(flag, "Error: password is null!");
		flag2 = secureStorageJNI.put(s, BigInteger.valueOf(i).toByteArray(), s1);
		if(!flag2)
			flag = flag1;
		else
	//*  34   64:goto            15
			flag = false;
	//   35   67:iconst_0        
	//   36   68:istore          4
		throwException(flag, "Error saving data");
		return flag2;
	//*  37   70:goto            50
	}

	public boolean put(String s, long l)
		throws SecureStorageException
	{
		throwException(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void throwException(String)>
		boolean flag1 = secureStorageJNI.put(s, BigInteger.valueOf(l).toByteArray());
	//    3    5:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//    4    8:aload_1         
	//    5    9:lload_2         
	//    6   10:invokestatic    #183 <Method BigInteger BigInteger.valueOf(long)>
	//    7   13:invokevirtual   #187 <Method byte[] BigInteger.toByteArray()>
	//    8   16:invokevirtual   #172 <Method boolean SecureStorageJNI.put(String, byte[])>
	//    9   19:istore          5
		boolean flag;
		if(!flag1)
	//*  10   21:iload           5
	//*  11   23:ifne            40
			flag = true;
	//   12   26:iconst_1        
	//   13   27:istore          4
		else
	//*  14   29:aload_0         
	//*  15   30:iload           4
	//*  16   32:ldc1            #174 <String "Error saving data">
	//*  17   34:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  18   37:iload           5
	//*  19   39:ireturn         
			flag = false;
	//   20   40:iconst_0        
	//   21   41:istore          4
		throwException(flag, "Error saving data");
		return flag1;
	//*  22   43:goto            29
	}

	public boolean put(String s, long l, String s1)
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          6
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		boolean flag2;
		if(s1 == null)
	//*   5    8:aload           4
	//*   6   10:ifnonnull       62
			flag = true;
	//    7   13:iconst_1        
	//    8   14:istore          5
		else
	//*   9   16:aload_0         
	//*  10   17:iload           5
	//*  11   19:ldc1            #61  <String "Error: password is null!">
	//*  12   21:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   24:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  14   27:aload_1         
	//*  15   28:lload_2         
	//*  16   29:invokestatic    #183 <Method BigInteger BigInteger.valueOf(long)>
	//*  17   32:invokevirtual   #187 <Method byte[] BigInteger.toByteArray()>
	//*  18   35:aload           4
	//*  19   37:invokevirtual   #178 <Method boolean SecureStorageJNI.put(String, byte[], String)>
	//*  20   40:istore          7
	//*  21   42:iload           7
	//*  22   44:ifne            68
	//*  23   47:iload           6
	//*  24   49:istore          5
	//*  25   51:aload_0         
	//*  26   52:iload           5
	//*  27   54:ldc1            #174 <String "Error saving data">
	//*  28   56:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  29   59:iload           7
	//*  30   61:ireturn         
			flag = false;
	//   31   62:iconst_0        
	//   32   63:istore          5
		throwException(flag, "Error: password is null!");
		flag2 = secureStorageJNI.put(s, BigInteger.valueOf(l).toByteArray(), s1);
		if(!flag2)
			flag = flag1;
		else
	//*  33   65:goto            16
			flag = false;
	//   34   68:iconst_0        
	//   35   69:istore          5
		throwException(flag, "Error saving data");
		return flag2;
	//*  36   71:goto            51
	}

	public boolean put(String s, String s1)
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		boolean flag2;
		if(s1 == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       52
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore_3        
		else
	//*   9   14:aload_0         
	//*  10   15:iload_3         
	//*  11   16:ldc1            #52  <String "Error: data block is null">
	//*  12   18:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   21:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  14   24:aload_1         
	//*  15   25:aload_2         
	//*  16   26:invokevirtual   #208 <Method byte[] String.getBytes()>
	//*  17   29:invokevirtual   #172 <Method boolean SecureStorageJNI.put(String, byte[])>
	//*  18   32:istore          5
	//*  19   34:iload           5
	//*  20   36:ifne            57
	//*  21   39:iload           4
	//*  22   41:istore_3        
	//*  23   42:aload_0         
	//*  24   43:iload_3         
	//*  25   44:ldc1            #174 <String "Error saving data">
	//*  26   46:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  27   49:iload           5
	//*  28   51:ireturn         
			flag = false;
	//   29   52:iconst_0        
	//   30   53:istore_3        
		throwException(flag, "Error: data block is null");
		flag2 = secureStorageJNI.put(s, s1.getBytes());
		if(!flag2)
			flag = flag1;
		else
	//*  31   54:goto            14
			flag = false;
	//   32   57:iconst_0        
	//   33   58:istore_3        
		throwException(flag, "Error saving data");
		return flag2;
	//*  34   59:goto            42
	}

	public boolean put(String s, String s1, String s2)
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		boolean flag2;
		if(s1 == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       72
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore          4
		else
	//*   9   15:aload_0         
	//*  10   16:iload           4
	//*  11   18:ldc1            #52  <String "Error: data block is null">
	//*  12   20:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   23:aload_3         
	//*  14   24:ifnonnull       78
	//*  15   27:iconst_1        
	//*  16   28:istore          4
	//*  17   30:aload_0         
	//*  18   31:iload           4
	//*  19   33:ldc1            #61  <String "Error: password is null!">
	//*  20   35:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  21   38:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  22   41:aload_1         
	//*  23   42:aload_2         
	//*  24   43:invokevirtual   #208 <Method byte[] String.getBytes()>
	//*  25   46:aload_3         
	//*  26   47:invokevirtual   #178 <Method boolean SecureStorageJNI.put(String, byte[], String)>
	//*  27   50:istore          6
	//*  28   52:iload           6
	//*  29   54:ifne            84
	//*  30   57:iload           5
	//*  31   59:istore          4
	//*  32   61:aload_0         
	//*  33   62:iload           4
	//*  34   64:ldc1            #174 <String "Error saving data">
	//*  35   66:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  36   69:iload           6
	//*  37   71:ireturn         
			flag = false;
	//   38   72:iconst_0        
	//   39   73:istore          4
		throwException(flag, "Error: data block is null");
		if(s2 == null)
			flag = true;
		else
	//*  40   75:goto            15
			flag = false;
	//   41   78:iconst_0        
	//   42   79:istore          4
		throwException(flag, "Error: password is null!");
		flag2 = secureStorageJNI.put(s, s1.getBytes(), s2);
		if(!flag2)
			flag = flag1;
		else
	//*  43   81:goto            30
			flag = false;
	//   44   84:iconst_0        
	//   45   85:istore          4
		throwException(flag, "Error saving data");
		return flag2;
	//*  46   87:goto            61
	}

	public boolean put(String s, boolean flag)
		throws SecureStorageException
	{
		throwException(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void throwException(String)>
		String s1 = (new StringBuilder()).append(flag).append("").toString();
	//    3    5:new             #191 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #192 <Method void StringBuilder()>
	//    6   12:iload_2         
	//    7   13:invokevirtual   #218 <Method StringBuilder StringBuilder.append(boolean)>
	//    8   16:ldc1            #198 <String "">
	//    9   18:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//   10   21:invokevirtual   #205 <Method String StringBuilder.toString()>
	//   11   24:astore          4
		boolean flag1 = secureStorageJNI.put(s, s1.getBytes());
	//   12   26:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//   13   29:aload_1         
	//   14   30:aload           4
	//   15   32:invokevirtual   #208 <Method byte[] String.getBytes()>
	//   16   35:invokevirtual   #172 <Method boolean SecureStorageJNI.put(String, byte[])>
	//   17   38:istore_3        
		if(!flag1)
	//*  18   39:iload_3         
	//*  19   40:ifne            54
			flag = true;
	//   20   43:iconst_1        
	//   21   44:istore_2        
		else
	//*  22   45:aload_0         
	//*  23   46:iload_2         
	//*  24   47:ldc1            #174 <String "Error saving data">
	//*  25   49:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  26   52:iload_3         
	//*  27   53:ireturn         
			flag = false;
	//   28   54:iconst_0        
	//   29   55:istore_2        
		throwException(flag, "Error saving data");
		return flag1;
	//*  30   56:goto            45
	}

	public boolean put(String s, boolean flag, String s1)
		throws SecureStorageException
	{
		boolean flag2 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag1;
		String s2;
		if(s1 == null)
	//*   5    8:aload_3         
	//*   6    9:ifnonnull       77
			flag1 = true;
	//    7   12:iconst_1        
	//    8   13:istore          4
		else
	//*   9   15:aload_0         
	//*  10   16:iload           4
	//*  11   18:ldc1            #61  <String "Error: password is null!">
	//*  12   20:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   23:new             #191 <Class StringBuilder>
	//*  14   26:dup             
	//*  15   27:invokespecial   #192 <Method void StringBuilder()>
	//*  16   30:iload_2         
	//*  17   31:invokevirtual   #218 <Method StringBuilder StringBuilder.append(boolean)>
	//*  18   34:ldc1            #198 <String "">
	//*  19   36:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//*  20   39:invokevirtual   #205 <Method String StringBuilder.toString()>
	//*  21   42:astore          6
	//*  22   44:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  23   47:aload_1         
	//*  24   48:aload           6
	//*  25   50:invokevirtual   #208 <Method byte[] String.getBytes()>
	//*  26   53:aload_3         
	//*  27   54:invokevirtual   #178 <Method boolean SecureStorageJNI.put(String, byte[], String)>
	//*  28   57:istore          4
	//*  29   59:iload           4
	//*  30   61:ifne            83
	//*  31   64:iload           5
	//*  32   66:istore_2        
	//*  33   67:aload_0         
	//*  34   68:iload_2         
	//*  35   69:ldc1            #174 <String "Error saving data">
	//*  36   71:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  37   74:iload           4
	//*  38   76:ireturn         
			flag1 = false;
	//   39   77:iconst_0        
	//   40   78:istore          4
		throwException(flag1, "Error: password is null!");
		s2 = (new StringBuilder()).append(flag).append("").toString();
		flag1 = secureStorageJNI.put(s, s2.getBytes(), s1);
		if(!flag1)
			flag = flag2;
		else
	//*  41   80:goto            15
			flag = false;
	//   42   83:iconst_0        
	//   43   84:istore_2        
		throwException(flag, "Error saving data");
		return flag1;
	//*  44   85:goto            67
	}

	public boolean put(String s, byte abyte0[])
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		boolean flag2;
		if(abyte0 == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       49
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore_3        
		else
	//*   9   14:aload_0         
	//*  10   15:iload_3         
	//*  11   16:ldc1            #52  <String "Error: data block is null">
	//*  12   18:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   21:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  14   24:aload_1         
	//*  15   25:aload_2         
	//*  16   26:invokevirtual   #172 <Method boolean SecureStorageJNI.put(String, byte[])>
	//*  17   29:istore          5
	//*  18   31:iload           5
	//*  19   33:ifne            54
	//*  20   36:iload           4
	//*  21   38:istore_3        
	//*  22   39:aload_0         
	//*  23   40:iload_3         
	//*  24   41:ldc1            #174 <String "Error saving data">
	//*  25   43:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  26   46:iload           5
	//*  27   48:ireturn         
			flag = false;
	//   28   49:iconst_0        
	//   29   50:istore_3        
		throwException(flag, "Error: data block is null");
		flag2 = secureStorageJNI.put(s, abyte0);
		if(!flag2)
			flag = flag1;
		else
	//*  30   51:goto            14
			flag = false;
	//   31   54:iconst_0        
	//   32   55:istore_3        
		throwException(flag, "Error saving data");
		return flag2;
	//*  33   56:goto            39
	}

	public boolean put(String s, byte abyte0[], String s1)
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		boolean flag2;
		if(abyte0 == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       69
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore          4
		else
	//*   9   15:aload_0         
	//*  10   16:iload           4
	//*  11   18:ldc1            #52  <String "Error: data block is null">
	//*  12   20:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   23:aload_3         
	//*  14   24:ifnonnull       75
	//*  15   27:iconst_1        
	//*  16   28:istore          4
	//*  17   30:aload_0         
	//*  18   31:iload           4
	//*  19   33:ldc1            #61  <String "Error: password is null!">
	//*  20   35:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  21   38:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  22   41:aload_1         
	//*  23   42:aload_2         
	//*  24   43:aload_3         
	//*  25   44:invokevirtual   #178 <Method boolean SecureStorageJNI.put(String, byte[], String)>
	//*  26   47:istore          6
	//*  27   49:iload           6
	//*  28   51:ifne            81
	//*  29   54:iload           5
	//*  30   56:istore          4
	//*  31   58:aload_0         
	//*  32   59:iload           4
	//*  33   61:ldc1            #174 <String "Error saving data">
	//*  34   63:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  35   66:iload           6
	//*  36   68:ireturn         
			flag = false;
	//   37   69:iconst_0        
	//   38   70:istore          4
		throwException(flag, "Error: data block is null");
		if(s1 == null)
			flag = true;
		else
	//*  39   72:goto            15
			flag = false;
	//   40   75:iconst_0        
	//   41   76:istore          4
		throwException(flag, "Error: password is null!");
		flag2 = secureStorageJNI.put(s, abyte0, s1);
		if(!flag2)
			flag = flag1;
		else
	//*  42   78:goto            30
			flag = false;
	//   43   81:iconst_0        
	//   44   82:istore          4
		throwException(flag, "Error saving data");
		return flag2;
	//*  45   84:goto            58
	}

	public boolean put(String s, char ac[])
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		boolean flag2;
		ByteBuffer bytebuffer;
		if(ac == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       72
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore_3        
		else
	//*   9   14:aload_0         
	//*  10   15:iload_3         
	//*  11   16:ldc1            #52  <String "Error: data block is null">
	//*  12   18:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   21:aload_2         
	//*  14   22:arraylength     
	//*  15   23:iconst_2        
	//*  16   24:imul            
	//*  17   25:invokestatic    #224 <Method ByteBuffer ByteBuffer.allocate(int)>
	//*  18   28:astore          6
	//*  19   30:aload           6
	//*  20   32:invokevirtual   #228 <Method CharBuffer ByteBuffer.asCharBuffer()>
	//*  21   35:aload_2         
	//*  22   36:invokevirtual   #233 <Method CharBuffer CharBuffer.put(char[])>
	//*  23   39:pop             
	//*  24   40:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  25   43:aload_1         
	//*  26   44:aload           6
	//*  27   46:invokevirtual   #236 <Method byte[] ByteBuffer.array()>
	//*  28   49:invokevirtual   #172 <Method boolean SecureStorageJNI.put(String, byte[])>
	//*  29   52:istore          5
	//*  30   54:iload           5
	//*  31   56:ifne            77
	//*  32   59:iload           4
	//*  33   61:istore_3        
	//*  34   62:aload_0         
	//*  35   63:iload_3         
	//*  36   64:ldc1            #174 <String "Error saving data">
	//*  37   66:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  38   69:iload           5
	//*  39   71:ireturn         
			flag = false;
	//   40   72:iconst_0        
	//   41   73:istore_3        
		throwException(flag, "Error: data block is null");
		bytebuffer = ByteBuffer.allocate(ac.length * 2);
		bytebuffer.asCharBuffer().put(ac);
		flag2 = secureStorageJNI.put(s, bytebuffer.array());
		if(!flag2)
			flag = flag1;
		else
	//*  42   74:goto            14
			flag = false;
	//   43   77:iconst_0        
	//   44   78:istore_3        
		throwException(flag, "Error saving data");
		return flag2;
	//*  45   79:goto            62
	}

	public boolean put(String s, char ac[], String s1)
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		boolean flag2;
		ByteBuffer bytebuffer;
		if(ac == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       92
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore          4
		else
	//*   9   15:aload_0         
	//*  10   16:iload           4
	//*  11   18:ldc1            #52  <String "Error: data block is null">
	//*  12   20:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   23:aload_3         
	//*  14   24:ifnonnull       98
	//*  15   27:iconst_1        
	//*  16   28:istore          4
	//*  17   30:aload_0         
	//*  18   31:iload           4
	//*  19   33:ldc1            #61  <String "Error: password is null!">
	//*  20   35:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  21   38:aload_2         
	//*  22   39:arraylength     
	//*  23   40:iconst_2        
	//*  24   41:imul            
	//*  25   42:invokestatic    #224 <Method ByteBuffer ByteBuffer.allocate(int)>
	//*  26   45:astore          7
	//*  27   47:aload           7
	//*  28   49:invokevirtual   #228 <Method CharBuffer ByteBuffer.asCharBuffer()>
	//*  29   52:aload_2         
	//*  30   53:invokevirtual   #233 <Method CharBuffer CharBuffer.put(char[])>
	//*  31   56:pop             
	//*  32   57:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  33   60:aload_1         
	//*  34   61:aload           7
	//*  35   63:invokevirtual   #236 <Method byte[] ByteBuffer.array()>
	//*  36   66:aload_3         
	//*  37   67:invokevirtual   #178 <Method boolean SecureStorageJNI.put(String, byte[], String)>
	//*  38   70:istore          6
	//*  39   72:iload           6
	//*  40   74:ifne            104
	//*  41   77:iload           5
	//*  42   79:istore          4
	//*  43   81:aload_0         
	//*  44   82:iload           4
	//*  45   84:ldc1            #174 <String "Error saving data">
	//*  46   86:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  47   89:iload           6
	//*  48   91:ireturn         
			flag = false;
	//   49   92:iconst_0        
	//   50   93:istore          4
		throwException(flag, "Error: data block is null");
		if(s1 == null)
			flag = true;
		else
	//*  51   95:goto            15
			flag = false;
	//   52   98:iconst_0        
	//   53   99:istore          4
		throwException(flag, "Error: password is null!");
		bytebuffer = ByteBuffer.allocate(ac.length * 2);
		bytebuffer.asCharBuffer().put(ac);
		flag2 = secureStorageJNI.put(s, bytebuffer.array(), s1);
		if(!flag2)
			flag = flag1;
		else
	//*  54  101:goto            30
			flag = false;
	//   55  104:iconst_0        
	//   56  105:istore          4
		throwException(flag, "Error saving data");
		return flag2;
	//*  57  107:goto            81
	}

	public boolean put(String s, double ad[])
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		boolean flag2;
		ByteBuffer bytebuffer;
		if(ad == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       73
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore_3        
		else
	//*   9   14:aload_0         
	//*  10   15:iload_3         
	//*  11   16:ldc1            #52  <String "Error: data block is null">
	//*  12   18:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   21:aload_2         
	//*  14   22:arraylength     
	//*  15   23:bipush          8
	//*  16   25:imul            
	//*  17   26:invokestatic    #224 <Method ByteBuffer ByteBuffer.allocate(int)>
	//*  18   29:astore          6
	//*  19   31:aload           6
	//*  20   33:invokevirtual   #242 <Method DoubleBuffer ByteBuffer.asDoubleBuffer()>
	//*  21   36:aload_2         
	//*  22   37:invokevirtual   #247 <Method DoubleBuffer DoubleBuffer.put(double[])>
	//*  23   40:pop             
	//*  24   41:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  25   44:aload_1         
	//*  26   45:aload           6
	//*  27   47:invokevirtual   #236 <Method byte[] ByteBuffer.array()>
	//*  28   50:invokevirtual   #172 <Method boolean SecureStorageJNI.put(String, byte[])>
	//*  29   53:istore          5
	//*  30   55:iload           5
	//*  31   57:ifne            78
	//*  32   60:iload           4
	//*  33   62:istore_3        
	//*  34   63:aload_0         
	//*  35   64:iload_3         
	//*  36   65:ldc1            #174 <String "Error saving data">
	//*  37   67:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  38   70:iload           5
	//*  39   72:ireturn         
			flag = false;
	//   40   73:iconst_0        
	//   41   74:istore_3        
		throwException(flag, "Error: data block is null");
		bytebuffer = ByteBuffer.allocate(ad.length * 8);
		bytebuffer.asDoubleBuffer().put(ad);
		flag2 = secureStorageJNI.put(s, bytebuffer.array());
		if(!flag2)
			flag = flag1;
		else
	//*  42   75:goto            14
			flag = false;
	//   43   78:iconst_0        
	//   44   79:istore_3        
		throwException(flag, "Error saving data");
		return flag2;
	//*  45   80:goto            63
	}

	public boolean put(String s, double ad[], String s1)
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		boolean flag2;
		ByteBuffer bytebuffer;
		if(ad == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       93
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore          4
		else
	//*   9   15:aload_0         
	//*  10   16:iload           4
	//*  11   18:ldc1            #52  <String "Error: data block is null">
	//*  12   20:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   23:aload_3         
	//*  14   24:ifnonnull       99
	//*  15   27:iconst_1        
	//*  16   28:istore          4
	//*  17   30:aload_0         
	//*  18   31:iload           4
	//*  19   33:ldc1            #61  <String "Error: password is null!">
	//*  20   35:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  21   38:aload_2         
	//*  22   39:arraylength     
	//*  23   40:bipush          8
	//*  24   42:imul            
	//*  25   43:invokestatic    #224 <Method ByteBuffer ByteBuffer.allocate(int)>
	//*  26   46:astore          7
	//*  27   48:aload           7
	//*  28   50:invokevirtual   #242 <Method DoubleBuffer ByteBuffer.asDoubleBuffer()>
	//*  29   53:aload_2         
	//*  30   54:invokevirtual   #247 <Method DoubleBuffer DoubleBuffer.put(double[])>
	//*  31   57:pop             
	//*  32   58:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  33   61:aload_1         
	//*  34   62:aload           7
	//*  35   64:invokevirtual   #236 <Method byte[] ByteBuffer.array()>
	//*  36   67:aload_3         
	//*  37   68:invokevirtual   #178 <Method boolean SecureStorageJNI.put(String, byte[], String)>
	//*  38   71:istore          6
	//*  39   73:iload           6
	//*  40   75:ifne            105
	//*  41   78:iload           5
	//*  42   80:istore          4
	//*  43   82:aload_0         
	//*  44   83:iload           4
	//*  45   85:ldc1            #174 <String "Error saving data">
	//*  46   87:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  47   90:iload           6
	//*  48   92:ireturn         
			flag = false;
	//   49   93:iconst_0        
	//   50   94:istore          4
		throwException(flag, "Error: data block is null");
		if(s1 == null)
			flag = true;
		else
	//*  51   96:goto            15
			flag = false;
	//   52   99:iconst_0        
	//   53  100:istore          4
		throwException(flag, "Error: password is null!");
		bytebuffer = ByteBuffer.allocate(ad.length * 8);
		bytebuffer.asDoubleBuffer().put(ad);
		flag2 = secureStorageJNI.put(s, bytebuffer.array(), s1);
		if(!flag2)
			flag = flag1;
		else
	//*  54  102:goto            30
			flag = false;
	//   55  105:iconst_0        
	//   56  106:istore          4
		throwException(flag, "Error saving data");
		return flag2;
	//*  57  108:goto            82
	}

	public boolean put(String s, int ai[])
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		boolean flag2;
		ByteBuffer bytebuffer;
		if(ai == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       72
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore_3        
		else
	//*   9   14:aload_0         
	//*  10   15:iload_3         
	//*  11   16:ldc1            #52  <String "Error: data block is null">
	//*  12   18:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   21:aload_2         
	//*  14   22:arraylength     
	//*  15   23:iconst_4        
	//*  16   24:imul            
	//*  17   25:invokestatic    #224 <Method ByteBuffer ByteBuffer.allocate(int)>
	//*  18   28:astore          6
	//*  19   30:aload           6
	//*  20   32:invokevirtual   #253 <Method IntBuffer ByteBuffer.asIntBuffer()>
	//*  21   35:aload_2         
	//*  22   36:invokevirtual   #258 <Method IntBuffer IntBuffer.put(int[])>
	//*  23   39:pop             
	//*  24   40:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  25   43:aload_1         
	//*  26   44:aload           6
	//*  27   46:invokevirtual   #236 <Method byte[] ByteBuffer.array()>
	//*  28   49:invokevirtual   #172 <Method boolean SecureStorageJNI.put(String, byte[])>
	//*  29   52:istore          5
	//*  30   54:iload           5
	//*  31   56:ifne            77
	//*  32   59:iload           4
	//*  33   61:istore_3        
	//*  34   62:aload_0         
	//*  35   63:iload_3         
	//*  36   64:ldc1            #174 <String "Error saving data">
	//*  37   66:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  38   69:iload           5
	//*  39   71:ireturn         
			flag = false;
	//   40   72:iconst_0        
	//   41   73:istore_3        
		throwException(flag, "Error: data block is null");
		bytebuffer = ByteBuffer.allocate(ai.length * 4);
		bytebuffer.asIntBuffer().put(ai);
		flag2 = secureStorageJNI.put(s, bytebuffer.array());
		if(!flag2)
			flag = flag1;
		else
	//*  42   74:goto            14
			flag = false;
	//   43   77:iconst_0        
	//   44   78:istore_3        
		throwException(flag, "Error saving data");
		return flag2;
	//*  45   79:goto            62
	}

	public boolean put(String s, int ai[], String s1)
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		boolean flag2;
		ByteBuffer bytebuffer;
		if(ai == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       92
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore          4
		else
	//*   9   15:aload_0         
	//*  10   16:iload           4
	//*  11   18:ldc1            #52  <String "Error: data block is null">
	//*  12   20:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   23:aload_3         
	//*  14   24:ifnonnull       98
	//*  15   27:iconst_1        
	//*  16   28:istore          4
	//*  17   30:aload_0         
	//*  18   31:iload           4
	//*  19   33:ldc1            #61  <String "Error: password is null!">
	//*  20   35:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  21   38:aload_2         
	//*  22   39:arraylength     
	//*  23   40:iconst_4        
	//*  24   41:imul            
	//*  25   42:invokestatic    #224 <Method ByteBuffer ByteBuffer.allocate(int)>
	//*  26   45:astore          7
	//*  27   47:aload           7
	//*  28   49:invokevirtual   #253 <Method IntBuffer ByteBuffer.asIntBuffer()>
	//*  29   52:aload_2         
	//*  30   53:invokevirtual   #258 <Method IntBuffer IntBuffer.put(int[])>
	//*  31   56:pop             
	//*  32   57:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  33   60:aload_1         
	//*  34   61:aload           7
	//*  35   63:invokevirtual   #236 <Method byte[] ByteBuffer.array()>
	//*  36   66:aload_3         
	//*  37   67:invokevirtual   #178 <Method boolean SecureStorageJNI.put(String, byte[], String)>
	//*  38   70:istore          6
	//*  39   72:iload           6
	//*  40   74:ifne            104
	//*  41   77:iload           5
	//*  42   79:istore          4
	//*  43   81:aload_0         
	//*  44   82:iload           4
	//*  45   84:ldc1            #174 <String "Error saving data">
	//*  46   86:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  47   89:iload           6
	//*  48   91:ireturn         
			flag = false;
	//   49   92:iconst_0        
	//   50   93:istore          4
		throwException(flag, "Error: data block is null");
		if(s1 == null)
			flag = true;
		else
	//*  51   95:goto            15
			flag = false;
	//   52   98:iconst_0        
	//   53   99:istore          4
		throwException(flag, "Error: password is null!");
		bytebuffer = ByteBuffer.allocate(ai.length * 4);
		bytebuffer.asIntBuffer().put(ai);
		flag2 = secureStorageJNI.put(s, bytebuffer.array(), s1);
		if(!flag2)
			flag = flag1;
		else
	//*  54  101:goto            30
			flag = false;
	//   55  104:iconst_0        
	//   56  105:istore          4
		throwException(flag, "Error saving data");
		return flag2;
	//*  57  107:goto            81
	}

	public boolean put(String s, long al[])
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		boolean flag2;
		ByteBuffer bytebuffer;
		if(al == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       73
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore_3        
		else
	//*   9   14:aload_0         
	//*  10   15:iload_3         
	//*  11   16:ldc1            #52  <String "Error: data block is null">
	//*  12   18:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   21:aload_2         
	//*  14   22:arraylength     
	//*  15   23:bipush          8
	//*  16   25:imul            
	//*  17   26:invokestatic    #224 <Method ByteBuffer ByteBuffer.allocate(int)>
	//*  18   29:astore          6
	//*  19   31:aload           6
	//*  20   33:invokevirtual   #264 <Method LongBuffer ByteBuffer.asLongBuffer()>
	//*  21   36:aload_2         
	//*  22   37:invokevirtual   #269 <Method LongBuffer LongBuffer.put(long[])>
	//*  23   40:pop             
	//*  24   41:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  25   44:aload_1         
	//*  26   45:aload           6
	//*  27   47:invokevirtual   #236 <Method byte[] ByteBuffer.array()>
	//*  28   50:invokevirtual   #172 <Method boolean SecureStorageJNI.put(String, byte[])>
	//*  29   53:istore          5
	//*  30   55:iload           5
	//*  31   57:ifne            78
	//*  32   60:iload           4
	//*  33   62:istore_3        
	//*  34   63:aload_0         
	//*  35   64:iload_3         
	//*  36   65:ldc1            #174 <String "Error saving data">
	//*  37   67:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  38   70:iload           5
	//*  39   72:ireturn         
			flag = false;
	//   40   73:iconst_0        
	//   41   74:istore_3        
		throwException(flag, "Error: data block is null");
		bytebuffer = ByteBuffer.allocate(al.length * 8);
		bytebuffer.asLongBuffer().put(al);
		flag2 = secureStorageJNI.put(s, bytebuffer.array());
		if(!flag2)
			flag = flag1;
		else
	//*  42   75:goto            14
			flag = false;
	//   43   78:iconst_0        
	//   44   79:istore_3        
		throwException(flag, "Error saving data");
		return flag2;
	//*  45   80:goto            63
	}

	public boolean put(String s, long al[], String s1)
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		boolean flag;
		boolean flag2;
		ByteBuffer bytebuffer;
		if(al == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       93
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore          4
		else
	//*   9   15:aload_0         
	//*  10   16:iload           4
	//*  11   18:ldc1            #52  <String "Error: data block is null">
	//*  12   20:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   23:aload_3         
	//*  14   24:ifnonnull       99
	//*  15   27:iconst_1        
	//*  16   28:istore          4
	//*  17   30:aload_0         
	//*  18   31:iload           4
	//*  19   33:ldc1            #61  <String "Error: password is null!">
	//*  20   35:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  21   38:aload_2         
	//*  22   39:arraylength     
	//*  23   40:bipush          8
	//*  24   42:imul            
	//*  25   43:invokestatic    #224 <Method ByteBuffer ByteBuffer.allocate(int)>
	//*  26   46:astore          7
	//*  27   48:aload           7
	//*  28   50:invokevirtual   #264 <Method LongBuffer ByteBuffer.asLongBuffer()>
	//*  29   53:aload_2         
	//*  30   54:invokevirtual   #269 <Method LongBuffer LongBuffer.put(long[])>
	//*  31   57:pop             
	//*  32   58:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*  33   61:aload_1         
	//*  34   62:aload           7
	//*  35   64:invokevirtual   #236 <Method byte[] ByteBuffer.array()>
	//*  36   67:aload_3         
	//*  37   68:invokevirtual   #178 <Method boolean SecureStorageJNI.put(String, byte[], String)>
	//*  38   71:istore          6
	//*  39   73:iload           6
	//*  40   75:ifne            105
	//*  41   78:iload           5
	//*  42   80:istore          4
	//*  43   82:aload_0         
	//*  44   83:iload           4
	//*  45   85:ldc1            #174 <String "Error saving data">
	//*  46   87:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  47   90:iload           6
	//*  48   92:ireturn         
			flag = false;
	//   49   93:iconst_0        
	//   50   94:istore          4
		throwException(flag, "Error: data block is null");
		if(s1 == null)
			flag = true;
		else
	//*  51   96:goto            15
			flag = false;
	//   52   99:iconst_0        
	//   53  100:istore          4
		throwException(flag, "Error: password is null!");
		bytebuffer = ByteBuffer.allocate(al.length * 8);
		bytebuffer.asLongBuffer().put(al);
		flag2 = secureStorageJNI.put(s, bytebuffer.array(), s1);
		if(!flag2)
			flag = flag1;
		else
	//*  54  102:goto            30
			flag = false;
	//   55  105:iconst_0        
	//   56  106:istore          4
		throwException(flag, "Error saving data");
		return flag2;
	//*  57  108:goto            82
	}

	public boolean put(String s, boolean aflag[])
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		int i;
		boolean flag;
		byte abyte0[];
		if(aflag == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       56
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore          4
		else
	//*   9   15:aload_0         
	//*  10   16:iload           4
	//*  11   18:ldc1            #52  <String "Error: data block is null">
	//*  12   20:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   23:aload_2         
	//*  14   24:arraylength     
	//*  15   25:newarray        byte[]
	//*  16   27:astore          7
	//*  17   29:iconst_0        
	//*  18   30:istore_3        
	//*  19   31:iload_3         
	//*  20   32:aload           7
	//*  21   34:arraylength     
	//*  22   35:icmpge          70
	//*  23   38:aload_2         
	//*  24   39:iload_3         
	//*  25   40:baload          
	//*  26   41:ifeq            62
	//*  27   44:aload           7
	//*  28   46:iload_3         
	//*  29   47:iconst_1        
	//*  30   48:bastore         
	//*  31   49:iload_3         
	//*  32   50:iconst_1        
	//*  33   51:iadd            
	//*  34   52:istore_3        
	//*  35   53:goto            31
			flag = false;
	//   36   56:iconst_0        
	//   37   57:istore          4
		throwException(flag, "Error: data block is null");
		abyte0 = new byte[aflag.length];
		i = 0;
		while(i < abyte0.length) 
		{
			if(aflag[i])
				abyte0[i] = 1;
			else
	//*  38   59:goto            15
				abyte0[i] = 0;
	//   39   62:aload           7
	//   40   64:iload_3         
	//   41   65:iconst_0        
	//   42   66:bastore         
			i++;
		}
	//*  43   67:goto            49
		boolean flag2 = secureStorageJNI.put(s, abyte0);
	//   44   70:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//   45   73:aload_1         
	//   46   74:aload           7
	//   47   76:invokevirtual   #172 <Method boolean SecureStorageJNI.put(String, byte[])>
	//   48   79:istore          6
		if(!flag2)
	//*  49   81:iload           6
	//*  50   83:ifne            101
			flag = flag1;
	//   51   86:iload           5
	//   52   88:istore          4
		else
	//*  53   90:aload_0         
	//*  54   91:iload           4
	//*  55   93:ldc1            #174 <String "Error saving data">
	//*  56   95:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  57   98:iload           6
	//*  58  100:ireturn         
			flag = false;
	//   59  101:iconst_0        
	//   60  102:istore          4
		throwException(flag, "Error saving data");
		return flag2;
	//*  61  104:goto            90
	}

	public boolean put(String s, boolean aflag[], String s1)
		throws SecureStorageException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          6
		throwException(s);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #67  <Method void throwException(String)>
		int i;
		boolean flag;
		byte abyte0[];
		if(aflag == null)
	//*   5    8:aload_2         
	//*   6    9:ifnonnull       77
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore          5
		else
	//*   9   15:aload_0         
	//*  10   16:iload           5
	//*  11   18:ldc1            #52  <String "Error: data block is null">
	//*  12   20:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  13   23:aload_3         
	//*  14   24:ifnonnull       83
	//*  15   27:iconst_1        
	//*  16   28:istore          5
	//*  17   30:aload_0         
	//*  18   31:iload           5
	//*  19   33:ldc1            #61  <String "Error: password is null!">
	//*  20   35:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  21   38:aload_2         
	//*  22   39:arraylength     
	//*  23   40:newarray        byte[]
	//*  24   42:astore          8
	//*  25   44:iconst_0        
	//*  26   45:istore          4
	//*  27   47:iload           4
	//*  28   49:aload           8
	//*  29   51:arraylength     
	//*  30   52:icmpge          98
	//*  31   55:aload_2         
	//*  32   56:iload           4
	//*  33   58:baload          
	//*  34   59:ifeq            89
	//*  35   62:aload           8
	//*  36   64:iload           4
	//*  37   66:iconst_1        
	//*  38   67:bastore         
	//*  39   68:iload           4
	//*  40   70:iconst_1        
	//*  41   71:iadd            
	//*  42   72:istore          4
	//*  43   74:goto            47
			flag = false;
	//   44   77:iconst_0        
	//   45   78:istore          5
		throwException(flag, "Error: data block is null");
		if(s1 == null)
			flag = true;
		else
	//*  46   80:goto            15
			flag = false;
	//   47   83:iconst_0        
	//   48   84:istore          5
		throwException(flag, "Error: password is null!");
		abyte0 = new byte[aflag.length];
		i = 0;
		while(i < abyte0.length) 
		{
			if(aflag[i])
				abyte0[i] = 1;
			else
	//*  49   86:goto            30
				abyte0[i] = 0;
	//   50   89:aload           8
	//   51   91:iload           4
	//   52   93:iconst_0        
	//   53   94:bastore         
			i++;
		}
	//*  54   95:goto            68
		boolean flag2 = secureStorageJNI.put(s, abyte0, s1);
	//   55   98:getstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//   56  101:aload_1         
	//   57  102:aload           8
	//   58  104:aload_3         
	//   59  105:invokevirtual   #178 <Method boolean SecureStorageJNI.put(String, byte[], String)>
	//   60  108:istore          7
		if(!flag2)
	//*  61  110:iload           7
	//*  62  112:ifne            130
			flag = flag1;
	//   63  115:iload           6
	//   64  117:istore          5
		else
	//*  65  119:aload_0         
	//*  66  120:iload           5
	//*  67  122:ldc1            #174 <String "Error saving data">
	//*  68  124:invokespecial   #54  <Method void throwException(boolean, String)>
	//*  69  127:iload           7
	//*  70  129:ireturn         
			flag = false;
	//   71  130:iconst_0        
	//   72  131:istore          5
		throwException(flag, "Error saving data");
		return flag2;
	//*  73  133:goto            119
	}

	private static final int DOUBLE_SIZE = 8;
	private static final int INTEGER_SIZE = 4;
	private static SecureStorageJNI secureStorageJNI = SecureStorageJNI.getInstance();

	static 
	{
	//    0    0:invokestatic    #22  <Method SecureStorageJNI SecureStorageJNI.getInstance()>
	//    1    3:putstatic       #24  <Field SecureStorageJNI secureStorageJNI>
	//*   2    6:return          
	}
}
