// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.pattern;


public abstract class Converter
{

	public Converter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public abstract String convert(Object obj);

	public final Converter getNext()
	{
		return next;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Converter next>
	//    2    4:areturn         
	}

	public final void setNext(Converter converter)
	{
		if(next != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field Converter next>
	//*   2    4:ifnull          17
		{
			throw new IllegalStateException("Next converter has been already set");
	//    3    7:new             #25  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #27  <String "Next converter has been already set">
	//    6   13:invokespecial   #30  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		} else
		{
			next = converter;
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:putfield        #19  <Field Converter next>
			return;
	//   11   22:return          
		}
	}

	public void write(StringBuilder stringbuilder, Object obj)
	{
		stringbuilder.append(convert(obj));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #35  <Method String convert(Object)>
	//    4    6:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//    5    9:pop             
	//    6   10:return          
	}

	Converter next;
}
