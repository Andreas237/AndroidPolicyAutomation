// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.chip;

import android.graphics.Typeface;

// Referenced classes of package android.support.design.chip:
//			Chip

class Chip$1 extends android.support.v4.content.res.esCompat.FontCallback
{

	public void onFontRetrievalFailed(int i)
	{
	//    0    0:return          
	}

	public void onFontRetrieved(Typeface typeface)
	{
		typeface = ((Typeface) (Chip.this));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field Chip this$0>
	//    2    4:astore_1        
		((Chip) (typeface)).setText(((Chip) (typeface)).getText());
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #25  <Method CharSequence Chip.getText()>
	//    6   10:invokevirtual   #29  <Method void Chip.setText(CharSequence)>
		requestLayout();
	//    7   13:aload_0         
	//    8   14:getfield        #12  <Field Chip this$0>
	//    9   17:invokevirtual   #32  <Method void Chip.requestLayout()>
		invalidate();
	//   10   20:aload_0         
	//   11   21:getfield        #12  <Field Chip this$0>
	//   12   24:invokevirtual   #35  <Method void Chip.invalidate()>
	//   13   27:return          
	}

	final Chip this$0;

	Chip$1()
	{
		this$0 = Chip.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field Chip this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void android.support.v4.content.res.ResourcesCompat$FontCallback()>
	//    5    9:return          
	}
}
