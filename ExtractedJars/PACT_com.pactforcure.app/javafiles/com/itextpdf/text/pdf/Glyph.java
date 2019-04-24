// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


public class Glyph
{

	public Glyph(int i, int j, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		code = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #16  <Field int code>
		width = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #18  <Field int width>
		chars = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #20  <Field String chars>
	//   11   19:return          
	}

	public boolean equals(Object obj)
	{
		if(this != obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
				return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
			if(((Object)this).getClass() != obj.getClass())
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #27  <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #27  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
				return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
			obj = ((Object) ((Glyph)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class Glyph>
	//   18   30:astore_1        
			if(chars == null)
	//*  19   31:aload_0         
	//*  20   32:getfield        #20  <Field String chars>
	//*  21   35:ifnonnull       47
			{
				if(((Glyph) (obj)).chars != null)
	//*  22   38:aload_1         
	//*  23   39:getfield        #20  <Field String chars>
	//*  24   42:ifnull          63
					return false;
	//   25   45:iconst_0        
	//   26   46:ireturn         
			} else
			if(!chars.equals(((Object) (((Glyph) (obj)).chars))))
	//*  27   47:aload_0         
	//*  28   48:getfield        #20  <Field String chars>
	//*  29   51:aload_1         
	//*  30   52:getfield        #20  <Field String chars>
	//*  31   55:invokevirtual   #31  <Method boolean String.equals(Object)>
	//*  32   58:ifne            63
				return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
			if(code != ((Glyph) (obj)).code)
	//*  35   63:aload_0         
	//*  36   64:getfield        #16  <Field int code>
	//*  37   67:aload_1         
	//*  38   68:getfield        #16  <Field int code>
	//*  39   71:icmpeq          76
				return false;
	//   40   74:iconst_0        
	//   41   75:ireturn         
			if(width != ((Glyph) (obj)).width)
	//*  42   76:aload_0         
	//*  43   77:getfield        #18  <Field int width>
	//*  44   80:aload_1         
	//*  45   81:getfield        #18  <Field int width>
	//*  46   84:icmpeq          5
				return false;
	//   47   87:iconst_0        
	//   48   88:ireturn         
		}
		return true;
	}

	public int hashCode()
	{
		int i;
		if(chars == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field String chars>
	//*   2    4:ifnonnull       30
			i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
		else
	//*   5    9:iload_1         
	//*   6   10:bipush          31
	//*   7   12:iadd            
	//*   8   13:bipush          31
	//*   9   15:imul            
	//*  10   16:aload_0         
	//*  11   17:getfield        #16  <Field int code>
	//*  12   20:iadd            
	//*  13   21:bipush          31
	//*  14   23:imul            
	//*  15   24:aload_0         
	//*  16   25:getfield        #18  <Field int width>
	//*  17   28:iadd            
	//*  18   29:ireturn         
			i = chars.hashCode();
	//   19   30:aload_0         
	//   20   31:getfield        #20  <Field String chars>
	//   21   34:invokevirtual   #35  <Method int String.hashCode()>
	//   22   37:istore_1        
		return ((i + 31) * 31 + code) * 31 + width;
	//*  23   38:goto            9
	}

	public String toString()
	{
		return (new StringBuilder()).append(((Class) (com/itextpdf/text/pdf/Glyph)).getSimpleName()).append(" [id=").append(code).append(", width=").append(width).append(", chars=").append(chars).append("]").toString();
	//    0    0:new             #39  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void StringBuilder()>
	//    3    7:ldc1            #2   <Class Glyph>
	//    4    9:invokevirtual   #45  <Method String Class.getSimpleName()>
	//    5   12:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//    6   15:ldc1            #51  <String " [id=">
	//    7   17:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//    8   20:aload_0         
	//    9   21:getfield        #16  <Field int code>
	//   10   24:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   11   27:ldc1            #56  <String ", width=">
	//   12   29:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   13   32:aload_0         
	//   14   33:getfield        #18  <Field int width>
	//   15   36:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   16   39:ldc1            #58  <String ", chars=">
	//   17   41:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   18   44:aload_0         
	//   19   45:getfield        #20  <Field String chars>
	//   20   48:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   21   51:ldc1            #60  <String "]">
	//   22   53:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   23   56:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   24   59:areturn         
	}

	public final String chars;
	public final int code;
	public final int width;
}
