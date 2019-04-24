// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.utils;


public final class FSize
{

	public FSize(float f, float f1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		width = f;
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:putfield        #14  <Field float width>
		height = f1;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #16  <Field float height>
	//    8   14:return          
	}

	public boolean equals(Object obj)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		if(obj != null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       8
	//*   4    6:iconst_0        
	//*   5    7:ireturn         
		{
			if(this == obj)
	//*   6    8:aload_0         
	//*   7    9:aload_1         
	//*   8   10:if_acmpne       15
				return true;
	//    9   13:iconst_1        
	//   10   14:ireturn         
			if(obj instanceof FSize)
	//*  11   15:aload_1         
	//*  12   16:instanceof      #2   <Class FSize>
	//*  13   19:ifeq            6
			{
				obj = ((Object) ((FSize)obj));
	//   14   22:aload_1         
	//   15   23:checkcast       #2   <Class FSize>
	//   16   26:astore_1        
				if(width != ((FSize) (obj)).width || height != ((FSize) (obj)).height)
	//*  17   27:aload_0         
	//*  18   28:getfield        #14  <Field float width>
	//*  19   31:aload_1         
	//*  20   32:getfield        #14  <Field float width>
	//*  21   35:fcmpl           
	//*  22   36:ifne            53
	//*  23   39:aload_0         
	//*  24   40:getfield        #16  <Field float height>
	//*  25   43:aload_1         
	//*  26   44:getfield        #16  <Field float height>
	//*  27   47:fcmpl           
	//*  28   48:ifne            53
	//*  29   51:iload_2         
	//*  30   52:ireturn         
					flag = false;
	//   31   53:iconst_0        
	//   32   54:istore_2        
				return flag;
			}
		}
		return false;
	//*  33   55:goto            51
	}

	public int hashCode()
	{
		return Float.floatToIntBits(width) ^ Float.floatToIntBits(height);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field float width>
	//    2    4:invokestatic    #27  <Method int Float.floatToIntBits(float)>
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field float height>
	//    5   11:invokestatic    #27  <Method int Float.floatToIntBits(float)>
	//    6   14:ixor            
	//    7   15:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append(width).append("x").append(height).toString();
	//    0    0:new             #31  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field float width>
	//    5   11:invokevirtual   #36  <Method StringBuilder StringBuilder.append(float)>
	//    6   14:ldc1            #38  <String "x">
	//    7   16:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:aload_0         
	//    9   20:getfield        #16  <Field float height>
	//   10   23:invokevirtual   #36  <Method StringBuilder StringBuilder.append(float)>
	//   11   26:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   12   29:areturn         
	}

	public final float height;
	public final float width;
}
