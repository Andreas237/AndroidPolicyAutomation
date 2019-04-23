// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.*;

public class AggregateException extends Exception
{

	public AggregateException(String s, List list)
	{
		Throwable throwable;
		if(list != null && list.size() > 0)
	//*   0    0:aload_2         
	//*   1    1:ifnull          27
	//*   2    4:aload_2         
	//*   3    5:invokeinterface #23  <Method int List.size()>
	//*   4   10:ifle            27
			throwable = (Throwable)list.get(0);
	//    5   13:aload_2         
	//    6   14:iconst_0        
	//    7   15:invokeinterface #27  <Method Object List.get(int)>
	//    8   20:checkcast       #29  <Class Throwable>
	//    9   23:astore_3        
		else
	//*  10   24:goto            29
			throwable = null;
	//   11   27:aconst_null     
	//   12   28:astore_3        
		super(s, throwable);
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:aload_3         
	//   16   32:invokespecial   #32  <Method void Exception(String, Throwable)>
		innerThrowables = Collections.unmodifiableList(list);
	//   17   35:aload_0         
	//   18   36:aload_2         
	//   19   37:invokestatic    #38  <Method List Collections.unmodifiableList(List)>
	//   20   40:putfield        #40  <Field List innerThrowables>
	//   21   43:return          
	}

