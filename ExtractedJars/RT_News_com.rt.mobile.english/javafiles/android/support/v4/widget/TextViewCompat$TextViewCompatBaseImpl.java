// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.TextView;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v4.widget:
//			TextViewCompat, AutoSizeableTextView

static class TextViewCompat$TextViewCompatBaseImpl
{

	private static Field retrieveField(String s)
	{
		Field field = ((Class) (android/widget/TextView)).getDeclaredField(s);
	//    0    0:ldc1            #35  <Class TextView>
	//    1    2:aload_0         
	//    2    3:invokevirtual   #40  <Method Field Class.getDeclaredField(String)>
	//    3    6:astore_1        
		field.setAccessible(true);
	//    4    7:aload_1         
	//    5    8:iconst_1        
	//    6    9:invokevirtual   #46  <Method void Field.setAccessible(boolean)>
		return field;
	//    7   12:aload_1         
	//    8   13:areturn         
_L1:
		field = null;
	//    9   14:aconst_null     
	//   10   15:astore_1        
_L2:
		StringBuilder stringbuilder = new StringBuilder();
	//   11   16:new             #48  <Class StringBuilder>
	//   12   19:dup             
	//   13   20:invokespecial   #49  <Method void StringBuilder()>
	//   14   23:astore_2        
		stringbuilder.append("Could not retrieve ");
	//   15   24:aload_2         
	//   16   25:ldc1            #51  <String "Could not retrieve ">
	//   17   27:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   18   30:pop             
		stringbuilder.append(s);
	//   19   31:aload_2         
	//   20   32:aload_0         
	//   21   33:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   22   36:pop             
		stringbuilder.append(" field.");
	//   23   37:aload_2         
	//   24   38:ldc1            #57  <String " field.">
	//   25   40:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   26   43:pop             
		Log.e("TextViewCompatBase", stringbuilder.toString());
	//   27   44:ldc1            #14  <String "TextViewCompatBase">
	//   28   46:aload_2         
	//   29   47:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   30   50:invokestatic    #67  <Method int Log.e(String, String)>
	//   31   53:pop             
		return field;
	//   32   54:aload_1         
	//   33   55:areturn         
		NoSuchFieldException nosuchfieldexception;
		nosuchfieldexception;
	//   34   56:astore_1        
		  goto _L1
	//*  35   57:goto            14
		NoSuchFieldException nosuchfieldexception1;
		nosuchfieldexception1;
	//   36   60:astore_2        
		  goto _L2
	//*  37   61:goto            16
	}

