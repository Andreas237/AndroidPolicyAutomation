// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;

import android.support.constraint.solver.LinearSystem;
import java.util.ArrayList;

// Referenced classes of package android.support.constraint.solver.widgets:
//			ConstraintWidgetContainer, ConstraintWidget

public class ConstraintHorizontalLayout extends ConstraintWidgetContainer
{
	public static final class ContentAlignment extends Enum
	{

		public static ContentAlignment valueOf(String s)
		{
			return (ContentAlignment)Enum.valueOf(android/support/constraint/solver/widgets/ConstraintHorizontalLayout$ContentAlignment, s);
		//    0    0:ldc1            #2   <Class ConstraintHorizontalLayout$ContentAlignment>
		//    1    2:aload_0         
		//    2    3:invokestatic    #59  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ConstraintHorizontalLayout$ContentAlignment>
		//    4    9:areturn         
		}

		public static ContentAlignment[] values()
		{
			return (ContentAlignment[])((ContentAlignment []) ($VALUES)).clone();
		//    0    0:getstatic       #51  <Field ConstraintHorizontalLayout$ContentAlignment[] $VALUES>
		//    1    3:invokevirtual   #66  <Method Object _5B_Landroid.support.constraint.solver.widgets.ConstraintHorizontalLayout$ContentAlignment_3B_.clone()>
		//    2    6:checkcast       #62  <Class ConstraintHorizontalLayout$ContentAlignment[]>
		//    3    9:areturn         
		}

		private static final ContentAlignment $VALUES[];
		public static final ContentAlignment BEGIN;
		public static final ContentAlignment BOTTOM;
		public static final ContentAlignment END;
		public static final ContentAlignment LEFT;
		public static final ContentAlignment MIDDLE;
		public static final ContentAlignment RIGHT;
		public static final ContentAlignment TOP;
		public static final ContentAlignment VERTICAL_MIDDLE;

