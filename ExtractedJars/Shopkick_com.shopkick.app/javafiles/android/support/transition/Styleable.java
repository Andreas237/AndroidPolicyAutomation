// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;


class Styleable
{
	static interface ArcMotion
	{

		public static final int MAXIMUM_ANGLE = 2;
		public static final int MINIMUM_HORIZONTAL_ANGLE = 0;
		public static final int MINIMUM_VERTICAL_ANGLE = 1;
	}

	static interface ChangeBounds
	{

		public static final int RESIZE_CLIP = 0;
	}

	static interface ChangeTransform
	{

		public static final int REPARENT = 0;
		public static final int REPARENT_WITH_OVERLAY = 1;
	}

	static interface Fade
	{

		public static final int FADING_MODE = 0;
	}

	static interface PatternPathMotion
	{

		public static final int PATTERN_PATH_DATA = 0;
	}

	static interface Slide
	{

		public static final int SLIDE_EDGE = 0;
	}

	static interface Transition
	{

		public static final int DURATION = 1;
		public static final int INTERPOLATOR = 0;
		public static final int MATCH_ORDER = 3;
		public static final int START_DELAY = 2;
	}

	static interface TransitionManager
	{

		public static final int FROM_SCENE = 0;
		public static final int TO_SCENE = 1;
		public static final int TRANSITION = 2;
	}

	static interface TransitionSet
	{

		public static final int TRANSITION_ORDERING = 0;
	}

	static interface TransitionTarget
	{

		public static final int EXCLUDE_CLASS = 3;
		public static final int EXCLUDE_ID = 2;
		public static final int EXCLUDE_NAME = 5;
		public static final int TARGET_CLASS = 0;
		public static final int TARGET_ID = 1;
		public static final int TARGET_NAME = 4;
	}

	static interface VisibilityTransition
	{

		public static final int TRANSITION_VISIBILITY_MODE = 0;
	}


