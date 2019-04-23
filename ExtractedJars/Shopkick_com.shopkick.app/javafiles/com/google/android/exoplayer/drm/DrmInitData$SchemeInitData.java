// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.drm;

import com.google.android.exoplayer.util.Assertions;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer.drm:
//			DrmInitData

public static final class DrmInitData$SchemeInitData
{

	public boolean equals(Object obj)
	{
		if(!(obj instanceof DrmInitData$SchemeInitData))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class DrmInitData$SchemeInitData>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(obj == this)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:if_acmpne       16
			return true;
	//    8   14:iconst_1        
	//    9   15:ireturn         
		obj = ((Object) ((DrmInitData$SchemeInitData)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class DrmInitData$SchemeInitData>
	//   12   20:astore_1        
		return mimeType.equals(((Object) (((DrmInitData$SchemeInitData) (obj)).mimeType))) && Arrays.equals(data, ((DrmInitData$SchemeInitData) (obj)).data);
	//   13   21:aload_0         
	//   14   22:getfield        #26  <Field String mimeType>
	//   15   25:aload_1         
	//   16   26:getfield        #26  <Field String mimeType>
	//   17   29:invokevirtual   #34  <Method boolean String.equals(Object)>
	//   18   32:ifeq            51
	//   19   35:aload_0         
	//   20   36:getfield        #29  <Field byte[] data>
	//   21   39:aload_1         
	//   22   40:getfield        #29  <Field byte[] data>
	//   23   43:invokestatic    #39  <Method boolean Arrays.equals(byte[], byte[])>
	//   24   46:ifeq            51
	//   25   49:iconst_1        
	//   26   50:ireturn         
	//   27   51:iconst_0        
	//   28   52:ireturn         
	}

	public int hashCode()
	{
		return mimeType.hashCode() + Arrays.hashCode(data) * 31;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String mimeType>
	//    2    4:invokevirtual   #43  <Method int String.hashCode()>
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field byte[] data>
	//    5   11:invokestatic    #46  <Method int Arrays.hashCode(byte[])>
	//    6   14:bipush          31
	//    7   16:imul            
	//    8   17:iadd            
	//    9   18:ireturn         
	}

	public final byte data[];
	public final String mimeType;

	public DrmInitData$SchemeInitData(String s, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mimeType = (String)Assertions.checkNotNull(((Object) (s)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #22  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:checkcast       #24  <Class String>
	//    6   12:putfield        #26  <Field String mimeType>
		data = (byte[])Assertions.checkNotNull(((Object) (abyte0)));
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokestatic    #22  <Method Object Assertions.checkNotNull(Object)>
	//   10   20:checkcast       #27  <Class byte[]>
	//   11   23:putfield        #29  <Field byte[] data>
	//   12   26:return          
	}
}
