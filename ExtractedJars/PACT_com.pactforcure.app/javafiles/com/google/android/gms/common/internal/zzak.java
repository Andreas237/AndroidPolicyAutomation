// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.Button;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzac

public final class zzak extends Button
{

	public zzak(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #9   <Method void zzak(Context, AttributeSet)>
	//    4    6:return          
	}

	public zzak(Context context, AttributeSet attributeset)
	{
		super(context, attributeset, 0x1010048);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #11  <Int 0x1010048>
	//    4    5:invokespecial   #14  <Method void Button(Context, AttributeSet, int)>
	//    5    8:return          
	}

	private void zza(Resources resources)
	{
		setTypeface(Typeface.DEFAULT_BOLD);
	//    0    0:aload_0         
	//    1    1:getstatic       #22  <Field Typeface Typeface.DEFAULT_BOLD>
	//    2    4:invokevirtual   #26  <Method void setTypeface(Typeface)>
		setTextSize(14F);
	//    3    7:aload_0         
	//    4    8:ldc1            #27  <Float 14F>
	//    5   10:invokevirtual   #31  <Method void setTextSize(float)>
		float f = resources.getDisplayMetrics().density;
	//    6   13:aload_1         
	//    7   14:invokevirtual   #37  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    8   17:getfield        #43  <Field float DisplayMetrics.density>
	//    9   20:fstore_2        
		setMinHeight((int)(f * 48F + 0.5F));
	//   10   21:aload_0         
	//   11   22:fload_2         
	//   12   23:ldc1            #44  <Float 48F>
	//   13   25:fmul            
	//   14   26:ldc1            #45  <Float 0.5F>
	//   15   28:fadd            
	//   16   29:f2i             
	//   17   30:invokevirtual   #49  <Method void setMinHeight(int)>
		setMinWidth((int)(f * 48F + 0.5F));
	//   18   33:aload_0         
	//   19   34:fload_2         
	//   20   35:ldc1            #44  <Float 48F>
	//   21   37:fmul            
	//   22   38:ldc1            #45  <Float 0.5F>
	//   23   40:fadd            
	//   24   41:f2i             
	//   25   42:invokevirtual   #52  <Method void setMinWidth(int)>
	//   26   45:return          
	}