		static 
		{
			BEGIN = new ContentAlignment("BEGIN", 0);
		//    0    0:new             #2   <Class ConstraintHorizontalLayout$ContentAlignment>
		//    1    3:dup             
		//    2    4:ldc1            #22  <String "BEGIN">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #26  <Method void ConstraintHorizontalLayout$ContentAlignment(String, int)>
		//    5   10:putstatic       #28  <Field ConstraintHorizontalLayout$ContentAlignment BEGIN>
			MIDDLE = new ContentAlignment("MIDDLE", 1);
		//    6   13:new             #2   <Class ConstraintHorizontalLayout$ContentAlignment>
		//    7   16:dup             
		//    8   17:ldc1            #29  <String "MIDDLE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #26  <Method void ConstraintHorizontalLayout$ContentAlignment(String, int)>
		//   11   23:putstatic       #31  <Field ConstraintHorizontalLayout$ContentAlignment MIDDLE>
			END = new ContentAlignment("END", 2);
		//   12   26:new             #2   <Class ConstraintHorizontalLayout$ContentAlignment>
		//   13   29:dup             
		//   14   30:ldc1            #32  <String "END">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #26  <Method void ConstraintHorizontalLayout$ContentAlignment(String, int)>
		//   17   36:putstatic       #34  <Field ConstraintHorizontalLayout$ContentAlignment END>
			TOP = new ContentAlignment("TOP", 3);
		//   18   39:new             #2   <Class ConstraintHorizontalLayout$ContentAlignment>
		//   19   42:dup             
		//   20   43:ldc1            #35  <String "TOP">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #26  <Method void ConstraintHorizontalLayout$ContentAlignment(String, int)>
		//   23   49:putstatic       #37  <Field ConstraintHorizontalLayout$ContentAlignment TOP>
			VERTICAL_MIDDLE = new ContentAlignment("VERTICAL_MIDDLE", 4);
		//   24   52:new             #2   <Class ConstraintHorizontalLayout$ContentAlignment>
		//   25   55:dup             
		//   26   56:ldc1            #38  <String "VERTICAL_MIDDLE">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #26  <Method void ConstraintHorizontalLayout$ContentAlignment(String, int)>
		//   29   62:putstatic       #40  <Field ConstraintHorizontalLayout$ContentAlignment VERTICAL_MIDDLE>
			BOTTOM = new ContentAlignment("BOTTOM", 5);
		//   30   65:new             #2   <Class ConstraintHorizontalLayout$ContentAlignment>
		//   31   68:dup             
		//   32   69:ldc1            #41  <String "BOTTOM">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #26  <Method void ConstraintHorizontalLayout$ContentAlignment(String, int)>
		//   35   75:putstatic       #43  <Field ConstraintHorizontalLayout$ContentAlignment BOTTOM>
			LEFT = new ContentAlignment("LEFT", 6);
		//   36   78:new             #2   <Class ConstraintHorizontalLayout$ContentAlignment>
		//   37   81:dup             
		//   38   82:ldc1            #44  <String "LEFT">
		//   39   84:bipush          6
		//   40   86:invokespecial   #26  <Method void ConstraintHorizontalLayout$ContentAlignment(String, int)>
		//   41   89:putstatic       #46  <Field ConstraintHorizontalLayout$ContentAlignment LEFT>
			RIGHT = new ContentAlignment("RIGHT", 7);
		//   42   92:new             #2   <Class ConstraintHorizontalLayout$ContentAlignment>
		//   43   95:dup             
		//   44   96:ldc1            #47  <String "RIGHT">
		//   45   98:bipush          7
		//   46  100:invokespecial   #26  <Method void ConstraintHorizontalLayout$ContentAlignment(String, int)>
		//   47  103:putstatic       #49  <Field ConstraintHorizontalLayout$ContentAlignment RIGHT>
			$VALUES = (new ContentAlignment[] {
				BEGIN, MIDDLE, END, TOP, VERTICAL_MIDDLE, BOTTOM, LEFT, RIGHT
			});
		//   48  106:bipush          8
		//   49  108:anewarray       ContentAlignment[]
		//   50  111:dup             
		//   51  112:iconst_0        
		//   52  113:getstatic       #28  <Field ConstraintHorizontalLayout$ContentAlignment BEGIN>
		//   53  116:aastore         
		//   54  117:dup             
		//   55  118:iconst_1        
		//   56  119:getstatic       #31  <Field ConstraintHorizontalLayout$ContentAlignment MIDDLE>
		//   57  122:aastore         
		//   58  123:dup             
		//   59  124:iconst_2        
		//   60  125:getstatic       #34  <Field ConstraintHorizontalLayout$ContentAlignment END>
		//   61  128:aastore         
		//   62  129:dup             
		//   63  130:iconst_3        
		//   64  131:getstatic       #37  <Field ConstraintHorizontalLayout$ContentAlignment TOP>
		//   65  134:aastore         
		//   66  135:dup             
		//   67  136:iconst_4        
		//   68  137:getstatic       #40  <Field ConstraintHorizontalLayout$ContentAlignment VERTICAL_MIDDLE>
		//   69  140:aastore         
		//   70  141:dup             
		//   71  142:iconst_5        
		//   72  143:getstatic       #43  <Field ConstraintHorizontalLayout$ContentAlignment BOTTOM>
		//   73  146:aastore         
		//   74  147:dup             
		//   75  148:bipush          6
		//   76  150:getstatic       #46  <Field ConstraintHorizontalLayout$ContentAlignment LEFT>
		//   77  153:aastore         
		//   78  154:dup             
		//   79  155:bipush          7
		//   80  157:getstatic       #49  <Field ConstraintHorizontalLayout$ContentAlignment RIGHT>
		//   81  160:aastore         
		//   82  161:putstatic       #51  <Field ConstraintHorizontalLayout$ContentAlignment[] $VALUES>
		//*  83  164:return          
		}

		private ContentAlignment(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #53  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public ConstraintHorizontalLayout()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void ConstraintWidgetContainer()>
		mAlignment = ContentAlignment.MIDDLE;
	//    2    4:aload_0         
	//    3    5:getstatic       #16  <Field ConstraintHorizontalLayout$ContentAlignment ConstraintHorizontalLayout$ContentAlignment.MIDDLE>
	//    4    8:putfield        #18  <Field ConstraintHorizontalLayout$ContentAlignment mAlignment>
	//    5   11:return          
	}

