// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.status;

import ch.qos.logback.core.Context;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package ch.qos.logback.core.status:
//			StatusManager, Status, ErrorStatus, InfoStatus, 
//			WarnStatus

public class StatusUtil
{

	public StatusUtil(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		sm = context.getStatusManager();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokeinterface #17  <Method StatusManager Context.getStatusManager()>
	//    5   11:putfield        #19  <Field StatusManager sm>
	//    6   14:return          
	}

	public StatusUtil(StatusManager statusmanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		sm = statusmanager;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field StatusManager sm>
	//    5    9:return          
	}

	public static boolean contextHasStatusListener(Context context)
	{
		context = ((Context) (context.getStatusManager()));
	//    0    0:aload_0         
	//    1    1:invokeinterface #17  <Method StatusManager Context.getStatusManager()>
	//    2    6:astore_0        
		if(context == null)
	//*   3    7:aload_0         
	//*   4    8:ifnonnull       13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		context = ((Context) (((StatusManager) (context)).getCopyOfStatusListenerList()));
	//    7   13:aload_0         
	//    8   14:invokeinterface #29  <Method List StatusManager.getCopyOfStatusListenerList()>
	//    9   19:astore_0        
		if(context != null)
	//*  10   20:aload_0         
	//*  11   21:ifnull          37
			return ((List) (context)).size() != 0;
	//   12   24:aload_0         
	//   13   25:invokeinterface #35  <Method int List.size()>
	//   14   30:ifne            35
	//   15   33:iconst_0        
	//   16   34:ireturn         
	//   17   35:iconst_1        
	//   18   36:ireturn         
		else
			return false;
	//   19   37:iconst_0        
	//   20   38:ireturn         
	}

