// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec.wmf;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.pdf.PdfContentByte;
import java.util.ArrayList;
import java.util.Stack;

// Referenced classes of package com.itextpdf.text.pdf.codec.wmf:
//			Point, MetaPen, MetaBrush, MetaFont, 
//			MetaObject

public class MetaState
{

	public MetaState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void Object()>
		currentBackgroundColor = BaseColor.WHITE;
	//    2    4:aload_0         
	//    3    5:getstatic       #60  <Field BaseColor BaseColor.WHITE>
	//    4    8:putfield        #62  <Field BaseColor currentBackgroundColor>
		currentTextColor = BaseColor.BLACK;
	//    5   11:aload_0         
	//    6   12:getstatic       #65  <Field BaseColor BaseColor.BLACK>
	//    7   15:putfield        #67  <Field BaseColor currentTextColor>
		backgroundMode = 2;
	//    8   18:aload_0         
	//    9   19:iconst_2        
	//   10   20:putfield        #69  <Field int backgroundMode>
		polyFillMode = 1;
	//   11   23:aload_0         
	//   12   24:iconst_1        
	//   13   25:putfield        #71  <Field int polyFillMode>
		lineJoin = 1;
	//   14   28:aload_0         
	//   15   29:iconst_1        
	//   16   30:putfield        #73  <Field int lineJoin>
		savedStates = new Stack();
	//   17   33:aload_0         
	//   18   34:new             #75  <Class Stack>
	//   19   37:dup             
	//   20   38:invokespecial   #76  <Method void Stack()>
	//   21   41:putfield        #78  <Field Stack savedStates>
		MetaObjects = new ArrayList();
	//   22   44:aload_0         
	//   23   45:new             #80  <Class ArrayList>
	//   24   48:dup             
	//   25   49:invokespecial   #81  <Method void ArrayList()>
	//   26   52:putfield        #83  <Field ArrayList MetaObjects>
		currentPoint = new Point(0, 0);
	//   27   55:aload_0         
	//   28   56:new             #85  <Class Point>
	//   29   59:dup             
	//   30   60:iconst_0        
	//   31   61:iconst_0        
	//   32   62:invokespecial   #88  <Method void Point(int, int)>
	//   33   65:putfield        #90  <Field Point currentPoint>
		currentPen = new MetaPen();
	//   34   68:aload_0         
	//   35   69:new             #92  <Class MetaPen>
	//   36   72:dup             
	//   37   73:invokespecial   #93  <Method void MetaPen()>
	//   38   76:putfield        #95  <Field MetaPen currentPen>
		currentBrush = new MetaBrush();
	//   39   79:aload_0         
	//   40   80:new             #97  <Class MetaBrush>
	//   41   83:dup             
	//   42   84:invokespecial   #98  <Method void MetaBrush()>
	//   43   87:putfield        #100 <Field MetaBrush currentBrush>
		currentFont = new MetaFont();
	//   44   90:aload_0         
	//   45   91:new             #102 <Class MetaFont>
	//   46   94:dup             
	//   47   95:invokespecial   #103 <Method void MetaFont()>
	//   48   98:putfield        #105 <Field MetaFont currentFont>
	//   49  101:return          
	}

	public MetaState(MetaState metastate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void Object()>
		currentBackgroundColor = BaseColor.WHITE;
	//    2    4:aload_0         
	//    3    5:getstatic       #60  <Field BaseColor BaseColor.WHITE>
	//    4    8:putfield        #62  <Field BaseColor currentBackgroundColor>
		currentTextColor = BaseColor.BLACK;
	//    5   11:aload_0         
	//    6   12:getstatic       #65  <Field BaseColor BaseColor.BLACK>
	//    7   15:putfield        #67  <Field BaseColor currentTextColor>
		backgroundMode = 2;
	//    8   18:aload_0         
	//    9   19:iconst_2        
	//   10   20:putfield        #69  <Field int backgroundMode>
		polyFillMode = 1;
	//   11   23:aload_0         
	//   12   24:iconst_1        
	//   13   25:putfield        #71  <Field int polyFillMode>
		lineJoin = 1;
	//   14   28:aload_0         
	//   15   29:iconst_1        
	//   16   30:putfield        #73  <Field int lineJoin>
		setMetaState(metastate);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #110 <Method void setMetaState(MetaState)>
	//   20   38:return          
	}

	public void addMetaObject(MetaObject metaobject)
	{
		for(int i = 0; i < MetaObjects.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #83  <Field ArrayList MetaObjects>
	//*   5    7:invokevirtual   #116 <Method int ArrayList.size()>
	//*   6   10:icmpge          42
			if(MetaObjects.get(i) == null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #83  <Field ArrayList MetaObjects>
	//*   9   17:iload_2         
	//*  10   18:invokevirtual   #120 <Method Object ArrayList.get(int)>
	//*  11   21:ifnonnull       35
			{
				MetaObjects.set(i, ((Object) (metaobject)));
	//   12   24:aload_0         
	//   13   25:getfield        #83  <Field ArrayList MetaObjects>
	//   14   28:iload_2         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #124 <Method Object ArrayList.set(int, Object)>
	//   17   33:pop             
				return;
	//   18   34:return          
			}

	//   19   35:iload_2         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_2        
	//*  23   39:goto            2
		MetaObjects.add(((Object) (metaobject)));
	//   24   42:aload_0         
	//   25   43:getfield        #83  <Field ArrayList MetaObjects>
	//   26   46:aload_1         
	//   27   47:invokevirtual   #128 <Method boolean ArrayList.add(Object)>
	//   28   50:pop             
	//   29   51:return          
	}

	public void cleanup(PdfContentByte pdfcontentbyte)
	{
		for(int i = savedStates.size(); i > 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field Stack savedStates>
	//*   2    4:invokevirtual   #131 <Method int Stack.size()>
	//*   3    7:istore_2        
	//*   4    8:iload_2         
	//*   5    9:ifle            23
			pdfcontentbyte.restoreState();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #136 <Method void PdfContentByte.restoreState()>

	//    8   16:iload_2         
	//    9   17:iconst_1        
	//   10   18:isub            
	//   11   19:istore_2        
	//*  12   20:goto            8
	//   13   23:return          
	}

	public void deleteMetaObject(int i)
	{
		MetaObjects.set(i, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field ArrayList MetaObjects>
	//    2    4:iload_1         
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #124 <Method Object ArrayList.set(int, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public int getBackgroundMode()
	{
		return backgroundMode;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int backgroundMode>
	//    2    4:ireturn         
	}

	public BaseColor getCurrentBackgroundColor()
	{
		return currentBackgroundColor;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field BaseColor currentBackgroundColor>
	//    2    4:areturn         
	}

	public MetaBrush getCurrentBrush()
	{
		return currentBrush;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field MetaBrush currentBrush>
	//    2    4:areturn         
	}

	public MetaFont getCurrentFont()
	{
		return currentFont;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field MetaFont currentFont>
	//    2    4:areturn         
	}

	public MetaPen getCurrentPen()
	{
		return currentPen;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field MetaPen currentPen>
	//    2    4:areturn         
	}

	public Point getCurrentPoint()
	{
		return currentPoint;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field Point currentPoint>
	//    2    4:areturn         
	}

	public BaseColor getCurrentTextColor()
	{
		return currentTextColor;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field BaseColor currentTextColor>
	//    2    4:areturn         
	}

	public boolean getLineNeutral()
	{
		return lineJoin == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field int lineJoin>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public int getPolyFillMode()
	{
		return polyFillMode;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int polyFillMode>
	//    2    4:ireturn         
	}

	public int getTextAlign()
	{
		return textAlign;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field int textAlign>
	//    2    4:ireturn         
	}

	public void restoreState(int i, PdfContentByte pdfcontentbyte)
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            22
			i = Math.min(-i, savedStates.size());
	//    2    4:iload_1         
	//    3    5:ineg            
	//    4    6:aload_0         
	//    5    7:getfield        #78  <Field Stack savedStates>
	//    6   10:invokevirtual   #131 <Method int Stack.size()>
	//    7   13:invokestatic    #163 <Method int Math.min(int, int)>
	//    8   16:istore_1        
		else
	//*   9   17:iload_1         
	//*  10   18:ifne            39
	//*  11   21:return          
			i = Math.max(savedStates.size() - i, 0);
	//   12   22:aload_0         
	//   13   23:getfield        #78  <Field Stack savedStates>
	//   14   26:invokevirtual   #131 <Method int Stack.size()>
	//   15   29:iload_1         
	//   16   30:isub            
	//   17   31:iconst_0        
	//   18   32:invokestatic    #166 <Method int Math.max(int, int)>
	//   19   35:istore_1        
		if(i == 0)
			return;
	//*  20   36:goto            17
		MetaState metastate = null;
	//   21   39:aconst_null     
	//   22   40:astore_3        
		for(; i != 0; i--)
	//*  23   41:iload_1         
	//*  24   42:ifeq            67
		{
			pdfcontentbyte.restoreState();
	//   25   45:aload_2         
	//   26   46:invokevirtual   #136 <Method void PdfContentByte.restoreState()>
			metastate = (MetaState)savedStates.pop();
	//   27   49:aload_0         
	//   28   50:getfield        #78  <Field Stack savedStates>
	//   29   53:invokevirtual   #170 <Method Object Stack.pop()>
	//   30   56:checkcast       #2   <Class MetaState>
	//   31   59:astore_3        
		}

	//   32   60:iload_1         
	//   33   61:iconst_1        
	//   34   62:isub            
	//   35   63:istore_1        
	//*  36   64:goto            41
		setMetaState(metastate);
	//   37   67:aload_0         
	//   38   68:aload_3         
	//   39   69:invokevirtual   #110 <Method void setMetaState(MetaState)>
	//   40   72:return          
	}

	public void saveState(PdfContentByte pdfcontentbyte)
	{
		pdfcontentbyte.saveState();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #173 <Method void PdfContentByte.saveState()>
		pdfcontentbyte = ((PdfContentByte) (new MetaState(this)));
	//    2    4:new             #2   <Class MetaState>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #175 <Method void MetaState(MetaState)>
	//    6   12:astore_1        
		savedStates.push(((Object) (pdfcontentbyte)));
	//    7   13:aload_0         
	//    8   14:getfield        #78  <Field Stack savedStates>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #179 <Method Object Stack.push(Object)>
	//   11   21:pop             
	//   12   22:return          
	}

	public void selectMetaObject(int i, PdfContentByte pdfcontentbyte)
	{
		MetaObject metaobject = (MetaObject)MetaObjects.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field ArrayList MetaObjects>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #120 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #182 <Class MetaObject>
	//    5   11:astore_3        
		if(metaobject != null) goto _L2; else goto _L1
	//    6   12:aload_3         
	//    7   13:ifnonnull       17
_L1:
		return;
	//    8   16:return          
_L2:
		switch(metaobject.getType())
	//*   9   17:aload_3         
	//*  10   18:invokevirtual   #185 <Method int MetaObject.getType()>
		{
	//*  11   21:tableswitch     1 3: default 48
	//	               1 49
	//	               2 146
	//	               3 224
		default:
			return;
	//   12   48:return          

		case 1: // '\001'
			currentPen = (MetaPen)metaobject;
	//   13   49:aload_0         
	//   14   50:aload_3         
	//   15   51:checkcast       #92  <Class MetaPen>
	//   16   54:putfield        #95  <Field MetaPen currentPen>
			i = currentPen.getStyle();
	//   17   57:aload_0         
	//   18   58:getfield        #95  <Field MetaPen currentPen>
	//   19   61:invokevirtual   #188 <Method int MetaPen.getStyle()>
	//   20   64:istore_1        
			if(i != 5)
	//*  21   65:iload_1         
	//*  22   66:iconst_5        
	//*  23   67:icmpeq          16
			{
				pdfcontentbyte.setColorStroke(currentPen.getColor());
	//   24   70:aload_2         
	//   25   71:aload_0         
	//   26   72:getfield        #95  <Field MetaPen currentPen>
	//   27   75:invokevirtual   #191 <Method BaseColor MetaPen.getColor()>
	//   28   78:invokevirtual   #195 <Method void PdfContentByte.setColorStroke(BaseColor)>
				pdfcontentbyte.setLineWidth(Math.abs(((float)currentPen.getPenWidth() * scalingX) / (float)extentWx));
	//   29   81:aload_2         
	//   30   82:aload_0         
	//   31   83:getfield        #95  <Field MetaPen currentPen>
	//   32   86:invokevirtual   #198 <Method int MetaPen.getPenWidth()>
	//   33   89:i2f             
	//   34   90:aload_0         
	//   35   91:getfield        #200 <Field float scalingX>
	//   36   94:fmul            
	//   37   95:aload_0         
	//   38   96:getfield        #202 <Field int extentWx>
	//   39   99:i2f             
	//   40  100:fdiv            
	//   41  101:invokestatic    #206 <Method float Math.abs(float)>
	//   42  104:invokevirtual   #210 <Method void PdfContentByte.setLineWidth(float)>
				switch(i)
	//*  43  107:iload_1         
				{
	//*  44  108:tableswitch     1 4: default 140
	//	               1 192
	//	               2 216
	//	               3 202
	//	               4 209
				default:
					pdfcontentbyte.setLineDash(0.0F);
	//   45  140:aload_2         
	//   46  141:fconst_0        
	//   47  142:invokevirtual   #213 <Method void PdfContentByte.setLineDash(float)>
					return;
	//   48  145:return          

	//*  49  146:aload_0         
	//*  50  147:aload_3         
	//*  51  148:checkcast       #97  <Class MetaBrush>
	//*  52  151:putfield        #100 <Field MetaBrush currentBrush>
	//*  53  154:aload_0         
	//*  54  155:getfield        #100 <Field MetaBrush currentBrush>
	//*  55  158:invokevirtual   #214 <Method int MetaBrush.getStyle()>
	//*  56  161:istore_1        
	//*  57  162:iload_1         
	//*  58  163:ifne            178
	//*  59  166:aload_2         
	//*  60  167:aload_0         
	//*  61  168:getfield        #100 <Field MetaBrush currentBrush>
	//*  62  171:invokevirtual   #215 <Method BaseColor MetaBrush.getColor()>
	//*  63  174:invokevirtual   #218 <Method void PdfContentByte.setColorFill(BaseColor)>
	//*  64  177:return          
	//*  65  178:iload_1         
	//*  66  179:iconst_2        
	//*  67  180:icmpne          16
	//*  68  183:aload_2         
	//*  69  184:aload_0         
	//*  70  185:getfield        #62  <Field BaseColor currentBackgroundColor>
	//*  71  188:invokevirtual   #218 <Method void PdfContentByte.setColorFill(BaseColor)>
	//*  72  191:return          
				case 1: // '\001'
					pdfcontentbyte.setLineDash(18F, 6F, 0.0F);
	//   73  192:aload_2         
	//   74  193:ldc1            #219 <Float 18F>
	//   75  195:ldc1            #220 <Float 6F>
	//   76  197:fconst_0        
	//   77  198:invokevirtual   #223 <Method void PdfContentByte.setLineDash(float, float, float)>
					return;
	//   78  201:return          

				case 3: // '\003'
					pdfcontentbyte.setLiteral("[9 6 3 6]0 d\n");
	//   79  202:aload_2         
	//   80  203:ldc1            #225 <String "[9 6 3 6]0 d\n">
	//   81  205:invokevirtual   #229 <Method void PdfContentByte.setLiteral(String)>
					return;
	//   82  208:return          

				case 4: // '\004'
					pdfcontentbyte.setLiteral("[9 3 3 3 3 3]0 d\n");
	//   83  209:aload_2         
	//   84  210:ldc1            #231 <String "[9 3 3 3 3 3]0 d\n">
	//   85  212:invokevirtual   #229 <Method void PdfContentByte.setLiteral(String)>
					return;
	//   86  215:return          

				case 2: // '\002'
					pdfcontentbyte.setLineDash(3F, 0.0F);
	//   87  216:aload_2         
	//   88  217:ldc1            #232 <Float 3F>
	//   89  219:fconst_0        
	//   90  220:invokevirtual   #235 <Method void PdfContentByte.setLineDash(float, float)>
					return;
	//   91  223:return          
				}
			}
			break;

		case 2: // '\002'
			currentBrush = (MetaBrush)metaobject;
			i = currentBrush.getStyle();
			if(i == 0)
			{
				pdfcontentbyte.setColorFill(currentBrush.getColor());
				return;
			}
			if(i == 2)
			{
				pdfcontentbyte.setColorFill(currentBackgroundColor);
				return;
			}
			break;

		case 3: // '\003'
			currentFont = (MetaFont)metaobject;
	//   92  224:aload_0         
	//   93  225:aload_3         
	//   94  226:checkcast       #102 <Class MetaFont>
	//   95  229:putfield        #105 <Field MetaFont currentFont>
			return;
	//   96  232:return          
		}
		if(true) goto _L1; else goto _L3
_L3:
	}

	public void setBackgroundMode(int i)
	{
		backgroundMode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #69  <Field int backgroundMode>
	//    3    5:return          
	}

	public void setCurrentBackgroundColor(BaseColor basecolor)
	{
		currentBackgroundColor = basecolor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field BaseColor currentBackgroundColor>
	//    3    5:return          
	}

	public void setCurrentPoint(Point point)
	{
		currentPoint = point;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #90  <Field Point currentPoint>
	//    3    5:return          
	}

	public void setCurrentTextColor(BaseColor basecolor)
	{
		currentTextColor = basecolor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field BaseColor currentTextColor>
	//    3    5:return          
	}

	public void setExtentWx(int i)
	{
		extentWx = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #202 <Field int extentWx>
	//    3    5:return          
	}

	public void setExtentWy(int i)
	{
		extentWy = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #244 <Field int extentWy>
	//    3    5:return          
	}

	public void setLineJoinPolygon(PdfContentByte pdfcontentbyte)
	{
		if(lineJoin == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field int lineJoin>
	//*   2    4:ifne            17
		{
			lineJoin = 1;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #73  <Field int lineJoin>
			pdfcontentbyte.setLineJoin(1);
	//    6   12:aload_1         
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #248 <Method void PdfContentByte.setLineJoin(int)>
		}
	//    9   17:return          
	}

	public void setLineJoinRectangle(PdfContentByte pdfcontentbyte)
	{
		if(lineJoin != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field int lineJoin>
	//*   2    4:ifeq            17
		{
			lineJoin = 0;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #73  <Field int lineJoin>
			pdfcontentbyte.setLineJoin(0);
	//    6   12:aload_1         
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #248 <Method void PdfContentByte.setLineJoin(int)>
		}
	//    9   17:return          
	}

	public void setMetaState(MetaState metastate)
	{
		savedStates = metastate.savedStates;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #78  <Field Stack savedStates>
	//    3    5:putfield        #78  <Field Stack savedStates>
		MetaObjects = metastate.MetaObjects;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #83  <Field ArrayList MetaObjects>
	//    7   13:putfield        #83  <Field ArrayList MetaObjects>
		currentPoint = metastate.currentPoint;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:getfield        #90  <Field Point currentPoint>
	//   11   21:putfield        #90  <Field Point currentPoint>
		currentPen = metastate.currentPen;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:getfield        #95  <Field MetaPen currentPen>
	//   15   29:putfield        #95  <Field MetaPen currentPen>
		currentBrush = metastate.currentBrush;
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:getfield        #100 <Field MetaBrush currentBrush>
	//   19   37:putfield        #100 <Field MetaBrush currentBrush>
		currentFont = metastate.currentFont;
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:getfield        #105 <Field MetaFont currentFont>
	//   23   45:putfield        #105 <Field MetaFont currentFont>
		currentBackgroundColor = metastate.currentBackgroundColor;
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:getfield        #62  <Field BaseColor currentBackgroundColor>
	//   27   53:putfield        #62  <Field BaseColor currentBackgroundColor>
		currentTextColor = metastate.currentTextColor;
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:getfield        #67  <Field BaseColor currentTextColor>
	//   31   61:putfield        #67  <Field BaseColor currentTextColor>
		backgroundMode = metastate.backgroundMode;
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:getfield        #69  <Field int backgroundMode>
	//   35   69:putfield        #69  <Field int backgroundMode>
		polyFillMode = metastate.polyFillMode;
	//   36   72:aload_0         
	//   37   73:aload_1         
	//   38   74:getfield        #71  <Field int polyFillMode>
	//   39   77:putfield        #71  <Field int polyFillMode>
		textAlign = metastate.textAlign;
	//   40   80:aload_0         
	//   41   81:aload_1         
	//   42   82:getfield        #156 <Field int textAlign>
	//   43   85:putfield        #156 <Field int textAlign>
		lineJoin = metastate.lineJoin;
	//   44   88:aload_0         
	//   45   89:aload_1         
	//   46   90:getfield        #73  <Field int lineJoin>
	//   47   93:putfield        #73  <Field int lineJoin>
		offsetWx = metastate.offsetWx;
	//   48   96:aload_0         
	//   49   97:aload_1         
	//   50   98:getfield        #251 <Field int offsetWx>
	//   51  101:putfield        #251 <Field int offsetWx>
		offsetWy = metastate.offsetWy;
	//   52  104:aload_0         
	//   53  105:aload_1         
	//   54  106:getfield        #253 <Field int offsetWy>
	//   55  109:putfield        #253 <Field int offsetWy>
		extentWx = metastate.extentWx;
	//   56  112:aload_0         
	//   57  113:aload_1         
	//   58  114:getfield        #202 <Field int extentWx>
	//   59  117:putfield        #202 <Field int extentWx>
		extentWy = metastate.extentWy;
	//   60  120:aload_0         
	//   61  121:aload_1         
	//   62  122:getfield        #244 <Field int extentWy>
	//   63  125:putfield        #244 <Field int extentWy>
		scalingX = metastate.scalingX;
	//   64  128:aload_0         
	//   65  129:aload_1         
	//   66  130:getfield        #200 <Field float scalingX>
	//   67  133:putfield        #200 <Field float scalingX>
		scalingY = metastate.scalingY;
	//   68  136:aload_0         
	//   69  137:aload_1         
	//   70  138:getfield        #255 <Field float scalingY>
	//   71  141:putfield        #255 <Field float scalingY>
	//   72  144:return          
	}

	public void setOffsetWx(int i)
	{
		offsetWx = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #251 <Field int offsetWx>
	//    3    5:return          
	}

	public void setOffsetWy(int i)
	{
		offsetWy = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #253 <Field int offsetWy>
	//    3    5:return          
	}

	public void setPolyFillMode(int i)
	{
		polyFillMode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #71  <Field int polyFillMode>
	//    3    5:return          
	}

	public void setScalingX(float f)
	{
		scalingX = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #200 <Field float scalingX>
	//    3    5:return          
	}

	public void setScalingY(float f)
	{
		scalingY = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #255 <Field float scalingY>
	//    3    5:return          
	}

	public void setTextAlign(int i)
	{
		textAlign = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #156 <Field int textAlign>
	//    3    5:return          
	}

	public float transformAngle(float f)
	{
		if(scalingY < 0.0F)
	//*   0    0:aload_0         
	//*   1    1:getfield        #255 <Field float scalingY>
	//*   2    4:fconst_0        
	//*   3    5:fcmpg           
	//*   4    6:ifge            31
			f = -f;
	//    5    9:fload_1         
	//    6   10:fneg            
	//    7   11:fstore_1        
		double d;
		if(scalingX < 0.0F)
	//*   8   12:aload_0         
	//*   9   13:getfield        #200 <Field float scalingX>
	//*  10   16:fconst_0        
	//*  11   17:fcmpg           
	//*  12   18:ifge            34
			d = 3.1415926535897931D - (double)f;
	//   13   21:ldc2w           #263 <Double 3.1415926535897931D>
	//   14   24:fload_1         
	//   15   25:f2d             
	//   16   26:dsub            
	//   17   27:dstore_2        
		else
	//*  18   28:dload_2         
	//*  19   29:d2f             
	//*  20   30:freturn         
	//*  21   31:goto            12
			d = f;
	//   22   34:fload_1         
	//   23   35:f2d             
	//   24   36:dstore_2        
		return (float)d;
	//*  25   37:goto            28
	}

	public float transformX(int i)
	{
		return (((float)i - (float)offsetWx) * scalingX) / (float)extentWx;
	//    0    0:iload_1         
	//    1    1:i2f             
	//    2    2:aload_0         
	//    3    3:getfield        #251 <Field int offsetWx>
	//    4    6:i2f             
	//    5    7:fsub            
	//    6    8:aload_0         
	//    7    9:getfield        #200 <Field float scalingX>
	//    8   12:fmul            
	//    9   13:aload_0         
	//   10   14:getfield        #202 <Field int extentWx>
	//   11   17:i2f             
	//   12   18:fdiv            
	//   13   19:freturn         
	}

	public float transformY(int i)
	{
		return (1.0F - ((float)i - (float)offsetWy) / (float)extentWy) * scalingY;
	//    0    0:fconst_1        
	//    1    1:iload_1         
	//    2    2:i2f             
	//    3    3:aload_0         
	//    4    4:getfield        #253 <Field int offsetWy>
	//    5    7:i2f             
	//    6    8:fsub            
	//    7    9:aload_0         
	//    8   10:getfield        #244 <Field int extentWy>
	//    9   13:i2f             
	//   10   14:fdiv            
	//   11   15:fsub            
	//   12   16:aload_0         
	//   13   17:getfield        #255 <Field float scalingY>
	//   14   20:fmul            
	//   15   21:freturn         
	}

	public static final int ALTERNATE = 1;
	public static final int OPAQUE = 2;
	public static final int TA_BASELINE = 24;
	public static final int TA_BOTTOM = 8;
	public static final int TA_CENTER = 6;
	public static final int TA_LEFT = 0;
	public static final int TA_NOUPDATECP = 0;
	public static final int TA_RIGHT = 2;
	public static final int TA_TOP = 0;
	public static final int TA_UPDATECP = 1;
	public static final int TRANSPARENT = 1;
	public static final int WINDING = 2;
	public ArrayList MetaObjects;
	public int backgroundMode;
	public BaseColor currentBackgroundColor;
	public MetaBrush currentBrush;
	public MetaFont currentFont;
	public MetaPen currentPen;
	public Point currentPoint;
	public BaseColor currentTextColor;
	public int extentWx;
	public int extentWy;
	public int lineJoin;
	public int offsetWx;
	public int offsetWy;
	public int polyFillMode;
	public Stack savedStates;
	public float scalingX;
	public float scalingY;
	public int textAlign;
}
