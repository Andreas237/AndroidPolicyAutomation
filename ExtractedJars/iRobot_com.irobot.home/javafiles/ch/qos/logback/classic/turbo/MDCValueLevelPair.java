// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;

public class MDCValueLevelPair
{

	public MDCValueLevelPair()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public Level getLevel()
	{
		return level;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Level level>
	//    2    4:areturn         
	}

	public String getValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String value>
	//    2    4:areturn         
	}

	public void setLevel(Level level1)
	{
		level = level1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field Level level>
	//    3    5:return          
	}

	public void setValue(String s)
	{
		value = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field String value>
	//    3    5:return          
	}

	private Level level;
	private String value;
}
