// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.Typeface;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.widget:
//			AppCompatTextHelper

class AppCompatTextHelper$1 extends android.support.v4.content.res.llback
{

	public void onFontRetrievalFailed(int i)
	{
	//    0    0:return          
	}

	public void onFontRetrieved(Typeface typeface)
	{
		onAsyncTypefaceReceived(val$textViewWeak, typeface);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AppCompatTextHelper this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field WeakReference val$textViewWeak>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #32  <Method void AppCompatTextHelper.onAsyncTypefaceReceived(WeakReference, Typeface)>
	//    6   12:return          
	}

	final AppCompatTextHelper this$0;
	final WeakReference val$textViewWeak;

	AppCompatTextHelper$1()
	{
		this$0 = final_appcompattexthelper;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AppCompatTextHelper this$0>
		val$textViewWeak = WeakReference.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field WeakReference val$textViewWeak>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void android.support.v4.content.res.ResourcesCompat$FontCallback()>
	//    8   14:return          
	}
}
