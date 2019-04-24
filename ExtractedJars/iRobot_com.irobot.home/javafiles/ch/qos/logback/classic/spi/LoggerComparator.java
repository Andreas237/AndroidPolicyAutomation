// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.Logger;
import java.io.Serializable;
import java.util.Comparator;

public class LoggerComparator
	implements Serializable, Comparator
{

	public LoggerComparator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public int compare(Logger logger, Logger logger1)
	{
		if(logger.getName().equals(((Object) (logger1.getName()))))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #26  <Method String Logger.getName()>
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #26  <Method String Logger.getName()>
	//*   4    8:invokevirtual   #32  <Method boolean String.equals(Object)>
	//*   5   11:ifeq            16
			return 0;
	//    6   14:iconst_0        
	//    7   15:ireturn         
		if(logger.getName().equals("ROOT"))
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #26  <Method String Logger.getName()>
	//*  10   20:ldc1            #34  <String "ROOT">
	//*  11   22:invokevirtual   #32  <Method boolean String.equals(Object)>
	//*  12   25:ifeq            30
			return -1;
	//   13   28:iconst_m1       
	//   14   29:ireturn         
		if(logger1.getName().equals("ROOT"))
	//*  15   30:aload_2         
	//*  16   31:invokevirtual   #26  <Method String Logger.getName()>
	//*  17   34:ldc1            #34  <String "ROOT">
	//*  18   36:invokevirtual   #32  <Method boolean String.equals(Object)>
	//*  19   39:ifeq            44
			return 1;
	//   20   42:iconst_1        
	//   21   43:ireturn         
		else
			return logger.getName().compareTo(logger1.getName());
	//   22   44:aload_1         
	//   23   45:invokevirtual   #26  <Method String Logger.getName()>
	//   24   48:aload_2         
	//   25   49:invokevirtual   #26  <Method String Logger.getName()>
	//   26   52:invokevirtual   #38  <Method int String.compareTo(String)>
	//   27   55:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((Logger)obj, (Logger)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #22  <Class Logger>
	//    3    5:aload_2         
	//    4    6:checkcast       #22  <Class Logger>
	//    5    9:invokevirtual   #41  <Method int compare(Logger, Logger)>
	//    6   12:ireturn         
	}

	private static final long serialVersionUID = 1L;
}
