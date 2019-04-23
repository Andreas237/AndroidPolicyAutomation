// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.resources;

import android.graphics.Typeface;
import android.text.TextPaint;

// Referenced classes of package android.support.design.resources:
//			TextAppearance

class TextAppearance$1 extends android.support.v4.content.res.ontCallback
{

	public void onFontRetrievalFailed(int i)
	{
		TextAppearance.access$200(TextAppearance.this);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field TextAppearance this$0>
	//    2    4:invokestatic    #33  <Method void TextAppearance.access$200(TextAppearance)>
		TextAppearance.access$102(TextAppearance.this, true);
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field TextAppearance this$0>
	//    5   11:iconst_1        
	//    6   12:invokestatic    #37  <Method boolean TextAppearance.access$102(TextAppearance, boolean)>
	//    7   15:pop             
		val$callback.onFontRetrievalFailed(i);
	//    8   16:aload_0         
	//    9   17:getfield        #23  <Field android.support.v4.content.res.ResourcesCompat$FontCallback val$callback>
	//   10   20:iload_1         
	//   11   21:invokevirtual   #39  <Method void android.support.v4.content.res.ResourcesCompat$FontCallback.onFontRetrievalFailed(int)>
	//   12   24:return          
	}

	public void onFontRetrieved(Typeface typeface)
	{
		TextAppearance textappearance = TextAppearance.this;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field TextAppearance this$0>
	//    2    4:astore_2        
		TextAppearance.access$002(textappearance, Typeface.create(typeface, textappearance.textStyle));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:getfield        #46  <Field int TextAppearance.textStyle>
	//    7   11:invokestatic    #52  <Method Typeface Typeface.create(Typeface, int)>
	//    8   14:invokestatic    #56  <Method Typeface TextAppearance.access$002(TextAppearance, Typeface)>
	//    9   17:pop             
		updateTextPaintMeasureState(val$textPaint, typeface);
	//   10   18:aload_0         
	//   11   19:getfield        #19  <Field TextAppearance this$0>
	//   12   22:aload_0         
	//   13   23:getfield        #21  <Field TextPaint val$textPaint>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #60  <Method void TextAppearance.updateTextPaintMeasureState(TextPaint, Typeface)>
		TextAppearance.access$102(TextAppearance.this, true);
	//   16   30:aload_0         
	//   17   31:getfield        #19  <Field TextAppearance this$0>
	//   18   34:iconst_1        
	//   19   35:invokestatic    #37  <Method boolean TextAppearance.access$102(TextAppearance, boolean)>
	//   20   38:pop             
		val$callback.onFontRetrieved(typeface);
	//   21   39:aload_0         
	//   22   40:getfield        #23  <Field android.support.v4.content.res.ResourcesCompat$FontCallback val$callback>
	//   23   43:aload_1         
	//   24   44:invokevirtual   #62  <Method void android.support.v4.content.res.ResourcesCompat$FontCallback.onFontRetrieved(Typeface)>
	//   25   47:return          
	}

	final TextAppearance this$0;
	final android.support.v4.content.res.ontCallback val$callback;
	final TextPaint val$textPaint;

	TextAppearance$1()
	{
		this$0 = final_textappearance;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field TextAppearance this$0>
		val$textPaint = textpaint;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field TextPaint val$textPaint>
		val$callback = android.support.v4.content.res.ontCallback.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #23  <Field android.support.v4.content.res.ResourcesCompat$FontCallback val$callback>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #26  <Method void android.support.v4.content.res.ResourcesCompat$FontCallback()>
	//   11   19:return          
	}
}
