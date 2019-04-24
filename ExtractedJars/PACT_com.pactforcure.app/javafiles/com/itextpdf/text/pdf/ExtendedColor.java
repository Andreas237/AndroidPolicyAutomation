// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.BaseColor;

public abstract class ExtendedColor extends BaseColor
{

	public ExtendedColor(int i)
	{
		super(0, 0, 0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:invokespecial   #31  <Method void BaseColor(int, int, int)>
		type = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #33  <Field int type>
	//    8   12:return          
	}

	public ExtendedColor(int i, float f, float f1, float f2)
	{
		super(normalize(f), normalize(f1), normalize(f2));
	//    0    0:aload_0         
	//    1    1:fload_2         
	//    2    2:invokestatic    #39  <Method float normalize(float)>
	//    3    5:fload_3         
	//    4    6:invokestatic    #39  <Method float normalize(float)>
	//    5    9:fload           4
	//    6   11:invokestatic    #39  <Method float normalize(float)>
	//    7   14:invokespecial   #42  <Method void BaseColor(float, float, float)>
		type = i;
	//    8   17:aload_0         
	//    9   18:iload_1         
	//   10   19:putfield        #33  <Field int type>
	//   11   22:return          
	}

	public ExtendedColor(int i, int j, int k, int l, int i1)
	{
		super(normalize((float)j / 255F), normalize((float)k / 255F), normalize((float)l / 255F), normalize((float)i1 / 255F));
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:i2f             
	//    3    3:ldc1            #44  <Float 255F>
	//    4    5:fdiv            
	//    5    6:invokestatic    #39  <Method float normalize(float)>
	//    6    9:iload_3         
	//    7   10:i2f             
	//    8   11:ldc1            #44  <Float 255F>
	//    9   13:fdiv            
	//   10   14:invokestatic    #39  <Method float normalize(float)>
	//   11   17:iload           4
	//   12   19:i2f             
	//   13   20:ldc1            #44  <Float 255F>
	//   14   22:fdiv            
	//   15   23:invokestatic    #39  <Method float normalize(float)>
	//   16   26:iload           5
	//   17   28:i2f             
	//   18   29:ldc1            #44  <Float 255F>
	//   19   31:fdiv            
	//   20   32:invokestatic    #39  <Method float normalize(float)>
	//   21   35:invokespecial   #47  <Method void BaseColor(float, float, float, float)>
		type = i;
	//   22   38:aload_0         
	//   23   39:iload_1         
	//   24   40:putfield        #33  <Field int type>
	//   25   43:return          
	}

	public static int getType(BaseColor basecolor)
	{
		if(basecolor instanceof ExtendedColor)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #2   <Class ExtendedColor>
	//*   2    4:ifeq            15
			return ((ExtendedColor)basecolor).getType();
	//    3    7:aload_0         
	//    4    8:checkcast       #2   <Class ExtendedColor>
	//    5   11:invokevirtual   #52  <Method int getType()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	static final float normalize(float f)
	{
		float f1;
		if(f < 0.0F)
	//*   0    0:fload_0         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:ifge            10
		{
			f1 = 0.0F;
	//    4    6:fconst_0        
	//    5    7:fstore_1        
		} else
	//*   6    8:fload_1         
	//*   7    9:freturn         
		{
			f1 = f;
	//    8   10:fload_0         
	//    9   11:fstore_1        
			if(f > 1.0F)
	//*  10   12:fload_0         
	//*  11   13:fconst_1        
	//*  12   14:fcmpl           
	//*  13   15:ifle            8
				return 1.0F;
	//   14   18:fconst_1        
	//   15   19:freturn         
		}
		return f1;
	}

	public int getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int type>
	//    2    4:ireturn         
	}

	public static final int TYPE_CMYK = 2;
	public static final int TYPE_DEVICEN = 6;
	public static final int TYPE_GRAY = 1;
	public static final int TYPE_LAB = 7;
	public static final int TYPE_PATTERN = 4;
	public static final int TYPE_RGB = 0;
	public static final int TYPE_SEPARATION = 3;
	public static final int TYPE_SHADING = 5;
	private static final long serialVersionUID = 0xff6a72b0L;
	protected int type;
}
