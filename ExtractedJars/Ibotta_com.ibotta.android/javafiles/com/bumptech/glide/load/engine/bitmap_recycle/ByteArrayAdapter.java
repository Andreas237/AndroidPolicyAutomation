// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;


// Referenced classes of package com.bumptech.glide.load.engine.bitmap_recycle:
//			ArrayAdapterInterface

public final class ByteArrayAdapter
	implements ArrayAdapterInterface
{

	public ByteArrayAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public volatile int getArrayLength(Object obj)
	{
		return getArrayLength((byte[])obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #16  <Class byte[]>
	//    3    5:invokevirtual   #19  <Method int getArrayLength(byte[])>
	//    4    8:ireturn         
	}

	public int getArrayLength(byte abyte0[])
	{
		return abyte0.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:ireturn         
	}

	public int getElementSizeInBytes()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public String getTag()
	{
		return "ByteArrayPool";
	//    0    0:ldc1            #25  <String "ByteArrayPool">
	//    1    2:areturn         
	}

	public volatile Object newArray(int i)
	{
		return ((Object) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #30  <Method byte[] newArray(int)>
	//    3    5:areturn         
	}

	public byte[] newArray(int i)
	{
		return new byte[i];
	//    0    0:iload_1         
	//    1    1:newarray        byte[]
	//    2    3:areturn         
	}
}
