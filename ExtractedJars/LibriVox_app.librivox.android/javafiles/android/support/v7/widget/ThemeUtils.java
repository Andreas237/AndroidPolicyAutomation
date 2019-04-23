// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v4.graphics.a;
import android.util.TypedValue;

// Referenced classes of package android.support.v7.widget:
//			TintTypedArray

class ThemeUtils
{

	private ThemeUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Object()>
	//    2    4:return          
	}

	public static ColorStateList createDisabledStateList(int i, int j)
	{
		return new ColorStateList(new int[][] {
			DISABLED_STATE_SET, EMPTY_STATE_SET
		}, new int[] {
			j, i
		});
	//    0    0:new             #57  <Class ColorStateList>
	//    1    3:dup             
	//    2    4:iconst_2        
	//    3    5:anewarray       int[][]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:getstatic       #28  <Field int[] DISABLED_STATE_SET>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:getstatic       #49  <Field int[] EMPTY_STATE_SET>
	//   11   19:aastore         
	//   12   20:iconst_2        
	//   13   21:newarray        int[]
	//   14   23:dup             
	//   15   24:iconst_0        
	//   16   25:iload_1         
	//   17   26:iastore         
	//   18   27:dup             
	//   19   28:iconst_1        
	//   20   29:iload_0         
	//   21   30:iastore         
	//   22   31:invokespecial   #61  <Method void ColorStateList(int[][], int[])>
	//   23   34:areturn         
	}

	public static int getDisabledThemeAttrColor(Context context, int i)
	{
		ColorStateList colorstatelist = getThemeAttrColorStateList(context, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #67  <Method ColorStateList getThemeAttrColorStateList(Context, int)>
	//    3    5:astore_2        
		if(colorstatelist != null && colorstatelist.isStateful())
	//*   4    6:aload_2         
	//*   5    7:ifnull          29
	//*   6   10:aload_2         
	//*   7   11:invokevirtual   #71  <Method boolean ColorStateList.isStateful()>
	//*   8   14:ifeq            29
		{
			return colorstatelist.getColorForState(DISABLED_STATE_SET, colorstatelist.getDefaultColor());
	//    9   17:aload_2         
	//   10   18:getstatic       #28  <Field int[] DISABLED_STATE_SET>
	//   11   21:aload_2         
	//   12   22:invokevirtual   #75  <Method int ColorStateList.getDefaultColor()>
	//   13   25:invokevirtual   #79  <Method int ColorStateList.getColorForState(int[], int)>
	//   14   28:ireturn         
		} else
		{
			TypedValue typedvalue = getTypedValue();
	//   15   29:invokestatic    #83  <Method TypedValue getTypedValue()>
	//   16   32:astore_2        
			context.getTheme().resolveAttribute(0x1010033, typedvalue, true);
	//   17   33:aload_0         
	//   18   34:invokevirtual   #89  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   19   37:ldc1            #90  <Int 0x1010033>
	//   20   39:aload_2         
	//   21   40:iconst_1        
	//   22   41:invokevirtual   #96  <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   23   44:pop             
			return getThemeAttrColor(context, i, typedvalue.getFloat());
	//   24   45:aload_0         
	//   25   46:iload_1         
	//   26   47:aload_2         
	//   27   48:invokevirtual   #102 <Method float TypedValue.getFloat()>
	//   28   51:invokestatic    #106 <Method int getThemeAttrColor(Context, int, float)>
	//   29   54:ireturn         
		}
	}

	public static int getThemeAttrColor(Context context, int i)
	{
		int ai[] = TEMP_ARRAY;
	//    0    0:getstatic       #51  <Field int[] TEMP_ARRAY>
	//    1    3:astore_2        
		ai[0] = i;
	//    2    4:aload_2         
	//    3    5:iconst_0        
	//    4    6:iload_1         
	//    5    7:iastore         
		context = ((Context) (TintTypedArray.obtainStyledAttributes(context, ((android.util.AttributeSet) (null)), ai)));
	//    6    8:aload_0         
	//    7    9:aconst_null     
	//    8   10:aload_2         
	//    9   11:invokestatic    #112 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, android.util.AttributeSet, int[])>
	//   10   14:astore_0        
		i = ((TintTypedArray) (context)).getColor(0, 0);
	//   11   15:aload_0         
	//   12   16:iconst_0        
	//   13   17:iconst_0        
	//   14   18:invokevirtual   #116 <Method int TintTypedArray.getColor(int, int)>
	//   15   21:istore_1        
		((TintTypedArray) (context)).recycle();
	//   16   22:aload_0         
	//   17   23:invokevirtual   #119 <Method void TintTypedArray.recycle()>
		return i;
	//   18   26:iload_1         
	//   19   27:ireturn         
		Exception exception;
		exception;
	//   20   28:astore_2        
		((TintTypedArray) (context)).recycle();
	//   21   29:aload_0         
	//   22   30:invokevirtual   #119 <Method void TintTypedArray.recycle()>
		throw exception;
	//   23   33:aload_2         
	//   24   34:athrow          
	}

	static int getThemeAttrColor(Context context, int i, float f)
	{
		i = getThemeAttrColor(context, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #121 <Method int getThemeAttrColor(Context, int)>
	//    3    5:istore_1        
		return a.c(i, Math.round((float)Color.alpha(i) * f));
	//    4    6:iload_1         
	//    5    7:iload_1         
	//    6    8:invokestatic    #127 <Method int Color.alpha(int)>
	//    7   11:i2f             
	//    8   12:fload_2         
	//    9   13:fmul            
	//   10   14:invokestatic    #133 <Method int Math.round(float)>
	//   11   17:invokestatic    #138 <Method int a.c(int, int)>
	//   12   20:ireturn         
	}

	public static ColorStateList getThemeAttrColorStateList(Context context, int i)
	{
		int ai[] = TEMP_ARRAY;
	//    0    0:getstatic       #51  <Field int[] TEMP_ARRAY>
	//    1    3:astore_2        
		ai[0] = i;
	//    2    4:aload_2         
	//    3    5:iconst_0        
	//    4    6:iload_1         
	//    5    7:iastore         
		context = ((Context) (TintTypedArray.obtainStyledAttributes(context, ((android.util.AttributeSet) (null)), ai)));
	//    6    8:aload_0         
	//    7    9:aconst_null     
	//    8   10:aload_2         
	//    9   11:invokestatic    #112 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, android.util.AttributeSet, int[])>
	//   10   14:astore_0        
		ColorStateList colorstatelist = ((TintTypedArray) (context)).getColorStateList(0);
	//   11   15:aload_0         
	//   12   16:iconst_0        
	//   13   17:invokevirtual   #142 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//   14   20:astore_2        
		((TintTypedArray) (context)).recycle();
	//   15   21:aload_0         
	//   16   22:invokevirtual   #119 <Method void TintTypedArray.recycle()>
		return colorstatelist;
	//   17   25:aload_2         
	//   18   26:areturn         
		Exception exception;
		exception;
	//   19   27:astore_2        
		((TintTypedArray) (context)).recycle();
	//   20   28:aload_0         
	//   21   29:invokevirtual   #119 <Method void TintTypedArray.recycle()>
		throw exception;
	//   22   32:aload_2         
	//   23   33:athrow          
	}

	private static TypedValue getTypedValue()
	{
		TypedValue typedvalue1 = (TypedValue)TL_TYPED_VALUE.get();
	//    0    0:getstatic       #25  <Field ThreadLocal TL_TYPED_VALUE>
	//    1    3:invokevirtual   #146 <Method Object ThreadLocal.get()>
	//    2    6:checkcast       #98  <Class TypedValue>
	//    3    9:astore_1        
		TypedValue typedvalue = typedvalue1;
	//    4   10:aload_1         
	//    5   11:astore_0        
		if(typedvalue1 == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       31
		{
			typedvalue = new TypedValue();
	//    8   16:new             #98  <Class TypedValue>
	//    9   19:dup             
	//   10   20:invokespecial   #147 <Method void TypedValue()>
	//   11   23:astore_0        
			TL_TYPED_VALUE.set(((Object) (typedvalue)));
	//   12   24:getstatic       #25  <Field ThreadLocal TL_TYPED_VALUE>
	//   13   27:aload_0         
	//   14   28:invokevirtual   #151 <Method void ThreadLocal.set(Object)>
		}
		return typedvalue;
	//   15   31:aload_0         
	//   16   32:areturn         
	}

	static final int ACTIVATED_STATE_SET[] = {
		0x10102fe
	};
	static final int CHECKED_STATE_SET[] = {
		0x10100a0
	};
	static final int DISABLED_STATE_SET[] = {
		0xfefeff62
	};
	static final int EMPTY_STATE_SET[] = new int[0];
	static final int FOCUSED_STATE_SET[] = {
		0x101009c
	};
	static final int NOT_PRESSED_OR_FOCUSED_STATE_SET[] = {
		0xfefeff59, 0xfefeff64
	};
	static final int PRESSED_STATE_SET[] = {
		0x10100a7
	};
	static final int SELECTED_STATE_SET[] = {
		0x10100a1
	};
	private static final int TEMP_ARRAY[] = new int[1];
	private static final ThreadLocal TL_TYPED_VALUE = new ThreadLocal();

	static 
	{
	//    0    0:new             #20  <Class ThreadLocal>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void ThreadLocal()>
	//    3    7:putstatic       #25  <Field ThreadLocal TL_TYPED_VALUE>
	//    4   10:iconst_1        
	//    5   11:newarray        int[]
	//    6   13:dup             
	//    7   14:iconst_0        
	//    8   15:ldc1            #26  <Int 0xfefeff62>
	//    9   17:iastore         
	//   10   18:putstatic       #28  <Field int[] DISABLED_STATE_SET>
	//   11   21:iconst_1        
	//   12   22:newarray        int[]
	//   13   24:dup             
	//   14   25:iconst_0        
	//   15   26:ldc1            #29  <Int 0x101009c>
	//   16   28:iastore         
	//   17   29:putstatic       #31  <Field int[] FOCUSED_STATE_SET>
	//   18   32:iconst_1        
	//   19   33:newarray        int[]
	//   20   35:dup             
	//   21   36:iconst_0        
	//   22   37:ldc1            #32  <Int 0x10102fe>
	//   23   39:iastore         
	//   24   40:putstatic       #34  <Field int[] ACTIVATED_STATE_SET>
	//   25   43:iconst_1        
	//   26   44:newarray        int[]
	//   27   46:dup             
	//   28   47:iconst_0        
	//   29   48:ldc1            #35  <Int 0x10100a7>
	//   30   50:iastore         
	//   31   51:putstatic       #37  <Field int[] PRESSED_STATE_SET>
	//   32   54:iconst_1        
	//   33   55:newarray        int[]
	//   34   57:dup             
	//   35   58:iconst_0        
	//   36   59:ldc1            #38  <Int 0x10100a0>
	//   37   61:iastore         
	//   38   62:putstatic       #40  <Field int[] CHECKED_STATE_SET>
	//   39   65:iconst_1        
	//   40   66:newarray        int[]
	//   41   68:dup             
	//   42   69:iconst_0        
	//   43   70:ldc1            #41  <Int 0x10100a1>
	//   44   72:iastore         
	//   45   73:putstatic       #43  <Field int[] SELECTED_STATE_SET>
	//   46   76:iconst_2        
	//   47   77:newarray        int[]
	//   48   79:dup             
	//   49   80:iconst_0        
	//   50   81:ldc1            #44  <Int 0xfefeff59>
	//   51   83:iastore         
	//   52   84:dup             
	//   53   85:iconst_1        
	//   54   86:ldc1            #45  <Int 0xfefeff64>
	//   55   88:iastore         
	//   56   89:putstatic       #47  <Field int[] NOT_PRESSED_OR_FOCUSED_STATE_SET>
	//   57   92:iconst_0        
	//   58   93:newarray        int[]
	//   59   95:putstatic       #49  <Field int[] EMPTY_STATE_SET>
	//   60   98:iconst_1        
	//   61   99:newarray        int[]
	//   62  101:putstatic       #51  <Field int[] TEMP_ARRAY>
	//*  63  104:return          
	}
}
