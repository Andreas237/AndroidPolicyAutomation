// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

class RectEvaluator
	implements TypeEvaluator
{

	RectEvaluator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	RectEvaluator(Rect rect)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mRect = rect;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Rect mRect>
	//    5    9:return          
	}

	public Rect evaluate(float f, Rect rect, Rect rect1)
	{
		int i = rect.left + (int)((float)(rect1.left - rect.left) * f);
	//    0    0:aload_2         
	//    1    1:getfield        #28  <Field int Rect.left>
	//    2    4:aload_3         
	//    3    5:getfield        #28  <Field int Rect.left>
	//    4    8:aload_2         
	//    5    9:getfield        #28  <Field int Rect.left>
	//    6   12:isub            
	//    7   13:i2f             
	//    8   14:fload_1         
	//    9   15:fmul            
	//   10   16:f2i             
	//   11   17:iadd            
	//   12   18:istore          4
		int j = rect.top + (int)((float)(rect1.top - rect.top) * f);
	//   13   20:aload_2         
	//   14   21:getfield        #31  <Field int Rect.top>
	//   15   24:aload_3         
	//   16   25:getfield        #31  <Field int Rect.top>
	//   17   28:aload_2         
	//   18   29:getfield        #31  <Field int Rect.top>
	//   19   32:isub            
	//   20   33:i2f             
	//   21   34:fload_1         
	//   22   35:fmul            
	//   23   36:f2i             
	//   24   37:iadd            
	//   25   38:istore          5
		int k = rect.right + (int)((float)(rect1.right - rect.right) * f);
	//   26   40:aload_2         
	//   27   41:getfield        #34  <Field int Rect.right>
	//   28   44:aload_3         
	//   29   45:getfield        #34  <Field int Rect.right>
	//   30   48:aload_2         
	//   31   49:getfield        #34  <Field int Rect.right>
	//   32   52:isub            
	//   33   53:i2f             
	//   34   54:fload_1         
	//   35   55:fmul            
	//   36   56:f2i             
	//   37   57:iadd            
	//   38   58:istore          6
		int l = rect.bottom + (int)((float)(rect1.bottom - rect.bottom) * f);
	//   39   60:aload_2         
	//   40   61:getfield        #37  <Field int Rect.bottom>
	//   41   64:aload_3         
	//   42   65:getfield        #37  <Field int Rect.bottom>
	//   43   68:aload_2         
	//   44   69:getfield        #37  <Field int Rect.bottom>
	//   45   72:isub            
	//   46   73:i2f             
	//   47   74:fload_1         
	//   48   75:fmul            
	//   49   76:f2i             
	//   50   77:iadd            
	//   51   78:istore          7
		if(mRect == null)
	//*  52   80:aload_0         
	//*  53   81:getfield        #20  <Field Rect mRect>
	//*  54   84:ifnonnull       103
		{
			return new Rect(i, j, k, l);
	//   55   87:new             #24  <Class Rect>
	//   56   90:dup             
	//   57   91:iload           4
	//   58   93:iload           5
	//   59   95:iload           6
	//   60   97:iload           7
	//   61   99:invokespecial   #40  <Method void Rect(int, int, int, int)>
	//   62  102:areturn         
		} else
		{
			mRect.set(i, j, k, l);
	//   63  103:aload_0         
	//   64  104:getfield        #20  <Field Rect mRect>
	//   65  107:iload           4
	//   66  109:iload           5
	//   67  111:iload           6
	//   68  113:iload           7
	//   69  115:invokevirtual   #43  <Method void Rect.set(int, int, int, int)>
			return mRect;
	//   70  118:aload_0         
	//   71  119:getfield        #20  <Field Rect mRect>
	//   72  122:areturn         
		}
	}

	public volatile Object evaluate(float f, Object obj, Object obj1)
	{
		return ((Object) (evaluate(f, (Rect)obj, (Rect)obj1)));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #24  <Class Rect>
	//    4    6:aload_3         
	//    5    7:checkcast       #24  <Class Rect>
	//    6   10:invokevirtual   #46  <Method Rect evaluate(float, Rect, Rect)>
	//    7   13:areturn         
	}

	private Rect mRect;
}
