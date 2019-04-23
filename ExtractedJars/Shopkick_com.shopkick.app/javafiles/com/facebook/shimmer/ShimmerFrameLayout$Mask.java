// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.shimmer;


// Referenced classes of package com.facebook.shimmer:
//			ShimmerFrameLayout

private static class ShimmerFrameLayout$Mask
{

	public int[] getGradientColors()
	{
		if(ShimmerFrameLayout._cls3.$SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskShape[shape.ordinal()] != 2)
	//*   0    0:getstatic       #35  <Field int[] ShimmerFrameLayout$3.$SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskShape>
	//*   1    3:aload_0         
	//*   2    4:getfield        #37  <Field ShimmerFrameLayout$MaskShape shape>
	//*   3    7:invokevirtual   #43  <Method int ShimmerFrameLayout$MaskShape.ordinal()>
	//*   4   10:iaload          
	//*   5   11:iconst_2        
	//*   6   12:icmpeq          37
			return (new int[] {
				0, 0xff000000, 0xff000000, 0
			});
	//    7   15:iconst_4        
	//    8   16:newarray        int[]
	//    9   18:dup             
	//   10   19:iconst_0        
	//   11   20:iconst_0        
	//   12   21:iastore         
	//   13   22:dup             
	//   14   23:iconst_1        
	//   15   24:ldc1            #44  <Int 0xff000000>
	//   16   26:iastore         
	//   17   27:dup             
	//   18   28:iconst_2        
	//   19   29:ldc1            #44  <Int 0xff000000>
	//   20   31:iastore         
	//   21   32:dup             
	//   22   33:iconst_3        
	//   23   34:iconst_0        
	//   24   35:iastore         
	//   25   36:areturn         
		else
			return (new int[] {
				0xff000000, 0xff000000, 0
			});
	//   26   37:iconst_3        
	//   27   38:newarray        int[]
	//   28   40:dup             
	//   29   41:iconst_0        
	//   30   42:ldc1            #44  <Int 0xff000000>
	//   31   44:iastore         
	//   32   45:dup             
	//   33   46:iconst_1        
	//   34   47:ldc1            #44  <Int 0xff000000>
	//   35   49:iastore         
	//   36   50:dup             
	//   37   51:iconst_2        
	//   38   52:iconst_0        
	//   39   53:iastore         
	//   40   54:areturn         
	}

