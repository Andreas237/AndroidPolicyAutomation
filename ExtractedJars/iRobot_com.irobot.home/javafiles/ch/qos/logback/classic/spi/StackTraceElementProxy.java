// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.spi;

import java.io.Serializable;

// Referenced classes of package ch.qos.logback.classic.spi:
//			ClassPackagingData

public class StackTraceElementProxy
	implements Serializable
{

	public StackTraceElementProxy(StackTraceElement stacktraceelement)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		if(stacktraceelement == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
		{
			throw new IllegalArgumentException("ste cannot be null");
	//    4    8:new             #23  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #25  <String "ste cannot be null">
	//    7   14:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		} else
		{
			ste = stacktraceelement;
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:putfield        #30  <Field StackTraceElement ste>
			return;
	//   12   23:return          
		}
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
	//*  10   14:invokevirtual   #37  <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #37  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((StackTraceElementProxy)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class StackTraceElementProxy>
	//   18   30:astore_1        
		if(!ste.equals(((Object) (((StackTraceElementProxy) (obj)).ste))))
	//*  19   31:aload_0         
	//*  20   32:getfield        #30  <Field StackTraceElement ste>
	//*  21   35:aload_1         
	//*  22   36:getfield        #30  <Field StackTraceElement ste>
	//*  23   39:invokevirtual   #41  <Method boolean StackTraceElement.equals(Object)>
	//*  24   42:ifne            47
			return false;
	//   25   45:iconst_0        
	//   26   46:ireturn         
		if(cpd == null)
	//*  27   47:aload_0         
	//*  28   48:getfield        #43  <Field ClassPackagingData cpd>
	//*  29   51:ifnonnull       63
		{
			if(((StackTraceElementProxy) (obj)).cpd != null)
	//*  30   54:aload_1         
	//*  31   55:getfield        #43  <Field ClassPackagingData cpd>
	//*  32   58:ifnull          79
				return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
		} else
		if(!cpd.equals(((Object) (((StackTraceElementProxy) (obj)).cpd))))
	//*  35   63:aload_0         
	//*  36   64:getfield        #43  <Field ClassPackagingData cpd>
	//*  37   67:aload_1         
	//*  38   68:getfield        #43  <Field ClassPackagingData cpd>
	//*  39   71:invokevirtual   #46  <Method boolean ClassPackagingData.equals(Object)>
	//*  40   74:ifne            79
			return false;
	//   41   77:iconst_0        
	//   42   78:ireturn         
		return true;
	//   43   79:iconst_1        
	//   44   80:ireturn         
	}

	public ClassPackagingData getClassPackagingData()
	{
		return cpd;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field ClassPackagingData cpd>
	//    2    4:areturn         
	}

	public String getSTEAsString()
	{
		if(steAsString == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field String steAsString>
	//*   2    4:ifnonnull       42
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #54  <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #55  <Method void StringBuilder()>
	//    6   14:astore_1        
			stringbuilder.append("at ");
	//    7   15:aload_1         
	//    8   16:ldc1            #57  <String "at ">
	//    9   18:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
			stringbuilder.append(ste.toString());
	//   11   22:aload_1         
	//   12   23:aload_0         
	//   13   24:getfield        #30  <Field StackTraceElement ste>
	//   14   27:invokevirtual   #64  <Method String StackTraceElement.toString()>
	//   15   30:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
			steAsString = stringbuilder.toString();
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   20   39:putfield        #52  <Field String steAsString>
		}
		return steAsString;
	//   21   42:aload_0         
	//   22   43:getfield        #52  <Field String steAsString>
	//   23   46:areturn         
	}

	public StackTraceElement getStackTraceElement()
	{
		return ste;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field StackTraceElement ste>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return ste.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field StackTraceElement ste>
	//    2    4:invokevirtual   #71  <Method int StackTraceElement.hashCode()>
	//    3    7:ireturn         
	}

	public void setClassPackagingData(ClassPackagingData classpackagingdata)
	{
		if(cpd != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field ClassPackagingData cpd>
	//*   2    4:ifnull          17
		{
			throw new IllegalStateException("Packaging data has been already set");
	//    3    7:new             #75  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #77  <String "Packaging data has been already set">
	//    6   13:invokespecial   #78  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		} else
		{
			cpd = classpackagingdata;
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:putfield        #43  <Field ClassPackagingData cpd>
			return;
	//   11   22:return          
		}
	}

	public String toString()
	{
		return getSTEAsString();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #80  <Method String getSTEAsString()>
	//    2    4:areturn         
	}

	private static final long serialVersionUID = 0x11134332L;
	private ClassPackagingData cpd;
	final StackTraceElement ste;
	private transient String steAsString;
}
