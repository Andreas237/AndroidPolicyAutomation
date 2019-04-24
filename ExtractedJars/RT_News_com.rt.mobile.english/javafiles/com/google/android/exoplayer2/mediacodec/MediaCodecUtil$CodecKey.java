// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.mediacodec;

import android.text.TextUtils;

// Referenced classes of package com.google.android.exoplayer2.mediacodec:
//			MediaCodecUtil

private static final class MediaCodecUtil$CodecKey
{

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
	//*   6    8:ifnull          56
		{
			if(obj.getClass() != com/google/android/exoplayer2/mediacodec/MediaCodecUtil$CodecKey)
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #28  <Method Class Object.getClass()>
	//*   9   15:ldc1            #2   <Class MediaCodecUtil$CodecKey>
	//*  10   17:if_acmpeq       22
				return false;
	//   11   20:iconst_0        
	//   12   21:ireturn         
			obj = ((Object) ((MediaCodecUtil$CodecKey)obj));
	//   13   22:aload_1         
	//   14   23:checkcast       #2   <Class MediaCodecUtil$CodecKey>
	//   15   26:astore_1        
			return TextUtils.equals(((CharSequence) (mimeType)), ((CharSequence) (((MediaCodecUtil$CodecKey) (obj)).mimeType))) && secure == ((MediaCodecUtil$CodecKey) (obj)).secure;
	//   16   27:aload_0         
	//   17   28:getfield        #18  <Field String mimeType>
	//   18   31:aload_1         
	//   19   32:getfield        #18  <Field String mimeType>
	//   20   35:invokestatic    #33  <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   21   38:ifeq            54
	//   22   41:aload_0         
	//   23   42:getfield        #20  <Field boolean secure>
	//   24   45:aload_1         
	//   25   46:getfield        #20  <Field boolean secure>
	//   26   49:icmpne          54
	//   27   52:iconst_1        
	//   28   53:ireturn         
	//   29   54:iconst_0        
	//   30   55:ireturn         
		} else
		{
			return false;
	//   31   56:iconst_0        
	//   32   57:ireturn         
		}
	}

	public int hashCode()
	{
		int i;
		if(mimeType == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field String mimeType>
	//*   2    4:ifnonnull       12
			i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
		else
	//*   5    9:goto            20
			i = mimeType.hashCode();
	//    6   12:aload_0         
	//    7   13:getfield        #18  <Field String mimeType>
	//    8   16:invokevirtual   #40  <Method int String.hashCode()>
	//    9   19:istore_1        
		char c;
		if(secure)
	//*  10   20:aload_0         
	//*  11   21:getfield        #20  <Field boolean secure>
	//*  12   24:ifeq            34
			c = '\u04CF';
	//   13   27:sipush          1231
	//   14   30:istore_2        
		else
	//*  15   31:goto            38
			c = '\u04D5';
	//   16   34:sipush          1237
	//   17   37:istore_2        
		return 31 * (i + 31) + c;
	//   18   38:bipush          31
	//   19   40:iload_1         
	//   20   41:bipush          31
	//   21   43:iadd            
	//   22   44:imul            
	//   23   45:iload_2         
	//   24   46:iadd            
	//   25   47:ireturn         
	}

	public final String mimeType;
	public final boolean secure;

	public MediaCodecUtil$CodecKey(String s, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mimeType = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field String mimeType>
		secure = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #20  <Field boolean secure>
	//    8   14:return          
	}
}
