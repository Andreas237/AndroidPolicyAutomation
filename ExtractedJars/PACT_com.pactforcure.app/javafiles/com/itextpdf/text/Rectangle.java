// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.pdf.GrayColor;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.itextpdf.text:
//			Element, DocumentException, ElementListener, BaseColor

public class Rectangle
	implements Element
{

	public Rectangle(float f, float f1)
	{
		this(0.0F, 0.0F, f, f1);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fconst_0        
	//    3    3:fload_1         
	//    4    4:fload_2         
	//    5    5:invokespecial   #47  <Method void Rectangle(float, float, float, float)>
	//    6    8:return          
	}

	public Rectangle(float f, float f1, float f2, float f3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
		rotation = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #53  <Field int rotation>
		backgroundColor = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #55  <Field BaseColor backgroundColor>
		border = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #57  <Field int border>
		useVariableBorders = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #59  <Field boolean useVariableBorders>
		borderWidth = -1F;
	//   14   24:aload_0         
	//   15   25:ldc1            #60  <Float -1F>
	//   16   27:putfield        #62  <Field float borderWidth>
		borderWidthLeft = -1F;
	//   17   30:aload_0         
	//   18   31:ldc1            #60  <Float -1F>
	//   19   33:putfield        #64  <Field float borderWidthLeft>
		borderWidthRight = -1F;
	//   20   36:aload_0         
	//   21   37:ldc1            #60  <Float -1F>
	//   22   39:putfield        #66  <Field float borderWidthRight>
		borderWidthTop = -1F;
	//   23   42:aload_0         
	//   24   43:ldc1            #60  <Float -1F>
	//   25   45:putfield        #68  <Field float borderWidthTop>
		borderWidthBottom = -1F;
	//   26   48:aload_0         
	//   27   49:ldc1            #60  <Float -1F>
	//   28   51:putfield        #70  <Field float borderWidthBottom>
		borderColor = null;
	//   29   54:aload_0         
	//   30   55:aconst_null     
	//   31   56:putfield        #72  <Field BaseColor borderColor>
		borderColorLeft = null;
	//   32   59:aload_0         
	//   33   60:aconst_null     
	//   34   61:putfield        #74  <Field BaseColor borderColorLeft>
		borderColorRight = null;
	//   35   64:aload_0         
	//   36   65:aconst_null     
	//   37   66:putfield        #76  <Field BaseColor borderColorRight>
		borderColorTop = null;
	//   38   69:aload_0         
	//   39   70:aconst_null     
	//   40   71:putfield        #78  <Field BaseColor borderColorTop>
		borderColorBottom = null;
	//   41   74:aload_0         
	//   42   75:aconst_null     
	//   43   76:putfield        #80  <Field BaseColor borderColorBottom>
		llx = f;
	//   44   79:aload_0         
	//   45   80:fload_1         
	//   46   81:putfield        #82  <Field float llx>
		lly = f1;
	//   47   84:aload_0         
	//   48   85:fload_2         
	//   49   86:putfield        #84  <Field float lly>
		urx = f2;
	//   50   89:aload_0         
	//   51   90:fload_3         
	//   52   91:putfield        #86  <Field float urx>
		ury = f3;
	//   53   94:aload_0         
	//   54   95:fload           4
	//   55   97:putfield        #88  <Field float ury>
	//   56  100:return          
	}

	public Rectangle(float f, float f1, float f2, float f3, int i)
	{
		this(f, f1, f2, f3);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:invokespecial   #47  <Method void Rectangle(float, float, float, float)>
		setRotation(i);
	//    6    9:aload_0         
	//    7   10:iload           5
	//    8   12:invokevirtual   #93  <Method void setRotation(int)>
	//    9   15:return          
	}

	public Rectangle(float f, float f1, int i)
	{
		this(0.0F, 0.0F, f, f1, i);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fconst_0        
	//    3    3:fload_1         
	//    4    4:fload_2         
	//    5    5:iload_3         
	//    6    6:invokespecial   #96  <Method void Rectangle(float, float, float, float, int)>
	//    7    9:return          
	}

	public Rectangle(com.itextpdf.awt.geom.Rectangle rectangle1)
	{
		this((float)rectangle1.getX(), (float)rectangle1.getY(), (float)(rectangle1.getX() + rectangle1.getWidth()), (float)(rectangle1.getY() + rectangle1.getHeight()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #103 <Method double com.itextpdf.awt.geom.Rectangle.getX()>
	//    3    5:d2f             
	//    4    6:aload_1         
	//    5    7:invokevirtual   #106 <Method double com.itextpdf.awt.geom.Rectangle.getY()>
	//    6   10:d2f             
	//    7   11:aload_1         
	//    8   12:invokevirtual   #103 <Method double com.itextpdf.awt.geom.Rectangle.getX()>
	//    9   15:aload_1         
	//   10   16:invokevirtual   #109 <Method double com.itextpdf.awt.geom.Rectangle.getWidth()>
	//   11   19:dadd            
	//   12   20:d2f             
	//   13   21:aload_1         
	//   14   22:invokevirtual   #106 <Method double com.itextpdf.awt.geom.Rectangle.getY()>
	//   15   25:aload_1         
	//   16   26:invokevirtual   #112 <Method double com.itextpdf.awt.geom.Rectangle.getHeight()>
	//   17   29:dadd            
	//   18   30:d2f             
	//   19   31:invokespecial   #47  <Method void Rectangle(float, float, float, float)>
	//   20   34:return          
	}

	public Rectangle(Rectangle rectangle1)
	{
		this(rectangle1.llx, rectangle1.lly, rectangle1.urx, rectangle1.ury);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #82  <Field float llx>
	//    3    5:aload_1         
	//    4    6:getfield        #84  <Field float lly>
	//    5    9:aload_1         
	//    6   10:getfield        #86  <Field float urx>
	//    7   13:aload_1         
	//    8   14:getfield        #88  <Field float ury>
	//    9   17:invokespecial   #47  <Method void Rectangle(float, float, float, float)>
		cloneNonPositionParameters(rectangle1);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #116 <Method void cloneNonPositionParameters(Rectangle)>
	//   13   25:return          
	}

	private float getVariableBorderWidth(float f, int i)
	{
		if((border & i) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field int border>
	//*   2    4:iload_2         
	//*   3    5:iand            
	//*   4    6:ifeq            23
		{
			if(f != -1F)
	//*   5    9:fload_1         
	//*   6   10:ldc1            #60  <Float -1F>
	//*   7   12:fcmpl           
	//*   8   13:ifeq            18
				return f;
	//    9   16:fload_1         
	//   10   17:freturn         
			else
				return borderWidth;
	//   11   18:aload_0         
	//   12   19:getfield        #62  <Field float borderWidth>
	//   13   22:freturn         
		} else
		{
			return 0.0F;
	//   14   23:fconst_0        
	//   15   24:freturn         
		}
	}

	private void updateBorderBasedOnWidth(float f, int i)
	{
		useVariableBorders = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #59  <Field boolean useVariableBorders>
		if(f > 0.0F)
	//*   3    5:fload_1         
	//*   4    6:fconst_0        
	//*   5    7:fcmpl           
	//*   6    8:ifle            17
		{
			enableBorderSide(i);
	//    7   11:aload_0         
	//    8   12:iload_2         
	//    9   13:invokevirtual   #123 <Method void enableBorderSide(int)>
			return;
	//   10   16:return          
		} else
		{
			disableBorderSide(i);
	//   11   17:aload_0         
	//   12   18:iload_2         
	//   13   19:invokevirtual   #126 <Method void disableBorderSide(int)>
			return;
	//   14   22:return          
		}
	}

	public void cloneNonPositionParameters(Rectangle rectangle1)
	{
		rotation = rectangle1.rotation;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #53  <Field int rotation>
	//    3    5:putfield        #53  <Field int rotation>
		backgroundColor = rectangle1.backgroundColor;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #55  <Field BaseColor backgroundColor>
	//    7   13:putfield        #55  <Field BaseColor backgroundColor>
		border = rectangle1.border;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:getfield        #57  <Field int border>
	//   11   21:putfield        #57  <Field int border>
		useVariableBorders = rectangle1.useVariableBorders;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:getfield        #59  <Field boolean useVariableBorders>
	//   15   29:putfield        #59  <Field boolean useVariableBorders>
		borderWidth = rectangle1.borderWidth;
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:getfield        #62  <Field float borderWidth>
	//   19   37:putfield        #62  <Field float borderWidth>
		borderWidthLeft = rectangle1.borderWidthLeft;
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:getfield        #64  <Field float borderWidthLeft>
	//   23   45:putfield        #64  <Field float borderWidthLeft>
		borderWidthRight = rectangle1.borderWidthRight;
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:getfield        #66  <Field float borderWidthRight>
	//   27   53:putfield        #66  <Field float borderWidthRight>
		borderWidthTop = rectangle1.borderWidthTop;
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:getfield        #68  <Field float borderWidthTop>
	//   31   61:putfield        #68  <Field float borderWidthTop>
		borderWidthBottom = rectangle1.borderWidthBottom;
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:getfield        #70  <Field float borderWidthBottom>
	//   35   69:putfield        #70  <Field float borderWidthBottom>
		borderColor = rectangle1.borderColor;
	//   36   72:aload_0         
	//   37   73:aload_1         
	//   38   74:getfield        #72  <Field BaseColor borderColor>
	//   39   77:putfield        #72  <Field BaseColor borderColor>
		borderColorLeft = rectangle1.borderColorLeft;
	//   40   80:aload_0         
	//   41   81:aload_1         
	//   42   82:getfield        #74  <Field BaseColor borderColorLeft>
	//   43   85:putfield        #74  <Field BaseColor borderColorLeft>
		borderColorRight = rectangle1.borderColorRight;
	//   44   88:aload_0         
	//   45   89:aload_1         
	//   46   90:getfield        #76  <Field BaseColor borderColorRight>
	//   47   93:putfield        #76  <Field BaseColor borderColorRight>
		borderColorTop = rectangle1.borderColorTop;
	//   48   96:aload_0         
	//   49   97:aload_1         
	//   50   98:getfield        #78  <Field BaseColor borderColorTop>
	//   51  101:putfield        #78  <Field BaseColor borderColorTop>
		borderColorBottom = rectangle1.borderColorBottom;
	//   52  104:aload_0         
	//   53  105:aload_1         
	//   54  106:getfield        #80  <Field BaseColor borderColorBottom>
	//   55  109:putfield        #80  <Field BaseColor borderColorBottom>
	//   56  112:return          
	}

	public void disableBorderSide(int i)
	{
		if(border == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field int border>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          13
			border = 0;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #57  <Field int border>
		border = border & ~i;
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #57  <Field int border>
	//   10   18:iload_1         
	//   11   19:iconst_m1       
	//   12   20:ixor            
	//   13   21:iand            
	//   14   22:putfield        #57  <Field int border>
	//   15   25:return          
	}

	public void enableBorderSide(int i)
	{
		if(border == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field int border>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          13
			border = 0;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #57  <Field int border>
		border = border | i;
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #57  <Field int border>
	//   10   18:iload_1         
	//   11   19:ior             
	//   12   20:putfield        #57  <Field int border>
	//   13   23:return          
	}

	public boolean equals(Object obj)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = flag1;
	//    2    2:iload_3         
	//    3    3:istore_2        
		if(obj instanceof Rectangle)
	//*   4    4:aload_1         
	//*   5    5:instanceof      #2   <Class Rectangle>
	//*   6    8:ifeq            87
		{
			obj = ((Object) ((Rectangle)obj));
	//    7   11:aload_1         
	//    8   12:checkcast       #2   <Class Rectangle>
	//    9   15:astore_1        
			flag = flag1;
	//   10   16:iload_3         
	//   11   17:istore_2        
			if(((Rectangle) (obj)).llx == llx)
	//*  12   18:aload_1         
	//*  13   19:getfield        #82  <Field float llx>
	//*  14   22:aload_0         
	//*  15   23:getfield        #82  <Field float llx>
	//*  16   26:fcmpl           
	//*  17   27:ifne            87
			{
				flag = flag1;
	//   18   30:iload_3         
	//   19   31:istore_2        
				if(((Rectangle) (obj)).lly == lly)
	//*  20   32:aload_1         
	//*  21   33:getfield        #84  <Field float lly>
	//*  22   36:aload_0         
	//*  23   37:getfield        #84  <Field float lly>
	//*  24   40:fcmpl           
	//*  25   41:ifne            87
				{
					flag = flag1;
	//   26   44:iload_3         
	//   27   45:istore_2        
					if(((Rectangle) (obj)).urx == urx)
	//*  28   46:aload_1         
	//*  29   47:getfield        #86  <Field float urx>
	//*  30   50:aload_0         
	//*  31   51:getfield        #86  <Field float urx>
	//*  32   54:fcmpl           
	//*  33   55:ifne            87
					{
						flag = flag1;
	//   34   58:iload_3         
	//   35   59:istore_2        
						if(((Rectangle) (obj)).ury == ury)
	//*  36   60:aload_1         
	//*  37   61:getfield        #88  <Field float ury>
	//*  38   64:aload_0         
	//*  39   65:getfield        #88  <Field float ury>
	//*  40   68:fcmpl           
	//*  41   69:ifne            87
						{
							flag = flag1;
	//   42   72:iload_3         
	//   43   73:istore_2        
							if(((Rectangle) (obj)).rotation == rotation)
	//*  44   74:aload_1         
	//*  45   75:getfield        #53  <Field int rotation>
	//*  46   78:aload_0         
	//*  47   79:getfield        #53  <Field int rotation>
	//*  48   82:icmpne          87
								flag = true;
	//   49   85:iconst_1        
	//   50   86:istore_2        
						}
					}
				}
			}
		}
		return flag;
	//   51   87:iload_2         
	//   52   88:ireturn         
	}

	public BaseColor getBackgroundColor()
	{
		return backgroundColor;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field BaseColor backgroundColor>
	//    2    4:areturn         
	}

	public int getBorder()
	{
		return border;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int border>
	//    2    4:ireturn         
	}

	public BaseColor getBorderColor()
	{
		return borderColor;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field BaseColor borderColor>
	//    2    4:areturn         
	}

	public BaseColor getBorderColorBottom()
	{
		if(borderColorBottom == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field BaseColor borderColorBottom>
	//*   2    4:ifnonnull       12
			return borderColor;
	//    3    7:aload_0         
	//    4    8:getfield        #72  <Field BaseColor borderColor>
	//    5   11:areturn         
		else
			return borderColorBottom;
	//    6   12:aload_0         
	//    7   13:getfield        #80  <Field BaseColor borderColorBottom>
	//    8   16:areturn         
	}

	public BaseColor getBorderColorLeft()
	{
		if(borderColorLeft == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field BaseColor borderColorLeft>
	//*   2    4:ifnonnull       12
			return borderColor;
	//    3    7:aload_0         
	//    4    8:getfield        #72  <Field BaseColor borderColor>
	//    5   11:areturn         
		else
			return borderColorLeft;
	//    6   12:aload_0         
	//    7   13:getfield        #74  <Field BaseColor borderColorLeft>
	//    8   16:areturn         
	}

	public BaseColor getBorderColorRight()
	{
		if(borderColorRight == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field BaseColor borderColorRight>
	//*   2    4:ifnonnull       12
			return borderColor;
	//    3    7:aload_0         
	//    4    8:getfield        #72  <Field BaseColor borderColor>
	//    5   11:areturn         
		else
			return borderColorRight;
	//    6   12:aload_0         
	//    7   13:getfield        #76  <Field BaseColor borderColorRight>
	//    8   16:areturn         
	}

	public BaseColor getBorderColorTop()
	{
		if(borderColorTop == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field BaseColor borderColorTop>
	//*   2    4:ifnonnull       12
			return borderColor;
	//    3    7:aload_0         
	//    4    8:getfield        #72  <Field BaseColor borderColor>
	//    5   11:areturn         
		else
			return borderColorTop;
	//    6   12:aload_0         
	//    7   13:getfield        #78  <Field BaseColor borderColorTop>
	//    8   16:areturn         
	}

	public float getBorderWidth()
	{
		return borderWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field float borderWidth>
	//    2    4:freturn         
	}

	public float getBorderWidthBottom()
	{
		return getVariableBorderWidth(borderWidthBottom, 2);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #70  <Field float borderWidthBottom>
	//    3    5:iconst_2        
	//    4    6:invokespecial   #142 <Method float getVariableBorderWidth(float, int)>
	//    5    9:freturn         
	}

	public float getBorderWidthLeft()
	{
		return getVariableBorderWidth(borderWidthLeft, 4);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #64  <Field float borderWidthLeft>
	//    3    5:iconst_4        
	//    4    6:invokespecial   #142 <Method float getVariableBorderWidth(float, int)>
	//    5    9:freturn         
	}

	public float getBorderWidthRight()
	{
		return getVariableBorderWidth(borderWidthRight, 8);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #66  <Field float borderWidthRight>
	//    3    5:bipush          8
	//    4    7:invokespecial   #142 <Method float getVariableBorderWidth(float, int)>
	//    5   10:freturn         
	}

	public float getBorderWidthTop()
	{
		return getVariableBorderWidth(borderWidthTop, 1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #68  <Field float borderWidthTop>
	//    3    5:iconst_1        
	//    4    6:invokespecial   #142 <Method float getVariableBorderWidth(float, int)>
	//    5    9:freturn         
	}

	public float getBottom()
	{
		return lly;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field float lly>
	//    2    4:freturn         
	}

	public float getBottom(float f)
	{
		return lly + f;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field float lly>
	//    2    4:fload_1         
	//    3    5:fadd            
	//    4    6:freturn         
	}

	public List getChunks()
	{
		return ((List) (new ArrayList()));
	//    0    0:new             #151 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #152 <Method void ArrayList()>
	//    3    7:areturn         
	}

	public float getGrayFill()
	{
		if(backgroundColor instanceof GrayColor)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field BaseColor backgroundColor>
	//*   2    4:instanceof      #157 <Class GrayColor>
	//*   3    7:ifeq            21
			return ((GrayColor)backgroundColor).getGray();
	//    4   10:aload_0         
	//    5   11:getfield        #55  <Field BaseColor backgroundColor>
	//    6   14:checkcast       #157 <Class GrayColor>
	//    7   17:invokevirtual   #160 <Method float GrayColor.getGray()>
	//    8   20:freturn         
		else
			return 0.0F;
	//    9   21:fconst_0        
	//   10   22:freturn         
	}

	public float getHeight()
	{
		return ury - lly;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field float ury>
	//    2    4:aload_0         
	//    3    5:getfield        #84  <Field float lly>
	//    4    8:fsub            
	//    5    9:freturn         
	}

	public float getLeft()
	{
		return llx;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field float llx>
	//    2    4:freturn         
	}

	public float getLeft(float f)
	{
		return llx + f;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field float llx>
	//    2    4:fload_1         
	//    3    5:fadd            
	//    4    6:freturn         
	}

	public float getRight()
	{
		return urx;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field float urx>
	//    2    4:freturn         
	}

	public float getRight(float f)
	{
		return urx - f;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field float urx>
	//    2    4:fload_1         
	//    3    5:fsub            
	//    4    6:freturn         
	}

	public int getRotation()
	{
		return rotation;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int rotation>
	//    2    4:ireturn         
	}

	public float getTop()
	{
		return ury;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field float ury>
	//    2    4:freturn         
	}

	public float getTop(float f)
	{
		return ury - f;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field float ury>
	//    2    4:fload_1         
	//    3    5:fsub            
	//    4    6:freturn         
	}

	public float getWidth()
	{
		return urx - llx;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field float urx>
	//    2    4:aload_0         
	//    3    5:getfield        #82  <Field float llx>
	//    4    8:fsub            
	//    5    9:freturn         
	}

	public boolean hasBorder(int i)
	{
		while(border == -1 || (border & i) != i) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field int border>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          10
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
	//    6   10:aload_0         
	//    7   11:getfield        #57  <Field int border>
	//    8   14:iload_1         
	//    9   15:iand            
	//   10   16:iload_1         
	//   11   17:icmpne          8
		return true;
	//   12   20:iconst_1        
	//   13   21:ireturn         
	}

	public boolean hasBorders()
	{
		boolean flag;
label0:
		{
			boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
			flag = flag1;
	//    2    2:iload_2         
	//    3    3:istore_1        
			switch(border)
	//*   4    4:aload_0         
	//*   5    5:getfield        #57  <Field int border>
			{
	//*   6    8:tableswitch     -1 0: default 32
	//	               -1 81
	//	               0 81
			default:
				if(borderWidth <= 0.0F && borderWidthLeft <= 0.0F && borderWidthRight <= 0.0F && borderWidthTop <= 0.0F)
	//*   7   32:aload_0         
	//*   8   33:getfield        #62  <Field float borderWidth>
	//*   9   36:fconst_0        
	//*  10   37:fcmpl           
	//*  11   38:ifgt            79
	//*  12   41:aload_0         
	//*  13   42:getfield        #64  <Field float borderWidthLeft>
	//*  14   45:fconst_0        
	//*  15   46:fcmpl           
	//*  16   47:ifgt            79
	//*  17   50:aload_0         
	//*  18   51:getfield        #66  <Field float borderWidthRight>
	//*  19   54:fconst_0        
	//*  20   55:fcmpl           
	//*  21   56:ifgt            79
	//*  22   59:aload_0         
	//*  23   60:getfield        #68  <Field float borderWidthTop>
	//*  24   63:fconst_0        
	//*  25   64:fcmpl           
	//*  26   65:ifgt            79
				{
					flag = flag1;
	//   27   68:iload_2         
	//   28   69:istore_1        
					if(borderWidthBottom <= 0.0F)
						break label0;
	//   29   70:aload_0         
	//   30   71:getfield        #70  <Field float borderWidthBottom>
	//   31   74:fconst_0        
	//   32   75:fcmpl           
	//   33   76:ifle            81
				}
				flag = true;
	//   34   79:iconst_1        
	//   35   80:istore_1        
				break;

			case -1: 
			case 0: // '\0'
				break;
			}
		}
		return flag;
	//   36   81:iload_1         
	//   37   82:ireturn         
	}

	public boolean isContent()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isNestable()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isUseVariableBorders()
	{
		return useVariableBorders;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field boolean useVariableBorders>
	//    2    4:ireturn         
	}

	public void normalize()
	{
		if(llx > urx)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field float llx>
	//*   2    4:aload_0         
	//*   3    5:getfield        #86  <Field float urx>
	//*   4    8:fcmpl           
	//*   5    9:ifle            30
		{
			float f = llx;
	//    6   12:aload_0         
	//    7   13:getfield        #82  <Field float llx>
	//    8   16:fstore_1        
			llx = urx;
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #86  <Field float urx>
	//   12   22:putfield        #82  <Field float llx>
			urx = f;
	//   13   25:aload_0         
	//   14   26:fload_1         
	//   15   27:putfield        #86  <Field float urx>
		}
		if(lly > ury)
	//*  16   30:aload_0         
	//*  17   31:getfield        #84  <Field float lly>
	//*  18   34:aload_0         
	//*  19   35:getfield        #88  <Field float ury>
	//*  20   38:fcmpl           
	//*  21   39:ifle            60
		{
			float f1 = lly;
	//   22   42:aload_0         
	//   23   43:getfield        #84  <Field float lly>
	//   24   46:fstore_1        
			lly = ury;
	//   25   47:aload_0         
	//   26   48:aload_0         
	//   27   49:getfield        #88  <Field float ury>
	//   28   52:putfield        #84  <Field float lly>
			ury = f1;
	//   29   55:aload_0         
	//   30   56:fload_1         
	//   31   57:putfield        #88  <Field float ury>
		}
	//   32   60:return          
	}

	public boolean process(ElementListener elementlistener)
	{
		boolean flag;
		try
		{
			flag = elementlistener.add(((Element) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #182 <Method boolean ElementListener.add(Element)>
	//    3    7:istore_2        
		}
	//*   4    8:iload_2         
	//*   5    9:ireturn         
		// Misplaced declaration of an exception variable
		catch(ElementListener elementlistener)
	//*   6   10:astore_1        
		{
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		}
		return flag;
	}

	public Rectangle rectangle(float f, float f1)
	{
		Rectangle rectangle1 = new Rectangle(this);
	//    0    0:new             #2   <Class Rectangle>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #186 <Method void Rectangle(Rectangle)>
	//    4    8:astore_3        
		if(getTop() > f)
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #188 <Method float getTop()>
	//*   7   13:fload_1         
	//*   8   14:fcmpl           
	//*   9   15:ifle            28
		{
			rectangle1.setTop(f);
	//   10   18:aload_3         
	//   11   19:fload_1         
	//   12   20:invokevirtual   #192 <Method void setTop(float)>
			rectangle1.disableBorderSide(1);
	//   13   23:aload_3         
	//   14   24:iconst_1        
	//   15   25:invokevirtual   #126 <Method void disableBorderSide(int)>
		}
		if(getBottom() < f1)
	//*  16   28:aload_0         
	//*  17   29:invokevirtual   #194 <Method float getBottom()>
	//*  18   32:fload_2         
	//*  19   33:fcmpg           
	//*  20   34:ifge            47
		{
			rectangle1.setBottom(f1);
	//   21   37:aload_3         
	//   22   38:fload_2         
	//   23   39:invokevirtual   #197 <Method void setBottom(float)>
			rectangle1.disableBorderSide(2);
	//   24   42:aload_3         
	//   25   43:iconst_2        
	//   26   44:invokevirtual   #126 <Method void disableBorderSide(int)>
		}
		return rectangle1;
	//   27   47:aload_3         
	//   28   48:areturn         
	}

	public Rectangle rotate()
	{
		Rectangle rectangle1 = new Rectangle(lly, llx, ury, urx);
	//    0    0:new             #2   <Class Rectangle>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #84  <Field float lly>
	//    4    8:aload_0         
	//    5    9:getfield        #82  <Field float llx>
	//    6   12:aload_0         
	//    7   13:getfield        #88  <Field float ury>
	//    8   16:aload_0         
	//    9   17:getfield        #86  <Field float urx>
	//   10   20:invokespecial   #47  <Method void Rectangle(float, float, float, float)>
	//   11   23:astore_1        
		rectangle1.setRotation(rotation + 90);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #53  <Field int rotation>
	//   15   29:bipush          90
	//   16   31:iadd            
	//   17   32:invokevirtual   #93  <Method void setRotation(int)>
		return rectangle1;
	//   18   35:aload_1         
	//   19   36:areturn         
	}

	public void setBackgroundColor(BaseColor basecolor)
	{
		backgroundColor = basecolor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field BaseColor backgroundColor>
	//    3    5:return          
	}

	public void setBorder(int i)
	{
		border = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #57  <Field int border>
	//    3    5:return          
	}

	public void setBorderColor(BaseColor basecolor)
	{
		borderColor = basecolor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #72  <Field BaseColor borderColor>
	//    3    5:return          
	}

	public void setBorderColorBottom(BaseColor basecolor)
	{
		borderColorBottom = basecolor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #80  <Field BaseColor borderColorBottom>
	//    3    5:return          
	}

	public void setBorderColorLeft(BaseColor basecolor)
	{
		borderColorLeft = basecolor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #74  <Field BaseColor borderColorLeft>
	//    3    5:return          
	}

	public void setBorderColorRight(BaseColor basecolor)
	{
		borderColorRight = basecolor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #76  <Field BaseColor borderColorRight>
	//    3    5:return          
	}

	public void setBorderColorTop(BaseColor basecolor)
	{
		borderColorTop = basecolor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #78  <Field BaseColor borderColorTop>
	//    3    5:return          
	}

	public void setBorderWidth(float f)
	{
		borderWidth = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #62  <Field float borderWidth>
	//    3    5:return          
	}

	public void setBorderWidthBottom(float f)
	{
		borderWidthBottom = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #70  <Field float borderWidthBottom>
		updateBorderBasedOnWidth(f, 2);
	//    3    5:aload_0         
	//    4    6:fload_1         
	//    5    7:iconst_2        
	//    6    8:invokespecial   #211 <Method void updateBorderBasedOnWidth(float, int)>
	//    7   11:return          
	}

	public void setBorderWidthLeft(float f)
	{
		borderWidthLeft = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #64  <Field float borderWidthLeft>
		updateBorderBasedOnWidth(f, 4);
	//    3    5:aload_0         
	//    4    6:fload_1         
	//    5    7:iconst_4        
	//    6    8:invokespecial   #211 <Method void updateBorderBasedOnWidth(float, int)>
	//    7   11:return          
	}

	public void setBorderWidthRight(float f)
	{
		borderWidthRight = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #66  <Field float borderWidthRight>
		updateBorderBasedOnWidth(f, 8);
	//    3    5:aload_0         
	//    4    6:fload_1         
	//    5    7:bipush          8
	//    6    9:invokespecial   #211 <Method void updateBorderBasedOnWidth(float, int)>
	//    7   12:return          
	}

	public void setBorderWidthTop(float f)
	{
		borderWidthTop = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #68  <Field float borderWidthTop>
		updateBorderBasedOnWidth(f, 1);
	//    3    5:aload_0         
	//    4    6:fload_1         
	//    5    7:iconst_1        
	//    6    8:invokespecial   #211 <Method void updateBorderBasedOnWidth(float, int)>
	//    7   11:return          
	}

	public void setBottom(float f)
	{
		lly = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #84  <Field float lly>
	//    3    5:return          
	}

	public void setGrayFill(float f)
	{
		backgroundColor = ((BaseColor) (new GrayColor(f)));
	//    0    0:aload_0         
	//    1    1:new             #157 <Class GrayColor>
	//    2    4:dup             
	//    3    5:fload_1         
	//    4    6:invokespecial   #217 <Method void GrayColor(float)>
	//    5    9:putfield        #55  <Field BaseColor backgroundColor>
	//    6   12:return          
	}

	public void setLeft(float f)
	{
		llx = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #82  <Field float llx>
	//    3    5:return          
	}

	public void setRight(float f)
	{
		urx = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #86  <Field float urx>
	//    3    5:return          
	}

	public void setRotation(int i)
	{
		rotation = i % 360;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:sipush          360
	//    3    5:irem            
	//    4    6:putfield        #53  <Field int rotation>
		switch(rotation)
	//*   5    9:aload_0         
	//*   6   10:getfield        #53  <Field int rotation>
		{
	//*   7   13:lookupswitch    3: default 48
	//	               90: 53
	//	               180: 53
	//	               270: 53
		default:
			rotation = 0;
	//    8   48:aload_0         
	//    9   49:iconst_0        
	//   10   50:putfield        #53  <Field int rotation>
			// fall through

		case 90: // 'Z'
		case 180: 
		case 270: 
			return;
	//   11   53:return          
		}
	}

	public void setTop(float f)
	{
		ury = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #88  <Field float ury>
	//    3    5:return          
	}

	public void setUseVariableBorders(boolean flag)
	{
		useVariableBorders = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #59  <Field boolean useVariableBorders>
	//    3    5:return          
	}

	public void softCloneNonPositionParameters(Rectangle rectangle1)
	{
		if(rectangle1.rotation != 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #53  <Field int rotation>
	//*   2    4:ifeq            15
			rotation = rectangle1.rotation;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:getfield        #53  <Field int rotation>
	//    6   12:putfield        #53  <Field int rotation>
		if(rectangle1.backgroundColor != null)
	//*   7   15:aload_1         
	//*   8   16:getfield        #55  <Field BaseColor backgroundColor>
	//*   9   19:ifnull          30
			backgroundColor = rectangle1.backgroundColor;
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:getfield        #55  <Field BaseColor backgroundColor>
	//   13   27:putfield        #55  <Field BaseColor backgroundColor>
		if(rectangle1.border != -1)
	//*  14   30:aload_1         
	//*  15   31:getfield        #57  <Field int border>
	//*  16   34:iconst_m1       
	//*  17   35:icmpeq          46
			border = rectangle1.border;
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:getfield        #57  <Field int border>
	//   21   43:putfield        #57  <Field int border>
		if(useVariableBorders)
	//*  22   46:aload_0         
	//*  23   47:getfield        #59  <Field boolean useVariableBorders>
	//*  24   50:ifeq            61
			useVariableBorders = rectangle1.useVariableBorders;
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:getfield        #59  <Field boolean useVariableBorders>
	//   28   58:putfield        #59  <Field boolean useVariableBorders>
		if(rectangle1.borderWidth != -1F)
	//*  29   61:aload_1         
	//*  30   62:getfield        #62  <Field float borderWidth>
	//*  31   65:ldc1            #60  <Float -1F>
	//*  32   67:fcmpl           
	//*  33   68:ifeq            79
			borderWidth = rectangle1.borderWidth;
	//   34   71:aload_0         
	//   35   72:aload_1         
	//   36   73:getfield        #62  <Field float borderWidth>
	//   37   76:putfield        #62  <Field float borderWidth>
		if(rectangle1.borderWidthLeft != -1F)
	//*  38   79:aload_1         
	//*  39   80:getfield        #64  <Field float borderWidthLeft>
	//*  40   83:ldc1            #60  <Float -1F>
	//*  41   85:fcmpl           
	//*  42   86:ifeq            97
			borderWidthLeft = rectangle1.borderWidthLeft;
	//   43   89:aload_0         
	//   44   90:aload_1         
	//   45   91:getfield        #64  <Field float borderWidthLeft>
	//   46   94:putfield        #64  <Field float borderWidthLeft>
		if(rectangle1.borderWidthRight != -1F)
	//*  47   97:aload_1         
	//*  48   98:getfield        #66  <Field float borderWidthRight>
	//*  49  101:ldc1            #60  <Float -1F>
	//*  50  103:fcmpl           
	//*  51  104:ifeq            115
			borderWidthRight = rectangle1.borderWidthRight;
	//   52  107:aload_0         
	//   53  108:aload_1         
	//   54  109:getfield        #66  <Field float borderWidthRight>
	//   55  112:putfield        #66  <Field float borderWidthRight>
		if(rectangle1.borderWidthTop != -1F)
	//*  56  115:aload_1         
	//*  57  116:getfield        #68  <Field float borderWidthTop>
	//*  58  119:ldc1            #60  <Float -1F>
	//*  59  121:fcmpl           
	//*  60  122:ifeq            133
			borderWidthTop = rectangle1.borderWidthTop;
	//   61  125:aload_0         
	//   62  126:aload_1         
	//   63  127:getfield        #68  <Field float borderWidthTop>
	//   64  130:putfield        #68  <Field float borderWidthTop>
		if(rectangle1.borderWidthBottom != -1F)
	//*  65  133:aload_1         
	//*  66  134:getfield        #70  <Field float borderWidthBottom>
	//*  67  137:ldc1            #60  <Float -1F>
	//*  68  139:fcmpl           
	//*  69  140:ifeq            151
			borderWidthBottom = rectangle1.borderWidthBottom;
	//   70  143:aload_0         
	//   71  144:aload_1         
	//   72  145:getfield        #70  <Field float borderWidthBottom>
	//   73  148:putfield        #70  <Field float borderWidthBottom>
		if(rectangle1.borderColor != null)
	//*  74  151:aload_1         
	//*  75  152:getfield        #72  <Field BaseColor borderColor>
	//*  76  155:ifnull          166
			borderColor = rectangle1.borderColor;
	//   77  158:aload_0         
	//   78  159:aload_1         
	//   79  160:getfield        #72  <Field BaseColor borderColor>
	//   80  163:putfield        #72  <Field BaseColor borderColor>
		if(rectangle1.borderColorLeft != null)
	//*  81  166:aload_1         
	//*  82  167:getfield        #74  <Field BaseColor borderColorLeft>
	//*  83  170:ifnull          181
			borderColorLeft = rectangle1.borderColorLeft;
	//   84  173:aload_0         
	//   85  174:aload_1         
	//   86  175:getfield        #74  <Field BaseColor borderColorLeft>
	//   87  178:putfield        #74  <Field BaseColor borderColorLeft>
		if(rectangle1.borderColorRight != null)
	//*  88  181:aload_1         
	//*  89  182:getfield        #76  <Field BaseColor borderColorRight>
	//*  90  185:ifnull          196
			borderColorRight = rectangle1.borderColorRight;
	//   91  188:aload_0         
	//   92  189:aload_1         
	//   93  190:getfield        #76  <Field BaseColor borderColorRight>
	//   94  193:putfield        #76  <Field BaseColor borderColorRight>
		if(rectangle1.borderColorTop != null)
	//*  95  196:aload_1         
	//*  96  197:getfield        #78  <Field BaseColor borderColorTop>
	//*  97  200:ifnull          211
			borderColorTop = rectangle1.borderColorTop;
	//   98  203:aload_0         
	//   99  204:aload_1         
	//  100  205:getfield        #78  <Field BaseColor borderColorTop>
	//  101  208:putfield        #78  <Field BaseColor borderColorTop>
		if(rectangle1.borderColorBottom != null)
	//* 102  211:aload_1         
	//* 103  212:getfield        #80  <Field BaseColor borderColorBottom>
	//* 104  215:ifnull          226
			borderColorBottom = rectangle1.borderColorBottom;
	//  105  218:aload_0         
	//  106  219:aload_1         
	//  107  220:getfield        #80  <Field BaseColor borderColorBottom>
	//  108  223:putfield        #80  <Field BaseColor borderColorBottom>
	//  109  226:return          
	}

	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer("Rectangle: ");
	//    0    0:new             #226 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:ldc1            #228 <String "Rectangle: ">
	//    3    6:invokespecial   #231 <Method void StringBuffer(String)>
	//    4    9:astore_1        
		stringbuffer.append(getWidth());
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:invokevirtual   #233 <Method float getWidth()>
	//    8   15:invokevirtual   #237 <Method StringBuffer StringBuffer.append(float)>
	//    9   18:pop             
		stringbuffer.append('x');
	//   10   19:aload_1         
	//   11   20:bipush          120
	//   12   22:invokevirtual   #240 <Method StringBuffer StringBuffer.append(char)>
	//   13   25:pop             
		stringbuffer.append(getHeight());
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:invokevirtual   #242 <Method float getHeight()>
	//   17   31:invokevirtual   #237 <Method StringBuffer StringBuffer.append(float)>
	//   18   34:pop             
		stringbuffer.append(" (rot: ");
	//   19   35:aload_1         
	//   20   36:ldc1            #244 <String " (rot: ">
	//   21   38:invokevirtual   #247 <Method StringBuffer StringBuffer.append(String)>
	//   22   41:pop             
		stringbuffer.append(rotation);
	//   23   42:aload_1         
	//   24   43:aload_0         
	//   25   44:getfield        #53  <Field int rotation>
	//   26   47:invokevirtual   #250 <Method StringBuffer StringBuffer.append(int)>
	//   27   50:pop             
		stringbuffer.append(" degrees)");
	//   28   51:aload_1         
	//   29   52:ldc1            #252 <String " degrees)">
	//   30   54:invokevirtual   #247 <Method StringBuffer StringBuffer.append(String)>
	//   31   57:pop             
		return stringbuffer.toString();
	//   32   58:aload_1         
	//   33   59:invokevirtual   #254 <Method String StringBuffer.toString()>
	//   34   62:areturn         
	}

	public int type()
	{
		return 30;
	//    0    0:bipush          30
	//    1    2:ireturn         
	}

	public static final int BOTTOM = 2;
	public static final int BOX = 15;
	public static final int LEFT = 4;
	public static final int NO_BORDER = 0;
	public static final int RIGHT = 8;
	public static final int TOP = 1;
	public static final int UNDEFINED = -1;
	protected BaseColor backgroundColor;
	protected int border;
	protected BaseColor borderColor;
	protected BaseColor borderColorBottom;
	protected BaseColor borderColorLeft;
	protected BaseColor borderColorRight;
	protected BaseColor borderColorTop;
	protected float borderWidth;
	protected float borderWidthBottom;
	protected float borderWidthLeft;
	protected float borderWidthRight;
	protected float borderWidthTop;
	protected float llx;
	protected float lly;
	protected int rotation;
	protected float urx;
	protected float ury;
	protected boolean useVariableBorders;
}
