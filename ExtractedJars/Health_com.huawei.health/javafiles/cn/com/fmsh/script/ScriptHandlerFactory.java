// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.script;

import cn.com.fmsh.script.core.ScriptHandlerImpl;

// Referenced classes of package cn.com.fmsh.script:
//			ApduHandler, ScriptHandler

public class ScriptHandlerFactory
{

	private ScriptHandlerFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static ScriptHandlerFactory getInstance()
	{
		if(multiCommandFactory == null)
	//*   0    0:getstatic       #15  <Field ScriptHandlerFactory multiCommandFactory>
	//*   1    3:ifnonnull       9
			scriptHandlerFactoryInit();
	//    2    6:invokestatic    #18  <Method void scriptHandlerFactoryInit()>
		return multiCommandFactory;
	//    3    9:getstatic       #15  <Field ScriptHandlerFactory multiCommandFactory>
	//    4   12:areturn         
	}

	public static void scriptHandlerFactoryInit()
	{
		if(multiCommandFactory == null)
	//*   0    0:getstatic       #15  <Field ScriptHandlerFactory multiCommandFactory>
	//*   1    3:ifnonnull       16
			multiCommandFactory = new ScriptHandlerFactory();
	//    2    6:new             #2   <Class ScriptHandlerFactory>
	//    3    9:dup             
	//    4   10:invokespecial   #19  <Method void ScriptHandlerFactory()>
	//    5   13:putstatic       #15  <Field ScriptHandlerFactory multiCommandFactory>
	//    6   16:return          
	}

	public ScriptHandler getScriptHandler(ApduHandler apduhandler)
	{
		return ((ScriptHandler) (new ScriptHandlerImpl(apduhandler)));
	//    0    0:new             #23  <Class ScriptHandlerImpl>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #26  <Method void ScriptHandlerImpl(ApduHandler)>
	//    4    8:areturn         
	}

	private static volatile ScriptHandlerFactory multiCommandFactory;
}
