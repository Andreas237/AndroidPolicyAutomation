// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview.targets;

import android.view.View;
import android.view.ViewParent;

interface Reflector
{
	public static final class ActionBarType extends Enum
	{

		public static ActionBarType valueOf(String s)
		{
			return (ActionBarType)Enum.valueOf(com/github/amlcurran/showcaseview/targets/Reflector$ActionBarType, s);
		//    0    0:ldc1            #2   <Class Reflector$ActionBarType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Reflector$ActionBarType>
		//    4    9:areturn         
		}

		public static ActionBarType[] values()
		{
			return (ActionBarType[])((ActionBarType []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field Reflector$ActionBarType[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.github.amlcurran.showcaseview.targets.Reflector$ActionBarType_3B_.clone()>
		//    2    6:checkcast       #42  <Class Reflector$ActionBarType[]>
		//    3    9:areturn         
		}

		private static final ActionBarType $VALUES[];
		public static final ActionBarType ACTIONBAR_SHERLOCK;
		public static final ActionBarType APP_COMPAT;
		public static final ActionBarType STANDARD;

		static 
		{
			STANDARD = new ActionBarType("STANDARD", 0);
		//    0    0:new             #2   <Class Reflector$ActionBarType>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "STANDARD">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void Reflector$ActionBarType(String, int)>
		//    5   10:putstatic       #23  <Field Reflector$ActionBarType STANDARD>
			APP_COMPAT = new ActionBarType("APP_COMPAT", 1);
		//    6   13:new             #2   <Class Reflector$ActionBarType>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "APP_COMPAT">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void Reflector$ActionBarType(String, int)>
		//   11   23:putstatic       #26  <Field Reflector$ActionBarType APP_COMPAT>
			ACTIONBAR_SHERLOCK = new ActionBarType("ACTIONBAR_SHERLOCK", 2);
		//   12   26:new             #2   <Class Reflector$ActionBarType>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "ACTIONBAR_SHERLOCK">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void Reflector$ActionBarType(String, int)>
		//   17   36:putstatic       #29  <Field Reflector$ActionBarType ACTIONBAR_SHERLOCK>
			$VALUES = (new ActionBarType[] {
				STANDARD, APP_COMPAT, ACTIONBAR_SHERLOCK
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       ActionBarType[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field Reflector$ActionBarType STANDARD>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field Reflector$ActionBarType APP_COMPAT>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field Reflector$ActionBarType ACTIONBAR_SHERLOCK>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field Reflector$ActionBarType[] $VALUES>
		//*  33   64:return          
		}

		private ActionBarType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public abstract ViewParent getActionBarView();

	public abstract View getHomeButton();

	public abstract void showcaseActionItem(int i);
}
