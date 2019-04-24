// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.spi;


// Referenced classes of package ch.qos.logback.classic.spi:
//			StackTraceElementProxy

public class STEUtil
{

	public STEUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	static int findNumberOfCommonFrames(StackTraceElement astacktraceelement[], StackTraceElementProxy astacktraceelementproxy[])
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(astacktraceelementproxy == null)
	//*   2    3:aload_1         
	//*   3    4:ifnonnull       9
			return 0;
	//    4    7:iconst_0        
	//    5    8:ireturn         
		int j = astacktraceelement.length - 1;
	//    6    9:aload_0         
	//    7   10:arraylength     
	//    8   11:iconst_1        
	//    9   12:isub            
	//   10   13:istore_3        
		for(int i = astacktraceelementproxy.length - 1; j >= 0 && i >= 0 && astacktraceelement[j].equals(((Object) (astacktraceelementproxy[i].ste))); i--)
	//*  11   14:aload_1         
	//*  12   15:arraylength     
	//*  13   16:iconst_1        
	//*  14   17:isub            
	//*  15   18:istore_2        
	//*  16   19:iload_3         
	//*  17   20:iflt            59
	//*  18   23:iload_2         
	//*  19   24:iflt            59
	//*  20   27:aload_0         
	//*  21   28:iload_3         
	//*  22   29:aaload          
	//*  23   30:aload_1         
	//*  24   31:iload_2         
	//*  25   32:aaload          
	//*  26   33:getfield        #17  <Field StackTraceElement StackTraceElementProxy.ste>
	//*  27   36:invokevirtual   #23  <Method boolean StackTraceElement.equals(Object)>
	//*  28   39:ifeq            59
		{
			k++;
	//   29   42:iload           4
	//   30   44:iconst_1        
	//   31   45:iadd            
	//   32   46:istore          4
			j--;
	//   33   48:iload_3         
	//   34   49:iconst_1        
	//   35   50:isub            
	//   36   51:istore_3        
		}

	//   37   52:iload_2         
	//   38   53:iconst_1        
	//   39   54:isub            
	//   40   55:istore_2        
	//*  41   56:goto            19
		return k;
	//   42   59:iload           4
	//   43   61:ireturn         
	}
}
