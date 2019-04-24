// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			ExtendedColor

public class GrayColor extends ExtendedColor
{

	public GrayColor(float f)
	{
		super(1, f, f, f);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:fload_1         
	//    3    3:fload_1         
	//    4    4:fload_1         
	//    5    5:invokespecial   #27  <Method void ExtendedColor(int, float, float, float)>
		gray = normalize(f);
	//    6    8:aload_0         
	//    7    9:fload_1         
	//    8   10:invokestatic    #31  <Method float normalize(float)>
	//    9   13:putfield        #33  <Field float gray>
	//   10   16:return          
	}

	public GrayColor(int i)
	{
		this((float)i / 255F);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:i2f             
	//    3    3:ldc1            #35  <Float 255F>
	//    4    5:fdiv            
	//    5    6:invokespecial   #19  <Method void GrayColor(float)>
	//    6    9:return          
	}

	public boolean equals(Object obj)
	{
		return (obj instanceof GrayColor) && ((GrayColor)obj).gray == gray;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class GrayColor>
	//    2    4:ifeq            24
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class GrayColor>
	//    5   11:getfield        #33  <Field float gray>
	//    6   14:aload_0         
	//    7   15:getfield        #33  <Field float gray>
	//    8   18:fcmpl           
	//    9   19:ifne            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	public float getGray()
	{
		return gray;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field float gray>
	//    2    4:freturn         
	}

	public int hashCode()
	{
		return Float.floatToIntBits(gray);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field float gray>
	//    2    4:invokestatic    #47  <Method int Float.floatToIntBits(float)>
	//    3    7:ireturn         
	}

	public static final GrayColor GRAYBLACK = new GrayColor(0.0F);
	public static final GrayColor GRAYWHITE = new GrayColor(1.0F);
	private static final long serialVersionUID = 0x72877cc6L;
	private float gray;

	static 
	{
	//    0    0:new             #2   <Class GrayColor>
	//    1    3:dup             
	//    2    4:fconst_0        
	//    3    5:invokespecial   #19  <Method void GrayColor(float)>
	//    4    8:putstatic       #21  <Field GrayColor GRAYBLACK>
	//    5   11:new             #2   <Class GrayColor>
	//    6   14:dup             
	//    7   15:fconst_1        
	//    8   16:invokespecial   #19  <Method void GrayColor(float)>
	//    9   19:putstatic       #23  <Field GrayColor GRAYWHITE>
	//*  10   22:return          
	}
}
