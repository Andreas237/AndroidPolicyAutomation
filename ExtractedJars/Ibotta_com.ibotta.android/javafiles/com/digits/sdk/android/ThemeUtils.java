// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import java.lang.reflect.Field;

class ThemeUtils
{

	static int calculateOpacityTransform(double d, int i, int j)
	{
		int k = Color.red(j);
	//    0    0:iload_3         
	//    1    1:invokestatic    #12  <Method int Color.red(int)>
	//    2    4:istore          6
		int l = Color.red(i);
	//    3    6:iload_2         
	//    4    7:invokestatic    #12  <Method int Color.red(int)>
	//    5   10:istore          7
		int i1 = Color.green(j);
	//    6   12:iload_3         
	//    7   13:invokestatic    #15  <Method int Color.green(int)>
	//    8   16:istore          8
		int j1 = Color.green(i);
	//    9   18:iload_2         
	//   10   19:invokestatic    #15  <Method int Color.green(int)>
	//   11   22:istore          9
		j = Color.blue(j);
	//   12   24:iload_3         
	//   13   25:invokestatic    #18  <Method int Color.blue(int)>
	//   14   28:istore_3        
		i = Color.blue(i);
	//   15   29:iload_2         
	//   16   30:invokestatic    #18  <Method int Color.blue(int)>
	//   17   33:istore_2        
		double d1 = 1.0D - d;
	//   18   34:dconst_1        
	//   19   35:dload_0         
	//   20   36:dsub            
	//   21   37:dstore          4
		return Color.rgb((int)((double)k * d1 + (double)l * d), (int)((double)i1 * d1 + (double)j1 * d), (int)(d1 * (double)j + d * (double)i));
	//   22   39:iload           6
	//   23   41:i2d             
	//   24   42:dload           4
	//   25   44:dmul            
	//   26   45:iload           7
	//   27   47:i2d             
	//   28   48:dload_0         
	//   29   49:dmul            
	//   30   50:dadd            
	//   31   51:d2i             
	//   32   52:iload           8
	//   33   54:i2d             
	//   34   55:dload           4
	//   35   57:dmul            
	//   36   58:iload           9
	//   37   60:i2d             
	//   38   61:dload_0         
	//   39   62:dmul            
	//   40   63:dadd            
	//   41   64:d2i             
	//   42   65:dload           4
	//   43   67:iload_3         
	//   44   68:i2d             
	//   45   69:dmul            
	//   46   70:dload_0         
	//   47   71:iload_2         
	//   48   72:i2d             
	//   49   73:dmul            
	//   50   74:dadd            
	//   51   75:d2i             
	//   52   76:invokestatic    #22  <Method int Color.rgb(int, int, int)>
	//   53   79:ireturn         
	}

	static int getAccentColor(Resources resources, android.content.res.Resources.Theme theme)
	{
		TypedValue typedvalue = getTypedValueColor(theme, R.attr.dgts__accentColor);
	//    0    0:aload_1         
	//    1    1:getstatic       #36  <Field int R$attr.dgts__accentColor>
	//    2    4:invokestatic    #40  <Method TypedValue getTypedValueColor(android.content.res.Resources$Theme, int)>
	//    3    7:astore_3        
		if(typedvalue != null)
	//*   4    8:aload_3         
	//*   5    9:ifnull          17
			return typedvalue.data;
	//    6   12:aload_3         
	//    7   13:getfield        #45  <Field int TypedValue.data>
	//    8   16:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   9   17:getstatic       #50  <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   20:bipush          21
	//*  11   22:icmplt          41
		{
			TypedValue typedvalue1 = getTypedValueColor(theme, 0x1010435);
	//   12   25:aload_1         
	//   13   26:ldc1            #51  <Int 0x1010435>
	//   14   28:invokestatic    #40  <Method TypedValue getTypedValueColor(android.content.res.Resources$Theme, int)>
	//   15   31:astore_3        
			if(typedvalue1 != null)
	//*  16   32:aload_3         
	//*  17   33:ifnull          41
				return typedvalue1.data;
	//   18   36:aload_3         
	//   19   37:getfield        #45  <Field int TypedValue.data>
	//   20   40:ireturn         
		}
		Field field = ((Class) (com/digits/sdk/android/R$attr)).getDeclaredField("colorAccent");
	//   21   41:ldc1            #32  <Class R$attr>
	//   22   43:ldc1            #53  <String "colorAccent">
	//   23   45:invokevirtual   #59  <Method Field Class.getDeclaredField(String)>
	//   24   48:astore_3        
		theme = ((android.content.res.Resources.Theme) (getTypedValueColor(theme, field.getInt(((Object) (field.getType()))))));
	//   25   49:aload_1         
	//   26   50:aload_3         
	//   27   51:aload_3         
	//   28   52:invokevirtual   #65  <Method Class Field.getType()>
	//   29   55:invokevirtual   #69  <Method int Field.getInt(Object)>
	//   30   58:invokestatic    #40  <Method TypedValue getTypedValueColor(android.content.res.Resources$Theme, int)>
	//   31   61:astore_1        
		if(theme == null)
			break MISSING_BLOCK_LABEL_73;
	//   32   62:aload_1         
	//   33   63:ifnull          73
		int i = ((TypedValue) (theme)).data;
	//   34   66:aload_1         
	//   35   67:getfield        #45  <Field int TypedValue.data>
	//   36   70:istore_2        
		return i;
	//   37   71:iload_2         
	//   38   72:ireturn         
_L2:
		return resources.getColor(R.color.dgts__default_accent);
	//   39   73:aload_0         
	//   40   74:getstatic       #74  <Field int R$color.dgts__default_accent>
	//   41   77:invokevirtual   #79  <Method int Resources.getColor(int)>
	//   42   80:ireturn         
		theme;
	//   43   81:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  44   82:goto            73
	}

