// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class zzgy
{

	zzgy(long l, String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		value = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #17  <Field long value>
		zzajf = s;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #19  <Field String zzajf>
		zzajg = i;
	//    8   14:aload_0         
	//    9   15:iload           4
	//   10   17:putfield        #21  <Field int zzajg>
	//   11   20:return          
	}

	public final boolean equals(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          43
		{
			if(!(obj instanceof zzgy))
	//*   2    4:aload_1         
	//*   3    5:instanceof      #2   <Class zzgy>
	//*   4    8:ifne            13
				return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
			obj = ((Object) ((zzgy)obj));
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class zzgy>
	//    9   17:astore_1        
			if(((zzgy) (obj)).value == value && ((zzgy) (obj)).zzajg == zzajg)
	//*  10   18:aload_1         
	//*  11   19:getfield        #17  <Field long value>
	//*  12   22:aload_0         
	//*  13   23:getfield        #17  <Field long value>
	//*  14   26:lcmp            
	//*  15   27:ifne            43
	//*  16   30:aload_1         
	//*  17   31:getfield        #21  <Field int zzajg>
	//*  18   34:aload_0         
	//*  19   35:getfield        #21  <Field int zzajg>
	//*  20   38:icmpne          43
				return true;
	//   21   41:iconst_1        
	//   22   42:ireturn         
		}
		return false;
	//   23   43:iconst_0        
	//   24   44:ireturn         
	}

	public final int hashCode()
	{
		return (int)value;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field long value>
	//    2    4:l2i             
	//    3    5:ireturn         
	}

	final long value;
	final String zzajf;
	final int zzajg;
}
