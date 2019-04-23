// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.text;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

// Referenced classes of package android.support.v4.text:
//			PrecomputedTextCompat

private static class PrecomputedTextCompat$PrecomputedTextFutureTask extends FutureTask
{
	private static class PrecomputedTextCallback
		implements Callable
	{

		public PrecomputedTextCompat call()
			throws Exception
		{
			return PrecomputedTextCompat.create(mText, mParams);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field CharSequence mText>
		//    2    4:aload_0         
		//    3    5:getfield        #25  <Field PrecomputedTextCompat$Params mParams>
		//    4    8:invokestatic    #37  <Method PrecomputedTextCompat PrecomputedTextCompat.create(CharSequence, PrecomputedTextCompat$Params)>
		//    5   11:areturn         
		}

		public volatile Object call()
			throws Exception
		{
			return ((Object) (call()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #41  <Method PrecomputedTextCompat call()>
		//    2    4:areturn         
		}

		private PrecomputedTextCompat.Params mParams;
		private CharSequence mText;

		PrecomputedTextCallback(PrecomputedTextCompat.Params params, CharSequence charsequence)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			mParams = params;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #25  <Field PrecomputedTextCompat$Params mParams>
			mText = charsequence;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #27  <Field CharSequence mText>
		//    8   14:return          
		}
	}


	PrecomputedTextCompat$PrecomputedTextFutureTask(PrecomputedTextCompat.Params params, CharSequence charsequence)
	{
		super(((Callable) (new PrecomputedTextCallback(params, charsequence))));
	//    0    0:aload_0         
	//    1    1:new             #10  <Class PrecomputedTextCompat$PrecomputedTextFutureTask$PrecomputedTextCallback>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #16  <Method void PrecomputedTextCompat$PrecomputedTextFutureTask$PrecomputedTextCallback(PrecomputedTextCompat$Params, CharSequence)>
	//    6   10:invokespecial   #19  <Method void FutureTask(Callable)>
	//    7   13:return          
	}
}
