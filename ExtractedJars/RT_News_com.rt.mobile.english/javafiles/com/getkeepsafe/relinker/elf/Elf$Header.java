// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.getkeepsafe.relinker.elf;

import java.io.IOException;

// Referenced classes of package com.getkeepsafe.relinker.elf:
//			Elf

public static abstract class Elf$Header
{

	public abstract Structure getDynamicStructure(long l, int i)
		throws IOException;

	public abstract Header getProgramHeader(long l)
		throws IOException;

	public abstract Header getSectionHeader(int i)
		throws IOException;

	public static final int ELFCLASS32 = 1;
	public static final int ELFCLASS64 = 2;
	public static final int ELFDATA2MSB = 2;
	public boolean bigEndian;
	public int phentsize;
	public int phnum;
	public long phoff;
	public int shentsize;
	public int shnum;
	public long shoff;
	public int shstrndx;
	public int type;

	public Elf$Header()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:return          
	}
}