	public AggregateException(String s, Throwable athrowable[])
	{
		this(s, Arrays.asList(((Object []) (athrowable))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #50  <Method List Arrays.asList(Object[])>
	//    4    6:invokespecial   #52  <Method void AggregateException(String, List)>
	//    5    9:return          
	}

	public AggregateException(List list)
	{
		this("There were multiple errors.", list);
	//    0    0:aload_0         
	//    1    1:ldc1            #8   <String "There were multiple errors.">
	//    2    3:aload_1         
	//    3    4:invokespecial   #52  <Method void AggregateException(String, List)>
	//    4    7:return          
	}

	public Throwable[] getCauses()
	{
		List list = innerThrowables;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field List innerThrowables>
	//    2    4:astore_1        
		return (Throwable[])list.toArray(((Object []) (new Throwable[list.size()])));
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:invokeinterface #23  <Method int List.size()>
	//    6   12:anewarray       Throwable[]
	//    7   15:invokeinterface #61  <Method Object[] List.toArray(Object[])>
	//    8   20:checkcast       #63  <Class Throwable[]>
	//    9   23:areturn         
	}

	public List getErrors()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #68  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #71  <Method void ArrayList()>
	//    3    7:astore_1        
		Object obj = ((Object) (innerThrowables));
	//    4    8:aload_0         
	//    5    9:getfield        #40  <Field List innerThrowables>
	//    6   12:astore_2        
		if(obj == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       19
			return ((List) (arraylist));
	//    9   17:aload_1         
	//   10   18:areturn         
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*  11   19:aload_2         
	//*  12   20:invokeinterface #75  <Method Iterator List.iterator()>
	//*  13   25:astore_2        
	//*  14   26:aload_2         
	//*  15   27:invokeinterface #81  <Method boolean Iterator.hasNext()>
	//*  16   32:ifeq            84
		{
			Throwable throwable = (Throwable)((Iterator) (obj)).next();
	//   17   35:aload_2         
	//   18   36:invokeinterface #85  <Method Object Iterator.next()>
	//   19   41:checkcast       #29  <Class Throwable>
	//   20   44:astore_3        
			if(throwable instanceof Exception)
	//*  21   45:aload_3         
	//*  22   46:instanceof      #4   <Class Exception>
	//*  23   49:ifeq            66
				((List) (arraylist)).add(((Object) ((Exception)throwable)));
	//   24   52:aload_1         
	//   25   53:aload_3         
	//   26   54:checkcast       #4   <Class Exception>
	//   27   57:invokeinterface #89  <Method boolean List.add(Object)>
	//   28   62:pop             
			else
	//*  29   63:goto            26
				((List) (arraylist)).add(((Object) (new Exception(throwable))));
	//   30   66:aload_1         
	//   31   67:new             #4   <Class Exception>
	//   32   70:dup             
	//   33   71:aload_3         
	//   34   72:invokespecial   #92  <Method void Exception(Throwable)>
	//   35   75:invokeinterface #89  <Method boolean List.add(Object)>
	//   36   80:pop             
		}

	//*  37   81:goto            26
		return ((List) (arraylist));
	//   38   84:aload_1         
	//   39   85:areturn         
	}

	public List getInnerThrowables()
	{
		return innerThrowables;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field List innerThrowables>
	//    2    4:areturn         
	}

	public void printStackTrace(PrintStream printstream)
	{
		super.printStackTrace(printstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #99  <Method void Exception.printStackTrace(PrintStream)>
		Iterator iterator = innerThrowables.iterator();
	//    3    5:aload_0         
	//    4    6:getfield        #40  <Field List innerThrowables>
	//    5    9:invokeinterface #75  <Method Iterator List.iterator()>
	//    6   14:astore_3        
		int i = -1;
	//    7   15:iconst_m1       
	//    8   16:istore_2        
		for(; iterator.hasNext(); printstream.append("\n"))
	//*   9   17:aload_3         
	//*  10   18:invokeinterface #81  <Method boolean Iterator.hasNext()>
	//*  11   23:ifeq            87
		{
			Throwable throwable = (Throwable)iterator.next();
	//   12   26:aload_3         
	//   13   27:invokeinterface #85  <Method Object Iterator.next()>
	//   14   32:checkcast       #29  <Class Throwable>
	//   15   35:astore          4
			printstream.append("\n");
	//   16   37:aload_1         
	//   17   38:ldc1            #101 <String "\n">
	//   18   40:invokevirtual   #107 <Method PrintStream PrintStream.append(CharSequence)>
	//   19   43:pop             
			printstream.append("  Inner throwable #");
	//   20   44:aload_1         
	//   21   45:ldc1            #109 <String "  Inner throwable #">
	//   22   47:invokevirtual   #107 <Method PrintStream PrintStream.append(CharSequence)>
	//   23   50:pop             
			i++;
	//   24   51:iload_2         
	//   25   52:iconst_1        
	//   26   53:iadd            
	//   27   54:istore_2        
			printstream.append(((CharSequence) (Integer.toString(i))));
	//   28   55:aload_1         
	//   29   56:iload_2         
	//   30   57:invokestatic    #115 <Method String Integer.toString(int)>
	//   31   60:invokevirtual   #107 <Method PrintStream PrintStream.append(CharSequence)>
	//   32   63:pop             
			printstream.append(": ");
	//   33   64:aload_1         
	//   34   65:ldc1            #117 <String ": ">
	//   35   67:invokevirtual   #107 <Method PrintStream PrintStream.append(CharSequence)>
	//   36   70:pop             
			throwable.printStackTrace(printstream);
	//   37   71:aload           4
	//   38   73:aload_1         
	//   39   74:invokevirtual   #118 <Method void Throwable.printStackTrace(PrintStream)>
		}

	//   40   77:aload_1         
	//   41   78:ldc1            #101 <String "\n">
	//   42   80:invokevirtual   #107 <Method PrintStream PrintStream.append(CharSequence)>
	//   43   83:pop             
	//*  44   84:goto            17
	//   45   87:return          
	}

	public void printStackTrace(PrintWriter printwriter)
	{
		super.printStackTrace(printwriter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #121 <Method void Exception.printStackTrace(PrintWriter)>
		Iterator iterator = innerThrowables.iterator();
	//    3    5:aload_0         
	//    4    6:getfield        #40  <Field List innerThrowables>
	//    5    9:invokeinterface #75  <Method Iterator List.iterator()>
	//    6   14:astore_3        
		int i = -1;
	//    7   15:iconst_m1       
	//    8   16:istore_2        
		for(; iterator.hasNext(); printwriter.append("\n"))
	//*   9   17:aload_3         
	//*  10   18:invokeinterface #81  <Method boolean Iterator.hasNext()>
	//*  11   23:ifeq            87
		{
			Throwable throwable = (Throwable)iterator.next();
	//   12   26:aload_3         
	//   13   27:invokeinterface #85  <Method Object Iterator.next()>
	//   14   32:checkcast       #29  <Class Throwable>
	//   15   35:astore          4
			printwriter.append("\n");
	//   16   37:aload_1         
	//   17   38:ldc1            #101 <String "\n">
	//   18   40:invokevirtual   #126 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   19   43:pop             
			printwriter.append("  Inner throwable #");
	//   20   44:aload_1         
	//   21   45:ldc1            #109 <String "  Inner throwable #">
	//   22   47:invokevirtual   #126 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   23   50:pop             
			i++;
	//   24   51:iload_2         
	//   25   52:iconst_1        
	//   26   53:iadd            
	//   27   54:istore_2        
			printwriter.append(((CharSequence) (Integer.toString(i))));
	//   28   55:aload_1         
	//   29   56:iload_2         
	//   30   57:invokestatic    #115 <Method String Integer.toString(int)>
	//   31   60:invokevirtual   #126 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   32   63:pop             
			printwriter.append(": ");
	//   33   64:aload_1         
	//   34   65:ldc1            #117 <String ": ">
	//   35   67:invokevirtual   #126 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   36   70:pop             
			throwable.printStackTrace(printwriter);
	//   37   71:aload           4
	//   38   73:aload_1         
	//   39   74:invokevirtual   #127 <Method void Throwable.printStackTrace(PrintWriter)>
		}

	//   40   77:aload_1         
	//   41   78:ldc1            #101 <String "\n">
	//   42   80:invokevirtual   #126 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   43   83:pop             
	//*  44   84:goto            17
	//   45   87:return          
	}

	private static final String DEFAULT_MESSAGE = "There were multiple errors.";
	private static final long serialVersionUID = 1L;
	private List innerThrowables;
}
