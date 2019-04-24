// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom.misc;


public final class HashCode
{

	public HashCode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		hashCode = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #14  <Field int hashCode>
	//    5    9:return          
	}

	public static int combine(int i, double d)
	{
		return combine(i, Double.doubleToLongBits(d));
	//    0    0:iload_0         
	//    1    1:dload_1         
	//    2    2:invokestatic    #23  <Method long Double.doubleToLongBits(double)>
	//    3    5:invokestatic    #26  <Method int combine(int, long)>
	//    4    8:ireturn         
	}

	public static int combine(int i, float f)
	{
		return combine(i, Float.floatToIntBits(f));
	//    0    0:iload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #33  <Method int Float.floatToIntBits(float)>
	//    3    5:invokestatic    #36  <Method int combine(int, int)>
	//    4    8:ireturn         
	}

	public static int combine(int i, int j)
	{
		return i * 31 + j;
	//    0    0:iload_0         
	//    1    1:bipush          31
	//    2    3:imul            
	//    3    4:iload_1         
	//    4    5:iadd            
	//    5    6:ireturn         
	}

	public static int combine(int i, long l)
	{
		return combine(i, (int)(l >>> 32 ^ l));
	//    0    0:iload_0         
	//    1    1:lload_1         
	//    2    2:bipush          32
	//    3    4:lushr           
	//    4    5:lload_1         
	//    5    6:lxor            
	//    6    7:l2i             
	//    7    8:invokestatic    #36  <Method int combine(int, int)>
	//    8   11:ireturn         
	}

	public static int combine(int i, Object obj)
	{
		return combine(i, obj.hashCode());
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #40  <Method int Object.hashCode()>
	//    3    5:invokestatic    #36  <Method int combine(int, int)>
	//    4    8:ireturn         
	}

	public static int combine(int i, boolean flag)
	{
		char c;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            14
			c = '\u04CF';
	//    2    4:sipush          1231
	//    3    7:istore_2        
		else
	//*   4    8:iload_0         
	//*   5    9:iload_2         
	//*   6   10:invokestatic    #36  <Method int combine(int, int)>
	//*   7   13:ireturn         
			c = '\u04D5';
	//    8   14:sipush          1237
	//    9   17:istore_2        
		return combine(i, ((int) (c)));
	//*  10   18:goto            8
	}

	public final HashCode append(double d)
	{
		hashCode = combine(hashCode, d);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #14  <Field int hashCode>
	//    3    5:dload_1         
	//    4    6:invokestatic    #45  <Method int combine(int, double)>
	//    5    9:putfield        #14  <Field int hashCode>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public final HashCode append(float f)
	{
		hashCode = combine(hashCode, f);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #14  <Field int hashCode>
	//    3    5:fload_1         
	//    4    6:invokestatic    #48  <Method int combine(int, float)>
	//    5    9:putfield        #14  <Field int hashCode>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public final HashCode append(int i)
	{
		hashCode = combine(hashCode, i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #14  <Field int hashCode>
	//    3    5:iload_1         
	//    4    6:invokestatic    #36  <Method int combine(int, int)>
	//    5    9:putfield        #14  <Field int hashCode>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public final HashCode append(long l)
	{
		hashCode = combine(hashCode, l);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #14  <Field int hashCode>
	//    3    5:lload_1         
	//    4    6:invokestatic    #26  <Method int combine(int, long)>
	//    5    9:putfield        #14  <Field int hashCode>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public final HashCode append(Object obj)
	{
		hashCode = combine(hashCode, obj);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #14  <Field int hashCode>
	//    3    5:aload_1         
	//    4    6:invokestatic    #53  <Method int combine(int, Object)>
	//    5    9:putfield        #14  <Field int hashCode>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public final HashCode append(boolean flag)
	{
		hashCode = combine(hashCode, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #14  <Field int hashCode>
	//    3    5:iload_1         
	//    4    6:invokestatic    #56  <Method int combine(int, boolean)>
	//    5    9:putfield        #14  <Field int hashCode>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public final int hashCode()
	{
		return hashCode;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field int hashCode>
	//    2    4:ireturn         
	}

	public static final int EMPTY_HASH_CODE = 1;
	private int hashCode;
}
