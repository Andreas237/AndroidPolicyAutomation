// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon.adinformation;


public class AdInformationPositions
{
	public static final class Position extends Enum
	{

		public static Position getByIndex(long l)
		{
			Position position = BOTTOM_LEFT;
		//    0    0:getstatic       #35  <Field AdInformationPositions$Position BOTTOM_LEFT>
		//    1    3:astore_3        
			Position aposition[] = values();
		//    2    4:invokestatic    #58  <Method AdInformationPositions$Position[] values()>
		//    3    7:astore          4
			for(int i = 0; i < aposition.length; i++)
		//*   4    9:iconst_0        
		//*   5   10:istore_2        
		//*   6   11:iload_2         
		//*   7   12:aload           4
		//*   8   14:arraylength     
		//*   9   15:icmpge          43
				if((long)aposition[i].getIndex() == l)
		//*  10   18:aload           4
		//*  11   20:iload_2         
		//*  12   21:aaload          
		//*  13   22:invokevirtual   #62  <Method int getIndex()>
		//*  14   25:i2l             
		//*  15   26:lload_0         
		//*  16   27:lcmp            
		//*  17   28:ifne            36
					position = aposition[i];
		//   18   31:aload           4
		//   19   33:iload_2         
		//   20   34:aaload          
		//   21   35:astore_3        

		//   22   36:iload_2         
		//   23   37:iconst_1        
		//   24   38:iadd            
		//   25   39:istore_2        
		//*  26   40:goto            11
			return position;
		//   27   43:aload_3         
		//   28   44:areturn         
		}

		public static Position getByName(String s)
		{
			Position position = BOTTOM_LEFT;
		//    0    0:getstatic       #35  <Field AdInformationPositions$Position BOTTOM_LEFT>
		//    1    3:astore_2        
			Position aposition[] = values();
		//    2    4:invokestatic    #58  <Method AdInformationPositions$Position[] values()>
		//    3    7:astore_3        
			for(int i = 0; i < aposition.length; i++)
		//*   4    8:iconst_0        
		//*   5    9:istore_1        
		//*   6   10:iload_1         
		//*   7   11:aload_3         
		//*   8   12:arraylength     
		//*   9   13:icmpge          46
				if(aposition[i].name().toLowerCase().compareTo(s.toLowerCase()) == 0)
		//*  10   16:aload_3         
		//*  11   17:iload_1         
		//*  12   18:aaload          
		//*  13   19:invokevirtual   #68  <Method String name()>
		//*  14   22:invokevirtual   #73  <Method String String.toLowerCase()>
		//*  15   25:aload_0         
		//*  16   26:invokevirtual   #73  <Method String String.toLowerCase()>
		//*  17   29:invokevirtual   #77  <Method int String.compareTo(String)>
		//*  18   32:ifne            39
					position = aposition[i];
		//   19   35:aload_3         
		//   20   36:iload_1         
		//   21   37:aaload          
		//   22   38:astore_2        

		//   23   39:iload_1         
		//   24   40:iconst_1        
		//   25   41:iadd            
		//   26   42:istore_1        
		//*  27   43:goto            10
			return position;
		//   28   46:aload_2         
		//   29   47:areturn         
		}

		public static Position valueOf(String s)
		{
			return (Position)Enum.valueOf(com/startapp/android/publish/adsCommon/adinformation/AdInformationPositions$Position, s);
		//    0    0:ldc1            #2   <Class AdInformationPositions$Position>
		//    1    2:aload_0         
		//    2    3:invokestatic    #81  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class AdInformationPositions$Position>
		//    4    9:areturn         
		}

		public static Position[] values()
		{
			return (Position[])((Position []) ($VALUES)).clone();
		//    0    0:getstatic       #40  <Field AdInformationPositions$Position[] $VALUES>
		//    1    3:invokevirtual   #86  <Method Object _5B_Lcom.startapp.android.publish.adsCommon.adinformation.AdInformationPositions$Position_3B_.clone()>
		//    2    6:checkcast       #82  <Class AdInformationPositions$Position[]>
		//    3    9:areturn         
		}

		public void addRules(android.widget.RelativeLayout.LayoutParams layoutparams)
		{
			for(int i = 0; i < rules.length; i++)
		//*   0    0:iconst_0        
		//*   1    1:istore_2        
		//*   2    2:iload_2         
		//*   3    3:aload_0         
		//*   4    4:getfield        #46  <Field int[] rules>
		//*   5    7:arraylength     
		//*   6    8:icmpge          28
				layoutparams.addRule(rules[i]);
		//    7   11:aload_1         
		//    8   12:aload_0         
		//    9   13:getfield        #46  <Field int[] rules>
		//   10   16:iload_2         
		//   11   17:iaload          
		//   12   18:invokevirtual   #94  <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>

		//   13   21:iload_2         
		//   14   22:iconst_1        
		//   15   23:iadd            
		//   16   24:istore_2        
		//*  17   25:goto            2
		//   18   28:return          
		}

		public int getAnimationStartMultiplier()
		{
			return animationMultiplier;
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field int animationMultiplier>
		//    2    4:ireturn         
		}

		public int getIndex()
		{
			return index;
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field int index>
		//    2    4:ireturn         
		}

		private static final Position $VALUES[];
		public static final Position BOTTOM_LEFT;
		public static final Position BOTTOM_RIGHT;
		public static final Position TOP_LEFT;
		public static final Position TOP_RIGHT;
		private int animationMultiplier;
		private int index;
		private int rules[];

