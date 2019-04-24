// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.signature;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public class MediaStoreSignature
	implements Key
{

	public MediaStoreSignature(String s, long l, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mimeType = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field String mimeType>
		dateModified = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #21  <Field long dateModified>
		orientation = i;
	//    8   14:aload_0         
	//    9   15:iload           4
	//   10   17:putfield        #23  <Field int orientation>
	//   11   20:return          
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null || ((Object)this).getClass() != obj.getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          22
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #30  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #30  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		obj = ((Object) ((MediaStoreSignature)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class MediaStoreSignature>
	//   16   28:astore_1        
		if(dateModified != ((MediaStoreSignature) (obj)).dateModified)
	//*  17   29:aload_0         
	//*  18   30:getfield        #21  <Field long dateModified>
	//*  19   33:aload_1         
	//*  20   34:getfield        #21  <Field long dateModified>
	//*  21   37:lcmp            
	//*  22   38:ifeq            43
			return false;
	//   23   41:iconst_0        
	//   24   42:ireturn         
		if(orientation != ((MediaStoreSignature) (obj)).orientation)
	//*  25   43:aload_0         
	//*  26   44:getfield        #23  <Field int orientation>
	//*  27   47:aload_1         
	//*  28   48:getfield        #23  <Field int orientation>
	//*  29   51:icmpeq          56
			return false;
	//   30   54:iconst_0        
	//   31   55:ireturn         
		return Util.bothNullOrEqual(((Object) (mimeType)), ((Object) (((MediaStoreSignature) (obj)).mimeType)));
	//   32   56:aload_0         
	//   33   57:getfield        #19  <Field String mimeType>
	//   34   60:aload_1         
	//   35   61:getfield        #19  <Field String mimeType>
	//   36   64:invokestatic    #36  <Method boolean Util.bothNullOrEqual(Object, Object)>
	//   37   67:ifne            72
	//   38   70:iconst_0        
	//   39   71:ireturn         
	//   40   72:iconst_1        
	//   41   73:ireturn         
	}

	public int hashCode()
	{
		int i;
		if(mimeType != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field String mimeType>
	//*   2    4:ifnull          18
			i = mimeType.hashCode();
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field String mimeType>
	//    5   11:invokevirtual   #42  <Method int String.hashCode()>
	//    6   14:istore_1        
		else
	//*   7   15:goto            20
			i = 0;
	//    8   18:iconst_0        
	//    9   19:istore_1        
		return (i * 31 + (int)(dateModified ^ dateModified >>> 32)) * 31 + orientation;
	//   10   20:iload_1         
	//   11   21:bipush          31
	//   12   23:imul            
	//   13   24:aload_0         
	//   14   25:getfield        #21  <Field long dateModified>
	//   15   28:aload_0         
	//   16   29:getfield        #21  <Field long dateModified>
	//   17   32:bipush          32
	//   18   34:lushr           
	//   19   35:lxor            
	//   20   36:l2i             
	//   21   37:iadd            
	//   22   38:bipush          31
	//   23   40:imul            
	//   24   41:aload_0         
	//   25   42:getfield        #23  <Field int orientation>
	//   26   45:iadd            
	//   27   46:ireturn         
	}

	public void updateDiskCacheKey(MessageDigest messagedigest)
	{
		messagedigest.update(ByteBuffer.allocate(12).putLong(dateModified).putInt(orientation).array());
	//    0    0:aload_1         
	//    1    1:bipush          12
	//    2    3:invokestatic    #50  <Method ByteBuffer ByteBuffer.allocate(int)>
	//    3    6:aload_0         
	//    4    7:getfield        #21  <Field long dateModified>
	//    5   10:invokevirtual   #54  <Method ByteBuffer ByteBuffer.putLong(long)>
	//    6   13:aload_0         
	//    7   14:getfield        #23  <Field int orientation>
	//    8   17:invokevirtual   #57  <Method ByteBuffer ByteBuffer.putInt(int)>
	//    9   20:invokevirtual   #61  <Method byte[] ByteBuffer.array()>
	//   10   23:invokevirtual   #67  <Method void MessageDigest.update(byte[])>
		messagedigest.update(mimeType.getBytes(CHARSET));
	//   11   26:aload_1         
	//   12   27:aload_0         
	//   13   28:getfield        #19  <Field String mimeType>
	//   14   31:getstatic       #71  <Field java.nio.charset.Charset CHARSET>
	//   15   34:invokevirtual   #75  <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//   16   37:invokevirtual   #67  <Method void MessageDigest.update(byte[])>
	//   17   40:return          
	}

	private final long dateModified;
	private final String mimeType;
	private final int orientation;
}
