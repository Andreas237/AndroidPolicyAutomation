// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.qrcode;


public final class ErrorCorrectionLevel
{

	private ErrorCorrectionLevel(int i, int j, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		ordinal = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #41  <Field int ordinal>
		bits = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #43  <Field int bits>
		name = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #45  <Field String name>
	//   11   19:return          
	}

	public static ErrorCorrectionLevel forBits(int i)
	{
		if(i < 0 || i >= FOR_BITS.length)
	//*   0    0:iload_0         
	//*   1    1:iflt            12
	//*   2    4:iload_0         
	//*   3    5:getstatic       #36  <Field ErrorCorrectionLevel[] FOR_BITS>
	//*   4    8:arraylength     
	//*   5    9:icmplt          20
			throw new IllegalArgumentException();
	//    6   12:new             #49  <Class IllegalArgumentException>
	//    7   15:dup             
	//    8   16:invokespecial   #50  <Method void IllegalArgumentException()>
	//    9   19:athrow          
		else
			return FOR_BITS[i];
	//   10   20:getstatic       #36  <Field ErrorCorrectionLevel[] FOR_BITS>
	//   11   23:iload_0         
	//   12   24:aaload          
	//   13   25:areturn         
	}

	public int getBits()
	{
		return bits;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int bits>
	//    2    4:ireturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String name>
	//    2    4:areturn         
	}

	public int ordinal()
	{
		return ordinal;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int ordinal>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String name>
	//    2    4:areturn         
	}

	private static final ErrorCorrectionLevel FOR_BITS[];
	public static final ErrorCorrectionLevel H;
	public static final ErrorCorrectionLevel L;
	public static final ErrorCorrectionLevel M;
	public static final ErrorCorrectionLevel Q;
	private final int bits;
	private final String name;
	private final int ordinal;

	static 
	{
		L = new ErrorCorrectionLevel(0, 1, "L");
	//    0    0:new             #2   <Class ErrorCorrectionLevel>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:iconst_1        
	//    4    6:ldc1            #19  <String "L">
	//    5    8:invokespecial   #23  <Method void ErrorCorrectionLevel(int, int, String)>
	//    6   11:putstatic       #25  <Field ErrorCorrectionLevel L>
		M = new ErrorCorrectionLevel(1, 0, "M");
	//    7   14:new             #2   <Class ErrorCorrectionLevel>
	//    8   17:dup             
	//    9   18:iconst_1        
	//   10   19:iconst_0        
	//   11   20:ldc1            #26  <String "M">
	//   12   22:invokespecial   #23  <Method void ErrorCorrectionLevel(int, int, String)>
	//   13   25:putstatic       #28  <Field ErrorCorrectionLevel M>
		Q = new ErrorCorrectionLevel(2, 3, "Q");
	//   14   28:new             #2   <Class ErrorCorrectionLevel>
	//   15   31:dup             
	//   16   32:iconst_2        
	//   17   33:iconst_3        
	//   18   34:ldc1            #29  <String "Q">
	//   19   36:invokespecial   #23  <Method void ErrorCorrectionLevel(int, int, String)>
	//   20   39:putstatic       #31  <Field ErrorCorrectionLevel Q>
		H = new ErrorCorrectionLevel(3, 2, "H");
	//   21   42:new             #2   <Class ErrorCorrectionLevel>
	//   22   45:dup             
	//   23   46:iconst_3        
	//   24   47:iconst_2        
	//   25   48:ldc1            #32  <String "H">
	//   26   50:invokespecial   #23  <Method void ErrorCorrectionLevel(int, int, String)>
	//   27   53:putstatic       #34  <Field ErrorCorrectionLevel H>
		FOR_BITS = (new ErrorCorrectionLevel[] {
			M, L, H, Q
		});
	//   28   56:iconst_4        
	//   29   57:anewarray       ErrorCorrectionLevel[]
	//   30   60:dup             
	//   31   61:iconst_0        
	//   32   62:getstatic       #28  <Field ErrorCorrectionLevel M>
	//   33   65:aastore         
	//   34   66:dup             
	//   35   67:iconst_1        
	//   36   68:getstatic       #25  <Field ErrorCorrectionLevel L>
	//   37   71:aastore         
	//   38   72:dup             
	//   39   73:iconst_2        
	//   40   74:getstatic       #34  <Field ErrorCorrectionLevel H>
	//   41   77:aastore         
	//   42   78:dup             
	//   43   79:iconst_3        
	//   44   80:getstatic       #31  <Field ErrorCorrectionLevel Q>
	//   45   83:aastore         
	//   46   84:putstatic       #36  <Field ErrorCorrectionLevel[] FOR_BITS>
	//*  47   87:return          
	}
}
