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
		int i = rect.left;
	//    0    0:aload_2         
	//    1    1:getfield        #28  <Field int Rect.left>
	//    2    4:istore          4
		i = (int)((float)(rect1.left - rect.left) * f) + i;
	//    3    6:aload_3         
	//    4    7:getfield        #28  <Field int Rect.left>
	//    5   10:aload_2         
	//    6   11:getfield        #28  <Field int Rect.left>
	//    7   14:isub            
	//    8   15:i2f             
	//    9   16:fload_1         
	//   10   17:fmul            
	//   11   18:f2i             
	//   12   19:iload           4
	//   13   21:iadd            
	//   14   22:istore          4
		int j = rect.top;
	//   15   24:aload_2         
	//   16   25:getfield        #31  <Field int Rect.top>
	//   17   28:istore          5
		j = (int)((float)(rect1.top - rect.top) * f) + j;
	//   18   30:aload_3         
	//   19   31:getfield        #31  <Field int Rect.top>
	//   20   34:aload_2         
	//   21   35:getfield        #31  <Field int Rect.top>
	//   22   38:isub            
	//   23   39:i2f             
	//   24   40:fload_1         
	//   25   41:fmul            
	//   26   42:f2i             
	//   27   43:iload           5
	//   28   45:iadd            
	//   29   46:istore          5
		int k = rect.right;
	//   30   48:aload_2         
	//   31   49:getfield        #34  <Field int Rect.right>
	//   32   52:istore          6
		k = (int)((float)(rect1.right - rect.right) * f) + k;
	//   33   54:aload_3         
	//   34   55:getfield        #34  <Field int Rect.right>
	//   35   58:aload_2         
	//   36   59:getfield        #34  <Field int Rect.right>
	//   37   62:isub            
	//   38   63:i2f             
	//   39   64:fload_1         
	//   40   65:fmul            
	//   41   66:f2i             
	//   42   67:iload           6
	//   43   69:iadd            
	//   44   70:istore          6
		int l = rect.bottom;
	//   45   72:aload_2         
	//   46   73:getfield        #37  <Field int Rect.bottom>
	//   47   76:istore          7
		l = (int)((float)(rect1.bottom - rect.bottom) * f) + l;
	//   48   78:aload_3         
	//   49   79:getfield        #37  <Field int Rect.bottom>
	//   50   82:aload_2         
	//   51   83:getfield        #37  <Field int Rect.bottom>
	//   52   86:isub            
	//   53   87:i2f             
	//   54   88:fload_1         
	//   55   89:fmul            
	//   56   90:f2i             
	//   57   91:iload           7
	//   58   93:iadd            
	//   59   94:istore          7
		if(mRect == null)
	//*  60   96:aload_0         
	//*  61   97:getfield        #20  <Field Rect mRect>
	//*  62  100:ifnonnull       119
		{
			return new Rect(i, j, k, l);
	//   63  103:new             #24  <Class Rect>
	//   64  106:dup             
	//   65  107:iload           4
	//   66  109:iload           5
	//   67  111:iload           6
	//   68  113:iload           7
	//   69  115:invokespecial   #40  <Method void Rect(int, int, int, int)>
	//   70  118:areturn         
		} else
		{
			mRect.set(i, j, k, l);
	//   71  119:aload_0         
	//   72  120:getfield        #20  <Field Rect mRect>
	//   73  123:iload           4
	//   74  125:iload           5
	//   75  127:iload           6
	//   76  129:iload           7
	//   77  131:invokevirtual   #43  <Method void Rect.set(int, int, int, int)>
			return mRect;
	//   78  134:aload_0         
	//   79  135:getfield        #20  <Field Rect mRect>
	//   80  138:areturn         
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
