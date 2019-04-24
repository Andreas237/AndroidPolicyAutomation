// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.widget.ImageView;

class ku
{

	ku()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	static void a(float f, float f1, float f2)
	{
		if(f >= f1)
	//*   0    0:fload_0         
	//*   1    1:fload_1         
	//*   2    2:fcmpl           
	//*   3    3:iflt            16
			throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
	//    4    6:new             #15  <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:ldc1            #17  <String "Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value">
	//    7   12:invokespecial   #20  <Method void IllegalArgumentException(String)>
	//    8   15:athrow          
		if(f1 >= f2)
	//*   9   16:fload_1         
	//*  10   17:fload_2         
	//*  11   18:fcmpl           
	//*  12   19:iflt            32
			throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
	//   13   22:new             #15  <Class IllegalArgumentException>
	//   14   25:dup             
	//   15   26:ldc1            #22  <String "Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value">
	//   16   28:invokespecial   #20  <Method void IllegalArgumentException(String)>
	//   17   31:athrow          
		else
			return;
	//   18   32:return          
	}

	static boolean c(android.widget.ImageView.ScaleType scaletype)
	{
		if(scaletype == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		static class _cls3
		{

			static final int b[];

			static 
			{
				b = new int[android.widget.ImageView.ScaleType.values().length];
			//    0    0:invokestatic    #18  <Method android.widget.ImageView$ScaleType[] android.widget.ImageView$ScaleType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] b>
				try
				{
					b[android.widget.ImageView.ScaleType.MATRIX.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] b>
			//    5   12:getstatic       #24  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
			//    6   15:invokevirtual   #28  <Method int android.widget.ImageView$ScaleType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
			//    9   20:return          
				}
				catch(NoSuchFieldError nosuchfielderror) { }
			//   10   21:astore_0        
			//*  11   22:return          
			}
		}

		switch(_cls3.b[scaletype.ordinal()])
	//*   4    6:getstatic       #28  <Field int[] ku$3.b>
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #34  <Method int android.widget.ImageView$ScaleType.ordinal()>
	//*   7   13:iaload          
		{
	//*   8   14:lookupswitch    1: default 32
	//	               1: 35
	//*   9   32:goto            45
		case 1: // '\001'
			throw new IllegalStateException("Matrix scale type is not supported");
	//   10   35:new             #36  <Class IllegalStateException>
	//   11   38:dup             
	//   12   39:ldc1            #38  <String "Matrix scale type is not supported">
	//   13   41:invokespecial   #39  <Method void IllegalStateException(String)>
	//   14   44:athrow          
		}
		return true;
	//   15   45:iconst_1        
	//   16   46:ireturn         
	}

	static boolean c(ImageView imageview)
	{
		return imageview.getDrawable() != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #46  <Method android.graphics.drawable.Drawable ImageView.getDrawable()>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	static int d(int i)
	{
		return (0xff00 & i) >> 8;
	//    0    0:ldc1            #49  <Int 65280>
	//    1    2:iload_0         
	//    2    3:iand            
	//    3    4:bipush          8
	//    4    6:ishr            
	//    5    7:ireturn         
	}
}
