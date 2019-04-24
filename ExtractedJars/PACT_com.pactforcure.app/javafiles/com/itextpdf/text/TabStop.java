// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.pdf.draw.DrawInterface;

public class TabStop
{
	public static final class Alignment extends Enum
	{

		public static Alignment valueOf(String s)
		{
			return (Alignment)Enum.valueOf(com/itextpdf/text/TabStop$Alignment, s);
		//    0    0:ldc1            #2   <Class TabStop$Alignment>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class TabStop$Alignment>
		//    4    9:areturn         
		}

		public static Alignment[] values()
		{
			return (Alignment[])((Alignment []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field TabStop$Alignment[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.itextpdf.text.TabStop$Alignment_3B_.clone()>
		//    2    6:checkcast       #46  <Class TabStop$Alignment[]>
		//    3    9:areturn         
		}

		private static final Alignment $VALUES[];
		public static final Alignment ANCHOR;
		public static final Alignment CENTER;
		public static final Alignment LEFT;
		public static final Alignment RIGHT;

		static 
		{
			LEFT = new Alignment("LEFT", 0);
		//    0    0:new             #2   <Class TabStop$Alignment>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "LEFT">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void TabStop$Alignment(String, int)>
		//    5   10:putstatic       #24  <Field TabStop$Alignment LEFT>
			RIGHT = new Alignment("RIGHT", 1);
		//    6   13:new             #2   <Class TabStop$Alignment>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "RIGHT">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void TabStop$Alignment(String, int)>
		//   11   23:putstatic       #27  <Field TabStop$Alignment RIGHT>
			CENTER = new Alignment("CENTER", 2);
		//   12   26:new             #2   <Class TabStop$Alignment>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "CENTER">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void TabStop$Alignment(String, int)>
		//   17   36:putstatic       #30  <Field TabStop$Alignment CENTER>
			ANCHOR = new Alignment("ANCHOR", 3);
		//   18   39:new             #2   <Class TabStop$Alignment>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "ANCHOR">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void TabStop$Alignment(String, int)>
		//   23   49:putstatic       #33  <Field TabStop$Alignment ANCHOR>
			$VALUES = (new Alignment[] {
				LEFT, RIGHT, CENTER, ANCHOR
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       Alignment[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field TabStop$Alignment LEFT>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field TabStop$Alignment RIGHT>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field TabStop$Alignment CENTER>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field TabStop$Alignment ANCHOR>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field TabStop$Alignment[] $VALUES>
		//*  43   83:return          
		}

		private Alignment(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public TabStop(float f)
	{
		this(f, Alignment.LEFT);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:getstatic       #22  <Field TabStop$Alignment TabStop$Alignment.LEFT>
	//    3    5:invokespecial   #25  <Method void TabStop(float, TabStop$Alignment)>
	//    4    8:return          
	}

	public TabStop(float f, Alignment alignment1)
	{
		this(f, ((DrawInterface) (null)), alignment1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:invokespecial   #29  <Method void TabStop(float, DrawInterface, TabStop$Alignment)>
	//    5    7:return          
	}

	public TabStop(float f, Alignment alignment1, char c)
	{
		this(f, ((DrawInterface) (null)), alignment1, c);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:iload_3         
	//    5    5:invokespecial   #33  <Method void TabStop(float, DrawInterface, TabStop$Alignment, char)>
	//    6    8:return          
	}

	public TabStop(float f, DrawInterface drawinterface)
	{
		this(f, drawinterface, Alignment.LEFT);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #22  <Field TabStop$Alignment TabStop$Alignment.LEFT>
	//    4    6:invokespecial   #29  <Method void TabStop(float, DrawInterface, TabStop$Alignment)>
	//    5    9:return          
	}

	public TabStop(float f, DrawInterface drawinterface, Alignment alignment1)
	{
		this(f, drawinterface, alignment1, '.');
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:bipush          46
	//    5    6:invokespecial   #33  <Method void TabStop(float, DrawInterface, TabStop$Alignment, char)>
	//    6    9:return          
	}

	public TabStop(float f, DrawInterface drawinterface, Alignment alignment1, char c)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		alignment = Alignment.LEFT;
	//    2    4:aload_0         
	//    3    5:getstatic       #22  <Field TabStop$Alignment TabStop$Alignment.LEFT>
	//    4    8:putfield        #39  <Field TabStop$Alignment alignment>
		anchorChar = '.';
	//    5   11:aload_0         
	//    6   12:bipush          46
	//    7   14:putfield        #41  <Field char anchorChar>
		position = f;
	//    8   17:aload_0         
	//    9   18:fload_1         
	//   10   19:putfield        #43  <Field float position>
		leader = drawinterface;
	//   11   22:aload_0         
	//   12   23:aload_2         
	//   13   24:putfield        #45  <Field DrawInterface leader>
		alignment = alignment1;
	//   14   27:aload_0         
	//   15   28:aload_3         
	//   16   29:putfield        #39  <Field TabStop$Alignment alignment>
		anchorChar = c;
	//   17   32:aload_0         
	//   18   33:iload           4
	//   19   35:putfield        #41  <Field char anchorChar>
	//   20   38:return          
	}

	public TabStop(TabStop tabstop)
	{
		this(tabstop.getPosition(), tabstop.getLeader(), tabstop.getAlignment(), tabstop.getAnchorChar());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #50  <Method float getPosition()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #54  <Method DrawInterface getLeader()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #58  <Method TabStop$Alignment getAlignment()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #62  <Method char getAnchorChar()>
	//    9   17:invokespecial   #33  <Method void TabStop(float, DrawInterface, TabStop$Alignment, char)>
	//   10   20:return          
	}

	public static TabStop newInstance(float f, float f1)
	{
		f = (float)Math.round(f * 1000F) / 1000F;
	//    0    0:fload_0         
	//    1    1:ldc1            #65  <Float 1000F>
	//    2    3:fmul            
	//    3    4:invokestatic    #71  <Method int Math.round(float)>
	//    4    7:i2f             
	//    5    8:ldc1            #65  <Float 1000F>
	//    6   10:fdiv            
	//    7   11:fstore_0        
		f1 = (float)Math.round(f1 * 1000F) / 1000F;
	//    8   12:fload_1         
	//    9   13:ldc1            #65  <Float 1000F>
	//   10   15:fmul            
	//   11   16:invokestatic    #71  <Method int Math.round(float)>
	//   12   19:i2f             
	//   13   20:ldc1            #65  <Float 1000F>
	//   14   22:fdiv            
	//   15   23:fstore_1        
		return new TabStop((f + f1) - f % f1);
	//   16   24:new             #2   <Class TabStop>
	//   17   27:dup             
	//   18   28:fload_0         
	//   19   29:fload_1         
	//   20   30:fadd            
	//   21   31:fload_0         
	//   22   32:fload_1         
	//   23   33:frem            
	//   24   34:fsub            
	//   25   35:invokespecial   #73  <Method void TabStop(float)>
	//   26   38:areturn         
	}

	public Alignment getAlignment()
	{
		return alignment;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field TabStop$Alignment alignment>
	//    2    4:areturn         
	}

	public char getAnchorChar()
	{
		return anchorChar;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field char anchorChar>
	//    2    4:ireturn         
	}

	public DrawInterface getLeader()
	{
		return leader;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field DrawInterface leader>
	//    2    4:areturn         
	}

	public float getPosition()
	{
		return position;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field float position>
	//    2    4:freturn         
	}

	public float getPosition(float f, float f1, float f2)
	{
		float f3 = position;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field float position>
	//    2    4:fstore          4
		f1 -= f;
	//    3    6:fload_2         
	//    4    7:fload_1         
	//    5    8:fsub            
	//    6    9:fstore_2        
		static class _cls1
		{

			static final int $SwitchMap$com$itextpdf$text$TabStop$Alignment[];

			static 
			{
				$SwitchMap$com$itextpdf$text$TabStop$Alignment = new int[Alignment.values().length];
			//    0    0:invokestatic    #18  <Method TabStop$Alignment[] TabStop$Alignment.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$TabStop$Alignment>
				try
				{
					$SwitchMap$com$itextpdf$text$TabStop$Alignment[Alignment.RIGHT.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$TabStop$Alignment>
			//    5   12:getstatic       #24  <Field TabStop$Alignment TabStop$Alignment.RIGHT>
			//    6   15:invokevirtual   #28  <Method int TabStop$Alignment.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$TabStop$Alignment>
			//*  10   23:getstatic       #31  <Field TabStop$Alignment TabStop$Alignment.CENTER>
			//*  11   26:invokevirtual   #28  <Method int TabStop$Alignment.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$TabStop$Alignment>
			//*  15   34:getstatic       #34  <Field TabStop$Alignment TabStop$Alignment.ANCHOR>
			//*  16   37:invokevirtual   #28  <Method int TabStop$Alignment.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:return          
			//*  20   43:astore_0        
			//*  21   44:return          
			//*  22   45:astore_0        
			//*  23   46:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   49:astore_0        
				try
				{
					$SwitchMap$com$itextpdf$text$TabStop$Alignment[Alignment.CENTER.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$com$itextpdf$text$TabStop$Alignment[Alignment.ANCHOR.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  25   50:goto            20
			}
		}

		switch(_cls1..SwitchMap.com.itextpdf.text.TabStop.Alignment[alignment.ordinal()])
	//*   7   10:getstatic       #78  <Field int[] TabStop$1.$SwitchMap$com$itextpdf$text$TabStop$Alignment>
	//*   8   13:aload_0         
	//*   9   14:getfield        #39  <Field TabStop$Alignment alignment>
	//*  10   17:invokevirtual   #82  <Method int TabStop$Alignment.ordinal()>
	//*  11   20:iaload          
		{
	//*  12   21:tableswitch     1 3: default 48
	//	               1 51
	//	               2 71
	//	               3 95
		default:
			return f3;
	//   13   48:fload           4
	//   14   50:freturn         

		case 1: // '\001'
			if(f + f1 < position)
	//*  15   51:fload_1         
	//*  16   52:fload_2         
	//*  17   53:fadd            
	//*  18   54:aload_0         
	//*  19   55:getfield        #43  <Field float position>
	//*  20   58:fcmpg           
	//*  21   59:ifge            69
				return position - f1;
	//   22   62:aload_0         
	//   23   63:getfield        #43  <Field float position>
	//   24   66:fload_2         
	//   25   67:fsub            
	//   26   68:freturn         
			else
				return f;
	//   27   69:fload_1         
	//   28   70:freturn         

		case 2: // '\002'
			if(f1 / 2.0F + f < position)
	//*  29   71:fload_2         
	//*  30   72:fconst_2        
	//*  31   73:fdiv            
	//*  32   74:fload_1         
	//*  33   75:fadd            
	//*  34   76:aload_0         
	//*  35   77:getfield        #43  <Field float position>
	//*  36   80:fcmpg           
	//*  37   81:ifge            93
				return position - f1 / 2.0F;
	//   38   84:aload_0         
	//   39   85:getfield        #43  <Field float position>
	//   40   88:fload_2         
	//   41   89:fconst_2        
	//   42   90:fdiv            
	//   43   91:fsub            
	//   44   92:freturn         
			else
				return f;
	//   45   93:fload_1         
	//   46   94:freturn         

		case 3: // '\003'
			break;
		}
		if(!Float.isNaN(f2))
	//*  47   95:fload_3         
	//*  48   96:invokestatic    #88  <Method boolean Float.isNaN(float)>
	//*  49   99:ifne            122
			if(f2 < position)
	//*  50  102:fload_3         
	//*  51  103:aload_0         
	//*  52  104:getfield        #43  <Field float position>
	//*  53  107:fcmpg           
	//*  54  108:ifge            120
				return position - (f2 - f);
	//   55  111:aload_0         
	//   56  112:getfield        #43  <Field float position>
	//   57  115:fload_3         
	//   58  116:fload_1         
	//   59  117:fsub            
	//   60  118:fsub            
	//   61  119:freturn         
			else
				return f;
	//   62  120:fload_1         
	//   63  121:freturn         
		if(f + f1 < position)
	//*  64  122:fload_1         
	//*  65  123:fload_2         
	//*  66  124:fadd            
	//*  67  125:aload_0         
	//*  68  126:getfield        #43  <Field float position>
	//*  69  129:fcmpg           
	//*  70  130:ifge            140
			return position - f1;
	//   71  133:aload_0         
	//   72  134:getfield        #43  <Field float position>
	//   73  137:fload_2         
	//   74  138:fsub            
	//   75  139:freturn         
		else
			return f;
	//   76  140:fload_1         
	//   77  141:freturn         
	}

	public void setAlignment(Alignment alignment1)
	{
		alignment = alignment1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field TabStop$Alignment alignment>
	//    3    5:return          
	}

	public void setAnchorChar(char c)
	{
		anchorChar = c;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #41  <Field char anchorChar>
	//    3    5:return          
	}

	public void setLeader(DrawInterface drawinterface)
	{
		leader = drawinterface;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field DrawInterface leader>
	//    3    5:return          
	}

	public void setPosition(float f)
	{
		position = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #43  <Field float position>
	//    3    5:return          
	}

	protected Alignment alignment;
	protected char anchorChar;
	protected DrawInterface leader;
	protected float position;
}
