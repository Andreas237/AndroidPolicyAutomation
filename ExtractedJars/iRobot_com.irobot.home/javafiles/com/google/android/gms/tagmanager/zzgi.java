// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;


final class zzgi extends Number
	implements Comparable
{

	private zzgi(double d)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Number()>
		zzbgx = d;
	//    2    4:aload_0         
	//    3    5:dload_1         
	//    4    6:putfield        #20  <Field double zzbgx>
		zzbgz = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #22  <Field boolean zzbgz>
	//    8   14:return          
	}

	private zzgi(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Number()>
		zzbgy = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #26  <Field long zzbgy>
		zzbgz = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #22  <Field boolean zzbgz>
	//    8   14:return          
	}

	public static zzgi zza(Double double1)
	{
		return new zzgi(double1.doubleValue());
	//    0    0:new             #2   <Class zzgi>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #34  <Method double Double.doubleValue()>
	//    4    8:invokespecial   #36  <Method void zzgi(double)>
	//    5   11:areturn         
	}

	public static zzgi zzaq(long l)
	{
		return new zzgi(l);
	//    0    0:new             #2   <Class zzgi>
	//    1    3:dup             
	//    2    4:lload_0         
	//    3    5:invokespecial   #40  <Method void zzgi(long)>
	//    4    8:areturn         
	}

	public static zzgi zzee(String s)
	{
		NumberFormatException numberformatexception;
		zzgi zzgi1;
		try
		{
			zzgi1 = new zzgi(Long.parseLong(s));
	//    0    0:new             #2   <Class zzgi>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #50  <Method long Long.parseLong(String)>
	//    4    8:invokespecial   #40  <Method void zzgi(long)>
	//    5   11:astore_1        
		}
	//*   6   12:aload_1         
	//*   7   13:areturn         
	//*   8   14:new             #2   <Class zzgi>
	//*   9   17:dup             
	//*  10   18:aload_0         
	//*  11   19:invokestatic    #54  <Method double Double.parseDouble(String)>
	//*  12   22:invokespecial   #36  <Method void zzgi(double)>
	//*  13   25:astore_1        
	//*  14   26:aload_1         
	//*  15   27:areturn         
	//*  16   28:new             #44  <Class NumberFormatException>
	//*  17   31:dup             
	//*  18   32:aload_0         
	//*  19   33:invokestatic    #60  <Method String String.valueOf(Object)>
	//*  20   36:ldc1            #62  <String " is not a valid TypedNumber">
	//*  21   38:invokevirtual   #66  <Method String String.concat(String)>
	//*  22   41:invokespecial   #69  <Method void NumberFormatException(String)>
	//*  23   44:athrow          
		// Misplaced declaration of an exception variable
		catch(NumberFormatException numberformatexception)
		{
			try
			{
				zzgi1 = new zzgi(Double.parseDouble(s));
			}
	//*  24   45:astore_1        
	//*  25   46:goto            14
			// Misplaced declaration of an exception variable
			catch(NumberFormatException numberformatexception)
			{
				throw new NumberFormatException(String.valueOf(((Object) (s))).concat(" is not a valid TypedNumber"));
			}
			return zzgi1;
		}
		return zzgi1;
	//*  26   49:astore_1        
	//*  27   50:goto            28
	}

	public final byte byteValue()
	{
		return (byte)(int)longValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method long longValue()>
	//    2    4:l2i             
	//    3    5:int2byte        
	//    4    6:ireturn         
	}

	public final int compareTo(Object obj)
	{
		return zza((zzgi)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class zzgi>
	//    3    5:invokevirtual   #80  <Method int zza(zzgi)>
	//    4    8:ireturn         
	}

	public final double doubleValue()
	{
		if(zzbgz)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field boolean zzbgz>
	//*   2    4:ifeq            13
			return (double)zzbgy;
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field long zzbgy>
	//    5   11:l2d             
	//    6   12:dreturn         
		else
			return zzbgx;
	//    7   13:aload_0         
	//    8   14:getfield        #20  <Field double zzbgx>
	//    9   17:dreturn         
	}

	public final boolean equals(Object obj)
	{
		return (obj instanceof zzgi) && zza((zzgi)obj) == 0;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class zzgi>
	//    2    4:ifeq            20
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #2   <Class zzgi>
	//    6   12:invokevirtual   #80  <Method int zza(zzgi)>
	//    7   15:ifne            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public final float floatValue()
	{
		return (float)doubleValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #85  <Method double doubleValue()>
	//    2    4:d2f             
	//    3    5:freturn         
	}

	public final int hashCode()
	{
		return (new Long(longValue())).hashCode();
	//    0    0:new             #46  <Class Long>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #75  <Method long longValue()>
	//    4    8:invokespecial   #88  <Method void Long(long)>
	//    5   11:invokevirtual   #90  <Method int Long.hashCode()>
	//    6   14:ireturn         
	}

	public final int intValue()
	{
		return (int)longValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method long longValue()>
	//    2    4:l2i             
	//    3    5:ireturn         
	}

	public final long longValue()
	{
		if(zzbgz)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field boolean zzbgz>
	//*   2    4:ifeq            12
			return zzbgy;
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field long zzbgy>
	//    5   11:lreturn         
		else
			return (long)zzbgx;
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field double zzbgx>
	//    8   16:d2l             
	//    9   17:lreturn         
	}

	public final short shortValue()
	{
		return (short)(int)longValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method long longValue()>
	//    2    4:l2i             
	//    3    5:int2short       
	//    4    6:ireturn         
	}

	public final String toString()
	{
		if(zzbgz)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field boolean zzbgz>
	//*   2    4:ifeq            15
			return Long.toString(zzbgy);
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field long zzbgy>
	//    5   11:invokestatic    #98  <Method String Long.toString(long)>
	//    6   14:areturn         
		else
			return Double.toString(zzbgx);
	//    7   15:aload_0         
	//    8   16:getfield        #20  <Field double zzbgx>
	//    9   19:invokestatic    #101 <Method String Double.toString(double)>
	//   10   22:areturn         
	}

	public final int zza(zzgi zzgi1)
	{
		if(zzbgz && zzgi1.zzbgz)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field boolean zzbgz>
	//*   2    4:ifeq            36
	//*   3    7:aload_1         
	//*   4    8:getfield        #22  <Field boolean zzbgz>
	//*   5   11:ifeq            36
			return (new Long(zzbgy)).compareTo(Long.valueOf(zzgi1.zzbgy));
	//    6   14:new             #46  <Class Long>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:getfield        #26  <Field long zzbgy>
	//   10   22:invokespecial   #88  <Method void Long(long)>
	//   11   25:aload_1         
	//   12   26:getfield        #26  <Field long zzbgy>
	//   13   29:invokestatic    #104 <Method Long Long.valueOf(long)>
	//   14   32:invokevirtual   #107 <Method int Long.compareTo(Long)>
	//   15   35:ireturn         
		else
			return Double.compare(doubleValue(), zzgi1.doubleValue());
	//   16   36:aload_0         
	//   17   37:invokevirtual   #85  <Method double doubleValue()>
	//   18   40:aload_1         
	//   19   41:invokevirtual   #85  <Method double doubleValue()>
	//   20   44:invokestatic    #111 <Method int Double.compare(double, double)>
	//   21   47:ireturn         
	}

	public final boolean zzqi()
	{
		return !zzbgz;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field boolean zzbgz>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final boolean zzqj()
	{
		return zzbgz;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field boolean zzbgz>
	//    2    4:ireturn         
	}

	private double zzbgx;
	private long zzbgy;
	private boolean zzbgz;
}
