// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.getkeepsafe.relinker.elf;


// Referenced classes of package com.getkeepsafe.relinker.elf:
//			Elf

public static abstract class Elf$ProgramHeader
{

	public static final int PT_DYNAMIC = 2;
	public static final int PT_LOAD = 1;
	public long memsz;
	public long offset;
	public long type;
	public long vaddr;

	public Elf$ProgramHeader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}
}
