// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.getkeepsafe.relinker.elf;


// Referenced classes of package com.getkeepsafe.relinker.elf:
//			Elf

public static abstract class Elf$DynamicStructure
{

	public static final int DT_NEEDED = 1;
	public static final int DT_NULL = 0;
	public static final int DT_STRTAB = 5;
	public long tag;
	public long val;

	public Elf$DynamicStructure()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}
}
