// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.databinding.InverseBindingListener;
import android.graphics.drawable.Drawable;
import android.text.*;
import android.text.method.*;
import android.util.Log;
import android.widget.TextView;

// Referenced classes of package android.databinding.adapters:
//			ListenerUtil

public class TextViewBindingAdapter
{
	public static interface AfterTextChanged
	{

		public abstract void afterTextChanged(Editable editable);
	}

	public static interface BeforeTextChanged
	{

		public abstract void beforeTextChanged(CharSequence charsequence, int i, int j, int k);
	}

	public static interface OnTextChanged
	{

		public abstract void onTextChanged(CharSequence charsequence, int i, int j, int k);
	}


	public TextViewBindingAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void Object()>
	//    2    4:return          
	}

	public static String getTextString(TextView textview)
	{
		return textview.getText().toString();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method CharSequence TextView.getText()>
	//    2    4:invokeinterface #79  <Method String CharSequence.toString()>
	//    3    9:areturn         
	}

	private static boolean haveContentsChanged(CharSequence charsequence, CharSequence charsequence1)
	{
		boolean flag;
		if(charsequence == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       9
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:goto            11
			flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		int j;
		if(charsequence1 == null)
	//*   7   11:aload_1         
	//*   8   12:ifnonnull       20
			j = 1;
	//    9   15:iconst_1        
	//   10   16:istore_3        
		else
	//*  11   17:goto            22
			j = 0;
	//   12   20:iconst_0        
	//   13   21:istore_3        
		if(flag != j)
	//*  14   22:iload_2         
	//*  15   23:iload_3         
	//*  16   24:icmpeq          29
			return true;
	//   17   27:iconst_1        
	//   18   28:ireturn         
		if(charsequence == null)
	//*  19   29:aload_0         
	//*  20   30:ifnonnull       35
			return false;
	//   21   33:iconst_0        
	//   22   34:ireturn         
		j = charsequence.length();
	//   23   35:aload_0         
	//   24   36:invokeinterface #86  <Method int CharSequence.length()>
	//   25   41:istore_3        
		if(j != charsequence1.length())
	//*  26   42:iload_3         
	//*  27   43:aload_1         
	//*  28   44:invokeinterface #86  <Method int CharSequence.length()>
	//*  29   49:icmpeq          54
			return true;
	//   30   52:iconst_1        
	//   31   53:ireturn         
		for(int i = 0; i < j; i++)
	//*  32   54:iconst_0        
	//*  33   55:istore_2        
	//*  34   56:iload_2         
	//*  35   57:iload_3         
	//*  36   58:icmpge          87
			if(charsequence.charAt(i) != charsequence1.charAt(i))
	//*  37   61:aload_0         
	//*  38   62:iload_2         
	//*  39   63:invokeinterface #90  <Method char CharSequence.charAt(int)>
	//*  40   68:aload_1         
	//*  41   69:iload_2         
	//*  42   70:invokeinterface #90  <Method char CharSequence.charAt(int)>
	//*  43   75:icmpeq          80
				return true;
	//   44   78:iconst_1        
	//   45   79:ireturn         

	//   46   80:iload_2         
	//   47   81:iconst_1        
	//   48   82:iadd            
	//   49   83:istore_2        
	//*  50   84:goto            56
		return false;
	//   51   87:iconst_0        
	//   52   88:ireturn         
	}

	public static void setAutoText(TextView textview, boolean flag)
	{
		KeyListener keylistener = textview.getKeyListener();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #98  <Method KeyListener TextView.getKeyListener()>
	//    2    4:astore          4
		android.text.method.TextKeyListener.Capitalize capitalize = android.text.method.TextKeyListener.Capitalize.NONE;
	//    3    6:getstatic       #104 <Field android.text.method.TextKeyListener$Capitalize android.text.method.TextKeyListener$Capitalize.NONE>
	//    4    9:astore_3        
		int i;
		if(keylistener != null)
	//*   5   10:aload           4
	//*   6   12:ifnull          26
			i = keylistener.getInputType();
	//    7   15:aload           4
	//    8   17:invokeinterface #109 <Method int KeyListener.getInputType()>
	//    9   22:istore_2        
		else
	//*  10   23:goto            28
			i = 0;
	//   11   26:iconst_0        
	//   12   27:istore_2        
		if((i & 0x1000) != 0)
	//*  13   28:iload_2         
	//*  14   29:sipush          4096
	//*  15   32:iand            
	//*  16   33:ifeq            43
			capitalize = android.text.method.TextKeyListener.Capitalize.CHARACTERS;
	//   17   36:getstatic       #112 <Field android.text.method.TextKeyListener$Capitalize android.text.method.TextKeyListener$Capitalize.CHARACTERS>
	//   18   39:astore_3        
		else
	//*  19   40:goto            70
		if((i & 0x2000) != 0)
	//*  20   43:iload_2         
	//*  21   44:sipush          8192
	//*  22   47:iand            
	//*  23   48:ifeq            58
			capitalize = android.text.method.TextKeyListener.Capitalize.WORDS;
	//   24   51:getstatic       #115 <Field android.text.method.TextKeyListener$Capitalize android.text.method.TextKeyListener$Capitalize.WORDS>
	//   25   54:astore_3        
		else
	//*  26   55:goto            70
		if((i & 0x4000) != 0)
	//*  27   58:iload_2         
	//*  28   59:sipush          16384
	//*  29   62:iand            
	//*  30   63:ifeq            70
			capitalize = android.text.method.TextKeyListener.Capitalize.SENTENCES;
	//   31   66:getstatic       #118 <Field android.text.method.TextKeyListener$Capitalize android.text.method.TextKeyListener$Capitalize.SENTENCES>
	//   32   69:astore_3        
		textview.setKeyListener(((KeyListener) (TextKeyListener.getInstance(flag, capitalize))));
	//   33   70:aload_0         
	//   34   71:iload_1         
	//   35   72:aload_3         
	//   36   73:invokestatic    #124 <Method TextKeyListener TextKeyListener.getInstance(boolean, android.text.method.TextKeyListener$Capitalize)>
	//   37   76:invokevirtual   #128 <Method void TextView.setKeyListener(KeyListener)>
	//   38   79:return          
	}

	public static void setBufferType(TextView textview, android.widget.TextView.BufferType buffertype)
	{
		textview.setText(textview.getText(), buffertype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #73  <Method CharSequence TextView.getText()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #135 <Method void TextView.setText(CharSequence, android.widget.TextView$BufferType)>
	//    5    9:return          
	}

	public static void setCapitalize(TextView textview, android.text.method.TextKeyListener.Capitalize capitalize)
	{
		boolean flag;
		if((textview.getKeyListener().getInputType() & 0x8000) != 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #98  <Method KeyListener TextView.getKeyListener()>
	//*   2    4:invokeinterface #109 <Method int KeyListener.getInputType()>
	//*   3    9:ldc1            #139 <Int 32768>
	//*   4   11:iand            
	//*   5   12:ifeq            20
			flag = true;
	//    6   15:iconst_1        
	//    7   16:istore_2        
		else
	//*   8   17:goto            22
			flag = false;
	//    9   20:iconst_0        
	//   10   21:istore_2        
		textview.setKeyListener(((KeyListener) (TextKeyListener.getInstance(flag, capitalize))));
	//   11   22:aload_0         
	//   12   23:iload_2         
	//   13   24:aload_1         
	//   14   25:invokestatic    #124 <Method TextKeyListener TextKeyListener.getInstance(boolean, android.text.method.TextKeyListener$Capitalize)>
	//   15   28:invokevirtual   #128 <Method void TextView.setKeyListener(KeyListener)>
	//   16   31:return          
	}

	public static void setDigits(TextView textview, CharSequence charsequence)
	{
		if(charsequence != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
		{
			textview.setKeyListener(((KeyListener) (DigitsKeyListener.getInstance(charsequence.toString()))));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokeinterface #79  <Method String CharSequence.toString()>
	//    5   11:invokestatic    #147 <Method DigitsKeyListener DigitsKeyListener.getInstance(String)>
	//    6   14:invokevirtual   #128 <Method void TextView.setKeyListener(KeyListener)>
			return;
	//    7   17:return          
		}
		if(textview.getKeyListener() instanceof DigitsKeyListener)
	//*   8   18:aload_0         
	//*   9   19:invokevirtual   #98  <Method KeyListener TextView.getKeyListener()>
	//*  10   22:instanceof      #144 <Class DigitsKeyListener>
	//*  11   25:ifeq            33
			textview.setKeyListener(((KeyListener) (null)));
	//   12   28:aload_0         
	//   13   29:aconst_null     
	//   14   30:invokevirtual   #128 <Method void TextView.setKeyListener(KeyListener)>
	//   15   33:return          
	}

	public static void setDrawableBottom(TextView textview, Drawable drawable)
	{
		setIntrinsicBounds(drawable);
	//    0    0:aload_1         
	//    1    1:invokestatic    #154 <Method void setIntrinsicBounds(Drawable)>
		Drawable adrawable[] = textview.getCompoundDrawables();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #158 <Method Drawable[] TextView.getCompoundDrawables()>
	//    4    8:astore_2        
		textview.setCompoundDrawables(adrawable[0], adrawable[1], adrawable[2], drawable);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:iconst_0        
	//    8   12:aaload          
	//    9   13:aload_2         
	//   10   14:iconst_1        
	//   11   15:aaload          
	//   12   16:aload_2         
	//   13   17:iconst_2        
	//   14   18:aaload          
	//   15   19:aload_1         
	//   16   20:invokevirtual   #162 <Method void TextView.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
	//   17   23:return          
	}

	public static void setDrawableEnd(TextView textview, Drawable drawable)
	{
		if(android.os.Build.VERSION.SDK_INT < 17)
	//*   0    0:getstatic       #169 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmpge          14
		{
			setDrawableRight(textview, drawable);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokestatic    #172 <Method void setDrawableRight(TextView, Drawable)>
			return;
	//    6   13:return          
		} else
		{
			setIntrinsicBounds(drawable);
	//    7   14:aload_1         
	//    8   15:invokestatic    #154 <Method void setIntrinsicBounds(Drawable)>
			Drawable adrawable[] = textview.getCompoundDrawablesRelative();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #175 <Method Drawable[] TextView.getCompoundDrawablesRelative()>
	//   11   22:astore_2        
			textview.setCompoundDrawablesRelative(adrawable[0], adrawable[1], drawable, adrawable[3]);
	//   12   23:aload_0         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:aaload          
	//   16   27:aload_2         
	//   17   28:iconst_1        
	//   18   29:aaload          
	//   19   30:aload_1         
	//   20   31:aload_2         
	//   21   32:iconst_3        
	//   22   33:aaload          
	//   23   34:invokevirtual   #178 <Method void TextView.setCompoundDrawablesRelative(Drawable, Drawable, Drawable, Drawable)>
			return;
	//   24   37:return          
		}
	}

	public static void setDrawableLeft(TextView textview, Drawable drawable)
	{
		setIntrinsicBounds(drawable);
	//    0    0:aload_1         
	//    1    1:invokestatic    #154 <Method void setIntrinsicBounds(Drawable)>
		Drawable adrawable[] = textview.getCompoundDrawables();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #158 <Method Drawable[] TextView.getCompoundDrawables()>
	//    4    8:astore_2        
		textview.setCompoundDrawables(drawable, adrawable[1], adrawable[2], adrawable[3]);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:iconst_1        
	//    9   13:aaload          
	//   10   14:aload_2         
	//   11   15:iconst_2        
	//   12   16:aaload          
	//   13   17:aload_2         
	//   14   18:iconst_3        
	//   15   19:aaload          
	//   16   20:invokevirtual   #162 <Method void TextView.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
	//   17   23:return          
	}

	public static void setDrawableRight(TextView textview, Drawable drawable)
	{
		setIntrinsicBounds(drawable);
	//    0    0:aload_1         
	//    1    1:invokestatic    #154 <Method void setIntrinsicBounds(Drawable)>
		Drawable adrawable[] = textview.getCompoundDrawables();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #158 <Method Drawable[] TextView.getCompoundDrawables()>
	//    4    8:astore_2        
		textview.setCompoundDrawables(adrawable[0], adrawable[1], drawable, adrawable[3]);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:iconst_0        
	//    8   12:aaload          
	//    9   13:aload_2         
	//   10   14:iconst_1        
	//   11   15:aaload          
	//   12   16:aload_1         
	//   13   17:aload_2         
	//   14   18:iconst_3        
	//   15   19:aaload          
	//   16   20:invokevirtual   #162 <Method void TextView.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
	//   17   23:return          
	}

	public static void setDrawableStart(TextView textview, Drawable drawable)
	{
		if(android.os.Build.VERSION.SDK_INT < 17)
	//*   0    0:getstatic       #169 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmpge          14
		{
			setDrawableLeft(textview, drawable);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokestatic    #185 <Method void setDrawableLeft(TextView, Drawable)>
			return;
	//    6   13:return          
		} else
		{
			setIntrinsicBounds(drawable);
	//    7   14:aload_1         
	//    8   15:invokestatic    #154 <Method void setIntrinsicBounds(Drawable)>
			Drawable adrawable[] = textview.getCompoundDrawablesRelative();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #175 <Method Drawable[] TextView.getCompoundDrawablesRelative()>
	//   11   22:astore_2        
			textview.setCompoundDrawablesRelative(drawable, adrawable[1], adrawable[2], adrawable[3]);
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:aload_2         
	//   15   26:iconst_1        
	//   16   27:aaload          
	//   17   28:aload_2         
	//   18   29:iconst_2        
	//   19   30:aaload          
	//   20   31:aload_2         
	//   21   32:iconst_3        
	//   22   33:aaload          
	//   23   34:invokevirtual   #178 <Method void TextView.setCompoundDrawablesRelative(Drawable, Drawable, Drawable, Drawable)>
			return;
	//   24   37:return          
		}
	}

	public static void setDrawableTop(TextView textview, Drawable drawable)
	{
		setIntrinsicBounds(drawable);
	//    0    0:aload_1         
	//    1    1:invokestatic    #154 <Method void setIntrinsicBounds(Drawable)>
		Drawable adrawable[] = textview.getCompoundDrawables();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #158 <Method Drawable[] TextView.getCompoundDrawables()>
	//    4    8:astore_2        
		textview.setCompoundDrawables(adrawable[0], drawable, adrawable[2], adrawable[3]);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:iconst_0        
	//    8   12:aaload          
	//    9   13:aload_1         
	//   10   14:aload_2         
	//   11   15:iconst_2        
	//   12   16:aaload          
	//   13   17:aload_2         
	//   14   18:iconst_3        
	//   15   19:aaload          
	//   16   20:invokevirtual   #162 <Method void TextView.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
	//   17   23:return          
	}

	public static void setImeActionLabel(TextView textview, int i)
	{
		textview.setImeActionLabel(textview.getImeActionLabel(), i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #193 <Method CharSequence TextView.getImeActionLabel()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #196 <Method void TextView.setImeActionLabel(CharSequence, int)>
	//    5    9:return          
	}

	public static void setImeActionLabel(TextView textview, CharSequence charsequence)
	{
		textview.setImeActionLabel(charsequence, textview.getImeActionId());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #200 <Method int TextView.getImeActionId()>
	//    4    6:invokevirtual   #196 <Method void TextView.setImeActionLabel(CharSequence, int)>
	//    5    9:return          
	}

	public static void setInputMethod(TextView textview, CharSequence charsequence)
	{
		StringBuilder stringbuilder2;
		try
		{
			textview.setKeyListener((KeyListener)Class.forName(charsequence.toString()).newInstance());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #79  <Method String CharSequence.toString()>
	//    3    7:invokestatic    #214 <Method Class Class.forName(String)>
	//    4   10:invokevirtual   #218 <Method Object Class.newInstance()>
	//    5   13:checkcast       #106 <Class KeyListener>
	//    6   16:invokevirtual   #128 <Method void TextView.setKeyListener(KeyListener)>
			return;
	//    7   19:return          
		}
	//*   8   20:astore_0        
	//*   9   21:new             #220 <Class StringBuilder>
	//*  10   24:dup             
	//*  11   25:invokespecial   #221 <Method void StringBuilder()>
	//*  12   28:astore_2        
	//*  13   29:aload_2         
	//*  14   30:ldc1            #223 <String "Could not create input method: ">
	//*  15   32:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//*  16   35:pop             
	//*  17   36:aload_2         
	//*  18   37:aload_1         
	//*  19   38:invokevirtual   #230 <Method StringBuilder StringBuilder.append(Object)>
	//*  20   41:pop             
	//*  21   42:ldc1            #56  <String "TextViewBindingAdapters">
	//*  22   44:aload_2         
	//*  23   45:invokevirtual   #231 <Method String StringBuilder.toString()>
	//*  24   48:aload_0         
	//*  25   49:invokestatic    #237 <Method int Log.e(String, String, Throwable)>
	//*  26   52:pop             
	//*  27   53:return          
	//*  28   54:astore_0        
	//*  29   55:new             #220 <Class StringBuilder>
	//*  30   58:dup             
	//*  31   59:invokespecial   #221 <Method void StringBuilder()>
	//*  32   62:astore_2        
	//*  33   63:aload_2         
	//*  34   64:ldc1            #223 <String "Could not create input method: ">
	//*  35   66:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//*  36   69:pop             
	//*  37   70:aload_2         
	//*  38   71:aload_1         
	//*  39   72:invokevirtual   #230 <Method StringBuilder StringBuilder.append(Object)>
	//*  40   75:pop             
	//*  41   76:ldc1            #56  <String "TextViewBindingAdapters">
	//*  42   78:aload_2         
	//*  43   79:invokevirtual   #231 <Method String StringBuilder.toString()>
	//*  44   82:aload_0         
	//*  45   83:invokestatic    #237 <Method int Log.e(String, String, Throwable)>
	//*  46   86:pop             
	//*  47   87:return          
		// Misplaced declaration of an exception variable
		catch(TextView textview)
	//*  48   88:astore_0        
		{
			stringbuilder2 = new StringBuilder();
	//   49   89:new             #220 <Class StringBuilder>
	//   50   92:dup             
	//   51   93:invokespecial   #221 <Method void StringBuilder()>
	//   52   96:astore_2        
		}
		// Misplaced declaration of an exception variable
		catch(TextView textview)
		{
			StringBuilder stringbuilder1 = new StringBuilder();
			stringbuilder1.append("Could not create input method: ");
			stringbuilder1.append(((Object) (charsequence)));
			Log.e("TextViewBindingAdapters", stringbuilder1.toString(), ((Throwable) (textview)));
			return;
		}
		// Misplaced declaration of an exception variable
		catch(TextView textview)
		{
			StringBuilder stringbuilder = new StringBuilder();
			stringbuilder.append("Could not create input method: ");
			stringbuilder.append(((Object) (charsequence)));
			Log.e("TextViewBindingAdapters", stringbuilder.toString(), ((Throwable) (textview)));
			return;
		}
		stringbuilder2.append("Could not create input method: ");
	//   53   97:aload_2         
	//   54   98:ldc1            #223 <String "Could not create input method: ">
	//   55  100:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   56  103:pop             
		stringbuilder2.append(((Object) (charsequence)));
	//   57  104:aload_2         
	//   58  105:aload_1         
	//   59  106:invokevirtual   #230 <Method StringBuilder StringBuilder.append(Object)>
	//   60  109:pop             
		Log.e("TextViewBindingAdapters", stringbuilder2.toString(), ((Throwable) (textview)));
	//   61  110:ldc1            #56  <String "TextViewBindingAdapters">
	//   62  112:aload_2         
	//   63  113:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   64  116:aload_0         
	//   65  117:invokestatic    #237 <Method int Log.e(String, String, Throwable)>
	//   66  120:pop             
	//   67  121:return          
	}

	private static void setIntrinsicBounds(Drawable drawable)
	{
		if(drawable != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          18
			drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #242 <Method int Drawable.getIntrinsicWidth()>
	//    7   11:aload_0         
	//    8   12:invokevirtual   #245 <Method int Drawable.getIntrinsicHeight()>
	//    9   15:invokevirtual   #249 <Method void Drawable.setBounds(int, int, int, int)>
	//   10   18:return          
	}

	public static void setLineSpacingExtra(TextView textview, float f)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #169 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          18
		{
			textview.setLineSpacing(f, textview.getLineSpacingMultiplier());
	//    3    8:aload_0         
	//    4    9:fload_1         
	//    5   10:aload_0         
	//    6   11:invokevirtual   #256 <Method float TextView.getLineSpacingMultiplier()>
	//    7   14:invokevirtual   #260 <Method void TextView.setLineSpacing(float, float)>
			return;
	//    8   17:return          
		} else
		{
			textview.setLineSpacing(f, 1.0F);
	//    9   18:aload_0         
	//   10   19:fload_1         
	//   11   20:fconst_1        
	//   12   21:invokevirtual   #260 <Method void TextView.setLineSpacing(float, float)>
			return;
	//   13   24:return          
		}
	}

	public static void setLineSpacingMultiplier(TextView textview, float f)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #169 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          18
		{
			textview.setLineSpacing(textview.getLineSpacingExtra(), f);
	//    3    8:aload_0         
	//    4    9:aload_0         
	//    5   10:invokevirtual   #265 <Method float TextView.getLineSpacingExtra()>
	//    6   13:fload_1         
	//    7   14:invokevirtual   #260 <Method void TextView.setLineSpacing(float, float)>
			return;
	//    8   17:return          
		} else
		{
			textview.setLineSpacing(0.0F, f);
	//    9   18:aload_0         
	//   10   19:fconst_0        
	//   11   20:fload_1         
	//   12   21:invokevirtual   #260 <Method void TextView.setLineSpacing(float, float)>
			return;
	//   13   24:return          
		}
	}

	public static void setMaxLength(TextView textview, int i)
	{
		InputFilter ainputfilter[];
label0:
		{
			boolean flag;
			InputFilter ainputfilter1[];
label1:
			{
				ainputfilter1 = textview.getFilters();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #271 <Method InputFilter[] TextView.getFilters()>
	//    2    4:astore          5
				if(ainputfilter1 == null)
	//*   3    6:aload           5
	//*   4    8:ifnonnull       32
				{
					ainputfilter = new InputFilter[1];
	//    5   11:iconst_1        
	//    6   12:anewarray       InputFilter[]
	//    7   15:astore          4
					ainputfilter[0] = ((InputFilter) (new android.text.InputFilter.LengthFilter(i)));
	//    8   17:aload           4
	//    9   19:iconst_0        
	//   10   20:new             #275 <Class android.text.InputFilter$LengthFilter>
	//   11   23:dup             
	//   12   24:iload_1         
	//   13   25:invokespecial   #278 <Method void android.text.InputFilter$LengthFilter(int)>
	//   14   28:aastore         
					break label0;
	//   15   29:goto            163
				}
				int j = 0;
	//   16   32:iconst_0        
	//   17   33:istore_3        
				do
				{
					if(j >= ainputfilter1.length)
						break;
	//   18   34:iload_3         
	//   19   35:aload           5
	//   20   37:arraylength     
	//   21   38:icmpge          115
					ainputfilter = ((InputFilter []) (ainputfilter1[j]));
	//   22   41:aload           5
	//   23   43:iload_3         
	//   24   44:aaload          
	//   25   45:astore          4
					if(ainputfilter instanceof android.text.InputFilter.LengthFilter)
	//*  26   47:aload           4
	//*  27   49:instanceof      #275 <Class android.text.InputFilter$LengthFilter>
	//*  28   52:ifeq            108
					{
						if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  29   55:getstatic       #169 <Field int android.os.Build$VERSION.SDK_INT>
	//*  30   58:bipush          21
	//*  31   60:icmplt          85
						{
							if(((android.text.InputFilter.LengthFilter)ainputfilter).getMax() != i)
	//*  32   63:aload           4
	//*  33   65:checkcast       #275 <Class android.text.InputFilter$LengthFilter>
	//*  34   68:invokevirtual   #281 <Method int android.text.InputFilter$LengthFilter.getMax()>
	//*  35   71:iload_1         
	//*  36   72:icmpeq          80
								flag = true;
	//   37   75:iconst_1        
	//   38   76:istore_2        
							else
	//*  39   77:goto            87
								flag = false;
	//   40   80:iconst_0        
	//   41   81:istore_2        
						} else
	//*  42   82:goto            87
						{
							flag = true;
	//   43   85:iconst_1        
	//   44   86:istore_2        
						}
						if(flag)
	//*  45   87:iload_2         
	//*  46   88:ifeq            103
							ainputfilter1[j] = ((InputFilter) (new android.text.InputFilter.LengthFilter(i)));
	//   47   91:aload           5
	//   48   93:iload_3         
	//   49   94:new             #275 <Class android.text.InputFilter$LengthFilter>
	//   50   97:dup             
	//   51   98:iload_1         
	//   52   99:invokespecial   #278 <Method void android.text.InputFilter$LengthFilter(int)>
	//   53  102:aastore         
						flag = true;
	//   54  103:iconst_1        
	//   55  104:istore_2        
						break label1;
	//   56  105:goto            117
					}
					j++;
	//   57  108:iload_3         
	//   58  109:iconst_1        
	//   59  110:iadd            
	//   60  111:istore_3        
				} while(true);
	//   61  112:goto            34
				flag = false;
	//   62  115:iconst_0        
	//   63  116:istore_2        
			}
			ainputfilter = ainputfilter1;
	//   64  117:aload           5
	//   65  119:astore          4
			if(!flag)
	//*  66  121:iload_2         
	//*  67  122:ifne            163
			{
				ainputfilter = new InputFilter[ainputfilter1.length + 1];
	//   68  125:aload           5
	//   69  127:arraylength     
	//   70  128:iconst_1        
	//   71  129:iadd            
	//   72  130:anewarray       InputFilter[]
	//   73  133:astore          4
				System.arraycopy(((Object) (ainputfilter1)), 0, ((Object) (ainputfilter)), 0, ainputfilter1.length);
	//   74  135:aload           5
	//   75  137:iconst_0        
	//   76  138:aload           4
	//   77  140:iconst_0        
	//   78  141:aload           5
	//   79  143:arraylength     
	//   80  144:invokestatic    #287 <Method void System.arraycopy(Object, int, Object, int, int)>
				ainputfilter[ainputfilter.length - 1] = ((/*<invalid signature>*/java.lang.Object) (new android.text.InputFilter.LengthFilter(i)));
	//   81  147:aload           4
	//   82  149:aload           4
	//   83  151:arraylength     
	//   84  152:iconst_1        
	//   85  153:isub            
	//   86  154:new             #275 <Class android.text.InputFilter$LengthFilter>
	//   87  157:dup             
	//   88  158:iload_1         
	//   89  159:invokespecial   #278 <Method void android.text.InputFilter$LengthFilter(int)>
	//   90  162:aastore         
			}
		}
		textview.setFilters(ainputfilter);
	//   91  163:aload_0         
	//   92  164:aload           4
	//   93  166:invokevirtual   #291 <Method void TextView.setFilters(InputFilter[])>
	//   94  169:return          
	}

	public static void setNumeric(TextView textview, int i)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		boolean flag;
		if((i & 3) != 0)
	//*   2    2:iload_1         
	//*   3    3:iconst_3        
	//*   4    4:iand            
	//*   5    5:ifeq            13
			flag = true;
	//    6    8:iconst_1        
	//    7    9:istore_2        
		else
	//*   8   10:goto            15
			flag = false;
	//    9   13:iconst_0        
	//   10   14:istore_2        
		if((i & 5) == 0)
	//*  11   15:iload_1         
	//*  12   16:iconst_5        
	//*  13   17:iand            
	//*  14   18:ifeq            24
	//*  15   21:goto            26
			flag1 = false;
	//   16   24:iconst_0        
	//   17   25:istore_3        
		textview.setKeyListener(((KeyListener) (DigitsKeyListener.getInstance(flag, flag1))));
	//   18   26:aload_0         
	//   19   27:iload_2         
	//   20   28:iload_3         
	//   21   29:invokestatic    #296 <Method DigitsKeyListener DigitsKeyListener.getInstance(boolean, boolean)>
	//   22   32:invokevirtual   #128 <Method void TextView.setKeyListener(KeyListener)>
	//   23   35:return          
	}

	public static void setPassword(TextView textview, boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            12
		{
			textview.setTransformationMethod(((android.text.method.TransformationMethod) (PasswordTransformationMethod.getInstance())));
	//    2    4:aload_0         
	//    3    5:invokestatic    #303 <Method PasswordTransformationMethod PasswordTransformationMethod.getInstance()>
	//    4    8:invokevirtual   #307 <Method void TextView.setTransformationMethod(android.text.method.TransformationMethod)>
			return;
	//    5   11:return          
		}
		if(textview.getTransformationMethod() instanceof PasswordTransformationMethod)
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #311 <Method android.text.method.TransformationMethod TextView.getTransformationMethod()>
	//*   8   16:instanceof      #300 <Class PasswordTransformationMethod>
	//*   9   19:ifeq            27
			textview.setTransformationMethod(((android.text.method.TransformationMethod) (null)));
	//   10   22:aload_0         
	//   11   23:aconst_null     
	//   12   24:invokevirtual   #307 <Method void TextView.setTransformationMethod(android.text.method.TransformationMethod)>
	//   13   27:return          
	}

	public static void setPhoneNumber(TextView textview, boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            12
		{
			textview.setKeyListener(((KeyListener) (DialerKeyListener.getInstance())));
	//    2    4:aload_0         
	//    3    5:invokestatic    #318 <Method DialerKeyListener DialerKeyListener.getInstance()>
	//    4    8:invokevirtual   #128 <Method void TextView.setKeyListener(KeyListener)>
			return;
	//    5   11:return          
		}
		if(textview.getKeyListener() instanceof DialerKeyListener)
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #98  <Method KeyListener TextView.getKeyListener()>
	//*   8   16:instanceof      #315 <Class DialerKeyListener>
	//*   9   19:ifeq            27
			textview.setKeyListener(((KeyListener) (null)));
	//   10   22:aload_0         
	//   11   23:aconst_null     
	//   12   24:invokevirtual   #128 <Method void TextView.setKeyListener(KeyListener)>
	//   13   27:return          
	}

	public static void setShadowColor(TextView textview, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #169 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          29
		{
			float f = textview.getShadowDx();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #323 <Method float TextView.getShadowDx()>
	//    5   12:fstore_2        
			float f1 = textview.getShadowDy();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #326 <Method float TextView.getShadowDy()>
	//    8   17:fstore_3        
			textview.setShadowLayer(textview.getShadowRadius(), f, f1, i);
	//    9   18:aload_0         
	//   10   19:aload_0         
	//   11   20:invokevirtual   #329 <Method float TextView.getShadowRadius()>
	//   12   23:fload_2         
	//   13   24:fload_3         
	//   14   25:iload_1         
	//   15   26:invokevirtual   #333 <Method void TextView.setShadowLayer(float, float, float, int)>
		}
	//   16   29:return          
	}

	public static void setShadowDx(TextView textview, float f)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #169 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          29
		{
			int i = textview.getShadowColor();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #338 <Method int TextView.getShadowColor()>
	//    5   12:istore_3        
			float f1 = textview.getShadowDy();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #326 <Method float TextView.getShadowDy()>
	//    8   17:fstore_2        
			textview.setShadowLayer(textview.getShadowRadius(), f, f1, i);
	//    9   18:aload_0         
	//   10   19:aload_0         
	//   11   20:invokevirtual   #329 <Method float TextView.getShadowRadius()>
	//   12   23:fload_1         
	//   13   24:fload_2         
	//   14   25:iload_3         
	//   15   26:invokevirtual   #333 <Method void TextView.setShadowLayer(float, float, float, int)>
		}
	//   16   29:return          
	}

	public static void setShadowDy(TextView textview, float f)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #169 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          29
		{
			int i = textview.getShadowColor();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #338 <Method int TextView.getShadowColor()>
	//    5   12:istore_3        
			float f1 = textview.getShadowDx();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #323 <Method float TextView.getShadowDx()>
	//    8   17:fstore_2        
			textview.setShadowLayer(textview.getShadowRadius(), f1, f, i);
	//    9   18:aload_0         
	//   10   19:aload_0         
	//   11   20:invokevirtual   #329 <Method float TextView.getShadowRadius()>
	//   12   23:fload_2         
	//   13   24:fload_1         
	//   14   25:iload_3         
	//   15   26:invokevirtual   #333 <Method void TextView.setShadowLayer(float, float, float, int)>
		}
	//   16   29:return          
	}

	public static void setShadowRadius(TextView textview, float f)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #169 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          27
		{
			int i = textview.getShadowColor();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #338 <Method int TextView.getShadowColor()>
	//    5   12:istore_2        
			textview.setShadowLayer(f, textview.getShadowDx(), textview.getShadowDy(), i);
	//    6   13:aload_0         
	//    7   14:fload_1         
	//    8   15:aload_0         
	//    9   16:invokevirtual   #323 <Method float TextView.getShadowDx()>
	//   10   19:aload_0         
	//   11   20:invokevirtual   #326 <Method float TextView.getShadowDy()>
	//   12   23:iload_2         
	//   13   24:invokevirtual   #333 <Method void TextView.setShadowLayer(float, float, float, int)>
		}
	//   14   27:return          
	}

	public static void setText(TextView textview, CharSequence charsequence)
	{
		CharSequence charsequence1 = textview.getText();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method CharSequence TextView.getText()>
	//    2    4:astore_2        
		if(charsequence != charsequence1)
	//*   3    5:aload_1         
	//*   4    6:aload_2         
	//*   5    7:if_acmpeq       55
		{
			if(charsequence == null && charsequence1.length() == 0)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       24
	//*   8   14:aload_2         
	//*   9   15:invokeinterface #86  <Method int CharSequence.length()>
	//*  10   20:ifne            24
				return;
	//   11   23:return          
			if(charsequence instanceof Spanned)
	//*  12   24:aload_1         
	//*  13   25:instanceof      #344 <Class Spanned>
	//*  14   28:ifeq            40
			{
				if(((Object) (charsequence)).equals(((Object) (charsequence1))))
	//*  15   31:aload_1         
	//*  16   32:aload_2         
	//*  17   33:invokevirtual   #348 <Method boolean Object.equals(Object)>
	//*  18   36:ifeq            49
					return;
	//   19   39:return          
			} else
			if(!haveContentsChanged(charsequence, charsequence1))
	//*  20   40:aload_1         
	//*  21   41:aload_2         
	//*  22   42:invokestatic    #350 <Method boolean haveContentsChanged(CharSequence, CharSequence)>
	//*  23   45:ifne            49
				return;
	//   24   48:return          
			textview.setText(charsequence);
	//   25   49:aload_0         
	//   26   50:aload_1         
	//   27   51:invokevirtual   #353 <Method void TextView.setText(CharSequence)>
			return;
	//   28   54:return          
		} else
		{
			return;
	//   29   55:return          
		}
	}

	public static void setTextSize(TextView textview, float f)
	{
		textview.setTextSize(0, f);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:fload_1         
	//    3    3:invokevirtual   #358 <Method void TextView.setTextSize(int, float)>
	//    4    6:return          
	}

	public static void setTextWatcher(TextView textview, BeforeTextChanged beforetextchanged, OnTextChanged ontextchanged, AfterTextChanged aftertextchanged, InverseBindingListener inversebindinglistener)
	{
		if(beforetextchanged == null && aftertextchanged == null && ontextchanged == null && inversebindinglistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       22
	//*   2    4:aload_3         
	//*   3    5:ifnonnull       22
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       22
	//*   6   12:aload           4
	//*   7   14:ifnonnull       22
			beforetextchanged = null;
	//    8   17:aconst_null     
	//    9   18:astore_1        
		else
	//*  10   19:goto            35
			beforetextchanged = ((BeforeTextChanged) (new TextWatcher(beforetextchanged, ontextchanged, inversebindinglistener, aftertextchanged) {

				public void afterTextChanged(Editable editable)
				{
					AfterTextChanged aftertextchanged1 = after;
				//    0    0:aload_0         
				//    1    1:getfield        #29  <Field TextViewBindingAdapter$AfterTextChanged val$after>
				//    2    4:astore_2        
					if(aftertextchanged1 != null)
				//*   3    5:aload_2         
				//*   4    6:ifnull          16
						aftertextchanged1.afterTextChanged(editable);
				//    5    9:aload_2         
				//    6   10:aload_1         
				//    7   11:invokeinterface #39  <Method void TextViewBindingAdapter$AfterTextChanged.afterTextChanged(Editable)>
				//    8   16:return          
				}

				public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
				{
					BeforeTextChanged beforetextchanged1 = before;
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field TextViewBindingAdapter$BeforeTextChanged val$before>
				//    2    4:astore          5
					if(beforetextchanged1 != null)
				//*   3    6:aload           5
				//*   4    8:ifnull          23
						beforetextchanged1.beforeTextChanged(charsequence, i, j, k);
				//    5   11:aload           5
				//    6   13:aload_1         
				//    7   14:iload_2         
				//    8   15:iload_3         
				//    9   16:iload           4
				//   10   18:invokeinterface #45  <Method void TextViewBindingAdapter$BeforeTextChanged.beforeTextChanged(CharSequence, int, int, int)>
				//   11   23:return          
				}

				public void onTextChanged(CharSequence charsequence, int i, int j, int k)
				{
					OnTextChanged ontextchanged1 = on;
				//    0    0:aload_0         
				//    1    1:getfield        #25  <Field TextViewBindingAdapter$OnTextChanged val$on>
				//    2    4:astore          5
					if(ontextchanged1 != null)
				//*   3    6:aload           5
				//*   4    8:ifnull          23
						ontextchanged1.onTextChanged(charsequence, i, j, k);
				//    5   11:aload           5
				//    6   13:aload_1         
				//    7   14:iload_2         
				//    8   15:iload_3         
				//    9   16:iload           4
				//   10   18:invokeinterface #50  <Method void TextViewBindingAdapter$OnTextChanged.onTextChanged(CharSequence, int, int, int)>
					charsequence = ((CharSequence) (textAttrChanged));
				//   11   23:aload_0         
				//   12   24:getfield        #27  <Field InverseBindingListener val$textAttrChanged>
				//   13   27:astore_1        
					if(charsequence != null)
				//*  14   28:aload_1         
				//*  15   29:ifnull          38
						((InverseBindingListener) (charsequence)).onChange();
				//   16   32:aload_1         
				//   17   33:invokeinterface #55  <Method void InverseBindingListener.onChange()>
				//   18   38:return          
				}

				final AfterTextChanged val$after;
				final BeforeTextChanged val$before;
				final OnTextChanged val$on;
				final InverseBindingListener val$textAttrChanged;

			
			{
				before = beforetextchanged;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field TextViewBindingAdapter$BeforeTextChanged val$before>
				on = ontextchanged;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field TextViewBindingAdapter$OnTextChanged val$on>
				textAttrChanged = inversebindinglistener;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field InverseBindingListener val$textAttrChanged>
				after = aftertextchanged;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field TextViewBindingAdapter$AfterTextChanged val$after>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
			}
));
	//   11   22:new             #6   <Class TextViewBindingAdapter$1>
	//   12   25:dup             
	//   13   26:aload_1         
	//   14   27:aload_2         
	//   15   28:aload           4
	//   16   30:aload_3         
	//   17   31:invokespecial   #368 <Method void TextViewBindingAdapter$1(TextViewBindingAdapter$BeforeTextChanged, TextViewBindingAdapter$OnTextChanged, InverseBindingListener, TextViewBindingAdapter$AfterTextChanged)>
	//   18   34:astore_1        
		ontextchanged = ((OnTextChanged) ((TextWatcher)ListenerUtil.trackListener(((android.view.View) (textview)), ((Object) (beforetextchanged)), com.android.databinding.library.baseAdapters.R.id.textWatcher)));
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:getstatic       #373 <Field int com.android.databinding.library.baseAdapters.R$id.textWatcher>
	//   22   40:invokestatic    #379 <Method Object ListenerUtil.trackListener(android.view.View, Object, int)>
	//   23   43:checkcast       #381 <Class TextWatcher>
	//   24   46:astore_2        
		if(ontextchanged != null)
	//*  25   47:aload_2         
	//*  26   48:ifnull          56
			textview.removeTextChangedListener(((TextWatcher) (ontextchanged)));
	//   27   51:aload_0         
	//   28   52:aload_2         
	//   29   53:invokevirtual   #385 <Method void TextView.removeTextChangedListener(TextWatcher)>
		if(beforetextchanged != null)
	//*  30   56:aload_1         
	//*  31   57:ifnull          65
			textview.addTextChangedListener(((TextWatcher) (beforetextchanged)));
	//   32   60:aload_0         
	//   33   61:aload_1         
	//   34   62:invokevirtual   #388 <Method void TextView.addTextChangedListener(TextWatcher)>
	//   35   65:return          
	}

	public static final int DECIMAL = 5;
	public static final int INTEGER = 1;
	public static final int SIGNED = 3;
	private static final String TAG = "TextViewBindingAdapters";
}
