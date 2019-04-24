// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.spi;


// Referenced classes of package ch.qos.logback.core.spi:
//			AbstractComponentTracker

private static class AbstractComponentTracker$Entry
{

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
	//*  10   14:invokevirtual   #35  <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #35  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((AbstractComponentTracker$Entry)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class AbstractComponentTracker$Entry>
	//   18   30:astore_1        
		if(key == null)
	//*  19   31:aload_0         
	//*  20   32:getfield        #22  <Field String key>
	//*  21   35:ifnonnull       47
		{
			if(((AbstractComponentTracker$Entry) (obj)).key != null)
	//*  22   38:aload_1         
	//*  23   39:getfield        #22  <Field String key>
	//*  24   42:ifnull          63
				return false;
	//   25   45:iconst_0        
	//   26   46:ireturn         
		} else
		if(!key.equals(((Object) (((AbstractComponentTracker$Entry) (obj)).key))))
	//*  27   47:aload_0         
	//*  28   48:getfield        #22  <Field String key>
	//*  29   51:aload_1         
	//*  30   52:getfield        #22  <Field String key>
	//*  31   55:invokevirtual   #39  <Method boolean String.equals(Object)>
	//*  32   58:ifne            63
			return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
		if(component == null)
	//*  35   63:aload_0         
	//*  36   64:getfield        #24  <Field Object component>
	//*  37   67:ifnonnull       79
		{
			if(((AbstractComponentTracker$Entry) (obj)).component != null)
	//*  38   70:aload_1         
	//*  39   71:getfield        #24  <Field Object component>
	//*  40   74:ifnull          95
				return false;
	//   41   77:iconst_0        
	//   42   78:ireturn         
		} else
		if(!component.equals(((AbstractComponentTracker$Entry) (obj)).component))
	//*  43   79:aload_0         
	//*  44   80:getfield        #24  <Field Object component>
	//*  45   83:aload_1         
	//*  46   84:getfield        #24  <Field Object component>
	//*  47   87:invokevirtual   #40  <Method boolean Object.equals(Object)>
	//*  48   90:ifne            95
			return false;
	//   49   93:iconst_0        
	//   50   94:ireturn         
		return true;
	//   51   95:iconst_1        
	//   52   96:ireturn         
	}

	public int hashCode()
	{
		return key.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String key>
	//    2    4:invokevirtual   #44  <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public void setTimestamp(long l)
	{
		timestamp = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #26  <Field long timestamp>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #50  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("(");
	//    4    8:aload_1         
	//    5    9:ldc1            #53  <String "(">
	//    6   11:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(key);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #22  <Field String key>
	//   11   20:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(", ");
	//   13   24:aload_1         
	//   14   25:ldc1            #59  <String ", ">
	//   15   27:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(component);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #24  <Field Object component>
	//   20   36:invokevirtual   #62  <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		stringbuilder.append(")");
	//   22   40:aload_1         
	//   23   41:ldc1            #64  <String ")">
	//   24   43:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		return stringbuilder.toString();
	//   26   47:aload_1         
	//   27   48:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   28   51:areturn         
	}

	Object component;
	String key;
	long timestamp;

	AbstractComponentTracker$Entry(String s, Object obj, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		key = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field String key>
		component = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field Object component>
		timestamp = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #26  <Field long timestamp>
	//   11   19:return          
	}
}
