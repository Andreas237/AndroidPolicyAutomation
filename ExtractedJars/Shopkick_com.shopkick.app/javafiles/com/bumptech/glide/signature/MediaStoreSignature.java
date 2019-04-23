// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.signature;

import com.bumptech.glide.load.Key;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public class MediaStoreSignature
	implements Key
{

	public MediaStoreSignature(String s, long l, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		String s1 = s;
	//    2    4:aload_1         
	//    3    5:astore          5
		if(s == null)
	//*   4    7:aload_1         
	//*   5    8:ifnonnull       15
			s1 = "";
	//    6   11:ldc1            #21  <String "">
	//    7   13:astore          5
		mimeType = s1;
	//    8   15:aload_0         
	//    9   16:aload           5
	//   10   18:putfield        #23  <Field String mimeType>
		dateModified = l;
	//   11   21:aload_0         
	//   12   22:lload_2         
	//   13   23:putfield        #25  <Field long dateModified>
		orientation = i;
	//   14   26:aload_0         
	//   15   27:iload           4
	//   16   29:putfield        #27  <Field int orientation>
	//   17   32:return          
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
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          74
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #35  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #35  <Method Class Object.getClass()>
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
	//*  18   30:getfield        #25  <Field long dateModified>
	//*  19   33:aload_1         
	//*  20   34:getfield        #25  <Field long dateModified>
	//*  21   37:lcmp            
	//*  22   38:ifeq            43
				return false;
	//   23   41:iconst_0        
	//   24   42:ireturn         
			if(orientation != ((MediaStoreSignature) (obj)).orientation)
	//*  25   43:aload_0         
	//*  26   44:getfield        #27  <Field int orientation>
	//*  27   47:aload_1         
	//*  28   48:getfield        #27  <Field int orientation>
	//*  29   51:icmpeq          56
				return false;
	//   30   54:iconst_0        
	//   31   55:ireturn         
			return mimeType.equals(((Object) (((MediaStoreSignature) (obj)).mimeType)));
	//   32   56:aload_0         
	//   33   57:getfield        #23  <Field String mimeType>
	//   34   60:aload_1         
	//   35   61:getfield        #23  <Field String mimeType>
	//   36   64:invokevirtual   #39  <Method boolean String.equals(Object)>
	//   37   67:ifne            72
	//   38   70:iconst_0        
	//   39   71:ireturn         
	//   40   72:iconst_1        
	//   41   73:ireturn         
		} else
		{
			return false;
	//   42   74:iconst_0        
	//   43   75:ireturn         
		}
	}

	public int hashCode()
	{
		int i = mimeType.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String mimeType>
	//    2    4:invokevirtual   #43  <Method int String.hashCode()>
	//    3    7:istore_1        
		long l = dateModified;
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field long dateModified>
	//    6   12:lstore_2        
		return (i * 31 + (int)(l ^ l >>> 32)) * 31 + orientation;
	//    7   13:iload_1         
	//    8   14:bipush          31
	//    9   16:imul            
	//   10   17:lload_2         
	//   11   18:lload_2         
	//   12   19:bipush          32
	//   13   21:lushr           
	//   14   22:lxor            
	//   15   23:l2i             
	//   16   24:iadd            
	//   17   25:bipush          31
	//   18   27:imul            
	//   19   28:aload_0         
	//   20   29:getfield        #27  <Field int orientation>
	//   21   32:iadd            
	//   22   33:ireturn         
	}

	public void updateDiskCacheKey(MessageDigest messagedigest)
	{
		messagedigest.update(ByteBuffer.allocate(12).putLong(dateModified).putInt(orientation).array());
	//    0    0:aload_1         
	//    1    1:bipush          12
	//    2    3:invokestatic    #51  <Method ByteBuffer ByteBuffer.allocate(int)>
	//    3    6:aload_0         
	//    4    7:getfield        #25  <Field long dateModified>
	//    5   10:invokevirtual   #55  <Method ByteBuffer ByteBuffer.putLong(long)>
	//    6   13:aload_0         
	//    7   14:getfield        #27  <Field int orientation>
	//    8   17:invokevirtual   #58  <Method ByteBuffer ByteBuffer.putInt(int)>
	//    9   20:invokevirtual   #62  <Method byte[] ByteBuffer.array()>
	//   10   23:invokevirtual   #68  <Method void MessageDigest.update(byte[])>
		messagedigest.update(mimeType.getBytes(CHARSET));
	//   11   26:aload_1         
	//   12   27:aload_0         
	//   13   28:getfield        #23  <Field String mimeType>
	//   14   31:getstatic       #72  <Field java.nio.charset.Charset CHARSET>
	//   15   34:invokevirtual   #76  <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//   16   37:invokevirtual   #68  <Method void MessageDigest.update(byte[])>
	//   17   40:return          
	}

	private final long dateModified;
	private final String mimeType;
	private final int orientation;
}
