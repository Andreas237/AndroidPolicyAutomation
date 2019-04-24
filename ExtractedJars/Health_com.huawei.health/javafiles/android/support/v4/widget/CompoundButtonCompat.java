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
//			TintableCompoundButton

public final class CompoundButtonCompat
{
	static class CompoundButtonCompatApi21Impl extends CompoundButtonCompatBaseImpl
	{

		public ColorStateList getButtonTintList(CompoundButton compoundbutton)
		{
			return compoundbutton.getButtonTintList();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method ColorStateList CompoundButton.getButtonTintList()>
		//    2    4:areturn         
		}

		public android.graphics.PorterDuff.Mode getButtonTintMode(CompoundButton compoundbutton)
		{
			return compoundbutton.getButtonTintMode();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #27  <Method android.graphics.PorterDuff$Mode CompoundButton.getButtonTintMode()>
		//    2    4:areturn         
		}

		public void setButtonTintList(CompoundButton compoundbutton, ColorStateList colorstatelist)
		{
			compoundbutton.setButtonTintList(colorstatelist);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #32  <Method void CompoundButton.setButtonTintList(ColorStateList)>
		//    3    5:return          
		}

		public void setButtonTintMode(CompoundButton compoundbutton, android.graphics.PorterDuff.Mode mode)
		{
			compoundbutton.setButtonTintMode(mode);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #37  <Method void CompoundButton.setButtonTintMode(android.graphics.PorterDuff$Mode)>
		//    3    5:return          
		}

