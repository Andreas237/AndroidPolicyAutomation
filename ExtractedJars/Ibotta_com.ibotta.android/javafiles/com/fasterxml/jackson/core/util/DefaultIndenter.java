// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;

public class DefaultIndenter extends DefaultPrettyPrinter.NopIndenter
{

	public DefaultIndenter()
	{
		this("  ", SYS_LF);
	//    0    0:aload_0         
	//    1    1:ldc1            #35  <String "  ">
	//    2    3:getstatic       #33  <Field String SYS_LF>
	//    3    6:invokespecial   #39  <Method void DefaultIndenter(String, String)>
	//    4    9:return          
	}

	public DefaultIndenter(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void DefaultPrettyPrinter$NopIndenter()>
		charsPerLevel = s.length();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #50  <Method int String.length()>
	//    5    9:putfield        #52  <Field int charsPerLevel>
		indents = new char[s.length() * 16];
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #50  <Method int String.length()>
	//    9   17:bipush          16
	//   10   19:imul            
	//   11   20:newarray        char[]
	//   12   22:putfield        #54  <Field char[] indents>
		int i = 0;
	//   13   25:iconst_0        
	//   14   26:istore_3        
		int j = 0;
	//   15   27:iconst_0        
	//   16   28:istore          4
		for(; i < 16; i++)
	//*  17   30:iload_3         
	//*  18   31:bipush          16
	//*  19   33:icmpge          67
		{
			s.getChars(0, s.length(), indents, j);
	//   20   36:aload_1         
	//   21   37:iconst_0        
	//   22   38:aload_1         
	//   23   39:invokevirtual   #50  <Method int String.length()>
	//   24   42:aload_0         
	//   25   43:getfield        #54  <Field char[] indents>
	//   26   46:iload           4
	//   27   48:invokevirtual   #58  <Method void String.getChars(int, int, char[], int)>
			j += s.length();
	//   28   51:iload           4
	//   29   53:aload_1         
	//   30   54:invokevirtual   #50  <Method int String.length()>
	//   31   57:iadd            
	//   32   58:istore          4
		}

	//   33   60:iload_3         
	//   34   61:iconst_1        
	//   35   62:iadd            
	//   36   63:istore_3        
	//*  37   64:goto            30
		eol = s1;
	//   38   67:aload_0         
	//   39   68:aload_2         
	//   40   69:putfield        #60  <Field String eol>
	//   41   72:return          
	}

	public boolean isInline()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeIndentation(JsonGenerator jsongenerator, int i)
		throws IOException
	{
		jsongenerator.writeRaw(eol);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #60  <Field String eol>
	//    3    5:invokevirtual   #72  <Method void JsonGenerator.writeRaw(String)>
		if(i > 0)
	//*   4    8:iload_2         
	//*   5    9:ifle            56
		{
			i *= charsPerLevel;
	//    6   12:iload_2         
	//    7   13:aload_0         
	//    8   14:getfield        #52  <Field int charsPerLevel>
	//    9   17:imul            
	//   10   18:istore_2        
			char ac[];
			do
			{
				ac = indents;
	//   11   19:aload_0         
	//   12   20:getfield        #54  <Field char[] indents>
	//   13   23:astore_3        
				if(i <= ac.length)
					break;
	//   14   24:iload_2         
	//   15   25:aload_3         
	//   16   26:arraylength     
	//   17   27:icmple          49
				jsongenerator.writeRaw(ac, 0, ac.length);
	//   18   30:aload_1         
	//   19   31:aload_3         
	//   20   32:iconst_0        
	//   21   33:aload_3         
	//   22   34:arraylength     
	//   23   35:invokevirtual   #75  <Method void JsonGenerator.writeRaw(char[], int, int)>
				i -= indents.length;
	//   24   38:iload_2         
	//   25   39:aload_0         
	//   26   40:getfield        #54  <Field char[] indents>
	//   27   43:arraylength     
	//   28   44:isub            
	//   29   45:istore_2        
			} while(true);
	//   30   46:goto            19
			jsongenerator.writeRaw(ac, 0, i);
	//   31   49:aload_1         
	//   32   50:aload_3         
	//   33   51:iconst_0        
	//   34   52:iload_2         
	//   35   53:invokevirtual   #75  <Method void JsonGenerator.writeRaw(char[], int, int)>
		}
	//   36   56:return          
	}

	public static final DefaultIndenter SYSTEM_LINEFEED_INSTANCE;
	public static final String SYS_LF;
	private static final long serialVersionUID = 1L;
	private final int charsPerLevel;
	private final String eol;
	private final char indents[];

	static 
	{
		Throwable throwable;
		String s;
		try
		{
			s = System.getProperty("line.separator");
	//    0    0:ldc1            #23  <String "line.separator">
	//    1    2:invokestatic    #29  <Method String System.getProperty(String)>
	//    2    5:astore_0        
		}
	//*   3    6:goto            12
	//*   4    9:ldc1            #31  <String "\n">
	//*   5   11:astore_0        
	//*   6   12:aload_0         
	//*   7   13:putstatic       #33  <Field String SYS_LF>
	//*   8   16:new             #2   <Class DefaultIndenter>
	//*   9   19:dup             
	//*  10   20:ldc1            #35  <String "  ">
	//*  11   22:getstatic       #33  <Field String SYS_LF>
	//*  12   25:invokespecial   #39  <Method void DefaultIndenter(String, String)>
	//*  13   28:putstatic       #41  <Field DefaultIndenter SYSTEM_LINEFEED_INSTANCE>
	//*  14   31:return          
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			s = "\n";
		}
		SYS_LF = s;
		SYSTEM_LINEFEED_INSTANCE = new DefaultIndenter("  ", SYS_LF);
	//*  15   32:astore_0        
	//*  16   33:goto            9
	}
}
