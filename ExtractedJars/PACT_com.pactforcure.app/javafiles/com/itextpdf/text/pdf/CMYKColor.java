// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			ExtendedColor

public class CMYKColor extends ExtendedColor
{

	public CMYKColor(float f, float f1, float f2, float f3)
	{
		super(2, 1.0F - f - f3, 1.0F - f1 - f3, 1.0F - f2 - f3);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:fconst_1        
	//    3    3:fload_1         
	//    4    4:fsub            
	//    5    5:fload           4
	//    6    7:fsub            
	//    7    8:fconst_1        
	//    8    9:fload_2         
	//    9   10:fsub            
	//   10   11:fload           4
	//   11   13:fsub            
	//   12   14:fconst_1        
	//   13   15:fload_3         
	//   14   16:fsub            
	//   15   17:fload           4
	//   16   19:fsub            
	//   17   20:invokespecial   #18  <Method void ExtendedColor(int, float, float, float)>
		cyan = normalize(f);
	//   18   23:aload_0         
	//   19   24:fload_1         
	//   20   25:invokestatic    #22  <Method float normalize(float)>
	//   21   28:putfield        #24  <Field float cyan>
		magenta = normalize(f1);
	//   22   31:aload_0         
	//   23   32:fload_2         
	//   24   33:invokestatic    #22  <Method float normalize(float)>
	//   25   36:putfield        #26  <Field float magenta>
		yellow = normalize(f2);
	//   26   39:aload_0         
	//   27   40:fload_3         
	//   28   41:invokestatic    #22  <Method float normalize(float)>
	//   29   44:putfield        #28  <Field float yellow>
		black = normalize(f3);
	//   30   47:aload_0         
	//   31   48:fload           4
	//   32   50:invokestatic    #22  <Method float normalize(float)>
	//   33   53:putfield        #30  <Field float black>
	//   34   56:return          
	}

	public CMYKColor(int i, int j, int k, int l)
	{
		this((float)i / 255F, (float)j / 255F, (float)k / 255F, (float)l / 255F);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:i2f             
	//    3    3:ldc1            #33  <Float 255F>
	//    4    5:fdiv            
	//    5    6:iload_2         
	//    6    7:i2f             
	//    7    8:ldc1            #33  <Float 255F>
	//    8   10:fdiv            
	//    9   11:iload_3         
	//   10   12:i2f             
	//   11   13:ldc1            #33  <Float 255F>
	//   12   15:fdiv            
	//   13   16:iload           4
	//   14   18:i2f             
	//   15   19:ldc1            #33  <Float 255F>
	//   16   21:fdiv            
	//   17   22:invokespecial   #35  <Method void CMYKColor(float, float, float, float)>
	//   18   25:return          
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof CMYKColor)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class CMYKColor>
	//*   2    4:ifne            9
	//*   3    7:iconst_0        
	//*   4    8:ireturn         
	//*   5    9:aload_1         
	//*   6   10:checkcast       #2   <Class CMYKColor>
	//*   7   13:astore_1        
			if(cyan == ((CMYKColor) (obj = ((Object) ((CMYKColor)obj)))).cyan && magenta == ((CMYKColor) (obj)).magenta && yellow == ((CMYKColor) (obj)).yellow && black == ((CMYKColor) (obj)).black)
	//*   8   14:aload_0         
	//*   9   15:getfield        #24  <Field float cyan>
	//*  10   18:aload_1         
	//*  11   19:getfield        #24  <Field float cyan>
	//*  12   22:fcmpl           
	//*  13   23:ifne            7
	//*  14   26:aload_0         
	//*  15   27:getfield        #26  <Field float magenta>
	//*  16   30:aload_1         
	//*  17   31:getfield        #26  <Field float magenta>
	//*  18   34:fcmpl           
	//*  19   35:ifne            7
	//*  20   38:aload_0         
	//*  21   39:getfield        #28  <Field float yellow>
	//*  22   42:aload_1         
	//*  23   43:getfield        #28  <Field float yellow>
	//*  24   46:fcmpl           
	//*  25   47:ifne            7
	//*  26   50:aload_0         
	//*  27   51:getfield        #30  <Field float black>
	//*  28   54:aload_1         
	//*  29   55:getfield        #30  <Field float black>
	//*  30   58:fcmpl           
	//*  31   59:ifne            7
				return true;
	//   32   62:iconst_1        
	//   33   63:ireturn         
		return false;
	}

	public float getBlack()
	{
		return black;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field float black>
	//    2    4:freturn         
	}

	public float getCyan()
	{
		return cyan;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field float cyan>
	//    2    4:freturn         
	}

	public float getMagenta()
	{
		return magenta;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field float magenta>
	//    2    4:freturn         
	}

	public float getYellow()
	{
		return yellow;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field float yellow>
	//    2    4:freturn         
	}

	public int hashCode()
	{
		return Float.floatToIntBits(cyan) ^ Float.floatToIntBits(magenta) ^ Float.floatToIntBits(yellow) ^ Float.floatToIntBits(black);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field float cyan>
	//    2    4:invokestatic    #50  <Method int Float.floatToIntBits(float)>
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field float magenta>
	//    5   11:invokestatic    #50  <Method int Float.floatToIntBits(float)>
	//    6   14:ixor            
	//    7   15:aload_0         
	//    8   16:getfield        #28  <Field float yellow>
	//    9   19:invokestatic    #50  <Method int Float.floatToIntBits(float)>
	//   10   22:ixor            
	//   11   23:aload_0         
	//   12   24:getfield        #30  <Field float black>
	//   13   27:invokestatic    #50  <Method int Float.floatToIntBits(float)>
	//   14   30:ixor            
	//   15   31:ireturn         
	}

	private static final long serialVersionUID = 0x7e7016e4L;
	float black;
	float cyan;
	float magenta;
	float yellow;
}
