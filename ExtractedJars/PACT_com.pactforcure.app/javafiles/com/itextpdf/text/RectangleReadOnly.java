// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.error_messages.MessageLocalization;

// Referenced classes of package com.itextpdf.text:
//			Rectangle, BaseColor

public class RectangleReadOnly extends Rectangle
{

	public RectangleReadOnly(float f, float f1)
	{
		super(0.0F, 0.0F, f, f1);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fconst_0        
	//    3    3:fload_1         
	//    4    4:fload_2         
	//    5    5:invokespecial   #9   <Method void Rectangle(float, float, float, float)>
	//    6    8:return          
	}

	public RectangleReadOnly(float f, float f1, float f2, float f3)
	{
		super(f, f1, f2, f3);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:invokespecial   #9   <Method void Rectangle(float, float, float, float)>
	//    6    9:return          
	}

	public RectangleReadOnly(float f, float f1, float f2, float f3, int i)
	{
		super(f, f1, f2, f3);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:invokespecial   #9   <Method void Rectangle(float, float, float, float)>
		super.setRotation(i);
	//    6    9:aload_0         
	//    7   10:iload           5
	//    8   12:invokespecial   #15  <Method void Rectangle.setRotation(int)>
	//    9   15:return          
	}

	public RectangleReadOnly(float f, float f1, int i)
	{
		super(0.0F, 0.0F, f, f1);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fconst_0        
	//    3    3:fload_1         
	//    4    4:fload_2         
	//    5    5:invokespecial   #9   <Method void Rectangle(float, float, float, float)>
		super.setRotation(i);
	//    6    8:aload_0         
	//    7    9:iload_3         
	//    8   10:invokespecial   #15  <Method void Rectangle.setRotation(int)>
	//    9   13:return          
	}

	public RectangleReadOnly(Rectangle rectangle)
	{
		super(rectangle.llx, rectangle.lly, rectangle.urx, rectangle.ury);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #21  <Field float Rectangle.llx>
	//    3    5:aload_1         
	//    4    6:getfield        #24  <Field float Rectangle.lly>
	//    5    9:aload_1         
	//    6   10:getfield        #27  <Field float Rectangle.urx>
	//    7   13:aload_1         
	//    8   14:getfield        #30  <Field float Rectangle.ury>
	//    9   17:invokespecial   #9   <Method void Rectangle(float, float, float, float)>
		super.cloneNonPositionParameters(rectangle);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokespecial   #33  <Method void Rectangle.cloneNonPositionParameters(Rectangle)>
	//   13   25:return          
	}

	private void throwReadOnlyError()
	{
		throw new UnsupportedOperationException(MessageLocalization.getComposedMessage("rectanglereadonly.this.rectangle.is.read.only", new Object[0]));
	//    0    0:new             #37  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #39  <String "rectanglereadonly.this.rectangle.is.read.only">
	//    3    6:iconst_0        
	//    4    7:anewarray       Object[]
	//    5   10:invokestatic    #47  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    6   13:invokespecial   #50  <Method void UnsupportedOperationException(String)>
	//    7   16:athrow          
	}

	public void cloneNonPositionParameters(Rectangle rectangle)
	{
		throwReadOnlyError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void throwReadOnlyError()>
	//    2    4:return          
	}

	public void disableBorderSide(int i)
	{
		throwReadOnlyError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void throwReadOnlyError()>
	//    2    4:return          
	}

	public void enableBorderSide(int i)
	{
		throwReadOnlyError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void throwReadOnlyError()>
	//    2    4:return          
	}

	public void normalize()
	{
		throwReadOnlyError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void throwReadOnlyError()>
	//    2    4:return          
	}

	public void setBackgroundColor(BaseColor basecolor)
	{
		throwReadOnlyError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void throwReadOnlyError()>
	//    2    4:return          
	}

	public void setBorder(int i)
	{
		throwReadOnlyError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void throwReadOnlyError()>
	//    2    4:return          
	}

	public void setBorderColor(BaseColor basecolor)
	{
		throwReadOnlyError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void throwReadOnlyError()>
	//    2    4:return          
	}

	public void setBorderColorBottom(BaseColor basecolor)
	{
		throwReadOnlyError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void throwReadOnlyError()>
	//    2    4:return          
	}

