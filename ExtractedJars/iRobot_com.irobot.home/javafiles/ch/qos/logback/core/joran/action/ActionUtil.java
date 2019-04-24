// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.util.ContextUtil;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Properties;

public class ActionUtil
{
	public static final class Scope extends Enum
	{

		public static Scope valueOf(String s)
		{
			return (Scope)Enum.valueOf(ch/qos/logback/core/joran/action/ActionUtil$Scope, s);
		//    0    0:ldc1            #2   <Class ActionUtil$Scope>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ActionUtil$Scope>
		//    4    9:areturn         
		}

		public static Scope[] values()
		{
			return (Scope[])((Scope []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field ActionUtil$Scope[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lch.qos.logback.core.joran.action.ActionUtil$Scope_3B_.clone()>
		//    2    6:checkcast       #42  <Class ActionUtil$Scope[]>
		//    3    9:areturn         
		}

		private static final Scope $VALUES[];
		public static final Scope CONTEXT;
		public static final Scope LOCAL;
		public static final Scope SYSTEM;

		static 
		{
			LOCAL = new Scope("LOCAL", 0);
		//    0    0:new             #2   <Class ActionUtil$Scope>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "LOCAL">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void ActionUtil$Scope(String, int)>
		//    5   10:putstatic       #23  <Field ActionUtil$Scope LOCAL>
			CONTEXT = new Scope("CONTEXT", 1);
		//    6   13:new             #2   <Class ActionUtil$Scope>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "CONTEXT">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void ActionUtil$Scope(String, int)>
		//   11   23:putstatic       #26  <Field ActionUtil$Scope CONTEXT>
			SYSTEM = new Scope("SYSTEM", 2);
		//   12   26:new             #2   <Class ActionUtil$Scope>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "SYSTEM">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void ActionUtil$Scope(String, int)>
		//   17   36:putstatic       #29  <Field ActionUtil$Scope SYSTEM>
			$VALUES = (new Scope[] {
				LOCAL, CONTEXT, SYSTEM
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       Scope[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field ActionUtil$Scope LOCAL>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field ActionUtil$Scope CONTEXT>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field ActionUtil$Scope SYSTEM>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field ActionUtil$Scope[] $VALUES>
		//*  33   64:return          
		}

		private Scope(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public ActionUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public static void setProperties(InterpretationContext interpretationcontext, Properties properties, Scope scope)
	{
		static class _cls1
		{

			static final int $SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope[];

			static 
			{
				$SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope = new int[Scope.values().length];
			//    0    0:invokestatic    #18  <Method ActionUtil$Scope[] ActionUtil$Scope.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope>
				try
				{
					$SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope[Scope.LOCAL.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope>
			//    5   12:getstatic       #24  <Field ActionUtil$Scope ActionUtil$Scope.LOCAL>
			//    6   15:invokevirtual   #28  <Method int ActionUtil$Scope.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope>
			//*  10   23:getstatic       #31  <Field ActionUtil$Scope ActionUtil$Scope.CONTEXT>
			//*  11   26:invokevirtual   #28  <Method int ActionUtil$Scope.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope>
			//*  15   34:getstatic       #34  <Field ActionUtil$Scope ActionUtil$Scope.SYSTEM>
			//*  16   37:invokevirtual   #28  <Method int ActionUtil$Scope.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   20   43:astore_0        
				try
				{
					$SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope[Scope.CONTEXT.ordinal()] = 2;
				}
			//*  21   44:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   22   47:astore_0        
				try
				{
					$SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope[Scope.SYSTEM.ordinal()] = 3;
				}
			//*  23   48:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   51:astore_0        
			//*  25   52:return          
			}
		}

		switch(_cls1..SwitchMap.ch.qos.logback.core.joran.action.ActionUtil.Scope[scope.ordinal()])
	//*   0    0:getstatic       #20  <Field int[] ActionUtil$1.$SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope>
	//*   1    3:aload_2         
	//*   2    4:invokevirtual   #24  <Method int ActionUtil$Scope.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 3: default 36
	//	               1 59
	//	               2 43
	//	               3 37
		default:
			return;
	//    5   36:return          

		case 3: // '\003'
			OptionHelper.setSystemProperties(((ch.qos.logback.core.spi.ContextAware) (interpretationcontext)), properties);
	//    6   37:aload_0         
	//    7   38:aload_1         
	//    8   39:invokestatic    #30  <Method void OptionHelper.setSystemProperties(ch.qos.logback.core.spi.ContextAware, Properties)>
			return;
	//    9   42:return          

		case 2: // '\002'
			(new ContextUtil(interpretationcontext.getContext())).addProperties(properties);
	//   10   43:new             #32  <Class ContextUtil>
	//   11   46:dup             
	//   12   47:aload_0         
	//   13   48:invokevirtual   #38  <Method Context InterpretationContext.getContext()>
	//   14   51:invokespecial   #41  <Method void ContextUtil(Context)>
	//   15   54:aload_1         
	//   16   55:invokevirtual   #45  <Method void ContextUtil.addProperties(Properties)>
			return;
	//   17   58:return          

		case 1: // '\001'
			interpretationcontext.addSubstitutionProperties(properties);
	//   18   59:aload_0         
	//   19   60:aload_1         
	//   20   61:invokevirtual   #48  <Method void InterpretationContext.addSubstitutionProperties(Properties)>
			return;
	//   21   64:return          
		}
	}

	public static void setProperty(InterpretationContext interpretationcontext, String s, String s1, Scope scope)
	{
		switch(_cls1..SwitchMap.ch.qos.logback.core.joran.action.ActionUtil.Scope[scope.ordinal()])
	//*   0    0:getstatic       #20  <Field int[] ActionUtil$1.$SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope>
	//*   1    3:aload_3         
	//*   2    4:invokevirtual   #24  <Method int ActionUtil$Scope.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 3: default 36
	//	               1 56
	//	               2 44
	//	               3 37
		default:
			return;
	//    5   36:return          

		case 3: // '\003'
			OptionHelper.setSystemProperty(((ch.qos.logback.core.spi.ContextAware) (interpretationcontext)), s, s1);
	//    6   37:aload_0         
	//    7   38:aload_1         
	//    8   39:aload_2         
	//    9   40:invokestatic    #54  <Method void OptionHelper.setSystemProperty(ch.qos.logback.core.spi.ContextAware, String, String)>
			return;
	//   10   43:return          

		case 2: // '\002'
			interpretationcontext.getContext().putProperty(s, s1);
	//   11   44:aload_0         
	//   12   45:invokevirtual   #38  <Method Context InterpretationContext.getContext()>
	//   13   48:aload_1         
	//   14   49:aload_2         
	//   15   50:invokeinterface #60  <Method void Context.putProperty(String, String)>
			return;
	//   16   55:return          

		case 1: // '\001'
			interpretationcontext.addSubstitutionProperty(s, s1);
	//   17   56:aload_0         
	//   18   57:aload_1         
	//   19   58:aload_2         
	//   20   59:invokevirtual   #63  <Method void InterpretationContext.addSubstitutionProperty(String, String)>
			return;
	//   21   62:return          
		}
	}

	public static Scope stringToScope(String s)
	{
		if(Scope.SYSTEM.toString().equalsIgnoreCase(s))
	//*   0    0:getstatic       #69  <Field ActionUtil$Scope ActionUtil$Scope.SYSTEM>
	//*   1    3:invokevirtual   #73  <Method String ActionUtil$Scope.toString()>
	//*   2    6:aload_0         
	//*   3    7:invokevirtual   #79  <Method boolean String.equalsIgnoreCase(String)>
	//*   4   10:ifeq            17
			return Scope.SYSTEM;
	//    5   13:getstatic       #69  <Field ActionUtil$Scope ActionUtil$Scope.SYSTEM>
	//    6   16:areturn         
		if(Scope.CONTEXT.toString().equalsIgnoreCase(s))
	//*   7   17:getstatic       #82  <Field ActionUtil$Scope ActionUtil$Scope.CONTEXT>
	//*   8   20:invokevirtual   #73  <Method String ActionUtil$Scope.toString()>
	//*   9   23:aload_0         
	//*  10   24:invokevirtual   #79  <Method boolean String.equalsIgnoreCase(String)>
	//*  11   27:ifeq            34
			return Scope.CONTEXT;
	//   12   30:getstatic       #82  <Field ActionUtil$Scope ActionUtil$Scope.CONTEXT>
	//   13   33:areturn         
		else
			return Scope.LOCAL;
	//   14   34:getstatic       #85  <Field ActionUtil$Scope ActionUtil$Scope.LOCAL>
	//   15   37:areturn         
	}
}
