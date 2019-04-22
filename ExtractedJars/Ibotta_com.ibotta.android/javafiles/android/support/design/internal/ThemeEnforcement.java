// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;

public final class ThemeEnforcement
{

	public static void checkAppCompatTheme(Context context)
	{
		checkTheme(context, APPCOMPAT_CHECK_ATTRS, "Theme.AppCompat");
	//    0    0:aload_0         
	//    1    1:getstatic       #21  <Field int[] APPCOMPAT_CHECK_ATTRS>
	//    2    4:ldc1            #31  <String "Theme.AppCompat">
	//    3    6:invokestatic    #35  <Method void checkTheme(Context, int[], String)>
	//    4    9:return          
	}

	private static void checkCompatibleTheme(Context context, AttributeSet attributeset, int i, int j)
	{
		attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.ThemeEnforcement, i, j)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #44  <Field int[] android.support.design.R$styleable.ThemeEnforcement>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #50  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//    6   10:astore_1        
		boolean flag = ((TypedArray) (attributeset)).getBoolean(android.support.design.R.styleable.ThemeEnforcement_enforceMaterialTheme, false);
	//    7   11:aload_1         
	//    8   12:getstatic       #53  <Field int android.support.design.R$styleable.ThemeEnforcement_enforceMaterialTheme>
	//    9   15:iconst_0        
	//   10   16:invokevirtual   #59  <Method boolean TypedArray.getBoolean(int, boolean)>
	//   11   19:istore          4
		((TypedArray) (attributeset)).recycle();
	//   12   21:aload_1         
	//   13   22:invokevirtual   #62  <Method void TypedArray.recycle()>
		if(flag)
	//*  14   25:iload           4
	//*  15   27:ifeq            34
			checkMaterialTheme(context);
	//   16   30:aload_0         
	//   17   31:invokestatic    #65  <Method void checkMaterialTheme(Context)>
		checkAppCompatTheme(context);
	//   18   34:aload_0         
	//   19   35:invokestatic    #67  <Method void checkAppCompatTheme(Context)>
	//   20   38:return          
	}

	public static void checkMaterialTheme(Context context)
	{
		checkTheme(context, MATERIAL_CHECK_ATTRS, "Theme.MaterialComponents");
	//    0    0:aload_0         
	//    1    1:getstatic       #26  <Field int[] MATERIAL_CHECK_ATTRS>
	//    2    4:ldc1            #70  <String "Theme.MaterialComponents">
	//    3    6:invokestatic    #35  <Method void checkTheme(Context, int[], String)>
	//    4    9:return          
	}

	private static transient void checkTextAppearance(Context context, AttributeSet attributeset, int ai[], int i, int j, int ai1[])
	{
		TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.ThemeEnforcement, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #44  <Field int[] android.support.design.R$styleable.ThemeEnforcement>
	//    3    5:iload_3         
	//    4    6:iload           4
	//    5    8:invokevirtual   #50  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//    6   11:astore          7
		if(!typedarray.getBoolean(android.support.design.R.styleable.ThemeEnforcement_enforceTextAppearance, false))
	//*   7   13:aload           7
	//*   8   15:getstatic       #76  <Field int android.support.design.R$styleable.ThemeEnforcement_enforceTextAppearance>
	//*   9   18:iconst_0        
	//*  10   19:invokevirtual   #59  <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  11   22:ifne            31
		{
			typedarray.recycle();
	//   12   25:aload           7
	//   13   27:invokevirtual   #62  <Method void TypedArray.recycle()>
			return;
	//   14   30:return          
		}
		boolean flag;
		if(ai1 != null && ai1.length != 0)
	//*  15   31:aload           5
	//*  16   33:ifnull          61
	//*  17   36:aload           5
	//*  18   38:arraylength     
	//*  19   39:ifne            45
	//*  20   42:goto            61
			flag = isCustomTextAppearanceValid(context, attributeset, ai, i, j, ai1);
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:aload_2         
	//   24   48:iload_3         
	//   25   49:iload           4
	//   26   51:aload           5
	//   27   53:invokestatic    #80  <Method boolean isCustomTextAppearanceValid(Context, AttributeSet, int[], int, int, int[])>
	//   28   56:istore          6
		else
	//*  29   58:goto            83
		if(typedarray.getResourceId(android.support.design.R.styleable.ThemeEnforcement_android_textAppearance, -1) != -1)
	//*  30   61:aload           7
	//*  31   63:getstatic       #83  <Field int android.support.design.R$styleable.ThemeEnforcement_android_textAppearance>
	//*  32   66:iconst_m1       
	//*  33   67:invokevirtual   #87  <Method int TypedArray.getResourceId(int, int)>
	//*  34   70:iconst_m1       
	//*  35   71:icmpeq          80
			flag = true;
	//   36   74:iconst_1        
	//   37   75:istore          6
		else
	//*  38   77:goto            83
			flag = false;
	//   39   80:iconst_0        
	//   40   81:istore          6
		typedarray.recycle();
	//   41   83:aload           7
	//   42   85:invokevirtual   #62  <Method void TypedArray.recycle()>
		if(flag)
	//*  43   88:iload           6
	//*  44   90:ifeq            94
			return;
	//   45   93:return          
		else
			throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
	//   46   94:new             #89  <Class IllegalArgumentException>
	//   47   97:dup             
	//   48   98:ldc1            #91  <String "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).">
	//   49  100:invokespecial   #95  <Method void IllegalArgumentException(String)>
	//   50  103:athrow          
	}

	private static void checkTheme(Context context, int ai[], String s)
	{
		if(isTheme(context, ai))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokestatic    #99  <Method boolean isTheme(Context, int[])>
	//*   3    5:ifeq            9
		{
			return;
	//    4    8:return          
		} else
		{
			context = ((Context) (new StringBuilder()));
	//    5    9:new             #101 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #103 <Method void StringBuilder()>
	//    8   16:astore_0        
			((StringBuilder) (context)).append("The style on this component requires your app theme to be ");
	//    9   17:aload_0         
	//   10   18:ldc1            #105 <String "The style on this component requires your app theme to be ">
	//   11   20:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
			((StringBuilder) (context)).append(s);
	//   13   24:aload_0         
	//   14   25:aload_2         
	//   15   26:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   16   29:pop             
			((StringBuilder) (context)).append(" (or a descendant).");
	//   17   30:aload_0         
	//   18   31:ldc1            #111 <String " (or a descendant).">
	//   19   33:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   20   36:pop             
			throw new IllegalArgumentException(((StringBuilder) (context)).toString());
	//   21   37:new             #89  <Class IllegalArgumentException>
	//   22   40:dup             
	//   23   41:aload_0         
	//   24   42:invokevirtual   #115 <Method String StringBuilder.toString()>
	//   25   45:invokespecial   #95  <Method void IllegalArgumentException(String)>
	//   26   48:athrow          
		}
	}

	private static transient boolean isCustomTextAppearanceValid(Context context, AttributeSet attributeset, int ai[], int i, int j, int ai1[])
	{
		context = ((Context) (context.obtainStyledAttributes(attributeset, ai, i, j)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokevirtual   #50  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//    6    9:astore_0        
		j = ai1.length;
	//    7   10:aload           5
	//    8   12:arraylength     
	//    9   13:istore          4
		for(i = 0; i < j; i++)
	//*  10   15:iconst_0        
	//*  11   16:istore_3        
	//*  12   17:iload_3         
	//*  13   18:iload           4
	//*  14   20:icmpge          49
			if(((TypedArray) (context)).getResourceId(ai1[i], -1) == -1)
	//*  15   23:aload_0         
	//*  16   24:aload           5
	//*  17   26:iload_3         
	//*  18   27:iaload          
	//*  19   28:iconst_m1       
	//*  20   29:invokevirtual   #87  <Method int TypedArray.getResourceId(int, int)>
	//*  21   32:iconst_m1       
	//*  22   33:icmpne          42
			{
				((TypedArray) (context)).recycle();
	//   23   36:aload_0         
	//   24   37:invokevirtual   #62  <Method void TypedArray.recycle()>
				return false;
	//   25   40:iconst_0        
	//   26   41:ireturn         
			}

	//   27   42:iload_3         
	//   28   43:iconst_1        
	//   29   44:iadd            
	//   30   45:istore_3        
	//*  31   46:goto            17
		((TypedArray) (context)).recycle();
	//   32   49:aload_0         
	//   33   50:invokevirtual   #62  <Method void TypedArray.recycle()>
		return true;
	//   34   53:iconst_1        
	//   35   54:ireturn         
	}

	private static boolean isTheme(Context context, int ai[])
	{
		context = ((Context) (context.obtainStyledAttributes(ai)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #118 <Method TypedArray Context.obtainStyledAttributes(int[])>
	//    3    5:astore_0        
		boolean flag = ((TypedArray) (context)).hasValue(0);
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #122 <Method boolean TypedArray.hasValue(int)>
	//    7   11:istore_2        
		((TypedArray) (context)).recycle();
	//    8   12:aload_0         
	//    9   13:invokevirtual   #62  <Method void TypedArray.recycle()>
		return flag;
	//   10   16:iload_2         
	//   11   17:ireturn         
	}

	public static transient TypedArray obtainStyledAttributes(Context context, AttributeSet attributeset, int ai[], int i, int j, int ai1[])
	{
		checkCompatibleTheme(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:invokestatic    #125 <Method void checkCompatibleTheme(Context, AttributeSet, int, int)>
		checkTextAppearance(context, attributeset, ai, i, j, ai1);
	//    5    8:aload_0         
	//    6    9:aload_1         
	//    7   10:aload_2         
	//    8   11:iload_3         
	//    9   12:iload           4
	//   10   14:aload           5
	//   11   16:invokestatic    #127 <Method void checkTextAppearance(Context, AttributeSet, int[], int, int, int[])>
		return context.obtainStyledAttributes(attributeset, ai, i, j);
	//   12   19:aload_0         
	//   13   20:aload_1         
	//   14   21:aload_2         
	//   15   22:iload_3         
	//   16   23:iload           4
	//   17   25:invokevirtual   #50  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   18   28:areturn         
	}

	public static transient TintTypedArray obtainTintedStyledAttributes(Context context, AttributeSet attributeset, int ai[], int i, int j, int ai1[])
	{
		checkCompatibleTheme(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:invokestatic    #125 <Method void checkCompatibleTheme(Context, AttributeSet, int, int)>
		checkTextAppearance(context, attributeset, ai, i, j, ai1);
	//    5    8:aload_0         
	//    6    9:aload_1         
	//    7   10:aload_2         
	//    8   11:iload_3         
	//    9   12:iload           4
	//   10   14:aload           5
	//   11   16:invokestatic    #127 <Method void checkTextAppearance(Context, AttributeSet, int[], int, int, int[])>
		return TintTypedArray.obtainStyledAttributes(context, attributeset, ai, i, j);
	//   12   19:aload_0         
	//   13   20:aload_1         
	//   14   21:aload_2         
	//   15   22:iload_3         
	//   16   23:iload           4
	//   17   25:invokestatic    #134 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   18   28:areturn         
	}

	private static final int APPCOMPAT_CHECK_ATTRS[];
	private static final int MATERIAL_CHECK_ATTRS[];

	static 
	{
		APPCOMPAT_CHECK_ATTRS = (new int[] {
			android.support.design.R.attr.colorPrimary
		});
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:getstatic       #19  <Field int android.support.design.R$attr.colorPrimary>
	//    5    8:iastore         
	//    6    9:putstatic       #21  <Field int[] APPCOMPAT_CHECK_ATTRS>
		MATERIAL_CHECK_ATTRS = (new int[] {
			android.support.design.R.attr.colorSecondary
		});
	//    7   12:iconst_1        
	//    8   13:newarray        int[]
	//    9   15:dup             
	//   10   16:iconst_0        
	//   11   17:getstatic       #24  <Field int android.support.design.R$attr.colorSecondary>
	//   12   20:iastore         
	//   13   21:putstatic       #26  <Field int[] MATERIAL_CHECK_ATTRS>
	//*  14   24:return          
	}
}
