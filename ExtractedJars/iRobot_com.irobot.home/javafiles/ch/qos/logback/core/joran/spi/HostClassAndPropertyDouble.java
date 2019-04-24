// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.spi;


public class HostClassAndPropertyDouble
{

	public HostClassAndPropertyDouble(Class class1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		hostClass = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field Class hostClass>
		propertyName = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #18  <Field String propertyName>
	//    8   14:return          
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
	//*  10   14:invokevirtual   #27  <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #27  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((HostClassAndPropertyDouble)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class HostClassAndPropertyDouble>
	//   18   30:astore_1        
		if(hostClass == null)
	//*  19   31:aload_0         
	//*  20   32:getfield        #16  <Field Class hostClass>
	//*  21   35:ifnonnull       47
		{
			if(((HostClassAndPropertyDouble) (obj)).hostClass != null)
	//*  22   38:aload_1         
	//*  23   39:getfield        #16  <Field Class hostClass>
	//*  24   42:ifnull          63
				return false;
	//   25   45:iconst_0        
	//   26   46:ireturn         
		} else
		if(!((Object) (hostClass)).equals(((Object) (((HostClassAndPropertyDouble) (obj)).hostClass))))
	//*  27   47:aload_0         
	//*  28   48:getfield        #16  <Field Class hostClass>
	//*  29   51:aload_1         
	//*  30   52:getfield        #16  <Field Class hostClass>
	//*  31   55:invokevirtual   #29  <Method boolean Object.equals(Object)>
	//*  32   58:ifne            63
			return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
		if(propertyName == null)
	//*  35   63:aload_0         
	//*  36   64:getfield        #18  <Field String propertyName>
	//*  37   67:ifnonnull       79
		{
			if(((HostClassAndPropertyDouble) (obj)).propertyName != null)
	//*  38   70:aload_1         
	//*  39   71:getfield        #18  <Field String propertyName>
	//*  40   74:ifnull          95
				return false;
	//   41   77:iconst_0        
	//   42   78:ireturn         
		} else
		if(!propertyName.equals(((Object) (((HostClassAndPropertyDouble) (obj)).propertyName))))
	//*  43   79:aload_0         
	//*  44   80:getfield        #18  <Field String propertyName>
	//*  45   83:aload_1         
	//*  46   84:getfield        #18  <Field String propertyName>
	//*  47   87:invokevirtual   #32  <Method boolean String.equals(Object)>
	//*  48   90:ifne            95
			return false;
	//   49   93:iconst_0        
	//   50   94:ireturn         
		return true;
	//   51   95:iconst_1        
	//   52   96:ireturn         
	}

	public Class getHostClass()
	{
		return hostClass;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Class hostClass>
	//    2    4:areturn         
	}

	public String getPropertyName()
	{
		return propertyName;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String propertyName>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		Class class1 = hostClass;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Class hostClass>
	//    2    4:astore_3        
		int j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		int i;
		if(class1 == null)
	//*   5    7:aload_3         
	//*   6    8:ifnonnull       16
			i = 0;
	//    7   11:iconst_0        
	//    8   12:istore_1        
		else
	//*   9   13:goto            24
			i = ((Object) (hostClass)).hashCode();
	//   10   16:aload_0         
	//   11   17:getfield        #16  <Field Class hostClass>
	//   12   20:invokevirtual   #40  <Method int Object.hashCode()>
	//   13   23:istore_1        
		if(propertyName != null)
	//*  14   24:aload_0         
	//*  15   25:getfield        #18  <Field String propertyName>
	//*  16   28:ifnonnull       34
	//*  17   31:goto            42
			j = propertyName.hashCode();
	//   18   34:aload_0         
	//   19   35:getfield        #18  <Field String propertyName>
	//   20   38:invokevirtual   #41  <Method int String.hashCode()>
	//   21   41:istore_2        
		return (i + 31) * 31 + j;
	//   22   42:iload_1         
	//   23   43:bipush          31
	//   24   45:iadd            
	//   25   46:bipush          31
	//   26   48:imul            
	//   27   49:iload_2         
	//   28   50:iadd            
	//   29   51:ireturn         
	}

	final Class hostClass;
	final String propertyName;
}
