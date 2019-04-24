// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.fonts.otf;

import java.util.Arrays;
import java.util.List;

public final class Language extends Enum
{

	private transient Language(String s, int i, String as[])
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		codes = Arrays.asList(((Object []) (as)));
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:invokestatic    #39  <Method List Arrays.asList(Object[])>
	//    7   11:putfield        #41  <Field List codes>
	//    8   14:return          
	}

	public static Language valueOf(String s)
	{
		return (Language)Enum.valueOf(com/itextpdf/text/pdf/fonts/otf/Language, s);
	//    0    0:ldc1            #2   <Class Language>
	//    1    2:aload_0         
	//    2    3:invokestatic    #48  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Language>
	//    4    9:areturn         
	}

	public static Language[] values()
	{
		return (Language[])((Language []) ($VALUES)).clone();
	//    0    0:getstatic       #29  <Field Language[] $VALUES>
	//    1    3:invokevirtual   #55  <Method Object _5B_Lcom.itextpdf.text.pdf.fonts.otf.Language_3B_.clone()>
	//    2    6:checkcast       #51  <Class Language[]>
	//    3    9:areturn         
	}

	public boolean isSupported(String s)
	{
		return codes.contains(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List codes>
	//    2    4:aload_1         
	//    3    5:invokeinterface #63  <Method boolean List.contains(Object)>
	//    4   10:ireturn         
	}

	private static final Language $VALUES[];
	public static final Language BENGALI;
	private final List codes;

	static 
	{
		BENGALI = new Language("BENGALI", 0, new String[] {
			"beng", "bng2"
		});
	//    0    0:new             #2   <Class Language>
	//    1    3:dup             
	//    2    4:ldc1            #15  <String "BENGALI">
	//    3    6:iconst_0        
	//    4    7:iconst_2        
	//    5    8:anewarray       String[]
	//    6   11:dup             
	//    7   12:iconst_0        
	//    8   13:ldc1            #19  <String "beng">
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:ldc1            #21  <String "bng2">
	//   13   20:aastore         
	//   14   21:invokespecial   #25  <Method void Language(String, int, String[])>
	//   15   24:putstatic       #27  <Field Language BENGALI>
		$VALUES = (new Language[] {
			BENGALI
		});
	//   16   27:iconst_1        
	//   17   28:anewarray       Language[]
	//   18   31:dup             
	//   19   32:iconst_0        
	//   20   33:getstatic       #27  <Field Language BENGALI>
	//   21   36:aastore         
	//   22   37:putstatic       #29  <Field Language[] $VALUES>
	//*  23   40:return          
	}
}
