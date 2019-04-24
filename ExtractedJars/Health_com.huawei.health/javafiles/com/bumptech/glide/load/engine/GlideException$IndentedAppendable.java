// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.engine:
//			GlideException

static final class GlideException$IndentedAppendable
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
		if(printedNewLine)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field boolean printedNewLine>
	//*   2    4:ifeq            24
		{
			printedNewLine = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #27  <Field boolean printedNewLine>
			appendable.append("  ");
	//    6   12:aload_0         
	//    7   13:getfield        #29  <Field Appendable appendable>
	//    8   16:ldc1            #16  <String "  ">
	//    9   18:invokeinterface #43  <Method Appendable Appendable.append(CharSequence)>
	//   10   23:pop             
		}
		boolean flag;
		if(c == '\n')
	//*  11   24:iload_1         
	//*  12   25:bipush          10
	//*  13   27:icmpne          35
			flag = true;
	//   14   30:iconst_1        
	//   15   31:istore_2        
		else
	//*  16   32:goto            37
			flag = false;
	//   17   35:iconst_0        
	//   18   36:istore_2        
		printedNewLine = flag;
	//   19   37:aload_0         
	//   20   38:iload_2         
	//   21   39:putfield        #27  <Field boolean printedNewLine>
		appendable.append(c);
	//   22   42:aload_0         
	//   23   43:getfield        #29  <Field Appendable appendable>
	//   24   46:iload_1         
	//   25   47:invokeinterface #45  <Method Appendable Appendable.append(char)>
	//   26   52:pop             
		return ((Appendable) (this));
	//   27   53:aload_0         
	//   28   54:areturn         
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
		if(printedNewLine)
	//*   4    6:aload_0         
	//*   5    7:getfield        #27  <Field boolean printedNewLine>
	//*   6   10:ifeq            30
		{
			printedNewLine = false;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #27  <Field boolean printedNewLine>
			appendable.append("  ");
	//   10   18:aload_0         
	//   11   19:getfield        #29  <Field Appendable appendable>
	//   12   22:ldc1            #16  <String "  ">
	//   13   24:invokeinterface #43  <Method Appendable Appendable.append(CharSequence)>
	//   14   29:pop             
		}
		boolean flag;
		if(charsequence.length() > 0 && charsequence.charAt(j - 1) == '\n')
	//*  15   30:aload_1         
	//*  16   31:invokeinterface #54  <Method int CharSequence.length()>
	//*  17   36:ifle            59
	//*  18   39:aload_1         
	//*  19   40:iload_3         
	//*  20   41:iconst_1        
	//*  21   42:isub            
	//*  22   43:invokeinterface #61  <Method char CharSequence.charAt(int)>
	//*  23   48:bipush          10
	//*  24   50:icmpne          59
			flag = true;
	//   25   53:iconst_1        
	//   26   54:istore          4
		else
	//*  27   56:goto            62
			flag = false;
	//   28   59:iconst_0        
	//   29   60:istore          4
		printedNewLine = flag;
	//   30   62:aload_0         
	//   31   63:iload           4
	//   32   65:putfield        #27  <Field boolean printedNewLine>
		appendable.append(charsequence, i, j);
	//   33   68:aload_0         
	//   34   69:getfield        #29  <Field Appendable appendable>
	//   35   72:aload_1         
	//   36   73:iload_2         
	//   37   74:iload_3         
	//   38   75:invokeinterface #62  <Method Appendable Appendable.append(CharSequence, int, int)>
	//   39   80:pop             
		return ((Appendable) (this));
	//   40   81:aload_0         
	//   41   82:areturn         
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