	private Styleable()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #105 <Method void Object()>
	//    2    4:return          
	}

	static final int ARC_MOTION[] = {
		0x101047d, 0x101047e, 0x101047f
	};
	static final int CHANGE_BOUNDS[] = {
		0x10104cf
	};
	static final int CHANGE_TRANSFORM[] = {
		0x10104bc, 0x10104bd
	};
	static final int FADE[] = {
		0x10103e1
	};
	static final int PATTERN_PATH_MOTION[] = {
		0x10104ca
	};
	static final int SLIDE[] = {
		0x1010430
	};
	static final int TRANSITION[] = {
		0x1010141, 0x1010198, 0x10103e2, 0x101044f
	};
	static final int TRANSITION_MANAGER[] = {
		0x10103dd, 0x10103de, 0x10103df
	};
	static final int TRANSITION_SET[] = {
		0x10103e0
	};
	static final int TRANSITION_TARGET[] = {
		0x101002f, 0x10103dc, 0x1010441, 0x1010442, 0x101044d, 0x101044e
	};
	static final int VISIBILITY_TRANSITION[] = {
		0x101047c
	};

	static 
	{
	//    0    0:bipush          6
	//    1    2:newarray        int[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #56  <Int 0x101002f>
	//    5    8:iastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #57  <Int 0x10103dc>
	//    9   13:iastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #58  <Int 0x1010441>
	//   13   18:iastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #59  <Int 0x1010442>
	//   17   23:iastore         
	//   18   24:dup             
	//   19   25:iconst_4        
	//   20   26:ldc1            #60  <Int 0x101044d>
	//   21   28:iastore         
	//   22   29:dup             
	//   23   30:iconst_5        
	//   24   31:ldc1            #61  <Int 0x101044e>
	//   25   33:iastore         
	//   26   34:putstatic       #63  <Field int[] TRANSITION_TARGET>
	//   27   37:iconst_3        
	//   28   38:newarray        int[]
	//   29   40:dup             
	//   30   41:iconst_0        
	//   31   42:ldc1            #64  <Int 0x10103dd>
	//   32   44:iastore         
	//   33   45:dup             
	//   34   46:iconst_1        
	//   35   47:ldc1            #65  <Int 0x10103de>
	//   36   49:iastore         
	//   37   50:dup             
	//   38   51:iconst_2        
	//   39   52:ldc1            #66  <Int 0x10103df>
	//   40   54:iastore         
	//   41   55:putstatic       #68  <Field int[] TRANSITION_MANAGER>
	//   42   58:iconst_4        
	//   43   59:newarray        int[]
	//   44   61:dup             
	//   45   62:iconst_0        
	//   46   63:ldc1            #69  <Int 0x1010141>
	//   47   65:iastore         
	//   48   66:dup             
	//   49   67:iconst_1        
	//   50   68:ldc1            #70  <Int 0x1010198>
	//   51   70:iastore         
	//   52   71:dup             
	//   53   72:iconst_2        
	//   54   73:ldc1            #71  <Int 0x10103e2>
	//   55   75:iastore         
	//   56   76:dup             
	//   57   77:iconst_3        
	//   58   78:ldc1            #72  <Int 0x101044f>
	//   59   80:iastore         
	//   60   81:putstatic       #74  <Field int[] TRANSITION>
	//   61   84:iconst_1        
	//   62   85:newarray        int[]
	//   63   87:dup             
	//   64   88:iconst_0        
	//   65   89:ldc1            #75  <Int 0x10104cf>
	//   66   91:iastore         
	//   67   92:putstatic       #77  <Field int[] CHANGE_BOUNDS>
	//   68   95:iconst_1        
	//   69   96:newarray        int[]
	//   70   98:dup             
	//   71   99:iconst_0        
	//   72  100:ldc1            #78  <Int 0x101047c>
	//   73  102:iastore         
	//   74  103:putstatic       #80  <Field int[] VISIBILITY_TRANSITION>
	//   75  106:iconst_1        
	//   76  107:newarray        int[]
	//   77  109:dup             
	//   78  110:iconst_0        
	//   79  111:ldc1            #81  <Int 0x10103e1>
	//   80  113:iastore         
	//   81  114:putstatic       #83  <Field int[] FADE>
	//   82  117:iconst_2        
	//   83  118:newarray        int[]
	//   84  120:dup             
	//   85  121:iconst_0        
	//   86  122:ldc1            #84  <Int 0x10104bc>
	//   87  124:iastore         
	//   88  125:dup             
	//   89  126:iconst_1        
	//   90  127:ldc1            #85  <Int 0x10104bd>
	//   91  129:iastore         
	//   92  130:putstatic       #87  <Field int[] CHANGE_TRANSFORM>
	//   93  133:iconst_1        
	//   94  134:newarray        int[]
	//   95  136:dup             
	//   96  137:iconst_0        
	//   97  138:ldc1            #88  <Int 0x1010430>
	//   98  140:iastore         
	//   99  141:putstatic       #90  <Field int[] SLIDE>
	//  100  144:iconst_1        
	//  101  145:newarray        int[]
	//  102  147:dup             
	//  103  148:iconst_0        
	//  104  149:ldc1            #91  <Int 0x10103e0>
	//  105  151:iastore         
	//  106  152:putstatic       #93  <Field int[] TRANSITION_SET>
	//  107  155:iconst_3        
	//  108  156:newarray        int[]
	//  109  158:dup             
	//  110  159:iconst_0        
	//  111  160:ldc1            #94  <Int 0x101047d>
	//  112  162:iastore         
	//  113  163:dup             
	//  114  164:iconst_1        
	//  115  165:ldc1            #95  <Int 0x101047e>
	//  116  167:iastore         
	//  117  168:dup             
	//  118  169:iconst_2        
	//  119  170:ldc1            #96  <Int 0x101047f>
	//  120  172:iastore         
	//  121  173:putstatic       #98  <Field int[] ARC_MOTION>
	//  122  176:iconst_1        
	//  123  177:newarray        int[]
	//  124  179:dup             
	//  125  180:iconst_0        
	//  126  181:ldc1            #99  <Int 0x10104ca>
	//  127  183:iastore         
	//  128  184:putstatic       #101 <Field int[] PATTERN_PATH_MOTION>
	//* 129  187:return          
	}
}
