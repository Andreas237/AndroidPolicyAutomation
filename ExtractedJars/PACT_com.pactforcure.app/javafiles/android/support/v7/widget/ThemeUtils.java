// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v4.graphics.ColorUtils;
import android.util.TypedValue;

// Referenced classes of package android.support.v7.widget:
//			TintTypedArray

class ThemeUtils
{

	ThemeUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
	//    2    4:return          
	}

	public static ColorStateList createDisabledStateList(int i, int j)
	{
		int ai[][] = new int[2][];
	//    0    0:iconst_2        
	//    1    1:anewarray       int[][]
	//    2    4:astore_2        
		int ai1[] = new int[2];
	//    3    5:iconst_2        
	//    4    6:newarray        int[]
	//    5    8:astore_3        
		ai[0] = DISABLED_STATE_SET;
	//    6    9:aload_2         
	//    7   10:iconst_0        
	//    8   11:getstatic       #29  <Field int[] DISABLED_STATE_SET>
	//    9   14:aastore         
		ai1[0] = j;
	//   10   15:aload_3         
	//   11   16:iconst_0        
	//   12   17:iload_1         
	//   13   18:iastore         
		j = 0 + 1;
	//   14   19:iconst_0        
	//   15   20:iconst_1        
	//   16   21:iadd            
	//   17   22:istore_1        
		ai[j] = EMPTY_STATE_SET;
	//   18   23:aload_2         
	//   19   24:iload_1         
	//   20   25:getstatic       #50  <Field int[] EMPTY_STATE_SET>
	//   21   28:aastore         
		ai1[j] = i;
	//   22   29:aload_3         
	//   23   30:iload_1         
	//   24   31:iload_0         
	//   25   32:iastore         
		return new ColorStateList(ai, ai1);
	//   26   33:new             #59  <Class ColorStateList>
	//   27   36:dup             
	//   28   37:aload_2         
	//   29   38:aload_3         
	//   30   39:invokespecial   #62  <Method void ColorStateList(int[][], int[])>
	//   31   42:areturn         
	}

	public static int getDisabledThemeAttrColor(Context context, int i)
	{
		ColorStateList colorstatelist = getThemeAttrColorStateList(context, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #68  <Method ColorStateList getThemeAttrColorStateList(Context, int)>
	//    3    5:astore_2        
		if(colorstatelist != null && colorstatelist.isStateful())
	//*   4    6:aload_2         
	//*   5    7:ifnull          29
	//*   6   10:aload_2         
	//*   7   11:invokevirtual   #72  <Method boolean ColorStateList.isStateful()>
	//*   8   14:ifeq            29
		{
			return colorstatelist.getColorForState(DISABLED_STATE_SET, colorstatelist.getDefaultColor());
	//    9   17:aload_2         
	//   10   18:getstatic       #29  <Field int[] DISABLED_STATE_SET>
	//   11   21:aload_2         
	//   12   22:invokevirtual   #76  <Method int ColorStateList.getDefaultColor()>
	//   13   25:invokevirtual   #80  <Method int ColorStateList.getColorForState(int[], int)>
	//   14   28:ireturn         
		} else
		{
			TypedValue typedvalue = getTypedValue();
	//   15   29:invokestatic    #84  <Method TypedValue getTypedValue()>
	//   16   32:astore_2        
			context.getTheme().resolveAttribute(0x1010033, typedvalue, true);
	//   17   33:aload_0         
	//   18   34:invokevirtual   #90  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   19   37:ldc1            #91  <Int 0x1010033>
	//   20   39:aload_2         
	//   21   40:iconst_1        
	//   22   41:invokevirtual   #97  <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   23   44:pop             
			return getThemeAttrColor(context, i, typedvalue.getFloat());
	//   24   45:aload_0         
	//   25   46:iload_1         
	//   26   47:aload_2         
	//   27   48:invokevirtual   #103 <Method float TypedValue.getFloat()>
	//   28   51:invokestatic    #107 <Method int getThemeAttrColor(Context, int, float)>
	//   29   54:ireturn         
		}
	}

	public static int getThemeAttrColor(Context context, int i)
	{
		TEMP_ARRAY[0] = i;
	//    0    0:getstatic       #52  <Field int[] TEMP_ARRAY>
	//    1    3:iconst_0        
	//    2    4:iload_1         
	//    3    5:iastore         
		context = ((Context) (TintTypedArray.obtainStyledAttributes(context, ((android.util.AttributeSet) (null)), TEMP_ARRAY)));
	//    4    6:aload_0         
	//    5    7:aconst_null     
	//    6    8:getstatic       #52  <Field int[] TEMP_ARRAY>
	//    7   11:invokestatic    #113 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, android.util.AttributeSet, int[])>
	//    8   14:astore_0        
		i = ((TintTypedArray) (context)).getColor(0, 0);
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:iconst_0        
	//   12   18:invokevirtual   #117 <Method int TintTypedArray.getColor(int, int)>
	//   13   21:istore_1        
		((TintTypedArray) (context)).recycle();
	//   14   22:aload_0         
	//   15   23:invokevirtual   #120 <Method void TintTypedArray.recycle()>
		return i;
	//   16   26:iload_1         
	//   17   27:ireturn         
		Exception exception;
		exception;
	//   18   28:astore_2        
		((TintTypedArray) (context)).recycle();
	//   19   29:aload_0         
	//   20   30:invokevirtual   #120 <Method void TintTypedArray.recycle()>
		throw exception;
	//   21   33:aload_2         
	//   22   34:athrow          
	}

	static int getThemeAttrColor(Context context, int i, float f)
	{
		i = getThemeAttrColor(context, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #122 <Method int getThemeAttrColor(Context, int)>
	//    3    5:istore_1        
		return ColorUtils.setAlphaComponent(i, Math.round((float)Color.alpha(i) * f));
	//    4    6:iload_1         
	//    5    7:iload_1         
	//    6    8:invokestatic    #128 <Method int Color.alpha(int)>
	//    7   11:i2f             
	//    8   12:fload_2         
	//    9   13:fmul            
	//   10   14:invokestatic    #134 <Method int Math.round(float)>
	//   11   17:invokestatic    #139 <Method int ColorUtils.setAlphaComponent(int, int)>
	//   12   20:ireturn         
	}

	public static ColorStateList getThemeAttrColorStateList(Context context, int i)
	{
		TEMP_ARRAY[0] = i;
	//    0    0:getstatic       #52  <Field int[] TEMP_ARRAY>
	//    1    3:iconst_0        
	//    2    4:iload_1         
	//    3    5:iastore         
		context = ((Context) (TintTypedArray.obtainStyledAttributes(context, ((android.util.AttributeSet) (null)), TEMP_ARRAY)));
	//    4    6:aload_0         
	//    5    7:aconst_null     
	//    6    8:getstatic       #52  <Field int[] TEMP_ARRAY>
	//    7   11:invokestatic    #113 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, android.util.AttributeSet, int[])>
	//    8   14:astore_0        
		ColorStateList colorstatelist = ((TintTypedArray) (context)).getColorStateList(0);
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:invokevirtual   #143 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//   12   20:astore_2        
		((TintTypedArray) (context)).recycle();
	//   13   21:aload_0         
	//   14   22:invokevirtual   #120 <Method void TintTypedArray.recycle()>
		return colorstatelist;
	//   15   25:aload_2         
	//   16   26:areturn         
		Exception exception;
		exception;
	//   17   27:astore_2        
		((TintTypedArray) (context)).recycle();
	//   18   28:aload_0         
	//   19   29:invokevirtual   #120 <Method void TintTypedArray.recycle()>
		throw exception;
	//   20   32:aload_2         
	//   21   33:athrow          
	}

	private static TypedValue getTypedValue()
	{
		TypedValue typedvalue1 = (TypedValue)TL_TYPED_VALUE.get();
	//    0    0:getstatic       #26  <Field ThreadLocal TL_TYPED_VALUE>
	//    1    3:invokevirtual   #147 <Method Object ThreadLocal.get()>
	//    2    6:checkcast       #99  <Class TypedValue>
	//    3    9:astore_1        
		TypedValue typedvalue = typedvalue1;
	//    4   10:aload_1         
	//    5   11:astore_0        
		if(typedvalue1 == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       31
		{
			typedvalue = new TypedValue();
	//    8   16:new             #99  <Class TypedValue>
	//    9   19:dup             
	//   10   20:invokespecial   #148 <Method void TypedValue()>
	//   11   23:astore_0        
			TL_TYPED_VALUE.set(((Object) (typedvalue)));
	//   12   24:getstatic       #26  <Field ThreadLocal TL_TYPED_VALUE>
	//   13   27:aload_0         
	//   14   28:invokevirtual   #152 <Method void ThreadLocal.set(Object)>
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
	//    0    0:new             #21  <Class ThreadLocal>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void ThreadLocal()>
	//    3    7:putstatic       #26  <Field ThreadLocal TL_TYPED_VALUE>
	//    4   10:iconst_1        
	//    5   11:newarray        int[]
	//    6   13:dup             
	//    7   14:iconst_0        
	//    8   15:ldc1            #27  <Int 0xfefeff62>
	//    9   17:iastore         
	//   10   18:putstatic       #29  <Field int[] DISABLED_STATE_SET>
	//   11   21:iconst_1        
	//   12   22:newarray        int[]
	//   13   24:dup             
	//   14   25:iconst_0        
	//   15   26:ldc1            #30  <Int 0x101009c>
	//   16   28:iastore         
	//   17   29:putstatic       #32  <Field int[] FOCUSED_STATE_SET>
	//   18   32:iconst_1        
	//   19   33:newarray        int[]
	//   20   35:dup             
	//   21   36:iconst_0        
	//   22   37:ldc1            #33  <Int 0x10102fe>
	//   23   39:iastore         
	//   24   40:putstatic       #35  <Field int[] ACTIVATED_STATE_SET>
	//   25   43:iconst_1        
	//   26   44:newarray        int[]
	//   27   46:dup             
	//   28   47:iconst_0        
	//   29   48:ldc1            #36  <Int 0x10100a7>
	//   30   50:iastore         
	//   31   51:putstatic       #38  <Field int[] PRESSED_STATE_SET>
	//   32   54:iconst_1        
	//   33   55:newarray        int[]
	//   34   57:dup             
	//   35   58:iconst_0        
	//   36   59:ldc1            #39  <Int 0x10100a0>
	//   37   61:iastore         
	//   38   62:putstatic       #41  <Field int[] CHECKED_STATE_SET>
	//   39   65:iconst_1        
	//   40   66:newarray        int[]
	//   41   68:dup             
	//   42   69:iconst_0        
	//   43   70:ldc1            #42  <Int 0x10100a1>
	//   44   72:iastore         
	//   45   73:putstatic       #44  <Field int[] SELECTED_STATE_SET>
	//   46   76:iconst_2        
	//   47   77:newarray        int[]
	//   48   79:dup             
	//   49   80:iconst_0        
	//   50   81:ldc1            #45  <Int 0xfefeff59>
	//   51   83:iastore         
	//   52   84:dup             
	//   53   85:iconst_1        
	//   54   86:ldc1            #46  <Int 0xfefeff64>
	//   55   88:iastore         
	//   56   89:putstatic       #48  <Field int[] NOT_PRESSED_OR_FOCUSED_STATE_SET>
	//   57   92:iconst_0        
	//   58   93:newarray        int[]
	//   59   95:putstatic       #50  <Field int[] EMPTY_STATE_SET>
	//   60   98:iconst_1        
	//   61   99:newarray        int[]
	//   62  101:putstatic       #52  <Field int[] TEMP_ARRAY>
	//*  63  104:return          
	}
}
