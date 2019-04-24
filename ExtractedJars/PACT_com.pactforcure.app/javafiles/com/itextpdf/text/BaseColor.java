// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.error_messages.MessageLocalization;

public class BaseColor
{

	public BaseColor(float f, float f1, float f2)
	{
		this(f, f1, f2, 1.0F);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:fconst_1        
	//    5    5:invokespecial   #61  <Method void BaseColor(float, float, float, float)>
	//    6    8:return          
	}

	public BaseColor(float f, float f1, float f2, float f3)
	{
		this((int)((double)(f * 255F) + 0.5D), (int)((double)(f1 * 255F) + 0.5D), (int)((double)(f2 * 255F) + 0.5D), (int)((double)(f3 * 255F) + 0.5D));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:ldc1            #62  <Float 255F>
	//    3    4:fmul            
	//    4    5:f2d             
	//    5    6:ldc2w           #63  <Double 0.5D>
	//    6    9:dadd            
	//    7   10:d2i             
	//    8   11:fload_2         
	//    9   12:ldc1            #62  <Float 255F>
	//   10   14:fmul            
	//   11   15:f2d             
	//   12   16:ldc2w           #63  <Double 0.5D>
	//   13   19:dadd            
	//   14   20:d2i             
	//   15   21:fload_3         
	//   16   22:ldc1            #62  <Float 255F>
	//   17   24:fmul            
	//   18   25:f2d             
	//   19   26:ldc2w           #63  <Double 0.5D>
	//   20   29:dadd            
	//   21   30:d2i             
	//   22   31:fload           4
	//   23   33:ldc1            #62  <Float 255F>
	//   24   35:fmul            
	//   25   36:f2d             
	//   26   37:ldc2w           #63  <Double 0.5D>
	//   27   40:dadd            
	//   28   41:d2i             
	//   29   42:invokespecial   #67  <Method void BaseColor(int, int, int, int)>
	//   30   45:return          
	}

	public BaseColor(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void Object()>
		value = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #72  <Field int value>
	//    5    9:return          
	}

	public BaseColor(int i, int j, int k)
	{
		this(i, j, k, 255);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:sipush          255
	//    5    7:invokespecial   #67  <Method void BaseColor(int, int, int, int)>
	//    6   10:return          
	}

	public BaseColor(int i, int j, int k, int l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void Object()>
		setValue(i, j, k, l);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:iload           4
	//    7   10:invokevirtual   #75  <Method void setValue(int, int, int, int)>
	//    8   13:return          
	}

