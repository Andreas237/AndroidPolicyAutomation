// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.database.CharArrayBuffer;
import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;

public final class DataUtils
{

	public DataUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public static void copyStringToBuffer(String s, CharArrayBuffer chararraybuffer)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #18  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            15
			chararraybuffer.sizeCopied = 0;
	//    3    7:aload_1         
	//    4    8:iconst_0        
	//    5    9:putfield        #24  <Field int CharArrayBuffer.sizeCopied>
		else
	//*   6   12:goto            62
		if(chararraybuffer.data != null && chararraybuffer.data.length >= s.length())
	//*   7   15:aload_1         
	//*   8   16:getfield        #28  <Field char[] CharArrayBuffer.data>
	//*   9   19:ifnull          54
	//*  10   22:aload_1         
	//*  11   23:getfield        #28  <Field char[] CharArrayBuffer.data>
	//*  12   26:arraylength     
	//*  13   27:aload_0         
	//*  14   28:invokevirtual   #34  <Method int String.length()>
	//*  15   31:icmpge          37
	//*  16   34:goto            54
			s.getChars(0, s.length(), chararraybuffer.data, 0);
	//   17   37:aload_0         
	//   18   38:iconst_0        
	//   19   39:aload_0         
	//   20   40:invokevirtual   #34  <Method int String.length()>
	//   21   43:aload_1         
	//   22   44:getfield        #28  <Field char[] CharArrayBuffer.data>
	//   23   47:iconst_0        
	//   24   48:invokevirtual   #38  <Method void String.getChars(int, int, char[], int)>
		else
	//*  25   51:goto            62
			chararraybuffer.data = s.toCharArray();
	//   26   54:aload_1         
	//   27   55:aload_0         
	//   28   56:invokevirtual   #42  <Method char[] String.toCharArray()>
	//   29   59:putfield        #28  <Field char[] CharArrayBuffer.data>
		chararraybuffer.sizeCopied = s.length();
	//   30   62:aload_1         
	//   31   63:aload_0         
	//   32   64:invokevirtual   #34  <Method int String.length()>
	//   33   67:putfield        #24  <Field int CharArrayBuffer.sizeCopied>
	//   34   70:return          
	}

	public static byte[] loadImageBytes(Bitmap bitmap)
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #47  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void ByteArrayOutputStream()>
	//    3    7:astore_1        
		bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, ((java.io.OutputStream) (bytearrayoutputstream)));
	//    4    8:aload_0         
	//    5    9:getstatic       #54  <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.JPEG>
	//    6   12:bipush          100
	//    7   14:aload_1         
	//    8   15:invokevirtual   #60  <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
	//    9   18:pop             
		return bytearrayoutputstream.toByteArray();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #64  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   12   23:areturn         
	}
}
