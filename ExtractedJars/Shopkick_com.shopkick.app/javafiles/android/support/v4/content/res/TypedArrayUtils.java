// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package android.support.v4.content.res:
//			ComplexColorCompat

public class TypedArrayUtils
{

	private TypedArrayUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public static int getAttr(Context context, int i, int j)
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #22  <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void TypedValue()>
	//    3    7:astore_3        
		context.getTheme().resolveAttribute(i, typedvalue, true);
	//    4    8:aload_0         
	//    5    9:invokevirtual   #29  <Method android.content.res.Resources$Theme Context.getTheme()>
	//    6   12:iload_1         
	//    7   13:aload_3         
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #35  <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   10   18:pop             
		if(typedvalue.resourceId != 0)
	//*  11   19:aload_3         
	//*  12   20:getfield        #39  <Field int TypedValue.resourceId>
	//*  13   23:ifeq            28
			return i;
	//   14   26:iload_1         
	//   15   27:ireturn         
		else
			return j;
	//   16   28:iload_2         
	//   17   29:ireturn         
	}

	public static boolean getBoolean(TypedArray typedarray, int i, int j, boolean flag)
	{
		return typedarray.getBoolean(i, typedarray.getBoolean(j, flag));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:iload_2         
	//    4    4:iload_3         
	//    5    5:invokevirtual   #48  <Method boolean TypedArray.getBoolean(int, boolean)>
	//    6    8:invokevirtual   #48  <Method boolean TypedArray.getBoolean(int, boolean)>
	//    7   11:ireturn         
	}

	public static Drawable getDrawable(TypedArray typedarray, int i, int j)
	{
		Drawable drawable1 = typedarray.getDrawable(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #54  <Method Drawable TypedArray.getDrawable(int)>
	//    3    5:astore          4
		Drawable drawable = drawable1;
	//    4    7:aload           4
	//    5    9:astore_3        
		if(drawable1 == null)
	//*   6   10:aload           4
	//*   7   12:ifnonnull       21
			drawable = typedarray.getDrawable(j);
	//    8   15:aload_0         
	//    9   16:iload_2         
	//   10   17:invokevirtual   #54  <Method Drawable TypedArray.getDrawable(int)>
	//   11   20:astore_3        
		return drawable;
	//   12   21:aload_3         
	//   13   22:areturn         
	}

	public static int getInt(TypedArray typedarray, int i, int j, int k)
	{
		return typedarray.getInt(i, typedarray.getInt(j, k));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:iload_2         
	//    4    4:iload_3         
	//    5    5:invokevirtual   #60  <Method int TypedArray.getInt(int, int)>
	//    6    8:invokevirtual   #60  <Method int TypedArray.getInt(int, int)>
	//    7   11:ireturn         
	}

	public static boolean getNamedBoolean(TypedArray typedarray, XmlPullParser xmlpullparser, String s, int i, boolean flag)
	{
		if(!hasAttribute(xmlpullparser, s))
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:invokestatic    #66  <Method boolean hasAttribute(XmlPullParser, String)>
	//*   3    5:ifne            11
			return flag;
	//    4    8:iload           4
	//    5   10:ireturn         
		else
			return typedarray.getBoolean(i, flag);
	//    6   11:aload_0         
	//    7   12:iload_3         
	//    8   13:iload           4
	//    9   15:invokevirtual   #48  <Method boolean TypedArray.getBoolean(int, boolean)>
	//   10   18:ireturn         
	}

	public static int getNamedColor(TypedArray typedarray, XmlPullParser xmlpullparser, String s, int i, int j)
	{
		if(!hasAttribute(xmlpullparser, s))
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:invokestatic    #66  <Method boolean hasAttribute(XmlPullParser, String)>
	//*   3    5:ifne            11
			return j;
	//    4    8:iload           4
	//    5   10:ireturn         
		else
			return typedarray.getColor(i, j);
	//    6   11:aload_0         
	//    7   12:iload_3         
	//    8   13:iload           4
	//    9   15:invokevirtual   #72  <Method int TypedArray.getColor(int, int)>
	//   10   18:ireturn         
	}

	public static ComplexColorCompat getNamedComplexColor(TypedArray typedarray, XmlPullParser xmlpullparser, android.content.res.Resources.Theme theme, String s, int i, int j)
	{
		if(hasAttribute(xmlpullparser, s))
	//*   0    0:aload_1         
	//*   1    1:aload_3         
	//*   2    2:invokestatic    #66  <Method boolean hasAttribute(XmlPullParser, String)>
	//*   3    5:ifeq            72
		{
			xmlpullparser = ((XmlPullParser) (new TypedValue()));
	//    4    8:new             #22  <Class TypedValue>
	//    5   11:dup             
	//    6   12:invokespecial   #23  <Method void TypedValue()>
	//    7   15:astore_1        
			typedarray.getValue(i, ((TypedValue) (xmlpullparser)));
	//    8   16:aload_0         
	//    9   17:iload           4
	//   10   19:aload_1         
	//   11   20:invokevirtual   #78  <Method boolean TypedArray.getValue(int, TypedValue)>
	//   12   23:pop             
			if(((TypedValue) (xmlpullparser)).type >= 28 && ((TypedValue) (xmlpullparser)).type <= 31)
	//*  13   24:aload_1         
	//*  14   25:getfield        #81  <Field int TypedValue.type>
	//*  15   28:bipush          28
	//*  16   30:icmplt          50
	//*  17   33:aload_1         
	//*  18   34:getfield        #81  <Field int TypedValue.type>
	//*  19   37:bipush          31
	//*  20   39:icmpgt          50
				return ComplexColorCompat.from(((TypedValue) (xmlpullparser)).data);
	//   21   42:aload_1         
	//   22   43:getfield        #84  <Field int TypedValue.data>
	//   23   46:invokestatic    #90  <Method ComplexColorCompat ComplexColorCompat.from(int)>
	//   24   49:areturn         
			typedarray = ((TypedArray) (ComplexColorCompat.inflate(typedarray.getResources(), typedarray.getResourceId(i, 0), theme)));
	//   25   50:aload_0         
	//   26   51:invokevirtual   #94  <Method Resources TypedArray.getResources()>
	//   27   54:aload_0         
	//   28   55:iload           4
	//   29   57:iconst_0        
	//   30   58:invokevirtual   #97  <Method int TypedArray.getResourceId(int, int)>
	//   31   61:aload_2         
	//   32   62:invokestatic    #101 <Method ComplexColorCompat ComplexColorCompat.inflate(Resources, int, android.content.res.Resources$Theme)>
	//   33   65:astore_0        
			if(typedarray != null)
	//*  34   66:aload_0         
	//*  35   67:ifnull          72
				return ((ComplexColorCompat) (typedarray));
	//   36   70:aload_0         
	//   37   71:areturn         
		}
		return ComplexColorCompat.from(j);
	//   38   72:iload           5
	//   39   74:invokestatic    #90  <Method ComplexColorCompat ComplexColorCompat.from(int)>
	//   40   77:areturn         
	}

	public static float getNamedFloat(TypedArray typedarray, XmlPullParser xmlpullparser, String s, int i, float f)
	{
		if(!hasAttribute(xmlpullparser, s))
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:invokestatic    #66  <Method boolean hasAttribute(XmlPullParser, String)>
	//*   3    5:ifne            11
			return f;
	//    4    8:fload           4
	//    5   10:freturn         
		else
			return typedarray.getFloat(i, f);
	//    6   11:aload_0         
	//    7   12:iload_3         
	//    8   13:fload           4
	//    9   15:invokevirtual   #107 <Method float TypedArray.getFloat(int, float)>
	//   10   18:freturn         
	}

	public static int getNamedInt(TypedArray typedarray, XmlPullParser xmlpullparser, String s, int i, int j)
	{
		if(!hasAttribute(xmlpullparser, s))
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:invokestatic    #66  <Method boolean hasAttribute(XmlPullParser, String)>
	//*   3    5:ifne            11
			return j;
	//    4    8:iload           4
	//    5   10:ireturn         
		else
			return typedarray.getInt(i, j);
	//    6   11:aload_0         
	//    7   12:iload_3         
	//    8   13:iload           4
	//    9   15:invokevirtual   #60  <Method int TypedArray.getInt(int, int)>
	//   10   18:ireturn         
	}

	public static int getNamedResourceId(TypedArray typedarray, XmlPullParser xmlpullparser, String s, int i, int j)
	{
		if(!hasAttribute(xmlpullparser, s))
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:invokestatic    #66  <Method boolean hasAttribute(XmlPullParser, String)>
	//*   3    5:ifne            11
			return j;
	//    4    8:iload           4
	//    5   10:ireturn         
		else
			return typedarray.getResourceId(i, j);
	//    6   11:aload_0         
	//    7   12:iload_3         
	//    8   13:iload           4
	//    9   15:invokevirtual   #97  <Method int TypedArray.getResourceId(int, int)>
	//   10   18:ireturn         
	}

	public static String getNamedString(TypedArray typedarray, XmlPullParser xmlpullparser, String s, int i)
	{
		if(!hasAttribute(xmlpullparser, s))
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:invokestatic    #66  <Method boolean hasAttribute(XmlPullParser, String)>
	//*   3    5:ifne            10
			return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
		else
			return typedarray.getString(i);
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:invokevirtual   #116 <Method String TypedArray.getString(int)>
	//    9   15:areturn         
	}

	public static int getResourceId(TypedArray typedarray, int i, int j, int k)
	{
		return typedarray.getResourceId(i, typedarray.getResourceId(j, k));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:iload_2         
	//    4    4:iload_3         
	//    5    5:invokevirtual   #97  <Method int TypedArray.getResourceId(int, int)>
	//    6    8:invokevirtual   #97  <Method int TypedArray.getResourceId(int, int)>
	//    7   11:ireturn         
	}

	public static String getString(TypedArray typedarray, int i, int j)
	{
		String s1 = typedarray.getString(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #116 <Method String TypedArray.getString(int)>
	//    3    5:astore          4
		String s = s1;
	//    4    7:aload           4
	//    5    9:astore_3        
		if(s1 == null)
	//*   6   10:aload           4
	//*   7   12:ifnonnull       21
			s = typedarray.getString(j);
	//    8   15:aload_0         
	//    9   16:iload_2         
	//   10   17:invokevirtual   #116 <Method String TypedArray.getString(int)>
	//   11   20:astore_3        
		return s;
	//   12   21:aload_3         
	//   13   22:areturn         
	}

	public static CharSequence getText(TypedArray typedarray, int i, int j)
	{
		CharSequence charsequence1 = typedarray.getText(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #122 <Method CharSequence TypedArray.getText(int)>
	//    3    5:astore          4
		CharSequence charsequence = charsequence1;
	//    4    7:aload           4
	//    5    9:astore_3        
		if(charsequence1 == null)
	//*   6   10:aload           4
	//*   7   12:ifnonnull       21
			charsequence = typedarray.getText(j);
	//    8   15:aload_0         
	//    9   16:iload_2         
	//   10   17:invokevirtual   #122 <Method CharSequence TypedArray.getText(int)>
	//   11   20:astore_3        
		return charsequence;
	//   12   21:aload_3         
	//   13   22:areturn         
	}

	public static CharSequence[] getTextArray(TypedArray typedarray, int i, int j)
	{
		CharSequence acharsequence1[] = typedarray.getTextArray(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #127 <Method CharSequence[] TypedArray.getTextArray(int)>
	//    3    5:astore          4
		CharSequence acharsequence[] = acharsequence1;
	//    4    7:aload           4
	//    5    9:astore_3        
		if(acharsequence1 == null)
	//*   6   10:aload           4
	//*   7   12:ifnonnull       21
			acharsequence = typedarray.getTextArray(j);
	//    8   15:aload_0         
	//    9   16:iload_2         
	//   10   17:invokevirtual   #127 <Method CharSequence[] TypedArray.getTextArray(int)>
	//   11   20:astore_3        
		return acharsequence;
	//   12   21:aload_3         
	//   13   22:areturn         
	}

	public static boolean hasAttribute(XmlPullParser xmlpullparser, String s)
	{
		return xmlpullparser.getAttributeValue("http://schemas.android.com/apk/res/android", s) != null;
	//    0    0:aload_0         
	//    1    1:ldc1            #12  <String "http://schemas.android.com/apk/res/android">
	//    2    3:aload_1         
	//    3    4:invokeinterface #133 <Method String XmlPullParser.getAttributeValue(String, String)>
	//    4    9:ifnull          14
	//    5   12:iconst_1        
	//    6   13:ireturn         
	//    7   14:iconst_0        
	//    8   15:ireturn         
	}

	public static TypedArray obtainAttributes(Resources resources, android.content.res.Resources.Theme theme, AttributeSet attributeset, int ai[])
	{
		if(theme == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       11
			return resources.obtainAttributes(attributeset, ai);
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #140 <Method TypedArray Resources.obtainAttributes(AttributeSet, int[])>
	//    6   10:areturn         
		else
			return theme.obtainStyledAttributes(attributeset, ai, 0, 0);
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:aload_3         
	//   10   14:iconst_0        
	//   11   15:iconst_0        
	//   12   16:invokevirtual   #144 <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   13   19:areturn         
	}

	public static TypedValue peekNamedValue(TypedArray typedarray, XmlPullParser xmlpullparser, String s, int i)
	{
		if(!hasAttribute(xmlpullparser, s))
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:invokestatic    #66  <Method boolean hasAttribute(XmlPullParser, String)>
	//*   3    5:ifne            10
			return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
		else
			return typedarray.peekValue(i);
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:invokevirtual   #150 <Method TypedValue TypedArray.peekValue(int)>
	//    9   15:areturn         
	}

	private static final String NAMESPACE = "http://schemas.android.com/apk/res/android";
}
