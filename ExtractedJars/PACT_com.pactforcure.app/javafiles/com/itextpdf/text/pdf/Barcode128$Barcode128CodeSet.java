// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			Barcode128

public static final class Barcode128$Barcode128CodeSet extends Enum
{

	public static Barcode128$Barcode128CodeSet valueOf(String s)
	{
		return (Barcode128$Barcode128CodeSet)Enum.valueOf(com/itextpdf/text/pdf/Barcode128$Barcode128CodeSet, s);
	//    0    0:ldc1            #2   <Class Barcode128$Barcode128CodeSet>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Barcode128$Barcode128CodeSet>
	//    4    9:areturn         
	}

	public static Barcode128$Barcode128CodeSet[] values()
	{
		return (Barcode128$Barcode128CodeSet[])((Barcode128$Barcode128CodeSet []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field Barcode128$Barcode128CodeSet[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.itextpdf.text.pdf.Barcode128$Barcode128CodeSet_3B_.clone()>
	//    2    6:checkcast       #46  <Class Barcode128$Barcode128CodeSet[]>
	//    3    9:areturn         
	}

	public char getStartSymbol()
	{
		switch(Barcode128._cls1.$SwitchMap$com$itextpdf$text$pdf$Barcode128$Barcode128CodeSet[ordinal()])
	//*   0    0:getstatic       #58  <Field int[] Barcode128$1.$SwitchMap$com$itextpdf$text$pdf$Barcode128$Barcode128CodeSet>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #62  <Method int ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 3: default 36
	//	               1 39
	//	               2 36
	//	               3 42
		case 2: // '\002'
		default:
			return 'h';
	//    5   36:bipush          104
	//    6   38:ireturn         

		case 1: // '\001'
			return 'g';
	//    7   39:bipush          103
	//    8   41:ireturn         

		case 3: // '\003'
			return 'i';
	//    9   42:bipush          105
	//   10   44:ireturn         
		}
	}

	private static final Barcode128$Barcode128CodeSet $VALUES[];
	public static final Barcode128$Barcode128CodeSet A;
	public static final Barcode128$Barcode128CodeSet AUTO;
	public static final Barcode128$Barcode128CodeSet B;
	public static final Barcode128$Barcode128CodeSet C;

	static 
	{
		A = new Barcode128$Barcode128CodeSet("A", 0);
	//    0    0:new             #2   <Class Barcode128$Barcode128CodeSet>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "A">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void Barcode128$Barcode128CodeSet(String, int)>
	//    5   10:putstatic       #24  <Field Barcode128$Barcode128CodeSet A>
		B = new Barcode128$Barcode128CodeSet("B", 1);
	//    6   13:new             #2   <Class Barcode128$Barcode128CodeSet>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "B">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void Barcode128$Barcode128CodeSet(String, int)>
	//   11   23:putstatic       #27  <Field Barcode128$Barcode128CodeSet B>
		C = new Barcode128$Barcode128CodeSet("C", 2);
	//   12   26:new             #2   <Class Barcode128$Barcode128CodeSet>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "C">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void Barcode128$Barcode128CodeSet(String, int)>
	//   17   36:putstatic       #30  <Field Barcode128$Barcode128CodeSet C>
		AUTO = new Barcode128$Barcode128CodeSet("AUTO", 3);
	//   18   39:new             #2   <Class Barcode128$Barcode128CodeSet>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "AUTO">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void Barcode128$Barcode128CodeSet(String, int)>
	//   23   49:putstatic       #33  <Field Barcode128$Barcode128CodeSet AUTO>
		$VALUES = (new Barcode128$Barcode128CodeSet[] {
			A, B, C, AUTO
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       Barcode128$Barcode128CodeSet[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field Barcode128$Barcode128CodeSet A>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field Barcode128$Barcode128CodeSet B>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field Barcode128$Barcode128CodeSet C>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field Barcode128$Barcode128CodeSet AUTO>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field Barcode128$Barcode128CodeSet[] $VALUES>
	//*  43   83:return          
	}

	private Barcode128$Barcode128CodeSet(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
