// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview.targets;

import android.app.Activity;
import android.graphics.Point;

// Referenced classes of package com.github.amlcurran.showcaseview.targets:
//			Target, ViewTarget, ActionBarViewWrapper, Reflector, 
//			ReflectorFactory

public class ActionViewTarget
	implements Target
{
	public static final class Type extends Enum
	{

		public static Type valueOf(String s)
		{
			return (Type)Enum.valueOf(com/github/amlcurran/showcaseview/targets/ActionViewTarget$Type, s);
		//    0    0:ldc1            #2   <Class ActionViewTarget$Type>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ActionViewTarget$Type>
		//    4    9:areturn         
		}

		public static Type[] values()
		{
			return (Type[])((Type []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field ActionViewTarget$Type[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.github.amlcurran.showcaseview.targets.ActionViewTarget$Type_3B_.clone()>
		//    2    6:checkcast       #46  <Class ActionViewTarget$Type[]>
		//    3    9:areturn         
		}

		private static final Type $VALUES[];
		public static final Type HOME;
		public static final Type OVERFLOW;
		public static final Type SPINNER;
		public static final Type TITLE;

		static 
		{
			SPINNER = new Type("SPINNER", 0);
		//    0    0:new             #2   <Class ActionViewTarget$Type>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "SPINNER">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void ActionViewTarget$Type(String, int)>
		//    5   10:putstatic       #24  <Field ActionViewTarget$Type SPINNER>
			HOME = new Type("HOME", 1);
		//    6   13:new             #2   <Class ActionViewTarget$Type>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "HOME">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void ActionViewTarget$Type(String, int)>
		//   11   23:putstatic       #27  <Field ActionViewTarget$Type HOME>
			TITLE = new Type("TITLE", 2);
		//   12   26:new             #2   <Class ActionViewTarget$Type>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "TITLE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void ActionViewTarget$Type(String, int)>
		//   17   36:putstatic       #30  <Field ActionViewTarget$Type TITLE>
			OVERFLOW = new Type("OVERFLOW", 3);
		//   18   39:new             #2   <Class ActionViewTarget$Type>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "OVERFLOW">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void ActionViewTarget$Type(String, int)>
		//   23   49:putstatic       #33  <Field ActionViewTarget$Type OVERFLOW>
			$VALUES = (new Type[] {
				SPINNER, HOME, TITLE, OVERFLOW
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       Type[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field ActionViewTarget$Type SPINNER>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field ActionViewTarget$Type HOME>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field ActionViewTarget$Type TITLE>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field ActionViewTarget$Type OVERFLOW>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field ActionViewTarget$Type[] $VALUES>
		//*  43   83:return          
		}

		private Type(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public ActionViewTarget(Activity activity, Type type)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		mActivity = activity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field Activity mActivity>
		mType = type;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field ActionViewTarget$Type mType>
	//    8   14:return          
	}

	public Point getPoint()
	{
		setUp();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #34  <Method void setUp()>
		static class _cls1
		{

			static final int $SwitchMap$com$github$amlcurran$showcaseview$targets$ActionViewTarget$Type[];

			static 
			{
				$SwitchMap$com$github$amlcurran$showcaseview$targets$ActionViewTarget$Type = new int[Type.values().length];
			//    0    0:invokestatic    #18  <Method ActionViewTarget$Type[] ActionViewTarget$Type.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$github$amlcurran$showcaseview$targets$ActionViewTarget$Type>
				try
				{
					$SwitchMap$com$github$amlcurran$showcaseview$targets$ActionViewTarget$Type[Type.SPINNER.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$github$amlcurran$showcaseview$targets$ActionViewTarget$Type>
			//    5   12:getstatic       #24  <Field ActionViewTarget$Type ActionViewTarget$Type.SPINNER>
			//    6   15:invokevirtual   #28  <Method int ActionViewTarget$Type.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$github$amlcurran$showcaseview$targets$ActionViewTarget$Type>
			//*  10   23:getstatic       #31  <Field ActionViewTarget$Type ActionViewTarget$Type.HOME>
			//*  11   26:invokevirtual   #28  <Method int ActionViewTarget$Type.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$github$amlcurran$showcaseview$targets$ActionViewTarget$Type>
			//*  15   34:getstatic       #34  <Field ActionViewTarget$Type ActionViewTarget$Type.OVERFLOW>
			//*  16   37:invokevirtual   #28  <Method int ActionViewTarget$Type.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$github$amlcurran$showcaseview$targets$ActionViewTarget$Type>
			//*  20   45:getstatic       #37  <Field ActionViewTarget$Type ActionViewTarget$Type.TITLE>
			//*  21   48:invokevirtual   #28  <Method int ActionViewTarget$Type.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   25   54:astore_0        
				try
				{
					$SwitchMap$com$github$amlcurran$showcaseview$targets$ActionViewTarget$Type[Type.HOME.ordinal()] = 2;
				}
			//*  26   55:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   27   58:astore_0        
				try
				{
					$SwitchMap$com$github$amlcurran$showcaseview$targets$ActionViewTarget$Type[Type.OVERFLOW.ordinal()] = 3;
				}
			//*  28   59:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   29   62:astore_0        
				try
				{
					$SwitchMap$com$github$amlcurran$showcaseview$targets$ActionViewTarget$Type[Type.TITLE.ordinal()] = 4;
				}
			//*  30   63:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   66:astore_0        
			//*  32   67:return          
			}
		}

		ViewTarget viewtarget;
		switch(_cls1..SwitchMap.com.github.amlcurran.showcaseview.targets.ActionViewTarget.Type[mType.ordinal()])
	//*   2    4:getstatic       #38  <Field int[] ActionViewTarget$1.$SwitchMap$com$github$amlcurran$showcaseview$targets$ActionViewTarget$Type>
	//*   3    7:aload_0         
	//*   4    8:getfield        #28  <Field ActionViewTarget$Type mType>
	//*   5   11:invokevirtual   #42  <Method int ActionViewTarget$Type.ordinal()>
	//*   6   14:iaload          
		{
	//*   7   15:tableswitch     1 4: default 44
	//	               1 105
	//	               2 85
	//	               3 67
	//	               4 49
		default:
			viewtarget = null;
	//    8   44:aconst_null     
	//    9   45:astore_1        
			break;

	//*  10   46:goto            120
		case 4: // '\004'
			viewtarget = new ViewTarget(mActionBarWrapper.getTitleView());
	//   11   49:new             #44  <Class ViewTarget>
	//   12   52:dup             
	//   13   53:aload_0         
	//   14   54:getfield        #46  <Field ActionBarViewWrapper mActionBarWrapper>
	//   15   57:invokevirtual   #52  <Method android.view.View ActionBarViewWrapper.getTitleView()>
	//   16   60:invokespecial   #55  <Method void ViewTarget(android.view.View)>
	//   17   63:astore_1        
			break;

	//*  18   64:goto            120
		case 3: // '\003'
			viewtarget = new ViewTarget(mActionBarWrapper.getOverflowView());
	//   19   67:new             #44  <Class ViewTarget>
	//   20   70:dup             
	//   21   71:aload_0         
	//   22   72:getfield        #46  <Field ActionBarViewWrapper mActionBarWrapper>
	//   23   75:invokevirtual   #58  <Method android.view.View ActionBarViewWrapper.getOverflowView()>
	//   24   78:invokespecial   #55  <Method void ViewTarget(android.view.View)>
	//   25   81:astore_1        
			break;

	//*  26   82:goto            120
		case 2: // '\002'
			viewtarget = new ViewTarget(mReflector.getHomeButton());
	//   27   85:new             #44  <Class ViewTarget>
	//   28   88:dup             
	//   29   89:aload_0         
	//   30   90:getfield        #60  <Field Reflector mReflector>
	//   31   93:invokeinterface #65  <Method android.view.View Reflector.getHomeButton()>
	//   32   98:invokespecial   #55  <Method void ViewTarget(android.view.View)>
	//   33  101:astore_1        
			break;

	//*  34  102:goto            120
		case 1: // '\001'
			viewtarget = new ViewTarget(mActionBarWrapper.getSpinnerView());
	//   35  105:new             #44  <Class ViewTarget>
	//   36  108:dup             
	//   37  109:aload_0         
	//   38  110:getfield        #46  <Field ActionBarViewWrapper mActionBarWrapper>
	//   39  113:invokevirtual   #68  <Method android.view.View ActionBarViewWrapper.getSpinnerView()>
	//   40  116:invokespecial   #55  <Method void ViewTarget(android.view.View)>
	//   41  119:astore_1        
			break;
		}
		return ((Target) (viewtarget)).getPoint();
	//   42  120:aload_1         
	//   43  121:invokeinterface #70  <Method Point Target.getPoint()>
	//   44  126:areturn         
	}

	protected void setUp()
	{
		mReflector = ReflectorFactory.getReflectorForActivity(mActivity);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #26  <Field Activity mActivity>
	//    3    5:invokestatic    #76  <Method Reflector ReflectorFactory.getReflectorForActivity(Activity)>
	//    4    8:putfield        #60  <Field Reflector mReflector>
		mActionBarWrapper = new ActionBarViewWrapper(mReflector.getActionBarView());
	//    5   11:aload_0         
	//    6   12:new             #48  <Class ActionBarViewWrapper>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #60  <Field Reflector mReflector>
	//   10   20:invokeinterface #80  <Method android.view.ViewParent Reflector.getActionBarView()>
	//   11   25:invokespecial   #83  <Method void ActionBarViewWrapper(android.view.ViewParent)>
	//   12   28:putfield        #46  <Field ActionBarViewWrapper mActionBarWrapper>
	//   13   31:return          
	}

	ActionBarViewWrapper mActionBarWrapper;
	private final Activity mActivity;
	Reflector mReflector;
	private final Type mType;
}
