// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;


// Referenced classes of package com.bumptech.glide.load.engine.bitmap_recycle:
//			ArrayAdapterInterface

public final class IntegerArrayAdapter
	implements ArrayAdapterInterface
{

	public IntegerArrayAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public volatile int getArrayLength(Object obj)
	{
		return getArrayLength((int[])obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #20  <Class int[]>
	//    3    5:invokevirtual   #23  <Method int getArrayLength(int[])>
	//    4    8:ireturn         
	}

	public int getArrayLength(int ai[])
	{
		return ai.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:ireturn         
	}

	public int getElementSizeInBytes()
	{
		return 4;
	//    0    0:iconst_4        
	//    1    1:ireturn         
	}

	public String getTag()
	{
		return "IntegerArrayPool";
	//    0    0:ldc1            #11  <String "IntegerArrayPool">
	//    1    2:areturn         
	}

	public volatile Object newArray(int i)
	{
		return ((Object) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #32  <Method int[] newArray(int)>
	//    3    5:areturn         
	}

	public int[] newArray(int i)
	{
		return new int[i];
	//    0    0:iload_1         
	//    1    1:newarray        int[]
	//    2    3:areturn         
	}

	private static final String TAG = "IntegerArrayPool";
}
