// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.TextView;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v4.widget:
//			AutoSizeableTextView

public final class TextViewCompat
{
	public static interface AutoSizeTextType
		extends Annotation
	{
	}

	static class TextViewCompatApi16Impl extends TextViewCompatBaseImpl
	{

		public int getMaxLines(TextView textview)
		{
			return textview.getMaxLines();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method int TextView.getMaxLines()>
		//    2    4:ireturn         
		}

		public int getMinLines(TextView textview)
		{
			return textview.getMinLines();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #25  <Method int TextView.getMinLines()>
		//    2    4:ireturn         
		}

		TextViewCompatApi16Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void TextViewCompat$TextViewCompatBaseImpl()>
		//    2    4:return          
		}
	}

	static class TextViewCompatApi17Impl extends TextViewCompatApi16Impl
	{

		public Drawable[] getCompoundDrawablesRelative(TextView textview)
		{
			boolean flag = true;
		//    0    0:iconst_1        
		//    1    1:istore_2        
			if(textview.getLayoutDirection() != 1)
		//*   2    2:aload_1         
		//*   3    3:invokevirtual   #24  <Method int TextView.getLayoutDirection()>
		//*   4    6:iconst_1        
		//*   5    7:icmpne          39
		//*   6   10:aload_1         
		//*   7   11:invokevirtual   #28  <Method Drawable[] TextView.getCompoundDrawables()>
		//*   8   14:astore_1        
		//*   9   15:iload_2         
		//*  10   16:ifeq            37
		//*  11   19:aload_1         
		//*  12   20:iconst_2        
		//*  13   21:aaload          
		//*  14   22:astore_3        
		//*  15   23:aload_1         
		//*  16   24:iconst_0        
		//*  17   25:aaload          
		//*  18   26:astore          4
		//*  19   28:aload_1         
		//*  20   29:iconst_0        
		//*  21   30:aload_3         
		//*  22   31:aastore         
		//*  23   32:aload_1         
		//*  24   33:iconst_2        
		//*  25   34:aload           4
		//*  26   36:aastore         
		//*  27   37:aload_1         
		//*  28   38:areturn         
				flag = false;
		//   29   39:iconst_0        
		//   30   40:istore_2        
			textview = ((TextView) (textview.getCompoundDrawables()));
			if(flag)
			{
				Object obj = textview[2];
				Object obj1 = textview[0];
				textview[0] = obj;
				textview[2] = obj1;
			}
			return ((Drawable []) (textview));
		//*  31   41:goto            10
		}

		public void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
		{
			boolean flag;
			Drawable drawable4;
			if(textview.getLayoutDirection() == 1)
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #24  <Method int TextView.getLayoutDirection()>
		//*   2    4:iconst_1        
		//*   3    5:icmpne          36
				flag = true;
		//    4    8:iconst_1        
		//    5    9:istore          6
			else
		//*   6   11:iload           6
		//*   7   13:ifeq            42
		//*   8   16:aload           4
		//*   9   18:astore          7
		//*  10   20:iload           6
		//*  11   22:ifeq            48
		//*  12   25:aload_1         
		//*  13   26:aload           7
		//*  14   28:aload_3         
		//*  15   29:aload_2         
		//*  16   30:aload           5
		//*  17   32:invokevirtual   #36  <Method void TextView.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
		//*  18   35:return          
				flag = false;
		//   19   36:iconst_0        
		//   20   37:istore          6
			if(flag)
				drawable4 = drawable2;
			else
		//*  21   39:goto            11
				drawable4 = drawable;
		//   22   42:aload_2         
		//   23   43:astore          7
			if(!flag)
		//*  24   45:goto            20
				drawable = drawable2;
		//   25   48:aload           4
		//   26   50:astore_2        
			textview.setCompoundDrawables(drawable4, drawable1, drawable, drawable3);
		//*  27   51:goto            25
		}

		public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l)
		{
			boolean flag;
			int i1;
			if(textview.getLayoutDirection() == 1)
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #24  <Method int TextView.getLayoutDirection()>
		//*   2    4:iconst_1        
		//*   3    5:icmpne          36
				flag = true;
		//    4    8:iconst_1        
		//    5    9:istore          6
			else
		//*   6   11:iload           6
		//*   7   13:ifeq            42
		//*   8   16:iload           4
		//*   9   18:istore          7
		//*  10   20:iload           6
		//*  11   22:ifeq            48
		//*  12   25:aload_1         
		//*  13   26:iload           7
		//*  14   28:iload_3         
		//*  15   29:iload_2         
		//*  16   30:iload           5
		//*  17   32:invokevirtual   #43  <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(int, int, int, int)>
		//*  18   35:return          
				flag = false;
		//   19   36:iconst_0        
		//   20   37:istore          6
			if(flag)
				i1 = k;
			else
		//*  21   39:goto            11
				i1 = i;
		//   22   42:iload_2         
		//   23   43:istore          7
			if(!flag)
		//*  24   45:goto            20
				i = k;
		//   25   48:iload           4
		//   26   50:istore_2        
			textview.setCompoundDrawablesWithIntrinsicBounds(i1, j, i, l);
		//*  27   51:goto            25
		}

		public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
		{
			boolean flag;
			Drawable drawable4;
			if(textview.getLayoutDirection() == 1)
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #24  <Method int TextView.getLayoutDirection()>
		//*   2    4:iconst_1        
		//*   3    5:icmpne          36
				flag = true;
		//    4    8:iconst_1        
		//    5    9:istore          6
			else
		//*   6   11:iload           6
		//*   7   13:ifeq            42
		//*   8   16:aload           4
		//*   9   18:astore          7
		//*  10   20:iload           6
		//*  11   22:ifeq            48
		//*  12   25:aload_1         
		//*  13   26:aload           7
		//*  14   28:aload_3         
		//*  15   29:aload_2         
		//*  16   30:aload           5
		//*  17   32:invokevirtual   #45  <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(Drawable, Drawable, Drawable, Drawable)>
		//*  18   35:return          
				flag = false;
		//   19   36:iconst_0        
		//   20   37:istore          6
			if(flag)
				drawable4 = drawable2;
			else
		//*  21   39:goto            11
				drawable4 = drawable;
		//   22   42:aload_2         
		//   23   43:astore          7
			if(!flag)
		//*  24   45:goto            20
				drawable = drawable2;
		//   25   48:aload           4
		//   26   50:astore_2        
			textview.setCompoundDrawablesWithIntrinsicBounds(drawable4, drawable1, drawable, drawable3);
		//*  27   51:goto            25
		}

		TextViewCompatApi17Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void TextViewCompat$TextViewCompatApi16Impl()>
		//    2    4:return          
		}
	}

	static class TextViewCompatApi18Impl extends TextViewCompatApi17Impl
	{

		public Drawable[] getCompoundDrawablesRelative(TextView textview)
		{
			return textview.getCompoundDrawablesRelative();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #23  <Method Drawable[] TextView.getCompoundDrawablesRelative()>
		//    2    4:areturn         
		}

		public void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
		{
			textview.setCompoundDrawablesRelative(drawable, drawable1, drawable2, drawable3);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:aload           4
		//    4    5:aload           5
		//    5    7:invokevirtual   #30  <Method void TextView.setCompoundDrawablesRelative(Drawable, Drawable, Drawable, Drawable)>
		//    6   10:return          
		}

		public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l)
		{
			textview.setCompoundDrawablesRelativeWithIntrinsicBounds(i, j, k, l);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:iload_3         
		//    3    3:iload           4
		//    4    5:iload           5
		//    5    7:invokevirtual   #36  <Method void TextView.setCompoundDrawablesRelativeWithIntrinsicBounds(int, int, int, int)>
		//    6   10:return          
		}

		public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
		{
			textview.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable1, drawable2, drawable3);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:aload           4
		//    4    5:aload           5
		//    5    7:invokevirtual   #38  <Method void TextView.setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable, Drawable, Drawable, Drawable)>
		//    6   10:return          
		}

		TextViewCompatApi18Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void TextViewCompat$TextViewCompatApi17Impl()>
		//    2    4:return          
		}
	}

	static class TextViewCompatApi23Impl extends TextViewCompatApi18Impl
	{

		public void setTextAppearance(TextView textview, int i)
		{
			textview.setTextAppearance(i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokevirtual   #24  <Method void TextView.setTextAppearance(int)>
		//    3    5:return          
		}

		TextViewCompatApi23Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void TextViewCompat$TextViewCompatApi18Impl()>
		//    2    4:return          
		}
	}

	static class TextViewCompatApi26Impl extends TextViewCompatApi23Impl
	{

		public int getAutoSizeMaxTextSize(TextView textview)
		{
			return textview.getAutoSizeMaxTextSize();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method int TextView.getAutoSizeMaxTextSize()>
		//    2    4:ireturn         
		}

		public int getAutoSizeMinTextSize(TextView textview)
		{
			return textview.getAutoSizeMinTextSize();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #25  <Method int TextView.getAutoSizeMinTextSize()>
		//    2    4:ireturn         
		}

		public int getAutoSizeStepGranularity(TextView textview)
		{
			return textview.getAutoSizeStepGranularity();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #28  <Method int TextView.getAutoSizeStepGranularity()>
		//    2    4:ireturn         
		}

		public int[] getAutoSizeTextAvailableSizes(TextView textview)
		{
			return textview.getAutoSizeTextAvailableSizes();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #33  <Method int[] TextView.getAutoSizeTextAvailableSizes()>
		//    2    4:areturn         
		}

		public int getAutoSizeTextType(TextView textview)
		{
			return textview.getAutoSizeTextType();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #36  <Method int TextView.getAutoSizeTextType()>
		//    2    4:ireturn         
		}

		public void setAutoSizeTextTypeUniformWithConfiguration(TextView textview, int i, int j, int k, int l)
			throws IllegalArgumentException
		{
			textview.setAutoSizeTextTypeUniformWithConfiguration(i, j, k, l);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:iload_3         
		//    3    3:iload           4
		//    4    5:iload           5
		//    5    7:invokevirtual   #43  <Method void TextView.setAutoSizeTextTypeUniformWithConfiguration(int, int, int, int)>
		//    6   10:return          
		}

		public void setAutoSizeTextTypeUniformWithPresetSizes(TextView textview, int ai[], int i)
			throws IllegalArgumentException
		{
			textview.setAutoSizeTextTypeUniformWithPresetSizes(ai, i);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:iload_3         
		//    3    3:invokevirtual   #50  <Method void TextView.setAutoSizeTextTypeUniformWithPresetSizes(int[], int)>
		//    4    6:return          
		}

		public void setAutoSizeTextTypeWithDefaults(TextView textview, int i)
		{
			textview.setAutoSizeTextTypeWithDefaults(i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokevirtual   #56  <Method void TextView.setAutoSizeTextTypeWithDefaults(int)>
		//    3    5:return          
		}

		TextViewCompatApi26Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void TextViewCompat$TextViewCompatApi23Impl()>
		//    2    4:return          
		}
	}

	static class TextViewCompatBaseImpl
	{

		private static Field retrieveField(String s)
		{
			Field field = null;
		//    0    0:aconst_null     
		//    1    1:astore_1        
			Field field1;
			try
			{
				field1 = ((Class) (android/widget/TextView)).getDeclaredField(s);
		//    2    2:ldc1            #35  <Class TextView>
		//    3    4:aload_0         
		//    4    5:invokevirtual   #40  <Method Field Class.getDeclaredField(String)>
		//    5    8:astore_2        
			}
		//*   6    9:aload_2         
		//*   7   10:astore_1        
		//*   8   11:aload_2         
		//*   9   12:iconst_1        
		//*  10   13:invokevirtual   #46  <Method void Field.setAccessible(boolean)>
		//*  11   16:aload_2         
		//*  12   17:areturn         
			catch(NoSuchFieldException nosuchfieldexception)
		//*  13   18:astore_2        
			{
				Log.e("TextViewCompatBase", (new StringBuilder()).append("Could not retrieve ").append(s).append(" field.").toString());
		//   14   19:ldc1            #14  <String "TextViewCompatBase">
		//   15   21:new             #48  <Class StringBuilder>
		//   16   24:dup             
		//   17   25:invokespecial   #49  <Method void StringBuilder()>
		//   18   28:ldc1            #51  <String "Could not retrieve ">
		//   19   30:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   20   33:aload_0         
		//   21   34:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   22   37:ldc1            #57  <String " field.">
		//   23   39:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   24   42:invokevirtual   #61  <Method String StringBuilder.toString()>
		//   25   45:invokestatic    #67  <Method int Log.e(String, String)>
		//   26   48:pop             
				return field;
		//   27   49:aload_1         
		//   28   50:areturn         
			}
			field = field1;
			field1.setAccessible(true);
			return field1;
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
			// Misplaced declaration of an exception variable
			catch(TextView textview)
		//*   6    8:astore_1        
			{
				Log.d("TextViewCompatBase", (new StringBuilder()).append("Could not retrieve value of ").append(field.getName()).append(" field.").toString());
		//    7    9:ldc1            #14  <String "TextViewCompatBase">
		//    8   11:new             #48  <Class StringBuilder>
		//    9   14:dup             
		//   10   15:invokespecial   #49  <Method void StringBuilder()>
		//   11   18:ldc1            #77  <String "Could not retrieve value of ">
		//   12   20:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   13   23:aload_0         
		//   14   24:invokevirtual   #80  <Method String Field.getName()>
		//   15   27:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   16   30:ldc1            #57  <String " field.">
		//   17   32:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   18   35:invokevirtual   #61  <Method String StringBuilder.toString()>
		//   19   38:invokestatic    #83  <Method int Log.d(String, String)>
		//   20   41:pop             
				return -1;
		//   21   42:iconst_m1       
		//   22   43:ireturn         
			}
			return i;
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

		public void setTextAppearance(TextView textview, int i)
		{
			textview.setTextAppearance(textview.getContext(), i);
		//    0    0:aload_1         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #180 <Method android.content.Context TextView.getContext()>
		//    3    5:iload_2         
		//    4    6:invokevirtual   #183 <Method void TextView.setTextAppearance(android.content.Context, int)>
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

		TextViewCompatBaseImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
		//    2    4:return          
		}
	}


	private TextViewCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
	//    2    4:return          
	}

	public static int getAutoSizeMaxTextSize(TextView textview)
	{
		return IMPL.getAutoSizeMaxTextSize(textview);
	//    0    0:getstatic       #44  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #55  <Method int TextViewCompat$TextViewCompatBaseImpl.getAutoSizeMaxTextSize(TextView)>
	//    3    7:ireturn         
	}

	public static int getAutoSizeMinTextSize(TextView textview)
	{
		return IMPL.getAutoSizeMinTextSize(textview);
	//    0    0:getstatic       #44  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #58  <Method int TextViewCompat$TextViewCompatBaseImpl.getAutoSizeMinTextSize(TextView)>
	//    3    7:ireturn         
	}

	public static int getAutoSizeStepGranularity(TextView textview)
	{
		return IMPL.getAutoSizeStepGranularity(textview);
	//    0    0:getstatic       #44  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #61  <Method int TextViewCompat$TextViewCompatBaseImpl.getAutoSizeStepGranularity(TextView)>
	//    3    7:ireturn         
	}

	public static int[] getAutoSizeTextAvailableSizes(TextView textview)
	{
		return IMPL.getAutoSizeTextAvailableSizes(textview);
	//    0    0:getstatic       #44  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #65  <Method int[] TextViewCompat$TextViewCompatBaseImpl.getAutoSizeTextAvailableSizes(TextView)>
	//    3    7:areturn         
	}

	public static int getAutoSizeTextType(TextView textview)
	{
		return IMPL.getAutoSizeTextType(textview);
	//    0    0:getstatic       #44  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #68  <Method int TextViewCompat$TextViewCompatBaseImpl.getAutoSizeTextType(TextView)>
	//    3    7:ireturn         
	}

	public static Drawable[] getCompoundDrawablesRelative(TextView textview)
	{
		return IMPL.getCompoundDrawablesRelative(textview);
	//    0    0:getstatic       #44  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #73  <Method Drawable[] TextViewCompat$TextViewCompatBaseImpl.getCompoundDrawablesRelative(TextView)>
	//    3    7:areturn         
	}

	public static int getMaxLines(TextView textview)
	{
		return IMPL.getMaxLines(textview);
	//    0    0:getstatic       #44  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #77  <Method int TextViewCompat$TextViewCompatBaseImpl.getMaxLines(TextView)>
	//    3    7:ireturn         
	}

	public static int getMinLines(TextView textview)
	{
		return IMPL.getMinLines(textview);
	//    0    0:getstatic       #44  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #80  <Method int TextViewCompat$TextViewCompatBaseImpl.getMinLines(TextView)>
	//    3    7:ireturn         
	}

	public static void setAutoSizeTextTypeUniformWithConfiguration(TextView textview, int i, int j, int k, int l)
		throws IllegalArgumentException
	{
		IMPL.setAutoSizeTextTypeUniformWithConfiguration(textview, i, j, k, l);
	//    0    0:getstatic       #44  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #86  <Method void TextViewCompat$TextViewCompatBaseImpl.setAutoSizeTextTypeUniformWithConfiguration(TextView, int, int, int, int)>
	//    7   12:return          
	}

	public static void setAutoSizeTextTypeUniformWithPresetSizes(TextView textview, int ai[], int i)
		throws IllegalArgumentException
	{
		IMPL.setAutoSizeTextTypeUniformWithPresetSizes(textview, ai, i);
	//    0    0:getstatic       #44  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #91  <Method void TextViewCompat$TextViewCompatBaseImpl.setAutoSizeTextTypeUniformWithPresetSizes(TextView, int[], int)>
	//    5    9:return          
	}

	public static void setAutoSizeTextTypeWithDefaults(TextView textview, int i)
	{
		IMPL.setAutoSizeTextTypeWithDefaults(textview, i);
	//    0    0:getstatic       #44  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokevirtual   #95  <Method void TextViewCompat$TextViewCompatBaseImpl.setAutoSizeTextTypeWithDefaults(TextView, int)>
	//    4    8:return          
	}

	public static void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		IMPL.setCompoundDrawablesRelative(textview, drawable, drawable1, drawable2, drawable3);
	//    0    0:getstatic       #44  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #100 <Method void TextViewCompat$TextViewCompatBaseImpl.setCompoundDrawablesRelative(TextView, Drawable, Drawable, Drawable, Drawable)>
	//    7   12:return          
	}

	public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l)
	{
		IMPL.setCompoundDrawablesRelativeWithIntrinsicBounds(textview, i, j, k, l);
	//    0    0:getstatic       #44  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #104 <Method void TextViewCompat$TextViewCompatBaseImpl.setCompoundDrawablesRelativeWithIntrinsicBounds(TextView, int, int, int, int)>
	//    7   12:return          
	}

	public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		IMPL.setCompoundDrawablesRelativeWithIntrinsicBounds(textview, drawable, drawable1, drawable2, drawable3);
	//    0    0:getstatic       #44  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #106 <Method void TextViewCompat$TextViewCompatBaseImpl.setCompoundDrawablesRelativeWithIntrinsicBounds(TextView, Drawable, Drawable, Drawable, Drawable)>
	//    7   12:return          
	}

	public static void setTextAppearance(TextView textview, int i)
	{
		IMPL.setTextAppearance(textview, i);
	//    0    0:getstatic       #44  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokevirtual   #110 <Method void TextViewCompat$TextViewCompatBaseImpl.setTextAppearance(TextView, int)>
	//    4    8:return          
	}

	public static final int AUTO_SIZE_TEXT_TYPE_NONE = 0;
	public static final int AUTO_SIZE_TEXT_TYPE_UNIFORM = 1;
	static final TextViewCompatBaseImpl IMPL;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          19
			IMPL = ((TextViewCompatBaseImpl) (new TextViewCompatApi26Impl()));
	//    3    8:new             #21  <Class TextViewCompat$TextViewCompatApi26Impl>
	//    4   11:dup             
	//    5   12:invokespecial   #42  <Method void TextViewCompat$TextViewCompatApi26Impl()>
	//    6   15:putstatic       #44  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//    7   18:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   8   19:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   22:bipush          23
	//*  10   24:icmplt          38
			IMPL = ((TextViewCompatBaseImpl) (new TextViewCompatApi23Impl()));
	//   11   27:new             #18  <Class TextViewCompat$TextViewCompatApi23Impl>
	//   12   30:dup             
	//   13   31:invokespecial   #45  <Method void TextViewCompat$TextViewCompatApi23Impl()>
	//   14   34:putstatic       #44  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//   15   37:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*  16   38:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   41:bipush          18
	//*  18   43:icmplt          57
			IMPL = ((TextViewCompatBaseImpl) (new TextViewCompatApi18Impl()));
	//   19   46:new             #15  <Class TextViewCompat$TextViewCompatApi18Impl>
	//   20   49:dup             
	//   21   50:invokespecial   #46  <Method void TextViewCompat$TextViewCompatApi18Impl()>
	//   22   53:putstatic       #44  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//   23   56:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*  24   57:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
	//*  25   60:bipush          17
	//*  26   62:icmplt          76
			IMPL = ((TextViewCompatBaseImpl) (new TextViewCompatApi17Impl()));
	//   27   65:new             #12  <Class TextViewCompat$TextViewCompatApi17Impl>
	//   28   68:dup             
	//   29   69:invokespecial   #47  <Method void TextViewCompat$TextViewCompatApi17Impl()>
	//   30   72:putstatic       #44  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//   31   75:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  32   76:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
	//*  33   79:bipush          16
	//*  34   81:icmplt          95
			IMPL = ((TextViewCompatBaseImpl) (new TextViewCompatApi16Impl()));
	//   35   84:new             #9   <Class TextViewCompat$TextViewCompatApi16Impl>
	//   36   87:dup             
	//   37   88:invokespecial   #48  <Method void TextViewCompat$TextViewCompatApi16Impl()>
	//   38   91:putstatic       #44  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//   39   94:return          
		else
			IMPL = new TextViewCompatBaseImpl();
	//   40   95:new             #24  <Class TextViewCompat$TextViewCompatBaseImpl>
	//   41   98:dup             
	//   42   99:invokespecial   #49  <Method void TextViewCompat$TextViewCompatBaseImpl()>
	//   43  102:putstatic       #44  <Field TextViewCompat$TextViewCompatBaseImpl IMPL>
	//*  44  105:return          
	}
}
