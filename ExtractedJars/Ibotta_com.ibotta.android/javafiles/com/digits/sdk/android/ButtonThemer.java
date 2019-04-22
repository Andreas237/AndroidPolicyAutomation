// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.digits.sdk.android:
//			ThemeUtils

class ButtonThemer
{

	public ButtonThemer(Resources resources1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		resources = resources1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field Resources resources>
	//    5    9:return          
	}

	private int getPressedColor(int i)
	{
		if(ThemeUtils.isLightColor(i))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #22  <Method boolean ThemeUtils.isLightColor(int)>
	//*   2    4:ifeq            17
			return ThemeUtils.calculateOpacityTransform(0.20000000000000001D, 0xff000000, i);
	//    3    7:ldc2w           #23  <Double 0.20000000000000001D>
	//    4   10:ldc1            #25  <Int 0xff000000>
	//    5   12:iload_1         
	//    6   13:invokestatic    #29  <Method int ThemeUtils.calculateOpacityTransform(double, int, int)>
	//    7   16:ireturn         
		else
			return ThemeUtils.calculateOpacityTransform(0.20000000000000001D, -1, i);
	//    8   17:ldc2w           #23  <Double 0.20000000000000001D>
	//    9   20:iconst_m1       
	//   10   21:iload_1         
	//   11   22:invokestatic    #29  <Method int ThemeUtils.calculateOpacityTransform(double, int, int)>
	//   12   25:ireturn         
	}

	void disableDropShadow(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #40  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          18
		{
			view.setStateListAnimator(((android.animation.StateListAnimator) (null)));
	//    3    8:aload_1         
	//    4    9:aconst_null     
	//    5   10:invokevirtual   #46  <Method void View.setStateListAnimator(android.animation.StateListAnimator)>
			view.setElevation(0.0F);
	//    6   13:aload_1         
	//    7   14:fconst_0        
	//    8   15:invokevirtual   #50  <Method void View.setElevation(float)>
		}
	//    9   18:return          
	}

	int getTextColor(int i)
	{
		Resources resources1;
		if(ThemeUtils.isLightColor(i))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #22  <Method boolean ThemeUtils.isLightColor(int)>
	//*   2    4:ifeq            19
		{
			resources1 = resources;
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field Resources resources>
	//    5   11:astore_2        
			i = R.color.dgts__text_dark;
	//    6   12:getstatic       #57  <Field int R$color.dgts__text_dark>
	//    7   15:istore_1        
		} else
	//*   8   16:goto            28
		{
			resources1 = resources;
	//    9   19:aload_0         
	//   10   20:getfield        #13  <Field Resources resources>
	//   11   23:astore_2        
			i = R.color.dgts__text_light;
	//   12   24:getstatic       #60  <Field int R$color.dgts__text_light>
	//   13   27:istore_1        
		}
		return resources1.getColor(i);
	//   14   28:aload_2         
	//   15   29:iload_1         
	//   16   30:invokevirtual   #65  <Method int Resources.getColor(int)>
	//   17   33:ireturn         
	}

