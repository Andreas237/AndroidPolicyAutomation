// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v4.content.res.ResourcesCompat;
import android.text.TextPaint;
import android.util.Log;

// Referenced classes of package android.support.design.resources:
//			MaterialResources, TextAppearanceConfig

public class TextAppearance
{

	public TextAppearance(Context context, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
		fontResolved = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #50  <Field boolean fontResolved>
		TypedArray typedarray = context.obtainStyledAttributes(i, android.support.design.R.styleable.TextAppearance);
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:getstatic       #55  <Field int[] android.support.design.R$styleable.TextAppearance>
	//    8   14:invokevirtual   #61  <Method TypedArray Context.obtainStyledAttributes(int, int[])>
	//    9   17:astore_3        
		textSize = typedarray.getDimension(android.support.design.R.styleable.TextAppearance_android_textSize, 0.0F);
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:getstatic       #64  <Field int android.support.design.R$styleable.TextAppearance_android_textSize>
	//   13   23:fconst_0        
	//   14   24:invokevirtual   #70  <Method float TypedArray.getDimension(int, float)>
	//   15   27:putfield        #72  <Field float textSize>
		textColor = MaterialResources.getColorStateList(context, typedarray, android.support.design.R.styleable.TextAppearance_android_textColor);
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:aload_3         
	//   19   33:getstatic       #75  <Field int android.support.design.R$styleable.TextAppearance_android_textColor>
	//   20   36:invokestatic    #81  <Method ColorStateList MaterialResources.getColorStateList(Context, TypedArray, int)>
	//   21   39:putfield        #83  <Field ColorStateList textColor>
		textColorHint = MaterialResources.getColorStateList(context, typedarray, android.support.design.R.styleable.TextAppearance_android_textColorHint);
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:aload_3         
	//   25   45:getstatic       #86  <Field int android.support.design.R$styleable.TextAppearance_android_textColorHint>
	//   26   48:invokestatic    #81  <Method ColorStateList MaterialResources.getColorStateList(Context, TypedArray, int)>
	//   27   51:putfield        #88  <Field ColorStateList textColorHint>
		textColorLink = MaterialResources.getColorStateList(context, typedarray, android.support.design.R.styleable.TextAppearance_android_textColorLink);
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:aload_3         
	//   31   57:getstatic       #91  <Field int android.support.design.R$styleable.TextAppearance_android_textColorLink>
	//   32   60:invokestatic    #81  <Method ColorStateList MaterialResources.getColorStateList(Context, TypedArray, int)>
	//   33   63:putfield        #93  <Field ColorStateList textColorLink>
		textStyle = typedarray.getInt(android.support.design.R.styleable.TextAppearance_android_textStyle, 0);
	//   34   66:aload_0         
	//   35   67:aload_3         
	//   36   68:getstatic       #96  <Field int android.support.design.R$styleable.TextAppearance_android_textStyle>
	//   37   71:iconst_0        
	//   38   72:invokevirtual   #100 <Method int TypedArray.getInt(int, int)>
	//   39   75:putfield        #102 <Field int textStyle>
		typeface = typedarray.getInt(android.support.design.R.styleable.TextAppearance_android_typeface, 1);
	//   40   78:aload_0         
	//   41   79:aload_3         
	//   42   80:getstatic       #105 <Field int android.support.design.R$styleable.TextAppearance_android_typeface>
	//   43   83:iconst_1        
	//   44   84:invokevirtual   #100 <Method int TypedArray.getInt(int, int)>
	//   45   87:putfield        #107 <Field int typeface>
		i = MaterialResources.getIndexWithValue(typedarray, android.support.design.R.styleable.TextAppearance_fontFamily, android.support.design.R.styleable.TextAppearance_android_fontFamily);
	//   46   90:aload_3         
	//   47   91:getstatic       #110 <Field int android.support.design.R$styleable.TextAppearance_fontFamily>
	//   48   94:getstatic       #113 <Field int android.support.design.R$styleable.TextAppearance_android_fontFamily>
	//   49   97:invokestatic    #117 <Method int MaterialResources.getIndexWithValue(TypedArray, int, int)>
	//   50  100:istore_2        
		fontFamilyResourceId = typedarray.getResourceId(i, 0);
	//   51  101:aload_0         
	//   52  102:aload_3         
	//   53  103:iload_2         
	//   54  104:iconst_0        
	//   55  105:invokevirtual   #120 <Method int TypedArray.getResourceId(int, int)>
	//   56  108:putfield        #122 <Field int fontFamilyResourceId>
		fontFamily = typedarray.getString(i);
	//   57  111:aload_0         
	//   58  112:aload_3         
	//   59  113:iload_2         
	//   60  114:invokevirtual   #126 <Method String TypedArray.getString(int)>
	//   61  117:putfield        #128 <Field String fontFamily>
		textAllCaps = typedarray.getBoolean(android.support.design.R.styleable.TextAppearance_textAllCaps, false);
	//   62  120:aload_0         
	//   63  121:aload_3         
	//   64  122:getstatic       #131 <Field int android.support.design.R$styleable.TextAppearance_textAllCaps>
	//   65  125:iconst_0        
	//   66  126:invokevirtual   #135 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   67  129:putfield        #137 <Field boolean textAllCaps>
		shadowColor = MaterialResources.getColorStateList(context, typedarray, android.support.design.R.styleable.TextAppearance_android_shadowColor);
	//   68  132:aload_0         
	//   69  133:aload_1         
	//   70  134:aload_3         
	//   71  135:getstatic       #140 <Field int android.support.design.R$styleable.TextAppearance_android_shadowColor>
	//   72  138:invokestatic    #81  <Method ColorStateList MaterialResources.getColorStateList(Context, TypedArray, int)>
	//   73  141:putfield        #142 <Field ColorStateList shadowColor>
		shadowDx = typedarray.getFloat(android.support.design.R.styleable.TextAppearance_android_shadowDx, 0.0F);
	//   74  144:aload_0         
	//   75  145:aload_3         
	//   76  146:getstatic       #145 <Field int android.support.design.R$styleable.TextAppearance_android_shadowDx>
	//   77  149:fconst_0        
	//   78  150:invokevirtual   #148 <Method float TypedArray.getFloat(int, float)>
	//   79  153:putfield        #150 <Field float shadowDx>
		shadowDy = typedarray.getFloat(android.support.design.R.styleable.TextAppearance_android_shadowDy, 0.0F);
	//   80  156:aload_0         
	//   81  157:aload_3         
	//   82  158:getstatic       #153 <Field int android.support.design.R$styleable.TextAppearance_android_shadowDy>
	//   83  161:fconst_0        
	//   84  162:invokevirtual   #148 <Method float TypedArray.getFloat(int, float)>
	//   85  165:putfield        #155 <Field float shadowDy>
		shadowRadius = typedarray.getFloat(android.support.design.R.styleable.TextAppearance_android_shadowRadius, 0.0F);
	//   86  168:aload_0         
	//   87  169:aload_3         
	//   88  170:getstatic       #158 <Field int android.support.design.R$styleable.TextAppearance_android_shadowRadius>
	//   89  173:fconst_0        
	//   90  174:invokevirtual   #148 <Method float TypedArray.getFloat(int, float)>
	//   91  177:putfield        #160 <Field float shadowRadius>
		typedarray.recycle();
	//   92  180:aload_3         
	//   93  181:invokevirtual   #163 <Method void TypedArray.recycle()>
	//   94  184:return          
	}

