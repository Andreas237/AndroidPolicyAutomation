// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import android.graphics.Color;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			DOM

private static class DOM$RGBAColor
{

	public int getColor()
	{
		Double double1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Double a>
	//    2    4:astore          4
		byte byte0 = -1;
	//    3    6:iconst_m1       
	//    4    7:istore_1        
		if(double1 != null)
	//*   5    8:aload           4
	//*   6   10:ifnonnull       16
	//*   7   13:goto            55
		{
			long l = Math.round(double1.doubleValue() * 255D);
	//    8   16:aload           4
	//    9   18:invokevirtual   #31  <Method double Double.doubleValue()>
	//   10   21:ldc2w           #32  <Double 255D>
	//   11   24:dmul            
	//   12   25:invokestatic    #39  <Method long Math.round(double)>
	//   13   28:lstore_2        
			if(l < 0L)
	//*  14   29:lload_2         
	//*  15   30:lconst_0        
	//*  16   31:lcmp            
	//*  17   32:ifge            40
				byte0 = 0;
	//   18   35:iconst_0        
	//   19   36:istore_1        
			else
	//*  20   37:goto            55
			if(l < 255L)
	//*  21   40:lload_2         
	//*  22   41:ldc2w           #40  <Long 255L>
	//*  23   44:lcmp            
	//*  24   45:iflt            51
	//*  25   48:goto            55
				byte0 = (byte)(int)l;
	//   26   51:lload_2         
	//   27   52:l2i             
	//   28   53:int2byte        
	//   29   54:istore_1        
		}
		return Color.argb(((int) (byte0)), r, g, b);
	//   30   55:iload_1         
	//   31   56:aload_0         
	//   32   57:getfield        #43  <Field int r>
	//   33   60:aload_0         
	//   34   61:getfield        #45  <Field int g>
	//   35   64:aload_0         
	//   36   65:getfield        #47  <Field int b>
	//   37   68:invokestatic    #53  <Method int Color.argb(int, int, int, int)>
	//   38   71:ireturn         
	}

	public Double a;
	public int b;
	public int g;
	public int r;

	private DOM$RGBAColor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}
}