	private static int retrieveIntFromField(Field field, TextView textview)
	{
		int i;
		try
		{
			i = field.getInt(((Object) (textview)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #75  <Method int Field.getInt(Object)>
	//    3    5:istore_2        
		}
	//*   4    6:iload_2         
	//*   5    7:ireturn         
	//*   6    8:new             #48  <Class StringBuilder>
	//*   7   11:dup             
	//*   8   12:invokespecial   #49  <Method void StringBuilder()>
	//*   9   15:astore_1        
	//*  10   16:aload_1         
	//*  11   17:ldc1            #77  <String "Could not retrieve value of ">
	//*  12   19:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//*  13   22:pop             
	//*  14   23:aload_1         
	//*  15   24:aload_0         
	//*  16   25:invokevirtual   #80  <Method String Field.getName()>
	//*  17   28:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//*  18   31:pop             
	//*  19   32:aload_1         
	//*  20   33:ldc1            #57  <String " field.">
	//*  21   35:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//*  22   38:pop             
	//*  23   39:ldc1            #14  <String "TextViewCompatBase">
	//*  24   41:aload_1         
	//*  25   42:invokevirtual   #61  <Method String StringBuilder.toString()>
	//*  26   45:invokestatic    #83  <Method int Log.d(String, String)>
	//*  27   48:pop             
	//*  28   49:iconst_m1       
	//*  29   50:ireturn         
		// Misplaced declaration of an exception variable
		catch(TextView textview)
		{
			textview = ((TextView) (new StringBuilder()));
			((StringBuilder) (textview)).append("Could not retrieve value of ");
			((StringBuilder) (textview)).append(field.getName());
			((StringBuilder) (textview)).append(" field.");
			Log.d("TextViewCompatBase", ((StringBuilder) (textview)).toString());
			return -1;
		}
		return i;
	//*  30   51:astore_1        
	//*  31   52:goto            8
	}

	public int getAutoSizeMaxTextSize(TextView textview)
	{
		if(textview instanceof AutoSizeableTextView)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #87  <Class AutoSizeableTextView>
	//*   2    4:ifeq            17
			return ((AutoSizeableTextView)textview).getAutoSizeMaxTextSize();
	//    3    7:aload_1         
	//    4    8:checkcast       #87  <Class AutoSizeableTextView>
	//    5   11:invokeinterface #90  <Method int AutoSizeableTextView.getAutoSizeMaxTextSize()>
	//    6   16:ireturn         
		else
			return -1;
	//    7   17:iconst_m1       
	//    8   18:ireturn         
	}

	public int getAutoSizeMinTextSize(TextView textview)
	{
		if(textview instanceof AutoSizeableTextView)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #87  <Class AutoSizeableTextView>
	//*   2    4:ifeq            17
			return ((AutoSizeableTextView)textview).getAutoSizeMinTextSize();
	//    3    7:aload_1         
	//    4    8:checkcast       #87  <Class AutoSizeableTextView>
	//    5   11:invokeinterface #93  <Method int AutoSizeableTextView.getAutoSizeMinTextSize()>
	//    6   16:ireturn         
		else
			return -1;
	//    7   17:iconst_m1       
	//    8   18:ireturn         
	}

	public int getAutoSizeStepGranularity(TextView textview)
	{
		if(textview instanceof AutoSizeableTextView)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #87  <Class AutoSizeableTextView>
	//*   2    4:ifeq            17
			return ((AutoSizeableTextView)textview).getAutoSizeStepGranularity();
	//    3    7:aload_1         
	//    4    8:checkcast       #87  <Class AutoSizeableTextView>
	//    5   11:invokeinterface #96  <Method int AutoSizeableTextView.getAutoSizeStepGranularity()>
	//    6   16:ireturn         
		else
			return -1;
	//    7   17:iconst_m1       
	//    8   18:ireturn         
	}

	public int[] getAutoSizeTextAvailableSizes(TextView textview)
	{
		if(textview instanceof AutoSizeableTextView)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #87  <Class AutoSizeableTextView>
	//*   2    4:ifeq            17
			return ((AutoSizeableTextView)textview).getAutoSizeTextAvailableSizes();
	//    3    7:aload_1         
	//    4    8:checkcast       #87  <Class AutoSizeableTextView>
	//    5   11:invokeinterface #101 <Method int[] AutoSizeableTextView.getAutoSizeTextAvailableSizes()>
	//    6   16:areturn         
		else
			return new int[0];
	//    7   17:iconst_0        
	//    8   18:newarray        int[]
	//    9   20:areturn         
	}

	public int getAutoSizeTextType(TextView textview)
	{
		if(textview instanceof AutoSizeableTextView)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #87  <Class AutoSizeableTextView>
	//*   2    4:ifeq            17
			return ((AutoSizeableTextView)textview).getAutoSizeTextType();
	//    3    7:aload_1         
	//    4    8:checkcast       #87  <Class AutoSizeableTextView>
	//    5   11:invokeinterface #104 <Method int AutoSizeableTextView.getAutoSizeTextType()>
	//    6   16:ireturn         
		else
			return 0;
	//    7   17:iconst_0        
	//    8   18:ireturn         
	}

	public Drawable[] getCompoundDrawablesRelative(TextView textview)
	{
		return textview.getCompoundDrawables();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #111 <Method Drawable[] TextView.getCompoundDrawables()>
	//    2    4:areturn         
	}

	public int getMaxLines(TextView textview)
	{
		if(!sMaxModeFieldFetched)
	//*   0    0:getstatic       #115 <Field boolean sMaxModeFieldFetched>
	//*   1    3:ifne            18
		{
			sMaxModeField = retrieveField("mMaxMode");
	//    2    6:ldc1            #117 <String "mMaxMode">
	//    3    8:invokestatic    #119 <Method Field retrieveField(String)>
	//    4   11:putstatic       #121 <Field Field sMaxModeField>
			sMaxModeFieldFetched = true;
	//    5   14:iconst_1        
	//    6   15:putstatic       #115 <Field boolean sMaxModeFieldFetched>
		}
		if(sMaxModeField != null && retrieveIntFromField(sMaxModeField, textview) == 1)
	//*   7   18:getstatic       #121 <Field Field sMaxModeField>
	//*   8   21:ifnull          67
	//*   9   24:getstatic       #121 <Field Field sMaxModeField>
	//*  10   27:aload_1         
	//*  11   28:invokestatic    #123 <Method int retrieveIntFromField(Field, TextView)>
	//*  12   31:iconst_1        
	//*  13   32:icmpne          67
		{
			if(!sMaximumFieldFetched)
	//*  14   35:getstatic       #125 <Field boolean sMaximumFieldFetched>
	//*  15   38:ifne            53
			{
				sMaximumField = retrieveField("mMaximum");
	//   16   41:ldc1            #127 <String "mMaximum">
	//   17   43:invokestatic    #119 <Method Field retrieveField(String)>
	//   18   46:putstatic       #129 <Field Field sMaximumField>
				sMaximumFieldFetched = true;
	//   19   49:iconst_1        
	//   20   50:putstatic       #125 <Field boolean sMaximumFieldFetched>
			}
			if(sMaximumField != null)
	//*  21   53:getstatic       #129 <Field Field sMaximumField>
	//*  22   56:ifnull          67
				return retrieveIntFromField(sMaximumField, textview);
	//   23   59:getstatic       #129 <Field Field sMaximumField>
	//   24   62:aload_1         
	//   25   63:invokestatic    #123 <Method int retrieveIntFromField(Field, TextView)>
	//   26   66:ireturn         
		}
		return -1;
	//   27   67:iconst_m1       
	//   28   68:ireturn         
	}

	public int getMinLines(TextView textview)
	{
		if(!sMinModeFieldFetched)
	//*   0    0:getstatic       #132 <Field boolean sMinModeFieldFetched>
	//*   1    3:ifne            18
		{
			sMinModeField = retrieveField("mMinMode");
	//    2    6:ldc1            #134 <String "mMinMode">
	//    3    8:invokestatic    #119 <Method Field retrieveField(String)>
	//    4   11:putstatic       #136 <Field Field sMinModeField>
			sMinModeFieldFetched = true;
	//    5   14:iconst_1        
	//    6   15:putstatic       #132 <Field boolean sMinModeFieldFetched>
		}
		if(sMinModeField != null && retrieveIntFromField(sMinModeField, textview) == 1)
	//*   7   18:getstatic       #136 <Field Field sMinModeField>
	//*   8   21:ifnull          67
	//*   9   24:getstatic       #136 <Field Field sMinModeField>
	//*  10   27:aload_1         
	//*  11   28:invokestatic    #123 <Method int retrieveIntFromField(Field, TextView)>
	//*  12   31:iconst_1        
	//*  13   32:icmpne          67
		{
			if(!sMinimumFieldFetched)
	//*  14   35:getstatic       #138 <Field boolean sMinimumFieldFetched>
	//*  15   38:ifne            53
			{
				sMinimumField = retrieveField("mMinimum");
	//   16   41:ldc1            #140 <String "mMinimum">
	//   17   43:invokestatic    #119 <Method Field retrieveField(String)>
	//   18   46:putstatic       #142 <Field Field sMinimumField>
				sMinimumFieldFetched = true;
	//   19   49:iconst_1        
	//   20   50:putstatic       #138 <Field boolean sMinimumFieldFetched>
			}
			if(sMinimumField != null)
	//*  21   53:getstatic       #142 <Field Field sMinimumField>
	//*  22   56:ifnull          67
				return retrieveIntFromField(sMinimumField, textview);
	//   23   59:getstatic       #142 <Field Field sMinimumField>
	//   24   62:aload_1         
	//   25   63:invokestatic    #123 <Method int retrieveIntFromField(Field, TextView)>
	//   26   66:ireturn         
		}
		return -1;
	//   27   67:iconst_m1       
	//   28   68:ireturn         
	}

	public void setAutoSizeTextTypeUniformWithConfiguration(TextView textview, int i, int j, int k, int l)
		throws IllegalArgumentException
	{
		if(textview instanceof AutoSizeableTextView)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #87  <Class AutoSizeableTextView>
	//*   2    4:ifeq            22
			((AutoSizeableTextView)textview).setAutoSizeTextTypeUniformWithConfiguration(i, j, k, l);
	//    3    7:aload_1         
	//    4    8:checkcast       #87  <Class AutoSizeableTextView>
	//    5   11:iload_2         
	//    6   12:iload_3         
	//    7   13:iload           4
	//    8   15:iload           5
	//    9   17:invokeinterface #149 <Method void AutoSizeableTextView.setAutoSizeTextTypeUniformWithConfiguration(int, int, int, int)>
	//   10   22:return          
	}

	public void setAutoSizeTextTypeUniformWithPresetSizes(TextView textview, int ai[], int i)
		throws IllegalArgumentException
	{
		if(textview instanceof AutoSizeableTextView)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #87  <Class AutoSizeableTextView>
	//*   2    4:ifeq            18
			((AutoSizeableTextView)textview).setAutoSizeTextTypeUniformWithPresetSizes(ai, i);
	//    3    7:aload_1         
	//    4    8:checkcast       #87  <Class AutoSizeableTextView>
	//    5   11:aload_2         
	//    6   12:iload_3         
	//    7   13:invokeinterface #155 <Method void AutoSizeableTextView.setAutoSizeTextTypeUniformWithPresetSizes(int[], int)>
	//    8   18:return          
	}

	public void setAutoSizeTextTypeWithDefaults(TextView textview, int i)
	{
		if(textview instanceof AutoSizeableTextView)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #87  <Class AutoSizeableTextView>
	//*   2    4:ifeq            17
			((AutoSizeableTextView)textview).setAutoSizeTextTypeWithDefaults(i);
	//    3    7:aload_1         
	//    4    8:checkcast       #87  <Class AutoSizeableTextView>
	//    5   11:iload_2         
	//    6   12:invokeinterface #160 <Method void AutoSizeableTextView.setAutoSizeTextTypeWithDefaults(int)>
	//    7   17:return          
	}

	public void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		textview.setCompoundDrawables(drawable, drawable1, drawable2, drawable3);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:invokevirtual   #167 <Method void TextView.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
	//    6   10:return          
	}

	public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l)
	{
		textview.setCompoundDrawablesWithIntrinsicBounds(i, j, k, l);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:invokevirtual   #172 <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(int, int, int, int)>
	//    6   10:return          
	}

