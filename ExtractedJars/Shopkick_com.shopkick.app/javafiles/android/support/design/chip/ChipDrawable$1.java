// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.chip;

import android.graphics.Typeface;

// Referenced classes of package android.support.design.chip:
//			ChipDrawable

class ChipDrawable$1 extends android.support.v4.content.res..FontCallback
{

	public void onFontRetrievalFailed(int i)
	{
	//    0    0:return          
	}

	public void onFontRetrieved(Typeface typeface)
	{
		ChipDrawable.access$002(ChipDrawable.this, true);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field ChipDrawable this$0>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #25  <Method boolean ChipDrawable.access$002(ChipDrawable, boolean)>
	//    4    8:pop             
		onSizeChange();
	//    5    9:aload_0         
	//    6   10:getfield        #12  <Field ChipDrawable this$0>
	//    7   13:invokevirtual   #28  <Method void ChipDrawable.onSizeChange()>
		invalidateSelf();
	//    8   16:aload_0         
	//    9   17:getfield        #12  <Field ChipDrawable this$0>
	//   10   20:invokevirtual   #31  <Method void ChipDrawable.invalidateSelf()>
	//   11   23:return          
	}

	final ChipDrawable this$0;

	ChipDrawable$1()
	{
		this$0 = ChipDrawable.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ChipDrawable this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void android.support.v4.content.res.ResourcesCompat$FontCallback()>
	//    5    9:return          
	}
}