		static 
		{
			TOP_LEFT = new Position("TOP_LEFT", 0, 1, new int[] {
				10, 9
			}, -1);
		//    0    0:new             #2   <Class AdInformationPositions$Position>
		//    1    3:dup             
		//    2    4:ldc1            #23  <String "TOP_LEFT">
		//    3    6:iconst_0        
		//    4    7:iconst_1        
		//    5    8:iconst_2        
		//    6    9:newarray        int[]
		//    7   11:dup             
		//    8   12:iconst_0        
		//    9   13:bipush          10
		//   10   15:iastore         
		//   11   16:dup             
		//   12   17:iconst_1        
		//   13   18:bipush          9
		//   14   20:iastore         
		//   15   21:iconst_m1       
		//   16   22:invokespecial   #27  <Method void AdInformationPositions$Position(String, int, int, int[], int)>
		//   17   25:putstatic       #29  <Field AdInformationPositions$Position TOP_LEFT>
			TOP_RIGHT = new Position("TOP_RIGHT", 1, 2, new int[] {
				10, 11
			}, 1);
		//   18   28:new             #2   <Class AdInformationPositions$Position>
		//   19   31:dup             
		//   20   32:ldc1            #30  <String "TOP_RIGHT">
		//   21   34:iconst_1        
		//   22   35:iconst_2        
		//   23   36:iconst_2        
		//   24   37:newarray        int[]
		//   25   39:dup             
		//   26   40:iconst_0        
		//   27   41:bipush          10
		//   28   43:iastore         
		//   29   44:dup             
		//   30   45:iconst_1        
		//   31   46:bipush          11
		//   32   48:iastore         
		//   33   49:iconst_1        
		//   34   50:invokespecial   #27  <Method void AdInformationPositions$Position(String, int, int, int[], int)>
		//   35   53:putstatic       #32  <Field AdInformationPositions$Position TOP_RIGHT>
			BOTTOM_LEFT = new Position("BOTTOM_LEFT", 2, 3, new int[] {
				12, 9
			}, -1);
		//   36   56:new             #2   <Class AdInformationPositions$Position>
		//   37   59:dup             
		//   38   60:ldc1            #33  <String "BOTTOM_LEFT">
		//   39   62:iconst_2        
		//   40   63:iconst_3        
		//   41   64:iconst_2        
		//   42   65:newarray        int[]
		//   43   67:dup             
		//   44   68:iconst_0        
		//   45   69:bipush          12
		//   46   71:iastore         
		//   47   72:dup             
		//   48   73:iconst_1        
		//   49   74:bipush          9
		//   50   76:iastore         
		//   51   77:iconst_m1       
		//   52   78:invokespecial   #27  <Method void AdInformationPositions$Position(String, int, int, int[], int)>
		//   53   81:putstatic       #35  <Field AdInformationPositions$Position BOTTOM_LEFT>
			BOTTOM_RIGHT = new Position("BOTTOM_RIGHT", 3, 4, new int[] {
				12, 11
			}, 1);
		//   54   84:new             #2   <Class AdInformationPositions$Position>
		//   55   87:dup             
		//   56   88:ldc1            #36  <String "BOTTOM_RIGHT">
		//   57   90:iconst_3        
		//   58   91:iconst_4        
		//   59   92:iconst_2        
		//   60   93:newarray        int[]
		//   61   95:dup             
		//   62   96:iconst_0        
		//   63   97:bipush          12
		//   64   99:iastore         
		//   65  100:dup             
		//   66  101:iconst_1        
		//   67  102:bipush          11
		//   68  104:iastore         
		//   69  105:iconst_1        
		//   70  106:invokespecial   #27  <Method void AdInformationPositions$Position(String, int, int, int[], int)>
		//   71  109:putstatic       #38  <Field AdInformationPositions$Position BOTTOM_RIGHT>
			$VALUES = (new Position[] {
				TOP_LEFT, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_RIGHT
			});
		//   72  112:iconst_4        
		//   73  113:anewarray       Position[]
		//   74  116:dup             
		//   75  117:iconst_0        
		//   76  118:getstatic       #29  <Field AdInformationPositions$Position TOP_LEFT>
		//   77  121:aastore         
		//   78  122:dup             
		//   79  123:iconst_1        
		//   80  124:getstatic       #32  <Field AdInformationPositions$Position TOP_RIGHT>
		//   81  127:aastore         
		//   82  128:dup             
		//   83  129:iconst_2        
		//   84  130:getstatic       #35  <Field AdInformationPositions$Position BOTTOM_LEFT>
		//   85  133:aastore         
		//   86  134:dup             
		//   87  135:iconst_3        
		//   88  136:getstatic       #38  <Field AdInformationPositions$Position BOTTOM_RIGHT>
		//   89  139:aastore         
		//   90  140:putstatic       #40  <Field AdInformationPositions$Position[] $VALUES>
		//*  91  143:return          
		}

		private Position(String s, int i, int j, int ai[], int k)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #44  <Method void Enum(String, int)>
			rules = ai;
		//    4    6:aload_0         
		//    5    7:aload           4
		//    6    9:putfield        #46  <Field int[] rules>
			animationMultiplier = k;
		//    7   12:aload_0         
		//    8   13:iload           5
		//    9   15:putfield        #48  <Field int animationMultiplier>
			index = j;
		//   10   18:aload_0         
		//   11   19:iload_3         
		//   12   20:putfield        #50  <Field int index>
		//   13   23:return          
		}
	}


	protected static final String a;

	static 
	{
		a = Position.BOTTOM_LEFT.name();
	//    0    0:getstatic       #15  <Field AdInformationPositions$Position AdInformationPositions$Position.BOTTOM_LEFT>
	//    1    3:invokevirtual   #19  <Method String AdInformationPositions$Position.name()>
	//    2    6:putstatic       #21  <Field String a>
	//*   3    9:return          
	}
}
