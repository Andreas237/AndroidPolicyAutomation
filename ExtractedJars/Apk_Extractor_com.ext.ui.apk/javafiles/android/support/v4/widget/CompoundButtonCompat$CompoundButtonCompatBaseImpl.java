// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v4.widget:
//			CompoundButtonCompat, TintableCompoundButton

static class CompoundButtonCompat$CompoundButtonCompatBaseImpl
{

	public Drawable getButtonDrawable(CompoundButton compoundbutton)
	{
		if(!sButtonDrawableFieldFetched)
	//*   0    0:getstatic       #28  <Field boolean sButtonDrawableFieldFetched>
	//*   1    3:ifne            27
		{
			try
			{
				sButtonDrawableField = ((Class) (android/widget/CompoundButton)).getDeclaredField("mButtonDrawable");
	//    2    6:ldc1            #30  <Class CompoundButton>
	//    3    8:ldc1            #32  <String "mButtonDrawable">
	//    4   10:invokevirtual   #38  <Method Field Class.getDeclaredField(String)>
	//    5   13:putstatic       #40  <Field Field sButtonDrawableField>
				sButtonDrawableField.setAccessible(true);
	//    6   16:getstatic       #40  <Field Field sButtonDrawableField>
	//    7   19:iconst_1        
	//    8   20:invokevirtual   #46  <Method void Field.setAccessible(boolean)>
			}
	//*   9   23:iconst_1        
	//*  10   24:putstatic       #28  <Field boolean sButtonDrawableFieldFetched>
	//*  11   27:getstatic       #40  <Field Field sButtonDrawableField>
	//*  12   30:ifnull          73
	//*  13   33:getstatic       #40  <Field Field sButtonDrawableField>
	//*  14   36:aload_1         
	//*  15   37:invokevirtual   #50  <Method Object Field.get(Object)>
	//*  16   40:checkcast       #52  <Class Drawable>
	//*  17   43:astore_1        
	//*  18   44:aload_1         
	//*  19   45:areturn         
			catch(NoSuchFieldException nosuchfieldexception)
	//*  20   46:astore_2        
			{
				Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", ((Throwable) (nosuchfieldexception)));
	//   21   47:ldc1            #11  <String "CompoundButtonCompat">
	//   22   49:ldc1            #54  <String "Failed to retrieve mButtonDrawable field">
	//   23   51:aload_2         
	//   24   52:invokestatic    #60  <Method int Log.i(String, String, Throwable)>
	//   25   55:pop             
			}
			sButtonDrawableFieldFetched = true;
		}
		if(sButtonDrawableField == null)
			break MISSING_BLOCK_LABEL_73;
		compoundbutton = ((CompoundButton) ((Drawable)sButtonDrawableField.get(((Object) (compoundbutton)))));
		return ((Drawable) (compoundbutton));
	//*  26   56:goto            23
		compoundbutton;
	//   27   59:astore_1        
		Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", ((Throwable) (compoundbutton)));
	//   28   60:ldc1            #11  <String "CompoundButtonCompat">
	//   29   62:ldc1            #62  <String "Failed to get button drawable via reflection">
	//   30   64:aload_1         
	//   31   65:invokestatic    #60  <Method int Log.i(String, String, Throwable)>
	//   32   68:pop             
		sButtonDrawableField = null;
	//   33   69:aconst_null     
	//   34   70:putstatic       #40  <Field Field sButtonDrawableField>
		return null;
	//   35   73:aconst_null     
	//   36   74:areturn         
	}

	public ColorStateList getButtonTintList(CompoundButton compoundbutton)
	{
		if(compoundbutton instanceof TintableCompoundButton)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #66  <Class TintableCompoundButton>
	//*   2    4:ifeq            17
			return ((TintableCompoundButton)compoundbutton).getSupportButtonTintList();
	//    3    7:aload_1         
	//    4    8:checkcast       #66  <Class TintableCompoundButton>
	//    5   11:invokeinterface #70  <Method ColorStateList TintableCompoundButton.getSupportButtonTintList()>
	//    6   16:areturn         
		else
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
	}

	public android.graphics.PorterDuff.Mode getButtonTintMode(CompoundButton compoundbutton)
	{
		if(compoundbutton instanceof TintableCompoundButton)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #66  <Class TintableCompoundButton>
	//*   2    4:ifeq            17
			return ((TintableCompoundButton)compoundbutton).getSupportButtonTintMode();
	//    3    7:aload_1         
	//    4    8:checkcast       #66  <Class TintableCompoundButton>
	//    5   11:invokeinterface #76  <Method android.graphics.PorterDuff$Mode TintableCompoundButton.getSupportButtonTintMode()>
	//    6   16:areturn         
		else
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
	}

	public void setButtonTintList(CompoundButton compoundbutton, ColorStateList colorstatelist)
	{
		if(compoundbutton instanceof TintableCompoundButton)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #66  <Class TintableCompoundButton>
	//*   2    4:ifeq            17
			((TintableCompoundButton)compoundbutton).setSupportButtonTintList(colorstatelist);
	//    3    7:aload_1         
	//    4    8:checkcast       #66  <Class TintableCompoundButton>
	//    5   11:aload_2         
	//    6   12:invokeinterface #82  <Method void TintableCompoundButton.setSupportButtonTintList(ColorStateList)>
	//    7   17:return          
	}

	public void setButtonTintMode(CompoundButton compoundbutton, android.graphics.PorterDuff.Mode mode)
	{
		if(compoundbutton instanceof TintableCompoundButton)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #66  <Class TintableCompoundButton>
	//*   2    4:ifeq            17
			((TintableCompoundButton)compoundbutton).setSupportButtonTintMode(mode);
	//    3    7:aload_1         
	//    4    8:checkcast       #66  <Class TintableCompoundButton>
	//    5   11:aload_2         
	//    6   12:invokeinterface #88  <Method void TintableCompoundButton.setSupportButtonTintMode(android.graphics.PorterDuff$Mode)>
	//    7   17:return          
	}

	private static final String TAG = "CompoundButtonCompat";
	private static Field sButtonDrawableField;
	private static boolean sButtonDrawableFieldFetched;

	CompoundButtonCompat$CompoundButtonCompatBaseImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}
}