	static Drawable getLogoDrawable(android.content.res.Resources.Theme theme)
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #42  <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #86  <Method void TypedValue()>
	//    3    7:astore_2        
		int i = R.attr.dgts__logoDrawable;
	//    4    8:getstatic       #89  <Field int R$attr.dgts__logoDrawable>
	//    5   11:istore_1        
		return theme.obtainStyledAttributes(typedvalue.data, new int[] {
			i
		}).getDrawable(0);
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:getfield        #45  <Field int TypedValue.data>
	//    9   17:iconst_1        
	//   10   18:newarray        int[]
	//   11   20:dup             
	//   12   21:iconst_0        
	//   13   22:iload_1         
	//   14   23:iastore         
	//   15   24:invokevirtual   #95  <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(int, int[])>
	//   16   27:iconst_0        
	//   17   28:invokevirtual   #101 <Method Drawable TypedArray.getDrawable(int)>
	//   18   31:areturn         
	}

	static TypedValue getTypedValueColor(android.content.res.Resources.Theme theme, int i)
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #42  <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #86  <Method void TypedValue()>
	//    3    7:astore_2        
		theme.resolveAttribute(i, typedvalue, true);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:aload_2         
	//    7   11:iconst_1        
	//    8   12:invokevirtual   #105 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//    9   15:pop             
		if(typedvalue.type >= 28 && typedvalue.type <= 31)
	//*  10   16:aload_2         
	//*  11   17:getfield        #108 <Field int TypedValue.type>
	//*  12   20:bipush          28
	//*  13   22:icmplt          36
	//*  14   25:aload_2         
	//*  15   26:getfield        #108 <Field int TypedValue.type>
	//*  16   29:bipush          31
	//*  17   31:icmpgt          36
			return typedvalue;
	//   18   34:aload_2         
	//   19   35:areturn         
		else
			return null;
	//   20   36:aconst_null     
	//   21   37:areturn         
	}

	static boolean isLightColor(int i)
	{
		int j = Color.red(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #12  <Method int Color.red(int)>
	//    2    4:istore_1        
		int k = Color.green(i);
	//    3    5:iload_0         
	//    4    6:invokestatic    #15  <Method int Color.green(int)>
	//    5    9:istore_2        
		i = Color.blue(i);
	//    6   10:iload_0         
	//    7   11:invokestatic    #18  <Method int Color.blue(int)>
	//    8   14:istore_0        
		return (double)j * 0.20999999999999999D + (double)k * 0.71999999999999997D + (double)i * 0.070000000000000007D > 170D;
	//    9   15:iload_1         
	//   10   16:i2d             
	//   11   17:ldc2w           #111 <Double 0.20999999999999999D>
	//   12   20:dmul            
	//   13   21:iload_2         
	//   14   22:i2d             
	//   15   23:ldc2w           #113 <Double 0.71999999999999997D>
	//   16   26:dmul            
	//   17   27:dadd            
	//   18   28:iload_0         
	//   19   29:i2d             
	//   20   30:ldc2w           #115 <Double 0.070000000000000007D>
	//   21   33:dmul            
	//   22   34:dadd            
	//   23   35:ldc2w           #117 <Double 170D>
	//   24   38:dcmpl           
	//   25   39:ifle            44
	//   26   42:iconst_1        
	//   27   43:ireturn         
	//   28   44:iconst_0        
	//   29   45:ireturn         
	}
}