		CompoundButtonCompatApi21Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void CompoundButtonCompat$CompoundButtonCompatBaseImpl()>
		//    2    4:return          
		}
	}

	static class CompoundButtonCompatApi23Impl extends CompoundButtonCompatApi21Impl
	{

		public Drawable getButtonDrawable(CompoundButton compoundbutton)
		{
			return compoundbutton.getButtonDrawable();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method Drawable CompoundButton.getButtonDrawable()>
		//    2    4:areturn         
		}

		CompoundButtonCompatApi23Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void CompoundButtonCompat$CompoundButtonCompatApi21Impl()>
		//    2    4:return          
		}
	}

	static class CompoundButtonCompatBaseImpl
	{

		public Drawable getButtonDrawable(CompoundButton compoundbutton)
		{
			if(!sButtonDrawableFieldFetched)
		//*   0    0:getstatic       #29  <Field boolean sButtonDrawableFieldFetched>
		//*   1    3:ifne            40
			{
				try
				{
					sButtonDrawableField = ((Class) (android/widget/CompoundButton)).getDeclaredField("mButtonDrawable");
		//    2    6:ldc1            #31  <Class CompoundButton>
		//    3    8:ldc1            #33  <String "mButtonDrawable">
		//    4   10:invokevirtual   #39  <Method Field Class.getDeclaredField(String)>
		//    5   13:putstatic       #41  <Field Field sButtonDrawableField>
					sButtonDrawableField.setAccessible(true);
		//    6   16:getstatic       #41  <Field Field sButtonDrawableField>
		//    7   19:iconst_1        
		//    8   20:invokevirtual   #47  <Method void Field.setAccessible(boolean)>
				}
		//*   9   23:goto            36
				catch(NoSuchFieldException nosuchfieldexception)
		//*  10   26:astore_2        
				{
					Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", ((Throwable) (nosuchfieldexception)));
		//   11   27:ldc1            #11  <String "CompoundButtonCompat">
		//   12   29:ldc1            #49  <String "Failed to retrieve mButtonDrawable field">
		//   13   31:aload_2         
		//   14   32:invokestatic    #55  <Method int Log.i(String, String, Throwable)>
		//   15   35:pop             
				}
				sButtonDrawableFieldFetched = true;
		//   16   36:iconst_1        
		//   17   37:putstatic       #29  <Field boolean sButtonDrawableFieldFetched>
			}
			if(sButtonDrawableField == null)
				break MISSING_BLOCK_LABEL_73;
		//   18   40:getstatic       #41  <Field Field sButtonDrawableField>
		//   19   43:ifnull          73
			compoundbutton = ((CompoundButton) ((Drawable)sButtonDrawableField.get(((Object) (compoundbutton)))));
		//   20   46:getstatic       #41  <Field Field sButtonDrawableField>
		//   21   49:aload_1         
		//   22   50:invokevirtual   #59  <Method Object Field.get(Object)>
		//   23   53:checkcast       #61  <Class Drawable>
		//   24   56:astore_1        
			return ((Drawable) (compoundbutton));
		//   25   57:aload_1         
		//   26   58:areturn         
			compoundbutton;
		//   27   59:astore_1        
			Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", ((Throwable) (compoundbutton)));
		//   28   60:ldc1            #11  <String "CompoundButtonCompat">
		//   29   62:ldc1            #63  <String "Failed to get button drawable via reflection">
		//   30   64:aload_1         
		//   31   65:invokestatic    #55  <Method int Log.i(String, String, Throwable)>
		//   32   68:pop             
			sButtonDrawableField = null;
		//   33   69:aconst_null     
		//   34   70:putstatic       #41  <Field Field sButtonDrawableField>
			return null;
		//   35   73:aconst_null     
		//   36   74:areturn         
		}

		public ColorStateList getButtonTintList(CompoundButton compoundbutton)
		{
			if(compoundbutton instanceof TintableCompoundButton)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #67  <Class TintableCompoundButton>
		//*   2    4:ifeq            17
				return ((TintableCompoundButton)compoundbutton).getSupportButtonTintList();
		//    3    7:aload_1         
		//    4    8:checkcast       #67  <Class TintableCompoundButton>
		//    5   11:invokeinterface #71  <Method ColorStateList TintableCompoundButton.getSupportButtonTintList()>
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
		//*   1    1:instanceof      #67  <Class TintableCompoundButton>
		//*   2    4:ifeq            17
				return ((TintableCompoundButton)compoundbutton).getSupportButtonTintMode();
		//    3    7:aload_1         
		//    4    8:checkcast       #67  <Class TintableCompoundButton>
		//    5   11:invokeinterface #77  <Method android.graphics.PorterDuff$Mode TintableCompoundButton.getSupportButtonTintMode()>
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
		//*   1    1:instanceof      #67  <Class TintableCompoundButton>
		//*   2    4:ifeq            17
				((TintableCompoundButton)compoundbutton).setSupportButtonTintList(colorstatelist);
		//    3    7:aload_1         
		//    4    8:checkcast       #67  <Class TintableCompoundButton>
		//    5   11:aload_2         
		//    6   12:invokeinterface #83  <Method void TintableCompoundButton.setSupportButtonTintList(ColorStateList)>
		//    7   17:return          
		}

		public void setButtonTintMode(CompoundButton compoundbutton, android.graphics.PorterDuff.Mode mode)
		{
			if(compoundbutton instanceof TintableCompoundButton)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #67  <Class TintableCompoundButton>
		//*   2    4:ifeq            17
				((TintableCompoundButton)compoundbutton).setSupportButtonTintMode(mode);
		//    3    7:aload_1         
		//    4    8:checkcast       #67  <Class TintableCompoundButton>
		//    5   11:aload_2         
		//    6   12:invokeinterface #89  <Method void TintableCompoundButton.setSupportButtonTintMode(android.graphics.PorterDuff$Mode)>
		//    7   17:return          
		}

		private static final String TAG = "CompoundButtonCompat";
		private static Field sButtonDrawableField;
		private static boolean sButtonDrawableFieldFetched = false;

		CompoundButtonCompatBaseImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}
	}


	private CompoundButtonCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:return          
	}

	public static Drawable getButtonDrawable(CompoundButton compoundbutton)
	{
		return IMPL.getButtonDrawable(compoundbutton);
	//    0    0:getstatic       #28  <Field CompoundButtonCompat$CompoundButtonCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #38  <Method Drawable CompoundButtonCompat$CompoundButtonCompatBaseImpl.getButtonDrawable(CompoundButton)>
	//    3    7:areturn         
	}

	public static ColorStateList getButtonTintList(CompoundButton compoundbutton)
	{
		return IMPL.getButtonTintList(compoundbutton);
	//    0    0:getstatic       #28  <Field CompoundButtonCompat$CompoundButtonCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #44  <Method ColorStateList CompoundButtonCompat$CompoundButtonCompatBaseImpl.getButtonTintList(CompoundButton)>
	//    3    7:areturn         
	}

	public static android.graphics.PorterDuff.Mode getButtonTintMode(CompoundButton compoundbutton)
	{
		return IMPL.getButtonTintMode(compoundbutton);
	//    0    0:getstatic       #28  <Field CompoundButtonCompat$CompoundButtonCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #48  <Method android.graphics.PorterDuff$Mode CompoundButtonCompat$CompoundButtonCompatBaseImpl.getButtonTintMode(CompoundButton)>
	//    3    7:areturn         
	}

	public static void setButtonTintList(CompoundButton compoundbutton, ColorStateList colorstatelist)
	{
		IMPL.setButtonTintList(compoundbutton, colorstatelist);
	//    0    0:getstatic       #28  <Field CompoundButtonCompat$CompoundButtonCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #52  <Method void CompoundButtonCompat$CompoundButtonCompatBaseImpl.setButtonTintList(CompoundButton, ColorStateList)>
	//    4    8:return          
	}

	public static void setButtonTintMode(CompoundButton compoundbutton, android.graphics.PorterDuff.Mode mode)
	{
		IMPL.setButtonTintMode(compoundbutton, mode);
	//    0    0:getstatic       #28  <Field CompoundButtonCompat$CompoundButtonCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #56  <Method void CompoundButtonCompat$CompoundButtonCompatBaseImpl.setButtonTintMode(CompoundButton, android.graphics.PorterDuff$Mode)>
	//    4    8:return          
	}

	private static final CompoundButtonCompatBaseImpl IMPL;

	static 
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #23  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_0        
		if(i >= 23)
	//*   2    4:iload_0         
	//*   3    5:bipush          23
	//*   4    7:icmplt          21
			IMPL = ((CompoundButtonCompatBaseImpl) (new CompoundButtonCompatApi23Impl()));
	//    5   10:new             #9   <Class CompoundButtonCompat$CompoundButtonCompatApi23Impl>
	//    6   13:dup             
	//    7   14:invokespecial   #26  <Method void CompoundButtonCompat$CompoundButtonCompatApi23Impl()>
	//    8   17:putstatic       #28  <Field CompoundButtonCompat$CompoundButtonCompatBaseImpl IMPL>
	//    9   20:return          
		else
		if(i >= 21)
	//*  10   21:iload_0         
	//*  11   22:bipush          21
	//*  12   24:icmplt          38
			IMPL = ((CompoundButtonCompatBaseImpl) (new CompoundButtonCompatApi21Impl()));
	//   13   27:new             #6   <Class CompoundButtonCompat$CompoundButtonCompatApi21Impl>
	//   14   30:dup             
	//   15   31:invokespecial   #29  <Method void CompoundButtonCompat$CompoundButtonCompatApi21Impl()>
	//   16   34:putstatic       #28  <Field CompoundButtonCompat$CompoundButtonCompatBaseImpl IMPL>
	//   17   37:return          
		else
			IMPL = new CompoundButtonCompatBaseImpl();
	//   18   38:new             #12  <Class CompoundButtonCompat$CompoundButtonCompatBaseImpl>
	//   19   41:dup             
	//   20   42:invokespecial   #30  <Method void CompoundButtonCompat$CompoundButtonCompatBaseImpl()>
	//   21   45:putstatic       #28  <Field CompoundButtonCompat$CompoundButtonCompatBaseImpl IMPL>
	//*  22   48:return          
	}
}
