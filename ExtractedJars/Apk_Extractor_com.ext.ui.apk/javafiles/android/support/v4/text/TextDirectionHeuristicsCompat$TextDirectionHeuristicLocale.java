// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.text;

import java.util.Locale;

// Referenced classes of package android.support.v4.text:
//			TextDirectionHeuristicsCompat, TextUtilsCompat

private static class TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale extends TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
{

	protected boolean defaultIsRtl()
	{
		return TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
	//    0    0:invokestatic    #28  <Method Locale Locale.getDefault()>
	//    1    3:invokestatic    #34  <Method int TextUtilsCompat.getLayoutDirectionFromLocale(Locale)>
	//    2    6:iconst_1        
	//    3    7:icmpne          12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public static final TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale INSTANCE = new TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale();

	static 
	{
	//    0    0:new             #2   <Class TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale()>
	//    3    7:putstatic       #16  <Field TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale INSTANCE>
	//*   4   10:return          
	}

	public TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale()
	{
		super(((TextDirectionHeuristicsCompat.TextDirectionAlgorithm) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #20  <Method void TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl(TextDirectionHeuristicsCompat$TextDirectionAlgorithm)>
	//    3    5:return          
	}
}