	void setBackgroundAccentColor(View view, int i)
	{
		StateListDrawable statelistdrawable = new StateListDrawable();
	//    0    0:new             #70  <Class StateListDrawable>
	//    1    3:dup             
	//    2    4:invokespecial   #71  <Method void StateListDrawable()>
	//    3    7:astore          4
		float f = TypedValue.applyDimension(1, 5F, resources.getDisplayMetrics());
	//    4    9:iconst_1        
	//    5   10:ldc1            #72  <Float 5F>
	//    6   12:aload_0         
	//    7   13:getfield        #13  <Field Resources resources>
	//    8   16:invokevirtual   #76  <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//    9   19:invokestatic    #82  <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   10   22:fstore_3        
		GradientDrawable gradientdrawable = new GradientDrawable();
	//   11   23:new             #84  <Class GradientDrawable>
	//   12   26:dup             
	//   13   27:invokespecial   #85  <Method void GradientDrawable()>
	//   14   30:astore          5
		gradientdrawable.setCornerRadius(f);
	//   15   32:aload           5
	//   16   34:fload_3         
	//   17   35:invokevirtual   #88  <Method void GradientDrawable.setCornerRadius(float)>
		gradientdrawable.setColor(getPressedColor(i));
	//   18   38:aload           5
	//   19   40:aload_0         
	//   20   41:iload_2         
	//   21   42:invokespecial   #90  <Method int getPressedColor(int)>
	//   22   45:invokevirtual   #94  <Method void GradientDrawable.setColor(int)>
		statelistdrawable.addState(new int[] {
			0x101009c, 0x10100a7
		}, ((android.graphics.drawable.Drawable) (gradientdrawable)));
	//   23   48:aload           4
	//   24   50:iconst_2        
	//   25   51:newarray        int[]
	//   26   53:dup             
	//   27   54:iconst_0        
	//   28   55:ldc1            #95  <Int 0x101009c>
	//   29   57:iastore         
	//   30   58:dup             
	//   31   59:iconst_1        
	//   32   60:ldc1            #96  <Int 0x10100a7>
	//   33   62:iastore         
	//   34   63:aload           5
	//   35   65:invokevirtual   #100 <Method void StateListDrawable.addState(int[], android.graphics.drawable.Drawable)>
		statelistdrawable.addState(new int[] {
			0xfefeff64, 0x10100a7
		}, ((android.graphics.drawable.Drawable) (gradientdrawable)));
	//   36   68:aload           4
	//   37   70:iconst_2        
	//   38   71:newarray        int[]
	//   39   73:dup             
	//   40   74:iconst_0        
	//   41   75:ldc1            #101 <Int 0xfefeff64>
	//   42   77:iastore         
	//   43   78:dup             
	//   44   79:iconst_1        
	//   45   80:ldc1            #96  <Int 0x10100a7>
	//   46   82:iastore         
	//   47   83:aload           5
	//   48   85:invokevirtual   #100 <Method void StateListDrawable.addState(int[], android.graphics.drawable.Drawable)>
		statelistdrawable.addState(new int[] {
			0x101009c
		}, ((android.graphics.drawable.Drawable) (gradientdrawable)));
	//   49   88:aload           4
	//   50   90:iconst_1        
	//   51   91:newarray        int[]
	//   52   93:dup             
	//   53   94:iconst_0        
	//   54   95:ldc1            #95  <Int 0x101009c>
	//   55   97:iastore         
	//   56   98:aload           5
	//   57  100:invokevirtual   #100 <Method void StateListDrawable.addState(int[], android.graphics.drawable.Drawable)>
		gradientdrawable = new GradientDrawable();
	//   58  103:new             #84  <Class GradientDrawable>
	//   59  106:dup             
	//   60  107:invokespecial   #85  <Method void GradientDrawable()>
	//   61  110:astore          5
		gradientdrawable.setColor(i);
	//   62  112:aload           5
	//   63  114:iload_2         
	//   64  115:invokevirtual   #94  <Method void GradientDrawable.setColor(int)>
		gradientdrawable.setCornerRadius(f);
	//   65  118:aload           5
	//   66  120:fload_3         
	//   67  121:invokevirtual   #88  <Method void GradientDrawable.setCornerRadius(float)>
		statelistdrawable.addState(StateSet.WILD_CARD, ((android.graphics.drawable.Drawable) (gradientdrawable)));
	//   68  124:aload           4
	//   69  126:getstatic       #107 <Field int[] StateSet.WILD_CARD>
	//   70  129:aload           5
	//   71  131:invokevirtual   #100 <Method void StateListDrawable.addState(int[], android.graphics.drawable.Drawable)>
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  72  134:getstatic       #40  <Field int android.os.Build$VERSION.SDK_INT>
	//*  73  137:bipush          16
	//*  74  139:icmplt          149
		{
			view.setBackground(((android.graphics.drawable.Drawable) (statelistdrawable)));
	//   75  142:aload_1         
	//   76  143:aload           4
	//   77  145:invokevirtual   #111 <Method void View.setBackground(android.graphics.drawable.Drawable)>
			return;
	//   78  148:return          
		} else
		{
			view.setBackgroundDrawable(((android.graphics.drawable.Drawable) (statelistdrawable)));
	//   79  149:aload_1         
	//   80  150:aload           4
	//   81  152:invokevirtual   #114 <Method void View.setBackgroundDrawable(android.graphics.drawable.Drawable)>
			return;
	//   82  155:return          
		}
	}