	public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		textview.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable1, drawable2, drawable3);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:invokevirtual   #174 <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(Drawable, Drawable, Drawable, Drawable)>
	//    6   10:return          
	}

	public void setCustomSelectionActionModeCallback(TextView textview, android.view.ActionMode.Callback callback)
	{
		textview.setCustomSelectionActionModeCallback(callback);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #179 <Method void TextView.setCustomSelectionActionModeCallback(android.view.ActionMode$Callback)>
	//    3    5:return          
	}

	public void setTextAppearance(TextView textview, int i)
	{
		textview.setTextAppearance(textview.getContext(), i);
	//    0    0:aload_1         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #185 <Method android.content.Context TextView.getContext()>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #188 <Method void TextView.setTextAppearance(android.content.Context, int)>
	//    5    9:return          
	}

	private static final int LINES = 1;
	private static final String LOG_TAG = "TextViewCompatBase";
	private static Field sMaxModeField;
	private static boolean sMaxModeFieldFetched;
	private static Field sMaximumField;
	private static boolean sMaximumFieldFetched;
	private static Field sMinModeField;
	private static boolean sMinModeFieldFetched;
	private static Field sMinimumField;
	private static boolean sMinimumFieldFetched;

	TextViewCompat$TextViewCompatBaseImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:return          
	}
}
