// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.decoder;


public abstract class Buffer
{

	public Buffer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final void addFlag(int i)
	{
		flags = i | flags;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #15  <Field int flags>
	//    4    6:ior             
	//    5    7:putfield        #15  <Field int flags>
	//    6   10:return          
	}

	public void clear()
	{
		flags = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #15  <Field int flags>
	//    3    5:return          
	}

	public final void clearFlag(int i)
	{
		flags = ~i & flags;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_m1       
	//    3    3:ixor            
	//    4    4:aload_0         
	//    5    5:getfield        #15  <Field int flags>
	//    6    8:iand            
	//    7    9:putfield        #15  <Field int flags>
	//    8   12:return          
	}

	protected final boolean getFlag(int i)
	{
		return (flags & i) == i;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field int flags>
	//    2    4:iload_1         
	//    3    5:iand            
	//    4    6:iload_1         
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public final boolean isDecodeOnly()
	{
		return getFlag(0x80000000);
	//    0    0:aload_0         
	//    1    1:ldc1            #22  <Int 0x80000000>
	//    2    3:invokevirtual   #24  <Method boolean getFlag(int)>
	//    3    6:ireturn         
	}

	public final boolean isEndOfStream()
	{
		return getFlag(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokevirtual   #24  <Method boolean getFlag(int)>
	//    3    5:ireturn         
	}

	public final boolean isKeyFrame()
	{
		return getFlag(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #24  <Method boolean getFlag(int)>
	//    3    5:ireturn         
	}

	public final void setFlags(int i)
	{
		flags = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #15  <Field int flags>
	//    3    5:return          
	}

	private int flags;
}
