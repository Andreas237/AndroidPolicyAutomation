// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v4.a.a.a;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.Button;
import com.google.android.gms.common.util.DeviceProperties;

// Referenced classes of package com.google.android.gms.common.internal:
//			Preconditions, SignInButtonConfig

public final class SignInButtonImpl extends Button
{

	public SignInButtonImpl(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #9   <Method void SignInButtonImpl(Context, AttributeSet)>
	//    4    6:return          
	}

	public SignInButtonImpl(Context context, AttributeSet attributeset)
	{
		super(context, attributeset, 0x1010048);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #11  <Int 0x1010048>
	//    4    5:invokespecial   #14  <Method void Button(Context, AttributeSet, int)>
	//    5    8:return          
	}

	private static int zaa(int i, int j, int k, int l)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 71
	//	               1 69
	//	               2 67
		default:
			StringBuilder stringbuilder = new StringBuilder(33);
	//    2   28:new             #18  <Class StringBuilder>
	//    3   31:dup             
	//    4   32:bipush          33
	//    5   34:invokespecial   #21  <Method void StringBuilder(int)>
	//    6   37:astore          4
			stringbuilder.append("Unknown color scheme: ");
	//    7   39:aload           4
	//    8   41:ldc1            #23  <String "Unknown color scheme: ">
	//    9   43:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   10   46:pop             
			stringbuilder.append(i);
	//   11   47:aload           4
	//   12   49:iload_0         
	//   13   50:invokevirtual   #30  <Method StringBuilder StringBuilder.append(int)>
	//   14   53:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   15   54:new             #32  <Class IllegalStateException>
	//   16   57:dup             
	//   17   58:aload           4
	//   18   60:invokevirtual   #36  <Method String StringBuilder.toString()>
	//   19   63:invokespecial   #39  <Method void IllegalStateException(String)>
	//   20   66:athrow          

		case 2: // '\002'
			return l;
	//   21   67:iload_3         
	//   22   68:ireturn         

		case 1: // '\001'
			return k;
	//   23   69:iload_2         
	//   24   70:ireturn         

