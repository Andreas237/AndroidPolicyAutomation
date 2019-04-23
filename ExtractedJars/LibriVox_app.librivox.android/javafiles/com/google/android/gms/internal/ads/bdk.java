// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class bdk
{

	public bdk(float f, float f1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		b = f;
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:putfield        #24  <Field float b>
		c = f1;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #26  <Field float c>
		d = Math.round(f * 1000F);
	//    8   14:aload_0         
	//    9   15:fload_1         
	//   10   16:ldc1            #27  <Float 1000F>
	//   11   18:fmul            
	//   12   19:invokestatic    #33  <Method int Math.round(float)>
	//   13   22:putfield        #35  <Field int d>
	//   14   25:return          
	}

	public final long a(long l)
	{
		return l * (long)d;
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field int d>
	//    3    5:i2l             
	//    4    6:lmul            
	//    5    7:lreturn         
	}

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          57
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #42  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #42  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((bdk)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class bdk>
	//   16   28:astore_1        
			return b == ((bdk) (obj)).b && c == ((bdk) (obj)).c;
	//   17   29:aload_0         
	//   18   30:getfield        #24  <Field float b>
	//   19   33:aload_1         
	//   20   34:getfield        #24  <Field float b>
	//   21   37:fcmpl           
	//   22   38:ifne            55
	//   23   41:aload_0         
	//   24   42:getfield        #26  <Field float c>
	//   25   45:aload_1         
	//   26   46:getfield        #26  <Field float c>
	//   27   49:fcmpl           
	//   28   50:ifne            55
	//   29   53:iconst_1        
	//   30   54:ireturn         
	//   31   55:iconst_0        
	//   32   56:ireturn         
		} else
		{
			return false;
	//   33   57:iconst_0        
	//   34   58:ireturn         
		}
	}

	public final int hashCode()
	{
		return (Float.floatToRawIntBits(b) + 527) * 31 + Float.floatToRawIntBits(c);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field float b>
	//    2    4:invokestatic    #49  <Method int Float.floatToRawIntBits(float)>
	//    3    7:sipush          527
	//    4   10:iadd            
	//    5   11:bipush          31
	//    6   13:imul            
	//    7   14:aload_0         
	//    8   15:getfield        #26  <Field float c>
	//    9   18:invokestatic    #49  <Method int Float.floatToRawIntBits(float)>
	//   10   21:iadd            
	//   11   22:ireturn         
	}

	public static final bdk a = new bdk(1.0F, 1.0F);
	public final float b;
	public final float c;
	private final int d;

	static 
	{
	//    0    0:new             #2   <Class bdk>
	//    1    3:dup             
	//    2    4:fconst_1        
	//    3    5:fconst_1        
	//    4    6:invokespecial   #17  <Method void bdk(float, float)>
	//    5    9:putstatic       #19  <Field bdk a>
	//*   6   12:return          
	}
}
