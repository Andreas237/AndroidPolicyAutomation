// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;

import android.support.constraint.solver.Cache;
import android.support.constraint.solver.SolverVariable;

// Referenced classes of package android.support.constraint.solver.widgets:
//			ResolutionAnchor, ConstraintWidget, Guideline

public class ConstraintAnchor
{
	public static final class ConnectionType extends Enum
	{

		public static ConnectionType valueOf(String s)
		{
			return (ConnectionType)Enum.valueOf(android/support/constraint/solver/widgets/ConstraintAnchor$ConnectionType, s);
		//    0    0:ldc1            #2   <Class ConstraintAnchor$ConnectionType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ConstraintAnchor$ConnectionType>
		//    4    9:areturn         
		}

		public static ConnectionType[] values()
		{
			return (ConnectionType[])((ConnectionType []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field ConstraintAnchor$ConnectionType[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Landroid.support.constraint.solver.widgets.ConstraintAnchor$ConnectionType_3B_.clone()>
		//    2    6:checkcast       #38  <Class ConstraintAnchor$ConnectionType[]>
		//    3    9:areturn         
		}

		private static final ConnectionType $VALUES[];
		public static final ConnectionType RELAXED;
		public static final ConnectionType STRICT;

		static 
		{
			RELAXED = new ConnectionType("RELAXED", 0);
		//    0    0:new             #2   <Class ConstraintAnchor$ConnectionType>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "RELAXED">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void ConstraintAnchor$ConnectionType(String, int)>
		//    5   10:putstatic       #22  <Field ConstraintAnchor$ConnectionType RELAXED>
			STRICT = new ConnectionType("STRICT", 1);
		//    6   13:new             #2   <Class ConstraintAnchor$ConnectionType>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "STRICT">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void ConstraintAnchor$ConnectionType(String, int)>
		//   11   23:putstatic       #25  <Field ConstraintAnchor$ConnectionType STRICT>
			$VALUES = (new ConnectionType[] {
				RELAXED, STRICT
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       ConnectionType[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field ConstraintAnchor$ConnectionType RELAXED>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field ConstraintAnchor$ConnectionType STRICT>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field ConstraintAnchor$ConnectionType[] $VALUES>
		//*  23   45:return          
		}

		private ConnectionType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class Strength extends Enum
	{

		public static Strength valueOf(String s)
		{
			return (Strength)Enum.valueOf(android/support/constraint/solver/widgets/ConstraintAnchor$Strength, s);
		//    0    0:ldc1            #2   <Class ConstraintAnchor$Strength>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ConstraintAnchor$Strength>
		//    4    9:areturn         
		}

		public static Strength[] values()
		{
			return (Strength[])((Strength []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field ConstraintAnchor$Strength[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Landroid.support.constraint.solver.widgets.ConstraintAnchor$Strength_3B_.clone()>
		//    2    6:checkcast       #42  <Class ConstraintAnchor$Strength[]>
		//    3    9:areturn         
		}

		private static final Strength $VALUES[];
		public static final Strength NONE;
		public static final Strength STRONG;
		public static final Strength WEAK;

		static 
		{
			NONE = new Strength("NONE", 0);
		//    0    0:new             #2   <Class ConstraintAnchor$Strength>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "NONE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void ConstraintAnchor$Strength(String, int)>
		//    5   10:putstatic       #23  <Field ConstraintAnchor$Strength NONE>
			STRONG = new Strength("STRONG", 1);
		//    6   13:new             #2   <Class ConstraintAnchor$Strength>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "STRONG">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void ConstraintAnchor$Strength(String, int)>
		//   11   23:putstatic       #26  <Field ConstraintAnchor$Strength STRONG>
			WEAK = new Strength("WEAK", 2);
		//   12   26:new             #2   <Class ConstraintAnchor$Strength>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "WEAK">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void ConstraintAnchor$Strength(String, int)>
		//   17   36:putstatic       #29  <Field ConstraintAnchor$Strength WEAK>
			$VALUES = (new Strength[] {
				NONE, STRONG, WEAK
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       Strength[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field ConstraintAnchor$Strength NONE>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field ConstraintAnchor$Strength STRONG>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field ConstraintAnchor$Strength WEAK>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field ConstraintAnchor$Strength[] $VALUES>
		//*  33   64:return          
		}

		private Strength(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class Type extends Enum
	{

		public static Type valueOf(String s)
		{
			return (Type)Enum.valueOf(android/support/constraint/solver/widgets/ConstraintAnchor$Type, s);
		//    0    0:ldc1            #2   <Class ConstraintAnchor$Type>
		//    1    2:aload_0         
		//    2    3:invokestatic    #63  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ConstraintAnchor$Type>
		//    4    9:areturn         
		}

		public static Type[] values()
		{
			return (Type[])((Type []) ($VALUES)).clone();
		//    0    0:getstatic       #55  <Field ConstraintAnchor$Type[] $VALUES>
		//    1    3:invokevirtual   #70  <Method Object _5B_Landroid.support.constraint.solver.widgets.ConstraintAnchor$Type_3B_.clone()>
		//    2    6:checkcast       #66  <Class ConstraintAnchor$Type[]>
		//    3    9:areturn         
		}

		private static final Type $VALUES[];
		public static final Type BASELINE;
		public static final Type BOTTOM;
		public static final Type CENTER;
		public static final Type CENTER_X;
		public static final Type CENTER_Y;
		public static final Type LEFT;
		public static final Type NONE;
		public static final Type RIGHT;
		public static final Type TOP;

		static 
		{
			NONE = new Type("NONE", 0);
		//    0    0:new             #2   <Class ConstraintAnchor$Type>
		//    1    3:dup             
		//    2    4:ldc1            #23  <String "NONE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #27  <Method void ConstraintAnchor$Type(String, int)>
		//    5   10:putstatic       #29  <Field ConstraintAnchor$Type NONE>
			LEFT = new Type("LEFT", 1);
		//    6   13:new             #2   <Class ConstraintAnchor$Type>
		//    7   16:dup             
		//    8   17:ldc1            #30  <String "LEFT">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #27  <Method void ConstraintAnchor$Type(String, int)>
		//   11   23:putstatic       #32  <Field ConstraintAnchor$Type LEFT>
			TOP = new Type("TOP", 2);
		//   12   26:new             #2   <Class ConstraintAnchor$Type>
		//   13   29:dup             
		//   14   30:ldc1            #33  <String "TOP">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #27  <Method void ConstraintAnchor$Type(String, int)>
		//   17   36:putstatic       #35  <Field ConstraintAnchor$Type TOP>
			RIGHT = new Type("RIGHT", 3);
		//   18   39:new             #2   <Class ConstraintAnchor$Type>
		//   19   42:dup             
		//   20   43:ldc1            #36  <String "RIGHT">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #27  <Method void ConstraintAnchor$Type(String, int)>
		//   23   49:putstatic       #38  <Field ConstraintAnchor$Type RIGHT>
			BOTTOM = new Type("BOTTOM", 4);
		//   24   52:new             #2   <Class ConstraintAnchor$Type>
		//   25   55:dup             
		//   26   56:ldc1            #39  <String "BOTTOM">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #27  <Method void ConstraintAnchor$Type(String, int)>
		//   29   62:putstatic       #41  <Field ConstraintAnchor$Type BOTTOM>
			BASELINE = new Type("BASELINE", 5);
		//   30   65:new             #2   <Class ConstraintAnchor$Type>
		//   31   68:dup             
		//   32   69:ldc1            #42  <String "BASELINE">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #27  <Method void ConstraintAnchor$Type(String, int)>
		//   35   75:putstatic       #44  <Field ConstraintAnchor$Type BASELINE>
			CENTER = new Type("CENTER", 6);
		//   36   78:new             #2   <Class ConstraintAnchor$Type>
		//   37   81:dup             
		//   38   82:ldc1            #45  <String "CENTER">
		//   39   84:bipush          6
		//   40   86:invokespecial   #27  <Method void ConstraintAnchor$Type(String, int)>
		//   41   89:putstatic       #47  <Field ConstraintAnchor$Type CENTER>
			CENTER_X = new Type("CENTER_X", 7);
		//   42   92:new             #2   <Class ConstraintAnchor$Type>
		//   43   95:dup             
		//   44   96:ldc1            #48  <String "CENTER_X">
		//   45   98:bipush          7
		//   46  100:invokespecial   #27  <Method void ConstraintAnchor$Type(String, int)>
		//   47  103:putstatic       #50  <Field ConstraintAnchor$Type CENTER_X>
			CENTER_Y = new Type("CENTER_Y", 8);
		//   48  106:new             #2   <Class ConstraintAnchor$Type>
		//   49  109:dup             
		//   50  110:ldc1            #51  <String "CENTER_Y">
		//   51  112:bipush          8
		//   52  114:invokespecial   #27  <Method void ConstraintAnchor$Type(String, int)>
		//   53  117:putstatic       #53  <Field ConstraintAnchor$Type CENTER_Y>
			$VALUES = (new Type[] {
				NONE, LEFT, TOP, RIGHT, BOTTOM, BASELINE, CENTER, CENTER_X, CENTER_Y
			});
		//   54  120:bipush          9
		//   55  122:anewarray       Type[]
		//   56  125:dup             
		//   57  126:iconst_0        
		//   58  127:getstatic       #29  <Field ConstraintAnchor$Type NONE>
		//   59  130:aastore         
		//   60  131:dup             
		//   61  132:iconst_1        
		//   62  133:getstatic       #32  <Field ConstraintAnchor$Type LEFT>
		//   63  136:aastore         
		//   64  137:dup             
		//   65  138:iconst_2        
		//   66  139:getstatic       #35  <Field ConstraintAnchor$Type TOP>
		//   67  142:aastore         
		//   68  143:dup             
		//   69  144:iconst_3        
		//   70  145:getstatic       #38  <Field ConstraintAnchor$Type RIGHT>
		//   71  148:aastore         
		//   72  149:dup             
		//   73  150:iconst_4        
		//   74  151:getstatic       #41  <Field ConstraintAnchor$Type BOTTOM>
		//   75  154:aastore         
		//   76  155:dup             
		//   77  156:iconst_5        
		//   78  157:getstatic       #44  <Field ConstraintAnchor$Type BASELINE>
		//   79  160:aastore         
		//   80  161:dup             
		//   81  162:bipush          6
		//   82  164:getstatic       #47  <Field ConstraintAnchor$Type CENTER>
		//   83  167:aastore         
		//   84  168:dup             
		//   85  169:bipush          7
		//   86  171:getstatic       #50  <Field ConstraintAnchor$Type CENTER_X>
		//   87  174:aastore         
		//   88  175:dup             
		//   89  176:bipush          8
		//   90  178:getstatic       #53  <Field ConstraintAnchor$Type CENTER_Y>
		//   91  181:aastore         
		//   92  182:putstatic       #55  <Field ConstraintAnchor$Type[] $VALUES>
		//*  93  185:return          
		}

		private Type(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #57  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public ConstraintAnchor(ConstraintWidget constraintwidget, Type type)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		mResolutionAnchor = new ResolutionAnchor(this);
	//    2    4:aload_0         
	//    3    5:new             #40  <Class ResolutionAnchor>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #43  <Method void ResolutionAnchor(ConstraintAnchor)>
	//    7   13:putfield        #45  <Field ResolutionAnchor mResolutionAnchor>
		mMargin = 0;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #47  <Field int mMargin>
		mGoneMargin = -1;
	//   11   21:aload_0         
	//   12   22:iconst_m1       
	//   13   23:putfield        #49  <Field int mGoneMargin>
		mStrength = Strength.NONE;
	//   14   26:aload_0         
	//   15   27:getstatic       #52  <Field ConstraintAnchor$Strength ConstraintAnchor$Strength.NONE>
	//   16   30:putfield        #54  <Field ConstraintAnchor$Strength mStrength>
		mConnectionType = ConnectionType.RELAXED;
	//   17   33:aload_0         
	//   18   34:getstatic       #57  <Field ConstraintAnchor$ConnectionType ConstraintAnchor$ConnectionType.RELAXED>
	//   19   37:putfield        #59  <Field ConstraintAnchor$ConnectionType mConnectionType>
		mConnectionCreator = 0;
	//   20   40:aload_0         
	//   21   41:iconst_0        
	//   22   42:putfield        #61  <Field int mConnectionCreator>
		mOwner = constraintwidget;
	//   23   45:aload_0         
	//   24   46:aload_1         
	//   25   47:putfield        #63  <Field ConstraintWidget mOwner>
		mType = type;
	//   26   50:aload_0         
	//   27   51:aload_2         
	//   28   52:putfield        #65  <Field ConstraintAnchor$Type mType>
	//   29   55:return          
	}

	public boolean connect(ConstraintAnchor constraintanchor, int i, int j, Strength strength, int k, boolean flag)
	{
		if(constraintanchor == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       33
		{
			mTarget = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #70  <Field ConstraintAnchor mTarget>
			mMargin = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #47  <Field int mMargin>
			mGoneMargin = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #49  <Field int mGoneMargin>
			mStrength = Strength.NONE;
	//   11   19:aload_0         
	//   12   20:getstatic       #52  <Field ConstraintAnchor$Strength ConstraintAnchor$Strength.NONE>
	//   13   23:putfield        #54  <Field ConstraintAnchor$Strength mStrength>
			mConnectionCreator = 2;
	//   14   26:aload_0         
	//   15   27:iconst_2        
	//   16   28:putfield        #61  <Field int mConnectionCreator>
			return true;
	//   17   31:iconst_1        
	//   18   32:ireturn         
		}
		if(!flag && !isValidConnection(constraintanchor))
	//*  19   33:iload           6
	//*  20   35:ifne            48
	//*  21   38:aload_0         
	//*  22   39:aload_1         
	//*  23   40:invokevirtual   #74  <Method boolean isValidConnection(ConstraintAnchor)>
	//*  24   43:ifne            48
			return false;
	//   25   46:iconst_0        
	//   26   47:ireturn         
		mTarget = constraintanchor;
	//   27   48:aload_0         
	//   28   49:aload_1         
	//   29   50:putfield        #70  <Field ConstraintAnchor mTarget>
		if(i > 0)
	//*  30   53:iload_2         
	//*  31   54:ifle            65
			mMargin = i;
	//   32   57:aload_0         
	//   33   58:iload_2         
	//   34   59:putfield        #47  <Field int mMargin>
		else
	//*  35   62:goto            70
			mMargin = 0;
	//   36   65:aload_0         
	//   37   66:iconst_0        
	//   38   67:putfield        #47  <Field int mMargin>
		mGoneMargin = j;
	//   39   70:aload_0         
	//   40   71:iload_3         
	//   41   72:putfield        #49  <Field int mGoneMargin>
		mStrength = strength;
	//   42   75:aload_0         
	//   43   76:aload           4
	//   44   78:putfield        #54  <Field ConstraintAnchor$Strength mStrength>
		mConnectionCreator = k;
	//   45   81:aload_0         
	//   46   82:iload           5
	//   47   84:putfield        #61  <Field int mConnectionCreator>
		return true;
	//   48   87:iconst_1        
	//   49   88:ireturn         
	}

	public boolean connect(ConstraintAnchor constraintanchor, int i, Strength strength, int j)
	{
		return connect(constraintanchor, i, -1, strength, j, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_m1       
	//    4    4:aload_3         
	//    5    5:iload           4
	//    6    7:iconst_0        
	//    7    8:invokevirtual   #77  <Method boolean connect(ConstraintAnchor, int, int, ConstraintAnchor$Strength, int, boolean)>
	//    8   11:ireturn         
	}

	public int getConnectionCreator()
	{
		return mConnectionCreator;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int mConnectionCreator>
	//    2    4:ireturn         
	}

	public int getMargin()
	{
		if(mOwner.getVisibility() == 8)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field ConstraintWidget mOwner>
	//*   2    4:invokevirtual   #85  <Method int ConstraintWidget.getVisibility()>
	//*   3    7:bipush          8
	//*   4    9:icmpne          14
			return 0;
	//    5   12:iconst_0        
	//    6   13:ireturn         
		if(mGoneMargin > -1)
	//*   7   14:aload_0         
	//*   8   15:getfield        #49  <Field int mGoneMargin>
	//*   9   18:iconst_m1       
	//*  10   19:icmple          48
		{
			ConstraintAnchor constraintanchor = mTarget;
	//   11   22:aload_0         
	//   12   23:getfield        #70  <Field ConstraintAnchor mTarget>
	//   13   26:astore_1        
			if(constraintanchor != null && constraintanchor.mOwner.getVisibility() == 8)
	//*  14   27:aload_1         
	//*  15   28:ifnull          48
	//*  16   31:aload_1         
	//*  17   32:getfield        #63  <Field ConstraintWidget mOwner>
	//*  18   35:invokevirtual   #85  <Method int ConstraintWidget.getVisibility()>
	//*  19   38:bipush          8
	//*  20   40:icmpne          48
				return mGoneMargin;
	//   21   43:aload_0         
	//   22   44:getfield        #49  <Field int mGoneMargin>
	//   23   47:ireturn         
		}
		return mMargin;
	//   24   48:aload_0         
	//   25   49:getfield        #47  <Field int mMargin>
	//   26   52:ireturn         
	}

	public ConstraintWidget getOwner()
	{
		return mOwner;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field ConstraintWidget mOwner>
	//    2    4:areturn         
	}

	public ResolutionAnchor getResolutionNode()
	{
		return mResolutionAnchor;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field ResolutionAnchor mResolutionAnchor>
	//    2    4:areturn         
	}

	public SolverVariable getSolverVariable()
	{
		return mSolverVariable;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field SolverVariable mSolverVariable>
	//    2    4:areturn         
	}

	public Strength getStrength()
	{
		return mStrength;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field ConstraintAnchor$Strength mStrength>
	//    2    4:areturn         
	}

	public ConstraintAnchor getTarget()
	{
		return mTarget;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field ConstraintAnchor mTarget>
	//    2    4:areturn         
	}

	public Type getType()
	{
		return mType;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field ConstraintAnchor$Type mType>
	//    2    4:areturn         
	}

	public boolean isConnected()
	{
		return mTarget != null;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field ConstraintAnchor mTarget>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isValidConnection(ConstraintAnchor constraintanchor)
	{
		boolean flag3 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(constraintanchor == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       8
			return false;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		Type type = constraintanchor.getType();
	//    6    8:aload_1         
	//    7    9:invokevirtual   #103 <Method ConstraintAnchor$Type getType()>
	//    8   12:astore          4
		Type type1 = mType;
	//    9   14:aload_0         
	//   10   15:getfield        #65  <Field ConstraintAnchor$Type mType>
	//   11   18:astore          5
		if(type == type1)
	//*  12   20:aload           4
	//*  13   22:aload           5
	//*  14   24:if_acmpne       59
			return type1 != Type.BASELINE || constraintanchor.getOwner().hasBaseline() && getOwner().hasBaseline();
	//   15   27:aload           5
	//   16   29:getstatic       #106 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BASELINE>
	//   17   32:if_acmpne       57
	//   18   35:aload_1         
	//   19   36:invokevirtual   #108 <Method ConstraintWidget getOwner()>
	//   20   39:invokevirtual   #111 <Method boolean ConstraintWidget.hasBaseline()>
	//   21   42:ifeq            55
	//   22   45:aload_0         
	//   23   46:invokevirtual   #108 <Method ConstraintWidget getOwner()>
	//   24   49:invokevirtual   #111 <Method boolean ConstraintWidget.hasBaseline()>
	//   25   52:ifne            57
	//   26   55:iconst_0        
	//   27   56:ireturn         
	//   28   57:iconst_1        
	//   29   58:ireturn         
		static class _cls1
		{

			static final int $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[];

			static 
			{
				$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type = new int[Type.values().length];
			//    0    0:invokestatic    #18  <Method ConstraintAnchor$Type[] ConstraintAnchor$Type.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
				try
				{
					$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[Type.CENTER.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
			//    5   12:getstatic       #24  <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER>
			//    6   15:invokevirtual   #28  <Method int ConstraintAnchor$Type.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
			//*  10   23:getstatic       #31  <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
			//*  11   26:invokevirtual   #28  <Method int ConstraintAnchor$Type.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
			//*  15   34:getstatic       #34  <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
			//*  16   37:invokevirtual   #28  <Method int ConstraintAnchor$Type.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
			//*  20   45:getstatic       #37  <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
			//*  21   48:invokevirtual   #28  <Method int ConstraintAnchor$Type.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
			//*  25   56:getstatic       #40  <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
			//*  26   59:invokevirtual   #28  <Method int ConstraintAnchor$Type.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
			//*  30   67:getstatic       #43  <Field ConstraintAnchor$Type ConstraintAnchor$Type.BASELINE>
			//*  31   70:invokevirtual   #28  <Method int ConstraintAnchor$Type.ordinal()>
			//*  32   73:bipush          6
			//*  33   75:iastore         
			//*  34   76:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
			//*  35   79:getstatic       #46  <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_X>
			//*  36   82:invokevirtual   #28  <Method int ConstraintAnchor$Type.ordinal()>
			//*  37   85:bipush          7
			//*  38   87:iastore         
			//*  39   88:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
			//*  40   91:getstatic       #49  <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_Y>
			//*  41   94:invokevirtual   #28  <Method int ConstraintAnchor$Type.ordinal()>
			//*  42   97:bipush          8
			//*  43   99:iastore         
			//*  44  100:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
			//*  45  103:getstatic       #52  <Field ConstraintAnchor$Type ConstraintAnchor$Type.NONE>
			//*  46  106:invokevirtual   #28  <Method int ConstraintAnchor$Type.ordinal()>
			//*  47  109:bipush          9
			//*  48  111:iastore         
			//*  49  112:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   50  113:astore_0        
				try
				{
					$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[Type.LEFT.ordinal()] = 2;
				}
			//*  51  114:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   52  117:astore_0        
				try
				{
					$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[Type.RIGHT.ordinal()] = 3;
				}
			//*  53  118:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   54  121:astore_0        
				try
				{
					$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[Type.TOP.ordinal()] = 4;
				}
			//*  55  122:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   56  125:astore_0        
				try
				{
					$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[Type.BOTTOM.ordinal()] = 5;
				}
			//*  57  126:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   58  129:astore_0        
				try
				{
					$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[Type.BASELINE.ordinal()] = 6;
				}
			//*  59  130:goto            64
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   60  133:astore_0        
				try
				{
					$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[Type.CENTER_X.ordinal()] = 7;
				}
			//*  61  134:goto            76
				catch(NoSuchFieldError nosuchfielderror6) { }
			//   62  137:astore_0        
				try
				{
					$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[Type.CENTER_Y.ordinal()] = 8;
				}
			//*  63  138:goto            88
				catch(NoSuchFieldError nosuchfielderror7) { }
			//   64  141:astore_0        
				try
				{
					$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[Type.NONE.ordinal()] = 9;
				}
			//*  65  142:goto            100
				catch(NoSuchFieldError nosuchfielderror8) { }
			//   66  145:astore_0        
			//*  67  146:return          
			}
		}

		boolean flag2;
		switch(_cls1..SwitchMap.android.support.constraint.solver.widgets.ConstraintAnchor.Type[mType.ordinal()])
	//*  30   59:getstatic       #115 <Field int[] ConstraintAnchor$1.$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*  31   62:aload_0         
	//*  32   63:getfield        #65  <Field ConstraintAnchor$Type mType>
	//*  33   66:invokevirtual   #118 <Method int ConstraintAnchor$Type.ordinal()>
	//*  34   69:iaload          
		{
	//*  35   70:tableswitch     1 9: default 120
	//	               1 255
	//	               2 196
	//	               3 196
	//	               4 137
	//	               5 137
	//	               6 135
	//	               7 135
	//	               8 135
	//	               9 135
		default:
			throw new AssertionError(((Object) (mType.name())));
	//   36  120:new             #120 <Class AssertionError>
	//   37  123:dup             
	//   38  124:aload_0         
	//   39  125:getfield        #65  <Field ConstraintAnchor$Type mType>
	//   40  128:invokevirtual   #124 <Method String ConstraintAnchor$Type.name()>
	//   41  131:invokespecial   #127 <Method void AssertionError(Object)>
	//   42  134:athrow          

		case 6: // '\006'
		case 7: // '\007'
		case 8: // '\b'
		case 9: // '\t'
			return false;
	//   43  135:iconst_0        
	//   44  136:ireturn         

		case 4: // '\004'
		case 5: // '\005'
			boolean flag;
			if(type != Type.TOP && type != Type.BOTTOM)
	//*  45  137:aload           4
	//*  46  139:getstatic       #130 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//*  47  142:if_acmpeq       161
	//*  48  145:aload           4
	//*  49  147:getstatic       #133 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//*  50  150:if_acmpne       156
	//*  51  153:goto            161
				flag = false;
	//   52  156:iconst_0        
	//   53  157:istore_2        
			else
	//*  54  158:goto            163
				flag = true;
	//   55  161:iconst_1        
	//   56  162:istore_2        
			flag3 = flag;
	//   57  163:iload_2         
	//   58  164:istore_3        
			if(constraintanchor.getOwner() instanceof Guideline)
	//*  59  165:aload_1         
	//*  60  166:invokevirtual   #108 <Method ConstraintWidget getOwner()>
	//*  61  169:instanceof      #135 <Class Guideline>
	//*  62  172:ifeq            194
			{
				if(!flag && type != Type.CENTER_Y)
	//*  63  175:iload_2         
	//*  64  176:ifne            192
	//*  65  179:aload           4
	//*  66  181:getstatic       #138 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_Y>
	//*  67  184:if_acmpne       190
	//*  68  187:goto            192
					return false;
	//   69  190:iconst_0        
	//   70  191:ireturn         
				flag3 = true;
	//   71  192:iconst_1        
	//   72  193:istore_3        
			}
			return flag3;
	//   73  194:iload_3         
	//   74  195:ireturn         

		case 2: // '\002'
		case 3: // '\003'
			boolean flag1;
			if(type != Type.LEFT && type != Type.RIGHT)
	//*  75  196:aload           4
	//*  76  198:getstatic       #141 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//*  77  201:if_acmpeq       220
	//*  78  204:aload           4
	//*  79  206:getstatic       #144 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//*  80  209:if_acmpne       215
	//*  81  212:goto            220
				flag1 = false;
	//   82  215:iconst_0        
	//   83  216:istore_2        
			else
	//*  84  217:goto            222
				flag1 = true;
	//   85  220:iconst_1        
	//   86  221:istore_2        
			flag3 = flag1;
	//   87  222:iload_2         
	//   88  223:istore_3        
			if(constraintanchor.getOwner() instanceof Guideline)
	//*  89  224:aload_1         
	//*  90  225:invokevirtual   #108 <Method ConstraintWidget getOwner()>
	//*  91  228:instanceof      #135 <Class Guideline>
	//*  92  231:ifeq            253
			{
				if(!flag1 && type != Type.CENTER_X)
	//*  93  234:iload_2         
	//*  94  235:ifne            251
	//*  95  238:aload           4
	//*  96  240:getstatic       #147 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_X>
	//*  97  243:if_acmpne       249
	//*  98  246:goto            251
					return false;
	//   99  249:iconst_0        
	//  100  250:ireturn         
				flag3 = true;
	//  101  251:iconst_1        
	//  102  252:istore_3        
			}
			return flag3;
	//  103  253:iload_3         
	//  104  254:ireturn         

		case 1: // '\001'
			flag2 = flag3;
	//  105  255:iload_3         
	//  106  256:istore_2        
			break;
		}
		if(type != Type.BASELINE)
	//* 107  257:aload           4
	//* 108  259:getstatic       #106 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BASELINE>
	//* 109  262:if_acmpeq       287
		{
			flag2 = flag3;
	//  110  265:iload_3         
	//  111  266:istore_2        
			if(type != Type.CENTER_X)
	//* 112  267:aload           4
	//* 113  269:getstatic       #147 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_X>
	//* 114  272:if_acmpeq       287
			{
				flag2 = flag3;
	//  115  275:iload_3         
	//  116  276:istore_2        
				if(type != Type.CENTER_Y)
	//* 117  277:aload           4
	//* 118  279:getstatic       #138 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_Y>
	//* 119  282:if_acmpeq       287
					flag2 = true;
	//  120  285:iconst_1        
	//  121  286:istore_2        
			}
		}
		return flag2;
	//  122  287:iload_2         
	//  123  288:ireturn         
	}

	public void reset()
	{
		mTarget = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #70  <Field ConstraintAnchor mTarget>
		mMargin = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #47  <Field int mMargin>
		mGoneMargin = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #49  <Field int mGoneMargin>
		mStrength = Strength.STRONG;
	//    9   15:aload_0         
	//   10   16:getstatic       #151 <Field ConstraintAnchor$Strength ConstraintAnchor$Strength.STRONG>
	//   11   19:putfield        #54  <Field ConstraintAnchor$Strength mStrength>
		mConnectionCreator = 0;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #61  <Field int mConnectionCreator>
		mConnectionType = ConnectionType.RELAXED;
	//   15   27:aload_0         
	//   16   28:getstatic       #57  <Field ConstraintAnchor$ConnectionType ConstraintAnchor$ConnectionType.RELAXED>
	//   17   31:putfield        #59  <Field ConstraintAnchor$ConnectionType mConnectionType>
		mResolutionAnchor.reset();
	//   18   34:aload_0         
	//   19   35:getfield        #45  <Field ResolutionAnchor mResolutionAnchor>
	//   20   38:invokevirtual   #153 <Method void ResolutionAnchor.reset()>
	//   21   41:return          
	}

	public void resetSolverVariable(Cache cache)
	{
		cache = ((Cache) (mSolverVariable));
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field SolverVariable mSolverVariable>
	//    2    4:astore_1        
		if(cache == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       25
		{
			mSolverVariable = new SolverVariable(android.support.constraint.solver.SolverVariable.Type.UNRESTRICTED, ((String) (null)));
	//    5    9:aload_0         
	//    6   10:new             #157 <Class SolverVariable>
	//    7   13:dup             
	//    8   14:getstatic       #163 <Field android.support.constraint.solver.SolverVariable$Type android.support.constraint.solver.SolverVariable$Type.UNRESTRICTED>
	//    9   17:aconst_null     
	//   10   18:invokespecial   #166 <Method void SolverVariable(android.support.constraint.solver.SolverVariable$Type, String)>
	//   11   21:putfield        #93  <Field SolverVariable mSolverVariable>
			return;
	//   12   24:return          
		} else
		{
			((SolverVariable) (cache)).reset();
	//   13   25:aload_1         
	//   14   26:invokevirtual   #167 <Method void SolverVariable.reset()>
			return;
	//   15   29:return          
		}
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #170 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #171 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(mOwner.getDebugName());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #63  <Field ConstraintWidget mOwner>
	//    7   13:invokevirtual   #174 <Method String ConstraintWidget.getDebugName()>
	//    8   16:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append(":");
	//   10   20:aload_1         
	//   11   21:ldc1            #180 <String ":">
	//   12   23:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(mType.toString());
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:getfield        #65  <Field ConstraintAnchor$Type mType>
	//   17   32:invokevirtual   #182 <Method String ConstraintAnchor$Type.toString()>
	//   18   35:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
		return stringbuilder.toString();
	//   20   39:aload_1         
	//   21   40:invokevirtual   #183 <Method String StringBuilder.toString()>
	//   22   43:areturn         
	}

	private int mConnectionCreator;
	private ConnectionType mConnectionType;
	int mGoneMargin;
	public int mMargin;
	final ConstraintWidget mOwner;
	private ResolutionAnchor mResolutionAnchor;
	SolverVariable mSolverVariable;
	private Strength mStrength;
	ConstraintAnchor mTarget;
	final Type mType;
}