	void setBackgroundAccentColorInverse(View view, int i)
	{
		StateListDrawable statelistdrawable = new StateListDrawable();
	//    0    0:new             #70  <Class StateListDrawable>
	//    1    3:dup             
	//    2    4:invokespecial   #71  <Method void StateListDrawable()>
	//    3    7:astore          6
		float f = TypedValue.applyDimension(1, 5F, resources.getDisplayMetrics());
	//    4    9:iconst_1        
	//    5   10:ldc1            #72  <Float 5F>
	//    6   12:aload_0         
	//    7   13:getfield        #13  <Field Resources resources>
	//    8   16:invokevirtual   #76  <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//    9   19:invokestatic    #82  <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   10   22:fstore_3        
		float f1 = TypedValue.applyDimension(1, 2.0F, resources.getDisplayMetrics());
	//   11   23:iconst_1        
	//   12   24:fconst_2        
	//   13   25:aload_0         
	//   14   26:getfield        #13  <Field Resources resources>
	//   15   29:invokevirtual   #76  <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   16   32:invokestatic    #82  <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   17   35:fstore          4
		GradientDrawable gradientdrawable = new GradientDrawable();
	//   18   37:new             #84  <Class GradientDrawable>
	//   19   40:dup             
	//   20   41:invokespecial   #85  <Method void GradientDrawable()>
	//   21   44:astore          7
		gradientdrawable.setCornerRadius(f);
	//   22   46:aload           7
	//   23   48:fload_3         
	//   24   49:invokevirtual   #88  <Method void GradientDrawable.setCornerRadius(float)>
		int j = (int)f1;
	//   25   52:fload           4
	//   26   54:f2i             
	//   27   55:istore          5
		gradientdrawable.setStroke(j, getPressedColor(i));
	//   28   57:aload           7
	//   29   59:iload           5
	//   30   61:aload_0         
	//   31   62:iload_2         
	//   32   63:invokespecial   #90  <Method int getPressedColor(int)>
	//   33   66:invokevirtual   #119 <Method void GradientDrawable.setStroke(int, int)>
		statelistdrawable.addState(new int[] {
			0x101009c, 0x10100a7
		}, ((android.graphics.drawable.Drawable) (gradientdrawable)));
	//   34   69:aload           6
	//   35   71:iconst_2        
	//   36   72:newarray        int[]
	//   37   74:dup             
	//   38   75:iconst_0        
	//   39   76:ldc1            #95  <Int 0x101009c>
	//   40   78:iastore         
	//   41   79:dup             
	//   42   80:iconst_1        
	//   43   81:ldc1            #96  <Int 0x10100a7>
	//   44   83:iastore         
	//   45   84:aload           7
	//   46   86:invokevirtual   #100 <Method void StateListDrawable.addState(int[], android.graphics.drawable.Drawable)>
		statelistdrawable.addState(new int[] {
			0xfefeff64, 0x10100a7
		}, ((android.graphics.drawable.Drawable) (gradientdrawable)));
	//   47   89:aload           6
	//   48   91:iconst_2        
	//   49   92:newarray        int[]
	//   50   94:dup             
	//   51   95:iconst_0        
	//   52   96:ldc1            #101 <Int 0xfefeff64>
	//   53   98:iastore         
	//   54   99:dup             
	//   55  100:iconst_1        
	//   56  101:ldc1            #96  <Int 0x10100a7>
	//   57  103:iastore         
	//   58  104:aload           7
	//   59  106:invokevirtual   #100 <Method void StateListDrawable.addState(int[], android.graphics.drawable.Drawable)>
		statelistdrawable.addState(new int[] {
			0x101009c
		}, ((android.graphics.drawable.Drawable) (gradientdrawable)));
	//   60  109:aload           6
	//   61  111:iconst_1        
	//   62  112:newarray        int[]
	//   63  114:dup             
	//   64  115:iconst_0        
	//   65  116:ldc1            #95  <Int 0x101009c>
	//   66  118:iastore         
	//   67  119:aload           7
	//   68  121:invokevirtual   #100 <Method void StateListDrawable.addState(int[], android.graphics.drawable.Drawable)>
		gradientdrawable = new GradientDrawable();
	//   69  124:new             #84  <Class GradientDrawable>
	//   70  127:dup             
	//   71  128:invokespecial   #85  <Method void GradientDrawable()>
	//   72  131:astore          7
		gradientdrawable.setCornerRadius(f);
	//   73  133:aload           7
	//   74  135:fload_3         
	//   75  136:invokevirtual   #88  <Method void GradientDrawable.setCornerRadius(float)>
		gradientdrawable.setStroke(j, i);
	//   76  139:aload           7
	//   77  141:iload           5
	//   78  143:iload_2         
	//   79  144:invokevirtual   #119 <Method void GradientDrawable.setStroke(int, int)>
		statelistdrawable.addState(StateSet.WILD_CARD, ((android.graphics.drawable.Drawable) (gradientdrawable)));
	//   80  147:aload           6
	//   81  149:getstatic       #107 <Field int[] StateSet.WILD_CARD>
	//   82  152:aload           7
	//   83  154:invokevirtual   #100 <Method void StateListDrawable.addState(int[], android.graphics.drawable.Drawable)>
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  84  157:getstatic       #40  <Field int android.os.Build$VERSION.SDK_INT>
	//*  85  160:bipush          16
	//*  86  162:icmplt          172
		{
			view.setBackground(((android.graphics.drawable.Drawable) (statelistdrawable)));
	//   87  165:aload_1         
	//   88  166:aload           6
	//   89  168:invokevirtual   #111 <Method void View.setBackground(android.graphics.drawable.Drawable)>
			return;
	//   90  171:return          
		} else
		{
			view.setBackgroundDrawable(((android.graphics.drawable.Drawable) (statelistdrawable)));
	//   91  172:aload_1         
	//   92  173:aload           6
	//   93  175:invokevirtual   #114 <Method void View.setBackgroundDrawable(android.graphics.drawable.Drawable)>
			return;
	//   94  178:return          
		}
	}

