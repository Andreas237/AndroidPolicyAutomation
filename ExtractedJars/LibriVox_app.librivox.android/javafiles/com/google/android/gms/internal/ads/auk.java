// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.*;
import java.util.HashMap;

public abstract class auk
{

	public auk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	protected static HashMap b(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s)))) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:invokestatic    #26  <Method boolean TextUtils.isEmpty(CharSequence)>
	//    2    4:ifne            47
_L1:
		s = ((String) ((HashMap)(new ObjectInputStream(((java.io.InputStream) (new ByteArrayInputStream(Base64.decode(s.getBytes(), 0)))))).readObject()));
	//    3    7:new             #28  <Class ObjectInputStream>
	//    4   10:dup             
	//    5   11:new             #30  <Class ByteArrayInputStream>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokevirtual   #36  <Method byte[] String.getBytes()>
	//    9   19:iconst_0        
	//   10   20:invokestatic    #42  <Method byte[] Base64.decode(byte[], int)>
	//   11   23:invokespecial   #45  <Method void ByteArrayInputStream(byte[])>
	//   12   26:invokespecial   #48  <Method void ObjectInputStream(java.io.InputStream)>
	//   13   29:invokevirtual   #52  <Method Object ObjectInputStream.readObject()>
	//   14   32:checkcast       #54  <Class HashMap>
	//   15   35:astore_0        
		return ((HashMap) (s));
	//   16   36:aload_0         
	//   17   37:areturn         
_L4:
		Log.d(a, "decode object failure");
	//   18   38:getstatic       #56  <Field String a>
	//   19   41:ldc1            #58  <String "decode object failure">
	//   20   43:invokestatic    #64  <Method int Log.d(String, String)>
	//   21   46:pop             
_L2:
		return null;
	//   22   47:aconst_null     
	//   23   48:areturn         
		s;
	//   24   49:astore_0        
		if(true) goto _L4; else goto _L3
_L3:
	//*  25   50:goto            38
	}

	protected abstract HashMap a();

	protected abstract void a(String s);

	public String toString()
	{
		IOException ioexception;
		Object obj;
		try
		{
			obj = ((Object) (new ByteArrayOutputStream()));
	//    0    0:new             #70  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #71  <Method void ByteArrayOutputStream()>
	//    3    7:astore_1        
			ObjectOutputStream objectoutputstream = new ObjectOutputStream(((java.io.OutputStream) (obj)));
	//    4    8:new             #73  <Class ObjectOutputStream>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokespecial   #76  <Method void ObjectOutputStream(java.io.OutputStream)>
	//    8   16:astore_2        
			objectoutputstream.writeObject(((Object) (a())));
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #78  <Method HashMap a()>
	//   12   22:invokevirtual   #82  <Method void ObjectOutputStream.writeObject(Object)>
			objectoutputstream.close();
	//   13   25:aload_2         
	//   14   26:invokevirtual   #85  <Method void ObjectOutputStream.close()>
			obj = ((Object) (Base64.encodeToString(((ByteArrayOutputStream) (obj)).toByteArray(), 0)));
	//   15   29:aload_1         
	//   16   30:invokevirtual   #88  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   17   33:iconst_0        
	//   18   34:invokestatic    #92  <Method String Base64.encodeToString(byte[], int)>
	//   19   37:astore_1        
		}
	//*  20   38:aload_1         
	//*  21   39:areturn         
	//*  22   40:aconst_null     
	//*  23   41:areturn         
		// Misplaced declaration of an exception variable
		catch(IOException ioexception)
		{
			return null;
		}
		return ((String) (obj));
	//*  24   42:astore_1        
	//*  25   43:goto            40
	}

	private static final String a = "auk";

	static 
	{
	//    0    0:return          
	}
}