	public static List filterStatusListByTimeThreshold(List list, long l)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #39  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void ArrayList()>
	//    3    7:astore_3        
		list = ((List) (list.iterator()));
	//    4    8:aload_0         
	//    5    9:invokeinterface #44  <Method Iterator List.iterator()>
	//    6   14:astore_0        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//    7   15:aload_0         
	//    8   16:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            62
			Status status = (Status)((Iterator) (list)).next();
	//   10   24:aload_0         
	//   11   25:invokeinterface #54  <Method Object Iterator.next()>
	//   12   30:checkcast       #56  <Class Status>
	//   13   33:astore          4
			if(status.getDate().longValue() >= l)
	//*  14   35:aload           4
	//*  15   37:invokeinterface #60  <Method Long Status.getDate()>
	//*  16   42:invokevirtual   #66  <Method long Long.longValue()>
	//*  17   45:lload_1         
	//*  18   46:lcmp            
	//*  19   47:iflt            15
				((List) (arraylist)).add(((Object) (status)));
	//   20   50:aload_3         
	//   21   51:aload           4
	//   22   53:invokeinterface #70  <Method boolean List.add(Object)>
	//   23   58:pop             
		} while(true);
	//   24   59:goto            15
		return ((List) (arraylist));
	//   25   62:aload_3         
	//   26   63:areturn         
	}

	public void addError(Object obj, String s, Throwable throwable)
	{
		addStatus(((Status) (new ErrorStatus(s, obj, throwable))));
	//    0    0:aload_0         
	//    1    1:new             #76  <Class ErrorStatus>
	//    2    4:dup             
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:aload_3         
	//    6    8:invokespecial   #79  <Method void ErrorStatus(String, Object, Throwable)>
	//    7   11:invokevirtual   #83  <Method void addStatus(Status)>
	//    8   14:return          
	}

	public void addInfo(Object obj, String s)
	{
		addStatus(((Status) (new InfoStatus(s, obj))));
	//    0    0:aload_0         
	//    1    1:new             #87  <Class InfoStatus>
	//    2    4:dup             
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokespecial   #90  <Method void InfoStatus(String, Object)>
	//    6   10:invokevirtual   #83  <Method void addStatus(Status)>
	//    7   13:return          
	}

	public void addStatus(Status status)
	{
		if(sm != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field StatusManager sm>
	//*   2    4:ifnull          17
			sm.add(status);
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field StatusManager sm>
	//    5   11:aload_1         
	//    6   12:invokeinterface #92  <Method void StatusManager.add(Status)>
	//    7   17:return          
	}

	public void addWarn(Object obj, String s)
	{
		addStatus(((Status) (new WarnStatus(s, obj))));
	//    0    0:aload_0         
	//    1    1:new             #95  <Class WarnStatus>
	//    2    4:dup             
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokespecial   #96  <Method void WarnStatus(String, Object)>
	//    6   10:invokevirtual   #83  <Method void addStatus(Status)>
	//    7   13:return          
	}

	public boolean containsException(Class class1)
	{
		for(Iterator iterator = sm.getCopyOfStatusList().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field StatusManager sm>
	//*   2    4:invokeinterface #101 <Method List StatusManager.getCopyOfStatusList()>
	//*   3    9:invokeinterface #44  <Method Iterator List.iterator()>
	//*   4   14:astore_2        
	//*   5   15:aload_2         
	//*   6   16:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//*   7   21:ifeq            62
		{
			Throwable throwable = ((Status)iterator.next()).getThrowable();
	//    8   24:aload_2         
	//    9   25:invokeinterface #54  <Method Object Iterator.next()>
	//   10   30:checkcast       #56  <Class Status>
	//   11   33:invokeinterface #105 <Method Throwable Status.getThrowable()>
	//   12   38:astore_3        
			if(throwable != null && ((Object) (throwable)).getClass().getName().equals(((Object) (class1.getName()))))
	//*  13   39:aload_3         
	//*  14   40:ifnull          15
	//*  15   43:aload_3         
	//*  16   44:invokevirtual   #109 <Method Class Object.getClass()>
	//*  17   47:invokevirtual   #115 <Method String Class.getName()>
	//*  18   50:aload_1         
	//*  19   51:invokevirtual   #115 <Method String Class.getName()>
	//*  20   54:invokevirtual   #120 <Method boolean String.equals(Object)>
	//*  21   57:ifeq            15
				return true;
	//   22   60:iconst_1        
	//   23   61:ireturn         
		}

		return false;
	//   24   62:iconst_0        
	//   25   63:ireturn         
	}

	public boolean containsMatch(int i, String s)
	{
		return containsMatch(0L, i, s);
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:iload_1         
	//    3    3:aload_2         
	//    4    4:invokevirtual   #126 <Method boolean containsMatch(long, int, String)>
	//    5    7:ireturn         
	}

	public boolean containsMatch(long l, int i, String s)
	{
		Object obj = ((Object) (filterStatusListByTimeThreshold(sm.getCopyOfStatusList(), l)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field StatusManager sm>
	//    2    4:invokeinterface #101 <Method List StatusManager.getCopyOfStatusList()>
	//    3    9:lload_1         
	//    4   10:invokestatic    #128 <Method List filterStatusListByTimeThreshold(List, long)>
	//    5   13:astore          5
		s = ((String) (Pattern.compile(s)));
	//    6   15:aload           4
	//    7   17:invokestatic    #134 <Method Pattern Pattern.compile(String)>
	//    8   20:astore          4
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*   9   22:aload           5
	//*  10   24:invokeinterface #44  <Method Iterator List.iterator()>
	//*  11   29:astore          5
	//*  12   31:aload           5
	//*  13   33:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//*  14   38:ifeq            87
		{
			Status status = (Status)((Iterator) (obj)).next();
	//   15   41:aload           5
	//   16   43:invokeinterface #54  <Method Object Iterator.next()>
	//   17   48:checkcast       #56  <Class Status>
	//   18   51:astore          6
			if(i == status.getLevel() && ((Pattern) (s)).matcher(((CharSequence) (status.getMessage()))).lookingAt())
	//*  19   53:iload_3         
	//*  20   54:aload           6
	//*  21   56:invokeinterface #137 <Method int Status.getLevel()>
	//*  22   61:icmpeq          67
	//*  23   64:goto            31
	//*  24   67:aload           4
	//*  25   69:aload           6
	//*  26   71:invokeinterface #140 <Method String Status.getMessage()>
	//*  27   76:invokevirtual   #144 <Method Matcher Pattern.matcher(CharSequence)>
	//*  28   79:invokevirtual   #149 <Method boolean Matcher.lookingAt()>
	//*  29   82:ifeq            31
				return true;
	//   30   85:iconst_1        
	//   31   86:ireturn         
		}

		return false;
	//   32   87:iconst_0        
	//   33   88:ireturn         
	}

	public boolean containsMatch(String s)
	{
		s = ((String) (Pattern.compile(s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #134 <Method Pattern Pattern.compile(String)>
	//    2    4:astore_1        
		for(Iterator iterator = sm.getCopyOfStatusList().iterator(); iterator.hasNext();)
	//*   3    5:aload_0         
	//*   4    6:getfield        #19  <Field StatusManager sm>
	//*   5    9:invokeinterface #101 <Method List StatusManager.getCopyOfStatusList()>
	//*   6   14:invokeinterface #44  <Method Iterator List.iterator()>
	//*   7   19:astore_2        
	//*   8   20:aload_2         
	//*   9   21:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//*  10   26:ifeq            55
			if(((Pattern) (s)).matcher(((CharSequence) (((Status)iterator.next()).getMessage()))).lookingAt())
	//*  11   29:aload_1         
	//*  12   30:aload_2         
	//*  13   31:invokeinterface #54  <Method Object Iterator.next()>
	//*  14   36:checkcast       #56  <Class Status>
	//*  15   39:invokeinterface #140 <Method String Status.getMessage()>
	//*  16   44:invokevirtual   #144 <Method Matcher Pattern.matcher(CharSequence)>
	//*  17   47:invokevirtual   #149 <Method boolean Matcher.lookingAt()>
	//*  18   50:ifeq            20
				return true;
	//   19   53:iconst_1        
	//   20   54:ireturn         

		return false;
	//   21   55:iconst_0        
	//   22   56:ireturn         
	}

	public int getHighestLevel(long l)
	{
		Iterator iterator = filterStatusListByTimeThreshold(sm.getCopyOfStatusList(), l).iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field StatusManager sm>
	//    2    4:invokeinterface #101 <Method List StatusManager.getCopyOfStatusList()>
	//    3    9:lload_1         
	//    4   10:invokestatic    #128 <Method List filterStatusListByTimeThreshold(List, long)>
	//    5   13:invokeinterface #44  <Method Iterator List.iterator()>
	//    6   18:astore          4
		int i = 0;
	//    7   20:iconst_0        
	//    8   21:istore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    9   22:aload           4
	//   10   24:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//   11   29:ifeq            66
			Status status = (Status)iterator.next();
	//   12   32:aload           4
	//   13   34:invokeinterface #54  <Method Object Iterator.next()>
	//   14   39:checkcast       #56  <Class Status>
	//   15   42:astore          5
			if(status.getLevel() > i)
	//*  16   44:aload           5
	//*  17   46:invokeinterface #137 <Method int Status.getLevel()>
	//*  18   51:iload_3         
	//*  19   52:icmple          22
				i = status.getLevel();
	//   20   55:aload           5
	//   21   57:invokeinterface #137 <Method int Status.getLevel()>
	//   22   62:istore_3        
		} while(true);
	//   23   63:goto            22
		return i;
	//   24   66:iload_3         
	//   25   67:ireturn         
	}

	public boolean hasXMLParsingErrors(long l)
	{
		return containsMatch(l, 2, "XML_PARSING");
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iconst_2        
	//    3    3:ldc1            #156 <String "XML_PARSING">
	//    4    5:invokevirtual   #126 <Method boolean containsMatch(long, int, String)>
	//    5    8:ireturn         
	}

	public boolean isErrorFree(long l)
	{
		return 2 > getHighestLevel(l);
	//    0    0:iconst_2        
	//    1    1:aload_0         
	//    2    2:lload_1         
	//    3    3:invokevirtual   #159 <Method int getHighestLevel(long)>
	//    4    6:icmple          11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public int matchCount(String s)
	{
		s = ((String) (Pattern.compile(s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #134 <Method Pattern Pattern.compile(String)>
	//    2    4:astore_1        
		Iterator iterator = sm.getCopyOfStatusList().iterator();
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field StatusManager sm>
	//    5    9:invokeinterface #101 <Method List StatusManager.getCopyOfStatusList()>
	//    6   14:invokeinterface #44  <Method Iterator List.iterator()>
	//    7   19:astore_3        
		int i = 0;
	//    8   20:iconst_0        
	//    9   21:istore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   10   22:aload_3         
	//   11   23:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//   12   28:ifeq            62
			if(((Pattern) (s)).matcher(((CharSequence) (((Status)iterator.next()).getMessage()))).lookingAt())
	//*  13   31:aload_1         
	//*  14   32:aload_3         
	//*  15   33:invokeinterface #54  <Method Object Iterator.next()>
	//*  16   38:checkcast       #56  <Class Status>
	//*  17   41:invokeinterface #140 <Method String Status.getMessage()>
	//*  18   46:invokevirtual   #144 <Method Matcher Pattern.matcher(CharSequence)>
	//*  19   49:invokevirtual   #149 <Method boolean Matcher.lookingAt()>
	//*  20   52:ifeq            22
				i++;
	//   21   55:iload_2         
	//   22   56:iconst_1        
	//   23   57:iadd            
	//   24   58:istore_2        
		} while(true);
	//   25   59:goto            22
		return i;
	//   26   62:iload_2         
	//   27   63:ireturn         
	}

	public boolean noXMLParsingErrorsOccurred(long l)
	{
		return hasXMLParsingErrors(l) ^ true;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #164 <Method boolean hasXMLParsingErrors(long)>
	//    3    5:iconst_1        
	//    4    6:ixor            
	//    5    7:ireturn         
	}

	public long timeOfLastReset()
	{
		List list = sm.getCopyOfStatusList();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field StatusManager sm>
	//    2    4:invokeinterface #101 <Method List StatusManager.getCopyOfStatusList()>
	//    3    9:astore_2        
		if(list == null)
	//*   4   10:aload_2         
	//*   5   11:ifnonnull       18
			return -1L;
	//    6   14:ldc2w           #166 <Long -1L>
	//    7   17:lreturn         
		for(int i = list.size() - 1; i >= 0; i--)
	//*   8   18:aload_2         
	//*   9   19:invokeinterface #35  <Method int List.size()>
	//*  10   24:iconst_1        
	//*  11   25:isub            
	//*  12   26:istore_1        
	//*  13   27:iload_1         
	//*  14   28:iflt            73
		{
			Status status = (Status)list.get(i);
	//   15   31:aload_2         
	//   16   32:iload_1         
	//   17   33:invokeinterface #171 <Method Object List.get(int)>
	//   18   38:checkcast       #56  <Class Status>
	//   19   41:astore_3        
			if("Will reset and reconfigure context ".equals(((Object) (status.getMessage()))))
	//*  20   42:ldc1            #173 <String "Will reset and reconfigure context ">
	//*  21   44:aload_3         
	//*  22   45:invokeinterface #140 <Method String Status.getMessage()>
	//*  23   50:invokevirtual   #120 <Method boolean String.equals(Object)>
	//*  24   53:ifeq            66
				return status.getDate().longValue();
	//   25   56:aload_3         
	//   26   57:invokeinterface #60  <Method Long Status.getDate()>
	//   27   62:invokevirtual   #66  <Method long Long.longValue()>
	//   28   65:lreturn         
		}

	//   29   66:iload_1         
	//   30   67:iconst_1        
	//   31   68:isub            
	//   32   69:istore_1        
	//*  33   70:goto            27
		return -1L;
	//   34   73:ldc2w           #166 <Long -1L>
	//   35   76:lreturn         
	}

	StatusManager sm;
}
