// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview.targets;

import android.app.Activity;

// Referenced classes of package com.github.amlcurran.showcaseview.targets:
//			SherlockReflector, AppCompatReflector, ActionBarReflector, Reflector

class ReflectorFactory
{

	ReflectorFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static Reflector getReflectorForActivity(Activity activity)
	{
		static class _cls1
		{

			static final int $SwitchMap$com$github$amlcurran$showcaseview$targets$Reflector$ActionBarType[];

			static 
			{
				$SwitchMap$com$github$amlcurran$showcaseview$targets$Reflector$ActionBarType = new int[Reflector.ActionBarType.values().length];
			//    0    0:invokestatic    #18  <Method Reflector$ActionBarType[] Reflector$ActionBarType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$github$amlcurran$showcaseview$targets$Reflector$ActionBarType>
				try
				{
					$SwitchMap$com$github$amlcurran$showcaseview$targets$Reflector$ActionBarType[Reflector.ActionBarType.STANDARD.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$github$amlcurran$showcaseview$targets$Reflector$ActionBarType>
			//    5   12:getstatic       #24  <Field Reflector$ActionBarType Reflector$ActionBarType.STANDARD>
			//    6   15:invokevirtual   #28  <Method int Reflector$ActionBarType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$github$amlcurran$showcaseview$targets$Reflector$ActionBarType>
			//*  10   23:getstatic       #31  <Field Reflector$ActionBarType Reflector$ActionBarType.APP_COMPAT>
			//*  11   26:invokevirtual   #28  <Method int Reflector$ActionBarType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$github$amlcurran$showcaseview$targets$Reflector$ActionBarType>
			//*  15   34:getstatic       #34  <Field Reflector$ActionBarType Reflector$ActionBarType.ACTIONBAR_SHERLOCK>
			//*  16   37:invokevirtual   #28  <Method int Reflector$ActionBarType.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   20   43:astore_0        
				try
				{
					$SwitchMap$com$github$amlcurran$showcaseview$targets$Reflector$ActionBarType[Reflector.ActionBarType.APP_COMPAT.ordinal()] = 2;
				}
			//*  21   44:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   22   47:astore_0        
				try
				{
					$SwitchMap$com$github$amlcurran$showcaseview$targets$Reflector$ActionBarType[Reflector.ActionBarType.ACTIONBAR_SHERLOCK.ordinal()] = 3;
				}
			//*  23   48:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   51:astore_0        
			//*  25   52:return          
			}
		}

		switch(_cls1..SwitchMap.com.github.amlcurran.showcaseview.targets.Reflector.ActionBarType[searchForActivitySuperClass(activity).ordinal()])
	//*   0    0:getstatic       #17  <Field int[] ReflectorFactory$1.$SwitchMap$com$github$amlcurran$showcaseview$targets$Reflector$ActionBarType>
	//*   1    3:aload_0         
	//*   2    4:invokestatic    #21  <Method Reflector$ActionBarType searchForActivitySuperClass(Activity)>
	//*   3    7:invokevirtual   #27  <Method int Reflector$ActionBarType.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 3: default 36
	//	               1 56
	//	               2 47
	//	               3 38
		default:
			return null;
	//    6   36:aconst_null     
	//    7   37:areturn         

		case 3: // '\003'
			return ((Reflector) (new SherlockReflector(activity)));
	//    8   38:new             #29  <Class SherlockReflector>
	//    9   41:dup             
	//   10   42:aload_0         
	//   11   43:invokespecial   #32  <Method void SherlockReflector(Activity)>
	//   12   46:areturn         

		case 2: // '\002'
			return ((Reflector) (new AppCompatReflector(activity)));
	//   13   47:new             #34  <Class AppCompatReflector>
	//   14   50:dup             
	//   15   51:aload_0         
	//   16   52:invokespecial   #35  <Method void AppCompatReflector(Activity)>
	//   17   55:areturn         

		case 1: // '\001'
			return ((Reflector) (new ActionBarReflector(activity)));
	//   18   56:new             #37  <Class ActionBarReflector>
	//   19   59:dup             
	//   20   60:aload_0         
	//   21   61:invokespecial   #38  <Method void ActionBarReflector(Activity)>
	//   22   64:areturn         
		}
	}

	private static Reflector.ActionBarType searchForActivitySuperClass(Activity activity)
	{
		for(activity = ((Activity) (((Object) (activity)).getClass())); activity != android/app/Activity;)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #42  <Method Class Object.getClass()>
	//*   2    4:astore_0        
	//*   3    5:aload_0         
	//*   4    6:ldc1            #44  <Class Activity>
	//*   5    8:if_acmpeq       66
			if(!((Class) (activity)).getSimpleName().equals("SherlockActivity") && !((Class) (activity)).getSimpleName().equals("SherlockFragmentActivity"))
	//*   6   11:aload_0         
	//*   7   12:invokevirtual   #50  <Method String Class.getSimpleName()>
	//*   8   15:ldc1            #52  <String "SherlockActivity">
	//*   9   17:invokevirtual   #58  <Method boolean String.equals(Object)>
	//*  10   20:ifne            62
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #50  <Method String Class.getSimpleName()>
	//*  13   27:ldc1            #60  <String "SherlockFragmentActivity">
	//*  14   29:invokevirtual   #58  <Method boolean String.equals(Object)>
	//*  15   32:ifeq            38
	//*  16   35:goto            62
			{
				if(((Class) (activity)).getSimpleName().equals("ActionBarActivity"))
	//*  17   38:aload_0         
	//*  18   39:invokevirtual   #50  <Method String Class.getSimpleName()>
	//*  19   42:ldc1            #62  <String "ActionBarActivity">
	//*  20   44:invokevirtual   #58  <Method boolean String.equals(Object)>
	//*  21   47:ifeq            54
					return Reflector.ActionBarType.APP_COMPAT;
	//   22   50:getstatic       #66  <Field Reflector$ActionBarType Reflector$ActionBarType.APP_COMPAT>
	//   23   53:areturn         
				activity = ((Activity) (((Class) (activity)).getSuperclass()));
	//   24   54:aload_0         
	//   25   55:invokevirtual   #69  <Method Class Class.getSuperclass()>
	//   26   58:astore_0        
			} else
	//*  27   59:goto            5
			{
				return Reflector.ActionBarType.ACTIONBAR_SHERLOCK;
	//   28   62:getstatic       #72  <Field Reflector$ActionBarType Reflector$ActionBarType.ACTIONBAR_SHERLOCK>
	//   29   65:areturn         
			}

		return Reflector.ActionBarType.STANDARD;
	//   30   66:getstatic       #75  <Field Reflector$ActionBarType Reflector$ActionBarType.STANDARD>
	//   31   69:areturn         
	}
}
