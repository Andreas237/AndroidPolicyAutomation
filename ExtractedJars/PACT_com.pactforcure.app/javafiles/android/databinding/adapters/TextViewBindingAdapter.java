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
	//    1    1:invokespecial   #57  <Method void Object()>
	//    2    4:return          
	}

	public static String getTextString(TextView textview)
	{
		return textview.getText().toString();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method CharSequence TextView.getText()>
	//    2    4:invokeinterface #76  <Method String CharSequence.toString()>
	//    3    9:areturn         
	}

	private static boolean haveContentsChanged(CharSequence charsequence, CharSequence charsequence1)
	{
		boolean flag;
		boolean flag1;
		if(charsequence == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       19
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       24
	//*   6   10:iconst_1        
	//*   7   11:istore_3        
	//*   8   12:iload_2         
	//*   9   13:iload_3         
	//*  10   14:icmpeq          29
	//*  11   17:iconst_1        
	//*  12   18:ireturn         
			flag = false;
	//   13   19:iconst_0        
	//   14   20:istore_2        
		if(charsequence1 == null)
			flag1 = true;
		else
	//*  15   21:goto            6
			flag1 = false;
	//   16   24:iconst_0        
	//   17   25:istore_3        
		if(flag == flag1) goto _L2; else goto _L1
_L1:
		return true;
	//*  18   26:goto            12
_L2:
		if(charsequence == null)
	//*  19   29:aload_0         
	//*  20   30:ifnonnull       35
			return false;
	//   21   33:iconst_0        
	//   22   34:ireturn         
		int j = charsequence.length();
	//   23   35:aload_0         
	//   24   36:invokeinterface #83  <Method int CharSequence.length()>
	//   25   41:istore_3        
		if(j == charsequence1.length())
	//*  26   42:iload_3         
	//*  27   43:aload_1         
	//*  28   44:invokeinterface #83  <Method int CharSequence.length()>
	//*  29   49:icmpne          17
		{
			int i = 0;
	//   30   52:iconst_0        
	//   31   53:istore_2        
label0:
			do
			{
label1:
				{
					if(i >= j)
						break label1;
	//   32   54:iload_2         
	//   33   55:iload_3         
	//   34   56:icmpge          83
					if(charsequence.charAt(i) != charsequence1.charAt(i))
						break label0;
	//   35   59:aload_0         
	//   36   60:iload_2         
	//   37   61:invokeinterface #87  <Method char CharSequence.charAt(int)>
	//   38   66:aload_1         
	//   39   67:iload_2         
	//   40   68:invokeinterface #87  <Method char CharSequence.charAt(int)>
	//   41   73:icmpne          17
					i++;
	//   42   76:iload_2         
	//   43   77:iconst_1        
	//   44   78:iadd            
	//   45   79:istore_2        
				}
			} while(true);
	//   46   80:goto            54
		}
		if(true) goto _L1; else goto _L3
_L3:
		return false;
	//   47   83:iconst_0        
	//   48   84:ireturn         
	}

	public static void setAutoText(TextView textview, boolean flag)
	{
		int i;
		android.text.method.TextKeyListener.Capitalize capitalize;
		KeyListener keylistener = textview.getKeyListener();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #95  <Method KeyListener TextView.getKeyListener()>
	//    2    4:astore          4
		capitalize = android.text.method.TextKeyListener.Capitalize.NONE;
	//    3    6:getstatic       #101 <Field android.text.method.TextKeyListener$Capitalize android.text.method.TextKeyListener$Capitalize.NONE>
	//    4    9:astore_3        
		if(keylistener != null)
	//*   5   10:aload           4
	//*   6   12:ifnull          45
			i = keylistener.getInputType();
	//    7   15:aload           4
	//    8   17:invokeinterface #106 <Method int KeyListener.getInputType()>
	//    9   22:istore_2        
		else
	//*  10   23:iload_2         
	//*  11   24:sipush          4096
	//*  12   27:iand            
	//*  13   28:ifeq            50
	//*  14   31:getstatic       #109 <Field android.text.method.TextKeyListener$Capitalize android.text.method.TextKeyListener$Capitalize.CHARACTERS>
	//*  15   34:astore_3        
	//*  16   35:aload_0         
	//*  17   36:iload_1         
	//*  18   37:aload_3         
	//*  19   38:invokestatic    #115 <Method TextKeyListener TextKeyListener.getInstance(boolean, android.text.method.TextKeyListener$Capitalize)>
	//*  20   41:invokevirtual   #119 <Method void TextView.setKeyListener(KeyListener)>
	//*  21   44:return          
			i = 0;
	//   22   45:iconst_0        
	//   23   46:istore_2        
		if((i & 0x1000) == 0) goto _L2; else goto _L1
_L1:
		capitalize = android.text.method.TextKeyListener.Capitalize.CHARACTERS;
_L4:
		textview.setKeyListener(((KeyListener) (TextKeyListener.getInstance(flag, capitalize))));
		return;
	//*  24   47:goto            23
_L2:
		if((i & 0x2000) != 0)
	//*  25   50:iload_2         
	//*  26   51:sipush          8192
	//*  27   54:iand            
	//*  28   55:ifeq            65
			capitalize = android.text.method.TextKeyListener.Capitalize.WORDS;
	//   29   58:getstatic       #122 <Field android.text.method.TextKeyListener$Capitalize android.text.method.TextKeyListener$Capitalize.WORDS>
	//   30   61:astore_3        
		else
	//*  31   62:goto            35
		if((i & 0x4000) != 0)
	//*  32   65:iload_2         
	//*  33   66:sipush          16384
	//*  34   69:iand            
	//*  35   70:ifeq            35
			capitalize = android.text.method.TextKeyListener.Capitalize.SENTENCES;
	//   36   73:getstatic       #125 <Field android.text.method.TextKeyListener$Capitalize android.text.method.TextKeyListener$Capitalize.SENTENCES>
	//   37   76:astore_3        
		if(true) goto _L4; else goto _L3
	//   38   77:goto            35
_L3:
	}

	public static void setBufferType(TextView textview, android.widget.TextView.BufferType buffertype)
	{
		textview.setText(textview.getText(), buffertype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #70  <Method CharSequence TextView.getText()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #132 <Method void TextView.setText(CharSequence, android.widget.TextView$BufferType)>
	//    5    9:return          
	}

	public static void setCapitalize(TextView textview, android.text.method.TextKeyListener.Capitalize capitalize)
	{
		boolean flag;
		if((0x8000 & textview.getKeyListener().getInputType()) != 0)
	//*   0    0:ldc1            #136 <Int 32768>
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #95  <Method KeyListener TextView.getKeyListener()>
	//*   3    6:invokeinterface #106 <Method int KeyListener.getInputType()>
	//*   4   11:iand            
	//*   5   12:ifeq            27
			flag = true;
	//    6   15:iconst_1        
	//    7   16:istore_2        
		else
	//*   8   17:aload_0         
	//*   9   18:iload_2         
	//*  10   19:aload_1         
	//*  11   20:invokestatic    #115 <Method TextKeyListener TextKeyListener.getInstance(boolean, android.text.method.TextKeyListener$Capitalize)>
	//*  12   23:invokevirtual   #119 <Method void TextView.setKeyListener(KeyListener)>
	//*  13   26:return          
			flag = false;
	//   14   27:iconst_0        
	//   15   28:istore_2        
		textview.setKeyListener(((KeyListener) (TextKeyListener.getInstance(flag, capitalize))));
	//*  16   29:goto            17
	}

	public static void setDigits(TextView textview, CharSequence charsequence)
	{
		if(charsequence != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
			textview.setKeyListener(((KeyListener) (DigitsKeyListener.getInstance(charsequence.toString()))));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokeinterface #76  <Method String CharSequence.toString()>
	//    5   11:invokestatic    #144 <Method DigitsKeyListener DigitsKeyListener.getInstance(String)>
	//    6   14:invokevirtual   #119 <Method void TextView.setKeyListener(KeyListener)>
		else
	//*   7   17:return          
		if(textview.getKeyListener() instanceof DigitsKeyListener)
	//*   8   18:aload_0         
	//*   9   19:invokevirtual   #95  <Method KeyListener TextView.getKeyListener()>
	//*  10   22:instanceof      #141 <Class DigitsKeyListener>
	//*  11   25:ifeq            17
		{
			textview.setKeyListener(((KeyListener) (null)));
	//   12   28:aload_0         
	//   13   29:aconst_null     
	//   14   30:invokevirtual   #119 <Method void TextView.setKeyListener(KeyListener)>
			return;
	//   15   33:return          
		}
	}

	public static void setDrawableBottom(TextView textview, Drawable drawable)
	{
		setIntrinsicBounds(drawable);
	//    0    0:aload_1         
	//    1    1:invokestatic    #151 <Method void setIntrinsicBounds(Drawable)>
		Drawable adrawable[] = textview.getCompoundDrawables();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #155 <Method Drawable[] TextView.getCompoundDrawables()>
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
	//   16   20:invokevirtual   #159 <Method void TextView.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
	//   17   23:return          
	}

	public static void setDrawableEnd(TextView textview, Drawable drawable)
	{
		if(android.os.Build.VERSION.SDK_INT < 17)
	//*   0    0:getstatic       #166 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmpge          14
		{
			setDrawableRight(textview, drawable);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokestatic    #169 <Method void setDrawableRight(TextView, Drawable)>
			return;
	//    6   13:return          
		} else
		{
			setIntrinsicBounds(drawable);
	//    7   14:aload_1         
	//    8   15:invokestatic    #151 <Method void setIntrinsicBounds(Drawable)>
			Drawable adrawable[] = textview.getCompoundDrawablesRelative();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #172 <Method Drawable[] TextView.getCompoundDrawablesRelative()>
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
	//   23   34:invokevirtual   #175 <Method void TextView.setCompoundDrawablesRelative(Drawable, Drawable, Drawable, Drawable)>
			return;
	//   24   37:return          
		}
	}

	public static void setDrawableLeft(TextView textview, Drawable drawable)
	{
		setIntrinsicBounds(drawable);
	//    0    0:aload_1         
	//    1    1:invokestatic    #151 <Method void setIntrinsicBounds(Drawable)>
		Drawable adrawable[] = textview.getCompoundDrawables();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #155 <Method Drawable[] TextView.getCompoundDrawables()>
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
	//   16   20:invokevirtual   #159 <Method void TextView.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
	//   17   23:return          
	}

	public static void setDrawableRight(TextView textview, Drawable drawable)
	{
		setIntrinsicBounds(drawable);
	//    0    0:aload_1         
	//    1    1:invokestatic    #151 <Method void setIntrinsicBounds(Drawable)>
		Drawable adrawable[] = textview.getCompoundDrawables();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #155 <Method Drawable[] TextView.getCompoundDrawables()>
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
	//   16   20:invokevirtual   #159 <Method void TextView.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
	//   17   23:return          
	}

	public static void setDrawableStart(TextView textview, Drawable drawable)
	{
		if(android.os.Build.VERSION.SDK_INT < 17)
	//*   0    0:getstatic       #166 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmpge          14
		{
			setDrawableLeft(textview, drawable);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokestatic    #182 <Method void setDrawableLeft(TextView, Drawable)>
			return;
	//    6   13:return          
		} else
		{
			setIntrinsicBounds(drawable);
	//    7   14:aload_1         
	//    8   15:invokestatic    #151 <Method void setIntrinsicBounds(Drawable)>
			Drawable adrawable[] = textview.getCompoundDrawablesRelative();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #172 <Method Drawable[] TextView.getCompoundDrawablesRelative()>
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
	//   23   34:invokevirtual   #175 <Method void TextView.setCompoundDrawablesRelative(Drawable, Drawable, Drawable, Drawable)>
			return;
	//   24   37:return          
		}
	}

	public static void setDrawableTop(TextView textview, Drawable drawable)
	{
		setIntrinsicBounds(drawable);
	//    0    0:aload_1         
	//    1    1:invokestatic    #151 <Method void setIntrinsicBounds(Drawable)>
		Drawable adrawable[] = textview.getCompoundDrawables();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #155 <Method Drawable[] TextView.getCompoundDrawables()>
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
	//   16   20:invokevirtual   #159 <Method void TextView.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
	//   17   23:return          
	}

	public static void setImeActionLabel(TextView textview, int i)
	{
		textview.setImeActionLabel(textview.getImeActionLabel(), i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #190 <Method CharSequence TextView.getImeActionLabel()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #193 <Method void TextView.setImeActionLabel(CharSequence, int)>
	//    5    9:return          
	}

	public static void setImeActionLabel(TextView textview, CharSequence charsequence)
	{
		textview.setImeActionLabel(charsequence, textview.getImeActionId());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #197 <Method int TextView.getImeActionId()>
	//    4    6:invokevirtual   #193 <Method void TextView.setImeActionLabel(CharSequence, int)>
	//    5    9:return          
	}

	public static void setInputMethod(TextView textview, CharSequence charsequence)
	{
		try
		{
			textview.setKeyListener((KeyListener)Class.forName(charsequence.toString()).newInstance());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #76  <Method String CharSequence.toString()>
	//    3    7:invokestatic    #211 <Method Class Class.forName(String)>
	//    4   10:invokevirtual   #215 <Method Object Class.newInstance()>
	//    5   13:checkcast       #103 <Class KeyListener>
	//    6   16:invokevirtual   #119 <Method void TextView.setKeyListener(KeyListener)>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(TextView textview)
	//*   8   20:astore_0        
		{
			Log.e("TextViewBindingAdapters", (new StringBuilder()).append("Could not create input method: ").append(((Object) (charsequence))).toString(), ((Throwable) (textview)));
	//    9   21:ldc1            #53  <String "TextViewBindingAdapters">
	//   10   23:new             #217 <Class StringBuilder>
	//   11   26:dup             
	//   12   27:invokespecial   #218 <Method void StringBuilder()>
	//   13   30:ldc1            #220 <String "Could not create input method: ">
	//   14   32:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:aload_1         
	//   16   36:invokevirtual   #227 <Method StringBuilder StringBuilder.append(Object)>
	//   17   39:invokevirtual   #228 <Method String StringBuilder.toString()>
	//   18   42:aload_0         
	//   19   43:invokestatic    #234 <Method int Log.e(String, String, Throwable)>
	//   20   46:pop             
			return;
	//   21   47:return          
		}
		// Misplaced declaration of an exception variable
		catch(TextView textview)
	//*  22   48:astore_0        
		{
			Log.e("TextViewBindingAdapters", (new StringBuilder()).append("Could not create input method: ").append(((Object) (charsequence))).toString(), ((Throwable) (textview)));
	//   23   49:ldc1            #53  <String "TextViewBindingAdapters">
	//   24   51:new             #217 <Class StringBuilder>
	//   25   54:dup             
	//   26   55:invokespecial   #218 <Method void StringBuilder()>
	//   27   58:ldc1            #220 <String "Could not create input method: ">
	//   28   60:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   29   63:aload_1         
	//   30   64:invokevirtual   #227 <Method StringBuilder StringBuilder.append(Object)>
	//   31   67:invokevirtual   #228 <Method String StringBuilder.toString()>
	//   32   70:aload_0         
	//   33   71:invokestatic    #234 <Method int Log.e(String, String, Throwable)>
	//   34   74:pop             
			return;
	//   35   75:return          
		}
		// Misplaced declaration of an exception variable
		catch(TextView textview)
	//*  36   76:astore_0        
		{
			Log.e("TextViewBindingAdapters", (new StringBuilder()).append("Could not create input method: ").append(((Object) (charsequence))).toString(), ((Throwable) (textview)));
	//   37   77:ldc1            #53  <String "TextViewBindingAdapters">
	//   38   79:new             #217 <Class StringBuilder>
	//   39   82:dup             
	//   40   83:invokespecial   #218 <Method void StringBuilder()>
	//   41   86:ldc1            #220 <String "Could not create input method: ">
	//   42   88:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   43   91:aload_1         
	//   44   92:invokevirtual   #227 <Method StringBuilder StringBuilder.append(Object)>
	//   45   95:invokevirtual   #228 <Method String StringBuilder.toString()>
	//   46   98:aload_0         
	//   47   99:invokestatic    #234 <Method int Log.e(String, String, Throwable)>
	//   48  102:pop             
		}
	//   49  103:return          
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
	//    6    8:invokevirtual   #239 <Method int Drawable.getIntrinsicWidth()>
	//    7   11:aload_0         
	//    8   12:invokevirtual   #242 <Method int Drawable.getIntrinsicHeight()>
	//    9   15:invokevirtual   #246 <Method void Drawable.setBounds(int, int, int, int)>
	//   10   18:return          
	}

	public static void setLineSpacingExtra(TextView textview, float f)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #166 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          18
		{
			textview.setLineSpacing(f, textview.getLineSpacingMultiplier());
	//    3    8:aload_0         
	//    4    9:fload_1         
	//    5   10:aload_0         
	//    6   11:invokevirtual   #253 <Method float TextView.getLineSpacingMultiplier()>
	//    7   14:invokevirtual   #257 <Method void TextView.setLineSpacing(float, float)>
			return;
	//    8   17:return          
		} else
		{
			textview.setLineSpacing(f, 1.0F);
	//    9   18:aload_0         
	//   10   19:fload_1         
	//   11   20:fconst_1        
	//   12   21:invokevirtual   #257 <Method void TextView.setLineSpacing(float, float)>
			return;
	//   13   24:return          
		}
	}

	public static void setLineSpacingMultiplier(TextView textview, float f)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #166 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          18
		{
			textview.setLineSpacing(textview.getLineSpacingExtra(), f);
	//    3    8:aload_0         
	//    4    9:aload_0         
	//    5   10:invokevirtual   #262 <Method float TextView.getLineSpacingExtra()>
	//    6   13:fload_1         
	//    7   14:invokevirtual   #257 <Method void TextView.setLineSpacing(float, float)>
			return;
	//    8   17:return          
		} else
		{
			textview.setLineSpacing(0.0F, f);
	//    9   18:aload_0         
	//   10   19:fconst_0        
	//   11   20:fload_1         
	//   12   21:invokevirtual   #257 <Method void TextView.setLineSpacing(float, float)>
			return;
	//   13   24:return          
		}
	}

	public static void setMaxLength(TextView textview, int i)
	{
		InputFilter ainputfilter[] = textview.getFilters();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #268 <Method InputFilter[] TextView.getFilters()>
	//    2    4:astore          7
		if(ainputfilter != null) goto _L2; else goto _L1
	//    3    6:aload           7
	//    4    8:ifnonnull       36
_L1:
		Object obj;
		obj = ((Object) (new InputFilter[1]));
	//    5   11:iconst_1        
	//    6   12:anewarray       InputFilter[]
	//    7   15:astore          6
		obj[0] = ((InputFilter) (new android.text.InputFilter.LengthFilter(i)));
	//    8   17:aload           6
	//    9   19:iconst_0        
	//   10   20:new             #272 <Class android.text.InputFilter$LengthFilter>
	//   11   23:dup             
	//   12   24:iload_1         
	//   13   25:invokespecial   #275 <Method void android.text.InputFilter$LengthFilter(int)>
	//   14   28:aastore         
_L4:
		textview.setFilters(((InputFilter []) (obj)));
	//   15   29:aload_0         
	//   16   30:aload           6
	//   17   32:invokevirtual   #279 <Method void TextView.setFilters(InputFilter[])>
		return;
	//   18   35:return          
_L2:
		boolean flag = false;
	//   19   36:iconst_0        
	//   20   37:istore_2        
		int j = 0;
	//   21   38:iconst_0        
	//   22   39:istore_3        
		do
		{
label0:
			{
				boolean flag2 = flag;
	//   23   40:iload_2         
	//   24   41:istore          4
				if(j < ainputfilter.length)
	//*  25   43:iload_3         
	//*  26   44:aload           7
	//*  27   46:arraylength     
	//*  28   47:icmpge          115
				{
					obj = ((Object) (ainputfilter[j]));
	//   29   50:aload           7
	//   30   52:iload_3         
	//   31   53:aaload          
	//   32   54:astore          6
					if(!(obj instanceof android.text.InputFilter.LengthFilter))
						break label0;
	//   33   56:aload           6
	//   34   58:instanceof      #272 <Class android.text.InputFilter$LengthFilter>
	//   35   61:ifeq            170
					boolean flag3 = true;
	//   36   64:iconst_1        
	//   37   65:istore          5
					boolean flag1 = true;
	//   38   67:iconst_1        
	//   39   68:istore_2        
					if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  40   69:getstatic       #166 <Field int android.os.Build$VERSION.SDK_INT>
	//*  41   72:bipush          21
	//*  42   74:icmplt          91
						if(((android.text.InputFilter.LengthFilter)obj).getMax() != i)
	//*  43   77:aload           6
	//*  44   79:checkcast       #272 <Class android.text.InputFilter$LengthFilter>
	//*  45   82:invokevirtual   #282 <Method int android.text.InputFilter$LengthFilter.getMax()>
	//*  46   85:iload_1         
	//*  47   86:icmpeq          165
							flag1 = true;
	//   48   89:iconst_1        
	//   49   90:istore_2        
						else
	//*  50   91:iload           5
	//*  51   93:istore          4
	//*  52   95:iload_2         
	//*  53   96:ifeq            115
	//*  54   99:aload           7
	//*  55  101:iload_3         
	//*  56  102:new             #272 <Class android.text.InputFilter$LengthFilter>
	//*  57  105:dup             
	//*  58  106:iload_1         
	//*  59  107:invokespecial   #275 <Method void android.text.InputFilter$LengthFilter(int)>
	//*  60  110:aastore         
	//*  61  111:iload           5
	//*  62  113:istore          4
	//*  63  115:aload           7
	//*  64  117:astore          6
	//*  65  119:iload           4
	//*  66  121:ifne            29
	//*  67  124:aload           7
	//*  68  126:arraylength     
	//*  69  127:iconst_1        
	//*  70  128:iadd            
	//*  71  129:anewarray       InputFilter[]
	//*  72  132:astore          6
	//*  73  134:aload           7
	//*  74  136:iconst_0        
	//*  75  137:aload           6
	//*  76  139:iconst_0        
	//*  77  140:aload           7
	//*  78  142:arraylength     
	//*  79  143:invokestatic    #288 <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  80  146:aload           6
	//*  81  148:aload           6
	//*  82  150:arraylength     
	//*  83  151:iconst_1        
	//*  84  152:isub            
	//*  85  153:new             #272 <Class android.text.InputFilter$LengthFilter>
	//*  86  156:dup             
	//*  87  157:iload_1         
	//*  88  158:invokespecial   #275 <Method void android.text.InputFilter$LengthFilter(int)>
	//*  89  161:aastore         
	//*  90  162:goto            29
							flag1 = false;
	//   91  165:iconst_0        
	//   92  166:istore_2        
					flag2 = flag3;
					if(flag1)
					{
						ainputfilter[j] = ((InputFilter) (new android.text.InputFilter.LengthFilter(i)));
						flag2 = flag3;
					}
				}
				obj = ((Object) (ainputfilter));
				if(!flag2)
				{
					obj = ((Object) (new InputFilter[ainputfilter.length + 1]));
					System.arraycopy(((Object) (ainputfilter)), 0, obj, 0, ainputfilter.length);
					obj[obj.length - 1] = ((/*<invalid signature>*/java.lang.Object) (new android.text.InputFilter.LengthFilter(i)));
				}
			}
			if(true)
				continue;
	//   93  167:goto            91
			j++;
	//   94  170:iload_3         
	//   95  171:iconst_1        
	//   96  172:iadd            
	//   97  173:istore_3        
		} while(true);
	//   98  174:goto            40
		if(true) goto _L4; else goto _L3
_L3:
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
	//*   5    5:ifeq            26
			flag = true;
	//    6    8:iconst_1        
	//    7    9:istore_2        
		else
	//*   8   10:iload_1         
	//*   9   11:iconst_5        
	//*  10   12:iand            
	//*  11   13:ifeq            31
	//*  12   16:aload_0         
	//*  13   17:iload_2         
	//*  14   18:iload_3         
	//*  15   19:invokestatic    #293 <Method DigitsKeyListener DigitsKeyListener.getInstance(boolean, boolean)>
	//*  16   22:invokevirtual   #119 <Method void TextView.setKeyListener(KeyListener)>
	//*  17   25:return          
			flag = false;
	//   18   26:iconst_0        
	//   19   27:istore_2        
		if((i & 5) == 0)
	//*  20   28:goto            10
			flag1 = false;
	//   21   31:iconst_0        
	//   22   32:istore_3        
		textview.setKeyListener(((KeyListener) (DigitsKeyListener.getInstance(flag, flag1))));
	//*  23   33:goto            16
	}

	public static void setPassword(TextView textview, boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            12
			textview.setTransformationMethod(((android.text.method.TransformationMethod) (PasswordTransformationMethod.getInstance())));
	//    2    4:aload_0         
	//    3    5:invokestatic    #300 <Method PasswordTransformationMethod PasswordTransformationMethod.getInstance()>
	//    4    8:invokevirtual   #304 <Method void TextView.setTransformationMethod(android.text.method.TransformationMethod)>
		else
	//*   5   11:return          
		if(textview.getTransformationMethod() instanceof PasswordTransformationMethod)
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #308 <Method android.text.method.TransformationMethod TextView.getTransformationMethod()>
	//*   8   16:instanceof      #297 <Class PasswordTransformationMethod>
	//*   9   19:ifeq            11
		{
			textview.setTransformationMethod(((android.text.method.TransformationMethod) (null)));
	//   10   22:aload_0         
	//   11   23:aconst_null     
	//   12   24:invokevirtual   #304 <Method void TextView.setTransformationMethod(android.text.method.TransformationMethod)>
			return;
	//   13   27:return          
		}
	}

	public static void setPhoneNumber(TextView textview, boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            12
			textview.setKeyListener(((KeyListener) (DialerKeyListener.getInstance())));
	//    2    4:aload_0         
	//    3    5:invokestatic    #315 <Method DialerKeyListener DialerKeyListener.getInstance()>
	//    4    8:invokevirtual   #119 <Method void TextView.setKeyListener(KeyListener)>
		else
	//*   5   11:return          
		if(textview.getKeyListener() instanceof DialerKeyListener)
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #95  <Method KeyListener TextView.getKeyListener()>
	//*   8   16:instanceof      #312 <Class DialerKeyListener>
	//*   9   19:ifeq            11
		{
			textview.setKeyListener(((KeyListener) (null)));
	//   10   22:aload_0         
	//   11   23:aconst_null     
	//   12   24:invokevirtual   #119 <Method void TextView.setKeyListener(KeyListener)>
			return;
	//   13   27:return          
		}
	}

	public static void setShadowColor(TextView textview, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #166 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          29
		{
			float f = textview.getShadowDx();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #320 <Method float TextView.getShadowDx()>
	//    5   12:fstore_2        
			float f1 = textview.getShadowDy();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #323 <Method float TextView.getShadowDy()>
	//    8   17:fstore_3        
			textview.setShadowLayer(textview.getShadowRadius(), f, f1, i);
	//    9   18:aload_0         
	//   10   19:aload_0         
	//   11   20:invokevirtual   #326 <Method float TextView.getShadowRadius()>
	//   12   23:fload_2         
	//   13   24:fload_3         
	//   14   25:iload_1         
	//   15   26:invokevirtual   #330 <Method void TextView.setShadowLayer(float, float, float, int)>
		}
	//   16   29:return          
	}

	public static void setShadowDx(TextView textview, float f)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #166 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          29
		{
			int i = textview.getShadowColor();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #335 <Method int TextView.getShadowColor()>
	//    5   12:istore_3        
			float f1 = textview.getShadowDy();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #323 <Method float TextView.getShadowDy()>
	//    8   17:fstore_2        
			textview.setShadowLayer(textview.getShadowRadius(), f, f1, i);
	//    9   18:aload_0         
	//   10   19:aload_0         
	//   11   20:invokevirtual   #326 <Method float TextView.getShadowRadius()>
	//   12   23:fload_1         
	//   13   24:fload_2         
	//   14   25:iload_3         
	//   15   26:invokevirtual   #330 <Method void TextView.setShadowLayer(float, float, float, int)>
		}
	//   16   29:return          
	}

	public static void setShadowDy(TextView textview, float f)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #166 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          29
		{
			int i = textview.getShadowColor();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #335 <Method int TextView.getShadowColor()>
	//    5   12:istore_3        
			float f1 = textview.getShadowDx();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #320 <Method float TextView.getShadowDx()>
	//    8   17:fstore_2        
			textview.setShadowLayer(textview.getShadowRadius(), f1, f, i);
	//    9   18:aload_0         
	//   10   19:aload_0         
	//   11   20:invokevirtual   #326 <Method float TextView.getShadowRadius()>
	//   12   23:fload_2         
	//   13   24:fload_1         
	//   14   25:iload_3         
	//   15   26:invokevirtual   #330 <Method void TextView.setShadowLayer(float, float, float, int)>
		}
	//   16   29:return          
	}

	public static void setShadowRadius(TextView textview, float f)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #166 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          27
		{
			int i = textview.getShadowColor();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #335 <Method int TextView.getShadowColor()>
	//    5   12:istore_2        
			textview.setShadowLayer(f, textview.getShadowDx(), textview.getShadowDy(), i);
	//    6   13:aload_0         
	//    7   14:fload_1         
	//    8   15:aload_0         
	//    9   16:invokevirtual   #320 <Method float TextView.getShadowDx()>
	//   10   19:aload_0         
	//   11   20:invokevirtual   #323 <Method float TextView.getShadowDy()>
	//   12   23:iload_2         
	//   13   24:invokevirtual   #330 <Method void TextView.setShadowLayer(float, float, float, int)>
		}
	//   14   27:return          
	}

	public static void setText(TextView textview, CharSequence charsequence)
	{
		CharSequence charsequence1 = textview.getText();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method CharSequence TextView.getText()>
	//    2    4:astore_2        
		if(charsequence != charsequence1 && (charsequence != null || charsequence1.length() != 0)) goto _L2; else goto _L1
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:if_acmpeq       23
	//    6   10:aload_1         
	//    7   11:ifnonnull       24
	//    8   14:aload_2         
	//    9   15:invokeinterface #83  <Method int CharSequence.length()>
	//   10   20:ifne            24
_L1:
		return;
	//   11   23:return          
_L2:
		if(!(charsequence instanceof Spanned)) goto _L4; else goto _L3
	//   12   24:aload_1         
	//   13   25:instanceof      #341 <Class Spanned>
	//   14   28:ifeq            45
_L3:
		if(((Object) (charsequence)).equals(((Object) (charsequence1)))) goto _L1; else goto _L5
	//   15   31:aload_1         
	//   16   32:aload_2         
	//   17   33:invokevirtual   #345 <Method boolean Object.equals(Object)>
	//   18   36:ifne            23
_L5:
		textview.setText(charsequence);
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #348 <Method void TextView.setText(CharSequence)>
		return;
	//   22   44:return          
_L4:
		if(!haveContentsChanged(charsequence, charsequence1))
	//*  23   45:aload_1         
	//*  24   46:aload_2         
	//*  25   47:invokestatic    #350 <Method boolean haveContentsChanged(CharSequence, CharSequence)>
	//*  26   50:ifne            39
			return;
	//   27   53:return          
		if(true) goto _L5; else goto _L6
_L6:
	}

	public static void setTextSize(TextView textview, float f)
	{
		textview.setTextSize(0, f);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:fload_1         
	//    3    3:invokevirtual   #355 <Method void TextView.setTextSize(int, float)>
	//    4    6:return          
	}

	public static void setTextWatcher(TextView textview, BeforeTextChanged beforetextchanged, OnTextChanged ontextchanged, AfterTextChanged aftertextchanged, InverseBindingListener inversebindinglistener)
	{
		if(beforetextchanged == null && aftertextchanged == null && ontextchanged == null && inversebindinglistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       50
	//*   2    4:aload_3         
	//*   3    5:ifnonnull       50
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       50
	//*   6   12:aload           4
	//*   7   14:ifnonnull       50
			beforetextchanged = null;
	//    8   17:aconst_null     
	//    9   18:astore_1        
		else
	//*  10   19:aload_0         
	//*  11   20:aload_1         
	//*  12   21:getstatic       #367 <Field int com.android.databinding.library.baseAdapters.R$id.textWatcher>
	//*  13   24:invokestatic    #373 <Method Object ListenerUtil.trackListener(android.view.View, Object, int)>
	//*  14   27:checkcast       #375 <Class TextWatcher>
	//*  15   30:astore_2        
	//*  16   31:aload_2         
	//*  17   32:ifnull          40
	//*  18   35:aload_0         
	//*  19   36:aload_2         
	//*  20   37:invokevirtual   #379 <Method void TextView.removeTextChangedListener(TextWatcher)>
	//*  21   40:aload_1         
	//*  22   41:ifnull          49
	//*  23   44:aload_0         
	//*  24   45:aload_1         
	//*  25   46:invokevirtual   #382 <Method void TextView.addTextChangedListener(TextWatcher)>
	//*  26   49:return          
			beforetextchanged = ((BeforeTextChanged) (new TextWatcher(beforetextchanged, ontextchanged, inversebindinglistener, aftertextchanged) {

				public void afterTextChanged(Editable editable)
				{
					if(after != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #29  <Field TextViewBindingAdapter$AfterTextChanged val$after>
				//*   2    4:ifnull          17
						after.afterTextChanged(editable);
				//    3    7:aload_0         
				//    4    8:getfield        #29  <Field TextViewBindingAdapter$AfterTextChanged val$after>
				//    5   11:aload_1         
				//    6   12:invokeinterface #39  <Method void TextViewBindingAdapter$AfterTextChanged.afterTextChanged(Editable)>
				//    7   17:return          
				}

				public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
				{
					if(before != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #23  <Field TextViewBindingAdapter$BeforeTextChanged val$before>
				//*   2    4:ifnull          21
						before.beforeTextChanged(charsequence, i, j, k);
				//    3    7:aload_0         
				//    4    8:getfield        #23  <Field TextViewBindingAdapter$BeforeTextChanged val$before>
				//    5   11:aload_1         
				//    6   12:iload_2         
				//    7   13:iload_3         
				//    8   14:iload           4
				//    9   16:invokeinterface #45  <Method void TextViewBindingAdapter$BeforeTextChanged.beforeTextChanged(CharSequence, int, int, int)>
				//   10   21:return          
				}

				public void onTextChanged(CharSequence charsequence, int i, int j, int k)
				{
					if(on != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #25  <Field TextViewBindingAdapter$OnTextChanged val$on>
				//*   2    4:ifnull          21
						on.onTextChanged(charsequence, i, j, k);
				//    3    7:aload_0         
				//    4    8:getfield        #25  <Field TextViewBindingAdapter$OnTextChanged val$on>
				//    5   11:aload_1         
				//    6   12:iload_2         
				//    7   13:iload_3         
				//    8   14:iload           4
				//    9   16:invokeinterface #50  <Method void TextViewBindingAdapter$OnTextChanged.onTextChanged(CharSequence, int, int, int)>
					if(textAttrChanged != null)
				//*  10   21:aload_0         
				//*  11   22:getfield        #27  <Field InverseBindingListener val$textAttrChanged>
				//*  12   25:ifnull          37
						textAttrChanged.onChange();
				//   13   28:aload_0         
				//   14   29:getfield        #27  <Field InverseBindingListener val$textAttrChanged>
				//   15   32:invokeinterface #55  <Method void InverseBindingListener.onChange()>
				//   16   37:return          
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
	//   27   50:new             #6   <Class TextViewBindingAdapter$1>
	//   28   53:dup             
	//   29   54:aload_1         
	//   30   55:aload_2         
	//   31   56:aload           4
	//   32   58:aload_3         
	//   33   59:invokespecial   #385 <Method void TextViewBindingAdapter$1(TextViewBindingAdapter$BeforeTextChanged, TextViewBindingAdapter$OnTextChanged, InverseBindingListener, TextViewBindingAdapter$AfterTextChanged)>
	//   34   62:astore_1        
		ontextchanged = ((OnTextChanged) ((TextWatcher)ListenerUtil.trackListener(((android.view.View) (textview)), ((Object) (beforetextchanged)), com.android.databinding.library.baseAdapters.R.id.textWatcher)));
		if(ontextchanged != null)
			textview.removeTextChangedListener(((TextWatcher) (ontextchanged)));
		if(beforetextchanged != null)
			textview.addTextChangedListener(((TextWatcher) (beforetextchanged)));
	//*  35   63:goto            19
	}

	public static final int DECIMAL = 5;
	public static final int INTEGER = 1;
	public static final int SIGNED = 3;
	private static final String TAG = "TextViewBindingAdapters";
}