	private void createFallbackTypeface()
	{
		if(font == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field Typeface font>
	//*   2    4:ifnonnull       22
			font = Typeface.create(fontFamily, textStyle);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #128 <Field String fontFamily>
	//    6   12:aload_0         
	//    7   13:getfield        #102 <Field int textStyle>
	//    8   16:invokestatic    #182 <Method Typeface Typeface.create(String, int)>
	//    9   19:putfield        #169 <Field Typeface font>
		if(font == null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #169 <Field Typeface font>
	//*  12   26:ifnonnull       118
		{
			switch(typeface)
	//*  13   29:aload_0         
	//*  14   30:getfield        #107 <Field int typeface>
			{
	//*  15   33:tableswitch     1 3: default 60
	//	               1 90
	//	               2 80
	//	               3 70
			default:
				font = Typeface.DEFAULT;
	//   16   60:aload_0         
	//   17   61:getstatic       #185 <Field Typeface Typeface.DEFAULT>
	//   18   64:putfield        #169 <Field Typeface font>
				break;

	//*  19   67:goto            97
			case 3: // '\003'
				font = Typeface.MONOSPACE;
	//   20   70:aload_0         
	//   21   71:getstatic       #188 <Field Typeface Typeface.MONOSPACE>
	//   22   74:putfield        #169 <Field Typeface font>
				break;

	//*  23   77:goto            97
			case 2: // '\002'
				font = Typeface.SERIF;
	//   24   80:aload_0         
	//   25   81:getstatic       #191 <Field Typeface Typeface.SERIF>
	//   26   84:putfield        #169 <Field Typeface font>
				break;

	//*  27   87:goto            97
			case 1: // '\001'
				font = Typeface.SANS_SERIF;
	//   28   90:aload_0         
	//   29   91:getstatic       #194 <Field Typeface Typeface.SANS_SERIF>
	//   30   94:putfield        #169 <Field Typeface font>
				break;
			}
			Typeface typeface1 = font;
	//   31   97:aload_0         
	//   32   98:getfield        #169 <Field Typeface font>
	//   33  101:astore_1        
			if(typeface1 != null)
	//*  34  102:aload_1         
	//*  35  103:ifnull          118
				font = Typeface.create(typeface1, textStyle);
	//   36  106:aload_0         
	//   37  107:aload_1         
	//   38  108:aload_0         
	//   39  109:getfield        #102 <Field int textStyle>
	//   40  112:invokestatic    #197 <Method Typeface Typeface.create(Typeface, int)>
	//   41  115:putfield        #169 <Field Typeface font>
		}
	//   42  118:return          
	}

	public Typeface getFont(Context context)
	{
		if(fontResolved)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field boolean fontResolved>
	//*   2    4:ifeq            12
			return font;
	//    3    7:aload_0         
	//    4    8:getfield        #169 <Field Typeface font>
	//    5   11:areturn         
		if(context.isRestricted())
			break MISSING_BLOCK_LABEL_92;
	//    6   12:aload_1         
	//    7   13:invokevirtual   #211 <Method boolean Context.isRestricted()>
	//    8   16:ifne            92
		try
		{
			font = ResourcesCompat.getFont(context, fontFamilyResourceId);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #122 <Field int fontFamilyResourceId>
	//   13   25:invokestatic    #216 <Method Typeface ResourcesCompat.getFont(Context, int)>
	//   14   28:putfield        #169 <Field Typeface font>
			if(font != null)
	//*  15   31:aload_0         
	//*  16   32:getfield        #169 <Field Typeface font>
	//*  17   35:ifnull          92
				font = Typeface.create(font, textStyle);
	//   18   38:aload_0         
	//   19   39:aload_0         
	//   20   40:getfield        #169 <Field Typeface font>
	//   21   43:aload_0         
	//   22   44:getfield        #102 <Field int textStyle>
	//   23   47:invokestatic    #197 <Method Typeface Typeface.create(Typeface, int)>
	//   24   50:putfield        #169 <Field Typeface font>
		}
	//*  25   53:goto            92
	//*  26   56:astore_1        
	//*  27   57:new             #218 <Class StringBuilder>
	//*  28   60:dup             
	//*  29   61:invokespecial   #219 <Method void StringBuilder()>
	//*  30   64:astore_2        
	//*  31   65:aload_2         
	//*  32   66:ldc1            #221 <String "Error loading font ">
	//*  33   68:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//*  34   71:pop             
	//*  35   72:aload_2         
	//*  36   73:aload_0         
	//*  37   74:getfield        #128 <Field String fontFamily>
	//*  38   77:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//*  39   80:pop             
	//*  40   81:ldc1            #14  <String "TextAppearance">
	//*  41   83:aload_2         
	//*  42   84:invokevirtual   #229 <Method String StringBuilder.toString()>
	//*  43   87:aload_1         
	//*  44   88:invokestatic    #235 <Method int Log.d(String, String, Throwable)>
	//*  45   91:pop             
	//*  46   92:aload_0         
	//*  47   93:invokespecial   #176 <Method void createFallbackTypeface()>
	//*  48   96:aload_0         
	//*  49   97:iconst_1        
	//*  50   98:putfield        #50  <Field boolean fontResolved>
	//*  51  101:aload_0         
	//*  52  102:getfield        #169 <Field Typeface font>
	//*  53  105:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//   54  106:astore_1        
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			StringBuilder stringbuilder = new StringBuilder();
			stringbuilder.append("Error loading font ");
			stringbuilder.append(fontFamily);
			Log.d("TextAppearance", stringbuilder.toString(), ((Throwable) (context)));
		}
		createFallbackTypeface();
		fontResolved = true;
		return font;
	//*  55  107:goto            92
	}

	public void getFontAsync(Context context, final TextPaint textPaint, final android.support.v4.content.res.ResourcesCompat.FontCallback callback)
	{
		if(fontResolved)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field boolean fontResolved>
	//*   2    4:ifeq            17
		{
			updateTextPaintMeasureState(textPaint, font);
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #169 <Field Typeface font>
	//    7   13:invokevirtual   #242 <Method void updateTextPaintMeasureState(TextPaint, Typeface)>
			return;
	//    8   16:return          
		}
		createFallbackTypeface();
	//    9   17:aload_0         
	//   10   18:invokespecial   #176 <Method void createFallbackTypeface()>
		if(context.isRestricted())
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #211 <Method boolean Context.isRestricted()>
	//*  13   25:ifeq            43
		{
			fontResolved = true;
	//   14   28:aload_0         
	//   15   29:iconst_1        
	//   16   30:putfield        #50  <Field boolean fontResolved>
			updateTextPaintMeasureState(textPaint, font);
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:aload_0         
	//   20   36:getfield        #169 <Field Typeface font>
	//   21   39:invokevirtual   #242 <Method void updateTextPaintMeasureState(TextPaint, Typeface)>
			return;
	//   22   42:return          
		}
		try
		{
			ResourcesCompat.getFont(context, fontFamilyResourceId, ((android.support.v4.content.res.ResourcesCompat.FontCallback) (new android.support.v4.content.res.ResourcesCompat.FontCallback() {

				public void onFontRetrievalFailed(int i)
				{
					createFallbackTypeface();
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field TextAppearance this$0>
				//    2    4:invokestatic    #33  <Method void TextAppearance.access$200(TextAppearance)>
					fontResolved = true;
				//    3    7:aload_0         
				//    4    8:getfield        #19  <Field TextAppearance this$0>
				//    5   11:iconst_1        
				//    6   12:invokestatic    #37  <Method boolean TextAppearance.access$102(TextAppearance, boolean)>
				//    7   15:pop             
					callback.onFontRetrievalFailed(i);
				//    8   16:aload_0         
				//    9   17:getfield        #23  <Field android.support.v4.content.res.ResourcesCompat$FontCallback val$callback>
				//   10   20:iload_1         
				//   11   21:invokevirtual   #39  <Method void android.support.v4.content.res.ResourcesCompat$FontCallback.onFontRetrievalFailed(int)>
				//   12   24:return          
				}

				public void onFontRetrieved(Typeface typeface1)
				{
					TextAppearance textappearance = TextAppearance.this;
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field TextAppearance this$0>
				//    2    4:astore_2        
					textappearance.font = Typeface.create(typeface1, textappearance.textStyle);
				//    3    5:aload_2         
				//    4    6:aload_1         
				//    5    7:aload_2         
				//    6    8:getfield        #46  <Field int TextAppearance.textStyle>
				//    7   11:invokestatic    #52  <Method Typeface Typeface.create(Typeface, int)>
				//    8   14:invokestatic    #56  <Method Typeface TextAppearance.access$002(TextAppearance, Typeface)>
				//    9   17:pop             
					updateTextPaintMeasureState(textPaint, typeface1);
				//   10   18:aload_0         
				//   11   19:getfield        #19  <Field TextAppearance this$0>
				//   12   22:aload_0         
				//   13   23:getfield        #21  <Field TextPaint val$textPaint>
				//   14   26:aload_1         
				//   15   27:invokevirtual   #60  <Method void TextAppearance.updateTextPaintMeasureState(TextPaint, Typeface)>
					fontResolved = true;
				//   16   30:aload_0         
				//   17   31:getfield        #19  <Field TextAppearance this$0>
				//   18   34:iconst_1        
				//   19   35:invokestatic    #37  <Method boolean TextAppearance.access$102(TextAppearance, boolean)>
				//   20   38:pop             
					callback.onFontRetrieved(typeface1);
				//   21   39:aload_0         
				//   22   40:getfield        #23  <Field android.support.v4.content.res.ResourcesCompat$FontCallback val$callback>
				//   23   43:aload_1         
				//   24   44:invokevirtual   #62  <Method void android.support.v4.content.res.ResourcesCompat$FontCallback.onFontRetrieved(Typeface)>
				//   25   47:return          
				}

				final TextAppearance this$0;
				final android.support.v4.content.res.ResourcesCompat.FontCallback val$callback;
				final TextPaint val$textPaint;

			
			{
				this$0 = TextAppearance.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field TextAppearance this$0>
				textPaint = textpaint;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field TextPaint val$textPaint>
				callback = fontcallback;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #23  <Field android.support.v4.content.res.ResourcesCompat$FontCallback val$callback>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void android.support.v4.content.res.ResourcesCompat$FontCallback()>
			//   11   19:return          
			}
			}
)), ((android.os.Handler) (null)));
	//   23   43:aload_1         
	//   24   44:aload_0         
	//   25   45:getfield        #122 <Field int fontFamilyResourceId>
	//   26   48:new             #6   <Class TextAppearance$1>
	//   27   51:dup             
	//   28   52:aload_0         
	//   29   53:aload_2         
	//   30   54:aload_3         
	//   31   55:invokespecial   #245 <Method void TextAppearance$1(TextAppearance, TextPaint, android.support.v4.content.res.ResourcesCompat$FontCallback)>
	//   32   58:aconst_null     
	//   33   59:invokestatic    #248 <Method void ResourcesCompat.getFont(Context, int, android.support.v4.content.res.ResourcesCompat$FontCallback, android.os.Handler)>
			return;
	//   34   62:return          
		}
	//*  35   63:astore_1        
	//*  36   64:new             #218 <Class StringBuilder>
	//*  37   67:dup             
	//*  38   68:invokespecial   #219 <Method void StringBuilder()>
	//*  39   71:astore_2        
	//*  40   72:aload_2         
	//*  41   73:ldc1            #221 <String "Error loading font ">
	//*  42   75:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//*  43   78:pop             
	//*  44   79:aload_2         
	//*  45   80:aload_0         
	//*  46   81:getfield        #128 <Field String fontFamily>
	//*  47   84:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//*  48   87:pop             
	//*  49   88:ldc1            #14  <String "TextAppearance">
	//*  50   90:aload_2         
	//*  51   91:invokevirtual   #229 <Method String StringBuilder.toString()>
	//*  52   94:aload_1         
	//*  53   95:invokestatic    #235 <Method int Log.d(String, String, Throwable)>
	//*  54   98:pop             
	//*  55   99:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  56  100:astore_1        
		{
			return;
	//   57  101:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			textPaint = ((TextPaint) (new StringBuilder()));
		}
		((StringBuilder) (textPaint)).append("Error loading font ");
		((StringBuilder) (textPaint)).append(fontFamily);
		Log.d("TextAppearance", ((StringBuilder) (textPaint)).toString(), ((Throwable) (context)));
		return;
	}

	public void updateDrawState(Context context, TextPaint textpaint, android.support.v4.content.res.ResourcesCompat.FontCallback fontcallback)
	{
		updateMeasureState(context, textpaint, fontcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #252 <Method void updateMeasureState(Context, TextPaint, android.support.v4.content.res.ResourcesCompat$FontCallback)>
		context = ((Context) (textColor));
	//    5    7:aload_0         
	//    6    8:getfield        #83  <Field ColorStateList textColor>
	//    7   11:astore_1        
		int i;
		if(context != null)
	//*   8   12:aload_1         
	//*   9   13:ifnull          36
			i = ((ColorStateList) (context)).getColorForState(textpaint.drawableState, textColor.getDefaultColor());
	//   10   16:aload_1         
	//   11   17:aload_2         
	//   12   18:getfield        #257 <Field int[] TextPaint.drawableState>
	//   13   21:aload_0         
	//   14   22:getfield        #83  <Field ColorStateList textColor>
	//   15   25:invokevirtual   #263 <Method int ColorStateList.getDefaultColor()>
	//   16   28:invokevirtual   #267 <Method int ColorStateList.getColorForState(int[], int)>
	//   17   31:istore          7
		else
	//*  18   33:goto            41
			i = 0xff000000;
	//   19   36:ldc2            #268 <Int 0xff000000>
	//   20   39:istore          7
		textpaint.setColor(i);
	//   21   41:aload_2         
	//   22   42:iload           7
	//   23   44:invokevirtual   #272 <Method void TextPaint.setColor(int)>
		float f = shadowRadius;
	//   24   47:aload_0         
	//   25   48:getfield        #160 <Field float shadowRadius>
	//   26   51:fstore          4
		float f1 = shadowDx;
	//   27   53:aload_0         
	//   28   54:getfield        #150 <Field float shadowDx>
	//   29   57:fstore          5
		float f2 = shadowDy;
	//   30   59:aload_0         
	//   31   60:getfield        #155 <Field float shadowDy>
	//   32   63:fstore          6
		context = ((Context) (shadowColor));
	//   33   65:aload_0         
	//   34   66:getfield        #142 <Field ColorStateList shadowColor>
	//   35   69:astore_1        
		if(context != null)
	//*  36   70:aload_1         
	//*  37   71:ifnull          94
			i = ((ColorStateList) (context)).getColorForState(textpaint.drawableState, shadowColor.getDefaultColor());
	//   38   74:aload_1         
	//   39   75:aload_2         
	//   40   76:getfield        #257 <Field int[] TextPaint.drawableState>
	//   41   79:aload_0         
	//   42   80:getfield        #142 <Field ColorStateList shadowColor>
	//   43   83:invokevirtual   #263 <Method int ColorStateList.getDefaultColor()>
	//   44   86:invokevirtual   #267 <Method int ColorStateList.getColorForState(int[], int)>
	//   45   89:istore          7
		else
	//*  46   91:goto            97
			i = 0;
	//   47   94:iconst_0        
	//   48   95:istore          7
		textpaint.setShadowLayer(f, f1, f2, i);
	//   49   97:aload_2         
	//   50   98:fload           4
	//   51  100:fload           5
	//   52  102:fload           6
	//   53  104:iload           7
	//   54  106:invokevirtual   #276 <Method void TextPaint.setShadowLayer(float, float, float, int)>
	//   55  109:return          
	}

	public void updateMeasureState(Context context, TextPaint textpaint, android.support.v4.content.res.ResourcesCompat.FontCallback fontcallback)
	{
		if(TextAppearanceConfig.shouldLoadFontSynchronously())
	//*   0    0:invokestatic    #281 <Method boolean TextAppearanceConfig.shouldLoadFontSynchronously()>
	//*   1    3:ifeq            17
		{
			updateTextPaintMeasureState(textpaint, getFont(context));
	//    2    6:aload_0         
	//    3    7:aload_2         
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #283 <Method Typeface getFont(Context)>
	//    7   13:invokevirtual   #242 <Method void updateTextPaintMeasureState(TextPaint, Typeface)>
			return;
	//    8   16:return          
		}
		getFontAsync(context, textpaint, fontcallback);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:aload_3         
	//   13   21:invokevirtual   #285 <Method void getFontAsync(Context, TextPaint, android.support.v4.content.res.ResourcesCompat$FontCallback)>
		if(!fontResolved)
	//*  14   24:aload_0         
	//*  15   25:getfield        #50  <Field boolean fontResolved>
	//*  16   28:ifne            40
			updateTextPaintMeasureState(textpaint, font);
	//   17   31:aload_0         
	//   18   32:aload_2         
	//   19   33:aload_0         
	//   20   34:getfield        #169 <Field Typeface font>
	//   21   37:invokevirtual   #242 <Method void updateTextPaintMeasureState(TextPaint, Typeface)>
	//   22   40:return          
	}

	public void updateTextPaintMeasureState(TextPaint textpaint, Typeface typeface1)
	{
		textpaint.setTypeface(typeface1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #289 <Method Typeface TextPaint.setTypeface(Typeface)>
	//    3    5:pop             
		int i = textStyle;
	//    4    6:aload_0         
	//    5    7:getfield        #102 <Field int textStyle>
	//    6   10:istore          4
		i = typeface1.getStyle() & i;
	//    7   12:aload_2         
	//    8   13:invokevirtual   #292 <Method int Typeface.getStyle()>
	//    9   16:iload           4
	//   10   18:iand            
	//   11   19:istore          4
		boolean flag;
		if((i & 1) != 0)
	//*  12   21:iload           4
	//*  13   23:iconst_1        
	//*  14   24:iand            
	//*  15   25:ifeq            34
			flag = true;
	//   16   28:iconst_1        
	//   17   29:istore          5
		else
	//*  18   31:goto            37
			flag = false;
	//   19   34:iconst_0        
	//   20   35:istore          5
		textpaint.setFakeBoldText(flag);
	//   21   37:aload_1         
	//   22   38:iload           5
	//   23   40:invokevirtual   #296 <Method void TextPaint.setFakeBoldText(boolean)>
		float f;
		if((i & 2) != 0)
	//*  24   43:iload           4
	//*  25   45:iconst_2        
	//*  26   46:iand            
	//*  27   47:ifeq            57
			f = -0.25F;
	//   28   50:ldc2            #297 <Float -0.25F>
	//   29   53:fstore_3        
		else
	//*  30   54:goto            59
			f = 0.0F;
	//   31   57:fconst_0        
	//   32   58:fstore_3        
		textpaint.setTextSkewX(f);
	//   33   59:aload_1         
	//   34   60:fload_3         
	//   35   61:invokevirtual   #301 <Method void TextPaint.setTextSkewX(float)>
		textpaint.setTextSize(textSize);
	//   36   64:aload_1         
	//   37   65:aload_0         
	//   38   66:getfield        #72  <Field float textSize>
	//   39   69:invokevirtual   #304 <Method void TextPaint.setTextSize(float)>
	//   40   72:return          
	}

	private static final String TAG = "TextAppearance";
	private static final int TYPEFACE_MONOSPACE = 3;
	private static final int TYPEFACE_SANS = 1;
	private static final int TYPEFACE_SERIF = 2;
	private Typeface font;
	public final String fontFamily;
	private final int fontFamilyResourceId;
	private boolean fontResolved;
	public final ColorStateList shadowColor;
	public final float shadowDx;
	public final float shadowDy;
	public final float shadowRadius;
	public final boolean textAllCaps;
	public final ColorStateList textColor;
	public final ColorStateList textColorHint;
	public final ColorStateList textColorLink;
	public final float textSize;
	public final int textStyle;
	public final int typeface;


/*
	static Typeface access$002(TextAppearance textappearance, Typeface typeface1)
	{
		textappearance.font = typeface1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #169 <Field Typeface font>
		return typeface1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static boolean access$102(TextAppearance textappearance, boolean flag)
	{
		textappearance.fontResolved = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #50  <Field boolean fontResolved>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static void access$200(TextAppearance textappearance)
	{
		textappearance.createFallbackTypeface();
	//    0    0:aload_0         
	//    1    1:invokespecial   #176 <Method void createFallbackTypeface()>
		return;
	//    2    4:return          
	}

*/
}
