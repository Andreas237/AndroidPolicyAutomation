// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.engine:
//			GlideException

private static final class GlideException$IndentedAppendable
	implements Appendable
{

	private CharSequence safeSequence(CharSequence charsequence)
	{
		if(charsequence == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       7
			return "";
	//    2    4:ldc1            #13  <String "">
	//    3    6:areturn         
		else
			return charsequence;
	//    4    7:aload_1         
	//    5    8:areturn         
	}

	public Appendable append(char c)
		throws IOException
	{
		boolean flag1 = printedNewLine;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field boolean printedNewLine>
	//    2    4:istore_3        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		if(flag1)
	//*   5    7:iload_3         
	//*   6    8:ifeq            28
		{
			printedNewLine = false;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #27  <Field boolean printedNewLine>
			appendable.append("  ");
	//   10   16:aload_0         
	//   11   17:getfield        #29  <Field Appendable appendable>
	//   12   20:ldc1            #16  <String "  ">
	//   13   22:invokeinterface #43  <Method Appendable Appendable.append(CharSequence)>
	//   14   27:pop             
		}
		if(c == '\n')
	//*  15   28:iload_1         
	//*  16   29:bipush          10
	//*  17   31:icmpne          36
			flag = true;
	//   18   34:iconst_1        
	//   19   35:istore_2        
		printedNewLine = flag;
	//   20   36:aload_0         
	//   21   37:iload_2         
	//   22   38:putfield        #27  <Field boolean printedNewLine>
		appendable.append(c);
	//   23   41:aload_0         
	//   24   42:getfield        #29  <Field Appendable appendable>
	//   25   45:iload_1         
	//   26   46:invokeinterface #45  <Method Appendable Appendable.append(char)>
	//   27   51:pop             
		return ((Appendable) (this));
	//   28   52:aload_0         
	//   29   53:areturn         
	}

	public Appendable append(CharSequence charsequence)
		throws IOException
	{
		charsequence = safeSequence(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #48  <Method CharSequence safeSequence(CharSequence)>
	//    3    5:astore_1        
		return append(charsequence, 0, charsequence.length());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:iconst_0        
	//    7    9:aload_1         
	//    8   10:invokeinterface #54  <Method int CharSequence.length()>
	//    9   15:invokevirtual   #57  <Method Appendable append(CharSequence, int, int)>
	//   10   18:areturn         
	}

	public Appendable append(CharSequence charsequence, int i, int j)
		throws IOException
	{
		charsequence = safeSequence(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #48  <Method CharSequence safeSequence(CharSequence)>
	//    3    5:astore_1        
		boolean flag = printedNewLine;
	//    4    6:aload_0         
	//    5    7:getfield        #27  <Field boolean printedNewLine>
	//    6   10:istore          4
		boolean flag1 = false;
	//    7   12:iconst_0        
	//    8   13:istore          5
		if(flag)
	//*   9   15:iload           4
	//*  10   17:ifeq            37
		{
			printedNewLine = false;
	//   11   20:aload_0         
	//   12   21:iconst_0        
	//   13   22:putfield        #27  <Field boolean printedNewLine>
			appendable.append("  ");
	//   14   25:aload_0         
	//   15   26:getfield        #29  <Field Appendable appendable>
	//   16   29:ldc1            #16  <String "  ">
	//   17   31:invokeinterface #43  <Method Appendable Appendable.append(CharSequence)>
	//   18   36:pop             
		}
		flag = flag1;
	//   19   37:iload           5
	//   20   39:istore          4
		if(charsequence.length() > 0)
	//*  21   41:aload_1         
	//*  22   42:invokeinterface #54  <Method int CharSequence.length()>
	//*  23   47:ifle            71
		{
			flag = flag1;
	//   24   50:iload           5
	//   25   52:istore          4
			if(charsequence.charAt(j - 1) == '\n')
	//*  26   54:aload_1         
	//*  27   55:iload_3         
	//*  28   56:iconst_1        
	//*  29   57:isub            
	//*  30   58:invokeinterface #61  <Method char CharSequence.charAt(int)>
	//*  31   63:bipush          10
	//*  32   65:icmpne          71
				flag = true;
	//   33   68:iconst_1        
	//   34   69:istore          4
		}
		printedNewLine = flag;
	//   35   71:aload_0         
	//   36   72:iload           4
	//   37   74:putfield        #27  <Field boolean printedNewLine>
		appendable.append(charsequence, i, j);
	//   38   77:aload_0         
	//   39   78:getfield        #29  <Field Appendable appendable>
	//   40   81:aload_1         
	//   41   82:iload_2         
	//   42   83:iload_3         
	//   43   84:invokeinterface #62  <Method Appendable Appendable.append(CharSequence, int, int)>
	//   44   89:pop             
		return ((Appendable) (this));
	//   45   90:aload_0         
	//   46   91:areturn         
	}

	private static final String EMPTY_SEQUENCE = "";
	private static final String INDENT = "  ";
	private final Appendable appendable;
	private boolean printedNewLine;

	GlideException$IndentedAppendable(Appendable appendable1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		printedNewLine = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #27  <Field boolean printedNewLine>
		appendable = appendable1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #29  <Field Appendable appendable>
	//    8   14:return          
	}
}
