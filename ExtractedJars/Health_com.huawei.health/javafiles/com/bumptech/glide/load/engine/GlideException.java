// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import java.io.*;
import java.util.*;

public final class GlideException extends Exception
{
	static final class IndentedAppendable
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

		IndentedAppendable(Appendable appendable1)
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


	public GlideException(String s)
	{
		this(s, Collections.emptyList());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #34  <Method List Collections.emptyList()>
	//    3    5:invokespecial   #37  <Method void GlideException(String, List)>
	//    4    8:return          
	}

	public GlideException(String s, Exception exception)
	{
		this(s, Collections.singletonList(((Object) (exception))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #42  <Method List Collections.singletonList(Object)>
	//    4    6:invokespecial   #37  <Method void GlideException(String, List)>
	//    5    9:return          
	}

	public GlideException(String s, List list)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #44  <Method void Exception(String)>
		setStackTrace(EMPTY_ELEMENTS);
	//    3    5:aload_0         
	//    4    6:getstatic       #25  <Field StackTraceElement[] EMPTY_ELEMENTS>
	//    5    9:invokevirtual   #48  <Method void setStackTrace(StackTraceElement[])>
		causes = list;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #50  <Field List causes>
	//    9   17:return          
	}

	private void addRootCauses(Exception exception, List list)
	{
		if(exception instanceof GlideException)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class GlideException>
	//*   2    4:ifeq            47
		{
			for(exception = ((Exception) (((GlideException)exception).getCauses().iterator())); ((Iterator) (exception)).hasNext(); addRootCauses((Exception)((Iterator) (exception)).next(), list));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class GlideException>
	//    5   11:invokevirtual   #57  <Method List getCauses()>
	//    6   14:invokeinterface #63  <Method Iterator List.iterator()>
	//    7   19:astore_1        
	//    8   20:aload_1         
	//    9   21:invokeinterface #69  <Method boolean Iterator.hasNext()>
	//   10   26:ifeq            46
	//   11   29:aload_0         
	//   12   30:aload_1         
	//   13   31:invokeinterface #73  <Method Object Iterator.next()>
	//   14   36:checkcast       #4   <Class Exception>
	//   15   39:aload_2         
	//   16   40:invokespecial   #75  <Method void addRootCauses(Exception, List)>
	//*  17   43:goto            20
			return;
	//   18   46:return          
		} else
		{
			list.add(((Object) (exception)));
	//   19   47:aload_2         
	//   20   48:aload_1         
	//   21   49:invokeinterface #79  <Method boolean List.add(Object)>
	//   22   54:pop             
			return;
	//   23   55:return          
		}
	}

	private static void appendCauses(List list, Appendable appendable)
	{
		try
		{
			appendCausesWrapped(list, appendable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #87  <Method void appendCausesWrapped(List, Appendable)>
			return;
	//    3    5:return          
		}
		// Misplaced declaration of an exception variable
		catch(List list)
	//*   4    6:astore_0        
		{
			throw new RuntimeException(((Throwable) (list)));
	//    5    7:new             #89  <Class RuntimeException>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:invokespecial   #92  <Method void RuntimeException(Throwable)>
	//    9   15:athrow          
		}
	}

	private static void appendCausesWrapped(List list, Appendable appendable)
		throws IOException
	{
		int j = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #97  <Method int List.size()>
	//    2    6:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_2        
	//*   5    9:iload_2         
	//*   6   10:iload_3         
	//*   7   11:icmpge          102
		{
			appendable.append("Cause (").append(((CharSequence) (String.valueOf(i + 1)))).append(" of ").append(((CharSequence) (String.valueOf(j)))).append("): ");
	//    8   14:aload_1         
	//    9   15:ldc1            #99  <String "Cause (">
	//   10   17:invokeinterface #105 <Method Appendable Appendable.append(CharSequence)>
	//   11   22:iload_2         
	//   12   23:iconst_1        
	//   13   24:iadd            
	//   14   25:invokestatic    #111 <Method String String.valueOf(int)>
	//   15   28:invokeinterface #105 <Method Appendable Appendable.append(CharSequence)>
	//   16   33:ldc1            #113 <String " of ">
	//   17   35:invokeinterface #105 <Method Appendable Appendable.append(CharSequence)>
	//   18   40:iload_3         
	//   19   41:invokestatic    #111 <Method String String.valueOf(int)>
	//   20   44:invokeinterface #105 <Method Appendable Appendable.append(CharSequence)>
	//   21   49:ldc1            #115 <String "): ">
	//   22   51:invokeinterface #105 <Method Appendable Appendable.append(CharSequence)>
	//   23   56:pop             
			Exception exception = (Exception)list.get(i);
	//   24   57:aload_0         
	//   25   58:iload_2         
	//   26   59:invokeinterface #119 <Method Object List.get(int)>
	//   27   64:checkcast       #4   <Class Exception>
	//   28   67:astore          4
			if(exception instanceof GlideException)
	//*  29   69:aload           4
	//*  30   71:instanceof      #2   <Class GlideException>
	//*  31   74:ifeq            89
				((GlideException)exception).printStackTrace(appendable);
	//   32   77:aload           4
	//   33   79:checkcast       #2   <Class GlideException>
	//   34   82:aload_1         
	//   35   83:invokespecial   #123 <Method void printStackTrace(Appendable)>
			else
	//*  36   86:goto            95
				appendExceptionMessage(exception, appendable);
	//   37   89:aload           4
	//   38   91:aload_1         
	//   39   92:invokestatic    #127 <Method void appendExceptionMessage(Exception, Appendable)>
		}

	//   40   95:iload_2         
	//   41   96:iconst_1        
	//   42   97:iadd            
	//   43   98:istore_2        
	//*  44   99:goto            9
	//   45  102:return          
	}

	private static void appendExceptionMessage(Exception exception, Appendable appendable)
	{
		try
		{
			appendable.append(((CharSequence) (((Object) (exception)).getClass().toString()))).append(": ").append(((CharSequence) (exception.getMessage()))).append('\n');
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #134 <Method Class Object.getClass()>
	//    3    5:invokevirtual   #140 <Method String Class.toString()>
	//    4    8:invokeinterface #105 <Method Appendable Appendable.append(CharSequence)>
	//    5   13:ldc1            #142 <String ": ">
	//    6   15:invokeinterface #105 <Method Appendable Appendable.append(CharSequence)>
	//    7   20:aload_0         
	//    8   21:invokevirtual   #145 <Method String Exception.getMessage()>
	//    9   24:invokeinterface #105 <Method Appendable Appendable.append(CharSequence)>
	//   10   29:bipush          10
	//   11   31:invokeinterface #148 <Method Appendable Appendable.append(char)>
	//   12   36:pop             
			return;
	//   13   37:return          
		}
		// Misplaced declaration of an exception variable
		catch(Appendable appendable)
	//*  14   38:astore_1        
		{
			throw new RuntimeException(((Throwable) (exception)));
	//   15   39:new             #89  <Class RuntimeException>
	//   16   42:dup             
	//   17   43:aload_0         
	//   18   44:invokespecial   #92  <Method void RuntimeException(Throwable)>
	//   19   47:athrow          
		}
	}

	private void printStackTrace(Appendable appendable)
	{
		appendExceptionMessage(((Exception) (this)), appendable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #127 <Method void appendExceptionMessage(Exception, Appendable)>
		appendCauses(getCauses(), ((Appendable) (new IndentedAppendable(appendable))));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #57  <Method List getCauses()>
	//    5    9:new             #6   <Class GlideException$IndentedAppendable>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #150 <Method void GlideException$IndentedAppendable(Appendable)>
	//    9   17:invokestatic    #152 <Method void appendCauses(List, Appendable)>
	//   10   20:return          
	}

	public Throwable fillInStackTrace()
	{
		return ((Throwable) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public List getCauses()
	{
		return causes;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field List causes>
	//    2    4:areturn         
	}

	public String getMessage()
	{
		StringBuilder stringbuilder = (new StringBuilder()).append(super.getMessage());
	//    0    0:new             #157 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #159 <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokespecial   #145 <Method String Exception.getMessage()>
	//    5   11:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:astore_2        
		String s;
		if(dataClass != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #164 <Field Class dataClass>
	//*   9   19:ifnull          48
			s = (new StringBuilder()).append(", ").append(((Object) (dataClass))).toString();
	//   10   22:new             #157 <Class StringBuilder>
	//   11   25:dup             
	//   12   26:invokespecial   #159 <Method void StringBuilder()>
	//   13   29:ldc1            #166 <String ", ">
	//   14   31:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   15   34:aload_0         
	//   16   35:getfield        #164 <Field Class dataClass>
	//   17   38:invokevirtual   #169 <Method StringBuilder StringBuilder.append(Object)>
	//   18   41:invokevirtual   #170 <Method String StringBuilder.toString()>
	//   19   44:astore_1        
		else
	//*  20   45:goto            51
			s = "";
	//   21   48:ldc1            #172 <String "">
	//   22   50:astore_1        
		stringbuilder = stringbuilder.append(s);
	//   23   51:aload_2         
	//   24   52:aload_1         
	//   25   53:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   26   56:astore_2        
		if(dataSource != null)
	//*  27   57:aload_0         
	//*  28   58:getfield        #174 <Field DataSource dataSource>
	//*  29   61:ifnull          90
			s = (new StringBuilder()).append(", ").append(((Object) (dataSource))).toString();
	//   30   64:new             #157 <Class StringBuilder>
	//   31   67:dup             
	//   32   68:invokespecial   #159 <Method void StringBuilder()>
	//   33   71:ldc1            #166 <String ", ">
	//   34   73:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   35   76:aload_0         
	//   36   77:getfield        #174 <Field DataSource dataSource>
	//   37   80:invokevirtual   #169 <Method StringBuilder StringBuilder.append(Object)>
	//   38   83:invokevirtual   #170 <Method String StringBuilder.toString()>
	//   39   86:astore_1        
		else
	//*  40   87:goto            93
			s = "";
	//   41   90:ldc1            #172 <String "">
	//   42   92:astore_1        
		stringbuilder = stringbuilder.append(s);
	//   43   93:aload_2         
	//   44   94:aload_1         
	//   45   95:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   46   98:astore_2        
		if(key != null)
	//*  47   99:aload_0         
	//*  48  100:getfield        #176 <Field Key key>
	//*  49  103:ifnull          132
			s = (new StringBuilder()).append(", ").append(((Object) (key))).toString();
	//   50  106:new             #157 <Class StringBuilder>
	//   51  109:dup             
	//   52  110:invokespecial   #159 <Method void StringBuilder()>
	//   53  113:ldc1            #166 <String ", ">
	//   54  115:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   55  118:aload_0         
	//   56  119:getfield        #176 <Field Key key>
	//   57  122:invokevirtual   #169 <Method StringBuilder StringBuilder.append(Object)>
	//   58  125:invokevirtual   #170 <Method String StringBuilder.toString()>
	//   59  128:astore_1        
		else
	//*  60  129:goto            135
			s = "";
	//   61  132:ldc1            #172 <String "">
	//   62  134:astore_1        
		return stringbuilder.append(s).toString();
	//   63  135:aload_2         
	//   64  136:aload_1         
	//   65  137:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   66  140:invokevirtual   #170 <Method String StringBuilder.toString()>
	//   67  143:areturn         
	}

	public List getRootCauses()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #179 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #180 <Method void ArrayList()>
	//    3    7:astore_1        
		addRootCauses(((Exception) (this)), ((List) (arraylist)));
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #75  <Method void addRootCauses(Exception, List)>
		return ((List) (arraylist));
	//    8   14:aload_1         
	//    9   15:areturn         
	}

	public void logRootCauses(String s)
	{
		List list = getRootCauses();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #183 <Method List getRootCauses()>
	//    2    4:astore          4
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		for(int j = list.size(); i < j; i++)
	//*   5    8:aload           4
	//*   6   10:invokeinterface #97  <Method int List.size()>
	//*   7   15:istore_3        
	//*   8   16:iload_2         
	//*   9   17:iload_3         
	//*  10   18:icmpge          79
			Log.i(s, (new StringBuilder()).append("Root cause (").append(i + 1).append(" of ").append(j).append(")").toString(), (Throwable)list.get(i));
	//   11   21:aload_1         
	//   12   22:new             #157 <Class StringBuilder>
	//   13   25:dup             
	//   14   26:invokespecial   #159 <Method void StringBuilder()>
	//   15   29:ldc1            #185 <String "Root cause (">
	//   16   31:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   17   34:iload_2         
	//   18   35:iconst_1        
	//   19   36:iadd            
	//   20   37:invokevirtual   #188 <Method StringBuilder StringBuilder.append(int)>
	//   21   40:ldc1            #113 <String " of ">
	//   22   42:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   23   45:iload_3         
	//   24   46:invokevirtual   #188 <Method StringBuilder StringBuilder.append(int)>
	//   25   49:ldc1            #190 <String ")">
	//   26   51:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   27   54:invokevirtual   #170 <Method String StringBuilder.toString()>
	//   28   57:aload           4
	//   29   59:iload_2         
	//   30   60:invokeinterface #119 <Method Object List.get(int)>
	//   31   65:checkcast       #192 <Class Throwable>
	//   32   68:invokestatic    #198 <Method int Log.i(String, String, Throwable)>
	//   33   71:pop             

	//   34   72:iload_2         
	//   35   73:iconst_1        
	//   36   74:iadd            
	//   37   75:istore_2        
	//*  38   76:goto            16
	//   39   79:return          
	}

	public void printStackTrace()
	{
		printStackTrace(System.err);
	//    0    0:aload_0         
	//    1    1:getstatic       #204 <Field PrintStream System.err>
	//    2    4:invokevirtual   #207 <Method void printStackTrace(PrintStream)>
	//    3    7:return          
	}

	public void printStackTrace(PrintStream printstream)
	{
		printStackTrace(((Appendable) (printstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #123 <Method void printStackTrace(Appendable)>
	//    3    5:return          
	}

	public void printStackTrace(PrintWriter printwriter)
	{
		printStackTrace(((Appendable) (printwriter)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #123 <Method void printStackTrace(Appendable)>
	//    3    5:return          
	}

	void setLoggingDetails(Key key1, DataSource datasource)
	{
		setLoggingDetails(key1, datasource, ((Class) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #213 <Method void setLoggingDetails(Key, DataSource, Class)>
	//    5    7:return          
	}

	void setLoggingDetails(Key key1, DataSource datasource, Class class1)
	{
		key = key1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #176 <Field Key key>
		dataSource = datasource;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #174 <Field DataSource dataSource>
		dataClass = class1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #164 <Field Class dataClass>
	//    9   15:return          
	}

	private static final StackTraceElement EMPTY_ELEMENTS[] = new StackTraceElement[0];
	private final List causes;
	private Class dataClass;
	private DataSource dataSource;
	private Key key;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       StackTraceElement[]
	//    2    4:putstatic       #25  <Field StackTraceElement[] EMPTY_ELEMENTS>
	//*   3    7:return          
	}
}