	public float[] getGradientPositions()
	{
		if(ShimmerFrameLayout._cls3.$SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskShape[shape.ordinal()] != 2)
	//*   0    0:getstatic       #35  <Field int[] ShimmerFrameLayout$3.$SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskShape>
	//*   1    3:aload_0         
	//*   2    4:getfield        #37  <Field ShimmerFrameLayout$MaskShape shape>
	//*   3    7:invokevirtual   #43  <Method int ShimmerFrameLayout$MaskShape.ordinal()>
	//*   4   10:iaload          
	//*   5   11:iconst_2        
	//*   6   12:icmpeq          89
			return (new float[] {
				Math.max((1.0F - intensity - dropoff) / 2.0F, 0.0F), Math.max((1.0F - intensity) / 2.0F, 0.0F), Math.min((intensity + 1.0F) / 2.0F, 1.0F), Math.min((intensity + 1.0F + dropoff) / 2.0F, 1.0F)
			});
	//    7   15:iconst_4        
	//    8   16:newarray        float[]
	//    9   18:dup             
	//   10   19:iconst_0        
	//   11   20:fconst_1        
	//   12   21:aload_0         
	//   13   22:getfield        #48  <Field float intensity>
	//   14   25:fsub            
	//   15   26:aload_0         
	//   16   27:getfield        #50  <Field float dropoff>
	//   17   30:fsub            
	//   18   31:fconst_2        
	//   19   32:fdiv            
	//   20   33:fconst_0        
	//   21   34:invokestatic    #56  <Method float Math.max(float, float)>
	//   22   37:fastore         
	//   23   38:dup             
	//   24   39:iconst_1        
	//   25   40:fconst_1        
	//   26   41:aload_0         
	//   27   42:getfield        #48  <Field float intensity>
	//   28   45:fsub            
	//   29   46:fconst_2        
	//   30   47:fdiv            
	//   31   48:fconst_0        
	//   32   49:invokestatic    #56  <Method float Math.max(float, float)>
	//   33   52:fastore         
	//   34   53:dup             
	//   35   54:iconst_2        
	//   36   55:aload_0         
	//   37   56:getfield        #48  <Field float intensity>
	//   38   59:fconst_1        
	//   39   60:fadd            
	//   40   61:fconst_2        
	//   41   62:fdiv            
	//   42   63:fconst_1        
	//   43   64:invokestatic    #59  <Method float Math.min(float, float)>
	//   44   67:fastore         
	//   45   68:dup             
	//   46   69:iconst_3        
	//   47   70:aload_0         
	//   48   71:getfield        #48  <Field float intensity>
	//   49   74:fconst_1        
	//   50   75:fadd            
	//   51   76:aload_0         
	//   52   77:getfield        #50  <Field float dropoff>
	//   53   80:fadd            
	//   54   81:fconst_2        
	//   55   82:fdiv            
	//   56   83:fconst_1        
	//   57   84:invokestatic    #59  <Method float Math.min(float, float)>
	//   58   87:fastore         
	//   59   88:areturn         
		else
			return (new float[] {
				0.0F, Math.min(intensity, 1.0F), Math.min(intensity + dropoff, 1.0F)
			});
	//   60   89:iconst_3        
	//   61   90:newarray        float[]
	//   62   92:dup             
	//   63   93:iconst_0        
	//   64   94:fconst_0        
	//   65   95:fastore         
	//   66   96:dup             
	//   67   97:iconst_1        
	//   68   98:aload_0         
	//   69   99:getfield        #48  <Field float intensity>
	//   70  102:fconst_1        
	//   71  103:invokestatic    #59  <Method float Math.min(float, float)>
	//   72  106:fastore         
	//   73  107:dup             
	//   74  108:iconst_2        
	//   75  109:aload_0         
	//   76  110:getfield        #48  <Field float intensity>
	//   77  113:aload_0         
	//   78  114:getfield        #50  <Field float dropoff>
	//   79  117:fadd            
	//   80  118:fconst_1        
	//   81  119:invokestatic    #59  <Method float Math.min(float, float)>
	//   82  122:fastore         
	//   83  123:areturn         
	}

	public int maskHeight(int i)
	{
		int j = fixedHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int fixedHeight>
	//    2    4:istore_2        
		if(j > 0)
	//*   3    5:iload_2         
	//*   4    6:ifle            11
			return j;
	//    5    9:iload_2         
	//    6   10:ireturn         
		else
			return (int)((float)i * relativeHeight);
	//    7   11:iload_1         
	//    8   12:i2f             
	//    9   13:aload_0         
	//   10   14:getfield        #65  <Field float relativeHeight>
	//   11   17:fmul            
	//   12   18:f2i             
	//   13   19:ireturn         
	}

	public int maskWidth(int i)
	{
		int j = fixedWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int fixedWidth>
	//    2    4:istore_2        
		if(j > 0)
	//*   3    5:iload_2         
	//*   4    6:ifle            11
			return j;
	//    5    9:iload_2         
	//    6   10:ireturn         
		else
			return (int)((float)i * relativeWidth);
	//    7   11:iload_1         
	//    8   12:i2f             
	//    9   13:aload_0         
	//   10   14:getfield        #70  <Field float relativeWidth>
	//   11   17:fmul            
	//   12   18:f2i             
	//   13   19:ireturn         
	}

	public ngle angle;
	public float dropoff;
	public int fixedHeight;
	public int fixedWidth;
	public float intensity;
	public float relativeHeight;
	public float relativeWidth;
	public hape shape;
	public float tilt;

	private ShimmerFrameLayout$Mask()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	ShimmerFrameLayout$Mask(ShimmerFrameLayout._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void ShimmerFrameLayout$Mask()>
	//    2    4:return          
	}
}
