// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.provider:
//			FontsContractCompat

static final class FontsContractCompat$2
	implements ReplyCallback
{

	public void onReply(Typeface typeface)
	{
		if((TextView)val$textViewWeak.get() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field WeakReference val$textViewWeak>
	//*   2    4:invokevirtual   #38  <Method Object WeakReference.get()>
	//*   3    7:checkcast       #40  <Class TextView>
	//*   4   10:ifnull          25
			val$targetView.setTypeface(typeface, val$style);
	//    5   13:aload_0         
	//    6   14:getfield        #24  <Field TextView val$targetView>
	//    7   17:aload_1         
	//    8   18:aload_0         
	//    9   19:getfield        #26  <Field int val$style>
	//   10   22:invokevirtual   #44  <Method void TextView.setTypeface(Typeface, int)>
	//   11   25:return          
	}

	public volatile void onReply(Object obj)
	{
		onReply((Typeface)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #47  <Class Typeface>
	//    3    5:invokevirtual   #49  <Method void onReply(Typeface)>
	//    4    8:return          
	}

	final int val$style;
	final TextView val$targetView;
	final WeakReference val$textViewWeak;

	FontsContractCompat$2(WeakReference weakreference, TextView textview, int i)
	{
		val$textViewWeak = weakreference;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field WeakReference val$textViewWeak>
		val$targetView = textview;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field TextView val$targetView>
		val$style = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #26  <Field int val$style>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #29  <Method void Object()>
	//   11   19:return          
	}
}
