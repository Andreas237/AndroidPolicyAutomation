// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import com.google.devtools.build.android.desugar.runtime.ThrowableExtension;
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
		return (Throwable[])innerThrowables.toArray(((Object []) (new Throwable[innerThrowables.size()])));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field List innerThrowables>
	//    2    4:aload_0         
	//    3    5:getfield        #40  <Field List innerThrowables>
	//    4    8:invokeinterface #23  <Method int List.size()>
	//    5   13:anewarray       Throwable[]
	//    6   16:invokeinterface #61  <Method Object[] List.toArray(Object[])>
	//    7   21:checkcast       #63  <Class Throwable[]>
	//    8   24:areturn         
	}

	public List getErrors()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #68  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #71  <Method void ArrayList()>
	//    3    7:astore_1        
		if(innerThrowables == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #40  <Field List innerThrowables>
	//*   6   12:ifnonnull       17
			return ((List) (arraylist));
	//    7   15:aload_1         
	//    8   16:areturn         
		for(Iterator iterator = innerThrowables.iterator(); iterator.hasNext();)
	//*   9   17:aload_0         
	//*  10   18:getfield        #40  <Field List innerThrowables>
	//*  11   21:invokeinterface #75  <Method Iterator List.iterator()>
	//*  12   26:astore_2        
	//*  13   27:aload_2         
	//*  14   28:invokeinterface #81  <Method boolean Iterator.hasNext()>
	//*  15   33:ifeq            85
		{
			Throwable throwable = (Throwable)iterator.next();
	//   16   36:aload_2         
	//   17   37:invokeinterface #85  <Method Object Iterator.next()>
	//   18   42:checkcast       #29  <Class Throwable>
	//   19   45:astore_3        
			if(throwable instanceof Exception)
	//*  20   46:aload_3         
	//*  21   47:instanceof      #4   <Class Exception>
	//*  22   50:ifeq            67
				((List) (arraylist)).add(((Object) ((Exception)throwable)));
	//   23   53:aload_1         
	//   24   54:aload_3         
	//   25   55:checkcast       #4   <Class Exception>
	//   26   58:invokeinterface #89  <Method boolean List.add(Object)>
	//   27   63:pop             
			else
	//*  28   64:goto            27
				((List) (arraylist)).add(((Object) (new Exception(throwable))));
	//   29   67:aload_1         
	//   30   68:new             #4   <Class Exception>
	//   31   71:dup             
	//   32   72:aload_3         
	//   33   73:invokespecial   #92  <Method void Exception(Throwable)>
	//   34   76:invokeinterface #89  <Method boolean List.add(Object)>
	//   35   81:pop             
		}

	//*  36   82:goto            27
		return ((List) (arraylist));
	//   37   85:aload_1         
	//   38   86:areturn         
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
			ThrowableExtension.printStackTrace(throwable, printstream);
	//   37   71:aload           4
	//   38   73:aload_1         
	//   39   74:invokestatic    #122 <Method void ThrowableExtension.printStackTrace(Throwable, PrintStream)>
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
	//    2    2:invokespecial   #125 <Method void Exception.printStackTrace(PrintWriter)>
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
	//   18   40:invokevirtual   #130 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   19   43:pop             
			printwriter.append("  Inner throwable #");
	//   20   44:aload_1         
	//   21   45:ldc1            #109 <String "  Inner throwable #">
	//   22   47:invokevirtual   #130 <Method PrintWriter PrintWriter.append(CharSequence)>
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
	//   31   60:invokevirtual   #130 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   32   63:pop             
			printwriter.append(": ");
	//   33   64:aload_1         
	//   34   65:ldc1            #117 <String ": ">
	//   35   67:invokevirtual   #130 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   36   70:pop             
			ThrowableExtension.printStackTrace(throwable, printwriter);
	//   37   71:aload           4
	//   38   73:aload_1         
	//   39   74:invokestatic    #133 <Method void ThrowableExtension.printStackTrace(Throwable, PrintWriter)>
		}

	//   40   77:aload_1         
	//   41   78:ldc1            #101 <String "\n">
	//   42   80:invokevirtual   #130 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   43   83:pop             
	//*  44   84:goto            17
	//   45   87:return          
	}

	private static final String DEFAULT_MESSAGE = "There were multiple errors.";
	private static final long serialVersionUID = 1L;
	private List innerThrowables;
}
