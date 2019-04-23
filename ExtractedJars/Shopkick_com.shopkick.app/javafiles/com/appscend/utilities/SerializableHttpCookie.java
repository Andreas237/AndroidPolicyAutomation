// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.utilities;

import android.util.Log;
import java.io.*;
import java.lang.reflect.Field;
import java.net.HttpCookie;

public class SerializableHttpCookie
	implements Serializable
{

	public SerializableHttpCookie()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	private String byteArrayToHexString(byte abyte0[])
	{
		StringBuilder stringbuilder = new StringBuilder(abyte0.length * 2);
	//    0    0:new             #28  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:iconst_2        
	//    5    7:imul            
	//    6    8:invokespecial   #31  <Method void StringBuilder(int)>
	//    7   11:astore          5
		int j = abyte0.length;
	//    8   13:aload_1         
	//    9   14:arraylength     
	//   10   15:istore_3        
		for(int i = 0; i < j; i++)
	//*  11   16:iconst_0        
	//*  12   17:istore_2        
	//*  13   18:iload_2         
	//*  14   19:iload_3         
	//*  15   20:icmpge          65
		{
			int k = abyte0[i] & 0xff;
	//   16   23:aload_1         
	//   17   24:iload_2         
	//   18   25:baload          
	//   19   26:sipush          255
	//   20   29:iand            
	//   21   30:istore          4
			if(k < 16)
	//*  22   32:iload           4
	//*  23   34:bipush          16
	//*  24   36:icmpge          47
				stringbuilder.append('0');
	//   25   39:aload           5
	//   26   41:bipush          48
	//   27   43:invokevirtual   #35  <Method StringBuilder StringBuilder.append(char)>
	//   28   46:pop             
			stringbuilder.append(Integer.toHexString(k));
	//   29   47:aload           5
	//   30   49:iload           4
	//   31   51:invokestatic    #41  <Method String Integer.toHexString(int)>
	//   32   54:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   33   57:pop             
		}

	//   34   58:iload_2         
	//   35   59:iconst_1        
	//   36   60:iadd            
	//   37   61:istore_2        
	//*  38   62:goto            18
		return stringbuilder.toString();
	//   39   65:aload           5
	//   40   67:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   41   70:areturn         
	}

	private boolean getHttpOnly()
	{
		Exception exception;
		boolean flag;
		try
		{
			initFieldHttpOnly();
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void initFieldHttpOnly()>
			flag = ((Boolean)fieldHttpOnly.get(((Object) (cookie)))).booleanValue();
	//    2    4:aload_0         
	//    3    5:getfield        #57  <Field Field fieldHttpOnly>
	//    4    8:aload_0         
	//    5    9:getfield        #59  <Field HttpCookie cookie>
	//    6   12:invokevirtual   #65  <Method Object Field.get(Object)>
	//    7   15:checkcast       #67  <Class Boolean>
	//    8   18:invokevirtual   #70  <Method boolean Boolean.booleanValue()>
	//    9   21:istore_1        
		}
	//*  10   22:iload_1         
	//*  11   23:ireturn         
	//*  12   24:iconst_0        
	//*  13   25:ireturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			return false;
		}
		return flag;
	//*  14   26:astore_2        
	//*  15   27:goto            24
	}

	private byte[] hexStringToByteArray(String s)
	{
		int j = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #78  <Method int String.length()>
	//    2    4:istore_3        
		byte abyte0[] = new byte[j / 2];
	//    3    5:iload_3         
	//    4    6:iconst_2        
	//    5    7:idiv            
	//    6    8:newarray        byte[]
	//    7   10:astore          4
		for(int i = 0; i < j; i += 2)
	//*   8   12:iconst_0        
	//*   9   13:istore_2        
	//*  10   14:iload_2         
	//*  11   15:iload_3         
	//*  12   16:icmpge          58
			abyte0[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
	//   13   19:aload           4
	//   14   21:iload_2         
	//   15   22:iconst_2        
	//   16   23:idiv            
	//   17   24:aload_1         
	//   18   25:iload_2         
	//   19   26:invokevirtual   #82  <Method char String.charAt(int)>
	//   20   29:bipush          16
	//   21   31:invokestatic    #88  <Method int Character.digit(char, int)>
	//   22   34:iconst_4        
	//   23   35:ishl            
	//   24   36:aload_1         
	//   25   37:iload_2         
	//   26   38:iconst_1        
	//   27   39:iadd            
	//   28   40:invokevirtual   #82  <Method char String.charAt(int)>
	//   29   43:bipush          16
	//   30   45:invokestatic    #88  <Method int Character.digit(char, int)>
	//   31   48:iadd            
	//   32   49:int2byte        
	//   33   50:bastore         

	//   34   51:iload_2         
	//   35   52:iconst_2        
	//   36   53:iadd            
	//   37   54:istore_2        
	//*  38   55:goto            14
		return abyte0;
	//   39   58:aload           4
	//   40   60:areturn         
	}

	private void initFieldHttpOnly()
	{
		try
		{
			fieldHttpOnly = ((Object) (cookie)).getClass().getDeclaredField("httpOnly");
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #59  <Field HttpCookie cookie>
	//    3    5:invokevirtual   #94  <Method Class Object.getClass()>
	//    4    8:ldc1            #96  <String "httpOnly">
	//    5   10:invokevirtual   #102 <Method Field Class.getDeclaredField(String)>
	//    6   13:putfield        #57  <Field Field fieldHttpOnly>
			fieldHttpOnly.setAccessible(true);
	//    7   16:aload_0         
	//    8   17:getfield        #57  <Field Field fieldHttpOnly>
	//    9   20:iconst_1        
	//   10   21:invokevirtual   #106 <Method void Field.setAccessible(boolean)>
			return;
	//   11   24:return          
		}
		catch(NoSuchFieldException nosuchfieldexception)
	//*  12   25:astore_1        
		{
			return;
	//   13   26:return          
		}
	}

	private void readObject(ObjectInputStream objectinputstream)
		throws IOException, ClassNotFoundException
	{
		cookie = new HttpCookie((String)objectinputstream.readObject(), (String)objectinputstream.readObject());
	//    0    0:aload_0         
	//    1    1:new             #114 <Class HttpCookie>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokevirtual   #119 <Method Object ObjectInputStream.readObject()>
	//    5    9:checkcast       #74  <Class String>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #119 <Method Object ObjectInputStream.readObject()>
	//    8   16:checkcast       #74  <Class String>
	//    9   19:invokespecial   #122 <Method void HttpCookie(String, String)>
	//   10   22:putfield        #59  <Field HttpCookie cookie>
		cookie.setComment((String)objectinputstream.readObject());
	//   11   25:aload_0         
	//   12   26:getfield        #59  <Field HttpCookie cookie>
	//   13   29:aload_1         
	//   14   30:invokevirtual   #119 <Method Object ObjectInputStream.readObject()>
	//   15   33:checkcast       #74  <Class String>
	//   16   36:invokevirtual   #126 <Method void HttpCookie.setComment(String)>
		cookie.setCommentURL((String)objectinputstream.readObject());
	//   17   39:aload_0         
	//   18   40:getfield        #59  <Field HttpCookie cookie>
	//   19   43:aload_1         
	//   20   44:invokevirtual   #119 <Method Object ObjectInputStream.readObject()>
	//   21   47:checkcast       #74  <Class String>
	//   22   50:invokevirtual   #129 <Method void HttpCookie.setCommentURL(String)>
		cookie.setDomain((String)objectinputstream.readObject());
	//   23   53:aload_0         
	//   24   54:getfield        #59  <Field HttpCookie cookie>
	//   25   57:aload_1         
	//   26   58:invokevirtual   #119 <Method Object ObjectInputStream.readObject()>
	//   27   61:checkcast       #74  <Class String>
	//   28   64:invokevirtual   #132 <Method void HttpCookie.setDomain(String)>
		cookie.setMaxAge(objectinputstream.readLong());
	//   29   67:aload_0         
	//   30   68:getfield        #59  <Field HttpCookie cookie>
	//   31   71:aload_1         
	//   32   72:invokevirtual   #136 <Method long ObjectInputStream.readLong()>
	//   33   75:invokevirtual   #140 <Method void HttpCookie.setMaxAge(long)>
		cookie.setPath((String)objectinputstream.readObject());
	//   34   78:aload_0         
	//   35   79:getfield        #59  <Field HttpCookie cookie>
	//   36   82:aload_1         
	//   37   83:invokevirtual   #119 <Method Object ObjectInputStream.readObject()>
	//   38   86:checkcast       #74  <Class String>
	//   39   89:invokevirtual   #143 <Method void HttpCookie.setPath(String)>
		cookie.setPortlist((String)objectinputstream.readObject());
	//   40   92:aload_0         
	//   41   93:getfield        #59  <Field HttpCookie cookie>
	//   42   96:aload_1         
	//   43   97:invokevirtual   #119 <Method Object ObjectInputStream.readObject()>
	//   44  100:checkcast       #74  <Class String>
	//   45  103:invokevirtual   #146 <Method void HttpCookie.setPortlist(String)>
		cookie.setVersion(objectinputstream.readInt());
	//   46  106:aload_0         
	//   47  107:getfield        #59  <Field HttpCookie cookie>
	//   48  110:aload_1         
	//   49  111:invokevirtual   #149 <Method int ObjectInputStream.readInt()>
	//   50  114:invokevirtual   #152 <Method void HttpCookie.setVersion(int)>
		cookie.setSecure(objectinputstream.readBoolean());
	//   51  117:aload_0         
	//   52  118:getfield        #59  <Field HttpCookie cookie>
	//   53  121:aload_1         
	//   54  122:invokevirtual   #155 <Method boolean ObjectInputStream.readBoolean()>
	//   55  125:invokevirtual   #158 <Method void HttpCookie.setSecure(boolean)>
		cookie.setDiscard(objectinputstream.readBoolean());
	//   56  128:aload_0         
	//   57  129:getfield        #59  <Field HttpCookie cookie>
	//   58  132:aload_1         
	//   59  133:invokevirtual   #155 <Method boolean ObjectInputStream.readBoolean()>
	//   60  136:invokevirtual   #161 <Method void HttpCookie.setDiscard(boolean)>
		setHttpOnly(objectinputstream.readBoolean());
	//   61  139:aload_0         
	//   62  140:aload_1         
	//   63  141:invokevirtual   #155 <Method boolean ObjectInputStream.readBoolean()>
	//   64  144:invokespecial   #164 <Method void setHttpOnly(boolean)>
	//   65  147:return          
	}

	private void setHttpOnly(boolean flag)
	{
		try
		{
			initFieldHttpOnly();
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void initFieldHttpOnly()>
			fieldHttpOnly.set(((Object) (cookie)), ((Object) (Boolean.valueOf(flag))));
	//    2    4:aload_0         
	//    3    5:getfield        #57  <Field Field fieldHttpOnly>
	//    4    8:aload_0         
	//    5    9:getfield        #59  <Field HttpCookie cookie>
	//    6   12:iload_1         
	//    7   13:invokestatic    #169 <Method Boolean Boolean.valueOf(boolean)>
	//    8   16:invokevirtual   #173 <Method void Field.set(Object, Object)>
			return;
	//    9   19:return          
		}
		catch(Exception exception)
	//*  10   20:astore_2        
		{
			return;
	//   11   21:return          
		}
	}

	private void writeObject(ObjectOutputStream objectoutputstream)
		throws IOException
	{
		objectoutputstream.writeObject(((Object) (cookie.getName())));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #59  <Field HttpCookie cookie>
	//    3    5:invokevirtual   #178 <Method String HttpCookie.getName()>
	//    4    8:invokevirtual   #183 <Method void ObjectOutputStream.writeObject(Object)>
		objectoutputstream.writeObject(((Object) (cookie.getValue())));
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #59  <Field HttpCookie cookie>
	//    8   16:invokevirtual   #186 <Method String HttpCookie.getValue()>
	//    9   19:invokevirtual   #183 <Method void ObjectOutputStream.writeObject(Object)>
		objectoutputstream.writeObject(((Object) (cookie.getComment())));
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:getfield        #59  <Field HttpCookie cookie>
	//   13   27:invokevirtual   #189 <Method String HttpCookie.getComment()>
	//   14   30:invokevirtual   #183 <Method void ObjectOutputStream.writeObject(Object)>
		objectoutputstream.writeObject(((Object) (cookie.getCommentURL())));
	//   15   33:aload_1         
	//   16   34:aload_0         
	//   17   35:getfield        #59  <Field HttpCookie cookie>
	//   18   38:invokevirtual   #192 <Method String HttpCookie.getCommentURL()>
	//   19   41:invokevirtual   #183 <Method void ObjectOutputStream.writeObject(Object)>
		objectoutputstream.writeObject(((Object) (cookie.getDomain())));
	//   20   44:aload_1         
	//   21   45:aload_0         
	//   22   46:getfield        #59  <Field HttpCookie cookie>
	//   23   49:invokevirtual   #195 <Method String HttpCookie.getDomain()>
	//   24   52:invokevirtual   #183 <Method void ObjectOutputStream.writeObject(Object)>
		objectoutputstream.writeLong(cookie.getMaxAge());
	//   25   55:aload_1         
	//   26   56:aload_0         
	//   27   57:getfield        #59  <Field HttpCookie cookie>
	//   28   60:invokevirtual   #198 <Method long HttpCookie.getMaxAge()>
	//   29   63:invokevirtual   #201 <Method void ObjectOutputStream.writeLong(long)>
		objectoutputstream.writeObject(((Object) (cookie.getPath())));
	//   30   66:aload_1         
	//   31   67:aload_0         
	//   32   68:getfield        #59  <Field HttpCookie cookie>
	//   33   71:invokevirtual   #204 <Method String HttpCookie.getPath()>
	//   34   74:invokevirtual   #183 <Method void ObjectOutputStream.writeObject(Object)>
		objectoutputstream.writeObject(((Object) (cookie.getPortlist())));
	//   35   77:aload_1         
	//   36   78:aload_0         
	//   37   79:getfield        #59  <Field HttpCookie cookie>
	//   38   82:invokevirtual   #207 <Method String HttpCookie.getPortlist()>
	//   39   85:invokevirtual   #183 <Method void ObjectOutputStream.writeObject(Object)>
		objectoutputstream.writeInt(cookie.getVersion());
	//   40   88:aload_1         
	//   41   89:aload_0         
	//   42   90:getfield        #59  <Field HttpCookie cookie>
	//   43   93:invokevirtual   #210 <Method int HttpCookie.getVersion()>
	//   44   96:invokevirtual   #213 <Method void ObjectOutputStream.writeInt(int)>
		objectoutputstream.writeBoolean(cookie.getSecure());
	//   45   99:aload_1         
	//   46  100:aload_0         
	//   47  101:getfield        #59  <Field HttpCookie cookie>
	//   48  104:invokevirtual   #216 <Method boolean HttpCookie.getSecure()>
	//   49  107:invokevirtual   #219 <Method void ObjectOutputStream.writeBoolean(boolean)>
		objectoutputstream.writeBoolean(cookie.getDiscard());
	//   50  110:aload_1         
	//   51  111:aload_0         
	//   52  112:getfield        #59  <Field HttpCookie cookie>
	//   53  115:invokevirtual   #222 <Method boolean HttpCookie.getDiscard()>
	//   54  118:invokevirtual   #219 <Method void ObjectOutputStream.writeBoolean(boolean)>
		objectoutputstream.writeBoolean(getHttpOnly());
	//   55  121:aload_1         
	//   56  122:aload_0         
	//   57  123:invokespecial   #224 <Method boolean getHttpOnly()>
	//   58  126:invokevirtual   #219 <Method void ObjectOutputStream.writeBoolean(boolean)>
	//   59  129:return          
	}

	public HttpCookie decode(String s)
	{
		s = ((String) (new ByteArrayInputStream(hexStringToByteArray(s))));
	//    0    0:new             #228 <Class ByteArrayInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #230 <Method byte[] hexStringToByteArray(String)>
	//    5    9:invokespecial   #233 <Method void ByteArrayInputStream(byte[])>
	//    6   12:astore_1        
		s = ((String) (((SerializableHttpCookie)(new ObjectInputStream(((java.io.InputStream) (s)))).readObject()).cookie));
	//    7   13:new             #116 <Class ObjectInputStream>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #236 <Method void ObjectInputStream(java.io.InputStream)>
	//   11   21:invokevirtual   #119 <Method Object ObjectInputStream.readObject()>
	//   12   24:checkcast       #2   <Class SerializableHttpCookie>
	//   13   27:getfield        #59  <Field HttpCookie cookie>
	//   14   30:astore_1        
		return ((HttpCookie) (s));
	//   15   31:aload_1         
	//   16   32:areturn         
		s;
	//   17   33:astore_1        
		Log.d(TAG, "ClassNotFoundException in decodeCookie", ((Throwable) (s)));
	//   18   34:getstatic       #238 <Field String TAG>
	//   19   37:ldc1            #240 <String "ClassNotFoundException in decodeCookie">
	//   20   39:aload_1         
	//   21   40:invokestatic    #246 <Method int Log.d(String, String, Throwable)>
	//   22   43:pop             
		break MISSING_BLOCK_LABEL_58;
	//   23   44:goto            58
		s;
	//   24   47:astore_1        
		Log.d(TAG, "IOException in decodeCookie", ((Throwable) (s)));
	//   25   48:getstatic       #238 <Field String TAG>
	//   26   51:ldc1            #248 <String "IOException in decodeCookie">
	//   27   53:aload_1         
	//   28   54:invokestatic    #246 <Method int Log.d(String, String, Throwable)>
	//   29   57:pop             
		return null;
	//   30   58:aconst_null     
	//   31   59:areturn         
	}

	public String encode(HttpCookie httpcookie)
	{
		cookie = httpcookie;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #59  <Field HttpCookie cookie>
		httpcookie = ((HttpCookie) (new ByteArrayOutputStream()));
	//    3    5:new             #252 <Class ByteArrayOutputStream>
	//    4    8:dup             
	//    5    9:invokespecial   #253 <Method void ByteArrayOutputStream()>
	//    6   12:astore_1        
		try
		{
			(new ObjectOutputStream(((java.io.OutputStream) (httpcookie)))).writeObject(((Object) (this)));
	//    7   13:new             #180 <Class ObjectOutputStream>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #256 <Method void ObjectOutputStream(java.io.OutputStream)>
	//   11   21:aload_0         
	//   12   22:invokevirtual   #183 <Method void ObjectOutputStream.writeObject(Object)>
		}
	//*  13   25:aload_0         
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #260 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*  16   30:invokespecial   #262 <Method String byteArrayToHexString(byte[])>
	//*  17   33:areturn         
		// Misplaced declaration of an exception variable
		catch(HttpCookie httpcookie)
	//*  18   34:astore_1        
		{
			Log.d(TAG, "IOException in encodeCookie", ((Throwable) (httpcookie)));
	//   19   35:getstatic       #238 <Field String TAG>
	//   20   38:ldc2            #264 <String "IOException in encodeCookie">
	//   21   41:aload_1         
	//   22   42:invokestatic    #246 <Method int Log.d(String, String, Throwable)>
	//   23   45:pop             
			return null;
	//   24   46:aconst_null     
	//   25   47:areturn         
		}
		return byteArrayToHexString(((ByteArrayOutputStream) (httpcookie)).toByteArray());
	}

	private static final String TAG = "SerializableHttpCookie";
	private static final long serialVersionUID = 0x7f563d0cL;
	private transient HttpCookie cookie;
	private Field fieldHttpOnly;

	static 
	{
	//    0    0:return          
	}
}