	public void setBorderColorLeft(BaseColor basecolor)
	{
		throwReadOnlyError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void throwReadOnlyError()>
	//    2    4:return          
	}

	public void setBorderColorRight(BaseColor basecolor)
	{
		throwReadOnlyError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void throwReadOnlyError()>
	//    2    4:return          
	}

	public void setBorderColorTop(BaseColor basecolor)
	{
		throwReadOnlyError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void throwReadOnlyError()>
	//    2    4:return          
	}

	public void setBorderWidth(float f)
	{
		throwReadOnlyError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void throwReadOnlyError()>
	//    2    4:return          
	}

	public void setBorderWidthBottom(float f)
	{
		throwReadOnlyError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void throwReadOnlyError()>
	//    2    4:return          
	}

	public void setBorderWidthLeft(float f)
	{
		throwReadOnlyError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void throwReadOnlyError()>
	//    2    4:return          
	}

	public void setBorderWidthRight(float f)
	{
		throwReadOnlyError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void throwReadOnlyError()>
	//    2    4:return          
	}

	public void setBorderWidthTop(float f)
	{
		throwReadOnlyError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void throwReadOnlyError()>
	//    2    4:return          
	}

	public void setBottom(float f)
	{
		throwReadOnlyError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void throwReadOnlyError()>
	//    2    4:return          
	}

	public void setGrayFill(float f)
	{
		throwReadOnlyError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void throwReadOnlyError()>
	//    2    4:return          
	}

	public void setLeft(float f)
	{
		throwReadOnlyError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void throwReadOnlyError()>
	//    2    4:return          
	}

	public void setRight(float f)
	{
		throwReadOnlyError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void throwReadOnlyError()>
	//    2    4:return          
	}

	public void setRotation(int i)
	{
		throwReadOnlyError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void throwReadOnlyError()>
	//    2    4:return          
	}

	public void setTop(float f)
	{
		throwReadOnlyError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void throwReadOnlyError()>
	//    2    4:return          
	}

	public void setUseVariableBorders(boolean flag)
	{
		throwReadOnlyError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void throwReadOnlyError()>
	//    2    4:return          
	}

	public void softCloneNonPositionParameters(Rectangle rectangle)
	{
		throwReadOnlyError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void throwReadOnlyError()>
	//    2    4:return          
	}

	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer("RectangleReadOnly: ");
	//    0    0:new             #81  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:ldc1            #83  <String "RectangleReadOnly: ">
	//    3    6:invokespecial   #84  <Method void StringBuffer(String)>
	//    4    9:astore_1        
		stringbuffer.append(getWidth());
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:invokevirtual   #88  <Method float getWidth()>
	//    8   15:invokevirtual   #92  <Method StringBuffer StringBuffer.append(float)>
	//    9   18:pop             
		stringbuffer.append('x');
	//   10   19:aload_1         
	//   11   20:bipush          120
	//   12   22:invokevirtual   #95  <Method StringBuffer StringBuffer.append(char)>
	//   13   25:pop             
		stringbuffer.append(getHeight());
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:invokevirtual   #98  <Method float getHeight()>
	//   17   31:invokevirtual   #92  <Method StringBuffer StringBuffer.append(float)>
	//   18   34:pop             
		stringbuffer.append(" (rot: ");
	//   19   35:aload_1         
	//   20   36:ldc1            #100 <String " (rot: ">
	//   21   38:invokevirtual   #103 <Method StringBuffer StringBuffer.append(String)>
	//   22   41:pop             
		stringbuffer.append(rotation);
	//   23   42:aload_1         
	//   24   43:aload_0         
	//   25   44:getfield        #107 <Field int rotation>
	//   26   47:invokevirtual   #110 <Method StringBuffer StringBuffer.append(int)>
	//   27   50:pop             
		stringbuffer.append(" degrees)");
	//   28   51:aload_1         
	//   29   52:ldc1            #112 <String " degrees)">
	//   30   54:invokevirtual   #103 <Method StringBuffer StringBuffer.append(String)>
	//   31   57:pop             
		return stringbuffer.toString();
	//   32   58:aload_1         
	//   33   59:invokevirtual   #114 <Method String StringBuffer.toString()>
	//   34   62:areturn         
	}
}
