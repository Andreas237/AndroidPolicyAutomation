// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.franmontiel.persistentcookiejar.persistence;

import android.util.Log;
import java.io.*;
import okhttp3.Cookie;

public class SerializableCookie
	implements Serializable
{

	public SerializableCookie()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	private static String byteArrayToHexString(byte abyte0[])
	{
		StringBuilder stringbuilder = new StringBuilder(abyte0.length * 2);
	//    0    0:new             #29  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:arraylength     
	//    4    6:iconst_2        
	//    5    7:imul            
	//    6    8:invokespecial   #32  <Method void StringBuilder(int)>
	//    7   11:astore          4
		int j = abyte0.length;
	//    8   13:aload_0         
	//    9   14:arraylength     
	//   10   15:istore_2        
		for(int i = 0; i < j; i++)
	//*  11   16:iconst_0        
	//*  12   17:istore_1        
	//*  13   18:iload_1         
	//*  14   19:iload_2         
	//*  15   20:icmpge          62
		{
			int k = abyte0[i] & 0xff;
	//   16   23:aload_0         
	//   17   24:iload_1         
	//   18   25:baload          
	//   19   26:sipush          255
	//   20   29:iand            
	//   21   30:istore_3        
			if(k < 16)
	//*  22   31:iload_3         
	//*  23   32:bipush          16
	//*  24   34:icmpge          45
				stringbuilder.append('0');
	//   25   37:aload           4
	//   26   39:bipush          48
	//   27   41:invokevirtual   #36  <Method StringBuilder StringBuilder.append(char)>
	//   28   44:pop             
			stringbuilder.append(Integer.toHexString(k));
	//   29   45:aload           4
	//   30   47:iload_3         
	//   31   48:invokestatic    #42  <Method String Integer.toHexString(int)>
	//   32   51:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   33   54:pop             
		}

	//   34   55:iload_1         
	//   35   56:iconst_1        
	//   36   57:iadd            
	//   37   58:istore_1        
	//*  38   59:goto            18
		return stringbuilder.toString();
	//   39   62:aload           4
	//   40   64:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   41   67:areturn         
	}

	private static byte[] hexStringToByteArray(String s)
	{
		int j = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method int String.length()>
	//    2    4:istore_2        
		byte abyte0[] = new byte[j / 2];
	//    3    5:iload_2         
	//    4    6:iconst_2        
	//    5    7:idiv            
	//    6    8:newarray        byte[]
	//    7   10:astore_3        
		for(int i = 0; i < j; i += 2)
	//*   8   11:iconst_0        
	//*   9   12:istore_1        
	//*  10   13:iload_1         
	//*  11   14:iload_2         
	//*  12   15:icmpge          56
			abyte0[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
	//   13   18:aload_3         
	//   14   19:iload_1         
	//   15   20:iconst_2        
	//   16   21:idiv            
	//   17   22:aload_0         
	//   18   23:iload_1         
	//   19   24:invokevirtual   #61  <Method char String.charAt(int)>
	//   20   27:bipush          16
	//   21   29:invokestatic    #67  <Method int Character.digit(char, int)>
	//   22   32:iconst_4        
	//   23   33:ishl            
	//   24   34:aload_0         
	//   25   35:iload_1         
	//   26   36:iconst_1        
	//   27   37:iadd            
	//   28   38:invokevirtual   #61  <Method char String.charAt(int)>
	//   29   41:bipush          16
	//   30   43:invokestatic    #67  <Method int Character.digit(char, int)>
	//   31   46:iadd            
	//   32   47:int2byte        
	//   33   48:bastore         

	//   34   49:iload_1         
	//   35   50:iconst_2        
	//   36   51:iadd            
	//   37   52:istore_1        
	//*  38   53:goto            13
		return abyte0;
	//   39   56:aload_3         
	//   40   57:areturn         
	}

	private void readObject(ObjectInputStream objectinputstream)
		throws IOException, ClassNotFoundException
	{
		okhttp3.Cookie.Builder builder = new okhttp3.Cookie.Builder();
	//    0    0:new             #75  <Class okhttp3.Cookie$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #76  <Method void okhttp3.Cookie$Builder()>
	//    3    7:astore          4
		builder.name((String)objectinputstream.readObject());
	//    4    9:aload           4
	//    5   11:aload_1         
	//    6   12:invokevirtual   #81  <Method Object ObjectInputStream.readObject()>
	//    7   15:checkcast       #53  <Class String>
	//    8   18:invokevirtual   #85  <Method okhttp3.Cookie$Builder okhttp3.Cookie$Builder.name(String)>
	//    9   21:pop             
		builder.value((String)objectinputstream.readObject());
	//   10   22:aload           4
	//   11   24:aload_1         
	//   12   25:invokevirtual   #81  <Method Object ObjectInputStream.readObject()>
	//   13   28:checkcast       #53  <Class String>
	//   14   31:invokevirtual   #88  <Method okhttp3.Cookie$Builder okhttp3.Cookie$Builder.value(String)>
	//   15   34:pop             
		long l = objectinputstream.readLong();
	//   16   35:aload_1         
	//   17   36:invokevirtual   #92  <Method long ObjectInputStream.readLong()>
	//   18   39:lstore_2        
		if(l != NON_VALID_EXPIRES_AT)
	//*  19   40:lload_2         
	//*  20   41:getstatic       #94  <Field long NON_VALID_EXPIRES_AT>
	//*  21   44:lcmp            
	//*  22   45:ifeq            55
			builder.expiresAt(l);
	//   23   48:aload           4
	//   24   50:lload_2         
	//   25   51:invokevirtual   #98  <Method okhttp3.Cookie$Builder okhttp3.Cookie$Builder.expiresAt(long)>
	//   26   54:pop             
		String s = (String)objectinputstream.readObject();
	//   27   55:aload_1         
	//   28   56:invokevirtual   #81  <Method Object ObjectInputStream.readObject()>
	//   29   59:checkcast       #53  <Class String>
	//   30   62:astore          5
		builder.domain(s);
	//   31   64:aload           4
	//   32   66:aload           5
	//   33   68:invokevirtual   #101 <Method okhttp3.Cookie$Builder okhttp3.Cookie$Builder.domain(String)>
	//   34   71:pop             
		builder.path((String)objectinputstream.readObject());
	//   35   72:aload           4
	//   36   74:aload_1         
	//   37   75:invokevirtual   #81  <Method Object ObjectInputStream.readObject()>
	//   38   78:checkcast       #53  <Class String>
	//   39   81:invokevirtual   #104 <Method okhttp3.Cookie$Builder okhttp3.Cookie$Builder.path(String)>
	//   40   84:pop             
		if(objectinputstream.readBoolean())
	//*  41   85:aload_1         
	//*  42   86:invokevirtual   #108 <Method boolean ObjectInputStream.readBoolean()>
	//*  43   89:ifeq            98
			builder.secure();
	//   44   92:aload           4
	//   45   94:invokevirtual   #112 <Method okhttp3.Cookie$Builder okhttp3.Cookie$Builder.secure()>
	//   46   97:pop             
		if(objectinputstream.readBoolean())
	//*  47   98:aload_1         
	//*  48   99:invokevirtual   #108 <Method boolean ObjectInputStream.readBoolean()>
	//*  49  102:ifeq            111
			builder.httpOnly();
	//   50  105:aload           4
	//   51  107:invokevirtual   #115 <Method okhttp3.Cookie$Builder okhttp3.Cookie$Builder.httpOnly()>
	//   52  110:pop             
		if(objectinputstream.readBoolean())
	//*  53  111:aload_1         
	//*  54  112:invokevirtual   #108 <Method boolean ObjectInputStream.readBoolean()>
	//*  55  115:ifeq            126
			builder.hostOnlyDomain(s);
	//   56  118:aload           4
	//   57  120:aload           5
	//   58  122:invokevirtual   #118 <Method okhttp3.Cookie$Builder okhttp3.Cookie$Builder.hostOnlyDomain(String)>
	//   59  125:pop             
		cookie = builder.build();
	//   60  126:aload_0         
	//   61  127:aload           4
	//   62  129:invokevirtual   #122 <Method Cookie okhttp3.Cookie$Builder.build()>
	//   63  132:putfield        #124 <Field Cookie cookie>
	//   64  135:return          
	}

	private void writeObject(ObjectOutputStream objectoutputstream)
		throws IOException
	{
		objectoutputstream.writeObject(((Object) (cookie.name())));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #124 <Field Cookie cookie>
	//    3    5:invokevirtual   #131 <Method String Cookie.name()>
	//    4    8:invokevirtual   #136 <Method void ObjectOutputStream.writeObject(Object)>
		objectoutputstream.writeObject(((Object) (cookie.value())));
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #124 <Field Cookie cookie>
	//    8   16:invokevirtual   #138 <Method String Cookie.value()>
	//    9   19:invokevirtual   #136 <Method void ObjectOutputStream.writeObject(Object)>
		long l;
		if(cookie.persistent())
	//*  10   22:aload_0         
	//*  11   23:getfield        #124 <Field Cookie cookie>
	//*  12   26:invokevirtual   #141 <Method boolean Cookie.persistent()>
	//*  13   29:ifeq            43
			l = cookie.expiresAt();
	//   14   32:aload_0         
	//   15   33:getfield        #124 <Field Cookie cookie>
	//   16   36:invokevirtual   #143 <Method long Cookie.expiresAt()>
	//   17   39:lstore_2        
		else
	//*  18   40:goto            47
			l = NON_VALID_EXPIRES_AT;
	//   19   43:getstatic       #94  <Field long NON_VALID_EXPIRES_AT>
	//   20   46:lstore_2        
		objectoutputstream.writeLong(l);
	//   21   47:aload_1         
	//   22   48:lload_2         
	//   23   49:invokevirtual   #147 <Method void ObjectOutputStream.writeLong(long)>
		objectoutputstream.writeObject(((Object) (cookie.domain())));
	//   24   52:aload_1         
	//   25   53:aload_0         
	//   26   54:getfield        #124 <Field Cookie cookie>
	//   27   57:invokevirtual   #149 <Method String Cookie.domain()>
	//   28   60:invokevirtual   #136 <Method void ObjectOutputStream.writeObject(Object)>
		objectoutputstream.writeObject(((Object) (cookie.path())));
	//   29   63:aload_1         
	//   30   64:aload_0         
	//   31   65:getfield        #124 <Field Cookie cookie>
	//   32   68:invokevirtual   #151 <Method String Cookie.path()>
	//   33   71:invokevirtual   #136 <Method void ObjectOutputStream.writeObject(Object)>
		objectoutputstream.writeBoolean(cookie.secure());
	//   34   74:aload_1         
	//   35   75:aload_0         
	//   36   76:getfield        #124 <Field Cookie cookie>
	//   37   79:invokevirtual   #153 <Method boolean Cookie.secure()>
	//   38   82:invokevirtual   #157 <Method void ObjectOutputStream.writeBoolean(boolean)>
		objectoutputstream.writeBoolean(cookie.httpOnly());
	//   39   85:aload_1         
	//   40   86:aload_0         
	//   41   87:getfield        #124 <Field Cookie cookie>
	//   42   90:invokevirtual   #159 <Method boolean Cookie.httpOnly()>
	//   43   93:invokevirtual   #157 <Method void ObjectOutputStream.writeBoolean(boolean)>
		objectoutputstream.writeBoolean(cookie.hostOnly());
	//   44   96:aload_1         
	//   45   97:aload_0         
	//   46   98:getfield        #124 <Field Cookie cookie>
	//   47  101:invokevirtual   #162 <Method boolean Cookie.hostOnly()>
	//   48  104:invokevirtual   #157 <Method void ObjectOutputStream.writeBoolean(boolean)>
	//   49  107:return          
	}

	public Cookie decode(String s)
	{
		Object obj2;
		s = ((String) (new ByteArrayInputStream(hexStringToByteArray(s))));
	//    0    0:new             #166 <Class ByteArrayInputStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokestatic    #168 <Method byte[] hexStringToByteArray(String)>
	//    4    8:invokespecial   #171 <Method void ByteArrayInputStream(byte[])>
	//    5   11:astore_1        
		obj2 = null;
	//    6   12:aconst_null     
	//    7   13:astore          4
		Object obj = ((Object) (new ObjectInputStream(((java.io.InputStream) (s)))));
	//    8   15:new             #78  <Class ObjectInputStream>
	//    9   18:dup             
	//   10   19:aload_1         
	//   11   20:invokespecial   #174 <Method void ObjectInputStream(java.io.InputStream)>
	//   12   23:astore_2        
		s = ((String) (obj));
	//   13   24:aload_2         
	//   14   25:astore_1        
		Cookie cookie1 = ((SerializableCookie)((ObjectInputStream) (obj)).readObject()).cookie;
	//   15   26:aload_2         
	//   16   27:invokevirtual   #81  <Method Object ObjectInputStream.readObject()>
	//   17   30:checkcast       #2   <Class SerializableCookie>
	//   18   33:getfield        #124 <Field Cookie cookie>
	//   19   36:astore_3        
		s = ((String) (cookie1));
	//   20   37:aload_3         
	//   21   38:astore_1        
		try
		{
			((ObjectInputStream) (obj)).close();
	//   22   39:aload_2         
	//   23   40:invokevirtual   #177 <Method void ObjectInputStream.close()>
		}
	//*  24   43:aload_3         
	//*  25   44:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  26   45:astore_2        
		{
			Log.d(TAG, "Stream not closed in decodeCookie", ((Throwable) (obj)));
	//   27   46:getstatic       #179 <Field String TAG>
	//   28   49:ldc1            #181 <String "Stream not closed in decodeCookie">
	//   29   51:aload_2         
	//   30   52:invokestatic    #187 <Method int Log.d(String, String, Throwable)>
	//   31   55:pop             
			return ((Cookie) (s));
	//   32   56:aload_1         
	//   33   57:areturn         
		}
		return cookie1;
		Object obj1;
		obj1;
	//   34   58:astore_3        
		break MISSING_BLOCK_LABEL_75;
	//   35   59:goto            75
		obj1;
	//   36   62:astore_3        
		break MISSING_BLOCK_LABEL_103;
	//   37   63:goto            103
		obj;
	//   38   66:astore_2        
		s = null;
	//   39   67:aconst_null     
	//   40   68:astore_1        
		break MISSING_BLOCK_LABEL_129;
	//   41   69:goto            129
		obj1;
	//   42   72:astore_3        
		obj = null;
	//   43   73:aconst_null     
	//   44   74:astore_2        
		s = ((String) (obj));
	//   45   75:aload_2         
	//   46   76:astore_1        
		Log.d(TAG, "ClassNotFoundException in decodeCookie", ((Throwable) (obj1)));
	//   47   77:getstatic       #179 <Field String TAG>
	//   48   80:ldc1            #189 <String "ClassNotFoundException in decodeCookie">
	//   49   82:aload_3         
	//   50   83:invokestatic    #187 <Method int Log.d(String, String, Throwable)>
	//   51   86:pop             
		if(obj == null)
			break MISSING_BLOCK_LABEL_126;
	//   52   87:aload_2         
	//   53   88:ifnull          126
		s = ((String) (obj2));
	//   54   91:aload           4
	//   55   93:astore_1        
		((ObjectInputStream) (obj)).close();
	//   56   94:aload_2         
	//   57   95:invokevirtual   #177 <Method void ObjectInputStream.close()>
		return null;
	//   58   98:aconst_null     
	//   59   99:areturn         
		obj1;
	//   60  100:astore_3        
		obj = null;
	//   61  101:aconst_null     
	//   62  102:astore_2        
		s = ((String) (obj));
	//   63  103:aload_2         
	//   64  104:astore_1        
		Log.d(TAG, "IOException in decodeCookie", ((Throwable) (obj1)));
	//   65  105:getstatic       #179 <Field String TAG>
	//   66  108:ldc1            #191 <String "IOException in decodeCookie">
	//   67  110:aload_3         
	//   68  111:invokestatic    #187 <Method int Log.d(String, String, Throwable)>
	//   69  114:pop             
		if(obj == null)
			break MISSING_BLOCK_LABEL_126;
	//   70  115:aload_2         
	//   71  116:ifnull          126
		s = ((String) (obj2));
	//   72  119:aload           4
	//   73  121:astore_1        
		((ObjectInputStream) (obj)).close();
	//   74  122:aload_2         
	//   75  123:invokevirtual   #177 <Method void ObjectInputStream.close()>
		return null;
	//   76  126:aconst_null     
	//   77  127:areturn         
		obj;
	//   78  128:astore_2        
		if(s != null)
	//*  79  129:aload_1         
	//*  80  130:ifnull          151
			try
			{
				((ObjectInputStream) (s)).close();
	//   81  133:aload_1         
	//   82  134:invokevirtual   #177 <Method void ObjectInputStream.close()>
			}
	//*  83  137:goto            151
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  84  140:astore_1        
			{
				Log.d(TAG, "Stream not closed in decodeCookie", ((Throwable) (s)));
	//   85  141:getstatic       #179 <Field String TAG>
	//   86  144:ldc1            #181 <String "Stream not closed in decodeCookie">
	//   87  146:aload_1         
	//   88  147:invokestatic    #187 <Method int Log.d(String, String, Throwable)>
	//   89  150:pop             
			}
		throw obj;
	//   90  151:aload_2         
	//   91  152:athrow          
	}

	public String encode(Cookie cookie1)
	{
		ByteArrayOutputStream bytearrayoutputstream;
		cookie = cookie1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #124 <Field Cookie cookie>
		bytearrayoutputstream = new ByteArrayOutputStream();
	//    3    5:new             #195 <Class ByteArrayOutputStream>
	//    4    8:dup             
	//    5    9:invokespecial   #196 <Method void ByteArrayOutputStream()>
	//    6   12:astore_3        
		Object obj = ((Object) (new ObjectOutputStream(((java.io.OutputStream) (bytearrayoutputstream)))));
	//    7   13:new             #133 <Class ObjectOutputStream>
	//    8   16:dup             
	//    9   17:aload_3         
	//   10   18:invokespecial   #199 <Method void ObjectOutputStream(java.io.OutputStream)>
	//   11   21:astore_2        
		cookie1 = ((Cookie) (obj));
	//   12   22:aload_2         
	//   13   23:astore_1        
		((ObjectOutputStream) (obj)).writeObject(((Object) (this)));
	//   14   24:aload_2         
	//   15   25:aload_0         
	//   16   26:invokevirtual   #136 <Method void ObjectOutputStream.writeObject(Object)>
		try
		{
			((ObjectOutputStream) (obj)).close();
	//   17   29:aload_2         
	//   18   30:invokevirtual   #200 <Method void ObjectOutputStream.close()>
		}
	//*  19   33:goto            47
		// Misplaced declaration of an exception variable
		catch(Cookie cookie1)
	//*  20   36:astore_1        
		{
			Log.d(TAG, "Stream not closed in encodeCookie", ((Throwable) (cookie1)));
	//   21   37:getstatic       #179 <Field String TAG>
	//   22   40:ldc1            #202 <String "Stream not closed in encodeCookie">
	//   23   42:aload_1         
	//   24   43:invokestatic    #187 <Method int Log.d(String, String, Throwable)>
	//   25   46:pop             
		}
		return byteArrayToHexString(bytearrayoutputstream.toByteArray());
	//   26   47:aload_3         
	//   27   48:invokevirtual   #206 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   28   51:invokestatic    #208 <Method String byteArrayToHexString(byte[])>
	//   29   54:areturn         
		IOException ioexception;
		ioexception;
	//   30   55:astore_3        
		break MISSING_BLOCK_LABEL_68;
	//   31   56:goto            68
		obj;
	//   32   59:astore_2        
		cookie1 = null;
	//   33   60:aconst_null     
	//   34   61:astore_1        
		break MISSING_BLOCK_LABEL_104;
	//   35   62:goto            104
		ioexception;
	//   36   65:astore_3        
		obj = null;
	//   37   66:aconst_null     
	//   38   67:astore_2        
		cookie1 = ((Cookie) (obj));
	//   39   68:aload_2         
	//   40   69:astore_1        
		Log.d(TAG, "IOException in encodeCookie", ((Throwable) (ioexception)));
	//   41   70:getstatic       #179 <Field String TAG>
	//   42   73:ldc1            #210 <String "IOException in encodeCookie">
	//   43   75:aload_3         
	//   44   76:invokestatic    #187 <Method int Log.d(String, String, Throwable)>
	//   45   79:pop             
		if(obj == null)
			break MISSING_BLOCK_LABEL_101;
	//   46   80:aload_2         
	//   47   81:ifnull          101
		((ObjectOutputStream) (obj)).close();
	//   48   84:aload_2         
	//   49   85:invokevirtual   #200 <Method void ObjectOutputStream.close()>
		return null;
	//   50   88:aconst_null     
	//   51   89:areturn         
		cookie1;
	//   52   90:astore_1        
		Log.d(TAG, "Stream not closed in encodeCookie", ((Throwable) (cookie1)));
	//   53   91:getstatic       #179 <Field String TAG>
	//   54   94:ldc1            #202 <String "Stream not closed in encodeCookie">
	//   55   96:aload_1         
	//   56   97:invokestatic    #187 <Method int Log.d(String, String, Throwable)>
	//   57  100:pop             
		return null;
	//   58  101:aconst_null     
	//   59  102:areturn         
		obj;
	//   60  103:astore_2        
		if(cookie1 != null)
	//*  61  104:aload_1         
	//*  62  105:ifnull          126
			try
			{
				((ObjectOutputStream) (cookie1)).close();
	//   63  108:aload_1         
	//   64  109:invokevirtual   #200 <Method void ObjectOutputStream.close()>
			}
	//*  65  112:goto            126
			// Misplaced declaration of an exception variable
			catch(Cookie cookie1)
	//*  66  115:astore_1        
			{
				Log.d(TAG, "Stream not closed in encodeCookie", ((Throwable) (cookie1)));
	//   67  116:getstatic       #179 <Field String TAG>
	//   68  119:ldc1            #202 <String "Stream not closed in encodeCookie">
	//   69  121:aload_1         
	//   70  122:invokestatic    #187 <Method int Log.d(String, String, Throwable)>
	//   71  125:pop             
			}
		throw obj;
	//   72  126:aload_2         
	//   73  127:athrow          
	}

	private static long NON_VALID_EXPIRES_AT = -1L;
	private static final String TAG = "SerializableCookie";
	private static final long serialVersionUID = 0xcf60a162L;
	private transient Cookie cookie;

	static 
	{
	//    0    0:return          
	}
}
