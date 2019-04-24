// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling.helper;


public class TokenConverter
{

	protected TokenConverter(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		type = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #20  <Field int type>
	//    5    9:return          
	}

	public TokenConverter getNext()
	{
		return next;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field TokenConverter next>
	//    2    4:areturn         
	}

	public int getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int type>
	//    2    4:ireturn         
	}

	public void setNext(TokenConverter tokenconverter)
	{
		next = tokenconverter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field TokenConverter next>
	//    3    5:return          
	}

	public void setType(int i)
	{
		type = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #20  <Field int type>
	//    3    5:return          
	}

	static final int DATE = 1;
	static final int IDENTITY = 0;
	static final int INTEGER = 1;
	TokenConverter next;
	int type;
}
