// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.apache.commons.lang3.exception;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import org.apache.commons.lang3.*;

public class ExceptionUtils
{

	public ExceptionUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
	//    2    4:return          
	}

	public static Throwable getCause(Throwable throwable)
	{
		return getCause(throwable, CAUSE_METHOD_NAMES);
	//    0    0:aload_0         
	//    1    1:getstatic       #40  <Field String[] CAUSE_METHOD_NAMES>
	//    2    4:invokestatic    #49  <Method Throwable getCause(Throwable, String[])>
	//    3    7:areturn         
	}

	public static Throwable getCause(Throwable throwable, String as[])
	{
		if(throwable != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       8
_L1:
		as = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
_L6:
		return ((Throwable) (as));
	//    4    6:aload_1         
	//    5    7:areturn         
_L2:
		int i;
		int j;
		String as1[];
		as1 = as;
	//    6    8:aload_1         
	//    7    9:astore          4
		if(as == null)
	//*   8   11:aload_1         
	//*   9   12:ifnonnull       20
			as1 = CAUSE_METHOD_NAMES;
	//   10   15:getstatic       #40  <Field String[] CAUSE_METHOD_NAMES>
	//   11   18:astore          4
		j = as1.length;
	//   12   20:aload           4
	//   13   22:arraylength     
	//   14   23:istore_3        
		i = 0;
	//   15   24:iconst_0        
	//   16   25:istore_2        
_L7:
		if(i >= j) goto _L4; else goto _L3
	//   17   26:iload_2         
	//   18   27:iload_3         
	//   19   28:icmpge          62
_L3:
		Throwable throwable1;
		as = ((String []) (as1[i]));
	//   20   31:aload           4
	//   21   33:iload_2         
	//   22   34:aaload          
	//   23   35:astore_1        
		if(as == null)
			continue; /* Loop/switch isn't completed */
	//   24   36:aload_1         
	//   25   37:ifnull          55
		throwable1 = getCauseUsingMethodName(throwable, ((String) (as)));
	//   26   40:aload_0         
	//   27   41:aload_1         
	//   28   42:invokestatic    #54  <Method Throwable getCauseUsingMethodName(Throwable, String)>
	//   29   45:astore          5
		as = ((String []) (throwable1));
	//   30   47:aload           5
	//   31   49:astore_1        
		if(throwable1 != null) goto _L6; else goto _L5
	//   32   50:aload           5
	//   33   52:ifnonnull       6
_L5:
		i++;
	//   34   55:iload_2         
	//   35   56:iconst_1        
	//   36   57:iadd            
	//   37   58:istore_2        
		  goto _L7
	//*  38   59:goto            26
_L4:
		return null;
	//   39   62:aconst_null     
	//   40   63:areturn         
	}

	private static Throwable getCauseUsingMethodName(Throwable throwable, String s)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		try
		{
			s = ((String) (((Object) (throwable)).getClass().getMethod(s, new Class[0])));
	//    2    2:aload_0         
	//    3    3:invokevirtual   #68  <Method Class Object.getClass()>
	//    4    6:aload_1         
	//    5    7:iconst_0        
	//    6    8:anewarray       Class[]
	//    7   11:invokevirtual   #74  <Method Method Class.getMethod(String, Class[])>
	//    8   14:astore_1        
		}
	//*   9   15:aload_1         
	//*  10   16:ifnull          47
	//*  11   19:ldc1            #76  <Class Throwable>
	//*  12   21:aload_1         
	//*  13   22:invokevirtual   #81  <Method Class Method.getReturnType()>
	//*  14   25:invokevirtual   #85  <Method boolean Class.isAssignableFrom(Class)>
	//*  15   28:ifeq            47
	//*  16   31:aload_1         
	//*  17   32:aload_0         
	//*  18   33:iconst_0        
	//*  19   34:anewarray       Object[]
	//*  20   37:invokevirtual   #89  <Method Object Method.invoke(Object, Object[])>
	//*  21   40:checkcast       #76  <Class Throwable>
	//*  22   43:astore_0        
	//*  23   44:aload_0         
	//*  24   45:areturn         
	//*  25   46:astore_0        
	//*  26   47:aconst_null     
	//*  27   48:areturn         
	//*  28   49:astore_0        
	//*  29   50:goto            47
	//*  30   53:astore_0        
	//*  31   54:goto            47
	//*  32   57:astore_1        
	//*  33   58:aload_2         
	//*  34   59:astore_1        
	//*  35   60:goto            15
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  36   63:astore_1        
		{
			s = ((String) (obj));
	//   37   64:aload_2         
	//   38   65:astore_1        
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			s = ((String) (obj));
		}
		if(s == null || !((Class) (java/lang/Throwable)).isAssignableFrom(((Method) (s)).getReturnType()))
			break MISSING_BLOCK_LABEL_47;
		throwable = (Throwable)((Method) (s)).invoke(((Object) (throwable)), new Object[0]);
		return throwable;
		throwable;
_L2:
		return null;
		throwable;
		continue; /* Loop/switch isn't completed */
		throwable;
		if(true) goto _L2; else goto _L1
_L1:
	//*  39   66:goto            15
	}

	public static String[] getDefaultCauseMethodNames()
	{
		return (String[])ArrayUtils.clone(((Object []) (CAUSE_METHOD_NAMES)));
	//    0    0:getstatic       #40  <Field String[] CAUSE_METHOD_NAMES>
	//    1    3:invokestatic    #97  <Method Object[] ArrayUtils.clone(Object[])>
	//    2    6:checkcast       #98  <Class String[]>
	//    3    9:areturn         
	}

	public static String getMessage(Throwable throwable)
	{
		if(throwable == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
		{
			return "";
	//    2    4:ldc1            #102 <String "">
	//    3    6:areturn         
		} else
		{
			String s = ClassUtils.getShortClassName(((Object) (throwable)), ((String) (null)));
	//    4    7:aload_0         
	//    5    8:aconst_null     
	//    6    9:invokestatic    #108 <Method String ClassUtils.getShortClassName(Object, String)>
	//    7   12:astore_1        
			throwable = ((Throwable) (throwable.getMessage()));
	//    8   13:aload_0         
	//    9   14:invokevirtual   #111 <Method String Throwable.getMessage()>
	//   10   17:astore_0        
			return (new StringBuilder()).append(s).append(": ").append(StringUtils.defaultString(((String) (throwable)))).toString();
	//   11   18:new             #113 <Class StringBuilder>
	//   12   21:dup             
	//   13   22:invokespecial   #114 <Method void StringBuilder()>
	//   14   25:aload_1         
	//   15   26:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   16   29:ldc1            #120 <String ": ">
	//   17   31:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   18   34:aload_0         
	//   19   35:invokestatic    #126 <Method String StringUtils.defaultString(String)>
	//   20   38:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   21   41:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   22   44:areturn         
		}
	}

	public static Throwable getRootCause(Throwable throwable)
	{
		throwable = ((Throwable) (getThrowableList(throwable)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #133 <Method List getThrowableList(Throwable)>
	//    2    4:astore_0        
		if(((List) (throwable)).size() < 2)
	//*   3    5:aload_0         
	//*   4    6:invokeinterface #139 <Method int List.size()>
	//*   5   11:iconst_2        
	//*   6   12:icmpge          17
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
		else
			return (Throwable)((List) (throwable)).get(((List) (throwable)).size() - 1);
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:invokeinterface #139 <Method int List.size()>
	//   12   24:iconst_1        
	//   13   25:isub            
	//   14   26:invokeinterface #143 <Method Object List.get(int)>
	//   15   31:checkcast       #76  <Class Throwable>
	//   16   34:areturn         
	}

	public static String getRootCauseMessage(Throwable throwable)
	{
		Throwable throwable2 = getRootCause(throwable);
	//    0    0:aload_0         
	//    1    1:invokestatic    #146 <Method Throwable getRootCause(Throwable)>
	//    2    4:astore_2        
		Throwable throwable1 = throwable2;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(throwable2 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       13
			throwable1 = throwable;
	//    7   11:aload_0         
	//    8   12:astore_1        
		return getMessage(throwable1);
	//    9   13:aload_1         
	//   10   14:invokestatic    #148 <Method String getMessage(Throwable)>
	//   11   17:areturn         
	}

	public static String[] getRootCauseStackTrace(Throwable throwable)
	{
		ArrayList arraylist;
		if(throwable == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return ArrayUtils.EMPTY_STRING_ARRAY;
	//    2    4:getstatic       #153 <Field String[] ArrayUtils.EMPTY_STRING_ARRAY>
	//    3    7:areturn         
		Throwable athrowable[] = getThrowables(throwable);
	//    4    8:aload_0         
	//    5    9:invokestatic    #157 <Method Throwable[] getThrowables(Throwable)>
	//    6   12:astore          7
		int k = athrowable.length;
	//    7   14:aload           7
	//    8   16:arraylength     
	//    9   17:istore_3        
		arraylist = new ArrayList();
	//   10   18:new             #159 <Class ArrayList>
	//   11   21:dup             
	//   12   22:invokespecial   #160 <Method void ArrayList()>
	//   13   25:astore          8
		throwable = ((Throwable) (getStackFrameList(athrowable[k - 1])));
	//   14   27:aload           7
	//   15   29:iload_3         
	//   16   30:iconst_1        
	//   17   31:isub            
	//   18   32:aaload          
	//   19   33:invokestatic    #163 <Method List getStackFrameList(Throwable)>
	//   20   36:astore_0        
		int i = k;
	//   21   37:iload_3         
	//   22   38:istore_1        
		do
		{
label0:
			{
				Throwable throwable1 = throwable;
	//   23   39:aload_0         
	//   24   40:astore          5
				int l = i - 1;
	//   25   42:iload_1         
	//   26   43:iconst_1        
	//   27   44:isub            
	//   28   45:istore          4
				if(l < 0)
					break label0;
	//   29   47:iload           4
	//   30   49:iflt            183
				throwable = throwable1;
	//   31   52:aload           5
	//   32   54:astore_0        
				if(l != 0)
	//*  33   55:iload           4
	//*  34   57:ifeq            77
				{
					throwable = ((Throwable) (getStackFrameList(athrowable[l - 1])));
	//   35   60:aload           7
	//   36   62:iload           4
	//   37   64:iconst_1        
	//   38   65:isub            
	//   39   66:aaload          
	//   40   67:invokestatic    #163 <Method List getStackFrameList(Throwable)>
	//   41   70:astore_0        
					removeCommonFrames(((List) (throwable1)), ((List) (throwable)));
	//   42   71:aload           5
	//   43   73:aload_0         
	//   44   74:invokestatic    #167 <Method void removeCommonFrames(List, List)>
				}
				Throwable throwable2 = throwable;
	//   45   77:aload_0         
	//   46   78:astore          6
				int j;
				if(l == k - 1)
	//*  47   80:iload           4
	//*  48   82:iload_3         
	//*  49   83:iconst_1        
	//*  50   84:isub            
	//*  51   85:icmpne          146
					((List) (arraylist)).add(((Object) (athrowable[l].toString())));
	//   52   88:aload           8
	//   53   90:aload           7
	//   54   92:iload           4
	//   55   94:aaload          
	//   56   95:invokevirtual   #168 <Method String Throwable.toString()>
	//   57   98:invokeinterface #172 <Method boolean List.add(Object)>
	//   58  103:pop             
				else
	//*  59  104:iconst_0        
	//*  60  105:istore_2        
	//*  61  106:iload           4
	//*  62  108:istore_1        
	//*  63  109:aload           6
	//*  64  111:astore_0        
	//*  65  112:iload_2         
	//*  66  113:aload           5
	//*  67  115:invokeinterface #139 <Method int List.size()>
	//*  68  120:icmpge          39
	//*  69  123:aload           8
	//*  70  125:aload           5
	//*  71  127:iload_2         
	//*  72  128:invokeinterface #143 <Method Object List.get(int)>
	//*  73  133:invokeinterface #172 <Method boolean List.add(Object)>
	//*  74  138:pop             
	//*  75  139:iload_2         
	//*  76  140:iconst_1        
	//*  77  141:iadd            
	//*  78  142:istore_2        
	//*  79  143:goto            106
					((List) (arraylist)).add(((Object) ((new StringBuilder()).append(" [wrapped] ").append(athrowable[l].toString()).toString())));
	//   80  146:aload           8
	//   81  148:new             #113 <Class StringBuilder>
	//   82  151:dup             
	//   83  152:invokespecial   #114 <Method void StringBuilder()>
	//   84  155:ldc1            #10  <String " [wrapped] ">
	//   85  157:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   86  160:aload           7
	//   87  162:iload           4
	//   88  164:aaload          
	//   89  165:invokevirtual   #168 <Method String Throwable.toString()>
	//   90  168:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   91  171:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   92  174:invokeinterface #172 <Method boolean List.add(Object)>
	//   93  179:pop             
				j = 0;
				do
				{
					i = l;
					throwable = throwable2;
					if(j >= ((List) (throwable1)).size())
						break;
					((List) (arraylist)).add(((List) (throwable1)).get(j));
					j++;
				} while(true);
			}
		} while(true);
	//   94  180:goto            104
		return (String[])((List) (arraylist)).toArray(((Object []) (new String[((List) (arraylist)).size()])));
	//   95  183:aload           8
	//   96  185:aload           8
	//   97  187:invokeinterface #139 <Method int List.size()>
	//   98  192:anewarray       String[]
	//   99  195:invokeinterface #175 <Method Object[] List.toArray(Object[])>
	//  100  200:checkcast       #98  <Class String[]>
	//  101  203:areturn         
	}

	static List getStackFrameList(Throwable throwable)
	{
		throwable = ((Throwable) (new StringTokenizer(getStackTrace(throwable), SystemUtils.LINE_SEPARATOR)));
	//    0    0:new             #177 <Class StringTokenizer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #180 <Method String getStackTrace(Throwable)>
	//    4    8:getstatic       #185 <Field String SystemUtils.LINE_SEPARATOR>
	//    5   11:invokespecial   #188 <Method void StringTokenizer(String, String)>
	//    6   14:astore_0        
		ArrayList arraylist = new ArrayList();
	//    7   15:new             #159 <Class ArrayList>
	//    8   18:dup             
	//    9   19:invokespecial   #160 <Method void ArrayList()>
	//   10   22:astore_3        
		boolean flag = false;
	//   11   23:iconst_0        
	//   12   24:istore_1        
label0:
		do
			do
			{
				if(!((StringTokenizer) (throwable)).hasMoreTokens())
					break label0;
	//   13   25:aload_0         
	//   14   26:invokevirtual   #192 <Method boolean StringTokenizer.hasMoreTokens()>
	//   15   29:ifeq            85
				String s = ((StringTokenizer) (throwable)).nextToken();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #195 <Method String StringTokenizer.nextToken()>
	//   18   36:astore          4
				int i = s.indexOf("at");
	//   19   38:aload           4
	//   20   40:ldc1            #197 <String "at">
	//   21   42:invokevirtual   #201 <Method int String.indexOf(String)>
	//   22   45:istore_2        
				if(i == -1 || s.substring(0, i).trim().length() != 0)
					continue label0;
	//   23   46:iload_2         
	//   24   47:iconst_m1       
	//   25   48:icmpeq          81
	//   26   51:aload           4
	//   27   53:iconst_0        
	//   28   54:iload_2         
	//   29   55:invokevirtual   #205 <Method String String.substring(int, int)>
	//   30   58:invokevirtual   #208 <Method String String.trim()>
	//   31   61:invokevirtual   #211 <Method int String.length()>
	//   32   64:ifne            81
				flag = true;
	//   33   67:iconst_1        
	//   34   68:istore_1        
				((List) (arraylist)).add(((Object) (s)));
	//   35   69:aload_3         
	//   36   70:aload           4
	//   37   72:invokeinterface #172 <Method boolean List.add(Object)>
	//   38   77:pop             
			} while(true);
	//   39   78:goto            25
		while(!flag);
	//   40   81:iload_1         
	//   41   82:ifeq            25
		return ((List) (arraylist));
	//   42   85:aload_3         
	//   43   86:areturn         
	}

	static String[] getStackFrames(String s)
	{
		s = ((String) (new StringTokenizer(s, SystemUtils.LINE_SEPARATOR)));
	//    0    0:new             #177 <Class StringTokenizer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #185 <Field String SystemUtils.LINE_SEPARATOR>
	//    4    8:invokespecial   #188 <Method void StringTokenizer(String, String)>
	//    5   11:astore_0        
		ArrayList arraylist = new ArrayList();
	//    6   12:new             #159 <Class ArrayList>
	//    7   15:dup             
	//    8   16:invokespecial   #160 <Method void ArrayList()>
	//    9   19:astore_1        
		for(; ((StringTokenizer) (s)).hasMoreTokens(); ((List) (arraylist)).add(((Object) (((StringTokenizer) (s)).nextToken()))));
	//   10   20:aload_0         
	//   11   21:invokevirtual   #192 <Method boolean StringTokenizer.hasMoreTokens()>
	//   12   24:ifeq            41
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:invokevirtual   #195 <Method String StringTokenizer.nextToken()>
	//   16   32:invokeinterface #172 <Method boolean List.add(Object)>
	//   17   37:pop             
	//*  18   38:goto            20
		return (String[])((List) (arraylist)).toArray(((Object []) (new String[((List) (arraylist)).size()])));
	//   19   41:aload_1         
	//   20   42:aload_1         
	//   21   43:invokeinterface #139 <Method int List.size()>
	//   22   48:anewarray       String[]
	//   23   51:invokeinterface #175 <Method Object[] List.toArray(Object[])>
	//   24   56:checkcast       #98  <Class String[]>
	//   25   59:areturn         
	}

	public static String[] getStackFrames(Throwable throwable)
	{
		if(throwable == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return ArrayUtils.EMPTY_STRING_ARRAY;
	//    2    4:getstatic       #153 <Field String[] ArrayUtils.EMPTY_STRING_ARRAY>
	//    3    7:areturn         
		else
			return getStackFrames(getStackTrace(throwable));
	//    4    8:aload_0         
	//    5    9:invokestatic    #180 <Method String getStackTrace(Throwable)>
	//    6   12:invokestatic    #217 <Method String[] getStackFrames(String)>
	//    7   15:areturn         
	}

	public static String getStackTrace(Throwable throwable)
	{
		StringWriter stringwriter = new StringWriter();
	//    0    0:new             #219 <Class StringWriter>
	//    1    3:dup             
	//    2    4:invokespecial   #220 <Method void StringWriter()>
	//    3    7:astore_1        
		throwable.printStackTrace(new PrintWriter(((java.io.Writer) (stringwriter)), true));
	//    4    8:aload_0         
	//    5    9:new             #222 <Class PrintWriter>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:iconst_1        
	//    9   15:invokespecial   #225 <Method void PrintWriter(java.io.Writer, boolean)>
	//   10   18:invokevirtual   #229 <Method void Throwable.printStackTrace(PrintWriter)>
		return stringwriter.getBuffer().toString();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #233 <Method StringBuffer StringWriter.getBuffer()>
	//   13   25:invokevirtual   #236 <Method String StringBuffer.toString()>
	//   14   28:areturn         
	}

	public static int getThrowableCount(Throwable throwable)
	{
		return getThrowableList(throwable).size();
	//    0    0:aload_0         
	//    1    1:invokestatic    #133 <Method List getThrowableList(Throwable)>
	//    2    4:invokeinterface #139 <Method int List.size()>
	//    3    9:ireturn         
	}

	public static List getThrowableList(Throwable throwable)
	{
		ArrayList arraylist;
		for(arraylist = new ArrayList(); throwable != null && !((List) (arraylist)).contains(((Object) (throwable))); throwable = getCause(throwable))
	//*   0    0:new             #159 <Class ArrayList>
	//*   1    3:dup             
	//*   2    4:invokespecial   #160 <Method void ArrayList()>
	//*   3    7:astore_1        
	//*   4    8:aload_0         
	//*   5    9:ifnull          38
	//*   6   12:aload_1         
	//*   7   13:aload_0         
	//*   8   14:invokeinterface #241 <Method boolean List.contains(Object)>
	//*   9   19:ifne            38
			((List) (arraylist)).add(((Object) (throwable)));
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:invokeinterface #172 <Method boolean List.add(Object)>
	//   13   29:pop             

	//   14   30:aload_0         
	//   15   31:invokestatic    #243 <Method Throwable getCause(Throwable)>
	//   16   34:astore_0        
	//*  17   35:goto            8
		return ((List) (arraylist));
	//   18   38:aload_1         
	//   19   39:areturn         
	}

	public static Throwable[] getThrowables(Throwable throwable)
	{
		throwable = ((Throwable) (getThrowableList(throwable)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #133 <Method List getThrowableList(Throwable)>
	//    2    4:astore_0        
		return (Throwable[])((List) (throwable)).toArray(((Object []) (new Throwable[((List) (throwable)).size()])));
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokeinterface #139 <Method int List.size()>
	//    6   12:anewarray       Throwable[]
	//    7   15:invokeinterface #175 <Method Object[] List.toArray(Object[])>
	//    8   20:checkcast       #246 <Class Throwable[]>
	//    9   23:areturn         
	}

	private static int indexOf(Throwable throwable, Class class1, int i, boolean flag)
	{
		if(throwable != null && class1 != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnull          8
	//    2    4:aload_1         
	//    3    5:ifnonnull       12
_L1:
		i = -1;
	//    4    8:iconst_m1       
	//    5    9:istore_2        
_L4:
		return i;
	//    6   10:iload_2         
	//    7   11:ireturn         
_L2:
label0:
		{
			int j = i;
	//    8   12:iload_2         
	//    9   13:istore          4
			if(i < 0)
	//*  10   15:iload_2         
	//*  11   16:ifge            22
				j = 0;
	//   12   19:iconst_0        
	//   13   20:istore          4
			throwable = ((Throwable) (getThrowables(throwable)));
	//   14   22:aload_0         
	//   15   23:invokestatic    #157 <Method Throwable[] getThrowables(Throwable)>
	//   16   26:astore_0        
			if(j >= throwable.length)
	//*  17   27:iload           4
	//*  18   29:aload_0         
	//*  19   30:arraylength     
	//*  20   31:icmplt          36
				return -1;
	//   21   34:iconst_m1       
	//   22   35:ireturn         
			if(flag)
	//*  23   36:iload_3         
	//*  24   37:ifeq            73
				do
				{
					if(j >= throwable.length)
						break label0;
	//   25   40:iload           4
	//   26   42:aload_0         
	//   27   43:arraylength     
	//   28   44:icmpge          106
					i = j;
	//   29   47:iload           4
	//   30   49:istore_2        
					if(class1.isAssignableFrom(((Object) (throwable[j])).getClass()))
						continue; /* Loop/switch isn't completed */
	//   31   50:aload_1         
	//   32   51:aload_0         
	//   33   52:iload           4
	//   34   54:aaload          
	//   35   55:invokevirtual   #68  <Method Class Object.getClass()>
	//   36   58:invokevirtual   #85  <Method boolean Class.isAssignableFrom(Class)>
	//   37   61:ifne            10
					j++;
	//   38   64:iload           4
	//   39   66:iconst_1        
	//   40   67:iadd            
	//   41   68:istore          4
				} while(true);
	//   42   70:goto            40
			do
			{
				if(j >= throwable.length)
					break label0;
	//   43   73:iload           4
	//   44   75:aload_0         
	//   45   76:arraylength     
	//   46   77:icmpge          106
				i = j;
	//   47   80:iload           4
	//   48   82:istore_2        
				if(((Object) (class1)).equals(((Object) (((Object) (throwable[j])).getClass()))))
					break;
	//   49   83:aload_1         
	//   50   84:aload_0         
	//   51   85:iload           4
	//   52   87:aaload          
	//   53   88:invokevirtual   #68  <Method Class Object.getClass()>
	//   54   91:invokevirtual   #250 <Method boolean Object.equals(Object)>
	//   55   94:ifne            10
				j++;
	//   56   97:iload           4
	//   57   99:iconst_1        
	//   58  100:iadd            
	//   59  101:istore          4
			} while(true);
	//   60  103:goto            73
		}
		if(true) goto _L4; else goto _L3
_L3:
		return -1;
	//   61  106:iconst_m1       
	//   62  107:ireturn         
	}

	public static int indexOfThrowable(Throwable throwable, Class class1)
	{
		return indexOf(throwable, class1, 0, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:invokestatic    #255 <Method int indexOf(Throwable, Class, int, boolean)>
	//    5    7:ireturn         
	}

	public static int indexOfThrowable(Throwable throwable, Class class1, int i)
	{
		return indexOf(throwable, class1, i, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:invokestatic    #255 <Method int indexOf(Throwable, Class, int, boolean)>
	//    5    7:ireturn         
	}

	public static int indexOfType(Throwable throwable, Class class1)
	{
		return indexOf(throwable, class1, 0, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:iconst_1        
	//    4    4:invokestatic    #255 <Method int indexOf(Throwable, Class, int, boolean)>
	//    5    7:ireturn         
	}

	public static int indexOfType(Throwable throwable, Class class1, int i)
	{
		return indexOf(throwable, class1, i, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_1        
	//    4    4:invokestatic    #255 <Method int indexOf(Throwable, Class, int, boolean)>
	//    5    7:ireturn         
	}

	public static void printRootCauseStackTrace(Throwable throwable)
	{
		printRootCauseStackTrace(throwable, System.err);
	//    0    0:aload_0         
	//    1    1:getstatic       #267 <Field PrintStream System.err>
	//    2    4:invokestatic    #270 <Method void printRootCauseStackTrace(Throwable, PrintStream)>
	//    3    7:return          
	}

	public static void printRootCauseStackTrace(Throwable throwable, PrintStream printstream)
	{
		if(throwable == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(printstream == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       20
			throw new IllegalArgumentException("The PrintStream must not be null");
	//    5    9:new             #62  <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:ldc2            #272 <String "The PrintStream must not be null">
	//    8   16:invokespecial   #275 <Method void IllegalArgumentException(String)>
	//    9   19:athrow          
		throwable = ((Throwable) (getRootCauseStackTrace(throwable)));
	//   10   20:aload_0         
	//   11   21:invokestatic    #277 <Method String[] getRootCauseStackTrace(Throwable)>
	//   12   24:astore_0        
		int j = throwable.length;
	//   13   25:aload_0         
	//   14   26:arraylength     
	//   15   27:istore_3        
		for(int i = 0; i < j; i++)
	//*  16   28:iconst_0        
	//*  17   29:istore_2        
	//*  18   30:iload_2         
	//*  19   31:iload_3         
	//*  20   32:icmpge          49
			printstream.println(((String) (throwable[i])));
	//   21   35:aload_1         
	//   22   36:aload_0         
	//   23   37:iload_2         
	//   24   38:aaload          
	//   25   39:invokevirtual   #282 <Method void PrintStream.println(String)>

	//   26   42:iload_2         
	//   27   43:iconst_1        
	//   28   44:iadd            
	//   29   45:istore_2        
	//*  30   46:goto            30
		printstream.flush();
	//   31   49:aload_1         
	//   32   50:invokevirtual   #285 <Method void PrintStream.flush()>
	//   33   53:return          
	}

	public static void printRootCauseStackTrace(Throwable throwable, PrintWriter printwriter)
	{
		if(throwable == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(printwriter == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       20
			throw new IllegalArgumentException("The PrintWriter must not be null");
	//    5    9:new             #62  <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:ldc2            #288 <String "The PrintWriter must not be null">
	//    8   16:invokespecial   #275 <Method void IllegalArgumentException(String)>
	//    9   19:athrow          
		throwable = ((Throwable) (getRootCauseStackTrace(throwable)));
	//   10   20:aload_0         
	//   11   21:invokestatic    #277 <Method String[] getRootCauseStackTrace(Throwable)>
	//   12   24:astore_0        
		int j = throwable.length;
	//   13   25:aload_0         
	//   14   26:arraylength     
	//   15   27:istore_3        
		for(int i = 0; i < j; i++)
	//*  16   28:iconst_0        
	//*  17   29:istore_2        
	//*  18   30:iload_2         
	//*  19   31:iload_3         
	//*  20   32:icmpge          49
			printwriter.println(((String) (throwable[i])));
	//   21   35:aload_1         
	//   22   36:aload_0         
	//   23   37:iload_2         
	//   24   38:aaload          
	//   25   39:invokevirtual   #289 <Method void PrintWriter.println(String)>

	//   26   42:iload_2         
	//   27   43:iconst_1        
	//   28   44:iadd            
	//   29   45:istore_2        
	//*  30   46:goto            30
		printwriter.flush();
	//   31   49:aload_1         
	//   32   50:invokevirtual   #290 <Method void PrintWriter.flush()>
	//   33   53:return          
	}

	public static void removeCommonFrames(List list, List list1)
	{
		if(list == null || list1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       19
			throw new IllegalArgumentException("The List must not be null");
	//    4    8:new             #62  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc2            #292 <String "The List must not be null">
	//    7   15:invokespecial   #275 <Method void IllegalArgumentException(String)>
	//    8   18:athrow          
		int j = list.size() - 1;
	//    9   19:aload_0         
	//   10   20:invokeinterface #139 <Method int List.size()>
	//   11   25:iconst_1        
	//   12   26:isub            
	//   13   27:istore_3        
		for(int i = list1.size() - 1; j >= 0 && i >= 0; i--)
	//*  14   28:aload_1         
	//*  15   29:invokeinterface #139 <Method int List.size()>
	//*  16   34:iconst_1        
	//*  17   35:isub            
	//*  18   36:istore_2        
	//*  19   37:iload_3         
	//*  20   38:iflt            90
	//*  21   41:iload_2         
	//*  22   42:iflt            90
		{
			if(((String)list.get(j)).equals(((Object) ((String)list1.get(i)))))
	//*  23   45:aload_0         
	//*  24   46:iload_3         
	//*  25   47:invokeinterface #143 <Method Object List.get(int)>
	//*  26   52:checkcast       #14  <Class String>
	//*  27   55:aload_1         
	//*  28   56:iload_2         
	//*  29   57:invokeinterface #143 <Method Object List.get(int)>
	//*  30   62:checkcast       #14  <Class String>
	//*  31   65:invokevirtual   #293 <Method boolean String.equals(Object)>
	//*  32   68:ifeq            79
				list.remove(j);
	//   33   71:aload_0         
	//   34   72:iload_3         
	//   35   73:invokeinterface #296 <Method Object List.remove(int)>
	//   36   78:pop             
			j--;
	//   37   79:iload_3         
	//   38   80:iconst_1        
	//   39   81:isub            
	//   40   82:istore_3        
		}

	//   41   83:iload_2         
	//   42   84:iconst_1        
	//   43   85:isub            
	//   44   86:istore_2        
	//*  45   87:goto            37
	//   46   90:return          
	}

	private static final String CAUSE_METHOD_NAMES[] = {
		"getCause", "getNextException", "getTargetException", "getException", "getSourceException", "getRootCause", "getCausedByException", "getNested", "getLinkedException", "getNestedException", 
		"getLinkedCause", "getThrowable"
	};
	static final String WRAPPED_MARKER = " [wrapped] ";

	static 
	{
	//    0    0:bipush          12
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #16  <String "getCause">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #18  <String "getNextException">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #20  <String "getTargetException">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #22  <String "getException">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #24  <String "getSourceException">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #26  <String "getRootCause">
	//   25   34:aastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #28  <String "getCausedByException">
	//   29   40:aastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #30  <String "getNested">
	//   33   46:aastore         
	//   34   47:dup             
	//   35   48:bipush          8
	//   36   50:ldc1            #32  <String "getLinkedException">
	//   37   52:aastore         
	//   38   53:dup             
	//   39   54:bipush          9
	//   40   56:ldc1            #34  <String "getNestedException">
	//   41   58:aastore         
	//   42   59:dup             
	//   43   60:bipush          10
	//   44   62:ldc1            #36  <String "getLinkedCause">
	//   45   64:aastore         
	//   46   65:dup             
	//   47   66:bipush          11
	//   48   68:ldc1            #38  <String "getThrowable">
	//   49   70:aastore         
	//   50   71:putstatic       #40  <Field String[] CAUSE_METHOD_NAMES>
	//*  51   74:return          
	}
}
