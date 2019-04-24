// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.gif;

import com.bumptech.glide.load.Key;
import java.security.MessageDigest;
import java.util.UUID;

// Referenced classes of package com.bumptech.glide.load.resource.gif:
//			GifFrameLoader

static class GifFrameLoader$FrameSignature
	implements Key
{

	public boolean equals(Object obj)
	{
		if(obj instanceof GifFrameLoader$FrameSignature)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class GifFrameLoader$FrameSignature>
	//*   2    4:ifeq            22
			return ((GifFrameLoader$FrameSignature)obj).uuid.equals(((Object) (uuid)));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class GifFrameLoader$FrameSignature>
	//    5   11:getfield        #27  <Field UUID uuid>
	//    6   14:aload_0         
	//    7   15:getfield        #27  <Field UUID uuid>
	//    8   18:invokevirtual   #31  <Method boolean UUID.equals(Object)>
	//    9   21:ireturn         
		else
			return false;
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public int hashCode()
	{
		return uuid.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field UUID uuid>
	//    2    4:invokevirtual   #35  <Method int UUID.hashCode()>
	//    3    7:ireturn         
	}

	public void updateDiskCacheKey(MessageDigest messagedigest)
	{
		throw new UnsupportedOperationException("Not implemented");
	//    0    0:new             #39  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #41  <String "Not implemented">
	//    3    6:invokespecial   #44  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	private final UUID uuid;

	public GifFrameLoader$FrameSignature()
	{
		this(UUID.randomUUID());
	//    0    0:aload_0         
	//    1    1:invokestatic    #19  <Method UUID UUID.randomUUID()>
	//    2    4:invokespecial   #22  <Method void GifFrameLoader$FrameSignature(UUID)>
	//    3    7:return          
	}

	GifFrameLoader$FrameSignature(UUID uuid1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		uuid = uuid1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field UUID uuid>
	//    5    9:return          
	}
}
