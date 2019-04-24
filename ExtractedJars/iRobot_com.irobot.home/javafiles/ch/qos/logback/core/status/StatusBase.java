// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.status;

import java.util.*;

// Referenced classes of package ch.qos.logback.core.status:
//			Status

public abstract class StatusBase
	implements Status
{

	StatusBase(int i, String s, Object obj)
	{
		this(i, s, obj, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #35  <Method void StatusBase(int, String, Object, Throwable)>
	//    6    8:return          
	}

	StatusBase(int i, String s, Object obj, Throwable throwable1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		level = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #39  <Field int level>
		message = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #41  <Field String message>
		origin = obj;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #43  <Field Object origin>
		throwable = throwable1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #45  <Field Throwable throwable>
		date = System.currentTimeMillis();
	//   14   25:aload_0         
	//   15   26:invokestatic    #51  <Method long System.currentTimeMillis()>
	//   16   29:putfield        #53  <Field long date>
	//   17   32:return          
	}

	public void add(Status status)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(status != null)
			break MISSING_BLOCK_LABEL_16;
	//    2    2:aload_1         
	//    3    3:ifnonnull       16
		throw new NullPointerException("Null values are not valid Status.");
	//    4    6:new             #57  <Class NullPointerException>
	//    5    9:dup             
	//    6   10:ldc1            #59  <String "Null values are not valid Status.">
	//    7   12:invokespecial   #62  <Method void NullPointerException(String)>
	//    8   15:athrow          
		if(childrenList == null)
	//*   9   16:aload_0         
	//*  10   17:getfield        #64  <Field List childrenList>
	//*  11   20:ifnonnull       34
			childrenList = ((List) (new ArrayList()));
	//   12   23:aload_0         
	//   13   24:new             #24  <Class ArrayList>
	//   14   27:dup             
	//   15   28:invokespecial   #65  <Method void ArrayList()>
	//   16   31:putfield        #64  <Field List childrenList>
		childrenList.add(((Object) (status)));
	//   17   34:aload_0         
	//   18   35:getfield        #64  <Field List childrenList>
	//   19   38:aload_1         
	//   20   39:invokeinterface #70  <Method boolean List.add(Object)>
	//   21   44:pop             
		this;
	//   22   45:aload_0         
		JVM INSTR monitorexit ;
	//   23   46:monitorexit     
		return;
	//   24   47:return          
	//*  25   48:aload_0         
_L2:
		throw status;
	//   26   49:monitorexit     
	//   27   50:aload_1         
	//   28   51:athrow          
		status;
	//   29   52:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  30   53:goto            48
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(((Object)this).getClass() != obj.getClass())
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #75  <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #75  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((StatusBase)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class StatusBase>
	//   18   30:astore_1        
		if(level != ((StatusBase) (obj)).level)
	//*  19   31:aload_0         
	//*  20   32:getfield        #39  <Field int level>
	//*  21   35:aload_1         
	//*  22   36:getfield        #39  <Field int level>
	//*  23   39:icmpeq          44
			return false;
	//   24   42:iconst_0        
	//   25   43:ireturn         
		if(message == null)
	//*  26   44:aload_0         
	//*  27   45:getfield        #41  <Field String message>
	//*  28   48:ifnonnull       60
		{
			if(((StatusBase) (obj)).message != null)
	//*  29   51:aload_1         
	//*  30   52:getfield        #41  <Field String message>
	//*  31   55:ifnull          76
				return false;
	//   32   58:iconst_0        
	//   33   59:ireturn         
		} else
		if(!message.equals(((Object) (((StatusBase) (obj)).message))))
	//*  34   60:aload_0         
	//*  35   61:getfield        #41  <Field String message>
	//*  36   64:aload_1         
	//*  37   65:getfield        #41  <Field String message>
	//*  38   68:invokevirtual   #79  <Method boolean String.equals(Object)>
	//*  39   71:ifne            76
			return false;
	//   40   74:iconst_0        
	//   41   75:ireturn         
		return true;
	//   42   76:iconst_1        
	//   43   77:ireturn         
	}

	public Long getDate()
	{
		return Long.valueOf(date);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field long date>
	//    2    4:invokestatic    #87  <Method Long Long.valueOf(long)>
	//    3    7:areturn         
	}

	public int getEffectiveLevel()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		Iterator iterator1;
		i = level;
	//    2    2:aload_0         
	//    3    3:getfield        #39  <Field int level>
	//    4    6:istore_1        
		iterator1 = iterator();
	//    5    7:aload_0         
	//    6    8:invokevirtual   #93  <Method Iterator iterator()>
	//    7   11:astore_3        
_L1:
		int j;
		if(!iterator1.hasNext())
			break MISSING_BLOCK_LABEL_46;
	//    8   12:aload_3         
	//    9   13:invokeinterface #99  <Method boolean Iterator.hasNext()>
	//   10   18:ifeq            46
		j = ((Status)iterator1.next()).getEffectiveLevel();
	//   11   21:aload_3         
	//   12   22:invokeinterface #103 <Method Object Iterator.next()>
	//   13   27:checkcast       #6   <Class Status>
	//   14   30:invokeinterface #105 <Method int Status.getEffectiveLevel()>
	//   15   35:istore_2        
		if(j > i)
	//*  16   36:iload_2         
	//*  17   37:iload_1         
	//*  18   38:icmple          12
			i = j;
	//   19   41:iload_2         
	//   20   42:istore_1        
		  goto _L1
	//*  21   43:goto            12
		this;
	//   22   46:aload_0         
		JVM INSTR monitorexit ;
	//   23   47:monitorexit     
		return i;
	//   24   48:iload_1         
	//   25   49:ireturn         
		Exception exception;
		exception;
	//   26   50:astore_3        
	//*  27   51:aload_0         
		throw exception;
	//   28   52:monitorexit     
	//   29   53:aload_3         
	//   30   54:athrow          
	}

	public int getLevel()
	{
		return level;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int level>
	//    2    4:ireturn         
	}

	public String getMessage()
	{
		return message;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String message>
	//    2    4:areturn         
	}

	public Object getOrigin()
	{
		return origin;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object origin>
	//    2    4:areturn         
	}

	public Throwable getThrowable()
	{
		return throwable;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Throwable throwable>
	//    2    4:areturn         
	}

	public boolean hasChildren()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		if(childrenList == null)
			break MISSING_BLOCK_LABEL_28;
	//    2    2:aload_0         
	//    3    3:getfield        #64  <Field List childrenList>
	//    4    6:ifnull          28
		i = childrenList.size();
	//    5    9:aload_0         
	//    6   10:getfield        #64  <Field List childrenList>
	//    7   13:invokeinterface #115 <Method int List.size()>
	//    8   18:istore_1        
		boolean flag;
		if(i > 0)
	//*   9   19:iload_1         
	//*  10   20:ifle            28
		{
			flag = true;
	//   11   23:iconst_1        
	//   12   24:istore_2        
			break MISSING_BLOCK_LABEL_30;
	//   13   25:goto            30
		}
		flag = false;
	//   14   28:iconst_0        
	//   15   29:istore_2        
	//*  16   30:aload_0         
		return flag;
	//   17   31:monitorexit     
	//   18   32:iload_2         
	//   19   33:ireturn         
		Exception exception;
		exception;
	//   20   34:astore_3        
	//*  21   35:aload_0         
		throw exception;
	//   22   36:monitorexit     
	//   23   37:aload_3         
	//   24   38:athrow          
	}

	public int hashCode()
	{
		int j = level;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int level>
	//    2    4:istore_2        
		int i;
		if(message == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #41  <Field String message>
	//*   5    9:ifnonnull       17
			i = 0;
	//    6   12:iconst_0        
	//    7   13:istore_1        
		else
	//*   8   14:goto            25
			i = message.hashCode();
	//    9   17:aload_0         
	//   10   18:getfield        #41  <Field String message>
	//   11   21:invokevirtual   #118 <Method int String.hashCode()>
	//   12   24:istore_1        
		return (j + 31) * 31 + i;
	//   13   25:iload_2         
	//   14   26:bipush          31
	//   15   28:iadd            
	//   16   29:bipush          31
	//   17   31:imul            
	//   18   32:iload_1         
	//   19   33:iadd            
	//   20   34:ireturn         
	}

	public Iterator iterator()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Iterator iterator1;
		if(childrenList == null)
			break MISSING_BLOCK_LABEL_23;
	//    2    2:aload_0         
	//    3    3:getfield        #64  <Field List childrenList>
	//    4    6:ifnull          23
		iterator1 = childrenList.iterator();
	//    5    9:aload_0         
	//    6   10:getfield        #64  <Field List childrenList>
	//    7   13:invokeinterface #119 <Method Iterator List.iterator()>
	//    8   18:astore_1        
		this;
	//    9   19:aload_0         
		JVM INSTR monitorexit ;
	//   10   20:monitorexit     
		return iterator1;
	//   11   21:aload_1         
	//   12   22:areturn         
		iterator1 = EMPTY_LIST.iterator();
	//   13   23:getstatic       #30  <Field List EMPTY_LIST>
	//   14   26:invokeinterface #119 <Method Iterator List.iterator()>
	//   15   31:astore_1        
		this;
	//   16   32:aload_0         
		JVM INSTR monitorexit ;
	//   17   33:monitorexit     
		return iterator1;
	//   18   34:aload_1         
	//   19   35:areturn         
		Exception exception;
		exception;
	//   20   36:astore_1        
	//*  21   37:aload_0         
		throw exception;
	//   22   38:monitorexit     
	//   23   39:aload_1         
	//   24   40:athrow          
	}

	public boolean remove(Status status)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		List list = childrenList;
	//    2    2:aload_0         
	//    3    3:getfield        #64  <Field List childrenList>
	//    4    6:astore_3        
		if(list != null)
			break MISSING_BLOCK_LABEL_15;
	//    5    7:aload_3         
	//    6    8:ifnonnull       15
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return false;
	//    9   13:iconst_0        
	//   10   14:ireturn         
		boolean flag = childrenList.remove(((Object) (status)));
	//   11   15:aload_0         
	//   12   16:getfield        #64  <Field List childrenList>
	//   13   19:aload_1         
	//   14   20:invokeinterface #125 <Method boolean List.remove(Object)>
	//   15   25:istore_2        
		this;
	//   16   26:aload_0         
		JVM INSTR monitorexit ;
	//   17   27:monitorexit     
		return flag;
	//   18   28:iload_2         
	//   19   29:ireturn         
		status;
	//   20   30:astore_1        
	//*  21   31:aload_0         
		throw status;
	//   22   32:monitorexit     
	//   23   33:aload_1         
	//   24   34:athrow          
	}

	public String toString()
	{
		StringBuffer stringbuffer;
label0:
		{
			stringbuffer = new StringBuffer();
	//    0    0:new             #128 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #129 <Method void StringBuffer()>
	//    3    7:astore_2        
			String s;
			switch(getEffectiveLevel())
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #130 <Method int getEffectiveLevel()>
			{
	//*   6   12:tableswitch     0 2: default 40
	//	               0 55
	//	               1 49
	//	               2 43
			default:
				break label0;
	//    7   40:goto            64

			case 2: // '\002'
				s = "ERROR";
	//    8   43:ldc1            #132 <String "ERROR">
	//    9   45:astore_1        
				break;
	//   10   46:goto            58

			case 1: // '\001'
				s = "WARN";
	//   11   49:ldc1            #134 <String "WARN">
	//   12   51:astore_1        
				break;
	//   13   52:goto            58

			case 0: // '\0'
				s = "INFO";
	//   14   55:ldc1            #136 <String "INFO">
	//   15   57:astore_1        
				break;
			}
			stringbuffer.append(s);
	//   16   58:aload_2         
	//   17   59:aload_1         
	//   18   60:invokevirtual   #140 <Method StringBuffer StringBuffer.append(String)>
	//   19   63:pop             
		}
		if(origin != null)
	//*  20   64:aload_0         
	//*  21   65:getfield        #43  <Field Object origin>
	//*  22   68:ifnull          94
		{
			stringbuffer.append(" in ");
	//   23   71:aload_2         
	//   24   72:ldc1            #142 <String " in ">
	//   25   74:invokevirtual   #140 <Method StringBuffer StringBuffer.append(String)>
	//   26   77:pop             
			stringbuffer.append(origin);
	//   27   78:aload_2         
	//   28   79:aload_0         
	//   29   80:getfield        #43  <Field Object origin>
	//   30   83:invokevirtual   #145 <Method StringBuffer StringBuffer.append(Object)>
	//   31   86:pop             
			stringbuffer.append(" -");
	//   32   87:aload_2         
	//   33   88:ldc1            #147 <String " -">
	//   34   90:invokevirtual   #140 <Method StringBuffer StringBuffer.append(String)>
	//   35   93:pop             
		}
		stringbuffer.append(" ");
	//   36   94:aload_2         
	//   37   95:ldc1            #149 <String " ">
	//   38   97:invokevirtual   #140 <Method StringBuffer StringBuffer.append(String)>
	//   39  100:pop             
		stringbuffer.append(message);
	//   40  101:aload_2         
	//   41  102:aload_0         
	//   42  103:getfield        #41  <Field String message>
	//   43  106:invokevirtual   #140 <Method StringBuffer StringBuffer.append(String)>
	//   44  109:pop             
		if(throwable != null)
	//*  45  110:aload_0         
	//*  46  111:getfield        #45  <Field Throwable throwable>
	//*  47  114:ifnull          133
		{
			stringbuffer.append(" ");
	//   48  117:aload_2         
	//   49  118:ldc1            #149 <String " ">
	//   50  120:invokevirtual   #140 <Method StringBuffer StringBuffer.append(String)>
	//   51  123:pop             
			stringbuffer.append(((Object) (throwable)));
	//   52  124:aload_2         
	//   53  125:aload_0         
	//   54  126:getfield        #45  <Field Throwable throwable>
	//   55  129:invokevirtual   #145 <Method StringBuffer StringBuffer.append(Object)>
	//   56  132:pop             
		}
		return stringbuffer.toString();
	//   57  133:aload_2         
	//   58  134:invokevirtual   #151 <Method String StringBuffer.toString()>
	//   59  137:areturn         
	}

	private static final List EMPTY_LIST = new ArrayList(0);
	List childrenList;
	long date;
	int level;
	final String message;
	final Object origin;
	Throwable throwable;

	static 
	{
	//    0    0:new             #24  <Class ArrayList>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #28  <Method void ArrayList(int)>
	//    4    8:putstatic       #30  <Field List EMPTY_LIST>
	//*   5   11:return          
	}
}
