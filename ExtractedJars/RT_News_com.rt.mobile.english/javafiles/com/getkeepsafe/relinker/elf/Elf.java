// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.getkeepsafe.relinker.elf;

import java.io.IOException;

public interface Elf
{
	public static abstract class DynamicStructure
	{

		public static final int DT_NEEDED = 1;
		public static final int DT_NULL = 0;
		public static final int DT_STRTAB = 5;
		public long tag;
		public long val;

		public DynamicStructure()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
		//    2    4:return          
		}
	}

	public static abstract class Header
	{

		public abstract DynamicStructure getDynamicStructure(long l, int i)
			throws IOException;

		public abstract ProgramHeader getProgramHeader(long l)
			throws IOException;

		public abstract SectionHeader getSectionHeader(int i)
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

		public Header()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
		//    2    4:return          
		}
	}

	public static abstract class ProgramHeader
	{

		public static final int PT_DYNAMIC = 2;
		public static final int PT_LOAD = 1;
		public long memsz;
		public long offset;
		public long type;
		public long vaddr;

		public ProgramHeader()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
		//    2    4:return          
		}
	}

	public static abstract class SectionHeader
	{

		public long info;

		public SectionHeader()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

}
