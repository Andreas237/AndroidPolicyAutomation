// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.action;


public abstract class ActionConst
{

	public ActionConst()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void Object()>
	//    2    4:return          
	}

	public static final String ACTION_CLASS_ATTRIBUTE = "actionClass";
	public static final String ADDITIVITY_ATTRIBUTE = "additivity";
	public static final String APPENDER_BAG = "APPENDER_BAG";
	public static final String APPENDER_TAG = "appender";
	public static final String CONVERSION_WORD_ATTRIBUTE = "conversionWord";
	public static final String CONVERTER_CLASS_ATTRIBUTE = "converterClass";
	public static final String FILTER_CHAIN_BAG = "FILTER_CHAIN_BAG";
	public static final String INHERITED = "INHERITED";
	public static final String LEVEL_ATTRIBUTE = "level";
	public static final String NULL = "NULL";
	static final Class ONE_STRING_PARAM[] = {
		java/lang/String
	};
	public static final String PATTERN_ATTRIBUTE = "pattern";
	public static final String REF_ATTRIBUTE = "ref";
	public static final String VALUE_ATTR = "value";

	static 
	{
	//    0    0:iconst_1        
	//    1    1:anewarray       Class[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #49  <Class String>
	//    5    8:aastore         
	//    6    9:putstatic       #51  <Field Class[] ONE_STRING_PARAM>
	//*   7   12:return          
	}
}
