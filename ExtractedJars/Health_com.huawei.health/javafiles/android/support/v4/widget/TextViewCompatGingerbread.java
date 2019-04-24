// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.TextView;
import java.lang.reflect.Field;

class TextViewCompatGingerbread
{

	TextViewCompatGingerbread()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:return          
	}

	static Drawable[] getCompoundDrawablesRelative(TextView textview)
	{
		return textview.getCompoundDrawables();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method Drawable[] TextView.getCompoundDrawables()>
	//    2    4:areturn         
	}

	static int getMaxLines(TextView textview)
	{
		if(!sMaxModeFieldFetched)
	//*   0    0:getstatic       #44  <Field boolean sMaxModeFieldFetched>
	//*   1    3:ifne            18
		{
			sMaxModeField = retrieveField("mMaxMode");
	//    2    6:ldc1            #46  <String "mMaxMode">
	//    3    8:invokestatic    #50  <Method Field retrieveField(String)>
	//    4   11:putstatic       #52  <Field Field sMaxModeField>
			sMaxModeFieldFetched = true;
	//    5   14:iconst_1        
	//    6   15:putstatic       #44  <Field boolean sMaxModeFieldFetched>
		}
		if(sMaxModeField != null && retrieveIntFromField(sMaxModeField, textview) == 1)
	//*   7   18:getstatic       #52  <Field Field sMaxModeField>
	//*   8   21:ifnull          67
	//*   9   24:getstatic       #52  <Field Field sMaxModeField>
	//*  10   27:aload_0         
	//*  11   28:invokestatic    #56  <Method int retrieveIntFromField(Field, TextView)>
	//*  12   31:iconst_1        
	//*  13   32:icmpne          67
		{
			if(!sMaximumFieldFetched)
	//*  14   35:getstatic       #58  <Field boolean sMaximumFieldFetched>
	//*  15   38:ifne            53
			{
				sMaximumField = retrieveField("mMaximum");
	//   16   41:ldc1            #60  <String "mMaximum">
	//   17   43:invokestatic    #50  <Method Field retrieveField(String)>
	//   18   46:putstatic       #62  <Field Field sMaximumField>
				sMaximumFieldFetched = true;
	//   19   49:iconst_1        
	//   20   50:putstatic       #58  <Field boolean sMaximumFieldFetched>
			}
			if(sMaximumField != null)
	//*  21   53:getstatic       #62  <Field Field sMaximumField>
	//*  22   56:ifnull          67
				return retrieveIntFromField(sMaximumField, textview);
	//   23   59:getstatic       #62  <Field Field sMaximumField>
	//   24   62:aload_0         
	//   25   63:invokestatic    #56  <Method int retrieveIntFromField(Field, TextView)>
	//   26   66:ireturn         
		}
		return -1;
	//   27   67:iconst_m1       
	//   28   68:ireturn         
	}

	static int getMinLines(TextView textview)
	{
		if(!sMinModeFieldFetched)
	//*   0    0:getstatic       #65  <Field boolean sMinModeFieldFetched>
	//*   1    3:ifne            18
		{
			sMinModeField = retrieveField("mMinMode");
	//    2    6:ldc1            #67  <String "mMinMode">
	//    3    8:invokestatic    #50  <Method Field retrieveField(String)>
	//    4   11:putstatic       #69  <Field Field sMinModeField>
			sMinModeFieldFetched = true;
	//    5   14:iconst_1        
	//    6   15:putstatic       #65  <Field boolean sMinModeFieldFetched>
		}
		if(sMinModeField != null && retrieveIntFromField(sMinModeField, textview) == 1)
	//*   7   18:getstatic       #69  <Field Field sMinModeField>
	//*   8   21:ifnull          67
	//*   9   24:getstatic       #69  <Field Field sMinModeField>
	//*  10   27:aload_0         
	//*  11   28:invokestatic    #56  <Method int retrieveIntFromField(Field, TextView)>
	//*  12   31:iconst_1        
	//*  13   32:icmpne          67
		{
			if(!sMinimumFieldFetched)
	//*  14   35:getstatic       #71  <Field boolean sMinimumFieldFetched>
	//*  15   38:ifne            53
			{
				sMinimumField = retrieveField("mMinimum");
	//   16   41:ldc1            #73  <String "mMinimum">
	//   17   43:invokestatic    #50  <Method Field retrieveField(String)>
	//   18   46:putstatic       #75  <Field Field sMinimumField>
				sMinimumFieldFetched = true;
	//   19   49:iconst_1        
	//   20   50:putstatic       #71  <Field boolean sMinimumFieldFetched>
			}
			if(sMinimumField != null)
	//*  21   53:getstatic       #75  <Field Field sMinimumField>
	//*  22   56:ifnull          67
				return retrieveIntFromField(sMinimumField, textview);
	//   23   59:getstatic       #75  <Field Field sMinimumField>
	//   24   62:aload_0         
	//   25   63:invokestatic    #56  <Method int retrieveIntFromField(Field, TextView)>
	//   26   66:ireturn         
		}
		return -1;
	//   27   67:iconst_m1       
	//   28   68:ireturn         
	}

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
	//    4    5:invokevirtual   #82  <Method Field Class.getDeclaredField(String)>
	//    5    8:astore_2        
		}
	//*   6    9:aload_2         
	//*   7   10:astore_1        
	//*   8   11:aload_2         
	//*   9   12:iconst_1        
	//*  10   13:invokevirtual   #88  <Method void Field.setAccessible(boolean)>
	//*  11   16:aload_2         
	//*  12   17:areturn         
		catch(NoSuchFieldException nosuchfieldexception)
	//*  13   18:astore_2        
		{
			Log.e("TextViewCompatGingerbread", (new StringBuilder()).append("Could not retrieve ").append(s).append(" field.").toString());
	//   14   19:ldc1            #14  <String "TextViewCompatGingerbread">
	//   15   21:new             #90  <Class StringBuilder>
	//   16   24:dup             
	//   17   25:invokespecial   #91  <Method void StringBuilder()>
	//   18   28:ldc1            #93  <String "Could not retrieve ">
	//   19   30:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   20   33:aload_0         
	//   21   34:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   22   37:ldc1            #99  <String " field.">
	//   23   39:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   24   42:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   25   45:invokestatic    #109 <Method int Log.e(String, String)>
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
	//    2    2:invokevirtual   #115 <Method int Field.getInt(Object)>
	//    3    5:istore_2        
		}
	//*   4    6:iload_2         
	//*   5    7:ireturn         
		// Misplaced declaration of an exception variable
		catch(TextView textview)
	//*   6    8:astore_1        
		{
			Log.d("TextViewCompatGingerbread", (new StringBuilder()).append("Could not retrieve value of ").append(field.getName()).append(" field.").toString());
	//    7    9:ldc1            #14  <String "TextViewCompatGingerbread">
	//    8   11:new             #90  <Class StringBuilder>
	//    9   14:dup             
	//   10   15:invokespecial   #91  <Method void StringBuilder()>
	//   11   18:ldc1            #117 <String "Could not retrieve value of ">
	//   12   20:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   13   23:aload_0         
	//   14   24:invokevirtual   #120 <Method String Field.getName()>
	//   15   27:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:ldc1            #99  <String " field.">
	//   17   32:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   19   38:invokestatic    #123 <Method int Log.d(String, String)>
	//   20   41:pop             
			return -1;
	//   21   42:iconst_m1       
	//   22   43:ireturn         
		}
		return i;
	}

	static void setTextAppearance(TextView textview, int i)
	{
		textview.setTextAppearance(textview.getContext(), i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #129 <Method android.content.Context TextView.getContext()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #132 <Method void TextView.setTextAppearance(android.content.Context, int)>
	//    5    9:return          
	}

	private static final int LINES = 1;
	private static final String LOG_TAG = "TextViewCompatGingerbread";
	private static Field sMaxModeField;
	private static boolean sMaxModeFieldFetched = false;
	private static Field sMaximumField;
	private static boolean sMaximumFieldFetched = false;
	private static Field sMinModeField;
	private static boolean sMinModeFieldFetched = false;
	private static Field sMinimumField;
	private static boolean sMinimumFieldFetched = false;
}
