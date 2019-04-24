// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;


public final class GmsVersion
{

	private GmsVersion()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:return          
	}

	public static boolean isAtLeastFenacho(int i)
	{
		return i >= 0x30d400;
	//    0    0:iload_0         
	//    1    1:ldc1            #34  <Int 0x30d400>
	//    2    3:icmplt          8
	//    3    6:iconst_1        
	//    4    7:ireturn         
	//    5    8:iconst_0        
	//    6    9:ireturn         
	}

	public static final int VERSION_HALLOUMI = 0x3e8fa0;
	public static final int VERSION_JARLSBERG = 0x419ce0;
	public static final int VERSION_KENAFA = 0x432380;
	public static final int VERSION_LONGHORN = 0x4c4b40;
	public static final int VERSION_MANCHEGO = 0x5b8d80;
	public static final int VERSION_ORLA = 0x6acfc0;
	public static final int VERSION_PARMESAN = 0x6ddd00;
	public static final int VERSION_QUESO = 0x7270e0;
	public static final int VERSION_REBLOCHON = 0x7704c0;
	public static final int VERSION_SAGA = 0x7a1200;
}
