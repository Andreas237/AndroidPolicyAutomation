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

	public static Drawable getButtonDrawable(CompoundButton compoundbutton)
	{
		Field field;
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #22  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          13
			return compoundbutton.getButtonDrawable();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #27  <Method Drawable CompoundButton.getButtonDrawable()>
	//    5   12:areturn         
		if(!sButtonDrawableFieldFetched)
	//*   6   13:getstatic       #29  <Field boolean sButtonDrawableFieldFetched>
	//*   7   16:ifne            53
		{
			try
			{
				sButtonDrawableField = ((Class) (android/widget/CompoundButton)).getDeclaredField("mButtonDrawable");
	//    8   19:ldc1            #24  <Class CompoundButton>
	//    9   21:ldc1            #31  <String "mButtonDrawable">
	//   10   23:invokevirtual   #37  <Method Field Class.getDeclaredField(String)>
	//   11   26:putstatic       #39  <Field Field sButtonDrawableField>
				sButtonDrawableField.setAccessible(true);
	//   12   29:getstatic       #39  <Field Field sButtonDrawableField>
	//   13   32:iconst_1        
	//   14   33:invokevirtual   #45  <Method void Field.setAccessible(boolean)>
			}
	//*  15   36:goto            49
			catch(NoSuchFieldException nosuchfieldexception)
	//*  16   39:astore_1        
			{
				Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", ((Throwable) (nosuchfieldexception)));
	//   17   40:ldc1            #47  <String "CompoundButtonCompat">
	//   18   42:ldc1            #49  <String "Failed to retrieve mButtonDrawable field">
	//   19   44:aload_1         
	//   20   45:invokestatic    #55  <Method int Log.i(String, String, Throwable)>
	//   21   48:pop             
			}
			sButtonDrawableFieldFetched = true;
	//   22   49:iconst_1        
	//   23   50:putstatic       #29  <Field boolean sButtonDrawableFieldFetched>
		}
		field = sButtonDrawableField;
	//   24   53:getstatic       #39  <Field Field sButtonDrawableField>
	//   25   56:astore_1        
		if(field == null)
			break MISSING_BLOCK_LABEL_86;
	//   26   57:aload_1         
	//   27   58:ifnull          86
		compoundbutton = ((CompoundButton) ((Drawable)field.get(((Object) (compoundbutton)))));
	//   28   61:aload_1         
	//   29   62:aload_0         
	//   30   63:invokevirtual   #59  <Method Object Field.get(Object)>
	//   31   66:checkcast       #61  <Class Drawable>
	//   32   69:astore_0        
		return ((Drawable) (compoundbutton));
	//   33   70:aload_0         
	//   34   71:areturn         
		compoundbutton;
	//   35   72:astore_0        
		Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", ((Throwable) (compoundbutton)));
	//   36   73:ldc1            #47  <String "CompoundButtonCompat">
	//   37   75:ldc1            #63  <String "Failed to get button drawable via reflection">
	//   38   77:aload_0         
	//   39   78:invokestatic    #55  <Method int Log.i(String, String, Throwable)>
	//   40   81:pop             
		sButtonDrawableField = null;
	//   41   82:aconst_null     
	//   42   83:putstatic       #39  <Field Field sButtonDrawableField>
		return null;
	//   43   86:aconst_null     
	//   44   87:areturn         
	}

	public static void setButtonTintList(CompoundButton compoundbutton, ColorStateList colorstatelist)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #22  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          14
		{
			compoundbutton.setButtonTintList(colorstatelist);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #71  <Method void CompoundButton.setButtonTintList(ColorStateList)>
			return;
	//    6   13:return          
		}
		if(compoundbutton instanceof TintableCompoundButton)
	//*   7   14:aload_0         
	//*   8   15:instanceof      #73  <Class TintableCompoundButton>
	//*   9   18:ifeq            31
			((TintableCompoundButton)compoundbutton).setSupportButtonTintList(colorstatelist);
	//   10   21:aload_0         
	//   11   22:checkcast       #73  <Class TintableCompoundButton>
	//   12   25:aload_1         
	//   13   26:invokeinterface #76  <Method void TintableCompoundButton.setSupportButtonTintList(ColorStateList)>
	//   14   31:return          
	}

	public static void setButtonTintMode(CompoundButton compoundbutton, android.graphics.PorterDuff.Mode mode)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #22  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          14
		{
			compoundbutton.setButtonTintMode(mode);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #81  <Method void CompoundButton.setButtonTintMode(android.graphics.PorterDuff$Mode)>
			return;
	//    6   13:return          
		}
		if(compoundbutton instanceof TintableCompoundButton)
	//*   7   14:aload_0         
	//*   8   15:instanceof      #73  <Class TintableCompoundButton>
	//*   9   18:ifeq            31
			((TintableCompoundButton)compoundbutton).setSupportButtonTintMode(mode);
	//   10   21:aload_0         
	//   11   22:checkcast       #73  <Class TintableCompoundButton>
	//   12   25:aload_1         
	//   13   26:invokeinterface #84  <Method void TintableCompoundButton.setSupportButtonTintMode(android.graphics.PorterDuff$Mode)>
	//   14   31:return          
	}

	private static Field sButtonDrawableField;
	private static boolean sButtonDrawableFieldFetched;
}
