// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.text;

import android.text.Html;
import android.text.Spanned;

public final class HtmlCompat
{

	private HtmlCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:return          
	}

	public static Spanned fromHtml(String s, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #41  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          14
			return Html.fromHtml(s, i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokestatic    #45  <Method Spanned Html.fromHtml(String, int)>
	//    6   13:areturn         
		else
			return Html.fromHtml(s);
	//    7   14:aload_0         
	//    8   15:invokestatic    #48  <Method Spanned Html.fromHtml(String)>
	//    9   18:areturn         
	}

	public static Spanned fromHtml(String s, int i, android.text.Html.ImageGetter imagegetter, android.text.Html.TagHandler taghandler)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #41  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          16
			return Html.fromHtml(s, i, imagegetter, taghandler);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:aload_2         
	//    6   11:aload_3         
	//    7   12:invokestatic    #54  <Method Spanned Html.fromHtml(String, int, android.text.Html$ImageGetter, android.text.Html$TagHandler)>
	//    8   15:areturn         
		else
			return Html.fromHtml(s, imagegetter, taghandler);
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:aload_3         
	//   12   19:invokestatic    #57  <Method Spanned Html.fromHtml(String, android.text.Html$ImageGetter, android.text.Html$TagHandler)>
	//   13   22:areturn         
	}

	public static String toHtml(Spanned spanned, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #41  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          14
			return Html.toHtml(spanned, i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokestatic    #61  <Method String Html.toHtml(Spanned, int)>
	//    6   13:areturn         
		else
			return Html.toHtml(spanned);
	//    7   14:aload_0         
	//    8   15:invokestatic    #64  <Method String Html.toHtml(Spanned)>
	//    9   18:areturn         
	}

	public static final int FROM_HTML_MODE_COMPACT = 63;
	public static final int FROM_HTML_MODE_LEGACY = 0;
	public static final int FROM_HTML_OPTION_USE_CSS_COLORS = 256;
	public static final int FROM_HTML_SEPARATOR_LINE_BREAK_BLOCKQUOTE = 32;
	public static final int FROM_HTML_SEPARATOR_LINE_BREAK_DIV = 16;
	public static final int FROM_HTML_SEPARATOR_LINE_BREAK_HEADING = 2;
	public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST = 8;
	public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST_ITEM = 4;
	public static final int FROM_HTML_SEPARATOR_LINE_BREAK_PARAGRAPH = 1;
	public static final int TO_HTML_PARAGRAPH_LINES_CONSECUTIVE = 0;
	public static final int TO_HTML_PARAGRAPH_LINES_INDIVIDUAL = 1;
}