	public ConstraintHorizontalLayout(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #22  <Method void ConstraintWidgetContainer(int, int)>
		mAlignment = ContentAlignment.MIDDLE;
	//    4    6:aload_0         
	//    5    7:getstatic       #16  <Field ConstraintHorizontalLayout$ContentAlignment ConstraintHorizontalLayout$ContentAlignment.MIDDLE>
	//    6   10:putfield        #18  <Field ConstraintHorizontalLayout$ContentAlignment mAlignment>
	//    7   13:return          
	}

	public ConstraintHorizontalLayout(int i, int j, int k, int l)
	{
		super(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #25  <Method void ConstraintWidgetContainer(int, int, int, int)>
		mAlignment = ContentAlignment.MIDDLE;
	//    6    9:aload_0         
	//    7   10:getstatic       #16  <Field ConstraintHorizontalLayout$ContentAlignment ConstraintHorizontalLayout$ContentAlignment.MIDDLE>
	//    8   13:putfield        #18  <Field ConstraintHorizontalLayout$ContentAlignment mAlignment>
	//    9   16:return          
	}

	public void addToSolver(LinearSystem linearsystem)
	{
		if(mChildren.size() != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field ArrayList mChildren>
	//*   2    4:invokevirtual   #37  <Method int ArrayList.size()>
	//*   3    7:ifeq            194
		{
			int i = 0;
	//    4   10:iconst_0        
	//    5   11:istore_2        
			int j = mChildren.size();
	//    6   12:aload_0         
	//    7   13:getfield        #31  <Field ArrayList mChildren>
	//    8   16:invokevirtual   #37  <Method int ArrayList.size()>
	//    9   19:istore_3        
			Object obj;
			ConstraintWidget constraintwidget;
			for(obj = ((Object) (this)); i < j; obj = ((Object) (constraintwidget)))
	//*  10   20:aload_0         
	//*  11   21:astore          4
	//*  12   23:iload_2         
	//*  13   24:iload_3         
	//*  14   25:icmpge          150
			{
				constraintwidget = (ConstraintWidget)mChildren.get(i);
	//   15   28:aload_0         
	//   16   29:getfield        #31  <Field ArrayList mChildren>
	//   17   32:iload_2         
	//   18   33:invokevirtual   #41  <Method Object ArrayList.get(int)>
	//   19   36:checkcast       #43  <Class ConstraintWidget>
	//   20   39:astore          6
				if(obj != this)
	//*  21   41:aload           4
	//*  22   43:aload_0         
	//*  23   44:if_acmpeq       76
				{
					constraintwidget.connect(ConstraintAnchor.Type.LEFT, ((ConstraintWidget) (obj)), ConstraintAnchor.Type.RIGHT);
	//   24   47:aload           6
	//   25   49:getstatic       #49  <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//   26   52:aload           4
	//   27   54:getstatic       #52  <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//   28   57:invokevirtual   #56  <Method void ConstraintWidget.connect(ConstraintAnchor$Type, ConstraintWidget, ConstraintAnchor$Type)>
					((ConstraintWidget) (obj)).connect(ConstraintAnchor.Type.RIGHT, constraintwidget, ConstraintAnchor.Type.LEFT);
	//   29   60:aload           4
	//   30   62:getstatic       #52  <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//   31   65:aload           6
	//   32   67:getstatic       #49  <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//   33   70:invokevirtual   #56  <Method void ConstraintWidget.connect(ConstraintAnchor$Type, ConstraintWidget, ConstraintAnchor$Type)>
				} else
	//*  34   73:goto            115
				{
					ConstraintAnchor.Strength strength = ConstraintAnchor.Strength.STRONG;
	//   35   76:getstatic       #62  <Field ConstraintAnchor$Strength ConstraintAnchor$Strength.STRONG>
	//   36   79:astore          5
					if(mAlignment == ContentAlignment.END)
	//*  37   81:aload_0         
	//*  38   82:getfield        #18  <Field ConstraintHorizontalLayout$ContentAlignment mAlignment>
	//*  39   85:getstatic       #65  <Field ConstraintHorizontalLayout$ContentAlignment ConstraintHorizontalLayout$ContentAlignment.END>
	//*  40   88:if_acmpne       99
						strength = ConstraintAnchor.Strength.WEAK;
	//   41   91:getstatic       #68  <Field ConstraintAnchor$Strength ConstraintAnchor$Strength.WEAK>
	//   42   94:astore          5
	//*  43   96:goto            99
					constraintwidget.connect(ConstraintAnchor.Type.LEFT, ((ConstraintWidget) (obj)), ConstraintAnchor.Type.LEFT, 0, strength);
	//   44   99:aload           6
	//   45  101:getstatic       #49  <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//   46  104:aload           4
	//   47  106:getstatic       #49  <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//   48  109:iconst_0        
	//   49  110:aload           5
	//   50  112:invokevirtual   #71  <Method void ConstraintWidget.connect(ConstraintAnchor$Type, ConstraintWidget, ConstraintAnchor$Type, int, ConstraintAnchor$Strength)>
				}
				constraintwidget.connect(ConstraintAnchor.Type.TOP, ((ConstraintWidget) (this)), ConstraintAnchor.Type.TOP);
	//   51  115:aload           6
	//   52  117:getstatic       #74  <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//   53  120:aload_0         
	//   54  121:getstatic       #74  <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//   55  124:invokevirtual   #56  <Method void ConstraintWidget.connect(ConstraintAnchor$Type, ConstraintWidget, ConstraintAnchor$Type)>
				constraintwidget.connect(ConstraintAnchor.Type.BOTTOM, ((ConstraintWidget) (this)), ConstraintAnchor.Type.BOTTOM);
	//   56  127:aload           6
	//   57  129:getstatic       #77  <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//   58  132:aload_0         
	//   59  133:getstatic       #77  <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//   60  136:invokevirtual   #56  <Method void ConstraintWidget.connect(ConstraintAnchor$Type, ConstraintWidget, ConstraintAnchor$Type)>
				i++;
	//   61  139:iload_2         
	//   62  140:iconst_1        
	//   63  141:iadd            
	//   64  142:istore_2        
			}

	//   65  143:aload           6
	//   66  145:astore          4
	//*  67  147:goto            23
			if(obj != this)
	//*  68  150:aload           4
	//*  69  152:aload_0         
	//*  70  153:if_acmpeq       194
			{
				ConstraintAnchor.Strength strength1 = ConstraintAnchor.Strength.STRONG;
	//   71  156:getstatic       #62  <Field ConstraintAnchor$Strength ConstraintAnchor$Strength.STRONG>
	//   72  159:astore          5
				if(mAlignment == ContentAlignment.BEGIN)
	//*  73  161:aload_0         
	//*  74  162:getfield        #18  <Field ConstraintHorizontalLayout$ContentAlignment mAlignment>
	//*  75  165:getstatic       #80  <Field ConstraintHorizontalLayout$ContentAlignment ConstraintHorizontalLayout$ContentAlignment.BEGIN>
	//*  76  168:if_acmpne       179
					strength1 = ConstraintAnchor.Strength.WEAK;
	//   77  171:getstatic       #68  <Field ConstraintAnchor$Strength ConstraintAnchor$Strength.WEAK>
	//   78  174:astore          5
	//*  79  176:goto            179
				((ConstraintWidget) (obj)).connect(ConstraintAnchor.Type.RIGHT, ((ConstraintWidget) (this)), ConstraintAnchor.Type.RIGHT, 0, strength1);
	//   80  179:aload           4
	//   81  181:getstatic       #52  <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//   82  184:aload_0         
	//   83  185:getstatic       #52  <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//   84  188:iconst_0        
	//   85  189:aload           5
	//   86  191:invokevirtual   #71  <Method void ConstraintWidget.connect(ConstraintAnchor$Type, ConstraintWidget, ConstraintAnchor$Type, int, ConstraintAnchor$Strength)>
			}
		}
		super.addToSolver(linearsystem);
	//   87  194:aload_0         
	//   88  195:aload_1         
	//   89  196:invokespecial   #82  <Method void ConstraintWidgetContainer.addToSolver(LinearSystem)>
	//   90  199:return          
	}

	private ContentAlignment mAlignment;
}