	void setTextAccentColor(TextView textview, int i)
	{
		textview.setTextColor(getTextColor(i));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #123 <Method int getTextColor(int)>
	//    4    6:invokevirtual   #128 <Method void TextView.setTextColor(int)>
	//    5    9:return          
	}

	void setTextAccentColorInverse(TextView textview, int i)
	{
		int j = getPressedColor(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokespecial   #90  <Method int getPressedColor(int)>
	//    3    5:istore_3        
		textview.setTextColor(new ColorStateList(new int[][] {
			new int[] {
				0x101009c, 0xfefeff59
			}, new int[] {
				0x101009c, 0x10100a7
			}, new int[] {
				0xfefeff64, 0x10100a7
			}, StateSet.WILD_CARD
		}, new int[] {
			i, j, j, i
		}));
	//    4    6:aload_1         
	//    5    7:new             #131 <Class ColorStateList>
	//    6   10:dup             
	//    7   11:iconst_4        
	//    8   12:anewarray       int[][]
	//    9   15:dup             
	//   10   16:iconst_0        
	//   11   17:iconst_2        
	//   12   18:newarray        int[]
	//   13   20:dup             
	//   14   21:iconst_0        
	//   15   22:ldc1            #95  <Int 0x101009c>
	//   16   24:iastore         
	//   17   25:dup             
	//   18   26:iconst_1        
	//   19   27:ldc1            #133 <Int 0xfefeff59>
	//   20   29:iastore         
	//   21   30:aastore         
	//   22   31:dup             
	//   23   32:iconst_1        
	//   24   33:iconst_2        
	//   25   34:newarray        int[]
	//   26   36:dup             
	//   27   37:iconst_0        
	//   28   38:ldc1            #95  <Int 0x101009c>
	//   29   40:iastore         
	//   30   41:dup             
	//   31   42:iconst_1        
	//   32   43:ldc1            #96  <Int 0x10100a7>
	//   33   45:iastore         
	//   34   46:aastore         
	//   35   47:dup             
	//   36   48:iconst_2        
	//   37   49:iconst_2        
	//   38   50:newarray        int[]
	//   39   52:dup             
	//   40   53:iconst_0        
	//   41   54:ldc1            #101 <Int 0xfefeff64>
	//   42   56:iastore         
	//   43   57:dup             
	//   44   58:iconst_1        
	//   45   59:ldc1            #96  <Int 0x10100a7>
	//   46   61:iastore         
	//   47   62:aastore         
	//   48   63:dup             
	//   49   64:iconst_3        
	//   50   65:getstatic       #107 <Field int[] StateSet.WILD_CARD>
	//   51   68:aastore         
	//   52   69:iconst_4        
	//   53   70:newarray        int[]
	//   54   72:dup             
	//   55   73:iconst_0        
	//   56   74:iload_2         
	//   57   75:iastore         
	//   58   76:dup             
	//   59   77:iconst_1        
	//   60   78:iload_3         
	//   61   79:iastore         
	//   62   80:dup             
	//   63   81:iconst_2        
	//   64   82:iload_3         
	//   65   83:iastore         
	//   66   84:dup             
	//   67   85:iconst_3        
	//   68   86:iload_2         
	//   69   87:iastore         
	//   70   88:invokespecial   #136 <Method void ColorStateList(int[][], int[])>
	//   71   91:invokevirtual   #139 <Method void TextView.setTextColor(ColorStateList)>
	//   72   94:return          
	}

	private final Resources resources;
}
