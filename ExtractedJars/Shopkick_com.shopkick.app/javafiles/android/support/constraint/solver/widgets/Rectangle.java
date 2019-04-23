// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;


public class Rectangle
{

	public Rectangle()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public boolean contains(int i, int j)
	{
		int k = x;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int x>
	//    2    4:istore_3        
		if(i >= k && i < k + width)
	//*   3    5:iload_1         
	//*   4    6:iload_3         
	//*   5    7:icmplt          42
	//*   6   10:iload_1         
	//*   7   11:iload_3         
	//*   8   12:aload_0         
	//*   9   13:getfield        #20  <Field int width>
	//*  10   16:iadd            
	//*  11   17:icmpge          42
		{
			i = y;
	//   12   20:aload_0         
	//   13   21:getfield        #22  <Field int y>
	//   14   24:istore_1        
			if(j >= i && j < i + height)
	//*  15   25:iload_2         
	//*  16   26:iload_1         
	//*  17   27:icmplt          42
	//*  18   30:iload_2         
	//*  19   31:iload_1         
	//*  20   32:aload_0         
	//*  21   33:getfield        #24  <Field int height>
	//*  22   36:iadd            
	//*  23   37:icmpge          42
				return true;
	//   24   40:iconst_1        
	//   25   41:ireturn         
		}
		return false;
	//   26   42:iconst_0        
	//   27   43:ireturn         
	}

	public int getCenterX()
	{
		return (x + width) / 2;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int x>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field int width>
	//    4    8:iadd            
	//    5    9:iconst_2        
	//    6   10:idiv            
	//    7   11:ireturn         
	}

	public int getCenterY()
	{
		return (y + height) / 2;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int y>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field int height>
	//    4    8:iadd            
	//    5    9:iconst_2        
	//    6   10:idiv            
	//    7   11:ireturn         
	}

	void grow(int i, int j)
	{
		x = x - i;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field int x>
	//    3    5:iload_1         
	//    4    6:isub            
	//    5    7:putfield        #18  <Field int x>
		y = y - j;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #22  <Field int y>
	//    9   15:iload_2         
	//   10   16:isub            
	//   11   17:putfield        #22  <Field int y>
		width = width + i * 2;
	//   12   20:aload_0         
	//   13   21:aload_0         
	//   14   22:getfield        #20  <Field int width>
	//   15   25:iload_1         
	//   16   26:iconst_2        
	//   17   27:imul            
	//   18   28:iadd            
	//   19   29:putfield        #20  <Field int width>
		height = height + j * 2;
	//   20   32:aload_0         
	//   21   33:aload_0         
	//   22   34:getfield        #24  <Field int height>
	//   23   37:iload_2         
	//   24   38:iconst_2        
	//   25   39:imul            
	//   26   40:iadd            
	//   27   41:putfield        #24  <Field int height>
	//   28   44:return          
	}

	boolean intersects(Rectangle rectangle)
	{
		int i = x;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int x>
	//    2    4:istore_2        
		int k = rectangle.x;
	//    3    5:aload_1         
	//    4    6:getfield        #18  <Field int x>
	//    5    9:istore_3        
		if(i >= k && i < k + rectangle.width)
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmplt          52
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:aload_1         
	//*  12   18:getfield        #20  <Field int width>
	//*  13   21:iadd            
	//*  14   22:icmpge          52
		{
			int j = y;
	//   15   25:aload_0         
	//   16   26:getfield        #22  <Field int y>
	//   17   29:istore_2        
			int l = rectangle.y;
	//   18   30:aload_1         
	//   19   31:getfield        #22  <Field int y>
	//   20   34:istore_3        
			if(j >= l && j < l + rectangle.height)
	//*  21   35:iload_2         
	//*  22   36:iload_3         
	//*  23   37:icmplt          52
	//*  24   40:iload_2         
	//*  25   41:iload_3         
	//*  26   42:aload_1         
	//*  27   43:getfield        #24  <Field int height>
	//*  28   46:iadd            
	//*  29   47:icmpge          52
				return true;
	//   30   50:iconst_1        
	//   31   51:ireturn         
		}
		return false;
	//   32   52:iconst_0        
	//   33   53:ireturn         
	}

	public void setBounds(int i, int j, int k, int l)
	{
		x = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #18  <Field int x>
		y = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #22  <Field int y>
		width = k;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #20  <Field int width>
		height = l;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #24  <Field int height>
	//   12   21:return          
	}

	public int height;
	public int width;
	public int x;
	public int y;
}
