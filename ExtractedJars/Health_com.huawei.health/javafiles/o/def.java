// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.*;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.whitebox.e;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package o:
//			ded, dck, dci, deg, 
//			czx, dbf, dho

public class def
{

	public def()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Object()>
	//    2    4:return          
	}

	static String a(int j)
	{
		Object obj1;
		String s;
		ded.d("KeyManager", new Object[] {
			"wt ------getWorkKeyEncryptByCP begin"
		});
	//    0    0:ldc1            #55  <String "KeyManager">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc1            #57  <String "wt ------getWorkKeyEncryptByCP begin">
	//    6   10:aastore         
	//    7   11:invokestatic    #62  <Method void ded.d(String, Object[])>
		s = "";
	//    8   14:ldc1            #64  <String "">
	//    9   16:astore_3        
		obj1 = ((Object) (s));
	//   10   17:aload_3         
	//   11   18:astore_2        
		Cursor cursor = BaseApplication.a().getContentResolver().query(Uri.parse((new StringBuilder()).append(dck.d).append("module_").append(1009).append("_").append("backup_table").toString()), ((String []) (null)), "backupKey like ?", new String[] {
			String.valueOf(j)
		}, ((String) (null)));
	//   12   19:invokestatic    #67  <Method Context BaseApplication.a()>
	//   13   22:invokevirtual   #73  <Method ContentResolver Context.getContentResolver()>
	//   14   25:new             #19  <Class StringBuilder>
	//   15   28:dup             
	//   16   29:invokespecial   #22  <Method void StringBuilder()>
	//   17   32:getstatic       #77  <Field String dck.d>
	//   18   35:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   19   38:ldc1            #79  <String "module_">
	//   20   40:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   21   43:sipush          1009
	//   22   46:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//   23   49:ldc1            #84  <String "_">
	//   24   51:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   25   54:ldc1            #86  <String "backup_table">
	//   26   56:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   27   59:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   28   62:invokestatic    #92  <Method Uri Uri.parse(String)>
	//   29   65:aconst_null     
	//   30   66:ldc1            #94  <String "backupKey like ?">
	//   31   68:iconst_1        
	//   32   69:anewarray       String[]
	//   33   72:dup             
	//   34   73:iconst_0        
	//   35   74:iload_0         
	//   36   75:invokestatic    #99  <Method String String.valueOf(int)>
	//   37   78:aastore         
	//   38   79:aconst_null     
	//   39   80:invokevirtual   #105 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   40   83:astore          4
		obj1 = ((Object) (s));
	//   41   85:aload_3         
	//   42   86:astore_2        
		ded.d("KeyManager", new Object[] {
			"wt ------getWorkKeyEncryptByCP cursor"
		});
	//   43   87:ldc1            #55  <String "KeyManager">
	//   44   89:iconst_1        
	//   45   90:anewarray       Object[]
	//   46   93:dup             
	//   47   94:iconst_0        
	//   48   95:ldc1            #107 <String "wt ------getWorkKeyEncryptByCP cursor">
	//   49   97:aastore         
	//   50   98:invokestatic    #62  <Method void ded.d(String, Object[])>
		Object obj;
		obj = ((Object) (s));
	//   51  101:aload_3         
	//   52  102:astore_1        
		if(cursor == null)
			break MISSING_BLOCK_LABEL_177;
	//   53  103:aload           4
	//   54  105:ifnull          150
		obj = ((Object) (s));
	//   55  108:aload_3         
	//   56  109:astore_1        
		obj1 = ((Object) (s));
	//   57  110:aload_3         
	//   58  111:astore_2        
		if(!cursor.moveToNext())
			break MISSING_BLOCK_LABEL_141;
	//   59  112:aload           4
	//   60  114:invokeinterface #113 <Method boolean Cursor.moveToNext()>
	//   61  119:ifeq            141
		obj1 = ((Object) (s));
	//   62  122:aload_3         
	//   63  123:astore_2        
		obj = ((Object) (cursor.getString(cursor.getColumnIndex("backupValue"))));
	//   64  124:aload           4
	//   65  126:aload           4
	//   66  128:ldc1            #115 <String "backupValue">
	//   67  130:invokeinterface #119 <Method int Cursor.getColumnIndex(String)>
	//   68  135:invokeinterface #122 <Method String Cursor.getString(int)>
	//   69  140:astore_1        
		obj1 = obj;
	//   70  141:aload_1         
	//   71  142:astore_2        
		try
		{
			cursor.close();
	//   72  143:aload           4
	//   73  145:invokeinterface #125 <Method void Cursor.close()>
		}
	//*  74  150:goto            177
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  75  153:astore_1        
		{
			ded.d("KeyManager", new Object[] {
				"getWorkKeyEncryptByCP1, ", ((SQLiteException) (obj)).getMessage()
			});
	//   76  154:ldc1            #55  <String "KeyManager">
	//   77  156:iconst_2        
	//   78  157:anewarray       Object[]
	//   79  160:dup             
	//   80  161:iconst_0        
	//   81  162:ldc1            #127 <String "getWorkKeyEncryptByCP1, ">
	//   82  164:aastore         
	//   83  165:dup             
	//   84  166:iconst_1        
	//   85  167:aload_1         
	//   86  168:invokevirtual   #130 <Method String SQLiteException.getMessage()>
	//   87  171:aastore         
	//   88  172:invokestatic    #62  <Method void ded.d(String, Object[])>
			obj = obj1;
	//   89  175:aload_2         
	//   90  176:astore_1        
		}
		ded.d("KeyManager", new Object[] {
			"getWorkKeyEncryptByCP, data_type:", Integer.valueOf(j), ";value is:", obj
		});
	//   91  177:ldc1            #55  <String "KeyManager">
	//   92  179:iconst_4        
	//   93  180:anewarray       Object[]
	//   94  183:dup             
	//   95  184:iconst_0        
	//   96  185:ldc1            #132 <String "getWorkKeyEncryptByCP, data_type:">
	//   97  187:aastore         
	//   98  188:dup             
	//   99  189:iconst_1        
	//  100  190:iload_0         
	//  101  191:invokestatic    #137 <Method Integer Integer.valueOf(int)>
	//  102  194:aastore         
	//  103  195:dup             
	//  104  196:iconst_2        
	//  105  197:ldc1            #139 <String ";value is:">
	//  106  199:aastore         
	//  107  200:dup             
	//  108  201:iconst_3        
	//  109  202:aload_1         
	//  110  203:aastore         
	//  111  204:invokestatic    #62  <Method void ded.d(String, Object[])>
		return ((String) (obj));
	//  112  207:aload_1         
	//  113  208:areturn         
	}

	private static String a(String s, String s1, String s2)
	{
		s = ((String) (s.toCharArray()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #144 <Method char[] String.toCharArray()>
	//    2    4:astore_0        
		s1 = ((String) (s1.toCharArray()));
	//    3    5:aload_1         
	//    4    6:invokevirtual   #144 <Method char[] String.toCharArray()>
	//    5    9:astore_1        
		s2 = ((String) (s2.toCharArray()));
	//    6   10:aload_2         
	//    7   11:invokevirtual   #144 <Method char[] String.toCharArray()>
	//    8   14:astore_2        
		char ac[] = new char[s.length];
	//    9   15:aload_0         
	//   10   16:arraylength     
	//   11   17:newarray        char[]
	//   12   19:astore          4
		for(int j = 0; j < ac.length; j++)
	//*  13   21:iconst_0        
	//*  14   22:istore_3        
	//*  15   23:iload_3         
	//*  16   24:aload           4
	//*  17   26:arraylength     
	//*  18   27:icmpge          58
			ac[j] = (char)((s[j] << 4 ^ s1[j]) >> 6 ^ s2[j]);
	//   19   30:aload           4
	//   20   32:iload_3         
	//   21   33:aload_0         
	//   22   34:iload_3         
	//   23   35:caload          
	//   24   36:iconst_4        
	//   25   37:ishl            
	//   26   38:aload_1         
	//   27   39:iload_3         
	//   28   40:caload          
	//   29   41:ixor            
	//   30   42:bipush          6
	//   31   44:ishr            
	//   32   45:aload_2         
	//   33   46:iload_3         
	//   34   47:caload          
	//   35   48:ixor            
	//   36   49:int2char        
	//   37   50:castore         

	//   38   51:iload_3         
	//   39   52:iconst_1        
	//   40   53:iadd            
	//   41   54:istore_3        
	//*  42   55:goto            23
		return String.valueOf(ac);
	//   43   58:aload           4
	//   44   60:invokestatic    #147 <Method String String.valueOf(char[])>
	//   45   63:areturn         
	}

	private static void a(String s, String s1)
	{
		byte abyte0[] = e;
	//    0    0:getstatic       #15  <Field byte[] e>
	//    1    3:astore_2        
		abyte0;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		ded.d("KeyManager", new Object[] {
			"backUpSecretKeyRetry:", s
		});
	//    4    6:ldc1            #55  <String "KeyManager">
	//    5    8:iconst_2        
	//    6    9:anewarray       Object[]
	//    7   12:dup             
	//    8   13:iconst_0        
	//    9   14:ldc1            #150 <String "backUpSecretKeyRetry:">
	//   10   16:aastore         
	//   11   17:dup             
	//   12   18:iconst_1        
	//   13   19:aload_0         
	//   14   20:aastore         
	//   15   21:invokestatic    #62  <Method void ded.d(String, Object[])>
		Object obj = ((Object) (new StringBuffer()));
	//   16   24:new             #152 <Class StringBuffer>
	//   17   27:dup             
	//   18   28:invokespecial   #153 <Method void StringBuffer()>
	//   19   31:astore_3        
		((StringBuffer) (obj)).append("create table IF NOT EXISTS backupCp(");
	//   20   32:aload_3         
	//   21   33:ldc1            #155 <String "create table IF NOT EXISTS backupCp(">
	//   22   35:invokevirtual   #158 <Method StringBuffer StringBuffer.append(String)>
	//   23   38:pop             
		((StringBuffer) (obj)).append("backupKey  varchar primary key ,backupValue varchar");
	//   24   39:aload_3         
	//   25   40:ldc1            #160 <String "backupKey  varchar primary key ,backupValue varchar">
	//   26   42:invokevirtual   #158 <Method StringBuffer StringBuffer.append(String)>
	//   27   45:pop             
		((StringBuffer) (obj)).append(")");
	//   28   46:aload_3         
	//   29   47:ldc1            #162 <String ")">
	//   30   49:invokevirtual   #158 <Method StringBuffer StringBuffer.append(String)>
	//   31   52:pop             
		dci.a(BaseApplication.a()).a(String.valueOf(obj));
	//   32   53:invokestatic    #67  <Method Context BaseApplication.a()>
	//   33   56:invokestatic    #167 <Method dci dci.a(Context)>
	//   34   59:aload_3         
	//   35   60:invokestatic    #170 <Method String String.valueOf(Object)>
	//   36   63:invokevirtual   #173 <Method void dci.a(String)>
		obj = ((Object) (new ContentValues()));
	//   37   66:new             #175 <Class ContentValues>
	//   38   69:dup             
	//   39   70:invokespecial   #176 <Method void ContentValues()>
	//   40   73:astore_3        
		((ContentValues) (obj)).put("backupKey", s);
	//   41   74:aload_3         
	//   42   75:ldc1            #178 <String "backupKey">
	//   43   77:aload_0         
	//   44   78:invokevirtual   #181 <Method void ContentValues.put(String, String)>
		((ContentValues) (obj)).put("backupValue", s1);
	//   45   81:aload_3         
	//   46   82:ldc1            #115 <String "backupValue">
	//   47   84:aload_1         
	//   48   85:invokevirtual   #181 <Method void ContentValues.put(String, String)>
		if(!c(s))
	//*  49   88:aload_0         
	//*  50   89:invokestatic    #184 <Method boolean c(String)>
	//*  51   92:ifne            130
			BaseApplication.a().getContentResolver().insert(Uri.parse((new StringBuilder()).append(c).append("backupCp").toString()), ((ContentValues) (obj)));
	//   52   95:invokestatic    #67  <Method Context BaseApplication.a()>
	//   53   98:invokevirtual   #73  <Method ContentResolver Context.getContentResolver()>
	//   54  101:new             #19  <Class StringBuilder>
	//   55  104:dup             
	//   56  105:invokespecial   #22  <Method void StringBuilder()>
	//   57  108:getstatic       #48  <Field String c>
	//   58  111:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   59  114:ldc1            #186 <String "backupCp">
	//   60  116:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   61  119:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   62  122:invokestatic    #92  <Method Uri Uri.parse(String)>
	//   63  125:aload_3         
	//   64  126:invokevirtual   #190 <Method Uri ContentResolver.insert(Uri, ContentValues)>
	//   65  129:pop             
		abyte0;
	//   66  130:aload_2         
		JVM INSTR monitorexit ;
	//   67  131:monitorexit     
		return;
	//   68  132:return          
		s;
	//   69  133:astore_0        
	//*  70  134:aload_2         
		throw s;
	//   71  135:monitorexit     
	//   72  136:aload_0         
	//   73  137:athrow          
	}

	private static void a(String s, byte abyte0[], byte abyte1[])
	{
		abyte1 = ((byte []) (deg.a(abyte1)));
	//    0    0:aload_2         
	//    1    1:invokestatic    #196 <Method String deg.a(byte[])>
	//    2    4:astore_2        
		abyte0 = ((byte []) (deg.a(abyte0)));
	//    3    5:aload_1         
	//    4    6:invokestatic    #196 <Method String deg.a(byte[])>
	//    5    9:astore_1        
		abyte0 = ((byte []) ((new StringBuilder()).append(((String) (abyte1))).append(((String) (abyte0))).toString()));
	//    6   10:new             #19  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #22  <Method void StringBuilder()>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   13   25:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   14   28:astore_1        
		ded.d("KeyManager", new Object[] {
			"-----saveWorkKeyToCP, ok:", "; data_type:", s
		});
	//   15   29:ldc1            #55  <String "KeyManager">
	//   16   31:iconst_3        
	//   17   32:anewarray       Object[]
	//   18   35:dup             
	//   19   36:iconst_0        
	//   20   37:ldc1            #198 <String "-----saveWorkKeyToCP, ok:">
	//   21   39:aastore         
	//   22   40:dup             
	//   23   41:iconst_1        
	//   24   42:ldc1            #200 <String "; data_type:">
	//   25   44:aastore         
	//   26   45:dup             
	//   27   46:iconst_2        
	//   28   47:aload_0         
	//   29   48:aastore         
	//   30   49:invokestatic    #62  <Method void ded.d(String, Object[])>
		e(s, ((String) (abyte0)));
	//   31   52:aload_0         
	//   32   53:aload_1         
	//   33   54:invokestatic    #202 <Method void e(String, String)>
	//   34   57:return          
	}

	static byte[] a()
	{
		byte abyte0[];
		try
		{
			SecureRandom securerandom = new SecureRandom();
	//    0    0:new             #209 <Class SecureRandom>
	//    1    3:dup             
	//    2    4:invokespecial   #210 <Method void SecureRandom()>
	//    3    7:astore_0        
			KeyGenerator keygenerator = KeyGenerator.getInstance("AES");
	//    4    8:ldc1            #212 <String "AES">
	//    5   10:invokestatic    #218 <Method KeyGenerator KeyGenerator.getInstance(String)>
	//    6   13:astore_1        
			keygenerator.init(128, securerandom);
	//    7   14:aload_1         
	//    8   15:sipush          128
	//    9   18:aload_0         
	//   10   19:invokevirtual   #222 <Method void KeyGenerator.init(int, SecureRandom)>
			abyte0 = keygenerator.generateKey().getEncoded();
	//   11   22:aload_1         
	//   12   23:invokevirtual   #226 <Method SecretKey KeyGenerator.generateKey()>
	//   13   26:invokeinterface #231 <Method byte[] SecretKey.getEncoded()>
	//   14   31:astore_0        
		}
	//*  15   32:aload_0         
	//*  16   33:areturn         
		catch(RuntimeException runtimeexception)
	//*  17   34:astore_0        
		{
			return new byte[0];
	//   18   35:iconst_0        
	//   19   36:newarray        byte[]
	//   20   38:areturn         
		}
		catch(Exception exception)
	//*  21   39:astore_0        
		{
			return new byte[0];
	//   22   40:iconst_0        
	//   23   41:newarray        byte[]
	//   24   43:areturn         
		}
		return abyte0;
	}

	static byte[] a(byte abyte0[], byte abyte1[], byte abyte2[])
		throws Exception
	{
		ded.d("KeyManager", new Object[] {
			"desEncryptByte data is:", o.czx.e(abyte0), ";secret is:", o.czx.e(abyte1), ";iv is:", o.czx.e(abyte2)
		});
	//    0    0:ldc1            #55  <String "KeyManager">
	//    1    2:bipush          6
	//    2    4:anewarray       Object[]
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:ldc1            #234 <String "desEncryptByte data is:">
	//    6   11:aastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:aload_0         
	//   10   15:invokestatic    #238 <Method String o.czx.e(byte[])>
	//   11   18:aastore         
	//   12   19:dup             
	//   13   20:iconst_2        
	//   14   21:ldc1            #240 <String ";secret is:">
	//   15   23:aastore         
	//   16   24:dup             
	//   17   25:iconst_3        
	//   18   26:aload_1         
	//   19   27:invokestatic    #238 <Method String o.czx.e(byte[])>
	//   20   30:aastore         
	//   21   31:dup             
	//   22   32:iconst_4        
	//   23   33:ldc1            #242 <String ";iv is:">
	//   24   35:aastore         
	//   25   36:dup             
	//   26   37:iconst_5        
	//   27   38:aload_2         
	//   28   39:invokestatic    #238 <Method String o.czx.e(byte[])>
	//   29   42:aastore         
	//   30   43:invokestatic    #62  <Method void ded.d(String, Object[])>
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
	//   31   46:ldc1            #244 <String "AES/CBC/PKCS7Padding">
	//   32   48:invokestatic    #249 <Method Cipher Cipher.getInstance(String)>
	//   33   51:astore_3        
		cipher.init(2, ((java.security.Key) (new SecretKeySpec(abyte1, "AES"))), ((java.security.spec.AlgorithmParameterSpec) (new IvParameterSpec(abyte2))));
	//   34   52:aload_3         
	//   35   53:iconst_2        
	//   36   54:new             #251 <Class SecretKeySpec>
	//   37   57:dup             
	//   38   58:aload_1         
	//   39   59:ldc1            #212 <String "AES">
	//   40   61:invokespecial   #254 <Method void SecretKeySpec(byte[], String)>
	//   41   64:new             #256 <Class IvParameterSpec>
	//   42   67:dup             
	//   43   68:aload_2         
	//   44   69:invokespecial   #259 <Method void IvParameterSpec(byte[])>
	//   45   72:invokevirtual   #262 <Method void Cipher.init(int, java.security.Key, java.security.spec.AlgorithmParameterSpec)>
		return cipher.doFinal(abyte0);
	//   46   75:aload_3         
	//   47   76:aload_0         
	//   48   77:invokevirtual   #266 <Method byte[] Cipher.doFinal(byte[])>
	//   49   80:areturn         
	}

	public static void b()
	{
		byte abyte0[] = e;
	//    0    0:getstatic       #15  <Field byte[] e>
	//    1    3:astore_0        
		abyte0;
	//    2    4:aload_0         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		a = null;
	//    4    6:aconst_null     
	//    5    7:putstatic       #269 <Field String a>
		b = false;
	//    6   10:iconst_0        
	//    7   11:putstatic       #17  <Field boolean b>
		abyte0;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		Exception exception;
		exception;
	//   11   17:astore_1        
	//*  12   18:aload_0         
		throw exception;
	//   13   19:monitorexit     
	//   14   20:aload_1         
	//   15   21:athrow          
	}

	private static boolean b(String s)
	{
		boolean flag;
		boolean flag1;
		boolean flag2;
		boolean flag3;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		flag2 = false;
	//    2    2:iconst_0        
	//    3    3:istore_3        
		flag3 = false;
	//    4    4:iconst_0        
	//    5    5:istore          4
		flag1 = flag2;
	//    6    7:iload_3         
	//    7    8:istore_2        
		s = ((String) (BaseApplication.a().getContentResolver().query(Uri.parse((new StringBuilder()).append(dck.d).append("module_").append(1009).append("_").append("backup_table").toString()), ((String []) (null)), "backupKey like ?", new String[] {
			s
		}, ((String) (null)))));
	//    8    9:invokestatic    #67  <Method Context BaseApplication.a()>
	//    9   12:invokevirtual   #73  <Method ContentResolver Context.getContentResolver()>
	//   10   15:new             #19  <Class StringBuilder>
	//   11   18:dup             
	//   12   19:invokespecial   #22  <Method void StringBuilder()>
	//   13   22:getstatic       #77  <Field String dck.d>
	//   14   25:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   15   28:ldc1            #79  <String "module_">
	//   16   30:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:sipush          1009
	//   18   36:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//   19   39:ldc1            #84  <String "_">
	//   20   41:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:ldc1            #86  <String "backup_table">
	//   22   46:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   23   49:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   24   52:invokestatic    #92  <Method Uri Uri.parse(String)>
	//   25   55:aconst_null     
	//   26   56:ldc1            #94  <String "backupKey like ?">
	//   27   58:iconst_1        
	//   28   59:anewarray       String[]
	//   29   62:dup             
	//   30   63:iconst_0        
	//   31   64:aload_0         
	//   32   65:aastore         
	//   33   66:aconst_null     
	//   34   67:invokevirtual   #105 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   35   70:astore_0        
		if(s == null)
			break MISSING_BLOCK_LABEL_127;
	//   36   71:aload_0         
	//   37   72:ifnull          99
		flag = flag3;
	//   38   75:iload           4
	//   39   77:istore_1        
		flag1 = flag2;
	//   40   78:iload_3         
	//   41   79:istore_2        
		if(((Cursor) (s)).getCount() > 0)
	//*  42   80:aload_0         
	//*  43   81:invokeinterface #273 <Method int Cursor.getCount()>
	//*  44   86:ifle            91
			flag = true;
	//   45   89:iconst_1        
	//   46   90:istore_1        
		flag1 = flag;
	//   47   91:iload_1         
	//   48   92:istore_2        
		try
		{
			((Cursor) (s)).close();
	//   49   93:aload_0         
	//   50   94:invokeinterface #125 <Method void Cursor.close()>
		}
	//*  51   99:goto            127
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  52  102:astore_0        
		{
			ded.d("KeyManager", new Object[] {
				"isHave, ", ((SQLiteException) (s)).getMessage()
			});
	//   53  103:ldc1            #55  <String "KeyManager">
	//   54  105:iconst_2        
	//   55  106:anewarray       Object[]
	//   56  109:dup             
	//   57  110:iconst_0        
	//   58  111:ldc2            #275 <String "isHave, ">
	//   59  114:aastore         
	//   60  115:dup             
	//   61  116:iconst_1        
	//   62  117:aload_0         
	//   63  118:invokevirtual   #130 <Method String SQLiteException.getMessage()>
	//   64  121:aastore         
	//   65  122:invokestatic    #62  <Method void ded.d(String, Object[])>
			flag = flag1;
	//   66  125:iload_2         
	//   67  126:istore_1        
		}
		ded.d("KeyManager", new Object[] {
			"isHave:", Boolean.valueOf(flag)
		});
	//   68  127:ldc1            #55  <String "KeyManager">
	//   69  129:iconst_2        
	//   70  130:anewarray       Object[]
	//   71  133:dup             
	//   72  134:iconst_0        
	//   73  135:ldc2            #277 <String "isHave:">
	//   74  138:aastore         
	//   75  139:dup             
	//   76  140:iconst_1        
	//   77  141:iload_1         
	//   78  142:invokestatic    #282 <Method Boolean Boolean.valueOf(boolean)>
	//   79  145:aastore         
	//   80  146:invokestatic    #62  <Method void ded.d(String, Object[])>
		return flag;
	//   81  149:iload_1         
	//   82  150:ireturn         
	}

	public static byte[] b(int j)
	{
		byte abyte0[] = e;
	//    0    0:getstatic       #15  <Field byte[] e>
	//    1    3:astore_2        
		abyte0;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		byte abyte1[];
		int l = Process.myPid();
	//    4    6:invokestatic    #288 <Method int Process.myPid()>
	//    5    9:istore_1        
		ded.d("KeyManager", new Object[] {
			"getSecurityKey---dataType:", Integer.valueOf(j), ";process id:", Integer.valueOf(l), ";process name:", o.dbf.e(l), ";main process:", BaseApplication.d().c()
		});
	//    6   10:ldc1            #55  <String "KeyManager">
	//    7   12:bipush          8
	//    8   14:anewarray       Object[]
	//    9   17:dup             
	//   10   18:iconst_0        
	//   11   19:ldc2            #290 <String "getSecurityKey---dataType:">
	//   12   22:aastore         
	//   13   23:dup             
	//   14   24:iconst_1        
	//   15   25:iload_0         
	//   16   26:invokestatic    #137 <Method Integer Integer.valueOf(int)>
	//   17   29:aastore         
	//   18   30:dup             
	//   19   31:iconst_2        
	//   20   32:ldc2            #292 <String ";process id:">
	//   21   35:aastore         
	//   22   36:dup             
	//   23   37:iconst_3        
	//   24   38:iload_1         
	//   25   39:invokestatic    #137 <Method Integer Integer.valueOf(int)>
	//   26   42:aastore         
	//   27   43:dup             
	//   28   44:iconst_4        
	//   29   45:ldc2            #294 <String ";process name:">
	//   30   48:aastore         
	//   31   49:dup             
	//   32   50:iconst_5        
	//   33   51:iload_1         
	//   34   52:invokestatic    #298 <Method String o.dbf.e(int)>
	//   35   55:aastore         
	//   36   56:dup             
	//   37   57:bipush          6
	//   38   59:ldc2            #300 <String ";main process:">
	//   39   62:aastore         
	//   40   63:dup             
	//   41   64:bipush          7
	//   42   66:invokestatic    #34  <Method com.huawei.hwcommonmodel.application.BaseApplication$e BaseApplication.d()>
	//   43   69:invokevirtual   #39  <Method String com.huawei.hwcommonmodel.application.BaseApplication$e.c()>
	//   44   72:aastore         
	//   45   73:invokestatic    #62  <Method void ded.d(String, Object[])>
		abyte1 = d(j);
	//   46   76:iload_0         
	//   47   77:invokestatic    #302 <Method byte[] d(int)>
	//   48   80:astore_3        
		abyte0;
	//   49   81:aload_2         
		JVM INSTR monitorexit ;
	//   50   82:monitorexit     
		return abyte1;
	//   51   83:aload_3         
	//   52   84:areturn         
		Exception exception;
		exception;
	//   53   85:astore_3        
	//*  54   86:aload_2         
		throw exception;
	//   55   87:monitorexit     
	//   56   88:aload_3         
	//   57   89:athrow          
	}

	private static byte[] b(byte abyte0[], byte abyte1[], byte abyte2[])
		throws Exception
	{
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
	//    0    0:ldc1            #244 <String "AES/CBC/PKCS7Padding">
	//    1    2:invokestatic    #249 <Method Cipher Cipher.getInstance(String)>
	//    2    5:astore_3        
		cipher.init(1, ((java.security.Key) (new SecretKeySpec(abyte1, "AES"))), ((java.security.spec.AlgorithmParameterSpec) (new IvParameterSpec(abyte2))));
	//    3    6:aload_3         
	//    4    7:iconst_1        
	//    5    8:new             #251 <Class SecretKeySpec>
	//    6   11:dup             
	//    7   12:aload_1         
	//    8   13:ldc1            #212 <String "AES">
	//    9   15:invokespecial   #254 <Method void SecretKeySpec(byte[], String)>
	//   10   18:new             #256 <Class IvParameterSpec>
	//   11   21:dup             
	//   12   22:aload_2         
	//   13   23:invokespecial   #259 <Method void IvParameterSpec(byte[])>
	//   14   26:invokevirtual   #262 <Method void Cipher.init(int, java.security.Key, java.security.spec.AlgorithmParameterSpec)>
		return cipher.doFinal(abyte0);
	//   15   29:aload_3         
	//   16   30:aload_0         
	//   17   31:invokevirtual   #266 <Method byte[] Cipher.doFinal(byte[])>
	//   18   34:areturn         
	}

	static String c(int j)
	{
		return a(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #304 <Method String a(int)>
	//    2    4:areturn         
	}

	private static String c(byte abyte0[], byte abyte1[], byte abyte2[])
	{
		abyte0 = ((byte []) (deg.a(abyte0).substring(0, 32)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #196 <Method String deg.a(byte[])>
	//    2    4:iconst_0        
	//    3    5:bipush          32
	//    4    7:invokevirtual   #309 <Method String String.substring(int, int)>
	//    5   10:astore_0        
		abyte1 = ((byte []) (deg.a(abyte1).substring(0, 32)));
	//    6   11:aload_1         
	//    7   12:invokestatic    #196 <Method String deg.a(byte[])>
	//    8   15:iconst_0        
	//    9   16:bipush          32
	//   10   18:invokevirtual   #309 <Method String String.substring(int, int)>
	//   11   21:astore_1        
		abyte2 = ((byte []) (deg.a(abyte2).substring(0, 32)));
	//   12   22:aload_2         
	//   13   23:invokestatic    #196 <Method String deg.a(byte[])>
	//   14   26:iconst_0        
	//   15   27:bipush          32
	//   16   29:invokevirtual   #309 <Method String String.substring(int, int)>
	//   17   32:astore_2        
		abyte0 = ((byte []) (((String) (abyte0)).toCharArray()));
	//   18   33:aload_0         
	//   19   34:invokevirtual   #144 <Method char[] String.toCharArray()>
	//   20   37:astore_0        
		abyte1 = ((byte []) (((String) (abyte1)).toCharArray()));
	//   21   38:aload_1         
	//   22   39:invokevirtual   #144 <Method char[] String.toCharArray()>
	//   23   42:astore_1        
		abyte2 = ((byte []) (((String) (abyte2)).toCharArray()));
	//   24   43:aload_2         
	//   25   44:invokevirtual   #144 <Method char[] String.toCharArray()>
	//   26   47:astore_2        
		char ac[] = new char[abyte0.length];
	//   27   48:aload_0         
	//   28   49:arraylength     
	//   29   50:newarray        char[]
	//   30   52:astore          4
		for(int j = 0; j < ac.length; j++)
	//*  31   54:iconst_0        
	//*  32   55:istore_3        
	//*  33   56:iload_3         
	//*  34   57:aload           4
	//*  35   59:arraylength     
	//*  36   60:icmpge          91
			ac[j] = (char)((abyte0[j] << 4 ^ abyte1[j]) >> 6 ^ abyte2[j]);
	//   37   63:aload           4
	//   38   65:iload_3         
	//   39   66:aload_0         
	//   40   67:iload_3         
	//   41   68:caload          
	//   42   69:iconst_4        
	//   43   70:ishl            
	//   44   71:aload_1         
	//   45   72:iload_3         
	//   46   73:caload          
	//   47   74:ixor            
	//   48   75:bipush          6
	//   49   77:ishr            
	//   50   78:aload_2         
	//   51   79:iload_3         
	//   52   80:caload          
	//   53   81:ixor            
	//   54   82:int2char        
	//   55   83:castore         

	//   56   84:iload_3         
	//   57   85:iconst_1        
	//   58   86:iadd            
	//   59   87:istore_3        
	//*  60   88:goto            56
		return String.valueOf(ac);
	//   61   91:aload           4
	//   62   93:invokestatic    #147 <Method String String.valueOf(char[])>
	//   63   96:areturn         
	}

	private static void c()
	{
		ded.d("KeyManager", new Object[] {
			"zzzz ====moveALLRootTOCP="
		});
	//    0    0:ldc1            #55  <String "KeyManager">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc2            #311 <String "zzzz ====moveALLRootTOCP=">
	//    6   11:aastore         
	//    7   12:invokestatic    #62  <Method void ded.d(String, Object[])>
		String s = BaseApplication.a().getSharedPreferences("encrypt_sharedpreferences_name4", 0).getString("id", "");
	//    8   15:invokestatic    #67  <Method Context BaseApplication.a()>
	//    9   18:ldc2            #313 <String "encrypt_sharedpreferences_name4">
	//   10   21:iconst_0        
	//   11   22:invokevirtual   #317 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   12   25:ldc2            #319 <String "id">
	//   13   28:ldc1            #64  <String "">
	//   14   30:invokeinterface #324 <Method String SharedPreferences.getString(String, String)>
	//   15   35:astore_0        
		if(!"".equals(((Object) (s))))
	//*  16   36:ldc1            #64  <String "">
	//*  17   38:aload_0         
	//*  18   39:invokevirtual   #328 <Method boolean String.equals(Object)>
	//*  19   42:ifne            165
		{
			ded.d("KeyManager", new Object[] {
				"zzzz ====C1====savetoCP=", s
			});
	//   20   45:ldc1            #55  <String "KeyManager">
	//   21   47:iconst_2        
	//   22   48:anewarray       Object[]
	//   23   51:dup             
	//   24   52:iconst_0        
	//   25   53:ldc2            #330 <String "zzzz ====C1====savetoCP=">
	//   26   56:aastore         
	//   27   57:dup             
	//   28   58:iconst_1        
	//   29   59:aload_0         
	//   30   60:aastore         
	//   31   61:invokestatic    #62  <Method void ded.d(String, Object[])>
			e("key_1", s);
	//   32   64:ldc2            #332 <String "key_1">
	//   33   67:aload_0         
	//   34   68:invokestatic    #202 <Method void e(String, String)>
			s = BaseApplication.a().getSharedPreferences("encrypt_sharedpreferences_name2", 0).getString("id", "");
	//   35   71:invokestatic    #67  <Method Context BaseApplication.a()>
	//   36   74:ldc2            #334 <String "encrypt_sharedpreferences_name2">
	//   37   77:iconst_0        
	//   38   78:invokevirtual   #317 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   39   81:ldc2            #319 <String "id">
	//   40   84:ldc1            #64  <String "">
	//   41   86:invokeinterface #324 <Method String SharedPreferences.getString(String, String)>
	//   42   91:astore_0        
			ded.d("KeyManager", new Object[] {
				"zzzz ====C2====savetoCP=", s
			});
	//   43   92:ldc1            #55  <String "KeyManager">
	//   44   94:iconst_2        
	//   45   95:anewarray       Object[]
	//   46   98:dup             
	//   47   99:iconst_0        
	//   48  100:ldc2            #336 <String "zzzz ====C2====savetoCP=">
	//   49  103:aastore         
	//   50  104:dup             
	//   51  105:iconst_1        
	//   52  106:aload_0         
	//   53  107:aastore         
	//   54  108:invokestatic    #62  <Method void ded.d(String, Object[])>
			e("key_2", s);
	//   55  111:ldc2            #338 <String "key_2">
	//   56  114:aload_0         
	//   57  115:invokestatic    #202 <Method void e(String, String)>
			s = BaseApplication.a().getSharedPreferences("encrypt_sharedpreferences_name3", 0).getString("id", "");
	//   58  118:invokestatic    #67  <Method Context BaseApplication.a()>
	//   59  121:ldc2            #340 <String "encrypt_sharedpreferences_name3">
	//   60  124:iconst_0        
	//   61  125:invokevirtual   #317 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   62  128:ldc2            #319 <String "id">
	//   63  131:ldc1            #64  <String "">
	//   64  133:invokeinterface #324 <Method String SharedPreferences.getString(String, String)>
	//   65  138:astore_0        
			ded.d("KeyManager", new Object[] {
				"zzzz ====C3====savetoCP=", s
			});
	//   66  139:ldc1            #55  <String "KeyManager">
	//   67  141:iconst_2        
	//   68  142:anewarray       Object[]
	//   69  145:dup             
	//   70  146:iconst_0        
	//   71  147:ldc2            #342 <String "zzzz ====C3====savetoCP=">
	//   72  150:aastore         
	//   73  151:dup             
	//   74  152:iconst_1        
	//   75  153:aload_0         
	//   76  154:aastore         
	//   77  155:invokestatic    #62  <Method void ded.d(String, Object[])>
			e("key_3", s);
	//   78  158:ldc2            #344 <String "key_3">
	//   79  161:aload_0         
	//   80  162:invokestatic    #202 <Method void e(String, String)>
		}
	//   81  165:return          
	}

	private static void c(String s, String s1)
	{
		byte abyte0[] = e;
	//    0    0:getstatic       #15  <Field byte[] e>
	//    1    3:astore_2        
		abyte0;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		ContentValues contentvalues;
		ded.d("KeyManager", new Object[] {
			"updateSecretKey:", s
		});
	//    4    6:ldc1            #55  <String "KeyManager">
	//    5    8:iconst_2        
	//    6    9:anewarray       Object[]
	//    7   12:dup             
	//    8   13:iconst_0        
	//    9   14:ldc2            #346 <String "updateSecretKey:">
	//   10   17:aastore         
	//   11   18:dup             
	//   12   19:iconst_1        
	//   13   20:aload_0         
	//   14   21:aastore         
	//   15   22:invokestatic    #62  <Method void ded.d(String, Object[])>
		dck.a(BaseApplication.a(), String.valueOf(1009), "backup_table", 2, "backupKey  varchar primary key ,backupValue varchar");
	//   16   25:invokestatic    #67  <Method Context BaseApplication.a()>
	//   17   28:sipush          1009
	//   18   31:invokestatic    #99  <Method String String.valueOf(int)>
	//   19   34:ldc1            #86  <String "backup_table">
	//   20   36:iconst_2        
	//   21   37:ldc1            #160 <String "backupKey  varchar primary key ,backupValue varchar">
	//   22   39:invokestatic    #349 <Method int dck.a(Context, String, String, int, String)>
	//   23   42:pop             
		contentvalues = new ContentValues();
	//   24   43:new             #175 <Class ContentValues>
	//   25   46:dup             
	//   26   47:invokespecial   #176 <Method void ContentValues()>
	//   27   50:astore_3        
		contentvalues.put("backupKey", s);
	//   28   51:aload_3         
	//   29   52:ldc1            #178 <String "backupKey">
	//   30   54:aload_0         
	//   31   55:invokevirtual   #181 <Method void ContentValues.put(String, String)>
		contentvalues.put("backupValue", s1);
	//   32   58:aload_3         
	//   33   59:ldc1            #115 <String "backupValue">
	//   34   61:aload_1         
	//   35   62:invokevirtual   #181 <Method void ContentValues.put(String, String)>
		if(!b(s))
			break MISSING_BLOCK_LABEL_159;
	//   36   65:aload_0         
	//   37   66:invokestatic    #351 <Method boolean b(String)>
	//   38   69:ifeq            159
		try
		{
			BaseApplication.a().getContentResolver().update(Uri.parse((new StringBuilder()).append(dck.d).append("module_").append(1009).append("_").append("backup_table").toString()), contentvalues, "backupKey like ?", new String[] {
				s
			});
	//   39   72:invokestatic    #67  <Method Context BaseApplication.a()>
	//   40   75:invokevirtual   #73  <Method ContentResolver Context.getContentResolver()>
	//   41   78:new             #19  <Class StringBuilder>
	//   42   81:dup             
	//   43   82:invokespecial   #22  <Method void StringBuilder()>
	//   44   85:getstatic       #77  <Field String dck.d>
	//   45   88:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   46   91:ldc1            #79  <String "module_">
	//   47   93:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   48   96:sipush          1009
	//   49   99:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//   50  102:ldc1            #84  <String "_">
	//   51  104:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   52  107:ldc1            #86  <String "backup_table">
	//   53  109:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   54  112:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   55  115:invokestatic    #92  <Method Uri Uri.parse(String)>
	//   56  118:aload_3         
	//   57  119:ldc1            #94  <String "backupKey like ?">
	//   58  121:iconst_1        
	//   59  122:anewarray       String[]
	//   60  125:dup             
	//   61  126:iconst_0        
	//   62  127:aload_0         
	//   63  128:aastore         
	//   64  129:invokevirtual   #355 <Method int ContentResolver.update(Uri, ContentValues, String, String[])>
	//   65  132:pop             
			break MISSING_BLOCK_LABEL_159;
	//   66  133:goto            159
		}
		// Misplaced declaration of an exception variable
		catch(String s) { }
	//   67  136:astore_0        
		ded.d("KeyManager", new Object[] {
			"updateSecretKey, ", ((SQLiteException) (s)).getMessage()
		});
	//   68  137:ldc1            #55  <String "KeyManager">
	//   69  139:iconst_2        
	//   70  140:anewarray       Object[]
	//   71  143:dup             
	//   72  144:iconst_0        
	//   73  145:ldc2            #357 <String "updateSecretKey, ">
	//   74  148:aastore         
	//   75  149:dup             
	//   76  150:iconst_1        
	//   77  151:aload_0         
	//   78  152:invokevirtual   #130 <Method String SQLiteException.getMessage()>
	//   79  155:aastore         
	//   80  156:invokestatic    #62  <Method void ded.d(String, Object[])>
		abyte0;
	//   81  159:aload_2         
		JVM INSTR monitorexit ;
	//   82  160:monitorexit     
		return;
	//   83  161:return          
		s;
	//   84  162:astore_0        
	//*  85  163:aload_2         
		throw s;
	//   86  164:monitorexit     
	//   87  165:aload_0         
	//   88  166:athrow          
	}

	private static boolean c(String s)
	{
		s = ((String) (BaseApplication.a().getContentResolver().query(Uri.parse((new StringBuilder()).append(c).append("backupCp").toString()), ((String []) (null)), "backupKey like ?", new String[] {
			s
		}, ((String) (null)))));
	//    0    0:invokestatic    #67  <Method Context BaseApplication.a()>
	//    1    3:invokevirtual   #73  <Method ContentResolver Context.getContentResolver()>
	//    2    6:new             #19  <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #22  <Method void StringBuilder()>
	//    5   13:getstatic       #48  <Field String c>
	//    6   16:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//    7   19:ldc1            #186 <String "backupCp">
	//    8   21:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//    9   24:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   10   27:invokestatic    #92  <Method Uri Uri.parse(String)>
	//   11   30:aconst_null     
	//   12   31:ldc1            #94  <String "backupKey like ?">
	//   13   33:iconst_1        
	//   14   34:anewarray       String[]
	//   15   37:dup             
	//   16   38:iconst_0        
	//   17   39:aload_0         
	//   18   40:aastore         
	//   19   41:aconst_null     
	//   20   42:invokevirtual   #105 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   21   45:astore_0        
		boolean flag = false;
	//   22   46:iconst_0        
	//   23   47:istore_1        
		boolean flag1 = false;
	//   24   48:iconst_0        
	//   25   49:istore_2        
		if(s != null)
	//*  26   50:aload_0         
	//*  27   51:ifnull          73
		{
			flag = flag1;
	//   28   54:iload_2         
	//   29   55:istore_1        
			if(((Cursor) (s)).getCount() > 0)
	//*  30   56:aload_0         
	//*  31   57:invokeinterface #273 <Method int Cursor.getCount()>
	//*  32   62:ifle            67
				flag = true;
	//   33   65:iconst_1        
	//   34   66:istore_1        
			((Cursor) (s)).close();
	//   35   67:aload_0         
	//   36   68:invokeinterface #125 <Method void Cursor.close()>
		}
		ded.d("KeyManager", new Object[] {
			"isHaveInBackupCp:", Boolean.valueOf(flag)
		});
	//   37   73:ldc1            #55  <String "KeyManager">
	//   38   75:iconst_2        
	//   39   76:anewarray       Object[]
	//   40   79:dup             
	//   41   80:iconst_0        
	//   42   81:ldc2            #359 <String "isHaveInBackupCp:">
	//   43   84:aastore         
	//   44   85:dup             
	//   45   86:iconst_1        
	//   46   87:iload_1         
	//   47   88:invokestatic    #282 <Method Boolean Boolean.valueOf(boolean)>
	//   48   91:aastore         
	//   49   92:invokestatic    #62  <Method void ded.d(String, Object[])>
		return flag;
	//   50   95:iload_1         
	//   51   96:ireturn         
	}

	private static String d(String s)
	{
		Object obj1;
		String s1;
		s1 = "";
	//    0    0:ldc1            #64  <String "">
	//    1    2:astore_3        
		obj1 = ((Object) (s1));
	//    2    3:aload_3         
	//    3    4:astore_2        
		Cursor cursor = BaseApplication.a().getContentResolver().query(Uri.parse((new StringBuilder()).append(dck.d).append("module_").append(1009).append("_").append("backup_table").toString()), ((String []) (null)), "backupKey like ?", new String[] {
			s
		}, ((String) (null)));
	//    4    5:invokestatic    #67  <Method Context BaseApplication.a()>
	//    5    8:invokevirtual   #73  <Method ContentResolver Context.getContentResolver()>
	//    6   11:new             #19  <Class StringBuilder>
	//    7   14:dup             
	//    8   15:invokespecial   #22  <Method void StringBuilder()>
	//    9   18:getstatic       #77  <Field String dck.d>
	//   10   21:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:ldc1            #79  <String "module_">
	//   12   26:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   13   29:sipush          1009
	//   14   32:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//   15   35:ldc1            #84  <String "_">
	//   16   37:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   17   40:ldc1            #86  <String "backup_table">
	//   18   42:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   19   45:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   20   48:invokestatic    #92  <Method Uri Uri.parse(String)>
	//   21   51:aconst_null     
	//   22   52:ldc1            #94  <String "backupKey like ?">
	//   23   54:iconst_1        
	//   24   55:anewarray       String[]
	//   25   58:dup             
	//   26   59:iconst_0        
	//   27   60:aload_0         
	//   28   61:aastore         
	//   29   62:aconst_null     
	//   30   63:invokevirtual   #105 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   31   66:astore          4
		Object obj;
		obj = ((Object) (s1));
	//   32   68:aload_3         
	//   33   69:astore_1        
		if(cursor == null)
			break MISSING_BLOCK_LABEL_145;
	//   34   70:aload           4
	//   35   72:ifnull          117
		obj = ((Object) (s1));
	//   36   75:aload_3         
	//   37   76:astore_1        
		obj1 = ((Object) (s1));
	//   38   77:aload_3         
	//   39   78:astore_2        
		if(!cursor.moveToNext())
			break MISSING_BLOCK_LABEL_108;
	//   40   79:aload           4
	//   41   81:invokeinterface #113 <Method boolean Cursor.moveToNext()>
	//   42   86:ifeq            108
		obj1 = ((Object) (s1));
	//   43   89:aload_3         
	//   44   90:astore_2        
		obj = ((Object) (cursor.getString(cursor.getColumnIndex("backupValue"))));
	//   45   91:aload           4
	//   46   93:aload           4
	//   47   95:ldc1            #115 <String "backupValue">
	//   48   97:invokeinterface #119 <Method int Cursor.getColumnIndex(String)>
	//   49  102:invokeinterface #122 <Method String Cursor.getString(int)>
	//   50  107:astore_1        
		obj1 = obj;
	//   51  108:aload_1         
	//   52  109:astore_2        
		try
		{
			cursor.close();
	//   53  110:aload           4
	//   54  112:invokeinterface #125 <Method void Cursor.close()>
		}
	//*  55  117:goto            145
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  56  120:astore_1        
		{
			ded.d("KeyManager", new Object[] {
				"getWorkKeyEncryptByCP, ", ((SQLiteException) (obj)).getMessage()
			});
	//   57  121:ldc1            #55  <String "KeyManager">
	//   58  123:iconst_2        
	//   59  124:anewarray       Object[]
	//   60  127:dup             
	//   61  128:iconst_0        
	//   62  129:ldc2            #362 <String "getWorkKeyEncryptByCP, ">
	//   63  132:aastore         
	//   64  133:dup             
	//   65  134:iconst_1        
	//   66  135:aload_1         
	//   67  136:invokevirtual   #130 <Method String SQLiteException.getMessage()>
	//   68  139:aastore         
	//   69  140:invokestatic    #62  <Method void ded.d(String, Object[])>
			obj = obj1;
	//   70  143:aload_2         
	//   71  144:astore_1        
		}
		ded.d("KeyManager", new Object[] {
			"getWorkKeyEncryptByCP, key:", s, ";value is:", obj
		});
	//   72  145:ldc1            #55  <String "KeyManager">
	//   73  147:iconst_4        
	//   74  148:anewarray       Object[]
	//   75  151:dup             
	//   76  152:iconst_0        
	//   77  153:ldc2            #364 <String "getWorkKeyEncryptByCP, key:">
	//   78  156:aastore         
	//   79  157:dup             
	//   80  158:iconst_1        
	//   81  159:aload_0         
	//   82  160:aastore         
	//   83  161:dup             
	//   84  162:iconst_2        
	//   85  163:ldc1            #139 <String ";value is:">
	//   86  165:aastore         
	//   87  166:dup             
	//   88  167:iconst_3        
	//   89  168:aload_1         
	//   90  169:aastore         
	//   91  170:invokestatic    #62  <Method void ded.d(String, Object[])>
		return ((String) (obj));
	//   92  173:aload_1         
	//   93  174:areturn         
	}

	public static void d()
	{
		byte abyte0[] = e;
	//    0    0:getstatic       #15  <Field byte[] e>
	//    1    3:astore          17
		abyte0;
	//    2    5:aload           17
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		File file;
		ded.d("KeyManager", new Object[] {
			"initAllKey begin"
		});
	//    4    8:ldc1            #55  <String "KeyManager">
	//    5   10:iconst_1        
	//    6   11:anewarray       Object[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:ldc2            #370 <String "initAllKey begin">
	//   10   19:aastore         
	//   11   20:invokestatic    #62  <Method void ded.d(String, Object[])>
		String s = BaseApplication.a().getFilesDir().getAbsolutePath();
	//   12   23:invokestatic    #67  <Method Context BaseApplication.a()>
	//   13   26:invokevirtual   #374 <Method File Context.getFilesDir()>
	//   14   29:invokevirtual   #379 <Method String File.getAbsolutePath()>
	//   15   32:astore_0        
		file = new File((new StringBuilder()).append(s).append("/lock.xml").toString());
	//   16   33:new             #376 <Class File>
	//   17   36:dup             
	//   18   37:new             #19  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #22  <Method void StringBuilder()>
	//   21   44:aload_0         
	//   22   45:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   23   48:ldc2            #381 <String "/lock.xml">
	//   24   51:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   25   54:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   26   57:invokespecial   #383 <Method void File(String)>
	//   27   60:astore          18
		Object obj;
		Object obj2;
		Object obj3;
		FileChannel filechannel;
		FileChannel filechannel1;
		FileChannel filechannel2;
		Object obj4;
		Object obj5;
		Object obj6;
		Object obj7;
		Object obj8;
		Object obj9;
		Object obj10;
		Object obj11;
		Object obj12;
		Object obj13;
		Object obj14;
		obj8 = null;
	//   28   62:aconst_null     
	//   29   63:astore          10
		obj9 = null;
	//   30   65:aconst_null     
	//   31   66:astore          11
		obj10 = null;
	//   32   68:aconst_null     
	//   33   69:astore          12
		filechannel = null;
	//   34   71:aconst_null     
	//   35   72:astore_3        
		obj11 = null;
	//   36   73:aconst_null     
	//   37   74:astore          13
		obj12 = null;
	//   38   76:aconst_null     
	//   39   77:astore          14
		obj13 = null;
	//   40   79:aconst_null     
	//   41   80:astore          15
		obj14 = null;
	//   42   82:aconst_null     
	//   43   83:astore          16
		obj = null;
	//   44   85:aconst_null     
	//   45   86:astore_0        
		filechannel1 = filechannel;
	//   46   87:aload_3         
	//   47   88:astore          4
		obj4 = ((Object) (obj11));
	//   48   90:aload           13
	//   49   92:astore          6
		filechannel2 = ((FileChannel) (obj8));
	//   50   94:aload           10
	//   51   96:astore          5
		obj5 = ((Object) (obj12));
	//   52   98:aload           14
	//   53  100:astore          7
		obj6 = ((Object) (obj9));
	//   54  102:aload           11
	//   55  104:astore          8
		obj7 = ((Object) (obj13));
	//   56  106:aload           15
	//   57  108:astore          9
		obj2 = ((Object) (obj10));
	//   58  110:aload           12
	//   59  112:astore_1        
		obj3 = ((Object) (obj14));
	//   60  113:aload           16
	//   61  115:astore_2        
		if(file.exists())
			break MISSING_BLOCK_LABEL_179;
	//   62  116:aload           18
	//   63  118:invokevirtual   #386 <Method boolean File.exists()>
	//   64  121:ifne            179
		filechannel1 = filechannel;
	//   65  124:aload_3         
	//   66  125:astore          4
		obj4 = ((Object) (obj11));
	//   67  127:aload           13
	//   68  129:astore          6
		filechannel2 = ((FileChannel) (obj8));
	//   69  131:aload           10
	//   70  133:astore          5
		obj5 = ((Object) (obj12));
	//   71  135:aload           14
	//   72  137:astore          7
		obj6 = ((Object) (obj9));
	//   73  139:aload           11
	//   74  141:astore          8
		obj7 = ((Object) (obj13));
	//   75  143:aload           15
	//   76  145:astore          9
		obj2 = ((Object) (obj10));
	//   77  147:aload           12
	//   78  149:astore_1        
		obj3 = ((Object) (obj14));
	//   79  150:aload           16
	//   80  152:astore_2        
		ded.d("KeyManager", new Object[] {
			"initAllKey create file result: ", Boolean.valueOf(file.createNewFile())
		});
	//   81  153:ldc1            #55  <String "KeyManager">
	//   82  155:iconst_2        
	//   83  156:anewarray       Object[]
	//   84  159:dup             
	//   85  160:iconst_0        
	//   86  161:ldc2            #388 <String "initAllKey create file result: ">
	//   87  164:aastore         
	//   88  165:dup             
	//   89  166:iconst_1        
	//   90  167:aload           18
	//   91  169:invokevirtual   #391 <Method boolean File.createNewFile()>
	//   92  172:invokestatic    #282 <Method Boolean Boolean.valueOf(boolean)>
	//   93  175:aastore         
	//   94  176:invokestatic    #62  <Method void ded.d(String, Object[])>
		filechannel1 = filechannel;
	//   95  179:aload_3         
	//   96  180:astore          4
		obj4 = ((Object) (obj11));
	//   97  182:aload           13
	//   98  184:astore          6
		filechannel2 = ((FileChannel) (obj8));
	//   99  186:aload           10
	//  100  188:astore          5
		obj5 = ((Object) (obj12));
	//  101  190:aload           14
	//  102  192:astore          7
		obj6 = ((Object) (obj9));
	//  103  194:aload           11
	//  104  196:astore          8
		obj7 = ((Object) (obj13));
	//  105  198:aload           15
	//  106  200:astore          9
		obj2 = ((Object) (obj10));
	//  107  202:aload           12
	//  108  204:astore_1        
		obj3 = ((Object) (obj14));
	//  109  205:aload           16
	//  110  207:astore_2        
		filechannel = (new FileOutputStream(file, true)).getChannel();
	//  111  208:new             #393 <Class FileOutputStream>
	//  112  211:dup             
	//  113  212:aload           18
	//  114  214:iconst_1        
	//  115  215:invokespecial   #396 <Method void FileOutputStream(File, boolean)>
	//  116  218:invokevirtual   #400 <Method FileChannel FileOutputStream.getChannel()>
	//  117  221:astore_3        
_L2:
		if(obj != null)
			break; /* Loop/switch isn't completed */
	//  118  222:aload_0         
	//  119  223:ifnonnull       317
		filechannel1 = filechannel;
	//  120  226:aload_3         
	//  121  227:astore          4
		obj4 = obj;
	//  122  229:aload_0         
	//  123  230:astore          6
		filechannel2 = filechannel;
	//  124  232:aload_3         
	//  125  233:astore          5
		obj5 = obj;
	//  126  235:aload_0         
	//  127  236:astore          7
		obj2 = ((Object) (filechannel));
	//  128  238:aload_3         
	//  129  239:astore_1        
		obj3 = obj;
	//  130  240:aload_0         
	//  131  241:astore_2        
		obj6 = ((Object) (filechannel.lock()));
	//  132  242:aload_3         
	//  133  243:invokevirtual   #406 <Method FileLock FileChannel.lock()>
	//  134  246:astore          8
		obj = obj6;
	//  135  248:aload           8
	//  136  250:astore_0        
		continue; /* Loop/switch isn't completed */
	//  137  251:goto            222
		Exception exception;
		exception;
	//  138  254:astore          10
		filechannel1 = filechannel;
	//  139  256:aload_3         
	//  140  257:astore          4
		obj4 = obj;
	//  141  259:aload_0         
	//  142  260:astore          6
		filechannel2 = filechannel;
	//  143  262:aload_3         
	//  144  263:astore          5
		obj5 = obj;
	//  145  265:aload_0         
	//  146  266:astore          7
		obj6 = ((Object) (filechannel));
	//  147  268:aload_3         
	//  148  269:astore          8
		obj7 = obj;
	//  149  271:aload_0         
	//  150  272:astore          9
		obj2 = ((Object) (filechannel));
	//  151  274:aload_3         
	//  152  275:astore_1        
		obj3 = obj;
	//  153  276:aload_0         
	//  154  277:astore_2        
		ded.d("KeyManager", new Object[] {
			(new StringBuilder()).append("initAllKey lock get error ").append(exception.getMessage()).toString()
		});
	//  155  278:ldc1            #55  <String "KeyManager">
	//  156  280:iconst_1        
	//  157  281:anewarray       Object[]
	//  158  284:dup             
	//  159  285:iconst_0        
	//  160  286:new             #19  <Class StringBuilder>
	//  161  289:dup             
	//  162  290:invokespecial   #22  <Method void StringBuilder()>
	//  163  293:ldc2            #408 <String "initAllKey lock get error ">
	//  164  296:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  165  299:aload           10
	//  166  301:invokevirtual   #409 <Method String Exception.getMessage()>
	//  167  304:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  168  307:invokevirtual   #46  <Method String StringBuilder.toString()>
	//  169  310:aastore         
	//  170  311:invokestatic    #62  <Method void ded.d(String, Object[])>
		if(true) goto _L2; else goto _L1
	//  171  314:goto            222
_L1:
		filechannel1 = filechannel;
	//  172  317:aload_3         
	//  173  318:astore          4
		obj4 = obj;
	//  174  320:aload_0         
	//  175  321:astore          6
		filechannel2 = filechannel;
	//  176  323:aload_3         
	//  177  324:astore          5
		obj5 = obj;
	//  178  326:aload_0         
	//  179  327:astore          7
		obj6 = ((Object) (filechannel));
	//  180  329:aload_3         
	//  181  330:astore          8
		obj7 = obj;
	//  182  332:aload_0         
	//  183  333:astore          9
		obj2 = ((Object) (filechannel));
	//  184  335:aload_3         
	//  185  336:astore_1        
		obj3 = obj;
	//  186  337:aload_0         
	//  187  338:astore_2        
		g();
	//  188  339:invokestatic    #412 <Method void g()>
		filechannel1 = filechannel;
	//  189  342:aload_3         
	//  190  343:astore          4
		obj4 = obj;
	//  191  345:aload_0         
	//  192  346:astore          6
		filechannel2 = filechannel;
	//  193  348:aload_3         
	//  194  349:astore          5
		obj5 = obj;
	//  195  351:aload_0         
	//  196  352:astore          7
		obj6 = ((Object) (filechannel));
	//  197  354:aload_3         
	//  198  355:astore          8
		obj7 = obj;
	//  199  357:aload_0         
	//  200  358:astore          9
		obj2 = ((Object) (filechannel));
	//  201  360:aload_3         
	//  202  361:astore_1        
		obj3 = obj;
	//  203  362:aload_0         
	//  204  363:astore_2        
		k(14);
	//  205  364:bipush          14
	//  206  366:invokestatic    #416 <Method void k(int)>
		filechannel1 = filechannel;
	//  207  369:aload_3         
	//  208  370:astore          4
		obj4 = obj;
	//  209  372:aload_0         
	//  210  373:astore          6
		filechannel2 = filechannel;
	//  211  375:aload_3         
	//  212  376:astore          5
		obj5 = obj;
	//  213  378:aload_0         
	//  214  379:astore          7
		obj6 = ((Object) (filechannel));
	//  215  381:aload_3         
	//  216  382:astore          8
		obj7 = obj;
	//  217  384:aload_0         
	//  218  385:astore          9
		obj2 = ((Object) (filechannel));
	//  219  387:aload_3         
	//  220  388:astore_1        
		obj3 = obj;
	//  221  389:aload_0         
	//  222  390:astore_2        
		k(13);
	//  223  391:bipush          13
	//  224  393:invokestatic    #416 <Method void k(int)>
		filechannel1 = filechannel;
	//  225  396:aload_3         
	//  226  397:astore          4
		obj4 = obj;
	//  227  399:aload_0         
	//  228  400:astore          6
		filechannel2 = filechannel;
	//  229  402:aload_3         
	//  230  403:astore          5
		obj5 = obj;
	//  231  405:aload_0         
	//  232  406:astore          7
		obj6 = ((Object) (filechannel));
	//  233  408:aload_3         
	//  234  409:astore          8
		obj7 = obj;
	//  235  411:aload_0         
	//  236  412:astore          9
		obj2 = ((Object) (filechannel));
	//  237  414:aload_3         
	//  238  415:astore_1        
		obj3 = obj;
	//  239  416:aload_0         
	//  240  417:astore_2        
		k(1);
	//  241  418:iconst_1        
	//  242  419:invokestatic    #416 <Method void k(int)>
		filechannel1 = filechannel;
	//  243  422:aload_3         
	//  244  423:astore          4
		obj4 = obj;
	//  245  425:aload_0         
	//  246  426:astore          6
		filechannel2 = filechannel;
	//  247  428:aload_3         
	//  248  429:astore          5
		obj5 = obj;
	//  249  431:aload_0         
	//  250  432:astore          7
		obj6 = ((Object) (filechannel));
	//  251  434:aload_3         
	//  252  435:astore          8
		obj7 = obj;
	//  253  437:aload_0         
	//  254  438:astore          9
		obj2 = ((Object) (filechannel));
	//  255  440:aload_3         
	//  256  441:astore_1        
		obj3 = obj;
	//  257  442:aload_0         
	//  258  443:astore_2        
		k(2);
	//  259  444:iconst_2        
	//  260  445:invokestatic    #416 <Method void k(int)>
		if(obj == null)
			break MISSING_BLOCK_LABEL_510;
	//  261  448:aload_0         
	//  262  449:ifnull          510
		ded.d("KeyManager", new Object[] {
			"initAllKey  release"
		});
	//  263  452:ldc1            #55  <String "KeyManager">
	//  264  454:iconst_1        
	//  265  455:anewarray       Object[]
	//  266  458:dup             
	//  267  459:iconst_0        
	//  268  460:ldc2            #418 <String "initAllKey  release">
	//  269  463:aastore         
	//  270  464:invokestatic    #62  <Method void ded.d(String, Object[])>
		((FileLock) (obj)).release();
	//  271  467:aload_0         
	//  272  468:invokevirtual   #423 <Method void FileLock.release()>
		break MISSING_BLOCK_LABEL_510;
	//  273  471:goto            510
		Object obj1;
		obj1;
	//  274  474:astore_0        
		ded.d("KeyManager", new Object[] {
			(new StringBuilder()).append("initAllKey exception5 ").append(((IOException) (obj1)).getMessage()).toString()
		});
	//  275  475:ldc1            #55  <String "KeyManager">
	//  276  477:iconst_1        
	//  277  478:anewarray       Object[]
	//  278  481:dup             
	//  279  482:iconst_0        
	//  280  483:new             #19  <Class StringBuilder>
	//  281  486:dup             
	//  282  487:invokespecial   #22  <Method void StringBuilder()>
	//  283  490:ldc2            #425 <String "initAllKey exception5 ">
	//  284  493:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  285  496:aload_0         
	//  286  497:invokevirtual   #426 <Method String IOException.getMessage()>
	//  287  500:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  288  503:invokevirtual   #46  <Method String StringBuilder.toString()>
	//  289  506:aastore         
	//  290  507:invokestatic    #62  <Method void ded.d(String, Object[])>
		if(filechannel == null)
			break MISSING_BLOCK_LABEL_1221;
	//  291  510:aload_3         
	//  292  511:ifnull          1221
		ded.d("KeyManager", new Object[] {
			"initAllKey  close"
		});
	//  293  514:ldc1            #55  <String "KeyManager">
	//  294  516:iconst_1        
	//  295  517:anewarray       Object[]
	//  296  520:dup             
	//  297  521:iconst_0        
	//  298  522:ldc2            #428 <String "initAllKey  close">
	//  299  525:aastore         
	//  300  526:invokestatic    #62  <Method void ded.d(String, Object[])>
		filechannel.close();
	//  301  529:aload_3         
	//  302  530:invokevirtual   #429 <Method void FileChannel.close()>
		break MISSING_BLOCK_LABEL_1221;
	//  303  533:goto            1221
		obj1;
	//  304  536:astore_0        
		ded.d("KeyManager", new Object[] {
			(new StringBuilder()).append("initAllKey exception6 ").append(((IOException) (obj1)).getMessage()).toString()
		});
	//  305  537:ldc1            #55  <String "KeyManager">
	//  306  539:iconst_1        
	//  307  540:anewarray       Object[]
	//  308  543:dup             
	//  309  544:iconst_0        
	//  310  545:new             #19  <Class StringBuilder>
	//  311  548:dup             
	//  312  549:invokespecial   #22  <Method void StringBuilder()>
	//  313  552:ldc2            #431 <String "initAllKey exception6 ">
	//  314  555:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  315  558:aload_0         
	//  316  559:invokevirtual   #426 <Method String IOException.getMessage()>
	//  317  562:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  318  565:invokevirtual   #46  <Method String StringBuilder.toString()>
	//  319  568:aastore         
	//  320  569:invokestatic    #62  <Method void ded.d(String, Object[])>
		break MISSING_BLOCK_LABEL_1221;
	//  321  572:goto            1221
		obj1;
	//  322  575:astore_0        
		obj2 = ((Object) (filechannel1));
	//  323  576:aload           4
	//  324  578:astore_1        
		obj3 = obj4;
	//  325  579:aload           6
	//  326  581:astore_2        
		ded.d("KeyManager", new Object[] {
			(new StringBuilder()).append("initAllKey exception1 ").append(((FileNotFoundException) (obj1)).getMessage()).toString()
		});
	//  327  582:ldc1            #55  <String "KeyManager">
	//  328  584:iconst_1        
	//  329  585:anewarray       Object[]
	//  330  588:dup             
	//  331  589:iconst_0        
	//  332  590:new             #19  <Class StringBuilder>
	//  333  593:dup             
	//  334  594:invokespecial   #22  <Method void StringBuilder()>
	//  335  597:ldc2            #433 <String "initAllKey exception1 ">
	//  336  600:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  337  603:aload_0         
	//  338  604:invokevirtual   #434 <Method String FileNotFoundException.getMessage()>
	//  339  607:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  340  610:invokevirtual   #46  <Method String StringBuilder.toString()>
	//  341  613:aastore         
	//  342  614:invokestatic    #62  <Method void ded.d(String, Object[])>
		if(obj4 == null)
			break MISSING_BLOCK_LABEL_681;
	//  343  617:aload           6
	//  344  619:ifnull          681
		ded.d("KeyManager", new Object[] {
			"initAllKey  release"
		});
	//  345  622:ldc1            #55  <String "KeyManager">
	//  346  624:iconst_1        
	//  347  625:anewarray       Object[]
	//  348  628:dup             
	//  349  629:iconst_0        
	//  350  630:ldc2            #418 <String "initAllKey  release">
	//  351  633:aastore         
	//  352  634:invokestatic    #62  <Method void ded.d(String, Object[])>
		((FileLock) (obj4)).release();
	//  353  637:aload           6
	//  354  639:invokevirtual   #423 <Method void FileLock.release()>
		break MISSING_BLOCK_LABEL_681;
	//  355  642:goto            681
		obj1;
	//  356  645:astore_0        
		ded.d("KeyManager", new Object[] {
			(new StringBuilder()).append("initAllKey exception5 ").append(((IOException) (obj1)).getMessage()).toString()
		});
	//  357  646:ldc1            #55  <String "KeyManager">
	//  358  648:iconst_1        
	//  359  649:anewarray       Object[]
	//  360  652:dup             
	//  361  653:iconst_0        
	//  362  654:new             #19  <Class StringBuilder>
	//  363  657:dup             
	//  364  658:invokespecial   #22  <Method void StringBuilder()>
	//  365  661:ldc2            #425 <String "initAllKey exception5 ">
	//  366  664:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  367  667:aload_0         
	//  368  668:invokevirtual   #426 <Method String IOException.getMessage()>
	//  369  671:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  370  674:invokevirtual   #46  <Method String StringBuilder.toString()>
	//  371  677:aastore         
	//  372  678:invokestatic    #62  <Method void ded.d(String, Object[])>
		if(filechannel1 == null)
			break MISSING_BLOCK_LABEL_1221;
	//  373  681:aload           4
	//  374  683:ifnull          1221
		ded.d("KeyManager", new Object[] {
			"initAllKey  close"
		});
	//  375  686:ldc1            #55  <String "KeyManager">
	//  376  688:iconst_1        
	//  377  689:anewarray       Object[]
	//  378  692:dup             
	//  379  693:iconst_0        
	//  380  694:ldc2            #428 <String "initAllKey  close">
	//  381  697:aastore         
	//  382  698:invokestatic    #62  <Method void ded.d(String, Object[])>
		filechannel1.close();
	//  383  701:aload           4
	//  384  703:invokevirtual   #429 <Method void FileChannel.close()>
		break MISSING_BLOCK_LABEL_1221;
	//  385  706:goto            1221
		obj1;
	//  386  709:astore_0        
		ded.d("KeyManager", new Object[] {
			(new StringBuilder()).append("initAllKey exception6 ").append(((IOException) (obj1)).getMessage()).toString()
		});
	//  387  710:ldc1            #55  <String "KeyManager">
	//  388  712:iconst_1        
	//  389  713:anewarray       Object[]
	//  390  716:dup             
	//  391  717:iconst_0        
	//  392  718:new             #19  <Class StringBuilder>
	//  393  721:dup             
	//  394  722:invokespecial   #22  <Method void StringBuilder()>
	//  395  725:ldc2            #431 <String "initAllKey exception6 ">
	//  396  728:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  397  731:aload_0         
	//  398  732:invokevirtual   #426 <Method String IOException.getMessage()>
	//  399  735:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  400  738:invokevirtual   #46  <Method String StringBuilder.toString()>
	//  401  741:aastore         
	//  402  742:invokestatic    #62  <Method void ded.d(String, Object[])>
		break MISSING_BLOCK_LABEL_1221;
	//  403  745:goto            1221
		obj1;
	//  404  748:astore_0        
		obj2 = ((Object) (filechannel2));
	//  405  749:aload           5
	//  406  751:astore_1        
		obj3 = obj5;
	//  407  752:aload           7
	//  408  754:astore_2        
		ded.d("KeyManager", new Object[] {
			(new StringBuilder()).append("initAllKey exception2 ").append(((IOException) (obj1)).getMessage()).toString()
		});
	//  409  755:ldc1            #55  <String "KeyManager">
	//  410  757:iconst_1        
	//  411  758:anewarray       Object[]
	//  412  761:dup             
	//  413  762:iconst_0        
	//  414  763:new             #19  <Class StringBuilder>
	//  415  766:dup             
	//  416  767:invokespecial   #22  <Method void StringBuilder()>
	//  417  770:ldc2            #436 <String "initAllKey exception2 ">
	//  418  773:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  419  776:aload_0         
	//  420  777:invokevirtual   #426 <Method String IOException.getMessage()>
	//  421  780:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  422  783:invokevirtual   #46  <Method String StringBuilder.toString()>
	//  423  786:aastore         
	//  424  787:invokestatic    #62  <Method void ded.d(String, Object[])>
		if(obj5 == null)
			break MISSING_BLOCK_LABEL_854;
	//  425  790:aload           7
	//  426  792:ifnull          854
		ded.d("KeyManager", new Object[] {
			"initAllKey  release"
		});
	//  427  795:ldc1            #55  <String "KeyManager">
	//  428  797:iconst_1        
	//  429  798:anewarray       Object[]
	//  430  801:dup             
	//  431  802:iconst_0        
	//  432  803:ldc2            #418 <String "initAllKey  release">
	//  433  806:aastore         
	//  434  807:invokestatic    #62  <Method void ded.d(String, Object[])>
		((FileLock) (obj5)).release();
	//  435  810:aload           7
	//  436  812:invokevirtual   #423 <Method void FileLock.release()>
		break MISSING_BLOCK_LABEL_854;
	//  437  815:goto            854
		obj1;
	//  438  818:astore_0        
		ded.d("KeyManager", new Object[] {
			(new StringBuilder()).append("initAllKey exception5 ").append(((IOException) (obj1)).getMessage()).toString()
		});
	//  439  819:ldc1            #55  <String "KeyManager">
	//  440  821:iconst_1        
	//  441  822:anewarray       Object[]
	//  442  825:dup             
	//  443  826:iconst_0        
	//  444  827:new             #19  <Class StringBuilder>
	//  445  830:dup             
	//  446  831:invokespecial   #22  <Method void StringBuilder()>
	//  447  834:ldc2            #425 <String "initAllKey exception5 ">
	//  448  837:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  449  840:aload_0         
	//  450  841:invokevirtual   #426 <Method String IOException.getMessage()>
	//  451  844:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  452  847:invokevirtual   #46  <Method String StringBuilder.toString()>
	//  453  850:aastore         
	//  454  851:invokestatic    #62  <Method void ded.d(String, Object[])>
		if(filechannel2 == null)
			break MISSING_BLOCK_LABEL_1221;
	//  455  854:aload           5
	//  456  856:ifnull          1221
		ded.d("KeyManager", new Object[] {
			"initAllKey  close"
		});
	//  457  859:ldc1            #55  <String "KeyManager">
	//  458  861:iconst_1        
	//  459  862:anewarray       Object[]
	//  460  865:dup             
	//  461  866:iconst_0        
	//  462  867:ldc2            #428 <String "initAllKey  close">
	//  463  870:aastore         
	//  464  871:invokestatic    #62  <Method void ded.d(String, Object[])>
		filechannel2.close();
	//  465  874:aload           5
	//  466  876:invokevirtual   #429 <Method void FileChannel.close()>
		break MISSING_BLOCK_LABEL_1221;
	//  467  879:goto            1221
		obj1;
	//  468  882:astore_0        
		ded.d("KeyManager", new Object[] {
			(new StringBuilder()).append("initAllKey exception6 ").append(((IOException) (obj1)).getMessage()).toString()
		});
	//  469  883:ldc1            #55  <String "KeyManager">
	//  470  885:iconst_1        
	//  471  886:anewarray       Object[]
	//  472  889:dup             
	//  473  890:iconst_0        
	//  474  891:new             #19  <Class StringBuilder>
	//  475  894:dup             
	//  476  895:invokespecial   #22  <Method void StringBuilder()>
	//  477  898:ldc2            #431 <String "initAllKey exception6 ">
	//  478  901:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  479  904:aload_0         
	//  480  905:invokevirtual   #426 <Method String IOException.getMessage()>
	//  481  908:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  482  911:invokevirtual   #46  <Method String StringBuilder.toString()>
	//  483  914:aastore         
	//  484  915:invokestatic    #62  <Method void ded.d(String, Object[])>
		break MISSING_BLOCK_LABEL_1221;
	//  485  918:goto            1221
		obj1;
	//  486  921:astore_0        
		obj2 = obj6;
	//  487  922:aload           8
	//  488  924:astore_1        
		obj3 = obj7;
	//  489  925:aload           9
	//  490  927:astore_2        
		ded.d("KeyManager", new Object[] {
			(new StringBuilder()).append("initAllKey exception4 ").append(((Exception) (obj1)).getMessage()).toString()
		});
	//  491  928:ldc1            #55  <String "KeyManager">
	//  492  930:iconst_1        
	//  493  931:anewarray       Object[]
	//  494  934:dup             
	//  495  935:iconst_0        
	//  496  936:new             #19  <Class StringBuilder>
	//  497  939:dup             
	//  498  940:invokespecial   #22  <Method void StringBuilder()>
	//  499  943:ldc2            #438 <String "initAllKey exception4 ">
	//  500  946:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  501  949:aload_0         
	//  502  950:invokevirtual   #409 <Method String Exception.getMessage()>
	//  503  953:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  504  956:invokevirtual   #46  <Method String StringBuilder.toString()>
	//  505  959:aastore         
	//  506  960:invokestatic    #62  <Method void ded.d(String, Object[])>
		if(obj7 == null)
			break MISSING_BLOCK_LABEL_1027;
	//  507  963:aload           9
	//  508  965:ifnull          1027
		ded.d("KeyManager", new Object[] {
			"initAllKey  release"
		});
	//  509  968:ldc1            #55  <String "KeyManager">
	//  510  970:iconst_1        
	//  511  971:anewarray       Object[]
	//  512  974:dup             
	//  513  975:iconst_0        
	//  514  976:ldc2            #418 <String "initAllKey  release">
	//  515  979:aastore         
	//  516  980:invokestatic    #62  <Method void ded.d(String, Object[])>
		((FileLock) (obj7)).release();
	//  517  983:aload           9
	//  518  985:invokevirtual   #423 <Method void FileLock.release()>
		break MISSING_BLOCK_LABEL_1027;
	//  519  988:goto            1027
		obj1;
	//  520  991:astore_0        
		ded.d("KeyManager", new Object[] {
			(new StringBuilder()).append("initAllKey exception5 ").append(((IOException) (obj1)).getMessage()).toString()
		});
	//  521  992:ldc1            #55  <String "KeyManager">
	//  522  994:iconst_1        
	//  523  995:anewarray       Object[]
	//  524  998:dup             
	//  525  999:iconst_0        
	//  526 1000:new             #19  <Class StringBuilder>
	//  527 1003:dup             
	//  528 1004:invokespecial   #22  <Method void StringBuilder()>
	//  529 1007:ldc2            #425 <String "initAllKey exception5 ">
	//  530 1010:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  531 1013:aload_0         
	//  532 1014:invokevirtual   #426 <Method String IOException.getMessage()>
	//  533 1017:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  534 1020:invokevirtual   #46  <Method String StringBuilder.toString()>
	//  535 1023:aastore         
	//  536 1024:invokestatic    #62  <Method void ded.d(String, Object[])>
		if(obj6 == null)
			break MISSING_BLOCK_LABEL_1221;
	//  537 1027:aload           8
	//  538 1029:ifnull          1221
		ded.d("KeyManager", new Object[] {
			"initAllKey  close"
		});
	//  539 1032:ldc1            #55  <String "KeyManager">
	//  540 1034:iconst_1        
	//  541 1035:anewarray       Object[]
	//  542 1038:dup             
	//  543 1039:iconst_0        
	//  544 1040:ldc2            #428 <String "initAllKey  close">
	//  545 1043:aastore         
	//  546 1044:invokestatic    #62  <Method void ded.d(String, Object[])>
		((FileChannel) (obj6)).close();
	//  547 1047:aload           8
	//  548 1049:invokevirtual   #429 <Method void FileChannel.close()>
		break MISSING_BLOCK_LABEL_1221;
	//  549 1052:goto            1221
		obj1;
	//  550 1055:astore_0        
		ded.d("KeyManager", new Object[] {
			(new StringBuilder()).append("initAllKey exception6 ").append(((IOException) (obj1)).getMessage()).toString()
		});
	//  551 1056:ldc1            #55  <String "KeyManager">
	//  552 1058:iconst_1        
	//  553 1059:anewarray       Object[]
	//  554 1062:dup             
	//  555 1063:iconst_0        
	//  556 1064:new             #19  <Class StringBuilder>
	//  557 1067:dup             
	//  558 1068:invokespecial   #22  <Method void StringBuilder()>
	//  559 1071:ldc2            #431 <String "initAllKey exception6 ">
	//  560 1074:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  561 1077:aload_0         
	//  562 1078:invokevirtual   #426 <Method String IOException.getMessage()>
	//  563 1081:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  564 1084:invokevirtual   #46  <Method String StringBuilder.toString()>
	//  565 1087:aastore         
	//  566 1088:invokestatic    #62  <Method void ded.d(String, Object[])>
		break MISSING_BLOCK_LABEL_1221;
	//  567 1091:goto            1221
		obj1;
	//  568 1094:astore_0        
		if(obj3 == null)
			break MISSING_BLOCK_LABEL_1157;
	//  569 1095:aload_2         
	//  570 1096:ifnull          1157
		ded.d("KeyManager", new Object[] {
			"initAllKey  release"
		});
	//  571 1099:ldc1            #55  <String "KeyManager">
	//  572 1101:iconst_1        
	//  573 1102:anewarray       Object[]
	//  574 1105:dup             
	//  575 1106:iconst_0        
	//  576 1107:ldc2            #418 <String "initAllKey  release">
	//  577 1110:aastore         
	//  578 1111:invokestatic    #62  <Method void ded.d(String, Object[])>
		((FileLock) (obj3)).release();
	//  579 1114:aload_2         
	//  580 1115:invokevirtual   #423 <Method void FileLock.release()>
		break MISSING_BLOCK_LABEL_1157;
	//  581 1118:goto            1157
		IOException ioexception1;
		ioexception1;
	//  582 1121:astore_2        
		ded.d("KeyManager", new Object[] {
			(new StringBuilder()).append("initAllKey exception5 ").append(ioexception1.getMessage()).toString()
		});
	//  583 1122:ldc1            #55  <String "KeyManager">
	//  584 1124:iconst_1        
	//  585 1125:anewarray       Object[]
	//  586 1128:dup             
	//  587 1129:iconst_0        
	//  588 1130:new             #19  <Class StringBuilder>
	//  589 1133:dup             
	//  590 1134:invokespecial   #22  <Method void StringBuilder()>
	//  591 1137:ldc2            #425 <String "initAllKey exception5 ">
	//  592 1140:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  593 1143:aload_2         
	//  594 1144:invokevirtual   #426 <Method String IOException.getMessage()>
	//  595 1147:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  596 1150:invokevirtual   #46  <Method String StringBuilder.toString()>
	//  597 1153:aastore         
	//  598 1154:invokestatic    #62  <Method void ded.d(String, Object[])>
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_1219;
	//  599 1157:aload_1         
	//  600 1158:ifnull          1219
		ded.d("KeyManager", new Object[] {
			"initAllKey  close"
		});
	//  601 1161:ldc1            #55  <String "KeyManager">
	//  602 1163:iconst_1        
	//  603 1164:anewarray       Object[]
	//  604 1167:dup             
	//  605 1168:iconst_0        
	//  606 1169:ldc2            #428 <String "initAllKey  close">
	//  607 1172:aastore         
	//  608 1173:invokestatic    #62  <Method void ded.d(String, Object[])>
		((FileChannel) (obj2)).close();
	//  609 1176:aload_1         
	//  610 1177:invokevirtual   #429 <Method void FileChannel.close()>
		break MISSING_BLOCK_LABEL_1219;
	//  611 1180:goto            1219
		IOException ioexception;
		ioexception;
	//  612 1183:astore_1        
		ded.d("KeyManager", new Object[] {
			(new StringBuilder()).append("initAllKey exception6 ").append(ioexception.getMessage()).toString()
		});
	//  613 1184:ldc1            #55  <String "KeyManager">
	//  614 1186:iconst_1        
	//  615 1187:anewarray       Object[]
	//  616 1190:dup             
	//  617 1191:iconst_0        
	//  618 1192:new             #19  <Class StringBuilder>
	//  619 1195:dup             
	//  620 1196:invokespecial   #22  <Method void StringBuilder()>
	//  621 1199:ldc2            #431 <String "initAllKey exception6 ">
	//  622 1202:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  623 1205:aload_1         
	//  624 1206:invokevirtual   #426 <Method String IOException.getMessage()>
	//  625 1209:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  626 1212:invokevirtual   #46  <Method String StringBuilder.toString()>
	//  627 1215:aastore         
	//  628 1216:invokestatic    #62  <Method void ded.d(String, Object[])>
		throw obj1;
	//  629 1219:aload_0         
	//  630 1220:athrow          
		abyte0;
	//  631 1221:aload           17
		JVM INSTR monitorexit ;
	//  632 1223:monitorexit     
		return;
	//  633 1224:return          
		obj1;
	//  634 1225:astore_0        
	//* 635 1226:aload           17
		throw obj1;
	//  636 1228:monitorexit     
	//  637 1229:aload_0         
	//  638 1230:athrow          
	}

	static byte[] d(int j)
	{
		byte abyte2[] = e;
	//    0    0:getstatic       #15  <Field byte[] e>
	//    1    3:astore_3        
		abyte2;
	//    2    4:aload_3         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		byte abyte0[] = null;
	//    4    6:aconst_null     
	//    5    7:astore_1        
		byte abyte1[];
		ded.d("KeyManager", new Object[] {
			"get work key in cp"
		});
	//    6    8:ldc1            #55  <String "KeyManager">
	//    7   10:iconst_1        
	//    8   11:anewarray       Object[]
	//    9   14:dup             
	//   10   15:iconst_0        
	//   11   16:ldc2            #440 <String "get work key in cp">
	//   12   19:aastore         
	//   13   20:invokestatic    #62  <Method void ded.d(String, Object[])>
		abyte1 = f(j);
	//   14   23:iload_0         
	//   15   24:invokestatic    #443 <Method byte[] f(int)>
	//   16   27:astore_2        
		abyte0 = abyte1;
	//   17   28:aload_2         
	//   18   29:astore_1        
		break MISSING_BLOCK_LABEL_56;
	//   19   30:goto            56
		Exception exception1;
		exception1;
	//   20   33:astore_2        
		dho.f("KeyManager", new Object[] {
			"getSecurityKey:", exception1.getMessage()
		});
	//   21   34:ldc1            #55  <String "KeyManager">
	//   22   36:iconst_2        
	//   23   37:anewarray       Object[]
	//   24   40:dup             
	//   25   41:iconst_0        
	//   26   42:ldc2            #445 <String "getSecurityKey:">
	//   27   45:aastore         
	//   28   46:dup             
	//   29   47:iconst_1        
	//   30   48:aload_2         
	//   31   49:invokevirtual   #409 <Method String Exception.getMessage()>
	//   32   52:aastore         
	//   33   53:invokestatic    #449 <Method void dho.f(String, Object[])>
		abyte2;
	//   34   56:aload_3         
		JVM INSTR monitorexit ;
	//   35   57:monitorexit     
		return abyte0;
	//   36   58:aload_1         
	//   37   59:areturn         
		Exception exception;
		exception;
	//   38   60:astore_1        
	//*  39   61:aload_3         
		throw exception;
	//   40   62:monitorexit     
	//   41   63:aload_1         
	//   42   64:athrow          
	}

	static byte[] d(int j, byte abyte0[])
	{
		ded.d("KeyManager", new Object[] {
			"wt ------getWorkKeyByBackupCP begin"
		});
	//    0    0:ldc1            #55  <String "KeyManager">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc2            #452 <String "wt ------getWorkKeyByBackupCP begin">
	//    6   11:aastore         
	//    7   12:invokestatic    #62  <Method void ded.d(String, Object[])>
		String s2 = String.valueOf(j);
	//    8   15:iload_0         
	//    9   16:invokestatic    #99  <Method String String.valueOf(int)>
	//   10   19:astore          4
		Object obj = ((Object) (BaseApplication.a().getContentResolver().query(Uri.parse((new StringBuilder()).append(c).append("backupCp").toString()), ((String []) (null)), "backupKey like ?", new String[] {
			s2
		}, ((String) (null)))));
	//   11   21:invokestatic    #67  <Method Context BaseApplication.a()>
	//   12   24:invokevirtual   #73  <Method ContentResolver Context.getContentResolver()>
	//   13   27:new             #19  <Class StringBuilder>
	//   14   30:dup             
	//   15   31:invokespecial   #22  <Method void StringBuilder()>
	//   16   34:getstatic       #48  <Field String c>
	//   17   37:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   18   40:ldc1            #186 <String "backupCp">
	//   19   42:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   20   45:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   21   48:invokestatic    #92  <Method Uri Uri.parse(String)>
	//   22   51:aconst_null     
	//   23   52:ldc1            #94  <String "backupKey like ?">
	//   24   54:iconst_1        
	//   25   55:anewarray       String[]
	//   26   58:dup             
	//   27   59:iconst_0        
	//   28   60:aload           4
	//   29   62:aastore         
	//   30   63:aconst_null     
	//   31   64:invokevirtual   #105 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   32   67:astore          5
		String s1 = "";
	//   33   69:ldc1            #64  <String "">
	//   34   71:astore_3        
		String s = s1;
	//   35   72:aload_3         
	//   36   73:astore_2        
		if(obj != null)
	//*  37   74:aload           5
	//*  38   76:ifnull          115
		{
			s = s1;
	//   39   79:aload_3         
	//   40   80:astore_2        
			if(((Cursor) (obj)).moveToNext())
	//*  41   81:aload           5
	//*  42   83:invokeinterface #113 <Method boolean Cursor.moveToNext()>
	//*  43   88:ifeq            108
				s = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("backupValue"));
	//   44   91:aload           5
	//   45   93:aload           5
	//   46   95:ldc1            #115 <String "backupValue">
	//   47   97:invokeinterface #119 <Method int Cursor.getColumnIndex(String)>
	//   48  102:invokeinterface #122 <Method String Cursor.getString(int)>
	//   49  107:astore_2        
			((Cursor) (obj)).close();
	//   50  108:aload           5
	//   51  110:invokeinterface #125 <Method void Cursor.close()>
		}
		ded.d("KeyManager", new Object[] {
			"getWorkKeyByBackupCP, data_type:", Integer.valueOf(j), ";value is:", s
		});
	//   52  115:ldc1            #55  <String "KeyManager">
	//   53  117:iconst_4        
	//   54  118:anewarray       Object[]
	//   55  121:dup             
	//   56  122:iconst_0        
	//   57  123:ldc2            #454 <String "getWorkKeyByBackupCP, data_type:">
	//   58  126:aastore         
	//   59  127:dup             
	//   60  128:iconst_1        
	//   61  129:iload_0         
	//   62  130:invokestatic    #137 <Method Integer Integer.valueOf(int)>
	//   63  133:aastore         
	//   64  134:dup             
	//   65  135:iconst_2        
	//   66  136:ldc1            #139 <String ";value is:">
	//   67  138:aastore         
	//   68  139:dup             
	//   69  140:iconst_3        
	//   70  141:aload_2         
	//   71  142:aastore         
	//   72  143:invokestatic    #62  <Method void ded.d(String, Object[])>
		if(TextUtils.isEmpty(((CharSequence) (s))) || s.length() < 24)
	//*  73  146:aload_2         
	//*  74  147:invokestatic    #460 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  75  150:ifne            162
	//*  76  153:aload_2         
	//*  77  154:invokevirtual   #463 <Method int String.length()>
	//*  78  157:bipush          24
	//*  79  159:icmpge          179
		{
			ded.d("KeyManager", new Object[] {
				"wt ---getWorkKeyByBackupCP-----------length error"
			});
	//   80  162:ldc1            #55  <String "KeyManager">
	//   81  164:iconst_1        
	//   82  165:anewarray       Object[]
	//   83  168:dup             
	//   84  169:iconst_0        
	//   85  170:ldc2            #465 <String "wt ---getWorkKeyByBackupCP-----------length error">
	//   86  173:aastore         
	//   87  174:invokestatic    #62  <Method void ded.d(String, Object[])>
			return null;
	//   88  177:aconst_null     
	//   89  178:areturn         
		}
		ded.d("KeyManager", new Object[] {
			"wt ---getWorkKeyByBackupCP-----------get work key2"
		});
	//   90  179:ldc1            #55  <String "KeyManager">
	//   91  181:iconst_1        
	//   92  182:anewarray       Object[]
	//   93  185:dup             
	//   94  186:iconst_0        
	//   95  187:ldc2            #467 <String "wt ---getWorkKeyByBackupCP-----------get work key2">
	//   96  190:aastore         
	//   97  191:invokestatic    #62  <Method void ded.d(String, Object[])>
		s1 = s.substring(0, 24);
	//   98  194:aload_2         
	//   99  195:iconst_0        
	//  100  196:bipush          24
	//  101  198:invokevirtual   #309 <Method String String.substring(int, int)>
	//  102  201:astore_3        
		obj = ((Object) (s.substring(24, s.length())));
	//  103  202:aload_2         
	//  104  203:bipush          24
	//  105  205:aload_2         
	//  106  206:invokevirtual   #463 <Method int String.length()>
	//  107  209:invokevirtual   #309 <Method String String.substring(int, int)>
	//  108  212:astore          5
		ded.d("KeyManager", new Object[] {
			"wt --------getWorkKeyByBackupCP------get work key2, iv is:", s1, ";key is:", obj
		});
	//  109  214:ldc1            #55  <String "KeyManager">
	//  110  216:iconst_4        
	//  111  217:anewarray       Object[]
	//  112  220:dup             
	//  113  221:iconst_0        
	//  114  222:ldc2            #469 <String "wt --------getWorkKeyByBackupCP------get work key2, iv is:">
	//  115  225:aastore         
	//  116  226:dup             
	//  117  227:iconst_1        
	//  118  228:aload_3         
	//  119  229:aastore         
	//  120  230:dup             
	//  121  231:iconst_2        
	//  122  232:ldc2            #471 <String ";key is:">
	//  123  235:aastore         
	//  124  236:dup             
	//  125  237:iconst_3        
	//  126  238:aload           5
	//  127  240:aastore         
	//  128  241:invokestatic    #62  <Method void ded.d(String, Object[])>
		byte abyte1[] = deg.d(((String) (obj)));
	//  129  244:aload           5
	//  130  246:invokestatic    #474 <Method byte[] deg.d(String)>
	//  131  249:astore          6
		byte abyte2[] = deg.d(s1);
	//  132  251:aload_3         
	//  133  252:invokestatic    #474 <Method byte[] deg.d(String)>
	//  134  255:astore          7
		try
		{
			abyte0 = a(abyte1, abyte0, abyte2);
	//  135  257:aload           6
	//  136  259:aload_1         
	//  137  260:aload           7
	//  138  262:invokestatic    #476 <Method byte[] a(byte[], byte[], byte[])>
	//  139  265:astore_1        
			c(s2, s);
	//  140  266:aload           4
	//  141  268:aload_2         
	//  142  269:invokestatic    #478 <Method void c(String, String)>
		}
	//* 143  272:aload_1         
	//* 144  273:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//* 145  274:astore_1        
		{
			ded.d("KeyManager", new Object[] {
				"wt --------getWorkKeyByBackupCP------get work key iv is:", s1, ";key is:", obj
			});
	//  146  275:ldc1            #55  <String "KeyManager">
	//  147  277:iconst_4        
	//  148  278:anewarray       Object[]
	//  149  281:dup             
	//  150  282:iconst_0        
	//  151  283:ldc2            #480 <String "wt --------getWorkKeyByBackupCP------get work key iv is:">
	//  152  286:aastore         
	//  153  287:dup             
	//  154  288:iconst_1        
	//  155  289:aload_3         
	//  156  290:aastore         
	//  157  291:dup             
	//  158  292:iconst_2        
	//  159  293:ldc2            #471 <String ";key is:">
	//  160  296:aastore         
	//  161  297:dup             
	//  162  298:iconst_3        
	//  163  299:aload           5
	//  164  301:aastore         
	//  165  302:invokestatic    #62  <Method void ded.d(String, Object[])>
			return null;
	//  166  305:aconst_null     
	//  167  306:areturn         
		}
		return abyte0;
	}

	private static String e()
	{
		byte abyte0[] = e;
	//    0    0:getstatic       #15  <Field byte[] e>
	//    1    3:astore_0        
		abyte0;
	//    2    4:aload_0         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		String s;
		if(!b || TextUtils.isEmpty(((CharSequence) (a))))
			break MISSING_BLOCK_LABEL_29;
	//    4    6:getstatic       #17  <Field boolean b>
	//    5    9:ifeq            29
	//    6   12:getstatic       #269 <Field String a>
	//    7   15:invokestatic    #460 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    8   18:ifne            29
		s = a;
	//    9   21:getstatic       #269 <Field String a>
	//   10   24:astore_1        
		abyte0;
	//   11   25:aload_0         
		JVM INSTR monitorexit ;
	//   12   26:monitorexit     
		return s;
	//   13   27:aload_1         
	//   14   28:areturn         
		ded.d("KeyManager", new Object[] {
			"getRootKeyByCP"
		});
	//   15   29:ldc1            #55  <String "KeyManager">
	//   16   31:iconst_1        
	//   17   32:anewarray       Object[]
	//   18   35:dup             
	//   19   36:iconst_0        
	//   20   37:ldc2            #482 <String "getRootKeyByCP">
	//   21   40:aastore         
	//   22   41:invokestatic    #62  <Method void ded.d(String, Object[])>
		s = i(1);
	//   23   44:iconst_1        
	//   24   45:invokestatic    #485 <Method String i(int)>
	//   25   48:astore_1        
		ded.d("KeyManager", new Object[] {
			"wt-----getRootKeyByCP tmp_oldC1StringAll:", s
		});
	//   26   49:ldc1            #55  <String "KeyManager">
	//   27   51:iconst_2        
	//   28   52:anewarray       Object[]
	//   29   55:dup             
	//   30   56:iconst_0        
	//   31   57:ldc2            #487 <String "wt-----getRootKeyByCP tmp_oldC1StringAll:">
	//   32   60:aastore         
	//   33   61:dup             
	//   34   62:iconst_1        
	//   35   63:aload_1         
	//   36   64:aastore         
	//   37   65:invokestatic    #62  <Method void ded.d(String, Object[])>
		s = s.substring(2, s.length());
	//   38   68:aload_1         
	//   39   69:iconst_2        
	//   40   70:aload_1         
	//   41   71:invokevirtual   #463 <Method int String.length()>
	//   42   74:invokevirtual   #309 <Method String String.substring(int, int)>
	//   43   77:astore_1        
		ded.d("KeyManager", new Object[] {
			"wt-----getRootKeyByCP tmp_oldC1String:", s
		});
	//   44   78:ldc1            #55  <String "KeyManager">
	//   45   80:iconst_2        
	//   46   81:anewarray       Object[]
	//   47   84:dup             
	//   48   85:iconst_0        
	//   49   86:ldc2            #489 <String "wt-----getRootKeyByCP tmp_oldC1String:">
	//   50   89:aastore         
	//   51   90:dup             
	//   52   91:iconst_1        
	//   53   92:aload_1         
	//   54   93:aastore         
	//   55   94:invokestatic    #62  <Method void ded.d(String, Object[])>
		String s1 = i(2);
	//   56   97:iconst_2        
	//   57   98:invokestatic    #485 <Method String i(int)>
	//   58  101:astore_2        
		ded.d("KeyManager", new Object[] {
			"wt-----getRootKeyByCP tmp_oldC2String:", s1
		});
	//   59  102:ldc1            #55  <String "KeyManager">
	//   60  104:iconst_2        
	//   61  105:anewarray       Object[]
	//   62  108:dup             
	//   63  109:iconst_0        
	//   64  110:ldc2            #491 <String "wt-----getRootKeyByCP tmp_oldC2String:">
	//   65  113:aastore         
	//   66  114:dup             
	//   67  115:iconst_1        
	//   68  116:aload_2         
	//   69  117:aastore         
	//   70  118:invokestatic    #62  <Method void ded.d(String, Object[])>
		String s2 = i(3);
	//   71  121:iconst_3        
	//   72  122:invokestatic    #485 <Method String i(int)>
	//   73  125:astore_3        
		ded.d("KeyManager", new Object[] {
			"wt-----getRootKeyByCP tmp_oldC3String:", s2
		});
	//   74  126:ldc1            #55  <String "KeyManager">
	//   75  128:iconst_2        
	//   76  129:anewarray       Object[]
	//   77  132:dup             
	//   78  133:iconst_0        
	//   79  134:ldc2            #493 <String "wt-----getRootKeyByCP tmp_oldC3String:">
	//   80  137:aastore         
	//   81  138:dup             
	//   82  139:iconst_1        
	//   83  140:aload_3         
	//   84  141:aastore         
	//   85  142:invokestatic    #62  <Method void ded.d(String, Object[])>
		s = a(s, s1, s2);
	//   86  145:aload_1         
	//   87  146:aload_2         
	//   88  147:aload_3         
	//   89  148:invokestatic    #495 <Method String a(String, String, String)>
	//   90  151:astore_1        
		if(b)
	//*  91  152:getstatic       #17  <Field boolean b>
	//*  92  155:ifeq            162
			a = s;
	//   93  158:aload_1         
	//   94  159:putstatic       #269 <Field String a>
		abyte0;
	//   95  162:aload_0         
		JVM INSTR monitorexit ;
	//   96  163:monitorexit     
		return s;
	//   97  164:aload_1         
	//   98  165:areturn         
		Exception exception;
		exception;
	//   99  166:astore_1        
	//* 100  167:aload_0         
		throw exception;
	//  101  168:monitorexit     
	//  102  169:aload_1         
	//  103  170:athrow          
	}

	static String e(int j)
	{
		return e();
	//    0    0:invokestatic    #497 <Method String e()>
	//    1    3:areturn         
	}

	private static String e(String s)
	{
		Cursor cursor = BaseApplication.a().getContentResolver().query(Uri.parse((new StringBuilder()).append(c).append("backupCp").toString()), ((String []) (null)), "backupKey like ?", new String[] {
			s
		}, ((String) (null)));
	//    0    0:invokestatic    #67  <Method Context BaseApplication.a()>
	//    1    3:invokevirtual   #73  <Method ContentResolver Context.getContentResolver()>
	//    2    6:new             #19  <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #22  <Method void StringBuilder()>
	//    5   13:getstatic       #48  <Field String c>
	//    6   16:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//    7   19:ldc1            #186 <String "backupCp">
	//    8   21:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//    9   24:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   10   27:invokestatic    #92  <Method Uri Uri.parse(String)>
	//   11   30:aconst_null     
	//   12   31:ldc1            #94  <String "backupKey like ?">
	//   13   33:iconst_1        
	//   14   34:anewarray       String[]
	//   15   37:dup             
	//   16   38:iconst_0        
	//   17   39:aload_0         
	//   18   40:aastore         
	//   19   41:aconst_null     
	//   20   42:invokevirtual   #105 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   21   45:astore_3        
		String s1 = "";
	//   22   46:ldc1            #64  <String "">
	//   23   48:astore_1        
		String s2 = s1;
	//   24   49:aload_1         
	//   25   50:astore_2        
		if(cursor != null)
	//*  26   51:aload_3         
	//*  27   52:ifnull          87
		{
			if(cursor.moveToNext())
	//*  28   55:aload_3         
	//*  29   56:invokeinterface #113 <Method boolean Cursor.moveToNext()>
	//*  30   61:ifeq            79
				s1 = cursor.getString(cursor.getColumnIndex("backupValue"));
	//   31   64:aload_3         
	//   32   65:aload_3         
	//   33   66:ldc1            #115 <String "backupValue">
	//   34   68:invokeinterface #119 <Method int Cursor.getColumnIndex(String)>
	//   35   73:invokeinterface #122 <Method String Cursor.getString(int)>
	//   36   78:astore_1        
			cursor.close();
	//   37   79:aload_3         
	//   38   80:invokeinterface #125 <Method void Cursor.close()>
			s2 = s1;
	//   39   85:aload_1         
	//   40   86:astore_2        
		}
		ded.d("KeyManager", new Object[] {
			"getBackupCPData, key:", s, ";value is:", s2
		});
	//   41   87:ldc1            #55  <String "KeyManager">
	//   42   89:iconst_4        
	//   43   90:anewarray       Object[]
	//   44   93:dup             
	//   45   94:iconst_0        
	//   46   95:ldc2            #499 <String "getBackupCPData, key:">
	//   47   98:aastore         
	//   48   99:dup             
	//   49  100:iconst_1        
	//   50  101:aload_0         
	//   51  102:aastore         
	//   52  103:dup             
	//   53  104:iconst_2        
	//   54  105:ldc1            #139 <String ";value is:">
	//   55  107:aastore         
	//   56  108:dup             
	//   57  109:iconst_3        
	//   58  110:aload_2         
	//   59  111:aastore         
	//   60  112:invokestatic    #62  <Method void ded.d(String, Object[])>
		return s2;
	//   61  115:aload_2         
	//   62  116:areturn         
	}

	private static void e(String s, String s1)
	{
		byte abyte0[] = e;
	//    0    0:getstatic       #15  <Field byte[] e>
	//    1    3:astore_2        
		abyte0;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		ContentValues contentvalues;
		ded.d("KeyManager", new Object[] {
			"backUpSecretKey:", s
		});
	//    4    6:ldc1            #55  <String "KeyManager">
	//    5    8:iconst_2        
	//    6    9:anewarray       Object[]
	//    7   12:dup             
	//    8   13:iconst_0        
	//    9   14:ldc2            #501 <String "backUpSecretKey:">
	//   10   17:aastore         
	//   11   18:dup             
	//   12   19:iconst_1        
	//   13   20:aload_0         
	//   14   21:aastore         
	//   15   22:invokestatic    #62  <Method void ded.d(String, Object[])>
		dck.a(BaseApplication.a(), String.valueOf(1009), "backup_table", 2, "backupKey  varchar primary key ,backupValue varchar");
	//   16   25:invokestatic    #67  <Method Context BaseApplication.a()>
	//   17   28:sipush          1009
	//   18   31:invokestatic    #99  <Method String String.valueOf(int)>
	//   19   34:ldc1            #86  <String "backup_table">
	//   20   36:iconst_2        
	//   21   37:ldc1            #160 <String "backupKey  varchar primary key ,backupValue varchar">
	//   22   39:invokestatic    #349 <Method int dck.a(Context, String, String, int, String)>
	//   23   42:pop             
		contentvalues = new ContentValues();
	//   24   43:new             #175 <Class ContentValues>
	//   25   46:dup             
	//   26   47:invokespecial   #176 <Method void ContentValues()>
	//   27   50:astore_3        
		contentvalues.put("backupKey", s);
	//   28   51:aload_3         
	//   29   52:ldc1            #178 <String "backupKey">
	//   30   54:aload_0         
	//   31   55:invokevirtual   #181 <Method void ContentValues.put(String, String)>
		contentvalues.put("backupValue", s1);
	//   32   58:aload_3         
	//   33   59:ldc1            #115 <String "backupValue">
	//   34   61:aload_1         
	//   35   62:invokevirtual   #181 <Method void ContentValues.put(String, String)>
		if(b(s))
	//*  36   65:aload_0         
	//*  37   66:invokestatic    #351 <Method boolean b(String)>
	//*  38   69:ifeq            75
			break MISSING_BLOCK_LABEL_92;
	//   39   72:goto            92
		dck.a(BaseApplication.a(), String.valueOf(1009), "backup_table", 2, contentvalues);
	//   40   75:invokestatic    #67  <Method Context BaseApplication.a()>
	//   41   78:sipush          1009
	//   42   81:invokestatic    #99  <Method String String.valueOf(int)>
	//   43   84:ldc1            #86  <String "backup_table">
	//   44   86:iconst_2        
	//   45   87:aload_3         
	//   46   88:invokestatic    #504 <Method long dck.a(Context, String, String, int, ContentValues)>
	//   47   91:pop2            
		a(s, s1);
	//   48   92:aload_0         
	//   49   93:aload_1         
	//   50   94:invokestatic    #506 <Method void a(String, String)>
		abyte0;
	//   51   97:aload_2         
		JVM INSTR monitorexit ;
	//   52   98:monitorexit     
		return;
	//   53   99:return          
		s;
	//   54  100:astore_0        
	//*  55  101:aload_2         
		throw s;
	//   56  102:monitorexit     
	//   57  103:aload_0         
	//   58  104:athrow          
	}

	private static void f()
	{
		byte abyte0[] = e;
	//    0    0:getstatic       #15  <Field byte[] e>
	//    1    3:astore_2        
		abyte0;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		String s1;
		String s2;
		e e1;
		s2 = (new SimpleDateFormat("MM")).format(new Date(System.currentTimeMillis()));
	//    4    6:new             #508 <Class SimpleDateFormat>
	//    5    9:dup             
	//    6   10:ldc2            #510 <String "MM">
	//    7   13:invokespecial   #511 <Method void SimpleDateFormat(String)>
	//    8   16:new             #513 <Class Date>
	//    9   19:dup             
	//   10   20:invokestatic    #519 <Method long System.currentTimeMillis()>
	//   11   23:invokespecial   #522 <Method void Date(long)>
	//   12   26:invokevirtual   #526 <Method String SimpleDateFormat.format(Date)>
	//   13   29:astore_3        
		s1 = d("key_1");
	//   14   30:ldc2            #332 <String "key_1">
	//   15   33:invokestatic    #528 <Method String d(String)>
	//   16   36:astore_1        
		e1 = com.huawei.whitebox.e.b();
	//   17   37:invokestatic    #533 <Method e e.b()>
	//   18   40:astore          4
		String s = s1;
	//   19   42:aload_1         
	//   20   43:astore_0        
		if("".equals(((Object) (s1))))
	//*  21   44:ldc1            #64  <String "">
	//*  22   46:aload_1         
	//*  23   47:invokevirtual   #328 <Method boolean String.equals(Object)>
	//*  24   50:ifeq            82
		{
			c();
	//   25   53:invokestatic    #535 <Method void c()>
			s = d("key_1");
	//   26   56:ldc2            #332 <String "key_1">
	//   27   59:invokestatic    #528 <Method String d(String)>
	//   28   62:astore_0        
			ded.d("KeyManager", new Object[] {
				"zzzz ========-retry c1=====", s
			});
	//   29   63:ldc1            #55  <String "KeyManager">
	//   30   65:iconst_2        
	//   31   66:anewarray       Object[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:ldc2            #537 <String "zzzz ========-retry c1=====">
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:aload_0         
	//   39   78:aastore         
	//   40   79:invokestatic    #62  <Method void ded.d(String, Object[])>
		}
		if("".equals(((Object) (s))))
	//*  41   82:ldc1            #64  <String "">
	//*  42   84:aload_0         
	//*  43   85:invokevirtual   #328 <Method boolean String.equals(Object)>
	//*  44   88:ifeq            133
		{
			s = deg.a(i());
	//   45   91:invokestatic    #539 <Method byte[] i()>
	//   46   94:invokestatic    #196 <Method String deg.a(byte[])>
	//   47   97:astore_0        
			e("key_1", deg.a(e1.b((new StringBuilder()).append(s2).append(s).toString())));
	//   48   98:ldc2            #332 <String "key_1">
	//   49  101:aload           4
	//   50  103:new             #19  <Class StringBuilder>
	//   51  106:dup             
	//   52  107:invokespecial   #22  <Method void StringBuilder()>
	//   53  110:aload_3         
	//   54  111:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   55  114:aload_0         
	//   56  115:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   57  118:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   58  121:invokevirtual   #541 <Method byte[] e.b(String)>
	//   59  124:invokestatic    #196 <Method String deg.a(byte[])>
	//   60  127:invokestatic    #202 <Method void e(String, String)>
			break MISSING_BLOCK_LABEL_179;
	//   61  130:goto            179
		}
		a("key_1", s);
	//   62  133:ldc2            #332 <String "key_1">
	//   63  136:aload_0         
	//   64  137:invokestatic    #506 <Method void a(String, String)>
		break MISSING_BLOCK_LABEL_179;
	//   65  140:goto            179
		Object obj;
		obj;
	//   66  143:astore_0        
		ded.d("KeyManager", new Object[] {
			(new StringBuilder()).append("initC1ByCP exception = ").append(((Exception) (obj)).getMessage()).toString()
		});
	//   67  144:ldc1            #55  <String "KeyManager">
	//   68  146:iconst_1        
	//   69  147:anewarray       Object[]
	//   70  150:dup             
	//   71  151:iconst_0        
	//   72  152:new             #19  <Class StringBuilder>
	//   73  155:dup             
	//   74  156:invokespecial   #22  <Method void StringBuilder()>
	//   75  159:ldc2            #543 <String "initC1ByCP exception = ">
	//   76  162:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   77  165:aload_0         
	//   78  166:invokevirtual   #409 <Method String Exception.getMessage()>
	//   79  169:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   80  172:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   81  175:aastore         
	//   82  176:invokestatic    #62  <Method void ded.d(String, Object[])>
		abyte0;
	//   83  179:aload_2         
		JVM INSTR monitorexit ;
	//   84  180:monitorexit     
		return;
	//   85  181:return          
		obj;
	//   86  182:astore_0        
	//*  87  183:aload_2         
		throw obj;
	//   88  184:monitorexit     
	//   89  185:aload_0         
	//   90  186:athrow          
	}

	private static byte[] f(int j)
	{
		byte abyte2[] = e;
	//    0    0:getstatic       #15  <Field byte[] e>
	//    1    3:astore          5
		abyte2;
	//    2    5:aload           5
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		boolean flag;
		String s;
		byte abyte3[];
		ded.d("KeyManager", new Object[] {
			"wt ------getWorkKeyByCP--------get work key begin"
		});
	//    4    8:ldc1            #55  <String "KeyManager">
	//    5   10:iconst_1        
	//    6   11:anewarray       Object[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:ldc2            #545 <String "wt ------getWorkKeyByCP--------get work key begin">
	//   10   19:aastore         
	//   11   20:invokestatic    #62  <Method void ded.d(String, Object[])>
		abyte3 = e().getBytes("UTF-8");
	//   12   23:invokestatic    #497 <Method String e()>
	//   13   26:ldc2            #547 <String "UTF-8">
	//   14   29:invokevirtual   #550 <Method byte[] String.getBytes(String)>
	//   15   32:astore          6
		ded.d("KeyManager", new Object[] {
			"wt ------getRootKeyByCP ok"
		});
	//   16   34:ldc1            #55  <String "KeyManager">
	//   17   36:iconst_1        
	//   18   37:anewarray       Object[]
	//   19   40:dup             
	//   20   41:iconst_0        
	//   21   42:ldc2            #552 <String "wt ------getRootKeyByCP ok">
	//   22   45:aastore         
	//   23   46:invokestatic    #62  <Method void ded.d(String, Object[])>
		s = a(j);
	//   24   49:iload_0         
	//   25   50:invokestatic    #304 <Method String a(int)>
	//   26   53:astore          4
		ded.d("KeyManager", new Object[] {
			"wt -------getWorkKeyByCP-------get work key xxx", s
		});
	//   27   55:ldc1            #55  <String "KeyManager">
	//   28   57:iconst_2        
	//   29   58:anewarray       Object[]
	//   30   61:dup             
	//   31   62:iconst_0        
	//   32   63:ldc2            #554 <String "wt -------getWorkKeyByCP-------get work key xxx">
	//   33   66:aastore         
	//   34   67:dup             
	//   35   68:iconst_1        
	//   36   69:aload           4
	//   37   71:aastore         
	//   38   72:invokestatic    #62  <Method void ded.d(String, Object[])>
		flag = TextUtils.isEmpty(((CharSequence) (s)));
	//   39   75:aload           4
	//   40   77:invokestatic    #460 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   41   80:istore_2        
		Object obj = ((Object) (s));
	//   42   81:aload           4
	//   43   83:astore_3        
		if(!flag) goto _L2; else goto _L1
	//   44   84:iload_2         
	//   45   85:ifeq            174
_L1:
		int l;
		l = 0;
	//   46   88:iconst_0        
	//   47   89:istore_1        
		obj = ((Object) (s));
	//   48   90:aload           4
	//   49   92:astore_3        
_L7:
		if(l > 30) goto _L2; else goto _L3
	//   50   93:iload_1         
	//   51   94:bipush          30
	//   52   96:icmpgt          174
_L3:
		try
		{
			((Object) (e)).wait(300L);
	//   53   99:getstatic       #15  <Field byte[] e>
	//   54  102:ldc2w           #555 <Long 300L>
	//   55  105:invokevirtual   #559 <Method void Object.wait(long)>
			break MISSING_BLOCK_LABEL_127;
	//   56  108:goto            127
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//   57  111:astore_3        
		ded.d("KeyManager", new Object[] {
			"wt ------sleep 1000"
		});
	//   58  112:ldc1            #55  <String "KeyManager">
	//   59  114:iconst_1        
	//   60  115:anewarray       Object[]
	//   61  118:dup             
	//   62  119:iconst_0        
	//   63  120:ldc2            #561 <String "wt ------sleep 1000">
	//   64  123:aastore         
	//   65  124:invokestatic    #62  <Method void ded.d(String, Object[])>
		ded.d("KeyManager", new Object[] {
			"wt ---retry workkey---sleep 1000"
		});
	//   66  127:ldc1            #55  <String "KeyManager">
	//   67  129:iconst_1        
	//   68  130:anewarray       Object[]
	//   69  133:dup             
	//   70  134:iconst_0        
	//   71  135:ldc2            #563 <String "wt ---retry workkey---sleep 1000">
	//   72  138:aastore         
	//   73  139:invokestatic    #62  <Method void ded.d(String, Object[])>
		obj = ((Object) (a(j)));
	//   74  142:iload_0         
	//   75  143:invokestatic    #304 <Method String a(int)>
	//   76  146:astore_3        
		if("".equals(obj)) goto _L5; else goto _L4
	//   77  147:ldc1            #64  <String "">
	//   78  149:aload_3         
	//   79  150:invokevirtual   #328 <Method boolean String.equals(Object)>
	//   80  153:ifne            381
_L4:
		ded.d("KeyManager", new Object[] {
			"zzz ===retry work-sleep==ok "
		});
	//   81  156:ldc1            #55  <String "KeyManager">
	//   82  158:iconst_1        
	//   83  159:anewarray       Object[]
	//   84  162:dup             
	//   85  163:iconst_0        
	//   86  164:ldc2            #565 <String "zzz ===retry work-sleep==ok ">
	//   87  167:aastore         
	//   88  168:invokestatic    #62  <Method void ded.d(String, Object[])>
	//*  89  171:goto            174
_L2:
		if(!TextUtils.isEmpty(((CharSequence) (obj))) && ((String) (obj)).length() >= 24)
			break MISSING_BLOCK_LABEL_217;
	//   90  174:aload_3         
	//   91  175:invokestatic    #460 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   92  178:ifne            190
	//   93  181:aload_3         
	//   94  182:invokevirtual   #463 <Method int String.length()>
	//   95  185:bipush          24
	//   96  187:icmpge          217
		ded.d("KeyManager", new Object[] {
			"wt --get workkey is null"
		});
	//   97  190:ldc1            #55  <String "KeyManager">
	//   98  192:iconst_1        
	//   99  193:anewarray       Object[]
	//  100  196:dup             
	//  101  197:iconst_0        
	//  102  198:ldc2            #567 <String "wt --get workkey is null">
	//  103  201:aastore         
	//  104  202:invokestatic    #62  <Method void ded.d(String, Object[])>
		obj = ((Object) (d(j, abyte3)));
	//  105  205:iload_0         
	//  106  206:aload           6
	//  107  208:invokestatic    #569 <Method byte[] d(int, byte[])>
	//  108  211:astore_3        
		abyte2;
	//  109  212:aload           5
		JVM INSTR monitorexit ;
	//  110  214:monitorexit     
		return ((byte []) (obj));
	//  111  215:aload_3         
	//  112  216:areturn         
		byte abyte0[];
		byte abyte1[];
		ded.d("KeyManager", new Object[] {
			"wt ---getWorkKeyByCP-----------get work key2"
		});
	//  113  217:ldc1            #55  <String "KeyManager">
	//  114  219:iconst_1        
	//  115  220:anewarray       Object[]
	//  116  223:dup             
	//  117  224:iconst_0        
	//  118  225:ldc2            #571 <String "wt ---getWorkKeyByCP-----------get work key2">
	//  119  228:aastore         
	//  120  229:invokestatic    #62  <Method void ded.d(String, Object[])>
		String s1 = ((String) (obj)).substring(0, 24);
	//  121  232:aload_3         
	//  122  233:iconst_0        
	//  123  234:bipush          24
	//  124  236:invokevirtual   #309 <Method String String.substring(int, int)>
	//  125  239:astore          4
		obj = ((Object) (((String) (obj)).substring(24, ((String) (obj)).length())));
	//  126  241:aload_3         
	//  127  242:bipush          24
	//  128  244:aload_3         
	//  129  245:invokevirtual   #463 <Method int String.length()>
	//  130  248:invokevirtual   #309 <Method String String.substring(int, int)>
	//  131  251:astore_3        
		ded.d("KeyManager", new Object[] {
			"wt --------getWorkKeyByCP------get work key2, iv is:", s1, ";key is:", obj
		});
	//  132  252:ldc1            #55  <String "KeyManager">
	//  133  254:iconst_4        
	//  134  255:anewarray       Object[]
	//  135  258:dup             
	//  136  259:iconst_0        
	//  137  260:ldc2            #573 <String "wt --------getWorkKeyByCP------get work key2, iv is:">
	//  138  263:aastore         
	//  139  264:dup             
	//  140  265:iconst_1        
	//  141  266:aload           4
	//  142  268:aastore         
	//  143  269:dup             
	//  144  270:iconst_2        
	//  145  271:ldc2            #471 <String ";key is:">
	//  146  274:aastore         
	//  147  275:dup             
	//  148  276:iconst_3        
	//  149  277:aload_3         
	//  150  278:aastore         
	//  151  279:invokestatic    #62  <Method void ded.d(String, Object[])>
		abyte0 = deg.d(((String) (obj)));
	//  152  282:aload_3         
	//  153  283:invokestatic    #474 <Method byte[] deg.d(String)>
	//  154  286:astore_3        
		abyte1 = deg.d(s1);
	//  155  287:aload           4
	//  156  289:invokestatic    #474 <Method byte[] deg.d(String)>
	//  157  292:astore          4
		try
		{
			abyte0 = a(abyte0, abyte3, abyte1);
	//  158  294:aload_3         
	//  159  295:aload           6
	//  160  297:aload           4
	//  161  299:invokestatic    #476 <Method byte[] a(byte[], byte[], byte[])>
	//  162  302:astore_3        
			break MISSING_BLOCK_LABEL_314;
	//  163  303:goto            314
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[]) { }
	//  164  306:astore_3        
		abyte0 = d(j, abyte3);
	//  165  307:iload_0         
	//  166  308:aload           6
	//  167  310:invokestatic    #569 <Method byte[] d(int, byte[])>
	//  168  313:astore_3        
		if(dbf.D())
	//* 169  314:invokestatic    #576 <Method boolean dbf.D()>
	//* 170  317:ifeq            342
			ded.d("KeyManager", new Object[] {
				"wt-----getWorkKeyByCP-getWorkKey2----finish dec,secret is:", o.czx.e(abyte0)
			});
	//  171  320:ldc1            #55  <String "KeyManager">
	//  172  322:iconst_2        
	//  173  323:anewarray       Object[]
	//  174  326:dup             
	//  175  327:iconst_0        
	//  176  328:ldc2            #578 <String "wt-----getWorkKeyByCP-getWorkKey2----finish dec,secret is:">
	//  177  331:aastore         
	//  178  332:dup             
	//  179  333:iconst_1        
	//  180  334:aload_3         
	//  181  335:invokestatic    #238 <Method String o.czx.e(byte[])>
	//  182  338:aastore         
	//  183  339:invokestatic    #62  <Method void ded.d(String, Object[])>
		abyte2;
	//  184  342:aload           5
		JVM INSTR monitorexit ;
	//  185  344:monitorexit     
		return abyte0;
	//  186  345:aload_3         
	//  187  346:areturn         
		Object obj1;
		obj1;
	//  188  347:astore_3        
		dho.f("KeyManager", new Object[] {
			"getWorkKeyByCP:", ((Exception) (obj1)).getMessage()
		});
	//  189  348:ldc1            #55  <String "KeyManager">
	//  190  350:iconst_2        
	//  191  351:anewarray       Object[]
	//  192  354:dup             
	//  193  355:iconst_0        
	//  194  356:ldc2            #580 <String "getWorkKeyByCP:">
	//  195  359:aastore         
	//  196  360:dup             
	//  197  361:iconst_1        
	//  198  362:aload_3         
	//  199  363:invokevirtual   #409 <Method String Exception.getMessage()>
	//  200  366:aastore         
	//  201  367:invokestatic    #449 <Method void dho.f(String, Object[])>
		abyte2;
	//  202  370:aload           5
		JVM INSTR monitorexit ;
	//  203  372:monitorexit     
		return null;
	//  204  373:aconst_null     
	//  205  374:areturn         
		obj1;
	//  206  375:astore_3        
	//* 207  376:aload           5
		throw obj1;
	//  208  378:monitorexit     
	//  209  379:aload_3         
	//  210  380:athrow          
_L5:
		l++;
	//  211  381:iload_1         
	//  212  382:iconst_1        
	//  213  383:iadd            
	//  214  384:istore_1        
		if(true) goto _L7; else goto _L6
	//  215  385:goto            93
_L6:
	}

	private static void g()
	{
		byte abyte0[] = e;
	//    0    0:getstatic       #15  <Field byte[] e>
	//    1    3:astore_0        
		abyte0;
	//    2    4:aload_0         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		f();
	//    4    6:invokestatic    #582 <Method void f()>
		h();
	//    5    9:invokestatic    #585 <Method void h()>
		m();
	//    6   12:invokestatic    #588 <Method void m()>
		abyte0;
	//    7   15:aload_0         
		JVM INSTR monitorexit ;
	//    8   16:monitorexit     
		return;
	//    9   17:return          
		Exception exception;
		exception;
	//   10   18:astore_1        
	//*  11   19:aload_0         
		throw exception;
	//   12   20:monitorexit     
	//   13   21:aload_1         
	//   14   22:athrow          
	}

	private static void g(int j)
	{
		ded.d("KeyManager", new Object[] {
			"zzzz ====moveWorkKeyToCP=", Integer.valueOf(j)
		});
	//    0    0:ldc1            #55  <String "KeyManager">
	//    1    2:iconst_2        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc2            #590 <String "zzzz ====moveWorkKeyToCP=">
	//    6   11:aastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:iload_0         
	//   10   15:invokestatic    #137 <Method Integer Integer.valueOf(int)>
	//   11   18:aastore         
	//   12   19:invokestatic    #62  <Method void ded.d(String, Object[])>
		String s = BaseApplication.a().getSharedPreferences("encrypt_sharedpreferences_name1", 0).getString(String.valueOf(j), "");
	//   13   22:invokestatic    #67  <Method Context BaseApplication.a()>
	//   14   25:ldc2            #592 <String "encrypt_sharedpreferences_name1">
	//   15   28:iconst_0        
	//   16   29:invokevirtual   #317 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   17   32:iload_0         
	//   18   33:invokestatic    #99  <Method String String.valueOf(int)>
	//   19   36:ldc1            #64  <String "">
	//   20   38:invokeinterface #324 <Method String SharedPreferences.getString(String, String)>
	//   21   43:astore_1        
		ded.d("KeyManager", new Object[] {
			"zzzz ====moveWorkKeyToCP=", s
		});
	//   22   44:ldc1            #55  <String "KeyManager">
	//   23   46:iconst_2        
	//   24   47:anewarray       Object[]
	//   25   50:dup             
	//   26   51:iconst_0        
	//   27   52:ldc2            #590 <String "zzzz ====moveWorkKeyToCP=">
	//   28   55:aastore         
	//   29   56:dup             
	//   30   57:iconst_1        
	//   31   58:aload_1         
	//   32   59:aastore         
	//   33   60:invokestatic    #62  <Method void ded.d(String, Object[])>
		if(!"".equals(((Object) (s))))
	//*  34   63:ldc1            #64  <String "">
	//*  35   65:aload_1         
	//*  36   66:invokevirtual   #328 <Method boolean String.equals(Object)>
	//*  37   69:ifne            95
		{
			ded.d("KeyManager", new Object[] {
				"zzzz ====save to CP======"
			});
	//   38   72:ldc1            #55  <String "KeyManager">
	//   39   74:iconst_1        
	//   40   75:anewarray       Object[]
	//   41   78:dup             
	//   42   79:iconst_0        
	//   43   80:ldc2            #594 <String "zzzz ====save to CP======">
	//   44   83:aastore         
	//   45   84:invokestatic    #62  <Method void ded.d(String, Object[])>
			e(String.valueOf(j), s);
	//   46   87:iload_0         
	//   47   88:invokestatic    #99  <Method String String.valueOf(int)>
	//   48   91:aload_1         
	//   49   92:invokestatic    #202 <Method void e(String, String)>
		}
	//   50   95:return          
	}

	private static String h(int j)
	{
		ded.d("KeyManager", new Object[] {
			"getCxByBackupCP() begin C", Integer.valueOf(j)
		});
	//    0    0:ldc1            #55  <String "KeyManager">
	//    1    2:iconst_2        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc2            #596 <String "getCxByBackupCP() begin C">
	//    6   11:aastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:iload_0         
	//   10   15:invokestatic    #137 <Method Integer Integer.valueOf(int)>
	//   11   18:aastore         
	//   12   19:invokestatic    #62  <Method void ded.d(String, Object[])>
		String s = e((new StringBuilder()).append("key_").append(j).toString());
	//   13   22:new             #19  <Class StringBuilder>
	//   14   25:dup             
	//   15   26:invokespecial   #22  <Method void StringBuilder()>
	//   16   29:ldc2            #598 <String "key_">
	//   17   32:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:iload_0         
	//   19   36:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//   20   39:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   21   42:invokestatic    #600 <Method String e(String)>
	//   22   45:astore_1        
		Object obj = ((Object) (com.huawei.whitebox.e.b()));
	//   23   46:invokestatic    #533 <Method e e.b()>
	//   24   49:astore_2        
		if("".equals(((Object) (s))))
	//*  25   50:ldc1            #64  <String "">
	//*  26   52:aload_1         
	//*  27   53:invokevirtual   #328 <Method boolean String.equals(Object)>
	//*  28   56:ifeq            84
		{
			ded.d("KeyManager", new Object[] {
				"wt -----getCxByBackupCP is null, in C", Integer.valueOf(j)
			});
	//   29   59:ldc1            #55  <String "KeyManager">
	//   30   61:iconst_2        
	//   31   62:anewarray       Object[]
	//   32   65:dup             
	//   33   66:iconst_0        
	//   34   67:ldc2            #602 <String "wt -----getCxByBackupCP is null, in C">
	//   35   70:aastore         
	//   36   71:dup             
	//   37   72:iconst_1        
	//   38   73:iload_0         
	//   39   74:invokestatic    #137 <Method Integer Integer.valueOf(int)>
	//   40   77:aastore         
	//   41   78:invokestatic    #62  <Method void ded.d(String, Object[])>
			return "";
	//   42   81:ldc1            #64  <String "">
	//   43   83:areturn         
		}
		try
		{
			obj = ((Object) (new String(((e) (obj)).b(deg.d(s)), "UTF-8")));
	//   44   84:new             #96  <Class String>
	//   45   87:dup             
	//   46   88:aload_2         
	//   47   89:aload_1         
	//   48   90:invokestatic    #474 <Method byte[] deg.d(String)>
	//   49   93:invokevirtual   #604 <Method byte[] e.b(byte[])>
	//   50   96:ldc2            #547 <String "UTF-8">
	//   51   99:invokespecial   #605 <Method void String(byte[], String)>
	//   52  102:astore_2        
			c((new StringBuilder()).append("key_").append(j).toString(), s);
	//   53  103:new             #19  <Class StringBuilder>
	//   54  106:dup             
	//   55  107:invokespecial   #22  <Method void StringBuilder()>
	//   56  110:ldc2            #598 <String "key_">
	//   57  113:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   58  116:iload_0         
	//   59  117:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//   60  120:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   61  123:aload_1         
	//   62  124:invokestatic    #478 <Method void c(String, String)>
		}
	//*  63  127:aload_2         
	//*  64  128:areturn         
		catch(Exception exception)
	//*  65  129:astore_1        
		{
			dho.f("KeyManager", new Object[] {
				"getCxByBackupCP(),C", Integer.valueOf(j), " Exception:", exception.getMessage()
			});
	//   66  130:ldc1            #55  <String "KeyManager">
	//   67  132:iconst_4        
	//   68  133:anewarray       Object[]
	//   69  136:dup             
	//   70  137:iconst_0        
	//   71  138:ldc2            #607 <String "getCxByBackupCP(),C">
	//   72  141:aastore         
	//   73  142:dup             
	//   74  143:iconst_1        
	//   75  144:iload_0         
	//   76  145:invokestatic    #137 <Method Integer Integer.valueOf(int)>
	//   77  148:aastore         
	//   78  149:dup             
	//   79  150:iconst_2        
	//   80  151:ldc2            #609 <String " Exception:">
	//   81  154:aastore         
	//   82  155:dup             
	//   83  156:iconst_3        
	//   84  157:aload_1         
	//   85  158:invokevirtual   #409 <Method String Exception.getMessage()>
	//   86  161:aastore         
	//   87  162:invokestatic    #449 <Method void dho.f(String, Object[])>
			return "";
	//   88  165:ldc1            #64  <String "">
	//   89  167:areturn         
		}
		return ((String) (obj));
	}

	private static void h()
	{
		byte abyte0[] = e;
	//    0    0:getstatic       #15  <Field byte[] e>
	//    1    3:astore_0        
		abyte0;
	//    2    4:aload_0         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		String s;
		s = d("key_2");
	//    4    6:ldc2            #338 <String "key_2">
	//    5    9:invokestatic    #528 <Method String d(String)>
	//    6   12:astore_1        
		e e1 = com.huawei.whitebox.e.b();
	//    7   13:invokestatic    #533 <Method e e.b()>
	//    8   16:astore_2        
		if("".equals(((Object) (s))))
	//*   9   17:ldc1            #64  <String "">
	//*  10   19:aload_1         
	//*  11   20:invokevirtual   #328 <Method boolean String.equals(Object)>
	//*  12   23:ifeq            48
		{
			e("key_2", deg.a(e1.b(deg.a(i()))));
	//   13   26:ldc2            #338 <String "key_2">
	//   14   29:aload_2         
	//   15   30:invokestatic    #539 <Method byte[] i()>
	//   16   33:invokestatic    #196 <Method String deg.a(byte[])>
	//   17   36:invokevirtual   #541 <Method byte[] e.b(String)>
	//   18   39:invokestatic    #196 <Method String deg.a(byte[])>
	//   19   42:invokestatic    #202 <Method void e(String, String)>
			break MISSING_BLOCK_LABEL_94;
	//   20   45:goto            94
		}
		a("key_2", s);
	//   21   48:ldc2            #338 <String "key_2">
	//   22   51:aload_1         
	//   23   52:invokestatic    #506 <Method void a(String, String)>
		break MISSING_BLOCK_LABEL_94;
	//   24   55:goto            94
		Object obj;
		obj;
	//   25   58:astore_1        
		ded.d("KeyManager", new Object[] {
			(new StringBuilder()).append("initC2ByCP exception = ").append(((Exception) (obj)).getMessage()).toString()
		});
	//   26   59:ldc1            #55  <String "KeyManager">
	//   27   61:iconst_1        
	//   28   62:anewarray       Object[]
	//   29   65:dup             
	//   30   66:iconst_0        
	//   31   67:new             #19  <Class StringBuilder>
	//   32   70:dup             
	//   33   71:invokespecial   #22  <Method void StringBuilder()>
	//   34   74:ldc2            #611 <String "initC2ByCP exception = ">
	//   35   77:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   36   80:aload_1         
	//   37   81:invokevirtual   #409 <Method String Exception.getMessage()>
	//   38   84:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   39   87:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   40   90:aastore         
	//   41   91:invokestatic    #62  <Method void ded.d(String, Object[])>
		abyte0;
	//   42   94:aload_0         
		JVM INSTR monitorexit ;
	//   43   95:monitorexit     
		return;
	//   44   96:return          
		obj;
	//   45   97:astore_1        
	//*  46   98:aload_0         
		throw obj;
	//   47   99:monitorexit     
	//   48  100:aload_1         
	//   49  101:athrow          
	}

	private static String i(int j)
	{
		String s = d((new StringBuilder()).append("key_").append(j).toString());
	//    0    0:new             #19  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void StringBuilder()>
	//    3    7:ldc2            #598 <String "key_">
	//    4   10:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//    5   13:iload_0         
	//    6   14:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//    7   17:invokevirtual   #46  <Method String StringBuilder.toString()>
	//    8   20:invokestatic    #528 <Method String d(String)>
	//    9   23:astore_3        
		e e1 = com.huawei.whitebox.e.b();
	//   10   24:invokestatic    #533 <Method e e.b()>
	//   11   27:astore          4
		Object obj = ((Object) (s));
	//   12   29:aload_3         
	//   13   30:astore_2        
		if("".equals(((Object) (s))))
	//*  14   31:ldc1            #64  <String "">
	//*  15   33:aload_3         
	//*  16   34:invokevirtual   #328 <Method boolean String.equals(Object)>
	//*  17   37:ifeq            165
		{
			int l = 0;
	//   18   40:iconst_0        
	//   19   41:istore_1        
			obj = ((Object) (s));
	//   20   42:aload_3         
	//   21   43:astore_2        
			do
			{
				if(l > 30)
					break;
	//   22   44:iload_1         
	//   23   45:bipush          30
	//   24   47:icmpgt          165
				try
				{
					((Object) (e)).wait(300L);
	//   25   50:getstatic       #15  <Field byte[] e>
	//   26   53:ldc2w           #555 <Long 300L>
	//   27   56:invokevirtual   #559 <Method void Object.wait(long)>
				}
	//*  28   59:goto            78
				// Misplaced declaration of an exception variable
				catch(Object obj)
	//*  29   62:astore_2        
				{
					ded.d("KeyManager", new Object[] {
						"wt ---retry---sleep "
					});
	//   30   63:ldc1            #55  <String "KeyManager">
	//   31   65:iconst_1        
	//   32   66:anewarray       Object[]
	//   33   69:dup             
	//   34   70:iconst_0        
	//   35   71:ldc2            #613 <String "wt ---retry---sleep ">
	//   36   74:aastore         
	//   37   75:invokestatic    #62  <Method void ded.d(String, Object[])>
				}
				ded.d("KeyManager", new Object[] {
					"wt -----retry -sleep for C", Integer.valueOf(j)
				});
	//   38   78:ldc1            #55  <String "KeyManager">
	//   39   80:iconst_2        
	//   40   81:anewarray       Object[]
	//   41   84:dup             
	//   42   85:iconst_0        
	//   43   86:ldc2            #615 <String "wt -----retry -sleep for C">
	//   44   89:aastore         
	//   45   90:dup             
	//   46   91:iconst_1        
	//   47   92:iload_0         
	//   48   93:invokestatic    #137 <Method Integer Integer.valueOf(int)>
	//   49   96:aastore         
	//   50   97:invokestatic    #62  <Method void ded.d(String, Object[])>
				obj = ((Object) (d((new StringBuilder()).append("key_").append(j).toString())));
	//   51  100:new             #19  <Class StringBuilder>
	//   52  103:dup             
	//   53  104:invokespecial   #22  <Method void StringBuilder()>
	//   54  107:ldc2            #598 <String "key_">
	//   55  110:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   56  113:iload_0         
	//   57  114:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//   58  117:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   59  120:invokestatic    #528 <Method String d(String)>
	//   60  123:astore_2        
				if(!"".equals(obj))
	//*  61  124:ldc1            #64  <String "">
	//*  62  126:aload_2         
	//*  63  127:invokevirtual   #328 <Method boolean String.equals(Object)>
	//*  64  130:ifne            158
				{
					ded.d("KeyManager", new Object[] {
						"wt -----retry -sleep ok break for C", Integer.valueOf(j)
					});
	//   65  133:ldc1            #55  <String "KeyManager">
	//   66  135:iconst_2        
	//   67  136:anewarray       Object[]
	//   68  139:dup             
	//   69  140:iconst_0        
	//   70  141:ldc2            #617 <String "wt -----retry -sleep ok break for C">
	//   71  144:aastore         
	//   72  145:dup             
	//   73  146:iconst_1        
	//   74  147:iload_0         
	//   75  148:invokestatic    #137 <Method Integer Integer.valueOf(int)>
	//   76  151:aastore         
	//   77  152:invokestatic    #62  <Method void ded.d(String, Object[])>
					break;
	//   78  155:goto            165
				}
				l++;
	//   79  158:iload_1         
	//   80  159:iconst_1        
	//   81  160:iadd            
	//   82  161:istore_1        
			} while(true);
	//   83  162:goto            44
		}
		if("".equals(obj))
	//*  84  165:ldc1            #64  <String "">
	//*  85  167:aload_2         
	//*  86  168:invokevirtual   #328 <Method boolean String.equals(Object)>
	//*  87  171:ifeq            201
		{
			ded.d("KeyManager", new Object[] {
				"wt -----get-alwalys is null for C", Integer.valueOf(j)
			});
	//   88  174:ldc1            #55  <String "KeyManager">
	//   89  176:iconst_2        
	//   90  177:anewarray       Object[]
	//   91  180:dup             
	//   92  181:iconst_0        
	//   93  182:ldc2            #619 <String "wt -----get-alwalys is null for C">
	//   94  185:aastore         
	//   95  186:dup             
	//   96  187:iconst_1        
	//   97  188:iload_0         
	//   98  189:invokestatic    #137 <Method Integer Integer.valueOf(int)>
	//   99  192:aastore         
	//  100  193:invokestatic    #62  <Method void ded.d(String, Object[])>
			return h(j);
	//  101  196:iload_0         
	//  102  197:invokestatic    #621 <Method String h(int)>
	//  103  200:areturn         
		}
		try
		{
			s = new String(e1.b(deg.d(((String) (obj)))), "UTF-8");
	//  104  201:new             #96  <Class String>
	//  105  204:dup             
	//  106  205:aload           4
	//  107  207:aload_2         
	//  108  208:invokestatic    #474 <Method byte[] deg.d(String)>
	//  109  211:invokevirtual   #604 <Method byte[] e.b(byte[])>
	//  110  214:ldc2            #547 <String "UTF-8">
	//  111  217:invokespecial   #605 <Method void String(byte[], String)>
	//  112  220:astore_3        
		}
	//* 113  221:aload_3         
	//* 114  222:astore_2        
	//* 115  223:aload_3         
	//* 116  224:invokestatic    #460 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 117  227:ifeq            257
	//* 118  230:ldc1            #55  <String "KeyManager">
	//* 119  232:iconst_2        
	//* 120  233:anewarray       Object[]
	//* 121  236:dup             
	//* 122  237:iconst_0        
	//* 123  238:ldc2            #623 <String "getError for C">
	//* 124  241:aastore         
	//* 125  242:dup             
	//* 126  243:iconst_1        
	//* 127  244:iload_0         
	//* 128  245:invokestatic    #137 <Method Integer Integer.valueOf(int)>
	//* 129  248:aastore         
	//* 130  249:invokestatic    #449 <Method void dho.f(String, Object[])>
	//* 131  252:iload_0         
	//* 132  253:invokestatic    #621 <Method String h(int)>
	//* 133  256:astore_2        
	//* 134  257:aload_2         
	//* 135  258:areturn         
		catch(Exception exception)
	//* 136  259:astore_2        
		{
			dho.f("KeyManager", new Object[] {
				"getKeyByString() Exception:", exception.getMessage()
			});
	//  137  260:ldc1            #55  <String "KeyManager">
	//  138  262:iconst_2        
	//  139  263:anewarray       Object[]
	//  140  266:dup             
	//  141  267:iconst_0        
	//  142  268:ldc2            #625 <String "getKeyByString() Exception:">
	//  143  271:aastore         
	//  144  272:dup             
	//  145  273:iconst_1        
	//  146  274:aload_2         
	//  147  275:invokevirtual   #409 <Method String Exception.getMessage()>
	//  148  278:aastore         
	//  149  279:invokestatic    #449 <Method void dho.f(String, Object[])>
			return h(j);
	//  150  282:iload_0         
	//  151  283:invokestatic    #621 <Method String h(int)>
	//  152  286:areturn         
		}
		obj = ((Object) (s));
		if(TextUtils.isEmpty(((CharSequence) (s))))
		{
			dho.f("KeyManager", new Object[] {
				"getError for C", Integer.valueOf(j)
			});
			obj = ((Object) (h(j)));
		}
		return ((String) (obj));
	}

	private static byte[] i()
	{
		byte abyte0[];
		try
		{
			SecureRandom securerandom = new SecureRandom();
	//    0    0:new             #209 <Class SecureRandom>
	//    1    3:dup             
	//    2    4:invokespecial   #210 <Method void SecureRandom()>
	//    3    7:astore_0        
			KeyGenerator keygenerator = KeyGenerator.getInstance("AES");
	//    4    8:ldc1            #212 <String "AES">
	//    5   10:invokestatic    #218 <Method KeyGenerator KeyGenerator.getInstance(String)>
	//    6   13:astore_1        
			keygenerator.init(192, securerandom);
	//    7   14:aload_1         
	//    8   15:sipush          192
	//    9   18:aload_0         
	//   10   19:invokevirtual   #222 <Method void KeyGenerator.init(int, SecureRandom)>
			abyte0 = keygenerator.generateKey().getEncoded();
	//   11   22:aload_1         
	//   12   23:invokevirtual   #226 <Method SecretKey KeyGenerator.generateKey()>
	//   13   26:invokeinterface #231 <Method byte[] SecretKey.getEncoded()>
	//   14   31:astore_0        
		}
	//*  15   32:aload_0         
	//*  16   33:areturn         
		catch(RuntimeException runtimeexception)
	//*  17   34:astore_0        
		{
			return new byte[0];
	//   18   35:iconst_0        
	//   19   36:newarray        byte[]
	//   20   38:areturn         
		}
		catch(Exception exception)
	//*  21   39:astore_0        
		{
			return new byte[0];
	//   22   40:iconst_0        
	//   23   41:newarray        byte[]
	//   24   43:areturn         
		}
		return abyte0;
	}

	private static void k(int j)
	{
		byte abyte1[] = e;
	//    0    0:getstatic       #15  <Field byte[] e>
	//    1    3:astore          4
		abyte1;
	//    2    5:aload           4
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		int l = Process.myPid();
	//    4    8:invokestatic    #288 <Method int Process.myPid()>
	//    5   11:istore_1        
		ded.d("KeyManager", new Object[] {
			"initSecurityKey---dataType:", Integer.valueOf(j), ";process id:", Integer.valueOf(l), ";process name:", o.dbf.e(l), ";main process:", BaseApplication.d().c()
		});
	//    6   12:ldc1            #55  <String "KeyManager">
	//    7   14:bipush          8
	//    8   16:anewarray       Object[]
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:ldc2            #627 <String "initSecurityKey---dataType:">
	//   12   24:aastore         
	//   13   25:dup             
	//   14   26:iconst_1        
	//   15   27:iload_0         
	//   16   28:invokestatic    #137 <Method Integer Integer.valueOf(int)>
	//   17   31:aastore         
	//   18   32:dup             
	//   19   33:iconst_2        
	//   20   34:ldc2            #292 <String ";process id:">
	//   21   37:aastore         
	//   22   38:dup             
	//   23   39:iconst_3        
	//   24   40:iload_1         
	//   25   41:invokestatic    #137 <Method Integer Integer.valueOf(int)>
	//   26   44:aastore         
	//   27   45:dup             
	//   28   46:iconst_4        
	//   29   47:ldc2            #294 <String ";process name:">
	//   30   50:aastore         
	//   31   51:dup             
	//   32   52:iconst_5        
	//   33   53:iload_1         
	//   34   54:invokestatic    #298 <Method String o.dbf.e(int)>
	//   35   57:aastore         
	//   36   58:dup             
	//   37   59:bipush          6
	//   38   61:ldc2            #300 <String ";main process:">
	//   39   64:aastore         
	//   40   65:dup             
	//   41   66:bipush          7
	//   42   68:invokestatic    #34  <Method com.huawei.hwcommonmodel.application.BaseApplication$e BaseApplication.d()>
	//   43   71:invokevirtual   #39  <Method String com.huawei.hwcommonmodel.application.BaseApplication$e.c()>
	//   44   74:aastore         
	//   45   75:invokestatic    #62  <Method void ded.d(String, Object[])>
		String s1;
		ded.d("KeyManager", new Object[] {
			"wt ------initSecurityKey ok"
		});
	//   46   78:ldc1            #55  <String "KeyManager">
	//   47   80:iconst_1        
	//   48   81:anewarray       Object[]
	//   49   84:dup             
	//   50   85:iconst_0        
	//   51   86:ldc2            #629 <String "wt ------initSecurityKey ok">
	//   52   89:aastore         
	//   53   90:invokestatic    #62  <Method void ded.d(String, Object[])>
		s1 = a(j);
	//   54   93:iload_0         
	//   55   94:invokestatic    #304 <Method String a(int)>
	//   56   97:astore_3        
		ded.d("KeyManager", new Object[] {
			"wt -------initSecurityKey-------get work key xxx", s1
		});
	//   57   98:ldc1            #55  <String "KeyManager">
	//   58  100:iconst_2        
	//   59  101:anewarray       Object[]
	//   60  104:dup             
	//   61  105:iconst_0        
	//   62  106:ldc2            #631 <String "wt -------initSecurityKey-------get work key xxx">
	//   63  109:aastore         
	//   64  110:dup             
	//   65  111:iconst_1        
	//   66  112:aload_3         
	//   67  113:aastore         
	//   68  114:invokestatic    #62  <Method void ded.d(String, Object[])>
		String s = s1;
	//   69  117:aload_3         
	//   70  118:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*  71  119:aload_3         
	//*  72  120:invokestatic    #460 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  73  123:ifeq            154
		{
			g(j);
	//   74  126:iload_0         
	//   75  127:invokestatic    #633 <Method void g(int)>
			s = a(j);
	//   76  130:iload_0         
	//   77  131:invokestatic    #304 <Method String a(int)>
	//   78  134:astore_2        
			ded.d("KeyManager", new Object[] {
				"zzzz ====initSecurityKey retry workkey=", s
			});
	//   79  135:ldc1            #55  <String "KeyManager">
	//   80  137:iconst_2        
	//   81  138:anewarray       Object[]
	//   82  141:dup             
	//   83  142:iconst_0        
	//   84  143:ldc2            #635 <String "zzzz ====initSecurityKey retry workkey=">
	//   85  146:aastore         
	//   86  147:dup             
	//   87  148:iconst_1        
	//   88  149:aload_2         
	//   89  150:aastore         
	//   90  151:invokestatic    #62  <Method void ded.d(String, Object[])>
		}
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  91  154:aload_2         
	//*  92  155:invokestatic    #460 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  93  158:ifeq            370
		{
			s = ((String) (a()));
	//   94  161:invokestatic    #637 <Method byte[] a()>
	//   95  164:astore_2        
			ded.d("KeyManager", new Object[] {
				"wt -------initSecurityKey-------get work key secret_info is null"
			});
	//   96  165:ldc1            #55  <String "KeyManager">
	//   97  167:iconst_1        
	//   98  168:anewarray       Object[]
	//   99  171:dup             
	//  100  172:iconst_0        
	//  101  173:ldc2            #639 <String "wt -------initSecurityKey-------get work key secret_info is null">
	//  102  176:aastore         
	//  103  177:invokestatic    #62  <Method void ded.d(String, Object[])>
			byte abyte0[] = k();
	//  104  180:invokestatic    #641 <Method byte[] k()>
	//  105  183:astore_3        
			byte abyte2[] = k();
	//  106  184:invokestatic    #641 <Method byte[] k()>
	//  107  187:astore          5
			byte abyte3[] = k();
	//  108  189:invokestatic    #641 <Method byte[] k()>
	//  109  192:astore          6
			ded.d("KeyManager", new Object[] {
				"wt -------initSecurityKey-------get work key null getkey"
			});
	//  110  194:ldc1            #55  <String "KeyManager">
	//  111  196:iconst_1        
	//  112  197:anewarray       Object[]
	//  113  200:dup             
	//  114  201:iconst_0        
	//  115  202:ldc2            #643 <String "wt -------initSecurityKey-------get work key null getkey">
	//  116  205:aastore         
	//  117  206:invokestatic    #62  <Method void ded.d(String, Object[])>
			abyte0 = c(abyte0, abyte2, abyte3).getBytes("UTF-8");
	//  118  209:aload_3         
	//  119  210:aload           5
	//  120  212:aload           6
	//  121  214:invokestatic    #645 <Method String c(byte[], byte[], byte[])>
	//  122  217:ldc2            #547 <String "UTF-8">
	//  123  220:invokevirtual   #550 <Method byte[] String.getBytes(String)>
	//  124  223:astore_3        
			if(dbf.D())
	//* 125  224:invokestatic    #576 <Method boolean dbf.D()>
	//* 126  227:ifeq            265
				ded.d("KeyManager", new Object[] {
					(new StringBuilder()).append("wt -------initSecurityKey-------get work key secret is ").append(o.czx.e(abyte0)).toString()
				});
	//  127  230:ldc1            #55  <String "KeyManager">
	//  128  232:iconst_1        
	//  129  233:anewarray       Object[]
	//  130  236:dup             
	//  131  237:iconst_0        
	//  132  238:new             #19  <Class StringBuilder>
	//  133  241:dup             
	//  134  242:invokespecial   #22  <Method void StringBuilder()>
	//  135  245:ldc2            #647 <String "wt -------initSecurityKey-------get work key secret is ">
	//  136  248:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  137  251:aload_3         
	//  138  252:invokestatic    #238 <Method String o.czx.e(byte[])>
	//  139  255:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  140  258:invokevirtual   #46  <Method String StringBuilder.toString()>
	//  141  261:aastore         
	//  142  262:invokestatic    #62  <Method void ded.d(String, Object[])>
			abyte0 = b(abyte0, e().getBytes("UTF-8"), ((byte []) (s)));
	//  143  265:aload_3         
	//  144  266:invokestatic    #497 <Method String e()>
	//  145  269:ldc2            #547 <String "UTF-8">
	//  146  272:invokevirtual   #550 <Method byte[] String.getBytes(String)>
	//  147  275:aload_2         
	//  148  276:invokestatic    #649 <Method byte[] b(byte[], byte[], byte[])>
	//  149  279:astore_3        
			if(dbf.D())
	//* 150  280:invokestatic    #576 <Method boolean dbf.D()>
	//* 151  283:ifeq            321
				ded.d("KeyManager", new Object[] {
					(new StringBuilder()).append("wt -------initSecurityKey-------get work key work enc key:").append(o.czx.e(abyte0)).toString()
				});
	//  152  286:ldc1            #55  <String "KeyManager">
	//  153  288:iconst_1        
	//  154  289:anewarray       Object[]
	//  155  292:dup             
	//  156  293:iconst_0        
	//  157  294:new             #19  <Class StringBuilder>
	//  158  297:dup             
	//  159  298:invokespecial   #22  <Method void StringBuilder()>
	//  160  301:ldc2            #651 <String "wt -------initSecurityKey-------get work key work enc key:">
	//  161  304:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  162  307:aload_3         
	//  163  308:invokestatic    #238 <Method String o.czx.e(byte[])>
	//  164  311:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  165  314:invokevirtual   #46  <Method String StringBuilder.toString()>
	//  166  317:aastore         
	//  167  318:invokestatic    #62  <Method void ded.d(String, Object[])>
			ded.d("KeyManager", new Object[] {
				"----initSecurityKey---------clearSharedPreferences1, ok: dataType:", Integer.valueOf(j)
			});
	//  168  321:ldc1            #55  <String "KeyManager">
	//  169  323:iconst_2        
	//  170  324:anewarray       Object[]
	//  171  327:dup             
	//  172  328:iconst_0        
	//  173  329:ldc2            #653 <String "----initSecurityKey---------clearSharedPreferences1, ok: dataType:">
	//  174  332:aastore         
	//  175  333:dup             
	//  176  334:iconst_1        
	//  177  335:iload_0         
	//  178  336:invokestatic    #137 <Method Integer Integer.valueOf(int)>
	//  179  339:aastore         
	//  180  340:invokestatic    #62  <Method void ded.d(String, Object[])>
			a(String.valueOf(j), abyte0, ((byte []) (s)));
	//  181  343:iload_0         
	//  182  344:invokestatic    #99  <Method String String.valueOf(int)>
	//  183  347:aload_3         
	//  184  348:aload_2         
	//  185  349:invokestatic    #655 <Method void a(String, byte[], byte[])>
			ded.d("KeyManager", new Object[] {
				"wt ---initSecurityKey-----------completed"
			});
	//  186  352:ldc1            #55  <String "KeyManager">
	//  187  354:iconst_1        
	//  188  355:anewarray       Object[]
	//  189  358:dup             
	//  190  359:iconst_0        
	//  191  360:ldc2            #657 <String "wt ---initSecurityKey-----------completed">
	//  192  363:aastore         
	//  193  364:invokestatic    #62  <Method void ded.d(String, Object[])>
			break MISSING_BLOCK_LABEL_458;
	//  194  367:goto            432
		}
		a(String.valueOf(j), s);
	//  195  370:iload_0         
	//  196  371:invokestatic    #99  <Method String String.valueOf(int)>
	//  197  374:aload_2         
	//  198  375:invokestatic    #506 <Method void a(String, String)>
		break MISSING_BLOCK_LABEL_417;
	//  199  378:goto            417
		Object obj;
		obj;
	//  200  381:astore_2        
		ded.d("KeyManager", new Object[] {
			(new StringBuilder()).append("getWorkKeyByBackupCP exception = ").append(((Exception) (obj)).getMessage()).toString()
		});
	//  201  382:ldc1            #55  <String "KeyManager">
	//  202  384:iconst_1        
	//  203  385:anewarray       Object[]
	//  204  388:dup             
	//  205  389:iconst_0        
	//  206  390:new             #19  <Class StringBuilder>
	//  207  393:dup             
	//  208  394:invokespecial   #22  <Method void StringBuilder()>
	//  209  397:ldc2            #659 <String "getWorkKeyByBackupCP exception = ">
	//  210  400:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  211  403:aload_2         
	//  212  404:invokevirtual   #409 <Method String Exception.getMessage()>
	//  213  407:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//  214  410:invokevirtual   #46  <Method String StringBuilder.toString()>
	//  215  413:aastore         
	//  216  414:invokestatic    #62  <Method void ded.d(String, Object[])>
		ded.d("KeyManager", new Object[] {
			"wt ---initSecurityKey-----------get work key2"
		});
	//  217  417:ldc1            #55  <String "KeyManager">
	//  218  419:iconst_1        
	//  219  420:anewarray       Object[]
	//  220  423:dup             
	//  221  424:iconst_0        
	//  222  425:ldc2            #661 <String "wt ---initSecurityKey-----------get work key2">
	//  223  428:aastore         
	//  224  429:invokestatic    #62  <Method void ded.d(String, Object[])>
		break MISSING_BLOCK_LABEL_458;
	//  225  432:goto            458
		obj;
	//  226  435:astore_2        
		dho.f("KeyManager", new Object[] {
			"initSecurityKey:", ((Exception) (obj)).getMessage()
		});
	//  227  436:ldc1            #55  <String "KeyManager">
	//  228  438:iconst_2        
	//  229  439:anewarray       Object[]
	//  230  442:dup             
	//  231  443:iconst_0        
	//  232  444:ldc2            #663 <String "initSecurityKey:">
	//  233  447:aastore         
	//  234  448:dup             
	//  235  449:iconst_1        
	//  236  450:aload_2         
	//  237  451:invokevirtual   #409 <Method String Exception.getMessage()>
	//  238  454:aastore         
	//  239  455:invokestatic    #449 <Method void dho.f(String, Object[])>
		abyte1;
	//  240  458:aload           4
		JVM INSTR monitorexit ;
	//  241  460:monitorexit     
		return;
	//  242  461:return          
		obj;
	//  243  462:astore_2        
	//* 244  463:aload           4
		throw obj;
	//  245  465:monitorexit     
	//  246  466:aload_2         
	//  247  467:athrow          
	}

	private static byte[] k()
	{
		byte abyte0[];
		try
		{
			SecureRandom securerandom = new SecureRandom();
	//    0    0:new             #209 <Class SecureRandom>
	//    1    3:dup             
	//    2    4:invokespecial   #210 <Method void SecureRandom()>
	//    3    7:astore_0        
			KeyGenerator keygenerator = KeyGenerator.getInstance("AES");
	//    4    8:ldc1            #212 <String "AES">
	//    5   10:invokestatic    #218 <Method KeyGenerator KeyGenerator.getInstance(String)>
	//    6   13:astore_1        
			keygenerator.init(256, securerandom);
	//    7   14:aload_1         
	//    8   15:sipush          256
	//    9   18:aload_0         
	//   10   19:invokevirtual   #222 <Method void KeyGenerator.init(int, SecureRandom)>
			abyte0 = keygenerator.generateKey().getEncoded();
	//   11   22:aload_1         
	//   12   23:invokevirtual   #226 <Method SecretKey KeyGenerator.generateKey()>
	//   13   26:invokeinterface #231 <Method byte[] SecretKey.getEncoded()>
	//   14   31:astore_0        
		}
	//*  15   32:aload_0         
	//*  16   33:areturn         
		catch(RuntimeException runtimeexception)
	//*  17   34:astore_0        
		{
			return new byte[0];
	//   18   35:iconst_0        
	//   19   36:newarray        byte[]
	//   20   38:areturn         
		}
		catch(Exception exception)
	//*  21   39:astore_0        
		{
			return new byte[0];
	//   22   40:iconst_0        
	//   23   41:newarray        byte[]
	//   24   43:areturn         
		}
		return abyte0;
	}

	private static void m()
	{
		byte abyte0[] = e;
	//    0    0:getstatic       #15  <Field byte[] e>
	//    1    3:astore_0        
		abyte0;
	//    2    4:aload_0         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		String s;
		s = d("key_3");
	//    4    6:ldc2            #344 <String "key_3">
	//    5    9:invokestatic    #528 <Method String d(String)>
	//    6   12:astore_1        
		e e1 = com.huawei.whitebox.e.b();
	//    7   13:invokestatic    #533 <Method e e.b()>
	//    8   16:astore_2        
		if("".equals(((Object) (s))))
	//*   9   17:ldc1            #64  <String "">
	//*  10   19:aload_1         
	//*  11   20:invokevirtual   #328 <Method boolean String.equals(Object)>
	//*  12   23:ifeq            48
		{
			e("key_3", deg.a(e1.b(deg.a(i()))));
	//   13   26:ldc2            #344 <String "key_3">
	//   14   29:aload_2         
	//   15   30:invokestatic    #539 <Method byte[] i()>
	//   16   33:invokestatic    #196 <Method String deg.a(byte[])>
	//   17   36:invokevirtual   #541 <Method byte[] e.b(String)>
	//   18   39:invokestatic    #196 <Method String deg.a(byte[])>
	//   19   42:invokestatic    #202 <Method void e(String, String)>
			break MISSING_BLOCK_LABEL_94;
	//   20   45:goto            94
		}
		a("key_3", s);
	//   21   48:ldc2            #344 <String "key_3">
	//   22   51:aload_1         
	//   23   52:invokestatic    #506 <Method void a(String, String)>
		break MISSING_BLOCK_LABEL_94;
	//   24   55:goto            94
		Object obj;
		obj;
	//   25   58:astore_1        
		ded.d("KeyManager", new Object[] {
			(new StringBuilder()).append("initC3ByCP exception = ").append(((Exception) (obj)).getMessage()).toString()
		});
	//   26   59:ldc1            #55  <String "KeyManager">
	//   27   61:iconst_1        
	//   28   62:anewarray       Object[]
	//   29   65:dup             
	//   30   66:iconst_0        
	//   31   67:new             #19  <Class StringBuilder>
	//   32   70:dup             
	//   33   71:invokespecial   #22  <Method void StringBuilder()>
	//   34   74:ldc2            #665 <String "initC3ByCP exception = ">
	//   35   77:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   36   80:aload_1         
	//   37   81:invokevirtual   #409 <Method String Exception.getMessage()>
	//   38   84:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   39   87:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   40   90:aastore         
	//   41   91:invokestatic    #62  <Method void ded.d(String, Object[])>
		abyte0;
	//   42   94:aload_0         
		JVM INSTR monitorexit ;
	//   43   95:monitorexit     
		return;
	//   44   96:return          
		obj;
	//   45   97:astore_1        
	//*  46   98:aload_0         
		throw obj;
	//   47   99:monitorexit     
	//   48  100:aload_1         
	//   49  101:athrow          
	}

	private static String a;
	private static boolean b = true;
	private static final String c = (new StringBuilder()).append("content://").append(BaseApplication.d().c()).append(".data.backup.provider").append("/").toString();
	private static byte e[] = new byte[1];

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        byte[]
	//    2    3:putstatic       #15  <Field byte[] e>
	//    3    6:iconst_1        
	//    4    7:putstatic       #17  <Field boolean b>
	//    5   10:new             #19  <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #22  <Method void StringBuilder()>
	//    8   17:ldc1            #24  <String "content://">
	//    9   19:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   10   22:invokestatic    #34  <Method com.huawei.hwcommonmodel.application.BaseApplication$e BaseApplication.d()>
	//   11   25:invokevirtual   #39  <Method String com.huawei.hwcommonmodel.application.BaseApplication$e.c()>
	//   12   28:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:ldc1            #41  <String ".data.backup.provider">
	//   14   33:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:ldc1            #43  <String "/">
	//   16   38:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   17   41:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   18   44:putstatic       #48  <Field String c>
	//*  19   47:return          
	}
}