		case 0: // '\0'
			return j;
	//   25   71:iload_1         
	//   26   72:ireturn         
		}
	}

	public final void configure(Resources resources, int i, int j)
	{
		setTypeface(Typeface.DEFAULT_BOLD);
	//    0    0:aload_0         
	//    1    1:getstatic       #47  <Field Typeface Typeface.DEFAULT_BOLD>
	//    2    4:invokevirtual   #51  <Method void setTypeface(Typeface)>
		setTextSize(14F);
	//    3    7:aload_0         
	//    4    8:ldc1            #52  <Float 14F>
	//    5   10:invokevirtual   #56  <Method void setTextSize(float)>
		int k = (int)(resources.getDisplayMetrics().density * 48F + 0.5F);
	//    6   13:aload_1         
	//    7   14:invokevirtual   #62  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    8   17:getfield        #68  <Field float DisplayMetrics.density>
	//    9   20:ldc1            #69  <Float 48F>
	//   10   22:fmul            
	//   11   23:ldc1            #70  <Float 0.5F>
	//   12   25:fadd            
	//   13   26:f2i             
	//   14   27:istore          4
		setMinHeight(k);
	//   15   29:aload_0         
	//   16   30:iload           4
	//   17   32:invokevirtual   #73  <Method void setMinHeight(int)>
		setMinWidth(k);
	//   18   35:aload_0         
	//   19   36:iload           4
	//   20   38:invokevirtual   #76  <Method void setMinWidth(int)>
		k = zaa(j, com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_dark, com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_light, com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_light);
	//   21   41:iload_3         
	//   22   42:getstatic       #82  <Field int com.google.android.gms.base.R$drawable.common_google_signin_btn_icon_dark>
	//   23   45:getstatic       #85  <Field int com.google.android.gms.base.R$drawable.common_google_signin_btn_icon_light>
	//   24   48:getstatic       #85  <Field int com.google.android.gms.base.R$drawable.common_google_signin_btn_icon_light>
	//   25   51:invokestatic    #87  <Method int zaa(int, int, int, int)>
	//   26   54:istore          4
		int l = zaa(j, com.google.android.gms.base.R.drawable.common_google_signin_btn_text_dark, com.google.android.gms.base.R.drawable.common_google_signin_btn_text_light, com.google.android.gms.base.R.drawable.common_google_signin_btn_text_light);
	//   27   56:iload_3         
	//   28   57:getstatic       #90  <Field int com.google.android.gms.base.R$drawable.common_google_signin_btn_text_dark>
	//   29   60:getstatic       #93  <Field int com.google.android.gms.base.R$drawable.common_google_signin_btn_text_light>
	//   30   63:getstatic       #93  <Field int com.google.android.gms.base.R$drawable.common_google_signin_btn_text_light>
	//   31   66:invokestatic    #87  <Method int zaa(int, int, int, int)>
	//   32   69:istore          5
		android.graphics.drawable.Drawable drawable;
		switch(i)
	//*  33   71:iload_2         
		{
	//*  34   72:tableswitch     0 2: default 100
	//	               0 135
	//	               1 135
	//	               2 139
		default:
			resources = ((Resources) (new StringBuilder(32)));
	//   35  100:new             #18  <Class StringBuilder>
	//   36  103:dup             
	//   37  104:bipush          32
	//   38  106:invokespecial   #21  <Method void StringBuilder(int)>
	//   39  109:astore_1        
			((StringBuilder) (resources)).append("Unknown button size: ");
	//   40  110:aload_1         
	//   41  111:ldc1            #95  <String "Unknown button size: ">
	//   42  113:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   43  116:pop             
			((StringBuilder) (resources)).append(i);
	//   44  117:aload_1         
	//   45  118:iload_2         
	//   46  119:invokevirtual   #30  <Method StringBuilder StringBuilder.append(int)>
	//   47  122:pop             
			throw new IllegalStateException(((StringBuilder) (resources)).toString());
	//   48  123:new             #32  <Class IllegalStateException>
	//   49  126:dup             
	//   50  127:aload_1         
	//   51  128:invokevirtual   #36  <Method String StringBuilder.toString()>
	//   52  131:invokespecial   #39  <Method void IllegalStateException(String)>
	//   53  134:athrow          

		case 0: // '\0'
		case 1: // '\001'
			k = l;
	//   54  135:iload           5
	//   55  137:istore          4
			// fall through

		case 2: // '\002'
			drawable = a.g(resources.getDrawable(k));
	//   56  139:aload_1         
	//   57  140:iload           4
	//   58  142:invokevirtual   #99  <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//   59  145:invokestatic    #105 <Method android.graphics.drawable.Drawable a.g(android.graphics.drawable.Drawable)>
	//   60  148:astore          6
			break;
		}
		a.a(drawable, resources.getColorStateList(com.google.android.gms.base.R.color.common_google_signin_btn_tint));
	//   61  150:aload           6
	//   62  152:aload_1         
	//   63  153:getstatic       #110 <Field int com.google.android.gms.base.R$color.common_google_signin_btn_tint>
	//   64  156:invokevirtual   #114 <Method ColorStateList Resources.getColorStateList(int)>
	//   65  159:invokestatic    #118 <Method void a.a(android.graphics.drawable.Drawable, ColorStateList)>
		a.a(drawable, android.graphics.PorterDuff.Mode.SRC_ATOP);
	//   66  162:aload           6
	//   67  164:getstatic       #124 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_ATOP>
	//   68  167:invokestatic    #127 <Method void a.a(android.graphics.drawable.Drawable, android.graphics.PorterDuff$Mode)>
		setBackgroundDrawable(drawable);
	//   69  170:aload_0         
	//   70  171:aload           6
	//   71  173:invokevirtual   #131 <Method void setBackgroundDrawable(android.graphics.drawable.Drawable)>
		setTextColor((ColorStateList)Preconditions.checkNotNull(((Object) (resources.getColorStateList(zaa(j, com.google.android.gms.base.R.color.common_google_signin_btn_text_dark, com.google.android.gms.base.R.color.common_google_signin_btn_text_light, com.google.android.gms.base.R.color.common_google_signin_btn_text_light))))));
	//   72  176:aload_0         
	//   73  177:aload_1         
	//   74  178:iload_3         
	//   75  179:getstatic       #132 <Field int com.google.android.gms.base.R$color.common_google_signin_btn_text_dark>
	//   76  182:getstatic       #133 <Field int com.google.android.gms.base.R$color.common_google_signin_btn_text_light>
	//   77  185:getstatic       #133 <Field int com.google.android.gms.base.R$color.common_google_signin_btn_text_light>
	//   78  188:invokestatic    #87  <Method int zaa(int, int, int, int)>
	//   79  191:invokevirtual   #114 <Method ColorStateList Resources.getColorStateList(int)>
	//   80  194:invokestatic    #139 <Method Object Preconditions.checkNotNull(Object)>
	//   81  197:checkcast       #141 <Class ColorStateList>
	//   82  200:invokevirtual   #145 <Method void setTextColor(ColorStateList)>
		i;
	//   83  203:iload_2         
		JVM INSTR tableswitch 0 2: default 232
	//	               0 282
	//	               1 275
	//	               2 267;
	//   84  204:tableswitch     0 2: default 232
	//	               0 282
	//	               1 275
	//	               2 267
		   goto _L1 _L2 _L3 _L4
_L1:
		resources = ((Resources) (new StringBuilder(32)));
	//   85  232:new             #18  <Class StringBuilder>
	//   86  235:dup             
	//   87  236:bipush          32
	//   88  238:invokespecial   #21  <Method void StringBuilder(int)>
	//   89  241:astore_1        
		((StringBuilder) (resources)).append("Unknown button size: ");
	//   90  242:aload_1         
	//   91  243:ldc1            #95  <String "Unknown button size: ">
	//   92  245:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   93  248:pop             
		((StringBuilder) (resources)).append(i);
	//   94  249:aload_1         
	//   95  250:iload_2         
	//   96  251:invokevirtual   #30  <Method StringBuilder StringBuilder.append(int)>
	//   97  254:pop             
		throw new IllegalStateException(((StringBuilder) (resources)).toString());
	//   98  255:new             #32  <Class IllegalStateException>
	//   99  258:dup             
	//  100  259:aload_1         
	//  101  260:invokevirtual   #36  <Method String StringBuilder.toString()>
	//  102  263:invokespecial   #39  <Method void IllegalStateException(String)>
	//  103  266:athrow          
_L4:
		setText(((CharSequence) (null)));
	//  104  267:aload_0         
	//  105  268:aconst_null     
	//  106  269:invokevirtual   #149 <Method void setText(CharSequence)>
		  goto _L5
	//* 107  272:goto            295
_L3:
		i = com.google.android.gms.base.R.string.common_signin_button_text_long;
	//  108  275:getstatic       #154 <Field int com.google.android.gms.base.R$string.common_signin_button_text_long>
	//  109  278:istore_2        
		  goto _L6
	//* 110  279:goto            286
_L2:
		i = com.google.android.gms.base.R.string.common_signin_button_text;
	//  111  282:getstatic       #157 <Field int com.google.android.gms.base.R$string.common_signin_button_text>
	//  112  285:istore_2        
_L6:
		setText(((CharSequence) (resources.getString(i))));
	//  113  286:aload_0         
	//  114  287:aload_1         
	//  115  288:iload_2         
	//  116  289:invokevirtual   #161 <Method String Resources.getString(int)>
	//  117  292:invokevirtual   #149 <Method void setText(CharSequence)>
_L5:
		setTransformationMethod(((android.text.method.TransformationMethod) (null)));
	//  118  295:aload_0         
	//  119  296:aconst_null     
	//  120  297:invokevirtual   #165 <Method void setTransformationMethod(android.text.method.TransformationMethod)>
		if(DeviceProperties.isWearable(getContext()))
	//* 121  300:aload_0         
	//* 122  301:invokevirtual   #169 <Method Context getContext()>
	//* 123  304:invokestatic    #175 <Method boolean DeviceProperties.isWearable(Context)>
	//* 124  307:ifeq            316
			setGravity(19);
	//  125  310:aload_0         
	//  126  311:bipush          19
	//  127  313:invokevirtual   #178 <Method void setGravity(int)>
		return;
	//  128  316:return          
	}

	public final void configure(Resources resources, SignInButtonConfig signinbuttonconfig)
	{
		configure(resources, signinbuttonconfig.getButtonSize(), signinbuttonconfig.getColorScheme());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #185 <Method int SignInButtonConfig.getButtonSize()>
	//    4    6:aload_2         
	//    5    7:invokevirtual   #188 <Method int SignInButtonConfig.getColorScheme()>
	//    6   10:invokevirtual   #190 <Method void configure(Resources, int, int)>
	//    7   13:return          
	}
}
