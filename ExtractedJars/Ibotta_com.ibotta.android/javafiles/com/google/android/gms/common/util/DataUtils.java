// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.CharArrayBuffer;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.common.util:
//			IOUtils

public final class DataUtils
{

	public DataUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void copyStringToBuffer(String s, CharArrayBuffer chararraybuffer)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #17  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            15
			chararraybuffer.sizeCopied = 0;
	//    3    7:aload_1         
	//    4    8:iconst_0        
	//    5    9:putfield        #23  <Field int CharArrayBuffer.sizeCopied>
		else
	//*   6   12:goto            62
		if(chararraybuffer.data != null && chararraybuffer.data.length >= s.length())
	//*   7   15:aload_1         
	//*   8   16:getfield        #27  <Field char[] CharArrayBuffer.data>
	//*   9   19:ifnull          54
	//*  10   22:aload_1         
	//*  11   23:getfield        #27  <Field char[] CharArrayBuffer.data>
	//*  12   26:arraylength     
	//*  13   27:aload_0         
	//*  14   28:invokevirtual   #33  <Method int String.length()>
	//*  15   31:icmpge          37
	//*  16   34:goto            54
			s.getChars(0, s.length(), chararraybuffer.data, 0);
	//   17   37:aload_0         
	//   18   38:iconst_0        
	//   19   39:aload_0         
	//   20   40:invokevirtual   #33  <Method int String.length()>
	//   21   43:aload_1         
	//   22   44:getfield        #27  <Field char[] CharArrayBuffer.data>
	//   23   47:iconst_0        
	//   24   48:invokevirtual   #37  <Method void String.getChars(int, int, char[], int)>
		else
	//*  25   51:goto            62
			chararraybuffer.data = s.toCharArray();
	//   26   54:aload_1         
	//   27   55:aload_0         
	//   28   56:invokevirtual   #41  <Method char[] String.toCharArray()>
	//   29   59:putfield        #27  <Field char[] CharArrayBuffer.data>
		chararraybuffer.sizeCopied = s.length();
	//   30   62:aload_1         
	//   31   63:aload_0         
	//   32   64:invokevirtual   #33  <Method int String.length()>
	//   33   67:putfield        #23  <Field int CharArrayBuffer.sizeCopied>
	//   34   70:return          
	}

	public static byte[] loadImageBytes(AssetManager assetmanager, String s)
	{
		try
		{
			assetmanager = ((AssetManager) (IOUtils.readInputStreamFully(assetmanager.open(s))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #51  <Method java.io.InputStream AssetManager.open(String)>
	//    3    5:invokestatic    #57  <Method byte[] IOUtils.readInputStreamFully(java.io.InputStream)>
	//    4    8:astore_0        
		}
	//*   5    9:aload_0         
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(AssetManager assetmanager)
	//*   7   11:astore_0        
		{
			throw new RuntimeException(((Throwable) (assetmanager)));
	//    8   12:new             #59  <Class RuntimeException>
	//    9   15:dup             
	//   10   16:aload_0         
	//   11   17:invokespecial   #62  <Method void RuntimeException(Throwable)>
	//   12   20:athrow          
		}
		return ((byte []) (assetmanager));
	}

	public static byte[] loadImageBytes(Resources resources, int i)
	{
		try
		{
			resources = ((Resources) (IOUtils.readInputStreamFully(resources.openRawResource(i))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #70  <Method java.io.InputStream Resources.openRawResource(int)>
	//    3    5:invokestatic    #57  <Method byte[] IOUtils.readInputStreamFully(java.io.InputStream)>
	//    4    8:astore_0        
		}
	//*   5    9:aload_0         
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(Resources resources)
	//*   7   11:astore_0        
		{
			throw new RuntimeException(((Throwable) (resources)));
	//    8   12:new             #59  <Class RuntimeException>
	//    9   15:dup             
	//   10   16:aload_0         
	//   11   17:invokespecial   #62  <Method void RuntimeException(Throwable)>
	//   12   20:athrow          
		}
		return ((byte []) (resources));
	}

	public static byte[] loadImageBytes(Bitmap bitmap)
	{
		return loadImageBytes(bitmap, 100);
	//    0    0:aload_0         
	//    1    1:bipush          100
	//    2    3:invokestatic    #75  <Method byte[] loadImageBytes(Bitmap, int)>
	//    3    6:areturn         
	}

	public static byte[] loadImageBytes(Bitmap bitmap, int i)
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #77  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #78  <Method void ByteArrayOutputStream()>
	//    3    7:astore_2        
		bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i, ((java.io.OutputStream) (bytearrayoutputstream)));
	//    4    8:aload_0         
	//    5    9:getstatic       #84  <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.JPEG>
	//    6   12:iload_1         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #90  <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
	//    9   17:pop             
		return bytearrayoutputstream.toByteArray();
	//   10   18:aload_2         
	//   11   19:invokevirtual   #94  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   12   22:areturn         
	}

	public static byte[] loadImageBytes(BitmapDrawable bitmapdrawable)
	{
		return loadImageBytes(bitmapdrawable.getBitmap());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #101 <Method Bitmap BitmapDrawable.getBitmap()>
	//    2    4:invokestatic    #103 <Method byte[] loadImageBytes(Bitmap)>
	//    3    7:areturn         
	}
}
