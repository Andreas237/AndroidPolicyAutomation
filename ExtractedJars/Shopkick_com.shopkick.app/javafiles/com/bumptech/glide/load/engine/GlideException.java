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
	private static final class IndentedAppendable
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
	//    2    2:invokestatic    #40  <Method List Collections.emptyList()>
	//    3    5:invokespecial   #43  <Method void GlideException(String, List)>
	//    4    8:return          
	}

	public GlideException(String s, Throwable throwable)
	{
		this(s, Collections.singletonList(((Object) (throwable))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #48  <Method List Collections.singletonList(Object)>
	//    4    6:invokespecial   #43  <Method void GlideException(String, List)>
	//    5    9:return          
	}

	public GlideException(String s, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Exception()>
		detailMessage = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #52  <Field String detailMessage>
		setStackTrace(EMPTY_ELEMENTS);
	//    5    9:aload_0         
	//    6   10:getstatic       #31  <Field StackTraceElement[] EMPTY_ELEMENTS>
	//    7   13:invokevirtual   #56  <Method void setStackTrace(StackTraceElement[])>
		causes = list;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #58  <Field List causes>
	//   11   21:return          
	}

	private void addRootCauses(Throwable throwable, List list)
	{
		if(throwable instanceof GlideException)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class GlideException>
	//*   2    4:ifeq            46
			for(throwable = ((Throwable) (((GlideException)throwable).getCauses().iterator())); ((Iterator) (throwable)).hasNext(); addRootCauses((Throwable)((Iterator) (throwable)).next(), list));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class GlideException>
	//    5   11:invokevirtual   #65  <Method List getCauses()>
	//    6   14:invokeinterface #71  <Method Iterator List.iterator()>
	//    7   19:astore_1        
	//    8   20:aload_1         
	//    9   21:invokeinterface #77  <Method boolean Iterator.hasNext()>
	//   10   26:ifeq            54
	//   11   29:aload_0         
	//   12   30:aload_1         
	//   13   31:invokeinterface #81  <Method Object Iterator.next()>
	//   14   36:checkcast       #83  <Class Throwable>
	//   15   39:aload_2         
	//   16   40:invokespecial   #85  <Method void addRootCauses(Throwable, List)>
		else
	//*  17   43:goto            20
			list.add(((Object) (throwable)));
	//   18   46:aload_2         
	//   19   47:aload_1         
	//   20   48:invokeinterface #89  <Method boolean List.add(Object)>
	//   21   53:pop             
	//   22   54:return          
	}

	private static void appendCauses(List list, Appendable appendable)
	{
		try
		{
			appendCausesWrapped(list, appendable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #97  <Method void appendCausesWrapped(List, Appendable)>
			return;
	//    3    5:return          
		}
		// Misplaced declaration of an exception variable
		catch(List list)
	//*   4    6:astore_0        
		{
			throw new RuntimeException(((Throwable) (list)));
	//    5    7:new             #99  <Class RuntimeException>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:invokespecial   #102 <Method void RuntimeException(Throwable)>
	//    9   15:athrow          
		}
	}

	private static void appendCausesWrapped(List list, Appendable appendable)
		throws IOException
	{
		int k = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #107 <Method int List.size()>
	//    2    6:istore          4
		int j;
		for(int i = 0; i < k; i = j)
	//*   3    8:iconst_0        
	//*   4    9:istore_2        
	//*   5   10:iload_2         
	//*   6   11:iload           4
	//*   7   13:icmpge          109
		{
			Object obj = ((Object) (appendable.append("Cause (")));
	//    8   16:aload_1         
	//    9   17:ldc1            #109 <String "Cause (">
	//   10   19:invokeinterface #115 <Method Appendable Appendable.append(CharSequence)>
	//   11   24:astore          5
			j = i + 1;
	//   12   26:iload_2         
	//   13   27:iconst_1        
	//   14   28:iadd            
	//   15   29:istore_3        
			((Appendable) (obj)).append(((CharSequence) (String.valueOf(j)))).append(" of ").append(((CharSequence) (String.valueOf(k)))).append("): ");
	//   16   30:aload           5
	//   17   32:iload_3         
	//   18   33:invokestatic    #121 <Method String String.valueOf(int)>
	//   19   36:invokeinterface #115 <Method Appendable Appendable.append(CharSequence)>
	//   20   41:ldc1            #123 <String " of ">
	//   21   43:invokeinterface #115 <Method Appendable Appendable.append(CharSequence)>
	//   22   48:iload           4
	//   23   50:invokestatic    #121 <Method String String.valueOf(int)>
	//   24   53:invokeinterface #115 <Method Appendable Appendable.append(CharSequence)>
	//   25   58:ldc1            #125 <String "): ">
	//   26   60:invokeinterface #115 <Method Appendable Appendable.append(CharSequence)>
	//   27   65:pop             
			obj = ((Object) ((Throwable)list.get(i)));
	//   28   66:aload_0         
	//   29   67:iload_2         
	//   30   68:invokeinterface #129 <Method Object List.get(int)>
	//   31   73:checkcast       #83  <Class Throwable>
	//   32   76:astore          5
			if(obj instanceof GlideException)
	//*  33   78:aload           5
	//*  34   80:instanceof      #2   <Class GlideException>
	//*  35   83:ifeq            98
				((GlideException)obj).printStackTrace(appendable);
	//   36   86:aload           5
	//   37   88:checkcast       #2   <Class GlideException>
	//   38   91:aload_1         
	//   39   92:invokespecial   #133 <Method void printStackTrace(Appendable)>
			else
	//*  40   95:goto            104
				appendExceptionMessage(((Throwable) (obj)), appendable);
	//   41   98:aload           5
	//   42  100:aload_1         
	//   43  101:invokestatic    #137 <Method void appendExceptionMessage(Throwable, Appendable)>
		}

	//   44  104:iload_3         
	//   45  105:istore_2        
	//*  46  106:goto            10
	//   47  109:return          
	}

	private static void appendExceptionMessage(Throwable throwable, Appendable appendable)
	{
		try
		{
			appendable.append(((CharSequence) (((Object) (throwable)).getClass().toString()))).append(": ").append(((CharSequence) (throwable.getMessage()))).append('\n');
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #144 <Method Class Object.getClass()>
	//    3    5:invokevirtual   #150 <Method String Class.toString()>
	//    4    8:invokeinterface #115 <Method Appendable Appendable.append(CharSequence)>
	//    5   13:ldc1            #152 <String ": ">
	//    6   15:invokeinterface #115 <Method Appendable Appendable.append(CharSequence)>
	//    7   20:aload_0         
	//    8   21:invokevirtual   #155 <Method String Throwable.getMessage()>
	//    9   24:invokeinterface #115 <Method Appendable Appendable.append(CharSequence)>
	//   10   29:bipush          10
	//   11   31:invokeinterface #158 <Method Appendable Appendable.append(char)>
	//   12   36:pop             
			return;
	//   13   37:return          
		}
	//*  14   38:new             #99  <Class RuntimeException>
	//*  15   41:dup             
	//*  16   42:aload_0         
	//*  17   43:invokespecial   #102 <Method void RuntimeException(Throwable)>
	//*  18   46:athrow          
		// Misplaced declaration of an exception variable
		catch(Appendable appendable)
		{
			throw new RuntimeException(throwable);
		}
	//*  19   47:astore_1        
	//*  20   48:goto            38
	}

	private void printStackTrace(Appendable appendable)
	{
		appendExceptionMessage(((Throwable) (this)), appendable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #137 <Method void appendExceptionMessage(Throwable, Appendable)>
		appendCauses(getCauses(), ((Appendable) (new IndentedAppendable(appendable))));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #65  <Method List getCauses()>
	//    5    9:new             #6   <Class GlideException$IndentedAppendable>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #160 <Method void GlideException$IndentedAppendable(Appendable)>
	//    9   17:invokestatic    #162 <Method void appendCauses(List, Appendable)>
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
	//    1    1:getfield        #58  <Field List causes>
	//    2    4:areturn         
	}

	public String getMessage()
	{
		StringBuilder stringbuilder = new StringBuilder(71);
	//    0    0:new             #167 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          71
	//    3    6:invokespecial   #170 <Method void StringBuilder(int)>
	//    4    9:astore_2        
		stringbuilder.append(detailMessage);
	//    5   10:aload_2         
	//    6   11:aload_0         
	//    7   12:getfield        #52  <Field String detailMessage>
	//    8   15:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		Object obj;
		if(dataClass != null)
	//*  10   19:aload_0         
	//*  11   20:getfield        #175 <Field Class dataClass>
	//*  12   23:ifnull          58
		{
			obj = ((Object) (new StringBuilder()));
	//   13   26:new             #167 <Class StringBuilder>
	//   14   29:dup             
	//   15   30:invokespecial   #176 <Method void StringBuilder()>
	//   16   33:astore_1        
			((StringBuilder) (obj)).append(", ");
	//   17   34:aload_1         
	//   18   35:ldc1            #178 <String ", ">
	//   19   37:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//   20   40:pop             
			((StringBuilder) (obj)).append(((Object) (dataClass)));
	//   21   41:aload_1         
	//   22   42:aload_0         
	//   23   43:getfield        #175 <Field Class dataClass>
	//   24   46:invokevirtual   #181 <Method StringBuilder StringBuilder.append(Object)>
	//   25   49:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   26   50:aload_1         
	//   27   51:invokevirtual   #182 <Method String StringBuilder.toString()>
	//   28   54:astore_1        
		} else
	//*  29   55:goto            61
		{
			obj = "";
	//   30   58:ldc1            #184 <String "">
	//   31   60:astore_1        
		}
		stringbuilder.append(((String) (obj)));
	//   32   61:aload_2         
	//   33   62:aload_1         
	//   34   63:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//   35   66:pop             
		if(dataSource != null)
	//*  36   67:aload_0         
	//*  37   68:getfield        #186 <Field DataSource dataSource>
	//*  38   71:ifnull          106
		{
			obj = ((Object) (new StringBuilder()));
	//   39   74:new             #167 <Class StringBuilder>
	//   40   77:dup             
	//   41   78:invokespecial   #176 <Method void StringBuilder()>
	//   42   81:astore_1        
			((StringBuilder) (obj)).append(", ");
	//   43   82:aload_1         
	//   44   83:ldc1            #178 <String ", ">
	//   45   85:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//   46   88:pop             
			((StringBuilder) (obj)).append(((Object) (dataSource)));
	//   47   89:aload_1         
	//   48   90:aload_0         
	//   49   91:getfield        #186 <Field DataSource dataSource>
	//   50   94:invokevirtual   #181 <Method StringBuilder StringBuilder.append(Object)>
	//   51   97:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   52   98:aload_1         
	//   53   99:invokevirtual   #182 <Method String StringBuilder.toString()>
	//   54  102:astore_1        
		} else
	//*  55  103:goto            109
		{
			obj = "";
	//   56  106:ldc1            #184 <String "">
	//   57  108:astore_1        
		}
		stringbuilder.append(((String) (obj)));
	//   58  109:aload_2         
	//   59  110:aload_1         
	//   60  111:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//   61  114:pop             
		if(key != null)
	//*  62  115:aload_0         
	//*  63  116:getfield        #188 <Field Key key>
	//*  64  119:ifnull          154
		{
			obj = ((Object) (new StringBuilder()));
	//   65  122:new             #167 <Class StringBuilder>
	//   66  125:dup             
	//   67  126:invokespecial   #176 <Method void StringBuilder()>
	//   68  129:astore_1        
			((StringBuilder) (obj)).append(", ");
	//   69  130:aload_1         
	//   70  131:ldc1            #178 <String ", ">
	//   71  133:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//   72  136:pop             
			((StringBuilder) (obj)).append(((Object) (key)));
	//   73  137:aload_1         
	//   74  138:aload_0         
	//   75  139:getfield        #188 <Field Key key>
	//   76  142:invokevirtual   #181 <Method StringBuilder StringBuilder.append(Object)>
	//   77  145:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   78  146:aload_1         
	//   79  147:invokevirtual   #182 <Method String StringBuilder.toString()>
	//   80  150:astore_1        
		} else
	//*  81  151:goto            157
		{
			obj = "";
	//   82  154:ldc1            #184 <String "">
	//   83  156:astore_1        
		}
		stringbuilder.append(((String) (obj)));
	//   84  157:aload_2         
	//   85  158:aload_1         
	//   86  159:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//   87  162:pop             
		obj = ((Object) (getRootCauses()));
	//   88  163:aload_0         
	//   89  164:invokevirtual   #191 <Method List getRootCauses()>
	//   90  167:astore_1        
		if(((List) (obj)).isEmpty())
	//*  91  168:aload_1         
	//*  92  169:invokeinterface #194 <Method boolean List.isEmpty()>
	//*  93  174:ifeq            182
			return stringbuilder.toString();
	//   94  177:aload_2         
	//   95  178:invokevirtual   #182 <Method String StringBuilder.toString()>
	//   96  181:areturn         
		if(((List) (obj)).size() == 1)
	//*  97  182:aload_1         
	//*  98  183:invokeinterface #107 <Method int List.size()>
	//*  99  188:iconst_1        
	//* 100  189:icmpne          202
		{
			stringbuilder.append("\nThere was 1 cause:");
	//  101  192:aload_2         
	//  102  193:ldc1            #196 <String "\nThere was 1 cause:">
	//  103  195:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//  104  198:pop             
		} else
	//* 105  199:goto            227
		{
			stringbuilder.append("\nThere were ");
	//  106  202:aload_2         
	//  107  203:ldc1            #198 <String "\nThere were ">
	//  108  205:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//  109  208:pop             
			stringbuilder.append(((List) (obj)).size());
	//  110  209:aload_2         
	//  111  210:aload_1         
	//  112  211:invokeinterface #107 <Method int List.size()>
	//  113  216:invokevirtual   #201 <Method StringBuilder StringBuilder.append(int)>
	//  114  219:pop             
			stringbuilder.append(" causes:");
	//  115  220:aload_2         
	//  116  221:ldc1            #203 <String " causes:">
	//  117  223:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//  118  226:pop             
		}
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); stringbuilder.append(')'))
	//* 119  227:aload_1         
	//* 120  228:invokeinterface #71  <Method Iterator List.iterator()>
	//* 121  233:astore_1        
	//* 122  234:aload_1         
	//* 123  235:invokeinterface #77  <Method boolean Iterator.hasNext()>
	//* 124  240:ifeq            298
		{
			Throwable throwable = (Throwable)((Iterator) (obj)).next();
	//  125  243:aload_1         
	//  126  244:invokeinterface #81  <Method Object Iterator.next()>
	//  127  249:checkcast       #83  <Class Throwable>
	//  128  252:astore_3        
			stringbuilder.append('\n');
	//  129  253:aload_2         
	//  130  254:bipush          10
	//  131  256:invokevirtual   #206 <Method StringBuilder StringBuilder.append(char)>
	//  132  259:pop             
			stringbuilder.append(((Object) (throwable)).getClass().getName());
	//  133  260:aload_2         
	//  134  261:aload_3         
	//  135  262:invokevirtual   #144 <Method Class Object.getClass()>
	//  136  265:invokevirtual   #209 <Method String Class.getName()>
	//  137  268:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//  138  271:pop             
			stringbuilder.append('(');
	//  139  272:aload_2         
	//  140  273:bipush          40
	//  141  275:invokevirtual   #206 <Method StringBuilder StringBuilder.append(char)>
	//  142  278:pop             
			stringbuilder.append(throwable.getMessage());
	//  143  279:aload_2         
	//  144  280:aload_3         
	//  145  281:invokevirtual   #155 <Method String Throwable.getMessage()>
	//  146  284:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//  147  287:pop             
		}

	//  148  288:aload_2         
	//  149  289:bipush          41
	//  150  291:invokevirtual   #206 <Method StringBuilder StringBuilder.append(char)>
	//  151  294:pop             
	//* 152  295:goto            234
		stringbuilder.append("\n call GlideException#logRootCauses(String) for more detail");
	//  153  298:aload_2         
	//  154  299:ldc1            #211 <String "\n call GlideException#logRootCauses(String) for more detail">
	//  155  301:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//  156  304:pop             
		return stringbuilder.toString();
	//  157  305:aload_2         
	//  158  306:invokevirtual   #182 <Method String StringBuilder.toString()>
	//  159  309:areturn         
	}

	public List getRootCauses()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #213 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #214 <Method void ArrayList()>
	//    3    7:astore_1        
		addRootCauses(((Throwable) (this)), ((List) (arraylist)));
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #85  <Method void addRootCauses(Throwable, List)>
		return ((List) (arraylist));
	//    8   14:aload_1         
	//    9   15:areturn         
	}

	public void logRootCauses(String s)
	{
		List list = getRootCauses();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #191 <Method List getRootCauses()>
	//    2    4:astore          5
		int k = list.size();
	//    3    6:aload           5
	//    4    8:invokeinterface #107 <Method int List.size()>
	//    5   13:istore          4
		int j;
		for(int i = 0; i < k; i = j)
	//*   6   15:iconst_0        
	//*   7   16:istore_2        
	//*   8   17:iload_2         
	//*   9   18:iload           4
	//*  10   20:icmpge          101
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   23:new             #167 <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #176 <Method void StringBuilder()>
	//   14   30:astore          6
			stringbuilder.append("Root cause (");
	//   15   32:aload           6
	//   16   34:ldc1            #217 <String "Root cause (">
	//   17   36:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//   18   39:pop             
			j = i + 1;
	//   19   40:iload_2         
	//   20   41:iconst_1        
	//   21   42:iadd            
	//   22   43:istore_3        
			stringbuilder.append(j);
	//   23   44:aload           6
	//   24   46:iload_3         
	//   25   47:invokevirtual   #201 <Method StringBuilder StringBuilder.append(int)>
	//   26   50:pop             
			stringbuilder.append(" of ");
	//   27   51:aload           6
	//   28   53:ldc1            #123 <String " of ">
	//   29   55:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//   30   58:pop             
			stringbuilder.append(k);
	//   31   59:aload           6
	//   32   61:iload           4
	//   33   63:invokevirtual   #201 <Method StringBuilder StringBuilder.append(int)>
	//   34   66:pop             
			stringbuilder.append(")");
	//   35   67:aload           6
	//   36   69:ldc1            #219 <String ")">
	//   37   71:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//   38   74:pop             
			Log.i(s, stringbuilder.toString(), (Throwable)list.get(i));
	//   39   75:aload_1         
	//   40   76:aload           6
	//   41   78:invokevirtual   #182 <Method String StringBuilder.toString()>
	//   42   81:aload           5
	//   43   83:iload_2         
	//   44   84:invokeinterface #129 <Method Object List.get(int)>
	//   45   89:checkcast       #83  <Class Throwable>
	//   46   92:invokestatic    #225 <Method int Log.i(String, String, Throwable)>
	//   47   95:pop             
		}

	//   48   96:iload_3         
	//   49   97:istore_2        
	//*  50   98:goto            17
	//   51  101:return          
	}

	public void printStackTrace()
	{
		printStackTrace(System.err);
	//    0    0:aload_0         
	//    1    1:getstatic       #231 <Field PrintStream System.err>
	//    2    4:invokevirtual   #234 <Method void printStackTrace(PrintStream)>
	//    3    7:return          
	}

	public void printStackTrace(PrintStream printstream)
	{
		printStackTrace(((Appendable) (printstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #133 <Method void printStackTrace(Appendable)>
	//    3    5:return          
	}

	public void printStackTrace(PrintWriter printwriter)
	{
		printStackTrace(((Appendable) (printwriter)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #133 <Method void printStackTrace(Appendable)>
	//    3    5:return          
	}

	void setLoggingDetails(Key key1, DataSource datasource)
	{
		setLoggingDetails(key1, datasource, ((Class) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #240 <Method void setLoggingDetails(Key, DataSource, Class)>
	//    5    7:return          
	}

	void setLoggingDetails(Key key1, DataSource datasource, Class class1)
	{
		key = key1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #188 <Field Key key>
		dataSource = datasource;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #186 <Field DataSource dataSource>
		dataClass = class1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #175 <Field Class dataClass>
	//    9   15:return          
	}

	private static final StackTraceElement EMPTY_ELEMENTS[] = new StackTraceElement[0];
	private static final long serialVersionUID = 1L;
	private final List causes;
	private Class dataClass;
	private DataSource dataSource;
	private String detailMessage;
	private Key key;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       StackTraceElement[]
	//    2    4:putstatic       #31  <Field StackTraceElement[] EMPTY_ELEMENTS>
	//*   3    7:return          
	}
}