	private void zzb(Resources resources, int i, int j)
	{
		setBackgroundDrawable(resources.getDrawable(zze(i, zzg(j, com.google.android.gms.R.drawable.common_google_signin_btn_icon_dark, com.google.android.gms.R.drawable.common_google_signin_btn_icon_light, com.google.android.gms.R.drawable.common_google_signin_btn_icon_light), zzg(j, com.google.android.gms.R.drawable.common_google_signin_btn_text_dark, com.google.android.gms.R.drawable.common_google_signin_btn_text_light, com.google.android.gms.R.drawable.common_google_signin_btn_text_light))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:iload_2         
	//    4    4:aload_0         
	//    5    5:iload_3         
	//    6    6:getstatic       #60  <Field int com.google.android.gms.R$drawable.common_google_signin_btn_icon_dark>
	//    7    9:getstatic       #63  <Field int com.google.android.gms.R$drawable.common_google_signin_btn_icon_light>
	//    8   12:getstatic       #63  <Field int com.google.android.gms.R$drawable.common_google_signin_btn_icon_light>
	//    9   15:invokespecial   #67  <Method int zzg(int, int, int, int)>
	//   10   18:aload_0         
	//   11   19:iload_3         
	//   12   20:getstatic       #70  <Field int com.google.android.gms.R$drawable.common_google_signin_btn_text_dark>
	//   13   23:getstatic       #73  <Field int com.google.android.gms.R$drawable.common_google_signin_btn_text_light>
	//   14   26:getstatic       #73  <Field int com.google.android.gms.R$drawable.common_google_signin_btn_text_light>
	//   15   29:invokespecial   #67  <Method int zzg(int, int, int, int)>
	//   16   32:invokespecial   #77  <Method int zze(int, int, int)>
	//   17   35:invokevirtual   #81  <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//   18   38:invokevirtual   #85  <Method void setBackgroundDrawable(android.graphics.drawable.Drawable)>
	//   19   41:return          
	}

	private void zzc(Resources resources, int i, int j)
	{
		setTextColor((ColorStateList)zzac.zzw(((Object) (resources.getColorStateList(zzg(j, com.google.android.gms.R.color.common_google_signin_btn_text_dark, com.google.android.gms.R.color.common_google_signin_btn_text_light, com.google.android.gms.R.color.common_google_signin_btn_text_light))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:iload_3         
	//    4    4:getstatic       #89  <Field int com.google.android.gms.R$color.common_google_signin_btn_text_dark>
	//    5    7:getstatic       #90  <Field int com.google.android.gms.R$color.common_google_signin_btn_text_light>
	//    6   10:getstatic       #90  <Field int com.google.android.gms.R$color.common_google_signin_btn_text_light>
	//    7   13:invokespecial   #67  <Method int zzg(int, int, int, int)>
	//    8   16:invokevirtual   #94  <Method ColorStateList Resources.getColorStateList(int)>
	//    9   19:invokestatic    #100 <Method Object zzac.zzw(Object)>
	//   10   22:checkcast       #102 <Class ColorStateList>
	//   11   25:invokevirtual   #106 <Method void setTextColor(ColorStateList)>
		i;
	//   12   28:iload_2         
		JVM INSTR tableswitch 0 2: default 56
	//	               0 85
	//	               1 102
	//	               2 116;
	//   13   29:tableswitch     0 2: default 56
	//	               0 85
	//	               1 102
	//	               2 116
		   goto _L1 _L2 _L3 _L4
_L1:
		throw new IllegalStateException((new StringBuilder(32)).append("Unknown button size: ").append(i).toString());
	//   14   56:new             #108 <Class IllegalStateException>
	//   15   59:dup             
	//   16   60:new             #110 <Class StringBuilder>
	//   17   63:dup             
	//   18   64:bipush          32
	//   19   66:invokespecial   #112 <Method void StringBuilder(int)>
	//   20   69:ldc1            #114 <String "Unknown button size: ">
	//   21   71:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   22   74:iload_2         
	//   23   75:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   24   78:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   25   81:invokespecial   #128 <Method void IllegalStateException(String)>
	//   26   84:athrow          
_L2:
		setText(((CharSequence) (resources.getString(com.google.android.gms.R.string.common_signin_button_text))));
	//   27   85:aload_0         
	//   28   86:aload_1         
	//   29   87:getstatic       #133 <Field int com.google.android.gms.R$string.common_signin_button_text>
	//   30   90:invokevirtual   #137 <Method String Resources.getString(int)>
	//   31   93:invokevirtual   #141 <Method void setText(CharSequence)>
_L6:
		setTransformationMethod(((android.text.method.TransformationMethod) (null)));
	//   32   96:aload_0         
	//   33   97:aconst_null     
	//   34   98:invokevirtual   #145 <Method void setTransformationMethod(android.text.method.TransformationMethod)>
		return;
	//   35  101:return          
_L3:
		setText(((CharSequence) (resources.getString(com.google.android.gms.R.string.common_signin_button_text_long))));
	//   36  102:aload_0         
	//   37  103:aload_1         
	//   38  104:getstatic       #148 <Field int com.google.android.gms.R$string.common_signin_button_text_long>
	//   39  107:invokevirtual   #137 <Method String Resources.getString(int)>
	//   40  110:invokevirtual   #141 <Method void setText(CharSequence)>
		continue; /* Loop/switch isn't completed */
	//   41  113:goto            96
_L4:
		setText(((CharSequence) (null)));
	//   42  116:aload_0         
	//   43  117:aconst_null     
	//   44  118:invokevirtual   #141 <Method void setText(CharSequence)>
		if(true) goto _L6; else goto _L5
	//   45  121:goto            96
_L5:
	}

	private int zze(int i, int j, int k)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 59
	//	               1 59
	//	               2 57
		default:
			throw new IllegalStateException((new StringBuilder(32)).append("Unknown button size: ").append(i).toString());
	//    2   28:new             #108 <Class IllegalStateException>
	//    3   31:dup             
	//    4   32:new             #110 <Class StringBuilder>
	//    5   35:dup             
	//    6   36:bipush          32
	//    7   38:invokespecial   #112 <Method void StringBuilder(int)>
	//    8   41:ldc1            #114 <String "Unknown button size: ">
	//    9   43:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   10   46:iload_1         
	//   11   47:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   12   50:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   13   53:invokespecial   #128 <Method void IllegalStateException(String)>
	//   14   56:athrow          

		case 2: // '\002'
			k = j;
	//   15   57:iload_2         
	//   16   58:istore_3        
			// fall through

		case 0: // '\0'
		case 1: // '\001'
			return k;
	//   17   59:iload_3         
	//   18   60:ireturn         
		}
	}

	private int zzg(int i, int j, int k, int l)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 59
	//	               1 57
	//	               2 61
		default:
			throw new IllegalStateException((new StringBuilder(33)).append("Unknown color scheme: ").append(i).toString());
	//    2   28:new             #108 <Class IllegalStateException>
	//    3   31:dup             
	//    4   32:new             #110 <Class StringBuilder>
	//    5   35:dup             
	//    6   36:bipush          33
	//    7   38:invokespecial   #112 <Method void StringBuilder(int)>
	//    8   41:ldc1            #150 <String "Unknown color scheme: ">
	//    9   43:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   10   46:iload_1         
	//   11   47:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   12   50:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   13   53:invokespecial   #128 <Method void IllegalStateException(String)>
	//   14   56:athrow          

		case 1: // '\001'
			j = k;
	//   15   57:iload_3         
	//   16   58:istore_2        
			// fall through

		case 0: // '\0'
			return j;
	//   17   59:iload_2         
	//   18   60:ireturn         

		case 2: // '\002'
			return l;
	//   19   61:iload           4
	//   20   63:ireturn         
		}
	}

	public void zza(Resources resources, int i, int j)
	{
		zza(resources);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #152 <Method void zza(Resources)>
		zzb(resources, i, j);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:iload_3         
	//    7    9:invokespecial   #154 <Method void zzb(Resources, int, int)>
		zzc(resources, i, j);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:iload_2         
	//   11   15:iload_3         
	//   12   16:invokespecial   #156 <Method void zzc(Resources, int, int)>
	//   13   19:return          
	}
}
