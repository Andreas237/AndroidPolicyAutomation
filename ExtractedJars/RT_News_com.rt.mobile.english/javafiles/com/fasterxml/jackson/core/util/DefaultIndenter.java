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
	//    1    1:ldc1            #37  <String "  ">
	//    2    3:getstatic       #35  <Field String SYS_LF>
	//    3    6:invokespecial   #41  <Method void DefaultIndenter(String, String)>
	//    4    9:return          
	}

	public DefaultIndenter(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void DefaultPrettyPrinter$NopIndenter()>
		charsPerLevel = s.length();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #52  <Method int String.length()>
	//    5    9:putfield        #54  <Field int charsPerLevel>
		indents = new char[s.length() * 16];
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #52  <Method int String.length()>
	//    9   17:bipush          16
	//   10   19:imul            
	//   11   20:newarray        char[]
	//   12   22:putfield        #56  <Field char[] indents>
		int i = 0;
	//   13   25:iconst_0        
	//   14   26:istore_3        
		int j = i;
	//   15   27:iload_3         
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
	//   23   39:invokevirtual   #52  <Method int String.length()>
	//   24   42:aload_0         
	//   25   43:getfield        #56  <Field char[] indents>
	//   26   46:iload           4
	//   27   48:invokevirtual   #60  <Method void String.getChars(int, int, char[], int)>
			j += s.length();
	//   28   51:iload           4
	//   29   53:aload_1         
	//   30   54:invokevirtual   #52  <Method int String.length()>
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
	//   40   69:putfield        #62  <Field String eol>
	//   41   72:return          
	}

	public String getEol()
	{
		return eol;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field String eol>
	//    2    4:areturn         
	}

	public String getIndent()
	{
		return new String(indents, 0, charsPerLevel);
	//    0    0:new             #48  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field char[] indents>
	//    4    8:iconst_0        
	//    5    9:aload_0         
	//    6   10:getfield        #54  <Field int charsPerLevel>
	//    7   13:invokespecial   #68  <Method void String(char[], int, int)>
	//    8   16:areturn         
	}

	public boolean isInline()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public DefaultIndenter withIndent(String s)
	{
		if(s.equals(((Object) (getIndent()))))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #74  <Method String getIndent()>
	//*   3    5:invokevirtual   #78  <Method boolean String.equals(Object)>
	//*   4    8:ifeq            13
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		else
			return new DefaultIndenter(s, eol);
	//    7   13:new             #2   <Class DefaultIndenter>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #62  <Field String eol>
	//   12   22:invokespecial   #41  <Method void DefaultIndenter(String, String)>
	//   13   25:areturn         
	}

	public DefaultIndenter withLinefeed(String s)
	{
		if(s.equals(((Object) (eol))))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #62  <Field String eol>
	//*   3    5:invokevirtual   #78  <Method boolean String.equals(Object)>
	//*   4    8:ifeq            13
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		else
			return new DefaultIndenter(getIndent(), s);
	//    7   13:new             #2   <Class DefaultIndenter>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokevirtual   #74  <Method String getIndent()>
	//   11   21:aload_1         
	//   12   22:invokespecial   #41  <Method void DefaultIndenter(String, String)>
	//   13   25:areturn         
	}

	public void writeIndentation(JsonGenerator jsongenerator, int i)
		throws IOException
	{
		jsongenerator.writeRaw(eol);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #62  <Field String eol>
	//    3    5:invokevirtual   #89  <Method void JsonGenerator.writeRaw(String)>
		if(i > 0)
	//*   4    8:iload_2         
	//*   5    9:ifle            63
		{
			for(i *= charsPerLevel; i > indents.length; i -= indents.length)
	//*   6   12:iload_2         
	//*   7   13:aload_0         
	//*   8   14:getfield        #54  <Field int charsPerLevel>
	//*   9   17:imul            
	//*  10   18:istore_2        
	//*  11   19:iload_2         
	//*  12   20:aload_0         
	//*  13   21:getfield        #56  <Field char[] indents>
	//*  14   24:arraylength     
	//*  15   25:icmple          53
				jsongenerator.writeRaw(indents, 0, indents.length);
	//   16   28:aload_1         
	//   17   29:aload_0         
	//   18   30:getfield        #56  <Field char[] indents>
	//   19   33:iconst_0        
	//   20   34:aload_0         
	//   21   35:getfield        #56  <Field char[] indents>
	//   22   38:arraylength     
	//   23   39:invokevirtual   #91  <Method void JsonGenerator.writeRaw(char[], int, int)>

	//   24   42:iload_2         
	//   25   43:aload_0         
	//   26   44:getfield        #56  <Field char[] indents>
	//   27   47:arraylength     
	//   28   48:isub            
	//   29   49:istore_2        
	//*  30   50:goto            19
			jsongenerator.writeRaw(indents, 0, i);
	//   31   53:aload_1         
	//   32   54:aload_0         
	//   33   55:getfield        #56  <Field char[] indents>
	//   34   58:iconst_0        
	//   35   59:iload_2         
	//   36   60:invokevirtual   #91  <Method void JsonGenerator.writeRaw(char[], int, int)>
		}
	//   37   63:return          
	}

	private static final int INDENT_LEVELS = 16;
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
	//    0    0:ldc1            #25  <String "line.separator">
	//    1    2:invokestatic    #31  <Method String System.getProperty(String)>
	//    2    5:astore_0        
		}
	//*   3    6:goto            12
	//*   4    9:ldc1            #33  <String "\n">
	//*   5   11:astore_0        
	//*   6   12:aload_0         
	//*   7   13:putstatic       #35  <Field String SYS_LF>
	//*   8   16:new             #2   <Class DefaultIndenter>
	//*   9   19:dup             
	//*  10   20:ldc1            #37  <String "  ">
	//*  11   22:getstatic       #35  <Field String SYS_LF>
	//*  12   25:invokespecial   #41  <Method void DefaultIndenter(String, String)>
	//*  13   28:putstatic       #43  <Field DefaultIndenter SYSTEM_LINEFEED_INSTANCE>
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