	private static void validate(int i)
	{
		if(i < 0 || i > 255)
	//*   0    0:iload_0         
	//*   1    1:iflt            11
	//*   2    4:iload_0         
	//*   3    5:sipush          255
	//*   4    8:icmple          28
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("color.value.outside.range.0.255", new Object[0]));
	//    5   11:new             #78  <Class IllegalArgumentException>
	//    6   14:dup             
	//    7   15:ldc1            #80  <String "color.value.outside.range.0.255">
	//    8   17:iconst_0        
	//    9   18:anewarray       Object[]
	//   10   21:invokestatic    #86  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   11   24:invokespecial   #89  <Method void IllegalArgumentException(String)>
	//   12   27:athrow          
		else
			return;
	//   13   28:return          
	}

	public BaseColor brighter()
	{
		int j = getRed();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #95  <Method int getRed()>
	//    2    4:istore_2        
		int k = getGreen();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #98  <Method int getGreen()>
	//    5    9:istore_3        
		int l = getBlue();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #101 <Method int getBlue()>
	//    8   14:istore          4
		if(j == 0 && k == 0 && l == 0)
	//*   9   16:iload_2         
	//*  10   17:ifne            40
	//*  11   20:iload_3         
	//*  12   21:ifne            40
	//*  13   24:iload           4
	//*  14   26:ifne            40
			return new BaseColor(3, 3, 3);
	//   15   29:new             #2   <Class BaseColor>
	//   16   32:dup             
	//   17   33:iconst_3        
	//   18   34:iconst_3        
	//   19   35:iconst_3        
	//   20   36:invokespecial   #30  <Method void BaseColor(int, int, int)>
	//   21   39:areturn         
		int i = j;
	//   22   40:iload_2         
	//   23   41:istore_1        
		if(j > 0)
	//*  24   42:iload_2         
	//*  25   43:ifle            55
		{
			i = j;
	//   26   46:iload_2         
	//   27   47:istore_1        
			if(j < 3)
	//*  28   48:iload_2         
	//*  29   49:iconst_3        
	//*  30   50:icmpge          55
				i = 3;
	//   31   53:iconst_3        
	//   32   54:istore_1        
		}
		j = k;
	//   33   55:iload_3         
	//   34   56:istore_2        
		if(k > 0)
	//*  35   57:iload_3         
	//*  36   58:ifle            70
		{
			j = k;
	//   37   61:iload_3         
	//   38   62:istore_2        
			if(k < 3)
	//*  39   63:iload_3         
	//*  40   64:iconst_3        
	//*  41   65:icmpge          70
				j = 3;
	//   42   68:iconst_3        
	//   43   69:istore_2        
		}
		k = l;
	//   44   70:iload           4
	//   45   72:istore_3        
		if(l > 0)
	//*  46   73:iload           4
	//*  47   75:ifle            89
		{
			k = l;
	//   48   78:iload           4
	//   49   80:istore_3        
			if(l < 3)
	//*  50   81:iload           4
	//*  51   83:iconst_3        
	//*  52   84:icmpge          89
				k = 3;
	//   53   87:iconst_3        
	//   54   88:istore_3        
		}
		return new BaseColor(Math.min((int)((double)i / 0.69999999999999996D), 255), Math.min((int)((double)j / 0.69999999999999996D), 255), Math.min((int)((double)k / 0.69999999999999996D), 255));
	//   55   89:new             #2   <Class BaseColor>
	//   56   92:dup             
	//   57   93:iload_1         
	//   58   94:i2d             
	//   59   95:ldc2w           #12  <Double 0.69999999999999996D>
	//   60   98:ddiv            
	//   61   99:d2i             
	//   62  100:sipush          255
	//   63  103:invokestatic    #107 <Method int Math.min(int, int)>
	//   64  106:iload_2         
	//   65  107:i2d             
	//   66  108:ldc2w           #12  <Double 0.69999999999999996D>
	//   67  111:ddiv            
	//   68  112:d2i             
	//   69  113:sipush          255
	//   70  116:invokestatic    #107 <Method int Math.min(int, int)>
	//   71  119:iload_3         
	//   72  120:i2d             
	//   73  121:ldc2w           #12  <Double 0.69999999999999996D>
	//   74  124:ddiv            
	//   75  125:d2i             
	//   76  126:sipush          255
	//   77  129:invokestatic    #107 <Method int Math.min(int, int)>
	//   78  132:invokespecial   #30  <Method void BaseColor(int, int, int)>
	//   79  135:areturn         
	}

	public BaseColor darker()
	{
		return new BaseColor(Math.max((int)((double)getRed() * 0.69999999999999996D), 0), Math.max((int)((double)getGreen() * 0.69999999999999996D), 0), Math.max((int)((double)getBlue() * 0.69999999999999996D), 0));
	//    0    0:new             #2   <Class BaseColor>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #95  <Method int getRed()>
	//    4    8:i2d             
	//    5    9:ldc2w           #12  <Double 0.69999999999999996D>
	//    6   12:dmul            
	//    7   13:d2i             
	//    8   14:iconst_0        
	//    9   15:invokestatic    #111 <Method int Math.max(int, int)>
	//   10   18:aload_0         
	//   11   19:invokevirtual   #98  <Method int getGreen()>
	//   12   22:i2d             
	//   13   23:ldc2w           #12  <Double 0.69999999999999996D>
	//   14   26:dmul            
	//   15   27:d2i             
	//   16   28:iconst_0        
	//   17   29:invokestatic    #111 <Method int Math.max(int, int)>
	//   18   32:aload_0         
	//   19   33:invokevirtual   #101 <Method int getBlue()>
	//   20   36:i2d             
	//   21   37:ldc2w           #12  <Double 0.69999999999999996D>
	//   22   40:dmul            
	//   23   41:d2i             
	//   24   42:iconst_0        
	//   25   43:invokestatic    #111 <Method int Math.max(int, int)>
	//   26   46:invokespecial   #30  <Method void BaseColor(int, int, int)>
	//   27   49:areturn         
	}

	public boolean equals(Object obj)
	{
		return (obj instanceof BaseColor) && ((BaseColor)obj).value == value;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class BaseColor>
	//    2    4:ifeq            23
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class BaseColor>
	//    5   11:getfield        #72  <Field int value>
	//    6   14:aload_0         
	//    7   15:getfield        #72  <Field int value>
	//    8   18:icmpne          23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public int getAlpha()
	{
		return getRGB() >> 24 & 0xff;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #117 <Method int getRGB()>
	//    2    4:bipush          24
	//    3    6:ishr            
	//    4    7:sipush          255
	//    5   10:iand            
	//    6   11:ireturn         
	}

	public int getBlue()
	{
		return getRGB() >> 0 & 0xff;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #117 <Method int getRGB()>
	//    2    4:iconst_0        
	//    3    5:ishr            
	//    4    6:sipush          255
	//    5    9:iand            
	//    6   10:ireturn         
	}

	public int getGreen()
	{
		return getRGB() >> 8 & 0xff;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #117 <Method int getRGB()>
	//    2    4:bipush          8
	//    3    6:ishr            
	//    4    7:sipush          255
	//    5   10:iand            
	//    6   11:ireturn         
	}

	public int getRGB()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field int value>
	//    2    4:ireturn         
	}

	public int getRed()
	{
		return getRGB() >> 16 & 0xff;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #117 <Method int getRGB()>
	//    2    4:bipush          16
	//    3    6:ishr            
	//    4    7:sipush          255
	//    5   10:iand            
	//    6   11:ireturn         
	}

	public int hashCode()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field int value>
	//    2    4:ireturn         
	}

	protected void setValue(int i, int j, int k, int l)
	{
		validate(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #120 <Method void validate(int)>
		validate(j);
	//    2    4:iload_2         
	//    3    5:invokestatic    #120 <Method void validate(int)>
		validate(k);
	//    4    8:iload_3         
	//    5    9:invokestatic    #120 <Method void validate(int)>
		validate(l);
	//    6   12:iload           4
	//    7   14:invokestatic    #120 <Method void validate(int)>
		value = (l & 0xff) << 24 | (i & 0xff) << 16 | (j & 0xff) << 8 | (k & 0xff) << 0;
	//    8   17:aload_0         
	//    9   18:iload           4
	//   10   20:sipush          255
	//   11   23:iand            
	//   12   24:bipush          24
	//   13   26:ishl            
	//   14   27:iload_1         
	//   15   28:sipush          255
	//   16   31:iand            
	//   17   32:bipush          16
	//   18   34:ishl            
	//   19   35:ior             
	//   20   36:iload_2         
	//   21   37:sipush          255
	//   22   40:iand            
	//   23   41:bipush          8
	//   24   43:ishl            
	//   25   44:ior             
	//   26   45:iload_3         
	//   27   46:sipush          255
	//   28   49:iand            
	//   29   50:iconst_0        
	//   30   51:ishl            
	//   31   52:ior             
	//   32   53:putfield        #72  <Field int value>
	//   33   56:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append("Color value[").append(Integer.toString(value, 16)).append("]").toString();
	//    0    0:new             #124 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #125 <Method void StringBuilder()>
	//    3    7:ldc1            #127 <String "Color value[">
	//    4    9:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #72  <Field int value>
	//    7   16:bipush          16
	//    8   18:invokestatic    #136 <Method String Integer.toString(int, int)>
	//    9   21:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:ldc1            #138 <String "]">
	//   11   26:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   12   29:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   13   32:areturn         
	}

	public static final BaseColor BLACK = new BaseColor(0, 0, 0);
	public static final BaseColor BLUE = new BaseColor(0, 0, 255);
	public static final BaseColor CYAN = new BaseColor(0, 255, 255);
	public static final BaseColor DARK_GRAY = new BaseColor(64, 64, 64);
	private static final double FACTOR = 0.69999999999999996D;
	public static final BaseColor GRAY = new BaseColor(128, 128, 128);
	public static final BaseColor GREEN = new BaseColor(0, 255, 0);
	public static final BaseColor LIGHT_GRAY = new BaseColor(192, 192, 192);
	public static final BaseColor MAGENTA = new BaseColor(255, 0, 255);
	public static final BaseColor ORANGE = new BaseColor(255, 200, 0);
	public static final BaseColor PINK = new BaseColor(255, 175, 175);
	public static final BaseColor RED = new BaseColor(255, 0, 0);
	public static final BaseColor WHITE = new BaseColor(255, 255, 255);
	public static final BaseColor YELLOW = new BaseColor(255, 255, 0);
	private int value;

	static 
	{
	//    0    0:new             #2   <Class BaseColor>
	//    1    3:dup             
	//    2    4:sipush          255
	//    3    7:sipush          255
	//    4   10:sipush          255
	//    5   13:invokespecial   #30  <Method void BaseColor(int, int, int)>
	//    6   16:putstatic       #32  <Field BaseColor WHITE>
	//    7   19:new             #2   <Class BaseColor>
	//    8   22:dup             
	//    9   23:sipush          192
	//   10   26:sipush          192
	//   11   29:sipush          192
	//   12   32:invokespecial   #30  <Method void BaseColor(int, int, int)>
	//   13   35:putstatic       #34  <Field BaseColor LIGHT_GRAY>
	//   14   38:new             #2   <Class BaseColor>
	//   15   41:dup             
	//   16   42:sipush          128
	//   17   45:sipush          128
	//   18   48:sipush          128
	//   19   51:invokespecial   #30  <Method void BaseColor(int, int, int)>
	//   20   54:putstatic       #36  <Field BaseColor GRAY>
	//   21   57:new             #2   <Class BaseColor>
	//   22   60:dup             
	//   23   61:bipush          64
	//   24   63:bipush          64
	//   25   65:bipush          64
	//   26   67:invokespecial   #30  <Method void BaseColor(int, int, int)>
	//   27   70:putstatic       #38  <Field BaseColor DARK_GRAY>
	//   28   73:new             #2   <Class BaseColor>
	//   29   76:dup             
	//   30   77:iconst_0        
	//   31   78:iconst_0        
	//   32   79:iconst_0        
	//   33   80:invokespecial   #30  <Method void BaseColor(int, int, int)>
	//   34   83:putstatic       #40  <Field BaseColor BLACK>
	//   35   86:new             #2   <Class BaseColor>
	//   36   89:dup             
	//   37   90:sipush          255
	//   38   93:iconst_0        
	//   39   94:iconst_0        
	//   40   95:invokespecial   #30  <Method void BaseColor(int, int, int)>
	//   41   98:putstatic       #42  <Field BaseColor RED>
	//   42  101:new             #2   <Class BaseColor>
	//   43  104:dup             
	//   44  105:sipush          255
	//   45  108:sipush          175
	//   46  111:sipush          175
	//   47  114:invokespecial   #30  <Method void BaseColor(int, int, int)>
	//   48  117:putstatic       #44  <Field BaseColor PINK>
	//   49  120:new             #2   <Class BaseColor>
	//   50  123:dup             
	//   51  124:sipush          255
	//   52  127:sipush          200
	//   53  130:iconst_0        
	//   54  131:invokespecial   #30  <Method void BaseColor(int, int, int)>
	//   55  134:putstatic       #46  <Field BaseColor ORANGE>
	//   56  137:new             #2   <Class BaseColor>
	//   57  140:dup             
	//   58  141:sipush          255
	//   59  144:sipush          255
	//   60  147:iconst_0        
	//   61  148:invokespecial   #30  <Method void BaseColor(int, int, int)>
	//   62  151:putstatic       #48  <Field BaseColor YELLOW>
	//   63  154:new             #2   <Class BaseColor>
	//   64  157:dup             
	//   65  158:iconst_0        
	//   66  159:sipush          255
	//   67  162:iconst_0        
	//   68  163:invokespecial   #30  <Method void BaseColor(int, int, int)>
	//   69  166:putstatic       #50  <Field BaseColor GREEN>
	//   70  169:new             #2   <Class BaseColor>
	//   71  172:dup             
	//   72  173:sipush          255
	//   73  176:iconst_0        
	//   74  177:sipush          255
	//   75  180:invokespecial   #30  <Method void BaseColor(int, int, int)>
	//   76  183:putstatic       #52  <Field BaseColor MAGENTA>
	//   77  186:new             #2   <Class BaseColor>
	//   78  189:dup             
	//   79  190:iconst_0        
	//   80  191:sipush          255
	//   81  194:sipush          255
	//   82  197:invokespecial   #30  <Method void BaseColor(int, int, int)>
	//   83  200:putstatic       #54  <Field BaseColor CYAN>
	//   84  203:new             #2   <Class BaseColor>
	//   85  206:dup             
	//   86  207:iconst_0        
	//   87  208:iconst_0        
	//   88  209:sipush          255
	//   89  212:invokespecial   #30  <Method void BaseColor(int, int, int)>
	//   90  215:putstatic       #56  <Field BaseColor BLUE>
	//*  91  218:return          
	}
}
