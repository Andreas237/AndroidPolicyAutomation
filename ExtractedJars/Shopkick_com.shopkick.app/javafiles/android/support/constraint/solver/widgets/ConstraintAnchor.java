// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;

import android.support.constraint.solver.Cache;
import android.support.constraint.solver.SolverVariable;
import java.util.ArrayList;
import java.util.HashSet;

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
	//    1    1:invokespecial   #48  <Method void Object()>
		mResolutionAnchor = new ResolutionAnchor(this);
	//    2    4:aload_0         
	//    3    5:new             #50  <Class ResolutionAnchor>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #53  <Method void ResolutionAnchor(ConstraintAnchor)>
	//    7   13:putfield        #55  <Field ResolutionAnchor mResolutionAnchor>
		mMargin = 0;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #57  <Field int mMargin>
		mGoneMargin = -1;
	//   11   21:aload_0         
	//   12   22:iconst_m1       
	//   13   23:putfield        #59  <Field int mGoneMargin>
		mStrength = Strength.NONE;
	//   14   26:aload_0         
	//   15   27:getstatic       #62  <Field ConstraintAnchor$Strength ConstraintAnchor$Strength.NONE>
	//   16   30:putfield        #64  <Field ConstraintAnchor$Strength mStrength>
		mConnectionType = ConnectionType.RELAXED;
	//   17   33:aload_0         
	//   18   34:getstatic       #67  <Field ConstraintAnchor$ConnectionType ConstraintAnchor$ConnectionType.RELAXED>
	//   19   37:putfield        #69  <Field ConstraintAnchor$ConnectionType mConnectionType>
		mConnectionCreator = 0;
	//   20   40:aload_0         
	//   21   41:iconst_0        
	//   22   42:putfield        #71  <Field int mConnectionCreator>
		mOwner = constraintwidget;
	//   23   45:aload_0         
	//   24   46:aload_1         
	//   25   47:putfield        #73  <Field ConstraintWidget mOwner>
		mType = type;
	//   26   50:aload_0         
	//   27   51:aload_2         
	//   28   52:putfield        #75  <Field ConstraintAnchor$Type mType>
	//   29   55:return          
	}

	private boolean isConnectionToMe(ConstraintWidget constraintwidget, HashSet hashset)
	{
		if(hashset.contains(((Object) (constraintwidget))))
	//*   0    0:aload_2         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #84  <Method boolean HashSet.contains(Object)>
	//*   3    5:ifeq            10
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		hashset.add(((Object) (constraintwidget)));
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #87  <Method boolean HashSet.add(Object)>
	//    9   15:pop             
		if(constraintwidget == getOwner())
	//*  10   16:aload_1         
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #91  <Method ConstraintWidget getOwner()>
	//*  13   21:if_acmpne       26
			return true;
	//   14   24:iconst_1        
	//   15   25:ireturn         
		constraintwidget = ((ConstraintWidget) (constraintwidget.getAnchors()));
	//   16   26:aload_1         
	//   17   27:invokevirtual   #97  <Method ArrayList ConstraintWidget.getAnchors()>
	//   18   30:astore_1        
		int j = ((ArrayList) (constraintwidget)).size();
	//   19   31:aload_1         
	//   20   32:invokevirtual   #103 <Method int ArrayList.size()>
	//   21   35:istore          4
		for(int i = 0; i < j; i++)
	//*  22   37:iconst_0        
	//*  23   38:istore_3        
	//*  24   39:iload_3         
	//*  25   40:iload           4
	//*  26   42:icmpge          97
		{
			ConstraintAnchor constraintanchor = (ConstraintAnchor)((ArrayList) (constraintwidget)).get(i);
	//   27   45:aload_1         
	//   28   46:iload_3         
	//   29   47:invokevirtual   #107 <Method Object ArrayList.get(int)>
	//   30   50:checkcast       #2   <Class ConstraintAnchor>
	//   31   53:astore          5
			if(constraintanchor.isSimilarDimensionConnection(this) && constraintanchor.isConnected() && isConnectionToMe(constraintanchor.getTarget().getOwner(), hashset))
	//*  32   55:aload           5
	//*  33   57:aload_0         
	//*  34   58:invokevirtual   #111 <Method boolean isSimilarDimensionConnection(ConstraintAnchor)>
	//*  35   61:ifeq            90
	//*  36   64:aload           5
	//*  37   66:invokevirtual   #115 <Method boolean isConnected()>
	//*  38   69:ifeq            90
	//*  39   72:aload_0         
	//*  40   73:aload           5
	//*  41   75:invokevirtual   #119 <Method ConstraintAnchor getTarget()>
	//*  42   78:invokevirtual   #91  <Method ConstraintWidget getOwner()>
	//*  43   81:aload_2         
	//*  44   82:invokespecial   #121 <Method boolean isConnectionToMe(ConstraintWidget, HashSet)>
	//*  45   85:ifeq            90
				return true;
	//   46   88:iconst_1        
	//   47   89:ireturn         
		}

	//   48   90:iload_3         
	//   49   91:iconst_1        
	//   50   92:iadd            
	//   51   93:istore_3        
	//*  52   94:goto            39
		return false;
	//   53   97:iconst_0        
	//   54   98:ireturn         
	}

	public boolean connect(ConstraintAnchor constraintanchor, int i)
	{
		return connect(constraintanchor, i, -1, Strength.STRONG, 0, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_m1       
	//    4    4:getstatic       #128 <Field ConstraintAnchor$Strength ConstraintAnchor$Strength.STRONG>
	//    5    7:iconst_0        
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #131 <Method boolean connect(ConstraintAnchor, int, int, ConstraintAnchor$Strength, int, boolean)>
	//    8   12:ireturn         
	}

	public boolean connect(ConstraintAnchor constraintanchor, int i, int j)
	{
		return connect(constraintanchor, i, -1, Strength.STRONG, j, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_m1       
	//    4    4:getstatic       #128 <Field ConstraintAnchor$Strength ConstraintAnchor$Strength.STRONG>
	//    5    7:iload_3         
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #131 <Method boolean connect(ConstraintAnchor, int, int, ConstraintAnchor$Strength, int, boolean)>
	//    8   12:ireturn         
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
	//    4    6:putfield        #134 <Field ConstraintAnchor mTarget>
			mMargin = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #57  <Field int mMargin>
			mGoneMargin = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #59  <Field int mGoneMargin>
			mStrength = Strength.NONE;
	//   11   19:aload_0         
	//   12   20:getstatic       #62  <Field ConstraintAnchor$Strength ConstraintAnchor$Strength.NONE>
	//   13   23:putfield        #64  <Field ConstraintAnchor$Strength mStrength>
			mConnectionCreator = 2;
	//   14   26:aload_0         
	//   15   27:iconst_2        
	//   16   28:putfield        #71  <Field int mConnectionCreator>
			return true;
	//   17   31:iconst_1        
	//   18   32:ireturn         
		}
		if(!flag && !isValidConnection(constraintanchor))
	//*  19   33:iload           6
	//*  20   35:ifne            48
	//*  21   38:aload_0         
	//*  22   39:aload_1         
	//*  23   40:invokevirtual   #137 <Method boolean isValidConnection(ConstraintAnchor)>
	//*  24   43:ifne            48
			return false;
	//   25   46:iconst_0        
	//   26   47:ireturn         
		mTarget = constraintanchor;
	//   27   48:aload_0         
	//   28   49:aload_1         
	//   29   50:putfield        #134 <Field ConstraintAnchor mTarget>
		if(i > 0)
	//*  30   53:iload_2         
	//*  31   54:ifle            65
			mMargin = i;
	//   32   57:aload_0         
	//   33   58:iload_2         
	//   34   59:putfield        #57  <Field int mMargin>
		else
	//*  35   62:goto            70
			mMargin = 0;
	//   36   65:aload_0         
	//   37   66:iconst_0        
	//   38   67:putfield        #57  <Field int mMargin>
		mGoneMargin = j;
	//   39   70:aload_0         
	//   40   71:iload_3         
	//   41   72:putfield        #59  <Field int mGoneMargin>
		mStrength = strength;
	//   42   75:aload_0         
	//   43   76:aload           4
	//   44   78:putfield        #64  <Field ConstraintAnchor$Strength mStrength>
		mConnectionCreator = k;
	//   45   81:aload_0         
	//   46   82:iload           5
	//   47   84:putfield        #71  <Field int mConnectionCreator>
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
	//    7    8:invokevirtual   #131 <Method boolean connect(ConstraintAnchor, int, int, ConstraintAnchor$Strength, int, boolean)>
	//    8   11:ireturn         
	}

	public int getConnectionCreator()
	{
		return mConnectionCreator;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int mConnectionCreator>
	//    2    4:ireturn         
	}

	public ConnectionType getConnectionType()
	{
		return mConnectionType;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field ConstraintAnchor$ConnectionType mConnectionType>
	//    2    4:areturn         
	}

	public int getMargin()
	{
		if(mOwner.getVisibility() == 8)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field ConstraintWidget mOwner>
	//*   2    4:invokevirtual   #145 <Method int ConstraintWidget.getVisibility()>
	//*   3    7:bipush          8
	//*   4    9:icmpne          14
			return 0;
	//    5   12:iconst_0        
	//    6   13:ireturn         
		if(mGoneMargin > -1)
	//*   7   14:aload_0         
	//*   8   15:getfield        #59  <Field int mGoneMargin>
	//*   9   18:iconst_m1       
	//*  10   19:icmple          48
		{
			ConstraintAnchor constraintanchor = mTarget;
	//   11   22:aload_0         
	//   12   23:getfield        #134 <Field ConstraintAnchor mTarget>
	//   13   26:astore_1        
			if(constraintanchor != null && constraintanchor.mOwner.getVisibility() == 8)
	//*  14   27:aload_1         
	//*  15   28:ifnull          48
	//*  16   31:aload_1         
	//*  17   32:getfield        #73  <Field ConstraintWidget mOwner>
	//*  18   35:invokevirtual   #145 <Method int ConstraintWidget.getVisibility()>
	//*  19   38:bipush          8
	//*  20   40:icmpne          48
				return mGoneMargin;
	//   21   43:aload_0         
	//   22   44:getfield        #59  <Field int mGoneMargin>
	//   23   47:ireturn         
		}
		return mMargin;
	//   24   48:aload_0         
	//   25   49:getfield        #57  <Field int mMargin>
	//   26   52:ireturn         
	}

	public final ConstraintAnchor getOpposite()
	{
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

		switch(_cls1..SwitchMap.android.support.constraint.solver.widgets.ConstraintAnchor.Type[mType.ordinal()])
	//*   0    0:getstatic       #150 <Field int[] ConstraintAnchor$1.$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*   1    3:aload_0         
	//*   2    4:getfield        #75  <Field ConstraintAnchor$Type mType>
	//*   3    7:invokevirtual   #153 <Method int ConstraintAnchor$Type.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 9: default 60
	//	               1 107
	//	               2 99
	//	               3 91
	//	               4 83
	//	               5 75
	//	               6 107
	//	               7 107
	//	               8 107
	//	               9 107
		default:
			throw new AssertionError(((Object) (mType.name())));
	//    6   60:new             #155 <Class AssertionError>
	//    7   63:dup             
	//    8   64:aload_0         
	//    9   65:getfield        #75  <Field ConstraintAnchor$Type mType>
	//   10   68:invokevirtual   #159 <Method String ConstraintAnchor$Type.name()>
	//   11   71:invokespecial   #162 <Method void AssertionError(Object)>
	//   12   74:athrow          

		case 5: // '\005'
			return mOwner.mTop;
	//   13   75:aload_0         
	//   14   76:getfield        #73  <Field ConstraintWidget mOwner>
	//   15   79:getfield        #165 <Field ConstraintAnchor ConstraintWidget.mTop>
	//   16   82:areturn         

		case 4: // '\004'
			return mOwner.mBottom;
	//   17   83:aload_0         
	//   18   84:getfield        #73  <Field ConstraintWidget mOwner>
	//   19   87:getfield        #168 <Field ConstraintAnchor ConstraintWidget.mBottom>
	//   20   90:areturn         

		case 3: // '\003'
			return mOwner.mLeft;
	//   21   91:aload_0         
	//   22   92:getfield        #73  <Field ConstraintWidget mOwner>
	//   23   95:getfield        #171 <Field ConstraintAnchor ConstraintWidget.mLeft>
	//   24   98:areturn         

		case 2: // '\002'
			return mOwner.mRight;
	//   25   99:aload_0         
	//   26  100:getfield        #73  <Field ConstraintWidget mOwner>
	//   27  103:getfield        #174 <Field ConstraintAnchor ConstraintWidget.mRight>
	//   28  106:areturn         

		case 1: // '\001'
		case 6: // '\006'
		case 7: // '\007'
		case 8: // '\b'
		case 9: // '\t'
			return null;
	//   29  107:aconst_null     
	//   30  108:areturn         
		}
	}

	public ConstraintWidget getOwner()
	{
		return mOwner;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field ConstraintWidget mOwner>
	//    2    4:areturn         
	}

	public int getPriorityLevel()
	{
		switch(_cls1..SwitchMap.android.support.constraint.solver.widgets.ConstraintAnchor.Type[mType.ordinal()])
	//*   0    0:getstatic       #150 <Field int[] ConstraintAnchor$1.$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*   1    3:aload_0         
	//*   2    4:getfield        #75  <Field ConstraintAnchor$Type mType>
	//*   3    7:invokevirtual   #153 <Method int ConstraintAnchor$Type.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 9: default 60
	//	               1 91
	//	               2 89
	//	               3 87
	//	               4 85
	//	               5 83
	//	               6 81
	//	               7 79
	//	               8 77
	//	               9 75
		default:
			throw new AssertionError(((Object) (mType.name())));
	//    6   60:new             #155 <Class AssertionError>
	//    7   63:dup             
	//    8   64:aload_0         
	//    9   65:getfield        #75  <Field ConstraintAnchor$Type mType>
	//   10   68:invokevirtual   #159 <Method String ConstraintAnchor$Type.name()>
	//   11   71:invokespecial   #162 <Method void AssertionError(Object)>
	//   12   74:athrow          

		case 9: // '\t'
			return 0;
	//   13   75:iconst_0        
	//   14   76:ireturn         

		case 8: // '\b'
			return 0;
	//   15   77:iconst_0        
	//   16   78:ireturn         

		case 7: // '\007'
			return 0;
	//   17   79:iconst_0        
	//   18   80:ireturn         

		case 6: // '\006'
			return 1;
	//   19   81:iconst_1        
	//   20   82:ireturn         

		case 5: // '\005'
			return 2;
	//   21   83:iconst_2        
	//   22   84:ireturn         

		case 4: // '\004'
			return 2;
	//   23   85:iconst_2        
	//   24   86:ireturn         

		case 3: // '\003'
			return 2;
	//   25   87:iconst_2        
	//   26   88:ireturn         

		case 2: // '\002'
			return 2;
	//   27   89:iconst_2        
	//   28   90:ireturn         

		case 1: // '\001'
			return 2;
	//   29   91:iconst_2        
	//   30   92:ireturn         
		}
	}

	public ResolutionAnchor getResolutionNode()
	{
		return mResolutionAnchor;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field ResolutionAnchor mResolutionAnchor>
	//    2    4:areturn         
	}

	public int getSnapPriorityLevel()
	{
		switch(_cls1..SwitchMap.android.support.constraint.solver.widgets.ConstraintAnchor.Type[mType.ordinal()])
	//*   0    0:getstatic       #150 <Field int[] ConstraintAnchor$1.$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*   1    3:aload_0         
	//*   2    4:getfield        #75  <Field ConstraintAnchor$Type mType>
	//*   3    7:invokevirtual   #153 <Method int ConstraintAnchor$Type.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 9: default 60
	//	               1 91
	//	               2 89
	//	               3 87
	//	               4 85
	//	               5 83
	//	               6 81
	//	               7 79
	//	               8 77
	//	               9 75
		default:
			throw new AssertionError(((Object) (mType.name())));
	//    6   60:new             #155 <Class AssertionError>
	//    7   63:dup             
	//    8   64:aload_0         
	//    9   65:getfield        #75  <Field ConstraintAnchor$Type mType>
	//   10   68:invokevirtual   #159 <Method String ConstraintAnchor$Type.name()>
	//   11   71:invokespecial   #162 <Method void AssertionError(Object)>
	//   12   74:athrow          

		case 9: // '\t'
			return 0;
	//   13   75:iconst_0        
	//   14   76:ireturn         

		case 8: // '\b'
			return 1;
	//   15   77:iconst_1        
	//   16   78:ireturn         

		case 7: // '\007'
			return 0;
	//   17   79:iconst_0        
	//   18   80:ireturn         

		case 6: // '\006'
			return 2;
	//   19   81:iconst_2        
	//   20   82:ireturn         

		case 5: // '\005'
			return 0;
	//   21   83:iconst_0        
	//   22   84:ireturn         

		case 4: // '\004'
			return 0;
	//   23   85:iconst_0        
	//   24   86:ireturn         

		case 3: // '\003'
			return 1;
	//   25   87:iconst_1        
	//   26   88:ireturn         

		case 2: // '\002'
			return 1;
	//   27   89:iconst_1        
	//   28   90:ireturn         

		case 1: // '\001'
			return 3;
	//   29   91:iconst_3        
	//   30   92:ireturn         
		}
	}

	public SolverVariable getSolverVariable()
	{
		return mSolverVariable;
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field SolverVariable mSolverVariable>
	//    2    4:areturn         
	}

	public Strength getStrength()
	{
		return mStrength;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field ConstraintAnchor$Strength mStrength>
	//    2    4:areturn         
	}

	public ConstraintAnchor getTarget()
	{
		return mTarget;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field ConstraintAnchor mTarget>
	//    2    4:areturn         
	}

	public Type getType()
	{
		return mType;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field ConstraintAnchor$Type mType>
	//    2    4:areturn         
	}

	public boolean isConnected()
	{
		return mTarget != null;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field ConstraintAnchor mTarget>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isConnectionAllowed(ConstraintWidget constraintwidget)
	{
		if(isConnectionToMe(constraintwidget, new HashSet()))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:new             #80  <Class HashSet>
	//*   3    5:dup             
	//*   4    6:invokespecial   #189 <Method void HashSet()>
	//*   5    9:invokespecial   #121 <Method boolean isConnectionToMe(ConstraintWidget, HashSet)>
	//*   6   12:ifeq            17
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		ConstraintWidget constraintwidget1 = getOwner().getParent();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #91  <Method ConstraintWidget getOwner()>
	//   11   21:invokevirtual   #192 <Method ConstraintWidget ConstraintWidget.getParent()>
	//   12   24:astore_2        
		if(constraintwidget1 == constraintwidget)
	//*  13   25:aload_2         
	//*  14   26:aload_1         
	//*  15   27:if_acmpne       32
			return true;
	//   16   30:iconst_1        
	//   17   31:ireturn         
		return constraintwidget.getParent() == constraintwidget1;
	//   18   32:aload_1         
	//   19   33:invokevirtual   #192 <Method ConstraintWidget ConstraintWidget.getParent()>
	//   20   36:aload_2         
	//   21   37:if_acmpne       42
	//   22   40:iconst_1        
	//   23   41:ireturn         
	//   24   42:iconst_0        
	//   25   43:ireturn         
	}

	public boolean isConnectionAllowed(ConstraintWidget constraintwidget, ConstraintAnchor constraintanchor)
	{
		return isConnectionAllowed(constraintwidget);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #195 <Method boolean isConnectionAllowed(ConstraintWidget)>
	//    3    5:ireturn         
	}

	public boolean isSideAnchor()
	{
		switch(_cls1..SwitchMap.android.support.constraint.solver.widgets.ConstraintAnchor.Type[mType.ordinal()])
	//*   0    0:getstatic       #150 <Field int[] ConstraintAnchor$1.$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*   1    3:aload_0         
	//*   2    4:getfield        #75  <Field ConstraintAnchor$Type mType>
	//*   3    7:invokevirtual   #153 <Method int ConstraintAnchor$Type.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 9: default 60
	//	               1 77
	//	               2 75
	//	               3 75
	//	               4 75
	//	               5 75
	//	               6 77
	//	               7 77
	//	               8 77
	//	               9 77
		default:
			throw new AssertionError(((Object) (mType.name())));
	//    6   60:new             #155 <Class AssertionError>
	//    7   63:dup             
	//    8   64:aload_0         
	//    9   65:getfield        #75  <Field ConstraintAnchor$Type mType>
	//   10   68:invokevirtual   #159 <Method String ConstraintAnchor$Type.name()>
	//   11   71:invokespecial   #162 <Method void AssertionError(Object)>
	//   12   74:athrow          

		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
			return true;
	//   13   75:iconst_1        
	//   14   76:ireturn         

		case 1: // '\001'
		case 6: // '\006'
		case 7: // '\007'
		case 8: // '\b'
		case 9: // '\t'
			return false;
	//   15   77:iconst_0        
	//   16   78:ireturn         
		}
	}

	public boolean isSimilarDimensionConnection(ConstraintAnchor constraintanchor)
	{
		constraintanchor = ((ConstraintAnchor) (constraintanchor.getType()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #198 <Method ConstraintAnchor$Type getType()>
	//    2    4:astore_1        
		Type type = mType;
	//    3    5:aload_0         
	//    4    6:getfield        #75  <Field ConstraintAnchor$Type mType>
	//    5    9:astore          5
		boolean flag3 = true;
	//    6   11:iconst_1        
	//    7   12:istore          4
		boolean flag2 = true;
	//    8   14:iconst_1        
	//    9   15:istore_3        
		if(constraintanchor == type)
	//*  10   16:aload_1         
	//*  11   17:aload           5
	//*  12   19:if_acmpne       24
			return true;
	//   13   22:iconst_1        
	//   14   23:ireturn         
		switch(_cls1..SwitchMap.android.support.constraint.solver.widgets.ConstraintAnchor.Type[mType.ordinal()])
	//*  15   24:getstatic       #150 <Field int[] ConstraintAnchor$1.$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*  16   27:aload_0         
	//*  17   28:getfield        #75  <Field ConstraintAnchor$Type mType>
	//*  18   31:invokevirtual   #153 <Method int ConstraintAnchor$Type.ordinal()>
	//*  19   34:iaload          
		{
	//*  20   35:tableswitch     1 9: default 84
	//	               1 174
	//	               2 141
	//	               3 141
	//	               4 101
	//	               5 101
	//	               6 101
	//	               7 141
	//	               8 101
	//	               9 99
		default:
			throw new AssertionError(((Object) (mType.name())));
	//   21   84:new             #155 <Class AssertionError>
	//   22   87:dup             
	//   23   88:aload_0         
	//   24   89:getfield        #75  <Field ConstraintAnchor$Type mType>
	//   25   92:invokevirtual   #159 <Method String ConstraintAnchor$Type.name()>
	//   26   95:invokespecial   #162 <Method void AssertionError(Object)>
	//   27   98:athrow          

		case 9: // '\t'
			return false;
	//   28   99:iconst_0        
	//   29  100:ireturn         

		case 4: // '\004'
		case 5: // '\005'
		case 6: // '\006'
		case 8: // '\b'
			boolean flag = flag2;
	//   30  101:iload_3         
	//   31  102:istore_2        
			if(constraintanchor != Type.TOP)
	//*  32  103:aload_1         
	//*  33  104:getstatic       #201 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//*  34  107:if_acmpeq       139
			{
				flag = flag2;
	//   35  110:iload_3         
	//   36  111:istore_2        
				if(constraintanchor != Type.BOTTOM)
	//*  37  112:aload_1         
	//*  38  113:getstatic       #204 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//*  39  116:if_acmpeq       139
				{
					flag = flag2;
	//   40  119:iload_3         
	//   41  120:istore_2        
					if(constraintanchor != Type.CENTER_Y)
	//*  42  121:aload_1         
	//*  43  122:getstatic       #207 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_Y>
	//*  44  125:if_acmpeq       139
					{
						if(constraintanchor == Type.BASELINE)
	//*  45  128:aload_1         
	//*  46  129:getstatic       #210 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BASELINE>
	//*  47  132:if_acmpne       137
							return true;
	//   48  135:iconst_1        
	//   49  136:ireturn         
						flag = false;
	//   50  137:iconst_0        
	//   51  138:istore_2        
					}
				}
			}
			return flag;
	//   52  139:iload_2         
	//   53  140:ireturn         

		case 2: // '\002'
		case 3: // '\003'
		case 7: // '\007'
			boolean flag1 = flag3;
	//   54  141:iload           4
	//   55  143:istore_2        
			if(constraintanchor != Type.LEFT)
	//*  56  144:aload_1         
	//*  57  145:getstatic       #213 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//*  58  148:if_acmpeq       172
			{
				flag1 = flag3;
	//   59  151:iload           4
	//   60  153:istore_2        
				if(constraintanchor != Type.RIGHT)
	//*  61  154:aload_1         
	//*  62  155:getstatic       #216 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//*  63  158:if_acmpeq       172
				{
					if(constraintanchor == Type.CENTER_X)
	//*  64  161:aload_1         
	//*  65  162:getstatic       #219 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_X>
	//*  66  165:if_acmpne       170
						return true;
	//   67  168:iconst_1        
	//   68  169:ireturn         
					flag1 = false;
	//   69  170:iconst_0        
	//   70  171:istore_2        
				}
			}
			return flag1;
	//   71  172:iload_2         
	//   72  173:ireturn         

		case 1: // '\001'
			break;
		}
		return constraintanchor != Type.BASELINE;
	//   73  174:aload_1         
	//   74  175:getstatic       #210 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BASELINE>
	//   75  178:if_acmpeq       183
	//   76  181:iconst_1        
	//   77  182:ireturn         
	//   78  183:iconst_0        
	//   79  184:ireturn         
	}

	public boolean isSnapCompatibleWith(ConstraintAnchor constraintanchor)
	{
		if(mType == Type.CENTER)
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field ConstraintAnchor$Type mType>
	//*   2    4:getstatic       #223 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER>
	//*   3    7:if_acmpne       12
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
		if(mType == constraintanchor.getType())
	//*   6   12:aload_0         
	//*   7   13:getfield        #75  <Field ConstraintAnchor$Type mType>
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #198 <Method ConstraintAnchor$Type getType()>
	//*  10   20:if_acmpne       25
			return true;
	//   11   23:iconst_1        
	//   12   24:ireturn         
		switch(_cls1..SwitchMap.android.support.constraint.solver.widgets.ConstraintAnchor.Type[mType.ordinal()])
	//*  13   25:getstatic       #150 <Field int[] ConstraintAnchor$1.$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*  14   28:aload_0         
	//*  15   29:getfield        #75  <Field ConstraintAnchor$Type mType>
	//*  16   32:invokevirtual   #153 <Method int ConstraintAnchor$Type.ordinal()>
	//*  17   35:iaload          
		{
	//*  18   36:tableswitch     1 9: default 88
	//	               1 298
	//	               2 269
	//	               3 240
	//	               4 211
	//	               5 182
	//	               6 298
	//	               7 142
	//	               8 103
	//	               9 298
		default:
			throw new AssertionError(((Object) (mType.name())));
	//   19   88:new             #155 <Class AssertionError>
	//   20   91:dup             
	//   21   92:aload_0         
	//   22   93:getfield        #75  <Field ConstraintAnchor$Type mType>
	//   23   96:invokevirtual   #159 <Method String ConstraintAnchor$Type.name()>
	//   24   99:invokespecial   #162 <Method void AssertionError(Object)>
	//   25  102:athrow          

		case 8: // '\b'
			switch(_cls1..SwitchMap.android.support.constraint.solver.widgets.ConstraintAnchor.Type[constraintanchor.getType().ordinal()])
	//*  26  103:getstatic       #150 <Field int[] ConstraintAnchor$1.$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*  27  106:aload_1         
	//*  28  107:invokevirtual   #198 <Method ConstraintAnchor$Type getType()>
	//*  29  110:invokevirtual   #153 <Method int ConstraintAnchor$Type.ordinal()>
	//*  30  113:iaload          
			{
	//*  31  114:tableswitch     4 5: default 136
	//	               4 140
	//	               5 138
			default:
				return false;
	//   32  136:iconst_0        
	//   33  137:ireturn         

			case 5: // '\005'
				return true;
	//   34  138:iconst_1        
	//   35  139:ireturn         

			case 4: // '\004'
				return true;
	//   36  140:iconst_1        
	//   37  141:ireturn         
			}

		case 7: // '\007'
			switch(_cls1..SwitchMap.android.support.constraint.solver.widgets.ConstraintAnchor.Type[constraintanchor.getType().ordinal()])
	//*  38  142:getstatic       #150 <Field int[] ConstraintAnchor$1.$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*  39  145:aload_1         
	//*  40  146:invokevirtual   #198 <Method ConstraintAnchor$Type getType()>
	//*  41  149:invokevirtual   #153 <Method int ConstraintAnchor$Type.ordinal()>
	//*  42  152:iaload          
			{
	//*  43  153:tableswitch     2 3: default 176
	//	               2 180
	//	               3 178
			default:
				return false;
	//   44  176:iconst_0        
	//   45  177:ireturn         

			case 3: // '\003'
				return true;
	//   46  178:iconst_1        
	//   47  179:ireturn         

			case 2: // '\002'
				return true;
	//   48  180:iconst_1        
	//   49  181:ireturn         
			}

		case 5: // '\005'
			int i = _cls1..SwitchMap.android.support.constraint.solver.widgets.ConstraintAnchor.Type[constraintanchor.getType().ordinal()];
	//   50  182:getstatic       #150 <Field int[] ConstraintAnchor$1.$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//   51  185:aload_1         
	//   52  186:invokevirtual   #198 <Method ConstraintAnchor$Type getType()>
	//   53  189:invokevirtual   #153 <Method int ConstraintAnchor$Type.ordinal()>
	//   54  192:iaload          
	//   55  193:istore_2        
			if(i != 4)
	//*  56  194:iload_2         
	//*  57  195:iconst_4        
	//*  58  196:icmpeq          209
				return i == 8;
	//   59  199:iload_2         
	//   60  200:bipush          8
	//   61  202:icmpeq          207
	//   62  205:iconst_0        
	//   63  206:ireturn         
	//   64  207:iconst_1        
	//   65  208:ireturn         
			else
				return true;
	//   66  209:iconst_1        
	//   67  210:ireturn         

		case 4: // '\004'
			int j = _cls1..SwitchMap.android.support.constraint.solver.widgets.ConstraintAnchor.Type[constraintanchor.getType().ordinal()];
	//   68  211:getstatic       #150 <Field int[] ConstraintAnchor$1.$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//   69  214:aload_1         
	//   70  215:invokevirtual   #198 <Method ConstraintAnchor$Type getType()>
	//   71  218:invokevirtual   #153 <Method int ConstraintAnchor$Type.ordinal()>
	//   72  221:iaload          
	//   73  222:istore_2        
			if(j != 5)
	//*  74  223:iload_2         
	//*  75  224:iconst_5        
	//*  76  225:icmpeq          238
				return j == 8;
	//   77  228:iload_2         
	//   78  229:bipush          8
	//   79  231:icmpeq          236
	//   80  234:iconst_0        
	//   81  235:ireturn         
	//   82  236:iconst_1        
	//   83  237:ireturn         
			else
				return true;
	//   84  238:iconst_1        
	//   85  239:ireturn         

		case 3: // '\003'
			int k = _cls1..SwitchMap.android.support.constraint.solver.widgets.ConstraintAnchor.Type[constraintanchor.getType().ordinal()];
	//   86  240:getstatic       #150 <Field int[] ConstraintAnchor$1.$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//   87  243:aload_1         
	//   88  244:invokevirtual   #198 <Method ConstraintAnchor$Type getType()>
	//   89  247:invokevirtual   #153 <Method int ConstraintAnchor$Type.ordinal()>
	//   90  250:iaload          
	//   91  251:istore_2        
			if(k != 2)
	//*  92  252:iload_2         
	//*  93  253:iconst_2        
	//*  94  254:icmpeq          267
				return k == 7;
	//   95  257:iload_2         
	//   96  258:bipush          7
	//   97  260:icmpeq          265
	//   98  263:iconst_0        
	//   99  264:ireturn         
	//  100  265:iconst_1        
	//  101  266:ireturn         
			else
				return true;
	//  102  267:iconst_1        
	//  103  268:ireturn         

		case 2: // '\002'
			int l = _cls1..SwitchMap.android.support.constraint.solver.widgets.ConstraintAnchor.Type[constraintanchor.getType().ordinal()];
	//  104  269:getstatic       #150 <Field int[] ConstraintAnchor$1.$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//  105  272:aload_1         
	//  106  273:invokevirtual   #198 <Method ConstraintAnchor$Type getType()>
	//  107  276:invokevirtual   #153 <Method int ConstraintAnchor$Type.ordinal()>
	//  108  279:iaload          
	//  109  280:istore_2        
			if(l != 3)
	//* 110  281:iload_2         
	//* 111  282:iconst_3        
	//* 112  283:icmpeq          296
				return l == 7;
	//  113  286:iload_2         
	//  114  287:bipush          7
	//  115  289:icmpeq          294
	//  116  292:iconst_0        
	//  117  293:ireturn         
	//  118  294:iconst_1        
	//  119  295:ireturn         
			else
				return true;
	//  120  296:iconst_1        
	//  121  297:ireturn         

		case 1: // '\001'
		case 6: // '\006'
		case 9: // '\t'
			return false;
	//  122  298:iconst_0        
	//  123  299:ireturn         
		}
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
	//    7    9:invokevirtual   #198 <Method ConstraintAnchor$Type getType()>
	//    8   12:astore          4
		Type type1 = mType;
	//    9   14:aload_0         
	//   10   15:getfield        #75  <Field ConstraintAnchor$Type mType>
	//   11   18:astore          5
		if(type == type1)
	//*  12   20:aload           4
	//*  13   22:aload           5
	//*  14   24:if_acmpne       59
			return type1 != Type.BASELINE || constraintanchor.getOwner().hasBaseline() && getOwner().hasBaseline();
	//   15   27:aload           5
	//   16   29:getstatic       #210 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BASELINE>
	//   17   32:if_acmpne       57
	//   18   35:aload_1         
	//   19   36:invokevirtual   #91  <Method ConstraintWidget getOwner()>
	//   20   39:invokevirtual   #226 <Method boolean ConstraintWidget.hasBaseline()>
	//   21   42:ifeq            55
	//   22   45:aload_0         
	//   23   46:invokevirtual   #91  <Method ConstraintWidget getOwner()>
	//   24   49:invokevirtual   #226 <Method boolean ConstraintWidget.hasBaseline()>
	//   25   52:ifne            57
	//   26   55:iconst_0        
	//   27   56:ireturn         
	//   28   57:iconst_1        
	//   29   58:ireturn         
		boolean flag2;
		switch(_cls1..SwitchMap.android.support.constraint.solver.widgets.ConstraintAnchor.Type[mType.ordinal()])
	//*  30   59:getstatic       #150 <Field int[] ConstraintAnchor$1.$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*  31   62:aload_0         
	//*  32   63:getfield        #75  <Field ConstraintAnchor$Type mType>
	//*  33   66:invokevirtual   #153 <Method int ConstraintAnchor$Type.ordinal()>
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
	//   36  120:new             #155 <Class AssertionError>
	//   37  123:dup             
	//   38  124:aload_0         
	//   39  125:getfield        #75  <Field ConstraintAnchor$Type mType>
	//   40  128:invokevirtual   #159 <Method String ConstraintAnchor$Type.name()>
	//   41  131:invokespecial   #162 <Method void AssertionError(Object)>
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
	//*  46  139:getstatic       #201 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//*  47  142:if_acmpeq       161
	//*  48  145:aload           4
	//*  49  147:getstatic       #204 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
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
	//*  60  166:invokevirtual   #91  <Method ConstraintWidget getOwner()>
	//*  61  169:instanceof      #228 <Class Guideline>
	//*  62  172:ifeq            194
			{
				if(!flag && type != Type.CENTER_Y)
	//*  63  175:iload_2         
	//*  64  176:ifne            192
	//*  65  179:aload           4
	//*  66  181:getstatic       #207 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_Y>
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
	//*  76  198:getstatic       #213 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//*  77  201:if_acmpeq       220
	//*  78  204:aload           4
	//*  79  206:getstatic       #216 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
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
	//*  90  225:invokevirtual   #91  <Method ConstraintWidget getOwner()>
	//*  91  228:instanceof      #228 <Class Guideline>
	//*  92  231:ifeq            253
			{
				if(!flag1 && type != Type.CENTER_X)
	//*  93  234:iload_2         
	//*  94  235:ifne            251
	//*  95  238:aload           4
	//*  96  240:getstatic       #219 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_X>
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
	//* 108  259:getstatic       #210 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BASELINE>
	//* 109  262:if_acmpeq       287
		{
			flag2 = flag3;
	//  110  265:iload_3         
	//  111  266:istore_2        
			if(type != Type.CENTER_X)
	//* 112  267:aload           4
	//* 113  269:getstatic       #219 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_X>
	//* 114  272:if_acmpeq       287
			{
				flag2 = flag3;
	//  115  275:iload_3         
	//  116  276:istore_2        
				if(type != Type.CENTER_Y)
	//* 117  277:aload           4
	//* 118  279:getstatic       #207 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_Y>
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

	public boolean isVerticalAnchor()
	{
		switch(_cls1..SwitchMap.android.support.constraint.solver.widgets.ConstraintAnchor.Type[mType.ordinal()])
	//*   0    0:getstatic       #150 <Field int[] ConstraintAnchor$1.$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*   1    3:aload_0         
	//*   2    4:getfield        #75  <Field ConstraintAnchor$Type mType>
	//*   3    7:invokevirtual   #153 <Method int ConstraintAnchor$Type.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 9: default 60
	//	               1 77
	//	               2 77
	//	               3 77
	//	               4 75
	//	               5 75
	//	               6 75
	//	               7 77
	//	               8 75
	//	               9 75
		default:
			throw new AssertionError(((Object) (mType.name())));
	//    6   60:new             #155 <Class AssertionError>
	//    7   63:dup             
	//    8   64:aload_0         
	//    9   65:getfield        #75  <Field ConstraintAnchor$Type mType>
	//   10   68:invokevirtual   #159 <Method String ConstraintAnchor$Type.name()>
	//   11   71:invokespecial   #162 <Method void AssertionError(Object)>
	//   12   74:athrow          

		case 4: // '\004'
		case 5: // '\005'
		case 6: // '\006'
		case 8: // '\b'
		case 9: // '\t'
			return true;
	//   13   75:iconst_1        
	//   14   76:ireturn         

		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 7: // '\007'
			return false;
	//   15   77:iconst_0        
	//   16   78:ireturn         
		}
	}

	public void reset()
	{
		mTarget = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #134 <Field ConstraintAnchor mTarget>
		mMargin = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #57  <Field int mMargin>
		mGoneMargin = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #59  <Field int mGoneMargin>
		mStrength = Strength.STRONG;
	//    9   15:aload_0         
	//   10   16:getstatic       #128 <Field ConstraintAnchor$Strength ConstraintAnchor$Strength.STRONG>
	//   11   19:putfield        #64  <Field ConstraintAnchor$Strength mStrength>
		mConnectionCreator = 0;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #71  <Field int mConnectionCreator>
		mConnectionType = ConnectionType.RELAXED;
	//   15   27:aload_0         
	//   16   28:getstatic       #67  <Field ConstraintAnchor$ConnectionType ConstraintAnchor$ConnectionType.RELAXED>
	//   17   31:putfield        #69  <Field ConstraintAnchor$ConnectionType mConnectionType>
		mResolutionAnchor.reset();
	//   18   34:aload_0         
	//   19   35:getfield        #55  <Field ResolutionAnchor mResolutionAnchor>
	//   20   38:invokevirtual   #232 <Method void ResolutionAnchor.reset()>
	//   21   41:return          
	}

	public void resetSolverVariable(Cache cache)
	{
		cache = ((Cache) (mSolverVariable));
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field SolverVariable mSolverVariable>
	//    2    4:astore_1        
		if(cache == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       25
		{
			mSolverVariable = new SolverVariable(android.support.constraint.solver.SolverVariable.Type.UNRESTRICTED, ((String) (null)));
	//    5    9:aload_0         
	//    6   10:new             #236 <Class SolverVariable>
	//    7   13:dup             
	//    8   14:getstatic       #242 <Field android.support.constraint.solver.SolverVariable$Type android.support.constraint.solver.SolverVariable$Type.UNRESTRICTED>
	//    9   17:aconst_null     
	//   10   18:invokespecial   #245 <Method void SolverVariable(android.support.constraint.solver.SolverVariable$Type, String)>
	//   11   21:putfield        #182 <Field SolverVariable mSolverVariable>
			return;
	//   12   24:return          
		} else
		{
			((SolverVariable) (cache)).reset();
	//   13   25:aload_1         
	//   14   26:invokevirtual   #246 <Method void SolverVariable.reset()>
			return;
	//   15   29:return          
		}
	}

	public void setConnectionCreator(int i)
	{
		mConnectionCreator = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #71  <Field int mConnectionCreator>
	//    3    5:return          
	}

	public void setConnectionType(ConnectionType connectiontype)
	{
		mConnectionType = connectiontype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #69  <Field ConstraintAnchor$ConnectionType mConnectionType>
	//    3    5:return          
	}

	public void setGoneMargin(int i)
	{
		if(isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #115 <Method boolean isConnected()>
	//*   2    4:ifeq            12
			mGoneMargin = i;
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:putfield        #59  <Field int mGoneMargin>
	//    6   12:return          
	}

	public void setMargin(int i)
	{
		if(isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #115 <Method boolean isConnected()>
	//*   2    4:ifeq            12
			mMargin = i;
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:putfield        #57  <Field int mMargin>
	//    6   12:return          
	}

	public void setStrength(Strength strength)
	{
		if(isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #115 <Method boolean isConnected()>
	//*   2    4:ifeq            12
			mStrength = strength;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #64  <Field ConstraintAnchor$Strength mStrength>
	//    6   12:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #257 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #258 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(mOwner.getDebugName());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #73  <Field ConstraintWidget mOwner>
	//    7   13:invokevirtual   #261 <Method String ConstraintWidget.getDebugName()>
	//    8   16:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append(":");
	//   10   20:aload_1         
	//   11   21:ldc2            #267 <String ":">
	//   12   24:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		stringbuilder.append(mType.toString());
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #75  <Field ConstraintAnchor$Type mType>
	//   17   33:invokevirtual   #269 <Method String ConstraintAnchor$Type.toString()>
	//   18   36:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
		return stringbuilder.toString();
	//   20   40:aload_1         
	//   21   41:invokevirtual   #270 <Method String StringBuilder.toString()>
	//   22   44:areturn         
	}

	private static final boolean ALLOW_BINARY = false;
	public static final int AUTO_CONSTRAINT_CREATOR = 2;
	public static final int SCOUT_CREATOR = 1;
	private static final int UNSET_GONE_MARGIN = -1;
	public static final int USER_CREATOR = 0;
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
